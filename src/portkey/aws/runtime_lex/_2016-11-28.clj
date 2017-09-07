(ns portkey.aws.runtime-lex.-2016-11-28 (:require [portkey.aws]))

(def endpoints 'nil)

(clojure.spec.alpha/def :portkey.aws.runtime-lex.-2016-11-28.unsupported-media-type-exception/message (clojure.spec.alpha/and :portkey.aws.runtime-lex.-2016-11-28/string))
(clojure.spec.alpha/def :portkey.aws.runtime-lex.-2016-11-28/unsupported-media-type-exception (portkey.awsgen/json-keys :req-un [] :opt-un [:portkey.aws.runtime-lex.-2016-11-28.unsupported-media-type-exception/message]))

(clojure.spec.alpha/def :portkey.aws.runtime-lex.-2016-11-28/string-with-length (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__56601__auto__] (clojure.core/<= 1 (clojure.core/count s__56601__auto__))) (clojure.core/fn [s__56602__auto__] (clojure.core/< (clojure.core/count s__56602__auto__) 80))))

(clojure.spec.alpha/def :portkey.aws.runtime-lex.-2016-11-28/string-map (clojure.spec.alpha/map-of :portkey.aws.runtime-lex.-2016-11-28/string :portkey.aws.runtime-lex.-2016-11-28/string))

(clojure.spec.alpha/def :portkey.aws.runtime-lex.-2016-11-28.bad-request-exception/message (clojure.spec.alpha/and :portkey.aws.runtime-lex.-2016-11-28/string))
(clojure.spec.alpha/def :portkey.aws.runtime-lex.-2016-11-28/bad-request-exception (portkey.awsgen/json-keys :req-un [] :opt-un [:portkey.aws.runtime-lex.-2016-11-28.bad-request-exception/message]))

(clojure.spec.alpha/def :portkey.aws.runtime-lex.-2016-11-28.button/text (clojure.spec.alpha/and :portkey.aws.runtime-lex.-2016-11-28/button-text-string-with-length))
(clojure.spec.alpha/def :portkey.aws.runtime-lex.-2016-11-28.button/value (clojure.spec.alpha/and :portkey.aws.runtime-lex.-2016-11-28/button-value-string-with-length))
(clojure.spec.alpha/def :portkey.aws.runtime-lex.-2016-11-28/button (portkey.awsgen/json-keys :req-un [:portkey.aws.runtime-lex.-2016-11-28.button/text :portkey.aws.runtime-lex.-2016-11-28.button/value] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.runtime-lex.-2016-11-28.post-text-request/bot-name (clojure.spec.alpha/and :portkey.aws.runtime-lex.-2016-11-28/bot-name))
(clojure.spec.alpha/def :portkey.aws.runtime-lex.-2016-11-28.post-text-request/bot-alias (clojure.spec.alpha/and :portkey.aws.runtime-lex.-2016-11-28/bot-alias))
(clojure.spec.alpha/def :portkey.aws.runtime-lex.-2016-11-28.post-text-request/user-id (clojure.spec.alpha/and :portkey.aws.runtime-lex.-2016-11-28/user-id))
(clojure.spec.alpha/def :portkey.aws.runtime-lex.-2016-11-28.post-text-request/session-attributes (clojure.spec.alpha/and :portkey.aws.runtime-lex.-2016-11-28/string-map))
(clojure.spec.alpha/def :portkey.aws.runtime-lex.-2016-11-28.post-text-request/input-text (clojure.spec.alpha/and :portkey.aws.runtime-lex.-2016-11-28/text))
(clojure.spec.alpha/def :portkey.aws.runtime-lex.-2016-11-28/post-text-request (portkey.awsgen/json-keys :req-un [:portkey.aws.runtime-lex.-2016-11-28.post-text-request/botName :portkey.aws.runtime-lex.-2016-11-28.post-text-request/botAlias :portkey.aws.runtime-lex.-2016-11-28.post-text-request/userId :portkey.aws.runtime-lex.-2016-11-28.post-text-request/inputText] :opt-un [:portkey.aws.runtime-lex.-2016-11-28.post-text-request/sessionAttributes]))

(clojure.spec.alpha/def :portkey.aws.runtime-lex.-2016-11-28.generic-attachment/title (clojure.spec.alpha/and :portkey.aws.runtime-lex.-2016-11-28/string-with-length))
(clojure.spec.alpha/def :portkey.aws.runtime-lex.-2016-11-28.generic-attachment/sub-title (clojure.spec.alpha/and :portkey.aws.runtime-lex.-2016-11-28/string-with-length))
(clojure.spec.alpha/def :portkey.aws.runtime-lex.-2016-11-28.generic-attachment/attachment-link-url (clojure.spec.alpha/and :portkey.aws.runtime-lex.-2016-11-28/string-url-with-length))
(clojure.spec.alpha/def :portkey.aws.runtime-lex.-2016-11-28.generic-attachment/image-url (clojure.spec.alpha/and :portkey.aws.runtime-lex.-2016-11-28/string-url-with-length))
(clojure.spec.alpha/def :portkey.aws.runtime-lex.-2016-11-28.generic-attachment/buttons (clojure.spec.alpha/and :portkey.aws.runtime-lex.-2016-11-28/list-of-buttons))
(clojure.spec.alpha/def :portkey.aws.runtime-lex.-2016-11-28/generic-attachment (portkey.awsgen/json-keys :req-un [] :opt-un [:portkey.aws.runtime-lex.-2016-11-28.generic-attachment/title :portkey.aws.runtime-lex.-2016-11-28.generic-attachment/subTitle :portkey.aws.runtime-lex.-2016-11-28.generic-attachment/attachmentLinkUrl :portkey.aws.runtime-lex.-2016-11-28.generic-attachment/imageUrl :portkey.aws.runtime-lex.-2016-11-28.generic-attachment/buttons]))

(clojure.spec.alpha/def :portkey.aws.runtime-lex.-2016-11-28/bot-alias (clojure.spec.alpha/and clojure.core/string?))

(clojure.spec.alpha/def :portkey.aws.runtime-lex.-2016-11-28/user-id (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__56601__auto__] (clojure.core/<= 2 (clojure.core/count s__56601__auto__))) (clojure.core/fn [s__56602__auto__] (clojure.core/< (clojure.core/count s__56602__auto__) 100)) (clojure.core/fn [s__56603__auto__] (clojure.core/re-matches #"[0-9a-zA-Z._:-]+" s__56603__auto__))))

(clojure.spec.alpha/def :portkey.aws.runtime-lex.-2016-11-28/string-url-with-length (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__56601__auto__] (clojure.core/<= 1 (clojure.core/count s__56601__auto__))) (clojure.core/fn [s__56602__auto__] (clojure.core/< (clojure.core/count s__56602__auto__) 2048))))

(clojure.spec.alpha/def :portkey.aws.runtime-lex.-2016-11-28/intent-name (clojure.spec.alpha/and clojure.core/string?))

(clojure.spec.alpha/def :portkey.aws.runtime-lex.-2016-11-28.limit-exceeded-exception/retry-after-seconds (clojure.spec.alpha/and :portkey.aws.runtime-lex.-2016-11-28/string))
(clojure.spec.alpha/def :portkey.aws.runtime-lex.-2016-11-28.limit-exceeded-exception/message (clojure.spec.alpha/and :portkey.aws.runtime-lex.-2016-11-28/string))
(clojure.spec.alpha/def :portkey.aws.runtime-lex.-2016-11-28/limit-exceeded-exception (portkey.awsgen/json-keys :req-un [] :opt-un [:portkey.aws.runtime-lex.-2016-11-28.limit-exceeded-exception/retryAfterSeconds :portkey.aws.runtime-lex.-2016-11-28.limit-exceeded-exception/message]))

(clojure.spec.alpha/def :portkey.aws.runtime-lex.-2016-11-28.post-content-request/bot-name (clojure.spec.alpha/and :portkey.aws.runtime-lex.-2016-11-28/bot-name))
(clojure.spec.alpha/def :portkey.aws.runtime-lex.-2016-11-28.post-content-request/bot-alias (clojure.spec.alpha/and :portkey.aws.runtime-lex.-2016-11-28/bot-alias))
(clojure.spec.alpha/def :portkey.aws.runtime-lex.-2016-11-28.post-content-request/user-id (clojure.spec.alpha/and :portkey.aws.runtime-lex.-2016-11-28/user-id))
(clojure.spec.alpha/def :portkey.aws.runtime-lex.-2016-11-28.post-content-request/session-attributes (clojure.spec.alpha/and :portkey.aws.runtime-lex.-2016-11-28/string))
(clojure.spec.alpha/def :portkey.aws.runtime-lex.-2016-11-28.post-content-request/content-type (clojure.spec.alpha/and :portkey.aws.runtime-lex.-2016-11-28/http-content-type))
(clojure.spec.alpha/def :portkey.aws.runtime-lex.-2016-11-28.post-content-request/accept (clojure.spec.alpha/and :portkey.aws.runtime-lex.-2016-11-28/accept))
(clojure.spec.alpha/def :portkey.aws.runtime-lex.-2016-11-28.post-content-request/input-stream (clojure.spec.alpha/and :portkey.aws.runtime-lex.-2016-11-28/blob-stream))
(clojure.spec.alpha/def :portkey.aws.runtime-lex.-2016-11-28/post-content-request (portkey.awsgen/json-keys :req-un [:portkey.aws.runtime-lex.-2016-11-28.post-content-request/botName :portkey.aws.runtime-lex.-2016-11-28.post-content-request/botAlias :portkey.aws.runtime-lex.-2016-11-28.post-content-request/userId :portkey.aws.runtime-lex.-2016-11-28.post-content-request/contentType :portkey.aws.runtime-lex.-2016-11-28.post-content-request/inputStream] :opt-un [:portkey.aws.runtime-lex.-2016-11-28.post-content-request/sessionAttributes :portkey.aws.runtime-lex.-2016-11-28.post-content-request/accept]))

(clojure.spec.alpha/def :portkey.aws.runtime-lex.-2016-11-28.response-card/version (clojure.spec.alpha/and :portkey.aws.runtime-lex.-2016-11-28/string))
(clojure.spec.alpha/def :portkey.aws.runtime-lex.-2016-11-28.response-card/content-type (clojure.spec.alpha/and :portkey.aws.runtime-lex.-2016-11-28/content-type))
(clojure.spec.alpha/def :portkey.aws.runtime-lex.-2016-11-28.response-card/generic-attachments (clojure.spec.alpha/and :portkey.aws.runtime-lex.-2016-11-28/generic-attachment-list))
(clojure.spec.alpha/def :portkey.aws.runtime-lex.-2016-11-28/response-card (portkey.awsgen/json-keys :req-un [] :opt-un [:portkey.aws.runtime-lex.-2016-11-28.response-card/version :portkey.aws.runtime-lex.-2016-11-28.response-card/contentType :portkey.aws.runtime-lex.-2016-11-28.response-card/genericAttachments]))

(clojure.spec.alpha/def :portkey.aws.runtime-lex.-2016-11-28.loop-detected-exception/message (clojure.spec.alpha/and :portkey.aws.runtime-lex.-2016-11-28/error-message))
(clojure.spec.alpha/def :portkey.aws.runtime-lex.-2016-11-28/loop-detected-exception (portkey.awsgen/json-keys :req-un [] :opt-un [:portkey.aws.runtime-lex.-2016-11-28.loop-detected-exception/Message]))

(clojure.spec.alpha/def :portkey.aws.runtime-lex.-2016-11-28/error-message (clojure.spec.alpha/and clojure.core/string?))

(clojure.spec.alpha/def :portkey.aws.runtime-lex.-2016-11-28/dialog-state (clojure.spec.alpha/conformer (clojure.core/let [m__56599__auto__ {"Fulfilled" "Fulfilled", "Failed" "Failed", "ConfirmIntent" "ConfirmIntent", "ReadyForFulfillment" "ReadyForFulfillment", :elicit-slot "ElicitSlot", :elicit-intent "ElicitIntent", "ElicitSlot" "ElicitSlot", "ElicitIntent" "ElicitIntent", :fulfilled "Fulfilled", :confirm-intent "ConfirmIntent", :ready-for-fulfillment "ReadyForFulfillment", :failed "Failed"}] (clojure.core/fn [s__56600__auto__] (m__56599__auto__ s__56600__auto__ :clojure.spec.alpha/invalid))) (clojure.core/comp clojure.core/keyword portkey.awsgen/dashed)))

(clojure.spec.alpha/def :portkey.aws.runtime-lex.-2016-11-28/content-type (clojure.spec.alpha/conformer (clojure.core/let [m__56599__auto__ {"application/vnd.amazonaws.card.generic" "application/vnd.amazonaws.card.generic", :application/vnd.amazonaws.card.generic "application/vnd.amazonaws.card.generic"}] (clojure.core/fn [s__56600__auto__] (m__56599__auto__ s__56600__auto__ :clojure.spec.alpha/invalid))) (clojure.core/comp clojure.core/keyword portkey.awsgen/dashed)))

(clojure.spec.alpha/def :portkey.aws.runtime-lex.-2016-11-28.internal-failure-exception/message (clojure.spec.alpha/and :portkey.aws.runtime-lex.-2016-11-28/string))
(clojure.spec.alpha/def :portkey.aws.runtime-lex.-2016-11-28/internal-failure-exception (portkey.awsgen/json-keys :req-un [] :opt-un [:portkey.aws.runtime-lex.-2016-11-28.internal-failure-exception/message]))

(clojure.spec.alpha/def :portkey.aws.runtime-lex.-2016-11-28.conflict-exception/message (clojure.spec.alpha/and :portkey.aws.runtime-lex.-2016-11-28/string))
(clojure.spec.alpha/def :portkey.aws.runtime-lex.-2016-11-28/conflict-exception (portkey.awsgen/json-keys :req-un [] :opt-un [:portkey.aws.runtime-lex.-2016-11-28.conflict-exception/message]))

(clojure.spec.alpha/def :portkey.aws.runtime-lex.-2016-11-28.not-found-exception/message (clojure.spec.alpha/and :portkey.aws.runtime-lex.-2016-11-28/string))
(clojure.spec.alpha/def :portkey.aws.runtime-lex.-2016-11-28/not-found-exception (portkey.awsgen/json-keys :req-un [] :opt-un [:portkey.aws.runtime-lex.-2016-11-28.not-found-exception/message]))

(clojure.spec.alpha/def :portkey.aws.runtime-lex.-2016-11-28/bot-name (clojure.spec.alpha/and clojure.core/string?))

(clojure.spec.alpha/def :portkey.aws.runtime-lex.-2016-11-28/blob-stream (clojure.spec.alpha/and clojure.core/bytes? (clojure.spec.alpha/conformer portkey.awsgen/base64-encode portkey.awsgen/base64-decode)))

(clojure.spec.alpha/def :portkey.aws.runtime-lex.-2016-11-28/string (clojure.spec.alpha/and clojure.core/string?))

(clojure.spec.alpha/def :portkey.aws.runtime-lex.-2016-11-28.dependency-failed-exception/message (clojure.spec.alpha/and :portkey.aws.runtime-lex.-2016-11-28/error-message))
(clojure.spec.alpha/def :portkey.aws.runtime-lex.-2016-11-28/dependency-failed-exception (portkey.awsgen/json-keys :req-un [] :opt-un [:portkey.aws.runtime-lex.-2016-11-28.dependency-failed-exception/Message]))

(clojure.spec.alpha/def :portkey.aws.runtime-lex.-2016-11-28.request-timeout-exception/message (clojure.spec.alpha/and :portkey.aws.runtime-lex.-2016-11-28/string))
(clojure.spec.alpha/def :portkey.aws.runtime-lex.-2016-11-28/request-timeout-exception (portkey.awsgen/json-keys :req-un [] :opt-un [:portkey.aws.runtime-lex.-2016-11-28.request-timeout-exception/message]))

(clojure.spec.alpha/def :portkey.aws.runtime-lex.-2016-11-28/button-text-string-with-length (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__56601__auto__] (clojure.core/<= 1 (clojure.core/count s__56601__auto__))) (clojure.core/fn [s__56602__auto__] (clojure.core/< (clojure.core/count s__56602__auto__) 15))))

(clojure.spec.alpha/def :portkey.aws.runtime-lex.-2016-11-28/http-content-type (clojure.spec.alpha/and clojure.core/string?))

(clojure.spec.alpha/def :portkey.aws.runtime-lex.-2016-11-28/button-value-string-with-length (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__56601__auto__] (clojure.core/<= 1 (clojure.core/count s__56601__auto__))) (clojure.core/fn [s__56602__auto__] (clojure.core/< (clojure.core/count s__56602__auto__) 1000))))

(clojure.spec.alpha/def :portkey.aws.runtime-lex.-2016-11-28.not-acceptable-exception/message (clojure.spec.alpha/and :portkey.aws.runtime-lex.-2016-11-28/string))
(clojure.spec.alpha/def :portkey.aws.runtime-lex.-2016-11-28/not-acceptable-exception (portkey.awsgen/json-keys :req-un [] :opt-un [:portkey.aws.runtime-lex.-2016-11-28.not-acceptable-exception/message]))

(clojure.spec.alpha/def :portkey.aws.runtime-lex.-2016-11-28/text (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__56601__auto__] (clojure.core/<= 1 (clojure.core/count s__56601__auto__))) (clojure.core/fn [s__56602__auto__] (clojure.core/< (clojure.core/count s__56602__auto__) 1024))))

(clojure.spec.alpha/def :portkey.aws.runtime-lex.-2016-11-28.bad-gateway-exception/message (clojure.spec.alpha/and :portkey.aws.runtime-lex.-2016-11-28/error-message))
(clojure.spec.alpha/def :portkey.aws.runtime-lex.-2016-11-28/bad-gateway-exception (portkey.awsgen/json-keys :req-un [] :opt-un [:portkey.aws.runtime-lex.-2016-11-28.bad-gateway-exception/Message]))

(clojure.spec.alpha/def :portkey.aws.runtime-lex.-2016-11-28.post-text-response/intent-name (clojure.spec.alpha/and :portkey.aws.runtime-lex.-2016-11-28/intent-name))
(clojure.spec.alpha/def :portkey.aws.runtime-lex.-2016-11-28.post-text-response/slots (clojure.spec.alpha/and :portkey.aws.runtime-lex.-2016-11-28/string-map))
(clojure.spec.alpha/def :portkey.aws.runtime-lex.-2016-11-28.post-text-response/session-attributes (clojure.spec.alpha/and :portkey.aws.runtime-lex.-2016-11-28/string-map))
(clojure.spec.alpha/def :portkey.aws.runtime-lex.-2016-11-28.post-text-response/message (clojure.spec.alpha/and :portkey.aws.runtime-lex.-2016-11-28/text))
(clojure.spec.alpha/def :portkey.aws.runtime-lex.-2016-11-28.post-text-response/dialog-state (clojure.spec.alpha/and :portkey.aws.runtime-lex.-2016-11-28/dialog-state))
(clojure.spec.alpha/def :portkey.aws.runtime-lex.-2016-11-28.post-text-response/slot-to-elicit (clojure.spec.alpha/and :portkey.aws.runtime-lex.-2016-11-28/string))
(clojure.spec.alpha/def :portkey.aws.runtime-lex.-2016-11-28.post-text-response/response-card (clojure.spec.alpha/and :portkey.aws.runtime-lex.-2016-11-28/response-card))
(clojure.spec.alpha/def :portkey.aws.runtime-lex.-2016-11-28/post-text-response (portkey.awsgen/json-keys :req-un [] :opt-un [:portkey.aws.runtime-lex.-2016-11-28.post-text-response/intentName :portkey.aws.runtime-lex.-2016-11-28.post-text-response/slots :portkey.aws.runtime-lex.-2016-11-28.post-text-response/sessionAttributes :portkey.aws.runtime-lex.-2016-11-28.post-text-response/message :portkey.aws.runtime-lex.-2016-11-28.post-text-response/dialogState :portkey.aws.runtime-lex.-2016-11-28.post-text-response/slotToElicit :portkey.aws.runtime-lex.-2016-11-28.post-text-response/responseCard]))

(clojure.spec.alpha/def :portkey.aws.runtime-lex.-2016-11-28/generic-attachment-list (clojure.spec.alpha/coll-of :portkey.aws.runtime-lex.-2016-11-28/generic-attachment :max-count 10))

(clojure.spec.alpha/def :portkey.aws.runtime-lex.-2016-11-28/accept (clojure.spec.alpha/and clojure.core/string?))

(clojure.spec.alpha/def :portkey.aws.runtime-lex.-2016-11-28/list-of-buttons (clojure.spec.alpha/coll-of :portkey.aws.runtime-lex.-2016-11-28/button :max-count 5))

(clojure.spec.alpha/def :portkey.aws.runtime-lex.-2016-11-28.post-content-response/message (clojure.spec.alpha/and :portkey.aws.runtime-lex.-2016-11-28/text))
(clojure.spec.alpha/def :portkey.aws.runtime-lex.-2016-11-28.post-content-response/slot-to-elicit (clojure.spec.alpha/and :portkey.aws.runtime-lex.-2016-11-28/string))
(clojure.spec.alpha/def :portkey.aws.runtime-lex.-2016-11-28.post-content-response/slots (clojure.spec.alpha/and :portkey.aws.runtime-lex.-2016-11-28/string))
(clojure.spec.alpha/def :portkey.aws.runtime-lex.-2016-11-28.post-content-response/audio-stream (clojure.spec.alpha/and :portkey.aws.runtime-lex.-2016-11-28/blob-stream))
(clojure.spec.alpha/def :portkey.aws.runtime-lex.-2016-11-28.post-content-response/intent-name (clojure.spec.alpha/and :portkey.aws.runtime-lex.-2016-11-28/intent-name))
(clojure.spec.alpha/def :portkey.aws.runtime-lex.-2016-11-28.post-content-response/input-transcript (clojure.spec.alpha/and :portkey.aws.runtime-lex.-2016-11-28/string))
(clojure.spec.alpha/def :portkey.aws.runtime-lex.-2016-11-28.post-content-response/content-type (clojure.spec.alpha/and :portkey.aws.runtime-lex.-2016-11-28/http-content-type))
(clojure.spec.alpha/def :portkey.aws.runtime-lex.-2016-11-28.post-content-response/dialog-state (clojure.spec.alpha/and :portkey.aws.runtime-lex.-2016-11-28/dialog-state))
(clojure.spec.alpha/def :portkey.aws.runtime-lex.-2016-11-28.post-content-response/session-attributes (clojure.spec.alpha/and :portkey.aws.runtime-lex.-2016-11-28/string))
(clojure.spec.alpha/def :portkey.aws.runtime-lex.-2016-11-28/post-content-response (portkey.awsgen/json-keys :req-un [] :opt-un [:portkey.aws.runtime-lex.-2016-11-28.post-content-response/message :portkey.aws.runtime-lex.-2016-11-28.post-content-response/slotToElicit :portkey.aws.runtime-lex.-2016-11-28.post-content-response/slots :portkey.aws.runtime-lex.-2016-11-28.post-content-response/audioStream :portkey.aws.runtime-lex.-2016-11-28.post-content-response/intentName :portkey.aws.runtime-lex.-2016-11-28.post-content-response/inputTranscript :portkey.aws.runtime-lex.-2016-11-28.post-content-response/contentType :portkey.aws.runtime-lex.-2016-11-28.post-content-response/dialogState :portkey.aws.runtime-lex.-2016-11-28.post-content-response/sessionAttributes]))

(clojure.core/defn post-content ([input__56767__auto__] (post-content input__56767__auto__ portkey.aws/*http-client*)) ([input58086 http-client__56768__auto__] (clojure.core/let [endpoint__56769__auto__ (portkey.aws.runtime-lex.-2016-11-28/endpoints portkey.aws/*region*) sig-opts__56770__auto__ (clojure.core/into (:credential-scope endpoint__56769__auto__) portkey.aws/*credentials*)] (clojure.core/-> {:method "POST", :headers {"content-type" "application/json"}, :url (clojure.core/str (:endpoint (endpoints portkey.aws/*region*)) "/bot/{botName}/alias/{botAlias}/user/{userId}/content"), :body (clojure.spec.alpha/unform :portkey.aws.runtime-lex.-2016-11-28/PostContentRequest input58086)} (portkey.awsgen/params-to-header {"sessionAttributes" ["x-amz-lex-session-attributes" true], "contentType" ["Content-Type" nil], "accept" ["Accept" nil]}) (portkey.awsgen/params-to-uri {"botName" "botName", "botAlias" "botAlias", "userId" "userId"}) (portkey.awsgen/params-to-querystring {}) (portkey.awsgen/params-to-payload "inputStream") (clojure.core/update :body (fn* [p1__56766__56771__auto__] (clojure.core/some-> p1__56766__56771__auto__ cheshire.core/generate-string))) (portkey.aws/sign-v4 sig-opts__56770__auto__) (http-client__56768__auto__ (clojure.core/fn [response58085] (clojure.core/let [errors__56772__auto__ {"UnsupportedMediaTypeException" :portkey.aws.runtime-lex.-2016-11-28/unsupported-media-type-exception, "BadRequestException" :portkey.aws.runtime-lex.-2016-11-28/bad-request-exception, "LimitExceededException" :portkey.aws.runtime-lex.-2016-11-28/limit-exceeded-exception, "LoopDetectedException" :portkey.aws.runtime-lex.-2016-11-28/loop-detected-exception, "InternalFailureException" :portkey.aws.runtime-lex.-2016-11-28/internal-failure-exception, "ConflictException" :portkey.aws.runtime-lex.-2016-11-28/conflict-exception, "NotFoundException" :portkey.aws.runtime-lex.-2016-11-28/not-found-exception, "DependencyFailedException" :portkey.aws.runtime-lex.-2016-11-28/dependency-failed-exception, "RequestTimeoutException" :portkey.aws.runtime-lex.-2016-11-28/request-timeout-exception, "NotAcceptableException" :portkey.aws.runtime-lex.-2016-11-28/not-acceptable-exception, "BadGatewayException" :portkey.aws.runtime-lex.-2016-11-28/bad-gateway-exception}] (if (clojure.core/= nil (:status response58085)) (clojure.spec.alpha/unform :portkey.aws.runtime-lex.-2016-11-28/post-content-response (:body response58085)) (clojure.core/if-some [[type__56773__auto__ spec__56774__auto__] (clojure.core/find errors__56772__auto__ (clojure.core/get-in response58085 [:headers "x-amzn-ErrorType"]))] (clojure.core/let [m__56775__auto__ (clojure.spec.alpha/unform spec__56774__auto__ (cheshire.core/parse-string (:body response58085)))] (throw (clojure.core/ex-info (clojure.core/str type__56773__auto__ ": " (:message m__56775__auto__)) m__56775__auto__))) (throw (clojure.core/ex-info "Unexpected response" {:response response58085})))))))))))

(clojure.core/defn post-text ([input__56767__auto__] (post-text input__56767__auto__ portkey.aws/*http-client*)) ([input58088 http-client__56768__auto__] (clojure.core/let [endpoint__56769__auto__ (portkey.aws.runtime-lex.-2016-11-28/endpoints portkey.aws/*region*) sig-opts__56770__auto__ (clojure.core/into (:credential-scope endpoint__56769__auto__) portkey.aws/*credentials*)] (clojure.core/-> {:method "POST", :headers {"content-type" "application/json"}, :url (clojure.core/str (:endpoint (endpoints portkey.aws/*region*)) "/bot/{botName}/alias/{botAlias}/user/{userId}/text"), :body (clojure.spec.alpha/unform :portkey.aws.runtime-lex.-2016-11-28/PostTextRequest input58088)} (portkey.awsgen/params-to-header {}) (portkey.awsgen/params-to-uri {"botName" "botName", "botAlias" "botAlias", "userId" "userId"}) (portkey.awsgen/params-to-querystring {}) (portkey.awsgen/params-to-payload nil) (clojure.core/update :body (fn* [p1__56766__56771__auto__] (clojure.core/some-> p1__56766__56771__auto__ cheshire.core/generate-string))) (portkey.aws/sign-v4 sig-opts__56770__auto__) (http-client__56768__auto__ (clojure.core/fn [response58087] (clojure.core/let [errors__56772__auto__ {"NotFoundException" :portkey.aws.runtime-lex.-2016-11-28/not-found-exception, "BadRequestException" :portkey.aws.runtime-lex.-2016-11-28/bad-request-exception, "LimitExceededException" :portkey.aws.runtime-lex.-2016-11-28/limit-exceeded-exception, "InternalFailureException" :portkey.aws.runtime-lex.-2016-11-28/internal-failure-exception, "ConflictException" :portkey.aws.runtime-lex.-2016-11-28/conflict-exception, "DependencyFailedException" :portkey.aws.runtime-lex.-2016-11-28/dependency-failed-exception, "BadGatewayException" :portkey.aws.runtime-lex.-2016-11-28/bad-gateway-exception, "LoopDetectedException" :portkey.aws.runtime-lex.-2016-11-28/loop-detected-exception}] (if (clojure.core/= nil (:status response58087)) (clojure.spec.alpha/unform :portkey.aws.runtime-lex.-2016-11-28/post-text-response (:body response58087)) (clojure.core/if-some [[type__56773__auto__ spec__56774__auto__] (clojure.core/find errors__56772__auto__ (clojure.core/get-in response58087 [:headers "x-amzn-ErrorType"]))] (clojure.core/let [m__56775__auto__ (clojure.spec.alpha/unform spec__56774__auto__ (cheshire.core/parse-string (:body response58087)))] (throw (clojure.core/ex-info (clojure.core/str type__56773__auto__ ": " (:message m__56775__auto__)) m__56775__auto__))) (throw (clojure.core/ex-info "Unexpected response" {:response response58087})))))))))))
