(ns portkey.aws.lambda.-2014-11-11 (:require [portkey.aws]))

(def
 endpoints
 '{"ap-northeast-1"
   {:credential-scope {:service "lambda", :region "ap-northeast-1"},
    :ssl-common-name "lambda.ap-northeast-1.amazonaws.com",
    :endpoint "https://lambda.ap-northeast-1.amazonaws.com",
    :signature-version :v4},
   "eu-west-1"
   {:credential-scope {:service "lambda", :region "eu-west-1"},
    :ssl-common-name "lambda.eu-west-1.amazonaws.com",
    :endpoint "https://lambda.eu-west-1.amazonaws.com",
    :signature-version :v4},
   "us-east-2"
   {:credential-scope {:service "lambda", :region "us-east-2"},
    :ssl-common-name "lambda.us-east-2.amazonaws.com",
    :endpoint "https://lambda.us-east-2.amazonaws.com",
    :signature-version :v4},
   "ap-southeast-2"
   {:credential-scope {:service "lambda", :region "ap-southeast-2"},
    :ssl-common-name "lambda.ap-southeast-2.amazonaws.com",
    :endpoint "https://lambda.ap-southeast-2.amazonaws.com",
    :signature-version :v4},
   "cn-north-1"
   {:credential-scope {:service "lambda", :region "cn-north-1"},
    :ssl-common-name "lambda.cn-north-1.amazonaws.com.cn",
    :endpoint "https://lambda.cn-north-1.amazonaws.com.cn",
    :signature-version :v4},
   "sa-east-1"
   {:credential-scope {:service "lambda", :region "sa-east-1"},
    :ssl-common-name "lambda.sa-east-1.amazonaws.com",
    :endpoint "https://lambda.sa-east-1.amazonaws.com",
    :signature-version :v4},
   "ap-southeast-1"
   {:credential-scope {:service "lambda", :region "ap-southeast-1"},
    :ssl-common-name "lambda.ap-southeast-1.amazonaws.com",
    :endpoint "https://lambda.ap-southeast-1.amazonaws.com",
    :signature-version :v4},
   "ap-northeast-2"
   {:credential-scope {:service "lambda", :region "ap-northeast-2"},
    :ssl-common-name "lambda.ap-northeast-2.amazonaws.com",
    :endpoint "https://lambda.ap-northeast-2.amazonaws.com",
    :signature-version :v4},
   "eu-west-3"
   {:credential-scope {:service "lambda", :region "eu-west-3"},
    :ssl-common-name "lambda.eu-west-3.amazonaws.com",
    :endpoint "https://lambda.eu-west-3.amazonaws.com",
    :signature-version :v4},
   "ca-central-1"
   {:credential-scope {:service "lambda", :region "ca-central-1"},
    :ssl-common-name "lambda.ca-central-1.amazonaws.com",
    :endpoint "https://lambda.ca-central-1.amazonaws.com",
    :signature-version :v4},
   "eu-central-1"
   {:credential-scope {:service "lambda", :region "eu-central-1"},
    :ssl-common-name "lambda.eu-central-1.amazonaws.com",
    :endpoint "https://lambda.eu-central-1.amazonaws.com",
    :signature-version :v4},
   "eu-west-2"
   {:credential-scope {:service "lambda", :region "eu-west-2"},
    :ssl-common-name "lambda.eu-west-2.amazonaws.com",
    :endpoint "https://lambda.eu-west-2.amazonaws.com",
    :signature-version :v4},
   "us-gov-west-1"
   {:credential-scope {:service "lambda", :region "us-gov-west-1"},
    :ssl-common-name "lambda.us-gov-west-1.amazonaws.com",
    :endpoint "https://lambda.us-gov-west-1.amazonaws.com",
    :signature-version :v4},
   "us-west-2"
   {:credential-scope {:service "lambda", :region "us-west-2"},
    :ssl-common-name "lambda.us-west-2.amazonaws.com",
    :endpoint "https://lambda.us-west-2.amazonaws.com",
    :signature-version :v4},
   "us-east-1"
   {:credential-scope {:service "lambda", :region "us-east-1"},
    :ssl-common-name "lambda.us-east-1.amazonaws.com",
    :endpoint "https://lambda.us-east-1.amazonaws.com",
    :signature-version :v4},
   "us-west-1"
   {:credential-scope {:service "lambda", :region "us-west-1"},
    :ssl-common-name "lambda.us-west-1.amazonaws.com",
    :endpoint "https://lambda.us-west-1.amazonaws.com",
    :signature-version :v4},
   "ap-south-1"
   {:credential-scope {:service "lambda", :region "ap-south-1"},
    :ssl-common-name "lambda.ap-south-1.amazonaws.com",
    :endpoint "https://lambda.ap-south-1.amazonaws.com",
    :signature-version :v4}})

(clojure.spec.alpha/def :portkey.aws.lambda.-2014-11-11.add-event-source-request/event-source (clojure.spec.alpha/and :portkey.aws.lambda.-2014-11-11/string))
(clojure.spec.alpha/def :portkey.aws.lambda.-2014-11-11.add-event-source-request/role (clojure.spec.alpha/and :portkey.aws.lambda.-2014-11-11/role-arn))
(clojure.spec.alpha/def :portkey.aws.lambda.-2014-11-11.add-event-source-request/batch-size (clojure.spec.alpha/and :portkey.aws.lambda.-2014-11-11/integer))
(clojure.spec.alpha/def :portkey.aws.lambda.-2014-11-11.add-event-source-request/parameters (clojure.spec.alpha/and :portkey.aws.lambda.-2014-11-11/map))
(clojure.spec.alpha/def :portkey.aws.lambda.-2014-11-11/add-event-source-request (portkey.aws/json-keys :req-un [:portkey.aws.lambda.-2014-11-11.add-event-source-request/EventSource :portkey.aws.lambda.-2014-11-11/FunctionName :portkey.aws.lambda.-2014-11-11.add-event-source-request/Role] :opt-un [:portkey.aws.lambda.-2014-11-11.add-event-source-request/BatchSize :portkey.aws.lambda.-2014-11-11.add-event-source-request/Parameters] :locations {}))

(clojure.spec.alpha/def :portkey.aws.lambda.-2014-11-11/function-arn (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__13770__auto__] (clojure.core/re-matches #"arn:aws:lambda:[a-z]{2}-[a-z]+-\d{1}:\d{12}:function:[a-zA-Z0-9-_]+(\/[0-9a-f]{8}-[0-9a-f]{4}-[0-9a-f]{4}-[0-9a-f]{4}-[0-9a-f]{12})?" s__13770__auto__))))

(clojure.spec.alpha/def :portkey.aws.lambda.-2014-11-11/function-name (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__13768__auto__] (clojure.core/<= 1 (clojure.core/count s__13768__auto__))) (clojure.core/fn [s__13769__auto__] (clojure.core/< (clojure.core/count s__13769__auto__) 64)) (clojure.core/fn [s__13770__auto__] (clojure.core/re-matches #"[a-zA-Z0-9-_]+" s__13770__auto__))))

(clojure.spec.alpha/def :portkey.aws.lambda.-2014-11-11/timeout (clojure.spec.alpha/and clojure.core/int? (fn* [p1__13828__13829__auto__] (clojure.core/<= 1 p1__13828__13829__auto__)) (fn* [p1__13830__13831__auto__] (clojure.core/<= p1__13830__13831__auto__ 60))))

(clojure.spec.alpha/def :portkey.aws.lambda.-2014-11-11.upload-function-request/function-zip (clojure.spec.alpha/and :portkey.aws.lambda.-2014-11-11/blob))
(clojure.spec.alpha/def :portkey.aws.lambda.-2014-11-11.upload-function-request/role (clojure.spec.alpha/and :portkey.aws.lambda.-2014-11-11/role-arn))
(clojure.spec.alpha/def :portkey.aws.lambda.-2014-11-11/upload-function-request (portkey.aws/json-keys :req-un [:portkey.aws.lambda.-2014-11-11/FunctionName :portkey.aws.lambda.-2014-11-11.upload-function-request/FunctionZip :portkey.aws.lambda.-2014-11-11/Runtime :portkey.aws.lambda.-2014-11-11.upload-function-request/Role :portkey.aws.lambda.-2014-11-11/Handler :portkey.aws.lambda.-2014-11-11/Mode] :opt-un [:portkey.aws.lambda.-2014-11-11/Timeout :portkey.aws.lambda.-2014-11-11/MemorySize :portkey.aws.lambda.-2014-11-11/Description] :locations {}))

(clojure.spec.alpha/def :portkey.aws.lambda.-2014-11-11/map (clojure.spec.alpha/map-of :portkey.aws.lambda.-2014-11-11/string :portkey.aws.lambda.-2014-11-11/string))

(clojure.spec.alpha/def :portkey.aws.lambda.-2014-11-11.remove-event-source-request/uuid (clojure.spec.alpha/and :portkey.aws.lambda.-2014-11-11/string))
(clojure.spec.alpha/def :portkey.aws.lambda.-2014-11-11/remove-event-source-request (portkey.aws/json-keys :req-un [:portkey.aws.lambda.-2014-11-11.remove-event-source-request/UUID] :opt-un [] :locations {}))

(clojure.spec.alpha/def :portkey.aws.lambda.-2014-11-11/handler (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__13770__auto__] (clojure.core/re-matches #"[a-zA-Z0-9./\-_]+" s__13770__auto__))))

(clojure.spec.alpha/def :portkey.aws.lambda.-2014-11-11/function-list (clojure.spec.alpha/and (clojure.spec.alpha/coll-of :portkey.aws.lambda.-2014-11-11/function-configuration) (clojure.spec.alpha/conformer clojure.core/identity (fn* [p1__13687__13688__auto__] (if (clojure.core/sequential? p1__13687__13688__auto__) p1__13687__13688__auto__ [p1__13687__13688__auto__])))))

(clojure.spec.alpha/def :portkey.aws.lambda.-2014-11-11/runtime (clojure.spec.alpha/conformer (clojure.core/let [m__13766__auto__ {"nodejs" "nodejs", :nodejs "nodejs"}] (clojure.core/fn [s__13767__auto__] (m__13766__auto__ s__13767__auto__ :clojure.spec.alpha/invalid))) (clojure.core/comp clojure.core/keyword portkey.aws/dashed)))

(clojure.spec.alpha/def :portkey.aws.lambda.-2014-11-11/role-arn (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__13770__auto__] (clojure.core/re-matches #"arn:aws:iam::\d{12}:role/?[a-zA-Z_0-9+=,.@\-_/]+" s__13770__auto__))))

(clojure.spec.alpha/def :portkey.aws.lambda.-2014-11-11.service-exception/type (clojure.spec.alpha/and :portkey.aws.lambda.-2014-11-11/string))
(clojure.spec.alpha/def :portkey.aws.lambda.-2014-11-11.service-exception/message (clojure.spec.alpha/and :portkey.aws.lambda.-2014-11-11/string))
(clojure.spec.alpha/def :portkey.aws.lambda.-2014-11-11/service-exception (portkey.aws/json-keys :req-un [] :opt-un [:portkey.aws.lambda.-2014-11-11.service-exception/Type :portkey.aws.lambda.-2014-11-11.service-exception/Message] :locations {}))

(clojure.spec.alpha/def :portkey.aws.lambda.-2014-11-11.list-functions-response/next-marker (clojure.spec.alpha/and :portkey.aws.lambda.-2014-11-11/string))
(clojure.spec.alpha/def :portkey.aws.lambda.-2014-11-11.list-functions-response/functions (clojure.spec.alpha/and :portkey.aws.lambda.-2014-11-11/function-list))
(clojure.spec.alpha/def :portkey.aws.lambda.-2014-11-11/list-functions-response (portkey.aws/json-keys :req-un [] :opt-un [:portkey.aws.lambda.-2014-11-11.list-functions-response/NextMarker :portkey.aws.lambda.-2014-11-11.list-functions-response/Functions] :locations {}))

(clojure.spec.alpha/def :portkey.aws.lambda.-2014-11-11/delete-function-request (portkey.aws/json-keys :req-un [:portkey.aws.lambda.-2014-11-11/FunctionName] :opt-un [] :locations {}))

(clojure.spec.alpha/def :portkey.aws.lambda.-2014-11-11/mode (clojure.spec.alpha/conformer (clojure.core/let [m__13766__auto__ {"event" "event", :event "event"}] (clojure.core/fn [s__13767__auto__] (m__13766__auto__ s__13767__auto__ :clojure.spec.alpha/invalid))) (clojure.core/comp clojure.core/keyword portkey.aws/dashed)))

(clojure.spec.alpha/def :portkey.aws.lambda.-2014-11-11.get-function-response/configuration (clojure.spec.alpha/and :portkey.aws.lambda.-2014-11-11/function-configuration))
(clojure.spec.alpha/def :portkey.aws.lambda.-2014-11-11.get-function-response/code (clojure.spec.alpha/and :portkey.aws.lambda.-2014-11-11/function-code-location))
(clojure.spec.alpha/def :portkey.aws.lambda.-2014-11-11/get-function-response (portkey.aws/json-keys :req-un [] :opt-un [:portkey.aws.lambda.-2014-11-11.get-function-response/Configuration :portkey.aws.lambda.-2014-11-11.get-function-response/Code] :locations {}))

(clojure.spec.alpha/def :portkey.aws.lambda.-2014-11-11/memory-size (clojure.spec.alpha/and clojure.core/int? (fn* [p1__13828__13829__auto__] (clojure.core/<= 128 p1__13828__13829__auto__)) (fn* [p1__13830__13831__auto__] (clojure.core/<= p1__13830__13831__auto__ 1024))))

(clojure.spec.alpha/def :portkey.aws.lambda.-2014-11-11.invalid-request-content-exception/type (clojure.spec.alpha/and :portkey.aws.lambda.-2014-11-11/string))
(clojure.spec.alpha/def :portkey.aws.lambda.-2014-11-11.invalid-request-content-exception/message (clojure.spec.alpha/and :portkey.aws.lambda.-2014-11-11/string))
(clojure.spec.alpha/def :portkey.aws.lambda.-2014-11-11/invalid-request-content-exception (portkey.aws/json-keys :req-un [] :opt-un [:portkey.aws.lambda.-2014-11-11.invalid-request-content-exception/Type :portkey.aws.lambda.-2014-11-11.invalid-request-content-exception/message] :locations {}))

(clojure.spec.alpha/def :portkey.aws.lambda.-2014-11-11.resource-not-found-exception/type (clojure.spec.alpha/and :portkey.aws.lambda.-2014-11-11/string))
(clojure.spec.alpha/def :portkey.aws.lambda.-2014-11-11.resource-not-found-exception/message (clojure.spec.alpha/and :portkey.aws.lambda.-2014-11-11/string))
(clojure.spec.alpha/def :portkey.aws.lambda.-2014-11-11/resource-not-found-exception (portkey.aws/json-keys :req-un [] :opt-un [:portkey.aws.lambda.-2014-11-11.resource-not-found-exception/Type :portkey.aws.lambda.-2014-11-11.resource-not-found-exception/Message] :locations {}))

(clojure.spec.alpha/def :portkey.aws.lambda.-2014-11-11.invoke-async-request/invoke-args (clojure.spec.alpha/and :portkey.aws.lambda.-2014-11-11/blob))
(clojure.spec.alpha/def :portkey.aws.lambda.-2014-11-11/invoke-async-request (portkey.aws/json-keys :req-un [:portkey.aws.lambda.-2014-11-11/FunctionName :portkey.aws.lambda.-2014-11-11.invoke-async-request/InvokeArgs] :opt-un [] :locations {}))

(clojure.spec.alpha/def :portkey.aws.lambda.-2014-11-11/description (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__13768__auto__] (clojure.core/<= 0 (clojure.core/count s__13768__auto__))) (clojure.core/fn [s__13769__auto__] (clojure.core/< (clojure.core/count s__13769__auto__) 256))))

(clojure.spec.alpha/def :portkey.aws.lambda.-2014-11-11/max-list-items (clojure.spec.alpha/and clojure.core/int? (fn* [p1__13828__13829__auto__] (clojure.core/<= 1 p1__13828__13829__auto__)) (fn* [p1__13830__13831__auto__] (clojure.core/<= p1__13830__13831__auto__ 10000))))

(clojure.spec.alpha/def :portkey.aws.lambda.-2014-11-11/integer (clojure.spec.alpha/and clojure.core/int?))

(clojure.spec.alpha/def :portkey.aws.lambda.-2014-11-11/string (clojure.spec.alpha/and clojure.core/string?))

(clojure.spec.alpha/def :portkey.aws.lambda.-2014-11-11/get-function-request (portkey.aws/json-keys :req-un [:portkey.aws.lambda.-2014-11-11/FunctionName] :opt-un [] :locations {}))

(clojure.spec.alpha/def :portkey.aws.lambda.-2014-11-11.invoke-async-response/status (clojure.spec.alpha/and :portkey.aws.lambda.-2014-11-11/http-status))
(clojure.spec.alpha/def :portkey.aws.lambda.-2014-11-11/invoke-async-response (portkey.aws/json-keys :req-un [] :opt-un [:portkey.aws.lambda.-2014-11-11.invoke-async-response/Status] :locations {}))

(clojure.spec.alpha/def :portkey.aws.lambda.-2014-11-11.update-function-configuration-request/role (clojure.spec.alpha/and :portkey.aws.lambda.-2014-11-11/role-arn))
(clojure.spec.alpha/def :portkey.aws.lambda.-2014-11-11/update-function-configuration-request (portkey.aws/json-keys :req-un [:portkey.aws.lambda.-2014-11-11/FunctionName] :opt-un [:portkey.aws.lambda.-2014-11-11.update-function-configuration-request/Role :portkey.aws.lambda.-2014-11-11/Handler :portkey.aws.lambda.-2014-11-11/Description :portkey.aws.lambda.-2014-11-11/Timeout :portkey.aws.lambda.-2014-11-11/MemorySize] :locations {}))

(clojure.spec.alpha/def :portkey.aws.lambda.-2014-11-11.list-event-sources-request/event-source-arn (clojure.spec.alpha/and :portkey.aws.lambda.-2014-11-11/string))
(clojure.spec.alpha/def :portkey.aws.lambda.-2014-11-11.list-event-sources-request/marker (clojure.spec.alpha/and :portkey.aws.lambda.-2014-11-11/string))
(clojure.spec.alpha/def :portkey.aws.lambda.-2014-11-11.list-event-sources-request/max-items (clojure.spec.alpha/and :portkey.aws.lambda.-2014-11-11/max-list-items))
(clojure.spec.alpha/def :portkey.aws.lambda.-2014-11-11/list-event-sources-request (portkey.aws/json-keys :req-un [] :opt-un [:portkey.aws.lambda.-2014-11-11.list-event-sources-request/EventSourceArn :portkey.aws.lambda.-2014-11-11/FunctionName :portkey.aws.lambda.-2014-11-11.list-event-sources-request/Marker :portkey.aws.lambda.-2014-11-11.list-event-sources-request/MaxItems] :locations {}))

(clojure.spec.alpha/def :portkey.aws.lambda.-2014-11-11/http-status (clojure.spec.alpha/and clojure.core/int?))

(clojure.spec.alpha/def :portkey.aws.lambda.-2014-11-11.function-configuration/configuration-id (clojure.spec.alpha/and :portkey.aws.lambda.-2014-11-11/string))
(clojure.spec.alpha/def :portkey.aws.lambda.-2014-11-11.function-configuration/role (clojure.spec.alpha/and :portkey.aws.lambda.-2014-11-11/role-arn))
(clojure.spec.alpha/def :portkey.aws.lambda.-2014-11-11.function-configuration/last-modified (clojure.spec.alpha/and :portkey.aws.lambda.-2014-11-11/timestamp))
(clojure.spec.alpha/def :portkey.aws.lambda.-2014-11-11.function-configuration/code-size (clojure.spec.alpha/and :portkey.aws.lambda.-2014-11-11/long))
(clojure.spec.alpha/def :portkey.aws.lambda.-2014-11-11.function-configuration/functionarn (clojure.spec.alpha/and :portkey.aws.lambda.-2014-11-11/function-arn))
(clojure.spec.alpha/def :portkey.aws.lambda.-2014-11-11/function-configuration (portkey.aws/json-keys :req-un [] :opt-un [:portkey.aws.lambda.-2014-11-11/FunctionName :portkey.aws.lambda.-2014-11-11/Timeout :portkey.aws.lambda.-2014-11-11/Handler :portkey.aws.lambda.-2014-11-11/Runtime :portkey.aws.lambda.-2014-11-11.function-configuration/ConfigurationId :portkey.aws.lambda.-2014-11-11/Mode :portkey.aws.lambda.-2014-11-11/MemorySize :portkey.aws.lambda.-2014-11-11.function-configuration/Role :portkey.aws.lambda.-2014-11-11/Description :portkey.aws.lambda.-2014-11-11.function-configuration/LastModified :portkey.aws.lambda.-2014-11-11.function-configuration/CodeSize :portkey.aws.lambda.-2014-11-11.function-configuration/FunctionARN] :locations {}))

(clojure.spec.alpha/def :portkey.aws.lambda.-2014-11-11/long clojure.core/int?)

(clojure.spec.alpha/def :portkey.aws.lambda.-2014-11-11/timestamp (clojure.spec.alpha/and clojure.core/string?))

(clojure.spec.alpha/def :portkey.aws.lambda.-2014-11-11.list-functions-request/marker (clojure.spec.alpha/and :portkey.aws.lambda.-2014-11-11/string))
(clojure.spec.alpha/def :portkey.aws.lambda.-2014-11-11.list-functions-request/max-items (clojure.spec.alpha/and :portkey.aws.lambda.-2014-11-11/max-list-items))
(clojure.spec.alpha/def :portkey.aws.lambda.-2014-11-11/list-functions-request (portkey.aws/json-keys :req-un [] :opt-un [:portkey.aws.lambda.-2014-11-11.list-functions-request/Marker :portkey.aws.lambda.-2014-11-11.list-functions-request/MaxItems] :locations {}))

(clojure.spec.alpha/def :portkey.aws.lambda.-2014-11-11.list-event-sources-response/next-marker (clojure.spec.alpha/and :portkey.aws.lambda.-2014-11-11/string))
(clojure.spec.alpha/def :portkey.aws.lambda.-2014-11-11.list-event-sources-response/event-sources (clojure.spec.alpha/and :portkey.aws.lambda.-2014-11-11/event-source-list))
(clojure.spec.alpha/def :portkey.aws.lambda.-2014-11-11/list-event-sources-response (portkey.aws/json-keys :req-un [] :opt-un [:portkey.aws.lambda.-2014-11-11.list-event-sources-response/NextMarker :portkey.aws.lambda.-2014-11-11.list-event-sources-response/EventSources] :locations {}))

(clojure.spec.alpha/def :portkey.aws.lambda.-2014-11-11/get-function-configuration-request (portkey.aws/json-keys :req-un [:portkey.aws.lambda.-2014-11-11/FunctionName] :opt-un [] :locations {}))

(clojure.spec.alpha/def :portkey.aws.lambda.-2014-11-11.get-event-source-request/uuid (clojure.spec.alpha/and :portkey.aws.lambda.-2014-11-11/string))
(clojure.spec.alpha/def :portkey.aws.lambda.-2014-11-11/get-event-source-request (portkey.aws/json-keys :req-un [:portkey.aws.lambda.-2014-11-11.get-event-source-request/UUID] :opt-un [] :locations {}))

(clojure.spec.alpha/def :portkey.aws.lambda.-2014-11-11/blob (clojure.spec.alpha/and clojure.core/bytes? (clojure.spec.alpha/conformer portkey.aws/base64-encode portkey.aws/base64-decode)))

(clojure.spec.alpha/def :portkey.aws.lambda.-2014-11-11/event-source-list (clojure.spec.alpha/and (clojure.spec.alpha/coll-of :portkey.aws.lambda.-2014-11-11/event-source-configuration) (clojure.spec.alpha/conformer clojure.core/identity (fn* [p1__13687__13688__auto__] (if (clojure.core/sequential? p1__13687__13688__auto__) p1__13687__13688__auto__ [p1__13687__13688__auto__])))))

(clojure.spec.alpha/def :portkey.aws.lambda.-2014-11-11.event-source-configuration/is-active (clojure.spec.alpha/and :portkey.aws.lambda.-2014-11-11/boolean))
(clojure.spec.alpha/def :portkey.aws.lambda.-2014-11-11.event-source-configuration/batch-size (clojure.spec.alpha/and :portkey.aws.lambda.-2014-11-11/integer))
(clojure.spec.alpha/def :portkey.aws.lambda.-2014-11-11.event-source-configuration/parameters (clojure.spec.alpha/and :portkey.aws.lambda.-2014-11-11/map))
(clojure.spec.alpha/def :portkey.aws.lambda.-2014-11-11.event-source-configuration/status (clojure.spec.alpha/and :portkey.aws.lambda.-2014-11-11/string))
(clojure.spec.alpha/def :portkey.aws.lambda.-2014-11-11.event-source-configuration/role (clojure.spec.alpha/and :portkey.aws.lambda.-2014-11-11/role-arn))
(clojure.spec.alpha/def :portkey.aws.lambda.-2014-11-11.event-source-configuration/last-modified (clojure.spec.alpha/and :portkey.aws.lambda.-2014-11-11/timestamp))
(clojure.spec.alpha/def :portkey.aws.lambda.-2014-11-11.event-source-configuration/event-source (clojure.spec.alpha/and :portkey.aws.lambda.-2014-11-11/string))
(clojure.spec.alpha/def :portkey.aws.lambda.-2014-11-11.event-source-configuration/uuid (clojure.spec.alpha/and :portkey.aws.lambda.-2014-11-11/string))
(clojure.spec.alpha/def :portkey.aws.lambda.-2014-11-11/event-source-configuration (portkey.aws/json-keys :req-un [] :opt-un [:portkey.aws.lambda.-2014-11-11.event-source-configuration/IsActive :portkey.aws.lambda.-2014-11-11.event-source-configuration/BatchSize :portkey.aws.lambda.-2014-11-11/FunctionName :portkey.aws.lambda.-2014-11-11.event-source-configuration/Parameters :portkey.aws.lambda.-2014-11-11.event-source-configuration/Status :portkey.aws.lambda.-2014-11-11.event-source-configuration/Role :portkey.aws.lambda.-2014-11-11.event-source-configuration/LastModified :portkey.aws.lambda.-2014-11-11.event-source-configuration/EventSource :portkey.aws.lambda.-2014-11-11.event-source-configuration/UUID] :locations {}))

(clojure.spec.alpha/def :portkey.aws.lambda.-2014-11-11.invalid-parameter-value-exception/type (clojure.spec.alpha/and :portkey.aws.lambda.-2014-11-11/string))
(clojure.spec.alpha/def :portkey.aws.lambda.-2014-11-11.invalid-parameter-value-exception/message (clojure.spec.alpha/and :portkey.aws.lambda.-2014-11-11/string))
(clojure.spec.alpha/def :portkey.aws.lambda.-2014-11-11/invalid-parameter-value-exception (portkey.aws/json-keys :req-un [] :opt-un [:portkey.aws.lambda.-2014-11-11.invalid-parameter-value-exception/Type :portkey.aws.lambda.-2014-11-11.invalid-parameter-value-exception/message] :locations {}))

(clojure.spec.alpha/def :portkey.aws.lambda.-2014-11-11.function-code-location/repository-type (clojure.spec.alpha/and :portkey.aws.lambda.-2014-11-11/string))
(clojure.spec.alpha/def :portkey.aws.lambda.-2014-11-11.function-code-location/location (clojure.spec.alpha/and :portkey.aws.lambda.-2014-11-11/string))
(clojure.spec.alpha/def :portkey.aws.lambda.-2014-11-11/function-code-location (portkey.aws/json-keys :req-un [] :opt-un [:portkey.aws.lambda.-2014-11-11.function-code-location/RepositoryType :portkey.aws.lambda.-2014-11-11.function-code-location/Location] :locations {}))

(clojure.spec.alpha/def :portkey.aws.lambda.-2014-11-11/boolean clojure.core/boolean?)

(clojure.core/defn delete-function "Deletes the specified Lambda function code and configuration.\n This operation requires permission for the lambda:DeleteFunction action." ([delete-function-request] (portkey.aws/-rest-json-call portkey.aws.lambda.-2014-11-11/endpoints "DELETE" "/2014-11-13/functions/{FunctionName}" delete-function-request :portkey.aws.lambda.-2014-11-11/delete-function-request {:payload nil, :move {}, :headers {}, :uri {"FunctionName" "FunctionName"}, :querystring {}} 204 nil {"ServiceException" :portkey.aws.lambda.-2014-11-11/service-exception, "ResourceNotFoundException" :portkey.aws.lambda.-2014-11-11/resource-not-found-exception})))
(clojure.spec.alpha/fdef delete-function :args (clojure.spec.alpha/tuple :portkey.aws.lambda.-2014-11-11/delete-function-request) :ret clojure.core/true?)

(clojure.core/defn add-event-source "Identifies a stream as an event source for an AWS Lambda function. It can be\neither an Amazon Kinesis stream or a Amazon DynamoDB stream. AWS Lambda invokes\nthe specified function when records are posted to the stream.\n This is the pull model, where AWS Lambda invokes the function. For more\ninformation, go to AWS Lambda: How it Works\n(http://docs.aws.amazon.com/lambda/latest/dg/lambda-introduction.html) in the\nAWS Lambda Developer Guide.\n This association between an Amazon Kinesis stream and an AWS Lambda function is\ncalled the event source mapping. You provide the configuration information (for\nexample, which stream to read from and which AWS Lambda function to invoke) for\nthe event source mapping in the request body.\n Each event source, such as a Kinesis stream, can only be associated with one\nAWS Lambda function. If you call AddEventSource for an event source that is\nalready mapped to another AWS Lambda function, the existing mapping is updated\nto call the new function instead of the old one.\n This operation requires permission for the iam:PassRole action for the IAM\nrole. It also requires permission for the lambda:AddEventSource action." ([add-event-source-request] (portkey.aws/-rest-json-call portkey.aws.lambda.-2014-11-11/endpoints "POST" "/2014-11-13/event-source-mappings/" add-event-source-request :portkey.aws.lambda.-2014-11-11/add-event-source-request {:payload nil, :move {}, :headers {}, :uri {}, :querystring {}} nil :portkey.aws.lambda.-2014-11-11/event-source-configuration {"ServiceException" :portkey.aws.lambda.-2014-11-11/service-exception, "InvalidParameterValueException" :portkey.aws.lambda.-2014-11-11/invalid-parameter-value-exception})))
(clojure.spec.alpha/fdef add-event-source :args (clojure.spec.alpha/tuple :portkey.aws.lambda.-2014-11-11/add-event-source-request) :ret (clojure.spec.alpha/and :portkey.aws.lambda.-2014-11-11/event-source-configuration))

(clojure.core/defn invoke-async "Submits an invocation request to AWS Lambda. Upon receiving the request, Lambda\nexecutes the specified function asynchronously. To see the logs generated by the\nLambda function execution, see the CloudWatch logs console.\n This operation requires permission for the lambda:InvokeFunction action." ([invoke-async-request] (portkey.aws/-rest-json-call portkey.aws.lambda.-2014-11-11/endpoints "POST" "/2014-11-13/functions/{FunctionName}/invoke-async/" invoke-async-request :portkey.aws.lambda.-2014-11-11/invoke-async-request {:payload "InvokeArgs", :move {}, :headers {}, :uri {"FunctionName" "FunctionName"}, :querystring {}} 202 :portkey.aws.lambda.-2014-11-11/invoke-async-response {"ServiceException" :portkey.aws.lambda.-2014-11-11/service-exception, "ResourceNotFoundException" :portkey.aws.lambda.-2014-11-11/resource-not-found-exception, "InvalidRequestContentException" :portkey.aws.lambda.-2014-11-11/invalid-request-content-exception})))
(clojure.spec.alpha/fdef invoke-async :args (clojure.spec.alpha/tuple :portkey.aws.lambda.-2014-11-11/invoke-async-request) :ret (clojure.spec.alpha/and :portkey.aws.lambda.-2014-11-11/invoke-async-response))

(clojure.core/defn remove-event-source "Removes an event source mapping. This means AWS Lambda will no longer invoke the\nfunction for events in the associated source.\n This operation requires permission for the lambda:RemoveEventSource action." ([remove-event-source-request] (portkey.aws/-rest-json-call portkey.aws.lambda.-2014-11-11/endpoints "DELETE" "/2014-11-13/event-source-mappings/{UUID}" remove-event-source-request :portkey.aws.lambda.-2014-11-11/remove-event-source-request {:payload nil, :move {}, :headers {}, :uri {"UUID" "UUID"}, :querystring {}} 204 nil {"ServiceException" :portkey.aws.lambda.-2014-11-11/service-exception, "ResourceNotFoundException" :portkey.aws.lambda.-2014-11-11/resource-not-found-exception, "InvalidParameterValueException" :portkey.aws.lambda.-2014-11-11/invalid-parameter-value-exception})))
(clojure.spec.alpha/fdef remove-event-source :args (clojure.spec.alpha/tuple :portkey.aws.lambda.-2014-11-11/remove-event-source-request) :ret clojure.core/true?)

(clojure.core/defn get-function-configuration "Returns the configuration information of the Lambda function. This the same\ninformation you provided as parameters when uploading the function by using\nUploadFunction.\n This operation requires permission for the lambda:GetFunctionConfiguration\noperation." ([get-function-configuration-request] (portkey.aws/-rest-json-call portkey.aws.lambda.-2014-11-11/endpoints "GET" "/2014-11-13/functions/{FunctionName}/configuration" get-function-configuration-request :portkey.aws.lambda.-2014-11-11/get-function-configuration-request {:payload nil, :move {}, :headers {}, :uri {"FunctionName" "FunctionName"}, :querystring {}} 200 :portkey.aws.lambda.-2014-11-11/function-configuration {"ServiceException" :portkey.aws.lambda.-2014-11-11/service-exception, "ResourceNotFoundException" :portkey.aws.lambda.-2014-11-11/resource-not-found-exception})))
(clojure.spec.alpha/fdef get-function-configuration :args (clojure.spec.alpha/tuple :portkey.aws.lambda.-2014-11-11/get-function-configuration-request) :ret (clojure.spec.alpha/and :portkey.aws.lambda.-2014-11-11/function-configuration))

(clojure.core/defn upload-function "Creates a new Lambda function or updates an existing function. The function\nmetadata is created from the request parameters, and the code for the function\nis provided by a .zip file in the request body. If the function name already\nexists, the existing Lambda function is updated with the new code and metadata.\n This operation requires permission for the lambda:UploadFunction action." ([upload-function-request] (portkey.aws/-rest-json-call portkey.aws.lambda.-2014-11-11/endpoints "PUT" "/2014-11-13/functions/{FunctionName}" upload-function-request :portkey.aws.lambda.-2014-11-11/upload-function-request {:payload "FunctionZip", :move {}, :headers {}, :uri {"FunctionName" "FunctionName"}, :querystring {"Timeout" "Timeout", "Handler" "Handler", "Runtime" "Runtime", "Mode" "Mode", "MemorySize" "MemorySize", "Role" "Role", "Description" "Description"}} 201 :portkey.aws.lambda.-2014-11-11/function-configuration {"ServiceException" :portkey.aws.lambda.-2014-11-11/service-exception, "InvalidParameterValueException" :portkey.aws.lambda.-2014-11-11/invalid-parameter-value-exception, "ResourceNotFoundException" :portkey.aws.lambda.-2014-11-11/resource-not-found-exception})))
(clojure.spec.alpha/fdef upload-function :args (clojure.spec.alpha/tuple :portkey.aws.lambda.-2014-11-11/upload-function-request) :ret (clojure.spec.alpha/and :portkey.aws.lambda.-2014-11-11/function-configuration))

(clojure.core/defn list-event-sources "Returns a list of event source mappings you created using the AddEventSource\n(see AddEventSource), where you identify a stream as event source. This list\ndoes not include Amazon S3 event sources.\n For each mapping, the API returns configuration information. You can optionally\nspecify filters to retrieve specific event source mappings.\n This operation requires permission for the lambda:ListEventSources action." ([] (list-event-sources {})) ([list-event-sources-request] (portkey.aws/-rest-json-call portkey.aws.lambda.-2014-11-11/endpoints "GET" "/2014-11-13/event-source-mappings/" list-event-sources-request :portkey.aws.lambda.-2014-11-11/list-event-sources-request {:payload nil, :move {}, :headers {}, :uri {}, :querystring {"EventSource" "EventSourceArn", "FunctionName" "FunctionName", "Marker" "Marker", "MaxItems" "MaxItems"}} 200 :portkey.aws.lambda.-2014-11-11/list-event-sources-response {"ServiceException" :portkey.aws.lambda.-2014-11-11/service-exception, "ResourceNotFoundException" :portkey.aws.lambda.-2014-11-11/resource-not-found-exception, "InvalidParameterValueException" :portkey.aws.lambda.-2014-11-11/invalid-parameter-value-exception})))
(clojure.spec.alpha/fdef list-event-sources :args (clojure.spec.alpha/? :portkey.aws.lambda.-2014-11-11/list-event-sources-request) :ret (clojure.spec.alpha/and :portkey.aws.lambda.-2014-11-11/list-event-sources-response))

(clojure.core/defn get-function "Returns the configuration information of the Lambda function and a presigned URL\nlink to the .zip file you uploaded with UploadFunction so you can download the\n.zip file. Note that the URL is valid for up to 10 minutes. The configuration\ninformation is the same information you provided as parameters when uploading\nthe function.\n This operation requires permission for the lambda:GetFunction action." ([get-function-request] (portkey.aws/-rest-json-call portkey.aws.lambda.-2014-11-11/endpoints "GET" "/2014-11-13/functions/{FunctionName}" get-function-request :portkey.aws.lambda.-2014-11-11/get-function-request {:payload nil, :move {}, :headers {}, :uri {"FunctionName" "FunctionName"}, :querystring {}} 200 :portkey.aws.lambda.-2014-11-11/get-function-response {"ServiceException" :portkey.aws.lambda.-2014-11-11/service-exception, "ResourceNotFoundException" :portkey.aws.lambda.-2014-11-11/resource-not-found-exception})))
(clojure.spec.alpha/fdef get-function :args (clojure.spec.alpha/tuple :portkey.aws.lambda.-2014-11-11/get-function-request) :ret (clojure.spec.alpha/and :portkey.aws.lambda.-2014-11-11/get-function-response))

(clojure.core/defn list-functions "Returns a list of your Lambda functions. For each function, the response\nincludes the function configuration information. You must use GetFunction to\nretrieve the code for your function.\n This operation requires permission for the lambda:ListFunctions action." ([] (list-functions {})) ([list-functions-request] (portkey.aws/-rest-json-call portkey.aws.lambda.-2014-11-11/endpoints "GET" "/2014-11-13/functions/" list-functions-request :portkey.aws.lambda.-2014-11-11/list-functions-request {:payload nil, :move {}, :headers {}, :uri {}, :querystring {"Marker" "Marker", "MaxItems" "MaxItems"}} 200 :portkey.aws.lambda.-2014-11-11/list-functions-response {"ServiceException" :portkey.aws.lambda.-2014-11-11/service-exception})))
(clojure.spec.alpha/fdef list-functions :args (clojure.spec.alpha/? :portkey.aws.lambda.-2014-11-11/list-functions-request) :ret (clojure.spec.alpha/and :portkey.aws.lambda.-2014-11-11/list-functions-response))

(clojure.core/defn update-function-configuration "Updates the configuration parameters for the specified Lambda function by using\nthe values provided in the request. You provide only the parameters you want to\nchange. This operation must only be used on an existing Lambda function and\ncannot be used to update the function's code.\n This operation requires permission for the lambda:UpdateFunctionConfiguration\naction." ([update-function-configuration-request] (portkey.aws/-rest-json-call portkey.aws.lambda.-2014-11-11/endpoints "PUT" "/2014-11-13/functions/{FunctionName}/configuration" update-function-configuration-request :portkey.aws.lambda.-2014-11-11/update-function-configuration-request {:payload nil, :move {}, :headers {}, :uri {"FunctionName" "FunctionName"}, :querystring {"Role" "Role", "Handler" "Handler", "Description" "Description", "Timeout" "Timeout", "MemorySize" "MemorySize"}} 200 :portkey.aws.lambda.-2014-11-11/function-configuration {"ServiceException" :portkey.aws.lambda.-2014-11-11/service-exception, "ResourceNotFoundException" :portkey.aws.lambda.-2014-11-11/resource-not-found-exception, "InvalidParameterValueException" :portkey.aws.lambda.-2014-11-11/invalid-parameter-value-exception})))
(clojure.spec.alpha/fdef update-function-configuration :args (clojure.spec.alpha/tuple :portkey.aws.lambda.-2014-11-11/update-function-configuration-request) :ret (clojure.spec.alpha/and :portkey.aws.lambda.-2014-11-11/function-configuration))

(clojure.core/defn get-event-source "Returns configuration information for the specified event source mapping (see\nAddEventSource).\n This operation requires permission for the lambda:GetEventSource action." ([get-event-source-request] (portkey.aws/-rest-json-call portkey.aws.lambda.-2014-11-11/endpoints "GET" "/2014-11-13/event-source-mappings/{UUID}" get-event-source-request :portkey.aws.lambda.-2014-11-11/get-event-source-request {:payload nil, :move {}, :headers {}, :uri {"UUID" "UUID"}, :querystring {}} 200 :portkey.aws.lambda.-2014-11-11/event-source-configuration {"ServiceException" :portkey.aws.lambda.-2014-11-11/service-exception, "ResourceNotFoundException" :portkey.aws.lambda.-2014-11-11/resource-not-found-exception, "InvalidParameterValueException" :portkey.aws.lambda.-2014-11-11/invalid-parameter-value-exception})))
(clojure.spec.alpha/fdef get-event-source :args (clojure.spec.alpha/tuple :portkey.aws.lambda.-2014-11-11/get-event-source-request) :ret (clojure.spec.alpha/and :portkey.aws.lambda.-2014-11-11/event-source-configuration))
