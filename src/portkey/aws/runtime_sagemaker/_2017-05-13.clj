(ns portkey.aws.runtime-sagemaker.-2017-05-13 (:require [portkey.aws]))

(def
 endpoints
 '{"ap-northeast-1"
   {:credential-scope
    {:service "runtime.sagemaker", :region "ap-northeast-1"},
    :ssl-common-name "runtime.sagemaker.ap-northeast-1.amazonaws.com",
    :endpoint "https://runtime.sagemaker.ap-northeast-1.amazonaws.com",
    :signature-version :v4},
   "eu-west-1"
   {:credential-scope
    {:service "runtime.sagemaker", :region "eu-west-1"},
    :ssl-common-name "runtime.sagemaker.eu-west-1.amazonaws.com",
    :endpoint "https://runtime.sagemaker.eu-west-1.amazonaws.com",
    :signature-version :v4},
   "us-east-2"
   {:credential-scope
    {:service "runtime.sagemaker", :region "us-east-2"},
    :ssl-common-name "runtime.sagemaker.us-east-2.amazonaws.com",
    :endpoint "https://runtime.sagemaker.us-east-2.amazonaws.com",
    :signature-version :v4},
   "ap-southeast-2"
   {:credential-scope
    {:service "runtime.sagemaker", :region "ap-southeast-2"},
    :ssl-common-name "runtime.sagemaker.ap-southeast-2.amazonaws.com",
    :endpoint "https://runtime.sagemaker.ap-southeast-2.amazonaws.com",
    :signature-version :v4},
   "ap-northeast-2"
   {:credential-scope
    {:service "runtime.sagemaker", :region "ap-northeast-2"},
    :ssl-common-name "runtime.sagemaker.ap-northeast-2.amazonaws.com",
    :endpoint "https://runtime.sagemaker.ap-northeast-2.amazonaws.com",
    :signature-version :v4},
   "eu-central-1"
   {:credential-scope
    {:service "runtime.sagemaker", :region "eu-central-1"},
    :ssl-common-name "runtime.sagemaker.eu-central-1.amazonaws.com",
    :endpoint "https://runtime.sagemaker.eu-central-1.amazonaws.com",
    :signature-version :v4},
   "us-west-2"
   {:credential-scope
    {:service "runtime.sagemaker", :region "us-west-2"},
    :ssl-common-name "runtime.sagemaker.us-west-2.amazonaws.com",
    :endpoint "https://runtime.sagemaker.us-west-2.amazonaws.com",
    :signature-version :v4},
   "us-east-1"
   {:credential-scope
    {:service "runtime.sagemaker", :region "us-east-1"},
    :ssl-common-name "runtime.sagemaker.us-east-1.amazonaws.com",
    :endpoint "https://runtime.sagemaker.us-east-1.amazonaws.com",
    :signature-version :v4}})

(clojure.core/declare ser-custom-attributes-header)

(clojure.core/declare ser-header)

(clojure.core/declare ser-endpoint-name)

(clojure.core/declare ser-body-blob)

(clojure.core/defn- ser-custom-attributes-header [input] #:http.request.field{:value input, :shape "CustomAttributesHeader"})

(clojure.core/defn- ser-header [input] #:http.request.field{:value input, :shape "Header"})

(clojure.core/defn- ser-endpoint-name [input] #:http.request.field{:value input, :shape "EndpointName"})

(clojure.core/defn- ser-body-blob [input] #:http.request.field{:value (portkey.aws/base64-encode input), :shape "BodyBlob"})

(clojure.core/defn- req-invoke-endpoint-input [input] (clojure.core/cond-> #:http.request.configuration{:uri [(clojure.core/into (ser-endpoint-name (input :endpoint-name)) #:http.request.field{:name "EndpointName", :shape "EndpointName", :location "uri", :location-name "EndpointName"})], :body [(clojure.core/into (ser-body-blob (input :body)) #:http.request.field{:name "Body", :shape "BodyBlob"})]} (clojure.core/contains? input :content-type) (clojure.core/update-in [:http.request.configuration/header] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-header (input :content-type)) #:http.request.field{:name "ContentType", :shape "Header", :location "header", :location-name "Content-Type"})) (clojure.core/contains? input :accept) (clojure.core/update-in [:http.request.configuration/header] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-header (input :accept)) #:http.request.field{:name "Accept", :shape "Header", :location "header", :location-name "Accept"})) (clojure.core/contains? input :custom-attributes) (clojure.core/update-in [:http.request.configuration/header] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-custom-attributes-header (input :custom-attributes)) #:http.request.field{:name "CustomAttributes", :shape "CustomAttributesHeader", :location "header", :location-name "X-Amzn-SageMaker-Custom-Attributes"}))))

(clojure.spec.alpha/def :portkey.aws.runtime-sagemaker.-2017-05-13.invoke-endpoint-output/body (clojure.spec.alpha/and :portkey.aws.runtime-sagemaker.-2017-05-13/body-blob))
(clojure.spec.alpha/def :portkey.aws.runtime-sagemaker.-2017-05-13.invoke-endpoint-output/content-type (clojure.spec.alpha/and :portkey.aws.runtime-sagemaker.-2017-05-13/header))
(clojure.spec.alpha/def :portkey.aws.runtime-sagemaker.-2017-05-13.invoke-endpoint-output/invoked-production-variant (clojure.spec.alpha/and :portkey.aws.runtime-sagemaker.-2017-05-13/header))
(clojure.spec.alpha/def :portkey.aws.runtime-sagemaker.-2017-05-13.invoke-endpoint-output/custom-attributes (clojure.spec.alpha/and :portkey.aws.runtime-sagemaker.-2017-05-13/custom-attributes-header))
(clojure.spec.alpha/def :portkey.aws.runtime-sagemaker.-2017-05-13/invoke-endpoint-output (clojure.spec.alpha/keys :req-un [:portkey.aws.runtime-sagemaker.-2017-05-13.invoke-endpoint-output/body] :opt-un [:portkey.aws.runtime-sagemaker.-2017-05-13.invoke-endpoint-output/content-type :portkey.aws.runtime-sagemaker.-2017-05-13.invoke-endpoint-output/invoked-production-variant :portkey.aws.runtime-sagemaker.-2017-05-13.invoke-endpoint-output/custom-attributes]))

(clojure.spec.alpha/def :portkey.aws.runtime-sagemaker.-2017-05-13/validation-error (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.runtime-sagemaker.-2017-05-13/message]))

(clojure.spec.alpha/def :portkey.aws.runtime-sagemaker.-2017-05-13/status-code clojure.core/int?)

(clojure.spec.alpha/def :portkey.aws.runtime-sagemaker.-2017-05-13/custom-attributes-header (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__42948__auto__] (clojure.core/< (clojure.core/count s__42948__auto__) 1024))))

(clojure.spec.alpha/def :portkey.aws.runtime-sagemaker.-2017-05-13/header (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__42948__auto__] (clojure.core/< (clojure.core/count s__42948__auto__) 1024))))

(clojure.spec.alpha/def :portkey.aws.runtime-sagemaker.-2017-05-13/endpoint-name (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__42948__auto__] (clojure.core/< (clojure.core/count s__42948__auto__) 63)) (clojure.core/fn [s__42949__auto__] (clojure.core/re-matches #"^[a-zA-Z0-9](-*[a-zA-Z0-9])*" s__42949__auto__))))

(clojure.spec.alpha/def :portkey.aws.runtime-sagemaker.-2017-05-13/service-unavailable (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.runtime-sagemaker.-2017-05-13/message]))

(clojure.spec.alpha/def :portkey.aws.runtime-sagemaker.-2017-05-13.model-error/original-status-code (clojure.spec.alpha/and :portkey.aws.runtime-sagemaker.-2017-05-13/status-code))
(clojure.spec.alpha/def :portkey.aws.runtime-sagemaker.-2017-05-13.model-error/original-message (clojure.spec.alpha/and :portkey.aws.runtime-sagemaker.-2017-05-13/message))
(clojure.spec.alpha/def :portkey.aws.runtime-sagemaker.-2017-05-13/model-error (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.runtime-sagemaker.-2017-05-13/message :portkey.aws.runtime-sagemaker.-2017-05-13.model-error/original-status-code :portkey.aws.runtime-sagemaker.-2017-05-13.model-error/original-message :portkey.aws.runtime-sagemaker.-2017-05-13/log-stream-arn]))

(clojure.spec.alpha/def :portkey.aws.runtime-sagemaker.-2017-05-13/body-blob clojure.core/bytes?)

(clojure.spec.alpha/def :portkey.aws.runtime-sagemaker.-2017-05-13/message (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__42948__auto__] (clojure.core/< (clojure.core/count s__42948__auto__) 2048))))

(clojure.spec.alpha/def :portkey.aws.runtime-sagemaker.-2017-05-13/internal-failure (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.runtime-sagemaker.-2017-05-13/message]))

(clojure.spec.alpha/def :portkey.aws.runtime-sagemaker.-2017-05-13.invoke-endpoint-input/body (clojure.spec.alpha/and :portkey.aws.runtime-sagemaker.-2017-05-13/body-blob))
(clojure.spec.alpha/def :portkey.aws.runtime-sagemaker.-2017-05-13.invoke-endpoint-input/content-type (clojure.spec.alpha/and :portkey.aws.runtime-sagemaker.-2017-05-13/header))
(clojure.spec.alpha/def :portkey.aws.runtime-sagemaker.-2017-05-13.invoke-endpoint-input/accept (clojure.spec.alpha/and :portkey.aws.runtime-sagemaker.-2017-05-13/header))
(clojure.spec.alpha/def :portkey.aws.runtime-sagemaker.-2017-05-13.invoke-endpoint-input/custom-attributes (clojure.spec.alpha/and :portkey.aws.runtime-sagemaker.-2017-05-13/custom-attributes-header))
(clojure.spec.alpha/def :portkey.aws.runtime-sagemaker.-2017-05-13/invoke-endpoint-input (clojure.spec.alpha/keys :req-un [:portkey.aws.runtime-sagemaker.-2017-05-13/endpoint-name :portkey.aws.runtime-sagemaker.-2017-05-13.invoke-endpoint-input/body] :opt-un [:portkey.aws.runtime-sagemaker.-2017-05-13.invoke-endpoint-input/content-type :portkey.aws.runtime-sagemaker.-2017-05-13.invoke-endpoint-input/accept :portkey.aws.runtime-sagemaker.-2017-05-13.invoke-endpoint-input/custom-attributes]))

(clojure.spec.alpha/def :portkey.aws.runtime-sagemaker.-2017-05-13/log-stream-arn (clojure.spec.alpha/and clojure.core/string?))

(clojure.core/defn invoke-endpoint ([invoke-endpoint-inputinput] (clojure.core/let [request-function-result__43533__auto__ (req-invoke-endpoint-input invoke-endpoint-inputinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__43533__auto__ {:http.request.configuration/endpoints portkey.aws.runtime-sagemaker.-2017-05-13/endpoints, :http.request.spec/output-spec :portkey.aws.runtime-sagemaker.-2017-05-13/invoke-endpoint-output, :http.request.configuration/mime-type {"content-type" "application/json"}, :http.request.configuration/request-uri "/endpoints/{EndpointName}/invocations", :http.request.configuration/version "2017-05-13", :http.request.configuration/service-id "SageMaker Runtime", :http.request.spec/input-spec :portkey.aws.runtime-sagemaker.-2017-05-13/invoke-endpoint-input, :http.request.configuration/protocol "rest-json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/action "InvokeEndpoint", :http.request.spec/error-spec {"InternalFailure" :portkey.aws.runtime-sagemaker.-2017-05-13/internal-failure, "ServiceUnavailable" :portkey.aws.runtime-sagemaker.-2017-05-13/service-unavailable, "ValidationError" :portkey.aws.runtime-sagemaker.-2017-05-13/validation-error, "ModelError" :portkey.aws.runtime-sagemaker.-2017-05-13/model-error}})))))
(clojure.spec.alpha/fdef invoke-endpoint :args (clojure.spec.alpha/tuple :portkey.aws.runtime-sagemaker.-2017-05-13/invoke-endpoint-input) :ret (clojure.spec.alpha/and :portkey.aws.runtime-sagemaker.-2017-05-13/invoke-endpoint-output))
