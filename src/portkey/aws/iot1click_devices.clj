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

(clojure.spec.alpha/def :portkey.aws.iot1click-devices/string-min-12-max-40 (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__42947__auto__] (clojure.core/<= 12 (clojure.core/count s__42947__auto__))) (clojure.core/fn [s__42948__auto__] (clojure.core/< (clojure.core/count s__42948__auto__) 40))))

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

(clojure.core/defn list-device-events ([list-device-events-requestinput] (clojure.core/let [request-function-result__43533__auto__ (req-list-device-events-request list-device-events-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__43533__auto__ {:http.request.configuration/endpoints portkey.aws.iot1click-devices/endpoints, :http.request.spec/output-spec :portkey.aws.iot1click-devices/list-device-events-response, :http.request.configuration/mime-type {"content-type" "application/json"}, :http.request.configuration/request-uri "/devices/{deviceId}/events", :http.request.configuration/version "2018-05-14", :http.request.configuration/service-id "IoT 1Click Devices Service", :http.request.spec/input-spec :portkey.aws.iot1click-devices/list-device-events-request, :http.request.configuration/protocol "rest-json", :http.request.configuration/method :get, :http.request.configuration/response-code 200, :http.request.configuration/action "ListDeviceEvents", :http.request.spec/error-spec {"ResourceNotFoundException" :portkey.aws.iot1click-devices/resource-not-found-exception, "RangeNotSatisfiableException" :portkey.aws.iot1click-devices/range-not-satisfiable-exception, "InvalidRequestException" :portkey.aws.iot1click-devices/invalid-request-exception, "InternalFailureException" :portkey.aws.iot1click-devices/internal-failure-exception}})))))
(clojure.spec.alpha/fdef list-device-events :args (clojure.spec.alpha/tuple :portkey.aws.iot1click-devices/list-device-events-request) :ret (clojure.spec.alpha/and :portkey.aws.iot1click-devices/list-device-events-response))

(clojure.core/defn claim-devices-by-claim-code ([claim-devices-by-claim-code-requestinput] (clojure.core/let [request-function-result__43533__auto__ (req-claim-devices-by-claim-code-request claim-devices-by-claim-code-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__43533__auto__ {:http.request.configuration/endpoints portkey.aws.iot1click-devices/endpoints, :http.request.spec/output-spec :portkey.aws.iot1click-devices/claim-devices-by-claim-code-response, :http.request.configuration/mime-type {"content-type" "application/json"}, :http.request.configuration/request-uri "/claims/{claimCode}", :http.request.configuration/version "2018-05-14", :http.request.configuration/service-id "IoT 1Click Devices Service", :http.request.spec/input-spec :portkey.aws.iot1click-devices/claim-devices-by-claim-code-request, :http.request.configuration/protocol "rest-json", :http.request.configuration/method :put, :http.request.configuration/response-code 200, :http.request.configuration/action "ClaimDevicesByClaimCode", :http.request.spec/error-spec {"InvalidRequestException" :portkey.aws.iot1click-devices/invalid-request-exception, "InternalFailureException" :portkey.aws.iot1click-devices/internal-failure-exception, "ForbiddenException" :portkey.aws.iot1click-devices/forbidden-exception}})))))
(clojure.spec.alpha/fdef claim-devices-by-claim-code :args (clojure.spec.alpha/tuple :portkey.aws.iot1click-devices/claim-devices-by-claim-code-request) :ret (clojure.spec.alpha/and :portkey.aws.iot1click-devices/claim-devices-by-claim-code-response))

(clojure.core/defn unclaim-device ([unclaim-device-requestinput] (clojure.core/let [request-function-result__43533__auto__ (req-unclaim-device-request unclaim-device-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__43533__auto__ {:http.request.configuration/endpoints portkey.aws.iot1click-devices/endpoints, :http.request.spec/output-spec :portkey.aws.iot1click-devices/unclaim-device-response, :http.request.configuration/mime-type {"content-type" "application/json"}, :http.request.configuration/request-uri "/devices/{deviceId}/unclaim", :http.request.configuration/version "2018-05-14", :http.request.configuration/service-id "IoT 1Click Devices Service", :http.request.spec/input-spec :portkey.aws.iot1click-devices/unclaim-device-request, :http.request.configuration/protocol "rest-json", :http.request.configuration/method :put, :http.request.configuration/response-code 200, :http.request.configuration/action "UnclaimDevice", :http.request.spec/error-spec {"ResourceNotFoundException" :portkey.aws.iot1click-devices/resource-not-found-exception, "InvalidRequestException" :portkey.aws.iot1click-devices/invalid-request-exception, "InternalFailureException" :portkey.aws.iot1click-devices/internal-failure-exception}})))))
(clojure.spec.alpha/fdef unclaim-device :args (clojure.spec.alpha/tuple :portkey.aws.iot1click-devices/unclaim-device-request) :ret (clojure.spec.alpha/and :portkey.aws.iot1click-devices/unclaim-device-response))

(clojure.core/defn invoke-device-method ([invoke-device-method-requestinput] (clojure.core/let [request-function-result__43533__auto__ (req-invoke-device-method-request invoke-device-method-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__43533__auto__ {:http.request.configuration/endpoints portkey.aws.iot1click-devices/endpoints, :http.request.spec/output-spec :portkey.aws.iot1click-devices/invoke-device-method-response, :http.request.configuration/mime-type {"content-type" "application/json"}, :http.request.configuration/request-uri "/devices/{deviceId}/methods", :http.request.configuration/version "2018-05-14", :http.request.configuration/service-id "IoT 1Click Devices Service", :http.request.spec/input-spec :portkey.aws.iot1click-devices/invoke-device-method-request, :http.request.configuration/protocol "rest-json", :http.request.configuration/method :post, :http.request.configuration/response-code 200, :http.request.configuration/action "InvokeDeviceMethod", :http.request.spec/error-spec {"InvalidRequestException" :portkey.aws.iot1click-devices/invalid-request-exception, "PreconditionFailedException" :portkey.aws.iot1click-devices/precondition-failed-exception, "InternalFailureException" :portkey.aws.iot1click-devices/internal-failure-exception, "ResourceNotFoundException" :portkey.aws.iot1click-devices/resource-not-found-exception, "RangeNotSatisfiableException" :portkey.aws.iot1click-devices/range-not-satisfiable-exception, "ResourceConflictException" :portkey.aws.iot1click-devices/resource-conflict-exception}})))))
(clojure.spec.alpha/fdef invoke-device-method :args (clojure.spec.alpha/tuple :portkey.aws.iot1click-devices/invoke-device-method-request) :ret (clojure.spec.alpha/and :portkey.aws.iot1click-devices/invoke-device-method-response))

(clojure.core/defn get-device-methods ([get-device-methods-requestinput] (clojure.core/let [request-function-result__43533__auto__ (req-get-device-methods-request get-device-methods-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__43533__auto__ {:http.request.configuration/endpoints portkey.aws.iot1click-devices/endpoints, :http.request.spec/output-spec :portkey.aws.iot1click-devices/get-device-methods-response, :http.request.configuration/mime-type {"content-type" "application/json"}, :http.request.configuration/request-uri "/devices/{deviceId}/methods", :http.request.configuration/version "2018-05-14", :http.request.configuration/service-id "IoT 1Click Devices Service", :http.request.spec/input-spec :portkey.aws.iot1click-devices/get-device-methods-request, :http.request.configuration/protocol "rest-json", :http.request.configuration/method :get, :http.request.configuration/response-code 200, :http.request.configuration/action "GetDeviceMethods", :http.request.spec/error-spec {"ResourceNotFoundException" :portkey.aws.iot1click-devices/resource-not-found-exception, "InvalidRequestException" :portkey.aws.iot1click-devices/invalid-request-exception, "InternalFailureException" :portkey.aws.iot1click-devices/internal-failure-exception}})))))
(clojure.spec.alpha/fdef get-device-methods :args (clojure.spec.alpha/tuple :portkey.aws.iot1click-devices/get-device-methods-request) :ret (clojure.spec.alpha/and :portkey.aws.iot1click-devices/get-device-methods-response))

(clojure.core/defn finalize-device-claim ([finalize-device-claim-requestinput] (clojure.core/let [request-function-result__43533__auto__ (req-finalize-device-claim-request finalize-device-claim-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__43533__auto__ {:http.request.configuration/endpoints portkey.aws.iot1click-devices/endpoints, :http.request.spec/output-spec :portkey.aws.iot1click-devices/finalize-device-claim-response, :http.request.configuration/mime-type {"content-type" "application/json"}, :http.request.configuration/request-uri "/devices/{deviceId}/finalize-claim", :http.request.configuration/version "2018-05-14", :http.request.configuration/service-id "IoT 1Click Devices Service", :http.request.spec/input-spec :portkey.aws.iot1click-devices/finalize-device-claim-request, :http.request.configuration/protocol "rest-json", :http.request.configuration/method :put, :http.request.configuration/response-code 200, :http.request.configuration/action "FinalizeDeviceClaim", :http.request.spec/error-spec {"ResourceNotFoundException" :portkey.aws.iot1click-devices/resource-not-found-exception, "InvalidRequestException" :portkey.aws.iot1click-devices/invalid-request-exception, "InternalFailureException" :portkey.aws.iot1click-devices/internal-failure-exception, "PreconditionFailedException" :portkey.aws.iot1click-devices/precondition-failed-exception, "ResourceConflictException" :portkey.aws.iot1click-devices/resource-conflict-exception}})))))
(clojure.spec.alpha/fdef finalize-device-claim :args (clojure.spec.alpha/tuple :portkey.aws.iot1click-devices/finalize-device-claim-request) :ret (clojure.spec.alpha/and :portkey.aws.iot1click-devices/finalize-device-claim-response))

(clojure.core/defn list-devices ([] (list-devices {})) ([list-devices-requestinput] (clojure.core/let [request-function-result__43533__auto__ (req-list-devices-request list-devices-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__43533__auto__ {:http.request.configuration/endpoints portkey.aws.iot1click-devices/endpoints, :http.request.spec/output-spec :portkey.aws.iot1click-devices/list-devices-response, :http.request.configuration/mime-type {"content-type" "application/json"}, :http.request.configuration/request-uri "/devices", :http.request.configuration/version "2018-05-14", :http.request.configuration/service-id "IoT 1Click Devices Service", :http.request.spec/input-spec :portkey.aws.iot1click-devices/list-devices-request, :http.request.configuration/protocol "rest-json", :http.request.configuration/method :get, :http.request.configuration/response-code 200, :http.request.configuration/action "ListDevices", :http.request.spec/error-spec {"RangeNotSatisfiableException" :portkey.aws.iot1click-devices/range-not-satisfiable-exception, "InvalidRequestException" :portkey.aws.iot1click-devices/invalid-request-exception, "InternalFailureException" :portkey.aws.iot1click-devices/internal-failure-exception}})))))
(clojure.spec.alpha/fdef list-devices :args (clojure.spec.alpha/? :portkey.aws.iot1click-devices/list-devices-request) :ret (clojure.spec.alpha/and :portkey.aws.iot1click-devices/list-devices-response))

(clojure.core/defn update-device-state ([update-device-state-requestinput] (clojure.core/let [request-function-result__43533__auto__ (req-update-device-state-request update-device-state-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__43533__auto__ {:http.request.configuration/endpoints portkey.aws.iot1click-devices/endpoints, :http.request.spec/output-spec :portkey.aws.iot1click-devices/update-device-state-response, :http.request.configuration/mime-type {"content-type" "application/json"}, :http.request.configuration/request-uri "/devices/{deviceId}/state", :http.request.configuration/version "2018-05-14", :http.request.configuration/service-id "IoT 1Click Devices Service", :http.request.spec/input-spec :portkey.aws.iot1click-devices/update-device-state-request, :http.request.configuration/protocol "rest-json", :http.request.configuration/method :put, :http.request.configuration/response-code 200, :http.request.configuration/action "UpdateDeviceState", :http.request.spec/error-spec {"ResourceNotFoundException" :portkey.aws.iot1click-devices/resource-not-found-exception, "InvalidRequestException" :portkey.aws.iot1click-devices/invalid-request-exception, "InternalFailureException" :portkey.aws.iot1click-devices/internal-failure-exception}})))))
(clojure.spec.alpha/fdef update-device-state :args (clojure.spec.alpha/tuple :portkey.aws.iot1click-devices/update-device-state-request) :ret (clojure.spec.alpha/and :portkey.aws.iot1click-devices/update-device-state-response))

(clojure.core/defn initiate-device-claim ([initiate-device-claim-requestinput] (clojure.core/let [request-function-result__43533__auto__ (req-initiate-device-claim-request initiate-device-claim-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__43533__auto__ {:http.request.configuration/endpoints portkey.aws.iot1click-devices/endpoints, :http.request.spec/output-spec :portkey.aws.iot1click-devices/initiate-device-claim-response, :http.request.configuration/mime-type {"content-type" "application/json"}, :http.request.configuration/request-uri "/devices/{deviceId}/initiate-claim", :http.request.configuration/version "2018-05-14", :http.request.configuration/service-id "IoT 1Click Devices Service", :http.request.spec/input-spec :portkey.aws.iot1click-devices/initiate-device-claim-request, :http.request.configuration/protocol "rest-json", :http.request.configuration/method :put, :http.request.configuration/response-code 200, :http.request.configuration/action "InitiateDeviceClaim", :http.request.spec/error-spec {"ResourceNotFoundException" :portkey.aws.iot1click-devices/resource-not-found-exception, "InvalidRequestException" :portkey.aws.iot1click-devices/invalid-request-exception, "InternalFailureException" :portkey.aws.iot1click-devices/internal-failure-exception, "ResourceConflictException" :portkey.aws.iot1click-devices/resource-conflict-exception}})))))
(clojure.spec.alpha/fdef initiate-device-claim :args (clojure.spec.alpha/tuple :portkey.aws.iot1click-devices/initiate-device-claim-request) :ret (clojure.spec.alpha/and :portkey.aws.iot1click-devices/initiate-device-claim-response))

(clojure.core/defn describe-device ([describe-device-requestinput] (clojure.core/let [request-function-result__43533__auto__ (req-describe-device-request describe-device-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__43533__auto__ {:http.request.configuration/endpoints portkey.aws.iot1click-devices/endpoints, :http.request.spec/output-spec :portkey.aws.iot1click-devices/describe-device-response, :http.request.configuration/mime-type {"content-type" "application/json"}, :http.request.configuration/request-uri "/devices/{deviceId}", :http.request.configuration/version "2018-05-14", :http.request.configuration/service-id "IoT 1Click Devices Service", :http.request.spec/input-spec :portkey.aws.iot1click-devices/describe-device-request, :http.request.configuration/protocol "rest-json", :http.request.configuration/method :get, :http.request.configuration/response-code 200, :http.request.configuration/action "DescribeDevice", :http.request.spec/error-spec {"ResourceNotFoundException" :portkey.aws.iot1click-devices/resource-not-found-exception, "InvalidRequestException" :portkey.aws.iot1click-devices/invalid-request-exception, "InternalFailureException" :portkey.aws.iot1click-devices/internal-failure-exception}})))))
(clojure.spec.alpha/fdef describe-device :args (clojure.spec.alpha/tuple :portkey.aws.iot1click-devices/describe-device-request) :ret (clojure.spec.alpha/and :portkey.aws.iot1click-devices/describe-device-response))
