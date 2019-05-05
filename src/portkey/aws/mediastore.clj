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

(clojure.core/declare ser-lifecycle-policy)

(clojure.core/defn- ser-header [input] #:http.request.field{:value input, :shape "Header"})

(clojure.core/defn- ser-cors-policy [input] #:http.request.field{:value (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (clojure.core/merge (ser-cors-rule coll) #:http.request.field{:shape "CorsRule"}))) input), :shape "CorsPolicy", :type "list", :max 100, :min 1})

(clojure.core/defn- ser-pagination-token [input] #:http.request.field{:value input, :shape "PaginationToken"})

(clojure.core/defn- ser-origin [input] #:http.request.field{:value input, :shape "Origin"})

(clojure.core/defn- ser-allowed-methods [input] #:http.request.field{:value (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (clojure.core/merge (ser-method-name coll) #:http.request.field{:shape "MethodName"}))) input), :shape "AllowedMethods", :type "list", :max 4, :min 1})

(clojure.core/defn- ser-expose-headers [input] #:http.request.field{:value (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (clojure.core/merge (ser-header coll) #:http.request.field{:shape "Header"}))) input), :shape "ExposeHeaders", :type "list", :max 100, :min 0})

(clojure.core/defn- ser-container-list-limit [input] #:http.request.field{:value input, :shape "ContainerListLimit"})

(clojure.core/defn- ser-container-policy [input] #:http.request.field{:value input, :shape "ContainerPolicy"})

(clojure.core/defn- ser-method-name [input] #:http.request.field{:value (clojure.core/get {"PUT" "PUT", :put "PUT", "GET" "GET", :get "GET", "DELETE" "DELETE", :delete "DELETE", "HEAD" "HEAD", :head "HEAD"} input), :shape "MethodName"})

(clojure.core/defn- ser-cors-rule [input] (clojure.core/cond-> #:http.request.field{:value [(clojure.core/into (ser-allowed-origins (:allowed-origins input)) #:http.request.field{:name "AllowedOrigins", :shape "AllowedOrigins"}) (clojure.core/into (ser-allowed-headers (:allowed-headers input)) #:http.request.field{:name "AllowedHeaders", :shape "AllowedHeaders"})], :shape "CorsRule", :type "structure"} (clojure.core/contains? input :allowed-methods) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-allowed-methods (input :allowed-methods)) #:http.request.field{:name "AllowedMethods", :shape "AllowedMethods"})) (clojure.core/contains? input :max-age-seconds) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-max-age-seconds (input :max-age-seconds)) #:http.request.field{:name "MaxAgeSeconds", :shape "MaxAgeSeconds"})) (clojure.core/contains? input :expose-headers) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-expose-headers (input :expose-headers)) #:http.request.field{:name "ExposeHeaders", :shape "ExposeHeaders"}))))

(clojure.core/defn- ser-allowed-headers [input] #:http.request.field{:value (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (clojure.core/merge (ser-header coll) #:http.request.field{:shape "Header"}))) input), :shape "AllowedHeaders", :type "list", :max 100, :min 0})

(clojure.core/defn- ser-allowed-origins [input] #:http.request.field{:value (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (clojure.core/merge (ser-origin coll) #:http.request.field{:shape "Origin"}))) input), :shape "AllowedOrigins", :type "list", :max 100, :min 1})

(clojure.core/defn- ser-container-name [input] #:http.request.field{:value input, :shape "ContainerName"})

(clojure.core/defn- ser-max-age-seconds [input] #:http.request.field{:value input, :shape "MaxAgeSeconds"})

(clojure.core/defn- ser-lifecycle-policy [input] #:http.request.field{:value input, :shape "LifecyclePolicy"})

(clojure.core/defn- req-get-lifecycle-policy-input [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (ser-container-name (input :container-name)) #:http.request.field{:name "ContainerName", :shape "ContainerName"})]}))

(clojure.core/defn- req-create-container-input [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (ser-container-name (input :container-name)) #:http.request.field{:name "ContainerName", :shape "ContainerName"})]}))

(clojure.core/defn- req-put-lifecycle-policy-input [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (ser-container-name (input :container-name)) #:http.request.field{:name "ContainerName", :shape "ContainerName"}) (clojure.core/into (ser-lifecycle-policy (input :lifecycle-policy)) #:http.request.field{:name "LifecyclePolicy", :shape "LifecyclePolicy"})]}))

(clojure.core/defn- req-put-cors-policy-input [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (ser-container-name (input :container-name)) #:http.request.field{:name "ContainerName", :shape "ContainerName"}) (clojure.core/into (ser-cors-policy (input :cors-policy)) #:http.request.field{:name "CorsPolicy", :shape "CorsPolicy"})]}))

(clojure.core/defn- req-delete-cors-policy-input [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (ser-container-name (input :container-name)) #:http.request.field{:name "ContainerName", :shape "ContainerName"})]}))

(clojure.core/defn- req-list-containers-input [input] (clojure.core/cond-> {} (clojure.core/contains? input :next-token) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-pagination-token (input :next-token)) #:http.request.field{:name "NextToken", :shape "PaginationToken"})) (clojure.core/contains? input :max-results) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-container-list-limit (input :max-results)) #:http.request.field{:name "MaxResults", :shape "ContainerListLimit"}))))

(clojure.core/defn- req-stop-access-logging-input [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (ser-container-name (input :container-name)) #:http.request.field{:name "ContainerName", :shape "ContainerName"})]}))

(clojure.core/defn- req-get-cors-policy-input [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (ser-container-name (input :container-name)) #:http.request.field{:name "ContainerName", :shape "ContainerName"})]}))

(clojure.core/defn- req-delete-container-input [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (ser-container-name (input :container-name)) #:http.request.field{:name "ContainerName", :shape "ContainerName"})]}))

(clojure.core/defn- req-start-access-logging-input [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (ser-container-name (input :container-name)) #:http.request.field{:name "ContainerName", :shape "ContainerName"})]}))

(clojure.core/defn- req-put-container-policy-input [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (ser-container-name (input :container-name)) #:http.request.field{:name "ContainerName", :shape "ContainerName"}) (clojure.core/into (ser-container-policy (input :policy)) #:http.request.field{:name "Policy", :shape "ContainerPolicy"})]}))

(clojure.core/defn- req-describe-container-input [input] (clojure.core/cond-> {} (clojure.core/contains? input :container-name) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-container-name (input :container-name)) #:http.request.field{:name "ContainerName", :shape "ContainerName"}))))

(clojure.core/defn- req-delete-lifecycle-policy-input [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (ser-container-name (input :container-name)) #:http.request.field{:name "ContainerName", :shape "ContainerName"})]}))

(clojure.core/defn- req-delete-container-policy-input [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (ser-container-name (input :container-name)) #:http.request.field{:name "ContainerName", :shape "ContainerName"})]}))

(clojure.core/defn- req-get-container-policy-input [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (ser-container-name (input :container-name)) #:http.request.field{:name "ContainerName", :shape "ContainerName"})]}))

(clojure.core/declare deser-header)

(clojure.core/declare deser-cors-policy)

(clojure.core/declare deser-pagination-token)

(clojure.core/declare deser-origin)

(clojure.core/declare deser-error-message)

(clojure.core/declare deser-allowed-methods)

(clojure.core/declare deser-expose-headers)

(clojure.core/declare deser-container)

(clojure.core/declare deser-container-list)

(clojure.core/declare deser-container-policy)

(clojure.core/declare deser-endpoint)

(clojure.core/declare deser-container-arn)

(clojure.core/declare deser-method-name)

(clojure.core/declare deser-container-access-logging-enabled)

(clojure.core/declare deser-cors-rule)

(clojure.core/declare deser-allowed-headers)

(clojure.core/declare deser-allowed-origins)

(clojure.core/declare deser-container-name)

(clojure.core/declare deser-max-age-seconds)

(clojure.core/declare deser-container-status)

(clojure.core/declare deser-time-stamp)

(clojure.core/declare deser-lifecycle-policy)

(clojure.core/defn- deser-header [input] input)

(clojure.core/defn- deser-cors-policy [input] (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (deser-cors-rule coll))) input))

(clojure.core/defn- deser-pagination-token [input] input)

(clojure.core/defn- deser-origin [input] input)

(clojure.core/defn- deser-error-message [input] input)

(clojure.core/defn- deser-allowed-methods [input] (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (deser-method-name coll))) input))

(clojure.core/defn- deser-expose-headers [input] (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (deser-header coll))) input))

(clojure.core/defn- deser-container [input] (clojure.core/cond-> {} (clojure.core/contains? input "Endpoint") (clojure.core/assoc :endpoint (deser-endpoint (input "Endpoint"))) (clojure.core/contains? input "CreationTime") (clojure.core/assoc :creation-time (deser-time-stamp (input "CreationTime"))) (clojure.core/contains? input "ARN") (clojure.core/assoc :arn (deser-container-arn (input "ARN"))) (clojure.core/contains? input "Name") (clojure.core/assoc :name (deser-container-name (input "Name"))) (clojure.core/contains? input "Status") (clojure.core/assoc :status (deser-container-status (input "Status"))) (clojure.core/contains? input "AccessLoggingEnabled") (clojure.core/assoc :access-logging-enabled (deser-container-access-logging-enabled (input "AccessLoggingEnabled")))))

(clojure.core/defn- deser-container-list [input] (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (deser-container coll))) input))

(clojure.core/defn- deser-container-policy [input] input)

(clojure.core/defn- deser-endpoint [input] input)

(clojure.core/defn- deser-container-arn [input] input)

(clojure.core/defn- deser-method-name [input] (clojure.core/get {"PUT" :put, "GET" :get, "DELETE" :delete, "HEAD" :head} input))

(clojure.core/defn- deser-container-access-logging-enabled [input] input)

(clojure.core/defn- deser-cors-rule [input] (clojure.core/cond-> {:allowed-origins (deser-allowed-origins (input "AllowedOrigins")), :allowed-headers (deser-allowed-headers (input "AllowedHeaders"))} (clojure.core/contains? input "AllowedMethods") (clojure.core/assoc :allowed-methods (deser-allowed-methods (input "AllowedMethods"))) (clojure.core/contains? input "MaxAgeSeconds") (clojure.core/assoc :max-age-seconds (deser-max-age-seconds (input "MaxAgeSeconds"))) (clojure.core/contains? input "ExposeHeaders") (clojure.core/assoc :expose-headers (deser-expose-headers (input "ExposeHeaders")))))

(clojure.core/defn- deser-allowed-headers [input] (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (deser-header coll))) input))

(clojure.core/defn- deser-allowed-origins [input] (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (deser-origin coll))) input))

(clojure.core/defn- deser-container-name [input] input)

(clojure.core/defn- deser-max-age-seconds [input] input)

(clojure.core/defn- deser-container-status [input] (clojure.core/get {"ACTIVE" :active, "CREATING" :creating, "DELETING" :deleting} input))

(clojure.core/defn- deser-time-stamp [input] input)

(clojure.core/defn- deser-lifecycle-policy [input] input)

(clojure.core/defn- response-list-containers-output ([input] (response-list-containers-output nil input)) ([resultWrapper1364907 input] (clojure.core/let [rawinput1364906 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar1364908 {"Containers" (rawinput1364906 "Containers"), "NextToken" (rawinput1364906 "NextToken")}] (clojure.core/cond-> {:containers (deser-container-list (clojure.core/get-in letvar1364908 ["Containers"]))} (letvar1364908 "NextToken") (clojure.core/assoc :next-token (deser-pagination-token (clojure.core/get-in letvar1364908 ["NextToken"])))))))

(clojure.core/defn- response-delete-cors-policy-output ([input] (response-delete-cors-policy-output nil input)) ([resultWrapper1364910 input] (clojure.core/let [rawinput1364909 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar1364911 {}] (clojure.core/cond-> {}))))

(clojure.core/defn- response-delete-lifecycle-policy-output ([input] (response-delete-lifecycle-policy-output nil input)) ([resultWrapper1364913 input] (clojure.core/let [rawinput1364912 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar1364914 {}] (clojure.core/cond-> {}))))

(clojure.core/defn- response-get-cors-policy-output ([input] (response-get-cors-policy-output nil input)) ([resultWrapper1364916 input] (clojure.core/let [rawinput1364915 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar1364917 {"CorsPolicy" (rawinput1364915 "CorsPolicy")}] (clojure.core/cond-> {:cors-policy (deser-cors-policy (clojure.core/get-in letvar1364917 ["CorsPolicy"]))}))))

(clojure.core/defn- response-container-not-found-exception ([input] (response-container-not-found-exception nil input)) ([resultWrapper1364919 input] (clojure.core/let [rawinput1364918 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar1364920 {"Message" (rawinput1364918 "Message")}] (clojure.core/cond-> {} (letvar1364920 "Message") (clojure.core/assoc :message (deser-error-message (clojure.core/get-in letvar1364920 ["Message"])))))))

(clojure.core/defn- response-limit-exceeded-exception ([input] (response-limit-exceeded-exception nil input)) ([resultWrapper1364922 input] (clojure.core/let [rawinput1364921 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar1364923 {"Message" (rawinput1364921 "Message")}] (clojure.core/cond-> {} (letvar1364923 "Message") (clojure.core/assoc :message (deser-error-message (clojure.core/get-in letvar1364923 ["Message"])))))))

(clojure.core/defn- response-get-container-policy-output ([input] (response-get-container-policy-output nil input)) ([resultWrapper1364925 input] (clojure.core/let [rawinput1364924 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar1364926 {"Policy" (rawinput1364924 "Policy")}] (clojure.core/cond-> {:policy (deser-container-policy (clojure.core/get-in letvar1364926 ["Policy"]))}))))

(clojure.core/defn- response-container-in-use-exception ([input] (response-container-in-use-exception nil input)) ([resultWrapper1364928 input] (clojure.core/let [rawinput1364927 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar1364929 {"Message" (rawinput1364927 "Message")}] (clojure.core/cond-> {} (letvar1364929 "Message") (clojure.core/assoc :message (deser-error-message (clojure.core/get-in letvar1364929 ["Message"])))))))

(clojure.core/defn- response-delete-container-policy-output ([input] (response-delete-container-policy-output nil input)) ([resultWrapper1364931 input] (clojure.core/let [rawinput1364930 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar1364932 {}] (clojure.core/cond-> {}))))

(clojure.core/defn- response-stop-access-logging-output ([input] (response-stop-access-logging-output nil input)) ([resultWrapper1364934 input] (clojure.core/let [rawinput1364933 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar1364935 {}] (clojure.core/cond-> {}))))

(clojure.core/defn- response-put-container-policy-output ([input] (response-put-container-policy-output nil input)) ([resultWrapper1364937 input] (clojure.core/let [rawinput1364936 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar1364938 {}] (clojure.core/cond-> {}))))

(clojure.core/defn- response-create-container-output ([input] (response-create-container-output nil input)) ([resultWrapper1364940 input] (clojure.core/let [rawinput1364939 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar1364941 {"Container" (rawinput1364939 "Container")}] (clojure.core/cond-> {:container (deser-container (clojure.core/get-in letvar1364941 ["Container"]))}))))

(clojure.core/defn- response-put-cors-policy-output ([input] (response-put-cors-policy-output nil input)) ([resultWrapper1364943 input] (clojure.core/let [rawinput1364942 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar1364944 {}] (clojure.core/cond-> {}))))

(clojure.core/defn- response-policy-not-found-exception ([input] (response-policy-not-found-exception nil input)) ([resultWrapper1364946 input] (clojure.core/let [rawinput1364945 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar1364947 {"Message" (rawinput1364945 "Message")}] (clojure.core/cond-> {} (letvar1364947 "Message") (clojure.core/assoc :message (deser-error-message (clojure.core/get-in letvar1364947 ["Message"])))))))

(clojure.core/defn- response-get-lifecycle-policy-output ([input] (response-get-lifecycle-policy-output nil input)) ([resultWrapper1364949 input] (clojure.core/let [rawinput1364948 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar1364950 {"LifecyclePolicy" (rawinput1364948 "LifecyclePolicy")}] (clojure.core/cond-> {:lifecycle-policy (deser-lifecycle-policy (clojure.core/get-in letvar1364950 ["LifecyclePolicy"]))}))))

(clojure.core/defn- response-start-access-logging-output ([input] (response-start-access-logging-output nil input)) ([resultWrapper1364952 input] (clojure.core/let [rawinput1364951 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar1364953 {}] (clojure.core/cond-> {}))))

(clojure.core/defn- response-cors-policy-not-found-exception ([input] (response-cors-policy-not-found-exception nil input)) ([resultWrapper1364955 input] (clojure.core/let [rawinput1364954 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar1364956 {"Message" (rawinput1364954 "Message")}] (clojure.core/cond-> {} (letvar1364956 "Message") (clojure.core/assoc :message (deser-error-message (clojure.core/get-in letvar1364956 ["Message"])))))))

(clojure.core/defn- response-internal-server-error ([input] (response-internal-server-error nil input)) ([resultWrapper1364958 input] (clojure.core/let [rawinput1364957 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar1364959 {"Message" (rawinput1364957 "Message")}] (clojure.core/cond-> {} (letvar1364959 "Message") (clojure.core/assoc :message (deser-error-message (clojure.core/get-in letvar1364959 ["Message"])))))))

(clojure.core/defn- response-delete-container-output ([input] (response-delete-container-output nil input)) ([resultWrapper1364961 input] (clojure.core/let [rawinput1364960 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar1364962 {}] (clojure.core/cond-> {}))))

(clojure.core/defn- response-describe-container-output ([input] (response-describe-container-output nil input)) ([resultWrapper1364964 input] (clojure.core/let [rawinput1364963 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar1364965 {"Container" (rawinput1364963 "Container")}] (clojure.core/cond-> {} (letvar1364965 "Container") (clojure.core/assoc :container (deser-container (clojure.core/get-in letvar1364965 ["Container"])))))))

(clojure.core/defn- response-put-lifecycle-policy-output ([input] (response-put-lifecycle-policy-output nil input)) ([resultWrapper1364967 input] (clojure.core/let [rawinput1364966 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar1364968 {}] (clojure.core/cond-> {}))))

(clojure.spec.alpha/def :portkey.aws.mediastore.list-containers-output/containers (clojure.spec.alpha/and :portkey.aws.mediastore/container-list))
(clojure.spec.alpha/def :portkey.aws.mediastore.list-containers-output/next-token (clojure.spec.alpha/and :portkey.aws.mediastore/pagination-token))
(clojure.spec.alpha/def :portkey.aws.mediastore/list-containers-output (clojure.spec.alpha/keys :req-un [:portkey.aws.mediastore.list-containers-output/containers] :opt-un [:portkey.aws.mediastore.list-containers-output/next-token]))

(clojure.spec.alpha/def :portkey.aws.mediastore/delete-cors-policy-output (clojure.spec.alpha/keys :req-un [] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.mediastore/delete-lifecycle-policy-output (clojure.spec.alpha/keys :req-un [] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.mediastore/get-cors-policy-output (clojure.spec.alpha/keys :req-un [:portkey.aws.mediastore/cors-policy] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.mediastore/get-lifecycle-policy-input (clojure.spec.alpha/keys :req-un [:portkey.aws.mediastore/container-name] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.mediastore.container-not-found-exception/message (clojure.spec.alpha/and :portkey.aws.mediastore/error-message))
(clojure.spec.alpha/def :portkey.aws.mediastore/container-not-found-exception (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.mediastore.container-not-found-exception/message]))

(clojure.spec.alpha/def :portkey.aws.mediastore/header (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__21076__auto__] (clojure.core/<= 1 (clojure.core/count s__21076__auto__))) (clojure.core/fn [s__21077__auto__] (clojure.core/< (clojure.core/count s__21077__auto__) 8192)) (clojure.core/fn [s__21078__auto__] (clojure.core/re-matches #"[\u0009\u000A\u000D\u0020-\u00FF]+" s__21078__auto__))))

(clojure.spec.alpha/def :portkey.aws.mediastore/create-container-input (clojure.spec.alpha/keys :req-un [:portkey.aws.mediastore/container-name] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.mediastore/cors-policy (clojure.spec.alpha/coll-of :portkey.aws.mediastore/cors-rule :min-count 1 :max-count 100))

(clojure.spec.alpha/def :portkey.aws.mediastore/pagination-token (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__21076__auto__] (clojure.core/<= 1 (clojure.core/count s__21076__auto__))) (clojure.core/fn [s__21077__auto__] (clojure.core/< (clojure.core/count s__21077__auto__) 1024)) (clojure.core/fn [s__21078__auto__] (clojure.core/re-matches #"[0-9A-Za-z=/+]+" s__21078__auto__))))

(clojure.spec.alpha/def :portkey.aws.mediastore.limit-exceeded-exception/message (clojure.spec.alpha/and :portkey.aws.mediastore/error-message))
(clojure.spec.alpha/def :portkey.aws.mediastore/limit-exceeded-exception (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.mediastore.limit-exceeded-exception/message]))

(clojure.spec.alpha/def :portkey.aws.mediastore/put-lifecycle-policy-input (clojure.spec.alpha/keys :req-un [:portkey.aws.mediastore/container-name :portkey.aws.mediastore/lifecycle-policy] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.mediastore/put-cors-policy-input (clojure.spec.alpha/keys :req-un [:portkey.aws.mediastore/container-name :portkey.aws.mediastore/cors-policy] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.mediastore/origin (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__21076__auto__] (clojure.core/<= 1 (clojure.core/count s__21076__auto__))) (clojure.core/fn [s__21077__auto__] (clojure.core/< (clojure.core/count s__21077__auto__) 2048)) (clojure.core/fn [s__21078__auto__] (clojure.core/re-matches #"[\u0009\u000A\u000D\u0020-\u00FF]+" s__21078__auto__))))

(clojure.spec.alpha/def :portkey.aws.mediastore/delete-cors-policy-input (clojure.spec.alpha/keys :req-un [:portkey.aws.mediastore/container-name] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.mediastore.list-containers-input/next-token (clojure.spec.alpha/and :portkey.aws.mediastore/pagination-token))
(clojure.spec.alpha/def :portkey.aws.mediastore.list-containers-input/max-results (clojure.spec.alpha/and :portkey.aws.mediastore/container-list-limit))
(clojure.spec.alpha/def :portkey.aws.mediastore/list-containers-input (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.mediastore.list-containers-input/next-token :portkey.aws.mediastore.list-containers-input/max-results]))

(clojure.spec.alpha/def :portkey.aws.mediastore/error-message (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__21076__auto__] (clojure.core/<= 1 (clojure.core/count s__21076__auto__))) (clojure.core/fn [s__21077__auto__] (clojure.core/< (clojure.core/count s__21077__auto__) 255)) (clojure.core/fn [s__21078__auto__] (clojure.core/re-matches #"[ \w:\.\?-]+" s__21078__auto__))))

(clojure.spec.alpha/def :portkey.aws.mediastore.get-container-policy-output/policy (clojure.spec.alpha/and :portkey.aws.mediastore/container-policy))
(clojure.spec.alpha/def :portkey.aws.mediastore/get-container-policy-output (clojure.spec.alpha/keys :req-un [:portkey.aws.mediastore.get-container-policy-output/policy] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.mediastore/allowed-methods (clojure.spec.alpha/coll-of :portkey.aws.mediastore/method-name :min-count 1 :max-count 4))

(clojure.spec.alpha/def :portkey.aws.mediastore/stop-access-logging-input (clojure.spec.alpha/keys :req-un [:portkey.aws.mediastore/container-name] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.mediastore.container-in-use-exception/message (clojure.spec.alpha/and :portkey.aws.mediastore/error-message))
(clojure.spec.alpha/def :portkey.aws.mediastore/container-in-use-exception (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.mediastore.container-in-use-exception/message]))

(clojure.spec.alpha/def :portkey.aws.mediastore/get-cors-policy-input (clojure.spec.alpha/keys :req-un [:portkey.aws.mediastore/container-name] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.mediastore/delete-container-policy-output (clojure.spec.alpha/keys :req-un [] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.mediastore/stop-access-logging-output (clojure.spec.alpha/keys :req-un [] :opt-un []))

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
(clojure.spec.alpha/def :portkey.aws.mediastore.container/access-logging-enabled (clojure.spec.alpha/and :portkey.aws.mediastore/container-access-logging-enabled))
(clojure.spec.alpha/def :portkey.aws.mediastore/container (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.mediastore/endpoint :portkey.aws.mediastore.container/creation-time :portkey.aws.mediastore.container/arn :portkey.aws.mediastore.container/name :portkey.aws.mediastore.container/status :portkey.aws.mediastore.container/access-logging-enabled]))

(clojure.spec.alpha/def :portkey.aws.mediastore/delete-container-input (clojure.spec.alpha/keys :req-un [:portkey.aws.mediastore/container-name] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.mediastore/start-access-logging-input (clojure.spec.alpha/keys :req-un [:portkey.aws.mediastore/container-name] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.mediastore/get-lifecycle-policy-output (clojure.spec.alpha/keys :req-un [:portkey.aws.mediastore/lifecycle-policy] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.mediastore/container-list (clojure.spec.alpha/coll-of :portkey.aws.mediastore/container))

(clojure.spec.alpha/def :portkey.aws.mediastore/container-list-limit (clojure.spec.alpha/int-in 1 100))

(clojure.spec.alpha/def :portkey.aws.mediastore/container-policy (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__21076__auto__] (clojure.core/<= 1 (clojure.core/count s__21076__auto__))) (clojure.core/fn [s__21077__auto__] (clojure.core/< (clojure.core/count s__21077__auto__) 8192)) (clojure.core/fn [s__21078__auto__] (clojure.core/re-matches #"[\u0009\u000A\u000D\u0020-\u00FF]+" s__21078__auto__))))

(clojure.spec.alpha/def :portkey.aws.mediastore/start-access-logging-output (clojure.spec.alpha/keys :req-un [] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.mediastore/endpoint (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__21076__auto__] (clojure.core/<= 1 (clojure.core/count s__21076__auto__))) (clojure.core/fn [s__21077__auto__] (clojure.core/< (clojure.core/count s__21077__auto__) 255))))

(clojure.spec.alpha/def :portkey.aws.mediastore/container-arn (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__21076__auto__] (clojure.core/<= 1 (clojure.core/count s__21076__auto__))) (clojure.core/fn [s__21077__auto__] (clojure.core/< (clojure.core/count s__21077__auto__) 1024)) (clojure.core/fn [s__21078__auto__] (clojure.core/re-matches #"arn:aws:mediastore:[a-z]+-[a-z]+-\d:\d{12}:container/\w{1,255}" s__21078__auto__))))

(clojure.spec.alpha/def :portkey.aws.mediastore.put-container-policy-input/policy (clojure.spec.alpha/and :portkey.aws.mediastore/container-policy))
(clojure.spec.alpha/def :portkey.aws.mediastore/put-container-policy-input (clojure.spec.alpha/keys :req-un [:portkey.aws.mediastore/container-name :portkey.aws.mediastore.put-container-policy-input/policy] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.mediastore.cors-policy-not-found-exception/message (clojure.spec.alpha/and :portkey.aws.mediastore/error-message))
(clojure.spec.alpha/def :portkey.aws.mediastore/cors-policy-not-found-exception (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.mediastore.cors-policy-not-found-exception/message]))

(clojure.spec.alpha/def :portkey.aws.mediastore/method-name #{"DELETE" :get :delete :head "HEAD" :put "GET" "PUT"})

(clojure.spec.alpha/def :portkey.aws.mediastore/container-access-logging-enabled clojure.core/boolean?)

(clojure.spec.alpha/def :portkey.aws.mediastore.internal-server-error/message (clojure.spec.alpha/and :portkey.aws.mediastore/error-message))
(clojure.spec.alpha/def :portkey.aws.mediastore/internal-server-error (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.mediastore.internal-server-error/message]))

(clojure.spec.alpha/def :portkey.aws.mediastore/cors-rule (clojure.spec.alpha/keys :req-un [:portkey.aws.mediastore/allowed-origins :portkey.aws.mediastore/allowed-headers] :opt-un [:portkey.aws.mediastore/allowed-methods :portkey.aws.mediastore/max-age-seconds :portkey.aws.mediastore/expose-headers]))

(clojure.spec.alpha/def :portkey.aws.mediastore/describe-container-input (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.mediastore/container-name]))

(clojure.spec.alpha/def :portkey.aws.mediastore/allowed-headers (clojure.spec.alpha/coll-of :portkey.aws.mediastore/header :min-count 0 :max-count 100))

(clojure.spec.alpha/def :portkey.aws.mediastore/allowed-origins (clojure.spec.alpha/coll-of :portkey.aws.mediastore/origin :min-count 1 :max-count 100))

(clojure.spec.alpha/def :portkey.aws.mediastore/container-name (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__21076__auto__] (clojure.core/<= 1 (clojure.core/count s__21076__auto__))) (clojure.core/fn [s__21077__auto__] (clojure.core/< (clojure.core/count s__21077__auto__) 255)) (clojure.core/fn [s__21078__auto__] (clojure.core/re-matches #"[\w-]+" s__21078__auto__))))

(clojure.spec.alpha/def :portkey.aws.mediastore/delete-container-output (clojure.spec.alpha/keys :req-un [] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.mediastore/delete-lifecycle-policy-input (clojure.spec.alpha/keys :req-un [:portkey.aws.mediastore/container-name] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.mediastore/max-age-seconds (clojure.spec.alpha/int-in 0 2147483647))

(clojure.spec.alpha/def :portkey.aws.mediastore/container-status #{:creating :deleting :active "DELETING" "CREATING" "ACTIVE"})

(clojure.spec.alpha/def :portkey.aws.mediastore/describe-container-output (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.mediastore/container]))

(clojure.spec.alpha/def :portkey.aws.mediastore/time-stamp clojure.core/inst?)

(clojure.spec.alpha/def :portkey.aws.mediastore/delete-container-policy-input (clojure.spec.alpha/keys :req-un [:portkey.aws.mediastore/container-name] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.mediastore/get-container-policy-input (clojure.spec.alpha/keys :req-un [:portkey.aws.mediastore/container-name] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.mediastore/lifecycle-policy (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__21076__auto__] (clojure.core/<= 0 (clojure.core/count s__21076__auto__))) (clojure.core/fn [s__21077__auto__] (clojure.core/< (clojure.core/count s__21077__auto__) 8192)) (clojure.core/fn [s__21078__auto__] (clojure.core/re-matches #"[\u0009\u000A\u000D\u0020-\u00FF]+" s__21078__auto__))))

(clojure.spec.alpha/def :portkey.aws.mediastore/put-lifecycle-policy-output (clojure.spec.alpha/keys :req-un [] :opt-un []))

(clojure.core/defn delete-container-policy "Deletes the access policy that is associated with the specified container." ([delete-container-policy-inputinput] (clojure.core/let [request-function-result__22119__auto__ (req-delete-container-policy-input delete-container-policy-inputinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__22119__auto__ {:http.request.configuration/endpoints portkey.aws.mediastore/endpoints, :http.request.configuration/target-prefix "MediaStore_20170901", :http.request.spec/output-spec :portkey.aws.mediastore/delete-container-policy-output, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2017-09-01", :http.request.configuration/service-id "MediaStore", :http.request.spec/input-spec :portkey.aws.mediastore/delete-container-policy-input, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "DeleteContainerPolicy", :http.request.configuration/output-deser-fn response-delete-container-policy-output, :http.request.spec/error-spec {"ContainerInUseException" :portkey.aws.mediastore/container-in-use-exception, "ContainerNotFoundException" :portkey.aws.mediastore/container-not-found-exception, "PolicyNotFoundException" :portkey.aws.mediastore/policy-not-found-exception, "InternalServerError" :portkey.aws.mediastore/internal-server-error}})))))
(clojure.spec.alpha/fdef delete-container-policy :args (clojure.spec.alpha/tuple :portkey.aws.mediastore/delete-container-policy-input) :ret (clojure.spec.alpha/and :portkey.aws.mediastore/delete-container-policy-output))

(clojure.core/defn get-container-policy "Retrieves the access policy for the specified container. For information about\nthe data that is included in an access policy, see the AWS Identity and Access\nManagement User Guide (https://aws.amazon.com/documentation/iam/)." ([get-container-policy-inputinput] (clojure.core/let [request-function-result__22119__auto__ (req-get-container-policy-input get-container-policy-inputinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__22119__auto__ {:http.request.configuration/endpoints portkey.aws.mediastore/endpoints, :http.request.configuration/target-prefix "MediaStore_20170901", :http.request.spec/output-spec :portkey.aws.mediastore/get-container-policy-output, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2017-09-01", :http.request.configuration/service-id "MediaStore", :http.request.spec/input-spec :portkey.aws.mediastore/get-container-policy-input, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "GetContainerPolicy", :http.request.configuration/output-deser-fn response-get-container-policy-output, :http.request.spec/error-spec {"ContainerInUseException" :portkey.aws.mediastore/container-in-use-exception, "ContainerNotFoundException" :portkey.aws.mediastore/container-not-found-exception, "PolicyNotFoundException" :portkey.aws.mediastore/policy-not-found-exception, "InternalServerError" :portkey.aws.mediastore/internal-server-error}})))))
(clojure.spec.alpha/fdef get-container-policy :args (clojure.spec.alpha/tuple :portkey.aws.mediastore/get-container-policy-input) :ret (clojure.spec.alpha/and :portkey.aws.mediastore/get-container-policy-output))

(clojure.core/defn put-container-policy "Creates an access policy for the specified container to restrict the users and\nclients that can access it. For information about the data that is included in\nan access policy, see the AWS Identity and Access Management User Guide\n(https://aws.amazon.com/documentation/iam/).\n For this release of the REST API, you can create only one policy for a\ncontainer. If you enter PutContainerPolicy twice, the second command modifies\nthe existing policy." ([put-container-policy-inputinput] (clojure.core/let [request-function-result__22119__auto__ (req-put-container-policy-input put-container-policy-inputinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__22119__auto__ {:http.request.configuration/endpoints portkey.aws.mediastore/endpoints, :http.request.configuration/target-prefix "MediaStore_20170901", :http.request.spec/output-spec :portkey.aws.mediastore/put-container-policy-output, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2017-09-01", :http.request.configuration/service-id "MediaStore", :http.request.spec/input-spec :portkey.aws.mediastore/put-container-policy-input, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "PutContainerPolicy", :http.request.configuration/output-deser-fn response-put-container-policy-output, :http.request.spec/error-spec {"ContainerNotFoundException" :portkey.aws.mediastore/container-not-found-exception, "ContainerInUseException" :portkey.aws.mediastore/container-in-use-exception, "InternalServerError" :portkey.aws.mediastore/internal-server-error}})))))
(clojure.spec.alpha/fdef put-container-policy :args (clojure.spec.alpha/tuple :portkey.aws.mediastore/put-container-policy-input) :ret (clojure.spec.alpha/and :portkey.aws.mediastore/put-container-policy-output))

(clojure.core/defn describe-container "Retrieves the properties of the requested container. This request is commonly\nused to retrieve the endpoint of a container. An endpoint is a value assigned by\nthe service when a new container is created. A container's endpoint does not\nchange after it has been assigned. The DescribeContainer request returns a\nsingle Container object based on ContainerName. To return all Container objects\nthat are associated with a specified AWS account, use ListContainers." ([] (describe-container {})) ([describe-container-inputinput] (clojure.core/let [request-function-result__22119__auto__ (req-describe-container-input describe-container-inputinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__22119__auto__ {:http.request.configuration/endpoints portkey.aws.mediastore/endpoints, :http.request.configuration/target-prefix "MediaStore_20170901", :http.request.spec/output-spec :portkey.aws.mediastore/describe-container-output, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2017-09-01", :http.request.configuration/service-id "MediaStore", :http.request.spec/input-spec :portkey.aws.mediastore/describe-container-input, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "DescribeContainer", :http.request.configuration/output-deser-fn response-describe-container-output, :http.request.spec/error-spec {"ContainerNotFoundException" :portkey.aws.mediastore/container-not-found-exception, "InternalServerError" :portkey.aws.mediastore/internal-server-error}})))))
(clojure.spec.alpha/fdef describe-container :args (clojure.spec.alpha/? :portkey.aws.mediastore/describe-container-input) :ret (clojure.spec.alpha/and :portkey.aws.mediastore/describe-container-output))

(clojure.core/defn delete-lifecycle-policy "Removes an object lifecycle policy from a container. It takes up to 20 minutes\nfor the change to take effect." ([delete-lifecycle-policy-inputinput] (clojure.core/let [request-function-result__22119__auto__ (req-delete-lifecycle-policy-input delete-lifecycle-policy-inputinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__22119__auto__ {:http.request.configuration/endpoints portkey.aws.mediastore/endpoints, :http.request.configuration/target-prefix "MediaStore_20170901", :http.request.spec/output-spec :portkey.aws.mediastore/delete-lifecycle-policy-output, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2017-09-01", :http.request.configuration/service-id "MediaStore", :http.request.spec/input-spec :portkey.aws.mediastore/delete-lifecycle-policy-input, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "DeleteLifecyclePolicy", :http.request.configuration/output-deser-fn response-delete-lifecycle-policy-output, :http.request.spec/error-spec {"ContainerInUseException" :portkey.aws.mediastore/container-in-use-exception, "ContainerNotFoundException" :portkey.aws.mediastore/container-not-found-exception, "PolicyNotFoundException" :portkey.aws.mediastore/policy-not-found-exception, "InternalServerError" :portkey.aws.mediastore/internal-server-error}})))))
(clojure.spec.alpha/fdef delete-lifecycle-policy :args (clojure.spec.alpha/tuple :portkey.aws.mediastore/delete-lifecycle-policy-input) :ret (clojure.spec.alpha/and :portkey.aws.mediastore/delete-lifecycle-policy-output))

(clojure.core/defn stop-access-logging "Stops access logging on the specified container. When you stop access logging on\na container, MediaStore stops sending access logs to Amazon CloudWatch Logs.\nThese access logs are not saved and are not retrievable." ([stop-access-logging-inputinput] (clojure.core/let [request-function-result__22119__auto__ (req-stop-access-logging-input stop-access-logging-inputinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__22119__auto__ {:http.request.configuration/endpoints portkey.aws.mediastore/endpoints, :http.request.configuration/target-prefix "MediaStore_20170901", :http.request.spec/output-spec :portkey.aws.mediastore/stop-access-logging-output, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2017-09-01", :http.request.configuration/service-id "MediaStore", :http.request.spec/input-spec :portkey.aws.mediastore/stop-access-logging-input, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "StopAccessLogging", :http.request.configuration/output-deser-fn response-stop-access-logging-output, :http.request.spec/error-spec {"ContainerInUseException" :portkey.aws.mediastore/container-in-use-exception, "ContainerNotFoundException" :portkey.aws.mediastore/container-not-found-exception, "InternalServerError" :portkey.aws.mediastore/internal-server-error}})))))
(clojure.spec.alpha/fdef stop-access-logging :args (clojure.spec.alpha/tuple :portkey.aws.mediastore/stop-access-logging-input) :ret (clojure.spec.alpha/and :portkey.aws.mediastore/stop-access-logging-output))

(clojure.core/defn put-lifecycle-policy "Writes an object lifecycle policy to a container. If the container already has\nan object lifecycle policy, the service replaces the existing policy with the\nnew policy. It takes up to 20 minutes for the change to take effect.\n For information about how to construct an object lifecycle policy, see\nComponents of an Object Lifecycle Policy\n(https://docs.aws.amazon.com/mediastore/latest/ug/policies-object-lifecycle-components.html)." ([put-lifecycle-policy-inputinput] (clojure.core/let [request-function-result__22119__auto__ (req-put-lifecycle-policy-input put-lifecycle-policy-inputinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__22119__auto__ {:http.request.configuration/endpoints portkey.aws.mediastore/endpoints, :http.request.configuration/target-prefix "MediaStore_20170901", :http.request.spec/output-spec :portkey.aws.mediastore/put-lifecycle-policy-output, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2017-09-01", :http.request.configuration/service-id "MediaStore", :http.request.spec/input-spec :portkey.aws.mediastore/put-lifecycle-policy-input, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "PutLifecyclePolicy", :http.request.configuration/output-deser-fn response-put-lifecycle-policy-output, :http.request.spec/error-spec {"ContainerInUseException" :portkey.aws.mediastore/container-in-use-exception, "ContainerNotFoundException" :portkey.aws.mediastore/container-not-found-exception, "InternalServerError" :portkey.aws.mediastore/internal-server-error}})))))
(clojure.spec.alpha/fdef put-lifecycle-policy :args (clojure.spec.alpha/tuple :portkey.aws.mediastore/put-lifecycle-policy-input) :ret (clojure.spec.alpha/and :portkey.aws.mediastore/put-lifecycle-policy-output))

(clojure.core/defn delete-cors-policy "Deletes the cross-origin resource sharing (CORS) configuration information that\nis set for the container.\n To use this operation, you must have permission to perform the\nMediaStore:DeleteCorsPolicy action. The container owner has this permission by\ndefault and can grant this permission to others." ([delete-cors-policy-inputinput] (clojure.core/let [request-function-result__22119__auto__ (req-delete-cors-policy-input delete-cors-policy-inputinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__22119__auto__ {:http.request.configuration/endpoints portkey.aws.mediastore/endpoints, :http.request.configuration/target-prefix "MediaStore_20170901", :http.request.spec/output-spec :portkey.aws.mediastore/delete-cors-policy-output, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2017-09-01", :http.request.configuration/service-id "MediaStore", :http.request.spec/input-spec :portkey.aws.mediastore/delete-cors-policy-input, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "DeleteCorsPolicy", :http.request.configuration/output-deser-fn response-delete-cors-policy-output, :http.request.spec/error-spec {"ContainerInUseException" :portkey.aws.mediastore/container-in-use-exception, "ContainerNotFoundException" :portkey.aws.mediastore/container-not-found-exception, "CorsPolicyNotFoundException" :portkey.aws.mediastore/cors-policy-not-found-exception, "InternalServerError" :portkey.aws.mediastore/internal-server-error}})))))
(clojure.spec.alpha/fdef delete-cors-policy :args (clojure.spec.alpha/tuple :portkey.aws.mediastore/delete-cors-policy-input) :ret (clojure.spec.alpha/and :portkey.aws.mediastore/delete-cors-policy-output))

(clojure.core/defn get-lifecycle-policy "Retrieves the object lifecycle policy that is assigned to a container." ([get-lifecycle-policy-inputinput] (clojure.core/let [request-function-result__22119__auto__ (req-get-lifecycle-policy-input get-lifecycle-policy-inputinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__22119__auto__ {:http.request.configuration/endpoints portkey.aws.mediastore/endpoints, :http.request.configuration/target-prefix "MediaStore_20170901", :http.request.spec/output-spec :portkey.aws.mediastore/get-lifecycle-policy-output, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2017-09-01", :http.request.configuration/service-id "MediaStore", :http.request.spec/input-spec :portkey.aws.mediastore/get-lifecycle-policy-input, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "GetLifecyclePolicy", :http.request.configuration/output-deser-fn response-get-lifecycle-policy-output, :http.request.spec/error-spec {"ContainerInUseException" :portkey.aws.mediastore/container-in-use-exception, "ContainerNotFoundException" :portkey.aws.mediastore/container-not-found-exception, "PolicyNotFoundException" :portkey.aws.mediastore/policy-not-found-exception, "InternalServerError" :portkey.aws.mediastore/internal-server-error}})))))
(clojure.spec.alpha/fdef get-lifecycle-policy :args (clojure.spec.alpha/tuple :portkey.aws.mediastore/get-lifecycle-policy-input) :ret (clojure.spec.alpha/and :portkey.aws.mediastore/get-lifecycle-policy-output))

(clojure.core/defn create-container "Creates a storage container to hold objects. A container is similar to a bucket\nin the Amazon S3 service." ([create-container-inputinput] (clojure.core/let [request-function-result__22119__auto__ (req-create-container-input create-container-inputinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__22119__auto__ {:http.request.configuration/endpoints portkey.aws.mediastore/endpoints, :http.request.configuration/target-prefix "MediaStore_20170901", :http.request.spec/output-spec :portkey.aws.mediastore/create-container-output, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2017-09-01", :http.request.configuration/service-id "MediaStore", :http.request.spec/input-spec :portkey.aws.mediastore/create-container-input, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "CreateContainer", :http.request.configuration/output-deser-fn response-create-container-output, :http.request.spec/error-spec {"ContainerInUseException" :portkey.aws.mediastore/container-in-use-exception, "LimitExceededException" :portkey.aws.mediastore/limit-exceeded-exception, "InternalServerError" :portkey.aws.mediastore/internal-server-error}})))))
(clojure.spec.alpha/fdef create-container :args (clojure.spec.alpha/tuple :portkey.aws.mediastore/create-container-input) :ret (clojure.spec.alpha/and :portkey.aws.mediastore/create-container-output))

(clojure.core/defn start-access-logging "Starts access logging on the specified container. When you enable access logging\non a container, MediaStore delivers access logs for objects stored in that\ncontainer to Amazon CloudWatch Logs." ([start-access-logging-inputinput] (clojure.core/let [request-function-result__22119__auto__ (req-start-access-logging-input start-access-logging-inputinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__22119__auto__ {:http.request.configuration/endpoints portkey.aws.mediastore/endpoints, :http.request.configuration/target-prefix "MediaStore_20170901", :http.request.spec/output-spec :portkey.aws.mediastore/start-access-logging-output, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2017-09-01", :http.request.configuration/service-id "MediaStore", :http.request.spec/input-spec :portkey.aws.mediastore/start-access-logging-input, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "StartAccessLogging", :http.request.configuration/output-deser-fn response-start-access-logging-output, :http.request.spec/error-spec {"ContainerInUseException" :portkey.aws.mediastore/container-in-use-exception, "ContainerNotFoundException" :portkey.aws.mediastore/container-not-found-exception, "InternalServerError" :portkey.aws.mediastore/internal-server-error}})))))
(clojure.spec.alpha/fdef start-access-logging :args (clojure.spec.alpha/tuple :portkey.aws.mediastore/start-access-logging-input) :ret (clojure.spec.alpha/and :portkey.aws.mediastore/start-access-logging-output))

(clojure.core/defn get-cors-policy "Returns the cross-origin resource sharing (CORS) configuration information that\nis set for the container.\n To use this operation, you must have permission to perform the\nMediaStore:GetCorsPolicy action. By default, the container owner has this\npermission and can grant it to others." ([get-cors-policy-inputinput] (clojure.core/let [request-function-result__22119__auto__ (req-get-cors-policy-input get-cors-policy-inputinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__22119__auto__ {:http.request.configuration/endpoints portkey.aws.mediastore/endpoints, :http.request.configuration/target-prefix "MediaStore_20170901", :http.request.spec/output-spec :portkey.aws.mediastore/get-cors-policy-output, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2017-09-01", :http.request.configuration/service-id "MediaStore", :http.request.spec/input-spec :portkey.aws.mediastore/get-cors-policy-input, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "GetCorsPolicy", :http.request.configuration/output-deser-fn response-get-cors-policy-output, :http.request.spec/error-spec {"ContainerInUseException" :portkey.aws.mediastore/container-in-use-exception, "ContainerNotFoundException" :portkey.aws.mediastore/container-not-found-exception, "CorsPolicyNotFoundException" :portkey.aws.mediastore/cors-policy-not-found-exception, "InternalServerError" :portkey.aws.mediastore/internal-server-error}})))))
(clojure.spec.alpha/fdef get-cors-policy :args (clojure.spec.alpha/tuple :portkey.aws.mediastore/get-cors-policy-input) :ret (clojure.spec.alpha/and :portkey.aws.mediastore/get-cors-policy-output))

(clojure.core/defn delete-container "Deletes the specified container. Before you make a DeleteContainer request,\ndelete any objects in the container or in any folders in the container. You can\ndelete only empty containers." ([delete-container-inputinput] (clojure.core/let [request-function-result__22119__auto__ (req-delete-container-input delete-container-inputinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__22119__auto__ {:http.request.configuration/endpoints portkey.aws.mediastore/endpoints, :http.request.configuration/target-prefix "MediaStore_20170901", :http.request.spec/output-spec :portkey.aws.mediastore/delete-container-output, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2017-09-01", :http.request.configuration/service-id "MediaStore", :http.request.spec/input-spec :portkey.aws.mediastore/delete-container-input, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "DeleteContainer", :http.request.configuration/output-deser-fn response-delete-container-output, :http.request.spec/error-spec {"ContainerInUseException" :portkey.aws.mediastore/container-in-use-exception, "ContainerNotFoundException" :portkey.aws.mediastore/container-not-found-exception, "InternalServerError" :portkey.aws.mediastore/internal-server-error}})))))
(clojure.spec.alpha/fdef delete-container :args (clojure.spec.alpha/tuple :portkey.aws.mediastore/delete-container-input) :ret (clojure.spec.alpha/and :portkey.aws.mediastore/delete-container-output))

(clojure.core/defn list-containers "Lists the properties of all containers in AWS Elemental MediaStore.\n You can query to receive all the containers in one response. Or you can include\nthe MaxResults parameter to receive a limited number of containers in each\nresponse. In this case, the response includes a token. To get the next set of\ncontainers, send the command again, this time with the NextToken parameter (with\nthe returned token as its value). The next set of responses appears, with a\ntoken if there are still more containers to receive.\n See also DescribeContainer, which gets the properties of one container." ([] (list-containers {})) ([list-containers-inputinput] (clojure.core/let [request-function-result__22119__auto__ (req-list-containers-input list-containers-inputinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__22119__auto__ {:http.request.configuration/endpoints portkey.aws.mediastore/endpoints, :http.request.configuration/target-prefix "MediaStore_20170901", :http.request.spec/output-spec :portkey.aws.mediastore/list-containers-output, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2017-09-01", :http.request.configuration/service-id "MediaStore", :http.request.spec/input-spec :portkey.aws.mediastore/list-containers-input, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "ListContainers", :http.request.configuration/output-deser-fn response-list-containers-output, :http.request.spec/error-spec {"InternalServerError" :portkey.aws.mediastore/internal-server-error}})))))
(clojure.spec.alpha/fdef list-containers :args (clojure.spec.alpha/? :portkey.aws.mediastore/list-containers-input) :ret (clojure.spec.alpha/and :portkey.aws.mediastore/list-containers-output))

(clojure.core/defn put-cors-policy "Sets the cross-origin resource sharing (CORS) configuration on a container so\nthat the container can service cross-origin requests. For example, you might\nwant to enable a request whose origin is http://www.example.com to access your\nAWS Elemental MediaStore container at my.example.container.com by using the\nbrowser's XMLHttpRequest capability.\n To enable CORS on a container, you attach a CORS policy to the container. In\nthe CORS policy, you configure rules that identify origins and the HTTP methods\nthat can be executed on your container. The policy can contain up to 398,000\ncharacters. You can add up to 100 rules to a CORS policy. If more than one rule\napplies, the service uses the first applicable rule listed.\n To learn more about CORS, see Cross-Origin Resource Sharing (CORS) in AWS\nElemental MediaStore\n(https://docs.aws.amazon.com/mediastore/latest/ug/cors-policy.html)." ([put-cors-policy-inputinput] (clojure.core/let [request-function-result__22119__auto__ (req-put-cors-policy-input put-cors-policy-inputinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__22119__auto__ {:http.request.configuration/endpoints portkey.aws.mediastore/endpoints, :http.request.configuration/target-prefix "MediaStore_20170901", :http.request.spec/output-spec :portkey.aws.mediastore/put-cors-policy-output, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2017-09-01", :http.request.configuration/service-id "MediaStore", :http.request.spec/input-spec :portkey.aws.mediastore/put-cors-policy-input, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "PutCorsPolicy", :http.request.configuration/output-deser-fn response-put-cors-policy-output, :http.request.spec/error-spec {"ContainerNotFoundException" :portkey.aws.mediastore/container-not-found-exception, "ContainerInUseException" :portkey.aws.mediastore/container-in-use-exception, "InternalServerError" :portkey.aws.mediastore/internal-server-error}})))))
(clojure.spec.alpha/fdef put-cors-policy :args (clojure.spec.alpha/tuple :portkey.aws.mediastore/put-cors-policy-input) :ret (clojure.spec.alpha/and :portkey.aws.mediastore/put-cors-policy-output))
