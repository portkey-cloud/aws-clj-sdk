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

(clojure.core/declare ser-string-map)

(clojure.core/declare ser-bot-alias)

(clojure.core/declare ser-user-id)

(clojure.core/declare ser-bot-name)

(clojure.core/declare ser-blob-stream)

(clojure.core/declare ser-string)

(clojure.core/declare ser-http-content-type)

(clojure.core/declare ser-text)

(clojure.core/declare ser-attributes-string)

(clojure.core/declare ser-accept)

(clojure.core/defn- ser-string-map [input] #:http.request.field{:value (clojure.core/into [] (clojure.core/map (clojure.core/fn [[k v]] [(clojure.core/into (ser-string k) #:http.request.field{:map-info "key", :shape "String"}) (clojure.core/into (ser-string v) #:http.request.field{:map-info "value", :shape "String"})])) input), :shape "StringMap", :type "map", :sensitive true})

(clojure.core/defn- ser-bot-alias [input] #:http.request.field{:value input, :shape "BotAlias"})

(clojure.core/defn- ser-user-id [input] #:http.request.field{:value input, :shape "UserId"})

(clojure.core/defn- ser-bot-name [input] #:http.request.field{:value input, :shape "BotName"})

(clojure.core/defn- ser-blob-stream [input] #:http.request.field{:value (portkey.aws/base64-encode input), :shape "BlobStream"})

(clojure.core/defn- ser-string [input] #:http.request.field{:value input, :shape "String"})

(clojure.core/defn- ser-http-content-type [input] #:http.request.field{:value input, :shape "HttpContentType"})

(clojure.core/defn- ser-text [input] #:http.request.field{:value input, :shape "Text"})

(clojure.core/defn- ser-attributes-string [input] #:http.request.field{:value input, :shape "AttributesString"})

(clojure.core/defn- ser-accept [input] #:http.request.field{:value input, :shape "Accept"})

(clojure.core/defn- req-post-text-request [input] (clojure.core/cond-> #:http.request.configuration{:uri [(clojure.core/into (ser-bot-name (input :bot-name)) #:http.request.field{:name "botName", :shape "BotName", :location "uri", :location-name "botName"}) (clojure.core/into (ser-bot-alias (input :bot-alias)) #:http.request.field{:name "botAlias", :shape "BotAlias", :location "uri", :location-name "botAlias"}) (clojure.core/into (ser-user-id (input :user-id)) #:http.request.field{:name "userId", :shape "UserId", :location "uri", :location-name "userId"})], :body [(clojure.core/into (ser-text (input :input-text)) #:http.request.field{:name "inputText", :shape "Text"})]} (clojure.core/contains? input :session-attributes) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-string-map (input :session-attributes)) #:http.request.field{:name "sessionAttributes", :shape "StringMap"})) (clojure.core/contains? input :request-attributes) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-string-map (input :request-attributes)) #:http.request.field{:name "requestAttributes", :shape "StringMap"}))))

(clojure.core/defn- req-post-content-request [input] (clojure.core/cond-> #:http.request.configuration{:uri [(clojure.core/into (ser-bot-name (input :bot-name)) #:http.request.field{:name "botName", :shape "BotName", :location "uri", :location-name "botName"}) (clojure.core/into (ser-bot-alias (input :bot-alias)) #:http.request.field{:name "botAlias", :shape "BotAlias", :location "uri", :location-name "botAlias"}) (clojure.core/into (ser-user-id (input :user-id)) #:http.request.field{:name "userId", :shape "UserId", :location "uri", :location-name "userId"})], :header [(clojure.core/into (ser-http-content-type (input :content-type)) #:http.request.field{:name "contentType", :shape "HttpContentType", :location "header", :location-name "Content-Type"})], :body [(clojure.core/into (ser-blob-stream (input :input-stream)) #:http.request.field{:name "inputStream", :shape "BlobStream"})]} (clojure.core/contains? input :session-attributes) (clojure.core/update-in [:http.request.configuration/header] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-attributes-string (input :session-attributes)) #:http.request.field{:name "sessionAttributes", :shape "AttributesString", :jsonvalue true, :location "header", :location-name "x-amz-lex-session-attributes"})) (clojure.core/contains? input :request-attributes) (clojure.core/update-in [:http.request.configuration/header] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-attributes-string (input :request-attributes)) #:http.request.field{:name "requestAttributes", :shape "AttributesString", :jsonvalue true, :location "header", :location-name "x-amz-lex-request-attributes"})) (clojure.core/contains? input :accept) (clojure.core/update-in [:http.request.configuration/header] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-accept (input :accept)) #:http.request.field{:name "accept", :shape "Accept", :location "header", :location-name "Accept"}))))

(clojure.core/declare deser-string-with-length)

(clojure.core/declare deser-string-map)

(clojure.core/declare deser-button)

(clojure.core/declare deser-generic-attachment)

(clojure.core/declare deser-string-url-with-length)

(clojure.core/declare deser-intent-name)

(clojure.core/declare deser-response-card)

(clojure.core/declare deser-error-message)

(clojure.core/declare deser-dialog-state)

(clojure.core/declare deser-content-type)

(clojure.core/declare deser-blob-stream)

(clojure.core/declare deser-string)

(clojure.core/declare deser-button-text-string-with-length)

(clojure.core/declare deser-http-content-type)

(clojure.core/declare deser-button-value-string-with-length)

(clojure.core/declare deser-text)

(clojure.core/declare desergeneric-attachment-list)

(clojure.core/declare deserlist-of-buttons)

(clojure.core/declare deser-message-format-type)

(clojure.core/defn- deser-string-with-length [input] input)

(clojure.core/defn- deser-string-map [input] (clojure.core/into {} (clojure.core/map (clojure.core/fn [[k v]] [(deser-string k) (deser-string v)])) input))

(clojure.core/defn- deser-button [input] (clojure.core/cond-> {:text (deser-button-text-string-with-length (input "text")), :value (deser-button-value-string-with-length (input "value"))}))

(clojure.core/defn- deser-generic-attachment [input] (clojure.core/cond-> {} (clojure.core/contains? input "title") (clojure.core/assoc :title (deser-string-with-length (input "title"))) (clojure.core/contains? input "subTitle") (clojure.core/assoc :sub-title (deser-string-with-length (input "subTitle"))) (clojure.core/contains? input "attachmentLinkUrl") (clojure.core/assoc :attachment-link-url (deser-string-url-with-length (input "attachmentLinkUrl"))) (clojure.core/contains? input "imageUrl") (clojure.core/assoc :image-url (deser-string-url-with-length (input "imageUrl"))) (clojure.core/contains? input "buttons") (clojure.core/assoc :buttons (deserlist-of-buttons (input "buttons")))))

(clojure.core/defn- deser-string-url-with-length [input] input)

(clojure.core/defn- deser-intent-name [input] input)

(clojure.core/defn- deser-response-card [input] (clojure.core/cond-> {} (clojure.core/contains? input "version") (clojure.core/assoc :version (deser-string (input "version"))) (clojure.core/contains? input "contentType") (clojure.core/assoc :content-type (deser-content-type (input "contentType"))) (clojure.core/contains? input "genericAttachments") (clojure.core/assoc :generic-attachments (desergeneric-attachment-list (input "genericAttachments")))))

(clojure.core/defn- deser-error-message [input] input)

(clojure.core/defn- deser-dialog-state [input] (clojure.core/get {"ElicitIntent" :elicit-intent, "ConfirmIntent" :confirm-intent, "ElicitSlot" :elicit-slot, "Fulfilled" :fulfilled, "ReadyForFulfillment" :ready-for-fulfillment, "Failed" :failed} input))

(clojure.core/defn- deser-content-type [input] (clojure.core/get {"application/vnd.amazonaws.card.generic" :applicationvndamazonawscardgeneric} input))

(clojure.core/defn- deser-blob-stream [input] (portkey.aws/base64-decode input))

(clojure.core/defn- deser-string [input] input)

(clojure.core/defn- deser-button-text-string-with-length [input] input)

(clojure.core/defn- deser-http-content-type [input] input)

(clojure.core/defn- deser-button-value-string-with-length [input] input)

(clojure.core/defn- deser-text [input] input)

(clojure.core/defn- desergeneric-attachment-list [input] (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (deser-generic-attachment coll))) input))

(clojure.core/defn- deserlist-of-buttons [input] (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (deser-button coll))) input))

(clojure.core/defn- deser-message-format-type [input] (clojure.core/get {"PlainText" :plain-text, "CustomPayload" :custom-payload, "SSML" :ssml, "Composite" :composite} input))

(clojure.core/defn- response-unsupported-media-type-exception ([input] (response-unsupported-media-type-exception nil input)) ([resultWrapper451698 input] (clojure.core/let [rawinput451697 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar451699 {"message" (rawinput451697 "message")}] (clojure.core/cond-> {} (letvar451699 "message") (clojure.core/assoc :message (deser-string (clojure.core/get-in letvar451699 ["message"])))))))

(clojure.core/defn- response-bad-request-exception ([input] (response-bad-request-exception nil input)) ([resultWrapper451701 input] (clojure.core/let [rawinput451700 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar451702 {"message" (rawinput451700 "message")}] (clojure.core/cond-> {} (letvar451702 "message") (clojure.core/assoc :message (deser-string (clojure.core/get-in letvar451702 ["message"])))))))

(clojure.core/defn- response-limit-exceeded-exception ([input] (response-limit-exceeded-exception nil input)) ([resultWrapper451704 input] (clojure.core/let [rawinput451703 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar451705 {"Retry-After" (clojure.core/get-in input [:headers "Retry-After"]), "message" (rawinput451703 "message")}] (clojure.core/cond-> {} (letvar451705 "Retry-After") (clojure.core/assoc :retry-after-seconds (deser-string (clojure.core/get-in letvar451705 ["Retry-After"]))) (letvar451705 "message") (clojure.core/assoc :message (deser-string (clojure.core/get-in letvar451705 ["message"])))))))

(clojure.core/defn- response-loop-detected-exception ([input] (response-loop-detected-exception nil input)) ([resultWrapper451707 input] (clojure.core/let [rawinput451706 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar451708 {"Message" (rawinput451706 "Message")}] (clojure.core/cond-> {} (letvar451708 "Message") (clojure.core/assoc :message (deser-error-message (clojure.core/get-in letvar451708 ["Message"])))))))

(clojure.core/defn- response-internal-failure-exception ([input] (response-internal-failure-exception nil input)) ([resultWrapper451710 input] (clojure.core/let [rawinput451709 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar451711 {"message" (rawinput451709 "message")}] (clojure.core/cond-> {} (letvar451711 "message") (clojure.core/assoc :message (deser-string (clojure.core/get-in letvar451711 ["message"])))))))

(clojure.core/defn- response-conflict-exception ([input] (response-conflict-exception nil input)) ([resultWrapper451713 input] (clojure.core/let [rawinput451712 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar451714 {"message" (rawinput451712 "message")}] (clojure.core/cond-> {} (letvar451714 "message") (clojure.core/assoc :message (deser-string (clojure.core/get-in letvar451714 ["message"])))))))

(clojure.core/defn- response-not-found-exception ([input] (response-not-found-exception nil input)) ([resultWrapper451716 input] (clojure.core/let [rawinput451715 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar451717 {"message" (rawinput451715 "message")}] (clojure.core/cond-> {} (letvar451717 "message") (clojure.core/assoc :message (deser-string (clojure.core/get-in letvar451717 ["message"])))))))

(clojure.core/defn- response-dependency-failed-exception ([input] (response-dependency-failed-exception nil input)) ([resultWrapper451719 input] (clojure.core/let [rawinput451718 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar451720 {"Message" (rawinput451718 "Message")}] (clojure.core/cond-> {} (letvar451720 "Message") (clojure.core/assoc :message (deser-error-message (clojure.core/get-in letvar451720 ["Message"])))))))

(clojure.core/defn- response-request-timeout-exception ([input] (response-request-timeout-exception nil input)) ([resultWrapper451722 input] (clojure.core/let [rawinput451721 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar451723 {"message" (rawinput451721 "message")}] (clojure.core/cond-> {} (letvar451723 "message") (clojure.core/assoc :message (deser-string (clojure.core/get-in letvar451723 ["message"])))))))

(clojure.core/defn- response-not-acceptable-exception ([input] (response-not-acceptable-exception nil input)) ([resultWrapper451725 input] (clojure.core/let [rawinput451724 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar451726 {"message" (rawinput451724 "message")}] (clojure.core/cond-> {} (letvar451726 "message") (clojure.core/assoc :message (deser-string (clojure.core/get-in letvar451726 ["message"])))))))

(clojure.core/defn- response-bad-gateway-exception ([input] (response-bad-gateway-exception nil input)) ([resultWrapper451728 input] (clojure.core/let [rawinput451727 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar451729 {"Message" (rawinput451727 "Message")}] (clojure.core/cond-> {} (letvar451729 "Message") (clojure.core/assoc :message (deser-error-message (clojure.core/get-in letvar451729 ["Message"])))))))

(clojure.core/defn- response-post-text-response ([input] (response-post-text-response nil input)) ([resultWrapper451731 input] (clojure.core/let [rawinput451730 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar451732 {"intentName" (rawinput451730 "intentName"), "slots" (rawinput451730 "slots"), "sessionAttributes" (rawinput451730 "sessionAttributes"), "message" (rawinput451730 "message"), "messageFormat" (rawinput451730 "messageFormat"), "dialogState" (rawinput451730 "dialogState"), "slotToElicit" (rawinput451730 "slotToElicit"), "responseCard" (rawinput451730 "responseCard")}] (clojure.core/cond-> {} (letvar451732 "intentName") (clojure.core/assoc :intent-name (deser-intent-name (clojure.core/get-in letvar451732 ["intentName"]))) (letvar451732 "slots") (clojure.core/assoc :slots (deser-string-map (clojure.core/get-in letvar451732 ["slots"]))) (letvar451732 "sessionAttributes") (clojure.core/assoc :session-attributes (deser-string-map (clojure.core/get-in letvar451732 ["sessionAttributes"]))) (letvar451732 "message") (clojure.core/assoc :message (deser-text (clojure.core/get-in letvar451732 ["message"]))) (letvar451732 "messageFormat") (clojure.core/assoc :message-format (deser-message-format-type (clojure.core/get-in letvar451732 ["messageFormat"]))) (letvar451732 "dialogState") (clojure.core/assoc :dialog-state (deser-dialog-state (clojure.core/get-in letvar451732 ["dialogState"]))) (letvar451732 "slotToElicit") (clojure.core/assoc :slot-to-elicit (deser-string (clojure.core/get-in letvar451732 ["slotToElicit"]))) (letvar451732 "responseCard") (clojure.core/assoc :response-card (deser-response-card (clojure.core/get-in letvar451732 ["responseCard"])))))))

(clojure.core/defn- response-post-content-response ([input] (response-post-content-response nil input)) ([resultWrapper451734 input] (clojure.core/let [rawinput451733 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar451735 {"x-amz-lex-slots" (clojure.core/get-in input [:headers "x-amz-lex-slots"]), "audioStream" (rawinput451733 "audioStream"), "x-amz-lex-intent-name" (clojure.core/get-in input [:headers "x-amz-lex-intent-name"]), "x-amz-lex-session-attributes" (clojure.core/get-in input [:headers "x-amz-lex-session-attributes"]), "x-amz-lex-slot-to-elicit" (clojure.core/get-in input [:headers "x-amz-lex-slot-to-elicit"]), "x-amz-lex-message-format" (clojure.core/get-in input [:headers "x-amz-lex-message-format"]), "x-amz-lex-message" (clojure.core/get-in input [:headers "x-amz-lex-message"]), "Content-Type" (clojure.core/get-in input [:headers "Content-Type"]), "x-amz-lex-dialog-state" (clojure.core/get-in input [:headers "x-amz-lex-dialog-state"]), "x-amz-lex-input-transcript" (clojure.core/get-in input [:headers "x-amz-lex-input-transcript"])}] (clojure.core/cond-> {} (letvar451735 "x-amz-lex-message") (clojure.core/assoc :message (deser-text (clojure.core/get-in letvar451735 ["x-amz-lex-message"]))) (letvar451735 "x-amz-lex-slot-to-elicit") (clojure.core/assoc :slot-to-elicit (deser-string (clojure.core/get-in letvar451735 ["x-amz-lex-slot-to-elicit"]))) (letvar451735 "x-amz-lex-slots") (clojure.core/assoc :slots (deser-string (clojure.core/get-in letvar451735 ["x-amz-lex-slots"]))) (letvar451735 "audioStream") (clojure.core/assoc :audio-stream (deser-blob-stream (clojure.core/get-in letvar451735 ["audioStream"]))) (letvar451735 "x-amz-lex-intent-name") (clojure.core/assoc :intent-name (deser-intent-name (clojure.core/get-in letvar451735 ["x-amz-lex-intent-name"]))) (letvar451735 "x-amz-lex-message-format") (clojure.core/assoc :message-format (deser-message-format-type (clojure.core/get-in letvar451735 ["x-amz-lex-message-format"]))) (letvar451735 "x-amz-lex-input-transcript") (clojure.core/assoc :input-transcript (deser-string (clojure.core/get-in letvar451735 ["x-amz-lex-input-transcript"]))) (letvar451735 "Content-Type") (clojure.core/assoc :content-type (deser-http-content-type (clojure.core/get-in letvar451735 ["Content-Type"]))) (letvar451735 "x-amz-lex-dialog-state") (clojure.core/assoc :dialog-state (deser-dialog-state (clojure.core/get-in letvar451735 ["x-amz-lex-dialog-state"]))) (letvar451735 "x-amz-lex-session-attributes") (clojure.core/assoc :session-attributes (deser-string (clojure.core/get-in letvar451735 ["x-amz-lex-session-attributes"])))))))

(clojure.spec.alpha/def :portkey.aws.runtime-lex.-2016-11-28.unsupported-media-type-exception/message (clojure.spec.alpha/and :portkey.aws.runtime-lex.-2016-11-28/string))
(clojure.spec.alpha/def :portkey.aws.runtime-lex.-2016-11-28/unsupported-media-type-exception (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.runtime-lex.-2016-11-28.unsupported-media-type-exception/message]))

(clojure.spec.alpha/def :portkey.aws.runtime-lex.-2016-11-28/string-with-length (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__21110__auto__] (clojure.core/<= 1 (clojure.core/count s__21110__auto__))) (clojure.core/fn [s__21111__auto__] (clojure.core/< (clojure.core/count s__21111__auto__) 80))))

(clojure.spec.alpha/def :portkey.aws.runtime-lex.-2016-11-28/string-map (clojure.spec.alpha/map-of :portkey.aws.runtime-lex.-2016-11-28/string :portkey.aws.runtime-lex.-2016-11-28/string))

(clojure.spec.alpha/def :portkey.aws.runtime-lex.-2016-11-28.bad-request-exception/message (clojure.spec.alpha/and :portkey.aws.runtime-lex.-2016-11-28/string))
(clojure.spec.alpha/def :portkey.aws.runtime-lex.-2016-11-28/bad-request-exception (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.runtime-lex.-2016-11-28.bad-request-exception/message]))

(clojure.spec.alpha/def :portkey.aws.runtime-lex.-2016-11-28.button/text (clojure.spec.alpha/and :portkey.aws.runtime-lex.-2016-11-28/button-text-string-with-length))
(clojure.spec.alpha/def :portkey.aws.runtime-lex.-2016-11-28.button/value (clojure.spec.alpha/and :portkey.aws.runtime-lex.-2016-11-28/button-value-string-with-length))
(clojure.spec.alpha/def :portkey.aws.runtime-lex.-2016-11-28/button (clojure.spec.alpha/keys :req-un [:portkey.aws.runtime-lex.-2016-11-28.button/text :portkey.aws.runtime-lex.-2016-11-28.button/value] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.runtime-lex.-2016-11-28.post-text-request/bot-name (clojure.spec.alpha/and :portkey.aws.runtime-lex.-2016-11-28/bot-name))
(clojure.spec.alpha/def :portkey.aws.runtime-lex.-2016-11-28.post-text-request/bot-alias (clojure.spec.alpha/and :portkey.aws.runtime-lex.-2016-11-28/bot-alias))
(clojure.spec.alpha/def :portkey.aws.runtime-lex.-2016-11-28.post-text-request/user-id (clojure.spec.alpha/and :portkey.aws.runtime-lex.-2016-11-28/user-id))
(clojure.spec.alpha/def :portkey.aws.runtime-lex.-2016-11-28.post-text-request/session-attributes (clojure.spec.alpha/and :portkey.aws.runtime-lex.-2016-11-28/string-map))
(clojure.spec.alpha/def :portkey.aws.runtime-lex.-2016-11-28.post-text-request/request-attributes (clojure.spec.alpha/and :portkey.aws.runtime-lex.-2016-11-28/string-map))
(clojure.spec.alpha/def :portkey.aws.runtime-lex.-2016-11-28.post-text-request/input-text (clojure.spec.alpha/and :portkey.aws.runtime-lex.-2016-11-28/text))
(clojure.spec.alpha/def :portkey.aws.runtime-lex.-2016-11-28/post-text-request (clojure.spec.alpha/keys :req-un [:portkey.aws.runtime-lex.-2016-11-28.post-text-request/bot-name :portkey.aws.runtime-lex.-2016-11-28.post-text-request/bot-alias :portkey.aws.runtime-lex.-2016-11-28.post-text-request/user-id :portkey.aws.runtime-lex.-2016-11-28.post-text-request/input-text] :opt-un [:portkey.aws.runtime-lex.-2016-11-28.post-text-request/session-attributes :portkey.aws.runtime-lex.-2016-11-28.post-text-request/request-attributes]))

(clojure.spec.alpha/def :portkey.aws.runtime-lex.-2016-11-28.generic-attachment/title (clojure.spec.alpha/and :portkey.aws.runtime-lex.-2016-11-28/string-with-length))
(clojure.spec.alpha/def :portkey.aws.runtime-lex.-2016-11-28.generic-attachment/sub-title (clojure.spec.alpha/and :portkey.aws.runtime-lex.-2016-11-28/string-with-length))
(clojure.spec.alpha/def :portkey.aws.runtime-lex.-2016-11-28.generic-attachment/attachment-link-url (clojure.spec.alpha/and :portkey.aws.runtime-lex.-2016-11-28/string-url-with-length))
(clojure.spec.alpha/def :portkey.aws.runtime-lex.-2016-11-28.generic-attachment/image-url (clojure.spec.alpha/and :portkey.aws.runtime-lex.-2016-11-28/string-url-with-length))
(clojure.spec.alpha/def :portkey.aws.runtime-lex.-2016-11-28.generic-attachment/buttons (clojure.spec.alpha/and :portkey.aws.runtime-lex.-2016-11-28/list-of-buttons))
(clojure.spec.alpha/def :portkey.aws.runtime-lex.-2016-11-28/generic-attachment (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.runtime-lex.-2016-11-28.generic-attachment/title :portkey.aws.runtime-lex.-2016-11-28.generic-attachment/sub-title :portkey.aws.runtime-lex.-2016-11-28.generic-attachment/attachment-link-url :portkey.aws.runtime-lex.-2016-11-28.generic-attachment/image-url :portkey.aws.runtime-lex.-2016-11-28.generic-attachment/buttons]))

(clojure.spec.alpha/def :portkey.aws.runtime-lex.-2016-11-28/bot-alias (clojure.spec.alpha/and clojure.core/string?))

(clojure.spec.alpha/def :portkey.aws.runtime-lex.-2016-11-28/user-id (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__21110__auto__] (clojure.core/<= 2 (clojure.core/count s__21110__auto__))) (clojure.core/fn [s__21111__auto__] (clojure.core/< (clojure.core/count s__21111__auto__) 100)) (clojure.core/fn [s__21112__auto__] (clojure.core/re-matches #"[0-9a-zA-Z._:-]+" s__21112__auto__))))

(clojure.spec.alpha/def :portkey.aws.runtime-lex.-2016-11-28/string-url-with-length (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__21110__auto__] (clojure.core/<= 1 (clojure.core/count s__21110__auto__))) (clojure.core/fn [s__21111__auto__] (clojure.core/< (clojure.core/count s__21111__auto__) 2048))))

(clojure.spec.alpha/def :portkey.aws.runtime-lex.-2016-11-28/intent-name (clojure.spec.alpha/and clojure.core/string?))

(clojure.spec.alpha/def :portkey.aws.runtime-lex.-2016-11-28.limit-exceeded-exception/retry-after-seconds (clojure.spec.alpha/and :portkey.aws.runtime-lex.-2016-11-28/string))
(clojure.spec.alpha/def :portkey.aws.runtime-lex.-2016-11-28.limit-exceeded-exception/message (clojure.spec.alpha/and :portkey.aws.runtime-lex.-2016-11-28/string))
(clojure.spec.alpha/def :portkey.aws.runtime-lex.-2016-11-28/limit-exceeded-exception (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.runtime-lex.-2016-11-28.limit-exceeded-exception/retry-after-seconds :portkey.aws.runtime-lex.-2016-11-28.limit-exceeded-exception/message]))

(clojure.spec.alpha/def :portkey.aws.runtime-lex.-2016-11-28.post-content-request/bot-name (clojure.spec.alpha/and :portkey.aws.runtime-lex.-2016-11-28/bot-name))
(clojure.spec.alpha/def :portkey.aws.runtime-lex.-2016-11-28.post-content-request/bot-alias (clojure.spec.alpha/and :portkey.aws.runtime-lex.-2016-11-28/bot-alias))
(clojure.spec.alpha/def :portkey.aws.runtime-lex.-2016-11-28.post-content-request/user-id (clojure.spec.alpha/and :portkey.aws.runtime-lex.-2016-11-28/user-id))
(clojure.spec.alpha/def :portkey.aws.runtime-lex.-2016-11-28.post-content-request/session-attributes (clojure.spec.alpha/and :portkey.aws.runtime-lex.-2016-11-28/attributes-string))
(clojure.spec.alpha/def :portkey.aws.runtime-lex.-2016-11-28.post-content-request/request-attributes (clojure.spec.alpha/and :portkey.aws.runtime-lex.-2016-11-28/attributes-string))
(clojure.spec.alpha/def :portkey.aws.runtime-lex.-2016-11-28.post-content-request/content-type (clojure.spec.alpha/and :portkey.aws.runtime-lex.-2016-11-28/http-content-type))
(clojure.spec.alpha/def :portkey.aws.runtime-lex.-2016-11-28.post-content-request/accept (clojure.spec.alpha/and :portkey.aws.runtime-lex.-2016-11-28/accept))
(clojure.spec.alpha/def :portkey.aws.runtime-lex.-2016-11-28.post-content-request/input-stream (clojure.spec.alpha/and :portkey.aws.runtime-lex.-2016-11-28/blob-stream))
(clojure.spec.alpha/def :portkey.aws.runtime-lex.-2016-11-28/post-content-request (clojure.spec.alpha/keys :req-un [:portkey.aws.runtime-lex.-2016-11-28.post-content-request/bot-name :portkey.aws.runtime-lex.-2016-11-28.post-content-request/bot-alias :portkey.aws.runtime-lex.-2016-11-28.post-content-request/user-id :portkey.aws.runtime-lex.-2016-11-28.post-content-request/content-type :portkey.aws.runtime-lex.-2016-11-28.post-content-request/input-stream] :opt-un [:portkey.aws.runtime-lex.-2016-11-28.post-content-request/session-attributes :portkey.aws.runtime-lex.-2016-11-28.post-content-request/request-attributes :portkey.aws.runtime-lex.-2016-11-28.post-content-request/accept]))

(clojure.spec.alpha/def :portkey.aws.runtime-lex.-2016-11-28.response-card/version (clojure.spec.alpha/and :portkey.aws.runtime-lex.-2016-11-28/string))
(clojure.spec.alpha/def :portkey.aws.runtime-lex.-2016-11-28.response-card/content-type (clojure.spec.alpha/and :portkey.aws.runtime-lex.-2016-11-28/content-type))
(clojure.spec.alpha/def :portkey.aws.runtime-lex.-2016-11-28.response-card/generic-attachments (clojure.spec.alpha/and :portkey.aws.runtime-lex.-2016-11-28/generic-attachment-list))
(clojure.spec.alpha/def :portkey.aws.runtime-lex.-2016-11-28/response-card (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.runtime-lex.-2016-11-28.response-card/version :portkey.aws.runtime-lex.-2016-11-28.response-card/content-type :portkey.aws.runtime-lex.-2016-11-28.response-card/generic-attachments]))

(clojure.spec.alpha/def :portkey.aws.runtime-lex.-2016-11-28.loop-detected-exception/message (clojure.spec.alpha/and :portkey.aws.runtime-lex.-2016-11-28/error-message))
(clojure.spec.alpha/def :portkey.aws.runtime-lex.-2016-11-28/loop-detected-exception (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.runtime-lex.-2016-11-28.loop-detected-exception/message]))

(clojure.spec.alpha/def :portkey.aws.runtime-lex.-2016-11-28/error-message (clojure.spec.alpha/and clojure.core/string?))

(clojure.spec.alpha/def :portkey.aws.runtime-lex.-2016-11-28/dialog-state #{"Fulfilled" "Failed" "ConfirmIntent" "ReadyForFulfillment" :elicit-slot :elicit-intent "ElicitSlot" "ElicitIntent" :fulfilled :confirm-intent :ready-for-fulfillment :failed})

(clojure.spec.alpha/def :portkey.aws.runtime-lex.-2016-11-28/content-type #{:applicationvndamazonawscardgeneric "application/vnd.amazonaws.card.generic"})

(clojure.spec.alpha/def :portkey.aws.runtime-lex.-2016-11-28.internal-failure-exception/message (clojure.spec.alpha/and :portkey.aws.runtime-lex.-2016-11-28/string))
(clojure.spec.alpha/def :portkey.aws.runtime-lex.-2016-11-28/internal-failure-exception (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.runtime-lex.-2016-11-28.internal-failure-exception/message]))

(clojure.spec.alpha/def :portkey.aws.runtime-lex.-2016-11-28.conflict-exception/message (clojure.spec.alpha/and :portkey.aws.runtime-lex.-2016-11-28/string))
(clojure.spec.alpha/def :portkey.aws.runtime-lex.-2016-11-28/conflict-exception (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.runtime-lex.-2016-11-28.conflict-exception/message]))

(clojure.spec.alpha/def :portkey.aws.runtime-lex.-2016-11-28.not-found-exception/message (clojure.spec.alpha/and :portkey.aws.runtime-lex.-2016-11-28/string))
(clojure.spec.alpha/def :portkey.aws.runtime-lex.-2016-11-28/not-found-exception (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.runtime-lex.-2016-11-28.not-found-exception/message]))

(clojure.spec.alpha/def :portkey.aws.runtime-lex.-2016-11-28/bot-name (clojure.spec.alpha/and clojure.core/string?))

(clojure.spec.alpha/def :portkey.aws.runtime-lex.-2016-11-28/blob-stream clojure.core/bytes?)

(clojure.spec.alpha/def :portkey.aws.runtime-lex.-2016-11-28/string (clojure.spec.alpha/and clojure.core/string?))

(clojure.spec.alpha/def :portkey.aws.runtime-lex.-2016-11-28.dependency-failed-exception/message (clojure.spec.alpha/and :portkey.aws.runtime-lex.-2016-11-28/error-message))
(clojure.spec.alpha/def :portkey.aws.runtime-lex.-2016-11-28/dependency-failed-exception (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.runtime-lex.-2016-11-28.dependency-failed-exception/message]))

(clojure.spec.alpha/def :portkey.aws.runtime-lex.-2016-11-28.request-timeout-exception/message (clojure.spec.alpha/and :portkey.aws.runtime-lex.-2016-11-28/string))
(clojure.spec.alpha/def :portkey.aws.runtime-lex.-2016-11-28/request-timeout-exception (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.runtime-lex.-2016-11-28.request-timeout-exception/message]))

(clojure.spec.alpha/def :portkey.aws.runtime-lex.-2016-11-28/button-text-string-with-length (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__21110__auto__] (clojure.core/<= 1 (clojure.core/count s__21110__auto__))) (clojure.core/fn [s__21111__auto__] (clojure.core/< (clojure.core/count s__21111__auto__) 15))))

(clojure.spec.alpha/def :portkey.aws.runtime-lex.-2016-11-28/http-content-type (clojure.spec.alpha/and clojure.core/string?))

(clojure.spec.alpha/def :portkey.aws.runtime-lex.-2016-11-28/button-value-string-with-length (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__21110__auto__] (clojure.core/<= 1 (clojure.core/count s__21110__auto__))) (clojure.core/fn [s__21111__auto__] (clojure.core/< (clojure.core/count s__21111__auto__) 1000))))

(clojure.spec.alpha/def :portkey.aws.runtime-lex.-2016-11-28.not-acceptable-exception/message (clojure.spec.alpha/and :portkey.aws.runtime-lex.-2016-11-28/string))
(clojure.spec.alpha/def :portkey.aws.runtime-lex.-2016-11-28/not-acceptable-exception (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.runtime-lex.-2016-11-28.not-acceptable-exception/message]))

(clojure.spec.alpha/def :portkey.aws.runtime-lex.-2016-11-28/text (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__21110__auto__] (clojure.core/<= 1 (clojure.core/count s__21110__auto__))) (clojure.core/fn [s__21111__auto__] (clojure.core/< (clojure.core/count s__21111__auto__) 1024))))

(clojure.spec.alpha/def :portkey.aws.runtime-lex.-2016-11-28/attributes-string (clojure.spec.alpha/and clojure.core/string?))

(clojure.spec.alpha/def :portkey.aws.runtime-lex.-2016-11-28.bad-gateway-exception/message (clojure.spec.alpha/and :portkey.aws.runtime-lex.-2016-11-28/error-message))
(clojure.spec.alpha/def :portkey.aws.runtime-lex.-2016-11-28/bad-gateway-exception (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.runtime-lex.-2016-11-28.bad-gateway-exception/message]))

(clojure.spec.alpha/def :portkey.aws.runtime-lex.-2016-11-28.post-text-response/intent-name (clojure.spec.alpha/and :portkey.aws.runtime-lex.-2016-11-28/intent-name))
(clojure.spec.alpha/def :portkey.aws.runtime-lex.-2016-11-28.post-text-response/slots (clojure.spec.alpha/and :portkey.aws.runtime-lex.-2016-11-28/string-map))
(clojure.spec.alpha/def :portkey.aws.runtime-lex.-2016-11-28.post-text-response/session-attributes (clojure.spec.alpha/and :portkey.aws.runtime-lex.-2016-11-28/string-map))
(clojure.spec.alpha/def :portkey.aws.runtime-lex.-2016-11-28.post-text-response/message (clojure.spec.alpha/and :portkey.aws.runtime-lex.-2016-11-28/text))
(clojure.spec.alpha/def :portkey.aws.runtime-lex.-2016-11-28.post-text-response/message-format (clojure.spec.alpha/and :portkey.aws.runtime-lex.-2016-11-28/message-format-type))
(clojure.spec.alpha/def :portkey.aws.runtime-lex.-2016-11-28.post-text-response/dialog-state (clojure.spec.alpha/and :portkey.aws.runtime-lex.-2016-11-28/dialog-state))
(clojure.spec.alpha/def :portkey.aws.runtime-lex.-2016-11-28.post-text-response/slot-to-elicit (clojure.spec.alpha/and :portkey.aws.runtime-lex.-2016-11-28/string))
(clojure.spec.alpha/def :portkey.aws.runtime-lex.-2016-11-28.post-text-response/response-card (clojure.spec.alpha/and :portkey.aws.runtime-lex.-2016-11-28/response-card))
(clojure.spec.alpha/def :portkey.aws.runtime-lex.-2016-11-28/post-text-response (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.runtime-lex.-2016-11-28.post-text-response/intent-name :portkey.aws.runtime-lex.-2016-11-28.post-text-response/slots :portkey.aws.runtime-lex.-2016-11-28.post-text-response/session-attributes :portkey.aws.runtime-lex.-2016-11-28.post-text-response/message :portkey.aws.runtime-lex.-2016-11-28.post-text-response/message-format :portkey.aws.runtime-lex.-2016-11-28.post-text-response/dialog-state :portkey.aws.runtime-lex.-2016-11-28.post-text-response/slot-to-elicit :portkey.aws.runtime-lex.-2016-11-28.post-text-response/response-card]))

(clojure.spec.alpha/def :portkey.aws.runtime-lex.-2016-11-28/generic-attachment-list (clojure.spec.alpha/coll-of :portkey.aws.runtime-lex.-2016-11-28/generic-attachment :min-count 0 :max-count 10))

(clojure.spec.alpha/def :portkey.aws.runtime-lex.-2016-11-28/accept (clojure.spec.alpha/and clojure.core/string?))

(clojure.spec.alpha/def :portkey.aws.runtime-lex.-2016-11-28/list-of-buttons (clojure.spec.alpha/coll-of :portkey.aws.runtime-lex.-2016-11-28/button :min-count 0 :max-count 5))

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
(clojure.spec.alpha/def :portkey.aws.runtime-lex.-2016-11-28/post-content-response (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.runtime-lex.-2016-11-28.post-content-response/message :portkey.aws.runtime-lex.-2016-11-28.post-content-response/slot-to-elicit :portkey.aws.runtime-lex.-2016-11-28.post-content-response/slots :portkey.aws.runtime-lex.-2016-11-28.post-content-response/audio-stream :portkey.aws.runtime-lex.-2016-11-28.post-content-response/intent-name :portkey.aws.runtime-lex.-2016-11-28.post-content-response/message-format :portkey.aws.runtime-lex.-2016-11-28.post-content-response/input-transcript :portkey.aws.runtime-lex.-2016-11-28.post-content-response/content-type :portkey.aws.runtime-lex.-2016-11-28.post-content-response/dialog-state :portkey.aws.runtime-lex.-2016-11-28.post-content-response/session-attributes]))

(clojure.spec.alpha/def :portkey.aws.runtime-lex.-2016-11-28/message-format-type #{:composite :custom-payload :ssml :plain-text "PlainText" "CustomPayload" "SSML" "Composite"})

(clojure.core/defn post-content " Sends user input (text or speech) to Amazon Lex. Clients use this API to send\ntext and audio requests to Amazon Lex at runtime. Amazon Lex interprets the user\ninput using the machine learning model that it built for the bot.\n The PostContent operation supports audio input at 8kHz and 16kHz. You can use\n8kHz audio to achieve higher speech recognition accuracy in telephone audio\napplications.\n In response, Amazon Lex returns the next message to convey to the user.\nConsider the following example messages:\n * For a user input \"I would like a pizza,\" Amazon Lex might return a response\nwith a message eliciting slot data (for example, PizzaSize): \"What size pizza\nwould you like?\".\n * After the user provides all of the pizza order information, Amazon Lex might\nreturn a response with a message to get user confirmation: \"Order the pizza?\".\n * After the user replies \"Yes\" to the confirmation prompt, Amazon Lex might\nreturn a conclusion statement: \"Thank you, your cheese pizza has been ordered.\".\n Not all Amazon Lex messages require a response from the user. For example,\nconclusion statements do not require a response. Some messages require only a\nyes or no response. In addition to the message, Amazon Lex provides additional\ncontext about the message in the response that you can use to enhance client\nbehavior, such as displaying the appropriate client user interface. Consider the\nfollowing examples:\n * If the message is to elicit slot data, Amazon Lex returns the following\ncontext information:\n * x-amz-lex-dialog-state header set to ElicitSlot\n * x-amz-lex-intent-name header set to the intent name in the current context\n * x-amz-lex-slot-to-elicit header set to the slot name for which the message is\neliciting information\n * x-amz-lex-slots header set to a map of slots configured for the intent with\ntheir current values\n * If the message is a confirmation prompt, the x-amz-lex-dialog-state header is\nset to Confirmation and the x-amz-lex-slot-to-elicit header is omitted.\n * If the message is a clarification prompt configured for the intent,\nindicating that the user intent is not understood, the x-amz-dialog-state header\nis set to ElicitIntent and the x-amz-slot-to-elicit header is omitted.\n In addition, Amazon Lex also returns your application-specific\nsessionAttributes. For more information, see Managing Conversation Context\n(http://docs.aws.amazon.com/lex/latest/dg/context-mgmt.html)." ([post-content-requestinput] (clojure.core/let [request-function-result__22153__auto__ (req-post-content-request post-content-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__22153__auto__ {:http.request.configuration/endpoints portkey.aws.runtime-lex.-2016-11-28/endpoints, :http.request.configuration/target-prefix nil, :http.request.spec/output-spec :portkey.aws.runtime-lex.-2016-11-28/post-content-response, :http.request.configuration/mime-type {"content-type" "application/json"}, :http.request.configuration/request-uri "/bot/{botName}/alias/{botAlias}/user/{userId}/content", :http.request.configuration/version "2016-11-28", :http.request.configuration/service-id "Lex Runtime Service", :http.request.spec/input-spec :portkey.aws.runtime-lex.-2016-11-28/post-content-request, :http.request.configuration/protocol "rest-json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "PostContent", :http.request.configuration/output-deser-fn response-post-content-response, :http.request.spec/error-spec {"UnsupportedMediaTypeException" :portkey.aws.runtime-lex.-2016-11-28/unsupported-media-type-exception, "BadRequestException" :portkey.aws.runtime-lex.-2016-11-28/bad-request-exception, "LimitExceededException" :portkey.aws.runtime-lex.-2016-11-28/limit-exceeded-exception, "LoopDetectedException" :portkey.aws.runtime-lex.-2016-11-28/loop-detected-exception, "InternalFailureException" :portkey.aws.runtime-lex.-2016-11-28/internal-failure-exception, "ConflictException" :portkey.aws.runtime-lex.-2016-11-28/conflict-exception, "NotFoundException" :portkey.aws.runtime-lex.-2016-11-28/not-found-exception, "DependencyFailedException" :portkey.aws.runtime-lex.-2016-11-28/dependency-failed-exception, "RequestTimeoutException" :portkey.aws.runtime-lex.-2016-11-28/request-timeout-exception, "NotAcceptableException" :portkey.aws.runtime-lex.-2016-11-28/not-acceptable-exception, "BadGatewayException" :portkey.aws.runtime-lex.-2016-11-28/bad-gateway-exception}})))))
(clojure.spec.alpha/fdef post-content :args (clojure.spec.alpha/tuple :portkey.aws.runtime-lex.-2016-11-28/post-content-request) :ret (clojure.spec.alpha/and :portkey.aws.runtime-lex.-2016-11-28/post-content-response))

(clojure.core/defn post-text "Sends user input (text-only) to Amazon Lex. Client applications can use this API\nto send requests to Amazon Lex at runtime. Amazon Lex then interprets the user\ninput using the machine learning model it built for the bot.\n In response, Amazon Lex returns the next message to convey to the user an\noptional responseCard to display. Consider the following example messages:\n * For a user input \"I would like a pizza\", Amazon Lex might return a response\nwith a message eliciting slot data (for example, PizzaSize): \"What size pizza\nwould you like?\"\n * After the user provides all of the pizza order information, Amazon Lex might\nreturn a response with a message to obtain user confirmation \"Proceed with the\npizza order?\".\n * After the user replies to a confirmation prompt with a \"yes\", Amazon Lex\nmight return a conclusion statement: \"Thank you, your cheese pizza has been\nordered.\".\n Not all Amazon Lex messages require a user response. For example, a conclusion\nstatement does not require a response. Some messages require only a \"yes\" or\n\"no\" user response. In addition to the message, Amazon Lex provides additional\ncontext about the message in the response that you might use to enhance client\nbehavior, for example, to display the appropriate client user interface. These\nare the slotToElicit, dialogState, intentName, and slots fields in the response.\nConsider the following examples:\n * If the message is to elicit slot data, Amazon Lex returns the following\ncontext information:\n * dialogState set to ElicitSlot\n * intentName set to the intent name in the current context\n * slotToElicit set to the slot name for which the message is eliciting\ninformation\n * slots set to a map of slots, configured for the intent, with currently known\nvalues\n * If the message is a confirmation prompt, the dialogState is set to\nConfirmIntent and SlotToElicit is set to null.\n * If the message is a clarification prompt (configured for the intent) that\nindicates that user intent is not understood, the dialogState is set to\nElicitIntent and slotToElicit is set to null.\n In addition, Amazon Lex also returns your application-specific\nsessionAttributes. For more information, see Managing Conversation Context\n(http://docs.aws.amazon.com/lex/latest/dg/context-mgmt.html)." ([post-text-requestinput] (clojure.core/let [request-function-result__22153__auto__ (req-post-text-request post-text-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__22153__auto__ {:http.request.configuration/endpoints portkey.aws.runtime-lex.-2016-11-28/endpoints, :http.request.configuration/target-prefix nil, :http.request.spec/output-spec :portkey.aws.runtime-lex.-2016-11-28/post-text-response, :http.request.configuration/mime-type {"content-type" "application/json"}, :http.request.configuration/request-uri "/bot/{botName}/alias/{botAlias}/user/{userId}/text", :http.request.configuration/version "2016-11-28", :http.request.configuration/service-id "Lex Runtime Service", :http.request.spec/input-spec :portkey.aws.runtime-lex.-2016-11-28/post-text-request, :http.request.configuration/protocol "rest-json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "PostText", :http.request.configuration/output-deser-fn response-post-text-response, :http.request.spec/error-spec {"NotFoundException" :portkey.aws.runtime-lex.-2016-11-28/not-found-exception, "BadRequestException" :portkey.aws.runtime-lex.-2016-11-28/bad-request-exception, "LimitExceededException" :portkey.aws.runtime-lex.-2016-11-28/limit-exceeded-exception, "InternalFailureException" :portkey.aws.runtime-lex.-2016-11-28/internal-failure-exception, "ConflictException" :portkey.aws.runtime-lex.-2016-11-28/conflict-exception, "DependencyFailedException" :portkey.aws.runtime-lex.-2016-11-28/dependency-failed-exception, "BadGatewayException" :portkey.aws.runtime-lex.-2016-11-28/bad-gateway-exception, "LoopDetectedException" :portkey.aws.runtime-lex.-2016-11-28/loop-detected-exception}})))))
(clojure.spec.alpha/fdef post-text :args (clojure.spec.alpha/tuple :portkey.aws.runtime-lex.-2016-11-28/post-text-request) :ret (clojure.spec.alpha/and :portkey.aws.runtime-lex.-2016-11-28/post-text-response))
