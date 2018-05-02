(ns portkey.aws.runtime-sagemaker (:require [portkey.aws]))

(def endpoints 'nil)

(clojure.spec.alpha/def :portkey.aws.runtime-sagemaker.invoke-endpoint-output/body (clojure.spec.alpha/and :portkey.aws.runtime-sagemaker/body-blob))
(clojure.spec.alpha/def :portkey.aws.runtime-sagemaker.invoke-endpoint-output/content-type (clojure.spec.alpha/and :portkey.aws.runtime-sagemaker/header))
(clojure.spec.alpha/def :portkey.aws.runtime-sagemaker.invoke-endpoint-output/invoked-production-variant (clojure.spec.alpha/and :portkey.aws.runtime-sagemaker/header))
(clojure.spec.alpha/def :portkey.aws.runtime-sagemaker/invoke-endpoint-output (portkey.aws/json-keys :req-un [:portkey.aws.runtime-sagemaker.invoke-endpoint-output/Body] :opt-un [:portkey.aws.runtime-sagemaker.invoke-endpoint-output/ContentType :portkey.aws.runtime-sagemaker.invoke-endpoint-output/InvokedProductionVariant] :locations {}))

(clojure.spec.alpha/def :portkey.aws.runtime-sagemaker/validation-error (portkey.aws/json-keys :req-un [] :opt-un [:portkey.aws.runtime-sagemaker/Message] :locations {}))

(clojure.spec.alpha/def :portkey.aws.runtime-sagemaker/status-code (clojure.spec.alpha/and clojure.core/int?))

(clojure.spec.alpha/def :portkey.aws.runtime-sagemaker/header (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__13962__auto__] (clojure.core/< (clojure.core/count s__13962__auto__) 1024))))

(clojure.spec.alpha/def :portkey.aws.runtime-sagemaker/endpoint-name (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__13962__auto__] (clojure.core/< (clojure.core/count s__13962__auto__) 63)) (clojure.core/fn [s__13963__auto__] (clojure.core/re-matches #"^[a-zA-Z0-9](-*[a-zA-Z0-9])*" s__13963__auto__))))

(clojure.spec.alpha/def :portkey.aws.runtime-sagemaker/service-unavailable (portkey.aws/json-keys :req-un [] :opt-un [:portkey.aws.runtime-sagemaker/Message] :locations {}))

(clojure.spec.alpha/def :portkey.aws.runtime-sagemaker.model-error/original-status-code (clojure.spec.alpha/and :portkey.aws.runtime-sagemaker/status-code))
(clojure.spec.alpha/def :portkey.aws.runtime-sagemaker.model-error/original-message (clojure.spec.alpha/and :portkey.aws.runtime-sagemaker/message))
(clojure.spec.alpha/def :portkey.aws.runtime-sagemaker/model-error (portkey.aws/json-keys :req-un [] :opt-un [:portkey.aws.runtime-sagemaker/Message :portkey.aws.runtime-sagemaker.model-error/OriginalStatusCode :portkey.aws.runtime-sagemaker.model-error/OriginalMessage :portkey.aws.runtime-sagemaker/LogStreamArn] :locations {}))

(clojure.spec.alpha/def :portkey.aws.runtime-sagemaker/body-blob (clojure.spec.alpha/and clojure.core/bytes? (clojure.spec.alpha/conformer portkey.aws/base64-encode portkey.aws/base64-decode)))

(clojure.spec.alpha/def :portkey.aws.runtime-sagemaker/message (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__13962__auto__] (clojure.core/< (clojure.core/count s__13962__auto__) 2048))))

(clojure.spec.alpha/def :portkey.aws.runtime-sagemaker/internal-failure (portkey.aws/json-keys :req-un [] :opt-un [:portkey.aws.runtime-sagemaker/Message] :locations {}))

(clojure.spec.alpha/def :portkey.aws.runtime-sagemaker.invoke-endpoint-input/body (clojure.spec.alpha/and :portkey.aws.runtime-sagemaker/body-blob))
(clojure.spec.alpha/def :portkey.aws.runtime-sagemaker.invoke-endpoint-input/content-type (clojure.spec.alpha/and :portkey.aws.runtime-sagemaker/header))
(clojure.spec.alpha/def :portkey.aws.runtime-sagemaker.invoke-endpoint-input/accept (clojure.spec.alpha/and :portkey.aws.runtime-sagemaker/header))
(clojure.spec.alpha/def :portkey.aws.runtime-sagemaker/invoke-endpoint-input (portkey.aws/json-keys :req-un [:portkey.aws.runtime-sagemaker/EndpointName :portkey.aws.runtime-sagemaker.invoke-endpoint-input/Body] :opt-un [:portkey.aws.runtime-sagemaker.invoke-endpoint-input/ContentType :portkey.aws.runtime-sagemaker.invoke-endpoint-input/Accept] :locations {}))

(clojure.spec.alpha/def :portkey.aws.runtime-sagemaker/log-stream-arn (clojure.spec.alpha/and clojure.core/string?))

(clojure.core/defn invoke-endpoint ([invoke-endpoint-input] (portkey.aws/-rest-json-call portkey.aws.runtime-sagemaker/endpoints "POST" "/endpoints/{EndpointName}/invocations" invoke-endpoint-input :portkey.aws.runtime-sagemaker/invoke-endpoint-input {:payload "Body", :move {}, :headers {"ContentType" ["Content-Type" nil], "Accept" ["Accept" nil]}, :uri {"EndpointName" "EndpointName"}, :querystring {}} nil :portkey.aws.runtime-sagemaker/invoke-endpoint-output {"InternalFailure" :portkey.aws.runtime-sagemaker/internal-failure, "ServiceUnavailable" :portkey.aws.runtime-sagemaker/service-unavailable, "ValidationError" :portkey.aws.runtime-sagemaker/validation-error, "ModelError" :portkey.aws.runtime-sagemaker/model-error})))
(clojure.spec.alpha/fdef invoke-endpoint :args (clojure.spec.alpha/tuple :portkey.aws.runtime-sagemaker/invoke-endpoint-input) :ret (clojure.spec.alpha/and :portkey.aws.runtime-sagemaker/invoke-endpoint-output))
