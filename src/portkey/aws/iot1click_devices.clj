(ns portkey.aws.iot1click-devices (:require [portkey.aws]))

(def endpoints 'nil)

(clojure.core/declare ser-string)

(clojure.core/declare ser-device-method)

(clojure.core/declare ser-boolean)

(clojure.core/declare ser-timestamp-iso-8601)

(clojure.core/declare ser-max-results)

(clojure.core/defn- ser-string [input] #:http.request.field{:value input, :shape "__string"})

(clojure.core/defn- ser-device-method [input] (clojure.core/cond-> #:http.request.field{:value [], :shape "DeviceMethod", :type "structure"} (clojure.core/contains? input :device-type) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-string (input :device-type)) #:http.request.field{:name "DeviceType", :shape "__string", :location-name "deviceType"})) (clojure.core/contains? input :method-name) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-string (input :method-name)) #:http.request.field{:name "MethodName", :shape "__string", :location-name "methodName"}))))

(clojure.core/defn- ser-boolean [input] #:http.request.field{:value input, :shape "__boolean"})

(clojure.core/defn- ser-timestamp-iso-8601 [input] #:http.request.field{:value input, :shape "__timestampIso8601"})

(clojure.core/defn- ser-max-results [input] #:http.request.field{:value input, :shape "MaxResults"})

(clojure.core/defn- req-finalize-device-claim-request [input] (clojure.core/cond-> #:http.request.configuration{:uri [(clojure.core/into (ser-string (input :device-id)) #:http.request.field{:name "DeviceId", :shape "__string", :location "uri", :location-name "deviceId"})]}))

(clojure.core/defn- req-list-device-events-request [input] (clojure.core/cond-> #:http.request.configuration{:uri [(clojure.core/into (ser-string (input :device-id)) #:http.request.field{:name "DeviceId", :shape "__string", :location "uri", :location-name "deviceId"})], :querystring [(clojure.core/into (ser-timestamp-iso-8601 (input :from-time-stamp)) #:http.request.field{:name "FromTimeStamp", :shape "__timestampIso8601", :location "querystring", :location-name "fromTimeStamp"}) (clojure.core/into (ser-timestamp-iso-8601 (input :to-time-stamp)) #:http.request.field{:name "ToTimeStamp", :shape "__timestampIso8601", :location "querystring", :location-name "toTimeStamp"})]} (clojure.core/contains? input :max-results) (clojure.core/update-in [:http.request.configuration/querystring] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-max-results (input :max-results)) #:http.request.field{:name "MaxResults", :shape "MaxResults", :location "querystring", :location-name "maxResults"})) (clojure.core/contains? input :next-token) (clojure.core/update-in [:http.request.configuration/querystring] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-string (input :next-token)) #:http.request.field{:name "NextToken", :shape "__string", :location "querystring", :location-name "nextToken"}))))

(clojure.core/defn- req-invoke-device-method-request [input] (clojure.core/cond-> #:http.request.configuration{:uri [(clojure.core/into (ser-string (input :device-id)) #:http.request.field{:name "DeviceId", :shape "__string", :location "uri", :location-name "deviceId"})]} (clojure.core/contains? input :device-method) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-device-method (input :device-method)) #:http.request.field{:name "DeviceMethod", :shape "DeviceMethod", :location-name "deviceMethod"})) (clojure.core/contains? input :device-method-parameters) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-string (input :device-method-parameters)) #:http.request.field{:name "DeviceMethodParameters", :shape "__string", :location-name "deviceMethodParameters"}))))

(clojure.core/defn- req-initiate-device-claim-request [input] (clojure.core/cond-> #:http.request.configuration{:uri [(clojure.core/into (ser-string (input :device-id)) #:http.request.field{:name "DeviceId", :shape "__string", :location "uri", :location-name "deviceId"})]}))

(clojure.core/defn- req-describe-device-request [input] (clojure.core/cond-> #:http.request.configuration{:uri [(clojure.core/into (ser-string (input :device-id)) #:http.request.field{:name "DeviceId", :shape "__string", :location "uri", :location-name "deviceId"})]}))

(clojure.core/defn- req-update-device-state-request [input] (clojure.core/cond-> #:http.request.configuration{:uri [(clojure.core/into (ser-string (input :device-id)) #:http.request.field{:name "DeviceId", :shape "__string", :location "uri", :location-name "deviceId"})]} (clojure.core/contains? input :enabled) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-boolean (input :enabled)) #:http.request.field{:name "Enabled", :shape "__boolean", :location-name "enabled"}))))

(clojure.core/defn- req-claim-devices-by-claim-code-request [input] (clojure.core/cond-> #:http.request.configuration{:uri [(clojure.core/into (ser-string (input :claim-code)) #:http.request.field{:name "ClaimCode", :shape "__string", :location "uri", :location-name "claimCode"})]}))

(clojure.core/defn- req-list-devices-request [input] (clojure.core/cond-> {} (clojure.core/contains? input :device-type) (clojure.core/update-in [:http.request.configuration/querystring] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-string (input :device-type)) #:http.request.field{:name "DeviceType", :shape "__string", :location "querystring", :location-name "deviceType"})) (clojure.core/contains? input :max-results) (clojure.core/update-in [:http.request.configuration/querystring] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-max-results (input :max-results)) #:http.request.field{:name "MaxResults", :shape "MaxResults", :location "querystring", :location-name "maxResults"})) (clojure.core/contains? input :next-token) (clojure.core/update-in [:http.request.configuration/querystring] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-string (input :next-token)) #:http.request.field{:name "NextToken", :shape "__string", :location "querystring", :location-name "nextToken"}))))

(clojure.core/defn- req-get-device-methods-request [input] (clojure.core/cond-> #:http.request.configuration{:uri [(clojure.core/into (ser-string (input :device-id)) #:http.request.field{:name "DeviceId", :shape "__string", :location "uri", :location-name "deviceId"})]}))

(clojure.core/defn- req-unclaim-device-request [input] (clojure.core/cond-> #:http.request.configuration{:uri [(clojure.core/into (ser-string (input :device-id)) #:http.request.field{:name "DeviceId", :shape "__string", :location "uri", :location-name "deviceId"})]}))

(clojure.core/declare deser-device-description)

(clojure.core/declare deser-string)

(clojure.core/declare deser-list-of-device-description)

(clojure.core/declare deser-device-method)

(clojure.core/declare deser-device-event)

(clojure.core/declare deser-attributes)

(clojure.core/declare deser-double-min-0-max-100)

(clojure.core/declare deser-boolean)

(clojure.core/declare deser-list-of-device-event)

(clojure.core/declare deser-list-of-device-method)

(clojure.core/declare deser-integer)

(clojure.core/declare deser-string-min-12-max-40)

(clojure.core/declare deser-device)

(clojure.core/declare deser-device-attributes)

(clojure.core/defn- deser-device-description [input] (clojure.core/cond-> {} (clojure.core/contains? input "attributes") (clojure.core/assoc :attributes (deser-device-attributes (input "attributes"))) (clojure.core/contains? input "deviceId") (clojure.core/assoc :device-id (deser-string (input "deviceId"))) (clojure.core/contains? input "enabled") (clojure.core/assoc :enabled (deser-boolean (input "enabled"))) (clojure.core/contains? input "remainingLife") (clojure.core/assoc :remaining-life (deser-double-min-0-max-100 (input "remainingLife"))) (clojure.core/contains? input "type") (clojure.core/assoc :type (deser-string (input "type")))))

(clojure.core/defn- deser-string [input] input)

(clojure.core/defn- deser-list-of-device-description [input] (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (deser-device-description coll))) input))

(clojure.core/defn- deser-device-method [input] (clojure.core/cond-> {} (clojure.core/contains? input "deviceType") (clojure.core/assoc :device-type (deser-string (input "deviceType"))) (clojure.core/contains? input "methodName") (clojure.core/assoc :method-name (deser-string (input "methodName")))))

(clojure.core/defn- deser-device-event [input] (clojure.core/cond-> {} (clojure.core/contains? input "device") (clojure.core/assoc :device (deser-device (input "device"))) (clojure.core/contains? input "stdEvent") (clojure.core/assoc :std-event (deser-string (input "stdEvent")))))

(clojure.core/defn- deser-attributes [input] (clojure.core/cond-> {}))

(clojure.core/defn- deser-double-min-0-max-100 [input] input)

(clojure.core/defn- deser-boolean [input] input)

(clojure.core/defn- deser-list-of-device-event [input] (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (deser-device-event coll))) input))

(clojure.core/defn- deser-list-of-device-method [input] (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (deser-device-method coll))) input))

(clojure.core/defn- deser-integer [input] input)

(clojure.core/defn- deser-string-min-12-max-40 [input] input)

(clojure.core/defn- deser-device [input] (clojure.core/cond-> {} (clojure.core/contains? input "attributes") (clojure.core/assoc :attributes (deser-attributes (input "attributes"))) (clojure.core/contains? input "deviceId") (clojure.core/assoc :device-id (deser-string (input "deviceId"))) (clojure.core/contains? input "type") (clojure.core/assoc :type (deser-string (input "type")))))

(clojure.core/defn- deser-device-attributes [input] (clojure.core/into {} (clojure.core/map (clojure.core/fn [[k v]] [(deser-string k) (deser-string v)])) input))

(clojure.core/defn- response-invoke-device-method-response ([input] (response-invoke-device-method-response nil input)) ([resultWrapper1141215 input] (clojure.core/let [rawinput1141214 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar1141216 {"deviceMethodResponse" (rawinput1141214 "deviceMethodResponse")}] (clojure.core/cond-> {} (letvar1141216 "deviceMethodResponse") (clojure.core/assoc :device-method-response (deser-string (clojure.core/get-in letvar1141216 ["deviceMethodResponse"])))))))

(clojure.core/defn- response-precondition-failed-exception ([input] (response-precondition-failed-exception nil input)) ([resultWrapper1141218 input] (clojure.core/let [rawinput1141217 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar1141219 {"code" (rawinput1141217 "code"), "message" (rawinput1141217 "message")}] (clojure.core/cond-> {} (letvar1141219 "code") (clojure.core/assoc :code (deser-string (clojure.core/get-in letvar1141219 ["code"]))) (letvar1141219 "message") (clojure.core/assoc :message (deser-string (clojure.core/get-in letvar1141219 ["message"])))))))

(clojure.core/defn- response-invalid-request-exception ([input] (response-invalid-request-exception nil input)) ([resultWrapper1141221 input] (clojure.core/let [rawinput1141220 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar1141222 {"code" (rawinput1141220 "code"), "message" (rawinput1141220 "message")}] (clojure.core/cond-> {} (letvar1141222 "code") (clojure.core/assoc :code (deser-string (clojure.core/get-in letvar1141222 ["code"]))) (letvar1141222 "message") (clojure.core/assoc :message (deser-string (clojure.core/get-in letvar1141222 ["message"])))))))

(clojure.core/defn- response-get-device-methods-response ([input] (response-get-device-methods-response nil input)) ([resultWrapper1141224 input] (clojure.core/let [rawinput1141223 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar1141225 {"deviceMethods" (rawinput1141223 "deviceMethods")}] (clojure.core/cond-> {} (letvar1141225 "deviceMethods") (clojure.core/assoc :device-methods (deser-list-of-device-method (clojure.core/get-in letvar1141225 ["deviceMethods"])))))))

(clojure.core/defn- response-forbidden-exception ([input] (response-forbidden-exception nil input)) ([resultWrapper1141227 input] (clojure.core/let [rawinput1141226 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar1141228 {"code" (rawinput1141226 "code"), "message" (rawinput1141226 "message")}] (clojure.core/cond-> {} (letvar1141228 "code") (clojure.core/assoc :code (deser-string (clojure.core/get-in letvar1141228 ["code"]))) (letvar1141228 "message") (clojure.core/assoc :message (deser-string (clojure.core/get-in letvar1141228 ["message"])))))))

(clojure.core/defn- response-initiate-device-claim-response ([input] (response-initiate-device-claim-response nil input)) ([resultWrapper1141230 input] (clojure.core/let [rawinput1141229 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar1141231 {"state" (rawinput1141229 "state")}] (clojure.core/cond-> {} (letvar1141231 "state") (clojure.core/assoc :state (deser-string (clojure.core/get-in letvar1141231 ["state"])))))))

(clojure.core/defn- response-update-device-state-response ([input] (response-update-device-state-response nil input)) ([resultWrapper1141233 input] (clojure.core/let [rawinput1141232 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar1141234 {}] (clojure.core/cond-> {}))))

(clojure.core/defn- response-internal-failure-exception ([input] (response-internal-failure-exception nil input)) ([resultWrapper1141236 input] (clojure.core/let [rawinput1141235 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar1141237 {"code" (rawinput1141235 "code"), "message" (rawinput1141235 "message")}] (clojure.core/cond-> {} (letvar1141237 "code") (clojure.core/assoc :code (deser-string (clojure.core/get-in letvar1141237 ["code"]))) (letvar1141237 "message") (clojure.core/assoc :message (deser-string (clojure.core/get-in letvar1141237 ["message"])))))))

(clojure.core/defn- response-describe-device-response ([input] (response-describe-device-response nil input)) ([resultWrapper1141239 input] (clojure.core/let [rawinput1141238 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar1141240 {"deviceDescription" (rawinput1141238 "deviceDescription")}] (clojure.core/cond-> {} (letvar1141240 "deviceDescription") (clojure.core/assoc :device-description (deser-device-description (clojure.core/get-in letvar1141240 ["deviceDescription"])))))))

(clojure.core/defn- response-resource-not-found-exception ([input] (response-resource-not-found-exception nil input)) ([resultWrapper1141242 input] (clojure.core/let [rawinput1141241 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar1141243 {"code" (rawinput1141241 "code"), "message" (rawinput1141241 "message")}] (clojure.core/cond-> {} (letvar1141243 "code") (clojure.core/assoc :code (deser-string (clojure.core/get-in letvar1141243 ["code"]))) (letvar1141243 "message") (clojure.core/assoc :message (deser-string (clojure.core/get-in letvar1141243 ["message"])))))))

(clojure.core/defn- response-claim-devices-by-claim-code-response ([input] (response-claim-devices-by-claim-code-response nil input)) ([resultWrapper1141245 input] (clojure.core/let [rawinput1141244 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar1141246 {"claimCode" (rawinput1141244 "claimCode"), "total" (rawinput1141244 "total")}] (clojure.core/cond-> {} (letvar1141246 "claimCode") (clojure.core/assoc :claim-code (deser-string-min-12-max-40 (clojure.core/get-in letvar1141246 ["claimCode"]))) (letvar1141246 "total") (clojure.core/assoc :total (deser-integer (clojure.core/get-in letvar1141246 ["total"])))))))

(clojure.core/defn- response-resource-conflict-exception ([input] (response-resource-conflict-exception nil input)) ([resultWrapper1141248 input] (clojure.core/let [rawinput1141247 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar1141249 {"code" (rawinput1141247 "code"), "message" (rawinput1141247 "message")}] (clojure.core/cond-> {} (letvar1141249 "code") (clojure.core/assoc :code (deser-string (clojure.core/get-in letvar1141249 ["code"]))) (letvar1141249 "message") (clojure.core/assoc :message (deser-string (clojure.core/get-in letvar1141249 ["message"])))))))

(clojure.core/defn- response-list-device-events-response ([input] (response-list-device-events-response nil input)) ([resultWrapper1141251 input] (clojure.core/let [rawinput1141250 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar1141252 {"events" (rawinput1141250 "events"), "nextToken" (rawinput1141250 "nextToken")}] (clojure.core/cond-> {} (letvar1141252 "events") (clojure.core/assoc :events (deser-list-of-device-event (clojure.core/get-in letvar1141252 ["events"]))) (letvar1141252 "nextToken") (clojure.core/assoc :next-token (deser-string (clojure.core/get-in letvar1141252 ["nextToken"])))))))

(clojure.core/defn- response-range-not-satisfiable-exception ([input] (response-range-not-satisfiable-exception nil input)) ([resultWrapper1141254 input] (clojure.core/let [rawinput1141253 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar1141255 {"code" (rawinput1141253 "code"), "message" (rawinput1141253 "message")}] (clojure.core/cond-> {} (letvar1141255 "code") (clojure.core/assoc :code (deser-string (clojure.core/get-in letvar1141255 ["code"]))) (letvar1141255 "message") (clojure.core/assoc :message (deser-string (clojure.core/get-in letvar1141255 ["message"])))))))

(clojure.core/defn- response-unclaim-device-response ([input] (response-unclaim-device-response nil input)) ([resultWrapper1141257 input] (clojure.core/let [rawinput1141256 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar1141258 {"state" (rawinput1141256 "state")}] (clojure.core/cond-> {} (letvar1141258 "state") (clojure.core/assoc :state (deser-string (clojure.core/get-in letvar1141258 ["state"])))))))

(clojure.core/defn- response-finalize-device-claim-response ([input] (response-finalize-device-claim-response nil input)) ([resultWrapper1141260 input] (clojure.core/let [rawinput1141259 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar1141261 {"state" (rawinput1141259 "state")}] (clojure.core/cond-> {} (letvar1141261 "state") (clojure.core/assoc :state (deser-string (clojure.core/get-in letvar1141261 ["state"])))))))

(clojure.core/defn- response-list-devices-response ([input] (response-list-devices-response nil input)) ([resultWrapper1141263 input] (clojure.core/let [rawinput1141262 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar1141264 {"devices" (rawinput1141262 "devices"), "nextToken" (rawinput1141262 "nextToken")}] (clojure.core/cond-> {} (letvar1141264 "devices") (clojure.core/assoc :devices (deser-list-of-device-description (clojure.core/get-in letvar1141264 ["devices"]))) (letvar1141264 "nextToken") (clojure.core/assoc :next-token (deser-string (clojure.core/get-in letvar1141264 ["nextToken"])))))))

(clojure.spec.alpha/def :portkey.aws.iot1click-devices.invoke-device-method-response/device-method-response (clojure.spec.alpha/and :portkey.aws.iot1click-devices/string))
(clojure.spec.alpha/def :portkey.aws.iot1click-devices/invoke-device-method-response (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.iot1click-devices.invoke-device-method-response/device-method-response]))

(clojure.spec.alpha/def :portkey.aws.iot1click-devices/empty (clojure.spec.alpha/keys :req-un [] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.iot1click-devices.device-description/attributes (clojure.spec.alpha/and :portkey.aws.iot1click-devices/device-attributes))
(clojure.spec.alpha/def :portkey.aws.iot1click-devices.device-description/device-id (clojure.spec.alpha/and :portkey.aws.iot1click-devices/string))
(clojure.spec.alpha/def :portkey.aws.iot1click-devices.device-description/enabled (clojure.spec.alpha/and :portkey.aws.iot1click-devices/boolean))
(clojure.spec.alpha/def :portkey.aws.iot1click-devices.device-description/remaining-life (clojure.spec.alpha/and :portkey.aws.iot1click-devices/double-min-0-max-100))
(clojure.spec.alpha/def :portkey.aws.iot1click-devices.device-description/type (clojure.spec.alpha/and :portkey.aws.iot1click-devices/string))
(clojure.spec.alpha/def :portkey.aws.iot1click-devices/device-description (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.iot1click-devices.device-description/attributes :portkey.aws.iot1click-devices.device-description/device-id :portkey.aws.iot1click-devices.device-description/enabled :portkey.aws.iot1click-devices.device-description/remaining-life :portkey.aws.iot1click-devices.device-description/type]))

(clojure.spec.alpha/def :portkey.aws.iot1click-devices.device-claim-response/state (clojure.spec.alpha/and :portkey.aws.iot1click-devices/string))
(clojure.spec.alpha/def :portkey.aws.iot1click-devices/device-claim-response (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.iot1click-devices.device-claim-response/state]))

(clojure.spec.alpha/def :portkey.aws.iot1click-devices.device-events-response/events (clojure.spec.alpha/and :portkey.aws.iot1click-devices/list-of-device-event))
(clojure.spec.alpha/def :portkey.aws.iot1click-devices.device-events-response/next-token (clojure.spec.alpha/and :portkey.aws.iot1click-devices/string))
(clojure.spec.alpha/def :portkey.aws.iot1click-devices/device-events-response (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.iot1click-devices.device-events-response/events :portkey.aws.iot1click-devices.device-events-response/next-token]))

(clojure.spec.alpha/def :portkey.aws.iot1click-devices.finalize-device-claim-request/device-id (clojure.spec.alpha/and :portkey.aws.iot1click-devices/string))
(clojure.spec.alpha/def :portkey.aws.iot1click-devices/finalize-device-claim-request (clojure.spec.alpha/keys :req-un [:portkey.aws.iot1click-devices.finalize-device-claim-request/device-id] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.iot1click-devices.precondition-failed-exception/code (clojure.spec.alpha/and :portkey.aws.iot1click-devices/string))
(clojure.spec.alpha/def :portkey.aws.iot1click-devices.precondition-failed-exception/message (clojure.spec.alpha/and :portkey.aws.iot1click-devices/string))
(clojure.spec.alpha/def :portkey.aws.iot1click-devices/precondition-failed-exception (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.iot1click-devices.precondition-failed-exception/code :portkey.aws.iot1click-devices.precondition-failed-exception/message]))

(clojure.spec.alpha/def :portkey.aws.iot1click-devices.invalid-request-exception/code (clojure.spec.alpha/and :portkey.aws.iot1click-devices/string))
(clojure.spec.alpha/def :portkey.aws.iot1click-devices.invalid-request-exception/message (clojure.spec.alpha/and :portkey.aws.iot1click-devices/string))
(clojure.spec.alpha/def :portkey.aws.iot1click-devices/invalid-request-exception (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.iot1click-devices.invalid-request-exception/code :portkey.aws.iot1click-devices.invalid-request-exception/message]))

(clojure.spec.alpha/def :portkey.aws.iot1click-devices.list-device-events-request/device-id (clojure.spec.alpha/and :portkey.aws.iot1click-devices/string))
(clojure.spec.alpha/def :portkey.aws.iot1click-devices.list-device-events-request/from-time-stamp (clojure.spec.alpha/and :portkey.aws.iot1click-devices/timestamp-iso-8601))
(clojure.spec.alpha/def :portkey.aws.iot1click-devices.list-device-events-request/next-token (clojure.spec.alpha/and :portkey.aws.iot1click-devices/string))
(clojure.spec.alpha/def :portkey.aws.iot1click-devices.list-device-events-request/to-time-stamp (clojure.spec.alpha/and :portkey.aws.iot1click-devices/timestamp-iso-8601))
(clojure.spec.alpha/def :portkey.aws.iot1click-devices/list-device-events-request (clojure.spec.alpha/keys :req-un [:portkey.aws.iot1click-devices.list-device-events-request/device-id :portkey.aws.iot1click-devices.list-device-events-request/from-time-stamp :portkey.aws.iot1click-devices.list-device-events-request/to-time-stamp] :opt-un [:portkey.aws.iot1click-devices/max-results :portkey.aws.iot1click-devices.list-device-events-request/next-token]))

(clojure.spec.alpha/def :portkey.aws.iot1click-devices.get-device-methods-response/device-methods (clojure.spec.alpha/and :portkey.aws.iot1click-devices/list-of-device-method))
(clojure.spec.alpha/def :portkey.aws.iot1click-devices/get-device-methods-response (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.iot1click-devices.get-device-methods-response/device-methods]))

(clojure.spec.alpha/def :portkey.aws.iot1click-devices.invoke-device-method-request/device-id (clojure.spec.alpha/and :portkey.aws.iot1click-devices/string))
(clojure.spec.alpha/def :portkey.aws.iot1click-devices.invoke-device-method-request/device-method-parameters (clojure.spec.alpha/and :portkey.aws.iot1click-devices/string))
(clojure.spec.alpha/def :portkey.aws.iot1click-devices/invoke-device-method-request (clojure.spec.alpha/keys :req-un [:portkey.aws.iot1click-devices.invoke-device-method-request/device-id] :opt-un [:portkey.aws.iot1click-devices/device-method :portkey.aws.iot1click-devices.invoke-device-method-request/device-method-parameters]))

(clojure.spec.alpha/def :portkey.aws.iot1click-devices.forbidden-exception/code (clojure.spec.alpha/and :portkey.aws.iot1click-devices/string))
(clojure.spec.alpha/def :portkey.aws.iot1click-devices.forbidden-exception/message (clojure.spec.alpha/and :portkey.aws.iot1click-devices/string))
(clojure.spec.alpha/def :portkey.aws.iot1click-devices/forbidden-exception (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.iot1click-devices.forbidden-exception/code :portkey.aws.iot1click-devices.forbidden-exception/message]))

(clojure.spec.alpha/def :portkey.aws.iot1click-devices.initiate-device-claim-request/device-id (clojure.spec.alpha/and :portkey.aws.iot1click-devices/string))
(clojure.spec.alpha/def :portkey.aws.iot1click-devices/initiate-device-claim-request (clojure.spec.alpha/keys :req-un [:portkey.aws.iot1click-devices.initiate-device-claim-request/device-id] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.iot1click-devices.initiate-device-claim-response/state (clojure.spec.alpha/and :portkey.aws.iot1click-devices/string))
(clojure.spec.alpha/def :portkey.aws.iot1click-devices/initiate-device-claim-response (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.iot1click-devices.initiate-device-claim-response/state]))

(clojure.spec.alpha/def :portkey.aws.iot1click-devices/string (clojure.spec.alpha/and clojure.core/string?))

(clojure.spec.alpha/def :portkey.aws.iot1click-devices.describe-device-request/device-id (clojure.spec.alpha/and :portkey.aws.iot1click-devices/string))
(clojure.spec.alpha/def :portkey.aws.iot1click-devices/describe-device-request (clojure.spec.alpha/keys :req-un [:portkey.aws.iot1click-devices.describe-device-request/device-id] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.iot1click-devices/long clojure.core/int?)

(clojure.spec.alpha/def :portkey.aws.iot1click-devices/list-of-device-description (clojure.spec.alpha/coll-of :portkey.aws.iot1click-devices/device-description))

(clojure.spec.alpha/def :portkey.aws.iot1click-devices.device-method/device-type (clojure.spec.alpha/and :portkey.aws.iot1click-devices/string))
(clojure.spec.alpha/def :portkey.aws.iot1click-devices.device-method/method-name (clojure.spec.alpha/and :portkey.aws.iot1click-devices/string))
(clojure.spec.alpha/def :portkey.aws.iot1click-devices/device-method (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.iot1click-devices.device-method/device-type :portkey.aws.iot1click-devices.device-method/method-name]))

(clojure.spec.alpha/def :portkey.aws.iot1click-devices.device-event/std-event (clojure.spec.alpha/and :portkey.aws.iot1click-devices/string))
(clojure.spec.alpha/def :portkey.aws.iot1click-devices/device-event (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.iot1click-devices/device :portkey.aws.iot1click-devices.device-event/std-event]))

(clojure.spec.alpha/def :portkey.aws.iot1click-devices/attributes (clojure.spec.alpha/keys :req-un [] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.iot1click-devices/update-device-state-response (clojure.spec.alpha/keys :req-un [] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.iot1click-devices.internal-failure-exception/code (clojure.spec.alpha/and :portkey.aws.iot1click-devices/string))
(clojure.spec.alpha/def :portkey.aws.iot1click-devices.internal-failure-exception/message (clojure.spec.alpha/and :portkey.aws.iot1click-devices/string))
(clojure.spec.alpha/def :portkey.aws.iot1click-devices/internal-failure-exception (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.iot1click-devices.internal-failure-exception/code :portkey.aws.iot1click-devices.internal-failure-exception/message]))

(clojure.spec.alpha/def :portkey.aws.iot1click-devices/double-min-0-max-100 clojure.core/double?)

(clojure.spec.alpha/def :portkey.aws.iot1click-devices/describe-device-response (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.iot1click-devices/device-description]))

(clojure.spec.alpha/def :portkey.aws.iot1click-devices.resource-not-found-exception/code (clojure.spec.alpha/and :portkey.aws.iot1click-devices/string))
(clojure.spec.alpha/def :portkey.aws.iot1click-devices.resource-not-found-exception/message (clojure.spec.alpha/and :portkey.aws.iot1click-devices/string))
(clojure.spec.alpha/def :portkey.aws.iot1click-devices/resource-not-found-exception (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.iot1click-devices.resource-not-found-exception/code :portkey.aws.iot1click-devices.resource-not-found-exception/message]))

(clojure.spec.alpha/def :portkey.aws.iot1click-devices/boolean clojure.core/boolean?)

(clojure.spec.alpha/def :portkey.aws.iot1click-devices.update-device-state-request/device-id (clojure.spec.alpha/and :portkey.aws.iot1click-devices/string))
(clojure.spec.alpha/def :portkey.aws.iot1click-devices.update-device-state-request/enabled (clojure.spec.alpha/and :portkey.aws.iot1click-devices/boolean))
(clojure.spec.alpha/def :portkey.aws.iot1click-devices/update-device-state-request (clojure.spec.alpha/keys :req-un [:portkey.aws.iot1click-devices.update-device-state-request/device-id] :opt-un [:portkey.aws.iot1click-devices.update-device-state-request/enabled]))

(clojure.spec.alpha/def :portkey.aws.iot1click-devices/list-of-device-event (clojure.spec.alpha/coll-of :portkey.aws.iot1click-devices/device-event))

(clojure.spec.alpha/def :portkey.aws.iot1click-devices.claim-devices-by-claim-code-response/claim-code (clojure.spec.alpha/and :portkey.aws.iot1click-devices/string-min-12-max-40))
(clojure.spec.alpha/def :portkey.aws.iot1click-devices.claim-devices-by-claim-code-response/total (clojure.spec.alpha/and :portkey.aws.iot1click-devices/integer))
(clojure.spec.alpha/def :portkey.aws.iot1click-devices/claim-devices-by-claim-code-response (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.iot1click-devices.claim-devices-by-claim-code-response/claim-code :portkey.aws.iot1click-devices.claim-devices-by-claim-code-response/total]))

(clojure.spec.alpha/def :portkey.aws.iot1click-devices.claim-devices-by-claim-code-request/claim-code (clojure.spec.alpha/and :portkey.aws.iot1click-devices/string))
(clojure.spec.alpha/def :portkey.aws.iot1click-devices/claim-devices-by-claim-code-request (clojure.spec.alpha/keys :req-un [:portkey.aws.iot1click-devices.claim-devices-by-claim-code-request/claim-code] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.iot1click-devices.resource-conflict-exception/code (clojure.spec.alpha/and :portkey.aws.iot1click-devices/string))
(clojure.spec.alpha/def :portkey.aws.iot1click-devices.resource-conflict-exception/message (clojure.spec.alpha/and :portkey.aws.iot1click-devices/string))
(clojure.spec.alpha/def :portkey.aws.iot1click-devices/resource-conflict-exception (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.iot1click-devices.resource-conflict-exception/code :portkey.aws.iot1click-devices.resource-conflict-exception/message]))

(clojure.spec.alpha/def :portkey.aws.iot1click-devices.list-device-events-response/events (clojure.spec.alpha/and :portkey.aws.iot1click-devices/list-of-device-event))
(clojure.spec.alpha/def :portkey.aws.iot1click-devices.list-device-events-response/next-token (clojure.spec.alpha/and :portkey.aws.iot1click-devices/string))
(clojure.spec.alpha/def :portkey.aws.iot1click-devices/list-device-events-response (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.iot1click-devices.list-device-events-response/events :portkey.aws.iot1click-devices.list-device-events-response/next-token]))

(clojure.spec.alpha/def :portkey.aws.iot1click-devices.range-not-satisfiable-exception/code (clojure.spec.alpha/and :portkey.aws.iot1click-devices/string))
(clojure.spec.alpha/def :portkey.aws.iot1click-devices.range-not-satisfiable-exception/message (clojure.spec.alpha/and :portkey.aws.iot1click-devices/string))
(clojure.spec.alpha/def :portkey.aws.iot1click-devices/range-not-satisfiable-exception (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.iot1click-devices.range-not-satisfiable-exception/code :portkey.aws.iot1click-devices.range-not-satisfiable-exception/message]))

(clojure.spec.alpha/def :portkey.aws.iot1click-devices/timestamp-iso-8601 clojure.core/inst?)

(clojure.spec.alpha/def :portkey.aws.iot1click-devices/double clojure.core/double?)

(clojure.spec.alpha/def :portkey.aws.iot1click-devices.unclaim-device-response/state (clojure.spec.alpha/and :portkey.aws.iot1click-devices/string))
(clojure.spec.alpha/def :portkey.aws.iot1click-devices/unclaim-device-response (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.iot1click-devices.unclaim-device-response/state]))

(clojure.spec.alpha/def :portkey.aws.iot1click-devices/list-of-device-method (clojure.spec.alpha/coll-of :portkey.aws.iot1click-devices/device-method))

(clojure.spec.alpha/def :portkey.aws.iot1click-devices/max-results (clojure.spec.alpha/int-in 1 250))

(clojure.spec.alpha/def :portkey.aws.iot1click-devices.finalize-device-claim-response/state (clojure.spec.alpha/and :portkey.aws.iot1click-devices/string))
(clojure.spec.alpha/def :portkey.aws.iot1click-devices/finalize-device-claim-response (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.iot1click-devices.finalize-device-claim-response/state]))

(clojure.spec.alpha/def :portkey.aws.iot1click-devices.list-devices-request/device-type (clojure.spec.alpha/and :portkey.aws.iot1click-devices/string))
(clojure.spec.alpha/def :portkey.aws.iot1click-devices.list-devices-request/next-token (clojure.spec.alpha/and :portkey.aws.iot1click-devices/string))
(clojure.spec.alpha/def :portkey.aws.iot1click-devices/list-devices-request (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.iot1click-devices.list-devices-request/device-type :portkey.aws.iot1click-devices/max-results :portkey.aws.iot1click-devices.list-devices-request/next-token]))

(clojure.spec.alpha/def :portkey.aws.iot1click-devices/integer clojure.core/int?)

(clojure.spec.alpha/def :portkey.aws.iot1click-devices/string-min-12-max-40 (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__21076__auto__] (clojure.core/<= 12 (clojure.core/count s__21076__auto__))) (clojure.core/fn [s__21077__auto__] (clojure.core/< (clojure.core/count s__21077__auto__) 40))))

(clojure.spec.alpha/def :portkey.aws.iot1click-devices/timestamp-unix clojure.core/inst?)

(clojure.spec.alpha/def :portkey.aws.iot1click-devices.get-device-methods-request/device-id (clojure.spec.alpha/and :portkey.aws.iot1click-devices/string))
(clojure.spec.alpha/def :portkey.aws.iot1click-devices/get-device-methods-request (clojure.spec.alpha/keys :req-un [:portkey.aws.iot1click-devices.get-device-methods-request/device-id] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.iot1click-devices.device/device-id (clojure.spec.alpha/and :portkey.aws.iot1click-devices/string))
(clojure.spec.alpha/def :portkey.aws.iot1click-devices.device/type (clojure.spec.alpha/and :portkey.aws.iot1click-devices/string))
(clojure.spec.alpha/def :portkey.aws.iot1click-devices/device (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.iot1click-devices/attributes :portkey.aws.iot1click-devices.device/device-id :portkey.aws.iot1click-devices.device/type]))

(clojure.spec.alpha/def :portkey.aws.iot1click-devices/device-attributes (clojure.spec.alpha/map-of :portkey.aws.iot1click-devices/string :portkey.aws.iot1click-devices/string))

(clojure.spec.alpha/def :portkey.aws.iot1click-devices.list-devices-response/devices (clojure.spec.alpha/and :portkey.aws.iot1click-devices/list-of-device-description))
(clojure.spec.alpha/def :portkey.aws.iot1click-devices.list-devices-response/next-token (clojure.spec.alpha/and :portkey.aws.iot1click-devices/string))
(clojure.spec.alpha/def :portkey.aws.iot1click-devices/list-devices-response (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.iot1click-devices.list-devices-response/devices :portkey.aws.iot1click-devices.list-devices-response/next-token]))

(clojure.spec.alpha/def :portkey.aws.iot1click-devices.unclaim-device-request/device-id (clojure.spec.alpha/and :portkey.aws.iot1click-devices/string))
(clojure.spec.alpha/def :portkey.aws.iot1click-devices/unclaim-device-request (clojure.spec.alpha/keys :req-un [:portkey.aws.iot1click-devices.unclaim-device-request/device-id] :opt-un []))

(clojure.core/defn list-device-events "Using a device ID, returns a DeviceEventsResponse object containing an array of\nevents for the device." ([list-device-events-requestinput] (clojure.core/let [request-function-result__22119__auto__ (req-list-device-events-request list-device-events-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__22119__auto__ {:http.request.configuration/endpoints portkey.aws.iot1click-devices/endpoints, :http.request.configuration/target-prefix nil, :http.request.spec/output-spec :portkey.aws.iot1click-devices/list-device-events-response, :http.request.configuration/mime-type {"content-type" "application/json"}, :http.request.configuration/request-uri "/devices/{deviceId}/events", :http.request.configuration/version "2018-05-14", :http.request.configuration/service-id "IoT 1Click Devices Service", :http.request.spec/input-spec :portkey.aws.iot1click-devices/list-device-events-request, :http.request.configuration/protocol "rest-json", :http.request.configuration/method :get, :http.request.configuration/response-code 200, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "ListDeviceEvents", :http.request.configuration/output-deser-fn response-list-device-events-response, :http.request.spec/error-spec {"ResourceNotFoundException" :portkey.aws.iot1click-devices/resource-not-found-exception, "RangeNotSatisfiableException" :portkey.aws.iot1click-devices/range-not-satisfiable-exception, "InvalidRequestException" :portkey.aws.iot1click-devices/invalid-request-exception, "InternalFailureException" :portkey.aws.iot1click-devices/internal-failure-exception}})))))
(clojure.spec.alpha/fdef list-device-events :args (clojure.spec.alpha/tuple :portkey.aws.iot1click-devices/list-device-events-request) :ret (clojure.spec.alpha/and :portkey.aws.iot1click-devices/list-device-events-response))

(clojure.core/defn claim-devices-by-claim-code "Adds device(s) to your account (i.e., claim one or more devices) if and only if\nyou received a claim code with the device(s)." ([claim-devices-by-claim-code-requestinput] (clojure.core/let [request-function-result__22119__auto__ (req-claim-devices-by-claim-code-request claim-devices-by-claim-code-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__22119__auto__ {:http.request.configuration/endpoints portkey.aws.iot1click-devices/endpoints, :http.request.configuration/target-prefix nil, :http.request.spec/output-spec :portkey.aws.iot1click-devices/claim-devices-by-claim-code-response, :http.request.configuration/mime-type {"content-type" "application/json"}, :http.request.configuration/request-uri "/claims/{claimCode}", :http.request.configuration/version "2018-05-14", :http.request.configuration/service-id "IoT 1Click Devices Service", :http.request.spec/input-spec :portkey.aws.iot1click-devices/claim-devices-by-claim-code-request, :http.request.configuration/protocol "rest-json", :http.request.configuration/method :put, :http.request.configuration/response-code 200, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "ClaimDevicesByClaimCode", :http.request.configuration/output-deser-fn response-claim-devices-by-claim-code-response, :http.request.spec/error-spec {"InvalidRequestException" :portkey.aws.iot1click-devices/invalid-request-exception, "InternalFailureException" :portkey.aws.iot1click-devices/internal-failure-exception, "ForbiddenException" :portkey.aws.iot1click-devices/forbidden-exception}})))))
(clojure.spec.alpha/fdef claim-devices-by-claim-code :args (clojure.spec.alpha/tuple :portkey.aws.iot1click-devices/claim-devices-by-claim-code-request) :ret (clojure.spec.alpha/and :portkey.aws.iot1click-devices/claim-devices-by-claim-code-response))

(clojure.core/defn unclaim-device "Disassociates a device from your AWS account using its device ID." ([unclaim-device-requestinput] (clojure.core/let [request-function-result__22119__auto__ (req-unclaim-device-request unclaim-device-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__22119__auto__ {:http.request.configuration/endpoints portkey.aws.iot1click-devices/endpoints, :http.request.configuration/target-prefix nil, :http.request.spec/output-spec :portkey.aws.iot1click-devices/unclaim-device-response, :http.request.configuration/mime-type {"content-type" "application/json"}, :http.request.configuration/request-uri "/devices/{deviceId}/unclaim", :http.request.configuration/version "2018-05-14", :http.request.configuration/service-id "IoT 1Click Devices Service", :http.request.spec/input-spec :portkey.aws.iot1click-devices/unclaim-device-request, :http.request.configuration/protocol "rest-json", :http.request.configuration/method :put, :http.request.configuration/response-code 200, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "UnclaimDevice", :http.request.configuration/output-deser-fn response-unclaim-device-response, :http.request.spec/error-spec {"ResourceNotFoundException" :portkey.aws.iot1click-devices/resource-not-found-exception, "InvalidRequestException" :portkey.aws.iot1click-devices/invalid-request-exception, "InternalFailureException" :portkey.aws.iot1click-devices/internal-failure-exception}})))))
(clojure.spec.alpha/fdef unclaim-device :args (clojure.spec.alpha/tuple :portkey.aws.iot1click-devices/unclaim-device-request) :ret (clojure.spec.alpha/and :portkey.aws.iot1click-devices/unclaim-device-response))

(clojure.core/defn invoke-device-method "Given a device ID, issues a request to invoke a named device method (with\npossible parameters). See the \"Example POST\" code snippet below." ([invoke-device-method-requestinput] (clojure.core/let [request-function-result__22119__auto__ (req-invoke-device-method-request invoke-device-method-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__22119__auto__ {:http.request.configuration/endpoints portkey.aws.iot1click-devices/endpoints, :http.request.configuration/target-prefix nil, :http.request.spec/output-spec :portkey.aws.iot1click-devices/invoke-device-method-response, :http.request.configuration/mime-type {"content-type" "application/json"}, :http.request.configuration/request-uri "/devices/{deviceId}/methods", :http.request.configuration/version "2018-05-14", :http.request.configuration/service-id "IoT 1Click Devices Service", :http.request.spec/input-spec :portkey.aws.iot1click-devices/invoke-device-method-request, :http.request.configuration/protocol "rest-json", :http.request.configuration/method :post, :http.request.configuration/response-code 200, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "InvokeDeviceMethod", :http.request.configuration/output-deser-fn response-invoke-device-method-response, :http.request.spec/error-spec {"InvalidRequestException" :portkey.aws.iot1click-devices/invalid-request-exception, "PreconditionFailedException" :portkey.aws.iot1click-devices/precondition-failed-exception, "InternalFailureException" :portkey.aws.iot1click-devices/internal-failure-exception, "ResourceNotFoundException" :portkey.aws.iot1click-devices/resource-not-found-exception, "RangeNotSatisfiableException" :portkey.aws.iot1click-devices/range-not-satisfiable-exception, "ResourceConflictException" :portkey.aws.iot1click-devices/resource-conflict-exception}})))))
(clojure.spec.alpha/fdef invoke-device-method :args (clojure.spec.alpha/tuple :portkey.aws.iot1click-devices/invoke-device-method-request) :ret (clojure.spec.alpha/and :portkey.aws.iot1click-devices/invoke-device-method-response))

(clojure.core/defn get-device-methods "Given a device ID, returns the invokable methods associated with the device." ([get-device-methods-requestinput] (clojure.core/let [request-function-result__22119__auto__ (req-get-device-methods-request get-device-methods-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__22119__auto__ {:http.request.configuration/endpoints portkey.aws.iot1click-devices/endpoints, :http.request.configuration/target-prefix nil, :http.request.spec/output-spec :portkey.aws.iot1click-devices/get-device-methods-response, :http.request.configuration/mime-type {"content-type" "application/json"}, :http.request.configuration/request-uri "/devices/{deviceId}/methods", :http.request.configuration/version "2018-05-14", :http.request.configuration/service-id "IoT 1Click Devices Service", :http.request.spec/input-spec :portkey.aws.iot1click-devices/get-device-methods-request, :http.request.configuration/protocol "rest-json", :http.request.configuration/method :get, :http.request.configuration/response-code 200, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "GetDeviceMethods", :http.request.configuration/output-deser-fn response-get-device-methods-response, :http.request.spec/error-spec {"ResourceNotFoundException" :portkey.aws.iot1click-devices/resource-not-found-exception, "InvalidRequestException" :portkey.aws.iot1click-devices/invalid-request-exception, "InternalFailureException" :portkey.aws.iot1click-devices/internal-failure-exception}})))))
(clojure.spec.alpha/fdef get-device-methods :args (clojure.spec.alpha/tuple :portkey.aws.iot1click-devices/get-device-methods-request) :ret (clojure.spec.alpha/and :portkey.aws.iot1click-devices/get-device-methods-response))

(clojure.core/defn finalize-device-claim "Given a device ID, finalizes the claim request for the associated device.\n Claiming a device consists of initiating a claim, then publishing a device\nevent, and finalizing the claim. For a device of type button, a device event can\nbe published by simply clicking the device." ([finalize-device-claim-requestinput] (clojure.core/let [request-function-result__22119__auto__ (req-finalize-device-claim-request finalize-device-claim-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__22119__auto__ {:http.request.configuration/endpoints portkey.aws.iot1click-devices/endpoints, :http.request.configuration/target-prefix nil, :http.request.spec/output-spec :portkey.aws.iot1click-devices/finalize-device-claim-response, :http.request.configuration/mime-type {"content-type" "application/json"}, :http.request.configuration/request-uri "/devices/{deviceId}/finalize-claim", :http.request.configuration/version "2018-05-14", :http.request.configuration/service-id "IoT 1Click Devices Service", :http.request.spec/input-spec :portkey.aws.iot1click-devices/finalize-device-claim-request, :http.request.configuration/protocol "rest-json", :http.request.configuration/method :put, :http.request.configuration/response-code 200, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "FinalizeDeviceClaim", :http.request.configuration/output-deser-fn response-finalize-device-claim-response, :http.request.spec/error-spec {"ResourceNotFoundException" :portkey.aws.iot1click-devices/resource-not-found-exception, "InvalidRequestException" :portkey.aws.iot1click-devices/invalid-request-exception, "InternalFailureException" :portkey.aws.iot1click-devices/internal-failure-exception, "PreconditionFailedException" :portkey.aws.iot1click-devices/precondition-failed-exception, "ResourceConflictException" :portkey.aws.iot1click-devices/resource-conflict-exception}})))))
(clojure.spec.alpha/fdef finalize-device-claim :args (clojure.spec.alpha/tuple :portkey.aws.iot1click-devices/finalize-device-claim-request) :ret (clojure.spec.alpha/and :portkey.aws.iot1click-devices/finalize-device-claim-response))

(clojure.core/defn list-devices "Lists the 1-Click compatible devices associated with your AWS account." ([] (list-devices {})) ([list-devices-requestinput] (clojure.core/let [request-function-result__22119__auto__ (req-list-devices-request list-devices-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__22119__auto__ {:http.request.configuration/endpoints portkey.aws.iot1click-devices/endpoints, :http.request.configuration/target-prefix nil, :http.request.spec/output-spec :portkey.aws.iot1click-devices/list-devices-response, :http.request.configuration/mime-type {"content-type" "application/json"}, :http.request.configuration/request-uri "/devices", :http.request.configuration/version "2018-05-14", :http.request.configuration/service-id "IoT 1Click Devices Service", :http.request.spec/input-spec :portkey.aws.iot1click-devices/list-devices-request, :http.request.configuration/protocol "rest-json", :http.request.configuration/method :get, :http.request.configuration/response-code 200, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "ListDevices", :http.request.configuration/output-deser-fn response-list-devices-response, :http.request.spec/error-spec {"RangeNotSatisfiableException" :portkey.aws.iot1click-devices/range-not-satisfiable-exception, "InvalidRequestException" :portkey.aws.iot1click-devices/invalid-request-exception, "InternalFailureException" :portkey.aws.iot1click-devices/internal-failure-exception}})))))
(clojure.spec.alpha/fdef list-devices :args (clojure.spec.alpha/? :portkey.aws.iot1click-devices/list-devices-request) :ret (clojure.spec.alpha/and :portkey.aws.iot1click-devices/list-devices-response))

(clojure.core/defn update-device-state "Using a Boolean value (true or false), this operation enables or disables the\ndevice given a device ID." ([update-device-state-requestinput] (clojure.core/let [request-function-result__22119__auto__ (req-update-device-state-request update-device-state-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__22119__auto__ {:http.request.configuration/endpoints portkey.aws.iot1click-devices/endpoints, :http.request.configuration/target-prefix nil, :http.request.spec/output-spec :portkey.aws.iot1click-devices/update-device-state-response, :http.request.configuration/mime-type {"content-type" "application/json"}, :http.request.configuration/request-uri "/devices/{deviceId}/state", :http.request.configuration/version "2018-05-14", :http.request.configuration/service-id "IoT 1Click Devices Service", :http.request.spec/input-spec :portkey.aws.iot1click-devices/update-device-state-request, :http.request.configuration/protocol "rest-json", :http.request.configuration/method :put, :http.request.configuration/response-code 200, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "UpdateDeviceState", :http.request.configuration/output-deser-fn response-update-device-state-response, :http.request.spec/error-spec {"ResourceNotFoundException" :portkey.aws.iot1click-devices/resource-not-found-exception, "InvalidRequestException" :portkey.aws.iot1click-devices/invalid-request-exception, "InternalFailureException" :portkey.aws.iot1click-devices/internal-failure-exception}})))))
(clojure.spec.alpha/fdef update-device-state :args (clojure.spec.alpha/tuple :portkey.aws.iot1click-devices/update-device-state-request) :ret (clojure.spec.alpha/and :portkey.aws.iot1click-devices/update-device-state-response))

(clojure.core/defn initiate-device-claim "Given a device ID, initiates a claim request for the associated device.\n Claiming a device consists of initiating a claim, then publishing a device\nevent, and finalizing the claim. For a device of type button, a device event can\nbe published by simply clicking the device." ([initiate-device-claim-requestinput] (clojure.core/let [request-function-result__22119__auto__ (req-initiate-device-claim-request initiate-device-claim-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__22119__auto__ {:http.request.configuration/endpoints portkey.aws.iot1click-devices/endpoints, :http.request.configuration/target-prefix nil, :http.request.spec/output-spec :portkey.aws.iot1click-devices/initiate-device-claim-response, :http.request.configuration/mime-type {"content-type" "application/json"}, :http.request.configuration/request-uri "/devices/{deviceId}/initiate-claim", :http.request.configuration/version "2018-05-14", :http.request.configuration/service-id "IoT 1Click Devices Service", :http.request.spec/input-spec :portkey.aws.iot1click-devices/initiate-device-claim-request, :http.request.configuration/protocol "rest-json", :http.request.configuration/method :put, :http.request.configuration/response-code 200, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "InitiateDeviceClaim", :http.request.configuration/output-deser-fn response-initiate-device-claim-response, :http.request.spec/error-spec {"ResourceNotFoundException" :portkey.aws.iot1click-devices/resource-not-found-exception, "InvalidRequestException" :portkey.aws.iot1click-devices/invalid-request-exception, "InternalFailureException" :portkey.aws.iot1click-devices/internal-failure-exception, "ResourceConflictException" :portkey.aws.iot1click-devices/resource-conflict-exception}})))))
(clojure.spec.alpha/fdef initiate-device-claim :args (clojure.spec.alpha/tuple :portkey.aws.iot1click-devices/initiate-device-claim-request) :ret (clojure.spec.alpha/and :portkey.aws.iot1click-devices/initiate-device-claim-response))

(clojure.core/defn describe-device "Given a device ID, returns a DescribeDeviceResponse object describing the\ndetails of the device." ([describe-device-requestinput] (clojure.core/let [request-function-result__22119__auto__ (req-describe-device-request describe-device-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__22119__auto__ {:http.request.configuration/endpoints portkey.aws.iot1click-devices/endpoints, :http.request.configuration/target-prefix nil, :http.request.spec/output-spec :portkey.aws.iot1click-devices/describe-device-response, :http.request.configuration/mime-type {"content-type" "application/json"}, :http.request.configuration/request-uri "/devices/{deviceId}", :http.request.configuration/version "2018-05-14", :http.request.configuration/service-id "IoT 1Click Devices Service", :http.request.spec/input-spec :portkey.aws.iot1click-devices/describe-device-request, :http.request.configuration/protocol "rest-json", :http.request.configuration/method :get, :http.request.configuration/response-code 200, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "DescribeDevice", :http.request.configuration/output-deser-fn response-describe-device-response, :http.request.spec/error-spec {"ResourceNotFoundException" :portkey.aws.iot1click-devices/resource-not-found-exception, "InvalidRequestException" :portkey.aws.iot1click-devices/invalid-request-exception, "InternalFailureException" :portkey.aws.iot1click-devices/internal-failure-exception}})))))
(clojure.spec.alpha/fdef describe-device :args (clojure.spec.alpha/tuple :portkey.aws.iot1click-devices/describe-device-request) :ret (clojure.spec.alpha/and :portkey.aws.iot1click-devices/describe-device-response))
