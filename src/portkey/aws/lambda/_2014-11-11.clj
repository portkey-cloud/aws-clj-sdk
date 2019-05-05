(ns portkey.aws.lambda.-2014-11-11 (:require [portkey.aws]))

(def
 endpoints
 '{"us-gov-east-1"
   {:credential-scope {:service "lambda", :region "us-gov-east-1"},
    :ssl-common-name "lambda.us-gov-east-1.amazonaws.com",
    :endpoint "https://lambda.us-gov-east-1.amazonaws.com",
    :signature-version :v4},
   "ap-northeast-1"
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
   "cn-northwest-1"
   {:credential-scope {:service "lambda", :region "cn-northwest-1"},
    :ssl-common-name "lambda.cn-northwest-1.amazonaws.com.cn",
    :endpoint "https://lambda.cn-northwest-1.amazonaws.com.cn",
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
    :signature-version :v4},
   "eu-north-1"
   {:credential-scope {:service "lambda", :region "eu-north-1"},
    :ssl-common-name "lambda.eu-north-1.amazonaws.com",
    :endpoint "https://lambda.eu-north-1.amazonaws.com",
    :signature-version :v4}})

(clojure.core/declare ser-function-name)

(clojure.core/declare ser-timeout)

(clojure.core/declare ser-map)

(clojure.core/declare ser-handler)

(clojure.core/declare ser-runtime)

(clojure.core/declare ser-role-arn)

(clojure.core/declare ser-mode)

(clojure.core/declare ser-memory-size)

(clojure.core/declare ser-description)

(clojure.core/declare ser-max-list-items)

(clojure.core/declare ser-integer)

(clojure.core/declare ser-string)

(clojure.core/declare ser-blob)

(clojure.core/defn- ser-function-name [input] #:http.request.field{:value input, :shape "FunctionName"})

(clojure.core/defn- ser-timeout [input] #:http.request.field{:value input, :shape "Timeout"})

(clojure.core/defn- ser-map [input] #:http.request.field{:value (clojure.core/into [] (clojure.core/map (clojure.core/fn [[k v]] [(clojure.core/into (ser-string k) #:http.request.field{:map-info "key", :shape "String"}) (clojure.core/into (ser-string v) #:http.request.field{:map-info "value", :shape "String"})])) input), :shape "Map", :type "map"})

(clojure.core/defn- ser-handler [input] #:http.request.field{:value input, :shape "Handler"})

(clojure.core/defn- ser-runtime [input] #:http.request.field{:value (clojure.core/get {"nodejs" "nodejs", :nodejs "nodejs"} input), :shape "Runtime"})

(clojure.core/defn- ser-role-arn [input] #:http.request.field{:value input, :shape "RoleArn"})

(clojure.core/defn- ser-mode [input] #:http.request.field{:value (clojure.core/get {"event" "event", :event "event"} input), :shape "Mode"})

(clojure.core/defn- ser-memory-size [input] #:http.request.field{:value input, :shape "MemorySize"})

(clojure.core/defn- ser-description [input] #:http.request.field{:value input, :shape "Description"})

(clojure.core/defn- ser-max-list-items [input] #:http.request.field{:value input, :shape "MaxListItems"})

(clojure.core/defn- ser-integer [input] #:http.request.field{:value input, :shape "Integer"})

(clojure.core/defn- ser-string [input] #:http.request.field{:value input, :shape "String"})

(clojure.core/defn- ser-blob [input] #:http.request.field{:value (portkey.aws/base64-encode input), :shape "Blob"})

(clojure.core/defn- req-add-event-source-request [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (ser-string (input :event-source)) #:http.request.field{:name "EventSource", :shape "String"}) (clojure.core/into (ser-function-name (input :function-name)) #:http.request.field{:name "FunctionName", :shape "FunctionName"}) (clojure.core/into (ser-role-arn (input :role)) #:http.request.field{:name "Role", :shape "RoleArn"})]} (clojure.core/contains? input :batch-size) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-integer (input :batch-size)) #:http.request.field{:name "BatchSize", :shape "Integer"})) (clojure.core/contains? input :parameters) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-map (input :parameters)) #:http.request.field{:name "Parameters", :shape "Map"}))))

(clojure.core/defn- req-upload-function-request [input] (clojure.core/cond-> #:http.request.configuration{:uri [(clojure.core/into (ser-function-name (input :function-name)) #:http.request.field{:name "FunctionName", :shape "FunctionName", :location "uri", :location-name "FunctionName"})], :body [(clojure.core/into (ser-blob (input :function-zip)) #:http.request.field{:name "FunctionZip", :shape "Blob"})], :querystring [(clojure.core/into (ser-runtime (input :runtime)) #:http.request.field{:name "Runtime", :shape "Runtime", :location "querystring", :location-name "Runtime"}) (clojure.core/into (ser-role-arn (input :role)) #:http.request.field{:name "Role", :shape "RoleArn", :location "querystring", :location-name "Role"}) (clojure.core/into (ser-handler (input :handler)) #:http.request.field{:name "Handler", :shape "Handler", :location "querystring", :location-name "Handler"}) (clojure.core/into (ser-mode (input :mode)) #:http.request.field{:name "Mode", :shape "Mode", :location "querystring", :location-name "Mode"})]} (clojure.core/contains? input :timeout) (clojure.core/update-in [:http.request.configuration/querystring] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-timeout (input :timeout)) #:http.request.field{:name "Timeout", :shape "Timeout", :location "querystring", :location-name "Timeout"})) (clojure.core/contains? input :memory-size) (clojure.core/update-in [:http.request.configuration/querystring] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-memory-size (input :memory-size)) #:http.request.field{:name "MemorySize", :shape "MemorySize", :location "querystring", :location-name "MemorySize"})) (clojure.core/contains? input :description) (clojure.core/update-in [:http.request.configuration/querystring] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-description (input :description)) #:http.request.field{:name "Description", :shape "Description", :location "querystring", :location-name "Description"}))))

(clojure.core/defn- req-remove-event-source-request [input] (clojure.core/cond-> #:http.request.configuration{:uri [(clojure.core/into (ser-string (input :uuid)) #:http.request.field{:name "UUID", :shape "String", :location "uri", :location-name "UUID"})]}))

(clojure.core/defn- req-delete-function-request [input] (clojure.core/cond-> #:http.request.configuration{:uri [(clojure.core/into (ser-function-name (input :function-name)) #:http.request.field{:name "FunctionName", :shape "FunctionName", :location "uri", :location-name "FunctionName"})]}))

(clojure.core/defn- req-invoke-async-request [input] (clojure.core/cond-> #:http.request.configuration{:uri [(clojure.core/into (ser-function-name (input :function-name)) #:http.request.field{:name "FunctionName", :shape "FunctionName", :location "uri", :location-name "FunctionName"})], :body [(clojure.core/into (ser-blob (input :invoke-args)) #:http.request.field{:name "InvokeArgs", :shape "Blob"})]}))

(clojure.core/defn- req-get-function-request [input] (clojure.core/cond-> #:http.request.configuration{:uri [(clojure.core/into (ser-function-name (input :function-name)) #:http.request.field{:name "FunctionName", :shape "FunctionName", :location "uri", :location-name "FunctionName"})]}))

(clojure.core/defn- req-update-function-configuration-request [input] (clojure.core/cond-> #:http.request.configuration{:uri [(clojure.core/into (ser-function-name (input :function-name)) #:http.request.field{:name "FunctionName", :shape "FunctionName", :location "uri", :location-name "FunctionName"})]} (clojure.core/contains? input :role) (clojure.core/update-in [:http.request.configuration/querystring] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-role-arn (input :role)) #:http.request.field{:name "Role", :shape "RoleArn", :location "querystring", :location-name "Role"})) (clojure.core/contains? input :handler) (clojure.core/update-in [:http.request.configuration/querystring] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-handler (input :handler)) #:http.request.field{:name "Handler", :shape "Handler", :location "querystring", :location-name "Handler"})) (clojure.core/contains? input :description) (clojure.core/update-in [:http.request.configuration/querystring] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-description (input :description)) #:http.request.field{:name "Description", :shape "Description", :location "querystring", :location-name "Description"})) (clojure.core/contains? input :timeout) (clojure.core/update-in [:http.request.configuration/querystring] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-timeout (input :timeout)) #:http.request.field{:name "Timeout", :shape "Timeout", :location "querystring", :location-name "Timeout"})) (clojure.core/contains? input :memory-size) (clojure.core/update-in [:http.request.configuration/querystring] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-memory-size (input :memory-size)) #:http.request.field{:name "MemorySize", :shape "MemorySize", :location "querystring", :location-name "MemorySize"}))))

(clojure.core/defn- req-list-event-sources-request [input] (clojure.core/cond-> {} (clojure.core/contains? input :event-source-arn) (clojure.core/update-in [:http.request.configuration/querystring] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-string (input :event-source-arn)) #:http.request.field{:name "EventSourceArn", :shape "String", :location "querystring", :location-name "EventSource"})) (clojure.core/contains? input :function-name) (clojure.core/update-in [:http.request.configuration/querystring] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-function-name (input :function-name)) #:http.request.field{:name "FunctionName", :shape "FunctionName", :location "querystring", :location-name "FunctionName"})) (clojure.core/contains? input :marker) (clojure.core/update-in [:http.request.configuration/querystring] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-string (input :marker)) #:http.request.field{:name "Marker", :shape "String", :location "querystring", :location-name "Marker"})) (clojure.core/contains? input :max-items) (clojure.core/update-in [:http.request.configuration/querystring] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-max-list-items (input :max-items)) #:http.request.field{:name "MaxItems", :shape "MaxListItems", :location "querystring", :location-name "MaxItems"}))))

(clojure.core/defn- req-list-functions-request [input] (clojure.core/cond-> {} (clojure.core/contains? input :marker) (clojure.core/update-in [:http.request.configuration/querystring] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-string (input :marker)) #:http.request.field{:name "Marker", :shape "String", :location "querystring", :location-name "Marker"})) (clojure.core/contains? input :max-items) (clojure.core/update-in [:http.request.configuration/querystring] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-max-list-items (input :max-items)) #:http.request.field{:name "MaxItems", :shape "MaxListItems", :location "querystring", :location-name "MaxItems"}))))

(clojure.core/defn- req-get-function-configuration-request [input] (clojure.core/cond-> #:http.request.configuration{:uri [(clojure.core/into (ser-function-name (input :function-name)) #:http.request.field{:name "FunctionName", :shape "FunctionName", :location "uri", :location-name "FunctionName"})]}))

(clojure.core/defn- req-get-event-source-request [input] (clojure.core/cond-> #:http.request.configuration{:uri [(clojure.core/into (ser-string (input :uuid)) #:http.request.field{:name "UUID", :shape "String", :location "uri", :location-name "UUID"})]}))

(clojure.core/declare deser-function-arn)

(clojure.core/declare deser-function-name)

(clojure.core/declare deser-timeout)

(clojure.core/declare deser-map)

(clojure.core/declare deser-handler)

(clojure.core/declare deser-function-list)

(clojure.core/declare deser-runtime)

(clojure.core/declare deser-role-arn)

(clojure.core/declare deser-mode)

(clojure.core/declare deser-memory-size)

(clojure.core/declare deser-description)

(clojure.core/declare deser-integer)

(clojure.core/declare deser-string)

(clojure.core/declare deser-http-status)

(clojure.core/declare deser-function-configuration)

(clojure.core/declare deser-long)

(clojure.core/declare deser-timestamp)

(clojure.core/declare deser-event-source-list)

(clojure.core/declare deser-event-source-configuration)

(clojure.core/declare deser-function-code-location)

(clojure.core/declare deser-boolean)

(clojure.core/defn- deser-function-arn [input] input)

(clojure.core/defn- deser-function-name [input] input)

(clojure.core/defn- deser-timeout [input] input)

(clojure.core/defn- deser-map [input] (clojure.core/into {} (clojure.core/map (clojure.core/fn [[k v]] [(deser-string k) (deser-string v)])) input))

(clojure.core/defn- deser-handler [input] input)

(clojure.core/defn- deser-function-list [input] (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (deser-function-configuration coll))) input))

(clojure.core/defn- deser-runtime [input] (clojure.core/get {"nodejs" :nodejs} input))

(clojure.core/defn- deser-role-arn [input] input)

(clojure.core/defn- deser-mode [input] (clojure.core/get {"event" :event} input))

(clojure.core/defn- deser-memory-size [input] input)

(clojure.core/defn- deser-description [input] input)

(clojure.core/defn- deser-integer [input] input)

(clojure.core/defn- deser-string [input] input)

(clojure.core/defn- deser-http-status [input] input)

(clojure.core/defn- deser-function-configuration [input] (clojure.core/cond-> {} (clojure.core/contains? input "FunctionName") (clojure.core/assoc :function-name (deser-function-name (input "FunctionName"))) (clojure.core/contains? input "Timeout") (clojure.core/assoc :timeout (deser-timeout (input "Timeout"))) (clojure.core/contains? input "Handler") (clojure.core/assoc :handler (deser-handler (input "Handler"))) (clojure.core/contains? input "Runtime") (clojure.core/assoc :runtime (deser-runtime (input "Runtime"))) (clojure.core/contains? input "ConfigurationId") (clojure.core/assoc :configuration-id (deser-string (input "ConfigurationId"))) (clojure.core/contains? input "Mode") (clojure.core/assoc :mode (deser-mode (input "Mode"))) (clojure.core/contains? input "MemorySize") (clojure.core/assoc :memory-size (deser-memory-size (input "MemorySize"))) (clojure.core/contains? input "Role") (clojure.core/assoc :role (deser-role-arn (input "Role"))) (clojure.core/contains? input "Description") (clojure.core/assoc :description (deser-description (input "Description"))) (clojure.core/contains? input "LastModified") (clojure.core/assoc :last-modified (deser-timestamp (input "LastModified"))) (clojure.core/contains? input "CodeSize") (clojure.core/assoc :code-size (deser-long (input "CodeSize"))) (clojure.core/contains? input "FunctionARN") (clojure.core/assoc :function-arn (deser-function-arn (input "FunctionARN")))))

(clojure.core/defn- deser-long [input] input)

(clojure.core/defn- deser-timestamp [input] input)

(clojure.core/defn- deser-event-source-list [input] (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (deser-event-source-configuration coll))) input))

(clojure.core/defn- deser-event-source-configuration [input] (clojure.core/cond-> {} (clojure.core/contains? input "IsActive") (clojure.core/assoc :is-active (deser-boolean (input "IsActive"))) (clojure.core/contains? input "BatchSize") (clojure.core/assoc :batch-size (deser-integer (input "BatchSize"))) (clojure.core/contains? input "FunctionName") (clojure.core/assoc :function-name (deser-function-name (input "FunctionName"))) (clojure.core/contains? input "Parameters") (clojure.core/assoc :parameters (deser-map (input "Parameters"))) (clojure.core/contains? input "Status") (clojure.core/assoc :status (deser-string (input "Status"))) (clojure.core/contains? input "Role") (clojure.core/assoc :role (deser-role-arn (input "Role"))) (clojure.core/contains? input "LastModified") (clojure.core/assoc :last-modified (deser-timestamp (input "LastModified"))) (clojure.core/contains? input "EventSource") (clojure.core/assoc :event-source (deser-string (input "EventSource"))) (clojure.core/contains? input "UUID") (clojure.core/assoc :uuid (deser-string (input "UUID")))))

(clojure.core/defn- deser-function-code-location [input] (clojure.core/cond-> {} (clojure.core/contains? input "RepositoryType") (clojure.core/assoc :repository-type (deser-string (input "RepositoryType"))) (clojure.core/contains? input "Location") (clojure.core/assoc :location (deser-string (input "Location")))))

(clojure.core/defn- deser-boolean [input] input)

(clojure.core/defn- response-service-exception ([input] (response-service-exception nil input)) ([resultWrapper1263438 input] (clojure.core/let [rawinput1263437 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar1263439 {"Type" (rawinput1263437 "Type"), "Message" (rawinput1263437 "Message")}] (clojure.core/cond-> {} (letvar1263439 "Type") (clojure.core/assoc :type (deser-string (clojure.core/get-in letvar1263439 ["Type"]))) (letvar1263439 "Message") (clojure.core/assoc :message (deser-string (clojure.core/get-in letvar1263439 ["Message"])))))))

(clojure.core/defn- response-list-functions-response ([input] (response-list-functions-response nil input)) ([resultWrapper1263441 input] (clojure.core/let [rawinput1263440 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar1263442 {"NextMarker" (rawinput1263440 "NextMarker"), "Functions" (rawinput1263440 "Functions")}] (clojure.core/cond-> {} (letvar1263442 "NextMarker") (clojure.core/assoc :next-marker (deser-string (clojure.core/get-in letvar1263442 ["NextMarker"]))) (letvar1263442 "Functions") (clojure.core/assoc :functions (deser-function-list (clojure.core/get-in letvar1263442 ["Functions"])))))))

(clojure.core/defn- response-get-function-response ([input] (response-get-function-response nil input)) ([resultWrapper1263444 input] (clojure.core/let [rawinput1263443 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar1263445 {"Configuration" (rawinput1263443 "Configuration"), "Code" (rawinput1263443 "Code")}] (clojure.core/cond-> {} (letvar1263445 "Configuration") (clojure.core/assoc :configuration (deser-function-configuration (clojure.core/get-in letvar1263445 ["Configuration"]))) (letvar1263445 "Code") (clojure.core/assoc :code (deser-function-code-location (clojure.core/get-in letvar1263445 ["Code"])))))))

(clojure.core/defn- response-invalid-request-content-exception ([input] (response-invalid-request-content-exception nil input)) ([resultWrapper1263447 input] (clojure.core/let [rawinput1263446 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar1263448 {"Type" (rawinput1263446 "Type"), "message" (rawinput1263446 "message")}] (clojure.core/cond-> {} (letvar1263448 "Type") (clojure.core/assoc :type (deser-string (clojure.core/get-in letvar1263448 ["Type"]))) (letvar1263448 "message") (clojure.core/assoc :message (deser-string (clojure.core/get-in letvar1263448 ["message"])))))))

(clojure.core/defn- response-resource-not-found-exception ([input] (response-resource-not-found-exception nil input)) ([resultWrapper1263450 input] (clojure.core/let [rawinput1263449 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar1263451 {"Type" (rawinput1263449 "Type"), "Message" (rawinput1263449 "Message")}] (clojure.core/cond-> {} (letvar1263451 "Type") (clojure.core/assoc :type (deser-string (clojure.core/get-in letvar1263451 ["Type"]))) (letvar1263451 "Message") (clojure.core/assoc :message (deser-string (clojure.core/get-in letvar1263451 ["Message"])))))))

(clojure.core/defn- response-invoke-async-response ([input] (response-invoke-async-response nil input)) ([resultWrapper1263453 input] (clojure.core/let [rawinput1263452 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar1263454 {"Status" (clojure.core/get-in input [:status "Status"])}] (clojure.core/cond-> {} (letvar1263454 "Status") (clojure.core/assoc :status (deser-http-status (clojure.core/get-in letvar1263454 ["Status"])))))))

(clojure.core/defn- response-function-configuration ([input] (response-function-configuration nil input)) ([resultWrapper1263456 input] (clojure.core/let [rawinput1263455 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar1263457 {"FunctionName" (rawinput1263455 "FunctionName"), "Timeout" (rawinput1263455 "Timeout"), "Handler" (rawinput1263455 "Handler"), "Runtime" (rawinput1263455 "Runtime"), "ConfigurationId" (rawinput1263455 "ConfigurationId"), "Mode" (rawinput1263455 "Mode"), "MemorySize" (rawinput1263455 "MemorySize"), "Role" (rawinput1263455 "Role"), "Description" (rawinput1263455 "Description"), "LastModified" (rawinput1263455 "LastModified"), "CodeSize" (rawinput1263455 "CodeSize"), "FunctionARN" (rawinput1263455 "FunctionARN")}] (clojure.core/cond-> {} (letvar1263457 "FunctionName") (clojure.core/assoc :function-name (deser-function-name (clojure.core/get-in letvar1263457 ["FunctionName"]))) (letvar1263457 "Timeout") (clojure.core/assoc :timeout (deser-timeout (clojure.core/get-in letvar1263457 ["Timeout"]))) (letvar1263457 "Handler") (clojure.core/assoc :handler (deser-handler (clojure.core/get-in letvar1263457 ["Handler"]))) (letvar1263457 "Runtime") (clojure.core/assoc :runtime (deser-runtime (clojure.core/get-in letvar1263457 ["Runtime"]))) (letvar1263457 "ConfigurationId") (clojure.core/assoc :configuration-id (deser-string (clojure.core/get-in letvar1263457 ["ConfigurationId"]))) (letvar1263457 "Mode") (clojure.core/assoc :mode (deser-mode (clojure.core/get-in letvar1263457 ["Mode"]))) (letvar1263457 "MemorySize") (clojure.core/assoc :memory-size (deser-memory-size (clojure.core/get-in letvar1263457 ["MemorySize"]))) (letvar1263457 "Role") (clojure.core/assoc :role (deser-role-arn (clojure.core/get-in letvar1263457 ["Role"]))) (letvar1263457 "Description") (clojure.core/assoc :description (deser-description (clojure.core/get-in letvar1263457 ["Description"]))) (letvar1263457 "LastModified") (clojure.core/assoc :last-modified (deser-timestamp (clojure.core/get-in letvar1263457 ["LastModified"]))) (letvar1263457 "CodeSize") (clojure.core/assoc :code-size (deser-long (clojure.core/get-in letvar1263457 ["CodeSize"]))) (letvar1263457 "FunctionARN") (clojure.core/assoc :function-arn (deser-function-arn (clojure.core/get-in letvar1263457 ["FunctionARN"])))))))

(clojure.core/defn- response-list-event-sources-response ([input] (response-list-event-sources-response nil input)) ([resultWrapper1263459 input] (clojure.core/let [rawinput1263458 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar1263460 {"NextMarker" (rawinput1263458 "NextMarker"), "EventSources" (rawinput1263458 "EventSources")}] (clojure.core/cond-> {} (letvar1263460 "NextMarker") (clojure.core/assoc :next-marker (deser-string (clojure.core/get-in letvar1263460 ["NextMarker"]))) (letvar1263460 "EventSources") (clojure.core/assoc :event-sources (deser-event-source-list (clojure.core/get-in letvar1263460 ["EventSources"])))))))

(clojure.core/defn- response-event-source-configuration ([input] (response-event-source-configuration nil input)) ([resultWrapper1263462 input] (clojure.core/let [rawinput1263461 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar1263463 {"IsActive" (rawinput1263461 "IsActive"), "BatchSize" (rawinput1263461 "BatchSize"), "FunctionName" (rawinput1263461 "FunctionName"), "Parameters" (rawinput1263461 "Parameters"), "Status" (rawinput1263461 "Status"), "Role" (rawinput1263461 "Role"), "LastModified" (rawinput1263461 "LastModified"), "EventSource" (rawinput1263461 "EventSource"), "UUID" (rawinput1263461 "UUID")}] (clojure.core/cond-> {} (letvar1263463 "IsActive") (clojure.core/assoc :is-active (deser-boolean (clojure.core/get-in letvar1263463 ["IsActive"]))) (letvar1263463 "BatchSize") (clojure.core/assoc :batch-size (deser-integer (clojure.core/get-in letvar1263463 ["BatchSize"]))) (letvar1263463 "FunctionName") (clojure.core/assoc :function-name (deser-function-name (clojure.core/get-in letvar1263463 ["FunctionName"]))) (letvar1263463 "Parameters") (clojure.core/assoc :parameters (deser-map (clojure.core/get-in letvar1263463 ["Parameters"]))) (letvar1263463 "Status") (clojure.core/assoc :status (deser-string (clojure.core/get-in letvar1263463 ["Status"]))) (letvar1263463 "Role") (clojure.core/assoc :role (deser-role-arn (clojure.core/get-in letvar1263463 ["Role"]))) (letvar1263463 "LastModified") (clojure.core/assoc :last-modified (deser-timestamp (clojure.core/get-in letvar1263463 ["LastModified"]))) (letvar1263463 "EventSource") (clojure.core/assoc :event-source (deser-string (clojure.core/get-in letvar1263463 ["EventSource"]))) (letvar1263463 "UUID") (clojure.core/assoc :uuid (deser-string (clojure.core/get-in letvar1263463 ["UUID"])))))))

(clojure.core/defn- response-invalid-parameter-value-exception ([input] (response-invalid-parameter-value-exception nil input)) ([resultWrapper1263465 input] (clojure.core/let [rawinput1263464 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar1263466 {"Type" (rawinput1263464 "Type"), "message" (rawinput1263464 "message")}] (clojure.core/cond-> {} (letvar1263466 "Type") (clojure.core/assoc :type (deser-string (clojure.core/get-in letvar1263466 ["Type"]))) (letvar1263466 "message") (clojure.core/assoc :message (deser-string (clojure.core/get-in letvar1263466 ["message"])))))))

(clojure.spec.alpha/def :portkey.aws.lambda.-2014-11-11.add-event-source-request/event-source (clojure.spec.alpha/and :portkey.aws.lambda.-2014-11-11/string))
(clojure.spec.alpha/def :portkey.aws.lambda.-2014-11-11.add-event-source-request/role (clojure.spec.alpha/and :portkey.aws.lambda.-2014-11-11/role-arn))
(clojure.spec.alpha/def :portkey.aws.lambda.-2014-11-11.add-event-source-request/batch-size (clojure.spec.alpha/and :portkey.aws.lambda.-2014-11-11/integer))
(clojure.spec.alpha/def :portkey.aws.lambda.-2014-11-11.add-event-source-request/parameters (clojure.spec.alpha/and :portkey.aws.lambda.-2014-11-11/map))
(clojure.spec.alpha/def :portkey.aws.lambda.-2014-11-11/add-event-source-request (clojure.spec.alpha/keys :req-un [:portkey.aws.lambda.-2014-11-11.add-event-source-request/event-source :portkey.aws.lambda.-2014-11-11/function-name :portkey.aws.lambda.-2014-11-11.add-event-source-request/role] :opt-un [:portkey.aws.lambda.-2014-11-11.add-event-source-request/batch-size :portkey.aws.lambda.-2014-11-11.add-event-source-request/parameters]))

(clojure.spec.alpha/def :portkey.aws.lambda.-2014-11-11/function-arn (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__1012854__auto__] (clojure.core/re-matches #"arn:aws:lambda:[a-z]{2}-[a-z]+-\d{1}:\d{12}:function:[a-zA-Z0-9-_]+(\/[0-9a-f]{8}-[0-9a-f]{4}-[0-9a-f]{4}-[0-9a-f]{4}-[0-9a-f]{12})?" s__1012854__auto__))))

(clojure.spec.alpha/def :portkey.aws.lambda.-2014-11-11/function-name (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__1012852__auto__] (clojure.core/<= 1 (clojure.core/count s__1012852__auto__))) (clojure.core/fn [s__1012853__auto__] (clojure.core/< (clojure.core/count s__1012853__auto__) 64)) (clojure.core/fn [s__1012854__auto__] (clojure.core/re-matches #"[a-zA-Z0-9-_]+" s__1012854__auto__))))

(clojure.spec.alpha/def :portkey.aws.lambda.-2014-11-11/timeout (clojure.spec.alpha/int-in 1 60))

(clojure.spec.alpha/def :portkey.aws.lambda.-2014-11-11.upload-function-request/function-zip (clojure.spec.alpha/and :portkey.aws.lambda.-2014-11-11/blob))
(clojure.spec.alpha/def :portkey.aws.lambda.-2014-11-11.upload-function-request/role (clojure.spec.alpha/and :portkey.aws.lambda.-2014-11-11/role-arn))
(clojure.spec.alpha/def :portkey.aws.lambda.-2014-11-11/upload-function-request (clojure.spec.alpha/keys :req-un [:portkey.aws.lambda.-2014-11-11/function-name :portkey.aws.lambda.-2014-11-11.upload-function-request/function-zip :portkey.aws.lambda.-2014-11-11/runtime :portkey.aws.lambda.-2014-11-11.upload-function-request/role :portkey.aws.lambda.-2014-11-11/handler :portkey.aws.lambda.-2014-11-11/mode] :opt-un [:portkey.aws.lambda.-2014-11-11/timeout :portkey.aws.lambda.-2014-11-11/memory-size :portkey.aws.lambda.-2014-11-11/description]))

(clojure.spec.alpha/def :portkey.aws.lambda.-2014-11-11/map (clojure.spec.alpha/map-of :portkey.aws.lambda.-2014-11-11/string :portkey.aws.lambda.-2014-11-11/string))

(clojure.spec.alpha/def :portkey.aws.lambda.-2014-11-11.remove-event-source-request/uuid (clojure.spec.alpha/and :portkey.aws.lambda.-2014-11-11/string))
(clojure.spec.alpha/def :portkey.aws.lambda.-2014-11-11/remove-event-source-request (clojure.spec.alpha/keys :req-un [:portkey.aws.lambda.-2014-11-11.remove-event-source-request/uuid] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.lambda.-2014-11-11/handler (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__1012854__auto__] (clojure.core/re-matches #"[a-zA-Z0-9./\-_]+" s__1012854__auto__))))

(clojure.spec.alpha/def :portkey.aws.lambda.-2014-11-11/function-list (clojure.spec.alpha/coll-of :portkey.aws.lambda.-2014-11-11/function-configuration))

(clojure.spec.alpha/def :portkey.aws.lambda.-2014-11-11/runtime #{:nodejs "nodejs"})

(clojure.spec.alpha/def :portkey.aws.lambda.-2014-11-11/role-arn (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__1012854__auto__] (clojure.core/re-matches #"arn:aws:iam::\d{12}:role/?[a-zA-Z_0-9+=,.@\-_/]+" s__1012854__auto__))))

(clojure.spec.alpha/def :portkey.aws.lambda.-2014-11-11.service-exception/type (clojure.spec.alpha/and :portkey.aws.lambda.-2014-11-11/string))
(clojure.spec.alpha/def :portkey.aws.lambda.-2014-11-11.service-exception/message (clojure.spec.alpha/and :portkey.aws.lambda.-2014-11-11/string))
(clojure.spec.alpha/def :portkey.aws.lambda.-2014-11-11/service-exception (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.lambda.-2014-11-11.service-exception/type :portkey.aws.lambda.-2014-11-11.service-exception/message]))

(clojure.spec.alpha/def :portkey.aws.lambda.-2014-11-11.list-functions-response/next-marker (clojure.spec.alpha/and :portkey.aws.lambda.-2014-11-11/string))
(clojure.spec.alpha/def :portkey.aws.lambda.-2014-11-11.list-functions-response/functions (clojure.spec.alpha/and :portkey.aws.lambda.-2014-11-11/function-list))
(clojure.spec.alpha/def :portkey.aws.lambda.-2014-11-11/list-functions-response (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.lambda.-2014-11-11.list-functions-response/next-marker :portkey.aws.lambda.-2014-11-11.list-functions-response/functions]))

(clojure.spec.alpha/def :portkey.aws.lambda.-2014-11-11/delete-function-request (clojure.spec.alpha/keys :req-un [:portkey.aws.lambda.-2014-11-11/function-name] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.lambda.-2014-11-11/mode #{"event" :event})

(clojure.spec.alpha/def :portkey.aws.lambda.-2014-11-11.get-function-response/configuration (clojure.spec.alpha/and :portkey.aws.lambda.-2014-11-11/function-configuration))
(clojure.spec.alpha/def :portkey.aws.lambda.-2014-11-11.get-function-response/code (clojure.spec.alpha/and :portkey.aws.lambda.-2014-11-11/function-code-location))
(clojure.spec.alpha/def :portkey.aws.lambda.-2014-11-11/get-function-response (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.lambda.-2014-11-11.get-function-response/configuration :portkey.aws.lambda.-2014-11-11.get-function-response/code]))

(clojure.spec.alpha/def :portkey.aws.lambda.-2014-11-11/memory-size (clojure.spec.alpha/int-in 128 1024))

(clojure.spec.alpha/def :portkey.aws.lambda.-2014-11-11.invalid-request-content-exception/type (clojure.spec.alpha/and :portkey.aws.lambda.-2014-11-11/string))
(clojure.spec.alpha/def :portkey.aws.lambda.-2014-11-11.invalid-request-content-exception/message (clojure.spec.alpha/and :portkey.aws.lambda.-2014-11-11/string))
(clojure.spec.alpha/def :portkey.aws.lambda.-2014-11-11/invalid-request-content-exception (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.lambda.-2014-11-11.invalid-request-content-exception/type :portkey.aws.lambda.-2014-11-11.invalid-request-content-exception/message]))

(clojure.spec.alpha/def :portkey.aws.lambda.-2014-11-11.resource-not-found-exception/type (clojure.spec.alpha/and :portkey.aws.lambda.-2014-11-11/string))
(clojure.spec.alpha/def :portkey.aws.lambda.-2014-11-11.resource-not-found-exception/message (clojure.spec.alpha/and :portkey.aws.lambda.-2014-11-11/string))
(clojure.spec.alpha/def :portkey.aws.lambda.-2014-11-11/resource-not-found-exception (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.lambda.-2014-11-11.resource-not-found-exception/type :portkey.aws.lambda.-2014-11-11.resource-not-found-exception/message]))

(clojure.spec.alpha/def :portkey.aws.lambda.-2014-11-11.invoke-async-request/invoke-args (clojure.spec.alpha/and :portkey.aws.lambda.-2014-11-11/blob))
(clojure.spec.alpha/def :portkey.aws.lambda.-2014-11-11/invoke-async-request (clojure.spec.alpha/keys :req-un [:portkey.aws.lambda.-2014-11-11/function-name :portkey.aws.lambda.-2014-11-11.invoke-async-request/invoke-args] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.lambda.-2014-11-11/description (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__1012852__auto__] (clojure.core/<= 0 (clojure.core/count s__1012852__auto__))) (clojure.core/fn [s__1012853__auto__] (clojure.core/< (clojure.core/count s__1012853__auto__) 256))))

(clojure.spec.alpha/def :portkey.aws.lambda.-2014-11-11/max-list-items (clojure.spec.alpha/int-in 1 10000))

(clojure.spec.alpha/def :portkey.aws.lambda.-2014-11-11/integer clojure.core/int?)

(clojure.spec.alpha/def :portkey.aws.lambda.-2014-11-11/string (clojure.spec.alpha/and clojure.core/string?))

(clojure.spec.alpha/def :portkey.aws.lambda.-2014-11-11/get-function-request (clojure.spec.alpha/keys :req-un [:portkey.aws.lambda.-2014-11-11/function-name] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.lambda.-2014-11-11.invoke-async-response/status (clojure.spec.alpha/and :portkey.aws.lambda.-2014-11-11/http-status))
(clojure.spec.alpha/def :portkey.aws.lambda.-2014-11-11/invoke-async-response (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.lambda.-2014-11-11.invoke-async-response/status]))

(clojure.spec.alpha/def :portkey.aws.lambda.-2014-11-11.update-function-configuration-request/role (clojure.spec.alpha/and :portkey.aws.lambda.-2014-11-11/role-arn))
(clojure.spec.alpha/def :portkey.aws.lambda.-2014-11-11/update-function-configuration-request (clojure.spec.alpha/keys :req-un [:portkey.aws.lambda.-2014-11-11/function-name] :opt-un [:portkey.aws.lambda.-2014-11-11.update-function-configuration-request/role :portkey.aws.lambda.-2014-11-11/handler :portkey.aws.lambda.-2014-11-11/description :portkey.aws.lambda.-2014-11-11/timeout :portkey.aws.lambda.-2014-11-11/memory-size]))

(clojure.spec.alpha/def :portkey.aws.lambda.-2014-11-11.list-event-sources-request/event-source-arn (clojure.spec.alpha/and :portkey.aws.lambda.-2014-11-11/string))
(clojure.spec.alpha/def :portkey.aws.lambda.-2014-11-11.list-event-sources-request/marker (clojure.spec.alpha/and :portkey.aws.lambda.-2014-11-11/string))
(clojure.spec.alpha/def :portkey.aws.lambda.-2014-11-11.list-event-sources-request/max-items (clojure.spec.alpha/and :portkey.aws.lambda.-2014-11-11/max-list-items))
(clojure.spec.alpha/def :portkey.aws.lambda.-2014-11-11/list-event-sources-request (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.lambda.-2014-11-11.list-event-sources-request/event-source-arn :portkey.aws.lambda.-2014-11-11/function-name :portkey.aws.lambda.-2014-11-11.list-event-sources-request/marker :portkey.aws.lambda.-2014-11-11.list-event-sources-request/max-items]))

(clojure.spec.alpha/def :portkey.aws.lambda.-2014-11-11/http-status clojure.core/int?)

(clojure.spec.alpha/def :portkey.aws.lambda.-2014-11-11.function-configuration/configuration-id (clojure.spec.alpha/and :portkey.aws.lambda.-2014-11-11/string))
(clojure.spec.alpha/def :portkey.aws.lambda.-2014-11-11.function-configuration/role (clojure.spec.alpha/and :portkey.aws.lambda.-2014-11-11/role-arn))
(clojure.spec.alpha/def :portkey.aws.lambda.-2014-11-11.function-configuration/last-modified (clojure.spec.alpha/and :portkey.aws.lambda.-2014-11-11/timestamp))
(clojure.spec.alpha/def :portkey.aws.lambda.-2014-11-11.function-configuration/code-size (clojure.spec.alpha/and :portkey.aws.lambda.-2014-11-11/long))
(clojure.spec.alpha/def :portkey.aws.lambda.-2014-11-11.function-configuration/function-arn (clojure.spec.alpha/and :portkey.aws.lambda.-2014-11-11/function-arn))
(clojure.spec.alpha/def :portkey.aws.lambda.-2014-11-11/function-configuration (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.lambda.-2014-11-11/function-name :portkey.aws.lambda.-2014-11-11/timeout :portkey.aws.lambda.-2014-11-11/handler :portkey.aws.lambda.-2014-11-11/runtime :portkey.aws.lambda.-2014-11-11.function-configuration/configuration-id :portkey.aws.lambda.-2014-11-11/mode :portkey.aws.lambda.-2014-11-11/memory-size :portkey.aws.lambda.-2014-11-11.function-configuration/role :portkey.aws.lambda.-2014-11-11/description :portkey.aws.lambda.-2014-11-11.function-configuration/last-modified :portkey.aws.lambda.-2014-11-11.function-configuration/code-size :portkey.aws.lambda.-2014-11-11.function-configuration/function-arn]))

(clojure.spec.alpha/def :portkey.aws.lambda.-2014-11-11/long clojure.core/int?)

(clojure.spec.alpha/def :portkey.aws.lambda.-2014-11-11/timestamp (clojure.spec.alpha/and clojure.core/string?))

(clojure.spec.alpha/def :portkey.aws.lambda.-2014-11-11.list-functions-request/marker (clojure.spec.alpha/and :portkey.aws.lambda.-2014-11-11/string))
(clojure.spec.alpha/def :portkey.aws.lambda.-2014-11-11.list-functions-request/max-items (clojure.spec.alpha/and :portkey.aws.lambda.-2014-11-11/max-list-items))
(clojure.spec.alpha/def :portkey.aws.lambda.-2014-11-11/list-functions-request (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.lambda.-2014-11-11.list-functions-request/marker :portkey.aws.lambda.-2014-11-11.list-functions-request/max-items]))

(clojure.spec.alpha/def :portkey.aws.lambda.-2014-11-11.list-event-sources-response/next-marker (clojure.spec.alpha/and :portkey.aws.lambda.-2014-11-11/string))
(clojure.spec.alpha/def :portkey.aws.lambda.-2014-11-11.list-event-sources-response/event-sources (clojure.spec.alpha/and :portkey.aws.lambda.-2014-11-11/event-source-list))
(clojure.spec.alpha/def :portkey.aws.lambda.-2014-11-11/list-event-sources-response (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.lambda.-2014-11-11.list-event-sources-response/next-marker :portkey.aws.lambda.-2014-11-11.list-event-sources-response/event-sources]))

(clojure.spec.alpha/def :portkey.aws.lambda.-2014-11-11/get-function-configuration-request (clojure.spec.alpha/keys :req-un [:portkey.aws.lambda.-2014-11-11/function-name] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.lambda.-2014-11-11.get-event-source-request/uuid (clojure.spec.alpha/and :portkey.aws.lambda.-2014-11-11/string))
(clojure.spec.alpha/def :portkey.aws.lambda.-2014-11-11/get-event-source-request (clojure.spec.alpha/keys :req-un [:portkey.aws.lambda.-2014-11-11.get-event-source-request/uuid] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.lambda.-2014-11-11/blob clojure.core/bytes?)

(clojure.spec.alpha/def :portkey.aws.lambda.-2014-11-11/event-source-list (clojure.spec.alpha/coll-of :portkey.aws.lambda.-2014-11-11/event-source-configuration))

(clojure.spec.alpha/def :portkey.aws.lambda.-2014-11-11.event-source-configuration/is-active (clojure.spec.alpha/and :portkey.aws.lambda.-2014-11-11/boolean))
(clojure.spec.alpha/def :portkey.aws.lambda.-2014-11-11.event-source-configuration/batch-size (clojure.spec.alpha/and :portkey.aws.lambda.-2014-11-11/integer))
(clojure.spec.alpha/def :portkey.aws.lambda.-2014-11-11.event-source-configuration/parameters (clojure.spec.alpha/and :portkey.aws.lambda.-2014-11-11/map))
(clojure.spec.alpha/def :portkey.aws.lambda.-2014-11-11.event-source-configuration/status (clojure.spec.alpha/and :portkey.aws.lambda.-2014-11-11/string))
(clojure.spec.alpha/def :portkey.aws.lambda.-2014-11-11.event-source-configuration/role (clojure.spec.alpha/and :portkey.aws.lambda.-2014-11-11/role-arn))
(clojure.spec.alpha/def :portkey.aws.lambda.-2014-11-11.event-source-configuration/last-modified (clojure.spec.alpha/and :portkey.aws.lambda.-2014-11-11/timestamp))
(clojure.spec.alpha/def :portkey.aws.lambda.-2014-11-11.event-source-configuration/event-source (clojure.spec.alpha/and :portkey.aws.lambda.-2014-11-11/string))
(clojure.spec.alpha/def :portkey.aws.lambda.-2014-11-11.event-source-configuration/uuid (clojure.spec.alpha/and :portkey.aws.lambda.-2014-11-11/string))
(clojure.spec.alpha/def :portkey.aws.lambda.-2014-11-11/event-source-configuration (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.lambda.-2014-11-11.event-source-configuration/is-active :portkey.aws.lambda.-2014-11-11.event-source-configuration/batch-size :portkey.aws.lambda.-2014-11-11/function-name :portkey.aws.lambda.-2014-11-11.event-source-configuration/parameters :portkey.aws.lambda.-2014-11-11.event-source-configuration/status :portkey.aws.lambda.-2014-11-11.event-source-configuration/role :portkey.aws.lambda.-2014-11-11.event-source-configuration/last-modified :portkey.aws.lambda.-2014-11-11.event-source-configuration/event-source :portkey.aws.lambda.-2014-11-11.event-source-configuration/uuid]))

(clojure.spec.alpha/def :portkey.aws.lambda.-2014-11-11.invalid-parameter-value-exception/type (clojure.spec.alpha/and :portkey.aws.lambda.-2014-11-11/string))
(clojure.spec.alpha/def :portkey.aws.lambda.-2014-11-11.invalid-parameter-value-exception/message (clojure.spec.alpha/and :portkey.aws.lambda.-2014-11-11/string))
(clojure.spec.alpha/def :portkey.aws.lambda.-2014-11-11/invalid-parameter-value-exception (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.lambda.-2014-11-11.invalid-parameter-value-exception/type :portkey.aws.lambda.-2014-11-11.invalid-parameter-value-exception/message]))

(clojure.spec.alpha/def :portkey.aws.lambda.-2014-11-11.function-code-location/repository-type (clojure.spec.alpha/and :portkey.aws.lambda.-2014-11-11/string))
(clojure.spec.alpha/def :portkey.aws.lambda.-2014-11-11.function-code-location/location (clojure.spec.alpha/and :portkey.aws.lambda.-2014-11-11/string))
(clojure.spec.alpha/def :portkey.aws.lambda.-2014-11-11/function-code-location (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.lambda.-2014-11-11.function-code-location/repository-type :portkey.aws.lambda.-2014-11-11.function-code-location/location]))

(clojure.spec.alpha/def :portkey.aws.lambda.-2014-11-11/boolean clojure.core/boolean?)

(clojure.core/defn delete-function ([delete-function-requestinput] (clojure.core/let [request-function-result__1013884__auto__ (req-delete-function-request delete-function-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__1013884__auto__ {:http.request.configuration/endpoints portkey.aws.lambda.-2014-11-11/endpoints, :http.request.configuration/target-prefix nil, :http.request.spec/output-spec nil, :http.request.configuration/mime-type {"content-type" "application/json"}, :http.request.configuration/request-uri "/2014-11-13/functions/{FunctionName}", :http.request.configuration/version "2014-11-11", :http.request.configuration/service-id nil, :http.request.spec/input-spec :portkey.aws.lambda.-2014-11-11/delete-function-request, :http.request.configuration/protocol "rest-json", :http.request.configuration/method :delete, :http.request.configuration/response-code 204, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "DeleteFunction", :http.request.configuration/output-deser-fn (clojure.core/fn [& args__1013883__auto__] {}), :http.request.spec/error-spec {"ServiceException" :portkey.aws.lambda.-2014-11-11/service-exception, "ResourceNotFoundException" :portkey.aws.lambda.-2014-11-11/resource-not-found-exception}})))))
(clojure.spec.alpha/fdef delete-function :args (clojure.spec.alpha/tuple :portkey.aws.lambda.-2014-11-11/delete-function-request) :ret clojure.core/true?)

(clojure.core/defn add-event-source ([add-event-source-requestinput] (clojure.core/let [request-function-result__1013884__auto__ (req-add-event-source-request add-event-source-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__1013884__auto__ {:http.request.configuration/endpoints portkey.aws.lambda.-2014-11-11/endpoints, :http.request.configuration/target-prefix nil, :http.request.spec/output-spec :portkey.aws.lambda.-2014-11-11/event-source-configuration, :http.request.configuration/mime-type {"content-type" "application/json"}, :http.request.configuration/request-uri "/2014-11-13/event-source-mappings/", :http.request.configuration/version "2014-11-11", :http.request.configuration/service-id nil, :http.request.spec/input-spec :portkey.aws.lambda.-2014-11-11/add-event-source-request, :http.request.configuration/protocol "rest-json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "AddEventSource", :http.request.configuration/output-deser-fn response-event-source-configuration, :http.request.spec/error-spec {"ServiceException" :portkey.aws.lambda.-2014-11-11/service-exception, "InvalidParameterValueException" :portkey.aws.lambda.-2014-11-11/invalid-parameter-value-exception}})))))
(clojure.spec.alpha/fdef add-event-source :args (clojure.spec.alpha/tuple :portkey.aws.lambda.-2014-11-11/add-event-source-request) :ret (clojure.spec.alpha/and :portkey.aws.lambda.-2014-11-11/event-source-configuration))

(clojure.core/defn invoke-async ([invoke-async-requestinput] (clojure.core/let [request-function-result__1013884__auto__ (req-invoke-async-request invoke-async-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__1013884__auto__ {:http.request.configuration/endpoints portkey.aws.lambda.-2014-11-11/endpoints, :http.request.configuration/target-prefix nil, :http.request.spec/output-spec :portkey.aws.lambda.-2014-11-11/invoke-async-response, :http.request.configuration/mime-type {"content-type" "application/json"}, :http.request.configuration/request-uri "/2014-11-13/functions/{FunctionName}/invoke-async/", :http.request.configuration/version "2014-11-11", :http.request.configuration/service-id nil, :http.request.spec/input-spec :portkey.aws.lambda.-2014-11-11/invoke-async-request, :http.request.configuration/protocol "rest-json", :http.request.configuration/method :post, :http.request.configuration/response-code 202, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "InvokeAsync", :http.request.configuration/output-deser-fn response-invoke-async-response, :http.request.spec/error-spec {"ServiceException" :portkey.aws.lambda.-2014-11-11/service-exception, "ResourceNotFoundException" :portkey.aws.lambda.-2014-11-11/resource-not-found-exception, "InvalidRequestContentException" :portkey.aws.lambda.-2014-11-11/invalid-request-content-exception}})))))
(clojure.spec.alpha/fdef invoke-async :args (clojure.spec.alpha/tuple :portkey.aws.lambda.-2014-11-11/invoke-async-request) :ret (clojure.spec.alpha/and :portkey.aws.lambda.-2014-11-11/invoke-async-response))

(clojure.core/defn remove-event-source ([remove-event-source-requestinput] (clojure.core/let [request-function-result__1013884__auto__ (req-remove-event-source-request remove-event-source-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__1013884__auto__ {:http.request.configuration/endpoints portkey.aws.lambda.-2014-11-11/endpoints, :http.request.configuration/target-prefix nil, :http.request.spec/output-spec nil, :http.request.configuration/mime-type {"content-type" "application/json"}, :http.request.configuration/request-uri "/2014-11-13/event-source-mappings/{UUID}", :http.request.configuration/version "2014-11-11", :http.request.configuration/service-id nil, :http.request.spec/input-spec :portkey.aws.lambda.-2014-11-11/remove-event-source-request, :http.request.configuration/protocol "rest-json", :http.request.configuration/method :delete, :http.request.configuration/response-code 204, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "RemoveEventSource", :http.request.configuration/output-deser-fn (clojure.core/fn [& args__1013883__auto__] {}), :http.request.spec/error-spec {"ServiceException" :portkey.aws.lambda.-2014-11-11/service-exception, "ResourceNotFoundException" :portkey.aws.lambda.-2014-11-11/resource-not-found-exception, "InvalidParameterValueException" :portkey.aws.lambda.-2014-11-11/invalid-parameter-value-exception}})))))
(clojure.spec.alpha/fdef remove-event-source :args (clojure.spec.alpha/tuple :portkey.aws.lambda.-2014-11-11/remove-event-source-request) :ret clojure.core/true?)

(clojure.core/defn get-function-configuration ([get-function-configuration-requestinput] (clojure.core/let [request-function-result__1013884__auto__ (req-get-function-configuration-request get-function-configuration-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__1013884__auto__ {:http.request.configuration/endpoints portkey.aws.lambda.-2014-11-11/endpoints, :http.request.configuration/target-prefix nil, :http.request.spec/output-spec :portkey.aws.lambda.-2014-11-11/function-configuration, :http.request.configuration/mime-type {"content-type" "application/json"}, :http.request.configuration/request-uri "/2014-11-13/functions/{FunctionName}/configuration", :http.request.configuration/version "2014-11-11", :http.request.configuration/service-id nil, :http.request.spec/input-spec :portkey.aws.lambda.-2014-11-11/get-function-configuration-request, :http.request.configuration/protocol "rest-json", :http.request.configuration/method :get, :http.request.configuration/response-code 200, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "GetFunctionConfiguration", :http.request.configuration/output-deser-fn response-function-configuration, :http.request.spec/error-spec {"ServiceException" :portkey.aws.lambda.-2014-11-11/service-exception, "ResourceNotFoundException" :portkey.aws.lambda.-2014-11-11/resource-not-found-exception}})))))
(clojure.spec.alpha/fdef get-function-configuration :args (clojure.spec.alpha/tuple :portkey.aws.lambda.-2014-11-11/get-function-configuration-request) :ret (clojure.spec.alpha/and :portkey.aws.lambda.-2014-11-11/function-configuration))

(clojure.core/defn upload-function ([upload-function-requestinput] (clojure.core/let [request-function-result__1013884__auto__ (req-upload-function-request upload-function-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__1013884__auto__ {:http.request.configuration/endpoints portkey.aws.lambda.-2014-11-11/endpoints, :http.request.configuration/target-prefix nil, :http.request.spec/output-spec :portkey.aws.lambda.-2014-11-11/function-configuration, :http.request.configuration/mime-type {"content-type" "application/json"}, :http.request.configuration/request-uri "/2014-11-13/functions/{FunctionName}", :http.request.configuration/version "2014-11-11", :http.request.configuration/service-id nil, :http.request.spec/input-spec :portkey.aws.lambda.-2014-11-11/upload-function-request, :http.request.configuration/protocol "rest-json", :http.request.configuration/method :put, :http.request.configuration/response-code 201, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "UploadFunction", :http.request.configuration/output-deser-fn response-function-configuration, :http.request.spec/error-spec {"ServiceException" :portkey.aws.lambda.-2014-11-11/service-exception, "InvalidParameterValueException" :portkey.aws.lambda.-2014-11-11/invalid-parameter-value-exception, "ResourceNotFoundException" :portkey.aws.lambda.-2014-11-11/resource-not-found-exception}})))))
(clojure.spec.alpha/fdef upload-function :args (clojure.spec.alpha/tuple :portkey.aws.lambda.-2014-11-11/upload-function-request) :ret (clojure.spec.alpha/and :portkey.aws.lambda.-2014-11-11/function-configuration))

(clojure.core/defn list-event-sources ([] (list-event-sources {})) ([list-event-sources-requestinput] (clojure.core/let [request-function-result__1013884__auto__ (req-list-event-sources-request list-event-sources-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__1013884__auto__ {:http.request.configuration/endpoints portkey.aws.lambda.-2014-11-11/endpoints, :http.request.configuration/target-prefix nil, :http.request.spec/output-spec :portkey.aws.lambda.-2014-11-11/list-event-sources-response, :http.request.configuration/mime-type {"content-type" "application/json"}, :http.request.configuration/request-uri "/2014-11-13/event-source-mappings/", :http.request.configuration/version "2014-11-11", :http.request.configuration/service-id nil, :http.request.spec/input-spec :portkey.aws.lambda.-2014-11-11/list-event-sources-request, :http.request.configuration/protocol "rest-json", :http.request.configuration/method :get, :http.request.configuration/response-code 200, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "ListEventSources", :http.request.configuration/output-deser-fn response-list-event-sources-response, :http.request.spec/error-spec {"ServiceException" :portkey.aws.lambda.-2014-11-11/service-exception, "ResourceNotFoundException" :portkey.aws.lambda.-2014-11-11/resource-not-found-exception, "InvalidParameterValueException" :portkey.aws.lambda.-2014-11-11/invalid-parameter-value-exception}})))))
(clojure.spec.alpha/fdef list-event-sources :args (clojure.spec.alpha/? :portkey.aws.lambda.-2014-11-11/list-event-sources-request) :ret (clojure.spec.alpha/and :portkey.aws.lambda.-2014-11-11/list-event-sources-response))

(clojure.core/defn get-function ([get-function-requestinput] (clojure.core/let [request-function-result__1013884__auto__ (req-get-function-request get-function-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__1013884__auto__ {:http.request.configuration/endpoints portkey.aws.lambda.-2014-11-11/endpoints, :http.request.configuration/target-prefix nil, :http.request.spec/output-spec :portkey.aws.lambda.-2014-11-11/get-function-response, :http.request.configuration/mime-type {"content-type" "application/json"}, :http.request.configuration/request-uri "/2014-11-13/functions/{FunctionName}", :http.request.configuration/version "2014-11-11", :http.request.configuration/service-id nil, :http.request.spec/input-spec :portkey.aws.lambda.-2014-11-11/get-function-request, :http.request.configuration/protocol "rest-json", :http.request.configuration/method :get, :http.request.configuration/response-code 200, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "GetFunction", :http.request.configuration/output-deser-fn response-get-function-response, :http.request.spec/error-spec {"ServiceException" :portkey.aws.lambda.-2014-11-11/service-exception, "ResourceNotFoundException" :portkey.aws.lambda.-2014-11-11/resource-not-found-exception}})))))
(clojure.spec.alpha/fdef get-function :args (clojure.spec.alpha/tuple :portkey.aws.lambda.-2014-11-11/get-function-request) :ret (clojure.spec.alpha/and :portkey.aws.lambda.-2014-11-11/get-function-response))

(clojure.core/defn list-functions ([] (list-functions {})) ([list-functions-requestinput] (clojure.core/let [request-function-result__1013884__auto__ (req-list-functions-request list-functions-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__1013884__auto__ {:http.request.configuration/endpoints portkey.aws.lambda.-2014-11-11/endpoints, :http.request.configuration/target-prefix nil, :http.request.spec/output-spec :portkey.aws.lambda.-2014-11-11/list-functions-response, :http.request.configuration/mime-type {"content-type" "application/json"}, :http.request.configuration/request-uri "/2014-11-13/functions/", :http.request.configuration/version "2014-11-11", :http.request.configuration/service-id nil, :http.request.spec/input-spec :portkey.aws.lambda.-2014-11-11/list-functions-request, :http.request.configuration/protocol "rest-json", :http.request.configuration/method :get, :http.request.configuration/response-code 200, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "ListFunctions", :http.request.configuration/output-deser-fn response-list-functions-response, :http.request.spec/error-spec {"ServiceException" :portkey.aws.lambda.-2014-11-11/service-exception}})))))
(clojure.spec.alpha/fdef list-functions :args (clojure.spec.alpha/? :portkey.aws.lambda.-2014-11-11/list-functions-request) :ret (clojure.spec.alpha/and :portkey.aws.lambda.-2014-11-11/list-functions-response))

(clojure.core/defn update-function-configuration ([update-function-configuration-requestinput] (clojure.core/let [request-function-result__1013884__auto__ (req-update-function-configuration-request update-function-configuration-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__1013884__auto__ {:http.request.configuration/endpoints portkey.aws.lambda.-2014-11-11/endpoints, :http.request.configuration/target-prefix nil, :http.request.spec/output-spec :portkey.aws.lambda.-2014-11-11/function-configuration, :http.request.configuration/mime-type {"content-type" "application/json"}, :http.request.configuration/request-uri "/2014-11-13/functions/{FunctionName}/configuration", :http.request.configuration/version "2014-11-11", :http.request.configuration/service-id nil, :http.request.spec/input-spec :portkey.aws.lambda.-2014-11-11/update-function-configuration-request, :http.request.configuration/protocol "rest-json", :http.request.configuration/method :put, :http.request.configuration/response-code 200, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "UpdateFunctionConfiguration", :http.request.configuration/output-deser-fn response-function-configuration, :http.request.spec/error-spec {"ServiceException" :portkey.aws.lambda.-2014-11-11/service-exception, "ResourceNotFoundException" :portkey.aws.lambda.-2014-11-11/resource-not-found-exception, "InvalidParameterValueException" :portkey.aws.lambda.-2014-11-11/invalid-parameter-value-exception}})))))
(clojure.spec.alpha/fdef update-function-configuration :args (clojure.spec.alpha/tuple :portkey.aws.lambda.-2014-11-11/update-function-configuration-request) :ret (clojure.spec.alpha/and :portkey.aws.lambda.-2014-11-11/function-configuration))

(clojure.core/defn get-event-source ([get-event-source-requestinput] (clojure.core/let [request-function-result__1013884__auto__ (req-get-event-source-request get-event-source-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__1013884__auto__ {:http.request.configuration/endpoints portkey.aws.lambda.-2014-11-11/endpoints, :http.request.configuration/target-prefix nil, :http.request.spec/output-spec :portkey.aws.lambda.-2014-11-11/event-source-configuration, :http.request.configuration/mime-type {"content-type" "application/json"}, :http.request.configuration/request-uri "/2014-11-13/event-source-mappings/{UUID}", :http.request.configuration/version "2014-11-11", :http.request.configuration/service-id nil, :http.request.spec/input-spec :portkey.aws.lambda.-2014-11-11/get-event-source-request, :http.request.configuration/protocol "rest-json", :http.request.configuration/method :get, :http.request.configuration/response-code 200, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "GetEventSource", :http.request.configuration/output-deser-fn response-event-source-configuration, :http.request.spec/error-spec {"ServiceException" :portkey.aws.lambda.-2014-11-11/service-exception, "ResourceNotFoundException" :portkey.aws.lambda.-2014-11-11/resource-not-found-exception, "InvalidParameterValueException" :portkey.aws.lambda.-2014-11-11/invalid-parameter-value-exception}})))))
(clojure.spec.alpha/fdef get-event-source :args (clojure.spec.alpha/tuple :portkey.aws.lambda.-2014-11-11/get-event-source-request) :ret (clojure.spec.alpha/and :portkey.aws.lambda.-2014-11-11/event-source-configuration))
