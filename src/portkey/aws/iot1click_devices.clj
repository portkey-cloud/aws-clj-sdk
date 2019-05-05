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

(clojure.core/defn- response-invoke-device-method-response ([input] (response-invoke-device-method-response nil input)) ([resultWrapper1232774 input] (clojure.core/let [rawinput1232773 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar1232775 {"deviceMethodResponse" (rawinput1232773 "deviceMethodResponse")}] (clojure.core/cond-> {} (letvar1232775 "deviceMethodResponse") (clojure.core/assoc :device-method-response (deser-string (clojure.core/get-in letvar1232775 ["deviceMethodResponse"])))))))

(clojure.core/defn- response-precondition-failed-exception ([input] (response-precondition-failed-exception nil input)) ([resultWrapper1232777 input] (clojure.core/let [rawinput1232776 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar1232778 {"code" (rawinput1232776 "code"), "message" (rawinput1232776 "message")}] (clojure.core/cond-> {} (letvar1232778 "code") (clojure.core/assoc :code (deser-string (clojure.core/get-in letvar1232778 ["code"]))) (letvar1232778 "message") (clojure.core/assoc :message (deser-string (clojure.core/get-in letvar1232778 ["message"])))))))

(clojure.core/defn- response-invalid-request-exception ([input] (response-invalid-request-exception nil input)) ([resultWrapper1232780 input] (clojure.core/let [rawinput1232779 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar1232781 {"code" (rawinput1232779 "code"), "message" (rawinput1232779 "message")}] (clojure.core/cond-> {} (letvar1232781 "code") (clojure.core/assoc :code (deser-string (clojure.core/get-in letvar1232781 ["code"]))) (letvar1232781 "message") (clojure.core/assoc :message (deser-string (clojure.core/get-in letvar1232781 ["message"])))))))

(clojure.core/defn- response-get-device-methods-response ([input] (response-get-device-methods-response nil input)) ([resultWrapper1232783 input] (clojure.core/let [rawinput1232782 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar1232784 {"deviceMethods" (rawinput1232782 "deviceMethods")}] (clojure.core/cond-> {} (letvar1232784 "deviceMethods") (clojure.core/assoc :device-methods (deser-list-of-device-method (clojure.core/get-in letvar1232784 ["deviceMethods"])))))))

(clojure.core/defn- response-forbidden-exception ([input] (response-forbidden-exception nil input)) ([resultWrapper1232786 input] (clojure.core/let [rawinput1232785 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar1232787 {"code" (rawinput1232785 "code"), "message" (rawinput1232785 "message")}] (clojure.core/cond-> {} (letvar1232787 "code") (clojure.core/assoc :code (deser-string (clojure.core/get-in letvar1232787 ["code"]))) (letvar1232787 "message") (clojure.core/assoc :message (deser-string (clojure.core/get-in letvar1232787 ["message"])))))))

(clojure.core/defn- response-initiate-device-claim-response ([input] (response-initiate-device-claim-response nil input)) ([resultWrapper1232789 input] (clojure.core/let [rawinput1232788 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar1232790 {"state" (rawinput1232788 "state")}] (clojure.core/cond-> {} (letvar1232790 "state") (clojure.core/assoc :state (deser-string (clojure.core/get-in letvar1232790 ["state"])))))))

(clojure.core/defn- response-update-device-state-response ([input] (response-update-device-state-response nil input)) ([resultWrapper1232792 input] (clojure.core/let [rawinput1232791 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar1232793 {}] (clojure.core/cond-> {}))))

(clojure.core/defn- response-internal-failure-exception ([input] (response-internal-failure-exception nil input)) ([resultWrapper1232795 input] (clojure.core/let [rawinput1232794 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar1232796 {"code" (rawinput1232794 "code"), "message" (rawinput1232794 "message")}] (clojure.core/cond-> {} (letvar1232796 "code") (clojure.core/assoc :code (deser-string (clojure.core/get-in letvar1232796 ["code"]))) (letvar1232796 "message") (clojure.core/assoc :message (deser-string (clojure.core/get-in letvar1232796 ["message"])))))))

(clojure.core/defn- response-describe-device-response ([input] (response-describe-device-response nil input)) ([resultWrapper1232798 input] (clojure.core/let [rawinput1232797 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar1232799 {"deviceDescription" (rawinput1232797 "deviceDescription")}] (clojure.core/cond-> {} (letvar1232799 "deviceDescription") (clojure.core/assoc :device-description (deser-device-description (clojure.core/get-in letvar1232799 ["deviceDescription"])))))))

(clojure.core/defn- response-resource-not-found-exception ([input] (response-resource-not-found-exception nil input)) ([resultWrapper1232801 input] (clojure.core/let [rawinput1232800 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar1232802 {"code" (rawinput1232800 "code"), "message" (rawinput1232800 "message")}] (clojure.core/cond-> {} (letvar1232802 "code") (clojure.core/assoc :code (deser-string (clojure.core/get-in letvar1232802 ["code"]))) (letvar1232802 "message") (clojure.core/assoc :message (deser-string (clojure.core/get-in letvar1232802 ["message"])))))))

(clojure.core/defn- response-claim-devices-by-claim-code-response ([input] (response-claim-devices-by-claim-code-response nil input)) ([resultWrapper1232804 input] (clojure.core/let [rawinput1232803 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar1232805 {"claimCode" (rawinput1232803 "claimCode"), "total" (rawinput1232803 "total")}] (clojure.core/cond-> {} (letvar1232805 "claimCode") (clojure.core/assoc :claim-code (deser-string-min-12-max-40 (clojure.core/get-in letvar1232805 ["claimCode"]))) (letvar1232805 "total") (clojure.core/assoc :total (deser-integer (clojure.core/get-in letvar1232805 ["total"])))))))

(clojure.core/defn- response-resource-conflict-exception ([input] (response-resource-conflict-exception nil input)) ([resultWrapper1232807 input] (clojure.core/let [rawinput1232806 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar1232808 {"code" (rawinput1232806 "code"), "message" (rawinput1232806 "message")}] (clojure.core/cond-> {} (letvar1232808 "code") (clojure.core/assoc :code (deser-string (clojure.core/get-in letvar1232808 ["code"]))) (letvar1232808 "message") (clojure.core/assoc :message (deser-string (clojure.core/get-in letvar1232808 ["message"])))))))

(clojure.core/defn- response-list-device-events-response ([input] (response-list-device-events-response nil input)) ([resultWrapper1232810 input] (clojure.core/let [rawinput1232809 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar1232811 {"events" (rawinput1232809 "events"), "nextToken" (rawinput1232809 "nextToken")}] (clojure.core/cond-> {} (letvar1232811 "events") (clojure.core/assoc :events (deser-list-of-device-event (clojure.core/get-in letvar1232811 ["events"]))) (letvar1232811 "nextToken") (clojure.core/assoc :next-token (deser-string (clojure.core/get-in letvar1232811 ["nextToken"])))))))

(clojure.core/defn- response-range-not-satisfiable-exception ([input] (response-range-not-satisfiable-exception nil input)) ([resultWrapper1232813 input] (clojure.core/let [rawinput1232812 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar1232814 {"code" (rawinput1232812 "code"), "message" (rawinput1232812 "message")}] (clojure.core/cond-> {} (letvar1232814 "code") (clojure.core/assoc :code (deser-string (clojure.core/get-in letvar1232814 ["code"]))) (letvar1232814 "message") (clojure.core/assoc :message (deser-string (clojure.core/get-in letvar1232814 ["message"])))))))

(clojure.core/defn- response-unclaim-device-response ([input] (response-unclaim-device-response nil input)) ([resultWrapper1232816 input] (clojure.core/let [rawinput1232815 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar1232817 {"state" (rawinput1232815 "state")}] (clojure.core/cond-> {} (letvar1232817 "state") (clojure.core/assoc :state (deser-string (clojure.core/get-in letvar1232817 ["state"])))))))

(clojure.core/defn- response-finalize-device-claim-response ([input] (response-finalize-device-claim-response nil input)) ([resultWrapper1232819 input] (clojure.core/let [rawinput1232818 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar1232820 {"state" (rawinput1232818 "state")}] (clojure.core/cond-> {} (letvar1232820 "state") (clojure.core/assoc :state (deser-string (clojure.core/get-in letvar1232820 ["state"])))))))

(clojure.core/defn- response-list-devices-response ([input] (response-list-devices-response nil input)) ([resultWrapper1232822 input] (clojure.core/let [rawinput1232821 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar1232823 {"devices" (rawinput1232821 "devices"), "nextToken" (rawinput1232821 "nextToken")}] (clojure.core/cond-> {} (letvar1232823 "devices") (clojure.core/assoc :devices (deser-list-of-device-description (clojure.core/get-in letvar1232823 ["devices"]))) (letvar1232823 "nextToken") (clojure.core/assoc :next-token (deser-string (clojure.core/get-in letvar1232823 ["nextToken"])))))))

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

(clojure.spec.alpha/def :portkey.aws.iot1click-devices/string-min-12-max-40 (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__1012852__auto__] (clojure.core/<= 12 (clojure.core/count s__1012852__auto__))) (clojure.core/fn [s__1012853__auto__] (clojure.core/< (clojure.core/count s__1012853__auto__) 40))))

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

(clojure.core/defn list-device-events ([list-device-events-requestinput] (clojure.core/let [request-function-result__1013884__auto__ (req-list-device-events-request list-device-events-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__1013884__auto__ {:http.request.configuration/endpoints portkey.aws.iot1click-devices/endpoints, :http.request.configuration/target-prefix nil, :http.request.spec/output-spec :portkey.aws.iot1click-devices/list-device-events-response, :http.request.configuration/mime-type {"content-type" "application/json"}, :http.request.configuration/request-uri "/devices/{deviceId}/events", :http.request.configuration/version "2018-05-14", :http.request.configuration/service-id "IoT 1Click Devices Service", :http.request.spec/input-spec :portkey.aws.iot1click-devices/list-device-events-request, :http.request.configuration/protocol "rest-json", :http.request.configuration/method :get, :http.request.configuration/response-code 200, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "ListDeviceEvents", :http.request.configuration/output-deser-fn response-list-device-events-response, :http.request.spec/error-spec {"ResourceNotFoundException" :portkey.aws.iot1click-devices/resource-not-found-exception, "RangeNotSatisfiableException" :portkey.aws.iot1click-devices/range-not-satisfiable-exception, "InvalidRequestException" :portkey.aws.iot1click-devices/invalid-request-exception, "InternalFailureException" :portkey.aws.iot1click-devices/internal-failure-exception}})))))
(clojure.spec.alpha/fdef list-device-events :args (clojure.spec.alpha/tuple :portkey.aws.iot1click-devices/list-device-events-request) :ret (clojure.spec.alpha/and :portkey.aws.iot1click-devices/list-device-events-response))

(clojure.core/defn claim-devices-by-claim-code ([claim-devices-by-claim-code-requestinput] (clojure.core/let [request-function-result__1013884__auto__ (req-claim-devices-by-claim-code-request claim-devices-by-claim-code-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__1013884__auto__ {:http.request.configuration/endpoints portkey.aws.iot1click-devices/endpoints, :http.request.configuration/target-prefix nil, :http.request.spec/output-spec :portkey.aws.iot1click-devices/claim-devices-by-claim-code-response, :http.request.configuration/mime-type {"content-type" "application/json"}, :http.request.configuration/request-uri "/claims/{claimCode}", :http.request.configuration/version "2018-05-14", :http.request.configuration/service-id "IoT 1Click Devices Service", :http.request.spec/input-spec :portkey.aws.iot1click-devices/claim-devices-by-claim-code-request, :http.request.configuration/protocol "rest-json", :http.request.configuration/method :put, :http.request.configuration/response-code 200, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "ClaimDevicesByClaimCode", :http.request.configuration/output-deser-fn response-claim-devices-by-claim-code-response, :http.request.spec/error-spec {"InvalidRequestException" :portkey.aws.iot1click-devices/invalid-request-exception, "InternalFailureException" :portkey.aws.iot1click-devices/internal-failure-exception, "ForbiddenException" :portkey.aws.iot1click-devices/forbidden-exception}})))))
(clojure.spec.alpha/fdef claim-devices-by-claim-code :args (clojure.spec.alpha/tuple :portkey.aws.iot1click-devices/claim-devices-by-claim-code-request) :ret (clojure.spec.alpha/and :portkey.aws.iot1click-devices/claim-devices-by-claim-code-response))

(clojure.core/defn unclaim-device ([unclaim-device-requestinput] (clojure.core/let [request-function-result__1013884__auto__ (req-unclaim-device-request unclaim-device-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__1013884__auto__ {:http.request.configuration/endpoints portkey.aws.iot1click-devices/endpoints, :http.request.configuration/target-prefix nil, :http.request.spec/output-spec :portkey.aws.iot1click-devices/unclaim-device-response, :http.request.configuration/mime-type {"content-type" "application/json"}, :http.request.configuration/request-uri "/devices/{deviceId}/unclaim", :http.request.configuration/version "2018-05-14", :http.request.configuration/service-id "IoT 1Click Devices Service", :http.request.spec/input-spec :portkey.aws.iot1click-devices/unclaim-device-request, :http.request.configuration/protocol "rest-json", :http.request.configuration/method :put, :http.request.configuration/response-code 200, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "UnclaimDevice", :http.request.configuration/output-deser-fn response-unclaim-device-response, :http.request.spec/error-spec {"ResourceNotFoundException" :portkey.aws.iot1click-devices/resource-not-found-exception, "InvalidRequestException" :portkey.aws.iot1click-devices/invalid-request-exception, "InternalFailureException" :portkey.aws.iot1click-devices/internal-failure-exception}})))))
(clojure.spec.alpha/fdef unclaim-device :args (clojure.spec.alpha/tuple :portkey.aws.iot1click-devices/unclaim-device-request) :ret (clojure.spec.alpha/and :portkey.aws.iot1click-devices/unclaim-device-response))

(clojure.core/defn invoke-device-method ([invoke-device-method-requestinput] (clojure.core/let [request-function-result__1013884__auto__ (req-invoke-device-method-request invoke-device-method-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__1013884__auto__ {:http.request.configuration/endpoints portkey.aws.iot1click-devices/endpoints, :http.request.configuration/target-prefix nil, :http.request.spec/output-spec :portkey.aws.iot1click-devices/invoke-device-method-response, :http.request.configuration/mime-type {"content-type" "application/json"}, :http.request.configuration/request-uri "/devices/{deviceId}/methods", :http.request.configuration/version "2018-05-14", :http.request.configuration/service-id "IoT 1Click Devices Service", :http.request.spec/input-spec :portkey.aws.iot1click-devices/invoke-device-method-request, :http.request.configuration/protocol "rest-json", :http.request.configuration/method :post, :http.request.configuration/response-code 200, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "InvokeDeviceMethod", :http.request.configuration/output-deser-fn response-invoke-device-method-response, :http.request.spec/error-spec {"InvalidRequestException" :portkey.aws.iot1click-devices/invalid-request-exception, "PreconditionFailedException" :portkey.aws.iot1click-devices/precondition-failed-exception, "InternalFailureException" :portkey.aws.iot1click-devices/internal-failure-exception, "ResourceNotFoundException" :portkey.aws.iot1click-devices/resource-not-found-exception, "RangeNotSatisfiableException" :portkey.aws.iot1click-devices/range-not-satisfiable-exception, "ResourceConflictException" :portkey.aws.iot1click-devices/resource-conflict-exception}})))))
(clojure.spec.alpha/fdef invoke-device-method :args (clojure.spec.alpha/tuple :portkey.aws.iot1click-devices/invoke-device-method-request) :ret (clojure.spec.alpha/and :portkey.aws.iot1click-devices/invoke-device-method-response))

(clojure.core/defn get-device-methods ([get-device-methods-requestinput] (clojure.core/let [request-function-result__1013884__auto__ (req-get-device-methods-request get-device-methods-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__1013884__auto__ {:http.request.configuration/endpoints portkey.aws.iot1click-devices/endpoints, :http.request.configuration/target-prefix nil, :http.request.spec/output-spec :portkey.aws.iot1click-devices/get-device-methods-response, :http.request.configuration/mime-type {"content-type" "application/json"}, :http.request.configuration/request-uri "/devices/{deviceId}/methods", :http.request.configuration/version "2018-05-14", :http.request.configuration/service-id "IoT 1Click Devices Service", :http.request.spec/input-spec :portkey.aws.iot1click-devices/get-device-methods-request, :http.request.configuration/protocol "rest-json", :http.request.configuration/method :get, :http.request.configuration/response-code 200, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "GetDeviceMethods", :http.request.configuration/output-deser-fn response-get-device-methods-response, :http.request.spec/error-spec {"ResourceNotFoundException" :portkey.aws.iot1click-devices/resource-not-found-exception, "InvalidRequestException" :portkey.aws.iot1click-devices/invalid-request-exception, "InternalFailureException" :portkey.aws.iot1click-devices/internal-failure-exception}})))))
(clojure.spec.alpha/fdef get-device-methods :args (clojure.spec.alpha/tuple :portkey.aws.iot1click-devices/get-device-methods-request) :ret (clojure.spec.alpha/and :portkey.aws.iot1click-devices/get-device-methods-response))

(clojure.core/defn finalize-device-claim ([finalize-device-claim-requestinput] (clojure.core/let [request-function-result__1013884__auto__ (req-finalize-device-claim-request finalize-device-claim-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__1013884__auto__ {:http.request.configuration/endpoints portkey.aws.iot1click-devices/endpoints, :http.request.configuration/target-prefix nil, :http.request.spec/output-spec :portkey.aws.iot1click-devices/finalize-device-claim-response, :http.request.configuration/mime-type {"content-type" "application/json"}, :http.request.configuration/request-uri "/devices/{deviceId}/finalize-claim", :http.request.configuration/version "2018-05-14", :http.request.configuration/service-id "IoT 1Click Devices Service", :http.request.spec/input-spec :portkey.aws.iot1click-devices/finalize-device-claim-request, :http.request.configuration/protocol "rest-json", :http.request.configuration/method :put, :http.request.configuration/response-code 200, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "FinalizeDeviceClaim", :http.request.configuration/output-deser-fn response-finalize-device-claim-response, :http.request.spec/error-spec {"ResourceNotFoundException" :portkey.aws.iot1click-devices/resource-not-found-exception, "InvalidRequestException" :portkey.aws.iot1click-devices/invalid-request-exception, "InternalFailureException" :portkey.aws.iot1click-devices/internal-failure-exception, "PreconditionFailedException" :portkey.aws.iot1click-devices/precondition-failed-exception, "ResourceConflictException" :portkey.aws.iot1click-devices/resource-conflict-exception}})))))
(clojure.spec.alpha/fdef finalize-device-claim :args (clojure.spec.alpha/tuple :portkey.aws.iot1click-devices/finalize-device-claim-request) :ret (clojure.spec.alpha/and :portkey.aws.iot1click-devices/finalize-device-claim-response))

(clojure.core/defn list-devices ([] (list-devices {})) ([list-devices-requestinput] (clojure.core/let [request-function-result__1013884__auto__ (req-list-devices-request list-devices-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__1013884__auto__ {:http.request.configuration/endpoints portkey.aws.iot1click-devices/endpoints, :http.request.configuration/target-prefix nil, :http.request.spec/output-spec :portkey.aws.iot1click-devices/list-devices-response, :http.request.configuration/mime-type {"content-type" "application/json"}, :http.request.configuration/request-uri "/devices", :http.request.configuration/version "2018-05-14", :http.request.configuration/service-id "IoT 1Click Devices Service", :http.request.spec/input-spec :portkey.aws.iot1click-devices/list-devices-request, :http.request.configuration/protocol "rest-json", :http.request.configuration/method :get, :http.request.configuration/response-code 200, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "ListDevices", :http.request.configuration/output-deser-fn response-list-devices-response, :http.request.spec/error-spec {"RangeNotSatisfiableException" :portkey.aws.iot1click-devices/range-not-satisfiable-exception, "InvalidRequestException" :portkey.aws.iot1click-devices/invalid-request-exception, "InternalFailureException" :portkey.aws.iot1click-devices/internal-failure-exception}})))))
(clojure.spec.alpha/fdef list-devices :args (clojure.spec.alpha/? :portkey.aws.iot1click-devices/list-devices-request) :ret (clojure.spec.alpha/and :portkey.aws.iot1click-devices/list-devices-response))

(clojure.core/defn update-device-state ([update-device-state-requestinput] (clojure.core/let [request-function-result__1013884__auto__ (req-update-device-state-request update-device-state-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__1013884__auto__ {:http.request.configuration/endpoints portkey.aws.iot1click-devices/endpoints, :http.request.configuration/target-prefix nil, :http.request.spec/output-spec :portkey.aws.iot1click-devices/update-device-state-response, :http.request.configuration/mime-type {"content-type" "application/json"}, :http.request.configuration/request-uri "/devices/{deviceId}/state", :http.request.configuration/version "2018-05-14", :http.request.configuration/service-id "IoT 1Click Devices Service", :http.request.spec/input-spec :portkey.aws.iot1click-devices/update-device-state-request, :http.request.configuration/protocol "rest-json", :http.request.configuration/method :put, :http.request.configuration/response-code 200, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "UpdateDeviceState", :http.request.configuration/output-deser-fn response-update-device-state-response, :http.request.spec/error-spec {"ResourceNotFoundException" :portkey.aws.iot1click-devices/resource-not-found-exception, "InvalidRequestException" :portkey.aws.iot1click-devices/invalid-request-exception, "InternalFailureException" :portkey.aws.iot1click-devices/internal-failure-exception}})))))
(clojure.spec.alpha/fdef update-device-state :args (clojure.spec.alpha/tuple :portkey.aws.iot1click-devices/update-device-state-request) :ret (clojure.spec.alpha/and :portkey.aws.iot1click-devices/update-device-state-response))

(clojure.core/defn initiate-device-claim ([initiate-device-claim-requestinput] (clojure.core/let [request-function-result__1013884__auto__ (req-initiate-device-claim-request initiate-device-claim-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__1013884__auto__ {:http.request.configuration/endpoints portkey.aws.iot1click-devices/endpoints, :http.request.configuration/target-prefix nil, :http.request.spec/output-spec :portkey.aws.iot1click-devices/initiate-device-claim-response, :http.request.configuration/mime-type {"content-type" "application/json"}, :http.request.configuration/request-uri "/devices/{deviceId}/initiate-claim", :http.request.configuration/version "2018-05-14", :http.request.configuration/service-id "IoT 1Click Devices Service", :http.request.spec/input-spec :portkey.aws.iot1click-devices/initiate-device-claim-request, :http.request.configuration/protocol "rest-json", :http.request.configuration/method :put, :http.request.configuration/response-code 200, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "InitiateDeviceClaim", :http.request.configuration/output-deser-fn response-initiate-device-claim-response, :http.request.spec/error-spec {"ResourceNotFoundException" :portkey.aws.iot1click-devices/resource-not-found-exception, "InvalidRequestException" :portkey.aws.iot1click-devices/invalid-request-exception, "InternalFailureException" :portkey.aws.iot1click-devices/internal-failure-exception, "ResourceConflictException" :portkey.aws.iot1click-devices/resource-conflict-exception}})))))
(clojure.spec.alpha/fdef initiate-device-claim :args (clojure.spec.alpha/tuple :portkey.aws.iot1click-devices/initiate-device-claim-request) :ret (clojure.spec.alpha/and :portkey.aws.iot1click-devices/initiate-device-claim-response))

(clojure.core/defn describe-device ([describe-device-requestinput] (clojure.core/let [request-function-result__1013884__auto__ (req-describe-device-request describe-device-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__1013884__auto__ {:http.request.configuration/endpoints portkey.aws.iot1click-devices/endpoints, :http.request.configuration/target-prefix nil, :http.request.spec/output-spec :portkey.aws.iot1click-devices/describe-device-response, :http.request.configuration/mime-type {"content-type" "application/json"}, :http.request.configuration/request-uri "/devices/{deviceId}", :http.request.configuration/version "2018-05-14", :http.request.configuration/service-id "IoT 1Click Devices Service", :http.request.spec/input-spec :portkey.aws.iot1click-devices/describe-device-request, :http.request.configuration/protocol "rest-json", :http.request.configuration/method :get, :http.request.configuration/response-code 200, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "DescribeDevice", :http.request.configuration/output-deser-fn response-describe-device-response, :http.request.spec/error-spec {"ResourceNotFoundException" :portkey.aws.iot1click-devices/resource-not-found-exception, "InvalidRequestException" :portkey.aws.iot1click-devices/invalid-request-exception, "InternalFailureException" :portkey.aws.iot1click-devices/internal-failure-exception}})))))
(clojure.spec.alpha/fdef describe-device :args (clojure.spec.alpha/tuple :portkey.aws.iot1click-devices/describe-device-request) :ret (clojure.spec.alpha/and :portkey.aws.iot1click-devices/describe-device-response))
