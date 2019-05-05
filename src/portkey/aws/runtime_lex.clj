(ns portkey.aws.runtime-lex (:require [portkey.aws]))

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

(clojure.core/defn- response-unsupported-media-type-exception ([input] (response-unsupported-media-type-exception nil input)) ([resultWrapper1444057 input] (clojure.core/let [rawinput1444056 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar1444058 {"message" (rawinput1444056 "message")}] (clojure.core/cond-> {} (letvar1444058 "message") (clojure.core/assoc :message (deser-string (clojure.core/get-in letvar1444058 ["message"])))))))

(clojure.core/defn- response-bad-request-exception ([input] (response-bad-request-exception nil input)) ([resultWrapper1444060 input] (clojure.core/let [rawinput1444059 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar1444061 {"message" (rawinput1444059 "message")}] (clojure.core/cond-> {} (letvar1444061 "message") (clojure.core/assoc :message (deser-string (clojure.core/get-in letvar1444061 ["message"])))))))

(clojure.core/defn- response-limit-exceeded-exception ([input] (response-limit-exceeded-exception nil input)) ([resultWrapper1444063 input] (clojure.core/let [rawinput1444062 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar1444064 {"Retry-After" (clojure.core/get-in input [:headers "Retry-After"]), "message" (rawinput1444062 "message")}] (clojure.core/cond-> {} (letvar1444064 "Retry-After") (clojure.core/assoc :retry-after-seconds (deser-string (clojure.core/get-in letvar1444064 ["Retry-After"]))) (letvar1444064 "message") (clojure.core/assoc :message (deser-string (clojure.core/get-in letvar1444064 ["message"])))))))

(clojure.core/defn- response-loop-detected-exception ([input] (response-loop-detected-exception nil input)) ([resultWrapper1444066 input] (clojure.core/let [rawinput1444065 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar1444067 {"Message" (rawinput1444065 "Message")}] (clojure.core/cond-> {} (letvar1444067 "Message") (clojure.core/assoc :message (deser-error-message (clojure.core/get-in letvar1444067 ["Message"])))))))

(clojure.core/defn- response-internal-failure-exception ([input] (response-internal-failure-exception nil input)) ([resultWrapper1444069 input] (clojure.core/let [rawinput1444068 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar1444070 {"message" (rawinput1444068 "message")}] (clojure.core/cond-> {} (letvar1444070 "message") (clojure.core/assoc :message (deser-string (clojure.core/get-in letvar1444070 ["message"])))))))

(clojure.core/defn- response-conflict-exception ([input] (response-conflict-exception nil input)) ([resultWrapper1444072 input] (clojure.core/let [rawinput1444071 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar1444073 {"message" (rawinput1444071 "message")}] (clojure.core/cond-> {} (letvar1444073 "message") (clojure.core/assoc :message (deser-string (clojure.core/get-in letvar1444073 ["message"])))))))

(clojure.core/defn- response-not-found-exception ([input] (response-not-found-exception nil input)) ([resultWrapper1444075 input] (clojure.core/let [rawinput1444074 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar1444076 {"message" (rawinput1444074 "message")}] (clojure.core/cond-> {} (letvar1444076 "message") (clojure.core/assoc :message (deser-string (clojure.core/get-in letvar1444076 ["message"])))))))

(clojure.core/defn- response-dependency-failed-exception ([input] (response-dependency-failed-exception nil input)) ([resultWrapper1444078 input] (clojure.core/let [rawinput1444077 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar1444079 {"Message" (rawinput1444077 "Message")}] (clojure.core/cond-> {} (letvar1444079 "Message") (clojure.core/assoc :message (deser-error-message (clojure.core/get-in letvar1444079 ["Message"])))))))

(clojure.core/defn- response-request-timeout-exception ([input] (response-request-timeout-exception nil input)) ([resultWrapper1444081 input] (clojure.core/let [rawinput1444080 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar1444082 {"message" (rawinput1444080 "message")}] (clojure.core/cond-> {} (letvar1444082 "message") (clojure.core/assoc :message (deser-string (clojure.core/get-in letvar1444082 ["message"])))))))

(clojure.core/defn- response-not-acceptable-exception ([input] (response-not-acceptable-exception nil input)) ([resultWrapper1444084 input] (clojure.core/let [rawinput1444083 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar1444085 {"message" (rawinput1444083 "message")}] (clojure.core/cond-> {} (letvar1444085 "message") (clojure.core/assoc :message (deser-string (clojure.core/get-in letvar1444085 ["message"])))))))

(clojure.core/defn- response-bad-gateway-exception ([input] (response-bad-gateway-exception nil input)) ([resultWrapper1444087 input] (clojure.core/let [rawinput1444086 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar1444088 {"Message" (rawinput1444086 "Message")}] (clojure.core/cond-> {} (letvar1444088 "Message") (clojure.core/assoc :message (deser-error-message (clojure.core/get-in letvar1444088 ["Message"])))))))

(clojure.core/defn- response-post-text-response ([input] (response-post-text-response nil input)) ([resultWrapper1444090 input] (clojure.core/let [rawinput1444089 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar1444091 {"intentName" (rawinput1444089 "intentName"), "slots" (rawinput1444089 "slots"), "sessionAttributes" (rawinput1444089 "sessionAttributes"), "message" (rawinput1444089 "message"), "messageFormat" (rawinput1444089 "messageFormat"), "dialogState" (rawinput1444089 "dialogState"), "slotToElicit" (rawinput1444089 "slotToElicit"), "responseCard" (rawinput1444089 "responseCard")}] (clojure.core/cond-> {} (letvar1444091 "intentName") (clojure.core/assoc :intent-name (deser-intent-name (clojure.core/get-in letvar1444091 ["intentName"]))) (letvar1444091 "slots") (clojure.core/assoc :slots (deser-string-map (clojure.core/get-in letvar1444091 ["slots"]))) (letvar1444091 "sessionAttributes") (clojure.core/assoc :session-attributes (deser-string-map (clojure.core/get-in letvar1444091 ["sessionAttributes"]))) (letvar1444091 "message") (clojure.core/assoc :message (deser-text (clojure.core/get-in letvar1444091 ["message"]))) (letvar1444091 "messageFormat") (clojure.core/assoc :message-format (deser-message-format-type (clojure.core/get-in letvar1444091 ["messageFormat"]))) (letvar1444091 "dialogState") (clojure.core/assoc :dialog-state (deser-dialog-state (clojure.core/get-in letvar1444091 ["dialogState"]))) (letvar1444091 "slotToElicit") (clojure.core/assoc :slot-to-elicit (deser-string (clojure.core/get-in letvar1444091 ["slotToElicit"]))) (letvar1444091 "responseCard") (clojure.core/assoc :response-card (deser-response-card (clojure.core/get-in letvar1444091 ["responseCard"])))))))

(clojure.core/defn- response-post-content-response ([input] (response-post-content-response nil input)) ([resultWrapper1444093 input] (clojure.core/let [rawinput1444092 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar1444094 {"x-amz-lex-slots" (clojure.core/get-in input [:headers "x-amz-lex-slots"]), "audioStream" (rawinput1444092 "audioStream"), "x-amz-lex-intent-name" (clojure.core/get-in input [:headers "x-amz-lex-intent-name"]), "x-amz-lex-session-attributes" (clojure.core/get-in input [:headers "x-amz-lex-session-attributes"]), "x-amz-lex-slot-to-elicit" (clojure.core/get-in input [:headers "x-amz-lex-slot-to-elicit"]), "x-amz-lex-message-format" (clojure.core/get-in input [:headers "x-amz-lex-message-format"]), "x-amz-lex-message" (clojure.core/get-in input [:headers "x-amz-lex-message"]), "Content-Type" (clojure.core/get-in input [:headers "Content-Type"]), "x-amz-lex-dialog-state" (clojure.core/get-in input [:headers "x-amz-lex-dialog-state"]), "x-amz-lex-input-transcript" (clojure.core/get-in input [:headers "x-amz-lex-input-transcript"])}] (clojure.core/cond-> {} (letvar1444094 "x-amz-lex-message") (clojure.core/assoc :message (deser-text (clojure.core/get-in letvar1444094 ["x-amz-lex-message"]))) (letvar1444094 "x-amz-lex-slot-to-elicit") (clojure.core/assoc :slot-to-elicit (deser-string (clojure.core/get-in letvar1444094 ["x-amz-lex-slot-to-elicit"]))) (letvar1444094 "x-amz-lex-slots") (clojure.core/assoc :slots (deser-string (clojure.core/get-in letvar1444094 ["x-amz-lex-slots"]))) (letvar1444094 "audioStream") (clojure.core/assoc :audio-stream (deser-blob-stream (clojure.core/get-in letvar1444094 ["audioStream"]))) (letvar1444094 "x-amz-lex-intent-name") (clojure.core/assoc :intent-name (deser-intent-name (clojure.core/get-in letvar1444094 ["x-amz-lex-intent-name"]))) (letvar1444094 "x-amz-lex-message-format") (clojure.core/assoc :message-format (deser-message-format-type (clojure.core/get-in letvar1444094 ["x-amz-lex-message-format"]))) (letvar1444094 "x-amz-lex-input-transcript") (clojure.core/assoc :input-transcript (deser-string (clojure.core/get-in letvar1444094 ["x-amz-lex-input-transcript"]))) (letvar1444094 "Content-Type") (clojure.core/assoc :content-type (deser-http-content-type (clojure.core/get-in letvar1444094 ["Content-Type"]))) (letvar1444094 "x-amz-lex-dialog-state") (clojure.core/assoc :dialog-state (deser-dialog-state (clojure.core/get-in letvar1444094 ["x-amz-lex-dialog-state"]))) (letvar1444094 "x-amz-lex-session-attributes") (clojure.core/assoc :session-attributes (deser-string (clojure.core/get-in letvar1444094 ["x-amz-lex-session-attributes"])))))))

(clojure.spec.alpha/def :portkey.aws.runtime-lex.unsupported-media-type-exception/message (clojure.spec.alpha/and :portkey.aws.runtime-lex/string))
(clojure.spec.alpha/def :portkey.aws.runtime-lex/unsupported-media-type-exception (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.runtime-lex.unsupported-media-type-exception/message]))

(clojure.spec.alpha/def :portkey.aws.runtime-lex/string-with-length (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__1012852__auto__] (clojure.core/<= 1 (clojure.core/count s__1012852__auto__))) (clojure.core/fn [s__1012853__auto__] (clojure.core/< (clojure.core/count s__1012853__auto__) 80))))

(clojure.spec.alpha/def :portkey.aws.runtime-lex/string-map (clojure.spec.alpha/map-of :portkey.aws.runtime-lex/string :portkey.aws.runtime-lex/string))

(clojure.spec.alpha/def :portkey.aws.runtime-lex.bad-request-exception/message (clojure.spec.alpha/and :portkey.aws.runtime-lex/string))
(clojure.spec.alpha/def :portkey.aws.runtime-lex/bad-request-exception (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.runtime-lex.bad-request-exception/message]))

(clojure.spec.alpha/def :portkey.aws.runtime-lex.button/text (clojure.spec.alpha/and :portkey.aws.runtime-lex/button-text-string-with-length))
(clojure.spec.alpha/def :portkey.aws.runtime-lex.button/value (clojure.spec.alpha/and :portkey.aws.runtime-lex/button-value-string-with-length))
(clojure.spec.alpha/def :portkey.aws.runtime-lex/button (clojure.spec.alpha/keys :req-un [:portkey.aws.runtime-lex.button/text :portkey.aws.runtime-lex.button/value] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.runtime-lex.post-text-request/bot-name (clojure.spec.alpha/and :portkey.aws.runtime-lex/bot-name))
(clojure.spec.alpha/def :portkey.aws.runtime-lex.post-text-request/bot-alias (clojure.spec.alpha/and :portkey.aws.runtime-lex/bot-alias))
(clojure.spec.alpha/def :portkey.aws.runtime-lex.post-text-request/user-id (clojure.spec.alpha/and :portkey.aws.runtime-lex/user-id))
(clojure.spec.alpha/def :portkey.aws.runtime-lex.post-text-request/session-attributes (clojure.spec.alpha/and :portkey.aws.runtime-lex/string-map))
(clojure.spec.alpha/def :portkey.aws.runtime-lex.post-text-request/request-attributes (clojure.spec.alpha/and :portkey.aws.runtime-lex/string-map))
(clojure.spec.alpha/def :portkey.aws.runtime-lex.post-text-request/input-text (clojure.spec.alpha/and :portkey.aws.runtime-lex/text))
(clojure.spec.alpha/def :portkey.aws.runtime-lex/post-text-request (clojure.spec.alpha/keys :req-un [:portkey.aws.runtime-lex.post-text-request/bot-name :portkey.aws.runtime-lex.post-text-request/bot-alias :portkey.aws.runtime-lex.post-text-request/user-id :portkey.aws.runtime-lex.post-text-request/input-text] :opt-un [:portkey.aws.runtime-lex.post-text-request/session-attributes :portkey.aws.runtime-lex.post-text-request/request-attributes]))

(clojure.spec.alpha/def :portkey.aws.runtime-lex.generic-attachment/title (clojure.spec.alpha/and :portkey.aws.runtime-lex/string-with-length))
(clojure.spec.alpha/def :portkey.aws.runtime-lex.generic-attachment/sub-title (clojure.spec.alpha/and :portkey.aws.runtime-lex/string-with-length))
(clojure.spec.alpha/def :portkey.aws.runtime-lex.generic-attachment/attachment-link-url (clojure.spec.alpha/and :portkey.aws.runtime-lex/string-url-with-length))
(clojure.spec.alpha/def :portkey.aws.runtime-lex.generic-attachment/image-url (clojure.spec.alpha/and :portkey.aws.runtime-lex/string-url-with-length))
(clojure.spec.alpha/def :portkey.aws.runtime-lex.generic-attachment/buttons (clojure.spec.alpha/and :portkey.aws.runtime-lex/list-of-buttons))
(clojure.spec.alpha/def :portkey.aws.runtime-lex/generic-attachment (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.runtime-lex.generic-attachment/title :portkey.aws.runtime-lex.generic-attachment/sub-title :portkey.aws.runtime-lex.generic-attachment/attachment-link-url :portkey.aws.runtime-lex.generic-attachment/image-url :portkey.aws.runtime-lex.generic-attachment/buttons]))

(clojure.spec.alpha/def :portkey.aws.runtime-lex/bot-alias (clojure.spec.alpha/and clojure.core/string?))

(clojure.spec.alpha/def :portkey.aws.runtime-lex/user-id (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__1012852__auto__] (clojure.core/<= 2 (clojure.core/count s__1012852__auto__))) (clojure.core/fn [s__1012853__auto__] (clojure.core/< (clojure.core/count s__1012853__auto__) 100)) (clojure.core/fn [s__1012854__auto__] (clojure.core/re-matches #"[0-9a-zA-Z._:-]+" s__1012854__auto__))))

(clojure.spec.alpha/def :portkey.aws.runtime-lex/string-url-with-length (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__1012852__auto__] (clojure.core/<= 1 (clojure.core/count s__1012852__auto__))) (clojure.core/fn [s__1012853__auto__] (clojure.core/< (clojure.core/count s__1012853__auto__) 2048))))

(clojure.spec.alpha/def :portkey.aws.runtime-lex/intent-name (clojure.spec.alpha/and clojure.core/string?))

(clojure.spec.alpha/def :portkey.aws.runtime-lex.limit-exceeded-exception/retry-after-seconds (clojure.spec.alpha/and :portkey.aws.runtime-lex/string))
(clojure.spec.alpha/def :portkey.aws.runtime-lex.limit-exceeded-exception/message (clojure.spec.alpha/and :portkey.aws.runtime-lex/string))
(clojure.spec.alpha/def :portkey.aws.runtime-lex/limit-exceeded-exception (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.runtime-lex.limit-exceeded-exception/retry-after-seconds :portkey.aws.runtime-lex.limit-exceeded-exception/message]))

(clojure.spec.alpha/def :portkey.aws.runtime-lex.post-content-request/bot-name (clojure.spec.alpha/and :portkey.aws.runtime-lex/bot-name))
(clojure.spec.alpha/def :portkey.aws.runtime-lex.post-content-request/bot-alias (clojure.spec.alpha/and :portkey.aws.runtime-lex/bot-alias))
(clojure.spec.alpha/def :portkey.aws.runtime-lex.post-content-request/user-id (clojure.spec.alpha/and :portkey.aws.runtime-lex/user-id))
(clojure.spec.alpha/def :portkey.aws.runtime-lex.post-content-request/session-attributes (clojure.spec.alpha/and :portkey.aws.runtime-lex/attributes-string))
(clojure.spec.alpha/def :portkey.aws.runtime-lex.post-content-request/request-attributes (clojure.spec.alpha/and :portkey.aws.runtime-lex/attributes-string))
(clojure.spec.alpha/def :portkey.aws.runtime-lex.post-content-request/content-type (clojure.spec.alpha/and :portkey.aws.runtime-lex/http-content-type))
(clojure.spec.alpha/def :portkey.aws.runtime-lex.post-content-request/accept (clojure.spec.alpha/and :portkey.aws.runtime-lex/accept))
(clojure.spec.alpha/def :portkey.aws.runtime-lex.post-content-request/input-stream (clojure.spec.alpha/and :portkey.aws.runtime-lex/blob-stream))
(clojure.spec.alpha/def :portkey.aws.runtime-lex/post-content-request (clojure.spec.alpha/keys :req-un [:portkey.aws.runtime-lex.post-content-request/bot-name :portkey.aws.runtime-lex.post-content-request/bot-alias :portkey.aws.runtime-lex.post-content-request/user-id :portkey.aws.runtime-lex.post-content-request/content-type :portkey.aws.runtime-lex.post-content-request/input-stream] :opt-un [:portkey.aws.runtime-lex.post-content-request/session-attributes :portkey.aws.runtime-lex.post-content-request/request-attributes :portkey.aws.runtime-lex.post-content-request/accept]))

(clojure.spec.alpha/def :portkey.aws.runtime-lex.response-card/version (clojure.spec.alpha/and :portkey.aws.runtime-lex/string))
(clojure.spec.alpha/def :portkey.aws.runtime-lex.response-card/content-type (clojure.spec.alpha/and :portkey.aws.runtime-lex/content-type))
(clojure.spec.alpha/def :portkey.aws.runtime-lex.response-card/generic-attachments (clojure.spec.alpha/and :portkey.aws.runtime-lex/generic-attachment-list))
(clojure.spec.alpha/def :portkey.aws.runtime-lex/response-card (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.runtime-lex.response-card/version :portkey.aws.runtime-lex.response-card/content-type :portkey.aws.runtime-lex.response-card/generic-attachments]))

(clojure.spec.alpha/def :portkey.aws.runtime-lex.loop-detected-exception/message (clojure.spec.alpha/and :portkey.aws.runtime-lex/error-message))
(clojure.spec.alpha/def :portkey.aws.runtime-lex/loop-detected-exception (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.runtime-lex.loop-detected-exception/message]))

(clojure.spec.alpha/def :portkey.aws.runtime-lex/error-message (clojure.spec.alpha/and clojure.core/string?))

(clojure.spec.alpha/def :portkey.aws.runtime-lex/dialog-state #{"Fulfilled" "Failed" "ConfirmIntent" "ReadyForFulfillment" :elicit-slot :elicit-intent "ElicitSlot" "ElicitIntent" :fulfilled :confirm-intent :ready-for-fulfillment :failed})

(clojure.spec.alpha/def :portkey.aws.runtime-lex/content-type #{:applicationvndamazonawscardgeneric "application/vnd.amazonaws.card.generic"})

(clojure.spec.alpha/def :portkey.aws.runtime-lex.internal-failure-exception/message (clojure.spec.alpha/and :portkey.aws.runtime-lex/string))
(clojure.spec.alpha/def :portkey.aws.runtime-lex/internal-failure-exception (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.runtime-lex.internal-failure-exception/message]))

(clojure.spec.alpha/def :portkey.aws.runtime-lex.conflict-exception/message (clojure.spec.alpha/and :portkey.aws.runtime-lex/string))
(clojure.spec.alpha/def :portkey.aws.runtime-lex/conflict-exception (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.runtime-lex.conflict-exception/message]))

(clojure.spec.alpha/def :portkey.aws.runtime-lex.not-found-exception/message (clojure.spec.alpha/and :portkey.aws.runtime-lex/string))
(clojure.spec.alpha/def :portkey.aws.runtime-lex/not-found-exception (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.runtime-lex.not-found-exception/message]))

(clojure.spec.alpha/def :portkey.aws.runtime-lex/bot-name (clojure.spec.alpha/and clojure.core/string?))

(clojure.spec.alpha/def :portkey.aws.runtime-lex/blob-stream clojure.core/bytes?)

(clojure.spec.alpha/def :portkey.aws.runtime-lex/string (clojure.spec.alpha/and clojure.core/string?))

(clojure.spec.alpha/def :portkey.aws.runtime-lex.dependency-failed-exception/message (clojure.spec.alpha/and :portkey.aws.runtime-lex/error-message))
(clojure.spec.alpha/def :portkey.aws.runtime-lex/dependency-failed-exception (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.runtime-lex.dependency-failed-exception/message]))

(clojure.spec.alpha/def :portkey.aws.runtime-lex.request-timeout-exception/message (clojure.spec.alpha/and :portkey.aws.runtime-lex/string))
(clojure.spec.alpha/def :portkey.aws.runtime-lex/request-timeout-exception (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.runtime-lex.request-timeout-exception/message]))

(clojure.spec.alpha/def :portkey.aws.runtime-lex/button-text-string-with-length (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__1012852__auto__] (clojure.core/<= 1 (clojure.core/count s__1012852__auto__))) (clojure.core/fn [s__1012853__auto__] (clojure.core/< (clojure.core/count s__1012853__auto__) 15))))

(clojure.spec.alpha/def :portkey.aws.runtime-lex/http-content-type (clojure.spec.alpha/and clojure.core/string?))

(clojure.spec.alpha/def :portkey.aws.runtime-lex/button-value-string-with-length (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__1012852__auto__] (clojure.core/<= 1 (clojure.core/count s__1012852__auto__))) (clojure.core/fn [s__1012853__auto__] (clojure.core/< (clojure.core/count s__1012853__auto__) 1000))))

(clojure.spec.alpha/def :portkey.aws.runtime-lex.not-acceptable-exception/message (clojure.spec.alpha/and :portkey.aws.runtime-lex/string))
(clojure.spec.alpha/def :portkey.aws.runtime-lex/not-acceptable-exception (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.runtime-lex.not-acceptable-exception/message]))

(clojure.spec.alpha/def :portkey.aws.runtime-lex/text (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__1012852__auto__] (clojure.core/<= 1 (clojure.core/count s__1012852__auto__))) (clojure.core/fn [s__1012853__auto__] (clojure.core/< (clojure.core/count s__1012853__auto__) 1024))))

(clojure.spec.alpha/def :portkey.aws.runtime-lex/attributes-string (clojure.spec.alpha/and clojure.core/string?))

(clojure.spec.alpha/def :portkey.aws.runtime-lex.bad-gateway-exception/message (clojure.spec.alpha/and :portkey.aws.runtime-lex/error-message))
(clojure.spec.alpha/def :portkey.aws.runtime-lex/bad-gateway-exception (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.runtime-lex.bad-gateway-exception/message]))

(clojure.spec.alpha/def :portkey.aws.runtime-lex.post-text-response/intent-name (clojure.spec.alpha/and :portkey.aws.runtime-lex/intent-name))
(clojure.spec.alpha/def :portkey.aws.runtime-lex.post-text-response/slots (clojure.spec.alpha/and :portkey.aws.runtime-lex/string-map))
(clojure.spec.alpha/def :portkey.aws.runtime-lex.post-text-response/session-attributes (clojure.spec.alpha/and :portkey.aws.runtime-lex/string-map))
(clojure.spec.alpha/def :portkey.aws.runtime-lex.post-text-response/message (clojure.spec.alpha/and :portkey.aws.runtime-lex/text))
(clojure.spec.alpha/def :portkey.aws.runtime-lex.post-text-response/message-format (clojure.spec.alpha/and :portkey.aws.runtime-lex/message-format-type))
(clojure.spec.alpha/def :portkey.aws.runtime-lex.post-text-response/dialog-state (clojure.spec.alpha/and :portkey.aws.runtime-lex/dialog-state))
(clojure.spec.alpha/def :portkey.aws.runtime-lex.post-text-response/slot-to-elicit (clojure.spec.alpha/and :portkey.aws.runtime-lex/string))
(clojure.spec.alpha/def :portkey.aws.runtime-lex.post-text-response/response-card (clojure.spec.alpha/and :portkey.aws.runtime-lex/response-card))
(clojure.spec.alpha/def :portkey.aws.runtime-lex/post-text-response (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.runtime-lex.post-text-response/intent-name :portkey.aws.runtime-lex.post-text-response/slots :portkey.aws.runtime-lex.post-text-response/session-attributes :portkey.aws.runtime-lex.post-text-response/message :portkey.aws.runtime-lex.post-text-response/message-format :portkey.aws.runtime-lex.post-text-response/dialog-state :portkey.aws.runtime-lex.post-text-response/slot-to-elicit :portkey.aws.runtime-lex.post-text-response/response-card]))

(clojure.spec.alpha/def :portkey.aws.runtime-lex/generic-attachment-list (clojure.spec.alpha/coll-of :portkey.aws.runtime-lex/generic-attachment :min-count 0 :max-count 10))

(clojure.spec.alpha/def :portkey.aws.runtime-lex/accept (clojure.spec.alpha/and clojure.core/string?))

(clojure.spec.alpha/def :portkey.aws.runtime-lex/list-of-buttons (clojure.spec.alpha/coll-of :portkey.aws.runtime-lex/button :min-count 0 :max-count 5))

(clojure.spec.alpha/def :portkey.aws.runtime-lex.post-content-response/message (clojure.spec.alpha/and :portkey.aws.runtime-lex/text))
(clojure.spec.alpha/def :portkey.aws.runtime-lex.post-content-response/slot-to-elicit (clojure.spec.alpha/and :portkey.aws.runtime-lex/string))
(clojure.spec.alpha/def :portkey.aws.runtime-lex.post-content-response/slots (clojure.spec.alpha/and :portkey.aws.runtime-lex/string))
(clojure.spec.alpha/def :portkey.aws.runtime-lex.post-content-response/audio-stream (clojure.spec.alpha/and :portkey.aws.runtime-lex/blob-stream))
(clojure.spec.alpha/def :portkey.aws.runtime-lex.post-content-response/intent-name (clojure.spec.alpha/and :portkey.aws.runtime-lex/intent-name))
(clojure.spec.alpha/def :portkey.aws.runtime-lex.post-content-response/message-format (clojure.spec.alpha/and :portkey.aws.runtime-lex/message-format-type))
(clojure.spec.alpha/def :portkey.aws.runtime-lex.post-content-response/input-transcript (clojure.spec.alpha/and :portkey.aws.runtime-lex/string))
(clojure.spec.alpha/def :portkey.aws.runtime-lex.post-content-response/content-type (clojure.spec.alpha/and :portkey.aws.runtime-lex/http-content-type))
(clojure.spec.alpha/def :portkey.aws.runtime-lex.post-content-response/dialog-state (clojure.spec.alpha/and :portkey.aws.runtime-lex/dialog-state))
(clojure.spec.alpha/def :portkey.aws.runtime-lex.post-content-response/session-attributes (clojure.spec.alpha/and :portkey.aws.runtime-lex/string))
(clojure.spec.alpha/def :portkey.aws.runtime-lex/post-content-response (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.runtime-lex.post-content-response/message :portkey.aws.runtime-lex.post-content-response/slot-to-elicit :portkey.aws.runtime-lex.post-content-response/slots :portkey.aws.runtime-lex.post-content-response/audio-stream :portkey.aws.runtime-lex.post-content-response/intent-name :portkey.aws.runtime-lex.post-content-response/message-format :portkey.aws.runtime-lex.post-content-response/input-transcript :portkey.aws.runtime-lex.post-content-response/content-type :portkey.aws.runtime-lex.post-content-response/dialog-state :portkey.aws.runtime-lex.post-content-response/session-attributes]))

(clojure.spec.alpha/def :portkey.aws.runtime-lex/message-format-type #{:composite :custom-payload :ssml :plain-text "PlainText" "CustomPayload" "SSML" "Composite"})

(clojure.core/defn post-content ([post-content-requestinput] (clojure.core/let [request-function-result__1013884__auto__ (req-post-content-request post-content-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__1013884__auto__ {:http.request.configuration/endpoints portkey.aws.runtime-lex/endpoints, :http.request.configuration/target-prefix nil, :http.request.spec/output-spec :portkey.aws.runtime-lex/post-content-response, :http.request.configuration/mime-type {"content-type" "application/json"}, :http.request.configuration/request-uri "/bot/{botName}/alias/{botAlias}/user/{userId}/content", :http.request.configuration/version "2016-11-28", :http.request.configuration/service-id "Lex Runtime Service", :http.request.spec/input-spec :portkey.aws.runtime-lex/post-content-request, :http.request.configuration/protocol "rest-json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "PostContent", :http.request.configuration/output-deser-fn response-post-content-response, :http.request.spec/error-spec {"UnsupportedMediaTypeException" :portkey.aws.runtime-lex/unsupported-media-type-exception, "BadRequestException" :portkey.aws.runtime-lex/bad-request-exception, "LimitExceededException" :portkey.aws.runtime-lex/limit-exceeded-exception, "LoopDetectedException" :portkey.aws.runtime-lex/loop-detected-exception, "InternalFailureException" :portkey.aws.runtime-lex/internal-failure-exception, "ConflictException" :portkey.aws.runtime-lex/conflict-exception, "NotFoundException" :portkey.aws.runtime-lex/not-found-exception, "DependencyFailedException" :portkey.aws.runtime-lex/dependency-failed-exception, "RequestTimeoutException" :portkey.aws.runtime-lex/request-timeout-exception, "NotAcceptableException" :portkey.aws.runtime-lex/not-acceptable-exception, "BadGatewayException" :portkey.aws.runtime-lex/bad-gateway-exception}})))))
(clojure.spec.alpha/fdef post-content :args (clojure.spec.alpha/tuple :portkey.aws.runtime-lex/post-content-request) :ret (clojure.spec.alpha/and :portkey.aws.runtime-lex/post-content-response))

(clojure.core/defn post-text ([post-text-requestinput] (clojure.core/let [request-function-result__1013884__auto__ (req-post-text-request post-text-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__1013884__auto__ {:http.request.configuration/endpoints portkey.aws.runtime-lex/endpoints, :http.request.configuration/target-prefix nil, :http.request.spec/output-spec :portkey.aws.runtime-lex/post-text-response, :http.request.configuration/mime-type {"content-type" "application/json"}, :http.request.configuration/request-uri "/bot/{botName}/alias/{botAlias}/user/{userId}/text", :http.request.configuration/version "2016-11-28", :http.request.configuration/service-id "Lex Runtime Service", :http.request.spec/input-spec :portkey.aws.runtime-lex/post-text-request, :http.request.configuration/protocol "rest-json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "PostText", :http.request.configuration/output-deser-fn response-post-text-response, :http.request.spec/error-spec {"NotFoundException" :portkey.aws.runtime-lex/not-found-exception, "BadRequestException" :portkey.aws.runtime-lex/bad-request-exception, "LimitExceededException" :portkey.aws.runtime-lex/limit-exceeded-exception, "InternalFailureException" :portkey.aws.runtime-lex/internal-failure-exception, "ConflictException" :portkey.aws.runtime-lex/conflict-exception, "DependencyFailedException" :portkey.aws.runtime-lex/dependency-failed-exception, "BadGatewayException" :portkey.aws.runtime-lex/bad-gateway-exception, "LoopDetectedException" :portkey.aws.runtime-lex/loop-detected-exception}})))))
(clojure.spec.alpha/fdef post-text :args (clojure.spec.alpha/tuple :portkey.aws.runtime-lex/post-text-request) :ret (clojure.spec.alpha/and :portkey.aws.runtime-lex/post-text-response))
