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

(clojure.core/declare deser-record-key)

(clojure.core/declare deser-stream-name)

(clojure.core/declare deser-dataset)

(clojure.core/declare deser-assume-role-arn)

(clojure.core/declare deser-merged-dataset-name-list)

(clojure.core/declare deser-push-sync)

(clojure.core/declare deser-application-arn)

(clojure.core/declare deser-dataset-name)

(clojure.core/declare deser-cognito-streams)

(clojure.core/declare deser-cognito-event-type)

(clojure.core/declare deser-application-arn-list)

(clojure.core/declare deser-identity-pool-id)

(clojure.core/declare deser-events)

(clojure.core/declare deser-bulk-publish-status)

(clojure.core/declare deser-date)

(clojure.core/declare deser-identity-id)

(clojure.core/declare deser-streaming-status)

(clojure.core/declare deser-lambda-function-arn)

(clojure.core/declare deser-exception-message)

(clojure.core/declare deser-integer)

(clojure.core/declare deser-string)

(clojure.core/declare deser-record)

(clojure.core/declare deser-record-list)

(clojure.core/declare deser-device-id)

(clojure.core/declare deser-identity-pool-usage-list)

(clojure.core/declare deser-long)

(clojure.core/declare deser-record-value)

(clojure.core/declare deser-dataset-list)

(clojure.core/declare deser-identity-pool-usage)

(clojure.core/declare deser-identity-usage)

(clojure.core/declare deser-boolean)

(clojure.core/defn- deser-record-key [input] input)

(clojure.core/defn- deser-stream-name [input] input)

(clojure.core/defn- deser-dataset [input] (clojure.core/cond-> {} (clojure.core/contains? input "IdentityId") (clojure.core/assoc :identity-id (deser-identity-id (input "IdentityId"))) (clojure.core/contains? input "DatasetName") (clojure.core/assoc :dataset-name (deser-dataset-name (input "DatasetName"))) (clojure.core/contains? input "CreationDate") (clojure.core/assoc :creation-date (deser-date (input "CreationDate"))) (clojure.core/contains? input "LastModifiedDate") (clojure.core/assoc :last-modified-date (deser-date (input "LastModifiedDate"))) (clojure.core/contains? input "LastModifiedBy") (clojure.core/assoc :last-modified-by (deser-string (input "LastModifiedBy"))) (clojure.core/contains? input "DataStorage") (clojure.core/assoc :data-storage (deser-long (input "DataStorage"))) (clojure.core/contains? input "NumRecords") (clojure.core/assoc :num-records (deser-long (input "NumRecords")))))

(clojure.core/defn- deser-assume-role-arn [input] input)

(clojure.core/defn- deser-merged-dataset-name-list [input] (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (deser-string coll))) input))

(clojure.core/defn- deser-push-sync [input] (clojure.core/cond-> {} (clojure.core/contains? input "ApplicationArns") (clojure.core/assoc :application-arns (deser-application-arn-list (input "ApplicationArns"))) (clojure.core/contains? input "RoleArn") (clojure.core/assoc :role-arn (deser-assume-role-arn (input "RoleArn")))))

(clojure.core/defn- deser-application-arn [input] input)

(clojure.core/defn- deser-dataset-name [input] input)

(clojure.core/defn- deser-cognito-streams [input] (clojure.core/cond-> {} (clojure.core/contains? input "StreamName") (clojure.core/assoc :stream-name (deser-stream-name (input "StreamName"))) (clojure.core/contains? input "RoleArn") (clojure.core/assoc :role-arn (deser-assume-role-arn (input "RoleArn"))) (clojure.core/contains? input "StreamingStatus") (clojure.core/assoc :streaming-status (deser-streaming-status (input "StreamingStatus")))))

(clojure.core/defn- deser-cognito-event-type [input] input)

(clojure.core/defn- deser-application-arn-list [input] (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (deser-application-arn coll))) input))

(clojure.core/defn- deser-identity-pool-id [input] input)

(clojure.core/defn- deser-events [input] (clojure.core/into {} (clojure.core/map (clojure.core/fn [[k v]] [(deser-cognito-event-type k) (deser-lambda-function-arn v)])) input))

(clojure.core/defn- deser-bulk-publish-status [input] (clojure.core/get {"NOT_STARTED" :not-started, "IN_PROGRESS" :in-progress, "FAILED" :failed, "SUCCEEDED" :succeeded} input))

(clojure.core/defn- deser-date [input] input)

(clojure.core/defn- deser-identity-id [input] input)

(clojure.core/defn- deser-streaming-status [input] (clojure.core/get {"ENABLED" :enabled, "DISABLED" :disabled} input))

(clojure.core/defn- deser-lambda-function-arn [input] input)

(clojure.core/defn- deser-exception-message [input] input)

(clojure.core/defn- deser-integer [input] input)

(clojure.core/defn- deser-string [input] input)

(clojure.core/defn- deser-record [input] (clojure.core/cond-> {} (clojure.core/contains? input "Key") (clojure.core/assoc :key (deser-record-key (input "Key"))) (clojure.core/contains? input "Value") (clojure.core/assoc :value (deser-record-value (input "Value"))) (clojure.core/contains? input "SyncCount") (clojure.core/assoc :sync-count (deser-long (input "SyncCount"))) (clojure.core/contains? input "LastModifiedDate") (clojure.core/assoc :last-modified-date (deser-date (input "LastModifiedDate"))) (clojure.core/contains? input "LastModifiedBy") (clojure.core/assoc :last-modified-by (deser-string (input "LastModifiedBy"))) (clojure.core/contains? input "DeviceLastModifiedDate") (clojure.core/assoc :device-last-modified-date (deser-date (input "DeviceLastModifiedDate")))))

(clojure.core/defn- deser-record-list [input] (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (deser-record coll))) input))

(clojure.core/defn- deser-device-id [input] input)

(clojure.core/defn- deser-identity-pool-usage-list [input] (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (deser-identity-pool-usage coll))) input))

(clojure.core/defn- deser-long [input] input)

(clojure.core/defn- deser-record-value [input] input)

(clojure.core/defn- deser-dataset-list [input] (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (deser-dataset coll))) input))

(clojure.core/defn- deser-identity-pool-usage [input] (clojure.core/cond-> {} (clojure.core/contains? input "IdentityPoolId") (clojure.core/assoc :identity-pool-id (deser-identity-pool-id (input "IdentityPoolId"))) (clojure.core/contains? input "SyncSessionsCount") (clojure.core/assoc :sync-sessions-count (deser-long (input "SyncSessionsCount"))) (clojure.core/contains? input "DataStorage") (clojure.core/assoc :data-storage (deser-long (input "DataStorage"))) (clojure.core/contains? input "LastModifiedDate") (clojure.core/assoc :last-modified-date (deser-date (input "LastModifiedDate")))))

(clojure.core/defn- deser-identity-usage [input] (clojure.core/cond-> {} (clojure.core/contains? input "IdentityId") (clojure.core/assoc :identity-id (deser-identity-id (input "IdentityId"))) (clojure.core/contains? input "IdentityPoolId") (clojure.core/assoc :identity-pool-id (deser-identity-pool-id (input "IdentityPoolId"))) (clojure.core/contains? input "LastModifiedDate") (clojure.core/assoc :last-modified-date (deser-date (input "LastModifiedDate"))) (clojure.core/contains? input "DatasetCount") (clojure.core/assoc :dataset-count (deser-integer (input "DatasetCount"))) (clojure.core/contains? input "DataStorage") (clojure.core/assoc :data-storage (deser-long (input "DataStorage")))))

(clojure.core/defn- deser-boolean [input] input)

(clojure.core/defn- response-duplicate-request-exception ([input] (response-duplicate-request-exception nil input)) ([resultWrapper120881 input] (clojure.core/let [rawinput120880 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar120882 {"message" (rawinput120880 "message")}] (clojure.core/cond-> {:message (deser-exception-message (clojure.core/get-in letvar120882 ["message"]))}))))

(clojure.core/defn- response-describe-identity-pool-usage-response ([input] (response-describe-identity-pool-usage-response nil input)) ([resultWrapper120884 input] (clojure.core/let [rawinput120883 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar120885 {"IdentityPoolUsage" (rawinput120883 "IdentityPoolUsage")}] (clojure.core/cond-> {} (letvar120885 "IdentityPoolUsage") (clojure.core/assoc :identity-pool-usage (deser-identity-pool-usage (clojure.core/get-in letvar120885 ["IdentityPoolUsage"])))))))

(clojure.core/defn- response-describe-identity-usage-response ([input] (response-describe-identity-usage-response nil input)) ([resultWrapper120887 input] (clojure.core/let [rawinput120886 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar120888 {"IdentityUsage" (rawinput120886 "IdentityUsage")}] (clojure.core/cond-> {} (letvar120888 "IdentityUsage") (clojure.core/assoc :identity-usage (deser-identity-usage (clojure.core/get-in letvar120888 ["IdentityUsage"])))))))

(clojure.core/defn- response-unsubscribe-from-dataset-response ([input] (response-unsubscribe-from-dataset-response nil input)) ([resultWrapper120890 input] (clojure.core/let [rawinput120889 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar120891 {}] (clojure.core/cond-> {}))))

(clojure.core/defn- response-set-identity-pool-configuration-response ([input] (response-set-identity-pool-configuration-response nil input)) ([resultWrapper120893 input] (clojure.core/let [rawinput120892 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar120894 {"IdentityPoolId" (rawinput120892 "IdentityPoolId"), "PushSync" (rawinput120892 "PushSync"), "CognitoStreams" (rawinput120892 "CognitoStreams")}] (clojure.core/cond-> {} (letvar120894 "IdentityPoolId") (clojure.core/assoc :identity-pool-id (deser-identity-pool-id (clojure.core/get-in letvar120894 ["IdentityPoolId"]))) (letvar120894 "PushSync") (clojure.core/assoc :push-sync (deser-push-sync (clojure.core/get-in letvar120894 ["PushSync"]))) (letvar120894 "CognitoStreams") (clojure.core/assoc :cognito-streams (deser-cognito-streams (clojure.core/get-in letvar120894 ["CognitoStreams"])))))))

(clojure.core/defn- response-limit-exceeded-exception ([input] (response-limit-exceeded-exception nil input)) ([resultWrapper120896 input] (clojure.core/let [rawinput120895 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar120897 {"message" (rawinput120895 "message")}] (clojure.core/cond-> {:message (deser-exception-message (clojure.core/get-in letvar120897 ["message"]))}))))

(clojure.core/defn- response-already-streamed-exception ([input] (response-already-streamed-exception nil input)) ([resultWrapper120899 input] (clojure.core/let [rawinput120898 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar120900 {"message" (rawinput120898 "message")}] (clojure.core/cond-> {:message (deser-exception-message (clojure.core/get-in letvar120900 ["message"]))}))))

(clojure.core/defn- response-not-authorized-exception ([input] (response-not-authorized-exception nil input)) ([resultWrapper120902 input] (clojure.core/let [rawinput120901 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar120903 {"message" (rawinput120901 "message")}] (clojure.core/cond-> {:message (deser-exception-message (clojure.core/get-in letvar120903 ["message"]))}))))

(clojure.core/defn- response-update-records-response ([input] (response-update-records-response nil input)) ([resultWrapper120905 input] (clojure.core/let [rawinput120904 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar120906 {"Records" (rawinput120904 "Records")}] (clojure.core/cond-> {} (letvar120906 "Records") (clojure.core/assoc :records (deser-record-list (clojure.core/get-in letvar120906 ["Records"])))))))

(clojure.core/defn- response-delete-dataset-response ([input] (response-delete-dataset-response nil input)) ([resultWrapper120908 input] (clojure.core/let [rawinput120907 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar120909 {"Dataset" (rawinput120907 "Dataset")}] (clojure.core/cond-> {} (letvar120909 "Dataset") (clojure.core/assoc :dataset (deser-dataset (clojure.core/get-in letvar120909 ["Dataset"])))))))

(clojure.core/defn- response-get-bulk-publish-details-response ([input] (response-get-bulk-publish-details-response nil input)) ([resultWrapper120911 input] (clojure.core/let [rawinput120910 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar120912 {"IdentityPoolId" (rawinput120910 "IdentityPoolId"), "BulkPublishStartTime" (rawinput120910 "BulkPublishStartTime"), "BulkPublishCompleteTime" (rawinput120910 "BulkPublishCompleteTime"), "BulkPublishStatus" (rawinput120910 "BulkPublishStatus"), "FailureMessage" (rawinput120910 "FailureMessage")}] (clojure.core/cond-> {} (letvar120912 "IdentityPoolId") (clojure.core/assoc :identity-pool-id (deser-identity-pool-id (clojure.core/get-in letvar120912 ["IdentityPoolId"]))) (letvar120912 "BulkPublishStartTime") (clojure.core/assoc :bulk-publish-start-time (deser-date (clojure.core/get-in letvar120912 ["BulkPublishStartTime"]))) (letvar120912 "BulkPublishCompleteTime") (clojure.core/assoc :bulk-publish-complete-time (deser-date (clojure.core/get-in letvar120912 ["BulkPublishCompleteTime"]))) (letvar120912 "BulkPublishStatus") (clojure.core/assoc :bulk-publish-status (deser-bulk-publish-status (clojure.core/get-in letvar120912 ["BulkPublishStatus"]))) (letvar120912 "FailureMessage") (clojure.core/assoc :failure-message (deser-string (clojure.core/get-in letvar120912 ["FailureMessage"])))))))

(clojure.core/defn- response-too-many-requests-exception ([input] (response-too-many-requests-exception nil input)) ([resultWrapper120914 input] (clojure.core/let [rawinput120913 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar120915 {"message" (rawinput120913 "message")}] (clojure.core/cond-> {:message (deser-exception-message (clojure.core/get-in letvar120915 ["message"]))}))))

(clojure.core/defn- response-internal-error-exception ([input] (response-internal-error-exception nil input)) ([resultWrapper120917 input] (clojure.core/let [rawinput120916 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar120918 {"message" (rawinput120916 "message")}] (clojure.core/cond-> {:message (deser-exception-message (clojure.core/get-in letvar120918 ["message"]))}))))

(clojure.core/defn- response-resource-not-found-exception ([input] (response-resource-not-found-exception nil input)) ([resultWrapper120920 input] (clojure.core/let [rawinput120919 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar120921 {"message" (rawinput120919 "message")}] (clojure.core/cond-> {:message (deser-exception-message (clojure.core/get-in letvar120921 ["message"]))}))))

(clojure.core/defn- response-get-cognito-events-response ([input] (response-get-cognito-events-response nil input)) ([resultWrapper120923 input] (clojure.core/let [rawinput120922 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar120924 {"Events" (rawinput120922 "Events")}] (clojure.core/cond-> {} (letvar120924 "Events") (clojure.core/assoc :events (deser-events (clojure.core/get-in letvar120924 ["Events"])))))))

(clojure.core/defn- response-lambda-throttled-exception ([input] (response-lambda-throttled-exception nil input)) ([resultWrapper120926 input] (clojure.core/let [rawinput120925 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar120927 {"message" (rawinput120925 "message")}] (clojure.core/cond-> {:message (deser-exception-message (clojure.core/get-in letvar120927 ["message"]))}))))

(clojure.core/defn- response-describe-dataset-response ([input] (response-describe-dataset-response nil input)) ([resultWrapper120929 input] (clojure.core/let [rawinput120928 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar120930 {"Dataset" (rawinput120928 "Dataset")}] (clojure.core/cond-> {} (letvar120930 "Dataset") (clojure.core/assoc :dataset (deser-dataset (clojure.core/get-in letvar120930 ["Dataset"])))))))

(clojure.core/defn- response-resource-conflict-exception ([input] (response-resource-conflict-exception nil input)) ([resultWrapper120932 input] (clojure.core/let [rawinput120931 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar120933 {"message" (rawinput120931 "message")}] (clojure.core/cond-> {:message (deser-exception-message (clojure.core/get-in letvar120933 ["message"]))}))))

(clojure.core/defn- response-invalid-lambda-function-output-exception ([input] (response-invalid-lambda-function-output-exception nil input)) ([resultWrapper120935 input] (clojure.core/let [rawinput120934 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar120936 {"message" (rawinput120934 "message")}] (clojure.core/cond-> {:message (deser-exception-message (clojure.core/get-in letvar120936 ["message"]))}))))

(clojure.core/defn- response-get-identity-pool-configuration-response ([input] (response-get-identity-pool-configuration-response nil input)) ([resultWrapper120938 input] (clojure.core/let [rawinput120937 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar120939 {"IdentityPoolId" (rawinput120937 "IdentityPoolId"), "PushSync" (rawinput120937 "PushSync"), "CognitoStreams" (rawinput120937 "CognitoStreams")}] (clojure.core/cond-> {} (letvar120939 "IdentityPoolId") (clojure.core/assoc :identity-pool-id (deser-identity-pool-id (clojure.core/get-in letvar120939 ["IdentityPoolId"]))) (letvar120939 "PushSync") (clojure.core/assoc :push-sync (deser-push-sync (clojure.core/get-in letvar120939 ["PushSync"]))) (letvar120939 "CognitoStreams") (clojure.core/assoc :cognito-streams (deser-cognito-streams (clojure.core/get-in letvar120939 ["CognitoStreams"])))))))

(clojure.core/defn- response-list-records-response ([input] (response-list-records-response nil input)) ([resultWrapper120941 input] (clojure.core/let [rawinput120940 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar120942 {"SyncSessionToken" (rawinput120940 "SyncSessionToken"), "DatasetSyncCount" (rawinput120940 "DatasetSyncCount"), "Count" (rawinput120940 "Count"), "NextToken" (rawinput120940 "NextToken"), "DatasetExists" (rawinput120940 "DatasetExists"), "DatasetDeletedAfterRequestedSyncCount" (rawinput120940 "DatasetDeletedAfterRequestedSyncCount"), "MergedDatasetNames" (rawinput120940 "MergedDatasetNames"), "Records" (rawinput120940 "Records"), "LastModifiedBy" (rawinput120940 "LastModifiedBy")}] (clojure.core/cond-> {} (letvar120942 "SyncSessionToken") (clojure.core/assoc :sync-session-token (deser-string (clojure.core/get-in letvar120942 ["SyncSessionToken"]))) (letvar120942 "DatasetSyncCount") (clojure.core/assoc :dataset-sync-count (deser-long (clojure.core/get-in letvar120942 ["DatasetSyncCount"]))) (letvar120942 "Count") (clojure.core/assoc :count (deser-integer (clojure.core/get-in letvar120942 ["Count"]))) (letvar120942 "NextToken") (clojure.core/assoc :next-token (deser-string (clojure.core/get-in letvar120942 ["NextToken"]))) (letvar120942 "DatasetExists") (clojure.core/assoc :dataset-exists (deser-boolean (clojure.core/get-in letvar120942 ["DatasetExists"]))) (letvar120942 "DatasetDeletedAfterRequestedSyncCount") (clojure.core/assoc :dataset-deleted-after-requested-sync-count (deser-boolean (clojure.core/get-in letvar120942 ["DatasetDeletedAfterRequestedSyncCount"]))) (letvar120942 "MergedDatasetNames") (clojure.core/assoc :merged-dataset-names (deser-merged-dataset-name-list (clojure.core/get-in letvar120942 ["MergedDatasetNames"]))) (letvar120942 "Records") (clojure.core/assoc :records (deser-record-list (clojure.core/get-in letvar120942 ["Records"]))) (letvar120942 "LastModifiedBy") (clojure.core/assoc :last-modified-by (deser-string (clojure.core/get-in letvar120942 ["LastModifiedBy"])))))))

(clojure.core/defn- response-subscribe-to-dataset-response ([input] (response-subscribe-to-dataset-response nil input)) ([resultWrapper120944 input] (clojure.core/let [rawinput120943 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar120945 {}] (clojure.core/cond-> {}))))

(clojure.core/defn- response-bulk-publish-response ([input] (response-bulk-publish-response nil input)) ([resultWrapper120947 input] (clojure.core/let [rawinput120946 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar120948 {"IdentityPoolId" (rawinput120946 "IdentityPoolId")}] (clojure.core/cond-> {} (letvar120948 "IdentityPoolId") (clojure.core/assoc :identity-pool-id (deser-identity-pool-id (clojure.core/get-in letvar120948 ["IdentityPoolId"])))))))

(clojure.core/defn- response-concurrent-modification-exception ([input] (response-concurrent-modification-exception nil input)) ([resultWrapper120950 input] (clojure.core/let [rawinput120949 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar120951 {"message" (rawinput120949 "message")}] (clojure.core/cond-> {:message (deser-string (clojure.core/get-in letvar120951 ["message"]))}))))

(clojure.core/defn- response-list-identity-pool-usage-response ([input] (response-list-identity-pool-usage-response nil input)) ([resultWrapper120953 input] (clojure.core/let [rawinput120952 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar120954 {"IdentityPoolUsages" (rawinput120952 "IdentityPoolUsages"), "MaxResults" (rawinput120952 "MaxResults"), "Count" (rawinput120952 "Count"), "NextToken" (rawinput120952 "NextToken")}] (clojure.core/cond-> {} (letvar120954 "IdentityPoolUsages") (clojure.core/assoc :identity-pool-usages (deser-identity-pool-usage-list (clojure.core/get-in letvar120954 ["IdentityPoolUsages"]))) (letvar120954 "MaxResults") (clojure.core/assoc :max-results (deser-integer (clojure.core/get-in letvar120954 ["MaxResults"]))) (letvar120954 "Count") (clojure.core/assoc :count (deser-integer (clojure.core/get-in letvar120954 ["Count"]))) (letvar120954 "NextToken") (clojure.core/assoc :next-token (deser-string (clojure.core/get-in letvar120954 ["NextToken"])))))))

(clojure.core/defn- response-invalid-parameter-exception ([input] (response-invalid-parameter-exception nil input)) ([resultWrapper120956 input] (clojure.core/let [rawinput120955 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar120957 {"message" (rawinput120955 "message")}] (clojure.core/cond-> {:message (deser-exception-message (clojure.core/get-in letvar120957 ["message"]))}))))

(clojure.core/defn- response-register-device-response ([input] (response-register-device-response nil input)) ([resultWrapper120959 input] (clojure.core/let [rawinput120958 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar120960 {"DeviceId" (rawinput120958 "DeviceId")}] (clojure.core/cond-> {} (letvar120960 "DeviceId") (clojure.core/assoc :device-id (deser-device-id (clojure.core/get-in letvar120960 ["DeviceId"])))))))

(clojure.core/defn- response-list-datasets-response ([input] (response-list-datasets-response nil input)) ([resultWrapper120962 input] (clojure.core/let [rawinput120961 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar120963 {"Datasets" (rawinput120961 "Datasets"), "Count" (rawinput120961 "Count"), "NextToken" (rawinput120961 "NextToken")}] (clojure.core/cond-> {} (letvar120963 "Datasets") (clojure.core/assoc :datasets (deser-dataset-list (clojure.core/get-in letvar120963 ["Datasets"]))) (letvar120963 "Count") (clojure.core/assoc :count (deser-integer (clojure.core/get-in letvar120963 ["Count"]))) (letvar120963 "NextToken") (clojure.core/assoc :next-token (deser-string (clojure.core/get-in letvar120963 ["NextToken"])))))))

(clojure.core/defn- response-invalid-configuration-exception ([input] (response-invalid-configuration-exception nil input)) ([resultWrapper120965 input] (clojure.core/let [rawinput120964 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar120966 {"message" (rawinput120964 "message")}] (clojure.core/cond-> {:message (deser-exception-message (clojure.core/get-in letvar120966 ["message"]))}))))

(clojure.spec.alpha/def :portkey.aws.cognito-sync.register-device-request/token (clojure.spec.alpha/and :portkey.aws.cognito-sync/push-token))
(clojure.spec.alpha/def :portkey.aws.cognito-sync/register-device-request (clojure.spec.alpha/keys :req-un [:portkey.aws.cognito-sync/identity-pool-id :portkey.aws.cognito-sync/identity-id :portkey.aws.cognito-sync/platform :portkey.aws.cognito-sync.register-device-request/token] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.cognito-sync/record-key (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__21110__auto__] (clojure.core/<= 1 (clojure.core/count s__21110__auto__))) (clojure.core/fn [s__21111__auto__] (clojure.core/< (clojure.core/count s__21111__auto__) 1024))))

(clojure.spec.alpha/def :portkey.aws.cognito-sync.duplicate-request-exception/message (clojure.spec.alpha/and :portkey.aws.cognito-sync/exception-message))
(clojure.spec.alpha/def :portkey.aws.cognito-sync/duplicate-request-exception (clojure.spec.alpha/keys :req-un [:portkey.aws.cognito-sync.duplicate-request-exception/message] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.cognito-sync/stream-name (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__21110__auto__] (clojure.core/<= 1 (clojure.core/count s__21110__auto__))) (clojure.core/fn [s__21111__auto__] (clojure.core/< (clojure.core/count s__21111__auto__) 128))))

(clojure.spec.alpha/def :portkey.aws.cognito-sync.dataset/creation-date (clojure.spec.alpha/and :portkey.aws.cognito-sync/date))
(clojure.spec.alpha/def :portkey.aws.cognito-sync.dataset/last-modified-date (clojure.spec.alpha/and :portkey.aws.cognito-sync/date))
(clojure.spec.alpha/def :portkey.aws.cognito-sync.dataset/last-modified-by (clojure.spec.alpha/and :portkey.aws.cognito-sync/string))
(clojure.spec.alpha/def :portkey.aws.cognito-sync.dataset/data-storage (clojure.spec.alpha/and :portkey.aws.cognito-sync/long))
(clojure.spec.alpha/def :portkey.aws.cognito-sync.dataset/num-records (clojure.spec.alpha/and :portkey.aws.cognito-sync/long))
(clojure.spec.alpha/def :portkey.aws.cognito-sync/dataset (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.cognito-sync/identity-id :portkey.aws.cognito-sync/dataset-name :portkey.aws.cognito-sync.dataset/creation-date :portkey.aws.cognito-sync.dataset/last-modified-date :portkey.aws.cognito-sync.dataset/last-modified-by :portkey.aws.cognito-sync.dataset/data-storage :portkey.aws.cognito-sync.dataset/num-records]))

(clojure.spec.alpha/def :portkey.aws.cognito-sync/assume-role-arn (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__21110__auto__] (clojure.core/<= 20 (clojure.core/count s__21110__auto__))) (clojure.core/fn [s__21111__auto__] (clojure.core/< (clojure.core/count s__21111__auto__) 2048)) (clojure.core/fn [s__21112__auto__] (clojure.core/re-matches #"arn:aws:iam::\d+:role/.*" s__21112__auto__))))

(clojure.spec.alpha/def :portkey.aws.cognito-sync/platform #{"ADM" "GCM" "APNS" :apns-sandbox :gcm :adm "APNS_SANDBOX" :apns})

(clojure.spec.alpha/def :portkey.aws.cognito-sync/merged-dataset-name-list (clojure.spec.alpha/coll-of :portkey.aws.cognito-sync/string))

(clojure.spec.alpha/def :portkey.aws.cognito-sync/describe-identity-pool-usage-response (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.cognito-sync/identity-pool-usage]))

(clojure.spec.alpha/def :portkey.aws.cognito-sync.push-sync/application-arns (clojure.spec.alpha/and :portkey.aws.cognito-sync/application-arn-list))
(clojure.spec.alpha/def :portkey.aws.cognito-sync.push-sync/role-arn (clojure.spec.alpha/and :portkey.aws.cognito-sync/assume-role-arn))
(clojure.spec.alpha/def :portkey.aws.cognito-sync/push-sync (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.cognito-sync.push-sync/application-arns :portkey.aws.cognito-sync.push-sync/role-arn]))

(clojure.spec.alpha/def :portkey.aws.cognito-sync/describe-identity-usage-response (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.cognito-sync/identity-usage]))

(clojure.spec.alpha/def :portkey.aws.cognito-sync/subscribe-to-dataset-request (clojure.spec.alpha/keys :req-un [:portkey.aws.cognito-sync/identity-pool-id :portkey.aws.cognito-sync/identity-id :portkey.aws.cognito-sync/dataset-name :portkey.aws.cognito-sync/device-id] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.cognito-sync/unsubscribe-from-dataset-response (clojure.spec.alpha/keys :req-un [] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.cognito-sync/application-arn (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__21112__auto__] (clojure.core/re-matches #"arn:aws:sns:[-0-9a-z]+:\d+:app/[A-Z_]+/[a-zA-Z0-9_.-]+" s__21112__auto__))))

(clojure.spec.alpha/def :portkey.aws.cognito-sync/sync-session-token (clojure.spec.alpha/and clojure.core/string?))

(clojure.spec.alpha/def :portkey.aws.cognito-sync/dataset-name (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__21110__auto__] (clojure.core/<= 1 (clojure.core/count s__21110__auto__))) (clojure.core/fn [s__21111__auto__] (clojure.core/< (clojure.core/count s__21111__auto__) 128)) (clojure.core/fn [s__21112__auto__] (clojure.core/re-matches #"[a-zA-Z0-9_.:-]+" s__21112__auto__))))

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

(clojure.spec.alpha/def :portkey.aws.cognito-sync/identity-pool-id (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__21110__auto__] (clojure.core/<= 1 (clojure.core/count s__21110__auto__))) (clojure.core/fn [s__21111__auto__] (clojure.core/< (clojure.core/count s__21111__auto__) 55)) (clojure.core/fn [s__21112__auto__] (clojure.core/re-matches #"[\w-]+:[0-9a-f-]+" s__21112__auto__))))

(clojure.spec.alpha/def :portkey.aws.cognito-sync/events (clojure.spec.alpha/map-of :portkey.aws.cognito-sync/cognito-event-type :portkey.aws.cognito-sync/lambda-function-arn))

(clojure.spec.alpha/def :portkey.aws.cognito-sync/describe-identity-pool-usage-request (clojure.spec.alpha/keys :req-un [:portkey.aws.cognito-sync/identity-pool-id] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.cognito-sync.update-records-response/records (clojure.spec.alpha/and :portkey.aws.cognito-sync/record-list))
(clojure.spec.alpha/def :portkey.aws.cognito-sync/update-records-response (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.cognito-sync.update-records-response/records]))

(clojure.spec.alpha/def :portkey.aws.cognito-sync/delete-dataset-response (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.cognito-sync/dataset]))

(clojure.spec.alpha/def :portkey.aws.cognito-sync/bulk-publish-status #{"IN_PROGRESS" :in-progress "NOT_STARTED" "SUCCEEDED" "FAILED" :not-started :failed :succeeded})

(clojure.spec.alpha/def :portkey.aws.cognito-sync/date clojure.core/inst?)

(clojure.spec.alpha/def :portkey.aws.cognito-sync/identity-id (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__21110__auto__] (clojure.core/<= 1 (clojure.core/count s__21110__auto__))) (clojure.core/fn [s__21111__auto__] (clojure.core/< (clojure.core/count s__21111__auto__) 55)) (clojure.core/fn [s__21112__auto__] (clojure.core/re-matches #"[\w-]+:[0-9a-f-]+" s__21112__auto__))))

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

(clojure.spec.alpha/def :portkey.aws.cognito-sync/device-id (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__21110__auto__] (clojure.core/<= 1 (clojure.core/count s__21110__auto__))) (clojure.core/fn [s__21111__auto__] (clojure.core/< (clojure.core/count s__21111__auto__) 256))))

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

(clojure.spec.alpha/def :portkey.aws.cognito-sync/record-value (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__21111__auto__] (clojure.core/< (clojure.core/count s__21111__auto__) 1048575))))

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

(clojure.core/defn list-records "Gets paginated records, optionally changed after a particular sync count for a\ndataset and identity. With Amazon Cognito Sync, each identity has access only to\nits own data. Thus, the credentials used to make this API call need to have\naccess to the identity data.\n ListRecords can be called with temporary user credentials provided by Cognito\nIdentity or with developer credentials. You should use Cognito Identity\ncredentials to make this API call." ([list-records-requestinput] (clojure.core/let [request-function-result__22153__auto__ (req-list-records-request list-records-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__22153__auto__ {:http.request.configuration/endpoints portkey.aws.cognito-sync/endpoints, :http.request.configuration/target-prefix nil, :http.request.spec/output-spec :portkey.aws.cognito-sync/list-records-response, :http.request.configuration/mime-type {"content-type" "application/json"}, :http.request.configuration/request-uri "/identitypools/{IdentityPoolId}/identities/{IdentityId}/datasets/{DatasetName}/records", :http.request.configuration/version "2014-06-30", :http.request.configuration/service-id nil, :http.request.spec/input-spec :portkey.aws.cognito-sync/list-records-request, :http.request.configuration/protocol "rest-json", :http.request.configuration/method :get, :http.request.configuration/response-code 200, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "ListRecords", :http.request.configuration/output-deser-fn response-list-records-response, :http.request.spec/error-spec {"InvalidParameterException" :portkey.aws.cognito-sync/invalid-parameter-exception, "NotAuthorizedException" :portkey.aws.cognito-sync/not-authorized-exception, "TooManyRequestsException" :portkey.aws.cognito-sync/too-many-requests-exception, "InternalErrorException" :portkey.aws.cognito-sync/internal-error-exception}})))))
(clojure.spec.alpha/fdef list-records :args (clojure.spec.alpha/tuple :portkey.aws.cognito-sync/list-records-request) :ret (clojure.spec.alpha/and :portkey.aws.cognito-sync/list-records-response))

(clojure.core/defn describe-dataset "Gets meta data about a dataset by identity and dataset name. With Amazon Cognito\nSync, each identity has access only to its own data. Thus, the credentials used\nto make this API call need to have access to the identity data.\n This API can be called with temporary user credentials provided by Cognito\nIdentity or with developer credentials. You should use Cognito Identity\ncredentials to make this API call." ([describe-dataset-requestinput] (clojure.core/let [request-function-result__22153__auto__ (req-describe-dataset-request describe-dataset-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__22153__auto__ {:http.request.configuration/endpoints portkey.aws.cognito-sync/endpoints, :http.request.configuration/target-prefix nil, :http.request.spec/output-spec :portkey.aws.cognito-sync/describe-dataset-response, :http.request.configuration/mime-type {"content-type" "application/json"}, :http.request.configuration/request-uri "/identitypools/{IdentityPoolId}/identities/{IdentityId}/datasets/{DatasetName}", :http.request.configuration/version "2014-06-30", :http.request.configuration/service-id nil, :http.request.spec/input-spec :portkey.aws.cognito-sync/describe-dataset-request, :http.request.configuration/protocol "rest-json", :http.request.configuration/method :get, :http.request.configuration/response-code 200, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "DescribeDataset", :http.request.configuration/output-deser-fn response-describe-dataset-response, :http.request.spec/error-spec {"NotAuthorizedException" :portkey.aws.cognito-sync/not-authorized-exception, "InvalidParameterException" :portkey.aws.cognito-sync/invalid-parameter-exception, "ResourceNotFoundException" :portkey.aws.cognito-sync/resource-not-found-exception, "InternalErrorException" :portkey.aws.cognito-sync/internal-error-exception, "TooManyRequestsException" :portkey.aws.cognito-sync/too-many-requests-exception}})))))
(clojure.spec.alpha/fdef describe-dataset :args (clojure.spec.alpha/tuple :portkey.aws.cognito-sync/describe-dataset-request) :ret (clojure.spec.alpha/and :portkey.aws.cognito-sync/describe-dataset-response))

(clojure.core/defn get-bulk-publish-details "Get the status of the last BulkPublish operation for an identity pool.\n This API can only be called with developer credentials. You cannot call this\nAPI with the temporary user credentials provided by Cognito Identity." ([get-bulk-publish-details-requestinput] (clojure.core/let [request-function-result__22153__auto__ (req-get-bulk-publish-details-request get-bulk-publish-details-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__22153__auto__ {:http.request.configuration/endpoints portkey.aws.cognito-sync/endpoints, :http.request.configuration/target-prefix nil, :http.request.spec/output-spec :portkey.aws.cognito-sync/get-bulk-publish-details-response, :http.request.configuration/mime-type {"content-type" "application/json"}, :http.request.configuration/request-uri "/identitypools/{IdentityPoolId}/getBulkPublishDetails", :http.request.configuration/version "2014-06-30", :http.request.configuration/service-id nil, :http.request.spec/input-spec :portkey.aws.cognito-sync/get-bulk-publish-details-request, :http.request.configuration/protocol "rest-json", :http.request.configuration/method :post, :http.request.configuration/response-code 200, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "GetBulkPublishDetails", :http.request.configuration/output-deser-fn response-get-bulk-publish-details-response, :http.request.spec/error-spec {"NotAuthorizedException" :portkey.aws.cognito-sync/not-authorized-exception, "InvalidParameterException" :portkey.aws.cognito-sync/invalid-parameter-exception, "ResourceNotFoundException" :portkey.aws.cognito-sync/resource-not-found-exception, "InternalErrorException" :portkey.aws.cognito-sync/internal-error-exception}})))))
(clojure.spec.alpha/fdef get-bulk-publish-details :args (clojure.spec.alpha/tuple :portkey.aws.cognito-sync/get-bulk-publish-details-request) :ret (clojure.spec.alpha/and :portkey.aws.cognito-sync/get-bulk-publish-details-response))

(clojure.core/defn describe-identity-usage "Gets usage information for an identity, including number of datasets and data\nusage.\n This API can be called with temporary user credentials provided by Cognito\nIdentity or with developer credentials." ([describe-identity-usage-requestinput] (clojure.core/let [request-function-result__22153__auto__ (req-describe-identity-usage-request describe-identity-usage-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__22153__auto__ {:http.request.configuration/endpoints portkey.aws.cognito-sync/endpoints, :http.request.configuration/target-prefix nil, :http.request.spec/output-spec :portkey.aws.cognito-sync/describe-identity-usage-response, :http.request.configuration/mime-type {"content-type" "application/json"}, :http.request.configuration/request-uri "/identitypools/{IdentityPoolId}/identities/{IdentityId}", :http.request.configuration/version "2014-06-30", :http.request.configuration/service-id nil, :http.request.spec/input-spec :portkey.aws.cognito-sync/describe-identity-usage-request, :http.request.configuration/protocol "rest-json", :http.request.configuration/method :get, :http.request.configuration/response-code 200, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "DescribeIdentityUsage", :http.request.configuration/output-deser-fn response-describe-identity-usage-response, :http.request.spec/error-spec {"NotAuthorizedException" :portkey.aws.cognito-sync/not-authorized-exception, "InvalidParameterException" :portkey.aws.cognito-sync/invalid-parameter-exception, "ResourceNotFoundException" :portkey.aws.cognito-sync/resource-not-found-exception, "InternalErrorException" :portkey.aws.cognito-sync/internal-error-exception, "TooManyRequestsException" :portkey.aws.cognito-sync/too-many-requests-exception}})))))
(clojure.spec.alpha/fdef describe-identity-usage :args (clojure.spec.alpha/tuple :portkey.aws.cognito-sync/describe-identity-usage-request) :ret (clojure.spec.alpha/and :portkey.aws.cognito-sync/describe-identity-usage-response))

(clojure.core/defn get-cognito-events "Gets the events and the corresponding Lambda functions associated with an\nidentity pool.\n This API can only be called with developer credentials. You cannot call this\nAPI with the temporary user credentials provided by Cognito Identity." ([get-cognito-events-requestinput] (clojure.core/let [request-function-result__22153__auto__ (req-get-cognito-events-request get-cognito-events-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__22153__auto__ {:http.request.configuration/endpoints portkey.aws.cognito-sync/endpoints, :http.request.configuration/target-prefix nil, :http.request.spec/output-spec :portkey.aws.cognito-sync/get-cognito-events-response, :http.request.configuration/mime-type {"content-type" "application/json"}, :http.request.configuration/request-uri "/identitypools/{IdentityPoolId}/events", :http.request.configuration/version "2014-06-30", :http.request.configuration/service-id nil, :http.request.spec/input-spec :portkey.aws.cognito-sync/get-cognito-events-request, :http.request.configuration/protocol "rest-json", :http.request.configuration/method :get, :http.request.configuration/response-code 200, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "GetCognitoEvents", :http.request.configuration/output-deser-fn response-get-cognito-events-response, :http.request.spec/error-spec {"InvalidParameterException" :portkey.aws.cognito-sync/invalid-parameter-exception, "ResourceNotFoundException" :portkey.aws.cognito-sync/resource-not-found-exception, "NotAuthorizedException" :portkey.aws.cognito-sync/not-authorized-exception, "InternalErrorException" :portkey.aws.cognito-sync/internal-error-exception, "TooManyRequestsException" :portkey.aws.cognito-sync/too-many-requests-exception}})))))
(clojure.spec.alpha/fdef get-cognito-events :args (clojure.spec.alpha/tuple :portkey.aws.cognito-sync/get-cognito-events-request) :ret (clojure.spec.alpha/and :portkey.aws.cognito-sync/get-cognito-events-response))

(clojure.core/defn list-datasets "Lists datasets for an identity. With Amazon Cognito Sync, each identity has\naccess only to its own data. Thus, the credentials used to make this API call\nneed to have access to the identity data.\n ListDatasets can be called with temporary user credentials provided by Cognito\nIdentity or with developer credentials. You should use the Cognito Identity\ncredentials to make this API call." ([list-datasets-requestinput] (clojure.core/let [request-function-result__22153__auto__ (req-list-datasets-request list-datasets-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__22153__auto__ {:http.request.configuration/endpoints portkey.aws.cognito-sync/endpoints, :http.request.configuration/target-prefix nil, :http.request.spec/output-spec :portkey.aws.cognito-sync/list-datasets-response, :http.request.configuration/mime-type {"content-type" "application/json"}, :http.request.configuration/request-uri "/identitypools/{IdentityPoolId}/identities/{IdentityId}/datasets", :http.request.configuration/version "2014-06-30", :http.request.configuration/service-id nil, :http.request.spec/input-spec :portkey.aws.cognito-sync/list-datasets-request, :http.request.configuration/protocol "rest-json", :http.request.configuration/method :get, :http.request.configuration/response-code 200, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "ListDatasets", :http.request.configuration/output-deser-fn response-list-datasets-response, :http.request.spec/error-spec {"NotAuthorizedException" :portkey.aws.cognito-sync/not-authorized-exception, "InvalidParameterException" :portkey.aws.cognito-sync/invalid-parameter-exception, "InternalErrorException" :portkey.aws.cognito-sync/internal-error-exception, "TooManyRequestsException" :portkey.aws.cognito-sync/too-many-requests-exception}})))))
(clojure.spec.alpha/fdef list-datasets :args (clojure.spec.alpha/tuple :portkey.aws.cognito-sync/list-datasets-request) :ret (clojure.spec.alpha/and :portkey.aws.cognito-sync/list-datasets-response))

(clojure.core/defn list-identity-pool-usage "Gets a list of identity pools registered with Cognito.\n ListIdentityPoolUsage can only be called with developer credentials. You cannot\nmake this API call with the temporary user credentials provided by Cognito\nIdentity." ([] (list-identity-pool-usage {})) ([list-identity-pool-usage-requestinput] (clojure.core/let [request-function-result__22153__auto__ (req-list-identity-pool-usage-request list-identity-pool-usage-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__22153__auto__ {:http.request.configuration/endpoints portkey.aws.cognito-sync/endpoints, :http.request.configuration/target-prefix nil, :http.request.spec/output-spec :portkey.aws.cognito-sync/list-identity-pool-usage-response, :http.request.configuration/mime-type {"content-type" "application/json"}, :http.request.configuration/request-uri "/identitypools", :http.request.configuration/version "2014-06-30", :http.request.configuration/service-id nil, :http.request.spec/input-spec :portkey.aws.cognito-sync/list-identity-pool-usage-request, :http.request.configuration/protocol "rest-json", :http.request.configuration/method :get, :http.request.configuration/response-code 200, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "ListIdentityPoolUsage", :http.request.configuration/output-deser-fn response-list-identity-pool-usage-response, :http.request.spec/error-spec {"NotAuthorizedException" :portkey.aws.cognito-sync/not-authorized-exception, "InvalidParameterException" :portkey.aws.cognito-sync/invalid-parameter-exception, "InternalErrorException" :portkey.aws.cognito-sync/internal-error-exception, "TooManyRequestsException" :portkey.aws.cognito-sync/too-many-requests-exception}})))))
(clojure.spec.alpha/fdef list-identity-pool-usage :args (clojure.spec.alpha/? :portkey.aws.cognito-sync/list-identity-pool-usage-request) :ret (clojure.spec.alpha/and :portkey.aws.cognito-sync/list-identity-pool-usage-response))

(clojure.core/defn describe-identity-pool-usage "Gets usage details (for example, data storage) about a particular identity pool.\n This API can only be called with developer credentials. You cannot call this\nAPI with the temporary user credentials provided by Cognito Identity." ([describe-identity-pool-usage-requestinput] (clojure.core/let [request-function-result__22153__auto__ (req-describe-identity-pool-usage-request describe-identity-pool-usage-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__22153__auto__ {:http.request.configuration/endpoints portkey.aws.cognito-sync/endpoints, :http.request.configuration/target-prefix nil, :http.request.spec/output-spec :portkey.aws.cognito-sync/describe-identity-pool-usage-response, :http.request.configuration/mime-type {"content-type" "application/json"}, :http.request.configuration/request-uri "/identitypools/{IdentityPoolId}", :http.request.configuration/version "2014-06-30", :http.request.configuration/service-id nil, :http.request.spec/input-spec :portkey.aws.cognito-sync/describe-identity-pool-usage-request, :http.request.configuration/protocol "rest-json", :http.request.configuration/method :get, :http.request.configuration/response-code 200, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "DescribeIdentityPoolUsage", :http.request.configuration/output-deser-fn response-describe-identity-pool-usage-response, :http.request.spec/error-spec {"NotAuthorizedException" :portkey.aws.cognito-sync/not-authorized-exception, "InvalidParameterException" :portkey.aws.cognito-sync/invalid-parameter-exception, "ResourceNotFoundException" :portkey.aws.cognito-sync/resource-not-found-exception, "InternalErrorException" :portkey.aws.cognito-sync/internal-error-exception, "TooManyRequestsException" :portkey.aws.cognito-sync/too-many-requests-exception}})))))
(clojure.spec.alpha/fdef describe-identity-pool-usage :args (clojure.spec.alpha/tuple :portkey.aws.cognito-sync/describe-identity-pool-usage-request) :ret (clojure.spec.alpha/and :portkey.aws.cognito-sync/describe-identity-pool-usage-response))

(clojure.core/defn unsubscribe-from-dataset "Unsubscribes from receiving notifications when a dataset is modified by another\ndevice.\n This API can only be called with temporary credentials provided by Cognito\nIdentity. You cannot call this API with developer credentials." ([unsubscribe-from-dataset-requestinput] (clojure.core/let [request-function-result__22153__auto__ (req-unsubscribe-from-dataset-request unsubscribe-from-dataset-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__22153__auto__ {:http.request.configuration/endpoints portkey.aws.cognito-sync/endpoints, :http.request.configuration/target-prefix nil, :http.request.spec/output-spec :portkey.aws.cognito-sync/unsubscribe-from-dataset-response, :http.request.configuration/mime-type {"content-type" "application/json"}, :http.request.configuration/request-uri "/identitypools/{IdentityPoolId}/identities/{IdentityId}/datasets/{DatasetName}/subscriptions/{DeviceId}", :http.request.configuration/version "2014-06-30", :http.request.configuration/service-id nil, :http.request.spec/input-spec :portkey.aws.cognito-sync/unsubscribe-from-dataset-request, :http.request.configuration/protocol "rest-json", :http.request.configuration/method :delete, :http.request.configuration/response-code 200, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "UnsubscribeFromDataset", :http.request.configuration/output-deser-fn response-unsubscribe-from-dataset-response, :http.request.spec/error-spec {"NotAuthorizedException" :portkey.aws.cognito-sync/not-authorized-exception, "InvalidParameterException" :portkey.aws.cognito-sync/invalid-parameter-exception, "ResourceNotFoundException" :portkey.aws.cognito-sync/resource-not-found-exception, "InternalErrorException" :portkey.aws.cognito-sync/internal-error-exception, "InvalidConfigurationException" :portkey.aws.cognito-sync/invalid-configuration-exception, "TooManyRequestsException" :portkey.aws.cognito-sync/too-many-requests-exception}})))))
(clojure.spec.alpha/fdef unsubscribe-from-dataset :args (clojure.spec.alpha/tuple :portkey.aws.cognito-sync/unsubscribe-from-dataset-request) :ret (clojure.spec.alpha/and :portkey.aws.cognito-sync/unsubscribe-from-dataset-response))

(clojure.core/defn subscribe-to-dataset "Subscribes to receive notifications when a dataset is modified by another\ndevice.\n This API can only be called with temporary credentials provided by Cognito\nIdentity. You cannot call this API with developer credentials." ([subscribe-to-dataset-requestinput] (clojure.core/let [request-function-result__22153__auto__ (req-subscribe-to-dataset-request subscribe-to-dataset-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__22153__auto__ {:http.request.configuration/endpoints portkey.aws.cognito-sync/endpoints, :http.request.configuration/target-prefix nil, :http.request.spec/output-spec :portkey.aws.cognito-sync/subscribe-to-dataset-response, :http.request.configuration/mime-type {"content-type" "application/json"}, :http.request.configuration/request-uri "/identitypools/{IdentityPoolId}/identities/{IdentityId}/datasets/{DatasetName}/subscriptions/{DeviceId}", :http.request.configuration/version "2014-06-30", :http.request.configuration/service-id nil, :http.request.spec/input-spec :portkey.aws.cognito-sync/subscribe-to-dataset-request, :http.request.configuration/protocol "rest-json", :http.request.configuration/method :post, :http.request.configuration/response-code 200, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "SubscribeToDataset", :http.request.configuration/output-deser-fn response-subscribe-to-dataset-response, :http.request.spec/error-spec {"NotAuthorizedException" :portkey.aws.cognito-sync/not-authorized-exception, "InvalidParameterException" :portkey.aws.cognito-sync/invalid-parameter-exception, "ResourceNotFoundException" :portkey.aws.cognito-sync/resource-not-found-exception, "InternalErrorException" :portkey.aws.cognito-sync/internal-error-exception, "InvalidConfigurationException" :portkey.aws.cognito-sync/invalid-configuration-exception, "TooManyRequestsException" :portkey.aws.cognito-sync/too-many-requests-exception}})))))
(clojure.spec.alpha/fdef subscribe-to-dataset :args (clojure.spec.alpha/tuple :portkey.aws.cognito-sync/subscribe-to-dataset-request) :ret (clojure.spec.alpha/and :portkey.aws.cognito-sync/subscribe-to-dataset-response))

(clojure.core/defn get-identity-pool-configuration "Gets the configuration settings of an identity pool.\n This API can only be called with developer credentials. You cannot call this\nAPI with the temporary user credentials provided by Cognito Identity." ([get-identity-pool-configuration-requestinput] (clojure.core/let [request-function-result__22153__auto__ (req-get-identity-pool-configuration-request get-identity-pool-configuration-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__22153__auto__ {:http.request.configuration/endpoints portkey.aws.cognito-sync/endpoints, :http.request.configuration/target-prefix nil, :http.request.spec/output-spec :portkey.aws.cognito-sync/get-identity-pool-configuration-response, :http.request.configuration/mime-type {"content-type" "application/json"}, :http.request.configuration/request-uri "/identitypools/{IdentityPoolId}/configuration", :http.request.configuration/version "2014-06-30", :http.request.configuration/service-id nil, :http.request.spec/input-spec :portkey.aws.cognito-sync/get-identity-pool-configuration-request, :http.request.configuration/protocol "rest-json", :http.request.configuration/method :get, :http.request.configuration/response-code 200, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "GetIdentityPoolConfiguration", :http.request.configuration/output-deser-fn response-get-identity-pool-configuration-response, :http.request.spec/error-spec {"NotAuthorizedException" :portkey.aws.cognito-sync/not-authorized-exception, "InvalidParameterException" :portkey.aws.cognito-sync/invalid-parameter-exception, "ResourceNotFoundException" :portkey.aws.cognito-sync/resource-not-found-exception, "InternalErrorException" :portkey.aws.cognito-sync/internal-error-exception, "TooManyRequestsException" :portkey.aws.cognito-sync/too-many-requests-exception}})))))
(clojure.spec.alpha/fdef get-identity-pool-configuration :args (clojure.spec.alpha/tuple :portkey.aws.cognito-sync/get-identity-pool-configuration-request) :ret (clojure.spec.alpha/and :portkey.aws.cognito-sync/get-identity-pool-configuration-response))

(clojure.core/defn set-cognito-events "Sets the AWS Lambda function for a given event type for an identity pool. This\nrequest only updates the key/value pair specified. Other key/values pairs are\nnot updated. To remove a key value pair, pass a empty value for the particular\nkey.\n This API can only be called with developer credentials. You cannot call this\nAPI with the temporary user credentials provided by Cognito Identity." ([set-cognito-events-requestinput] (clojure.core/let [request-function-result__22153__auto__ (req-set-cognito-events-request set-cognito-events-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__22153__auto__ {:http.request.configuration/endpoints portkey.aws.cognito-sync/endpoints, :http.request.configuration/target-prefix nil, :http.request.spec/output-spec nil, :http.request.configuration/mime-type {"content-type" "application/json"}, :http.request.configuration/request-uri "/identitypools/{IdentityPoolId}/events", :http.request.configuration/version "2014-06-30", :http.request.configuration/service-id nil, :http.request.spec/input-spec :portkey.aws.cognito-sync/set-cognito-events-request, :http.request.configuration/protocol "rest-json", :http.request.configuration/method :post, :http.request.configuration/response-code 200, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "SetCognitoEvents", :http.request.configuration/output-deser-fn (clojure.core/fn [& args__22152__auto__] {}), :http.request.spec/error-spec {"InvalidParameterException" :portkey.aws.cognito-sync/invalid-parameter-exception, "ResourceNotFoundException" :portkey.aws.cognito-sync/resource-not-found-exception, "NotAuthorizedException" :portkey.aws.cognito-sync/not-authorized-exception, "InternalErrorException" :portkey.aws.cognito-sync/internal-error-exception, "TooManyRequestsException" :portkey.aws.cognito-sync/too-many-requests-exception}})))))
(clojure.spec.alpha/fdef set-cognito-events :args (clojure.spec.alpha/tuple :portkey.aws.cognito-sync/set-cognito-events-request) :ret clojure.core/true?)

(clojure.core/defn set-identity-pool-configuration "Sets the necessary configuration for push sync.\n This API can only be called with developer credentials. You cannot call this\nAPI with the temporary user credentials provided by Cognito Identity." ([set-identity-pool-configuration-requestinput] (clojure.core/let [request-function-result__22153__auto__ (req-set-identity-pool-configuration-request set-identity-pool-configuration-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__22153__auto__ {:http.request.configuration/endpoints portkey.aws.cognito-sync/endpoints, :http.request.configuration/target-prefix nil, :http.request.spec/output-spec :portkey.aws.cognito-sync/set-identity-pool-configuration-response, :http.request.configuration/mime-type {"content-type" "application/json"}, :http.request.configuration/request-uri "/identitypools/{IdentityPoolId}/configuration", :http.request.configuration/version "2014-06-30", :http.request.configuration/service-id nil, :http.request.spec/input-spec :portkey.aws.cognito-sync/set-identity-pool-configuration-request, :http.request.configuration/protocol "rest-json", :http.request.configuration/method :post, :http.request.configuration/response-code 200, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "SetIdentityPoolConfiguration", :http.request.configuration/output-deser-fn response-set-identity-pool-configuration-response, :http.request.spec/error-spec {"NotAuthorizedException" :portkey.aws.cognito-sync/not-authorized-exception, "InvalidParameterException" :portkey.aws.cognito-sync/invalid-parameter-exception, "ResourceNotFoundException" :portkey.aws.cognito-sync/resource-not-found-exception, "InternalErrorException" :portkey.aws.cognito-sync/internal-error-exception, "TooManyRequestsException" :portkey.aws.cognito-sync/too-many-requests-exception, "ConcurrentModificationException" :portkey.aws.cognito-sync/concurrent-modification-exception}})))))
(clojure.spec.alpha/fdef set-identity-pool-configuration :args (clojure.spec.alpha/tuple :portkey.aws.cognito-sync/set-identity-pool-configuration-request) :ret (clojure.spec.alpha/and :portkey.aws.cognito-sync/set-identity-pool-configuration-response))

(clojure.core/defn register-device "Registers a device to receive push sync notifications.\n This API can only be called with temporary credentials provided by Cognito\nIdentity. You cannot call this API with developer credentials." ([register-device-requestinput] (clojure.core/let [request-function-result__22153__auto__ (req-register-device-request register-device-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__22153__auto__ {:http.request.configuration/endpoints portkey.aws.cognito-sync/endpoints, :http.request.configuration/target-prefix nil, :http.request.spec/output-spec :portkey.aws.cognito-sync/register-device-response, :http.request.configuration/mime-type {"content-type" "application/json"}, :http.request.configuration/request-uri "/identitypools/{IdentityPoolId}/identity/{IdentityId}/device", :http.request.configuration/version "2014-06-30", :http.request.configuration/service-id nil, :http.request.spec/input-spec :portkey.aws.cognito-sync/register-device-request, :http.request.configuration/protocol "rest-json", :http.request.configuration/method :post, :http.request.configuration/response-code 200, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "RegisterDevice", :http.request.configuration/output-deser-fn response-register-device-response, :http.request.spec/error-spec {"NotAuthorizedException" :portkey.aws.cognito-sync/not-authorized-exception, "InvalidParameterException" :portkey.aws.cognito-sync/invalid-parameter-exception, "ResourceNotFoundException" :portkey.aws.cognito-sync/resource-not-found-exception, "InternalErrorException" :portkey.aws.cognito-sync/internal-error-exception, "InvalidConfigurationException" :portkey.aws.cognito-sync/invalid-configuration-exception, "TooManyRequestsException" :portkey.aws.cognito-sync/too-many-requests-exception}})))))
(clojure.spec.alpha/fdef register-device :args (clojure.spec.alpha/tuple :portkey.aws.cognito-sync/register-device-request) :ret (clojure.spec.alpha/and :portkey.aws.cognito-sync/register-device-response))

(clojure.core/defn update-records "Posts updates to records and adds and deletes records for a dataset and user.\n The sync count in the record patch is your last known sync count for that\nrecord. The server will reject an UpdateRecords request with a\nResourceConflictException if you try to patch a record with a new value but a\nstale sync count.\n For example, if the sync count on the server is 5 for a key called highScore\nand you try and submit a new highScore with sync count of 4, the request will be\nrejected. To obtain the current sync count for a record, call ListRecords. On a\nsuccessful update of the record, the response returns the new sync count for\nthat record. You should present that sync count the next time you try to update\nthat same record. When the record does not exist, specify the sync count as 0.\n This API can be called with temporary user credentials provided by Cognito\nIdentity or with developer credentials." ([update-records-requestinput] (clojure.core/let [request-function-result__22153__auto__ (req-update-records-request update-records-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__22153__auto__ {:http.request.configuration/endpoints portkey.aws.cognito-sync/endpoints, :http.request.configuration/target-prefix nil, :http.request.spec/output-spec :portkey.aws.cognito-sync/update-records-response, :http.request.configuration/mime-type {"content-type" "application/json"}, :http.request.configuration/request-uri "/identitypools/{IdentityPoolId}/identities/{IdentityId}/datasets/{DatasetName}", :http.request.configuration/version "2014-06-30", :http.request.configuration/service-id nil, :http.request.spec/input-spec :portkey.aws.cognito-sync/update-records-request, :http.request.configuration/protocol "rest-json", :http.request.configuration/method :post, :http.request.configuration/response-code 200, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "UpdateRecords", :http.request.configuration/output-deser-fn response-update-records-response, :http.request.spec/error-spec {"LimitExceededException" :portkey.aws.cognito-sync/limit-exceeded-exception, "NotAuthorizedException" :portkey.aws.cognito-sync/not-authorized-exception, "TooManyRequestsException" :portkey.aws.cognito-sync/too-many-requests-exception, "InternalErrorException" :portkey.aws.cognito-sync/internal-error-exception, "ResourceNotFoundException" :portkey.aws.cognito-sync/resource-not-found-exception, "LambdaThrottledException" :portkey.aws.cognito-sync/lambda-throttled-exception, "ResourceConflictException" :portkey.aws.cognito-sync/resource-conflict-exception, "InvalidLambdaFunctionOutputException" :portkey.aws.cognito-sync/invalid-lambda-function-output-exception, "InvalidParameterException" :portkey.aws.cognito-sync/invalid-parameter-exception}})))))
(clojure.spec.alpha/fdef update-records :args (clojure.spec.alpha/tuple :portkey.aws.cognito-sync/update-records-request) :ret (clojure.spec.alpha/and :portkey.aws.cognito-sync/update-records-response))

(clojure.core/defn delete-dataset "Deletes the specific dataset. The dataset will be deleted permanently, and the\naction can't be undone. Datasets that this dataset was merged with will no\nlonger report the merge. Any subsequent operation on this dataset will result in\na ResourceNotFoundException.\n This API can be called with temporary user credentials provided by Cognito\nIdentity or with developer credentials." ([delete-dataset-requestinput] (clojure.core/let [request-function-result__22153__auto__ (req-delete-dataset-request delete-dataset-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__22153__auto__ {:http.request.configuration/endpoints portkey.aws.cognito-sync/endpoints, :http.request.configuration/target-prefix nil, :http.request.spec/output-spec :portkey.aws.cognito-sync/delete-dataset-response, :http.request.configuration/mime-type {"content-type" "application/json"}, :http.request.configuration/request-uri "/identitypools/{IdentityPoolId}/identities/{IdentityId}/datasets/{DatasetName}", :http.request.configuration/version "2014-06-30", :http.request.configuration/service-id nil, :http.request.spec/input-spec :portkey.aws.cognito-sync/delete-dataset-request, :http.request.configuration/protocol "rest-json", :http.request.configuration/method :delete, :http.request.configuration/response-code 200, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "DeleteDataset", :http.request.configuration/output-deser-fn response-delete-dataset-response, :http.request.spec/error-spec {"NotAuthorizedException" :portkey.aws.cognito-sync/not-authorized-exception, "InvalidParameterException" :portkey.aws.cognito-sync/invalid-parameter-exception, "ResourceNotFoundException" :portkey.aws.cognito-sync/resource-not-found-exception, "InternalErrorException" :portkey.aws.cognito-sync/internal-error-exception, "TooManyRequestsException" :portkey.aws.cognito-sync/too-many-requests-exception, "ResourceConflictException" :portkey.aws.cognito-sync/resource-conflict-exception}})))))
(clojure.spec.alpha/fdef delete-dataset :args (clojure.spec.alpha/tuple :portkey.aws.cognito-sync/delete-dataset-request) :ret (clojure.spec.alpha/and :portkey.aws.cognito-sync/delete-dataset-response))

(clojure.core/defn bulk-publish "Initiates a bulk publish of all existing datasets for an Identity Pool to the\nconfigured stream. Customers are limited to one successful bulk publish per 24\nhours. Bulk publish is an asynchronous request, customers can see the status of\nthe request via the GetBulkPublishDetails operation.\n This API can only be called with developer credentials. You cannot call this\nAPI with the temporary user credentials provided by Cognito Identity." ([bulk-publish-requestinput] (clojure.core/let [request-function-result__22153__auto__ (req-bulk-publish-request bulk-publish-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__22153__auto__ {:http.request.configuration/endpoints portkey.aws.cognito-sync/endpoints, :http.request.configuration/target-prefix nil, :http.request.spec/output-spec :portkey.aws.cognito-sync/bulk-publish-response, :http.request.configuration/mime-type {"content-type" "application/json"}, :http.request.configuration/request-uri "/identitypools/{IdentityPoolId}/bulkpublish", :http.request.configuration/version "2014-06-30", :http.request.configuration/service-id nil, :http.request.spec/input-spec :portkey.aws.cognito-sync/bulk-publish-request, :http.request.configuration/protocol "rest-json", :http.request.configuration/method :post, :http.request.configuration/response-code 200, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "BulkPublish", :http.request.configuration/output-deser-fn response-bulk-publish-response, :http.request.spec/error-spec {"NotAuthorizedException" :portkey.aws.cognito-sync/not-authorized-exception, "InvalidParameterException" :portkey.aws.cognito-sync/invalid-parameter-exception, "ResourceNotFoundException" :portkey.aws.cognito-sync/resource-not-found-exception, "InternalErrorException" :portkey.aws.cognito-sync/internal-error-exception, "DuplicateRequestException" :portkey.aws.cognito-sync/duplicate-request-exception, "AlreadyStreamedException" :portkey.aws.cognito-sync/already-streamed-exception}})))))
(clojure.spec.alpha/fdef bulk-publish :args (clojure.spec.alpha/tuple :portkey.aws.cognito-sync/bulk-publish-request) :ret (clojure.spec.alpha/and :portkey.aws.cognito-sync/bulk-publish-response))
