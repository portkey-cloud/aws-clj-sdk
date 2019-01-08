(ns portkey.aws.cognito-sync (:require [portkey.aws]))

(def
 endpoints
 '{"ap-northeast-1"
   {:credential-scope
    {:service "cognito-sync", :region "ap-northeast-1"},
    :ssl-common-name "cognito-sync.ap-northeast-1.amazonaws.com",
    :endpoint "https://cognito-sync.ap-northeast-1.amazonaws.com",
    :signature-version :v4},
   "eu-west-1"
   {:credential-scope {:service "cognito-sync", :region "eu-west-1"},
    :ssl-common-name "cognito-sync.eu-west-1.amazonaws.com",
    :endpoint "https://cognito-sync.eu-west-1.amazonaws.com",
    :signature-version :v4},
   "us-east-2"
   {:credential-scope {:service "cognito-sync", :region "us-east-2"},
    :ssl-common-name "cognito-sync.us-east-2.amazonaws.com",
    :endpoint "https://cognito-sync.us-east-2.amazonaws.com",
    :signature-version :v4},
   "ap-southeast-2"
   {:credential-scope
    {:service "cognito-sync", :region "ap-southeast-2"},
    :ssl-common-name "cognito-sync.ap-southeast-2.amazonaws.com",
    :endpoint "https://cognito-sync.ap-southeast-2.amazonaws.com",
    :signature-version :v4},
   "ap-southeast-1"
   {:credential-scope
    {:service "cognito-sync", :region "ap-southeast-1"},
    :ssl-common-name "cognito-sync.ap-southeast-1.amazonaws.com",
    :endpoint "https://cognito-sync.ap-southeast-1.amazonaws.com",
    :signature-version :v4},
   "ap-northeast-2"
   {:credential-scope
    {:service "cognito-sync", :region "ap-northeast-2"},
    :ssl-common-name "cognito-sync.ap-northeast-2.amazonaws.com",
    :endpoint "https://cognito-sync.ap-northeast-2.amazonaws.com",
    :signature-version :v4},
   "eu-central-1"
   {:credential-scope
    {:service "cognito-sync", :region "eu-central-1"},
    :ssl-common-name "cognito-sync.eu-central-1.amazonaws.com",
    :endpoint "https://cognito-sync.eu-central-1.amazonaws.com",
    :signature-version :v4},
   "eu-west-2"
   {:credential-scope {:service "cognito-sync", :region "eu-west-2"},
    :ssl-common-name "cognito-sync.eu-west-2.amazonaws.com",
    :endpoint "https://cognito-sync.eu-west-2.amazonaws.com",
    :signature-version :v4},
   "us-west-2"
   {:credential-scope {:service "cognito-sync", :region "us-west-2"},
    :ssl-common-name "cognito-sync.us-west-2.amazonaws.com",
    :endpoint "https://cognito-sync.us-west-2.amazonaws.com",
    :signature-version :v4},
   "us-east-1"
   {:credential-scope {:service "cognito-sync", :region "us-east-1"},
    :ssl-common-name "cognito-sync.us-east-1.amazonaws.com",
    :endpoint "https://cognito-sync.us-east-1.amazonaws.com",
    :signature-version :v4},
   "ap-south-1"
   {:credential-scope {:service "cognito-sync", :region "ap-south-1"},
    :ssl-common-name "cognito-sync.ap-south-1.amazonaws.com",
    :endpoint "https://cognito-sync.ap-south-1.amazonaws.com",
    :signature-version :v4}})

(clojure.core/declare ser-record-key)

(clojure.core/declare ser-stream-name)

(clojure.core/declare ser-assume-role-arn)

(clojure.core/declare ser-platform)

(clojure.core/declare ser-push-sync)

(clojure.core/declare ser-application-arn)

(clojure.core/declare ser-sync-session-token)

(clojure.core/declare ser-dataset-name)

(clojure.core/declare ser-record-patch)

(clojure.core/declare ser-cognito-streams)

(clojure.core/declare ser-cognito-event-type)

(clojure.core/declare ser-push-token)

(clojure.core/declare ser-application-arn-list)

(clojure.core/declare ser-operation)

(clojure.core/declare ser-identity-pool-id)

(clojure.core/declare ser-events)

(clojure.core/declare ser-date)

(clojure.core/declare ser-identity-id)

(clojure.core/declare ser-integer-string)

(clojure.core/declare ser-client-context)

(clojure.core/declare ser-streaming-status)

(clojure.core/declare ser-lambda-function-arn)

(clojure.core/declare ser-string)

(clojure.core/declare ser-record-patch-list)

(clojure.core/declare ser-device-id)

(clojure.core/declare ser-long)

(clojure.core/declare ser-record-value)

(clojure.core/defn- ser-record-key [input] #:http.request.field{:value input, :shape "RecordKey"})

(clojure.core/defn- ser-stream-name [input] #:http.request.field{:value input, :shape "StreamName"})

(clojure.core/defn- ser-assume-role-arn [input] #:http.request.field{:value input, :shape "AssumeRoleArn"})

(clojure.core/defn- ser-platform [input] #:http.request.field{:value (clojure.core/get {"APNS" "APNS", :apns "APNS", "APNS_SANDBOX" "APNS_SANDBOX", :apns-sandbox "APNS_SANDBOX", "GCM" "GCM", :gcm "GCM", "ADM" "ADM", :adm "ADM"} input), :shape "Platform"})

(clojure.core/defn- ser-push-sync [input] (clojure.core/cond-> #:http.request.field{:value [], :shape "PushSync", :type "structure"} (clojure.core/contains? input :application-arns) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-application-arn-list (input :application-arns)) #:http.request.field{:name "ApplicationArns", :shape "ApplicationArnList"})) (clojure.core/contains? input :role-arn) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-assume-role-arn (input :role-arn)) #:http.request.field{:name "RoleArn", :shape "AssumeRoleArn"}))))

(clojure.core/defn- ser-application-arn [input] #:http.request.field{:value input, :shape "ApplicationArn"})

(clojure.core/defn- ser-sync-session-token [input] #:http.request.field{:value input, :shape "SyncSessionToken"})

(clojure.core/defn- ser-dataset-name [input] #:http.request.field{:value input, :shape "DatasetName"})

(clojure.core/defn- ser-record-patch [input] (clojure.core/cond-> #:http.request.field{:value [(clojure.core/into (ser-operation (:op input)) #:http.request.field{:name "Op", :shape "Operation"}) (clojure.core/into (ser-record-key (:key input)) #:http.request.field{:name "Key", :shape "RecordKey"}) (clojure.core/into (ser-long (:sync-count input)) #:http.request.field{:name "SyncCount", :shape "Long"})], :shape "RecordPatch", :type "structure"} (clojure.core/contains? input :value) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-record-value (input :value)) #:http.request.field{:name "Value", :shape "RecordValue"})) (clojure.core/contains? input :device-last-modified-date) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-date (input :device-last-modified-date)) #:http.request.field{:name "DeviceLastModifiedDate", :shape "Date"}))))

(clojure.core/defn- ser-cognito-streams [input] (clojure.core/cond-> #:http.request.field{:value [], :shape "CognitoStreams", :type "structure"} (clojure.core/contains? input :stream-name) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-stream-name (input :stream-name)) #:http.request.field{:name "StreamName", :shape "StreamName"})) (clojure.core/contains? input :role-arn) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-assume-role-arn (input :role-arn)) #:http.request.field{:name "RoleArn", :shape "AssumeRoleArn"})) (clojure.core/contains? input :streaming-status) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-streaming-status (input :streaming-status)) #:http.request.field{:name "StreamingStatus", :shape "StreamingStatus"}))))

(clojure.core/defn- ser-cognito-event-type [input] #:http.request.field{:value input, :shape "CognitoEventType"})

(clojure.core/defn- ser-push-token [input] #:http.request.field{:value input, :shape "PushToken"})

(clojure.core/defn- ser-application-arn-list [input] #:http.request.field{:value (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (clojure.core/merge (ser-application-arn coll) #:http.request.field{:shape "ApplicationArn"}))) input), :shape "ApplicationArnList", :type "list"})

(clojure.core/defn- ser-operation [input] #:http.request.field{:value (clojure.core/get {"replace" "replace", :replace "replace", "remove" "remove", :remove "remove"} input), :shape "Operation"})

(clojure.core/defn- ser-identity-pool-id [input] #:http.request.field{:value input, :shape "IdentityPoolId"})

(clojure.core/defn- ser-events [input] #:http.request.field{:value (clojure.core/into [] (clojure.core/map (clojure.core/fn [[k v]] [(clojure.core/into (ser-cognito-event-type k) #:http.request.field{:map-info "key", :shape "CognitoEventType"}) (clojure.core/into (ser-lambda-function-arn v) #:http.request.field{:map-info "value", :shape "LambdaFunctionArn"})])) input), :shape "Events", :type "map", :max 1})

(clojure.core/defn- ser-date [input] #:http.request.field{:value input, :shape "Date"})

(clojure.core/defn- ser-identity-id [input] #:http.request.field{:value input, :shape "IdentityId"})

(clojure.core/defn- ser-integer-string [input] #:http.request.field{:value input, :shape "IntegerString"})

(clojure.core/defn- ser-client-context [input] #:http.request.field{:value input, :shape "ClientContext"})

(clojure.core/defn- ser-streaming-status [input] #:http.request.field{:value (clojure.core/get {"ENABLED" "ENABLED", :enabled "ENABLED", "DISABLED" "DISABLED", :disabled "DISABLED"} input), :shape "StreamingStatus"})

(clojure.core/defn- ser-lambda-function-arn [input] #:http.request.field{:value input, :shape "LambdaFunctionArn"})

(clojure.core/defn- ser-string [input] #:http.request.field{:value input, :shape "String"})

(clojure.core/defn- ser-record-patch-list [input] #:http.request.field{:value (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (clojure.core/merge (ser-record-patch coll) #:http.request.field{:shape "RecordPatch"}))) input), :shape "RecordPatchList", :type "list"})

(clojure.core/defn- ser-device-id [input] #:http.request.field{:value input, :shape "DeviceId"})

(clojure.core/defn- ser-long [input] #:http.request.field{:value input, :shape "Long"})

(clojure.core/defn- ser-record-value [input] #:http.request.field{:value input, :shape "RecordValue"})

(clojure.core/defn- req-register-device-request [input] (clojure.core/cond-> #:http.request.configuration{:uri [(clojure.core/into (ser-identity-pool-id (input :identity-pool-id)) #:http.request.field{:name "IdentityPoolId", :shape "IdentityPoolId", :location "uri", :location-name "IdentityPoolId"}) (clojure.core/into (ser-identity-id (input :identity-id)) #:http.request.field{:name "IdentityId", :shape "IdentityId", :location "uri", :location-name "IdentityId"})], :body [(clojure.core/into (ser-platform (input :platform)) #:http.request.field{:name "Platform", :shape "Platform"}) (clojure.core/into (ser-push-token (input :token)) #:http.request.field{:name "Token", :shape "PushToken"})]}))

(clojure.core/defn- req-subscribe-to-dataset-request [input] (clojure.core/cond-> #:http.request.configuration{:uri [(clojure.core/into (ser-identity-pool-id (input :identity-pool-id)) #:http.request.field{:name "IdentityPoolId", :shape "IdentityPoolId", :location "uri", :location-name "IdentityPoolId"}) (clojure.core/into (ser-identity-id (input :identity-id)) #:http.request.field{:name "IdentityId", :shape "IdentityId", :location "uri", :location-name "IdentityId"}) (clojure.core/into (ser-dataset-name (input :dataset-name)) #:http.request.field{:name "DatasetName", :shape "DatasetName", :location "uri", :location-name "DatasetName"}) (clojure.core/into (ser-device-id (input :device-id)) #:http.request.field{:name "DeviceId", :shape "DeviceId", :location "uri", :location-name "DeviceId"})]}))

(clojure.core/defn- req-describe-identity-usage-request [input] (clojure.core/cond-> #:http.request.configuration{:uri [(clojure.core/into (ser-identity-pool-id (input :identity-pool-id)) #:http.request.field{:name "IdentityPoolId", :shape "IdentityPoolId", :location "uri", :location-name "IdentityPoolId"}) (clojure.core/into (ser-identity-id (input :identity-id)) #:http.request.field{:name "IdentityId", :shape "IdentityId", :location "uri", :location-name "IdentityId"})]}))

(clojure.core/defn- req-set-cognito-events-request [input] (clojure.core/cond-> #:http.request.configuration{:uri [(clojure.core/into (ser-identity-pool-id (input :identity-pool-id)) #:http.request.field{:name "IdentityPoolId", :shape "IdentityPoolId", :location "uri", :location-name "IdentityPoolId"})], :body [(clojure.core/into (ser-events (input :events)) #:http.request.field{:name "Events", :shape "Events"})]}))

(clojure.core/defn- req-get-identity-pool-configuration-request [input] (clojure.core/cond-> #:http.request.configuration{:uri [(clojure.core/into (ser-identity-pool-id (input :identity-pool-id)) #:http.request.field{:name "IdentityPoolId", :shape "IdentityPoolId", :location "uri", :location-name "IdentityPoolId"})]}))

(clojure.core/defn- req-set-identity-pool-configuration-request [input] (clojure.core/cond-> #:http.request.configuration{:uri [(clojure.core/into (ser-identity-pool-id (input :identity-pool-id)) #:http.request.field{:name "IdentityPoolId", :shape "IdentityPoolId", :location "uri", :location-name "IdentityPoolId"})]} (clojure.core/contains? input :push-sync) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-push-sync (input :push-sync)) #:http.request.field{:name "PushSync", :shape "PushSync"})) (clojure.core/contains? input :cognito-streams) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-cognito-streams (input :cognito-streams)) #:http.request.field{:name "CognitoStreams", :shape "CognitoStreams"}))))

(clojure.core/defn- req-update-records-request [input] (clojure.core/cond-> #:http.request.configuration{:uri [(clojure.core/into (ser-identity-pool-id (input :identity-pool-id)) #:http.request.field{:name "IdentityPoolId", :shape "IdentityPoolId", :location "uri", :location-name "IdentityPoolId"}) (clojure.core/into (ser-identity-id (input :identity-id)) #:http.request.field{:name "IdentityId", :shape "IdentityId", :location "uri", :location-name "IdentityId"}) (clojure.core/into (ser-dataset-name (input :dataset-name)) #:http.request.field{:name "DatasetName", :shape "DatasetName", :location "uri", :location-name "DatasetName"})], :body [(clojure.core/into (ser-sync-session-token (input :sync-session-token)) #:http.request.field{:name "SyncSessionToken", :shape "SyncSessionToken"})]} (clojure.core/contains? input :device-id) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-device-id (input :device-id)) #:http.request.field{:name "DeviceId", :shape "DeviceId"})) (clojure.core/contains? input :record-patches) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-record-patch-list (input :record-patches)) #:http.request.field{:name "RecordPatches", :shape "RecordPatchList"})) (clojure.core/contains? input :client-context) (clojure.core/update-in [:http.request.configuration/header] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-client-context (input :client-context)) #:http.request.field{:name "ClientContext", :shape "ClientContext", :location "header", :location-name "x-amz-Client-Context"}))))

(clojure.core/defn- req-list-identity-pool-usage-request [input] (clojure.core/cond-> {} (clojure.core/contains? input :next-token) (clojure.core/update-in [:http.request.configuration/querystring] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-string (input :next-token)) #:http.request.field{:name "NextToken", :shape "String", :location "querystring", :location-name "nextToken"})) (clojure.core/contains? input :max-results) (clojure.core/update-in [:http.request.configuration/querystring] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-integer-string (input :max-results)) #:http.request.field{:name "MaxResults", :shape "IntegerString", :location "querystring", :location-name "maxResults"}))))

(clojure.core/defn- req-get-cognito-events-request [input] (clojure.core/cond-> #:http.request.configuration{:uri [(clojure.core/into (ser-identity-pool-id (input :identity-pool-id)) #:http.request.field{:name "IdentityPoolId", :shape "IdentityPoolId", :location "uri", :location-name "IdentityPoolId"})]}))

(clojure.core/defn- req-describe-identity-pool-usage-request [input] (clojure.core/cond-> #:http.request.configuration{:uri [(clojure.core/into (ser-identity-pool-id (input :identity-pool-id)) #:http.request.field{:name "IdentityPoolId", :shape "IdentityPoolId", :location "uri", :location-name "IdentityPoolId"})]}))

(clojure.core/defn- req-list-datasets-request [input] (clojure.core/cond-> #:http.request.configuration{:uri [(clojure.core/into (ser-identity-id (input :identity-id)) #:http.request.field{:name "IdentityId", :shape "IdentityId", :location "uri", :location-name "IdentityId"}) (clojure.core/into (ser-identity-pool-id (input :identity-pool-id)) #:http.request.field{:name "IdentityPoolId", :shape "IdentityPoolId", :location "uri", :location-name "IdentityPoolId"})]} (clojure.core/contains? input :next-token) (clojure.core/update-in [:http.request.configuration/querystring] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-string (input :next-token)) #:http.request.field{:name "NextToken", :shape "String", :location "querystring", :location-name "nextToken"})) (clojure.core/contains? input :max-results) (clojure.core/update-in [:http.request.configuration/querystring] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-integer-string (input :max-results)) #:http.request.field{:name "MaxResults", :shape "IntegerString", :location "querystring", :location-name "maxResults"}))))

(clojure.core/defn- req-delete-dataset-request [input] (clojure.core/cond-> #:http.request.configuration{:uri [(clojure.core/into (ser-identity-pool-id (input :identity-pool-id)) #:http.request.field{:name "IdentityPoolId", :shape "IdentityPoolId", :location "uri", :location-name "IdentityPoolId"}) (clojure.core/into (ser-identity-id (input :identity-id)) #:http.request.field{:name "IdentityId", :shape "IdentityId", :location "uri", :location-name "IdentityId"}) (clojure.core/into (ser-dataset-name (input :dataset-name)) #:http.request.field{:name "DatasetName", :shape "DatasetName", :location "uri", :location-name "DatasetName"})]}))

(clojure.core/defn- req-describe-dataset-request [input] (clojure.core/cond-> #:http.request.configuration{:uri [(clojure.core/into (ser-identity-pool-id (input :identity-pool-id)) #:http.request.field{:name "IdentityPoolId", :shape "IdentityPoolId", :location "uri", :location-name "IdentityPoolId"}) (clojure.core/into (ser-identity-id (input :identity-id)) #:http.request.field{:name "IdentityId", :shape "IdentityId", :location "uri", :location-name "IdentityId"}) (clojure.core/into (ser-dataset-name (input :dataset-name)) #:http.request.field{:name "DatasetName", :shape "DatasetName", :location "uri", :location-name "DatasetName"})]}))

(clojure.core/defn- req-bulk-publish-request [input] (clojure.core/cond-> #:http.request.configuration{:uri [(clojure.core/into (ser-identity-pool-id (input :identity-pool-id)) #:http.request.field{:name "IdentityPoolId", :shape "IdentityPoolId", :location "uri", :location-name "IdentityPoolId"})]}))

(clojure.core/defn- req-unsubscribe-from-dataset-request [input] (clojure.core/cond-> #:http.request.configuration{:uri [(clojure.core/into (ser-identity-pool-id (input :identity-pool-id)) #:http.request.field{:name "IdentityPoolId", :shape "IdentityPoolId", :location "uri", :location-name "IdentityPoolId"}) (clojure.core/into (ser-identity-id (input :identity-id)) #:http.request.field{:name "IdentityId", :shape "IdentityId", :location "uri", :location-name "IdentityId"}) (clojure.core/into (ser-dataset-name (input :dataset-name)) #:http.request.field{:name "DatasetName", :shape "DatasetName", :location "uri", :location-name "DatasetName"}) (clojure.core/into (ser-device-id (input :device-id)) #:http.request.field{:name "DeviceId", :shape "DeviceId", :location "uri", :location-name "DeviceId"})]}))

(clojure.core/defn- req-list-records-request [input] (clojure.core/cond-> #:http.request.configuration{:uri [(clojure.core/into (ser-identity-pool-id (input :identity-pool-id)) #:http.request.field{:name "IdentityPoolId", :shape "IdentityPoolId", :location "uri", :location-name "IdentityPoolId"}) (clojure.core/into (ser-identity-id (input :identity-id)) #:http.request.field{:name "IdentityId", :shape "IdentityId", :location "uri", :location-name "IdentityId"}) (clojure.core/into (ser-dataset-name (input :dataset-name)) #:http.request.field{:name "DatasetName", :shape "DatasetName", :location "uri", :location-name "DatasetName"})]} (clojure.core/contains? input :last-sync-count) (clojure.core/update-in [:http.request.configuration/querystring] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-long (input :last-sync-count)) #:http.request.field{:name "LastSyncCount", :shape "Long", :location "querystring", :location-name "lastSyncCount"})) (clojure.core/contains? input :next-token) (clojure.core/update-in [:http.request.configuration/querystring] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-string (input :next-token)) #:http.request.field{:name "NextToken", :shape "String", :location "querystring", :location-name "nextToken"})) (clojure.core/contains? input :max-results) (clojure.core/update-in [:http.request.configuration/querystring] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-integer-string (input :max-results)) #:http.request.field{:name "MaxResults", :shape "IntegerString", :location "querystring", :location-name "maxResults"})) (clojure.core/contains? input :sync-session-token) (clojure.core/update-in [:http.request.configuration/querystring] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-sync-session-token (input :sync-session-token)) #:http.request.field{:name "SyncSessionToken", :shape "SyncSessionToken", :location "querystring", :location-name "syncSessionToken"}))))

(clojure.core/defn- req-get-bulk-publish-details-request [input] (clojure.core/cond-> #:http.request.configuration{:uri [(clojure.core/into (ser-identity-pool-id (input :identity-pool-id)) #:http.request.field{:name "IdentityPoolId", :shape "IdentityPoolId", :location "uri", :location-name "IdentityPoolId"})]}))

(clojure.spec.alpha/def :portkey.aws.cognito-sync.register-device-request/token (clojure.spec.alpha/and :portkey.aws.cognito-sync/push-token))
(clojure.spec.alpha/def :portkey.aws.cognito-sync/register-device-request (clojure.spec.alpha/keys :req-un [:portkey.aws.cognito-sync/identity-pool-id :portkey.aws.cognito-sync/identity-id :portkey.aws.cognito-sync/platform :portkey.aws.cognito-sync.register-device-request/token] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.cognito-sync/record-key (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__42947__auto__] (clojure.core/<= 1 (clojure.core/count s__42947__auto__))) (clojure.core/fn [s__42948__auto__] (clojure.core/< (clojure.core/count s__42948__auto__) 1024))))

(clojure.spec.alpha/def :portkey.aws.cognito-sync.duplicate-request-exception/message (clojure.spec.alpha/and :portkey.aws.cognito-sync/exception-message))
(clojure.spec.alpha/def :portkey.aws.cognito-sync/duplicate-request-exception (clojure.spec.alpha/keys :req-un [:portkey.aws.cognito-sync.duplicate-request-exception/message] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.cognito-sync/stream-name (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__42947__auto__] (clojure.core/<= 1 (clojure.core/count s__42947__auto__))) (clojure.core/fn [s__42948__auto__] (clojure.core/< (clojure.core/count s__42948__auto__) 128))))

(clojure.spec.alpha/def :portkey.aws.cognito-sync.dataset/creation-date (clojure.spec.alpha/and :portkey.aws.cognito-sync/date))
(clojure.spec.alpha/def :portkey.aws.cognito-sync.dataset/last-modified-date (clojure.spec.alpha/and :portkey.aws.cognito-sync/date))
(clojure.spec.alpha/def :portkey.aws.cognito-sync.dataset/last-modified-by (clojure.spec.alpha/and :portkey.aws.cognito-sync/string))
(clojure.spec.alpha/def :portkey.aws.cognito-sync.dataset/data-storage (clojure.spec.alpha/and :portkey.aws.cognito-sync/long))
(clojure.spec.alpha/def :portkey.aws.cognito-sync.dataset/num-records (clojure.spec.alpha/and :portkey.aws.cognito-sync/long))
(clojure.spec.alpha/def :portkey.aws.cognito-sync/dataset (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.cognito-sync/identity-id :portkey.aws.cognito-sync/dataset-name :portkey.aws.cognito-sync.dataset/creation-date :portkey.aws.cognito-sync.dataset/last-modified-date :portkey.aws.cognito-sync.dataset/last-modified-by :portkey.aws.cognito-sync.dataset/data-storage :portkey.aws.cognito-sync.dataset/num-records]))

(clojure.spec.alpha/def :portkey.aws.cognito-sync/assume-role-arn (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__42947__auto__] (clojure.core/<= 20 (clojure.core/count s__42947__auto__))) (clojure.core/fn [s__42948__auto__] (clojure.core/< (clojure.core/count s__42948__auto__) 2048)) (clojure.core/fn [s__42949__auto__] (clojure.core/re-matches #"arn:aws:iam::\d+:role/.*" s__42949__auto__))))

(clojure.spec.alpha/def :portkey.aws.cognito-sync/platform #{"ADM" "GCM" "APNS" :apns-sandbox :gcm :adm "APNS_SANDBOX" :apns})

(clojure.spec.alpha/def :portkey.aws.cognito-sync/merged-dataset-name-list (clojure.spec.alpha/coll-of :portkey.aws.cognito-sync/string))

(clojure.spec.alpha/def :portkey.aws.cognito-sync/describe-identity-pool-usage-response (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.cognito-sync/identity-pool-usage]))

(clojure.spec.alpha/def :portkey.aws.cognito-sync.push-sync/application-arns (clojure.spec.alpha/and :portkey.aws.cognito-sync/application-arn-list))
(clojure.spec.alpha/def :portkey.aws.cognito-sync.push-sync/role-arn (clojure.spec.alpha/and :portkey.aws.cognito-sync/assume-role-arn))
(clojure.spec.alpha/def :portkey.aws.cognito-sync/push-sync (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.cognito-sync.push-sync/application-arns :portkey.aws.cognito-sync.push-sync/role-arn]))

(clojure.spec.alpha/def :portkey.aws.cognito-sync/describe-identity-usage-response (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.cognito-sync/identity-usage]))

(clojure.spec.alpha/def :portkey.aws.cognito-sync/subscribe-to-dataset-request (clojure.spec.alpha/keys :req-un [:portkey.aws.cognito-sync/identity-pool-id :portkey.aws.cognito-sync/identity-id :portkey.aws.cognito-sync/dataset-name :portkey.aws.cognito-sync/device-id] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.cognito-sync/unsubscribe-from-dataset-response (clojure.spec.alpha/keys :req-un [] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.cognito-sync/application-arn (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__42949__auto__] (clojure.core/re-matches #"arn:aws:sns:[-0-9a-z]+:\d+:app/[A-Z_]+/[a-zA-Z0-9_.-]+" s__42949__auto__))))

(clojure.spec.alpha/def :portkey.aws.cognito-sync/sync-session-token (clojure.spec.alpha/and clojure.core/string?))

(clojure.spec.alpha/def :portkey.aws.cognito-sync/dataset-name (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__42947__auto__] (clojure.core/<= 1 (clojure.core/count s__42947__auto__))) (clojure.core/fn [s__42948__auto__] (clojure.core/< (clojure.core/count s__42948__auto__) 128)) (clojure.core/fn [s__42949__auto__] (clojure.core/re-matches #"[a-zA-Z0-9_.:-]+" s__42949__auto__))))

(clojure.spec.alpha/def :portkey.aws.cognito-sync/describe-identity-usage-request (clojure.spec.alpha/keys :req-un [:portkey.aws.cognito-sync/identity-pool-id :portkey.aws.cognito-sync/identity-id] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.cognito-sync/set-cognito-events-request (clojure.spec.alpha/keys :req-un [:portkey.aws.cognito-sync/identity-pool-id :portkey.aws.cognito-sync/events] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.cognito-sync/set-identity-pool-configuration-response (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.cognito-sync/identity-pool-id :portkey.aws.cognito-sync/push-sync :portkey.aws.cognito-sync/cognito-streams]))

(clojure.spec.alpha/def :portkey.aws.cognito-sync/get-identity-pool-configuration-request (clojure.spec.alpha/keys :req-un [:portkey.aws.cognito-sync/identity-pool-id] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.cognito-sync/set-identity-pool-configuration-request (clojure.spec.alpha/keys :req-un [:portkey.aws.cognito-sync/identity-pool-id] :opt-un [:portkey.aws.cognito-sync/push-sync :portkey.aws.cognito-sync/cognito-streams]))

(clojure.spec.alpha/def :portkey.aws.cognito-sync.update-records-request/record-patches (clojure.spec.alpha/and :portkey.aws.cognito-sync/record-patch-list))
(clojure.spec.alpha/def :portkey.aws.cognito-sync/update-records-request (clojure.spec.alpha/keys :req-un [:portkey.aws.cognito-sync/identity-pool-id :portkey.aws.cognito-sync/identity-id :portkey.aws.cognito-sync/dataset-name :portkey.aws.cognito-sync/sync-session-token] :opt-un [:portkey.aws.cognito-sync/device-id :portkey.aws.cognito-sync.update-records-request/record-patches :portkey.aws.cognito-sync/client-context]))

(clojure.spec.alpha/def :portkey.aws.cognito-sync.record-patch/op (clojure.spec.alpha/and :portkey.aws.cognito-sync/operation))
(clojure.spec.alpha/def :portkey.aws.cognito-sync.record-patch/key (clojure.spec.alpha/and :portkey.aws.cognito-sync/record-key))
(clojure.spec.alpha/def :portkey.aws.cognito-sync.record-patch/value (clojure.spec.alpha/and :portkey.aws.cognito-sync/record-value))
(clojure.spec.alpha/def :portkey.aws.cognito-sync.record-patch/sync-count (clojure.spec.alpha/and :portkey.aws.cognito-sync/long))
(clojure.spec.alpha/def :portkey.aws.cognito-sync.record-patch/device-last-modified-date (clojure.spec.alpha/and :portkey.aws.cognito-sync/date))
(clojure.spec.alpha/def :portkey.aws.cognito-sync/record-patch (clojure.spec.alpha/keys :req-un [:portkey.aws.cognito-sync.record-patch/op :portkey.aws.cognito-sync.record-patch/key :portkey.aws.cognito-sync.record-patch/sync-count] :opt-un [:portkey.aws.cognito-sync.record-patch/value :portkey.aws.cognito-sync.record-patch/device-last-modified-date]))

(clojure.spec.alpha/def :portkey.aws.cognito-sync.list-identity-pool-usage-request/next-token (clojure.spec.alpha/and :portkey.aws.cognito-sync/string))
(clojure.spec.alpha/def :portkey.aws.cognito-sync.list-identity-pool-usage-request/max-results (clojure.spec.alpha/and :portkey.aws.cognito-sync/integer-string))
(clojure.spec.alpha/def :portkey.aws.cognito-sync/list-identity-pool-usage-request (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.cognito-sync.list-identity-pool-usage-request/next-token :portkey.aws.cognito-sync.list-identity-pool-usage-request/max-results]))

(clojure.spec.alpha/def :portkey.aws.cognito-sync.cognito-streams/role-arn (clojure.spec.alpha/and :portkey.aws.cognito-sync/assume-role-arn))
(clojure.spec.alpha/def :portkey.aws.cognito-sync/cognito-streams (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.cognito-sync/stream-name :portkey.aws.cognito-sync.cognito-streams/role-arn :portkey.aws.cognito-sync/streaming-status]))

(clojure.spec.alpha/def :portkey.aws.cognito-sync/cognito-event-type (clojure.spec.alpha/and clojure.core/string?))

(clojure.spec.alpha/def :portkey.aws.cognito-sync/push-token (clojure.spec.alpha/and clojure.core/string?))

(clojure.spec.alpha/def :portkey.aws.cognito-sync/application-arn-list (clojure.spec.alpha/coll-of :portkey.aws.cognito-sync/application-arn))

(clojure.spec.alpha/def :portkey.aws.cognito-sync/get-cognito-events-request (clojure.spec.alpha/keys :req-un [:portkey.aws.cognito-sync/identity-pool-id] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.cognito-sync.limit-exceeded-exception/message (clojure.spec.alpha/and :portkey.aws.cognito-sync/exception-message))
(clojure.spec.alpha/def :portkey.aws.cognito-sync/limit-exceeded-exception (clojure.spec.alpha/keys :req-un [:portkey.aws.cognito-sync.limit-exceeded-exception/message] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.cognito-sync.already-streamed-exception/message (clojure.spec.alpha/and :portkey.aws.cognito-sync/exception-message))
(clojure.spec.alpha/def :portkey.aws.cognito-sync/already-streamed-exception (clojure.spec.alpha/keys :req-un [:portkey.aws.cognito-sync.already-streamed-exception/message] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.cognito-sync.not-authorized-exception/message (clojure.spec.alpha/and :portkey.aws.cognito-sync/exception-message))
(clojure.spec.alpha/def :portkey.aws.cognito-sync/not-authorized-exception (clojure.spec.alpha/keys :req-un [:portkey.aws.cognito-sync.not-authorized-exception/message] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.cognito-sync/operation #{:remove :replace "replace" "remove"})

(clojure.spec.alpha/def :portkey.aws.cognito-sync/identity-pool-id (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__42947__auto__] (clojure.core/<= 1 (clojure.core/count s__42947__auto__))) (clojure.core/fn [s__42948__auto__] (clojure.core/< (clojure.core/count s__42948__auto__) 55)) (clojure.core/fn [s__42949__auto__] (clojure.core/re-matches #"[\w-]+:[0-9a-f-]+" s__42949__auto__))))

(clojure.spec.alpha/def :portkey.aws.cognito-sync/events (clojure.spec.alpha/map-of :portkey.aws.cognito-sync/cognito-event-type :portkey.aws.cognito-sync/lambda-function-arn))

(clojure.spec.alpha/def :portkey.aws.cognito-sync/describe-identity-pool-usage-request (clojure.spec.alpha/keys :req-un [:portkey.aws.cognito-sync/identity-pool-id] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.cognito-sync.update-records-response/records (clojure.spec.alpha/and :portkey.aws.cognito-sync/record-list))
(clojure.spec.alpha/def :portkey.aws.cognito-sync/update-records-response (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.cognito-sync.update-records-response/records]))

(clojure.spec.alpha/def :portkey.aws.cognito-sync/delete-dataset-response (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.cognito-sync/dataset]))

(clojure.spec.alpha/def :portkey.aws.cognito-sync/bulk-publish-status #{"IN_PROGRESS" :in-progress "NOT_STARTED" "SUCCEEDED" "FAILED" :not-started :failed :succeeded})

(clojure.spec.alpha/def :portkey.aws.cognito-sync/date clojure.core/inst?)

(clojure.spec.alpha/def :portkey.aws.cognito-sync/identity-id (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__42947__auto__] (clojure.core/<= 1 (clojure.core/count s__42947__auto__))) (clojure.core/fn [s__42948__auto__] (clojure.core/< (clojure.core/count s__42948__auto__) 55)) (clojure.core/fn [s__42949__auto__] (clojure.core/re-matches #"[\w-]+:[0-9a-f-]+" s__42949__auto__))))

(clojure.spec.alpha/def :portkey.aws.cognito-sync.get-bulk-publish-details-response/bulk-publish-start-time (clojure.spec.alpha/and :portkey.aws.cognito-sync/date))
(clojure.spec.alpha/def :portkey.aws.cognito-sync.get-bulk-publish-details-response/bulk-publish-complete-time (clojure.spec.alpha/and :portkey.aws.cognito-sync/date))
(clojure.spec.alpha/def :portkey.aws.cognito-sync.get-bulk-publish-details-response/failure-message (clojure.spec.alpha/and :portkey.aws.cognito-sync/string))
(clojure.spec.alpha/def :portkey.aws.cognito-sync/get-bulk-publish-details-response (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.cognito-sync/identity-pool-id :portkey.aws.cognito-sync.get-bulk-publish-details-response/bulk-publish-start-time :portkey.aws.cognito-sync.get-bulk-publish-details-response/bulk-publish-complete-time :portkey.aws.cognito-sync/bulk-publish-status :portkey.aws.cognito-sync.get-bulk-publish-details-response/failure-message]))

(clojure.spec.alpha/def :portkey.aws.cognito-sync.too-many-requests-exception/message (clojure.spec.alpha/and :portkey.aws.cognito-sync/exception-message))
(clojure.spec.alpha/def :portkey.aws.cognito-sync/too-many-requests-exception (clojure.spec.alpha/keys :req-un [:portkey.aws.cognito-sync.too-many-requests-exception/message] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.cognito-sync.internal-error-exception/message (clojure.spec.alpha/and :portkey.aws.cognito-sync/exception-message))
(clojure.spec.alpha/def :portkey.aws.cognito-sync/internal-error-exception (clojure.spec.alpha/keys :req-un [:portkey.aws.cognito-sync.internal-error-exception/message] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.cognito-sync/integer-string clojure.core/int?)

(clojure.spec.alpha/def :portkey.aws.cognito-sync.list-datasets-request/next-token (clojure.spec.alpha/and :portkey.aws.cognito-sync/string))
(clojure.spec.alpha/def :portkey.aws.cognito-sync.list-datasets-request/max-results (clojure.spec.alpha/and :portkey.aws.cognito-sync/integer-string))
(clojure.spec.alpha/def :portkey.aws.cognito-sync/list-datasets-request (clojure.spec.alpha/keys :req-un [:portkey.aws.cognito-sync/identity-id :portkey.aws.cognito-sync/identity-pool-id] :opt-un [:portkey.aws.cognito-sync.list-datasets-request/next-token :portkey.aws.cognito-sync.list-datasets-request/max-results]))

(clojure.spec.alpha/def :portkey.aws.cognito-sync.resource-not-found-exception/message (clojure.spec.alpha/and :portkey.aws.cognito-sync/exception-message))
(clojure.spec.alpha/def :portkey.aws.cognito-sync/resource-not-found-exception (clojure.spec.alpha/keys :req-un [:portkey.aws.cognito-sync.resource-not-found-exception/message] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.cognito-sync/client-context (clojure.spec.alpha/and clojure.core/string?))

(clojure.spec.alpha/def :portkey.aws.cognito-sync/streaming-status #{"DISABLED" :disabled "ENABLED" :enabled})

(clojure.spec.alpha/def :portkey.aws.cognito-sync/get-cognito-events-response (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.cognito-sync/events]))

(clojure.spec.alpha/def :portkey.aws.cognito-sync/delete-dataset-request (clojure.spec.alpha/keys :req-un [:portkey.aws.cognito-sync/identity-pool-id :portkey.aws.cognito-sync/identity-id :portkey.aws.cognito-sync/dataset-name] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.cognito-sync/lambda-function-arn (clojure.spec.alpha/and clojure.core/string?))

(clojure.spec.alpha/def :portkey.aws.cognito-sync/exception-message (clojure.spec.alpha/and clojure.core/string?))

(clojure.spec.alpha/def :portkey.aws.cognito-sync/describe-dataset-request (clojure.spec.alpha/keys :req-un [:portkey.aws.cognito-sync/identity-pool-id :portkey.aws.cognito-sync/identity-id :portkey.aws.cognito-sync/dataset-name] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.cognito-sync.lambda-throttled-exception/message (clojure.spec.alpha/and :portkey.aws.cognito-sync/exception-message))
(clojure.spec.alpha/def :portkey.aws.cognito-sync/lambda-throttled-exception (clojure.spec.alpha/keys :req-un [:portkey.aws.cognito-sync.lambda-throttled-exception/message] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.cognito-sync/describe-dataset-response (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.cognito-sync/dataset]))

(clojure.spec.alpha/def :portkey.aws.cognito-sync/integer clojure.core/int?)

(clojure.spec.alpha/def :portkey.aws.cognito-sync/string (clojure.spec.alpha/and clojure.core/string?))

(clojure.spec.alpha/def :portkey.aws.cognito-sync/record-patch-list (clojure.spec.alpha/coll-of :portkey.aws.cognito-sync/record-patch))

(clojure.spec.alpha/def :portkey.aws.cognito-sync/bulk-publish-request (clojure.spec.alpha/keys :req-un [:portkey.aws.cognito-sync/identity-pool-id] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.cognito-sync.record/key (clojure.spec.alpha/and :portkey.aws.cognito-sync/record-key))
(clojure.spec.alpha/def :portkey.aws.cognito-sync.record/value (clojure.spec.alpha/and :portkey.aws.cognito-sync/record-value))
(clojure.spec.alpha/def :portkey.aws.cognito-sync.record/sync-count (clojure.spec.alpha/and :portkey.aws.cognito-sync/long))
(clojure.spec.alpha/def :portkey.aws.cognito-sync.record/last-modified-date (clojure.spec.alpha/and :portkey.aws.cognito-sync/date))
(clojure.spec.alpha/def :portkey.aws.cognito-sync.record/last-modified-by (clojure.spec.alpha/and :portkey.aws.cognito-sync/string))
(clojure.spec.alpha/def :portkey.aws.cognito-sync.record/device-last-modified-date (clojure.spec.alpha/and :portkey.aws.cognito-sync/date))
(clojure.spec.alpha/def :portkey.aws.cognito-sync/record (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.cognito-sync.record/key :portkey.aws.cognito-sync.record/value :portkey.aws.cognito-sync.record/sync-count :portkey.aws.cognito-sync.record/last-modified-date :portkey.aws.cognito-sync.record/last-modified-by :portkey.aws.cognito-sync.record/device-last-modified-date]))

(clojure.spec.alpha/def :portkey.aws.cognito-sync/record-list (clojure.spec.alpha/coll-of :portkey.aws.cognito-sync/record))

(clojure.spec.alpha/def :portkey.aws.cognito-sync.resource-conflict-exception/message (clojure.spec.alpha/and :portkey.aws.cognito-sync/exception-message))
(clojure.spec.alpha/def :portkey.aws.cognito-sync/resource-conflict-exception (clojure.spec.alpha/keys :req-un [:portkey.aws.cognito-sync.resource-conflict-exception/message] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.cognito-sync/device-id (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__42947__auto__] (clojure.core/<= 1 (clojure.core/count s__42947__auto__))) (clojure.core/fn [s__42948__auto__] (clojure.core/< (clojure.core/count s__42948__auto__) 256))))

(clojure.spec.alpha/def :portkey.aws.cognito-sync/identity-pool-usage-list (clojure.spec.alpha/coll-of :portkey.aws.cognito-sync/identity-pool-usage))

(clojure.spec.alpha/def :portkey.aws.cognito-sync.invalid-lambda-function-output-exception/message (clojure.spec.alpha/and :portkey.aws.cognito-sync/exception-message))
(clojure.spec.alpha/def :portkey.aws.cognito-sync/invalid-lambda-function-output-exception (clojure.spec.alpha/keys :req-un [:portkey.aws.cognito-sync.invalid-lambda-function-output-exception/message] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.cognito-sync/get-identity-pool-configuration-response (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.cognito-sync/identity-pool-id :portkey.aws.cognito-sync/push-sync :portkey.aws.cognito-sync/cognito-streams]))

(clojure.spec.alpha/def :portkey.aws.cognito-sync/long clojure.core/int?)

(clojure.spec.alpha/def :portkey.aws.cognito-sync.list-records-response/sync-session-token (clojure.spec.alpha/and :portkey.aws.cognito-sync/string))
(clojure.spec.alpha/def :portkey.aws.cognito-sync.list-records-response/dataset-sync-count (clojure.spec.alpha/and :portkey.aws.cognito-sync/long))
(clojure.spec.alpha/def :portkey.aws.cognito-sync.list-records-response/count (clojure.spec.alpha/and :portkey.aws.cognito-sync/integer))
(clojure.spec.alpha/def :portkey.aws.cognito-sync.list-records-response/next-token (clojure.spec.alpha/and :portkey.aws.cognito-sync/string))
(clojure.spec.alpha/def :portkey.aws.cognito-sync.list-records-response/dataset-exists (clojure.spec.alpha/and :portkey.aws.cognito-sync/boolean))
(clojure.spec.alpha/def :portkey.aws.cognito-sync.list-records-response/dataset-deleted-after-requested-sync-count (clojure.spec.alpha/and :portkey.aws.cognito-sync/boolean))
(clojure.spec.alpha/def :portkey.aws.cognito-sync.list-records-response/merged-dataset-names (clojure.spec.alpha/and :portkey.aws.cognito-sync/merged-dataset-name-list))
(clojure.spec.alpha/def :portkey.aws.cognito-sync.list-records-response/records (clojure.spec.alpha/and :portkey.aws.cognito-sync/record-list))
(clojure.spec.alpha/def :portkey.aws.cognito-sync.list-records-response/last-modified-by (clojure.spec.alpha/and :portkey.aws.cognito-sync/string))
(clojure.spec.alpha/def :portkey.aws.cognito-sync/list-records-response (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.cognito-sync.list-records-response/sync-session-token :portkey.aws.cognito-sync.list-records-response/dataset-sync-count :portkey.aws.cognito-sync.list-records-response/count :portkey.aws.cognito-sync.list-records-response/next-token :portkey.aws.cognito-sync.list-records-response/dataset-exists :portkey.aws.cognito-sync.list-records-response/dataset-deleted-after-requested-sync-count :portkey.aws.cognito-sync.list-records-response/merged-dataset-names :portkey.aws.cognito-sync.list-records-response/records :portkey.aws.cognito-sync.list-records-response/last-modified-by]))

(clojure.spec.alpha/def :portkey.aws.cognito-sync/subscribe-to-dataset-response (clojure.spec.alpha/keys :req-un [] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.cognito-sync/record-value (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__42948__auto__] (clojure.core/< (clojure.core/count s__42948__auto__) 1048575))))

(clojure.spec.alpha/def :portkey.aws.cognito-sync/bulk-publish-response (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.cognito-sync/identity-pool-id]))

(clojure.spec.alpha/def :portkey.aws.cognito-sync/unsubscribe-from-dataset-request (clojure.spec.alpha/keys :req-un [:portkey.aws.cognito-sync/identity-pool-id :portkey.aws.cognito-sync/identity-id :portkey.aws.cognito-sync/dataset-name :portkey.aws.cognito-sync/device-id] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.cognito-sync.concurrent-modification-exception/message (clojure.spec.alpha/and :portkey.aws.cognito-sync/string))
(clojure.spec.alpha/def :portkey.aws.cognito-sync/concurrent-modification-exception (clojure.spec.alpha/keys :req-un [:portkey.aws.cognito-sync.concurrent-modification-exception/message] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.cognito-sync/dataset-list (clojure.spec.alpha/coll-of :portkey.aws.cognito-sync/dataset))

(clojure.spec.alpha/def :portkey.aws.cognito-sync.list-identity-pool-usage-response/identity-pool-usages (clojure.spec.alpha/and :portkey.aws.cognito-sync/identity-pool-usage-list))
(clojure.spec.alpha/def :portkey.aws.cognito-sync.list-identity-pool-usage-response/max-results (clojure.spec.alpha/and :portkey.aws.cognito-sync/integer))
(clojure.spec.alpha/def :portkey.aws.cognito-sync.list-identity-pool-usage-response/count (clojure.spec.alpha/and :portkey.aws.cognito-sync/integer))
(clojure.spec.alpha/def :portkey.aws.cognito-sync.list-identity-pool-usage-response/next-token (clojure.spec.alpha/and :portkey.aws.cognito-sync/string))
(clojure.spec.alpha/def :portkey.aws.cognito-sync/list-identity-pool-usage-response (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.cognito-sync.list-identity-pool-usage-response/identity-pool-usages :portkey.aws.cognito-sync.list-identity-pool-usage-response/max-results :portkey.aws.cognito-sync.list-identity-pool-usage-response/count :portkey.aws.cognito-sync.list-identity-pool-usage-response/next-token]))

(clojure.spec.alpha/def :portkey.aws.cognito-sync.identity-pool-usage/sync-sessions-count (clojure.spec.alpha/and :portkey.aws.cognito-sync/long))
(clojure.spec.alpha/def :portkey.aws.cognito-sync.identity-pool-usage/data-storage (clojure.spec.alpha/and :portkey.aws.cognito-sync/long))
(clojure.spec.alpha/def :portkey.aws.cognito-sync.identity-pool-usage/last-modified-date (clojure.spec.alpha/and :portkey.aws.cognito-sync/date))
(clojure.spec.alpha/def :portkey.aws.cognito-sync/identity-pool-usage (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.cognito-sync/identity-pool-id :portkey.aws.cognito-sync.identity-pool-usage/sync-sessions-count :portkey.aws.cognito-sync.identity-pool-usage/data-storage :portkey.aws.cognito-sync.identity-pool-usage/last-modified-date]))

(clojure.spec.alpha/def :portkey.aws.cognito-sync.list-records-request/last-sync-count (clojure.spec.alpha/and :portkey.aws.cognito-sync/long))
(clojure.spec.alpha/def :portkey.aws.cognito-sync.list-records-request/next-token (clojure.spec.alpha/and :portkey.aws.cognito-sync/string))
(clojure.spec.alpha/def :portkey.aws.cognito-sync.list-records-request/max-results (clojure.spec.alpha/and :portkey.aws.cognito-sync/integer-string))
(clojure.spec.alpha/def :portkey.aws.cognito-sync/list-records-request (clojure.spec.alpha/keys :req-un [:portkey.aws.cognito-sync/identity-pool-id :portkey.aws.cognito-sync/identity-id :portkey.aws.cognito-sync/dataset-name] :opt-un [:portkey.aws.cognito-sync.list-records-request/last-sync-count :portkey.aws.cognito-sync.list-records-request/next-token :portkey.aws.cognito-sync.list-records-request/max-results :portkey.aws.cognito-sync/sync-session-token]))

(clojure.spec.alpha/def :portkey.aws.cognito-sync.invalid-parameter-exception/message (clojure.spec.alpha/and :portkey.aws.cognito-sync/exception-message))
(clojure.spec.alpha/def :portkey.aws.cognito-sync/invalid-parameter-exception (clojure.spec.alpha/keys :req-un [:portkey.aws.cognito-sync.invalid-parameter-exception/message] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.cognito-sync/register-device-response (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.cognito-sync/device-id]))

(clojure.spec.alpha/def :portkey.aws.cognito-sync.identity-usage/last-modified-date (clojure.spec.alpha/and :portkey.aws.cognito-sync/date))
(clojure.spec.alpha/def :portkey.aws.cognito-sync.identity-usage/dataset-count (clojure.spec.alpha/and :portkey.aws.cognito-sync/integer))
(clojure.spec.alpha/def :portkey.aws.cognito-sync.identity-usage/data-storage (clojure.spec.alpha/and :portkey.aws.cognito-sync/long))
(clojure.spec.alpha/def :portkey.aws.cognito-sync/identity-usage (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.cognito-sync/identity-id :portkey.aws.cognito-sync/identity-pool-id :portkey.aws.cognito-sync.identity-usage/last-modified-date :portkey.aws.cognito-sync.identity-usage/dataset-count :portkey.aws.cognito-sync.identity-usage/data-storage]))

(clojure.spec.alpha/def :portkey.aws.cognito-sync.list-datasets-response/datasets (clojure.spec.alpha/and :portkey.aws.cognito-sync/dataset-list))
(clojure.spec.alpha/def :portkey.aws.cognito-sync.list-datasets-response/count (clojure.spec.alpha/and :portkey.aws.cognito-sync/integer))
(clojure.spec.alpha/def :portkey.aws.cognito-sync.list-datasets-response/next-token (clojure.spec.alpha/and :portkey.aws.cognito-sync/string))
(clojure.spec.alpha/def :portkey.aws.cognito-sync/list-datasets-response (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.cognito-sync.list-datasets-response/datasets :portkey.aws.cognito-sync.list-datasets-response/count :portkey.aws.cognito-sync.list-datasets-response/next-token]))

(clojure.spec.alpha/def :portkey.aws.cognito-sync.invalid-configuration-exception/message (clojure.spec.alpha/and :portkey.aws.cognito-sync/exception-message))
(clojure.spec.alpha/def :portkey.aws.cognito-sync/invalid-configuration-exception (clojure.spec.alpha/keys :req-un [:portkey.aws.cognito-sync.invalid-configuration-exception/message] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.cognito-sync/get-bulk-publish-details-request (clojure.spec.alpha/keys :req-un [:portkey.aws.cognito-sync/identity-pool-id] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.cognito-sync/boolean clojure.core/boolean?)

(clojure.core/defn list-records ([list-records-requestinput] (clojure.core/let [request-function-result__43533__auto__ (req-list-records-request list-records-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__43533__auto__ {:http.request.configuration/endpoints portkey.aws.cognito-sync/endpoints, :http.request.spec/output-spec :portkey.aws.cognito-sync/list-records-response, :http.request.configuration/mime-type {"content-type" "application/json"}, :http.request.configuration/request-uri "/identitypools/{IdentityPoolId}/identities/{IdentityId}/datasets/{DatasetName}/records", :http.request.configuration/version "2014-06-30", :http.request.configuration/service-id nil, :http.request.spec/input-spec :portkey.aws.cognito-sync/list-records-request, :http.request.configuration/protocol "rest-json", :http.request.configuration/method :get, :http.request.configuration/response-code 200, :http.request.configuration/action "ListRecords", :http.request.spec/error-spec {"InvalidParameterException" :portkey.aws.cognito-sync/invalid-parameter-exception, "NotAuthorizedException" :portkey.aws.cognito-sync/not-authorized-exception, "TooManyRequestsException" :portkey.aws.cognito-sync/too-many-requests-exception, "InternalErrorException" :portkey.aws.cognito-sync/internal-error-exception}})))))
(clojure.spec.alpha/fdef list-records :args (clojure.spec.alpha/tuple :portkey.aws.cognito-sync/list-records-request) :ret (clojure.spec.alpha/and :portkey.aws.cognito-sync/list-records-response))

(clojure.core/defn describe-dataset ([describe-dataset-requestinput] (clojure.core/let [request-function-result__43533__auto__ (req-describe-dataset-request describe-dataset-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__43533__auto__ {:http.request.configuration/endpoints portkey.aws.cognito-sync/endpoints, :http.request.spec/output-spec :portkey.aws.cognito-sync/describe-dataset-response, :http.request.configuration/mime-type {"content-type" "application/json"}, :http.request.configuration/request-uri "/identitypools/{IdentityPoolId}/identities/{IdentityId}/datasets/{DatasetName}", :http.request.configuration/version "2014-06-30", :http.request.configuration/service-id nil, :http.request.spec/input-spec :portkey.aws.cognito-sync/describe-dataset-request, :http.request.configuration/protocol "rest-json", :http.request.configuration/method :get, :http.request.configuration/response-code 200, :http.request.configuration/action "DescribeDataset", :http.request.spec/error-spec {"NotAuthorizedException" :portkey.aws.cognito-sync/not-authorized-exception, "InvalidParameterException" :portkey.aws.cognito-sync/invalid-parameter-exception, "ResourceNotFoundException" :portkey.aws.cognito-sync/resource-not-found-exception, "InternalErrorException" :portkey.aws.cognito-sync/internal-error-exception, "TooManyRequestsException" :portkey.aws.cognito-sync/too-many-requests-exception}})))))
(clojure.spec.alpha/fdef describe-dataset :args (clojure.spec.alpha/tuple :portkey.aws.cognito-sync/describe-dataset-request) :ret (clojure.spec.alpha/and :portkey.aws.cognito-sync/describe-dataset-response))

(clojure.core/defn get-bulk-publish-details ([get-bulk-publish-details-requestinput] (clojure.core/let [request-function-result__43533__auto__ (req-get-bulk-publish-details-request get-bulk-publish-details-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__43533__auto__ {:http.request.configuration/endpoints portkey.aws.cognito-sync/endpoints, :http.request.spec/output-spec :portkey.aws.cognito-sync/get-bulk-publish-details-response, :http.request.configuration/mime-type {"content-type" "application/json"}, :http.request.configuration/request-uri "/identitypools/{IdentityPoolId}/getBulkPublishDetails", :http.request.configuration/version "2014-06-30", :http.request.configuration/service-id nil, :http.request.spec/input-spec :portkey.aws.cognito-sync/get-bulk-publish-details-request, :http.request.configuration/protocol "rest-json", :http.request.configuration/method :post, :http.request.configuration/response-code 200, :http.request.configuration/action "GetBulkPublishDetails", :http.request.spec/error-spec {"NotAuthorizedException" :portkey.aws.cognito-sync/not-authorized-exception, "InvalidParameterException" :portkey.aws.cognito-sync/invalid-parameter-exception, "ResourceNotFoundException" :portkey.aws.cognito-sync/resource-not-found-exception, "InternalErrorException" :portkey.aws.cognito-sync/internal-error-exception}})))))
(clojure.spec.alpha/fdef get-bulk-publish-details :args (clojure.spec.alpha/tuple :portkey.aws.cognito-sync/get-bulk-publish-details-request) :ret (clojure.spec.alpha/and :portkey.aws.cognito-sync/get-bulk-publish-details-response))

(clojure.core/defn describe-identity-usage ([describe-identity-usage-requestinput] (clojure.core/let [request-function-result__43533__auto__ (req-describe-identity-usage-request describe-identity-usage-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__43533__auto__ {:http.request.configuration/endpoints portkey.aws.cognito-sync/endpoints, :http.request.spec/output-spec :portkey.aws.cognito-sync/describe-identity-usage-response, :http.request.configuration/mime-type {"content-type" "application/json"}, :http.request.configuration/request-uri "/identitypools/{IdentityPoolId}/identities/{IdentityId}", :http.request.configuration/version "2014-06-30", :http.request.configuration/service-id nil, :http.request.spec/input-spec :portkey.aws.cognito-sync/describe-identity-usage-request, :http.request.configuration/protocol "rest-json", :http.request.configuration/method :get, :http.request.configuration/response-code 200, :http.request.configuration/action "DescribeIdentityUsage", :http.request.spec/error-spec {"NotAuthorizedException" :portkey.aws.cognito-sync/not-authorized-exception, "InvalidParameterException" :portkey.aws.cognito-sync/invalid-parameter-exception, "ResourceNotFoundException" :portkey.aws.cognito-sync/resource-not-found-exception, "InternalErrorException" :portkey.aws.cognito-sync/internal-error-exception, "TooManyRequestsException" :portkey.aws.cognito-sync/too-many-requests-exception}})))))
(clojure.spec.alpha/fdef describe-identity-usage :args (clojure.spec.alpha/tuple :portkey.aws.cognito-sync/describe-identity-usage-request) :ret (clojure.spec.alpha/and :portkey.aws.cognito-sync/describe-identity-usage-response))

(clojure.core/defn get-cognito-events ([get-cognito-events-requestinput] (clojure.core/let [request-function-result__43533__auto__ (req-get-cognito-events-request get-cognito-events-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__43533__auto__ {:http.request.configuration/endpoints portkey.aws.cognito-sync/endpoints, :http.request.spec/output-spec :portkey.aws.cognito-sync/get-cognito-events-response, :http.request.configuration/mime-type {"content-type" "application/json"}, :http.request.configuration/request-uri "/identitypools/{IdentityPoolId}/events", :http.request.configuration/version "2014-06-30", :http.request.configuration/service-id nil, :http.request.spec/input-spec :portkey.aws.cognito-sync/get-cognito-events-request, :http.request.configuration/protocol "rest-json", :http.request.configuration/method :get, :http.request.configuration/response-code 200, :http.request.configuration/action "GetCognitoEvents", :http.request.spec/error-spec {"InvalidParameterException" :portkey.aws.cognito-sync/invalid-parameter-exception, "ResourceNotFoundException" :portkey.aws.cognito-sync/resource-not-found-exception, "NotAuthorizedException" :portkey.aws.cognito-sync/not-authorized-exception, "InternalErrorException" :portkey.aws.cognito-sync/internal-error-exception, "TooManyRequestsException" :portkey.aws.cognito-sync/too-many-requests-exception}})))))
(clojure.spec.alpha/fdef get-cognito-events :args (clojure.spec.alpha/tuple :portkey.aws.cognito-sync/get-cognito-events-request) :ret (clojure.spec.alpha/and :portkey.aws.cognito-sync/get-cognito-events-response))

(clojure.core/defn list-datasets ([list-datasets-requestinput] (clojure.core/let [request-function-result__43533__auto__ (req-list-datasets-request list-datasets-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__43533__auto__ {:http.request.configuration/endpoints portkey.aws.cognito-sync/endpoints, :http.request.spec/output-spec :portkey.aws.cognito-sync/list-datasets-response, :http.request.configuration/mime-type {"content-type" "application/json"}, :http.request.configuration/request-uri "/identitypools/{IdentityPoolId}/identities/{IdentityId}/datasets", :http.request.configuration/version "2014-06-30", :http.request.configuration/service-id nil, :http.request.spec/input-spec :portkey.aws.cognito-sync/list-datasets-request, :http.request.configuration/protocol "rest-json", :http.request.configuration/method :get, :http.request.configuration/response-code 200, :http.request.configuration/action "ListDatasets", :http.request.spec/error-spec {"NotAuthorizedException" :portkey.aws.cognito-sync/not-authorized-exception, "InvalidParameterException" :portkey.aws.cognito-sync/invalid-parameter-exception, "InternalErrorException" :portkey.aws.cognito-sync/internal-error-exception, "TooManyRequestsException" :portkey.aws.cognito-sync/too-many-requests-exception}})))))
(clojure.spec.alpha/fdef list-datasets :args (clojure.spec.alpha/tuple :portkey.aws.cognito-sync/list-datasets-request) :ret (clojure.spec.alpha/and :portkey.aws.cognito-sync/list-datasets-response))

(clojure.core/defn list-identity-pool-usage ([] (list-identity-pool-usage {})) ([list-identity-pool-usage-requestinput] (clojure.core/let [request-function-result__43533__auto__ (req-list-identity-pool-usage-request list-identity-pool-usage-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__43533__auto__ {:http.request.configuration/endpoints portkey.aws.cognito-sync/endpoints, :http.request.spec/output-spec :portkey.aws.cognito-sync/list-identity-pool-usage-response, :http.request.configuration/mime-type {"content-type" "application/json"}, :http.request.configuration/request-uri "/identitypools", :http.request.configuration/version "2014-06-30", :http.request.configuration/service-id nil, :http.request.spec/input-spec :portkey.aws.cognito-sync/list-identity-pool-usage-request, :http.request.configuration/protocol "rest-json", :http.request.configuration/method :get, :http.request.configuration/response-code 200, :http.request.configuration/action "ListIdentityPoolUsage", :http.request.spec/error-spec {"NotAuthorizedException" :portkey.aws.cognito-sync/not-authorized-exception, "InvalidParameterException" :portkey.aws.cognito-sync/invalid-parameter-exception, "InternalErrorException" :portkey.aws.cognito-sync/internal-error-exception, "TooManyRequestsException" :portkey.aws.cognito-sync/too-many-requests-exception}})))))
(clojure.spec.alpha/fdef list-identity-pool-usage :args (clojure.spec.alpha/? :portkey.aws.cognito-sync/list-identity-pool-usage-request) :ret (clojure.spec.alpha/and :portkey.aws.cognito-sync/list-identity-pool-usage-response))

(clojure.core/defn describe-identity-pool-usage ([describe-identity-pool-usage-requestinput] (clojure.core/let [request-function-result__43533__auto__ (req-describe-identity-pool-usage-request describe-identity-pool-usage-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__43533__auto__ {:http.request.configuration/endpoints portkey.aws.cognito-sync/endpoints, :http.request.spec/output-spec :portkey.aws.cognito-sync/describe-identity-pool-usage-response, :http.request.configuration/mime-type {"content-type" "application/json"}, :http.request.configuration/request-uri "/identitypools/{IdentityPoolId}", :http.request.configuration/version "2014-06-30", :http.request.configuration/service-id nil, :http.request.spec/input-spec :portkey.aws.cognito-sync/describe-identity-pool-usage-request, :http.request.configuration/protocol "rest-json", :http.request.configuration/method :get, :http.request.configuration/response-code 200, :http.request.configuration/action "DescribeIdentityPoolUsage", :http.request.spec/error-spec {"NotAuthorizedException" :portkey.aws.cognito-sync/not-authorized-exception, "InvalidParameterException" :portkey.aws.cognito-sync/invalid-parameter-exception, "ResourceNotFoundException" :portkey.aws.cognito-sync/resource-not-found-exception, "InternalErrorException" :portkey.aws.cognito-sync/internal-error-exception, "TooManyRequestsException" :portkey.aws.cognito-sync/too-many-requests-exception}})))))
(clojure.spec.alpha/fdef describe-identity-pool-usage :args (clojure.spec.alpha/tuple :portkey.aws.cognito-sync/describe-identity-pool-usage-request) :ret (clojure.spec.alpha/and :portkey.aws.cognito-sync/describe-identity-pool-usage-response))

(clojure.core/defn unsubscribe-from-dataset ([unsubscribe-from-dataset-requestinput] (clojure.core/let [request-function-result__43533__auto__ (req-unsubscribe-from-dataset-request unsubscribe-from-dataset-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__43533__auto__ {:http.request.configuration/endpoints portkey.aws.cognito-sync/endpoints, :http.request.spec/output-spec :portkey.aws.cognito-sync/unsubscribe-from-dataset-response, :http.request.configuration/mime-type {"content-type" "application/json"}, :http.request.configuration/request-uri "/identitypools/{IdentityPoolId}/identities/{IdentityId}/datasets/{DatasetName}/subscriptions/{DeviceId}", :http.request.configuration/version "2014-06-30", :http.request.configuration/service-id nil, :http.request.spec/input-spec :portkey.aws.cognito-sync/unsubscribe-from-dataset-request, :http.request.configuration/protocol "rest-json", :http.request.configuration/method :delete, :http.request.configuration/response-code 200, :http.request.configuration/action "UnsubscribeFromDataset", :http.request.spec/error-spec {"NotAuthorizedException" :portkey.aws.cognito-sync/not-authorized-exception, "InvalidParameterException" :portkey.aws.cognito-sync/invalid-parameter-exception, "ResourceNotFoundException" :portkey.aws.cognito-sync/resource-not-found-exception, "InternalErrorException" :portkey.aws.cognito-sync/internal-error-exception, "InvalidConfigurationException" :portkey.aws.cognito-sync/invalid-configuration-exception, "TooManyRequestsException" :portkey.aws.cognito-sync/too-many-requests-exception}})))))
(clojure.spec.alpha/fdef unsubscribe-from-dataset :args (clojure.spec.alpha/tuple :portkey.aws.cognito-sync/unsubscribe-from-dataset-request) :ret (clojure.spec.alpha/and :portkey.aws.cognito-sync/unsubscribe-from-dataset-response))

(clojure.core/defn subscribe-to-dataset ([subscribe-to-dataset-requestinput] (clojure.core/let [request-function-result__43533__auto__ (req-subscribe-to-dataset-request subscribe-to-dataset-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__43533__auto__ {:http.request.configuration/endpoints portkey.aws.cognito-sync/endpoints, :http.request.spec/output-spec :portkey.aws.cognito-sync/subscribe-to-dataset-response, :http.request.configuration/mime-type {"content-type" "application/json"}, :http.request.configuration/request-uri "/identitypools/{IdentityPoolId}/identities/{IdentityId}/datasets/{DatasetName}/subscriptions/{DeviceId}", :http.request.configuration/version "2014-06-30", :http.request.configuration/service-id nil, :http.request.spec/input-spec :portkey.aws.cognito-sync/subscribe-to-dataset-request, :http.request.configuration/protocol "rest-json", :http.request.configuration/method :post, :http.request.configuration/response-code 200, :http.request.configuration/action "SubscribeToDataset", :http.request.spec/error-spec {"NotAuthorizedException" :portkey.aws.cognito-sync/not-authorized-exception, "InvalidParameterException" :portkey.aws.cognito-sync/invalid-parameter-exception, "ResourceNotFoundException" :portkey.aws.cognito-sync/resource-not-found-exception, "InternalErrorException" :portkey.aws.cognito-sync/internal-error-exception, "InvalidConfigurationException" :portkey.aws.cognito-sync/invalid-configuration-exception, "TooManyRequestsException" :portkey.aws.cognito-sync/too-many-requests-exception}})))))
(clojure.spec.alpha/fdef subscribe-to-dataset :args (clojure.spec.alpha/tuple :portkey.aws.cognito-sync/subscribe-to-dataset-request) :ret (clojure.spec.alpha/and :portkey.aws.cognito-sync/subscribe-to-dataset-response))

(clojure.core/defn get-identity-pool-configuration ([get-identity-pool-configuration-requestinput] (clojure.core/let [request-function-result__43533__auto__ (req-get-identity-pool-configuration-request get-identity-pool-configuration-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__43533__auto__ {:http.request.configuration/endpoints portkey.aws.cognito-sync/endpoints, :http.request.spec/output-spec :portkey.aws.cognito-sync/get-identity-pool-configuration-response, :http.request.configuration/mime-type {"content-type" "application/json"}, :http.request.configuration/request-uri "/identitypools/{IdentityPoolId}/configuration", :http.request.configuration/version "2014-06-30", :http.request.configuration/service-id nil, :http.request.spec/input-spec :portkey.aws.cognito-sync/get-identity-pool-configuration-request, :http.request.configuration/protocol "rest-json", :http.request.configuration/method :get, :http.request.configuration/response-code 200, :http.request.configuration/action "GetIdentityPoolConfiguration", :http.request.spec/error-spec {"NotAuthorizedException" :portkey.aws.cognito-sync/not-authorized-exception, "InvalidParameterException" :portkey.aws.cognito-sync/invalid-parameter-exception, "ResourceNotFoundException" :portkey.aws.cognito-sync/resource-not-found-exception, "InternalErrorException" :portkey.aws.cognito-sync/internal-error-exception, "TooManyRequestsException" :portkey.aws.cognito-sync/too-many-requests-exception}})))))
(clojure.spec.alpha/fdef get-identity-pool-configuration :args (clojure.spec.alpha/tuple :portkey.aws.cognito-sync/get-identity-pool-configuration-request) :ret (clojure.spec.alpha/and :portkey.aws.cognito-sync/get-identity-pool-configuration-response))

(clojure.core/defn set-cognito-events ([set-cognito-events-requestinput] (clojure.core/let [request-function-result__43533__auto__ (req-set-cognito-events-request set-cognito-events-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__43533__auto__ {:http.request.configuration/endpoints portkey.aws.cognito-sync/endpoints, :http.request.spec/output-spec nil, :http.request.configuration/mime-type {"content-type" "application/json"}, :http.request.configuration/request-uri "/identitypools/{IdentityPoolId}/events", :http.request.configuration/version "2014-06-30", :http.request.configuration/service-id nil, :http.request.spec/input-spec :portkey.aws.cognito-sync/set-cognito-events-request, :http.request.configuration/protocol "rest-json", :http.request.configuration/method :post, :http.request.configuration/response-code 200, :http.request.configuration/action "SetCognitoEvents", :http.request.spec/error-spec {"InvalidParameterException" :portkey.aws.cognito-sync/invalid-parameter-exception, "ResourceNotFoundException" :portkey.aws.cognito-sync/resource-not-found-exception, "NotAuthorizedException" :portkey.aws.cognito-sync/not-authorized-exception, "InternalErrorException" :portkey.aws.cognito-sync/internal-error-exception, "TooManyRequestsException" :portkey.aws.cognito-sync/too-many-requests-exception}})))))
(clojure.spec.alpha/fdef set-cognito-events :args (clojure.spec.alpha/tuple :portkey.aws.cognito-sync/set-cognito-events-request) :ret clojure.core/true?)

(clojure.core/defn set-identity-pool-configuration ([set-identity-pool-configuration-requestinput] (clojure.core/let [request-function-result__43533__auto__ (req-set-identity-pool-configuration-request set-identity-pool-configuration-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__43533__auto__ {:http.request.configuration/endpoints portkey.aws.cognito-sync/endpoints, :http.request.spec/output-spec :portkey.aws.cognito-sync/set-identity-pool-configuration-response, :http.request.configuration/mime-type {"content-type" "application/json"}, :http.request.configuration/request-uri "/identitypools/{IdentityPoolId}/configuration", :http.request.configuration/version "2014-06-30", :http.request.configuration/service-id nil, :http.request.spec/input-spec :portkey.aws.cognito-sync/set-identity-pool-configuration-request, :http.request.configuration/protocol "rest-json", :http.request.configuration/method :post, :http.request.configuration/response-code 200, :http.request.configuration/action "SetIdentityPoolConfiguration", :http.request.spec/error-spec {"NotAuthorizedException" :portkey.aws.cognito-sync/not-authorized-exception, "InvalidParameterException" :portkey.aws.cognito-sync/invalid-parameter-exception, "ResourceNotFoundException" :portkey.aws.cognito-sync/resource-not-found-exception, "InternalErrorException" :portkey.aws.cognito-sync/internal-error-exception, "TooManyRequestsException" :portkey.aws.cognito-sync/too-many-requests-exception, "ConcurrentModificationException" :portkey.aws.cognito-sync/concurrent-modification-exception}})))))
(clojure.spec.alpha/fdef set-identity-pool-configuration :args (clojure.spec.alpha/tuple :portkey.aws.cognito-sync/set-identity-pool-configuration-request) :ret (clojure.spec.alpha/and :portkey.aws.cognito-sync/set-identity-pool-configuration-response))

(clojure.core/defn register-device ([register-device-requestinput] (clojure.core/let [request-function-result__43533__auto__ (req-register-device-request register-device-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__43533__auto__ {:http.request.configuration/endpoints portkey.aws.cognito-sync/endpoints, :http.request.spec/output-spec :portkey.aws.cognito-sync/register-device-response, :http.request.configuration/mime-type {"content-type" "application/json"}, :http.request.configuration/request-uri "/identitypools/{IdentityPoolId}/identity/{IdentityId}/device", :http.request.configuration/version "2014-06-30", :http.request.configuration/service-id nil, :http.request.spec/input-spec :portkey.aws.cognito-sync/register-device-request, :http.request.configuration/protocol "rest-json", :http.request.configuration/method :post, :http.request.configuration/response-code 200, :http.request.configuration/action "RegisterDevice", :http.request.spec/error-spec {"NotAuthorizedException" :portkey.aws.cognito-sync/not-authorized-exception, "InvalidParameterException" :portkey.aws.cognito-sync/invalid-parameter-exception, "ResourceNotFoundException" :portkey.aws.cognito-sync/resource-not-found-exception, "InternalErrorException" :portkey.aws.cognito-sync/internal-error-exception, "InvalidConfigurationException" :portkey.aws.cognito-sync/invalid-configuration-exception, "TooManyRequestsException" :portkey.aws.cognito-sync/too-many-requests-exception}})))))
(clojure.spec.alpha/fdef register-device :args (clojure.spec.alpha/tuple :portkey.aws.cognito-sync/register-device-request) :ret (clojure.spec.alpha/and :portkey.aws.cognito-sync/register-device-response))

(clojure.core/defn update-records ([update-records-requestinput] (clojure.core/let [request-function-result__43533__auto__ (req-update-records-request update-records-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__43533__auto__ {:http.request.configuration/endpoints portkey.aws.cognito-sync/endpoints, :http.request.spec/output-spec :portkey.aws.cognito-sync/update-records-response, :http.request.configuration/mime-type {"content-type" "application/json"}, :http.request.configuration/request-uri "/identitypools/{IdentityPoolId}/identities/{IdentityId}/datasets/{DatasetName}", :http.request.configuration/version "2014-06-30", :http.request.configuration/service-id nil, :http.request.spec/input-spec :portkey.aws.cognito-sync/update-records-request, :http.request.configuration/protocol "rest-json", :http.request.configuration/method :post, :http.request.configuration/response-code 200, :http.request.configuration/action "UpdateRecords", :http.request.spec/error-spec {"LimitExceededException" :portkey.aws.cognito-sync/limit-exceeded-exception, "NotAuthorizedException" :portkey.aws.cognito-sync/not-authorized-exception, "TooManyRequestsException" :portkey.aws.cognito-sync/too-many-requests-exception, "InternalErrorException" :portkey.aws.cognito-sync/internal-error-exception, "ResourceNotFoundException" :portkey.aws.cognito-sync/resource-not-found-exception, "LambdaThrottledException" :portkey.aws.cognito-sync/lambda-throttled-exception, "ResourceConflictException" :portkey.aws.cognito-sync/resource-conflict-exception, "InvalidLambdaFunctionOutputException" :portkey.aws.cognito-sync/invalid-lambda-function-output-exception, "InvalidParameterException" :portkey.aws.cognito-sync/invalid-parameter-exception}})))))
(clojure.spec.alpha/fdef update-records :args (clojure.spec.alpha/tuple :portkey.aws.cognito-sync/update-records-request) :ret (clojure.spec.alpha/and :portkey.aws.cognito-sync/update-records-response))

(clojure.core/defn delete-dataset ([delete-dataset-requestinput] (clojure.core/let [request-function-result__43533__auto__ (req-delete-dataset-request delete-dataset-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__43533__auto__ {:http.request.configuration/endpoints portkey.aws.cognito-sync/endpoints, :http.request.spec/output-spec :portkey.aws.cognito-sync/delete-dataset-response, :http.request.configuration/mime-type {"content-type" "application/json"}, :http.request.configuration/request-uri "/identitypools/{IdentityPoolId}/identities/{IdentityId}/datasets/{DatasetName}", :http.request.configuration/version "2014-06-30", :http.request.configuration/service-id nil, :http.request.spec/input-spec :portkey.aws.cognito-sync/delete-dataset-request, :http.request.configuration/protocol "rest-json", :http.request.configuration/method :delete, :http.request.configuration/response-code 200, :http.request.configuration/action "DeleteDataset", :http.request.spec/error-spec {"NotAuthorizedException" :portkey.aws.cognito-sync/not-authorized-exception, "InvalidParameterException" :portkey.aws.cognito-sync/invalid-parameter-exception, "ResourceNotFoundException" :portkey.aws.cognito-sync/resource-not-found-exception, "InternalErrorException" :portkey.aws.cognito-sync/internal-error-exception, "TooManyRequestsException" :portkey.aws.cognito-sync/too-many-requests-exception, "ResourceConflictException" :portkey.aws.cognito-sync/resource-conflict-exception}})))))
(clojure.spec.alpha/fdef delete-dataset :args (clojure.spec.alpha/tuple :portkey.aws.cognito-sync/delete-dataset-request) :ret (clojure.spec.alpha/and :portkey.aws.cognito-sync/delete-dataset-response))

(clojure.core/defn bulk-publish ([bulk-publish-requestinput] (clojure.core/let [request-function-result__43533__auto__ (req-bulk-publish-request bulk-publish-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__43533__auto__ {:http.request.configuration/endpoints portkey.aws.cognito-sync/endpoints, :http.request.spec/output-spec :portkey.aws.cognito-sync/bulk-publish-response, :http.request.configuration/mime-type {"content-type" "application/json"}, :http.request.configuration/request-uri "/identitypools/{IdentityPoolId}/bulkpublish", :http.request.configuration/version "2014-06-30", :http.request.configuration/service-id nil, :http.request.spec/input-spec :portkey.aws.cognito-sync/bulk-publish-request, :http.request.configuration/protocol "rest-json", :http.request.configuration/method :post, :http.request.configuration/response-code 200, :http.request.configuration/action "BulkPublish", :http.request.spec/error-spec {"NotAuthorizedException" :portkey.aws.cognito-sync/not-authorized-exception, "InvalidParameterException" :portkey.aws.cognito-sync/invalid-parameter-exception, "ResourceNotFoundException" :portkey.aws.cognito-sync/resource-not-found-exception, "InternalErrorException" :portkey.aws.cognito-sync/internal-error-exception, "DuplicateRequestException" :portkey.aws.cognito-sync/duplicate-request-exception, "AlreadyStreamedException" :portkey.aws.cognito-sync/already-streamed-exception}})))))
(clojure.spec.alpha/fdef bulk-publish :args (clojure.spec.alpha/tuple :portkey.aws.cognito-sync/bulk-publish-request) :ret (clojure.spec.alpha/and :portkey.aws.cognito-sync/bulk-publish-response))
