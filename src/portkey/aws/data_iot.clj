(ns portkey.aws.data-iot (:require [portkey.aws]))

(def endpoints 'nil)

(clojure.spec.alpha/def :portkey.aws.data-iot.method-not-allowed-exception/message (clojure.spec.alpha/and :portkey.aws.data-iot/error-message))
(clojure.spec.alpha/def :portkey.aws.data-iot/method-not-allowed-exception (portkey.aws/json-keys :req-un [] :opt-un [:portkey.aws.data-iot.method-not-allowed-exception/message] :locations {}))

(clojure.spec.alpha/def :portkey.aws.data-iot.unauthorized-exception/message (clojure.spec.alpha/and :portkey.aws.data-iot/error-message))
(clojure.spec.alpha/def :portkey.aws.data-iot/unauthorized-exception (portkey.aws/json-keys :req-un [] :opt-un [:portkey.aws.data-iot.unauthorized-exception/message] :locations {}))

(clojure.spec.alpha/def :portkey.aws.data-iot.invalid-request-exception/message (clojure.spec.alpha/and :portkey.aws.data-iot/error-message))
(clojure.spec.alpha/def :portkey.aws.data-iot/invalid-request-exception (portkey.aws/json-keys :req-un [] :opt-un [:portkey.aws.data-iot.invalid-request-exception/message] :locations {}))

(clojure.spec.alpha/def :portkey.aws.data-iot/error-message (clojure.spec.alpha/and clojure.core/string?))

(clojure.spec.alpha/def :portkey.aws.data-iot.get-thing-shadow-request/thing-name (clojure.spec.alpha/and :portkey.aws.data-iot/thing-name))
(clojure.spec.alpha/def :portkey.aws.data-iot/get-thing-shadow-request (portkey.aws/json-keys :req-un [:portkey.aws.data-iot.get-thing-shadow-request/thingName] :opt-un [] :locations {}))

(clojure.spec.alpha/def :portkey.aws.data-iot/json-document (clojure.spec.alpha/and clojure.core/bytes? (clojure.spec.alpha/conformer portkey.aws/base64-encode portkey.aws/base64-decode)))

(clojure.spec.alpha/def :portkey.aws.data-iot.delete-thing-shadow-request/thing-name (clojure.spec.alpha/and :portkey.aws.data-iot/thing-name))
(clojure.spec.alpha/def :portkey.aws.data-iot/delete-thing-shadow-request (portkey.aws/json-keys :req-un [:portkey.aws.data-iot.delete-thing-shadow-request/thingName] :opt-un [] :locations {}))

(clojure.spec.alpha/def :portkey.aws.data-iot.get-thing-shadow-response/payload (clojure.spec.alpha/and :portkey.aws.data-iot/json-document))
(clojure.spec.alpha/def :portkey.aws.data-iot/get-thing-shadow-response (portkey.aws/json-keys :req-un [] :opt-un [:portkey.aws.data-iot.get-thing-shadow-response/payload] :locations {}))

(clojure.spec.alpha/def :portkey.aws.data-iot.service-unavailable-exception/message (clojure.spec.alpha/and :portkey.aws.data-iot/error-message))
(clojure.spec.alpha/def :portkey.aws.data-iot/service-unavailable-exception (portkey.aws/json-keys :req-un [] :opt-un [:portkey.aws.data-iot.service-unavailable-exception/message] :locations {}))

(clojure.spec.alpha/def :portkey.aws.data-iot/payload (clojure.spec.alpha/and clojure.core/bytes? (clojure.spec.alpha/conformer portkey.aws/base64-encode portkey.aws/base64-decode)))

(clojure.spec.alpha/def :portkey.aws.data-iot/error-message (clojure.spec.alpha/and clojure.core/string?))

(clojure.spec.alpha/def :portkey.aws.data-iot/topic (clojure.spec.alpha/and clojure.core/string?))

(clojure.spec.alpha/def :portkey.aws.data-iot.request-entity-too-large-exception/message (clojure.spec.alpha/and :portkey.aws.data-iot/error-message))
(clojure.spec.alpha/def :portkey.aws.data-iot/request-entity-too-large-exception (portkey.aws/json-keys :req-un [] :opt-un [:portkey.aws.data-iot.request-entity-too-large-exception/message] :locations {}))

(clojure.spec.alpha/def :portkey.aws.data-iot.internal-failure-exception/message (clojure.spec.alpha/and :portkey.aws.data-iot/error-message))
(clojure.spec.alpha/def :portkey.aws.data-iot/internal-failure-exception (portkey.aws/json-keys :req-un [] :opt-un [:portkey.aws.data-iot.internal-failure-exception/message] :locations {}))

(clojure.spec.alpha/def :portkey.aws.data-iot.resource-not-found-exception/message (clojure.spec.alpha/and :portkey.aws.data-iot/error-message))
(clojure.spec.alpha/def :portkey.aws.data-iot/resource-not-found-exception (portkey.aws/json-keys :req-un [] :opt-un [:portkey.aws.data-iot.resource-not-found-exception/message] :locations {}))

(clojure.spec.alpha/def :portkey.aws.data-iot.conflict-exception/message (clojure.spec.alpha/and :portkey.aws.data-iot/error-message))
(clojure.spec.alpha/def :portkey.aws.data-iot/conflict-exception (portkey.aws/json-keys :req-un [] :opt-un [:portkey.aws.data-iot.conflict-exception/message] :locations {}))

(clojure.spec.alpha/def :portkey.aws.data-iot/qos (clojure.spec.alpha/and clojure.core/int? (fn* [p1__16026__16027__auto__] (clojure.core/<= 0 p1__16026__16027__auto__)) (fn* [p1__16028__16029__auto__] (clojure.core/<= p1__16028__16029__auto__ 1))))

(clojure.spec.alpha/def :portkey.aws.data-iot/thing-name (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__15966__auto__] (clojure.core/<= 1 (clojure.core/count s__15966__auto__))) (clojure.core/fn [s__15967__auto__] (clojure.core/< (clojure.core/count s__15967__auto__) 128)) (clojure.core/fn [s__15968__auto__] (clojure.core/re-matches #"[a-zA-Z0-9_-]+" s__15968__auto__))))

(clojure.spec.alpha/def :portkey.aws.data-iot.publish-request/topic (clojure.spec.alpha/and :portkey.aws.data-iot/topic))
(clojure.spec.alpha/def :portkey.aws.data-iot.publish-request/qos (clojure.spec.alpha/and :portkey.aws.data-iot/qos))
(clojure.spec.alpha/def :portkey.aws.data-iot.publish-request/payload (clojure.spec.alpha/and :portkey.aws.data-iot/payload))
(clojure.spec.alpha/def :portkey.aws.data-iot/publish-request (portkey.aws/json-keys :req-un [:portkey.aws.data-iot.publish-request/topic] :opt-un [:portkey.aws.data-iot.publish-request/qos :portkey.aws.data-iot.publish-request/payload] :locations {}))

(clojure.spec.alpha/def :portkey.aws.data-iot.throttling-exception/message (clojure.spec.alpha/and :portkey.aws.data-iot/error-message))
(clojure.spec.alpha/def :portkey.aws.data-iot/throttling-exception (portkey.aws/json-keys :req-un [] :opt-un [:portkey.aws.data-iot.throttling-exception/message] :locations {}))

(clojure.spec.alpha/def :portkey.aws.data-iot.update-thing-shadow-response/payload (clojure.spec.alpha/and :portkey.aws.data-iot/json-document))
(clojure.spec.alpha/def :portkey.aws.data-iot/update-thing-shadow-response (portkey.aws/json-keys :req-un [] :opt-un [:portkey.aws.data-iot.update-thing-shadow-response/payload] :locations {}))

(clojure.spec.alpha/def :portkey.aws.data-iot.unsupported-document-encoding-exception/message (clojure.spec.alpha/and :portkey.aws.data-iot/error-message))
(clojure.spec.alpha/def :portkey.aws.data-iot/unsupported-document-encoding-exception (portkey.aws/json-keys :req-un [] :opt-un [:portkey.aws.data-iot.unsupported-document-encoding-exception/message] :locations {}))

(clojure.spec.alpha/def :portkey.aws.data-iot.delete-thing-shadow-response/payload (clojure.spec.alpha/and :portkey.aws.data-iot/json-document))
(clojure.spec.alpha/def :portkey.aws.data-iot/delete-thing-shadow-response (portkey.aws/json-keys :req-un [:portkey.aws.data-iot.delete-thing-shadow-response/payload] :opt-un [] :locations {}))

(clojure.spec.alpha/def :portkey.aws.data-iot.update-thing-shadow-request/thing-name (clojure.spec.alpha/and :portkey.aws.data-iot/thing-name))
(clojure.spec.alpha/def :portkey.aws.data-iot.update-thing-shadow-request/payload (clojure.spec.alpha/and :portkey.aws.data-iot/json-document))
(clojure.spec.alpha/def :portkey.aws.data-iot/update-thing-shadow-request (portkey.aws/json-keys :req-un [:portkey.aws.data-iot.update-thing-shadow-request/thingName :portkey.aws.data-iot.update-thing-shadow-request/payload] :opt-un [] :locations {}))

(clojure.core/defn delete-thing-shadow "Deletes the thing shadow for the specified thing.\n For more information, see DeleteThingShadow\n(http://docs.aws.amazon.com/iot/latest/developerguide/API_DeleteThingShadow.html)\nin the AWS IoT Developer Guide." ([delete-thing-shadow-request] (portkey.aws/-rest-json-call portkey.aws.data-iot/endpoints "DELETE" "/things/{thingName}/shadow" delete-thing-shadow-request :portkey.aws.data-iot/delete-thing-shadow-request {:payload nil, :move {}, :headers {}, :uri {"thingName" "thingName"}, :querystring {}} nil :portkey.aws.data-iot/delete-thing-shadow-response {"ResourceNotFoundException" :portkey.aws.data-iot/resource-not-found-exception, "InvalidRequestException" :portkey.aws.data-iot/invalid-request-exception, "ThrottlingException" :portkey.aws.data-iot/throttling-exception, "UnauthorizedException" :portkey.aws.data-iot/unauthorized-exception, "ServiceUnavailableException" :portkey.aws.data-iot/service-unavailable-exception, "InternalFailureException" :portkey.aws.data-iot/internal-failure-exception, "MethodNotAllowedException" :portkey.aws.data-iot/method-not-allowed-exception, "UnsupportedDocumentEncodingException" :portkey.aws.data-iot/unsupported-document-encoding-exception})))
(clojure.spec.alpha/fdef delete-thing-shadow :args (clojure.spec.alpha/tuple :portkey.aws.data-iot/delete-thing-shadow-request) :ret (clojure.spec.alpha/and :portkey.aws.data-iot/delete-thing-shadow-response))

(clojure.core/defn get-thing-shadow "Gets the thing shadow for the specified thing.\n For more information, see GetThingShadow\n(http://docs.aws.amazon.com/iot/latest/developerguide/API_GetThingShadow.html)\nin the AWS IoT Developer Guide." ([get-thing-shadow-request] (portkey.aws/-rest-json-call portkey.aws.data-iot/endpoints "GET" "/things/{thingName}/shadow" get-thing-shadow-request :portkey.aws.data-iot/get-thing-shadow-request {:payload nil, :move {}, :headers {}, :uri {"thingName" "thingName"}, :querystring {}} nil :portkey.aws.data-iot/get-thing-shadow-response {"InvalidRequestException" :portkey.aws.data-iot/invalid-request-exception, "ResourceNotFoundException" :portkey.aws.data-iot/resource-not-found-exception, "ThrottlingException" :portkey.aws.data-iot/throttling-exception, "UnauthorizedException" :portkey.aws.data-iot/unauthorized-exception, "ServiceUnavailableException" :portkey.aws.data-iot/service-unavailable-exception, "InternalFailureException" :portkey.aws.data-iot/internal-failure-exception, "MethodNotAllowedException" :portkey.aws.data-iot/method-not-allowed-exception, "UnsupportedDocumentEncodingException" :portkey.aws.data-iot/unsupported-document-encoding-exception})))
(clojure.spec.alpha/fdef get-thing-shadow :args (clojure.spec.alpha/tuple :portkey.aws.data-iot/get-thing-shadow-request) :ret (clojure.spec.alpha/and :portkey.aws.data-iot/get-thing-shadow-response))

(clojure.core/defn publish "Publishes state information.\n For more information, see HTTP Protocol\n(http://docs.aws.amazon.com/iot/latest/developerguide/protocols.html#http) in\nthe AWS IoT Developer Guide." ([publish-request] (portkey.aws/-rest-json-call portkey.aws.data-iot/endpoints "POST" "/topics/{topic}" publish-request :portkey.aws.data-iot/publish-request {:payload "payload", :move {}, :headers {}, :uri {"topic" "topic"}, :querystring {"qos" "qos"}} nil nil {"InternalFailureException" :portkey.aws.data-iot/internal-failure-exception, "InvalidRequestException" :portkey.aws.data-iot/invalid-request-exception, "UnauthorizedException" :portkey.aws.data-iot/unauthorized-exception, "MethodNotAllowedException" :portkey.aws.data-iot/method-not-allowed-exception})))
(clojure.spec.alpha/fdef publish :args (clojure.spec.alpha/tuple :portkey.aws.data-iot/publish-request) :ret clojure.core/true?)

(clojure.core/defn update-thing-shadow "Updates the thing shadow for the specified thing.\n For more information, see UpdateThingShadow\n(http://docs.aws.amazon.com/iot/latest/developerguide/API_UpdateThingShadow.html)\nin the AWS IoT Developer Guide." ([update-thing-shadow-request] (portkey.aws/-rest-json-call portkey.aws.data-iot/endpoints "POST" "/things/{thingName}/shadow" update-thing-shadow-request :portkey.aws.data-iot/update-thing-shadow-request {:payload "payload", :move {}, :headers {}, :uri {"thingName" "thingName"}, :querystring {}} nil :portkey.aws.data-iot/update-thing-shadow-response {"MethodNotAllowedException" :portkey.aws.data-iot/method-not-allowed-exception, "UnauthorizedException" :portkey.aws.data-iot/unauthorized-exception, "InvalidRequestException" :portkey.aws.data-iot/invalid-request-exception, "ServiceUnavailableException" :portkey.aws.data-iot/service-unavailable-exception, "RequestEntityTooLargeException" :portkey.aws.data-iot/request-entity-too-large-exception, "InternalFailureException" :portkey.aws.data-iot/internal-failure-exception, "ConflictException" :portkey.aws.data-iot/conflict-exception, "ThrottlingException" :portkey.aws.data-iot/throttling-exception, "UnsupportedDocumentEncodingException" :portkey.aws.data-iot/unsupported-document-encoding-exception})))
(clojure.spec.alpha/fdef update-thing-shadow :args (clojure.spec.alpha/tuple :portkey.aws.data-iot/update-thing-shadow-request) :ret (clojure.spec.alpha/and :portkey.aws.data-iot/update-thing-shadow-response))
