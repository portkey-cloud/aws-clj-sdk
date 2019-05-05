(ns portkey.aws.runtime-sagemaker (:require [portkey.aws]))

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
   "ap-southeast-1"
   {:credential-scope
    {:service "runtime.sagemaker", :region "ap-southeast-1"},
    :ssl-common-name "runtime.sagemaker.ap-southeast-1.amazonaws.com",
    :endpoint "https://runtime.sagemaker.ap-southeast-1.amazonaws.com",
    :signature-version :v4},
   "ap-northeast-2"
   {:credential-scope
    {:service "runtime.sagemaker", :region "ap-northeast-2"},
    :ssl-common-name "runtime.sagemaker.ap-northeast-2.amazonaws.com",
    :endpoint "https://runtime.sagemaker.ap-northeast-2.amazonaws.com",
    :signature-version :v4},
   "ca-central-1"
   {:credential-scope
    {:service "runtime.sagemaker", :region "ca-central-1"},
    :ssl-common-name "runtime.sagemaker.ca-central-1.amazonaws.com",
    :endpoint "https://runtime.sagemaker.ca-central-1.amazonaws.com",
    :signature-version :v4},
   "eu-central-1"
   {:credential-scope
    {:service "runtime.sagemaker", :region "eu-central-1"},
    :ssl-common-name "runtime.sagemaker.eu-central-1.amazonaws.com",
    :endpoint "https://runtime.sagemaker.eu-central-1.amazonaws.com",
    :signature-version :v4},
   "eu-west-2"
   {:credential-scope
    {:service "runtime.sagemaker", :region "eu-west-2"},
    :ssl-common-name "runtime.sagemaker.eu-west-2.amazonaws.com",
    :endpoint "https://runtime.sagemaker.eu-west-2.amazonaws.com",
    :signature-version :v4},
   "us-gov-west-1"
   {:credential-scope
    {:service "runtime.sagemaker", :region "us-gov-west-1"},
    :ssl-common-name "runtime.sagemaker.us-gov-west-1.amazonaws.com",
    :endpoint "https://runtime.sagemaker.us-gov-west-1.amazonaws.com",
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
    :signature-version :v4},
   "us-west-1"
   {:credential-scope
    {:service "runtime.sagemaker", :region "us-west-1"},
    :ssl-common-name "runtime.sagemaker.us-west-1.amazonaws.com",
    :endpoint "https://runtime.sagemaker.us-west-1.amazonaws.com",
    :signature-version :v4},
   "ap-south-1"
   {:credential-scope
    {:service "runtime.sagemaker", :region "ap-south-1"},
    :ssl-common-name "runtime.sagemaker.ap-south-1.amazonaws.com",
    :endpoint "https://runtime.sagemaker.ap-south-1.amazonaws.com",
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

(clojure.core/declare deser-status-code)

(clojure.core/declare deser-custom-attributes-header)

(clojure.core/declare deser-header)

(clojure.core/declare deser-body-blob)

(clojure.core/declare deser-message)

(clojure.core/declare deser-log-stream-arn)

(clojure.core/defn- deser-status-code [input] input)

(clojure.core/defn- deser-custom-attributes-header [input] input)

(clojure.core/defn- deser-header [input] input)

(clojure.core/defn- deser-body-blob [input] (portkey.aws/base64-decode input))

(clojure.core/defn- deser-message [input] input)

(clojure.core/defn- deser-log-stream-arn [input] input)

(clojure.core/defn- response-invoke-endpoint-output ([input] (response-invoke-endpoint-output nil input)) ([resultWrapper1444941 input] (clojure.core/let [rawinput1444940 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar1444942 {"Body" (rawinput1444940 "Body"), "Content-Type" (clojure.core/get-in input [:headers "Content-Type"]), "x-Amzn-Invoked-Production-Variant" (clojure.core/get-in input [:headers "x-Amzn-Invoked-Production-Variant"]), "X-Amzn-SageMaker-Custom-Attributes" (clojure.core/get-in input [:headers "X-Amzn-SageMaker-Custom-Attributes"])}] (clojure.core/cond-> {:body (deser-body-blob (clojure.core/get-in letvar1444942 ["Body"]))} (letvar1444942 "Content-Type") (clojure.core/assoc :content-type (deser-header (clojure.core/get-in letvar1444942 ["Content-Type"]))) (letvar1444942 "x-Amzn-Invoked-Production-Variant") (clojure.core/assoc :invoked-production-variant (deser-header (clojure.core/get-in letvar1444942 ["x-Amzn-Invoked-Production-Variant"]))) (letvar1444942 "X-Amzn-SageMaker-Custom-Attributes") (clojure.core/assoc :custom-attributes (deser-custom-attributes-header (clojure.core/get-in letvar1444942 ["X-Amzn-SageMaker-Custom-Attributes"])))))))

(clojure.core/defn- response-validation-error ([input] (response-validation-error nil input)) ([resultWrapper1444944 input] (clojure.core/let [rawinput1444943 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar1444945 {"Message" (rawinput1444943 "Message")}] (clojure.core/cond-> {} (letvar1444945 "Message") (clojure.core/assoc :message (deser-message (clojure.core/get-in letvar1444945 ["Message"])))))))

(clojure.core/defn- response-service-unavailable ([input] (response-service-unavailable nil input)) ([resultWrapper1444947 input] (clojure.core/let [rawinput1444946 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar1444948 {"Message" (rawinput1444946 "Message")}] (clojure.core/cond-> {} (letvar1444948 "Message") (clojure.core/assoc :message (deser-message (clojure.core/get-in letvar1444948 ["Message"])))))))

(clojure.core/defn- response-model-error ([input] (response-model-error nil input)) ([resultWrapper1444950 input] (clojure.core/let [rawinput1444949 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar1444951 {"Message" (rawinput1444949 "Message"), "OriginalStatusCode" (rawinput1444949 "OriginalStatusCode"), "OriginalMessage" (rawinput1444949 "OriginalMessage"), "LogStreamArn" (rawinput1444949 "LogStreamArn")}] (clojure.core/cond-> {} (letvar1444951 "Message") (clojure.core/assoc :message (deser-message (clojure.core/get-in letvar1444951 ["Message"]))) (letvar1444951 "OriginalStatusCode") (clojure.core/assoc :original-status-code (deser-status-code (clojure.core/get-in letvar1444951 ["OriginalStatusCode"]))) (letvar1444951 "OriginalMessage") (clojure.core/assoc :original-message (deser-message (clojure.core/get-in letvar1444951 ["OriginalMessage"]))) (letvar1444951 "LogStreamArn") (clojure.core/assoc :log-stream-arn (deser-log-stream-arn (clojure.core/get-in letvar1444951 ["LogStreamArn"])))))))

(clojure.core/defn- response-internal-failure ([input] (response-internal-failure nil input)) ([resultWrapper1444953 input] (clojure.core/let [rawinput1444952 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar1444954 {"Message" (rawinput1444952 "Message")}] (clojure.core/cond-> {} (letvar1444954 "Message") (clojure.core/assoc :message (deser-message (clojure.core/get-in letvar1444954 ["Message"])))))))

(clojure.spec.alpha/def :portkey.aws.runtime-sagemaker.invoke-endpoint-output/body (clojure.spec.alpha/and :portkey.aws.runtime-sagemaker/body-blob))
(clojure.spec.alpha/def :portkey.aws.runtime-sagemaker.invoke-endpoint-output/content-type (clojure.spec.alpha/and :portkey.aws.runtime-sagemaker/header))
(clojure.spec.alpha/def :portkey.aws.runtime-sagemaker.invoke-endpoint-output/invoked-production-variant (clojure.spec.alpha/and :portkey.aws.runtime-sagemaker/header))
(clojure.spec.alpha/def :portkey.aws.runtime-sagemaker.invoke-endpoint-output/custom-attributes (clojure.spec.alpha/and :portkey.aws.runtime-sagemaker/custom-attributes-header))
(clojure.spec.alpha/def :portkey.aws.runtime-sagemaker/invoke-endpoint-output (clojure.spec.alpha/keys :req-un [:portkey.aws.runtime-sagemaker.invoke-endpoint-output/body] :opt-un [:portkey.aws.runtime-sagemaker.invoke-endpoint-output/content-type :portkey.aws.runtime-sagemaker.invoke-endpoint-output/invoked-production-variant :portkey.aws.runtime-sagemaker.invoke-endpoint-output/custom-attributes]))

(clojure.spec.alpha/def :portkey.aws.runtime-sagemaker/validation-error (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.runtime-sagemaker/message]))

(clojure.spec.alpha/def :portkey.aws.runtime-sagemaker/status-code clojure.core/int?)

(clojure.spec.alpha/def :portkey.aws.runtime-sagemaker/custom-attributes-header (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__1012853__auto__] (clojure.core/< (clojure.core/count s__1012853__auto__) 1024))))

(clojure.spec.alpha/def :portkey.aws.runtime-sagemaker/header (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__1012853__auto__] (clojure.core/< (clojure.core/count s__1012853__auto__) 1024))))

(clojure.spec.alpha/def :portkey.aws.runtime-sagemaker/endpoint-name (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__1012853__auto__] (clojure.core/< (clojure.core/count s__1012853__auto__) 63)) (clojure.core/fn [s__1012854__auto__] (clojure.core/re-matches #"^[a-zA-Z0-9](-*[a-zA-Z0-9])*" s__1012854__auto__))))

(clojure.spec.alpha/def :portkey.aws.runtime-sagemaker/service-unavailable (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.runtime-sagemaker/message]))

(clojure.spec.alpha/def :portkey.aws.runtime-sagemaker.model-error/original-status-code (clojure.spec.alpha/and :portkey.aws.runtime-sagemaker/status-code))
(clojure.spec.alpha/def :portkey.aws.runtime-sagemaker.model-error/original-message (clojure.spec.alpha/and :portkey.aws.runtime-sagemaker/message))
(clojure.spec.alpha/def :portkey.aws.runtime-sagemaker/model-error (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.runtime-sagemaker/message :portkey.aws.runtime-sagemaker.model-error/original-status-code :portkey.aws.runtime-sagemaker.model-error/original-message :portkey.aws.runtime-sagemaker/log-stream-arn]))

(clojure.spec.alpha/def :portkey.aws.runtime-sagemaker/body-blob clojure.core/bytes?)

(clojure.spec.alpha/def :portkey.aws.runtime-sagemaker/message (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__1012853__auto__] (clojure.core/< (clojure.core/count s__1012853__auto__) 2048))))

(clojure.spec.alpha/def :portkey.aws.runtime-sagemaker/internal-failure (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.runtime-sagemaker/message]))

(clojure.spec.alpha/def :portkey.aws.runtime-sagemaker.invoke-endpoint-input/body (clojure.spec.alpha/and :portkey.aws.runtime-sagemaker/body-blob))
(clojure.spec.alpha/def :portkey.aws.runtime-sagemaker.invoke-endpoint-input/content-type (clojure.spec.alpha/and :portkey.aws.runtime-sagemaker/header))
(clojure.spec.alpha/def :portkey.aws.runtime-sagemaker.invoke-endpoint-input/accept (clojure.spec.alpha/and :portkey.aws.runtime-sagemaker/header))
(clojure.spec.alpha/def :portkey.aws.runtime-sagemaker.invoke-endpoint-input/custom-attributes (clojure.spec.alpha/and :portkey.aws.runtime-sagemaker/custom-attributes-header))
(clojure.spec.alpha/def :portkey.aws.runtime-sagemaker/invoke-endpoint-input (clojure.spec.alpha/keys :req-un [:portkey.aws.runtime-sagemaker/endpoint-name :portkey.aws.runtime-sagemaker.invoke-endpoint-input/body] :opt-un [:portkey.aws.runtime-sagemaker.invoke-endpoint-input/content-type :portkey.aws.runtime-sagemaker.invoke-endpoint-input/accept :portkey.aws.runtime-sagemaker.invoke-endpoint-input/custom-attributes]))

(clojure.spec.alpha/def :portkey.aws.runtime-sagemaker/log-stream-arn (clojure.spec.alpha/and clojure.core/string?))

(clojure.core/defn invoke-endpoint ([invoke-endpoint-inputinput] (clojure.core/let [request-function-result__1013884__auto__ (req-invoke-endpoint-input invoke-endpoint-inputinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__1013884__auto__ {:http.request.configuration/endpoints portkey.aws.runtime-sagemaker/endpoints, :http.request.configuration/target-prefix nil, :http.request.spec/output-spec :portkey.aws.runtime-sagemaker/invoke-endpoint-output, :http.request.configuration/mime-type {"content-type" "application/json"}, :http.request.configuration/request-uri "/endpoints/{EndpointName}/invocations", :http.request.configuration/version "2017-05-13", :http.request.configuration/service-id "SageMaker Runtime", :http.request.spec/input-spec :portkey.aws.runtime-sagemaker/invoke-endpoint-input, :http.request.configuration/protocol "rest-json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "InvokeEndpoint", :http.request.configuration/output-deser-fn response-invoke-endpoint-output, :http.request.spec/error-spec {"InternalFailure" :portkey.aws.runtime-sagemaker/internal-failure, "ServiceUnavailable" :portkey.aws.runtime-sagemaker/service-unavailable, "ValidationError" :portkey.aws.runtime-sagemaker/validation-error, "ModelError" :portkey.aws.runtime-sagemaker/model-error}})))))
(clojure.spec.alpha/fdef invoke-endpoint :args (clojure.spec.alpha/tuple :portkey.aws.runtime-sagemaker/invoke-endpoint-input) :ret (clojure.spec.alpha/and :portkey.aws.runtime-sagemaker/invoke-endpoint-output))
