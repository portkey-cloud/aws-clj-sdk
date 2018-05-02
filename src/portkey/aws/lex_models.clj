(ns portkey.aws.lex-models (:require [portkey.aws]))

(def endpoints 'nil)

(clojure.spec.alpha/def :portkey.aws.lex-models.bot-metadata/name (clojure.spec.alpha/and :portkey.aws.lex-models/bot-name))
(clojure.spec.alpha/def :portkey.aws.lex-models.bot-metadata/description (clojure.spec.alpha/and :portkey.aws.lex-models/description))
(clojure.spec.alpha/def :portkey.aws.lex-models.bot-metadata/status (clojure.spec.alpha/and :portkey.aws.lex-models/status))
(clojure.spec.alpha/def :portkey.aws.lex-models.bot-metadata/last-updated-date (clojure.spec.alpha/and :portkey.aws.lex-models/timestamp))
(clojure.spec.alpha/def :portkey.aws.lex-models.bot-metadata/created-date (clojure.spec.alpha/and :portkey.aws.lex-models/timestamp))
(clojure.spec.alpha/def :portkey.aws.lex-models.bot-metadata/version (clojure.spec.alpha/and :portkey.aws.lex-models/version))
(clojure.spec.alpha/def :portkey.aws.lex-models/bot-metadata (portkey.aws/json-keys :req-un [] :opt-un [:portkey.aws.lex-models.bot-metadata/name :portkey.aws.lex-models.bot-metadata/description :portkey.aws.lex-models.bot-metadata/status :portkey.aws.lex-models.bot-metadata/lastUpdatedDate :portkey.aws.lex-models.bot-metadata/createdDate :portkey.aws.lex-models.bot-metadata/version] :locations {}))

(clojure.spec.alpha/def :portkey.aws.lex-models/merge-strategy (clojure.spec.alpha/conformer (clojure.core/let [m__30630__auto__ {"OVERWRITE_LATEST" "OVERWRITE_LATEST", :overwrite-latest "OVERWRITE_LATEST", "FAIL_ON_CONFLICT" "FAIL_ON_CONFLICT", :fail-on-conflict "FAIL_ON_CONFLICT"}] (clojure.core/fn [s__30631__auto__] (m__30630__auto__ s__30631__auto__ :clojure.spec.alpha/invalid))) (clojure.core/comp clojure.core/keyword portkey.aws/dashed)))

(clojure.spec.alpha/def :portkey.aws.lex-models.get-bots-response/bots (clojure.spec.alpha/and :portkey.aws.lex-models/bot-metadata-list))
(clojure.spec.alpha/def :portkey.aws.lex-models.get-bots-response/next-token (clojure.spec.alpha/and :portkey.aws.lex-models/next-token))
(clojure.spec.alpha/def :portkey.aws.lex-models/get-bots-response (portkey.aws/json-keys :req-un [] :opt-un [:portkey.aws.lex-models.get-bots-response/bots :portkey.aws.lex-models.get-bots-response/nextToken] :locations {}))

(clojure.spec.alpha/def :portkey.aws.lex-models/slot-list (clojure.spec.alpha/and (clojure.spec.alpha/coll-of :portkey.aws.lex-models/slot :min-count 0 :max-count 100) (clojure.spec.alpha/conformer clojure.core/identity (fn* [p1__30551__30552__auto__] (if (clojure.core/sequential? p1__30551__30552__auto__) p1__30551__30552__auto__ [p1__30551__30552__auto__])))))

(clojure.spec.alpha/def :portkey.aws.lex-models.bot-alias-metadata/name (clojure.spec.alpha/and :portkey.aws.lex-models/alias-name))
(clojure.spec.alpha/def :portkey.aws.lex-models.bot-alias-metadata/description (clojure.spec.alpha/and :portkey.aws.lex-models/description))
(clojure.spec.alpha/def :portkey.aws.lex-models.bot-alias-metadata/bot-version (clojure.spec.alpha/and :portkey.aws.lex-models/version))
(clojure.spec.alpha/def :portkey.aws.lex-models.bot-alias-metadata/bot-name (clojure.spec.alpha/and :portkey.aws.lex-models/bot-name))
(clojure.spec.alpha/def :portkey.aws.lex-models.bot-alias-metadata/last-updated-date (clojure.spec.alpha/and :portkey.aws.lex-models/timestamp))
(clojure.spec.alpha/def :portkey.aws.lex-models.bot-alias-metadata/created-date (clojure.spec.alpha/and :portkey.aws.lex-models/timestamp))
(clojure.spec.alpha/def :portkey.aws.lex-models.bot-alias-metadata/checksum (clojure.spec.alpha/and :portkey.aws.lex-models/string))
(clojure.spec.alpha/def :portkey.aws.lex-models/bot-alias-metadata (portkey.aws/json-keys :req-un [] :opt-un [:portkey.aws.lex-models.bot-alias-metadata/name :portkey.aws.lex-models.bot-alias-metadata/description :portkey.aws.lex-models.bot-alias-metadata/botVersion :portkey.aws.lex-models.bot-alias-metadata/botName :portkey.aws.lex-models.bot-alias-metadata/lastUpdatedDate :portkey.aws.lex-models.bot-alias-metadata/createdDate :portkey.aws.lex-models.bot-alias-metadata/checksum] :locations {}))

(clojure.spec.alpha/def :portkey.aws.lex-models.put-bot-alias-request/name (clojure.spec.alpha/and :portkey.aws.lex-models/alias-name))
(clojure.spec.alpha/def :portkey.aws.lex-models.put-bot-alias-request/description (clojure.spec.alpha/and :portkey.aws.lex-models/description))
(clojure.spec.alpha/def :portkey.aws.lex-models.put-bot-alias-request/bot-version (clojure.spec.alpha/and :portkey.aws.lex-models/version))
(clojure.spec.alpha/def :portkey.aws.lex-models.put-bot-alias-request/bot-name (clojure.spec.alpha/and :portkey.aws.lex-models/bot-name))
(clojure.spec.alpha/def :portkey.aws.lex-models.put-bot-alias-request/checksum (clojure.spec.alpha/and :portkey.aws.lex-models/string))
(clojure.spec.alpha/def :portkey.aws.lex-models/put-bot-alias-request (portkey.aws/json-keys :req-un [:portkey.aws.lex-models.put-bot-alias-request/name :portkey.aws.lex-models.put-bot-alias-request/botVersion :portkey.aws.lex-models.put-bot-alias-request/botName] :opt-un [:portkey.aws.lex-models.put-bot-alias-request/description :portkey.aws.lex-models.put-bot-alias-request/checksum] :locations {}))

(clojure.spec.alpha/def :portkey.aws.lex-models/string-list (clojure.spec.alpha/and (clojure.spec.alpha/coll-of :portkey.aws.lex-models/string) (clojure.spec.alpha/conformer clojure.core/identity (fn* [p1__30551__30552__auto__] (if (clojure.core/sequential? p1__30551__30552__auto__) p1__30551__30552__auto__ [p1__30551__30552__auto__])))))

(clojure.spec.alpha/def :portkey.aws.lex-models/locale-list (clojure.spec.alpha/and (clojure.spec.alpha/coll-of :portkey.aws.lex-models/locale) (clojure.spec.alpha/conformer clojure.core/identity (fn* [p1__30551__30552__auto__] (if (clojure.core/sequential? p1__30551__30552__auto__) p1__30551__30552__auto__ [p1__30551__30552__auto__])))))

(clojure.spec.alpha/def :portkey.aws.lex-models.delete-slot-type-request/name (clojure.spec.alpha/and :portkey.aws.lex-models/slot-type-name))
(clojure.spec.alpha/def :portkey.aws.lex-models/delete-slot-type-request (portkey.aws/json-keys :req-un [:portkey.aws.lex-models.delete-slot-type-request/name] :opt-un [] :locations {}))

(clojure.spec.alpha/def :portkey.aws.lex-models/builtin-intent-metadata-list (clojure.spec.alpha/and (clojure.spec.alpha/coll-of :portkey.aws.lex-models/builtin-intent-metadata) (clojure.spec.alpha/conformer clojure.core/identity (fn* [p1__30551__30552__auto__] (if (clojure.core/sequential? p1__30551__30552__auto__) p1__30551__30552__auto__ [p1__30551__30552__auto__])))))

(clojure.spec.alpha/def :portkey.aws.lex-models.resource-reference/name (clojure.spec.alpha/and :portkey.aws.lex-models/name))
(clojure.spec.alpha/def :portkey.aws.lex-models.resource-reference/version (clojure.spec.alpha/and :portkey.aws.lex-models/version))
(clojure.spec.alpha/def :portkey.aws.lex-models/resource-reference (portkey.aws/json-keys :req-un [] :opt-un [:portkey.aws.lex-models.resource-reference/name :portkey.aws.lex-models.resource-reference/version] :locations {}))

(clojure.spec.alpha/def :portkey.aws.lex-models/lambdaarn (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__30632__auto__] (clojure.core/<= 20 (clojure.core/count s__30632__auto__))) (clojure.core/fn [s__30633__auto__] (clojure.core/< (clojure.core/count s__30633__auto__) 2048)) (clojure.core/fn [s__30634__auto__] (clojure.core/re-matches #"arn:aws:lambda:[a-z]+-[a-z]+-[0-9]:[0-9]{12}:function:[a-zA-Z0-9-_]+(/[0-9a-f]{8}-[0-9a-f]{4}-[0-9a-f]{4}-[0-9a-f]{4}-[0-9a-f]{12})?(:[a-zA-Z0-9-_]+)?" s__30634__auto__))))

(clojure.spec.alpha/def :portkey.aws.lex-models.get-bot-aliases-response/bot-aliases (clojure.spec.alpha/and :portkey.aws.lex-models/bot-alias-metadata-list))
(clojure.spec.alpha/def :portkey.aws.lex-models.get-bot-aliases-response/next-token (clojure.spec.alpha/and :portkey.aws.lex-models/next-token))
(clojure.spec.alpha/def :portkey.aws.lex-models/get-bot-aliases-response (portkey.aws/json-keys :req-un [] :opt-un [:portkey.aws.lex-models.get-bot-aliases-response/BotAliases :portkey.aws.lex-models.get-bot-aliases-response/nextToken] :locations {}))

(clojure.spec.alpha/def :portkey.aws.lex-models.get-export-response/name (clojure.spec.alpha/and :portkey.aws.lex-models/name))
(clojure.spec.alpha/def :portkey.aws.lex-models.get-export-response/version (clojure.spec.alpha/and :portkey.aws.lex-models/numerical-version))
(clojure.spec.alpha/def :portkey.aws.lex-models.get-export-response/resource-type (clojure.spec.alpha/and :portkey.aws.lex-models/resource-type))
(clojure.spec.alpha/def :portkey.aws.lex-models.get-export-response/export-type (clojure.spec.alpha/and :portkey.aws.lex-models/export-type))
(clojure.spec.alpha/def :portkey.aws.lex-models.get-export-response/export-status (clojure.spec.alpha/and :portkey.aws.lex-models/export-status))
(clojure.spec.alpha/def :portkey.aws.lex-models.get-export-response/failure-reason (clojure.spec.alpha/and :portkey.aws.lex-models/string))
(clojure.spec.alpha/def :portkey.aws.lex-models.get-export-response/url (clojure.spec.alpha/and :portkey.aws.lex-models/string))
(clojure.spec.alpha/def :portkey.aws.lex-models/get-export-response (portkey.aws/json-keys :req-un [] :opt-un [:portkey.aws.lex-models.get-export-response/name :portkey.aws.lex-models.get-export-response/version :portkey.aws.lex-models.get-export-response/resourceType :portkey.aws.lex-models.get-export-response/exportType :portkey.aws.lex-models.get-export-response/exportStatus :portkey.aws.lex-models.get-export-response/failureReason :portkey.aws.lex-models.get-export-response/url] :locations {}))

(clojure.spec.alpha/def :portkey.aws.lex-models.prompt/messages (clojure.spec.alpha/and :portkey.aws.lex-models/message-list))
(clojure.spec.alpha/def :portkey.aws.lex-models.prompt/max-attempts (clojure.spec.alpha/and :portkey.aws.lex-models/prompt-max-attempts))
(clojure.spec.alpha/def :portkey.aws.lex-models.prompt/response-card (clojure.spec.alpha/and :portkey.aws.lex-models/response-card))
(clojure.spec.alpha/def :portkey.aws.lex-models/prompt (portkey.aws/json-keys :req-un [:portkey.aws.lex-models.prompt/messages :portkey.aws.lex-models.prompt/maxAttempts] :opt-un [:portkey.aws.lex-models.prompt/responseCard] :locations {}))

(clojure.spec.alpha/def :portkey.aws.lex-models.put-bot-response/intents (clojure.spec.alpha/and :portkey.aws.lex-models/intent-list))
(clojure.spec.alpha/def :portkey.aws.lex-models.put-bot-response/created-date (clojure.spec.alpha/and :portkey.aws.lex-models/timestamp))
(clojure.spec.alpha/def :portkey.aws.lex-models.put-bot-response/idle-sessionttlin-seconds (clojure.spec.alpha/and :portkey.aws.lex-models/sessionttl))
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
(clojure.spec.alpha/def :portkey.aws.lex-models/put-bot-response (portkey.aws/json-keys :req-un [] :opt-un [:portkey.aws.lex-models.put-bot-response/intents :portkey.aws.lex-models.put-bot-response/createdDate :portkey.aws.lex-models.put-bot-response/idleSessionTTLInSeconds :portkey.aws.lex-models.put-bot-response/clarificationPrompt :portkey.aws.lex-models.put-bot-response/name :portkey.aws.lex-models.put-bot-response/locale :portkey.aws.lex-models.put-bot-response/lastUpdatedDate :portkey.aws.lex-models.put-bot-response/status :portkey.aws.lex-models.put-bot-response/createVersion :portkey.aws.lex-models.put-bot-response/abortStatement :portkey.aws.lex-models.put-bot-response/version :portkey.aws.lex-models.put-bot-response/failureReason :portkey.aws.lex-models.put-bot-response/childDirected :portkey.aws.lex-models.put-bot-response/checksum :portkey.aws.lex-models.put-bot-response/voiceId :portkey.aws.lex-models.put-bot-response/description] :locations {}))

(clojure.spec.alpha/def :portkey.aws.lex-models/import-status (clojure.spec.alpha/conformer (clojure.core/let [m__30630__auto__ {"IN_PROGRESS" "IN_PROGRESS", :in-progress "IN_PROGRESS", "COMPLETE" "COMPLETE", :complete "COMPLETE", "FAILED" "FAILED", :failed "FAILED"}] (clojure.core/fn [s__30631__auto__] (m__30630__auto__ s__30631__auto__ :clojure.spec.alpha/invalid))) (clojure.core/comp clojure.core/keyword portkey.aws/dashed)))

(clojure.spec.alpha/def :portkey.aws.lex-models.get-bot-channel-association-response/bot-alias (clojure.spec.alpha/and :portkey.aws.lex-models/alias-name))
(clojure.spec.alpha/def :portkey.aws.lex-models.get-bot-channel-association-response/created-date (clojure.spec.alpha/and :portkey.aws.lex-models/timestamp))
(clojure.spec.alpha/def :portkey.aws.lex-models.get-bot-channel-association-response/name (clojure.spec.alpha/and :portkey.aws.lex-models/bot-channel-name))
(clojure.spec.alpha/def :portkey.aws.lex-models.get-bot-channel-association-response/status (clojure.spec.alpha/and :portkey.aws.lex-models/channel-status))
(clojure.spec.alpha/def :portkey.aws.lex-models.get-bot-channel-association-response/bot-configuration (clojure.spec.alpha/and :portkey.aws.lex-models/channel-configuration-map))
(clojure.spec.alpha/def :portkey.aws.lex-models.get-bot-channel-association-response/bot-name (clojure.spec.alpha/and :portkey.aws.lex-models/bot-name))
(clojure.spec.alpha/def :portkey.aws.lex-models.get-bot-channel-association-response/type (clojure.spec.alpha/and :portkey.aws.lex-models/channel-type))
(clojure.spec.alpha/def :portkey.aws.lex-models.get-bot-channel-association-response/failure-reason (clojure.spec.alpha/and :portkey.aws.lex-models/string))
(clojure.spec.alpha/def :portkey.aws.lex-models.get-bot-channel-association-response/description (clojure.spec.alpha/and :portkey.aws.lex-models/description))
(clojure.spec.alpha/def :portkey.aws.lex-models/get-bot-channel-association-response (portkey.aws/json-keys :req-un [] :opt-un [:portkey.aws.lex-models.get-bot-channel-association-response/botAlias :portkey.aws.lex-models.get-bot-channel-association-response/createdDate :portkey.aws.lex-models.get-bot-channel-association-response/name :portkey.aws.lex-models.get-bot-channel-association-response/status :portkey.aws.lex-models.get-bot-channel-association-response/botConfiguration :portkey.aws.lex-models.get-bot-channel-association-response/botName :portkey.aws.lex-models.get-bot-channel-association-response/type :portkey.aws.lex-models.get-bot-channel-association-response/failureReason :portkey.aws.lex-models.get-bot-channel-association-response/description] :locations {}))

(clojure.spec.alpha/def :portkey.aws.lex-models.bad-request-exception/message (clojure.spec.alpha/and :portkey.aws.lex-models/string))
(clojure.spec.alpha/def :portkey.aws.lex-models/bad-request-exception (portkey.aws/json-keys :req-un [] :opt-un [:portkey.aws.lex-models.bad-request-exception/message] :locations {}))

(clojure.spec.alpha/def :portkey.aws.lex-models/channel-configuration-map (clojure.spec.alpha/map-of :portkey.aws.lex-models/string :portkey.aws.lex-models/string))

(clojure.spec.alpha/def :portkey.aws.lex-models.precondition-failed-exception/message (clojure.spec.alpha/and :portkey.aws.lex-models/string))
(clojure.spec.alpha/def :portkey.aws.lex-models/precondition-failed-exception (portkey.aws/json-keys :req-un [] :opt-un [:portkey.aws.lex-models.precondition-failed-exception/message] :locations {}))

(clojure.spec.alpha/def :portkey.aws.lex-models.put-bot-alias-response/name (clojure.spec.alpha/and :portkey.aws.lex-models/alias-name))
(clojure.spec.alpha/def :portkey.aws.lex-models.put-bot-alias-response/description (clojure.spec.alpha/and :portkey.aws.lex-models/description))
(clojure.spec.alpha/def :portkey.aws.lex-models.put-bot-alias-response/bot-version (clojure.spec.alpha/and :portkey.aws.lex-models/version))
(clojure.spec.alpha/def :portkey.aws.lex-models.put-bot-alias-response/bot-name (clojure.spec.alpha/and :portkey.aws.lex-models/bot-name))
(clojure.spec.alpha/def :portkey.aws.lex-models.put-bot-alias-response/last-updated-date (clojure.spec.alpha/and :portkey.aws.lex-models/timestamp))
(clojure.spec.alpha/def :portkey.aws.lex-models.put-bot-alias-response/created-date (clojure.spec.alpha/and :portkey.aws.lex-models/timestamp))
(clojure.spec.alpha/def :portkey.aws.lex-models.put-bot-alias-response/checksum (clojure.spec.alpha/and :portkey.aws.lex-models/string))
(clojure.spec.alpha/def :portkey.aws.lex-models/put-bot-alias-response (portkey.aws/json-keys :req-un [] :opt-un [:portkey.aws.lex-models.put-bot-alias-response/name :portkey.aws.lex-models.put-bot-alias-response/description :portkey.aws.lex-models.put-bot-alias-response/botVersion :portkey.aws.lex-models.put-bot-alias-response/botName :portkey.aws.lex-models.put-bot-alias-response/lastUpdatedDate :portkey.aws.lex-models.put-bot-alias-response/createdDate :portkey.aws.lex-models.put-bot-alias-response/checksum] :locations {}))

(clojure.spec.alpha/def :portkey.aws.lex-models/export-status (clojure.spec.alpha/conformer (clojure.core/let [m__30630__auto__ {"IN_PROGRESS" "IN_PROGRESS", :in-progress "IN_PROGRESS", "READY" "READY", :ready "READY", "FAILED" "FAILED", :failed "FAILED"}] (clojure.core/fn [s__30631__auto__] (m__30630__auto__ s__30631__auto__ :clojure.spec.alpha/invalid))) (clojure.core/comp clojure.core/keyword portkey.aws/dashed)))

(clojure.spec.alpha/def :portkey.aws.lex-models.get-bots-request/next-token (clojure.spec.alpha/and :portkey.aws.lex-models/next-token))
(clojure.spec.alpha/def :portkey.aws.lex-models.get-bots-request/max-results (clojure.spec.alpha/and :portkey.aws.lex-models/max-results))
(clojure.spec.alpha/def :portkey.aws.lex-models.get-bots-request/name-contains (clojure.spec.alpha/and :portkey.aws.lex-models/bot-name))
(clojure.spec.alpha/def :portkey.aws.lex-models/get-bots-request (portkey.aws/json-keys :req-un [] :opt-un [:portkey.aws.lex-models.get-bots-request/nextToken :portkey.aws.lex-models.get-bots-request/maxResults :portkey.aws.lex-models.get-bots-request/nameContains] :locations {}))

(clojure.spec.alpha/def :portkey.aws.lex-models/locale (clojure.spec.alpha/conformer (clojure.core/let [m__30630__auto__ {"en-US" "en-US", :en-us "en-US", "en-GB" "en-GB", :en-gb "en-GB", "de-DE" "de-DE", :de-de "de-DE"}] (clojure.core/fn [s__30631__auto__] (m__30630__auto__ s__30631__auto__ :clojure.spec.alpha/invalid))) (clojure.core/comp clojure.core/keyword portkey.aws/dashed)))

(clojure.spec.alpha/def :portkey.aws.lex-models.utterance-data/utterance-string (clojure.spec.alpha/and :portkey.aws.lex-models/utterance-string))
(clojure.spec.alpha/def :portkey.aws.lex-models.utterance-data/count (clojure.spec.alpha/and :portkey.aws.lex-models/count))
(clojure.spec.alpha/def :portkey.aws.lex-models.utterance-data/distinct-users (clojure.spec.alpha/and :portkey.aws.lex-models/count))
(clojure.spec.alpha/def :portkey.aws.lex-models.utterance-data/first-uttered-date (clojure.spec.alpha/and :portkey.aws.lex-models/timestamp))
(clojure.spec.alpha/def :portkey.aws.lex-models.utterance-data/last-uttered-date (clojure.spec.alpha/and :portkey.aws.lex-models/timestamp))
(clojure.spec.alpha/def :portkey.aws.lex-models/utterance-data (portkey.aws/json-keys :req-un [] :opt-un [:portkey.aws.lex-models.utterance-data/utteranceString :portkey.aws.lex-models.utterance-data/count :portkey.aws.lex-models.utterance-data/distinctUsers :portkey.aws.lex-models.utterance-data/firstUtteredDate :portkey.aws.lex-models.utterance-data/lastUtteredDate] :locations {}))

(clojure.spec.alpha/def :portkey.aws.lex-models/alias-name-or-list-all (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__30632__auto__] (clojure.core/<= 1 (clojure.core/count s__30632__auto__))) (clojure.core/fn [s__30633__auto__] (clojure.core/< (clojure.core/count s__30633__auto__) 100)) (clojure.core/fn [s__30634__auto__] (clojure.core/re-matches #"^(-|^([A-Za-z]_?)+$)$" s__30634__auto__))))

(clojure.spec.alpha/def :portkey.aws.lex-models.get-bot-channel-associations-request/bot-name (clojure.spec.alpha/and :portkey.aws.lex-models/bot-name))
(clojure.spec.alpha/def :portkey.aws.lex-models.get-bot-channel-associations-request/bot-alias (clojure.spec.alpha/and :portkey.aws.lex-models/alias-name-or-list-all))
(clojure.spec.alpha/def :portkey.aws.lex-models.get-bot-channel-associations-request/next-token (clojure.spec.alpha/and :portkey.aws.lex-models/next-token))
(clojure.spec.alpha/def :portkey.aws.lex-models.get-bot-channel-associations-request/max-results (clojure.spec.alpha/and :portkey.aws.lex-models/max-results))
(clojure.spec.alpha/def :portkey.aws.lex-models.get-bot-channel-associations-request/name-contains (clojure.spec.alpha/and :portkey.aws.lex-models/bot-channel-name))
(clojure.spec.alpha/def :portkey.aws.lex-models/get-bot-channel-associations-request (portkey.aws/json-keys :req-un [:portkey.aws.lex-models.get-bot-channel-associations-request/botName :portkey.aws.lex-models.get-bot-channel-associations-request/botAlias] :opt-un [:portkey.aws.lex-models.get-bot-channel-associations-request/nextToken :portkey.aws.lex-models.get-bot-channel-associations-request/maxResults :portkey.aws.lex-models.get-bot-channel-associations-request/nameContains] :locations {}))

(clojure.spec.alpha/def :portkey.aws.lex-models.put-bot-request/intents (clojure.spec.alpha/and :portkey.aws.lex-models/intent-list))
(clojure.spec.alpha/def :portkey.aws.lex-models.put-bot-request/idle-sessionttlin-seconds (clojure.spec.alpha/and :portkey.aws.lex-models/sessionttl))
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
(clojure.spec.alpha/def :portkey.aws.lex-models/put-bot-request (portkey.aws/json-keys :req-un [:portkey.aws.lex-models.put-bot-request/name :portkey.aws.lex-models.put-bot-request/locale :portkey.aws.lex-models.put-bot-request/childDirected] :opt-un [:portkey.aws.lex-models.put-bot-request/intents :portkey.aws.lex-models.put-bot-request/idleSessionTTLInSeconds :portkey.aws.lex-models.put-bot-request/clarificationPrompt :portkey.aws.lex-models.put-bot-request/processBehavior :portkey.aws.lex-models.put-bot-request/createVersion :portkey.aws.lex-models.put-bot-request/abortStatement :portkey.aws.lex-models.put-bot-request/checksum :portkey.aws.lex-models.put-bot-request/voiceId :portkey.aws.lex-models.put-bot-request/description] :locations {}))

(clojure.spec.alpha/def :portkey.aws.lex-models/slot-value-selection-strategy (clojure.spec.alpha/conformer (clojure.core/let [m__30630__auto__ {"ORIGINAL_VALUE" "ORIGINAL_VALUE", :original-value "ORIGINAL_VALUE", "TOP_RESOLUTION" "TOP_RESOLUTION", :top-resolution "TOP_RESOLUTION"}] (clojure.core/fn [s__30631__auto__] (m__30630__auto__ s__30631__auto__ :clojure.spec.alpha/invalid))) (clojure.core/comp clojure.core/keyword portkey.aws/dashed)))

(clojure.spec.alpha/def :portkey.aws.lex-models/prompt-max-attempts (clojure.spec.alpha/and clojure.core/int? (fn* [p1__30692__30693__auto__] (clojure.core/<= 1 p1__30692__30693__auto__)) (fn* [p1__30694__30695__auto__] (clojure.core/<= p1__30694__30695__auto__ 5))))

(clojure.spec.alpha/def :portkey.aws.lex-models/builtin-intent-slot-list (clojure.spec.alpha/and (clojure.spec.alpha/coll-of :portkey.aws.lex-models/builtin-intent-slot) (clojure.spec.alpha/conformer clojure.core/identity (fn* [p1__30551__30552__auto__] (if (clojure.core/sequential? p1__30551__30552__auto__) p1__30551__30552__auto__ [p1__30551__30552__auto__])))))

(clojure.spec.alpha/def :portkey.aws.lex-models.create-bot-version-request/name (clojure.spec.alpha/and :portkey.aws.lex-models/bot-name))
(clojure.spec.alpha/def :portkey.aws.lex-models.create-bot-version-request/checksum (clojure.spec.alpha/and :portkey.aws.lex-models/string))
(clojure.spec.alpha/def :portkey.aws.lex-models/create-bot-version-request (portkey.aws/json-keys :req-un [:portkey.aws.lex-models.create-bot-version-request/name] :opt-un [:portkey.aws.lex-models.create-bot-version-request/checksum] :locations {}))

(clojure.spec.alpha/def :portkey.aws.lex-models/numerical-version (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__30632__auto__] (clojure.core/<= 1 (clojure.core/count s__30632__auto__))) (clojure.core/fn [s__30633__auto__] (clojure.core/< (clojure.core/count s__30633__auto__) 64)) (clojure.core/fn [s__30634__auto__] (clojure.core/re-matches #"[0-9]+" s__30634__auto__))))

(clojure.spec.alpha/def :portkey.aws.lex-models.utterance-list/bot-version (clojure.spec.alpha/and :portkey.aws.lex-models/version))
(clojure.spec.alpha/def :portkey.aws.lex-models.utterance-list/utterances (clojure.spec.alpha/and :portkey.aws.lex-models/list-of-utterance))
(clojure.spec.alpha/def :portkey.aws.lex-models/utterance-list (portkey.aws/json-keys :req-un [] :opt-un [:portkey.aws.lex-models.utterance-list/botVersion :portkey.aws.lex-models.utterance-list/utterances] :locations {}))

(clojure.spec.alpha/def :portkey.aws.lex-models.get-utterances-view-response/bot-name (clojure.spec.alpha/and :portkey.aws.lex-models/bot-name))
(clojure.spec.alpha/def :portkey.aws.lex-models.get-utterances-view-response/utterances (clojure.spec.alpha/and :portkey.aws.lex-models/lists-of-utterances))
(clojure.spec.alpha/def :portkey.aws.lex-models/get-utterances-view-response (portkey.aws/json-keys :req-un [] :opt-un [:portkey.aws.lex-models.get-utterances-view-response/botName :portkey.aws.lex-models.get-utterances-view-response/utterances] :locations {}))

(clojure.spec.alpha/def :portkey.aws.lex-models.create-slot-type-version-response/name (clojure.spec.alpha/and :portkey.aws.lex-models/slot-type-name))
(clojure.spec.alpha/def :portkey.aws.lex-models.create-slot-type-version-response/description (clojure.spec.alpha/and :portkey.aws.lex-models/description))
(clojure.spec.alpha/def :portkey.aws.lex-models.create-slot-type-version-response/enumeration-values (clojure.spec.alpha/and :portkey.aws.lex-models/enumeration-values))
(clojure.spec.alpha/def :portkey.aws.lex-models.create-slot-type-version-response/last-updated-date (clojure.spec.alpha/and :portkey.aws.lex-models/timestamp))
(clojure.spec.alpha/def :portkey.aws.lex-models.create-slot-type-version-response/created-date (clojure.spec.alpha/and :portkey.aws.lex-models/timestamp))
(clojure.spec.alpha/def :portkey.aws.lex-models.create-slot-type-version-response/version (clojure.spec.alpha/and :portkey.aws.lex-models/version))
(clojure.spec.alpha/def :portkey.aws.lex-models.create-slot-type-version-response/checksum (clojure.spec.alpha/and :portkey.aws.lex-models/string))
(clojure.spec.alpha/def :portkey.aws.lex-models.create-slot-type-version-response/value-selection-strategy (clojure.spec.alpha/and :portkey.aws.lex-models/slot-value-selection-strategy))
(clojure.spec.alpha/def :portkey.aws.lex-models/create-slot-type-version-response (portkey.aws/json-keys :req-un [] :opt-un [:portkey.aws.lex-models.create-slot-type-version-response/name :portkey.aws.lex-models.create-slot-type-version-response/description :portkey.aws.lex-models.create-slot-type-version-response/enumerationValues :portkey.aws.lex-models.create-slot-type-version-response/lastUpdatedDate :portkey.aws.lex-models.create-slot-type-version-response/createdDate :portkey.aws.lex-models.create-slot-type-version-response/version :portkey.aws.lex-models.create-slot-type-version-response/checksum :portkey.aws.lex-models.create-slot-type-version-response/valueSelectionStrategy] :locations {}))

(clojure.spec.alpha/def :portkey.aws.lex-models.delete-intent-version-request/name (clojure.spec.alpha/and :portkey.aws.lex-models/intent-name))
(clojure.spec.alpha/def :portkey.aws.lex-models.delete-intent-version-request/version (clojure.spec.alpha/and :portkey.aws.lex-models/numerical-version))
(clojure.spec.alpha/def :portkey.aws.lex-models/delete-intent-version-request (portkey.aws/json-keys :req-un [:portkey.aws.lex-models.delete-intent-version-request/name :portkey.aws.lex-models.delete-intent-version-request/version] :opt-un [] :locations {}))

(clojure.spec.alpha/def :portkey.aws.lex-models.get-builtin-slot-types-response/slot-types (clojure.spec.alpha/and :portkey.aws.lex-models/builtin-slot-type-metadata-list))
(clojure.spec.alpha/def :portkey.aws.lex-models.get-builtin-slot-types-response/next-token (clojure.spec.alpha/and :portkey.aws.lex-models/next-token))
(clojure.spec.alpha/def :portkey.aws.lex-models/get-builtin-slot-types-response (portkey.aws/json-keys :req-un [] :opt-un [:portkey.aws.lex-models.get-builtin-slot-types-response/slotTypes :portkey.aws.lex-models.get-builtin-slot-types-response/nextToken] :locations {}))

(clojure.spec.alpha/def :portkey.aws.lex-models.statement/messages (clojure.spec.alpha/and :portkey.aws.lex-models/message-list))
(clojure.spec.alpha/def :portkey.aws.lex-models.statement/response-card (clojure.spec.alpha/and :portkey.aws.lex-models/response-card))
(clojure.spec.alpha/def :portkey.aws.lex-models/statement (portkey.aws/json-keys :req-un [:portkey.aws.lex-models.statement/messages] :opt-un [:portkey.aws.lex-models.statement/responseCard] :locations {}))

(clojure.spec.alpha/def :portkey.aws.lex-models/user-id (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__30632__auto__] (clojure.core/<= 2 (clojure.core/count s__30632__auto__))) (clojure.core/fn [s__30633__auto__] (clojure.core/< (clojure.core/count s__30633__auto__) 100))))

(clojure.spec.alpha/def :portkey.aws.lex-models.put-slot-type-request/name (clojure.spec.alpha/and :portkey.aws.lex-models/slot-type-name))
(clojure.spec.alpha/def :portkey.aws.lex-models.put-slot-type-request/description (clojure.spec.alpha/and :portkey.aws.lex-models/description))
(clojure.spec.alpha/def :portkey.aws.lex-models.put-slot-type-request/enumeration-values (clojure.spec.alpha/and :portkey.aws.lex-models/enumeration-values))
(clojure.spec.alpha/def :portkey.aws.lex-models.put-slot-type-request/checksum (clojure.spec.alpha/and :portkey.aws.lex-models/string))
(clojure.spec.alpha/def :portkey.aws.lex-models.put-slot-type-request/value-selection-strategy (clojure.spec.alpha/and :portkey.aws.lex-models/slot-value-selection-strategy))
(clojure.spec.alpha/def :portkey.aws.lex-models.put-slot-type-request/create-version (clojure.spec.alpha/and :portkey.aws.lex-models/boolean))
(clojure.spec.alpha/def :portkey.aws.lex-models/put-slot-type-request (portkey.aws/json-keys :req-un [:portkey.aws.lex-models.put-slot-type-request/name] :opt-un [:portkey.aws.lex-models.put-slot-type-request/description :portkey.aws.lex-models.put-slot-type-request/enumerationValues :portkey.aws.lex-models.put-slot-type-request/checksum :portkey.aws.lex-models.put-slot-type-request/valueSelectionStrategy :portkey.aws.lex-models.put-slot-type-request/createVersion] :locations {}))

(clojure.spec.alpha/def :portkey.aws.lex-models.create-intent-version-request/name (clojure.spec.alpha/and :portkey.aws.lex-models/intent-name))
(clojure.spec.alpha/def :portkey.aws.lex-models.create-intent-version-request/checksum (clojure.spec.alpha/and :portkey.aws.lex-models/string))
(clojure.spec.alpha/def :portkey.aws.lex-models/create-intent-version-request (portkey.aws/json-keys :req-un [:portkey.aws.lex-models.create-intent-version-request/name] :opt-un [:portkey.aws.lex-models.create-intent-version-request/checksum] :locations {}))

(clojure.spec.alpha/def :portkey.aws.lex-models.resource-in-use-exception/reference-type (clojure.spec.alpha/and :portkey.aws.lex-models/reference-type))
(clojure.spec.alpha/def :portkey.aws.lex-models.resource-in-use-exception/example-reference (clojure.spec.alpha/and :portkey.aws.lex-models/resource-reference))
(clojure.spec.alpha/def :portkey.aws.lex-models/resource-in-use-exception (portkey.aws/json-keys :req-un [] :opt-un [:portkey.aws.lex-models.resource-in-use-exception/referenceType :portkey.aws.lex-models.resource-in-use-exception/exampleReference] :locations {}))

(clojure.spec.alpha/def :portkey.aws.lex-models.code-hook/uri (clojure.spec.alpha/and :portkey.aws.lex-models/lambdaarn))
(clojure.spec.alpha/def :portkey.aws.lex-models.code-hook/message-version (clojure.spec.alpha/and :portkey.aws.lex-models/message-version))
(clojure.spec.alpha/def :portkey.aws.lex-models/code-hook (portkey.aws/json-keys :req-un [:portkey.aws.lex-models.code-hook/uri :portkey.aws.lex-models.code-hook/messageVersion] :opt-un [] :locations {}))

(clojure.spec.alpha/def :portkey.aws.lex-models/count (clojure.spec.alpha/and clojure.core/int?))

(clojure.spec.alpha/def :portkey.aws.lex-models/intent-name (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__30632__auto__] (clojure.core/<= 1 (clojure.core/count s__30632__auto__))) (clojure.core/fn [s__30633__auto__] (clojure.core/< (clojure.core/count s__30633__auto__) 100)) (clojure.core/fn [s__30634__auto__] (clojure.core/re-matches #"^([A-Za-z]_?)+$" s__30634__auto__))))

(clojure.spec.alpha/def :portkey.aws.lex-models.limit-exceeded-exception/retry-after-seconds (clojure.spec.alpha/and :portkey.aws.lex-models/string))
(clojure.spec.alpha/def :portkey.aws.lex-models.limit-exceeded-exception/message (clojure.spec.alpha/and :portkey.aws.lex-models/string))
(clojure.spec.alpha/def :portkey.aws.lex-models/limit-exceeded-exception (portkey.aws/json-keys :req-un [] :opt-un [:portkey.aws.lex-models.limit-exceeded-exception/retryAfterSeconds :portkey.aws.lex-models.limit-exceeded-exception/message] :locations {}))

(clojure.spec.alpha/def :portkey.aws.lex-models.create-slot-type-version-request/name (clojure.spec.alpha/and :portkey.aws.lex-models/slot-type-name))
(clojure.spec.alpha/def :portkey.aws.lex-models.create-slot-type-version-request/checksum (clojure.spec.alpha/and :portkey.aws.lex-models/string))
(clojure.spec.alpha/def :portkey.aws.lex-models/create-slot-type-version-request (portkey.aws/json-keys :req-un [:portkey.aws.lex-models.create-slot-type-version-request/name] :opt-un [:portkey.aws.lex-models.create-slot-type-version-request/checksum] :locations {}))

(clojure.spec.alpha/def :portkey.aws.lex-models/slot-utterance-list (clojure.spec.alpha/and (clojure.spec.alpha/coll-of :portkey.aws.lex-models/utterance :min-count 0 :max-count 10) (clojure.spec.alpha/conformer clojure.core/identity (fn* [p1__30551__30552__auto__] (if (clojure.core/sequential? p1__30551__30552__auto__) p1__30551__30552__auto__ [p1__30551__30552__auto__])))))

(clojure.spec.alpha/def :portkey.aws.lex-models.get-export-request/name (clojure.spec.alpha/and :portkey.aws.lex-models/name))
(clojure.spec.alpha/def :portkey.aws.lex-models.get-export-request/version (clojure.spec.alpha/and :portkey.aws.lex-models/numerical-version))
(clojure.spec.alpha/def :portkey.aws.lex-models.get-export-request/resource-type (clojure.spec.alpha/and :portkey.aws.lex-models/resource-type))
(clojure.spec.alpha/def :portkey.aws.lex-models.get-export-request/export-type (clojure.spec.alpha/and :portkey.aws.lex-models/export-type))
(clojure.spec.alpha/def :portkey.aws.lex-models/get-export-request (portkey.aws/json-keys :req-un [:portkey.aws.lex-models.get-export-request/name :portkey.aws.lex-models.get-export-request/version :portkey.aws.lex-models.get-export-request/resourceType :portkey.aws.lex-models.get-export-request/exportType] :opt-un [] :locations {}))

(clojure.spec.alpha/def :portkey.aws.lex-models.get-slot-types-request/next-token (clojure.spec.alpha/and :portkey.aws.lex-models/next-token))
(clojure.spec.alpha/def :portkey.aws.lex-models.get-slot-types-request/max-results (clojure.spec.alpha/and :portkey.aws.lex-models/max-results))
(clojure.spec.alpha/def :portkey.aws.lex-models.get-slot-types-request/name-contains (clojure.spec.alpha/and :portkey.aws.lex-models/slot-type-name))
(clojure.spec.alpha/def :portkey.aws.lex-models/get-slot-types-request (portkey.aws/json-keys :req-un [] :opt-un [:portkey.aws.lex-models.get-slot-types-request/nextToken :portkey.aws.lex-models.get-slot-types-request/maxResults :portkey.aws.lex-models.get-slot-types-request/nameContains] :locations {}))

(clojure.spec.alpha/def :portkey.aws.lex-models/response-card (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__30632__auto__] (clojure.core/<= 1 (clojure.core/count s__30632__auto__))) (clojure.core/fn [s__30633__auto__] (clojure.core/< (clojure.core/count s__30633__auto__) 50000))))

(clojure.spec.alpha/def :portkey.aws.lex-models.get-builtin-intents-request/locale (clojure.spec.alpha/and :portkey.aws.lex-models/locale))
(clojure.spec.alpha/def :portkey.aws.lex-models.get-builtin-intents-request/signature-contains (clojure.spec.alpha/and :portkey.aws.lex-models/string))
(clojure.spec.alpha/def :portkey.aws.lex-models.get-builtin-intents-request/next-token (clojure.spec.alpha/and :portkey.aws.lex-models/next-token))
(clojure.spec.alpha/def :portkey.aws.lex-models.get-builtin-intents-request/max-results (clojure.spec.alpha/and :portkey.aws.lex-models/max-results))
(clojure.spec.alpha/def :portkey.aws.lex-models/get-builtin-intents-request (portkey.aws/json-keys :req-un [] :opt-un [:portkey.aws.lex-models.get-builtin-intents-request/locale :portkey.aws.lex-models.get-builtin-intents-request/signatureContains :portkey.aws.lex-models.get-builtin-intents-request/nextToken :portkey.aws.lex-models.get-builtin-intents-request/maxResults] :locations {}))

(clojure.spec.alpha/def :portkey.aws.lex-models.delete-bot-alias-request/name (clojure.spec.alpha/and :portkey.aws.lex-models/alias-name))
(clojure.spec.alpha/def :portkey.aws.lex-models.delete-bot-alias-request/bot-name (clojure.spec.alpha/and :portkey.aws.lex-models/bot-name))
(clojure.spec.alpha/def :portkey.aws.lex-models/delete-bot-alias-request (portkey.aws/json-keys :req-un [:portkey.aws.lex-models.delete-bot-alias-request/name :portkey.aws.lex-models.delete-bot-alias-request/botName] :opt-un [] :locations {}))

(clojure.spec.alpha/def :portkey.aws.lex-models/status (clojure.spec.alpha/conformer (clojure.core/let [m__30630__auto__ {"BUILDING" "BUILDING", :building "BUILDING", "READY" "READY", :ready "READY", "FAILED" "FAILED", :failed "FAILED", "NOT_BUILT" "NOT_BUILT", :not-built "NOT_BUILT"}] (clojure.core/fn [s__30631__auto__] (m__30630__auto__ s__30631__auto__ :clojure.spec.alpha/invalid))) (clojure.core/comp clojure.core/keyword portkey.aws/dashed)))

(clojure.spec.alpha/def :portkey.aws.lex-models.start-import-response/name (clojure.spec.alpha/and :portkey.aws.lex-models/name))
(clojure.spec.alpha/def :portkey.aws.lex-models.start-import-response/resource-type (clojure.spec.alpha/and :portkey.aws.lex-models/resource-type))
(clojure.spec.alpha/def :portkey.aws.lex-models.start-import-response/merge-strategy (clojure.spec.alpha/and :portkey.aws.lex-models/merge-strategy))
(clojure.spec.alpha/def :portkey.aws.lex-models.start-import-response/import-id (clojure.spec.alpha/and :portkey.aws.lex-models/string))
(clojure.spec.alpha/def :portkey.aws.lex-models.start-import-response/import-status (clojure.spec.alpha/and :portkey.aws.lex-models/import-status))
(clojure.spec.alpha/def :portkey.aws.lex-models.start-import-response/created-date (clojure.spec.alpha/and :portkey.aws.lex-models/timestamp))
(clojure.spec.alpha/def :portkey.aws.lex-models/start-import-response (portkey.aws/json-keys :req-un [] :opt-un [:portkey.aws.lex-models.start-import-response/name :portkey.aws.lex-models.start-import-response/resourceType :portkey.aws.lex-models.start-import-response/mergeStrategy :portkey.aws.lex-models.start-import-response/importId :portkey.aws.lex-models.start-import-response/importStatus :portkey.aws.lex-models.start-import-response/createdDate] :locations {}))

(clojure.spec.alpha/def :portkey.aws.lex-models/group-number (clojure.spec.alpha/and clojure.core/int? (fn* [p1__30692__30693__auto__] (clojure.core/<= 1 p1__30692__30693__auto__)) (fn* [p1__30694__30695__auto__] (clojure.core/<= p1__30694__30695__auto__ 5))))

(clojure.spec.alpha/def :portkey.aws.lex-models/next-token (clojure.spec.alpha/and clojure.core/string?))

(clojure.spec.alpha/def :portkey.aws.lex-models/priority (clojure.spec.alpha/and clojure.core/int? (fn* [p1__30692__30693__auto__] (clojure.core/<= 0 p1__30692__30693__auto__)) (fn* [p1__30694__30695__auto__] (clojure.core/<= p1__30694__30695__auto__ 100))))

(clojure.spec.alpha/def :portkey.aws.lex-models/status-type (clojure.spec.alpha/conformer (clojure.core/let [m__30630__auto__ {"Detected" "Detected", :detected "Detected", "Missed" "Missed", :missed "Missed"}] (clojure.core/fn [s__30631__auto__] (m__30630__auto__ s__30631__auto__ :clojure.spec.alpha/invalid))) (clojure.core/comp clojure.core/keyword portkey.aws/dashed)))

(clojure.spec.alpha/def :portkey.aws.lex-models/utterance-string (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__30632__auto__] (clojure.core/<= 1 (clojure.core/count s__30632__auto__))) (clojure.core/fn [s__30633__auto__] (clojure.core/< (clojure.core/count s__30633__auto__) 2000))))

(clojure.spec.alpha/def :portkey.aws.lex-models.delete-slot-type-version-request/name (clojure.spec.alpha/and :portkey.aws.lex-models/slot-type-name))
(clojure.spec.alpha/def :portkey.aws.lex-models.delete-slot-type-version-request/version (clojure.spec.alpha/and :portkey.aws.lex-models/numerical-version))
(clojure.spec.alpha/def :portkey.aws.lex-models/delete-slot-type-version-request (portkey.aws/json-keys :req-un [:portkey.aws.lex-models.delete-slot-type-version-request/name :portkey.aws.lex-models.delete-slot-type-version-request/version] :opt-un [] :locations {}))

(clojure.spec.alpha/def :portkey.aws.lex-models.delete-bot-version-request/name (clojure.spec.alpha/and :portkey.aws.lex-models/bot-name))
(clojure.spec.alpha/def :portkey.aws.lex-models.delete-bot-version-request/version (clojure.spec.alpha/and :portkey.aws.lex-models/numerical-version))
(clojure.spec.alpha/def :portkey.aws.lex-models/delete-bot-version-request (portkey.aws/json-keys :req-un [:portkey.aws.lex-models.delete-bot-version-request/name :portkey.aws.lex-models.delete-bot-version-request/version] :opt-un [] :locations {}))

(clojure.spec.alpha/def :portkey.aws.lex-models/bot-versions (clojure.spec.alpha/and (clojure.spec.alpha/coll-of :portkey.aws.lex-models/version :min-count 1 :max-count 5) (clojure.spec.alpha/conformer clojure.core/identity (fn* [p1__30551__30552__auto__] (if (clojure.core/sequential? p1__30551__30552__auto__) p1__30551__30552__auto__ [p1__30551__30552__auto__])))))

(clojure.spec.alpha/def :portkey.aws.lex-models/content-type (clojure.spec.alpha/conformer (clojure.core/let [m__30630__auto__ {"PlainText" "PlainText", :plain-text "PlainText", "SSML" "SSML", :ssml "SSML", "CustomPayload" "CustomPayload", :custom-payload "CustomPayload"}] (clojure.core/fn [s__30631__auto__] (m__30630__auto__ s__30631__auto__ :clojure.spec.alpha/invalid))) (clojure.core/comp clojure.core/keyword portkey.aws/dashed)))

(clojure.spec.alpha/def :portkey.aws.lex-models/sessionttl (clojure.spec.alpha/and clojure.core/int? (fn* [p1__30692__30693__auto__] (clojure.core/<= 60 p1__30692__30693__auto__)) (fn* [p1__30694__30695__auto__] (clojure.core/<= p1__30694__30695__auto__ 86400))))

(clojure.spec.alpha/def :portkey.aws.lex-models/bot-alias-metadata-list (clojure.spec.alpha/and (clojure.spec.alpha/coll-of :portkey.aws.lex-models/bot-alias-metadata) (clojure.spec.alpha/conformer clojure.core/identity (fn* [p1__30551__30552__auto__] (if (clojure.core/sequential? p1__30551__30552__auto__) p1__30551__30552__auto__ [p1__30551__30552__auto__])))))

(clojure.spec.alpha/def :portkey.aws.lex-models/content-string (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__30632__auto__] (clojure.core/<= 1 (clojure.core/count s__30632__auto__))) (clojure.core/fn [s__30633__auto__] (clojure.core/< (clojure.core/count s__30633__auto__) 1000))))

(clojure.spec.alpha/def :portkey.aws.lex-models.internal-failure-exception/message (clojure.spec.alpha/and :portkey.aws.lex-models/string))
(clojure.spec.alpha/def :portkey.aws.lex-models/internal-failure-exception (portkey.aws/json-keys :req-un [] :opt-un [:portkey.aws.lex-models.internal-failure-exception/message] :locations {}))

(clojure.spec.alpha/def :portkey.aws.lex-models.follow-up-prompt/prompt (clojure.spec.alpha/and :portkey.aws.lex-models/prompt))
(clojure.spec.alpha/def :portkey.aws.lex-models.follow-up-prompt/rejection-statement (clojure.spec.alpha/and :portkey.aws.lex-models/statement))
(clojure.spec.alpha/def :portkey.aws.lex-models/follow-up-prompt (portkey.aws/json-keys :req-un [:portkey.aws.lex-models.follow-up-prompt/prompt :portkey.aws.lex-models.follow-up-prompt/rejectionStatement] :opt-un [] :locations {}))

(clojure.spec.alpha/def :portkey.aws.lex-models.get-bot-channel-association-request/name (clojure.spec.alpha/and :portkey.aws.lex-models/bot-channel-name))
(clojure.spec.alpha/def :portkey.aws.lex-models.get-bot-channel-association-request/bot-name (clojure.spec.alpha/and :portkey.aws.lex-models/bot-name))
(clojure.spec.alpha/def :portkey.aws.lex-models.get-bot-channel-association-request/bot-alias (clojure.spec.alpha/and :portkey.aws.lex-models/alias-name))
(clojure.spec.alpha/def :portkey.aws.lex-models/get-bot-channel-association-request (portkey.aws/json-keys :req-un [:portkey.aws.lex-models.get-bot-channel-association-request/name :portkey.aws.lex-models.get-bot-channel-association-request/botName :portkey.aws.lex-models.get-bot-channel-association-request/botAlias] :opt-un [] :locations {}))

(clojure.spec.alpha/def :portkey.aws.lex-models/builtin-intent-signature (clojure.spec.alpha/and clojure.core/string?))

(clojure.spec.alpha/def :portkey.aws.lex-models.get-import-response/name (clojure.spec.alpha/and :portkey.aws.lex-models/name))
(clojure.spec.alpha/def :portkey.aws.lex-models.get-import-response/resource-type (clojure.spec.alpha/and :portkey.aws.lex-models/resource-type))
(clojure.spec.alpha/def :portkey.aws.lex-models.get-import-response/merge-strategy (clojure.spec.alpha/and :portkey.aws.lex-models/merge-strategy))
(clojure.spec.alpha/def :portkey.aws.lex-models.get-import-response/import-id (clojure.spec.alpha/and :portkey.aws.lex-models/string))
(clojure.spec.alpha/def :portkey.aws.lex-models.get-import-response/import-status (clojure.spec.alpha/and :portkey.aws.lex-models/import-status))
(clojure.spec.alpha/def :portkey.aws.lex-models.get-import-response/failure-reason (clojure.spec.alpha/and :portkey.aws.lex-models/string-list))
(clojure.spec.alpha/def :portkey.aws.lex-models.get-import-response/created-date (clojure.spec.alpha/and :portkey.aws.lex-models/timestamp))
(clojure.spec.alpha/def :portkey.aws.lex-models/get-import-response (portkey.aws/json-keys :req-un [] :opt-un [:portkey.aws.lex-models.get-import-response/name :portkey.aws.lex-models.get-import-response/resourceType :portkey.aws.lex-models.get-import-response/mergeStrategy :portkey.aws.lex-models.get-import-response/importId :portkey.aws.lex-models.get-import-response/importStatus :portkey.aws.lex-models.get-import-response/failureReason :portkey.aws.lex-models.get-import-response/createdDate] :locations {}))

(clojure.spec.alpha/def :portkey.aws.lex-models.builtin-intent-slot/name (clojure.spec.alpha/and :portkey.aws.lex-models/string))
(clojure.spec.alpha/def :portkey.aws.lex-models/builtin-intent-slot (portkey.aws/json-keys :req-un [] :opt-un [:portkey.aws.lex-models.builtin-intent-slot/name] :locations {}))

(clojure.spec.alpha/def :portkey.aws.lex-models.create-bot-version-response/intents (clojure.spec.alpha/and :portkey.aws.lex-models/intent-list))
(clojure.spec.alpha/def :portkey.aws.lex-models.create-bot-version-response/created-date (clojure.spec.alpha/and :portkey.aws.lex-models/timestamp))
(clojure.spec.alpha/def :portkey.aws.lex-models.create-bot-version-response/idle-sessionttlin-seconds (clojure.spec.alpha/and :portkey.aws.lex-models/sessionttl))
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
(clojure.spec.alpha/def :portkey.aws.lex-models/create-bot-version-response (portkey.aws/json-keys :req-un [] :opt-un [:portkey.aws.lex-models.create-bot-version-response/intents :portkey.aws.lex-models.create-bot-version-response/createdDate :portkey.aws.lex-models.create-bot-version-response/idleSessionTTLInSeconds :portkey.aws.lex-models.create-bot-version-response/clarificationPrompt :portkey.aws.lex-models.create-bot-version-response/name :portkey.aws.lex-models.create-bot-version-response/locale :portkey.aws.lex-models.create-bot-version-response/lastUpdatedDate :portkey.aws.lex-models.create-bot-version-response/status :portkey.aws.lex-models.create-bot-version-response/abortStatement :portkey.aws.lex-models.create-bot-version-response/version :portkey.aws.lex-models.create-bot-version-response/failureReason :portkey.aws.lex-models.create-bot-version-response/childDirected :portkey.aws.lex-models.create-bot-version-response/checksum :portkey.aws.lex-models.create-bot-version-response/voiceId :portkey.aws.lex-models.create-bot-version-response/description] :locations {}))

(clojure.spec.alpha/def :portkey.aws.lex-models.get-intents-request/next-token (clojure.spec.alpha/and :portkey.aws.lex-models/next-token))
(clojure.spec.alpha/def :portkey.aws.lex-models.get-intents-request/max-results (clojure.spec.alpha/and :portkey.aws.lex-models/max-results))
(clojure.spec.alpha/def :portkey.aws.lex-models.get-intents-request/name-contains (clojure.spec.alpha/and :portkey.aws.lex-models/intent-name))
(clojure.spec.alpha/def :portkey.aws.lex-models/get-intents-request (portkey.aws/json-keys :req-un [] :opt-un [:portkey.aws.lex-models.get-intents-request/nextToken :portkey.aws.lex-models.get-intents-request/maxResults :portkey.aws.lex-models.get-intents-request/nameContains] :locations {}))

(clojure.spec.alpha/def :portkey.aws.lex-models.get-slot-type-versions-response/slot-types (clojure.spec.alpha/and :portkey.aws.lex-models/slot-type-metadata-list))
(clojure.spec.alpha/def :portkey.aws.lex-models.get-slot-type-versions-response/next-token (clojure.spec.alpha/and :portkey.aws.lex-models/next-token))
(clojure.spec.alpha/def :portkey.aws.lex-models/get-slot-type-versions-response (portkey.aws/json-keys :req-un [] :opt-un [:portkey.aws.lex-models.get-slot-type-versions-response/slotTypes :portkey.aws.lex-models.get-slot-type-versions-response/nextToken] :locations {}))

(clojure.spec.alpha/def :portkey.aws.lex-models.get-bot-versions-request/name (clojure.spec.alpha/and :portkey.aws.lex-models/bot-name))
(clojure.spec.alpha/def :portkey.aws.lex-models.get-bot-versions-request/next-token (clojure.spec.alpha/and :portkey.aws.lex-models/next-token))
(clojure.spec.alpha/def :portkey.aws.lex-models.get-bot-versions-request/max-results (clojure.spec.alpha/and :portkey.aws.lex-models/max-results))
(clojure.spec.alpha/def :portkey.aws.lex-models/get-bot-versions-request (portkey.aws/json-keys :req-un [:portkey.aws.lex-models.get-bot-versions-request/name] :opt-un [:portkey.aws.lex-models.get-bot-versions-request/nextToken :portkey.aws.lex-models.get-bot-versions-request/maxResults] :locations {}))

(clojure.spec.alpha/def :portkey.aws.lex-models.get-intent-versions-response/intents (clojure.spec.alpha/and :portkey.aws.lex-models/intent-metadata-list))
(clojure.spec.alpha/def :portkey.aws.lex-models.get-intent-versions-response/next-token (clojure.spec.alpha/and :portkey.aws.lex-models/next-token))
(clojure.spec.alpha/def :portkey.aws.lex-models/get-intent-versions-response (portkey.aws/json-keys :req-un [] :opt-un [:portkey.aws.lex-models.get-intent-versions-response/intents :portkey.aws.lex-models.get-intent-versions-response/nextToken] :locations {}))

(clojure.spec.alpha/def :portkey.aws.lex-models.get-slot-type-versions-request/name (clojure.spec.alpha/and :portkey.aws.lex-models/slot-type-name))
(clojure.spec.alpha/def :portkey.aws.lex-models.get-slot-type-versions-request/next-token (clojure.spec.alpha/and :portkey.aws.lex-models/next-token))
(clojure.spec.alpha/def :portkey.aws.lex-models.get-slot-type-versions-request/max-results (clojure.spec.alpha/and :portkey.aws.lex-models/max-results))
(clojure.spec.alpha/def :portkey.aws.lex-models/get-slot-type-versions-request (portkey.aws/json-keys :req-un [:portkey.aws.lex-models.get-slot-type-versions-request/name] :opt-un [:portkey.aws.lex-models.get-slot-type-versions-request/nextToken :portkey.aws.lex-models.get-slot-type-versions-request/maxResults] :locations {}))

(clojure.spec.alpha/def :portkey.aws.lex-models.get-bot-response/intents (clojure.spec.alpha/and :portkey.aws.lex-models/intent-list))
(clojure.spec.alpha/def :portkey.aws.lex-models.get-bot-response/created-date (clojure.spec.alpha/and :portkey.aws.lex-models/timestamp))
(clojure.spec.alpha/def :portkey.aws.lex-models.get-bot-response/idle-sessionttlin-seconds (clojure.spec.alpha/and :portkey.aws.lex-models/sessionttl))
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
(clojure.spec.alpha/def :portkey.aws.lex-models/get-bot-response (portkey.aws/json-keys :req-un [] :opt-un [:portkey.aws.lex-models.get-bot-response/intents :portkey.aws.lex-models.get-bot-response/createdDate :portkey.aws.lex-models.get-bot-response/idleSessionTTLInSeconds :portkey.aws.lex-models.get-bot-response/clarificationPrompt :portkey.aws.lex-models.get-bot-response/name :portkey.aws.lex-models.get-bot-response/locale :portkey.aws.lex-models.get-bot-response/lastUpdatedDate :portkey.aws.lex-models.get-bot-response/status :portkey.aws.lex-models.get-bot-response/abortStatement :portkey.aws.lex-models.get-bot-response/version :portkey.aws.lex-models.get-bot-response/failureReason :portkey.aws.lex-models.get-bot-response/childDirected :portkey.aws.lex-models.get-bot-response/checksum :portkey.aws.lex-models.get-bot-response/voiceId :portkey.aws.lex-models.get-bot-response/description] :locations {}))

(clojure.spec.alpha/def :portkey.aws.lex-models.get-builtin-slot-types-request/locale (clojure.spec.alpha/and :portkey.aws.lex-models/locale))
(clojure.spec.alpha/def :portkey.aws.lex-models.get-builtin-slot-types-request/signature-contains (clojure.spec.alpha/and :portkey.aws.lex-models/string))
(clojure.spec.alpha/def :portkey.aws.lex-models.get-builtin-slot-types-request/next-token (clojure.spec.alpha/and :portkey.aws.lex-models/next-token))
(clojure.spec.alpha/def :portkey.aws.lex-models.get-builtin-slot-types-request/max-results (clojure.spec.alpha/and :portkey.aws.lex-models/max-results))
(clojure.spec.alpha/def :portkey.aws.lex-models/get-builtin-slot-types-request (portkey.aws/json-keys :req-un [] :opt-un [:portkey.aws.lex-models.get-builtin-slot-types-request/locale :portkey.aws.lex-models.get-builtin-slot-types-request/signatureContains :portkey.aws.lex-models.get-builtin-slot-types-request/nextToken :portkey.aws.lex-models.get-builtin-slot-types-request/maxResults] :locations {}))

(clojure.spec.alpha/def :portkey.aws.lex-models/intent-list (clojure.spec.alpha/and (clojure.spec.alpha/coll-of :portkey.aws.lex-models/intent) (clojure.spec.alpha/conformer clojure.core/identity (fn* [p1__30551__30552__auto__] (if (clojure.core/sequential? p1__30551__30552__auto__) p1__30551__30552__auto__ [p1__30551__30552__auto__])))))

(clojure.spec.alpha/def :portkey.aws.lex-models/fulfillment-activity-type (clojure.spec.alpha/conformer (clojure.core/let [m__30630__auto__ {"ReturnIntent" "ReturnIntent", :return-intent "ReturnIntent", "CodeHook" "CodeHook", :code-hook "CodeHook"}] (clojure.core/fn [s__30631__auto__] (m__30630__auto__ s__30631__auto__ :clojure.spec.alpha/invalid))) (clojure.core/comp clojure.core/keyword portkey.aws/dashed)))

(clojure.spec.alpha/def :portkey.aws.lex-models/bot-channel-association-list (clojure.spec.alpha/and (clojure.spec.alpha/coll-of :portkey.aws.lex-models/bot-channel-association) (clojure.spec.alpha/conformer clojure.core/identity (fn* [p1__30551__30552__auto__] (if (clojure.core/sequential? p1__30551__30552__auto__) p1__30551__30552__auto__ [p1__30551__30552__auto__])))))

(clojure.spec.alpha/def :portkey.aws.lex-models.get-intents-response/intents (clojure.spec.alpha/and :portkey.aws.lex-models/intent-metadata-list))
(clojure.spec.alpha/def :portkey.aws.lex-models.get-intents-response/next-token (clojure.spec.alpha/and :portkey.aws.lex-models/next-token))
(clojure.spec.alpha/def :portkey.aws.lex-models/get-intents-response (portkey.aws/json-keys :req-un [] :opt-un [:portkey.aws.lex-models.get-intents-response/intents :portkey.aws.lex-models.get-intents-response/nextToken] :locations {}))

(clojure.spec.alpha/def :portkey.aws.lex-models.conflict-exception/message (clojure.spec.alpha/and :portkey.aws.lex-models/string))
(clojure.spec.alpha/def :portkey.aws.lex-models/conflict-exception (portkey.aws/json-keys :req-un [] :opt-un [:portkey.aws.lex-models.conflict-exception/message] :locations {}))

(clojure.spec.alpha/def :portkey.aws.lex-models/utterance (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__30632__auto__] (clojure.core/<= 1 (clojure.core/count s__30632__auto__))) (clojure.core/fn [s__30633__auto__] (clojure.core/< (clojure.core/count s__30633__auto__) 200))))

(clojure.spec.alpha/def :portkey.aws.lex-models/value (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__30632__auto__] (clojure.core/<= 1 (clojure.core/count s__30632__auto__))) (clojure.core/fn [s__30633__auto__] (clojure.core/< (clojure.core/count s__30633__auto__) 140))))

(clojure.spec.alpha/def :portkey.aws.lex-models/list-of-utterance (clojure.spec.alpha/and (clojure.spec.alpha/coll-of :portkey.aws.lex-models/utterance-data) (clojure.spec.alpha/conformer clojure.core/identity (fn* [p1__30551__30552__auto__] (if (clojure.core/sequential? p1__30551__30552__auto__) p1__30551__30552__auto__ [p1__30551__30552__auto__])))))

(clojure.spec.alpha/def :portkey.aws.lex-models/description (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__30632__auto__] (clojure.core/<= 0 (clojure.core/count s__30632__auto__))) (clojure.core/fn [s__30633__auto__] (clojure.core/< (clojure.core/count s__30633__auto__) 200))))

(clojure.spec.alpha/def :portkey.aws.lex-models.put-slot-type-response/value-selection-strategy (clojure.spec.alpha/and :portkey.aws.lex-models/slot-value-selection-strategy))
(clojure.spec.alpha/def :portkey.aws.lex-models.put-slot-type-response/created-date (clojure.spec.alpha/and :portkey.aws.lex-models/timestamp))
(clojure.spec.alpha/def :portkey.aws.lex-models.put-slot-type-response/name (clojure.spec.alpha/and :portkey.aws.lex-models/slot-type-name))
(clojure.spec.alpha/def :portkey.aws.lex-models.put-slot-type-response/enumeration-values (clojure.spec.alpha/and :portkey.aws.lex-models/enumeration-values))
(clojure.spec.alpha/def :portkey.aws.lex-models.put-slot-type-response/last-updated-date (clojure.spec.alpha/and :portkey.aws.lex-models/timestamp))
(clojure.spec.alpha/def :portkey.aws.lex-models.put-slot-type-response/create-version (clojure.spec.alpha/and :portkey.aws.lex-models/boolean))
(clojure.spec.alpha/def :portkey.aws.lex-models.put-slot-type-response/version (clojure.spec.alpha/and :portkey.aws.lex-models/version))
(clojure.spec.alpha/def :portkey.aws.lex-models.put-slot-type-response/checksum (clojure.spec.alpha/and :portkey.aws.lex-models/string))
(clojure.spec.alpha/def :portkey.aws.lex-models.put-slot-type-response/description (clojure.spec.alpha/and :portkey.aws.lex-models/description))
(clojure.spec.alpha/def :portkey.aws.lex-models/put-slot-type-response (portkey.aws/json-keys :req-un [] :opt-un [:portkey.aws.lex-models.put-slot-type-response/valueSelectionStrategy :portkey.aws.lex-models.put-slot-type-response/createdDate :portkey.aws.lex-models.put-slot-type-response/name :portkey.aws.lex-models.put-slot-type-response/enumerationValues :portkey.aws.lex-models.put-slot-type-response/lastUpdatedDate :portkey.aws.lex-models.put-slot-type-response/createVersion :portkey.aws.lex-models.put-slot-type-response/version :portkey.aws.lex-models.put-slot-type-response/checksum :portkey.aws.lex-models.put-slot-type-response/description] :locations {}))

(clojure.spec.alpha/def :portkey.aws.lex-models.get-bot-channel-associations-response/bot-channel-associations (clojure.spec.alpha/and :portkey.aws.lex-models/bot-channel-association-list))
(clojure.spec.alpha/def :portkey.aws.lex-models.get-bot-channel-associations-response/next-token (clojure.spec.alpha/and :portkey.aws.lex-models/next-token))
(clojure.spec.alpha/def :portkey.aws.lex-models/get-bot-channel-associations-response (portkey.aws/json-keys :req-un [] :opt-un [:portkey.aws.lex-models.get-bot-channel-associations-response/botChannelAssociations :portkey.aws.lex-models.get-bot-channel-associations-response/nextToken] :locations {}))

(clojure.spec.alpha/def :portkey.aws.lex-models.message/content-type (clojure.spec.alpha/and :portkey.aws.lex-models/content-type))
(clojure.spec.alpha/def :portkey.aws.lex-models.message/content (clojure.spec.alpha/and :portkey.aws.lex-models/content-string))
(clojure.spec.alpha/def :portkey.aws.lex-models.message/group-number (clojure.spec.alpha/and :portkey.aws.lex-models/group-number))
(clojure.spec.alpha/def :portkey.aws.lex-models/message (portkey.aws/json-keys :req-un [:portkey.aws.lex-models.message/contentType :portkey.aws.lex-models.message/content] :opt-un [:portkey.aws.lex-models.message/groupNumber] :locations {}))

(clojure.spec.alpha/def :portkey.aws.lex-models.get-builtin-intent-request/signature (clojure.spec.alpha/and :portkey.aws.lex-models/builtin-intent-signature))
(clojure.spec.alpha/def :portkey.aws.lex-models/get-builtin-intent-request (portkey.aws/json-keys :req-un [:portkey.aws.lex-models.get-builtin-intent-request/signature] :opt-un [] :locations {}))

(clojure.spec.alpha/def :portkey.aws.lex-models/slot-type-name (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__30632__auto__] (clojure.core/<= 1 (clojure.core/count s__30632__auto__))) (clojure.core/fn [s__30633__auto__] (clojure.core/< (clojure.core/count s__30633__auto__) 100)) (clojure.core/fn [s__30634__auto__] (clojure.core/re-matches #"^([A-Za-z]_?)+$" s__30634__auto__))))

(clojure.spec.alpha/def :portkey.aws.lex-models.not-found-exception/message (clojure.spec.alpha/and :portkey.aws.lex-models/string))
(clojure.spec.alpha/def :portkey.aws.lex-models/not-found-exception (portkey.aws/json-keys :req-un [] :opt-un [:portkey.aws.lex-models.not-found-exception/message] :locations {}))

(clojure.spec.alpha/def :portkey.aws.lex-models/export-type (clojure.spec.alpha/conformer (clojure.core/let [m__30630__auto__ {"ALEXA_SKILLS_KIT" "ALEXA_SKILLS_KIT", :alexa-skills-kit "ALEXA_SKILLS_KIT", "LEX" "LEX", :lex "LEX"}] (clojure.core/fn [s__30631__auto__] (m__30630__auto__ s__30631__auto__ :clojure.spec.alpha/invalid))) (clojure.core/comp clojure.core/keyword portkey.aws/dashed)))

(clojure.spec.alpha/def :portkey.aws.lex-models.delete-utterances-request/bot-name (clojure.spec.alpha/and :portkey.aws.lex-models/bot-name))
(clojure.spec.alpha/def :portkey.aws.lex-models.delete-utterances-request/user-id (clojure.spec.alpha/and :portkey.aws.lex-models/user-id))
(clojure.spec.alpha/def :portkey.aws.lex-models/delete-utterances-request (portkey.aws/json-keys :req-un [:portkey.aws.lex-models.delete-utterances-request/botName :portkey.aws.lex-models.delete-utterances-request/userId] :opt-un [] :locations {}))

(clojure.spec.alpha/def :portkey.aws.lex-models/custom-or-builtin-slot-type-name (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__30632__auto__] (clojure.core/<= 1 (clojure.core/count s__30632__auto__))) (clojure.core/fn [s__30633__auto__] (clojure.core/< (clojure.core/count s__30633__auto__) 100)) (clojure.core/fn [s__30634__auto__] (clojure.core/re-matches #"^((AMAZON\.)_?|[A-Za-z]_?)+" s__30634__auto__))))

(clojure.spec.alpha/def :portkey.aws.lex-models/enumeration-values (clojure.spec.alpha/and (clojure.spec.alpha/coll-of :portkey.aws.lex-models/enumeration-value :min-count 1 :max-count 10000) (clojure.spec.alpha/conformer clojure.core/identity (fn* [p1__30551__30552__auto__] (if (clojure.core/sequential? p1__30551__30552__auto__) p1__30551__30552__auto__ [p1__30551__30552__auto__])))))

(clojure.spec.alpha/def :portkey.aws.lex-models/bot-name (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__30632__auto__] (clojure.core/<= 2 (clojure.core/count s__30632__auto__))) (clojure.core/fn [s__30633__auto__] (clojure.core/< (clojure.core/count s__30633__auto__) 50)) (clojure.core/fn [s__30634__auto__] (clojure.core/re-matches #"^([A-Za-z]_?)+$" s__30634__auto__))))

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
(clojure.spec.alpha/def :portkey.aws.lex-models/slot (portkey.aws/json-keys :req-un [:portkey.aws.lex-models.slot/name :portkey.aws.lex-models.slot/slotConstraint] :opt-un [:portkey.aws.lex-models.slot/priority :portkey.aws.lex-models.slot/responseCard :portkey.aws.lex-models.slot/slotType :portkey.aws.lex-models.slot/slotTypeVersion :portkey.aws.lex-models.slot/sampleUtterances :portkey.aws.lex-models.slot/valueElicitationPrompt :portkey.aws.lex-models.slot/description] :locations {}))

(clojure.spec.alpha/def :portkey.aws.lex-models.start-import-request/payload (clojure.spec.alpha/and :portkey.aws.lex-models/blob))
(clojure.spec.alpha/def :portkey.aws.lex-models.start-import-request/resource-type (clojure.spec.alpha/and :portkey.aws.lex-models/resource-type))
(clojure.spec.alpha/def :portkey.aws.lex-models.start-import-request/merge-strategy (clojure.spec.alpha/and :portkey.aws.lex-models/merge-strategy))
(clojure.spec.alpha/def :portkey.aws.lex-models/start-import-request (portkey.aws/json-keys :req-un [:portkey.aws.lex-models.start-import-request/payload :portkey.aws.lex-models.start-import-request/resourceType :portkey.aws.lex-models.start-import-request/mergeStrategy] :opt-un [] :locations {}))

(clojure.spec.alpha/def :portkey.aws.lex-models/builtin-slot-type-metadata-list (clojure.spec.alpha/and (clojure.spec.alpha/coll-of :portkey.aws.lex-models/builtin-slot-type-metadata) (clojure.spec.alpha/conformer clojure.core/identity (fn* [p1__30551__30552__auto__] (if (clojure.core/sequential? p1__30551__30552__auto__) p1__30551__30552__auto__ [p1__30551__30552__auto__])))))

(clojure.spec.alpha/def :portkey.aws.lex-models.delete-bot-request/name (clojure.spec.alpha/and :portkey.aws.lex-models/bot-name))
(clojure.spec.alpha/def :portkey.aws.lex-models/delete-bot-request (portkey.aws/json-keys :req-un [:portkey.aws.lex-models.delete-bot-request/name] :opt-un [] :locations {}))

(clojure.spec.alpha/def :portkey.aws.lex-models/slot-name (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__30632__auto__] (clojure.core/<= 1 (clojure.core/count s__30632__auto__))) (clojure.core/fn [s__30633__auto__] (clojure.core/< (clojure.core/count s__30633__auto__) 100)) (clojure.core/fn [s__30634__auto__] (clojure.core/re-matches #"^([A-Za-z](-|_|.)?)+$" s__30634__auto__))))

(clojure.spec.alpha/def :portkey.aws.lex-models/resource-type (clojure.spec.alpha/conformer (clojure.core/let [m__30630__auto__ {"BOT" "BOT", :bot "BOT", "INTENT" "INTENT", :intent "INTENT", "SLOT_TYPE" "SLOT_TYPE", :slot-type "SLOT_TYPE"}] (clojure.core/fn [s__30631__auto__] (m__30630__auto__ s__30631__auto__ :clojure.spec.alpha/invalid))) (clojure.core/comp clojure.core/keyword portkey.aws/dashed)))

(clojure.spec.alpha/def :portkey.aws.lex-models.delete-intent-request/name (clojure.spec.alpha/and :portkey.aws.lex-models/intent-name))
(clojure.spec.alpha/def :portkey.aws.lex-models/delete-intent-request (portkey.aws/json-keys :req-un [:portkey.aws.lex-models.delete-intent-request/name] :opt-un [] :locations {}))

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
(clojure.spec.alpha/def :portkey.aws.lex-models/put-intent-response (portkey.aws/json-keys :req-un [] :opt-un [:portkey.aws.lex-models.put-intent-response/followUpPrompt :portkey.aws.lex-models.put-intent-response/fulfillmentActivity :portkey.aws.lex-models.put-intent-response/slots :portkey.aws.lex-models.put-intent-response/parentIntentSignature :portkey.aws.lex-models.put-intent-response/confirmationPrompt :portkey.aws.lex-models.put-intent-response/createdDate :portkey.aws.lex-models.put-intent-response/name :portkey.aws.lex-models.put-intent-response/rejectionStatement :portkey.aws.lex-models.put-intent-response/lastUpdatedDate :portkey.aws.lex-models.put-intent-response/createVersion :portkey.aws.lex-models.put-intent-response/dialogCodeHook :portkey.aws.lex-models.put-intent-response/conclusionStatement :portkey.aws.lex-models.put-intent-response/sampleUtterances :portkey.aws.lex-models.put-intent-response/version :portkey.aws.lex-models.put-intent-response/checksum :portkey.aws.lex-models.put-intent-response/description] :locations {}))

(clojure.spec.alpha/def :portkey.aws.lex-models.delete-bot-channel-association-request/name (clojure.spec.alpha/and :portkey.aws.lex-models/bot-channel-name))
(clojure.spec.alpha/def :portkey.aws.lex-models.delete-bot-channel-association-request/bot-name (clojure.spec.alpha/and :portkey.aws.lex-models/bot-name))
(clojure.spec.alpha/def :portkey.aws.lex-models.delete-bot-channel-association-request/bot-alias (clojure.spec.alpha/and :portkey.aws.lex-models/alias-name))
(clojure.spec.alpha/def :portkey.aws.lex-models/delete-bot-channel-association-request (portkey.aws/json-keys :req-un [:portkey.aws.lex-models.delete-bot-channel-association-request/name :portkey.aws.lex-models.delete-bot-channel-association-request/botName :portkey.aws.lex-models.delete-bot-channel-association-request/botAlias] :opt-un [] :locations {}))

(clojure.spec.alpha/def :portkey.aws.lex-models/builtin-slot-type-signature (clojure.spec.alpha/and clojure.core/string?))

(clojure.spec.alpha/def :portkey.aws.lex-models.fulfillment-activity/type (clojure.spec.alpha/and :portkey.aws.lex-models/fulfillment-activity-type))
(clojure.spec.alpha/def :portkey.aws.lex-models.fulfillment-activity/code-hook (clojure.spec.alpha/and :portkey.aws.lex-models/code-hook))
(clojure.spec.alpha/def :portkey.aws.lex-models/fulfillment-activity (portkey.aws/json-keys :req-un [:portkey.aws.lex-models.fulfillment-activity/type] :opt-un [:portkey.aws.lex-models.fulfillment-activity/codeHook] :locations {}))

(clojure.spec.alpha/def :portkey.aws.lex-models/channel-status (clojure.spec.alpha/conformer (clojure.core/let [m__30630__auto__ {"IN_PROGRESS" "IN_PROGRESS", :in-progress "IN_PROGRESS", "CREATED" "CREATED", :created "CREATED", "FAILED" "FAILED", :failed "FAILED"}] (clojure.core/fn [s__30631__auto__] (m__30630__auto__ s__30631__auto__ :clojure.spec.alpha/invalid))) (clojure.core/comp clojure.core/keyword portkey.aws/dashed)))

(clojure.spec.alpha/def :portkey.aws.lex-models/message-list (clojure.spec.alpha/and (clojure.spec.alpha/coll-of :portkey.aws.lex-models/message :min-count 1 :max-count 15) (clojure.spec.alpha/conformer clojure.core/identity (fn* [p1__30551__30552__auto__] (if (clojure.core/sequential? p1__30551__30552__auto__) p1__30551__30552__auto__ [p1__30551__30552__auto__])))))

(clojure.spec.alpha/def :portkey.aws.lex-models.get-intent-versions-request/name (clojure.spec.alpha/and :portkey.aws.lex-models/intent-name))
(clojure.spec.alpha/def :portkey.aws.lex-models.get-intent-versions-request/next-token (clojure.spec.alpha/and :portkey.aws.lex-models/next-token))
(clojure.spec.alpha/def :portkey.aws.lex-models.get-intent-versions-request/max-results (clojure.spec.alpha/and :portkey.aws.lex-models/max-results))
(clojure.spec.alpha/def :portkey.aws.lex-models/get-intent-versions-request (portkey.aws/json-keys :req-un [:portkey.aws.lex-models.get-intent-versions-request/name] :opt-un [:portkey.aws.lex-models.get-intent-versions-request/nextToken :portkey.aws.lex-models.get-intent-versions-request/maxResults] :locations {}))

(clojure.spec.alpha/def :portkey.aws.lex-models.get-intent-request/name (clojure.spec.alpha/and :portkey.aws.lex-models/intent-name))
(clojure.spec.alpha/def :portkey.aws.lex-models.get-intent-request/version (clojure.spec.alpha/and :portkey.aws.lex-models/version))
(clojure.spec.alpha/def :portkey.aws.lex-models/get-intent-request (portkey.aws/json-keys :req-un [:portkey.aws.lex-models.get-intent-request/name :portkey.aws.lex-models.get-intent-request/version] :opt-un [] :locations {}))

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
(clojure.spec.alpha/def :portkey.aws.lex-models/get-intent-response (portkey.aws/json-keys :req-un [] :opt-un [:portkey.aws.lex-models.get-intent-response/followUpPrompt :portkey.aws.lex-models.get-intent-response/fulfillmentActivity :portkey.aws.lex-models.get-intent-response/slots :portkey.aws.lex-models.get-intent-response/parentIntentSignature :portkey.aws.lex-models.get-intent-response/confirmationPrompt :portkey.aws.lex-models.get-intent-response/createdDate :portkey.aws.lex-models.get-intent-response/name :portkey.aws.lex-models.get-intent-response/rejectionStatement :portkey.aws.lex-models.get-intent-response/lastUpdatedDate :portkey.aws.lex-models.get-intent-response/dialogCodeHook :portkey.aws.lex-models.get-intent-response/conclusionStatement :portkey.aws.lex-models.get-intent-response/sampleUtterances :portkey.aws.lex-models.get-intent-response/version :portkey.aws.lex-models.get-intent-response/checksum :portkey.aws.lex-models.get-intent-response/description] :locations {}))

(clojure.spec.alpha/def :portkey.aws.lex-models.intent-metadata/name (clojure.spec.alpha/and :portkey.aws.lex-models/intent-name))
(clojure.spec.alpha/def :portkey.aws.lex-models.intent-metadata/description (clojure.spec.alpha/and :portkey.aws.lex-models/description))
(clojure.spec.alpha/def :portkey.aws.lex-models.intent-metadata/last-updated-date (clojure.spec.alpha/and :portkey.aws.lex-models/timestamp))
(clojure.spec.alpha/def :portkey.aws.lex-models.intent-metadata/created-date (clojure.spec.alpha/and :portkey.aws.lex-models/timestamp))
(clojure.spec.alpha/def :portkey.aws.lex-models.intent-metadata/version (clojure.spec.alpha/and :portkey.aws.lex-models/version))
(clojure.spec.alpha/def :portkey.aws.lex-models/intent-metadata (portkey.aws/json-keys :req-un [] :opt-un [:portkey.aws.lex-models.intent-metadata/name :portkey.aws.lex-models.intent-metadata/description :portkey.aws.lex-models.intent-metadata/lastUpdatedDate :portkey.aws.lex-models.intent-metadata/createdDate :portkey.aws.lex-models.intent-metadata/version] :locations {}))

(clojure.spec.alpha/def :portkey.aws.lex-models/timestamp clojure.core/inst?)

(clojure.spec.alpha/def :portkey.aws.lex-models/slot-constraint (clojure.spec.alpha/conformer (clojure.core/let [m__30630__auto__ {"Required" "Required", :required "Required", "Optional" "Optional", :optional "Optional"}] (clojure.core/fn [s__30631__auto__] (m__30630__auto__ s__30631__auto__ :clojure.spec.alpha/invalid))) (clojure.core/comp clojure.core/keyword portkey.aws/dashed)))

(clojure.spec.alpha/def :portkey.aws.lex-models.slot-type-metadata/name (clojure.spec.alpha/and :portkey.aws.lex-models/slot-type-name))
(clojure.spec.alpha/def :portkey.aws.lex-models.slot-type-metadata/description (clojure.spec.alpha/and :portkey.aws.lex-models/description))
(clojure.spec.alpha/def :portkey.aws.lex-models.slot-type-metadata/last-updated-date (clojure.spec.alpha/and :portkey.aws.lex-models/timestamp))
(clojure.spec.alpha/def :portkey.aws.lex-models.slot-type-metadata/created-date (clojure.spec.alpha/and :portkey.aws.lex-models/timestamp))
(clojure.spec.alpha/def :portkey.aws.lex-models.slot-type-metadata/version (clojure.spec.alpha/and :portkey.aws.lex-models/version))
(clojure.spec.alpha/def :portkey.aws.lex-models/slot-type-metadata (portkey.aws/json-keys :req-un [] :opt-un [:portkey.aws.lex-models.slot-type-metadata/name :portkey.aws.lex-models.slot-type-metadata/description :portkey.aws.lex-models.slot-type-metadata/lastUpdatedDate :portkey.aws.lex-models.slot-type-metadata/createdDate :portkey.aws.lex-models.slot-type-metadata/version] :locations {}))

(clojure.spec.alpha/def :portkey.aws.lex-models/intent-metadata-list (clojure.spec.alpha/and (clojure.spec.alpha/coll-of :portkey.aws.lex-models/intent-metadata) (clojure.spec.alpha/conformer clojure.core/identity (fn* [p1__30551__30552__auto__] (if (clojure.core/sequential? p1__30551__30552__auto__) p1__30551__30552__auto__ [p1__30551__30552__auto__])))))

(clojure.spec.alpha/def :portkey.aws.lex-models/message-version (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__30632__auto__] (clojure.core/<= 1 (clojure.core/count s__30632__auto__))) (clojure.core/fn [s__30633__auto__] (clojure.core/< (clojure.core/count s__30633__auto__) 5))))

(clojure.spec.alpha/def :portkey.aws.lex-models/slot-type-metadata-list (clojure.spec.alpha/and (clojure.spec.alpha/coll-of :portkey.aws.lex-models/slot-type-metadata) (clojure.spec.alpha/conformer clojure.core/identity (fn* [p1__30551__30552__auto__] (if (clojure.core/sequential? p1__30551__30552__auto__) p1__30551__30552__auto__ [p1__30551__30552__auto__])))))

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
(clojure.spec.alpha/def :portkey.aws.lex-models/put-intent-request (portkey.aws/json-keys :req-un [:portkey.aws.lex-models.put-intent-request/name] :opt-un [:portkey.aws.lex-models.put-intent-request/followUpPrompt :portkey.aws.lex-models.put-intent-request/fulfillmentActivity :portkey.aws.lex-models.put-intent-request/slots :portkey.aws.lex-models.put-intent-request/parentIntentSignature :portkey.aws.lex-models.put-intent-request/confirmationPrompt :portkey.aws.lex-models.put-intent-request/rejectionStatement :portkey.aws.lex-models.put-intent-request/createVersion :portkey.aws.lex-models.put-intent-request/dialogCodeHook :portkey.aws.lex-models.put-intent-request/conclusionStatement :portkey.aws.lex-models.put-intent-request/sampleUtterances :portkey.aws.lex-models.put-intent-request/checksum :portkey.aws.lex-models.put-intent-request/description] :locations {}))

(clojure.spec.alpha/def :portkey.aws.lex-models/reference-type (clojure.spec.alpha/conformer (clojure.core/let [m__30630__auto__ {"Intent" "Intent", :intent "Intent", "Bot" "Bot", :bot "Bot", "BotAlias" "BotAlias", :bot-alias "BotAlias", "BotChannel" "BotChannel", :bot-channel "BotChannel"}] (clojure.core/fn [s__30631__auto__] (m__30630__auto__ s__30631__auto__ :clojure.spec.alpha/invalid))) (clojure.core/comp clojure.core/keyword portkey.aws/dashed)))

(clojure.spec.alpha/def :portkey.aws.lex-models/max-results (clojure.spec.alpha/and clojure.core/int? (fn* [p1__30692__30693__auto__] (clojure.core/<= 1 p1__30692__30693__auto__)) (fn* [p1__30694__30695__auto__] (clojure.core/<= p1__30694__30695__auto__ 50))))

(clojure.spec.alpha/def :portkey.aws.lex-models/version (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__30632__auto__] (clojure.core/<= 1 (clojure.core/count s__30632__auto__))) (clojure.core/fn [s__30633__auto__] (clojure.core/< (clojure.core/count s__30633__auto__) 64)) (clojure.core/fn [s__30634__auto__] (clojure.core/re-matches #"\$LATEST|[0-9]+" s__30634__auto__))))

(clojure.spec.alpha/def :portkey.aws.lex-models.builtin-intent-metadata/signature (clojure.spec.alpha/and :portkey.aws.lex-models/builtin-intent-signature))
(clojure.spec.alpha/def :portkey.aws.lex-models.builtin-intent-metadata/supported-locales (clojure.spec.alpha/and :portkey.aws.lex-models/locale-list))
(clojure.spec.alpha/def :portkey.aws.lex-models/builtin-intent-metadata (portkey.aws/json-keys :req-un [] :opt-un [:portkey.aws.lex-models.builtin-intent-metadata/signature :portkey.aws.lex-models.builtin-intent-metadata/supportedLocales] :locations {}))

(clojure.spec.alpha/def :portkey.aws.lex-models/intent-utterance-list (clojure.spec.alpha/and (clojure.spec.alpha/coll-of :portkey.aws.lex-models/utterance :min-count 0 :max-count 1500) (clojure.spec.alpha/conformer clojure.core/identity (fn* [p1__30551__30552__auto__] (if (clojure.core/sequential? p1__30551__30552__auto__) p1__30551__30552__auto__ [p1__30551__30552__auto__])))))

(clojure.spec.alpha/def :portkey.aws.lex-models.get-builtin-intent-response/signature (clojure.spec.alpha/and :portkey.aws.lex-models/builtin-intent-signature))
(clojure.spec.alpha/def :portkey.aws.lex-models.get-builtin-intent-response/supported-locales (clojure.spec.alpha/and :portkey.aws.lex-models/locale-list))
(clojure.spec.alpha/def :portkey.aws.lex-models.get-builtin-intent-response/slots (clojure.spec.alpha/and :portkey.aws.lex-models/builtin-intent-slot-list))
(clojure.spec.alpha/def :portkey.aws.lex-models/get-builtin-intent-response (portkey.aws/json-keys :req-un [] :opt-un [:portkey.aws.lex-models.get-builtin-intent-response/signature :portkey.aws.lex-models.get-builtin-intent-response/supportedLocales :portkey.aws.lex-models.get-builtin-intent-response/slots] :locations {}))

(clojure.spec.alpha/def :portkey.aws.lex-models.get-slot-type-request/name (clojure.spec.alpha/and :portkey.aws.lex-models/slot-type-name))
(clojure.spec.alpha/def :portkey.aws.lex-models.get-slot-type-request/version (clojure.spec.alpha/and :portkey.aws.lex-models/version))
(clojure.spec.alpha/def :portkey.aws.lex-models/get-slot-type-request (portkey.aws/json-keys :req-un [:portkey.aws.lex-models.get-slot-type-request/name :portkey.aws.lex-models.get-slot-type-request/version] :opt-un [] :locations {}))

(clojure.spec.alpha/def :portkey.aws.lex-models.enumeration-value/value (clojure.spec.alpha/and :portkey.aws.lex-models/value))
(clojure.spec.alpha/def :portkey.aws.lex-models.enumeration-value/synonyms (clojure.spec.alpha/and :portkey.aws.lex-models/synonym-list))
(clojure.spec.alpha/def :portkey.aws.lex-models/enumeration-value (portkey.aws/json-keys :req-un [:portkey.aws.lex-models.enumeration-value/value] :opt-un [:portkey.aws.lex-models.enumeration-value/synonyms] :locations {}))

(clojure.spec.alpha/def :portkey.aws.lex-models/blob (clojure.spec.alpha/and clojure.core/bytes? (clojure.spec.alpha/conformer portkey.aws/base64-encode portkey.aws/base64-decode)))

(clojure.spec.alpha/def :portkey.aws.lex-models/alias-name (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__30632__auto__] (clojure.core/<= 1 (clojure.core/count s__30632__auto__))) (clojure.core/fn [s__30633__auto__] (clojure.core/< (clojure.core/count s__30633__auto__) 100)) (clojure.core/fn [s__30634__auto__] (clojure.core/re-matches #"^([A-Za-z]_?)+$" s__30634__auto__))))

(clojure.spec.alpha/def :portkey.aws.lex-models.get-bot-alias-response/name (clojure.spec.alpha/and :portkey.aws.lex-models/alias-name))
(clojure.spec.alpha/def :portkey.aws.lex-models.get-bot-alias-response/description (clojure.spec.alpha/and :portkey.aws.lex-models/description))
(clojure.spec.alpha/def :portkey.aws.lex-models.get-bot-alias-response/bot-version (clojure.spec.alpha/and :portkey.aws.lex-models/version))
(clojure.spec.alpha/def :portkey.aws.lex-models.get-bot-alias-response/bot-name (clojure.spec.alpha/and :portkey.aws.lex-models/bot-name))
(clojure.spec.alpha/def :portkey.aws.lex-models.get-bot-alias-response/last-updated-date (clojure.spec.alpha/and :portkey.aws.lex-models/timestamp))
(clojure.spec.alpha/def :portkey.aws.lex-models.get-bot-alias-response/created-date (clojure.spec.alpha/and :portkey.aws.lex-models/timestamp))
(clojure.spec.alpha/def :portkey.aws.lex-models.get-bot-alias-response/checksum (clojure.spec.alpha/and :portkey.aws.lex-models/string))
(clojure.spec.alpha/def :portkey.aws.lex-models/get-bot-alias-response (portkey.aws/json-keys :req-un [] :opt-un [:portkey.aws.lex-models.get-bot-alias-response/name :portkey.aws.lex-models.get-bot-alias-response/description :portkey.aws.lex-models.get-bot-alias-response/botVersion :portkey.aws.lex-models.get-bot-alias-response/botName :portkey.aws.lex-models.get-bot-alias-response/lastUpdatedDate :portkey.aws.lex-models.get-bot-alias-response/createdDate :portkey.aws.lex-models.get-bot-alias-response/checksum] :locations {}))

(clojure.spec.alpha/def :portkey.aws.lex-models.get-slot-type-response/name (clojure.spec.alpha/and :portkey.aws.lex-models/slot-type-name))
(clojure.spec.alpha/def :portkey.aws.lex-models.get-slot-type-response/description (clojure.spec.alpha/and :portkey.aws.lex-models/description))
(clojure.spec.alpha/def :portkey.aws.lex-models.get-slot-type-response/enumeration-values (clojure.spec.alpha/and :portkey.aws.lex-models/enumeration-values))
(clojure.spec.alpha/def :portkey.aws.lex-models.get-slot-type-response/last-updated-date (clojure.spec.alpha/and :portkey.aws.lex-models/timestamp))
(clojure.spec.alpha/def :portkey.aws.lex-models.get-slot-type-response/created-date (clojure.spec.alpha/and :portkey.aws.lex-models/timestamp))
(clojure.spec.alpha/def :portkey.aws.lex-models.get-slot-type-response/version (clojure.spec.alpha/and :portkey.aws.lex-models/version))
(clojure.spec.alpha/def :portkey.aws.lex-models.get-slot-type-response/checksum (clojure.spec.alpha/and :portkey.aws.lex-models/string))
(clojure.spec.alpha/def :portkey.aws.lex-models.get-slot-type-response/value-selection-strategy (clojure.spec.alpha/and :portkey.aws.lex-models/slot-value-selection-strategy))
(clojure.spec.alpha/def :portkey.aws.lex-models/get-slot-type-response (portkey.aws/json-keys :req-un [] :opt-un [:portkey.aws.lex-models.get-slot-type-response/name :portkey.aws.lex-models.get-slot-type-response/description :portkey.aws.lex-models.get-slot-type-response/enumerationValues :portkey.aws.lex-models.get-slot-type-response/lastUpdatedDate :portkey.aws.lex-models.get-slot-type-response/createdDate :portkey.aws.lex-models.get-slot-type-response/version :portkey.aws.lex-models.get-slot-type-response/checksum :portkey.aws.lex-models.get-slot-type-response/valueSelectionStrategy] :locations {}))

(clojure.spec.alpha/def :portkey.aws.lex-models/name (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__30632__auto__] (clojure.core/<= 1 (clojure.core/count s__30632__auto__))) (clojure.core/fn [s__30633__auto__] (clojure.core/< (clojure.core/count s__30633__auto__) 100)) (clojure.core/fn [s__30634__auto__] (clojure.core/re-matches #"[a-zA-Z_]+" s__30634__auto__))))

(clojure.spec.alpha/def :portkey.aws.lex-models.get-bot-versions-response/bots (clojure.spec.alpha/and :portkey.aws.lex-models/bot-metadata-list))
(clojure.spec.alpha/def :portkey.aws.lex-models.get-bot-versions-response/next-token (clojure.spec.alpha/and :portkey.aws.lex-models/next-token))
(clojure.spec.alpha/def :portkey.aws.lex-models/get-bot-versions-response (portkey.aws/json-keys :req-un [] :opt-un [:portkey.aws.lex-models.get-bot-versions-response/bots :portkey.aws.lex-models.get-bot-versions-response/nextToken] :locations {}))

(clojure.spec.alpha/def :portkey.aws.lex-models.get-bot-request/name (clojure.spec.alpha/and :portkey.aws.lex-models/bot-name))
(clojure.spec.alpha/def :portkey.aws.lex-models.get-bot-request/version-or-alias (clojure.spec.alpha/and :portkey.aws.lex-models/string))
(clojure.spec.alpha/def :portkey.aws.lex-models/get-bot-request (portkey.aws/json-keys :req-un [:portkey.aws.lex-models.get-bot-request/name :portkey.aws.lex-models.get-bot-request/versionOrAlias] :opt-un [] :locations {}))

(clojure.spec.alpha/def :portkey.aws.lex-models.get-bot-aliases-request/bot-name (clojure.spec.alpha/and :portkey.aws.lex-models/bot-name))
(clojure.spec.alpha/def :portkey.aws.lex-models.get-bot-aliases-request/next-token (clojure.spec.alpha/and :portkey.aws.lex-models/next-token))
(clojure.spec.alpha/def :portkey.aws.lex-models.get-bot-aliases-request/max-results (clojure.spec.alpha/and :portkey.aws.lex-models/max-results))
(clojure.spec.alpha/def :portkey.aws.lex-models.get-bot-aliases-request/name-contains (clojure.spec.alpha/and :portkey.aws.lex-models/alias-name))
(clojure.spec.alpha/def :portkey.aws.lex-models/get-bot-aliases-request (portkey.aws/json-keys :req-un [:portkey.aws.lex-models.get-bot-aliases-request/botName] :opt-un [:portkey.aws.lex-models.get-bot-aliases-request/nextToken :portkey.aws.lex-models.get-bot-aliases-request/maxResults :portkey.aws.lex-models.get-bot-aliases-request/nameContains] :locations {}))

(clojure.spec.alpha/def :portkey.aws.lex-models/bot-metadata-list (clojure.spec.alpha/and (clojure.spec.alpha/coll-of :portkey.aws.lex-models/bot-metadata) (clojure.spec.alpha/conformer clojure.core/identity (fn* [p1__30551__30552__auto__] (if (clojure.core/sequential? p1__30551__30552__auto__) p1__30551__30552__auto__ [p1__30551__30552__auto__])))))

(clojure.spec.alpha/def :portkey.aws.lex-models.bot-channel-association/bot-alias (clojure.spec.alpha/and :portkey.aws.lex-models/alias-name))
(clojure.spec.alpha/def :portkey.aws.lex-models.bot-channel-association/created-date (clojure.spec.alpha/and :portkey.aws.lex-models/timestamp))
(clojure.spec.alpha/def :portkey.aws.lex-models.bot-channel-association/name (clojure.spec.alpha/and :portkey.aws.lex-models/bot-channel-name))
(clojure.spec.alpha/def :portkey.aws.lex-models.bot-channel-association/status (clojure.spec.alpha/and :portkey.aws.lex-models/channel-status))
(clojure.spec.alpha/def :portkey.aws.lex-models.bot-channel-association/bot-configuration (clojure.spec.alpha/and :portkey.aws.lex-models/channel-configuration-map))
(clojure.spec.alpha/def :portkey.aws.lex-models.bot-channel-association/bot-name (clojure.spec.alpha/and :portkey.aws.lex-models/bot-name))
(clojure.spec.alpha/def :portkey.aws.lex-models.bot-channel-association/type (clojure.spec.alpha/and :portkey.aws.lex-models/channel-type))
(clojure.spec.alpha/def :portkey.aws.lex-models.bot-channel-association/failure-reason (clojure.spec.alpha/and :portkey.aws.lex-models/string))
(clojure.spec.alpha/def :portkey.aws.lex-models.bot-channel-association/description (clojure.spec.alpha/and :portkey.aws.lex-models/description))
(clojure.spec.alpha/def :portkey.aws.lex-models/bot-channel-association (portkey.aws/json-keys :req-un [] :opt-un [:portkey.aws.lex-models.bot-channel-association/botAlias :portkey.aws.lex-models.bot-channel-association/createdDate :portkey.aws.lex-models.bot-channel-association/name :portkey.aws.lex-models.bot-channel-association/status :portkey.aws.lex-models.bot-channel-association/botConfiguration :portkey.aws.lex-models.bot-channel-association/botName :portkey.aws.lex-models.bot-channel-association/type :portkey.aws.lex-models.bot-channel-association/failureReason :portkey.aws.lex-models.bot-channel-association/description] :locations {}))

(clojure.spec.alpha/def :portkey.aws.lex-models.get-import-request/import-id (clojure.spec.alpha/and :portkey.aws.lex-models/string))
(clojure.spec.alpha/def :portkey.aws.lex-models/get-import-request (portkey.aws/json-keys :req-un [:portkey.aws.lex-models.get-import-request/importId] :opt-un [] :locations {}))

(clojure.spec.alpha/def :portkey.aws.lex-models/bot-channel-name (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__30632__auto__] (clojure.core/<= 1 (clojure.core/count s__30632__auto__))) (clojure.core/fn [s__30633__auto__] (clojure.core/< (clojure.core/count s__30633__auto__) 100)) (clojure.core/fn [s__30634__auto__] (clojure.core/re-matches #"^([A-Za-z]_?)+$" s__30634__auto__))))

(clojure.spec.alpha/def :portkey.aws.lex-models.builtin-slot-type-metadata/signature (clojure.spec.alpha/and :portkey.aws.lex-models/builtin-slot-type-signature))
(clojure.spec.alpha/def :portkey.aws.lex-models.builtin-slot-type-metadata/supported-locales (clojure.spec.alpha/and :portkey.aws.lex-models/locale-list))
(clojure.spec.alpha/def :portkey.aws.lex-models/builtin-slot-type-metadata (portkey.aws/json-keys :req-un [] :opt-un [:portkey.aws.lex-models.builtin-slot-type-metadata/signature :portkey.aws.lex-models.builtin-slot-type-metadata/supportedLocales] :locations {}))

(clojure.spec.alpha/def :portkey.aws.lex-models.get-bot-alias-request/name (clojure.spec.alpha/and :portkey.aws.lex-models/alias-name))
(clojure.spec.alpha/def :portkey.aws.lex-models.get-bot-alias-request/bot-name (clojure.spec.alpha/and :portkey.aws.lex-models/bot-name))
(clojure.spec.alpha/def :portkey.aws.lex-models/get-bot-alias-request (portkey.aws/json-keys :req-un [:portkey.aws.lex-models.get-bot-alias-request/name :portkey.aws.lex-models.get-bot-alias-request/botName] :opt-un [] :locations {}))

(clojure.spec.alpha/def :portkey.aws.lex-models/process-behavior (clojure.spec.alpha/conformer (clojure.core/let [m__30630__auto__ {"SAVE" "SAVE", :save "SAVE", "BUILD" "BUILD", :build "BUILD"}] (clojure.core/fn [s__30631__auto__] (m__30630__auto__ s__30631__auto__ :clojure.spec.alpha/invalid))) (clojure.core/comp clojure.core/keyword portkey.aws/dashed)))

(clojure.spec.alpha/def :portkey.aws.lex-models/synonym-list (clojure.spec.alpha/and (clojure.spec.alpha/coll-of :portkey.aws.lex-models/value) (clojure.spec.alpha/conformer clojure.core/identity (fn* [p1__30551__30552__auto__] (if (clojure.core/sequential? p1__30551__30552__auto__) p1__30551__30552__auto__ [p1__30551__30552__auto__])))))

(clojure.spec.alpha/def :portkey.aws.lex-models.get-builtin-intents-response/intents (clojure.spec.alpha/and :portkey.aws.lex-models/builtin-intent-metadata-list))
(clojure.spec.alpha/def :portkey.aws.lex-models.get-builtin-intents-response/next-token (clojure.spec.alpha/and :portkey.aws.lex-models/next-token))
(clojure.spec.alpha/def :portkey.aws.lex-models/get-builtin-intents-response (portkey.aws/json-keys :req-un [] :opt-un [:portkey.aws.lex-models.get-builtin-intents-response/intents :portkey.aws.lex-models.get-builtin-intents-response/nextToken] :locations {}))

(clojure.spec.alpha/def :portkey.aws.lex-models.get-slot-types-response/slot-types (clojure.spec.alpha/and :portkey.aws.lex-models/slot-type-metadata-list))
(clojure.spec.alpha/def :portkey.aws.lex-models.get-slot-types-response/next-token (clojure.spec.alpha/and :portkey.aws.lex-models/next-token))
(clojure.spec.alpha/def :portkey.aws.lex-models/get-slot-types-response (portkey.aws/json-keys :req-un [] :opt-un [:portkey.aws.lex-models.get-slot-types-response/slotTypes :portkey.aws.lex-models.get-slot-types-response/nextToken] :locations {}))

(clojure.spec.alpha/def :portkey.aws.lex-models/lists-of-utterances (clojure.spec.alpha/and (clojure.spec.alpha/coll-of :portkey.aws.lex-models/utterance-list) (clojure.spec.alpha/conformer clojure.core/identity (fn* [p1__30551__30552__auto__] (if (clojure.core/sequential? p1__30551__30552__auto__) p1__30551__30552__auto__ [p1__30551__30552__auto__])))))

(clojure.spec.alpha/def :portkey.aws.lex-models.intent/intent-name (clojure.spec.alpha/and :portkey.aws.lex-models/intent-name))
(clojure.spec.alpha/def :portkey.aws.lex-models.intent/intent-version (clojure.spec.alpha/and :portkey.aws.lex-models/version))
(clojure.spec.alpha/def :portkey.aws.lex-models/intent (portkey.aws/json-keys :req-un [:portkey.aws.lex-models.intent/intentName :portkey.aws.lex-models.intent/intentVersion] :opt-un [] :locations {}))

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
(clojure.spec.alpha/def :portkey.aws.lex-models/create-intent-version-response (portkey.aws/json-keys :req-un [] :opt-un [:portkey.aws.lex-models.create-intent-version-response/followUpPrompt :portkey.aws.lex-models.create-intent-version-response/fulfillmentActivity :portkey.aws.lex-models.create-intent-version-response/slots :portkey.aws.lex-models.create-intent-version-response/parentIntentSignature :portkey.aws.lex-models.create-intent-version-response/confirmationPrompt :portkey.aws.lex-models.create-intent-version-response/createdDate :portkey.aws.lex-models.create-intent-version-response/name :portkey.aws.lex-models.create-intent-version-response/rejectionStatement :portkey.aws.lex-models.create-intent-version-response/lastUpdatedDate :portkey.aws.lex-models.create-intent-version-response/dialogCodeHook :portkey.aws.lex-models.create-intent-version-response/conclusionStatement :portkey.aws.lex-models.create-intent-version-response/sampleUtterances :portkey.aws.lex-models.create-intent-version-response/version :portkey.aws.lex-models.create-intent-version-response/checksum :portkey.aws.lex-models.create-intent-version-response/description] :locations {}))

(clojure.spec.alpha/def :portkey.aws.lex-models/channel-type (clojure.spec.alpha/conformer (clojure.core/let [m__30630__auto__ {"Facebook" "Facebook", :facebook "Facebook", "Slack" "Slack", :slack "Slack", "Twilio-Sms" "Twilio-Sms", :twilio-sms "Twilio-Sms", "Kik" "Kik", :kik "Kik"}] (clojure.core/fn [s__30631__auto__] (m__30630__auto__ s__30631__auto__ :clojure.spec.alpha/invalid))) (clojure.core/comp clojure.core/keyword portkey.aws/dashed)))

(clojure.spec.alpha/def :portkey.aws.lex-models.get-utterances-view-request/bot-name (clojure.spec.alpha/and :portkey.aws.lex-models/bot-name))
(clojure.spec.alpha/def :portkey.aws.lex-models.get-utterances-view-request/bot-versions (clojure.spec.alpha/and :portkey.aws.lex-models/bot-versions))
(clojure.spec.alpha/def :portkey.aws.lex-models.get-utterances-view-request/status-type (clojure.spec.alpha/and :portkey.aws.lex-models/status-type))
(clojure.spec.alpha/def :portkey.aws.lex-models/get-utterances-view-request (portkey.aws/json-keys :req-un [:portkey.aws.lex-models.get-utterances-view-request/botName :portkey.aws.lex-models.get-utterances-view-request/botVersions :portkey.aws.lex-models.get-utterances-view-request/statusType] :opt-un [] :locations {}))

(clojure.spec.alpha/def :portkey.aws.lex-models/boolean clojure.core/boolean?)

(clojure.core/defn delete-bot-channel-association ([delete-bot-channel-association-request] (portkey.aws/-rest-json-call portkey.aws.lex-models/endpoints "DELETE" "/bots/{botName}/aliases/{aliasName}/channels/{name}" delete-bot-channel-association-request :portkey.aws.lex-models/delete-bot-channel-association-request {:payload nil, :move {}, :headers {}, :uri {"name" "name", "botName" "botName", "aliasName" "botAlias"}, :querystring {}} 204 nil {"NotFoundException" :portkey.aws.lex-models/not-found-exception, "ConflictException" :portkey.aws.lex-models/conflict-exception, "LimitExceededException" :portkey.aws.lex-models/limit-exceeded-exception, "InternalFailureException" :portkey.aws.lex-models/internal-failure-exception, "BadRequestException" :portkey.aws.lex-models/bad-request-exception})))
(clojure.spec.alpha/fdef delete-bot-channel-association :args (clojure.spec.alpha/tuple :portkey.aws.lex-models/delete-bot-channel-association-request) :ret clojure.core/true?)

(clojure.core/defn get-builtin-slot-types ([] (get-builtin-slot-types {})) ([get-builtin-slot-types-request] (portkey.aws/-rest-json-call portkey.aws.lex-models/endpoints "GET" "/builtins/slottypes/" get-builtin-slot-types-request :portkey.aws.lex-models/get-builtin-slot-types-request {:payload nil, :move {}, :headers {}, :uri {}, :querystring {"locale" "locale", "signatureContains" "signatureContains", "nextToken" "nextToken", "maxResults" "maxResults"}} 200 :portkey.aws.lex-models/get-builtin-slot-types-response {"LimitExceededException" :portkey.aws.lex-models/limit-exceeded-exception, "InternalFailureException" :portkey.aws.lex-models/internal-failure-exception, "BadRequestException" :portkey.aws.lex-models/bad-request-exception})))
(clojure.spec.alpha/fdef get-builtin-slot-types :args (clojure.spec.alpha/? :portkey.aws.lex-models/get-builtin-slot-types-request) :ret (clojure.spec.alpha/and :portkey.aws.lex-models/get-builtin-slot-types-response))

(clojure.core/defn get-bot-channel-associations ([get-bot-channel-associations-request] (portkey.aws/-rest-json-call portkey.aws.lex-models/endpoints "GET" "/bots/{botName}/aliases/{aliasName}/channels/" get-bot-channel-associations-request :portkey.aws.lex-models/get-bot-channel-associations-request {:payload nil, :move {}, :headers {}, :uri {"botName" "botName", "aliasName" "botAlias"}, :querystring {"nextToken" "nextToken", "maxResults" "maxResults", "nameContains" "nameContains"}} 200 :portkey.aws.lex-models/get-bot-channel-associations-response {"LimitExceededException" :portkey.aws.lex-models/limit-exceeded-exception, "InternalFailureException" :portkey.aws.lex-models/internal-failure-exception, "BadRequestException" :portkey.aws.lex-models/bad-request-exception})))
(clojure.spec.alpha/fdef get-bot-channel-associations :args (clojure.spec.alpha/tuple :portkey.aws.lex-models/get-bot-channel-associations-request) :ret (clojure.spec.alpha/and :portkey.aws.lex-models/get-bot-channel-associations-response))

(clojure.core/defn create-slot-type-version ([create-slot-type-version-request] (portkey.aws/-rest-json-call portkey.aws.lex-models/endpoints "POST" "/slottypes/{name}/versions" create-slot-type-version-request :portkey.aws.lex-models/create-slot-type-version-request {:payload nil, :move {}, :headers {}, :uri {"name" "name"}, :querystring {}} 201 :portkey.aws.lex-models/create-slot-type-version-response {"NotFoundException" :portkey.aws.lex-models/not-found-exception, "ConflictException" :portkey.aws.lex-models/conflict-exception, "LimitExceededException" :portkey.aws.lex-models/limit-exceeded-exception, "InternalFailureException" :portkey.aws.lex-models/internal-failure-exception, "BadRequestException" :portkey.aws.lex-models/bad-request-exception, "PreconditionFailedException" :portkey.aws.lex-models/precondition-failed-exception})))
(clojure.spec.alpha/fdef create-slot-type-version :args (clojure.spec.alpha/tuple :portkey.aws.lex-models/create-slot-type-version-request) :ret (clojure.spec.alpha/and :portkey.aws.lex-models/create-slot-type-version-response))

(clojure.core/defn get-import ([get-import-request] (portkey.aws/-rest-json-call portkey.aws.lex-models/endpoints "GET" "/imports/{importId}" get-import-request :portkey.aws.lex-models/get-import-request {:payload nil, :move {}, :headers {}, :uri {"importId" "importId"}, :querystring {}} 200 :portkey.aws.lex-models/get-import-response {"NotFoundException" :portkey.aws.lex-models/not-found-exception, "LimitExceededException" :portkey.aws.lex-models/limit-exceeded-exception, "InternalFailureException" :portkey.aws.lex-models/internal-failure-exception, "BadRequestException" :portkey.aws.lex-models/bad-request-exception})))
(clojure.spec.alpha/fdef get-import :args (clojure.spec.alpha/tuple :portkey.aws.lex-models/get-import-request) :ret (clojure.spec.alpha/and :portkey.aws.lex-models/get-import-response))

(clojure.core/defn get-slot-type ([get-slot-type-request] (portkey.aws/-rest-json-call portkey.aws.lex-models/endpoints "GET" "/slottypes/{name}/versions/{version}" get-slot-type-request :portkey.aws.lex-models/get-slot-type-request {:payload nil, :move {}, :headers {}, :uri {"name" "name", "version" "version"}, :querystring {}} 200 :portkey.aws.lex-models/get-slot-type-response {"NotFoundException" :portkey.aws.lex-models/not-found-exception, "LimitExceededException" :portkey.aws.lex-models/limit-exceeded-exception, "InternalFailureException" :portkey.aws.lex-models/internal-failure-exception, "BadRequestException" :portkey.aws.lex-models/bad-request-exception})))
(clojure.spec.alpha/fdef get-slot-type :args (clojure.spec.alpha/tuple :portkey.aws.lex-models/get-slot-type-request) :ret (clojure.spec.alpha/and :portkey.aws.lex-models/get-slot-type-response))

(clojure.core/defn get-intent-versions ([get-intent-versions-request] (portkey.aws/-rest-json-call portkey.aws.lex-models/endpoints "GET" "/intents/{name}/versions/" get-intent-versions-request :portkey.aws.lex-models/get-intent-versions-request {:payload nil, :move {}, :headers {}, :uri {"name" "name"}, :querystring {"nextToken" "nextToken", "maxResults" "maxResults"}} 200 :portkey.aws.lex-models/get-intent-versions-response {"NotFoundException" :portkey.aws.lex-models/not-found-exception, "LimitExceededException" :portkey.aws.lex-models/limit-exceeded-exception, "InternalFailureException" :portkey.aws.lex-models/internal-failure-exception, "BadRequestException" :portkey.aws.lex-models/bad-request-exception})))
(clojure.spec.alpha/fdef get-intent-versions :args (clojure.spec.alpha/tuple :portkey.aws.lex-models/get-intent-versions-request) :ret (clojure.spec.alpha/and :portkey.aws.lex-models/get-intent-versions-response))

(clojure.core/defn get-utterances-view ([get-utterances-view-request] (portkey.aws/-rest-json-call portkey.aws.lex-models/endpoints "GET" "/bots/{botname}/utterances?view=aggregation" get-utterances-view-request :portkey.aws.lex-models/get-utterances-view-request {:payload nil, :move {}, :headers {}, :uri {"botname" "botName"}, :querystring {"bot_versions" "botVersions", "status_type" "statusType"}} 200 :portkey.aws.lex-models/get-utterances-view-response {"LimitExceededException" :portkey.aws.lex-models/limit-exceeded-exception, "InternalFailureException" :portkey.aws.lex-models/internal-failure-exception, "BadRequestException" :portkey.aws.lex-models/bad-request-exception})))
(clojure.spec.alpha/fdef get-utterances-view :args (clojure.spec.alpha/tuple :portkey.aws.lex-models/get-utterances-view-request) :ret (clojure.spec.alpha/and :portkey.aws.lex-models/get-utterances-view-response))

(clojure.core/defn delete-intent-version ([delete-intent-version-request] (portkey.aws/-rest-json-call portkey.aws.lex-models/endpoints "DELETE" "/intents/{name}/versions/{version}" delete-intent-version-request :portkey.aws.lex-models/delete-intent-version-request {:payload nil, :move {}, :headers {}, :uri {"name" "name", "version" "version"}, :querystring {}} 204 nil {"NotFoundException" :portkey.aws.lex-models/not-found-exception, "ConflictException" :portkey.aws.lex-models/conflict-exception, "LimitExceededException" :portkey.aws.lex-models/limit-exceeded-exception, "InternalFailureException" :portkey.aws.lex-models/internal-failure-exception, "BadRequestException" :portkey.aws.lex-models/bad-request-exception, "ResourceInUseException" :portkey.aws.lex-models/resource-in-use-exception})))
(clojure.spec.alpha/fdef delete-intent-version :args (clojure.spec.alpha/tuple :portkey.aws.lex-models/delete-intent-version-request) :ret clojure.core/true?)

(clojure.core/defn get-builtin-intents ([] (get-builtin-intents {})) ([get-builtin-intents-request] (portkey.aws/-rest-json-call portkey.aws.lex-models/endpoints "GET" "/builtins/intents/" get-builtin-intents-request :portkey.aws.lex-models/get-builtin-intents-request {:payload nil, :move {}, :headers {}, :uri {}, :querystring {"locale" "locale", "signatureContains" "signatureContains", "nextToken" "nextToken", "maxResults" "maxResults"}} 200 :portkey.aws.lex-models/get-builtin-intents-response {"LimitExceededException" :portkey.aws.lex-models/limit-exceeded-exception, "InternalFailureException" :portkey.aws.lex-models/internal-failure-exception, "BadRequestException" :portkey.aws.lex-models/bad-request-exception})))
(clojure.spec.alpha/fdef get-builtin-intents :args (clojure.spec.alpha/? :portkey.aws.lex-models/get-builtin-intents-request) :ret (clojure.spec.alpha/and :portkey.aws.lex-models/get-builtin-intents-response))

(clojure.core/defn get-slot-types ([] (get-slot-types {})) ([get-slot-types-request] (portkey.aws/-rest-json-call portkey.aws.lex-models/endpoints "GET" "/slottypes/" get-slot-types-request :portkey.aws.lex-models/get-slot-types-request {:payload nil, :move {}, :headers {}, :uri {}, :querystring {"nextToken" "nextToken", "maxResults" "maxResults", "nameContains" "nameContains"}} 200 :portkey.aws.lex-models/get-slot-types-response {"NotFoundException" :portkey.aws.lex-models/not-found-exception, "LimitExceededException" :portkey.aws.lex-models/limit-exceeded-exception, "InternalFailureException" :portkey.aws.lex-models/internal-failure-exception, "BadRequestException" :portkey.aws.lex-models/bad-request-exception})))
(clojure.spec.alpha/fdef get-slot-types :args (clojure.spec.alpha/? :portkey.aws.lex-models/get-slot-types-request) :ret (clojure.spec.alpha/and :portkey.aws.lex-models/get-slot-types-response))

(clojure.core/defn get-bot-alias ([get-bot-alias-request] (portkey.aws/-rest-json-call portkey.aws.lex-models/endpoints "GET" "/bots/{botName}/aliases/{name}" get-bot-alias-request :portkey.aws.lex-models/get-bot-alias-request {:payload nil, :move {}, :headers {}, :uri {"name" "name", "botName" "botName"}, :querystring {}} 200 :portkey.aws.lex-models/get-bot-alias-response {"NotFoundException" :portkey.aws.lex-models/not-found-exception, "LimitExceededException" :portkey.aws.lex-models/limit-exceeded-exception, "InternalFailureException" :portkey.aws.lex-models/internal-failure-exception, "BadRequestException" :portkey.aws.lex-models/bad-request-exception})))
(clojure.spec.alpha/fdef get-bot-alias :args (clojure.spec.alpha/tuple :portkey.aws.lex-models/get-bot-alias-request) :ret (clojure.spec.alpha/and :portkey.aws.lex-models/get-bot-alias-response))

(clojure.core/defn get-export ([get-export-request] (portkey.aws/-rest-json-call portkey.aws.lex-models/endpoints "GET" "/exports/" get-export-request :portkey.aws.lex-models/get-export-request {:payload nil, :move {}, :headers {}, :uri {}, :querystring {"name" "name", "version" "version", "resourceType" "resourceType", "exportType" "exportType"}} 200 :portkey.aws.lex-models/get-export-response {"NotFoundException" :portkey.aws.lex-models/not-found-exception, "LimitExceededException" :portkey.aws.lex-models/limit-exceeded-exception, "InternalFailureException" :portkey.aws.lex-models/internal-failure-exception, "BadRequestException" :portkey.aws.lex-models/bad-request-exception})))
(clojure.spec.alpha/fdef get-export :args (clojure.spec.alpha/tuple :portkey.aws.lex-models/get-export-request) :ret (clojure.spec.alpha/and :portkey.aws.lex-models/get-export-response))

(clojure.core/defn start-import ([start-import-request] (portkey.aws/-rest-json-call portkey.aws.lex-models/endpoints "POST" "/imports/" start-import-request :portkey.aws.lex-models/start-import-request {:payload nil, :move {}, :headers {}, :uri {}, :querystring {}} 201 :portkey.aws.lex-models/start-import-response {"LimitExceededException" :portkey.aws.lex-models/limit-exceeded-exception, "InternalFailureException" :portkey.aws.lex-models/internal-failure-exception, "BadRequestException" :portkey.aws.lex-models/bad-request-exception})))
(clojure.spec.alpha/fdef start-import :args (clojure.spec.alpha/tuple :portkey.aws.lex-models/start-import-request) :ret (clojure.spec.alpha/and :portkey.aws.lex-models/start-import-response))

(clojure.core/defn get-builtin-intent ([get-builtin-intent-request] (portkey.aws/-rest-json-call portkey.aws.lex-models/endpoints "GET" "/builtins/intents/{signature}" get-builtin-intent-request :portkey.aws.lex-models/get-builtin-intent-request {:payload nil, :move {}, :headers {}, :uri {"signature" "signature"}, :querystring {}} 200 :portkey.aws.lex-models/get-builtin-intent-response {"NotFoundException" :portkey.aws.lex-models/not-found-exception, "LimitExceededException" :portkey.aws.lex-models/limit-exceeded-exception, "InternalFailureException" :portkey.aws.lex-models/internal-failure-exception, "BadRequestException" :portkey.aws.lex-models/bad-request-exception})))
(clojure.spec.alpha/fdef get-builtin-intent :args (clojure.spec.alpha/tuple :portkey.aws.lex-models/get-builtin-intent-request) :ret (clojure.spec.alpha/and :portkey.aws.lex-models/get-builtin-intent-response))

(clojure.core/defn delete-slot-type ([delete-slot-type-request] (portkey.aws/-rest-json-call portkey.aws.lex-models/endpoints "DELETE" "/slottypes/{name}" delete-slot-type-request :portkey.aws.lex-models/delete-slot-type-request {:payload nil, :move {}, :headers {}, :uri {"name" "name"}, :querystring {}} 204 nil {"NotFoundException" :portkey.aws.lex-models/not-found-exception, "ConflictException" :portkey.aws.lex-models/conflict-exception, "LimitExceededException" :portkey.aws.lex-models/limit-exceeded-exception, "InternalFailureException" :portkey.aws.lex-models/internal-failure-exception, "BadRequestException" :portkey.aws.lex-models/bad-request-exception, "ResourceInUseException" :portkey.aws.lex-models/resource-in-use-exception})))
(clojure.spec.alpha/fdef delete-slot-type :args (clojure.spec.alpha/tuple :portkey.aws.lex-models/delete-slot-type-request) :ret clojure.core/true?)

(clojure.core/defn create-bot-version ([create-bot-version-request] (portkey.aws/-rest-json-call portkey.aws.lex-models/endpoints "POST" "/bots/{name}/versions" create-bot-version-request :portkey.aws.lex-models/create-bot-version-request {:payload nil, :move {}, :headers {}, :uri {"name" "name"}, :querystring {}} 201 :portkey.aws.lex-models/create-bot-version-response {"NotFoundException" :portkey.aws.lex-models/not-found-exception, "ConflictException" :portkey.aws.lex-models/conflict-exception, "LimitExceededException" :portkey.aws.lex-models/limit-exceeded-exception, "InternalFailureException" :portkey.aws.lex-models/internal-failure-exception, "BadRequestException" :portkey.aws.lex-models/bad-request-exception, "PreconditionFailedException" :portkey.aws.lex-models/precondition-failed-exception})))
(clojure.spec.alpha/fdef create-bot-version :args (clojure.spec.alpha/tuple :portkey.aws.lex-models/create-bot-version-request) :ret (clojure.spec.alpha/and :portkey.aws.lex-models/create-bot-version-response))

(clojure.core/defn put-intent ([put-intent-request] (portkey.aws/-rest-json-call portkey.aws.lex-models/endpoints "PUT" "/intents/{name}/versions/$LATEST" put-intent-request :portkey.aws.lex-models/put-intent-request {:payload nil, :move {}, :headers {}, :uri {"name" "name"}, :querystring {}} 200 :portkey.aws.lex-models/put-intent-response {"ConflictException" :portkey.aws.lex-models/conflict-exception, "LimitExceededException" :portkey.aws.lex-models/limit-exceeded-exception, "InternalFailureException" :portkey.aws.lex-models/internal-failure-exception, "BadRequestException" :portkey.aws.lex-models/bad-request-exception, "PreconditionFailedException" :portkey.aws.lex-models/precondition-failed-exception})))
(clojure.spec.alpha/fdef put-intent :args (clojure.spec.alpha/tuple :portkey.aws.lex-models/put-intent-request) :ret (clojure.spec.alpha/and :portkey.aws.lex-models/put-intent-response))

(clojure.core/defn delete-intent ([delete-intent-request] (portkey.aws/-rest-json-call portkey.aws.lex-models/endpoints "DELETE" "/intents/{name}" delete-intent-request :portkey.aws.lex-models/delete-intent-request {:payload nil, :move {}, :headers {}, :uri {"name" "name"}, :querystring {}} 204 nil {"NotFoundException" :portkey.aws.lex-models/not-found-exception, "ConflictException" :portkey.aws.lex-models/conflict-exception, "LimitExceededException" :portkey.aws.lex-models/limit-exceeded-exception, "InternalFailureException" :portkey.aws.lex-models/internal-failure-exception, "BadRequestException" :portkey.aws.lex-models/bad-request-exception, "ResourceInUseException" :portkey.aws.lex-models/resource-in-use-exception})))
(clojure.spec.alpha/fdef delete-intent :args (clojure.spec.alpha/tuple :portkey.aws.lex-models/delete-intent-request) :ret clojure.core/true?)

(clojure.core/defn get-intents ([] (get-intents {})) ([get-intents-request] (portkey.aws/-rest-json-call portkey.aws.lex-models/endpoints "GET" "/intents/" get-intents-request :portkey.aws.lex-models/get-intents-request {:payload nil, :move {}, :headers {}, :uri {}, :querystring {"nextToken" "nextToken", "maxResults" "maxResults", "nameContains" "nameContains"}} 200 :portkey.aws.lex-models/get-intents-response {"NotFoundException" :portkey.aws.lex-models/not-found-exception, "LimitExceededException" :portkey.aws.lex-models/limit-exceeded-exception, "InternalFailureException" :portkey.aws.lex-models/internal-failure-exception, "BadRequestException" :portkey.aws.lex-models/bad-request-exception})))
(clojure.spec.alpha/fdef get-intents :args (clojure.spec.alpha/? :portkey.aws.lex-models/get-intents-request) :ret (clojure.spec.alpha/and :portkey.aws.lex-models/get-intents-response))

(clojure.core/defn delete-utterances ([delete-utterances-request] (portkey.aws/-rest-json-call portkey.aws.lex-models/endpoints "DELETE" "/bots/{botName}/utterances/{userId}" delete-utterances-request :portkey.aws.lex-models/delete-utterances-request {:payload nil, :move {}, :headers {}, :uri {"botName" "botName", "userId" "userId"}, :querystring {}} 204 nil {"NotFoundException" :portkey.aws.lex-models/not-found-exception, "LimitExceededException" :portkey.aws.lex-models/limit-exceeded-exception, "InternalFailureException" :portkey.aws.lex-models/internal-failure-exception, "BadRequestException" :portkey.aws.lex-models/bad-request-exception})))
(clojure.spec.alpha/fdef delete-utterances :args (clojure.spec.alpha/tuple :portkey.aws.lex-models/delete-utterances-request) :ret clojure.core/true?)

(clojure.core/defn get-intent ([get-intent-request] (portkey.aws/-rest-json-call portkey.aws.lex-models/endpoints "GET" "/intents/{name}/versions/{version}" get-intent-request :portkey.aws.lex-models/get-intent-request {:payload nil, :move {}, :headers {}, :uri {"name" "name", "version" "version"}, :querystring {}} 200 :portkey.aws.lex-models/get-intent-response {"NotFoundException" :portkey.aws.lex-models/not-found-exception, "LimitExceededException" :portkey.aws.lex-models/limit-exceeded-exception, "InternalFailureException" :portkey.aws.lex-models/internal-failure-exception, "BadRequestException" :portkey.aws.lex-models/bad-request-exception})))
(clojure.spec.alpha/fdef get-intent :args (clojure.spec.alpha/tuple :portkey.aws.lex-models/get-intent-request) :ret (clojure.spec.alpha/and :portkey.aws.lex-models/get-intent-response))

(clojure.core/defn create-intent-version ([create-intent-version-request] (portkey.aws/-rest-json-call portkey.aws.lex-models/endpoints "POST" "/intents/{name}/versions" create-intent-version-request :portkey.aws.lex-models/create-intent-version-request {:payload nil, :move {}, :headers {}, :uri {"name" "name"}, :querystring {}} 201 :portkey.aws.lex-models/create-intent-version-response {"NotFoundException" :portkey.aws.lex-models/not-found-exception, "ConflictException" :portkey.aws.lex-models/conflict-exception, "LimitExceededException" :portkey.aws.lex-models/limit-exceeded-exception, "InternalFailureException" :portkey.aws.lex-models/internal-failure-exception, "BadRequestException" :portkey.aws.lex-models/bad-request-exception, "PreconditionFailedException" :portkey.aws.lex-models/precondition-failed-exception})))
(clojure.spec.alpha/fdef create-intent-version :args (clojure.spec.alpha/tuple :portkey.aws.lex-models/create-intent-version-request) :ret (clojure.spec.alpha/and :portkey.aws.lex-models/create-intent-version-response))

(clojure.core/defn get-bot-channel-association ([get-bot-channel-association-request] (portkey.aws/-rest-json-call portkey.aws.lex-models/endpoints "GET" "/bots/{botName}/aliases/{aliasName}/channels/{name}" get-bot-channel-association-request :portkey.aws.lex-models/get-bot-channel-association-request {:payload nil, :move {}, :headers {}, :uri {"name" "name", "botName" "botName", "aliasName" "botAlias"}, :querystring {}} 200 :portkey.aws.lex-models/get-bot-channel-association-response {"NotFoundException" :portkey.aws.lex-models/not-found-exception, "LimitExceededException" :portkey.aws.lex-models/limit-exceeded-exception, "InternalFailureException" :portkey.aws.lex-models/internal-failure-exception, "BadRequestException" :portkey.aws.lex-models/bad-request-exception})))
(clojure.spec.alpha/fdef get-bot-channel-association :args (clojure.spec.alpha/tuple :portkey.aws.lex-models/get-bot-channel-association-request) :ret (clojure.spec.alpha/and :portkey.aws.lex-models/get-bot-channel-association-response))

(clojure.core/defn put-slot-type ([put-slot-type-request] (portkey.aws/-rest-json-call portkey.aws.lex-models/endpoints "PUT" "/slottypes/{name}/versions/$LATEST" put-slot-type-request :portkey.aws.lex-models/put-slot-type-request {:payload nil, :move {}, :headers {}, :uri {"name" "name"}, :querystring {}} 200 :portkey.aws.lex-models/put-slot-type-response {"ConflictException" :portkey.aws.lex-models/conflict-exception, "LimitExceededException" :portkey.aws.lex-models/limit-exceeded-exception, "InternalFailureException" :portkey.aws.lex-models/internal-failure-exception, "BadRequestException" :portkey.aws.lex-models/bad-request-exception, "PreconditionFailedException" :portkey.aws.lex-models/precondition-failed-exception})))
(clojure.spec.alpha/fdef put-slot-type :args (clojure.spec.alpha/tuple :portkey.aws.lex-models/put-slot-type-request) :ret (clojure.spec.alpha/and :portkey.aws.lex-models/put-slot-type-response))

(clojure.core/defn get-slot-type-versions ([get-slot-type-versions-request] (portkey.aws/-rest-json-call portkey.aws.lex-models/endpoints "GET" "/slottypes/{name}/versions/" get-slot-type-versions-request :portkey.aws.lex-models/get-slot-type-versions-request {:payload nil, :move {}, :headers {}, :uri {"name" "name"}, :querystring {"nextToken" "nextToken", "maxResults" "maxResults"}} 200 :portkey.aws.lex-models/get-slot-type-versions-response {"NotFoundException" :portkey.aws.lex-models/not-found-exception, "LimitExceededException" :portkey.aws.lex-models/limit-exceeded-exception, "InternalFailureException" :portkey.aws.lex-models/internal-failure-exception, "BadRequestException" :portkey.aws.lex-models/bad-request-exception})))
(clojure.spec.alpha/fdef get-slot-type-versions :args (clojure.spec.alpha/tuple :portkey.aws.lex-models/get-slot-type-versions-request) :ret (clojure.spec.alpha/and :portkey.aws.lex-models/get-slot-type-versions-response))

(clojure.core/defn delete-bot-version ([delete-bot-version-request] (portkey.aws/-rest-json-call portkey.aws.lex-models/endpoints "DELETE" "/bots/{name}/versions/{version}" delete-bot-version-request :portkey.aws.lex-models/delete-bot-version-request {:payload nil, :move {}, :headers {}, :uri {"name" "name", "version" "version"}, :querystring {}} 204 nil {"NotFoundException" :portkey.aws.lex-models/not-found-exception, "ConflictException" :portkey.aws.lex-models/conflict-exception, "LimitExceededException" :portkey.aws.lex-models/limit-exceeded-exception, "InternalFailureException" :portkey.aws.lex-models/internal-failure-exception, "BadRequestException" :portkey.aws.lex-models/bad-request-exception, "ResourceInUseException" :portkey.aws.lex-models/resource-in-use-exception})))
(clojure.spec.alpha/fdef delete-bot-version :args (clojure.spec.alpha/tuple :portkey.aws.lex-models/delete-bot-version-request) :ret clojure.core/true?)

(clojure.core/defn get-bot-aliases ([get-bot-aliases-request] (portkey.aws/-rest-json-call portkey.aws.lex-models/endpoints "GET" "/bots/{botName}/aliases/" get-bot-aliases-request :portkey.aws.lex-models/get-bot-aliases-request {:payload nil, :move {}, :headers {}, :uri {"botName" "botName"}, :querystring {"nextToken" "nextToken", "maxResults" "maxResults", "nameContains" "nameContains"}} 200 :portkey.aws.lex-models/get-bot-aliases-response {"LimitExceededException" :portkey.aws.lex-models/limit-exceeded-exception, "InternalFailureException" :portkey.aws.lex-models/internal-failure-exception, "BadRequestException" :portkey.aws.lex-models/bad-request-exception})))
(clojure.spec.alpha/fdef get-bot-aliases :args (clojure.spec.alpha/tuple :portkey.aws.lex-models/get-bot-aliases-request) :ret (clojure.spec.alpha/and :portkey.aws.lex-models/get-bot-aliases-response))

(clojure.core/defn get-bot-versions ([get-bot-versions-request] (portkey.aws/-rest-json-call portkey.aws.lex-models/endpoints "GET" "/bots/{name}/versions/" get-bot-versions-request :portkey.aws.lex-models/get-bot-versions-request {:payload nil, :move {}, :headers {}, :uri {"name" "name"}, :querystring {"nextToken" "nextToken", "maxResults" "maxResults"}} 200 :portkey.aws.lex-models/get-bot-versions-response {"NotFoundException" :portkey.aws.lex-models/not-found-exception, "LimitExceededException" :portkey.aws.lex-models/limit-exceeded-exception, "InternalFailureException" :portkey.aws.lex-models/internal-failure-exception, "BadRequestException" :portkey.aws.lex-models/bad-request-exception})))
(clojure.spec.alpha/fdef get-bot-versions :args (clojure.spec.alpha/tuple :portkey.aws.lex-models/get-bot-versions-request) :ret (clojure.spec.alpha/and :portkey.aws.lex-models/get-bot-versions-response))

(clojure.core/defn put-bot-alias ([put-bot-alias-request] (portkey.aws/-rest-json-call portkey.aws.lex-models/endpoints "PUT" "/bots/{botName}/aliases/{name}" put-bot-alias-request :portkey.aws.lex-models/put-bot-alias-request {:payload nil, :move {}, :headers {}, :uri {"name" "name", "botName" "botName"}, :querystring {}} 200 :portkey.aws.lex-models/put-bot-alias-response {"ConflictException" :portkey.aws.lex-models/conflict-exception, "LimitExceededException" :portkey.aws.lex-models/limit-exceeded-exception, "InternalFailureException" :portkey.aws.lex-models/internal-failure-exception, "BadRequestException" :portkey.aws.lex-models/bad-request-exception, "PreconditionFailedException" :portkey.aws.lex-models/precondition-failed-exception})))
(clojure.spec.alpha/fdef put-bot-alias :args (clojure.spec.alpha/tuple :portkey.aws.lex-models/put-bot-alias-request) :ret (clojure.spec.alpha/and :portkey.aws.lex-models/put-bot-alias-response))

(clojure.core/defn get-bots ([] (get-bots {})) ([get-bots-request] (portkey.aws/-rest-json-call portkey.aws.lex-models/endpoints "GET" "/bots/" get-bots-request :portkey.aws.lex-models/get-bots-request {:payload nil, :move {}, :headers {}, :uri {}, :querystring {"nextToken" "nextToken", "maxResults" "maxResults", "nameContains" "nameContains"}} 200 :portkey.aws.lex-models/get-bots-response {"NotFoundException" :portkey.aws.lex-models/not-found-exception, "LimitExceededException" :portkey.aws.lex-models/limit-exceeded-exception, "InternalFailureException" :portkey.aws.lex-models/internal-failure-exception, "BadRequestException" :portkey.aws.lex-models/bad-request-exception})))
(clojure.spec.alpha/fdef get-bots :args (clojure.spec.alpha/? :portkey.aws.lex-models/get-bots-request) :ret (clojure.spec.alpha/and :portkey.aws.lex-models/get-bots-response))

(clojure.core/defn get-bot ([get-bot-request] (portkey.aws/-rest-json-call portkey.aws.lex-models/endpoints "GET" "/bots/{name}/versions/{versionoralias}" get-bot-request :portkey.aws.lex-models/get-bot-request {:payload nil, :move {}, :headers {}, :uri {"name" "name", "versionoralias" "versionOrAlias"}, :querystring {}} 200 :portkey.aws.lex-models/get-bot-response {"NotFoundException" :portkey.aws.lex-models/not-found-exception, "LimitExceededException" :portkey.aws.lex-models/limit-exceeded-exception, "InternalFailureException" :portkey.aws.lex-models/internal-failure-exception, "BadRequestException" :portkey.aws.lex-models/bad-request-exception})))
(clojure.spec.alpha/fdef get-bot :args (clojure.spec.alpha/tuple :portkey.aws.lex-models/get-bot-request) :ret (clojure.spec.alpha/and :portkey.aws.lex-models/get-bot-response))

(clojure.core/defn delete-slot-type-version ([delete-slot-type-version-request] (portkey.aws/-rest-json-call portkey.aws.lex-models/endpoints "DELETE" "/slottypes/{name}/version/{version}" delete-slot-type-version-request :portkey.aws.lex-models/delete-slot-type-version-request {:payload nil, :move {}, :headers {}, :uri {"name" "name", "version" "version"}, :querystring {}} 204 nil {"NotFoundException" :portkey.aws.lex-models/not-found-exception, "ConflictException" :portkey.aws.lex-models/conflict-exception, "LimitExceededException" :portkey.aws.lex-models/limit-exceeded-exception, "InternalFailureException" :portkey.aws.lex-models/internal-failure-exception, "BadRequestException" :portkey.aws.lex-models/bad-request-exception, "ResourceInUseException" :portkey.aws.lex-models/resource-in-use-exception})))
(clojure.spec.alpha/fdef delete-slot-type-version :args (clojure.spec.alpha/tuple :portkey.aws.lex-models/delete-slot-type-version-request) :ret clojure.core/true?)

(clojure.core/defn delete-bot ([delete-bot-request] (portkey.aws/-rest-json-call portkey.aws.lex-models/endpoints "DELETE" "/bots/{name}" delete-bot-request :portkey.aws.lex-models/delete-bot-request {:payload nil, :move {}, :headers {}, :uri {"name" "name"}, :querystring {}} 204 nil {"NotFoundException" :portkey.aws.lex-models/not-found-exception, "ConflictException" :portkey.aws.lex-models/conflict-exception, "LimitExceededException" :portkey.aws.lex-models/limit-exceeded-exception, "InternalFailureException" :portkey.aws.lex-models/internal-failure-exception, "BadRequestException" :portkey.aws.lex-models/bad-request-exception, "ResourceInUseException" :portkey.aws.lex-models/resource-in-use-exception})))
(clojure.spec.alpha/fdef delete-bot :args (clojure.spec.alpha/tuple :portkey.aws.lex-models/delete-bot-request) :ret clojure.core/true?)

(clojure.core/defn put-bot ([put-bot-request] (portkey.aws/-rest-json-call portkey.aws.lex-models/endpoints "PUT" "/bots/{name}/versions/$LATEST" put-bot-request :portkey.aws.lex-models/put-bot-request {:payload nil, :move {}, :headers {}, :uri {"name" "name"}, :querystring {}} 200 :portkey.aws.lex-models/put-bot-response {"ConflictException" :portkey.aws.lex-models/conflict-exception, "LimitExceededException" :portkey.aws.lex-models/limit-exceeded-exception, "InternalFailureException" :portkey.aws.lex-models/internal-failure-exception, "BadRequestException" :portkey.aws.lex-models/bad-request-exception, "PreconditionFailedException" :portkey.aws.lex-models/precondition-failed-exception})))
(clojure.spec.alpha/fdef put-bot :args (clojure.spec.alpha/tuple :portkey.aws.lex-models/put-bot-request) :ret (clojure.spec.alpha/and :portkey.aws.lex-models/put-bot-response))

(clojure.core/defn delete-bot-alias ([delete-bot-alias-request] (portkey.aws/-rest-json-call portkey.aws.lex-models/endpoints "DELETE" "/bots/{botName}/aliases/{name}" delete-bot-alias-request :portkey.aws.lex-models/delete-bot-alias-request {:payload nil, :move {}, :headers {}, :uri {"name" "name", "botName" "botName"}, :querystring {}} 204 nil {"NotFoundException" :portkey.aws.lex-models/not-found-exception, "ConflictException" :portkey.aws.lex-models/conflict-exception, "LimitExceededException" :portkey.aws.lex-models/limit-exceeded-exception, "InternalFailureException" :portkey.aws.lex-models/internal-failure-exception, "BadRequestException" :portkey.aws.lex-models/bad-request-exception, "ResourceInUseException" :portkey.aws.lex-models/resource-in-use-exception})))
(clojure.spec.alpha/fdef delete-bot-alias :args (clojure.spec.alpha/tuple :portkey.aws.lex-models/delete-bot-alias-request) :ret clojure.core/true?)
