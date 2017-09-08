(ns portkey.aws.iot-data (:require [portkey.aws]))

(def endpoints 'nil)

(clojure.spec.alpha/def :portkey.aws.iot-data.method-not-allowed-exception/message (clojure.spec.alpha/and :portkey.aws.iot-data/error-message))
(clojure.spec.alpha/def :portkey.aws.iot-data/method-not-allowed-exception (portkey.aws/json-keys :req-un [] :opt-un [:portkey.aws.iot-data.method-not-allowed-exception/message]))

(clojure.spec.alpha/def :portkey.aws.iot-data.unauthorized-exception/message (clojure.spec.alpha/and :portkey.aws.iot-data/error-message))
(clojure.spec.alpha/def :portkey.aws.iot-data/unauthorized-exception (portkey.aws/json-keys :req-un [] :opt-un [:portkey.aws.iot-data.unauthorized-exception/message]))

(clojure.spec.alpha/def :portkey.aws.iot-data.invalid-request-exception/message (clojure.spec.alpha/and :portkey.aws.iot-data/error-message))
(clojure.spec.alpha/def :portkey.aws.iot-data/invalid-request-exception (portkey.aws/json-keys :req-un [] :opt-un [:portkey.aws.iot-data.invalid-request-exception/message]))

(clojure.spec.alpha/def :portkey.aws.iot-data/error-message (clojure.spec.alpha/and clojure.core/string?))

(clojure.spec.alpha/def :portkey.aws.iot-data.get-thing-shadow-request/thing-name (clojure.spec.alpha/and :portkey.aws.iot-data/thing-name))
(clojure.spec.alpha/def :portkey.aws.iot-data/get-thing-shadow-request (portkey.aws/json-keys :req-un [:portkey.aws.iot-data.get-thing-shadow-request/thingName] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.iot-data/json-document (clojure.spec.alpha/and clojure.core/bytes? (clojure.spec.alpha/conformer portkey.aws/base64-encode portkey.aws/base64-decode)))

(clojure.spec.alpha/def :portkey.aws.iot-data.delete-thing-shadow-request/thing-name (clojure.spec.alpha/and :portkey.aws.iot-data/thing-name))
(clojure.spec.alpha/def :portkey.aws.iot-data/delete-thing-shadow-request (portkey.aws/json-keys :req-un [:portkey.aws.iot-data.delete-thing-shadow-request/thingName] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.iot-data.get-thing-shadow-response/payload (clojure.spec.alpha/and :portkey.aws.iot-data/json-document))
(clojure.spec.alpha/def :portkey.aws.iot-data/get-thing-shadow-response (portkey.aws/json-keys :req-un [] :opt-un [:portkey.aws.iot-data.get-thing-shadow-response/payload]))

(clojure.spec.alpha/def :portkey.aws.iot-data.service-unavailable-exception/message (clojure.spec.alpha/and :portkey.aws.iot-data/error-message))
(clojure.spec.alpha/def :portkey.aws.iot-data/service-unavailable-exception (portkey.aws/json-keys :req-un [] :opt-un [:portkey.aws.iot-data.service-unavailable-exception/message]))

(clojure.spec.alpha/def :portkey.aws.iot-data/payload (clojure.spec.alpha/and clojure.core/bytes? (clojure.spec.alpha/conformer portkey.aws/base64-encode portkey.aws/base64-decode)))

(clojure.spec.alpha/def :portkey.aws.iot-data/error-message (clojure.spec.alpha/and clojure.core/string?))

(clojure.spec.alpha/def :portkey.aws.iot-data/topic (clojure.spec.alpha/and clojure.core/string?))

(clojure.spec.alpha/def :portkey.aws.iot-data.request-entity-too-large-exception/message (clojure.spec.alpha/and :portkey.aws.iot-data/error-message))
(clojure.spec.alpha/def :portkey.aws.iot-data/request-entity-too-large-exception (portkey.aws/json-keys :req-un [] :opt-un [:portkey.aws.iot-data.request-entity-too-large-exception/message]))

(clojure.spec.alpha/def :portkey.aws.iot-data.internal-failure-exception/message (clojure.spec.alpha/and :portkey.aws.iot-data/error-message))
(clojure.spec.alpha/def :portkey.aws.iot-data/internal-failure-exception (portkey.aws/json-keys :req-un [] :opt-un [:portkey.aws.iot-data.internal-failure-exception/message]))

(clojure.spec.alpha/def :portkey.aws.iot-data.resource-not-found-exception/message (clojure.spec.alpha/and :portkey.aws.iot-data/error-message))
(clojure.spec.alpha/def :portkey.aws.iot-data/resource-not-found-exception (portkey.aws/json-keys :req-un [] :opt-un [:portkey.aws.iot-data.resource-not-found-exception/message]))

(clojure.spec.alpha/def :portkey.aws.iot-data.conflict-exception/message (clojure.spec.alpha/and :portkey.aws.iot-data/error-message))
(clojure.spec.alpha/def :portkey.aws.iot-data/conflict-exception (portkey.aws/json-keys :req-un [] :opt-un [:portkey.aws.iot-data.conflict-exception/message]))

(clojure.spec.alpha/def :portkey.aws.iot-data/qos (clojure.spec.alpha/and clojure.core/int? (fn* [p1__8188__8189__auto__] (clojure.core/<= 0 p1__8188__8189__auto__)) (fn* [p1__8190__8191__auto__] (clojure.core/<= p1__8190__8191__auto__ 1))))

(clojure.spec.alpha/def :portkey.aws.iot-data/thing-name (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__8149__auto__] (clojure.core/<= 1 (clojure.core/count s__8149__auto__))) (clojure.core/fn [s__8150__auto__] (clojure.core/< (clojure.core/count s__8150__auto__) 128)) (clojure.core/fn [s__8151__auto__] (clojure.core/re-matches #"[a-zA-Z0-9_-]+" s__8151__auto__))))

(clojure.spec.alpha/def :portkey.aws.iot-data.publish-request/topic (clojure.spec.alpha/and :portkey.aws.iot-data/topic))
(clojure.spec.alpha/def :portkey.aws.iot-data.publish-request/qos (clojure.spec.alpha/and :portkey.aws.iot-data/qos))
(clojure.spec.alpha/def :portkey.aws.iot-data.publish-request/payload (clojure.spec.alpha/and :portkey.aws.iot-data/payload))
(clojure.spec.alpha/def :portkey.aws.iot-data/publish-request (portkey.aws/json-keys :req-un [:portkey.aws.iot-data.publish-request/topic] :opt-un [:portkey.aws.iot-data.publish-request/qos :portkey.aws.iot-data.publish-request/payload]))

(clojure.spec.alpha/def :portkey.aws.iot-data.throttling-exception/message (clojure.spec.alpha/and :portkey.aws.iot-data/error-message))
(clojure.spec.alpha/def :portkey.aws.iot-data/throttling-exception (portkey.aws/json-keys :req-un [] :opt-un [:portkey.aws.iot-data.throttling-exception/message]))

(clojure.spec.alpha/def :portkey.aws.iot-data.update-thing-shadow-response/payload (clojure.spec.alpha/and :portkey.aws.iot-data/json-document))
(clojure.spec.alpha/def :portkey.aws.iot-data/update-thing-shadow-response (portkey.aws/json-keys :req-un [] :opt-un [:portkey.aws.iot-data.update-thing-shadow-response/payload]))

(clojure.spec.alpha/def :portkey.aws.iot-data.unsupported-document-encoding-exception/message (clojure.spec.alpha/and :portkey.aws.iot-data/error-message))
(clojure.spec.alpha/def :portkey.aws.iot-data/unsupported-document-encoding-exception (portkey.aws/json-keys :req-un [] :opt-un [:portkey.aws.iot-data.unsupported-document-encoding-exception/message]))

(clojure.spec.alpha/def :portkey.aws.iot-data.delete-thing-shadow-response/payload (clojure.spec.alpha/and :portkey.aws.iot-data/json-document))
(clojure.spec.alpha/def :portkey.aws.iot-data/delete-thing-shadow-response (portkey.aws/json-keys :req-un [:portkey.aws.iot-data.delete-thing-shadow-response/payload] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.iot-data.update-thing-shadow-request/thing-name (clojure.spec.alpha/and :portkey.aws.iot-data/thing-name))
(clojure.spec.alpha/def :portkey.aws.iot-data.update-thing-shadow-request/payload (clojure.spec.alpha/and :portkey.aws.iot-data/json-document))
(clojure.spec.alpha/def :portkey.aws.iot-data/update-thing-shadow-request (portkey.aws/json-keys :req-un [:portkey.aws.iot-data.update-thing-shadow-request/thingName :portkey.aws.iot-data.update-thing-shadow-request/payload] :opt-un []))

(clojure.core/defn delete-thing-shadow ([delete-thing-shadow-request] (portkey.aws/-rest-json-call portkey.aws.iot-data/endpoints "DELETE" "/things/{thingName}/shadow" delete-thing-shadow-request :portkey.aws.iot-data/delete-thing-shadow-request {:payload nil, :headers {}, :uri {"thingName" "thingName"}, :querystring {}} nil :portkey.aws.iot-data/delete-thing-shadow-response {"ResourceNotFoundException" :portkey.aws.iot-data/resource-not-found-exception, "InvalidRequestException" :portkey.aws.iot-data/invalid-request-exception, "ThrottlingException" :portkey.aws.iot-data/throttling-exception, "UnauthorizedException" :portkey.aws.iot-data/unauthorized-exception, "ServiceUnavailableException" :portkey.aws.iot-data/service-unavailable-exception, "InternalFailureException" :portkey.aws.iot-data/internal-failure-exception, "MethodNotAllowedException" :portkey.aws.iot-data/method-not-allowed-exception, "UnsupportedDocumentEncodingException" :portkey.aws.iot-data/unsupported-document-encoding-exception})))
(clojure.spec.alpha/fdef delete-thing-shadow :args (clojure.spec.alpha/tuple :portkey.aws.iot-data/delete-thing-shadow-request) :ret (clojure.spec.alpha/and :portkey.aws.iot-data/delete-thing-shadow-response))

(clojure.core/defn get-thing-shadow ([get-thing-shadow-request] (portkey.aws/-rest-json-call portkey.aws.iot-data/endpoints "GET" "/things/{thingName}/shadow" get-thing-shadow-request :portkey.aws.iot-data/get-thing-shadow-request {:payload nil, :headers {}, :uri {"thingName" "thingName"}, :querystring {}} nil :portkey.aws.iot-data/get-thing-shadow-response {"InvalidRequestException" :portkey.aws.iot-data/invalid-request-exception, "ResourceNotFoundException" :portkey.aws.iot-data/resource-not-found-exception, "ThrottlingException" :portkey.aws.iot-data/throttling-exception, "UnauthorizedException" :portkey.aws.iot-data/unauthorized-exception, "ServiceUnavailableException" :portkey.aws.iot-data/service-unavailable-exception, "InternalFailureException" :portkey.aws.iot-data/internal-failure-exception, "MethodNotAllowedException" :portkey.aws.iot-data/method-not-allowed-exception, "UnsupportedDocumentEncodingException" :portkey.aws.iot-data/unsupported-document-encoding-exception})))
(clojure.spec.alpha/fdef get-thing-shadow :args (clojure.spec.alpha/tuple :portkey.aws.iot-data/get-thing-shadow-request) :ret (clojure.spec.alpha/and :portkey.aws.iot-data/get-thing-shadow-response))

(clojure.core/defn publish ([publish-request] (portkey.aws/-rest-json-call portkey.aws.iot-data/endpoints "POST" "/topics/{topic}" publish-request :portkey.aws.iot-data/publish-request {:payload "payload", :headers {}, :uri {"topic" "topic"}, :querystring {"qos" "qos"}} nil nil {"InternalFailureException" :portkey.aws.iot-data/internal-failure-exception, "InvalidRequestException" :portkey.aws.iot-data/invalid-request-exception, "UnauthorizedException" :portkey.aws.iot-data/unauthorized-exception, "MethodNotAllowedException" :portkey.aws.iot-data/method-not-allowed-exception})))
(clojure.spec.alpha/fdef publish :args (clojure.spec.alpha/tuple :portkey.aws.iot-data/publish-request) :ret clojure.core/true?)

(clojure.core/defn update-thing-shadow ([update-thing-shadow-request] (portkey.aws/-rest-json-call portkey.aws.iot-data/endpoints "POST" "/things/{thingName}/shadow" update-thing-shadow-request :portkey.aws.iot-data/update-thing-shadow-request {:payload "payload", :headers {}, :uri {"thingName" "thingName"}, :querystring {}} nil :portkey.aws.iot-data/update-thing-shadow-response {"MethodNotAllowedException" :portkey.aws.iot-data/method-not-allowed-exception, "UnauthorizedException" :portkey.aws.iot-data/unauthorized-exception, "InvalidRequestException" :portkey.aws.iot-data/invalid-request-exception, "ServiceUnavailableException" :portkey.aws.iot-data/service-unavailable-exception, "RequestEntityTooLargeException" :portkey.aws.iot-data/request-entity-too-large-exception, "InternalFailureException" :portkey.aws.iot-data/internal-failure-exception, "ConflictException" :portkey.aws.iot-data/conflict-exception, "ThrottlingException" :portkey.aws.iot-data/throttling-exception, "UnsupportedDocumentEncodingException" :portkey.aws.iot-data/unsupported-document-encoding-exception})))
(clojure.spec.alpha/fdef update-thing-shadow :args (clojure.spec.alpha/tuple :portkey.aws.iot-data/update-thing-shadow-request) :ret (clojure.spec.alpha/and :portkey.aws.iot-data/update-thing-shadow-response))
