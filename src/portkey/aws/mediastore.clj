(ns portkey.aws.mediastore (:require [portkey.aws]))

(def
 endpoints
 '{"ap-northeast-1"
   {:credential-scope
    {:service "mediastore", :region "ap-northeast-1"},
    :ssl-common-name "mediastore.ap-northeast-1.amazonaws.com",
    :endpoint "https://mediastore.ap-northeast-1.amazonaws.com",
    :signature-version :v4},
   "eu-west-1"
   {:credential-scope {:service "mediastore", :region "eu-west-1"},
    :ssl-common-name "mediastore.eu-west-1.amazonaws.com",
    :endpoint "https://mediastore.eu-west-1.amazonaws.com",
    :signature-version :v4},
   "ap-southeast-2"
   {:credential-scope
    {:service "mediastore", :region "ap-southeast-2"},
    :ssl-common-name "mediastore.ap-southeast-2.amazonaws.com",
    :endpoint "https://mediastore.ap-southeast-2.amazonaws.com",
    :signature-version :v4},
   "ap-northeast-2"
   {:credential-scope
    {:service "mediastore", :region "ap-northeast-2"},
    :ssl-common-name "mediastore.ap-northeast-2.amazonaws.com",
    :endpoint "https://mediastore.ap-northeast-2.amazonaws.com",
    :signature-version :v4},
   "eu-central-1"
   {:credential-scope {:service "mediastore", :region "eu-central-1"},
    :ssl-common-name "mediastore.eu-central-1.amazonaws.com",
    :endpoint "https://mediastore.eu-central-1.amazonaws.com",
    :signature-version :v4},
   "us-west-2"
   {:credential-scope {:service "mediastore", :region "us-west-2"},
    :ssl-common-name "mediastore.us-west-2.amazonaws.com",
    :endpoint "https://mediastore.us-west-2.amazonaws.com",
    :signature-version :v4},
   "us-east-1"
   {:credential-scope {:service "mediastore", :region "us-east-1"},
    :ssl-common-name "mediastore.us-east-1.amazonaws.com",
    :endpoint "https://mediastore.us-east-1.amazonaws.com",
    :signature-version :v4}})

(clojure.core/declare ser-header)

(clojure.core/declare ser-cors-policy)

(clojure.core/declare ser-pagination-token)

(clojure.core/declare ser-origin)

(clojure.core/declare ser-allowed-methods)

(clojure.core/declare ser-expose-headers)

(clojure.core/declare ser-container-list-limit)

(clojure.core/declare ser-container-policy)

(clojure.core/declare ser-method-name)

(clojure.core/declare ser-cors-rule)

(clojure.core/declare ser-allowed-headers)

(clojure.core/declare ser-allowed-origins)

(clojure.core/declare ser-container-name)

(clojure.core/declare ser-max-age-seconds)

(clojure.core/defn- ser-header [input] #:http.request.field{:value input, :shape "Header"})

(clojure.core/defn- ser-cors-policy [input] #:http.request.field{:value (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (clojure.core/merge (ser-cors-rule coll) #:http.request.field{:shape "CorsRule"}))) input), :shape "CorsPolicy", :type "list", :max 100, :min 1})

(clojure.core/defn- ser-pagination-token [input] #:http.request.field{:value input, :shape "PaginationToken"})

(clojure.core/defn- ser-origin [input] #:http.request.field{:value input, :shape "Origin"})

(clojure.core/defn- ser-allowed-methods [input] #:http.request.field{:value (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (clojure.core/merge (ser-method-name coll) #:http.request.field{:shape "MethodName"}))) input), :shape "AllowedMethods", :type "list"})

(clojure.core/defn- ser-expose-headers [input] #:http.request.field{:value (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (clojure.core/merge (ser-header coll) #:http.request.field{:shape "Header"}))) input), :shape "ExposeHeaders", :type "list", :max 100, :min 0})

(clojure.core/defn- ser-container-list-limit [input] #:http.request.field{:value input, :shape "ContainerListLimit"})

(clojure.core/defn- ser-container-policy [input] #:http.request.field{:value input, :shape "ContainerPolicy"})

(clojure.core/defn- ser-method-name [input] #:http.request.field{:value (clojure.core/get {"PUT" "PUT", :put "PUT", "GET" "GET", :get "GET", "DELETE" "DELETE", :delete "DELETE", "HEAD" "HEAD", :head "HEAD"} input), :shape "MethodName"})

(clojure.core/defn- ser-cors-rule [input] (clojure.core/cond-> #:http.request.field{:value [], :shape "CorsRule", :type "structure"} (clojure.core/contains? input :allowed-origins) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-allowed-origins (input :allowed-origins)) #:http.request.field{:name "AllowedOrigins", :shape "AllowedOrigins"})) (clojure.core/contains? input :allowed-methods) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-allowed-methods (input :allowed-methods)) #:http.request.field{:name "AllowedMethods", :shape "AllowedMethods"})) (clojure.core/contains? input :allowed-headers) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-allowed-headers (input :allowed-headers)) #:http.request.field{:name "AllowedHeaders", :shape "AllowedHeaders"})) (clojure.core/contains? input :max-age-seconds) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-max-age-seconds (input :max-age-seconds)) #:http.request.field{:name "MaxAgeSeconds", :shape "MaxAgeSeconds"})) (clojure.core/contains? input :expose-headers) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-expose-headers (input :expose-headers)) #:http.request.field{:name "ExposeHeaders", :shape "ExposeHeaders"}))))

(clojure.core/defn- ser-allowed-headers [input] #:http.request.field{:value (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (clojure.core/merge (ser-header coll) #:http.request.field{:shape "Header"}))) input), :shape "AllowedHeaders", :type "list", :max 100, :min 0})

(clojure.core/defn- ser-allowed-origins [input] #:http.request.field{:value (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (clojure.core/merge (ser-origin coll) #:http.request.field{:shape "Origin"}))) input), :shape "AllowedOrigins", :type "list"})

(clojure.core/defn- ser-container-name [input] #:http.request.field{:value input, :shape "ContainerName"})

(clojure.core/defn- ser-max-age-seconds [input] #:http.request.field{:value input, :shape "MaxAgeSeconds"})

(clojure.core/defn- req-create-container-input [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (ser-container-name (input :container-name)) #:http.request.field{:name "ContainerName", :shape "ContainerName"})]}))

(clojure.core/defn- req-put-cors-policy-input [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (ser-container-name (input :container-name)) #:http.request.field{:name "ContainerName", :shape "ContainerName"}) (clojure.core/into (ser-cors-policy (input :cors-policy)) #:http.request.field{:name "CorsPolicy", :shape "CorsPolicy"})]}))

(clojure.core/defn- req-delete-cors-policy-input [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (ser-container-name (input :container-name)) #:http.request.field{:name "ContainerName", :shape "ContainerName"})]}))

(clojure.core/defn- req-list-containers-input [input] (clojure.core/cond-> {} (clojure.core/contains? input :next-token) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-pagination-token (input :next-token)) #:http.request.field{:name "NextToken", :shape "PaginationToken"})) (clojure.core/contains? input :max-results) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-container-list-limit (input :max-results)) #:http.request.field{:name "MaxResults", :shape "ContainerListLimit"}))))

(clojure.core/defn- req-get-cors-policy-input [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (ser-container-name (input :container-name)) #:http.request.field{:name "ContainerName", :shape "ContainerName"})]}))

(clojure.core/defn- req-delete-container-input [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (ser-container-name (input :container-name)) #:http.request.field{:name "ContainerName", :shape "ContainerName"})]}))

(clojure.core/defn- req-put-container-policy-input [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (ser-container-name (input :container-name)) #:http.request.field{:name "ContainerName", :shape "ContainerName"}) (clojure.core/into (ser-container-policy (input :policy)) #:http.request.field{:name "Policy", :shape "ContainerPolicy"})]}))

(clojure.core/defn- req-describe-container-input [input] (clojure.core/cond-> {} (clojure.core/contains? input :container-name) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-container-name (input :container-name)) #:http.request.field{:name "ContainerName", :shape "ContainerName"}))))

(clojure.core/defn- req-delete-container-policy-input [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (ser-container-name (input :container-name)) #:http.request.field{:name "ContainerName", :shape "ContainerName"})]}))

(clojure.core/defn- req-get-container-policy-input [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (ser-container-name (input :container-name)) #:http.request.field{:name "ContainerName", :shape "ContainerName"})]}))

(clojure.spec.alpha/def :portkey.aws.mediastore.list-containers-output/containers (clojure.spec.alpha/and :portkey.aws.mediastore/container-list))
(clojure.spec.alpha/def :portkey.aws.mediastore.list-containers-output/next-token (clojure.spec.alpha/and :portkey.aws.mediastore/pagination-token))
(clojure.spec.alpha/def :portkey.aws.mediastore/list-containers-output (clojure.spec.alpha/keys :req-un [:portkey.aws.mediastore.list-containers-output/containers] :opt-un [:portkey.aws.mediastore.list-containers-output/next-token]))

(clojure.spec.alpha/def :portkey.aws.mediastore/delete-cors-policy-output (clojure.spec.alpha/keys :req-un [] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.mediastore/get-cors-policy-output (clojure.spec.alpha/keys :req-un [:portkey.aws.mediastore/cors-policy] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.mediastore.container-not-found-exception/message (clojure.spec.alpha/and :portkey.aws.mediastore/error-message))
(clojure.spec.alpha/def :portkey.aws.mediastore/container-not-found-exception (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.mediastore.container-not-found-exception/message]))

(clojure.spec.alpha/def :portkey.aws.mediastore/header (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__27880__auto__] (clojure.core/<= 1 (clojure.core/count s__27880__auto__))) (clojure.core/fn [s__27881__auto__] (clojure.core/< (clojure.core/count s__27881__auto__) 8192)) (clojure.core/fn [s__27882__auto__] (clojure.core/re-matches #"[\u0009\u000A\u000D\u0020-\u00FF]+" s__27882__auto__))))

(clojure.spec.alpha/def :portkey.aws.mediastore/create-container-input (clojure.spec.alpha/keys :req-un [:portkey.aws.mediastore/container-name] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.mediastore/cors-policy (clojure.spec.alpha/coll-of :portkey.aws.mediastore/cors-rule :min-count 1 :max-count 100))

(clojure.spec.alpha/def :portkey.aws.mediastore/pagination-token (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__27880__auto__] (clojure.core/<= 1 (clojure.core/count s__27880__auto__))) (clojure.core/fn [s__27881__auto__] (clojure.core/< (clojure.core/count s__27881__auto__) 255)) (clojure.core/fn [s__27882__auto__] (clojure.core/re-matches #"[0-9A-Za-z=/+]+" s__27882__auto__))))

(clojure.spec.alpha/def :portkey.aws.mediastore.limit-exceeded-exception/message (clojure.spec.alpha/and :portkey.aws.mediastore/error-message))
(clojure.spec.alpha/def :portkey.aws.mediastore/limit-exceeded-exception (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.mediastore.limit-exceeded-exception/message]))

(clojure.spec.alpha/def :portkey.aws.mediastore/put-cors-policy-input (clojure.spec.alpha/keys :req-un [:portkey.aws.mediastore/container-name :portkey.aws.mediastore/cors-policy] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.mediastore/origin (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__27882__auto__] (clojure.core/re-matches #"[\u0009\u000A\u000D\u0020-\u00FF]+" s__27882__auto__))))

(clojure.spec.alpha/def :portkey.aws.mediastore/delete-cors-policy-input (clojure.spec.alpha/keys :req-un [:portkey.aws.mediastore/container-name] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.mediastore.list-containers-input/next-token (clojure.spec.alpha/and :portkey.aws.mediastore/pagination-token))
(clojure.spec.alpha/def :portkey.aws.mediastore.list-containers-input/max-results (clojure.spec.alpha/and :portkey.aws.mediastore/container-list-limit))
(clojure.spec.alpha/def :portkey.aws.mediastore/list-containers-input (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.mediastore.list-containers-input/next-token :portkey.aws.mediastore.list-containers-input/max-results]))

(clojure.spec.alpha/def :portkey.aws.mediastore/error-message (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__27880__auto__] (clojure.core/<= 1 (clojure.core/count s__27880__auto__))) (clojure.core/fn [s__27881__auto__] (clojure.core/< (clojure.core/count s__27881__auto__) 255)) (clojure.core/fn [s__27882__auto__] (clojure.core/re-matches #"[ \w:\.\?-]+" s__27882__auto__))))

(clojure.spec.alpha/def :portkey.aws.mediastore.get-container-policy-output/policy (clojure.spec.alpha/and :portkey.aws.mediastore/container-policy))
(clojure.spec.alpha/def :portkey.aws.mediastore/get-container-policy-output (clojure.spec.alpha/keys :req-un [:portkey.aws.mediastore.get-container-policy-output/policy] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.mediastore/allowed-methods (clojure.spec.alpha/coll-of :portkey.aws.mediastore/method-name))

(clojure.spec.alpha/def :portkey.aws.mediastore.container-in-use-exception/message (clojure.spec.alpha/and :portkey.aws.mediastore/error-message))
(clojure.spec.alpha/def :portkey.aws.mediastore/container-in-use-exception (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.mediastore.container-in-use-exception/message]))

(clojure.spec.alpha/def :portkey.aws.mediastore/get-cors-policy-input (clojure.spec.alpha/keys :req-un [:portkey.aws.mediastore/container-name] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.mediastore/delete-container-policy-output (clojure.spec.alpha/keys :req-un [] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.mediastore/put-container-policy-output (clojure.spec.alpha/keys :req-un [] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.mediastore/create-container-output (clojure.spec.alpha/keys :req-un [:portkey.aws.mediastore/container] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.mediastore/put-cors-policy-output (clojure.spec.alpha/keys :req-un [] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.mediastore.policy-not-found-exception/message (clojure.spec.alpha/and :portkey.aws.mediastore/error-message))
(clojure.spec.alpha/def :portkey.aws.mediastore/policy-not-found-exception (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.mediastore.policy-not-found-exception/message]))

(clojure.spec.alpha/def :portkey.aws.mediastore/expose-headers (clojure.spec.alpha/coll-of :portkey.aws.mediastore/header :min-count 0 :max-count 100))

(clojure.spec.alpha/def :portkey.aws.mediastore.container/creation-time (clojure.spec.alpha/and :portkey.aws.mediastore/time-stamp))
(clojure.spec.alpha/def :portkey.aws.mediastore.container/arn (clojure.spec.alpha/and :portkey.aws.mediastore/container-arn))
(clojure.spec.alpha/def :portkey.aws.mediastore.container/name (clojure.spec.alpha/and :portkey.aws.mediastore/container-name))
(clojure.spec.alpha/def :portkey.aws.mediastore.container/status (clojure.spec.alpha/and :portkey.aws.mediastore/container-status))
(clojure.spec.alpha/def :portkey.aws.mediastore/container (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.mediastore/endpoint :portkey.aws.mediastore.container/creation-time :portkey.aws.mediastore.container/arn :portkey.aws.mediastore.container/name :portkey.aws.mediastore.container/status]))

(clojure.spec.alpha/def :portkey.aws.mediastore/delete-container-input (clojure.spec.alpha/keys :req-un [:portkey.aws.mediastore/container-name] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.mediastore/container-list (clojure.spec.alpha/coll-of :portkey.aws.mediastore/container))

(clojure.spec.alpha/def :portkey.aws.mediastore/container-list-limit (clojure.spec.alpha/int-in 1 100))

(clojure.spec.alpha/def :portkey.aws.mediastore/container-policy (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__27880__auto__] (clojure.core/<= 1 (clojure.core/count s__27880__auto__))) (clojure.core/fn [s__27881__auto__] (clojure.core/< (clojure.core/count s__27881__auto__) 8192)) (clojure.core/fn [s__27882__auto__] (clojure.core/re-matches #"[\u0009\u000A\u000D\u0020-\u00FF]+" s__27882__auto__))))

(clojure.spec.alpha/def :portkey.aws.mediastore/endpoint (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__27880__auto__] (clojure.core/<= 1 (clojure.core/count s__27880__auto__))) (clojure.core/fn [s__27881__auto__] (clojure.core/< (clojure.core/count s__27881__auto__) 255))))

(clojure.spec.alpha/def :portkey.aws.mediastore/container-arn (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__27880__auto__] (clojure.core/<= 1 (clojure.core/count s__27880__auto__))) (clojure.core/fn [s__27881__auto__] (clojure.core/< (clojure.core/count s__27881__auto__) 1024)) (clojure.core/fn [s__27882__auto__] (clojure.core/re-matches #"arn:aws:mediastore:[a-z]+-[a-z]+-\d:\d{12}:container/\w{1,255}" s__27882__auto__))))

(clojure.spec.alpha/def :portkey.aws.mediastore.put-container-policy-input/policy (clojure.spec.alpha/and :portkey.aws.mediastore/container-policy))
(clojure.spec.alpha/def :portkey.aws.mediastore/put-container-policy-input (clojure.spec.alpha/keys :req-un [:portkey.aws.mediastore/container-name :portkey.aws.mediastore.put-container-policy-input/policy] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.mediastore.cors-policy-not-found-exception/message (clojure.spec.alpha/and :portkey.aws.mediastore/error-message))
(clojure.spec.alpha/def :portkey.aws.mediastore/cors-policy-not-found-exception (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.mediastore.cors-policy-not-found-exception/message]))

(clojure.spec.alpha/def :portkey.aws.mediastore/method-name #{"DELETE" :get :delete :head "HEAD" :put "GET" "PUT"})

(clojure.spec.alpha/def :portkey.aws.mediastore.internal-server-error/message (clojure.spec.alpha/and :portkey.aws.mediastore/error-message))
(clojure.spec.alpha/def :portkey.aws.mediastore/internal-server-error (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.mediastore.internal-server-error/message]))

(clojure.spec.alpha/def :portkey.aws.mediastore/cors-rule (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.mediastore/allowed-origins :portkey.aws.mediastore/allowed-methods :portkey.aws.mediastore/allowed-headers :portkey.aws.mediastore/max-age-seconds :portkey.aws.mediastore/expose-headers]))

(clojure.spec.alpha/def :portkey.aws.mediastore/describe-container-input (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.mediastore/container-name]))

(clojure.spec.alpha/def :portkey.aws.mediastore/allowed-headers (clojure.spec.alpha/coll-of :portkey.aws.mediastore/header :min-count 0 :max-count 100))

(clojure.spec.alpha/def :portkey.aws.mediastore/allowed-origins (clojure.spec.alpha/coll-of :portkey.aws.mediastore/origin))

(clojure.spec.alpha/def :portkey.aws.mediastore/container-name (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__27880__auto__] (clojure.core/<= 1 (clojure.core/count s__27880__auto__))) (clojure.core/fn [s__27881__auto__] (clojure.core/< (clojure.core/count s__27881__auto__) 255)) (clojure.core/fn [s__27882__auto__] (clojure.core/re-matches #"\w+" s__27882__auto__))))

(clojure.spec.alpha/def :portkey.aws.mediastore/delete-container-output (clojure.spec.alpha/keys :req-un [] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.mediastore/max-age-seconds (clojure.spec.alpha/int-in 0 2147483647))

(clojure.spec.alpha/def :portkey.aws.mediastore/container-status #{:creating :deleting :active "DELETING" "CREATING" "ACTIVE"})

(clojure.spec.alpha/def :portkey.aws.mediastore/describe-container-output (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.mediastore/container]))

(clojure.spec.alpha/def :portkey.aws.mediastore/time-stamp clojure.core/inst?)

(clojure.spec.alpha/def :portkey.aws.mediastore/delete-container-policy-input (clojure.spec.alpha/keys :req-un [:portkey.aws.mediastore/container-name] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.mediastore/get-container-policy-input (clojure.spec.alpha/keys :req-un [:portkey.aws.mediastore/container-name] :opt-un []))

(clojure.core/defn delete-container-policy ([delete-container-policy-inputinput] (clojure.core/let [request-function-result__28521__auto__ (req-delete-container-policy-input delete-container-policy-inputinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__28521__auto__ {:http.request.configuration/endpoints portkey.aws.mediastore/endpoints, :http.request.configuration/target-prefix "MediaStore_20170901", :http.request.spec/output-spec :portkey.aws.mediastore/delete-container-policy-output, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2017-09-01", :http.request.configuration/service-id "MediaStore", :http.request.spec/input-spec :portkey.aws.mediastore/delete-container-policy-input, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/action "DeleteContainerPolicy", :http.request.spec/error-spec {"ContainerInUseException" :portkey.aws.mediastore/container-in-use-exception, "ContainerNotFoundException" :portkey.aws.mediastore/container-not-found-exception, "PolicyNotFoundException" :portkey.aws.mediastore/policy-not-found-exception, "InternalServerError" :portkey.aws.mediastore/internal-server-error}})))))
(clojure.spec.alpha/fdef delete-container-policy :args (clojure.spec.alpha/tuple :portkey.aws.mediastore/delete-container-policy-input) :ret (clojure.spec.alpha/and :portkey.aws.mediastore/delete-container-policy-output))

(clojure.core/defn get-container-policy ([get-container-policy-inputinput] (clojure.core/let [request-function-result__28521__auto__ (req-get-container-policy-input get-container-policy-inputinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__28521__auto__ {:http.request.configuration/endpoints portkey.aws.mediastore/endpoints, :http.request.configuration/target-prefix "MediaStore_20170901", :http.request.spec/output-spec :portkey.aws.mediastore/get-container-policy-output, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2017-09-01", :http.request.configuration/service-id "MediaStore", :http.request.spec/input-spec :portkey.aws.mediastore/get-container-policy-input, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/action "GetContainerPolicy", :http.request.spec/error-spec {"ContainerInUseException" :portkey.aws.mediastore/container-in-use-exception, "ContainerNotFoundException" :portkey.aws.mediastore/container-not-found-exception, "PolicyNotFoundException" :portkey.aws.mediastore/policy-not-found-exception, "InternalServerError" :portkey.aws.mediastore/internal-server-error}})))))
(clojure.spec.alpha/fdef get-container-policy :args (clojure.spec.alpha/tuple :portkey.aws.mediastore/get-container-policy-input) :ret (clojure.spec.alpha/and :portkey.aws.mediastore/get-container-policy-output))

(clojure.core/defn put-container-policy ([put-container-policy-inputinput] (clojure.core/let [request-function-result__28521__auto__ (req-put-container-policy-input put-container-policy-inputinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__28521__auto__ {:http.request.configuration/endpoints portkey.aws.mediastore/endpoints, :http.request.configuration/target-prefix "MediaStore_20170901", :http.request.spec/output-spec :portkey.aws.mediastore/put-container-policy-output, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2017-09-01", :http.request.configuration/service-id "MediaStore", :http.request.spec/input-spec :portkey.aws.mediastore/put-container-policy-input, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/action "PutContainerPolicy", :http.request.spec/error-spec {"ContainerNotFoundException" :portkey.aws.mediastore/container-not-found-exception, "ContainerInUseException" :portkey.aws.mediastore/container-in-use-exception, "InternalServerError" :portkey.aws.mediastore/internal-server-error}})))))
(clojure.spec.alpha/fdef put-container-policy :args (clojure.spec.alpha/tuple :portkey.aws.mediastore/put-container-policy-input) :ret (clojure.spec.alpha/and :portkey.aws.mediastore/put-container-policy-output))

(clojure.core/defn describe-container ([] (describe-container {})) ([describe-container-inputinput] (clojure.core/let [request-function-result__28521__auto__ (req-describe-container-input describe-container-inputinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__28521__auto__ {:http.request.configuration/endpoints portkey.aws.mediastore/endpoints, :http.request.configuration/target-prefix "MediaStore_20170901", :http.request.spec/output-spec :portkey.aws.mediastore/describe-container-output, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2017-09-01", :http.request.configuration/service-id "MediaStore", :http.request.spec/input-spec :portkey.aws.mediastore/describe-container-input, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/action "DescribeContainer", :http.request.spec/error-spec {"ContainerNotFoundException" :portkey.aws.mediastore/container-not-found-exception, "InternalServerError" :portkey.aws.mediastore/internal-server-error}})))))
(clojure.spec.alpha/fdef describe-container :args (clojure.spec.alpha/? :portkey.aws.mediastore/describe-container-input) :ret (clojure.spec.alpha/and :portkey.aws.mediastore/describe-container-output))

(clojure.core/defn delete-cors-policy ([delete-cors-policy-inputinput] (clojure.core/let [request-function-result__28521__auto__ (req-delete-cors-policy-input delete-cors-policy-inputinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__28521__auto__ {:http.request.configuration/endpoints portkey.aws.mediastore/endpoints, :http.request.configuration/target-prefix "MediaStore_20170901", :http.request.spec/output-spec :portkey.aws.mediastore/delete-cors-policy-output, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2017-09-01", :http.request.configuration/service-id "MediaStore", :http.request.spec/input-spec :portkey.aws.mediastore/delete-cors-policy-input, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/action "DeleteCorsPolicy", :http.request.spec/error-spec {"ContainerInUseException" :portkey.aws.mediastore/container-in-use-exception, "ContainerNotFoundException" :portkey.aws.mediastore/container-not-found-exception, "CorsPolicyNotFoundException" :portkey.aws.mediastore/cors-policy-not-found-exception, "InternalServerError" :portkey.aws.mediastore/internal-server-error}})))))
(clojure.spec.alpha/fdef delete-cors-policy :args (clojure.spec.alpha/tuple :portkey.aws.mediastore/delete-cors-policy-input) :ret (clojure.spec.alpha/and :portkey.aws.mediastore/delete-cors-policy-output))

(clojure.core/defn create-container ([create-container-inputinput] (clojure.core/let [request-function-result__28521__auto__ (req-create-container-input create-container-inputinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__28521__auto__ {:http.request.configuration/endpoints portkey.aws.mediastore/endpoints, :http.request.configuration/target-prefix "MediaStore_20170901", :http.request.spec/output-spec :portkey.aws.mediastore/create-container-output, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2017-09-01", :http.request.configuration/service-id "MediaStore", :http.request.spec/input-spec :portkey.aws.mediastore/create-container-input, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/action "CreateContainer", :http.request.spec/error-spec {"ContainerInUseException" :portkey.aws.mediastore/container-in-use-exception, "LimitExceededException" :portkey.aws.mediastore/limit-exceeded-exception, "InternalServerError" :portkey.aws.mediastore/internal-server-error}})))))
(clojure.spec.alpha/fdef create-container :args (clojure.spec.alpha/tuple :portkey.aws.mediastore/create-container-input) :ret (clojure.spec.alpha/and :portkey.aws.mediastore/create-container-output))

(clojure.core/defn get-cors-policy ([get-cors-policy-inputinput] (clojure.core/let [request-function-result__28521__auto__ (req-get-cors-policy-input get-cors-policy-inputinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__28521__auto__ {:http.request.configuration/endpoints portkey.aws.mediastore/endpoints, :http.request.configuration/target-prefix "MediaStore_20170901", :http.request.spec/output-spec :portkey.aws.mediastore/get-cors-policy-output, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2017-09-01", :http.request.configuration/service-id "MediaStore", :http.request.spec/input-spec :portkey.aws.mediastore/get-cors-policy-input, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/action "GetCorsPolicy", :http.request.spec/error-spec {"ContainerInUseException" :portkey.aws.mediastore/container-in-use-exception, "ContainerNotFoundException" :portkey.aws.mediastore/container-not-found-exception, "CorsPolicyNotFoundException" :portkey.aws.mediastore/cors-policy-not-found-exception, "InternalServerError" :portkey.aws.mediastore/internal-server-error}})))))
(clojure.spec.alpha/fdef get-cors-policy :args (clojure.spec.alpha/tuple :portkey.aws.mediastore/get-cors-policy-input) :ret (clojure.spec.alpha/and :portkey.aws.mediastore/get-cors-policy-output))

(clojure.core/defn delete-container ([delete-container-inputinput] (clojure.core/let [request-function-result__28521__auto__ (req-delete-container-input delete-container-inputinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__28521__auto__ {:http.request.configuration/endpoints portkey.aws.mediastore/endpoints, :http.request.configuration/target-prefix "MediaStore_20170901", :http.request.spec/output-spec :portkey.aws.mediastore/delete-container-output, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2017-09-01", :http.request.configuration/service-id "MediaStore", :http.request.spec/input-spec :portkey.aws.mediastore/delete-container-input, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/action "DeleteContainer", :http.request.spec/error-spec {"ContainerInUseException" :portkey.aws.mediastore/container-in-use-exception, "ContainerNotFoundException" :portkey.aws.mediastore/container-not-found-exception, "InternalServerError" :portkey.aws.mediastore/internal-server-error}})))))
(clojure.spec.alpha/fdef delete-container :args (clojure.spec.alpha/tuple :portkey.aws.mediastore/delete-container-input) :ret (clojure.spec.alpha/and :portkey.aws.mediastore/delete-container-output))

(clojure.core/defn list-containers ([] (list-containers {})) ([list-containers-inputinput] (clojure.core/let [request-function-result__28521__auto__ (req-list-containers-input list-containers-inputinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__28521__auto__ {:http.request.configuration/endpoints portkey.aws.mediastore/endpoints, :http.request.configuration/target-prefix "MediaStore_20170901", :http.request.spec/output-spec :portkey.aws.mediastore/list-containers-output, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2017-09-01", :http.request.configuration/service-id "MediaStore", :http.request.spec/input-spec :portkey.aws.mediastore/list-containers-input, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/action "ListContainers", :http.request.spec/error-spec {"InternalServerError" :portkey.aws.mediastore/internal-server-error}})))))
(clojure.spec.alpha/fdef list-containers :args (clojure.spec.alpha/? :portkey.aws.mediastore/list-containers-input) :ret (clojure.spec.alpha/and :portkey.aws.mediastore/list-containers-output))

(clojure.core/defn put-cors-policy ([put-cors-policy-inputinput] (clojure.core/let [request-function-result__28521__auto__ (req-put-cors-policy-input put-cors-policy-inputinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__28521__auto__ {:http.request.configuration/endpoints portkey.aws.mediastore/endpoints, :http.request.configuration/target-prefix "MediaStore_20170901", :http.request.spec/output-spec :portkey.aws.mediastore/put-cors-policy-output, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2017-09-01", :http.request.configuration/service-id "MediaStore", :http.request.spec/input-spec :portkey.aws.mediastore/put-cors-policy-input, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/action "PutCorsPolicy", :http.request.spec/error-spec {"ContainerNotFoundException" :portkey.aws.mediastore/container-not-found-exception, "ContainerInUseException" :portkey.aws.mediastore/container-in-use-exception, "InternalServerError" :portkey.aws.mediastore/internal-server-error}})))))
(clojure.spec.alpha/fdef put-cors-policy :args (clojure.spec.alpha/tuple :portkey.aws.mediastore/put-cors-policy-input) :ret (clojure.spec.alpha/and :portkey.aws.mediastore/put-cors-policy-output))
