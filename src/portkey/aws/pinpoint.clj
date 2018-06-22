(ns portkey.aws.pinpoint (:require [portkey.aws]))

(def
 endpoints
 '{"us-east-1"
   {:credential-scope
    {:service "mobiletargeting", :region "us-east-1"},
    :ssl-common-name "pinpoint.us-east-1.amazonaws.com",
    :endpoint "https://pinpoint.us-east-1.amazonaws.com",
    :signature-version :v4}})

(clojure.spec.alpha/def :portkey.aws.pinpoint.treatment-resource/id (clojure.spec.alpha/and :portkey.aws.pinpoint/--string))
(clojure.spec.alpha/def :portkey.aws.pinpoint.treatment-resource/size-percent (clojure.spec.alpha/and :portkey.aws.pinpoint/--integer))
(clojure.spec.alpha/def :portkey.aws.pinpoint.treatment-resource/state (clojure.spec.alpha/and :portkey.aws.pinpoint/campaign-state))
(clojure.spec.alpha/def :portkey.aws.pinpoint.treatment-resource/treatment-description (clojure.spec.alpha/and :portkey.aws.pinpoint/--string))
(clojure.spec.alpha/def :portkey.aws.pinpoint.treatment-resource/treatment-name (clojure.spec.alpha/and :portkey.aws.pinpoint/--string))
(clojure.spec.alpha/def :portkey.aws.pinpoint/treatment-resource (portkey.aws/json-keys :req-un [] :opt-un [:portkey.aws.pinpoint.treatment-resource/Id :portkey.aws.pinpoint/MessageConfiguration :portkey.aws.pinpoint/Schedule :portkey.aws.pinpoint.treatment-resource/SizePercent :portkey.aws.pinpoint.treatment-resource/State :portkey.aws.pinpoint.treatment-resource/TreatmentDescription :portkey.aws.pinpoint.treatment-resource/TreatmentName] :locations {}))

(clojure.spec.alpha/def :portkey.aws.pinpoint.export-jobs-response/item (clojure.spec.alpha/and :portkey.aws.pinpoint/list-of-export-job-response))
(clojure.spec.alpha/def :portkey.aws.pinpoint.export-jobs-response/next-token (clojure.spec.alpha/and :portkey.aws.pinpoint/--string))
(clojure.spec.alpha/def :portkey.aws.pinpoint/export-jobs-response (portkey.aws/json-keys :req-un [] :opt-un [:portkey.aws.pinpoint.export-jobs-response/Item :portkey.aws.pinpoint.export-jobs-response/NextToken] :locations {}))

(clojure.spec.alpha/def :portkey.aws.pinpoint/attribute-type (clojure.spec.alpha/conformer (clojure.core/let [m__13766__auto__ {"INCLUSIVE" "INCLUSIVE", :inclusive "INCLUSIVE", "EXCLUSIVE" "EXCLUSIVE", :exclusive "EXCLUSIVE"}] (clojure.core/fn [s__13767__auto__] (m__13766__auto__ s__13767__auto__ :clojure.spec.alpha/invalid))) (clojure.core/comp clojure.core/keyword portkey.aws/dashed)))

(clojure.spec.alpha/def :portkey.aws.pinpoint.import-job-request/define-segment (clojure.spec.alpha/and :portkey.aws.pinpoint/--boolean))
(clojure.spec.alpha/def :portkey.aws.pinpoint.import-job-request/external-id (clojure.spec.alpha/and :portkey.aws.pinpoint/--string))
(clojure.spec.alpha/def :portkey.aws.pinpoint.import-job-request/register-endpoints (clojure.spec.alpha/and :portkey.aws.pinpoint/--boolean))
(clojure.spec.alpha/def :portkey.aws.pinpoint.import-job-request/role-arn (clojure.spec.alpha/and :portkey.aws.pinpoint/--string))
(clojure.spec.alpha/def :portkey.aws.pinpoint.import-job-request/s3-url (clojure.spec.alpha/and :portkey.aws.pinpoint/--string))
(clojure.spec.alpha/def :portkey.aws.pinpoint.import-job-request/segment-id (clojure.spec.alpha/and :portkey.aws.pinpoint/--string))
(clojure.spec.alpha/def :portkey.aws.pinpoint.import-job-request/segment-name (clojure.spec.alpha/and :portkey.aws.pinpoint/--string))
(clojure.spec.alpha/def :portkey.aws.pinpoint/import-job-request (portkey.aws/json-keys :req-un [] :opt-un [:portkey.aws.pinpoint.import-job-request/DefineSegment :portkey.aws.pinpoint.import-job-request/ExternalId :portkey.aws.pinpoint/Format :portkey.aws.pinpoint.import-job-request/RegisterEndpoints :portkey.aws.pinpoint.import-job-request/RoleArn :portkey.aws.pinpoint.import-job-request/S3Url :portkey.aws.pinpoint.import-job-request/SegmentId :portkey.aws.pinpoint.import-job-request/SegmentName] :locations {}))

(clojure.spec.alpha/def :portkey.aws.pinpoint.update-apns-voip-sandbox-channel-request/application-id (clojure.spec.alpha/and :portkey.aws.pinpoint/--string))
(clojure.spec.alpha/def :portkey.aws.pinpoint/update-apns-voip-sandbox-channel-request (portkey.aws/json-keys :req-un [:portkey.aws.pinpoint.update-apns-voip-sandbox-channel-request/ApplicationId :portkey.aws.pinpoint/APNSVoipSandboxChannelRequest] :opt-un [] :locations {}))

(clojure.spec.alpha/def :portkey.aws.pinpoint.internal-server-error-exception/message (clojure.spec.alpha/and :portkey.aws.pinpoint/--string))
(clojure.spec.alpha/def :portkey.aws.pinpoint.internal-server-error-exception/requestid (clojure.spec.alpha/and :portkey.aws.pinpoint/--string))
(clojure.spec.alpha/def :portkey.aws.pinpoint/internal-server-error-exception (portkey.aws/json-keys :req-un [] :opt-un [:portkey.aws.pinpoint.internal-server-error-exception/Message :portkey.aws.pinpoint.internal-server-error-exception/RequestID] :locations {}))

(clojure.spec.alpha/def :portkey.aws.pinpoint.method-not-allowed-exception/message (clojure.spec.alpha/and :portkey.aws.pinpoint/--string))
(clojure.spec.alpha/def :portkey.aws.pinpoint.method-not-allowed-exception/requestid (clojure.spec.alpha/and :portkey.aws.pinpoint/--string))
(clojure.spec.alpha/def :portkey.aws.pinpoint/method-not-allowed-exception (portkey.aws/json-keys :req-un [] :opt-un [:portkey.aws.pinpoint.method-not-allowed-exception/Message :portkey.aws.pinpoint.method-not-allowed-exception/RequestID] :locations {}))

(clojure.spec.alpha/def :portkey.aws.pinpoint.write-campaign-request/additional-treatments (clojure.spec.alpha/and :portkey.aws.pinpoint/list-of-write-treatment-resource))
(clojure.spec.alpha/def :portkey.aws.pinpoint.write-campaign-request/treatment-description (clojure.spec.alpha/and :portkey.aws.pinpoint/--string))
(clojure.spec.alpha/def :portkey.aws.pinpoint.write-campaign-request/treatment-name (clojure.spec.alpha/and :portkey.aws.pinpoint/--string))
(clojure.spec.alpha/def :portkey.aws.pinpoint.write-campaign-request/limits (clojure.spec.alpha/and :portkey.aws.pinpoint/campaign-limits))
(clojure.spec.alpha/def :portkey.aws.pinpoint.write-campaign-request/segment-version (clojure.spec.alpha/and :portkey.aws.pinpoint/--integer))
(clojure.spec.alpha/def :portkey.aws.pinpoint.write-campaign-request/description (clojure.spec.alpha/and :portkey.aws.pinpoint/--string))
(clojure.spec.alpha/def :portkey.aws.pinpoint.write-campaign-request/is-paused (clojure.spec.alpha/and :portkey.aws.pinpoint/--boolean))
(clojure.spec.alpha/def :portkey.aws.pinpoint.write-campaign-request/hook (clojure.spec.alpha/and :portkey.aws.pinpoint/campaign-hook))
(clojure.spec.alpha/def :portkey.aws.pinpoint.write-campaign-request/segment-id (clojure.spec.alpha/and :portkey.aws.pinpoint/--string))
(clojure.spec.alpha/def :portkey.aws.pinpoint.write-campaign-request/name (clojure.spec.alpha/and :portkey.aws.pinpoint/--string))
(clojure.spec.alpha/def :portkey.aws.pinpoint.write-campaign-request/holdout-percent (clojure.spec.alpha/and :portkey.aws.pinpoint/--integer))
(clojure.spec.alpha/def :portkey.aws.pinpoint/write-campaign-request (portkey.aws/json-keys :req-un [] :opt-un [:portkey.aws.pinpoint.write-campaign-request/AdditionalTreatments :portkey.aws.pinpoint.write-campaign-request/TreatmentDescription :portkey.aws.pinpoint.write-campaign-request/TreatmentName :portkey.aws.pinpoint.write-campaign-request/Limits :portkey.aws.pinpoint.write-campaign-request/SegmentVersion :portkey.aws.pinpoint.write-campaign-request/Description :portkey.aws.pinpoint.write-campaign-request/IsPaused :portkey.aws.pinpoint.write-campaign-request/Hook :portkey.aws.pinpoint/MessageConfiguration :portkey.aws.pinpoint.write-campaign-request/SegmentId :portkey.aws.pinpoint/Schedule :portkey.aws.pinpoint.write-campaign-request/Name :portkey.aws.pinpoint.write-campaign-request/HoldoutPercent] :locations {}))

(clojure.spec.alpha/def :portkey.aws.pinpoint/create-export-job-response (portkey.aws/json-keys :req-un [:portkey.aws.pinpoint/ExportJobResponse] :opt-un [] :locations {}))

(clojure.spec.alpha/def :portkey.aws.pinpoint.gcmmessage/collapse-key (clojure.spec.alpha/and :portkey.aws.pinpoint/--string))
(clojure.spec.alpha/def :portkey.aws.pinpoint.gcmmessage/restricted-package-name (clojure.spec.alpha/and :portkey.aws.pinpoint/--string))
(clojure.spec.alpha/def :portkey.aws.pinpoint.gcmmessage/body (clojure.spec.alpha/and :portkey.aws.pinpoint/--string))
(clojure.spec.alpha/def :portkey.aws.pinpoint.gcmmessage/image-url (clojure.spec.alpha/and :portkey.aws.pinpoint/--string))
(clojure.spec.alpha/def :portkey.aws.pinpoint.gcmmessage/title (clojure.spec.alpha/and :portkey.aws.pinpoint/--string))
(clojure.spec.alpha/def :portkey.aws.pinpoint.gcmmessage/silent-push (clojure.spec.alpha/and :portkey.aws.pinpoint/--boolean))
(clojure.spec.alpha/def :portkey.aws.pinpoint.gcmmessage/sound (clojure.spec.alpha/and :portkey.aws.pinpoint/--string))
(clojure.spec.alpha/def :portkey.aws.pinpoint.gcmmessage/time-to-live (clojure.spec.alpha/and :portkey.aws.pinpoint/--integer))
(clojure.spec.alpha/def :portkey.aws.pinpoint.gcmmessage/priority (clojure.spec.alpha/and :portkey.aws.pinpoint/--string))
(clojure.spec.alpha/def :portkey.aws.pinpoint.gcmmessage/raw-content (clojure.spec.alpha/and :portkey.aws.pinpoint/--string))
(clojure.spec.alpha/def :portkey.aws.pinpoint.gcmmessage/url (clojure.spec.alpha/and :portkey.aws.pinpoint/--string))
(clojure.spec.alpha/def :portkey.aws.pinpoint.gcmmessage/substitutions (clojure.spec.alpha/and :portkey.aws.pinpoint/map-of-list-of--string))
(clojure.spec.alpha/def :portkey.aws.pinpoint.gcmmessage/small-image-icon-url (clojure.spec.alpha/and :portkey.aws.pinpoint/--string))
(clojure.spec.alpha/def :portkey.aws.pinpoint.gcmmessage/icon-reference (clojure.spec.alpha/and :portkey.aws.pinpoint/--string))
(clojure.spec.alpha/def :portkey.aws.pinpoint.gcmmessage/data (clojure.spec.alpha/and :portkey.aws.pinpoint/map-of--string))
(clojure.spec.alpha/def :portkey.aws.pinpoint.gcmmessage/image-icon-url (clojure.spec.alpha/and :portkey.aws.pinpoint/--string))
(clojure.spec.alpha/def :portkey.aws.pinpoint/gcmmessage (portkey.aws/json-keys :req-un [] :opt-un [:portkey.aws.pinpoint.gcmmessage/CollapseKey :portkey.aws.pinpoint.gcmmessage/RestrictedPackageName :portkey.aws.pinpoint.gcmmessage/Body :portkey.aws.pinpoint.gcmmessage/ImageUrl :portkey.aws.pinpoint.gcmmessage/Title :portkey.aws.pinpoint.gcmmessage/SilentPush :portkey.aws.pinpoint.gcmmessage/Sound :portkey.aws.pinpoint.gcmmessage/TimeToLive :portkey.aws.pinpoint.gcmmessage/Priority :portkey.aws.pinpoint.gcmmessage/RawContent :portkey.aws.pinpoint.gcmmessage/Url :portkey.aws.pinpoint.gcmmessage/Substitutions :portkey.aws.pinpoint.gcmmessage/SmallImageIconUrl :portkey.aws.pinpoint.gcmmessage/IconReference :portkey.aws.pinpoint.gcmmessage/Data :portkey.aws.pinpoint.gcmmessage/ImageIconUrl :portkey.aws.pinpoint/Action] :locations {}))

(clojure.spec.alpha/def :portkey.aws.pinpoint/update-application-settings-response (portkey.aws/json-keys :req-un [:portkey.aws.pinpoint/ApplicationSettingsResource] :opt-un [] :locations {}))

(clojure.spec.alpha/def :portkey.aws.pinpoint/send-messages-response (portkey.aws/json-keys :req-un [:portkey.aws.pinpoint/MessageResponse] :opt-un [] :locations {}))

(clojure.spec.alpha/def :portkey.aws.pinpoint.message-response/application-id (clojure.spec.alpha/and :portkey.aws.pinpoint/--string))
(clojure.spec.alpha/def :portkey.aws.pinpoint.message-response/endpoint-result (clojure.spec.alpha/and :portkey.aws.pinpoint/map-of-endpoint-message-result))
(clojure.spec.alpha/def :portkey.aws.pinpoint.message-response/request-id (clojure.spec.alpha/and :portkey.aws.pinpoint/--string))
(clojure.spec.alpha/def :portkey.aws.pinpoint.message-response/result (clojure.spec.alpha/and :portkey.aws.pinpoint/map-of-message-result))
(clojure.spec.alpha/def :portkey.aws.pinpoint/message-response (portkey.aws/json-keys :req-un [] :opt-un [:portkey.aws.pinpoint.message-response/ApplicationId :portkey.aws.pinpoint.message-response/EndpointResult :portkey.aws.pinpoint.message-response/RequestId :portkey.aws.pinpoint.message-response/Result] :locations {}))

(clojure.spec.alpha/def :portkey.aws.pinpoint.delete-gcm-channel-request/application-id (clojure.spec.alpha/and :portkey.aws.pinpoint/--string))
(clojure.spec.alpha/def :portkey.aws.pinpoint/delete-gcm-channel-request (portkey.aws/json-keys :req-un [:portkey.aws.pinpoint.delete-gcm-channel-request/ApplicationId] :opt-un [] :locations {}))

(clojure.spec.alpha/def :portkey.aws.pinpoint/delete-apns-sandbox-channel-response (portkey.aws/json-keys :req-un [:portkey.aws.pinpoint/APNSSandboxChannelResponse] :opt-un [] :locations {}))

(clojure.spec.alpha/def :portkey.aws.pinpoint.import-job-response/failures (clojure.spec.alpha/and :portkey.aws.pinpoint/list-of--string))
(clojure.spec.alpha/def :portkey.aws.pinpoint.import-job-response/completion-date (clojure.spec.alpha/and :portkey.aws.pinpoint/--string))
(clojure.spec.alpha/def :portkey.aws.pinpoint.import-job-response/type (clojure.spec.alpha/and :portkey.aws.pinpoint/--string))
(clojure.spec.alpha/def :portkey.aws.pinpoint.import-job-response/total-pieces (clojure.spec.alpha/and :portkey.aws.pinpoint/--integer))
(clojure.spec.alpha/def :portkey.aws.pinpoint.import-job-response/total-failures (clojure.spec.alpha/and :portkey.aws.pinpoint/--integer))
(clojure.spec.alpha/def :portkey.aws.pinpoint.import-job-response/application-id (clojure.spec.alpha/and :portkey.aws.pinpoint/--string))
(clojure.spec.alpha/def :portkey.aws.pinpoint.import-job-response/definition (clojure.spec.alpha/and :portkey.aws.pinpoint/import-job-resource))
(clojure.spec.alpha/def :portkey.aws.pinpoint.import-job-response/failed-pieces (clojure.spec.alpha/and :portkey.aws.pinpoint/--integer))
(clojure.spec.alpha/def :portkey.aws.pinpoint.import-job-response/completed-pieces (clojure.spec.alpha/and :portkey.aws.pinpoint/--integer))
(clojure.spec.alpha/def :portkey.aws.pinpoint.import-job-response/creation-date (clojure.spec.alpha/and :portkey.aws.pinpoint/--string))
(clojure.spec.alpha/def :portkey.aws.pinpoint.import-job-response/id (clojure.spec.alpha/and :portkey.aws.pinpoint/--string))
(clojure.spec.alpha/def :portkey.aws.pinpoint.import-job-response/total-processed (clojure.spec.alpha/and :portkey.aws.pinpoint/--integer))
(clojure.spec.alpha/def :portkey.aws.pinpoint/import-job-response (portkey.aws/json-keys :req-un [] :opt-un [:portkey.aws.pinpoint/JobStatus :portkey.aws.pinpoint.import-job-response/Failures :portkey.aws.pinpoint.import-job-response/CompletionDate :portkey.aws.pinpoint.import-job-response/Type :portkey.aws.pinpoint.import-job-response/TotalPieces :portkey.aws.pinpoint.import-job-response/TotalFailures :portkey.aws.pinpoint.import-job-response/ApplicationId :portkey.aws.pinpoint.import-job-response/Definition :portkey.aws.pinpoint.import-job-response/FailedPieces :portkey.aws.pinpoint.import-job-response/CompletedPieces :portkey.aws.pinpoint.import-job-response/CreationDate :portkey.aws.pinpoint.import-job-response/Id :portkey.aws.pinpoint.import-job-response/TotalProcessed] :locations {}))

(clojure.spec.alpha/def :portkey.aws.pinpoint.delete-baidu-channel-request/application-id (clojure.spec.alpha/and :portkey.aws.pinpoint/--string))
(clojure.spec.alpha/def :portkey.aws.pinpoint/delete-baidu-channel-request (portkey.aws/json-keys :req-un [:portkey.aws.pinpoint.delete-baidu-channel-request/ApplicationId] :opt-un [] :locations {}))

(clojure.spec.alpha/def :portkey.aws.pinpoint/--timestamp clojure.core/inst?)

(clojure.spec.alpha/def :portkey.aws.pinpoint/create-app-response (portkey.aws/json-keys :req-un [:portkey.aws.pinpoint/ApplicationResponse] :opt-un [] :locations {}))

(clojure.spec.alpha/def :portkey.aws.pinpoint.create-export-job-request/application-id (clojure.spec.alpha/and :portkey.aws.pinpoint/--string))
(clojure.spec.alpha/def :portkey.aws.pinpoint/create-export-job-request (portkey.aws/json-keys :req-un [:portkey.aws.pinpoint.create-export-job-request/ApplicationId :portkey.aws.pinpoint/ExportJobRequest] :opt-un [] :locations {}))

(clojure.spec.alpha/def :portkey.aws.pinpoint/list-of-segment-response (clojure.spec.alpha/and (clojure.spec.alpha/coll-of :portkey.aws.pinpoint/segment-response) (clojure.spec.alpha/conformer clojure.core/identity (fn* [p1__13687__13688__auto__] (if (clojure.core/sequential? p1__13687__13688__auto__) p1__13687__13688__auto__ [p1__13687__13688__auto__])))))

(clojure.spec.alpha/def :portkey.aws.pinpoint.message-request/addresses (clojure.spec.alpha/and :portkey.aws.pinpoint/map-of-address-configuration))
(clojure.spec.alpha/def :portkey.aws.pinpoint.message-request/context (clojure.spec.alpha/and :portkey.aws.pinpoint/map-of--string))
(clojure.spec.alpha/def :portkey.aws.pinpoint.message-request/endpoints (clojure.spec.alpha/and :portkey.aws.pinpoint/map-of-endpoint-send-configuration))
(clojure.spec.alpha/def :portkey.aws.pinpoint.message-request/message-configuration (clojure.spec.alpha/and :portkey.aws.pinpoint/direct-message-configuration))
(clojure.spec.alpha/def :portkey.aws.pinpoint/message-request (portkey.aws/json-keys :req-un [] :opt-un [:portkey.aws.pinpoint.message-request/Addresses :portkey.aws.pinpoint.message-request/Context :portkey.aws.pinpoint.message-request/Endpoints :portkey.aws.pinpoint.message-request/MessageConfiguration] :locations {}))

(clojure.spec.alpha/def :portkey.aws.pinpoint.get-segment-request/application-id (clojure.spec.alpha/and :portkey.aws.pinpoint/--string))
(clojure.spec.alpha/def :portkey.aws.pinpoint.get-segment-request/segment-id (clojure.spec.alpha/and :portkey.aws.pinpoint/--string))
(clojure.spec.alpha/def :portkey.aws.pinpoint/get-segment-request (portkey.aws/json-keys :req-un [:portkey.aws.pinpoint.get-segment-request/SegmentId :portkey.aws.pinpoint.get-segment-request/ApplicationId] :opt-un [] :locations {}))

(clojure.spec.alpha/def :portkey.aws.pinpoint/campaign-state (portkey.aws/json-keys :req-un [] :opt-un [:portkey.aws.pinpoint/CampaignStatus] :locations {}))

(clojure.spec.alpha/def :portkey.aws.pinpoint/send-users-messages-response (portkey.aws/json-keys :req-un [:portkey.aws.pinpoint/SendUsersMessageResponse] :opt-un [] :locations {}))

(clojure.spec.alpha/def :portkey.aws.pinpoint/get-endpoint-response (portkey.aws/json-keys :req-un [:portkey.aws.pinpoint/EndpointResponse] :opt-un [] :locations {}))

(clojure.spec.alpha/def :portkey.aws.pinpoint.get-campaign-version-request/application-id (clojure.spec.alpha/and :portkey.aws.pinpoint/--string))
(clojure.spec.alpha/def :portkey.aws.pinpoint.get-campaign-version-request/campaign-id (clojure.spec.alpha/and :portkey.aws.pinpoint/--string))
(clojure.spec.alpha/def :portkey.aws.pinpoint.get-campaign-version-request/version (clojure.spec.alpha/and :portkey.aws.pinpoint/--string))
(clojure.spec.alpha/def :portkey.aws.pinpoint/get-campaign-version-request (portkey.aws/json-keys :req-un [:portkey.aws.pinpoint.get-campaign-version-request/Version :portkey.aws.pinpoint.get-campaign-version-request/ApplicationId :portkey.aws.pinpoint.get-campaign-version-request/CampaignId] :opt-un [] :locations {}))

(clojure.spec.alpha/def :portkey.aws.pinpoint.campaign-limits/daily (clojure.spec.alpha/and :portkey.aws.pinpoint/--integer))
(clojure.spec.alpha/def :portkey.aws.pinpoint.campaign-limits/maximum-duration (clojure.spec.alpha/and :portkey.aws.pinpoint/--integer))
(clojure.spec.alpha/def :portkey.aws.pinpoint.campaign-limits/messages-per-second (clojure.spec.alpha/and :portkey.aws.pinpoint/--integer))
(clojure.spec.alpha/def :portkey.aws.pinpoint.campaign-limits/total (clojure.spec.alpha/and :portkey.aws.pinpoint/--integer))
(clojure.spec.alpha/def :portkey.aws.pinpoint/campaign-limits (portkey.aws/json-keys :req-un [] :opt-un [:portkey.aws.pinpoint.campaign-limits/Daily :portkey.aws.pinpoint.campaign-limits/MaximumDuration :portkey.aws.pinpoint.campaign-limits/MessagesPerSecond :portkey.aws.pinpoint.campaign-limits/Total] :locations {}))

(clojure.spec.alpha/def :portkey.aws.pinpoint/get-apps-response (portkey.aws/json-keys :req-un [:portkey.aws.pinpoint/ApplicationsResponse] :opt-un [] :locations {}))

(clojure.spec.alpha/def :portkey.aws.pinpoint/get-adm-channel-response (portkey.aws/json-keys :req-un [:portkey.aws.pinpoint/ADMChannelResponse] :opt-un [] :locations {}))

(clojure.spec.alpha/def :portkey.aws.pinpoint.create-campaign-request/application-id (clojure.spec.alpha/and :portkey.aws.pinpoint/--string))
(clojure.spec.alpha/def :portkey.aws.pinpoint/create-campaign-request (portkey.aws/json-keys :req-un [:portkey.aws.pinpoint.create-campaign-request/ApplicationId :portkey.aws.pinpoint/WriteCampaignRequest] :opt-un [] :locations {}))

(clojure.spec.alpha/def :portkey.aws.pinpoint.gcmchannel-response/has-credential (clojure.spec.alpha/and :portkey.aws.pinpoint/--boolean))
(clojure.spec.alpha/def :portkey.aws.pinpoint.gcmchannel-response/platform (clojure.spec.alpha/and :portkey.aws.pinpoint/--string))
(clojure.spec.alpha/def :portkey.aws.pinpoint.gcmchannel-response/credential (clojure.spec.alpha/and :portkey.aws.pinpoint/--string))
(clojure.spec.alpha/def :portkey.aws.pinpoint.gcmchannel-response/last-modified-date (clojure.spec.alpha/and :portkey.aws.pinpoint/--string))
(clojure.spec.alpha/def :portkey.aws.pinpoint.gcmchannel-response/enabled (clojure.spec.alpha/and :portkey.aws.pinpoint/--boolean))
(clojure.spec.alpha/def :portkey.aws.pinpoint.gcmchannel-response/application-id (clojure.spec.alpha/and :portkey.aws.pinpoint/--string))
(clojure.spec.alpha/def :portkey.aws.pinpoint.gcmchannel-response/is-archived (clojure.spec.alpha/and :portkey.aws.pinpoint/--boolean))
(clojure.spec.alpha/def :portkey.aws.pinpoint.gcmchannel-response/creation-date (clojure.spec.alpha/and :portkey.aws.pinpoint/--string))
(clojure.spec.alpha/def :portkey.aws.pinpoint.gcmchannel-response/version (clojure.spec.alpha/and :portkey.aws.pinpoint/--integer))
(clojure.spec.alpha/def :portkey.aws.pinpoint.gcmchannel-response/last-modified-by (clojure.spec.alpha/and :portkey.aws.pinpoint/--string))
(clojure.spec.alpha/def :portkey.aws.pinpoint.gcmchannel-response/id (clojure.spec.alpha/and :portkey.aws.pinpoint/--string))
(clojure.spec.alpha/def :portkey.aws.pinpoint/gcmchannel-response (portkey.aws/json-keys :req-un [] :opt-un [:portkey.aws.pinpoint.gcmchannel-response/HasCredential :portkey.aws.pinpoint.gcmchannel-response/Platform :portkey.aws.pinpoint.gcmchannel-response/Credential :portkey.aws.pinpoint.gcmchannel-response/LastModifiedDate :portkey.aws.pinpoint.gcmchannel-response/Enabled :portkey.aws.pinpoint.gcmchannel-response/ApplicationId :portkey.aws.pinpoint.gcmchannel-response/IsArchived :portkey.aws.pinpoint.gcmchannel-response/CreationDate :portkey.aws.pinpoint.gcmchannel-response/Version :portkey.aws.pinpoint.gcmchannel-response/LastModifiedBy :portkey.aws.pinpoint.gcmchannel-response/Id] :locations {}))

(clojure.spec.alpha/def :portkey.aws.pinpoint.quiet-time/end (clojure.spec.alpha/and :portkey.aws.pinpoint/--string))
(clojure.spec.alpha/def :portkey.aws.pinpoint.quiet-time/start (clojure.spec.alpha/and :portkey.aws.pinpoint/--string))
(clojure.spec.alpha/def :portkey.aws.pinpoint/quiet-time (portkey.aws/json-keys :req-un [] :opt-un [:portkey.aws.pinpoint.quiet-time/End :portkey.aws.pinpoint.quiet-time/Start] :locations {}))

(clojure.spec.alpha/def :portkey.aws.pinpoint/get-application-settings-response (portkey.aws/json-keys :req-un [:portkey.aws.pinpoint/ApplicationSettingsResource] :opt-un [] :locations {}))

(clojure.spec.alpha/def :portkey.aws.pinpoint.delete-apns-voip-sandbox-channel-request/application-id (clojure.spec.alpha/and :portkey.aws.pinpoint/--string))
(clojure.spec.alpha/def :portkey.aws.pinpoint/delete-apns-voip-sandbox-channel-request (portkey.aws/json-keys :req-un [:portkey.aws.pinpoint.delete-apns-voip-sandbox-channel-request/ApplicationId] :opt-un [] :locations {}))

(clojure.spec.alpha/def :portkey.aws.pinpoint/get-app-response (portkey.aws/json-keys :req-un [:portkey.aws.pinpoint/ApplicationResponse] :opt-un [] :locations {}))

(clojure.spec.alpha/def :portkey.aws.pinpoint.export-job-resource/role-arn (clojure.spec.alpha/and :portkey.aws.pinpoint/--string))
(clojure.spec.alpha/def :portkey.aws.pinpoint.export-job-resource/s3-url-prefix (clojure.spec.alpha/and :portkey.aws.pinpoint/--string))
(clojure.spec.alpha/def :portkey.aws.pinpoint.export-job-resource/segment-id (clojure.spec.alpha/and :portkey.aws.pinpoint/--string))
(clojure.spec.alpha/def :portkey.aws.pinpoint/export-job-resource (portkey.aws/json-keys :req-un [] :opt-un [:portkey.aws.pinpoint.export-job-resource/RoleArn :portkey.aws.pinpoint.export-job-resource/S3UrlPrefix :portkey.aws.pinpoint.export-job-resource/SegmentId] :locations {}))

(clojure.spec.alpha/def :portkey.aws.pinpoint.bad-request-exception/message (clojure.spec.alpha/and :portkey.aws.pinpoint/--string))
(clojure.spec.alpha/def :portkey.aws.pinpoint.bad-request-exception/requestid (clojure.spec.alpha/and :portkey.aws.pinpoint/--string))
(clojure.spec.alpha/def :portkey.aws.pinpoint/bad-request-exception (portkey.aws/json-keys :req-un [] :opt-un [:portkey.aws.pinpoint.bad-request-exception/Message :portkey.aws.pinpoint.bad-request-exception/RequestID] :locations {}))

(clojure.spec.alpha/def :portkey.aws.pinpoint/get-campaigns-response (portkey.aws/json-keys :req-un [:portkey.aws.pinpoint/CampaignsResponse] :opt-un [] :locations {}))

(clojure.spec.alpha/def :portkey.aws.pinpoint/list-of-export-job-response (clojure.spec.alpha/and (clojure.spec.alpha/coll-of :portkey.aws.pinpoint/export-job-response) (clojure.spec.alpha/conformer clojure.core/identity (fn* [p1__13687__13688__auto__] (if (clojure.core/sequential? p1__13687__13688__auto__) p1__13687__13688__auto__ [p1__13687__13688__auto__])))))

(clojure.spec.alpha/def :portkey.aws.pinpoint.activity-response/total-endpoint-count (clojure.spec.alpha/and :portkey.aws.pinpoint/--integer))
(clojure.spec.alpha/def :portkey.aws.pinpoint.activity-response/timezones-completed-count (clojure.spec.alpha/and :portkey.aws.pinpoint/--integer))
(clojure.spec.alpha/def :portkey.aws.pinpoint.activity-response/start (clojure.spec.alpha/and :portkey.aws.pinpoint/--string))
(clojure.spec.alpha/def :portkey.aws.pinpoint.activity-response/end (clojure.spec.alpha/and :portkey.aws.pinpoint/--string))
(clojure.spec.alpha/def :portkey.aws.pinpoint.activity-response/result (clojure.spec.alpha/and :portkey.aws.pinpoint/--string))
(clojure.spec.alpha/def :portkey.aws.pinpoint.activity-response/application-id (clojure.spec.alpha/and :portkey.aws.pinpoint/--string))
(clojure.spec.alpha/def :portkey.aws.pinpoint.activity-response/successful-endpoint-count (clojure.spec.alpha/and :portkey.aws.pinpoint/--integer))
(clojure.spec.alpha/def :portkey.aws.pinpoint.activity-response/state (clojure.spec.alpha/and :portkey.aws.pinpoint/--string))
(clojure.spec.alpha/def :portkey.aws.pinpoint.activity-response/scheduled-start (clojure.spec.alpha/and :portkey.aws.pinpoint/--string))
(clojure.spec.alpha/def :portkey.aws.pinpoint.activity-response/timezones-total-count (clojure.spec.alpha/and :portkey.aws.pinpoint/--integer))
(clojure.spec.alpha/def :portkey.aws.pinpoint.activity-response/campaign-id (clojure.spec.alpha/and :portkey.aws.pinpoint/--string))
(clojure.spec.alpha/def :portkey.aws.pinpoint.activity-response/id (clojure.spec.alpha/and :portkey.aws.pinpoint/--string))
(clojure.spec.alpha/def :portkey.aws.pinpoint.activity-response/treatment-id (clojure.spec.alpha/and :portkey.aws.pinpoint/--string))
(clojure.spec.alpha/def :portkey.aws.pinpoint/activity-response (portkey.aws/json-keys :req-un [] :opt-un [:portkey.aws.pinpoint.activity-response/TotalEndpointCount :portkey.aws.pinpoint.activity-response/TimezonesCompletedCount :portkey.aws.pinpoint.activity-response/Start :portkey.aws.pinpoint.activity-response/End :portkey.aws.pinpoint.activity-response/Result :portkey.aws.pinpoint.activity-response/ApplicationId :portkey.aws.pinpoint.activity-response/SuccessfulEndpointCount :portkey.aws.pinpoint.activity-response/State :portkey.aws.pinpoint.activity-response/ScheduledStart :portkey.aws.pinpoint.activity-response/TimezonesTotalCount :portkey.aws.pinpoint.activity-response/CampaignId :portkey.aws.pinpoint.activity-response/Id :portkey.aws.pinpoint.activity-response/TreatmentId] :locations {}))

(clojure.spec.alpha/def :portkey.aws.pinpoint/job-status (clojure.spec.alpha/conformer (clojure.core/let [m__13766__auto__ {"COMPLETED" "COMPLETED", :initializing "INITIALIZING", "FAILING" "FAILING", :processing "PROCESSING", :completed "COMPLETED", :created "CREATED", "COMPLETING" "COMPLETING", :failing "FAILING", "FAILED" "FAILED", :completing "COMPLETING", "INITIALIZING" "INITIALIZING", "PROCESSING" "PROCESSING", :failed "FAILED", "CREATED" "CREATED"}] (clojure.core/fn [s__13767__auto__] (m__13766__auto__ s__13767__auto__ :clojure.spec.alpha/invalid))) (clojure.core/comp clojure.core/keyword portkey.aws/dashed)))

(clojure.spec.alpha/def :portkey.aws.pinpoint/create-app-request (portkey.aws/json-keys :req-un [:portkey.aws.pinpoint/CreateApplicationRequest] :opt-un [] :locations {}))

(clojure.spec.alpha/def :portkey.aws.pinpoint.baidu-message/body (clojure.spec.alpha/and :portkey.aws.pinpoint/--string))
(clojure.spec.alpha/def :portkey.aws.pinpoint.baidu-message/image-url (clojure.spec.alpha/and :portkey.aws.pinpoint/--string))
(clojure.spec.alpha/def :portkey.aws.pinpoint.baidu-message/title (clojure.spec.alpha/and :portkey.aws.pinpoint/--string))
(clojure.spec.alpha/def :portkey.aws.pinpoint.baidu-message/silent-push (clojure.spec.alpha/and :portkey.aws.pinpoint/--boolean))
(clojure.spec.alpha/def :portkey.aws.pinpoint.baidu-message/sound (clojure.spec.alpha/and :portkey.aws.pinpoint/--string))
(clojure.spec.alpha/def :portkey.aws.pinpoint.baidu-message/raw-content (clojure.spec.alpha/and :portkey.aws.pinpoint/--string))
(clojure.spec.alpha/def :portkey.aws.pinpoint.baidu-message/url (clojure.spec.alpha/and :portkey.aws.pinpoint/--string))
(clojure.spec.alpha/def :portkey.aws.pinpoint.baidu-message/substitutions (clojure.spec.alpha/and :portkey.aws.pinpoint/map-of-list-of--string))
(clojure.spec.alpha/def :portkey.aws.pinpoint.baidu-message/small-image-icon-url (clojure.spec.alpha/and :portkey.aws.pinpoint/--string))
(clojure.spec.alpha/def :portkey.aws.pinpoint.baidu-message/icon-reference (clojure.spec.alpha/and :portkey.aws.pinpoint/--string))
(clojure.spec.alpha/def :portkey.aws.pinpoint.baidu-message/data (clojure.spec.alpha/and :portkey.aws.pinpoint/map-of--string))
(clojure.spec.alpha/def :portkey.aws.pinpoint.baidu-message/image-icon-url (clojure.spec.alpha/and :portkey.aws.pinpoint/--string))
(clojure.spec.alpha/def :portkey.aws.pinpoint/baidu-message (portkey.aws/json-keys :req-un [] :opt-un [:portkey.aws.pinpoint.baidu-message/Body :portkey.aws.pinpoint.baidu-message/ImageUrl :portkey.aws.pinpoint.baidu-message/Title :portkey.aws.pinpoint.baidu-message/SilentPush :portkey.aws.pinpoint.baidu-message/Sound :portkey.aws.pinpoint.baidu-message/RawContent :portkey.aws.pinpoint.baidu-message/Url :portkey.aws.pinpoint.baidu-message/Substitutions :portkey.aws.pinpoint.baidu-message/SmallImageIconUrl :portkey.aws.pinpoint.baidu-message/IconReference :portkey.aws.pinpoint.baidu-message/Data :portkey.aws.pinpoint.baidu-message/ImageIconUrl :portkey.aws.pinpoint/Action] :locations {}))

(clojure.spec.alpha/def :portkey.aws.pinpoint.get-gcm-channel-request/application-id (clojure.spec.alpha/and :portkey.aws.pinpoint/--string))
(clojure.spec.alpha/def :portkey.aws.pinpoint/get-gcm-channel-request (portkey.aws/json-keys :req-un [:portkey.aws.pinpoint.get-gcm-channel-request/ApplicationId] :opt-un [] :locations {}))

(clojure.spec.alpha/def :portkey.aws.pinpoint.campaign-response/default-state (clojure.spec.alpha/and :portkey.aws.pinpoint/campaign-state))
(clojure.spec.alpha/def :portkey.aws.pinpoint.campaign-response/last-modified-date (clojure.spec.alpha/and :portkey.aws.pinpoint/--string))
(clojure.spec.alpha/def :portkey.aws.pinpoint.campaign-response/additional-treatments (clojure.spec.alpha/and :portkey.aws.pinpoint/list-of-treatment-resource))
(clojure.spec.alpha/def :portkey.aws.pinpoint.campaign-response/treatment-description (clojure.spec.alpha/and :portkey.aws.pinpoint/--string))
(clojure.spec.alpha/def :portkey.aws.pinpoint.campaign-response/treatment-name (clojure.spec.alpha/and :portkey.aws.pinpoint/--string))
(clojure.spec.alpha/def :portkey.aws.pinpoint.campaign-response/limits (clojure.spec.alpha/and :portkey.aws.pinpoint/campaign-limits))
(clojure.spec.alpha/def :portkey.aws.pinpoint.campaign-response/application-id (clojure.spec.alpha/and :portkey.aws.pinpoint/--string))
(clojure.spec.alpha/def :portkey.aws.pinpoint.campaign-response/segment-version (clojure.spec.alpha/and :portkey.aws.pinpoint/--integer))
(clojure.spec.alpha/def :portkey.aws.pinpoint.campaign-response/description (clojure.spec.alpha/and :portkey.aws.pinpoint/--string))
(clojure.spec.alpha/def :portkey.aws.pinpoint.campaign-response/is-paused (clojure.spec.alpha/and :portkey.aws.pinpoint/--boolean))
(clojure.spec.alpha/def :portkey.aws.pinpoint.campaign-response/hook (clojure.spec.alpha/and :portkey.aws.pinpoint/campaign-hook))
(clojure.spec.alpha/def :portkey.aws.pinpoint.campaign-response/segment-id (clojure.spec.alpha/and :portkey.aws.pinpoint/--string))
(clojure.spec.alpha/def :portkey.aws.pinpoint.campaign-response/creation-date (clojure.spec.alpha/and :portkey.aws.pinpoint/--string))
(clojure.spec.alpha/def :portkey.aws.pinpoint.campaign-response/state (clojure.spec.alpha/and :portkey.aws.pinpoint/campaign-state))
(clojure.spec.alpha/def :portkey.aws.pinpoint.campaign-response/version (clojure.spec.alpha/and :portkey.aws.pinpoint/--integer))
(clojure.spec.alpha/def :portkey.aws.pinpoint.campaign-response/name (clojure.spec.alpha/and :portkey.aws.pinpoint/--string))
(clojure.spec.alpha/def :portkey.aws.pinpoint.campaign-response/id (clojure.spec.alpha/and :portkey.aws.pinpoint/--string))
(clojure.spec.alpha/def :portkey.aws.pinpoint.campaign-response/holdout-percent (clojure.spec.alpha/and :portkey.aws.pinpoint/--integer))
(clojure.spec.alpha/def :portkey.aws.pinpoint/campaign-response (portkey.aws/json-keys :req-un [] :opt-un [:portkey.aws.pinpoint.campaign-response/DefaultState :portkey.aws.pinpoint.campaign-response/LastModifiedDate :portkey.aws.pinpoint.campaign-response/AdditionalTreatments :portkey.aws.pinpoint.campaign-response/TreatmentDescription :portkey.aws.pinpoint.campaign-response/TreatmentName :portkey.aws.pinpoint.campaign-response/Limits :portkey.aws.pinpoint.campaign-response/ApplicationId :portkey.aws.pinpoint.campaign-response/SegmentVersion :portkey.aws.pinpoint.campaign-response/Description :portkey.aws.pinpoint.campaign-response/IsPaused :portkey.aws.pinpoint.campaign-response/Hook :portkey.aws.pinpoint/MessageConfiguration :portkey.aws.pinpoint.campaign-response/SegmentId :portkey.aws.pinpoint.campaign-response/CreationDate :portkey.aws.pinpoint.campaign-response/State :portkey.aws.pinpoint.campaign-response/Version :portkey.aws.pinpoint/Schedule :portkey.aws.pinpoint.campaign-response/Name :portkey.aws.pinpoint.campaign-response/Id :portkey.aws.pinpoint.campaign-response/HoldoutPercent] :locations {}))

(clojure.spec.alpha/def :portkey.aws.pinpoint.create-application-request/name (clojure.spec.alpha/and :portkey.aws.pinpoint/--string))
(clojure.spec.alpha/def :portkey.aws.pinpoint/create-application-request (portkey.aws/json-keys :req-un [] :opt-un [:portkey.aws.pinpoint.create-application-request/Name] :locations {}))

(clojure.spec.alpha/def :portkey.aws.pinpoint/segment-type (clojure.spec.alpha/conformer (clojure.core/let [m__13766__auto__ {"DIMENSIONAL" "DIMENSIONAL", :dimensional "DIMENSIONAL", "IMPORT" "IMPORT", :import "IMPORT"}] (clojure.core/fn [s__13767__auto__] (m__13766__auto__ s__13767__auto__ :clojure.spec.alpha/invalid))) (clojure.core/comp clojure.core/keyword portkey.aws/dashed)))

(clojure.spec.alpha/def :portkey.aws.pinpoint.delete-apns-sandbox-channel-request/application-id (clojure.spec.alpha/and :portkey.aws.pinpoint/--string))
(clojure.spec.alpha/def :portkey.aws.pinpoint/delete-apns-sandbox-channel-request (portkey.aws/json-keys :req-un [:portkey.aws.pinpoint.delete-apns-sandbox-channel-request/ApplicationId] :opt-un [] :locations {}))

(clojure.spec.alpha/def :portkey.aws.pinpoint.attribute-dimension/values (clojure.spec.alpha/and :portkey.aws.pinpoint/list-of--string))
(clojure.spec.alpha/def :portkey.aws.pinpoint/attribute-dimension (portkey.aws/json-keys :req-un [] :opt-un [:portkey.aws.pinpoint/AttributeType :portkey.aws.pinpoint.attribute-dimension/Values] :locations {}))

(clojure.spec.alpha/def :portkey.aws.pinpoint.update-apns-voip-channel-request/application-id (clojure.spec.alpha/and :portkey.aws.pinpoint/--string))
(clojure.spec.alpha/def :portkey.aws.pinpoint/update-apns-voip-channel-request (portkey.aws/json-keys :req-un [:portkey.aws.pinpoint.update-apns-voip-channel-request/ApplicationId :portkey.aws.pinpoint/APNSVoipChannelRequest] :opt-un [] :locations {}))

(clojure.spec.alpha/def :portkey.aws.pinpoint.export-job-response/failures (clojure.spec.alpha/and :portkey.aws.pinpoint/list-of--string))
(clojure.spec.alpha/def :portkey.aws.pinpoint.export-job-response/completion-date (clojure.spec.alpha/and :portkey.aws.pinpoint/--string))
(clojure.spec.alpha/def :portkey.aws.pinpoint.export-job-response/type (clojure.spec.alpha/and :portkey.aws.pinpoint/--string))
(clojure.spec.alpha/def :portkey.aws.pinpoint.export-job-response/total-pieces (clojure.spec.alpha/and :portkey.aws.pinpoint/--integer))
(clojure.spec.alpha/def :portkey.aws.pinpoint.export-job-response/total-failures (clojure.spec.alpha/and :portkey.aws.pinpoint/--integer))
(clojure.spec.alpha/def :portkey.aws.pinpoint.export-job-response/application-id (clojure.spec.alpha/and :portkey.aws.pinpoint/--string))
(clojure.spec.alpha/def :portkey.aws.pinpoint.export-job-response/definition (clojure.spec.alpha/and :portkey.aws.pinpoint/export-job-resource))
(clojure.spec.alpha/def :portkey.aws.pinpoint.export-job-response/failed-pieces (clojure.spec.alpha/and :portkey.aws.pinpoint/--integer))
(clojure.spec.alpha/def :portkey.aws.pinpoint.export-job-response/completed-pieces (clojure.spec.alpha/and :portkey.aws.pinpoint/--integer))
(clojure.spec.alpha/def :portkey.aws.pinpoint.export-job-response/creation-date (clojure.spec.alpha/and :portkey.aws.pinpoint/--string))
(clojure.spec.alpha/def :portkey.aws.pinpoint.export-job-response/id (clojure.spec.alpha/and :portkey.aws.pinpoint/--string))
(clojure.spec.alpha/def :portkey.aws.pinpoint.export-job-response/total-processed (clojure.spec.alpha/and :portkey.aws.pinpoint/--integer))
(clojure.spec.alpha/def :portkey.aws.pinpoint/export-job-response (portkey.aws/json-keys :req-un [] :opt-un [:portkey.aws.pinpoint/JobStatus :portkey.aws.pinpoint.export-job-response/Failures :portkey.aws.pinpoint.export-job-response/CompletionDate :portkey.aws.pinpoint.export-job-response/Type :portkey.aws.pinpoint.export-job-response/TotalPieces :portkey.aws.pinpoint.export-job-response/TotalFailures :portkey.aws.pinpoint.export-job-response/ApplicationId :portkey.aws.pinpoint.export-job-response/Definition :portkey.aws.pinpoint.export-job-response/FailedPieces :portkey.aws.pinpoint.export-job-response/CompletedPieces :portkey.aws.pinpoint.export-job-response/CreationDate :portkey.aws.pinpoint.export-job-response/Id :portkey.aws.pinpoint.export-job-response/TotalProcessed] :locations {}))

(clojure.spec.alpha/def :portkey.aws.pinpoint/delete-adm-channel-response (portkey.aws/json-keys :req-un [:portkey.aws.pinpoint/ADMChannelResponse] :opt-un [] :locations {}))

(clojure.spec.alpha/def :portkey.aws.pinpoint.send-users-message-response/application-id (clojure.spec.alpha/and :portkey.aws.pinpoint/--string))
(clojure.spec.alpha/def :portkey.aws.pinpoint.send-users-message-response/request-id (clojure.spec.alpha/and :portkey.aws.pinpoint/--string))
(clojure.spec.alpha/def :portkey.aws.pinpoint.send-users-message-response/result (clojure.spec.alpha/and :portkey.aws.pinpoint/map-of-map-of-endpoint-message-result))
(clojure.spec.alpha/def :portkey.aws.pinpoint/send-users-message-response (portkey.aws/json-keys :req-un [] :opt-un [:portkey.aws.pinpoint.send-users-message-response/ApplicationId :portkey.aws.pinpoint.send-users-message-response/RequestId :portkey.aws.pinpoint.send-users-message-response/Result] :locations {}))

(clojure.spec.alpha/def :portkey.aws.pinpoint/recency-type (clojure.spec.alpha/conformer (clojure.core/let [m__13766__auto__ {"ACTIVE" "ACTIVE", :active "ACTIVE", "INACTIVE" "INACTIVE", :inactive "INACTIVE"}] (clojure.core/fn [s__13767__auto__] (m__13766__auto__ s__13767__auto__ :clojure.spec.alpha/invalid))) (clojure.core/comp clojure.core/keyword portkey.aws/dashed)))

(clojure.spec.alpha/def :portkey.aws.pinpoint.application-response/id (clojure.spec.alpha/and :portkey.aws.pinpoint/--string))
(clojure.spec.alpha/def :portkey.aws.pinpoint.application-response/name (clojure.spec.alpha/and :portkey.aws.pinpoint/--string))
(clojure.spec.alpha/def :portkey.aws.pinpoint/application-response (portkey.aws/json-keys :req-un [] :opt-un [:portkey.aws.pinpoint.application-response/Id :portkey.aws.pinpoint.application-response/Name] :locations {}))

(clojure.spec.alpha/def :portkey.aws.pinpoint/get-campaign-versions-response (portkey.aws/json-keys :req-un [:portkey.aws.pinpoint/CampaignsResponse] :opt-un [] :locations {}))

(clojure.spec.alpha/def :portkey.aws.pinpoint.write-application-settings-request/limits (clojure.spec.alpha/and :portkey.aws.pinpoint/campaign-limits))
(clojure.spec.alpha/def :portkey.aws.pinpoint/write-application-settings-request (portkey.aws/json-keys :req-un [] :opt-un [:portkey.aws.pinpoint/CampaignHook :portkey.aws.pinpoint.write-application-settings-request/Limits :portkey.aws.pinpoint/QuietTime] :locations {}))

(clojure.spec.alpha/def :portkey.aws.pinpoint.get-adm-channel-request/application-id (clojure.spec.alpha/and :portkey.aws.pinpoint/--string))
(clojure.spec.alpha/def :portkey.aws.pinpoint/get-adm-channel-request (portkey.aws/json-keys :req-un [:portkey.aws.pinpoint.get-adm-channel-request/ApplicationId] :opt-un [] :locations {}))

(clojure.spec.alpha/def :portkey.aws.pinpoint/list-of-treatment-resource (clojure.spec.alpha/and (clojure.spec.alpha/coll-of :portkey.aws.pinpoint/treatment-resource) (clojure.spec.alpha/conformer clojure.core/identity (fn* [p1__13687__13688__auto__] (if (clojure.core/sequential? p1__13687__13688__auto__) p1__13687__13688__auto__ [p1__13687__13688__auto__])))))

(clojure.spec.alpha/def :portkey.aws.pinpoint/delete-apns-channel-response (portkey.aws/json-keys :req-un [:portkey.aws.pinpoint/APNSChannelResponse] :opt-un [] :locations {}))

(clojure.spec.alpha/def :portkey.aws.pinpoint.get-segment-import-jobs-request/application-id (clojure.spec.alpha/and :portkey.aws.pinpoint/--string))
(clojure.spec.alpha/def :portkey.aws.pinpoint.get-segment-import-jobs-request/page-size (clojure.spec.alpha/and :portkey.aws.pinpoint/--string))
(clojure.spec.alpha/def :portkey.aws.pinpoint.get-segment-import-jobs-request/segment-id (clojure.spec.alpha/and :portkey.aws.pinpoint/--string))
(clojure.spec.alpha/def :portkey.aws.pinpoint.get-segment-import-jobs-request/token (clojure.spec.alpha/and :portkey.aws.pinpoint/--string))
(clojure.spec.alpha/def :portkey.aws.pinpoint/get-segment-import-jobs-request (portkey.aws/json-keys :req-un [:portkey.aws.pinpoint.get-segment-import-jobs-request/SegmentId :portkey.aws.pinpoint.get-segment-import-jobs-request/ApplicationId] :opt-un [:portkey.aws.pinpoint.get-segment-import-jobs-request/PageSize :portkey.aws.pinpoint.get-segment-import-jobs-request/Token] :locations {}))

(clojure.spec.alpha/def :portkey.aws.pinpoint.forbidden-exception/message (clojure.spec.alpha/and :portkey.aws.pinpoint/--string))
(clojure.spec.alpha/def :portkey.aws.pinpoint.forbidden-exception/requestid (clojure.spec.alpha/and :portkey.aws.pinpoint/--string))
(clojure.spec.alpha/def :portkey.aws.pinpoint/forbidden-exception (portkey.aws/json-keys :req-un [] :opt-un [:portkey.aws.pinpoint.forbidden-exception/Message :portkey.aws.pinpoint.forbidden-exception/RequestID] :locations {}))

(clojure.spec.alpha/def :portkey.aws.pinpoint/map-of-message-result (clojure.spec.alpha/map-of :portkey.aws.pinpoint/--string :portkey.aws.pinpoint/message-result))

(clojure.spec.alpha/def :portkey.aws.pinpoint.endpoint-user/user-attributes (clojure.spec.alpha/and :portkey.aws.pinpoint/map-of-list-of--string))
(clojure.spec.alpha/def :portkey.aws.pinpoint.endpoint-user/user-id (clojure.spec.alpha/and :portkey.aws.pinpoint/--string))
(clojure.spec.alpha/def :portkey.aws.pinpoint/endpoint-user (portkey.aws/json-keys :req-un [] :opt-un [:portkey.aws.pinpoint.endpoint-user/UserAttributes :portkey.aws.pinpoint.endpoint-user/UserId] :locations {}))

(clojure.spec.alpha/def :portkey.aws.pinpoint/--string (clojure.spec.alpha/and clojure.core/string?))

(clojure.spec.alpha/def :portkey.aws.pinpoint.get-import-job-request/application-id (clojure.spec.alpha/and :portkey.aws.pinpoint/--string))
(clojure.spec.alpha/def :portkey.aws.pinpoint.get-import-job-request/job-id (clojure.spec.alpha/and :portkey.aws.pinpoint/--string))
(clojure.spec.alpha/def :portkey.aws.pinpoint/get-import-job-request (portkey.aws/json-keys :req-un [:portkey.aws.pinpoint.get-import-job-request/ApplicationId :portkey.aws.pinpoint.get-import-job-request/JobId] :opt-un [] :locations {}))

(clojure.spec.alpha/def :portkey.aws.pinpoint.activities-response/item (clojure.spec.alpha/and :portkey.aws.pinpoint/list-of-activity-response))
(clojure.spec.alpha/def :portkey.aws.pinpoint/activities-response (portkey.aws/json-keys :req-un [] :opt-un [:portkey.aws.pinpoint.activities-response/Item] :locations {}))

(clojure.spec.alpha/def :portkey.aws.pinpoint.apnsvoip-sandbox-channel-request/bundle-id (clojure.spec.alpha/and :portkey.aws.pinpoint/--string))
(clojure.spec.alpha/def :portkey.aws.pinpoint.apnsvoip-sandbox-channel-request/certificate (clojure.spec.alpha/and :portkey.aws.pinpoint/--string))
(clojure.spec.alpha/def :portkey.aws.pinpoint.apnsvoip-sandbox-channel-request/default-authentication-method (clojure.spec.alpha/and :portkey.aws.pinpoint/--string))
(clojure.spec.alpha/def :portkey.aws.pinpoint.apnsvoip-sandbox-channel-request/enabled (clojure.spec.alpha/and :portkey.aws.pinpoint/--boolean))
(clojure.spec.alpha/def :portkey.aws.pinpoint.apnsvoip-sandbox-channel-request/private-key (clojure.spec.alpha/and :portkey.aws.pinpoint/--string))
(clojure.spec.alpha/def :portkey.aws.pinpoint.apnsvoip-sandbox-channel-request/team-id (clojure.spec.alpha/and :portkey.aws.pinpoint/--string))
(clojure.spec.alpha/def :portkey.aws.pinpoint.apnsvoip-sandbox-channel-request/token-key (clojure.spec.alpha/and :portkey.aws.pinpoint/--string))
(clojure.spec.alpha/def :portkey.aws.pinpoint.apnsvoip-sandbox-channel-request/token-key-id (clojure.spec.alpha/and :portkey.aws.pinpoint/--string))
(clojure.spec.alpha/def :portkey.aws.pinpoint/apnsvoip-sandbox-channel-request (portkey.aws/json-keys :req-un [] :opt-un [:portkey.aws.pinpoint.apnsvoip-sandbox-channel-request/BundleId :portkey.aws.pinpoint.apnsvoip-sandbox-channel-request/Certificate :portkey.aws.pinpoint.apnsvoip-sandbox-channel-request/DefaultAuthenticationMethod :portkey.aws.pinpoint.apnsvoip-sandbox-channel-request/Enabled :portkey.aws.pinpoint.apnsvoip-sandbox-channel-request/PrivateKey :portkey.aws.pinpoint.apnsvoip-sandbox-channel-request/TeamId :portkey.aws.pinpoint.apnsvoip-sandbox-channel-request/TokenKey :portkey.aws.pinpoint.apnsvoip-sandbox-channel-request/TokenKeyId] :locations {}))

(clojure.spec.alpha/def :portkey.aws.pinpoint.campaigns-response/item (clojure.spec.alpha/and :portkey.aws.pinpoint/list-of-campaign-response))
(clojure.spec.alpha/def :portkey.aws.pinpoint.campaigns-response/next-token (clojure.spec.alpha/and :portkey.aws.pinpoint/--string))
(clojure.spec.alpha/def :portkey.aws.pinpoint/campaigns-response (portkey.aws/json-keys :req-un [] :opt-un [:portkey.aws.pinpoint.campaigns-response/Item :portkey.aws.pinpoint.campaigns-response/NextToken] :locations {}))

(clojure.spec.alpha/def :portkey.aws.pinpoint/get-campaign-activities-response (portkey.aws/json-keys :req-un [:portkey.aws.pinpoint/ActivitiesResponse] :opt-un [] :locations {}))

(clojure.spec.alpha/def :portkey.aws.pinpoint.get-apns-voip-sandbox-channel-request/application-id (clojure.spec.alpha/and :portkey.aws.pinpoint/--string))
(clojure.spec.alpha/def :portkey.aws.pinpoint/get-apns-voip-sandbox-channel-request (portkey.aws/json-keys :req-un [:portkey.aws.pinpoint.get-apns-voip-sandbox-channel-request/ApplicationId] :opt-un [] :locations {}))

(clojure.spec.alpha/def :portkey.aws.pinpoint/delivery-status (clojure.spec.alpha/conformer (clojure.core/let [m__13766__auto__ {:permanent-failure "PERMANENT_FAILURE", :duplicate "DUPLICATE", "PERMANENT_FAILURE" "PERMANENT_FAILURE", :unknown-failure "UNKNOWN_FAILURE", :opt-out "OPT_OUT", :successful "SUCCESSFUL", "OPT_OUT" "OPT_OUT", "TEMPORARY_FAILURE" "TEMPORARY_FAILURE", "UNKNOWN_FAILURE" "UNKNOWN_FAILURE", :throttled "THROTTLED", :temporary-failure "TEMPORARY_FAILURE", "DUPLICATE" "DUPLICATE", "THROTTLED" "THROTTLED", "SUCCESSFUL" "SUCCESSFUL"}] (clojure.core/fn [s__13767__auto__] (m__13766__auto__ s__13767__auto__ :clojure.spec.alpha/invalid))) (clojure.core/comp clojure.core/keyword portkey.aws/dashed)))

(clojure.spec.alpha/def :portkey.aws.pinpoint/update-segment-response (portkey.aws/json-keys :req-un [:portkey.aws.pinpoint/SegmentResponse] :opt-un [] :locations {}))

(clojure.spec.alpha/def :portkey.aws.pinpoint.campaign-sms-message/body (clojure.spec.alpha/and :portkey.aws.pinpoint/--string))
(clojure.spec.alpha/def :portkey.aws.pinpoint.campaign-sms-message/sender-id (clojure.spec.alpha/and :portkey.aws.pinpoint/--string))
(clojure.spec.alpha/def :portkey.aws.pinpoint/campaign-sms-message (portkey.aws/json-keys :req-un [] :opt-un [:portkey.aws.pinpoint.campaign-sms-message/Body :portkey.aws.pinpoint/MessageType :portkey.aws.pinpoint.campaign-sms-message/SenderId] :locations {}))

(clojure.spec.alpha/def :portkey.aws.pinpoint/update-adm-channel-response (portkey.aws/json-keys :req-un [:portkey.aws.pinpoint/ADMChannelResponse] :opt-un [] :locations {}))

(clojure.spec.alpha/def :portkey.aws.pinpoint.update-apns-channel-request/application-id (clojure.spec.alpha/and :portkey.aws.pinpoint/--string))
(clojure.spec.alpha/def :portkey.aws.pinpoint/update-apns-channel-request (portkey.aws/json-keys :req-un [:portkey.aws.pinpoint.update-apns-channel-request/ApplicationId :portkey.aws.pinpoint/APNSChannelRequest] :opt-un [] :locations {}))

(clojure.spec.alpha/def :portkey.aws.pinpoint/get-apns-channel-response (portkey.aws/json-keys :req-un [:portkey.aws.pinpoint/APNSChannelResponse] :opt-un [] :locations {}))

(clojure.spec.alpha/def :portkey.aws.pinpoint.update-adm-channel-request/application-id (clojure.spec.alpha/and :portkey.aws.pinpoint/--string))
(clojure.spec.alpha/def :portkey.aws.pinpoint/update-adm-channel-request (portkey.aws/json-keys :req-un [:portkey.aws.pinpoint.update-adm-channel-request/ApplicationId :portkey.aws.pinpoint/ADMChannelRequest] :opt-un [] :locations {}))

(clojure.spec.alpha/def :portkey.aws.pinpoint/get-campaign-version-response (portkey.aws/json-keys :req-un [:portkey.aws.pinpoint/CampaignResponse] :opt-un [] :locations {}))

(clojure.spec.alpha/def :portkey.aws.pinpoint.get-event-stream-request/application-id (clojure.spec.alpha/and :portkey.aws.pinpoint/--string))
(clojure.spec.alpha/def :portkey.aws.pinpoint/get-event-stream-request (portkey.aws/json-keys :req-un [:portkey.aws.pinpoint.get-event-stream-request/ApplicationId] :opt-un [] :locations {}))

(clojure.spec.alpha/def :portkey.aws.pinpoint/map-of-list-of--string (clojure.spec.alpha/map-of :portkey.aws.pinpoint/--string :portkey.aws.pinpoint/list-of--string))

(clojure.spec.alpha/def :portkey.aws.pinpoint/delete-campaign-response (portkey.aws/json-keys :req-un [:portkey.aws.pinpoint/CampaignResponse] :opt-un [] :locations {}))

(clojure.spec.alpha/def :portkey.aws.pinpoint.endpoint-demographic/app-version (clojure.spec.alpha/and :portkey.aws.pinpoint/--string))
(clojure.spec.alpha/def :portkey.aws.pinpoint.endpoint-demographic/locale (clojure.spec.alpha/and :portkey.aws.pinpoint/--string))
(clojure.spec.alpha/def :portkey.aws.pinpoint.endpoint-demographic/make (clojure.spec.alpha/and :portkey.aws.pinpoint/--string))
(clojure.spec.alpha/def :portkey.aws.pinpoint.endpoint-demographic/model (clojure.spec.alpha/and :portkey.aws.pinpoint/--string))
(clojure.spec.alpha/def :portkey.aws.pinpoint.endpoint-demographic/model-version (clojure.spec.alpha/and :portkey.aws.pinpoint/--string))
(clojure.spec.alpha/def :portkey.aws.pinpoint.endpoint-demographic/platform (clojure.spec.alpha/and :portkey.aws.pinpoint/--string))
(clojure.spec.alpha/def :portkey.aws.pinpoint.endpoint-demographic/platform-version (clojure.spec.alpha/and :portkey.aws.pinpoint/--string))
(clojure.spec.alpha/def :portkey.aws.pinpoint.endpoint-demographic/timezone (clojure.spec.alpha/and :portkey.aws.pinpoint/--string))
(clojure.spec.alpha/def :portkey.aws.pinpoint/endpoint-demographic (portkey.aws/json-keys :req-un [] :opt-un [:portkey.aws.pinpoint.endpoint-demographic/AppVersion :portkey.aws.pinpoint.endpoint-demographic/Locale :portkey.aws.pinpoint.endpoint-demographic/Make :portkey.aws.pinpoint.endpoint-demographic/Model :portkey.aws.pinpoint.endpoint-demographic/ModelVersion :portkey.aws.pinpoint.endpoint-demographic/Platform :portkey.aws.pinpoint.endpoint-demographic/PlatformVersion :portkey.aws.pinpoint.endpoint-demographic/Timezone] :locations {}))

(clojure.spec.alpha/def :portkey.aws.pinpoint/create-segment-response (portkey.aws/json-keys :req-un [:portkey.aws.pinpoint/SegmentResponse] :opt-un [] :locations {}))

(clojure.spec.alpha/def :portkey.aws.pinpoint.update-email-channel-request/application-id (clojure.spec.alpha/and :portkey.aws.pinpoint/--string))
(clojure.spec.alpha/def :portkey.aws.pinpoint/update-email-channel-request (portkey.aws/json-keys :req-un [:portkey.aws.pinpoint.update-email-channel-request/ApplicationId :portkey.aws.pinpoint/EmailChannelRequest] :opt-un [] :locations {}))

(clojure.spec.alpha/def :portkey.aws.pinpoint.delete-apns-channel-request/application-id (clojure.spec.alpha/and :portkey.aws.pinpoint/--string))
(clojure.spec.alpha/def :portkey.aws.pinpoint/delete-apns-channel-request (portkey.aws/json-keys :req-un [:portkey.aws.pinpoint.delete-apns-channel-request/ApplicationId] :opt-un [] :locations {}))

(clojure.spec.alpha/def :portkey.aws.pinpoint/format (clojure.spec.alpha/conformer (clojure.core/let [m__13766__auto__ {"CSV" "CSV", :csv "CSV", "JSON" "JSON", :json "JSON"}] (clojure.core/fn [s__13767__auto__] (m__13766__auto__ s__13767__auto__ :clojure.spec.alpha/invalid))) (clojure.core/comp clojure.core/keyword portkey.aws/dashed)))

(clojure.spec.alpha/def :portkey.aws.pinpoint/mode (clojure.spec.alpha/conformer (clojure.core/let [m__13766__auto__ {"DELIVERY" "DELIVERY", :delivery "DELIVERY", "FILTER" "FILTER", :filter "FILTER"}] (clojure.core/fn [s__13767__auto__] (m__13766__auto__ s__13767__auto__ :clojure.spec.alpha/invalid))) (clojure.core/comp clojure.core/keyword portkey.aws/dashed)))

(clojure.spec.alpha/def :portkey.aws.pinpoint.import-jobs-response/item (clojure.spec.alpha/and :portkey.aws.pinpoint/list-of-import-job-response))
(clojure.spec.alpha/def :portkey.aws.pinpoint.import-jobs-response/next-token (clojure.spec.alpha/and :portkey.aws.pinpoint/--string))
(clojure.spec.alpha/def :portkey.aws.pinpoint/import-jobs-response (portkey.aws/json-keys :req-un [] :opt-un [:portkey.aws.pinpoint.import-jobs-response/Item :portkey.aws.pinpoint.import-jobs-response/NextToken] :locations {}))

(clojure.spec.alpha/def :portkey.aws.pinpoint/update-sms-channel-response (portkey.aws/json-keys :req-un [:portkey.aws.pinpoint/SMSChannelResponse] :opt-un [] :locations {}))

(clojure.spec.alpha/def :portkey.aws.pinpoint.delete-endpoint-request/application-id (clojure.spec.alpha/and :portkey.aws.pinpoint/--string))
(clojure.spec.alpha/def :portkey.aws.pinpoint.delete-endpoint-request/endpoint-id (clojure.spec.alpha/and :portkey.aws.pinpoint/--string))
(clojure.spec.alpha/def :portkey.aws.pinpoint/delete-endpoint-request (portkey.aws/json-keys :req-un [:portkey.aws.pinpoint.delete-endpoint-request/ApplicationId :portkey.aws.pinpoint.delete-endpoint-request/EndpointId] :opt-un [] :locations {}))

(clojure.spec.alpha/def :portkey.aws.pinpoint/get-segments-response (portkey.aws/json-keys :req-un [:portkey.aws.pinpoint/SegmentsResponse] :opt-un [] :locations {}))

(clojure.spec.alpha/def :portkey.aws.pinpoint/delete-sms-channel-response (portkey.aws/json-keys :req-un [:portkey.aws.pinpoint/SMSChannelResponse] :opt-un [] :locations {}))

(clojure.spec.alpha/def :portkey.aws.pinpoint.apnsvoip-sandbox-channel-response/has-credential (clojure.spec.alpha/and :portkey.aws.pinpoint/--boolean))
(clojure.spec.alpha/def :portkey.aws.pinpoint.apnsvoip-sandbox-channel-response/has-token-key (clojure.spec.alpha/and :portkey.aws.pinpoint/--boolean))
(clojure.spec.alpha/def :portkey.aws.pinpoint.apnsvoip-sandbox-channel-response/platform (clojure.spec.alpha/and :portkey.aws.pinpoint/--string))
(clojure.spec.alpha/def :portkey.aws.pinpoint.apnsvoip-sandbox-channel-response/last-modified-date (clojure.spec.alpha/and :portkey.aws.pinpoint/--string))
(clojure.spec.alpha/def :portkey.aws.pinpoint.apnsvoip-sandbox-channel-response/enabled (clojure.spec.alpha/and :portkey.aws.pinpoint/--boolean))
(clojure.spec.alpha/def :portkey.aws.pinpoint.apnsvoip-sandbox-channel-response/application-id (clojure.spec.alpha/and :portkey.aws.pinpoint/--string))
(clojure.spec.alpha/def :portkey.aws.pinpoint.apnsvoip-sandbox-channel-response/is-archived (clojure.spec.alpha/and :portkey.aws.pinpoint/--boolean))
(clojure.spec.alpha/def :portkey.aws.pinpoint.apnsvoip-sandbox-channel-response/default-authentication-method (clojure.spec.alpha/and :portkey.aws.pinpoint/--string))
(clojure.spec.alpha/def :portkey.aws.pinpoint.apnsvoip-sandbox-channel-response/creation-date (clojure.spec.alpha/and :portkey.aws.pinpoint/--string))
(clojure.spec.alpha/def :portkey.aws.pinpoint.apnsvoip-sandbox-channel-response/version (clojure.spec.alpha/and :portkey.aws.pinpoint/--integer))
(clojure.spec.alpha/def :portkey.aws.pinpoint.apnsvoip-sandbox-channel-response/last-modified-by (clojure.spec.alpha/and :portkey.aws.pinpoint/--string))
(clojure.spec.alpha/def :portkey.aws.pinpoint.apnsvoip-sandbox-channel-response/id (clojure.spec.alpha/and :portkey.aws.pinpoint/--string))
(clojure.spec.alpha/def :portkey.aws.pinpoint/apnsvoip-sandbox-channel-response (portkey.aws/json-keys :req-un [] :opt-un [:portkey.aws.pinpoint.apnsvoip-sandbox-channel-response/HasCredential :portkey.aws.pinpoint.apnsvoip-sandbox-channel-response/HasTokenKey :portkey.aws.pinpoint.apnsvoip-sandbox-channel-response/Platform :portkey.aws.pinpoint.apnsvoip-sandbox-channel-response/LastModifiedDate :portkey.aws.pinpoint.apnsvoip-sandbox-channel-response/Enabled :portkey.aws.pinpoint.apnsvoip-sandbox-channel-response/ApplicationId :portkey.aws.pinpoint.apnsvoip-sandbox-channel-response/IsArchived :portkey.aws.pinpoint.apnsvoip-sandbox-channel-response/DefaultAuthenticationMethod :portkey.aws.pinpoint.apnsvoip-sandbox-channel-response/CreationDate :portkey.aws.pinpoint.apnsvoip-sandbox-channel-response/Version :portkey.aws.pinpoint.apnsvoip-sandbox-channel-response/LastModifiedBy :portkey.aws.pinpoint.apnsvoip-sandbox-channel-response/Id] :locations {}))

(clojure.spec.alpha/def :portkey.aws.pinpoint/get-baidu-channel-response (portkey.aws/json-keys :req-un [:portkey.aws.pinpoint/BaiduChannelResponse] :opt-un [] :locations {}))

(clojure.spec.alpha/def :portkey.aws.pinpoint.update-gcm-channel-request/application-id (clojure.spec.alpha/and :portkey.aws.pinpoint/--string))
(clojure.spec.alpha/def :portkey.aws.pinpoint/update-gcm-channel-request (portkey.aws/json-keys :req-un [:portkey.aws.pinpoint.update-gcm-channel-request/ApplicationId :portkey.aws.pinpoint/GCMChannelRequest] :opt-un [] :locations {}))

(clojure.spec.alpha/def :portkey.aws.pinpoint/delete-apns-voip-channel-response (portkey.aws/json-keys :req-un [:portkey.aws.pinpoint/APNSVoipChannelResponse] :opt-un [] :locations {}))

(clojure.spec.alpha/def :portkey.aws.pinpoint.import-job-resource/define-segment (clojure.spec.alpha/and :portkey.aws.pinpoint/--boolean))
(clojure.spec.alpha/def :portkey.aws.pinpoint.import-job-resource/external-id (clojure.spec.alpha/and :portkey.aws.pinpoint/--string))
(clojure.spec.alpha/def :portkey.aws.pinpoint.import-job-resource/register-endpoints (clojure.spec.alpha/and :portkey.aws.pinpoint/--boolean))
(clojure.spec.alpha/def :portkey.aws.pinpoint.import-job-resource/role-arn (clojure.spec.alpha/and :portkey.aws.pinpoint/--string))
(clojure.spec.alpha/def :portkey.aws.pinpoint.import-job-resource/s3-url (clojure.spec.alpha/and :portkey.aws.pinpoint/--string))
(clojure.spec.alpha/def :portkey.aws.pinpoint.import-job-resource/segment-id (clojure.spec.alpha/and :portkey.aws.pinpoint/--string))
(clojure.spec.alpha/def :portkey.aws.pinpoint.import-job-resource/segment-name (clojure.spec.alpha/and :portkey.aws.pinpoint/--string))
(clojure.spec.alpha/def :portkey.aws.pinpoint/import-job-resource (portkey.aws/json-keys :req-un [] :opt-un [:portkey.aws.pinpoint.import-job-resource/DefineSegment :portkey.aws.pinpoint.import-job-resource/ExternalId :portkey.aws.pinpoint/Format :portkey.aws.pinpoint.import-job-resource/RegisterEndpoints :portkey.aws.pinpoint.import-job-resource/RoleArn :portkey.aws.pinpoint.import-job-resource/S3Url :portkey.aws.pinpoint.import-job-resource/SegmentId :portkey.aws.pinpoint.import-job-resource/SegmentName] :locations {}))

(clojure.spec.alpha/def :portkey.aws.pinpoint/list-of--string (clojure.spec.alpha/and (clojure.spec.alpha/coll-of :portkey.aws.pinpoint/--string) (clojure.spec.alpha/conformer clojure.core/identity (fn* [p1__13687__13688__auto__] (if (clojure.core/sequential? p1__13687__13688__auto__) p1__13687__13688__auto__ [p1__13687__13688__auto__])))))

(clojure.spec.alpha/def :portkey.aws.pinpoint.smschannel-response/has-credential (clojure.spec.alpha/and :portkey.aws.pinpoint/--boolean))
(clojure.spec.alpha/def :portkey.aws.pinpoint.smschannel-response/platform (clojure.spec.alpha/and :portkey.aws.pinpoint/--string))
(clojure.spec.alpha/def :portkey.aws.pinpoint.smschannel-response/short-code (clojure.spec.alpha/and :portkey.aws.pinpoint/--string))
(clojure.spec.alpha/def :portkey.aws.pinpoint.smschannel-response/last-modified-date (clojure.spec.alpha/and :portkey.aws.pinpoint/--string))
(clojure.spec.alpha/def :portkey.aws.pinpoint.smschannel-response/enabled (clojure.spec.alpha/and :portkey.aws.pinpoint/--boolean))
(clojure.spec.alpha/def :portkey.aws.pinpoint.smschannel-response/sender-id (clojure.spec.alpha/and :portkey.aws.pinpoint/--string))
(clojure.spec.alpha/def :portkey.aws.pinpoint.smschannel-response/application-id (clojure.spec.alpha/and :portkey.aws.pinpoint/--string))
(clojure.spec.alpha/def :portkey.aws.pinpoint.smschannel-response/is-archived (clojure.spec.alpha/and :portkey.aws.pinpoint/--boolean))
(clojure.spec.alpha/def :portkey.aws.pinpoint.smschannel-response/creation-date (clojure.spec.alpha/and :portkey.aws.pinpoint/--string))
(clojure.spec.alpha/def :portkey.aws.pinpoint.smschannel-response/version (clojure.spec.alpha/and :portkey.aws.pinpoint/--integer))
(clojure.spec.alpha/def :portkey.aws.pinpoint.smschannel-response/last-modified-by (clojure.spec.alpha/and :portkey.aws.pinpoint/--string))
(clojure.spec.alpha/def :portkey.aws.pinpoint.smschannel-response/id (clojure.spec.alpha/and :portkey.aws.pinpoint/--string))
(clojure.spec.alpha/def :portkey.aws.pinpoint/smschannel-response (portkey.aws/json-keys :req-un [] :opt-un [:portkey.aws.pinpoint.smschannel-response/HasCredential :portkey.aws.pinpoint.smschannel-response/Platform :portkey.aws.pinpoint.smschannel-response/ShortCode :portkey.aws.pinpoint.smschannel-response/LastModifiedDate :portkey.aws.pinpoint.smschannel-response/Enabled :portkey.aws.pinpoint.smschannel-response/SenderId :portkey.aws.pinpoint.smschannel-response/ApplicationId :portkey.aws.pinpoint.smschannel-response/IsArchived :portkey.aws.pinpoint.smschannel-response/CreationDate :portkey.aws.pinpoint.smschannel-response/Version :portkey.aws.pinpoint.smschannel-response/LastModifiedBy :portkey.aws.pinpoint.smschannel-response/Id] :locations {}))

(clojure.spec.alpha/def :portkey.aws.pinpoint/update-endpoint-response (portkey.aws/json-keys :req-un [:portkey.aws.pinpoint/MessageBody] :opt-un [] :locations {}))

(clojure.spec.alpha/def :portkey.aws.pinpoint/update-baidu-channel-response (portkey.aws/json-keys :req-un [:portkey.aws.pinpoint/BaiduChannelResponse] :opt-un [] :locations {}))

(clojure.spec.alpha/def :portkey.aws.pinpoint/list-of-endpoint-batch-item (clojure.spec.alpha/and (clojure.spec.alpha/coll-of :portkey.aws.pinpoint/endpoint-batch-item) (clojure.spec.alpha/conformer clojure.core/identity (fn* [p1__13687__13688__auto__] (if (clojure.core/sequential? p1__13687__13688__auto__) p1__13687__13688__auto__ [p1__13687__13688__auto__])))))

(clojure.spec.alpha/def :portkey.aws.pinpoint/get-segment-versions-response (portkey.aws/json-keys :req-un [:portkey.aws.pinpoint/SegmentsResponse] :opt-un [] :locations {}))

(clojure.spec.alpha/def :portkey.aws.pinpoint/delete-app-response (portkey.aws/json-keys :req-un [:portkey.aws.pinpoint/ApplicationResponse] :opt-un [] :locations {}))

(clojure.spec.alpha/def :portkey.aws.pinpoint.too-many-requests-exception/message (clojure.spec.alpha/and :portkey.aws.pinpoint/--string))
(clojure.spec.alpha/def :portkey.aws.pinpoint.too-many-requests-exception/requestid (clojure.spec.alpha/and :portkey.aws.pinpoint/--string))
(clojure.spec.alpha/def :portkey.aws.pinpoint/too-many-requests-exception (portkey.aws/json-keys :req-un [] :opt-un [:portkey.aws.pinpoint.too-many-requests-exception/Message :portkey.aws.pinpoint.too-many-requests-exception/RequestID] :locations {}))

(clojure.spec.alpha/def :portkey.aws.pinpoint/get-gcm-channel-response (portkey.aws/json-keys :req-un [:portkey.aws.pinpoint/GCMChannelResponse] :opt-un [] :locations {}))

(clojure.spec.alpha/def :portkey.aws.pinpoint.endpoint-send-configuration/body-override (clojure.spec.alpha/and :portkey.aws.pinpoint/--string))
(clojure.spec.alpha/def :portkey.aws.pinpoint.endpoint-send-configuration/context (clojure.spec.alpha/and :portkey.aws.pinpoint/map-of--string))
(clojure.spec.alpha/def :portkey.aws.pinpoint.endpoint-send-configuration/raw-content (clojure.spec.alpha/and :portkey.aws.pinpoint/--string))
(clojure.spec.alpha/def :portkey.aws.pinpoint.endpoint-send-configuration/substitutions (clojure.spec.alpha/and :portkey.aws.pinpoint/map-of-list-of--string))
(clojure.spec.alpha/def :portkey.aws.pinpoint.endpoint-send-configuration/title-override (clojure.spec.alpha/and :portkey.aws.pinpoint/--string))
(clojure.spec.alpha/def :portkey.aws.pinpoint/endpoint-send-configuration (portkey.aws/json-keys :req-un [] :opt-un [:portkey.aws.pinpoint.endpoint-send-configuration/BodyOverride :portkey.aws.pinpoint.endpoint-send-configuration/Context :portkey.aws.pinpoint.endpoint-send-configuration/RawContent :portkey.aws.pinpoint.endpoint-send-configuration/Substitutions :portkey.aws.pinpoint.endpoint-send-configuration/TitleOverride] :locations {}))

(clojure.spec.alpha/def :portkey.aws.pinpoint.baidu-channel-request/api-key (clojure.spec.alpha/and :portkey.aws.pinpoint/--string))
(clojure.spec.alpha/def :portkey.aws.pinpoint.baidu-channel-request/enabled (clojure.spec.alpha/and :portkey.aws.pinpoint/--boolean))
(clojure.spec.alpha/def :portkey.aws.pinpoint.baidu-channel-request/secret-key (clojure.spec.alpha/and :portkey.aws.pinpoint/--string))
(clojure.spec.alpha/def :portkey.aws.pinpoint/baidu-channel-request (portkey.aws/json-keys :req-un [] :opt-un [:portkey.aws.pinpoint.baidu-channel-request/ApiKey :portkey.aws.pinpoint.baidu-channel-request/Enabled :portkey.aws.pinpoint.baidu-channel-request/SecretKey] :locations {}))

(clojure.spec.alpha/def :portkey.aws.pinpoint.update-apns-sandbox-channel-request/application-id (clojure.spec.alpha/and :portkey.aws.pinpoint/--string))
(clojure.spec.alpha/def :portkey.aws.pinpoint/update-apns-sandbox-channel-request (portkey.aws/json-keys :req-un [:portkey.aws.pinpoint.update-apns-sandbox-channel-request/ApplicationId :portkey.aws.pinpoint/APNSSandboxChannelRequest] :opt-un [] :locations {}))

(clojure.spec.alpha/def :portkey.aws.pinpoint/get-event-stream-response (portkey.aws/json-keys :req-un [:portkey.aws.pinpoint/EventStream] :opt-un [] :locations {}))

(clojure.spec.alpha/def :portkey.aws.pinpoint.message-body/message (clojure.spec.alpha/and :portkey.aws.pinpoint/--string))
(clojure.spec.alpha/def :portkey.aws.pinpoint.message-body/requestid (clojure.spec.alpha/and :portkey.aws.pinpoint/--string))
(clojure.spec.alpha/def :portkey.aws.pinpoint/message-body (portkey.aws/json-keys :req-un [] :opt-un [:portkey.aws.pinpoint.message-body/Message :portkey.aws.pinpoint.message-body/RequestID] :locations {}))

(clojure.spec.alpha/def :portkey.aws.pinpoint/update-apns-voip-sandbox-channel-response (portkey.aws/json-keys :req-un [:portkey.aws.pinpoint/APNSVoipSandboxChannelResponse] :opt-un [] :locations {}))

(clojure.spec.alpha/def :portkey.aws.pinpoint.get-export-job-request/application-id (clojure.spec.alpha/and :portkey.aws.pinpoint/--string))
(clojure.spec.alpha/def :portkey.aws.pinpoint.get-export-job-request/job-id (clojure.spec.alpha/and :portkey.aws.pinpoint/--string))
(clojure.spec.alpha/def :portkey.aws.pinpoint/get-export-job-request (portkey.aws/json-keys :req-un [:portkey.aws.pinpoint.get-export-job-request/ApplicationId :portkey.aws.pinpoint.get-export-job-request/JobId] :opt-un [] :locations {}))

(clojure.spec.alpha/def :portkey.aws.pinpoint.get-apns-channel-request/application-id (clojure.spec.alpha/and :portkey.aws.pinpoint/--string))
(clojure.spec.alpha/def :portkey.aws.pinpoint/get-apns-channel-request (portkey.aws/json-keys :req-un [:portkey.aws.pinpoint.get-apns-channel-request/ApplicationId] :opt-un [] :locations {}))

(clojure.spec.alpha/def :portkey.aws.pinpoint.delete-apns-voip-channel-request/application-id (clojure.spec.alpha/and :portkey.aws.pinpoint/--string))
(clojure.spec.alpha/def :portkey.aws.pinpoint/delete-apns-voip-channel-request (portkey.aws/json-keys :req-un [:portkey.aws.pinpoint.delete-apns-voip-channel-request/ApplicationId] :opt-un [] :locations {}))

(clojure.spec.alpha/def :portkey.aws.pinpoint.get-endpoint-request/application-id (clojure.spec.alpha/and :portkey.aws.pinpoint/--string))
(clojure.spec.alpha/def :portkey.aws.pinpoint.get-endpoint-request/endpoint-id (clojure.spec.alpha/and :portkey.aws.pinpoint/--string))
(clojure.spec.alpha/def :portkey.aws.pinpoint/get-endpoint-request (portkey.aws/json-keys :req-un [:portkey.aws.pinpoint.get-endpoint-request/ApplicationId :portkey.aws.pinpoint.get-endpoint-request/EndpointId] :opt-un [] :locations {}))

(clojure.spec.alpha/def :portkey.aws.pinpoint.write-event-stream/destination-stream-arn (clojure.spec.alpha/and :portkey.aws.pinpoint/--string))
(clojure.spec.alpha/def :portkey.aws.pinpoint.write-event-stream/role-arn (clojure.spec.alpha/and :portkey.aws.pinpoint/--string))
(clojure.spec.alpha/def :portkey.aws.pinpoint/write-event-stream (portkey.aws/json-keys :req-un [] :opt-un [:portkey.aws.pinpoint.write-event-stream/DestinationStreamArn :portkey.aws.pinpoint.write-event-stream/RoleArn] :locations {}))

(clojure.spec.alpha/def :portkey.aws.pinpoint.apnssandbox-channel-response/has-credential (clojure.spec.alpha/and :portkey.aws.pinpoint/--boolean))
(clojure.spec.alpha/def :portkey.aws.pinpoint.apnssandbox-channel-response/has-token-key (clojure.spec.alpha/and :portkey.aws.pinpoint/--boolean))
(clojure.spec.alpha/def :portkey.aws.pinpoint.apnssandbox-channel-response/platform (clojure.spec.alpha/and :portkey.aws.pinpoint/--string))
(clojure.spec.alpha/def :portkey.aws.pinpoint.apnssandbox-channel-response/last-modified-date (clojure.spec.alpha/and :portkey.aws.pinpoint/--string))
(clojure.spec.alpha/def :portkey.aws.pinpoint.apnssandbox-channel-response/enabled (clojure.spec.alpha/and :portkey.aws.pinpoint/--boolean))
(clojure.spec.alpha/def :portkey.aws.pinpoint.apnssandbox-channel-response/application-id (clojure.spec.alpha/and :portkey.aws.pinpoint/--string))
(clojure.spec.alpha/def :portkey.aws.pinpoint.apnssandbox-channel-response/is-archived (clojure.spec.alpha/and :portkey.aws.pinpoint/--boolean))
(clojure.spec.alpha/def :portkey.aws.pinpoint.apnssandbox-channel-response/default-authentication-method (clojure.spec.alpha/and :portkey.aws.pinpoint/--string))
(clojure.spec.alpha/def :portkey.aws.pinpoint.apnssandbox-channel-response/creation-date (clojure.spec.alpha/and :portkey.aws.pinpoint/--string))
(clojure.spec.alpha/def :portkey.aws.pinpoint.apnssandbox-channel-response/version (clojure.spec.alpha/and :portkey.aws.pinpoint/--integer))
(clojure.spec.alpha/def :portkey.aws.pinpoint.apnssandbox-channel-response/last-modified-by (clojure.spec.alpha/and :portkey.aws.pinpoint/--string))
(clojure.spec.alpha/def :portkey.aws.pinpoint.apnssandbox-channel-response/id (clojure.spec.alpha/and :portkey.aws.pinpoint/--string))
(clojure.spec.alpha/def :portkey.aws.pinpoint/apnssandbox-channel-response (portkey.aws/json-keys :req-un [] :opt-un [:portkey.aws.pinpoint.apnssandbox-channel-response/HasCredential :portkey.aws.pinpoint.apnssandbox-channel-response/HasTokenKey :portkey.aws.pinpoint.apnssandbox-channel-response/Platform :portkey.aws.pinpoint.apnssandbox-channel-response/LastModifiedDate :portkey.aws.pinpoint.apnssandbox-channel-response/Enabled :portkey.aws.pinpoint.apnssandbox-channel-response/ApplicationId :portkey.aws.pinpoint.apnssandbox-channel-response/IsArchived :portkey.aws.pinpoint.apnssandbox-channel-response/DefaultAuthenticationMethod :portkey.aws.pinpoint.apnssandbox-channel-response/CreationDate :portkey.aws.pinpoint.apnssandbox-channel-response/Version :portkey.aws.pinpoint.apnssandbox-channel-response/LastModifiedBy :portkey.aws.pinpoint.apnssandbox-channel-response/Id] :locations {}))

(clojure.spec.alpha/def :portkey.aws.pinpoint.get-segments-request/application-id (clojure.spec.alpha/and :portkey.aws.pinpoint/--string))
(clojure.spec.alpha/def :portkey.aws.pinpoint.get-segments-request/page-size (clojure.spec.alpha/and :portkey.aws.pinpoint/--string))
(clojure.spec.alpha/def :portkey.aws.pinpoint.get-segments-request/token (clojure.spec.alpha/and :portkey.aws.pinpoint/--string))
(clojure.spec.alpha/def :portkey.aws.pinpoint/get-segments-request (portkey.aws/json-keys :req-un [:portkey.aws.pinpoint.get-segments-request/ApplicationId] :opt-un [:portkey.aws.pinpoint.get-segments-request/PageSize :portkey.aws.pinpoint.get-segments-request/Token] :locations {}))

(clojure.spec.alpha/def :portkey.aws.pinpoint/map-of-endpoint-message-result (clojure.spec.alpha/map-of :portkey.aws.pinpoint/--string :portkey.aws.pinpoint/endpoint-message-result))

(clojure.spec.alpha/def :portkey.aws.pinpoint.get-apns-sandbox-channel-request/application-id (clojure.spec.alpha/and :portkey.aws.pinpoint/--string))
(clojure.spec.alpha/def :portkey.aws.pinpoint/get-apns-sandbox-channel-request (portkey.aws/json-keys :req-un [:portkey.aws.pinpoint.get-apns-sandbox-channel-request/ApplicationId] :opt-un [] :locations {}))

(clojure.spec.alpha/def :portkey.aws.pinpoint.get-segment-export-jobs-request/application-id (clojure.spec.alpha/and :portkey.aws.pinpoint/--string))
(clojure.spec.alpha/def :portkey.aws.pinpoint.get-segment-export-jobs-request/page-size (clojure.spec.alpha/and :portkey.aws.pinpoint/--string))
(clojure.spec.alpha/def :portkey.aws.pinpoint.get-segment-export-jobs-request/segment-id (clojure.spec.alpha/and :portkey.aws.pinpoint/--string))
(clojure.spec.alpha/def :portkey.aws.pinpoint.get-segment-export-jobs-request/token (clojure.spec.alpha/and :portkey.aws.pinpoint/--string))
(clojure.spec.alpha/def :portkey.aws.pinpoint/get-segment-export-jobs-request (portkey.aws/json-keys :req-un [:portkey.aws.pinpoint.get-segment-export-jobs-request/SegmentId :portkey.aws.pinpoint.get-segment-export-jobs-request/ApplicationId] :opt-un [:portkey.aws.pinpoint.get-segment-export-jobs-request/PageSize :portkey.aws.pinpoint.get-segment-export-jobs-request/Token] :locations {}))

(clojure.spec.alpha/def :portkey.aws.pinpoint.send-messages-request/application-id (clojure.spec.alpha/and :portkey.aws.pinpoint/--string))
(clojure.spec.alpha/def :portkey.aws.pinpoint/send-messages-request (portkey.aws/json-keys :req-un [:portkey.aws.pinpoint.send-messages-request/ApplicationId :portkey.aws.pinpoint/MessageRequest] :opt-un [] :locations {}))

(clojure.spec.alpha/def :portkey.aws.pinpoint/get-import-job-response (portkey.aws/json-keys :req-un [:portkey.aws.pinpoint/ImportJobResponse] :opt-un [] :locations {}))

(clojure.spec.alpha/def :portkey.aws.pinpoint.get-apns-voip-channel-request/application-id (clojure.spec.alpha/and :portkey.aws.pinpoint/--string))
(clojure.spec.alpha/def :portkey.aws.pinpoint/get-apns-voip-channel-request (portkey.aws/json-keys :req-un [:portkey.aws.pinpoint.get-apns-voip-channel-request/ApplicationId] :opt-un [] :locations {}))

(clojure.spec.alpha/def :portkey.aws.pinpoint/--boolean clojure.core/boolean?)

(clojure.spec.alpha/def :portkey.aws.pinpoint.update-sms-channel-request/application-id (clojure.spec.alpha/and :portkey.aws.pinpoint/--string))
(clojure.spec.alpha/def :portkey.aws.pinpoint/update-sms-channel-request (portkey.aws/json-keys :req-un [:portkey.aws.pinpoint.update-sms-channel-request/ApplicationId :portkey.aws.pinpoint/SMSChannelRequest] :opt-un [] :locations {}))

(clojure.spec.alpha/def :portkey.aws.pinpoint/get-export-jobs-response (portkey.aws/json-keys :req-un [:portkey.aws.pinpoint/ExportJobsResponse] :opt-un [] :locations {}))

(clojure.spec.alpha/def :portkey.aws.pinpoint/map-of--double (clojure.spec.alpha/map-of :portkey.aws.pinpoint/--string :portkey.aws.pinpoint/--double))

(clojure.spec.alpha/def :portkey.aws.pinpoint.endpoint-message-result/address (clojure.spec.alpha/and :portkey.aws.pinpoint/--string))
(clojure.spec.alpha/def :portkey.aws.pinpoint.endpoint-message-result/status-code (clojure.spec.alpha/and :portkey.aws.pinpoint/--integer))
(clojure.spec.alpha/def :portkey.aws.pinpoint.endpoint-message-result/status-message (clojure.spec.alpha/and :portkey.aws.pinpoint/--string))
(clojure.spec.alpha/def :portkey.aws.pinpoint.endpoint-message-result/updated-token (clojure.spec.alpha/and :portkey.aws.pinpoint/--string))
(clojure.spec.alpha/def :portkey.aws.pinpoint/endpoint-message-result (portkey.aws/json-keys :req-un [] :opt-un [:portkey.aws.pinpoint.endpoint-message-result/Address :portkey.aws.pinpoint/DeliveryStatus :portkey.aws.pinpoint.endpoint-message-result/StatusCode :portkey.aws.pinpoint.endpoint-message-result/StatusMessage :portkey.aws.pinpoint.endpoint-message-result/UpdatedToken] :locations {}))

(clojure.spec.alpha/def :portkey.aws.pinpoint.email-channel-request/enabled (clojure.spec.alpha/and :portkey.aws.pinpoint/--boolean))
(clojure.spec.alpha/def :portkey.aws.pinpoint.email-channel-request/from-address (clojure.spec.alpha/and :portkey.aws.pinpoint/--string))
(clojure.spec.alpha/def :portkey.aws.pinpoint.email-channel-request/identity (clojure.spec.alpha/and :portkey.aws.pinpoint/--string))
(clojure.spec.alpha/def :portkey.aws.pinpoint.email-channel-request/role-arn (clojure.spec.alpha/and :portkey.aws.pinpoint/--string))
(clojure.spec.alpha/def :portkey.aws.pinpoint/email-channel-request (portkey.aws/json-keys :req-un [] :opt-un [:portkey.aws.pinpoint.email-channel-request/Enabled :portkey.aws.pinpoint.email-channel-request/FromAddress :portkey.aws.pinpoint.email-channel-request/Identity :portkey.aws.pinpoint.email-channel-request/RoleArn] :locations {}))

(clojure.spec.alpha/def :portkey.aws.pinpoint.set-dimension/values (clojure.spec.alpha/and :portkey.aws.pinpoint/list-of--string))
(clojure.spec.alpha/def :portkey.aws.pinpoint/set-dimension (portkey.aws/json-keys :req-un [] :opt-un [:portkey.aws.pinpoint/DimensionType :portkey.aws.pinpoint.set-dimension/Values] :locations {}))

(clojure.spec.alpha/def :portkey.aws.pinpoint.segment-behaviors/recency (clojure.spec.alpha/and :portkey.aws.pinpoint/recency-dimension))
(clojure.spec.alpha/def :portkey.aws.pinpoint/segment-behaviors (portkey.aws/json-keys :req-un [] :opt-un [:portkey.aws.pinpoint.segment-behaviors/Recency] :locations {}))

(clojure.spec.alpha/def :portkey.aws.pinpoint.update-baidu-channel-request/application-id (clojure.spec.alpha/and :portkey.aws.pinpoint/--string))
(clojure.spec.alpha/def :portkey.aws.pinpoint/update-baidu-channel-request (portkey.aws/json-keys :req-un [:portkey.aws.pinpoint.update-baidu-channel-request/ApplicationId :portkey.aws.pinpoint/BaiduChannelRequest] :opt-un [] :locations {}))

(clojure.spec.alpha/def :portkey.aws.pinpoint.apnsvoip-channel-response/has-credential (clojure.spec.alpha/and :portkey.aws.pinpoint/--boolean))
(clojure.spec.alpha/def :portkey.aws.pinpoint.apnsvoip-channel-response/has-token-key (clojure.spec.alpha/and :portkey.aws.pinpoint/--boolean))
(clojure.spec.alpha/def :portkey.aws.pinpoint.apnsvoip-channel-response/platform (clojure.spec.alpha/and :portkey.aws.pinpoint/--string))
(clojure.spec.alpha/def :portkey.aws.pinpoint.apnsvoip-channel-response/last-modified-date (clojure.spec.alpha/and :portkey.aws.pinpoint/--string))
(clojure.spec.alpha/def :portkey.aws.pinpoint.apnsvoip-channel-response/enabled (clojure.spec.alpha/and :portkey.aws.pinpoint/--boolean))
(clojure.spec.alpha/def :portkey.aws.pinpoint.apnsvoip-channel-response/application-id (clojure.spec.alpha/and :portkey.aws.pinpoint/--string))
(clojure.spec.alpha/def :portkey.aws.pinpoint.apnsvoip-channel-response/is-archived (clojure.spec.alpha/and :portkey.aws.pinpoint/--boolean))
(clojure.spec.alpha/def :portkey.aws.pinpoint.apnsvoip-channel-response/default-authentication-method (clojure.spec.alpha/and :portkey.aws.pinpoint/--string))
(clojure.spec.alpha/def :portkey.aws.pinpoint.apnsvoip-channel-response/creation-date (clojure.spec.alpha/and :portkey.aws.pinpoint/--string))
(clojure.spec.alpha/def :portkey.aws.pinpoint.apnsvoip-channel-response/version (clojure.spec.alpha/and :portkey.aws.pinpoint/--integer))
(clojure.spec.alpha/def :portkey.aws.pinpoint.apnsvoip-channel-response/last-modified-by (clojure.spec.alpha/and :portkey.aws.pinpoint/--string))
(clojure.spec.alpha/def :portkey.aws.pinpoint.apnsvoip-channel-response/id (clojure.spec.alpha/and :portkey.aws.pinpoint/--string))
(clojure.spec.alpha/def :portkey.aws.pinpoint/apnsvoip-channel-response (portkey.aws/json-keys :req-un [] :opt-un [:portkey.aws.pinpoint.apnsvoip-channel-response/HasCredential :portkey.aws.pinpoint.apnsvoip-channel-response/HasTokenKey :portkey.aws.pinpoint.apnsvoip-channel-response/Platform :portkey.aws.pinpoint.apnsvoip-channel-response/LastModifiedDate :portkey.aws.pinpoint.apnsvoip-channel-response/Enabled :portkey.aws.pinpoint.apnsvoip-channel-response/ApplicationId :portkey.aws.pinpoint.apnsvoip-channel-response/IsArchived :portkey.aws.pinpoint.apnsvoip-channel-response/DefaultAuthenticationMethod :portkey.aws.pinpoint.apnsvoip-channel-response/CreationDate :portkey.aws.pinpoint.apnsvoip-channel-response/Version :portkey.aws.pinpoint.apnsvoip-channel-response/LastModifiedBy :portkey.aws.pinpoint.apnsvoip-channel-response/Id] :locations {}))

(clojure.spec.alpha/def :portkey.aws.pinpoint.export-job-request/role-arn (clojure.spec.alpha/and :portkey.aws.pinpoint/--string))
(clojure.spec.alpha/def :portkey.aws.pinpoint.export-job-request/s3-url-prefix (clojure.spec.alpha/and :portkey.aws.pinpoint/--string))
(clojure.spec.alpha/def :portkey.aws.pinpoint.export-job-request/segment-id (clojure.spec.alpha/and :portkey.aws.pinpoint/--string))
(clojure.spec.alpha/def :portkey.aws.pinpoint/export-job-request (portkey.aws/json-keys :req-un [] :opt-un [:portkey.aws.pinpoint.export-job-request/RoleArn :portkey.aws.pinpoint.export-job-request/S3UrlPrefix :portkey.aws.pinpoint.export-job-request/SegmentId] :locations {}))

(clojure.spec.alpha/def :portkey.aws.pinpoint.admmessage/body (clojure.spec.alpha/and :portkey.aws.pinpoint/--string))
(clojure.spec.alpha/def :portkey.aws.pinpoint.admmessage/image-url (clojure.spec.alpha/and :portkey.aws.pinpoint/--string))
(clojure.spec.alpha/def :portkey.aws.pinpoint.admmessage/title (clojure.spec.alpha/and :portkey.aws.pinpoint/--string))
(clojure.spec.alpha/def :portkey.aws.pinpoint.admmessage/silent-push (clojure.spec.alpha/and :portkey.aws.pinpoint/--boolean))
(clojure.spec.alpha/def :portkey.aws.pinpoint.admmessage/consolidation-key (clojure.spec.alpha/and :portkey.aws.pinpoint/--string))
(clojure.spec.alpha/def :portkey.aws.pinpoint.admmessage/sound (clojure.spec.alpha/and :portkey.aws.pinpoint/--string))
(clojure.spec.alpha/def :portkey.aws.pinpoint.admmessage/expires-after (clojure.spec.alpha/and :portkey.aws.pinpoint/--string))
(clojure.spec.alpha/def :portkey.aws.pinpoint.admmessage/raw-content (clojure.spec.alpha/and :portkey.aws.pinpoint/--string))
(clojure.spec.alpha/def :portkey.aws.pinpoint.admmessage/url (clojure.spec.alpha/and :portkey.aws.pinpoint/--string))
(clojure.spec.alpha/def :portkey.aws.pinpoint.admmessage/substitutions (clojure.spec.alpha/and :portkey.aws.pinpoint/map-of-list-of--string))
(clojure.spec.alpha/def :portkey.aws.pinpoint.admmessage/small-image-icon-url (clojure.spec.alpha/and :portkey.aws.pinpoint/--string))
(clojure.spec.alpha/def :portkey.aws.pinpoint.admmessage/icon-reference (clojure.spec.alpha/and :portkey.aws.pinpoint/--string))
(clojure.spec.alpha/def :portkey.aws.pinpoint.admmessage/data (clojure.spec.alpha/and :portkey.aws.pinpoint/map-of--string))
(clojure.spec.alpha/def :portkey.aws.pinpoint.admmessage/image-icon-url (clojure.spec.alpha/and :portkey.aws.pinpoint/--string))
(clojure.spec.alpha/def :portkey.aws.pinpoint.admmessage/md5 (clojure.spec.alpha/and :portkey.aws.pinpoint/--string))
(clojure.spec.alpha/def :portkey.aws.pinpoint/admmessage (portkey.aws/json-keys :req-un [] :opt-un [:portkey.aws.pinpoint.admmessage/Body :portkey.aws.pinpoint.admmessage/ImageUrl :portkey.aws.pinpoint.admmessage/Title :portkey.aws.pinpoint.admmessage/SilentPush :portkey.aws.pinpoint.admmessage/ConsolidationKey :portkey.aws.pinpoint.admmessage/Sound :portkey.aws.pinpoint.admmessage/ExpiresAfter :portkey.aws.pinpoint.admmessage/RawContent :portkey.aws.pinpoint.admmessage/Url :portkey.aws.pinpoint.admmessage/Substitutions :portkey.aws.pinpoint.admmessage/SmallImageIconUrl :portkey.aws.pinpoint.admmessage/IconReference :portkey.aws.pinpoint.admmessage/Data :portkey.aws.pinpoint.admmessage/ImageIconUrl :portkey.aws.pinpoint/Action :portkey.aws.pinpoint.admmessage/MD5] :locations {}))

(clojure.spec.alpha/def :portkey.aws.pinpoint.segment-dimensions/attributes (clojure.spec.alpha/and :portkey.aws.pinpoint/map-of-attribute-dimension))
(clojure.spec.alpha/def :portkey.aws.pinpoint.segment-dimensions/behavior (clojure.spec.alpha/and :portkey.aws.pinpoint/segment-behaviors))
(clojure.spec.alpha/def :portkey.aws.pinpoint.segment-dimensions/demographic (clojure.spec.alpha/and :portkey.aws.pinpoint/segment-demographics))
(clojure.spec.alpha/def :portkey.aws.pinpoint.segment-dimensions/location (clojure.spec.alpha/and :portkey.aws.pinpoint/segment-location))
(clojure.spec.alpha/def :portkey.aws.pinpoint.segment-dimensions/user-attributes (clojure.spec.alpha/and :portkey.aws.pinpoint/map-of-attribute-dimension))
(clojure.spec.alpha/def :portkey.aws.pinpoint/segment-dimensions (portkey.aws/json-keys :req-un [] :opt-un [:portkey.aws.pinpoint.segment-dimensions/Attributes :portkey.aws.pinpoint.segment-dimensions/Behavior :portkey.aws.pinpoint.segment-dimensions/Demographic :portkey.aws.pinpoint.segment-dimensions/Location :portkey.aws.pinpoint.segment-dimensions/UserAttributes] :locations {}))

(clojure.spec.alpha/def :portkey.aws.pinpoint.get-email-channel-request/application-id (clojure.spec.alpha/and :portkey.aws.pinpoint/--string))
(clojure.spec.alpha/def :portkey.aws.pinpoint/get-email-channel-request (portkey.aws/json-keys :req-un [:portkey.aws.pinpoint.get-email-channel-request/ApplicationId] :opt-un [] :locations {}))

(clojure.spec.alpha/def :portkey.aws.pinpoint/delete-endpoint-response (portkey.aws/json-keys :req-un [:portkey.aws.pinpoint/EndpointResponse] :opt-un [] :locations {}))

(clojure.spec.alpha/def :portkey.aws.pinpoint.default-message/body (clojure.spec.alpha/and :portkey.aws.pinpoint/--string))
(clojure.spec.alpha/def :portkey.aws.pinpoint.default-message/substitutions (clojure.spec.alpha/and :portkey.aws.pinpoint/map-of-list-of--string))
(clojure.spec.alpha/def :portkey.aws.pinpoint/default-message (portkey.aws/json-keys :req-un [] :opt-un [:portkey.aws.pinpoint.default-message/Body :portkey.aws.pinpoint.default-message/Substitutions] :locations {}))

(clojure.spec.alpha/def :portkey.aws.pinpoint.message/body (clojure.spec.alpha/and :portkey.aws.pinpoint/--string))
(clojure.spec.alpha/def :portkey.aws.pinpoint.message/image-url (clojure.spec.alpha/and :portkey.aws.pinpoint/--string))
(clojure.spec.alpha/def :portkey.aws.pinpoint.message/title (clojure.spec.alpha/and :portkey.aws.pinpoint/--string))
(clojure.spec.alpha/def :portkey.aws.pinpoint.message/silent-push (clojure.spec.alpha/and :portkey.aws.pinpoint/--boolean))
(clojure.spec.alpha/def :portkey.aws.pinpoint.message/raw-content (clojure.spec.alpha/and :portkey.aws.pinpoint/--string))
(clojure.spec.alpha/def :portkey.aws.pinpoint.message/url (clojure.spec.alpha/and :portkey.aws.pinpoint/--string))
(clojure.spec.alpha/def :portkey.aws.pinpoint.message/json-body (clojure.spec.alpha/and :portkey.aws.pinpoint/--string))
(clojure.spec.alpha/def :portkey.aws.pinpoint.message/image-small-icon-url (clojure.spec.alpha/and :portkey.aws.pinpoint/--string))
(clojure.spec.alpha/def :portkey.aws.pinpoint.message/media-url (clojure.spec.alpha/and :portkey.aws.pinpoint/--string))
(clojure.spec.alpha/def :portkey.aws.pinpoint.message/image-icon-url (clojure.spec.alpha/and :portkey.aws.pinpoint/--string))
(clojure.spec.alpha/def :portkey.aws.pinpoint/message (portkey.aws/json-keys :req-un [] :opt-un [:portkey.aws.pinpoint.message/Body :portkey.aws.pinpoint.message/ImageUrl :portkey.aws.pinpoint.message/Title :portkey.aws.pinpoint.message/SilentPush :portkey.aws.pinpoint.message/RawContent :portkey.aws.pinpoint.message/Url :portkey.aws.pinpoint.message/JsonBody :portkey.aws.pinpoint.message/ImageSmallIconUrl :portkey.aws.pinpoint.message/MediaUrl :portkey.aws.pinpoint.message/ImageIconUrl :portkey.aws.pinpoint/Action] :locations {}))

(clojure.spec.alpha/def :portkey.aws.pinpoint/map-of-address-configuration (clojure.spec.alpha/map-of :portkey.aws.pinpoint/--string :portkey.aws.pinpoint/address-configuration))

(clojure.spec.alpha/def :portkey.aws.pinpoint.update-endpoints-batch-request/application-id (clojure.spec.alpha/and :portkey.aws.pinpoint/--string))
(clojure.spec.alpha/def :portkey.aws.pinpoint/update-endpoints-batch-request (portkey.aws/json-keys :req-un [:portkey.aws.pinpoint.update-endpoints-batch-request/ApplicationId :portkey.aws.pinpoint/EndpointBatchRequest] :opt-un [] :locations {}))

(clojure.spec.alpha/def :portkey.aws.pinpoint.apnschannel-request/bundle-id (clojure.spec.alpha/and :portkey.aws.pinpoint/--string))
(clojure.spec.alpha/def :portkey.aws.pinpoint.apnschannel-request/certificate (clojure.spec.alpha/and :portkey.aws.pinpoint/--string))
(clojure.spec.alpha/def :portkey.aws.pinpoint.apnschannel-request/default-authentication-method (clojure.spec.alpha/and :portkey.aws.pinpoint/--string))
(clojure.spec.alpha/def :portkey.aws.pinpoint.apnschannel-request/enabled (clojure.spec.alpha/and :portkey.aws.pinpoint/--boolean))
(clojure.spec.alpha/def :portkey.aws.pinpoint.apnschannel-request/private-key (clojure.spec.alpha/and :portkey.aws.pinpoint/--string))
(clojure.spec.alpha/def :portkey.aws.pinpoint.apnschannel-request/team-id (clojure.spec.alpha/and :portkey.aws.pinpoint/--string))
(clojure.spec.alpha/def :portkey.aws.pinpoint.apnschannel-request/token-key (clojure.spec.alpha/and :portkey.aws.pinpoint/--string))
(clojure.spec.alpha/def :portkey.aws.pinpoint.apnschannel-request/token-key-id (clojure.spec.alpha/and :portkey.aws.pinpoint/--string))
(clojure.spec.alpha/def :portkey.aws.pinpoint/apnschannel-request (portkey.aws/json-keys :req-un [] :opt-un [:portkey.aws.pinpoint.apnschannel-request/BundleId :portkey.aws.pinpoint.apnschannel-request/Certificate :portkey.aws.pinpoint.apnschannel-request/DefaultAuthenticationMethod :portkey.aws.pinpoint.apnschannel-request/Enabled :portkey.aws.pinpoint.apnschannel-request/PrivateKey :portkey.aws.pinpoint.apnschannel-request/TeamId :portkey.aws.pinpoint.apnschannel-request/TokenKey :portkey.aws.pinpoint.apnschannel-request/TokenKeyId] :locations {}))

(clojure.spec.alpha/def :portkey.aws.pinpoint/dimension-type (clojure.spec.alpha/conformer (clojure.core/let [m__13766__auto__ {"INCLUSIVE" "INCLUSIVE", :inclusive "INCLUSIVE", "EXCLUSIVE" "EXCLUSIVE", :exclusive "EXCLUSIVE"}] (clojure.core/fn [s__13767__auto__] (m__13766__auto__ s__13767__auto__ :clojure.spec.alpha/invalid))) (clojure.core/comp clojure.core/keyword portkey.aws/dashed)))

(clojure.spec.alpha/def :portkey.aws.pinpoint.application-settings-resource/application-id (clojure.spec.alpha/and :portkey.aws.pinpoint/--string))
(clojure.spec.alpha/def :portkey.aws.pinpoint.application-settings-resource/last-modified-date (clojure.spec.alpha/and :portkey.aws.pinpoint/--string))
(clojure.spec.alpha/def :portkey.aws.pinpoint.application-settings-resource/limits (clojure.spec.alpha/and :portkey.aws.pinpoint/campaign-limits))
(clojure.spec.alpha/def :portkey.aws.pinpoint/application-settings-resource (portkey.aws/json-keys :req-un [] :opt-un [:portkey.aws.pinpoint.application-settings-resource/ApplicationId :portkey.aws.pinpoint/CampaignHook :portkey.aws.pinpoint.application-settings-resource/LastModifiedDate :portkey.aws.pinpoint.application-settings-resource/Limits :portkey.aws.pinpoint/QuietTime] :locations {}))

(clojure.spec.alpha/def :portkey.aws.pinpoint.campaign-hook/lambda-function-name (clojure.spec.alpha/and :portkey.aws.pinpoint/--string))
(clojure.spec.alpha/def :portkey.aws.pinpoint.campaign-hook/web-url (clojure.spec.alpha/and :portkey.aws.pinpoint/--string))
(clojure.spec.alpha/def :portkey.aws.pinpoint/campaign-hook (portkey.aws/json-keys :req-un [] :opt-un [:portkey.aws.pinpoint.campaign-hook/LambdaFunctionName :portkey.aws.pinpoint/Mode :portkey.aws.pinpoint.campaign-hook/WebUrl] :locations {}))

(clojure.spec.alpha/def :portkey.aws.pinpoint.delete-app-request/application-id (clojure.spec.alpha/and :portkey.aws.pinpoint/--string))
(clojure.spec.alpha/def :portkey.aws.pinpoint/delete-app-request (portkey.aws/json-keys :req-un [:portkey.aws.pinpoint.delete-app-request/ApplicationId] :opt-un [] :locations {}))

(clojure.spec.alpha/def :portkey.aws.pinpoint.put-event-stream-request/application-id (clojure.spec.alpha/and :portkey.aws.pinpoint/--string))
(clojure.spec.alpha/def :portkey.aws.pinpoint/put-event-stream-request (portkey.aws/json-keys :req-un [:portkey.aws.pinpoint.put-event-stream-request/ApplicationId :portkey.aws.pinpoint/WriteEventStream] :opt-un [] :locations {}))

(clojure.spec.alpha/def :portkey.aws.pinpoint.not-found-exception/message (clojure.spec.alpha/and :portkey.aws.pinpoint/--string))
(clojure.spec.alpha/def :portkey.aws.pinpoint.not-found-exception/requestid (clojure.spec.alpha/and :portkey.aws.pinpoint/--string))
(clojure.spec.alpha/def :portkey.aws.pinpoint/not-found-exception (portkey.aws/json-keys :req-un [] :opt-un [:portkey.aws.pinpoint.not-found-exception/Message :portkey.aws.pinpoint.not-found-exception/RequestID] :locations {}))

(clojure.spec.alpha/def :portkey.aws.pinpoint.get-campaign-versions-request/application-id (clojure.spec.alpha/and :portkey.aws.pinpoint/--string))
(clojure.spec.alpha/def :portkey.aws.pinpoint.get-campaign-versions-request/campaign-id (clojure.spec.alpha/and :portkey.aws.pinpoint/--string))
(clojure.spec.alpha/def :portkey.aws.pinpoint.get-campaign-versions-request/page-size (clojure.spec.alpha/and :portkey.aws.pinpoint/--string))
(clojure.spec.alpha/def :portkey.aws.pinpoint.get-campaign-versions-request/token (clojure.spec.alpha/and :portkey.aws.pinpoint/--string))
(clojure.spec.alpha/def :portkey.aws.pinpoint/get-campaign-versions-request (portkey.aws/json-keys :req-un [:portkey.aws.pinpoint.get-campaign-versions-request/ApplicationId :portkey.aws.pinpoint.get-campaign-versions-request/CampaignId] :opt-un [:portkey.aws.pinpoint.get-campaign-versions-request/PageSize :portkey.aws.pinpoint.get-campaign-versions-request/Token] :locations {}))

(clojure.spec.alpha/def :portkey.aws.pinpoint/duration (clojure.spec.alpha/conformer (clojure.core/let [m__13766__auto__ {"HR_24" "HR_24", :hr-24 "HR_24", "DAY_7" "DAY_7", :day-7 "DAY_7", "DAY_14" "DAY_14", :day-14 "DAY_14", "DAY_30" "DAY_30", :day-30 "DAY_30"}] (clojure.core/fn [s__13767__auto__] (m__13766__auto__ s__13767__auto__ :clojure.spec.alpha/invalid))) (clojure.core/comp clojure.core/keyword portkey.aws/dashed)))

(clojure.spec.alpha/def :portkey.aws.pinpoint/update-gcm-channel-response (portkey.aws/json-keys :req-un [:portkey.aws.pinpoint/GCMChannelResponse] :opt-un [] :locations {}))

(clojure.spec.alpha/def :portkey.aws.pinpoint.delete-email-channel-request/application-id (clojure.spec.alpha/and :portkey.aws.pinpoint/--string))
(clojure.spec.alpha/def :portkey.aws.pinpoint/delete-email-channel-request (portkey.aws/json-keys :req-un [:portkey.aws.pinpoint.delete-email-channel-request/ApplicationId] :opt-un [] :locations {}))

(clojure.spec.alpha/def :portkey.aws.pinpoint.get-segment-version-request/application-id (clojure.spec.alpha/and :portkey.aws.pinpoint/--string))
(clojure.spec.alpha/def :portkey.aws.pinpoint.get-segment-version-request/segment-id (clojure.spec.alpha/and :portkey.aws.pinpoint/--string))
(clojure.spec.alpha/def :portkey.aws.pinpoint.get-segment-version-request/version (clojure.spec.alpha/and :portkey.aws.pinpoint/--string))
(clojure.spec.alpha/def :portkey.aws.pinpoint/get-segment-version-request (portkey.aws/json-keys :req-un [:portkey.aws.pinpoint.get-segment-version-request/SegmentId :portkey.aws.pinpoint.get-segment-version-request/Version :portkey.aws.pinpoint.get-segment-version-request/ApplicationId] :opt-un [] :locations {}))

(clojure.spec.alpha/def :portkey.aws.pinpoint.write-segment-request/dimensions (clojure.spec.alpha/and :portkey.aws.pinpoint/segment-dimensions))
(clojure.spec.alpha/def :portkey.aws.pinpoint.write-segment-request/name (clojure.spec.alpha/and :portkey.aws.pinpoint/--string))
(clojure.spec.alpha/def :portkey.aws.pinpoint/write-segment-request (portkey.aws/json-keys :req-un [] :opt-un [:portkey.aws.pinpoint.write-segment-request/Dimensions :portkey.aws.pinpoint.write-segment-request/Name] :locations {}))

(clojure.spec.alpha/def :portkey.aws.pinpoint/update-apns-voip-channel-response (portkey.aws/json-keys :req-un [:portkey.aws.pinpoint/APNSVoipChannelResponse] :opt-un [] :locations {}))

(clojure.spec.alpha/def :portkey.aws.pinpoint.get-export-jobs-request/application-id (clojure.spec.alpha/and :portkey.aws.pinpoint/--string))
(clojure.spec.alpha/def :portkey.aws.pinpoint.get-export-jobs-request/page-size (clojure.spec.alpha/and :portkey.aws.pinpoint/--string))
(clojure.spec.alpha/def :portkey.aws.pinpoint.get-export-jobs-request/token (clojure.spec.alpha/and :portkey.aws.pinpoint/--string))
(clojure.spec.alpha/def :portkey.aws.pinpoint/get-export-jobs-request (portkey.aws/json-keys :req-un [:portkey.aws.pinpoint.get-export-jobs-request/ApplicationId] :opt-un [:portkey.aws.pinpoint.get-export-jobs-request/PageSize :portkey.aws.pinpoint.get-export-jobs-request/Token] :locations {}))

(clojure.spec.alpha/def :portkey.aws.pinpoint/get-campaign-response (portkey.aws/json-keys :req-un [:portkey.aws.pinpoint/CampaignResponse] :opt-un [] :locations {}))

(clojure.spec.alpha/def :portkey.aws.pinpoint.update-application-settings-request/application-id (clojure.spec.alpha/and :portkey.aws.pinpoint/--string))
(clojure.spec.alpha/def :portkey.aws.pinpoint/update-application-settings-request (portkey.aws/json-keys :req-un [:portkey.aws.pinpoint.update-application-settings-request/ApplicationId :portkey.aws.pinpoint/WriteApplicationSettingsRequest] :opt-un [] :locations {}))

(clojure.spec.alpha/def :portkey.aws.pinpoint/delete-gcm-channel-response (portkey.aws/json-keys :req-un [:portkey.aws.pinpoint/GCMChannelResponse] :opt-un [] :locations {}))

(clojure.spec.alpha/def :portkey.aws.pinpoint/map-of-attribute-dimension (clojure.spec.alpha/map-of :portkey.aws.pinpoint/--string :portkey.aws.pinpoint/attribute-dimension))

(clojure.spec.alpha/def :portkey.aws.pinpoint.delete-segment-request/application-id (clojure.spec.alpha/and :portkey.aws.pinpoint/--string))
(clojure.spec.alpha/def :portkey.aws.pinpoint.delete-segment-request/segment-id (clojure.spec.alpha/and :portkey.aws.pinpoint/--string))
(clojure.spec.alpha/def :portkey.aws.pinpoint/delete-segment-request (portkey.aws/json-keys :req-un [:portkey.aws.pinpoint.delete-segment-request/SegmentId :portkey.aws.pinpoint.delete-segment-request/ApplicationId] :opt-un [] :locations {}))

(clojure.spec.alpha/def :portkey.aws.pinpoint.get-app-request/application-id (clojure.spec.alpha/and :portkey.aws.pinpoint/--string))
(clojure.spec.alpha/def :portkey.aws.pinpoint/get-app-request (portkey.aws/json-keys :req-un [:portkey.aws.pinpoint.get-app-request/ApplicationId] :opt-un [] :locations {}))

(clojure.spec.alpha/def :portkey.aws.pinpoint.endpoint-request/address (clojure.spec.alpha/and :portkey.aws.pinpoint/--string))
(clojure.spec.alpha/def :portkey.aws.pinpoint.endpoint-request/endpoint-status (clojure.spec.alpha/and :portkey.aws.pinpoint/--string))
(clojure.spec.alpha/def :portkey.aws.pinpoint.endpoint-request/request-id (clojure.spec.alpha/and :portkey.aws.pinpoint/--string))
(clojure.spec.alpha/def :portkey.aws.pinpoint.endpoint-request/location (clojure.spec.alpha/and :portkey.aws.pinpoint/endpoint-location))
(clojure.spec.alpha/def :portkey.aws.pinpoint.endpoint-request/demographic (clojure.spec.alpha/and :portkey.aws.pinpoint/endpoint-demographic))
(clojure.spec.alpha/def :portkey.aws.pinpoint.endpoint-request/user (clojure.spec.alpha/and :portkey.aws.pinpoint/endpoint-user))
(clojure.spec.alpha/def :portkey.aws.pinpoint.endpoint-request/attributes (clojure.spec.alpha/and :portkey.aws.pinpoint/map-of-list-of--string))
(clojure.spec.alpha/def :portkey.aws.pinpoint.endpoint-request/effective-date (clojure.spec.alpha/and :portkey.aws.pinpoint/--string))
(clojure.spec.alpha/def :portkey.aws.pinpoint.endpoint-request/opt-out (clojure.spec.alpha/and :portkey.aws.pinpoint/--string))
(clojure.spec.alpha/def :portkey.aws.pinpoint.endpoint-request/metrics (clojure.spec.alpha/and :portkey.aws.pinpoint/map-of--double))
(clojure.spec.alpha/def :portkey.aws.pinpoint/endpoint-request (portkey.aws/json-keys :req-un [] :opt-un [:portkey.aws.pinpoint.endpoint-request/Address :portkey.aws.pinpoint.endpoint-request/EndpointStatus :portkey.aws.pinpoint.endpoint-request/RequestId :portkey.aws.pinpoint.endpoint-request/Location :portkey.aws.pinpoint.endpoint-request/Demographic :portkey.aws.pinpoint.endpoint-request/User :portkey.aws.pinpoint.endpoint-request/Attributes :portkey.aws.pinpoint.endpoint-request/EffectiveDate :portkey.aws.pinpoint.endpoint-request/OptOut :portkey.aws.pinpoint/ChannelType :portkey.aws.pinpoint.endpoint-request/Metrics] :locations {}))

(clojure.spec.alpha/def :portkey.aws.pinpoint.endpoint-batch-request/item (clojure.spec.alpha/and :portkey.aws.pinpoint/list-of-endpoint-batch-item))
(clojure.spec.alpha/def :portkey.aws.pinpoint/endpoint-batch-request (portkey.aws/json-keys :req-un [] :opt-un [:portkey.aws.pinpoint.endpoint-batch-request/Item] :locations {}))

(clojure.spec.alpha/def :portkey.aws.pinpoint.smschannel-request/enabled (clojure.spec.alpha/and :portkey.aws.pinpoint/--boolean))
(clojure.spec.alpha/def :portkey.aws.pinpoint.smschannel-request/sender-id (clojure.spec.alpha/and :portkey.aws.pinpoint/--string))
(clojure.spec.alpha/def :portkey.aws.pinpoint.smschannel-request/short-code (clojure.spec.alpha/and :portkey.aws.pinpoint/--string))
(clojure.spec.alpha/def :portkey.aws.pinpoint/smschannel-request (portkey.aws/json-keys :req-un [] :opt-un [:portkey.aws.pinpoint.smschannel-request/Enabled :portkey.aws.pinpoint.smschannel-request/SenderId :portkey.aws.pinpoint.smschannel-request/ShortCode] :locations {}))

(clojure.spec.alpha/def :portkey.aws.pinpoint/get-segment-version-response (portkey.aws/json-keys :req-un [:portkey.aws.pinpoint/SegmentResponse] :opt-un [] :locations {}))

(clojure.spec.alpha/def :portkey.aws.pinpoint/recency-dimension (portkey.aws/json-keys :req-un [] :opt-un [:portkey.aws.pinpoint/Duration :portkey.aws.pinpoint/RecencyType] :locations {}))

(clojure.spec.alpha/def :portkey.aws.pinpoint.address-configuration/body-override (clojure.spec.alpha/and :portkey.aws.pinpoint/--string))
(clojure.spec.alpha/def :portkey.aws.pinpoint.address-configuration/context (clojure.spec.alpha/and :portkey.aws.pinpoint/map-of--string))
(clojure.spec.alpha/def :portkey.aws.pinpoint.address-configuration/raw-content (clojure.spec.alpha/and :portkey.aws.pinpoint/--string))
(clojure.spec.alpha/def :portkey.aws.pinpoint.address-configuration/substitutions (clojure.spec.alpha/and :portkey.aws.pinpoint/map-of-list-of--string))
(clojure.spec.alpha/def :portkey.aws.pinpoint.address-configuration/title-override (clojure.spec.alpha/and :portkey.aws.pinpoint/--string))
(clojure.spec.alpha/def :portkey.aws.pinpoint/address-configuration (portkey.aws/json-keys :req-un [] :opt-un [:portkey.aws.pinpoint.address-configuration/BodyOverride :portkey.aws.pinpoint/ChannelType :portkey.aws.pinpoint.address-configuration/Context :portkey.aws.pinpoint.address-configuration/RawContent :portkey.aws.pinpoint.address-configuration/Substitutions :portkey.aws.pinpoint.address-configuration/TitleOverride] :locations {}))

(clojure.spec.alpha/def :portkey.aws.pinpoint/put-event-stream-response (portkey.aws/json-keys :req-un [:portkey.aws.pinpoint/EventStream] :opt-un [] :locations {}))

(clojure.spec.alpha/def :portkey.aws.pinpoint/update-apns-channel-response (portkey.aws/json-keys :req-un [:portkey.aws.pinpoint/APNSChannelResponse] :opt-un [] :locations {}))

(clojure.spec.alpha/def :portkey.aws.pinpoint.endpoint-batch-item/address (clojure.spec.alpha/and :portkey.aws.pinpoint/--string))
(clojure.spec.alpha/def :portkey.aws.pinpoint.endpoint-batch-item/endpoint-status (clojure.spec.alpha/and :portkey.aws.pinpoint/--string))
(clojure.spec.alpha/def :portkey.aws.pinpoint.endpoint-batch-item/request-id (clojure.spec.alpha/and :portkey.aws.pinpoint/--string))
(clojure.spec.alpha/def :portkey.aws.pinpoint.endpoint-batch-item/location (clojure.spec.alpha/and :portkey.aws.pinpoint/endpoint-location))
(clojure.spec.alpha/def :portkey.aws.pinpoint.endpoint-batch-item/demographic (clojure.spec.alpha/and :portkey.aws.pinpoint/endpoint-demographic))
(clojure.spec.alpha/def :portkey.aws.pinpoint.endpoint-batch-item/user (clojure.spec.alpha/and :portkey.aws.pinpoint/endpoint-user))
(clojure.spec.alpha/def :portkey.aws.pinpoint.endpoint-batch-item/attributes (clojure.spec.alpha/and :portkey.aws.pinpoint/map-of-list-of--string))
(clojure.spec.alpha/def :portkey.aws.pinpoint.endpoint-batch-item/effective-date (clojure.spec.alpha/and :portkey.aws.pinpoint/--string))
(clojure.spec.alpha/def :portkey.aws.pinpoint.endpoint-batch-item/opt-out (clojure.spec.alpha/and :portkey.aws.pinpoint/--string))
(clojure.spec.alpha/def :portkey.aws.pinpoint.endpoint-batch-item/id (clojure.spec.alpha/and :portkey.aws.pinpoint/--string))
(clojure.spec.alpha/def :portkey.aws.pinpoint.endpoint-batch-item/metrics (clojure.spec.alpha/and :portkey.aws.pinpoint/map-of--double))
(clojure.spec.alpha/def :portkey.aws.pinpoint/endpoint-batch-item (portkey.aws/json-keys :req-un [] :opt-un [:portkey.aws.pinpoint.endpoint-batch-item/Address :portkey.aws.pinpoint.endpoint-batch-item/EndpointStatus :portkey.aws.pinpoint.endpoint-batch-item/RequestId :portkey.aws.pinpoint.endpoint-batch-item/Location :portkey.aws.pinpoint.endpoint-batch-item/Demographic :portkey.aws.pinpoint.endpoint-batch-item/User :portkey.aws.pinpoint.endpoint-batch-item/Attributes :portkey.aws.pinpoint.endpoint-batch-item/EffectiveDate :portkey.aws.pinpoint.endpoint-batch-item/OptOut :portkey.aws.pinpoint.endpoint-batch-item/Id :portkey.aws.pinpoint/ChannelType :portkey.aws.pinpoint.endpoint-batch-item/Metrics] :locations {}))

(clojure.spec.alpha/def :portkey.aws.pinpoint.get-application-settings-request/application-id (clojure.spec.alpha/and :portkey.aws.pinpoint/--string))
(clojure.spec.alpha/def :portkey.aws.pinpoint/get-application-settings-request (portkey.aws/json-keys :req-un [:portkey.aws.pinpoint.get-application-settings-request/ApplicationId] :opt-un [] :locations {}))

(clojure.spec.alpha/def :portkey.aws.pinpoint/create-import-job-response (portkey.aws/json-keys :req-un [:portkey.aws.pinpoint/ImportJobResponse] :opt-un [] :locations {}))

(clojure.spec.alpha/def :portkey.aws.pinpoint/list-of-write-treatment-resource (clojure.spec.alpha/and (clojure.spec.alpha/coll-of :portkey.aws.pinpoint/write-treatment-resource) (clojure.spec.alpha/conformer clojure.core/identity (fn* [p1__13687__13688__auto__] (if (clojure.core/sequential? p1__13687__13688__auto__) p1__13687__13688__auto__ [p1__13687__13688__auto__])))))

(clojure.spec.alpha/def :portkey.aws.pinpoint.write-treatment-resource/size-percent (clojure.spec.alpha/and :portkey.aws.pinpoint/--integer))
(clojure.spec.alpha/def :portkey.aws.pinpoint.write-treatment-resource/treatment-description (clojure.spec.alpha/and :portkey.aws.pinpoint/--string))
(clojure.spec.alpha/def :portkey.aws.pinpoint.write-treatment-resource/treatment-name (clojure.spec.alpha/and :portkey.aws.pinpoint/--string))
(clojure.spec.alpha/def :portkey.aws.pinpoint/write-treatment-resource (portkey.aws/json-keys :req-un [] :opt-un [:portkey.aws.pinpoint/MessageConfiguration :portkey.aws.pinpoint/Schedule :portkey.aws.pinpoint.write-treatment-resource/SizePercent :portkey.aws.pinpoint.write-treatment-resource/TreatmentDescription :portkey.aws.pinpoint.write-treatment-resource/TreatmentName] :locations {}))

(clojure.spec.alpha/def :portkey.aws.pinpoint.event-stream/application-id (clojure.spec.alpha/and :portkey.aws.pinpoint/--string))
(clojure.spec.alpha/def :portkey.aws.pinpoint.event-stream/destination-stream-arn (clojure.spec.alpha/and :portkey.aws.pinpoint/--string))
(clojure.spec.alpha/def :portkey.aws.pinpoint.event-stream/external-id (clojure.spec.alpha/and :portkey.aws.pinpoint/--string))
(clojure.spec.alpha/def :portkey.aws.pinpoint.event-stream/last-modified-date (clojure.spec.alpha/and :portkey.aws.pinpoint/--string))
(clojure.spec.alpha/def :portkey.aws.pinpoint.event-stream/last-updated-by (clojure.spec.alpha/and :portkey.aws.pinpoint/--string))
(clojure.spec.alpha/def :portkey.aws.pinpoint.event-stream/role-arn (clojure.spec.alpha/and :portkey.aws.pinpoint/--string))
(clojure.spec.alpha/def :portkey.aws.pinpoint/event-stream (portkey.aws/json-keys :req-un [] :opt-un [:portkey.aws.pinpoint.event-stream/ApplicationId :portkey.aws.pinpoint.event-stream/DestinationStreamArn :portkey.aws.pinpoint.event-stream/ExternalId :portkey.aws.pinpoint.event-stream/LastModifiedDate :portkey.aws.pinpoint.event-stream/LastUpdatedBy :portkey.aws.pinpoint.event-stream/RoleArn] :locations {}))

(clojure.spec.alpha/def :portkey.aws.pinpoint.get-segment-versions-request/application-id (clojure.spec.alpha/and :portkey.aws.pinpoint/--string))
(clojure.spec.alpha/def :portkey.aws.pinpoint.get-segment-versions-request/page-size (clojure.spec.alpha/and :portkey.aws.pinpoint/--string))
(clojure.spec.alpha/def :portkey.aws.pinpoint.get-segment-versions-request/segment-id (clojure.spec.alpha/and :portkey.aws.pinpoint/--string))
(clojure.spec.alpha/def :portkey.aws.pinpoint.get-segment-versions-request/token (clojure.spec.alpha/and :portkey.aws.pinpoint/--string))
(clojure.spec.alpha/def :portkey.aws.pinpoint/get-segment-versions-request (portkey.aws/json-keys :req-un [:portkey.aws.pinpoint.get-segment-versions-request/SegmentId :portkey.aws.pinpoint.get-segment-versions-request/ApplicationId] :opt-un [:portkey.aws.pinpoint.get-segment-versions-request/PageSize :portkey.aws.pinpoint.get-segment-versions-request/Token] :locations {}))

(clojure.spec.alpha/def :portkey.aws.pinpoint/delete-email-channel-response (portkey.aws/json-keys :req-un [:portkey.aws.pinpoint/EmailChannelResponse] :opt-un [] :locations {}))

(clojure.spec.alpha/def :portkey.aws.pinpoint/get-segment-export-jobs-response (portkey.aws/json-keys :req-un [:portkey.aws.pinpoint/ExportJobsResponse] :opt-un [] :locations {}))

(clojure.spec.alpha/def :portkey.aws.pinpoint.smsmessage/body (clojure.spec.alpha/and :portkey.aws.pinpoint/--string))
(clojure.spec.alpha/def :portkey.aws.pinpoint.smsmessage/origination-number (clojure.spec.alpha/and :portkey.aws.pinpoint/--string))
(clojure.spec.alpha/def :portkey.aws.pinpoint.smsmessage/sender-id (clojure.spec.alpha/and :portkey.aws.pinpoint/--string))
(clojure.spec.alpha/def :portkey.aws.pinpoint.smsmessage/substitutions (clojure.spec.alpha/and :portkey.aws.pinpoint/map-of-list-of--string))
(clojure.spec.alpha/def :portkey.aws.pinpoint/smsmessage (portkey.aws/json-keys :req-un [] :opt-un [:portkey.aws.pinpoint.smsmessage/Body :portkey.aws.pinpoint/MessageType :portkey.aws.pinpoint.smsmessage/OriginationNumber :portkey.aws.pinpoint.smsmessage/SenderId :portkey.aws.pinpoint.smsmessage/Substitutions] :locations {}))

(clojure.spec.alpha/def :portkey.aws.pinpoint.get-apps-request/page-size (clojure.spec.alpha/and :portkey.aws.pinpoint/--string))
(clojure.spec.alpha/def :portkey.aws.pinpoint.get-apps-request/token (clojure.spec.alpha/and :portkey.aws.pinpoint/--string))
(clojure.spec.alpha/def :portkey.aws.pinpoint/get-apps-request (portkey.aws/json-keys :req-un [] :opt-un [:portkey.aws.pinpoint.get-apps-request/PageSize :portkey.aws.pinpoint.get-apps-request/Token] :locations {}))

(clojure.spec.alpha/def :portkey.aws.pinpoint.send-users-messages-request/application-id (clojure.spec.alpha/and :portkey.aws.pinpoint/--string))
(clojure.spec.alpha/def :portkey.aws.pinpoint/send-users-messages-request (portkey.aws/json-keys :req-un [:portkey.aws.pinpoint.send-users-messages-request/ApplicationId :portkey.aws.pinpoint/SendUsersMessageRequest] :opt-un [] :locations {}))

(clojure.spec.alpha/def :portkey.aws.pinpoint.get-campaigns-request/application-id (clojure.spec.alpha/and :portkey.aws.pinpoint/--string))
(clojure.spec.alpha/def :portkey.aws.pinpoint.get-campaigns-request/page-size (clojure.spec.alpha/and :portkey.aws.pinpoint/--string))
(clojure.spec.alpha/def :portkey.aws.pinpoint.get-campaigns-request/token (clojure.spec.alpha/and :portkey.aws.pinpoint/--string))
(clojure.spec.alpha/def :portkey.aws.pinpoint/get-campaigns-request (portkey.aws/json-keys :req-un [:portkey.aws.pinpoint.get-campaigns-request/ApplicationId] :opt-un [:portkey.aws.pinpoint.get-campaigns-request/PageSize :portkey.aws.pinpoint.get-campaigns-request/Token] :locations {}))

(clojure.spec.alpha/def :portkey.aws.pinpoint.campaign-email-message/body (clojure.spec.alpha/and :portkey.aws.pinpoint/--string))
(clojure.spec.alpha/def :portkey.aws.pinpoint.campaign-email-message/from-address (clojure.spec.alpha/and :portkey.aws.pinpoint/--string))
(clojure.spec.alpha/def :portkey.aws.pinpoint.campaign-email-message/html-body (clojure.spec.alpha/and :portkey.aws.pinpoint/--string))
(clojure.spec.alpha/def :portkey.aws.pinpoint.campaign-email-message/title (clojure.spec.alpha/and :portkey.aws.pinpoint/--string))
(clojure.spec.alpha/def :portkey.aws.pinpoint/campaign-email-message (portkey.aws/json-keys :req-un [] :opt-un [:portkey.aws.pinpoint.campaign-email-message/Body :portkey.aws.pinpoint.campaign-email-message/FromAddress :portkey.aws.pinpoint.campaign-email-message/HtmlBody :portkey.aws.pinpoint.campaign-email-message/Title] :locations {}))

(clojure.spec.alpha/def :portkey.aws.pinpoint/list-of-import-job-response (clojure.spec.alpha/and (clojure.spec.alpha/coll-of :portkey.aws.pinpoint/import-job-response) (clojure.spec.alpha/conformer clojure.core/identity (fn* [p1__13687__13688__auto__] (if (clojure.core/sequential? p1__13687__13688__auto__) p1__13687__13688__auto__ [p1__13687__13688__auto__])))))

(clojure.spec.alpha/def :portkey.aws.pinpoint.message-configuration/admmessage (clojure.spec.alpha/and :portkey.aws.pinpoint/message))
(clojure.spec.alpha/def :portkey.aws.pinpoint.message-configuration/apnsmessage (clojure.spec.alpha/and :portkey.aws.pinpoint/message))
(clojure.spec.alpha/def :portkey.aws.pinpoint.message-configuration/baidu-message (clojure.spec.alpha/and :portkey.aws.pinpoint/message))
(clojure.spec.alpha/def :portkey.aws.pinpoint.message-configuration/default-message (clojure.spec.alpha/and :portkey.aws.pinpoint/message))
(clojure.spec.alpha/def :portkey.aws.pinpoint.message-configuration/email-message (clojure.spec.alpha/and :portkey.aws.pinpoint/campaign-email-message))
(clojure.spec.alpha/def :portkey.aws.pinpoint.message-configuration/gcmmessage (clojure.spec.alpha/and :portkey.aws.pinpoint/message))
(clojure.spec.alpha/def :portkey.aws.pinpoint.message-configuration/smsmessage (clojure.spec.alpha/and :portkey.aws.pinpoint/campaign-sms-message))
(clojure.spec.alpha/def :portkey.aws.pinpoint/message-configuration (portkey.aws/json-keys :req-un [] :opt-un [:portkey.aws.pinpoint.message-configuration/ADMMessage :portkey.aws.pinpoint.message-configuration/APNSMessage :portkey.aws.pinpoint.message-configuration/BaiduMessage :portkey.aws.pinpoint.message-configuration/DefaultMessage :portkey.aws.pinpoint.message-configuration/EmailMessage :portkey.aws.pinpoint.message-configuration/GCMMessage :portkey.aws.pinpoint.message-configuration/SMSMessage] :locations {}))

(clojure.spec.alpha/def :portkey.aws.pinpoint.get-campaign-activities-request/application-id (clojure.spec.alpha/and :portkey.aws.pinpoint/--string))
(clojure.spec.alpha/def :portkey.aws.pinpoint.get-campaign-activities-request/campaign-id (clojure.spec.alpha/and :portkey.aws.pinpoint/--string))
(clojure.spec.alpha/def :portkey.aws.pinpoint.get-campaign-activities-request/page-size (clojure.spec.alpha/and :portkey.aws.pinpoint/--string))
(clojure.spec.alpha/def :portkey.aws.pinpoint.get-campaign-activities-request/token (clojure.spec.alpha/and :portkey.aws.pinpoint/--string))
(clojure.spec.alpha/def :portkey.aws.pinpoint/get-campaign-activities-request (portkey.aws/json-keys :req-un [:portkey.aws.pinpoint.get-campaign-activities-request/ApplicationId :portkey.aws.pinpoint.get-campaign-activities-request/CampaignId] :opt-un [:portkey.aws.pinpoint.get-campaign-activities-request/PageSize :portkey.aws.pinpoint.get-campaign-activities-request/Token] :locations {}))

(clojure.spec.alpha/def :portkey.aws.pinpoint.create-import-job-request/application-id (clojure.spec.alpha/and :portkey.aws.pinpoint/--string))
(clojure.spec.alpha/def :portkey.aws.pinpoint/create-import-job-request (portkey.aws/json-keys :req-un [:portkey.aws.pinpoint.create-import-job-request/ApplicationId :portkey.aws.pinpoint/ImportJobRequest] :opt-un [] :locations {}))

(clojure.spec.alpha/def :portkey.aws.pinpoint/get-segment-import-jobs-response (portkey.aws/json-keys :req-un [:portkey.aws.pinpoint/ImportJobsResponse] :opt-un [] :locations {}))

(clojure.spec.alpha/def :portkey.aws.pinpoint/message-type (clojure.spec.alpha/conformer (clojure.core/let [m__13766__auto__ {"TRANSACTIONAL" "TRANSACTIONAL", :transactional "TRANSACTIONAL", "PROMOTIONAL" "PROMOTIONAL", :promotional "PROMOTIONAL"}] (clojure.core/fn [s__13767__auto__] (m__13766__auto__ s__13767__auto__ :clojure.spec.alpha/invalid))) (clojure.core/comp clojure.core/keyword portkey.aws/dashed)))

(clojure.spec.alpha/def :portkey.aws.pinpoint/update-campaign-response (portkey.aws/json-keys :req-un [:portkey.aws.pinpoint/CampaignResponse] :opt-un [] :locations {}))

(clojure.spec.alpha/def :portkey.aws.pinpoint/frequency (clojure.spec.alpha/conformer (clojure.core/let [m__13766__auto__ {:daily "DAILY", "ONCE" "ONCE", :monthly "MONTHLY", "MONTHLY" "MONTHLY", "WEEKLY" "WEEKLY", :hourly "HOURLY", :once "ONCE", "DAILY" "DAILY", :weekly "WEEKLY", "HOURLY" "HOURLY"}] (clojure.core/fn [s__13767__auto__] (m__13766__auto__ s__13767__auto__ :clojure.spec.alpha/invalid))) (clojure.core/comp clojure.core/keyword portkey.aws/dashed)))

(clojure.spec.alpha/def :portkey.aws.pinpoint.segment-response/last-modified-date (clojure.spec.alpha/and :portkey.aws.pinpoint/--string))
(clojure.spec.alpha/def :portkey.aws.pinpoint.segment-response/application-id (clojure.spec.alpha/and :portkey.aws.pinpoint/--string))
(clojure.spec.alpha/def :portkey.aws.pinpoint.segment-response/dimensions (clojure.spec.alpha/and :portkey.aws.pinpoint/segment-dimensions))
(clojure.spec.alpha/def :portkey.aws.pinpoint.segment-response/import-definition (clojure.spec.alpha/and :portkey.aws.pinpoint/segment-import-resource))
(clojure.spec.alpha/def :portkey.aws.pinpoint.segment-response/creation-date (clojure.spec.alpha/and :portkey.aws.pinpoint/--string))
(clojure.spec.alpha/def :portkey.aws.pinpoint.segment-response/version (clojure.spec.alpha/and :portkey.aws.pinpoint/--integer))
(clojure.spec.alpha/def :portkey.aws.pinpoint.segment-response/name (clojure.spec.alpha/and :portkey.aws.pinpoint/--string))
(clojure.spec.alpha/def :portkey.aws.pinpoint.segment-response/id (clojure.spec.alpha/and :portkey.aws.pinpoint/--string))
(clojure.spec.alpha/def :portkey.aws.pinpoint/segment-response (portkey.aws/json-keys :req-un [] :opt-un [:portkey.aws.pinpoint/SegmentType :portkey.aws.pinpoint.segment-response/LastModifiedDate :portkey.aws.pinpoint.segment-response/ApplicationId :portkey.aws.pinpoint.segment-response/Dimensions :portkey.aws.pinpoint.segment-response/ImportDefinition :portkey.aws.pinpoint.segment-response/CreationDate :portkey.aws.pinpoint.segment-response/Version :portkey.aws.pinpoint.segment-response/Name :portkey.aws.pinpoint.segment-response/Id] :locations {}))

(clojure.spec.alpha/def :portkey.aws.pinpoint/--double clojure.core/double?)

(clojure.spec.alpha/def :portkey.aws.pinpoint/update-endpoints-batch-response (portkey.aws/json-keys :req-un [:portkey.aws.pinpoint/MessageBody] :opt-un [] :locations {}))

(clojure.spec.alpha/def :portkey.aws.pinpoint/delete-segment-response (portkey.aws/json-keys :req-un [:portkey.aws.pinpoint/SegmentResponse] :opt-un [] :locations {}))

(clojure.spec.alpha/def :portkey.aws.pinpoint/list-of-campaign-response (clojure.spec.alpha/and (clojure.spec.alpha/coll-of :portkey.aws.pinpoint/campaign-response) (clojure.spec.alpha/conformer clojure.core/identity (fn* [p1__13687__13688__auto__] (if (clojure.core/sequential? p1__13687__13688__auto__) p1__13687__13688__auto__ [p1__13687__13688__auto__])))))

(clojure.spec.alpha/def :portkey.aws.pinpoint/get-apns-voip-sandbox-channel-response (portkey.aws/json-keys :req-un [:portkey.aws.pinpoint/APNSVoipSandboxChannelResponse] :opt-un [] :locations {}))

(clojure.spec.alpha/def :portkey.aws.pinpoint.endpoint-response/address (clojure.spec.alpha/and :portkey.aws.pinpoint/--string))
(clojure.spec.alpha/def :portkey.aws.pinpoint.endpoint-response/cohort-id (clojure.spec.alpha/and :portkey.aws.pinpoint/--string))
(clojure.spec.alpha/def :portkey.aws.pinpoint.endpoint-response/endpoint-status (clojure.spec.alpha/and :portkey.aws.pinpoint/--string))
(clojure.spec.alpha/def :portkey.aws.pinpoint.endpoint-response/request-id (clojure.spec.alpha/and :portkey.aws.pinpoint/--string))
(clojure.spec.alpha/def :portkey.aws.pinpoint.endpoint-response/location (clojure.spec.alpha/and :portkey.aws.pinpoint/endpoint-location))
(clojure.spec.alpha/def :portkey.aws.pinpoint.endpoint-response/demographic (clojure.spec.alpha/and :portkey.aws.pinpoint/endpoint-demographic))
(clojure.spec.alpha/def :portkey.aws.pinpoint.endpoint-response/user (clojure.spec.alpha/and :portkey.aws.pinpoint/endpoint-user))
(clojure.spec.alpha/def :portkey.aws.pinpoint.endpoint-response/attributes (clojure.spec.alpha/and :portkey.aws.pinpoint/map-of-list-of--string))
(clojure.spec.alpha/def :portkey.aws.pinpoint.endpoint-response/application-id (clojure.spec.alpha/and :portkey.aws.pinpoint/--string))
(clojure.spec.alpha/def :portkey.aws.pinpoint.endpoint-response/creation-date (clojure.spec.alpha/and :portkey.aws.pinpoint/--string))
(clojure.spec.alpha/def :portkey.aws.pinpoint.endpoint-response/effective-date (clojure.spec.alpha/and :portkey.aws.pinpoint/--string))
(clojure.spec.alpha/def :portkey.aws.pinpoint.endpoint-response/opt-out (clojure.spec.alpha/and :portkey.aws.pinpoint/--string))
(clojure.spec.alpha/def :portkey.aws.pinpoint.endpoint-response/id (clojure.spec.alpha/and :portkey.aws.pinpoint/--string))
(clojure.spec.alpha/def :portkey.aws.pinpoint.endpoint-response/metrics (clojure.spec.alpha/and :portkey.aws.pinpoint/map-of--double))
(clojure.spec.alpha/def :portkey.aws.pinpoint/endpoint-response (portkey.aws/json-keys :req-un [] :opt-un [:portkey.aws.pinpoint.endpoint-response/Address :portkey.aws.pinpoint.endpoint-response/CohortId :portkey.aws.pinpoint.endpoint-response/EndpointStatus :portkey.aws.pinpoint.endpoint-response/RequestId :portkey.aws.pinpoint.endpoint-response/Location :portkey.aws.pinpoint.endpoint-response/Demographic :portkey.aws.pinpoint.endpoint-response/User :portkey.aws.pinpoint.endpoint-response/Attributes :portkey.aws.pinpoint.endpoint-response/ApplicationId :portkey.aws.pinpoint.endpoint-response/CreationDate :portkey.aws.pinpoint.endpoint-response/EffectiveDate :portkey.aws.pinpoint.endpoint-response/OptOut :portkey.aws.pinpoint.endpoint-response/Id :portkey.aws.pinpoint/ChannelType :portkey.aws.pinpoint.endpoint-response/Metrics] :locations {}))

(clojure.spec.alpha/def :portkey.aws.pinpoint.admchannel-request/client-id (clojure.spec.alpha/and :portkey.aws.pinpoint/--string))
(clojure.spec.alpha/def :portkey.aws.pinpoint.admchannel-request/client-secret (clojure.spec.alpha/and :portkey.aws.pinpoint/--string))
(clojure.spec.alpha/def :portkey.aws.pinpoint.admchannel-request/enabled (clojure.spec.alpha/and :portkey.aws.pinpoint/--boolean))
(clojure.spec.alpha/def :portkey.aws.pinpoint/admchannel-request (portkey.aws/json-keys :req-un [] :opt-un [:portkey.aws.pinpoint.admchannel-request/ClientId :portkey.aws.pinpoint.admchannel-request/ClientSecret :portkey.aws.pinpoint.admchannel-request/Enabled] :locations {}))

(clojure.spec.alpha/def :portkey.aws.pinpoint/campaign-status (clojure.spec.alpha/conformer (clojure.core/let [m__13766__auto__ {"COMPLETED" "COMPLETED", :paused "PAUSED", :completed "COMPLETED", "EXECUTING" "EXECUTING", "SCHEDULED" "SCHEDULED", :executing "EXECUTING", :pending-next-run "PENDING_NEXT_RUN", :scheduled "SCHEDULED", "PAUSED" "PAUSED", "PENDING_NEXT_RUN" "PENDING_NEXT_RUN"}] (clojure.core/fn [s__13767__auto__] (m__13766__auto__ s__13767__auto__ :clojure.spec.alpha/invalid))) (clojure.core/comp clojure.core/keyword portkey.aws/dashed)))

(clojure.spec.alpha/def :portkey.aws.pinpoint.update-segment-request/application-id (clojure.spec.alpha/and :portkey.aws.pinpoint/--string))
(clojure.spec.alpha/def :portkey.aws.pinpoint.update-segment-request/segment-id (clojure.spec.alpha/and :portkey.aws.pinpoint/--string))
(clojure.spec.alpha/def :portkey.aws.pinpoint/update-segment-request (portkey.aws/json-keys :req-un [:portkey.aws.pinpoint.update-segment-request/SegmentId :portkey.aws.pinpoint.update-segment-request/ApplicationId :portkey.aws.pinpoint/WriteSegmentRequest] :opt-un [] :locations {}))

(clojure.spec.alpha/def :portkey.aws.pinpoint.applications-response/item (clojure.spec.alpha/and :portkey.aws.pinpoint/list-of-application-response))
(clojure.spec.alpha/def :portkey.aws.pinpoint.applications-response/next-token (clojure.spec.alpha/and :portkey.aws.pinpoint/--string))
(clojure.spec.alpha/def :portkey.aws.pinpoint/applications-response (portkey.aws/json-keys :req-un [] :opt-un [:portkey.aws.pinpoint.applications-response/Item :portkey.aws.pinpoint.applications-response/NextToken] :locations {}))

(clojure.spec.alpha/def :portkey.aws.pinpoint/create-campaign-response (portkey.aws/json-keys :req-un [:portkey.aws.pinpoint/CampaignResponse] :opt-un [] :locations {}))

(clojure.spec.alpha/def :portkey.aws.pinpoint/delete-apns-voip-sandbox-channel-response (portkey.aws/json-keys :req-un [:portkey.aws.pinpoint/APNSVoipSandboxChannelResponse] :opt-un [] :locations {}))

(clojure.spec.alpha/def :portkey.aws.pinpoint/map-of-endpoint-send-configuration (clojure.spec.alpha/map-of :portkey.aws.pinpoint/--string :portkey.aws.pinpoint/endpoint-send-configuration))

(clojure.spec.alpha/def :portkey.aws.pinpoint.delete-sms-channel-request/application-id (clojure.spec.alpha/and :portkey.aws.pinpoint/--string))
(clojure.spec.alpha/def :portkey.aws.pinpoint/delete-sms-channel-request (portkey.aws/json-keys :req-un [:portkey.aws.pinpoint.delete-sms-channel-request/ApplicationId] :opt-un [] :locations {}))

(clojure.spec.alpha/def :portkey.aws.pinpoint/--integer (clojure.spec.alpha/and clojure.core/int?))

(clojure.spec.alpha/def :portkey.aws.pinpoint/get-segment-response (portkey.aws/json-keys :req-un [:portkey.aws.pinpoint/SegmentResponse] :opt-un [] :locations {}))

(clojure.spec.alpha/def :portkey.aws.pinpoint.update-endpoint-request/application-id (clojure.spec.alpha/and :portkey.aws.pinpoint/--string))
(clojure.spec.alpha/def :portkey.aws.pinpoint.update-endpoint-request/endpoint-id (clojure.spec.alpha/and :portkey.aws.pinpoint/--string))
(clojure.spec.alpha/def :portkey.aws.pinpoint/update-endpoint-request (portkey.aws/json-keys :req-un [:portkey.aws.pinpoint.update-endpoint-request/ApplicationId :portkey.aws.pinpoint.update-endpoint-request/EndpointId :portkey.aws.pinpoint/EndpointRequest] :opt-un [] :locations {}))

(clojure.spec.alpha/def :portkey.aws.pinpoint.apnsvoip-channel-request/bundle-id (clojure.spec.alpha/and :portkey.aws.pinpoint/--string))
(clojure.spec.alpha/def :portkey.aws.pinpoint.apnsvoip-channel-request/certificate (clojure.spec.alpha/and :portkey.aws.pinpoint/--string))
(clojure.spec.alpha/def :portkey.aws.pinpoint.apnsvoip-channel-request/default-authentication-method (clojure.spec.alpha/and :portkey.aws.pinpoint/--string))
(clojure.spec.alpha/def :portkey.aws.pinpoint.apnsvoip-channel-request/enabled (clojure.spec.alpha/and :portkey.aws.pinpoint/--boolean))
(clojure.spec.alpha/def :portkey.aws.pinpoint.apnsvoip-channel-request/private-key (clojure.spec.alpha/and :portkey.aws.pinpoint/--string))
(clojure.spec.alpha/def :portkey.aws.pinpoint.apnsvoip-channel-request/team-id (clojure.spec.alpha/and :portkey.aws.pinpoint/--string))
(clojure.spec.alpha/def :portkey.aws.pinpoint.apnsvoip-channel-request/token-key (clojure.spec.alpha/and :portkey.aws.pinpoint/--string))
(clojure.spec.alpha/def :portkey.aws.pinpoint.apnsvoip-channel-request/token-key-id (clojure.spec.alpha/and :portkey.aws.pinpoint/--string))
(clojure.spec.alpha/def :portkey.aws.pinpoint/apnsvoip-channel-request (portkey.aws/json-keys :req-un [] :opt-un [:portkey.aws.pinpoint.apnsvoip-channel-request/BundleId :portkey.aws.pinpoint.apnsvoip-channel-request/Certificate :portkey.aws.pinpoint.apnsvoip-channel-request/DefaultAuthenticationMethod :portkey.aws.pinpoint.apnsvoip-channel-request/Enabled :portkey.aws.pinpoint.apnsvoip-channel-request/PrivateKey :portkey.aws.pinpoint.apnsvoip-channel-request/TeamId :portkey.aws.pinpoint.apnsvoip-channel-request/TokenKey :portkey.aws.pinpoint.apnsvoip-channel-request/TokenKeyId] :locations {}))

(clojure.spec.alpha/def :portkey.aws.pinpoint.schedule/end-time (clojure.spec.alpha/and :portkey.aws.pinpoint/--string))
(clojure.spec.alpha/def :portkey.aws.pinpoint.schedule/is-local-time (clojure.spec.alpha/and :portkey.aws.pinpoint/--boolean))
(clojure.spec.alpha/def :portkey.aws.pinpoint.schedule/start-time (clojure.spec.alpha/and :portkey.aws.pinpoint/--string))
(clojure.spec.alpha/def :portkey.aws.pinpoint.schedule/timezone (clojure.spec.alpha/and :portkey.aws.pinpoint/--string))
(clojure.spec.alpha/def :portkey.aws.pinpoint/schedule (portkey.aws/json-keys :req-un [] :opt-un [:portkey.aws.pinpoint.schedule/EndTime :portkey.aws.pinpoint/Frequency :portkey.aws.pinpoint.schedule/IsLocalTime :portkey.aws.pinpoint/QuietTime :portkey.aws.pinpoint.schedule/StartTime :portkey.aws.pinpoint.schedule/Timezone] :locations {}))

(clojure.spec.alpha/def :portkey.aws.pinpoint.segment-import-resource/channel-counts (clojure.spec.alpha/and :portkey.aws.pinpoint/map-of--integer))
(clojure.spec.alpha/def :portkey.aws.pinpoint.segment-import-resource/external-id (clojure.spec.alpha/and :portkey.aws.pinpoint/--string))
(clojure.spec.alpha/def :portkey.aws.pinpoint.segment-import-resource/role-arn (clojure.spec.alpha/and :portkey.aws.pinpoint/--string))
(clojure.spec.alpha/def :portkey.aws.pinpoint.segment-import-resource/s3-url (clojure.spec.alpha/and :portkey.aws.pinpoint/--string))
(clojure.spec.alpha/def :portkey.aws.pinpoint.segment-import-resource/size (clojure.spec.alpha/and :portkey.aws.pinpoint/--integer))
(clojure.spec.alpha/def :portkey.aws.pinpoint/segment-import-resource (portkey.aws/json-keys :req-un [] :opt-un [:portkey.aws.pinpoint.segment-import-resource/ChannelCounts :portkey.aws.pinpoint.segment-import-resource/ExternalId :portkey.aws.pinpoint/Format :portkey.aws.pinpoint.segment-import-resource/RoleArn :portkey.aws.pinpoint.segment-import-resource/S3Url :portkey.aws.pinpoint.segment-import-resource/Size] :locations {}))

(clojure.spec.alpha/def :portkey.aws.pinpoint/get-export-job-response (portkey.aws/json-keys :req-un [:portkey.aws.pinpoint/ExportJobResponse] :opt-un [] :locations {}))

(clojure.spec.alpha/def :portkey.aws.pinpoint.create-segment-request/application-id (clojure.spec.alpha/and :portkey.aws.pinpoint/--string))
(clojure.spec.alpha/def :portkey.aws.pinpoint/create-segment-request (portkey.aws/json-keys :req-un [:portkey.aws.pinpoint.create-segment-request/ApplicationId :portkey.aws.pinpoint/WriteSegmentRequest] :opt-un [] :locations {}))

(clojure.spec.alpha/def :portkey.aws.pinpoint.get-baidu-channel-request/application-id (clojure.spec.alpha/and :portkey.aws.pinpoint/--string))
(clojure.spec.alpha/def :portkey.aws.pinpoint/get-baidu-channel-request (portkey.aws/json-keys :req-un [:portkey.aws.pinpoint.get-baidu-channel-request/ApplicationId] :opt-un [] :locations {}))

(clojure.spec.alpha/def :portkey.aws.pinpoint.default-push-notification-message/body (clojure.spec.alpha/and :portkey.aws.pinpoint/--string))
(clojure.spec.alpha/def :portkey.aws.pinpoint.default-push-notification-message/data (clojure.spec.alpha/and :portkey.aws.pinpoint/map-of--string))
(clojure.spec.alpha/def :portkey.aws.pinpoint.default-push-notification-message/silent-push (clojure.spec.alpha/and :portkey.aws.pinpoint/--boolean))
(clojure.spec.alpha/def :portkey.aws.pinpoint.default-push-notification-message/substitutions (clojure.spec.alpha/and :portkey.aws.pinpoint/map-of-list-of--string))
(clojure.spec.alpha/def :portkey.aws.pinpoint.default-push-notification-message/title (clojure.spec.alpha/and :portkey.aws.pinpoint/--string))
(clojure.spec.alpha/def :portkey.aws.pinpoint.default-push-notification-message/url (clojure.spec.alpha/and :portkey.aws.pinpoint/--string))
(clojure.spec.alpha/def :portkey.aws.pinpoint/default-push-notification-message (portkey.aws/json-keys :req-un [] :opt-un [:portkey.aws.pinpoint/Action :portkey.aws.pinpoint.default-push-notification-message/Body :portkey.aws.pinpoint.default-push-notification-message/Data :portkey.aws.pinpoint.default-push-notification-message/SilentPush :portkey.aws.pinpoint.default-push-notification-message/Substitutions :portkey.aws.pinpoint.default-push-notification-message/Title :portkey.aws.pinpoint.default-push-notification-message/Url] :locations {}))

(clojure.spec.alpha/def :portkey.aws.pinpoint.apnsmessage/category (clojure.spec.alpha/and :portkey.aws.pinpoint/--string))
(clojure.spec.alpha/def :portkey.aws.pinpoint.apnsmessage/body (clojure.spec.alpha/and :portkey.aws.pinpoint/--string))
(clojure.spec.alpha/def :portkey.aws.pinpoint.apnsmessage/title (clojure.spec.alpha/and :portkey.aws.pinpoint/--string))
(clojure.spec.alpha/def :portkey.aws.pinpoint.apnsmessage/silent-push (clojure.spec.alpha/and :portkey.aws.pinpoint/--boolean))
(clojure.spec.alpha/def :portkey.aws.pinpoint.apnsmessage/sound (clojure.spec.alpha/and :portkey.aws.pinpoint/--string))
(clojure.spec.alpha/def :portkey.aws.pinpoint.apnsmessage/time-to-live (clojure.spec.alpha/and :portkey.aws.pinpoint/--integer))
(clojure.spec.alpha/def :portkey.aws.pinpoint.apnsmessage/priority (clojure.spec.alpha/and :portkey.aws.pinpoint/--string))
(clojure.spec.alpha/def :portkey.aws.pinpoint.apnsmessage/raw-content (clojure.spec.alpha/and :portkey.aws.pinpoint/--string))
(clojure.spec.alpha/def :portkey.aws.pinpoint.apnsmessage/thread-id (clojure.spec.alpha/and :portkey.aws.pinpoint/--string))
(clojure.spec.alpha/def :portkey.aws.pinpoint.apnsmessage/url (clojure.spec.alpha/and :portkey.aws.pinpoint/--string))
(clojure.spec.alpha/def :portkey.aws.pinpoint.apnsmessage/badge (clojure.spec.alpha/and :portkey.aws.pinpoint/--integer))
(clojure.spec.alpha/def :portkey.aws.pinpoint.apnsmessage/substitutions (clojure.spec.alpha/and :portkey.aws.pinpoint/map-of-list-of--string))
(clojure.spec.alpha/def :portkey.aws.pinpoint.apnsmessage/data (clojure.spec.alpha/and :portkey.aws.pinpoint/map-of--string))
(clojure.spec.alpha/def :portkey.aws.pinpoint.apnsmessage/media-url (clojure.spec.alpha/and :portkey.aws.pinpoint/--string))
(clojure.spec.alpha/def :portkey.aws.pinpoint.apnsmessage/collapse-id (clojure.spec.alpha/and :portkey.aws.pinpoint/--string))
(clojure.spec.alpha/def :portkey.aws.pinpoint.apnsmessage/preferred-authentication-method (clojure.spec.alpha/and :portkey.aws.pinpoint/--string))
(clojure.spec.alpha/def :portkey.aws.pinpoint/apnsmessage (portkey.aws/json-keys :req-un [] :opt-un [:portkey.aws.pinpoint.apnsmessage/Category :portkey.aws.pinpoint.apnsmessage/Body :portkey.aws.pinpoint.apnsmessage/Title :portkey.aws.pinpoint.apnsmessage/SilentPush :portkey.aws.pinpoint.apnsmessage/Sound :portkey.aws.pinpoint.apnsmessage/TimeToLive :portkey.aws.pinpoint.apnsmessage/Priority :portkey.aws.pinpoint.apnsmessage/RawContent :portkey.aws.pinpoint.apnsmessage/ThreadId :portkey.aws.pinpoint.apnsmessage/Url :portkey.aws.pinpoint.apnsmessage/Badge :portkey.aws.pinpoint.apnsmessage/Substitutions :portkey.aws.pinpoint.apnsmessage/Data :portkey.aws.pinpoint.apnsmessage/MediaUrl :portkey.aws.pinpoint.apnsmessage/CollapseId :portkey.aws.pinpoint/Action :portkey.aws.pinpoint.apnsmessage/PreferredAuthenticationMethod] :locations {}))

(clojure.spec.alpha/def :portkey.aws.pinpoint/map-of--integer (clojure.spec.alpha/map-of :portkey.aws.pinpoint/--string :portkey.aws.pinpoint/--integer))

(clojure.spec.alpha/def :portkey.aws.pinpoint.email-channel-response/has-credential (clojure.spec.alpha/and :portkey.aws.pinpoint/--boolean))
(clojure.spec.alpha/def :portkey.aws.pinpoint.email-channel-response/platform (clojure.spec.alpha/and :portkey.aws.pinpoint/--string))
(clojure.spec.alpha/def :portkey.aws.pinpoint.email-channel-response/last-modified-date (clojure.spec.alpha/and :portkey.aws.pinpoint/--string))
(clojure.spec.alpha/def :portkey.aws.pinpoint.email-channel-response/role-arn (clojure.spec.alpha/and :portkey.aws.pinpoint/--string))
(clojure.spec.alpha/def :portkey.aws.pinpoint.email-channel-response/enabled (clojure.spec.alpha/and :portkey.aws.pinpoint/--boolean))
(clojure.spec.alpha/def :portkey.aws.pinpoint.email-channel-response/application-id (clojure.spec.alpha/and :portkey.aws.pinpoint/--string))
(clojure.spec.alpha/def :portkey.aws.pinpoint.email-channel-response/is-archived (clojure.spec.alpha/and :portkey.aws.pinpoint/--boolean))
(clojure.spec.alpha/def :portkey.aws.pinpoint.email-channel-response/identity (clojure.spec.alpha/and :portkey.aws.pinpoint/--string))
(clojure.spec.alpha/def :portkey.aws.pinpoint.email-channel-response/creation-date (clojure.spec.alpha/and :portkey.aws.pinpoint/--string))
(clojure.spec.alpha/def :portkey.aws.pinpoint.email-channel-response/from-address (clojure.spec.alpha/and :portkey.aws.pinpoint/--string))
(clojure.spec.alpha/def :portkey.aws.pinpoint.email-channel-response/version (clojure.spec.alpha/and :portkey.aws.pinpoint/--integer))
(clojure.spec.alpha/def :portkey.aws.pinpoint.email-channel-response/last-modified-by (clojure.spec.alpha/and :portkey.aws.pinpoint/--string))
(clojure.spec.alpha/def :portkey.aws.pinpoint.email-channel-response/id (clojure.spec.alpha/and :portkey.aws.pinpoint/--string))
(clojure.spec.alpha/def :portkey.aws.pinpoint/email-channel-response (portkey.aws/json-keys :req-un [] :opt-un [:portkey.aws.pinpoint.email-channel-response/HasCredential :portkey.aws.pinpoint.email-channel-response/Platform :portkey.aws.pinpoint.email-channel-response/LastModifiedDate :portkey.aws.pinpoint.email-channel-response/RoleArn :portkey.aws.pinpoint.email-channel-response/Enabled :portkey.aws.pinpoint.email-channel-response/ApplicationId :portkey.aws.pinpoint.email-channel-response/IsArchived :portkey.aws.pinpoint.email-channel-response/Identity :portkey.aws.pinpoint.email-channel-response/CreationDate :portkey.aws.pinpoint.email-channel-response/FromAddress :portkey.aws.pinpoint.email-channel-response/Version :portkey.aws.pinpoint.email-channel-response/LastModifiedBy :portkey.aws.pinpoint.email-channel-response/Id] :locations {}))

(clojure.spec.alpha/def :portkey.aws.pinpoint/get-import-jobs-response (portkey.aws/json-keys :req-un [:portkey.aws.pinpoint/ImportJobsResponse] :opt-un [] :locations {}))

(clojure.spec.alpha/def :portkey.aws.pinpoint/direct-message-configuration (portkey.aws/json-keys :req-un [] :opt-un [:portkey.aws.pinpoint/ADMMessage :portkey.aws.pinpoint/APNSMessage :portkey.aws.pinpoint/BaiduMessage :portkey.aws.pinpoint/DefaultMessage :portkey.aws.pinpoint/DefaultPushNotificationMessage :portkey.aws.pinpoint/GCMMessage :portkey.aws.pinpoint/SMSMessage] :locations {}))

(clojure.spec.alpha/def :portkey.aws.pinpoint/list-of-application-response (clojure.spec.alpha/and (clojure.spec.alpha/coll-of :portkey.aws.pinpoint/application-response) (clojure.spec.alpha/conformer clojure.core/identity (fn* [p1__13687__13688__auto__] (if (clojure.core/sequential? p1__13687__13688__auto__) p1__13687__13688__auto__ [p1__13687__13688__auto__])))))

(clojure.spec.alpha/def :portkey.aws.pinpoint.apnssandbox-channel-request/bundle-id (clojure.spec.alpha/and :portkey.aws.pinpoint/--string))
(clojure.spec.alpha/def :portkey.aws.pinpoint.apnssandbox-channel-request/certificate (clojure.spec.alpha/and :portkey.aws.pinpoint/--string))
(clojure.spec.alpha/def :portkey.aws.pinpoint.apnssandbox-channel-request/default-authentication-method (clojure.spec.alpha/and :portkey.aws.pinpoint/--string))
(clojure.spec.alpha/def :portkey.aws.pinpoint.apnssandbox-channel-request/enabled (clojure.spec.alpha/and :portkey.aws.pinpoint/--boolean))
(clojure.spec.alpha/def :portkey.aws.pinpoint.apnssandbox-channel-request/private-key (clojure.spec.alpha/and :portkey.aws.pinpoint/--string))
(clojure.spec.alpha/def :portkey.aws.pinpoint.apnssandbox-channel-request/team-id (clojure.spec.alpha/and :portkey.aws.pinpoint/--string))
(clojure.spec.alpha/def :portkey.aws.pinpoint.apnssandbox-channel-request/token-key (clojure.spec.alpha/and :portkey.aws.pinpoint/--string))
(clojure.spec.alpha/def :portkey.aws.pinpoint.apnssandbox-channel-request/token-key-id (clojure.spec.alpha/and :portkey.aws.pinpoint/--string))
(clojure.spec.alpha/def :portkey.aws.pinpoint/apnssandbox-channel-request (portkey.aws/json-keys :req-un [] :opt-un [:portkey.aws.pinpoint.apnssandbox-channel-request/BundleId :portkey.aws.pinpoint.apnssandbox-channel-request/Certificate :portkey.aws.pinpoint.apnssandbox-channel-request/DefaultAuthenticationMethod :portkey.aws.pinpoint.apnssandbox-channel-request/Enabled :portkey.aws.pinpoint.apnssandbox-channel-request/PrivateKey :portkey.aws.pinpoint.apnssandbox-channel-request/TeamId :portkey.aws.pinpoint.apnssandbox-channel-request/TokenKey :portkey.aws.pinpoint.apnssandbox-channel-request/TokenKeyId] :locations {}))

(clojure.spec.alpha/def :portkey.aws.pinpoint.send-users-message-request/context (clojure.spec.alpha/and :portkey.aws.pinpoint/map-of--string))
(clojure.spec.alpha/def :portkey.aws.pinpoint.send-users-message-request/message-configuration (clojure.spec.alpha/and :portkey.aws.pinpoint/direct-message-configuration))
(clojure.spec.alpha/def :portkey.aws.pinpoint.send-users-message-request/users (clojure.spec.alpha/and :portkey.aws.pinpoint/map-of-endpoint-send-configuration))
(clojure.spec.alpha/def :portkey.aws.pinpoint/send-users-message-request (portkey.aws/json-keys :req-un [] :opt-un [:portkey.aws.pinpoint.send-users-message-request/Context :portkey.aws.pinpoint.send-users-message-request/MessageConfiguration :portkey.aws.pinpoint.send-users-message-request/Users] :locations {}))

(clojure.spec.alpha/def :portkey.aws.pinpoint.admchannel-response/has-credential (clojure.spec.alpha/and :portkey.aws.pinpoint/--boolean))
(clojure.spec.alpha/def :portkey.aws.pinpoint.admchannel-response/platform (clojure.spec.alpha/and :portkey.aws.pinpoint/--string))
(clojure.spec.alpha/def :portkey.aws.pinpoint.admchannel-response/last-modified-date (clojure.spec.alpha/and :portkey.aws.pinpoint/--string))
(clojure.spec.alpha/def :portkey.aws.pinpoint.admchannel-response/enabled (clojure.spec.alpha/and :portkey.aws.pinpoint/--boolean))
(clojure.spec.alpha/def :portkey.aws.pinpoint.admchannel-response/application-id (clojure.spec.alpha/and :portkey.aws.pinpoint/--string))
(clojure.spec.alpha/def :portkey.aws.pinpoint.admchannel-response/is-archived (clojure.spec.alpha/and :portkey.aws.pinpoint/--boolean))
(clojure.spec.alpha/def :portkey.aws.pinpoint.admchannel-response/creation-date (clojure.spec.alpha/and :portkey.aws.pinpoint/--string))
(clojure.spec.alpha/def :portkey.aws.pinpoint.admchannel-response/version (clojure.spec.alpha/and :portkey.aws.pinpoint/--integer))
(clojure.spec.alpha/def :portkey.aws.pinpoint.admchannel-response/last-modified-by (clojure.spec.alpha/and :portkey.aws.pinpoint/--string))
(clojure.spec.alpha/def :portkey.aws.pinpoint.admchannel-response/id (clojure.spec.alpha/and :portkey.aws.pinpoint/--string))
(clojure.spec.alpha/def :portkey.aws.pinpoint/admchannel-response (portkey.aws/json-keys :req-un [] :opt-un [:portkey.aws.pinpoint.admchannel-response/HasCredential :portkey.aws.pinpoint.admchannel-response/Platform :portkey.aws.pinpoint.admchannel-response/LastModifiedDate :portkey.aws.pinpoint.admchannel-response/Enabled :portkey.aws.pinpoint.admchannel-response/ApplicationId :portkey.aws.pinpoint.admchannel-response/IsArchived :portkey.aws.pinpoint.admchannel-response/CreationDate :portkey.aws.pinpoint.admchannel-response/Version :portkey.aws.pinpoint.admchannel-response/LastModifiedBy :portkey.aws.pinpoint.admchannel-response/Id] :locations {}))

(clojure.spec.alpha/def :portkey.aws.pinpoint/delete-event-stream-response (portkey.aws/json-keys :req-un [:portkey.aws.pinpoint/EventStream] :opt-un [] :locations {}))

(clojure.spec.alpha/def :portkey.aws.pinpoint.delete-campaign-request/application-id (clojure.spec.alpha/and :portkey.aws.pinpoint/--string))
(clojure.spec.alpha/def :portkey.aws.pinpoint.delete-campaign-request/campaign-id (clojure.spec.alpha/and :portkey.aws.pinpoint/--string))
(clojure.spec.alpha/def :portkey.aws.pinpoint/delete-campaign-request (portkey.aws/json-keys :req-un [:portkey.aws.pinpoint.delete-campaign-request/CampaignId :portkey.aws.pinpoint.delete-campaign-request/ApplicationId] :opt-un [] :locations {}))

(clojure.spec.alpha/def :portkey.aws.pinpoint.segment-location/country (clojure.spec.alpha/and :portkey.aws.pinpoint/set-dimension))
(clojure.spec.alpha/def :portkey.aws.pinpoint/segment-location (portkey.aws/json-keys :req-un [] :opt-un [:portkey.aws.pinpoint.segment-location/Country] :locations {}))

(clojure.spec.alpha/def :portkey.aws.pinpoint.get-campaign-request/application-id (clojure.spec.alpha/and :portkey.aws.pinpoint/--string))
(clojure.spec.alpha/def :portkey.aws.pinpoint.get-campaign-request/campaign-id (clojure.spec.alpha/and :portkey.aws.pinpoint/--string))
(clojure.spec.alpha/def :portkey.aws.pinpoint/get-campaign-request (portkey.aws/json-keys :req-un [:portkey.aws.pinpoint.get-campaign-request/CampaignId :portkey.aws.pinpoint.get-campaign-request/ApplicationId] :opt-un [] :locations {}))

(clojure.spec.alpha/def :portkey.aws.pinpoint.endpoint-location/city (clojure.spec.alpha/and :portkey.aws.pinpoint/--string))
(clojure.spec.alpha/def :portkey.aws.pinpoint.endpoint-location/country (clojure.spec.alpha/and :portkey.aws.pinpoint/--string))
(clojure.spec.alpha/def :portkey.aws.pinpoint.endpoint-location/latitude (clojure.spec.alpha/and :portkey.aws.pinpoint/--double))
(clojure.spec.alpha/def :portkey.aws.pinpoint.endpoint-location/longitude (clojure.spec.alpha/and :portkey.aws.pinpoint/--double))
(clojure.spec.alpha/def :portkey.aws.pinpoint.endpoint-location/postal-code (clojure.spec.alpha/and :portkey.aws.pinpoint/--string))
(clojure.spec.alpha/def :portkey.aws.pinpoint.endpoint-location/region (clojure.spec.alpha/and :portkey.aws.pinpoint/--string))
(clojure.spec.alpha/def :portkey.aws.pinpoint/endpoint-location (portkey.aws/json-keys :req-un [] :opt-un [:portkey.aws.pinpoint.endpoint-location/City :portkey.aws.pinpoint.endpoint-location/Country :portkey.aws.pinpoint.endpoint-location/Latitude :portkey.aws.pinpoint.endpoint-location/Longitude :portkey.aws.pinpoint.endpoint-location/PostalCode :portkey.aws.pinpoint.endpoint-location/Region] :locations {}))

(clojure.spec.alpha/def :portkey.aws.pinpoint.get-sms-channel-request/application-id (clojure.spec.alpha/and :portkey.aws.pinpoint/--string))
(clojure.spec.alpha/def :portkey.aws.pinpoint/get-sms-channel-request (portkey.aws/json-keys :req-un [:portkey.aws.pinpoint.get-sms-channel-request/ApplicationId] :opt-un [] :locations {}))

(clojure.spec.alpha/def :portkey.aws.pinpoint/update-apns-sandbox-channel-response (portkey.aws/json-keys :req-un [:portkey.aws.pinpoint/APNSSandboxChannelResponse] :opt-un [] :locations {}))

(clojure.spec.alpha/def :portkey.aws.pinpoint/action (clojure.spec.alpha/conformer (clojure.core/let [m__13766__auto__ {"OPEN_APP" "OPEN_APP", :open-app "OPEN_APP", "DEEP_LINK" "DEEP_LINK", :deep-link "DEEP_LINK", "URL" "URL", :url "URL"}] (clojure.core/fn [s__13767__auto__] (m__13766__auto__ s__13767__auto__ :clojure.spec.alpha/invalid))) (clojure.core/comp clojure.core/keyword portkey.aws/dashed)))

(clojure.spec.alpha/def :portkey.aws.pinpoint/list-of-activity-response (clojure.spec.alpha/and (clojure.spec.alpha/coll-of :portkey.aws.pinpoint/activity-response) (clojure.spec.alpha/conformer clojure.core/identity (fn* [p1__13687__13688__auto__] (if (clojure.core/sequential? p1__13687__13688__auto__) p1__13687__13688__auto__ [p1__13687__13688__auto__])))))

(clojure.spec.alpha/def :portkey.aws.pinpoint/get-sms-channel-response (portkey.aws/json-keys :req-un [:portkey.aws.pinpoint/SMSChannelResponse] :opt-un [] :locations {}))

(clojure.spec.alpha/def :portkey.aws.pinpoint.delete-adm-channel-request/application-id (clojure.spec.alpha/and :portkey.aws.pinpoint/--string))
(clojure.spec.alpha/def :portkey.aws.pinpoint/delete-adm-channel-request (portkey.aws/json-keys :req-un [:portkey.aws.pinpoint.delete-adm-channel-request/ApplicationId] :opt-un [] :locations {}))

(clojure.spec.alpha/def :portkey.aws.pinpoint.gcmchannel-request/api-key (clojure.spec.alpha/and :portkey.aws.pinpoint/--string))
(clojure.spec.alpha/def :portkey.aws.pinpoint.gcmchannel-request/enabled (clojure.spec.alpha/and :portkey.aws.pinpoint/--boolean))
(clojure.spec.alpha/def :portkey.aws.pinpoint/gcmchannel-request (portkey.aws/json-keys :req-un [] :opt-un [:portkey.aws.pinpoint.gcmchannel-request/ApiKey :portkey.aws.pinpoint.gcmchannel-request/Enabled] :locations {}))

(clojure.spec.alpha/def :portkey.aws.pinpoint.baidu-channel-response/has-credential (clojure.spec.alpha/and :portkey.aws.pinpoint/--boolean))
(clojure.spec.alpha/def :portkey.aws.pinpoint.baidu-channel-response/platform (clojure.spec.alpha/and :portkey.aws.pinpoint/--string))
(clojure.spec.alpha/def :portkey.aws.pinpoint.baidu-channel-response/credential (clojure.spec.alpha/and :portkey.aws.pinpoint/--string))
(clojure.spec.alpha/def :portkey.aws.pinpoint.baidu-channel-response/last-modified-date (clojure.spec.alpha/and :portkey.aws.pinpoint/--string))
(clojure.spec.alpha/def :portkey.aws.pinpoint.baidu-channel-response/enabled (clojure.spec.alpha/and :portkey.aws.pinpoint/--boolean))
(clojure.spec.alpha/def :portkey.aws.pinpoint.baidu-channel-response/application-id (clojure.spec.alpha/and :portkey.aws.pinpoint/--string))
(clojure.spec.alpha/def :portkey.aws.pinpoint.baidu-channel-response/is-archived (clojure.spec.alpha/and :portkey.aws.pinpoint/--boolean))
(clojure.spec.alpha/def :portkey.aws.pinpoint.baidu-channel-response/creation-date (clojure.spec.alpha/and :portkey.aws.pinpoint/--string))
(clojure.spec.alpha/def :portkey.aws.pinpoint.baidu-channel-response/version (clojure.spec.alpha/and :portkey.aws.pinpoint/--integer))
(clojure.spec.alpha/def :portkey.aws.pinpoint.baidu-channel-response/last-modified-by (clojure.spec.alpha/and :portkey.aws.pinpoint/--string))
(clojure.spec.alpha/def :portkey.aws.pinpoint.baidu-channel-response/id (clojure.spec.alpha/and :portkey.aws.pinpoint/--string))
(clojure.spec.alpha/def :portkey.aws.pinpoint/baidu-channel-response (portkey.aws/json-keys :req-un [] :opt-un [:portkey.aws.pinpoint.baidu-channel-response/HasCredential :portkey.aws.pinpoint.baidu-channel-response/Platform :portkey.aws.pinpoint.baidu-channel-response/Credential :portkey.aws.pinpoint.baidu-channel-response/LastModifiedDate :portkey.aws.pinpoint.baidu-channel-response/Enabled :portkey.aws.pinpoint.baidu-channel-response/ApplicationId :portkey.aws.pinpoint.baidu-channel-response/IsArchived :portkey.aws.pinpoint.baidu-channel-response/CreationDate :portkey.aws.pinpoint.baidu-channel-response/Version :portkey.aws.pinpoint.baidu-channel-response/LastModifiedBy :portkey.aws.pinpoint.baidu-channel-response/Id] :locations {}))

(clojure.spec.alpha/def :portkey.aws.pinpoint/get-apns-sandbox-channel-response (portkey.aws/json-keys :req-un [:portkey.aws.pinpoint/APNSSandboxChannelResponse] :opt-un [] :locations {}))

(clojure.spec.alpha/def :portkey.aws.pinpoint/map-of-map-of-endpoint-message-result (clojure.spec.alpha/map-of :portkey.aws.pinpoint/--string :portkey.aws.pinpoint/map-of-endpoint-message-result))

(clojure.spec.alpha/def :portkey.aws.pinpoint.message-result/status-code (clojure.spec.alpha/and :portkey.aws.pinpoint/--integer))
(clojure.spec.alpha/def :portkey.aws.pinpoint.message-result/status-message (clojure.spec.alpha/and :portkey.aws.pinpoint/--string))
(clojure.spec.alpha/def :portkey.aws.pinpoint.message-result/updated-token (clojure.spec.alpha/and :portkey.aws.pinpoint/--string))
(clojure.spec.alpha/def :portkey.aws.pinpoint/message-result (portkey.aws/json-keys :req-un [] :opt-un [:portkey.aws.pinpoint/DeliveryStatus :portkey.aws.pinpoint.message-result/StatusCode :portkey.aws.pinpoint.message-result/StatusMessage :portkey.aws.pinpoint.message-result/UpdatedToken] :locations {}))

(clojure.spec.alpha/def :portkey.aws.pinpoint/delete-baidu-channel-response (portkey.aws/json-keys :req-un [:portkey.aws.pinpoint/BaiduChannelResponse] :opt-un [] :locations {}))

(clojure.spec.alpha/def :portkey.aws.pinpoint.apnschannel-response/has-credential (clojure.spec.alpha/and :portkey.aws.pinpoint/--boolean))
(clojure.spec.alpha/def :portkey.aws.pinpoint.apnschannel-response/has-token-key (clojure.spec.alpha/and :portkey.aws.pinpoint/--boolean))
(clojure.spec.alpha/def :portkey.aws.pinpoint.apnschannel-response/platform (clojure.spec.alpha/and :portkey.aws.pinpoint/--string))
(clojure.spec.alpha/def :portkey.aws.pinpoint.apnschannel-response/last-modified-date (clojure.spec.alpha/and :portkey.aws.pinpoint/--string))
(clojure.spec.alpha/def :portkey.aws.pinpoint.apnschannel-response/enabled (clojure.spec.alpha/and :portkey.aws.pinpoint/--boolean))
(clojure.spec.alpha/def :portkey.aws.pinpoint.apnschannel-response/application-id (clojure.spec.alpha/and :portkey.aws.pinpoint/--string))
(clojure.spec.alpha/def :portkey.aws.pinpoint.apnschannel-response/is-archived (clojure.spec.alpha/and :portkey.aws.pinpoint/--boolean))
(clojure.spec.alpha/def :portkey.aws.pinpoint.apnschannel-response/default-authentication-method (clojure.spec.alpha/and :portkey.aws.pinpoint/--string))
(clojure.spec.alpha/def :portkey.aws.pinpoint.apnschannel-response/creation-date (clojure.spec.alpha/and :portkey.aws.pinpoint/--string))
(clojure.spec.alpha/def :portkey.aws.pinpoint.apnschannel-response/version (clojure.spec.alpha/and :portkey.aws.pinpoint/--integer))
(clojure.spec.alpha/def :portkey.aws.pinpoint.apnschannel-response/last-modified-by (clojure.spec.alpha/and :portkey.aws.pinpoint/--string))
(clojure.spec.alpha/def :portkey.aws.pinpoint.apnschannel-response/id (clojure.spec.alpha/and :portkey.aws.pinpoint/--string))
(clojure.spec.alpha/def :portkey.aws.pinpoint/apnschannel-response (portkey.aws/json-keys :req-un [] :opt-un [:portkey.aws.pinpoint.apnschannel-response/HasCredential :portkey.aws.pinpoint.apnschannel-response/HasTokenKey :portkey.aws.pinpoint.apnschannel-response/Platform :portkey.aws.pinpoint.apnschannel-response/LastModifiedDate :portkey.aws.pinpoint.apnschannel-response/Enabled :portkey.aws.pinpoint.apnschannel-response/ApplicationId :portkey.aws.pinpoint.apnschannel-response/IsArchived :portkey.aws.pinpoint.apnschannel-response/DefaultAuthenticationMethod :portkey.aws.pinpoint.apnschannel-response/CreationDate :portkey.aws.pinpoint.apnschannel-response/Version :portkey.aws.pinpoint.apnschannel-response/LastModifiedBy :portkey.aws.pinpoint.apnschannel-response/Id] :locations {}))

(clojure.spec.alpha/def :portkey.aws.pinpoint/map-of--string (clojure.spec.alpha/map-of :portkey.aws.pinpoint/--string :portkey.aws.pinpoint/--string))

(clojure.spec.alpha/def :portkey.aws.pinpoint.segments-response/item (clojure.spec.alpha/and :portkey.aws.pinpoint/list-of-segment-response))
(clojure.spec.alpha/def :portkey.aws.pinpoint.segments-response/next-token (clojure.spec.alpha/and :portkey.aws.pinpoint/--string))
(clojure.spec.alpha/def :portkey.aws.pinpoint/segments-response (portkey.aws/json-keys :req-un [] :opt-un [:portkey.aws.pinpoint.segments-response/Item :portkey.aws.pinpoint.segments-response/NextToken] :locations {}))

(clojure.spec.alpha/def :portkey.aws.pinpoint.delete-event-stream-request/application-id (clojure.spec.alpha/and :portkey.aws.pinpoint/--string))
(clojure.spec.alpha/def :portkey.aws.pinpoint/delete-event-stream-request (portkey.aws/json-keys :req-un [:portkey.aws.pinpoint.delete-event-stream-request/ApplicationId] :opt-un [] :locations {}))

(clojure.spec.alpha/def :portkey.aws.pinpoint/get-email-channel-response (portkey.aws/json-keys :req-un [:portkey.aws.pinpoint/EmailChannelResponse] :opt-un [] :locations {}))

(clojure.spec.alpha/def :portkey.aws.pinpoint/channel-type (clojure.spec.alpha/conformer (clojure.core/let [m__13766__auto__ {:email "EMAIL", "CUSTOM" "CUSTOM", "SMS" "SMS", "APNS_VOIP" "APNS_VOIP", "ADM" "ADM", "BAIDU" "BAIDU", "GCM" "GCM", "APNS" "APNS", :custom "CUSTOM", :apns-voip "APNS_VOIP", :apns-sandbox "APNS_SANDBOX", "APNS_VOIP_SANDBOX" "APNS_VOIP_SANDBOX", :gcm "GCM", :sms "SMS", :adm "ADM", "APNS_SANDBOX" "APNS_SANDBOX", "EMAIL" "EMAIL", :baidu "BAIDU", :apns-voip-sandbox "APNS_VOIP_SANDBOX", :apns "APNS"}] (clojure.core/fn [s__13767__auto__] (m__13766__auto__ s__13767__auto__ :clojure.spec.alpha/invalid))) (clojure.core/comp clojure.core/keyword portkey.aws/dashed)))

(clojure.spec.alpha/def :portkey.aws.pinpoint.get-import-jobs-request/application-id (clojure.spec.alpha/and :portkey.aws.pinpoint/--string))
(clojure.spec.alpha/def :portkey.aws.pinpoint.get-import-jobs-request/page-size (clojure.spec.alpha/and :portkey.aws.pinpoint/--string))
(clojure.spec.alpha/def :portkey.aws.pinpoint.get-import-jobs-request/token (clojure.spec.alpha/and :portkey.aws.pinpoint/--string))
(clojure.spec.alpha/def :portkey.aws.pinpoint/get-import-jobs-request (portkey.aws/json-keys :req-un [:portkey.aws.pinpoint.get-import-jobs-request/ApplicationId] :opt-un [:portkey.aws.pinpoint.get-import-jobs-request/PageSize :portkey.aws.pinpoint.get-import-jobs-request/Token] :locations {}))

(clojure.spec.alpha/def :portkey.aws.pinpoint/get-apns-voip-channel-response (portkey.aws/json-keys :req-un [:portkey.aws.pinpoint/APNSVoipChannelResponse] :opt-un [] :locations {}))

(clojure.spec.alpha/def :portkey.aws.pinpoint.update-campaign-request/application-id (clojure.spec.alpha/and :portkey.aws.pinpoint/--string))
(clojure.spec.alpha/def :portkey.aws.pinpoint.update-campaign-request/campaign-id (clojure.spec.alpha/and :portkey.aws.pinpoint/--string))
(clojure.spec.alpha/def :portkey.aws.pinpoint/update-campaign-request (portkey.aws/json-keys :req-un [:portkey.aws.pinpoint.update-campaign-request/CampaignId :portkey.aws.pinpoint.update-campaign-request/ApplicationId :portkey.aws.pinpoint/WriteCampaignRequest] :opt-un [] :locations {}))

(clojure.spec.alpha/def :portkey.aws.pinpoint.segment-demographics/app-version (clojure.spec.alpha/and :portkey.aws.pinpoint/set-dimension))
(clojure.spec.alpha/def :portkey.aws.pinpoint.segment-demographics/channel (clojure.spec.alpha/and :portkey.aws.pinpoint/set-dimension))
(clojure.spec.alpha/def :portkey.aws.pinpoint.segment-demographics/device-type (clojure.spec.alpha/and :portkey.aws.pinpoint/set-dimension))
(clojure.spec.alpha/def :portkey.aws.pinpoint.segment-demographics/make (clojure.spec.alpha/and :portkey.aws.pinpoint/set-dimension))
(clojure.spec.alpha/def :portkey.aws.pinpoint.segment-demographics/model (clojure.spec.alpha/and :portkey.aws.pinpoint/set-dimension))
(clojure.spec.alpha/def :portkey.aws.pinpoint.segment-demographics/platform (clojure.spec.alpha/and :portkey.aws.pinpoint/set-dimension))
(clojure.spec.alpha/def :portkey.aws.pinpoint/segment-demographics (portkey.aws/json-keys :req-un [] :opt-un [:portkey.aws.pinpoint.segment-demographics/AppVersion :portkey.aws.pinpoint.segment-demographics/Channel :portkey.aws.pinpoint.segment-demographics/DeviceType :portkey.aws.pinpoint.segment-demographics/Make :portkey.aws.pinpoint.segment-demographics/Model :portkey.aws.pinpoint.segment-demographics/Platform] :locations {}))

(clojure.spec.alpha/def :portkey.aws.pinpoint/update-email-channel-response (portkey.aws/json-keys :req-un [:portkey.aws.pinpoint/EmailChannelResponse] :opt-un [] :locations {}))

(clojure.core/defn get-apns-voip-sandbox-channel "Get an APNS VoIPSandbox channel" ([get-apns-voip-sandbox-channel-request] (portkey.aws/-rest-json-call portkey.aws.pinpoint/endpoints "GET" "/v1/apps/{application-id}/channels/apns_voip_sandbox" get-apns-voip-sandbox-channel-request :portkey.aws.pinpoint/get-apns-voip-sandbox-channel-request {:payload nil, :move {}, :headers {}, :uri {"application-id" "ApplicationId"}, :querystring {}} 200 :portkey.aws.pinpoint/get-apns-voip-sandbox-channel-response {"BadRequestException" :portkey.aws.pinpoint/bad-request-exception, "InternalServerErrorException" :portkey.aws.pinpoint/internal-server-error-exception, "ForbiddenException" :portkey.aws.pinpoint/forbidden-exception, "NotFoundException" :portkey.aws.pinpoint/not-found-exception, "MethodNotAllowedException" :portkey.aws.pinpoint/method-not-allowed-exception, "TooManyRequestsException" :portkey.aws.pinpoint/too-many-requests-exception})))
(clojure.spec.alpha/fdef get-apns-voip-sandbox-channel :args (clojure.spec.alpha/tuple :portkey.aws.pinpoint/get-apns-voip-sandbox-channel-request) :ret (clojure.spec.alpha/and :portkey.aws.pinpoint/get-apns-voip-sandbox-channel-response))

(clojure.core/defn get-baidu-channel "Get a BAIDU GCM channel" ([get-baidu-channel-request] (portkey.aws/-rest-json-call portkey.aws.pinpoint/endpoints "GET" "/v1/apps/{application-id}/channels/baidu" get-baidu-channel-request :portkey.aws.pinpoint/get-baidu-channel-request {:payload nil, :move {}, :headers {}, :uri {"application-id" "ApplicationId"}, :querystring {}} 200 :portkey.aws.pinpoint/get-baidu-channel-response {"BadRequestException" :portkey.aws.pinpoint/bad-request-exception, "InternalServerErrorException" :portkey.aws.pinpoint/internal-server-error-exception, "ForbiddenException" :portkey.aws.pinpoint/forbidden-exception, "NotFoundException" :portkey.aws.pinpoint/not-found-exception, "MethodNotAllowedException" :portkey.aws.pinpoint/method-not-allowed-exception, "TooManyRequestsException" :portkey.aws.pinpoint/too-many-requests-exception})))
(clojure.spec.alpha/fdef get-baidu-channel :args (clojure.spec.alpha/tuple :portkey.aws.pinpoint/get-baidu-channel-request) :ret (clojure.spec.alpha/and :portkey.aws.pinpoint/get-baidu-channel-response))

(clojure.core/defn update-apns-channel "Use to update the APNs channel for an app." ([update-apns-channel-request] (portkey.aws/-rest-json-call portkey.aws.pinpoint/endpoints "PUT" "/v1/apps/{application-id}/channels/apns" update-apns-channel-request :portkey.aws.pinpoint/update-apns-channel-request {:payload "APNSChannelRequest", :move {}, :headers {}, :uri {"application-id" "ApplicationId"}, :querystring {}} 200 :portkey.aws.pinpoint/update-apns-channel-response {"BadRequestException" :portkey.aws.pinpoint/bad-request-exception, "InternalServerErrorException" :portkey.aws.pinpoint/internal-server-error-exception, "ForbiddenException" :portkey.aws.pinpoint/forbidden-exception, "NotFoundException" :portkey.aws.pinpoint/not-found-exception, "MethodNotAllowedException" :portkey.aws.pinpoint/method-not-allowed-exception, "TooManyRequestsException" :portkey.aws.pinpoint/too-many-requests-exception})))
(clojure.spec.alpha/fdef update-apns-channel :args (clojure.spec.alpha/tuple :portkey.aws.pinpoint/update-apns-channel-request) :ret (clojure.spec.alpha/and :portkey.aws.pinpoint/update-apns-channel-response))

(clojure.core/defn get-export-job "Returns information about an export job." ([get-export-job-request] (portkey.aws/-rest-json-call portkey.aws.pinpoint/endpoints "GET" "/v1/apps/{application-id}/jobs/export/{job-id}" get-export-job-request :portkey.aws.pinpoint/get-export-job-request {:payload nil, :move {}, :headers {}, :uri {"application-id" "ApplicationId", "job-id" "JobId"}, :querystring {}} 200 :portkey.aws.pinpoint/get-export-job-response {"BadRequestException" :portkey.aws.pinpoint/bad-request-exception, "InternalServerErrorException" :portkey.aws.pinpoint/internal-server-error-exception, "ForbiddenException" :portkey.aws.pinpoint/forbidden-exception, "NotFoundException" :portkey.aws.pinpoint/not-found-exception, "MethodNotAllowedException" :portkey.aws.pinpoint/method-not-allowed-exception, "TooManyRequestsException" :portkey.aws.pinpoint/too-many-requests-exception})))
(clojure.spec.alpha/fdef get-export-job :args (clojure.spec.alpha/tuple :portkey.aws.pinpoint/get-export-job-request) :ret (clojure.spec.alpha/and :portkey.aws.pinpoint/get-export-job-response))

(clojure.core/defn delete-apns-voip-channel "Delete an APNS VoIP channel" ([delete-apns-voip-channel-request] (portkey.aws/-rest-json-call portkey.aws.pinpoint/endpoints "DELETE" "/v1/apps/{application-id}/channels/apns_voip" delete-apns-voip-channel-request :portkey.aws.pinpoint/delete-apns-voip-channel-request {:payload nil, :move {}, :headers {}, :uri {"application-id" "ApplicationId"}, :querystring {}} 200 :portkey.aws.pinpoint/delete-apns-voip-channel-response {"BadRequestException" :portkey.aws.pinpoint/bad-request-exception, "InternalServerErrorException" :portkey.aws.pinpoint/internal-server-error-exception, "ForbiddenException" :portkey.aws.pinpoint/forbidden-exception, "NotFoundException" :portkey.aws.pinpoint/not-found-exception, "MethodNotAllowedException" :portkey.aws.pinpoint/method-not-allowed-exception, "TooManyRequestsException" :portkey.aws.pinpoint/too-many-requests-exception})))
(clojure.spec.alpha/fdef delete-apns-voip-channel :args (clojure.spec.alpha/tuple :portkey.aws.pinpoint/delete-apns-voip-channel-request) :ret (clojure.spec.alpha/and :portkey.aws.pinpoint/delete-apns-voip-channel-response))

(clojure.core/defn create-export-job "Creates an export job." ([create-export-job-request] (portkey.aws/-rest-json-call portkey.aws.pinpoint/endpoints "POST" "/v1/apps/{application-id}/jobs/export" create-export-job-request :portkey.aws.pinpoint/create-export-job-request {:payload "ExportJobRequest", :move {}, :headers {}, :uri {"application-id" "ApplicationId"}, :querystring {}} 202 :portkey.aws.pinpoint/create-export-job-response {"BadRequestException" :portkey.aws.pinpoint/bad-request-exception, "InternalServerErrorException" :portkey.aws.pinpoint/internal-server-error-exception, "ForbiddenException" :portkey.aws.pinpoint/forbidden-exception, "NotFoundException" :portkey.aws.pinpoint/not-found-exception, "MethodNotAllowedException" :portkey.aws.pinpoint/method-not-allowed-exception, "TooManyRequestsException" :portkey.aws.pinpoint/too-many-requests-exception})))
(clojure.spec.alpha/fdef create-export-job :args (clojure.spec.alpha/tuple :portkey.aws.pinpoint/create-export-job-request) :ret (clojure.spec.alpha/and :portkey.aws.pinpoint/create-export-job-response))

(clojure.core/defn get-apns-channel "Returns information about the APNs channel for an app." ([get-apns-channel-request] (portkey.aws/-rest-json-call portkey.aws.pinpoint/endpoints "GET" "/v1/apps/{application-id}/channels/apns" get-apns-channel-request :portkey.aws.pinpoint/get-apns-channel-request {:payload nil, :move {}, :headers {}, :uri {"application-id" "ApplicationId"}, :querystring {}} 200 :portkey.aws.pinpoint/get-apns-channel-response {"BadRequestException" :portkey.aws.pinpoint/bad-request-exception, "InternalServerErrorException" :portkey.aws.pinpoint/internal-server-error-exception, "ForbiddenException" :portkey.aws.pinpoint/forbidden-exception, "NotFoundException" :portkey.aws.pinpoint/not-found-exception, "MethodNotAllowedException" :portkey.aws.pinpoint/method-not-allowed-exception, "TooManyRequestsException" :portkey.aws.pinpoint/too-many-requests-exception})))
(clojure.spec.alpha/fdef get-apns-channel :args (clojure.spec.alpha/tuple :portkey.aws.pinpoint/get-apns-channel-request) :ret (clojure.spec.alpha/and :portkey.aws.pinpoint/get-apns-channel-response))

(clojure.core/defn update-apns-voip-channel "Update an APNS VoIP channel" ([update-apns-voip-channel-request] (portkey.aws/-rest-json-call portkey.aws.pinpoint/endpoints "PUT" "/v1/apps/{application-id}/channels/apns_voip" update-apns-voip-channel-request :portkey.aws.pinpoint/update-apns-voip-channel-request {:payload "APNSVoipChannelRequest", :move {}, :headers {}, :uri {"application-id" "ApplicationId"}, :querystring {}} 200 :portkey.aws.pinpoint/update-apns-voip-channel-response {"BadRequestException" :portkey.aws.pinpoint/bad-request-exception, "InternalServerErrorException" :portkey.aws.pinpoint/internal-server-error-exception, "ForbiddenException" :portkey.aws.pinpoint/forbidden-exception, "NotFoundException" :portkey.aws.pinpoint/not-found-exception, "MethodNotAllowedException" :portkey.aws.pinpoint/method-not-allowed-exception, "TooManyRequestsException" :portkey.aws.pinpoint/too-many-requests-exception})))
(clojure.spec.alpha/fdef update-apns-voip-channel :args (clojure.spec.alpha/tuple :portkey.aws.pinpoint/update-apns-voip-channel-request) :ret (clojure.spec.alpha/and :portkey.aws.pinpoint/update-apns-voip-channel-response))

(clojure.core/defn update-adm-channel "Update an ADM channel" ([update-adm-channel-request] (portkey.aws/-rest-json-call portkey.aws.pinpoint/endpoints "PUT" "/v1/apps/{application-id}/channels/adm" update-adm-channel-request :portkey.aws.pinpoint/update-adm-channel-request {:payload "ADMChannelRequest", :move {}, :headers {}, :uri {"application-id" "ApplicationId"}, :querystring {}} 200 :portkey.aws.pinpoint/update-adm-channel-response {"BadRequestException" :portkey.aws.pinpoint/bad-request-exception, "InternalServerErrorException" :portkey.aws.pinpoint/internal-server-error-exception, "ForbiddenException" :portkey.aws.pinpoint/forbidden-exception, "NotFoundException" :portkey.aws.pinpoint/not-found-exception, "MethodNotAllowedException" :portkey.aws.pinpoint/method-not-allowed-exception, "TooManyRequestsException" :portkey.aws.pinpoint/too-many-requests-exception})))
(clojure.spec.alpha/fdef update-adm-channel :args (clojure.spec.alpha/tuple :portkey.aws.pinpoint/update-adm-channel-request) :ret (clojure.spec.alpha/and :portkey.aws.pinpoint/update-adm-channel-response))

(clojure.core/defn update-endpoints-batch "Use to update a batch of endpoints." ([update-endpoints-batch-request] (portkey.aws/-rest-json-call portkey.aws.pinpoint/endpoints "PUT" "/v1/apps/{application-id}/endpoints" update-endpoints-batch-request :portkey.aws.pinpoint/update-endpoints-batch-request {:payload "EndpointBatchRequest", :move {}, :headers {}, :uri {"application-id" "ApplicationId"}, :querystring {}} 202 :portkey.aws.pinpoint/update-endpoints-batch-response {"BadRequestException" :portkey.aws.pinpoint/bad-request-exception, "InternalServerErrorException" :portkey.aws.pinpoint/internal-server-error-exception, "ForbiddenException" :portkey.aws.pinpoint/forbidden-exception, "NotFoundException" :portkey.aws.pinpoint/not-found-exception, "MethodNotAllowedException" :portkey.aws.pinpoint/method-not-allowed-exception, "TooManyRequestsException" :portkey.aws.pinpoint/too-many-requests-exception})))
(clojure.spec.alpha/fdef update-endpoints-batch :args (clojure.spec.alpha/tuple :portkey.aws.pinpoint/update-endpoints-batch-request) :ret (clojure.spec.alpha/and :portkey.aws.pinpoint/update-endpoints-batch-response))

(clojure.core/defn get-import-jobs "Returns information about your import jobs." ([get-import-jobs-request] (portkey.aws/-rest-json-call portkey.aws.pinpoint/endpoints "GET" "/v1/apps/{application-id}/jobs/import" get-import-jobs-request :portkey.aws.pinpoint/get-import-jobs-request {:payload nil, :move {}, :headers {}, :uri {"application-id" "ApplicationId"}, :querystring {"page-size" "PageSize", "token" "Token"}} 200 :portkey.aws.pinpoint/get-import-jobs-response {"BadRequestException" :portkey.aws.pinpoint/bad-request-exception, "InternalServerErrorException" :portkey.aws.pinpoint/internal-server-error-exception, "ForbiddenException" :portkey.aws.pinpoint/forbidden-exception, "NotFoundException" :portkey.aws.pinpoint/not-found-exception, "MethodNotAllowedException" :portkey.aws.pinpoint/method-not-allowed-exception, "TooManyRequestsException" :portkey.aws.pinpoint/too-many-requests-exception})))
(clojure.spec.alpha/fdef get-import-jobs :args (clojure.spec.alpha/tuple :portkey.aws.pinpoint/get-import-jobs-request) :ret (clojure.spec.alpha/and :portkey.aws.pinpoint/get-import-jobs-response))

(clojure.core/defn delete-baidu-channel "Delete a BAIDU GCM channel" ([delete-baidu-channel-request] (portkey.aws/-rest-json-call portkey.aws.pinpoint/endpoints "DELETE" "/v1/apps/{application-id}/channels/baidu" delete-baidu-channel-request :portkey.aws.pinpoint/delete-baidu-channel-request {:payload nil, :move {}, :headers {}, :uri {"application-id" "ApplicationId"}, :querystring {}} 200 :portkey.aws.pinpoint/delete-baidu-channel-response {"BadRequestException" :portkey.aws.pinpoint/bad-request-exception, "InternalServerErrorException" :portkey.aws.pinpoint/internal-server-error-exception, "ForbiddenException" :portkey.aws.pinpoint/forbidden-exception, "NotFoundException" :portkey.aws.pinpoint/not-found-exception, "MethodNotAllowedException" :portkey.aws.pinpoint/method-not-allowed-exception, "TooManyRequestsException" :portkey.aws.pinpoint/too-many-requests-exception})))
(clojure.spec.alpha/fdef delete-baidu-channel :args (clojure.spec.alpha/tuple :portkey.aws.pinpoint/delete-baidu-channel-request) :ret (clojure.spec.alpha/and :portkey.aws.pinpoint/delete-baidu-channel-response))

(clojure.core/defn get-sms-channel "Get an SMS channel" ([get-sms-channel-request] (portkey.aws/-rest-json-call portkey.aws.pinpoint/endpoints "GET" "/v1/apps/{application-id}/channels/sms" get-sms-channel-request :portkey.aws.pinpoint/get-sms-channel-request {:payload nil, :move {}, :headers {}, :uri {"application-id" "ApplicationId"}, :querystring {}} 200 :portkey.aws.pinpoint/get-sms-channel-response {"BadRequestException" :portkey.aws.pinpoint/bad-request-exception, "InternalServerErrorException" :portkey.aws.pinpoint/internal-server-error-exception, "ForbiddenException" :portkey.aws.pinpoint/forbidden-exception, "NotFoundException" :portkey.aws.pinpoint/not-found-exception, "MethodNotAllowedException" :portkey.aws.pinpoint/method-not-allowed-exception, "TooManyRequestsException" :portkey.aws.pinpoint/too-many-requests-exception})))
(clojure.spec.alpha/fdef get-sms-channel :args (clojure.spec.alpha/tuple :portkey.aws.pinpoint/get-sms-channel-request) :ret (clojure.spec.alpha/and :portkey.aws.pinpoint/get-sms-channel-response))

(clojure.core/defn get-segment-version "Returns information about a segment version." ([get-segment-version-request] (portkey.aws/-rest-json-call portkey.aws.pinpoint/endpoints "GET" "/v1/apps/{application-id}/segments/{segment-id}/versions/{version}" get-segment-version-request :portkey.aws.pinpoint/get-segment-version-request {:payload nil, :move {}, :headers {}, :uri {"application-id" "ApplicationId", "segment-id" "SegmentId", "version" "Version"}, :querystring {}} 200 :portkey.aws.pinpoint/get-segment-version-response {"BadRequestException" :portkey.aws.pinpoint/bad-request-exception, "InternalServerErrorException" :portkey.aws.pinpoint/internal-server-error-exception, "ForbiddenException" :portkey.aws.pinpoint/forbidden-exception, "NotFoundException" :portkey.aws.pinpoint/not-found-exception, "MethodNotAllowedException" :portkey.aws.pinpoint/method-not-allowed-exception, "TooManyRequestsException" :portkey.aws.pinpoint/too-many-requests-exception})))
(clojure.spec.alpha/fdef get-segment-version :args (clojure.spec.alpha/tuple :portkey.aws.pinpoint/get-segment-version-request) :ret (clojure.spec.alpha/and :portkey.aws.pinpoint/get-segment-version-response))

(clojure.core/defn get-apns-sandbox-channel "Get an APNS sandbox channel" ([get-apns-sandbox-channel-request] (portkey.aws/-rest-json-call portkey.aws.pinpoint/endpoints "GET" "/v1/apps/{application-id}/channels/apns_sandbox" get-apns-sandbox-channel-request :portkey.aws.pinpoint/get-apns-sandbox-channel-request {:payload nil, :move {}, :headers {}, :uri {"application-id" "ApplicationId"}, :querystring {}} 200 :portkey.aws.pinpoint/get-apns-sandbox-channel-response {"BadRequestException" :portkey.aws.pinpoint/bad-request-exception, "InternalServerErrorException" :portkey.aws.pinpoint/internal-server-error-exception, "ForbiddenException" :portkey.aws.pinpoint/forbidden-exception, "NotFoundException" :portkey.aws.pinpoint/not-found-exception, "MethodNotAllowedException" :portkey.aws.pinpoint/method-not-allowed-exception, "TooManyRequestsException" :portkey.aws.pinpoint/too-many-requests-exception})))
(clojure.spec.alpha/fdef get-apns-sandbox-channel :args (clojure.spec.alpha/tuple :portkey.aws.pinpoint/get-apns-sandbox-channel-request) :ret (clojure.spec.alpha/and :portkey.aws.pinpoint/get-apns-sandbox-channel-response))

(clojure.core/defn get-segment-import-jobs "Returns a list of import jobs for a specific segment." ([get-segment-import-jobs-request] (portkey.aws/-rest-json-call portkey.aws.pinpoint/endpoints "GET" "/v1/apps/{application-id}/segments/{segment-id}/jobs/import" get-segment-import-jobs-request :portkey.aws.pinpoint/get-segment-import-jobs-request {:payload nil, :move {}, :headers {}, :uri {"application-id" "ApplicationId", "segment-id" "SegmentId"}, :querystring {"page-size" "PageSize", "token" "Token"}} 200 :portkey.aws.pinpoint/get-segment-import-jobs-response {"BadRequestException" :portkey.aws.pinpoint/bad-request-exception, "InternalServerErrorException" :portkey.aws.pinpoint/internal-server-error-exception, "ForbiddenException" :portkey.aws.pinpoint/forbidden-exception, "NotFoundException" :portkey.aws.pinpoint/not-found-exception, "MethodNotAllowedException" :portkey.aws.pinpoint/method-not-allowed-exception, "TooManyRequestsException" :portkey.aws.pinpoint/too-many-requests-exception})))
(clojure.spec.alpha/fdef get-segment-import-jobs :args (clojure.spec.alpha/tuple :portkey.aws.pinpoint/get-segment-import-jobs-request) :ret (clojure.spec.alpha/and :portkey.aws.pinpoint/get-segment-import-jobs-response))

(clojure.core/defn get-campaign-activities "Returns information about the activity performed by a campaign." ([get-campaign-activities-request] (portkey.aws/-rest-json-call portkey.aws.pinpoint/endpoints "GET" "/v1/apps/{application-id}/campaigns/{campaign-id}/activities" get-campaign-activities-request :portkey.aws.pinpoint/get-campaign-activities-request {:payload nil, :move {}, :headers {}, :uri {"application-id" "ApplicationId", "campaign-id" "CampaignId"}, :querystring {"page-size" "PageSize", "token" "Token"}} 200 :portkey.aws.pinpoint/get-campaign-activities-response {"BadRequestException" :portkey.aws.pinpoint/bad-request-exception, "InternalServerErrorException" :portkey.aws.pinpoint/internal-server-error-exception, "ForbiddenException" :portkey.aws.pinpoint/forbidden-exception, "NotFoundException" :portkey.aws.pinpoint/not-found-exception, "MethodNotAllowedException" :portkey.aws.pinpoint/method-not-allowed-exception, "TooManyRequestsException" :portkey.aws.pinpoint/too-many-requests-exception})))
(clojure.spec.alpha/fdef get-campaign-activities :args (clojure.spec.alpha/tuple :portkey.aws.pinpoint/get-campaign-activities-request) :ret (clojure.spec.alpha/and :portkey.aws.pinpoint/get-campaign-activities-response))

(clojure.core/defn delete-email-channel "Delete an email channel" ([delete-email-channel-request] (portkey.aws/-rest-json-call portkey.aws.pinpoint/endpoints "DELETE" "/v1/apps/{application-id}/channels/email" delete-email-channel-request :portkey.aws.pinpoint/delete-email-channel-request {:payload nil, :move {}, :headers {}, :uri {"application-id" "ApplicationId"}, :querystring {}} 200 :portkey.aws.pinpoint/delete-email-channel-response {"BadRequestException" :portkey.aws.pinpoint/bad-request-exception, "InternalServerErrorException" :portkey.aws.pinpoint/internal-server-error-exception, "ForbiddenException" :portkey.aws.pinpoint/forbidden-exception, "NotFoundException" :portkey.aws.pinpoint/not-found-exception, "MethodNotAllowedException" :portkey.aws.pinpoint/method-not-allowed-exception, "TooManyRequestsException" :portkey.aws.pinpoint/too-many-requests-exception})))
(clojure.spec.alpha/fdef delete-email-channel :args (clojure.spec.alpha/tuple :portkey.aws.pinpoint/delete-email-channel-request) :ret (clojure.spec.alpha/and :portkey.aws.pinpoint/delete-email-channel-response))

(clojure.core/defn get-segment "Returns information about a segment." ([get-segment-request] (portkey.aws/-rest-json-call portkey.aws.pinpoint/endpoints "GET" "/v1/apps/{application-id}/segments/{segment-id}" get-segment-request :portkey.aws.pinpoint/get-segment-request {:payload nil, :move {}, :headers {}, :uri {"application-id" "ApplicationId", "segment-id" "SegmentId"}, :querystring {}} 200 :portkey.aws.pinpoint/get-segment-response {"BadRequestException" :portkey.aws.pinpoint/bad-request-exception, "InternalServerErrorException" :portkey.aws.pinpoint/internal-server-error-exception, "ForbiddenException" :portkey.aws.pinpoint/forbidden-exception, "NotFoundException" :portkey.aws.pinpoint/not-found-exception, "MethodNotAllowedException" :portkey.aws.pinpoint/method-not-allowed-exception, "TooManyRequestsException" :portkey.aws.pinpoint/too-many-requests-exception})))
(clojure.spec.alpha/fdef get-segment :args (clojure.spec.alpha/tuple :portkey.aws.pinpoint/get-segment-request) :ret (clojure.spec.alpha/and :portkey.aws.pinpoint/get-segment-response))

(clojure.core/defn send-users-messages "Send a batch of messages to users" ([send-users-messages-request] (portkey.aws/-rest-json-call portkey.aws.pinpoint/endpoints "POST" "/v1/apps/{application-id}/users-messages" send-users-messages-request :portkey.aws.pinpoint/send-users-messages-request {:payload "SendUsersMessageRequest", :move {}, :headers {}, :uri {"application-id" "ApplicationId"}, :querystring {}} 200 :portkey.aws.pinpoint/send-users-messages-response {"BadRequestException" :portkey.aws.pinpoint/bad-request-exception, "InternalServerErrorException" :portkey.aws.pinpoint/internal-server-error-exception, "ForbiddenException" :portkey.aws.pinpoint/forbidden-exception, "NotFoundException" :portkey.aws.pinpoint/not-found-exception, "MethodNotAllowedException" :portkey.aws.pinpoint/method-not-allowed-exception, "TooManyRequestsException" :portkey.aws.pinpoint/too-many-requests-exception})))
(clojure.spec.alpha/fdef send-users-messages :args (clojure.spec.alpha/tuple :portkey.aws.pinpoint/send-users-messages-request) :ret (clojure.spec.alpha/and :portkey.aws.pinpoint/send-users-messages-response))

(clojure.core/defn get-event-stream "Returns the event stream for an app." ([get-event-stream-request] (portkey.aws/-rest-json-call portkey.aws.pinpoint/endpoints "GET" "/v1/apps/{application-id}/eventstream" get-event-stream-request :portkey.aws.pinpoint/get-event-stream-request {:payload nil, :move {}, :headers {}, :uri {"application-id" "ApplicationId"}, :querystring {}} 200 :portkey.aws.pinpoint/get-event-stream-response {"BadRequestException" :portkey.aws.pinpoint/bad-request-exception, "InternalServerErrorException" :portkey.aws.pinpoint/internal-server-error-exception, "ForbiddenException" :portkey.aws.pinpoint/forbidden-exception, "NotFoundException" :portkey.aws.pinpoint/not-found-exception, "MethodNotAllowedException" :portkey.aws.pinpoint/method-not-allowed-exception, "TooManyRequestsException" :portkey.aws.pinpoint/too-many-requests-exception})))
(clojure.spec.alpha/fdef get-event-stream :args (clojure.spec.alpha/tuple :portkey.aws.pinpoint/get-event-stream-request) :ret (clojure.spec.alpha/and :portkey.aws.pinpoint/get-event-stream-response))

(clojure.core/defn update-baidu-channel "Update a BAIDU GCM channel" ([update-baidu-channel-request] (portkey.aws/-rest-json-call portkey.aws.pinpoint/endpoints "PUT" "/v1/apps/{application-id}/channels/baidu" update-baidu-channel-request :portkey.aws.pinpoint/update-baidu-channel-request {:payload "BaiduChannelRequest", :move {}, :headers {}, :uri {"application-id" "ApplicationId"}, :querystring {}} 200 :portkey.aws.pinpoint/update-baidu-channel-response {"BadRequestException" :portkey.aws.pinpoint/bad-request-exception, "InternalServerErrorException" :portkey.aws.pinpoint/internal-server-error-exception, "ForbiddenException" :portkey.aws.pinpoint/forbidden-exception, "NotFoundException" :portkey.aws.pinpoint/not-found-exception, "MethodNotAllowedException" :portkey.aws.pinpoint/method-not-allowed-exception, "TooManyRequestsException" :portkey.aws.pinpoint/too-many-requests-exception})))
(clojure.spec.alpha/fdef update-baidu-channel :args (clojure.spec.alpha/tuple :portkey.aws.pinpoint/update-baidu-channel-request) :ret (clojure.spec.alpha/and :portkey.aws.pinpoint/update-baidu-channel-response))

(clojure.core/defn get-campaign-version "Returns information about a specific version of a campaign." ([get-campaign-version-request] (portkey.aws/-rest-json-call portkey.aws.pinpoint/endpoints "GET" "/v1/apps/{application-id}/campaigns/{campaign-id}/versions/{version}" get-campaign-version-request :portkey.aws.pinpoint/get-campaign-version-request {:payload nil, :move {}, :headers {}, :uri {"application-id" "ApplicationId", "campaign-id" "CampaignId", "version" "Version"}, :querystring {}} 200 :portkey.aws.pinpoint/get-campaign-version-response {"BadRequestException" :portkey.aws.pinpoint/bad-request-exception, "InternalServerErrorException" :portkey.aws.pinpoint/internal-server-error-exception, "ForbiddenException" :portkey.aws.pinpoint/forbidden-exception, "NotFoundException" :portkey.aws.pinpoint/not-found-exception, "MethodNotAllowedException" :portkey.aws.pinpoint/method-not-allowed-exception, "TooManyRequestsException" :portkey.aws.pinpoint/too-many-requests-exception})))
(clojure.spec.alpha/fdef get-campaign-version :args (clojure.spec.alpha/tuple :portkey.aws.pinpoint/get-campaign-version-request) :ret (clojure.spec.alpha/and :portkey.aws.pinpoint/get-campaign-version-response))

(clojure.core/defn get-campaign-versions "Returns information about your campaign versions." ([get-campaign-versions-request] (portkey.aws/-rest-json-call portkey.aws.pinpoint/endpoints "GET" "/v1/apps/{application-id}/campaigns/{campaign-id}/versions" get-campaign-versions-request :portkey.aws.pinpoint/get-campaign-versions-request {:payload nil, :move {}, :headers {}, :uri {"application-id" "ApplicationId", "campaign-id" "CampaignId"}, :querystring {"page-size" "PageSize", "token" "Token"}} 200 :portkey.aws.pinpoint/get-campaign-versions-response {"BadRequestException" :portkey.aws.pinpoint/bad-request-exception, "InternalServerErrorException" :portkey.aws.pinpoint/internal-server-error-exception, "ForbiddenException" :portkey.aws.pinpoint/forbidden-exception, "NotFoundException" :portkey.aws.pinpoint/not-found-exception, "MethodNotAllowedException" :portkey.aws.pinpoint/method-not-allowed-exception, "TooManyRequestsException" :portkey.aws.pinpoint/too-many-requests-exception})))
(clojure.spec.alpha/fdef get-campaign-versions :args (clojure.spec.alpha/tuple :portkey.aws.pinpoint/get-campaign-versions-request) :ret (clojure.spec.alpha/and :portkey.aws.pinpoint/get-campaign-versions-response))

(clojure.core/defn get-export-jobs "Returns information about your export jobs." ([get-export-jobs-request] (portkey.aws/-rest-json-call portkey.aws.pinpoint/endpoints "GET" "/v1/apps/{application-id}/jobs/export" get-export-jobs-request :portkey.aws.pinpoint/get-export-jobs-request {:payload nil, :move {}, :headers {}, :uri {"application-id" "ApplicationId"}, :querystring {"page-size" "PageSize", "token" "Token"}} 200 :portkey.aws.pinpoint/get-export-jobs-response {"BadRequestException" :portkey.aws.pinpoint/bad-request-exception, "InternalServerErrorException" :portkey.aws.pinpoint/internal-server-error-exception, "ForbiddenException" :portkey.aws.pinpoint/forbidden-exception, "NotFoundException" :portkey.aws.pinpoint/not-found-exception, "MethodNotAllowedException" :portkey.aws.pinpoint/method-not-allowed-exception, "TooManyRequestsException" :portkey.aws.pinpoint/too-many-requests-exception})))
(clojure.spec.alpha/fdef get-export-jobs :args (clojure.spec.alpha/tuple :portkey.aws.pinpoint/get-export-jobs-request) :ret (clojure.spec.alpha/and :portkey.aws.pinpoint/get-export-jobs-response))

(clojure.core/defn delete-apns-voip-sandbox-channel "Delete an APNS VoIP sandbox channel" ([delete-apns-voip-sandbox-channel-request] (portkey.aws/-rest-json-call portkey.aws.pinpoint/endpoints "DELETE" "/v1/apps/{application-id}/channels/apns_voip_sandbox" delete-apns-voip-sandbox-channel-request :portkey.aws.pinpoint/delete-apns-voip-sandbox-channel-request {:payload nil, :move {}, :headers {}, :uri {"application-id" "ApplicationId"}, :querystring {}} 200 :portkey.aws.pinpoint/delete-apns-voip-sandbox-channel-response {"BadRequestException" :portkey.aws.pinpoint/bad-request-exception, "InternalServerErrorException" :portkey.aws.pinpoint/internal-server-error-exception, "ForbiddenException" :portkey.aws.pinpoint/forbidden-exception, "NotFoundException" :portkey.aws.pinpoint/not-found-exception, "MethodNotAllowedException" :portkey.aws.pinpoint/method-not-allowed-exception, "TooManyRequestsException" :portkey.aws.pinpoint/too-many-requests-exception})))
(clojure.spec.alpha/fdef delete-apns-voip-sandbox-channel :args (clojure.spec.alpha/tuple :portkey.aws.pinpoint/delete-apns-voip-sandbox-channel-request) :ret (clojure.spec.alpha/and :portkey.aws.pinpoint/delete-apns-voip-sandbox-channel-response))

(clojure.core/defn get-gcm-channel "Returns information about the GCM channel for an app." ([get-gcm-channel-request] (portkey.aws/-rest-json-call portkey.aws.pinpoint/endpoints "GET" "/v1/apps/{application-id}/channels/gcm" get-gcm-channel-request :portkey.aws.pinpoint/get-gcm-channel-request {:payload nil, :move {}, :headers {}, :uri {"application-id" "ApplicationId"}, :querystring {}} 200 :portkey.aws.pinpoint/get-gcm-channel-response {"BadRequestException" :portkey.aws.pinpoint/bad-request-exception, "InternalServerErrorException" :portkey.aws.pinpoint/internal-server-error-exception, "ForbiddenException" :portkey.aws.pinpoint/forbidden-exception, "NotFoundException" :portkey.aws.pinpoint/not-found-exception, "MethodNotAllowedException" :portkey.aws.pinpoint/method-not-allowed-exception, "TooManyRequestsException" :portkey.aws.pinpoint/too-many-requests-exception})))
(clojure.spec.alpha/fdef get-gcm-channel :args (clojure.spec.alpha/tuple :portkey.aws.pinpoint/get-gcm-channel-request) :ret (clojure.spec.alpha/and :portkey.aws.pinpoint/get-gcm-channel-response))

(clojure.core/defn update-campaign "Use to update a campaign." ([update-campaign-request] (portkey.aws/-rest-json-call portkey.aws.pinpoint/endpoints "PUT" "/v1/apps/{application-id}/campaigns/{campaign-id}" update-campaign-request :portkey.aws.pinpoint/update-campaign-request {:payload "WriteCampaignRequest", :move {}, :headers {}, :uri {"application-id" "ApplicationId", "campaign-id" "CampaignId"}, :querystring {}} 200 :portkey.aws.pinpoint/update-campaign-response {"BadRequestException" :portkey.aws.pinpoint/bad-request-exception, "InternalServerErrorException" :portkey.aws.pinpoint/internal-server-error-exception, "ForbiddenException" :portkey.aws.pinpoint/forbidden-exception, "NotFoundException" :portkey.aws.pinpoint/not-found-exception, "MethodNotAllowedException" :portkey.aws.pinpoint/method-not-allowed-exception, "TooManyRequestsException" :portkey.aws.pinpoint/too-many-requests-exception})))
(clojure.spec.alpha/fdef update-campaign :args (clojure.spec.alpha/tuple :portkey.aws.pinpoint/update-campaign-request) :ret (clojure.spec.alpha/and :portkey.aws.pinpoint/update-campaign-response))

(clojure.core/defn get-segments "Used to get information about your segments." ([get-segments-request] (portkey.aws/-rest-json-call portkey.aws.pinpoint/endpoints "GET" "/v1/apps/{application-id}/segments" get-segments-request :portkey.aws.pinpoint/get-segments-request {:payload nil, :move {}, :headers {}, :uri {"application-id" "ApplicationId"}, :querystring {"page-size" "PageSize", "token" "Token"}} 200 :portkey.aws.pinpoint/get-segments-response {"BadRequestException" :portkey.aws.pinpoint/bad-request-exception, "InternalServerErrorException" :portkey.aws.pinpoint/internal-server-error-exception, "ForbiddenException" :portkey.aws.pinpoint/forbidden-exception, "NotFoundException" :portkey.aws.pinpoint/not-found-exception, "MethodNotAllowedException" :portkey.aws.pinpoint/method-not-allowed-exception, "TooManyRequestsException" :portkey.aws.pinpoint/too-many-requests-exception})))
(clojure.spec.alpha/fdef get-segments :args (clojure.spec.alpha/tuple :portkey.aws.pinpoint/get-segments-request) :ret (clojure.spec.alpha/and :portkey.aws.pinpoint/get-segments-response))

(clojure.core/defn create-import-job "Creates or updates an import job." ([create-import-job-request] (portkey.aws/-rest-json-call portkey.aws.pinpoint/endpoints "POST" "/v1/apps/{application-id}/jobs/import" create-import-job-request :portkey.aws.pinpoint/create-import-job-request {:payload "ImportJobRequest", :move {}, :headers {}, :uri {"application-id" "ApplicationId"}, :querystring {}} 201 :portkey.aws.pinpoint/create-import-job-response {"BadRequestException" :portkey.aws.pinpoint/bad-request-exception, "InternalServerErrorException" :portkey.aws.pinpoint/internal-server-error-exception, "ForbiddenException" :portkey.aws.pinpoint/forbidden-exception, "NotFoundException" :portkey.aws.pinpoint/not-found-exception, "MethodNotAllowedException" :portkey.aws.pinpoint/method-not-allowed-exception, "TooManyRequestsException" :portkey.aws.pinpoint/too-many-requests-exception})))
(clojure.spec.alpha/fdef create-import-job :args (clojure.spec.alpha/tuple :portkey.aws.pinpoint/create-import-job-request) :ret (clojure.spec.alpha/and :portkey.aws.pinpoint/create-import-job-response))

(clojure.core/defn update-application-settings "Used to update the settings for an app." ([update-application-settings-request] (portkey.aws/-rest-json-call portkey.aws.pinpoint/endpoints "PUT" "/v1/apps/{application-id}/settings" update-application-settings-request :portkey.aws.pinpoint/update-application-settings-request {:payload "WriteApplicationSettingsRequest", :move {}, :headers {}, :uri {"application-id" "ApplicationId"}, :querystring {}} 200 :portkey.aws.pinpoint/update-application-settings-response {"BadRequestException" :portkey.aws.pinpoint/bad-request-exception, "InternalServerErrorException" :portkey.aws.pinpoint/internal-server-error-exception, "ForbiddenException" :portkey.aws.pinpoint/forbidden-exception, "NotFoundException" :portkey.aws.pinpoint/not-found-exception, "MethodNotAllowedException" :portkey.aws.pinpoint/method-not-allowed-exception, "TooManyRequestsException" :portkey.aws.pinpoint/too-many-requests-exception})))
(clojure.spec.alpha/fdef update-application-settings :args (clojure.spec.alpha/tuple :portkey.aws.pinpoint/update-application-settings-request) :ret (clojure.spec.alpha/and :portkey.aws.pinpoint/update-application-settings-response))

(clojure.core/defn get-campaign "Returns information about a campaign." ([get-campaign-request] (portkey.aws/-rest-json-call portkey.aws.pinpoint/endpoints "GET" "/v1/apps/{application-id}/campaigns/{campaign-id}" get-campaign-request :portkey.aws.pinpoint/get-campaign-request {:payload nil, :move {}, :headers {}, :uri {"application-id" "ApplicationId", "campaign-id" "CampaignId"}, :querystring {}} 200 :portkey.aws.pinpoint/get-campaign-response {"BadRequestException" :portkey.aws.pinpoint/bad-request-exception, "InternalServerErrorException" :portkey.aws.pinpoint/internal-server-error-exception, "ForbiddenException" :portkey.aws.pinpoint/forbidden-exception, "NotFoundException" :portkey.aws.pinpoint/not-found-exception, "MethodNotAllowedException" :portkey.aws.pinpoint/method-not-allowed-exception, "TooManyRequestsException" :portkey.aws.pinpoint/too-many-requests-exception})))
(clojure.spec.alpha/fdef get-campaign :args (clojure.spec.alpha/tuple :portkey.aws.pinpoint/get-campaign-request) :ret (clojure.spec.alpha/and :portkey.aws.pinpoint/get-campaign-response))

(clojure.core/defn get-import-job "Returns information about an import job." ([get-import-job-request] (portkey.aws/-rest-json-call portkey.aws.pinpoint/endpoints "GET" "/v1/apps/{application-id}/jobs/import/{job-id}" get-import-job-request :portkey.aws.pinpoint/get-import-job-request {:payload nil, :move {}, :headers {}, :uri {"application-id" "ApplicationId", "job-id" "JobId"}, :querystring {}} 200 :portkey.aws.pinpoint/get-import-job-response {"BadRequestException" :portkey.aws.pinpoint/bad-request-exception, "InternalServerErrorException" :portkey.aws.pinpoint/internal-server-error-exception, "ForbiddenException" :portkey.aws.pinpoint/forbidden-exception, "NotFoundException" :portkey.aws.pinpoint/not-found-exception, "MethodNotAllowedException" :portkey.aws.pinpoint/method-not-allowed-exception, "TooManyRequestsException" :portkey.aws.pinpoint/too-many-requests-exception})))
(clojure.spec.alpha/fdef get-import-job :args (clojure.spec.alpha/tuple :portkey.aws.pinpoint/get-import-job-request) :ret (clojure.spec.alpha/and :portkey.aws.pinpoint/get-import-job-response))

(clojure.core/defn delete-adm-channel "Delete an ADM channel" ([delete-adm-channel-request] (portkey.aws/-rest-json-call portkey.aws.pinpoint/endpoints "DELETE" "/v1/apps/{application-id}/channels/adm" delete-adm-channel-request :portkey.aws.pinpoint/delete-adm-channel-request {:payload nil, :move {}, :headers {}, :uri {"application-id" "ApplicationId"}, :querystring {}} 200 :portkey.aws.pinpoint/delete-adm-channel-response {"BadRequestException" :portkey.aws.pinpoint/bad-request-exception, "InternalServerErrorException" :portkey.aws.pinpoint/internal-server-error-exception, "ForbiddenException" :portkey.aws.pinpoint/forbidden-exception, "NotFoundException" :portkey.aws.pinpoint/not-found-exception, "MethodNotAllowedException" :portkey.aws.pinpoint/method-not-allowed-exception, "TooManyRequestsException" :portkey.aws.pinpoint/too-many-requests-exception})))
(clojure.spec.alpha/fdef delete-adm-channel :args (clojure.spec.alpha/tuple :portkey.aws.pinpoint/delete-adm-channel-request) :ret (clojure.spec.alpha/and :portkey.aws.pinpoint/delete-adm-channel-response))

(clojure.core/defn update-endpoint "Use to update an endpoint." ([update-endpoint-request] (portkey.aws/-rest-json-call portkey.aws.pinpoint/endpoints "PUT" "/v1/apps/{application-id}/endpoints/{endpoint-id}" update-endpoint-request :portkey.aws.pinpoint/update-endpoint-request {:payload "EndpointRequest", :move {}, :headers {}, :uri {"application-id" "ApplicationId", "endpoint-id" "EndpointId"}, :querystring {}} 202 :portkey.aws.pinpoint/update-endpoint-response {"BadRequestException" :portkey.aws.pinpoint/bad-request-exception, "InternalServerErrorException" :portkey.aws.pinpoint/internal-server-error-exception, "ForbiddenException" :portkey.aws.pinpoint/forbidden-exception, "NotFoundException" :portkey.aws.pinpoint/not-found-exception, "MethodNotAllowedException" :portkey.aws.pinpoint/method-not-allowed-exception, "TooManyRequestsException" :portkey.aws.pinpoint/too-many-requests-exception})))
(clojure.spec.alpha/fdef update-endpoint :args (clojure.spec.alpha/tuple :portkey.aws.pinpoint/update-endpoint-request) :ret (clojure.spec.alpha/and :portkey.aws.pinpoint/update-endpoint-response))

(clojure.core/defn get-application-settings "Used to request the settings for an app." ([get-application-settings-request] (portkey.aws/-rest-json-call portkey.aws.pinpoint/endpoints "GET" "/v1/apps/{application-id}/settings" get-application-settings-request :portkey.aws.pinpoint/get-application-settings-request {:payload nil, :move {}, :headers {}, :uri {"application-id" "ApplicationId"}, :querystring {}} 200 :portkey.aws.pinpoint/get-application-settings-response {"BadRequestException" :portkey.aws.pinpoint/bad-request-exception, "InternalServerErrorException" :portkey.aws.pinpoint/internal-server-error-exception, "ForbiddenException" :portkey.aws.pinpoint/forbidden-exception, "NotFoundException" :portkey.aws.pinpoint/not-found-exception, "MethodNotAllowedException" :portkey.aws.pinpoint/method-not-allowed-exception, "TooManyRequestsException" :portkey.aws.pinpoint/too-many-requests-exception})))
(clojure.spec.alpha/fdef get-application-settings :args (clojure.spec.alpha/tuple :portkey.aws.pinpoint/get-application-settings-request) :ret (clojure.spec.alpha/and :portkey.aws.pinpoint/get-application-settings-response))

(clojure.core/defn get-campaigns "Returns information about your campaigns." ([get-campaigns-request] (portkey.aws/-rest-json-call portkey.aws.pinpoint/endpoints "GET" "/v1/apps/{application-id}/campaigns" get-campaigns-request :portkey.aws.pinpoint/get-campaigns-request {:payload nil, :move {}, :headers {}, :uri {"application-id" "ApplicationId"}, :querystring {"page-size" "PageSize", "token" "Token"}} 200 :portkey.aws.pinpoint/get-campaigns-response {"BadRequestException" :portkey.aws.pinpoint/bad-request-exception, "InternalServerErrorException" :portkey.aws.pinpoint/internal-server-error-exception, "ForbiddenException" :portkey.aws.pinpoint/forbidden-exception, "NotFoundException" :portkey.aws.pinpoint/not-found-exception, "MethodNotAllowedException" :portkey.aws.pinpoint/method-not-allowed-exception, "TooManyRequestsException" :portkey.aws.pinpoint/too-many-requests-exception})))
(clojure.spec.alpha/fdef get-campaigns :args (clojure.spec.alpha/tuple :portkey.aws.pinpoint/get-campaigns-request) :ret (clojure.spec.alpha/and :portkey.aws.pinpoint/get-campaigns-response))

(clojure.core/defn update-email-channel "Update an email channel" ([update-email-channel-request] (portkey.aws/-rest-json-call portkey.aws.pinpoint/endpoints "PUT" "/v1/apps/{application-id}/channels/email" update-email-channel-request :portkey.aws.pinpoint/update-email-channel-request {:payload "EmailChannelRequest", :move {}, :headers {}, :uri {"application-id" "ApplicationId"}, :querystring {}} 200 :portkey.aws.pinpoint/update-email-channel-response {"BadRequestException" :portkey.aws.pinpoint/bad-request-exception, "InternalServerErrorException" :portkey.aws.pinpoint/internal-server-error-exception, "ForbiddenException" :portkey.aws.pinpoint/forbidden-exception, "NotFoundException" :portkey.aws.pinpoint/not-found-exception, "MethodNotAllowedException" :portkey.aws.pinpoint/method-not-allowed-exception, "TooManyRequestsException" :portkey.aws.pinpoint/too-many-requests-exception})))
(clojure.spec.alpha/fdef update-email-channel :args (clojure.spec.alpha/tuple :portkey.aws.pinpoint/update-email-channel-request) :ret (clojure.spec.alpha/and :portkey.aws.pinpoint/update-email-channel-response))

(clojure.core/defn create-campaign "Creates or updates a campaign." ([create-campaign-request] (portkey.aws/-rest-json-call portkey.aws.pinpoint/endpoints "POST" "/v1/apps/{application-id}/campaigns" create-campaign-request :portkey.aws.pinpoint/create-campaign-request {:payload "WriteCampaignRequest", :move {}, :headers {}, :uri {"application-id" "ApplicationId"}, :querystring {}} 201 :portkey.aws.pinpoint/create-campaign-response {"BadRequestException" :portkey.aws.pinpoint/bad-request-exception, "InternalServerErrorException" :portkey.aws.pinpoint/internal-server-error-exception, "ForbiddenException" :portkey.aws.pinpoint/forbidden-exception, "NotFoundException" :portkey.aws.pinpoint/not-found-exception, "MethodNotAllowedException" :portkey.aws.pinpoint/method-not-allowed-exception, "TooManyRequestsException" :portkey.aws.pinpoint/too-many-requests-exception})))
(clojure.spec.alpha/fdef create-campaign :args (clojure.spec.alpha/tuple :portkey.aws.pinpoint/create-campaign-request) :ret (clojure.spec.alpha/and :portkey.aws.pinpoint/create-campaign-response))

(clojure.core/defn send-messages "Send a batch of messages" ([send-messages-request] (portkey.aws/-rest-json-call portkey.aws.pinpoint/endpoints "POST" "/v1/apps/{application-id}/messages" send-messages-request :portkey.aws.pinpoint/send-messages-request {:payload "MessageRequest", :move {}, :headers {}, :uri {"application-id" "ApplicationId"}, :querystring {}} 200 :portkey.aws.pinpoint/send-messages-response {"BadRequestException" :portkey.aws.pinpoint/bad-request-exception, "InternalServerErrorException" :portkey.aws.pinpoint/internal-server-error-exception, "ForbiddenException" :portkey.aws.pinpoint/forbidden-exception, "NotFoundException" :portkey.aws.pinpoint/not-found-exception, "MethodNotAllowedException" :portkey.aws.pinpoint/method-not-allowed-exception, "TooManyRequestsException" :portkey.aws.pinpoint/too-many-requests-exception})))
(clojure.spec.alpha/fdef send-messages :args (clojure.spec.alpha/tuple :portkey.aws.pinpoint/send-messages-request) :ret (clojure.spec.alpha/and :portkey.aws.pinpoint/send-messages-response))

(clojure.core/defn update-gcm-channel "Use to update the GCM channel for an app." ([update-gcm-channel-request] (portkey.aws/-rest-json-call portkey.aws.pinpoint/endpoints "PUT" "/v1/apps/{application-id}/channels/gcm" update-gcm-channel-request :portkey.aws.pinpoint/update-gcm-channel-request {:payload "GCMChannelRequest", :move {}, :headers {}, :uri {"application-id" "ApplicationId"}, :querystring {}} 200 :portkey.aws.pinpoint/update-gcm-channel-response {"BadRequestException" :portkey.aws.pinpoint/bad-request-exception, "InternalServerErrorException" :portkey.aws.pinpoint/internal-server-error-exception, "ForbiddenException" :portkey.aws.pinpoint/forbidden-exception, "NotFoundException" :portkey.aws.pinpoint/not-found-exception, "MethodNotAllowedException" :portkey.aws.pinpoint/method-not-allowed-exception, "TooManyRequestsException" :portkey.aws.pinpoint/too-many-requests-exception})))
(clojure.spec.alpha/fdef update-gcm-channel :args (clojure.spec.alpha/tuple :portkey.aws.pinpoint/update-gcm-channel-request) :ret (clojure.spec.alpha/and :portkey.aws.pinpoint/update-gcm-channel-response))

(clojure.core/defn get-segment-versions "Returns information about your segment versions." ([get-segment-versions-request] (portkey.aws/-rest-json-call portkey.aws.pinpoint/endpoints "GET" "/v1/apps/{application-id}/segments/{segment-id}/versions" get-segment-versions-request :portkey.aws.pinpoint/get-segment-versions-request {:payload nil, :move {}, :headers {}, :uri {"application-id" "ApplicationId", "segment-id" "SegmentId"}, :querystring {"page-size" "PageSize", "token" "Token"}} 200 :portkey.aws.pinpoint/get-segment-versions-response {"BadRequestException" :portkey.aws.pinpoint/bad-request-exception, "InternalServerErrorException" :portkey.aws.pinpoint/internal-server-error-exception, "ForbiddenException" :portkey.aws.pinpoint/forbidden-exception, "NotFoundException" :portkey.aws.pinpoint/not-found-exception, "MethodNotAllowedException" :portkey.aws.pinpoint/method-not-allowed-exception, "TooManyRequestsException" :portkey.aws.pinpoint/too-many-requests-exception})))
(clojure.spec.alpha/fdef get-segment-versions :args (clojure.spec.alpha/tuple :portkey.aws.pinpoint/get-segment-versions-request) :ret (clojure.spec.alpha/and :portkey.aws.pinpoint/get-segment-versions-response))

(clojure.core/defn get-adm-channel "Get an ADM channel" ([get-adm-channel-request] (portkey.aws/-rest-json-call portkey.aws.pinpoint/endpoints "GET" "/v1/apps/{application-id}/channels/adm" get-adm-channel-request :portkey.aws.pinpoint/get-adm-channel-request {:payload nil, :move {}, :headers {}, :uri {"application-id" "ApplicationId"}, :querystring {}} 200 :portkey.aws.pinpoint/get-adm-channel-response {"BadRequestException" :portkey.aws.pinpoint/bad-request-exception, "InternalServerErrorException" :portkey.aws.pinpoint/internal-server-error-exception, "ForbiddenException" :portkey.aws.pinpoint/forbidden-exception, "NotFoundException" :portkey.aws.pinpoint/not-found-exception, "MethodNotAllowedException" :portkey.aws.pinpoint/method-not-allowed-exception, "TooManyRequestsException" :portkey.aws.pinpoint/too-many-requests-exception})))
(clojure.spec.alpha/fdef get-adm-channel :args (clojure.spec.alpha/tuple :portkey.aws.pinpoint/get-adm-channel-request) :ret (clojure.spec.alpha/and :portkey.aws.pinpoint/get-adm-channel-response))

(clojure.core/defn delete-app "Deletes an app." ([delete-app-request] (portkey.aws/-rest-json-call portkey.aws.pinpoint/endpoints "DELETE" "/v1/apps/{application-id}" delete-app-request :portkey.aws.pinpoint/delete-app-request {:payload nil, :move {}, :headers {}, :uri {"application-id" "ApplicationId"}, :querystring {}} 200 :portkey.aws.pinpoint/delete-app-response {"BadRequestException" :portkey.aws.pinpoint/bad-request-exception, "InternalServerErrorException" :portkey.aws.pinpoint/internal-server-error-exception, "ForbiddenException" :portkey.aws.pinpoint/forbidden-exception, "NotFoundException" :portkey.aws.pinpoint/not-found-exception, "MethodNotAllowedException" :portkey.aws.pinpoint/method-not-allowed-exception, "TooManyRequestsException" :portkey.aws.pinpoint/too-many-requests-exception})))
(clojure.spec.alpha/fdef delete-app :args (clojure.spec.alpha/tuple :portkey.aws.pinpoint/delete-app-request) :ret (clojure.spec.alpha/and :portkey.aws.pinpoint/delete-app-response))

(clojure.core/defn create-app "Creates or updates an app." ([create-app-request] (portkey.aws/-rest-json-call portkey.aws.pinpoint/endpoints "POST" "/v1/apps" create-app-request :portkey.aws.pinpoint/create-app-request {:payload "CreateApplicationRequest", :move {}, :headers {}, :uri {}, :querystring {}} 201 :portkey.aws.pinpoint/create-app-response {"BadRequestException" :portkey.aws.pinpoint/bad-request-exception, "InternalServerErrorException" :portkey.aws.pinpoint/internal-server-error-exception, "ForbiddenException" :portkey.aws.pinpoint/forbidden-exception, "NotFoundException" :portkey.aws.pinpoint/not-found-exception, "MethodNotAllowedException" :portkey.aws.pinpoint/method-not-allowed-exception, "TooManyRequestsException" :portkey.aws.pinpoint/too-many-requests-exception})))
(clojure.spec.alpha/fdef create-app :args (clojure.spec.alpha/tuple :portkey.aws.pinpoint/create-app-request) :ret (clojure.spec.alpha/and :portkey.aws.pinpoint/create-app-response))

(clojure.core/defn delete-apns-sandbox-channel "Delete an APNS sandbox channel" ([delete-apns-sandbox-channel-request] (portkey.aws/-rest-json-call portkey.aws.pinpoint/endpoints "DELETE" "/v1/apps/{application-id}/channels/apns_sandbox" delete-apns-sandbox-channel-request :portkey.aws.pinpoint/delete-apns-sandbox-channel-request {:payload nil, :move {}, :headers {}, :uri {"application-id" "ApplicationId"}, :querystring {}} 200 :portkey.aws.pinpoint/delete-apns-sandbox-channel-response {"BadRequestException" :portkey.aws.pinpoint/bad-request-exception, "InternalServerErrorException" :portkey.aws.pinpoint/internal-server-error-exception, "ForbiddenException" :portkey.aws.pinpoint/forbidden-exception, "NotFoundException" :portkey.aws.pinpoint/not-found-exception, "MethodNotAllowedException" :portkey.aws.pinpoint/method-not-allowed-exception, "TooManyRequestsException" :portkey.aws.pinpoint/too-many-requests-exception})))
(clojure.spec.alpha/fdef delete-apns-sandbox-channel :args (clojure.spec.alpha/tuple :portkey.aws.pinpoint/delete-apns-sandbox-channel-request) :ret (clojure.spec.alpha/and :portkey.aws.pinpoint/delete-apns-sandbox-channel-response))

(clojure.core/defn delete-gcm-channel "Deletes the GCM channel for an app." ([delete-gcm-channel-request] (portkey.aws/-rest-json-call portkey.aws.pinpoint/endpoints "DELETE" "/v1/apps/{application-id}/channels/gcm" delete-gcm-channel-request :portkey.aws.pinpoint/delete-gcm-channel-request {:payload nil, :move {}, :headers {}, :uri {"application-id" "ApplicationId"}, :querystring {}} 200 :portkey.aws.pinpoint/delete-gcm-channel-response {"BadRequestException" :portkey.aws.pinpoint/bad-request-exception, "InternalServerErrorException" :portkey.aws.pinpoint/internal-server-error-exception, "ForbiddenException" :portkey.aws.pinpoint/forbidden-exception, "NotFoundException" :portkey.aws.pinpoint/not-found-exception, "MethodNotAllowedException" :portkey.aws.pinpoint/method-not-allowed-exception, "TooManyRequestsException" :portkey.aws.pinpoint/too-many-requests-exception})))
(clojure.spec.alpha/fdef delete-gcm-channel :args (clojure.spec.alpha/tuple :portkey.aws.pinpoint/delete-gcm-channel-request) :ret (clojure.spec.alpha/and :portkey.aws.pinpoint/delete-gcm-channel-response))

(clojure.core/defn get-apns-voip-channel "Get an APNS VoIP channel" ([get-apns-voip-channel-request] (portkey.aws/-rest-json-call portkey.aws.pinpoint/endpoints "GET" "/v1/apps/{application-id}/channels/apns_voip" get-apns-voip-channel-request :portkey.aws.pinpoint/get-apns-voip-channel-request {:payload nil, :move {}, :headers {}, :uri {"application-id" "ApplicationId"}, :querystring {}} 200 :portkey.aws.pinpoint/get-apns-voip-channel-response {"BadRequestException" :portkey.aws.pinpoint/bad-request-exception, "InternalServerErrorException" :portkey.aws.pinpoint/internal-server-error-exception, "ForbiddenException" :portkey.aws.pinpoint/forbidden-exception, "NotFoundException" :portkey.aws.pinpoint/not-found-exception, "MethodNotAllowedException" :portkey.aws.pinpoint/method-not-allowed-exception, "TooManyRequestsException" :portkey.aws.pinpoint/too-many-requests-exception})))
(clojure.spec.alpha/fdef get-apns-voip-channel :args (clojure.spec.alpha/tuple :portkey.aws.pinpoint/get-apns-voip-channel-request) :ret (clojure.spec.alpha/and :portkey.aws.pinpoint/get-apns-voip-channel-response))

(clojure.core/defn delete-campaign "Deletes a campaign." ([delete-campaign-request] (portkey.aws/-rest-json-call portkey.aws.pinpoint/endpoints "DELETE" "/v1/apps/{application-id}/campaigns/{campaign-id}" delete-campaign-request :portkey.aws.pinpoint/delete-campaign-request {:payload nil, :move {}, :headers {}, :uri {"application-id" "ApplicationId", "campaign-id" "CampaignId"}, :querystring {}} 200 :portkey.aws.pinpoint/delete-campaign-response {"BadRequestException" :portkey.aws.pinpoint/bad-request-exception, "InternalServerErrorException" :portkey.aws.pinpoint/internal-server-error-exception, "ForbiddenException" :portkey.aws.pinpoint/forbidden-exception, "NotFoundException" :portkey.aws.pinpoint/not-found-exception, "MethodNotAllowedException" :portkey.aws.pinpoint/method-not-allowed-exception, "TooManyRequestsException" :portkey.aws.pinpoint/too-many-requests-exception})))
(clojure.spec.alpha/fdef delete-campaign :args (clojure.spec.alpha/tuple :portkey.aws.pinpoint/delete-campaign-request) :ret (clojure.spec.alpha/and :portkey.aws.pinpoint/delete-campaign-response))

(clojure.core/defn get-app "Returns information about an app." ([get-app-request] (portkey.aws/-rest-json-call portkey.aws.pinpoint/endpoints "GET" "/v1/apps/{application-id}" get-app-request :portkey.aws.pinpoint/get-app-request {:payload nil, :move {}, :headers {}, :uri {"application-id" "ApplicationId"}, :querystring {}} 200 :portkey.aws.pinpoint/get-app-response {"BadRequestException" :portkey.aws.pinpoint/bad-request-exception, "InternalServerErrorException" :portkey.aws.pinpoint/internal-server-error-exception, "ForbiddenException" :portkey.aws.pinpoint/forbidden-exception, "NotFoundException" :portkey.aws.pinpoint/not-found-exception, "MethodNotAllowedException" :portkey.aws.pinpoint/method-not-allowed-exception, "TooManyRequestsException" :portkey.aws.pinpoint/too-many-requests-exception})))
(clojure.spec.alpha/fdef get-app :args (clojure.spec.alpha/tuple :portkey.aws.pinpoint/get-app-request) :ret (clojure.spec.alpha/and :portkey.aws.pinpoint/get-app-response))

(clojure.core/defn update-apns-voip-sandbox-channel "Update an APNS VoIP sandbox channel" ([update-apns-voip-sandbox-channel-request] (portkey.aws/-rest-json-call portkey.aws.pinpoint/endpoints "PUT" "/v1/apps/{application-id}/channels/apns_voip_sandbox" update-apns-voip-sandbox-channel-request :portkey.aws.pinpoint/update-apns-voip-sandbox-channel-request {:payload "APNSVoipSandboxChannelRequest", :move {}, :headers {}, :uri {"application-id" "ApplicationId"}, :querystring {}} 200 :portkey.aws.pinpoint/update-apns-voip-sandbox-channel-response {"BadRequestException" :portkey.aws.pinpoint/bad-request-exception, "InternalServerErrorException" :portkey.aws.pinpoint/internal-server-error-exception, "ForbiddenException" :portkey.aws.pinpoint/forbidden-exception, "NotFoundException" :portkey.aws.pinpoint/not-found-exception, "MethodNotAllowedException" :portkey.aws.pinpoint/method-not-allowed-exception, "TooManyRequestsException" :portkey.aws.pinpoint/too-many-requests-exception})))
(clojure.spec.alpha/fdef update-apns-voip-sandbox-channel :args (clojure.spec.alpha/tuple :portkey.aws.pinpoint/update-apns-voip-sandbox-channel-request) :ret (clojure.spec.alpha/and :portkey.aws.pinpoint/update-apns-voip-sandbox-channel-response))

(clojure.core/defn delete-segment "Deletes a segment." ([delete-segment-request] (portkey.aws/-rest-json-call portkey.aws.pinpoint/endpoints "DELETE" "/v1/apps/{application-id}/segments/{segment-id}" delete-segment-request :portkey.aws.pinpoint/delete-segment-request {:payload nil, :move {}, :headers {}, :uri {"application-id" "ApplicationId", "segment-id" "SegmentId"}, :querystring {}} 200 :portkey.aws.pinpoint/delete-segment-response {"BadRequestException" :portkey.aws.pinpoint/bad-request-exception, "InternalServerErrorException" :portkey.aws.pinpoint/internal-server-error-exception, "ForbiddenException" :portkey.aws.pinpoint/forbidden-exception, "NotFoundException" :portkey.aws.pinpoint/not-found-exception, "MethodNotAllowedException" :portkey.aws.pinpoint/method-not-allowed-exception, "TooManyRequestsException" :portkey.aws.pinpoint/too-many-requests-exception})))
(clojure.spec.alpha/fdef delete-segment :args (clojure.spec.alpha/tuple :portkey.aws.pinpoint/delete-segment-request) :ret (clojure.spec.alpha/and :portkey.aws.pinpoint/delete-segment-response))

(clojure.core/defn delete-apns-channel "Deletes the APNs channel for an app." ([delete-apns-channel-request] (portkey.aws/-rest-json-call portkey.aws.pinpoint/endpoints "DELETE" "/v1/apps/{application-id}/channels/apns" delete-apns-channel-request :portkey.aws.pinpoint/delete-apns-channel-request {:payload nil, :move {}, :headers {}, :uri {"application-id" "ApplicationId"}, :querystring {}} 200 :portkey.aws.pinpoint/delete-apns-channel-response {"BadRequestException" :portkey.aws.pinpoint/bad-request-exception, "InternalServerErrorException" :portkey.aws.pinpoint/internal-server-error-exception, "ForbiddenException" :portkey.aws.pinpoint/forbidden-exception, "NotFoundException" :portkey.aws.pinpoint/not-found-exception, "MethodNotAllowedException" :portkey.aws.pinpoint/method-not-allowed-exception, "TooManyRequestsException" :portkey.aws.pinpoint/too-many-requests-exception})))
(clojure.spec.alpha/fdef delete-apns-channel :args (clojure.spec.alpha/tuple :portkey.aws.pinpoint/delete-apns-channel-request) :ret (clojure.spec.alpha/and :portkey.aws.pinpoint/delete-apns-channel-response))

(clojure.core/defn update-segment "Use to update a segment." ([update-segment-request] (portkey.aws/-rest-json-call portkey.aws.pinpoint/endpoints "PUT" "/v1/apps/{application-id}/segments/{segment-id}" update-segment-request :portkey.aws.pinpoint/update-segment-request {:payload "WriteSegmentRequest", :move {}, :headers {}, :uri {"application-id" "ApplicationId", "segment-id" "SegmentId"}, :querystring {}} 200 :portkey.aws.pinpoint/update-segment-response {"BadRequestException" :portkey.aws.pinpoint/bad-request-exception, "InternalServerErrorException" :portkey.aws.pinpoint/internal-server-error-exception, "ForbiddenException" :portkey.aws.pinpoint/forbidden-exception, "NotFoundException" :portkey.aws.pinpoint/not-found-exception, "MethodNotAllowedException" :portkey.aws.pinpoint/method-not-allowed-exception, "TooManyRequestsException" :portkey.aws.pinpoint/too-many-requests-exception})))
(clojure.spec.alpha/fdef update-segment :args (clojure.spec.alpha/tuple :portkey.aws.pinpoint/update-segment-request) :ret (clojure.spec.alpha/and :portkey.aws.pinpoint/update-segment-response))

(clojure.core/defn delete-event-stream "Deletes the event stream for an app." ([delete-event-stream-request] (portkey.aws/-rest-json-call portkey.aws.pinpoint/endpoints "DELETE" "/v1/apps/{application-id}/eventstream" delete-event-stream-request :portkey.aws.pinpoint/delete-event-stream-request {:payload nil, :move {}, :headers {}, :uri {"application-id" "ApplicationId"}, :querystring {}} 200 :portkey.aws.pinpoint/delete-event-stream-response {"BadRequestException" :portkey.aws.pinpoint/bad-request-exception, "InternalServerErrorException" :portkey.aws.pinpoint/internal-server-error-exception, "ForbiddenException" :portkey.aws.pinpoint/forbidden-exception, "NotFoundException" :portkey.aws.pinpoint/not-found-exception, "MethodNotAllowedException" :portkey.aws.pinpoint/method-not-allowed-exception, "TooManyRequestsException" :portkey.aws.pinpoint/too-many-requests-exception})))
(clojure.spec.alpha/fdef delete-event-stream :args (clojure.spec.alpha/tuple :portkey.aws.pinpoint/delete-event-stream-request) :ret (clojure.spec.alpha/and :portkey.aws.pinpoint/delete-event-stream-response))

(clojure.core/defn get-apps "Returns information about your apps." ([] (get-apps {})) ([get-apps-request] (portkey.aws/-rest-json-call portkey.aws.pinpoint/endpoints "GET" "/v1/apps" get-apps-request :portkey.aws.pinpoint/get-apps-request {:payload nil, :move {}, :headers {}, :uri {}, :querystring {"page-size" "PageSize", "token" "Token"}} 200 :portkey.aws.pinpoint/get-apps-response {"BadRequestException" :portkey.aws.pinpoint/bad-request-exception, "InternalServerErrorException" :portkey.aws.pinpoint/internal-server-error-exception, "ForbiddenException" :portkey.aws.pinpoint/forbidden-exception, "NotFoundException" :portkey.aws.pinpoint/not-found-exception, "MethodNotAllowedException" :portkey.aws.pinpoint/method-not-allowed-exception, "TooManyRequestsException" :portkey.aws.pinpoint/too-many-requests-exception})))
(clojure.spec.alpha/fdef get-apps :args (clojure.spec.alpha/? :portkey.aws.pinpoint/get-apps-request) :ret (clojure.spec.alpha/and :portkey.aws.pinpoint/get-apps-response))

(clojure.core/defn get-endpoint "Returns information about an endpoint." ([get-endpoint-request] (portkey.aws/-rest-json-call portkey.aws.pinpoint/endpoints "GET" "/v1/apps/{application-id}/endpoints/{endpoint-id}" get-endpoint-request :portkey.aws.pinpoint/get-endpoint-request {:payload nil, :move {}, :headers {}, :uri {"application-id" "ApplicationId", "endpoint-id" "EndpointId"}, :querystring {}} 200 :portkey.aws.pinpoint/get-endpoint-response {"BadRequestException" :portkey.aws.pinpoint/bad-request-exception, "InternalServerErrorException" :portkey.aws.pinpoint/internal-server-error-exception, "ForbiddenException" :portkey.aws.pinpoint/forbidden-exception, "NotFoundException" :portkey.aws.pinpoint/not-found-exception, "MethodNotAllowedException" :portkey.aws.pinpoint/method-not-allowed-exception, "TooManyRequestsException" :portkey.aws.pinpoint/too-many-requests-exception})))
(clojure.spec.alpha/fdef get-endpoint :args (clojure.spec.alpha/tuple :portkey.aws.pinpoint/get-endpoint-request) :ret (clojure.spec.alpha/and :portkey.aws.pinpoint/get-endpoint-response))

(clojure.core/defn delete-endpoint "Deletes an endpoint." ([delete-endpoint-request] (portkey.aws/-rest-json-call portkey.aws.pinpoint/endpoints "DELETE" "/v1/apps/{application-id}/endpoints/{endpoint-id}" delete-endpoint-request :portkey.aws.pinpoint/delete-endpoint-request {:payload nil, :move {}, :headers {}, :uri {"application-id" "ApplicationId", "endpoint-id" "EndpointId"}, :querystring {}} 202 :portkey.aws.pinpoint/delete-endpoint-response {"BadRequestException" :portkey.aws.pinpoint/bad-request-exception, "InternalServerErrorException" :portkey.aws.pinpoint/internal-server-error-exception, "ForbiddenException" :portkey.aws.pinpoint/forbidden-exception, "NotFoundException" :portkey.aws.pinpoint/not-found-exception, "MethodNotAllowedException" :portkey.aws.pinpoint/method-not-allowed-exception, "TooManyRequestsException" :portkey.aws.pinpoint/too-many-requests-exception})))
(clojure.spec.alpha/fdef delete-endpoint :args (clojure.spec.alpha/tuple :portkey.aws.pinpoint/delete-endpoint-request) :ret (clojure.spec.alpha/and :portkey.aws.pinpoint/delete-endpoint-response))

(clojure.core/defn update-apns-sandbox-channel "Update an APNS sandbox channel" ([update-apns-sandbox-channel-request] (portkey.aws/-rest-json-call portkey.aws.pinpoint/endpoints "PUT" "/v1/apps/{application-id}/channels/apns_sandbox" update-apns-sandbox-channel-request :portkey.aws.pinpoint/update-apns-sandbox-channel-request {:payload "APNSSandboxChannelRequest", :move {}, :headers {}, :uri {"application-id" "ApplicationId"}, :querystring {}} 200 :portkey.aws.pinpoint/update-apns-sandbox-channel-response {"BadRequestException" :portkey.aws.pinpoint/bad-request-exception, "InternalServerErrorException" :portkey.aws.pinpoint/internal-server-error-exception, "ForbiddenException" :portkey.aws.pinpoint/forbidden-exception, "NotFoundException" :portkey.aws.pinpoint/not-found-exception, "MethodNotAllowedException" :portkey.aws.pinpoint/method-not-allowed-exception, "TooManyRequestsException" :portkey.aws.pinpoint/too-many-requests-exception})))
(clojure.spec.alpha/fdef update-apns-sandbox-channel :args (clojure.spec.alpha/tuple :portkey.aws.pinpoint/update-apns-sandbox-channel-request) :ret (clojure.spec.alpha/and :portkey.aws.pinpoint/update-apns-sandbox-channel-response))

(clojure.core/defn get-email-channel "Get an email channel" ([get-email-channel-request] (portkey.aws/-rest-json-call portkey.aws.pinpoint/endpoints "GET" "/v1/apps/{application-id}/channels/email" get-email-channel-request :portkey.aws.pinpoint/get-email-channel-request {:payload nil, :move {}, :headers {}, :uri {"application-id" "ApplicationId"}, :querystring {}} 200 :portkey.aws.pinpoint/get-email-channel-response {"BadRequestException" :portkey.aws.pinpoint/bad-request-exception, "InternalServerErrorException" :portkey.aws.pinpoint/internal-server-error-exception, "ForbiddenException" :portkey.aws.pinpoint/forbidden-exception, "NotFoundException" :portkey.aws.pinpoint/not-found-exception, "MethodNotAllowedException" :portkey.aws.pinpoint/method-not-allowed-exception, "TooManyRequestsException" :portkey.aws.pinpoint/too-many-requests-exception})))
(clojure.spec.alpha/fdef get-email-channel :args (clojure.spec.alpha/tuple :portkey.aws.pinpoint/get-email-channel-request) :ret (clojure.spec.alpha/and :portkey.aws.pinpoint/get-email-channel-response))

(clojure.core/defn update-sms-channel "Update an SMS channel" ([update-sms-channel-request] (portkey.aws/-rest-json-call portkey.aws.pinpoint/endpoints "PUT" "/v1/apps/{application-id}/channels/sms" update-sms-channel-request :portkey.aws.pinpoint/update-sms-channel-request {:payload "SMSChannelRequest", :move {}, :headers {}, :uri {"application-id" "ApplicationId"}, :querystring {}} 200 :portkey.aws.pinpoint/update-sms-channel-response {"BadRequestException" :portkey.aws.pinpoint/bad-request-exception, "InternalServerErrorException" :portkey.aws.pinpoint/internal-server-error-exception, "ForbiddenException" :portkey.aws.pinpoint/forbidden-exception, "NotFoundException" :portkey.aws.pinpoint/not-found-exception, "MethodNotAllowedException" :portkey.aws.pinpoint/method-not-allowed-exception, "TooManyRequestsException" :portkey.aws.pinpoint/too-many-requests-exception})))
(clojure.spec.alpha/fdef update-sms-channel :args (clojure.spec.alpha/tuple :portkey.aws.pinpoint/update-sms-channel-request) :ret (clojure.spec.alpha/and :portkey.aws.pinpoint/update-sms-channel-response))

(clojure.core/defn get-segment-export-jobs "Returns a list of export jobs for a specific segment." ([get-segment-export-jobs-request] (portkey.aws/-rest-json-call portkey.aws.pinpoint/endpoints "GET" "/v1/apps/{application-id}/segments/{segment-id}/jobs/export" get-segment-export-jobs-request :portkey.aws.pinpoint/get-segment-export-jobs-request {:payload nil, :move {}, :headers {}, :uri {"application-id" "ApplicationId", "segment-id" "SegmentId"}, :querystring {"page-size" "PageSize", "token" "Token"}} 200 :portkey.aws.pinpoint/get-segment-export-jobs-response {"BadRequestException" :portkey.aws.pinpoint/bad-request-exception, "InternalServerErrorException" :portkey.aws.pinpoint/internal-server-error-exception, "ForbiddenException" :portkey.aws.pinpoint/forbidden-exception, "NotFoundException" :portkey.aws.pinpoint/not-found-exception, "MethodNotAllowedException" :portkey.aws.pinpoint/method-not-allowed-exception, "TooManyRequestsException" :portkey.aws.pinpoint/too-many-requests-exception})))
(clojure.spec.alpha/fdef get-segment-export-jobs :args (clojure.spec.alpha/tuple :portkey.aws.pinpoint/get-segment-export-jobs-request) :ret (clojure.spec.alpha/and :portkey.aws.pinpoint/get-segment-export-jobs-response))

(clojure.core/defn create-segment "Used to create or update a segment." ([create-segment-request] (portkey.aws/-rest-json-call portkey.aws.pinpoint/endpoints "POST" "/v1/apps/{application-id}/segments" create-segment-request :portkey.aws.pinpoint/create-segment-request {:payload "WriteSegmentRequest", :move {}, :headers {}, :uri {"application-id" "ApplicationId"}, :querystring {}} 201 :portkey.aws.pinpoint/create-segment-response {"BadRequestException" :portkey.aws.pinpoint/bad-request-exception, "InternalServerErrorException" :portkey.aws.pinpoint/internal-server-error-exception, "ForbiddenException" :portkey.aws.pinpoint/forbidden-exception, "NotFoundException" :portkey.aws.pinpoint/not-found-exception, "MethodNotAllowedException" :portkey.aws.pinpoint/method-not-allowed-exception, "TooManyRequestsException" :portkey.aws.pinpoint/too-many-requests-exception})))
(clojure.spec.alpha/fdef create-segment :args (clojure.spec.alpha/tuple :portkey.aws.pinpoint/create-segment-request) :ret (clojure.spec.alpha/and :portkey.aws.pinpoint/create-segment-response))

(clojure.core/defn delete-sms-channel "Delete an SMS channel" ([delete-sms-channel-request] (portkey.aws/-rest-json-call portkey.aws.pinpoint/endpoints "DELETE" "/v1/apps/{application-id}/channels/sms" delete-sms-channel-request :portkey.aws.pinpoint/delete-sms-channel-request {:payload nil, :move {}, :headers {}, :uri {"application-id" "ApplicationId"}, :querystring {}} 200 :portkey.aws.pinpoint/delete-sms-channel-response {"BadRequestException" :portkey.aws.pinpoint/bad-request-exception, "InternalServerErrorException" :portkey.aws.pinpoint/internal-server-error-exception, "ForbiddenException" :portkey.aws.pinpoint/forbidden-exception, "NotFoundException" :portkey.aws.pinpoint/not-found-exception, "MethodNotAllowedException" :portkey.aws.pinpoint/method-not-allowed-exception, "TooManyRequestsException" :portkey.aws.pinpoint/too-many-requests-exception})))
(clojure.spec.alpha/fdef delete-sms-channel :args (clojure.spec.alpha/tuple :portkey.aws.pinpoint/delete-sms-channel-request) :ret (clojure.spec.alpha/and :portkey.aws.pinpoint/delete-sms-channel-response))

(clojure.core/defn put-event-stream "Use to create or update the event stream for an app." ([put-event-stream-request] (portkey.aws/-rest-json-call portkey.aws.pinpoint/endpoints "POST" "/v1/apps/{application-id}/eventstream" put-event-stream-request :portkey.aws.pinpoint/put-event-stream-request {:payload "WriteEventStream", :move {}, :headers {}, :uri {"application-id" "ApplicationId"}, :querystring {}} 200 :portkey.aws.pinpoint/put-event-stream-response {"BadRequestException" :portkey.aws.pinpoint/bad-request-exception, "InternalServerErrorException" :portkey.aws.pinpoint/internal-server-error-exception, "ForbiddenException" :portkey.aws.pinpoint/forbidden-exception, "NotFoundException" :portkey.aws.pinpoint/not-found-exception, "MethodNotAllowedException" :portkey.aws.pinpoint/method-not-allowed-exception, "TooManyRequestsException" :portkey.aws.pinpoint/too-many-requests-exception})))
(clojure.spec.alpha/fdef put-event-stream :args (clojure.spec.alpha/tuple :portkey.aws.pinpoint/put-event-stream-request) :ret (clojure.spec.alpha/and :portkey.aws.pinpoint/put-event-stream-response))
