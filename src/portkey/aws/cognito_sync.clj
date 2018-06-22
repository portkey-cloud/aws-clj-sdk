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

(clojure.spec.alpha/def :portkey.aws.cognito-sync.register-device-request/token (clojure.spec.alpha/and :portkey.aws.cognito-sync/push-token))
(clojure.spec.alpha/def :portkey.aws.cognito-sync/register-device-request (portkey.aws/json-keys :req-un [:portkey.aws.cognito-sync/IdentityPoolId :portkey.aws.cognito-sync/IdentityId :portkey.aws.cognito-sync/Platform :portkey.aws.cognito-sync.register-device-request/Token] :opt-un [] :locations {}))

(clojure.spec.alpha/def :portkey.aws.cognito-sync/record-key (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__13768__auto__] (clojure.core/<= 1 (clojure.core/count s__13768__auto__))) (clojure.core/fn [s__13769__auto__] (clojure.core/< (clojure.core/count s__13769__auto__) 1024))))

(clojure.spec.alpha/def :portkey.aws.cognito-sync.duplicate-request-exception/message (clojure.spec.alpha/and :portkey.aws.cognito-sync/exception-message))
(clojure.spec.alpha/def :portkey.aws.cognito-sync/duplicate-request-exception (portkey.aws/json-keys :req-un [:portkey.aws.cognito-sync.duplicate-request-exception/message] :opt-un [] :locations {}))

(clojure.spec.alpha/def :portkey.aws.cognito-sync/stream-name (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__13768__auto__] (clojure.core/<= 1 (clojure.core/count s__13768__auto__))) (clojure.core/fn [s__13769__auto__] (clojure.core/< (clojure.core/count s__13769__auto__) 128))))

(clojure.spec.alpha/def :portkey.aws.cognito-sync.dataset/creation-date (clojure.spec.alpha/and :portkey.aws.cognito-sync/date))
(clojure.spec.alpha/def :portkey.aws.cognito-sync.dataset/last-modified-date (clojure.spec.alpha/and :portkey.aws.cognito-sync/date))
(clojure.spec.alpha/def :portkey.aws.cognito-sync.dataset/last-modified-by (clojure.spec.alpha/and :portkey.aws.cognito-sync/string))
(clojure.spec.alpha/def :portkey.aws.cognito-sync.dataset/data-storage (clojure.spec.alpha/and :portkey.aws.cognito-sync/long))
(clojure.spec.alpha/def :portkey.aws.cognito-sync.dataset/num-records (clojure.spec.alpha/and :portkey.aws.cognito-sync/long))
(clojure.spec.alpha/def :portkey.aws.cognito-sync/dataset (portkey.aws/json-keys :req-un [] :opt-un [:portkey.aws.cognito-sync/IdentityId :portkey.aws.cognito-sync/DatasetName :portkey.aws.cognito-sync.dataset/CreationDate :portkey.aws.cognito-sync.dataset/LastModifiedDate :portkey.aws.cognito-sync.dataset/LastModifiedBy :portkey.aws.cognito-sync.dataset/DataStorage :portkey.aws.cognito-sync.dataset/NumRecords] :locations {}))

(clojure.spec.alpha/def :portkey.aws.cognito-sync/assume-role-arn (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__13768__auto__] (clojure.core/<= 20 (clojure.core/count s__13768__auto__))) (clojure.core/fn [s__13769__auto__] (clojure.core/< (clojure.core/count s__13769__auto__) 2048)) (clojure.core/fn [s__13770__auto__] (clojure.core/re-matches #"arn:aws:iam::\d+:role/.*" s__13770__auto__))))

(clojure.spec.alpha/def :portkey.aws.cognito-sync/platform (clojure.spec.alpha/conformer (clojure.core/let [m__13766__auto__ {"APNS" "APNS", :apns "APNS", "APNS_SANDBOX" "APNS_SANDBOX", :apns-sandbox "APNS_SANDBOX", "GCM" "GCM", :gcm "GCM", "ADM" "ADM", :adm "ADM"}] (clojure.core/fn [s__13767__auto__] (m__13766__auto__ s__13767__auto__ :clojure.spec.alpha/invalid))) (clojure.core/comp clojure.core/keyword portkey.aws/dashed)))

(clojure.spec.alpha/def :portkey.aws.cognito-sync/merged-dataset-name-list (clojure.spec.alpha/and (clojure.spec.alpha/coll-of :portkey.aws.cognito-sync/string) (clojure.spec.alpha/conformer clojure.core/identity (fn* [p1__13687__13688__auto__] (if (clojure.core/sequential? p1__13687__13688__auto__) p1__13687__13688__auto__ [p1__13687__13688__auto__])))))

(clojure.spec.alpha/def :portkey.aws.cognito-sync/describe-identity-pool-usage-response (portkey.aws/json-keys :req-un [] :opt-un [:portkey.aws.cognito-sync/IdentityPoolUsage] :locations {}))

(clojure.spec.alpha/def :portkey.aws.cognito-sync.push-sync/application-arns (clojure.spec.alpha/and :portkey.aws.cognito-sync/application-arn-list))
(clojure.spec.alpha/def :portkey.aws.cognito-sync.push-sync/role-arn (clojure.spec.alpha/and :portkey.aws.cognito-sync/assume-role-arn))
(clojure.spec.alpha/def :portkey.aws.cognito-sync/push-sync (portkey.aws/json-keys :req-un [] :opt-un [:portkey.aws.cognito-sync.push-sync/ApplicationArns :portkey.aws.cognito-sync.push-sync/RoleArn] :locations {}))

(clojure.spec.alpha/def :portkey.aws.cognito-sync/describe-identity-usage-response (portkey.aws/json-keys :req-un [] :opt-un [:portkey.aws.cognito-sync/IdentityUsage] :locations {}))

(clojure.spec.alpha/def :portkey.aws.cognito-sync/subscribe-to-dataset-request (portkey.aws/json-keys :req-un [:portkey.aws.cognito-sync/IdentityPoolId :portkey.aws.cognito-sync/IdentityId :portkey.aws.cognito-sync/DatasetName :portkey.aws.cognito-sync/DeviceId] :opt-un [] :locations {}))

(clojure.spec.alpha/def :portkey.aws.cognito-sync/unsubscribe-from-dataset-response (portkey.aws/json-keys :req-un [] :opt-un [] :locations {}))

(clojure.spec.alpha/def :portkey.aws.cognito-sync/application-arn (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__13770__auto__] (clojure.core/re-matches #"arn:aws:sns:[-0-9a-z]+:\d+:app/[A-Z_]+/[a-zA-Z0-9_.-]+" s__13770__auto__))))

(clojure.spec.alpha/def :portkey.aws.cognito-sync/sync-session-token (clojure.spec.alpha/and clojure.core/string?))

(clojure.spec.alpha/def :portkey.aws.cognito-sync/dataset-name (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__13768__auto__] (clojure.core/<= 1 (clojure.core/count s__13768__auto__))) (clojure.core/fn [s__13769__auto__] (clojure.core/< (clojure.core/count s__13769__auto__) 128)) (clojure.core/fn [s__13770__auto__] (clojure.core/re-matches #"[a-zA-Z0-9_.:-]+" s__13770__auto__))))

(clojure.spec.alpha/def :portkey.aws.cognito-sync/describe-identity-usage-request (portkey.aws/json-keys :req-un [:portkey.aws.cognito-sync/IdentityPoolId :portkey.aws.cognito-sync/IdentityId] :opt-un [] :locations {}))

(clojure.spec.alpha/def :portkey.aws.cognito-sync/set-cognito-events-request (portkey.aws/json-keys :req-un [:portkey.aws.cognito-sync/IdentityPoolId :portkey.aws.cognito-sync/Events] :opt-un [] :locations {}))

(clojure.spec.alpha/def :portkey.aws.cognito-sync/set-identity-pool-configuration-response (portkey.aws/json-keys :req-un [] :opt-un [:portkey.aws.cognito-sync/IdentityPoolId :portkey.aws.cognito-sync/PushSync :portkey.aws.cognito-sync/CognitoStreams] :locations {}))

(clojure.spec.alpha/def :portkey.aws.cognito-sync/get-identity-pool-configuration-request (portkey.aws/json-keys :req-un [:portkey.aws.cognito-sync/IdentityPoolId] :opt-un [] :locations {}))

(clojure.spec.alpha/def :portkey.aws.cognito-sync/set-identity-pool-configuration-request (portkey.aws/json-keys :req-un [:portkey.aws.cognito-sync/IdentityPoolId] :opt-un [:portkey.aws.cognito-sync/PushSync :portkey.aws.cognito-sync/CognitoStreams] :locations {}))

(clojure.spec.alpha/def :portkey.aws.cognito-sync.update-records-request/record-patches (clojure.spec.alpha/and :portkey.aws.cognito-sync/record-patch-list))
(clojure.spec.alpha/def :portkey.aws.cognito-sync/update-records-request (portkey.aws/json-keys :req-un [:portkey.aws.cognito-sync/IdentityPoolId :portkey.aws.cognito-sync/IdentityId :portkey.aws.cognito-sync/DatasetName :portkey.aws.cognito-sync/SyncSessionToken] :opt-un [:portkey.aws.cognito-sync/DeviceId :portkey.aws.cognito-sync.update-records-request/RecordPatches :portkey.aws.cognito-sync/ClientContext] :locations {}))

(clojure.spec.alpha/def :portkey.aws.cognito-sync.record-patch/op (clojure.spec.alpha/and :portkey.aws.cognito-sync/operation))
(clojure.spec.alpha/def :portkey.aws.cognito-sync.record-patch/key (clojure.spec.alpha/and :portkey.aws.cognito-sync/record-key))
(clojure.spec.alpha/def :portkey.aws.cognito-sync.record-patch/value (clojure.spec.alpha/and :portkey.aws.cognito-sync/record-value))
(clojure.spec.alpha/def :portkey.aws.cognito-sync.record-patch/sync-count (clojure.spec.alpha/and :portkey.aws.cognito-sync/long))
(clojure.spec.alpha/def :portkey.aws.cognito-sync.record-patch/device-last-modified-date (clojure.spec.alpha/and :portkey.aws.cognito-sync/date))
(clojure.spec.alpha/def :portkey.aws.cognito-sync/record-patch (portkey.aws/json-keys :req-un [:portkey.aws.cognito-sync.record-patch/Op :portkey.aws.cognito-sync.record-patch/Key :portkey.aws.cognito-sync.record-patch/SyncCount] :opt-un [:portkey.aws.cognito-sync.record-patch/Value :portkey.aws.cognito-sync.record-patch/DeviceLastModifiedDate] :locations {}))

(clojure.spec.alpha/def :portkey.aws.cognito-sync.list-identity-pool-usage-request/next-token (clojure.spec.alpha/and :portkey.aws.cognito-sync/string))
(clojure.spec.alpha/def :portkey.aws.cognito-sync.list-identity-pool-usage-request/max-results (clojure.spec.alpha/and :portkey.aws.cognito-sync/integer-string))
(clojure.spec.alpha/def :portkey.aws.cognito-sync/list-identity-pool-usage-request (portkey.aws/json-keys :req-un [] :opt-un [:portkey.aws.cognito-sync.list-identity-pool-usage-request/NextToken :portkey.aws.cognito-sync.list-identity-pool-usage-request/MaxResults] :locations {}))

(clojure.spec.alpha/def :portkey.aws.cognito-sync.cognito-streams/role-arn (clojure.spec.alpha/and :portkey.aws.cognito-sync/assume-role-arn))
(clojure.spec.alpha/def :portkey.aws.cognito-sync/cognito-streams (portkey.aws/json-keys :req-un [] :opt-un [:portkey.aws.cognito-sync/StreamName :portkey.aws.cognito-sync.cognito-streams/RoleArn :portkey.aws.cognito-sync/StreamingStatus] :locations {}))

(clojure.spec.alpha/def :portkey.aws.cognito-sync/cognito-event-type (clojure.spec.alpha/and clojure.core/string?))

(clojure.spec.alpha/def :portkey.aws.cognito-sync/push-token (clojure.spec.alpha/and clojure.core/string?))

(clojure.spec.alpha/def :portkey.aws.cognito-sync/application-arn-list (clojure.spec.alpha/and (clojure.spec.alpha/coll-of :portkey.aws.cognito-sync/application-arn) (clojure.spec.alpha/conformer clojure.core/identity (fn* [p1__13687__13688__auto__] (if (clojure.core/sequential? p1__13687__13688__auto__) p1__13687__13688__auto__ [p1__13687__13688__auto__])))))

(clojure.spec.alpha/def :portkey.aws.cognito-sync/get-cognito-events-request (portkey.aws/json-keys :req-un [:portkey.aws.cognito-sync/IdentityPoolId] :opt-un [] :locations {}))

(clojure.spec.alpha/def :portkey.aws.cognito-sync.limit-exceeded-exception/message (clojure.spec.alpha/and :portkey.aws.cognito-sync/exception-message))
(clojure.spec.alpha/def :portkey.aws.cognito-sync/limit-exceeded-exception (portkey.aws/json-keys :req-un [:portkey.aws.cognito-sync.limit-exceeded-exception/message] :opt-un [] :locations {}))

(clojure.spec.alpha/def :portkey.aws.cognito-sync.already-streamed-exception/message (clojure.spec.alpha/and :portkey.aws.cognito-sync/exception-message))
(clojure.spec.alpha/def :portkey.aws.cognito-sync/already-streamed-exception (portkey.aws/json-keys :req-un [:portkey.aws.cognito-sync.already-streamed-exception/message] :opt-un [] :locations {}))

(clojure.spec.alpha/def :portkey.aws.cognito-sync.not-authorized-exception/message (clojure.spec.alpha/and :portkey.aws.cognito-sync/exception-message))
(clojure.spec.alpha/def :portkey.aws.cognito-sync/not-authorized-exception (portkey.aws/json-keys :req-un [:portkey.aws.cognito-sync.not-authorized-exception/message] :opt-un [] :locations {}))

(clojure.spec.alpha/def :portkey.aws.cognito-sync/operation (clojure.spec.alpha/conformer (clojure.core/let [m__13766__auto__ {"replace" "replace", :replace "replace", "remove" "remove", :remove "remove"}] (clojure.core/fn [s__13767__auto__] (m__13766__auto__ s__13767__auto__ :clojure.spec.alpha/invalid))) (clojure.core/comp clojure.core/keyword portkey.aws/dashed)))

(clojure.spec.alpha/def :portkey.aws.cognito-sync/identity-pool-id (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__13768__auto__] (clojure.core/<= 1 (clojure.core/count s__13768__auto__))) (clojure.core/fn [s__13769__auto__] (clojure.core/< (clojure.core/count s__13769__auto__) 55)) (clojure.core/fn [s__13770__auto__] (clojure.core/re-matches #"[\w-]+:[0-9a-f-]+" s__13770__auto__))))

(clojure.spec.alpha/def :portkey.aws.cognito-sync/events (clojure.spec.alpha/map-of :portkey.aws.cognito-sync/cognito-event-type :portkey.aws.cognito-sync/lambda-function-arn))

(clojure.spec.alpha/def :portkey.aws.cognito-sync/describe-identity-pool-usage-request (portkey.aws/json-keys :req-un [:portkey.aws.cognito-sync/IdentityPoolId] :opt-un [] :locations {}))

(clojure.spec.alpha/def :portkey.aws.cognito-sync.update-records-response/records (clojure.spec.alpha/and :portkey.aws.cognito-sync/record-list))
(clojure.spec.alpha/def :portkey.aws.cognito-sync/update-records-response (portkey.aws/json-keys :req-un [] :opt-un [:portkey.aws.cognito-sync.update-records-response/Records] :locations {}))

(clojure.spec.alpha/def :portkey.aws.cognito-sync/delete-dataset-response (portkey.aws/json-keys :req-un [] :opt-un [:portkey.aws.cognito-sync/Dataset] :locations {}))

(clojure.spec.alpha/def :portkey.aws.cognito-sync/bulk-publish-status (clojure.spec.alpha/conformer (clojure.core/let [m__13766__auto__ {"NOT_STARTED" "NOT_STARTED", :not-started "NOT_STARTED", "IN_PROGRESS" "IN_PROGRESS", :in-progress "IN_PROGRESS", "FAILED" "FAILED", :failed "FAILED", "SUCCEEDED" "SUCCEEDED", :succeeded "SUCCEEDED"}] (clojure.core/fn [s__13767__auto__] (m__13766__auto__ s__13767__auto__ :clojure.spec.alpha/invalid))) (clojure.core/comp clojure.core/keyword portkey.aws/dashed)))

(clojure.spec.alpha/def :portkey.aws.cognito-sync/date clojure.core/inst?)

(clojure.spec.alpha/def :portkey.aws.cognito-sync/identity-id (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__13768__auto__] (clojure.core/<= 1 (clojure.core/count s__13768__auto__))) (clojure.core/fn [s__13769__auto__] (clojure.core/< (clojure.core/count s__13769__auto__) 55)) (clojure.core/fn [s__13770__auto__] (clojure.core/re-matches #"[\w-]+:[0-9a-f-]+" s__13770__auto__))))

(clojure.spec.alpha/def :portkey.aws.cognito-sync.get-bulk-publish-details-response/bulk-publish-start-time (clojure.spec.alpha/and :portkey.aws.cognito-sync/date))
(clojure.spec.alpha/def :portkey.aws.cognito-sync.get-bulk-publish-details-response/bulk-publish-complete-time (clojure.spec.alpha/and :portkey.aws.cognito-sync/date))
(clojure.spec.alpha/def :portkey.aws.cognito-sync.get-bulk-publish-details-response/failure-message (clojure.spec.alpha/and :portkey.aws.cognito-sync/string))
(clojure.spec.alpha/def :portkey.aws.cognito-sync/get-bulk-publish-details-response (portkey.aws/json-keys :req-un [] :opt-un [:portkey.aws.cognito-sync/IdentityPoolId :portkey.aws.cognito-sync.get-bulk-publish-details-response/BulkPublishStartTime :portkey.aws.cognito-sync.get-bulk-publish-details-response/BulkPublishCompleteTime :portkey.aws.cognito-sync/BulkPublishStatus :portkey.aws.cognito-sync.get-bulk-publish-details-response/FailureMessage] :locations {}))

(clojure.spec.alpha/def :portkey.aws.cognito-sync.too-many-requests-exception/message (clojure.spec.alpha/and :portkey.aws.cognito-sync/exception-message))
(clojure.spec.alpha/def :portkey.aws.cognito-sync/too-many-requests-exception (portkey.aws/json-keys :req-un [:portkey.aws.cognito-sync.too-many-requests-exception/message] :opt-un [] :locations {}))

(clojure.spec.alpha/def :portkey.aws.cognito-sync.internal-error-exception/message (clojure.spec.alpha/and :portkey.aws.cognito-sync/exception-message))
(clojure.spec.alpha/def :portkey.aws.cognito-sync/internal-error-exception (portkey.aws/json-keys :req-un [:portkey.aws.cognito-sync.internal-error-exception/message] :opt-un [] :locations {}))

(clojure.spec.alpha/def :portkey.aws.cognito-sync/integer-string (clojure.spec.alpha/and clojure.core/int?))

(clojure.spec.alpha/def :portkey.aws.cognito-sync.list-datasets-request/next-token (clojure.spec.alpha/and :portkey.aws.cognito-sync/string))
(clojure.spec.alpha/def :portkey.aws.cognito-sync.list-datasets-request/max-results (clojure.spec.alpha/and :portkey.aws.cognito-sync/integer-string))
(clojure.spec.alpha/def :portkey.aws.cognito-sync/list-datasets-request (portkey.aws/json-keys :req-un [:portkey.aws.cognito-sync/IdentityId :portkey.aws.cognito-sync/IdentityPoolId] :opt-un [:portkey.aws.cognito-sync.list-datasets-request/NextToken :portkey.aws.cognito-sync.list-datasets-request/MaxResults] :locations {}))

(clojure.spec.alpha/def :portkey.aws.cognito-sync.resource-not-found-exception/message (clojure.spec.alpha/and :portkey.aws.cognito-sync/exception-message))
(clojure.spec.alpha/def :portkey.aws.cognito-sync/resource-not-found-exception (portkey.aws/json-keys :req-un [:portkey.aws.cognito-sync.resource-not-found-exception/message] :opt-un [] :locations {}))

(clojure.spec.alpha/def :portkey.aws.cognito-sync/client-context (clojure.spec.alpha/and clojure.core/string?))

(clojure.spec.alpha/def :portkey.aws.cognito-sync/streaming-status (clojure.spec.alpha/conformer (clojure.core/let [m__13766__auto__ {"ENABLED" "ENABLED", :enabled "ENABLED", "DISABLED" "DISABLED", :disabled "DISABLED"}] (clojure.core/fn [s__13767__auto__] (m__13766__auto__ s__13767__auto__ :clojure.spec.alpha/invalid))) (clojure.core/comp clojure.core/keyword portkey.aws/dashed)))

(clojure.spec.alpha/def :portkey.aws.cognito-sync/get-cognito-events-response (portkey.aws/json-keys :req-un [] :opt-un [:portkey.aws.cognito-sync/Events] :locations {}))

(clojure.spec.alpha/def :portkey.aws.cognito-sync/delete-dataset-request (portkey.aws/json-keys :req-un [:portkey.aws.cognito-sync/IdentityPoolId :portkey.aws.cognito-sync/IdentityId :portkey.aws.cognito-sync/DatasetName] :opt-un [] :locations {}))

(clojure.spec.alpha/def :portkey.aws.cognito-sync/lambda-function-arn (clojure.spec.alpha/and clojure.core/string?))

(clojure.spec.alpha/def :portkey.aws.cognito-sync/exception-message (clojure.spec.alpha/and clojure.core/string?))

(clojure.spec.alpha/def :portkey.aws.cognito-sync/describe-dataset-request (portkey.aws/json-keys :req-un [:portkey.aws.cognito-sync/IdentityPoolId :portkey.aws.cognito-sync/IdentityId :portkey.aws.cognito-sync/DatasetName] :opt-un [] :locations {}))

(clojure.spec.alpha/def :portkey.aws.cognito-sync.lambda-throttled-exception/message (clojure.spec.alpha/and :portkey.aws.cognito-sync/exception-message))
(clojure.spec.alpha/def :portkey.aws.cognito-sync/lambda-throttled-exception (portkey.aws/json-keys :req-un [:portkey.aws.cognito-sync.lambda-throttled-exception/message] :opt-un [] :locations {}))

(clojure.spec.alpha/def :portkey.aws.cognito-sync/describe-dataset-response (portkey.aws/json-keys :req-un [] :opt-un [:portkey.aws.cognito-sync/Dataset] :locations {}))

(clojure.spec.alpha/def :portkey.aws.cognito-sync/integer (clojure.spec.alpha/and clojure.core/int?))

(clojure.spec.alpha/def :portkey.aws.cognito-sync/string (clojure.spec.alpha/and clojure.core/string?))

(clojure.spec.alpha/def :portkey.aws.cognito-sync/record-patch-list (clojure.spec.alpha/and (clojure.spec.alpha/coll-of :portkey.aws.cognito-sync/record-patch) (clojure.spec.alpha/conformer clojure.core/identity (fn* [p1__13687__13688__auto__] (if (clojure.core/sequential? p1__13687__13688__auto__) p1__13687__13688__auto__ [p1__13687__13688__auto__])))))

(clojure.spec.alpha/def :portkey.aws.cognito-sync/bulk-publish-request (portkey.aws/json-keys :req-un [:portkey.aws.cognito-sync/IdentityPoolId] :opt-un [] :locations {}))

(clojure.spec.alpha/def :portkey.aws.cognito-sync.record/key (clojure.spec.alpha/and :portkey.aws.cognito-sync/record-key))
(clojure.spec.alpha/def :portkey.aws.cognito-sync.record/value (clojure.spec.alpha/and :portkey.aws.cognito-sync/record-value))
(clojure.spec.alpha/def :portkey.aws.cognito-sync.record/sync-count (clojure.spec.alpha/and :portkey.aws.cognito-sync/long))
(clojure.spec.alpha/def :portkey.aws.cognito-sync.record/last-modified-date (clojure.spec.alpha/and :portkey.aws.cognito-sync/date))
(clojure.spec.alpha/def :portkey.aws.cognito-sync.record/last-modified-by (clojure.spec.alpha/and :portkey.aws.cognito-sync/string))
(clojure.spec.alpha/def :portkey.aws.cognito-sync.record/device-last-modified-date (clojure.spec.alpha/and :portkey.aws.cognito-sync/date))
(clojure.spec.alpha/def :portkey.aws.cognito-sync/record (portkey.aws/json-keys :req-un [] :opt-un [:portkey.aws.cognito-sync.record/Key :portkey.aws.cognito-sync.record/Value :portkey.aws.cognito-sync.record/SyncCount :portkey.aws.cognito-sync.record/LastModifiedDate :portkey.aws.cognito-sync.record/LastModifiedBy :portkey.aws.cognito-sync.record/DeviceLastModifiedDate] :locations {}))

(clojure.spec.alpha/def :portkey.aws.cognito-sync/record-list (clojure.spec.alpha/and (clojure.spec.alpha/coll-of :portkey.aws.cognito-sync/record) (clojure.spec.alpha/conformer clojure.core/identity (fn* [p1__13687__13688__auto__] (if (clojure.core/sequential? p1__13687__13688__auto__) p1__13687__13688__auto__ [p1__13687__13688__auto__])))))

(clojure.spec.alpha/def :portkey.aws.cognito-sync.resource-conflict-exception/message (clojure.spec.alpha/and :portkey.aws.cognito-sync/exception-message))
(clojure.spec.alpha/def :portkey.aws.cognito-sync/resource-conflict-exception (portkey.aws/json-keys :req-un [:portkey.aws.cognito-sync.resource-conflict-exception/message] :opt-un [] :locations {}))

(clojure.spec.alpha/def :portkey.aws.cognito-sync/device-id (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__13768__auto__] (clojure.core/<= 1 (clojure.core/count s__13768__auto__))) (clojure.core/fn [s__13769__auto__] (clojure.core/< (clojure.core/count s__13769__auto__) 256))))

(clojure.spec.alpha/def :portkey.aws.cognito-sync/identity-pool-usage-list (clojure.spec.alpha/and (clojure.spec.alpha/coll-of :portkey.aws.cognito-sync/identity-pool-usage) (clojure.spec.alpha/conformer clojure.core/identity (fn* [p1__13687__13688__auto__] (if (clojure.core/sequential? p1__13687__13688__auto__) p1__13687__13688__auto__ [p1__13687__13688__auto__])))))

(clojure.spec.alpha/def :portkey.aws.cognito-sync.invalid-lambda-function-output-exception/message (clojure.spec.alpha/and :portkey.aws.cognito-sync/exception-message))
(clojure.spec.alpha/def :portkey.aws.cognito-sync/invalid-lambda-function-output-exception (portkey.aws/json-keys :req-un [:portkey.aws.cognito-sync.invalid-lambda-function-output-exception/message] :opt-un [] :locations {}))

(clojure.spec.alpha/def :portkey.aws.cognito-sync/get-identity-pool-configuration-response (portkey.aws/json-keys :req-un [] :opt-un [:portkey.aws.cognito-sync/IdentityPoolId :portkey.aws.cognito-sync/PushSync :portkey.aws.cognito-sync/CognitoStreams] :locations {}))

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
(clojure.spec.alpha/def :portkey.aws.cognito-sync/list-records-response (portkey.aws/json-keys :req-un [] :opt-un [:portkey.aws.cognito-sync.list-records-response/SyncSessionToken :portkey.aws.cognito-sync.list-records-response/DatasetSyncCount :portkey.aws.cognito-sync.list-records-response/Count :portkey.aws.cognito-sync.list-records-response/NextToken :portkey.aws.cognito-sync.list-records-response/DatasetExists :portkey.aws.cognito-sync.list-records-response/DatasetDeletedAfterRequestedSyncCount :portkey.aws.cognito-sync.list-records-response/MergedDatasetNames :portkey.aws.cognito-sync.list-records-response/Records :portkey.aws.cognito-sync.list-records-response/LastModifiedBy] :locations {}))

(clojure.spec.alpha/def :portkey.aws.cognito-sync/subscribe-to-dataset-response (portkey.aws/json-keys :req-un [] :opt-un [] :locations {}))

(clojure.spec.alpha/def :portkey.aws.cognito-sync/record-value (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__13769__auto__] (clojure.core/< (clojure.core/count s__13769__auto__) 1048575))))

(clojure.spec.alpha/def :portkey.aws.cognito-sync/bulk-publish-response (portkey.aws/json-keys :req-un [] :opt-un [:portkey.aws.cognito-sync/IdentityPoolId] :locations {}))

(clojure.spec.alpha/def :portkey.aws.cognito-sync/unsubscribe-from-dataset-request (portkey.aws/json-keys :req-un [:portkey.aws.cognito-sync/IdentityPoolId :portkey.aws.cognito-sync/IdentityId :portkey.aws.cognito-sync/DatasetName :portkey.aws.cognito-sync/DeviceId] :opt-un [] :locations {}))

(clojure.spec.alpha/def :portkey.aws.cognito-sync.concurrent-modification-exception/message (clojure.spec.alpha/and :portkey.aws.cognito-sync/string))
(clojure.spec.alpha/def :portkey.aws.cognito-sync/concurrent-modification-exception (portkey.aws/json-keys :req-un [:portkey.aws.cognito-sync.concurrent-modification-exception/message] :opt-un [] :locations {}))

(clojure.spec.alpha/def :portkey.aws.cognito-sync/dataset-list (clojure.spec.alpha/and (clojure.spec.alpha/coll-of :portkey.aws.cognito-sync/dataset) (clojure.spec.alpha/conformer clojure.core/identity (fn* [p1__13687__13688__auto__] (if (clojure.core/sequential? p1__13687__13688__auto__) p1__13687__13688__auto__ [p1__13687__13688__auto__])))))

(clojure.spec.alpha/def :portkey.aws.cognito-sync.list-identity-pool-usage-response/identity-pool-usages (clojure.spec.alpha/and :portkey.aws.cognito-sync/identity-pool-usage-list))
(clojure.spec.alpha/def :portkey.aws.cognito-sync.list-identity-pool-usage-response/max-results (clojure.spec.alpha/and :portkey.aws.cognito-sync/integer))
(clojure.spec.alpha/def :portkey.aws.cognito-sync.list-identity-pool-usage-response/count (clojure.spec.alpha/and :portkey.aws.cognito-sync/integer))
(clojure.spec.alpha/def :portkey.aws.cognito-sync.list-identity-pool-usage-response/next-token (clojure.spec.alpha/and :portkey.aws.cognito-sync/string))
(clojure.spec.alpha/def :portkey.aws.cognito-sync/list-identity-pool-usage-response (portkey.aws/json-keys :req-un [] :opt-un [:portkey.aws.cognito-sync.list-identity-pool-usage-response/IdentityPoolUsages :portkey.aws.cognito-sync.list-identity-pool-usage-response/MaxResults :portkey.aws.cognito-sync.list-identity-pool-usage-response/Count :portkey.aws.cognito-sync.list-identity-pool-usage-response/NextToken] :locations {}))

(clojure.spec.alpha/def :portkey.aws.cognito-sync.identity-pool-usage/sync-sessions-count (clojure.spec.alpha/and :portkey.aws.cognito-sync/long))
(clojure.spec.alpha/def :portkey.aws.cognito-sync.identity-pool-usage/data-storage (clojure.spec.alpha/and :portkey.aws.cognito-sync/long))
(clojure.spec.alpha/def :portkey.aws.cognito-sync.identity-pool-usage/last-modified-date (clojure.spec.alpha/and :portkey.aws.cognito-sync/date))
(clojure.spec.alpha/def :portkey.aws.cognito-sync/identity-pool-usage (portkey.aws/json-keys :req-un [] :opt-un [:portkey.aws.cognito-sync/IdentityPoolId :portkey.aws.cognito-sync.identity-pool-usage/SyncSessionsCount :portkey.aws.cognito-sync.identity-pool-usage/DataStorage :portkey.aws.cognito-sync.identity-pool-usage/LastModifiedDate] :locations {}))

(clojure.spec.alpha/def :portkey.aws.cognito-sync.list-records-request/last-sync-count (clojure.spec.alpha/and :portkey.aws.cognito-sync/long))
(clojure.spec.alpha/def :portkey.aws.cognito-sync.list-records-request/next-token (clojure.spec.alpha/and :portkey.aws.cognito-sync/string))
(clojure.spec.alpha/def :portkey.aws.cognito-sync.list-records-request/max-results (clojure.spec.alpha/and :portkey.aws.cognito-sync/integer-string))
(clojure.spec.alpha/def :portkey.aws.cognito-sync/list-records-request (portkey.aws/json-keys :req-un [:portkey.aws.cognito-sync/IdentityPoolId :portkey.aws.cognito-sync/IdentityId :portkey.aws.cognito-sync/DatasetName] :opt-un [:portkey.aws.cognito-sync.list-records-request/LastSyncCount :portkey.aws.cognito-sync.list-records-request/NextToken :portkey.aws.cognito-sync.list-records-request/MaxResults :portkey.aws.cognito-sync/SyncSessionToken] :locations {}))

(clojure.spec.alpha/def :portkey.aws.cognito-sync.invalid-parameter-exception/message (clojure.spec.alpha/and :portkey.aws.cognito-sync/exception-message))
(clojure.spec.alpha/def :portkey.aws.cognito-sync/invalid-parameter-exception (portkey.aws/json-keys :req-un [:portkey.aws.cognito-sync.invalid-parameter-exception/message] :opt-un [] :locations {}))

(clojure.spec.alpha/def :portkey.aws.cognito-sync/register-device-response (portkey.aws/json-keys :req-un [] :opt-un [:portkey.aws.cognito-sync/DeviceId] :locations {}))

(clojure.spec.alpha/def :portkey.aws.cognito-sync.identity-usage/last-modified-date (clojure.spec.alpha/and :portkey.aws.cognito-sync/date))
(clojure.spec.alpha/def :portkey.aws.cognito-sync.identity-usage/dataset-count (clojure.spec.alpha/and :portkey.aws.cognito-sync/integer))
(clojure.spec.alpha/def :portkey.aws.cognito-sync.identity-usage/data-storage (clojure.spec.alpha/and :portkey.aws.cognito-sync/long))
(clojure.spec.alpha/def :portkey.aws.cognito-sync/identity-usage (portkey.aws/json-keys :req-un [] :opt-un [:portkey.aws.cognito-sync/IdentityId :portkey.aws.cognito-sync/IdentityPoolId :portkey.aws.cognito-sync.identity-usage/LastModifiedDate :portkey.aws.cognito-sync.identity-usage/DatasetCount :portkey.aws.cognito-sync.identity-usage/DataStorage] :locations {}))

(clojure.spec.alpha/def :portkey.aws.cognito-sync.list-datasets-response/datasets (clojure.spec.alpha/and :portkey.aws.cognito-sync/dataset-list))
(clojure.spec.alpha/def :portkey.aws.cognito-sync.list-datasets-response/count (clojure.spec.alpha/and :portkey.aws.cognito-sync/integer))
(clojure.spec.alpha/def :portkey.aws.cognito-sync.list-datasets-response/next-token (clojure.spec.alpha/and :portkey.aws.cognito-sync/string))
(clojure.spec.alpha/def :portkey.aws.cognito-sync/list-datasets-response (portkey.aws/json-keys :req-un [] :opt-un [:portkey.aws.cognito-sync.list-datasets-response/Datasets :portkey.aws.cognito-sync.list-datasets-response/Count :portkey.aws.cognito-sync.list-datasets-response/NextToken] :locations {}))

(clojure.spec.alpha/def :portkey.aws.cognito-sync.invalid-configuration-exception/message (clojure.spec.alpha/and :portkey.aws.cognito-sync/exception-message))
(clojure.spec.alpha/def :portkey.aws.cognito-sync/invalid-configuration-exception (portkey.aws/json-keys :req-un [:portkey.aws.cognito-sync.invalid-configuration-exception/message] :opt-un [] :locations {}))

(clojure.spec.alpha/def :portkey.aws.cognito-sync/get-bulk-publish-details-request (portkey.aws/json-keys :req-un [:portkey.aws.cognito-sync/IdentityPoolId] :opt-un [] :locations {}))

(clojure.spec.alpha/def :portkey.aws.cognito-sync/boolean clojure.core/boolean?)

(clojure.core/defn list-records "Gets paginated records, optionally changed after a particular sync count for a\ndataset and identity. With Amazon Cognito Sync, each identity has access only to\nits own data. Thus, the credentials used to make this API call need to have\naccess to the identity data.\n ListRecords can be called with temporary user credentials provided by Cognito\nIdentity or with developer credentials. You should use Cognito Identity\ncredentials to make this API call." ([list-records-request] (portkey.aws/-rest-json-call portkey.aws.cognito-sync/endpoints "GET" "/identitypools/{IdentityPoolId}/identities/{IdentityId}/datasets/{DatasetName}/records" list-records-request :portkey.aws.cognito-sync/list-records-request {:payload nil, :move {}, :headers {}, :uri {"IdentityPoolId" "IdentityPoolId", "IdentityId" "IdentityId", "DatasetName" "DatasetName"}, :querystring {"lastSyncCount" "LastSyncCount", "nextToken" "NextToken", "maxResults" "MaxResults", "syncSessionToken" "SyncSessionToken"}} 200 :portkey.aws.cognito-sync/list-records-response {"InvalidParameterException" :portkey.aws.cognito-sync/invalid-parameter-exception, "NotAuthorizedException" :portkey.aws.cognito-sync/not-authorized-exception, "TooManyRequestsException" :portkey.aws.cognito-sync/too-many-requests-exception, "InternalErrorException" :portkey.aws.cognito-sync/internal-error-exception})))
(clojure.spec.alpha/fdef list-records :args (clojure.spec.alpha/tuple :portkey.aws.cognito-sync/list-records-request) :ret (clojure.spec.alpha/and :portkey.aws.cognito-sync/list-records-response))

(clojure.core/defn describe-dataset "Gets meta data about a dataset by identity and dataset name. With Amazon Cognito\nSync, each identity has access only to its own data. Thus, the credentials used\nto make this API call need to have access to the identity data.\n This API can be called with temporary user credentials provided by Cognito\nIdentity or with developer credentials. You should use Cognito Identity\ncredentials to make this API call." ([describe-dataset-request] (portkey.aws/-rest-json-call portkey.aws.cognito-sync/endpoints "GET" "/identitypools/{IdentityPoolId}/identities/{IdentityId}/datasets/{DatasetName}" describe-dataset-request :portkey.aws.cognito-sync/describe-dataset-request {:payload nil, :move {}, :headers {}, :uri {"IdentityPoolId" "IdentityPoolId", "IdentityId" "IdentityId", "DatasetName" "DatasetName"}, :querystring {}} 200 :portkey.aws.cognito-sync/describe-dataset-response {"NotAuthorizedException" :portkey.aws.cognito-sync/not-authorized-exception, "InvalidParameterException" :portkey.aws.cognito-sync/invalid-parameter-exception, "ResourceNotFoundException" :portkey.aws.cognito-sync/resource-not-found-exception, "InternalErrorException" :portkey.aws.cognito-sync/internal-error-exception, "TooManyRequestsException" :portkey.aws.cognito-sync/too-many-requests-exception})))
(clojure.spec.alpha/fdef describe-dataset :args (clojure.spec.alpha/tuple :portkey.aws.cognito-sync/describe-dataset-request) :ret (clojure.spec.alpha/and :portkey.aws.cognito-sync/describe-dataset-response))

(clojure.core/defn get-bulk-publish-details "Get the status of the last BulkPublish operation for an identity pool.\n This API can only be called with developer credentials. You cannot call this\nAPI with the temporary user credentials provided by Cognito Identity." ([get-bulk-publish-details-request] (portkey.aws/-rest-json-call portkey.aws.cognito-sync/endpoints "POST" "/identitypools/{IdentityPoolId}/getBulkPublishDetails" get-bulk-publish-details-request :portkey.aws.cognito-sync/get-bulk-publish-details-request {:payload nil, :move {}, :headers {}, :uri {"IdentityPoolId" "IdentityPoolId"}, :querystring {}} 200 :portkey.aws.cognito-sync/get-bulk-publish-details-response {"NotAuthorizedException" :portkey.aws.cognito-sync/not-authorized-exception, "InvalidParameterException" :portkey.aws.cognito-sync/invalid-parameter-exception, "ResourceNotFoundException" :portkey.aws.cognito-sync/resource-not-found-exception, "InternalErrorException" :portkey.aws.cognito-sync/internal-error-exception})))
(clojure.spec.alpha/fdef get-bulk-publish-details :args (clojure.spec.alpha/tuple :portkey.aws.cognito-sync/get-bulk-publish-details-request) :ret (clojure.spec.alpha/and :portkey.aws.cognito-sync/get-bulk-publish-details-response))

(clojure.core/defn describe-identity-usage "Gets usage information for an identity, including number of datasets and data\nusage.\n This API can be called with temporary user credentials provided by Cognito\nIdentity or with developer credentials." ([describe-identity-usage-request] (portkey.aws/-rest-json-call portkey.aws.cognito-sync/endpoints "GET" "/identitypools/{IdentityPoolId}/identities/{IdentityId}" describe-identity-usage-request :portkey.aws.cognito-sync/describe-identity-usage-request {:payload nil, :move {}, :headers {}, :uri {"IdentityPoolId" "IdentityPoolId", "IdentityId" "IdentityId"}, :querystring {}} 200 :portkey.aws.cognito-sync/describe-identity-usage-response {"NotAuthorizedException" :portkey.aws.cognito-sync/not-authorized-exception, "InvalidParameterException" :portkey.aws.cognito-sync/invalid-parameter-exception, "ResourceNotFoundException" :portkey.aws.cognito-sync/resource-not-found-exception, "InternalErrorException" :portkey.aws.cognito-sync/internal-error-exception, "TooManyRequestsException" :portkey.aws.cognito-sync/too-many-requests-exception})))
(clojure.spec.alpha/fdef describe-identity-usage :args (clojure.spec.alpha/tuple :portkey.aws.cognito-sync/describe-identity-usage-request) :ret (clojure.spec.alpha/and :portkey.aws.cognito-sync/describe-identity-usage-response))

(clojure.core/defn get-cognito-events "Gets the events and the corresponding Lambda functions associated with an\nidentity pool.\n This API can only be called with developer credentials. You cannot call this\nAPI with the temporary user credentials provided by Cognito Identity." ([get-cognito-events-request] (portkey.aws/-rest-json-call portkey.aws.cognito-sync/endpoints "GET" "/identitypools/{IdentityPoolId}/events" get-cognito-events-request :portkey.aws.cognito-sync/get-cognito-events-request {:payload nil, :move {}, :headers {}, :uri {"IdentityPoolId" "IdentityPoolId"}, :querystring {}} 200 :portkey.aws.cognito-sync/get-cognito-events-response {"InvalidParameterException" :portkey.aws.cognito-sync/invalid-parameter-exception, "ResourceNotFoundException" :portkey.aws.cognito-sync/resource-not-found-exception, "NotAuthorizedException" :portkey.aws.cognito-sync/not-authorized-exception, "InternalErrorException" :portkey.aws.cognito-sync/internal-error-exception, "TooManyRequestsException" :portkey.aws.cognito-sync/too-many-requests-exception})))
(clojure.spec.alpha/fdef get-cognito-events :args (clojure.spec.alpha/tuple :portkey.aws.cognito-sync/get-cognito-events-request) :ret (clojure.spec.alpha/and :portkey.aws.cognito-sync/get-cognito-events-response))

(clojure.core/defn list-datasets "Lists datasets for an identity. With Amazon Cognito Sync, each identity has\naccess only to its own data. Thus, the credentials used to make this API call\nneed to have access to the identity data.\n ListDatasets can be called with temporary user credentials provided by Cognito\nIdentity or with developer credentials. You should use the Cognito Identity\ncredentials to make this API call." ([list-datasets-request] (portkey.aws/-rest-json-call portkey.aws.cognito-sync/endpoints "GET" "/identitypools/{IdentityPoolId}/identities/{IdentityId}/datasets" list-datasets-request :portkey.aws.cognito-sync/list-datasets-request {:payload nil, :move {}, :headers {}, :uri {"IdentityPoolId" "IdentityPoolId", "IdentityId" "IdentityId"}, :querystring {"nextToken" "NextToken", "maxResults" "MaxResults"}} 200 :portkey.aws.cognito-sync/list-datasets-response {"NotAuthorizedException" :portkey.aws.cognito-sync/not-authorized-exception, "InvalidParameterException" :portkey.aws.cognito-sync/invalid-parameter-exception, "InternalErrorException" :portkey.aws.cognito-sync/internal-error-exception, "TooManyRequestsException" :portkey.aws.cognito-sync/too-many-requests-exception})))
(clojure.spec.alpha/fdef list-datasets :args (clojure.spec.alpha/tuple :portkey.aws.cognito-sync/list-datasets-request) :ret (clojure.spec.alpha/and :portkey.aws.cognito-sync/list-datasets-response))

(clojure.core/defn list-identity-pool-usage "Gets a list of identity pools registered with Cognito.\n ListIdentityPoolUsage can only be called with developer credentials. You cannot\nmake this API call with the temporary user credentials provided by Cognito\nIdentity." ([] (list-identity-pool-usage {})) ([list-identity-pool-usage-request] (portkey.aws/-rest-json-call portkey.aws.cognito-sync/endpoints "GET" "/identitypools" list-identity-pool-usage-request :portkey.aws.cognito-sync/list-identity-pool-usage-request {:payload nil, :move {}, :headers {}, :uri {}, :querystring {"nextToken" "NextToken", "maxResults" "MaxResults"}} 200 :portkey.aws.cognito-sync/list-identity-pool-usage-response {"NotAuthorizedException" :portkey.aws.cognito-sync/not-authorized-exception, "InvalidParameterException" :portkey.aws.cognito-sync/invalid-parameter-exception, "InternalErrorException" :portkey.aws.cognito-sync/internal-error-exception, "TooManyRequestsException" :portkey.aws.cognito-sync/too-many-requests-exception})))
(clojure.spec.alpha/fdef list-identity-pool-usage :args (clojure.spec.alpha/? :portkey.aws.cognito-sync/list-identity-pool-usage-request) :ret (clojure.spec.alpha/and :portkey.aws.cognito-sync/list-identity-pool-usage-response))

(clojure.core/defn describe-identity-pool-usage "Gets usage details (for example, data storage) about a particular identity pool.\n This API can only be called with developer credentials. You cannot call this\nAPI with the temporary user credentials provided by Cognito Identity." ([describe-identity-pool-usage-request] (portkey.aws/-rest-json-call portkey.aws.cognito-sync/endpoints "GET" "/identitypools/{IdentityPoolId}" describe-identity-pool-usage-request :portkey.aws.cognito-sync/describe-identity-pool-usage-request {:payload nil, :move {}, :headers {}, :uri {"IdentityPoolId" "IdentityPoolId"}, :querystring {}} 200 :portkey.aws.cognito-sync/describe-identity-pool-usage-response {"NotAuthorizedException" :portkey.aws.cognito-sync/not-authorized-exception, "InvalidParameterException" :portkey.aws.cognito-sync/invalid-parameter-exception, "ResourceNotFoundException" :portkey.aws.cognito-sync/resource-not-found-exception, "InternalErrorException" :portkey.aws.cognito-sync/internal-error-exception, "TooManyRequestsException" :portkey.aws.cognito-sync/too-many-requests-exception})))
(clojure.spec.alpha/fdef describe-identity-pool-usage :args (clojure.spec.alpha/tuple :portkey.aws.cognito-sync/describe-identity-pool-usage-request) :ret (clojure.spec.alpha/and :portkey.aws.cognito-sync/describe-identity-pool-usage-response))

(clojure.core/defn unsubscribe-from-dataset "Unsubscribes from receiving notifications when a dataset is modified by another\ndevice.\n This API can only be called with temporary credentials provided by Cognito\nIdentity. You cannot call this API with developer credentials." ([unsubscribe-from-dataset-request] (portkey.aws/-rest-json-call portkey.aws.cognito-sync/endpoints "DELETE" "/identitypools/{IdentityPoolId}/identities/{IdentityId}/datasets/{DatasetName}/subscriptions/{DeviceId}" unsubscribe-from-dataset-request :portkey.aws.cognito-sync/unsubscribe-from-dataset-request {:payload nil, :move {}, :headers {}, :uri {"IdentityPoolId" "IdentityPoolId", "IdentityId" "IdentityId", "DatasetName" "DatasetName", "DeviceId" "DeviceId"}, :querystring {}} 200 :portkey.aws.cognito-sync/unsubscribe-from-dataset-response {"NotAuthorizedException" :portkey.aws.cognito-sync/not-authorized-exception, "InvalidParameterException" :portkey.aws.cognito-sync/invalid-parameter-exception, "ResourceNotFoundException" :portkey.aws.cognito-sync/resource-not-found-exception, "InternalErrorException" :portkey.aws.cognito-sync/internal-error-exception, "InvalidConfigurationException" :portkey.aws.cognito-sync/invalid-configuration-exception, "TooManyRequestsException" :portkey.aws.cognito-sync/too-many-requests-exception})))
(clojure.spec.alpha/fdef unsubscribe-from-dataset :args (clojure.spec.alpha/tuple :portkey.aws.cognito-sync/unsubscribe-from-dataset-request) :ret (clojure.spec.alpha/and :portkey.aws.cognito-sync/unsubscribe-from-dataset-response))

(clojure.core/defn subscribe-to-dataset "Subscribes to receive notifications when a dataset is modified by another\ndevice.\n This API can only be called with temporary credentials provided by Cognito\nIdentity. You cannot call this API with developer credentials." ([subscribe-to-dataset-request] (portkey.aws/-rest-json-call portkey.aws.cognito-sync/endpoints "POST" "/identitypools/{IdentityPoolId}/identities/{IdentityId}/datasets/{DatasetName}/subscriptions/{DeviceId}" subscribe-to-dataset-request :portkey.aws.cognito-sync/subscribe-to-dataset-request {:payload nil, :move {}, :headers {}, :uri {"IdentityPoolId" "IdentityPoolId", "IdentityId" "IdentityId", "DatasetName" "DatasetName", "DeviceId" "DeviceId"}, :querystring {}} 200 :portkey.aws.cognito-sync/subscribe-to-dataset-response {"NotAuthorizedException" :portkey.aws.cognito-sync/not-authorized-exception, "InvalidParameterException" :portkey.aws.cognito-sync/invalid-parameter-exception, "ResourceNotFoundException" :portkey.aws.cognito-sync/resource-not-found-exception, "InternalErrorException" :portkey.aws.cognito-sync/internal-error-exception, "InvalidConfigurationException" :portkey.aws.cognito-sync/invalid-configuration-exception, "TooManyRequestsException" :portkey.aws.cognito-sync/too-many-requests-exception})))
(clojure.spec.alpha/fdef subscribe-to-dataset :args (clojure.spec.alpha/tuple :portkey.aws.cognito-sync/subscribe-to-dataset-request) :ret (clojure.spec.alpha/and :portkey.aws.cognito-sync/subscribe-to-dataset-response))

(clojure.core/defn get-identity-pool-configuration "Gets the configuration settings of an identity pool.\n This API can only be called with developer credentials. You cannot call this\nAPI with the temporary user credentials provided by Cognito Identity." ([get-identity-pool-configuration-request] (portkey.aws/-rest-json-call portkey.aws.cognito-sync/endpoints "GET" "/identitypools/{IdentityPoolId}/configuration" get-identity-pool-configuration-request :portkey.aws.cognito-sync/get-identity-pool-configuration-request {:payload nil, :move {}, :headers {}, :uri {"IdentityPoolId" "IdentityPoolId"}, :querystring {}} 200 :portkey.aws.cognito-sync/get-identity-pool-configuration-response {"NotAuthorizedException" :portkey.aws.cognito-sync/not-authorized-exception, "InvalidParameterException" :portkey.aws.cognito-sync/invalid-parameter-exception, "ResourceNotFoundException" :portkey.aws.cognito-sync/resource-not-found-exception, "InternalErrorException" :portkey.aws.cognito-sync/internal-error-exception, "TooManyRequestsException" :portkey.aws.cognito-sync/too-many-requests-exception})))
(clojure.spec.alpha/fdef get-identity-pool-configuration :args (clojure.spec.alpha/tuple :portkey.aws.cognito-sync/get-identity-pool-configuration-request) :ret (clojure.spec.alpha/and :portkey.aws.cognito-sync/get-identity-pool-configuration-response))

(clojure.core/defn set-cognito-events "Sets the AWS Lambda function for a given event type for an identity pool. This\nrequest only updates the key/value pair specified. Other key/values pairs are\nnot updated. To remove a key value pair, pass a empty value for the particular\nkey.\n This API can only be called with developer credentials. You cannot call this\nAPI with the temporary user credentials provided by Cognito Identity." ([set-cognito-events-request] (portkey.aws/-rest-json-call portkey.aws.cognito-sync/endpoints "POST" "/identitypools/{IdentityPoolId}/events" set-cognito-events-request :portkey.aws.cognito-sync/set-cognito-events-request {:payload nil, :move {}, :headers {}, :uri {"IdentityPoolId" "IdentityPoolId"}, :querystring {}} 200 nil {"InvalidParameterException" :portkey.aws.cognito-sync/invalid-parameter-exception, "ResourceNotFoundException" :portkey.aws.cognito-sync/resource-not-found-exception, "NotAuthorizedException" :portkey.aws.cognito-sync/not-authorized-exception, "InternalErrorException" :portkey.aws.cognito-sync/internal-error-exception, "TooManyRequestsException" :portkey.aws.cognito-sync/too-many-requests-exception})))
(clojure.spec.alpha/fdef set-cognito-events :args (clojure.spec.alpha/tuple :portkey.aws.cognito-sync/set-cognito-events-request) :ret clojure.core/true?)

(clojure.core/defn set-identity-pool-configuration "Sets the necessary configuration for push sync.\n This API can only be called with developer credentials. You cannot call this\nAPI with the temporary user credentials provided by Cognito Identity." ([set-identity-pool-configuration-request] (portkey.aws/-rest-json-call portkey.aws.cognito-sync/endpoints "POST" "/identitypools/{IdentityPoolId}/configuration" set-identity-pool-configuration-request :portkey.aws.cognito-sync/set-identity-pool-configuration-request {:payload nil, :move {}, :headers {}, :uri {"IdentityPoolId" "IdentityPoolId"}, :querystring {}} 200 :portkey.aws.cognito-sync/set-identity-pool-configuration-response {"NotAuthorizedException" :portkey.aws.cognito-sync/not-authorized-exception, "InvalidParameterException" :portkey.aws.cognito-sync/invalid-parameter-exception, "ResourceNotFoundException" :portkey.aws.cognito-sync/resource-not-found-exception, "InternalErrorException" :portkey.aws.cognito-sync/internal-error-exception, "TooManyRequestsException" :portkey.aws.cognito-sync/too-many-requests-exception, "ConcurrentModificationException" :portkey.aws.cognito-sync/concurrent-modification-exception})))
(clojure.spec.alpha/fdef set-identity-pool-configuration :args (clojure.spec.alpha/tuple :portkey.aws.cognito-sync/set-identity-pool-configuration-request) :ret (clojure.spec.alpha/and :portkey.aws.cognito-sync/set-identity-pool-configuration-response))

(clojure.core/defn register-device "Registers a device to receive push sync notifications.\n This API can only be called with temporary credentials provided by Cognito\nIdentity. You cannot call this API with developer credentials." ([register-device-request] (portkey.aws/-rest-json-call portkey.aws.cognito-sync/endpoints "POST" "/identitypools/{IdentityPoolId}/identity/{IdentityId}/device" register-device-request :portkey.aws.cognito-sync/register-device-request {:payload nil, :move {}, :headers {}, :uri {"IdentityPoolId" "IdentityPoolId", "IdentityId" "IdentityId"}, :querystring {}} 200 :portkey.aws.cognito-sync/register-device-response {"NotAuthorizedException" :portkey.aws.cognito-sync/not-authorized-exception, "InvalidParameterException" :portkey.aws.cognito-sync/invalid-parameter-exception, "ResourceNotFoundException" :portkey.aws.cognito-sync/resource-not-found-exception, "InternalErrorException" :portkey.aws.cognito-sync/internal-error-exception, "InvalidConfigurationException" :portkey.aws.cognito-sync/invalid-configuration-exception, "TooManyRequestsException" :portkey.aws.cognito-sync/too-many-requests-exception})))
(clojure.spec.alpha/fdef register-device :args (clojure.spec.alpha/tuple :portkey.aws.cognito-sync/register-device-request) :ret (clojure.spec.alpha/and :portkey.aws.cognito-sync/register-device-response))

(clojure.core/defn update-records "Posts updates to records and adds and deletes records for a dataset and user.\n The sync count in the record patch is your last known sync count for that\nrecord. The server will reject an UpdateRecords request with a\nResourceConflictException if you try to patch a record with a new value but a\nstale sync count.\n For example, if the sync count on the server is 5 for a key called highScore\nand you try and submit a new highScore with sync count of 4, the request will be\nrejected. To obtain the current sync count for a record, call ListRecords. On a\nsuccessful update of the record, the response returns the new sync count for\nthat record. You should present that sync count the next time you try to update\nthat same record. When the record does not exist, specify the sync count as 0.\n This API can be called with temporary user credentials provided by Cognito\nIdentity or with developer credentials." ([update-records-request] (portkey.aws/-rest-json-call portkey.aws.cognito-sync/endpoints "POST" "/identitypools/{IdentityPoolId}/identities/{IdentityId}/datasets/{DatasetName}" update-records-request :portkey.aws.cognito-sync/update-records-request {:payload nil, :move {}, :headers {"ClientContext" ["x-amz-Client-Context" nil]}, :uri {"IdentityPoolId" "IdentityPoolId", "IdentityId" "IdentityId", "DatasetName" "DatasetName"}, :querystring {}} 200 :portkey.aws.cognito-sync/update-records-response {"LimitExceededException" :portkey.aws.cognito-sync/limit-exceeded-exception, "NotAuthorizedException" :portkey.aws.cognito-sync/not-authorized-exception, "TooManyRequestsException" :portkey.aws.cognito-sync/too-many-requests-exception, "InternalErrorException" :portkey.aws.cognito-sync/internal-error-exception, "ResourceNotFoundException" :portkey.aws.cognito-sync/resource-not-found-exception, "LambdaThrottledException" :portkey.aws.cognito-sync/lambda-throttled-exception, "ResourceConflictException" :portkey.aws.cognito-sync/resource-conflict-exception, "InvalidLambdaFunctionOutputException" :portkey.aws.cognito-sync/invalid-lambda-function-output-exception, "InvalidParameterException" :portkey.aws.cognito-sync/invalid-parameter-exception})))
(clojure.spec.alpha/fdef update-records :args (clojure.spec.alpha/tuple :portkey.aws.cognito-sync/update-records-request) :ret (clojure.spec.alpha/and :portkey.aws.cognito-sync/update-records-response))

(clojure.core/defn delete-dataset "Deletes the specific dataset. The dataset will be deleted permanently, and the\naction can't be undone. Datasets that this dataset was merged with will no\nlonger report the merge. Any subsequent operation on this dataset will result in\na ResourceNotFoundException.\n This API can be called with temporary user credentials provided by Cognito\nIdentity or with developer credentials." ([delete-dataset-request] (portkey.aws/-rest-json-call portkey.aws.cognito-sync/endpoints "DELETE" "/identitypools/{IdentityPoolId}/identities/{IdentityId}/datasets/{DatasetName}" delete-dataset-request :portkey.aws.cognito-sync/delete-dataset-request {:payload nil, :move {}, :headers {}, :uri {"IdentityPoolId" "IdentityPoolId", "IdentityId" "IdentityId", "DatasetName" "DatasetName"}, :querystring {}} 200 :portkey.aws.cognito-sync/delete-dataset-response {"NotAuthorizedException" :portkey.aws.cognito-sync/not-authorized-exception, "InvalidParameterException" :portkey.aws.cognito-sync/invalid-parameter-exception, "ResourceNotFoundException" :portkey.aws.cognito-sync/resource-not-found-exception, "InternalErrorException" :portkey.aws.cognito-sync/internal-error-exception, "TooManyRequestsException" :portkey.aws.cognito-sync/too-many-requests-exception, "ResourceConflictException" :portkey.aws.cognito-sync/resource-conflict-exception})))
(clojure.spec.alpha/fdef delete-dataset :args (clojure.spec.alpha/tuple :portkey.aws.cognito-sync/delete-dataset-request) :ret (clojure.spec.alpha/and :portkey.aws.cognito-sync/delete-dataset-response))

(clojure.core/defn bulk-publish "Initiates a bulk publish of all existing datasets for an Identity Pool to the\nconfigured stream. Customers are limited to one successful bulk publish per 24\nhours. Bulk publish is an asynchronous request, customers can see the status of\nthe request via the GetBulkPublishDetails operation.\n This API can only be called with developer credentials. You cannot call this\nAPI with the temporary user credentials provided by Cognito Identity." ([bulk-publish-request] (portkey.aws/-rest-json-call portkey.aws.cognito-sync/endpoints "POST" "/identitypools/{IdentityPoolId}/bulkpublish" bulk-publish-request :portkey.aws.cognito-sync/bulk-publish-request {:payload nil, :move {}, :headers {}, :uri {"IdentityPoolId" "IdentityPoolId"}, :querystring {}} 200 :portkey.aws.cognito-sync/bulk-publish-response {"NotAuthorizedException" :portkey.aws.cognito-sync/not-authorized-exception, "InvalidParameterException" :portkey.aws.cognito-sync/invalid-parameter-exception, "ResourceNotFoundException" :portkey.aws.cognito-sync/resource-not-found-exception, "InternalErrorException" :portkey.aws.cognito-sync/internal-error-exception, "DuplicateRequestException" :portkey.aws.cognito-sync/duplicate-request-exception, "AlreadyStreamedException" :portkey.aws.cognito-sync/already-streamed-exception})))
(clojure.spec.alpha/fdef bulk-publish :args (clojure.spec.alpha/tuple :portkey.aws.cognito-sync/bulk-publish-request) :ret (clojure.spec.alpha/and :portkey.aws.cognito-sync/bulk-publish-response))
