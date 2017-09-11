(ns portkey.aws.pinpoint.-2016-12-01 (:require [portkey.aws]))

(def
 endpoints
 '{"us-east-1"
   {:credential-scope
    {:service "mobiletargeting", :region "us-east-1"},
    :ssl-common-name "pinpoint.us-east-1.amazonaws.com",
    :endpoint "https://pinpoint.us-east-1.amazonaws.com",
    :signature-version :v4}})

(clojure.spec.alpha/def :portkey.aws.pinpoint.-2016-12-01.treatment-resource/id (clojure.spec.alpha/and :portkey.aws.pinpoint.-2016-12-01/--string))
(clojure.spec.alpha/def :portkey.aws.pinpoint.-2016-12-01.treatment-resource/size-percent (clojure.spec.alpha/and :portkey.aws.pinpoint.-2016-12-01/--integer))
(clojure.spec.alpha/def :portkey.aws.pinpoint.-2016-12-01.treatment-resource/state (clojure.spec.alpha/and :portkey.aws.pinpoint.-2016-12-01/campaign-state))
(clojure.spec.alpha/def :portkey.aws.pinpoint.-2016-12-01.treatment-resource/treatment-description (clojure.spec.alpha/and :portkey.aws.pinpoint.-2016-12-01/--string))
(clojure.spec.alpha/def :portkey.aws.pinpoint.-2016-12-01.treatment-resource/treatment-name (clojure.spec.alpha/and :portkey.aws.pinpoint.-2016-12-01/--string))
(clojure.spec.alpha/def :portkey.aws.pinpoint.-2016-12-01/treatment-resource (portkey.aws/json-keys :req-un [] :opt-un [:portkey.aws.pinpoint.-2016-12-01.treatment-resource/Id :portkey.aws.pinpoint.-2016-12-01/MessageConfiguration :portkey.aws.pinpoint.-2016-12-01/Schedule :portkey.aws.pinpoint.-2016-12-01.treatment-resource/SizePercent :portkey.aws.pinpoint.-2016-12-01.treatment-resource/State :portkey.aws.pinpoint.-2016-12-01.treatment-resource/TreatmentDescription :portkey.aws.pinpoint.-2016-12-01.treatment-resource/TreatmentName] :locations {}))

(clojure.spec.alpha/def :portkey.aws.pinpoint.-2016-12-01/attribute-type (clojure.spec.alpha/conformer (clojure.core/let [m__96543__auto__ {"INCLUSIVE" "INCLUSIVE", :inclusive "INCLUSIVE", "EXCLUSIVE" "EXCLUSIVE", :exclusive "EXCLUSIVE"}] (clojure.core/fn [s__96544__auto__] (m__96543__auto__ s__96544__auto__ :clojure.spec.alpha/invalid))) (clojure.core/comp clojure.core/keyword portkey.aws/dashed)))

(clojure.spec.alpha/def :portkey.aws.pinpoint.-2016-12-01.import-job-request/define-segment (clojure.spec.alpha/and :portkey.aws.pinpoint.-2016-12-01/--boolean))
(clojure.spec.alpha/def :portkey.aws.pinpoint.-2016-12-01.import-job-request/external-id (clojure.spec.alpha/and :portkey.aws.pinpoint.-2016-12-01/--string))
(clojure.spec.alpha/def :portkey.aws.pinpoint.-2016-12-01.import-job-request/register-endpoints (clojure.spec.alpha/and :portkey.aws.pinpoint.-2016-12-01/--boolean))
(clojure.spec.alpha/def :portkey.aws.pinpoint.-2016-12-01.import-job-request/role-arn (clojure.spec.alpha/and :portkey.aws.pinpoint.-2016-12-01/--string))
(clojure.spec.alpha/def :portkey.aws.pinpoint.-2016-12-01.import-job-request/s3-url (clojure.spec.alpha/and :portkey.aws.pinpoint.-2016-12-01/--string))
(clojure.spec.alpha/def :portkey.aws.pinpoint.-2016-12-01.import-job-request/segment-id (clojure.spec.alpha/and :portkey.aws.pinpoint.-2016-12-01/--string))
(clojure.spec.alpha/def :portkey.aws.pinpoint.-2016-12-01.import-job-request/segment-name (clojure.spec.alpha/and :portkey.aws.pinpoint.-2016-12-01/--string))
(clojure.spec.alpha/def :portkey.aws.pinpoint.-2016-12-01/import-job-request (portkey.aws/json-keys :req-un [] :opt-un [:portkey.aws.pinpoint.-2016-12-01.import-job-request/DefineSegment :portkey.aws.pinpoint.-2016-12-01.import-job-request/ExternalId :portkey.aws.pinpoint.-2016-12-01/Format :portkey.aws.pinpoint.-2016-12-01.import-job-request/RegisterEndpoints :portkey.aws.pinpoint.-2016-12-01.import-job-request/RoleArn :portkey.aws.pinpoint.-2016-12-01.import-job-request/S3Url :portkey.aws.pinpoint.-2016-12-01.import-job-request/SegmentId :portkey.aws.pinpoint.-2016-12-01.import-job-request/SegmentName] :locations {}))

(clojure.spec.alpha/def :portkey.aws.pinpoint.-2016-12-01.internal-server-error-exception/message (clojure.spec.alpha/and :portkey.aws.pinpoint.-2016-12-01/--string))
(clojure.spec.alpha/def :portkey.aws.pinpoint.-2016-12-01.internal-server-error-exception/requestid (clojure.spec.alpha/and :portkey.aws.pinpoint.-2016-12-01/--string))
(clojure.spec.alpha/def :portkey.aws.pinpoint.-2016-12-01/internal-server-error-exception (portkey.aws/json-keys :req-un [] :opt-un [:portkey.aws.pinpoint.-2016-12-01.internal-server-error-exception/Message :portkey.aws.pinpoint.-2016-12-01.internal-server-error-exception/RequestID] :locations {}))

(clojure.spec.alpha/def :portkey.aws.pinpoint.-2016-12-01.method-not-allowed-exception/message (clojure.spec.alpha/and :portkey.aws.pinpoint.-2016-12-01/--string))
(clojure.spec.alpha/def :portkey.aws.pinpoint.-2016-12-01.method-not-allowed-exception/requestid (clojure.spec.alpha/and :portkey.aws.pinpoint.-2016-12-01/--string))
(clojure.spec.alpha/def :portkey.aws.pinpoint.-2016-12-01/method-not-allowed-exception (portkey.aws/json-keys :req-un [] :opt-un [:portkey.aws.pinpoint.-2016-12-01.method-not-allowed-exception/Message :portkey.aws.pinpoint.-2016-12-01.method-not-allowed-exception/RequestID] :locations {}))

(clojure.spec.alpha/def :portkey.aws.pinpoint.-2016-12-01.write-campaign-request/additional-treatments (clojure.spec.alpha/and :portkey.aws.pinpoint.-2016-12-01/list-of-write-treatment-resource))
(clojure.spec.alpha/def :portkey.aws.pinpoint.-2016-12-01.write-campaign-request/treatment-description (clojure.spec.alpha/and :portkey.aws.pinpoint.-2016-12-01/--string))
(clojure.spec.alpha/def :portkey.aws.pinpoint.-2016-12-01.write-campaign-request/treatment-name (clojure.spec.alpha/and :portkey.aws.pinpoint.-2016-12-01/--string))
(clojure.spec.alpha/def :portkey.aws.pinpoint.-2016-12-01.write-campaign-request/limits (clojure.spec.alpha/and :portkey.aws.pinpoint.-2016-12-01/campaign-limits))
(clojure.spec.alpha/def :portkey.aws.pinpoint.-2016-12-01.write-campaign-request/segment-version (clojure.spec.alpha/and :portkey.aws.pinpoint.-2016-12-01/--integer))
(clojure.spec.alpha/def :portkey.aws.pinpoint.-2016-12-01.write-campaign-request/description (clojure.spec.alpha/and :portkey.aws.pinpoint.-2016-12-01/--string))
(clojure.spec.alpha/def :portkey.aws.pinpoint.-2016-12-01.write-campaign-request/is-paused (clojure.spec.alpha/and :portkey.aws.pinpoint.-2016-12-01/--boolean))
(clojure.spec.alpha/def :portkey.aws.pinpoint.-2016-12-01.write-campaign-request/segment-id (clojure.spec.alpha/and :portkey.aws.pinpoint.-2016-12-01/--string))
(clojure.spec.alpha/def :portkey.aws.pinpoint.-2016-12-01.write-campaign-request/name (clojure.spec.alpha/and :portkey.aws.pinpoint.-2016-12-01/--string))
(clojure.spec.alpha/def :portkey.aws.pinpoint.-2016-12-01.write-campaign-request/holdout-percent (clojure.spec.alpha/and :portkey.aws.pinpoint.-2016-12-01/--integer))
(clojure.spec.alpha/def :portkey.aws.pinpoint.-2016-12-01/write-campaign-request (portkey.aws/json-keys :req-un [] :opt-un [:portkey.aws.pinpoint.-2016-12-01.write-campaign-request/AdditionalTreatments :portkey.aws.pinpoint.-2016-12-01.write-campaign-request/TreatmentDescription :portkey.aws.pinpoint.-2016-12-01.write-campaign-request/TreatmentName :portkey.aws.pinpoint.-2016-12-01.write-campaign-request/Limits :portkey.aws.pinpoint.-2016-12-01.write-campaign-request/SegmentVersion :portkey.aws.pinpoint.-2016-12-01.write-campaign-request/Description :portkey.aws.pinpoint.-2016-12-01.write-campaign-request/IsPaused :portkey.aws.pinpoint.-2016-12-01/MessageConfiguration :portkey.aws.pinpoint.-2016-12-01.write-campaign-request/SegmentId :portkey.aws.pinpoint.-2016-12-01/Schedule :portkey.aws.pinpoint.-2016-12-01.write-campaign-request/Name :portkey.aws.pinpoint.-2016-12-01.write-campaign-request/HoldoutPercent] :locations {}))

(clojure.spec.alpha/def :portkey.aws.pinpoint.-2016-12-01.gcmmessage/collapse-key (clojure.spec.alpha/and :portkey.aws.pinpoint.-2016-12-01/--string))
(clojure.spec.alpha/def :portkey.aws.pinpoint.-2016-12-01.gcmmessage/restricted-package-name (clojure.spec.alpha/and :portkey.aws.pinpoint.-2016-12-01/--string))
(clojure.spec.alpha/def :portkey.aws.pinpoint.-2016-12-01.gcmmessage/body (clojure.spec.alpha/and :portkey.aws.pinpoint.-2016-12-01/--string))
(clojure.spec.alpha/def :portkey.aws.pinpoint.-2016-12-01.gcmmessage/image-url (clojure.spec.alpha/and :portkey.aws.pinpoint.-2016-12-01/--string))
(clojure.spec.alpha/def :portkey.aws.pinpoint.-2016-12-01.gcmmessage/title (clojure.spec.alpha/and :portkey.aws.pinpoint.-2016-12-01/--string))
(clojure.spec.alpha/def :portkey.aws.pinpoint.-2016-12-01.gcmmessage/silent-push (clojure.spec.alpha/and :portkey.aws.pinpoint.-2016-12-01/--boolean))
(clojure.spec.alpha/def :portkey.aws.pinpoint.-2016-12-01.gcmmessage/sound (clojure.spec.alpha/and :portkey.aws.pinpoint.-2016-12-01/--string))
(clojure.spec.alpha/def :portkey.aws.pinpoint.-2016-12-01.gcmmessage/raw-content (clojure.spec.alpha/and :portkey.aws.pinpoint.-2016-12-01/--string))
(clojure.spec.alpha/def :portkey.aws.pinpoint.-2016-12-01.gcmmessage/url (clojure.spec.alpha/and :portkey.aws.pinpoint.-2016-12-01/--string))
(clojure.spec.alpha/def :portkey.aws.pinpoint.-2016-12-01.gcmmessage/substitutions (clojure.spec.alpha/and :portkey.aws.pinpoint.-2016-12-01/map-of-list-of--string))
(clojure.spec.alpha/def :portkey.aws.pinpoint.-2016-12-01.gcmmessage/small-image-icon-url (clojure.spec.alpha/and :portkey.aws.pinpoint.-2016-12-01/--string))
(clojure.spec.alpha/def :portkey.aws.pinpoint.-2016-12-01.gcmmessage/icon-reference (clojure.spec.alpha/and :portkey.aws.pinpoint.-2016-12-01/--string))
(clojure.spec.alpha/def :portkey.aws.pinpoint.-2016-12-01.gcmmessage/data (clojure.spec.alpha/and :portkey.aws.pinpoint.-2016-12-01/map-of--string))
(clojure.spec.alpha/def :portkey.aws.pinpoint.-2016-12-01.gcmmessage/image-icon-url (clojure.spec.alpha/and :portkey.aws.pinpoint.-2016-12-01/--string))
(clojure.spec.alpha/def :portkey.aws.pinpoint.-2016-12-01/gcmmessage (portkey.aws/json-keys :req-un [] :opt-un [:portkey.aws.pinpoint.-2016-12-01.gcmmessage/CollapseKey :portkey.aws.pinpoint.-2016-12-01.gcmmessage/RestrictedPackageName :portkey.aws.pinpoint.-2016-12-01.gcmmessage/Body :portkey.aws.pinpoint.-2016-12-01.gcmmessage/ImageUrl :portkey.aws.pinpoint.-2016-12-01.gcmmessage/Title :portkey.aws.pinpoint.-2016-12-01.gcmmessage/SilentPush :portkey.aws.pinpoint.-2016-12-01.gcmmessage/Sound :portkey.aws.pinpoint.-2016-12-01.gcmmessage/RawContent :portkey.aws.pinpoint.-2016-12-01.gcmmessage/Url :portkey.aws.pinpoint.-2016-12-01.gcmmessage/Substitutions :portkey.aws.pinpoint.-2016-12-01.gcmmessage/SmallImageIconUrl :portkey.aws.pinpoint.-2016-12-01.gcmmessage/IconReference :portkey.aws.pinpoint.-2016-12-01.gcmmessage/Data :portkey.aws.pinpoint.-2016-12-01.gcmmessage/ImageIconUrl :portkey.aws.pinpoint.-2016-12-01/Action] :locations {}))

(clojure.spec.alpha/def :portkey.aws.pinpoint.-2016-12-01/update-application-settings-response (portkey.aws/json-keys :req-un [:portkey.aws.pinpoint.-2016-12-01/ApplicationSettingsResource] :opt-un [] :locations {}))

(clojure.spec.alpha/def :portkey.aws.pinpoint.-2016-12-01/send-messages-response (portkey.aws/json-keys :req-un [:portkey.aws.pinpoint.-2016-12-01/MessageResponse] :opt-un [] :locations {}))

(clojure.spec.alpha/def :portkey.aws.pinpoint.-2016-12-01.message-response/application-id (clojure.spec.alpha/and :portkey.aws.pinpoint.-2016-12-01/--string))
(clojure.spec.alpha/def :portkey.aws.pinpoint.-2016-12-01.message-response/request-id (clojure.spec.alpha/and :portkey.aws.pinpoint.-2016-12-01/--string))
(clojure.spec.alpha/def :portkey.aws.pinpoint.-2016-12-01.message-response/result (clojure.spec.alpha/and :portkey.aws.pinpoint.-2016-12-01/map-of-message-result))
(clojure.spec.alpha/def :portkey.aws.pinpoint.-2016-12-01/message-response (portkey.aws/json-keys :req-un [] :opt-un [:portkey.aws.pinpoint.-2016-12-01.message-response/ApplicationId :portkey.aws.pinpoint.-2016-12-01.message-response/RequestId :portkey.aws.pinpoint.-2016-12-01.message-response/Result] :locations {}))

(clojure.spec.alpha/def :portkey.aws.pinpoint.-2016-12-01.delete-gcm-channel-request/application-id (clojure.spec.alpha/and :portkey.aws.pinpoint.-2016-12-01/--string))
(clojure.spec.alpha/def :portkey.aws.pinpoint.-2016-12-01/delete-gcm-channel-request (portkey.aws/json-keys :req-un [:portkey.aws.pinpoint.-2016-12-01.delete-gcm-channel-request/ApplicationId] :opt-un [] :locations {}))

(clojure.spec.alpha/def :portkey.aws.pinpoint.-2016-12-01/delete-apns-sandbox-channel-response (portkey.aws/json-keys :req-un [:portkey.aws.pinpoint.-2016-12-01/APNSSandboxChannelResponse] :opt-un [] :locations {}))

(clojure.spec.alpha/def :portkey.aws.pinpoint.-2016-12-01.import-job-response/failures (clojure.spec.alpha/and :portkey.aws.pinpoint.-2016-12-01/list-of--string))
(clojure.spec.alpha/def :portkey.aws.pinpoint.-2016-12-01.import-job-response/completion-date (clojure.spec.alpha/and :portkey.aws.pinpoint.-2016-12-01/--string))
(clojure.spec.alpha/def :portkey.aws.pinpoint.-2016-12-01.import-job-response/type (clojure.spec.alpha/and :portkey.aws.pinpoint.-2016-12-01/--string))
(clojure.spec.alpha/def :portkey.aws.pinpoint.-2016-12-01.import-job-response/total-pieces (clojure.spec.alpha/and :portkey.aws.pinpoint.-2016-12-01/--integer))
(clojure.spec.alpha/def :portkey.aws.pinpoint.-2016-12-01.import-job-response/total-failures (clojure.spec.alpha/and :portkey.aws.pinpoint.-2016-12-01/--integer))
(clojure.spec.alpha/def :portkey.aws.pinpoint.-2016-12-01.import-job-response/application-id (clojure.spec.alpha/and :portkey.aws.pinpoint.-2016-12-01/--string))
(clojure.spec.alpha/def :portkey.aws.pinpoint.-2016-12-01.import-job-response/definition (clojure.spec.alpha/and :portkey.aws.pinpoint.-2016-12-01/import-job-resource))
(clojure.spec.alpha/def :portkey.aws.pinpoint.-2016-12-01.import-job-response/failed-pieces (clojure.spec.alpha/and :portkey.aws.pinpoint.-2016-12-01/--integer))
(clojure.spec.alpha/def :portkey.aws.pinpoint.-2016-12-01.import-job-response/completed-pieces (clojure.spec.alpha/and :portkey.aws.pinpoint.-2016-12-01/--integer))
(clojure.spec.alpha/def :portkey.aws.pinpoint.-2016-12-01.import-job-response/creation-date (clojure.spec.alpha/and :portkey.aws.pinpoint.-2016-12-01/--string))
(clojure.spec.alpha/def :portkey.aws.pinpoint.-2016-12-01.import-job-response/id (clojure.spec.alpha/and :portkey.aws.pinpoint.-2016-12-01/--string))
(clojure.spec.alpha/def :portkey.aws.pinpoint.-2016-12-01.import-job-response/total-processed (clojure.spec.alpha/and :portkey.aws.pinpoint.-2016-12-01/--integer))
(clojure.spec.alpha/def :portkey.aws.pinpoint.-2016-12-01/import-job-response (portkey.aws/json-keys :req-un [] :opt-un [:portkey.aws.pinpoint.-2016-12-01/JobStatus :portkey.aws.pinpoint.-2016-12-01.import-job-response/Failures :portkey.aws.pinpoint.-2016-12-01.import-job-response/CompletionDate :portkey.aws.pinpoint.-2016-12-01.import-job-response/Type :portkey.aws.pinpoint.-2016-12-01.import-job-response/TotalPieces :portkey.aws.pinpoint.-2016-12-01.import-job-response/TotalFailures :portkey.aws.pinpoint.-2016-12-01.import-job-response/ApplicationId :portkey.aws.pinpoint.-2016-12-01.import-job-response/Definition :portkey.aws.pinpoint.-2016-12-01.import-job-response/FailedPieces :portkey.aws.pinpoint.-2016-12-01.import-job-response/CompletedPieces :portkey.aws.pinpoint.-2016-12-01.import-job-response/CreationDate :portkey.aws.pinpoint.-2016-12-01.import-job-response/Id :portkey.aws.pinpoint.-2016-12-01.import-job-response/TotalProcessed] :locations {}))

(clojure.spec.alpha/def :portkey.aws.pinpoint.-2016-12-01/--timestamp clojure.core/inst?)

(clojure.spec.alpha/def :portkey.aws.pinpoint.-2016-12-01/create-app-response (portkey.aws/json-keys :req-un [:portkey.aws.pinpoint.-2016-12-01/ApplicationResponse] :opt-un [] :locations {}))

(clojure.spec.alpha/def :portkey.aws.pinpoint.-2016-12-01/list-of-segment-response (clojure.spec.alpha/and (clojure.spec.alpha/coll-of :portkey.aws.pinpoint.-2016-12-01/segment-response :max-count nil) (clojure.spec.alpha/conformer clojure.core/identity (fn* [p1__129128__129129__auto__] (if (clojure.core/sequential? p1__129128__129129__auto__) p1__129128__129129__auto__ [p1__129128__129129__auto__])))))

(clojure.spec.alpha/def :portkey.aws.pinpoint.-2016-12-01.message-request/addresses (clojure.spec.alpha/and :portkey.aws.pinpoint.-2016-12-01/map-of-address-configuration))
(clojure.spec.alpha/def :portkey.aws.pinpoint.-2016-12-01.message-request/context (clojure.spec.alpha/and :portkey.aws.pinpoint.-2016-12-01/map-of--string))
(clojure.spec.alpha/def :portkey.aws.pinpoint.-2016-12-01.message-request/message-configuration (clojure.spec.alpha/and :portkey.aws.pinpoint.-2016-12-01/direct-message-configuration))
(clojure.spec.alpha/def :portkey.aws.pinpoint.-2016-12-01/message-request (portkey.aws/json-keys :req-un [] :opt-un [:portkey.aws.pinpoint.-2016-12-01.message-request/Addresses :portkey.aws.pinpoint.-2016-12-01.message-request/Context :portkey.aws.pinpoint.-2016-12-01.message-request/MessageConfiguration] :locations {}))

(clojure.spec.alpha/def :portkey.aws.pinpoint.-2016-12-01.get-segment-request/application-id (clojure.spec.alpha/and :portkey.aws.pinpoint.-2016-12-01/--string))
(clojure.spec.alpha/def :portkey.aws.pinpoint.-2016-12-01.get-segment-request/segment-id (clojure.spec.alpha/and :portkey.aws.pinpoint.-2016-12-01/--string))
(clojure.spec.alpha/def :portkey.aws.pinpoint.-2016-12-01/get-segment-request (portkey.aws/json-keys :req-un [:portkey.aws.pinpoint.-2016-12-01.get-segment-request/SegmentId :portkey.aws.pinpoint.-2016-12-01.get-segment-request/ApplicationId] :opt-un [] :locations {}))

(clojure.spec.alpha/def :portkey.aws.pinpoint.-2016-12-01/campaign-state (portkey.aws/json-keys :req-un [] :opt-un [:portkey.aws.pinpoint.-2016-12-01/CampaignStatus] :locations {}))

(clojure.spec.alpha/def :portkey.aws.pinpoint.-2016-12-01/get-endpoint-response (portkey.aws/json-keys :req-un [:portkey.aws.pinpoint.-2016-12-01/EndpointResponse] :opt-un [] :locations {}))

(clojure.spec.alpha/def :portkey.aws.pinpoint.-2016-12-01.get-campaign-version-request/application-id (clojure.spec.alpha/and :portkey.aws.pinpoint.-2016-12-01/--string))
(clojure.spec.alpha/def :portkey.aws.pinpoint.-2016-12-01.get-campaign-version-request/campaign-id (clojure.spec.alpha/and :portkey.aws.pinpoint.-2016-12-01/--string))
(clojure.spec.alpha/def :portkey.aws.pinpoint.-2016-12-01.get-campaign-version-request/version (clojure.spec.alpha/and :portkey.aws.pinpoint.-2016-12-01/--string))
(clojure.spec.alpha/def :portkey.aws.pinpoint.-2016-12-01/get-campaign-version-request (portkey.aws/json-keys :req-un [:portkey.aws.pinpoint.-2016-12-01.get-campaign-version-request/Version :portkey.aws.pinpoint.-2016-12-01.get-campaign-version-request/ApplicationId :portkey.aws.pinpoint.-2016-12-01.get-campaign-version-request/CampaignId] :opt-un [] :locations {}))

(clojure.spec.alpha/def :portkey.aws.pinpoint.-2016-12-01.campaign-limits/daily (clojure.spec.alpha/and :portkey.aws.pinpoint.-2016-12-01/--integer))
(clojure.spec.alpha/def :portkey.aws.pinpoint.-2016-12-01.campaign-limits/total (clojure.spec.alpha/and :portkey.aws.pinpoint.-2016-12-01/--integer))
(clojure.spec.alpha/def :portkey.aws.pinpoint.-2016-12-01/campaign-limits (portkey.aws/json-keys :req-un [] :opt-un [:portkey.aws.pinpoint.-2016-12-01.campaign-limits/Daily :portkey.aws.pinpoint.-2016-12-01.campaign-limits/Total] :locations {}))

(clojure.spec.alpha/def :portkey.aws.pinpoint.-2016-12-01/get-apps-response (portkey.aws/json-keys :req-un [:portkey.aws.pinpoint.-2016-12-01/ApplicationsResponse] :opt-un [] :locations {}))

(clojure.spec.alpha/def :portkey.aws.pinpoint.-2016-12-01.create-campaign-request/application-id (clojure.spec.alpha/and :portkey.aws.pinpoint.-2016-12-01/--string))
(clojure.spec.alpha/def :portkey.aws.pinpoint.-2016-12-01/create-campaign-request (portkey.aws/json-keys :req-un [:portkey.aws.pinpoint.-2016-12-01.create-campaign-request/ApplicationId :portkey.aws.pinpoint.-2016-12-01/WriteCampaignRequest] :opt-un [] :locations {}))

(clojure.spec.alpha/def :portkey.aws.pinpoint.-2016-12-01.gcmchannel-response/platform (clojure.spec.alpha/and :portkey.aws.pinpoint.-2016-12-01/--string))
(clojure.spec.alpha/def :portkey.aws.pinpoint.-2016-12-01.gcmchannel-response/credential (clojure.spec.alpha/and :portkey.aws.pinpoint.-2016-12-01/--string))
(clojure.spec.alpha/def :portkey.aws.pinpoint.-2016-12-01.gcmchannel-response/last-modified-date (clojure.spec.alpha/and :portkey.aws.pinpoint.-2016-12-01/--string))
(clojure.spec.alpha/def :portkey.aws.pinpoint.-2016-12-01.gcmchannel-response/enabled (clojure.spec.alpha/and :portkey.aws.pinpoint.-2016-12-01/--boolean))
(clojure.spec.alpha/def :portkey.aws.pinpoint.-2016-12-01.gcmchannel-response/application-id (clojure.spec.alpha/and :portkey.aws.pinpoint.-2016-12-01/--string))
(clojure.spec.alpha/def :portkey.aws.pinpoint.-2016-12-01.gcmchannel-response/is-archived (clojure.spec.alpha/and :portkey.aws.pinpoint.-2016-12-01/--boolean))
(clojure.spec.alpha/def :portkey.aws.pinpoint.-2016-12-01.gcmchannel-response/creation-date (clojure.spec.alpha/and :portkey.aws.pinpoint.-2016-12-01/--string))
(clojure.spec.alpha/def :portkey.aws.pinpoint.-2016-12-01.gcmchannel-response/version (clojure.spec.alpha/and :portkey.aws.pinpoint.-2016-12-01/--integer))
(clojure.spec.alpha/def :portkey.aws.pinpoint.-2016-12-01.gcmchannel-response/last-modified-by (clojure.spec.alpha/and :portkey.aws.pinpoint.-2016-12-01/--string))
(clojure.spec.alpha/def :portkey.aws.pinpoint.-2016-12-01.gcmchannel-response/id (clojure.spec.alpha/and :portkey.aws.pinpoint.-2016-12-01/--string))
(clojure.spec.alpha/def :portkey.aws.pinpoint.-2016-12-01/gcmchannel-response (portkey.aws/json-keys :req-un [] :opt-un [:portkey.aws.pinpoint.-2016-12-01.gcmchannel-response/Platform :portkey.aws.pinpoint.-2016-12-01.gcmchannel-response/Credential :portkey.aws.pinpoint.-2016-12-01.gcmchannel-response/LastModifiedDate :portkey.aws.pinpoint.-2016-12-01.gcmchannel-response/Enabled :portkey.aws.pinpoint.-2016-12-01.gcmchannel-response/ApplicationId :portkey.aws.pinpoint.-2016-12-01.gcmchannel-response/IsArchived :portkey.aws.pinpoint.-2016-12-01.gcmchannel-response/CreationDate :portkey.aws.pinpoint.-2016-12-01.gcmchannel-response/Version :portkey.aws.pinpoint.-2016-12-01.gcmchannel-response/LastModifiedBy :portkey.aws.pinpoint.-2016-12-01.gcmchannel-response/Id] :locations {}))

(clojure.spec.alpha/def :portkey.aws.pinpoint.-2016-12-01.quiet-time/end (clojure.spec.alpha/and :portkey.aws.pinpoint.-2016-12-01/--string))
(clojure.spec.alpha/def :portkey.aws.pinpoint.-2016-12-01.quiet-time/start (clojure.spec.alpha/and :portkey.aws.pinpoint.-2016-12-01/--string))
(clojure.spec.alpha/def :portkey.aws.pinpoint.-2016-12-01/quiet-time (portkey.aws/json-keys :req-un [] :opt-un [:portkey.aws.pinpoint.-2016-12-01.quiet-time/End :portkey.aws.pinpoint.-2016-12-01.quiet-time/Start] :locations {}))

(clojure.spec.alpha/def :portkey.aws.pinpoint.-2016-12-01/get-application-settings-response (portkey.aws/json-keys :req-un [:portkey.aws.pinpoint.-2016-12-01/ApplicationSettingsResource] :opt-un [] :locations {}))

(clojure.spec.alpha/def :portkey.aws.pinpoint.-2016-12-01/get-app-response (portkey.aws/json-keys :req-un [:portkey.aws.pinpoint.-2016-12-01/ApplicationResponse] :opt-un [] :locations {}))

(clojure.spec.alpha/def :portkey.aws.pinpoint.-2016-12-01.bad-request-exception/message (clojure.spec.alpha/and :portkey.aws.pinpoint.-2016-12-01/--string))
(clojure.spec.alpha/def :portkey.aws.pinpoint.-2016-12-01.bad-request-exception/requestid (clojure.spec.alpha/and :portkey.aws.pinpoint.-2016-12-01/--string))
(clojure.spec.alpha/def :portkey.aws.pinpoint.-2016-12-01/bad-request-exception (portkey.aws/json-keys :req-un [] :opt-un [:portkey.aws.pinpoint.-2016-12-01.bad-request-exception/Message :portkey.aws.pinpoint.-2016-12-01.bad-request-exception/RequestID] :locations {}))

(clojure.spec.alpha/def :portkey.aws.pinpoint.-2016-12-01/get-campaigns-response (portkey.aws/json-keys :req-un [:portkey.aws.pinpoint.-2016-12-01/CampaignsResponse] :opt-un [] :locations {}))

(clojure.spec.alpha/def :portkey.aws.pinpoint.-2016-12-01.activity-response/total-endpoint-count (clojure.spec.alpha/and :portkey.aws.pinpoint.-2016-12-01/--integer))
(clojure.spec.alpha/def :portkey.aws.pinpoint.-2016-12-01.activity-response/timezones-completed-count (clojure.spec.alpha/and :portkey.aws.pinpoint.-2016-12-01/--integer))
(clojure.spec.alpha/def :portkey.aws.pinpoint.-2016-12-01.activity-response/start (clojure.spec.alpha/and :portkey.aws.pinpoint.-2016-12-01/--string))
(clojure.spec.alpha/def :portkey.aws.pinpoint.-2016-12-01.activity-response/end (clojure.spec.alpha/and :portkey.aws.pinpoint.-2016-12-01/--string))
(clojure.spec.alpha/def :portkey.aws.pinpoint.-2016-12-01.activity-response/result (clojure.spec.alpha/and :portkey.aws.pinpoint.-2016-12-01/--string))
(clojure.spec.alpha/def :portkey.aws.pinpoint.-2016-12-01.activity-response/application-id (clojure.spec.alpha/and :portkey.aws.pinpoint.-2016-12-01/--string))
(clojure.spec.alpha/def :portkey.aws.pinpoint.-2016-12-01.activity-response/successful-endpoint-count (clojure.spec.alpha/and :portkey.aws.pinpoint.-2016-12-01/--integer))
(clojure.spec.alpha/def :portkey.aws.pinpoint.-2016-12-01.activity-response/state (clojure.spec.alpha/and :portkey.aws.pinpoint.-2016-12-01/--string))
(clojure.spec.alpha/def :portkey.aws.pinpoint.-2016-12-01.activity-response/scheduled-start (clojure.spec.alpha/and :portkey.aws.pinpoint.-2016-12-01/--string))
(clojure.spec.alpha/def :portkey.aws.pinpoint.-2016-12-01.activity-response/timezones-total-count (clojure.spec.alpha/and :portkey.aws.pinpoint.-2016-12-01/--integer))
(clojure.spec.alpha/def :portkey.aws.pinpoint.-2016-12-01.activity-response/campaign-id (clojure.spec.alpha/and :portkey.aws.pinpoint.-2016-12-01/--string))
(clojure.spec.alpha/def :portkey.aws.pinpoint.-2016-12-01.activity-response/id (clojure.spec.alpha/and :portkey.aws.pinpoint.-2016-12-01/--string))
(clojure.spec.alpha/def :portkey.aws.pinpoint.-2016-12-01.activity-response/treatment-id (clojure.spec.alpha/and :portkey.aws.pinpoint.-2016-12-01/--string))
(clojure.spec.alpha/def :portkey.aws.pinpoint.-2016-12-01/activity-response (portkey.aws/json-keys :req-un [] :opt-un [:portkey.aws.pinpoint.-2016-12-01.activity-response/TotalEndpointCount :portkey.aws.pinpoint.-2016-12-01.activity-response/TimezonesCompletedCount :portkey.aws.pinpoint.-2016-12-01.activity-response/Start :portkey.aws.pinpoint.-2016-12-01.activity-response/End :portkey.aws.pinpoint.-2016-12-01.activity-response/Result :portkey.aws.pinpoint.-2016-12-01.activity-response/ApplicationId :portkey.aws.pinpoint.-2016-12-01.activity-response/SuccessfulEndpointCount :portkey.aws.pinpoint.-2016-12-01.activity-response/State :portkey.aws.pinpoint.-2016-12-01.activity-response/ScheduledStart :portkey.aws.pinpoint.-2016-12-01.activity-response/TimezonesTotalCount :portkey.aws.pinpoint.-2016-12-01.activity-response/CampaignId :portkey.aws.pinpoint.-2016-12-01.activity-response/Id :portkey.aws.pinpoint.-2016-12-01.activity-response/TreatmentId] :locations {}))

(clojure.spec.alpha/def :portkey.aws.pinpoint.-2016-12-01/job-status (clojure.spec.alpha/conformer (clojure.core/let [m__96543__auto__ {"COMPLETED" "COMPLETED", :initializing "INITIALIZING", "FAILING" "FAILING", :processing "PROCESSING", :completed "COMPLETED", :created "CREATED", "COMPLETING" "COMPLETING", :failing "FAILING", "FAILED" "FAILED", :completing "COMPLETING", "INITIALIZING" "INITIALIZING", "PROCESSING" "PROCESSING", :failed "FAILED", "CREATED" "CREATED"}] (clojure.core/fn [s__96544__auto__] (m__96543__auto__ s__96544__auto__ :clojure.spec.alpha/invalid))) (clojure.core/comp clojure.core/keyword portkey.aws/dashed)))

(clojure.spec.alpha/def :portkey.aws.pinpoint.-2016-12-01/create-app-request (portkey.aws/json-keys :req-un [:portkey.aws.pinpoint.-2016-12-01/CreateApplicationRequest] :opt-un [] :locations {}))

(clojure.spec.alpha/def :portkey.aws.pinpoint.-2016-12-01.get-gcm-channel-request/application-id (clojure.spec.alpha/and :portkey.aws.pinpoint.-2016-12-01/--string))
(clojure.spec.alpha/def :portkey.aws.pinpoint.-2016-12-01/get-gcm-channel-request (portkey.aws/json-keys :req-un [:portkey.aws.pinpoint.-2016-12-01.get-gcm-channel-request/ApplicationId] :opt-un [] :locations {}))

(clojure.spec.alpha/def :portkey.aws.pinpoint.-2016-12-01.campaign-response/default-state (clojure.spec.alpha/and :portkey.aws.pinpoint.-2016-12-01/campaign-state))
(clojure.spec.alpha/def :portkey.aws.pinpoint.-2016-12-01.campaign-response/last-modified-date (clojure.spec.alpha/and :portkey.aws.pinpoint.-2016-12-01/--string))
(clojure.spec.alpha/def :portkey.aws.pinpoint.-2016-12-01.campaign-response/additional-treatments (clojure.spec.alpha/and :portkey.aws.pinpoint.-2016-12-01/list-of-treatment-resource))
(clojure.spec.alpha/def :portkey.aws.pinpoint.-2016-12-01.campaign-response/treatment-description (clojure.spec.alpha/and :portkey.aws.pinpoint.-2016-12-01/--string))
(clojure.spec.alpha/def :portkey.aws.pinpoint.-2016-12-01.campaign-response/treatment-name (clojure.spec.alpha/and :portkey.aws.pinpoint.-2016-12-01/--string))
(clojure.spec.alpha/def :portkey.aws.pinpoint.-2016-12-01.campaign-response/limits (clojure.spec.alpha/and :portkey.aws.pinpoint.-2016-12-01/campaign-limits))
(clojure.spec.alpha/def :portkey.aws.pinpoint.-2016-12-01.campaign-response/application-id (clojure.spec.alpha/and :portkey.aws.pinpoint.-2016-12-01/--string))
(clojure.spec.alpha/def :portkey.aws.pinpoint.-2016-12-01.campaign-response/segment-version (clojure.spec.alpha/and :portkey.aws.pinpoint.-2016-12-01/--integer))
(clojure.spec.alpha/def :portkey.aws.pinpoint.-2016-12-01.campaign-response/description (clojure.spec.alpha/and :portkey.aws.pinpoint.-2016-12-01/--string))
(clojure.spec.alpha/def :portkey.aws.pinpoint.-2016-12-01.campaign-response/is-paused (clojure.spec.alpha/and :portkey.aws.pinpoint.-2016-12-01/--boolean))
(clojure.spec.alpha/def :portkey.aws.pinpoint.-2016-12-01.campaign-response/segment-id (clojure.spec.alpha/and :portkey.aws.pinpoint.-2016-12-01/--string))
(clojure.spec.alpha/def :portkey.aws.pinpoint.-2016-12-01.campaign-response/creation-date (clojure.spec.alpha/and :portkey.aws.pinpoint.-2016-12-01/--string))
(clojure.spec.alpha/def :portkey.aws.pinpoint.-2016-12-01.campaign-response/state (clojure.spec.alpha/and :portkey.aws.pinpoint.-2016-12-01/campaign-state))
(clojure.spec.alpha/def :portkey.aws.pinpoint.-2016-12-01.campaign-response/version (clojure.spec.alpha/and :portkey.aws.pinpoint.-2016-12-01/--integer))
(clojure.spec.alpha/def :portkey.aws.pinpoint.-2016-12-01.campaign-response/name (clojure.spec.alpha/and :portkey.aws.pinpoint.-2016-12-01/--string))
(clojure.spec.alpha/def :portkey.aws.pinpoint.-2016-12-01.campaign-response/id (clojure.spec.alpha/and :portkey.aws.pinpoint.-2016-12-01/--string))
(clojure.spec.alpha/def :portkey.aws.pinpoint.-2016-12-01.campaign-response/holdout-percent (clojure.spec.alpha/and :portkey.aws.pinpoint.-2016-12-01/--integer))
(clojure.spec.alpha/def :portkey.aws.pinpoint.-2016-12-01/campaign-response (portkey.aws/json-keys :req-un [] :opt-un [:portkey.aws.pinpoint.-2016-12-01.campaign-response/DefaultState :portkey.aws.pinpoint.-2016-12-01.campaign-response/LastModifiedDate :portkey.aws.pinpoint.-2016-12-01.campaign-response/AdditionalTreatments :portkey.aws.pinpoint.-2016-12-01.campaign-response/TreatmentDescription :portkey.aws.pinpoint.-2016-12-01.campaign-response/TreatmentName :portkey.aws.pinpoint.-2016-12-01.campaign-response/Limits :portkey.aws.pinpoint.-2016-12-01.campaign-response/ApplicationId :portkey.aws.pinpoint.-2016-12-01.campaign-response/SegmentVersion :portkey.aws.pinpoint.-2016-12-01.campaign-response/Description :portkey.aws.pinpoint.-2016-12-01.campaign-response/IsPaused :portkey.aws.pinpoint.-2016-12-01/MessageConfiguration :portkey.aws.pinpoint.-2016-12-01.campaign-response/SegmentId :portkey.aws.pinpoint.-2016-12-01.campaign-response/CreationDate :portkey.aws.pinpoint.-2016-12-01.campaign-response/State :portkey.aws.pinpoint.-2016-12-01.campaign-response/Version :portkey.aws.pinpoint.-2016-12-01/Schedule :portkey.aws.pinpoint.-2016-12-01.campaign-response/Name :portkey.aws.pinpoint.-2016-12-01.campaign-response/Id :portkey.aws.pinpoint.-2016-12-01.campaign-response/HoldoutPercent] :locations {}))

(clojure.spec.alpha/def :portkey.aws.pinpoint.-2016-12-01.create-application-request/name (clojure.spec.alpha/and :portkey.aws.pinpoint.-2016-12-01/--string))
(clojure.spec.alpha/def :portkey.aws.pinpoint.-2016-12-01/create-application-request (portkey.aws/json-keys :req-un [] :opt-un [:portkey.aws.pinpoint.-2016-12-01.create-application-request/Name] :locations {}))

(clojure.spec.alpha/def :portkey.aws.pinpoint.-2016-12-01/segment-type (clojure.spec.alpha/conformer (clojure.core/let [m__96543__auto__ {"DIMENSIONAL" "DIMENSIONAL", :dimensional "DIMENSIONAL", "IMPORT" "IMPORT", :import "IMPORT"}] (clojure.core/fn [s__96544__auto__] (m__96543__auto__ s__96544__auto__ :clojure.spec.alpha/invalid))) (clojure.core/comp clojure.core/keyword portkey.aws/dashed)))

(clojure.spec.alpha/def :portkey.aws.pinpoint.-2016-12-01.delete-apns-sandbox-channel-request/application-id (clojure.spec.alpha/and :portkey.aws.pinpoint.-2016-12-01/--string))
(clojure.spec.alpha/def :portkey.aws.pinpoint.-2016-12-01/delete-apns-sandbox-channel-request (portkey.aws/json-keys :req-un [:portkey.aws.pinpoint.-2016-12-01.delete-apns-sandbox-channel-request/ApplicationId] :opt-un [] :locations {}))

(clojure.spec.alpha/def :portkey.aws.pinpoint.-2016-12-01.attribute-dimension/values (clojure.spec.alpha/and :portkey.aws.pinpoint.-2016-12-01/list-of--string))
(clojure.spec.alpha/def :portkey.aws.pinpoint.-2016-12-01/attribute-dimension (portkey.aws/json-keys :req-un [] :opt-un [:portkey.aws.pinpoint.-2016-12-01/AttributeType :portkey.aws.pinpoint.-2016-12-01.attribute-dimension/Values] :locations {}))

(clojure.spec.alpha/def :portkey.aws.pinpoint.-2016-12-01/recency-type (clojure.spec.alpha/conformer (clojure.core/let [m__96543__auto__ {"ACTIVE" "ACTIVE", :active "ACTIVE", "INACTIVE" "INACTIVE", :inactive "INACTIVE"}] (clojure.core/fn [s__96544__auto__] (m__96543__auto__ s__96544__auto__ :clojure.spec.alpha/invalid))) (clojure.core/comp clojure.core/keyword portkey.aws/dashed)))

(clojure.spec.alpha/def :portkey.aws.pinpoint.-2016-12-01.application-response/id (clojure.spec.alpha/and :portkey.aws.pinpoint.-2016-12-01/--string))
(clojure.spec.alpha/def :portkey.aws.pinpoint.-2016-12-01.application-response/name (clojure.spec.alpha/and :portkey.aws.pinpoint.-2016-12-01/--string))
(clojure.spec.alpha/def :portkey.aws.pinpoint.-2016-12-01/application-response (portkey.aws/json-keys :req-un [] :opt-un [:portkey.aws.pinpoint.-2016-12-01.application-response/Id :portkey.aws.pinpoint.-2016-12-01.application-response/Name] :locations {}))

(clojure.spec.alpha/def :portkey.aws.pinpoint.-2016-12-01/get-campaign-versions-response (portkey.aws/json-keys :req-un [:portkey.aws.pinpoint.-2016-12-01/CampaignsResponse] :opt-un [] :locations {}))

(clojure.spec.alpha/def :portkey.aws.pinpoint.-2016-12-01.write-application-settings-request/limits (clojure.spec.alpha/and :portkey.aws.pinpoint.-2016-12-01/campaign-limits))
(clojure.spec.alpha/def :portkey.aws.pinpoint.-2016-12-01/write-application-settings-request (portkey.aws/json-keys :req-un [] :opt-un [:portkey.aws.pinpoint.-2016-12-01.write-application-settings-request/Limits :portkey.aws.pinpoint.-2016-12-01/QuietTime] :locations {}))

(clojure.spec.alpha/def :portkey.aws.pinpoint.-2016-12-01/list-of-treatment-resource (clojure.spec.alpha/and (clojure.spec.alpha/coll-of :portkey.aws.pinpoint.-2016-12-01/treatment-resource :max-count nil) (clojure.spec.alpha/conformer clojure.core/identity (fn* [p1__129128__129129__auto__] (if (clojure.core/sequential? p1__129128__129129__auto__) p1__129128__129129__auto__ [p1__129128__129129__auto__])))))

(clojure.spec.alpha/def :portkey.aws.pinpoint.-2016-12-01/delete-apns-channel-response (portkey.aws/json-keys :req-un [:portkey.aws.pinpoint.-2016-12-01/APNSChannelResponse] :opt-un [] :locations {}))

(clojure.spec.alpha/def :portkey.aws.pinpoint.-2016-12-01.get-segment-import-jobs-request/application-id (clojure.spec.alpha/and :portkey.aws.pinpoint.-2016-12-01/--string))
(clojure.spec.alpha/def :portkey.aws.pinpoint.-2016-12-01.get-segment-import-jobs-request/page-size (clojure.spec.alpha/and :portkey.aws.pinpoint.-2016-12-01/--string))
(clojure.spec.alpha/def :portkey.aws.pinpoint.-2016-12-01.get-segment-import-jobs-request/segment-id (clojure.spec.alpha/and :portkey.aws.pinpoint.-2016-12-01/--string))
(clojure.spec.alpha/def :portkey.aws.pinpoint.-2016-12-01.get-segment-import-jobs-request/token (clojure.spec.alpha/and :portkey.aws.pinpoint.-2016-12-01/--string))
(clojure.spec.alpha/def :portkey.aws.pinpoint.-2016-12-01/get-segment-import-jobs-request (portkey.aws/json-keys :req-un [:portkey.aws.pinpoint.-2016-12-01.get-segment-import-jobs-request/SegmentId :portkey.aws.pinpoint.-2016-12-01.get-segment-import-jobs-request/ApplicationId] :opt-un [:portkey.aws.pinpoint.-2016-12-01.get-segment-import-jobs-request/PageSize :portkey.aws.pinpoint.-2016-12-01.get-segment-import-jobs-request/Token] :locations {}))

(clojure.spec.alpha/def :portkey.aws.pinpoint.-2016-12-01.forbidden-exception/message (clojure.spec.alpha/and :portkey.aws.pinpoint.-2016-12-01/--string))
(clojure.spec.alpha/def :portkey.aws.pinpoint.-2016-12-01.forbidden-exception/requestid (clojure.spec.alpha/and :portkey.aws.pinpoint.-2016-12-01/--string))
(clojure.spec.alpha/def :portkey.aws.pinpoint.-2016-12-01/forbidden-exception (portkey.aws/json-keys :req-un [] :opt-un [:portkey.aws.pinpoint.-2016-12-01.forbidden-exception/Message :portkey.aws.pinpoint.-2016-12-01.forbidden-exception/RequestID] :locations {}))

(clojure.spec.alpha/def :portkey.aws.pinpoint.-2016-12-01/map-of-message-result (clojure.spec.alpha/map-of :portkey.aws.pinpoint.-2016-12-01/--string :portkey.aws.pinpoint.-2016-12-01/message-result))

(clojure.spec.alpha/def :portkey.aws.pinpoint.-2016-12-01.endpoint-user/user-attributes (clojure.spec.alpha/and :portkey.aws.pinpoint.-2016-12-01/map-of-list-of--string))
(clojure.spec.alpha/def :portkey.aws.pinpoint.-2016-12-01.endpoint-user/user-id (clojure.spec.alpha/and :portkey.aws.pinpoint.-2016-12-01/--string))
(clojure.spec.alpha/def :portkey.aws.pinpoint.-2016-12-01/endpoint-user (portkey.aws/json-keys :req-un [] :opt-un [:portkey.aws.pinpoint.-2016-12-01.endpoint-user/UserAttributes :portkey.aws.pinpoint.-2016-12-01.endpoint-user/UserId] :locations {}))

(clojure.spec.alpha/def :portkey.aws.pinpoint.-2016-12-01/--string (clojure.spec.alpha/and clojure.core/string?))

(clojure.spec.alpha/def :portkey.aws.pinpoint.-2016-12-01.get-import-job-request/application-id (clojure.spec.alpha/and :portkey.aws.pinpoint.-2016-12-01/--string))
(clojure.spec.alpha/def :portkey.aws.pinpoint.-2016-12-01.get-import-job-request/job-id (clojure.spec.alpha/and :portkey.aws.pinpoint.-2016-12-01/--string))
(clojure.spec.alpha/def :portkey.aws.pinpoint.-2016-12-01/get-import-job-request (portkey.aws/json-keys :req-un [:portkey.aws.pinpoint.-2016-12-01.get-import-job-request/ApplicationId :portkey.aws.pinpoint.-2016-12-01.get-import-job-request/JobId] :opt-un [] :locations {}))

(clojure.spec.alpha/def :portkey.aws.pinpoint.-2016-12-01.activities-response/item (clojure.spec.alpha/and :portkey.aws.pinpoint.-2016-12-01/list-of-activity-response))
(clojure.spec.alpha/def :portkey.aws.pinpoint.-2016-12-01/activities-response (portkey.aws/json-keys :req-un [] :opt-un [:portkey.aws.pinpoint.-2016-12-01.activities-response/Item] :locations {}))

(clojure.spec.alpha/def :portkey.aws.pinpoint.-2016-12-01.campaigns-response/item (clojure.spec.alpha/and :portkey.aws.pinpoint.-2016-12-01/list-of-campaign-response))
(clojure.spec.alpha/def :portkey.aws.pinpoint.-2016-12-01.campaigns-response/next-token (clojure.spec.alpha/and :portkey.aws.pinpoint.-2016-12-01/--string))
(clojure.spec.alpha/def :portkey.aws.pinpoint.-2016-12-01/campaigns-response (portkey.aws/json-keys :req-un [] :opt-un [:portkey.aws.pinpoint.-2016-12-01.campaigns-response/Item :portkey.aws.pinpoint.-2016-12-01.campaigns-response/NextToken] :locations {}))

(clojure.spec.alpha/def :portkey.aws.pinpoint.-2016-12-01/get-campaign-activities-response (portkey.aws/json-keys :req-un [:portkey.aws.pinpoint.-2016-12-01/ActivitiesResponse] :opt-un [] :locations {}))

(clojure.spec.alpha/def :portkey.aws.pinpoint.-2016-12-01/delivery-status (clojure.spec.alpha/conformer (clojure.core/let [m__96543__auto__ {"SUCCESSFUL" "SUCCESSFUL", :successful "SUCCESSFUL", "THROTTLED" "THROTTLED", :throttled "THROTTLED", "TEMPORARY_FAILURE" "TEMPORARY_FAILURE", :temporary-failure "TEMPORARY_FAILURE", "PERMANENT_FAILURE" "PERMANENT_FAILURE", :permanent-failure "PERMANENT_FAILURE"}] (clojure.core/fn [s__96544__auto__] (m__96543__auto__ s__96544__auto__ :clojure.spec.alpha/invalid))) (clojure.core/comp clojure.core/keyword portkey.aws/dashed)))

(clojure.spec.alpha/def :portkey.aws.pinpoint.-2016-12-01/update-segment-response (portkey.aws/json-keys :req-un [:portkey.aws.pinpoint.-2016-12-01/SegmentResponse] :opt-un [] :locations {}))

(clojure.spec.alpha/def :portkey.aws.pinpoint.-2016-12-01.campaign-sms-message/body (clojure.spec.alpha/and :portkey.aws.pinpoint.-2016-12-01/--string))
(clojure.spec.alpha/def :portkey.aws.pinpoint.-2016-12-01.campaign-sms-message/sender-id (clojure.spec.alpha/and :portkey.aws.pinpoint.-2016-12-01/--string))
(clojure.spec.alpha/def :portkey.aws.pinpoint.-2016-12-01/campaign-sms-message (portkey.aws/json-keys :req-un [] :opt-un [:portkey.aws.pinpoint.-2016-12-01.campaign-sms-message/Body :portkey.aws.pinpoint.-2016-12-01/MessageType :portkey.aws.pinpoint.-2016-12-01.campaign-sms-message/SenderId] :locations {}))

(clojure.spec.alpha/def :portkey.aws.pinpoint.-2016-12-01.update-apns-channel-request/application-id (clojure.spec.alpha/and :portkey.aws.pinpoint.-2016-12-01/--string))
(clojure.spec.alpha/def :portkey.aws.pinpoint.-2016-12-01/update-apns-channel-request (portkey.aws/json-keys :req-un [:portkey.aws.pinpoint.-2016-12-01.update-apns-channel-request/ApplicationId :portkey.aws.pinpoint.-2016-12-01/APNSChannelRequest] :opt-un [] :locations {}))

(clojure.spec.alpha/def :portkey.aws.pinpoint.-2016-12-01/get-apns-channel-response (portkey.aws/json-keys :req-un [:portkey.aws.pinpoint.-2016-12-01/APNSChannelResponse] :opt-un [] :locations {}))

(clojure.spec.alpha/def :portkey.aws.pinpoint.-2016-12-01/get-campaign-version-response (portkey.aws/json-keys :req-un [:portkey.aws.pinpoint.-2016-12-01/CampaignResponse] :opt-un [] :locations {}))

(clojure.spec.alpha/def :portkey.aws.pinpoint.-2016-12-01.get-event-stream-request/application-id (clojure.spec.alpha/and :portkey.aws.pinpoint.-2016-12-01/--string))
(clojure.spec.alpha/def :portkey.aws.pinpoint.-2016-12-01/get-event-stream-request (portkey.aws/json-keys :req-un [:portkey.aws.pinpoint.-2016-12-01.get-event-stream-request/ApplicationId] :opt-un [] :locations {}))

(clojure.spec.alpha/def :portkey.aws.pinpoint.-2016-12-01/map-of-list-of--string (clojure.spec.alpha/map-of :portkey.aws.pinpoint.-2016-12-01/--string :portkey.aws.pinpoint.-2016-12-01/list-of--string))

(clojure.spec.alpha/def :portkey.aws.pinpoint.-2016-12-01/delete-campaign-response (portkey.aws/json-keys :req-un [:portkey.aws.pinpoint.-2016-12-01/CampaignResponse] :opt-un [] :locations {}))

(clojure.spec.alpha/def :portkey.aws.pinpoint.-2016-12-01.endpoint-demographic/app-version (clojure.spec.alpha/and :portkey.aws.pinpoint.-2016-12-01/--string))
(clojure.spec.alpha/def :portkey.aws.pinpoint.-2016-12-01.endpoint-demographic/locale (clojure.spec.alpha/and :portkey.aws.pinpoint.-2016-12-01/--string))
(clojure.spec.alpha/def :portkey.aws.pinpoint.-2016-12-01.endpoint-demographic/make (clojure.spec.alpha/and :portkey.aws.pinpoint.-2016-12-01/--string))
(clojure.spec.alpha/def :portkey.aws.pinpoint.-2016-12-01.endpoint-demographic/model (clojure.spec.alpha/and :portkey.aws.pinpoint.-2016-12-01/--string))
(clojure.spec.alpha/def :portkey.aws.pinpoint.-2016-12-01.endpoint-demographic/model-version (clojure.spec.alpha/and :portkey.aws.pinpoint.-2016-12-01/--string))
(clojure.spec.alpha/def :portkey.aws.pinpoint.-2016-12-01.endpoint-demographic/platform (clojure.spec.alpha/and :portkey.aws.pinpoint.-2016-12-01/--string))
(clojure.spec.alpha/def :portkey.aws.pinpoint.-2016-12-01.endpoint-demographic/platform-version (clojure.spec.alpha/and :portkey.aws.pinpoint.-2016-12-01/--string))
(clojure.spec.alpha/def :portkey.aws.pinpoint.-2016-12-01.endpoint-demographic/timezone (clojure.spec.alpha/and :portkey.aws.pinpoint.-2016-12-01/--string))
(clojure.spec.alpha/def :portkey.aws.pinpoint.-2016-12-01/endpoint-demographic (portkey.aws/json-keys :req-un [] :opt-un [:portkey.aws.pinpoint.-2016-12-01.endpoint-demographic/AppVersion :portkey.aws.pinpoint.-2016-12-01.endpoint-demographic/Locale :portkey.aws.pinpoint.-2016-12-01.endpoint-demographic/Make :portkey.aws.pinpoint.-2016-12-01.endpoint-demographic/Model :portkey.aws.pinpoint.-2016-12-01.endpoint-demographic/ModelVersion :portkey.aws.pinpoint.-2016-12-01.endpoint-demographic/Platform :portkey.aws.pinpoint.-2016-12-01.endpoint-demographic/PlatformVersion :portkey.aws.pinpoint.-2016-12-01.endpoint-demographic/Timezone] :locations {}))

(clojure.spec.alpha/def :portkey.aws.pinpoint.-2016-12-01/create-segment-response (portkey.aws/json-keys :req-un [:portkey.aws.pinpoint.-2016-12-01/SegmentResponse] :opt-un [] :locations {}))

(clojure.spec.alpha/def :portkey.aws.pinpoint.-2016-12-01.update-email-channel-request/application-id (clojure.spec.alpha/and :portkey.aws.pinpoint.-2016-12-01/--string))
(clojure.spec.alpha/def :portkey.aws.pinpoint.-2016-12-01/update-email-channel-request (portkey.aws/json-keys :req-un [:portkey.aws.pinpoint.-2016-12-01.update-email-channel-request/ApplicationId :portkey.aws.pinpoint.-2016-12-01/EmailChannelRequest] :opt-un [] :locations {}))

(clojure.spec.alpha/def :portkey.aws.pinpoint.-2016-12-01.delete-apns-channel-request/application-id (clojure.spec.alpha/and :portkey.aws.pinpoint.-2016-12-01/--string))
(clojure.spec.alpha/def :portkey.aws.pinpoint.-2016-12-01/delete-apns-channel-request (portkey.aws/json-keys :req-un [:portkey.aws.pinpoint.-2016-12-01.delete-apns-channel-request/ApplicationId] :opt-un [] :locations {}))

(clojure.spec.alpha/def :portkey.aws.pinpoint.-2016-12-01/format (clojure.spec.alpha/conformer (clojure.core/let [m__96543__auto__ {"CSV" "CSV", :csv "CSV", "JSON" "JSON", :json "JSON"}] (clojure.core/fn [s__96544__auto__] (m__96543__auto__ s__96544__auto__ :clojure.spec.alpha/invalid))) (clojure.core/comp clojure.core/keyword portkey.aws/dashed)))

(clojure.spec.alpha/def :portkey.aws.pinpoint.-2016-12-01.import-jobs-response/item (clojure.spec.alpha/and :portkey.aws.pinpoint.-2016-12-01/list-of-import-job-response))
(clojure.spec.alpha/def :portkey.aws.pinpoint.-2016-12-01.import-jobs-response/next-token (clojure.spec.alpha/and :portkey.aws.pinpoint.-2016-12-01/--string))
(clojure.spec.alpha/def :portkey.aws.pinpoint.-2016-12-01/import-jobs-response (portkey.aws/json-keys :req-un [] :opt-un [:portkey.aws.pinpoint.-2016-12-01.import-jobs-response/Item :portkey.aws.pinpoint.-2016-12-01.import-jobs-response/NextToken] :locations {}))

(clojure.spec.alpha/def :portkey.aws.pinpoint.-2016-12-01/update-sms-channel-response (portkey.aws/json-keys :req-un [:portkey.aws.pinpoint.-2016-12-01/SMSChannelResponse] :opt-un [] :locations {}))

(clojure.spec.alpha/def :portkey.aws.pinpoint.-2016-12-01/get-segments-response (portkey.aws/json-keys :req-un [:portkey.aws.pinpoint.-2016-12-01/SegmentsResponse] :opt-un [] :locations {}))

(clojure.spec.alpha/def :portkey.aws.pinpoint.-2016-12-01/delete-sms-channel-response (portkey.aws/json-keys :req-un [:portkey.aws.pinpoint.-2016-12-01/SMSChannelResponse] :opt-un [] :locations {}))

(clojure.spec.alpha/def :portkey.aws.pinpoint.-2016-12-01.update-gcm-channel-request/application-id (clojure.spec.alpha/and :portkey.aws.pinpoint.-2016-12-01/--string))
(clojure.spec.alpha/def :portkey.aws.pinpoint.-2016-12-01/update-gcm-channel-request (portkey.aws/json-keys :req-un [:portkey.aws.pinpoint.-2016-12-01.update-gcm-channel-request/ApplicationId :portkey.aws.pinpoint.-2016-12-01/GCMChannelRequest] :opt-un [] :locations {}))

(clojure.spec.alpha/def :portkey.aws.pinpoint.-2016-12-01.import-job-resource/define-segment (clojure.spec.alpha/and :portkey.aws.pinpoint.-2016-12-01/--boolean))
(clojure.spec.alpha/def :portkey.aws.pinpoint.-2016-12-01.import-job-resource/external-id (clojure.spec.alpha/and :portkey.aws.pinpoint.-2016-12-01/--string))
(clojure.spec.alpha/def :portkey.aws.pinpoint.-2016-12-01.import-job-resource/register-endpoints (clojure.spec.alpha/and :portkey.aws.pinpoint.-2016-12-01/--boolean))
(clojure.spec.alpha/def :portkey.aws.pinpoint.-2016-12-01.import-job-resource/role-arn (clojure.spec.alpha/and :portkey.aws.pinpoint.-2016-12-01/--string))
(clojure.spec.alpha/def :portkey.aws.pinpoint.-2016-12-01.import-job-resource/s3-url (clojure.spec.alpha/and :portkey.aws.pinpoint.-2016-12-01/--string))
(clojure.spec.alpha/def :portkey.aws.pinpoint.-2016-12-01.import-job-resource/segment-id (clojure.spec.alpha/and :portkey.aws.pinpoint.-2016-12-01/--string))
(clojure.spec.alpha/def :portkey.aws.pinpoint.-2016-12-01.import-job-resource/segment-name (clojure.spec.alpha/and :portkey.aws.pinpoint.-2016-12-01/--string))
(clojure.spec.alpha/def :portkey.aws.pinpoint.-2016-12-01/import-job-resource (portkey.aws/json-keys :req-un [] :opt-un [:portkey.aws.pinpoint.-2016-12-01.import-job-resource/DefineSegment :portkey.aws.pinpoint.-2016-12-01.import-job-resource/ExternalId :portkey.aws.pinpoint.-2016-12-01/Format :portkey.aws.pinpoint.-2016-12-01.import-job-resource/RegisterEndpoints :portkey.aws.pinpoint.-2016-12-01.import-job-resource/RoleArn :portkey.aws.pinpoint.-2016-12-01.import-job-resource/S3Url :portkey.aws.pinpoint.-2016-12-01.import-job-resource/SegmentId :portkey.aws.pinpoint.-2016-12-01.import-job-resource/SegmentName] :locations {}))

(clojure.spec.alpha/def :portkey.aws.pinpoint.-2016-12-01/list-of--string (clojure.spec.alpha/and (clojure.spec.alpha/coll-of :portkey.aws.pinpoint.-2016-12-01/--string :max-count nil) (clojure.spec.alpha/conformer clojure.core/identity (fn* [p1__129128__129129__auto__] (if (clojure.core/sequential? p1__129128__129129__auto__) p1__129128__129129__auto__ [p1__129128__129129__auto__])))))

(clojure.spec.alpha/def :portkey.aws.pinpoint.-2016-12-01.smschannel-response/platform (clojure.spec.alpha/and :portkey.aws.pinpoint.-2016-12-01/--string))
(clojure.spec.alpha/def :portkey.aws.pinpoint.-2016-12-01.smschannel-response/short-code (clojure.spec.alpha/and :portkey.aws.pinpoint.-2016-12-01/--string))
(clojure.spec.alpha/def :portkey.aws.pinpoint.-2016-12-01.smschannel-response/last-modified-date (clojure.spec.alpha/and :portkey.aws.pinpoint.-2016-12-01/--string))
(clojure.spec.alpha/def :portkey.aws.pinpoint.-2016-12-01.smschannel-response/enabled (clojure.spec.alpha/and :portkey.aws.pinpoint.-2016-12-01/--boolean))
(clojure.spec.alpha/def :portkey.aws.pinpoint.-2016-12-01.smschannel-response/sender-id (clojure.spec.alpha/and :portkey.aws.pinpoint.-2016-12-01/--string))
(clojure.spec.alpha/def :portkey.aws.pinpoint.-2016-12-01.smschannel-response/application-id (clojure.spec.alpha/and :portkey.aws.pinpoint.-2016-12-01/--string))
(clojure.spec.alpha/def :portkey.aws.pinpoint.-2016-12-01.smschannel-response/is-archived (clojure.spec.alpha/and :portkey.aws.pinpoint.-2016-12-01/--boolean))
(clojure.spec.alpha/def :portkey.aws.pinpoint.-2016-12-01.smschannel-response/creation-date (clojure.spec.alpha/and :portkey.aws.pinpoint.-2016-12-01/--string))
(clojure.spec.alpha/def :portkey.aws.pinpoint.-2016-12-01.smschannel-response/version (clojure.spec.alpha/and :portkey.aws.pinpoint.-2016-12-01/--integer))
(clojure.spec.alpha/def :portkey.aws.pinpoint.-2016-12-01.smschannel-response/last-modified-by (clojure.spec.alpha/and :portkey.aws.pinpoint.-2016-12-01/--string))
(clojure.spec.alpha/def :portkey.aws.pinpoint.-2016-12-01.smschannel-response/id (clojure.spec.alpha/and :portkey.aws.pinpoint.-2016-12-01/--string))
(clojure.spec.alpha/def :portkey.aws.pinpoint.-2016-12-01/smschannel-response (portkey.aws/json-keys :req-un [] :opt-un [:portkey.aws.pinpoint.-2016-12-01.smschannel-response/Platform :portkey.aws.pinpoint.-2016-12-01.smschannel-response/ShortCode :portkey.aws.pinpoint.-2016-12-01.smschannel-response/LastModifiedDate :portkey.aws.pinpoint.-2016-12-01.smschannel-response/Enabled :portkey.aws.pinpoint.-2016-12-01.smschannel-response/SenderId :portkey.aws.pinpoint.-2016-12-01.smschannel-response/ApplicationId :portkey.aws.pinpoint.-2016-12-01.smschannel-response/IsArchived :portkey.aws.pinpoint.-2016-12-01.smschannel-response/CreationDate :portkey.aws.pinpoint.-2016-12-01.smschannel-response/Version :portkey.aws.pinpoint.-2016-12-01.smschannel-response/LastModifiedBy :portkey.aws.pinpoint.-2016-12-01.smschannel-response/Id] :locations {}))

(clojure.spec.alpha/def :portkey.aws.pinpoint.-2016-12-01/update-endpoint-response (portkey.aws/json-keys :req-un [:portkey.aws.pinpoint.-2016-12-01/MessageBody] :opt-un [] :locations {}))

(clojure.spec.alpha/def :portkey.aws.pinpoint.-2016-12-01/list-of-endpoint-batch-item (clojure.spec.alpha/and (clojure.spec.alpha/coll-of :portkey.aws.pinpoint.-2016-12-01/endpoint-batch-item :max-count nil) (clojure.spec.alpha/conformer clojure.core/identity (fn* [p1__129128__129129__auto__] (if (clojure.core/sequential? p1__129128__129129__auto__) p1__129128__129129__auto__ [p1__129128__129129__auto__])))))

(clojure.spec.alpha/def :portkey.aws.pinpoint.-2016-12-01/get-segment-versions-response (portkey.aws/json-keys :req-un [:portkey.aws.pinpoint.-2016-12-01/SegmentsResponse] :opt-un [] :locations {}))

(clojure.spec.alpha/def :portkey.aws.pinpoint.-2016-12-01/delete-app-response (portkey.aws/json-keys :req-un [:portkey.aws.pinpoint.-2016-12-01/ApplicationResponse] :opt-un [] :locations {}))

(clojure.spec.alpha/def :portkey.aws.pinpoint.-2016-12-01.too-many-requests-exception/message (clojure.spec.alpha/and :portkey.aws.pinpoint.-2016-12-01/--string))
(clojure.spec.alpha/def :portkey.aws.pinpoint.-2016-12-01.too-many-requests-exception/requestid (clojure.spec.alpha/and :portkey.aws.pinpoint.-2016-12-01/--string))
(clojure.spec.alpha/def :portkey.aws.pinpoint.-2016-12-01/too-many-requests-exception (portkey.aws/json-keys :req-un [] :opt-un [:portkey.aws.pinpoint.-2016-12-01.too-many-requests-exception/Message :portkey.aws.pinpoint.-2016-12-01.too-many-requests-exception/RequestID] :locations {}))

(clojure.spec.alpha/def :portkey.aws.pinpoint.-2016-12-01/get-gcm-channel-response (portkey.aws/json-keys :req-un [:portkey.aws.pinpoint.-2016-12-01/GCMChannelResponse] :opt-un [] :locations {}))

(clojure.spec.alpha/def :portkey.aws.pinpoint.-2016-12-01.update-apns-sandbox-channel-request/application-id (clojure.spec.alpha/and :portkey.aws.pinpoint.-2016-12-01/--string))
(clojure.spec.alpha/def :portkey.aws.pinpoint.-2016-12-01/update-apns-sandbox-channel-request (portkey.aws/json-keys :req-un [:portkey.aws.pinpoint.-2016-12-01.update-apns-sandbox-channel-request/ApplicationId :portkey.aws.pinpoint.-2016-12-01/APNSSandboxChannelRequest] :opt-un [] :locations {}))

(clojure.spec.alpha/def :portkey.aws.pinpoint.-2016-12-01/get-event-stream-response (portkey.aws/json-keys :req-un [:portkey.aws.pinpoint.-2016-12-01/EventStream] :opt-un [] :locations {}))

(clojure.spec.alpha/def :portkey.aws.pinpoint.-2016-12-01.message-body/message (clojure.spec.alpha/and :portkey.aws.pinpoint.-2016-12-01/--string))
(clojure.spec.alpha/def :portkey.aws.pinpoint.-2016-12-01.message-body/requestid (clojure.spec.alpha/and :portkey.aws.pinpoint.-2016-12-01/--string))
(clojure.spec.alpha/def :portkey.aws.pinpoint.-2016-12-01/message-body (portkey.aws/json-keys :req-un [] :opt-un [:portkey.aws.pinpoint.-2016-12-01.message-body/Message :portkey.aws.pinpoint.-2016-12-01.message-body/RequestID] :locations {}))

(clojure.spec.alpha/def :portkey.aws.pinpoint.-2016-12-01.get-apns-channel-request/application-id (clojure.spec.alpha/and :portkey.aws.pinpoint.-2016-12-01/--string))
(clojure.spec.alpha/def :portkey.aws.pinpoint.-2016-12-01/get-apns-channel-request (portkey.aws/json-keys :req-un [:portkey.aws.pinpoint.-2016-12-01.get-apns-channel-request/ApplicationId] :opt-un [] :locations {}))

(clojure.spec.alpha/def :portkey.aws.pinpoint.-2016-12-01.get-endpoint-request/application-id (clojure.spec.alpha/and :portkey.aws.pinpoint.-2016-12-01/--string))
(clojure.spec.alpha/def :portkey.aws.pinpoint.-2016-12-01.get-endpoint-request/endpoint-id (clojure.spec.alpha/and :portkey.aws.pinpoint.-2016-12-01/--string))
(clojure.spec.alpha/def :portkey.aws.pinpoint.-2016-12-01/get-endpoint-request (portkey.aws/json-keys :req-un [:portkey.aws.pinpoint.-2016-12-01.get-endpoint-request/ApplicationId :portkey.aws.pinpoint.-2016-12-01.get-endpoint-request/EndpointId] :opt-un [] :locations {}))

(clojure.spec.alpha/def :portkey.aws.pinpoint.-2016-12-01.write-event-stream/destination-stream-arn (clojure.spec.alpha/and :portkey.aws.pinpoint.-2016-12-01/--string))
(clojure.spec.alpha/def :portkey.aws.pinpoint.-2016-12-01.write-event-stream/role-arn (clojure.spec.alpha/and :portkey.aws.pinpoint.-2016-12-01/--string))
(clojure.spec.alpha/def :portkey.aws.pinpoint.-2016-12-01/write-event-stream (portkey.aws/json-keys :req-un [] :opt-un [:portkey.aws.pinpoint.-2016-12-01.write-event-stream/DestinationStreamArn :portkey.aws.pinpoint.-2016-12-01.write-event-stream/RoleArn] :locations {}))

(clojure.spec.alpha/def :portkey.aws.pinpoint.-2016-12-01.apnssandbox-channel-response/platform (clojure.spec.alpha/and :portkey.aws.pinpoint.-2016-12-01/--string))
(clojure.spec.alpha/def :portkey.aws.pinpoint.-2016-12-01.apnssandbox-channel-response/last-modified-date (clojure.spec.alpha/and :portkey.aws.pinpoint.-2016-12-01/--string))
(clojure.spec.alpha/def :portkey.aws.pinpoint.-2016-12-01.apnssandbox-channel-response/enabled (clojure.spec.alpha/and :portkey.aws.pinpoint.-2016-12-01/--boolean))
(clojure.spec.alpha/def :portkey.aws.pinpoint.-2016-12-01.apnssandbox-channel-response/application-id (clojure.spec.alpha/and :portkey.aws.pinpoint.-2016-12-01/--string))
(clojure.spec.alpha/def :portkey.aws.pinpoint.-2016-12-01.apnssandbox-channel-response/is-archived (clojure.spec.alpha/and :portkey.aws.pinpoint.-2016-12-01/--boolean))
(clojure.spec.alpha/def :portkey.aws.pinpoint.-2016-12-01.apnssandbox-channel-response/creation-date (clojure.spec.alpha/and :portkey.aws.pinpoint.-2016-12-01/--string))
(clojure.spec.alpha/def :portkey.aws.pinpoint.-2016-12-01.apnssandbox-channel-response/version (clojure.spec.alpha/and :portkey.aws.pinpoint.-2016-12-01/--integer))
(clojure.spec.alpha/def :portkey.aws.pinpoint.-2016-12-01.apnssandbox-channel-response/last-modified-by (clojure.spec.alpha/and :portkey.aws.pinpoint.-2016-12-01/--string))
(clojure.spec.alpha/def :portkey.aws.pinpoint.-2016-12-01.apnssandbox-channel-response/id (clojure.spec.alpha/and :portkey.aws.pinpoint.-2016-12-01/--string))
(clojure.spec.alpha/def :portkey.aws.pinpoint.-2016-12-01/apnssandbox-channel-response (portkey.aws/json-keys :req-un [] :opt-un [:portkey.aws.pinpoint.-2016-12-01.apnssandbox-channel-response/Platform :portkey.aws.pinpoint.-2016-12-01.apnssandbox-channel-response/LastModifiedDate :portkey.aws.pinpoint.-2016-12-01.apnssandbox-channel-response/Enabled :portkey.aws.pinpoint.-2016-12-01.apnssandbox-channel-response/ApplicationId :portkey.aws.pinpoint.-2016-12-01.apnssandbox-channel-response/IsArchived :portkey.aws.pinpoint.-2016-12-01.apnssandbox-channel-response/CreationDate :portkey.aws.pinpoint.-2016-12-01.apnssandbox-channel-response/Version :portkey.aws.pinpoint.-2016-12-01.apnssandbox-channel-response/LastModifiedBy :portkey.aws.pinpoint.-2016-12-01.apnssandbox-channel-response/Id] :locations {}))

(clojure.spec.alpha/def :portkey.aws.pinpoint.-2016-12-01.get-segments-request/application-id (clojure.spec.alpha/and :portkey.aws.pinpoint.-2016-12-01/--string))
(clojure.spec.alpha/def :portkey.aws.pinpoint.-2016-12-01.get-segments-request/page-size (clojure.spec.alpha/and :portkey.aws.pinpoint.-2016-12-01/--string))
(clojure.spec.alpha/def :portkey.aws.pinpoint.-2016-12-01.get-segments-request/token (clojure.spec.alpha/and :portkey.aws.pinpoint.-2016-12-01/--string))
(clojure.spec.alpha/def :portkey.aws.pinpoint.-2016-12-01/get-segments-request (portkey.aws/json-keys :req-un [:portkey.aws.pinpoint.-2016-12-01.get-segments-request/ApplicationId] :opt-un [:portkey.aws.pinpoint.-2016-12-01.get-segments-request/PageSize :portkey.aws.pinpoint.-2016-12-01.get-segments-request/Token] :locations {}))

(clojure.spec.alpha/def :portkey.aws.pinpoint.-2016-12-01.get-apns-sandbox-channel-request/application-id (clojure.spec.alpha/and :portkey.aws.pinpoint.-2016-12-01/--string))
(clojure.spec.alpha/def :portkey.aws.pinpoint.-2016-12-01/get-apns-sandbox-channel-request (portkey.aws/json-keys :req-un [:portkey.aws.pinpoint.-2016-12-01.get-apns-sandbox-channel-request/ApplicationId] :opt-un [] :locations {}))

(clojure.spec.alpha/def :portkey.aws.pinpoint.-2016-12-01.send-messages-request/application-id (clojure.spec.alpha/and :portkey.aws.pinpoint.-2016-12-01/--string))
(clojure.spec.alpha/def :portkey.aws.pinpoint.-2016-12-01/send-messages-request (portkey.aws/json-keys :req-un [:portkey.aws.pinpoint.-2016-12-01.send-messages-request/ApplicationId :portkey.aws.pinpoint.-2016-12-01/MessageRequest] :opt-un [] :locations {}))

(clojure.spec.alpha/def :portkey.aws.pinpoint.-2016-12-01/get-import-job-response (portkey.aws/json-keys :req-un [:portkey.aws.pinpoint.-2016-12-01/ImportJobResponse] :opt-un [] :locations {}))

(clojure.spec.alpha/def :portkey.aws.pinpoint.-2016-12-01/--boolean clojure.core/boolean?)

(clojure.spec.alpha/def :portkey.aws.pinpoint.-2016-12-01.update-sms-channel-request/application-id (clojure.spec.alpha/and :portkey.aws.pinpoint.-2016-12-01/--string))
(clojure.spec.alpha/def :portkey.aws.pinpoint.-2016-12-01/update-sms-channel-request (portkey.aws/json-keys :req-un [:portkey.aws.pinpoint.-2016-12-01.update-sms-channel-request/ApplicationId :portkey.aws.pinpoint.-2016-12-01/SMSChannelRequest] :opt-un [] :locations {}))

(clojure.spec.alpha/def :portkey.aws.pinpoint.-2016-12-01/map-of--double (clojure.spec.alpha/map-of :portkey.aws.pinpoint.-2016-12-01/--string :portkey.aws.pinpoint.-2016-12-01/--double))

(clojure.spec.alpha/def :portkey.aws.pinpoint.-2016-12-01.email-channel-request/enabled (clojure.spec.alpha/and :portkey.aws.pinpoint.-2016-12-01/--boolean))
(clojure.spec.alpha/def :portkey.aws.pinpoint.-2016-12-01.email-channel-request/from-address (clojure.spec.alpha/and :portkey.aws.pinpoint.-2016-12-01/--string))
(clojure.spec.alpha/def :portkey.aws.pinpoint.-2016-12-01.email-channel-request/identity (clojure.spec.alpha/and :portkey.aws.pinpoint.-2016-12-01/--string))
(clojure.spec.alpha/def :portkey.aws.pinpoint.-2016-12-01.email-channel-request/role-arn (clojure.spec.alpha/and :portkey.aws.pinpoint.-2016-12-01/--string))
(clojure.spec.alpha/def :portkey.aws.pinpoint.-2016-12-01/email-channel-request (portkey.aws/json-keys :req-un [] :opt-un [:portkey.aws.pinpoint.-2016-12-01.email-channel-request/Enabled :portkey.aws.pinpoint.-2016-12-01.email-channel-request/FromAddress :portkey.aws.pinpoint.-2016-12-01.email-channel-request/Identity :portkey.aws.pinpoint.-2016-12-01.email-channel-request/RoleArn] :locations {}))

(clojure.spec.alpha/def :portkey.aws.pinpoint.-2016-12-01.set-dimension/values (clojure.spec.alpha/and :portkey.aws.pinpoint.-2016-12-01/list-of--string))
(clojure.spec.alpha/def :portkey.aws.pinpoint.-2016-12-01/set-dimension (portkey.aws/json-keys :req-un [] :opt-un [:portkey.aws.pinpoint.-2016-12-01/DimensionType :portkey.aws.pinpoint.-2016-12-01.set-dimension/Values] :locations {}))

(clojure.spec.alpha/def :portkey.aws.pinpoint.-2016-12-01.segment-behaviors/recency (clojure.spec.alpha/and :portkey.aws.pinpoint.-2016-12-01/recency-dimension))
(clojure.spec.alpha/def :portkey.aws.pinpoint.-2016-12-01/segment-behaviors (portkey.aws/json-keys :req-un [] :opt-un [:portkey.aws.pinpoint.-2016-12-01.segment-behaviors/Recency] :locations {}))

(clojure.spec.alpha/def :portkey.aws.pinpoint.-2016-12-01.segment-dimensions/attributes (clojure.spec.alpha/and :portkey.aws.pinpoint.-2016-12-01/map-of-attribute-dimension))
(clojure.spec.alpha/def :portkey.aws.pinpoint.-2016-12-01.segment-dimensions/behavior (clojure.spec.alpha/and :portkey.aws.pinpoint.-2016-12-01/segment-behaviors))
(clojure.spec.alpha/def :portkey.aws.pinpoint.-2016-12-01.segment-dimensions/demographic (clojure.spec.alpha/and :portkey.aws.pinpoint.-2016-12-01/segment-demographics))
(clojure.spec.alpha/def :portkey.aws.pinpoint.-2016-12-01.segment-dimensions/location (clojure.spec.alpha/and :portkey.aws.pinpoint.-2016-12-01/segment-location))
(clojure.spec.alpha/def :portkey.aws.pinpoint.-2016-12-01.segment-dimensions/user-attributes (clojure.spec.alpha/and :portkey.aws.pinpoint.-2016-12-01/map-of-attribute-dimension))
(clojure.spec.alpha/def :portkey.aws.pinpoint.-2016-12-01/segment-dimensions (portkey.aws/json-keys :req-un [] :opt-un [:portkey.aws.pinpoint.-2016-12-01.segment-dimensions/Attributes :portkey.aws.pinpoint.-2016-12-01.segment-dimensions/Behavior :portkey.aws.pinpoint.-2016-12-01.segment-dimensions/Demographic :portkey.aws.pinpoint.-2016-12-01.segment-dimensions/Location :portkey.aws.pinpoint.-2016-12-01.segment-dimensions/UserAttributes] :locations {}))

(clojure.spec.alpha/def :portkey.aws.pinpoint.-2016-12-01.get-email-channel-request/application-id (clojure.spec.alpha/and :portkey.aws.pinpoint.-2016-12-01/--string))
(clojure.spec.alpha/def :portkey.aws.pinpoint.-2016-12-01/get-email-channel-request (portkey.aws/json-keys :req-un [:portkey.aws.pinpoint.-2016-12-01.get-email-channel-request/ApplicationId] :opt-un [] :locations {}))

(clojure.spec.alpha/def :portkey.aws.pinpoint.-2016-12-01.default-message/body (clojure.spec.alpha/and :portkey.aws.pinpoint.-2016-12-01/--string))
(clojure.spec.alpha/def :portkey.aws.pinpoint.-2016-12-01.default-message/substitutions (clojure.spec.alpha/and :portkey.aws.pinpoint.-2016-12-01/map-of-list-of--string))
(clojure.spec.alpha/def :portkey.aws.pinpoint.-2016-12-01/default-message (portkey.aws/json-keys :req-un [] :opt-un [:portkey.aws.pinpoint.-2016-12-01.default-message/Body :portkey.aws.pinpoint.-2016-12-01.default-message/Substitutions] :locations {}))

(clojure.spec.alpha/def :portkey.aws.pinpoint.-2016-12-01.message/body (clojure.spec.alpha/and :portkey.aws.pinpoint.-2016-12-01/--string))
(clojure.spec.alpha/def :portkey.aws.pinpoint.-2016-12-01.message/image-url (clojure.spec.alpha/and :portkey.aws.pinpoint.-2016-12-01/--string))
(clojure.spec.alpha/def :portkey.aws.pinpoint.-2016-12-01.message/title (clojure.spec.alpha/and :portkey.aws.pinpoint.-2016-12-01/--string))
(clojure.spec.alpha/def :portkey.aws.pinpoint.-2016-12-01.message/silent-push (clojure.spec.alpha/and :portkey.aws.pinpoint.-2016-12-01/--boolean))
(clojure.spec.alpha/def :portkey.aws.pinpoint.-2016-12-01.message/raw-content (clojure.spec.alpha/and :portkey.aws.pinpoint.-2016-12-01/--string))
(clojure.spec.alpha/def :portkey.aws.pinpoint.-2016-12-01.message/url (clojure.spec.alpha/and :portkey.aws.pinpoint.-2016-12-01/--string))
(clojure.spec.alpha/def :portkey.aws.pinpoint.-2016-12-01.message/json-body (clojure.spec.alpha/and :portkey.aws.pinpoint.-2016-12-01/--string))
(clojure.spec.alpha/def :portkey.aws.pinpoint.-2016-12-01.message/image-small-icon-url (clojure.spec.alpha/and :portkey.aws.pinpoint.-2016-12-01/--string))
(clojure.spec.alpha/def :portkey.aws.pinpoint.-2016-12-01.message/media-url (clojure.spec.alpha/and :portkey.aws.pinpoint.-2016-12-01/--string))
(clojure.spec.alpha/def :portkey.aws.pinpoint.-2016-12-01.message/image-icon-url (clojure.spec.alpha/and :portkey.aws.pinpoint.-2016-12-01/--string))
(clojure.spec.alpha/def :portkey.aws.pinpoint.-2016-12-01/message (portkey.aws/json-keys :req-un [] :opt-un [:portkey.aws.pinpoint.-2016-12-01.message/Body :portkey.aws.pinpoint.-2016-12-01.message/ImageUrl :portkey.aws.pinpoint.-2016-12-01.message/Title :portkey.aws.pinpoint.-2016-12-01.message/SilentPush :portkey.aws.pinpoint.-2016-12-01.message/RawContent :portkey.aws.pinpoint.-2016-12-01.message/Url :portkey.aws.pinpoint.-2016-12-01.message/JsonBody :portkey.aws.pinpoint.-2016-12-01.message/ImageSmallIconUrl :portkey.aws.pinpoint.-2016-12-01.message/MediaUrl :portkey.aws.pinpoint.-2016-12-01.message/ImageIconUrl :portkey.aws.pinpoint.-2016-12-01/Action] :locations {}))

(clojure.spec.alpha/def :portkey.aws.pinpoint.-2016-12-01/map-of-address-configuration (clojure.spec.alpha/map-of :portkey.aws.pinpoint.-2016-12-01/--string :portkey.aws.pinpoint.-2016-12-01/address-configuration))

(clojure.spec.alpha/def :portkey.aws.pinpoint.-2016-12-01.update-endpoints-batch-request/application-id (clojure.spec.alpha/and :portkey.aws.pinpoint.-2016-12-01/--string))
(clojure.spec.alpha/def :portkey.aws.pinpoint.-2016-12-01/update-endpoints-batch-request (portkey.aws/json-keys :req-un [:portkey.aws.pinpoint.-2016-12-01.update-endpoints-batch-request/ApplicationId :portkey.aws.pinpoint.-2016-12-01/EndpointBatchRequest] :opt-un [] :locations {}))

(clojure.spec.alpha/def :portkey.aws.pinpoint.-2016-12-01.apnschannel-request/certificate (clojure.spec.alpha/and :portkey.aws.pinpoint.-2016-12-01/--string))
(clojure.spec.alpha/def :portkey.aws.pinpoint.-2016-12-01.apnschannel-request/enabled (clojure.spec.alpha/and :portkey.aws.pinpoint.-2016-12-01/--boolean))
(clojure.spec.alpha/def :portkey.aws.pinpoint.-2016-12-01.apnschannel-request/private-key (clojure.spec.alpha/and :portkey.aws.pinpoint.-2016-12-01/--string))
(clojure.spec.alpha/def :portkey.aws.pinpoint.-2016-12-01/apnschannel-request (portkey.aws/json-keys :req-un [] :opt-un [:portkey.aws.pinpoint.-2016-12-01.apnschannel-request/Certificate :portkey.aws.pinpoint.-2016-12-01.apnschannel-request/Enabled :portkey.aws.pinpoint.-2016-12-01.apnschannel-request/PrivateKey] :locations {}))

(clojure.spec.alpha/def :portkey.aws.pinpoint.-2016-12-01/dimension-type (clojure.spec.alpha/conformer (clojure.core/let [m__96543__auto__ {"INCLUSIVE" "INCLUSIVE", :inclusive "INCLUSIVE", "EXCLUSIVE" "EXCLUSIVE", :exclusive "EXCLUSIVE"}] (clojure.core/fn [s__96544__auto__] (m__96543__auto__ s__96544__auto__ :clojure.spec.alpha/invalid))) (clojure.core/comp clojure.core/keyword portkey.aws/dashed)))

(clojure.spec.alpha/def :portkey.aws.pinpoint.-2016-12-01.application-settings-resource/application-id (clojure.spec.alpha/and :portkey.aws.pinpoint.-2016-12-01/--string))
(clojure.spec.alpha/def :portkey.aws.pinpoint.-2016-12-01.application-settings-resource/last-modified-date (clojure.spec.alpha/and :portkey.aws.pinpoint.-2016-12-01/--string))
(clojure.spec.alpha/def :portkey.aws.pinpoint.-2016-12-01.application-settings-resource/limits (clojure.spec.alpha/and :portkey.aws.pinpoint.-2016-12-01/campaign-limits))
(clojure.spec.alpha/def :portkey.aws.pinpoint.-2016-12-01/application-settings-resource (portkey.aws/json-keys :req-un [] :opt-un [:portkey.aws.pinpoint.-2016-12-01.application-settings-resource/ApplicationId :portkey.aws.pinpoint.-2016-12-01.application-settings-resource/LastModifiedDate :portkey.aws.pinpoint.-2016-12-01.application-settings-resource/Limits :portkey.aws.pinpoint.-2016-12-01/QuietTime] :locations {}))

(clojure.spec.alpha/def :portkey.aws.pinpoint.-2016-12-01.delete-app-request/application-id (clojure.spec.alpha/and :portkey.aws.pinpoint.-2016-12-01/--string))
(clojure.spec.alpha/def :portkey.aws.pinpoint.-2016-12-01/delete-app-request (portkey.aws/json-keys :req-un [:portkey.aws.pinpoint.-2016-12-01.delete-app-request/ApplicationId] :opt-un [] :locations {}))

(clojure.spec.alpha/def :portkey.aws.pinpoint.-2016-12-01.put-event-stream-request/application-id (clojure.spec.alpha/and :portkey.aws.pinpoint.-2016-12-01/--string))
(clojure.spec.alpha/def :portkey.aws.pinpoint.-2016-12-01/put-event-stream-request (portkey.aws/json-keys :req-un [:portkey.aws.pinpoint.-2016-12-01.put-event-stream-request/ApplicationId :portkey.aws.pinpoint.-2016-12-01/WriteEventStream] :opt-un [] :locations {}))

(clojure.spec.alpha/def :portkey.aws.pinpoint.-2016-12-01.not-found-exception/message (clojure.spec.alpha/and :portkey.aws.pinpoint.-2016-12-01/--string))
(clojure.spec.alpha/def :portkey.aws.pinpoint.-2016-12-01.not-found-exception/requestid (clojure.spec.alpha/and :portkey.aws.pinpoint.-2016-12-01/--string))
(clojure.spec.alpha/def :portkey.aws.pinpoint.-2016-12-01/not-found-exception (portkey.aws/json-keys :req-un [] :opt-un [:portkey.aws.pinpoint.-2016-12-01.not-found-exception/Message :portkey.aws.pinpoint.-2016-12-01.not-found-exception/RequestID] :locations {}))

(clojure.spec.alpha/def :portkey.aws.pinpoint.-2016-12-01.get-campaign-versions-request/application-id (clojure.spec.alpha/and :portkey.aws.pinpoint.-2016-12-01/--string))
(clojure.spec.alpha/def :portkey.aws.pinpoint.-2016-12-01.get-campaign-versions-request/campaign-id (clojure.spec.alpha/and :portkey.aws.pinpoint.-2016-12-01/--string))
(clojure.spec.alpha/def :portkey.aws.pinpoint.-2016-12-01.get-campaign-versions-request/page-size (clojure.spec.alpha/and :portkey.aws.pinpoint.-2016-12-01/--string))
(clojure.spec.alpha/def :portkey.aws.pinpoint.-2016-12-01.get-campaign-versions-request/token (clojure.spec.alpha/and :portkey.aws.pinpoint.-2016-12-01/--string))
(clojure.spec.alpha/def :portkey.aws.pinpoint.-2016-12-01/get-campaign-versions-request (portkey.aws/json-keys :req-un [:portkey.aws.pinpoint.-2016-12-01.get-campaign-versions-request/ApplicationId :portkey.aws.pinpoint.-2016-12-01.get-campaign-versions-request/CampaignId] :opt-un [:portkey.aws.pinpoint.-2016-12-01.get-campaign-versions-request/PageSize :portkey.aws.pinpoint.-2016-12-01.get-campaign-versions-request/Token] :locations {}))

(clojure.spec.alpha/def :portkey.aws.pinpoint.-2016-12-01/duration (clojure.spec.alpha/conformer (clojure.core/let [m__96543__auto__ {"HR_24" "HR_24", :hr-24 "HR_24", "DAY_7" "DAY_7", :day-7 "DAY_7", "DAY_14" "DAY_14", :day-14 "DAY_14", "DAY_30" "DAY_30", :day-30 "DAY_30"}] (clojure.core/fn [s__96544__auto__] (m__96543__auto__ s__96544__auto__ :clojure.spec.alpha/invalid))) (clojure.core/comp clojure.core/keyword portkey.aws/dashed)))

(clojure.spec.alpha/def :portkey.aws.pinpoint.-2016-12-01/update-gcm-channel-response (portkey.aws/json-keys :req-un [:portkey.aws.pinpoint.-2016-12-01/GCMChannelResponse] :opt-un [] :locations {}))

(clojure.spec.alpha/def :portkey.aws.pinpoint.-2016-12-01.delete-email-channel-request/application-id (clojure.spec.alpha/and :portkey.aws.pinpoint.-2016-12-01/--string))
(clojure.spec.alpha/def :portkey.aws.pinpoint.-2016-12-01/delete-email-channel-request (portkey.aws/json-keys :req-un [:portkey.aws.pinpoint.-2016-12-01.delete-email-channel-request/ApplicationId] :opt-un [] :locations {}))

(clojure.spec.alpha/def :portkey.aws.pinpoint.-2016-12-01.get-segment-version-request/application-id (clojure.spec.alpha/and :portkey.aws.pinpoint.-2016-12-01/--string))
(clojure.spec.alpha/def :portkey.aws.pinpoint.-2016-12-01.get-segment-version-request/segment-id (clojure.spec.alpha/and :portkey.aws.pinpoint.-2016-12-01/--string))
(clojure.spec.alpha/def :portkey.aws.pinpoint.-2016-12-01.get-segment-version-request/version (clojure.spec.alpha/and :portkey.aws.pinpoint.-2016-12-01/--string))
(clojure.spec.alpha/def :portkey.aws.pinpoint.-2016-12-01/get-segment-version-request (portkey.aws/json-keys :req-un [:portkey.aws.pinpoint.-2016-12-01.get-segment-version-request/SegmentId :portkey.aws.pinpoint.-2016-12-01.get-segment-version-request/Version :portkey.aws.pinpoint.-2016-12-01.get-segment-version-request/ApplicationId] :opt-un [] :locations {}))

(clojure.spec.alpha/def :portkey.aws.pinpoint.-2016-12-01.write-segment-request/dimensions (clojure.spec.alpha/and :portkey.aws.pinpoint.-2016-12-01/segment-dimensions))
(clojure.spec.alpha/def :portkey.aws.pinpoint.-2016-12-01.write-segment-request/name (clojure.spec.alpha/and :portkey.aws.pinpoint.-2016-12-01/--string))
(clojure.spec.alpha/def :portkey.aws.pinpoint.-2016-12-01/write-segment-request (portkey.aws/json-keys :req-un [] :opt-un [:portkey.aws.pinpoint.-2016-12-01.write-segment-request/Dimensions :portkey.aws.pinpoint.-2016-12-01.write-segment-request/Name] :locations {}))

(clojure.spec.alpha/def :portkey.aws.pinpoint.-2016-12-01/get-campaign-response (portkey.aws/json-keys :req-un [:portkey.aws.pinpoint.-2016-12-01/CampaignResponse] :opt-un [] :locations {}))

(clojure.spec.alpha/def :portkey.aws.pinpoint.-2016-12-01.update-application-settings-request/application-id (clojure.spec.alpha/and :portkey.aws.pinpoint.-2016-12-01/--string))
(clojure.spec.alpha/def :portkey.aws.pinpoint.-2016-12-01/update-application-settings-request (portkey.aws/json-keys :req-un [:portkey.aws.pinpoint.-2016-12-01.update-application-settings-request/ApplicationId :portkey.aws.pinpoint.-2016-12-01/WriteApplicationSettingsRequest] :opt-un [] :locations {}))

(clojure.spec.alpha/def :portkey.aws.pinpoint.-2016-12-01/delete-gcm-channel-response (portkey.aws/json-keys :req-un [:portkey.aws.pinpoint.-2016-12-01/GCMChannelResponse] :opt-un [] :locations {}))

(clojure.spec.alpha/def :portkey.aws.pinpoint.-2016-12-01/map-of-attribute-dimension (clojure.spec.alpha/map-of :portkey.aws.pinpoint.-2016-12-01/--string :portkey.aws.pinpoint.-2016-12-01/attribute-dimension))

(clojure.spec.alpha/def :portkey.aws.pinpoint.-2016-12-01.delete-segment-request/application-id (clojure.spec.alpha/and :portkey.aws.pinpoint.-2016-12-01/--string))
(clojure.spec.alpha/def :portkey.aws.pinpoint.-2016-12-01.delete-segment-request/segment-id (clojure.spec.alpha/and :portkey.aws.pinpoint.-2016-12-01/--string))
(clojure.spec.alpha/def :portkey.aws.pinpoint.-2016-12-01/delete-segment-request (portkey.aws/json-keys :req-un [:portkey.aws.pinpoint.-2016-12-01.delete-segment-request/SegmentId :portkey.aws.pinpoint.-2016-12-01.delete-segment-request/ApplicationId] :opt-un [] :locations {}))

(clojure.spec.alpha/def :portkey.aws.pinpoint.-2016-12-01.get-app-request/application-id (clojure.spec.alpha/and :portkey.aws.pinpoint.-2016-12-01/--string))
(clojure.spec.alpha/def :portkey.aws.pinpoint.-2016-12-01/get-app-request (portkey.aws/json-keys :req-un [:portkey.aws.pinpoint.-2016-12-01.get-app-request/ApplicationId] :opt-un [] :locations {}))

(clojure.spec.alpha/def :portkey.aws.pinpoint.-2016-12-01.endpoint-request/address (clojure.spec.alpha/and :portkey.aws.pinpoint.-2016-12-01/--string))
(clojure.spec.alpha/def :portkey.aws.pinpoint.-2016-12-01.endpoint-request/endpoint-status (clojure.spec.alpha/and :portkey.aws.pinpoint.-2016-12-01/--string))
(clojure.spec.alpha/def :portkey.aws.pinpoint.-2016-12-01.endpoint-request/request-id (clojure.spec.alpha/and :portkey.aws.pinpoint.-2016-12-01/--string))
(clojure.spec.alpha/def :portkey.aws.pinpoint.-2016-12-01.endpoint-request/location (clojure.spec.alpha/and :portkey.aws.pinpoint.-2016-12-01/endpoint-location))
(clojure.spec.alpha/def :portkey.aws.pinpoint.-2016-12-01.endpoint-request/demographic (clojure.spec.alpha/and :portkey.aws.pinpoint.-2016-12-01/endpoint-demographic))
(clojure.spec.alpha/def :portkey.aws.pinpoint.-2016-12-01.endpoint-request/user (clojure.spec.alpha/and :portkey.aws.pinpoint.-2016-12-01/endpoint-user))
(clojure.spec.alpha/def :portkey.aws.pinpoint.-2016-12-01.endpoint-request/attributes (clojure.spec.alpha/and :portkey.aws.pinpoint.-2016-12-01/map-of-list-of--string))
(clojure.spec.alpha/def :portkey.aws.pinpoint.-2016-12-01.endpoint-request/effective-date (clojure.spec.alpha/and :portkey.aws.pinpoint.-2016-12-01/--string))
(clojure.spec.alpha/def :portkey.aws.pinpoint.-2016-12-01.endpoint-request/opt-out (clojure.spec.alpha/and :portkey.aws.pinpoint.-2016-12-01/--string))
(clojure.spec.alpha/def :portkey.aws.pinpoint.-2016-12-01.endpoint-request/metrics (clojure.spec.alpha/and :portkey.aws.pinpoint.-2016-12-01/map-of--double))
(clojure.spec.alpha/def :portkey.aws.pinpoint.-2016-12-01/endpoint-request (portkey.aws/json-keys :req-un [] :opt-un [:portkey.aws.pinpoint.-2016-12-01.endpoint-request/Address :portkey.aws.pinpoint.-2016-12-01.endpoint-request/EndpointStatus :portkey.aws.pinpoint.-2016-12-01.endpoint-request/RequestId :portkey.aws.pinpoint.-2016-12-01.endpoint-request/Location :portkey.aws.pinpoint.-2016-12-01.endpoint-request/Demographic :portkey.aws.pinpoint.-2016-12-01.endpoint-request/User :portkey.aws.pinpoint.-2016-12-01.endpoint-request/Attributes :portkey.aws.pinpoint.-2016-12-01.endpoint-request/EffectiveDate :portkey.aws.pinpoint.-2016-12-01.endpoint-request/OptOut :portkey.aws.pinpoint.-2016-12-01/ChannelType :portkey.aws.pinpoint.-2016-12-01.endpoint-request/Metrics] :locations {}))

(clojure.spec.alpha/def :portkey.aws.pinpoint.-2016-12-01.endpoint-batch-request/item (clojure.spec.alpha/and :portkey.aws.pinpoint.-2016-12-01/list-of-endpoint-batch-item))
(clojure.spec.alpha/def :portkey.aws.pinpoint.-2016-12-01/endpoint-batch-request (portkey.aws/json-keys :req-un [] :opt-un [:portkey.aws.pinpoint.-2016-12-01.endpoint-batch-request/Item] :locations {}))

(clojure.spec.alpha/def :portkey.aws.pinpoint.-2016-12-01.smschannel-request/enabled (clojure.spec.alpha/and :portkey.aws.pinpoint.-2016-12-01/--boolean))
(clojure.spec.alpha/def :portkey.aws.pinpoint.-2016-12-01.smschannel-request/sender-id (clojure.spec.alpha/and :portkey.aws.pinpoint.-2016-12-01/--string))
(clojure.spec.alpha/def :portkey.aws.pinpoint.-2016-12-01/smschannel-request (portkey.aws/json-keys :req-un [] :opt-un [:portkey.aws.pinpoint.-2016-12-01.smschannel-request/Enabled :portkey.aws.pinpoint.-2016-12-01.smschannel-request/SenderId] :locations {}))

(clojure.spec.alpha/def :portkey.aws.pinpoint.-2016-12-01/get-segment-version-response (portkey.aws/json-keys :req-un [:portkey.aws.pinpoint.-2016-12-01/SegmentResponse] :opt-un [] :locations {}))

(clojure.spec.alpha/def :portkey.aws.pinpoint.-2016-12-01/recency-dimension (portkey.aws/json-keys :req-un [] :opt-un [:portkey.aws.pinpoint.-2016-12-01/Duration :portkey.aws.pinpoint.-2016-12-01/RecencyType] :locations {}))

(clojure.spec.alpha/def :portkey.aws.pinpoint.-2016-12-01.address-configuration/body-override (clojure.spec.alpha/and :portkey.aws.pinpoint.-2016-12-01/--string))
(clojure.spec.alpha/def :portkey.aws.pinpoint.-2016-12-01.address-configuration/context (clojure.spec.alpha/and :portkey.aws.pinpoint.-2016-12-01/map-of--string))
(clojure.spec.alpha/def :portkey.aws.pinpoint.-2016-12-01.address-configuration/raw-content (clojure.spec.alpha/and :portkey.aws.pinpoint.-2016-12-01/--string))
(clojure.spec.alpha/def :portkey.aws.pinpoint.-2016-12-01.address-configuration/substitutions (clojure.spec.alpha/and :portkey.aws.pinpoint.-2016-12-01/map-of-list-of--string))
(clojure.spec.alpha/def :portkey.aws.pinpoint.-2016-12-01.address-configuration/title-override (clojure.spec.alpha/and :portkey.aws.pinpoint.-2016-12-01/--string))
(clojure.spec.alpha/def :portkey.aws.pinpoint.-2016-12-01/address-configuration (portkey.aws/json-keys :req-un [] :opt-un [:portkey.aws.pinpoint.-2016-12-01.address-configuration/BodyOverride :portkey.aws.pinpoint.-2016-12-01/ChannelType :portkey.aws.pinpoint.-2016-12-01.address-configuration/Context :portkey.aws.pinpoint.-2016-12-01.address-configuration/RawContent :portkey.aws.pinpoint.-2016-12-01.address-configuration/Substitutions :portkey.aws.pinpoint.-2016-12-01.address-configuration/TitleOverride] :locations {}))

(clojure.spec.alpha/def :portkey.aws.pinpoint.-2016-12-01/put-event-stream-response (portkey.aws/json-keys :req-un [:portkey.aws.pinpoint.-2016-12-01/EventStream] :opt-un [] :locations {}))

(clojure.spec.alpha/def :portkey.aws.pinpoint.-2016-12-01/update-apns-channel-response (portkey.aws/json-keys :req-un [:portkey.aws.pinpoint.-2016-12-01/APNSChannelResponse] :opt-un [] :locations {}))

(clojure.spec.alpha/def :portkey.aws.pinpoint.-2016-12-01.endpoint-batch-item/address (clojure.spec.alpha/and :portkey.aws.pinpoint.-2016-12-01/--string))
(clojure.spec.alpha/def :portkey.aws.pinpoint.-2016-12-01.endpoint-batch-item/endpoint-status (clojure.spec.alpha/and :portkey.aws.pinpoint.-2016-12-01/--string))
(clojure.spec.alpha/def :portkey.aws.pinpoint.-2016-12-01.endpoint-batch-item/request-id (clojure.spec.alpha/and :portkey.aws.pinpoint.-2016-12-01/--string))
(clojure.spec.alpha/def :portkey.aws.pinpoint.-2016-12-01.endpoint-batch-item/location (clojure.spec.alpha/and :portkey.aws.pinpoint.-2016-12-01/endpoint-location))
(clojure.spec.alpha/def :portkey.aws.pinpoint.-2016-12-01.endpoint-batch-item/demographic (clojure.spec.alpha/and :portkey.aws.pinpoint.-2016-12-01/endpoint-demographic))
(clojure.spec.alpha/def :portkey.aws.pinpoint.-2016-12-01.endpoint-batch-item/user (clojure.spec.alpha/and :portkey.aws.pinpoint.-2016-12-01/endpoint-user))
(clojure.spec.alpha/def :portkey.aws.pinpoint.-2016-12-01.endpoint-batch-item/attributes (clojure.spec.alpha/and :portkey.aws.pinpoint.-2016-12-01/map-of-list-of--string))
(clojure.spec.alpha/def :portkey.aws.pinpoint.-2016-12-01.endpoint-batch-item/effective-date (clojure.spec.alpha/and :portkey.aws.pinpoint.-2016-12-01/--string))
(clojure.spec.alpha/def :portkey.aws.pinpoint.-2016-12-01.endpoint-batch-item/opt-out (clojure.spec.alpha/and :portkey.aws.pinpoint.-2016-12-01/--string))
(clojure.spec.alpha/def :portkey.aws.pinpoint.-2016-12-01.endpoint-batch-item/id (clojure.spec.alpha/and :portkey.aws.pinpoint.-2016-12-01/--string))
(clojure.spec.alpha/def :portkey.aws.pinpoint.-2016-12-01.endpoint-batch-item/metrics (clojure.spec.alpha/and :portkey.aws.pinpoint.-2016-12-01/map-of--double))
(clojure.spec.alpha/def :portkey.aws.pinpoint.-2016-12-01/endpoint-batch-item (portkey.aws/json-keys :req-un [] :opt-un [:portkey.aws.pinpoint.-2016-12-01.endpoint-batch-item/Address :portkey.aws.pinpoint.-2016-12-01.endpoint-batch-item/EndpointStatus :portkey.aws.pinpoint.-2016-12-01.endpoint-batch-item/RequestId :portkey.aws.pinpoint.-2016-12-01.endpoint-batch-item/Location :portkey.aws.pinpoint.-2016-12-01.endpoint-batch-item/Demographic :portkey.aws.pinpoint.-2016-12-01.endpoint-batch-item/User :portkey.aws.pinpoint.-2016-12-01.endpoint-batch-item/Attributes :portkey.aws.pinpoint.-2016-12-01.endpoint-batch-item/EffectiveDate :portkey.aws.pinpoint.-2016-12-01.endpoint-batch-item/OptOut :portkey.aws.pinpoint.-2016-12-01.endpoint-batch-item/Id :portkey.aws.pinpoint.-2016-12-01/ChannelType :portkey.aws.pinpoint.-2016-12-01.endpoint-batch-item/Metrics] :locations {}))

(clojure.spec.alpha/def :portkey.aws.pinpoint.-2016-12-01.get-application-settings-request/application-id (clojure.spec.alpha/and :portkey.aws.pinpoint.-2016-12-01/--string))
(clojure.spec.alpha/def :portkey.aws.pinpoint.-2016-12-01/get-application-settings-request (portkey.aws/json-keys :req-un [:portkey.aws.pinpoint.-2016-12-01.get-application-settings-request/ApplicationId] :opt-un [] :locations {}))

(clojure.spec.alpha/def :portkey.aws.pinpoint.-2016-12-01/create-import-job-response (portkey.aws/json-keys :req-un [:portkey.aws.pinpoint.-2016-12-01/ImportJobResponse] :opt-un [] :locations {}))

(clojure.spec.alpha/def :portkey.aws.pinpoint.-2016-12-01/list-of-write-treatment-resource (clojure.spec.alpha/and (clojure.spec.alpha/coll-of :portkey.aws.pinpoint.-2016-12-01/write-treatment-resource :max-count nil) (clojure.spec.alpha/conformer clojure.core/identity (fn* [p1__129128__129129__auto__] (if (clojure.core/sequential? p1__129128__129129__auto__) p1__129128__129129__auto__ [p1__129128__129129__auto__])))))

(clojure.spec.alpha/def :portkey.aws.pinpoint.-2016-12-01.write-treatment-resource/size-percent (clojure.spec.alpha/and :portkey.aws.pinpoint.-2016-12-01/--integer))
(clojure.spec.alpha/def :portkey.aws.pinpoint.-2016-12-01.write-treatment-resource/treatment-description (clojure.spec.alpha/and :portkey.aws.pinpoint.-2016-12-01/--string))
(clojure.spec.alpha/def :portkey.aws.pinpoint.-2016-12-01.write-treatment-resource/treatment-name (clojure.spec.alpha/and :portkey.aws.pinpoint.-2016-12-01/--string))
(clojure.spec.alpha/def :portkey.aws.pinpoint.-2016-12-01/write-treatment-resource (portkey.aws/json-keys :req-un [] :opt-un [:portkey.aws.pinpoint.-2016-12-01/MessageConfiguration :portkey.aws.pinpoint.-2016-12-01/Schedule :portkey.aws.pinpoint.-2016-12-01.write-treatment-resource/SizePercent :portkey.aws.pinpoint.-2016-12-01.write-treatment-resource/TreatmentDescription :portkey.aws.pinpoint.-2016-12-01.write-treatment-resource/TreatmentName] :locations {}))

(clojure.spec.alpha/def :portkey.aws.pinpoint.-2016-12-01.event-stream/application-id (clojure.spec.alpha/and :portkey.aws.pinpoint.-2016-12-01/--string))
(clojure.spec.alpha/def :portkey.aws.pinpoint.-2016-12-01.event-stream/destination-stream-arn (clojure.spec.alpha/and :portkey.aws.pinpoint.-2016-12-01/--string))
(clojure.spec.alpha/def :portkey.aws.pinpoint.-2016-12-01.event-stream/external-id (clojure.spec.alpha/and :portkey.aws.pinpoint.-2016-12-01/--string))
(clojure.spec.alpha/def :portkey.aws.pinpoint.-2016-12-01.event-stream/last-modified-date (clojure.spec.alpha/and :portkey.aws.pinpoint.-2016-12-01/--string))
(clojure.spec.alpha/def :portkey.aws.pinpoint.-2016-12-01.event-stream/last-updated-by (clojure.spec.alpha/and :portkey.aws.pinpoint.-2016-12-01/--string))
(clojure.spec.alpha/def :portkey.aws.pinpoint.-2016-12-01.event-stream/role-arn (clojure.spec.alpha/and :portkey.aws.pinpoint.-2016-12-01/--string))
(clojure.spec.alpha/def :portkey.aws.pinpoint.-2016-12-01/event-stream (portkey.aws/json-keys :req-un [] :opt-un [:portkey.aws.pinpoint.-2016-12-01.event-stream/ApplicationId :portkey.aws.pinpoint.-2016-12-01.event-stream/DestinationStreamArn :portkey.aws.pinpoint.-2016-12-01.event-stream/ExternalId :portkey.aws.pinpoint.-2016-12-01.event-stream/LastModifiedDate :portkey.aws.pinpoint.-2016-12-01.event-stream/LastUpdatedBy :portkey.aws.pinpoint.-2016-12-01.event-stream/RoleArn] :locations {}))

(clojure.spec.alpha/def :portkey.aws.pinpoint.-2016-12-01.get-segment-versions-request/application-id (clojure.spec.alpha/and :portkey.aws.pinpoint.-2016-12-01/--string))
(clojure.spec.alpha/def :portkey.aws.pinpoint.-2016-12-01.get-segment-versions-request/page-size (clojure.spec.alpha/and :portkey.aws.pinpoint.-2016-12-01/--string))
(clojure.spec.alpha/def :portkey.aws.pinpoint.-2016-12-01.get-segment-versions-request/segment-id (clojure.spec.alpha/and :portkey.aws.pinpoint.-2016-12-01/--string))
(clojure.spec.alpha/def :portkey.aws.pinpoint.-2016-12-01.get-segment-versions-request/token (clojure.spec.alpha/and :portkey.aws.pinpoint.-2016-12-01/--string))
(clojure.spec.alpha/def :portkey.aws.pinpoint.-2016-12-01/get-segment-versions-request (portkey.aws/json-keys :req-un [:portkey.aws.pinpoint.-2016-12-01.get-segment-versions-request/SegmentId :portkey.aws.pinpoint.-2016-12-01.get-segment-versions-request/ApplicationId] :opt-un [:portkey.aws.pinpoint.-2016-12-01.get-segment-versions-request/PageSize :portkey.aws.pinpoint.-2016-12-01.get-segment-versions-request/Token] :locations {}))

(clojure.spec.alpha/def :portkey.aws.pinpoint.-2016-12-01/delete-email-channel-response (portkey.aws/json-keys :req-un [:portkey.aws.pinpoint.-2016-12-01/EmailChannelResponse] :opt-un [] :locations {}))

(clojure.spec.alpha/def :portkey.aws.pinpoint.-2016-12-01.smsmessage/body (clojure.spec.alpha/and :portkey.aws.pinpoint.-2016-12-01/--string))
(clojure.spec.alpha/def :portkey.aws.pinpoint.-2016-12-01.smsmessage/sender-id (clojure.spec.alpha/and :portkey.aws.pinpoint.-2016-12-01/--string))
(clojure.spec.alpha/def :portkey.aws.pinpoint.-2016-12-01.smsmessage/substitutions (clojure.spec.alpha/and :portkey.aws.pinpoint.-2016-12-01/map-of-list-of--string))
(clojure.spec.alpha/def :portkey.aws.pinpoint.-2016-12-01/smsmessage (portkey.aws/json-keys :req-un [] :opt-un [:portkey.aws.pinpoint.-2016-12-01.smsmessage/Body :portkey.aws.pinpoint.-2016-12-01/MessageType :portkey.aws.pinpoint.-2016-12-01.smsmessage/SenderId :portkey.aws.pinpoint.-2016-12-01.smsmessage/Substitutions] :locations {}))

(clojure.spec.alpha/def :portkey.aws.pinpoint.-2016-12-01.get-apps-request/page-size (clojure.spec.alpha/and :portkey.aws.pinpoint.-2016-12-01/--string))
(clojure.spec.alpha/def :portkey.aws.pinpoint.-2016-12-01.get-apps-request/token (clojure.spec.alpha/and :portkey.aws.pinpoint.-2016-12-01/--string))
(clojure.spec.alpha/def :portkey.aws.pinpoint.-2016-12-01/get-apps-request (portkey.aws/json-keys :req-un [] :opt-un [:portkey.aws.pinpoint.-2016-12-01.get-apps-request/PageSize :portkey.aws.pinpoint.-2016-12-01.get-apps-request/Token] :locations {}))

(clojure.spec.alpha/def :portkey.aws.pinpoint.-2016-12-01.get-campaigns-request/application-id (clojure.spec.alpha/and :portkey.aws.pinpoint.-2016-12-01/--string))
(clojure.spec.alpha/def :portkey.aws.pinpoint.-2016-12-01.get-campaigns-request/page-size (clojure.spec.alpha/and :portkey.aws.pinpoint.-2016-12-01/--string))
(clojure.spec.alpha/def :portkey.aws.pinpoint.-2016-12-01.get-campaigns-request/token (clojure.spec.alpha/and :portkey.aws.pinpoint.-2016-12-01/--string))
(clojure.spec.alpha/def :portkey.aws.pinpoint.-2016-12-01/get-campaigns-request (portkey.aws/json-keys :req-un [:portkey.aws.pinpoint.-2016-12-01.get-campaigns-request/ApplicationId] :opt-un [:portkey.aws.pinpoint.-2016-12-01.get-campaigns-request/PageSize :portkey.aws.pinpoint.-2016-12-01.get-campaigns-request/Token] :locations {}))

(clojure.spec.alpha/def :portkey.aws.pinpoint.-2016-12-01.campaign-email-message/body (clojure.spec.alpha/and :portkey.aws.pinpoint.-2016-12-01/--string))
(clojure.spec.alpha/def :portkey.aws.pinpoint.-2016-12-01.campaign-email-message/from-address (clojure.spec.alpha/and :portkey.aws.pinpoint.-2016-12-01/--string))
(clojure.spec.alpha/def :portkey.aws.pinpoint.-2016-12-01.campaign-email-message/html-body (clojure.spec.alpha/and :portkey.aws.pinpoint.-2016-12-01/--string))
(clojure.spec.alpha/def :portkey.aws.pinpoint.-2016-12-01.campaign-email-message/title (clojure.spec.alpha/and :portkey.aws.pinpoint.-2016-12-01/--string))
(clojure.spec.alpha/def :portkey.aws.pinpoint.-2016-12-01/campaign-email-message (portkey.aws/json-keys :req-un [] :opt-un [:portkey.aws.pinpoint.-2016-12-01.campaign-email-message/Body :portkey.aws.pinpoint.-2016-12-01.campaign-email-message/FromAddress :portkey.aws.pinpoint.-2016-12-01.campaign-email-message/HtmlBody :portkey.aws.pinpoint.-2016-12-01.campaign-email-message/Title] :locations {}))

(clojure.spec.alpha/def :portkey.aws.pinpoint.-2016-12-01/list-of-import-job-response (clojure.spec.alpha/and (clojure.spec.alpha/coll-of :portkey.aws.pinpoint.-2016-12-01/import-job-response :max-count nil) (clojure.spec.alpha/conformer clojure.core/identity (fn* [p1__129128__129129__auto__] (if (clojure.core/sequential? p1__129128__129129__auto__) p1__129128__129129__auto__ [p1__129128__129129__auto__])))))

(clojure.spec.alpha/def :portkey.aws.pinpoint.-2016-12-01.message-configuration/apnsmessage (clojure.spec.alpha/and :portkey.aws.pinpoint.-2016-12-01/message))
(clojure.spec.alpha/def :portkey.aws.pinpoint.-2016-12-01.message-configuration/default-message (clojure.spec.alpha/and :portkey.aws.pinpoint.-2016-12-01/message))
(clojure.spec.alpha/def :portkey.aws.pinpoint.-2016-12-01.message-configuration/email-message (clojure.spec.alpha/and :portkey.aws.pinpoint.-2016-12-01/campaign-email-message))
(clojure.spec.alpha/def :portkey.aws.pinpoint.-2016-12-01.message-configuration/gcmmessage (clojure.spec.alpha/and :portkey.aws.pinpoint.-2016-12-01/message))
(clojure.spec.alpha/def :portkey.aws.pinpoint.-2016-12-01.message-configuration/smsmessage (clojure.spec.alpha/and :portkey.aws.pinpoint.-2016-12-01/campaign-sms-message))
(clojure.spec.alpha/def :portkey.aws.pinpoint.-2016-12-01/message-configuration (portkey.aws/json-keys :req-un [] :opt-un [:portkey.aws.pinpoint.-2016-12-01.message-configuration/APNSMessage :portkey.aws.pinpoint.-2016-12-01.message-configuration/DefaultMessage :portkey.aws.pinpoint.-2016-12-01.message-configuration/EmailMessage :portkey.aws.pinpoint.-2016-12-01.message-configuration/GCMMessage :portkey.aws.pinpoint.-2016-12-01.message-configuration/SMSMessage] :locations {}))

(clojure.spec.alpha/def :portkey.aws.pinpoint.-2016-12-01.get-campaign-activities-request/application-id (clojure.spec.alpha/and :portkey.aws.pinpoint.-2016-12-01/--string))
(clojure.spec.alpha/def :portkey.aws.pinpoint.-2016-12-01.get-campaign-activities-request/campaign-id (clojure.spec.alpha/and :portkey.aws.pinpoint.-2016-12-01/--string))
(clojure.spec.alpha/def :portkey.aws.pinpoint.-2016-12-01.get-campaign-activities-request/page-size (clojure.spec.alpha/and :portkey.aws.pinpoint.-2016-12-01/--string))
(clojure.spec.alpha/def :portkey.aws.pinpoint.-2016-12-01.get-campaign-activities-request/token (clojure.spec.alpha/and :portkey.aws.pinpoint.-2016-12-01/--string))
(clojure.spec.alpha/def :portkey.aws.pinpoint.-2016-12-01/get-campaign-activities-request (portkey.aws/json-keys :req-un [:portkey.aws.pinpoint.-2016-12-01.get-campaign-activities-request/ApplicationId :portkey.aws.pinpoint.-2016-12-01.get-campaign-activities-request/CampaignId] :opt-un [:portkey.aws.pinpoint.-2016-12-01.get-campaign-activities-request/PageSize :portkey.aws.pinpoint.-2016-12-01.get-campaign-activities-request/Token] :locations {}))

(clojure.spec.alpha/def :portkey.aws.pinpoint.-2016-12-01.create-import-job-request/application-id (clojure.spec.alpha/and :portkey.aws.pinpoint.-2016-12-01/--string))
(clojure.spec.alpha/def :portkey.aws.pinpoint.-2016-12-01/create-import-job-request (portkey.aws/json-keys :req-un [:portkey.aws.pinpoint.-2016-12-01.create-import-job-request/ApplicationId :portkey.aws.pinpoint.-2016-12-01/ImportJobRequest] :opt-un [] :locations {}))

(clojure.spec.alpha/def :portkey.aws.pinpoint.-2016-12-01/get-segment-import-jobs-response (portkey.aws/json-keys :req-un [:portkey.aws.pinpoint.-2016-12-01/ImportJobsResponse] :opt-un [] :locations {}))

(clojure.spec.alpha/def :portkey.aws.pinpoint.-2016-12-01/message-type (clojure.spec.alpha/conformer (clojure.core/let [m__96543__auto__ {"TRANSACTIONAL" "TRANSACTIONAL", :transactional "TRANSACTIONAL", "PROMOTIONAL" "PROMOTIONAL", :promotional "PROMOTIONAL"}] (clojure.core/fn [s__96544__auto__] (m__96543__auto__ s__96544__auto__ :clojure.spec.alpha/invalid))) (clojure.core/comp clojure.core/keyword portkey.aws/dashed)))

(clojure.spec.alpha/def :portkey.aws.pinpoint.-2016-12-01/update-campaign-response (portkey.aws/json-keys :req-un [:portkey.aws.pinpoint.-2016-12-01/CampaignResponse] :opt-un [] :locations {}))

(clojure.spec.alpha/def :portkey.aws.pinpoint.-2016-12-01/frequency (clojure.spec.alpha/conformer (clojure.core/let [m__96543__auto__ {:daily "DAILY", "ONCE" "ONCE", :monthly "MONTHLY", "MONTHLY" "MONTHLY", "WEEKLY" "WEEKLY", :hourly "HOURLY", :once "ONCE", "DAILY" "DAILY", :weekly "WEEKLY", "HOURLY" "HOURLY"}] (clojure.core/fn [s__96544__auto__] (m__96543__auto__ s__96544__auto__ :clojure.spec.alpha/invalid))) (clojure.core/comp clojure.core/keyword portkey.aws/dashed)))

(clojure.spec.alpha/def :portkey.aws.pinpoint.-2016-12-01.segment-response/last-modified-date (clojure.spec.alpha/and :portkey.aws.pinpoint.-2016-12-01/--string))
(clojure.spec.alpha/def :portkey.aws.pinpoint.-2016-12-01.segment-response/application-id (clojure.spec.alpha/and :portkey.aws.pinpoint.-2016-12-01/--string))
(clojure.spec.alpha/def :portkey.aws.pinpoint.-2016-12-01.segment-response/dimensions (clojure.spec.alpha/and :portkey.aws.pinpoint.-2016-12-01/segment-dimensions))
(clojure.spec.alpha/def :portkey.aws.pinpoint.-2016-12-01.segment-response/import-definition (clojure.spec.alpha/and :portkey.aws.pinpoint.-2016-12-01/segment-import-resource))
(clojure.spec.alpha/def :portkey.aws.pinpoint.-2016-12-01.segment-response/creation-date (clojure.spec.alpha/and :portkey.aws.pinpoint.-2016-12-01/--string))
(clojure.spec.alpha/def :portkey.aws.pinpoint.-2016-12-01.segment-response/version (clojure.spec.alpha/and :portkey.aws.pinpoint.-2016-12-01/--integer))
(clojure.spec.alpha/def :portkey.aws.pinpoint.-2016-12-01.segment-response/name (clojure.spec.alpha/and :portkey.aws.pinpoint.-2016-12-01/--string))
(clojure.spec.alpha/def :portkey.aws.pinpoint.-2016-12-01.segment-response/id (clojure.spec.alpha/and :portkey.aws.pinpoint.-2016-12-01/--string))
(clojure.spec.alpha/def :portkey.aws.pinpoint.-2016-12-01/segment-response (portkey.aws/json-keys :req-un [] :opt-un [:portkey.aws.pinpoint.-2016-12-01/SegmentType :portkey.aws.pinpoint.-2016-12-01.segment-response/LastModifiedDate :portkey.aws.pinpoint.-2016-12-01.segment-response/ApplicationId :portkey.aws.pinpoint.-2016-12-01.segment-response/Dimensions :portkey.aws.pinpoint.-2016-12-01.segment-response/ImportDefinition :portkey.aws.pinpoint.-2016-12-01.segment-response/CreationDate :portkey.aws.pinpoint.-2016-12-01.segment-response/Version :portkey.aws.pinpoint.-2016-12-01.segment-response/Name :portkey.aws.pinpoint.-2016-12-01.segment-response/Id] :locations {}))

(clojure.spec.alpha/def :portkey.aws.pinpoint.-2016-12-01/--double clojure.core/double?)

(clojure.spec.alpha/def :portkey.aws.pinpoint.-2016-12-01/update-endpoints-batch-response (portkey.aws/json-keys :req-un [:portkey.aws.pinpoint.-2016-12-01/MessageBody] :opt-un [] :locations {}))

(clojure.spec.alpha/def :portkey.aws.pinpoint.-2016-12-01/delete-segment-response (portkey.aws/json-keys :req-un [:portkey.aws.pinpoint.-2016-12-01/SegmentResponse] :opt-un [] :locations {}))

(clojure.spec.alpha/def :portkey.aws.pinpoint.-2016-12-01/list-of-campaign-response (clojure.spec.alpha/and (clojure.spec.alpha/coll-of :portkey.aws.pinpoint.-2016-12-01/campaign-response :max-count nil) (clojure.spec.alpha/conformer clojure.core/identity (fn* [p1__129128__129129__auto__] (if (clojure.core/sequential? p1__129128__129129__auto__) p1__129128__129129__auto__ [p1__129128__129129__auto__])))))

(clojure.spec.alpha/def :portkey.aws.pinpoint.-2016-12-01.endpoint-response/address (clojure.spec.alpha/and :portkey.aws.pinpoint.-2016-12-01/--string))
(clojure.spec.alpha/def :portkey.aws.pinpoint.-2016-12-01.endpoint-response/cohort-id (clojure.spec.alpha/and :portkey.aws.pinpoint.-2016-12-01/--string))
(clojure.spec.alpha/def :portkey.aws.pinpoint.-2016-12-01.endpoint-response/endpoint-status (clojure.spec.alpha/and :portkey.aws.pinpoint.-2016-12-01/--string))
(clojure.spec.alpha/def :portkey.aws.pinpoint.-2016-12-01.endpoint-response/request-id (clojure.spec.alpha/and :portkey.aws.pinpoint.-2016-12-01/--string))
(clojure.spec.alpha/def :portkey.aws.pinpoint.-2016-12-01.endpoint-response/shard-id (clojure.spec.alpha/and :portkey.aws.pinpoint.-2016-12-01/--string))
(clojure.spec.alpha/def :portkey.aws.pinpoint.-2016-12-01.endpoint-response/location (clojure.spec.alpha/and :portkey.aws.pinpoint.-2016-12-01/endpoint-location))
(clojure.spec.alpha/def :portkey.aws.pinpoint.-2016-12-01.endpoint-response/demographic (clojure.spec.alpha/and :portkey.aws.pinpoint.-2016-12-01/endpoint-demographic))
(clojure.spec.alpha/def :portkey.aws.pinpoint.-2016-12-01.endpoint-response/user (clojure.spec.alpha/and :portkey.aws.pinpoint.-2016-12-01/endpoint-user))
(clojure.spec.alpha/def :portkey.aws.pinpoint.-2016-12-01.endpoint-response/attributes (clojure.spec.alpha/and :portkey.aws.pinpoint.-2016-12-01/map-of-list-of--string))
(clojure.spec.alpha/def :portkey.aws.pinpoint.-2016-12-01.endpoint-response/application-id (clojure.spec.alpha/and :portkey.aws.pinpoint.-2016-12-01/--string))
(clojure.spec.alpha/def :portkey.aws.pinpoint.-2016-12-01.endpoint-response/creation-date (clojure.spec.alpha/and :portkey.aws.pinpoint.-2016-12-01/--string))
(clojure.spec.alpha/def :portkey.aws.pinpoint.-2016-12-01.endpoint-response/effective-date (clojure.spec.alpha/and :portkey.aws.pinpoint.-2016-12-01/--string))
(clojure.spec.alpha/def :portkey.aws.pinpoint.-2016-12-01.endpoint-response/opt-out (clojure.spec.alpha/and :portkey.aws.pinpoint.-2016-12-01/--string))
(clojure.spec.alpha/def :portkey.aws.pinpoint.-2016-12-01.endpoint-response/id (clojure.spec.alpha/and :portkey.aws.pinpoint.-2016-12-01/--string))
(clojure.spec.alpha/def :portkey.aws.pinpoint.-2016-12-01.endpoint-response/metrics (clojure.spec.alpha/and :portkey.aws.pinpoint.-2016-12-01/map-of--double))
(clojure.spec.alpha/def :portkey.aws.pinpoint.-2016-12-01/endpoint-response (portkey.aws/json-keys :req-un [] :opt-un [:portkey.aws.pinpoint.-2016-12-01.endpoint-response/Address :portkey.aws.pinpoint.-2016-12-01.endpoint-response/CohortId :portkey.aws.pinpoint.-2016-12-01.endpoint-response/EndpointStatus :portkey.aws.pinpoint.-2016-12-01.endpoint-response/RequestId :portkey.aws.pinpoint.-2016-12-01.endpoint-response/ShardId :portkey.aws.pinpoint.-2016-12-01.endpoint-response/Location :portkey.aws.pinpoint.-2016-12-01.endpoint-response/Demographic :portkey.aws.pinpoint.-2016-12-01.endpoint-response/User :portkey.aws.pinpoint.-2016-12-01.endpoint-response/Attributes :portkey.aws.pinpoint.-2016-12-01.endpoint-response/ApplicationId :portkey.aws.pinpoint.-2016-12-01.endpoint-response/CreationDate :portkey.aws.pinpoint.-2016-12-01.endpoint-response/EffectiveDate :portkey.aws.pinpoint.-2016-12-01.endpoint-response/OptOut :portkey.aws.pinpoint.-2016-12-01.endpoint-response/Id :portkey.aws.pinpoint.-2016-12-01/ChannelType :portkey.aws.pinpoint.-2016-12-01.endpoint-response/Metrics] :locations {}))

(clojure.spec.alpha/def :portkey.aws.pinpoint.-2016-12-01/campaign-status (clojure.spec.alpha/conformer (clojure.core/let [m__96543__auto__ {"COMPLETED" "COMPLETED", :paused "PAUSED", :completed "COMPLETED", "EXECUTING" "EXECUTING", "SCHEDULED" "SCHEDULED", :executing "EXECUTING", :pending-next-run "PENDING_NEXT_RUN", :scheduled "SCHEDULED", "PAUSED" "PAUSED", "PENDING_NEXT_RUN" "PENDING_NEXT_RUN"}] (clojure.core/fn [s__96544__auto__] (m__96543__auto__ s__96544__auto__ :clojure.spec.alpha/invalid))) (clojure.core/comp clojure.core/keyword portkey.aws/dashed)))

(clojure.spec.alpha/def :portkey.aws.pinpoint.-2016-12-01.update-segment-request/application-id (clojure.spec.alpha/and :portkey.aws.pinpoint.-2016-12-01/--string))
(clojure.spec.alpha/def :portkey.aws.pinpoint.-2016-12-01.update-segment-request/segment-id (clojure.spec.alpha/and :portkey.aws.pinpoint.-2016-12-01/--string))
(clojure.spec.alpha/def :portkey.aws.pinpoint.-2016-12-01/update-segment-request (portkey.aws/json-keys :req-un [:portkey.aws.pinpoint.-2016-12-01.update-segment-request/SegmentId :portkey.aws.pinpoint.-2016-12-01.update-segment-request/ApplicationId :portkey.aws.pinpoint.-2016-12-01/WriteSegmentRequest] :opt-un [] :locations {}))

(clojure.spec.alpha/def :portkey.aws.pinpoint.-2016-12-01.applications-response/item (clojure.spec.alpha/and :portkey.aws.pinpoint.-2016-12-01/list-of-application-response))
(clojure.spec.alpha/def :portkey.aws.pinpoint.-2016-12-01.applications-response/next-token (clojure.spec.alpha/and :portkey.aws.pinpoint.-2016-12-01/--string))
(clojure.spec.alpha/def :portkey.aws.pinpoint.-2016-12-01/applications-response (portkey.aws/json-keys :req-un [] :opt-un [:portkey.aws.pinpoint.-2016-12-01.applications-response/Item :portkey.aws.pinpoint.-2016-12-01.applications-response/NextToken] :locations {}))

(clojure.spec.alpha/def :portkey.aws.pinpoint.-2016-12-01/create-campaign-response (portkey.aws/json-keys :req-un [:portkey.aws.pinpoint.-2016-12-01/CampaignResponse] :opt-un [] :locations {}))

(clojure.spec.alpha/def :portkey.aws.pinpoint.-2016-12-01.delete-sms-channel-request/application-id (clojure.spec.alpha/and :portkey.aws.pinpoint.-2016-12-01/--string))
(clojure.spec.alpha/def :portkey.aws.pinpoint.-2016-12-01/delete-sms-channel-request (portkey.aws/json-keys :req-un [:portkey.aws.pinpoint.-2016-12-01.delete-sms-channel-request/ApplicationId] :opt-un [] :locations {}))

(clojure.spec.alpha/def :portkey.aws.pinpoint.-2016-12-01/--integer (clojure.spec.alpha/and clojure.core/int?))

(clojure.spec.alpha/def :portkey.aws.pinpoint.-2016-12-01/get-segment-response (portkey.aws/json-keys :req-un [:portkey.aws.pinpoint.-2016-12-01/SegmentResponse] :opt-un [] :locations {}))

(clojure.spec.alpha/def :portkey.aws.pinpoint.-2016-12-01.update-endpoint-request/application-id (clojure.spec.alpha/and :portkey.aws.pinpoint.-2016-12-01/--string))
(clojure.spec.alpha/def :portkey.aws.pinpoint.-2016-12-01.update-endpoint-request/endpoint-id (clojure.spec.alpha/and :portkey.aws.pinpoint.-2016-12-01/--string))
(clojure.spec.alpha/def :portkey.aws.pinpoint.-2016-12-01/update-endpoint-request (portkey.aws/json-keys :req-un [:portkey.aws.pinpoint.-2016-12-01.update-endpoint-request/ApplicationId :portkey.aws.pinpoint.-2016-12-01.update-endpoint-request/EndpointId :portkey.aws.pinpoint.-2016-12-01/EndpointRequest] :opt-un [] :locations {}))

(clojure.spec.alpha/def :portkey.aws.pinpoint.-2016-12-01.schedule/end-time (clojure.spec.alpha/and :portkey.aws.pinpoint.-2016-12-01/--string))
(clojure.spec.alpha/def :portkey.aws.pinpoint.-2016-12-01.schedule/is-local-time (clojure.spec.alpha/and :portkey.aws.pinpoint.-2016-12-01/--boolean))
(clojure.spec.alpha/def :portkey.aws.pinpoint.-2016-12-01.schedule/start-time (clojure.spec.alpha/and :portkey.aws.pinpoint.-2016-12-01/--string))
(clojure.spec.alpha/def :portkey.aws.pinpoint.-2016-12-01.schedule/timezone (clojure.spec.alpha/and :portkey.aws.pinpoint.-2016-12-01/--string))
(clojure.spec.alpha/def :portkey.aws.pinpoint.-2016-12-01/schedule (portkey.aws/json-keys :req-un [] :opt-un [:portkey.aws.pinpoint.-2016-12-01.schedule/EndTime :portkey.aws.pinpoint.-2016-12-01/Frequency :portkey.aws.pinpoint.-2016-12-01.schedule/IsLocalTime :portkey.aws.pinpoint.-2016-12-01/QuietTime :portkey.aws.pinpoint.-2016-12-01.schedule/StartTime :portkey.aws.pinpoint.-2016-12-01.schedule/Timezone] :locations {}))

(clojure.spec.alpha/def :portkey.aws.pinpoint.-2016-12-01.segment-import-resource/channel-counts (clojure.spec.alpha/and :portkey.aws.pinpoint.-2016-12-01/map-of--integer))
(clojure.spec.alpha/def :portkey.aws.pinpoint.-2016-12-01.segment-import-resource/external-id (clojure.spec.alpha/and :portkey.aws.pinpoint.-2016-12-01/--string))
(clojure.spec.alpha/def :portkey.aws.pinpoint.-2016-12-01.segment-import-resource/role-arn (clojure.spec.alpha/and :portkey.aws.pinpoint.-2016-12-01/--string))
(clojure.spec.alpha/def :portkey.aws.pinpoint.-2016-12-01.segment-import-resource/s3-url (clojure.spec.alpha/and :portkey.aws.pinpoint.-2016-12-01/--string))
(clojure.spec.alpha/def :portkey.aws.pinpoint.-2016-12-01.segment-import-resource/size (clojure.spec.alpha/and :portkey.aws.pinpoint.-2016-12-01/--integer))
(clojure.spec.alpha/def :portkey.aws.pinpoint.-2016-12-01/segment-import-resource (portkey.aws/json-keys :req-un [] :opt-un [:portkey.aws.pinpoint.-2016-12-01.segment-import-resource/ChannelCounts :portkey.aws.pinpoint.-2016-12-01.segment-import-resource/ExternalId :portkey.aws.pinpoint.-2016-12-01/Format :portkey.aws.pinpoint.-2016-12-01.segment-import-resource/RoleArn :portkey.aws.pinpoint.-2016-12-01.segment-import-resource/S3Url :portkey.aws.pinpoint.-2016-12-01.segment-import-resource/Size] :locations {}))

(clojure.spec.alpha/def :portkey.aws.pinpoint.-2016-12-01.create-segment-request/application-id (clojure.spec.alpha/and :portkey.aws.pinpoint.-2016-12-01/--string))
(clojure.spec.alpha/def :portkey.aws.pinpoint.-2016-12-01/create-segment-request (portkey.aws/json-keys :req-un [:portkey.aws.pinpoint.-2016-12-01.create-segment-request/ApplicationId :portkey.aws.pinpoint.-2016-12-01/WriteSegmentRequest] :opt-un [] :locations {}))

(clojure.spec.alpha/def :portkey.aws.pinpoint.-2016-12-01.default-push-notification-message/body (clojure.spec.alpha/and :portkey.aws.pinpoint.-2016-12-01/--string))
(clojure.spec.alpha/def :portkey.aws.pinpoint.-2016-12-01.default-push-notification-message/data (clojure.spec.alpha/and :portkey.aws.pinpoint.-2016-12-01/map-of--string))
(clojure.spec.alpha/def :portkey.aws.pinpoint.-2016-12-01.default-push-notification-message/silent-push (clojure.spec.alpha/and :portkey.aws.pinpoint.-2016-12-01/--boolean))
(clojure.spec.alpha/def :portkey.aws.pinpoint.-2016-12-01.default-push-notification-message/substitutions (clojure.spec.alpha/and :portkey.aws.pinpoint.-2016-12-01/map-of-list-of--string))
(clojure.spec.alpha/def :portkey.aws.pinpoint.-2016-12-01.default-push-notification-message/title (clojure.spec.alpha/and :portkey.aws.pinpoint.-2016-12-01/--string))
(clojure.spec.alpha/def :portkey.aws.pinpoint.-2016-12-01.default-push-notification-message/url (clojure.spec.alpha/and :portkey.aws.pinpoint.-2016-12-01/--string))
(clojure.spec.alpha/def :portkey.aws.pinpoint.-2016-12-01/default-push-notification-message (portkey.aws/json-keys :req-un [] :opt-un [:portkey.aws.pinpoint.-2016-12-01/Action :portkey.aws.pinpoint.-2016-12-01.default-push-notification-message/Body :portkey.aws.pinpoint.-2016-12-01.default-push-notification-message/Data :portkey.aws.pinpoint.-2016-12-01.default-push-notification-message/SilentPush :portkey.aws.pinpoint.-2016-12-01.default-push-notification-message/Substitutions :portkey.aws.pinpoint.-2016-12-01.default-push-notification-message/Title :portkey.aws.pinpoint.-2016-12-01.default-push-notification-message/Url] :locations {}))

(clojure.spec.alpha/def :portkey.aws.pinpoint.-2016-12-01.apnsmessage/category (clojure.spec.alpha/and :portkey.aws.pinpoint.-2016-12-01/--string))
(clojure.spec.alpha/def :portkey.aws.pinpoint.-2016-12-01.apnsmessage/body (clojure.spec.alpha/and :portkey.aws.pinpoint.-2016-12-01/--string))
(clojure.spec.alpha/def :portkey.aws.pinpoint.-2016-12-01.apnsmessage/title (clojure.spec.alpha/and :portkey.aws.pinpoint.-2016-12-01/--string))
(clojure.spec.alpha/def :portkey.aws.pinpoint.-2016-12-01.apnsmessage/silent-push (clojure.spec.alpha/and :portkey.aws.pinpoint.-2016-12-01/--boolean))
(clojure.spec.alpha/def :portkey.aws.pinpoint.-2016-12-01.apnsmessage/sound (clojure.spec.alpha/and :portkey.aws.pinpoint.-2016-12-01/--string))
(clojure.spec.alpha/def :portkey.aws.pinpoint.-2016-12-01.apnsmessage/raw-content (clojure.spec.alpha/and :portkey.aws.pinpoint.-2016-12-01/--string))
(clojure.spec.alpha/def :portkey.aws.pinpoint.-2016-12-01.apnsmessage/thread-id (clojure.spec.alpha/and :portkey.aws.pinpoint.-2016-12-01/--string))
(clojure.spec.alpha/def :portkey.aws.pinpoint.-2016-12-01.apnsmessage/url (clojure.spec.alpha/and :portkey.aws.pinpoint.-2016-12-01/--string))
(clojure.spec.alpha/def :portkey.aws.pinpoint.-2016-12-01.apnsmessage/badge (clojure.spec.alpha/and :portkey.aws.pinpoint.-2016-12-01/--integer))
(clojure.spec.alpha/def :portkey.aws.pinpoint.-2016-12-01.apnsmessage/substitutions (clojure.spec.alpha/and :portkey.aws.pinpoint.-2016-12-01/map-of-list-of--string))
(clojure.spec.alpha/def :portkey.aws.pinpoint.-2016-12-01.apnsmessage/data (clojure.spec.alpha/and :portkey.aws.pinpoint.-2016-12-01/map-of--string))
(clojure.spec.alpha/def :portkey.aws.pinpoint.-2016-12-01.apnsmessage/media-url (clojure.spec.alpha/and :portkey.aws.pinpoint.-2016-12-01/--string))
(clojure.spec.alpha/def :portkey.aws.pinpoint.-2016-12-01/apnsmessage (portkey.aws/json-keys :req-un [] :opt-un [:portkey.aws.pinpoint.-2016-12-01.apnsmessage/Category :portkey.aws.pinpoint.-2016-12-01.apnsmessage/Body :portkey.aws.pinpoint.-2016-12-01.apnsmessage/Title :portkey.aws.pinpoint.-2016-12-01.apnsmessage/SilentPush :portkey.aws.pinpoint.-2016-12-01.apnsmessage/Sound :portkey.aws.pinpoint.-2016-12-01.apnsmessage/RawContent :portkey.aws.pinpoint.-2016-12-01.apnsmessage/ThreadId :portkey.aws.pinpoint.-2016-12-01.apnsmessage/Url :portkey.aws.pinpoint.-2016-12-01.apnsmessage/Badge :portkey.aws.pinpoint.-2016-12-01.apnsmessage/Substitutions :portkey.aws.pinpoint.-2016-12-01.apnsmessage/Data :portkey.aws.pinpoint.-2016-12-01.apnsmessage/MediaUrl :portkey.aws.pinpoint.-2016-12-01/Action] :locations {}))

(clojure.spec.alpha/def :portkey.aws.pinpoint.-2016-12-01/map-of--integer (clojure.spec.alpha/map-of :portkey.aws.pinpoint.-2016-12-01/--string :portkey.aws.pinpoint.-2016-12-01/--integer))

(clojure.spec.alpha/def :portkey.aws.pinpoint.-2016-12-01.email-channel-response/platform (clojure.spec.alpha/and :portkey.aws.pinpoint.-2016-12-01/--string))
(clojure.spec.alpha/def :portkey.aws.pinpoint.-2016-12-01.email-channel-response/last-modified-date (clojure.spec.alpha/and :portkey.aws.pinpoint.-2016-12-01/--string))
(clojure.spec.alpha/def :portkey.aws.pinpoint.-2016-12-01.email-channel-response/role-arn (clojure.spec.alpha/and :portkey.aws.pinpoint.-2016-12-01/--string))
(clojure.spec.alpha/def :portkey.aws.pinpoint.-2016-12-01.email-channel-response/enabled (clojure.spec.alpha/and :portkey.aws.pinpoint.-2016-12-01/--boolean))
(clojure.spec.alpha/def :portkey.aws.pinpoint.-2016-12-01.email-channel-response/application-id (clojure.spec.alpha/and :portkey.aws.pinpoint.-2016-12-01/--string))
(clojure.spec.alpha/def :portkey.aws.pinpoint.-2016-12-01.email-channel-response/is-archived (clojure.spec.alpha/and :portkey.aws.pinpoint.-2016-12-01/--boolean))
(clojure.spec.alpha/def :portkey.aws.pinpoint.-2016-12-01.email-channel-response/identity (clojure.spec.alpha/and :portkey.aws.pinpoint.-2016-12-01/--string))
(clojure.spec.alpha/def :portkey.aws.pinpoint.-2016-12-01.email-channel-response/creation-date (clojure.spec.alpha/and :portkey.aws.pinpoint.-2016-12-01/--string))
(clojure.spec.alpha/def :portkey.aws.pinpoint.-2016-12-01.email-channel-response/from-address (clojure.spec.alpha/and :portkey.aws.pinpoint.-2016-12-01/--string))
(clojure.spec.alpha/def :portkey.aws.pinpoint.-2016-12-01.email-channel-response/version (clojure.spec.alpha/and :portkey.aws.pinpoint.-2016-12-01/--integer))
(clojure.spec.alpha/def :portkey.aws.pinpoint.-2016-12-01.email-channel-response/last-modified-by (clojure.spec.alpha/and :portkey.aws.pinpoint.-2016-12-01/--string))
(clojure.spec.alpha/def :portkey.aws.pinpoint.-2016-12-01.email-channel-response/id (clojure.spec.alpha/and :portkey.aws.pinpoint.-2016-12-01/--string))
(clojure.spec.alpha/def :portkey.aws.pinpoint.-2016-12-01/email-channel-response (portkey.aws/json-keys :req-un [] :opt-un [:portkey.aws.pinpoint.-2016-12-01.email-channel-response/Platform :portkey.aws.pinpoint.-2016-12-01.email-channel-response/LastModifiedDate :portkey.aws.pinpoint.-2016-12-01.email-channel-response/RoleArn :portkey.aws.pinpoint.-2016-12-01.email-channel-response/Enabled :portkey.aws.pinpoint.-2016-12-01.email-channel-response/ApplicationId :portkey.aws.pinpoint.-2016-12-01.email-channel-response/IsArchived :portkey.aws.pinpoint.-2016-12-01.email-channel-response/Identity :portkey.aws.pinpoint.-2016-12-01.email-channel-response/CreationDate :portkey.aws.pinpoint.-2016-12-01.email-channel-response/FromAddress :portkey.aws.pinpoint.-2016-12-01.email-channel-response/Version :portkey.aws.pinpoint.-2016-12-01.email-channel-response/LastModifiedBy :portkey.aws.pinpoint.-2016-12-01.email-channel-response/Id] :locations {}))

(clojure.spec.alpha/def :portkey.aws.pinpoint.-2016-12-01/get-import-jobs-response (portkey.aws/json-keys :req-un [:portkey.aws.pinpoint.-2016-12-01/ImportJobsResponse] :opt-un [] :locations {}))

(clojure.spec.alpha/def :portkey.aws.pinpoint.-2016-12-01/direct-message-configuration (portkey.aws/json-keys :req-un [] :opt-un [:portkey.aws.pinpoint.-2016-12-01/APNSMessage :portkey.aws.pinpoint.-2016-12-01/DefaultMessage :portkey.aws.pinpoint.-2016-12-01/DefaultPushNotificationMessage :portkey.aws.pinpoint.-2016-12-01/GCMMessage :portkey.aws.pinpoint.-2016-12-01/SMSMessage] :locations {}))

(clojure.spec.alpha/def :portkey.aws.pinpoint.-2016-12-01/list-of-application-response (clojure.spec.alpha/and (clojure.spec.alpha/coll-of :portkey.aws.pinpoint.-2016-12-01/application-response :max-count nil) (clojure.spec.alpha/conformer clojure.core/identity (fn* [p1__129128__129129__auto__] (if (clojure.core/sequential? p1__129128__129129__auto__) p1__129128__129129__auto__ [p1__129128__129129__auto__])))))

(clojure.spec.alpha/def :portkey.aws.pinpoint.-2016-12-01.apnssandbox-channel-request/certificate (clojure.spec.alpha/and :portkey.aws.pinpoint.-2016-12-01/--string))
(clojure.spec.alpha/def :portkey.aws.pinpoint.-2016-12-01.apnssandbox-channel-request/enabled (clojure.spec.alpha/and :portkey.aws.pinpoint.-2016-12-01/--boolean))
(clojure.spec.alpha/def :portkey.aws.pinpoint.-2016-12-01.apnssandbox-channel-request/private-key (clojure.spec.alpha/and :portkey.aws.pinpoint.-2016-12-01/--string))
(clojure.spec.alpha/def :portkey.aws.pinpoint.-2016-12-01/apnssandbox-channel-request (portkey.aws/json-keys :req-un [] :opt-un [:portkey.aws.pinpoint.-2016-12-01.apnssandbox-channel-request/Certificate :portkey.aws.pinpoint.-2016-12-01.apnssandbox-channel-request/Enabled :portkey.aws.pinpoint.-2016-12-01.apnssandbox-channel-request/PrivateKey] :locations {}))

(clojure.spec.alpha/def :portkey.aws.pinpoint.-2016-12-01/delete-event-stream-response (portkey.aws/json-keys :req-un [:portkey.aws.pinpoint.-2016-12-01/EventStream] :opt-un [] :locations {}))

(clojure.spec.alpha/def :portkey.aws.pinpoint.-2016-12-01.delete-campaign-request/application-id (clojure.spec.alpha/and :portkey.aws.pinpoint.-2016-12-01/--string))
(clojure.spec.alpha/def :portkey.aws.pinpoint.-2016-12-01.delete-campaign-request/campaign-id (clojure.spec.alpha/and :portkey.aws.pinpoint.-2016-12-01/--string))
(clojure.spec.alpha/def :portkey.aws.pinpoint.-2016-12-01/delete-campaign-request (portkey.aws/json-keys :req-un [:portkey.aws.pinpoint.-2016-12-01.delete-campaign-request/CampaignId :portkey.aws.pinpoint.-2016-12-01.delete-campaign-request/ApplicationId] :opt-un [] :locations {}))

(clojure.spec.alpha/def :portkey.aws.pinpoint.-2016-12-01.segment-location/country (clojure.spec.alpha/and :portkey.aws.pinpoint.-2016-12-01/set-dimension))
(clojure.spec.alpha/def :portkey.aws.pinpoint.-2016-12-01/segment-location (portkey.aws/json-keys :req-un [] :opt-un [:portkey.aws.pinpoint.-2016-12-01.segment-location/Country] :locations {}))

(clojure.spec.alpha/def :portkey.aws.pinpoint.-2016-12-01.get-campaign-request/application-id (clojure.spec.alpha/and :portkey.aws.pinpoint.-2016-12-01/--string))
(clojure.spec.alpha/def :portkey.aws.pinpoint.-2016-12-01.get-campaign-request/campaign-id (clojure.spec.alpha/and :portkey.aws.pinpoint.-2016-12-01/--string))
(clojure.spec.alpha/def :portkey.aws.pinpoint.-2016-12-01/get-campaign-request (portkey.aws/json-keys :req-un [:portkey.aws.pinpoint.-2016-12-01.get-campaign-request/CampaignId :portkey.aws.pinpoint.-2016-12-01.get-campaign-request/ApplicationId] :opt-un [] :locations {}))

(clojure.spec.alpha/def :portkey.aws.pinpoint.-2016-12-01.endpoint-location/city (clojure.spec.alpha/and :portkey.aws.pinpoint.-2016-12-01/--string))
(clojure.spec.alpha/def :portkey.aws.pinpoint.-2016-12-01.endpoint-location/country (clojure.spec.alpha/and :portkey.aws.pinpoint.-2016-12-01/--string))
(clojure.spec.alpha/def :portkey.aws.pinpoint.-2016-12-01.endpoint-location/latitude (clojure.spec.alpha/and :portkey.aws.pinpoint.-2016-12-01/--double))
(clojure.spec.alpha/def :portkey.aws.pinpoint.-2016-12-01.endpoint-location/longitude (clojure.spec.alpha/and :portkey.aws.pinpoint.-2016-12-01/--double))
(clojure.spec.alpha/def :portkey.aws.pinpoint.-2016-12-01.endpoint-location/postal-code (clojure.spec.alpha/and :portkey.aws.pinpoint.-2016-12-01/--string))
(clojure.spec.alpha/def :portkey.aws.pinpoint.-2016-12-01.endpoint-location/region (clojure.spec.alpha/and :portkey.aws.pinpoint.-2016-12-01/--string))
(clojure.spec.alpha/def :portkey.aws.pinpoint.-2016-12-01/endpoint-location (portkey.aws/json-keys :req-un [] :opt-un [:portkey.aws.pinpoint.-2016-12-01.endpoint-location/City :portkey.aws.pinpoint.-2016-12-01.endpoint-location/Country :portkey.aws.pinpoint.-2016-12-01.endpoint-location/Latitude :portkey.aws.pinpoint.-2016-12-01.endpoint-location/Longitude :portkey.aws.pinpoint.-2016-12-01.endpoint-location/PostalCode :portkey.aws.pinpoint.-2016-12-01.endpoint-location/Region] :locations {}))

(clojure.spec.alpha/def :portkey.aws.pinpoint.-2016-12-01.get-sms-channel-request/application-id (clojure.spec.alpha/and :portkey.aws.pinpoint.-2016-12-01/--string))
(clojure.spec.alpha/def :portkey.aws.pinpoint.-2016-12-01/get-sms-channel-request (portkey.aws/json-keys :req-un [:portkey.aws.pinpoint.-2016-12-01.get-sms-channel-request/ApplicationId] :opt-un [] :locations {}))

(clojure.spec.alpha/def :portkey.aws.pinpoint.-2016-12-01/update-apns-sandbox-channel-response (portkey.aws/json-keys :req-un [:portkey.aws.pinpoint.-2016-12-01/APNSSandboxChannelResponse] :opt-un [] :locations {}))

(clojure.spec.alpha/def :portkey.aws.pinpoint.-2016-12-01/action (clojure.spec.alpha/conformer (clojure.core/let [m__96543__auto__ {"OPEN_APP" "OPEN_APP", :open-app "OPEN_APP", "DEEP_LINK" "DEEP_LINK", :deep-link "DEEP_LINK", "URL" "URL", :url "URL"}] (clojure.core/fn [s__96544__auto__] (m__96543__auto__ s__96544__auto__ :clojure.spec.alpha/invalid))) (clojure.core/comp clojure.core/keyword portkey.aws/dashed)))

(clojure.spec.alpha/def :portkey.aws.pinpoint.-2016-12-01/list-of-activity-response (clojure.spec.alpha/and (clojure.spec.alpha/coll-of :portkey.aws.pinpoint.-2016-12-01/activity-response :max-count nil) (clojure.spec.alpha/conformer clojure.core/identity (fn* [p1__129128__129129__auto__] (if (clojure.core/sequential? p1__129128__129129__auto__) p1__129128__129129__auto__ [p1__129128__129129__auto__])))))

(clojure.spec.alpha/def :portkey.aws.pinpoint.-2016-12-01/get-sms-channel-response (portkey.aws/json-keys :req-un [:portkey.aws.pinpoint.-2016-12-01/SMSChannelResponse] :opt-un [] :locations {}))

(clojure.spec.alpha/def :portkey.aws.pinpoint.-2016-12-01.gcmchannel-request/api-key (clojure.spec.alpha/and :portkey.aws.pinpoint.-2016-12-01/--string))
(clojure.spec.alpha/def :portkey.aws.pinpoint.-2016-12-01.gcmchannel-request/enabled (clojure.spec.alpha/and :portkey.aws.pinpoint.-2016-12-01/--boolean))
(clojure.spec.alpha/def :portkey.aws.pinpoint.-2016-12-01/gcmchannel-request (portkey.aws/json-keys :req-un [] :opt-un [:portkey.aws.pinpoint.-2016-12-01.gcmchannel-request/ApiKey :portkey.aws.pinpoint.-2016-12-01.gcmchannel-request/Enabled] :locations {}))

(clojure.spec.alpha/def :portkey.aws.pinpoint.-2016-12-01/get-apns-sandbox-channel-response (portkey.aws/json-keys :req-un [:portkey.aws.pinpoint.-2016-12-01/APNSSandboxChannelResponse] :opt-un [] :locations {}))

(clojure.spec.alpha/def :portkey.aws.pinpoint.-2016-12-01.message-result/status-code (clojure.spec.alpha/and :portkey.aws.pinpoint.-2016-12-01/--integer))
(clojure.spec.alpha/def :portkey.aws.pinpoint.-2016-12-01.message-result/status-message (clojure.spec.alpha/and :portkey.aws.pinpoint.-2016-12-01/--string))
(clojure.spec.alpha/def :portkey.aws.pinpoint.-2016-12-01.message-result/updated-token (clojure.spec.alpha/and :portkey.aws.pinpoint.-2016-12-01/--string))
(clojure.spec.alpha/def :portkey.aws.pinpoint.-2016-12-01/message-result (portkey.aws/json-keys :req-un [] :opt-un [:portkey.aws.pinpoint.-2016-12-01/DeliveryStatus :portkey.aws.pinpoint.-2016-12-01.message-result/StatusCode :portkey.aws.pinpoint.-2016-12-01.message-result/StatusMessage :portkey.aws.pinpoint.-2016-12-01.message-result/UpdatedToken] :locations {}))

(clojure.spec.alpha/def :portkey.aws.pinpoint.-2016-12-01.apnschannel-response/platform (clojure.spec.alpha/and :portkey.aws.pinpoint.-2016-12-01/--string))
(clojure.spec.alpha/def :portkey.aws.pinpoint.-2016-12-01.apnschannel-response/last-modified-date (clojure.spec.alpha/and :portkey.aws.pinpoint.-2016-12-01/--string))
(clojure.spec.alpha/def :portkey.aws.pinpoint.-2016-12-01.apnschannel-response/enabled (clojure.spec.alpha/and :portkey.aws.pinpoint.-2016-12-01/--boolean))
(clojure.spec.alpha/def :portkey.aws.pinpoint.-2016-12-01.apnschannel-response/application-id (clojure.spec.alpha/and :portkey.aws.pinpoint.-2016-12-01/--string))
(clojure.spec.alpha/def :portkey.aws.pinpoint.-2016-12-01.apnschannel-response/is-archived (clojure.spec.alpha/and :portkey.aws.pinpoint.-2016-12-01/--boolean))
(clojure.spec.alpha/def :portkey.aws.pinpoint.-2016-12-01.apnschannel-response/creation-date (clojure.spec.alpha/and :portkey.aws.pinpoint.-2016-12-01/--string))
(clojure.spec.alpha/def :portkey.aws.pinpoint.-2016-12-01.apnschannel-response/version (clojure.spec.alpha/and :portkey.aws.pinpoint.-2016-12-01/--integer))
(clojure.spec.alpha/def :portkey.aws.pinpoint.-2016-12-01.apnschannel-response/last-modified-by (clojure.spec.alpha/and :portkey.aws.pinpoint.-2016-12-01/--string))
(clojure.spec.alpha/def :portkey.aws.pinpoint.-2016-12-01.apnschannel-response/id (clojure.spec.alpha/and :portkey.aws.pinpoint.-2016-12-01/--string))
(clojure.spec.alpha/def :portkey.aws.pinpoint.-2016-12-01/apnschannel-response (portkey.aws/json-keys :req-un [] :opt-un [:portkey.aws.pinpoint.-2016-12-01.apnschannel-response/Platform :portkey.aws.pinpoint.-2016-12-01.apnschannel-response/LastModifiedDate :portkey.aws.pinpoint.-2016-12-01.apnschannel-response/Enabled :portkey.aws.pinpoint.-2016-12-01.apnschannel-response/ApplicationId :portkey.aws.pinpoint.-2016-12-01.apnschannel-response/IsArchived :portkey.aws.pinpoint.-2016-12-01.apnschannel-response/CreationDate :portkey.aws.pinpoint.-2016-12-01.apnschannel-response/Version :portkey.aws.pinpoint.-2016-12-01.apnschannel-response/LastModifiedBy :portkey.aws.pinpoint.-2016-12-01.apnschannel-response/Id] :locations {}))

(clojure.spec.alpha/def :portkey.aws.pinpoint.-2016-12-01/map-of--string (clojure.spec.alpha/map-of :portkey.aws.pinpoint.-2016-12-01/--string :portkey.aws.pinpoint.-2016-12-01/--string))

(clojure.spec.alpha/def :portkey.aws.pinpoint.-2016-12-01.segments-response/item (clojure.spec.alpha/and :portkey.aws.pinpoint.-2016-12-01/list-of-segment-response))
(clojure.spec.alpha/def :portkey.aws.pinpoint.-2016-12-01.segments-response/next-token (clojure.spec.alpha/and :portkey.aws.pinpoint.-2016-12-01/--string))
(clojure.spec.alpha/def :portkey.aws.pinpoint.-2016-12-01/segments-response (portkey.aws/json-keys :req-un [] :opt-un [:portkey.aws.pinpoint.-2016-12-01.segments-response/Item :portkey.aws.pinpoint.-2016-12-01.segments-response/NextToken] :locations {}))

(clojure.spec.alpha/def :portkey.aws.pinpoint.-2016-12-01.delete-event-stream-request/application-id (clojure.spec.alpha/and :portkey.aws.pinpoint.-2016-12-01/--string))
(clojure.spec.alpha/def :portkey.aws.pinpoint.-2016-12-01/delete-event-stream-request (portkey.aws/json-keys :req-un [:portkey.aws.pinpoint.-2016-12-01.delete-event-stream-request/ApplicationId] :opt-un [] :locations {}))

(clojure.spec.alpha/def :portkey.aws.pinpoint.-2016-12-01/get-email-channel-response (portkey.aws/json-keys :req-un [:portkey.aws.pinpoint.-2016-12-01/EmailChannelResponse] :opt-un [] :locations {}))

(clojure.spec.alpha/def :portkey.aws.pinpoint.-2016-12-01/channel-type (clojure.spec.alpha/conformer (clojure.core/let [m__96543__auto__ {:email "EMAIL", "SMS" "SMS", "ADM" "ADM", "GCM" "GCM", "APNS" "APNS", :apns-sandbox "APNS_SANDBOX", :gcm "GCM", :sms "SMS", :adm "ADM", "APNS_SANDBOX" "APNS_SANDBOX", "EMAIL" "EMAIL", :apns "APNS"}] (clojure.core/fn [s__96544__auto__] (m__96543__auto__ s__96544__auto__ :clojure.spec.alpha/invalid))) (clojure.core/comp clojure.core/keyword portkey.aws/dashed)))

(clojure.spec.alpha/def :portkey.aws.pinpoint.-2016-12-01.get-import-jobs-request/application-id (clojure.spec.alpha/and :portkey.aws.pinpoint.-2016-12-01/--string))
(clojure.spec.alpha/def :portkey.aws.pinpoint.-2016-12-01.get-import-jobs-request/page-size (clojure.spec.alpha/and :portkey.aws.pinpoint.-2016-12-01/--string))
(clojure.spec.alpha/def :portkey.aws.pinpoint.-2016-12-01.get-import-jobs-request/token (clojure.spec.alpha/and :portkey.aws.pinpoint.-2016-12-01/--string))
(clojure.spec.alpha/def :portkey.aws.pinpoint.-2016-12-01/get-import-jobs-request (portkey.aws/json-keys :req-un [:portkey.aws.pinpoint.-2016-12-01.get-import-jobs-request/ApplicationId] :opt-un [:portkey.aws.pinpoint.-2016-12-01.get-import-jobs-request/PageSize :portkey.aws.pinpoint.-2016-12-01.get-import-jobs-request/Token] :locations {}))

(clojure.spec.alpha/def :portkey.aws.pinpoint.-2016-12-01.update-campaign-request/application-id (clojure.spec.alpha/and :portkey.aws.pinpoint.-2016-12-01/--string))
(clojure.spec.alpha/def :portkey.aws.pinpoint.-2016-12-01.update-campaign-request/campaign-id (clojure.spec.alpha/and :portkey.aws.pinpoint.-2016-12-01/--string))
(clojure.spec.alpha/def :portkey.aws.pinpoint.-2016-12-01/update-campaign-request (portkey.aws/json-keys :req-un [:portkey.aws.pinpoint.-2016-12-01.update-campaign-request/CampaignId :portkey.aws.pinpoint.-2016-12-01.update-campaign-request/ApplicationId :portkey.aws.pinpoint.-2016-12-01/WriteCampaignRequest] :opt-un [] :locations {}))

(clojure.spec.alpha/def :portkey.aws.pinpoint.-2016-12-01.segment-demographics/app-version (clojure.spec.alpha/and :portkey.aws.pinpoint.-2016-12-01/set-dimension))
(clojure.spec.alpha/def :portkey.aws.pinpoint.-2016-12-01.segment-demographics/channel (clojure.spec.alpha/and :portkey.aws.pinpoint.-2016-12-01/set-dimension))
(clojure.spec.alpha/def :portkey.aws.pinpoint.-2016-12-01.segment-demographics/device-type (clojure.spec.alpha/and :portkey.aws.pinpoint.-2016-12-01/set-dimension))
(clojure.spec.alpha/def :portkey.aws.pinpoint.-2016-12-01.segment-demographics/make (clojure.spec.alpha/and :portkey.aws.pinpoint.-2016-12-01/set-dimension))
(clojure.spec.alpha/def :portkey.aws.pinpoint.-2016-12-01.segment-demographics/model (clojure.spec.alpha/and :portkey.aws.pinpoint.-2016-12-01/set-dimension))
(clojure.spec.alpha/def :portkey.aws.pinpoint.-2016-12-01.segment-demographics/platform (clojure.spec.alpha/and :portkey.aws.pinpoint.-2016-12-01/set-dimension))
(clojure.spec.alpha/def :portkey.aws.pinpoint.-2016-12-01/segment-demographics (portkey.aws/json-keys :req-un [] :opt-un [:portkey.aws.pinpoint.-2016-12-01.segment-demographics/AppVersion :portkey.aws.pinpoint.-2016-12-01.segment-demographics/Channel :portkey.aws.pinpoint.-2016-12-01.segment-demographics/DeviceType :portkey.aws.pinpoint.-2016-12-01.segment-demographics/Make :portkey.aws.pinpoint.-2016-12-01.segment-demographics/Model :portkey.aws.pinpoint.-2016-12-01.segment-demographics/Platform] :locations {}))

(clojure.spec.alpha/def :portkey.aws.pinpoint.-2016-12-01/update-email-channel-response (portkey.aws/json-keys :req-un [:portkey.aws.pinpoint.-2016-12-01/EmailChannelResponse] :opt-un [] :locations {}))

(clojure.core/defn update-apns-channel ([update-apns-channel-request] (portkey.aws/-rest-json-call portkey.aws.pinpoint.-2016-12-01/endpoints "PUT" "/v1/apps/{application-id}/channels/apns" update-apns-channel-request :portkey.aws.pinpoint.-2016-12-01/update-apns-channel-request {:payload "APNSChannelRequest", :move {}, :headers {}, :uri {"application-id" "ApplicationId"}, :querystring {}} 200 :portkey.aws.pinpoint.-2016-12-01/update-apns-channel-response {"BadRequestException" :portkey.aws.pinpoint.-2016-12-01/bad-request-exception, "InternalServerErrorException" :portkey.aws.pinpoint.-2016-12-01/internal-server-error-exception, "ForbiddenException" :portkey.aws.pinpoint.-2016-12-01/forbidden-exception, "NotFoundException" :portkey.aws.pinpoint.-2016-12-01/not-found-exception, "MethodNotAllowedException" :portkey.aws.pinpoint.-2016-12-01/method-not-allowed-exception, "TooManyRequestsException" :portkey.aws.pinpoint.-2016-12-01/too-many-requests-exception})))
(clojure.spec.alpha/fdef update-apns-channel :args (clojure.spec.alpha/tuple :portkey.aws.pinpoint.-2016-12-01/update-apns-channel-request) :ret (clojure.spec.alpha/and :portkey.aws.pinpoint.-2016-12-01/update-apns-channel-response))

(clojure.core/defn get-apns-channel ([get-apns-channel-request] (portkey.aws/-rest-json-call portkey.aws.pinpoint.-2016-12-01/endpoints "GET" "/v1/apps/{application-id}/channels/apns" get-apns-channel-request :portkey.aws.pinpoint.-2016-12-01/get-apns-channel-request {:payload nil, :move {}, :headers {}, :uri {"application-id" "ApplicationId"}, :querystring {}} 200 :portkey.aws.pinpoint.-2016-12-01/get-apns-channel-response {"BadRequestException" :portkey.aws.pinpoint.-2016-12-01/bad-request-exception, "InternalServerErrorException" :portkey.aws.pinpoint.-2016-12-01/internal-server-error-exception, "ForbiddenException" :portkey.aws.pinpoint.-2016-12-01/forbidden-exception, "NotFoundException" :portkey.aws.pinpoint.-2016-12-01/not-found-exception, "MethodNotAllowedException" :portkey.aws.pinpoint.-2016-12-01/method-not-allowed-exception, "TooManyRequestsException" :portkey.aws.pinpoint.-2016-12-01/too-many-requests-exception})))
(clojure.spec.alpha/fdef get-apns-channel :args (clojure.spec.alpha/tuple :portkey.aws.pinpoint.-2016-12-01/get-apns-channel-request) :ret (clojure.spec.alpha/and :portkey.aws.pinpoint.-2016-12-01/get-apns-channel-response))

(clojure.core/defn update-endpoints-batch ([update-endpoints-batch-request] (portkey.aws/-rest-json-call portkey.aws.pinpoint.-2016-12-01/endpoints "PUT" "/v1/apps/{application-id}/endpoints" update-endpoints-batch-request :portkey.aws.pinpoint.-2016-12-01/update-endpoints-batch-request {:payload "EndpointBatchRequest", :move {}, :headers {}, :uri {"application-id" "ApplicationId"}, :querystring {}} 202 :portkey.aws.pinpoint.-2016-12-01/update-endpoints-batch-response {"BadRequestException" :portkey.aws.pinpoint.-2016-12-01/bad-request-exception, "InternalServerErrorException" :portkey.aws.pinpoint.-2016-12-01/internal-server-error-exception, "ForbiddenException" :portkey.aws.pinpoint.-2016-12-01/forbidden-exception, "NotFoundException" :portkey.aws.pinpoint.-2016-12-01/not-found-exception, "MethodNotAllowedException" :portkey.aws.pinpoint.-2016-12-01/method-not-allowed-exception, "TooManyRequestsException" :portkey.aws.pinpoint.-2016-12-01/too-many-requests-exception})))
(clojure.spec.alpha/fdef update-endpoints-batch :args (clojure.spec.alpha/tuple :portkey.aws.pinpoint.-2016-12-01/update-endpoints-batch-request) :ret (clojure.spec.alpha/and :portkey.aws.pinpoint.-2016-12-01/update-endpoints-batch-response))

(clojure.core/defn get-import-jobs ([get-import-jobs-request] (portkey.aws/-rest-json-call portkey.aws.pinpoint.-2016-12-01/endpoints "GET" "/v1/apps/{application-id}/jobs/import" get-import-jobs-request :portkey.aws.pinpoint.-2016-12-01/get-import-jobs-request {:payload nil, :move {}, :headers {}, :uri {"application-id" "ApplicationId"}, :querystring {"page-size" "PageSize", "token" "Token"}} 200 :portkey.aws.pinpoint.-2016-12-01/get-import-jobs-response {"BadRequestException" :portkey.aws.pinpoint.-2016-12-01/bad-request-exception, "InternalServerErrorException" :portkey.aws.pinpoint.-2016-12-01/internal-server-error-exception, "ForbiddenException" :portkey.aws.pinpoint.-2016-12-01/forbidden-exception, "NotFoundException" :portkey.aws.pinpoint.-2016-12-01/not-found-exception, "MethodNotAllowedException" :portkey.aws.pinpoint.-2016-12-01/method-not-allowed-exception, "TooManyRequestsException" :portkey.aws.pinpoint.-2016-12-01/too-many-requests-exception})))
(clojure.spec.alpha/fdef get-import-jobs :args (clojure.spec.alpha/tuple :portkey.aws.pinpoint.-2016-12-01/get-import-jobs-request) :ret (clojure.spec.alpha/and :portkey.aws.pinpoint.-2016-12-01/get-import-jobs-response))

(clojure.core/defn get-sms-channel ([get-sms-channel-request] (portkey.aws/-rest-json-call portkey.aws.pinpoint.-2016-12-01/endpoints "GET" "/v1/apps/{application-id}/channels/sms" get-sms-channel-request :portkey.aws.pinpoint.-2016-12-01/get-sms-channel-request {:payload nil, :move {}, :headers {}, :uri {"application-id" "ApplicationId"}, :querystring {}} 200 :portkey.aws.pinpoint.-2016-12-01/get-sms-channel-response {"BadRequestException" :portkey.aws.pinpoint.-2016-12-01/bad-request-exception, "InternalServerErrorException" :portkey.aws.pinpoint.-2016-12-01/internal-server-error-exception, "ForbiddenException" :portkey.aws.pinpoint.-2016-12-01/forbidden-exception, "NotFoundException" :portkey.aws.pinpoint.-2016-12-01/not-found-exception, "MethodNotAllowedException" :portkey.aws.pinpoint.-2016-12-01/method-not-allowed-exception, "TooManyRequestsException" :portkey.aws.pinpoint.-2016-12-01/too-many-requests-exception})))
(clojure.spec.alpha/fdef get-sms-channel :args (clojure.spec.alpha/tuple :portkey.aws.pinpoint.-2016-12-01/get-sms-channel-request) :ret (clojure.spec.alpha/and :portkey.aws.pinpoint.-2016-12-01/get-sms-channel-response))

(clojure.core/defn get-segment-version ([get-segment-version-request] (portkey.aws/-rest-json-call portkey.aws.pinpoint.-2016-12-01/endpoints "GET" "/v1/apps/{application-id}/segments/{segment-id}/versions/{version}" get-segment-version-request :portkey.aws.pinpoint.-2016-12-01/get-segment-version-request {:payload nil, :move {}, :headers {}, :uri {"application-id" "ApplicationId", "segment-id" "SegmentId", "version" "Version"}, :querystring {}} 200 :portkey.aws.pinpoint.-2016-12-01/get-segment-version-response {"BadRequestException" :portkey.aws.pinpoint.-2016-12-01/bad-request-exception, "InternalServerErrorException" :portkey.aws.pinpoint.-2016-12-01/internal-server-error-exception, "ForbiddenException" :portkey.aws.pinpoint.-2016-12-01/forbidden-exception, "NotFoundException" :portkey.aws.pinpoint.-2016-12-01/not-found-exception, "MethodNotAllowedException" :portkey.aws.pinpoint.-2016-12-01/method-not-allowed-exception, "TooManyRequestsException" :portkey.aws.pinpoint.-2016-12-01/too-many-requests-exception})))
(clojure.spec.alpha/fdef get-segment-version :args (clojure.spec.alpha/tuple :portkey.aws.pinpoint.-2016-12-01/get-segment-version-request) :ret (clojure.spec.alpha/and :portkey.aws.pinpoint.-2016-12-01/get-segment-version-response))

(clojure.core/defn get-apns-sandbox-channel ([get-apns-sandbox-channel-request] (portkey.aws/-rest-json-call portkey.aws.pinpoint.-2016-12-01/endpoints "GET" "/v1/apps/{application-id}/channels/apns_sandbox" get-apns-sandbox-channel-request :portkey.aws.pinpoint.-2016-12-01/get-apns-sandbox-channel-request {:payload nil, :move {}, :headers {}, :uri {"application-id" "ApplicationId"}, :querystring {}} 200 :portkey.aws.pinpoint.-2016-12-01/get-apns-sandbox-channel-response {"BadRequestException" :portkey.aws.pinpoint.-2016-12-01/bad-request-exception, "InternalServerErrorException" :portkey.aws.pinpoint.-2016-12-01/internal-server-error-exception, "ForbiddenException" :portkey.aws.pinpoint.-2016-12-01/forbidden-exception, "NotFoundException" :portkey.aws.pinpoint.-2016-12-01/not-found-exception, "MethodNotAllowedException" :portkey.aws.pinpoint.-2016-12-01/method-not-allowed-exception, "TooManyRequestsException" :portkey.aws.pinpoint.-2016-12-01/too-many-requests-exception})))
(clojure.spec.alpha/fdef get-apns-sandbox-channel :args (clojure.spec.alpha/tuple :portkey.aws.pinpoint.-2016-12-01/get-apns-sandbox-channel-request) :ret (clojure.spec.alpha/and :portkey.aws.pinpoint.-2016-12-01/get-apns-sandbox-channel-response))

(clojure.core/defn get-segment-import-jobs ([get-segment-import-jobs-request] (portkey.aws/-rest-json-call portkey.aws.pinpoint.-2016-12-01/endpoints "GET" "/v1/apps/{application-id}/segments/{segment-id}/jobs/import" get-segment-import-jobs-request :portkey.aws.pinpoint.-2016-12-01/get-segment-import-jobs-request {:payload nil, :move {}, :headers {}, :uri {"application-id" "ApplicationId", "segment-id" "SegmentId"}, :querystring {"page-size" "PageSize", "token" "Token"}} 200 :portkey.aws.pinpoint.-2016-12-01/get-segment-import-jobs-response {"BadRequestException" :portkey.aws.pinpoint.-2016-12-01/bad-request-exception, "InternalServerErrorException" :portkey.aws.pinpoint.-2016-12-01/internal-server-error-exception, "ForbiddenException" :portkey.aws.pinpoint.-2016-12-01/forbidden-exception, "NotFoundException" :portkey.aws.pinpoint.-2016-12-01/not-found-exception, "MethodNotAllowedException" :portkey.aws.pinpoint.-2016-12-01/method-not-allowed-exception, "TooManyRequestsException" :portkey.aws.pinpoint.-2016-12-01/too-many-requests-exception})))
(clojure.spec.alpha/fdef get-segment-import-jobs :args (clojure.spec.alpha/tuple :portkey.aws.pinpoint.-2016-12-01/get-segment-import-jobs-request) :ret (clojure.spec.alpha/and :portkey.aws.pinpoint.-2016-12-01/get-segment-import-jobs-response))

(clojure.core/defn get-campaign-activities ([get-campaign-activities-request] (portkey.aws/-rest-json-call portkey.aws.pinpoint.-2016-12-01/endpoints "GET" "/v1/apps/{application-id}/campaigns/{campaign-id}/activities" get-campaign-activities-request :portkey.aws.pinpoint.-2016-12-01/get-campaign-activities-request {:payload nil, :move {}, :headers {}, :uri {"application-id" "ApplicationId", "campaign-id" "CampaignId"}, :querystring {"page-size" "PageSize", "token" "Token"}} 200 :portkey.aws.pinpoint.-2016-12-01/get-campaign-activities-response {"BadRequestException" :portkey.aws.pinpoint.-2016-12-01/bad-request-exception, "InternalServerErrorException" :portkey.aws.pinpoint.-2016-12-01/internal-server-error-exception, "ForbiddenException" :portkey.aws.pinpoint.-2016-12-01/forbidden-exception, "NotFoundException" :portkey.aws.pinpoint.-2016-12-01/not-found-exception, "MethodNotAllowedException" :portkey.aws.pinpoint.-2016-12-01/method-not-allowed-exception, "TooManyRequestsException" :portkey.aws.pinpoint.-2016-12-01/too-many-requests-exception})))
(clojure.spec.alpha/fdef get-campaign-activities :args (clojure.spec.alpha/tuple :portkey.aws.pinpoint.-2016-12-01/get-campaign-activities-request) :ret (clojure.spec.alpha/and :portkey.aws.pinpoint.-2016-12-01/get-campaign-activities-response))

(clojure.core/defn delete-email-channel ([delete-email-channel-request] (portkey.aws/-rest-json-call portkey.aws.pinpoint.-2016-12-01/endpoints "DELETE" "/v1/apps/{application-id}/channels/email" delete-email-channel-request :portkey.aws.pinpoint.-2016-12-01/delete-email-channel-request {:payload nil, :move {}, :headers {}, :uri {"application-id" "ApplicationId"}, :querystring {}} 200 :portkey.aws.pinpoint.-2016-12-01/delete-email-channel-response {"BadRequestException" :portkey.aws.pinpoint.-2016-12-01/bad-request-exception, "InternalServerErrorException" :portkey.aws.pinpoint.-2016-12-01/internal-server-error-exception, "ForbiddenException" :portkey.aws.pinpoint.-2016-12-01/forbidden-exception, "NotFoundException" :portkey.aws.pinpoint.-2016-12-01/not-found-exception, "MethodNotAllowedException" :portkey.aws.pinpoint.-2016-12-01/method-not-allowed-exception, "TooManyRequestsException" :portkey.aws.pinpoint.-2016-12-01/too-many-requests-exception})))
(clojure.spec.alpha/fdef delete-email-channel :args (clojure.spec.alpha/tuple :portkey.aws.pinpoint.-2016-12-01/delete-email-channel-request) :ret (clojure.spec.alpha/and :portkey.aws.pinpoint.-2016-12-01/delete-email-channel-response))

(clojure.core/defn get-segment ([get-segment-request] (portkey.aws/-rest-json-call portkey.aws.pinpoint.-2016-12-01/endpoints "GET" "/v1/apps/{application-id}/segments/{segment-id}" get-segment-request :portkey.aws.pinpoint.-2016-12-01/get-segment-request {:payload nil, :move {}, :headers {}, :uri {"application-id" "ApplicationId", "segment-id" "SegmentId"}, :querystring {}} 200 :portkey.aws.pinpoint.-2016-12-01/get-segment-response {"BadRequestException" :portkey.aws.pinpoint.-2016-12-01/bad-request-exception, "InternalServerErrorException" :portkey.aws.pinpoint.-2016-12-01/internal-server-error-exception, "ForbiddenException" :portkey.aws.pinpoint.-2016-12-01/forbidden-exception, "NotFoundException" :portkey.aws.pinpoint.-2016-12-01/not-found-exception, "MethodNotAllowedException" :portkey.aws.pinpoint.-2016-12-01/method-not-allowed-exception, "TooManyRequestsException" :portkey.aws.pinpoint.-2016-12-01/too-many-requests-exception})))
(clojure.spec.alpha/fdef get-segment :args (clojure.spec.alpha/tuple :portkey.aws.pinpoint.-2016-12-01/get-segment-request) :ret (clojure.spec.alpha/and :portkey.aws.pinpoint.-2016-12-01/get-segment-response))

(clojure.core/defn get-event-stream ([get-event-stream-request] (portkey.aws/-rest-json-call portkey.aws.pinpoint.-2016-12-01/endpoints "GET" "/v1/apps/{application-id}/eventstream" get-event-stream-request :portkey.aws.pinpoint.-2016-12-01/get-event-stream-request {:payload nil, :move {}, :headers {}, :uri {"application-id" "ApplicationId"}, :querystring {}} 200 :portkey.aws.pinpoint.-2016-12-01/get-event-stream-response {"BadRequestException" :portkey.aws.pinpoint.-2016-12-01/bad-request-exception, "InternalServerErrorException" :portkey.aws.pinpoint.-2016-12-01/internal-server-error-exception, "ForbiddenException" :portkey.aws.pinpoint.-2016-12-01/forbidden-exception, "NotFoundException" :portkey.aws.pinpoint.-2016-12-01/not-found-exception, "MethodNotAllowedException" :portkey.aws.pinpoint.-2016-12-01/method-not-allowed-exception, "TooManyRequestsException" :portkey.aws.pinpoint.-2016-12-01/too-many-requests-exception})))
(clojure.spec.alpha/fdef get-event-stream :args (clojure.spec.alpha/tuple :portkey.aws.pinpoint.-2016-12-01/get-event-stream-request) :ret (clojure.spec.alpha/and :portkey.aws.pinpoint.-2016-12-01/get-event-stream-response))

(clojure.core/defn get-campaign-version ([get-campaign-version-request] (portkey.aws/-rest-json-call portkey.aws.pinpoint.-2016-12-01/endpoints "GET" "/v1/apps/{application-id}/campaigns/{campaign-id}/versions/{version}" get-campaign-version-request :portkey.aws.pinpoint.-2016-12-01/get-campaign-version-request {:payload nil, :move {}, :headers {}, :uri {"application-id" "ApplicationId", "campaign-id" "CampaignId", "version" "Version"}, :querystring {}} 200 :portkey.aws.pinpoint.-2016-12-01/get-campaign-version-response {"BadRequestException" :portkey.aws.pinpoint.-2016-12-01/bad-request-exception, "InternalServerErrorException" :portkey.aws.pinpoint.-2016-12-01/internal-server-error-exception, "ForbiddenException" :portkey.aws.pinpoint.-2016-12-01/forbidden-exception, "NotFoundException" :portkey.aws.pinpoint.-2016-12-01/not-found-exception, "MethodNotAllowedException" :portkey.aws.pinpoint.-2016-12-01/method-not-allowed-exception, "TooManyRequestsException" :portkey.aws.pinpoint.-2016-12-01/too-many-requests-exception})))
(clojure.spec.alpha/fdef get-campaign-version :args (clojure.spec.alpha/tuple :portkey.aws.pinpoint.-2016-12-01/get-campaign-version-request) :ret (clojure.spec.alpha/and :portkey.aws.pinpoint.-2016-12-01/get-campaign-version-response))

(clojure.core/defn get-campaign-versions ([get-campaign-versions-request] (portkey.aws/-rest-json-call portkey.aws.pinpoint.-2016-12-01/endpoints "GET" "/v1/apps/{application-id}/campaigns/{campaign-id}/versions" get-campaign-versions-request :portkey.aws.pinpoint.-2016-12-01/get-campaign-versions-request {:payload nil, :move {}, :headers {}, :uri {"application-id" "ApplicationId", "campaign-id" "CampaignId"}, :querystring {"page-size" "PageSize", "token" "Token"}} 200 :portkey.aws.pinpoint.-2016-12-01/get-campaign-versions-response {"BadRequestException" :portkey.aws.pinpoint.-2016-12-01/bad-request-exception, "InternalServerErrorException" :portkey.aws.pinpoint.-2016-12-01/internal-server-error-exception, "ForbiddenException" :portkey.aws.pinpoint.-2016-12-01/forbidden-exception, "NotFoundException" :portkey.aws.pinpoint.-2016-12-01/not-found-exception, "MethodNotAllowedException" :portkey.aws.pinpoint.-2016-12-01/method-not-allowed-exception, "TooManyRequestsException" :portkey.aws.pinpoint.-2016-12-01/too-many-requests-exception})))
(clojure.spec.alpha/fdef get-campaign-versions :args (clojure.spec.alpha/tuple :portkey.aws.pinpoint.-2016-12-01/get-campaign-versions-request) :ret (clojure.spec.alpha/and :portkey.aws.pinpoint.-2016-12-01/get-campaign-versions-response))

(clojure.core/defn get-gcm-channel ([get-gcm-channel-request] (portkey.aws/-rest-json-call portkey.aws.pinpoint.-2016-12-01/endpoints "GET" "/v1/apps/{application-id}/channels/gcm" get-gcm-channel-request :portkey.aws.pinpoint.-2016-12-01/get-gcm-channel-request {:payload nil, :move {}, :headers {}, :uri {"application-id" "ApplicationId"}, :querystring {}} 200 :portkey.aws.pinpoint.-2016-12-01/get-gcm-channel-response {"BadRequestException" :portkey.aws.pinpoint.-2016-12-01/bad-request-exception, "InternalServerErrorException" :portkey.aws.pinpoint.-2016-12-01/internal-server-error-exception, "ForbiddenException" :portkey.aws.pinpoint.-2016-12-01/forbidden-exception, "NotFoundException" :portkey.aws.pinpoint.-2016-12-01/not-found-exception, "MethodNotAllowedException" :portkey.aws.pinpoint.-2016-12-01/method-not-allowed-exception, "TooManyRequestsException" :portkey.aws.pinpoint.-2016-12-01/too-many-requests-exception})))
(clojure.spec.alpha/fdef get-gcm-channel :args (clojure.spec.alpha/tuple :portkey.aws.pinpoint.-2016-12-01/get-gcm-channel-request) :ret (clojure.spec.alpha/and :portkey.aws.pinpoint.-2016-12-01/get-gcm-channel-response))

(clojure.core/defn update-campaign ([update-campaign-request] (portkey.aws/-rest-json-call portkey.aws.pinpoint.-2016-12-01/endpoints "PUT" "/v1/apps/{application-id}/campaigns/{campaign-id}" update-campaign-request :portkey.aws.pinpoint.-2016-12-01/update-campaign-request {:payload "WriteCampaignRequest", :move {}, :headers {}, :uri {"application-id" "ApplicationId", "campaign-id" "CampaignId"}, :querystring {}} 200 :portkey.aws.pinpoint.-2016-12-01/update-campaign-response {"BadRequestException" :portkey.aws.pinpoint.-2016-12-01/bad-request-exception, "InternalServerErrorException" :portkey.aws.pinpoint.-2016-12-01/internal-server-error-exception, "ForbiddenException" :portkey.aws.pinpoint.-2016-12-01/forbidden-exception, "NotFoundException" :portkey.aws.pinpoint.-2016-12-01/not-found-exception, "MethodNotAllowedException" :portkey.aws.pinpoint.-2016-12-01/method-not-allowed-exception, "TooManyRequestsException" :portkey.aws.pinpoint.-2016-12-01/too-many-requests-exception})))
(clojure.spec.alpha/fdef update-campaign :args (clojure.spec.alpha/tuple :portkey.aws.pinpoint.-2016-12-01/update-campaign-request) :ret (clojure.spec.alpha/and :portkey.aws.pinpoint.-2016-12-01/update-campaign-response))

(clojure.core/defn get-segments ([get-segments-request] (portkey.aws/-rest-json-call portkey.aws.pinpoint.-2016-12-01/endpoints "GET" "/v1/apps/{application-id}/segments" get-segments-request :portkey.aws.pinpoint.-2016-12-01/get-segments-request {:payload nil, :move {}, :headers {}, :uri {"application-id" "ApplicationId"}, :querystring {"page-size" "PageSize", "token" "Token"}} 200 :portkey.aws.pinpoint.-2016-12-01/get-segments-response {"BadRequestException" :portkey.aws.pinpoint.-2016-12-01/bad-request-exception, "InternalServerErrorException" :portkey.aws.pinpoint.-2016-12-01/internal-server-error-exception, "ForbiddenException" :portkey.aws.pinpoint.-2016-12-01/forbidden-exception, "NotFoundException" :portkey.aws.pinpoint.-2016-12-01/not-found-exception, "MethodNotAllowedException" :portkey.aws.pinpoint.-2016-12-01/method-not-allowed-exception, "TooManyRequestsException" :portkey.aws.pinpoint.-2016-12-01/too-many-requests-exception})))
(clojure.spec.alpha/fdef get-segments :args (clojure.spec.alpha/tuple :portkey.aws.pinpoint.-2016-12-01/get-segments-request) :ret (clojure.spec.alpha/and :portkey.aws.pinpoint.-2016-12-01/get-segments-response))

(clojure.core/defn create-import-job ([create-import-job-request] (portkey.aws/-rest-json-call portkey.aws.pinpoint.-2016-12-01/endpoints "POST" "/v1/apps/{application-id}/jobs/import" create-import-job-request :portkey.aws.pinpoint.-2016-12-01/create-import-job-request {:payload "ImportJobRequest", :move {}, :headers {}, :uri {"application-id" "ApplicationId"}, :querystring {}} 201 :portkey.aws.pinpoint.-2016-12-01/create-import-job-response {"BadRequestException" :portkey.aws.pinpoint.-2016-12-01/bad-request-exception, "InternalServerErrorException" :portkey.aws.pinpoint.-2016-12-01/internal-server-error-exception, "ForbiddenException" :portkey.aws.pinpoint.-2016-12-01/forbidden-exception, "NotFoundException" :portkey.aws.pinpoint.-2016-12-01/not-found-exception, "MethodNotAllowedException" :portkey.aws.pinpoint.-2016-12-01/method-not-allowed-exception, "TooManyRequestsException" :portkey.aws.pinpoint.-2016-12-01/too-many-requests-exception})))
(clojure.spec.alpha/fdef create-import-job :args (clojure.spec.alpha/tuple :portkey.aws.pinpoint.-2016-12-01/create-import-job-request) :ret (clojure.spec.alpha/and :portkey.aws.pinpoint.-2016-12-01/create-import-job-response))

(clojure.core/defn update-application-settings ([update-application-settings-request] (portkey.aws/-rest-json-call portkey.aws.pinpoint.-2016-12-01/endpoints "PUT" "/v1/apps/{application-id}/settings" update-application-settings-request :portkey.aws.pinpoint.-2016-12-01/update-application-settings-request {:payload "WriteApplicationSettingsRequest", :move {}, :headers {}, :uri {"application-id" "ApplicationId"}, :querystring {}} 200 :portkey.aws.pinpoint.-2016-12-01/update-application-settings-response {"BadRequestException" :portkey.aws.pinpoint.-2016-12-01/bad-request-exception, "InternalServerErrorException" :portkey.aws.pinpoint.-2016-12-01/internal-server-error-exception, "ForbiddenException" :portkey.aws.pinpoint.-2016-12-01/forbidden-exception, "NotFoundException" :portkey.aws.pinpoint.-2016-12-01/not-found-exception, "MethodNotAllowedException" :portkey.aws.pinpoint.-2016-12-01/method-not-allowed-exception, "TooManyRequestsException" :portkey.aws.pinpoint.-2016-12-01/too-many-requests-exception})))
(clojure.spec.alpha/fdef update-application-settings :args (clojure.spec.alpha/tuple :portkey.aws.pinpoint.-2016-12-01/update-application-settings-request) :ret (clojure.spec.alpha/and :portkey.aws.pinpoint.-2016-12-01/update-application-settings-response))

(clojure.core/defn get-campaign ([get-campaign-request] (portkey.aws/-rest-json-call portkey.aws.pinpoint.-2016-12-01/endpoints "GET" "/v1/apps/{application-id}/campaigns/{campaign-id}" get-campaign-request :portkey.aws.pinpoint.-2016-12-01/get-campaign-request {:payload nil, :move {}, :headers {}, :uri {"application-id" "ApplicationId", "campaign-id" "CampaignId"}, :querystring {}} 200 :portkey.aws.pinpoint.-2016-12-01/get-campaign-response {"BadRequestException" :portkey.aws.pinpoint.-2016-12-01/bad-request-exception, "InternalServerErrorException" :portkey.aws.pinpoint.-2016-12-01/internal-server-error-exception, "ForbiddenException" :portkey.aws.pinpoint.-2016-12-01/forbidden-exception, "NotFoundException" :portkey.aws.pinpoint.-2016-12-01/not-found-exception, "MethodNotAllowedException" :portkey.aws.pinpoint.-2016-12-01/method-not-allowed-exception, "TooManyRequestsException" :portkey.aws.pinpoint.-2016-12-01/too-many-requests-exception})))
(clojure.spec.alpha/fdef get-campaign :args (clojure.spec.alpha/tuple :portkey.aws.pinpoint.-2016-12-01/get-campaign-request) :ret (clojure.spec.alpha/and :portkey.aws.pinpoint.-2016-12-01/get-campaign-response))

(clojure.core/defn get-import-job ([get-import-job-request] (portkey.aws/-rest-json-call portkey.aws.pinpoint.-2016-12-01/endpoints "GET" "/v1/apps/{application-id}/jobs/import/{job-id}" get-import-job-request :portkey.aws.pinpoint.-2016-12-01/get-import-job-request {:payload nil, :move {}, :headers {}, :uri {"application-id" "ApplicationId", "job-id" "JobId"}, :querystring {}} 200 :portkey.aws.pinpoint.-2016-12-01/get-import-job-response {"BadRequestException" :portkey.aws.pinpoint.-2016-12-01/bad-request-exception, "InternalServerErrorException" :portkey.aws.pinpoint.-2016-12-01/internal-server-error-exception, "ForbiddenException" :portkey.aws.pinpoint.-2016-12-01/forbidden-exception, "NotFoundException" :portkey.aws.pinpoint.-2016-12-01/not-found-exception, "MethodNotAllowedException" :portkey.aws.pinpoint.-2016-12-01/method-not-allowed-exception, "TooManyRequestsException" :portkey.aws.pinpoint.-2016-12-01/too-many-requests-exception})))
(clojure.spec.alpha/fdef get-import-job :args (clojure.spec.alpha/tuple :portkey.aws.pinpoint.-2016-12-01/get-import-job-request) :ret (clojure.spec.alpha/and :portkey.aws.pinpoint.-2016-12-01/get-import-job-response))

(clojure.core/defn update-endpoint ([update-endpoint-request] (portkey.aws/-rest-json-call portkey.aws.pinpoint.-2016-12-01/endpoints "PUT" "/v1/apps/{application-id}/endpoints/{endpoint-id}" update-endpoint-request :portkey.aws.pinpoint.-2016-12-01/update-endpoint-request {:payload "EndpointRequest", :move {}, :headers {}, :uri {"application-id" "ApplicationId", "endpoint-id" "EndpointId"}, :querystring {}} 202 :portkey.aws.pinpoint.-2016-12-01/update-endpoint-response {"BadRequestException" :portkey.aws.pinpoint.-2016-12-01/bad-request-exception, "InternalServerErrorException" :portkey.aws.pinpoint.-2016-12-01/internal-server-error-exception, "ForbiddenException" :portkey.aws.pinpoint.-2016-12-01/forbidden-exception, "NotFoundException" :portkey.aws.pinpoint.-2016-12-01/not-found-exception, "MethodNotAllowedException" :portkey.aws.pinpoint.-2016-12-01/method-not-allowed-exception, "TooManyRequestsException" :portkey.aws.pinpoint.-2016-12-01/too-many-requests-exception})))
(clojure.spec.alpha/fdef update-endpoint :args (clojure.spec.alpha/tuple :portkey.aws.pinpoint.-2016-12-01/update-endpoint-request) :ret (clojure.spec.alpha/and :portkey.aws.pinpoint.-2016-12-01/update-endpoint-response))

(clojure.core/defn get-application-settings ([get-application-settings-request] (portkey.aws/-rest-json-call portkey.aws.pinpoint.-2016-12-01/endpoints "GET" "/v1/apps/{application-id}/settings" get-application-settings-request :portkey.aws.pinpoint.-2016-12-01/get-application-settings-request {:payload nil, :move {}, :headers {}, :uri {"application-id" "ApplicationId"}, :querystring {}} 200 :portkey.aws.pinpoint.-2016-12-01/get-application-settings-response {"BadRequestException" :portkey.aws.pinpoint.-2016-12-01/bad-request-exception, "InternalServerErrorException" :portkey.aws.pinpoint.-2016-12-01/internal-server-error-exception, "ForbiddenException" :portkey.aws.pinpoint.-2016-12-01/forbidden-exception, "NotFoundException" :portkey.aws.pinpoint.-2016-12-01/not-found-exception, "MethodNotAllowedException" :portkey.aws.pinpoint.-2016-12-01/method-not-allowed-exception, "TooManyRequestsException" :portkey.aws.pinpoint.-2016-12-01/too-many-requests-exception})))
(clojure.spec.alpha/fdef get-application-settings :args (clojure.spec.alpha/tuple :portkey.aws.pinpoint.-2016-12-01/get-application-settings-request) :ret (clojure.spec.alpha/and :portkey.aws.pinpoint.-2016-12-01/get-application-settings-response))

(clojure.core/defn get-campaigns ([get-campaigns-request] (portkey.aws/-rest-json-call portkey.aws.pinpoint.-2016-12-01/endpoints "GET" "/v1/apps/{application-id}/campaigns" get-campaigns-request :portkey.aws.pinpoint.-2016-12-01/get-campaigns-request {:payload nil, :move {}, :headers {}, :uri {"application-id" "ApplicationId"}, :querystring {"page-size" "PageSize", "token" "Token"}} 200 :portkey.aws.pinpoint.-2016-12-01/get-campaigns-response {"BadRequestException" :portkey.aws.pinpoint.-2016-12-01/bad-request-exception, "InternalServerErrorException" :portkey.aws.pinpoint.-2016-12-01/internal-server-error-exception, "ForbiddenException" :portkey.aws.pinpoint.-2016-12-01/forbidden-exception, "NotFoundException" :portkey.aws.pinpoint.-2016-12-01/not-found-exception, "MethodNotAllowedException" :portkey.aws.pinpoint.-2016-12-01/method-not-allowed-exception, "TooManyRequestsException" :portkey.aws.pinpoint.-2016-12-01/too-many-requests-exception})))
(clojure.spec.alpha/fdef get-campaigns :args (clojure.spec.alpha/tuple :portkey.aws.pinpoint.-2016-12-01/get-campaigns-request) :ret (clojure.spec.alpha/and :portkey.aws.pinpoint.-2016-12-01/get-campaigns-response))

(clojure.core/defn update-email-channel ([update-email-channel-request] (portkey.aws/-rest-json-call portkey.aws.pinpoint.-2016-12-01/endpoints "PUT" "/v1/apps/{application-id}/channels/email" update-email-channel-request :portkey.aws.pinpoint.-2016-12-01/update-email-channel-request {:payload "EmailChannelRequest", :move {}, :headers {}, :uri {"application-id" "ApplicationId"}, :querystring {}} 200 :portkey.aws.pinpoint.-2016-12-01/update-email-channel-response {"BadRequestException" :portkey.aws.pinpoint.-2016-12-01/bad-request-exception, "InternalServerErrorException" :portkey.aws.pinpoint.-2016-12-01/internal-server-error-exception, "ForbiddenException" :portkey.aws.pinpoint.-2016-12-01/forbidden-exception, "NotFoundException" :portkey.aws.pinpoint.-2016-12-01/not-found-exception, "MethodNotAllowedException" :portkey.aws.pinpoint.-2016-12-01/method-not-allowed-exception, "TooManyRequestsException" :portkey.aws.pinpoint.-2016-12-01/too-many-requests-exception})))
(clojure.spec.alpha/fdef update-email-channel :args (clojure.spec.alpha/tuple :portkey.aws.pinpoint.-2016-12-01/update-email-channel-request) :ret (clojure.spec.alpha/and :portkey.aws.pinpoint.-2016-12-01/update-email-channel-response))

(clojure.core/defn create-campaign ([create-campaign-request] (portkey.aws/-rest-json-call portkey.aws.pinpoint.-2016-12-01/endpoints "POST" "/v1/apps/{application-id}/campaigns" create-campaign-request :portkey.aws.pinpoint.-2016-12-01/create-campaign-request {:payload "WriteCampaignRequest", :move {}, :headers {}, :uri {"application-id" "ApplicationId"}, :querystring {}} 201 :portkey.aws.pinpoint.-2016-12-01/create-campaign-response {"BadRequestException" :portkey.aws.pinpoint.-2016-12-01/bad-request-exception, "InternalServerErrorException" :portkey.aws.pinpoint.-2016-12-01/internal-server-error-exception, "ForbiddenException" :portkey.aws.pinpoint.-2016-12-01/forbidden-exception, "NotFoundException" :portkey.aws.pinpoint.-2016-12-01/not-found-exception, "MethodNotAllowedException" :portkey.aws.pinpoint.-2016-12-01/method-not-allowed-exception, "TooManyRequestsException" :portkey.aws.pinpoint.-2016-12-01/too-many-requests-exception})))
(clojure.spec.alpha/fdef create-campaign :args (clojure.spec.alpha/tuple :portkey.aws.pinpoint.-2016-12-01/create-campaign-request) :ret (clojure.spec.alpha/and :portkey.aws.pinpoint.-2016-12-01/create-campaign-response))

(clojure.core/defn send-messages ([send-messages-request] (portkey.aws/-rest-json-call portkey.aws.pinpoint.-2016-12-01/endpoints "POST" "/v1/apps/{application-id}/messages" send-messages-request :portkey.aws.pinpoint.-2016-12-01/send-messages-request {:payload "MessageRequest", :move {}, :headers {}, :uri {"application-id" "ApplicationId"}, :querystring {}} 200 :portkey.aws.pinpoint.-2016-12-01/send-messages-response {"BadRequestException" :portkey.aws.pinpoint.-2016-12-01/bad-request-exception, "InternalServerErrorException" :portkey.aws.pinpoint.-2016-12-01/internal-server-error-exception, "ForbiddenException" :portkey.aws.pinpoint.-2016-12-01/forbidden-exception, "NotFoundException" :portkey.aws.pinpoint.-2016-12-01/not-found-exception, "MethodNotAllowedException" :portkey.aws.pinpoint.-2016-12-01/method-not-allowed-exception, "TooManyRequestsException" :portkey.aws.pinpoint.-2016-12-01/too-many-requests-exception})))
(clojure.spec.alpha/fdef send-messages :args (clojure.spec.alpha/tuple :portkey.aws.pinpoint.-2016-12-01/send-messages-request) :ret (clojure.spec.alpha/and :portkey.aws.pinpoint.-2016-12-01/send-messages-response))

(clojure.core/defn update-gcm-channel ([update-gcm-channel-request] (portkey.aws/-rest-json-call portkey.aws.pinpoint.-2016-12-01/endpoints "PUT" "/v1/apps/{application-id}/channels/gcm" update-gcm-channel-request :portkey.aws.pinpoint.-2016-12-01/update-gcm-channel-request {:payload "GCMChannelRequest", :move {}, :headers {}, :uri {"application-id" "ApplicationId"}, :querystring {}} 200 :portkey.aws.pinpoint.-2016-12-01/update-gcm-channel-response {"BadRequestException" :portkey.aws.pinpoint.-2016-12-01/bad-request-exception, "InternalServerErrorException" :portkey.aws.pinpoint.-2016-12-01/internal-server-error-exception, "ForbiddenException" :portkey.aws.pinpoint.-2016-12-01/forbidden-exception, "NotFoundException" :portkey.aws.pinpoint.-2016-12-01/not-found-exception, "MethodNotAllowedException" :portkey.aws.pinpoint.-2016-12-01/method-not-allowed-exception, "TooManyRequestsException" :portkey.aws.pinpoint.-2016-12-01/too-many-requests-exception})))
(clojure.spec.alpha/fdef update-gcm-channel :args (clojure.spec.alpha/tuple :portkey.aws.pinpoint.-2016-12-01/update-gcm-channel-request) :ret (clojure.spec.alpha/and :portkey.aws.pinpoint.-2016-12-01/update-gcm-channel-response))

(clojure.core/defn get-segment-versions ([get-segment-versions-request] (portkey.aws/-rest-json-call portkey.aws.pinpoint.-2016-12-01/endpoints "GET" "/v1/apps/{application-id}/segments/{segment-id}/versions" get-segment-versions-request :portkey.aws.pinpoint.-2016-12-01/get-segment-versions-request {:payload nil, :move {}, :headers {}, :uri {"application-id" "ApplicationId", "segment-id" "SegmentId"}, :querystring {"page-size" "PageSize", "token" "Token"}} 200 :portkey.aws.pinpoint.-2016-12-01/get-segment-versions-response {"BadRequestException" :portkey.aws.pinpoint.-2016-12-01/bad-request-exception, "InternalServerErrorException" :portkey.aws.pinpoint.-2016-12-01/internal-server-error-exception, "ForbiddenException" :portkey.aws.pinpoint.-2016-12-01/forbidden-exception, "NotFoundException" :portkey.aws.pinpoint.-2016-12-01/not-found-exception, "MethodNotAllowedException" :portkey.aws.pinpoint.-2016-12-01/method-not-allowed-exception, "TooManyRequestsException" :portkey.aws.pinpoint.-2016-12-01/too-many-requests-exception})))
(clojure.spec.alpha/fdef get-segment-versions :args (clojure.spec.alpha/tuple :portkey.aws.pinpoint.-2016-12-01/get-segment-versions-request) :ret (clojure.spec.alpha/and :portkey.aws.pinpoint.-2016-12-01/get-segment-versions-response))

(clojure.core/defn delete-app ([delete-app-request] (portkey.aws/-rest-json-call portkey.aws.pinpoint.-2016-12-01/endpoints "DELETE" "/v1/apps/{application-id}" delete-app-request :portkey.aws.pinpoint.-2016-12-01/delete-app-request {:payload nil, :move {}, :headers {}, :uri {"application-id" "ApplicationId"}, :querystring {}} 200 :portkey.aws.pinpoint.-2016-12-01/delete-app-response {"BadRequestException" :portkey.aws.pinpoint.-2016-12-01/bad-request-exception, "InternalServerErrorException" :portkey.aws.pinpoint.-2016-12-01/internal-server-error-exception, "ForbiddenException" :portkey.aws.pinpoint.-2016-12-01/forbidden-exception, "NotFoundException" :portkey.aws.pinpoint.-2016-12-01/not-found-exception, "MethodNotAllowedException" :portkey.aws.pinpoint.-2016-12-01/method-not-allowed-exception, "TooManyRequestsException" :portkey.aws.pinpoint.-2016-12-01/too-many-requests-exception})))
(clojure.spec.alpha/fdef delete-app :args (clojure.spec.alpha/tuple :portkey.aws.pinpoint.-2016-12-01/delete-app-request) :ret (clojure.spec.alpha/and :portkey.aws.pinpoint.-2016-12-01/delete-app-response))

(clojure.core/defn create-app ([create-app-request] (portkey.aws/-rest-json-call portkey.aws.pinpoint.-2016-12-01/endpoints "POST" "/v1/apps" create-app-request :portkey.aws.pinpoint.-2016-12-01/create-app-request {:payload "CreateApplicationRequest", :move {}, :headers {}, :uri {}, :querystring {}} 201 :portkey.aws.pinpoint.-2016-12-01/create-app-response {"BadRequestException" :portkey.aws.pinpoint.-2016-12-01/bad-request-exception, "InternalServerErrorException" :portkey.aws.pinpoint.-2016-12-01/internal-server-error-exception, "ForbiddenException" :portkey.aws.pinpoint.-2016-12-01/forbidden-exception, "NotFoundException" :portkey.aws.pinpoint.-2016-12-01/not-found-exception, "MethodNotAllowedException" :portkey.aws.pinpoint.-2016-12-01/method-not-allowed-exception, "TooManyRequestsException" :portkey.aws.pinpoint.-2016-12-01/too-many-requests-exception})))
(clojure.spec.alpha/fdef create-app :args (clojure.spec.alpha/tuple :portkey.aws.pinpoint.-2016-12-01/create-app-request) :ret (clojure.spec.alpha/and :portkey.aws.pinpoint.-2016-12-01/create-app-response))

(clojure.core/defn delete-apns-sandbox-channel ([delete-apns-sandbox-channel-request] (portkey.aws/-rest-json-call portkey.aws.pinpoint.-2016-12-01/endpoints "DELETE" "/v1/apps/{application-id}/channels/apns_sandbox" delete-apns-sandbox-channel-request :portkey.aws.pinpoint.-2016-12-01/delete-apns-sandbox-channel-request {:payload nil, :move {}, :headers {}, :uri {"application-id" "ApplicationId"}, :querystring {}} 200 :portkey.aws.pinpoint.-2016-12-01/delete-apns-sandbox-channel-response {"BadRequestException" :portkey.aws.pinpoint.-2016-12-01/bad-request-exception, "InternalServerErrorException" :portkey.aws.pinpoint.-2016-12-01/internal-server-error-exception, "ForbiddenException" :portkey.aws.pinpoint.-2016-12-01/forbidden-exception, "NotFoundException" :portkey.aws.pinpoint.-2016-12-01/not-found-exception, "MethodNotAllowedException" :portkey.aws.pinpoint.-2016-12-01/method-not-allowed-exception, "TooManyRequestsException" :portkey.aws.pinpoint.-2016-12-01/too-many-requests-exception})))
(clojure.spec.alpha/fdef delete-apns-sandbox-channel :args (clojure.spec.alpha/tuple :portkey.aws.pinpoint.-2016-12-01/delete-apns-sandbox-channel-request) :ret (clojure.spec.alpha/and :portkey.aws.pinpoint.-2016-12-01/delete-apns-sandbox-channel-response))

(clojure.core/defn delete-gcm-channel ([delete-gcm-channel-request] (portkey.aws/-rest-json-call portkey.aws.pinpoint.-2016-12-01/endpoints "DELETE" "/v1/apps/{application-id}/channels/gcm" delete-gcm-channel-request :portkey.aws.pinpoint.-2016-12-01/delete-gcm-channel-request {:payload nil, :move {}, :headers {}, :uri {"application-id" "ApplicationId"}, :querystring {}} 200 :portkey.aws.pinpoint.-2016-12-01/delete-gcm-channel-response {"BadRequestException" :portkey.aws.pinpoint.-2016-12-01/bad-request-exception, "InternalServerErrorException" :portkey.aws.pinpoint.-2016-12-01/internal-server-error-exception, "ForbiddenException" :portkey.aws.pinpoint.-2016-12-01/forbidden-exception, "NotFoundException" :portkey.aws.pinpoint.-2016-12-01/not-found-exception, "MethodNotAllowedException" :portkey.aws.pinpoint.-2016-12-01/method-not-allowed-exception, "TooManyRequestsException" :portkey.aws.pinpoint.-2016-12-01/too-many-requests-exception})))
(clojure.spec.alpha/fdef delete-gcm-channel :args (clojure.spec.alpha/tuple :portkey.aws.pinpoint.-2016-12-01/delete-gcm-channel-request) :ret (clojure.spec.alpha/and :portkey.aws.pinpoint.-2016-12-01/delete-gcm-channel-response))

(clojure.core/defn delete-campaign ([delete-campaign-request] (portkey.aws/-rest-json-call portkey.aws.pinpoint.-2016-12-01/endpoints "DELETE" "/v1/apps/{application-id}/campaigns/{campaign-id}" delete-campaign-request :portkey.aws.pinpoint.-2016-12-01/delete-campaign-request {:payload nil, :move {}, :headers {}, :uri {"application-id" "ApplicationId", "campaign-id" "CampaignId"}, :querystring {}} 200 :portkey.aws.pinpoint.-2016-12-01/delete-campaign-response {"BadRequestException" :portkey.aws.pinpoint.-2016-12-01/bad-request-exception, "InternalServerErrorException" :portkey.aws.pinpoint.-2016-12-01/internal-server-error-exception, "ForbiddenException" :portkey.aws.pinpoint.-2016-12-01/forbidden-exception, "NotFoundException" :portkey.aws.pinpoint.-2016-12-01/not-found-exception, "MethodNotAllowedException" :portkey.aws.pinpoint.-2016-12-01/method-not-allowed-exception, "TooManyRequestsException" :portkey.aws.pinpoint.-2016-12-01/too-many-requests-exception})))
(clojure.spec.alpha/fdef delete-campaign :args (clojure.spec.alpha/tuple :portkey.aws.pinpoint.-2016-12-01/delete-campaign-request) :ret (clojure.spec.alpha/and :portkey.aws.pinpoint.-2016-12-01/delete-campaign-response))

(clojure.core/defn get-app ([get-app-request] (portkey.aws/-rest-json-call portkey.aws.pinpoint.-2016-12-01/endpoints "GET" "/v1/apps/{application-id}" get-app-request :portkey.aws.pinpoint.-2016-12-01/get-app-request {:payload nil, :move {}, :headers {}, :uri {"application-id" "ApplicationId"}, :querystring {}} 200 :portkey.aws.pinpoint.-2016-12-01/get-app-response {"BadRequestException" :portkey.aws.pinpoint.-2016-12-01/bad-request-exception, "InternalServerErrorException" :portkey.aws.pinpoint.-2016-12-01/internal-server-error-exception, "ForbiddenException" :portkey.aws.pinpoint.-2016-12-01/forbidden-exception, "NotFoundException" :portkey.aws.pinpoint.-2016-12-01/not-found-exception, "MethodNotAllowedException" :portkey.aws.pinpoint.-2016-12-01/method-not-allowed-exception, "TooManyRequestsException" :portkey.aws.pinpoint.-2016-12-01/too-many-requests-exception})))
(clojure.spec.alpha/fdef get-app :args (clojure.spec.alpha/tuple :portkey.aws.pinpoint.-2016-12-01/get-app-request) :ret (clojure.spec.alpha/and :portkey.aws.pinpoint.-2016-12-01/get-app-response))

(clojure.core/defn delete-segment ([delete-segment-request] (portkey.aws/-rest-json-call portkey.aws.pinpoint.-2016-12-01/endpoints "DELETE" "/v1/apps/{application-id}/segments/{segment-id}" delete-segment-request :portkey.aws.pinpoint.-2016-12-01/delete-segment-request {:payload nil, :move {}, :headers {}, :uri {"application-id" "ApplicationId", "segment-id" "SegmentId"}, :querystring {}} 200 :portkey.aws.pinpoint.-2016-12-01/delete-segment-response {"BadRequestException" :portkey.aws.pinpoint.-2016-12-01/bad-request-exception, "InternalServerErrorException" :portkey.aws.pinpoint.-2016-12-01/internal-server-error-exception, "ForbiddenException" :portkey.aws.pinpoint.-2016-12-01/forbidden-exception, "NotFoundException" :portkey.aws.pinpoint.-2016-12-01/not-found-exception, "MethodNotAllowedException" :portkey.aws.pinpoint.-2016-12-01/method-not-allowed-exception, "TooManyRequestsException" :portkey.aws.pinpoint.-2016-12-01/too-many-requests-exception})))
(clojure.spec.alpha/fdef delete-segment :args (clojure.spec.alpha/tuple :portkey.aws.pinpoint.-2016-12-01/delete-segment-request) :ret (clojure.spec.alpha/and :portkey.aws.pinpoint.-2016-12-01/delete-segment-response))

(clojure.core/defn delete-apns-channel ([delete-apns-channel-request] (portkey.aws/-rest-json-call portkey.aws.pinpoint.-2016-12-01/endpoints "DELETE" "/v1/apps/{application-id}/channels/apns" delete-apns-channel-request :portkey.aws.pinpoint.-2016-12-01/delete-apns-channel-request {:payload nil, :move {}, :headers {}, :uri {"application-id" "ApplicationId"}, :querystring {}} 200 :portkey.aws.pinpoint.-2016-12-01/delete-apns-channel-response {"BadRequestException" :portkey.aws.pinpoint.-2016-12-01/bad-request-exception, "InternalServerErrorException" :portkey.aws.pinpoint.-2016-12-01/internal-server-error-exception, "ForbiddenException" :portkey.aws.pinpoint.-2016-12-01/forbidden-exception, "NotFoundException" :portkey.aws.pinpoint.-2016-12-01/not-found-exception, "MethodNotAllowedException" :portkey.aws.pinpoint.-2016-12-01/method-not-allowed-exception, "TooManyRequestsException" :portkey.aws.pinpoint.-2016-12-01/too-many-requests-exception})))
(clojure.spec.alpha/fdef delete-apns-channel :args (clojure.spec.alpha/tuple :portkey.aws.pinpoint.-2016-12-01/delete-apns-channel-request) :ret (clojure.spec.alpha/and :portkey.aws.pinpoint.-2016-12-01/delete-apns-channel-response))

(clojure.core/defn update-segment ([update-segment-request] (portkey.aws/-rest-json-call portkey.aws.pinpoint.-2016-12-01/endpoints "PUT" "/v1/apps/{application-id}/segments/{segment-id}" update-segment-request :portkey.aws.pinpoint.-2016-12-01/update-segment-request {:payload "WriteSegmentRequest", :move {}, :headers {}, :uri {"application-id" "ApplicationId", "segment-id" "SegmentId"}, :querystring {}} 200 :portkey.aws.pinpoint.-2016-12-01/update-segment-response {"BadRequestException" :portkey.aws.pinpoint.-2016-12-01/bad-request-exception, "InternalServerErrorException" :portkey.aws.pinpoint.-2016-12-01/internal-server-error-exception, "ForbiddenException" :portkey.aws.pinpoint.-2016-12-01/forbidden-exception, "NotFoundException" :portkey.aws.pinpoint.-2016-12-01/not-found-exception, "MethodNotAllowedException" :portkey.aws.pinpoint.-2016-12-01/method-not-allowed-exception, "TooManyRequestsException" :portkey.aws.pinpoint.-2016-12-01/too-many-requests-exception})))
(clojure.spec.alpha/fdef update-segment :args (clojure.spec.alpha/tuple :portkey.aws.pinpoint.-2016-12-01/update-segment-request) :ret (clojure.spec.alpha/and :portkey.aws.pinpoint.-2016-12-01/update-segment-response))

(clojure.core/defn delete-event-stream ([delete-event-stream-request] (portkey.aws/-rest-json-call portkey.aws.pinpoint.-2016-12-01/endpoints "DELETE" "/v1/apps/{application-id}/eventstream" delete-event-stream-request :portkey.aws.pinpoint.-2016-12-01/delete-event-stream-request {:payload nil, :move {}, :headers {}, :uri {"application-id" "ApplicationId"}, :querystring {}} 200 :portkey.aws.pinpoint.-2016-12-01/delete-event-stream-response {"BadRequestException" :portkey.aws.pinpoint.-2016-12-01/bad-request-exception, "InternalServerErrorException" :portkey.aws.pinpoint.-2016-12-01/internal-server-error-exception, "ForbiddenException" :portkey.aws.pinpoint.-2016-12-01/forbidden-exception, "NotFoundException" :portkey.aws.pinpoint.-2016-12-01/not-found-exception, "MethodNotAllowedException" :portkey.aws.pinpoint.-2016-12-01/method-not-allowed-exception, "TooManyRequestsException" :portkey.aws.pinpoint.-2016-12-01/too-many-requests-exception})))
(clojure.spec.alpha/fdef delete-event-stream :args (clojure.spec.alpha/tuple :portkey.aws.pinpoint.-2016-12-01/delete-event-stream-request) :ret (clojure.spec.alpha/and :portkey.aws.pinpoint.-2016-12-01/delete-event-stream-response))

(clojure.core/defn get-apps ([] (get-apps {})) ([get-apps-request] (portkey.aws/-rest-json-call portkey.aws.pinpoint.-2016-12-01/endpoints "GET" "/v1/apps" get-apps-request :portkey.aws.pinpoint.-2016-12-01/get-apps-request {:payload nil, :move {}, :headers {}, :uri {}, :querystring {"page-size" "PageSize", "token" "Token"}} 200 :portkey.aws.pinpoint.-2016-12-01/get-apps-response {"BadRequestException" :portkey.aws.pinpoint.-2016-12-01/bad-request-exception, "InternalServerErrorException" :portkey.aws.pinpoint.-2016-12-01/internal-server-error-exception, "ForbiddenException" :portkey.aws.pinpoint.-2016-12-01/forbidden-exception, "NotFoundException" :portkey.aws.pinpoint.-2016-12-01/not-found-exception, "MethodNotAllowedException" :portkey.aws.pinpoint.-2016-12-01/method-not-allowed-exception, "TooManyRequestsException" :portkey.aws.pinpoint.-2016-12-01/too-many-requests-exception})))
(clojure.spec.alpha/fdef get-apps :args (clojure.spec.alpha/? :portkey.aws.pinpoint.-2016-12-01/get-apps-request) :ret (clojure.spec.alpha/and :portkey.aws.pinpoint.-2016-12-01/get-apps-response))

(clojure.core/defn get-endpoint ([get-endpoint-request] (portkey.aws/-rest-json-call portkey.aws.pinpoint.-2016-12-01/endpoints "GET" "/v1/apps/{application-id}/endpoints/{endpoint-id}" get-endpoint-request :portkey.aws.pinpoint.-2016-12-01/get-endpoint-request {:payload nil, :move {}, :headers {}, :uri {"application-id" "ApplicationId", "endpoint-id" "EndpointId"}, :querystring {}} 200 :portkey.aws.pinpoint.-2016-12-01/get-endpoint-response {"BadRequestException" :portkey.aws.pinpoint.-2016-12-01/bad-request-exception, "InternalServerErrorException" :portkey.aws.pinpoint.-2016-12-01/internal-server-error-exception, "ForbiddenException" :portkey.aws.pinpoint.-2016-12-01/forbidden-exception, "NotFoundException" :portkey.aws.pinpoint.-2016-12-01/not-found-exception, "MethodNotAllowedException" :portkey.aws.pinpoint.-2016-12-01/method-not-allowed-exception, "TooManyRequestsException" :portkey.aws.pinpoint.-2016-12-01/too-many-requests-exception})))
(clojure.spec.alpha/fdef get-endpoint :args (clojure.spec.alpha/tuple :portkey.aws.pinpoint.-2016-12-01/get-endpoint-request) :ret (clojure.spec.alpha/and :portkey.aws.pinpoint.-2016-12-01/get-endpoint-response))

(clojure.core/defn update-apns-sandbox-channel ([update-apns-sandbox-channel-request] (portkey.aws/-rest-json-call portkey.aws.pinpoint.-2016-12-01/endpoints "PUT" "/v1/apps/{application-id}/channels/apns_sandbox" update-apns-sandbox-channel-request :portkey.aws.pinpoint.-2016-12-01/update-apns-sandbox-channel-request {:payload "APNSSandboxChannelRequest", :move {}, :headers {}, :uri {"application-id" "ApplicationId"}, :querystring {}} 200 :portkey.aws.pinpoint.-2016-12-01/update-apns-sandbox-channel-response {"BadRequestException" :portkey.aws.pinpoint.-2016-12-01/bad-request-exception, "InternalServerErrorException" :portkey.aws.pinpoint.-2016-12-01/internal-server-error-exception, "ForbiddenException" :portkey.aws.pinpoint.-2016-12-01/forbidden-exception, "NotFoundException" :portkey.aws.pinpoint.-2016-12-01/not-found-exception, "MethodNotAllowedException" :portkey.aws.pinpoint.-2016-12-01/method-not-allowed-exception, "TooManyRequestsException" :portkey.aws.pinpoint.-2016-12-01/too-many-requests-exception})))
(clojure.spec.alpha/fdef update-apns-sandbox-channel :args (clojure.spec.alpha/tuple :portkey.aws.pinpoint.-2016-12-01/update-apns-sandbox-channel-request) :ret (clojure.spec.alpha/and :portkey.aws.pinpoint.-2016-12-01/update-apns-sandbox-channel-response))

(clojure.core/defn get-email-channel ([get-email-channel-request] (portkey.aws/-rest-json-call portkey.aws.pinpoint.-2016-12-01/endpoints "GET" "/v1/apps/{application-id}/channels/email" get-email-channel-request :portkey.aws.pinpoint.-2016-12-01/get-email-channel-request {:payload nil, :move {}, :headers {}, :uri {"application-id" "ApplicationId"}, :querystring {}} 200 :portkey.aws.pinpoint.-2016-12-01/get-email-channel-response {"BadRequestException" :portkey.aws.pinpoint.-2016-12-01/bad-request-exception, "InternalServerErrorException" :portkey.aws.pinpoint.-2016-12-01/internal-server-error-exception, "ForbiddenException" :portkey.aws.pinpoint.-2016-12-01/forbidden-exception, "NotFoundException" :portkey.aws.pinpoint.-2016-12-01/not-found-exception, "MethodNotAllowedException" :portkey.aws.pinpoint.-2016-12-01/method-not-allowed-exception, "TooManyRequestsException" :portkey.aws.pinpoint.-2016-12-01/too-many-requests-exception})))
(clojure.spec.alpha/fdef get-email-channel :args (clojure.spec.alpha/tuple :portkey.aws.pinpoint.-2016-12-01/get-email-channel-request) :ret (clojure.spec.alpha/and :portkey.aws.pinpoint.-2016-12-01/get-email-channel-response))

(clojure.core/defn update-sms-channel ([update-sms-channel-request] (portkey.aws/-rest-json-call portkey.aws.pinpoint.-2016-12-01/endpoints "PUT" "/v1/apps/{application-id}/channels/sms" update-sms-channel-request :portkey.aws.pinpoint.-2016-12-01/update-sms-channel-request {:payload "SMSChannelRequest", :move {}, :headers {}, :uri {"application-id" "ApplicationId"}, :querystring {}} 200 :portkey.aws.pinpoint.-2016-12-01/update-sms-channel-response {"BadRequestException" :portkey.aws.pinpoint.-2016-12-01/bad-request-exception, "InternalServerErrorException" :portkey.aws.pinpoint.-2016-12-01/internal-server-error-exception, "ForbiddenException" :portkey.aws.pinpoint.-2016-12-01/forbidden-exception, "NotFoundException" :portkey.aws.pinpoint.-2016-12-01/not-found-exception, "MethodNotAllowedException" :portkey.aws.pinpoint.-2016-12-01/method-not-allowed-exception, "TooManyRequestsException" :portkey.aws.pinpoint.-2016-12-01/too-many-requests-exception})))
(clojure.spec.alpha/fdef update-sms-channel :args (clojure.spec.alpha/tuple :portkey.aws.pinpoint.-2016-12-01/update-sms-channel-request) :ret (clojure.spec.alpha/and :portkey.aws.pinpoint.-2016-12-01/update-sms-channel-response))

(clojure.core/defn create-segment ([create-segment-request] (portkey.aws/-rest-json-call portkey.aws.pinpoint.-2016-12-01/endpoints "POST" "/v1/apps/{application-id}/segments" create-segment-request :portkey.aws.pinpoint.-2016-12-01/create-segment-request {:payload "WriteSegmentRequest", :move {}, :headers {}, :uri {"application-id" "ApplicationId"}, :querystring {}} 201 :portkey.aws.pinpoint.-2016-12-01/create-segment-response {"BadRequestException" :portkey.aws.pinpoint.-2016-12-01/bad-request-exception, "InternalServerErrorException" :portkey.aws.pinpoint.-2016-12-01/internal-server-error-exception, "ForbiddenException" :portkey.aws.pinpoint.-2016-12-01/forbidden-exception, "NotFoundException" :portkey.aws.pinpoint.-2016-12-01/not-found-exception, "MethodNotAllowedException" :portkey.aws.pinpoint.-2016-12-01/method-not-allowed-exception, "TooManyRequestsException" :portkey.aws.pinpoint.-2016-12-01/too-many-requests-exception})))
(clojure.spec.alpha/fdef create-segment :args (clojure.spec.alpha/tuple :portkey.aws.pinpoint.-2016-12-01/create-segment-request) :ret (clojure.spec.alpha/and :portkey.aws.pinpoint.-2016-12-01/create-segment-response))

(clojure.core/defn delete-sms-channel ([delete-sms-channel-request] (portkey.aws/-rest-json-call portkey.aws.pinpoint.-2016-12-01/endpoints "DELETE" "/v1/apps/{application-id}/channels/sms" delete-sms-channel-request :portkey.aws.pinpoint.-2016-12-01/delete-sms-channel-request {:payload nil, :move {}, :headers {}, :uri {"application-id" "ApplicationId"}, :querystring {}} 200 :portkey.aws.pinpoint.-2016-12-01/delete-sms-channel-response {"BadRequestException" :portkey.aws.pinpoint.-2016-12-01/bad-request-exception, "InternalServerErrorException" :portkey.aws.pinpoint.-2016-12-01/internal-server-error-exception, "ForbiddenException" :portkey.aws.pinpoint.-2016-12-01/forbidden-exception, "NotFoundException" :portkey.aws.pinpoint.-2016-12-01/not-found-exception, "MethodNotAllowedException" :portkey.aws.pinpoint.-2016-12-01/method-not-allowed-exception, "TooManyRequestsException" :portkey.aws.pinpoint.-2016-12-01/too-many-requests-exception})))
(clojure.spec.alpha/fdef delete-sms-channel :args (clojure.spec.alpha/tuple :portkey.aws.pinpoint.-2016-12-01/delete-sms-channel-request) :ret (clojure.spec.alpha/and :portkey.aws.pinpoint.-2016-12-01/delete-sms-channel-response))

(clojure.core/defn put-event-stream ([put-event-stream-request] (portkey.aws/-rest-json-call portkey.aws.pinpoint.-2016-12-01/endpoints "POST" "/v1/apps/{application-id}/eventstream" put-event-stream-request :portkey.aws.pinpoint.-2016-12-01/put-event-stream-request {:payload "WriteEventStream", :move {}, :headers {}, :uri {"application-id" "ApplicationId"}, :querystring {}} 200 :portkey.aws.pinpoint.-2016-12-01/put-event-stream-response {"BadRequestException" :portkey.aws.pinpoint.-2016-12-01/bad-request-exception, "InternalServerErrorException" :portkey.aws.pinpoint.-2016-12-01/internal-server-error-exception, "ForbiddenException" :portkey.aws.pinpoint.-2016-12-01/forbidden-exception, "NotFoundException" :portkey.aws.pinpoint.-2016-12-01/not-found-exception, "MethodNotAllowedException" :portkey.aws.pinpoint.-2016-12-01/method-not-allowed-exception, "TooManyRequestsException" :portkey.aws.pinpoint.-2016-12-01/too-many-requests-exception})))
(clojure.spec.alpha/fdef put-event-stream :args (clojure.spec.alpha/tuple :portkey.aws.pinpoint.-2016-12-01/put-event-stream-request) :ret (clojure.spec.alpha/and :portkey.aws.pinpoint.-2016-12-01/put-event-stream-response))
