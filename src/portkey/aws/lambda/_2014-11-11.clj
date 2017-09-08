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
(clojure.spec.alpha/def :portkey.aws.lambda.-2014-11-11/add-event-source-request (portkey.aws/json-keys :req-un [:portkey.aws.lambda.-2014-11-11.add-event-source-request/EventSource :portkey.aws.lambda.-2014-11-11/FunctionName :portkey.aws.lambda.-2014-11-11.add-event-source-request/Role] :opt-un [:portkey.aws.lambda.-2014-11-11.add-event-source-request/BatchSize :portkey.aws.lambda.-2014-11-11.add-event-source-request/Parameters]))

(clojure.spec.alpha/def :portkey.aws.lambda.-2014-11-11/function-arn (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__8151__auto__] (clojure.core/re-matches #"arn:aws:lambda:[a-z]{2}-[a-z]+-\d{1}:\d{12}:function:[a-zA-Z0-9-_]+(\/[0-9a-f]{8}-[0-9a-f]{4}-[0-9a-f]{4}-[0-9a-f]{4}-[0-9a-f]{12})?" s__8151__auto__))))

(clojure.spec.alpha/def :portkey.aws.lambda.-2014-11-11/function-name (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__8149__auto__] (clojure.core/<= 1 (clojure.core/count s__8149__auto__))) (clojure.core/fn [s__8150__auto__] (clojure.core/< (clojure.core/count s__8150__auto__) 64)) (clojure.core/fn [s__8151__auto__] (clojure.core/re-matches #"[a-zA-Z0-9-_]+" s__8151__auto__))))

(clojure.spec.alpha/def :portkey.aws.lambda.-2014-11-11/timeout (clojure.spec.alpha/and clojure.core/int? (fn* [p1__8188__8189__auto__] (clojure.core/<= 1 p1__8188__8189__auto__)) (fn* [p1__8190__8191__auto__] (clojure.core/<= p1__8190__8191__auto__ 60))))

(clojure.spec.alpha/def :portkey.aws.lambda.-2014-11-11.upload-function-request/function-zip (clojure.spec.alpha/and :portkey.aws.lambda.-2014-11-11/blob))
(clojure.spec.alpha/def :portkey.aws.lambda.-2014-11-11.upload-function-request/role (clojure.spec.alpha/and :portkey.aws.lambda.-2014-11-11/role-arn))
(clojure.spec.alpha/def :portkey.aws.lambda.-2014-11-11/upload-function-request (portkey.aws/json-keys :req-un [:portkey.aws.lambda.-2014-11-11/FunctionName :portkey.aws.lambda.-2014-11-11.upload-function-request/FunctionZip :portkey.aws.lambda.-2014-11-11/Runtime :portkey.aws.lambda.-2014-11-11.upload-function-request/Role :portkey.aws.lambda.-2014-11-11/Handler :portkey.aws.lambda.-2014-11-11/Mode] :opt-un [:portkey.aws.lambda.-2014-11-11/Timeout :portkey.aws.lambda.-2014-11-11/MemorySize :portkey.aws.lambda.-2014-11-11/Description]))

(clojure.spec.alpha/def :portkey.aws.lambda.-2014-11-11/map (clojure.spec.alpha/map-of :portkey.aws.lambda.-2014-11-11/string :portkey.aws.lambda.-2014-11-11/string))

(clojure.spec.alpha/def :portkey.aws.lambda.-2014-11-11.remove-event-source-request/uuid (clojure.spec.alpha/and :portkey.aws.lambda.-2014-11-11/string))
(clojure.spec.alpha/def :portkey.aws.lambda.-2014-11-11/remove-event-source-request (portkey.aws/json-keys :req-un [:portkey.aws.lambda.-2014-11-11.remove-event-source-request/UUID] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.lambda.-2014-11-11/handler (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__8151__auto__] (clojure.core/re-matches #"[a-zA-Z0-9./\-_]+" s__8151__auto__))))

(clojure.spec.alpha/def :portkey.aws.lambda.-2014-11-11/function-list (clojure.spec.alpha/coll-of :portkey.aws.lambda.-2014-11-11/function-configuration :max-count nil))

(clojure.spec.alpha/def :portkey.aws.lambda.-2014-11-11/runtime (clojure.spec.alpha/conformer (clojure.core/let [m__8147__auto__ {"nodejs" "nodejs", :nodejs "nodejs"}] (clojure.core/fn [s__8148__auto__] (m__8147__auto__ s__8148__auto__ :clojure.spec.alpha/invalid))) (clojure.core/comp clojure.core/keyword portkey.aws/dashed)))

(clojure.spec.alpha/def :portkey.aws.lambda.-2014-11-11/role-arn (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__8151__auto__] (clojure.core/re-matches #"arn:aws:iam::\d{12}:role/?[a-zA-Z_0-9+=,.@\-_/]+" s__8151__auto__))))

(clojure.spec.alpha/def :portkey.aws.lambda.-2014-11-11.service-exception/type (clojure.spec.alpha/and :portkey.aws.lambda.-2014-11-11/string))
(clojure.spec.alpha/def :portkey.aws.lambda.-2014-11-11.service-exception/message (clojure.spec.alpha/and :portkey.aws.lambda.-2014-11-11/string))
(clojure.spec.alpha/def :portkey.aws.lambda.-2014-11-11/service-exception (portkey.aws/json-keys :req-un [] :opt-un [:portkey.aws.lambda.-2014-11-11.service-exception/Type :portkey.aws.lambda.-2014-11-11.service-exception/Message]))

(clojure.spec.alpha/def :portkey.aws.lambda.-2014-11-11.list-functions-response/next-marker (clojure.spec.alpha/and :portkey.aws.lambda.-2014-11-11/string))
(clojure.spec.alpha/def :portkey.aws.lambda.-2014-11-11.list-functions-response/functions (clojure.spec.alpha/and :portkey.aws.lambda.-2014-11-11/function-list))
(clojure.spec.alpha/def :portkey.aws.lambda.-2014-11-11/list-functions-response (portkey.aws/json-keys :req-un [] :opt-un [:portkey.aws.lambda.-2014-11-11.list-functions-response/NextMarker :portkey.aws.lambda.-2014-11-11.list-functions-response/Functions]))

(clojure.spec.alpha/def :portkey.aws.lambda.-2014-11-11/delete-function-request (portkey.aws/json-keys :req-un [:portkey.aws.lambda.-2014-11-11/FunctionName] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.lambda.-2014-11-11/mode (clojure.spec.alpha/conformer (clojure.core/let [m__8147__auto__ {"event" "event", :event "event"}] (clojure.core/fn [s__8148__auto__] (m__8147__auto__ s__8148__auto__ :clojure.spec.alpha/invalid))) (clojure.core/comp clojure.core/keyword portkey.aws/dashed)))

(clojure.spec.alpha/def :portkey.aws.lambda.-2014-11-11.get-function-response/configuration (clojure.spec.alpha/and :portkey.aws.lambda.-2014-11-11/function-configuration))
(clojure.spec.alpha/def :portkey.aws.lambda.-2014-11-11.get-function-response/code (clojure.spec.alpha/and :portkey.aws.lambda.-2014-11-11/function-code-location))
(clojure.spec.alpha/def :portkey.aws.lambda.-2014-11-11/get-function-response (portkey.aws/json-keys :req-un [] :opt-un [:portkey.aws.lambda.-2014-11-11.get-function-response/Configuration :portkey.aws.lambda.-2014-11-11.get-function-response/Code]))

(clojure.spec.alpha/def :portkey.aws.lambda.-2014-11-11/memory-size (clojure.spec.alpha/and clojure.core/int? (fn* [p1__8188__8189__auto__] (clojure.core/<= 128 p1__8188__8189__auto__)) (fn* [p1__8190__8191__auto__] (clojure.core/<= p1__8190__8191__auto__ 1024))))

(clojure.spec.alpha/def :portkey.aws.lambda.-2014-11-11.invalid-request-content-exception/type (clojure.spec.alpha/and :portkey.aws.lambda.-2014-11-11/string))
(clojure.spec.alpha/def :portkey.aws.lambda.-2014-11-11.invalid-request-content-exception/message (clojure.spec.alpha/and :portkey.aws.lambda.-2014-11-11/string))
(clojure.spec.alpha/def :portkey.aws.lambda.-2014-11-11/invalid-request-content-exception (portkey.aws/json-keys :req-un [] :opt-un [:portkey.aws.lambda.-2014-11-11.invalid-request-content-exception/Type :portkey.aws.lambda.-2014-11-11.invalid-request-content-exception/message]))

(clojure.spec.alpha/def :portkey.aws.lambda.-2014-11-11.resource-not-found-exception/type (clojure.spec.alpha/and :portkey.aws.lambda.-2014-11-11/string))
(clojure.spec.alpha/def :portkey.aws.lambda.-2014-11-11.resource-not-found-exception/message (clojure.spec.alpha/and :portkey.aws.lambda.-2014-11-11/string))
(clojure.spec.alpha/def :portkey.aws.lambda.-2014-11-11/resource-not-found-exception (portkey.aws/json-keys :req-un [] :opt-un [:portkey.aws.lambda.-2014-11-11.resource-not-found-exception/Type :portkey.aws.lambda.-2014-11-11.resource-not-found-exception/Message]))

(clojure.spec.alpha/def :portkey.aws.lambda.-2014-11-11.invoke-async-request/invoke-args (clojure.spec.alpha/and :portkey.aws.lambda.-2014-11-11/blob))
(clojure.spec.alpha/def :portkey.aws.lambda.-2014-11-11/invoke-async-request (portkey.aws/json-keys :req-un [:portkey.aws.lambda.-2014-11-11/FunctionName :portkey.aws.lambda.-2014-11-11.invoke-async-request/InvokeArgs] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.lambda.-2014-11-11/description (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__8149__auto__] (clojure.core/<= 0 (clojure.core/count s__8149__auto__))) (clojure.core/fn [s__8150__auto__] (clojure.core/< (clojure.core/count s__8150__auto__) 256))))

(clojure.spec.alpha/def :portkey.aws.lambda.-2014-11-11/max-list-items (clojure.spec.alpha/and clojure.core/int? (fn* [p1__8188__8189__auto__] (clojure.core/<= 1 p1__8188__8189__auto__)) (fn* [p1__8190__8191__auto__] (clojure.core/<= p1__8190__8191__auto__ 10000))))

(clojure.spec.alpha/def :portkey.aws.lambda.-2014-11-11/integer (clojure.spec.alpha/and clojure.core/int?))

(clojure.spec.alpha/def :portkey.aws.lambda.-2014-11-11/string (clojure.spec.alpha/and clojure.core/string?))

(clojure.spec.alpha/def :portkey.aws.lambda.-2014-11-11/get-function-request (portkey.aws/json-keys :req-un [:portkey.aws.lambda.-2014-11-11/FunctionName] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.lambda.-2014-11-11.invoke-async-response/status (clojure.spec.alpha/and :portkey.aws.lambda.-2014-11-11/http-status))
(clojure.spec.alpha/def :portkey.aws.lambda.-2014-11-11/invoke-async-response (portkey.aws/json-keys :req-un [] :opt-un [:portkey.aws.lambda.-2014-11-11.invoke-async-response/Status]))

(clojure.spec.alpha/def :portkey.aws.lambda.-2014-11-11.update-function-configuration-request/role (clojure.spec.alpha/and :portkey.aws.lambda.-2014-11-11/role-arn))
(clojure.spec.alpha/def :portkey.aws.lambda.-2014-11-11/update-function-configuration-request (portkey.aws/json-keys :req-un [:portkey.aws.lambda.-2014-11-11/FunctionName] :opt-un [:portkey.aws.lambda.-2014-11-11.update-function-configuration-request/Role :portkey.aws.lambda.-2014-11-11/Handler :portkey.aws.lambda.-2014-11-11/Description :portkey.aws.lambda.-2014-11-11/Timeout :portkey.aws.lambda.-2014-11-11/MemorySize]))

(clojure.spec.alpha/def :portkey.aws.lambda.-2014-11-11.list-event-sources-request/event-source-arn (clojure.spec.alpha/and :portkey.aws.lambda.-2014-11-11/string))
(clojure.spec.alpha/def :portkey.aws.lambda.-2014-11-11.list-event-sources-request/marker (clojure.spec.alpha/and :portkey.aws.lambda.-2014-11-11/string))
(clojure.spec.alpha/def :portkey.aws.lambda.-2014-11-11.list-event-sources-request/max-items (clojure.spec.alpha/and :portkey.aws.lambda.-2014-11-11/max-list-items))
(clojure.spec.alpha/def :portkey.aws.lambda.-2014-11-11/list-event-sources-request (portkey.aws/json-keys :req-un [] :opt-un [:portkey.aws.lambda.-2014-11-11.list-event-sources-request/EventSourceArn :portkey.aws.lambda.-2014-11-11/FunctionName :portkey.aws.lambda.-2014-11-11.list-event-sources-request/Marker :portkey.aws.lambda.-2014-11-11.list-event-sources-request/MaxItems]))

(clojure.spec.alpha/def :portkey.aws.lambda.-2014-11-11/http-status (clojure.spec.alpha/and clojure.core/int?))

(clojure.spec.alpha/def :portkey.aws.lambda.-2014-11-11.function-configuration/configuration-id (clojure.spec.alpha/and :portkey.aws.lambda.-2014-11-11/string))
(clojure.spec.alpha/def :portkey.aws.lambda.-2014-11-11.function-configuration/role (clojure.spec.alpha/and :portkey.aws.lambda.-2014-11-11/role-arn))
(clojure.spec.alpha/def :portkey.aws.lambda.-2014-11-11.function-configuration/last-modified (clojure.spec.alpha/and :portkey.aws.lambda.-2014-11-11/timestamp))
(clojure.spec.alpha/def :portkey.aws.lambda.-2014-11-11.function-configuration/code-size (clojure.spec.alpha/and :portkey.aws.lambda.-2014-11-11/long))
(clojure.spec.alpha/def :portkey.aws.lambda.-2014-11-11.function-configuration/functionarn (clojure.spec.alpha/and :portkey.aws.lambda.-2014-11-11/function-arn))
(clojure.spec.alpha/def :portkey.aws.lambda.-2014-11-11/function-configuration (portkey.aws/json-keys :req-un [] :opt-un [:portkey.aws.lambda.-2014-11-11/FunctionName :portkey.aws.lambda.-2014-11-11/Timeout :portkey.aws.lambda.-2014-11-11/Handler :portkey.aws.lambda.-2014-11-11/Runtime :portkey.aws.lambda.-2014-11-11.function-configuration/ConfigurationId :portkey.aws.lambda.-2014-11-11/Mode :portkey.aws.lambda.-2014-11-11/MemorySize :portkey.aws.lambda.-2014-11-11.function-configuration/Role :portkey.aws.lambda.-2014-11-11/Description :portkey.aws.lambda.-2014-11-11.function-configuration/LastModified :portkey.aws.lambda.-2014-11-11.function-configuration/CodeSize :portkey.aws.lambda.-2014-11-11.function-configuration/FunctionARN]))

(clojure.spec.alpha/def :portkey.aws.lambda.-2014-11-11/long clojure.core/int?)

(clojure.spec.alpha/def :portkey.aws.lambda.-2014-11-11/timestamp (clojure.spec.alpha/and clojure.core/string?))

(clojure.spec.alpha/def :portkey.aws.lambda.-2014-11-11.list-functions-request/marker (clojure.spec.alpha/and :portkey.aws.lambda.-2014-11-11/string))
(clojure.spec.alpha/def :portkey.aws.lambda.-2014-11-11.list-functions-request/max-items (clojure.spec.alpha/and :portkey.aws.lambda.-2014-11-11/max-list-items))
(clojure.spec.alpha/def :portkey.aws.lambda.-2014-11-11/list-functions-request (portkey.aws/json-keys :req-un [] :opt-un [:portkey.aws.lambda.-2014-11-11.list-functions-request/Marker :portkey.aws.lambda.-2014-11-11.list-functions-request/MaxItems]))

(clojure.spec.alpha/def :portkey.aws.lambda.-2014-11-11.list-event-sources-response/next-marker (clojure.spec.alpha/and :portkey.aws.lambda.-2014-11-11/string))
(clojure.spec.alpha/def :portkey.aws.lambda.-2014-11-11.list-event-sources-response/event-sources (clojure.spec.alpha/and :portkey.aws.lambda.-2014-11-11/event-source-list))
(clojure.spec.alpha/def :portkey.aws.lambda.-2014-11-11/list-event-sources-response (portkey.aws/json-keys :req-un [] :opt-un [:portkey.aws.lambda.-2014-11-11.list-event-sources-response/NextMarker :portkey.aws.lambda.-2014-11-11.list-event-sources-response/EventSources]))

(clojure.spec.alpha/def :portkey.aws.lambda.-2014-11-11/get-function-configuration-request (portkey.aws/json-keys :req-un [:portkey.aws.lambda.-2014-11-11/FunctionName] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.lambda.-2014-11-11.get-event-source-request/uuid (clojure.spec.alpha/and :portkey.aws.lambda.-2014-11-11/string))
(clojure.spec.alpha/def :portkey.aws.lambda.-2014-11-11/get-event-source-request (portkey.aws/json-keys :req-un [:portkey.aws.lambda.-2014-11-11.get-event-source-request/UUID] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.lambda.-2014-11-11/blob (clojure.spec.alpha/and clojure.core/bytes? (clojure.spec.alpha/conformer portkey.aws/base64-encode portkey.aws/base64-decode)))

(clojure.spec.alpha/def :portkey.aws.lambda.-2014-11-11/event-source-list (clojure.spec.alpha/coll-of :portkey.aws.lambda.-2014-11-11/event-source-configuration :max-count nil))

(clojure.spec.alpha/def :portkey.aws.lambda.-2014-11-11.event-source-configuration/is-active (clojure.spec.alpha/and :portkey.aws.lambda.-2014-11-11/boolean))
(clojure.spec.alpha/def :portkey.aws.lambda.-2014-11-11.event-source-configuration/batch-size (clojure.spec.alpha/and :portkey.aws.lambda.-2014-11-11/integer))
(clojure.spec.alpha/def :portkey.aws.lambda.-2014-11-11.event-source-configuration/parameters (clojure.spec.alpha/and :portkey.aws.lambda.-2014-11-11/map))
(clojure.spec.alpha/def :portkey.aws.lambda.-2014-11-11.event-source-configuration/status (clojure.spec.alpha/and :portkey.aws.lambda.-2014-11-11/string))
(clojure.spec.alpha/def :portkey.aws.lambda.-2014-11-11.event-source-configuration/role (clojure.spec.alpha/and :portkey.aws.lambda.-2014-11-11/role-arn))
(clojure.spec.alpha/def :portkey.aws.lambda.-2014-11-11.event-source-configuration/last-modified (clojure.spec.alpha/and :portkey.aws.lambda.-2014-11-11/timestamp))
(clojure.spec.alpha/def :portkey.aws.lambda.-2014-11-11.event-source-configuration/event-source (clojure.spec.alpha/and :portkey.aws.lambda.-2014-11-11/string))
(clojure.spec.alpha/def :portkey.aws.lambda.-2014-11-11.event-source-configuration/uuid (clojure.spec.alpha/and :portkey.aws.lambda.-2014-11-11/string))
(clojure.spec.alpha/def :portkey.aws.lambda.-2014-11-11/event-source-configuration (portkey.aws/json-keys :req-un [] :opt-un [:portkey.aws.lambda.-2014-11-11.event-source-configuration/IsActive :portkey.aws.lambda.-2014-11-11.event-source-configuration/BatchSize :portkey.aws.lambda.-2014-11-11/FunctionName :portkey.aws.lambda.-2014-11-11.event-source-configuration/Parameters :portkey.aws.lambda.-2014-11-11.event-source-configuration/Status :portkey.aws.lambda.-2014-11-11.event-source-configuration/Role :portkey.aws.lambda.-2014-11-11.event-source-configuration/LastModified :portkey.aws.lambda.-2014-11-11.event-source-configuration/EventSource :portkey.aws.lambda.-2014-11-11.event-source-configuration/UUID]))

(clojure.spec.alpha/def :portkey.aws.lambda.-2014-11-11.invalid-parameter-value-exception/type (clojure.spec.alpha/and :portkey.aws.lambda.-2014-11-11/string))
(clojure.spec.alpha/def :portkey.aws.lambda.-2014-11-11.invalid-parameter-value-exception/message (clojure.spec.alpha/and :portkey.aws.lambda.-2014-11-11/string))
(clojure.spec.alpha/def :portkey.aws.lambda.-2014-11-11/invalid-parameter-value-exception (portkey.aws/json-keys :req-un [] :opt-un [:portkey.aws.lambda.-2014-11-11.invalid-parameter-value-exception/Type :portkey.aws.lambda.-2014-11-11.invalid-parameter-value-exception/message]))

(clojure.spec.alpha/def :portkey.aws.lambda.-2014-11-11.function-code-location/repository-type (clojure.spec.alpha/and :portkey.aws.lambda.-2014-11-11/string))
(clojure.spec.alpha/def :portkey.aws.lambda.-2014-11-11.function-code-location/location (clojure.spec.alpha/and :portkey.aws.lambda.-2014-11-11/string))
(clojure.spec.alpha/def :portkey.aws.lambda.-2014-11-11/function-code-location (portkey.aws/json-keys :req-un [] :opt-un [:portkey.aws.lambda.-2014-11-11.function-code-location/RepositoryType :portkey.aws.lambda.-2014-11-11.function-code-location/Location]))

(clojure.spec.alpha/def :portkey.aws.lambda.-2014-11-11/boolean clojure.core/boolean?)

(clojure.core/defn delete-function [input__8278__auto__] (portkey.aws/-rest-json-call portkey.aws.lambda.-2014-11-11/endpoints "DELETE" "/2014-11-13/functions/{FunctionName}" input__8278__auto__ :portkey.aws.lambda.-2014-11-11/delete-function-request {:payload nil, :headers {}, :uri {"FunctionName" "FunctionName"}, :querystring {}} 204 nil {"ServiceException" :portkey.aws.lambda.-2014-11-11/service-exception, "ResourceNotFoundException" :portkey.aws.lambda.-2014-11-11/resource-not-found-exception}))
(clojure.spec.alpha/fdef delete-function :args (clojure.spec.alpha/tuple :portkey.aws.lambda.-2014-11-11/delete-function-request))

(clojure.core/defn add-event-source [input__8278__auto__] (portkey.aws/-rest-json-call portkey.aws.lambda.-2014-11-11/endpoints "POST" "/2014-11-13/event-source-mappings/" input__8278__auto__ :portkey.aws.lambda.-2014-11-11/add-event-source-request {:payload nil, :headers {}, :uri {}, :querystring {}} nil :portkey.aws.lambda.-2014-11-11/event-source-configuration {"ServiceException" :portkey.aws.lambda.-2014-11-11/service-exception, "InvalidParameterValueException" :portkey.aws.lambda.-2014-11-11/invalid-parameter-value-exception}))
(clojure.spec.alpha/fdef add-event-source :args (clojure.spec.alpha/tuple :portkey.aws.lambda.-2014-11-11/add-event-source-request) :ret (clojure.spec.alpha/and :portkey.aws.lambda.-2014-11-11/event-source-configuration))

(clojure.core/defn invoke-async [input__8278__auto__] (portkey.aws/-rest-json-call portkey.aws.lambda.-2014-11-11/endpoints "POST" "/2014-11-13/functions/{FunctionName}/invoke-async/" input__8278__auto__ :portkey.aws.lambda.-2014-11-11/invoke-async-request {:payload "InvokeArgs", :headers {}, :uri {"FunctionName" "FunctionName"}, :querystring {}} 202 :portkey.aws.lambda.-2014-11-11/invoke-async-response {"ServiceException" :portkey.aws.lambda.-2014-11-11/service-exception, "ResourceNotFoundException" :portkey.aws.lambda.-2014-11-11/resource-not-found-exception, "InvalidRequestContentException" :portkey.aws.lambda.-2014-11-11/invalid-request-content-exception}))
(clojure.spec.alpha/fdef invoke-async :args (clojure.spec.alpha/tuple :portkey.aws.lambda.-2014-11-11/invoke-async-request) :ret (clojure.spec.alpha/and :portkey.aws.lambda.-2014-11-11/invoke-async-response))

(clojure.core/defn remove-event-source [input__8278__auto__] (portkey.aws/-rest-json-call portkey.aws.lambda.-2014-11-11/endpoints "DELETE" "/2014-11-13/event-source-mappings/{UUID}" input__8278__auto__ :portkey.aws.lambda.-2014-11-11/remove-event-source-request {:payload nil, :headers {}, :uri {"UUID" "UUID"}, :querystring {}} 204 nil {"ServiceException" :portkey.aws.lambda.-2014-11-11/service-exception, "ResourceNotFoundException" :portkey.aws.lambda.-2014-11-11/resource-not-found-exception, "InvalidParameterValueException" :portkey.aws.lambda.-2014-11-11/invalid-parameter-value-exception}))
(clojure.spec.alpha/fdef remove-event-source :args (clojure.spec.alpha/tuple :portkey.aws.lambda.-2014-11-11/remove-event-source-request))

(clojure.core/defn get-function-configuration [input__8278__auto__] (portkey.aws/-rest-json-call portkey.aws.lambda.-2014-11-11/endpoints "GET" "/2014-11-13/functions/{FunctionName}/configuration" input__8278__auto__ :portkey.aws.lambda.-2014-11-11/get-function-configuration-request {:payload nil, :headers {}, :uri {"FunctionName" "FunctionName"}, :querystring {}} 200 :portkey.aws.lambda.-2014-11-11/function-configuration {"ServiceException" :portkey.aws.lambda.-2014-11-11/service-exception, "ResourceNotFoundException" :portkey.aws.lambda.-2014-11-11/resource-not-found-exception}))
(clojure.spec.alpha/fdef get-function-configuration :args (clojure.spec.alpha/tuple :portkey.aws.lambda.-2014-11-11/get-function-configuration-request) :ret (clojure.spec.alpha/and :portkey.aws.lambda.-2014-11-11/function-configuration))

(clojure.core/defn upload-function [input__8278__auto__] (portkey.aws/-rest-json-call portkey.aws.lambda.-2014-11-11/endpoints "PUT" "/2014-11-13/functions/{FunctionName}" input__8278__auto__ :portkey.aws.lambda.-2014-11-11/upload-function-request {:payload "FunctionZip", :headers {}, :uri {"FunctionName" "FunctionName"}, :querystring {"Timeout" "Timeout", "Handler" "Handler", "Runtime" "Runtime", "Mode" "Mode", "MemorySize" "MemorySize", "Role" "Role", "Description" "Description"}} 201 :portkey.aws.lambda.-2014-11-11/function-configuration {"ServiceException" :portkey.aws.lambda.-2014-11-11/service-exception, "InvalidParameterValueException" :portkey.aws.lambda.-2014-11-11/invalid-parameter-value-exception, "ResourceNotFoundException" :portkey.aws.lambda.-2014-11-11/resource-not-found-exception}))
(clojure.spec.alpha/fdef upload-function :args (clojure.spec.alpha/tuple :portkey.aws.lambda.-2014-11-11/upload-function-request) :ret (clojure.spec.alpha/and :portkey.aws.lambda.-2014-11-11/function-configuration))

(clojure.core/defn list-event-sources [input__8278__auto__] (portkey.aws/-rest-json-call portkey.aws.lambda.-2014-11-11/endpoints "GET" "/2014-11-13/event-source-mappings/" input__8278__auto__ :portkey.aws.lambda.-2014-11-11/list-event-sources-request {:payload nil, :headers {}, :uri {}, :querystring {"EventSource" "EventSourceArn", "FunctionName" "FunctionName", "Marker" "Marker", "MaxItems" "MaxItems"}} 200 :portkey.aws.lambda.-2014-11-11/list-event-sources-response {"ServiceException" :portkey.aws.lambda.-2014-11-11/service-exception, "ResourceNotFoundException" :portkey.aws.lambda.-2014-11-11/resource-not-found-exception, "InvalidParameterValueException" :portkey.aws.lambda.-2014-11-11/invalid-parameter-value-exception}))
(clojure.spec.alpha/fdef list-event-sources :args (clojure.spec.alpha/tuple :portkey.aws.lambda.-2014-11-11/list-event-sources-request) :ret (clojure.spec.alpha/and :portkey.aws.lambda.-2014-11-11/list-event-sources-response))

(clojure.core/defn get-function [input__8278__auto__] (portkey.aws/-rest-json-call portkey.aws.lambda.-2014-11-11/endpoints "GET" "/2014-11-13/functions/{FunctionName}" input__8278__auto__ :portkey.aws.lambda.-2014-11-11/get-function-request {:payload nil, :headers {}, :uri {"FunctionName" "FunctionName"}, :querystring {}} 200 :portkey.aws.lambda.-2014-11-11/get-function-response {"ServiceException" :portkey.aws.lambda.-2014-11-11/service-exception, "ResourceNotFoundException" :portkey.aws.lambda.-2014-11-11/resource-not-found-exception}))
(clojure.spec.alpha/fdef get-function :args (clojure.spec.alpha/tuple :portkey.aws.lambda.-2014-11-11/get-function-request) :ret (clojure.spec.alpha/and :portkey.aws.lambda.-2014-11-11/get-function-response))

(clojure.core/defn list-functions [input__8278__auto__] (portkey.aws/-rest-json-call portkey.aws.lambda.-2014-11-11/endpoints "GET" "/2014-11-13/functions/" input__8278__auto__ :portkey.aws.lambda.-2014-11-11/list-functions-request {:payload nil, :headers {}, :uri {}, :querystring {"Marker" "Marker", "MaxItems" "MaxItems"}} 200 :portkey.aws.lambda.-2014-11-11/list-functions-response {"ServiceException" :portkey.aws.lambda.-2014-11-11/service-exception}))
(clojure.spec.alpha/fdef list-functions :args (clojure.spec.alpha/tuple :portkey.aws.lambda.-2014-11-11/list-functions-request) :ret (clojure.spec.alpha/and :portkey.aws.lambda.-2014-11-11/list-functions-response))

(clojure.core/defn update-function-configuration [input__8278__auto__] (portkey.aws/-rest-json-call portkey.aws.lambda.-2014-11-11/endpoints "PUT" "/2014-11-13/functions/{FunctionName}/configuration" input__8278__auto__ :portkey.aws.lambda.-2014-11-11/update-function-configuration-request {:payload nil, :headers {}, :uri {"FunctionName" "FunctionName"}, :querystring {"Role" "Role", "Handler" "Handler", "Description" "Description", "Timeout" "Timeout", "MemorySize" "MemorySize"}} 200 :portkey.aws.lambda.-2014-11-11/function-configuration {"ServiceException" :portkey.aws.lambda.-2014-11-11/service-exception, "ResourceNotFoundException" :portkey.aws.lambda.-2014-11-11/resource-not-found-exception, "InvalidParameterValueException" :portkey.aws.lambda.-2014-11-11/invalid-parameter-value-exception}))
(clojure.spec.alpha/fdef update-function-configuration :args (clojure.spec.alpha/tuple :portkey.aws.lambda.-2014-11-11/update-function-configuration-request) :ret (clojure.spec.alpha/and :portkey.aws.lambda.-2014-11-11/function-configuration))

(clojure.core/defn get-event-source [input__8278__auto__] (portkey.aws/-rest-json-call portkey.aws.lambda.-2014-11-11/endpoints "GET" "/2014-11-13/event-source-mappings/{UUID}" input__8278__auto__ :portkey.aws.lambda.-2014-11-11/get-event-source-request {:payload nil, :headers {}, :uri {"UUID" "UUID"}, :querystring {}} 200 :portkey.aws.lambda.-2014-11-11/event-source-configuration {"ServiceException" :portkey.aws.lambda.-2014-11-11/service-exception, "ResourceNotFoundException" :portkey.aws.lambda.-2014-11-11/resource-not-found-exception, "InvalidParameterValueException" :portkey.aws.lambda.-2014-11-11/invalid-parameter-value-exception}))
(clojure.spec.alpha/fdef get-event-source :args (clojure.spec.alpha/tuple :portkey.aws.lambda.-2014-11-11/get-event-source-request) :ret (clojure.spec.alpha/and :portkey.aws.lambda.-2014-11-11/event-source-configuration))
