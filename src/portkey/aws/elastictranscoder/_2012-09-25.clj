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

(clojure.core/declare ser-fixed-gop)

(clojure.core/declare ser-artwork)

(clojure.core/declare ser-sns-topic)

(clojure.core/declare ser-caption-sources)

(clojure.core/declare ser-permissions)

(clojure.core/declare ser-sizing-policy)

(clojure.core/declare ser-codec-options)

(clojure.core/declare ser-play-ready-drm)

(clojure.core/declare ser-codec-option)

(clojure.core/declare ser-job-status)

(clojure.core/declare ser-access-controls)

(clojure.core/declare ser-output-keys)

(clojure.core/declare ser-video-parameters)

(clojure.core/declare ser-playlist-format)

(clojure.core/declare ser-job-watermarks)

(clojure.core/declare ser-composition)

(clojure.core/declare ser-play-ready-drm-format-string)

(clojure.core/declare ser-permission)

(clojure.core/declare ser-key-storage-policy)

(clojure.core/declare ser-grantee-type)

(clojure.core/declare ser-job-album-art)

(clojure.core/declare ser-encryption-mode)

(clojure.core/declare ser-jpg-or-png)

(clojure.core/declare ser-captions)

(clojure.core/declare ser-keyframes-max-dist)

(clojure.core/declare ser-time-offset)

(clojure.core/declare ser-audio-channels)

(clojure.core/declare ser-caption-formats)

(clojure.core/declare ser-job-watermark)

(clojure.core/declare ser-pixels-or-percent)

(clojure.core/declare ser-caption-merge-policy)

(clojure.core/declare ser-hls-content-protection-method)

(clojure.core/declare ser-thumbnails)

(clojure.core/declare ser-digits)

(clojure.core/declare ser-watermark-sizing-policy)

(clojure.core/declare ser-resolution)

(clojure.core/declare ser-artworks)

(clojure.core/declare ser-video-bit-rate)

(clojure.core/declare ser-frame-rate)

(clojure.core/declare ser-opacity)

(clojure.core/declare ser-time-span)

(clojure.core/declare ser-aspect-ratio)

(clojure.core/declare ser-watermark-key)

(clojure.core/declare ser-one-to-512-string)

(clojure.core/declare ser-zero-to-512-string)

(clojure.core/declare ser-thumbnail-pattern)

(clojure.core/declare ser-pipeline-status)

(clojure.core/declare ser-user-metadata)

(clojure.core/declare ser-ascending)

(clojure.core/declare ser-detected-properties)

(clojure.core/declare ser-pipeline-output-config)

(clojure.core/declare ser-key)

(clojure.core/declare ser-sns-topics)

(clojure.core/declare ser-role)

(clojure.core/declare ser-interlaced)

(clojure.core/declare ser-max-frame-rate)

(clojure.core/declare ser-audio-codec-options)

(clojure.core/declare ser-float-string)

(clojure.core/declare ser-nullable-long)

(clojure.core/declare ser-audio-sample-rate)

(clojure.core/declare ser-audio-bit-depth)

(clojure.core/declare ser-description)

(clojure.core/declare ser-audio-packing-mode)

(clojure.core/declare ser-audio-bit-order)

(clojure.core/declare ser-hls-content-protection)

(clojure.core/declare ser-string)

(clojure.core/declare ser-caption-source)

(clojure.core/declare ser-digits-or-auto)

(clojure.core/declare ser-input-captions)

(clojure.core/declare ser-audio-parameters)

(clojure.core/declare ser-access-control)

(clojure.core/declare ser-audio-codec-profile)

(clojure.core/declare ser-video-codec)

(clojure.core/declare ser-vertical-align)

(clojure.core/declare ser-rotate)

(clojure.core/declare ser-audio-codec)

(clojure.core/declare ser-audio-signed)

(clojure.core/declare ser-filename)

(clojure.core/declare ser-preset-watermarks)

(clojure.core/declare ser-key-arn)

(clojure.core/declare ser-clip)

(clojure.core/declare ser-merge-policy)

(clojure.core/declare ser-encryption)

(clojure.core/declare ser-job-container)

(clojure.core/declare ser-preset-container)

(clojure.core/declare ser-job-input)

(clojure.core/declare ser-thumbnail-resolution)

(clojure.core/declare ser-nullable-integer)

(clojure.core/declare ser-key-id-guid)

(clojure.core/declare ser-target)

(clojure.core/declare ser-name)

(clojure.core/declare ser-create-job-outputs)

(clojure.core/declare ser-preset-watermark-id)

(clojure.core/declare ser-storage-class)

(clojure.core/declare ser-grantee)

(clojure.core/declare ser-caption-format-format)

(clojure.core/declare ser-non-empty-base-64-encoded-string)

(clojure.core/declare ser-preset-watermark)

(clojure.core/declare ser-bucket-name)

(clojure.core/declare ser-audio-bit-rate)

(clojure.core/declare ser-notifications)

(clojure.core/declare ser-job-inputs)

(clojure.core/declare ser-caption-format)

(clojure.core/declare ser-base-64-encoded-string)

(clojure.core/declare ser-padding-policy)

(clojure.core/declare ser-id)

(clojure.core/declare ser-time)

(clojure.core/declare ser-long-key)

(clojure.core/declare ser-zero-to-255-string)

(clojure.core/declare ser-create-job-playlist)

(clojure.core/declare ser-create-job-playlists)

(clojure.core/declare ser-caption-format-pattern)

(clojure.core/declare ser-create-job-output)

(clojure.core/declare ser-horizontal-align)

(clojure.core/defn- ser-fixed-gop [input] #:http.request.field{:value input, :shape "FixedGOP"})

(clojure.core/defn- ser-artwork [input] (clojure.core/cond-> #:http.request.field{:value [], :shape "Artwork", :type "structure"} (clojure.core/contains? input :input-key) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-watermark-key (input :input-key)) #:http.request.field{:name "InputKey", :shape "WatermarkKey"})) (clojure.core/contains? input :max-width) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-digits-or-auto (input :max-width)) #:http.request.field{:name "MaxWidth", :shape "DigitsOrAuto"})) (clojure.core/contains? input :max-height) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-digits-or-auto (input :max-height)) #:http.request.field{:name "MaxHeight", :shape "DigitsOrAuto"})) (clojure.core/contains? input :sizing-policy) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-sizing-policy (input :sizing-policy)) #:http.request.field{:name "SizingPolicy", :shape "SizingPolicy"})) (clojure.core/contains? input :padding-policy) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-padding-policy (input :padding-policy)) #:http.request.field{:name "PaddingPolicy", :shape "PaddingPolicy"})) (clojure.core/contains? input :album-art-format) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-jpg-or-png (input :album-art-format)) #:http.request.field{:name "AlbumArtFormat", :shape "JpgOrPng"})) (clojure.core/contains? input :encryption) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-encryption (input :encryption)) #:http.request.field{:name "Encryption", :shape "Encryption"}))))

(clojure.core/defn- ser-sns-topic [input] #:http.request.field{:value input, :shape "SnsTopic"})

(clojure.core/defn- ser-caption-sources [input] #:http.request.field{:value (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (clojure.core/merge (ser-caption-source coll) #:http.request.field{:shape "CaptionSource"}))) input), :shape "CaptionSources", :type "list", :max 20})

(clojure.core/defn- ser-permissions [input] #:http.request.field{:value (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (clojure.core/merge (ser-permission coll) #:http.request.field{:shape "Permission"}))) input), :shape "Permissions", :type "list", :max 30})

(clojure.core/defn- ser-sizing-policy [input] #:http.request.field{:value input, :shape "SizingPolicy"})

(clojure.core/defn- ser-codec-options [input] #:http.request.field{:value (clojure.core/into [] (clojure.core/map (clojure.core/fn [[k v]] [(clojure.core/into (ser-codec-option k) #:http.request.field{:map-info "key", :shape "CodecOption"}) (clojure.core/into (ser-codec-option v) #:http.request.field{:map-info "value", :shape "CodecOption"})])) input), :shape "CodecOptions", :type "map", :max 30})

(clojure.core/defn- ser-play-ready-drm [input] (clojure.core/cond-> #:http.request.field{:value [], :shape "PlayReadyDrm", :type "structure"} (clojure.core/contains? input :format) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-play-ready-drm-format-string (input :format)) #:http.request.field{:name "Format", :shape "PlayReadyDrmFormatString"})) (clojure.core/contains? input :key) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-non-empty-base-64-encoded-string (input :key)) #:http.request.field{:name "Key", :shape "NonEmptyBase64EncodedString"})) (clojure.core/contains? input :key-md-5) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-non-empty-base-64-encoded-string (input :key-md-5)) #:http.request.field{:name "KeyMd5", :shape "NonEmptyBase64EncodedString"})) (clojure.core/contains? input :key-id) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-key-id-guid (input :key-id)) #:http.request.field{:name "KeyId", :shape "KeyIdGuid"})) (clojure.core/contains? input :initialization-vector) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-zero-to-255-string (input :initialization-vector)) #:http.request.field{:name "InitializationVector", :shape "ZeroTo255String"})) (clojure.core/contains? input :license-acquisition-url) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-one-to-512-string (input :license-acquisition-url)) #:http.request.field{:name "LicenseAcquisitionUrl", :shape "OneTo512String"}))))

(clojure.core/defn- ser-codec-option [input] #:http.request.field{:value input, :shape "CodecOption"})

(clojure.core/defn- ser-job-status [input] #:http.request.field{:value input, :shape "JobStatus"})

(clojure.core/defn- ser-access-controls [input] #:http.request.field{:value (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (clojure.core/merge (ser-access-control coll) #:http.request.field{:shape "AccessControl"}))) input), :shape "AccessControls", :type "list", :max 30})

(clojure.core/defn- ser-output-keys [input] #:http.request.field{:value (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (clojure.core/merge (ser-key coll) #:http.request.field{:shape "Key"}))) input), :shape "OutputKeys", :type "list", :max 30})

(clojure.core/defn- ser-video-parameters [input] (clojure.core/cond-> #:http.request.field{:value [], :shape "VideoParameters", :type "structure"} (clojure.core/contains? input :fixed-gop) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-fixed-gop (input :fixed-gop)) #:http.request.field{:name "FixedGOP", :shape "FixedGOP"})) (clojure.core/contains? input :sizing-policy) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-sizing-policy (input :sizing-policy)) #:http.request.field{:name "SizingPolicy", :shape "SizingPolicy"})) (clojure.core/contains? input :codec-options) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-codec-options (input :codec-options)) #:http.request.field{:name "CodecOptions", :shape "CodecOptions"})) (clojure.core/contains? input :codec) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-video-codec (input :codec)) #:http.request.field{:name "Codec", :shape "VideoCodec"})) (clojure.core/contains? input :bit-rate) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-video-bit-rate (input :bit-rate)) #:http.request.field{:name "BitRate", :shape "VideoBitRate"})) (clojure.core/contains? input :keyframes-max-dist) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-keyframes-max-dist (input :keyframes-max-dist)) #:http.request.field{:name "KeyframesMaxDist", :shape "KeyframesMaxDist"})) (clojure.core/contains? input :resolution) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-resolution (input :resolution)) #:http.request.field{:name "Resolution", :shape "Resolution"})) (clojure.core/contains? input :frame-rate) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-frame-rate (input :frame-rate)) #:http.request.field{:name "FrameRate", :shape "FrameRate"})) (clojure.core/contains? input :aspect-ratio) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-aspect-ratio (input :aspect-ratio)) #:http.request.field{:name "AspectRatio", :shape "AspectRatio"})) (clojure.core/contains? input :max-frame-rate) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-max-frame-rate (input :max-frame-rate)) #:http.request.field{:name "MaxFrameRate", :shape "MaxFrameRate"})) (clojure.core/contains? input :watermarks) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-preset-watermarks (input :watermarks)) #:http.request.field{:name "Watermarks", :shape "PresetWatermarks"})) (clojure.core/contains? input :max-height) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-digits-or-auto (input :max-height)) #:http.request.field{:name "MaxHeight", :shape "DigitsOrAuto"})) (clojure.core/contains? input :display-aspect-ratio) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-aspect-ratio (input :display-aspect-ratio)) #:http.request.field{:name "DisplayAspectRatio", :shape "AspectRatio"})) (clojure.core/contains? input :max-width) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-digits-or-auto (input :max-width)) #:http.request.field{:name "MaxWidth", :shape "DigitsOrAuto"})) (clojure.core/contains? input :padding-policy) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-padding-policy (input :padding-policy)) #:http.request.field{:name "PaddingPolicy", :shape "PaddingPolicy"}))))

(clojure.core/defn- ser-playlist-format [input] #:http.request.field{:value input, :shape "PlaylistFormat"})

(clojure.core/defn- ser-job-watermarks [input] #:http.request.field{:value (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (clojure.core/merge (ser-job-watermark coll) #:http.request.field{:shape "JobWatermark"}))) input), :shape "JobWatermarks", :type "list"})

(clojure.core/defn- ser-composition [input] #:http.request.field{:value (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (clojure.core/merge (ser-clip coll) #:http.request.field{:shape "Clip"}))) input), :shape "Composition", :type "list", :deprecated true})

(clojure.core/defn- ser-play-ready-drm-format-string [input] #:http.request.field{:value input, :shape "PlayReadyDrmFormatString"})

(clojure.core/defn- ser-permission [input] (clojure.core/cond-> #:http.request.field{:value [], :shape "Permission", :type "structure"} (clojure.core/contains? input :grantee-type) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-grantee-type (input :grantee-type)) #:http.request.field{:name "GranteeType", :shape "GranteeType"})) (clojure.core/contains? input :grantee) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-grantee (input :grantee)) #:http.request.field{:name "Grantee", :shape "Grantee"})) (clojure.core/contains? input :access) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-access-controls (input :access)) #:http.request.field{:name "Access", :shape "AccessControls"}))))

(clojure.core/defn- ser-key-storage-policy [input] #:http.request.field{:value input, :shape "KeyStoragePolicy"})

(clojure.core/defn- ser-grantee-type [input] #:http.request.field{:value input, :shape "GranteeType"})

(clojure.core/defn- ser-job-album-art [input] (clojure.core/cond-> #:http.request.field{:value [], :shape "JobAlbumArt", :type "structure"} (clojure.core/contains? input :merge-policy) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-merge-policy (input :merge-policy)) #:http.request.field{:name "MergePolicy", :shape "MergePolicy"})) (clojure.core/contains? input :artwork) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-artworks (input :artwork)) #:http.request.field{:name "Artwork", :shape "Artworks"}))))

(clojure.core/defn- ser-encryption-mode [input] #:http.request.field{:value input, :shape "EncryptionMode"})

(clojure.core/defn- ser-jpg-or-png [input] #:http.request.field{:value input, :shape "JpgOrPng"})

(clojure.core/defn- ser-captions [input] (clojure.core/cond-> #:http.request.field{:value [], :shape "Captions", :type "structure"} (clojure.core/contains? input :merge-policy) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-caption-merge-policy (input :merge-policy)) #:http.request.field{:name "MergePolicy", :shape "CaptionMergePolicy", :deprecated true})) (clojure.core/contains? input :caption-sources) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-caption-sources (input :caption-sources)) #:http.request.field{:name "CaptionSources", :shape "CaptionSources", :deprecated true})) (clojure.core/contains? input :caption-formats) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-caption-formats (input :caption-formats)) #:http.request.field{:name "CaptionFormats", :shape "CaptionFormats"}))))

(clojure.core/defn- ser-keyframes-max-dist [input] #:http.request.field{:value input, :shape "KeyframesMaxDist"})

(clojure.core/defn- ser-time-offset [input] #:http.request.field{:value input, :shape "TimeOffset"})

(clojure.core/defn- ser-audio-channels [input] #:http.request.field{:value input, :shape "AudioChannels"})

(clojure.core/defn- ser-caption-formats [input] #:http.request.field{:value (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (clojure.core/merge (ser-caption-format coll) #:http.request.field{:shape "CaptionFormat"}))) input), :shape "CaptionFormats", :type "list", :max 4})

(clojure.core/defn- ser-job-watermark [input] (clojure.core/cond-> #:http.request.field{:value [], :shape "JobWatermark", :type "structure"} (clojure.core/contains? input :preset-watermark-id) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-preset-watermark-id (input :preset-watermark-id)) #:http.request.field{:name "PresetWatermarkId", :shape "PresetWatermarkId"})) (clojure.core/contains? input :input-key) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-watermark-key (input :input-key)) #:http.request.field{:name "InputKey", :shape "WatermarkKey"})) (clojure.core/contains? input :encryption) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-encryption (input :encryption)) #:http.request.field{:name "Encryption", :shape "Encryption"}))))

(clojure.core/defn- ser-pixels-or-percent [input] #:http.request.field{:value input, :shape "PixelsOrPercent"})

(clojure.core/defn- ser-caption-merge-policy [input] #:http.request.field{:value input, :shape "CaptionMergePolicy"})

(clojure.core/defn- ser-hls-content-protection-method [input] #:http.request.field{:value input, :shape "HlsContentProtectionMethod"})

(clojure.core/defn- ser-thumbnails [input] (clojure.core/cond-> #:http.request.field{:value [], :shape "Thumbnails", :type "structure"} (clojure.core/contains? input :format) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-jpg-or-png (input :format)) #:http.request.field{:name "Format", :shape "JpgOrPng"})) (clojure.core/contains? input :interval) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-digits (input :interval)) #:http.request.field{:name "Interval", :shape "Digits"})) (clojure.core/contains? input :resolution) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-thumbnail-resolution (input :resolution)) #:http.request.field{:name "Resolution", :shape "ThumbnailResolution"})) (clojure.core/contains? input :aspect-ratio) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-aspect-ratio (input :aspect-ratio)) #:http.request.field{:name "AspectRatio", :shape "AspectRatio"})) (clojure.core/contains? input :max-width) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-digits-or-auto (input :max-width)) #:http.request.field{:name "MaxWidth", :shape "DigitsOrAuto"})) (clojure.core/contains? input :max-height) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-digits-or-auto (input :max-height)) #:http.request.field{:name "MaxHeight", :shape "DigitsOrAuto"})) (clojure.core/contains? input :sizing-policy) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-sizing-policy (input :sizing-policy)) #:http.request.field{:name "SizingPolicy", :shape "SizingPolicy"})) (clojure.core/contains? input :padding-policy) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-padding-policy (input :padding-policy)) #:http.request.field{:name "PaddingPolicy", :shape "PaddingPolicy"}))))

(clojure.core/defn- ser-digits [input] #:http.request.field{:value input, :shape "Digits"})

(clojure.core/defn- ser-watermark-sizing-policy [input] #:http.request.field{:value input, :shape "WatermarkSizingPolicy"})

(clojure.core/defn- ser-resolution [input] #:http.request.field{:value input, :shape "Resolution"})

(clojure.core/defn- ser-artworks [input] #:http.request.field{:value (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (clojure.core/merge (ser-artwork coll) #:http.request.field{:shape "Artwork"}))) input), :shape "Artworks", :type "list"})

(clojure.core/defn- ser-video-bit-rate [input] #:http.request.field{:value input, :shape "VideoBitRate"})

(clojure.core/defn- ser-frame-rate [input] #:http.request.field{:value input, :shape "FrameRate"})

(clojure.core/defn- ser-opacity [input] #:http.request.field{:value input, :shape "Opacity"})

(clojure.core/defn- ser-time-span [input] (clojure.core/cond-> #:http.request.field{:value [], :shape "TimeSpan", :type "structure"} (clojure.core/contains? input :start-time) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-time (input :start-time)) #:http.request.field{:name "StartTime", :shape "Time"})) (clojure.core/contains? input :duration) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-time (input :duration)) #:http.request.field{:name "Duration", :shape "Time"}))))

(clojure.core/defn- ser-aspect-ratio [input] #:http.request.field{:value input, :shape "AspectRatio"})

(clojure.core/defn- ser-watermark-key [input] #:http.request.field{:value input, :shape "WatermarkKey"})

(clojure.core/defn- ser-one-to-512-string [input] #:http.request.field{:value input, :shape "OneTo512String"})

(clojure.core/defn- ser-zero-to-512-string [input] #:http.request.field{:value input, :shape "ZeroTo512String"})

(clojure.core/defn- ser-thumbnail-pattern [input] #:http.request.field{:value input, :shape "ThumbnailPattern"})

(clojure.core/defn- ser-pipeline-status [input] #:http.request.field{:value input, :shape "PipelineStatus"})

(clojure.core/defn- ser-user-metadata [input] #:http.request.field{:value (clojure.core/into [] (clojure.core/map (clojure.core/fn [[k v]] [(clojure.core/into (ser-string k) #:http.request.field{:map-info "key", :shape "String"}) (clojure.core/into (ser-string v) #:http.request.field{:map-info "value", :shape "String"})])) input), :shape "UserMetadata", :type "map"})

(clojure.core/defn- ser-ascending [input] #:http.request.field{:value input, :shape "Ascending"})

(clojure.core/defn- ser-detected-properties [input] (clojure.core/cond-> #:http.request.field{:value [], :shape "DetectedProperties", :type "structure"} (clojure.core/contains? input :width) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-nullable-integer (input :width)) #:http.request.field{:name "Width", :shape "NullableInteger"})) (clojure.core/contains? input :height) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-nullable-integer (input :height)) #:http.request.field{:name "Height", :shape "NullableInteger"})) (clojure.core/contains? input :frame-rate) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-float-string (input :frame-rate)) #:http.request.field{:name "FrameRate", :shape "FloatString"})) (clojure.core/contains? input :file-size) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-nullable-long (input :file-size)) #:http.request.field{:name "FileSize", :shape "NullableLong"})) (clojure.core/contains? input :duration-millis) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-nullable-long (input :duration-millis)) #:http.request.field{:name "DurationMillis", :shape "NullableLong"}))))

(clojure.core/defn- ser-pipeline-output-config [input] (clojure.core/cond-> #:http.request.field{:value [], :shape "PipelineOutputConfig", :type "structure"} (clojure.core/contains? input :bucket) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-bucket-name (input :bucket)) #:http.request.field{:name "Bucket", :shape "BucketName"})) (clojure.core/contains? input :storage-class) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-storage-class (input :storage-class)) #:http.request.field{:name "StorageClass", :shape "StorageClass"})) (clojure.core/contains? input :permissions) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-permissions (input :permissions)) #:http.request.field{:name "Permissions", :shape "Permissions"}))))

(clojure.core/defn- ser-key [input] #:http.request.field{:value input, :shape "Key"})

(clojure.core/defn- ser-sns-topics [input] #:http.request.field{:value (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (clojure.core/merge (ser-sns-topic coll) #:http.request.field{:shape "SnsTopic"}))) input), :shape "SnsTopics", :type "list", :max 30})

(clojure.core/defn- ser-role [input] #:http.request.field{:value input, :shape "Role"})

(clojure.core/defn- ser-interlaced [input] #:http.request.field{:value input, :shape "Interlaced"})

(clojure.core/defn- ser-max-frame-rate [input] #:http.request.field{:value input, :shape "MaxFrameRate"})

(clojure.core/defn- ser-audio-codec-options [input] (clojure.core/cond-> #:http.request.field{:value [], :shape "AudioCodecOptions", :type "structure"} (clojure.core/contains? input :profile) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-audio-codec-profile (input :profile)) #:http.request.field{:name "Profile", :shape "AudioCodecProfile"})) (clojure.core/contains? input :bit-depth) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-audio-bit-depth (input :bit-depth)) #:http.request.field{:name "BitDepth", :shape "AudioBitDepth"})) (clojure.core/contains? input :bit-order) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-audio-bit-order (input :bit-order)) #:http.request.field{:name "BitOrder", :shape "AudioBitOrder"})) (clojure.core/contains? input :signed) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-audio-signed (input :signed)) #:http.request.field{:name "Signed", :shape "AudioSigned"}))))

(clojure.core/defn- ser-float-string [input] #:http.request.field{:value input, :shape "FloatString"})

(clojure.core/defn- ser-nullable-long [input] #:http.request.field{:value input, :shape "NullableLong"})

(clojure.core/defn- ser-audio-sample-rate [input] #:http.request.field{:value input, :shape "AudioSampleRate"})

(clojure.core/defn- ser-audio-bit-depth [input] #:http.request.field{:value input, :shape "AudioBitDepth"})

(clojure.core/defn- ser-description [input] #:http.request.field{:value input, :shape "Description"})

(clojure.core/defn- ser-audio-packing-mode [input] #:http.request.field{:value input, :shape "AudioPackingMode"})

(clojure.core/defn- ser-audio-bit-order [input] #:http.request.field{:value input, :shape "AudioBitOrder"})

(clojure.core/defn- ser-hls-content-protection [input] (clojure.core/cond-> #:http.request.field{:value [], :shape "HlsContentProtection", :type "structure"} (clojure.core/contains? input :method) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-hls-content-protection-method (input :method)) #:http.request.field{:name "Method", :shape "HlsContentProtectionMethod"})) (clojure.core/contains? input :key) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-base-64-encoded-string (input :key)) #:http.request.field{:name "Key", :shape "Base64EncodedString"})) (clojure.core/contains? input :key-md-5) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-base-64-encoded-string (input :key-md-5)) #:http.request.field{:name "KeyMd5", :shape "Base64EncodedString"})) (clojure.core/contains? input :initialization-vector) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-zero-to-255-string (input :initialization-vector)) #:http.request.field{:name "InitializationVector", :shape "ZeroTo255String"})) (clojure.core/contains? input :license-acquisition-url) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-zero-to-512-string (input :license-acquisition-url)) #:http.request.field{:name "LicenseAcquisitionUrl", :shape "ZeroTo512String"})) (clojure.core/contains? input :key-storage-policy) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-key-storage-policy (input :key-storage-policy)) #:http.request.field{:name "KeyStoragePolicy", :shape "KeyStoragePolicy"}))))

(clojure.core/defn- ser-string [input] #:http.request.field{:value input, :shape "String"})

(clojure.core/defn- ser-caption-source [input] (clojure.core/cond-> #:http.request.field{:value [], :shape "CaptionSource", :type "structure"} (clojure.core/contains? input :key) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-long-key (input :key)) #:http.request.field{:name "Key", :shape "LongKey"})) (clojure.core/contains? input :language) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-key (input :language)) #:http.request.field{:name "Language", :shape "Key"})) (clojure.core/contains? input :time-offset) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-time-offset (input :time-offset)) #:http.request.field{:name "TimeOffset", :shape "TimeOffset"})) (clojure.core/contains? input :label) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-name (input :label)) #:http.request.field{:name "Label", :shape "Name"})) (clojure.core/contains? input :encryption) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-encryption (input :encryption)) #:http.request.field{:name "Encryption", :shape "Encryption"}))))

(clojure.core/defn- ser-digits-or-auto [input] #:http.request.field{:value input, :shape "DigitsOrAuto"})

(clojure.core/defn- ser-input-captions [input] (clojure.core/cond-> #:http.request.field{:value [], :shape "InputCaptions", :type "structure"} (clojure.core/contains? input :merge-policy) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-caption-merge-policy (input :merge-policy)) #:http.request.field{:name "MergePolicy", :shape "CaptionMergePolicy"})) (clojure.core/contains? input :caption-sources) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-caption-sources (input :caption-sources)) #:http.request.field{:name "CaptionSources", :shape "CaptionSources"}))))

(clojure.core/defn- ser-audio-parameters [input] (clojure.core/cond-> #:http.request.field{:value [], :shape "AudioParameters", :type "structure"} (clojure.core/contains? input :codec) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-audio-codec (input :codec)) #:http.request.field{:name "Codec", :shape "AudioCodec"})) (clojure.core/contains? input :sample-rate) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-audio-sample-rate (input :sample-rate)) #:http.request.field{:name "SampleRate", :shape "AudioSampleRate"})) (clojure.core/contains? input :bit-rate) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-audio-bit-rate (input :bit-rate)) #:http.request.field{:name "BitRate", :shape "AudioBitRate"})) (clojure.core/contains? input :channels) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-audio-channels (input :channels)) #:http.request.field{:name "Channels", :shape "AudioChannels"})) (clojure.core/contains? input :audio-packing-mode) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-audio-packing-mode (input :audio-packing-mode)) #:http.request.field{:name "AudioPackingMode", :shape "AudioPackingMode"})) (clojure.core/contains? input :codec-options) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-audio-codec-options (input :codec-options)) #:http.request.field{:name "CodecOptions", :shape "AudioCodecOptions"}))))

(clojure.core/defn- ser-access-control [input] #:http.request.field{:value input, :shape "AccessControl"})

(clojure.core/defn- ser-audio-codec-profile [input] #:http.request.field{:value input, :shape "AudioCodecProfile"})

(clojure.core/defn- ser-video-codec [input] #:http.request.field{:value input, :shape "VideoCodec"})

(clojure.core/defn- ser-vertical-align [input] #:http.request.field{:value input, :shape "VerticalAlign"})

(clojure.core/defn- ser-rotate [input] #:http.request.field{:value input, :shape "Rotate"})

(clojure.core/defn- ser-audio-codec [input] #:http.request.field{:value input, :shape "AudioCodec"})

(clojure.core/defn- ser-audio-signed [input] #:http.request.field{:value input, :shape "AudioSigned"})

(clojure.core/defn- ser-filename [input] #:http.request.field{:value input, :shape "Filename"})

(clojure.core/defn- ser-preset-watermarks [input] #:http.request.field{:value (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (clojure.core/merge (ser-preset-watermark coll) #:http.request.field{:shape "PresetWatermark"}))) input), :shape "PresetWatermarks", :type "list"})

(clojure.core/defn- ser-key-arn [input] #:http.request.field{:value input, :shape "KeyArn"})

(clojure.core/defn- ser-clip [input] (clojure.core/cond-> #:http.request.field{:value [], :shape "Clip", :type "structure", :deprecated true} (clojure.core/contains? input :time-span) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-time-span (input :time-span)) #:http.request.field{:name "TimeSpan", :shape "TimeSpan"}))))

(clojure.core/defn- ser-merge-policy [input] #:http.request.field{:value input, :shape "MergePolicy"})

(clojure.core/defn- ser-encryption [input] (clojure.core/cond-> #:http.request.field{:value [], :shape "Encryption", :type "structure"} (clojure.core/contains? input :mode) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-encryption-mode (input :mode)) #:http.request.field{:name "Mode", :shape "EncryptionMode"})) (clojure.core/contains? input :key) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-base-64-encoded-string (input :key)) #:http.request.field{:name "Key", :shape "Base64EncodedString"})) (clojure.core/contains? input :key-md-5) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-base-64-encoded-string (input :key-md-5)) #:http.request.field{:name "KeyMd5", :shape "Base64EncodedString"})) (clojure.core/contains? input :initialization-vector) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-zero-to-255-string (input :initialization-vector)) #:http.request.field{:name "InitializationVector", :shape "ZeroTo255String"}))))

(clojure.core/defn- ser-job-container [input] #:http.request.field{:value input, :shape "JobContainer"})

(clojure.core/defn- ser-preset-container [input] #:http.request.field{:value input, :shape "PresetContainer"})

(clojure.core/defn- ser-job-input [input] (clojure.core/cond-> #:http.request.field{:value [], :shape "JobInput", :type "structure"} (clojure.core/contains? input :resolution) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-resolution (input :resolution)) #:http.request.field{:name "Resolution", :shape "Resolution"})) (clojure.core/contains? input :frame-rate) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-frame-rate (input :frame-rate)) #:http.request.field{:name "FrameRate", :shape "FrameRate"})) (clojure.core/contains? input :time-span) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-time-span (input :time-span)) #:http.request.field{:name "TimeSpan", :shape "TimeSpan"})) (clojure.core/contains? input :aspect-ratio) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-aspect-ratio (input :aspect-ratio)) #:http.request.field{:name "AspectRatio", :shape "AspectRatio"})) (clojure.core/contains? input :detected-properties) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-detected-properties (input :detected-properties)) #:http.request.field{:name "DetectedProperties", :shape "DetectedProperties"})) (clojure.core/contains? input :key) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-long-key (input :key)) #:http.request.field{:name "Key", :shape "LongKey"})) (clojure.core/contains? input :interlaced) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-interlaced (input :interlaced)) #:http.request.field{:name "Interlaced", :shape "Interlaced"})) (clojure.core/contains? input :container) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-job-container (input :container)) #:http.request.field{:name "Container", :shape "JobContainer"})) (clojure.core/contains? input :input-captions) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-input-captions (input :input-captions)) #:http.request.field{:name "InputCaptions", :shape "InputCaptions"})) (clojure.core/contains? input :encryption) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-encryption (input :encryption)) #:http.request.field{:name "Encryption", :shape "Encryption"}))))

(clojure.core/defn- ser-thumbnail-resolution [input] #:http.request.field{:value input, :shape "ThumbnailResolution"})

(clojure.core/defn- ser-nullable-integer [input] #:http.request.field{:value input, :shape "NullableInteger"})

(clojure.core/defn- ser-key-id-guid [input] #:http.request.field{:value input, :shape "KeyIdGuid"})

(clojure.core/defn- ser-target [input] #:http.request.field{:value input, :shape "Target"})

(clojure.core/defn- ser-name [input] #:http.request.field{:value input, :shape "Name"})

(clojure.core/defn- ser-create-job-outputs [input] #:http.request.field{:value (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (clojure.core/merge (ser-create-job-output coll) #:http.request.field{:shape "CreateJobOutput"}))) input), :shape "CreateJobOutputs", :type "list", :max 30})

(clojure.core/defn- ser-preset-watermark-id [input] #:http.request.field{:value input, :shape "PresetWatermarkId"})

(clojure.core/defn- ser-storage-class [input] #:http.request.field{:value input, :shape "StorageClass"})

(clojure.core/defn- ser-grantee [input] #:http.request.field{:value input, :shape "Grantee"})

(clojure.core/defn- ser-caption-format-format [input] #:http.request.field{:value input, :shape "CaptionFormatFormat"})

(clojure.core/defn- ser-non-empty-base-64-encoded-string [input] #:http.request.field{:value input, :shape "NonEmptyBase64EncodedString"})

(clojure.core/defn- ser-preset-watermark [input] (clojure.core/cond-> #:http.request.field{:value [], :shape "PresetWatermark", :type "structure"} (clojure.core/contains? input :sizing-policy) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-watermark-sizing-policy (input :sizing-policy)) #:http.request.field{:name "SizingPolicy", :shape "WatermarkSizingPolicy"})) (clojure.core/contains? input :opacity) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-opacity (input :opacity)) #:http.request.field{:name "Opacity", :shape "Opacity"})) (clojure.core/contains? input :horizontal-offset) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-pixels-or-percent (input :horizontal-offset)) #:http.request.field{:name "HorizontalOffset", :shape "PixelsOrPercent"})) (clojure.core/contains? input :vertical-offset) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-pixels-or-percent (input :vertical-offset)) #:http.request.field{:name "VerticalOffset", :shape "PixelsOrPercent"})) (clojure.core/contains? input :max-height) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-pixels-or-percent (input :max-height)) #:http.request.field{:name "MaxHeight", :shape "PixelsOrPercent"})) (clojure.core/contains? input :vertical-align) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-vertical-align (input :vertical-align)) #:http.request.field{:name "VerticalAlign", :shape "VerticalAlign"})) (clojure.core/contains? input :target) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-target (input :target)) #:http.request.field{:name "Target", :shape "Target"})) (clojure.core/contains? input :max-width) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-pixels-or-percent (input :max-width)) #:http.request.field{:name "MaxWidth", :shape "PixelsOrPercent"})) (clojure.core/contains? input :id) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-preset-watermark-id (input :id)) #:http.request.field{:name "Id", :shape "PresetWatermarkId"})) (clojure.core/contains? input :horizontal-align) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-horizontal-align (input :horizontal-align)) #:http.request.field{:name "HorizontalAlign", :shape "HorizontalAlign"}))))

(clojure.core/defn- ser-bucket-name [input] #:http.request.field{:value input, :shape "BucketName"})

(clojure.core/defn- ser-audio-bit-rate [input] #:http.request.field{:value input, :shape "AudioBitRate"})

(clojure.core/defn- ser-notifications [input] (clojure.core/cond-> #:http.request.field{:value [], :shape "Notifications", :type "structure"} (clojure.core/contains? input :progressing) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-sns-topic (input :progressing)) #:http.request.field{:name "Progressing", :shape "SnsTopic"})) (clojure.core/contains? input :completed) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-sns-topic (input :completed)) #:http.request.field{:name "Completed", :shape "SnsTopic"})) (clojure.core/contains? input :warning) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-sns-topic (input :warning)) #:http.request.field{:name "Warning", :shape "SnsTopic"})) (clojure.core/contains? input :error) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-sns-topic (input :error)) #:http.request.field{:name "Error", :shape "SnsTopic"}))))

(clojure.core/defn- ser-job-inputs [input] #:http.request.field{:value (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (clojure.core/merge (ser-job-input coll) #:http.request.field{:shape "JobInput"}))) input), :shape "JobInputs", :type "list", :max 200})

(clojure.core/defn- ser-caption-format [input] (clojure.core/cond-> #:http.request.field{:value [], :shape "CaptionFormat", :type "structure"} (clojure.core/contains? input :format) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-caption-format-format (input :format)) #:http.request.field{:name "Format", :shape "CaptionFormatFormat"})) (clojure.core/contains? input :pattern) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-caption-format-pattern (input :pattern)) #:http.request.field{:name "Pattern", :shape "CaptionFormatPattern"})) (clojure.core/contains? input :encryption) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-encryption (input :encryption)) #:http.request.field{:name "Encryption", :shape "Encryption"}))))

(clojure.core/defn- ser-base-64-encoded-string [input] #:http.request.field{:value input, :shape "Base64EncodedString"})

(clojure.core/defn- ser-padding-policy [input] #:http.request.field{:value input, :shape "PaddingPolicy"})

(clojure.core/defn- ser-id [input] #:http.request.field{:value input, :shape "Id"})

(clojure.core/defn- ser-time [input] #:http.request.field{:value input, :shape "Time"})

(clojure.core/defn- ser-long-key [input] #:http.request.field{:value input, :shape "LongKey"})

(clojure.core/defn- ser-zero-to-255-string [input] #:http.request.field{:value input, :shape "ZeroTo255String"})

(clojure.core/defn- ser-create-job-playlist [input] (clojure.core/cond-> #:http.request.field{:value [], :shape "CreateJobPlaylist", :type "structure"} (clojure.core/contains? input :name) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-filename (input :name)) #:http.request.field{:name "Name", :shape "Filename"})) (clojure.core/contains? input :format) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-playlist-format (input :format)) #:http.request.field{:name "Format", :shape "PlaylistFormat"})) (clojure.core/contains? input :output-keys) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-output-keys (input :output-keys)) #:http.request.field{:name "OutputKeys", :shape "OutputKeys"})) (clojure.core/contains? input :hls-content-protection) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-hls-content-protection (input :hls-content-protection)) #:http.request.field{:name "HlsContentProtection", :shape "HlsContentProtection"})) (clojure.core/contains? input :play-ready-drm) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-play-ready-drm (input :play-ready-drm)) #:http.request.field{:name "PlayReadyDrm", :shape "PlayReadyDrm"}))))

(clojure.core/defn- ser-create-job-playlists [input] #:http.request.field{:value (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (clojure.core/merge (ser-create-job-playlist coll) #:http.request.field{:shape "CreateJobPlaylist"}))) input), :shape "CreateJobPlaylists", :type "list", :max 30})

(clojure.core/defn- ser-caption-format-pattern [input] #:http.request.field{:value input, :shape "CaptionFormatPattern"})

(clojure.core/defn- ser-create-job-output [input] (clojure.core/cond-> #:http.request.field{:value [], :shape "CreateJobOutput", :type "structure"} (clojure.core/contains? input :composition) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-composition (input :composition)) #:http.request.field{:name "Composition", :shape "Composition", :deprecated true})) (clojure.core/contains? input :captions) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-captions (input :captions)) #:http.request.field{:name "Captions", :shape "Captions"})) (clojure.core/contains? input :thumbnail-encryption) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-encryption (input :thumbnail-encryption)) #:http.request.field{:name "ThumbnailEncryption", :shape "Encryption"})) (clojure.core/contains? input :thumbnail-pattern) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-thumbnail-pattern (input :thumbnail-pattern)) #:http.request.field{:name "ThumbnailPattern", :shape "ThumbnailPattern"})) (clojure.core/contains? input :preset-id) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-id (input :preset-id)) #:http.request.field{:name "PresetId", :shape "Id"})) (clojure.core/contains? input :key) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-key (input :key)) #:http.request.field{:name "Key", :shape "Key"})) (clojure.core/contains? input :watermarks) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-job-watermarks (input :watermarks)) #:http.request.field{:name "Watermarks", :shape "JobWatermarks"})) (clojure.core/contains? input :rotate) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-rotate (input :rotate)) #:http.request.field{:name "Rotate", :shape "Rotate"})) (clojure.core/contains? input :album-art) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-job-album-art (input :album-art)) #:http.request.field{:name "AlbumArt", :shape "JobAlbumArt"})) (clojure.core/contains? input :encryption) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-encryption (input :encryption)) #:http.request.field{:name "Encryption", :shape "Encryption"})) (clojure.core/contains? input :segment-duration) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-float-string (input :segment-duration)) #:http.request.field{:name "SegmentDuration", :shape "FloatString"}))))

(clojure.core/defn- ser-horizontal-align [input] #:http.request.field{:value input, :shape "HorizontalAlign"})

(clojure.core/defn- req-update-pipeline-status-request [input] (clojure.core/cond-> #:http.request.configuration{:uri [(clojure.core/into (ser-id (input :id)) #:http.request.field{:name "Id", :shape "Id", :location "uri", :location-name "Id"})], :body [(clojure.core/into (ser-pipeline-status (input :status)) #:http.request.field{:name "Status", :shape "PipelineStatus"})]}))

(clojure.core/defn- req-create-preset-request [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (ser-name (input :name)) #:http.request.field{:name "Name", :shape "Name"}) (clojure.core/into (ser-preset-container (input :container)) #:http.request.field{:name "Container", :shape "PresetContainer"})]} (clojure.core/contains? input :description) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-description (input :description)) #:http.request.field{:name "Description", :shape "Description"})) (clojure.core/contains? input :video) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-video-parameters (input :video)) #:http.request.field{:name "Video", :shape "VideoParameters"})) (clojure.core/contains? input :audio) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-audio-parameters (input :audio)) #:http.request.field{:name "Audio", :shape "AudioParameters"})) (clojure.core/contains? input :thumbnails) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-thumbnails (input :thumbnails)) #:http.request.field{:name "Thumbnails", :shape "Thumbnails"}))))

(clojure.core/defn- req-list-pipelines-request [input] (clojure.core/cond-> {} (clojure.core/contains? input :ascending) (clojure.core/update-in [:http.request.configuration/querystring] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-ascending (input :ascending)) #:http.request.field{:name "Ascending", :shape "Ascending", :location "querystring", :location-name "Ascending"})) (clojure.core/contains? input :page-token) (clojure.core/update-in [:http.request.configuration/querystring] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-id (input :page-token)) #:http.request.field{:name "PageToken", :shape "Id", :location "querystring", :location-name "PageToken"}))))

(clojure.core/defn- req-create-pipeline-request [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (ser-name (input :name)) #:http.request.field{:name "Name", :shape "Name"}) (clojure.core/into (ser-bucket-name (input :input-bucket)) #:http.request.field{:name "InputBucket", :shape "BucketName"}) (clojure.core/into (ser-role (input :role)) #:http.request.field{:name "Role", :shape "Role"})]} (clojure.core/contains? input :output-bucket) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-bucket-name (input :output-bucket)) #:http.request.field{:name "OutputBucket", :shape "BucketName"})) (clojure.core/contains? input :aws-kms-key-arn) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-key-arn (input :aws-kms-key-arn)) #:http.request.field{:name "AwsKmsKeyArn", :shape "KeyArn"})) (clojure.core/contains? input :notifications) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-notifications (input :notifications)) #:http.request.field{:name "Notifications", :shape "Notifications"})) (clojure.core/contains? input :content-config) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-pipeline-output-config (input :content-config)) #:http.request.field{:name "ContentConfig", :shape "PipelineOutputConfig"})) (clojure.core/contains? input :thumbnail-config) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-pipeline-output-config (input :thumbnail-config)) #:http.request.field{:name "ThumbnailConfig", :shape "PipelineOutputConfig"}))))

(clojure.core/defn- req-cancel-job-request [input] (clojure.core/cond-> #:http.request.configuration{:uri [(clojure.core/into (ser-id (input :id)) #:http.request.field{:name "Id", :shape "Id", :location "uri", :location-name "Id"})]}))

(clojure.core/defn- req-delete-pipeline-request [input] (clojure.core/cond-> #:http.request.configuration{:uri [(clojure.core/into (ser-id (input :id)) #:http.request.field{:name "Id", :shape "Id", :location "uri", :location-name "Id"})]}))

(clojure.core/defn- req-list-jobs-by-status-request [input] (clojure.core/cond-> #:http.request.configuration{:uri [(clojure.core/into (ser-job-status (input :status)) #:http.request.field{:name "Status", :shape "JobStatus", :location "uri", :location-name "Status"})]} (clojure.core/contains? input :ascending) (clojure.core/update-in [:http.request.configuration/querystring] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-ascending (input :ascending)) #:http.request.field{:name "Ascending", :shape "Ascending", :location "querystring", :location-name "Ascending"})) (clojure.core/contains? input :page-token) (clojure.core/update-in [:http.request.configuration/querystring] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-id (input :page-token)) #:http.request.field{:name "PageToken", :shape "Id", :location "querystring", :location-name "PageToken"}))))

(clojure.core/defn- req-create-job-request [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (ser-id (input :pipeline-id)) #:http.request.field{:name "PipelineId", :shape "Id"})]} (clojure.core/contains? input :input) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-job-input (input :input)) #:http.request.field{:name "Input", :shape "JobInput"})) (clojure.core/contains? input :inputs) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-job-inputs (input :inputs)) #:http.request.field{:name "Inputs", :shape "JobInputs"})) (clojure.core/contains? input :output) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-create-job-output (input :output)) #:http.request.field{:name "Output", :shape "CreateJobOutput"})) (clojure.core/contains? input :outputs) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-create-job-outputs (input :outputs)) #:http.request.field{:name "Outputs", :shape "CreateJobOutputs"})) (clojure.core/contains? input :output-key-prefix) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-key (input :output-key-prefix)) #:http.request.field{:name "OutputKeyPrefix", :shape "Key"})) (clojure.core/contains? input :playlists) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-create-job-playlists (input :playlists)) #:http.request.field{:name "Playlists", :shape "CreateJobPlaylists"})) (clojure.core/contains? input :user-metadata) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-user-metadata (input :user-metadata)) #:http.request.field{:name "UserMetadata", :shape "UserMetadata"}))))

(clojure.core/defn- req-list-presets-request [input] (clojure.core/cond-> {} (clojure.core/contains? input :ascending) (clojure.core/update-in [:http.request.configuration/querystring] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-ascending (input :ascending)) #:http.request.field{:name "Ascending", :shape "Ascending", :location "querystring", :location-name "Ascending"})) (clojure.core/contains? input :page-token) (clojure.core/update-in [:http.request.configuration/querystring] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-id (input :page-token)) #:http.request.field{:name "PageToken", :shape "Id", :location "querystring", :location-name "PageToken"}))))

(clojure.core/defn- req-read-job-request [input] (clojure.core/cond-> #:http.request.configuration{:uri [(clojure.core/into (ser-id (input :id)) #:http.request.field{:name "Id", :shape "Id", :location "uri", :location-name "Id"})]}))

(clojure.core/defn- req-read-preset-request [input] (clojure.core/cond-> #:http.request.configuration{:uri [(clojure.core/into (ser-id (input :id)) #:http.request.field{:name "Id", :shape "Id", :location "uri", :location-name "Id"})]}))

(clojure.core/defn- req-update-pipeline-notifications-request [input] (clojure.core/cond-> #:http.request.configuration{:uri [(clojure.core/into (ser-id (input :id)) #:http.request.field{:name "Id", :shape "Id", :location "uri", :location-name "Id"})], :body [(clojure.core/into (ser-notifications (input :notifications)) #:http.request.field{:name "Notifications", :shape "Notifications"})]}))

(clojure.core/defn- req-update-pipeline-request [input] (clojure.core/cond-> #:http.request.configuration{:uri [(clojure.core/into (ser-id (input :id)) #:http.request.field{:name "Id", :shape "Id", :location "uri", :location-name "Id"})]} (clojure.core/contains? input :name) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-name (input :name)) #:http.request.field{:name "Name", :shape "Name"})) (clojure.core/contains? input :input-bucket) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-bucket-name (input :input-bucket)) #:http.request.field{:name "InputBucket", :shape "BucketName"})) (clojure.core/contains? input :role) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-role (input :role)) #:http.request.field{:name "Role", :shape "Role"})) (clojure.core/contains? input :aws-kms-key-arn) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-key-arn (input :aws-kms-key-arn)) #:http.request.field{:name "AwsKmsKeyArn", :shape "KeyArn"})) (clojure.core/contains? input :notifications) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-notifications (input :notifications)) #:http.request.field{:name "Notifications", :shape "Notifications"})) (clojure.core/contains? input :content-config) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-pipeline-output-config (input :content-config)) #:http.request.field{:name "ContentConfig", :shape "PipelineOutputConfig"})) (clojure.core/contains? input :thumbnail-config) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-pipeline-output-config (input :thumbnail-config)) #:http.request.field{:name "ThumbnailConfig", :shape "PipelineOutputConfig"}))))

(clojure.core/defn- req-read-pipeline-request [input] (clojure.core/cond-> #:http.request.configuration{:uri [(clojure.core/into (ser-id (input :id)) #:http.request.field{:name "Id", :shape "Id", :location "uri", :location-name "Id"})]}))

(clojure.core/defn- req-list-jobs-by-pipeline-request [input] (clojure.core/cond-> #:http.request.configuration{:uri [(clojure.core/into (ser-id (input :pipeline-id)) #:http.request.field{:name "PipelineId", :shape "Id", :location "uri", :location-name "PipelineId"})]} (clojure.core/contains? input :ascending) (clojure.core/update-in [:http.request.configuration/querystring] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-ascending (input :ascending)) #:http.request.field{:name "Ascending", :shape "Ascending", :location "querystring", :location-name "Ascending"})) (clojure.core/contains? input :page-token) (clojure.core/update-in [:http.request.configuration/querystring] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-id (input :page-token)) #:http.request.field{:name "PageToken", :shape "Id", :location "querystring", :location-name "PageToken"}))))

(clojure.core/defn- req-delete-preset-request [input] (clojure.core/cond-> #:http.request.configuration{:uri [(clojure.core/into (ser-id (input :id)) #:http.request.field{:name "Id", :shape "Id", :location "uri", :location-name "Id"})]}))

(clojure.core/defn- req-test-role-request [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (ser-role (input :role)) #:http.request.field{:name "Role", :shape "Role"}) (clojure.core/into (ser-bucket-name (input :input-bucket)) #:http.request.field{:name "InputBucket", :shape "BucketName"}) (clojure.core/into (ser-bucket-name (input :output-bucket)) #:http.request.field{:name "OutputBucket", :shape "BucketName"}) (clojure.core/into (ser-sns-topics (input :topics)) #:http.request.field{:name "Topics", :shape "SnsTopics"})]}))

(clojure.spec.alpha/def :portkey.aws.elastictranscoder.-2012-09-25/fixed-gop (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__27882__auto__] (clojure.core/re-matches #"(^true$)|(^false$)" s__27882__auto__))))

(clojure.spec.alpha/def :portkey.aws.elastictranscoder.-2012-09-25.update-pipeline-status-request/status (clojure.spec.alpha/and :portkey.aws.elastictranscoder.-2012-09-25/pipeline-status))
(clojure.spec.alpha/def :portkey.aws.elastictranscoder.-2012-09-25/update-pipeline-status-request (clojure.spec.alpha/keys :req-un [:portkey.aws.elastictranscoder.-2012-09-25/id :portkey.aws.elastictranscoder.-2012-09-25.update-pipeline-status-request/status] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.elastictranscoder.-2012-09-25.create-preset-request/container (clojure.spec.alpha/and :portkey.aws.elastictranscoder.-2012-09-25/preset-container))
(clojure.spec.alpha/def :portkey.aws.elastictranscoder.-2012-09-25.create-preset-request/video (clojure.spec.alpha/and :portkey.aws.elastictranscoder.-2012-09-25/video-parameters))
(clojure.spec.alpha/def :portkey.aws.elastictranscoder.-2012-09-25.create-preset-request/audio (clojure.spec.alpha/and :portkey.aws.elastictranscoder.-2012-09-25/audio-parameters))
(clojure.spec.alpha/def :portkey.aws.elastictranscoder.-2012-09-25/create-preset-request (clojure.spec.alpha/keys :req-un [:portkey.aws.elastictranscoder.-2012-09-25/name :portkey.aws.elastictranscoder.-2012-09-25.create-preset-request/container] :opt-un [:portkey.aws.elastictranscoder.-2012-09-25/description :portkey.aws.elastictranscoder.-2012-09-25.create-preset-request/video :portkey.aws.elastictranscoder.-2012-09-25.create-preset-request/audio :portkey.aws.elastictranscoder.-2012-09-25/thumbnails]))

(clojure.spec.alpha/def :portkey.aws.elastictranscoder.-2012-09-25.artwork/input-key (clojure.spec.alpha/and :portkey.aws.elastictranscoder.-2012-09-25/watermark-key))
(clojure.spec.alpha/def :portkey.aws.elastictranscoder.-2012-09-25.artwork/max-width (clojure.spec.alpha/and :portkey.aws.elastictranscoder.-2012-09-25/digits-or-auto))
(clojure.spec.alpha/def :portkey.aws.elastictranscoder.-2012-09-25.artwork/max-height (clojure.spec.alpha/and :portkey.aws.elastictranscoder.-2012-09-25/digits-or-auto))
(clojure.spec.alpha/def :portkey.aws.elastictranscoder.-2012-09-25.artwork/album-art-format (clojure.spec.alpha/and :portkey.aws.elastictranscoder.-2012-09-25/jpg-or-png))
(clojure.spec.alpha/def :portkey.aws.elastictranscoder.-2012-09-25/artwork (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.elastictranscoder.-2012-09-25.artwork/input-key :portkey.aws.elastictranscoder.-2012-09-25.artwork/max-width :portkey.aws.elastictranscoder.-2012-09-25.artwork/max-height :portkey.aws.elastictranscoder.-2012-09-25/sizing-policy :portkey.aws.elastictranscoder.-2012-09-25/padding-policy :portkey.aws.elastictranscoder.-2012-09-25.artwork/album-art-format :portkey.aws.elastictranscoder.-2012-09-25/encryption]))

(clojure.spec.alpha/def :portkey.aws.elastictranscoder.-2012-09-25/sns-topic (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__27882__auto__] (clojure.core/re-matches #"(^$)|(^arn:aws:sns:.*:\w{12}:.+$)" s__27882__auto__))))

(clojure.spec.alpha/def :portkey.aws.elastictranscoder.-2012-09-25/caption-sources (clojure.spec.alpha/coll-of :portkey.aws.elastictranscoder.-2012-09-25/caption-source :max-count 20))

(clojure.spec.alpha/def :portkey.aws.elastictranscoder.-2012-09-25/exception-messages (clojure.spec.alpha/coll-of :portkey.aws.elastictranscoder.-2012-09-25/string))

(clojure.spec.alpha/def :portkey.aws.elastictranscoder.-2012-09-25/presets (clojure.spec.alpha/coll-of :portkey.aws.elastictranscoder.-2012-09-25/preset))

(clojure.spec.alpha/def :portkey.aws.elastictranscoder.-2012-09-25/update-pipeline-status-response (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.elastictranscoder.-2012-09-25/pipeline]))

(clojure.spec.alpha/def :portkey.aws.elastictranscoder.-2012-09-25/permissions (clojure.spec.alpha/coll-of :portkey.aws.elastictranscoder.-2012-09-25/permission :max-count 30))

(clojure.spec.alpha/def :portkey.aws.elastictranscoder.-2012-09-25/sizing-policy (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__27882__auto__] (clojure.core/re-matches #"(^Fit$)|(^Fill$)|(^Stretch$)|(^Keep$)|(^ShrinkToFit$)|(^ShrinkToFill$)" s__27882__auto__))))

(clojure.spec.alpha/def :portkey.aws.elastictranscoder.-2012-09-25/create-pipeline-response (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.elastictranscoder.-2012-09-25/pipeline :portkey.aws.elastictranscoder.-2012-09-25/warnings]))

(clojure.spec.alpha/def :portkey.aws.elastictranscoder.-2012-09-25/codec-options (clojure.spec.alpha/map-of :portkey.aws.elastictranscoder.-2012-09-25/codec-option :portkey.aws.elastictranscoder.-2012-09-25/codec-option))

(clojure.spec.alpha/def :portkey.aws.elastictranscoder.-2012-09-25.play-ready-drm/format (clojure.spec.alpha/and :portkey.aws.elastictranscoder.-2012-09-25/play-ready-drm-format-string))
(clojure.spec.alpha/def :portkey.aws.elastictranscoder.-2012-09-25.play-ready-drm/key (clojure.spec.alpha/and :portkey.aws.elastictranscoder.-2012-09-25/non-empty-base-64-encoded-string))
(clojure.spec.alpha/def :portkey.aws.elastictranscoder.-2012-09-25.play-ready-drm/key-md-5 (clojure.spec.alpha/and :portkey.aws.elastictranscoder.-2012-09-25/non-empty-base-64-encoded-string))
(clojure.spec.alpha/def :portkey.aws.elastictranscoder.-2012-09-25.play-ready-drm/key-id (clojure.spec.alpha/and :portkey.aws.elastictranscoder.-2012-09-25/key-id-guid))
(clojure.spec.alpha/def :portkey.aws.elastictranscoder.-2012-09-25.play-ready-drm/initialization-vector (clojure.spec.alpha/and :portkey.aws.elastictranscoder.-2012-09-25/zero-to-255-string))
(clojure.spec.alpha/def :portkey.aws.elastictranscoder.-2012-09-25.play-ready-drm/license-acquisition-url (clojure.spec.alpha/and :portkey.aws.elastictranscoder.-2012-09-25/one-to-512-string))
(clojure.spec.alpha/def :portkey.aws.elastictranscoder.-2012-09-25/play-ready-drm (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.elastictranscoder.-2012-09-25.play-ready-drm/format :portkey.aws.elastictranscoder.-2012-09-25.play-ready-drm/key :portkey.aws.elastictranscoder.-2012-09-25.play-ready-drm/key-md-5 :portkey.aws.elastictranscoder.-2012-09-25.play-ready-drm/key-id :portkey.aws.elastictranscoder.-2012-09-25.play-ready-drm/initialization-vector :portkey.aws.elastictranscoder.-2012-09-25.play-ready-drm/license-acquisition-url]))

(clojure.spec.alpha/def :portkey.aws.elastictranscoder.-2012-09-25/codec-option (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__27880__auto__] (clojure.core/<= 1 (clojure.core/count s__27880__auto__))) (clojure.core/fn [s__27881__auto__] (clojure.core/< (clojure.core/count s__27881__auto__) 255))))

(clojure.spec.alpha/def :portkey.aws.elastictranscoder.-2012-09-25/cancel-job-response (clojure.spec.alpha/keys :req-un [] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.elastictranscoder.-2012-09-25/validation-exception (clojure.spec.alpha/keys :req-un [] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.elastictranscoder.-2012-09-25/job-status (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__27882__auto__] (clojure.core/re-matches #"(^Submitted$)|(^Progressing$)|(^Complete$)|(^Canceled$)|(^Error$)" s__27882__auto__))))

(clojure.spec.alpha/def :portkey.aws.elastictranscoder.-2012-09-25/access-controls (clojure.spec.alpha/coll-of :portkey.aws.elastictranscoder.-2012-09-25/access-control :max-count 30))

(clojure.spec.alpha/def :portkey.aws.elastictranscoder.-2012-09-25/output-keys (clojure.spec.alpha/coll-of :portkey.aws.elastictranscoder.-2012-09-25/key :max-count 30))

(clojure.spec.alpha/def :portkey.aws.elastictranscoder.-2012-09-25.video-parameters/codec (clojure.spec.alpha/and :portkey.aws.elastictranscoder.-2012-09-25/video-codec))
(clojure.spec.alpha/def :portkey.aws.elastictranscoder.-2012-09-25.video-parameters/bit-rate (clojure.spec.alpha/and :portkey.aws.elastictranscoder.-2012-09-25/video-bit-rate))
(clojure.spec.alpha/def :portkey.aws.elastictranscoder.-2012-09-25.video-parameters/watermarks (clojure.spec.alpha/and :portkey.aws.elastictranscoder.-2012-09-25/preset-watermarks))
(clojure.spec.alpha/def :portkey.aws.elastictranscoder.-2012-09-25.video-parameters/max-height (clojure.spec.alpha/and :portkey.aws.elastictranscoder.-2012-09-25/digits-or-auto))
(clojure.spec.alpha/def :portkey.aws.elastictranscoder.-2012-09-25.video-parameters/display-aspect-ratio (clojure.spec.alpha/and :portkey.aws.elastictranscoder.-2012-09-25/aspect-ratio))
(clojure.spec.alpha/def :portkey.aws.elastictranscoder.-2012-09-25.video-parameters/max-width (clojure.spec.alpha/and :portkey.aws.elastictranscoder.-2012-09-25/digits-or-auto))
(clojure.spec.alpha/def :portkey.aws.elastictranscoder.-2012-09-25/video-parameters (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.elastictranscoder.-2012-09-25/fixed-gop :portkey.aws.elastictranscoder.-2012-09-25/sizing-policy :portkey.aws.elastictranscoder.-2012-09-25/codec-options :portkey.aws.elastictranscoder.-2012-09-25.video-parameters/codec :portkey.aws.elastictranscoder.-2012-09-25.video-parameters/bit-rate :portkey.aws.elastictranscoder.-2012-09-25/keyframes-max-dist :portkey.aws.elastictranscoder.-2012-09-25/resolution :portkey.aws.elastictranscoder.-2012-09-25/frame-rate :portkey.aws.elastictranscoder.-2012-09-25/aspect-ratio :portkey.aws.elastictranscoder.-2012-09-25/max-frame-rate :portkey.aws.elastictranscoder.-2012-09-25.video-parameters/watermarks :portkey.aws.elastictranscoder.-2012-09-25.video-parameters/max-height :portkey.aws.elastictranscoder.-2012-09-25.video-parameters/display-aspect-ratio :portkey.aws.elastictranscoder.-2012-09-25.video-parameters/max-width :portkey.aws.elastictranscoder.-2012-09-25/padding-policy]))

(clojure.spec.alpha/def :portkey.aws.elastictranscoder.-2012-09-25.list-pipelines-request/page-token (clojure.spec.alpha/and :portkey.aws.elastictranscoder.-2012-09-25/id))
(clojure.spec.alpha/def :portkey.aws.elastictranscoder.-2012-09-25/list-pipelines-request (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.elastictranscoder.-2012-09-25/ascending :portkey.aws.elastictranscoder.-2012-09-25.list-pipelines-request/page-token]))

(clojure.spec.alpha/def :portkey.aws.elastictranscoder.-2012-09-25/playlist-format (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__27882__auto__] (clojure.core/re-matches #"(^HLSv3$)|(^HLSv4$)|(^Smooth$)|(^MPEG-DASH$)" s__27882__auto__))))

(clojure.spec.alpha/def :portkey.aws.elastictranscoder.-2012-09-25/warnings (clojure.spec.alpha/coll-of :portkey.aws.elastictranscoder.-2012-09-25/warning))

(clojure.spec.alpha/def :portkey.aws.elastictranscoder.-2012-09-25/job-watermarks (clojure.spec.alpha/coll-of :portkey.aws.elastictranscoder.-2012-09-25/job-watermark))

(clojure.spec.alpha/def :portkey.aws.elastictranscoder.-2012-09-25/composition (clojure.spec.alpha/coll-of :portkey.aws.elastictranscoder.-2012-09-25/clip))

(clojure.spec.alpha/def :portkey.aws.elastictranscoder.-2012-09-25/playlists (clojure.spec.alpha/coll-of :portkey.aws.elastictranscoder.-2012-09-25/playlist))

(clojure.spec.alpha/def :portkey.aws.elastictranscoder.-2012-09-25/play-ready-drm-format-string (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__27882__auto__] (clojure.core/re-matches #"(^microsoft$)|(^discretix-3.0$)" s__27882__auto__))))

(clojure.spec.alpha/def :portkey.aws.elastictranscoder.-2012-09-25.permission/access (clojure.spec.alpha/and :portkey.aws.elastictranscoder.-2012-09-25/access-controls))
(clojure.spec.alpha/def :portkey.aws.elastictranscoder.-2012-09-25/permission (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.elastictranscoder.-2012-09-25/grantee-type :portkey.aws.elastictranscoder.-2012-09-25/grantee :portkey.aws.elastictranscoder.-2012-09-25.permission/access]))

(clojure.spec.alpha/def :portkey.aws.elastictranscoder.-2012-09-25/key-storage-policy (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__27882__auto__] (clojure.core/re-matches #"(^NoStore$)|(^WithVariantPlaylists$)" s__27882__auto__))))

(clojure.spec.alpha/def :portkey.aws.elastictranscoder.-2012-09-25/grantee-type (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__27882__auto__] (clojure.core/re-matches #"(^Canonical$)|(^Email$)|(^Group$)" s__27882__auto__))))

(clojure.spec.alpha/def :portkey.aws.elastictranscoder.-2012-09-25.job-album-art/artwork (clojure.spec.alpha/and :portkey.aws.elastictranscoder.-2012-09-25/artworks))
(clojure.spec.alpha/def :portkey.aws.elastictranscoder.-2012-09-25/job-album-art (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.elastictranscoder.-2012-09-25/merge-policy :portkey.aws.elastictranscoder.-2012-09-25.job-album-art/artwork]))

(clojure.spec.alpha/def :portkey.aws.elastictranscoder.-2012-09-25/encryption-mode (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__27882__auto__] (clojure.core/re-matches #"(^s3$)|(^s3-aws-kms$)|(^aes-cbc-pkcs7$)|(^aes-ctr$)|(^aes-gcm$)" s__27882__auto__))))

(clojure.spec.alpha/def :portkey.aws.elastictranscoder.-2012-09-25.create-pipeline-request/input-bucket (clojure.spec.alpha/and :portkey.aws.elastictranscoder.-2012-09-25/bucket-name))
(clojure.spec.alpha/def :portkey.aws.elastictranscoder.-2012-09-25.create-pipeline-request/output-bucket (clojure.spec.alpha/and :portkey.aws.elastictranscoder.-2012-09-25/bucket-name))
(clojure.spec.alpha/def :portkey.aws.elastictranscoder.-2012-09-25.create-pipeline-request/aws-kms-key-arn (clojure.spec.alpha/and :portkey.aws.elastictranscoder.-2012-09-25/key-arn))
(clojure.spec.alpha/def :portkey.aws.elastictranscoder.-2012-09-25.create-pipeline-request/content-config (clojure.spec.alpha/and :portkey.aws.elastictranscoder.-2012-09-25/pipeline-output-config))
(clojure.spec.alpha/def :portkey.aws.elastictranscoder.-2012-09-25.create-pipeline-request/thumbnail-config (clojure.spec.alpha/and :portkey.aws.elastictranscoder.-2012-09-25/pipeline-output-config))
(clojure.spec.alpha/def :portkey.aws.elastictranscoder.-2012-09-25/create-pipeline-request (clojure.spec.alpha/keys :req-un [:portkey.aws.elastictranscoder.-2012-09-25/name :portkey.aws.elastictranscoder.-2012-09-25.create-pipeline-request/input-bucket :portkey.aws.elastictranscoder.-2012-09-25/role] :opt-un [:portkey.aws.elastictranscoder.-2012-09-25.create-pipeline-request/output-bucket :portkey.aws.elastictranscoder.-2012-09-25.create-pipeline-request/aws-kms-key-arn :portkey.aws.elastictranscoder.-2012-09-25/notifications :portkey.aws.elastictranscoder.-2012-09-25.create-pipeline-request/content-config :portkey.aws.elastictranscoder.-2012-09-25.create-pipeline-request/thumbnail-config]))

(clojure.spec.alpha/def :portkey.aws.elastictranscoder.-2012-09-25/jpg-or-png (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__27882__auto__] (clojure.core/re-matches #"(^jpg$)|(^png$)" s__27882__auto__))))

(clojure.spec.alpha/def :portkey.aws.elastictranscoder.-2012-09-25.captions/merge-policy (clojure.spec.alpha/and :portkey.aws.elastictranscoder.-2012-09-25/caption-merge-policy))
(clojure.spec.alpha/def :portkey.aws.elastictranscoder.-2012-09-25/captions (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.elastictranscoder.-2012-09-25.captions/merge-policy :portkey.aws.elastictranscoder.-2012-09-25/caption-sources :portkey.aws.elastictranscoder.-2012-09-25/caption-formats]))

(clojure.spec.alpha/def :portkey.aws.elastictranscoder.-2012-09-25/keyframes-max-dist (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__27882__auto__] (clojure.core/re-matches #"^\d{1,6}$" s__27882__auto__))))

(clojure.spec.alpha/def :portkey.aws.elastictranscoder.-2012-09-25/time-offset (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__27882__auto__] (clojure.core/re-matches #"(^[+-]?\d{1,5}(\.\d{0,3})?$)|(^[+-]?([0-1]?[0-9]:|2[0-3]:)?([0-5]?[0-9]:)?[0-5]?[0-9](\.\d{0,3})?$)" s__27882__auto__))))

(clojure.spec.alpha/def :portkey.aws.elastictranscoder.-2012-09-25/audio-channels (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__27882__auto__] (clojure.core/re-matches #"(^auto$)|(^0$)|(^1$)|(^2$)" s__27882__auto__))))

(clojure.spec.alpha/def :portkey.aws.elastictranscoder.-2012-09-25/caption-formats (clojure.spec.alpha/coll-of :portkey.aws.elastictranscoder.-2012-09-25/caption-format :max-count 4))

(clojure.spec.alpha/def :portkey.aws.elastictranscoder.-2012-09-25.job-watermark/input-key (clojure.spec.alpha/and :portkey.aws.elastictranscoder.-2012-09-25/watermark-key))
(clojure.spec.alpha/def :portkey.aws.elastictranscoder.-2012-09-25/job-watermark (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.elastictranscoder.-2012-09-25/preset-watermark-id :portkey.aws.elastictranscoder.-2012-09-25.job-watermark/input-key :portkey.aws.elastictranscoder.-2012-09-25/encryption]))

(clojure.spec.alpha/def :portkey.aws.elastictranscoder.-2012-09-25/create-job-response (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.elastictranscoder.-2012-09-25/job]))

(clojure.spec.alpha/def :portkey.aws.elastictranscoder.-2012-09-25/pixels-or-percent (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__27882__auto__] (clojure.core/re-matches #"(^\d{1,3}(\.\d{0,5})?%$)|(^\d{1,4}?px$)" s__27882__auto__))))

(clojure.spec.alpha/def :portkey.aws.elastictranscoder.-2012-09-25/caption-merge-policy (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__27882__auto__] (clojure.core/re-matches #"(^MergeOverride$)|(^MergeRetain$)|(^Override$)" s__27882__auto__))))

(clojure.spec.alpha/def :portkey.aws.elastictranscoder.-2012-09-25.pipeline/input-bucket (clojure.spec.alpha/and :portkey.aws.elastictranscoder.-2012-09-25/bucket-name))
(clojure.spec.alpha/def :portkey.aws.elastictranscoder.-2012-09-25.pipeline/aws-kms-key-arn (clojure.spec.alpha/and :portkey.aws.elastictranscoder.-2012-09-25/key-arn))
(clojure.spec.alpha/def :portkey.aws.elastictranscoder.-2012-09-25.pipeline/output-bucket (clojure.spec.alpha/and :portkey.aws.elastictranscoder.-2012-09-25/bucket-name))
(clojure.spec.alpha/def :portkey.aws.elastictranscoder.-2012-09-25.pipeline/content-config (clojure.spec.alpha/and :portkey.aws.elastictranscoder.-2012-09-25/pipeline-output-config))
(clojure.spec.alpha/def :portkey.aws.elastictranscoder.-2012-09-25.pipeline/thumbnail-config (clojure.spec.alpha/and :portkey.aws.elastictranscoder.-2012-09-25/pipeline-output-config))
(clojure.spec.alpha/def :portkey.aws.elastictranscoder.-2012-09-25.pipeline/status (clojure.spec.alpha/and :portkey.aws.elastictranscoder.-2012-09-25/pipeline-status))
(clojure.spec.alpha/def :portkey.aws.elastictranscoder.-2012-09-25.pipeline/arn (clojure.spec.alpha/and :portkey.aws.elastictranscoder.-2012-09-25/string))
(clojure.spec.alpha/def :portkey.aws.elastictranscoder.-2012-09-25/pipeline (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.elastictranscoder.-2012-09-25.pipeline/input-bucket :portkey.aws.elastictranscoder.-2012-09-25.pipeline/aws-kms-key-arn :portkey.aws.elastictranscoder.-2012-09-25.pipeline/output-bucket :portkey.aws.elastictranscoder.-2012-09-25.pipeline/content-config :portkey.aws.elastictranscoder.-2012-09-25.pipeline/thumbnail-config :portkey.aws.elastictranscoder.-2012-09-25.pipeline/status :portkey.aws.elastictranscoder.-2012-09-25/role :portkey.aws.elastictranscoder.-2012-09-25.pipeline/arn :portkey.aws.elastictranscoder.-2012-09-25/name :portkey.aws.elastictranscoder.-2012-09-25/notifications :portkey.aws.elastictranscoder.-2012-09-25/id]))

(clojure.spec.alpha/def :portkey.aws.elastictranscoder.-2012-09-25/hls-content-protection-method (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__27882__auto__] (clojure.core/re-matches #"(^aes-128$)" s__27882__auto__))))

(clojure.spec.alpha/def :portkey.aws.elastictranscoder.-2012-09-25.thumbnails/format (clojure.spec.alpha/and :portkey.aws.elastictranscoder.-2012-09-25/jpg-or-png))
(clojure.spec.alpha/def :portkey.aws.elastictranscoder.-2012-09-25.thumbnails/interval (clojure.spec.alpha/and :portkey.aws.elastictranscoder.-2012-09-25/digits))
(clojure.spec.alpha/def :portkey.aws.elastictranscoder.-2012-09-25.thumbnails/resolution (clojure.spec.alpha/and :portkey.aws.elastictranscoder.-2012-09-25/thumbnail-resolution))
(clojure.spec.alpha/def :portkey.aws.elastictranscoder.-2012-09-25.thumbnails/max-width (clojure.spec.alpha/and :portkey.aws.elastictranscoder.-2012-09-25/digits-or-auto))
(clojure.spec.alpha/def :portkey.aws.elastictranscoder.-2012-09-25.thumbnails/max-height (clojure.spec.alpha/and :portkey.aws.elastictranscoder.-2012-09-25/digits-or-auto))
(clojure.spec.alpha/def :portkey.aws.elastictranscoder.-2012-09-25/thumbnails (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.elastictranscoder.-2012-09-25.thumbnails/format :portkey.aws.elastictranscoder.-2012-09-25.thumbnails/interval :portkey.aws.elastictranscoder.-2012-09-25.thumbnails/resolution :portkey.aws.elastictranscoder.-2012-09-25/aspect-ratio :portkey.aws.elastictranscoder.-2012-09-25.thumbnails/max-width :portkey.aws.elastictranscoder.-2012-09-25.thumbnails/max-height :portkey.aws.elastictranscoder.-2012-09-25/sizing-policy :portkey.aws.elastictranscoder.-2012-09-25/padding-policy]))

(clojure.spec.alpha/def :portkey.aws.elastictranscoder.-2012-09-25/digits (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__27882__auto__] (clojure.core/re-matches #"^\d{1,5}$" s__27882__auto__))))

(clojure.spec.alpha/def :portkey.aws.elastictranscoder.-2012-09-25/resource-in-use-exception (clojure.spec.alpha/keys :req-un [] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.elastictranscoder.-2012-09-25/watermark-sizing-policy (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__27882__auto__] (clojure.core/re-matches #"(^Fit$)|(^Stretch$)|(^ShrinkToFit$)" s__27882__auto__))))

(clojure.spec.alpha/def :portkey.aws.elastictranscoder.-2012-09-25/limit-exceeded-exception (clojure.spec.alpha/keys :req-un [] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.elastictranscoder.-2012-09-25/resolution (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__27882__auto__] (clojure.core/re-matches #"(^auto$)|(^\d{1,5}x\d{1,5}$)" s__27882__auto__))))

(clojure.spec.alpha/def :portkey.aws.elastictranscoder.-2012-09-25/cancel-job-request (clojure.spec.alpha/keys :req-un [:portkey.aws.elastictranscoder.-2012-09-25/id] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.elastictranscoder.-2012-09-25/artworks (clojure.spec.alpha/coll-of :portkey.aws.elastictranscoder.-2012-09-25/artwork))

(clojure.spec.alpha/def :portkey.aws.elastictranscoder.-2012-09-25/video-bit-rate (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__27882__auto__] (clojure.core/re-matches #"(^\d{2,5}$)|(^auto$)" s__27882__auto__))))

(clojure.spec.alpha/def :portkey.aws.elastictranscoder.-2012-09-25/frame-rate (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__27882__auto__] (clojure.core/re-matches #"(^auto$)|(^10$)|(^15$)|(^23.97$)|(^24$)|(^25$)|(^29.97$)|(^30$)|(^50$)|(^60$)" s__27882__auto__))))

(clojure.spec.alpha/def :portkey.aws.elastictranscoder.-2012-09-25/opacity (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__27882__auto__] (clojure.core/re-matches #"^\d{1,3}(\.\d{0,20})?$" s__27882__auto__))))

(clojure.spec.alpha/def :portkey.aws.elastictranscoder.-2012-09-25.time-span/start-time (clojure.spec.alpha/and :portkey.aws.elastictranscoder.-2012-09-25/time))
(clojure.spec.alpha/def :portkey.aws.elastictranscoder.-2012-09-25.time-span/duration (clojure.spec.alpha/and :portkey.aws.elastictranscoder.-2012-09-25/time))
(clojure.spec.alpha/def :portkey.aws.elastictranscoder.-2012-09-25/time-span (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.elastictranscoder.-2012-09-25.time-span/start-time :portkey.aws.elastictranscoder.-2012-09-25.time-span/duration]))

(clojure.spec.alpha/def :portkey.aws.elastictranscoder.-2012-09-25/aspect-ratio (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__27882__auto__] (clojure.core/re-matches #"(^auto$)|(^1:1$)|(^4:3$)|(^3:2$)|(^16:9$)" s__27882__auto__))))

(clojure.spec.alpha/def :portkey.aws.elastictranscoder.-2012-09-25/watermark-key (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__27880__auto__] (clojure.core/<= 1 (clojure.core/count s__27880__auto__))) (clojure.core/fn [s__27881__auto__] (clojure.core/< (clojure.core/count s__27881__auto__) 1024)) (clojure.core/fn [s__27882__auto__] (clojure.core/re-matches #"(^.{1,1020}.jpg$)|(^.{1,1019}.jpeg$)|(^.{1,1020}.png$)" s__27882__auto__))))

(clojure.spec.alpha/def :portkey.aws.elastictranscoder.-2012-09-25/one-to-512-string (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__27880__auto__] (clojure.core/<= 1 (clojure.core/count s__27880__auto__))) (clojure.core/fn [s__27881__auto__] (clojure.core/< (clojure.core/count s__27881__auto__) 512))))

(clojure.spec.alpha/def :portkey.aws.elastictranscoder.-2012-09-25/zero-to-512-string (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__27880__auto__] (clojure.core/<= 0 (clojure.core/count s__27880__auto__))) (clojure.core/fn [s__27881__auto__] (clojure.core/< (clojure.core/count s__27881__auto__) 512))))

(clojure.spec.alpha/def :portkey.aws.elastictranscoder.-2012-09-25/thumbnail-pattern (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__27882__auto__] (clojure.core/re-matches #"(^$)|(^.*\{count\}.*$)" s__27882__auto__))))

(clojure.spec.alpha/def :portkey.aws.elastictranscoder.-2012-09-25/read-job-response (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.elastictranscoder.-2012-09-25/job]))

(clojure.spec.alpha/def :portkey.aws.elastictranscoder.-2012-09-25/pipeline-status (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__27882__auto__] (clojure.core/re-matches #"(^Active$)|(^Paused$)" s__27882__auto__))))

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
(clojure.spec.alpha/def :portkey.aws.elastictranscoder.-2012-09-25/job-output (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.elastictranscoder.-2012-09-25/composition :portkey.aws.elastictranscoder.-2012-09-25/captions :portkey.aws.elastictranscoder.-2012-09-25.job-output/duration-millis :portkey.aws.elastictranscoder.-2012-09-25.job-output/thumbnail-encryption :portkey.aws.elastictranscoder.-2012-09-25.job-output/frame-rate :portkey.aws.elastictranscoder.-2012-09-25.job-output/status :portkey.aws.elastictranscoder.-2012-09-25/thumbnail-pattern :portkey.aws.elastictranscoder.-2012-09-25.job-output/preset-id :portkey.aws.elastictranscoder.-2012-09-25/key :portkey.aws.elastictranscoder.-2012-09-25.job-output/status-detail :portkey.aws.elastictranscoder.-2012-09-25.job-output/width :portkey.aws.elastictranscoder.-2012-09-25.job-output/watermarks :portkey.aws.elastictranscoder.-2012-09-25.job-output/applied-color-space-conversion :portkey.aws.elastictranscoder.-2012-09-25.job-output/duration :portkey.aws.elastictranscoder.-2012-09-25.job-output/height :portkey.aws.elastictranscoder.-2012-09-25/rotate :portkey.aws.elastictranscoder.-2012-09-25.job-output/album-art :portkey.aws.elastictranscoder.-2012-09-25/encryption :portkey.aws.elastictranscoder.-2012-09-25.job-output/file-size :portkey.aws.elastictranscoder.-2012-09-25.job-output/segment-duration :portkey.aws.elastictranscoder.-2012-09-25.job-output/id]))

(clojure.spec.alpha/def :portkey.aws.elastictranscoder.-2012-09-25/user-metadata (clojure.spec.alpha/map-of :portkey.aws.elastictranscoder.-2012-09-25/string :portkey.aws.elastictranscoder.-2012-09-25/string))

(clojure.spec.alpha/def :portkey.aws.elastictranscoder.-2012-09-25/ascending (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__27882__auto__] (clojure.core/re-matches #"(^true$)|(^false$)" s__27882__auto__))))

(clojure.spec.alpha/def :portkey.aws.elastictranscoder.-2012-09-25.detected-properties/width (clojure.spec.alpha/and :portkey.aws.elastictranscoder.-2012-09-25/nullable-integer))
(clojure.spec.alpha/def :portkey.aws.elastictranscoder.-2012-09-25.detected-properties/height (clojure.spec.alpha/and :portkey.aws.elastictranscoder.-2012-09-25/nullable-integer))
(clojure.spec.alpha/def :portkey.aws.elastictranscoder.-2012-09-25.detected-properties/frame-rate (clojure.spec.alpha/and :portkey.aws.elastictranscoder.-2012-09-25/float-string))
(clojure.spec.alpha/def :portkey.aws.elastictranscoder.-2012-09-25.detected-properties/file-size (clojure.spec.alpha/and :portkey.aws.elastictranscoder.-2012-09-25/nullable-long))
(clojure.spec.alpha/def :portkey.aws.elastictranscoder.-2012-09-25.detected-properties/duration-millis (clojure.spec.alpha/and :portkey.aws.elastictranscoder.-2012-09-25/nullable-long))
(clojure.spec.alpha/def :portkey.aws.elastictranscoder.-2012-09-25/detected-properties (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.elastictranscoder.-2012-09-25.detected-properties/width :portkey.aws.elastictranscoder.-2012-09-25.detected-properties/height :portkey.aws.elastictranscoder.-2012-09-25.detected-properties/frame-rate :portkey.aws.elastictranscoder.-2012-09-25.detected-properties/file-size :portkey.aws.elastictranscoder.-2012-09-25.detected-properties/duration-millis]))

(clojure.spec.alpha/def :portkey.aws.elastictranscoder.-2012-09-25/incompatible-version-exception (clojure.spec.alpha/keys :req-un [] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.elastictranscoder.-2012-09-25.pipeline-output-config/bucket (clojure.spec.alpha/and :portkey.aws.elastictranscoder.-2012-09-25/bucket-name))
(clojure.spec.alpha/def :portkey.aws.elastictranscoder.-2012-09-25/pipeline-output-config (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.elastictranscoder.-2012-09-25.pipeline-output-config/bucket :portkey.aws.elastictranscoder.-2012-09-25/storage-class :portkey.aws.elastictranscoder.-2012-09-25/permissions]))

(clojure.spec.alpha/def :portkey.aws.elastictranscoder.-2012-09-25/key (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__27880__auto__] (clojure.core/<= 1 (clojure.core/count s__27880__auto__))) (clojure.core/fn [s__27881__auto__] (clojure.core/< (clojure.core/count s__27881__auto__) 255))))

(clojure.spec.alpha/def :portkey.aws.elastictranscoder.-2012-09-25.test-role-response/messages (clojure.spec.alpha/and :portkey.aws.elastictranscoder.-2012-09-25/exception-messages))
(clojure.spec.alpha/def :portkey.aws.elastictranscoder.-2012-09-25/test-role-response (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.elastictranscoder.-2012-09-25/success :portkey.aws.elastictranscoder.-2012-09-25.test-role-response/messages]))

(clojure.spec.alpha/def :portkey.aws.elastictranscoder.-2012-09-25/sns-topics (clojure.spec.alpha/coll-of :portkey.aws.elastictranscoder.-2012-09-25/sns-topic :max-count 30))

(clojure.spec.alpha/def :portkey.aws.elastictranscoder.-2012-09-25/delete-pipeline-response (clojure.spec.alpha/keys :req-un [] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.elastictranscoder.-2012-09-25/role (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__27882__auto__] (clojure.core/re-matches #"^arn:aws:iam::\w{12}:role/.+$" s__27882__auto__))))

(clojure.spec.alpha/def :portkey.aws.elastictranscoder.-2012-09-25/interlaced (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__27882__auto__] (clojure.core/re-matches #"(^auto$)|(^true$)|(^false$)" s__27882__auto__))))

(clojure.spec.alpha/def :portkey.aws.elastictranscoder.-2012-09-25/max-frame-rate (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__27882__auto__] (clojure.core/re-matches #"(^10$)|(^15$)|(^23.97$)|(^24$)|(^25$)|(^29.97$)|(^30$)|(^50$)|(^60$)" s__27882__auto__))))

(clojure.spec.alpha/def :portkey.aws.elastictranscoder.-2012-09-25.playlist/name (clojure.spec.alpha/and :portkey.aws.elastictranscoder.-2012-09-25/filename))
(clojure.spec.alpha/def :portkey.aws.elastictranscoder.-2012-09-25.playlist/format (clojure.spec.alpha/and :portkey.aws.elastictranscoder.-2012-09-25/playlist-format))
(clojure.spec.alpha/def :portkey.aws.elastictranscoder.-2012-09-25.playlist/status (clojure.spec.alpha/and :portkey.aws.elastictranscoder.-2012-09-25/job-status))
(clojure.spec.alpha/def :portkey.aws.elastictranscoder.-2012-09-25.playlist/status-detail (clojure.spec.alpha/and :portkey.aws.elastictranscoder.-2012-09-25/description))
(clojure.spec.alpha/def :portkey.aws.elastictranscoder.-2012-09-25/playlist (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.elastictranscoder.-2012-09-25.playlist/name :portkey.aws.elastictranscoder.-2012-09-25.playlist/format :portkey.aws.elastictranscoder.-2012-09-25/output-keys :portkey.aws.elastictranscoder.-2012-09-25/hls-content-protection :portkey.aws.elastictranscoder.-2012-09-25/play-ready-drm :portkey.aws.elastictranscoder.-2012-09-25.playlist/status :portkey.aws.elastictranscoder.-2012-09-25.playlist/status-detail]))

(clojure.spec.alpha/def :portkey.aws.elastictranscoder.-2012-09-25/delete-pipeline-request (clojure.spec.alpha/keys :req-un [:portkey.aws.elastictranscoder.-2012-09-25/id] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.elastictranscoder.-2012-09-25/success (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__27882__auto__] (clojure.core/re-matches #"(^true$)|(^false$)" s__27882__auto__))))

(clojure.spec.alpha/def :portkey.aws.elastictranscoder.-2012-09-25.list-jobs-by-status-request/status (clojure.spec.alpha/and :portkey.aws.elastictranscoder.-2012-09-25/job-status))
(clojure.spec.alpha/def :portkey.aws.elastictranscoder.-2012-09-25.list-jobs-by-status-request/page-token (clojure.spec.alpha/and :portkey.aws.elastictranscoder.-2012-09-25/id))
(clojure.spec.alpha/def :portkey.aws.elastictranscoder.-2012-09-25/list-jobs-by-status-request (clojure.spec.alpha/keys :req-un [:portkey.aws.elastictranscoder.-2012-09-25.list-jobs-by-status-request/status] :opt-un [:portkey.aws.elastictranscoder.-2012-09-25/ascending :portkey.aws.elastictranscoder.-2012-09-25.list-jobs-by-status-request/page-token]))

(clojure.spec.alpha/def :portkey.aws.elastictranscoder.-2012-09-25.warning/code (clojure.spec.alpha/and :portkey.aws.elastictranscoder.-2012-09-25/string))
(clojure.spec.alpha/def :portkey.aws.elastictranscoder.-2012-09-25.warning/message (clojure.spec.alpha/and :portkey.aws.elastictranscoder.-2012-09-25/string))
(clojure.spec.alpha/def :portkey.aws.elastictranscoder.-2012-09-25/warning (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.elastictranscoder.-2012-09-25.warning/code :portkey.aws.elastictranscoder.-2012-09-25.warning/message]))

(clojure.spec.alpha/def :portkey.aws.elastictranscoder.-2012-09-25.create-job-request/pipeline-id (clojure.spec.alpha/and :portkey.aws.elastictranscoder.-2012-09-25/id))
(clojure.spec.alpha/def :portkey.aws.elastictranscoder.-2012-09-25.create-job-request/input (clojure.spec.alpha/and :portkey.aws.elastictranscoder.-2012-09-25/job-input))
(clojure.spec.alpha/def :portkey.aws.elastictranscoder.-2012-09-25.create-job-request/inputs (clojure.spec.alpha/and :portkey.aws.elastictranscoder.-2012-09-25/job-inputs))
(clojure.spec.alpha/def :portkey.aws.elastictranscoder.-2012-09-25.create-job-request/output (clojure.spec.alpha/and :portkey.aws.elastictranscoder.-2012-09-25/create-job-output))
(clojure.spec.alpha/def :portkey.aws.elastictranscoder.-2012-09-25.create-job-request/outputs (clojure.spec.alpha/and :portkey.aws.elastictranscoder.-2012-09-25/create-job-outputs))
(clojure.spec.alpha/def :portkey.aws.elastictranscoder.-2012-09-25.create-job-request/output-key-prefix (clojure.spec.alpha/and :portkey.aws.elastictranscoder.-2012-09-25/key))
(clojure.spec.alpha/def :portkey.aws.elastictranscoder.-2012-09-25.create-job-request/playlists (clojure.spec.alpha/and :portkey.aws.elastictranscoder.-2012-09-25/create-job-playlists))
(clojure.spec.alpha/def :portkey.aws.elastictranscoder.-2012-09-25/create-job-request (clojure.spec.alpha/keys :req-un [:portkey.aws.elastictranscoder.-2012-09-25.create-job-request/pipeline-id] :opt-un [:portkey.aws.elastictranscoder.-2012-09-25.create-job-request/input :portkey.aws.elastictranscoder.-2012-09-25.create-job-request/inputs :portkey.aws.elastictranscoder.-2012-09-25.create-job-request/output :portkey.aws.elastictranscoder.-2012-09-25.create-job-request/outputs :portkey.aws.elastictranscoder.-2012-09-25.create-job-request/output-key-prefix :portkey.aws.elastictranscoder.-2012-09-25.create-job-request/playlists :portkey.aws.elastictranscoder.-2012-09-25/user-metadata]))

(clojure.spec.alpha/def :portkey.aws.elastictranscoder.-2012-09-25.audio-codec-options/profile (clojure.spec.alpha/and :portkey.aws.elastictranscoder.-2012-09-25/audio-codec-profile))
(clojure.spec.alpha/def :portkey.aws.elastictranscoder.-2012-09-25.audio-codec-options/bit-depth (clojure.spec.alpha/and :portkey.aws.elastictranscoder.-2012-09-25/audio-bit-depth))
(clojure.spec.alpha/def :portkey.aws.elastictranscoder.-2012-09-25.audio-codec-options/bit-order (clojure.spec.alpha/and :portkey.aws.elastictranscoder.-2012-09-25/audio-bit-order))
(clojure.spec.alpha/def :portkey.aws.elastictranscoder.-2012-09-25.audio-codec-options/signed (clojure.spec.alpha/and :portkey.aws.elastictranscoder.-2012-09-25/audio-signed))
(clojure.spec.alpha/def :portkey.aws.elastictranscoder.-2012-09-25/audio-codec-options (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.elastictranscoder.-2012-09-25.audio-codec-options/profile :portkey.aws.elastictranscoder.-2012-09-25.audio-codec-options/bit-depth :portkey.aws.elastictranscoder.-2012-09-25.audio-codec-options/bit-order :portkey.aws.elastictranscoder.-2012-09-25.audio-codec-options/signed]))

(clojure.spec.alpha/def :portkey.aws.elastictranscoder.-2012-09-25/resource-not-found-exception (clojure.spec.alpha/keys :req-un [] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.elastictranscoder.-2012-09-25/float-string (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__27882__auto__] (clojure.core/re-matches #"^\d{1,5}(\.\d{0,5})?$" s__27882__auto__))))

(clojure.spec.alpha/def :portkey.aws.elastictranscoder.-2012-09-25.timing/submit-time-millis (clojure.spec.alpha/and :portkey.aws.elastictranscoder.-2012-09-25/nullable-long))
(clojure.spec.alpha/def :portkey.aws.elastictranscoder.-2012-09-25.timing/start-time-millis (clojure.spec.alpha/and :portkey.aws.elastictranscoder.-2012-09-25/nullable-long))
(clojure.spec.alpha/def :portkey.aws.elastictranscoder.-2012-09-25.timing/finish-time-millis (clojure.spec.alpha/and :portkey.aws.elastictranscoder.-2012-09-25/nullable-long))
(clojure.spec.alpha/def :portkey.aws.elastictranscoder.-2012-09-25/timing (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.elastictranscoder.-2012-09-25.timing/submit-time-millis :portkey.aws.elastictranscoder.-2012-09-25.timing/start-time-millis :portkey.aws.elastictranscoder.-2012-09-25.timing/finish-time-millis]))

(clojure.spec.alpha/def :portkey.aws.elastictranscoder.-2012-09-25/nullable-long clojure.core/int?)

(clojure.spec.alpha/def :portkey.aws.elastictranscoder.-2012-09-25/read-preset-response (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.elastictranscoder.-2012-09-25/preset]))

(clojure.spec.alpha/def :portkey.aws.elastictranscoder.-2012-09-25/audio-sample-rate (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__27882__auto__] (clojure.core/re-matches #"(^auto$)|(^22050$)|(^32000$)|(^44100$)|(^48000$)|(^96000$)|(^192000$)" s__27882__auto__))))

(clojure.spec.alpha/def :portkey.aws.elastictranscoder.-2012-09-25.list-presets-request/page-token (clojure.spec.alpha/and :portkey.aws.elastictranscoder.-2012-09-25/id))
(clojure.spec.alpha/def :portkey.aws.elastictranscoder.-2012-09-25/list-presets-request (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.elastictranscoder.-2012-09-25/ascending :portkey.aws.elastictranscoder.-2012-09-25.list-presets-request/page-token]))

(clojure.spec.alpha/def :portkey.aws.elastictranscoder.-2012-09-25/audio-bit-depth (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__27882__auto__] (clojure.core/re-matches #"(^8$)|(^16$)|(^24$)|(^32$)" s__27882__auto__))))

(clojure.spec.alpha/def :portkey.aws.elastictranscoder.-2012-09-25/description (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__27880__auto__] (clojure.core/<= 0 (clojure.core/count s__27880__auto__))) (clojure.core/fn [s__27881__auto__] (clojure.core/< (clojure.core/count s__27881__auto__) 255))))

(clojure.spec.alpha/def :portkey.aws.elastictranscoder.-2012-09-25.create-preset-response/warning (clojure.spec.alpha/and :portkey.aws.elastictranscoder.-2012-09-25/string))
(clojure.spec.alpha/def :portkey.aws.elastictranscoder.-2012-09-25/create-preset-response (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.elastictranscoder.-2012-09-25/preset :portkey.aws.elastictranscoder.-2012-09-25.create-preset-response/warning]))

(clojure.spec.alpha/def :portkey.aws.elastictranscoder.-2012-09-25/audio-packing-mode (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__27882__auto__] (clojure.core/re-matches #"(^SingleTrack$)|(^OneChannelPerTrack$)|(^OneChannelPerTrackWithMosTo8Tracks$)" s__27882__auto__))))

(clojure.spec.alpha/def :portkey.aws.elastictranscoder.-2012-09-25/read-job-request (clojure.spec.alpha/keys :req-un [:portkey.aws.elastictranscoder.-2012-09-25/id] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.elastictranscoder.-2012-09-25/audio-bit-order (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__27882__auto__] (clojure.core/re-matches #"(^LittleEndian$)" s__27882__auto__))))

(clojure.spec.alpha/def :portkey.aws.elastictranscoder.-2012-09-25/preset-type (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__27882__auto__] (clojure.core/re-matches #"(^System$)|(^Custom$)" s__27882__auto__))))

(clojure.spec.alpha/def :portkey.aws.elastictranscoder.-2012-09-25.hls-content-protection/method (clojure.spec.alpha/and :portkey.aws.elastictranscoder.-2012-09-25/hls-content-protection-method))
(clojure.spec.alpha/def :portkey.aws.elastictranscoder.-2012-09-25.hls-content-protection/key (clojure.spec.alpha/and :portkey.aws.elastictranscoder.-2012-09-25/base-64-encoded-string))
(clojure.spec.alpha/def :portkey.aws.elastictranscoder.-2012-09-25.hls-content-protection/key-md-5 (clojure.spec.alpha/and :portkey.aws.elastictranscoder.-2012-09-25/base-64-encoded-string))
(clojure.spec.alpha/def :portkey.aws.elastictranscoder.-2012-09-25.hls-content-protection/initialization-vector (clojure.spec.alpha/and :portkey.aws.elastictranscoder.-2012-09-25/zero-to-255-string))
(clojure.spec.alpha/def :portkey.aws.elastictranscoder.-2012-09-25.hls-content-protection/license-acquisition-url (clojure.spec.alpha/and :portkey.aws.elastictranscoder.-2012-09-25/zero-to-512-string))
(clojure.spec.alpha/def :portkey.aws.elastictranscoder.-2012-09-25/hls-content-protection (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.elastictranscoder.-2012-09-25.hls-content-protection/method :portkey.aws.elastictranscoder.-2012-09-25.hls-content-protection/key :portkey.aws.elastictranscoder.-2012-09-25.hls-content-protection/key-md-5 :portkey.aws.elastictranscoder.-2012-09-25.hls-content-protection/initialization-vector :portkey.aws.elastictranscoder.-2012-09-25.hls-content-protection/license-acquisition-url :portkey.aws.elastictranscoder.-2012-09-25/key-storage-policy]))

(clojure.spec.alpha/def :portkey.aws.elastictranscoder.-2012-09-25/access-denied-exception (clojure.spec.alpha/keys :req-un [] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.elastictranscoder.-2012-09-25/string (clojure.spec.alpha/and clojure.core/string?))

(clojure.spec.alpha/def :portkey.aws.elastictranscoder.-2012-09-25.caption-source/key (clojure.spec.alpha/and :portkey.aws.elastictranscoder.-2012-09-25/long-key))
(clojure.spec.alpha/def :portkey.aws.elastictranscoder.-2012-09-25.caption-source/language (clojure.spec.alpha/and :portkey.aws.elastictranscoder.-2012-09-25/key))
(clojure.spec.alpha/def :portkey.aws.elastictranscoder.-2012-09-25.caption-source/label (clojure.spec.alpha/and :portkey.aws.elastictranscoder.-2012-09-25/name))
(clojure.spec.alpha/def :portkey.aws.elastictranscoder.-2012-09-25/caption-source (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.elastictranscoder.-2012-09-25.caption-source/key :portkey.aws.elastictranscoder.-2012-09-25.caption-source/language :portkey.aws.elastictranscoder.-2012-09-25/time-offset :portkey.aws.elastictranscoder.-2012-09-25.caption-source/label :portkey.aws.elastictranscoder.-2012-09-25/encryption]))

(clojure.spec.alpha/def :portkey.aws.elastictranscoder.-2012-09-25.list-jobs-by-pipeline-response/next-page-token (clojure.spec.alpha/and :portkey.aws.elastictranscoder.-2012-09-25/id))
(clojure.spec.alpha/def :portkey.aws.elastictranscoder.-2012-09-25/list-jobs-by-pipeline-response (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.elastictranscoder.-2012-09-25/jobs :portkey.aws.elastictranscoder.-2012-09-25.list-jobs-by-pipeline-response/next-page-token]))

(clojure.spec.alpha/def :portkey.aws.elastictranscoder.-2012-09-25/digits-or-auto (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__27882__auto__] (clojure.core/re-matches #"(^auto$)|(^\d{2,4}$)" s__27882__auto__))))

(clojure.spec.alpha/def :portkey.aws.elastictranscoder.-2012-09-25.input-captions/merge-policy (clojure.spec.alpha/and :portkey.aws.elastictranscoder.-2012-09-25/caption-merge-policy))
(clojure.spec.alpha/def :portkey.aws.elastictranscoder.-2012-09-25/input-captions (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.elastictranscoder.-2012-09-25.input-captions/merge-policy :portkey.aws.elastictranscoder.-2012-09-25/caption-sources]))

(clojure.spec.alpha/def :portkey.aws.elastictranscoder.-2012-09-25/read-preset-request (clojure.spec.alpha/keys :req-un [:portkey.aws.elastictranscoder.-2012-09-25/id] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.elastictranscoder.-2012-09-25.audio-parameters/codec (clojure.spec.alpha/and :portkey.aws.elastictranscoder.-2012-09-25/audio-codec))
(clojure.spec.alpha/def :portkey.aws.elastictranscoder.-2012-09-25.audio-parameters/sample-rate (clojure.spec.alpha/and :portkey.aws.elastictranscoder.-2012-09-25/audio-sample-rate))
(clojure.spec.alpha/def :portkey.aws.elastictranscoder.-2012-09-25.audio-parameters/bit-rate (clojure.spec.alpha/and :portkey.aws.elastictranscoder.-2012-09-25/audio-bit-rate))
(clojure.spec.alpha/def :portkey.aws.elastictranscoder.-2012-09-25.audio-parameters/channels (clojure.spec.alpha/and :portkey.aws.elastictranscoder.-2012-09-25/audio-channels))
(clojure.spec.alpha/def :portkey.aws.elastictranscoder.-2012-09-25.audio-parameters/codec-options (clojure.spec.alpha/and :portkey.aws.elastictranscoder.-2012-09-25/audio-codec-options))
(clojure.spec.alpha/def :portkey.aws.elastictranscoder.-2012-09-25/audio-parameters (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.elastictranscoder.-2012-09-25.audio-parameters/codec :portkey.aws.elastictranscoder.-2012-09-25.audio-parameters/sample-rate :portkey.aws.elastictranscoder.-2012-09-25.audio-parameters/bit-rate :portkey.aws.elastictranscoder.-2012-09-25.audio-parameters/channels :portkey.aws.elastictranscoder.-2012-09-25/audio-packing-mode :portkey.aws.elastictranscoder.-2012-09-25.audio-parameters/codec-options]))

(clojure.spec.alpha/def :portkey.aws.elastictranscoder.-2012-09-25/access-control (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__27882__auto__] (clojure.core/re-matches #"(^FullControl$)|(^Read$)|(^ReadAcp$)|(^WriteAcp$)" s__27882__auto__))))

(clojure.spec.alpha/def :portkey.aws.elastictranscoder.-2012-09-25.list-jobs-by-status-response/next-page-token (clojure.spec.alpha/and :portkey.aws.elastictranscoder.-2012-09-25/id))
(clojure.spec.alpha/def :portkey.aws.elastictranscoder.-2012-09-25/list-jobs-by-status-response (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.elastictranscoder.-2012-09-25/jobs :portkey.aws.elastictranscoder.-2012-09-25.list-jobs-by-status-response/next-page-token]))

(clojure.spec.alpha/def :portkey.aws.elastictranscoder.-2012-09-25/update-pipeline-notifications-request (clojure.spec.alpha/keys :req-un [:portkey.aws.elastictranscoder.-2012-09-25/id :portkey.aws.elastictranscoder.-2012-09-25/notifications] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.elastictranscoder.-2012-09-25/audio-codec-profile (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__27882__auto__] (clojure.core/re-matches #"(^auto$)|(^AAC-LC$)|(^HE-AAC$)|(^HE-AACv2$)" s__27882__auto__))))

(clojure.spec.alpha/def :portkey.aws.elastictranscoder.-2012-09-25/video-codec (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__27882__auto__] (clojure.core/re-matches #"(^H\.264$)|(^vp8$)|(^vp9$)|(^mpeg2$)|(^gif$)" s__27882__auto__))))

(clojure.spec.alpha/def :portkey.aws.elastictranscoder.-2012-09-25/vertical-align (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__27882__auto__] (clojure.core/re-matches #"(^Top$)|(^Bottom$)|(^Center$)" s__27882__auto__))))

(clojure.spec.alpha/def :portkey.aws.elastictranscoder.-2012-09-25/rotate (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__27882__auto__] (clojure.core/re-matches #"(^auto$)|(^0$)|(^90$)|(^180$)|(^270$)" s__27882__auto__))))

(clojure.spec.alpha/def :portkey.aws.elastictranscoder.-2012-09-25/audio-codec (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__27882__auto__] (clojure.core/re-matches #"(^AAC$)|(^vorbis$)|(^mp3$)|(^mp2$)|(^pcm$)|(^flac$)" s__27882__auto__))))

(clojure.spec.alpha/def :portkey.aws.elastictranscoder.-2012-09-25/pipelines (clojure.spec.alpha/coll-of :portkey.aws.elastictranscoder.-2012-09-25/pipeline))

(clojure.spec.alpha/def :portkey.aws.elastictranscoder.-2012-09-25/audio-signed (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__27882__auto__] (clojure.core/re-matches #"(^Unsigned$)|(^Signed$)" s__27882__auto__))))

(clojure.spec.alpha/def :portkey.aws.elastictranscoder.-2012-09-25/jobs (clojure.spec.alpha/coll-of :portkey.aws.elastictranscoder.-2012-09-25/job))

(clojure.spec.alpha/def :portkey.aws.elastictranscoder.-2012-09-25.preset/type (clojure.spec.alpha/and :portkey.aws.elastictranscoder.-2012-09-25/preset-type))
(clojure.spec.alpha/def :portkey.aws.elastictranscoder.-2012-09-25.preset/video (clojure.spec.alpha/and :portkey.aws.elastictranscoder.-2012-09-25/video-parameters))
(clojure.spec.alpha/def :portkey.aws.elastictranscoder.-2012-09-25.preset/audio (clojure.spec.alpha/and :portkey.aws.elastictranscoder.-2012-09-25/audio-parameters))
(clojure.spec.alpha/def :portkey.aws.elastictranscoder.-2012-09-25.preset/container (clojure.spec.alpha/and :portkey.aws.elastictranscoder.-2012-09-25/preset-container))
(clojure.spec.alpha/def :portkey.aws.elastictranscoder.-2012-09-25.preset/arn (clojure.spec.alpha/and :portkey.aws.elastictranscoder.-2012-09-25/string))
(clojure.spec.alpha/def :portkey.aws.elastictranscoder.-2012-09-25/preset (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.elastictranscoder.-2012-09-25.preset/type :portkey.aws.elastictranscoder.-2012-09-25.preset/video :portkey.aws.elastictranscoder.-2012-09-25.preset/audio :portkey.aws.elastictranscoder.-2012-09-25/thumbnails :portkey.aws.elastictranscoder.-2012-09-25.preset/container :portkey.aws.elastictranscoder.-2012-09-25/description :portkey.aws.elastictranscoder.-2012-09-25.preset/arn :portkey.aws.elastictranscoder.-2012-09-25/name :portkey.aws.elastictranscoder.-2012-09-25/id]))

(clojure.spec.alpha/def :portkey.aws.elastictranscoder.-2012-09-25.update-pipeline-request/input-bucket (clojure.spec.alpha/and :portkey.aws.elastictranscoder.-2012-09-25/bucket-name))
(clojure.spec.alpha/def :portkey.aws.elastictranscoder.-2012-09-25.update-pipeline-request/aws-kms-key-arn (clojure.spec.alpha/and :portkey.aws.elastictranscoder.-2012-09-25/key-arn))
(clojure.spec.alpha/def :portkey.aws.elastictranscoder.-2012-09-25.update-pipeline-request/content-config (clojure.spec.alpha/and :portkey.aws.elastictranscoder.-2012-09-25/pipeline-output-config))
(clojure.spec.alpha/def :portkey.aws.elastictranscoder.-2012-09-25.update-pipeline-request/thumbnail-config (clojure.spec.alpha/and :portkey.aws.elastictranscoder.-2012-09-25/pipeline-output-config))
(clojure.spec.alpha/def :portkey.aws.elastictranscoder.-2012-09-25/update-pipeline-request (clojure.spec.alpha/keys :req-un [:portkey.aws.elastictranscoder.-2012-09-25/id] :opt-un [:portkey.aws.elastictranscoder.-2012-09-25/name :portkey.aws.elastictranscoder.-2012-09-25.update-pipeline-request/input-bucket :portkey.aws.elastictranscoder.-2012-09-25/role :portkey.aws.elastictranscoder.-2012-09-25.update-pipeline-request/aws-kms-key-arn :portkey.aws.elastictranscoder.-2012-09-25/notifications :portkey.aws.elastictranscoder.-2012-09-25.update-pipeline-request/content-config :portkey.aws.elastictranscoder.-2012-09-25.update-pipeline-request/thumbnail-config]))

(clojure.spec.alpha/def :portkey.aws.elastictranscoder.-2012-09-25/filename (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__27880__auto__] (clojure.core/<= 1 (clojure.core/count s__27880__auto__))) (clojure.core/fn [s__27881__auto__] (clojure.core/< (clojure.core/count s__27881__auto__) 255))))

(clojure.spec.alpha/def :portkey.aws.elastictranscoder.-2012-09-25/update-pipeline-response (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.elastictranscoder.-2012-09-25/pipeline :portkey.aws.elastictranscoder.-2012-09-25/warnings]))

(clojure.spec.alpha/def :portkey.aws.elastictranscoder.-2012-09-25/preset-watermarks (clojure.spec.alpha/coll-of :portkey.aws.elastictranscoder.-2012-09-25/preset-watermark))

(clojure.spec.alpha/def :portkey.aws.elastictranscoder.-2012-09-25/key-arn (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__27880__auto__] (clojure.core/<= 0 (clojure.core/count s__27880__auto__))) (clojure.core/fn [s__27881__auto__] (clojure.core/< (clojure.core/count s__27881__auto__) 255))))

(clojure.spec.alpha/def :portkey.aws.elastictranscoder.-2012-09-25/clip (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.elastictranscoder.-2012-09-25/time-span]))

(clojure.spec.alpha/def :portkey.aws.elastictranscoder.-2012-09-25/merge-policy (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__27882__auto__] (clojure.core/re-matches #"(^Replace$)|(^Prepend$)|(^Append$)|(^Fallback$)" s__27882__auto__))))

(clojure.spec.alpha/def :portkey.aws.elastictranscoder.-2012-09-25.encryption/mode (clojure.spec.alpha/and :portkey.aws.elastictranscoder.-2012-09-25/encryption-mode))
(clojure.spec.alpha/def :portkey.aws.elastictranscoder.-2012-09-25.encryption/key (clojure.spec.alpha/and :portkey.aws.elastictranscoder.-2012-09-25/base-64-encoded-string))
(clojure.spec.alpha/def :portkey.aws.elastictranscoder.-2012-09-25.encryption/key-md-5 (clojure.spec.alpha/and :portkey.aws.elastictranscoder.-2012-09-25/base-64-encoded-string))
(clojure.spec.alpha/def :portkey.aws.elastictranscoder.-2012-09-25.encryption/initialization-vector (clojure.spec.alpha/and :portkey.aws.elastictranscoder.-2012-09-25/zero-to-255-string))
(clojure.spec.alpha/def :portkey.aws.elastictranscoder.-2012-09-25/encryption (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.elastictranscoder.-2012-09-25.encryption/mode :portkey.aws.elastictranscoder.-2012-09-25.encryption/key :portkey.aws.elastictranscoder.-2012-09-25.encryption/key-md-5 :portkey.aws.elastictranscoder.-2012-09-25.encryption/initialization-vector]))

(clojure.spec.alpha/def :portkey.aws.elastictranscoder.-2012-09-25.list-pipelines-response/next-page-token (clojure.spec.alpha/and :portkey.aws.elastictranscoder.-2012-09-25/id))
(clojure.spec.alpha/def :portkey.aws.elastictranscoder.-2012-09-25/list-pipelines-response (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.elastictranscoder.-2012-09-25/pipelines :portkey.aws.elastictranscoder.-2012-09-25.list-pipelines-response/next-page-token]))

(clojure.spec.alpha/def :portkey.aws.elastictranscoder.-2012-09-25/job-container (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__27882__auto__] (clojure.core/re-matches #"(^auto$)|(^3gp$)|(^asf$)|(^avi$)|(^divx$)|(^flv$)|(^mkv$)|(^mov$)|(^mp4$)|(^mpeg$)|(^mpeg-ps$)|(^mpeg-ts$)|(^mxf$)|(^ogg$)|(^ts$)|(^vob$)|(^wav$)|(^webm$)|(^mp3$)|(^m4a$)|(^aac$)" s__27882__auto__))))

(clojure.spec.alpha/def :portkey.aws.elastictranscoder.-2012-09-25/preset-container (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__27882__auto__] (clojure.core/re-matches #"(^mp4$)|(^ts$)|(^webm$)|(^mp3$)|(^flac$)|(^oga$)|(^ogg$)|(^fmp4$)|(^mpg$)|(^flv$)|(^gif$)|(^mxf$)|(^wav$)|(^mp2$)" s__27882__auto__))))

(clojure.spec.alpha/def :portkey.aws.elastictranscoder.-2012-09-25.job-input/key (clojure.spec.alpha/and :portkey.aws.elastictranscoder.-2012-09-25/long-key))
(clojure.spec.alpha/def :portkey.aws.elastictranscoder.-2012-09-25.job-input/container (clojure.spec.alpha/and :portkey.aws.elastictranscoder.-2012-09-25/job-container))
(clojure.spec.alpha/def :portkey.aws.elastictranscoder.-2012-09-25/job-input (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.elastictranscoder.-2012-09-25/resolution :portkey.aws.elastictranscoder.-2012-09-25/frame-rate :portkey.aws.elastictranscoder.-2012-09-25/time-span :portkey.aws.elastictranscoder.-2012-09-25/aspect-ratio :portkey.aws.elastictranscoder.-2012-09-25/detected-properties :portkey.aws.elastictranscoder.-2012-09-25.job-input/key :portkey.aws.elastictranscoder.-2012-09-25/interlaced :portkey.aws.elastictranscoder.-2012-09-25.job-input/container :portkey.aws.elastictranscoder.-2012-09-25/input-captions :portkey.aws.elastictranscoder.-2012-09-25/encryption]))

(clojure.spec.alpha/def :portkey.aws.elastictranscoder.-2012-09-25/thumbnail-resolution (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__27882__auto__] (clojure.core/re-matches #"^\d{1,5}x\d{1,5}$" s__27882__auto__))))

(clojure.spec.alpha/def :portkey.aws.elastictranscoder.-2012-09-25/read-pipeline-request (clojure.spec.alpha/keys :req-un [:portkey.aws.elastictranscoder.-2012-09-25/id] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.elastictranscoder.-2012-09-25.list-presets-response/next-page-token (clojure.spec.alpha/and :portkey.aws.elastictranscoder.-2012-09-25/id))
(clojure.spec.alpha/def :portkey.aws.elastictranscoder.-2012-09-25/list-presets-response (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.elastictranscoder.-2012-09-25/presets :portkey.aws.elastictranscoder.-2012-09-25.list-presets-response/next-page-token]))

(clojure.spec.alpha/def :portkey.aws.elastictranscoder.-2012-09-25/nullable-integer clojure.core/int?)

(clojure.spec.alpha/def :portkey.aws.elastictranscoder.-2012-09-25.job/status (clojure.spec.alpha/and :portkey.aws.elastictranscoder.-2012-09-25/job-status))
(clojure.spec.alpha/def :portkey.aws.elastictranscoder.-2012-09-25.job/outputs (clojure.spec.alpha/and :portkey.aws.elastictranscoder.-2012-09-25/job-outputs))
(clojure.spec.alpha/def :portkey.aws.elastictranscoder.-2012-09-25.job/pipeline-id (clojure.spec.alpha/and :portkey.aws.elastictranscoder.-2012-09-25/id))
(clojure.spec.alpha/def :portkey.aws.elastictranscoder.-2012-09-25.job/output-key-prefix (clojure.spec.alpha/and :portkey.aws.elastictranscoder.-2012-09-25/key))
(clojure.spec.alpha/def :portkey.aws.elastictranscoder.-2012-09-25.job/inputs (clojure.spec.alpha/and :portkey.aws.elastictranscoder.-2012-09-25/job-inputs))
(clojure.spec.alpha/def :portkey.aws.elastictranscoder.-2012-09-25.job/input (clojure.spec.alpha/and :portkey.aws.elastictranscoder.-2012-09-25/job-input))
(clojure.spec.alpha/def :portkey.aws.elastictranscoder.-2012-09-25.job/arn (clojure.spec.alpha/and :portkey.aws.elastictranscoder.-2012-09-25/string))
(clojure.spec.alpha/def :portkey.aws.elastictranscoder.-2012-09-25.job/output (clojure.spec.alpha/and :portkey.aws.elastictranscoder.-2012-09-25/job-output))
(clojure.spec.alpha/def :portkey.aws.elastictranscoder.-2012-09-25/job (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.elastictranscoder.-2012-09-25/playlists :portkey.aws.elastictranscoder.-2012-09-25.job/status :portkey.aws.elastictranscoder.-2012-09-25.job/outputs :portkey.aws.elastictranscoder.-2012-09-25/user-metadata :portkey.aws.elastictranscoder.-2012-09-25.job/pipeline-id :portkey.aws.elastictranscoder.-2012-09-25.job/output-key-prefix :portkey.aws.elastictranscoder.-2012-09-25/timing :portkey.aws.elastictranscoder.-2012-09-25.job/inputs :portkey.aws.elastictranscoder.-2012-09-25.job/input :portkey.aws.elastictranscoder.-2012-09-25.job/arn :portkey.aws.elastictranscoder.-2012-09-25.job/output :portkey.aws.elastictranscoder.-2012-09-25/id]))

(clojure.spec.alpha/def :portkey.aws.elastictranscoder.-2012-09-25/key-id-guid (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__27882__auto__] (clojure.core/re-matches #"(^[0-9A-Fa-f]{8}-[0-9A-Fa-f]{4}-[0-9A-Fa-f]{4}-[0-9A-Fa-f]{4}-[0-9A-Fa-f]{12}$)|(^[0-9A-Fa-f]{32}$)" s__27882__auto__))))

(clojure.spec.alpha/def :portkey.aws.elastictranscoder.-2012-09-25/target (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__27882__auto__] (clojure.core/re-matches #"(^Content$)|(^Frame$)" s__27882__auto__))))

(clojure.spec.alpha/def :portkey.aws.elastictranscoder.-2012-09-25/name (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__27880__auto__] (clojure.core/<= 1 (clojure.core/count s__27880__auto__))) (clojure.core/fn [s__27881__auto__] (clojure.core/< (clojure.core/count s__27881__auto__) 40))))

(clojure.spec.alpha/def :portkey.aws.elastictranscoder.-2012-09-25/create-job-outputs (clojure.spec.alpha/coll-of :portkey.aws.elastictranscoder.-2012-09-25/create-job-output :max-count 30))

(clojure.spec.alpha/def :portkey.aws.elastictranscoder.-2012-09-25/preset-watermark-id (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__27880__auto__] (clojure.core/<= 1 (clojure.core/count s__27880__auto__))) (clojure.core/fn [s__27881__auto__] (clojure.core/< (clojure.core/count s__27881__auto__) 40))))

(clojure.spec.alpha/def :portkey.aws.elastictranscoder.-2012-09-25/storage-class (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__27882__auto__] (clojure.core/re-matches #"(^ReducedRedundancy$)|(^Standard$)" s__27882__auto__))))

(clojure.spec.alpha/def :portkey.aws.elastictranscoder.-2012-09-25.list-jobs-by-pipeline-request/pipeline-id (clojure.spec.alpha/and :portkey.aws.elastictranscoder.-2012-09-25/id))
(clojure.spec.alpha/def :portkey.aws.elastictranscoder.-2012-09-25.list-jobs-by-pipeline-request/page-token (clojure.spec.alpha/and :portkey.aws.elastictranscoder.-2012-09-25/id))
(clojure.spec.alpha/def :portkey.aws.elastictranscoder.-2012-09-25/list-jobs-by-pipeline-request (clojure.spec.alpha/keys :req-un [:portkey.aws.elastictranscoder.-2012-09-25.list-jobs-by-pipeline-request/pipeline-id] :opt-un [:portkey.aws.elastictranscoder.-2012-09-25/ascending :portkey.aws.elastictranscoder.-2012-09-25.list-jobs-by-pipeline-request/page-token]))

(clojure.spec.alpha/def :portkey.aws.elastictranscoder.-2012-09-25/grantee (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__27880__auto__] (clojure.core/<= 1 (clojure.core/count s__27880__auto__))) (clojure.core/fn [s__27881__auto__] (clojure.core/< (clojure.core/count s__27881__auto__) 255))))

(clojure.spec.alpha/def :portkey.aws.elastictranscoder.-2012-09-25/caption-format-format (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__27882__auto__] (clojure.core/re-matches #"(^mov-text$)|(^srt$)|(^scc$)|(^webvtt$)|(^dfxp$)|(^cea-708$)" s__27882__auto__))))

(clojure.spec.alpha/def :portkey.aws.elastictranscoder.-2012-09-25/non-empty-base-64-encoded-string (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__27882__auto__] (clojure.core/re-matches #"(^(?:[A-Za-z0-9\+/]{4})*(?:[A-Za-z0-9\+/]{2}==|[A-Za-z0-9\+/]{3}=)?$)" s__27882__auto__))))

(clojure.spec.alpha/def :portkey.aws.elastictranscoder.-2012-09-25.preset-watermark/sizing-policy (clojure.spec.alpha/and :portkey.aws.elastictranscoder.-2012-09-25/watermark-sizing-policy))
(clojure.spec.alpha/def :portkey.aws.elastictranscoder.-2012-09-25.preset-watermark/horizontal-offset (clojure.spec.alpha/and :portkey.aws.elastictranscoder.-2012-09-25/pixels-or-percent))
(clojure.spec.alpha/def :portkey.aws.elastictranscoder.-2012-09-25.preset-watermark/vertical-offset (clojure.spec.alpha/and :portkey.aws.elastictranscoder.-2012-09-25/pixels-or-percent))
(clojure.spec.alpha/def :portkey.aws.elastictranscoder.-2012-09-25.preset-watermark/max-height (clojure.spec.alpha/and :portkey.aws.elastictranscoder.-2012-09-25/pixels-or-percent))
(clojure.spec.alpha/def :portkey.aws.elastictranscoder.-2012-09-25.preset-watermark/max-width (clojure.spec.alpha/and :portkey.aws.elastictranscoder.-2012-09-25/pixels-or-percent))
(clojure.spec.alpha/def :portkey.aws.elastictranscoder.-2012-09-25.preset-watermark/id (clojure.spec.alpha/and :portkey.aws.elastictranscoder.-2012-09-25/preset-watermark-id))
(clojure.spec.alpha/def :portkey.aws.elastictranscoder.-2012-09-25/preset-watermark (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.elastictranscoder.-2012-09-25.preset-watermark/sizing-policy :portkey.aws.elastictranscoder.-2012-09-25/opacity :portkey.aws.elastictranscoder.-2012-09-25.preset-watermark/horizontal-offset :portkey.aws.elastictranscoder.-2012-09-25.preset-watermark/vertical-offset :portkey.aws.elastictranscoder.-2012-09-25.preset-watermark/max-height :portkey.aws.elastictranscoder.-2012-09-25/vertical-align :portkey.aws.elastictranscoder.-2012-09-25/target :portkey.aws.elastictranscoder.-2012-09-25.preset-watermark/max-width :portkey.aws.elastictranscoder.-2012-09-25.preset-watermark/id :portkey.aws.elastictranscoder.-2012-09-25/horizontal-align]))

(clojure.spec.alpha/def :portkey.aws.elastictranscoder.-2012-09-25/bucket-name (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__27882__auto__] (clojure.core/re-matches #"^(\w|\.|-){1,255}$" s__27882__auto__))))

(clojure.spec.alpha/def :portkey.aws.elastictranscoder.-2012-09-25/audio-bit-rate (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__27882__auto__] (clojure.core/re-matches #"^\d{1,3}$" s__27882__auto__))))

(clojure.spec.alpha/def :portkey.aws.elastictranscoder.-2012-09-25.notifications/progressing (clojure.spec.alpha/and :portkey.aws.elastictranscoder.-2012-09-25/sns-topic))
(clojure.spec.alpha/def :portkey.aws.elastictranscoder.-2012-09-25.notifications/completed (clojure.spec.alpha/and :portkey.aws.elastictranscoder.-2012-09-25/sns-topic))
(clojure.spec.alpha/def :portkey.aws.elastictranscoder.-2012-09-25.notifications/warning (clojure.spec.alpha/and :portkey.aws.elastictranscoder.-2012-09-25/sns-topic))
(clojure.spec.alpha/def :portkey.aws.elastictranscoder.-2012-09-25.notifications/error (clojure.spec.alpha/and :portkey.aws.elastictranscoder.-2012-09-25/sns-topic))
(clojure.spec.alpha/def :portkey.aws.elastictranscoder.-2012-09-25/notifications (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.elastictranscoder.-2012-09-25.notifications/progressing :portkey.aws.elastictranscoder.-2012-09-25.notifications/completed :portkey.aws.elastictranscoder.-2012-09-25.notifications/warning :portkey.aws.elastictranscoder.-2012-09-25.notifications/error]))

(clojure.spec.alpha/def :portkey.aws.elastictranscoder.-2012-09-25/job-inputs (clojure.spec.alpha/coll-of :portkey.aws.elastictranscoder.-2012-09-25/job-input :max-count 200))

(clojure.spec.alpha/def :portkey.aws.elastictranscoder.-2012-09-25/delete-preset-request (clojure.spec.alpha/keys :req-un [:portkey.aws.elastictranscoder.-2012-09-25/id] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.elastictranscoder.-2012-09-25/internal-service-exception (clojure.spec.alpha/keys :req-un [] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.elastictranscoder.-2012-09-25.test-role-request/input-bucket (clojure.spec.alpha/and :portkey.aws.elastictranscoder.-2012-09-25/bucket-name))
(clojure.spec.alpha/def :portkey.aws.elastictranscoder.-2012-09-25.test-role-request/output-bucket (clojure.spec.alpha/and :portkey.aws.elastictranscoder.-2012-09-25/bucket-name))
(clojure.spec.alpha/def :portkey.aws.elastictranscoder.-2012-09-25.test-role-request/topics (clojure.spec.alpha/and :portkey.aws.elastictranscoder.-2012-09-25/sns-topics))
(clojure.spec.alpha/def :portkey.aws.elastictranscoder.-2012-09-25/test-role-request (clojure.spec.alpha/keys :req-un [:portkey.aws.elastictranscoder.-2012-09-25/role :portkey.aws.elastictranscoder.-2012-09-25.test-role-request/input-bucket :portkey.aws.elastictranscoder.-2012-09-25.test-role-request/output-bucket :portkey.aws.elastictranscoder.-2012-09-25.test-role-request/topics] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.elastictranscoder.-2012-09-25.caption-format/format (clojure.spec.alpha/and :portkey.aws.elastictranscoder.-2012-09-25/caption-format-format))
(clojure.spec.alpha/def :portkey.aws.elastictranscoder.-2012-09-25.caption-format/pattern (clojure.spec.alpha/and :portkey.aws.elastictranscoder.-2012-09-25/caption-format-pattern))
(clojure.spec.alpha/def :portkey.aws.elastictranscoder.-2012-09-25/caption-format (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.elastictranscoder.-2012-09-25.caption-format/format :portkey.aws.elastictranscoder.-2012-09-25.caption-format/pattern :portkey.aws.elastictranscoder.-2012-09-25/encryption]))

(clojure.spec.alpha/def :portkey.aws.elastictranscoder.-2012-09-25/base-64-encoded-string (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__27882__auto__] (clojure.core/re-matches #"^$|(^(?:[A-Za-z0-9\+/]{4})*(?:[A-Za-z0-9\+/]{2}==|[A-Za-z0-9\+/]{3}=)?$)" s__27882__auto__))))

(clojure.spec.alpha/def :portkey.aws.elastictranscoder.-2012-09-25/padding-policy (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__27882__auto__] (clojure.core/re-matches #"(^Pad$)|(^NoPad$)" s__27882__auto__))))

(clojure.spec.alpha/def :portkey.aws.elastictranscoder.-2012-09-25/id (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__27882__auto__] (clojure.core/re-matches #"^\d{13}-\w{6}$" s__27882__auto__))))

(clojure.spec.alpha/def :portkey.aws.elastictranscoder.-2012-09-25/read-pipeline-response (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.elastictranscoder.-2012-09-25/pipeline :portkey.aws.elastictranscoder.-2012-09-25/warnings]))

(clojure.spec.alpha/def :portkey.aws.elastictranscoder.-2012-09-25/delete-preset-response (clojure.spec.alpha/keys :req-un [] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.elastictranscoder.-2012-09-25/time (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__27882__auto__] (clojure.core/re-matches #"(^\d{1,5}(\.\d{0,3})?$)|(^([0-1]?[0-9]:|2[0-3]:)?([0-5]?[0-9]:)?[0-5]?[0-9](\.\d{0,3})?$)" s__27882__auto__))))

(clojure.spec.alpha/def :portkey.aws.elastictranscoder.-2012-09-25/long-key (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__27880__auto__] (clojure.core/<= 1 (clojure.core/count s__27880__auto__))) (clojure.core/fn [s__27881__auto__] (clojure.core/< (clojure.core/count s__27881__auto__) 1024))))

(clojure.spec.alpha/def :portkey.aws.elastictranscoder.-2012-09-25/zero-to-255-string (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__27880__auto__] (clojure.core/<= 0 (clojure.core/count s__27880__auto__))) (clojure.core/fn [s__27881__auto__] (clojure.core/< (clojure.core/count s__27881__auto__) 255))))

(clojure.spec.alpha/def :portkey.aws.elastictranscoder.-2012-09-25/job-outputs (clojure.spec.alpha/coll-of :portkey.aws.elastictranscoder.-2012-09-25/job-output))

(clojure.spec.alpha/def :portkey.aws.elastictranscoder.-2012-09-25.create-job-playlist/name (clojure.spec.alpha/and :portkey.aws.elastictranscoder.-2012-09-25/filename))
(clojure.spec.alpha/def :portkey.aws.elastictranscoder.-2012-09-25.create-job-playlist/format (clojure.spec.alpha/and :portkey.aws.elastictranscoder.-2012-09-25/playlist-format))
(clojure.spec.alpha/def :portkey.aws.elastictranscoder.-2012-09-25/create-job-playlist (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.elastictranscoder.-2012-09-25.create-job-playlist/name :portkey.aws.elastictranscoder.-2012-09-25.create-job-playlist/format :portkey.aws.elastictranscoder.-2012-09-25/output-keys :portkey.aws.elastictranscoder.-2012-09-25/hls-content-protection :portkey.aws.elastictranscoder.-2012-09-25/play-ready-drm]))

(clojure.spec.alpha/def :portkey.aws.elastictranscoder.-2012-09-25/create-job-playlists (clojure.spec.alpha/coll-of :portkey.aws.elastictranscoder.-2012-09-25/create-job-playlist :max-count 30))

(clojure.spec.alpha/def :portkey.aws.elastictranscoder.-2012-09-25/caption-format-pattern (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__27882__auto__] (clojure.core/re-matches #"(^$)|(^.*\{language\}.*$)" s__27882__auto__))))

(clojure.spec.alpha/def :portkey.aws.elastictranscoder.-2012-09-25/update-pipeline-notifications-response (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.elastictranscoder.-2012-09-25/pipeline]))

(clojure.spec.alpha/def :portkey.aws.elastictranscoder.-2012-09-25.create-job-output/thumbnail-encryption (clojure.spec.alpha/and :portkey.aws.elastictranscoder.-2012-09-25/encryption))
(clojure.spec.alpha/def :portkey.aws.elastictranscoder.-2012-09-25.create-job-output/preset-id (clojure.spec.alpha/and :portkey.aws.elastictranscoder.-2012-09-25/id))
(clojure.spec.alpha/def :portkey.aws.elastictranscoder.-2012-09-25.create-job-output/watermarks (clojure.spec.alpha/and :portkey.aws.elastictranscoder.-2012-09-25/job-watermarks))
(clojure.spec.alpha/def :portkey.aws.elastictranscoder.-2012-09-25.create-job-output/album-art (clojure.spec.alpha/and :portkey.aws.elastictranscoder.-2012-09-25/job-album-art))
(clojure.spec.alpha/def :portkey.aws.elastictranscoder.-2012-09-25.create-job-output/segment-duration (clojure.spec.alpha/and :portkey.aws.elastictranscoder.-2012-09-25/float-string))
(clojure.spec.alpha/def :portkey.aws.elastictranscoder.-2012-09-25/create-job-output (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.elastictranscoder.-2012-09-25/composition :portkey.aws.elastictranscoder.-2012-09-25/captions :portkey.aws.elastictranscoder.-2012-09-25.create-job-output/thumbnail-encryption :portkey.aws.elastictranscoder.-2012-09-25/thumbnail-pattern :portkey.aws.elastictranscoder.-2012-09-25.create-job-output/preset-id :portkey.aws.elastictranscoder.-2012-09-25/key :portkey.aws.elastictranscoder.-2012-09-25.create-job-output/watermarks :portkey.aws.elastictranscoder.-2012-09-25/rotate :portkey.aws.elastictranscoder.-2012-09-25.create-job-output/album-art :portkey.aws.elastictranscoder.-2012-09-25/encryption :portkey.aws.elastictranscoder.-2012-09-25.create-job-output/segment-duration]))

(clojure.spec.alpha/def :portkey.aws.elastictranscoder.-2012-09-25/horizontal-align (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__27882__auto__] (clojure.core/re-matches #"(^Left$)|(^Right$)|(^Center$)" s__27882__auto__))))

(clojure.core/defn create-pipeline ([create-pipeline-requestinput] (clojure.core/let [request-function-result__28521__auto__ (req-create-pipeline-request create-pipeline-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__28521__auto__ {:http.request.configuration/endpoints portkey.aws.elastictranscoder.-2012-09-25/endpoints, :http.request.configuration/target-prefix nil, :http.request.spec/output-spec :portkey.aws.elastictranscoder.-2012-09-25/create-pipeline-response, :http.request.configuration/mime-type {"content-type" "application/json"}, :http.request.configuration/request-uri "/2012-09-25/pipelines", :http.request.configuration/version "2012-09-25", :http.request.configuration/service-id "Elastic Transcoder", :http.request.spec/input-spec :portkey.aws.elastictranscoder.-2012-09-25/create-pipeline-request, :http.request.configuration/protocol "rest-json", :http.request.configuration/method :post, :http.request.configuration/response-code 201, :http.request.configuration/action "CreatePipeline", :http.request.spec/error-spec {"ValidationException" :portkey.aws.elastictranscoder.-2012-09-25/validation-exception, "IncompatibleVersionException" :portkey.aws.elastictranscoder.-2012-09-25/incompatible-version-exception, "AccessDeniedException" :portkey.aws.elastictranscoder.-2012-09-25/access-denied-exception, "ResourceNotFoundException" :portkey.aws.elastictranscoder.-2012-09-25/resource-not-found-exception, "LimitExceededException" :portkey.aws.elastictranscoder.-2012-09-25/limit-exceeded-exception, "InternalServiceException" :portkey.aws.elastictranscoder.-2012-09-25/internal-service-exception}})))))
(clojure.spec.alpha/fdef create-pipeline :args (clojure.spec.alpha/tuple :portkey.aws.elastictranscoder.-2012-09-25/create-pipeline-request) :ret (clojure.spec.alpha/and :portkey.aws.elastictranscoder.-2012-09-25/create-pipeline-response))

(clojure.core/defn list-pipelines ([] (list-pipelines {})) ([list-pipelines-requestinput] (clojure.core/let [request-function-result__28521__auto__ (req-list-pipelines-request list-pipelines-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__28521__auto__ {:http.request.configuration/endpoints portkey.aws.elastictranscoder.-2012-09-25/endpoints, :http.request.configuration/target-prefix nil, :http.request.spec/output-spec :portkey.aws.elastictranscoder.-2012-09-25/list-pipelines-response, :http.request.configuration/mime-type {"content-type" "application/json"}, :http.request.configuration/request-uri "/2012-09-25/pipelines", :http.request.configuration/version "2012-09-25", :http.request.configuration/service-id "Elastic Transcoder", :http.request.spec/input-spec :portkey.aws.elastictranscoder.-2012-09-25/list-pipelines-request, :http.request.configuration/protocol "rest-json", :http.request.configuration/method :get, :http.request.configuration/response-code nil, :http.request.configuration/action "ListPipelines", :http.request.spec/error-spec {"ValidationException" :portkey.aws.elastictranscoder.-2012-09-25/validation-exception, "IncompatibleVersionException" :portkey.aws.elastictranscoder.-2012-09-25/incompatible-version-exception, "AccessDeniedException" :portkey.aws.elastictranscoder.-2012-09-25/access-denied-exception, "InternalServiceException" :portkey.aws.elastictranscoder.-2012-09-25/internal-service-exception}})))))
(clojure.spec.alpha/fdef list-pipelines :args (clojure.spec.alpha/? :portkey.aws.elastictranscoder.-2012-09-25/list-pipelines-request) :ret (clojure.spec.alpha/and :portkey.aws.elastictranscoder.-2012-09-25/list-pipelines-response))

(clojure.core/defn read-preset ([read-preset-requestinput] (clojure.core/let [request-function-result__28521__auto__ (req-read-preset-request read-preset-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__28521__auto__ {:http.request.configuration/endpoints portkey.aws.elastictranscoder.-2012-09-25/endpoints, :http.request.configuration/target-prefix nil, :http.request.spec/output-spec :portkey.aws.elastictranscoder.-2012-09-25/read-preset-response, :http.request.configuration/mime-type {"content-type" "application/json"}, :http.request.configuration/request-uri "/2012-09-25/presets/{Id}", :http.request.configuration/version "2012-09-25", :http.request.configuration/service-id "Elastic Transcoder", :http.request.spec/input-spec :portkey.aws.elastictranscoder.-2012-09-25/read-preset-request, :http.request.configuration/protocol "rest-json", :http.request.configuration/method :get, :http.request.configuration/response-code nil, :http.request.configuration/action "ReadPreset", :http.request.spec/error-spec {"ValidationException" :portkey.aws.elastictranscoder.-2012-09-25/validation-exception, "IncompatibleVersionException" :portkey.aws.elastictranscoder.-2012-09-25/incompatible-version-exception, "ResourceNotFoundException" :portkey.aws.elastictranscoder.-2012-09-25/resource-not-found-exception, "AccessDeniedException" :portkey.aws.elastictranscoder.-2012-09-25/access-denied-exception, "InternalServiceException" :portkey.aws.elastictranscoder.-2012-09-25/internal-service-exception}})))))
(clojure.spec.alpha/fdef read-preset :args (clojure.spec.alpha/tuple :portkey.aws.elastictranscoder.-2012-09-25/read-preset-request) :ret (clojure.spec.alpha/and :portkey.aws.elastictranscoder.-2012-09-25/read-preset-response))

(clojure.core/defn read-pipeline ([read-pipeline-requestinput] (clojure.core/let [request-function-result__28521__auto__ (req-read-pipeline-request read-pipeline-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__28521__auto__ {:http.request.configuration/endpoints portkey.aws.elastictranscoder.-2012-09-25/endpoints, :http.request.configuration/target-prefix nil, :http.request.spec/output-spec :portkey.aws.elastictranscoder.-2012-09-25/read-pipeline-response, :http.request.configuration/mime-type {"content-type" "application/json"}, :http.request.configuration/request-uri "/2012-09-25/pipelines/{Id}", :http.request.configuration/version "2012-09-25", :http.request.configuration/service-id "Elastic Transcoder", :http.request.spec/input-spec :portkey.aws.elastictranscoder.-2012-09-25/read-pipeline-request, :http.request.configuration/protocol "rest-json", :http.request.configuration/method :get, :http.request.configuration/response-code nil, :http.request.configuration/action "ReadPipeline", :http.request.spec/error-spec {"ValidationException" :portkey.aws.elastictranscoder.-2012-09-25/validation-exception, "IncompatibleVersionException" :portkey.aws.elastictranscoder.-2012-09-25/incompatible-version-exception, "ResourceNotFoundException" :portkey.aws.elastictranscoder.-2012-09-25/resource-not-found-exception, "AccessDeniedException" :portkey.aws.elastictranscoder.-2012-09-25/access-denied-exception, "InternalServiceException" :portkey.aws.elastictranscoder.-2012-09-25/internal-service-exception}})))))
(clojure.spec.alpha/fdef read-pipeline :args (clojure.spec.alpha/tuple :portkey.aws.elastictranscoder.-2012-09-25/read-pipeline-request) :ret (clojure.spec.alpha/and :portkey.aws.elastictranscoder.-2012-09-25/read-pipeline-response))

(clojure.core/defn list-jobs-by-pipeline ([list-jobs-by-pipeline-requestinput] (clojure.core/let [request-function-result__28521__auto__ (req-list-jobs-by-pipeline-request list-jobs-by-pipeline-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__28521__auto__ {:http.request.configuration/endpoints portkey.aws.elastictranscoder.-2012-09-25/endpoints, :http.request.configuration/target-prefix nil, :http.request.spec/output-spec :portkey.aws.elastictranscoder.-2012-09-25/list-jobs-by-pipeline-response, :http.request.configuration/mime-type {"content-type" "application/json"}, :http.request.configuration/request-uri "/2012-09-25/jobsByPipeline/{PipelineId}", :http.request.configuration/version "2012-09-25", :http.request.configuration/service-id "Elastic Transcoder", :http.request.spec/input-spec :portkey.aws.elastictranscoder.-2012-09-25/list-jobs-by-pipeline-request, :http.request.configuration/protocol "rest-json", :http.request.configuration/method :get, :http.request.configuration/response-code nil, :http.request.configuration/action "ListJobsByPipeline", :http.request.spec/error-spec {"ValidationException" :portkey.aws.elastictranscoder.-2012-09-25/validation-exception, "IncompatibleVersionException" :portkey.aws.elastictranscoder.-2012-09-25/incompatible-version-exception, "ResourceNotFoundException" :portkey.aws.elastictranscoder.-2012-09-25/resource-not-found-exception, "AccessDeniedException" :portkey.aws.elastictranscoder.-2012-09-25/access-denied-exception, "InternalServiceException" :portkey.aws.elastictranscoder.-2012-09-25/internal-service-exception}})))))
(clojure.spec.alpha/fdef list-jobs-by-pipeline :args (clojure.spec.alpha/tuple :portkey.aws.elastictranscoder.-2012-09-25/list-jobs-by-pipeline-request) :ret (clojure.spec.alpha/and :portkey.aws.elastictranscoder.-2012-09-25/list-jobs-by-pipeline-response))

(clojure.core/defn update-pipeline-notifications ([update-pipeline-notifications-requestinput] (clojure.core/let [request-function-result__28521__auto__ (req-update-pipeline-notifications-request update-pipeline-notifications-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__28521__auto__ {:http.request.configuration/endpoints portkey.aws.elastictranscoder.-2012-09-25/endpoints, :http.request.configuration/target-prefix nil, :http.request.spec/output-spec :portkey.aws.elastictranscoder.-2012-09-25/update-pipeline-notifications-response, :http.request.configuration/mime-type {"content-type" "application/json"}, :http.request.configuration/request-uri "/2012-09-25/pipelines/{Id}/notifications", :http.request.configuration/version "2012-09-25", :http.request.configuration/service-id "Elastic Transcoder", :http.request.spec/input-spec :portkey.aws.elastictranscoder.-2012-09-25/update-pipeline-notifications-request, :http.request.configuration/protocol "rest-json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/action "UpdatePipelineNotifications", :http.request.spec/error-spec {"ValidationException" :portkey.aws.elastictranscoder.-2012-09-25/validation-exception, "IncompatibleVersionException" :portkey.aws.elastictranscoder.-2012-09-25/incompatible-version-exception, "ResourceNotFoundException" :portkey.aws.elastictranscoder.-2012-09-25/resource-not-found-exception, "ResourceInUseException" :portkey.aws.elastictranscoder.-2012-09-25/resource-in-use-exception, "AccessDeniedException" :portkey.aws.elastictranscoder.-2012-09-25/access-denied-exception, "InternalServiceException" :portkey.aws.elastictranscoder.-2012-09-25/internal-service-exception}})))))
(clojure.spec.alpha/fdef update-pipeline-notifications :args (clojure.spec.alpha/tuple :portkey.aws.elastictranscoder.-2012-09-25/update-pipeline-notifications-request) :ret (clojure.spec.alpha/and :portkey.aws.elastictranscoder.-2012-09-25/update-pipeline-notifications-response))

(clojure.core/defn create-preset ([create-preset-requestinput] (clojure.core/let [request-function-result__28521__auto__ (req-create-preset-request create-preset-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__28521__auto__ {:http.request.configuration/endpoints portkey.aws.elastictranscoder.-2012-09-25/endpoints, :http.request.configuration/target-prefix nil, :http.request.spec/output-spec :portkey.aws.elastictranscoder.-2012-09-25/create-preset-response, :http.request.configuration/mime-type {"content-type" "application/json"}, :http.request.configuration/request-uri "/2012-09-25/presets", :http.request.configuration/version "2012-09-25", :http.request.configuration/service-id "Elastic Transcoder", :http.request.spec/input-spec :portkey.aws.elastictranscoder.-2012-09-25/create-preset-request, :http.request.configuration/protocol "rest-json", :http.request.configuration/method :post, :http.request.configuration/response-code 201, :http.request.configuration/action "CreatePreset", :http.request.spec/error-spec {"ValidationException" :portkey.aws.elastictranscoder.-2012-09-25/validation-exception, "IncompatibleVersionException" :portkey.aws.elastictranscoder.-2012-09-25/incompatible-version-exception, "AccessDeniedException" :portkey.aws.elastictranscoder.-2012-09-25/access-denied-exception, "LimitExceededException" :portkey.aws.elastictranscoder.-2012-09-25/limit-exceeded-exception, "InternalServiceException" :portkey.aws.elastictranscoder.-2012-09-25/internal-service-exception}})))))
(clojure.spec.alpha/fdef create-preset :args (clojure.spec.alpha/tuple :portkey.aws.elastictranscoder.-2012-09-25/create-preset-request) :ret (clojure.spec.alpha/and :portkey.aws.elastictranscoder.-2012-09-25/create-preset-response))

(clojure.core/defn delete-pipeline ([delete-pipeline-requestinput] (clojure.core/let [request-function-result__28521__auto__ (req-delete-pipeline-request delete-pipeline-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__28521__auto__ {:http.request.configuration/endpoints portkey.aws.elastictranscoder.-2012-09-25/endpoints, :http.request.configuration/target-prefix nil, :http.request.spec/output-spec :portkey.aws.elastictranscoder.-2012-09-25/delete-pipeline-response, :http.request.configuration/mime-type {"content-type" "application/json"}, :http.request.configuration/request-uri "/2012-09-25/pipelines/{Id}", :http.request.configuration/version "2012-09-25", :http.request.configuration/service-id "Elastic Transcoder", :http.request.spec/input-spec :portkey.aws.elastictranscoder.-2012-09-25/delete-pipeline-request, :http.request.configuration/protocol "rest-json", :http.request.configuration/method :delete, :http.request.configuration/response-code 202, :http.request.configuration/action "DeletePipeline", :http.request.spec/error-spec {"ValidationException" :portkey.aws.elastictranscoder.-2012-09-25/validation-exception, "IncompatibleVersionException" :portkey.aws.elastictranscoder.-2012-09-25/incompatible-version-exception, "ResourceNotFoundException" :portkey.aws.elastictranscoder.-2012-09-25/resource-not-found-exception, "ResourceInUseException" :portkey.aws.elastictranscoder.-2012-09-25/resource-in-use-exception, "AccessDeniedException" :portkey.aws.elastictranscoder.-2012-09-25/access-denied-exception, "InternalServiceException" :portkey.aws.elastictranscoder.-2012-09-25/internal-service-exception}})))))
(clojure.spec.alpha/fdef delete-pipeline :args (clojure.spec.alpha/tuple :portkey.aws.elastictranscoder.-2012-09-25/delete-pipeline-request) :ret (clojure.spec.alpha/and :portkey.aws.elastictranscoder.-2012-09-25/delete-pipeline-response))

(clojure.core/defn list-jobs-by-status ([list-jobs-by-status-requestinput] (clojure.core/let [request-function-result__28521__auto__ (req-list-jobs-by-status-request list-jobs-by-status-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__28521__auto__ {:http.request.configuration/endpoints portkey.aws.elastictranscoder.-2012-09-25/endpoints, :http.request.configuration/target-prefix nil, :http.request.spec/output-spec :portkey.aws.elastictranscoder.-2012-09-25/list-jobs-by-status-response, :http.request.configuration/mime-type {"content-type" "application/json"}, :http.request.configuration/request-uri "/2012-09-25/jobsByStatus/{Status}", :http.request.configuration/version "2012-09-25", :http.request.configuration/service-id "Elastic Transcoder", :http.request.spec/input-spec :portkey.aws.elastictranscoder.-2012-09-25/list-jobs-by-status-request, :http.request.configuration/protocol "rest-json", :http.request.configuration/method :get, :http.request.configuration/response-code nil, :http.request.configuration/action "ListJobsByStatus", :http.request.spec/error-spec {"ValidationException" :portkey.aws.elastictranscoder.-2012-09-25/validation-exception, "IncompatibleVersionException" :portkey.aws.elastictranscoder.-2012-09-25/incompatible-version-exception, "ResourceNotFoundException" :portkey.aws.elastictranscoder.-2012-09-25/resource-not-found-exception, "AccessDeniedException" :portkey.aws.elastictranscoder.-2012-09-25/access-denied-exception, "InternalServiceException" :portkey.aws.elastictranscoder.-2012-09-25/internal-service-exception}})))))
(clojure.spec.alpha/fdef list-jobs-by-status :args (clojure.spec.alpha/tuple :portkey.aws.elastictranscoder.-2012-09-25/list-jobs-by-status-request) :ret (clojure.spec.alpha/and :portkey.aws.elastictranscoder.-2012-09-25/list-jobs-by-status-response))

(clojure.core/defn create-job ([create-job-requestinput] (clojure.core/let [request-function-result__28521__auto__ (req-create-job-request create-job-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__28521__auto__ {:http.request.configuration/endpoints portkey.aws.elastictranscoder.-2012-09-25/endpoints, :http.request.configuration/target-prefix nil, :http.request.spec/output-spec :portkey.aws.elastictranscoder.-2012-09-25/create-job-response, :http.request.configuration/mime-type {"content-type" "application/json"}, :http.request.configuration/request-uri "/2012-09-25/jobs", :http.request.configuration/version "2012-09-25", :http.request.configuration/service-id "Elastic Transcoder", :http.request.spec/input-spec :portkey.aws.elastictranscoder.-2012-09-25/create-job-request, :http.request.configuration/protocol "rest-json", :http.request.configuration/method :post, :http.request.configuration/response-code 201, :http.request.configuration/action "CreateJob", :http.request.spec/error-spec {"ValidationException" :portkey.aws.elastictranscoder.-2012-09-25/validation-exception, "IncompatibleVersionException" :portkey.aws.elastictranscoder.-2012-09-25/incompatible-version-exception, "ResourceNotFoundException" :portkey.aws.elastictranscoder.-2012-09-25/resource-not-found-exception, "AccessDeniedException" :portkey.aws.elastictranscoder.-2012-09-25/access-denied-exception, "LimitExceededException" :portkey.aws.elastictranscoder.-2012-09-25/limit-exceeded-exception, "InternalServiceException" :portkey.aws.elastictranscoder.-2012-09-25/internal-service-exception}})))))
(clojure.spec.alpha/fdef create-job :args (clojure.spec.alpha/tuple :portkey.aws.elastictranscoder.-2012-09-25/create-job-request) :ret (clojure.spec.alpha/and :portkey.aws.elastictranscoder.-2012-09-25/create-job-response))

(clojure.core/defn delete-preset ([delete-preset-requestinput] (clojure.core/let [request-function-result__28521__auto__ (req-delete-preset-request delete-preset-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__28521__auto__ {:http.request.configuration/endpoints portkey.aws.elastictranscoder.-2012-09-25/endpoints, :http.request.configuration/target-prefix nil, :http.request.spec/output-spec :portkey.aws.elastictranscoder.-2012-09-25/delete-preset-response, :http.request.configuration/mime-type {"content-type" "application/json"}, :http.request.configuration/request-uri "/2012-09-25/presets/{Id}", :http.request.configuration/version "2012-09-25", :http.request.configuration/service-id "Elastic Transcoder", :http.request.spec/input-spec :portkey.aws.elastictranscoder.-2012-09-25/delete-preset-request, :http.request.configuration/protocol "rest-json", :http.request.configuration/method :delete, :http.request.configuration/response-code 202, :http.request.configuration/action "DeletePreset", :http.request.spec/error-spec {"ValidationException" :portkey.aws.elastictranscoder.-2012-09-25/validation-exception, "IncompatibleVersionException" :portkey.aws.elastictranscoder.-2012-09-25/incompatible-version-exception, "ResourceNotFoundException" :portkey.aws.elastictranscoder.-2012-09-25/resource-not-found-exception, "AccessDeniedException" :portkey.aws.elastictranscoder.-2012-09-25/access-denied-exception, "InternalServiceException" :portkey.aws.elastictranscoder.-2012-09-25/internal-service-exception}})))))
(clojure.spec.alpha/fdef delete-preset :args (clojure.spec.alpha/tuple :portkey.aws.elastictranscoder.-2012-09-25/delete-preset-request) :ret (clojure.spec.alpha/and :portkey.aws.elastictranscoder.-2012-09-25/delete-preset-response))

(clojure.core/defn update-pipeline ([update-pipeline-requestinput] (clojure.core/let [request-function-result__28521__auto__ (req-update-pipeline-request update-pipeline-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__28521__auto__ {:http.request.configuration/endpoints portkey.aws.elastictranscoder.-2012-09-25/endpoints, :http.request.configuration/target-prefix nil, :http.request.spec/output-spec :portkey.aws.elastictranscoder.-2012-09-25/update-pipeline-response, :http.request.configuration/mime-type {"content-type" "application/json"}, :http.request.configuration/request-uri "/2012-09-25/pipelines/{Id}", :http.request.configuration/version "2012-09-25", :http.request.configuration/service-id "Elastic Transcoder", :http.request.spec/input-spec :portkey.aws.elastictranscoder.-2012-09-25/update-pipeline-request, :http.request.configuration/protocol "rest-json", :http.request.configuration/method :put, :http.request.configuration/response-code 200, :http.request.configuration/action "UpdatePipeline", :http.request.spec/error-spec {"ValidationException" :portkey.aws.elastictranscoder.-2012-09-25/validation-exception, "IncompatibleVersionException" :portkey.aws.elastictranscoder.-2012-09-25/incompatible-version-exception, "AccessDeniedException" :portkey.aws.elastictranscoder.-2012-09-25/access-denied-exception, "ResourceInUseException" :portkey.aws.elastictranscoder.-2012-09-25/resource-in-use-exception, "ResourceNotFoundException" :portkey.aws.elastictranscoder.-2012-09-25/resource-not-found-exception, "InternalServiceException" :portkey.aws.elastictranscoder.-2012-09-25/internal-service-exception}})))))
(clojure.spec.alpha/fdef update-pipeline :args (clojure.spec.alpha/tuple :portkey.aws.elastictranscoder.-2012-09-25/update-pipeline-request) :ret (clojure.spec.alpha/and :portkey.aws.elastictranscoder.-2012-09-25/update-pipeline-response))

(clojure.core/defn read-job ([read-job-requestinput] (clojure.core/let [request-function-result__28521__auto__ (req-read-job-request read-job-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__28521__auto__ {:http.request.configuration/endpoints portkey.aws.elastictranscoder.-2012-09-25/endpoints, :http.request.configuration/target-prefix nil, :http.request.spec/output-spec :portkey.aws.elastictranscoder.-2012-09-25/read-job-response, :http.request.configuration/mime-type {"content-type" "application/json"}, :http.request.configuration/request-uri "/2012-09-25/jobs/{Id}", :http.request.configuration/version "2012-09-25", :http.request.configuration/service-id "Elastic Transcoder", :http.request.spec/input-spec :portkey.aws.elastictranscoder.-2012-09-25/read-job-request, :http.request.configuration/protocol "rest-json", :http.request.configuration/method :get, :http.request.configuration/response-code nil, :http.request.configuration/action "ReadJob", :http.request.spec/error-spec {"ValidationException" :portkey.aws.elastictranscoder.-2012-09-25/validation-exception, "IncompatibleVersionException" :portkey.aws.elastictranscoder.-2012-09-25/incompatible-version-exception, "ResourceNotFoundException" :portkey.aws.elastictranscoder.-2012-09-25/resource-not-found-exception, "AccessDeniedException" :portkey.aws.elastictranscoder.-2012-09-25/access-denied-exception, "InternalServiceException" :portkey.aws.elastictranscoder.-2012-09-25/internal-service-exception}})))))
(clojure.spec.alpha/fdef read-job :args (clojure.spec.alpha/tuple :portkey.aws.elastictranscoder.-2012-09-25/read-job-request) :ret (clojure.spec.alpha/and :portkey.aws.elastictranscoder.-2012-09-25/read-job-response))

(clojure.core/defn update-pipeline-status ([update-pipeline-status-requestinput] (clojure.core/let [request-function-result__28521__auto__ (req-update-pipeline-status-request update-pipeline-status-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__28521__auto__ {:http.request.configuration/endpoints portkey.aws.elastictranscoder.-2012-09-25/endpoints, :http.request.configuration/target-prefix nil, :http.request.spec/output-spec :portkey.aws.elastictranscoder.-2012-09-25/update-pipeline-status-response, :http.request.configuration/mime-type {"content-type" "application/json"}, :http.request.configuration/request-uri "/2012-09-25/pipelines/{Id}/status", :http.request.configuration/version "2012-09-25", :http.request.configuration/service-id "Elastic Transcoder", :http.request.spec/input-spec :portkey.aws.elastictranscoder.-2012-09-25/update-pipeline-status-request, :http.request.configuration/protocol "rest-json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/action "UpdatePipelineStatus", :http.request.spec/error-spec {"ValidationException" :portkey.aws.elastictranscoder.-2012-09-25/validation-exception, "IncompatibleVersionException" :portkey.aws.elastictranscoder.-2012-09-25/incompatible-version-exception, "ResourceNotFoundException" :portkey.aws.elastictranscoder.-2012-09-25/resource-not-found-exception, "ResourceInUseException" :portkey.aws.elastictranscoder.-2012-09-25/resource-in-use-exception, "AccessDeniedException" :portkey.aws.elastictranscoder.-2012-09-25/access-denied-exception, "InternalServiceException" :portkey.aws.elastictranscoder.-2012-09-25/internal-service-exception}})))))
(clojure.spec.alpha/fdef update-pipeline-status :args (clojure.spec.alpha/tuple :portkey.aws.elastictranscoder.-2012-09-25/update-pipeline-status-request) :ret (clojure.spec.alpha/and :portkey.aws.elastictranscoder.-2012-09-25/update-pipeline-status-response))

(clojure.core/defn test-role ([test-role-requestinput] (clojure.core/let [request-function-result__28521__auto__ (req-test-role-request test-role-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__28521__auto__ {:http.request.configuration/endpoints portkey.aws.elastictranscoder.-2012-09-25/endpoints, :http.request.configuration/target-prefix nil, :http.request.spec/output-spec :portkey.aws.elastictranscoder.-2012-09-25/test-role-response, :http.request.configuration/mime-type {"content-type" "application/json"}, :http.request.configuration/request-uri "/2012-09-25/roleTests", :http.request.configuration/version "2012-09-25", :http.request.configuration/service-id "Elastic Transcoder", :http.request.spec/input-spec :portkey.aws.elastictranscoder.-2012-09-25/test-role-request, :http.request.configuration/protocol "rest-json", :http.request.configuration/method :post, :http.request.configuration/response-code 200, :http.request.configuration/action "TestRole", :http.request.spec/error-spec {"ValidationException" :portkey.aws.elastictranscoder.-2012-09-25/validation-exception, "IncompatibleVersionException" :portkey.aws.elastictranscoder.-2012-09-25/incompatible-version-exception, "ResourceNotFoundException" :portkey.aws.elastictranscoder.-2012-09-25/resource-not-found-exception, "AccessDeniedException" :portkey.aws.elastictranscoder.-2012-09-25/access-denied-exception, "InternalServiceException" :portkey.aws.elastictranscoder.-2012-09-25/internal-service-exception}})))))
(clojure.spec.alpha/fdef test-role :args (clojure.spec.alpha/tuple :portkey.aws.elastictranscoder.-2012-09-25/test-role-request) :ret (clojure.spec.alpha/and :portkey.aws.elastictranscoder.-2012-09-25/test-role-response))

(clojure.core/defn list-presets ([] (list-presets {})) ([list-presets-requestinput] (clojure.core/let [request-function-result__28521__auto__ (req-list-presets-request list-presets-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__28521__auto__ {:http.request.configuration/endpoints portkey.aws.elastictranscoder.-2012-09-25/endpoints, :http.request.configuration/target-prefix nil, :http.request.spec/output-spec :portkey.aws.elastictranscoder.-2012-09-25/list-presets-response, :http.request.configuration/mime-type {"content-type" "application/json"}, :http.request.configuration/request-uri "/2012-09-25/presets", :http.request.configuration/version "2012-09-25", :http.request.configuration/service-id "Elastic Transcoder", :http.request.spec/input-spec :portkey.aws.elastictranscoder.-2012-09-25/list-presets-request, :http.request.configuration/protocol "rest-json", :http.request.configuration/method :get, :http.request.configuration/response-code nil, :http.request.configuration/action "ListPresets", :http.request.spec/error-spec {"ValidationException" :portkey.aws.elastictranscoder.-2012-09-25/validation-exception, "IncompatibleVersionException" :portkey.aws.elastictranscoder.-2012-09-25/incompatible-version-exception, "AccessDeniedException" :portkey.aws.elastictranscoder.-2012-09-25/access-denied-exception, "InternalServiceException" :portkey.aws.elastictranscoder.-2012-09-25/internal-service-exception}})))))
(clojure.spec.alpha/fdef list-presets :args (clojure.spec.alpha/? :portkey.aws.elastictranscoder.-2012-09-25/list-presets-request) :ret (clojure.spec.alpha/and :portkey.aws.elastictranscoder.-2012-09-25/list-presets-response))

(clojure.core/defn cancel-job ([cancel-job-requestinput] (clojure.core/let [request-function-result__28521__auto__ (req-cancel-job-request cancel-job-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__28521__auto__ {:http.request.configuration/endpoints portkey.aws.elastictranscoder.-2012-09-25/endpoints, :http.request.configuration/target-prefix nil, :http.request.spec/output-spec :portkey.aws.elastictranscoder.-2012-09-25/cancel-job-response, :http.request.configuration/mime-type {"content-type" "application/json"}, :http.request.configuration/request-uri "/2012-09-25/jobs/{Id}", :http.request.configuration/version "2012-09-25", :http.request.configuration/service-id "Elastic Transcoder", :http.request.spec/input-spec :portkey.aws.elastictranscoder.-2012-09-25/cancel-job-request, :http.request.configuration/protocol "rest-json", :http.request.configuration/method :delete, :http.request.configuration/response-code 202, :http.request.configuration/action "CancelJob", :http.request.spec/error-spec {"ValidationException" :portkey.aws.elastictranscoder.-2012-09-25/validation-exception, "IncompatibleVersionException" :portkey.aws.elastictranscoder.-2012-09-25/incompatible-version-exception, "ResourceNotFoundException" :portkey.aws.elastictranscoder.-2012-09-25/resource-not-found-exception, "ResourceInUseException" :portkey.aws.elastictranscoder.-2012-09-25/resource-in-use-exception, "AccessDeniedException" :portkey.aws.elastictranscoder.-2012-09-25/access-denied-exception, "InternalServiceException" :portkey.aws.elastictranscoder.-2012-09-25/internal-service-exception}})))))
(clojure.spec.alpha/fdef cancel-job :args (clojure.spec.alpha/tuple :portkey.aws.elastictranscoder.-2012-09-25/cancel-job-request) :ret (clojure.spec.alpha/and :portkey.aws.elastictranscoder.-2012-09-25/cancel-job-response))
