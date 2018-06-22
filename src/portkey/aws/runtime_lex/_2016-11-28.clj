(ns portkey.aws.runtime-lex.-2016-11-28 (:require [portkey.aws]))

(def
 endpoints
 '{"eu-west-1"
   {:credential-scope {:service "lex", :region "eu-west-1"},
    :ssl-common-name "runtime.lex.eu-west-1.amazonaws.com",
    :endpoint "https://runtime.lex.eu-west-1.amazonaws.com",
    :signature-version :v4},
   "us-west-2"
   {:credential-scope {:service "lex", :region "us-west-2"},
    :ssl-common-name "runtime.lex.us-west-2.amazonaws.com",
    :endpoint "https://runtime.lex.us-west-2.amazonaws.com",
    :signature-version :v4},
   "us-east-1"
   {:credential-scope {:service "lex", :region "us-east-1"},
    :ssl-common-name "runtime.lex.us-east-1.amazonaws.com",
    :endpoint "https://runtime.lex.us-east-1.amazonaws.com",
    :signature-version :v4}})

(clojure.spec.alpha/def :portkey.aws.runtime-lex.-2016-11-28.unsupported-media-type-exception/message (clojure.spec.alpha/and :portkey.aws.runtime-lex.-2016-11-28/string))
(clojure.spec.alpha/def :portkey.aws.runtime-lex.-2016-11-28/unsupported-media-type-exception (portkey.aws/json-keys :req-un [] :opt-un [:portkey.aws.runtime-lex.-2016-11-28.unsupported-media-type-exception/message] :locations {}))

(clojure.spec.alpha/def :portkey.aws.runtime-lex.-2016-11-28/string-with-length (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__13768__auto__] (clojure.core/<= 1 (clojure.core/count s__13768__auto__))) (clojure.core/fn [s__13769__auto__] (clojure.core/< (clojure.core/count s__13769__auto__) 80))))

(clojure.spec.alpha/def :portkey.aws.runtime-lex.-2016-11-28/string-map (clojure.spec.alpha/map-of :portkey.aws.runtime-lex.-2016-11-28/string :portkey.aws.runtime-lex.-2016-11-28/string))

(clojure.spec.alpha/def :portkey.aws.runtime-lex.-2016-11-28.bad-request-exception/message (clojure.spec.alpha/and :portkey.aws.runtime-lex.-2016-11-28/string))
(clojure.spec.alpha/def :portkey.aws.runtime-lex.-2016-11-28/bad-request-exception (portkey.aws/json-keys :req-un [] :opt-un [:portkey.aws.runtime-lex.-2016-11-28.bad-request-exception/message] :locations {}))

(clojure.spec.alpha/def :portkey.aws.runtime-lex.-2016-11-28.button/text (clojure.spec.alpha/and :portkey.aws.runtime-lex.-2016-11-28/button-text-string-with-length))
(clojure.spec.alpha/def :portkey.aws.runtime-lex.-2016-11-28.button/value (clojure.spec.alpha/and :portkey.aws.runtime-lex.-2016-11-28/button-value-string-with-length))
(clojure.spec.alpha/def :portkey.aws.runtime-lex.-2016-11-28/button (portkey.aws/json-keys :req-un [:portkey.aws.runtime-lex.-2016-11-28.button/text :portkey.aws.runtime-lex.-2016-11-28.button/value] :opt-un [] :locations {}))

(clojure.spec.alpha/def :portkey.aws.runtime-lex.-2016-11-28.post-text-request/bot-name (clojure.spec.alpha/and :portkey.aws.runtime-lex.-2016-11-28/bot-name))
(clojure.spec.alpha/def :portkey.aws.runtime-lex.-2016-11-28.post-text-request/bot-alias (clojure.spec.alpha/and :portkey.aws.runtime-lex.-2016-11-28/bot-alias))
(clojure.spec.alpha/def :portkey.aws.runtime-lex.-2016-11-28.post-text-request/user-id (clojure.spec.alpha/and :portkey.aws.runtime-lex.-2016-11-28/user-id))
(clojure.spec.alpha/def :portkey.aws.runtime-lex.-2016-11-28.post-text-request/session-attributes (clojure.spec.alpha/and :portkey.aws.runtime-lex.-2016-11-28/string-map))
(clojure.spec.alpha/def :portkey.aws.runtime-lex.-2016-11-28.post-text-request/request-attributes (clojure.spec.alpha/and :portkey.aws.runtime-lex.-2016-11-28/string-map))
(clojure.spec.alpha/def :portkey.aws.runtime-lex.-2016-11-28.post-text-request/input-text (clojure.spec.alpha/and :portkey.aws.runtime-lex.-2016-11-28/text))
(clojure.spec.alpha/def :portkey.aws.runtime-lex.-2016-11-28/post-text-request (portkey.aws/json-keys :req-un [:portkey.aws.runtime-lex.-2016-11-28.post-text-request/botName :portkey.aws.runtime-lex.-2016-11-28.post-text-request/botAlias :portkey.aws.runtime-lex.-2016-11-28.post-text-request/userId :portkey.aws.runtime-lex.-2016-11-28.post-text-request/inputText] :opt-un [:portkey.aws.runtime-lex.-2016-11-28.post-text-request/sessionAttributes :portkey.aws.runtime-lex.-2016-11-28.post-text-request/requestAttributes] :locations {}))

(clojure.spec.alpha/def :portkey.aws.runtime-lex.-2016-11-28.generic-attachment/title (clojure.spec.alpha/and :portkey.aws.runtime-lex.-2016-11-28/string-with-length))
(clojure.spec.alpha/def :portkey.aws.runtime-lex.-2016-11-28.generic-attachment/sub-title (clojure.spec.alpha/and :portkey.aws.runtime-lex.-2016-11-28/string-with-length))
(clojure.spec.alpha/def :portkey.aws.runtime-lex.-2016-11-28.generic-attachment/attachment-link-url (clojure.spec.alpha/and :portkey.aws.runtime-lex.-2016-11-28/string-url-with-length))
(clojure.spec.alpha/def :portkey.aws.runtime-lex.-2016-11-28.generic-attachment/image-url (clojure.spec.alpha/and :portkey.aws.runtime-lex.-2016-11-28/string-url-with-length))
(clojure.spec.alpha/def :portkey.aws.runtime-lex.-2016-11-28.generic-attachment/buttons (clojure.spec.alpha/and :portkey.aws.runtime-lex.-2016-11-28/list-of-buttons))
(clojure.spec.alpha/def :portkey.aws.runtime-lex.-2016-11-28/generic-attachment (portkey.aws/json-keys :req-un [] :opt-un [:portkey.aws.runtime-lex.-2016-11-28.generic-attachment/title :portkey.aws.runtime-lex.-2016-11-28.generic-attachment/subTitle :portkey.aws.runtime-lex.-2016-11-28.generic-attachment/attachmentLinkUrl :portkey.aws.runtime-lex.-2016-11-28.generic-attachment/imageUrl :portkey.aws.runtime-lex.-2016-11-28.generic-attachment/buttons] :locations {}))

(clojure.spec.alpha/def :portkey.aws.runtime-lex.-2016-11-28/bot-alias (clojure.spec.alpha/and clojure.core/string?))

(clojure.spec.alpha/def :portkey.aws.runtime-lex.-2016-11-28/user-id (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__13768__auto__] (clojure.core/<= 2 (clojure.core/count s__13768__auto__))) (clojure.core/fn [s__13769__auto__] (clojure.core/< (clojure.core/count s__13769__auto__) 100)) (clojure.core/fn [s__13770__auto__] (clojure.core/re-matches #"[0-9a-zA-Z._:-]+" s__13770__auto__))))

(clojure.spec.alpha/def :portkey.aws.runtime-lex.-2016-11-28/string-url-with-length (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__13768__auto__] (clojure.core/<= 1 (clojure.core/count s__13768__auto__))) (clojure.core/fn [s__13769__auto__] (clojure.core/< (clojure.core/count s__13769__auto__) 2048))))

(clojure.spec.alpha/def :portkey.aws.runtime-lex.-2016-11-28/intent-name (clojure.spec.alpha/and clojure.core/string?))

(clojure.spec.alpha/def :portkey.aws.runtime-lex.-2016-11-28.limit-exceeded-exception/retry-after-seconds (clojure.spec.alpha/and :portkey.aws.runtime-lex.-2016-11-28/string))
(clojure.spec.alpha/def :portkey.aws.runtime-lex.-2016-11-28.limit-exceeded-exception/message (clojure.spec.alpha/and :portkey.aws.runtime-lex.-2016-11-28/string))
(clojure.spec.alpha/def :portkey.aws.runtime-lex.-2016-11-28/limit-exceeded-exception (portkey.aws/json-keys :req-un [] :opt-un [:portkey.aws.runtime-lex.-2016-11-28.limit-exceeded-exception/retryAfterSeconds :portkey.aws.runtime-lex.-2016-11-28.limit-exceeded-exception/message] :locations {}))

(clojure.spec.alpha/def :portkey.aws.runtime-lex.-2016-11-28.post-content-request/bot-name (clojure.spec.alpha/and :portkey.aws.runtime-lex.-2016-11-28/bot-name))
(clojure.spec.alpha/def :portkey.aws.runtime-lex.-2016-11-28.post-content-request/bot-alias (clojure.spec.alpha/and :portkey.aws.runtime-lex.-2016-11-28/bot-alias))
(clojure.spec.alpha/def :portkey.aws.runtime-lex.-2016-11-28.post-content-request/user-id (clojure.spec.alpha/and :portkey.aws.runtime-lex.-2016-11-28/user-id))
(clojure.spec.alpha/def :portkey.aws.runtime-lex.-2016-11-28.post-content-request/session-attributes (clojure.spec.alpha/and :portkey.aws.runtime-lex.-2016-11-28/attributes-string))
(clojure.spec.alpha/def :portkey.aws.runtime-lex.-2016-11-28.post-content-request/request-attributes (clojure.spec.alpha/and :portkey.aws.runtime-lex.-2016-11-28/attributes-string))
(clojure.spec.alpha/def :portkey.aws.runtime-lex.-2016-11-28.post-content-request/content-type (clojure.spec.alpha/and :portkey.aws.runtime-lex.-2016-11-28/http-content-type))
(clojure.spec.alpha/def :portkey.aws.runtime-lex.-2016-11-28.post-content-request/accept (clojure.spec.alpha/and :portkey.aws.runtime-lex.-2016-11-28/accept))
(clojure.spec.alpha/def :portkey.aws.runtime-lex.-2016-11-28.post-content-request/input-stream (clojure.spec.alpha/and :portkey.aws.runtime-lex.-2016-11-28/blob-stream))
(clojure.spec.alpha/def :portkey.aws.runtime-lex.-2016-11-28/post-content-request (portkey.aws/json-keys :req-un [:portkey.aws.runtime-lex.-2016-11-28.post-content-request/botName :portkey.aws.runtime-lex.-2016-11-28.post-content-request/botAlias :portkey.aws.runtime-lex.-2016-11-28.post-content-request/userId :portkey.aws.runtime-lex.-2016-11-28.post-content-request/contentType :portkey.aws.runtime-lex.-2016-11-28.post-content-request/inputStream] :opt-un [:portkey.aws.runtime-lex.-2016-11-28.post-content-request/sessionAttributes :portkey.aws.runtime-lex.-2016-11-28.post-content-request/requestAttributes :portkey.aws.runtime-lex.-2016-11-28.post-content-request/accept] :locations {}))

(clojure.spec.alpha/def :portkey.aws.runtime-lex.-2016-11-28.response-card/version (clojure.spec.alpha/and :portkey.aws.runtime-lex.-2016-11-28/string))
(clojure.spec.alpha/def :portkey.aws.runtime-lex.-2016-11-28.response-card/content-type (clojure.spec.alpha/and :portkey.aws.runtime-lex.-2016-11-28/content-type))
(clojure.spec.alpha/def :portkey.aws.runtime-lex.-2016-11-28.response-card/generic-attachments (clojure.spec.alpha/and :portkey.aws.runtime-lex.-2016-11-28/generic-attachment-list))
(clojure.spec.alpha/def :portkey.aws.runtime-lex.-2016-11-28/response-card (portkey.aws/json-keys :req-un [] :opt-un [:portkey.aws.runtime-lex.-2016-11-28.response-card/version :portkey.aws.runtime-lex.-2016-11-28.response-card/contentType :portkey.aws.runtime-lex.-2016-11-28.response-card/genericAttachments] :locations {}))

(clojure.spec.alpha/def :portkey.aws.runtime-lex.-2016-11-28.loop-detected-exception/message (clojure.spec.alpha/and :portkey.aws.runtime-lex.-2016-11-28/error-message))
(clojure.spec.alpha/def :portkey.aws.runtime-lex.-2016-11-28/loop-detected-exception (portkey.aws/json-keys :req-un [] :opt-un [:portkey.aws.runtime-lex.-2016-11-28.loop-detected-exception/Message] :locations {}))

(clojure.spec.alpha/def :portkey.aws.runtime-lex.-2016-11-28/error-message (clojure.spec.alpha/and clojure.core/string?))

(clojure.spec.alpha/def :portkey.aws.runtime-lex.-2016-11-28/dialog-state (clojure.spec.alpha/conformer (clojure.core/let [m__13766__auto__ {"Fulfilled" "Fulfilled", "Failed" "Failed", "ConfirmIntent" "ConfirmIntent", "ReadyForFulfillment" "ReadyForFulfillment", :elicit-slot "ElicitSlot", :elicit-intent "ElicitIntent", "ElicitSlot" "ElicitSlot", "ElicitIntent" "ElicitIntent", :fulfilled "Fulfilled", :confirm-intent "ConfirmIntent", :ready-for-fulfillment "ReadyForFulfillment", :failed "Failed"}] (clojure.core/fn [s__13767__auto__] (m__13766__auto__ s__13767__auto__ :clojure.spec.alpha/invalid))) (clojure.core/comp clojure.core/keyword portkey.aws/dashed)))

(clojure.spec.alpha/def :portkey.aws.runtime-lex.-2016-11-28/content-type (clojure.spec.alpha/conformer (clojure.core/let [m__13766__auto__ {"application/vnd.amazonaws.card.generic" "application/vnd.amazonaws.card.generic", :application/vnd.amazonaws.card.generic "application/vnd.amazonaws.card.generic"}] (clojure.core/fn [s__13767__auto__] (m__13766__auto__ s__13767__auto__ :clojure.spec.alpha/invalid))) (clojure.core/comp clojure.core/keyword portkey.aws/dashed)))

(clojure.spec.alpha/def :portkey.aws.runtime-lex.-2016-11-28.internal-failure-exception/message (clojure.spec.alpha/and :portkey.aws.runtime-lex.-2016-11-28/string))
(clojure.spec.alpha/def :portkey.aws.runtime-lex.-2016-11-28/internal-failure-exception (portkey.aws/json-keys :req-un [] :opt-un [:portkey.aws.runtime-lex.-2016-11-28.internal-failure-exception/message] :locations {}))

(clojure.spec.alpha/def :portkey.aws.runtime-lex.-2016-11-28.conflict-exception/message (clojure.spec.alpha/and :portkey.aws.runtime-lex.-2016-11-28/string))
(clojure.spec.alpha/def :portkey.aws.runtime-lex.-2016-11-28/conflict-exception (portkey.aws/json-keys :req-un [] :opt-un [:portkey.aws.runtime-lex.-2016-11-28.conflict-exception/message] :locations {}))

(clojure.spec.alpha/def :portkey.aws.runtime-lex.-2016-11-28.not-found-exception/message (clojure.spec.alpha/and :portkey.aws.runtime-lex.-2016-11-28/string))
(clojure.spec.alpha/def :portkey.aws.runtime-lex.-2016-11-28/not-found-exception (portkey.aws/json-keys :req-un [] :opt-un [:portkey.aws.runtime-lex.-2016-11-28.not-found-exception/message] :locations {}))

(clojure.spec.alpha/def :portkey.aws.runtime-lex.-2016-11-28/bot-name (clojure.spec.alpha/and clojure.core/string?))

(clojure.spec.alpha/def :portkey.aws.runtime-lex.-2016-11-28/blob-stream (clojure.spec.alpha/and clojure.core/bytes? (clojure.spec.alpha/conformer portkey.aws/base64-encode portkey.aws/base64-decode)))

(clojure.spec.alpha/def :portkey.aws.runtime-lex.-2016-11-28/string (clojure.spec.alpha/and clojure.core/string?))

(clojure.spec.alpha/def :portkey.aws.runtime-lex.-2016-11-28.dependency-failed-exception/message (clojure.spec.alpha/and :portkey.aws.runtime-lex.-2016-11-28/error-message))
(clojure.spec.alpha/def :portkey.aws.runtime-lex.-2016-11-28/dependency-failed-exception (portkey.aws/json-keys :req-un [] :opt-un [:portkey.aws.runtime-lex.-2016-11-28.dependency-failed-exception/Message] :locations {}))

(clojure.spec.alpha/def :portkey.aws.runtime-lex.-2016-11-28.request-timeout-exception/message (clojure.spec.alpha/and :portkey.aws.runtime-lex.-2016-11-28/string))
(clojure.spec.alpha/def :portkey.aws.runtime-lex.-2016-11-28/request-timeout-exception (portkey.aws/json-keys :req-un [] :opt-un [:portkey.aws.runtime-lex.-2016-11-28.request-timeout-exception/message] :locations {}))

(clojure.spec.alpha/def :portkey.aws.runtime-lex.-2016-11-28/button-text-string-with-length (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__13768__auto__] (clojure.core/<= 1 (clojure.core/count s__13768__auto__))) (clojure.core/fn [s__13769__auto__] (clojure.core/< (clojure.core/count s__13769__auto__) 15))))

(clojure.spec.alpha/def :portkey.aws.runtime-lex.-2016-11-28/http-content-type (clojure.spec.alpha/and clojure.core/string?))

(clojure.spec.alpha/def :portkey.aws.runtime-lex.-2016-11-28/button-value-string-with-length (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__13768__auto__] (clojure.core/<= 1 (clojure.core/count s__13768__auto__))) (clojure.core/fn [s__13769__auto__] (clojure.core/< (clojure.core/count s__13769__auto__) 1000))))

(clojure.spec.alpha/def :portkey.aws.runtime-lex.-2016-11-28.not-acceptable-exception/message (clojure.spec.alpha/and :portkey.aws.runtime-lex.-2016-11-28/string))
(clojure.spec.alpha/def :portkey.aws.runtime-lex.-2016-11-28/not-acceptable-exception (portkey.aws/json-keys :req-un [] :opt-un [:portkey.aws.runtime-lex.-2016-11-28.not-acceptable-exception/message] :locations {}))

(clojure.spec.alpha/def :portkey.aws.runtime-lex.-2016-11-28/text (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__13768__auto__] (clojure.core/<= 1 (clojure.core/count s__13768__auto__))) (clojure.core/fn [s__13769__auto__] (clojure.core/< (clojure.core/count s__13769__auto__) 1024))))

(clojure.spec.alpha/def :portkey.aws.runtime-lex.-2016-11-28/attributes-string (clojure.spec.alpha/and clojure.core/string?))

(clojure.spec.alpha/def :portkey.aws.runtime-lex.-2016-11-28.bad-gateway-exception/message (clojure.spec.alpha/and :portkey.aws.runtime-lex.-2016-11-28/error-message))
(clojure.spec.alpha/def :portkey.aws.runtime-lex.-2016-11-28/bad-gateway-exception (portkey.aws/json-keys :req-un [] :opt-un [:portkey.aws.runtime-lex.-2016-11-28.bad-gateway-exception/Message] :locations {}))

(clojure.spec.alpha/def :portkey.aws.runtime-lex.-2016-11-28.post-text-response/intent-name (clojure.spec.alpha/and :portkey.aws.runtime-lex.-2016-11-28/intent-name))
(clojure.spec.alpha/def :portkey.aws.runtime-lex.-2016-11-28.post-text-response/slots (clojure.spec.alpha/and :portkey.aws.runtime-lex.-2016-11-28/string-map))
(clojure.spec.alpha/def :portkey.aws.runtime-lex.-2016-11-28.post-text-response/session-attributes (clojure.spec.alpha/and :portkey.aws.runtime-lex.-2016-11-28/string-map))
(clojure.spec.alpha/def :portkey.aws.runtime-lex.-2016-11-28.post-text-response/message (clojure.spec.alpha/and :portkey.aws.runtime-lex.-2016-11-28/text))
(clojure.spec.alpha/def :portkey.aws.runtime-lex.-2016-11-28.post-text-response/message-format (clojure.spec.alpha/and :portkey.aws.runtime-lex.-2016-11-28/message-format-type))
(clojure.spec.alpha/def :portkey.aws.runtime-lex.-2016-11-28.post-text-response/dialog-state (clojure.spec.alpha/and :portkey.aws.runtime-lex.-2016-11-28/dialog-state))
(clojure.spec.alpha/def :portkey.aws.runtime-lex.-2016-11-28.post-text-response/slot-to-elicit (clojure.spec.alpha/and :portkey.aws.runtime-lex.-2016-11-28/string))
(clojure.spec.alpha/def :portkey.aws.runtime-lex.-2016-11-28.post-text-response/response-card (clojure.spec.alpha/and :portkey.aws.runtime-lex.-2016-11-28/response-card))
(clojure.spec.alpha/def :portkey.aws.runtime-lex.-2016-11-28/post-text-response (portkey.aws/json-keys :req-un [] :opt-un [:portkey.aws.runtime-lex.-2016-11-28.post-text-response/intentName :portkey.aws.runtime-lex.-2016-11-28.post-text-response/slots :portkey.aws.runtime-lex.-2016-11-28.post-text-response/sessionAttributes :portkey.aws.runtime-lex.-2016-11-28.post-text-response/message :portkey.aws.runtime-lex.-2016-11-28.post-text-response/messageFormat :portkey.aws.runtime-lex.-2016-11-28.post-text-response/dialogState :portkey.aws.runtime-lex.-2016-11-28.post-text-response/slotToElicit :portkey.aws.runtime-lex.-2016-11-28.post-text-response/responseCard] :locations {}))

(clojure.spec.alpha/def :portkey.aws.runtime-lex.-2016-11-28/generic-attachment-list (clojure.spec.alpha/and (clojure.spec.alpha/coll-of :portkey.aws.runtime-lex.-2016-11-28/generic-attachment :min-count 0 :max-count 10) (clojure.spec.alpha/conformer clojure.core/identity (fn* [p1__13687__13688__auto__] (if (clojure.core/sequential? p1__13687__13688__auto__) p1__13687__13688__auto__ [p1__13687__13688__auto__])))))

(clojure.spec.alpha/def :portkey.aws.runtime-lex.-2016-11-28/accept (clojure.spec.alpha/and clojure.core/string?))

(clojure.spec.alpha/def :portkey.aws.runtime-lex.-2016-11-28/list-of-buttons (clojure.spec.alpha/and (clojure.spec.alpha/coll-of :portkey.aws.runtime-lex.-2016-11-28/button :min-count 0 :max-count 5) (clojure.spec.alpha/conformer clojure.core/identity (fn* [p1__13687__13688__auto__] (if (clojure.core/sequential? p1__13687__13688__auto__) p1__13687__13688__auto__ [p1__13687__13688__auto__])))))

(clojure.spec.alpha/def :portkey.aws.runtime-lex.-2016-11-28.post-content-response/message (clojure.spec.alpha/and :portkey.aws.runtime-lex.-2016-11-28/text))
(clojure.spec.alpha/def :portkey.aws.runtime-lex.-2016-11-28.post-content-response/slot-to-elicit (clojure.spec.alpha/and :portkey.aws.runtime-lex.-2016-11-28/string))
(clojure.spec.alpha/def :portkey.aws.runtime-lex.-2016-11-28.post-content-response/slots (clojure.spec.alpha/and :portkey.aws.runtime-lex.-2016-11-28/string))
(clojure.spec.alpha/def :portkey.aws.runtime-lex.-2016-11-28.post-content-response/audio-stream (clojure.spec.alpha/and :portkey.aws.runtime-lex.-2016-11-28/blob-stream))
(clojure.spec.alpha/def :portkey.aws.runtime-lex.-2016-11-28.post-content-response/intent-name (clojure.spec.alpha/and :portkey.aws.runtime-lex.-2016-11-28/intent-name))
(clojure.spec.alpha/def :portkey.aws.runtime-lex.-2016-11-28.post-content-response/message-format (clojure.spec.alpha/and :portkey.aws.runtime-lex.-2016-11-28/message-format-type))
(clojure.spec.alpha/def :portkey.aws.runtime-lex.-2016-11-28.post-content-response/input-transcript (clojure.spec.alpha/and :portkey.aws.runtime-lex.-2016-11-28/string))
(clojure.spec.alpha/def :portkey.aws.runtime-lex.-2016-11-28.post-content-response/content-type (clojure.spec.alpha/and :portkey.aws.runtime-lex.-2016-11-28/http-content-type))
(clojure.spec.alpha/def :portkey.aws.runtime-lex.-2016-11-28.post-content-response/dialog-state (clojure.spec.alpha/and :portkey.aws.runtime-lex.-2016-11-28/dialog-state))
(clojure.spec.alpha/def :portkey.aws.runtime-lex.-2016-11-28.post-content-response/session-attributes (clojure.spec.alpha/and :portkey.aws.runtime-lex.-2016-11-28/string))
(clojure.spec.alpha/def :portkey.aws.runtime-lex.-2016-11-28/post-content-response (portkey.aws/json-keys :req-un [] :opt-un [:portkey.aws.runtime-lex.-2016-11-28.post-content-response/message :portkey.aws.runtime-lex.-2016-11-28.post-content-response/slotToElicit :portkey.aws.runtime-lex.-2016-11-28.post-content-response/slots :portkey.aws.runtime-lex.-2016-11-28.post-content-response/audioStream :portkey.aws.runtime-lex.-2016-11-28.post-content-response/intentName :portkey.aws.runtime-lex.-2016-11-28.post-content-response/messageFormat :portkey.aws.runtime-lex.-2016-11-28.post-content-response/inputTranscript :portkey.aws.runtime-lex.-2016-11-28.post-content-response/contentType :portkey.aws.runtime-lex.-2016-11-28.post-content-response/dialogState :portkey.aws.runtime-lex.-2016-11-28.post-content-response/sessionAttributes] :locations {}))

(clojure.spec.alpha/def :portkey.aws.runtime-lex.-2016-11-28/message-format-type (clojure.spec.alpha/conformer (clojure.core/let [m__13766__auto__ {"PlainText" "PlainText", :plain-text "PlainText", "CustomPayload" "CustomPayload", :custom-payload "CustomPayload", "SSML" "SSML", :ssml "SSML", "Composite" "Composite", :composite "Composite"}] (clojure.core/fn [s__13767__auto__] (m__13766__auto__ s__13767__auto__ :clojure.spec.alpha/invalid))) (clojure.core/comp clojure.core/keyword portkey.aws/dashed)))

(clojure.core/defn post-content " Sends user input (text or speech) to Amazon Lex. Clients use this API to send\ntext and audio requests to Amazon Lex at runtime. Amazon Lex interprets the user\ninput using the machine learning model that it built for the bot.\n The PostContent operation supports audio input at 8kHz and 16kHz. You can use\n8kHz audio to achieve higher speech recognition accuracy in telephone audio\napplications.\n In response, Amazon Lex returns the next message to convey to the user.\nConsider the following example messages:\n * For a user input \"I would like a pizza,\" Amazon Lex might return a response\nwith a message eliciting slot data (for example, PizzaSize): \"What size pizza\nwould you like?\".\n * After the user provides all of the pizza order information, Amazon Lex might\nreturn a response with a message to get user confirmation: \"Order the pizza?\".\n * After the user replies \"Yes\" to the confirmation prompt, Amazon Lex might\nreturn a conclusion statement: \"Thank you, your cheese pizza has been ordered.\".\n Not all Amazon Lex messages require a response from the user. For example,\nconclusion statements do not require a response. Some messages require only a\nyes or no response. In addition to the message, Amazon Lex provides additional\ncontext about the message in the response that you can use to enhance client\nbehavior, such as displaying the appropriate client user interface. Consider the\nfollowing examples:\n * If the message is to elicit slot data, Amazon Lex returns the following\ncontext information:\n * x-amz-lex-dialog-state header set to ElicitSlot\n * x-amz-lex-intent-name header set to the intent name in the current context\n * x-amz-lex-slot-to-elicit header set to the slot name for which the message is\neliciting information\n * x-amz-lex-slots header set to a map of slots configured for the intent with\ntheir current values\n * If the message is a confirmation prompt, the x-amz-lex-dialog-state header is\nset to Confirmation and the x-amz-lex-slot-to-elicit header is omitted.\n * If the message is a clarification prompt configured for the intent,\nindicating that the user intent is not understood, the x-amz-dialog-state header\nis set to ElicitIntent and the x-amz-slot-to-elicit header is omitted.\n In addition, Amazon Lex also returns your application-specific\nsessionAttributes. For more information, see Managing Conversation Context\n(http://docs.aws.amazon.com/lex/latest/dg/context-mgmt.html)." ([post-content-request] (portkey.aws/-rest-json-call portkey.aws.runtime-lex.-2016-11-28/endpoints "POST" "/bot/{botName}/alias/{botAlias}/user/{userId}/content" post-content-request :portkey.aws.runtime-lex.-2016-11-28/post-content-request {:payload "inputStream", :move {}, :headers {"sessionAttributes" ["x-amz-lex-session-attributes" true], "requestAttributes" ["x-amz-lex-request-attributes" true], "contentType" ["Content-Type" nil], "accept" ["Accept" nil]}, :uri {"botName" "botName", "botAlias" "botAlias", "userId" "userId"}, :querystring {}} nil :portkey.aws.runtime-lex.-2016-11-28/post-content-response {"UnsupportedMediaTypeException" :portkey.aws.runtime-lex.-2016-11-28/unsupported-media-type-exception, "BadRequestException" :portkey.aws.runtime-lex.-2016-11-28/bad-request-exception, "LimitExceededException" :portkey.aws.runtime-lex.-2016-11-28/limit-exceeded-exception, "LoopDetectedException" :portkey.aws.runtime-lex.-2016-11-28/loop-detected-exception, "InternalFailureException" :portkey.aws.runtime-lex.-2016-11-28/internal-failure-exception, "ConflictException" :portkey.aws.runtime-lex.-2016-11-28/conflict-exception, "NotFoundException" :portkey.aws.runtime-lex.-2016-11-28/not-found-exception, "DependencyFailedException" :portkey.aws.runtime-lex.-2016-11-28/dependency-failed-exception, "RequestTimeoutException" :portkey.aws.runtime-lex.-2016-11-28/request-timeout-exception, "NotAcceptableException" :portkey.aws.runtime-lex.-2016-11-28/not-acceptable-exception, "BadGatewayException" :portkey.aws.runtime-lex.-2016-11-28/bad-gateway-exception})))
(clojure.spec.alpha/fdef post-content :args (clojure.spec.alpha/tuple :portkey.aws.runtime-lex.-2016-11-28/post-content-request) :ret (clojure.spec.alpha/and :portkey.aws.runtime-lex.-2016-11-28/post-content-response))

(clojure.core/defn post-text "Sends user input (text-only) to Amazon Lex. Client applications can use this API\nto send requests to Amazon Lex at runtime. Amazon Lex then interprets the user\ninput using the machine learning model it built for the bot.\n In response, Amazon Lex returns the next message to convey to the user an\noptional responseCard to display. Consider the following example messages:\n * For a user input \"I would like a pizza\", Amazon Lex might return a response\nwith a message eliciting slot data (for example, PizzaSize): \"What size pizza\nwould you like?\"\n * After the user provides all of the pizza order information, Amazon Lex might\nreturn a response with a message to obtain user confirmation \"Proceed with the\npizza order?\".\n * After the user replies to a confirmation prompt with a \"yes\", Amazon Lex\nmight return a conclusion statement: \"Thank you, your cheese pizza has been\nordered.\".\n Not all Amazon Lex messages require a user response. For example, a conclusion\nstatement does not require a response. Some messages require only a \"yes\" or\n\"no\" user response. In addition to the message, Amazon Lex provides additional\ncontext about the message in the response that you might use to enhance client\nbehavior, for example, to display the appropriate client user interface. These\nare the slotToElicit, dialogState, intentName, and slots fields in the response.\nConsider the following examples:\n * If the message is to elicit slot data, Amazon Lex returns the following\ncontext information:\n * dialogState set to ElicitSlot\n * intentName set to the intent name in the current context\n * slotToElicit set to the slot name for which the message is eliciting\ninformation\n * slots set to a map of slots, configured for the intent, with currently known\nvalues\n * If the message is a confirmation prompt, the dialogState is set to\nConfirmIntent and SlotToElicit is set to null.\n * If the message is a clarification prompt (configured for the intent) that\nindicates that user intent is not understood, the dialogState is set to\nElicitIntent and slotToElicit is set to null.\n In addition, Amazon Lex also returns your application-specific\nsessionAttributes. For more information, see Managing Conversation Context\n(http://docs.aws.amazon.com/lex/latest/dg/context-mgmt.html)." ([post-text-request] (portkey.aws/-rest-json-call portkey.aws.runtime-lex.-2016-11-28/endpoints "POST" "/bot/{botName}/alias/{botAlias}/user/{userId}/text" post-text-request :portkey.aws.runtime-lex.-2016-11-28/post-text-request {:payload nil, :move {}, :headers {}, :uri {"botName" "botName", "botAlias" "botAlias", "userId" "userId"}, :querystring {}} nil :portkey.aws.runtime-lex.-2016-11-28/post-text-response {"NotFoundException" :portkey.aws.runtime-lex.-2016-11-28/not-found-exception, "BadRequestException" :portkey.aws.runtime-lex.-2016-11-28/bad-request-exception, "LimitExceededException" :portkey.aws.runtime-lex.-2016-11-28/limit-exceeded-exception, "InternalFailureException" :portkey.aws.runtime-lex.-2016-11-28/internal-failure-exception, "ConflictException" :portkey.aws.runtime-lex.-2016-11-28/conflict-exception, "DependencyFailedException" :portkey.aws.runtime-lex.-2016-11-28/dependency-failed-exception, "BadGatewayException" :portkey.aws.runtime-lex.-2016-11-28/bad-gateway-exception, "LoopDetectedException" :portkey.aws.runtime-lex.-2016-11-28/loop-detected-exception})))
(clojure.spec.alpha/fdef post-text :args (clojure.spec.alpha/tuple :portkey.aws.runtime-lex.-2016-11-28/post-text-request) :ret (clojure.spec.alpha/and :portkey.aws.runtime-lex.-2016-11-28/post-text-response))
