(ns portkey.aws.cognito-sync.-2014-06-30 (:require [portkey.aws]))

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

(clojure.spec.alpha/def :portkey.aws.cognito-sync.-2014-06-30.register-device-request/token (clojure.spec.alpha/and :portkey.aws.cognito-sync.-2014-06-30/push-token))
(clojure.spec.alpha/def :portkey.aws.cognito-sync.-2014-06-30/register-device-request (portkey.aws/json-keys :req-un [:portkey.aws.cognito-sync.-2014-06-30/IdentityPoolId :portkey.aws.cognito-sync.-2014-06-30/IdentityId :portkey.aws.cognito-sync.-2014-06-30/Platform :portkey.aws.cognito-sync.-2014-06-30.register-device-request/Token] :opt-un [] :locations {}))

(clojure.spec.alpha/def :portkey.aws.cognito-sync.-2014-06-30/record-key (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__96545__auto__] (clojure.core/<= 1 (clojure.core/count s__96545__auto__))) (clojure.core/fn [s__96546__auto__] (clojure.core/< (clojure.core/count s__96546__auto__) 1024))))

(clojure.spec.alpha/def :portkey.aws.cognito-sync.-2014-06-30.duplicate-request-exception/message (clojure.spec.alpha/and :portkey.aws.cognito-sync.-2014-06-30/exception-message))
(clojure.spec.alpha/def :portkey.aws.cognito-sync.-2014-06-30/duplicate-request-exception (portkey.aws/json-keys :req-un [:portkey.aws.cognito-sync.-2014-06-30.duplicate-request-exception/message] :opt-un [] :locations {}))

(clojure.spec.alpha/def :portkey.aws.cognito-sync.-2014-06-30/stream-name (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__96545__auto__] (clojure.core/<= 1 (clojure.core/count s__96545__auto__))) (clojure.core/fn [s__96546__auto__] (clojure.core/< (clojure.core/count s__96546__auto__) 128))))

(clojure.spec.alpha/def :portkey.aws.cognito-sync.-2014-06-30.dataset/creation-date (clojure.spec.alpha/and :portkey.aws.cognito-sync.-2014-06-30/date))
(clojure.spec.alpha/def :portkey.aws.cognito-sync.-2014-06-30.dataset/last-modified-date (clojure.spec.alpha/and :portkey.aws.cognito-sync.-2014-06-30/date))
(clojure.spec.alpha/def :portkey.aws.cognito-sync.-2014-06-30.dataset/last-modified-by (clojure.spec.alpha/and :portkey.aws.cognito-sync.-2014-06-30/string))
(clojure.spec.alpha/def :portkey.aws.cognito-sync.-2014-06-30.dataset/data-storage (clojure.spec.alpha/and :portkey.aws.cognito-sync.-2014-06-30/long))
(clojure.spec.alpha/def :portkey.aws.cognito-sync.-2014-06-30.dataset/num-records (clojure.spec.alpha/and :portkey.aws.cognito-sync.-2014-06-30/long))
(clojure.spec.alpha/def :portkey.aws.cognito-sync.-2014-06-30/dataset (portkey.aws/json-keys :req-un [] :opt-un [:portkey.aws.cognito-sync.-2014-06-30/IdentityId :portkey.aws.cognito-sync.-2014-06-30/DatasetName :portkey.aws.cognito-sync.-2014-06-30.dataset/CreationDate :portkey.aws.cognito-sync.-2014-06-30.dataset/LastModifiedDate :portkey.aws.cognito-sync.-2014-06-30.dataset/LastModifiedBy :portkey.aws.cognito-sync.-2014-06-30.dataset/DataStorage :portkey.aws.cognito-sync.-2014-06-30.dataset/NumRecords] :locations {}))

(clojure.spec.alpha/def :portkey.aws.cognito-sync.-2014-06-30/assume-role-arn (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__96545__auto__] (clojure.core/<= 20 (clojure.core/count s__96545__auto__))) (clojure.core/fn [s__96546__auto__] (clojure.core/< (clojure.core/count s__96546__auto__) 2048)) (clojure.core/fn [s__96547__auto__] (clojure.core/re-matches #"arn:aws:iam::\d+:role/.*" s__96547__auto__))))

(clojure.spec.alpha/def :portkey.aws.cognito-sync.-2014-06-30/platform (clojure.spec.alpha/conformer (clojure.core/let [m__96543__auto__ {"APNS" "APNS", :apns "APNS", "APNS_SANDBOX" "APNS_SANDBOX", :apns-sandbox "APNS_SANDBOX", "GCM" "GCM", :gcm "GCM", "ADM" "ADM", :adm "ADM"}] (clojure.core/fn [s__96544__auto__] (m__96543__auto__ s__96544__auto__ :clojure.spec.alpha/invalid))) (clojure.core/comp clojure.core/keyword portkey.aws/dashed)))

(clojure.spec.alpha/def :portkey.aws.cognito-sync.-2014-06-30/merged-dataset-name-list (clojure.spec.alpha/and (clojure.spec.alpha/coll-of :portkey.aws.cognito-sync.-2014-06-30/string :max-count nil) (clojure.spec.alpha/conformer clojure.core/identity (fn* [p1__129128__129129__auto__] (if (clojure.core/sequential? p1__129128__129129__auto__) p1__129128__129129__auto__ [p1__129128__129129__auto__])))))

(clojure.spec.alpha/def :portkey.aws.cognito-sync.-2014-06-30/describe-identity-pool-usage-response (portkey.aws/json-keys :req-un [] :opt-un [:portkey.aws.cognito-sync.-2014-06-30/IdentityPoolUsage] :locations {}))

(clojure.spec.alpha/def :portkey.aws.cognito-sync.-2014-06-30.push-sync/application-arns (clojure.spec.alpha/and :portkey.aws.cognito-sync.-2014-06-30/application-arn-list))
(clojure.spec.alpha/def :portkey.aws.cognito-sync.-2014-06-30.push-sync/role-arn (clojure.spec.alpha/and :portkey.aws.cognito-sync.-2014-06-30/assume-role-arn))
(clojure.spec.alpha/def :portkey.aws.cognito-sync.-2014-06-30/push-sync (portkey.aws/json-keys :req-un [] :opt-un [:portkey.aws.cognito-sync.-2014-06-30.push-sync/ApplicationArns :portkey.aws.cognito-sync.-2014-06-30.push-sync/RoleArn] :locations {}))

(clojure.spec.alpha/def :portkey.aws.cognito-sync.-2014-06-30/describe-identity-usage-response (portkey.aws/json-keys :req-un [] :opt-un [:portkey.aws.cognito-sync.-2014-06-30/IdentityUsage] :locations {}))

(clojure.spec.alpha/def :portkey.aws.cognito-sync.-2014-06-30/subscribe-to-dataset-request (portkey.aws/json-keys :req-un [:portkey.aws.cognito-sync.-2014-06-30/IdentityPoolId :portkey.aws.cognito-sync.-2014-06-30/IdentityId :portkey.aws.cognito-sync.-2014-06-30/DatasetName :portkey.aws.cognito-sync.-2014-06-30/DeviceId] :opt-un [] :locations {}))

(clojure.spec.alpha/def :portkey.aws.cognito-sync.-2014-06-30/unsubscribe-from-dataset-response (portkey.aws/json-keys :req-un [] :opt-un [] :locations {}))

(clojure.spec.alpha/def :portkey.aws.cognito-sync.-2014-06-30/application-arn (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__96547__auto__] (clojure.core/re-matches #"arn:aws:sns:[-0-9a-z]+:\d+:app/[A-Z_]+/[a-zA-Z0-9_.-]+" s__96547__auto__))))

(clojure.spec.alpha/def :portkey.aws.cognito-sync.-2014-06-30/sync-session-token (clojure.spec.alpha/and clojure.core/string?))

(clojure.spec.alpha/def :portkey.aws.cognito-sync.-2014-06-30/dataset-name (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__96545__auto__] (clojure.core/<= 1 (clojure.core/count s__96545__auto__))) (clojure.core/fn [s__96546__auto__] (clojure.core/< (clojure.core/count s__96546__auto__) 128)) (clojure.core/fn [s__96547__auto__] (clojure.core/re-matches #"[a-zA-Z0-9_.:-]+" s__96547__auto__))))

(clojure.spec.alpha/def :portkey.aws.cognito-sync.-2014-06-30/describe-identity-usage-request (portkey.aws/json-keys :req-un [:portkey.aws.cognito-sync.-2014-06-30/IdentityPoolId :portkey.aws.cognito-sync.-2014-06-30/IdentityId] :opt-un [] :locations {}))

(clojure.spec.alpha/def :portkey.aws.cognito-sync.-2014-06-30/set-cognito-events-request (portkey.aws/json-keys :req-un [:portkey.aws.cognito-sync.-2014-06-30/IdentityPoolId :portkey.aws.cognito-sync.-2014-06-30/Events] :opt-un [] :locations {}))

(clojure.spec.alpha/def :portkey.aws.cognito-sync.-2014-06-30/set-identity-pool-configuration-response (portkey.aws/json-keys :req-un [] :opt-un [:portkey.aws.cognito-sync.-2014-06-30/IdentityPoolId :portkey.aws.cognito-sync.-2014-06-30/PushSync :portkey.aws.cognito-sync.-2014-06-30/CognitoStreams] :locations {}))

(clojure.spec.alpha/def :portkey.aws.cognito-sync.-2014-06-30/get-identity-pool-configuration-request (portkey.aws/json-keys :req-un [:portkey.aws.cognito-sync.-2014-06-30/IdentityPoolId] :opt-un [] :locations {}))

(clojure.spec.alpha/def :portkey.aws.cognito-sync.-2014-06-30/set-identity-pool-configuration-request (portkey.aws/json-keys :req-un [:portkey.aws.cognito-sync.-2014-06-30/IdentityPoolId] :opt-un [:portkey.aws.cognito-sync.-2014-06-30/PushSync :portkey.aws.cognito-sync.-2014-06-30/CognitoStreams] :locations {}))

(clojure.spec.alpha/def :portkey.aws.cognito-sync.-2014-06-30.update-records-request/record-patches (clojure.spec.alpha/and :portkey.aws.cognito-sync.-2014-06-30/record-patch-list))
(clojure.spec.alpha/def :portkey.aws.cognito-sync.-2014-06-30/update-records-request (portkey.aws/json-keys :req-un [:portkey.aws.cognito-sync.-2014-06-30/IdentityPoolId :portkey.aws.cognito-sync.-2014-06-30/IdentityId :portkey.aws.cognito-sync.-2014-06-30/DatasetName :portkey.aws.cognito-sync.-2014-06-30/SyncSessionToken] :opt-un [:portkey.aws.cognito-sync.-2014-06-30/DeviceId :portkey.aws.cognito-sync.-2014-06-30.update-records-request/RecordPatches :portkey.aws.cognito-sync.-2014-06-30/ClientContext] :locations {}))

(clojure.spec.alpha/def :portkey.aws.cognito-sync.-2014-06-30.record-patch/op (clojure.spec.alpha/and :portkey.aws.cognito-sync.-2014-06-30/operation))
(clojure.spec.alpha/def :portkey.aws.cognito-sync.-2014-06-30.record-patch/key (clojure.spec.alpha/and :portkey.aws.cognito-sync.-2014-06-30/record-key))
(clojure.spec.alpha/def :portkey.aws.cognito-sync.-2014-06-30.record-patch/value (clojure.spec.alpha/and :portkey.aws.cognito-sync.-2014-06-30/record-value))
(clojure.spec.alpha/def :portkey.aws.cognito-sync.-2014-06-30.record-patch/sync-count (clojure.spec.alpha/and :portkey.aws.cognito-sync.-2014-06-30/long))
(clojure.spec.alpha/def :portkey.aws.cognito-sync.-2014-06-30.record-patch/device-last-modified-date (clojure.spec.alpha/and :portkey.aws.cognito-sync.-2014-06-30/date))
(clojure.spec.alpha/def :portkey.aws.cognito-sync.-2014-06-30/record-patch (portkey.aws/json-keys :req-un [:portkey.aws.cognito-sync.-2014-06-30.record-patch/Op :portkey.aws.cognito-sync.-2014-06-30.record-patch/Key :portkey.aws.cognito-sync.-2014-06-30.record-patch/SyncCount] :opt-un [:portkey.aws.cognito-sync.-2014-06-30.record-patch/Value :portkey.aws.cognito-sync.-2014-06-30.record-patch/DeviceLastModifiedDate] :locations {}))

(clojure.spec.alpha/def :portkey.aws.cognito-sync.-2014-06-30.list-identity-pool-usage-request/next-token (clojure.spec.alpha/and :portkey.aws.cognito-sync.-2014-06-30/string))
(clojure.spec.alpha/def :portkey.aws.cognito-sync.-2014-06-30.list-identity-pool-usage-request/max-results (clojure.spec.alpha/and :portkey.aws.cognito-sync.-2014-06-30/integer-string))
(clojure.spec.alpha/def :portkey.aws.cognito-sync.-2014-06-30/list-identity-pool-usage-request (portkey.aws/json-keys :req-un [] :opt-un [:portkey.aws.cognito-sync.-2014-06-30.list-identity-pool-usage-request/NextToken :portkey.aws.cognito-sync.-2014-06-30.list-identity-pool-usage-request/MaxResults] :locations {}))

(clojure.spec.alpha/def :portkey.aws.cognito-sync.-2014-06-30.cognito-streams/role-arn (clojure.spec.alpha/and :portkey.aws.cognito-sync.-2014-06-30/assume-role-arn))
(clojure.spec.alpha/def :portkey.aws.cognito-sync.-2014-06-30/cognito-streams (portkey.aws/json-keys :req-un [] :opt-un [:portkey.aws.cognito-sync.-2014-06-30/StreamName :portkey.aws.cognito-sync.-2014-06-30.cognito-streams/RoleArn :portkey.aws.cognito-sync.-2014-06-30/StreamingStatus] :locations {}))

(clojure.spec.alpha/def :portkey.aws.cognito-sync.-2014-06-30/cognito-event-type (clojure.spec.alpha/and clojure.core/string?))

(clojure.spec.alpha/def :portkey.aws.cognito-sync.-2014-06-30/push-token (clojure.spec.alpha/and clojure.core/string?))

(clojure.spec.alpha/def :portkey.aws.cognito-sync.-2014-06-30/application-arn-list (clojure.spec.alpha/and (clojure.spec.alpha/coll-of :portkey.aws.cognito-sync.-2014-06-30/application-arn :max-count nil) (clojure.spec.alpha/conformer clojure.core/identity (fn* [p1__129128__129129__auto__] (if (clojure.core/sequential? p1__129128__129129__auto__) p1__129128__129129__auto__ [p1__129128__129129__auto__])))))

(clojure.spec.alpha/def :portkey.aws.cognito-sync.-2014-06-30/get-cognito-events-request (portkey.aws/json-keys :req-un [:portkey.aws.cognito-sync.-2014-06-30/IdentityPoolId] :opt-un [] :locations {}))

(clojure.spec.alpha/def :portkey.aws.cognito-sync.-2014-06-30.limit-exceeded-exception/message (clojure.spec.alpha/and :portkey.aws.cognito-sync.-2014-06-30/exception-message))
(clojure.spec.alpha/def :portkey.aws.cognito-sync.-2014-06-30/limit-exceeded-exception (portkey.aws/json-keys :req-un [:portkey.aws.cognito-sync.-2014-06-30.limit-exceeded-exception/message] :opt-un [] :locations {}))

(clojure.spec.alpha/def :portkey.aws.cognito-sync.-2014-06-30.already-streamed-exception/message (clojure.spec.alpha/and :portkey.aws.cognito-sync.-2014-06-30/exception-message))
(clojure.spec.alpha/def :portkey.aws.cognito-sync.-2014-06-30/already-streamed-exception (portkey.aws/json-keys :req-un [:portkey.aws.cognito-sync.-2014-06-30.already-streamed-exception/message] :opt-un [] :locations {}))

(clojure.spec.alpha/def :portkey.aws.cognito-sync.-2014-06-30.not-authorized-exception/message (clojure.spec.alpha/and :portkey.aws.cognito-sync.-2014-06-30/exception-message))
(clojure.spec.alpha/def :portkey.aws.cognito-sync.-2014-06-30/not-authorized-exception (portkey.aws/json-keys :req-un [:portkey.aws.cognito-sync.-2014-06-30.not-authorized-exception/message] :opt-un [] :locations {}))

(clojure.spec.alpha/def :portkey.aws.cognito-sync.-2014-06-30/operation (clojure.spec.alpha/conformer (clojure.core/let [m__96543__auto__ {"replace" "replace", :replace "replace", "remove" "remove", :remove "remove"}] (clojure.core/fn [s__96544__auto__] (m__96543__auto__ s__96544__auto__ :clojure.spec.alpha/invalid))) (clojure.core/comp clojure.core/keyword portkey.aws/dashed)))

(clojure.spec.alpha/def :portkey.aws.cognito-sync.-2014-06-30/identity-pool-id (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__96545__auto__] (clojure.core/<= 1 (clojure.core/count s__96545__auto__))) (clojure.core/fn [s__96546__auto__] (clojure.core/< (clojure.core/count s__96546__auto__) 55)) (clojure.core/fn [s__96547__auto__] (clojure.core/re-matches #"[\w-]+:[0-9a-f-]+" s__96547__auto__))))

(clojure.spec.alpha/def :portkey.aws.cognito-sync.-2014-06-30/events (clojure.spec.alpha/map-of :portkey.aws.cognito-sync.-2014-06-30/cognito-event-type :portkey.aws.cognito-sync.-2014-06-30/lambda-function-arn))

(clojure.spec.alpha/def :portkey.aws.cognito-sync.-2014-06-30/describe-identity-pool-usage-request (portkey.aws/json-keys :req-un [:portkey.aws.cognito-sync.-2014-06-30/IdentityPoolId] :opt-un [] :locations {}))

(clojure.spec.alpha/def :portkey.aws.cognito-sync.-2014-06-30.update-records-response/records (clojure.spec.alpha/and :portkey.aws.cognito-sync.-2014-06-30/record-list))
(clojure.spec.alpha/def :portkey.aws.cognito-sync.-2014-06-30/update-records-response (portkey.aws/json-keys :req-un [] :opt-un [:portkey.aws.cognito-sync.-2014-06-30.update-records-response/Records] :locations {}))

(clojure.spec.alpha/def :portkey.aws.cognito-sync.-2014-06-30/delete-dataset-response (portkey.aws/json-keys :req-un [] :opt-un [:portkey.aws.cognito-sync.-2014-06-30/Dataset] :locations {}))

(clojure.spec.alpha/def :portkey.aws.cognito-sync.-2014-06-30/bulk-publish-status (clojure.spec.alpha/conformer (clojure.core/let [m__96543__auto__ {"NOT_STARTED" "NOT_STARTED", :not-started "NOT_STARTED", "IN_PROGRESS" "IN_PROGRESS", :in-progress "IN_PROGRESS", "FAILED" "FAILED", :failed "FAILED", "SUCCEEDED" "SUCCEEDED", :succeeded "SUCCEEDED"}] (clojure.core/fn [s__96544__auto__] (m__96543__auto__ s__96544__auto__ :clojure.spec.alpha/invalid))) (clojure.core/comp clojure.core/keyword portkey.aws/dashed)))

(clojure.spec.alpha/def :portkey.aws.cognito-sync.-2014-06-30/date clojure.core/inst?)

(clojure.spec.alpha/def :portkey.aws.cognito-sync.-2014-06-30/identity-id (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__96545__auto__] (clojure.core/<= 1 (clojure.core/count s__96545__auto__))) (clojure.core/fn [s__96546__auto__] (clojure.core/< (clojure.core/count s__96546__auto__) 55)) (clojure.core/fn [s__96547__auto__] (clojure.core/re-matches #"[\w-]+:[0-9a-f-]+" s__96547__auto__))))

(clojure.spec.alpha/def :portkey.aws.cognito-sync.-2014-06-30.get-bulk-publish-details-response/bulk-publish-start-time (clojure.spec.alpha/and :portkey.aws.cognito-sync.-2014-06-30/date))
(clojure.spec.alpha/def :portkey.aws.cognito-sync.-2014-06-30.get-bulk-publish-details-response/bulk-publish-complete-time (clojure.spec.alpha/and :portkey.aws.cognito-sync.-2014-06-30/date))
(clojure.spec.alpha/def :portkey.aws.cognito-sync.-2014-06-30.get-bulk-publish-details-response/failure-message (clojure.spec.alpha/and :portkey.aws.cognito-sync.-2014-06-30/string))
(clojure.spec.alpha/def :portkey.aws.cognito-sync.-2014-06-30/get-bulk-publish-details-response (portkey.aws/json-keys :req-un [] :opt-un [:portkey.aws.cognito-sync.-2014-06-30/IdentityPoolId :portkey.aws.cognito-sync.-2014-06-30.get-bulk-publish-details-response/BulkPublishStartTime :portkey.aws.cognito-sync.-2014-06-30.get-bulk-publish-details-response/BulkPublishCompleteTime :portkey.aws.cognito-sync.-2014-06-30/BulkPublishStatus :portkey.aws.cognito-sync.-2014-06-30.get-bulk-publish-details-response/FailureMessage] :locations {}))

(clojure.spec.alpha/def :portkey.aws.cognito-sync.-2014-06-30.too-many-requests-exception/message (clojure.spec.alpha/and :portkey.aws.cognito-sync.-2014-06-30/exception-message))
(clojure.spec.alpha/def :portkey.aws.cognito-sync.-2014-06-30/too-many-requests-exception (portkey.aws/json-keys :req-un [:portkey.aws.cognito-sync.-2014-06-30.too-many-requests-exception/message] :opt-un [] :locations {}))

(clojure.spec.alpha/def :portkey.aws.cognito-sync.-2014-06-30.internal-error-exception/message (clojure.spec.alpha/and :portkey.aws.cognito-sync.-2014-06-30/exception-message))
(clojure.spec.alpha/def :portkey.aws.cognito-sync.-2014-06-30/internal-error-exception (portkey.aws/json-keys :req-un [:portkey.aws.cognito-sync.-2014-06-30.internal-error-exception/message] :opt-un [] :locations {}))

(clojure.spec.alpha/def :portkey.aws.cognito-sync.-2014-06-30/integer-string (clojure.spec.alpha/and clojure.core/int?))

(clojure.spec.alpha/def :portkey.aws.cognito-sync.-2014-06-30.list-datasets-request/next-token (clojure.spec.alpha/and :portkey.aws.cognito-sync.-2014-06-30/string))
(clojure.spec.alpha/def :portkey.aws.cognito-sync.-2014-06-30.list-datasets-request/max-results (clojure.spec.alpha/and :portkey.aws.cognito-sync.-2014-06-30/integer-string))
(clojure.spec.alpha/def :portkey.aws.cognito-sync.-2014-06-30/list-datasets-request (portkey.aws/json-keys :req-un [:portkey.aws.cognito-sync.-2014-06-30/IdentityId :portkey.aws.cognito-sync.-2014-06-30/IdentityPoolId] :opt-un [:portkey.aws.cognito-sync.-2014-06-30.list-datasets-request/NextToken :portkey.aws.cognito-sync.-2014-06-30.list-datasets-request/MaxResults] :locations {}))

(clojure.spec.alpha/def :portkey.aws.cognito-sync.-2014-06-30.resource-not-found-exception/message (clojure.spec.alpha/and :portkey.aws.cognito-sync.-2014-06-30/exception-message))
(clojure.spec.alpha/def :portkey.aws.cognito-sync.-2014-06-30/resource-not-found-exception (portkey.aws/json-keys :req-un [:portkey.aws.cognito-sync.-2014-06-30.resource-not-found-exception/message] :opt-un [] :locations {}))

(clojure.spec.alpha/def :portkey.aws.cognito-sync.-2014-06-30/client-context (clojure.spec.alpha/and clojure.core/string?))

(clojure.spec.alpha/def :portkey.aws.cognito-sync.-2014-06-30/streaming-status (clojure.spec.alpha/conformer (clojure.core/let [m__96543__auto__ {"ENABLED" "ENABLED", :enabled "ENABLED", "DISABLED" "DISABLED", :disabled "DISABLED"}] (clojure.core/fn [s__96544__auto__] (m__96543__auto__ s__96544__auto__ :clojure.spec.alpha/invalid))) (clojure.core/comp clojure.core/keyword portkey.aws/dashed)))

(clojure.spec.alpha/def :portkey.aws.cognito-sync.-2014-06-30/get-cognito-events-response (portkey.aws/json-keys :req-un [] :opt-un [:portkey.aws.cognito-sync.-2014-06-30/Events] :locations {}))

(clojure.spec.alpha/def :portkey.aws.cognito-sync.-2014-06-30/delete-dataset-request (portkey.aws/json-keys :req-un [:portkey.aws.cognito-sync.-2014-06-30/IdentityPoolId :portkey.aws.cognito-sync.-2014-06-30/IdentityId :portkey.aws.cognito-sync.-2014-06-30/DatasetName] :opt-un [] :locations {}))

(clojure.spec.alpha/def :portkey.aws.cognito-sync.-2014-06-30/lambda-function-arn (clojure.spec.alpha/and clojure.core/string?))

(clojure.spec.alpha/def :portkey.aws.cognito-sync.-2014-06-30/exception-message (clojure.spec.alpha/and clojure.core/string?))

(clojure.spec.alpha/def :portkey.aws.cognito-sync.-2014-06-30/describe-dataset-request (portkey.aws/json-keys :req-un [:portkey.aws.cognito-sync.-2014-06-30/IdentityPoolId :portkey.aws.cognito-sync.-2014-06-30/IdentityId :portkey.aws.cognito-sync.-2014-06-30/DatasetName] :opt-un [] :locations {}))

(clojure.spec.alpha/def :portkey.aws.cognito-sync.-2014-06-30.lambda-throttled-exception/message (clojure.spec.alpha/and :portkey.aws.cognito-sync.-2014-06-30/exception-message))
(clojure.spec.alpha/def :portkey.aws.cognito-sync.-2014-06-30/lambda-throttled-exception (portkey.aws/json-keys :req-un [:portkey.aws.cognito-sync.-2014-06-30.lambda-throttled-exception/message] :opt-un [] :locations {}))

(clojure.spec.alpha/def :portkey.aws.cognito-sync.-2014-06-30/describe-dataset-response (portkey.aws/json-keys :req-un [] :opt-un [:portkey.aws.cognito-sync.-2014-06-30/Dataset] :locations {}))

(clojure.spec.alpha/def :portkey.aws.cognito-sync.-2014-06-30/integer (clojure.spec.alpha/and clojure.core/int?))

(clojure.spec.alpha/def :portkey.aws.cognito-sync.-2014-06-30/string (clojure.spec.alpha/and clojure.core/string?))

(clojure.spec.alpha/def :portkey.aws.cognito-sync.-2014-06-30/record-patch-list (clojure.spec.alpha/and (clojure.spec.alpha/coll-of :portkey.aws.cognito-sync.-2014-06-30/record-patch :max-count nil) (clojure.spec.alpha/conformer clojure.core/identity (fn* [p1__129128__129129__auto__] (if (clojure.core/sequential? p1__129128__129129__auto__) p1__129128__129129__auto__ [p1__129128__129129__auto__])))))

(clojure.spec.alpha/def :portkey.aws.cognito-sync.-2014-06-30/bulk-publish-request (portkey.aws/json-keys :req-un [:portkey.aws.cognito-sync.-2014-06-30/IdentityPoolId] :opt-un [] :locations {}))

(clojure.spec.alpha/def :portkey.aws.cognito-sync.-2014-06-30.record/key (clojure.spec.alpha/and :portkey.aws.cognito-sync.-2014-06-30/record-key))
(clojure.spec.alpha/def :portkey.aws.cognito-sync.-2014-06-30.record/value (clojure.spec.alpha/and :portkey.aws.cognito-sync.-2014-06-30/record-value))
(clojure.spec.alpha/def :portkey.aws.cognito-sync.-2014-06-30.record/sync-count (clojure.spec.alpha/and :portkey.aws.cognito-sync.-2014-06-30/long))
(clojure.spec.alpha/def :portkey.aws.cognito-sync.-2014-06-30.record/last-modified-date (clojure.spec.alpha/and :portkey.aws.cognito-sync.-2014-06-30/date))
(clojure.spec.alpha/def :portkey.aws.cognito-sync.-2014-06-30.record/last-modified-by (clojure.spec.alpha/and :portkey.aws.cognito-sync.-2014-06-30/string))
(clojure.spec.alpha/def :portkey.aws.cognito-sync.-2014-06-30.record/device-last-modified-date (clojure.spec.alpha/and :portkey.aws.cognito-sync.-2014-06-30/date))
(clojure.spec.alpha/def :portkey.aws.cognito-sync.-2014-06-30/record (portkey.aws/json-keys :req-un [] :opt-un [:portkey.aws.cognito-sync.-2014-06-30.record/Key :portkey.aws.cognito-sync.-2014-06-30.record/Value :portkey.aws.cognito-sync.-2014-06-30.record/SyncCount :portkey.aws.cognito-sync.-2014-06-30.record/LastModifiedDate :portkey.aws.cognito-sync.-2014-06-30.record/LastModifiedBy :portkey.aws.cognito-sync.-2014-06-30.record/DeviceLastModifiedDate] :locations {}))

(clojure.spec.alpha/def :portkey.aws.cognito-sync.-2014-06-30/record-list (clojure.spec.alpha/and (clojure.spec.alpha/coll-of :portkey.aws.cognito-sync.-2014-06-30/record :max-count nil) (clojure.spec.alpha/conformer clojure.core/identity (fn* [p1__129128__129129__auto__] (if (clojure.core/sequential? p1__129128__129129__auto__) p1__129128__129129__auto__ [p1__129128__129129__auto__])))))

(clojure.spec.alpha/def :portkey.aws.cognito-sync.-2014-06-30.resource-conflict-exception/message (clojure.spec.alpha/and :portkey.aws.cognito-sync.-2014-06-30/exception-message))
(clojure.spec.alpha/def :portkey.aws.cognito-sync.-2014-06-30/resource-conflict-exception (portkey.aws/json-keys :req-un [:portkey.aws.cognito-sync.-2014-06-30.resource-conflict-exception/message] :opt-un [] :locations {}))

(clojure.spec.alpha/def :portkey.aws.cognito-sync.-2014-06-30/device-id (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__96545__auto__] (clojure.core/<= 1 (clojure.core/count s__96545__auto__))) (clojure.core/fn [s__96546__auto__] (clojure.core/< (clojure.core/count s__96546__auto__) 256))))

(clojure.spec.alpha/def :portkey.aws.cognito-sync.-2014-06-30/identity-pool-usage-list (clojure.spec.alpha/and (clojure.spec.alpha/coll-of :portkey.aws.cognito-sync.-2014-06-30/identity-pool-usage :max-count nil) (clojure.spec.alpha/conformer clojure.core/identity (fn* [p1__129128__129129__auto__] (if (clojure.core/sequential? p1__129128__129129__auto__) p1__129128__129129__auto__ [p1__129128__129129__auto__])))))

(clojure.spec.alpha/def :portkey.aws.cognito-sync.-2014-06-30.invalid-lambda-function-output-exception/message (clojure.spec.alpha/and :portkey.aws.cognito-sync.-2014-06-30/exception-message))
(clojure.spec.alpha/def :portkey.aws.cognito-sync.-2014-06-30/invalid-lambda-function-output-exception (portkey.aws/json-keys :req-un [:portkey.aws.cognito-sync.-2014-06-30.invalid-lambda-function-output-exception/message] :opt-un [] :locations {}))

(clojure.spec.alpha/def :portkey.aws.cognito-sync.-2014-06-30/get-identity-pool-configuration-response (portkey.aws/json-keys :req-un [] :opt-un [:portkey.aws.cognito-sync.-2014-06-30/IdentityPoolId :portkey.aws.cognito-sync.-2014-06-30/PushSync :portkey.aws.cognito-sync.-2014-06-30/CognitoStreams] :locations {}))

(clojure.spec.alpha/def :portkey.aws.cognito-sync.-2014-06-30/long clojure.core/int?)

(clojure.spec.alpha/def :portkey.aws.cognito-sync.-2014-06-30.list-records-response/sync-session-token (clojure.spec.alpha/and :portkey.aws.cognito-sync.-2014-06-30/string))
(clojure.spec.alpha/def :portkey.aws.cognito-sync.-2014-06-30.list-records-response/dataset-sync-count (clojure.spec.alpha/and :portkey.aws.cognito-sync.-2014-06-30/long))
(clojure.spec.alpha/def :portkey.aws.cognito-sync.-2014-06-30.list-records-response/count (clojure.spec.alpha/and :portkey.aws.cognito-sync.-2014-06-30/integer))
(clojure.spec.alpha/def :portkey.aws.cognito-sync.-2014-06-30.list-records-response/next-token (clojure.spec.alpha/and :portkey.aws.cognito-sync.-2014-06-30/string))
(clojure.spec.alpha/def :portkey.aws.cognito-sync.-2014-06-30.list-records-response/dataset-exists (clojure.spec.alpha/and :portkey.aws.cognito-sync.-2014-06-30/boolean))
(clojure.spec.alpha/def :portkey.aws.cognito-sync.-2014-06-30.list-records-response/dataset-deleted-after-requested-sync-count (clojure.spec.alpha/and :portkey.aws.cognito-sync.-2014-06-30/boolean))
(clojure.spec.alpha/def :portkey.aws.cognito-sync.-2014-06-30.list-records-response/merged-dataset-names (clojure.spec.alpha/and :portkey.aws.cognito-sync.-2014-06-30/merged-dataset-name-list))
(clojure.spec.alpha/def :portkey.aws.cognito-sync.-2014-06-30.list-records-response/records (clojure.spec.alpha/and :portkey.aws.cognito-sync.-2014-06-30/record-list))
(clojure.spec.alpha/def :portkey.aws.cognito-sync.-2014-06-30.list-records-response/last-modified-by (clojure.spec.alpha/and :portkey.aws.cognito-sync.-2014-06-30/string))
(clojure.spec.alpha/def :portkey.aws.cognito-sync.-2014-06-30/list-records-response (portkey.aws/json-keys :req-un [] :opt-un [:portkey.aws.cognito-sync.-2014-06-30.list-records-response/SyncSessionToken :portkey.aws.cognito-sync.-2014-06-30.list-records-response/DatasetSyncCount :portkey.aws.cognito-sync.-2014-06-30.list-records-response/Count :portkey.aws.cognito-sync.-2014-06-30.list-records-response/NextToken :portkey.aws.cognito-sync.-2014-06-30.list-records-response/DatasetExists :portkey.aws.cognito-sync.-2014-06-30.list-records-response/DatasetDeletedAfterRequestedSyncCount :portkey.aws.cognito-sync.-2014-06-30.list-records-response/MergedDatasetNames :portkey.aws.cognito-sync.-2014-06-30.list-records-response/Records :portkey.aws.cognito-sync.-2014-06-30.list-records-response/LastModifiedBy] :locations {}))

(clojure.spec.alpha/def :portkey.aws.cognito-sync.-2014-06-30/subscribe-to-dataset-response (portkey.aws/json-keys :req-un [] :opt-un [] :locations {}))

(clojure.spec.alpha/def :portkey.aws.cognito-sync.-2014-06-30/record-value (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__96546__auto__] (clojure.core/< (clojure.core/count s__96546__auto__) 1048575))))

(clojure.spec.alpha/def :portkey.aws.cognito-sync.-2014-06-30/bulk-publish-response (portkey.aws/json-keys :req-un [] :opt-un [:portkey.aws.cognito-sync.-2014-06-30/IdentityPoolId] :locations {}))

(clojure.spec.alpha/def :portkey.aws.cognito-sync.-2014-06-30/unsubscribe-from-dataset-request (portkey.aws/json-keys :req-un [:portkey.aws.cognito-sync.-2014-06-30/IdentityPoolId :portkey.aws.cognito-sync.-2014-06-30/IdentityId :portkey.aws.cognito-sync.-2014-06-30/DatasetName :portkey.aws.cognito-sync.-2014-06-30/DeviceId] :opt-un [] :locations {}))

(clojure.spec.alpha/def :portkey.aws.cognito-sync.-2014-06-30.concurrent-modification-exception/message (clojure.spec.alpha/and :portkey.aws.cognito-sync.-2014-06-30/string))
(clojure.spec.alpha/def :portkey.aws.cognito-sync.-2014-06-30/concurrent-modification-exception (portkey.aws/json-keys :req-un [:portkey.aws.cognito-sync.-2014-06-30.concurrent-modification-exception/message] :opt-un [] :locations {}))

(clojure.spec.alpha/def :portkey.aws.cognito-sync.-2014-06-30/dataset-list (clojure.spec.alpha/and (clojure.spec.alpha/coll-of :portkey.aws.cognito-sync.-2014-06-30/dataset :max-count nil) (clojure.spec.alpha/conformer clojure.core/identity (fn* [p1__129128__129129__auto__] (if (clojure.core/sequential? p1__129128__129129__auto__) p1__129128__129129__auto__ [p1__129128__129129__auto__])))))

(clojure.spec.alpha/def :portkey.aws.cognito-sync.-2014-06-30.list-identity-pool-usage-response/identity-pool-usages (clojure.spec.alpha/and :portkey.aws.cognito-sync.-2014-06-30/identity-pool-usage-list))
(clojure.spec.alpha/def :portkey.aws.cognito-sync.-2014-06-30.list-identity-pool-usage-response/max-results (clojure.spec.alpha/and :portkey.aws.cognito-sync.-2014-06-30/integer))
(clojure.spec.alpha/def :portkey.aws.cognito-sync.-2014-06-30.list-identity-pool-usage-response/count (clojure.spec.alpha/and :portkey.aws.cognito-sync.-2014-06-30/integer))
(clojure.spec.alpha/def :portkey.aws.cognito-sync.-2014-06-30.list-identity-pool-usage-response/next-token (clojure.spec.alpha/and :portkey.aws.cognito-sync.-2014-06-30/string))
(clojure.spec.alpha/def :portkey.aws.cognito-sync.-2014-06-30/list-identity-pool-usage-response (portkey.aws/json-keys :req-un [] :opt-un [:portkey.aws.cognito-sync.-2014-06-30.list-identity-pool-usage-response/IdentityPoolUsages :portkey.aws.cognito-sync.-2014-06-30.list-identity-pool-usage-response/MaxResults :portkey.aws.cognito-sync.-2014-06-30.list-identity-pool-usage-response/Count :portkey.aws.cognito-sync.-2014-06-30.list-identity-pool-usage-response/NextToken] :locations {}))

(clojure.spec.alpha/def :portkey.aws.cognito-sync.-2014-06-30.identity-pool-usage/sync-sessions-count (clojure.spec.alpha/and :portkey.aws.cognito-sync.-2014-06-30/long))
(clojure.spec.alpha/def :portkey.aws.cognito-sync.-2014-06-30.identity-pool-usage/data-storage (clojure.spec.alpha/and :portkey.aws.cognito-sync.-2014-06-30/long))
(clojure.spec.alpha/def :portkey.aws.cognito-sync.-2014-06-30.identity-pool-usage/last-modified-date (clojure.spec.alpha/and :portkey.aws.cognito-sync.-2014-06-30/date))
(clojure.spec.alpha/def :portkey.aws.cognito-sync.-2014-06-30/identity-pool-usage (portkey.aws/json-keys :req-un [] :opt-un [:portkey.aws.cognito-sync.-2014-06-30/IdentityPoolId :portkey.aws.cognito-sync.-2014-06-30.identity-pool-usage/SyncSessionsCount :portkey.aws.cognito-sync.-2014-06-30.identity-pool-usage/DataStorage :portkey.aws.cognito-sync.-2014-06-30.identity-pool-usage/LastModifiedDate] :locations {}))

(clojure.spec.alpha/def :portkey.aws.cognito-sync.-2014-06-30.list-records-request/last-sync-count (clojure.spec.alpha/and :portkey.aws.cognito-sync.-2014-06-30/long))
(clojure.spec.alpha/def :portkey.aws.cognito-sync.-2014-06-30.list-records-request/next-token (clojure.spec.alpha/and :portkey.aws.cognito-sync.-2014-06-30/string))
(clojure.spec.alpha/def :portkey.aws.cognito-sync.-2014-06-30.list-records-request/max-results (clojure.spec.alpha/and :portkey.aws.cognito-sync.-2014-06-30/integer-string))
(clojure.spec.alpha/def :portkey.aws.cognito-sync.-2014-06-30/list-records-request (portkey.aws/json-keys :req-un [:portkey.aws.cognito-sync.-2014-06-30/IdentityPoolId :portkey.aws.cognito-sync.-2014-06-30/IdentityId :portkey.aws.cognito-sync.-2014-06-30/DatasetName] :opt-un [:portkey.aws.cognito-sync.-2014-06-30.list-records-request/LastSyncCount :portkey.aws.cognito-sync.-2014-06-30.list-records-request/NextToken :portkey.aws.cognito-sync.-2014-06-30.list-records-request/MaxResults :portkey.aws.cognito-sync.-2014-06-30/SyncSessionToken] :locations {}))

(clojure.spec.alpha/def :portkey.aws.cognito-sync.-2014-06-30.invalid-parameter-exception/message (clojure.spec.alpha/and :portkey.aws.cognito-sync.-2014-06-30/exception-message))
(clojure.spec.alpha/def :portkey.aws.cognito-sync.-2014-06-30/invalid-parameter-exception (portkey.aws/json-keys :req-un [:portkey.aws.cognito-sync.-2014-06-30.invalid-parameter-exception/message] :opt-un [] :locations {}))

(clojure.spec.alpha/def :portkey.aws.cognito-sync.-2014-06-30/register-device-response (portkey.aws/json-keys :req-un [] :opt-un [:portkey.aws.cognito-sync.-2014-06-30/DeviceId] :locations {}))

(clojure.spec.alpha/def :portkey.aws.cognito-sync.-2014-06-30.identity-usage/last-modified-date (clojure.spec.alpha/and :portkey.aws.cognito-sync.-2014-06-30/date))
(clojure.spec.alpha/def :portkey.aws.cognito-sync.-2014-06-30.identity-usage/dataset-count (clojure.spec.alpha/and :portkey.aws.cognito-sync.-2014-06-30/integer))
(clojure.spec.alpha/def :portkey.aws.cognito-sync.-2014-06-30.identity-usage/data-storage (clojure.spec.alpha/and :portkey.aws.cognito-sync.-2014-06-30/long))
(clojure.spec.alpha/def :portkey.aws.cognito-sync.-2014-06-30/identity-usage (portkey.aws/json-keys :req-un [] :opt-un [:portkey.aws.cognito-sync.-2014-06-30/IdentityId :portkey.aws.cognito-sync.-2014-06-30/IdentityPoolId :portkey.aws.cognito-sync.-2014-06-30.identity-usage/LastModifiedDate :portkey.aws.cognito-sync.-2014-06-30.identity-usage/DatasetCount :portkey.aws.cognito-sync.-2014-06-30.identity-usage/DataStorage] :locations {}))

(clojure.spec.alpha/def :portkey.aws.cognito-sync.-2014-06-30.list-datasets-response/datasets (clojure.spec.alpha/and :portkey.aws.cognito-sync.-2014-06-30/dataset-list))
(clojure.spec.alpha/def :portkey.aws.cognito-sync.-2014-06-30.list-datasets-response/count (clojure.spec.alpha/and :portkey.aws.cognito-sync.-2014-06-30/integer))
(clojure.spec.alpha/def :portkey.aws.cognito-sync.-2014-06-30.list-datasets-response/next-token (clojure.spec.alpha/and :portkey.aws.cognito-sync.-2014-06-30/string))
(clojure.spec.alpha/def :portkey.aws.cognito-sync.-2014-06-30/list-datasets-response (portkey.aws/json-keys :req-un [] :opt-un [:portkey.aws.cognito-sync.-2014-06-30.list-datasets-response/Datasets :portkey.aws.cognito-sync.-2014-06-30.list-datasets-response/Count :portkey.aws.cognito-sync.-2014-06-30.list-datasets-response/NextToken] :locations {}))

(clojure.spec.alpha/def :portkey.aws.cognito-sync.-2014-06-30.invalid-configuration-exception/message (clojure.spec.alpha/and :portkey.aws.cognito-sync.-2014-06-30/exception-message))
(clojure.spec.alpha/def :portkey.aws.cognito-sync.-2014-06-30/invalid-configuration-exception (portkey.aws/json-keys :req-un [:portkey.aws.cognito-sync.-2014-06-30.invalid-configuration-exception/message] :opt-un [] :locations {}))

(clojure.spec.alpha/def :portkey.aws.cognito-sync.-2014-06-30/get-bulk-publish-details-request (portkey.aws/json-keys :req-un [:portkey.aws.cognito-sync.-2014-06-30/IdentityPoolId] :opt-un [] :locations {}))

(clojure.spec.alpha/def :portkey.aws.cognito-sync.-2014-06-30/boolean clojure.core/boolean?)

(clojure.core/defn list-records ([list-records-request] (portkey.aws/-rest-json-call portkey.aws.cognito-sync.-2014-06-30/endpoints "GET" "/identitypools/{IdentityPoolId}/identities/{IdentityId}/datasets/{DatasetName}/records" list-records-request :portkey.aws.cognito-sync.-2014-06-30/list-records-request {:payload nil, :move {}, :headers {}, :uri {"IdentityPoolId" "IdentityPoolId", "IdentityId" "IdentityId", "DatasetName" "DatasetName"}, :querystring {"lastSyncCount" "LastSyncCount", "nextToken" "NextToken", "maxResults" "MaxResults", "syncSessionToken" "SyncSessionToken"}} 200 :portkey.aws.cognito-sync.-2014-06-30/list-records-response {"InvalidParameterException" :portkey.aws.cognito-sync.-2014-06-30/invalid-parameter-exception, "NotAuthorizedException" :portkey.aws.cognito-sync.-2014-06-30/not-authorized-exception, "TooManyRequestsException" :portkey.aws.cognito-sync.-2014-06-30/too-many-requests-exception, "InternalErrorException" :portkey.aws.cognito-sync.-2014-06-30/internal-error-exception})))
(clojure.spec.alpha/fdef list-records :args (clojure.spec.alpha/tuple :portkey.aws.cognito-sync.-2014-06-30/list-records-request) :ret (clojure.spec.alpha/and :portkey.aws.cognito-sync.-2014-06-30/list-records-response))

(clojure.core/defn describe-dataset ([describe-dataset-request] (portkey.aws/-rest-json-call portkey.aws.cognito-sync.-2014-06-30/endpoints "GET" "/identitypools/{IdentityPoolId}/identities/{IdentityId}/datasets/{DatasetName}" describe-dataset-request :portkey.aws.cognito-sync.-2014-06-30/describe-dataset-request {:payload nil, :move {}, :headers {}, :uri {"IdentityPoolId" "IdentityPoolId", "IdentityId" "IdentityId", "DatasetName" "DatasetName"}, :querystring {}} 200 :portkey.aws.cognito-sync.-2014-06-30/describe-dataset-response {"NotAuthorizedException" :portkey.aws.cognito-sync.-2014-06-30/not-authorized-exception, "InvalidParameterException" :portkey.aws.cognito-sync.-2014-06-30/invalid-parameter-exception, "ResourceNotFoundException" :portkey.aws.cognito-sync.-2014-06-30/resource-not-found-exception, "InternalErrorException" :portkey.aws.cognito-sync.-2014-06-30/internal-error-exception, "TooManyRequestsException" :portkey.aws.cognito-sync.-2014-06-30/too-many-requests-exception})))
(clojure.spec.alpha/fdef describe-dataset :args (clojure.spec.alpha/tuple :portkey.aws.cognito-sync.-2014-06-30/describe-dataset-request) :ret (clojure.spec.alpha/and :portkey.aws.cognito-sync.-2014-06-30/describe-dataset-response))

(clojure.core/defn get-bulk-publish-details ([get-bulk-publish-details-request] (portkey.aws/-rest-json-call portkey.aws.cognito-sync.-2014-06-30/endpoints "POST" "/identitypools/{IdentityPoolId}/getBulkPublishDetails" get-bulk-publish-details-request :portkey.aws.cognito-sync.-2014-06-30/get-bulk-publish-details-request {:payload nil, :move {}, :headers {}, :uri {"IdentityPoolId" "IdentityPoolId"}, :querystring {}} 200 :portkey.aws.cognito-sync.-2014-06-30/get-bulk-publish-details-response {"NotAuthorizedException" :portkey.aws.cognito-sync.-2014-06-30/not-authorized-exception, "InvalidParameterException" :portkey.aws.cognito-sync.-2014-06-30/invalid-parameter-exception, "ResourceNotFoundException" :portkey.aws.cognito-sync.-2014-06-30/resource-not-found-exception, "InternalErrorException" :portkey.aws.cognito-sync.-2014-06-30/internal-error-exception})))
(clojure.spec.alpha/fdef get-bulk-publish-details :args (clojure.spec.alpha/tuple :portkey.aws.cognito-sync.-2014-06-30/get-bulk-publish-details-request) :ret (clojure.spec.alpha/and :portkey.aws.cognito-sync.-2014-06-30/get-bulk-publish-details-response))

(clojure.core/defn describe-identity-usage ([describe-identity-usage-request] (portkey.aws/-rest-json-call portkey.aws.cognito-sync.-2014-06-30/endpoints "GET" "/identitypools/{IdentityPoolId}/identities/{IdentityId}" describe-identity-usage-request :portkey.aws.cognito-sync.-2014-06-30/describe-identity-usage-request {:payload nil, :move {}, :headers {}, :uri {"IdentityPoolId" "IdentityPoolId", "IdentityId" "IdentityId"}, :querystring {}} 200 :portkey.aws.cognito-sync.-2014-06-30/describe-identity-usage-response {"NotAuthorizedException" :portkey.aws.cognito-sync.-2014-06-30/not-authorized-exception, "InvalidParameterException" :portkey.aws.cognito-sync.-2014-06-30/invalid-parameter-exception, "ResourceNotFoundException" :portkey.aws.cognito-sync.-2014-06-30/resource-not-found-exception, "InternalErrorException" :portkey.aws.cognito-sync.-2014-06-30/internal-error-exception, "TooManyRequestsException" :portkey.aws.cognito-sync.-2014-06-30/too-many-requests-exception})))
(clojure.spec.alpha/fdef describe-identity-usage :args (clojure.spec.alpha/tuple :portkey.aws.cognito-sync.-2014-06-30/describe-identity-usage-request) :ret (clojure.spec.alpha/and :portkey.aws.cognito-sync.-2014-06-30/describe-identity-usage-response))

(clojure.core/defn get-cognito-events ([get-cognito-events-request] (portkey.aws/-rest-json-call portkey.aws.cognito-sync.-2014-06-30/endpoints "GET" "/identitypools/{IdentityPoolId}/events" get-cognito-events-request :portkey.aws.cognito-sync.-2014-06-30/get-cognito-events-request {:payload nil, :move {}, :headers {}, :uri {"IdentityPoolId" "IdentityPoolId"}, :querystring {}} 200 :portkey.aws.cognito-sync.-2014-06-30/get-cognito-events-response {"InvalidParameterException" :portkey.aws.cognito-sync.-2014-06-30/invalid-parameter-exception, "ResourceNotFoundException" :portkey.aws.cognito-sync.-2014-06-30/resource-not-found-exception, "NotAuthorizedException" :portkey.aws.cognito-sync.-2014-06-30/not-authorized-exception, "InternalErrorException" :portkey.aws.cognito-sync.-2014-06-30/internal-error-exception, "TooManyRequestsException" :portkey.aws.cognito-sync.-2014-06-30/too-many-requests-exception})))
(clojure.spec.alpha/fdef get-cognito-events :args (clojure.spec.alpha/tuple :portkey.aws.cognito-sync.-2014-06-30/get-cognito-events-request) :ret (clojure.spec.alpha/and :portkey.aws.cognito-sync.-2014-06-30/get-cognito-events-response))

(clojure.core/defn list-datasets ([list-datasets-request] (portkey.aws/-rest-json-call portkey.aws.cognito-sync.-2014-06-30/endpoints "GET" "/identitypools/{IdentityPoolId}/identities/{IdentityId}/datasets" list-datasets-request :portkey.aws.cognito-sync.-2014-06-30/list-datasets-request {:payload nil, :move {}, :headers {}, :uri {"IdentityPoolId" "IdentityPoolId", "IdentityId" "IdentityId"}, :querystring {"nextToken" "NextToken", "maxResults" "MaxResults"}} 200 :portkey.aws.cognito-sync.-2014-06-30/list-datasets-response {"NotAuthorizedException" :portkey.aws.cognito-sync.-2014-06-30/not-authorized-exception, "InvalidParameterException" :portkey.aws.cognito-sync.-2014-06-30/invalid-parameter-exception, "InternalErrorException" :portkey.aws.cognito-sync.-2014-06-30/internal-error-exception, "TooManyRequestsException" :portkey.aws.cognito-sync.-2014-06-30/too-many-requests-exception})))
(clojure.spec.alpha/fdef list-datasets :args (clojure.spec.alpha/tuple :portkey.aws.cognito-sync.-2014-06-30/list-datasets-request) :ret (clojure.spec.alpha/and :portkey.aws.cognito-sync.-2014-06-30/list-datasets-response))

(clojure.core/defn list-identity-pool-usage ([] (list-identity-pool-usage {})) ([list-identity-pool-usage-request] (portkey.aws/-rest-json-call portkey.aws.cognito-sync.-2014-06-30/endpoints "GET" "/identitypools" list-identity-pool-usage-request :portkey.aws.cognito-sync.-2014-06-30/list-identity-pool-usage-request {:payload nil, :move {}, :headers {}, :uri {}, :querystring {"nextToken" "NextToken", "maxResults" "MaxResults"}} 200 :portkey.aws.cognito-sync.-2014-06-30/list-identity-pool-usage-response {"NotAuthorizedException" :portkey.aws.cognito-sync.-2014-06-30/not-authorized-exception, "InvalidParameterException" :portkey.aws.cognito-sync.-2014-06-30/invalid-parameter-exception, "InternalErrorException" :portkey.aws.cognito-sync.-2014-06-30/internal-error-exception, "TooManyRequestsException" :portkey.aws.cognito-sync.-2014-06-30/too-many-requests-exception})))
(clojure.spec.alpha/fdef list-identity-pool-usage :args (clojure.spec.alpha/? :portkey.aws.cognito-sync.-2014-06-30/list-identity-pool-usage-request) :ret (clojure.spec.alpha/and :portkey.aws.cognito-sync.-2014-06-30/list-identity-pool-usage-response))

(clojure.core/defn describe-identity-pool-usage ([describe-identity-pool-usage-request] (portkey.aws/-rest-json-call portkey.aws.cognito-sync.-2014-06-30/endpoints "GET" "/identitypools/{IdentityPoolId}" describe-identity-pool-usage-request :portkey.aws.cognito-sync.-2014-06-30/describe-identity-pool-usage-request {:payload nil, :move {}, :headers {}, :uri {"IdentityPoolId" "IdentityPoolId"}, :querystring {}} 200 :portkey.aws.cognito-sync.-2014-06-30/describe-identity-pool-usage-response {"NotAuthorizedException" :portkey.aws.cognito-sync.-2014-06-30/not-authorized-exception, "InvalidParameterException" :portkey.aws.cognito-sync.-2014-06-30/invalid-parameter-exception, "ResourceNotFoundException" :portkey.aws.cognito-sync.-2014-06-30/resource-not-found-exception, "InternalErrorException" :portkey.aws.cognito-sync.-2014-06-30/internal-error-exception, "TooManyRequestsException" :portkey.aws.cognito-sync.-2014-06-30/too-many-requests-exception})))
(clojure.spec.alpha/fdef describe-identity-pool-usage :args (clojure.spec.alpha/tuple :portkey.aws.cognito-sync.-2014-06-30/describe-identity-pool-usage-request) :ret (clojure.spec.alpha/and :portkey.aws.cognito-sync.-2014-06-30/describe-identity-pool-usage-response))

(clojure.core/defn unsubscribe-from-dataset ([unsubscribe-from-dataset-request] (portkey.aws/-rest-json-call portkey.aws.cognito-sync.-2014-06-30/endpoints "DELETE" "/identitypools/{IdentityPoolId}/identities/{IdentityId}/datasets/{DatasetName}/subscriptions/{DeviceId}" unsubscribe-from-dataset-request :portkey.aws.cognito-sync.-2014-06-30/unsubscribe-from-dataset-request {:payload nil, :move {}, :headers {}, :uri {"IdentityPoolId" "IdentityPoolId", "IdentityId" "IdentityId", "DatasetName" "DatasetName", "DeviceId" "DeviceId"}, :querystring {}} 200 :portkey.aws.cognito-sync.-2014-06-30/unsubscribe-from-dataset-response {"NotAuthorizedException" :portkey.aws.cognito-sync.-2014-06-30/not-authorized-exception, "InvalidParameterException" :portkey.aws.cognito-sync.-2014-06-30/invalid-parameter-exception, "ResourceNotFoundException" :portkey.aws.cognito-sync.-2014-06-30/resource-not-found-exception, "InternalErrorException" :portkey.aws.cognito-sync.-2014-06-30/internal-error-exception, "InvalidConfigurationException" :portkey.aws.cognito-sync.-2014-06-30/invalid-configuration-exception, "TooManyRequestsException" :portkey.aws.cognito-sync.-2014-06-30/too-many-requests-exception})))
(clojure.spec.alpha/fdef unsubscribe-from-dataset :args (clojure.spec.alpha/tuple :portkey.aws.cognito-sync.-2014-06-30/unsubscribe-from-dataset-request) :ret (clojure.spec.alpha/and :portkey.aws.cognito-sync.-2014-06-30/unsubscribe-from-dataset-response))

(clojure.core/defn subscribe-to-dataset ([subscribe-to-dataset-request] (portkey.aws/-rest-json-call portkey.aws.cognito-sync.-2014-06-30/endpoints "POST" "/identitypools/{IdentityPoolId}/identities/{IdentityId}/datasets/{DatasetName}/subscriptions/{DeviceId}" subscribe-to-dataset-request :portkey.aws.cognito-sync.-2014-06-30/subscribe-to-dataset-request {:payload nil, :move {}, :headers {}, :uri {"IdentityPoolId" "IdentityPoolId", "IdentityId" "IdentityId", "DatasetName" "DatasetName", "DeviceId" "DeviceId"}, :querystring {}} 200 :portkey.aws.cognito-sync.-2014-06-30/subscribe-to-dataset-response {"NotAuthorizedException" :portkey.aws.cognito-sync.-2014-06-30/not-authorized-exception, "InvalidParameterException" :portkey.aws.cognito-sync.-2014-06-30/invalid-parameter-exception, "ResourceNotFoundException" :portkey.aws.cognito-sync.-2014-06-30/resource-not-found-exception, "InternalErrorException" :portkey.aws.cognito-sync.-2014-06-30/internal-error-exception, "InvalidConfigurationException" :portkey.aws.cognito-sync.-2014-06-30/invalid-configuration-exception, "TooManyRequestsException" :portkey.aws.cognito-sync.-2014-06-30/too-many-requests-exception})))
(clojure.spec.alpha/fdef subscribe-to-dataset :args (clojure.spec.alpha/tuple :portkey.aws.cognito-sync.-2014-06-30/subscribe-to-dataset-request) :ret (clojure.spec.alpha/and :portkey.aws.cognito-sync.-2014-06-30/subscribe-to-dataset-response))

(clojure.core/defn get-identity-pool-configuration ([get-identity-pool-configuration-request] (portkey.aws/-rest-json-call portkey.aws.cognito-sync.-2014-06-30/endpoints "GET" "/identitypools/{IdentityPoolId}/configuration" get-identity-pool-configuration-request :portkey.aws.cognito-sync.-2014-06-30/get-identity-pool-configuration-request {:payload nil, :move {}, :headers {}, :uri {"IdentityPoolId" "IdentityPoolId"}, :querystring {}} 200 :portkey.aws.cognito-sync.-2014-06-30/get-identity-pool-configuration-response {"NotAuthorizedException" :portkey.aws.cognito-sync.-2014-06-30/not-authorized-exception, "InvalidParameterException" :portkey.aws.cognito-sync.-2014-06-30/invalid-parameter-exception, "ResourceNotFoundException" :portkey.aws.cognito-sync.-2014-06-30/resource-not-found-exception, "InternalErrorException" :portkey.aws.cognito-sync.-2014-06-30/internal-error-exception, "TooManyRequestsException" :portkey.aws.cognito-sync.-2014-06-30/too-many-requests-exception})))
(clojure.spec.alpha/fdef get-identity-pool-configuration :args (clojure.spec.alpha/tuple :portkey.aws.cognito-sync.-2014-06-30/get-identity-pool-configuration-request) :ret (clojure.spec.alpha/and :portkey.aws.cognito-sync.-2014-06-30/get-identity-pool-configuration-response))

(clojure.core/defn set-cognito-events ([set-cognito-events-request] (portkey.aws/-rest-json-call portkey.aws.cognito-sync.-2014-06-30/endpoints "POST" "/identitypools/{IdentityPoolId}/events" set-cognito-events-request :portkey.aws.cognito-sync.-2014-06-30/set-cognito-events-request {:payload nil, :move {}, :headers {}, :uri {"IdentityPoolId" "IdentityPoolId"}, :querystring {}} 200 nil {"InvalidParameterException" :portkey.aws.cognito-sync.-2014-06-30/invalid-parameter-exception, "ResourceNotFoundException" :portkey.aws.cognito-sync.-2014-06-30/resource-not-found-exception, "NotAuthorizedException" :portkey.aws.cognito-sync.-2014-06-30/not-authorized-exception, "InternalErrorException" :portkey.aws.cognito-sync.-2014-06-30/internal-error-exception, "TooManyRequestsException" :portkey.aws.cognito-sync.-2014-06-30/too-many-requests-exception})))
(clojure.spec.alpha/fdef set-cognito-events :args (clojure.spec.alpha/tuple :portkey.aws.cognito-sync.-2014-06-30/set-cognito-events-request) :ret clojure.core/true?)

(clojure.core/defn set-identity-pool-configuration ([set-identity-pool-configuration-request] (portkey.aws/-rest-json-call portkey.aws.cognito-sync.-2014-06-30/endpoints "POST" "/identitypools/{IdentityPoolId}/configuration" set-identity-pool-configuration-request :portkey.aws.cognito-sync.-2014-06-30/set-identity-pool-configuration-request {:payload nil, :move {}, :headers {}, :uri {"IdentityPoolId" "IdentityPoolId"}, :querystring {}} 200 :portkey.aws.cognito-sync.-2014-06-30/set-identity-pool-configuration-response {"NotAuthorizedException" :portkey.aws.cognito-sync.-2014-06-30/not-authorized-exception, "InvalidParameterException" :portkey.aws.cognito-sync.-2014-06-30/invalid-parameter-exception, "ResourceNotFoundException" :portkey.aws.cognito-sync.-2014-06-30/resource-not-found-exception, "InternalErrorException" :portkey.aws.cognito-sync.-2014-06-30/internal-error-exception, "TooManyRequestsException" :portkey.aws.cognito-sync.-2014-06-30/too-many-requests-exception, "ConcurrentModificationException" :portkey.aws.cognito-sync.-2014-06-30/concurrent-modification-exception})))
(clojure.spec.alpha/fdef set-identity-pool-configuration :args (clojure.spec.alpha/tuple :portkey.aws.cognito-sync.-2014-06-30/set-identity-pool-configuration-request) :ret (clojure.spec.alpha/and :portkey.aws.cognito-sync.-2014-06-30/set-identity-pool-configuration-response))

(clojure.core/defn register-device ([register-device-request] (portkey.aws/-rest-json-call portkey.aws.cognito-sync.-2014-06-30/endpoints "POST" "/identitypools/{IdentityPoolId}/identity/{IdentityId}/device" register-device-request :portkey.aws.cognito-sync.-2014-06-30/register-device-request {:payload nil, :move {}, :headers {}, :uri {"IdentityPoolId" "IdentityPoolId", "IdentityId" "IdentityId"}, :querystring {}} 200 :portkey.aws.cognito-sync.-2014-06-30/register-device-response {"NotAuthorizedException" :portkey.aws.cognito-sync.-2014-06-30/not-authorized-exception, "InvalidParameterException" :portkey.aws.cognito-sync.-2014-06-30/invalid-parameter-exception, "ResourceNotFoundException" :portkey.aws.cognito-sync.-2014-06-30/resource-not-found-exception, "InternalErrorException" :portkey.aws.cognito-sync.-2014-06-30/internal-error-exception, "InvalidConfigurationException" :portkey.aws.cognito-sync.-2014-06-30/invalid-configuration-exception, "TooManyRequestsException" :portkey.aws.cognito-sync.-2014-06-30/too-many-requests-exception})))
(clojure.spec.alpha/fdef register-device :args (clojure.spec.alpha/tuple :portkey.aws.cognito-sync.-2014-06-30/register-device-request) :ret (clojure.spec.alpha/and :portkey.aws.cognito-sync.-2014-06-30/register-device-response))

(clojure.core/defn update-records ([update-records-request] (portkey.aws/-rest-json-call portkey.aws.cognito-sync.-2014-06-30/endpoints "POST" "/identitypools/{IdentityPoolId}/identities/{IdentityId}/datasets/{DatasetName}" update-records-request :portkey.aws.cognito-sync.-2014-06-30/update-records-request {:payload nil, :move {}, :headers {"ClientContext" ["x-amz-Client-Context" nil]}, :uri {"IdentityPoolId" "IdentityPoolId", "IdentityId" "IdentityId", "DatasetName" "DatasetName"}, :querystring {}} 200 :portkey.aws.cognito-sync.-2014-06-30/update-records-response {"LimitExceededException" :portkey.aws.cognito-sync.-2014-06-30/limit-exceeded-exception, "NotAuthorizedException" :portkey.aws.cognito-sync.-2014-06-30/not-authorized-exception, "TooManyRequestsException" :portkey.aws.cognito-sync.-2014-06-30/too-many-requests-exception, "InternalErrorException" :portkey.aws.cognito-sync.-2014-06-30/internal-error-exception, "ResourceNotFoundException" :portkey.aws.cognito-sync.-2014-06-30/resource-not-found-exception, "LambdaThrottledException" :portkey.aws.cognito-sync.-2014-06-30/lambda-throttled-exception, "ResourceConflictException" :portkey.aws.cognito-sync.-2014-06-30/resource-conflict-exception, "InvalidLambdaFunctionOutputException" :portkey.aws.cognito-sync.-2014-06-30/invalid-lambda-function-output-exception, "InvalidParameterException" :portkey.aws.cognito-sync.-2014-06-30/invalid-parameter-exception})))
(clojure.spec.alpha/fdef update-records :args (clojure.spec.alpha/tuple :portkey.aws.cognito-sync.-2014-06-30/update-records-request) :ret (clojure.spec.alpha/and :portkey.aws.cognito-sync.-2014-06-30/update-records-response))

(clojure.core/defn delete-dataset ([delete-dataset-request] (portkey.aws/-rest-json-call portkey.aws.cognito-sync.-2014-06-30/endpoints "DELETE" "/identitypools/{IdentityPoolId}/identities/{IdentityId}/datasets/{DatasetName}" delete-dataset-request :portkey.aws.cognito-sync.-2014-06-30/delete-dataset-request {:payload nil, :move {}, :headers {}, :uri {"IdentityPoolId" "IdentityPoolId", "IdentityId" "IdentityId", "DatasetName" "DatasetName"}, :querystring {}} 200 :portkey.aws.cognito-sync.-2014-06-30/delete-dataset-response {"NotAuthorizedException" :portkey.aws.cognito-sync.-2014-06-30/not-authorized-exception, "InvalidParameterException" :portkey.aws.cognito-sync.-2014-06-30/invalid-parameter-exception, "ResourceNotFoundException" :portkey.aws.cognito-sync.-2014-06-30/resource-not-found-exception, "InternalErrorException" :portkey.aws.cognito-sync.-2014-06-30/internal-error-exception, "TooManyRequestsException" :portkey.aws.cognito-sync.-2014-06-30/too-many-requests-exception, "ResourceConflictException" :portkey.aws.cognito-sync.-2014-06-30/resource-conflict-exception})))
(clojure.spec.alpha/fdef delete-dataset :args (clojure.spec.alpha/tuple :portkey.aws.cognito-sync.-2014-06-30/delete-dataset-request) :ret (clojure.spec.alpha/and :portkey.aws.cognito-sync.-2014-06-30/delete-dataset-response))

(clojure.core/defn bulk-publish ([bulk-publish-request] (portkey.aws/-rest-json-call portkey.aws.cognito-sync.-2014-06-30/endpoints "POST" "/identitypools/{IdentityPoolId}/bulkpublish" bulk-publish-request :portkey.aws.cognito-sync.-2014-06-30/bulk-publish-request {:payload nil, :move {}, :headers {}, :uri {"IdentityPoolId" "IdentityPoolId"}, :querystring {}} 200 :portkey.aws.cognito-sync.-2014-06-30/bulk-publish-response {"NotAuthorizedException" :portkey.aws.cognito-sync.-2014-06-30/not-authorized-exception, "InvalidParameterException" :portkey.aws.cognito-sync.-2014-06-30/invalid-parameter-exception, "ResourceNotFoundException" :portkey.aws.cognito-sync.-2014-06-30/resource-not-found-exception, "InternalErrorException" :portkey.aws.cognito-sync.-2014-06-30/internal-error-exception, "DuplicateRequestException" :portkey.aws.cognito-sync.-2014-06-30/duplicate-request-exception, "AlreadyStreamedException" :portkey.aws.cognito-sync.-2014-06-30/already-streamed-exception})))
(clojure.spec.alpha/fdef bulk-publish :args (clojure.spec.alpha/tuple :portkey.aws.cognito-sync.-2014-06-30/bulk-publish-request) :ret (clojure.spec.alpha/and :portkey.aws.cognito-sync.-2014-06-30/bulk-publish-response))
