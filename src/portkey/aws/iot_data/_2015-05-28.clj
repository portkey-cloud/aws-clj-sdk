(ns portkey.aws.iot-data.-2015-05-28 (:require [portkey.aws]))

(def
 endpoints
 '{"ap-northeast-1"
   {:credential-scope {:service "iotdata", :region "ap-northeast-1"},
    :ssl-common-name "data.iot.ap-northeast-1.amazonaws.com",
    :endpoint "https://data.iot.ap-northeast-1.amazonaws.com",
    :signature-version :v4},
   "eu-west-1"
   {:credential-scope {:service "iotdata", :region "eu-west-1"},
    :ssl-common-name "data.iot.eu-west-1.amazonaws.com",
    :endpoint "https://data.iot.eu-west-1.amazonaws.com",
    :signature-version :v4},
   "us-east-2"
   {:credential-scope {:service "iotdata", :region "us-east-2"},
    :ssl-common-name "data.iot.us-east-2.amazonaws.com",
    :endpoint "https://data.iot.us-east-2.amazonaws.com",
    :signature-version :v4},
   "ap-southeast-2"
   {:credential-scope {:service "iotdata", :region "ap-southeast-2"},
    :ssl-common-name "data.iot.ap-southeast-2.amazonaws.com",
    :endpoint "https://data.iot.ap-southeast-2.amazonaws.com",
    :signature-version :v4},
   "cn-north-1"
   {:credential-scope {:service "iotdata", :region "cn-north-1"},
    :ssl-common-name "data.iot.cn-north-1.amazonaws.com.cn",
    :endpoint "https://data.iot.cn-north-1.amazonaws.com.cn",
    :signature-version :v4},
   "ap-southeast-1"
   {:credential-scope {:service "iotdata", :region "ap-southeast-1"},
    :ssl-common-name "data.iot.ap-southeast-1.amazonaws.com",
    :endpoint "https://data.iot.ap-southeast-1.amazonaws.com",
    :signature-version :v4},
   "ap-northeast-2"
   {:credential-scope {:service "iotdata", :region "ap-northeast-2"},
    :ssl-common-name "data.iot.ap-northeast-2.amazonaws.com",
    :endpoint "https://data.iot.ap-northeast-2.amazonaws.com",
    :signature-version :v4},
   "eu-central-1"
   {:credential-scope {:service "iotdata", :region "eu-central-1"},
    :ssl-common-name "data.iot.eu-central-1.amazonaws.com",
    :endpoint "https://data.iot.eu-central-1.amazonaws.com",
    :signature-version :v4},
   "eu-west-2"
   {:credential-scope {:service "iotdata", :region "eu-west-2"},
    :ssl-common-name "data.iot.eu-west-2.amazonaws.com",
    :endpoint "https://data.iot.eu-west-2.amazonaws.com",
    :signature-version :v4},
   "us-gov-west-1"
   {:credential-scope {:service "iotdata", :region "us-gov-west-1"},
    :ssl-common-name "data.iot.us-gov-west-1.amazonaws.com",
    :endpoint "https://data.iot.us-gov-west-1.amazonaws.com",
    :signature-version :v4},
   "us-west-2"
   {:credential-scope {:service "iotdata", :region "us-west-2"},
    :ssl-common-name "data.iot.us-west-2.amazonaws.com",
    :endpoint "https://data.iot.us-west-2.amazonaws.com",
    :signature-version :v4},
   "us-east-1"
   {:credential-scope {:service "iotdata", :region "us-east-1"},
    :ssl-common-name "data.iot.us-east-1.amazonaws.com",
    :endpoint "https://data.iot.us-east-1.amazonaws.com",
    :signature-version :v4},
   "ap-south-1"
   {:credential-scope {:service "iotdata", :region "ap-south-1"},
    :ssl-common-name "data.iot.ap-south-1.amazonaws.com",
    :endpoint "https://data.iot.ap-south-1.amazonaws.com",
    :signature-version :v4}})

(clojure.core/declare ser-json-document)

(clojure.core/declare ser-payload)

(clojure.core/declare ser-topic)

(clojure.core/declare ser-qos)

(clojure.core/declare ser-thing-name)

(clojure.core/defn- ser-json-document [input] #:http.request.field{:value (portkey.aws/base64-encode input), :shape "JsonDocument"})

(clojure.core/defn- ser-payload [input] #:http.request.field{:value (portkey.aws/base64-encode input), :shape "Payload"})

(clojure.core/defn- ser-topic [input] #:http.request.field{:value input, :shape "Topic"})

(clojure.core/defn- ser-qos [input] #:http.request.field{:value input, :shape "Qos"})

(clojure.core/defn- ser-thing-name [input] #:http.request.field{:value input, :shape "ThingName"})

(clojure.core/defn- req-get-thing-shadow-request [input] (clojure.core/cond-> #:http.request.configuration{:uri [(clojure.core/into (ser-thing-name (input :thing-name)) #:http.request.field{:name "thingName", :shape "ThingName", :location "uri", :location-name "thingName"})]}))

(clojure.core/defn- req-delete-thing-shadow-request [input] (clojure.core/cond-> #:http.request.configuration{:uri [(clojure.core/into (ser-thing-name (input :thing-name)) #:http.request.field{:name "thingName", :shape "ThingName", :location "uri", :location-name "thingName"})]}))

(clojure.core/defn- req-publish-request [input] (clojure.core/cond-> #:http.request.configuration{:uri [(clojure.core/into (ser-topic (input :topic)) #:http.request.field{:name "topic", :shape "Topic", :location "uri", :location-name "topic"})]} (clojure.core/contains? input :qos) (clojure.core/update-in [:http.request.configuration/querystring] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-qos (input :qos)) #:http.request.field{:name "qos", :shape "Qos", :location "querystring", :location-name "qos"})) (clojure.core/contains? input :payload) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-payload (input :payload)) #:http.request.field{:name "payload", :shape "Payload"}))))

(clojure.core/defn- req-update-thing-shadow-request [input] (clojure.core/cond-> #:http.request.configuration{:uri [(clojure.core/into (ser-thing-name (input :thing-name)) #:http.request.field{:name "thingName", :shape "ThingName", :location "uri", :location-name "thingName"})], :body [(clojure.core/into (ser-json-document (input :payload)) #:http.request.field{:name "payload", :shape "JsonDocument"})]}))

(clojure.core/declare desererror-message)

(clojure.core/declare deser-json-document)

(clojure.core/declare deser-error-message)

(clojure.core/defn- desererror-message [input] input)

(clojure.core/defn- deser-json-document [input] (portkey.aws/base64-decode input))

(clojure.core/defn- deser-error-message [input] input)

(clojure.core/defn- response-method-not-allowed-exception ([input] (response-method-not-allowed-exception nil input)) ([resultWrapper237896 input] (clojure.core/let [rawinput237895 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar237897 {"message" (rawinput237895 "message")}] (clojure.core/cond-> {} (letvar237897 "message") (clojure.core/assoc :message (deser-error-message (clojure.core/get-in letvar237897 ["message"])))))))

(clojure.core/defn- response-unauthorized-exception ([input] (response-unauthorized-exception nil input)) ([resultWrapper237899 input] (clojure.core/let [rawinput237898 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar237900 {"message" (rawinput237898 "message")}] (clojure.core/cond-> {} (letvar237900 "message") (clojure.core/assoc :message (desererror-message (clojure.core/get-in letvar237900 ["message"])))))))

(clojure.core/defn- response-invalid-request-exception ([input] (response-invalid-request-exception nil input)) ([resultWrapper237902 input] (clojure.core/let [rawinput237901 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar237903 {"message" (rawinput237901 "message")}] (clojure.core/cond-> {} (letvar237903 "message") (clojure.core/assoc :message (desererror-message (clojure.core/get-in letvar237903 ["message"])))))))

(clojure.core/defn- response-get-thing-shadow-response ([input] (response-get-thing-shadow-response nil input)) ([resultWrapper237905 input] (clojure.core/let [rawinput237904 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar237906 {"payload" (rawinput237904 "payload")}] (clojure.core/cond-> {} (letvar237906 "payload") (clojure.core/assoc :payload (deser-json-document (clojure.core/get-in letvar237906 ["payload"])))))))

(clojure.core/defn- response-service-unavailable-exception ([input] (response-service-unavailable-exception nil input)) ([resultWrapper237908 input] (clojure.core/let [rawinput237907 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar237909 {"message" (rawinput237907 "message")}] (clojure.core/cond-> {} (letvar237909 "message") (clojure.core/assoc :message (desererror-message (clojure.core/get-in letvar237909 ["message"])))))))

(clojure.core/defn- response-request-entity-too-large-exception ([input] (response-request-entity-too-large-exception nil input)) ([resultWrapper237911 input] (clojure.core/let [rawinput237910 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar237912 {"message" (rawinput237910 "message")}] (clojure.core/cond-> {} (letvar237912 "message") (clojure.core/assoc :message (deser-error-message (clojure.core/get-in letvar237912 ["message"])))))))

(clojure.core/defn- response-internal-failure-exception ([input] (response-internal-failure-exception nil input)) ([resultWrapper237914 input] (clojure.core/let [rawinput237913 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar237915 {"message" (rawinput237913 "message")}] (clojure.core/cond-> {} (letvar237915 "message") (clojure.core/assoc :message (desererror-message (clojure.core/get-in letvar237915 ["message"])))))))

(clojure.core/defn- response-resource-not-found-exception ([input] (response-resource-not-found-exception nil input)) ([resultWrapper237917 input] (clojure.core/let [rawinput237916 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar237918 {"message" (rawinput237916 "message")}] (clojure.core/cond-> {} (letvar237918 "message") (clojure.core/assoc :message (desererror-message (clojure.core/get-in letvar237918 ["message"])))))))

(clojure.core/defn- response-conflict-exception ([input] (response-conflict-exception nil input)) ([resultWrapper237920 input] (clojure.core/let [rawinput237919 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar237921 {"message" (rawinput237919 "message")}] (clojure.core/cond-> {} (letvar237921 "message") (clojure.core/assoc :message (deser-error-message (clojure.core/get-in letvar237921 ["message"])))))))

(clojure.core/defn- response-throttling-exception ([input] (response-throttling-exception nil input)) ([resultWrapper237923 input] (clojure.core/let [rawinput237922 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar237924 {"message" (rawinput237922 "message")}] (clojure.core/cond-> {} (letvar237924 "message") (clojure.core/assoc :message (desererror-message (clojure.core/get-in letvar237924 ["message"])))))))

(clojure.core/defn- response-update-thing-shadow-response ([input] (response-update-thing-shadow-response nil input)) ([resultWrapper237926 input] (clojure.core/let [rawinput237925 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar237927 {"payload" (rawinput237925 "payload")}] (clojure.core/cond-> {} (letvar237927 "payload") (clojure.core/assoc :payload (deser-json-document (clojure.core/get-in letvar237927 ["payload"])))))))

(clojure.core/defn- response-unsupported-document-encoding-exception ([input] (response-unsupported-document-encoding-exception nil input)) ([resultWrapper237929 input] (clojure.core/let [rawinput237928 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar237930 {"message" (rawinput237928 "message")}] (clojure.core/cond-> {} (letvar237930 "message") (clojure.core/assoc :message (desererror-message (clojure.core/get-in letvar237930 ["message"])))))))

(clojure.core/defn- response-delete-thing-shadow-response ([input] (response-delete-thing-shadow-response nil input)) ([resultWrapper237932 input] (clojure.core/let [rawinput237931 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar237933 {"payload" (rawinput237931 "payload")}] (clojure.core/cond-> {:payload (deser-json-document (clojure.core/get-in letvar237933 ["payload"]))}))))

(clojure.spec.alpha/def :portkey.aws.iot-data.-2015-05-28.method-not-allowed-exception/message (clojure.spec.alpha/and :portkey.aws.iot-data.-2015-05-28/error-message))
(clojure.spec.alpha/def :portkey.aws.iot-data.-2015-05-28/method-not-allowed-exception (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.iot-data.-2015-05-28.method-not-allowed-exception/message]))

(clojure.spec.alpha/def :portkey.aws.iot-data.-2015-05-28.unauthorized-exception/message (clojure.spec.alpha/and :portkey.aws.iot-data.-2015-05-28/error-message))
(clojure.spec.alpha/def :portkey.aws.iot-data.-2015-05-28/unauthorized-exception (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.iot-data.-2015-05-28.unauthorized-exception/message]))

(clojure.spec.alpha/def :portkey.aws.iot-data.-2015-05-28.invalid-request-exception/message (clojure.spec.alpha/and :portkey.aws.iot-data.-2015-05-28/error-message))
(clojure.spec.alpha/def :portkey.aws.iot-data.-2015-05-28/invalid-request-exception (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.iot-data.-2015-05-28.invalid-request-exception/message]))

(clojure.spec.alpha/def :portkey.aws.iot-data.-2015-05-28/error-message (clojure.spec.alpha/and clojure.core/string?))

(clojure.spec.alpha/def :portkey.aws.iot-data.-2015-05-28.get-thing-shadow-request/thing-name (clojure.spec.alpha/and :portkey.aws.iot-data.-2015-05-28/thing-name))
(clojure.spec.alpha/def :portkey.aws.iot-data.-2015-05-28/get-thing-shadow-request (clojure.spec.alpha/keys :req-un [:portkey.aws.iot-data.-2015-05-28.get-thing-shadow-request/thing-name] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.iot-data.-2015-05-28/json-document clojure.core/bytes?)

(clojure.spec.alpha/def :portkey.aws.iot-data.-2015-05-28.delete-thing-shadow-request/thing-name (clojure.spec.alpha/and :portkey.aws.iot-data.-2015-05-28/thing-name))
(clojure.spec.alpha/def :portkey.aws.iot-data.-2015-05-28/delete-thing-shadow-request (clojure.spec.alpha/keys :req-un [:portkey.aws.iot-data.-2015-05-28.delete-thing-shadow-request/thing-name] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.iot-data.-2015-05-28.get-thing-shadow-response/payload (clojure.spec.alpha/and :portkey.aws.iot-data.-2015-05-28/json-document))
(clojure.spec.alpha/def :portkey.aws.iot-data.-2015-05-28/get-thing-shadow-response (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.iot-data.-2015-05-28.get-thing-shadow-response/payload]))

(clojure.spec.alpha/def :portkey.aws.iot-data.-2015-05-28.service-unavailable-exception/message (clojure.spec.alpha/and :portkey.aws.iot-data.-2015-05-28/error-message))
(clojure.spec.alpha/def :portkey.aws.iot-data.-2015-05-28/service-unavailable-exception (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.iot-data.-2015-05-28.service-unavailable-exception/message]))

(clojure.spec.alpha/def :portkey.aws.iot-data.-2015-05-28/payload clojure.core/bytes?)

(clojure.spec.alpha/def :portkey.aws.iot-data.-2015-05-28/error-message (clojure.spec.alpha/and clojure.core/string?))

(clojure.spec.alpha/def :portkey.aws.iot-data.-2015-05-28/topic (clojure.spec.alpha/and clojure.core/string?))

(clojure.spec.alpha/def :portkey.aws.iot-data.-2015-05-28.request-entity-too-large-exception/message (clojure.spec.alpha/and :portkey.aws.iot-data.-2015-05-28/error-message))
(clojure.spec.alpha/def :portkey.aws.iot-data.-2015-05-28/request-entity-too-large-exception (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.iot-data.-2015-05-28.request-entity-too-large-exception/message]))

(clojure.spec.alpha/def :portkey.aws.iot-data.-2015-05-28.internal-failure-exception/message (clojure.spec.alpha/and :portkey.aws.iot-data.-2015-05-28/error-message))
(clojure.spec.alpha/def :portkey.aws.iot-data.-2015-05-28/internal-failure-exception (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.iot-data.-2015-05-28.internal-failure-exception/message]))

(clojure.spec.alpha/def :portkey.aws.iot-data.-2015-05-28.resource-not-found-exception/message (clojure.spec.alpha/and :portkey.aws.iot-data.-2015-05-28/error-message))
(clojure.spec.alpha/def :portkey.aws.iot-data.-2015-05-28/resource-not-found-exception (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.iot-data.-2015-05-28.resource-not-found-exception/message]))

(clojure.spec.alpha/def :portkey.aws.iot-data.-2015-05-28.conflict-exception/message (clojure.spec.alpha/and :portkey.aws.iot-data.-2015-05-28/error-message))
(clojure.spec.alpha/def :portkey.aws.iot-data.-2015-05-28/conflict-exception (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.iot-data.-2015-05-28.conflict-exception/message]))

(clojure.spec.alpha/def :portkey.aws.iot-data.-2015-05-28/qos (clojure.spec.alpha/int-in 0 1))

(clojure.spec.alpha/def :portkey.aws.iot-data.-2015-05-28/thing-name (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__21110__auto__] (clojure.core/<= 1 (clojure.core/count s__21110__auto__))) (clojure.core/fn [s__21111__auto__] (clojure.core/< (clojure.core/count s__21111__auto__) 128)) (clojure.core/fn [s__21112__auto__] (clojure.core/re-matches #"[a-zA-Z0-9_-]+" s__21112__auto__))))

(clojure.spec.alpha/def :portkey.aws.iot-data.-2015-05-28.publish-request/topic (clojure.spec.alpha/and :portkey.aws.iot-data.-2015-05-28/topic))
(clojure.spec.alpha/def :portkey.aws.iot-data.-2015-05-28.publish-request/qos (clojure.spec.alpha/and :portkey.aws.iot-data.-2015-05-28/qos))
(clojure.spec.alpha/def :portkey.aws.iot-data.-2015-05-28.publish-request/payload (clojure.spec.alpha/and :portkey.aws.iot-data.-2015-05-28/payload))
(clojure.spec.alpha/def :portkey.aws.iot-data.-2015-05-28/publish-request (clojure.spec.alpha/keys :req-un [:portkey.aws.iot-data.-2015-05-28.publish-request/topic] :opt-un [:portkey.aws.iot-data.-2015-05-28.publish-request/qos :portkey.aws.iot-data.-2015-05-28.publish-request/payload]))

(clojure.spec.alpha/def :portkey.aws.iot-data.-2015-05-28.throttling-exception/message (clojure.spec.alpha/and :portkey.aws.iot-data.-2015-05-28/error-message))
(clojure.spec.alpha/def :portkey.aws.iot-data.-2015-05-28/throttling-exception (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.iot-data.-2015-05-28.throttling-exception/message]))

(clojure.spec.alpha/def :portkey.aws.iot-data.-2015-05-28.update-thing-shadow-response/payload (clojure.spec.alpha/and :portkey.aws.iot-data.-2015-05-28/json-document))
(clojure.spec.alpha/def :portkey.aws.iot-data.-2015-05-28/update-thing-shadow-response (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.iot-data.-2015-05-28.update-thing-shadow-response/payload]))

(clojure.spec.alpha/def :portkey.aws.iot-data.-2015-05-28.unsupported-document-encoding-exception/message (clojure.spec.alpha/and :portkey.aws.iot-data.-2015-05-28/error-message))
(clojure.spec.alpha/def :portkey.aws.iot-data.-2015-05-28/unsupported-document-encoding-exception (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.iot-data.-2015-05-28.unsupported-document-encoding-exception/message]))

(clojure.spec.alpha/def :portkey.aws.iot-data.-2015-05-28.delete-thing-shadow-response/payload (clojure.spec.alpha/and :portkey.aws.iot-data.-2015-05-28/json-document))
(clojure.spec.alpha/def :portkey.aws.iot-data.-2015-05-28/delete-thing-shadow-response (clojure.spec.alpha/keys :req-un [:portkey.aws.iot-data.-2015-05-28.delete-thing-shadow-response/payload] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.iot-data.-2015-05-28.update-thing-shadow-request/thing-name (clojure.spec.alpha/and :portkey.aws.iot-data.-2015-05-28/thing-name))
(clojure.spec.alpha/def :portkey.aws.iot-data.-2015-05-28.update-thing-shadow-request/payload (clojure.spec.alpha/and :portkey.aws.iot-data.-2015-05-28/json-document))
(clojure.spec.alpha/def :portkey.aws.iot-data.-2015-05-28/update-thing-shadow-request (clojure.spec.alpha/keys :req-un [:portkey.aws.iot-data.-2015-05-28.update-thing-shadow-request/thing-name :portkey.aws.iot-data.-2015-05-28.update-thing-shadow-request/payload] :opt-un []))

(clojure.core/defn delete-thing-shadow "Deletes the thing shadow for the specified thing.\n For more information, see DeleteThingShadow\n(http://docs.aws.amazon.com/iot/latest/developerguide/API_DeleteThingShadow.html)\nin the AWS IoT Developer Guide." ([delete-thing-shadow-requestinput] (clojure.core/let [request-function-result__22153__auto__ (req-delete-thing-shadow-request delete-thing-shadow-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__22153__auto__ {:http.request.configuration/endpoints portkey.aws.iot-data.-2015-05-28/endpoints, :http.request.configuration/target-prefix nil, :http.request.spec/output-spec :portkey.aws.iot-data.-2015-05-28/delete-thing-shadow-response, :http.request.configuration/mime-type {"content-type" "application/json"}, :http.request.configuration/request-uri "/things/{thingName}/shadow", :http.request.configuration/version "2015-05-28", :http.request.configuration/service-id nil, :http.request.spec/input-spec :portkey.aws.iot-data.-2015-05-28/delete-thing-shadow-request, :http.request.configuration/protocol "rest-json", :http.request.configuration/method :delete, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "DeleteThingShadow", :http.request.configuration/output-deser-fn response-delete-thing-shadow-response, :http.request.spec/error-spec {"ResourceNotFoundException" :portkey.aws.iot-data.-2015-05-28/resource-not-found-exception, "InvalidRequestException" :portkey.aws.iot-data.-2015-05-28/invalid-request-exception, "ThrottlingException" :portkey.aws.iot-data.-2015-05-28/throttling-exception, "UnauthorizedException" :portkey.aws.iot-data.-2015-05-28/unauthorized-exception, "ServiceUnavailableException" :portkey.aws.iot-data.-2015-05-28/service-unavailable-exception, "InternalFailureException" :portkey.aws.iot-data.-2015-05-28/internal-failure-exception, "MethodNotAllowedException" :portkey.aws.iot-data.-2015-05-28/method-not-allowed-exception, "UnsupportedDocumentEncodingException" :portkey.aws.iot-data.-2015-05-28/unsupported-document-encoding-exception}})))))
(clojure.spec.alpha/fdef delete-thing-shadow :args (clojure.spec.alpha/tuple :portkey.aws.iot-data.-2015-05-28/delete-thing-shadow-request) :ret (clojure.spec.alpha/and :portkey.aws.iot-data.-2015-05-28/delete-thing-shadow-response))

(clojure.core/defn get-thing-shadow "Gets the thing shadow for the specified thing.\n For more information, see GetThingShadow\n(http://docs.aws.amazon.com/iot/latest/developerguide/API_GetThingShadow.html)\nin the AWS IoT Developer Guide." ([get-thing-shadow-requestinput] (clojure.core/let [request-function-result__22153__auto__ (req-get-thing-shadow-request get-thing-shadow-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__22153__auto__ {:http.request.configuration/endpoints portkey.aws.iot-data.-2015-05-28/endpoints, :http.request.configuration/target-prefix nil, :http.request.spec/output-spec :portkey.aws.iot-data.-2015-05-28/get-thing-shadow-response, :http.request.configuration/mime-type {"content-type" "application/json"}, :http.request.configuration/request-uri "/things/{thingName}/shadow", :http.request.configuration/version "2015-05-28", :http.request.configuration/service-id nil, :http.request.spec/input-spec :portkey.aws.iot-data.-2015-05-28/get-thing-shadow-request, :http.request.configuration/protocol "rest-json", :http.request.configuration/method :get, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "GetThingShadow", :http.request.configuration/output-deser-fn response-get-thing-shadow-response, :http.request.spec/error-spec {"InvalidRequestException" :portkey.aws.iot-data.-2015-05-28/invalid-request-exception, "ResourceNotFoundException" :portkey.aws.iot-data.-2015-05-28/resource-not-found-exception, "ThrottlingException" :portkey.aws.iot-data.-2015-05-28/throttling-exception, "UnauthorizedException" :portkey.aws.iot-data.-2015-05-28/unauthorized-exception, "ServiceUnavailableException" :portkey.aws.iot-data.-2015-05-28/service-unavailable-exception, "InternalFailureException" :portkey.aws.iot-data.-2015-05-28/internal-failure-exception, "MethodNotAllowedException" :portkey.aws.iot-data.-2015-05-28/method-not-allowed-exception, "UnsupportedDocumentEncodingException" :portkey.aws.iot-data.-2015-05-28/unsupported-document-encoding-exception}})))))
(clojure.spec.alpha/fdef get-thing-shadow :args (clojure.spec.alpha/tuple :portkey.aws.iot-data.-2015-05-28/get-thing-shadow-request) :ret (clojure.spec.alpha/and :portkey.aws.iot-data.-2015-05-28/get-thing-shadow-response))

(clojure.core/defn publish "Publishes state information.\n For more information, see HTTP Protocol\n(http://docs.aws.amazon.com/iot/latest/developerguide/protocols.html#http) in\nthe AWS IoT Developer Guide." ([publish-requestinput] (clojure.core/let [request-function-result__22153__auto__ (req-publish-request publish-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__22153__auto__ {:http.request.configuration/endpoints portkey.aws.iot-data.-2015-05-28/endpoints, :http.request.configuration/target-prefix nil, :http.request.spec/output-spec nil, :http.request.configuration/mime-type {"content-type" "application/json"}, :http.request.configuration/request-uri "/topics/{topic}", :http.request.configuration/version "2015-05-28", :http.request.configuration/service-id nil, :http.request.spec/input-spec :portkey.aws.iot-data.-2015-05-28/publish-request, :http.request.configuration/protocol "rest-json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "Publish", :http.request.configuration/output-deser-fn (clojure.core/fn [& args__22152__auto__] {}), :http.request.spec/error-spec {"InternalFailureException" :portkey.aws.iot-data.-2015-05-28/internal-failure-exception, "InvalidRequestException" :portkey.aws.iot-data.-2015-05-28/invalid-request-exception, "UnauthorizedException" :portkey.aws.iot-data.-2015-05-28/unauthorized-exception, "MethodNotAllowedException" :portkey.aws.iot-data.-2015-05-28/method-not-allowed-exception}})))))
(clojure.spec.alpha/fdef publish :args (clojure.spec.alpha/tuple :portkey.aws.iot-data.-2015-05-28/publish-request) :ret clojure.core/true?)

(clojure.core/defn update-thing-shadow "Updates the thing shadow for the specified thing.\n For more information, see UpdateThingShadow\n(http://docs.aws.amazon.com/iot/latest/developerguide/API_UpdateThingShadow.html)\nin the AWS IoT Developer Guide." ([update-thing-shadow-requestinput] (clojure.core/let [request-function-result__22153__auto__ (req-update-thing-shadow-request update-thing-shadow-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__22153__auto__ {:http.request.configuration/endpoints portkey.aws.iot-data.-2015-05-28/endpoints, :http.request.configuration/target-prefix nil, :http.request.spec/output-spec :portkey.aws.iot-data.-2015-05-28/update-thing-shadow-response, :http.request.configuration/mime-type {"content-type" "application/json"}, :http.request.configuration/request-uri "/things/{thingName}/shadow", :http.request.configuration/version "2015-05-28", :http.request.configuration/service-id nil, :http.request.spec/input-spec :portkey.aws.iot-data.-2015-05-28/update-thing-shadow-request, :http.request.configuration/protocol "rest-json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "UpdateThingShadow", :http.request.configuration/output-deser-fn response-update-thing-shadow-response, :http.request.spec/error-spec {"MethodNotAllowedException" :portkey.aws.iot-data.-2015-05-28/method-not-allowed-exception, "UnauthorizedException" :portkey.aws.iot-data.-2015-05-28/unauthorized-exception, "InvalidRequestException" :portkey.aws.iot-data.-2015-05-28/invalid-request-exception, "ServiceUnavailableException" :portkey.aws.iot-data.-2015-05-28/service-unavailable-exception, "RequestEntityTooLargeException" :portkey.aws.iot-data.-2015-05-28/request-entity-too-large-exception, "InternalFailureException" :portkey.aws.iot-data.-2015-05-28/internal-failure-exception, "ConflictException" :portkey.aws.iot-data.-2015-05-28/conflict-exception, "ThrottlingException" :portkey.aws.iot-data.-2015-05-28/throttling-exception, "UnsupportedDocumentEncodingException" :portkey.aws.iot-data.-2015-05-28/unsupported-document-encoding-exception}})))))
(clojure.spec.alpha/fdef update-thing-shadow :args (clojure.spec.alpha/tuple :portkey.aws.iot-data.-2015-05-28/update-thing-shadow-request) :ret (clojure.spec.alpha/and :portkey.aws.iot-data.-2015-05-28/update-thing-shadow-response))
