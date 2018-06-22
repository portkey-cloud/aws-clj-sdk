(ns portkey.aws.mediapackage (:require [portkey.aws]))

(def
 endpoints
 '{"ap-northeast-1"
   {:credential-scope
    {:service "mediapackage", :region "ap-northeast-1"},
    :ssl-common-name "mediapackage.ap-northeast-1.amazonaws.com",
    :endpoint "https://mediapackage.ap-northeast-1.amazonaws.com",
    :signature-version :v4},
   "eu-west-1"
   {:credential-scope {:service "mediapackage", :region "eu-west-1"},
    :ssl-common-name "mediapackage.eu-west-1.amazonaws.com",
    :endpoint "https://mediapackage.eu-west-1.amazonaws.com",
    :signature-version :v4},
   "ap-southeast-2"
   {:credential-scope
    {:service "mediapackage", :region "ap-southeast-2"},
    :ssl-common-name "mediapackage.ap-southeast-2.amazonaws.com",
    :endpoint "https://mediapackage.ap-southeast-2.amazonaws.com",
    :signature-version :v4},
   "sa-east-1"
   {:credential-scope {:service "mediapackage", :region "sa-east-1"},
    :ssl-common-name "mediapackage.sa-east-1.amazonaws.com",
    :endpoint "https://mediapackage.sa-east-1.amazonaws.com",
    :signature-version :v4},
   "ap-southeast-1"
   {:credential-scope
    {:service "mediapackage", :region "ap-southeast-1"},
    :ssl-common-name "mediapackage.ap-southeast-1.amazonaws.com",
    :endpoint "https://mediapackage.ap-southeast-1.amazonaws.com",
    :signature-version :v4},
   "ap-northeast-2"
   {:credential-scope
    {:service "mediapackage", :region "ap-northeast-2"},
    :ssl-common-name "mediapackage.ap-northeast-2.amazonaws.com",
    :endpoint "https://mediapackage.ap-northeast-2.amazonaws.com",
    :signature-version :v4},
   "eu-west-3"
   {:credential-scope {:service "mediapackage", :region "eu-west-3"},
    :ssl-common-name "mediapackage.eu-west-3.amazonaws.com",
    :endpoint "https://mediapackage.eu-west-3.amazonaws.com",
    :signature-version :v4},
   "eu-central-1"
   {:credential-scope
    {:service "mediapackage", :region "eu-central-1"},
    :ssl-common-name "mediapackage.eu-central-1.amazonaws.com",
    :endpoint "https://mediapackage.eu-central-1.amazonaws.com",
    :signature-version :v4},
   "us-west-2"
   {:credential-scope {:service "mediapackage", :region "us-west-2"},
    :ssl-common-name "mediapackage.us-west-2.amazonaws.com",
    :endpoint "https://mediapackage.us-west-2.amazonaws.com",
    :signature-version :v4},
   "us-east-1"
   {:credential-scope {:service "mediapackage", :region "us-east-1"},
    :ssl-common-name "mediapackage.us-east-1.amazonaws.com",
    :endpoint "https://mediapackage.us-east-1.amazonaws.com",
    :signature-version :v4}})

(clojure.spec.alpha/def :portkey.aws.mediapackage.internal-server-error-exception/message (clojure.spec.alpha/and :portkey.aws.mediapackage/--string))
(clojure.spec.alpha/def :portkey.aws.mediapackage/internal-server-error-exception (portkey.aws/json-keys :req-un [] :opt-un [:portkey.aws.mediapackage.internal-server-error-exception/Message] :locations {"message" "Message"}))

(clojure.spec.alpha/def :portkey.aws.mediapackage.cmaf-package-create-or-update-parameters/encryption (clojure.spec.alpha/and :portkey.aws.mediapackage/cmaf-encryption))
(clojure.spec.alpha/def :portkey.aws.mediapackage.cmaf-package-create-or-update-parameters/hls-manifests (clojure.spec.alpha/and :portkey.aws.mediapackage/--list-of-hls-manifest-create-or-update-parameters))
(clojure.spec.alpha/def :portkey.aws.mediapackage.cmaf-package-create-or-update-parameters/segment-duration-seconds (clojure.spec.alpha/and :portkey.aws.mediapackage/--integer))
(clojure.spec.alpha/def :portkey.aws.mediapackage.cmaf-package-create-or-update-parameters/segment-prefix (clojure.spec.alpha/and :portkey.aws.mediapackage/--string))
(clojure.spec.alpha/def :portkey.aws.mediapackage/cmaf-package-create-or-update-parameters (portkey.aws/json-keys :req-un [] :opt-un [:portkey.aws.mediapackage.cmaf-package-create-or-update-parameters/Encryption :portkey.aws.mediapackage.cmaf-package-create-or-update-parameters/HlsManifests :portkey.aws.mediapackage.cmaf-package-create-or-update-parameters/SegmentDurationSeconds :portkey.aws.mediapackage.cmaf-package-create-or-update-parameters/SegmentPrefix :portkey.aws.mediapackage/StreamSelection] :locations {"encryption" "Encryption", "hlsManifests" "HlsManifests", "segmentDurationSeconds" "SegmentDurationSeconds", "segmentPrefix" "SegmentPrefix", "streamSelection" "StreamSelection"}))

(clojure.spec.alpha/def :portkey.aws.mediapackage.update-channel-request/description (clojure.spec.alpha/and :portkey.aws.mediapackage/--string))
(clojure.spec.alpha/def :portkey.aws.mediapackage.update-channel-request/id (clojure.spec.alpha/and :portkey.aws.mediapackage/--string))
(clojure.spec.alpha/def :portkey.aws.mediapackage/update-channel-request (portkey.aws/json-keys :req-un [:portkey.aws.mediapackage.update-channel-request/Id] :opt-un [:portkey.aws.mediapackage.update-channel-request/Description] :locations {"description" "Description"}))

(clojure.spec.alpha/def :portkey.aws.mediapackage/--list-of-ingest-endpoint (clojure.spec.alpha/and (clojure.spec.alpha/coll-of :portkey.aws.mediapackage/ingest-endpoint) (clojure.spec.alpha/conformer clojure.core/identity (fn* [p1__13687__13688__auto__] (if (clojure.core/sequential? p1__13687__13688__auto__) p1__13687__13688__auto__ [p1__13687__13688__auto__])))))

(clojure.spec.alpha/def :portkey.aws.mediapackage.create-origin-endpoint-response/channel-id (clojure.spec.alpha/and :portkey.aws.mediapackage/--string))
(clojure.spec.alpha/def :portkey.aws.mediapackage.create-origin-endpoint-response/time-delay-seconds (clojure.spec.alpha/and :portkey.aws.mediapackage/--integer))
(clojure.spec.alpha/def :portkey.aws.mediapackage.create-origin-endpoint-response/url (clojure.spec.alpha/and :portkey.aws.mediapackage/--string))
(clojure.spec.alpha/def :portkey.aws.mediapackage.create-origin-endpoint-response/description (clojure.spec.alpha/and :portkey.aws.mediapackage/--string))
(clojure.spec.alpha/def :portkey.aws.mediapackage.create-origin-endpoint-response/whitelist (clojure.spec.alpha/and :portkey.aws.mediapackage/--list-of--string))
(clojure.spec.alpha/def :portkey.aws.mediapackage.create-origin-endpoint-response/arn (clojure.spec.alpha/and :portkey.aws.mediapackage/--string))
(clojure.spec.alpha/def :portkey.aws.mediapackage.create-origin-endpoint-response/manifest-name (clojure.spec.alpha/and :portkey.aws.mediapackage/--string))
(clojure.spec.alpha/def :portkey.aws.mediapackage.create-origin-endpoint-response/startover-window-seconds (clojure.spec.alpha/and :portkey.aws.mediapackage/--integer))
(clojure.spec.alpha/def :portkey.aws.mediapackage.create-origin-endpoint-response/id (clojure.spec.alpha/and :portkey.aws.mediapackage/--string))
(clojure.spec.alpha/def :portkey.aws.mediapackage/create-origin-endpoint-response (portkey.aws/json-keys :req-un [] :opt-un [:portkey.aws.mediapackage/HlsPackage :portkey.aws.mediapackage.create-origin-endpoint-response/ChannelId :portkey.aws.mediapackage/MssPackage :portkey.aws.mediapackage/CmafPackage :portkey.aws.mediapackage.create-origin-endpoint-response/TimeDelaySeconds :portkey.aws.mediapackage.create-origin-endpoint-response/Url :portkey.aws.mediapackage.create-origin-endpoint-response/Description :portkey.aws.mediapackage.create-origin-endpoint-response/Whitelist :portkey.aws.mediapackage.create-origin-endpoint-response/Arn :portkey.aws.mediapackage/DashPackage :portkey.aws.mediapackage.create-origin-endpoint-response/ManifestName :portkey.aws.mediapackage.create-origin-endpoint-response/StartoverWindowSeconds :portkey.aws.mediapackage.create-origin-endpoint-response/Id] :locations {"url" "Url", "arn" "Arn", "cmafPackage" "CmafPackage", "manifestName" "ManifestName", "whitelist" "Whitelist", "id" "Id", "timeDelaySeconds" "TimeDelaySeconds", "dashPackage" "DashPackage", "startoverWindowSeconds" "StartoverWindowSeconds", "channelId" "ChannelId", "hlsPackage" "HlsPackage", "mssPackage" "MssPackage", "description" "Description"}))

(clojure.spec.alpha/def :portkey.aws.mediapackage.delete-origin-endpoint-request/id (clojure.spec.alpha/and :portkey.aws.mediapackage/--string))
(clojure.spec.alpha/def :portkey.aws.mediapackage/delete-origin-endpoint-request (portkey.aws/json-keys :req-un [:portkey.aws.mediapackage.delete-origin-endpoint-request/Id] :opt-un [] :locations {}))

(clojure.spec.alpha/def :portkey.aws.mediapackage/ad-markers (clojure.spec.alpha/conformer (clojure.core/let [m__13766__auto__ {"NONE" "NONE", :none "NONE", "SCTE35_ENHANCED" "SCTE35_ENHANCED", :scte35-enhanced "SCTE35_ENHANCED", "PASSTHROUGH" "PASSTHROUGH", :passthrough "PASSTHROUGH"}] (clojure.core/fn [s__13767__auto__] (m__13766__auto__ s__13767__auto__ :clojure.spec.alpha/invalid))) (clojure.core/comp clojure.core/keyword portkey.aws/dashed)))

(clojure.spec.alpha/def :portkey.aws.mediapackage.list-origin-endpoints-request/channel-id (clojure.spec.alpha/and :portkey.aws.mediapackage/--string))
(clojure.spec.alpha/def :portkey.aws.mediapackage.list-origin-endpoints-request/next-token (clojure.spec.alpha/and :portkey.aws.mediapackage/--string))
(clojure.spec.alpha/def :portkey.aws.mediapackage/list-origin-endpoints-request (portkey.aws/json-keys :req-un [] :opt-un [:portkey.aws.mediapackage.list-origin-endpoints-request/ChannelId :portkey.aws.mediapackage/MaxResults :portkey.aws.mediapackage.list-origin-endpoints-request/NextToken] :locations {}))

(clojure.spec.alpha/def :portkey.aws.mediapackage.forbidden-exception/message (clojure.spec.alpha/and :portkey.aws.mediapackage/--string))
(clojure.spec.alpha/def :portkey.aws.mediapackage/forbidden-exception (portkey.aws/json-keys :req-un [] :opt-un [:portkey.aws.mediapackage.forbidden-exception/Message] :locations {"message" "Message"}))

(clojure.spec.alpha/def :portkey.aws.mediapackage.stream-selection/max-video-bits-per-second (clojure.spec.alpha/and :portkey.aws.mediapackage/--integer))
(clojure.spec.alpha/def :portkey.aws.mediapackage.stream-selection/min-video-bits-per-second (clojure.spec.alpha/and :portkey.aws.mediapackage/--integer))
(clojure.spec.alpha/def :portkey.aws.mediapackage/stream-selection (portkey.aws/json-keys :req-un [] :opt-un [:portkey.aws.mediapackage.stream-selection/MaxVideoBitsPerSecond :portkey.aws.mediapackage.stream-selection/MinVideoBitsPerSecond :portkey.aws.mediapackage/StreamOrder] :locations {"maxVideoBitsPerSecond" "MaxVideoBitsPerSecond", "minVideoBitsPerSecond" "MinVideoBitsPerSecond", "streamOrder" "StreamOrder"}))

(clojure.spec.alpha/def :portkey.aws.mediapackage.create-channel-response/arn (clojure.spec.alpha/and :portkey.aws.mediapackage/--string))
(clojure.spec.alpha/def :portkey.aws.mediapackage.create-channel-response/description (clojure.spec.alpha/and :portkey.aws.mediapackage/--string))
(clojure.spec.alpha/def :portkey.aws.mediapackage.create-channel-response/id (clojure.spec.alpha/and :portkey.aws.mediapackage/--string))
(clojure.spec.alpha/def :portkey.aws.mediapackage/create-channel-response (portkey.aws/json-keys :req-un [] :opt-un [:portkey.aws.mediapackage.create-channel-response/Arn :portkey.aws.mediapackage.create-channel-response/Description :portkey.aws.mediapackage/HlsIngest :portkey.aws.mediapackage.create-channel-response/Id] :locations {"arn" "Arn", "description" "Description", "hlsIngest" "HlsIngest", "id" "Id"}))

(clojure.spec.alpha/def :portkey.aws.mediapackage.unprocessable-entity-exception/message (clojure.spec.alpha/and :portkey.aws.mediapackage/--string))
(clojure.spec.alpha/def :portkey.aws.mediapackage/unprocessable-entity-exception (portkey.aws/json-keys :req-un [] :opt-un [:portkey.aws.mediapackage.unprocessable-entity-exception/Message] :locations {"message" "Message"}))

(clojure.spec.alpha/def :portkey.aws.mediapackage/--string (clojure.spec.alpha/and clojure.core/string?))

(clojure.spec.alpha/def :portkey.aws.mediapackage.describe-origin-endpoint-request/id (clojure.spec.alpha/and :portkey.aws.mediapackage/--string))
(clojure.spec.alpha/def :portkey.aws.mediapackage/describe-origin-endpoint-request (portkey.aws/json-keys :req-un [:portkey.aws.mediapackage.describe-origin-endpoint-request/Id] :opt-un [] :locations {}))

(clojure.spec.alpha/def :portkey.aws.mediapackage.origin-endpoint-update-parameters/cmaf-package (clojure.spec.alpha/and :portkey.aws.mediapackage/cmaf-package-create-or-update-parameters))
(clojure.spec.alpha/def :portkey.aws.mediapackage.origin-endpoint-update-parameters/time-delay-seconds (clojure.spec.alpha/and :portkey.aws.mediapackage/--integer))
(clojure.spec.alpha/def :portkey.aws.mediapackage.origin-endpoint-update-parameters/description (clojure.spec.alpha/and :portkey.aws.mediapackage/--string))
(clojure.spec.alpha/def :portkey.aws.mediapackage.origin-endpoint-update-parameters/whitelist (clojure.spec.alpha/and :portkey.aws.mediapackage/--list-of--string))
(clojure.spec.alpha/def :portkey.aws.mediapackage.origin-endpoint-update-parameters/manifest-name (clojure.spec.alpha/and :portkey.aws.mediapackage/--string))
(clojure.spec.alpha/def :portkey.aws.mediapackage.origin-endpoint-update-parameters/startover-window-seconds (clojure.spec.alpha/and :portkey.aws.mediapackage/--integer))
(clojure.spec.alpha/def :portkey.aws.mediapackage/origin-endpoint-update-parameters (portkey.aws/json-keys :req-un [] :opt-un [:portkey.aws.mediapackage/HlsPackage :portkey.aws.mediapackage/MssPackage :portkey.aws.mediapackage.origin-endpoint-update-parameters/CmafPackage :portkey.aws.mediapackage.origin-endpoint-update-parameters/TimeDelaySeconds :portkey.aws.mediapackage.origin-endpoint-update-parameters/Description :portkey.aws.mediapackage.origin-endpoint-update-parameters/Whitelist :portkey.aws.mediapackage/DashPackage :portkey.aws.mediapackage.origin-endpoint-update-parameters/ManifestName :portkey.aws.mediapackage.origin-endpoint-update-parameters/StartoverWindowSeconds] :locations {"cmafPackage" "CmafPackage", "manifestName" "ManifestName", "whitelist" "Whitelist", "timeDelaySeconds" "TimeDelaySeconds", "dashPackage" "DashPackage", "startoverWindowSeconds" "StartoverWindowSeconds", "hlsPackage" "HlsPackage", "mssPackage" "MssPackage", "description" "Description"}))

(clojure.spec.alpha/def :portkey.aws.mediapackage.hls-package/include-iframe-only-stream (clojure.spec.alpha/and :portkey.aws.mediapackage/--boolean))
(clojure.spec.alpha/def :portkey.aws.mediapackage.hls-package/use-audio-rendition-group (clojure.spec.alpha/and :portkey.aws.mediapackage/--boolean))
(clojure.spec.alpha/def :portkey.aws.mediapackage.hls-package/program-date-time-interval-seconds (clojure.spec.alpha/and :portkey.aws.mediapackage/--integer))
(clojure.spec.alpha/def :portkey.aws.mediapackage.hls-package/encryption (clojure.spec.alpha/and :portkey.aws.mediapackage/hls-encryption))
(clojure.spec.alpha/def :portkey.aws.mediapackage.hls-package/playlist-window-seconds (clojure.spec.alpha/and :portkey.aws.mediapackage/--integer))
(clojure.spec.alpha/def :portkey.aws.mediapackage.hls-package/segment-duration-seconds (clojure.spec.alpha/and :portkey.aws.mediapackage/--integer))
(clojure.spec.alpha/def :portkey.aws.mediapackage/hls-package (portkey.aws/json-keys :req-un [] :opt-un [:portkey.aws.mediapackage/AdMarkers :portkey.aws.mediapackage/StreamSelection :portkey.aws.mediapackage.hls-package/IncludeIframeOnlyStream :portkey.aws.mediapackage.hls-package/UseAudioRenditionGroup :portkey.aws.mediapackage.hls-package/ProgramDateTimeIntervalSeconds :portkey.aws.mediapackage.hls-package/Encryption :portkey.aws.mediapackage.hls-package/PlaylistWindowSeconds :portkey.aws.mediapackage.hls-package/SegmentDurationSeconds :portkey.aws.mediapackage/PlaylistType] :locations {"segmentDurationSeconds" "SegmentDurationSeconds", "streamSelection" "StreamSelection", "useAudioRenditionGroup" "UseAudioRenditionGroup", "encryption" "Encryption", "programDateTimeIntervalSeconds" "ProgramDateTimeIntervalSeconds", "playlistType" "PlaylistType", "includeIframeOnlyStream" "IncludeIframeOnlyStream", "playlistWindowSeconds" "PlaylistWindowSeconds", "adMarkers" "AdMarkers"}))

(clojure.spec.alpha/def :portkey.aws.mediapackage/--long clojure.core/int?)

(clojure.spec.alpha/def :portkey.aws.mediapackage.ingest-endpoint/password (clojure.spec.alpha/and :portkey.aws.mediapackage/--string))
(clojure.spec.alpha/def :portkey.aws.mediapackage.ingest-endpoint/url (clojure.spec.alpha/and :portkey.aws.mediapackage/--string))
(clojure.spec.alpha/def :portkey.aws.mediapackage.ingest-endpoint/username (clojure.spec.alpha/and :portkey.aws.mediapackage/--string))
(clojure.spec.alpha/def :portkey.aws.mediapackage/ingest-endpoint (portkey.aws/json-keys :req-un [] :opt-un [:portkey.aws.mediapackage.ingest-endpoint/Password :portkey.aws.mediapackage.ingest-endpoint/Url :portkey.aws.mediapackage.ingest-endpoint/Username] :locations {"password" "Password", "url" "Url", "username" "Username"}))

(clojure.spec.alpha/def :portkey.aws.mediapackage.describe-channel-response/arn (clojure.spec.alpha/and :portkey.aws.mediapackage/--string))
(clojure.spec.alpha/def :portkey.aws.mediapackage.describe-channel-response/description (clojure.spec.alpha/and :portkey.aws.mediapackage/--string))
(clojure.spec.alpha/def :portkey.aws.mediapackage.describe-channel-response/id (clojure.spec.alpha/and :portkey.aws.mediapackage/--string))
(clojure.spec.alpha/def :portkey.aws.mediapackage/describe-channel-response (portkey.aws/json-keys :req-un [] :opt-un [:portkey.aws.mediapackage.describe-channel-response/Arn :portkey.aws.mediapackage.describe-channel-response/Description :portkey.aws.mediapackage/HlsIngest :portkey.aws.mediapackage.describe-channel-response/Id] :locations {"arn" "Arn", "description" "Description", "hlsIngest" "HlsIngest", "id" "Id"}))

(clojure.spec.alpha/def :portkey.aws.mediapackage.mss-package/encryption (clojure.spec.alpha/and :portkey.aws.mediapackage/mss-encryption))
(clojure.spec.alpha/def :portkey.aws.mediapackage.mss-package/manifest-window-seconds (clojure.spec.alpha/and :portkey.aws.mediapackage/--integer))
(clojure.spec.alpha/def :portkey.aws.mediapackage.mss-package/segment-duration-seconds (clojure.spec.alpha/and :portkey.aws.mediapackage/--integer))
(clojure.spec.alpha/def :portkey.aws.mediapackage/mss-package (portkey.aws/json-keys :req-un [] :opt-un [:portkey.aws.mediapackage.mss-package/Encryption :portkey.aws.mediapackage.mss-package/ManifestWindowSeconds :portkey.aws.mediapackage.mss-package/SegmentDurationSeconds :portkey.aws.mediapackage/StreamSelection] :locations {"encryption" "Encryption", "manifestWindowSeconds" "ManifestWindowSeconds", "segmentDurationSeconds" "SegmentDurationSeconds", "streamSelection" "StreamSelection"}))

(clojure.spec.alpha/def :portkey.aws.mediapackage.dash-encryption/key-rotation-interval-seconds (clojure.spec.alpha/and :portkey.aws.mediapackage/--integer))
(clojure.spec.alpha/def :portkey.aws.mediapackage/dash-encryption (portkey.aws/json-keys :req-un [:portkey.aws.mediapackage/SpekeKeyProvider] :opt-un [:portkey.aws.mediapackage.dash-encryption/KeyRotationIntervalSeconds] :locations {"keyRotationIntervalSeconds" "KeyRotationIntervalSeconds", "spekeKeyProvider" "SpekeKeyProvider"}))

(clojure.spec.alpha/def :portkey.aws.mediapackage.cmaf-package/encryption (clojure.spec.alpha/and :portkey.aws.mediapackage/cmaf-encryption))
(clojure.spec.alpha/def :portkey.aws.mediapackage.cmaf-package/hls-manifests (clojure.spec.alpha/and :portkey.aws.mediapackage/--list-of-hls-manifest))
(clojure.spec.alpha/def :portkey.aws.mediapackage.cmaf-package/segment-duration-seconds (clojure.spec.alpha/and :portkey.aws.mediapackage/--integer))
(clojure.spec.alpha/def :portkey.aws.mediapackage.cmaf-package/segment-prefix (clojure.spec.alpha/and :portkey.aws.mediapackage/--string))
(clojure.spec.alpha/def :portkey.aws.mediapackage/cmaf-package (portkey.aws/json-keys :req-un [] :opt-un [:portkey.aws.mediapackage.cmaf-package/Encryption :portkey.aws.mediapackage.cmaf-package/HlsManifests :portkey.aws.mediapackage.cmaf-package/SegmentDurationSeconds :portkey.aws.mediapackage.cmaf-package/SegmentPrefix :portkey.aws.mediapackage/StreamSelection] :locations {"encryption" "Encryption", "hlsManifests" "HlsManifests", "segmentDurationSeconds" "SegmentDurationSeconds", "segmentPrefix" "SegmentPrefix", "streamSelection" "StreamSelection"}))

(clojure.spec.alpha/def :portkey.aws.mediapackage/mss-encryption (portkey.aws/json-keys :req-un [:portkey.aws.mediapackage/SpekeKeyProvider] :opt-un [] :locations {"spekeKeyProvider" "SpekeKeyProvider"}))

(clojure.spec.alpha/def :portkey.aws.mediapackage.describe-origin-endpoint-response/channel-id (clojure.spec.alpha/and :portkey.aws.mediapackage/--string))
(clojure.spec.alpha/def :portkey.aws.mediapackage.describe-origin-endpoint-response/time-delay-seconds (clojure.spec.alpha/and :portkey.aws.mediapackage/--integer))
(clojure.spec.alpha/def :portkey.aws.mediapackage.describe-origin-endpoint-response/url (clojure.spec.alpha/and :portkey.aws.mediapackage/--string))
(clojure.spec.alpha/def :portkey.aws.mediapackage.describe-origin-endpoint-response/description (clojure.spec.alpha/and :portkey.aws.mediapackage/--string))
(clojure.spec.alpha/def :portkey.aws.mediapackage.describe-origin-endpoint-response/whitelist (clojure.spec.alpha/and :portkey.aws.mediapackage/--list-of--string))
(clojure.spec.alpha/def :portkey.aws.mediapackage.describe-origin-endpoint-response/arn (clojure.spec.alpha/and :portkey.aws.mediapackage/--string))
(clojure.spec.alpha/def :portkey.aws.mediapackage.describe-origin-endpoint-response/manifest-name (clojure.spec.alpha/and :portkey.aws.mediapackage/--string))
(clojure.spec.alpha/def :portkey.aws.mediapackage.describe-origin-endpoint-response/startover-window-seconds (clojure.spec.alpha/and :portkey.aws.mediapackage/--integer))
(clojure.spec.alpha/def :portkey.aws.mediapackage.describe-origin-endpoint-response/id (clojure.spec.alpha/and :portkey.aws.mediapackage/--string))
(clojure.spec.alpha/def :portkey.aws.mediapackage/describe-origin-endpoint-response (portkey.aws/json-keys :req-un [] :opt-un [:portkey.aws.mediapackage/HlsPackage :portkey.aws.mediapackage.describe-origin-endpoint-response/ChannelId :portkey.aws.mediapackage/MssPackage :portkey.aws.mediapackage/CmafPackage :portkey.aws.mediapackage.describe-origin-endpoint-response/TimeDelaySeconds :portkey.aws.mediapackage.describe-origin-endpoint-response/Url :portkey.aws.mediapackage.describe-origin-endpoint-response/Description :portkey.aws.mediapackage.describe-origin-endpoint-response/Whitelist :portkey.aws.mediapackage.describe-origin-endpoint-response/Arn :portkey.aws.mediapackage/DashPackage :portkey.aws.mediapackage.describe-origin-endpoint-response/ManifestName :portkey.aws.mediapackage.describe-origin-endpoint-response/StartoverWindowSeconds :portkey.aws.mediapackage.describe-origin-endpoint-response/Id] :locations {"url" "Url", "arn" "Arn", "cmafPackage" "CmafPackage", "manifestName" "ManifestName", "whitelist" "Whitelist", "id" "Id", "timeDelaySeconds" "TimeDelaySeconds", "dashPackage" "DashPackage", "startoverWindowSeconds" "StartoverWindowSeconds", "channelId" "ChannelId", "hlsPackage" "HlsPackage", "mssPackage" "MssPackage", "description" "Description"}))

(clojure.spec.alpha/def :portkey.aws.mediapackage.update-origin-endpoint-response/channel-id (clojure.spec.alpha/and :portkey.aws.mediapackage/--string))
(clojure.spec.alpha/def :portkey.aws.mediapackage.update-origin-endpoint-response/time-delay-seconds (clojure.spec.alpha/and :portkey.aws.mediapackage/--integer))
(clojure.spec.alpha/def :portkey.aws.mediapackage.update-origin-endpoint-response/url (clojure.spec.alpha/and :portkey.aws.mediapackage/--string))
(clojure.spec.alpha/def :portkey.aws.mediapackage.update-origin-endpoint-response/description (clojure.spec.alpha/and :portkey.aws.mediapackage/--string))
(clojure.spec.alpha/def :portkey.aws.mediapackage.update-origin-endpoint-response/whitelist (clojure.spec.alpha/and :portkey.aws.mediapackage/--list-of--string))
(clojure.spec.alpha/def :portkey.aws.mediapackage.update-origin-endpoint-response/arn (clojure.spec.alpha/and :portkey.aws.mediapackage/--string))
(clojure.spec.alpha/def :portkey.aws.mediapackage.update-origin-endpoint-response/manifest-name (clojure.spec.alpha/and :portkey.aws.mediapackage/--string))
(clojure.spec.alpha/def :portkey.aws.mediapackage.update-origin-endpoint-response/startover-window-seconds (clojure.spec.alpha/and :portkey.aws.mediapackage/--integer))
(clojure.spec.alpha/def :portkey.aws.mediapackage.update-origin-endpoint-response/id (clojure.spec.alpha/and :portkey.aws.mediapackage/--string))
(clojure.spec.alpha/def :portkey.aws.mediapackage/update-origin-endpoint-response (portkey.aws/json-keys :req-un [] :opt-un [:portkey.aws.mediapackage/HlsPackage :portkey.aws.mediapackage.update-origin-endpoint-response/ChannelId :portkey.aws.mediapackage/MssPackage :portkey.aws.mediapackage/CmafPackage :portkey.aws.mediapackage.update-origin-endpoint-response/TimeDelaySeconds :portkey.aws.mediapackage.update-origin-endpoint-response/Url :portkey.aws.mediapackage.update-origin-endpoint-response/Description :portkey.aws.mediapackage.update-origin-endpoint-response/Whitelist :portkey.aws.mediapackage.update-origin-endpoint-response/Arn :portkey.aws.mediapackage/DashPackage :portkey.aws.mediapackage.update-origin-endpoint-response/ManifestName :portkey.aws.mediapackage.update-origin-endpoint-response/StartoverWindowSeconds :portkey.aws.mediapackage.update-origin-endpoint-response/Id] :locations {"url" "Url", "arn" "Arn", "cmafPackage" "CmafPackage", "manifestName" "ManifestName", "whitelist" "Whitelist", "id" "Id", "timeDelaySeconds" "TimeDelaySeconds", "dashPackage" "DashPackage", "startoverWindowSeconds" "StartoverWindowSeconds", "channelId" "ChannelId", "hlsPackage" "HlsPackage", "mssPackage" "MssPackage", "description" "Description"}))

(clojure.spec.alpha/def :portkey.aws.mediapackage.service-unavailable-exception/message (clojure.spec.alpha/and :portkey.aws.mediapackage/--string))
(clojure.spec.alpha/def :portkey.aws.mediapackage/service-unavailable-exception (portkey.aws/json-keys :req-un [] :opt-un [:portkey.aws.mediapackage.service-unavailable-exception/Message] :locations {"message" "Message"}))

(clojure.spec.alpha/def :portkey.aws.mediapackage.hls-ingest/ingest-endpoints (clojure.spec.alpha/and :portkey.aws.mediapackage/--list-of-ingest-endpoint))
(clojure.spec.alpha/def :portkey.aws.mediapackage/hls-ingest (portkey.aws/json-keys :req-un [] :opt-un [:portkey.aws.mediapackage.hls-ingest/IngestEndpoints] :locations {"ingestEndpoints" "IngestEndpoints"}))

(clojure.spec.alpha/def :portkey.aws.mediapackage.origin-endpoint/channel-id (clojure.spec.alpha/and :portkey.aws.mediapackage/--string))
(clojure.spec.alpha/def :portkey.aws.mediapackage.origin-endpoint/time-delay-seconds (clojure.spec.alpha/and :portkey.aws.mediapackage/--integer))
(clojure.spec.alpha/def :portkey.aws.mediapackage.origin-endpoint/url (clojure.spec.alpha/and :portkey.aws.mediapackage/--string))
(clojure.spec.alpha/def :portkey.aws.mediapackage.origin-endpoint/description (clojure.spec.alpha/and :portkey.aws.mediapackage/--string))
(clojure.spec.alpha/def :portkey.aws.mediapackage.origin-endpoint/whitelist (clojure.spec.alpha/and :portkey.aws.mediapackage/--list-of--string))
(clojure.spec.alpha/def :portkey.aws.mediapackage.origin-endpoint/arn (clojure.spec.alpha/and :portkey.aws.mediapackage/--string))
(clojure.spec.alpha/def :portkey.aws.mediapackage.origin-endpoint/manifest-name (clojure.spec.alpha/and :portkey.aws.mediapackage/--string))
(clojure.spec.alpha/def :portkey.aws.mediapackage.origin-endpoint/startover-window-seconds (clojure.spec.alpha/and :portkey.aws.mediapackage/--integer))
(clojure.spec.alpha/def :portkey.aws.mediapackage.origin-endpoint/id (clojure.spec.alpha/and :portkey.aws.mediapackage/--string))
(clojure.spec.alpha/def :portkey.aws.mediapackage/origin-endpoint (portkey.aws/json-keys :req-un [] :opt-un [:portkey.aws.mediapackage/HlsPackage :portkey.aws.mediapackage.origin-endpoint/ChannelId :portkey.aws.mediapackage/MssPackage :portkey.aws.mediapackage/CmafPackage :portkey.aws.mediapackage.origin-endpoint/TimeDelaySeconds :portkey.aws.mediapackage.origin-endpoint/Url :portkey.aws.mediapackage.origin-endpoint/Description :portkey.aws.mediapackage.origin-endpoint/Whitelist :portkey.aws.mediapackage.origin-endpoint/Arn :portkey.aws.mediapackage/DashPackage :portkey.aws.mediapackage.origin-endpoint/ManifestName :portkey.aws.mediapackage.origin-endpoint/StartoverWindowSeconds :portkey.aws.mediapackage.origin-endpoint/Id] :locations {"url" "Url", "arn" "Arn", "cmafPackage" "CmafPackage", "manifestName" "ManifestName", "whitelist" "Whitelist", "id" "Id", "timeDelaySeconds" "TimeDelaySeconds", "dashPackage" "DashPackage", "startoverWindowSeconds" "StartoverWindowSeconds", "channelId" "ChannelId", "hlsPackage" "HlsPackage", "mssPackage" "MssPackage", "description" "Description"}))

(clojure.spec.alpha/def :portkey.aws.mediapackage.channel-create-parameters/description (clojure.spec.alpha/and :portkey.aws.mediapackage/--string))
(clojure.spec.alpha/def :portkey.aws.mediapackage.channel-create-parameters/id (clojure.spec.alpha/and :portkey.aws.mediapackage/--string))
(clojure.spec.alpha/def :portkey.aws.mediapackage/channel-create-parameters (portkey.aws/json-keys :req-un [:portkey.aws.mediapackage.channel-create-parameters/Id] :opt-un [:portkey.aws.mediapackage.channel-create-parameters/Description] :locations {"description" "Description", "id" "Id"}))

(clojure.spec.alpha/def :portkey.aws.mediapackage/delete-channel-response (portkey.aws/json-keys :req-un [] :opt-un [] :locations {}))

(clojure.spec.alpha/def :portkey.aws.mediapackage.speke-key-provider/resource-id (clojure.spec.alpha/and :portkey.aws.mediapackage/--string))
(clojure.spec.alpha/def :portkey.aws.mediapackage.speke-key-provider/role-arn (clojure.spec.alpha/and :portkey.aws.mediapackage/--string))
(clojure.spec.alpha/def :portkey.aws.mediapackage.speke-key-provider/system-ids (clojure.spec.alpha/and :portkey.aws.mediapackage/--list-of--string))
(clojure.spec.alpha/def :portkey.aws.mediapackage.speke-key-provider/url (clojure.spec.alpha/and :portkey.aws.mediapackage/--string))
(clojure.spec.alpha/def :portkey.aws.mediapackage/speke-key-provider (portkey.aws/json-keys :req-un [:portkey.aws.mediapackage.speke-key-provider/Url :portkey.aws.mediapackage.speke-key-provider/ResourceId :portkey.aws.mediapackage.speke-key-provider/RoleArn :portkey.aws.mediapackage.speke-key-provider/SystemIds] :opt-un [] :locations {"resourceId" "ResourceId", "roleArn" "RoleArn", "systemIds" "SystemIds", "url" "Url"}))

(clojure.spec.alpha/def :portkey.aws.mediapackage.too-many-requests-exception/message (clojure.spec.alpha/and :portkey.aws.mediapackage/--string))
(clojure.spec.alpha/def :portkey.aws.mediapackage/too-many-requests-exception (portkey.aws/json-keys :req-un [] :opt-un [:portkey.aws.mediapackage.too-many-requests-exception/Message] :locations {"message" "Message"}))

(clojure.spec.alpha/def :portkey.aws.mediapackage.create-channel-request/description (clojure.spec.alpha/and :portkey.aws.mediapackage/--string))
(clojure.spec.alpha/def :portkey.aws.mediapackage.create-channel-request/id (clojure.spec.alpha/and :portkey.aws.mediapackage/--string))
(clojure.spec.alpha/def :portkey.aws.mediapackage/create-channel-request (portkey.aws/json-keys :req-un [:portkey.aws.mediapackage.create-channel-request/Id] :opt-un [:portkey.aws.mediapackage.create-channel-request/Description] :locations {"description" "Description", "id" "Id"}))

(clojure.spec.alpha/def :portkey.aws.mediapackage/--list-of-hls-manifest-create-or-update-parameters (clojure.spec.alpha/and (clojure.spec.alpha/coll-of :portkey.aws.mediapackage/hls-manifest-create-or-update-parameters) (clojure.spec.alpha/conformer clojure.core/identity (fn* [p1__13687__13688__auto__] (if (clojure.core/sequential? p1__13687__13688__auto__) p1__13687__13688__auto__ [p1__13687__13688__auto__])))))

(clojure.spec.alpha/def :portkey.aws.mediapackage/--list-of-hls-manifest (clojure.spec.alpha/and (clojure.spec.alpha/coll-of :portkey.aws.mediapackage/hls-manifest) (clojure.spec.alpha/conformer clojure.core/identity (fn* [p1__13687__13688__auto__] (if (clojure.core/sequential? p1__13687__13688__auto__) p1__13687__13688__auto__ [p1__13687__13688__auto__])))))

(clojure.spec.alpha/def :portkey.aws.mediapackage.hls-manifest/id (clojure.spec.alpha/and :portkey.aws.mediapackage/--string))
(clojure.spec.alpha/def :portkey.aws.mediapackage.hls-manifest/include-iframe-only-stream (clojure.spec.alpha/and :portkey.aws.mediapackage/--boolean))
(clojure.spec.alpha/def :portkey.aws.mediapackage.hls-manifest/manifest-name (clojure.spec.alpha/and :portkey.aws.mediapackage/--string))
(clojure.spec.alpha/def :portkey.aws.mediapackage.hls-manifest/playlist-window-seconds (clojure.spec.alpha/and :portkey.aws.mediapackage/--integer))
(clojure.spec.alpha/def :portkey.aws.mediapackage.hls-manifest/program-date-time-interval-seconds (clojure.spec.alpha/and :portkey.aws.mediapackage/--integer))
(clojure.spec.alpha/def :portkey.aws.mediapackage.hls-manifest/url (clojure.spec.alpha/and :portkey.aws.mediapackage/--string))
(clojure.spec.alpha/def :portkey.aws.mediapackage/hls-manifest (portkey.aws/json-keys :req-un [:portkey.aws.mediapackage.hls-manifest/Id] :opt-un [:portkey.aws.mediapackage/AdMarkers :portkey.aws.mediapackage.hls-manifest/IncludeIframeOnlyStream :portkey.aws.mediapackage.hls-manifest/ManifestName :portkey.aws.mediapackage/PlaylistType :portkey.aws.mediapackage.hls-manifest/PlaylistWindowSeconds :portkey.aws.mediapackage.hls-manifest/ProgramDateTimeIntervalSeconds :portkey.aws.mediapackage.hls-manifest/Url] :locations {"adMarkers" "AdMarkers", "id" "Id", "includeIframeOnlyStream" "IncludeIframeOnlyStream", "manifestName" "ManifestName", "playlistType" "PlaylistType", "playlistWindowSeconds" "PlaylistWindowSeconds", "programDateTimeIntervalSeconds" "ProgramDateTimeIntervalSeconds", "url" "Url"}))

(clojure.spec.alpha/def :portkey.aws.mediapackage.list-channels-response/channels (clojure.spec.alpha/and :portkey.aws.mediapackage/--list-of-channel))
(clojure.spec.alpha/def :portkey.aws.mediapackage.list-channels-response/next-token (clojure.spec.alpha/and :portkey.aws.mediapackage/--string))
(clojure.spec.alpha/def :portkey.aws.mediapackage/list-channels-response (portkey.aws/json-keys :req-un [] :opt-un [:portkey.aws.mediapackage.list-channels-response/Channels :portkey.aws.mediapackage.list-channels-response/NextToken] :locations {"channels" "Channels", "nextToken" "NextToken"}))

(clojure.spec.alpha/def :portkey.aws.mediapackage/--list-of--string (clojure.spec.alpha/and (clojure.spec.alpha/coll-of :portkey.aws.mediapackage/--string) (clojure.spec.alpha/conformer clojure.core/identity (fn* [p1__13687__13688__auto__] (if (clojure.core/sequential? p1__13687__13688__auto__) p1__13687__13688__auto__ [p1__13687__13688__auto__])))))

(clojure.spec.alpha/def :portkey.aws.mediapackage/--boolean clojure.core/boolean?)

(clojure.spec.alpha/def :portkey.aws.mediapackage/profile (clojure.spec.alpha/conformer (clojure.core/let [m__13766__auto__ {"NONE" "NONE", :none "NONE", "HBBTV_1_5" "HBBTV_1_5", :hbbtv-1-5 "HBBTV_1_5"}] (clojure.core/fn [s__13767__auto__] (m__13766__auto__ s__13767__auto__ :clojure.spec.alpha/invalid))) (clojure.core/comp clojure.core/keyword portkey.aws/dashed)))

(clojure.spec.alpha/def :portkey.aws.mediapackage.hls-encryption/constant-initialization-vector (clojure.spec.alpha/and :portkey.aws.mediapackage/--string))
(clojure.spec.alpha/def :portkey.aws.mediapackage.hls-encryption/key-rotation-interval-seconds (clojure.spec.alpha/and :portkey.aws.mediapackage/--integer))
(clojure.spec.alpha/def :portkey.aws.mediapackage.hls-encryption/repeat-extxkey (clojure.spec.alpha/and :portkey.aws.mediapackage/--boolean))
(clojure.spec.alpha/def :portkey.aws.mediapackage/hls-encryption (portkey.aws/json-keys :req-un [:portkey.aws.mediapackage/SpekeKeyProvider] :opt-un [:portkey.aws.mediapackage.hls-encryption/ConstantInitializationVector :portkey.aws.mediapackage/EncryptionMethod :portkey.aws.mediapackage.hls-encryption/KeyRotationIntervalSeconds :portkey.aws.mediapackage.hls-encryption/RepeatExtXKey] :locations {"constantInitializationVector" "ConstantInitializationVector", "encryptionMethod" "EncryptionMethod", "keyRotationIntervalSeconds" "KeyRotationIntervalSeconds", "repeatExtXKey" "RepeatExtXKey", "spekeKeyProvider" "SpekeKeyProvider"}))

(clojure.spec.alpha/def :portkey.aws.mediapackage/--list-of-channel (clojure.spec.alpha/and (clojure.spec.alpha/coll-of :portkey.aws.mediapackage/channel) (clojure.spec.alpha/conformer clojure.core/identity (fn* [p1__13687__13688__auto__] (if (clojure.core/sequential? p1__13687__13688__auto__) p1__13687__13688__auto__ [p1__13687__13688__auto__])))))

(clojure.spec.alpha/def :portkey.aws.mediapackage.create-origin-endpoint-request/channel-id (clojure.spec.alpha/and :portkey.aws.mediapackage/--string))
(clojure.spec.alpha/def :portkey.aws.mediapackage.create-origin-endpoint-request/cmaf-package (clojure.spec.alpha/and :portkey.aws.mediapackage/cmaf-package-create-or-update-parameters))
(clojure.spec.alpha/def :portkey.aws.mediapackage.create-origin-endpoint-request/time-delay-seconds (clojure.spec.alpha/and :portkey.aws.mediapackage/--integer))
(clojure.spec.alpha/def :portkey.aws.mediapackage.create-origin-endpoint-request/description (clojure.spec.alpha/and :portkey.aws.mediapackage/--string))
(clojure.spec.alpha/def :portkey.aws.mediapackage.create-origin-endpoint-request/whitelist (clojure.spec.alpha/and :portkey.aws.mediapackage/--list-of--string))
(clojure.spec.alpha/def :portkey.aws.mediapackage.create-origin-endpoint-request/manifest-name (clojure.spec.alpha/and :portkey.aws.mediapackage/--string))
(clojure.spec.alpha/def :portkey.aws.mediapackage.create-origin-endpoint-request/startover-window-seconds (clojure.spec.alpha/and :portkey.aws.mediapackage/--integer))
(clojure.spec.alpha/def :portkey.aws.mediapackage.create-origin-endpoint-request/id (clojure.spec.alpha/and :portkey.aws.mediapackage/--string))
(clojure.spec.alpha/def :portkey.aws.mediapackage/create-origin-endpoint-request (portkey.aws/json-keys :req-un [:portkey.aws.mediapackage.create-origin-endpoint-request/ChannelId :portkey.aws.mediapackage.create-origin-endpoint-request/Id] :opt-un [:portkey.aws.mediapackage/HlsPackage :portkey.aws.mediapackage/MssPackage :portkey.aws.mediapackage.create-origin-endpoint-request/CmafPackage :portkey.aws.mediapackage.create-origin-endpoint-request/TimeDelaySeconds :portkey.aws.mediapackage.create-origin-endpoint-request/Description :portkey.aws.mediapackage.create-origin-endpoint-request/Whitelist :portkey.aws.mediapackage/DashPackage :portkey.aws.mediapackage.create-origin-endpoint-request/ManifestName :portkey.aws.mediapackage.create-origin-endpoint-request/StartoverWindowSeconds] :locations {"cmafPackage" "CmafPackage", "manifestName" "ManifestName", "whitelist" "Whitelist", "id" "Id", "timeDelaySeconds" "TimeDelaySeconds", "dashPackage" "DashPackage", "startoverWindowSeconds" "StartoverWindowSeconds", "channelId" "ChannelId", "hlsPackage" "HlsPackage", "mssPackage" "MssPackage", "description" "Description"}))

(clojure.spec.alpha/def :portkey.aws.mediapackage.not-found-exception/message (clojure.spec.alpha/and :portkey.aws.mediapackage/--string))
(clojure.spec.alpha/def :portkey.aws.mediapackage/not-found-exception (portkey.aws/json-keys :req-un [] :opt-un [:portkey.aws.mediapackage.not-found-exception/Message] :locations {"message" "Message"}))

(clojure.spec.alpha/def :portkey.aws.mediapackage.delete-channel-request/id (clojure.spec.alpha/and :portkey.aws.mediapackage/--string))
(clojure.spec.alpha/def :portkey.aws.mediapackage/delete-channel-request (portkey.aws/json-keys :req-un [:portkey.aws.mediapackage.delete-channel-request/Id] :opt-un [] :locations {}))

(clojure.spec.alpha/def :portkey.aws.mediapackage.describe-channel-request/id (clojure.spec.alpha/and :portkey.aws.mediapackage/--string))
(clojure.spec.alpha/def :portkey.aws.mediapackage/describe-channel-request (portkey.aws/json-keys :req-un [:portkey.aws.mediapackage.describe-channel-request/Id] :opt-un [] :locations {}))

(clojure.spec.alpha/def :portkey.aws.mediapackage/--list-of-origin-endpoint (clojure.spec.alpha/and (clojure.spec.alpha/coll-of :portkey.aws.mediapackage/origin-endpoint) (clojure.spec.alpha/conformer clojure.core/identity (fn* [p1__13687__13688__auto__] (if (clojure.core/sequential? p1__13687__13688__auto__) p1__13687__13688__auto__ [p1__13687__13688__auto__])))))

(clojure.spec.alpha/def :portkey.aws.mediapackage.rotate-channel-credentials-response/arn (clojure.spec.alpha/and :portkey.aws.mediapackage/--string))
(clojure.spec.alpha/def :portkey.aws.mediapackage.rotate-channel-credentials-response/description (clojure.spec.alpha/and :portkey.aws.mediapackage/--string))
(clojure.spec.alpha/def :portkey.aws.mediapackage.rotate-channel-credentials-response/id (clojure.spec.alpha/and :portkey.aws.mediapackage/--string))
(clojure.spec.alpha/def :portkey.aws.mediapackage/rotate-channel-credentials-response (portkey.aws/json-keys :req-un [] :opt-un [:portkey.aws.mediapackage.rotate-channel-credentials-response/Arn :portkey.aws.mediapackage.rotate-channel-credentials-response/Description :portkey.aws.mediapackage/HlsIngest :portkey.aws.mediapackage.rotate-channel-credentials-response/Id] :locations {"arn" "Arn", "description" "Description", "hlsIngest" "HlsIngest", "id" "Id"}))

(clojure.spec.alpha/def :portkey.aws.mediapackage.list-origin-endpoints-response/next-token (clojure.spec.alpha/and :portkey.aws.mediapackage/--string))
(clojure.spec.alpha/def :portkey.aws.mediapackage.list-origin-endpoints-response/origin-endpoints (clojure.spec.alpha/and :portkey.aws.mediapackage/--list-of-origin-endpoint))
(clojure.spec.alpha/def :portkey.aws.mediapackage/list-origin-endpoints-response (portkey.aws/json-keys :req-un [] :opt-un [:portkey.aws.mediapackage.list-origin-endpoints-response/NextToken :portkey.aws.mediapackage.list-origin-endpoints-response/OriginEndpoints] :locations {"nextToken" "NextToken", "originEndpoints" "OriginEndpoints"}))

(clojure.spec.alpha/def :portkey.aws.mediapackage.list-channels-request/next-token (clojure.spec.alpha/and :portkey.aws.mediapackage/--string))
(clojure.spec.alpha/def :portkey.aws.mediapackage/list-channels-request (portkey.aws/json-keys :req-un [] :opt-un [:portkey.aws.mediapackage/MaxResults :portkey.aws.mediapackage.list-channels-request/NextToken] :locations {}))

(clojure.spec.alpha/def :portkey.aws.mediapackage/--double clojure.core/double?)

(clojure.spec.alpha/def :portkey.aws.mediapackage/stream-order (clojure.spec.alpha/conformer (clojure.core/let [m__13766__auto__ {"ORIGINAL" "ORIGINAL", :original "ORIGINAL", "VIDEO_BITRATE_ASCENDING" "VIDEO_BITRATE_ASCENDING", :video-bitrate-ascending "VIDEO_BITRATE_ASCENDING", "VIDEO_BITRATE_DESCENDING" "VIDEO_BITRATE_DESCENDING", :video-bitrate-descending "VIDEO_BITRATE_DESCENDING"}] (clojure.core/fn [s__13767__auto__] (m__13766__auto__ s__13767__auto__ :clojure.spec.alpha/invalid))) (clojure.core/comp clojure.core/keyword portkey.aws/dashed)))

(clojure.spec.alpha/def :portkey.aws.mediapackage.dash-package/encryption (clojure.spec.alpha/and :portkey.aws.mediapackage/dash-encryption))
(clojure.spec.alpha/def :portkey.aws.mediapackage.dash-package/manifest-window-seconds (clojure.spec.alpha/and :portkey.aws.mediapackage/--integer))
(clojure.spec.alpha/def :portkey.aws.mediapackage.dash-package/min-buffer-time-seconds (clojure.spec.alpha/and :portkey.aws.mediapackage/--integer))
(clojure.spec.alpha/def :portkey.aws.mediapackage.dash-package/min-update-period-seconds (clojure.spec.alpha/and :portkey.aws.mediapackage/--integer))
(clojure.spec.alpha/def :portkey.aws.mediapackage.dash-package/segment-duration-seconds (clojure.spec.alpha/and :portkey.aws.mediapackage/--integer))
(clojure.spec.alpha/def :portkey.aws.mediapackage.dash-package/suggested-presentation-delay-seconds (clojure.spec.alpha/and :portkey.aws.mediapackage/--integer))
(clojure.spec.alpha/def :portkey.aws.mediapackage/dash-package (portkey.aws/json-keys :req-un [] :opt-un [:portkey.aws.mediapackage.dash-package/Encryption :portkey.aws.mediapackage.dash-package/ManifestWindowSeconds :portkey.aws.mediapackage.dash-package/MinBufferTimeSeconds :portkey.aws.mediapackage.dash-package/MinUpdatePeriodSeconds :portkey.aws.mediapackage/Profile :portkey.aws.mediapackage.dash-package/SegmentDurationSeconds :portkey.aws.mediapackage/StreamSelection :portkey.aws.mediapackage.dash-package/SuggestedPresentationDelaySeconds] :locations {"encryption" "Encryption", "manifestWindowSeconds" "ManifestWindowSeconds", "minBufferTimeSeconds" "MinBufferTimeSeconds", "minUpdatePeriodSeconds" "MinUpdatePeriodSeconds", "profile" "Profile", "segmentDurationSeconds" "SegmentDurationSeconds", "streamSelection" "StreamSelection", "suggestedPresentationDelaySeconds" "SuggestedPresentationDelaySeconds"}))

(clojure.spec.alpha/def :portkey.aws.mediapackage.origin-endpoint-list/next-token (clojure.spec.alpha/and :portkey.aws.mediapackage/--string))
(clojure.spec.alpha/def :portkey.aws.mediapackage.origin-endpoint-list/origin-endpoints (clojure.spec.alpha/and :portkey.aws.mediapackage/--list-of-origin-endpoint))
(clojure.spec.alpha/def :portkey.aws.mediapackage/origin-endpoint-list (portkey.aws/json-keys :req-un [] :opt-un [:portkey.aws.mediapackage.origin-endpoint-list/NextToken :portkey.aws.mediapackage.origin-endpoint-list/OriginEndpoints] :locations {"nextToken" "NextToken", "originEndpoints" "OriginEndpoints"}))

(clojure.spec.alpha/def :portkey.aws.mediapackage.channel/arn (clojure.spec.alpha/and :portkey.aws.mediapackage/--string))
(clojure.spec.alpha/def :portkey.aws.mediapackage.channel/description (clojure.spec.alpha/and :portkey.aws.mediapackage/--string))
(clojure.spec.alpha/def :portkey.aws.mediapackage.channel/id (clojure.spec.alpha/and :portkey.aws.mediapackage/--string))
(clojure.spec.alpha/def :portkey.aws.mediapackage/channel (portkey.aws/json-keys :req-un [] :opt-un [:portkey.aws.mediapackage.channel/Arn :portkey.aws.mediapackage.channel/Description :portkey.aws.mediapackage/HlsIngest :portkey.aws.mediapackage.channel/Id] :locations {"arn" "Arn", "description" "Description", "hlsIngest" "HlsIngest", "id" "Id"}))

(clojure.spec.alpha/def :portkey.aws.mediapackage/max-results (clojure.spec.alpha/and clojure.core/int? (fn* [p1__13828__13829__auto__] (clojure.core/<= 1 p1__13828__13829__auto__)) (fn* [p1__13830__13831__auto__] (clojure.core/<= p1__13830__13831__auto__ 1000))))

(clojure.spec.alpha/def :portkey.aws.mediapackage.rotate-channel-credentials-request/id (clojure.spec.alpha/and :portkey.aws.mediapackage/--string))
(clojure.spec.alpha/def :portkey.aws.mediapackage/rotate-channel-credentials-request (portkey.aws/json-keys :req-un [:portkey.aws.mediapackage.rotate-channel-credentials-request/Id] :opt-un [] :locations {}))

(clojure.spec.alpha/def :portkey.aws.mediapackage/encryption-method (clojure.spec.alpha/conformer (clojure.core/let [m__13766__auto__ {"AES_128" "AES_128", :aes-128 "AES_128", "SAMPLE_AES" "SAMPLE_AES", :sample-aes "SAMPLE_AES"}] (clojure.core/fn [s__13767__auto__] (m__13766__auto__ s__13767__auto__ :clojure.spec.alpha/invalid))) (clojure.core/comp clojure.core/keyword portkey.aws/dashed)))

(clojure.spec.alpha/def :portkey.aws.mediapackage/delete-origin-endpoint-response (portkey.aws/json-keys :req-un [] :opt-un [] :locations {}))

(clojure.spec.alpha/def :portkey.aws.mediapackage/--integer (clojure.spec.alpha/and clojure.core/int?))

(clojure.spec.alpha/def :portkey.aws.mediapackage.origin-endpoint-create-parameters/channel-id (clojure.spec.alpha/and :portkey.aws.mediapackage/--string))
(clojure.spec.alpha/def :portkey.aws.mediapackage.origin-endpoint-create-parameters/cmaf-package (clojure.spec.alpha/and :portkey.aws.mediapackage/cmaf-package-create-or-update-parameters))
(clojure.spec.alpha/def :portkey.aws.mediapackage.origin-endpoint-create-parameters/time-delay-seconds (clojure.spec.alpha/and :portkey.aws.mediapackage/--integer))
(clojure.spec.alpha/def :portkey.aws.mediapackage.origin-endpoint-create-parameters/description (clojure.spec.alpha/and :portkey.aws.mediapackage/--string))
(clojure.spec.alpha/def :portkey.aws.mediapackage.origin-endpoint-create-parameters/whitelist (clojure.spec.alpha/and :portkey.aws.mediapackage/--list-of--string))
(clojure.spec.alpha/def :portkey.aws.mediapackage.origin-endpoint-create-parameters/manifest-name (clojure.spec.alpha/and :portkey.aws.mediapackage/--string))
(clojure.spec.alpha/def :portkey.aws.mediapackage.origin-endpoint-create-parameters/startover-window-seconds (clojure.spec.alpha/and :portkey.aws.mediapackage/--integer))
(clojure.spec.alpha/def :portkey.aws.mediapackage.origin-endpoint-create-parameters/id (clojure.spec.alpha/and :portkey.aws.mediapackage/--string))
(clojure.spec.alpha/def :portkey.aws.mediapackage/origin-endpoint-create-parameters (portkey.aws/json-keys :req-un [:portkey.aws.mediapackage.origin-endpoint-create-parameters/Id :portkey.aws.mediapackage.origin-endpoint-create-parameters/ChannelId] :opt-un [:portkey.aws.mediapackage/HlsPackage :portkey.aws.mediapackage/MssPackage :portkey.aws.mediapackage.origin-endpoint-create-parameters/CmafPackage :portkey.aws.mediapackage.origin-endpoint-create-parameters/TimeDelaySeconds :portkey.aws.mediapackage.origin-endpoint-create-parameters/Description :portkey.aws.mediapackage.origin-endpoint-create-parameters/Whitelist :portkey.aws.mediapackage/DashPackage :portkey.aws.mediapackage.origin-endpoint-create-parameters/ManifestName :portkey.aws.mediapackage.origin-endpoint-create-parameters/StartoverWindowSeconds] :locations {"cmafPackage" "CmafPackage", "manifestName" "ManifestName", "whitelist" "Whitelist", "id" "Id", "timeDelaySeconds" "TimeDelaySeconds", "dashPackage" "DashPackage", "startoverWindowSeconds" "StartoverWindowSeconds", "channelId" "ChannelId", "hlsPackage" "HlsPackage", "mssPackage" "MssPackage", "description" "Description"}))

(clojure.spec.alpha/def :portkey.aws.mediapackage.channel-list/channels (clojure.spec.alpha/and :portkey.aws.mediapackage/--list-of-channel))
(clojure.spec.alpha/def :portkey.aws.mediapackage.channel-list/next-token (clojure.spec.alpha/and :portkey.aws.mediapackage/--string))
(clojure.spec.alpha/def :portkey.aws.mediapackage/channel-list (portkey.aws/json-keys :req-un [] :opt-un [:portkey.aws.mediapackage.channel-list/Channels :portkey.aws.mediapackage.channel-list/NextToken] :locations {"channels" "Channels", "nextToken" "NextToken"}))

(clojure.spec.alpha/def :portkey.aws.mediapackage.channel-update-parameters/description (clojure.spec.alpha/and :portkey.aws.mediapackage/--string))
(clojure.spec.alpha/def :portkey.aws.mediapackage/channel-update-parameters (portkey.aws/json-keys :req-un [] :opt-un [:portkey.aws.mediapackage.channel-update-parameters/Description] :locations {"description" "Description"}))

(clojure.spec.alpha/def :portkey.aws.mediapackage.cmaf-encryption/key-rotation-interval-seconds (clojure.spec.alpha/and :portkey.aws.mediapackage/--integer))
(clojure.spec.alpha/def :portkey.aws.mediapackage/cmaf-encryption (portkey.aws/json-keys :req-un [:portkey.aws.mediapackage/SpekeKeyProvider] :opt-un [:portkey.aws.mediapackage.cmaf-encryption/KeyRotationIntervalSeconds] :locations {"keyRotationIntervalSeconds" "KeyRotationIntervalSeconds", "spekeKeyProvider" "SpekeKeyProvider"}))

(clojure.spec.alpha/def :portkey.aws.mediapackage.update-channel-response/arn (clojure.spec.alpha/and :portkey.aws.mediapackage/--string))
(clojure.spec.alpha/def :portkey.aws.mediapackage.update-channel-response/description (clojure.spec.alpha/and :portkey.aws.mediapackage/--string))
(clojure.spec.alpha/def :portkey.aws.mediapackage.update-channel-response/id (clojure.spec.alpha/and :portkey.aws.mediapackage/--string))
(clojure.spec.alpha/def :portkey.aws.mediapackage/update-channel-response (portkey.aws/json-keys :req-un [] :opt-un [:portkey.aws.mediapackage.update-channel-response/Arn :portkey.aws.mediapackage.update-channel-response/Description :portkey.aws.mediapackage/HlsIngest :portkey.aws.mediapackage.update-channel-response/Id] :locations {"arn" "Arn", "description" "Description", "hlsIngest" "HlsIngest", "id" "Id"}))

(clojure.spec.alpha/def :portkey.aws.mediapackage.hls-manifest-create-or-update-parameters/id (clojure.spec.alpha/and :portkey.aws.mediapackage/--string))
(clojure.spec.alpha/def :portkey.aws.mediapackage.hls-manifest-create-or-update-parameters/include-iframe-only-stream (clojure.spec.alpha/and :portkey.aws.mediapackage/--boolean))
(clojure.spec.alpha/def :portkey.aws.mediapackage.hls-manifest-create-or-update-parameters/manifest-name (clojure.spec.alpha/and :portkey.aws.mediapackage/--string))
(clojure.spec.alpha/def :portkey.aws.mediapackage.hls-manifest-create-or-update-parameters/playlist-window-seconds (clojure.spec.alpha/and :portkey.aws.mediapackage/--integer))
(clojure.spec.alpha/def :portkey.aws.mediapackage.hls-manifest-create-or-update-parameters/program-date-time-interval-seconds (clojure.spec.alpha/and :portkey.aws.mediapackage/--integer))
(clojure.spec.alpha/def :portkey.aws.mediapackage/hls-manifest-create-or-update-parameters (portkey.aws/json-keys :req-un [:portkey.aws.mediapackage.hls-manifest-create-or-update-parameters/Id] :opt-un [:portkey.aws.mediapackage/AdMarkers :portkey.aws.mediapackage.hls-manifest-create-or-update-parameters/IncludeIframeOnlyStream :portkey.aws.mediapackage.hls-manifest-create-or-update-parameters/ManifestName :portkey.aws.mediapackage/PlaylistType :portkey.aws.mediapackage.hls-manifest-create-or-update-parameters/PlaylistWindowSeconds :portkey.aws.mediapackage.hls-manifest-create-or-update-parameters/ProgramDateTimeIntervalSeconds] :locations {"adMarkers" "AdMarkers", "id" "Id", "includeIframeOnlyStream" "IncludeIframeOnlyStream", "manifestName" "ManifestName", "playlistType" "PlaylistType", "playlistWindowSeconds" "PlaylistWindowSeconds", "programDateTimeIntervalSeconds" "ProgramDateTimeIntervalSeconds"}))

(clojure.spec.alpha/def :portkey.aws.mediapackage.update-origin-endpoint-request/cmaf-package (clojure.spec.alpha/and :portkey.aws.mediapackage/cmaf-package-create-or-update-parameters))
(clojure.spec.alpha/def :portkey.aws.mediapackage.update-origin-endpoint-request/time-delay-seconds (clojure.spec.alpha/and :portkey.aws.mediapackage/--integer))
(clojure.spec.alpha/def :portkey.aws.mediapackage.update-origin-endpoint-request/description (clojure.spec.alpha/and :portkey.aws.mediapackage/--string))
(clojure.spec.alpha/def :portkey.aws.mediapackage.update-origin-endpoint-request/whitelist (clojure.spec.alpha/and :portkey.aws.mediapackage/--list-of--string))
(clojure.spec.alpha/def :portkey.aws.mediapackage.update-origin-endpoint-request/manifest-name (clojure.spec.alpha/and :portkey.aws.mediapackage/--string))
(clojure.spec.alpha/def :portkey.aws.mediapackage.update-origin-endpoint-request/startover-window-seconds (clojure.spec.alpha/and :portkey.aws.mediapackage/--integer))
(clojure.spec.alpha/def :portkey.aws.mediapackage.update-origin-endpoint-request/id (clojure.spec.alpha/and :portkey.aws.mediapackage/--string))
(clojure.spec.alpha/def :portkey.aws.mediapackage/update-origin-endpoint-request (portkey.aws/json-keys :req-un [:portkey.aws.mediapackage.update-origin-endpoint-request/Id] :opt-un [:portkey.aws.mediapackage/HlsPackage :portkey.aws.mediapackage/MssPackage :portkey.aws.mediapackage.update-origin-endpoint-request/CmafPackage :portkey.aws.mediapackage.update-origin-endpoint-request/TimeDelaySeconds :portkey.aws.mediapackage.update-origin-endpoint-request/Description :portkey.aws.mediapackage.update-origin-endpoint-request/Whitelist :portkey.aws.mediapackage/DashPackage :portkey.aws.mediapackage.update-origin-endpoint-request/ManifestName :portkey.aws.mediapackage.update-origin-endpoint-request/StartoverWindowSeconds] :locations {"cmafPackage" "CmafPackage", "manifestName" "ManifestName", "whitelist" "Whitelist", "timeDelaySeconds" "TimeDelaySeconds", "dashPackage" "DashPackage", "startoverWindowSeconds" "StartoverWindowSeconds", "hlsPackage" "HlsPackage", "mssPackage" "MssPackage", "description" "Description"}))

(clojure.spec.alpha/def :portkey.aws.mediapackage/playlist-type (clojure.spec.alpha/conformer (clojure.core/let [m__13766__auto__ {"NONE" "NONE", :none "NONE", "EVENT" "EVENT", :event "EVENT", "VOD" "VOD", :vod "VOD"}] (clojure.core/fn [s__13767__auto__] (m__13766__auto__ s__13767__auto__ :clojure.spec.alpha/invalid))) (clojure.core/comp clojure.core/keyword portkey.aws/dashed)))

(clojure.core/defn delete-channel "Deletes an existing Channel." ([delete-channel-request] (portkey.aws/-rest-json-call portkey.aws.mediapackage/endpoints "DELETE" "/channels/{id}" delete-channel-request :portkey.aws.mediapackage/delete-channel-request {:payload nil, :move {}, :headers {}, :uri {"id" "Id"}, :querystring {}} 202 :portkey.aws.mediapackage/delete-channel-response {"UnprocessableEntityException" :portkey.aws.mediapackage/unprocessable-entity-exception, "InternalServerErrorException" :portkey.aws.mediapackage/internal-server-error-exception, "ForbiddenException" :portkey.aws.mediapackage/forbidden-exception, "NotFoundException" :portkey.aws.mediapackage/not-found-exception, "ServiceUnavailableException" :portkey.aws.mediapackage/service-unavailable-exception, "TooManyRequestsException" :portkey.aws.mediapackage/too-many-requests-exception})))
(clojure.spec.alpha/fdef delete-channel :args (clojure.spec.alpha/tuple :portkey.aws.mediapackage/delete-channel-request) :ret (clojure.spec.alpha/and :portkey.aws.mediapackage/delete-channel-response))

(clojure.core/defn create-origin-endpoint "Creates a new OriginEndpoint record." ([create-origin-endpoint-request] (portkey.aws/-rest-json-call portkey.aws.mediapackage/endpoints "POST" "/origin_endpoints" create-origin-endpoint-request :portkey.aws.mediapackage/create-origin-endpoint-request {:payload nil, :move {"cmafPackage" "CmafPackage", "manifestName" "ManifestName", "whitelist" "Whitelist", "id" "Id", "timeDelaySeconds" "TimeDelaySeconds", "dashPackage" "DashPackage", "startoverWindowSeconds" "StartoverWindowSeconds", "channelId" "ChannelId", "hlsPackage" "HlsPackage", "mssPackage" "MssPackage", "description" "Description"}, :headers {}, :uri {}, :querystring {}} 200 :portkey.aws.mediapackage/create-origin-endpoint-response {"UnprocessableEntityException" :portkey.aws.mediapackage/unprocessable-entity-exception, "InternalServerErrorException" :portkey.aws.mediapackage/internal-server-error-exception, "ForbiddenException" :portkey.aws.mediapackage/forbidden-exception, "NotFoundException" :portkey.aws.mediapackage/not-found-exception, "ServiceUnavailableException" :portkey.aws.mediapackage/service-unavailable-exception, "TooManyRequestsException" :portkey.aws.mediapackage/too-many-requests-exception})))
(clojure.spec.alpha/fdef create-origin-endpoint :args (clojure.spec.alpha/tuple :portkey.aws.mediapackage/create-origin-endpoint-request) :ret (clojure.spec.alpha/and :portkey.aws.mediapackage/create-origin-endpoint-response))

(clojure.core/defn list-origin-endpoints "Returns a collection of OriginEndpoint records." ([] (list-origin-endpoints {})) ([list-origin-endpoints-request] (portkey.aws/-rest-json-call portkey.aws.mediapackage/endpoints "GET" "/origin_endpoints" list-origin-endpoints-request :portkey.aws.mediapackage/list-origin-endpoints-request {:payload nil, :move {}, :headers {}, :uri {}, :querystring {"channelId" "ChannelId", "maxResults" "MaxResults", "nextToken" "NextToken"}} 200 :portkey.aws.mediapackage/list-origin-endpoints-response {"UnprocessableEntityException" :portkey.aws.mediapackage/unprocessable-entity-exception, "InternalServerErrorException" :portkey.aws.mediapackage/internal-server-error-exception, "ForbiddenException" :portkey.aws.mediapackage/forbidden-exception, "NotFoundException" :portkey.aws.mediapackage/not-found-exception, "ServiceUnavailableException" :portkey.aws.mediapackage/service-unavailable-exception, "TooManyRequestsException" :portkey.aws.mediapackage/too-many-requests-exception})))
(clojure.spec.alpha/fdef list-origin-endpoints :args (clojure.spec.alpha/? :portkey.aws.mediapackage/list-origin-endpoints-request) :ret (clojure.spec.alpha/and :portkey.aws.mediapackage/list-origin-endpoints-response))

(clojure.core/defn update-channel "Updates an existing Channel." ([update-channel-request] (portkey.aws/-rest-json-call portkey.aws.mediapackage/endpoints "PUT" "/channels/{id}" update-channel-request :portkey.aws.mediapackage/update-channel-request {:payload nil, :move {"description" "Description"}, :headers {}, :uri {"id" "Id"}, :querystring {}} 200 :portkey.aws.mediapackage/update-channel-response {"UnprocessableEntityException" :portkey.aws.mediapackage/unprocessable-entity-exception, "InternalServerErrorException" :portkey.aws.mediapackage/internal-server-error-exception, "ForbiddenException" :portkey.aws.mediapackage/forbidden-exception, "NotFoundException" :portkey.aws.mediapackage/not-found-exception, "ServiceUnavailableException" :portkey.aws.mediapackage/service-unavailable-exception, "TooManyRequestsException" :portkey.aws.mediapackage/too-many-requests-exception})))
(clojure.spec.alpha/fdef update-channel :args (clojure.spec.alpha/tuple :portkey.aws.mediapackage/update-channel-request) :ret (clojure.spec.alpha/and :portkey.aws.mediapackage/update-channel-response))

(clojure.core/defn update-origin-endpoint "Updates an existing OriginEndpoint." ([update-origin-endpoint-request] (portkey.aws/-rest-json-call portkey.aws.mediapackage/endpoints "PUT" "/origin_endpoints/{id}" update-origin-endpoint-request :portkey.aws.mediapackage/update-origin-endpoint-request {:payload nil, :move {"cmafPackage" "CmafPackage", "manifestName" "ManifestName", "whitelist" "Whitelist", "timeDelaySeconds" "TimeDelaySeconds", "dashPackage" "DashPackage", "startoverWindowSeconds" "StartoverWindowSeconds", "hlsPackage" "HlsPackage", "mssPackage" "MssPackage", "description" "Description"}, :headers {}, :uri {"id" "Id"}, :querystring {}} 200 :portkey.aws.mediapackage/update-origin-endpoint-response {"UnprocessableEntityException" :portkey.aws.mediapackage/unprocessable-entity-exception, "InternalServerErrorException" :portkey.aws.mediapackage/internal-server-error-exception, "ForbiddenException" :portkey.aws.mediapackage/forbidden-exception, "NotFoundException" :portkey.aws.mediapackage/not-found-exception, "ServiceUnavailableException" :portkey.aws.mediapackage/service-unavailable-exception, "TooManyRequestsException" :portkey.aws.mediapackage/too-many-requests-exception})))
(clojure.spec.alpha/fdef update-origin-endpoint :args (clojure.spec.alpha/tuple :portkey.aws.mediapackage/update-origin-endpoint-request) :ret (clojure.spec.alpha/and :portkey.aws.mediapackage/update-origin-endpoint-response))

(clojure.core/defn rotate-channel-credentials "Changes the Channel ingest username and password." ([rotate-channel-credentials-request] (portkey.aws/-rest-json-call portkey.aws.mediapackage/endpoints "PUT" "/channels/{id}/credentials" rotate-channel-credentials-request :portkey.aws.mediapackage/rotate-channel-credentials-request {:payload nil, :move {}, :headers {}, :uri {"id" "Id"}, :querystring {}} 200 :portkey.aws.mediapackage/rotate-channel-credentials-response {"UnprocessableEntityException" :portkey.aws.mediapackage/unprocessable-entity-exception, "InternalServerErrorException" :portkey.aws.mediapackage/internal-server-error-exception, "ForbiddenException" :portkey.aws.mediapackage/forbidden-exception, "NotFoundException" :portkey.aws.mediapackage/not-found-exception, "ServiceUnavailableException" :portkey.aws.mediapackage/service-unavailable-exception, "TooManyRequestsException" :portkey.aws.mediapackage/too-many-requests-exception})))
(clojure.spec.alpha/fdef rotate-channel-credentials :args (clojure.spec.alpha/tuple :portkey.aws.mediapackage/rotate-channel-credentials-request) :ret (clojure.spec.alpha/and :portkey.aws.mediapackage/rotate-channel-credentials-response))

(clojure.core/defn describe-origin-endpoint "Gets details about an existing OriginEndpoint." ([describe-origin-endpoint-request] (portkey.aws/-rest-json-call portkey.aws.mediapackage/endpoints "GET" "/origin_endpoints/{id}" describe-origin-endpoint-request :portkey.aws.mediapackage/describe-origin-endpoint-request {:payload nil, :move {}, :headers {}, :uri {"id" "Id"}, :querystring {}} 200 :portkey.aws.mediapackage/describe-origin-endpoint-response {"UnprocessableEntityException" :portkey.aws.mediapackage/unprocessable-entity-exception, "InternalServerErrorException" :portkey.aws.mediapackage/internal-server-error-exception, "ForbiddenException" :portkey.aws.mediapackage/forbidden-exception, "NotFoundException" :portkey.aws.mediapackage/not-found-exception, "ServiceUnavailableException" :portkey.aws.mediapackage/service-unavailable-exception, "TooManyRequestsException" :portkey.aws.mediapackage/too-many-requests-exception})))
(clojure.spec.alpha/fdef describe-origin-endpoint :args (clojure.spec.alpha/tuple :portkey.aws.mediapackage/describe-origin-endpoint-request) :ret (clojure.spec.alpha/and :portkey.aws.mediapackage/describe-origin-endpoint-response))

(clojure.core/defn create-channel "Creates a new Channel." ([create-channel-request] (portkey.aws/-rest-json-call portkey.aws.mediapackage/endpoints "POST" "/channels" create-channel-request :portkey.aws.mediapackage/create-channel-request {:payload nil, :move {"description" "Description", "id" "Id"}, :headers {}, :uri {}, :querystring {}} 200 :portkey.aws.mediapackage/create-channel-response {"UnprocessableEntityException" :portkey.aws.mediapackage/unprocessable-entity-exception, "InternalServerErrorException" :portkey.aws.mediapackage/internal-server-error-exception, "ForbiddenException" :portkey.aws.mediapackage/forbidden-exception, "NotFoundException" :portkey.aws.mediapackage/not-found-exception, "ServiceUnavailableException" :portkey.aws.mediapackage/service-unavailable-exception, "TooManyRequestsException" :portkey.aws.mediapackage/too-many-requests-exception})))
(clojure.spec.alpha/fdef create-channel :args (clojure.spec.alpha/tuple :portkey.aws.mediapackage/create-channel-request) :ret (clojure.spec.alpha/and :portkey.aws.mediapackage/create-channel-response))

(clojure.core/defn describe-channel "Gets details about a Channel." ([describe-channel-request] (portkey.aws/-rest-json-call portkey.aws.mediapackage/endpoints "GET" "/channels/{id}" describe-channel-request :portkey.aws.mediapackage/describe-channel-request {:payload nil, :move {}, :headers {}, :uri {"id" "Id"}, :querystring {}} 200 :portkey.aws.mediapackage/describe-channel-response {"UnprocessableEntityException" :portkey.aws.mediapackage/unprocessable-entity-exception, "InternalServerErrorException" :portkey.aws.mediapackage/internal-server-error-exception, "ForbiddenException" :portkey.aws.mediapackage/forbidden-exception, "NotFoundException" :portkey.aws.mediapackage/not-found-exception, "ServiceUnavailableException" :portkey.aws.mediapackage/service-unavailable-exception, "TooManyRequestsException" :portkey.aws.mediapackage/too-many-requests-exception})))
(clojure.spec.alpha/fdef describe-channel :args (clojure.spec.alpha/tuple :portkey.aws.mediapackage/describe-channel-request) :ret (clojure.spec.alpha/and :portkey.aws.mediapackage/describe-channel-response))

(clojure.core/defn list-channels "Returns a collection of Channels." ([] (list-channels {})) ([list-channels-request] (portkey.aws/-rest-json-call portkey.aws.mediapackage/endpoints "GET" "/channels" list-channels-request :portkey.aws.mediapackage/list-channels-request {:payload nil, :move {}, :headers {}, :uri {}, :querystring {"maxResults" "MaxResults", "nextToken" "NextToken"}} 200 :portkey.aws.mediapackage/list-channels-response {"UnprocessableEntityException" :portkey.aws.mediapackage/unprocessable-entity-exception, "InternalServerErrorException" :portkey.aws.mediapackage/internal-server-error-exception, "ForbiddenException" :portkey.aws.mediapackage/forbidden-exception, "NotFoundException" :portkey.aws.mediapackage/not-found-exception, "ServiceUnavailableException" :portkey.aws.mediapackage/service-unavailable-exception, "TooManyRequestsException" :portkey.aws.mediapackage/too-many-requests-exception})))
(clojure.spec.alpha/fdef list-channels :args (clojure.spec.alpha/? :portkey.aws.mediapackage/list-channels-request) :ret (clojure.spec.alpha/and :portkey.aws.mediapackage/list-channels-response))

(clojure.core/defn delete-origin-endpoint "Deletes an existing OriginEndpoint." ([delete-origin-endpoint-request] (portkey.aws/-rest-json-call portkey.aws.mediapackage/endpoints "DELETE" "/origin_endpoints/{id}" delete-origin-endpoint-request :portkey.aws.mediapackage/delete-origin-endpoint-request {:payload nil, :move {}, :headers {}, :uri {"id" "Id"}, :querystring {}} 202 :portkey.aws.mediapackage/delete-origin-endpoint-response {"UnprocessableEntityException" :portkey.aws.mediapackage/unprocessable-entity-exception, "InternalServerErrorException" :portkey.aws.mediapackage/internal-server-error-exception, "ForbiddenException" :portkey.aws.mediapackage/forbidden-exception, "NotFoundException" :portkey.aws.mediapackage/not-found-exception, "ServiceUnavailableException" :portkey.aws.mediapackage/service-unavailable-exception, "TooManyRequestsException" :portkey.aws.mediapackage/too-many-requests-exception})))
(clojure.spec.alpha/fdef delete-origin-endpoint :args (clojure.spec.alpha/tuple :portkey.aws.mediapackage/delete-origin-endpoint-request) :ret (clojure.spec.alpha/and :portkey.aws.mediapackage/delete-origin-endpoint-response))
