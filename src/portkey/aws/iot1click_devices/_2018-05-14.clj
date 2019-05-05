(ns portkey.aws.iot1click-devices.-2018-05-14 (:require [portkey.aws]))

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

(clojure.core/defn- response-invoke-device-method-response ([input] (response-invoke-device-method-response nil input)) ([resultWrapper1233622 input] (clojure.core/let [rawinput1233621 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar1233623 {"deviceMethodResponse" (rawinput1233621 "deviceMethodResponse")}] (clojure.core/cond-> {} (letvar1233623 "deviceMethodResponse") (clojure.core/assoc :device-method-response (deser-string (clojure.core/get-in letvar1233623 ["deviceMethodResponse"])))))))

(clojure.core/defn- response-precondition-failed-exception ([input] (response-precondition-failed-exception nil input)) ([resultWrapper1233625 input] (clojure.core/let [rawinput1233624 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar1233626 {"code" (rawinput1233624 "code"), "message" (rawinput1233624 "message")}] (clojure.core/cond-> {} (letvar1233626 "code") (clojure.core/assoc :code (deser-string (clojure.core/get-in letvar1233626 ["code"]))) (letvar1233626 "message") (clojure.core/assoc :message (deser-string (clojure.core/get-in letvar1233626 ["message"])))))))

(clojure.core/defn- response-invalid-request-exception ([input] (response-invalid-request-exception nil input)) ([resultWrapper1233628 input] (clojure.core/let [rawinput1233627 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar1233629 {"code" (rawinput1233627 "code"), "message" (rawinput1233627 "message")}] (clojure.core/cond-> {} (letvar1233629 "code") (clojure.core/assoc :code (deser-string (clojure.core/get-in letvar1233629 ["code"]))) (letvar1233629 "message") (clojure.core/assoc :message (deser-string (clojure.core/get-in letvar1233629 ["message"])))))))

(clojure.core/defn- response-get-device-methods-response ([input] (response-get-device-methods-response nil input)) ([resultWrapper1233631 input] (clojure.core/let [rawinput1233630 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar1233632 {"deviceMethods" (rawinput1233630 "deviceMethods")}] (clojure.core/cond-> {} (letvar1233632 "deviceMethods") (clojure.core/assoc :device-methods (deser-list-of-device-method (clojure.core/get-in letvar1233632 ["deviceMethods"])))))))

(clojure.core/defn- response-forbidden-exception ([input] (response-forbidden-exception nil input)) ([resultWrapper1233634 input] (clojure.core/let [rawinput1233633 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar1233635 {"code" (rawinput1233633 "code"), "message" (rawinput1233633 "message")}] (clojure.core/cond-> {} (letvar1233635 "code") (clojure.core/assoc :code (deser-string (clojure.core/get-in letvar1233635 ["code"]))) (letvar1233635 "message") (clojure.core/assoc :message (deser-string (clojure.core/get-in letvar1233635 ["message"])))))))

(clojure.core/defn- response-initiate-device-claim-response ([input] (response-initiate-device-claim-response nil input)) ([resultWrapper1233637 input] (clojure.core/let [rawinput1233636 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar1233638 {"state" (rawinput1233636 "state")}] (clojure.core/cond-> {} (letvar1233638 "state") (clojure.core/assoc :state (deser-string (clojure.core/get-in letvar1233638 ["state"])))))))

(clojure.core/defn- response-update-device-state-response ([input] (response-update-device-state-response nil input)) ([resultWrapper1233640 input] (clojure.core/let [rawinput1233639 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar1233641 {}] (clojure.core/cond-> {}))))

(clojure.core/defn- response-internal-failure-exception ([input] (response-internal-failure-exception nil input)) ([resultWrapper1233643 input] (clojure.core/let [rawinput1233642 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar1233644 {"code" (rawinput1233642 "code"), "message" (rawinput1233642 "message")}] (clojure.core/cond-> {} (letvar1233644 "code") (clojure.core/assoc :code (deser-string (clojure.core/get-in letvar1233644 ["code"]))) (letvar1233644 "message") (clojure.core/assoc :message (deser-string (clojure.core/get-in letvar1233644 ["message"])))))))

(clojure.core/defn- response-describe-device-response ([input] (response-describe-device-response nil input)) ([resultWrapper1233646 input] (clojure.core/let [rawinput1233645 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar1233647 {"deviceDescription" (rawinput1233645 "deviceDescription")}] (clojure.core/cond-> {} (letvar1233647 "deviceDescription") (clojure.core/assoc :device-description (deser-device-description (clojure.core/get-in letvar1233647 ["deviceDescription"])))))))

(clojure.core/defn- response-resource-not-found-exception ([input] (response-resource-not-found-exception nil input)) ([resultWrapper1233649 input] (clojure.core/let [rawinput1233648 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar1233650 {"code" (rawinput1233648 "code"), "message" (rawinput1233648 "message")}] (clojure.core/cond-> {} (letvar1233650 "code") (clojure.core/assoc :code (deser-string (clojure.core/get-in letvar1233650 ["code"]))) (letvar1233650 "message") (clojure.core/assoc :message (deser-string (clojure.core/get-in letvar1233650 ["message"])))))))

(clojure.core/defn- response-claim-devices-by-claim-code-response ([input] (response-claim-devices-by-claim-code-response nil input)) ([resultWrapper1233652 input] (clojure.core/let [rawinput1233651 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar1233653 {"claimCode" (rawinput1233651 "claimCode"), "total" (rawinput1233651 "total")}] (clojure.core/cond-> {} (letvar1233653 "claimCode") (clojure.core/assoc :claim-code (deser-string-min-12-max-40 (clojure.core/get-in letvar1233653 ["claimCode"]))) (letvar1233653 "total") (clojure.core/assoc :total (deser-integer (clojure.core/get-in letvar1233653 ["total"])))))))

(clojure.core/defn- response-resource-conflict-exception ([input] (response-resource-conflict-exception nil input)) ([resultWrapper1233655 input] (clojure.core/let [rawinput1233654 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar1233656 {"code" (rawinput1233654 "code"), "message" (rawinput1233654 "message")}] (clojure.core/cond-> {} (letvar1233656 "code") (clojure.core/assoc :code (deser-string (clojure.core/get-in letvar1233656 ["code"]))) (letvar1233656 "message") (clojure.core/assoc :message (deser-string (clojure.core/get-in letvar1233656 ["message"])))))))

(clojure.core/defn- response-list-device-events-response ([input] (response-list-device-events-response nil input)) ([resultWrapper1233658 input] (clojure.core/let [rawinput1233657 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar1233659 {"events" (rawinput1233657 "events"), "nextToken" (rawinput1233657 "nextToken")}] (clojure.core/cond-> {} (letvar1233659 "events") (clojure.core/assoc :events (deser-list-of-device-event (clojure.core/get-in letvar1233659 ["events"]))) (letvar1233659 "nextToken") (clojure.core/assoc :next-token (deser-string (clojure.core/get-in letvar1233659 ["nextToken"])))))))

(clojure.core/defn- response-range-not-satisfiable-exception ([input] (response-range-not-satisfiable-exception nil input)) ([resultWrapper1233661 input] (clojure.core/let [rawinput1233660 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar1233662 {"code" (rawinput1233660 "code"), "message" (rawinput1233660 "message")}] (clojure.core/cond-> {} (letvar1233662 "code") (clojure.core/assoc :code (deser-string (clojure.core/get-in letvar1233662 ["code"]))) (letvar1233662 "message") (clojure.core/assoc :message (deser-string (clojure.core/get-in letvar1233662 ["message"])))))))

(clojure.core/defn- response-unclaim-device-response ([input] (response-unclaim-device-response nil input)) ([resultWrapper1233664 input] (clojure.core/let [rawinput1233663 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar1233665 {"state" (rawinput1233663 "state")}] (clojure.core/cond-> {} (letvar1233665 "state") (clojure.core/assoc :state (deser-string (clojure.core/get-in letvar1233665 ["state"])))))))

(clojure.core/defn- response-finalize-device-claim-response ([input] (response-finalize-device-claim-response nil input)) ([resultWrapper1233667 input] (clojure.core/let [rawinput1233666 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar1233668 {"state" (rawinput1233666 "state")}] (clojure.core/cond-> {} (letvar1233668 "state") (clojure.core/assoc :state (deser-string (clojure.core/get-in letvar1233668 ["state"])))))))

(clojure.core/defn- response-list-devices-response ([input] (response-list-devices-response nil input)) ([resultWrapper1233670 input] (clojure.core/let [rawinput1233669 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar1233671 {"devices" (rawinput1233669 "devices"), "nextToken" (rawinput1233669 "nextToken")}] (clojure.core/cond-> {} (letvar1233671 "devices") (clojure.core/assoc :devices (deser-list-of-device-description (clojure.core/get-in letvar1233671 ["devices"]))) (letvar1233671 "nextToken") (clojure.core/assoc :next-token (deser-string (clojure.core/get-in letvar1233671 ["nextToken"])))))))

(clojure.spec.alpha/def :portkey.aws.iot1click-devices.-2018-05-14.invoke-device-method-response/device-method-response (clojure.spec.alpha/and :portkey.aws.iot1click-devices.-2018-05-14/string))
(clojure.spec.alpha/def :portkey.aws.iot1click-devices.-2018-05-14/invoke-device-method-response (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.iot1click-devices.-2018-05-14.invoke-device-method-response/device-method-response]))

(clojure.spec.alpha/def :portkey.aws.iot1click-devices.-2018-05-14/empty (clojure.spec.alpha/keys :req-un [] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.iot1click-devices.-2018-05-14.device-description/attributes (clojure.spec.alpha/and :portkey.aws.iot1click-devices.-2018-05-14/device-attributes))
(clojure.spec.alpha/def :portkey.aws.iot1click-devices.-2018-05-14.device-description/device-id (clojure.spec.alpha/and :portkey.aws.iot1click-devices.-2018-05-14/string))
(clojure.spec.alpha/def :portkey.aws.iot1click-devices.-2018-05-14.device-description/enabled (clojure.spec.alpha/and :portkey.aws.iot1click-devices.-2018-05-14/boolean))
(clojure.spec.alpha/def :portkey.aws.iot1click-devices.-2018-05-14.device-description/remaining-life (clojure.spec.alpha/and :portkey.aws.iot1click-devices.-2018-05-14/double-min-0-max-100))
(clojure.spec.alpha/def :portkey.aws.iot1click-devices.-2018-05-14.device-description/type (clojure.spec.alpha/and :portkey.aws.iot1click-devices.-2018-05-14/string))
(clojure.spec.alpha/def :portkey.aws.iot1click-devices.-2018-05-14/device-description (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.iot1click-devices.-2018-05-14.device-description/attributes :portkey.aws.iot1click-devices.-2018-05-14.device-description/device-id :portkey.aws.iot1click-devices.-2018-05-14.device-description/enabled :portkey.aws.iot1click-devices.-2018-05-14.device-description/remaining-life :portkey.aws.iot1click-devices.-2018-05-14.device-description/type]))

(clojure.spec.alpha/def :portkey.aws.iot1click-devices.-2018-05-14.device-claim-response/state (clojure.spec.alpha/and :portkey.aws.iot1click-devices.-2018-05-14/string))
(clojure.spec.alpha/def :portkey.aws.iot1click-devices.-2018-05-14/device-claim-response (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.iot1click-devices.-2018-05-14.device-claim-response/state]))

(clojure.spec.alpha/def :portkey.aws.iot1click-devices.-2018-05-14.device-events-response/events (clojure.spec.alpha/and :portkey.aws.iot1click-devices.-2018-05-14/list-of-device-event))
(clojure.spec.alpha/def :portkey.aws.iot1click-devices.-2018-05-14.device-events-response/next-token (clojure.spec.alpha/and :portkey.aws.iot1click-devices.-2018-05-14/string))
(clojure.spec.alpha/def :portkey.aws.iot1click-devices.-2018-05-14/device-events-response (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.iot1click-devices.-2018-05-14.device-events-response/events :portkey.aws.iot1click-devices.-2018-05-14.device-events-response/next-token]))

(clojure.spec.alpha/def :portkey.aws.iot1click-devices.-2018-05-14.finalize-device-claim-request/device-id (clojure.spec.alpha/and :portkey.aws.iot1click-devices.-2018-05-14/string))
(clojure.spec.alpha/def :portkey.aws.iot1click-devices.-2018-05-14/finalize-device-claim-request (clojure.spec.alpha/keys :req-un [:portkey.aws.iot1click-devices.-2018-05-14.finalize-device-claim-request/device-id] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.iot1click-devices.-2018-05-14.precondition-failed-exception/code (clojure.spec.alpha/and :portkey.aws.iot1click-devices.-2018-05-14/string))
(clojure.spec.alpha/def :portkey.aws.iot1click-devices.-2018-05-14.precondition-failed-exception/message (clojure.spec.alpha/and :portkey.aws.iot1click-devices.-2018-05-14/string))
(clojure.spec.alpha/def :portkey.aws.iot1click-devices.-2018-05-14/precondition-failed-exception (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.iot1click-devices.-2018-05-14.precondition-failed-exception/code :portkey.aws.iot1click-devices.-2018-05-14.precondition-failed-exception/message]))

(clojure.spec.alpha/def :portkey.aws.iot1click-devices.-2018-05-14.invalid-request-exception/code (clojure.spec.alpha/and :portkey.aws.iot1click-devices.-2018-05-14/string))
(clojure.spec.alpha/def :portkey.aws.iot1click-devices.-2018-05-14.invalid-request-exception/message (clojure.spec.alpha/and :portkey.aws.iot1click-devices.-2018-05-14/string))
(clojure.spec.alpha/def :portkey.aws.iot1click-devices.-2018-05-14/invalid-request-exception (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.iot1click-devices.-2018-05-14.invalid-request-exception/code :portkey.aws.iot1click-devices.-2018-05-14.invalid-request-exception/message]))

(clojure.spec.alpha/def :portkey.aws.iot1click-devices.-2018-05-14.list-device-events-request/device-id (clojure.spec.alpha/and :portkey.aws.iot1click-devices.-2018-05-14/string))
(clojure.spec.alpha/def :portkey.aws.iot1click-devices.-2018-05-14.list-device-events-request/from-time-stamp (clojure.spec.alpha/and :portkey.aws.iot1click-devices.-2018-05-14/timestamp-iso-8601))
(clojure.spec.alpha/def :portkey.aws.iot1click-devices.-2018-05-14.list-device-events-request/next-token (clojure.spec.alpha/and :portkey.aws.iot1click-devices.-2018-05-14/string))
(clojure.spec.alpha/def :portkey.aws.iot1click-devices.-2018-05-14.list-device-events-request/to-time-stamp (clojure.spec.alpha/and :portkey.aws.iot1click-devices.-2018-05-14/timestamp-iso-8601))
(clojure.spec.alpha/def :portkey.aws.iot1click-devices.-2018-05-14/list-device-events-request (clojure.spec.alpha/keys :req-un [:portkey.aws.iot1click-devices.-2018-05-14.list-device-events-request/device-id :portkey.aws.iot1click-devices.-2018-05-14.list-device-events-request/from-time-stamp :portkey.aws.iot1click-devices.-2018-05-14.list-device-events-request/to-time-stamp] :opt-un [:portkey.aws.iot1click-devices.-2018-05-14/max-results :portkey.aws.iot1click-devices.-2018-05-14.list-device-events-request/next-token]))

(clojure.spec.alpha/def :portkey.aws.iot1click-devices.-2018-05-14.get-device-methods-response/device-methods (clojure.spec.alpha/and :portkey.aws.iot1click-devices.-2018-05-14/list-of-device-method))
(clojure.spec.alpha/def :portkey.aws.iot1click-devices.-2018-05-14/get-device-methods-response (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.iot1click-devices.-2018-05-14.get-device-methods-response/device-methods]))

(clojure.spec.alpha/def :portkey.aws.iot1click-devices.-2018-05-14.invoke-device-method-request/device-id (clojure.spec.alpha/and :portkey.aws.iot1click-devices.-2018-05-14/string))
(clojure.spec.alpha/def :portkey.aws.iot1click-devices.-2018-05-14.invoke-device-method-request/device-method-parameters (clojure.spec.alpha/and :portkey.aws.iot1click-devices.-2018-05-14/string))
(clojure.spec.alpha/def :portkey.aws.iot1click-devices.-2018-05-14/invoke-device-method-request (clojure.spec.alpha/keys :req-un [:portkey.aws.iot1click-devices.-2018-05-14.invoke-device-method-request/device-id] :opt-un [:portkey.aws.iot1click-devices.-2018-05-14/device-method :portkey.aws.iot1click-devices.-2018-05-14.invoke-device-method-request/device-method-parameters]))

(clojure.spec.alpha/def :portkey.aws.iot1click-devices.-2018-05-14.forbidden-exception/code (clojure.spec.alpha/and :portkey.aws.iot1click-devices.-2018-05-14/string))
(clojure.spec.alpha/def :portkey.aws.iot1click-devices.-2018-05-14.forbidden-exception/message (clojure.spec.alpha/and :portkey.aws.iot1click-devices.-2018-05-14/string))
(clojure.spec.alpha/def :portkey.aws.iot1click-devices.-2018-05-14/forbidden-exception (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.iot1click-devices.-2018-05-14.forbidden-exception/code :portkey.aws.iot1click-devices.-2018-05-14.forbidden-exception/message]))

(clojure.spec.alpha/def :portkey.aws.iot1click-devices.-2018-05-14.initiate-device-claim-request/device-id (clojure.spec.alpha/and :portkey.aws.iot1click-devices.-2018-05-14/string))
(clojure.spec.alpha/def :portkey.aws.iot1click-devices.-2018-05-14/initiate-device-claim-request (clojure.spec.alpha/keys :req-un [:portkey.aws.iot1click-devices.-2018-05-14.initiate-device-claim-request/device-id] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.iot1click-devices.-2018-05-14.initiate-device-claim-response/state (clojure.spec.alpha/and :portkey.aws.iot1click-devices.-2018-05-14/string))
(clojure.spec.alpha/def :portkey.aws.iot1click-devices.-2018-05-14/initiate-device-claim-response (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.iot1click-devices.-2018-05-14.initiate-device-claim-response/state]))

(clojure.spec.alpha/def :portkey.aws.iot1click-devices.-2018-05-14/string (clojure.spec.alpha/and clojure.core/string?))

(clojure.spec.alpha/def :portkey.aws.iot1click-devices.-2018-05-14.describe-device-request/device-id (clojure.spec.alpha/and :portkey.aws.iot1click-devices.-2018-05-14/string))
(clojure.spec.alpha/def :portkey.aws.iot1click-devices.-2018-05-14/describe-device-request (clojure.spec.alpha/keys :req-un [:portkey.aws.iot1click-devices.-2018-05-14.describe-device-request/device-id] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.iot1click-devices.-2018-05-14/long clojure.core/int?)

(clojure.spec.alpha/def :portkey.aws.iot1click-devices.-2018-05-14/list-of-device-description (clojure.spec.alpha/coll-of :portkey.aws.iot1click-devices.-2018-05-14/device-description))

(clojure.spec.alpha/def :portkey.aws.iot1click-devices.-2018-05-14.device-method/device-type (clojure.spec.alpha/and :portkey.aws.iot1click-devices.-2018-05-14/string))
(clojure.spec.alpha/def :portkey.aws.iot1click-devices.-2018-05-14.device-method/method-name (clojure.spec.alpha/and :portkey.aws.iot1click-devices.-2018-05-14/string))
(clojure.spec.alpha/def :portkey.aws.iot1click-devices.-2018-05-14/device-method (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.iot1click-devices.-2018-05-14.device-method/device-type :portkey.aws.iot1click-devices.-2018-05-14.device-method/method-name]))

(clojure.spec.alpha/def :portkey.aws.iot1click-devices.-2018-05-14.device-event/std-event (clojure.spec.alpha/and :portkey.aws.iot1click-devices.-2018-05-14/string))
(clojure.spec.alpha/def :portkey.aws.iot1click-devices.-2018-05-14/device-event (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.iot1click-devices.-2018-05-14/device :portkey.aws.iot1click-devices.-2018-05-14.device-event/std-event]))

(clojure.spec.alpha/def :portkey.aws.iot1click-devices.-2018-05-14/attributes (clojure.spec.alpha/keys :req-un [] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.iot1click-devices.-2018-05-14/update-device-state-response (clojure.spec.alpha/keys :req-un [] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.iot1click-devices.-2018-05-14.internal-failure-exception/code (clojure.spec.alpha/and :portkey.aws.iot1click-devices.-2018-05-14/string))
(clojure.spec.alpha/def :portkey.aws.iot1click-devices.-2018-05-14.internal-failure-exception/message (clojure.spec.alpha/and :portkey.aws.iot1click-devices.-2018-05-14/string))
(clojure.spec.alpha/def :portkey.aws.iot1click-devices.-2018-05-14/internal-failure-exception (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.iot1click-devices.-2018-05-14.internal-failure-exception/code :portkey.aws.iot1click-devices.-2018-05-14.internal-failure-exception/message]))

(clojure.spec.alpha/def :portkey.aws.iot1click-devices.-2018-05-14/double-min-0-max-100 clojure.core/double?)

(clojure.spec.alpha/def :portkey.aws.iot1click-devices.-2018-05-14/describe-device-response (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.iot1click-devices.-2018-05-14/device-description]))

(clojure.spec.alpha/def :portkey.aws.iot1click-devices.-2018-05-14.resource-not-found-exception/code (clojure.spec.alpha/and :portkey.aws.iot1click-devices.-2018-05-14/string))
(clojure.spec.alpha/def :portkey.aws.iot1click-devices.-2018-05-14.resource-not-found-exception/message (clojure.spec.alpha/and :portkey.aws.iot1click-devices.-2018-05-14/string))
(clojure.spec.alpha/def :portkey.aws.iot1click-devices.-2018-05-14/resource-not-found-exception (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.iot1click-devices.-2018-05-14.resource-not-found-exception/code :portkey.aws.iot1click-devices.-2018-05-14.resource-not-found-exception/message]))

(clojure.spec.alpha/def :portkey.aws.iot1click-devices.-2018-05-14/boolean clojure.core/boolean?)

(clojure.spec.alpha/def :portkey.aws.iot1click-devices.-2018-05-14.update-device-state-request/device-id (clojure.spec.alpha/and :portkey.aws.iot1click-devices.-2018-05-14/string))
(clojure.spec.alpha/def :portkey.aws.iot1click-devices.-2018-05-14.update-device-state-request/enabled (clojure.spec.alpha/and :portkey.aws.iot1click-devices.-2018-05-14/boolean))
(clojure.spec.alpha/def :portkey.aws.iot1click-devices.-2018-05-14/update-device-state-request (clojure.spec.alpha/keys :req-un [:portkey.aws.iot1click-devices.-2018-05-14.update-device-state-request/device-id] :opt-un [:portkey.aws.iot1click-devices.-2018-05-14.update-device-state-request/enabled]))

(clojure.spec.alpha/def :portkey.aws.iot1click-devices.-2018-05-14/list-of-device-event (clojure.spec.alpha/coll-of :portkey.aws.iot1click-devices.-2018-05-14/device-event))

(clojure.spec.alpha/def :portkey.aws.iot1click-devices.-2018-05-14.claim-devices-by-claim-code-response/claim-code (clojure.spec.alpha/and :portkey.aws.iot1click-devices.-2018-05-14/string-min-12-max-40))
(clojure.spec.alpha/def :portkey.aws.iot1click-devices.-2018-05-14.claim-devices-by-claim-code-response/total (clojure.spec.alpha/and :portkey.aws.iot1click-devices.-2018-05-14/integer))
(clojure.spec.alpha/def :portkey.aws.iot1click-devices.-2018-05-14/claim-devices-by-claim-code-response (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.iot1click-devices.-2018-05-14.claim-devices-by-claim-code-response/claim-code :portkey.aws.iot1click-devices.-2018-05-14.claim-devices-by-claim-code-response/total]))

(clojure.spec.alpha/def :portkey.aws.iot1click-devices.-2018-05-14.claim-devices-by-claim-code-request/claim-code (clojure.spec.alpha/and :portkey.aws.iot1click-devices.-2018-05-14/string))
(clojure.spec.alpha/def :portkey.aws.iot1click-devices.-2018-05-14/claim-devices-by-claim-code-request (clojure.spec.alpha/keys :req-un [:portkey.aws.iot1click-devices.-2018-05-14.claim-devices-by-claim-code-request/claim-code] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.iot1click-devices.-2018-05-14.resource-conflict-exception/code (clojure.spec.alpha/and :portkey.aws.iot1click-devices.-2018-05-14/string))
(clojure.spec.alpha/def :portkey.aws.iot1click-devices.-2018-05-14.resource-conflict-exception/message (clojure.spec.alpha/and :portkey.aws.iot1click-devices.-2018-05-14/string))
(clojure.spec.alpha/def :portkey.aws.iot1click-devices.-2018-05-14/resource-conflict-exception (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.iot1click-devices.-2018-05-14.resource-conflict-exception/code :portkey.aws.iot1click-devices.-2018-05-14.resource-conflict-exception/message]))

(clojure.spec.alpha/def :portkey.aws.iot1click-devices.-2018-05-14.list-device-events-response/events (clojure.spec.alpha/and :portkey.aws.iot1click-devices.-2018-05-14/list-of-device-event))
(clojure.spec.alpha/def :portkey.aws.iot1click-devices.-2018-05-14.list-device-events-response/next-token (clojure.spec.alpha/and :portkey.aws.iot1click-devices.-2018-05-14/string))
(clojure.spec.alpha/def :portkey.aws.iot1click-devices.-2018-05-14/list-device-events-response (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.iot1click-devices.-2018-05-14.list-device-events-response/events :portkey.aws.iot1click-devices.-2018-05-14.list-device-events-response/next-token]))

(clojure.spec.alpha/def :portkey.aws.iot1click-devices.-2018-05-14.range-not-satisfiable-exception/code (clojure.spec.alpha/and :portkey.aws.iot1click-devices.-2018-05-14/string))
(clojure.spec.alpha/def :portkey.aws.iot1click-devices.-2018-05-14.range-not-satisfiable-exception/message (clojure.spec.alpha/and :portkey.aws.iot1click-devices.-2018-05-14/string))
(clojure.spec.alpha/def :portkey.aws.iot1click-devices.-2018-05-14/range-not-satisfiable-exception (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.iot1click-devices.-2018-05-14.range-not-satisfiable-exception/code :portkey.aws.iot1click-devices.-2018-05-14.range-not-satisfiable-exception/message]))

(clojure.spec.alpha/def :portkey.aws.iot1click-devices.-2018-05-14/timestamp-iso-8601 clojure.core/inst?)

(clojure.spec.alpha/def :portkey.aws.iot1click-devices.-2018-05-14/double clojure.core/double?)

(clojure.spec.alpha/def :portkey.aws.iot1click-devices.-2018-05-14.unclaim-device-response/state (clojure.spec.alpha/and :portkey.aws.iot1click-devices.-2018-05-14/string))
(clojure.spec.alpha/def :portkey.aws.iot1click-devices.-2018-05-14/unclaim-device-response (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.iot1click-devices.-2018-05-14.unclaim-device-response/state]))

(clojure.spec.alpha/def :portkey.aws.iot1click-devices.-2018-05-14/list-of-device-method (clojure.spec.alpha/coll-of :portkey.aws.iot1click-devices.-2018-05-14/device-method))

(clojure.spec.alpha/def :portkey.aws.iot1click-devices.-2018-05-14/max-results (clojure.spec.alpha/int-in 1 250))

(clojure.spec.alpha/def :portkey.aws.iot1click-devices.-2018-05-14.finalize-device-claim-response/state (clojure.spec.alpha/and :portkey.aws.iot1click-devices.-2018-05-14/string))
(clojure.spec.alpha/def :portkey.aws.iot1click-devices.-2018-05-14/finalize-device-claim-response (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.iot1click-devices.-2018-05-14.finalize-device-claim-response/state]))

(clojure.spec.alpha/def :portkey.aws.iot1click-devices.-2018-05-14.list-devices-request/device-type (clojure.spec.alpha/and :portkey.aws.iot1click-devices.-2018-05-14/string))
(clojure.spec.alpha/def :portkey.aws.iot1click-devices.-2018-05-14.list-devices-request/next-token (clojure.spec.alpha/and :portkey.aws.iot1click-devices.-2018-05-14/string))
(clojure.spec.alpha/def :portkey.aws.iot1click-devices.-2018-05-14/list-devices-request (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.iot1click-devices.-2018-05-14.list-devices-request/device-type :portkey.aws.iot1click-devices.-2018-05-14/max-results :portkey.aws.iot1click-devices.-2018-05-14.list-devices-request/next-token]))

(clojure.spec.alpha/def :portkey.aws.iot1click-devices.-2018-05-14/integer clojure.core/int?)

(clojure.spec.alpha/def :portkey.aws.iot1click-devices.-2018-05-14/string-min-12-max-40 (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__1012852__auto__] (clojure.core/<= 12 (clojure.core/count s__1012852__auto__))) (clojure.core/fn [s__1012853__auto__] (clojure.core/< (clojure.core/count s__1012853__auto__) 40))))

(clojure.spec.alpha/def :portkey.aws.iot1click-devices.-2018-05-14/timestamp-unix clojure.core/inst?)

(clojure.spec.alpha/def :portkey.aws.iot1click-devices.-2018-05-14.get-device-methods-request/device-id (clojure.spec.alpha/and :portkey.aws.iot1click-devices.-2018-05-14/string))
(clojure.spec.alpha/def :portkey.aws.iot1click-devices.-2018-05-14/get-device-methods-request (clojure.spec.alpha/keys :req-un [:portkey.aws.iot1click-devices.-2018-05-14.get-device-methods-request/device-id] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.iot1click-devices.-2018-05-14.device/device-id (clojure.spec.alpha/and :portkey.aws.iot1click-devices.-2018-05-14/string))
(clojure.spec.alpha/def :portkey.aws.iot1click-devices.-2018-05-14.device/type (clojure.spec.alpha/and :portkey.aws.iot1click-devices.-2018-05-14/string))
(clojure.spec.alpha/def :portkey.aws.iot1click-devices.-2018-05-14/device (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.iot1click-devices.-2018-05-14/attributes :portkey.aws.iot1click-devices.-2018-05-14.device/device-id :portkey.aws.iot1click-devices.-2018-05-14.device/type]))

(clojure.spec.alpha/def :portkey.aws.iot1click-devices.-2018-05-14/device-attributes (clojure.spec.alpha/map-of :portkey.aws.iot1click-devices.-2018-05-14/string :portkey.aws.iot1click-devices.-2018-05-14/string))

(clojure.spec.alpha/def :portkey.aws.iot1click-devices.-2018-05-14.list-devices-response/devices (clojure.spec.alpha/and :portkey.aws.iot1click-devices.-2018-05-14/list-of-device-description))
(clojure.spec.alpha/def :portkey.aws.iot1click-devices.-2018-05-14.list-devices-response/next-token (clojure.spec.alpha/and :portkey.aws.iot1click-devices.-2018-05-14/string))
(clojure.spec.alpha/def :portkey.aws.iot1click-devices.-2018-05-14/list-devices-response (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.iot1click-devices.-2018-05-14.list-devices-response/devices :portkey.aws.iot1click-devices.-2018-05-14.list-devices-response/next-token]))

(clojure.spec.alpha/def :portkey.aws.iot1click-devices.-2018-05-14.unclaim-device-request/device-id (clojure.spec.alpha/and :portkey.aws.iot1click-devices.-2018-05-14/string))
(clojure.spec.alpha/def :portkey.aws.iot1click-devices.-2018-05-14/unclaim-device-request (clojure.spec.alpha/keys :req-un [:portkey.aws.iot1click-devices.-2018-05-14.unclaim-device-request/device-id] :opt-un []))

(clojure.core/defn list-device-events ([list-device-events-requestinput] (clojure.core/let [request-function-result__1013884__auto__ (req-list-device-events-request list-device-events-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__1013884__auto__ {:http.request.configuration/endpoints portkey.aws.iot1click-devices.-2018-05-14/endpoints, :http.request.configuration/target-prefix nil, :http.request.spec/output-spec :portkey.aws.iot1click-devices.-2018-05-14/list-device-events-response, :http.request.configuration/mime-type {"content-type" "application/json"}, :http.request.configuration/request-uri "/devices/{deviceId}/events", :http.request.configuration/version "2018-05-14", :http.request.configuration/service-id "IoT 1Click Devices Service", :http.request.spec/input-spec :portkey.aws.iot1click-devices.-2018-05-14/list-device-events-request, :http.request.configuration/protocol "rest-json", :http.request.configuration/method :get, :http.request.configuration/response-code 200, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "ListDeviceEvents", :http.request.configuration/output-deser-fn response-list-device-events-response, :http.request.spec/error-spec {"ResourceNotFoundException" :portkey.aws.iot1click-devices.-2018-05-14/resource-not-found-exception, "RangeNotSatisfiableException" :portkey.aws.iot1click-devices.-2018-05-14/range-not-satisfiable-exception, "InvalidRequestException" :portkey.aws.iot1click-devices.-2018-05-14/invalid-request-exception, "InternalFailureException" :portkey.aws.iot1click-devices.-2018-05-14/internal-failure-exception}})))))
(clojure.spec.alpha/fdef list-device-events :args (clojure.spec.alpha/tuple :portkey.aws.iot1click-devices.-2018-05-14/list-device-events-request) :ret (clojure.spec.alpha/and :portkey.aws.iot1click-devices.-2018-05-14/list-device-events-response))

(clojure.core/defn claim-devices-by-claim-code ([claim-devices-by-claim-code-requestinput] (clojure.core/let [request-function-result__1013884__auto__ (req-claim-devices-by-claim-code-request claim-devices-by-claim-code-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__1013884__auto__ {:http.request.configuration/endpoints portkey.aws.iot1click-devices.-2018-05-14/endpoints, :http.request.configuration/target-prefix nil, :http.request.spec/output-spec :portkey.aws.iot1click-devices.-2018-05-14/claim-devices-by-claim-code-response, :http.request.configuration/mime-type {"content-type" "application/json"}, :http.request.configuration/request-uri "/claims/{claimCode}", :http.request.configuration/version "2018-05-14", :http.request.configuration/service-id "IoT 1Click Devices Service", :http.request.spec/input-spec :portkey.aws.iot1click-devices.-2018-05-14/claim-devices-by-claim-code-request, :http.request.configuration/protocol "rest-json", :http.request.configuration/method :put, :http.request.configuration/response-code 200, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "ClaimDevicesByClaimCode", :http.request.configuration/output-deser-fn response-claim-devices-by-claim-code-response, :http.request.spec/error-spec {"InvalidRequestException" :portkey.aws.iot1click-devices.-2018-05-14/invalid-request-exception, "InternalFailureException" :portkey.aws.iot1click-devices.-2018-05-14/internal-failure-exception, "ForbiddenException" :portkey.aws.iot1click-devices.-2018-05-14/forbidden-exception}})))))
(clojure.spec.alpha/fdef claim-devices-by-claim-code :args (clojure.spec.alpha/tuple :portkey.aws.iot1click-devices.-2018-05-14/claim-devices-by-claim-code-request) :ret (clojure.spec.alpha/and :portkey.aws.iot1click-devices.-2018-05-14/claim-devices-by-claim-code-response))

(clojure.core/defn unclaim-device ([unclaim-device-requestinput] (clojure.core/let [request-function-result__1013884__auto__ (req-unclaim-device-request unclaim-device-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__1013884__auto__ {:http.request.configuration/endpoints portkey.aws.iot1click-devices.-2018-05-14/endpoints, :http.request.configuration/target-prefix nil, :http.request.spec/output-spec :portkey.aws.iot1click-devices.-2018-05-14/unclaim-device-response, :http.request.configuration/mime-type {"content-type" "application/json"}, :http.request.configuration/request-uri "/devices/{deviceId}/unclaim", :http.request.configuration/version "2018-05-14", :http.request.configuration/service-id "IoT 1Click Devices Service", :http.request.spec/input-spec :portkey.aws.iot1click-devices.-2018-05-14/unclaim-device-request, :http.request.configuration/protocol "rest-json", :http.request.configuration/method :put, :http.request.configuration/response-code 200, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "UnclaimDevice", :http.request.configuration/output-deser-fn response-unclaim-device-response, :http.request.spec/error-spec {"ResourceNotFoundException" :portkey.aws.iot1click-devices.-2018-05-14/resource-not-found-exception, "InvalidRequestException" :portkey.aws.iot1click-devices.-2018-05-14/invalid-request-exception, "InternalFailureException" :portkey.aws.iot1click-devices.-2018-05-14/internal-failure-exception}})))))
(clojure.spec.alpha/fdef unclaim-device :args (clojure.spec.alpha/tuple :portkey.aws.iot1click-devices.-2018-05-14/unclaim-device-request) :ret (clojure.spec.alpha/and :portkey.aws.iot1click-devices.-2018-05-14/unclaim-device-response))

(clojure.core/defn invoke-device-method ([invoke-device-method-requestinput] (clojure.core/let [request-function-result__1013884__auto__ (req-invoke-device-method-request invoke-device-method-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__1013884__auto__ {:http.request.configuration/endpoints portkey.aws.iot1click-devices.-2018-05-14/endpoints, :http.request.configuration/target-prefix nil, :http.request.spec/output-spec :portkey.aws.iot1click-devices.-2018-05-14/invoke-device-method-response, :http.request.configuration/mime-type {"content-type" "application/json"}, :http.request.configuration/request-uri "/devices/{deviceId}/methods", :http.request.configuration/version "2018-05-14", :http.request.configuration/service-id "IoT 1Click Devices Service", :http.request.spec/input-spec :portkey.aws.iot1click-devices.-2018-05-14/invoke-device-method-request, :http.request.configuration/protocol "rest-json", :http.request.configuration/method :post, :http.request.configuration/response-code 200, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "InvokeDeviceMethod", :http.request.configuration/output-deser-fn response-invoke-device-method-response, :http.request.spec/error-spec {"InvalidRequestException" :portkey.aws.iot1click-devices.-2018-05-14/invalid-request-exception, "PreconditionFailedException" :portkey.aws.iot1click-devices.-2018-05-14/precondition-failed-exception, "InternalFailureException" :portkey.aws.iot1click-devices.-2018-05-14/internal-failure-exception, "ResourceNotFoundException" :portkey.aws.iot1click-devices.-2018-05-14/resource-not-found-exception, "RangeNotSatisfiableException" :portkey.aws.iot1click-devices.-2018-05-14/range-not-satisfiable-exception, "ResourceConflictException" :portkey.aws.iot1click-devices.-2018-05-14/resource-conflict-exception}})))))
(clojure.spec.alpha/fdef invoke-device-method :args (clojure.spec.alpha/tuple :portkey.aws.iot1click-devices.-2018-05-14/invoke-device-method-request) :ret (clojure.spec.alpha/and :portkey.aws.iot1click-devices.-2018-05-14/invoke-device-method-response))

(clojure.core/defn get-device-methods ([get-device-methods-requestinput] (clojure.core/let [request-function-result__1013884__auto__ (req-get-device-methods-request get-device-methods-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__1013884__auto__ {:http.request.configuration/endpoints portkey.aws.iot1click-devices.-2018-05-14/endpoints, :http.request.configuration/target-prefix nil, :http.request.spec/output-spec :portkey.aws.iot1click-devices.-2018-05-14/get-device-methods-response, :http.request.configuration/mime-type {"content-type" "application/json"}, :http.request.configuration/request-uri "/devices/{deviceId}/methods", :http.request.configuration/version "2018-05-14", :http.request.configuration/service-id "IoT 1Click Devices Service", :http.request.spec/input-spec :portkey.aws.iot1click-devices.-2018-05-14/get-device-methods-request, :http.request.configuration/protocol "rest-json", :http.request.configuration/method :get, :http.request.configuration/response-code 200, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "GetDeviceMethods", :http.request.configuration/output-deser-fn response-get-device-methods-response, :http.request.spec/error-spec {"ResourceNotFoundException" :portkey.aws.iot1click-devices.-2018-05-14/resource-not-found-exception, "InvalidRequestException" :portkey.aws.iot1click-devices.-2018-05-14/invalid-request-exception, "InternalFailureException" :portkey.aws.iot1click-devices.-2018-05-14/internal-failure-exception}})))))
(clojure.spec.alpha/fdef get-device-methods :args (clojure.spec.alpha/tuple :portkey.aws.iot1click-devices.-2018-05-14/get-device-methods-request) :ret (clojure.spec.alpha/and :portkey.aws.iot1click-devices.-2018-05-14/get-device-methods-response))

(clojure.core/defn finalize-device-claim ([finalize-device-claim-requestinput] (clojure.core/let [request-function-result__1013884__auto__ (req-finalize-device-claim-request finalize-device-claim-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__1013884__auto__ {:http.request.configuration/endpoints portkey.aws.iot1click-devices.-2018-05-14/endpoints, :http.request.configuration/target-prefix nil, :http.request.spec/output-spec :portkey.aws.iot1click-devices.-2018-05-14/finalize-device-claim-response, :http.request.configuration/mime-type {"content-type" "application/json"}, :http.request.configuration/request-uri "/devices/{deviceId}/finalize-claim", :http.request.configuration/version "2018-05-14", :http.request.configuration/service-id "IoT 1Click Devices Service", :http.request.spec/input-spec :portkey.aws.iot1click-devices.-2018-05-14/finalize-device-claim-request, :http.request.configuration/protocol "rest-json", :http.request.configuration/method :put, :http.request.configuration/response-code 200, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "FinalizeDeviceClaim", :http.request.configuration/output-deser-fn response-finalize-device-claim-response, :http.request.spec/error-spec {"ResourceNotFoundException" :portkey.aws.iot1click-devices.-2018-05-14/resource-not-found-exception, "InvalidRequestException" :portkey.aws.iot1click-devices.-2018-05-14/invalid-request-exception, "InternalFailureException" :portkey.aws.iot1click-devices.-2018-05-14/internal-failure-exception, "PreconditionFailedException" :portkey.aws.iot1click-devices.-2018-05-14/precondition-failed-exception, "ResourceConflictException" :portkey.aws.iot1click-devices.-2018-05-14/resource-conflict-exception}})))))
(clojure.spec.alpha/fdef finalize-device-claim :args (clojure.spec.alpha/tuple :portkey.aws.iot1click-devices.-2018-05-14/finalize-device-claim-request) :ret (clojure.spec.alpha/and :portkey.aws.iot1click-devices.-2018-05-14/finalize-device-claim-response))

(clojure.core/defn list-devices ([] (list-devices {})) ([list-devices-requestinput] (clojure.core/let [request-function-result__1013884__auto__ (req-list-devices-request list-devices-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__1013884__auto__ {:http.request.configuration/endpoints portkey.aws.iot1click-devices.-2018-05-14/endpoints, :http.request.configuration/target-prefix nil, :http.request.spec/output-spec :portkey.aws.iot1click-devices.-2018-05-14/list-devices-response, :http.request.configuration/mime-type {"content-type" "application/json"}, :http.request.configuration/request-uri "/devices", :http.request.configuration/version "2018-05-14", :http.request.configuration/service-id "IoT 1Click Devices Service", :http.request.spec/input-spec :portkey.aws.iot1click-devices.-2018-05-14/list-devices-request, :http.request.configuration/protocol "rest-json", :http.request.configuration/method :get, :http.request.configuration/response-code 200, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "ListDevices", :http.request.configuration/output-deser-fn response-list-devices-response, :http.request.spec/error-spec {"RangeNotSatisfiableException" :portkey.aws.iot1click-devices.-2018-05-14/range-not-satisfiable-exception, "InvalidRequestException" :portkey.aws.iot1click-devices.-2018-05-14/invalid-request-exception, "InternalFailureException" :portkey.aws.iot1click-devices.-2018-05-14/internal-failure-exception}})))))
(clojure.spec.alpha/fdef list-devices :args (clojure.spec.alpha/? :portkey.aws.iot1click-devices.-2018-05-14/list-devices-request) :ret (clojure.spec.alpha/and :portkey.aws.iot1click-devices.-2018-05-14/list-devices-response))

(clojure.core/defn update-device-state ([update-device-state-requestinput] (clojure.core/let [request-function-result__1013884__auto__ (req-update-device-state-request update-device-state-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__1013884__auto__ {:http.request.configuration/endpoints portkey.aws.iot1click-devices.-2018-05-14/endpoints, :http.request.configuration/target-prefix nil, :http.request.spec/output-spec :portkey.aws.iot1click-devices.-2018-05-14/update-device-state-response, :http.request.configuration/mime-type {"content-type" "application/json"}, :http.request.configuration/request-uri "/devices/{deviceId}/state", :http.request.configuration/version "2018-05-14", :http.request.configuration/service-id "IoT 1Click Devices Service", :http.request.spec/input-spec :portkey.aws.iot1click-devices.-2018-05-14/update-device-state-request, :http.request.configuration/protocol "rest-json", :http.request.configuration/method :put, :http.request.configuration/response-code 200, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "UpdateDeviceState", :http.request.configuration/output-deser-fn response-update-device-state-response, :http.request.spec/error-spec {"ResourceNotFoundException" :portkey.aws.iot1click-devices.-2018-05-14/resource-not-found-exception, "InvalidRequestException" :portkey.aws.iot1click-devices.-2018-05-14/invalid-request-exception, "InternalFailureException" :portkey.aws.iot1click-devices.-2018-05-14/internal-failure-exception}})))))
(clojure.spec.alpha/fdef update-device-state :args (clojure.spec.alpha/tuple :portkey.aws.iot1click-devices.-2018-05-14/update-device-state-request) :ret (clojure.spec.alpha/and :portkey.aws.iot1click-devices.-2018-05-14/update-device-state-response))

(clojure.core/defn initiate-device-claim ([initiate-device-claim-requestinput] (clojure.core/let [request-function-result__1013884__auto__ (req-initiate-device-claim-request initiate-device-claim-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__1013884__auto__ {:http.request.configuration/endpoints portkey.aws.iot1click-devices.-2018-05-14/endpoints, :http.request.configuration/target-prefix nil, :http.request.spec/output-spec :portkey.aws.iot1click-devices.-2018-05-14/initiate-device-claim-response, :http.request.configuration/mime-type {"content-type" "application/json"}, :http.request.configuration/request-uri "/devices/{deviceId}/initiate-claim", :http.request.configuration/version "2018-05-14", :http.request.configuration/service-id "IoT 1Click Devices Service", :http.request.spec/input-spec :portkey.aws.iot1click-devices.-2018-05-14/initiate-device-claim-request, :http.request.configuration/protocol "rest-json", :http.request.configuration/method :put, :http.request.configuration/response-code 200, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "InitiateDeviceClaim", :http.request.configuration/output-deser-fn response-initiate-device-claim-response, :http.request.spec/error-spec {"ResourceNotFoundException" :portkey.aws.iot1click-devices.-2018-05-14/resource-not-found-exception, "InvalidRequestException" :portkey.aws.iot1click-devices.-2018-05-14/invalid-request-exception, "InternalFailureException" :portkey.aws.iot1click-devices.-2018-05-14/internal-failure-exception, "ResourceConflictException" :portkey.aws.iot1click-devices.-2018-05-14/resource-conflict-exception}})))))
(clojure.spec.alpha/fdef initiate-device-claim :args (clojure.spec.alpha/tuple :portkey.aws.iot1click-devices.-2018-05-14/initiate-device-claim-request) :ret (clojure.spec.alpha/and :portkey.aws.iot1click-devices.-2018-05-14/initiate-device-claim-response))

(clojure.core/defn describe-device ([describe-device-requestinput] (clojure.core/let [request-function-result__1013884__auto__ (req-describe-device-request describe-device-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__1013884__auto__ {:http.request.configuration/endpoints portkey.aws.iot1click-devices.-2018-05-14/endpoints, :http.request.configuration/target-prefix nil, :http.request.spec/output-spec :portkey.aws.iot1click-devices.-2018-05-14/describe-device-response, :http.request.configuration/mime-type {"content-type" "application/json"}, :http.request.configuration/request-uri "/devices/{deviceId}", :http.request.configuration/version "2018-05-14", :http.request.configuration/service-id "IoT 1Click Devices Service", :http.request.spec/input-spec :portkey.aws.iot1click-devices.-2018-05-14/describe-device-request, :http.request.configuration/protocol "rest-json", :http.request.configuration/method :get, :http.request.configuration/response-code 200, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "DescribeDevice", :http.request.configuration/output-deser-fn response-describe-device-response, :http.request.spec/error-spec {"ResourceNotFoundException" :portkey.aws.iot1click-devices.-2018-05-14/resource-not-found-exception, "InvalidRequestException" :portkey.aws.iot1click-devices.-2018-05-14/invalid-request-exception, "InternalFailureException" :portkey.aws.iot1click-devices.-2018-05-14/internal-failure-exception}})))))
(clojure.spec.alpha/fdef describe-device :args (clojure.spec.alpha/tuple :portkey.aws.iot1click-devices.-2018-05-14/describe-device-request) :ret (clojure.spec.alpha/and :portkey.aws.iot1click-devices.-2018-05-14/describe-device-response))
