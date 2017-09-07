(ns portkey.aws.lambda.-2014-11-11 (:require [portkey.aws]))

(def
 endpoints
 '{"ap-northeast-1"
   {:credentialScope {"service" "lambda", "region" "ap-northeast-1"},
    :sslCommonName "lambda.ap-northeast-1.amazonaws.com",
    :endpoint "https://lambda.ap-northeast-1.amazonaws.com"},
   "eu-west-1"
   {:credentialScope {"service" "lambda", "region" "eu-west-1"},
    :sslCommonName "lambda.eu-west-1.amazonaws.com",
    :endpoint "https://lambda.eu-west-1.amazonaws.com"},
   "us-east-2"
   {:credentialScope {"service" "lambda", "region" "us-east-2"},
    :sslCommonName "lambda.us-east-2.amazonaws.com",
    :endpoint "https://lambda.us-east-2.amazonaws.com"},
   "ap-southeast-2"
   {:credentialScope {"service" "lambda", "region" "ap-southeast-2"},
    :sslCommonName "lambda.ap-southeast-2.amazonaws.com",
    :endpoint "https://lambda.ap-southeast-2.amazonaws.com"},
   "sa-east-1"
   {:credentialScope {"service" "lambda", "region" "sa-east-1"},
    :sslCommonName "lambda.sa-east-1.amazonaws.com",
    :endpoint "https://lambda.sa-east-1.amazonaws.com"},
   "ap-southeast-1"
   {:credentialScope {"service" "lambda", "region" "ap-southeast-1"},
    :sslCommonName "lambda.ap-southeast-1.amazonaws.com",
    :endpoint "https://lambda.ap-southeast-1.amazonaws.com"},
   "ap-northeast-2"
   {:credentialScope {"service" "lambda", "region" "ap-northeast-2"},
    :sslCommonName "lambda.ap-northeast-2.amazonaws.com",
    :endpoint "https://lambda.ap-northeast-2.amazonaws.com"},
   "ca-central-1"
   {:credentialScope {"service" "lambda", "region" "ca-central-1"},
    :sslCommonName "lambda.ca-central-1.amazonaws.com",
    :endpoint "https://lambda.ca-central-1.amazonaws.com"},
   "eu-central-1"
   {:credentialScope {"service" "lambda", "region" "eu-central-1"},
    :sslCommonName "lambda.eu-central-1.amazonaws.com",
    :endpoint "https://lambda.eu-central-1.amazonaws.com"},
   "eu-west-2"
   {:credentialScope {"service" "lambda", "region" "eu-west-2"},
    :sslCommonName "lambda.eu-west-2.amazonaws.com",
    :endpoint "https://lambda.eu-west-2.amazonaws.com"},
   "us-gov-west-1"
   {:credentialScope {"service" "lambda", "region" "us-gov-west-1"},
    :sslCommonName "lambda.us-gov-west-1.amazonaws.com",
    :endpoint "https://lambda.us-gov-west-1.amazonaws.com"},
   "us-west-2"
   {:credentialScope {"service" "lambda", "region" "us-west-2"},
    :sslCommonName "lambda.us-west-2.amazonaws.com",
    :endpoint "https://lambda.us-west-2.amazonaws.com"},
   "us-east-1"
   {:credentialScope {"service" "lambda", "region" "us-east-1"},
    :sslCommonName "lambda.us-east-1.amazonaws.com",
    :endpoint "https://lambda.us-east-1.amazonaws.com"},
   "us-west-1"
   {:credentialScope {"service" "lambda", "region" "us-west-1"},
    :sslCommonName "lambda.us-west-1.amazonaws.com",
    :endpoint "https://lambda.us-west-1.amazonaws.com"},
   "ap-south-1"
   {:credentialScope {"service" "lambda", "region" "ap-south-1"},
    :sslCommonName "lambda.ap-south-1.amazonaws.com",
    :endpoint "https://lambda.ap-south-1.amazonaws.com"}})

(clojure.spec.alpha/def :portkey.aws.lambda.-2014-11-11.add-event-source-request/event-source (clojure.spec.alpha/and :portkey.aws.lambda.-2014-11-11/string))
(clojure.spec.alpha/def :portkey.aws.lambda.-2014-11-11.add-event-source-request/role (clojure.spec.alpha/and :portkey.aws.lambda.-2014-11-11/role-arn))
(clojure.spec.alpha/def :portkey.aws.lambda.-2014-11-11.add-event-source-request/batch-size (clojure.spec.alpha/and :portkey.aws.lambda.-2014-11-11/integer))
(clojure.spec.alpha/def :portkey.aws.lambda.-2014-11-11.add-event-source-request/parameters (clojure.spec.alpha/and :portkey.aws.lambda.-2014-11-11/map))
(clojure.spec.alpha/def :portkey.aws.lambda.-2014-11-11/add-event-source-request (portkey.awsgen/json-keys :req-un [:portkey.aws.lambda.-2014-11-11.add-event-source-request/EventSource :portkey.aws.lambda.-2014-11-11/FunctionName :portkey.aws.lambda.-2014-11-11.add-event-source-request/Role] :opt-un [:portkey.aws.lambda.-2014-11-11.add-event-source-request/BatchSize :portkey.aws.lambda.-2014-11-11.add-event-source-request/Parameters]))

(clojure.spec.alpha/def :portkey.aws.lambda.-2014-11-11/function-arn (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__44500__auto__] (clojure.core/re-matches #"arn:aws:lambda:[a-z]{2}-[a-z]+-\d{1}:\d{12}:function:[a-zA-Z0-9-_]+(\/[0-9a-f]{8}-[0-9a-f]{4}-[0-9a-f]{4}-[0-9a-f]{4}-[0-9a-f]{12})?" s__44500__auto__))))

(clojure.spec.alpha/def :portkey.aws.lambda.-2014-11-11/function-name (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__44498__auto__] (clojure.core/<= 1 (clojure.core/count s__44498__auto__))) (clojure.core/fn [s__44499__auto__] (clojure.core/< (clojure.core/count s__44499__auto__) 64)) (clojure.core/fn [s__44500__auto__] (clojure.core/re-matches #"[a-zA-Z0-9-_]+" s__44500__auto__))))

(clojure.spec.alpha/def :portkey.aws.lambda.-2014-11-11/timeout (clojure.spec.alpha/and clojure.core/int? (fn* [p1__44539__44540__auto__] (clojure.core/<= 1 p1__44539__44540__auto__)) (fn* [p1__44541__44542__auto__] (clojure.core/<= p1__44541__44542__auto__ 60))))

(clojure.spec.alpha/def :portkey.aws.lambda.-2014-11-11.upload-function-request/function-zip (clojure.spec.alpha/and :portkey.aws.lambda.-2014-11-11/blob))
(clojure.spec.alpha/def :portkey.aws.lambda.-2014-11-11.upload-function-request/role (clojure.spec.alpha/and :portkey.aws.lambda.-2014-11-11/role-arn))
(clojure.spec.alpha/def :portkey.aws.lambda.-2014-11-11/upload-function-request (portkey.awsgen/json-keys :req-un [:portkey.aws.lambda.-2014-11-11/FunctionName :portkey.aws.lambda.-2014-11-11.upload-function-request/FunctionZip :portkey.aws.lambda.-2014-11-11/Runtime :portkey.aws.lambda.-2014-11-11.upload-function-request/Role :portkey.aws.lambda.-2014-11-11/Handler :portkey.aws.lambda.-2014-11-11/Mode] :opt-un [:portkey.aws.lambda.-2014-11-11/Timeout :portkey.aws.lambda.-2014-11-11/MemorySize :portkey.aws.lambda.-2014-11-11/Description]))

(clojure.spec.alpha/def :portkey.aws.lambda.-2014-11-11/map (clojure.spec.alpha/map-of :portkey.aws.lambda.-2014-11-11/string :portkey.aws.lambda.-2014-11-11/string))

(clojure.spec.alpha/def :portkey.aws.lambda.-2014-11-11.remove-event-source-request/uuid (clojure.spec.alpha/and :portkey.aws.lambda.-2014-11-11/string))
(clojure.spec.alpha/def :portkey.aws.lambda.-2014-11-11/remove-event-source-request (portkey.awsgen/json-keys :req-un [:portkey.aws.lambda.-2014-11-11.remove-event-source-request/UUID] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.lambda.-2014-11-11/handler (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__44500__auto__] (clojure.core/re-matches #"[a-zA-Z0-9./\-_]+" s__44500__auto__))))

(clojure.spec.alpha/def :portkey.aws.lambda.-2014-11-11/function-list (clojure.spec.alpha/coll-of :portkey.aws.lambda.-2014-11-11/function-configuration :max-count nil))

(clojure.spec.alpha/def :portkey.aws.lambda.-2014-11-11/runtime (clojure.spec.alpha/conformer (clojure.core/let [m__44496__auto__ {"nodejs" "nodejs", :nodejs "nodejs"}] (clojure.core/fn [s__44497__auto__] (m__44496__auto__ s__44497__auto__ :clojure.spec.alpha/invalid))) (clojure.core/comp clojure.core/keyword portkey.awsgen/dashed)))

(clojure.spec.alpha/def :portkey.aws.lambda.-2014-11-11/role-arn (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__44500__auto__] (clojure.core/re-matches #"arn:aws:iam::\d{12}:role/?[a-zA-Z_0-9+=,.@\-_/]+" s__44500__auto__))))

(clojure.spec.alpha/def :portkey.aws.lambda.-2014-11-11.service-exception/type (clojure.spec.alpha/and :portkey.aws.lambda.-2014-11-11/string))
(clojure.spec.alpha/def :portkey.aws.lambda.-2014-11-11.service-exception/message (clojure.spec.alpha/and :portkey.aws.lambda.-2014-11-11/string))
(clojure.spec.alpha/def :portkey.aws.lambda.-2014-11-11/service-exception (portkey.awsgen/json-keys :req-un [] :opt-un [:portkey.aws.lambda.-2014-11-11.service-exception/Type :portkey.aws.lambda.-2014-11-11.service-exception/Message]))

(clojure.spec.alpha/def :portkey.aws.lambda.-2014-11-11.list-functions-response/next-marker (clojure.spec.alpha/and :portkey.aws.lambda.-2014-11-11/string))
(clojure.spec.alpha/def :portkey.aws.lambda.-2014-11-11.list-functions-response/functions (clojure.spec.alpha/and :portkey.aws.lambda.-2014-11-11/function-list))
(clojure.spec.alpha/def :portkey.aws.lambda.-2014-11-11/list-functions-response (portkey.awsgen/json-keys :req-un [] :opt-un [:portkey.aws.lambda.-2014-11-11.list-functions-response/NextMarker :portkey.aws.lambda.-2014-11-11.list-functions-response/Functions]))

(clojure.spec.alpha/def :portkey.aws.lambda.-2014-11-11/delete-function-request (portkey.awsgen/json-keys :req-un [:portkey.aws.lambda.-2014-11-11/FunctionName] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.lambda.-2014-11-11/mode (clojure.spec.alpha/conformer (clojure.core/let [m__44496__auto__ {"event" "event", :event "event"}] (clojure.core/fn [s__44497__auto__] (m__44496__auto__ s__44497__auto__ :clojure.spec.alpha/invalid))) (clojure.core/comp clojure.core/keyword portkey.awsgen/dashed)))

(clojure.spec.alpha/def :portkey.aws.lambda.-2014-11-11.get-function-response/configuration (clojure.spec.alpha/and :portkey.aws.lambda.-2014-11-11/function-configuration))
(clojure.spec.alpha/def :portkey.aws.lambda.-2014-11-11.get-function-response/code (clojure.spec.alpha/and :portkey.aws.lambda.-2014-11-11/function-code-location))
(clojure.spec.alpha/def :portkey.aws.lambda.-2014-11-11/get-function-response (portkey.awsgen/json-keys :req-un [] :opt-un [:portkey.aws.lambda.-2014-11-11.get-function-response/Configuration :portkey.aws.lambda.-2014-11-11.get-function-response/Code]))

(clojure.spec.alpha/def :portkey.aws.lambda.-2014-11-11/memory-size (clojure.spec.alpha/and clojure.core/int? (fn* [p1__44539__44540__auto__] (clojure.core/<= 128 p1__44539__44540__auto__)) (fn* [p1__44541__44542__auto__] (clojure.core/<= p1__44541__44542__auto__ 1024))))

(clojure.spec.alpha/def :portkey.aws.lambda.-2014-11-11.invalid-request-content-exception/type (clojure.spec.alpha/and :portkey.aws.lambda.-2014-11-11/string))
(clojure.spec.alpha/def :portkey.aws.lambda.-2014-11-11.invalid-request-content-exception/message (clojure.spec.alpha/and :portkey.aws.lambda.-2014-11-11/string))
(clojure.spec.alpha/def :portkey.aws.lambda.-2014-11-11/invalid-request-content-exception (portkey.awsgen/json-keys :req-un [] :opt-un [:portkey.aws.lambda.-2014-11-11.invalid-request-content-exception/Type :portkey.aws.lambda.-2014-11-11.invalid-request-content-exception/message]))

(clojure.spec.alpha/def :portkey.aws.lambda.-2014-11-11.resource-not-found-exception/type (clojure.spec.alpha/and :portkey.aws.lambda.-2014-11-11/string))
(clojure.spec.alpha/def :portkey.aws.lambda.-2014-11-11.resource-not-found-exception/message (clojure.spec.alpha/and :portkey.aws.lambda.-2014-11-11/string))
(clojure.spec.alpha/def :portkey.aws.lambda.-2014-11-11/resource-not-found-exception (portkey.awsgen/json-keys :req-un [] :opt-un [:portkey.aws.lambda.-2014-11-11.resource-not-found-exception/Type :portkey.aws.lambda.-2014-11-11.resource-not-found-exception/Message]))

(clojure.spec.alpha/def :portkey.aws.lambda.-2014-11-11.invoke-async-request/invoke-args (clojure.spec.alpha/and :portkey.aws.lambda.-2014-11-11/blob))
(clojure.spec.alpha/def :portkey.aws.lambda.-2014-11-11/invoke-async-request (portkey.awsgen/json-keys :req-un [:portkey.aws.lambda.-2014-11-11/FunctionName :portkey.aws.lambda.-2014-11-11.invoke-async-request/InvokeArgs] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.lambda.-2014-11-11/description (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__44498__auto__] (clojure.core/<= 0 (clojure.core/count s__44498__auto__))) (clojure.core/fn [s__44499__auto__] (clojure.core/< (clojure.core/count s__44499__auto__) 256))))

(clojure.spec.alpha/def :portkey.aws.lambda.-2014-11-11/max-list-items (clojure.spec.alpha/and clojure.core/int? (fn* [p1__44539__44540__auto__] (clojure.core/<= 1 p1__44539__44540__auto__)) (fn* [p1__44541__44542__auto__] (clojure.core/<= p1__44541__44542__auto__ 10000))))

(clojure.spec.alpha/def :portkey.aws.lambda.-2014-11-11/integer (clojure.spec.alpha/and clojure.core/int?))

(clojure.spec.alpha/def :portkey.aws.lambda.-2014-11-11/string (clojure.spec.alpha/and clojure.core/string?))

(clojure.spec.alpha/def :portkey.aws.lambda.-2014-11-11/get-function-request (portkey.awsgen/json-keys :req-un [:portkey.aws.lambda.-2014-11-11/FunctionName] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.lambda.-2014-11-11.invoke-async-response/status (clojure.spec.alpha/and :portkey.aws.lambda.-2014-11-11/http-status))
(clojure.spec.alpha/def :portkey.aws.lambda.-2014-11-11/invoke-async-response (portkey.awsgen/json-keys :req-un [] :opt-un [:portkey.aws.lambda.-2014-11-11.invoke-async-response/Status]))

(clojure.spec.alpha/def :portkey.aws.lambda.-2014-11-11.update-function-configuration-request/role (clojure.spec.alpha/and :portkey.aws.lambda.-2014-11-11/role-arn))
(clojure.spec.alpha/def :portkey.aws.lambda.-2014-11-11/update-function-configuration-request (portkey.awsgen/json-keys :req-un [:portkey.aws.lambda.-2014-11-11/FunctionName] :opt-un [:portkey.aws.lambda.-2014-11-11.update-function-configuration-request/Role :portkey.aws.lambda.-2014-11-11/Handler :portkey.aws.lambda.-2014-11-11/Description :portkey.aws.lambda.-2014-11-11/Timeout :portkey.aws.lambda.-2014-11-11/MemorySize]))

(clojure.spec.alpha/def :portkey.aws.lambda.-2014-11-11.list-event-sources-request/event-source-arn (clojure.spec.alpha/and :portkey.aws.lambda.-2014-11-11/string))
(clojure.spec.alpha/def :portkey.aws.lambda.-2014-11-11.list-event-sources-request/marker (clojure.spec.alpha/and :portkey.aws.lambda.-2014-11-11/string))
(clojure.spec.alpha/def :portkey.aws.lambda.-2014-11-11.list-event-sources-request/max-items (clojure.spec.alpha/and :portkey.aws.lambda.-2014-11-11/max-list-items))
(clojure.spec.alpha/def :portkey.aws.lambda.-2014-11-11/list-event-sources-request (portkey.awsgen/json-keys :req-un [] :opt-un [:portkey.aws.lambda.-2014-11-11.list-event-sources-request/EventSourceArn :portkey.aws.lambda.-2014-11-11/FunctionName :portkey.aws.lambda.-2014-11-11.list-event-sources-request/Marker :portkey.aws.lambda.-2014-11-11.list-event-sources-request/MaxItems]))

(clojure.spec.alpha/def :portkey.aws.lambda.-2014-11-11/http-status (clojure.spec.alpha/and clojure.core/int?))

(clojure.spec.alpha/def :portkey.aws.lambda.-2014-11-11.function-configuration/configuration-id (clojure.spec.alpha/and :portkey.aws.lambda.-2014-11-11/string))
(clojure.spec.alpha/def :portkey.aws.lambda.-2014-11-11.function-configuration/role (clojure.spec.alpha/and :portkey.aws.lambda.-2014-11-11/role-arn))
(clojure.spec.alpha/def :portkey.aws.lambda.-2014-11-11.function-configuration/last-modified (clojure.spec.alpha/and :portkey.aws.lambda.-2014-11-11/timestamp))
(clojure.spec.alpha/def :portkey.aws.lambda.-2014-11-11.function-configuration/code-size (clojure.spec.alpha/and :portkey.aws.lambda.-2014-11-11/long))
(clojure.spec.alpha/def :portkey.aws.lambda.-2014-11-11.function-configuration/functionarn (clojure.spec.alpha/and :portkey.aws.lambda.-2014-11-11/function-arn))
(clojure.spec.alpha/def :portkey.aws.lambda.-2014-11-11/function-configuration (portkey.awsgen/json-keys :req-un [] :opt-un [:portkey.aws.lambda.-2014-11-11/FunctionName :portkey.aws.lambda.-2014-11-11/Timeout :portkey.aws.lambda.-2014-11-11/Handler :portkey.aws.lambda.-2014-11-11/Runtime :portkey.aws.lambda.-2014-11-11.function-configuration/ConfigurationId :portkey.aws.lambda.-2014-11-11/Mode :portkey.aws.lambda.-2014-11-11/MemorySize :portkey.aws.lambda.-2014-11-11.function-configuration/Role :portkey.aws.lambda.-2014-11-11/Description :portkey.aws.lambda.-2014-11-11.function-configuration/LastModified :portkey.aws.lambda.-2014-11-11.function-configuration/CodeSize :portkey.aws.lambda.-2014-11-11.function-configuration/FunctionARN]))

(clojure.spec.alpha/def :portkey.aws.lambda.-2014-11-11/long clojure.core/int?)

(clojure.spec.alpha/def :portkey.aws.lambda.-2014-11-11/timestamp (clojure.spec.alpha/and clojure.core/string?))

(clojure.spec.alpha/def :portkey.aws.lambda.-2014-11-11.list-functions-request/marker (clojure.spec.alpha/and :portkey.aws.lambda.-2014-11-11/string))
(clojure.spec.alpha/def :portkey.aws.lambda.-2014-11-11.list-functions-request/max-items (clojure.spec.alpha/and :portkey.aws.lambda.-2014-11-11/max-list-items))
(clojure.spec.alpha/def :portkey.aws.lambda.-2014-11-11/list-functions-request (portkey.awsgen/json-keys :req-un [] :opt-un [:portkey.aws.lambda.-2014-11-11.list-functions-request/Marker :portkey.aws.lambda.-2014-11-11.list-functions-request/MaxItems]))

(clojure.spec.alpha/def :portkey.aws.lambda.-2014-11-11.list-event-sources-response/next-marker (clojure.spec.alpha/and :portkey.aws.lambda.-2014-11-11/string))
(clojure.spec.alpha/def :portkey.aws.lambda.-2014-11-11.list-event-sources-response/event-sources (clojure.spec.alpha/and :portkey.aws.lambda.-2014-11-11/event-source-list))
(clojure.spec.alpha/def :portkey.aws.lambda.-2014-11-11/list-event-sources-response (portkey.awsgen/json-keys :req-un [] :opt-un [:portkey.aws.lambda.-2014-11-11.list-event-sources-response/NextMarker :portkey.aws.lambda.-2014-11-11.list-event-sources-response/EventSources]))

(clojure.spec.alpha/def :portkey.aws.lambda.-2014-11-11/get-function-configuration-request (portkey.awsgen/json-keys :req-un [:portkey.aws.lambda.-2014-11-11/FunctionName] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.lambda.-2014-11-11.get-event-source-request/uuid (clojure.spec.alpha/and :portkey.aws.lambda.-2014-11-11/string))
(clojure.spec.alpha/def :portkey.aws.lambda.-2014-11-11/get-event-source-request (portkey.awsgen/json-keys :req-un [:portkey.aws.lambda.-2014-11-11.get-event-source-request/UUID] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.lambda.-2014-11-11/blob (clojure.spec.alpha/and clojure.core/bytes? (clojure.spec.alpha/conformer portkey.awsgen/base64-encode portkey.awsgen/base64-decode)))

(clojure.spec.alpha/def :portkey.aws.lambda.-2014-11-11/event-source-list (clojure.spec.alpha/coll-of :portkey.aws.lambda.-2014-11-11/event-source-configuration :max-count nil))

(clojure.spec.alpha/def :portkey.aws.lambda.-2014-11-11.event-source-configuration/is-active (clojure.spec.alpha/and :portkey.aws.lambda.-2014-11-11/boolean))
(clojure.spec.alpha/def :portkey.aws.lambda.-2014-11-11.event-source-configuration/batch-size (clojure.spec.alpha/and :portkey.aws.lambda.-2014-11-11/integer))
(clojure.spec.alpha/def :portkey.aws.lambda.-2014-11-11.event-source-configuration/parameters (clojure.spec.alpha/and :portkey.aws.lambda.-2014-11-11/map))
(clojure.spec.alpha/def :portkey.aws.lambda.-2014-11-11.event-source-configuration/status (clojure.spec.alpha/and :portkey.aws.lambda.-2014-11-11/string))
(clojure.spec.alpha/def :portkey.aws.lambda.-2014-11-11.event-source-configuration/role (clojure.spec.alpha/and :portkey.aws.lambda.-2014-11-11/role-arn))
(clojure.spec.alpha/def :portkey.aws.lambda.-2014-11-11.event-source-configuration/last-modified (clojure.spec.alpha/and :portkey.aws.lambda.-2014-11-11/timestamp))
(clojure.spec.alpha/def :portkey.aws.lambda.-2014-11-11.event-source-configuration/event-source (clojure.spec.alpha/and :portkey.aws.lambda.-2014-11-11/string))
(clojure.spec.alpha/def :portkey.aws.lambda.-2014-11-11.event-source-configuration/uuid (clojure.spec.alpha/and :portkey.aws.lambda.-2014-11-11/string))
(clojure.spec.alpha/def :portkey.aws.lambda.-2014-11-11/event-source-configuration (portkey.awsgen/json-keys :req-un [] :opt-un [:portkey.aws.lambda.-2014-11-11.event-source-configuration/IsActive :portkey.aws.lambda.-2014-11-11.event-source-configuration/BatchSize :portkey.aws.lambda.-2014-11-11/FunctionName :portkey.aws.lambda.-2014-11-11.event-source-configuration/Parameters :portkey.aws.lambda.-2014-11-11.event-source-configuration/Status :portkey.aws.lambda.-2014-11-11.event-source-configuration/Role :portkey.aws.lambda.-2014-11-11.event-source-configuration/LastModified :portkey.aws.lambda.-2014-11-11.event-source-configuration/EventSource :portkey.aws.lambda.-2014-11-11.event-source-configuration/UUID]))

(clojure.spec.alpha/def :portkey.aws.lambda.-2014-11-11.invalid-parameter-value-exception/type (clojure.spec.alpha/and :portkey.aws.lambda.-2014-11-11/string))
(clojure.spec.alpha/def :portkey.aws.lambda.-2014-11-11.invalid-parameter-value-exception/message (clojure.spec.alpha/and :portkey.aws.lambda.-2014-11-11/string))
(clojure.spec.alpha/def :portkey.aws.lambda.-2014-11-11/invalid-parameter-value-exception (portkey.awsgen/json-keys :req-un [] :opt-un [:portkey.aws.lambda.-2014-11-11.invalid-parameter-value-exception/Type :portkey.aws.lambda.-2014-11-11.invalid-parameter-value-exception/message]))

(clojure.spec.alpha/def :portkey.aws.lambda.-2014-11-11.function-code-location/repository-type (clojure.spec.alpha/and :portkey.aws.lambda.-2014-11-11/string))
(clojure.spec.alpha/def :portkey.aws.lambda.-2014-11-11.function-code-location/location (clojure.spec.alpha/and :portkey.aws.lambda.-2014-11-11/string))
(clojure.spec.alpha/def :portkey.aws.lambda.-2014-11-11/function-code-location (portkey.awsgen/json-keys :req-un [] :opt-un [:portkey.aws.lambda.-2014-11-11.function-code-location/RepositoryType :portkey.aws.lambda.-2014-11-11.function-code-location/Location]))

(clojure.spec.alpha/def :portkey.aws.lambda.-2014-11-11/boolean clojure.core/boolean?)

(clojure.core/defn delete-function ([input__47307__auto__] (delete-function input__47307__auto__ portkey.aws/*http-client*)) ([input48673 http-client__47308__auto__] (clojure.core/-> {:method "DELETE", :headers {"content-type" "application/json"}, :url (clojure.core/str (:endpoint (endpoints portkey.aws/*region*)) "/2014-11-13/functions/{FunctionName}"), :body (clojure.spec.alpha/unform :portkey.aws.lambda.-2014-11-11/DeleteFunctionRequest input48673)} (portkey.awsgen/params-to-header {}) (portkey.awsgen/params-to-uri {"FunctionName" "FunctionName"}) (portkey.awsgen/params-to-querystring {}) (portkey.awsgen/params-to-payload nil) (clojure.core/update :body (fn* [p1__47306__47309__auto__] (clojure.core/some-> p1__47306__47309__auto__ cheshire.core/generate-string))) (http-client__47308__auto__ (clojure.core/fn [response48672] (clojure.core/let [errors__47310__auto__ {"ServiceException" :portkey.aws.lambda.-2014-11-11/service-exception, "ResourceNotFoundException" :portkey.aws.lambda.-2014-11-11/resource-not-found-exception}] (if (clojure.core/= 204 (:status response48672)) true (clojure.core/if-some [[type__47311__auto__ spec__47312__auto__] (clojure.core/find errors__47310__auto__ (clojure.core/get-in response48672 [:headers "x-amzn-ErrorType"]))] (clojure.core/let [m__47313__auto__ (clojure.spec.alpha/unform spec__47312__auto__ (cheshire.core/parse-string (:body response48672)))] (throw (clojure.core/ex-info (clojure.core/str type__47311__auto__ ": " (:message m__47313__auto__)) m__47313__auto__))) (throw (clojure.core/ex-info "Unexpected response" {:response response48672}))))))))))

(clojure.core/defn add-event-source ([input__47307__auto__] (add-event-source input__47307__auto__ portkey.aws/*http-client*)) ([input48675 http-client__47308__auto__] (clojure.core/-> {:method "POST", :headers {"content-type" "application/json"}, :url (clojure.core/str (:endpoint (endpoints portkey.aws/*region*)) "/2014-11-13/event-source-mappings/"), :body (clojure.spec.alpha/unform :portkey.aws.lambda.-2014-11-11/AddEventSourceRequest input48675)} (portkey.awsgen/params-to-header {}) (portkey.awsgen/params-to-uri {}) (portkey.awsgen/params-to-querystring {}) (portkey.awsgen/params-to-payload nil) (clojure.core/update :body (fn* [p1__47306__47309__auto__] (clojure.core/some-> p1__47306__47309__auto__ cheshire.core/generate-string))) (http-client__47308__auto__ (clojure.core/fn [response48674] (clojure.core/let [errors__47310__auto__ {"ServiceException" :portkey.aws.lambda.-2014-11-11/service-exception, "InvalidParameterValueException" :portkey.aws.lambda.-2014-11-11/invalid-parameter-value-exception}] (if (clojure.core/= nil (:status response48674)) (clojure.spec.alpha/unform :portkey.aws.lambda.-2014-11-11/event-source-configuration (:body response48674)) (clojure.core/if-some [[type__47311__auto__ spec__47312__auto__] (clojure.core/find errors__47310__auto__ (clojure.core/get-in response48674 [:headers "x-amzn-ErrorType"]))] (clojure.core/let [m__47313__auto__ (clojure.spec.alpha/unform spec__47312__auto__ (cheshire.core/parse-string (:body response48674)))] (throw (clojure.core/ex-info (clojure.core/str type__47311__auto__ ": " (:message m__47313__auto__)) m__47313__auto__))) (throw (clojure.core/ex-info "Unexpected response" {:response response48674}))))))))))

(clojure.core/defn invoke-async ([input__47307__auto__] (invoke-async input__47307__auto__ portkey.aws/*http-client*)) ([input48677 http-client__47308__auto__] (clojure.core/-> {:method "POST", :headers {"content-type" "application/json"}, :url (clojure.core/str (:endpoint (endpoints portkey.aws/*region*)) "/2014-11-13/functions/{FunctionName}/invoke-async/"), :body (clojure.spec.alpha/unform :portkey.aws.lambda.-2014-11-11/InvokeAsyncRequest input48677)} (portkey.awsgen/params-to-header {}) (portkey.awsgen/params-to-uri {"FunctionName" "FunctionName"}) (portkey.awsgen/params-to-querystring {}) (portkey.awsgen/params-to-payload "InvokeArgs") (clojure.core/update :body (fn* [p1__47306__47309__auto__] (clojure.core/some-> p1__47306__47309__auto__ cheshire.core/generate-string))) (http-client__47308__auto__ (clojure.core/fn [response48676] (clojure.core/let [errors__47310__auto__ {"ServiceException" :portkey.aws.lambda.-2014-11-11/service-exception, "ResourceNotFoundException" :portkey.aws.lambda.-2014-11-11/resource-not-found-exception, "InvalidRequestContentException" :portkey.aws.lambda.-2014-11-11/invalid-request-content-exception}] (if (clojure.core/= 202 (:status response48676)) (clojure.spec.alpha/unform :portkey.aws.lambda.-2014-11-11/invoke-async-response (:body response48676)) (clojure.core/if-some [[type__47311__auto__ spec__47312__auto__] (clojure.core/find errors__47310__auto__ (clojure.core/get-in response48676 [:headers "x-amzn-ErrorType"]))] (clojure.core/let [m__47313__auto__ (clojure.spec.alpha/unform spec__47312__auto__ (cheshire.core/parse-string (:body response48676)))] (throw (clojure.core/ex-info (clojure.core/str type__47311__auto__ ": " (:message m__47313__auto__)) m__47313__auto__))) (throw (clojure.core/ex-info "Unexpected response" {:response response48676}))))))))))

(clojure.core/defn remove-event-source ([input__47307__auto__] (remove-event-source input__47307__auto__ portkey.aws/*http-client*)) ([input48679 http-client__47308__auto__] (clojure.core/-> {:method "DELETE", :headers {"content-type" "application/json"}, :url (clojure.core/str (:endpoint (endpoints portkey.aws/*region*)) "/2014-11-13/event-source-mappings/{UUID}"), :body (clojure.spec.alpha/unform :portkey.aws.lambda.-2014-11-11/RemoveEventSourceRequest input48679)} (portkey.awsgen/params-to-header {}) (portkey.awsgen/params-to-uri {"UUID" "UUID"}) (portkey.awsgen/params-to-querystring {}) (portkey.awsgen/params-to-payload nil) (clojure.core/update :body (fn* [p1__47306__47309__auto__] (clojure.core/some-> p1__47306__47309__auto__ cheshire.core/generate-string))) (http-client__47308__auto__ (clojure.core/fn [response48678] (clojure.core/let [errors__47310__auto__ {"ServiceException" :portkey.aws.lambda.-2014-11-11/service-exception, "ResourceNotFoundException" :portkey.aws.lambda.-2014-11-11/resource-not-found-exception, "InvalidParameterValueException" :portkey.aws.lambda.-2014-11-11/invalid-parameter-value-exception}] (if (clojure.core/= 204 (:status response48678)) true (clojure.core/if-some [[type__47311__auto__ spec__47312__auto__] (clojure.core/find errors__47310__auto__ (clojure.core/get-in response48678 [:headers "x-amzn-ErrorType"]))] (clojure.core/let [m__47313__auto__ (clojure.spec.alpha/unform spec__47312__auto__ (cheshire.core/parse-string (:body response48678)))] (throw (clojure.core/ex-info (clojure.core/str type__47311__auto__ ": " (:message m__47313__auto__)) m__47313__auto__))) (throw (clojure.core/ex-info "Unexpected response" {:response response48678}))))))))))

(clojure.core/defn get-function-configuration ([input__47307__auto__] (get-function-configuration input__47307__auto__ portkey.aws/*http-client*)) ([input48681 http-client__47308__auto__] (clojure.core/-> {:method "GET", :headers {"content-type" "application/json"}, :url (clojure.core/str (:endpoint (endpoints portkey.aws/*region*)) "/2014-11-13/functions/{FunctionName}/configuration"), :body (clojure.spec.alpha/unform :portkey.aws.lambda.-2014-11-11/GetFunctionConfigurationRequest input48681)} (portkey.awsgen/params-to-header {}) (portkey.awsgen/params-to-uri {"FunctionName" "FunctionName"}) (portkey.awsgen/params-to-querystring {}) (portkey.awsgen/params-to-payload nil) (clojure.core/update :body (fn* [p1__47306__47309__auto__] (clojure.core/some-> p1__47306__47309__auto__ cheshire.core/generate-string))) (http-client__47308__auto__ (clojure.core/fn [response48680] (clojure.core/let [errors__47310__auto__ {"ServiceException" :portkey.aws.lambda.-2014-11-11/service-exception, "ResourceNotFoundException" :portkey.aws.lambda.-2014-11-11/resource-not-found-exception}] (if (clojure.core/= 200 (:status response48680)) (clojure.spec.alpha/unform :portkey.aws.lambda.-2014-11-11/function-configuration (:body response48680)) (clojure.core/if-some [[type__47311__auto__ spec__47312__auto__] (clojure.core/find errors__47310__auto__ (clojure.core/get-in response48680 [:headers "x-amzn-ErrorType"]))] (clojure.core/let [m__47313__auto__ (clojure.spec.alpha/unform spec__47312__auto__ (cheshire.core/parse-string (:body response48680)))] (throw (clojure.core/ex-info (clojure.core/str type__47311__auto__ ": " (:message m__47313__auto__)) m__47313__auto__))) (throw (clojure.core/ex-info "Unexpected response" {:response response48680}))))))))))

(clojure.core/defn upload-function ([input__47307__auto__] (upload-function input__47307__auto__ portkey.aws/*http-client*)) ([input48683 http-client__47308__auto__] (clojure.core/-> {:method "PUT", :headers {"content-type" "application/json"}, :url (clojure.core/str (:endpoint (endpoints portkey.aws/*region*)) "/2014-11-13/functions/{FunctionName}"), :body (clojure.spec.alpha/unform :portkey.aws.lambda.-2014-11-11/UploadFunctionRequest input48683)} (portkey.awsgen/params-to-header {}) (portkey.awsgen/params-to-uri {"FunctionName" "FunctionName"}) (portkey.awsgen/params-to-querystring {"Timeout" "Timeout", "Handler" "Handler", "Runtime" "Runtime", "Mode" "Mode", "MemorySize" "MemorySize", "Role" "Role", "Description" "Description"}) (portkey.awsgen/params-to-payload "FunctionZip") (clojure.core/update :body (fn* [p1__47306__47309__auto__] (clojure.core/some-> p1__47306__47309__auto__ cheshire.core/generate-string))) (http-client__47308__auto__ (clojure.core/fn [response48682] (clojure.core/let [errors__47310__auto__ {"ServiceException" :portkey.aws.lambda.-2014-11-11/service-exception, "InvalidParameterValueException" :portkey.aws.lambda.-2014-11-11/invalid-parameter-value-exception, "ResourceNotFoundException" :portkey.aws.lambda.-2014-11-11/resource-not-found-exception}] (if (clojure.core/= 201 (:status response48682)) (clojure.spec.alpha/unform :portkey.aws.lambda.-2014-11-11/function-configuration (:body response48682)) (clojure.core/if-some [[type__47311__auto__ spec__47312__auto__] (clojure.core/find errors__47310__auto__ (clojure.core/get-in response48682 [:headers "x-amzn-ErrorType"]))] (clojure.core/let [m__47313__auto__ (clojure.spec.alpha/unform spec__47312__auto__ (cheshire.core/parse-string (:body response48682)))] (throw (clojure.core/ex-info (clojure.core/str type__47311__auto__ ": " (:message m__47313__auto__)) m__47313__auto__))) (throw (clojure.core/ex-info "Unexpected response" {:response response48682}))))))))))

(clojure.core/defn list-event-sources ([input__47307__auto__] (list-event-sources input__47307__auto__ portkey.aws/*http-client*)) ([input48685 http-client__47308__auto__] (clojure.core/-> {:method "GET", :headers {"content-type" "application/json"}, :url (clojure.core/str (:endpoint (endpoints portkey.aws/*region*)) "/2014-11-13/event-source-mappings/"), :body (clojure.spec.alpha/unform :portkey.aws.lambda.-2014-11-11/ListEventSourcesRequest input48685)} (portkey.awsgen/params-to-header {}) (portkey.awsgen/params-to-uri {}) (portkey.awsgen/params-to-querystring {"EventSource" "EventSourceArn", "FunctionName" "FunctionName", "Marker" "Marker", "MaxItems" "MaxItems"}) (portkey.awsgen/params-to-payload nil) (clojure.core/update :body (fn* [p1__47306__47309__auto__] (clojure.core/some-> p1__47306__47309__auto__ cheshire.core/generate-string))) (http-client__47308__auto__ (clojure.core/fn [response48684] (clojure.core/let [errors__47310__auto__ {"ServiceException" :portkey.aws.lambda.-2014-11-11/service-exception, "ResourceNotFoundException" :portkey.aws.lambda.-2014-11-11/resource-not-found-exception, "InvalidParameterValueException" :portkey.aws.lambda.-2014-11-11/invalid-parameter-value-exception}] (if (clojure.core/= 200 (:status response48684)) (clojure.spec.alpha/unform :portkey.aws.lambda.-2014-11-11/list-event-sources-response (:body response48684)) (clojure.core/if-some [[type__47311__auto__ spec__47312__auto__] (clojure.core/find errors__47310__auto__ (clojure.core/get-in response48684 [:headers "x-amzn-ErrorType"]))] (clojure.core/let [m__47313__auto__ (clojure.spec.alpha/unform spec__47312__auto__ (cheshire.core/parse-string (:body response48684)))] (throw (clojure.core/ex-info (clojure.core/str type__47311__auto__ ": " (:message m__47313__auto__)) m__47313__auto__))) (throw (clojure.core/ex-info "Unexpected response" {:response response48684}))))))))))

(clojure.core/defn get-function ([input__47307__auto__] (get-function input__47307__auto__ portkey.aws/*http-client*)) ([input48687 http-client__47308__auto__] (clojure.core/-> {:method "GET", :headers {"content-type" "application/json"}, :url (clojure.core/str (:endpoint (endpoints portkey.aws/*region*)) "/2014-11-13/functions/{FunctionName}"), :body (clojure.spec.alpha/unform :portkey.aws.lambda.-2014-11-11/GetFunctionRequest input48687)} (portkey.awsgen/params-to-header {}) (portkey.awsgen/params-to-uri {"FunctionName" "FunctionName"}) (portkey.awsgen/params-to-querystring {}) (portkey.awsgen/params-to-payload nil) (clojure.core/update :body (fn* [p1__47306__47309__auto__] (clojure.core/some-> p1__47306__47309__auto__ cheshire.core/generate-string))) (http-client__47308__auto__ (clojure.core/fn [response48686] (clojure.core/let [errors__47310__auto__ {"ServiceException" :portkey.aws.lambda.-2014-11-11/service-exception, "ResourceNotFoundException" :portkey.aws.lambda.-2014-11-11/resource-not-found-exception}] (if (clojure.core/= 200 (:status response48686)) (clojure.spec.alpha/unform :portkey.aws.lambda.-2014-11-11/get-function-response (:body response48686)) (clojure.core/if-some [[type__47311__auto__ spec__47312__auto__] (clojure.core/find errors__47310__auto__ (clojure.core/get-in response48686 [:headers "x-amzn-ErrorType"]))] (clojure.core/let [m__47313__auto__ (clojure.spec.alpha/unform spec__47312__auto__ (cheshire.core/parse-string (:body response48686)))] (throw (clojure.core/ex-info (clojure.core/str type__47311__auto__ ": " (:message m__47313__auto__)) m__47313__auto__))) (throw (clojure.core/ex-info "Unexpected response" {:response response48686}))))))))))

(clojure.core/defn list-functions ([input__47307__auto__] (list-functions input__47307__auto__ portkey.aws/*http-client*)) ([input48689 http-client__47308__auto__] (clojure.core/-> {:method "GET", :headers {"content-type" "application/json"}, :url (clojure.core/str (:endpoint (endpoints portkey.aws/*region*)) "/2014-11-13/functions/"), :body (clojure.spec.alpha/unform :portkey.aws.lambda.-2014-11-11/ListFunctionsRequest input48689)} (portkey.awsgen/params-to-header {}) (portkey.awsgen/params-to-uri {}) (portkey.awsgen/params-to-querystring {"Marker" "Marker", "MaxItems" "MaxItems"}) (portkey.awsgen/params-to-payload nil) (clojure.core/update :body (fn* [p1__47306__47309__auto__] (clojure.core/some-> p1__47306__47309__auto__ cheshire.core/generate-string))) (http-client__47308__auto__ (clojure.core/fn [response48688] (clojure.core/let [errors__47310__auto__ {"ServiceException" :portkey.aws.lambda.-2014-11-11/service-exception}] (if (clojure.core/= 200 (:status response48688)) (clojure.spec.alpha/unform :portkey.aws.lambda.-2014-11-11/list-functions-response (:body response48688)) (clojure.core/if-some [[type__47311__auto__ spec__47312__auto__] (clojure.core/find errors__47310__auto__ (clojure.core/get-in response48688 [:headers "x-amzn-ErrorType"]))] (clojure.core/let [m__47313__auto__ (clojure.spec.alpha/unform spec__47312__auto__ (cheshire.core/parse-string (:body response48688)))] (throw (clojure.core/ex-info (clojure.core/str type__47311__auto__ ": " (:message m__47313__auto__)) m__47313__auto__))) (throw (clojure.core/ex-info "Unexpected response" {:response response48688}))))))))))

(clojure.core/defn update-function-configuration ([input__47307__auto__] (update-function-configuration input__47307__auto__ portkey.aws/*http-client*)) ([input48691 http-client__47308__auto__] (clojure.core/-> {:method "PUT", :headers {"content-type" "application/json"}, :url (clojure.core/str (:endpoint (endpoints portkey.aws/*region*)) "/2014-11-13/functions/{FunctionName}/configuration"), :body (clojure.spec.alpha/unform :portkey.aws.lambda.-2014-11-11/UpdateFunctionConfigurationRequest input48691)} (portkey.awsgen/params-to-header {}) (portkey.awsgen/params-to-uri {"FunctionName" "FunctionName"}) (portkey.awsgen/params-to-querystring {"Role" "Role", "Handler" "Handler", "Description" "Description", "Timeout" "Timeout", "MemorySize" "MemorySize"}) (portkey.awsgen/params-to-payload nil) (clojure.core/update :body (fn* [p1__47306__47309__auto__] (clojure.core/some-> p1__47306__47309__auto__ cheshire.core/generate-string))) (http-client__47308__auto__ (clojure.core/fn [response48690] (clojure.core/let [errors__47310__auto__ {"ServiceException" :portkey.aws.lambda.-2014-11-11/service-exception, "ResourceNotFoundException" :portkey.aws.lambda.-2014-11-11/resource-not-found-exception, "InvalidParameterValueException" :portkey.aws.lambda.-2014-11-11/invalid-parameter-value-exception}] (if (clojure.core/= 200 (:status response48690)) (clojure.spec.alpha/unform :portkey.aws.lambda.-2014-11-11/function-configuration (:body response48690)) (clojure.core/if-some [[type__47311__auto__ spec__47312__auto__] (clojure.core/find errors__47310__auto__ (clojure.core/get-in response48690 [:headers "x-amzn-ErrorType"]))] (clojure.core/let [m__47313__auto__ (clojure.spec.alpha/unform spec__47312__auto__ (cheshire.core/parse-string (:body response48690)))] (throw (clojure.core/ex-info (clojure.core/str type__47311__auto__ ": " (:message m__47313__auto__)) m__47313__auto__))) (throw (clojure.core/ex-info "Unexpected response" {:response response48690}))))))))))

(clojure.core/defn get-event-source ([input__47307__auto__] (get-event-source input__47307__auto__ portkey.aws/*http-client*)) ([input48693 http-client__47308__auto__] (clojure.core/-> {:method "GET", :headers {"content-type" "application/json"}, :url (clojure.core/str (:endpoint (endpoints portkey.aws/*region*)) "/2014-11-13/event-source-mappings/{UUID}"), :body (clojure.spec.alpha/unform :portkey.aws.lambda.-2014-11-11/GetEventSourceRequest input48693)} (portkey.awsgen/params-to-header {}) (portkey.awsgen/params-to-uri {"UUID" "UUID"}) (portkey.awsgen/params-to-querystring {}) (portkey.awsgen/params-to-payload nil) (clojure.core/update :body (fn* [p1__47306__47309__auto__] (clojure.core/some-> p1__47306__47309__auto__ cheshire.core/generate-string))) (http-client__47308__auto__ (clojure.core/fn [response48692] (clojure.core/let [errors__47310__auto__ {"ServiceException" :portkey.aws.lambda.-2014-11-11/service-exception, "ResourceNotFoundException" :portkey.aws.lambda.-2014-11-11/resource-not-found-exception, "InvalidParameterValueException" :portkey.aws.lambda.-2014-11-11/invalid-parameter-value-exception}] (if (clojure.core/= 200 (:status response48692)) (clojure.spec.alpha/unform :portkey.aws.lambda.-2014-11-11/event-source-configuration (:body response48692)) (clojure.core/if-some [[type__47311__auto__ spec__47312__auto__] (clojure.core/find errors__47310__auto__ (clojure.core/get-in response48692 [:headers "x-amzn-ErrorType"]))] (clojure.core/let [m__47313__auto__ (clojure.spec.alpha/unform spec__47312__auto__ (cheshire.core/parse-string (:body response48692)))] (throw (clojure.core/ex-info (clojure.core/str type__47311__auto__ ": " (:message m__47313__auto__)) m__47313__auto__))) (throw (clojure.core/ex-info "Unexpected response" {:response response48692}))))))))))
