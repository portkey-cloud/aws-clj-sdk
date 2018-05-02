(ns portkey.aws.runtime-sagemaker.-2017-05-13 (:require [portkey.aws]))

(def endpoints 'nil)

(clojure.spec.alpha/def :portkey.aws.runtime-sagemaker.-2017-05-13.invoke-endpoint-output/body (clojure.spec.alpha/and :portkey.aws.runtime-sagemaker.-2017-05-13/body-blob))
(clojure.spec.alpha/def :portkey.aws.runtime-sagemaker.-2017-05-13.invoke-endpoint-output/content-type (clojure.spec.alpha/and :portkey.aws.runtime-sagemaker.-2017-05-13/header))
(clojure.spec.alpha/def :portkey.aws.runtime-sagemaker.-2017-05-13.invoke-endpoint-output/invoked-production-variant (clojure.spec.alpha/and :portkey.aws.runtime-sagemaker.-2017-05-13/header))
(clojure.spec.alpha/def :portkey.aws.runtime-sagemaker.-2017-05-13/invoke-endpoint-output (portkey.aws/json-keys :req-un [:portkey.aws.runtime-sagemaker.-2017-05-13.invoke-endpoint-output/Body] :opt-un [:portkey.aws.runtime-sagemaker.-2017-05-13.invoke-endpoint-output/ContentType :portkey.aws.runtime-sagemaker.-2017-05-13.invoke-endpoint-output/InvokedProductionVariant] :locations {}))

(clojure.spec.alpha/def :portkey.aws.runtime-sagemaker.-2017-05-13/validation-error (portkey.aws/json-keys :req-un [] :opt-un [:portkey.aws.runtime-sagemaker.-2017-05-13/Message] :locations {}))

(clojure.spec.alpha/def :portkey.aws.runtime-sagemaker.-2017-05-13/status-code (clojure.spec.alpha/and clojure.core/int?))

(clojure.spec.alpha/def :portkey.aws.runtime-sagemaker.-2017-05-13/header (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__30633__auto__] (clojure.core/< (clojure.core/count s__30633__auto__) 1024))))

(clojure.spec.alpha/def :portkey.aws.runtime-sagemaker.-2017-05-13/endpoint-name (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__30633__auto__] (clojure.core/< (clojure.core/count s__30633__auto__) 63)) (clojure.core/fn [s__30634__auto__] (clojure.core/re-matches #"^[a-zA-Z0-9](-*[a-zA-Z0-9])*" s__30634__auto__))))

(clojure.spec.alpha/def :portkey.aws.runtime-sagemaker.-2017-05-13/service-unavailable (portkey.aws/json-keys :req-un [] :opt-un [:portkey.aws.runtime-sagemaker.-2017-05-13/Message] :locations {}))

(clojure.spec.alpha/def :portkey.aws.runtime-sagemaker.-2017-05-13.model-error/original-status-code (clojure.spec.alpha/and :portkey.aws.runtime-sagemaker.-2017-05-13/status-code))
(clojure.spec.alpha/def :portkey.aws.runtime-sagemaker.-2017-05-13.model-error/original-message (clojure.spec.alpha/and :portkey.aws.runtime-sagemaker.-2017-05-13/message))
(clojure.spec.alpha/def :portkey.aws.runtime-sagemaker.-2017-05-13/model-error (portkey.aws/json-keys :req-un [] :opt-un [:portkey.aws.runtime-sagemaker.-2017-05-13/Message :portkey.aws.runtime-sagemaker.-2017-05-13.model-error/OriginalStatusCode :portkey.aws.runtime-sagemaker.-2017-05-13.model-error/OriginalMessage :portkey.aws.runtime-sagemaker.-2017-05-13/LogStreamArn] :locations {}))

(clojure.spec.alpha/def :portkey.aws.runtime-sagemaker.-2017-05-13/body-blob (clojure.spec.alpha/and clojure.core/bytes? (clojure.spec.alpha/conformer portkey.aws/base64-encode portkey.aws/base64-decode)))

(clojure.spec.alpha/def :portkey.aws.runtime-sagemaker.-2017-05-13/message (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__30633__auto__] (clojure.core/< (clojure.core/count s__30633__auto__) 2048))))

(clojure.spec.alpha/def :portkey.aws.runtime-sagemaker.-2017-05-13/internal-failure (portkey.aws/json-keys :req-un [] :opt-un [:portkey.aws.runtime-sagemaker.-2017-05-13/Message] :locations {}))

(clojure.spec.alpha/def :portkey.aws.runtime-sagemaker.-2017-05-13.invoke-endpoint-input/body (clojure.spec.alpha/and :portkey.aws.runtime-sagemaker.-2017-05-13/body-blob))
(clojure.spec.alpha/def :portkey.aws.runtime-sagemaker.-2017-05-13.invoke-endpoint-input/content-type (clojure.spec.alpha/and :portkey.aws.runtime-sagemaker.-2017-05-13/header))
(clojure.spec.alpha/def :portkey.aws.runtime-sagemaker.-2017-05-13.invoke-endpoint-input/accept (clojure.spec.alpha/and :portkey.aws.runtime-sagemaker.-2017-05-13/header))
(clojure.spec.alpha/def :portkey.aws.runtime-sagemaker.-2017-05-13/invoke-endpoint-input (portkey.aws/json-keys :req-un [:portkey.aws.runtime-sagemaker.-2017-05-13/EndpointName :portkey.aws.runtime-sagemaker.-2017-05-13.invoke-endpoint-input/Body] :opt-un [:portkey.aws.runtime-sagemaker.-2017-05-13.invoke-endpoint-input/ContentType :portkey.aws.runtime-sagemaker.-2017-05-13.invoke-endpoint-input/Accept] :locations {}))

(clojure.spec.alpha/def :portkey.aws.runtime-sagemaker.-2017-05-13/log-stream-arn (clojure.spec.alpha/and clojure.core/string?))

(clojure.core/defn invoke-endpoint ([invoke-endpoint-input] (portkey.aws/-rest-json-call portkey.aws.runtime-sagemaker.-2017-05-13/endpoints "POST" "/endpoints/{EndpointName}/invocations" invoke-endpoint-input :portkey.aws.runtime-sagemaker.-2017-05-13/invoke-endpoint-input {:payload "Body", :move {}, :headers {"ContentType" ["Content-Type" nil], "Accept" ["Accept" nil]}, :uri {"EndpointName" "EndpointName"}, :querystring {}} nil :portkey.aws.runtime-sagemaker.-2017-05-13/invoke-endpoint-output {"InternalFailure" :portkey.aws.runtime-sagemaker.-2017-05-13/internal-failure, "ServiceUnavailable" :portkey.aws.runtime-sagemaker.-2017-05-13/service-unavailable, "ValidationError" :portkey.aws.runtime-sagemaker.-2017-05-13/validation-error, "ModelError" :portkey.aws.runtime-sagemaker.-2017-05-13/model-error})))
(clojure.spec.alpha/fdef invoke-endpoint :args (clojure.spec.alpha/tuple :portkey.aws.runtime-sagemaker.-2017-05-13/invoke-endpoint-input) :ret (clojure.spec.alpha/and :portkey.aws.runtime-sagemaker.-2017-05-13/invoke-endpoint-output))
