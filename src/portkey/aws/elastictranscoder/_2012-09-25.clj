(ns portkey.aws.elastictranscoder.-2012-09-25 (:require [portkey.aws]))

(def
 endpoints
 '{"ap-northeast-1"
   {:credential-scope
    {:service "elastictranscoder", :region "ap-northeast-1"},
    :ssl-common-name "elastictranscoder.ap-northeast-1.amazonaws.com",
    :endpoint "https://elastictranscoder.ap-northeast-1.amazonaws.com",
    :signature-version :v4},
   "eu-west-1"
   {:credential-scope
    {:service "elastictranscoder", :region "eu-west-1"},
    :ssl-common-name "elastictranscoder.eu-west-1.amazonaws.com",
    :endpoint "https://elastictranscoder.eu-west-1.amazonaws.com",
    :signature-version :v4},
   "ap-southeast-2"
   {:credential-scope
    {:service "elastictranscoder", :region "ap-southeast-2"},
    :ssl-common-name "elastictranscoder.ap-southeast-2.amazonaws.com",
    :endpoint "https://elastictranscoder.ap-southeast-2.amazonaws.com",
    :signature-version :v4},
   "ap-southeast-1"
   {:credential-scope
    {:service "elastictranscoder", :region "ap-southeast-1"},
    :ssl-common-name "elastictranscoder.ap-southeast-1.amazonaws.com",
    :endpoint "https://elastictranscoder.ap-southeast-1.amazonaws.com",
    :signature-version :v4},
   "us-west-2"
   {:credential-scope
    {:service "elastictranscoder", :region "us-west-2"},
    :ssl-common-name "elastictranscoder.us-west-2.amazonaws.com",
    :endpoint "https://elastictranscoder.us-west-2.amazonaws.com",
    :signature-version :v4},
   "us-east-1"
   {:credential-scope
    {:service "elastictranscoder", :region "us-east-1"},
    :ssl-common-name "elastictranscoder.us-east-1.amazonaws.com",
    :endpoint "https://elastictranscoder.us-east-1.amazonaws.com",
    :signature-version :v4},
   "us-west-1"
   {:credential-scope
    {:service "elastictranscoder", :region "us-west-1"},
    :ssl-common-name "elastictranscoder.us-west-1.amazonaws.com",
    :endpoint "https://elastictranscoder.us-west-1.amazonaws.com",
    :signature-version :v4},
   "ap-south-1"
   {:credential-scope
    {:service "elastictranscoder", :region "ap-south-1"},
    :ssl-common-name "elastictranscoder.ap-south-1.amazonaws.com",
    :endpoint "https://elastictranscoder.ap-south-1.amazonaws.com",
    :signature-version :v4}})

(clojure.spec.alpha/def :portkey.aws.elastictranscoder.-2012-09-25/fixedgop (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__13770__auto__] (clojure.core/re-matches #"(^true$)|(^false$)" s__13770__auto__))))

(clojure.spec.alpha/def :portkey.aws.elastictranscoder.-2012-09-25.update-pipeline-status-request/status (clojure.spec.alpha/and :portkey.aws.elastictranscoder.-2012-09-25/pipeline-status))
(clojure.spec.alpha/def :portkey.aws.elastictranscoder.-2012-09-25/update-pipeline-status-request (portkey.aws/json-keys :req-un [:portkey.aws.elastictranscoder.-2012-09-25/Id :portkey.aws.elastictranscoder.-2012-09-25.update-pipeline-status-request/Status] :opt-un [] :locations {}))

(clojure.spec.alpha/def :portkey.aws.elastictranscoder.-2012-09-25.create-preset-request/container (clojure.spec.alpha/and :portkey.aws.elastictranscoder.-2012-09-25/preset-container))
(clojure.spec.alpha/def :portkey.aws.elastictranscoder.-2012-09-25.create-preset-request/video (clojure.spec.alpha/and :portkey.aws.elastictranscoder.-2012-09-25/video-parameters))
(clojure.spec.alpha/def :portkey.aws.elastictranscoder.-2012-09-25.create-preset-request/audio (clojure.spec.alpha/and :portkey.aws.elastictranscoder.-2012-09-25/audio-parameters))
(clojure.spec.alpha/def :portkey.aws.elastictranscoder.-2012-09-25/create-preset-request (portkey.aws/json-keys :req-un [:portkey.aws.elastictranscoder.-2012-09-25/Name :portkey.aws.elastictranscoder.-2012-09-25.create-preset-request/Container] :opt-un [:portkey.aws.elastictranscoder.-2012-09-25/Description :portkey.aws.elastictranscoder.-2012-09-25.create-preset-request/Video :portkey.aws.elastictranscoder.-2012-09-25.create-preset-request/Audio :portkey.aws.elastictranscoder.-2012-09-25/Thumbnails] :locations {}))

(clojure.spec.alpha/def :portkey.aws.elastictranscoder.-2012-09-25.artwork/input-key (clojure.spec.alpha/and :portkey.aws.elastictranscoder.-2012-09-25/watermark-key))
(clojure.spec.alpha/def :portkey.aws.elastictranscoder.-2012-09-25.artwork/max-width (clojure.spec.alpha/and :portkey.aws.elastictranscoder.-2012-09-25/digits-or-auto))
(clojure.spec.alpha/def :portkey.aws.elastictranscoder.-2012-09-25.artwork/max-height (clojure.spec.alpha/and :portkey.aws.elastictranscoder.-2012-09-25/digits-or-auto))
(clojure.spec.alpha/def :portkey.aws.elastictranscoder.-2012-09-25.artwork/album-art-format (clojure.spec.alpha/and :portkey.aws.elastictranscoder.-2012-09-25/jpg-or-png))
(clojure.spec.alpha/def :portkey.aws.elastictranscoder.-2012-09-25/artwork (portkey.aws/json-keys :req-un [] :opt-un [:portkey.aws.elastictranscoder.-2012-09-25.artwork/InputKey :portkey.aws.elastictranscoder.-2012-09-25.artwork/MaxWidth :portkey.aws.elastictranscoder.-2012-09-25.artwork/MaxHeight :portkey.aws.elastictranscoder.-2012-09-25/SizingPolicy :portkey.aws.elastictranscoder.-2012-09-25/PaddingPolicy :portkey.aws.elastictranscoder.-2012-09-25.artwork/AlbumArtFormat :portkey.aws.elastictranscoder.-2012-09-25/Encryption] :locations {}))

(clojure.spec.alpha/def :portkey.aws.elastictranscoder.-2012-09-25/sns-topic (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__13770__auto__] (clojure.core/re-matches #"(^$)|(^arn:aws:sns:.*:\w{12}:.+$)" s__13770__auto__))))

(clojure.spec.alpha/def :portkey.aws.elastictranscoder.-2012-09-25/caption-sources (clojure.spec.alpha/and (clojure.spec.alpha/coll-of :portkey.aws.elastictranscoder.-2012-09-25/caption-source :max-count 20) (clojure.spec.alpha/conformer clojure.core/identity (fn* [p1__13687__13688__auto__] (if (clojure.core/sequential? p1__13687__13688__auto__) p1__13687__13688__auto__ [p1__13687__13688__auto__])))))

(clojure.spec.alpha/def :portkey.aws.elastictranscoder.-2012-09-25/exception-messages (clojure.spec.alpha/and (clojure.spec.alpha/coll-of :portkey.aws.elastictranscoder.-2012-09-25/string) (clojure.spec.alpha/conformer clojure.core/identity (fn* [p1__13687__13688__auto__] (if (clojure.core/sequential? p1__13687__13688__auto__) p1__13687__13688__auto__ [p1__13687__13688__auto__])))))

(clojure.spec.alpha/def :portkey.aws.elastictranscoder.-2012-09-25/presets (clojure.spec.alpha/and (clojure.spec.alpha/coll-of :portkey.aws.elastictranscoder.-2012-09-25/preset) (clojure.spec.alpha/conformer clojure.core/identity (fn* [p1__13687__13688__auto__] (if (clojure.core/sequential? p1__13687__13688__auto__) p1__13687__13688__auto__ [p1__13687__13688__auto__])))))

(clojure.spec.alpha/def :portkey.aws.elastictranscoder.-2012-09-25/update-pipeline-status-response (portkey.aws/json-keys :req-un [] :opt-un [:portkey.aws.elastictranscoder.-2012-09-25/Pipeline] :locations {}))

(clojure.spec.alpha/def :portkey.aws.elastictranscoder.-2012-09-25/permissions (clojure.spec.alpha/and (clojure.spec.alpha/coll-of :portkey.aws.elastictranscoder.-2012-09-25/permission :max-count 30) (clojure.spec.alpha/conformer clojure.core/identity (fn* [p1__13687__13688__auto__] (if (clojure.core/sequential? p1__13687__13688__auto__) p1__13687__13688__auto__ [p1__13687__13688__auto__])))))

(clojure.spec.alpha/def :portkey.aws.elastictranscoder.-2012-09-25/sizing-policy (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__13770__auto__] (clojure.core/re-matches #"(^Fit$)|(^Fill$)|(^Stretch$)|(^Keep$)|(^ShrinkToFit$)|(^ShrinkToFill$)" s__13770__auto__))))

(clojure.spec.alpha/def :portkey.aws.elastictranscoder.-2012-09-25/create-pipeline-response (portkey.aws/json-keys :req-un [] :opt-un [:portkey.aws.elastictranscoder.-2012-09-25/Pipeline :portkey.aws.elastictranscoder.-2012-09-25/Warnings] :locations {}))

(clojure.spec.alpha/def :portkey.aws.elastictranscoder.-2012-09-25/codec-options (clojure.spec.alpha/map-of :portkey.aws.elastictranscoder.-2012-09-25/codec-option :portkey.aws.elastictranscoder.-2012-09-25/codec-option))

(clojure.spec.alpha/def :portkey.aws.elastictranscoder.-2012-09-25.play-ready-drm/format (clojure.spec.alpha/and :portkey.aws.elastictranscoder.-2012-09-25/play-ready-drm-format-string))
(clojure.spec.alpha/def :portkey.aws.elastictranscoder.-2012-09-25.play-ready-drm/key (clojure.spec.alpha/and :portkey.aws.elastictranscoder.-2012-09-25/non-empty-base64-encoded-string))
(clojure.spec.alpha/def :portkey.aws.elastictranscoder.-2012-09-25.play-ready-drm/key-md5 (clojure.spec.alpha/and :portkey.aws.elastictranscoder.-2012-09-25/non-empty-base64-encoded-string))
(clojure.spec.alpha/def :portkey.aws.elastictranscoder.-2012-09-25.play-ready-drm/key-id (clojure.spec.alpha/and :portkey.aws.elastictranscoder.-2012-09-25/key-id-guid))
(clojure.spec.alpha/def :portkey.aws.elastictranscoder.-2012-09-25.play-ready-drm/initialization-vector (clojure.spec.alpha/and :portkey.aws.elastictranscoder.-2012-09-25/zero-to255-string))
(clojure.spec.alpha/def :portkey.aws.elastictranscoder.-2012-09-25.play-ready-drm/license-acquisition-url (clojure.spec.alpha/and :portkey.aws.elastictranscoder.-2012-09-25/one-to512-string))
(clojure.spec.alpha/def :portkey.aws.elastictranscoder.-2012-09-25/play-ready-drm (portkey.aws/json-keys :req-un [] :opt-un [:portkey.aws.elastictranscoder.-2012-09-25.play-ready-drm/Format :portkey.aws.elastictranscoder.-2012-09-25.play-ready-drm/Key :portkey.aws.elastictranscoder.-2012-09-25.play-ready-drm/KeyMd5 :portkey.aws.elastictranscoder.-2012-09-25.play-ready-drm/KeyId :portkey.aws.elastictranscoder.-2012-09-25.play-ready-drm/InitializationVector :portkey.aws.elastictranscoder.-2012-09-25.play-ready-drm/LicenseAcquisitionUrl] :locations {}))

(clojure.spec.alpha/def :portkey.aws.elastictranscoder.-2012-09-25/codec-option (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__13768__auto__] (clojure.core/<= 1 (clojure.core/count s__13768__auto__))) (clojure.core/fn [s__13769__auto__] (clojure.core/< (clojure.core/count s__13769__auto__) 255))))

(clojure.spec.alpha/def :portkey.aws.elastictranscoder.-2012-09-25/cancel-job-response (portkey.aws/json-keys :req-un [] :opt-un [] :locations {}))

(clojure.spec.alpha/def :portkey.aws.elastictranscoder.-2012-09-25/validation-exception (portkey.aws/json-keys :req-un [] :opt-un [] :locations {}))

(clojure.spec.alpha/def :portkey.aws.elastictranscoder.-2012-09-25/job-status (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__13770__auto__] (clojure.core/re-matches #"(^Submitted$)|(^Progressing$)|(^Complete$)|(^Canceled$)|(^Error$)" s__13770__auto__))))

(clojure.spec.alpha/def :portkey.aws.elastictranscoder.-2012-09-25/access-controls (clojure.spec.alpha/and (clojure.spec.alpha/coll-of :portkey.aws.elastictranscoder.-2012-09-25/access-control :max-count 30) (clojure.spec.alpha/conformer clojure.core/identity (fn* [p1__13687__13688__auto__] (if (clojure.core/sequential? p1__13687__13688__auto__) p1__13687__13688__auto__ [p1__13687__13688__auto__])))))

(clojure.spec.alpha/def :portkey.aws.elastictranscoder.-2012-09-25/output-keys (clojure.spec.alpha/and (clojure.spec.alpha/coll-of :portkey.aws.elastictranscoder.-2012-09-25/key :max-count 30) (clojure.spec.alpha/conformer clojure.core/identity (fn* [p1__13687__13688__auto__] (if (clojure.core/sequential? p1__13687__13688__auto__) p1__13687__13688__auto__ [p1__13687__13688__auto__])))))

(clojure.spec.alpha/def :portkey.aws.elastictranscoder.-2012-09-25.video-parameters/codec (clojure.spec.alpha/and :portkey.aws.elastictranscoder.-2012-09-25/video-codec))
(clojure.spec.alpha/def :portkey.aws.elastictranscoder.-2012-09-25.video-parameters/bit-rate (clojure.spec.alpha/and :portkey.aws.elastictranscoder.-2012-09-25/video-bit-rate))
(clojure.spec.alpha/def :portkey.aws.elastictranscoder.-2012-09-25.video-parameters/watermarks (clojure.spec.alpha/and :portkey.aws.elastictranscoder.-2012-09-25/preset-watermarks))
(clojure.spec.alpha/def :portkey.aws.elastictranscoder.-2012-09-25.video-parameters/max-height (clojure.spec.alpha/and :portkey.aws.elastictranscoder.-2012-09-25/digits-or-auto))
(clojure.spec.alpha/def :portkey.aws.elastictranscoder.-2012-09-25.video-parameters/display-aspect-ratio (clojure.spec.alpha/and :portkey.aws.elastictranscoder.-2012-09-25/aspect-ratio))
(clojure.spec.alpha/def :portkey.aws.elastictranscoder.-2012-09-25.video-parameters/max-width (clojure.spec.alpha/and :portkey.aws.elastictranscoder.-2012-09-25/digits-or-auto))
(clojure.spec.alpha/def :portkey.aws.elastictranscoder.-2012-09-25/video-parameters (portkey.aws/json-keys :req-un [] :opt-un [:portkey.aws.elastictranscoder.-2012-09-25/FixedGOP :portkey.aws.elastictranscoder.-2012-09-25/SizingPolicy :portkey.aws.elastictranscoder.-2012-09-25/CodecOptions :portkey.aws.elastictranscoder.-2012-09-25.video-parameters/Codec :portkey.aws.elastictranscoder.-2012-09-25.video-parameters/BitRate :portkey.aws.elastictranscoder.-2012-09-25/KeyframesMaxDist :portkey.aws.elastictranscoder.-2012-09-25/Resolution :portkey.aws.elastictranscoder.-2012-09-25/FrameRate :portkey.aws.elastictranscoder.-2012-09-25/AspectRatio :portkey.aws.elastictranscoder.-2012-09-25/MaxFrameRate :portkey.aws.elastictranscoder.-2012-09-25.video-parameters/Watermarks :portkey.aws.elastictranscoder.-2012-09-25.video-parameters/MaxHeight :portkey.aws.elastictranscoder.-2012-09-25.video-parameters/DisplayAspectRatio :portkey.aws.elastictranscoder.-2012-09-25.video-parameters/MaxWidth :portkey.aws.elastictranscoder.-2012-09-25/PaddingPolicy] :locations {}))

(clojure.spec.alpha/def :portkey.aws.elastictranscoder.-2012-09-25.list-pipelines-request/page-token (clojure.spec.alpha/and :portkey.aws.elastictranscoder.-2012-09-25/id))
(clojure.spec.alpha/def :portkey.aws.elastictranscoder.-2012-09-25/list-pipelines-request (portkey.aws/json-keys :req-un [] :opt-un [:portkey.aws.elastictranscoder.-2012-09-25/Ascending :portkey.aws.elastictranscoder.-2012-09-25.list-pipelines-request/PageToken] :locations {}))

(clojure.spec.alpha/def :portkey.aws.elastictranscoder.-2012-09-25/playlist-format (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__13770__auto__] (clojure.core/re-matches #"(^HLSv3$)|(^HLSv4$)|(^Smooth$)|(^MPEG-DASH$)" s__13770__auto__))))

(clojure.spec.alpha/def :portkey.aws.elastictranscoder.-2012-09-25/warnings (clojure.spec.alpha/and (clojure.spec.alpha/coll-of :portkey.aws.elastictranscoder.-2012-09-25/warning) (clojure.spec.alpha/conformer clojure.core/identity (fn* [p1__13687__13688__auto__] (if (clojure.core/sequential? p1__13687__13688__auto__) p1__13687__13688__auto__ [p1__13687__13688__auto__])))))

(clojure.spec.alpha/def :portkey.aws.elastictranscoder.-2012-09-25/job-watermarks (clojure.spec.alpha/and (clojure.spec.alpha/coll-of :portkey.aws.elastictranscoder.-2012-09-25/job-watermark) (clojure.spec.alpha/conformer clojure.core/identity (fn* [p1__13687__13688__auto__] (if (clojure.core/sequential? p1__13687__13688__auto__) p1__13687__13688__auto__ [p1__13687__13688__auto__])))))

(clojure.spec.alpha/def :portkey.aws.elastictranscoder.-2012-09-25/composition (clojure.spec.alpha/and (clojure.spec.alpha/coll-of :portkey.aws.elastictranscoder.-2012-09-25/clip) (clojure.spec.alpha/conformer clojure.core/identity (fn* [p1__13687__13688__auto__] (if (clojure.core/sequential? p1__13687__13688__auto__) p1__13687__13688__auto__ [p1__13687__13688__auto__])))))

(clojure.spec.alpha/def :portkey.aws.elastictranscoder.-2012-09-25/playlists (clojure.spec.alpha/and (clojure.spec.alpha/coll-of :portkey.aws.elastictranscoder.-2012-09-25/playlist) (clojure.spec.alpha/conformer clojure.core/identity (fn* [p1__13687__13688__auto__] (if (clojure.core/sequential? p1__13687__13688__auto__) p1__13687__13688__auto__ [p1__13687__13688__auto__])))))

(clojure.spec.alpha/def :portkey.aws.elastictranscoder.-2012-09-25/play-ready-drm-format-string (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__13770__auto__] (clojure.core/re-matches #"(^microsoft$)|(^discretix-3.0$)" s__13770__auto__))))

(clojure.spec.alpha/def :portkey.aws.elastictranscoder.-2012-09-25.permission/access (clojure.spec.alpha/and :portkey.aws.elastictranscoder.-2012-09-25/access-controls))
(clojure.spec.alpha/def :portkey.aws.elastictranscoder.-2012-09-25/permission (portkey.aws/json-keys :req-un [] :opt-un [:portkey.aws.elastictranscoder.-2012-09-25/GranteeType :portkey.aws.elastictranscoder.-2012-09-25/Grantee :portkey.aws.elastictranscoder.-2012-09-25.permission/Access] :locations {}))

(clojure.spec.alpha/def :portkey.aws.elastictranscoder.-2012-09-25/key-storage-policy (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__13770__auto__] (clojure.core/re-matches #"(^NoStore$)|(^WithVariantPlaylists$)" s__13770__auto__))))

(clojure.spec.alpha/def :portkey.aws.elastictranscoder.-2012-09-25/grantee-type (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__13770__auto__] (clojure.core/re-matches #"(^Canonical$)|(^Email$)|(^Group$)" s__13770__auto__))))

(clojure.spec.alpha/def :portkey.aws.elastictranscoder.-2012-09-25.job-album-art/artwork (clojure.spec.alpha/and :portkey.aws.elastictranscoder.-2012-09-25/artworks))
(clojure.spec.alpha/def :portkey.aws.elastictranscoder.-2012-09-25/job-album-art (portkey.aws/json-keys :req-un [] :opt-un [:portkey.aws.elastictranscoder.-2012-09-25/MergePolicy :portkey.aws.elastictranscoder.-2012-09-25.job-album-art/Artwork] :locations {}))

(clojure.spec.alpha/def :portkey.aws.elastictranscoder.-2012-09-25/encryption-mode (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__13770__auto__] (clojure.core/re-matches #"(^s3$)|(^s3-aws-kms$)|(^aes-cbc-pkcs7$)|(^aes-ctr$)|(^aes-gcm$)" s__13770__auto__))))

(clojure.spec.alpha/def :portkey.aws.elastictranscoder.-2012-09-25.create-pipeline-request/input-bucket (clojure.spec.alpha/and :portkey.aws.elastictranscoder.-2012-09-25/bucket-name))
(clojure.spec.alpha/def :portkey.aws.elastictranscoder.-2012-09-25.create-pipeline-request/output-bucket (clojure.spec.alpha/and :portkey.aws.elastictranscoder.-2012-09-25/bucket-name))
(clojure.spec.alpha/def :portkey.aws.elastictranscoder.-2012-09-25.create-pipeline-request/aws-kms-key-arn (clojure.spec.alpha/and :portkey.aws.elastictranscoder.-2012-09-25/key-arn))
(clojure.spec.alpha/def :portkey.aws.elastictranscoder.-2012-09-25.create-pipeline-request/content-config (clojure.spec.alpha/and :portkey.aws.elastictranscoder.-2012-09-25/pipeline-output-config))
(clojure.spec.alpha/def :portkey.aws.elastictranscoder.-2012-09-25.create-pipeline-request/thumbnail-config (clojure.spec.alpha/and :portkey.aws.elastictranscoder.-2012-09-25/pipeline-output-config))
(clojure.spec.alpha/def :portkey.aws.elastictranscoder.-2012-09-25/create-pipeline-request (portkey.aws/json-keys :req-un [:portkey.aws.elastictranscoder.-2012-09-25/Name :portkey.aws.elastictranscoder.-2012-09-25.create-pipeline-request/InputBucket :portkey.aws.elastictranscoder.-2012-09-25/Role] :opt-un [:portkey.aws.elastictranscoder.-2012-09-25.create-pipeline-request/OutputBucket :portkey.aws.elastictranscoder.-2012-09-25.create-pipeline-request/AwsKmsKeyArn :portkey.aws.elastictranscoder.-2012-09-25/Notifications :portkey.aws.elastictranscoder.-2012-09-25.create-pipeline-request/ContentConfig :portkey.aws.elastictranscoder.-2012-09-25.create-pipeline-request/ThumbnailConfig] :locations {}))

(clojure.spec.alpha/def :portkey.aws.elastictranscoder.-2012-09-25/jpg-or-png (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__13770__auto__] (clojure.core/re-matches #"(^jpg$)|(^png$)" s__13770__auto__))))

(clojure.spec.alpha/def :portkey.aws.elastictranscoder.-2012-09-25.captions/merge-policy (clojure.spec.alpha/and :portkey.aws.elastictranscoder.-2012-09-25/caption-merge-policy))
(clojure.spec.alpha/def :portkey.aws.elastictranscoder.-2012-09-25/captions (portkey.aws/json-keys :req-un [] :opt-un [:portkey.aws.elastictranscoder.-2012-09-25.captions/MergePolicy :portkey.aws.elastictranscoder.-2012-09-25/CaptionSources :portkey.aws.elastictranscoder.-2012-09-25/CaptionFormats] :locations {}))

(clojure.spec.alpha/def :portkey.aws.elastictranscoder.-2012-09-25/keyframes-max-dist (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__13770__auto__] (clojure.core/re-matches #"^\d{1,6}$" s__13770__auto__))))

(clojure.spec.alpha/def :portkey.aws.elastictranscoder.-2012-09-25/time-offset (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__13770__auto__] (clojure.core/re-matches #"(^[+-]?\d{1,5}(\.\d{0,3})?$)|(^[+-]?([0-1]?[0-9]:|2[0-3]:)?([0-5]?[0-9]:)?[0-5]?[0-9](\.\d{0,3})?$)" s__13770__auto__))))

(clojure.spec.alpha/def :portkey.aws.elastictranscoder.-2012-09-25/audio-channels (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__13770__auto__] (clojure.core/re-matches #"(^auto$)|(^0$)|(^1$)|(^2$)" s__13770__auto__))))

(clojure.spec.alpha/def :portkey.aws.elastictranscoder.-2012-09-25/caption-formats (clojure.spec.alpha/and (clojure.spec.alpha/coll-of :portkey.aws.elastictranscoder.-2012-09-25/caption-format :max-count 4) (clojure.spec.alpha/conformer clojure.core/identity (fn* [p1__13687__13688__auto__] (if (clojure.core/sequential? p1__13687__13688__auto__) p1__13687__13688__auto__ [p1__13687__13688__auto__])))))

(clojure.spec.alpha/def :portkey.aws.elastictranscoder.-2012-09-25.job-watermark/input-key (clojure.spec.alpha/and :portkey.aws.elastictranscoder.-2012-09-25/watermark-key))
(clojure.spec.alpha/def :portkey.aws.elastictranscoder.-2012-09-25/job-watermark (portkey.aws/json-keys :req-un [] :opt-un [:portkey.aws.elastictranscoder.-2012-09-25/PresetWatermarkId :portkey.aws.elastictranscoder.-2012-09-25.job-watermark/InputKey :portkey.aws.elastictranscoder.-2012-09-25/Encryption] :locations {}))

(clojure.spec.alpha/def :portkey.aws.elastictranscoder.-2012-09-25/create-job-response (portkey.aws/json-keys :req-un [] :opt-un [:portkey.aws.elastictranscoder.-2012-09-25/Job] :locations {}))

(clojure.spec.alpha/def :portkey.aws.elastictranscoder.-2012-09-25/pixels-or-percent (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__13770__auto__] (clojure.core/re-matches #"(^\d{1,3}(\.\d{0,5})?%$)|(^\d{1,4}?px$)" s__13770__auto__))))

(clojure.spec.alpha/def :portkey.aws.elastictranscoder.-2012-09-25/caption-merge-policy (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__13770__auto__] (clojure.core/re-matches #"(^MergeOverride$)|(^MergeRetain$)|(^Override$)" s__13770__auto__))))

(clojure.spec.alpha/def :portkey.aws.elastictranscoder.-2012-09-25.pipeline/input-bucket (clojure.spec.alpha/and :portkey.aws.elastictranscoder.-2012-09-25/bucket-name))
(clojure.spec.alpha/def :portkey.aws.elastictranscoder.-2012-09-25.pipeline/aws-kms-key-arn (clojure.spec.alpha/and :portkey.aws.elastictranscoder.-2012-09-25/key-arn))
(clojure.spec.alpha/def :portkey.aws.elastictranscoder.-2012-09-25.pipeline/output-bucket (clojure.spec.alpha/and :portkey.aws.elastictranscoder.-2012-09-25/bucket-name))
(clojure.spec.alpha/def :portkey.aws.elastictranscoder.-2012-09-25.pipeline/content-config (clojure.spec.alpha/and :portkey.aws.elastictranscoder.-2012-09-25/pipeline-output-config))
(clojure.spec.alpha/def :portkey.aws.elastictranscoder.-2012-09-25.pipeline/thumbnail-config (clojure.spec.alpha/and :portkey.aws.elastictranscoder.-2012-09-25/pipeline-output-config))
(clojure.spec.alpha/def :portkey.aws.elastictranscoder.-2012-09-25.pipeline/status (clojure.spec.alpha/and :portkey.aws.elastictranscoder.-2012-09-25/pipeline-status))
(clojure.spec.alpha/def :portkey.aws.elastictranscoder.-2012-09-25.pipeline/arn (clojure.spec.alpha/and :portkey.aws.elastictranscoder.-2012-09-25/string))
(clojure.spec.alpha/def :portkey.aws.elastictranscoder.-2012-09-25/pipeline (portkey.aws/json-keys :req-un [] :opt-un [:portkey.aws.elastictranscoder.-2012-09-25.pipeline/InputBucket :portkey.aws.elastictranscoder.-2012-09-25.pipeline/AwsKmsKeyArn :portkey.aws.elastictranscoder.-2012-09-25.pipeline/OutputBucket :portkey.aws.elastictranscoder.-2012-09-25.pipeline/ContentConfig :portkey.aws.elastictranscoder.-2012-09-25.pipeline/ThumbnailConfig :portkey.aws.elastictranscoder.-2012-09-25.pipeline/Status :portkey.aws.elastictranscoder.-2012-09-25/Role :portkey.aws.elastictranscoder.-2012-09-25.pipeline/Arn :portkey.aws.elastictranscoder.-2012-09-25/Name :portkey.aws.elastictranscoder.-2012-09-25/Notifications :portkey.aws.elastictranscoder.-2012-09-25/Id] :locations {}))

(clojure.spec.alpha/def :portkey.aws.elastictranscoder.-2012-09-25/hls-content-protection-method (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__13770__auto__] (clojure.core/re-matches #"(^aes-128$)" s__13770__auto__))))

(clojure.spec.alpha/def :portkey.aws.elastictranscoder.-2012-09-25.thumbnails/format (clojure.spec.alpha/and :portkey.aws.elastictranscoder.-2012-09-25/jpg-or-png))
(clojure.spec.alpha/def :portkey.aws.elastictranscoder.-2012-09-25.thumbnails/interval (clojure.spec.alpha/and :portkey.aws.elastictranscoder.-2012-09-25/digits))
(clojure.spec.alpha/def :portkey.aws.elastictranscoder.-2012-09-25.thumbnails/resolution (clojure.spec.alpha/and :portkey.aws.elastictranscoder.-2012-09-25/thumbnail-resolution))
(clojure.spec.alpha/def :portkey.aws.elastictranscoder.-2012-09-25.thumbnails/max-width (clojure.spec.alpha/and :portkey.aws.elastictranscoder.-2012-09-25/digits-or-auto))
(clojure.spec.alpha/def :portkey.aws.elastictranscoder.-2012-09-25.thumbnails/max-height (clojure.spec.alpha/and :portkey.aws.elastictranscoder.-2012-09-25/digits-or-auto))
(clojure.spec.alpha/def :portkey.aws.elastictranscoder.-2012-09-25/thumbnails (portkey.aws/json-keys :req-un [] :opt-un [:portkey.aws.elastictranscoder.-2012-09-25.thumbnails/Format :portkey.aws.elastictranscoder.-2012-09-25.thumbnails/Interval :portkey.aws.elastictranscoder.-2012-09-25.thumbnails/Resolution :portkey.aws.elastictranscoder.-2012-09-25/AspectRatio :portkey.aws.elastictranscoder.-2012-09-25.thumbnails/MaxWidth :portkey.aws.elastictranscoder.-2012-09-25.thumbnails/MaxHeight :portkey.aws.elastictranscoder.-2012-09-25/SizingPolicy :portkey.aws.elastictranscoder.-2012-09-25/PaddingPolicy] :locations {}))

(clojure.spec.alpha/def :portkey.aws.elastictranscoder.-2012-09-25/digits (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__13770__auto__] (clojure.core/re-matches #"^\d{1,5}$" s__13770__auto__))))

(clojure.spec.alpha/def :portkey.aws.elastictranscoder.-2012-09-25/resource-in-use-exception (portkey.aws/json-keys :req-un [] :opt-un [] :locations {}))

(clojure.spec.alpha/def :portkey.aws.elastictranscoder.-2012-09-25/watermark-sizing-policy (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__13770__auto__] (clojure.core/re-matches #"(^Fit$)|(^Stretch$)|(^ShrinkToFit$)" s__13770__auto__))))

(clojure.spec.alpha/def :portkey.aws.elastictranscoder.-2012-09-25/limit-exceeded-exception (portkey.aws/json-keys :req-un [] :opt-un [] :locations {}))

(clojure.spec.alpha/def :portkey.aws.elastictranscoder.-2012-09-25/resolution (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__13770__auto__] (clojure.core/re-matches #"(^auto$)|(^\d{1,5}x\d{1,5}$)" s__13770__auto__))))

(clojure.spec.alpha/def :portkey.aws.elastictranscoder.-2012-09-25/cancel-job-request (portkey.aws/json-keys :req-un [:portkey.aws.elastictranscoder.-2012-09-25/Id] :opt-un [] :locations {}))

(clojure.spec.alpha/def :portkey.aws.elastictranscoder.-2012-09-25/artworks (clojure.spec.alpha/and (clojure.spec.alpha/coll-of :portkey.aws.elastictranscoder.-2012-09-25/artwork) (clojure.spec.alpha/conformer clojure.core/identity (fn* [p1__13687__13688__auto__] (if (clojure.core/sequential? p1__13687__13688__auto__) p1__13687__13688__auto__ [p1__13687__13688__auto__])))))

(clojure.spec.alpha/def :portkey.aws.elastictranscoder.-2012-09-25/video-bit-rate (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__13770__auto__] (clojure.core/re-matches #"(^\d{2,5}$)|(^auto$)" s__13770__auto__))))

(clojure.spec.alpha/def :portkey.aws.elastictranscoder.-2012-09-25/frame-rate (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__13770__auto__] (clojure.core/re-matches #"(^auto$)|(^10$)|(^15$)|(^23.97$)|(^24$)|(^25$)|(^29.97$)|(^30$)|(^50$)|(^60$)" s__13770__auto__))))

(clojure.spec.alpha/def :portkey.aws.elastictranscoder.-2012-09-25/opacity (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__13770__auto__] (clojure.core/re-matches #"^\d{1,3}(\.\d{0,20})?$" s__13770__auto__))))

(clojure.spec.alpha/def :portkey.aws.elastictranscoder.-2012-09-25.time-span/start-time (clojure.spec.alpha/and :portkey.aws.elastictranscoder.-2012-09-25/time))
(clojure.spec.alpha/def :portkey.aws.elastictranscoder.-2012-09-25.time-span/duration (clojure.spec.alpha/and :portkey.aws.elastictranscoder.-2012-09-25/time))
(clojure.spec.alpha/def :portkey.aws.elastictranscoder.-2012-09-25/time-span (portkey.aws/json-keys :req-un [] :opt-un [:portkey.aws.elastictranscoder.-2012-09-25.time-span/StartTime :portkey.aws.elastictranscoder.-2012-09-25.time-span/Duration] :locations {}))

(clojure.spec.alpha/def :portkey.aws.elastictranscoder.-2012-09-25/aspect-ratio (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__13770__auto__] (clojure.core/re-matches #"(^auto$)|(^1:1$)|(^4:3$)|(^3:2$)|(^16:9$)" s__13770__auto__))))

(clojure.spec.alpha/def :portkey.aws.elastictranscoder.-2012-09-25/watermark-key (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__13768__auto__] (clojure.core/<= 1 (clojure.core/count s__13768__auto__))) (clojure.core/fn [s__13769__auto__] (clojure.core/< (clojure.core/count s__13769__auto__) 1024)) (clojure.core/fn [s__13770__auto__] (clojure.core/re-matches #"(^.{1,1020}.jpg$)|(^.{1,1019}.jpeg$)|(^.{1,1020}.png$)" s__13770__auto__))))

(clojure.spec.alpha/def :portkey.aws.elastictranscoder.-2012-09-25/one-to512-string (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__13768__auto__] (clojure.core/<= 1 (clojure.core/count s__13768__auto__))) (clojure.core/fn [s__13769__auto__] (clojure.core/< (clojure.core/count s__13769__auto__) 512))))

(clojure.spec.alpha/def :portkey.aws.elastictranscoder.-2012-09-25/zero-to512-string (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__13768__auto__] (clojure.core/<= 0 (clojure.core/count s__13768__auto__))) (clojure.core/fn [s__13769__auto__] (clojure.core/< (clojure.core/count s__13769__auto__) 512))))

(clojure.spec.alpha/def :portkey.aws.elastictranscoder.-2012-09-25/thumbnail-pattern (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__13770__auto__] (clojure.core/re-matches #"(^$)|(^.*\{count\}.*$)" s__13770__auto__))))

(clojure.spec.alpha/def :portkey.aws.elastictranscoder.-2012-09-25/read-job-response (portkey.aws/json-keys :req-un [] :opt-un [:portkey.aws.elastictranscoder.-2012-09-25/Job] :locations {}))

(clojure.spec.alpha/def :portkey.aws.elastictranscoder.-2012-09-25/pipeline-status (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__13770__auto__] (clojure.core/re-matches #"(^Active$)|(^Paused$)" s__13770__auto__))))

(clojure.spec.alpha/def :portkey.aws.elastictranscoder.-2012-09-25.job-output/duration-millis (clojure.spec.alpha/and :portkey.aws.elastictranscoder.-2012-09-25/nullable-long))
(clojure.spec.alpha/def :portkey.aws.elastictranscoder.-2012-09-25.job-output/thumbnail-encryption (clojure.spec.alpha/and :portkey.aws.elastictranscoder.-2012-09-25/encryption))
(clojure.spec.alpha/def :portkey.aws.elastictranscoder.-2012-09-25.job-output/frame-rate (clojure.spec.alpha/and :portkey.aws.elastictranscoder.-2012-09-25/float-string))
(clojure.spec.alpha/def :portkey.aws.elastictranscoder.-2012-09-25.job-output/status (clojure.spec.alpha/and :portkey.aws.elastictranscoder.-2012-09-25/job-status))
(clojure.spec.alpha/def :portkey.aws.elastictranscoder.-2012-09-25.job-output/preset-id (clojure.spec.alpha/and :portkey.aws.elastictranscoder.-2012-09-25/id))
(clojure.spec.alpha/def :portkey.aws.elastictranscoder.-2012-09-25.job-output/status-detail (clojure.spec.alpha/and :portkey.aws.elastictranscoder.-2012-09-25/description))
(clojure.spec.alpha/def :portkey.aws.elastictranscoder.-2012-09-25.job-output/width (clojure.spec.alpha/and :portkey.aws.elastictranscoder.-2012-09-25/nullable-integer))
(clojure.spec.alpha/def :portkey.aws.elastictranscoder.-2012-09-25.job-output/watermarks (clojure.spec.alpha/and :portkey.aws.elastictranscoder.-2012-09-25/job-watermarks))
(clojure.spec.alpha/def :portkey.aws.elastictranscoder.-2012-09-25.job-output/applied-color-space-conversion (clojure.spec.alpha/and :portkey.aws.elastictranscoder.-2012-09-25/string))
(clojure.spec.alpha/def :portkey.aws.elastictranscoder.-2012-09-25.job-output/duration (clojure.spec.alpha/and :portkey.aws.elastictranscoder.-2012-09-25/nullable-long))
(clojure.spec.alpha/def :portkey.aws.elastictranscoder.-2012-09-25.job-output/height (clojure.spec.alpha/and :portkey.aws.elastictranscoder.-2012-09-25/nullable-integer))
(clojure.spec.alpha/def :portkey.aws.elastictranscoder.-2012-09-25.job-output/album-art (clojure.spec.alpha/and :portkey.aws.elastictranscoder.-2012-09-25/job-album-art))
(clojure.spec.alpha/def :portkey.aws.elastictranscoder.-2012-09-25.job-output/file-size (clojure.spec.alpha/and :portkey.aws.elastictranscoder.-2012-09-25/nullable-long))
(clojure.spec.alpha/def :portkey.aws.elastictranscoder.-2012-09-25.job-output/segment-duration (clojure.spec.alpha/and :portkey.aws.elastictranscoder.-2012-09-25/float-string))
(clojure.spec.alpha/def :portkey.aws.elastictranscoder.-2012-09-25.job-output/id (clojure.spec.alpha/and :portkey.aws.elastictranscoder.-2012-09-25/string))
(clojure.spec.alpha/def :portkey.aws.elastictranscoder.-2012-09-25/job-output (portkey.aws/json-keys :req-un [] :opt-un [:portkey.aws.elastictranscoder.-2012-09-25/Composition :portkey.aws.elastictranscoder.-2012-09-25/Captions :portkey.aws.elastictranscoder.-2012-09-25.job-output/DurationMillis :portkey.aws.elastictranscoder.-2012-09-25.job-output/ThumbnailEncryption :portkey.aws.elastictranscoder.-2012-09-25.job-output/FrameRate :portkey.aws.elastictranscoder.-2012-09-25.job-output/Status :portkey.aws.elastictranscoder.-2012-09-25/ThumbnailPattern :portkey.aws.elastictranscoder.-2012-09-25.job-output/PresetId :portkey.aws.elastictranscoder.-2012-09-25/Key :portkey.aws.elastictranscoder.-2012-09-25.job-output/StatusDetail :portkey.aws.elastictranscoder.-2012-09-25.job-output/Width :portkey.aws.elastictranscoder.-2012-09-25.job-output/Watermarks :portkey.aws.elastictranscoder.-2012-09-25.job-output/AppliedColorSpaceConversion :portkey.aws.elastictranscoder.-2012-09-25.job-output/Duration :portkey.aws.elastictranscoder.-2012-09-25.job-output/Height :portkey.aws.elastictranscoder.-2012-09-25/Rotate :portkey.aws.elastictranscoder.-2012-09-25.job-output/AlbumArt :portkey.aws.elastictranscoder.-2012-09-25/Encryption :portkey.aws.elastictranscoder.-2012-09-25.job-output/FileSize :portkey.aws.elastictranscoder.-2012-09-25.job-output/SegmentDuration :portkey.aws.elastictranscoder.-2012-09-25.job-output/Id] :locations {}))

(clojure.spec.alpha/def :portkey.aws.elastictranscoder.-2012-09-25/user-metadata (clojure.spec.alpha/map-of :portkey.aws.elastictranscoder.-2012-09-25/string :portkey.aws.elastictranscoder.-2012-09-25/string))

(clojure.spec.alpha/def :portkey.aws.elastictranscoder.-2012-09-25/ascending (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__13770__auto__] (clojure.core/re-matches #"(^true$)|(^false$)" s__13770__auto__))))

(clojure.spec.alpha/def :portkey.aws.elastictranscoder.-2012-09-25.detected-properties/width (clojure.spec.alpha/and :portkey.aws.elastictranscoder.-2012-09-25/nullable-integer))
(clojure.spec.alpha/def :portkey.aws.elastictranscoder.-2012-09-25.detected-properties/height (clojure.spec.alpha/and :portkey.aws.elastictranscoder.-2012-09-25/nullable-integer))
(clojure.spec.alpha/def :portkey.aws.elastictranscoder.-2012-09-25.detected-properties/frame-rate (clojure.spec.alpha/and :portkey.aws.elastictranscoder.-2012-09-25/float-string))
(clojure.spec.alpha/def :portkey.aws.elastictranscoder.-2012-09-25.detected-properties/file-size (clojure.spec.alpha/and :portkey.aws.elastictranscoder.-2012-09-25/nullable-long))
(clojure.spec.alpha/def :portkey.aws.elastictranscoder.-2012-09-25.detected-properties/duration-millis (clojure.spec.alpha/and :portkey.aws.elastictranscoder.-2012-09-25/nullable-long))
(clojure.spec.alpha/def :portkey.aws.elastictranscoder.-2012-09-25/detected-properties (portkey.aws/json-keys :req-un [] :opt-un [:portkey.aws.elastictranscoder.-2012-09-25.detected-properties/Width :portkey.aws.elastictranscoder.-2012-09-25.detected-properties/Height :portkey.aws.elastictranscoder.-2012-09-25.detected-properties/FrameRate :portkey.aws.elastictranscoder.-2012-09-25.detected-properties/FileSize :portkey.aws.elastictranscoder.-2012-09-25.detected-properties/DurationMillis] :locations {}))

(clojure.spec.alpha/def :portkey.aws.elastictranscoder.-2012-09-25/incompatible-version-exception (portkey.aws/json-keys :req-un [] :opt-un [] :locations {}))

(clojure.spec.alpha/def :portkey.aws.elastictranscoder.-2012-09-25.pipeline-output-config/bucket (clojure.spec.alpha/and :portkey.aws.elastictranscoder.-2012-09-25/bucket-name))
(clojure.spec.alpha/def :portkey.aws.elastictranscoder.-2012-09-25/pipeline-output-config (portkey.aws/json-keys :req-un [] :opt-un [:portkey.aws.elastictranscoder.-2012-09-25.pipeline-output-config/Bucket :portkey.aws.elastictranscoder.-2012-09-25/StorageClass :portkey.aws.elastictranscoder.-2012-09-25/Permissions] :locations {}))

(clojure.spec.alpha/def :portkey.aws.elastictranscoder.-2012-09-25/key (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__13768__auto__] (clojure.core/<= 1 (clojure.core/count s__13768__auto__))) (clojure.core/fn [s__13769__auto__] (clojure.core/< (clojure.core/count s__13769__auto__) 255))))

(clojure.spec.alpha/def :portkey.aws.elastictranscoder.-2012-09-25.test-role-response/messages (clojure.spec.alpha/and :portkey.aws.elastictranscoder.-2012-09-25/exception-messages))
(clojure.spec.alpha/def :portkey.aws.elastictranscoder.-2012-09-25/test-role-response (portkey.aws/json-keys :req-un [] :opt-un [:portkey.aws.elastictranscoder.-2012-09-25/Success :portkey.aws.elastictranscoder.-2012-09-25.test-role-response/Messages] :locations {}))

(clojure.spec.alpha/def :portkey.aws.elastictranscoder.-2012-09-25/sns-topics (clojure.spec.alpha/and (clojure.spec.alpha/coll-of :portkey.aws.elastictranscoder.-2012-09-25/sns-topic :max-count 30) (clojure.spec.alpha/conformer clojure.core/identity (fn* [p1__13687__13688__auto__] (if (clojure.core/sequential? p1__13687__13688__auto__) p1__13687__13688__auto__ [p1__13687__13688__auto__])))))

(clojure.spec.alpha/def :portkey.aws.elastictranscoder.-2012-09-25/delete-pipeline-response (portkey.aws/json-keys :req-un [] :opt-un [] :locations {}))

(clojure.spec.alpha/def :portkey.aws.elastictranscoder.-2012-09-25/role (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__13770__auto__] (clojure.core/re-matches #"^arn:aws:iam::\w{12}:role/.+$" s__13770__auto__))))

(clojure.spec.alpha/def :portkey.aws.elastictranscoder.-2012-09-25/interlaced (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__13770__auto__] (clojure.core/re-matches #"(^auto$)|(^true$)|(^false$)" s__13770__auto__))))

(clojure.spec.alpha/def :portkey.aws.elastictranscoder.-2012-09-25/max-frame-rate (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__13770__auto__] (clojure.core/re-matches #"(^10$)|(^15$)|(^23.97$)|(^24$)|(^25$)|(^29.97$)|(^30$)|(^50$)|(^60$)" s__13770__auto__))))

(clojure.spec.alpha/def :portkey.aws.elastictranscoder.-2012-09-25.playlist/name (clojure.spec.alpha/and :portkey.aws.elastictranscoder.-2012-09-25/filename))
(clojure.spec.alpha/def :portkey.aws.elastictranscoder.-2012-09-25.playlist/format (clojure.spec.alpha/and :portkey.aws.elastictranscoder.-2012-09-25/playlist-format))
(clojure.spec.alpha/def :portkey.aws.elastictranscoder.-2012-09-25.playlist/status (clojure.spec.alpha/and :portkey.aws.elastictranscoder.-2012-09-25/job-status))
(clojure.spec.alpha/def :portkey.aws.elastictranscoder.-2012-09-25.playlist/status-detail (clojure.spec.alpha/and :portkey.aws.elastictranscoder.-2012-09-25/description))
(clojure.spec.alpha/def :portkey.aws.elastictranscoder.-2012-09-25/playlist (portkey.aws/json-keys :req-un [] :opt-un [:portkey.aws.elastictranscoder.-2012-09-25.playlist/Name :portkey.aws.elastictranscoder.-2012-09-25.playlist/Format :portkey.aws.elastictranscoder.-2012-09-25/OutputKeys :portkey.aws.elastictranscoder.-2012-09-25/HlsContentProtection :portkey.aws.elastictranscoder.-2012-09-25/PlayReadyDrm :portkey.aws.elastictranscoder.-2012-09-25.playlist/Status :portkey.aws.elastictranscoder.-2012-09-25.playlist/StatusDetail] :locations {}))

(clojure.spec.alpha/def :portkey.aws.elastictranscoder.-2012-09-25/delete-pipeline-request (portkey.aws/json-keys :req-un [:portkey.aws.elastictranscoder.-2012-09-25/Id] :opt-un [] :locations {}))

(clojure.spec.alpha/def :portkey.aws.elastictranscoder.-2012-09-25/success (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__13770__auto__] (clojure.core/re-matches #"(^true$)|(^false$)" s__13770__auto__))))

(clojure.spec.alpha/def :portkey.aws.elastictranscoder.-2012-09-25.list-jobs-by-status-request/status (clojure.spec.alpha/and :portkey.aws.elastictranscoder.-2012-09-25/job-status))
(clojure.spec.alpha/def :portkey.aws.elastictranscoder.-2012-09-25.list-jobs-by-status-request/page-token (clojure.spec.alpha/and :portkey.aws.elastictranscoder.-2012-09-25/id))
(clojure.spec.alpha/def :portkey.aws.elastictranscoder.-2012-09-25/list-jobs-by-status-request (portkey.aws/json-keys :req-un [:portkey.aws.elastictranscoder.-2012-09-25.list-jobs-by-status-request/Status] :opt-un [:portkey.aws.elastictranscoder.-2012-09-25/Ascending :portkey.aws.elastictranscoder.-2012-09-25.list-jobs-by-status-request/PageToken] :locations {}))

(clojure.spec.alpha/def :portkey.aws.elastictranscoder.-2012-09-25.warning/code (clojure.spec.alpha/and :portkey.aws.elastictranscoder.-2012-09-25/string))
(clojure.spec.alpha/def :portkey.aws.elastictranscoder.-2012-09-25.warning/message (clojure.spec.alpha/and :portkey.aws.elastictranscoder.-2012-09-25/string))
(clojure.spec.alpha/def :portkey.aws.elastictranscoder.-2012-09-25/warning (portkey.aws/json-keys :req-un [] :opt-un [:portkey.aws.elastictranscoder.-2012-09-25.warning/Code :portkey.aws.elastictranscoder.-2012-09-25.warning/Message] :locations {}))

(clojure.spec.alpha/def :portkey.aws.elastictranscoder.-2012-09-25.create-job-request/pipeline-id (clojure.spec.alpha/and :portkey.aws.elastictranscoder.-2012-09-25/id))
(clojure.spec.alpha/def :portkey.aws.elastictranscoder.-2012-09-25.create-job-request/input (clojure.spec.alpha/and :portkey.aws.elastictranscoder.-2012-09-25/job-input))
(clojure.spec.alpha/def :portkey.aws.elastictranscoder.-2012-09-25.create-job-request/inputs (clojure.spec.alpha/and :portkey.aws.elastictranscoder.-2012-09-25/job-inputs))
(clojure.spec.alpha/def :portkey.aws.elastictranscoder.-2012-09-25.create-job-request/output (clojure.spec.alpha/and :portkey.aws.elastictranscoder.-2012-09-25/create-job-output))
(clojure.spec.alpha/def :portkey.aws.elastictranscoder.-2012-09-25.create-job-request/outputs (clojure.spec.alpha/and :portkey.aws.elastictranscoder.-2012-09-25/create-job-outputs))
(clojure.spec.alpha/def :portkey.aws.elastictranscoder.-2012-09-25.create-job-request/output-key-prefix (clojure.spec.alpha/and :portkey.aws.elastictranscoder.-2012-09-25/key))
(clojure.spec.alpha/def :portkey.aws.elastictranscoder.-2012-09-25.create-job-request/playlists (clojure.spec.alpha/and :portkey.aws.elastictranscoder.-2012-09-25/create-job-playlists))
(clojure.spec.alpha/def :portkey.aws.elastictranscoder.-2012-09-25/create-job-request (portkey.aws/json-keys :req-un [:portkey.aws.elastictranscoder.-2012-09-25.create-job-request/PipelineId] :opt-un [:portkey.aws.elastictranscoder.-2012-09-25.create-job-request/Input :portkey.aws.elastictranscoder.-2012-09-25.create-job-request/Inputs :portkey.aws.elastictranscoder.-2012-09-25.create-job-request/Output :portkey.aws.elastictranscoder.-2012-09-25.create-job-request/Outputs :portkey.aws.elastictranscoder.-2012-09-25.create-job-request/OutputKeyPrefix :portkey.aws.elastictranscoder.-2012-09-25.create-job-request/Playlists :portkey.aws.elastictranscoder.-2012-09-25/UserMetadata] :locations {}))

(clojure.spec.alpha/def :portkey.aws.elastictranscoder.-2012-09-25.audio-codec-options/profile (clojure.spec.alpha/and :portkey.aws.elastictranscoder.-2012-09-25/audio-codec-profile))
(clojure.spec.alpha/def :portkey.aws.elastictranscoder.-2012-09-25.audio-codec-options/bit-depth (clojure.spec.alpha/and :portkey.aws.elastictranscoder.-2012-09-25/audio-bit-depth))
(clojure.spec.alpha/def :portkey.aws.elastictranscoder.-2012-09-25.audio-codec-options/bit-order (clojure.spec.alpha/and :portkey.aws.elastictranscoder.-2012-09-25/audio-bit-order))
(clojure.spec.alpha/def :portkey.aws.elastictranscoder.-2012-09-25.audio-codec-options/signed (clojure.spec.alpha/and :portkey.aws.elastictranscoder.-2012-09-25/audio-signed))
(clojure.spec.alpha/def :portkey.aws.elastictranscoder.-2012-09-25/audio-codec-options (portkey.aws/json-keys :req-un [] :opt-un [:portkey.aws.elastictranscoder.-2012-09-25.audio-codec-options/Profile :portkey.aws.elastictranscoder.-2012-09-25.audio-codec-options/BitDepth :portkey.aws.elastictranscoder.-2012-09-25.audio-codec-options/BitOrder :portkey.aws.elastictranscoder.-2012-09-25.audio-codec-options/Signed] :locations {}))

(clojure.spec.alpha/def :portkey.aws.elastictranscoder.-2012-09-25/resource-not-found-exception (portkey.aws/json-keys :req-un [] :opt-un [] :locations {}))

(clojure.spec.alpha/def :portkey.aws.elastictranscoder.-2012-09-25/float-string (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__13770__auto__] (clojure.core/re-matches #"^\d{1,5}(\.\d{0,5})?$" s__13770__auto__))))

(clojure.spec.alpha/def :portkey.aws.elastictranscoder.-2012-09-25.timing/submit-time-millis (clojure.spec.alpha/and :portkey.aws.elastictranscoder.-2012-09-25/nullable-long))
(clojure.spec.alpha/def :portkey.aws.elastictranscoder.-2012-09-25.timing/start-time-millis (clojure.spec.alpha/and :portkey.aws.elastictranscoder.-2012-09-25/nullable-long))
(clojure.spec.alpha/def :portkey.aws.elastictranscoder.-2012-09-25.timing/finish-time-millis (clojure.spec.alpha/and :portkey.aws.elastictranscoder.-2012-09-25/nullable-long))
(clojure.spec.alpha/def :portkey.aws.elastictranscoder.-2012-09-25/timing (portkey.aws/json-keys :req-un [] :opt-un [:portkey.aws.elastictranscoder.-2012-09-25.timing/SubmitTimeMillis :portkey.aws.elastictranscoder.-2012-09-25.timing/StartTimeMillis :portkey.aws.elastictranscoder.-2012-09-25.timing/FinishTimeMillis] :locations {}))

(clojure.spec.alpha/def :portkey.aws.elastictranscoder.-2012-09-25/nullable-long clojure.core/int?)

(clojure.spec.alpha/def :portkey.aws.elastictranscoder.-2012-09-25/read-preset-response (portkey.aws/json-keys :req-un [] :opt-un [:portkey.aws.elastictranscoder.-2012-09-25/Preset] :locations {}))

(clojure.spec.alpha/def :portkey.aws.elastictranscoder.-2012-09-25/audio-sample-rate (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__13770__auto__] (clojure.core/re-matches #"(^auto$)|(^22050$)|(^32000$)|(^44100$)|(^48000$)|(^96000$)|(^192000$)" s__13770__auto__))))

(clojure.spec.alpha/def :portkey.aws.elastictranscoder.-2012-09-25.list-presets-request/page-token (clojure.spec.alpha/and :portkey.aws.elastictranscoder.-2012-09-25/id))
(clojure.spec.alpha/def :portkey.aws.elastictranscoder.-2012-09-25/list-presets-request (portkey.aws/json-keys :req-un [] :opt-un [:portkey.aws.elastictranscoder.-2012-09-25/Ascending :portkey.aws.elastictranscoder.-2012-09-25.list-presets-request/PageToken] :locations {}))

(clojure.spec.alpha/def :portkey.aws.elastictranscoder.-2012-09-25/audio-bit-depth (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__13770__auto__] (clojure.core/re-matches #"(^8$)|(^16$)|(^24$)|(^32$)" s__13770__auto__))))

(clojure.spec.alpha/def :portkey.aws.elastictranscoder.-2012-09-25/description (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__13768__auto__] (clojure.core/<= 0 (clojure.core/count s__13768__auto__))) (clojure.core/fn [s__13769__auto__] (clojure.core/< (clojure.core/count s__13769__auto__) 255))))

(clojure.spec.alpha/def :portkey.aws.elastictranscoder.-2012-09-25.create-preset-response/warning (clojure.spec.alpha/and :portkey.aws.elastictranscoder.-2012-09-25/string))
(clojure.spec.alpha/def :portkey.aws.elastictranscoder.-2012-09-25/create-preset-response (portkey.aws/json-keys :req-un [] :opt-un [:portkey.aws.elastictranscoder.-2012-09-25/Preset :portkey.aws.elastictranscoder.-2012-09-25.create-preset-response/Warning] :locations {}))

(clojure.spec.alpha/def :portkey.aws.elastictranscoder.-2012-09-25/audio-packing-mode (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__13770__auto__] (clojure.core/re-matches #"(^SingleTrack$)|(^OneChannelPerTrack$)|(^OneChannelPerTrackWithMosTo8Tracks$)" s__13770__auto__))))

(clojure.spec.alpha/def :portkey.aws.elastictranscoder.-2012-09-25/read-job-request (portkey.aws/json-keys :req-un [:portkey.aws.elastictranscoder.-2012-09-25/Id] :opt-un [] :locations {}))

(clojure.spec.alpha/def :portkey.aws.elastictranscoder.-2012-09-25/audio-bit-order (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__13770__auto__] (clojure.core/re-matches #"(^LittleEndian$)" s__13770__auto__))))

(clojure.spec.alpha/def :portkey.aws.elastictranscoder.-2012-09-25/preset-type (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__13770__auto__] (clojure.core/re-matches #"(^System$)|(^Custom$)" s__13770__auto__))))

(clojure.spec.alpha/def :portkey.aws.elastictranscoder.-2012-09-25.hls-content-protection/method (clojure.spec.alpha/and :portkey.aws.elastictranscoder.-2012-09-25/hls-content-protection-method))
(clojure.spec.alpha/def :portkey.aws.elastictranscoder.-2012-09-25.hls-content-protection/key (clojure.spec.alpha/and :portkey.aws.elastictranscoder.-2012-09-25/base64-encoded-string))
(clojure.spec.alpha/def :portkey.aws.elastictranscoder.-2012-09-25.hls-content-protection/key-md5 (clojure.spec.alpha/and :portkey.aws.elastictranscoder.-2012-09-25/base64-encoded-string))
(clojure.spec.alpha/def :portkey.aws.elastictranscoder.-2012-09-25.hls-content-protection/initialization-vector (clojure.spec.alpha/and :portkey.aws.elastictranscoder.-2012-09-25/zero-to255-string))
(clojure.spec.alpha/def :portkey.aws.elastictranscoder.-2012-09-25.hls-content-protection/license-acquisition-url (clojure.spec.alpha/and :portkey.aws.elastictranscoder.-2012-09-25/zero-to512-string))
(clojure.spec.alpha/def :portkey.aws.elastictranscoder.-2012-09-25/hls-content-protection (portkey.aws/json-keys :req-un [] :opt-un [:portkey.aws.elastictranscoder.-2012-09-25.hls-content-protection/Method :portkey.aws.elastictranscoder.-2012-09-25.hls-content-protection/Key :portkey.aws.elastictranscoder.-2012-09-25.hls-content-protection/KeyMd5 :portkey.aws.elastictranscoder.-2012-09-25.hls-content-protection/InitializationVector :portkey.aws.elastictranscoder.-2012-09-25.hls-content-protection/LicenseAcquisitionUrl :portkey.aws.elastictranscoder.-2012-09-25/KeyStoragePolicy] :locations {}))

(clojure.spec.alpha/def :portkey.aws.elastictranscoder.-2012-09-25/access-denied-exception (portkey.aws/json-keys :req-un [] :opt-un [] :locations {}))

(clojure.spec.alpha/def :portkey.aws.elastictranscoder.-2012-09-25/string (clojure.spec.alpha/and clojure.core/string?))

(clojure.spec.alpha/def :portkey.aws.elastictranscoder.-2012-09-25.caption-source/key (clojure.spec.alpha/and :portkey.aws.elastictranscoder.-2012-09-25/long-key))
(clojure.spec.alpha/def :portkey.aws.elastictranscoder.-2012-09-25.caption-source/language (clojure.spec.alpha/and :portkey.aws.elastictranscoder.-2012-09-25/key))
(clojure.spec.alpha/def :portkey.aws.elastictranscoder.-2012-09-25.caption-source/label (clojure.spec.alpha/and :portkey.aws.elastictranscoder.-2012-09-25/name))
(clojure.spec.alpha/def :portkey.aws.elastictranscoder.-2012-09-25/caption-source (portkey.aws/json-keys :req-un [] :opt-un [:portkey.aws.elastictranscoder.-2012-09-25.caption-source/Key :portkey.aws.elastictranscoder.-2012-09-25.caption-source/Language :portkey.aws.elastictranscoder.-2012-09-25/TimeOffset :portkey.aws.elastictranscoder.-2012-09-25.caption-source/Label :portkey.aws.elastictranscoder.-2012-09-25/Encryption] :locations {}))

(clojure.spec.alpha/def :portkey.aws.elastictranscoder.-2012-09-25.list-jobs-by-pipeline-response/next-page-token (clojure.spec.alpha/and :portkey.aws.elastictranscoder.-2012-09-25/id))
(clojure.spec.alpha/def :portkey.aws.elastictranscoder.-2012-09-25/list-jobs-by-pipeline-response (portkey.aws/json-keys :req-un [] :opt-un [:portkey.aws.elastictranscoder.-2012-09-25/Jobs :portkey.aws.elastictranscoder.-2012-09-25.list-jobs-by-pipeline-response/NextPageToken] :locations {}))

(clojure.spec.alpha/def :portkey.aws.elastictranscoder.-2012-09-25/digits-or-auto (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__13770__auto__] (clojure.core/re-matches #"(^auto$)|(^\d{2,4}$)" s__13770__auto__))))

(clojure.spec.alpha/def :portkey.aws.elastictranscoder.-2012-09-25.input-captions/merge-policy (clojure.spec.alpha/and :portkey.aws.elastictranscoder.-2012-09-25/caption-merge-policy))
(clojure.spec.alpha/def :portkey.aws.elastictranscoder.-2012-09-25/input-captions (portkey.aws/json-keys :req-un [] :opt-un [:portkey.aws.elastictranscoder.-2012-09-25.input-captions/MergePolicy :portkey.aws.elastictranscoder.-2012-09-25/CaptionSources] :locations {}))

(clojure.spec.alpha/def :portkey.aws.elastictranscoder.-2012-09-25/read-preset-request (portkey.aws/json-keys :req-un [:portkey.aws.elastictranscoder.-2012-09-25/Id] :opt-un [] :locations {}))

(clojure.spec.alpha/def :portkey.aws.elastictranscoder.-2012-09-25.audio-parameters/codec (clojure.spec.alpha/and :portkey.aws.elastictranscoder.-2012-09-25/audio-codec))
(clojure.spec.alpha/def :portkey.aws.elastictranscoder.-2012-09-25.audio-parameters/sample-rate (clojure.spec.alpha/and :portkey.aws.elastictranscoder.-2012-09-25/audio-sample-rate))
(clojure.spec.alpha/def :portkey.aws.elastictranscoder.-2012-09-25.audio-parameters/bit-rate (clojure.spec.alpha/and :portkey.aws.elastictranscoder.-2012-09-25/audio-bit-rate))
(clojure.spec.alpha/def :portkey.aws.elastictranscoder.-2012-09-25.audio-parameters/channels (clojure.spec.alpha/and :portkey.aws.elastictranscoder.-2012-09-25/audio-channels))
(clojure.spec.alpha/def :portkey.aws.elastictranscoder.-2012-09-25.audio-parameters/codec-options (clojure.spec.alpha/and :portkey.aws.elastictranscoder.-2012-09-25/audio-codec-options))
(clojure.spec.alpha/def :portkey.aws.elastictranscoder.-2012-09-25/audio-parameters (portkey.aws/json-keys :req-un [] :opt-un [:portkey.aws.elastictranscoder.-2012-09-25.audio-parameters/Codec :portkey.aws.elastictranscoder.-2012-09-25.audio-parameters/SampleRate :portkey.aws.elastictranscoder.-2012-09-25.audio-parameters/BitRate :portkey.aws.elastictranscoder.-2012-09-25.audio-parameters/Channels :portkey.aws.elastictranscoder.-2012-09-25/AudioPackingMode :portkey.aws.elastictranscoder.-2012-09-25.audio-parameters/CodecOptions] :locations {}))

(clojure.spec.alpha/def :portkey.aws.elastictranscoder.-2012-09-25/access-control (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__13770__auto__] (clojure.core/re-matches #"(^FullControl$)|(^Read$)|(^ReadAcp$)|(^WriteAcp$)" s__13770__auto__))))

(clojure.spec.alpha/def :portkey.aws.elastictranscoder.-2012-09-25.list-jobs-by-status-response/next-page-token (clojure.spec.alpha/and :portkey.aws.elastictranscoder.-2012-09-25/id))
(clojure.spec.alpha/def :portkey.aws.elastictranscoder.-2012-09-25/list-jobs-by-status-response (portkey.aws/json-keys :req-un [] :opt-un [:portkey.aws.elastictranscoder.-2012-09-25/Jobs :portkey.aws.elastictranscoder.-2012-09-25.list-jobs-by-status-response/NextPageToken] :locations {}))

(clojure.spec.alpha/def :portkey.aws.elastictranscoder.-2012-09-25/update-pipeline-notifications-request (portkey.aws/json-keys :req-un [:portkey.aws.elastictranscoder.-2012-09-25/Id :portkey.aws.elastictranscoder.-2012-09-25/Notifications] :opt-un [] :locations {}))

(clojure.spec.alpha/def :portkey.aws.elastictranscoder.-2012-09-25/audio-codec-profile (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__13770__auto__] (clojure.core/re-matches #"(^auto$)|(^AAC-LC$)|(^HE-AAC$)|(^HE-AACv2$)" s__13770__auto__))))

(clojure.spec.alpha/def :portkey.aws.elastictranscoder.-2012-09-25/video-codec (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__13770__auto__] (clojure.core/re-matches #"(^H\.264$)|(^vp8$)|(^vp9$)|(^mpeg2$)|(^gif$)" s__13770__auto__))))

(clojure.spec.alpha/def :portkey.aws.elastictranscoder.-2012-09-25/vertical-align (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__13770__auto__] (clojure.core/re-matches #"(^Top$)|(^Bottom$)|(^Center$)" s__13770__auto__))))

(clojure.spec.alpha/def :portkey.aws.elastictranscoder.-2012-09-25/rotate (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__13770__auto__] (clojure.core/re-matches #"(^auto$)|(^0$)|(^90$)|(^180$)|(^270$)" s__13770__auto__))))

(clojure.spec.alpha/def :portkey.aws.elastictranscoder.-2012-09-25/audio-codec (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__13770__auto__] (clojure.core/re-matches #"(^AAC$)|(^vorbis$)|(^mp3$)|(^mp2$)|(^pcm$)|(^flac$)" s__13770__auto__))))

(clojure.spec.alpha/def :portkey.aws.elastictranscoder.-2012-09-25/pipelines (clojure.spec.alpha/and (clojure.spec.alpha/coll-of :portkey.aws.elastictranscoder.-2012-09-25/pipeline) (clojure.spec.alpha/conformer clojure.core/identity (fn* [p1__13687__13688__auto__] (if (clojure.core/sequential? p1__13687__13688__auto__) p1__13687__13688__auto__ [p1__13687__13688__auto__])))))

(clojure.spec.alpha/def :portkey.aws.elastictranscoder.-2012-09-25/audio-signed (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__13770__auto__] (clojure.core/re-matches #"(^Unsigned$)|(^Signed$)" s__13770__auto__))))

(clojure.spec.alpha/def :portkey.aws.elastictranscoder.-2012-09-25/jobs (clojure.spec.alpha/and (clojure.spec.alpha/coll-of :portkey.aws.elastictranscoder.-2012-09-25/job) (clojure.spec.alpha/conformer clojure.core/identity (fn* [p1__13687__13688__auto__] (if (clojure.core/sequential? p1__13687__13688__auto__) p1__13687__13688__auto__ [p1__13687__13688__auto__])))))

(clojure.spec.alpha/def :portkey.aws.elastictranscoder.-2012-09-25.preset/type (clojure.spec.alpha/and :portkey.aws.elastictranscoder.-2012-09-25/preset-type))
(clojure.spec.alpha/def :portkey.aws.elastictranscoder.-2012-09-25.preset/video (clojure.spec.alpha/and :portkey.aws.elastictranscoder.-2012-09-25/video-parameters))
(clojure.spec.alpha/def :portkey.aws.elastictranscoder.-2012-09-25.preset/audio (clojure.spec.alpha/and :portkey.aws.elastictranscoder.-2012-09-25/audio-parameters))
(clojure.spec.alpha/def :portkey.aws.elastictranscoder.-2012-09-25.preset/container (clojure.spec.alpha/and :portkey.aws.elastictranscoder.-2012-09-25/preset-container))
(clojure.spec.alpha/def :portkey.aws.elastictranscoder.-2012-09-25.preset/arn (clojure.spec.alpha/and :portkey.aws.elastictranscoder.-2012-09-25/string))
(clojure.spec.alpha/def :portkey.aws.elastictranscoder.-2012-09-25/preset (portkey.aws/json-keys :req-un [] :opt-un [:portkey.aws.elastictranscoder.-2012-09-25.preset/Type :portkey.aws.elastictranscoder.-2012-09-25.preset/Video :portkey.aws.elastictranscoder.-2012-09-25.preset/Audio :portkey.aws.elastictranscoder.-2012-09-25/Thumbnails :portkey.aws.elastictranscoder.-2012-09-25.preset/Container :portkey.aws.elastictranscoder.-2012-09-25/Description :portkey.aws.elastictranscoder.-2012-09-25.preset/Arn :portkey.aws.elastictranscoder.-2012-09-25/Name :portkey.aws.elastictranscoder.-2012-09-25/Id] :locations {}))

(clojure.spec.alpha/def :portkey.aws.elastictranscoder.-2012-09-25.update-pipeline-request/input-bucket (clojure.spec.alpha/and :portkey.aws.elastictranscoder.-2012-09-25/bucket-name))
(clojure.spec.alpha/def :portkey.aws.elastictranscoder.-2012-09-25.update-pipeline-request/aws-kms-key-arn (clojure.spec.alpha/and :portkey.aws.elastictranscoder.-2012-09-25/key-arn))
(clojure.spec.alpha/def :portkey.aws.elastictranscoder.-2012-09-25.update-pipeline-request/content-config (clojure.spec.alpha/and :portkey.aws.elastictranscoder.-2012-09-25/pipeline-output-config))
(clojure.spec.alpha/def :portkey.aws.elastictranscoder.-2012-09-25.update-pipeline-request/thumbnail-config (clojure.spec.alpha/and :portkey.aws.elastictranscoder.-2012-09-25/pipeline-output-config))
(clojure.spec.alpha/def :portkey.aws.elastictranscoder.-2012-09-25/update-pipeline-request (portkey.aws/json-keys :req-un [:portkey.aws.elastictranscoder.-2012-09-25/Id] :opt-un [:portkey.aws.elastictranscoder.-2012-09-25/Name :portkey.aws.elastictranscoder.-2012-09-25.update-pipeline-request/InputBucket :portkey.aws.elastictranscoder.-2012-09-25/Role :portkey.aws.elastictranscoder.-2012-09-25.update-pipeline-request/AwsKmsKeyArn :portkey.aws.elastictranscoder.-2012-09-25/Notifications :portkey.aws.elastictranscoder.-2012-09-25.update-pipeline-request/ContentConfig :portkey.aws.elastictranscoder.-2012-09-25.update-pipeline-request/ThumbnailConfig] :locations {}))

(clojure.spec.alpha/def :portkey.aws.elastictranscoder.-2012-09-25/filename (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__13768__auto__] (clojure.core/<= 1 (clojure.core/count s__13768__auto__))) (clojure.core/fn [s__13769__auto__] (clojure.core/< (clojure.core/count s__13769__auto__) 255))))

(clojure.spec.alpha/def :portkey.aws.elastictranscoder.-2012-09-25/update-pipeline-response (portkey.aws/json-keys :req-un [] :opt-un [:portkey.aws.elastictranscoder.-2012-09-25/Pipeline :portkey.aws.elastictranscoder.-2012-09-25/Warnings] :locations {}))

(clojure.spec.alpha/def :portkey.aws.elastictranscoder.-2012-09-25/preset-watermarks (clojure.spec.alpha/and (clojure.spec.alpha/coll-of :portkey.aws.elastictranscoder.-2012-09-25/preset-watermark) (clojure.spec.alpha/conformer clojure.core/identity (fn* [p1__13687__13688__auto__] (if (clojure.core/sequential? p1__13687__13688__auto__) p1__13687__13688__auto__ [p1__13687__13688__auto__])))))

(clojure.spec.alpha/def :portkey.aws.elastictranscoder.-2012-09-25/key-arn (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__13768__auto__] (clojure.core/<= 0 (clojure.core/count s__13768__auto__))) (clojure.core/fn [s__13769__auto__] (clojure.core/< (clojure.core/count s__13769__auto__) 255))))

(clojure.spec.alpha/def :portkey.aws.elastictranscoder.-2012-09-25/clip (portkey.aws/json-keys :req-un [] :opt-un [:portkey.aws.elastictranscoder.-2012-09-25/TimeSpan] :locations {}))

(clojure.spec.alpha/def :portkey.aws.elastictranscoder.-2012-09-25/merge-policy (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__13770__auto__] (clojure.core/re-matches #"(^Replace$)|(^Prepend$)|(^Append$)|(^Fallback$)" s__13770__auto__))))

(clojure.spec.alpha/def :portkey.aws.elastictranscoder.-2012-09-25.encryption/mode (clojure.spec.alpha/and :portkey.aws.elastictranscoder.-2012-09-25/encryption-mode))
(clojure.spec.alpha/def :portkey.aws.elastictranscoder.-2012-09-25.encryption/key (clojure.spec.alpha/and :portkey.aws.elastictranscoder.-2012-09-25/base64-encoded-string))
(clojure.spec.alpha/def :portkey.aws.elastictranscoder.-2012-09-25.encryption/key-md5 (clojure.spec.alpha/and :portkey.aws.elastictranscoder.-2012-09-25/base64-encoded-string))
(clojure.spec.alpha/def :portkey.aws.elastictranscoder.-2012-09-25.encryption/initialization-vector (clojure.spec.alpha/and :portkey.aws.elastictranscoder.-2012-09-25/zero-to255-string))
(clojure.spec.alpha/def :portkey.aws.elastictranscoder.-2012-09-25/encryption (portkey.aws/json-keys :req-un [] :opt-un [:portkey.aws.elastictranscoder.-2012-09-25.encryption/Mode :portkey.aws.elastictranscoder.-2012-09-25.encryption/Key :portkey.aws.elastictranscoder.-2012-09-25.encryption/KeyMd5 :portkey.aws.elastictranscoder.-2012-09-25.encryption/InitializationVector] :locations {}))

(clojure.spec.alpha/def :portkey.aws.elastictranscoder.-2012-09-25.list-pipelines-response/next-page-token (clojure.spec.alpha/and :portkey.aws.elastictranscoder.-2012-09-25/id))
(clojure.spec.alpha/def :portkey.aws.elastictranscoder.-2012-09-25/list-pipelines-response (portkey.aws/json-keys :req-un [] :opt-un [:portkey.aws.elastictranscoder.-2012-09-25/Pipelines :portkey.aws.elastictranscoder.-2012-09-25.list-pipelines-response/NextPageToken] :locations {}))

(clojure.spec.alpha/def :portkey.aws.elastictranscoder.-2012-09-25/job-container (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__13770__auto__] (clojure.core/re-matches #"(^auto$)|(^3gp$)|(^asf$)|(^avi$)|(^divx$)|(^flv$)|(^mkv$)|(^mov$)|(^mp4$)|(^mpeg$)|(^mpeg-ps$)|(^mpeg-ts$)|(^mxf$)|(^ogg$)|(^ts$)|(^vob$)|(^wav$)|(^webm$)|(^mp3$)|(^m4a$)|(^aac$)" s__13770__auto__))))

(clojure.spec.alpha/def :portkey.aws.elastictranscoder.-2012-09-25/preset-container (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__13770__auto__] (clojure.core/re-matches #"(^mp4$)|(^ts$)|(^webm$)|(^mp3$)|(^flac$)|(^oga$)|(^ogg$)|(^fmp4$)|(^mpg$)|(^flv$)|(^gif$)|(^mxf$)|(^wav$)" s__13770__auto__))))

(clojure.spec.alpha/def :portkey.aws.elastictranscoder.-2012-09-25.job-input/key (clojure.spec.alpha/and :portkey.aws.elastictranscoder.-2012-09-25/long-key))
(clojure.spec.alpha/def :portkey.aws.elastictranscoder.-2012-09-25.job-input/container (clojure.spec.alpha/and :portkey.aws.elastictranscoder.-2012-09-25/job-container))
(clojure.spec.alpha/def :portkey.aws.elastictranscoder.-2012-09-25/job-input (portkey.aws/json-keys :req-un [] :opt-un [:portkey.aws.elastictranscoder.-2012-09-25/Resolution :portkey.aws.elastictranscoder.-2012-09-25/FrameRate :portkey.aws.elastictranscoder.-2012-09-25/TimeSpan :portkey.aws.elastictranscoder.-2012-09-25/AspectRatio :portkey.aws.elastictranscoder.-2012-09-25/DetectedProperties :portkey.aws.elastictranscoder.-2012-09-25.job-input/Key :portkey.aws.elastictranscoder.-2012-09-25/Interlaced :portkey.aws.elastictranscoder.-2012-09-25.job-input/Container :portkey.aws.elastictranscoder.-2012-09-25/InputCaptions :portkey.aws.elastictranscoder.-2012-09-25/Encryption] :locations {}))

(clojure.spec.alpha/def :portkey.aws.elastictranscoder.-2012-09-25/thumbnail-resolution (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__13770__auto__] (clojure.core/re-matches #"^\d{1,5}x\d{1,5}$" s__13770__auto__))))

(clojure.spec.alpha/def :portkey.aws.elastictranscoder.-2012-09-25/read-pipeline-request (portkey.aws/json-keys :req-un [:portkey.aws.elastictranscoder.-2012-09-25/Id] :opt-un [] :locations {}))

(clojure.spec.alpha/def :portkey.aws.elastictranscoder.-2012-09-25.list-presets-response/next-page-token (clojure.spec.alpha/and :portkey.aws.elastictranscoder.-2012-09-25/id))
(clojure.spec.alpha/def :portkey.aws.elastictranscoder.-2012-09-25/list-presets-response (portkey.aws/json-keys :req-un [] :opt-un [:portkey.aws.elastictranscoder.-2012-09-25/Presets :portkey.aws.elastictranscoder.-2012-09-25.list-presets-response/NextPageToken] :locations {}))

(clojure.spec.alpha/def :portkey.aws.elastictranscoder.-2012-09-25/nullable-integer (clojure.spec.alpha/and clojure.core/int?))

(clojure.spec.alpha/def :portkey.aws.elastictranscoder.-2012-09-25.job/status (clojure.spec.alpha/and :portkey.aws.elastictranscoder.-2012-09-25/job-status))
(clojure.spec.alpha/def :portkey.aws.elastictranscoder.-2012-09-25.job/outputs (clojure.spec.alpha/and :portkey.aws.elastictranscoder.-2012-09-25/job-outputs))
(clojure.spec.alpha/def :portkey.aws.elastictranscoder.-2012-09-25.job/pipeline-id (clojure.spec.alpha/and :portkey.aws.elastictranscoder.-2012-09-25/id))
(clojure.spec.alpha/def :portkey.aws.elastictranscoder.-2012-09-25.job/output-key-prefix (clojure.spec.alpha/and :portkey.aws.elastictranscoder.-2012-09-25/key))
(clojure.spec.alpha/def :portkey.aws.elastictranscoder.-2012-09-25.job/inputs (clojure.spec.alpha/and :portkey.aws.elastictranscoder.-2012-09-25/job-inputs))
(clojure.spec.alpha/def :portkey.aws.elastictranscoder.-2012-09-25.job/input (clojure.spec.alpha/and :portkey.aws.elastictranscoder.-2012-09-25/job-input))
(clojure.spec.alpha/def :portkey.aws.elastictranscoder.-2012-09-25.job/arn (clojure.spec.alpha/and :portkey.aws.elastictranscoder.-2012-09-25/string))
(clojure.spec.alpha/def :portkey.aws.elastictranscoder.-2012-09-25.job/output (clojure.spec.alpha/and :portkey.aws.elastictranscoder.-2012-09-25/job-output))
(clojure.spec.alpha/def :portkey.aws.elastictranscoder.-2012-09-25/job (portkey.aws/json-keys :req-un [] :opt-un [:portkey.aws.elastictranscoder.-2012-09-25/Playlists :portkey.aws.elastictranscoder.-2012-09-25.job/Status :portkey.aws.elastictranscoder.-2012-09-25.job/Outputs :portkey.aws.elastictranscoder.-2012-09-25/UserMetadata :portkey.aws.elastictranscoder.-2012-09-25.job/PipelineId :portkey.aws.elastictranscoder.-2012-09-25.job/OutputKeyPrefix :portkey.aws.elastictranscoder.-2012-09-25/Timing :portkey.aws.elastictranscoder.-2012-09-25.job/Inputs :portkey.aws.elastictranscoder.-2012-09-25.job/Input :portkey.aws.elastictranscoder.-2012-09-25.job/Arn :portkey.aws.elastictranscoder.-2012-09-25.job/Output :portkey.aws.elastictranscoder.-2012-09-25/Id] :locations {}))

(clojure.spec.alpha/def :portkey.aws.elastictranscoder.-2012-09-25/key-id-guid (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__13770__auto__] (clojure.core/re-matches #"(^[0-9A-Fa-f]{8}-[0-9A-Fa-f]{4}-[0-9A-Fa-f]{4}-[0-9A-Fa-f]{4}-[0-9A-Fa-f]{12}$)|(^[0-9A-Fa-f]{32}$)" s__13770__auto__))))

(clojure.spec.alpha/def :portkey.aws.elastictranscoder.-2012-09-25/target (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__13770__auto__] (clojure.core/re-matches #"(^Content$)|(^Frame$)" s__13770__auto__))))

(clojure.spec.alpha/def :portkey.aws.elastictranscoder.-2012-09-25/name (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__13768__auto__] (clojure.core/<= 1 (clojure.core/count s__13768__auto__))) (clojure.core/fn [s__13769__auto__] (clojure.core/< (clojure.core/count s__13769__auto__) 40))))

(clojure.spec.alpha/def :portkey.aws.elastictranscoder.-2012-09-25/create-job-outputs (clojure.spec.alpha/and (clojure.spec.alpha/coll-of :portkey.aws.elastictranscoder.-2012-09-25/create-job-output :max-count 30) (clojure.spec.alpha/conformer clojure.core/identity (fn* [p1__13687__13688__auto__] (if (clojure.core/sequential? p1__13687__13688__auto__) p1__13687__13688__auto__ [p1__13687__13688__auto__])))))

(clojure.spec.alpha/def :portkey.aws.elastictranscoder.-2012-09-25/preset-watermark-id (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__13768__auto__] (clojure.core/<= 1 (clojure.core/count s__13768__auto__))) (clojure.core/fn [s__13769__auto__] (clojure.core/< (clojure.core/count s__13769__auto__) 40))))

(clojure.spec.alpha/def :portkey.aws.elastictranscoder.-2012-09-25/storage-class (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__13770__auto__] (clojure.core/re-matches #"(^ReducedRedundancy$)|(^Standard$)" s__13770__auto__))))

(clojure.spec.alpha/def :portkey.aws.elastictranscoder.-2012-09-25.list-jobs-by-pipeline-request/pipeline-id (clojure.spec.alpha/and :portkey.aws.elastictranscoder.-2012-09-25/id))
(clojure.spec.alpha/def :portkey.aws.elastictranscoder.-2012-09-25.list-jobs-by-pipeline-request/page-token (clojure.spec.alpha/and :portkey.aws.elastictranscoder.-2012-09-25/id))
(clojure.spec.alpha/def :portkey.aws.elastictranscoder.-2012-09-25/list-jobs-by-pipeline-request (portkey.aws/json-keys :req-un [:portkey.aws.elastictranscoder.-2012-09-25.list-jobs-by-pipeline-request/PipelineId] :opt-un [:portkey.aws.elastictranscoder.-2012-09-25/Ascending :portkey.aws.elastictranscoder.-2012-09-25.list-jobs-by-pipeline-request/PageToken] :locations {}))

(clojure.spec.alpha/def :portkey.aws.elastictranscoder.-2012-09-25/grantee (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__13768__auto__] (clojure.core/<= 1 (clojure.core/count s__13768__auto__))) (clojure.core/fn [s__13769__auto__] (clojure.core/< (clojure.core/count s__13769__auto__) 255))))

(clojure.spec.alpha/def :portkey.aws.elastictranscoder.-2012-09-25/caption-format-format (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__13770__auto__] (clojure.core/re-matches #"(^mov-text$)|(^srt$)|(^scc$)|(^webvtt$)|(^dfxp$)|(^cea-708$)" s__13770__auto__))))

(clojure.spec.alpha/def :portkey.aws.elastictranscoder.-2012-09-25/non-empty-base64-encoded-string (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__13770__auto__] (clojure.core/re-matches #"(^(?:[A-Za-z0-9\+/]{4})*(?:[A-Za-z0-9\+/]{2}==|[A-Za-z0-9\+/]{3}=)?$)" s__13770__auto__))))

(clojure.spec.alpha/def :portkey.aws.elastictranscoder.-2012-09-25.preset-watermark/sizing-policy (clojure.spec.alpha/and :portkey.aws.elastictranscoder.-2012-09-25/watermark-sizing-policy))
(clojure.spec.alpha/def :portkey.aws.elastictranscoder.-2012-09-25.preset-watermark/horizontal-offset (clojure.spec.alpha/and :portkey.aws.elastictranscoder.-2012-09-25/pixels-or-percent))
(clojure.spec.alpha/def :portkey.aws.elastictranscoder.-2012-09-25.preset-watermark/vertical-offset (clojure.spec.alpha/and :portkey.aws.elastictranscoder.-2012-09-25/pixels-or-percent))
(clojure.spec.alpha/def :portkey.aws.elastictranscoder.-2012-09-25.preset-watermark/max-height (clojure.spec.alpha/and :portkey.aws.elastictranscoder.-2012-09-25/pixels-or-percent))
(clojure.spec.alpha/def :portkey.aws.elastictranscoder.-2012-09-25.preset-watermark/max-width (clojure.spec.alpha/and :portkey.aws.elastictranscoder.-2012-09-25/pixels-or-percent))
(clojure.spec.alpha/def :portkey.aws.elastictranscoder.-2012-09-25.preset-watermark/id (clojure.spec.alpha/and :portkey.aws.elastictranscoder.-2012-09-25/preset-watermark-id))
(clojure.spec.alpha/def :portkey.aws.elastictranscoder.-2012-09-25/preset-watermark (portkey.aws/json-keys :req-un [] :opt-un [:portkey.aws.elastictranscoder.-2012-09-25.preset-watermark/SizingPolicy :portkey.aws.elastictranscoder.-2012-09-25/Opacity :portkey.aws.elastictranscoder.-2012-09-25.preset-watermark/HorizontalOffset :portkey.aws.elastictranscoder.-2012-09-25.preset-watermark/VerticalOffset :portkey.aws.elastictranscoder.-2012-09-25.preset-watermark/MaxHeight :portkey.aws.elastictranscoder.-2012-09-25/VerticalAlign :portkey.aws.elastictranscoder.-2012-09-25/Target :portkey.aws.elastictranscoder.-2012-09-25.preset-watermark/MaxWidth :portkey.aws.elastictranscoder.-2012-09-25.preset-watermark/Id :portkey.aws.elastictranscoder.-2012-09-25/HorizontalAlign] :locations {}))

(clojure.spec.alpha/def :portkey.aws.elastictranscoder.-2012-09-25/bucket-name (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__13770__auto__] (clojure.core/re-matches #"^(\w|\.|-){1,255}$" s__13770__auto__))))

(clojure.spec.alpha/def :portkey.aws.elastictranscoder.-2012-09-25/audio-bit-rate (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__13770__auto__] (clojure.core/re-matches #"^\d{1,3}$" s__13770__auto__))))

(clojure.spec.alpha/def :portkey.aws.elastictranscoder.-2012-09-25.notifications/progressing (clojure.spec.alpha/and :portkey.aws.elastictranscoder.-2012-09-25/sns-topic))
(clojure.spec.alpha/def :portkey.aws.elastictranscoder.-2012-09-25.notifications/completed (clojure.spec.alpha/and :portkey.aws.elastictranscoder.-2012-09-25/sns-topic))
(clojure.spec.alpha/def :portkey.aws.elastictranscoder.-2012-09-25.notifications/warning (clojure.spec.alpha/and :portkey.aws.elastictranscoder.-2012-09-25/sns-topic))
(clojure.spec.alpha/def :portkey.aws.elastictranscoder.-2012-09-25.notifications/error (clojure.spec.alpha/and :portkey.aws.elastictranscoder.-2012-09-25/sns-topic))
(clojure.spec.alpha/def :portkey.aws.elastictranscoder.-2012-09-25/notifications (portkey.aws/json-keys :req-un [] :opt-un [:portkey.aws.elastictranscoder.-2012-09-25.notifications/Progressing :portkey.aws.elastictranscoder.-2012-09-25.notifications/Completed :portkey.aws.elastictranscoder.-2012-09-25.notifications/Warning :portkey.aws.elastictranscoder.-2012-09-25.notifications/Error] :locations {}))

(clojure.spec.alpha/def :portkey.aws.elastictranscoder.-2012-09-25/job-inputs (clojure.spec.alpha/and (clojure.spec.alpha/coll-of :portkey.aws.elastictranscoder.-2012-09-25/job-input :max-count 10000) (clojure.spec.alpha/conformer clojure.core/identity (fn* [p1__13687__13688__auto__] (if (clojure.core/sequential? p1__13687__13688__auto__) p1__13687__13688__auto__ [p1__13687__13688__auto__])))))

(clojure.spec.alpha/def :portkey.aws.elastictranscoder.-2012-09-25/delete-preset-request (portkey.aws/json-keys :req-un [:portkey.aws.elastictranscoder.-2012-09-25/Id] :opt-un [] :locations {}))

(clojure.spec.alpha/def :portkey.aws.elastictranscoder.-2012-09-25/internal-service-exception (portkey.aws/json-keys :req-un [] :opt-un [] :locations {}))

(clojure.spec.alpha/def :portkey.aws.elastictranscoder.-2012-09-25.test-role-request/input-bucket (clojure.spec.alpha/and :portkey.aws.elastictranscoder.-2012-09-25/bucket-name))
(clojure.spec.alpha/def :portkey.aws.elastictranscoder.-2012-09-25.test-role-request/output-bucket (clojure.spec.alpha/and :portkey.aws.elastictranscoder.-2012-09-25/bucket-name))
(clojure.spec.alpha/def :portkey.aws.elastictranscoder.-2012-09-25.test-role-request/topics (clojure.spec.alpha/and :portkey.aws.elastictranscoder.-2012-09-25/sns-topics))
(clojure.spec.alpha/def :portkey.aws.elastictranscoder.-2012-09-25/test-role-request (portkey.aws/json-keys :req-un [:portkey.aws.elastictranscoder.-2012-09-25/Role :portkey.aws.elastictranscoder.-2012-09-25.test-role-request/InputBucket :portkey.aws.elastictranscoder.-2012-09-25.test-role-request/OutputBucket :portkey.aws.elastictranscoder.-2012-09-25.test-role-request/Topics] :opt-un [] :locations {}))

(clojure.spec.alpha/def :portkey.aws.elastictranscoder.-2012-09-25.caption-format/format (clojure.spec.alpha/and :portkey.aws.elastictranscoder.-2012-09-25/caption-format-format))
(clojure.spec.alpha/def :portkey.aws.elastictranscoder.-2012-09-25.caption-format/pattern (clojure.spec.alpha/and :portkey.aws.elastictranscoder.-2012-09-25/caption-format-pattern))
(clojure.spec.alpha/def :portkey.aws.elastictranscoder.-2012-09-25/caption-format (portkey.aws/json-keys :req-un [] :opt-un [:portkey.aws.elastictranscoder.-2012-09-25.caption-format/Format :portkey.aws.elastictranscoder.-2012-09-25.caption-format/Pattern :portkey.aws.elastictranscoder.-2012-09-25/Encryption] :locations {}))

(clojure.spec.alpha/def :portkey.aws.elastictranscoder.-2012-09-25/base64-encoded-string (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__13770__auto__] (clojure.core/re-matches #"^$|(^(?:[A-Za-z0-9\+/]{4})*(?:[A-Za-z0-9\+/]{2}==|[A-Za-z0-9\+/]{3}=)?$)" s__13770__auto__))))

(clojure.spec.alpha/def :portkey.aws.elastictranscoder.-2012-09-25/padding-policy (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__13770__auto__] (clojure.core/re-matches #"(^Pad$)|(^NoPad$)" s__13770__auto__))))

(clojure.spec.alpha/def :portkey.aws.elastictranscoder.-2012-09-25/id (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__13770__auto__] (clojure.core/re-matches #"^\d{13}-\w{6}$" s__13770__auto__))))

(clojure.spec.alpha/def :portkey.aws.elastictranscoder.-2012-09-25/read-pipeline-response (portkey.aws/json-keys :req-un [] :opt-un [:portkey.aws.elastictranscoder.-2012-09-25/Pipeline :portkey.aws.elastictranscoder.-2012-09-25/Warnings] :locations {}))

(clojure.spec.alpha/def :portkey.aws.elastictranscoder.-2012-09-25/delete-preset-response (portkey.aws/json-keys :req-un [] :opt-un [] :locations {}))

(clojure.spec.alpha/def :portkey.aws.elastictranscoder.-2012-09-25/time (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__13770__auto__] (clojure.core/re-matches #"(^\d{1,5}(\.\d{0,3})?$)|(^([0-1]?[0-9]:|2[0-3]:)?([0-5]?[0-9]:)?[0-5]?[0-9](\.\d{0,3})?$)" s__13770__auto__))))

(clojure.spec.alpha/def :portkey.aws.elastictranscoder.-2012-09-25/long-key (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__13768__auto__] (clojure.core/<= 1 (clojure.core/count s__13768__auto__))) (clojure.core/fn [s__13769__auto__] (clojure.core/< (clojure.core/count s__13769__auto__) 1024))))

(clojure.spec.alpha/def :portkey.aws.elastictranscoder.-2012-09-25/zero-to255-string (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__13768__auto__] (clojure.core/<= 0 (clojure.core/count s__13768__auto__))) (clojure.core/fn [s__13769__auto__] (clojure.core/< (clojure.core/count s__13769__auto__) 255))))

(clojure.spec.alpha/def :portkey.aws.elastictranscoder.-2012-09-25/job-outputs (clojure.spec.alpha/and (clojure.spec.alpha/coll-of :portkey.aws.elastictranscoder.-2012-09-25/job-output) (clojure.spec.alpha/conformer clojure.core/identity (fn* [p1__13687__13688__auto__] (if (clojure.core/sequential? p1__13687__13688__auto__) p1__13687__13688__auto__ [p1__13687__13688__auto__])))))

(clojure.spec.alpha/def :portkey.aws.elastictranscoder.-2012-09-25.create-job-playlist/name (clojure.spec.alpha/and :portkey.aws.elastictranscoder.-2012-09-25/filename))
(clojure.spec.alpha/def :portkey.aws.elastictranscoder.-2012-09-25.create-job-playlist/format (clojure.spec.alpha/and :portkey.aws.elastictranscoder.-2012-09-25/playlist-format))
(clojure.spec.alpha/def :portkey.aws.elastictranscoder.-2012-09-25/create-job-playlist (portkey.aws/json-keys :req-un [] :opt-un [:portkey.aws.elastictranscoder.-2012-09-25.create-job-playlist/Name :portkey.aws.elastictranscoder.-2012-09-25.create-job-playlist/Format :portkey.aws.elastictranscoder.-2012-09-25/OutputKeys :portkey.aws.elastictranscoder.-2012-09-25/HlsContentProtection :portkey.aws.elastictranscoder.-2012-09-25/PlayReadyDrm] :locations {}))

(clojure.spec.alpha/def :portkey.aws.elastictranscoder.-2012-09-25/create-job-playlists (clojure.spec.alpha/and (clojure.spec.alpha/coll-of :portkey.aws.elastictranscoder.-2012-09-25/create-job-playlist :max-count 30) (clojure.spec.alpha/conformer clojure.core/identity (fn* [p1__13687__13688__auto__] (if (clojure.core/sequential? p1__13687__13688__auto__) p1__13687__13688__auto__ [p1__13687__13688__auto__])))))

(clojure.spec.alpha/def :portkey.aws.elastictranscoder.-2012-09-25/caption-format-pattern (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__13770__auto__] (clojure.core/re-matches #"(^$)|(^.*\{language\}.*$)" s__13770__auto__))))

(clojure.spec.alpha/def :portkey.aws.elastictranscoder.-2012-09-25/update-pipeline-notifications-response (portkey.aws/json-keys :req-un [] :opt-un [:portkey.aws.elastictranscoder.-2012-09-25/Pipeline] :locations {}))

(clojure.spec.alpha/def :portkey.aws.elastictranscoder.-2012-09-25.create-job-output/thumbnail-encryption (clojure.spec.alpha/and :portkey.aws.elastictranscoder.-2012-09-25/encryption))
(clojure.spec.alpha/def :portkey.aws.elastictranscoder.-2012-09-25.create-job-output/preset-id (clojure.spec.alpha/and :portkey.aws.elastictranscoder.-2012-09-25/id))
(clojure.spec.alpha/def :portkey.aws.elastictranscoder.-2012-09-25.create-job-output/watermarks (clojure.spec.alpha/and :portkey.aws.elastictranscoder.-2012-09-25/job-watermarks))
(clojure.spec.alpha/def :portkey.aws.elastictranscoder.-2012-09-25.create-job-output/album-art (clojure.spec.alpha/and :portkey.aws.elastictranscoder.-2012-09-25/job-album-art))
(clojure.spec.alpha/def :portkey.aws.elastictranscoder.-2012-09-25.create-job-output/segment-duration (clojure.spec.alpha/and :portkey.aws.elastictranscoder.-2012-09-25/float-string))
(clojure.spec.alpha/def :portkey.aws.elastictranscoder.-2012-09-25/create-job-output (portkey.aws/json-keys :req-un [] :opt-un [:portkey.aws.elastictranscoder.-2012-09-25/Composition :portkey.aws.elastictranscoder.-2012-09-25/Captions :portkey.aws.elastictranscoder.-2012-09-25.create-job-output/ThumbnailEncryption :portkey.aws.elastictranscoder.-2012-09-25/ThumbnailPattern :portkey.aws.elastictranscoder.-2012-09-25.create-job-output/PresetId :portkey.aws.elastictranscoder.-2012-09-25/Key :portkey.aws.elastictranscoder.-2012-09-25.create-job-output/Watermarks :portkey.aws.elastictranscoder.-2012-09-25/Rotate :portkey.aws.elastictranscoder.-2012-09-25.create-job-output/AlbumArt :portkey.aws.elastictranscoder.-2012-09-25/Encryption :portkey.aws.elastictranscoder.-2012-09-25.create-job-output/SegmentDuration] :locations {}))

(clojure.spec.alpha/def :portkey.aws.elastictranscoder.-2012-09-25/horizontal-align (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__13770__auto__] (clojure.core/re-matches #"(^Left$)|(^Right$)|(^Center$)" s__13770__auto__))))

(clojure.core/defn create-pipeline "The CreatePipeline operation creates a pipeline with settings that you specify." ([create-pipeline-request] (portkey.aws/-rest-json-call portkey.aws.elastictranscoder.-2012-09-25/endpoints "POST" "/2012-09-25/pipelines" create-pipeline-request :portkey.aws.elastictranscoder.-2012-09-25/create-pipeline-request {:payload nil, :move {}, :headers {}, :uri {}, :querystring {}} 201 :portkey.aws.elastictranscoder.-2012-09-25/create-pipeline-response {"ValidationException" :portkey.aws.elastictranscoder.-2012-09-25/validation-exception, "IncompatibleVersionException" :portkey.aws.elastictranscoder.-2012-09-25/incompatible-version-exception, "AccessDeniedException" :portkey.aws.elastictranscoder.-2012-09-25/access-denied-exception, "ResourceNotFoundException" :portkey.aws.elastictranscoder.-2012-09-25/resource-not-found-exception, "LimitExceededException" :portkey.aws.elastictranscoder.-2012-09-25/limit-exceeded-exception, "InternalServiceException" :portkey.aws.elastictranscoder.-2012-09-25/internal-service-exception})))
(clojure.spec.alpha/fdef create-pipeline :args (clojure.spec.alpha/tuple :portkey.aws.elastictranscoder.-2012-09-25/create-pipeline-request) :ret (clojure.spec.alpha/and :portkey.aws.elastictranscoder.-2012-09-25/create-pipeline-response))

(clojure.core/defn list-pipelines "The ListPipelines operation gets a list of the pipelines associated with the\ncurrent AWS account." ([] (list-pipelines {})) ([list-pipelines-request] (portkey.aws/-rest-json-call portkey.aws.elastictranscoder.-2012-09-25/endpoints "GET" "/2012-09-25/pipelines" list-pipelines-request :portkey.aws.elastictranscoder.-2012-09-25/list-pipelines-request {:payload nil, :move {}, :headers {}, :uri {}, :querystring {"Ascending" "Ascending", "PageToken" "PageToken"}} nil :portkey.aws.elastictranscoder.-2012-09-25/list-pipelines-response {"ValidationException" :portkey.aws.elastictranscoder.-2012-09-25/validation-exception, "IncompatibleVersionException" :portkey.aws.elastictranscoder.-2012-09-25/incompatible-version-exception, "AccessDeniedException" :portkey.aws.elastictranscoder.-2012-09-25/access-denied-exception, "InternalServiceException" :portkey.aws.elastictranscoder.-2012-09-25/internal-service-exception})))
(clojure.spec.alpha/fdef list-pipelines :args (clojure.spec.alpha/? :portkey.aws.elastictranscoder.-2012-09-25/list-pipelines-request) :ret (clojure.spec.alpha/and :portkey.aws.elastictranscoder.-2012-09-25/list-pipelines-response))

(clojure.core/defn read-preset "The ReadPreset operation gets detailed information about a preset." ([read-preset-request] (portkey.aws/-rest-json-call portkey.aws.elastictranscoder.-2012-09-25/endpoints "GET" "/2012-09-25/presets/{Id}" read-preset-request :portkey.aws.elastictranscoder.-2012-09-25/read-preset-request {:payload nil, :move {}, :headers {}, :uri {"Id" "Id"}, :querystring {}} nil :portkey.aws.elastictranscoder.-2012-09-25/read-preset-response {"ValidationException" :portkey.aws.elastictranscoder.-2012-09-25/validation-exception, "IncompatibleVersionException" :portkey.aws.elastictranscoder.-2012-09-25/incompatible-version-exception, "ResourceNotFoundException" :portkey.aws.elastictranscoder.-2012-09-25/resource-not-found-exception, "AccessDeniedException" :portkey.aws.elastictranscoder.-2012-09-25/access-denied-exception, "InternalServiceException" :portkey.aws.elastictranscoder.-2012-09-25/internal-service-exception})))
(clojure.spec.alpha/fdef read-preset :args (clojure.spec.alpha/tuple :portkey.aws.elastictranscoder.-2012-09-25/read-preset-request) :ret (clojure.spec.alpha/and :portkey.aws.elastictranscoder.-2012-09-25/read-preset-response))

(clojure.core/defn read-pipeline "The ReadPipeline operation gets detailed information about a pipeline." ([read-pipeline-request] (portkey.aws/-rest-json-call portkey.aws.elastictranscoder.-2012-09-25/endpoints "GET" "/2012-09-25/pipelines/{Id}" read-pipeline-request :portkey.aws.elastictranscoder.-2012-09-25/read-pipeline-request {:payload nil, :move {}, :headers {}, :uri {"Id" "Id"}, :querystring {}} nil :portkey.aws.elastictranscoder.-2012-09-25/read-pipeline-response {"ValidationException" :portkey.aws.elastictranscoder.-2012-09-25/validation-exception, "IncompatibleVersionException" :portkey.aws.elastictranscoder.-2012-09-25/incompatible-version-exception, "ResourceNotFoundException" :portkey.aws.elastictranscoder.-2012-09-25/resource-not-found-exception, "AccessDeniedException" :portkey.aws.elastictranscoder.-2012-09-25/access-denied-exception, "InternalServiceException" :portkey.aws.elastictranscoder.-2012-09-25/internal-service-exception})))
(clojure.spec.alpha/fdef read-pipeline :args (clojure.spec.alpha/tuple :portkey.aws.elastictranscoder.-2012-09-25/read-pipeline-request) :ret (clojure.spec.alpha/and :portkey.aws.elastictranscoder.-2012-09-25/read-pipeline-response))

(clojure.core/defn list-jobs-by-pipeline "The ListJobsByPipeline operation gets a list of the jobs currently in a\npipeline.\n Elastic Transcoder returns all of the jobs currently in the specified pipeline.\nThe response body contains one element for each job that satisfies the search\ncriteria." ([list-jobs-by-pipeline-request] (portkey.aws/-rest-json-call portkey.aws.elastictranscoder.-2012-09-25/endpoints "GET" "/2012-09-25/jobsByPipeline/{PipelineId}" list-jobs-by-pipeline-request :portkey.aws.elastictranscoder.-2012-09-25/list-jobs-by-pipeline-request {:payload nil, :move {}, :headers {}, :uri {"PipelineId" "PipelineId"}, :querystring {"Ascending" "Ascending", "PageToken" "PageToken"}} nil :portkey.aws.elastictranscoder.-2012-09-25/list-jobs-by-pipeline-response {"ValidationException" :portkey.aws.elastictranscoder.-2012-09-25/validation-exception, "IncompatibleVersionException" :portkey.aws.elastictranscoder.-2012-09-25/incompatible-version-exception, "ResourceNotFoundException" :portkey.aws.elastictranscoder.-2012-09-25/resource-not-found-exception, "AccessDeniedException" :portkey.aws.elastictranscoder.-2012-09-25/access-denied-exception, "InternalServiceException" :portkey.aws.elastictranscoder.-2012-09-25/internal-service-exception})))
(clojure.spec.alpha/fdef list-jobs-by-pipeline :args (clojure.spec.alpha/tuple :portkey.aws.elastictranscoder.-2012-09-25/list-jobs-by-pipeline-request) :ret (clojure.spec.alpha/and :portkey.aws.elastictranscoder.-2012-09-25/list-jobs-by-pipeline-response))

(clojure.core/defn update-pipeline-notifications "With the UpdatePipelineNotifications operation, you can update Amazon Simple\nNotification Service (Amazon SNS) notifications for a pipeline.\n When you update notifications for a pipeline, Elastic Transcoder returns the\nvalues that you specified in the request." ([update-pipeline-notifications-request] (portkey.aws/-rest-json-call portkey.aws.elastictranscoder.-2012-09-25/endpoints "POST" "/2012-09-25/pipelines/{Id}/notifications" update-pipeline-notifications-request :portkey.aws.elastictranscoder.-2012-09-25/update-pipeline-notifications-request {:payload nil, :move {}, :headers {}, :uri {"Id" "Id"}, :querystring {}} nil :portkey.aws.elastictranscoder.-2012-09-25/update-pipeline-notifications-response {"ValidationException" :portkey.aws.elastictranscoder.-2012-09-25/validation-exception, "IncompatibleVersionException" :portkey.aws.elastictranscoder.-2012-09-25/incompatible-version-exception, "ResourceNotFoundException" :portkey.aws.elastictranscoder.-2012-09-25/resource-not-found-exception, "ResourceInUseException" :portkey.aws.elastictranscoder.-2012-09-25/resource-in-use-exception, "AccessDeniedException" :portkey.aws.elastictranscoder.-2012-09-25/access-denied-exception, "InternalServiceException" :portkey.aws.elastictranscoder.-2012-09-25/internal-service-exception})))
(clojure.spec.alpha/fdef update-pipeline-notifications :args (clojure.spec.alpha/tuple :portkey.aws.elastictranscoder.-2012-09-25/update-pipeline-notifications-request) :ret (clojure.spec.alpha/and :portkey.aws.elastictranscoder.-2012-09-25/update-pipeline-notifications-response))

(clojure.core/defn create-preset "The CreatePreset operation creates a preset with settings that you specify.\n Elastic Transcoder checks the CreatePreset settings to ensure that they meet\nElastic Transcoder requirements and to determine whether they comply with H.264\nstandards. If your settings are not valid for Elastic Transcoder, Elastic\nTranscoder returns an HTTP 400 response (ValidationException) and does not\ncreate the preset. If the settings are valid for Elastic Transcoder but aren't\nstrictly compliant with the H.264 standard, Elastic Transcoder creates the\npreset and returns a warning message in the response. This helps you determine\nwhether your settings comply with the H.264 standard while giving you greater\nflexibility with respect to the video that Elastic Transcoder produces.\n Elastic Transcoder uses the H.264 video-compression format. For more\ninformation, see the International Telecommunication Union publication\nRecommendation ITU-T H.264: Advanced video coding for generic audiovisual\nservices." ([create-preset-request] (portkey.aws/-rest-json-call portkey.aws.elastictranscoder.-2012-09-25/endpoints "POST" "/2012-09-25/presets" create-preset-request :portkey.aws.elastictranscoder.-2012-09-25/create-preset-request {:payload nil, :move {}, :headers {}, :uri {}, :querystring {}} 201 :portkey.aws.elastictranscoder.-2012-09-25/create-preset-response {"ValidationException" :portkey.aws.elastictranscoder.-2012-09-25/validation-exception, "IncompatibleVersionException" :portkey.aws.elastictranscoder.-2012-09-25/incompatible-version-exception, "AccessDeniedException" :portkey.aws.elastictranscoder.-2012-09-25/access-denied-exception, "LimitExceededException" :portkey.aws.elastictranscoder.-2012-09-25/limit-exceeded-exception, "InternalServiceException" :portkey.aws.elastictranscoder.-2012-09-25/internal-service-exception})))
(clojure.spec.alpha/fdef create-preset :args (clojure.spec.alpha/tuple :portkey.aws.elastictranscoder.-2012-09-25/create-preset-request) :ret (clojure.spec.alpha/and :portkey.aws.elastictranscoder.-2012-09-25/create-preset-response))

(clojure.core/defn delete-pipeline "The DeletePipeline operation removes a pipeline.\n You can only delete a pipeline that has never been used or that is not\ncurrently in use (doesn't contain any active jobs). If the pipeline is currently\nin use, DeletePipeline returns an error." ([delete-pipeline-request] (portkey.aws/-rest-json-call portkey.aws.elastictranscoder.-2012-09-25/endpoints "DELETE" "/2012-09-25/pipelines/{Id}" delete-pipeline-request :portkey.aws.elastictranscoder.-2012-09-25/delete-pipeline-request {:payload nil, :move {}, :headers {}, :uri {"Id" "Id"}, :querystring {}} 202 :portkey.aws.elastictranscoder.-2012-09-25/delete-pipeline-response {"ValidationException" :portkey.aws.elastictranscoder.-2012-09-25/validation-exception, "IncompatibleVersionException" :portkey.aws.elastictranscoder.-2012-09-25/incompatible-version-exception, "ResourceNotFoundException" :portkey.aws.elastictranscoder.-2012-09-25/resource-not-found-exception, "ResourceInUseException" :portkey.aws.elastictranscoder.-2012-09-25/resource-in-use-exception, "AccessDeniedException" :portkey.aws.elastictranscoder.-2012-09-25/access-denied-exception, "InternalServiceException" :portkey.aws.elastictranscoder.-2012-09-25/internal-service-exception})))
(clojure.spec.alpha/fdef delete-pipeline :args (clojure.spec.alpha/tuple :portkey.aws.elastictranscoder.-2012-09-25/delete-pipeline-request) :ret (clojure.spec.alpha/and :portkey.aws.elastictranscoder.-2012-09-25/delete-pipeline-response))

(clojure.core/defn list-jobs-by-status "The ListJobsByStatus operation gets a list of jobs that have a specified status.\nThe response body contains one element for each job that satisfies the search\ncriteria." ([list-jobs-by-status-request] (portkey.aws/-rest-json-call portkey.aws.elastictranscoder.-2012-09-25/endpoints "GET" "/2012-09-25/jobsByStatus/{Status}" list-jobs-by-status-request :portkey.aws.elastictranscoder.-2012-09-25/list-jobs-by-status-request {:payload nil, :move {}, :headers {}, :uri {"Status" "Status"}, :querystring {"Ascending" "Ascending", "PageToken" "PageToken"}} nil :portkey.aws.elastictranscoder.-2012-09-25/list-jobs-by-status-response {"ValidationException" :portkey.aws.elastictranscoder.-2012-09-25/validation-exception, "IncompatibleVersionException" :portkey.aws.elastictranscoder.-2012-09-25/incompatible-version-exception, "ResourceNotFoundException" :portkey.aws.elastictranscoder.-2012-09-25/resource-not-found-exception, "AccessDeniedException" :portkey.aws.elastictranscoder.-2012-09-25/access-denied-exception, "InternalServiceException" :portkey.aws.elastictranscoder.-2012-09-25/internal-service-exception})))
(clojure.spec.alpha/fdef list-jobs-by-status :args (clojure.spec.alpha/tuple :portkey.aws.elastictranscoder.-2012-09-25/list-jobs-by-status-request) :ret (clojure.spec.alpha/and :portkey.aws.elastictranscoder.-2012-09-25/list-jobs-by-status-response))

(clojure.core/defn create-job "When you create a job, Elastic Transcoder returns JSON data that includes the\nvalues that you specified plus information about the job that is created.\n If you have specified more than one output for your jobs (for example, one\noutput for the Kindle Fire and another output for the Apple iPhone 4s), you\ncurrently must use the Elastic Transcoder API to list the jobs (as opposed to\nthe AWS Console)." ([create-job-request] (portkey.aws/-rest-json-call portkey.aws.elastictranscoder.-2012-09-25/endpoints "POST" "/2012-09-25/jobs" create-job-request :portkey.aws.elastictranscoder.-2012-09-25/create-job-request {:payload nil, :move {}, :headers {}, :uri {}, :querystring {}} 201 :portkey.aws.elastictranscoder.-2012-09-25/create-job-response {"ValidationException" :portkey.aws.elastictranscoder.-2012-09-25/validation-exception, "IncompatibleVersionException" :portkey.aws.elastictranscoder.-2012-09-25/incompatible-version-exception, "ResourceNotFoundException" :portkey.aws.elastictranscoder.-2012-09-25/resource-not-found-exception, "AccessDeniedException" :portkey.aws.elastictranscoder.-2012-09-25/access-denied-exception, "LimitExceededException" :portkey.aws.elastictranscoder.-2012-09-25/limit-exceeded-exception, "InternalServiceException" :portkey.aws.elastictranscoder.-2012-09-25/internal-service-exception})))
(clojure.spec.alpha/fdef create-job :args (clojure.spec.alpha/tuple :portkey.aws.elastictranscoder.-2012-09-25/create-job-request) :ret (clojure.spec.alpha/and :portkey.aws.elastictranscoder.-2012-09-25/create-job-response))

(clojure.core/defn delete-preset "The DeletePreset operation removes a preset that you've added in an AWS region.\n You can't delete the default presets that are included with Elastic Transcoder." ([delete-preset-request] (portkey.aws/-rest-json-call portkey.aws.elastictranscoder.-2012-09-25/endpoints "DELETE" "/2012-09-25/presets/{Id}" delete-preset-request :portkey.aws.elastictranscoder.-2012-09-25/delete-preset-request {:payload nil, :move {}, :headers {}, :uri {"Id" "Id"}, :querystring {}} 202 :portkey.aws.elastictranscoder.-2012-09-25/delete-preset-response {"ValidationException" :portkey.aws.elastictranscoder.-2012-09-25/validation-exception, "IncompatibleVersionException" :portkey.aws.elastictranscoder.-2012-09-25/incompatible-version-exception, "ResourceNotFoundException" :portkey.aws.elastictranscoder.-2012-09-25/resource-not-found-exception, "AccessDeniedException" :portkey.aws.elastictranscoder.-2012-09-25/access-denied-exception, "InternalServiceException" :portkey.aws.elastictranscoder.-2012-09-25/internal-service-exception})))
(clojure.spec.alpha/fdef delete-preset :args (clojure.spec.alpha/tuple :portkey.aws.elastictranscoder.-2012-09-25/delete-preset-request) :ret (clojure.spec.alpha/and :portkey.aws.elastictranscoder.-2012-09-25/delete-preset-response))

(clojure.core/defn update-pipeline " Use the UpdatePipeline operation to update settings for a pipeline.\n When you change pipeline settings, your changes take effect immediately. Jobs\nthat you have already submitted and that Elastic Transcoder has not started to\nprocess are affected in addition to jobs that you submit after you change\nsettings." ([update-pipeline-request] (portkey.aws/-rest-json-call portkey.aws.elastictranscoder.-2012-09-25/endpoints "PUT" "/2012-09-25/pipelines/{Id}" update-pipeline-request :portkey.aws.elastictranscoder.-2012-09-25/update-pipeline-request {:payload nil, :move {}, :headers {}, :uri {"Id" "Id"}, :querystring {}} 200 :portkey.aws.elastictranscoder.-2012-09-25/update-pipeline-response {"ValidationException" :portkey.aws.elastictranscoder.-2012-09-25/validation-exception, "IncompatibleVersionException" :portkey.aws.elastictranscoder.-2012-09-25/incompatible-version-exception, "AccessDeniedException" :portkey.aws.elastictranscoder.-2012-09-25/access-denied-exception, "ResourceInUseException" :portkey.aws.elastictranscoder.-2012-09-25/resource-in-use-exception, "ResourceNotFoundException" :portkey.aws.elastictranscoder.-2012-09-25/resource-not-found-exception, "InternalServiceException" :portkey.aws.elastictranscoder.-2012-09-25/internal-service-exception})))
(clojure.spec.alpha/fdef update-pipeline :args (clojure.spec.alpha/tuple :portkey.aws.elastictranscoder.-2012-09-25/update-pipeline-request) :ret (clojure.spec.alpha/and :portkey.aws.elastictranscoder.-2012-09-25/update-pipeline-response))

(clojure.core/defn read-job "The ReadJob operation returns detailed information about a job." ([read-job-request] (portkey.aws/-rest-json-call portkey.aws.elastictranscoder.-2012-09-25/endpoints "GET" "/2012-09-25/jobs/{Id}" read-job-request :portkey.aws.elastictranscoder.-2012-09-25/read-job-request {:payload nil, :move {}, :headers {}, :uri {"Id" "Id"}, :querystring {}} nil :portkey.aws.elastictranscoder.-2012-09-25/read-job-response {"ValidationException" :portkey.aws.elastictranscoder.-2012-09-25/validation-exception, "IncompatibleVersionException" :portkey.aws.elastictranscoder.-2012-09-25/incompatible-version-exception, "ResourceNotFoundException" :portkey.aws.elastictranscoder.-2012-09-25/resource-not-found-exception, "AccessDeniedException" :portkey.aws.elastictranscoder.-2012-09-25/access-denied-exception, "InternalServiceException" :portkey.aws.elastictranscoder.-2012-09-25/internal-service-exception})))
(clojure.spec.alpha/fdef read-job :args (clojure.spec.alpha/tuple :portkey.aws.elastictranscoder.-2012-09-25/read-job-request) :ret (clojure.spec.alpha/and :portkey.aws.elastictranscoder.-2012-09-25/read-job-response))

(clojure.core/defn update-pipeline-status "The UpdatePipelineStatus operation pauses or reactivates a pipeline, so that the\npipeline stops or restarts the processing of jobs.\n Changing the pipeline status is useful if you want to cancel one or more jobs.\nYou can't cancel jobs after Elastic Transcoder has started processing them; if\nyou pause the pipeline to which you submitted the jobs, you have more time to\nget the job IDs for the jobs that you want to cancel, and to send a CancelJob\nrequest." ([update-pipeline-status-request] (portkey.aws/-rest-json-call portkey.aws.elastictranscoder.-2012-09-25/endpoints "POST" "/2012-09-25/pipelines/{Id}/status" update-pipeline-status-request :portkey.aws.elastictranscoder.-2012-09-25/update-pipeline-status-request {:payload nil, :move {}, :headers {}, :uri {"Id" "Id"}, :querystring {}} nil :portkey.aws.elastictranscoder.-2012-09-25/update-pipeline-status-response {"ValidationException" :portkey.aws.elastictranscoder.-2012-09-25/validation-exception, "IncompatibleVersionException" :portkey.aws.elastictranscoder.-2012-09-25/incompatible-version-exception, "ResourceNotFoundException" :portkey.aws.elastictranscoder.-2012-09-25/resource-not-found-exception, "ResourceInUseException" :portkey.aws.elastictranscoder.-2012-09-25/resource-in-use-exception, "AccessDeniedException" :portkey.aws.elastictranscoder.-2012-09-25/access-denied-exception, "InternalServiceException" :portkey.aws.elastictranscoder.-2012-09-25/internal-service-exception})))
(clojure.spec.alpha/fdef update-pipeline-status :args (clojure.spec.alpha/tuple :portkey.aws.elastictranscoder.-2012-09-25/update-pipeline-status-request) :ret (clojure.spec.alpha/and :portkey.aws.elastictranscoder.-2012-09-25/update-pipeline-status-response))

(clojure.core/defn test-role "The TestRole operation tests the IAM role used to create the pipeline.\n The TestRole action lets you determine whether the IAM role you are using has\nsufficient permissions to let Elastic Transcoder perform tasks associated with\nthe transcoding process. The action attempts to assume the specified IAM role,\nchecks read access to the input and output buckets, and tries to send a test\nnotification to Amazon SNS topics that you specify." ([test-role-request] (portkey.aws/-rest-json-call portkey.aws.elastictranscoder.-2012-09-25/endpoints "POST" "/2012-09-25/roleTests" test-role-request :portkey.aws.elastictranscoder.-2012-09-25/test-role-request {:payload nil, :move {}, :headers {}, :uri {}, :querystring {}} 200 :portkey.aws.elastictranscoder.-2012-09-25/test-role-response {"ValidationException" :portkey.aws.elastictranscoder.-2012-09-25/validation-exception, "IncompatibleVersionException" :portkey.aws.elastictranscoder.-2012-09-25/incompatible-version-exception, "ResourceNotFoundException" :portkey.aws.elastictranscoder.-2012-09-25/resource-not-found-exception, "AccessDeniedException" :portkey.aws.elastictranscoder.-2012-09-25/access-denied-exception, "InternalServiceException" :portkey.aws.elastictranscoder.-2012-09-25/internal-service-exception})))
(clojure.spec.alpha/fdef test-role :args (clojure.spec.alpha/tuple :portkey.aws.elastictranscoder.-2012-09-25/test-role-request) :ret (clojure.spec.alpha/and :portkey.aws.elastictranscoder.-2012-09-25/test-role-response))

(clojure.core/defn list-presets "The ListPresets operation gets a list of the default presets included with\nElastic Transcoder and the presets that you've added in an AWS region." ([] (list-presets {})) ([list-presets-request] (portkey.aws/-rest-json-call portkey.aws.elastictranscoder.-2012-09-25/endpoints "GET" "/2012-09-25/presets" list-presets-request :portkey.aws.elastictranscoder.-2012-09-25/list-presets-request {:payload nil, :move {}, :headers {}, :uri {}, :querystring {"Ascending" "Ascending", "PageToken" "PageToken"}} nil :portkey.aws.elastictranscoder.-2012-09-25/list-presets-response {"ValidationException" :portkey.aws.elastictranscoder.-2012-09-25/validation-exception, "IncompatibleVersionException" :portkey.aws.elastictranscoder.-2012-09-25/incompatible-version-exception, "AccessDeniedException" :portkey.aws.elastictranscoder.-2012-09-25/access-denied-exception, "InternalServiceException" :portkey.aws.elastictranscoder.-2012-09-25/internal-service-exception})))
(clojure.spec.alpha/fdef list-presets :args (clojure.spec.alpha/? :portkey.aws.elastictranscoder.-2012-09-25/list-presets-request) :ret (clojure.spec.alpha/and :portkey.aws.elastictranscoder.-2012-09-25/list-presets-response))

(clojure.core/defn cancel-job "The CancelJob operation cancels an unfinished job.\n You can only cancel a job that has a status of Submitted. To prevent a pipeline\nfrom starting to process a job while you're getting the job identifier, use\nUpdatePipelineStatus to temporarily pause the pipeline." ([cancel-job-request] (portkey.aws/-rest-json-call portkey.aws.elastictranscoder.-2012-09-25/endpoints "DELETE" "/2012-09-25/jobs/{Id}" cancel-job-request :portkey.aws.elastictranscoder.-2012-09-25/cancel-job-request {:payload nil, :move {}, :headers {}, :uri {"Id" "Id"}, :querystring {}} 202 :portkey.aws.elastictranscoder.-2012-09-25/cancel-job-response {"ValidationException" :portkey.aws.elastictranscoder.-2012-09-25/validation-exception, "IncompatibleVersionException" :portkey.aws.elastictranscoder.-2012-09-25/incompatible-version-exception, "ResourceNotFoundException" :portkey.aws.elastictranscoder.-2012-09-25/resource-not-found-exception, "ResourceInUseException" :portkey.aws.elastictranscoder.-2012-09-25/resource-in-use-exception, "AccessDeniedException" :portkey.aws.elastictranscoder.-2012-09-25/access-denied-exception, "InternalServiceException" :portkey.aws.elastictranscoder.-2012-09-25/internal-service-exception})))
(clojure.spec.alpha/fdef cancel-job :args (clojure.spec.alpha/tuple :portkey.aws.elastictranscoder.-2012-09-25/cancel-job-request) :ret (clojure.spec.alpha/and :portkey.aws.elastictranscoder.-2012-09-25/cancel-job-response))
