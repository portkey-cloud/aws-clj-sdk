(ns portkey.aws.medialive (:require [portkey.aws]))

(def
 endpoints
 '{"ap-northeast-1"
   {:credential-scope {:service "medialive", :region "ap-northeast-1"},
    :ssl-common-name "medialive.ap-northeast-1.amazonaws.com",
    :endpoint "https://medialive.ap-northeast-1.amazonaws.com",
    :signature-version :v4},
   "eu-west-1"
   {:credential-scope {:service "medialive", :region "eu-west-1"},
    :ssl-common-name "medialive.eu-west-1.amazonaws.com",
    :endpoint "https://medialive.eu-west-1.amazonaws.com",
    :signature-version :v4},
   "ap-southeast-2"
   {:credential-scope {:service "medialive", :region "ap-southeast-2"},
    :ssl-common-name "medialive.ap-southeast-2.amazonaws.com",
    :endpoint "https://medialive.ap-southeast-2.amazonaws.com",
    :signature-version :v4},
   "sa-east-1"
   {:credential-scope {:service "medialive", :region "sa-east-1"},
    :ssl-common-name "medialive.sa-east-1.amazonaws.com",
    :endpoint "https://medialive.sa-east-1.amazonaws.com",
    :signature-version :v4},
   "ap-southeast-1"
   {:credential-scope {:service "medialive", :region "ap-southeast-1"},
    :ssl-common-name "medialive.ap-southeast-1.amazonaws.com",
    :endpoint "https://medialive.ap-southeast-1.amazonaws.com",
    :signature-version :v4},
   "ap-northeast-2"
   {:credential-scope {:service "medialive", :region "ap-northeast-2"},
    :ssl-common-name "medialive.ap-northeast-2.amazonaws.com",
    :endpoint "https://medialive.ap-northeast-2.amazonaws.com",
    :signature-version :v4},
   "eu-central-1"
   {:credential-scope {:service "medialive", :region "eu-central-1"},
    :ssl-common-name "medialive.eu-central-1.amazonaws.com",
    :endpoint "https://medialive.eu-central-1.amazonaws.com",
    :signature-version :v4},
   "us-west-2"
   {:credential-scope {:service "medialive", :region "us-west-2"},
    :ssl-common-name "medialive.us-west-2.amazonaws.com",
    :endpoint "https://medialive.us-west-2.amazonaws.com",
    :signature-version :v4},
   "us-east-1"
   {:credential-scope {:service "medialive", :region "us-east-1"},
    :ssl-common-name "medialive.us-east-1.amazonaws.com",
    :endpoint "https://medialive.us-east-1.amazonaws.com",
    :signature-version :v4},
   "ap-south-1"
   {:credential-scope {:service "medialive", :region "ap-south-1"},
    :ssl-common-name "medialive.ap-south-1.amazonaws.com",
    :endpoint "https://medialive.ap-south-1.amazonaws.com",
    :signature-version :v4}})

(clojure.core/declare ser-hls-manifest-compression)

(clojure.core/declare ser-hls-encryption-type)

(clojure.core/declare ser-integer-min-0-max-600)

(clojure.core/declare ser-output-location-ref)

(clojure.core/declare ser-hls-manifest-duration-format)

(clojure.core/declare ser-integer-min-1000)

(clojure.core/declare ser-integer-min-negative-60-max-6)

(clojure.core/declare ser-scte-35-apos-no-regional-blackout-behavior)

(clojure.core/declare ser-input-filter)

(clojure.core/declare ser-audio-selector-settings)

(clojure.core/declare ser-audio-description-audio-type-control)

(clojure.core/declare ser-list-of-video-description)

(clojure.core/declare ser-integer-min-0-max-1000)

(clojure.core/declare ser-integer-min-0-max-65536)

(clojure.core/declare ser-h-264-adaptive-quantization)

(clojure.core/declare ser-integer-min-1-max-1000000)

(clojure.core/declare ser-integer-min-25-max-2000)

(clojure.core/declare ser-input-loss-action-for-hls-out)

(clojure.core/declare ser-input-source-end-behavior)

(clojure.core/declare ser-ttml-destination-style-control)

(clojure.core/declare ser-dvb-sdt-output-sdt)

(clojure.core/declare ser-ttml-destination-settings)

(clojure.core/declare ser-integer-min-1-max-4)

(clojure.core/declare ser-m-2ts-pcr-control)

(clojure.core/declare ser-h-264-scan-type)

(clojure.core/declare ser-scte-35-device-restrictions)

(clojure.core/declare ser-remix-settings)

(clojure.core/declare ser-dvb-tdt-settings)

(clojure.core/declare ser-scte-35-time-signal-schedule-action-settings)

(clojure.core/declare ser-audio-type)

(clojure.core/declare ser-audio-normalization-algorithm-control)

(clojure.core/declare ser-integer-min-0-max-1099511627775)

(clojure.core/declare ser-fixed-mode-schedule-action-start-settings)

(clojure.core/declare ser-burn-in-destination-settings)

(clojure.core/declare ser-eac-3-drc-rf)

(clojure.core/declare ser-audio-description)

(clojure.core/declare ser-batch-schedule-action-create-request)

(clojure.core/declare ser-aac-vbr-quality)

(clojure.core/declare ser-hls-basic-put-settings)

(clojure.core/declare ser-m-2ts-klv)

(clojure.core/declare ser-global-configuration)

(clojure.core/declare ser-m-3u-8-pcr-control)

(clojure.core/declare ser-archive-output-settings)

(clojure.core/declare ser-string-min-6-max-6)

(clojure.core/declare ser-m-2ts-audio-buffer-model)

(clojure.core/declare ser-h-264-gop-size-units)

(clojure.core/declare ser-hls-directory-structure)

(clojure.core/declare ser-frame-capture-output-settings)

(clojure.core/declare ser-m-2ts-ebp-placement)

(clojure.core/declare ser-dvb-sub-destination-teletext-grid-control)

(clojure.core/declare ser-eac-3-settings)

(clojure.core/declare ser-audio-normalization-algorithm)

(clojure.core/declare ser-follow-mode-schedule-action-start-settings)

(clojure.core/declare ser-rtmp-caption-data)

(clojure.core/declare ser-hls-mode)

(clojure.core/declare ser-log-level)

(clojure.core/declare ser-follow-point)

(clojure.core/declare ser-integer-min-0-max-500)

(clojure.core/declare ser-i-frame-only-playlist-type)

(clojure.core/declare ser-input-loss-behavior)

(clojure.core/declare ser-input-loss-image-type)

(clojure.core/declare ser-list-of-output-destination-settings)

(clojure.core/declare ser-udp-group-settings)

(clojure.core/declare ser-input-whitelist-rule-cidr)

(clojure.core/declare ser-m-2ts-arib)

(clojure.core/declare ser-dvb-sub-destination-font-color)

(clojure.core/declare ser-input-type)

(clojure.core/declare ser-dvb-sdt-settings)

(clojure.core/declare ser-burn-in-background-color)

(clojure.core/declare ser-video-selector-program-id)

(clojure.core/declare ser-archive-group-settings)

(clojure.core/declare ser-hls-timed-metadata-schedule-action-settings)

(clojure.core/declare ser-udp-output-settings)

(clojure.core/declare ser-udp-timed-metadata-id-3-frame)

(clojure.core/declare ser-input-destination-request)

(clojure.core/declare ser-integer-min-0)

(clojure.core/declare ser-hls-settings)

(clojure.core/declare ser-scte-35-splice-insert-schedule-action-settings)

(clojure.core/declare ser-ac-3-lfe-filter)

(clojure.core/declare ser-burn-in-teletext-grid-control)

(clojure.core/declare ser-scte-27-destination-settings)

(clojure.core/declare ser-schedule-action)

(clojure.core/declare ser-video-selector-color-space-usage)

(clojure.core/declare ser-scte-20-source-settings)

(clojure.core/declare ser-hls-stream-inf-resolution)

(clojure.core/declare ser-list-of-schedule-action)

(clojure.core/declare ser-hls-caption-language-setting)

(clojure.core/declare ser-list-of-input-whitelist-rule-cidr)

(clojure.core/declare ser-m-2ts-settings)

(clojure.core/declare ser-string)

(clojure.core/declare ser-scte-35-splice-insert-no-regional-blackout-behavior)

(clojure.core/declare ser-dvb-sub-source-settings)

(clojure.core/declare ser-input-denoise-filter)

(clojure.core/declare ser-video-selector-pid)

(clojure.core/declare ser-scte-35-descriptor-settings)

(clojure.core/declare ser-afd-signaling)

(clojure.core/declare ser-list-of-audio-selector)

(clojure.core/declare ser-aac-profile)

(clojure.core/declare ser-burn-in-font-color)

(clojure.core/declare ser-pause-state-schedule-action-settings)

(clojure.core/declare ser-input-source-request)

(clojure.core/declare ser-eac-3-metadata-control)

(clojure.core/declare ser-fec-output-settings)

(clojure.core/declare ser-global-configuration-input-end-action)

(clojure.core/declare ser-integer-min-0-max-65535)

(clojure.core/declare ser-hls-webdav-http-transfer-mode)

(clojure.core/declare ser-hls-webdav-settings)

(clojure.core/declare ser-double-min-1)

(clojure.core/declare ser-dvb-sub-destination-background-color)

(clojure.core/declare ser-mp-2-coding-mode)

(clojure.core/declare ser-list-of-output-group)

(clojure.core/declare ser-scte-35-delivery-restrictions)

(clojure.core/declare ser-m-2ts-timed-metadata-behavior)

(clojure.core/declare ser-tags)

(clojure.core/declare ser-fec-output-include-fec)

(clojure.core/declare ser-scte-35-segmentation-cancel-indicator)

(clojure.core/declare ser-rtmp-output-certificate-mode)

(clojure.core/declare ser-ac-3-drc-profile)

(clojure.core/declare ser-eac-3-lfe-control)

(clojure.core/declare ser-media-connect-flow-request)

(clojure.core/declare ser-teletext-source-settings)

(clojure.core/declare ser-m-3u-8-scte-35-behavior)

(clojure.core/declare ser-rtmp-output-settings)

(clojure.core/declare ser-global-configuration-low-framerate-inputs)

(clojure.core/declare ser-eac-3-surround-mode)

(clojure.core/declare ser-avail-blanking-state)

(clojure.core/declare ser-audio-channel-mapping)

(clojure.core/declare ser-h-264-look-ahead-rate-control)

(clojure.core/declare ser-hls-akamai-http-transfer-mode)

(clojure.core/declare ser-h-264-sub-gop-length)

(clojure.core/declare ser-ms-smooth-output-settings)

(clojure.core/declare ser-video-selector-settings)

(clojure.core/declare ser-eac-3-lfe-filter)

(clojure.core/declare ser-integer-min-negative-60-max-60)

(clojure.core/declare ser-integer-min-0-max-8589934591)

(clojure.core/declare ser-list-of-input-channel-level)

(clojure.core/declare ser-h-264-rate-control-mode)

(clojure.core/declare ser-integer-min-0-max-255)

(clojure.core/declare ser-list-of-output-destination)

(clojure.core/declare ser-video-selector)

(clojure.core/declare ser-input-vpc-request)

(clojure.core/declare ser-ac-3-metadata-control)

(clojure.core/declare ser-double-min-0)

(clojure.core/declare ser-m-2ts-buffer-model)

(clojure.core/declare ser-udp-container-settings)

(clojure.core/declare ser-integer-min-25-max-10000)

(clojure.core/declare ser-eac-3-coding-mode)

(clojure.core/declare ser-m-2ts-ebif-control)

(clojure.core/declare ser-caption-description)

(clojure.core/declare ser-hls-media-store-settings)

(clojure.core/declare ser-smooth-group-stream-manifest-behavior)

(clojure.core/declare ser-timecode-config-source)

(clojure.core/declare ser-m-2ts-audio-interval)

(clojure.core/declare ser-schedule-action-settings)

(clojure.core/declare ser-audio-pid-selection)

(clojure.core/declare ser-hls-output-selection)

(clojure.core/declare ser-input-loss-action-for-udp-out)

(clojure.core/declare ser-ac-3-bitstream-mode)

(clojure.core/declare ser-scte-35-time-signal-apos)

(clojure.core/declare ser-h-264-spatial-aq)

(clojure.core/declare ser-aac-raw-format)

(clojure.core/declare ser-list-of-input-source-request)

(clojure.core/declare ser-static-image-activate-schedule-action-settings)

(clojure.core/declare ser-output-destination)

(clojure.core/declare ser-integer-min-30)

(clojure.core/declare ser-input-maximum-bitrate)

(clojure.core/declare ser-integer-min-0-max-3600)

(clojure.core/declare ser-video-selector-color-space)

(clojure.core/declare ser-audio-only-hls-settings)

(clojure.core/declare ser-m-2ts-segmentation-markers)

(clojure.core/declare ser-eac-3-drc-line)

(clojure.core/declare ser-dvb-sub-destination-alignment)

(clojure.core/declare ser-m-2ts-scte-35-control)

(clojure.core/declare ser-input-location)

(clojure.core/declare ser-m-2ts-absent-input-audio-behavior)

(clojure.core/declare ser-integer-min-3)

(clojure.core/declare ser-h-264-level)

(clojure.core/declare ser-avail-settings)

(clojure.core/declare ser-h-264-par-control)

(clojure.core/declare ser-smooth-group-audio-only-timecode-control)

(clojure.core/declare ser-pipeline-id)

(clojure.core/declare ser-video-description)

(clojure.core/declare ser-integer-min-0-max-15)

(clojure.core/declare ser-global-configuration-output-timing-source)

(clojure.core/declare ser-scte-35-no-regional-blackout-flag)

(clojure.core/declare ser-integer-min-1-max-10)

(clojure.core/declare ser-audio-language-selection)

(clojure.core/declare ser-output-group-settings)

(clojure.core/declare ser-integer-min-96-max-600)

(clojure.core/declare ser-rtmp-cache-full-behavior)

(clojure.core/declare ser-avail-configuration)

(clojure.core/declare ser-archive-container-settings)

(clojure.core/declare ser-list-of-hls-ad-markers)

(clojure.core/declare ser-blackout-slate-state)

(clojure.core/declare ser-mp-2-settings)

(clojure.core/declare ser-arib-destination-settings)

(clojure.core/declare ser-smooth-group-sparse-track-type)

(clojure.core/declare ser-m-2ts-es-rate-in-pes)

(clojure.core/declare ser-caption-destination-settings)

(clojure.core/declare ser-integer-min-1000-max-30000)

(clojure.core/declare ser-hls-input-settings)

(clojure.core/declare ser-hls-ad-markers)

(clojure.core/declare ser-list-of-string)

(clojure.core/declare ser-m-2ts-segmentation-style)

(clojure.core/declare ser-integer-min-0-max-30)

(clojure.core/declare ser-hls-iv-source)

(clojure.core/declare ser-authentication-scheme)

(clojure.core/declare ser-standard-hls-settings)

(clojure.core/declare ser-list-of-input-attachment)

(clojure.core/declare ser-hls-cdn-settings)

(clojure.core/declare ser-scte-35-descriptor)

(clojure.core/declare ser-smooth-group-event-stop-behavior)

(clojure.core/declare ser-scte-35-splice-insert)

(clojure.core/declare ser-m-2ts-rate-mode)

(clojure.core/declare ser-eac-3-bitstream-mode)

(clojure.core/declare ser-input-channel-level)

(clojure.core/declare ser-h-264-profile)

(clojure.core/declare ser-m-2ts-arib-captions-pid-control)

(clojure.core/declare ser-integer-min-0-max-100)

(clojure.core/declare ser-integer-min-1-max-6)

(clojure.core/declare ser-m-2ts-cc-descriptor)

(clojure.core/declare ser-list-of-pipeline-pause-state-settings)

(clojure.core/declare ser-string-min-1-max-256)

(clojure.core/declare ser-dvb-sub-destination-outline-color)

(clojure.core/declare ser-double-min-negative-59-max-0)

(clojure.core/declare ser-static-image-deactivate-schedule-action-settings)

(clojure.core/declare ser-video-codec-settings)

(clojure.core/declare ser-string-max-32)

(clojure.core/declare ser-eac-3-dc-filter)

(clojure.core/declare ser-m-3u-8-timed-metadata-behavior)

(clojure.core/declare ser-integer-min-1-max-5)

(clojure.core/declare ser-h-264-scene-change-detect)

(clojure.core/declare ser-aac-spec)

(clojure.core/declare ser-scte-35-apos-web-delivery-allowed-behavior)

(clojure.core/declare ser-blackout-slate-network-end-blackout)

(clojure.core/declare ser-network-input-server-validation)

(clojure.core/declare ser-hls-redundant-manifest)

(clojure.core/declare ser-rtmp-caption-info-destination-settings)

(clojure.core/declare ser-aac-coding-mode)

(clojure.core/declare ser-smooth-group-event-id-mode)

(clojure.core/declare ser-scte-27-source-settings)

(clojure.core/declare ser-integer-min-1-max-3600)

(clojure.core/declare ser-webvtt-destination-settings)

(clojure.core/declare ser-output-settings)

(clojure.core/declare ser-caption-language-mapping)

(clojure.core/declare ser-input-loss-action-for-rtmp-out)

(clojure.core/declare ser-schedule-action-start-settings)

(clojure.core/declare ser-list-of-output)

(clojure.core/declare ser-encoder-settings)

(clojure.core/declare ser-static-key-settings)

(clojure.core/declare ser-frame-capture-group-settings)

(clojure.core/declare ser-video-description-respond-to-afd)

(clojure.core/declare ser-teletext-destination-settings)

(clojure.core/declare ser-output-group)

(clojure.core/declare ser-input-attachment)

(clojure.core/declare ser-hls-client-cache)

(clojure.core/declare ser-integer-min-0-max-10000)

(clojure.core/declare ser-h-264-temporal-aq)

(clojure.core/declare ser-smpte-tt-destination-settings)

(clojure.core/declare ser-embedded-source-settings)

(clojure.core/declare ser-h-264-gop-b-reference)

(clojure.core/declare ser-network-input-settings)

(clojure.core/declare ser-string-min-3-max-3)

(clojure.core/declare ser-smooth-group-certificate-mode)

(clojure.core/declare ser-input-specification)

(clojure.core/declare ser-input-deblock-filter)

(clojure.core/declare ser-batch-schedule-action-delete-request)

(clojure.core/declare ser-embedded-scte-20-detection)

(clojure.core/declare ser-input-codec)

(clojure.core/declare ser-integer-min-4-max-20)

(clojure.core/declare ser-arib-source-settings)

(clojure.core/declare ser-audio-description-language-code-control)

(clojure.core/declare ser-double)

(clojure.core/declare ser-ac-3-coding-mode)

(clojure.core/declare ser-input-switch-schedule-action-settings)

(clojure.core/declare ser-integer-min-0-max-10)

(clojure.core/declare ser-aac-rate-control-mode)

(clojure.core/declare ser-integer-min-negative-1000-max-1000)

(clojure.core/declare ser-hls-segmentation-mode)

(clojure.core/declare ser-dvb-sub-destination-shadow-color)

(clojure.core/declare ser-pass-through-settings)

(clojure.core/declare ser-video-description-scaling-behavior)

(clojure.core/declare ser-scte-35-archive-allowed-flag)

(clojure.core/declare ser-eac-3-attenuation-control)

(clojure.core/declare ser-h-264-framerate-control)

(clojure.core/declare ser-aac-input-type)

(clojure.core/declare ser-timecode-config)

(clojure.core/declare ser-dvb-sub-destination-settings)

(clojure.core/declare ser-embedded-convert-608-to-708)

(clojure.core/declare ser-audio-only-hls-track-type)

(clojure.core/declare ser-h-264-color-metadata)

(clojure.core/declare ser-string-min-1)

(clojure.core/declare ser-max-results)

(clojure.core/declare ser-blackout-slate)

(clojure.core/declare ser-ac-3-settings)

(clojure.core/declare ser-ms-smooth-group-settings)

(clojure.core/declare ser-integer-min-0-max-7)

(clojure.core/declare ser-h-264-entropy-encoding)

(clojure.core/declare ser-output)

(clojure.core/declare ser-burn-in-shadow-color)

(clojure.core/declare ser-audio-language-selection-policy)

(clojure.core/declare ser-integer)

(clojure.core/declare ser-aac-settings)

(clojure.core/declare ser-integer-min-1)

(clojure.core/declare ser-list-of-caption-selector)

(clojure.core/declare ser-integer-min-0-max-4294967295)

(clojure.core/declare ser-rtmp-group-settings)

(clojure.core/declare ser-burn-in-alignment)

(clojure.core/declare ser-list-of-caption-description)

(clojure.core/declare ser-embedded-destination-settings)

(clojure.core/declare ser-caption-selector)

(clojure.core/declare ser-embedded-plus-scte-20-destination-settings)

(clojure.core/declare ser-hls-group-settings)

(clojure.core/declare ser-input-loss-action-for-ms-smooth-out)

(clojure.core/declare ser-dvb-nit-settings)

(clojure.core/declare ser-integer-min-1-max-20)

(clojure.core/declare ser-integer-min-0-max-8191)

(clojure.core/declare ser-list-of-input-destination-request)

(clojure.core/declare ser-smooth-group-timestamp-offset-mode)

(clojure.core/declare ser-hls-media-store-storage-class)

(clojure.core/declare ser-pipeline-pause-state-settings)

(clojure.core/declare ser-frame-capture-settings)

(clojure.core/declare ser-hls-program-date-time)

(clojure.core/declare ser-output-destination-settings)

(clojure.core/declare ser-fixed-afd)

(clojure.core/declare ser-hls-ts-file-mode)

(clojure.core/declare ser-scte-35-segmentation-descriptor)

(clojure.core/declare ser-hls-iv-in-manifest)

(clojure.core/declare ser-list-of-caption-language-mapping)

(clojure.core/declare ser-audio-codec-settings)

(clojure.core/declare ser-scte-20-plus-embedded-destination-settings)

(clojure.core/declare ser-scte-35-web-delivery-allowed-flag)

(clojure.core/declare ser-scte-35-return-to-network-schedule-action-settings)

(clojure.core/declare ser-integer-min-1-max-32)

(clojure.core/declare ser-burn-in-outline-color)

(clojure.core/declare ser-h-264-timecode-insertion-behavior)

(clojure.core/declare ser-eac-3-passthrough-control)

(clojure.core/declare ser-input-settings)

(clojure.core/declare ser-integer-min-1-max-31)

(clojure.core/declare ser-audio-normalization-settings)

(clojure.core/declare ser-key-provider-settings)

(clojure.core/declare ser-list-of-scte-35-descriptor)

(clojure.core/declare ser-caption-selector-settings)

(clojure.core/declare ser-h-264-settings)

(clojure.core/declare ser-hls-timed-metadata-id-3-frame)

(clojure.core/declare ser-eac-3-phase-control)

(clojure.core/declare ser-eac-3-surround-ex-mode)

(clojure.core/declare ser-integer-min-1-max-8)

(clojure.core/declare ser-smooth-group-segmentation-mode)

(clojure.core/declare ser-list-of-audio-description)

(clojure.core/declare ser-hls-output-settings)

(clojure.core/declare ser-scte-35-splice-insert-web-delivery-allowed-behavior)

(clojure.core/declare ser-m-3u-8-settings)

(clojure.core/declare ser-string-min-1-max-255)

(clojure.core/declare ser-list-of-audio-channel-mapping)

(clojure.core/declare ser-list-of-media-connect-flow-request)

(clojure.core/declare ser-eac-3-stereo-downmix)

(clojure.core/declare ser-integer-min-0-max-128)

(clojure.core/declare ser-integer-min-0-max-1000000)

(clojure.core/declare ser-h-264-syntax)

(clojure.core/declare ser-string-min-32-max-32)

(clojure.core/declare ser-input-resolution)

(clojure.core/declare ser-scte-20-convert-608-to-708)

(clojure.core/declare ser-h-264-flicker-aq)

(clojure.core/declare ser-hls-codec-specification)

(clojure.core/declare ser-avail-blanking)

(clojure.core/declare ser-m-2ts-audio-stream-type)

(clojure.core/declare ser-string-min-34-max-34)

(clojure.core/declare ser-audio-selector)

(clojure.core/declare ser-integer-min-1-max-16)

(clojure.core/declare ser-hls-akamai-settings)

(clojure.core/defn- ser-hls-manifest-compression [input] #:http.request.field{:value (clojure.core/get {"GZIP" "GZIP", :gzip "GZIP", "NONE" "NONE", :none "NONE"} input), :shape "HlsManifestCompression"})

(clojure.core/defn- ser-hls-encryption-type [input] #:http.request.field{:value (clojure.core/get {"AES128" "AES128", :aes-128 "AES128", "SAMPLE_AES" "SAMPLE_AES", :sample-aes "SAMPLE_AES"} input), :shape "HlsEncryptionType"})

(clojure.core/defn- ser-integer-min-0-max-600 [input] #:http.request.field{:value input, :shape "__integerMin0Max600"})

(clojure.core/defn- ser-output-location-ref [input] (clojure.core/cond-> #:http.request.field{:value [], :shape "OutputLocationRef", :type "structure"} (clojure.core/contains? input :destination-ref-id) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-string (input :destination-ref-id)) #:http.request.field{:name "DestinationRefId", :shape "__string", :location-name "destinationRefId"}))))

(clojure.core/defn- ser-hls-manifest-duration-format [input] #:http.request.field{:value (clojure.core/get {"FLOATING_POINT" "FLOATING_POINT", :floating-point "FLOATING_POINT", "INTEGER" "INTEGER", :integer "INTEGER"} input), :shape "HlsManifestDurationFormat"})

(clojure.core/defn- ser-integer-min-1000 [input] #:http.request.field{:value input, :shape "__integerMin1000"})

(clojure.core/defn- ser-integer-min-negative-60-max-6 [input] #:http.request.field{:value input, :shape "__integerMinNegative60Max6"})

(clojure.core/defn- ser-scte-35-apos-no-regional-blackout-behavior [input] #:http.request.field{:value (clojure.core/get {"FOLLOW" "FOLLOW", :follow "FOLLOW", "IGNORE" "IGNORE", :ignore "IGNORE"} input), :shape "Scte35AposNoRegionalBlackoutBehavior"})

(clojure.core/defn- ser-input-filter [input] #:http.request.field{:value (clojure.core/get {"AUTO" "AUTO", :auto "AUTO", "DISABLED" "DISABLED", :disabled "DISABLED", "FORCED" "FORCED", :forced "FORCED"} input), :shape "InputFilter"})

(clojure.core/defn- ser-audio-selector-settings [input] (clojure.core/cond-> #:http.request.field{:value [], :shape "AudioSelectorSettings", :type "structure"} (clojure.core/contains? input :audio-language-selection) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-audio-language-selection (input :audio-language-selection)) #:http.request.field{:name "AudioLanguageSelection", :shape "AudioLanguageSelection", :location-name "audioLanguageSelection"})) (clojure.core/contains? input :audio-pid-selection) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-audio-pid-selection (input :audio-pid-selection)) #:http.request.field{:name "AudioPidSelection", :shape "AudioPidSelection", :location-name "audioPidSelection"}))))

(clojure.core/defn- ser-audio-description-audio-type-control [input] #:http.request.field{:value (clojure.core/get {"FOLLOW_INPUT" "FOLLOW_INPUT", :follow-input "FOLLOW_INPUT", "USE_CONFIGURED" "USE_CONFIGURED", :use-configured "USE_CONFIGURED"} input), :shape "AudioDescriptionAudioTypeControl"})

(clojure.core/defn- ser-list-of-video-description [input] #:http.request.field{:value (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (clojure.core/merge (ser-video-description coll) #:http.request.field{:shape "VideoDescription"}))) input), :shape "__listOfVideoDescription", :type "list"})

(clojure.core/defn- ser-integer-min-0-max-1000 [input] #:http.request.field{:value input, :shape "__integerMin0Max1000"})

(clojure.core/defn- ser-integer-min-0-max-65536 [input] #:http.request.field{:value input, :shape "__integerMin0Max65536"})

(clojure.core/defn- ser-h-264-adaptive-quantization [input] #:http.request.field{:value (clojure.core/get {:higher "HIGHER", :medium "MEDIUM", "LOW" "LOW", "MAX" "MAX", :high "HIGH", "HIGHER" "HIGHER", :max "MAX", :off "OFF", "HIGH" "HIGH", :low "LOW", "OFF" "OFF", "MEDIUM" "MEDIUM"} input), :shape "H264AdaptiveQuantization"})

(clojure.core/defn- ser-integer-min-1-max-1000000 [input] #:http.request.field{:value input, :shape "__integerMin1Max1000000"})

(clojure.core/defn- ser-integer-min-25-max-2000 [input] #:http.request.field{:value input, :shape "__integerMin25Max2000"})

(clojure.core/defn- ser-input-loss-action-for-hls-out [input] #:http.request.field{:value (clojure.core/get {"EMIT_OUTPUT" "EMIT_OUTPUT", :emit-output "EMIT_OUTPUT", "PAUSE_OUTPUT" "PAUSE_OUTPUT", :pause-output "PAUSE_OUTPUT"} input), :shape "InputLossActionForHlsOut"})

(clojure.core/defn- ser-input-source-end-behavior [input] #:http.request.field{:value (clojure.core/get {"CONTINUE" "CONTINUE", :continue "CONTINUE", "LOOP" "LOOP", :loop "LOOP"} input), :shape "InputSourceEndBehavior"})

(clojure.core/defn- ser-ttml-destination-style-control [input] #:http.request.field{:value (clojure.core/get {"PASSTHROUGH" "PASSTHROUGH", :passthrough "PASSTHROUGH", "USE_CONFIGURED" "USE_CONFIGURED", :use-configured "USE_CONFIGURED"} input), :shape "TtmlDestinationStyleControl"})

(clojure.core/defn- ser-dvb-sdt-output-sdt [input] #:http.request.field{:value (clojure.core/get {"SDT_FOLLOW" "SDT_FOLLOW", :sdt-follow "SDT_FOLLOW", "SDT_FOLLOW_IF_PRESENT" "SDT_FOLLOW_IF_PRESENT", :sdt-follow-if-present "SDT_FOLLOW_IF_PRESENT", "SDT_MANUAL" "SDT_MANUAL", :sdt-manual "SDT_MANUAL", "SDT_NONE" "SDT_NONE", :sdt-none "SDT_NONE"} input), :shape "DvbSdtOutputSdt"})

(clojure.core/defn- ser-ttml-destination-settings [input] (clojure.core/cond-> #:http.request.field{:value [], :shape "TtmlDestinationSettings", :type "structure"} (clojure.core/contains? input :style-control) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-ttml-destination-style-control (input :style-control)) #:http.request.field{:name "StyleControl", :shape "TtmlDestinationStyleControl", :location-name "styleControl"}))))

(clojure.core/defn- ser-integer-min-1-max-4 [input] #:http.request.field{:value input, :shape "__integerMin1Max4"})

(clojure.core/defn- ser-m-2ts-pcr-control [input] #:http.request.field{:value (clojure.core/get {"CONFIGURED_PCR_PERIOD" "CONFIGURED_PCR_PERIOD", :configured-pcr-period "CONFIGURED_PCR_PERIOD", "PCR_EVERY_PES_PACKET" "PCR_EVERY_PES_PACKET", :pcr-every-pes-packet "PCR_EVERY_PES_PACKET"} input), :shape "M2tsPcrControl"})

(clojure.core/defn- ser-h-264-scan-type [input] #:http.request.field{:value (clojure.core/get {"INTERLACED" "INTERLACED", :interlaced "INTERLACED", "PROGRESSIVE" "PROGRESSIVE", :progressive "PROGRESSIVE"} input), :shape "H264ScanType"})

(clojure.core/defn- ser-scte-35-device-restrictions [input] #:http.request.field{:value (clojure.core/get {"NONE" "NONE", :none "NONE", "RESTRICT_GROUP0" "RESTRICT_GROUP0", :restrict-group-0 "RESTRICT_GROUP0", "RESTRICT_GROUP1" "RESTRICT_GROUP1", :restrict-group-1 "RESTRICT_GROUP1", "RESTRICT_GROUP2" "RESTRICT_GROUP2", :restrict-group-2 "RESTRICT_GROUP2"} input), :shape "Scte35DeviceRestrictions"})

(clojure.core/defn- ser-remix-settings [input] (clojure.core/cond-> #:http.request.field{:value [(clojure.core/into (ser-list-of-audio-channel-mapping (:channel-mappings input)) #:http.request.field{:name "ChannelMappings", :shape "__listOfAudioChannelMapping", :location-name "channelMappings"})], :shape "RemixSettings", :type "structure"} (clojure.core/contains? input :channels-in) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-integer-min-1-max-16 (input :channels-in)) #:http.request.field{:name "ChannelsIn", :shape "__integerMin1Max16", :location-name "channelsIn"})) (clojure.core/contains? input :channels-out) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-integer-min-1-max-8 (input :channels-out)) #:http.request.field{:name "ChannelsOut", :shape "__integerMin1Max8", :location-name "channelsOut"}))))

(clojure.core/defn- ser-dvb-tdt-settings [input] (clojure.core/cond-> #:http.request.field{:value [], :shape "DvbTdtSettings", :type "structure"} (clojure.core/contains? input :rep-interval) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-integer-min-1000-max-30000 (input :rep-interval)) #:http.request.field{:name "RepInterval", :shape "__integerMin1000Max30000", :location-name "repInterval"}))))

(clojure.core/defn- ser-scte-35-time-signal-schedule-action-settings [input] (clojure.core/cond-> #:http.request.field{:value [(clojure.core/into (ser-list-of-scte-35-descriptor (:scte-35-descriptors input)) #:http.request.field{:name "Scte35Descriptors", :shape "__listOfScte35Descriptor", :location-name "scte35Descriptors"})], :shape "Scte35TimeSignalScheduleActionSettings", :type "structure"}))

(clojure.core/defn- ser-audio-type [input] #:http.request.field{:value (clojure.core/get {"CLEAN_EFFECTS" "CLEAN_EFFECTS", :clean-effects "CLEAN_EFFECTS", "HEARING_IMPAIRED" "HEARING_IMPAIRED", :hearing-impaired "HEARING_IMPAIRED", "UNDEFINED" "UNDEFINED", :undefined "UNDEFINED", "VISUAL_IMPAIRED_COMMENTARY" "VISUAL_IMPAIRED_COMMENTARY", :visual-impaired-commentary "VISUAL_IMPAIRED_COMMENTARY"} input), :shape "AudioType"})

(clojure.core/defn- ser-audio-normalization-algorithm-control [input] #:http.request.field{:value (clojure.core/get {"CORRECT_AUDIO" "CORRECT_AUDIO", :correct-audio "CORRECT_AUDIO"} input), :shape "AudioNormalizationAlgorithmControl"})

(clojure.core/defn- ser-integer-min-0-max-1099511627775 [input] #:http.request.field{:value input, :shape "__integerMin0Max1099511627775"})

(clojure.core/defn- ser-fixed-mode-schedule-action-start-settings [input] (clojure.core/cond-> #:http.request.field{:value [(clojure.core/into (ser-string (:time input)) #:http.request.field{:name "Time", :shape "__string", :location-name "time"})], :shape "FixedModeScheduleActionStartSettings", :type "structure"}))

(clojure.core/defn- ser-burn-in-destination-settings [input] (clojure.core/cond-> #:http.request.field{:value [], :shape "BurnInDestinationSettings", :type "structure"} (clojure.core/contains? input :outline-color) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-burn-in-outline-color (input :outline-color)) #:http.request.field{:name "OutlineColor", :shape "BurnInOutlineColor", :location-name "outlineColor"})) (clojure.core/contains? input :outline-size) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-integer-min-0-max-10 (input :outline-size)) #:http.request.field{:name "OutlineSize", :shape "__integerMin0Max10", :location-name "outlineSize"})) (clojure.core/contains? input :shadow-color) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-burn-in-shadow-color (input :shadow-color)) #:http.request.field{:name "ShadowColor", :shape "BurnInShadowColor", :location-name "shadowColor"})) (clojure.core/contains? input :shadow-opacity) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-integer-min-0-max-255 (input :shadow-opacity)) #:http.request.field{:name "ShadowOpacity", :shape "__integerMin0Max255", :location-name "shadowOpacity"})) (clojure.core/contains? input :shadow-y-offset) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-integer (input :shadow-y-offset)) #:http.request.field{:name "ShadowYOffset", :shape "__integer", :location-name "shadowYOffset"})) (clojure.core/contains? input :background-color) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-burn-in-background-color (input :background-color)) #:http.request.field{:name "BackgroundColor", :shape "BurnInBackgroundColor", :location-name "backgroundColor"})) (clojure.core/contains? input :teletext-grid-control) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-burn-in-teletext-grid-control (input :teletext-grid-control)) #:http.request.field{:name "TeletextGridControl", :shape "BurnInTeletextGridControl", :location-name "teletextGridControl"})) (clojure.core/contains? input :y-position) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-integer-min-0 (input :y-position)) #:http.request.field{:name "YPosition", :shape "__integerMin0", :location-name "yPosition"})) (clojure.core/contains? input :font-color) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-burn-in-font-color (input :font-color)) #:http.request.field{:name "FontColor", :shape "BurnInFontColor", :location-name "fontColor"})) (clojure.core/contains? input :x-position) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-integer-min-0 (input :x-position)) #:http.request.field{:name "XPosition", :shape "__integerMin0", :location-name "xPosition"})) (clojure.core/contains? input :font) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-input-location (input :font)) #:http.request.field{:name "Font", :shape "InputLocation", :location-name "font"})) (clojure.core/contains? input :font-resolution) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-integer-min-96-max-600 (input :font-resolution)) #:http.request.field{:name "FontResolution", :shape "__integerMin96Max600", :location-name "fontResolution"})) (clojure.core/contains? input :font-size) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-string (input :font-size)) #:http.request.field{:name "FontSize", :shape "__string", :location-name "fontSize"})) (clojure.core/contains? input :background-opacity) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-integer-min-0-max-255 (input :background-opacity)) #:http.request.field{:name "BackgroundOpacity", :shape "__integerMin0Max255", :location-name "backgroundOpacity"})) (clojure.core/contains? input :font-opacity) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-integer-min-0-max-255 (input :font-opacity)) #:http.request.field{:name "FontOpacity", :shape "__integerMin0Max255", :location-name "fontOpacity"})) (clojure.core/contains? input :shadow-x-offset) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-integer (input :shadow-x-offset)) #:http.request.field{:name "ShadowXOffset", :shape "__integer", :location-name "shadowXOffset"})) (clojure.core/contains? input :alignment) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-burn-in-alignment (input :alignment)) #:http.request.field{:name "Alignment", :shape "BurnInAlignment", :location-name "alignment"}))))

(clojure.core/defn- ser-eac-3-drc-rf [input] #:http.request.field{:value (clojure.core/get {"MUSIC_LIGHT" "MUSIC_LIGHT", :music-standard "MUSIC_STANDARD", :film-standard "FILM_STANDARD", "FILM_STANDARD" "FILM_STANDARD", "NONE" "NONE", "FILM_LIGHT" "FILM_LIGHT", :film-light "FILM_LIGHT", "SPEECH" "SPEECH", :music-light "MUSIC_LIGHT", "MUSIC_STANDARD" "MUSIC_STANDARD", :speech "SPEECH", :none "NONE"} input), :shape "Eac3DrcRf"})

(clojure.core/defn- ser-audio-description [input] (clojure.core/cond-> #:http.request.field{:value [(clojure.core/into (ser-string (:audio-selector-name input)) #:http.request.field{:name "AudioSelectorName", :shape "__string", :location-name "audioSelectorName"}) (clojure.core/into (ser-string (:name input)) #:http.request.field{:name "Name", :shape "__string", :location-name "name"})], :shape "AudioDescription", :type "structure"} (clojure.core/contains? input :stream-name) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-string (input :stream-name)) #:http.request.field{:name "StreamName", :shape "__string", :location-name "streamName"})) (clojure.core/contains? input :remix-settings) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-remix-settings (input :remix-settings)) #:http.request.field{:name "RemixSettings", :shape "RemixSettings", :location-name "remixSettings"})) (clojure.core/contains? input :audio-type) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-audio-type (input :audio-type)) #:http.request.field{:name "AudioType", :shape "AudioType", :location-name "audioType"})) (clojure.core/contains? input :codec-settings) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-audio-codec-settings (input :codec-settings)) #:http.request.field{:name "CodecSettings", :shape "AudioCodecSettings", :location-name "codecSettings"})) (clojure.core/contains? input :language-code-control) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-audio-description-language-code-control (input :language-code-control)) #:http.request.field{:name "LanguageCodeControl", :shape "AudioDescriptionLanguageCodeControl", :location-name "languageCodeControl"})) (clojure.core/contains? input :audio-type-control) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-audio-description-audio-type-control (input :audio-type-control)) #:http.request.field{:name "AudioTypeControl", :shape "AudioDescriptionAudioTypeControl", :location-name "audioTypeControl"})) (clojure.core/contains? input :language-code) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-string-min-3-max-3 (input :language-code)) #:http.request.field{:name "LanguageCode", :shape "__stringMin3Max3", :location-name "languageCode"})) (clojure.core/contains? input :audio-normalization-settings) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-audio-normalization-settings (input :audio-normalization-settings)) #:http.request.field{:name "AudioNormalizationSettings", :shape "AudioNormalizationSettings", :location-name "audioNormalizationSettings"}))))

(clojure.core/defn- ser-batch-schedule-action-create-request [input] (clojure.core/cond-> #:http.request.field{:value [(clojure.core/into (ser-list-of-schedule-action (:schedule-actions input)) #:http.request.field{:name "ScheduleActions", :shape "__listOfScheduleAction", :location-name "scheduleActions"})], :shape "BatchScheduleActionCreateRequest", :type "structure"}))

(clojure.core/defn- ser-aac-vbr-quality [input] #:http.request.field{:value (clojure.core/get {"HIGH" "HIGH", :high "HIGH", "LOW" "LOW", :low "LOW", "MEDIUM_HIGH" "MEDIUM_HIGH", :medium-high "MEDIUM_HIGH", "MEDIUM_LOW" "MEDIUM_LOW", :medium-low "MEDIUM_LOW"} input), :shape "AacVbrQuality"})

(clojure.core/defn- ser-hls-basic-put-settings [input] (clojure.core/cond-> #:http.request.field{:value [], :shape "HlsBasicPutSettings", :type "structure"} (clojure.core/contains? input :connection-retry-interval) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-integer-min-0 (input :connection-retry-interval)) #:http.request.field{:name "ConnectionRetryInterval", :shape "__integerMin0", :location-name "connectionRetryInterval"})) (clojure.core/contains? input :filecache-duration) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-integer-min-0-max-600 (input :filecache-duration)) #:http.request.field{:name "FilecacheDuration", :shape "__integerMin0Max600", :location-name "filecacheDuration"})) (clojure.core/contains? input :num-retries) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-integer-min-0 (input :num-retries)) #:http.request.field{:name "NumRetries", :shape "__integerMin0", :location-name "numRetries"})) (clojure.core/contains? input :restart-delay) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-integer-min-0-max-15 (input :restart-delay)) #:http.request.field{:name "RestartDelay", :shape "__integerMin0Max15", :location-name "restartDelay"}))))

(clojure.core/defn- ser-m-2ts-klv [input] #:http.request.field{:value (clojure.core/get {"NONE" "NONE", :none "NONE", "PASSTHROUGH" "PASSTHROUGH", :passthrough "PASSTHROUGH"} input), :shape "M2tsKlv"})

(clojure.core/defn- ser-global-configuration [input] (clojure.core/cond-> #:http.request.field{:value [], :shape "GlobalConfiguration", :type "structure"} (clojure.core/contains? input :initial-audio-gain) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-integer-min-negative-60-max-60 (input :initial-audio-gain)) #:http.request.field{:name "InitialAudioGain", :shape "__integerMinNegative60Max60", :location-name "initialAudioGain"})) (clojure.core/contains? input :input-end-action) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-global-configuration-input-end-action (input :input-end-action)) #:http.request.field{:name "InputEndAction", :shape "GlobalConfigurationInputEndAction", :location-name "inputEndAction"})) (clojure.core/contains? input :input-loss-behavior) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-input-loss-behavior (input :input-loss-behavior)) #:http.request.field{:name "InputLossBehavior", :shape "InputLossBehavior", :location-name "inputLossBehavior"})) (clojure.core/contains? input :output-timing-source) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-global-configuration-output-timing-source (input :output-timing-source)) #:http.request.field{:name "OutputTimingSource", :shape "GlobalConfigurationOutputTimingSource", :location-name "outputTimingSource"})) (clojure.core/contains? input :support-low-framerate-inputs) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-global-configuration-low-framerate-inputs (input :support-low-framerate-inputs)) #:http.request.field{:name "SupportLowFramerateInputs", :shape "GlobalConfigurationLowFramerateInputs", :location-name "supportLowFramerateInputs"}))))

(clojure.core/defn- ser-m-3u-8-pcr-control [input] #:http.request.field{:value (clojure.core/get {"CONFIGURED_PCR_PERIOD" "CONFIGURED_PCR_PERIOD", :configured-pcr-period "CONFIGURED_PCR_PERIOD", "PCR_EVERY_PES_PACKET" "PCR_EVERY_PES_PACKET", :pcr-every-pes-packet "PCR_EVERY_PES_PACKET"} input), :shape "M3u8PcrControl"})

(clojure.core/defn- ser-archive-output-settings [input] (clojure.core/cond-> #:http.request.field{:value [(clojure.core/into (ser-archive-container-settings (:container-settings input)) #:http.request.field{:name "ContainerSettings", :shape "ArchiveContainerSettings", :location-name "containerSettings"})], :shape "ArchiveOutputSettings", :type "structure"} (clojure.core/contains? input :extension) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-string (input :extension)) #:http.request.field{:name "Extension", :shape "__string", :location-name "extension"})) (clojure.core/contains? input :name-modifier) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-string (input :name-modifier)) #:http.request.field{:name "NameModifier", :shape "__string", :location-name "nameModifier"}))))

(clojure.core/defn- ser-string-min-6-max-6 [input] #:http.request.field{:value input, :shape "__stringMin6Max6"})

(clojure.core/defn- ser-m-2ts-audio-buffer-model [input] #:http.request.field{:value (clojure.core/get {"ATSC" "ATSC", :atsc "ATSC", "DVB" "DVB", :dvb "DVB"} input), :shape "M2tsAudioBufferModel"})

(clojure.core/defn- ser-h-264-gop-size-units [input] #:http.request.field{:value (clojure.core/get {"FRAMES" "FRAMES", :frames "FRAMES", "SECONDS" "SECONDS", :seconds "SECONDS"} input), :shape "H264GopSizeUnits"})

(clojure.core/defn- ser-hls-directory-structure [input] #:http.request.field{:value (clojure.core/get {"SINGLE_DIRECTORY" "SINGLE_DIRECTORY", :single-directory "SINGLE_DIRECTORY", "SUBDIRECTORY_PER_STREAM" "SUBDIRECTORY_PER_STREAM", :subdirectory-per-stream "SUBDIRECTORY_PER_STREAM"} input), :shape "HlsDirectoryStructure"})

(clojure.core/defn- ser-frame-capture-output-settings [input] (clojure.core/cond-> #:http.request.field{:value [], :shape "FrameCaptureOutputSettings", :type "structure"} (clojure.core/contains? input :name-modifier) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-string (input :name-modifier)) #:http.request.field{:name "NameModifier", :shape "__string", :location-name "nameModifier"}))))

(clojure.core/defn- ser-m-2ts-ebp-placement [input] #:http.request.field{:value (clojure.core/get {"VIDEO_AND_AUDIO_PIDS" "VIDEO_AND_AUDIO_PIDS", :video-and-audio-pids "VIDEO_AND_AUDIO_PIDS", "VIDEO_PID" "VIDEO_PID", :video-pid "VIDEO_PID"} input), :shape "M2tsEbpPlacement"})

(clojure.core/defn- ser-dvb-sub-destination-teletext-grid-control [input] #:http.request.field{:value (clojure.core/get {"FIXED" "FIXED", :fixed "FIXED", "SCALED" "SCALED", :scaled "SCALED"} input), :shape "DvbSubDestinationTeletextGridControl"})

(clojure.core/defn- ser-eac-3-settings [input] (clojure.core/cond-> #:http.request.field{:value [], :shape "Eac3Settings", :type "structure"} (clojure.core/contains? input :lt-rt-surround-mix-level) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-double (input :lt-rt-surround-mix-level)) #:http.request.field{:name "LtRtSurroundMixLevel", :shape "__double", :location-name "ltRtSurroundMixLevel"})) (clojure.core/contains? input :coding-mode) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-eac-3-coding-mode (input :coding-mode)) #:http.request.field{:name "CodingMode", :shape "Eac3CodingMode", :location-name "codingMode"})) (clojure.core/contains? input :phase-control) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-eac-3-phase-control (input :phase-control)) #:http.request.field{:name "PhaseControl", :shape "Eac3PhaseControl", :location-name "phaseControl"})) (clojure.core/contains? input :passthrough-control) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-eac-3-passthrough-control (input :passthrough-control)) #:http.request.field{:name "PassthroughControl", :shape "Eac3PassthroughControl", :location-name "passthroughControl"})) (clojure.core/contains? input :surround-mode) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-eac-3-surround-mode (input :surround-mode)) #:http.request.field{:name "SurroundMode", :shape "Eac3SurroundMode", :location-name "surroundMode"})) (clojure.core/contains? input :attenuation-control) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-eac-3-attenuation-control (input :attenuation-control)) #:http.request.field{:name "AttenuationControl", :shape "Eac3AttenuationControl", :location-name "attenuationControl"})) (clojure.core/contains? input :drc-line) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-eac-3-drc-line (input :drc-line)) #:http.request.field{:name "DrcLine", :shape "Eac3DrcLine", :location-name "drcLine"})) (clojure.core/contains? input :dc-filter) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-eac-3-dc-filter (input :dc-filter)) #:http.request.field{:name "DcFilter", :shape "Eac3DcFilter", :location-name "dcFilter"})) (clojure.core/contains? input :lfe-filter) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-eac-3-lfe-filter (input :lfe-filter)) #:http.request.field{:name "LfeFilter", :shape "Eac3LfeFilter", :location-name "lfeFilter"})) (clojure.core/contains? input :lfe-control) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-eac-3-lfe-control (input :lfe-control)) #:http.request.field{:name "LfeControl", :shape "Eac3LfeControl", :location-name "lfeControl"})) (clojure.core/contains? input :lo-ro-center-mix-level) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-double (input :lo-ro-center-mix-level)) #:http.request.field{:name "LoRoCenterMixLevel", :shape "__double", :location-name "loRoCenterMixLevel"})) (clojure.core/contains? input :stereo-downmix) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-eac-3-stereo-downmix (input :stereo-downmix)) #:http.request.field{:name "StereoDownmix", :shape "Eac3StereoDownmix", :location-name "stereoDownmix"})) (clojure.core/contains? input :lt-rt-center-mix-level) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-double (input :lt-rt-center-mix-level)) #:http.request.field{:name "LtRtCenterMixLevel", :shape "__double", :location-name "ltRtCenterMixLevel"})) (clojure.core/contains? input :surround-ex-mode) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-eac-3-surround-ex-mode (input :surround-ex-mode)) #:http.request.field{:name "SurroundExMode", :shape "Eac3SurroundExMode", :location-name "surroundExMode"})) (clojure.core/contains? input :metadata-control) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-eac-3-metadata-control (input :metadata-control)) #:http.request.field{:name "MetadataControl", :shape "Eac3MetadataControl", :location-name "metadataControl"})) (clojure.core/contains? input :lo-ro-surround-mix-level) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-double (input :lo-ro-surround-mix-level)) #:http.request.field{:name "LoRoSurroundMixLevel", :shape "__double", :location-name "loRoSurroundMixLevel"})) (clojure.core/contains? input :drc-rf) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-eac-3-drc-rf (input :drc-rf)) #:http.request.field{:name "DrcRf", :shape "Eac3DrcRf", :location-name "drcRf"})) (clojure.core/contains? input :bitstream-mode) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-eac-3-bitstream-mode (input :bitstream-mode)) #:http.request.field{:name "BitstreamMode", :shape "Eac3BitstreamMode", :location-name "bitstreamMode"})) (clojure.core/contains? input :dialnorm) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-integer-min-1-max-31 (input :dialnorm)) #:http.request.field{:name "Dialnorm", :shape "__integerMin1Max31", :location-name "dialnorm"})) (clojure.core/contains? input :bitrate) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-double (input :bitrate)) #:http.request.field{:name "Bitrate", :shape "__double", :location-name "bitrate"}))))

(clojure.core/defn- ser-audio-normalization-algorithm [input] #:http.request.field{:value (clojure.core/get {"ITU_1770_1" "ITU_1770_1", :itu-1770-1 "ITU_1770_1", "ITU_1770_2" "ITU_1770_2", :itu-1770-2 "ITU_1770_2"} input), :shape "AudioNormalizationAlgorithm"})

(clojure.core/defn- ser-follow-mode-schedule-action-start-settings [input] (clojure.core/cond-> #:http.request.field{:value [(clojure.core/into (ser-string (:reference-action-name input)) #:http.request.field{:name "ReferenceActionName", :shape "__string", :location-name "referenceActionName"}) (clojure.core/into (ser-follow-point (:follow-point input)) #:http.request.field{:name "FollowPoint", :shape "FollowPoint", :location-name "followPoint"})], :shape "FollowModeScheduleActionStartSettings", :type "structure"}))

(clojure.core/defn- ser-rtmp-caption-data [input] #:http.request.field{:value (clojure.core/get {"ALL" "ALL", :all "ALL", "FIELD1_608" "FIELD1_608", :field-1-608 "FIELD1_608", "FIELD1_AND_FIELD2_608" "FIELD1_AND_FIELD2_608", :field-1-and-field-2-608 "FIELD1_AND_FIELD2_608"} input), :shape "RtmpCaptionData"})

(clojure.core/defn- ser-hls-mode [input] #:http.request.field{:value (clojure.core/get {"LIVE" "LIVE", :live "LIVE", "VOD" "VOD", :vod "VOD"} input), :shape "HlsMode"})

(clojure.core/defn- ser-log-level [input] #:http.request.field{:value (clojure.core/get {"DISABLED" "DISABLED", "WARNING" "WARNING", :disabled "DISABLED", :debug "DEBUG", "ERROR" "ERROR", :warning "WARNING", "DEBUG" "DEBUG", :info "INFO", :error "ERROR", "INFO" "INFO"} input), :shape "LogLevel"})

(clojure.core/defn- ser-follow-point [input] #:http.request.field{:value (clojure.core/get {"END" "END", :end "END", "START" "START", :start "START"} input), :shape "FollowPoint"})

(clojure.core/defn- ser-integer-min-0-max-500 [input] #:http.request.field{:value input, :shape "__integerMin0Max500"})

(clojure.core/defn- ser-i-frame-only-playlist-type [input] #:http.request.field{:value (clojure.core/get {"DISABLED" "DISABLED", :disabled "DISABLED", "STANDARD" "STANDARD", :standard "STANDARD"} input), :shape "IFrameOnlyPlaylistType"})

(clojure.core/defn- ser-input-loss-behavior [input] (clojure.core/cond-> #:http.request.field{:value [], :shape "InputLossBehavior", :type "structure"} (clojure.core/contains? input :black-frame-msec) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-integer-min-0-max-1000000 (input :black-frame-msec)) #:http.request.field{:name "BlackFrameMsec", :shape "__integerMin0Max1000000", :location-name "blackFrameMsec"})) (clojure.core/contains? input :input-loss-image-color) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-string-min-6-max-6 (input :input-loss-image-color)) #:http.request.field{:name "InputLossImageColor", :shape "__stringMin6Max6", :location-name "inputLossImageColor"})) (clojure.core/contains? input :input-loss-image-slate) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-input-location (input :input-loss-image-slate)) #:http.request.field{:name "InputLossImageSlate", :shape "InputLocation", :location-name "inputLossImageSlate"})) (clojure.core/contains? input :input-loss-image-type) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-input-loss-image-type (input :input-loss-image-type)) #:http.request.field{:name "InputLossImageType", :shape "InputLossImageType", :location-name "inputLossImageType"})) (clojure.core/contains? input :repeat-frame-msec) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-integer-min-0-max-1000000 (input :repeat-frame-msec)) #:http.request.field{:name "RepeatFrameMsec", :shape "__integerMin0Max1000000", :location-name "repeatFrameMsec"}))))

(clojure.core/defn- ser-input-loss-image-type [input] #:http.request.field{:value (clojure.core/get {"COLOR" "COLOR", :color "COLOR", "SLATE" "SLATE", :slate "SLATE"} input), :shape "InputLossImageType"})

(clojure.core/defn- ser-list-of-output-destination-settings [input] #:http.request.field{:value (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (clojure.core/merge (ser-output-destination-settings coll) #:http.request.field{:shape "OutputDestinationSettings"}))) input), :shape "__listOfOutputDestinationSettings", :type "list"})

(clojure.core/defn- ser-udp-group-settings [input] (clojure.core/cond-> #:http.request.field{:value [], :shape "UdpGroupSettings", :type "structure"} (clojure.core/contains? input :input-loss-action) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-input-loss-action-for-udp-out (input :input-loss-action)) #:http.request.field{:name "InputLossAction", :shape "InputLossActionForUdpOut", :location-name "inputLossAction"})) (clojure.core/contains? input :timed-metadata-id-3-frame) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-udp-timed-metadata-id-3-frame (input :timed-metadata-id-3-frame)) #:http.request.field{:name "TimedMetadataId3Frame", :shape "UdpTimedMetadataId3Frame", :location-name "timedMetadataId3Frame"})) (clojure.core/contains? input :timed-metadata-id-3-period) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-integer-min-0 (input :timed-metadata-id-3-period)) #:http.request.field{:name "TimedMetadataId3Period", :shape "__integerMin0", :location-name "timedMetadataId3Period"}))))

(clojure.core/defn- ser-input-whitelist-rule-cidr [input] (clojure.core/cond-> #:http.request.field{:value [], :shape "InputWhitelistRuleCidr", :type "structure"} (clojure.core/contains? input :cidr) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-string (input :cidr)) #:http.request.field{:name "Cidr", :shape "__string", :location-name "cidr"}))))

(clojure.core/defn- ser-m-2ts-arib [input] #:http.request.field{:value (clojure.core/get {"DISABLED" "DISABLED", :disabled "DISABLED", "ENABLED" "ENABLED", :enabled "ENABLED"} input), :shape "M2tsArib"})

(clojure.core/defn- ser-dvb-sub-destination-font-color [input] #:http.request.field{:value (clojure.core/get {:white "WHITE", :yellow "YELLOW", :green "GREEN", "GREEN" "GREEN", "BLUE" "BLUE", :red "RED", :blue "BLUE", "WHITE" "WHITE", "YELLOW" "YELLOW", "BLACK" "BLACK", "RED" "RED", :black "BLACK"} input), :shape "DvbSubDestinationFontColor"})

(clojure.core/defn- ser-input-type [input] #:http.request.field{:value (clojure.core/get {:mediaconnect "MEDIACONNECT", :rtmp-pull "RTMP_PULL", "MP4_FILE" "MP4_FILE", :url-pull "URL_PULL", :mp-4-file "MP4_FILE", :rtmp-push "RTMP_PUSH", "RTMP_PULL" "RTMP_PULL", "UDP_PUSH" "UDP_PUSH", "URL_PULL" "URL_PULL", :rtp-push "RTP_PUSH", :udp-push "UDP_PUSH", "RTP_PUSH" "RTP_PUSH", "MEDIACONNECT" "MEDIACONNECT", "RTMP_PUSH" "RTMP_PUSH"} input), :shape "InputType"})

(clojure.core/defn- ser-dvb-sdt-settings [input] (clojure.core/cond-> #:http.request.field{:value [], :shape "DvbSdtSettings", :type "structure"} (clojure.core/contains? input :output-sdt) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-dvb-sdt-output-sdt (input :output-sdt)) #:http.request.field{:name "OutputSdt", :shape "DvbSdtOutputSdt", :location-name "outputSdt"})) (clojure.core/contains? input :rep-interval) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-integer-min-25-max-2000 (input :rep-interval)) #:http.request.field{:name "RepInterval", :shape "__integerMin25Max2000", :location-name "repInterval"})) (clojure.core/contains? input :service-name) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-string-min-1-max-256 (input :service-name)) #:http.request.field{:name "ServiceName", :shape "__stringMin1Max256", :location-name "serviceName"})) (clojure.core/contains? input :service-provider-name) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-string-min-1-max-256 (input :service-provider-name)) #:http.request.field{:name "ServiceProviderName", :shape "__stringMin1Max256", :location-name "serviceProviderName"}))))

(clojure.core/defn- ser-burn-in-background-color [input] #:http.request.field{:value (clojure.core/get {"BLACK" "BLACK", :black "BLACK", "NONE" "NONE", :none "NONE", "WHITE" "WHITE", :white "WHITE"} input), :shape "BurnInBackgroundColor"})

(clojure.core/defn- ser-video-selector-program-id [input] (clojure.core/cond-> #:http.request.field{:value [], :shape "VideoSelectorProgramId", :type "structure"} (clojure.core/contains? input :program-id) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-integer-min-0-max-65536 (input :program-id)) #:http.request.field{:name "ProgramId", :shape "__integerMin0Max65536", :location-name "programId"}))))

(clojure.core/defn- ser-archive-group-settings [input] (clojure.core/cond-> #:http.request.field{:value [(clojure.core/into (ser-output-location-ref (:destination input)) #:http.request.field{:name "Destination", :shape "OutputLocationRef", :location-name "destination"})], :shape "ArchiveGroupSettings", :type "structure"} (clojure.core/contains? input :rollover-interval) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-integer-min-1 (input :rollover-interval)) #:http.request.field{:name "RolloverInterval", :shape "__integerMin1", :location-name "rolloverInterval"}))))

(clojure.core/defn- ser-hls-timed-metadata-schedule-action-settings [input] (clojure.core/cond-> #:http.request.field{:value [(clojure.core/into (ser-string (:id-3 input)) #:http.request.field{:name "Id3", :shape "__string", :location-name "id3"})], :shape "HlsTimedMetadataScheduleActionSettings", :type "structure"}))

(clojure.core/defn- ser-udp-output-settings [input] (clojure.core/cond-> #:http.request.field{:value [(clojure.core/into (ser-output-location-ref (:destination input)) #:http.request.field{:name "Destination", :shape "OutputLocationRef", :location-name "destination"}) (clojure.core/into (ser-udp-container-settings (:container-settings input)) #:http.request.field{:name "ContainerSettings", :shape "UdpContainerSettings", :location-name "containerSettings"})], :shape "UdpOutputSettings", :type "structure"} (clojure.core/contains? input :buffer-msec) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-integer-min-0-max-10000 (input :buffer-msec)) #:http.request.field{:name "BufferMsec", :shape "__integerMin0Max10000", :location-name "bufferMsec"})) (clojure.core/contains? input :fec-output-settings) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-fec-output-settings (input :fec-output-settings)) #:http.request.field{:name "FecOutputSettings", :shape "FecOutputSettings", :location-name "fecOutputSettings"}))))

(clojure.core/defn- ser-udp-timed-metadata-id-3-frame [input] #:http.request.field{:value (clojure.core/get {"NONE" "NONE", :none "NONE", "PRIV" "PRIV", :priv "PRIV", "TDRL" "TDRL", :tdrl "TDRL"} input), :shape "UdpTimedMetadataId3Frame"})

(clojure.core/defn- ser-input-destination-request [input] (clojure.core/cond-> #:http.request.field{:value [], :shape "InputDestinationRequest", :type "structure"} (clojure.core/contains? input :stream-name) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-string (input :stream-name)) #:http.request.field{:name "StreamName", :shape "__string", :location-name "streamName"}))))

(clojure.core/defn- ser-integer-min-0 [input] #:http.request.field{:value input, :shape "__integerMin0"})

(clojure.core/defn- ser-hls-settings [input] (clojure.core/cond-> #:http.request.field{:value [], :shape "HlsSettings", :type "structure"} (clojure.core/contains? input :audio-only-hls-settings) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-audio-only-hls-settings (input :audio-only-hls-settings)) #:http.request.field{:name "AudioOnlyHlsSettings", :shape "AudioOnlyHlsSettings", :location-name "audioOnlyHlsSettings"})) (clojure.core/contains? input :standard-hls-settings) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-standard-hls-settings (input :standard-hls-settings)) #:http.request.field{:name "StandardHlsSettings", :shape "StandardHlsSettings", :location-name "standardHlsSettings"}))))

(clojure.core/defn- ser-scte-35-splice-insert-schedule-action-settings [input] (clojure.core/cond-> #:http.request.field{:value [(clojure.core/into (ser-integer-min-0-max-4294967295 (:splice-event-id input)) #:http.request.field{:name "SpliceEventId", :shape "__integerMin0Max4294967295", :location-name "spliceEventId"})], :shape "Scte35SpliceInsertScheduleActionSettings", :type "structure"} (clojure.core/contains? input :duration) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-integer-min-0-max-8589934591 (input :duration)) #:http.request.field{:name "Duration", :shape "__integerMin0Max8589934591", :location-name "duration"}))))

(clojure.core/defn- ser-ac-3-lfe-filter [input] #:http.request.field{:value (clojure.core/get {"DISABLED" "DISABLED", :disabled "DISABLED", "ENABLED" "ENABLED", :enabled "ENABLED"} input), :shape "Ac3LfeFilter"})

(clojure.core/defn- ser-burn-in-teletext-grid-control [input] #:http.request.field{:value (clojure.core/get {"FIXED" "FIXED", :fixed "FIXED", "SCALED" "SCALED", :scaled "SCALED"} input), :shape "BurnInTeletextGridControl"})

(clojure.core/defn- ser-scte-27-destination-settings [input] (clojure.core/cond-> #:http.request.field{:value [], :shape "Scte27DestinationSettings", :type "structure"}))

(clojure.core/defn- ser-schedule-action [input] (clojure.core/cond-> #:http.request.field{:value [(clojure.core/into (ser-string (:action-name input)) #:http.request.field{:name "ActionName", :shape "__string", :location-name "actionName"}) (clojure.core/into (ser-schedule-action-start-settings (:schedule-action-start-settings input)) #:http.request.field{:name "ScheduleActionStartSettings", :shape "ScheduleActionStartSettings", :location-name "scheduleActionStartSettings"}) (clojure.core/into (ser-schedule-action-settings (:schedule-action-settings input)) #:http.request.field{:name "ScheduleActionSettings", :shape "ScheduleActionSettings", :location-name "scheduleActionSettings"})], :shape "ScheduleAction", :type "structure"}))

(clojure.core/defn- ser-video-selector-color-space-usage [input] #:http.request.field{:value (clojure.core/get {"FALLBACK" "FALLBACK", :fallback "FALLBACK", "FORCE" "FORCE", :force "FORCE"} input), :shape "VideoSelectorColorSpaceUsage"})

(clojure.core/defn- ser-scte-20-source-settings [input] (clojure.core/cond-> #:http.request.field{:value [], :shape "Scte20SourceSettings", :type "structure"} (clojure.core/contains? input :convert-608-to-708) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-scte-20-convert-608-to-708 (input :convert-608-to-708)) #:http.request.field{:name "Convert608To708", :shape "Scte20Convert608To708", :location-name "convert608To708"})) (clojure.core/contains? input :source-608-channel-number) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-integer-min-1-max-4 (input :source-608-channel-number)) #:http.request.field{:name "Source608ChannelNumber", :shape "__integerMin1Max4", :location-name "source608ChannelNumber"}))))

(clojure.core/defn- ser-hls-stream-inf-resolution [input] #:http.request.field{:value (clojure.core/get {"EXCLUDE" "EXCLUDE", :exclude "EXCLUDE", "INCLUDE" "INCLUDE", :include "INCLUDE"} input), :shape "HlsStreamInfResolution"})

(clojure.core/defn- ser-list-of-schedule-action [input] #:http.request.field{:value (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (clojure.core/merge (ser-schedule-action coll) #:http.request.field{:shape "ScheduleAction"}))) input), :shape "__listOfScheduleAction", :type "list"})

(clojure.core/defn- ser-hls-caption-language-setting [input] #:http.request.field{:value (clojure.core/get {"INSERT" "INSERT", :insert "INSERT", "NONE" "NONE", :none "NONE", "OMIT" "OMIT", :omit "OMIT"} input), :shape "HlsCaptionLanguageSetting"})

(clojure.core/defn- ser-list-of-input-whitelist-rule-cidr [input] #:http.request.field{:value (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (clojure.core/merge (ser-input-whitelist-rule-cidr coll) #:http.request.field{:shape "InputWhitelistRuleCidr"}))) input), :shape "__listOfInputWhitelistRuleCidr", :type "list"})

(clojure.core/defn- ser-m-2ts-settings [input] (clojure.core/cond-> #:http.request.field{:value [], :shape "M2tsSettings", :type "structure"} (clojure.core/contains? input :pat-interval) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-integer-min-0-max-1000 (input :pat-interval)) #:http.request.field{:name "PatInterval", :shape "__integerMin0Max1000", :location-name "patInterval"})) (clojure.core/contains? input :buffer-model) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-m-2ts-buffer-model (input :buffer-model)) #:http.request.field{:name "BufferModel", :shape "M2tsBufferModel", :location-name "bufferModel"})) (clojure.core/contains? input :dvb-tdt-settings) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-dvb-tdt-settings (input :dvb-tdt-settings)) #:http.request.field{:name "DvbTdtSettings", :shape "DvbTdtSettings", :location-name "dvbTdtSettings"})) (clojure.core/contains? input :audio-frames-per-pes) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-integer-min-0 (input :audio-frames-per-pes)) #:http.request.field{:name "AudioFramesPerPes", :shape "__integerMin0", :location-name "audioFramesPerPes"})) (clojure.core/contains? input :fragment-time) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-double-min-0 (input :fragment-time)) #:http.request.field{:name "FragmentTime", :shape "__doubleMin0", :location-name "fragmentTime"})) (clojure.core/contains? input :transport-stream-id) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-integer-min-0-max-65535 (input :transport-stream-id)) #:http.request.field{:name "TransportStreamId", :shape "__integerMin0Max65535", :location-name "transportStreamId"})) (clojure.core/contains? input :timed-metadata-behavior) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-m-2ts-timed-metadata-behavior (input :timed-metadata-behavior)) #:http.request.field{:name "TimedMetadataBehavior", :shape "M2tsTimedMetadataBehavior", :location-name "timedMetadataBehavior"})) (clojure.core/contains? input :dvb-sdt-settings) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-dvb-sdt-settings (input :dvb-sdt-settings)) #:http.request.field{:name "DvbSdtSettings", :shape "DvbSdtSettings", :location-name "dvbSdtSettings"})) (clojure.core/contains? input :absent-input-audio-behavior) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-m-2ts-absent-input-audio-behavior (input :absent-input-audio-behavior)) #:http.request.field{:name "AbsentInputAudioBehavior", :shape "M2tsAbsentInputAudioBehavior", :location-name "absentInputAudioBehavior"})) (clojure.core/contains? input :pcr-control) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-m-2ts-pcr-control (input :pcr-control)) #:http.request.field{:name "PcrControl", :shape "M2tsPcrControl", :location-name "pcrControl"})) (clojure.core/contains? input :scte-35-pid) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-string (input :scte-35-pid)) #:http.request.field{:name "Scte35Pid", :shape "__string", :location-name "scte35Pid"})) (clojure.core/contains? input :pcr-pid) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-string (input :pcr-pid)) #:http.request.field{:name "PcrPid", :shape "__string", :location-name "pcrPid"})) (clojure.core/contains? input :pmt-pid) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-string (input :pmt-pid)) #:http.request.field{:name "PmtPid", :shape "__string", :location-name "pmtPid"})) (clojure.core/contains? input :video-pid) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-string (input :video-pid)) #:http.request.field{:name "VideoPid", :shape "__string", :location-name "videoPid"})) (clojure.core/contains? input :rate-mode) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-m-2ts-rate-mode (input :rate-mode)) #:http.request.field{:name "RateMode", :shape "M2tsRateMode", :location-name "rateMode"})) (clojure.core/contains? input :audio-pids) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-string (input :audio-pids)) #:http.request.field{:name "AudioPids", :shape "__string", :location-name "audioPids"})) (clojure.core/contains? input :etv-platform-pid) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-string (input :etv-platform-pid)) #:http.request.field{:name "EtvPlatformPid", :shape "__string", :location-name "etvPlatformPid"})) (clojure.core/contains? input :ebp-lookahead-ms) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-integer-min-0-max-10000 (input :ebp-lookahead-ms)) #:http.request.field{:name "EbpLookaheadMs", :shape "__integerMin0Max10000", :location-name "ebpLookaheadMs"})) (clojure.core/contains? input :arib) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-m-2ts-arib (input :arib)) #:http.request.field{:name "Arib", :shape "M2tsArib", :location-name "arib"})) (clojure.core/contains? input :ebif) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-m-2ts-ebif-control (input :ebif)) #:http.request.field{:name "Ebif", :shape "M2tsEbifControl", :location-name "ebif"})) (clojure.core/contains? input :pcr-period) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-integer-min-0-max-500 (input :pcr-period)) #:http.request.field{:name "PcrPeriod", :shape "__integerMin0Max500", :location-name "pcrPeriod"})) (clojure.core/contains? input :cc-descriptor) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-m-2ts-cc-descriptor (input :cc-descriptor)) #:http.request.field{:name "CcDescriptor", :shape "M2tsCcDescriptor", :location-name "ccDescriptor"})) (clojure.core/contains? input :etv-signal-pid) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-string (input :etv-signal-pid)) #:http.request.field{:name "EtvSignalPid", :shape "__string", :location-name "etvSignalPid"})) (clojure.core/contains? input :pmt-interval) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-integer-min-0-max-1000 (input :pmt-interval)) #:http.request.field{:name "PmtInterval", :shape "__integerMin0Max1000", :location-name "pmtInterval"})) (clojure.core/contains? input :segmentation-style) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-m-2ts-segmentation-style (input :segmentation-style)) #:http.request.field{:name "SegmentationStyle", :shape "M2tsSegmentationStyle", :location-name "segmentationStyle"})) (clojure.core/contains? input :null-packet-bitrate) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-double-min-0 (input :null-packet-bitrate)) #:http.request.field{:name "NullPacketBitrate", :shape "__doubleMin0", :location-name "nullPacketBitrate"})) (clojure.core/contains? input :segmentation-markers) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-m-2ts-segmentation-markers (input :segmentation-markers)) #:http.request.field{:name "SegmentationMarkers", :shape "M2tsSegmentationMarkers", :location-name "segmentationMarkers"})) (clojure.core/contains? input :ebp-placement) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-m-2ts-ebp-placement (input :ebp-placement)) #:http.request.field{:name "EbpPlacement", :shape "M2tsEbpPlacement", :location-name "ebpPlacement"})) (clojure.core/contains? input :scte-35-control) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-m-2ts-scte-35-control (input :scte-35-control)) #:http.request.field{:name "Scte35Control", :shape "M2tsScte35Control", :location-name "scte35Control"})) (clojure.core/contains? input :audio-buffer-model) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-m-2ts-audio-buffer-model (input :audio-buffer-model)) #:http.request.field{:name "AudioBufferModel", :shape "M2tsAudioBufferModel", :location-name "audioBufferModel"})) (clojure.core/contains? input :es-rate-in-pes) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-m-2ts-es-rate-in-pes (input :es-rate-in-pes)) #:http.request.field{:name "EsRateInPes", :shape "M2tsEsRateInPes", :location-name "esRateInPes"})) (clojure.core/contains? input :klv) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-m-2ts-klv (input :klv)) #:http.request.field{:name "Klv", :shape "M2tsKlv", :location-name "klv"})) (clojure.core/contains? input :program-num) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-integer-min-0-max-65535 (input :program-num)) #:http.request.field{:name "ProgramNum", :shape "__integerMin0Max65535", :location-name "programNum"})) (clojure.core/contains? input :timed-metadata-pid) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-string (input :timed-metadata-pid)) #:http.request.field{:name "TimedMetadataPid", :shape "__string", :location-name "timedMetadataPid"})) (clojure.core/contains? input :audio-stream-type) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-m-2ts-audio-stream-type (input :audio-stream-type)) #:http.request.field{:name "AudioStreamType", :shape "M2tsAudioStreamType", :location-name "audioStreamType"})) (clojure.core/contains? input :scte-27-pids) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-string (input :scte-27-pids)) #:http.request.field{:name "Scte27Pids", :shape "__string", :location-name "scte27Pids"})) (clojure.core/contains? input :arib-captions-pid-control) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-m-2ts-arib-captions-pid-control (input :arib-captions-pid-control)) #:http.request.field{:name "AribCaptionsPidControl", :shape "M2tsAribCaptionsPidControl", :location-name "aribCaptionsPidControl"})) (clojure.core/contains? input :klv-data-pids) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-string (input :klv-data-pids)) #:http.request.field{:name "KlvDataPids", :shape "__string", :location-name "klvDataPids"})) (clojure.core/contains? input :dvb-sub-pids) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-string (input :dvb-sub-pids)) #:http.request.field{:name "DvbSubPids", :shape "__string", :location-name "dvbSubPids"})) (clojure.core/contains? input :ebp-audio-interval) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-m-2ts-audio-interval (input :ebp-audio-interval)) #:http.request.field{:name "EbpAudioInterval", :shape "M2tsAudioInterval", :location-name "ebpAudioInterval"})) (clojure.core/contains? input :ecm-pid) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-string (input :ecm-pid)) #:http.request.field{:name "EcmPid", :shape "__string", :location-name "ecmPid"})) (clojure.core/contains? input :dvb-nit-settings) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-dvb-nit-settings (input :dvb-nit-settings)) #:http.request.field{:name "DvbNitSettings", :shape "DvbNitSettings", :location-name "dvbNitSettings"})) (clojure.core/contains? input :dvb-teletext-pid) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-string (input :dvb-teletext-pid)) #:http.request.field{:name "DvbTeletextPid", :shape "__string", :location-name "dvbTeletextPid"})) (clojure.core/contains? input :arib-captions-pid) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-string (input :arib-captions-pid)) #:http.request.field{:name "AribCaptionsPid", :shape "__string", :location-name "aribCaptionsPid"})) (clojure.core/contains? input :bitrate) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-integer-min-0 (input :bitrate)) #:http.request.field{:name "Bitrate", :shape "__integerMin0", :location-name "bitrate"})) (clojure.core/contains? input :segmentation-time) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-double-min-1 (input :segmentation-time)) #:http.request.field{:name "SegmentationTime", :shape "__doubleMin1", :location-name "segmentationTime"}))))

(clojure.core/defn- ser-string [input] #:http.request.field{:value input, :shape "__string"})

(clojure.core/defn- ser-scte-35-splice-insert-no-regional-blackout-behavior [input] #:http.request.field{:value (clojure.core/get {"FOLLOW" "FOLLOW", :follow "FOLLOW", "IGNORE" "IGNORE", :ignore "IGNORE"} input), :shape "Scte35SpliceInsertNoRegionalBlackoutBehavior"})

(clojure.core/defn- ser-dvb-sub-source-settings [input] (clojure.core/cond-> #:http.request.field{:value [], :shape "DvbSubSourceSettings", :type "structure"} (clojure.core/contains? input :pid) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-integer-min-1 (input :pid)) #:http.request.field{:name "Pid", :shape "__integerMin1", :location-name "pid"}))))

(clojure.core/defn- ser-input-denoise-filter [input] #:http.request.field{:value (clojure.core/get {"DISABLED" "DISABLED", :disabled "DISABLED", "ENABLED" "ENABLED", :enabled "ENABLED"} input), :shape "InputDenoiseFilter"})

(clojure.core/defn- ser-video-selector-pid [input] (clojure.core/cond-> #:http.request.field{:value [], :shape "VideoSelectorPid", :type "structure"} (clojure.core/contains? input :pid) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-integer-min-0-max-8191 (input :pid)) #:http.request.field{:name "Pid", :shape "__integerMin0Max8191", :location-name "pid"}))))

(clojure.core/defn- ser-scte-35-descriptor-settings [input] (clojure.core/cond-> #:http.request.field{:value [(clojure.core/into (ser-scte-35-segmentation-descriptor (:segmentation-descriptor-scte-35-descriptor-settings input)) #:http.request.field{:name "SegmentationDescriptorScte35DescriptorSettings", :shape "Scte35SegmentationDescriptor", :location-name "segmentationDescriptorScte35DescriptorSettings"})], :shape "Scte35DescriptorSettings", :type "structure"}))

(clojure.core/defn- ser-afd-signaling [input] #:http.request.field{:value (clojure.core/get {"AUTO" "AUTO", :auto "AUTO", "FIXED" "FIXED", :fixed "FIXED", "NONE" "NONE", :none "NONE"} input), :shape "AfdSignaling"})

(clojure.core/defn- ser-list-of-audio-selector [input] #:http.request.field{:value (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (clojure.core/merge (ser-audio-selector coll) #:http.request.field{:shape "AudioSelector"}))) input), :shape "__listOfAudioSelector", :type "list"})

(clojure.core/defn- ser-aac-profile [input] #:http.request.field{:value (clojure.core/get {"HEV1" "HEV1", :hev-1 "HEV1", "HEV2" "HEV2", :hev-2 "HEV2", "LC" "LC", :lc "LC"} input), :shape "AacProfile"})

(clojure.core/defn- ser-burn-in-font-color [input] #:http.request.field{:value (clojure.core/get {:white "WHITE", :yellow "YELLOW", :green "GREEN", "GREEN" "GREEN", "BLUE" "BLUE", :red "RED", :blue "BLUE", "WHITE" "WHITE", "YELLOW" "YELLOW", "BLACK" "BLACK", "RED" "RED", :black "BLACK"} input), :shape "BurnInFontColor"})

(clojure.core/defn- ser-pause-state-schedule-action-settings [input] (clojure.core/cond-> #:http.request.field{:value [], :shape "PauseStateScheduleActionSettings", :type "structure"} (clojure.core/contains? input :pipelines) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-list-of-pipeline-pause-state-settings (input :pipelines)) #:http.request.field{:name "Pipelines", :shape "__listOfPipelinePauseStateSettings", :location-name "pipelines"}))))

(clojure.core/defn- ser-input-source-request [input] (clojure.core/cond-> #:http.request.field{:value [], :shape "InputSourceRequest", :type "structure"} (clojure.core/contains? input :password-param) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-string (input :password-param)) #:http.request.field{:name "PasswordParam", :shape "__string", :location-name "passwordParam"})) (clojure.core/contains? input :url) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-string (input :url)) #:http.request.field{:name "Url", :shape "__string", :location-name "url"})) (clojure.core/contains? input :username) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-string (input :username)) #:http.request.field{:name "Username", :shape "__string", :location-name "username"}))))

(clojure.core/defn- ser-eac-3-metadata-control [input] #:http.request.field{:value (clojure.core/get {"FOLLOW_INPUT" "FOLLOW_INPUT", :follow-input "FOLLOW_INPUT", "USE_CONFIGURED" "USE_CONFIGURED", :use-configured "USE_CONFIGURED"} input), :shape "Eac3MetadataControl"})

(clojure.core/defn- ser-fec-output-settings [input] (clojure.core/cond-> #:http.request.field{:value [], :shape "FecOutputSettings", :type "structure"} (clojure.core/contains? input :column-depth) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-integer-min-4-max-20 (input :column-depth)) #:http.request.field{:name "ColumnDepth", :shape "__integerMin4Max20", :location-name "columnDepth"})) (clojure.core/contains? input :include-fec) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-fec-output-include-fec (input :include-fec)) #:http.request.field{:name "IncludeFec", :shape "FecOutputIncludeFec", :location-name "includeFec"})) (clojure.core/contains? input :row-length) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-integer-min-1-max-20 (input :row-length)) #:http.request.field{:name "RowLength", :shape "__integerMin1Max20", :location-name "rowLength"}))))

(clojure.core/defn- ser-global-configuration-input-end-action [input] #:http.request.field{:value (clojure.core/get {"NONE" "NONE", :none "NONE", "SWITCH_AND_LOOP_INPUTS" "SWITCH_AND_LOOP_INPUTS", :switch-and-loop-inputs "SWITCH_AND_LOOP_INPUTS"} input), :shape "GlobalConfigurationInputEndAction"})

(clojure.core/defn- ser-integer-min-0-max-65535 [input] #:http.request.field{:value input, :shape "__integerMin0Max65535"})

(clojure.core/defn- ser-hls-webdav-http-transfer-mode [input] #:http.request.field{:value (clojure.core/get {"CHUNKED" "CHUNKED", :chunked "CHUNKED", "NON_CHUNKED" "NON_CHUNKED", :non-chunked "NON_CHUNKED"} input), :shape "HlsWebdavHttpTransferMode"})

(clojure.core/defn- ser-hls-webdav-settings [input] (clojure.core/cond-> #:http.request.field{:value [], :shape "HlsWebdavSettings", :type "structure"} (clojure.core/contains? input :connection-retry-interval) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-integer-min-0 (input :connection-retry-interval)) #:http.request.field{:name "ConnectionRetryInterval", :shape "__integerMin0", :location-name "connectionRetryInterval"})) (clojure.core/contains? input :filecache-duration) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-integer-min-0-max-600 (input :filecache-duration)) #:http.request.field{:name "FilecacheDuration", :shape "__integerMin0Max600", :location-name "filecacheDuration"})) (clojure.core/contains? input :http-transfer-mode) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-hls-webdav-http-transfer-mode (input :http-transfer-mode)) #:http.request.field{:name "HttpTransferMode", :shape "HlsWebdavHttpTransferMode", :location-name "httpTransferMode"})) (clojure.core/contains? input :num-retries) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-integer-min-0 (input :num-retries)) #:http.request.field{:name "NumRetries", :shape "__integerMin0", :location-name "numRetries"})) (clojure.core/contains? input :restart-delay) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-integer-min-0-max-15 (input :restart-delay)) #:http.request.field{:name "RestartDelay", :shape "__integerMin0Max15", :location-name "restartDelay"}))))

(clojure.core/defn- ser-double-min-1 [input] #:http.request.field{:value input, :shape "__doubleMin1"})

(clojure.core/defn- ser-dvb-sub-destination-background-color [input] #:http.request.field{:value (clojure.core/get {"BLACK" "BLACK", :black "BLACK", "NONE" "NONE", :none "NONE", "WHITE" "WHITE", :white "WHITE"} input), :shape "DvbSubDestinationBackgroundColor"})

(clojure.core/defn- ser-mp-2-coding-mode [input] #:http.request.field{:value (clojure.core/get {"CODING_MODE_1_0" "CODING_MODE_1_0", :coding-mode-1-0 "CODING_MODE_1_0", "CODING_MODE_2_0" "CODING_MODE_2_0", :coding-mode-2-0 "CODING_MODE_2_0"} input), :shape "Mp2CodingMode"})

(clojure.core/defn- ser-list-of-output-group [input] #:http.request.field{:value (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (clojure.core/merge (ser-output-group coll) #:http.request.field{:shape "OutputGroup"}))) input), :shape "__listOfOutputGroup", :type "list"})

(clojure.core/defn- ser-scte-35-delivery-restrictions [input] (clojure.core/cond-> #:http.request.field{:value [(clojure.core/into (ser-scte-35-device-restrictions (:device-restrictions input)) #:http.request.field{:name "DeviceRestrictions", :shape "Scte35DeviceRestrictions", :location-name "deviceRestrictions"}) (clojure.core/into (ser-scte-35-archive-allowed-flag (:archive-allowed-flag input)) #:http.request.field{:name "ArchiveAllowedFlag", :shape "Scte35ArchiveAllowedFlag", :location-name "archiveAllowedFlag"}) (clojure.core/into (ser-scte-35-web-delivery-allowed-flag (:web-delivery-allowed-flag input)) #:http.request.field{:name "WebDeliveryAllowedFlag", :shape "Scte35WebDeliveryAllowedFlag", :location-name "webDeliveryAllowedFlag"}) (clojure.core/into (ser-scte-35-no-regional-blackout-flag (:no-regional-blackout-flag input)) #:http.request.field{:name "NoRegionalBlackoutFlag", :shape "Scte35NoRegionalBlackoutFlag", :location-name "noRegionalBlackoutFlag"})], :shape "Scte35DeliveryRestrictions", :type "structure"}))

(clojure.core/defn- ser-m-2ts-timed-metadata-behavior [input] #:http.request.field{:value (clojure.core/get {"NO_PASSTHROUGH" "NO_PASSTHROUGH", :no-passthrough "NO_PASSTHROUGH", "PASSTHROUGH" "PASSTHROUGH", :passthrough "PASSTHROUGH"} input), :shape "M2tsTimedMetadataBehavior"})

(clojure.core/defn- ser-tags [input] #:http.request.field{:value (clojure.core/into [] (clojure.core/map (clojure.core/fn [[k v]] [(clojure.core/into (ser-string k) #:http.request.field{:map-info "key", :shape "__string"}) (clojure.core/into (ser-string v) #:http.request.field{:map-info "value", :shape "__string"})])) input), :shape "Tags", :type "map"})

(clojure.core/defn- ser-fec-output-include-fec [input] #:http.request.field{:value (clojure.core/get {"COLUMN" "COLUMN", :column "COLUMN", "COLUMN_AND_ROW" "COLUMN_AND_ROW", :column-and-row "COLUMN_AND_ROW"} input), :shape "FecOutputIncludeFec"})

(clojure.core/defn- ser-scte-35-segmentation-cancel-indicator [input] #:http.request.field{:value (clojure.core/get {"SEGMENTATION_EVENT_NOT_CANCELED" "SEGMENTATION_EVENT_NOT_CANCELED", :segmentation-event-not-canceled "SEGMENTATION_EVENT_NOT_CANCELED", "SEGMENTATION_EVENT_CANCELED" "SEGMENTATION_EVENT_CANCELED", :segmentation-event-canceled "SEGMENTATION_EVENT_CANCELED"} input), :shape "Scte35SegmentationCancelIndicator"})

(clojure.core/defn- ser-rtmp-output-certificate-mode [input] #:http.request.field{:value (clojure.core/get {"SELF_SIGNED" "SELF_SIGNED", :self-signed "SELF_SIGNED", "VERIFY_AUTHENTICITY" "VERIFY_AUTHENTICITY", :verify-authenticity "VERIFY_AUTHENTICITY"} input), :shape "RtmpOutputCertificateMode"})

(clojure.core/defn- ser-ac-3-drc-profile [input] #:http.request.field{:value (clojure.core/get {"FILM_STANDARD" "FILM_STANDARD", :film-standard "FILM_STANDARD", "NONE" "NONE", :none "NONE"} input), :shape "Ac3DrcProfile"})

(clojure.core/defn- ser-eac-3-lfe-control [input] #:http.request.field{:value (clojure.core/get {"LFE" "LFE", :lfe "LFE", "NO_LFE" "NO_LFE", :no-lfe "NO_LFE"} input), :shape "Eac3LfeControl"})

(clojure.core/defn- ser-media-connect-flow-request [input] (clojure.core/cond-> #:http.request.field{:value [], :shape "MediaConnectFlowRequest", :type "structure"} (clojure.core/contains? input :flow-arn) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-string (input :flow-arn)) #:http.request.field{:name "FlowArn", :shape "__string", :location-name "flowArn"}))))

(clojure.core/defn- ser-teletext-source-settings [input] (clojure.core/cond-> #:http.request.field{:value [], :shape "TeletextSourceSettings", :type "structure"} (clojure.core/contains? input :page-number) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-string (input :page-number)) #:http.request.field{:name "PageNumber", :shape "__string", :location-name "pageNumber"}))))

(clojure.core/defn- ser-m-3u-8-scte-35-behavior [input] #:http.request.field{:value (clojure.core/get {"NO_PASSTHROUGH" "NO_PASSTHROUGH", :no-passthrough "NO_PASSTHROUGH", "PASSTHROUGH" "PASSTHROUGH", :passthrough "PASSTHROUGH"} input), :shape "M3u8Scte35Behavior"})

(clojure.core/defn- ser-rtmp-output-settings [input] (clojure.core/cond-> #:http.request.field{:value [(clojure.core/into (ser-output-location-ref (:destination input)) #:http.request.field{:name "Destination", :shape "OutputLocationRef", :location-name "destination"})], :shape "RtmpOutputSettings", :type "structure"} (clojure.core/contains? input :certificate-mode) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-rtmp-output-certificate-mode (input :certificate-mode)) #:http.request.field{:name "CertificateMode", :shape "RtmpOutputCertificateMode", :location-name "certificateMode"})) (clojure.core/contains? input :connection-retry-interval) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-integer-min-1 (input :connection-retry-interval)) #:http.request.field{:name "ConnectionRetryInterval", :shape "__integerMin1", :location-name "connectionRetryInterval"})) (clojure.core/contains? input :num-retries) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-integer-min-0 (input :num-retries)) #:http.request.field{:name "NumRetries", :shape "__integerMin0", :location-name "numRetries"}))))

(clojure.core/defn- ser-global-configuration-low-framerate-inputs [input] #:http.request.field{:value (clojure.core/get {"DISABLED" "DISABLED", :disabled "DISABLED", "ENABLED" "ENABLED", :enabled "ENABLED"} input), :shape "GlobalConfigurationLowFramerateInputs"})

(clojure.core/defn- ser-eac-3-surround-mode [input] #:http.request.field{:value (clojure.core/get {"DISABLED" "DISABLED", :disabled "DISABLED", "ENABLED" "ENABLED", :enabled "ENABLED", "NOT_INDICATED" "NOT_INDICATED", :not-indicated "NOT_INDICATED"} input), :shape "Eac3SurroundMode"})

(clojure.core/defn- ser-avail-blanking-state [input] #:http.request.field{:value (clojure.core/get {"DISABLED" "DISABLED", :disabled "DISABLED", "ENABLED" "ENABLED", :enabled "ENABLED"} input), :shape "AvailBlankingState"})

(clojure.core/defn- ser-audio-channel-mapping [input] (clojure.core/cond-> #:http.request.field{:value [(clojure.core/into (ser-integer-min-0-max-7 (:output-channel input)) #:http.request.field{:name "OutputChannel", :shape "__integerMin0Max7", :location-name "outputChannel"}) (clojure.core/into (ser-list-of-input-channel-level (:input-channel-levels input)) #:http.request.field{:name "InputChannelLevels", :shape "__listOfInputChannelLevel", :location-name "inputChannelLevels"})], :shape "AudioChannelMapping", :type "structure"}))

(clojure.core/defn- ser-h-264-look-ahead-rate-control [input] #:http.request.field{:value (clojure.core/get {"HIGH" "HIGH", :high "HIGH", "LOW" "LOW", :low "LOW", "MEDIUM" "MEDIUM", :medium "MEDIUM"} input), :shape "H264LookAheadRateControl"})

(clojure.core/defn- ser-hls-akamai-http-transfer-mode [input] #:http.request.field{:value (clojure.core/get {"CHUNKED" "CHUNKED", :chunked "CHUNKED", "NON_CHUNKED" "NON_CHUNKED", :non-chunked "NON_CHUNKED"} input), :shape "HlsAkamaiHttpTransferMode"})

(clojure.core/defn- ser-h-264-sub-gop-length [input] #:http.request.field{:value (clojure.core/get {"DYNAMIC" "DYNAMIC", :dynamic "DYNAMIC", "FIXED" "FIXED", :fixed "FIXED"} input), :shape "H264SubGopLength"})

(clojure.core/defn- ser-ms-smooth-output-settings [input] (clojure.core/cond-> #:http.request.field{:value [], :shape "MsSmoothOutputSettings", :type "structure"} (clojure.core/contains? input :name-modifier) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-string (input :name-modifier)) #:http.request.field{:name "NameModifier", :shape "__string", :location-name "nameModifier"}))))

(clojure.core/defn- ser-video-selector-settings [input] (clojure.core/cond-> #:http.request.field{:value [], :shape "VideoSelectorSettings", :type "structure"} (clojure.core/contains? input :video-selector-pid) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-video-selector-pid (input :video-selector-pid)) #:http.request.field{:name "VideoSelectorPid", :shape "VideoSelectorPid", :location-name "videoSelectorPid"})) (clojure.core/contains? input :video-selector-program-id) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-video-selector-program-id (input :video-selector-program-id)) #:http.request.field{:name "VideoSelectorProgramId", :shape "VideoSelectorProgramId", :location-name "videoSelectorProgramId"}))))

(clojure.core/defn- ser-eac-3-lfe-filter [input] #:http.request.field{:value (clojure.core/get {"DISABLED" "DISABLED", :disabled "DISABLED", "ENABLED" "ENABLED", :enabled "ENABLED"} input), :shape "Eac3LfeFilter"})

(clojure.core/defn- ser-integer-min-negative-60-max-60 [input] #:http.request.field{:value input, :shape "__integerMinNegative60Max60"})

(clojure.core/defn- ser-integer-min-0-max-8589934591 [input] #:http.request.field{:value input, :shape "__integerMin0Max8589934591"})

(clojure.core/defn- ser-list-of-input-channel-level [input] #:http.request.field{:value (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (clojure.core/merge (ser-input-channel-level coll) #:http.request.field{:shape "InputChannelLevel"}))) input), :shape "__listOfInputChannelLevel", :type "list"})

(clojure.core/defn- ser-h-264-rate-control-mode [input] #:http.request.field{:value (clojure.core/get {"CBR" "CBR", :cbr "CBR", "QVBR" "QVBR", :qvbr "QVBR", "VBR" "VBR", :vbr "VBR"} input), :shape "H264RateControlMode"})

(clojure.core/defn- ser-integer-min-0-max-255 [input] #:http.request.field{:value input, :shape "__integerMin0Max255"})

(clojure.core/defn- ser-list-of-output-destination [input] #:http.request.field{:value (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (clojure.core/merge (ser-output-destination coll) #:http.request.field{:shape "OutputDestination"}))) input), :shape "__listOfOutputDestination", :type "list"})

(clojure.core/defn- ser-video-selector [input] (clojure.core/cond-> #:http.request.field{:value [], :shape "VideoSelector", :type "structure"} (clojure.core/contains? input :color-space) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-video-selector-color-space (input :color-space)) #:http.request.field{:name "ColorSpace", :shape "VideoSelectorColorSpace", :location-name "colorSpace"})) (clojure.core/contains? input :color-space-usage) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-video-selector-color-space-usage (input :color-space-usage)) #:http.request.field{:name "ColorSpaceUsage", :shape "VideoSelectorColorSpaceUsage", :location-name "colorSpaceUsage"})) (clojure.core/contains? input :selector-settings) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-video-selector-settings (input :selector-settings)) #:http.request.field{:name "SelectorSettings", :shape "VideoSelectorSettings", :location-name "selectorSettings"}))))

(clojure.core/defn- ser-input-vpc-request [input] (clojure.core/cond-> #:http.request.field{:value [(clojure.core/into (ser-list-of-string (:subnet-ids input)) #:http.request.field{:name "SubnetIds", :shape "__listOf__string", :location-name "subnetIds"})], :shape "InputVpcRequest", :type "structure"} (clojure.core/contains? input :security-group-ids) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-list-of-string (input :security-group-ids)) #:http.request.field{:name "SecurityGroupIds", :shape "__listOf__string", :location-name "securityGroupIds"}))))

(clojure.core/defn- ser-ac-3-metadata-control [input] #:http.request.field{:value (clojure.core/get {"FOLLOW_INPUT" "FOLLOW_INPUT", :follow-input "FOLLOW_INPUT", "USE_CONFIGURED" "USE_CONFIGURED", :use-configured "USE_CONFIGURED"} input), :shape "Ac3MetadataControl"})

(clojure.core/defn- ser-double-min-0 [input] #:http.request.field{:value input, :shape "__doubleMin0"})

(clojure.core/defn- ser-m-2ts-buffer-model [input] #:http.request.field{:value (clojure.core/get {"MULTIPLEX" "MULTIPLEX", :multiplex "MULTIPLEX", "NONE" "NONE", :none "NONE"} input), :shape "M2tsBufferModel"})

(clojure.core/defn- ser-udp-container-settings [input] (clojure.core/cond-> #:http.request.field{:value [], :shape "UdpContainerSettings", :type "structure"} (clojure.core/contains? input :m-2ts-settings) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-m-2ts-settings (input :m-2ts-settings)) #:http.request.field{:name "M2tsSettings", :shape "M2tsSettings", :location-name "m2tsSettings"}))))

(clojure.core/defn- ser-integer-min-25-max-10000 [input] #:http.request.field{:value input, :shape "__integerMin25Max10000"})

(clojure.core/defn- ser-eac-3-coding-mode [input] #:http.request.field{:value (clojure.core/get {"CODING_MODE_1_0" "CODING_MODE_1_0", :coding-mode-1-0 "CODING_MODE_1_0", "CODING_MODE_2_0" "CODING_MODE_2_0", :coding-mode-2-0 "CODING_MODE_2_0", "CODING_MODE_3_2" "CODING_MODE_3_2", :coding-mode-3-2 "CODING_MODE_3_2"} input), :shape "Eac3CodingMode"})

(clojure.core/defn- ser-m-2ts-ebif-control [input] #:http.request.field{:value (clojure.core/get {"NONE" "NONE", :none "NONE", "PASSTHROUGH" "PASSTHROUGH", :passthrough "PASSTHROUGH"} input), :shape "M2tsEbifControl"})

(clojure.core/defn- ser-caption-description [input] (clojure.core/cond-> #:http.request.field{:value [(clojure.core/into (ser-string (:caption-selector-name input)) #:http.request.field{:name "CaptionSelectorName", :shape "__string", :location-name "captionSelectorName"}) (clojure.core/into (ser-string (:name input)) #:http.request.field{:name "Name", :shape "__string", :location-name "name"})], :shape "CaptionDescription", :type "structure"} (clojure.core/contains? input :destination-settings) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-caption-destination-settings (input :destination-settings)) #:http.request.field{:name "DestinationSettings", :shape "CaptionDestinationSettings", :location-name "destinationSettings"})) (clojure.core/contains? input :language-code) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-string (input :language-code)) #:http.request.field{:name "LanguageCode", :shape "__string", :location-name "languageCode"})) (clojure.core/contains? input :language-description) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-string (input :language-description)) #:http.request.field{:name "LanguageDescription", :shape "__string", :location-name "languageDescription"}))))

(clojure.core/defn- ser-hls-media-store-settings [input] (clojure.core/cond-> #:http.request.field{:value [], :shape "HlsMediaStoreSettings", :type "structure"} (clojure.core/contains? input :connection-retry-interval) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-integer-min-0 (input :connection-retry-interval)) #:http.request.field{:name "ConnectionRetryInterval", :shape "__integerMin0", :location-name "connectionRetryInterval"})) (clojure.core/contains? input :filecache-duration) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-integer-min-0-max-600 (input :filecache-duration)) #:http.request.field{:name "FilecacheDuration", :shape "__integerMin0Max600", :location-name "filecacheDuration"})) (clojure.core/contains? input :media-store-storage-class) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-hls-media-store-storage-class (input :media-store-storage-class)) #:http.request.field{:name "MediaStoreStorageClass", :shape "HlsMediaStoreStorageClass", :location-name "mediaStoreStorageClass"})) (clojure.core/contains? input :num-retries) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-integer-min-0 (input :num-retries)) #:http.request.field{:name "NumRetries", :shape "__integerMin0", :location-name "numRetries"})) (clojure.core/contains? input :restart-delay) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-integer-min-0-max-15 (input :restart-delay)) #:http.request.field{:name "RestartDelay", :shape "__integerMin0Max15", :location-name "restartDelay"}))))

(clojure.core/defn- ser-smooth-group-stream-manifest-behavior [input] #:http.request.field{:value (clojure.core/get {"DO_NOT_SEND" "DO_NOT_SEND", :do-not-send "DO_NOT_SEND", "SEND" "SEND", :send "SEND"} input), :shape "SmoothGroupStreamManifestBehavior"})

(clojure.core/defn- ser-timecode-config-source [input] #:http.request.field{:value (clojure.core/get {"EMBEDDED" "EMBEDDED", :embedded "EMBEDDED", "SYSTEMCLOCK" "SYSTEMCLOCK", :systemclock "SYSTEMCLOCK", "ZEROBASED" "ZEROBASED", :zerobased "ZEROBASED"} input), :shape "TimecodeConfigSource"})

(clojure.core/defn- ser-m-2ts-audio-interval [input] #:http.request.field{:value (clojure.core/get {"VIDEO_AND_FIXED_INTERVALS" "VIDEO_AND_FIXED_INTERVALS", :video-and-fixed-intervals "VIDEO_AND_FIXED_INTERVALS", "VIDEO_INTERVAL" "VIDEO_INTERVAL", :video-interval "VIDEO_INTERVAL"} input), :shape "M2tsAudioInterval"})

(clojure.core/defn- ser-schedule-action-settings [input] (clojure.core/cond-> #:http.request.field{:value [], :shape "ScheduleActionSettings", :type "structure"} (clojure.core/contains? input :hls-timed-metadata-settings) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-hls-timed-metadata-schedule-action-settings (input :hls-timed-metadata-settings)) #:http.request.field{:name "HlsTimedMetadataSettings", :shape "HlsTimedMetadataScheduleActionSettings", :location-name "hlsTimedMetadataSettings"})) (clojure.core/contains? input :input-switch-settings) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-input-switch-schedule-action-settings (input :input-switch-settings)) #:http.request.field{:name "InputSwitchSettings", :shape "InputSwitchScheduleActionSettings", :location-name "inputSwitchSettings"})) (clojure.core/contains? input :pause-state-settings) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-pause-state-schedule-action-settings (input :pause-state-settings)) #:http.request.field{:name "PauseStateSettings", :shape "PauseStateScheduleActionSettings", :location-name "pauseStateSettings"})) (clojure.core/contains? input :scte-35-return-to-network-settings) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-scte-35-return-to-network-schedule-action-settings (input :scte-35-return-to-network-settings)) #:http.request.field{:name "Scte35ReturnToNetworkSettings", :shape "Scte35ReturnToNetworkScheduleActionSettings", :location-name "scte35ReturnToNetworkSettings"})) (clojure.core/contains? input :scte-35-splice-insert-settings) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-scte-35-splice-insert-schedule-action-settings (input :scte-35-splice-insert-settings)) #:http.request.field{:name "Scte35SpliceInsertSettings", :shape "Scte35SpliceInsertScheduleActionSettings", :location-name "scte35SpliceInsertSettings"})) (clojure.core/contains? input :scte-35-time-signal-settings) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-scte-35-time-signal-schedule-action-settings (input :scte-35-time-signal-settings)) #:http.request.field{:name "Scte35TimeSignalSettings", :shape "Scte35TimeSignalScheduleActionSettings", :location-name "scte35TimeSignalSettings"})) (clojure.core/contains? input :static-image-activate-settings) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-static-image-activate-schedule-action-settings (input :static-image-activate-settings)) #:http.request.field{:name "StaticImageActivateSettings", :shape "StaticImageActivateScheduleActionSettings", :location-name "staticImageActivateSettings"})) (clojure.core/contains? input :static-image-deactivate-settings) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-static-image-deactivate-schedule-action-settings (input :static-image-deactivate-settings)) #:http.request.field{:name "StaticImageDeactivateSettings", :shape "StaticImageDeactivateScheduleActionSettings", :location-name "staticImageDeactivateSettings"}))))

(clojure.core/defn- ser-audio-pid-selection [input] (clojure.core/cond-> #:http.request.field{:value [(clojure.core/into (ser-integer-min-0-max-8191 (:pid input)) #:http.request.field{:name "Pid", :shape "__integerMin0Max8191", :location-name "pid"})], :shape "AudioPidSelection", :type "structure"}))

(clojure.core/defn- ser-hls-output-selection [input] #:http.request.field{:value (clojure.core/get {"MANIFESTS_AND_SEGMENTS" "MANIFESTS_AND_SEGMENTS", :manifests-and-segments "MANIFESTS_AND_SEGMENTS", "SEGMENTS_ONLY" "SEGMENTS_ONLY", :segments-only "SEGMENTS_ONLY"} input), :shape "HlsOutputSelection"})

(clojure.core/defn- ser-input-loss-action-for-udp-out [input] #:http.request.field{:value (clojure.core/get {"DROP_PROGRAM" "DROP_PROGRAM", :drop-program "DROP_PROGRAM", "DROP_TS" "DROP_TS", :drop-ts "DROP_TS", "EMIT_PROGRAM" "EMIT_PROGRAM", :emit-program "EMIT_PROGRAM"} input), :shape "InputLossActionForUdpOut"})

(clojure.core/defn- ser-ac-3-bitstream-mode [input] #:http.request.field{:value (clojure.core/get {:hearing-impaired "HEARING_IMPAIRED", :visually-impaired "VISUALLY_IMPAIRED", :complete-main "COMPLETE_MAIN", "COMPLETE_MAIN" "COMPLETE_MAIN", "DIALOGUE" "DIALOGUE", "VISUALLY_IMPAIRED" "VISUALLY_IMPAIRED", :dialogue "DIALOGUE", "EMERGENCY" "EMERGENCY", :emergency "EMERGENCY", :music-and-effects "MUSIC_AND_EFFECTS", "COMMENTARY" "COMMENTARY", :commentary "COMMENTARY", "MUSIC_AND_EFFECTS" "MUSIC_AND_EFFECTS", "VOICE_OVER" "VOICE_OVER", "HEARING_IMPAIRED" "HEARING_IMPAIRED", :voice-over "VOICE_OVER"} input), :shape "Ac3BitstreamMode"})

(clojure.core/defn- ser-scte-35-time-signal-apos [input] (clojure.core/cond-> #:http.request.field{:value [], :shape "Scte35TimeSignalApos", :type "structure"} (clojure.core/contains? input :ad-avail-offset) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-integer-min-negative-1000-max-1000 (input :ad-avail-offset)) #:http.request.field{:name "AdAvailOffset", :shape "__integerMinNegative1000Max1000", :location-name "adAvailOffset"})) (clojure.core/contains? input :no-regional-blackout-flag) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-scte-35-apos-no-regional-blackout-behavior (input :no-regional-blackout-flag)) #:http.request.field{:name "NoRegionalBlackoutFlag", :shape "Scte35AposNoRegionalBlackoutBehavior", :location-name "noRegionalBlackoutFlag"})) (clojure.core/contains? input :web-delivery-allowed-flag) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-scte-35-apos-web-delivery-allowed-behavior (input :web-delivery-allowed-flag)) #:http.request.field{:name "WebDeliveryAllowedFlag", :shape "Scte35AposWebDeliveryAllowedBehavior", :location-name "webDeliveryAllowedFlag"}))))

(clojure.core/defn- ser-h-264-spatial-aq [input] #:http.request.field{:value (clojure.core/get {"DISABLED" "DISABLED", :disabled "DISABLED", "ENABLED" "ENABLED", :enabled "ENABLED"} input), :shape "H264SpatialAq"})

(clojure.core/defn- ser-aac-raw-format [input] #:http.request.field{:value (clojure.core/get {"LATM_LOAS" "LATM_LOAS", :latm-loas "LATM_LOAS", "NONE" "NONE", :none "NONE"} input), :shape "AacRawFormat"})

(clojure.core/defn- ser-list-of-input-source-request [input] #:http.request.field{:value (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (clojure.core/merge (ser-input-source-request coll) #:http.request.field{:shape "InputSourceRequest"}))) input), :shape "__listOfInputSourceRequest", :type "list"})

(clojure.core/defn- ser-static-image-activate-schedule-action-settings [input] (clojure.core/cond-> #:http.request.field{:value [(clojure.core/into (ser-input-location (:image input)) #:http.request.field{:name "Image", :shape "InputLocation", :location-name "image"})], :shape "StaticImageActivateScheduleActionSettings", :type "structure"} (clojure.core/contains? input :opacity) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-integer-min-0-max-100 (input :opacity)) #:http.request.field{:name "Opacity", :shape "__integerMin0Max100", :location-name "opacity"})) (clojure.core/contains? input :image-x) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-integer-min-0 (input :image-x)) #:http.request.field{:name "ImageX", :shape "__integerMin0", :location-name "imageX"})) (clojure.core/contains? input :width) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-integer-min-1 (input :width)) #:http.request.field{:name "Width", :shape "__integerMin1", :location-name "width"})) (clojure.core/contains? input :layer) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-integer-min-0-max-7 (input :layer)) #:http.request.field{:name "Layer", :shape "__integerMin0Max7", :location-name "layer"})) (clojure.core/contains? input :duration) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-integer-min-0 (input :duration)) #:http.request.field{:name "Duration", :shape "__integerMin0", :location-name "duration"})) (clojure.core/contains? input :fade-in) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-integer-min-0 (input :fade-in)) #:http.request.field{:name "FadeIn", :shape "__integerMin0", :location-name "fadeIn"})) (clojure.core/contains? input :height) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-integer-min-1 (input :height)) #:http.request.field{:name "Height", :shape "__integerMin1", :location-name "height"})) (clojure.core/contains? input :image-y) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-integer-min-0 (input :image-y)) #:http.request.field{:name "ImageY", :shape "__integerMin0", :location-name "imageY"})) (clojure.core/contains? input :fade-out) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-integer-min-0 (input :fade-out)) #:http.request.field{:name "FadeOut", :shape "__integerMin0", :location-name "fadeOut"}))))

(clojure.core/defn- ser-output-destination [input] (clojure.core/cond-> #:http.request.field{:value [], :shape "OutputDestination", :type "structure"} (clojure.core/contains? input :id) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-string (input :id)) #:http.request.field{:name "Id", :shape "__string", :location-name "id"})) (clojure.core/contains? input :settings) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-list-of-output-destination-settings (input :settings)) #:http.request.field{:name "Settings", :shape "__listOfOutputDestinationSettings", :location-name "settings"}))))

(clojure.core/defn- ser-integer-min-30 [input] #:http.request.field{:value input, :shape "__integerMin30"})

(clojure.core/defn- ser-input-maximum-bitrate [input] #:http.request.field{:value (clojure.core/get {"MAX_10_MBPS" "MAX_10_MBPS", :max-10-mbps "MAX_10_MBPS", "MAX_20_MBPS" "MAX_20_MBPS", :max-20-mbps "MAX_20_MBPS", "MAX_50_MBPS" "MAX_50_MBPS", :max-50-mbps "MAX_50_MBPS"} input), :shape "InputMaximumBitrate"})

(clojure.core/defn- ser-integer-min-0-max-3600 [input] #:http.request.field{:value input, :shape "__integerMin0Max3600"})

(clojure.core/defn- ser-video-selector-color-space [input] #:http.request.field{:value (clojure.core/get {"FOLLOW" "FOLLOW", :follow "FOLLOW", "REC_601" "REC_601", :rec-601 "REC_601", "REC_709" "REC_709", :rec-709 "REC_709"} input), :shape "VideoSelectorColorSpace"})

(clojure.core/defn- ser-audio-only-hls-settings [input] (clojure.core/cond-> #:http.request.field{:value [], :shape "AudioOnlyHlsSettings", :type "structure"} (clojure.core/contains? input :audio-group-id) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-string (input :audio-group-id)) #:http.request.field{:name "AudioGroupId", :shape "__string", :location-name "audioGroupId"})) (clojure.core/contains? input :audio-only-image) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-input-location (input :audio-only-image)) #:http.request.field{:name "AudioOnlyImage", :shape "InputLocation", :location-name "audioOnlyImage"})) (clojure.core/contains? input :audio-track-type) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-audio-only-hls-track-type (input :audio-track-type)) #:http.request.field{:name "AudioTrackType", :shape "AudioOnlyHlsTrackType", :location-name "audioTrackType"}))))

(clojure.core/defn- ser-m-2ts-segmentation-markers [input] #:http.request.field{:value (clojure.core/get {"PSI_SEGSTART" "PSI_SEGSTART", "RAI_SEGSTART" "RAI_SEGSTART", "RAI_ADAPT" "RAI_ADAPT", :rai-adapt "RAI_ADAPT", :rai-segstart "RAI_SEGSTART", :ebp-legacy "EBP_LEGACY", "NONE" "NONE", :psi-segstart "PSI_SEGSTART", "EBP_LEGACY" "EBP_LEGACY", "EBP" "EBP", :ebp "EBP", :none "NONE"} input), :shape "M2tsSegmentationMarkers"})

(clojure.core/defn- ser-eac-3-drc-line [input] #:http.request.field{:value (clojure.core/get {"MUSIC_LIGHT" "MUSIC_LIGHT", :music-standard "MUSIC_STANDARD", :film-standard "FILM_STANDARD", "FILM_STANDARD" "FILM_STANDARD", "NONE" "NONE", "FILM_LIGHT" "FILM_LIGHT", :film-light "FILM_LIGHT", "SPEECH" "SPEECH", :music-light "MUSIC_LIGHT", "MUSIC_STANDARD" "MUSIC_STANDARD", :speech "SPEECH", :none "NONE"} input), :shape "Eac3DrcLine"})

(clojure.core/defn- ser-dvb-sub-destination-alignment [input] #:http.request.field{:value (clojure.core/get {"CENTERED" "CENTERED", :centered "CENTERED", "LEFT" "LEFT", :left "LEFT", "SMART" "SMART", :smart "SMART"} input), :shape "DvbSubDestinationAlignment"})

(clojure.core/defn- ser-m-2ts-scte-35-control [input] #:http.request.field{:value (clojure.core/get {"NONE" "NONE", :none "NONE", "PASSTHROUGH" "PASSTHROUGH", :passthrough "PASSTHROUGH"} input), :shape "M2tsScte35Control"})

(clojure.core/defn- ser-input-location [input] (clojure.core/cond-> #:http.request.field{:value [(clojure.core/into (ser-string (:uri input)) #:http.request.field{:name "Uri", :shape "__string", :location-name "uri"})], :shape "InputLocation", :type "structure"} (clojure.core/contains? input :password-param) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-string (input :password-param)) #:http.request.field{:name "PasswordParam", :shape "__string", :location-name "passwordParam"})) (clojure.core/contains? input :username) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-string (input :username)) #:http.request.field{:name "Username", :shape "__string", :location-name "username"}))))

(clojure.core/defn- ser-m-2ts-absent-input-audio-behavior [input] #:http.request.field{:value (clojure.core/get {"DROP" "DROP", :drop "DROP", "ENCODE_SILENCE" "ENCODE_SILENCE", :encode-silence "ENCODE_SILENCE"} input), :shape "M2tsAbsentInputAudioBehavior"})

(clojure.core/defn- ser-integer-min-3 [input] #:http.request.field{:value input, :shape "__integerMin3"})

(clojure.core/defn- ser-h-264-level [input] #:http.request.field{:value (clojure.core/get {"H264_LEVEL_4_2" "H264_LEVEL_4_2", "H264_LEVEL_2_2" "H264_LEVEL_2_2", "H264_LEVEL_2" "H264_LEVEL_2", "H264_LEVEL_1_1" "H264_LEVEL_1_1", :h-264-level-3-1 "H264_LEVEL_3_1", "H264_LEVEL_5" "H264_LEVEL_5", "H264_LEVEL_1_3" "H264_LEVEL_1_3", :h-264-level-5-1 "H264_LEVEL_5_1", :h-264-level-1 "H264_LEVEL_1", :h-264-level-2 "H264_LEVEL_2", "H264_LEVEL_3" "H264_LEVEL_3", "H264_LEVEL_2_1" "H264_LEVEL_2_1", "H264_LEVEL_1_2" "H264_LEVEL_1_2", :h-264-level-auto "H264_LEVEL_AUTO", "H264_LEVEL_1" "H264_LEVEL_1", :h-264-level-1-2 "H264_LEVEL_1_2", "H264_LEVEL_3_2" "H264_LEVEL_3_2", :h-264-level-5 "H264_LEVEL_5", :h-264-level-1-1 "H264_LEVEL_1_1", :h-264-level-2-2 "H264_LEVEL_2_2", "H264_LEVEL_4" "H264_LEVEL_4", :h-264-level-4-2 "H264_LEVEL_4_2", :h-264-level-3 "H264_LEVEL_3", "H264_LEVEL_5_1" "H264_LEVEL_5_1", :h-264-level-2-1 "H264_LEVEL_2_1", :h-264-level-3-2 "H264_LEVEL_3_2", :h-264-level-4-1 "H264_LEVEL_4_1", "H264_LEVEL_3_1" "H264_LEVEL_3_1", :h-264-level-4 "H264_LEVEL_4", "H264_LEVEL_AUTO" "H264_LEVEL_AUTO", "H264_LEVEL_5_2" "H264_LEVEL_5_2", :h-264-level-1-3 "H264_LEVEL_1_3", "H264_LEVEL_4_1" "H264_LEVEL_4_1", :h-264-level-5-2 "H264_LEVEL_5_2"} input), :shape "H264Level"})

(clojure.core/defn- ser-avail-settings [input] (clojure.core/cond-> #:http.request.field{:value [], :shape "AvailSettings", :type "structure"} (clojure.core/contains? input :scte-35-splice-insert) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-scte-35-splice-insert (input :scte-35-splice-insert)) #:http.request.field{:name "Scte35SpliceInsert", :shape "Scte35SpliceInsert", :location-name "scte35SpliceInsert"})) (clojure.core/contains? input :scte-35-time-signal-apos) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-scte-35-time-signal-apos (input :scte-35-time-signal-apos)) #:http.request.field{:name "Scte35TimeSignalApos", :shape "Scte35TimeSignalApos", :location-name "scte35TimeSignalApos"}))))

(clojure.core/defn- ser-h-264-par-control [input] #:http.request.field{:value (clojure.core/get {"INITIALIZE_FROM_SOURCE" "INITIALIZE_FROM_SOURCE", :initialize-from-source "INITIALIZE_FROM_SOURCE", "SPECIFIED" "SPECIFIED", :specified "SPECIFIED"} input), :shape "H264ParControl"})

(clojure.core/defn- ser-smooth-group-audio-only-timecode-control [input] #:http.request.field{:value (clojure.core/get {"PASSTHROUGH" "PASSTHROUGH", :passthrough "PASSTHROUGH", "USE_CONFIGURED_CLOCK" "USE_CONFIGURED_CLOCK", :use-configured-clock "USE_CONFIGURED_CLOCK"} input), :shape "SmoothGroupAudioOnlyTimecodeControl"})

(clojure.core/defn- ser-pipeline-id [input] #:http.request.field{:value (clojure.core/get {"PIPELINE_0" "PIPELINE_0", :pipeline-0 "PIPELINE_0", "PIPELINE_1" "PIPELINE_1", :pipeline-1 "PIPELINE_1"} input), :shape "PipelineId"})

(clojure.core/defn- ser-video-description [input] (clojure.core/cond-> #:http.request.field{:value [(clojure.core/into (ser-string (:name input)) #:http.request.field{:name "Name", :shape "__string", :location-name "name"})], :shape "VideoDescription", :type "structure"} (clojure.core/contains? input :codec-settings) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-video-codec-settings (input :codec-settings)) #:http.request.field{:name "CodecSettings", :shape "VideoCodecSettings", :location-name "codecSettings"})) (clojure.core/contains? input :height) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-integer (input :height)) #:http.request.field{:name "Height", :shape "__integer", :location-name "height"})) (clojure.core/contains? input :respond-to-afd) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-video-description-respond-to-afd (input :respond-to-afd)) #:http.request.field{:name "RespondToAfd", :shape "VideoDescriptionRespondToAfd", :location-name "respondToAfd"})) (clojure.core/contains? input :scaling-behavior) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-video-description-scaling-behavior (input :scaling-behavior)) #:http.request.field{:name "ScalingBehavior", :shape "VideoDescriptionScalingBehavior", :location-name "scalingBehavior"})) (clojure.core/contains? input :sharpness) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-integer-min-0-max-100 (input :sharpness)) #:http.request.field{:name "Sharpness", :shape "__integerMin0Max100", :location-name "sharpness"})) (clojure.core/contains? input :width) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-integer (input :width)) #:http.request.field{:name "Width", :shape "__integer", :location-name "width"}))))

(clojure.core/defn- ser-integer-min-0-max-15 [input] #:http.request.field{:value input, :shape "__integerMin0Max15"})

(clojure.core/defn- ser-global-configuration-output-timing-source [input] #:http.request.field{:value (clojure.core/get {"INPUT_CLOCK" "INPUT_CLOCK", :input-clock "INPUT_CLOCK", "SYSTEM_CLOCK" "SYSTEM_CLOCK", :system-clock "SYSTEM_CLOCK"} input), :shape "GlobalConfigurationOutputTimingSource"})

(clojure.core/defn- ser-scte-35-no-regional-blackout-flag [input] #:http.request.field{:value (clojure.core/get {"REGIONAL_BLACKOUT" "REGIONAL_BLACKOUT", :regional-blackout "REGIONAL_BLACKOUT", "NO_REGIONAL_BLACKOUT" "NO_REGIONAL_BLACKOUT", :no-regional-blackout "NO_REGIONAL_BLACKOUT"} input), :shape "Scte35NoRegionalBlackoutFlag"})

(clojure.core/defn- ser-integer-min-1-max-10 [input] #:http.request.field{:value input, :shape "__integerMin1Max10"})

(clojure.core/defn- ser-audio-language-selection [input] (clojure.core/cond-> #:http.request.field{:value [(clojure.core/into (ser-string (:language-code input)) #:http.request.field{:name "LanguageCode", :shape "__string", :location-name "languageCode"})], :shape "AudioLanguageSelection", :type "structure"} (clojure.core/contains? input :language-selection-policy) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-audio-language-selection-policy (input :language-selection-policy)) #:http.request.field{:name "LanguageSelectionPolicy", :shape "AudioLanguageSelectionPolicy", :location-name "languageSelectionPolicy"}))))

(clojure.core/defn- ser-output-group-settings [input] (clojure.core/cond-> #:http.request.field{:value [], :shape "OutputGroupSettings", :type "structure"} (clojure.core/contains? input :archive-group-settings) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-archive-group-settings (input :archive-group-settings)) #:http.request.field{:name "ArchiveGroupSettings", :shape "ArchiveGroupSettings", :location-name "archiveGroupSettings"})) (clojure.core/contains? input :frame-capture-group-settings) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-frame-capture-group-settings (input :frame-capture-group-settings)) #:http.request.field{:name "FrameCaptureGroupSettings", :shape "FrameCaptureGroupSettings", :location-name "frameCaptureGroupSettings"})) (clojure.core/contains? input :hls-group-settings) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-hls-group-settings (input :hls-group-settings)) #:http.request.field{:name "HlsGroupSettings", :shape "HlsGroupSettings", :location-name "hlsGroupSettings"})) (clojure.core/contains? input :ms-smooth-group-settings) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-ms-smooth-group-settings (input :ms-smooth-group-settings)) #:http.request.field{:name "MsSmoothGroupSettings", :shape "MsSmoothGroupSettings", :location-name "msSmoothGroupSettings"})) (clojure.core/contains? input :rtmp-group-settings) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-rtmp-group-settings (input :rtmp-group-settings)) #:http.request.field{:name "RtmpGroupSettings", :shape "RtmpGroupSettings", :location-name "rtmpGroupSettings"})) (clojure.core/contains? input :udp-group-settings) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-udp-group-settings (input :udp-group-settings)) #:http.request.field{:name "UdpGroupSettings", :shape "UdpGroupSettings", :location-name "udpGroupSettings"}))))

(clojure.core/defn- ser-integer-min-96-max-600 [input] #:http.request.field{:value input, :shape "__integerMin96Max600"})

(clojure.core/defn- ser-rtmp-cache-full-behavior [input] #:http.request.field{:value (clojure.core/get {"DISCONNECT_IMMEDIATELY" "DISCONNECT_IMMEDIATELY", :disconnect-immediately "DISCONNECT_IMMEDIATELY", "WAIT_FOR_SERVER" "WAIT_FOR_SERVER", :wait-for-server "WAIT_FOR_SERVER"} input), :shape "RtmpCacheFullBehavior"})

(clojure.core/defn- ser-avail-configuration [input] (clojure.core/cond-> #:http.request.field{:value [], :shape "AvailConfiguration", :type "structure"} (clojure.core/contains? input :avail-settings) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-avail-settings (input :avail-settings)) #:http.request.field{:name "AvailSettings", :shape "AvailSettings", :location-name "availSettings"}))))

(clojure.core/defn- ser-archive-container-settings [input] (clojure.core/cond-> #:http.request.field{:value [], :shape "ArchiveContainerSettings", :type "structure"} (clojure.core/contains? input :m-2ts-settings) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-m-2ts-settings (input :m-2ts-settings)) #:http.request.field{:name "M2tsSettings", :shape "M2tsSettings", :location-name "m2tsSettings"}))))

(clojure.core/defn- ser-list-of-hls-ad-markers [input] #:http.request.field{:value (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (clojure.core/merge (ser-hls-ad-markers coll) #:http.request.field{:shape "HlsAdMarkers"}))) input), :shape "__listOfHlsAdMarkers", :type "list"})

(clojure.core/defn- ser-blackout-slate-state [input] #:http.request.field{:value (clojure.core/get {"DISABLED" "DISABLED", :disabled "DISABLED", "ENABLED" "ENABLED", :enabled "ENABLED"} input), :shape "BlackoutSlateState"})

(clojure.core/defn- ser-mp-2-settings [input] (clojure.core/cond-> #:http.request.field{:value [], :shape "Mp2Settings", :type "structure"} (clojure.core/contains? input :bitrate) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-double (input :bitrate)) #:http.request.field{:name "Bitrate", :shape "__double", :location-name "bitrate"})) (clojure.core/contains? input :coding-mode) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-mp-2-coding-mode (input :coding-mode)) #:http.request.field{:name "CodingMode", :shape "Mp2CodingMode", :location-name "codingMode"})) (clojure.core/contains? input :sample-rate) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-double (input :sample-rate)) #:http.request.field{:name "SampleRate", :shape "__double", :location-name "sampleRate"}))))

(clojure.core/defn- ser-arib-destination-settings [input] (clojure.core/cond-> #:http.request.field{:value [], :shape "AribDestinationSettings", :type "structure"}))

(clojure.core/defn- ser-smooth-group-sparse-track-type [input] #:http.request.field{:value (clojure.core/get {"NONE" "NONE", :none "NONE", "SCTE_35" "SCTE_35", :scte-35 "SCTE_35"} input), :shape "SmoothGroupSparseTrackType"})

(clojure.core/defn- ser-m-2ts-es-rate-in-pes [input] #:http.request.field{:value (clojure.core/get {"EXCLUDE" "EXCLUDE", :exclude "EXCLUDE", "INCLUDE" "INCLUDE", :include "INCLUDE"} input), :shape "M2tsEsRateInPes"})

(clojure.core/defn- ser-caption-destination-settings [input] (clojure.core/cond-> #:http.request.field{:value [], :shape "CaptionDestinationSettings", :type "structure"} (clojure.core/contains? input :ttml-destination-settings) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-ttml-destination-settings (input :ttml-destination-settings)) #:http.request.field{:name "TtmlDestinationSettings", :shape "TtmlDestinationSettings", :location-name "ttmlDestinationSettings"})) (clojure.core/contains? input :burn-in-destination-settings) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-burn-in-destination-settings (input :burn-in-destination-settings)) #:http.request.field{:name "BurnInDestinationSettings", :shape "BurnInDestinationSettings", :location-name "burnInDestinationSettings"})) (clojure.core/contains? input :scte-27-destination-settings) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-scte-27-destination-settings (input :scte-27-destination-settings)) #:http.request.field{:name "Scte27DestinationSettings", :shape "Scte27DestinationSettings", :location-name "scte27DestinationSettings"})) (clojure.core/contains? input :arib-destination-settings) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-arib-destination-settings (input :arib-destination-settings)) #:http.request.field{:name "AribDestinationSettings", :shape "AribDestinationSettings", :location-name "aribDestinationSettings"})) (clojure.core/contains? input :rtmp-caption-info-destination-settings) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-rtmp-caption-info-destination-settings (input :rtmp-caption-info-destination-settings)) #:http.request.field{:name "RtmpCaptionInfoDestinationSettings", :shape "RtmpCaptionInfoDestinationSettings", :location-name "rtmpCaptionInfoDestinationSettings"})) (clojure.core/contains? input :webvtt-destination-settings) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-webvtt-destination-settings (input :webvtt-destination-settings)) #:http.request.field{:name "WebvttDestinationSettings", :shape "WebvttDestinationSettings", :location-name "webvttDestinationSettings"})) (clojure.core/contains? input :teletext-destination-settings) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-teletext-destination-settings (input :teletext-destination-settings)) #:http.request.field{:name "TeletextDestinationSettings", :shape "TeletextDestinationSettings", :location-name "teletextDestinationSettings"})) (clojure.core/contains? input :smpte-tt-destination-settings) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-smpte-tt-destination-settings (input :smpte-tt-destination-settings)) #:http.request.field{:name "SmpteTtDestinationSettings", :shape "SmpteTtDestinationSettings", :location-name "smpteTtDestinationSettings"})) (clojure.core/contains? input :dvb-sub-destination-settings) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-dvb-sub-destination-settings (input :dvb-sub-destination-settings)) #:http.request.field{:name "DvbSubDestinationSettings", :shape "DvbSubDestinationSettings", :location-name "dvbSubDestinationSettings"})) (clojure.core/contains? input :embedded-destination-settings) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-embedded-destination-settings (input :embedded-destination-settings)) #:http.request.field{:name "EmbeddedDestinationSettings", :shape "EmbeddedDestinationSettings", :location-name "embeddedDestinationSettings"})) (clojure.core/contains? input :embedded-plus-scte-20-destination-settings) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-embedded-plus-scte-20-destination-settings (input :embedded-plus-scte-20-destination-settings)) #:http.request.field{:name "EmbeddedPlusScte20DestinationSettings", :shape "EmbeddedPlusScte20DestinationSettings", :location-name "embeddedPlusScte20DestinationSettings"})) (clojure.core/contains? input :scte-20-plus-embedded-destination-settings) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-scte-20-plus-embedded-destination-settings (input :scte-20-plus-embedded-destination-settings)) #:http.request.field{:name "Scte20PlusEmbeddedDestinationSettings", :shape "Scte20PlusEmbeddedDestinationSettings", :location-name "scte20PlusEmbeddedDestinationSettings"}))))

(clojure.core/defn- ser-integer-min-1000-max-30000 [input] #:http.request.field{:value input, :shape "__integerMin1000Max30000"})

(clojure.core/defn- ser-hls-input-settings [input] (clojure.core/cond-> #:http.request.field{:value [], :shape "HlsInputSettings", :type "structure"} (clojure.core/contains? input :bandwidth) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-integer-min-0 (input :bandwidth)) #:http.request.field{:name "Bandwidth", :shape "__integerMin0", :location-name "bandwidth"})) (clojure.core/contains? input :buffer-segments) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-integer-min-0 (input :buffer-segments)) #:http.request.field{:name "BufferSegments", :shape "__integerMin0", :location-name "bufferSegments"})) (clojure.core/contains? input :retries) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-integer-min-0 (input :retries)) #:http.request.field{:name "Retries", :shape "__integerMin0", :location-name "retries"})) (clojure.core/contains? input :retry-interval) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-integer-min-0 (input :retry-interval)) #:http.request.field{:name "RetryInterval", :shape "__integerMin0", :location-name "retryInterval"}))))

(clojure.core/defn- ser-hls-ad-markers [input] #:http.request.field{:value (clojure.core/get {"ADOBE" "ADOBE", :adobe "ADOBE", "ELEMENTAL" "ELEMENTAL", :elemental "ELEMENTAL", "ELEMENTAL_SCTE35" "ELEMENTAL_SCTE35", :elemental-scte-35 "ELEMENTAL_SCTE35"} input), :shape "HlsAdMarkers"})

(clojure.core/defn- ser-list-of-string [input] #:http.request.field{:value (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (clojure.core/merge (ser-string coll) #:http.request.field{:shape "__string"}))) input), :shape "__listOf__string", :type "list"})

(clojure.core/defn- ser-m-2ts-segmentation-style [input] #:http.request.field{:value (clojure.core/get {"MAINTAIN_CADENCE" "MAINTAIN_CADENCE", :maintain-cadence "MAINTAIN_CADENCE", "RESET_CADENCE" "RESET_CADENCE", :reset-cadence "RESET_CADENCE"} input), :shape "M2tsSegmentationStyle"})

(clojure.core/defn- ser-integer-min-0-max-30 [input] #:http.request.field{:value input, :shape "__integerMin0Max30"})

(clojure.core/defn- ser-hls-iv-source [input] #:http.request.field{:value (clojure.core/get {"EXPLICIT" "EXPLICIT", :explicit "EXPLICIT", "FOLLOWS_SEGMENT_NUMBER" "FOLLOWS_SEGMENT_NUMBER", :follows-segment-number "FOLLOWS_SEGMENT_NUMBER"} input), :shape "HlsIvSource"})

(clojure.core/defn- ser-authentication-scheme [input] #:http.request.field{:value (clojure.core/get {"AKAMAI" "AKAMAI", :akamai "AKAMAI", "COMMON" "COMMON", :common "COMMON"} input), :shape "AuthenticationScheme"})

(clojure.core/defn- ser-standard-hls-settings [input] (clojure.core/cond-> #:http.request.field{:value [(clojure.core/into (ser-m-3u-8-settings (:m-3u-8-settings input)) #:http.request.field{:name "M3u8Settings", :shape "M3u8Settings", :location-name "m3u8Settings"})], :shape "StandardHlsSettings", :type "structure"} (clojure.core/contains? input :audio-rendition-sets) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-string (input :audio-rendition-sets)) #:http.request.field{:name "AudioRenditionSets", :shape "__string", :location-name "audioRenditionSets"}))))

(clojure.core/defn- ser-list-of-input-attachment [input] #:http.request.field{:value (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (clojure.core/merge (ser-input-attachment coll) #:http.request.field{:shape "InputAttachment"}))) input), :shape "__listOfInputAttachment", :type "list"})

(clojure.core/defn- ser-hls-cdn-settings [input] (clojure.core/cond-> #:http.request.field{:value [], :shape "HlsCdnSettings", :type "structure"} (clojure.core/contains? input :hls-akamai-settings) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-hls-akamai-settings (input :hls-akamai-settings)) #:http.request.field{:name "HlsAkamaiSettings", :shape "HlsAkamaiSettings", :location-name "hlsAkamaiSettings"})) (clojure.core/contains? input :hls-basic-put-settings) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-hls-basic-put-settings (input :hls-basic-put-settings)) #:http.request.field{:name "HlsBasicPutSettings", :shape "HlsBasicPutSettings", :location-name "hlsBasicPutSettings"})) (clojure.core/contains? input :hls-media-store-settings) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-hls-media-store-settings (input :hls-media-store-settings)) #:http.request.field{:name "HlsMediaStoreSettings", :shape "HlsMediaStoreSettings", :location-name "hlsMediaStoreSettings"})) (clojure.core/contains? input :hls-webdav-settings) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-hls-webdav-settings (input :hls-webdav-settings)) #:http.request.field{:name "HlsWebdavSettings", :shape "HlsWebdavSettings", :location-name "hlsWebdavSettings"}))))

(clojure.core/defn- ser-scte-35-descriptor [input] (clojure.core/cond-> #:http.request.field{:value [(clojure.core/into (ser-scte-35-descriptor-settings (:scte-35-descriptor-settings input)) #:http.request.field{:name "Scte35DescriptorSettings", :shape "Scte35DescriptorSettings", :location-name "scte35DescriptorSettings"})], :shape "Scte35Descriptor", :type "structure"}))

(clojure.core/defn- ser-smooth-group-event-stop-behavior [input] #:http.request.field{:value (clojure.core/get {"NONE" "NONE", :none "NONE", "SEND_EOS" "SEND_EOS", :send-eos "SEND_EOS"} input), :shape "SmoothGroupEventStopBehavior"})

(clojure.core/defn- ser-scte-35-splice-insert [input] (clojure.core/cond-> #:http.request.field{:value [], :shape "Scte35SpliceInsert", :type "structure"} (clojure.core/contains? input :ad-avail-offset) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-integer-min-negative-1000-max-1000 (input :ad-avail-offset)) #:http.request.field{:name "AdAvailOffset", :shape "__integerMinNegative1000Max1000", :location-name "adAvailOffset"})) (clojure.core/contains? input :no-regional-blackout-flag) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-scte-35-splice-insert-no-regional-blackout-behavior (input :no-regional-blackout-flag)) #:http.request.field{:name "NoRegionalBlackoutFlag", :shape "Scte35SpliceInsertNoRegionalBlackoutBehavior", :location-name "noRegionalBlackoutFlag"})) (clojure.core/contains? input :web-delivery-allowed-flag) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-scte-35-splice-insert-web-delivery-allowed-behavior (input :web-delivery-allowed-flag)) #:http.request.field{:name "WebDeliveryAllowedFlag", :shape "Scte35SpliceInsertWebDeliveryAllowedBehavior", :location-name "webDeliveryAllowedFlag"}))))

(clojure.core/defn- ser-m-2ts-rate-mode [input] #:http.request.field{:value (clojure.core/get {"CBR" "CBR", :cbr "CBR", "VBR" "VBR", :vbr "VBR"} input), :shape "M2tsRateMode"})

(clojure.core/defn- ser-eac-3-bitstream-mode [input] #:http.request.field{:value (clojure.core/get {:hearing-impaired "HEARING_IMPAIRED", :visually-impaired "VISUALLY_IMPAIRED", :complete-main "COMPLETE_MAIN", "COMPLETE_MAIN" "COMPLETE_MAIN", "VISUALLY_IMPAIRED" "VISUALLY_IMPAIRED", "EMERGENCY" "EMERGENCY", :emergency "EMERGENCY", "COMMENTARY" "COMMENTARY", :commentary "COMMENTARY", "HEARING_IMPAIRED" "HEARING_IMPAIRED"} input), :shape "Eac3BitstreamMode"})

(clojure.core/defn- ser-input-channel-level [input] (clojure.core/cond-> #:http.request.field{:value [(clojure.core/into (ser-integer-min-0-max-15 (:input-channel input)) #:http.request.field{:name "InputChannel", :shape "__integerMin0Max15", :location-name "inputChannel"}) (clojure.core/into (ser-integer-min-negative-60-max-6 (:gain input)) #:http.request.field{:name "Gain", :shape "__integerMinNegative60Max6", :location-name "gain"})], :shape "InputChannelLevel", :type "structure"}))

(clojure.core/defn- ser-h-264-profile [input] #:http.request.field{:value (clojure.core/get {:baseline "BASELINE", "HIGH_422" "HIGH_422", :high-422 "HIGH_422", "BASELINE" "BASELINE", :high "HIGH", "MAIN" "MAIN", "HIGH_10BIT" "HIGH_10BIT", "HIGH" "HIGH", "HIGH_422_10BIT" "HIGH_422_10BIT", :high-10-bit "HIGH_10BIT", :high-422-10-bit "HIGH_422_10BIT", :main "MAIN"} input), :shape "H264Profile"})

(clojure.core/defn- ser-m-2ts-arib-captions-pid-control [input] #:http.request.field{:value (clojure.core/get {"AUTO" "AUTO", :auto "AUTO", "USE_CONFIGURED" "USE_CONFIGURED", :use-configured "USE_CONFIGURED"} input), :shape "M2tsAribCaptionsPidControl"})

(clojure.core/defn- ser-integer-min-0-max-100 [input] #:http.request.field{:value input, :shape "__integerMin0Max100"})

(clojure.core/defn- ser-integer-min-1-max-6 [input] #:http.request.field{:value input, :shape "__integerMin1Max6"})

(clojure.core/defn- ser-m-2ts-cc-descriptor [input] #:http.request.field{:value (clojure.core/get {"DISABLED" "DISABLED", :disabled "DISABLED", "ENABLED" "ENABLED", :enabled "ENABLED"} input), :shape "M2tsCcDescriptor"})

(clojure.core/defn- ser-list-of-pipeline-pause-state-settings [input] #:http.request.field{:value (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (clojure.core/merge (ser-pipeline-pause-state-settings coll) #:http.request.field{:shape "PipelinePauseStateSettings"}))) input), :shape "__listOfPipelinePauseStateSettings", :type "list"})

(clojure.core/defn- ser-string-min-1-max-256 [input] #:http.request.field{:value input, :shape "__stringMin1Max256"})

(clojure.core/defn- ser-dvb-sub-destination-outline-color [input] #:http.request.field{:value (clojure.core/get {:white "WHITE", :yellow "YELLOW", :green "GREEN", "GREEN" "GREEN", "BLUE" "BLUE", :red "RED", :blue "BLUE", "WHITE" "WHITE", "YELLOW" "YELLOW", "BLACK" "BLACK", "RED" "RED", :black "BLACK"} input), :shape "DvbSubDestinationOutlineColor"})

(clojure.core/defn- ser-double-min-negative-59-max-0 [input] #:http.request.field{:value input, :shape "__doubleMinNegative59Max0"})

(clojure.core/defn- ser-static-image-deactivate-schedule-action-settings [input] (clojure.core/cond-> #:http.request.field{:value [], :shape "StaticImageDeactivateScheduleActionSettings", :type "structure"} (clojure.core/contains? input :fade-out) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-integer-min-0 (input :fade-out)) #:http.request.field{:name "FadeOut", :shape "__integerMin0", :location-name "fadeOut"})) (clojure.core/contains? input :layer) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-integer-min-0-max-7 (input :layer)) #:http.request.field{:name "Layer", :shape "__integerMin0Max7", :location-name "layer"}))))

(clojure.core/defn- ser-video-codec-settings [input] (clojure.core/cond-> #:http.request.field{:value [], :shape "VideoCodecSettings", :type "structure"} (clojure.core/contains? input :frame-capture-settings) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-frame-capture-settings (input :frame-capture-settings)) #:http.request.field{:name "FrameCaptureSettings", :shape "FrameCaptureSettings", :location-name "frameCaptureSettings"})) (clojure.core/contains? input :h-264-settings) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-h-264-settings (input :h-264-settings)) #:http.request.field{:name "H264Settings", :shape "H264Settings", :location-name "h264Settings"}))))

(clojure.core/defn- ser-string-max-32 [input] #:http.request.field{:value input, :shape "__stringMax32"})

(clojure.core/defn- ser-eac-3-dc-filter [input] #:http.request.field{:value (clojure.core/get {"DISABLED" "DISABLED", :disabled "DISABLED", "ENABLED" "ENABLED", :enabled "ENABLED"} input), :shape "Eac3DcFilter"})

(clojure.core/defn- ser-m-3u-8-timed-metadata-behavior [input] #:http.request.field{:value (clojure.core/get {"NO_PASSTHROUGH" "NO_PASSTHROUGH", :no-passthrough "NO_PASSTHROUGH", "PASSTHROUGH" "PASSTHROUGH", :passthrough "PASSTHROUGH"} input), :shape "M3u8TimedMetadataBehavior"})

(clojure.core/defn- ser-integer-min-1-max-5 [input] #:http.request.field{:value input, :shape "__integerMin1Max5"})

(clojure.core/defn- ser-h-264-scene-change-detect [input] #:http.request.field{:value (clojure.core/get {"DISABLED" "DISABLED", :disabled "DISABLED", "ENABLED" "ENABLED", :enabled "ENABLED"} input), :shape "H264SceneChangeDetect"})

(clojure.core/defn- ser-aac-spec [input] #:http.request.field{:value (clojure.core/get {"MPEG2" "MPEG2", :mpeg-2 "MPEG2", "MPEG4" "MPEG4", :mpeg-4 "MPEG4"} input), :shape "AacSpec"})

(clojure.core/defn- ser-scte-35-apos-web-delivery-allowed-behavior [input] #:http.request.field{:value (clojure.core/get {"FOLLOW" "FOLLOW", :follow "FOLLOW", "IGNORE" "IGNORE", :ignore "IGNORE"} input), :shape "Scte35AposWebDeliveryAllowedBehavior"})

(clojure.core/defn- ser-blackout-slate-network-end-blackout [input] #:http.request.field{:value (clojure.core/get {"DISABLED" "DISABLED", :disabled "DISABLED", "ENABLED" "ENABLED", :enabled "ENABLED"} input), :shape "BlackoutSlateNetworkEndBlackout"})

(clojure.core/defn- ser-network-input-server-validation [input] #:http.request.field{:value (clojure.core/get {"CHECK_CRYPTOGRAPHY_AND_VALIDATE_NAME" "CHECK_CRYPTOGRAPHY_AND_VALIDATE_NAME", :check-cryptography-and-validate-name "CHECK_CRYPTOGRAPHY_AND_VALIDATE_NAME", "CHECK_CRYPTOGRAPHY_ONLY" "CHECK_CRYPTOGRAPHY_ONLY", :check-cryptography-only "CHECK_CRYPTOGRAPHY_ONLY"} input), :shape "NetworkInputServerValidation"})

(clojure.core/defn- ser-hls-redundant-manifest [input] #:http.request.field{:value (clojure.core/get {"DISABLED" "DISABLED", :disabled "DISABLED", "ENABLED" "ENABLED", :enabled "ENABLED"} input), :shape "HlsRedundantManifest"})

(clojure.core/defn- ser-rtmp-caption-info-destination-settings [input] (clojure.core/cond-> #:http.request.field{:value [], :shape "RtmpCaptionInfoDestinationSettings", :type "structure"}))

(clojure.core/defn- ser-aac-coding-mode [input] #:http.request.field{:value (clojure.core/get {"AD_RECEIVER_MIX" "AD_RECEIVER_MIX", "CODING_MODE_1_0" "CODING_MODE_1_0", :ad-receiver-mix "AD_RECEIVER_MIX", :coding-mode-1-0 "CODING_MODE_1_0", :coding-mode-2-0 "CODING_MODE_2_0", :coding-mode-5-1 "CODING_MODE_5_1", "CODING_MODE_1_1" "CODING_MODE_1_1", "CODING_MODE_2_0" "CODING_MODE_2_0", :coding-mode-1-1 "CODING_MODE_1_1", "CODING_MODE_5_1" "CODING_MODE_5_1"} input), :shape "AacCodingMode"})

(clojure.core/defn- ser-smooth-group-event-id-mode [input] #:http.request.field{:value (clojure.core/get {"NO_EVENT_ID" "NO_EVENT_ID", :no-event-id "NO_EVENT_ID", "USE_CONFIGURED" "USE_CONFIGURED", :use-configured "USE_CONFIGURED", "USE_TIMESTAMP" "USE_TIMESTAMP", :use-timestamp "USE_TIMESTAMP"} input), :shape "SmoothGroupEventIdMode"})

(clojure.core/defn- ser-scte-27-source-settings [input] (clojure.core/cond-> #:http.request.field{:value [], :shape "Scte27SourceSettings", :type "structure"} (clojure.core/contains? input :pid) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-integer-min-1 (input :pid)) #:http.request.field{:name "Pid", :shape "__integerMin1", :location-name "pid"}))))

(clojure.core/defn- ser-integer-min-1-max-3600 [input] #:http.request.field{:value input, :shape "__integerMin1Max3600"})

(clojure.core/defn- ser-webvtt-destination-settings [input] (clojure.core/cond-> #:http.request.field{:value [], :shape "WebvttDestinationSettings", :type "structure"}))

(clojure.core/defn- ser-output-settings [input] (clojure.core/cond-> #:http.request.field{:value [], :shape "OutputSettings", :type "structure"} (clojure.core/contains? input :archive-output-settings) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-archive-output-settings (input :archive-output-settings)) #:http.request.field{:name "ArchiveOutputSettings", :shape "ArchiveOutputSettings", :location-name "archiveOutputSettings"})) (clojure.core/contains? input :frame-capture-output-settings) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-frame-capture-output-settings (input :frame-capture-output-settings)) #:http.request.field{:name "FrameCaptureOutputSettings", :shape "FrameCaptureOutputSettings", :location-name "frameCaptureOutputSettings"})) (clojure.core/contains? input :hls-output-settings) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-hls-output-settings (input :hls-output-settings)) #:http.request.field{:name "HlsOutputSettings", :shape "HlsOutputSettings", :location-name "hlsOutputSettings"})) (clojure.core/contains? input :ms-smooth-output-settings) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-ms-smooth-output-settings (input :ms-smooth-output-settings)) #:http.request.field{:name "MsSmoothOutputSettings", :shape "MsSmoothOutputSettings", :location-name "msSmoothOutputSettings"})) (clojure.core/contains? input :rtmp-output-settings) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-rtmp-output-settings (input :rtmp-output-settings)) #:http.request.field{:name "RtmpOutputSettings", :shape "RtmpOutputSettings", :location-name "rtmpOutputSettings"})) (clojure.core/contains? input :udp-output-settings) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-udp-output-settings (input :udp-output-settings)) #:http.request.field{:name "UdpOutputSettings", :shape "UdpOutputSettings", :location-name "udpOutputSettings"}))))

(clojure.core/defn- ser-caption-language-mapping [input] (clojure.core/cond-> #:http.request.field{:value [(clojure.core/into (ser-string-min-3-max-3 (:language-code input)) #:http.request.field{:name "LanguageCode", :shape "__stringMin3Max3", :location-name "languageCode"}) (clojure.core/into (ser-string-min-1 (:language-description input)) #:http.request.field{:name "LanguageDescription", :shape "__stringMin1", :location-name "languageDescription"}) (clojure.core/into (ser-integer-min-1-max-4 (:caption-channel input)) #:http.request.field{:name "CaptionChannel", :shape "__integerMin1Max4", :location-name "captionChannel"})], :shape "CaptionLanguageMapping", :type "structure"}))

(clojure.core/defn- ser-input-loss-action-for-rtmp-out [input] #:http.request.field{:value (clojure.core/get {"EMIT_OUTPUT" "EMIT_OUTPUT", :emit-output "EMIT_OUTPUT", "PAUSE_OUTPUT" "PAUSE_OUTPUT", :pause-output "PAUSE_OUTPUT"} input), :shape "InputLossActionForRtmpOut"})

(clojure.core/defn- ser-schedule-action-start-settings [input] (clojure.core/cond-> #:http.request.field{:value [], :shape "ScheduleActionStartSettings", :type "structure"} (clojure.core/contains? input :fixed-mode-schedule-action-start-settings) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-fixed-mode-schedule-action-start-settings (input :fixed-mode-schedule-action-start-settings)) #:http.request.field{:name "FixedModeScheduleActionStartSettings", :shape "FixedModeScheduleActionStartSettings", :location-name "fixedModeScheduleActionStartSettings"})) (clojure.core/contains? input :follow-mode-schedule-action-start-settings) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-follow-mode-schedule-action-start-settings (input :follow-mode-schedule-action-start-settings)) #:http.request.field{:name "FollowModeScheduleActionStartSettings", :shape "FollowModeScheduleActionStartSettings", :location-name "followModeScheduleActionStartSettings"}))))

(clojure.core/defn- ser-list-of-output [input] #:http.request.field{:value (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (clojure.core/merge (ser-output coll) #:http.request.field{:shape "Output"}))) input), :shape "__listOfOutput", :type "list"})

(clojure.core/defn- ser-encoder-settings [input] (clojure.core/cond-> #:http.request.field{:value [(clojure.core/into (ser-list-of-video-description (:video-descriptions input)) #:http.request.field{:name "VideoDescriptions", :shape "__listOfVideoDescription", :location-name "videoDescriptions"}) (clojure.core/into (ser-list-of-audio-description (:audio-descriptions input)) #:http.request.field{:name "AudioDescriptions", :shape "__listOfAudioDescription", :location-name "audioDescriptions"}) (clojure.core/into (ser-list-of-output-group (:output-groups input)) #:http.request.field{:name "OutputGroups", :shape "__listOfOutputGroup", :location-name "outputGroups"}) (clojure.core/into (ser-timecode-config (:timecode-config input)) #:http.request.field{:name "TimecodeConfig", :shape "TimecodeConfig", :location-name "timecodeConfig"})], :shape "EncoderSettings", :type "structure"} (clojure.core/contains? input :global-configuration) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-global-configuration (input :global-configuration)) #:http.request.field{:name "GlobalConfiguration", :shape "GlobalConfiguration", :location-name "globalConfiguration"})) (clojure.core/contains? input :caption-descriptions) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-list-of-caption-description (input :caption-descriptions)) #:http.request.field{:name "CaptionDescriptions", :shape "__listOfCaptionDescription", :location-name "captionDescriptions"})) (clojure.core/contains? input :avail-configuration) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-avail-configuration (input :avail-configuration)) #:http.request.field{:name "AvailConfiguration", :shape "AvailConfiguration", :location-name "availConfiguration"})) (clojure.core/contains? input :blackout-slate) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-blackout-slate (input :blackout-slate)) #:http.request.field{:name "BlackoutSlate", :shape "BlackoutSlate", :location-name "blackoutSlate"})) (clojure.core/contains? input :avail-blanking) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-avail-blanking (input :avail-blanking)) #:http.request.field{:name "AvailBlanking", :shape "AvailBlanking", :location-name "availBlanking"}))))

(clojure.core/defn- ser-static-key-settings [input] (clojure.core/cond-> #:http.request.field{:value [(clojure.core/into (ser-string-min-32-max-32 (:static-key-value input)) #:http.request.field{:name "StaticKeyValue", :shape "__stringMin32Max32", :location-name "staticKeyValue"})], :shape "StaticKeySettings", :type "structure"} (clojure.core/contains? input :key-provider-server) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-input-location (input :key-provider-server)) #:http.request.field{:name "KeyProviderServer", :shape "InputLocation", :location-name "keyProviderServer"}))))

(clojure.core/defn- ser-frame-capture-group-settings [input] (clojure.core/cond-> #:http.request.field{:value [(clojure.core/into (ser-output-location-ref (:destination input)) #:http.request.field{:name "Destination", :shape "OutputLocationRef", :location-name "destination"})], :shape "FrameCaptureGroupSettings", :type "structure"}))

(clojure.core/defn- ser-video-description-respond-to-afd [input] #:http.request.field{:value (clojure.core/get {"NONE" "NONE", :none "NONE", "PASSTHROUGH" "PASSTHROUGH", :passthrough "PASSTHROUGH", "RESPOND" "RESPOND", :respond "RESPOND"} input), :shape "VideoDescriptionRespondToAfd"})

(clojure.core/defn- ser-teletext-destination-settings [input] (clojure.core/cond-> #:http.request.field{:value [], :shape "TeletextDestinationSettings", :type "structure"}))

(clojure.core/defn- ser-output-group [input] (clojure.core/cond-> #:http.request.field{:value [(clojure.core/into (ser-list-of-output (:outputs input)) #:http.request.field{:name "Outputs", :shape "__listOfOutput", :location-name "outputs"}) (clojure.core/into (ser-output-group-settings (:output-group-settings input)) #:http.request.field{:name "OutputGroupSettings", :shape "OutputGroupSettings", :location-name "outputGroupSettings"})], :shape "OutputGroup", :type "structure"} (clojure.core/contains? input :name) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-string-max-32 (input :name)) #:http.request.field{:name "Name", :shape "__stringMax32", :location-name "name"}))))

(clojure.core/defn- ser-input-attachment [input] (clojure.core/cond-> #:http.request.field{:value [], :shape "InputAttachment", :type "structure"} (clojure.core/contains? input :input-attachment-name) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-string (input :input-attachment-name)) #:http.request.field{:name "InputAttachmentName", :shape "__string", :location-name "inputAttachmentName"})) (clojure.core/contains? input :input-id) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-string (input :input-id)) #:http.request.field{:name "InputId", :shape "__string", :location-name "inputId"})) (clojure.core/contains? input :input-settings) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-input-settings (input :input-settings)) #:http.request.field{:name "InputSettings", :shape "InputSettings", :location-name "inputSettings"}))))

(clojure.core/defn- ser-hls-client-cache [input] #:http.request.field{:value (clojure.core/get {"DISABLED" "DISABLED", :disabled "DISABLED", "ENABLED" "ENABLED", :enabled "ENABLED"} input), :shape "HlsClientCache"})

(clojure.core/defn- ser-integer-min-0-max-10000 [input] #:http.request.field{:value input, :shape "__integerMin0Max10000"})

(clojure.core/defn- ser-h-264-temporal-aq [input] #:http.request.field{:value (clojure.core/get {"DISABLED" "DISABLED", :disabled "DISABLED", "ENABLED" "ENABLED", :enabled "ENABLED"} input), :shape "H264TemporalAq"})

(clojure.core/defn- ser-smpte-tt-destination-settings [input] (clojure.core/cond-> #:http.request.field{:value [], :shape "SmpteTtDestinationSettings", :type "structure"}))

(clojure.core/defn- ser-embedded-source-settings [input] (clojure.core/cond-> #:http.request.field{:value [], :shape "EmbeddedSourceSettings", :type "structure"} (clojure.core/contains? input :convert-608-to-708) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-embedded-convert-608-to-708 (input :convert-608-to-708)) #:http.request.field{:name "Convert608To708", :shape "EmbeddedConvert608To708", :location-name "convert608To708"})) (clojure.core/contains? input :scte-20-detection) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-embedded-scte-20-detection (input :scte-20-detection)) #:http.request.field{:name "Scte20Detection", :shape "EmbeddedScte20Detection", :location-name "scte20Detection"})) (clojure.core/contains? input :source-608-channel-number) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-integer-min-1-max-4 (input :source-608-channel-number)) #:http.request.field{:name "Source608ChannelNumber", :shape "__integerMin1Max4", :location-name "source608ChannelNumber"})) (clojure.core/contains? input :source-608-track-number) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-integer-min-1-max-5 (input :source-608-track-number)) #:http.request.field{:name "Source608TrackNumber", :shape "__integerMin1Max5", :location-name "source608TrackNumber"}))))

(clojure.core/defn- ser-h-264-gop-b-reference [input] #:http.request.field{:value (clojure.core/get {"DISABLED" "DISABLED", :disabled "DISABLED", "ENABLED" "ENABLED", :enabled "ENABLED"} input), :shape "H264GopBReference"})

(clojure.core/defn- ser-network-input-settings [input] (clojure.core/cond-> #:http.request.field{:value [], :shape "NetworkInputSettings", :type "structure"} (clojure.core/contains? input :hls-input-settings) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-hls-input-settings (input :hls-input-settings)) #:http.request.field{:name "HlsInputSettings", :shape "HlsInputSettings", :location-name "hlsInputSettings"})) (clojure.core/contains? input :server-validation) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-network-input-server-validation (input :server-validation)) #:http.request.field{:name "ServerValidation", :shape "NetworkInputServerValidation", :location-name "serverValidation"}))))

(clojure.core/defn- ser-string-min-3-max-3 [input] #:http.request.field{:value input, :shape "__stringMin3Max3"})

(clojure.core/defn- ser-smooth-group-certificate-mode [input] #:http.request.field{:value (clojure.core/get {"SELF_SIGNED" "SELF_SIGNED", :self-signed "SELF_SIGNED", "VERIFY_AUTHENTICITY" "VERIFY_AUTHENTICITY", :verify-authenticity "VERIFY_AUTHENTICITY"} input), :shape "SmoothGroupCertificateMode"})

(clojure.core/defn- ser-input-specification [input] (clojure.core/cond-> #:http.request.field{:value [], :shape "InputSpecification", :type "structure"} (clojure.core/contains? input :codec) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-input-codec (input :codec)) #:http.request.field{:name "Codec", :shape "InputCodec", :location-name "codec"})) (clojure.core/contains? input :maximum-bitrate) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-input-maximum-bitrate (input :maximum-bitrate)) #:http.request.field{:name "MaximumBitrate", :shape "InputMaximumBitrate", :location-name "maximumBitrate"})) (clojure.core/contains? input :resolution) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-input-resolution (input :resolution)) #:http.request.field{:name "Resolution", :shape "InputResolution", :location-name "resolution"}))))

(clojure.core/defn- ser-input-deblock-filter [input] #:http.request.field{:value (clojure.core/get {"DISABLED" "DISABLED", :disabled "DISABLED", "ENABLED" "ENABLED", :enabled "ENABLED"} input), :shape "InputDeblockFilter"})

(clojure.core/defn- ser-batch-schedule-action-delete-request [input] (clojure.core/cond-> #:http.request.field{:value [(clojure.core/into (ser-list-of-string (:action-names input)) #:http.request.field{:name "ActionNames", :shape "__listOf__string", :location-name "actionNames"})], :shape "BatchScheduleActionDeleteRequest", :type "structure"}))

(clojure.core/defn- ser-embedded-scte-20-detection [input] #:http.request.field{:value (clojure.core/get {"AUTO" "AUTO", :auto "AUTO", "OFF" "OFF", :off "OFF"} input), :shape "EmbeddedScte20Detection"})

(clojure.core/defn- ser-input-codec [input] #:http.request.field{:value (clojure.core/get {"MPEG2" "MPEG2", :mpeg-2 "MPEG2", "AVC" "AVC", :avc "AVC", "HEVC" "HEVC", :hevc "HEVC"} input), :shape "InputCodec"})

(clojure.core/defn- ser-integer-min-4-max-20 [input] #:http.request.field{:value input, :shape "__integerMin4Max20"})

(clojure.core/defn- ser-arib-source-settings [input] (clojure.core/cond-> #:http.request.field{:value [], :shape "AribSourceSettings", :type "structure"}))

(clojure.core/defn- ser-audio-description-language-code-control [input] #:http.request.field{:value (clojure.core/get {"FOLLOW_INPUT" "FOLLOW_INPUT", :follow-input "FOLLOW_INPUT", "USE_CONFIGURED" "USE_CONFIGURED", :use-configured "USE_CONFIGURED"} input), :shape "AudioDescriptionLanguageCodeControl"})

(clojure.core/defn- ser-double [input] #:http.request.field{:value input, :shape "__double"})

(clojure.core/defn- ser-ac-3-coding-mode [input] #:http.request.field{:value (clojure.core/get {"CODING_MODE_1_0" "CODING_MODE_1_0", :coding-mode-1-0 "CODING_MODE_1_0", "CODING_MODE_1_1" "CODING_MODE_1_1", :coding-mode-1-1 "CODING_MODE_1_1", "CODING_MODE_2_0" "CODING_MODE_2_0", :coding-mode-2-0 "CODING_MODE_2_0", "CODING_MODE_3_2_LFE" "CODING_MODE_3_2_LFE", :coding-mode-3-2-lfe "CODING_MODE_3_2_LFE"} input), :shape "Ac3CodingMode"})

(clojure.core/defn- ser-input-switch-schedule-action-settings [input] (clojure.core/cond-> #:http.request.field{:value [(clojure.core/into (ser-string (:input-attachment-name-reference input)) #:http.request.field{:name "InputAttachmentNameReference", :shape "__string", :location-name "inputAttachmentNameReference"})], :shape "InputSwitchScheduleActionSettings", :type "structure"}))

(clojure.core/defn- ser-integer-min-0-max-10 [input] #:http.request.field{:value input, :shape "__integerMin0Max10"})

(clojure.core/defn- ser-aac-rate-control-mode [input] #:http.request.field{:value (clojure.core/get {"CBR" "CBR", :cbr "CBR", "VBR" "VBR", :vbr "VBR"} input), :shape "AacRateControlMode"})

(clojure.core/defn- ser-integer-min-negative-1000-max-1000 [input] #:http.request.field{:value input, :shape "__integerMinNegative1000Max1000"})

(clojure.core/defn- ser-hls-segmentation-mode [input] #:http.request.field{:value (clojure.core/get {"USE_INPUT_SEGMENTATION" "USE_INPUT_SEGMENTATION", :use-input-segmentation "USE_INPUT_SEGMENTATION", "USE_SEGMENT_DURATION" "USE_SEGMENT_DURATION", :use-segment-duration "USE_SEGMENT_DURATION"} input), :shape "HlsSegmentationMode"})

(clojure.core/defn- ser-dvb-sub-destination-shadow-color [input] #:http.request.field{:value (clojure.core/get {"BLACK" "BLACK", :black "BLACK", "NONE" "NONE", :none "NONE", "WHITE" "WHITE", :white "WHITE"} input), :shape "DvbSubDestinationShadowColor"})

(clojure.core/defn- ser-pass-through-settings [input] (clojure.core/cond-> #:http.request.field{:value [], :shape "PassThroughSettings", :type "structure"}))

(clojure.core/defn- ser-video-description-scaling-behavior [input] #:http.request.field{:value (clojure.core/get {"DEFAULT" "DEFAULT", :default "DEFAULT", "STRETCH_TO_OUTPUT" "STRETCH_TO_OUTPUT", :stretch-to-output "STRETCH_TO_OUTPUT"} input), :shape "VideoDescriptionScalingBehavior"})

(clojure.core/defn- ser-scte-35-archive-allowed-flag [input] #:http.request.field{:value (clojure.core/get {"ARCHIVE_NOT_ALLOWED" "ARCHIVE_NOT_ALLOWED", :archive-not-allowed "ARCHIVE_NOT_ALLOWED", "ARCHIVE_ALLOWED" "ARCHIVE_ALLOWED", :archive-allowed "ARCHIVE_ALLOWED"} input), :shape "Scte35ArchiveAllowedFlag"})

(clojure.core/defn- ser-eac-3-attenuation-control [input] #:http.request.field{:value (clojure.core/get {"ATTENUATE_3_DB" "ATTENUATE_3_DB", :attenuate-3-db "ATTENUATE_3_DB", "NONE" "NONE", :none "NONE"} input), :shape "Eac3AttenuationControl"})

(clojure.core/defn- ser-h-264-framerate-control [input] #:http.request.field{:value (clojure.core/get {"INITIALIZE_FROM_SOURCE" "INITIALIZE_FROM_SOURCE", :initialize-from-source "INITIALIZE_FROM_SOURCE", "SPECIFIED" "SPECIFIED", :specified "SPECIFIED"} input), :shape "H264FramerateControl"})

(clojure.core/defn- ser-aac-input-type [input] #:http.request.field{:value (clojure.core/get {"BROADCASTER_MIXED_AD" "BROADCASTER_MIXED_AD", :broadcaster-mixed-ad "BROADCASTER_MIXED_AD", "NORMAL" "NORMAL", :normal "NORMAL"} input), :shape "AacInputType"})

(clojure.core/defn- ser-timecode-config [input] (clojure.core/cond-> #:http.request.field{:value [(clojure.core/into (ser-timecode-config-source (:source input)) #:http.request.field{:name "Source", :shape "TimecodeConfigSource", :location-name "source"})], :shape "TimecodeConfig", :type "structure"} (clojure.core/contains? input :sync-threshold) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-integer-min-1-max-1000000 (input :sync-threshold)) #:http.request.field{:name "SyncThreshold", :shape "__integerMin1Max1000000", :location-name "syncThreshold"}))))

(clojure.core/defn- ser-dvb-sub-destination-settings [input] (clojure.core/cond-> #:http.request.field{:value [], :shape "DvbSubDestinationSettings", :type "structure"} (clojure.core/contains? input :outline-color) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-dvb-sub-destination-outline-color (input :outline-color)) #:http.request.field{:name "OutlineColor", :shape "DvbSubDestinationOutlineColor", :location-name "outlineColor"})) (clojure.core/contains? input :outline-size) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-integer-min-0-max-10 (input :outline-size)) #:http.request.field{:name "OutlineSize", :shape "__integerMin0Max10", :location-name "outlineSize"})) (clojure.core/contains? input :shadow-color) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-dvb-sub-destination-shadow-color (input :shadow-color)) #:http.request.field{:name "ShadowColor", :shape "DvbSubDestinationShadowColor", :location-name "shadowColor"})) (clojure.core/contains? input :shadow-opacity) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-integer-min-0-max-255 (input :shadow-opacity)) #:http.request.field{:name "ShadowOpacity", :shape "__integerMin0Max255", :location-name "shadowOpacity"})) (clojure.core/contains? input :shadow-y-offset) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-integer (input :shadow-y-offset)) #:http.request.field{:name "ShadowYOffset", :shape "__integer", :location-name "shadowYOffset"})) (clojure.core/contains? input :background-color) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-dvb-sub-destination-background-color (input :background-color)) #:http.request.field{:name "BackgroundColor", :shape "DvbSubDestinationBackgroundColor", :location-name "backgroundColor"})) (clojure.core/contains? input :teletext-grid-control) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-dvb-sub-destination-teletext-grid-control (input :teletext-grid-control)) #:http.request.field{:name "TeletextGridControl", :shape "DvbSubDestinationTeletextGridControl", :location-name "teletextGridControl"})) (clojure.core/contains? input :y-position) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-integer-min-0 (input :y-position)) #:http.request.field{:name "YPosition", :shape "__integerMin0", :location-name "yPosition"})) (clojure.core/contains? input :font-color) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-dvb-sub-destination-font-color (input :font-color)) #:http.request.field{:name "FontColor", :shape "DvbSubDestinationFontColor", :location-name "fontColor"})) (clojure.core/contains? input :x-position) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-integer-min-0 (input :x-position)) #:http.request.field{:name "XPosition", :shape "__integerMin0", :location-name "xPosition"})) (clojure.core/contains? input :font) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-input-location (input :font)) #:http.request.field{:name "Font", :shape "InputLocation", :location-name "font"})) (clojure.core/contains? input :font-resolution) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-integer-min-96-max-600 (input :font-resolution)) #:http.request.field{:name "FontResolution", :shape "__integerMin96Max600", :location-name "fontResolution"})) (clojure.core/contains? input :font-size) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-string (input :font-size)) #:http.request.field{:name "FontSize", :shape "__string", :location-name "fontSize"})) (clojure.core/contains? input :background-opacity) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-integer-min-0-max-255 (input :background-opacity)) #:http.request.field{:name "BackgroundOpacity", :shape "__integerMin0Max255", :location-name "backgroundOpacity"})) (clojure.core/contains? input :font-opacity) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-integer-min-0-max-255 (input :font-opacity)) #:http.request.field{:name "FontOpacity", :shape "__integerMin0Max255", :location-name "fontOpacity"})) (clojure.core/contains? input :shadow-x-offset) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-integer (input :shadow-x-offset)) #:http.request.field{:name "ShadowXOffset", :shape "__integer", :location-name "shadowXOffset"})) (clojure.core/contains? input :alignment) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-dvb-sub-destination-alignment (input :alignment)) #:http.request.field{:name "Alignment", :shape "DvbSubDestinationAlignment", :location-name "alignment"}))))

(clojure.core/defn- ser-embedded-convert-608-to-708 [input] #:http.request.field{:value (clojure.core/get {"DISABLED" "DISABLED", :disabled "DISABLED", "UPCONVERT" "UPCONVERT", :upconvert "UPCONVERT"} input), :shape "EmbeddedConvert608To708"})

(clojure.core/defn- ser-audio-only-hls-track-type [input] #:http.request.field{:value (clojure.core/get {"ALTERNATE_AUDIO_AUTO_SELECT" "ALTERNATE_AUDIO_AUTO_SELECT", :alternate-audio-auto-select "ALTERNATE_AUDIO_AUTO_SELECT", "ALTERNATE_AUDIO_AUTO_SELECT_DEFAULT" "ALTERNATE_AUDIO_AUTO_SELECT_DEFAULT", :alternate-audio-auto-select-default "ALTERNATE_AUDIO_AUTO_SELECT_DEFAULT", "ALTERNATE_AUDIO_NOT_AUTO_SELECT" "ALTERNATE_AUDIO_NOT_AUTO_SELECT", :alternate-audio-not-auto-select "ALTERNATE_AUDIO_NOT_AUTO_SELECT", "AUDIO_ONLY_VARIANT_STREAM" "AUDIO_ONLY_VARIANT_STREAM", :audio-only-variant-stream "AUDIO_ONLY_VARIANT_STREAM"} input), :shape "AudioOnlyHlsTrackType"})

(clojure.core/defn- ser-h-264-color-metadata [input] #:http.request.field{:value (clojure.core/get {"IGNORE" "IGNORE", :ignore "IGNORE", "INSERT" "INSERT", :insert "INSERT"} input), :shape "H264ColorMetadata"})

(clojure.core/defn- ser-string-min-1 [input] #:http.request.field{:value input, :shape "__stringMin1"})

(clojure.core/defn- ser-max-results [input] #:http.request.field{:value input, :shape "MaxResults"})

(clojure.core/defn- ser-blackout-slate [input] (clojure.core/cond-> #:http.request.field{:value [], :shape "BlackoutSlate", :type "structure"} (clojure.core/contains? input :blackout-slate-image) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-input-location (input :blackout-slate-image)) #:http.request.field{:name "BlackoutSlateImage", :shape "InputLocation", :location-name "blackoutSlateImage"})) (clojure.core/contains? input :network-end-blackout) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-blackout-slate-network-end-blackout (input :network-end-blackout)) #:http.request.field{:name "NetworkEndBlackout", :shape "BlackoutSlateNetworkEndBlackout", :location-name "networkEndBlackout"})) (clojure.core/contains? input :network-end-blackout-image) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-input-location (input :network-end-blackout-image)) #:http.request.field{:name "NetworkEndBlackoutImage", :shape "InputLocation", :location-name "networkEndBlackoutImage"})) (clojure.core/contains? input :network-id) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-string-min-34-max-34 (input :network-id)) #:http.request.field{:name "NetworkId", :shape "__stringMin34Max34", :location-name "networkId"})) (clojure.core/contains? input :state) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-blackout-slate-state (input :state)) #:http.request.field{:name "State", :shape "BlackoutSlateState", :location-name "state"}))))

(clojure.core/defn- ser-ac-3-settings [input] (clojure.core/cond-> #:http.request.field{:value [], :shape "Ac3Settings", :type "structure"} (clojure.core/contains? input :bitrate) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-double (input :bitrate)) #:http.request.field{:name "Bitrate", :shape "__double", :location-name "bitrate"})) (clojure.core/contains? input :bitstream-mode) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-ac-3-bitstream-mode (input :bitstream-mode)) #:http.request.field{:name "BitstreamMode", :shape "Ac3BitstreamMode", :location-name "bitstreamMode"})) (clojure.core/contains? input :coding-mode) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-ac-3-coding-mode (input :coding-mode)) #:http.request.field{:name "CodingMode", :shape "Ac3CodingMode", :location-name "codingMode"})) (clojure.core/contains? input :dialnorm) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-integer-min-1-max-31 (input :dialnorm)) #:http.request.field{:name "Dialnorm", :shape "__integerMin1Max31", :location-name "dialnorm"})) (clojure.core/contains? input :drc-profile) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-ac-3-drc-profile (input :drc-profile)) #:http.request.field{:name "DrcProfile", :shape "Ac3DrcProfile", :location-name "drcProfile"})) (clojure.core/contains? input :lfe-filter) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-ac-3-lfe-filter (input :lfe-filter)) #:http.request.field{:name "LfeFilter", :shape "Ac3LfeFilter", :location-name "lfeFilter"})) (clojure.core/contains? input :metadata-control) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-ac-3-metadata-control (input :metadata-control)) #:http.request.field{:name "MetadataControl", :shape "Ac3MetadataControl", :location-name "metadataControl"}))))

(clojure.core/defn- ser-ms-smooth-group-settings [input] (clojure.core/cond-> #:http.request.field{:value [(clojure.core/into (ser-output-location-ref (:destination input)) #:http.request.field{:name "Destination", :shape "OutputLocationRef", :location-name "destination"})], :shape "MsSmoothGroupSettings", :type "structure"} (clojure.core/contains? input :fragment-length) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-integer-min-1 (input :fragment-length)) #:http.request.field{:name "FragmentLength", :shape "__integerMin1", :location-name "fragmentLength"})) (clojure.core/contains? input :input-loss-action) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-input-loss-action-for-ms-smooth-out (input :input-loss-action)) #:http.request.field{:name "InputLossAction", :shape "InputLossActionForMsSmoothOut", :location-name "inputLossAction"})) (clojure.core/contains? input :event-stop-behavior) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-smooth-group-event-stop-behavior (input :event-stop-behavior)) #:http.request.field{:name "EventStopBehavior", :shape "SmoothGroupEventStopBehavior", :location-name "eventStopBehavior"})) (clojure.core/contains? input :acquisition-point-id) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-string (input :acquisition-point-id)) #:http.request.field{:name "AcquisitionPointId", :shape "__string", :location-name "acquisitionPointId"})) (clojure.core/contains? input :stream-manifest-behavior) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-smooth-group-stream-manifest-behavior (input :stream-manifest-behavior)) #:http.request.field{:name "StreamManifestBehavior", :shape "SmoothGroupStreamManifestBehavior", :location-name "streamManifestBehavior"})) (clojure.core/contains? input :num-retries) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-integer-min-0 (input :num-retries)) #:http.request.field{:name "NumRetries", :shape "__integerMin0", :location-name "numRetries"})) (clojure.core/contains? input :filecache-duration) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-integer-min-0 (input :filecache-duration)) #:http.request.field{:name "FilecacheDuration", :shape "__integerMin0", :location-name "filecacheDuration"})) (clojure.core/contains? input :sparse-track-type) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-smooth-group-sparse-track-type (input :sparse-track-type)) #:http.request.field{:name "SparseTrackType", :shape "SmoothGroupSparseTrackType", :location-name "sparseTrackType"})) (clojure.core/contains? input :certificate-mode) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-smooth-group-certificate-mode (input :certificate-mode)) #:http.request.field{:name "CertificateMode", :shape "SmoothGroupCertificateMode", :location-name "certificateMode"})) (clojure.core/contains? input :send-delay-ms) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-integer-min-0-max-10000 (input :send-delay-ms)) #:http.request.field{:name "SendDelayMs", :shape "__integerMin0Max10000", :location-name "sendDelayMs"})) (clojure.core/contains? input :event-id-mode) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-smooth-group-event-id-mode (input :event-id-mode)) #:http.request.field{:name "EventIdMode", :shape "SmoothGroupEventIdMode", :location-name "eventIdMode"})) (clojure.core/contains? input :segmentation-mode) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-smooth-group-segmentation-mode (input :segmentation-mode)) #:http.request.field{:name "SegmentationMode", :shape "SmoothGroupSegmentationMode", :location-name "segmentationMode"})) (clojure.core/contains? input :audio-only-timecode-control) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-smooth-group-audio-only-timecode-control (input :audio-only-timecode-control)) #:http.request.field{:name "AudioOnlyTimecodeControl", :shape "SmoothGroupAudioOnlyTimecodeControl", :location-name "audioOnlyTimecodeControl"})) (clojure.core/contains? input :timestamp-offset) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-string (input :timestamp-offset)) #:http.request.field{:name "TimestampOffset", :shape "__string", :location-name "timestampOffset"})) (clojure.core/contains? input :event-id) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-string (input :event-id)) #:http.request.field{:name "EventId", :shape "__string", :location-name "eventId"})) (clojure.core/contains? input :connection-retry-interval) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-integer-min-0 (input :connection-retry-interval)) #:http.request.field{:name "ConnectionRetryInterval", :shape "__integerMin0", :location-name "connectionRetryInterval"})) (clojure.core/contains? input :timestamp-offset-mode) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-smooth-group-timestamp-offset-mode (input :timestamp-offset-mode)) #:http.request.field{:name "TimestampOffsetMode", :shape "SmoothGroupTimestampOffsetMode", :location-name "timestampOffsetMode"})) (clojure.core/contains? input :restart-delay) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-integer-min-0 (input :restart-delay)) #:http.request.field{:name "RestartDelay", :shape "__integerMin0", :location-name "restartDelay"}))))

(clojure.core/defn- ser-integer-min-0-max-7 [input] #:http.request.field{:value input, :shape "__integerMin0Max7"})

(clojure.core/defn- ser-h-264-entropy-encoding [input] #:http.request.field{:value (clojure.core/get {"CABAC" "CABAC", :cabac "CABAC", "CAVLC" "CAVLC", :cavlc "CAVLC"} input), :shape "H264EntropyEncoding"})

(clojure.core/defn- ser-output [input] (clojure.core/cond-> #:http.request.field{:value [(clojure.core/into (ser-output-settings (:output-settings input)) #:http.request.field{:name "OutputSettings", :shape "OutputSettings", :location-name "outputSettings"})], :shape "Output", :type "structure"} (clojure.core/contains? input :audio-description-names) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-list-of-string (input :audio-description-names)) #:http.request.field{:name "AudioDescriptionNames", :shape "__listOf__string", :location-name "audioDescriptionNames"})) (clojure.core/contains? input :caption-description-names) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-list-of-string (input :caption-description-names)) #:http.request.field{:name "CaptionDescriptionNames", :shape "__listOf__string", :location-name "captionDescriptionNames"})) (clojure.core/contains? input :output-name) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-string-min-1-max-255 (input :output-name)) #:http.request.field{:name "OutputName", :shape "__stringMin1Max255", :location-name "outputName"})) (clojure.core/contains? input :video-description-name) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-string (input :video-description-name)) #:http.request.field{:name "VideoDescriptionName", :shape "__string", :location-name "videoDescriptionName"}))))

(clojure.core/defn- ser-burn-in-shadow-color [input] #:http.request.field{:value (clojure.core/get {"BLACK" "BLACK", :black "BLACK", "NONE" "NONE", :none "NONE", "WHITE" "WHITE", :white "WHITE"} input), :shape "BurnInShadowColor"})

(clojure.core/defn- ser-audio-language-selection-policy [input] #:http.request.field{:value (clojure.core/get {"LOOSE" "LOOSE", :loose "LOOSE", "STRICT" "STRICT", :strict "STRICT"} input), :shape "AudioLanguageSelectionPolicy"})

(clojure.core/defn- ser-integer [input] #:http.request.field{:value input, :shape "__integer"})

(clojure.core/defn- ser-aac-settings [input] (clojure.core/cond-> #:http.request.field{:value [], :shape "AacSettings", :type "structure"} (clojure.core/contains? input :rate-control-mode) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-aac-rate-control-mode (input :rate-control-mode)) #:http.request.field{:name "RateControlMode", :shape "AacRateControlMode", :location-name "rateControlMode"})) (clojure.core/contains? input :coding-mode) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-aac-coding-mode (input :coding-mode)) #:http.request.field{:name "CodingMode", :shape "AacCodingMode", :location-name "codingMode"})) (clojure.core/contains? input :input-type) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-aac-input-type (input :input-type)) #:http.request.field{:name "InputType", :shape "AacInputType", :location-name "inputType"})) (clojure.core/contains? input :sample-rate) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-double (input :sample-rate)) #:http.request.field{:name "SampleRate", :shape "__double", :location-name "sampleRate"})) (clojure.core/contains? input :spec) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-aac-spec (input :spec)) #:http.request.field{:name "Spec", :shape "AacSpec", :location-name "spec"})) (clojure.core/contains? input :vbr-quality) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-aac-vbr-quality (input :vbr-quality)) #:http.request.field{:name "VbrQuality", :shape "AacVbrQuality", :location-name "vbrQuality"})) (clojure.core/contains? input :profile) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-aac-profile (input :profile)) #:http.request.field{:name "Profile", :shape "AacProfile", :location-name "profile"})) (clojure.core/contains? input :raw-format) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-aac-raw-format (input :raw-format)) #:http.request.field{:name "RawFormat", :shape "AacRawFormat", :location-name "rawFormat"})) (clojure.core/contains? input :bitrate) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-double (input :bitrate)) #:http.request.field{:name "Bitrate", :shape "__double", :location-name "bitrate"}))))

(clojure.core/defn- ser-integer-min-1 [input] #:http.request.field{:value input, :shape "__integerMin1"})

(clojure.core/defn- ser-list-of-caption-selector [input] #:http.request.field{:value (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (clojure.core/merge (ser-caption-selector coll) #:http.request.field{:shape "CaptionSelector"}))) input), :shape "__listOfCaptionSelector", :type "list"})

(clojure.core/defn- ser-integer-min-0-max-4294967295 [input] #:http.request.field{:value input, :shape "__integerMin0Max4294967295"})

(clojure.core/defn- ser-rtmp-group-settings [input] (clojure.core/cond-> #:http.request.field{:value [], :shape "RtmpGroupSettings", :type "structure"} (clojure.core/contains? input :authentication-scheme) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-authentication-scheme (input :authentication-scheme)) #:http.request.field{:name "AuthenticationScheme", :shape "AuthenticationScheme", :location-name "authenticationScheme"})) (clojure.core/contains? input :cache-full-behavior) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-rtmp-cache-full-behavior (input :cache-full-behavior)) #:http.request.field{:name "CacheFullBehavior", :shape "RtmpCacheFullBehavior", :location-name "cacheFullBehavior"})) (clojure.core/contains? input :cache-length) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-integer-min-30 (input :cache-length)) #:http.request.field{:name "CacheLength", :shape "__integerMin30", :location-name "cacheLength"})) (clojure.core/contains? input :caption-data) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-rtmp-caption-data (input :caption-data)) #:http.request.field{:name "CaptionData", :shape "RtmpCaptionData", :location-name "captionData"})) (clojure.core/contains? input :input-loss-action) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-input-loss-action-for-rtmp-out (input :input-loss-action)) #:http.request.field{:name "InputLossAction", :shape "InputLossActionForRtmpOut", :location-name "inputLossAction"})) (clojure.core/contains? input :restart-delay) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-integer-min-0 (input :restart-delay)) #:http.request.field{:name "RestartDelay", :shape "__integerMin0", :location-name "restartDelay"}))))

(clojure.core/defn- ser-burn-in-alignment [input] #:http.request.field{:value (clojure.core/get {"CENTERED" "CENTERED", :centered "CENTERED", "LEFT" "LEFT", :left "LEFT", "SMART" "SMART", :smart "SMART"} input), :shape "BurnInAlignment"})

(clojure.core/defn- ser-list-of-caption-description [input] #:http.request.field{:value (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (clojure.core/merge (ser-caption-description coll) #:http.request.field{:shape "CaptionDescription"}))) input), :shape "__listOfCaptionDescription", :type "list"})

(clojure.core/defn- ser-embedded-destination-settings [input] (clojure.core/cond-> #:http.request.field{:value [], :shape "EmbeddedDestinationSettings", :type "structure"}))

(clojure.core/defn- ser-caption-selector [input] (clojure.core/cond-> #:http.request.field{:value [(clojure.core/into (ser-string-min-1 (:name input)) #:http.request.field{:name "Name", :shape "__stringMin1", :location-name "name"})], :shape "CaptionSelector", :type "structure"} (clojure.core/contains? input :language-code) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-string (input :language-code)) #:http.request.field{:name "LanguageCode", :shape "__string", :location-name "languageCode"})) (clojure.core/contains? input :selector-settings) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-caption-selector-settings (input :selector-settings)) #:http.request.field{:name "SelectorSettings", :shape "CaptionSelectorSettings", :location-name "selectorSettings"}))))

(clojure.core/defn- ser-embedded-plus-scte-20-destination-settings [input] (clojure.core/cond-> #:http.request.field{:value [], :shape "EmbeddedPlusScte20DestinationSettings", :type "structure"}))

(clojure.core/defn- ser-hls-group-settings [input] (clojure.core/cond-> #:http.request.field{:value [(clojure.core/into (ser-output-location-ref (:destination input)) #:http.request.field{:name "Destination", :shape "OutputLocationRef", :location-name "destination"})], :shape "HlsGroupSettings", :type "structure"} (clojure.core/contains? input :segment-length) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-integer-min-1 (input :segment-length)) #:http.request.field{:name "SegmentLength", :shape "__integerMin1", :location-name "segmentLength"})) (clojure.core/contains? input :ts-file-mode) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-hls-ts-file-mode (input :ts-file-mode)) #:http.request.field{:name "TsFileMode", :shape "HlsTsFileMode", :location-name "tsFileMode"})) (clojure.core/contains? input :timestamp-delta-milliseconds) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-integer-min-0 (input :timestamp-delta-milliseconds)) #:http.request.field{:name "TimestampDeltaMilliseconds", :shape "__integerMin0", :location-name "timestampDeltaMilliseconds"})) (clojure.core/contains? input :program-date-time-period) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-integer-min-0-max-3600 (input :program-date-time-period)) #:http.request.field{:name "ProgramDateTimePeriod", :shape "__integerMin0Max3600", :location-name "programDateTimePeriod"})) (clojure.core/contains? input :constant-iv) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-string-min-32-max-32 (input :constant-iv)) #:http.request.field{:name "ConstantIv", :shape "__stringMin32Max32", :location-name "constantIv"})) (clojure.core/contains? input :key-format-versions) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-string (input :key-format-versions)) #:http.request.field{:name "KeyFormatVersions", :shape "__string", :location-name "keyFormatVersions"})) (clojure.core/contains? input :input-loss-action) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-input-loss-action-for-hls-out (input :input-loss-action)) #:http.request.field{:name "InputLossAction", :shape "InputLossActionForHlsOut", :location-name "inputLossAction"})) (clojure.core/contains? input :ad-markers) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-list-of-hls-ad-markers (input :ad-markers)) #:http.request.field{:name "AdMarkers", :shape "__listOfHlsAdMarkers", :location-name "adMarkers"})) (clojure.core/contains? input :caption-language-mappings) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-list-of-caption-language-mapping (input :caption-language-mappings)) #:http.request.field{:name "CaptionLanguageMappings", :shape "__listOfCaptionLanguageMapping", :location-name "captionLanguageMappings"})) (clojure.core/contains? input :timed-metadata-id-3-frame) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-hls-timed-metadata-id-3-frame (input :timed-metadata-id-3-frame)) #:http.request.field{:name "TimedMetadataId3Frame", :shape "HlsTimedMetadataId3Frame", :location-name "timedMetadataId3Frame"})) (clojure.core/contains? input :mode) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-hls-mode (input :mode)) #:http.request.field{:name "Mode", :shape "HlsMode", :location-name "mode"})) (clojure.core/contains? input :directory-structure) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-hls-directory-structure (input :directory-structure)) #:http.request.field{:name "DirectoryStructure", :shape "HlsDirectoryStructure", :location-name "directoryStructure"})) (clojure.core/contains? input :encryption-type) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-hls-encryption-type (input :encryption-type)) #:http.request.field{:name "EncryptionType", :shape "HlsEncryptionType", :location-name "encryptionType"})) (clojure.core/contains? input :index-n-segments) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-integer-min-3 (input :index-n-segments)) #:http.request.field{:name "IndexNSegments", :shape "__integerMin3", :location-name "indexNSegments"})) (clojure.core/contains? input :keep-segments) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-integer-min-1 (input :keep-segments)) #:http.request.field{:name "KeepSegments", :shape "__integerMin1", :location-name "keepSegments"})) (clojure.core/contains? input :min-segment-length) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-integer-min-0 (input :min-segment-length)) #:http.request.field{:name "MinSegmentLength", :shape "__integerMin0", :location-name "minSegmentLength"})) (clojure.core/contains? input :iv-in-manifest) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-hls-iv-in-manifest (input :iv-in-manifest)) #:http.request.field{:name "IvInManifest", :shape "HlsIvInManifest", :location-name "ivInManifest"})) (clojure.core/contains? input :stream-inf-resolution) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-hls-stream-inf-resolution (input :stream-inf-resolution)) #:http.request.field{:name "StreamInfResolution", :shape "HlsStreamInfResolution", :location-name "streamInfResolution"})) (clojure.core/contains? input :hls-cdn-settings) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-hls-cdn-settings (input :hls-cdn-settings)) #:http.request.field{:name "HlsCdnSettings", :shape "HlsCdnSettings", :location-name "hlsCdnSettings"})) (clojure.core/contains? input :redundant-manifest) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-hls-redundant-manifest (input :redundant-manifest)) #:http.request.field{:name "RedundantManifest", :shape "HlsRedundantManifest", :location-name "redundantManifest"})) (clojure.core/contains? input :program-date-time) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-hls-program-date-time (input :program-date-time)) #:http.request.field{:name "ProgramDateTime", :shape "HlsProgramDateTime", :location-name "programDateTime"})) (clojure.core/contains? input :i-frame-only-playlists) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-i-frame-only-playlist-type (input :i-frame-only-playlists)) #:http.request.field{:name "IFrameOnlyPlaylists", :shape "IFrameOnlyPlaylistType", :location-name "iFrameOnlyPlaylists"})) (clojure.core/contains? input :output-selection) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-hls-output-selection (input :output-selection)) #:http.request.field{:name "OutputSelection", :shape "HlsOutputSelection", :location-name "outputSelection"})) (clojure.core/contains? input :base-url-content) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-string (input :base-url-content)) #:http.request.field{:name "BaseUrlContent", :shape "__string", :location-name "baseUrlContent"})) (clojure.core/contains? input :caption-language-setting) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-hls-caption-language-setting (input :caption-language-setting)) #:http.request.field{:name "CaptionLanguageSetting", :shape "HlsCaptionLanguageSetting", :location-name "captionLanguageSetting"})) (clojure.core/contains? input :manifest-duration-format) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-hls-manifest-duration-format (input :manifest-duration-format)) #:http.request.field{:name "ManifestDurationFormat", :shape "HlsManifestDurationFormat", :location-name "manifestDurationFormat"})) (clojure.core/contains? input :segmentation-mode) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-hls-segmentation-mode (input :segmentation-mode)) #:http.request.field{:name "SegmentationMode", :shape "HlsSegmentationMode", :location-name "segmentationMode"})) (clojure.core/contains? input :timed-metadata-id-3-period) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-integer-min-0 (input :timed-metadata-id-3-period)) #:http.request.field{:name "TimedMetadataId3Period", :shape "__integerMin0", :location-name "timedMetadataId3Period"})) (clojure.core/contains? input :manifest-compression) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-hls-manifest-compression (input :manifest-compression)) #:http.request.field{:name "ManifestCompression", :shape "HlsManifestCompression", :location-name "manifestCompression"})) (clojure.core/contains? input :segments-per-subdirectory) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-integer-min-1 (input :segments-per-subdirectory)) #:http.request.field{:name "SegmentsPerSubdirectory", :shape "__integerMin1", :location-name "segmentsPerSubdirectory"})) (clojure.core/contains? input :key-format) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-string (input :key-format)) #:http.request.field{:name "KeyFormat", :shape "__string", :location-name "keyFormat"})) (clojure.core/contains? input :iv-source) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-hls-iv-source (input :iv-source)) #:http.request.field{:name "IvSource", :shape "HlsIvSource", :location-name "ivSource"})) (clojure.core/contains? input :codec-specification) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-hls-codec-specification (input :codec-specification)) #:http.request.field{:name "CodecSpecification", :shape "HlsCodecSpecification", :location-name "codecSpecification"})) (clojure.core/contains? input :key-provider-settings) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-key-provider-settings (input :key-provider-settings)) #:http.request.field{:name "KeyProviderSettings", :shape "KeyProviderSettings", :location-name "keyProviderSettings"})) (clojure.core/contains? input :base-url-manifest) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-string (input :base-url-manifest)) #:http.request.field{:name "BaseUrlManifest", :shape "__string", :location-name "baseUrlManifest"})) (clojure.core/contains? input :client-cache) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-hls-client-cache (input :client-cache)) #:http.request.field{:name "ClientCache", :shape "HlsClientCache", :location-name "clientCache"}))))

(clojure.core/defn- ser-input-loss-action-for-ms-smooth-out [input] #:http.request.field{:value (clojure.core/get {"EMIT_OUTPUT" "EMIT_OUTPUT", :emit-output "EMIT_OUTPUT", "PAUSE_OUTPUT" "PAUSE_OUTPUT", :pause-output "PAUSE_OUTPUT"} input), :shape "InputLossActionForMsSmoothOut"})

(clojure.core/defn- ser-dvb-nit-settings [input] (clojure.core/cond-> #:http.request.field{:value [(clojure.core/into (ser-string-min-1-max-256 (:network-name input)) #:http.request.field{:name "NetworkName", :shape "__stringMin1Max256", :location-name "networkName"}) (clojure.core/into (ser-integer-min-0-max-65536 (:network-id input)) #:http.request.field{:name "NetworkId", :shape "__integerMin0Max65536", :location-name "networkId"})], :shape "DvbNitSettings", :type "structure"} (clojure.core/contains? input :rep-interval) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-integer-min-25-max-10000 (input :rep-interval)) #:http.request.field{:name "RepInterval", :shape "__integerMin25Max10000", :location-name "repInterval"}))))

(clojure.core/defn- ser-integer-min-1-max-20 [input] #:http.request.field{:value input, :shape "__integerMin1Max20"})

(clojure.core/defn- ser-integer-min-0-max-8191 [input] #:http.request.field{:value input, :shape "__integerMin0Max8191"})

(clojure.core/defn- ser-list-of-input-destination-request [input] #:http.request.field{:value (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (clojure.core/merge (ser-input-destination-request coll) #:http.request.field{:shape "InputDestinationRequest"}))) input), :shape "__listOfInputDestinationRequest", :type "list"})

(clojure.core/defn- ser-smooth-group-timestamp-offset-mode [input] #:http.request.field{:value (clojure.core/get {"USE_CONFIGURED_OFFSET" "USE_CONFIGURED_OFFSET", :use-configured-offset "USE_CONFIGURED_OFFSET", "USE_EVENT_START_DATE" "USE_EVENT_START_DATE", :use-event-start-date "USE_EVENT_START_DATE"} input), :shape "SmoothGroupTimestampOffsetMode"})

(clojure.core/defn- ser-hls-media-store-storage-class [input] #:http.request.field{:value (clojure.core/get {"TEMPORAL" "TEMPORAL", :temporal "TEMPORAL"} input), :shape "HlsMediaStoreStorageClass"})

(clojure.core/defn- ser-pipeline-pause-state-settings [input] (clojure.core/cond-> #:http.request.field{:value [(clojure.core/into (ser-pipeline-id (:pipeline-id input)) #:http.request.field{:name "PipelineId", :shape "PipelineId", :location-name "pipelineId"})], :shape "PipelinePauseStateSettings", :type "structure"}))

(clojure.core/defn- ser-frame-capture-settings [input] (clojure.core/cond-> #:http.request.field{:value [(clojure.core/into (ser-integer-min-1-max-3600 (:capture-interval input)) #:http.request.field{:name "CaptureInterval", :shape "__integerMin1Max3600", :location-name "captureInterval"})], :shape "FrameCaptureSettings", :type "structure"}))

(clojure.core/defn- ser-hls-program-date-time [input] #:http.request.field{:value (clojure.core/get {"EXCLUDE" "EXCLUDE", :exclude "EXCLUDE", "INCLUDE" "INCLUDE", :include "INCLUDE"} input), :shape "HlsProgramDateTime"})

(clojure.core/defn- ser-output-destination-settings [input] (clojure.core/cond-> #:http.request.field{:value [], :shape "OutputDestinationSettings", :type "structure"} (clojure.core/contains? input :password-param) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-string (input :password-param)) #:http.request.field{:name "PasswordParam", :shape "__string", :location-name "passwordParam"})) (clojure.core/contains? input :stream-name) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-string (input :stream-name)) #:http.request.field{:name "StreamName", :shape "__string", :location-name "streamName"})) (clojure.core/contains? input :url) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-string (input :url)) #:http.request.field{:name "Url", :shape "__string", :location-name "url"})) (clojure.core/contains? input :username) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-string (input :username)) #:http.request.field{:name "Username", :shape "__string", :location-name "username"}))))

(clojure.core/defn- ser-fixed-afd [input] #:http.request.field{:value (clojure.core/get {"AFD_0010" "AFD_0010", "AFD_1101" "AFD_1101", :afd-1101 "AFD_1101", "AFD_1000" "AFD_1000", :afd-1000 "AFD_1000", :afd-1111 "AFD_1111", :afd-1011 "AFD_1011", :afd-1010 "AFD_1010", "AFD_1111" "AFD_1111", "AFD_0000" "AFD_0000", :afd-0100 "AFD_0100", "AFD_1011" "AFD_1011", :afd-0011 "AFD_0011", "AFD_0011" "AFD_0011", "AFD_1001" "AFD_1001", :afd-0000 "AFD_0000", "AFD_0100" "AFD_0100", :afd-1110 "AFD_1110", :afd-0010 "AFD_0010", "AFD_1010" "AFD_1010", "AFD_1110" "AFD_1110", :afd-1001 "AFD_1001"} input), :shape "FixedAfd"})

(clojure.core/defn- ser-hls-ts-file-mode [input] #:http.request.field{:value (clojure.core/get {"SEGMENTED_FILES" "SEGMENTED_FILES", :segmented-files "SEGMENTED_FILES", "SINGLE_FILE" "SINGLE_FILE", :single-file "SINGLE_FILE"} input), :shape "HlsTsFileMode"})

(clojure.core/defn- ser-scte-35-segmentation-descriptor [input] (clojure.core/cond-> #:http.request.field{:value [(clojure.core/into (ser-integer-min-0-max-4294967295 (:segmentation-event-id input)) #:http.request.field{:name "SegmentationEventId", :shape "__integerMin0Max4294967295", :location-name "segmentationEventId"}) (clojure.core/into (ser-scte-35-segmentation-cancel-indicator (:segmentation-cancel-indicator input)) #:http.request.field{:name "SegmentationCancelIndicator", :shape "Scte35SegmentationCancelIndicator", :location-name "segmentationCancelIndicator"})], :shape "Scte35SegmentationDescriptor", :type "structure"} (clojure.core/contains? input :sub-segment-num) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-integer-min-0-max-255 (input :sub-segment-num)) #:http.request.field{:name "SubSegmentNum", :shape "__integerMin0Max255", :location-name "subSegmentNum"})) (clojure.core/contains? input :segmentation-duration) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-integer-min-0-max-1099511627775 (input :segmentation-duration)) #:http.request.field{:name "SegmentationDuration", :shape "__integerMin0Max1099511627775", :location-name "segmentationDuration"})) (clojure.core/contains? input :segmentation-type-id) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-integer-min-0-max-255 (input :segmentation-type-id)) #:http.request.field{:name "SegmentationTypeId", :shape "__integerMin0Max255", :location-name "segmentationTypeId"})) (clojure.core/contains? input :segmentation-upid) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-string (input :segmentation-upid)) #:http.request.field{:name "SegmentationUpid", :shape "__string", :location-name "segmentationUpid"})) (clojure.core/contains? input :segmentation-upid-type) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-integer-min-0-max-255 (input :segmentation-upid-type)) #:http.request.field{:name "SegmentationUpidType", :shape "__integerMin0Max255", :location-name "segmentationUpidType"})) (clojure.core/contains? input :segments-expected) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-integer-min-0-max-255 (input :segments-expected)) #:http.request.field{:name "SegmentsExpected", :shape "__integerMin0Max255", :location-name "segmentsExpected"})) (clojure.core/contains? input :sub-segments-expected) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-integer-min-0-max-255 (input :sub-segments-expected)) #:http.request.field{:name "SubSegmentsExpected", :shape "__integerMin0Max255", :location-name "subSegmentsExpected"})) (clojure.core/contains? input :segment-num) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-integer-min-0-max-255 (input :segment-num)) #:http.request.field{:name "SegmentNum", :shape "__integerMin0Max255", :location-name "segmentNum"})) (clojure.core/contains? input :delivery-restrictions) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-scte-35-delivery-restrictions (input :delivery-restrictions)) #:http.request.field{:name "DeliveryRestrictions", :shape "Scte35DeliveryRestrictions", :location-name "deliveryRestrictions"}))))

(clojure.core/defn- ser-hls-iv-in-manifest [input] #:http.request.field{:value (clojure.core/get {"EXCLUDE" "EXCLUDE", :exclude "EXCLUDE", "INCLUDE" "INCLUDE", :include "INCLUDE"} input), :shape "HlsIvInManifest"})

(clojure.core/defn- ser-list-of-caption-language-mapping [input] #:http.request.field{:value (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (clojure.core/merge (ser-caption-language-mapping coll) #:http.request.field{:shape "CaptionLanguageMapping"}))) input), :shape "__listOfCaptionLanguageMapping", :type "list"})

(clojure.core/defn- ser-audio-codec-settings [input] (clojure.core/cond-> #:http.request.field{:value [], :shape "AudioCodecSettings", :type "structure"} (clojure.core/contains? input :aac-settings) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-aac-settings (input :aac-settings)) #:http.request.field{:name "AacSettings", :shape "AacSettings", :location-name "aacSettings"})) (clojure.core/contains? input :ac-3-settings) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-ac-3-settings (input :ac-3-settings)) #:http.request.field{:name "Ac3Settings", :shape "Ac3Settings", :location-name "ac3Settings"})) (clojure.core/contains? input :eac-3-settings) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-eac-3-settings (input :eac-3-settings)) #:http.request.field{:name "Eac3Settings", :shape "Eac3Settings", :location-name "eac3Settings"})) (clojure.core/contains? input :mp-2-settings) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-mp-2-settings (input :mp-2-settings)) #:http.request.field{:name "Mp2Settings", :shape "Mp2Settings", :location-name "mp2Settings"})) (clojure.core/contains? input :pass-through-settings) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-pass-through-settings (input :pass-through-settings)) #:http.request.field{:name "PassThroughSettings", :shape "PassThroughSettings", :location-name "passThroughSettings"}))))

(clojure.core/defn- ser-scte-20-plus-embedded-destination-settings [input] (clojure.core/cond-> #:http.request.field{:value [], :shape "Scte20PlusEmbeddedDestinationSettings", :type "structure"}))

(clojure.core/defn- ser-scte-35-web-delivery-allowed-flag [input] #:http.request.field{:value (clojure.core/get {"WEB_DELIVERY_NOT_ALLOWED" "WEB_DELIVERY_NOT_ALLOWED", :web-delivery-not-allowed "WEB_DELIVERY_NOT_ALLOWED", "WEB_DELIVERY_ALLOWED" "WEB_DELIVERY_ALLOWED", :web-delivery-allowed "WEB_DELIVERY_ALLOWED"} input), :shape "Scte35WebDeliveryAllowedFlag"})

(clojure.core/defn- ser-scte-35-return-to-network-schedule-action-settings [input] (clojure.core/cond-> #:http.request.field{:value [(clojure.core/into (ser-integer-min-0-max-4294967295 (:splice-event-id input)) #:http.request.field{:name "SpliceEventId", :shape "__integerMin0Max4294967295", :location-name "spliceEventId"})], :shape "Scte35ReturnToNetworkScheduleActionSettings", :type "structure"}))

(clojure.core/defn- ser-integer-min-1-max-32 [input] #:http.request.field{:value input, :shape "__integerMin1Max32"})

(clojure.core/defn- ser-burn-in-outline-color [input] #:http.request.field{:value (clojure.core/get {:white "WHITE", :yellow "YELLOW", :green "GREEN", "GREEN" "GREEN", "BLUE" "BLUE", :red "RED", :blue "BLUE", "WHITE" "WHITE", "YELLOW" "YELLOW", "BLACK" "BLACK", "RED" "RED", :black "BLACK"} input), :shape "BurnInOutlineColor"})

(clojure.core/defn- ser-h-264-timecode-insertion-behavior [input] #:http.request.field{:value (clojure.core/get {"DISABLED" "DISABLED", :disabled "DISABLED", "PIC_TIMING_SEI" "PIC_TIMING_SEI", :pic-timing-sei "PIC_TIMING_SEI"} input), :shape "H264TimecodeInsertionBehavior"})

(clojure.core/defn- ser-eac-3-passthrough-control [input] #:http.request.field{:value (clojure.core/get {"NO_PASSTHROUGH" "NO_PASSTHROUGH", :no-passthrough "NO_PASSTHROUGH", "WHEN_POSSIBLE" "WHEN_POSSIBLE", :when-possible "WHEN_POSSIBLE"} input), :shape "Eac3PassthroughControl"})

(clojure.core/defn- ser-input-settings [input] (clojure.core/cond-> #:http.request.field{:value [], :shape "InputSettings", :type "structure"} (clojure.core/contains? input :input-filter) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-input-filter (input :input-filter)) #:http.request.field{:name "InputFilter", :shape "InputFilter", :location-name "inputFilter"})) (clojure.core/contains? input :denoise-filter) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-input-denoise-filter (input :denoise-filter)) #:http.request.field{:name "DenoiseFilter", :shape "InputDenoiseFilter", :location-name "denoiseFilter"})) (clojure.core/contains? input :source-end-behavior) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-input-source-end-behavior (input :source-end-behavior)) #:http.request.field{:name "SourceEndBehavior", :shape "InputSourceEndBehavior", :location-name "sourceEndBehavior"})) (clojure.core/contains? input :filter-strength) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-integer-min-1-max-5 (input :filter-strength)) #:http.request.field{:name "FilterStrength", :shape "__integerMin1Max5", :location-name "filterStrength"})) (clojure.core/contains? input :caption-selectors) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-list-of-caption-selector (input :caption-selectors)) #:http.request.field{:name "CaptionSelectors", :shape "__listOfCaptionSelector", :location-name "captionSelectors"})) (clojure.core/contains? input :video-selector) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-video-selector (input :video-selector)) #:http.request.field{:name "VideoSelector", :shape "VideoSelector", :location-name "videoSelector"})) (clojure.core/contains? input :network-input-settings) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-network-input-settings (input :network-input-settings)) #:http.request.field{:name "NetworkInputSettings", :shape "NetworkInputSettings", :location-name "networkInputSettings"})) (clojure.core/contains? input :audio-selectors) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-list-of-audio-selector (input :audio-selectors)) #:http.request.field{:name "AudioSelectors", :shape "__listOfAudioSelector", :location-name "audioSelectors"})) (clojure.core/contains? input :deblock-filter) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-input-deblock-filter (input :deblock-filter)) #:http.request.field{:name "DeblockFilter", :shape "InputDeblockFilter", :location-name "deblockFilter"}))))

(clojure.core/defn- ser-integer-min-1-max-31 [input] #:http.request.field{:value input, :shape "__integerMin1Max31"})

(clojure.core/defn- ser-audio-normalization-settings [input] (clojure.core/cond-> #:http.request.field{:value [], :shape "AudioNormalizationSettings", :type "structure"} (clojure.core/contains? input :algorithm) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-audio-normalization-algorithm (input :algorithm)) #:http.request.field{:name "Algorithm", :shape "AudioNormalizationAlgorithm", :location-name "algorithm"})) (clojure.core/contains? input :algorithm-control) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-audio-normalization-algorithm-control (input :algorithm-control)) #:http.request.field{:name "AlgorithmControl", :shape "AudioNormalizationAlgorithmControl", :location-name "algorithmControl"})) (clojure.core/contains? input :target-lkfs) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-double-min-negative-59-max-0 (input :target-lkfs)) #:http.request.field{:name "TargetLkfs", :shape "__doubleMinNegative59Max0", :location-name "targetLkfs"}))))

(clojure.core/defn- ser-key-provider-settings [input] (clojure.core/cond-> #:http.request.field{:value [], :shape "KeyProviderSettings", :type "structure"} (clojure.core/contains? input :static-key-settings) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-static-key-settings (input :static-key-settings)) #:http.request.field{:name "StaticKeySettings", :shape "StaticKeySettings", :location-name "staticKeySettings"}))))

(clojure.core/defn- ser-list-of-scte-35-descriptor [input] #:http.request.field{:value (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (clojure.core/merge (ser-scte-35-descriptor coll) #:http.request.field{:shape "Scte35Descriptor"}))) input), :shape "__listOfScte35Descriptor", :type "list"})

(clojure.core/defn- ser-caption-selector-settings [input] (clojure.core/cond-> #:http.request.field{:value [], :shape "CaptionSelectorSettings", :type "structure"} (clojure.core/contains? input :arib-source-settings) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-arib-source-settings (input :arib-source-settings)) #:http.request.field{:name "AribSourceSettings", :shape "AribSourceSettings", :location-name "aribSourceSettings"})) (clojure.core/contains? input :dvb-sub-source-settings) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-dvb-sub-source-settings (input :dvb-sub-source-settings)) #:http.request.field{:name "DvbSubSourceSettings", :shape "DvbSubSourceSettings", :location-name "dvbSubSourceSettings"})) (clojure.core/contains? input :embedded-source-settings) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-embedded-source-settings (input :embedded-source-settings)) #:http.request.field{:name "EmbeddedSourceSettings", :shape "EmbeddedSourceSettings", :location-name "embeddedSourceSettings"})) (clojure.core/contains? input :scte-20-source-settings) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-scte-20-source-settings (input :scte-20-source-settings)) #:http.request.field{:name "Scte20SourceSettings", :shape "Scte20SourceSettings", :location-name "scte20SourceSettings"})) (clojure.core/contains? input :scte-27-source-settings) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-scte-27-source-settings (input :scte-27-source-settings)) #:http.request.field{:name "Scte27SourceSettings", :shape "Scte27SourceSettings", :location-name "scte27SourceSettings"})) (clojure.core/contains? input :teletext-source-settings) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-teletext-source-settings (input :teletext-source-settings)) #:http.request.field{:name "TeletextSourceSettings", :shape "TeletextSourceSettings", :location-name "teletextSourceSettings"}))))

(clojure.core/defn- ser-h-264-settings [input] (clojure.core/cond-> #:http.request.field{:value [], :shape "H264Settings", :type "structure"} (clojure.core/contains? input :level) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-h-264-level (input :level)) #:http.request.field{:name "Level", :shape "H264Level", :location-name "level"})) (clojure.core/contains? input :rate-control-mode) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-h-264-rate-control-mode (input :rate-control-mode)) #:http.request.field{:name "RateControlMode", :shape "H264RateControlMode", :location-name "rateControlMode"})) (clojure.core/contains? input :subgop-length) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-h-264-sub-gop-length (input :subgop-length)) #:http.request.field{:name "SubgopLength", :shape "H264SubGopLength", :location-name "subgopLength"})) (clojure.core/contains? input :min-i-interval) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-integer-min-0-max-30 (input :min-i-interval)) #:http.request.field{:name "MinIInterval", :shape "__integerMin0Max30", :location-name "minIInterval"})) (clojure.core/contains? input :temporal-aq) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-h-264-temporal-aq (input :temporal-aq)) #:http.request.field{:name "TemporalAq", :shape "H264TemporalAq", :location-name "temporalAq"})) (clojure.core/contains? input :par-denominator) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-integer-min-1 (input :par-denominator)) #:http.request.field{:name "ParDenominator", :shape "__integerMin1", :location-name "parDenominator"})) (clojure.core/contains? input :qvbr-quality-level) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-integer-min-1-max-10 (input :qvbr-quality-level)) #:http.request.field{:name "QvbrQualityLevel", :shape "__integerMin1Max10", :location-name "qvbrQualityLevel"})) (clojure.core/contains? input :num-ref-frames) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-integer-min-1-max-6 (input :num-ref-frames)) #:http.request.field{:name "NumRefFrames", :shape "__integerMin1Max6", :location-name "numRefFrames"})) (clojure.core/contains? input :gop-b-reference) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-h-264-gop-b-reference (input :gop-b-reference)) #:http.request.field{:name "GopBReference", :shape "H264GopBReference", :location-name "gopBReference"})) (clojure.core/contains? input :timecode-insertion) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-h-264-timecode-insertion-behavior (input :timecode-insertion)) #:http.request.field{:name "TimecodeInsertion", :shape "H264TimecodeInsertionBehavior", :location-name "timecodeInsertion"})) (clojure.core/contains? input :scan-type) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-h-264-scan-type (input :scan-type)) #:http.request.field{:name "ScanType", :shape "H264ScanType", :location-name "scanType"})) (clojure.core/contains? input :adaptive-quantization) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-h-264-adaptive-quantization (input :adaptive-quantization)) #:http.request.field{:name "AdaptiveQuantization", :shape "H264AdaptiveQuantization", :location-name "adaptiveQuantization"})) (clojure.core/contains? input :afd-signaling) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-afd-signaling (input :afd-signaling)) #:http.request.field{:name "AfdSignaling", :shape "AfdSignaling", :location-name "afdSignaling"})) (clojure.core/contains? input :buf-fill-pct) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-integer-min-0-max-100 (input :buf-fill-pct)) #:http.request.field{:name "BufFillPct", :shape "__integerMin0Max100", :location-name "bufFillPct"})) (clojure.core/contains? input :framerate-denominator) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-integer-min-1 (input :framerate-denominator)) #:http.request.field{:name "FramerateDenominator", :shape "__integerMin1", :location-name "framerateDenominator"})) (clojure.core/contains? input :spatial-aq) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-h-264-spatial-aq (input :spatial-aq)) #:http.request.field{:name "SpatialAq", :shape "H264SpatialAq", :location-name "spatialAq"})) (clojure.core/contains? input :framerate-control) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-h-264-framerate-control (input :framerate-control)) #:http.request.field{:name "FramerateControl", :shape "H264FramerateControl", :location-name "framerateControl"})) (clojure.core/contains? input :gop-num-b-frames) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-integer-min-0-max-7 (input :gop-num-b-frames)) #:http.request.field{:name "GopNumBFrames", :shape "__integerMin0Max7", :location-name "gopNumBFrames"})) (clojure.core/contains? input :buf-size) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-integer-min-0 (input :buf-size)) #:http.request.field{:name "BufSize", :shape "__integerMin0", :location-name "bufSize"})) (clojure.core/contains? input :profile) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-h-264-profile (input :profile)) #:http.request.field{:name "Profile", :shape "H264Profile", :location-name "profile"})) (clojure.core/contains? input :color-metadata) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-h-264-color-metadata (input :color-metadata)) #:http.request.field{:name "ColorMetadata", :shape "H264ColorMetadata", :location-name "colorMetadata"})) (clojure.core/contains? input :look-ahead-rate-control) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-h-264-look-ahead-rate-control (input :look-ahead-rate-control)) #:http.request.field{:name "LookAheadRateControl", :shape "H264LookAheadRateControl", :location-name "lookAheadRateControl"})) (clojure.core/contains? input :syntax) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-h-264-syntax (input :syntax)) #:http.request.field{:name "Syntax", :shape "H264Syntax", :location-name "syntax"})) (clojure.core/contains? input :gop-closed-cadence) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-integer-min-0 (input :gop-closed-cadence)) #:http.request.field{:name "GopClosedCadence", :shape "__integerMin0", :location-name "gopClosedCadence"})) (clojure.core/contains? input :flicker-aq) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-h-264-flicker-aq (input :flicker-aq)) #:http.request.field{:name "FlickerAq", :shape "H264FlickerAq", :location-name "flickerAq"})) (clojure.core/contains? input :framerate-numerator) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-integer-min-1 (input :framerate-numerator)) #:http.request.field{:name "FramerateNumerator", :shape "__integerMin1", :location-name "framerateNumerator"})) (clojure.core/contains? input :softness) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-integer-min-0-max-128 (input :softness)) #:http.request.field{:name "Softness", :shape "__integerMin0Max128", :location-name "softness"})) (clojure.core/contains? input :gop-size-units) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-h-264-gop-size-units (input :gop-size-units)) #:http.request.field{:name "GopSizeUnits", :shape "H264GopSizeUnits", :location-name "gopSizeUnits"})) (clojure.core/contains? input :max-bitrate) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-integer-min-1000 (input :max-bitrate)) #:http.request.field{:name "MaxBitrate", :shape "__integerMin1000", :location-name "maxBitrate"})) (clojure.core/contains? input :par-numerator) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-integer (input :par-numerator)) #:http.request.field{:name "ParNumerator", :shape "__integer", :location-name "parNumerator"})) (clojure.core/contains? input :gop-size) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-double-min-1 (input :gop-size)) #:http.request.field{:name "GopSize", :shape "__doubleMin1", :location-name "gopSize"})) (clojure.core/contains? input :par-control) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-h-264-par-control (input :par-control)) #:http.request.field{:name "ParControl", :shape "H264ParControl", :location-name "parControl"})) (clojure.core/contains? input :slices) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-integer-min-1-max-32 (input :slices)) #:http.request.field{:name "Slices", :shape "__integerMin1Max32", :location-name "slices"})) (clojure.core/contains? input :fixed-afd) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-fixed-afd (input :fixed-afd)) #:http.request.field{:name "FixedAfd", :shape "FixedAfd", :location-name "fixedAfd"})) (clojure.core/contains? input :entropy-encoding) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-h-264-entropy-encoding (input :entropy-encoding)) #:http.request.field{:name "EntropyEncoding", :shape "H264EntropyEncoding", :location-name "entropyEncoding"})) (clojure.core/contains? input :scene-change-detect) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-h-264-scene-change-detect (input :scene-change-detect)) #:http.request.field{:name "SceneChangeDetect", :shape "H264SceneChangeDetect", :location-name "sceneChangeDetect"})) (clojure.core/contains? input :bitrate) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-integer-min-1000 (input :bitrate)) #:http.request.field{:name "Bitrate", :shape "__integerMin1000", :location-name "bitrate"}))))

(clojure.core/defn- ser-hls-timed-metadata-id-3-frame [input] #:http.request.field{:value (clojure.core/get {"NONE" "NONE", :none "NONE", "PRIV" "PRIV", :priv "PRIV", "TDRL" "TDRL", :tdrl "TDRL"} input), :shape "HlsTimedMetadataId3Frame"})

(clojure.core/defn- ser-eac-3-phase-control [input] #:http.request.field{:value (clojure.core/get {"NO_SHIFT" "NO_SHIFT", :no-shift "NO_SHIFT", "SHIFT_90_DEGREES" "SHIFT_90_DEGREES", :shift-90-degrees "SHIFT_90_DEGREES"} input), :shape "Eac3PhaseControl"})

(clojure.core/defn- ser-eac-3-surround-ex-mode [input] #:http.request.field{:value (clojure.core/get {"DISABLED" "DISABLED", :disabled "DISABLED", "ENABLED" "ENABLED", :enabled "ENABLED", "NOT_INDICATED" "NOT_INDICATED", :not-indicated "NOT_INDICATED"} input), :shape "Eac3SurroundExMode"})

(clojure.core/defn- ser-integer-min-1-max-8 [input] #:http.request.field{:value input, :shape "__integerMin1Max8"})

(clojure.core/defn- ser-smooth-group-segmentation-mode [input] #:http.request.field{:value (clojure.core/get {"USE_INPUT_SEGMENTATION" "USE_INPUT_SEGMENTATION", :use-input-segmentation "USE_INPUT_SEGMENTATION", "USE_SEGMENT_DURATION" "USE_SEGMENT_DURATION", :use-segment-duration "USE_SEGMENT_DURATION"} input), :shape "SmoothGroupSegmentationMode"})

(clojure.core/defn- ser-list-of-audio-description [input] #:http.request.field{:value (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (clojure.core/merge (ser-audio-description coll) #:http.request.field{:shape "AudioDescription"}))) input), :shape "__listOfAudioDescription", :type "list"})

(clojure.core/defn- ser-hls-output-settings [input] (clojure.core/cond-> #:http.request.field{:value [(clojure.core/into (ser-hls-settings (:hls-settings input)) #:http.request.field{:name "HlsSettings", :shape "HlsSettings", :location-name "hlsSettings"})], :shape "HlsOutputSettings", :type "structure"} (clojure.core/contains? input :name-modifier) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-string-min-1 (input :name-modifier)) #:http.request.field{:name "NameModifier", :shape "__stringMin1", :location-name "nameModifier"})) (clojure.core/contains? input :segment-modifier) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-string (input :segment-modifier)) #:http.request.field{:name "SegmentModifier", :shape "__string", :location-name "segmentModifier"}))))

(clojure.core/defn- ser-scte-35-splice-insert-web-delivery-allowed-behavior [input] #:http.request.field{:value (clojure.core/get {"FOLLOW" "FOLLOW", :follow "FOLLOW", "IGNORE" "IGNORE", :ignore "IGNORE"} input), :shape "Scte35SpliceInsertWebDeliveryAllowedBehavior"})

(clojure.core/defn- ser-m-3u-8-settings [input] (clojure.core/cond-> #:http.request.field{:value [], :shape "M3u8Settings", :type "structure"} (clojure.core/contains? input :pat-interval) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-integer-min-0-max-1000 (input :pat-interval)) #:http.request.field{:name "PatInterval", :shape "__integerMin0Max1000", :location-name "patInterval"})) (clojure.core/contains? input :audio-frames-per-pes) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-integer-min-0 (input :audio-frames-per-pes)) #:http.request.field{:name "AudioFramesPerPes", :shape "__integerMin0", :location-name "audioFramesPerPes"})) (clojure.core/contains? input :transport-stream-id) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-integer-min-0-max-65535 (input :transport-stream-id)) #:http.request.field{:name "TransportStreamId", :shape "__integerMin0Max65535", :location-name "transportStreamId"})) (clojure.core/contains? input :scte-35-behavior) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-m-3u-8-scte-35-behavior (input :scte-35-behavior)) #:http.request.field{:name "Scte35Behavior", :shape "M3u8Scte35Behavior", :location-name "scte35Behavior"})) (clojure.core/contains? input :timed-metadata-behavior) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-m-3u-8-timed-metadata-behavior (input :timed-metadata-behavior)) #:http.request.field{:name "TimedMetadataBehavior", :shape "M3u8TimedMetadataBehavior", :location-name "timedMetadataBehavior"})) (clojure.core/contains? input :pcr-control) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-m-3u-8-pcr-control (input :pcr-control)) #:http.request.field{:name "PcrControl", :shape "M3u8PcrControl", :location-name "pcrControl"})) (clojure.core/contains? input :scte-35-pid) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-string (input :scte-35-pid)) #:http.request.field{:name "Scte35Pid", :shape "__string", :location-name "scte35Pid"})) (clojure.core/contains? input :pcr-pid) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-string (input :pcr-pid)) #:http.request.field{:name "PcrPid", :shape "__string", :location-name "pcrPid"})) (clojure.core/contains? input :pmt-pid) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-string (input :pmt-pid)) #:http.request.field{:name "PmtPid", :shape "__string", :location-name "pmtPid"})) (clojure.core/contains? input :video-pid) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-string (input :video-pid)) #:http.request.field{:name "VideoPid", :shape "__string", :location-name "videoPid"})) (clojure.core/contains? input :audio-pids) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-string (input :audio-pids)) #:http.request.field{:name "AudioPids", :shape "__string", :location-name "audioPids"})) (clojure.core/contains? input :pcr-period) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-integer-min-0-max-500 (input :pcr-period)) #:http.request.field{:name "PcrPeriod", :shape "__integerMin0Max500", :location-name "pcrPeriod"})) (clojure.core/contains? input :pmt-interval) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-integer-min-0-max-1000 (input :pmt-interval)) #:http.request.field{:name "PmtInterval", :shape "__integerMin0Max1000", :location-name "pmtInterval"})) (clojure.core/contains? input :program-num) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-integer-min-0-max-65535 (input :program-num)) #:http.request.field{:name "ProgramNum", :shape "__integerMin0Max65535", :location-name "programNum"})) (clojure.core/contains? input :timed-metadata-pid) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-string (input :timed-metadata-pid)) #:http.request.field{:name "TimedMetadataPid", :shape "__string", :location-name "timedMetadataPid"})) (clojure.core/contains? input :ecm-pid) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-string (input :ecm-pid)) #:http.request.field{:name "EcmPid", :shape "__string", :location-name "ecmPid"}))))

(clojure.core/defn- ser-string-min-1-max-255 [input] #:http.request.field{:value input, :shape "__stringMin1Max255"})

(clojure.core/defn- ser-list-of-audio-channel-mapping [input] #:http.request.field{:value (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (clojure.core/merge (ser-audio-channel-mapping coll) #:http.request.field{:shape "AudioChannelMapping"}))) input), :shape "__listOfAudioChannelMapping", :type "list"})

(clojure.core/defn- ser-list-of-media-connect-flow-request [input] #:http.request.field{:value (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (clojure.core/merge (ser-media-connect-flow-request coll) #:http.request.field{:shape "MediaConnectFlowRequest"}))) input), :shape "__listOfMediaConnectFlowRequest", :type "list"})

(clojure.core/defn- ser-eac-3-stereo-downmix [input] #:http.request.field{:value (clojure.core/get {"DPL2" "DPL2", :dpl-2 "DPL2", "LO_RO" "LO_RO", :lo-ro "LO_RO", "LT_RT" "LT_RT", :lt-rt "LT_RT", "NOT_INDICATED" "NOT_INDICATED", :not-indicated "NOT_INDICATED"} input), :shape "Eac3StereoDownmix"})

(clojure.core/defn- ser-integer-min-0-max-128 [input] #:http.request.field{:value input, :shape "__integerMin0Max128"})

(clojure.core/defn- ser-integer-min-0-max-1000000 [input] #:http.request.field{:value input, :shape "__integerMin0Max1000000"})

(clojure.core/defn- ser-h-264-syntax [input] #:http.request.field{:value (clojure.core/get {"DEFAULT" "DEFAULT", :default "DEFAULT", "RP2027" "RP2027", :rp-2027 "RP2027"} input), :shape "H264Syntax"})

(clojure.core/defn- ser-string-min-32-max-32 [input] #:http.request.field{:value input, :shape "__stringMin32Max32"})

(clojure.core/defn- ser-input-resolution [input] #:http.request.field{:value (clojure.core/get {"SD" "SD", :sd "SD", "HD" "HD", :hd "HD", "UHD" "UHD", :uhd "UHD"} input), :shape "InputResolution"})

(clojure.core/defn- ser-scte-20-convert-608-to-708 [input] #:http.request.field{:value (clojure.core/get {"DISABLED" "DISABLED", :disabled "DISABLED", "UPCONVERT" "UPCONVERT", :upconvert "UPCONVERT"} input), :shape "Scte20Convert608To708"})

(clojure.core/defn- ser-h-264-flicker-aq [input] #:http.request.field{:value (clojure.core/get {"DISABLED" "DISABLED", :disabled "DISABLED", "ENABLED" "ENABLED", :enabled "ENABLED"} input), :shape "H264FlickerAq"})

(clojure.core/defn- ser-hls-codec-specification [input] #:http.request.field{:value (clojure.core/get {"RFC_4281" "RFC_4281", :rfc-4281 "RFC_4281", "RFC_6381" "RFC_6381", :rfc-6381 "RFC_6381"} input), :shape "HlsCodecSpecification"})

(clojure.core/defn- ser-avail-blanking [input] (clojure.core/cond-> #:http.request.field{:value [], :shape "AvailBlanking", :type "structure"} (clojure.core/contains? input :avail-blanking-image) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-input-location (input :avail-blanking-image)) #:http.request.field{:name "AvailBlankingImage", :shape "InputLocation", :location-name "availBlankingImage"})) (clojure.core/contains? input :state) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-avail-blanking-state (input :state)) #:http.request.field{:name "State", :shape "AvailBlankingState", :location-name "state"}))))

(clojure.core/defn- ser-m-2ts-audio-stream-type [input] #:http.request.field{:value (clojure.core/get {"ATSC" "ATSC", :atsc "ATSC", "DVB" "DVB", :dvb "DVB"} input), :shape "M2tsAudioStreamType"})

(clojure.core/defn- ser-string-min-34-max-34 [input] #:http.request.field{:value input, :shape "__stringMin34Max34"})

(clojure.core/defn- ser-audio-selector [input] (clojure.core/cond-> #:http.request.field{:value [(clojure.core/into (ser-string-min-1 (:name input)) #:http.request.field{:name "Name", :shape "__stringMin1", :location-name "name"})], :shape "AudioSelector", :type "structure"} (clojure.core/contains? input :selector-settings) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-audio-selector-settings (input :selector-settings)) #:http.request.field{:name "SelectorSettings", :shape "AudioSelectorSettings", :location-name "selectorSettings"}))))

(clojure.core/defn- ser-integer-min-1-max-16 [input] #:http.request.field{:value input, :shape "__integerMin1Max16"})

(clojure.core/defn- ser-hls-akamai-settings [input] (clojure.core/cond-> #:http.request.field{:value [], :shape "HlsAkamaiSettings", :type "structure"} (clojure.core/contains? input :connection-retry-interval) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-integer-min-0 (input :connection-retry-interval)) #:http.request.field{:name "ConnectionRetryInterval", :shape "__integerMin0", :location-name "connectionRetryInterval"})) (clojure.core/contains? input :filecache-duration) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-integer-min-0-max-600 (input :filecache-duration)) #:http.request.field{:name "FilecacheDuration", :shape "__integerMin0Max600", :location-name "filecacheDuration"})) (clojure.core/contains? input :http-transfer-mode) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-hls-akamai-http-transfer-mode (input :http-transfer-mode)) #:http.request.field{:name "HttpTransferMode", :shape "HlsAkamaiHttpTransferMode", :location-name "httpTransferMode"})) (clojure.core/contains? input :num-retries) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-integer-min-0 (input :num-retries)) #:http.request.field{:name "NumRetries", :shape "__integerMin0", :location-name "numRetries"})) (clojure.core/contains? input :restart-delay) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-integer-min-0-max-15 (input :restart-delay)) #:http.request.field{:name "RestartDelay", :shape "__integerMin0Max15", :location-name "restartDelay"})) (clojure.core/contains? input :salt) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-string (input :salt)) #:http.request.field{:name "Salt", :shape "__string", :location-name "salt"})) (clojure.core/contains? input :token) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-string (input :token)) #:http.request.field{:name "Token", :shape "__string", :location-name "token"}))))

(clojure.core/defn- req-describe-schedule-request [input] (clojure.core/cond-> #:http.request.configuration{:uri [(clojure.core/into (ser-string (input :channel-id)) #:http.request.field{:name "ChannelId", :shape "__string", :location "uri", :location-name "channelId"})]} (clojure.core/contains? input :max-results) (clojure.core/update-in [:http.request.configuration/querystring] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-max-results (input :max-results)) #:http.request.field{:name "MaxResults", :shape "MaxResults", :location "querystring", :location-name "maxResults"})) (clojure.core/contains? input :next-token) (clojure.core/update-in [:http.request.configuration/querystring] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-string (input :next-token)) #:http.request.field{:name "NextToken", :shape "__string", :location "querystring", :location-name "nextToken"}))))

(clojure.core/defn- req-update-channel-request [input] (clojure.core/cond-> #:http.request.configuration{:uri [(clojure.core/into (ser-string (input :channel-id)) #:http.request.field{:name "ChannelId", :shape "__string", :location "uri", :location-name "channelId"})]} (clojure.core/contains? input :destinations) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-list-of-output-destination (input :destinations)) #:http.request.field{:name "Destinations", :shape "__listOfOutputDestination", :location-name "destinations"})) (clojure.core/contains? input :encoder-settings) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-encoder-settings (input :encoder-settings)) #:http.request.field{:name "EncoderSettings", :shape "EncoderSettings", :location-name "encoderSettings"})) (clojure.core/contains? input :input-attachments) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-list-of-input-attachment (input :input-attachments)) #:http.request.field{:name "InputAttachments", :shape "__listOfInputAttachment", :location-name "inputAttachments"})) (clojure.core/contains? input :input-specification) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-input-specification (input :input-specification)) #:http.request.field{:name "InputSpecification", :shape "InputSpecification", :location-name "inputSpecification"})) (clojure.core/contains? input :log-level) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-log-level (input :log-level)) #:http.request.field{:name "LogLevel", :shape "LogLevel", :location-name "logLevel"})) (clojure.core/contains? input :name) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-string (input :name)) #:http.request.field{:name "Name", :shape "__string", :location-name "name"})) (clojure.core/contains? input :role-arn) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-string (input :role-arn)) #:http.request.field{:name "RoleArn", :shape "__string", :location-name "roleArn"}))))

(clojure.core/defn- req-update-input-security-group-request [input] (clojure.core/cond-> #:http.request.configuration{:uri [(clojure.core/into (ser-string (input :input-security-group-id)) #:http.request.field{:name "InputSecurityGroupId", :shape "__string", :location "uri", :location-name "inputSecurityGroupId"})]} (clojure.core/contains? input :tags) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-tags (input :tags)) #:http.request.field{:name "Tags", :shape "Tags", :location-name "tags"})) (clojure.core/contains? input :whitelist-rules) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-list-of-input-whitelist-rule-cidr (input :whitelist-rules)) #:http.request.field{:name "WhitelistRules", :shape "__listOfInputWhitelistRuleCidr", :location-name "whitelistRules"}))))

(clojure.core/defn- req-describe-input-security-group-request [input] (clojure.core/cond-> #:http.request.configuration{:uri [(clojure.core/into (ser-string (input :input-security-group-id)) #:http.request.field{:name "InputSecurityGroupId", :shape "__string", :location "uri", :location-name "inputSecurityGroupId"})]}))

(clojure.core/defn- req-delete-reservation-request [input] (clojure.core/cond-> #:http.request.configuration{:uri [(clojure.core/into (ser-string (input :reservation-id)) #:http.request.field{:name "ReservationId", :shape "__string", :location "uri", :location-name "reservationId"})]}))

(clojure.core/defn- req-list-tags-for-resource-request [input] (clojure.core/cond-> #:http.request.configuration{:uri [(clojure.core/into (ser-string (input :resource-arn)) #:http.request.field{:name "ResourceArn", :shape "__string", :location "uri", :location-name "resource-arn"})]}))

(clojure.core/defn- req-delete-tags-request [input] (clojure.core/cond-> #:http.request.configuration{:querystring [(clojure.core/into (ser-list-of-string (input :tag-keys)) #:http.request.field{:name "TagKeys", :shape "__listOf__string", :location "querystring", :location-name "tagKeys"})], :uri [(clojure.core/into (ser-string (input :resource-arn)) #:http.request.field{:name "ResourceArn", :shape "__string", :location "uri", :location-name "resource-arn"})]}))

(clojure.core/defn- req-update-input-request [input] (clojure.core/cond-> #:http.request.configuration{:uri [(clojure.core/into (ser-string (input :input-id)) #:http.request.field{:name "InputId", :shape "__string", :location "uri", :location-name "inputId"})]} (clojure.core/contains? input :destinations) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-list-of-input-destination-request (input :destinations)) #:http.request.field{:name "Destinations", :shape "__listOfInputDestinationRequest", :location-name "destinations"})) (clojure.core/contains? input :input-security-groups) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-list-of-string (input :input-security-groups)) #:http.request.field{:name "InputSecurityGroups", :shape "__listOf__string", :location-name "inputSecurityGroups"})) (clojure.core/contains? input :media-connect-flows) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-list-of-media-connect-flow-request (input :media-connect-flows)) #:http.request.field{:name "MediaConnectFlows", :shape "__listOfMediaConnectFlowRequest", :location-name "mediaConnectFlows"})) (clojure.core/contains? input :name) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-string (input :name)) #:http.request.field{:name "Name", :shape "__string", :location-name "name"})) (clojure.core/contains? input :role-arn) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-string (input :role-arn)) #:http.request.field{:name "RoleArn", :shape "__string", :location-name "roleArn"})) (clojure.core/contains? input :sources) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-list-of-input-source-request (input :sources)) #:http.request.field{:name "Sources", :shape "__listOfInputSourceRequest", :location-name "sources"}))))

(clojure.core/defn- req-delete-input-security-group-request [input] (clojure.core/cond-> #:http.request.configuration{:uri [(clojure.core/into (ser-string (input :input-security-group-id)) #:http.request.field{:name "InputSecurityGroupId", :shape "__string", :location "uri", :location-name "inputSecurityGroupId"})]}))

(clojure.core/defn- req-describe-reservation-request [input] (clojure.core/cond-> #:http.request.configuration{:uri [(clojure.core/into (ser-string (input :reservation-id)) #:http.request.field{:name "ReservationId", :shape "__string", :location "uri", :location-name "reservationId"})]}))

(clojure.core/defn- req-stop-channel-request [input] (clojure.core/cond-> #:http.request.configuration{:uri [(clojure.core/into (ser-string (input :channel-id)) #:http.request.field{:name "ChannelId", :shape "__string", :location "uri", :location-name "channelId"})]}))

(clojure.core/defn- req-list-input-security-groups-request [input] (clojure.core/cond-> {} (clojure.core/contains? input :max-results) (clojure.core/update-in [:http.request.configuration/querystring] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-max-results (input :max-results)) #:http.request.field{:name "MaxResults", :shape "MaxResults", :location "querystring", :location-name "maxResults"})) (clojure.core/contains? input :next-token) (clojure.core/update-in [:http.request.configuration/querystring] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-string (input :next-token)) #:http.request.field{:name "NextToken", :shape "__string", :location "querystring", :location-name "nextToken"}))))

(clojure.core/defn- req-create-channel-request [input] (clojure.core/cond-> {} (clojure.core/contains? input :reserved) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-string (input :reserved)) #:http.request.field{:name "Reserved", :shape "__string", :location-name "reserved", :deprecated true})) (clojure.core/contains? input :input-attachments) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-list-of-input-attachment (input :input-attachments)) #:http.request.field{:name "InputAttachments", :shape "__listOfInputAttachment", :location-name "inputAttachments"})) (clojure.core/contains? input :request-id) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-string (input :request-id)) #:http.request.field{:name "RequestId", :shape "__string", :location-name "requestId", :idempotency-token true})) (clojure.core/contains? input :log-level) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-log-level (input :log-level)) #:http.request.field{:name "LogLevel", :shape "LogLevel", :location-name "logLevel"})) (clojure.core/contains? input :role-arn) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-string (input :role-arn)) #:http.request.field{:name "RoleArn", :shape "__string", :location-name "roleArn"})) (clojure.core/contains? input :tags) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-tags (input :tags)) #:http.request.field{:name "Tags", :shape "Tags", :location-name "tags"})) (clojure.core/contains? input :encoder-settings) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-encoder-settings (input :encoder-settings)) #:http.request.field{:name "EncoderSettings", :shape "EncoderSettings", :location-name "encoderSettings"})) (clojure.core/contains? input :input-specification) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-input-specification (input :input-specification)) #:http.request.field{:name "InputSpecification", :shape "InputSpecification", :location-name "inputSpecification"})) (clojure.core/contains? input :destinations) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-list-of-output-destination (input :destinations)) #:http.request.field{:name "Destinations", :shape "__listOfOutputDestination", :location-name "destinations"})) (clojure.core/contains? input :name) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-string (input :name)) #:http.request.field{:name "Name", :shape "__string", :location-name "name"}))))

(clojure.core/defn- req-describe-input-request [input] (clojure.core/cond-> #:http.request.configuration{:uri [(clojure.core/into (ser-string (input :input-id)) #:http.request.field{:name "InputId", :shape "__string", :location "uri", :location-name "inputId"})]}))

(clojure.core/defn- req-create-tags-request [input] (clojure.core/cond-> #:http.request.configuration{:uri [(clojure.core/into (ser-string (input :resource-arn)) #:http.request.field{:name "ResourceArn", :shape "__string", :location "uri", :location-name "resource-arn"})]} (clojure.core/contains? input :tags) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-tags (input :tags)) #:http.request.field{:name "Tags", :shape "Tags", :location-name "tags"}))))

(clojure.core/defn- req-delete-input-request [input] (clojure.core/cond-> #:http.request.configuration{:uri [(clojure.core/into (ser-string (input :input-id)) #:http.request.field{:name "InputId", :shape "__string", :location "uri", :location-name "inputId"})]}))

(clojure.core/defn- req-list-offerings-request [input] (clojure.core/cond-> {} (clojure.core/contains? input :codec) (clojure.core/update-in [:http.request.configuration/querystring] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-string (input :codec)) #:http.request.field{:name "Codec", :shape "__string", :location "querystring", :location-name "codec"})) (clojure.core/contains? input :resolution) (clojure.core/update-in [:http.request.configuration/querystring] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-string (input :resolution)) #:http.request.field{:name "Resolution", :shape "__string", :location "querystring", :location-name "resolution"})) (clojure.core/contains? input :next-token) (clojure.core/update-in [:http.request.configuration/querystring] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-string (input :next-token)) #:http.request.field{:name "NextToken", :shape "__string", :location "querystring", :location-name "nextToken"})) (clojure.core/contains? input :maximum-bitrate) (clojure.core/update-in [:http.request.configuration/querystring] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-string (input :maximum-bitrate)) #:http.request.field{:name "MaximumBitrate", :shape "__string", :location "querystring", :location-name "maximumBitrate"})) (clojure.core/contains? input :resource-type) (clojure.core/update-in [:http.request.configuration/querystring] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-string (input :resource-type)) #:http.request.field{:name "ResourceType", :shape "__string", :location "querystring", :location-name "resourceType"})) (clojure.core/contains? input :max-results) (clojure.core/update-in [:http.request.configuration/querystring] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-max-results (input :max-results)) #:http.request.field{:name "MaxResults", :shape "MaxResults", :location "querystring", :location-name "maxResults"})) (clojure.core/contains? input :video-quality) (clojure.core/update-in [:http.request.configuration/querystring] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-string (input :video-quality)) #:http.request.field{:name "VideoQuality", :shape "__string", :location "querystring", :location-name "videoQuality"})) (clojure.core/contains? input :channel-configuration) (clojure.core/update-in [:http.request.configuration/querystring] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-string (input :channel-configuration)) #:http.request.field{:name "ChannelConfiguration", :shape "__string", :location "querystring", :location-name "channelConfiguration"})) (clojure.core/contains? input :special-feature) (clojure.core/update-in [:http.request.configuration/querystring] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-string (input :special-feature)) #:http.request.field{:name "SpecialFeature", :shape "__string", :location "querystring", :location-name "specialFeature"})) (clojure.core/contains? input :maximum-framerate) (clojure.core/update-in [:http.request.configuration/querystring] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-string (input :maximum-framerate)) #:http.request.field{:name "MaximumFramerate", :shape "__string", :location "querystring", :location-name "maximumFramerate"}))))

(clojure.core/defn- req-list-inputs-request [input] (clojure.core/cond-> {} (clojure.core/contains? input :max-results) (clojure.core/update-in [:http.request.configuration/querystring] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-max-results (input :max-results)) #:http.request.field{:name "MaxResults", :shape "MaxResults", :location "querystring", :location-name "maxResults"})) (clojure.core/contains? input :next-token) (clojure.core/update-in [:http.request.configuration/querystring] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-string (input :next-token)) #:http.request.field{:name "NextToken", :shape "__string", :location "querystring", :location-name "nextToken"}))))

(clojure.core/defn- req-purchase-offering-request [input] (clojure.core/cond-> #:http.request.configuration{:uri [(clojure.core/into (ser-string (input :offering-id)) #:http.request.field{:name "OfferingId", :shape "__string", :location "uri", :location-name "offeringId"})], :body [(clojure.core/into (ser-integer-min-1 (input :count)) #:http.request.field{:name "Count", :shape "__integerMin1", :location-name "count"})]} (clojure.core/contains? input :name) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-string (input :name)) #:http.request.field{:name "Name", :shape "__string", :location-name "name"})) (clojure.core/contains? input :request-id) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-string (input :request-id)) #:http.request.field{:name "RequestId", :shape "__string", :location-name "requestId", :idempotency-token true})) (clojure.core/contains? input :start) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-string (input :start)) #:http.request.field{:name "Start", :shape "__string", :location-name "start"}))))

(clojure.core/defn- req-delete-channel-request [input] (clojure.core/cond-> #:http.request.configuration{:uri [(clojure.core/into (ser-string (input :channel-id)) #:http.request.field{:name "ChannelId", :shape "__string", :location "uri", :location-name "channelId"})]}))

(clojure.core/defn- req-list-reservations-request [input] (clojure.core/cond-> {} (clojure.core/contains? input :codec) (clojure.core/update-in [:http.request.configuration/querystring] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-string (input :codec)) #:http.request.field{:name "Codec", :shape "__string", :location "querystring", :location-name "codec"})) (clojure.core/contains? input :resolution) (clojure.core/update-in [:http.request.configuration/querystring] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-string (input :resolution)) #:http.request.field{:name "Resolution", :shape "__string", :location "querystring", :location-name "resolution"})) (clojure.core/contains? input :next-token) (clojure.core/update-in [:http.request.configuration/querystring] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-string (input :next-token)) #:http.request.field{:name "NextToken", :shape "__string", :location "querystring", :location-name "nextToken"})) (clojure.core/contains? input :maximum-bitrate) (clojure.core/update-in [:http.request.configuration/querystring] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-string (input :maximum-bitrate)) #:http.request.field{:name "MaximumBitrate", :shape "__string", :location "querystring", :location-name "maximumBitrate"})) (clojure.core/contains? input :resource-type) (clojure.core/update-in [:http.request.configuration/querystring] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-string (input :resource-type)) #:http.request.field{:name "ResourceType", :shape "__string", :location "querystring", :location-name "resourceType"})) (clojure.core/contains? input :max-results) (clojure.core/update-in [:http.request.configuration/querystring] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-max-results (input :max-results)) #:http.request.field{:name "MaxResults", :shape "MaxResults", :location "querystring", :location-name "maxResults"})) (clojure.core/contains? input :video-quality) (clojure.core/update-in [:http.request.configuration/querystring] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-string (input :video-quality)) #:http.request.field{:name "VideoQuality", :shape "__string", :location "querystring", :location-name "videoQuality"})) (clojure.core/contains? input :special-feature) (clojure.core/update-in [:http.request.configuration/querystring] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-string (input :special-feature)) #:http.request.field{:name "SpecialFeature", :shape "__string", :location "querystring", :location-name "specialFeature"})) (clojure.core/contains? input :maximum-framerate) (clojure.core/update-in [:http.request.configuration/querystring] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-string (input :maximum-framerate)) #:http.request.field{:name "MaximumFramerate", :shape "__string", :location "querystring", :location-name "maximumFramerate"}))))

(clojure.core/defn- req-describe-channel-request [input] (clojure.core/cond-> #:http.request.configuration{:uri [(clojure.core/into (ser-string (input :channel-id)) #:http.request.field{:name "ChannelId", :shape "__string", :location "uri", :location-name "channelId"})]}))

(clojure.core/defn- req-batch-update-schedule-request [input] (clojure.core/cond-> #:http.request.configuration{:uri [(clojure.core/into (ser-string (input :channel-id)) #:http.request.field{:name "ChannelId", :shape "__string", :location "uri", :location-name "channelId"})]} (clojure.core/contains? input :creates) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-batch-schedule-action-create-request (input :creates)) #:http.request.field{:name "Creates", :shape "BatchScheduleActionCreateRequest", :location-name "creates"})) (clojure.core/contains? input :deletes) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-batch-schedule-action-delete-request (input :deletes)) #:http.request.field{:name "Deletes", :shape "BatchScheduleActionDeleteRequest", :location-name "deletes"}))))

(clojure.core/defn- req-describe-offering-request [input] (clojure.core/cond-> #:http.request.configuration{:uri [(clojure.core/into (ser-string (input :offering-id)) #:http.request.field{:name "OfferingId", :shape "__string", :location "uri", :location-name "offeringId"})]}))

(clojure.core/defn- req-list-channels-request [input] (clojure.core/cond-> {} (clojure.core/contains? input :max-results) (clojure.core/update-in [:http.request.configuration/querystring] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-max-results (input :max-results)) #:http.request.field{:name "MaxResults", :shape "MaxResults", :location "querystring", :location-name "maxResults"})) (clojure.core/contains? input :next-token) (clojure.core/update-in [:http.request.configuration/querystring] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-string (input :next-token)) #:http.request.field{:name "NextToken", :shape "__string", :location "querystring", :location-name "nextToken"}))))

(clojure.core/defn- req-start-channel-request [input] (clojure.core/cond-> #:http.request.configuration{:uri [(clojure.core/into (ser-string (input :channel-id)) #:http.request.field{:name "ChannelId", :shape "__string", :location "uri", :location-name "channelId"})]}))

(clojure.core/defn- req-create-input-request [input] (clojure.core/cond-> {} (clojure.core/contains? input :media-connect-flows) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-list-of-media-connect-flow-request (input :media-connect-flows)) #:http.request.field{:name "MediaConnectFlows", :shape "__listOfMediaConnectFlowRequest", :location-name "mediaConnectFlows"})) (clojure.core/contains? input :request-id) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-string (input :request-id)) #:http.request.field{:name "RequestId", :shape "__string", :location-name "requestId", :idempotency-token true})) (clojure.core/contains? input :type) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-input-type (input :type)) #:http.request.field{:name "Type", :shape "InputType", :location-name "type"})) (clojure.core/contains? input :input-security-groups) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-list-of-string (input :input-security-groups)) #:http.request.field{:name "InputSecurityGroups", :shape "__listOf__string", :location-name "inputSecurityGroups"})) (clojure.core/contains? input :role-arn) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-string (input :role-arn)) #:http.request.field{:name "RoleArn", :shape "__string", :location-name "roleArn"})) (clojure.core/contains? input :tags) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-tags (input :tags)) #:http.request.field{:name "Tags", :shape "Tags", :location-name "tags"})) (clojure.core/contains? input :vpc) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-input-vpc-request (input :vpc)) #:http.request.field{:name "Vpc", :shape "InputVpcRequest", :location-name "vpc"})) (clojure.core/contains? input :destinations) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-list-of-input-destination-request (input :destinations)) #:http.request.field{:name "Destinations", :shape "__listOfInputDestinationRequest", :location-name "destinations"})) (clojure.core/contains? input :name) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-string (input :name)) #:http.request.field{:name "Name", :shape "__string", :location-name "name"})) (clojure.core/contains? input :sources) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-list-of-input-source-request (input :sources)) #:http.request.field{:name "Sources", :shape "__listOfInputSourceRequest", :location-name "sources"}))))

(clojure.core/defn- req-create-input-security-group-request [input] (clojure.core/cond-> {} (clojure.core/contains? input :tags) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-tags (input :tags)) #:http.request.field{:name "Tags", :shape "Tags", :location-name "tags"})) (clojure.core/contains? input :whitelist-rules) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-list-of-input-whitelist-rule-cidr (input :whitelist-rules)) #:http.request.field{:name "WhitelistRules", :shape "__listOfInputWhitelistRuleCidr", :location-name "whitelistRules"}))))

(clojure.core/declare deser-hls-manifest-compression)

(clojure.core/declare deser-hls-encryption-type)

(clojure.core/declare deser-integer-min-0-max-600)

(clojure.core/declare deser-output-location-ref)

(clojure.core/declare deser-hls-manifest-duration-format)

(clojure.core/declare deser-integer-min-1000)

(clojure.core/declare deser-integer-min-negative-60-max-6)

(clojure.core/declare deser-scte-35-apos-no-regional-blackout-behavior)

(clojure.core/declare deser-input-filter)

(clojure.core/declare deser-audio-selector-settings)

(clojure.core/declare deser-audio-description-audio-type-control)

(clojure.core/declare deser-list-of-video-description)

(clojure.core/declare deser-integer-min-0-max-1000)

(clojure.core/declare deser-integer-min-0-max-65536)

(clojure.core/declare deser-h-264-adaptive-quantization)

(clojure.core/declare deser-integer-min-1-max-1000000)

(clojure.core/declare deser-integer-min-25-max-2000)

(clojure.core/declare deser-input-loss-action-for-hls-out)

(clojure.core/declare deser-input-source-end-behavior)

(clojure.core/declare deser-ttml-destination-style-control)

(clojure.core/declare deser-dvb-sdt-output-sdt)

(clojure.core/declare deser-ttml-destination-settings)

(clojure.core/declare deser-integer-min-1-max-4)

(clojure.core/declare deser-m-2ts-pcr-control)

(clojure.core/declare deser-input-state)

(clojure.core/declare deser-batch-schedule-action-create-result)

(clojure.core/declare deser-h-264-scan-type)

(clojure.core/declare deser-scte-35-device-restrictions)

(clojure.core/declare deser-remix-settings)

(clojure.core/declare deser-dvb-tdt-settings)

(clojure.core/declare deser-scte-35-time-signal-schedule-action-settings)

(clojure.core/declare deser-audio-type)

(clojure.core/declare deser-audio-normalization-algorithm-control)

(clojure.core/declare deser-integer-min-0-max-1099511627775)

(clojure.core/declare deser-list-of-channel-egress-endpoint)

(clojure.core/declare deser-fixed-mode-schedule-action-start-settings)

(clojure.core/declare deser-burn-in-destination-settings)

(clojure.core/declare deser-eac-3-drc-rf)

(clojure.core/declare deser-list-of-offering)

(clojure.core/declare deser-input-security-group-state)

(clojure.core/declare deser-audio-description)

(clojure.core/declare deser-aac-vbr-quality)

(clojure.core/declare deser-list-of-input-source)

(clojure.core/declare deser-hls-basic-put-settings)

(clojure.core/declare deser-m-2ts-klv)

(clojure.core/declare deser-global-configuration)

(clojure.core/declare deser-m-3u-8-pcr-control)

(clojure.core/declare deser-archive-output-settings)

(clojure.core/declare deser-string-min-6-max-6)

(clojure.core/declare deser-m-2ts-audio-buffer-model)

(clojure.core/declare deser-validation-error)

(clojure.core/declare deser-h-264-gop-size-units)

(clojure.core/declare deser-hls-directory-structure)

(clojure.core/declare deser-frame-capture-output-settings)

(clojure.core/declare deser-m-2ts-ebp-placement)

(clojure.core/declare deser-dvb-sub-destination-teletext-grid-control)

(clojure.core/declare deser-eac-3-settings)

(clojure.core/declare deser-audio-normalization-algorithm)

(clojure.core/declare deser-follow-mode-schedule-action-start-settings)

(clojure.core/declare deser-rtmp-caption-data)

(clojure.core/declare deser-hls-mode)

(clojure.core/declare deser-log-level)

(clojure.core/declare deser-follow-point)

(clojure.core/declare deser-integer-min-0-max-500)

(clojure.core/declare deser-i-frame-only-playlist-type)

(clojure.core/declare deser-input-loss-behavior)

(clojure.core/declare deser-input-loss-image-type)

(clojure.core/declare deser-list-of-output-destination-settings)

(clojure.core/declare deser-udp-group-settings)

(clojure.core/declare deser-m-2ts-arib)

(clojure.core/declare deser-dvb-sub-destination-font-color)

(clojure.core/declare deser-input-type)

(clojure.core/declare deser-dvb-sdt-settings)

(clojure.core/declare deser-burn-in-background-color)

(clojure.core/declare deser-video-selector-program-id)

(clojure.core/declare deser-archive-group-settings)

(clojure.core/declare deser-hls-timed-metadata-schedule-action-settings)

(clojure.core/declare deser-udp-output-settings)

(clojure.core/declare deser-udp-timed-metadata-id-3-frame)

(clojure.core/declare deser-integer-min-0)

(clojure.core/declare deser-hls-settings)

(clojure.core/declare deser-scte-35-splice-insert-schedule-action-settings)

(clojure.core/declare deser-ac-3-lfe-filter)

(clojure.core/declare deser-burn-in-teletext-grid-control)

(clojure.core/declare deser-scte-27-destination-settings)

(clojure.core/declare deser-schedule-action)

(clojure.core/declare deser-video-selector-color-space-usage)

(clojure.core/declare deser-scte-20-source-settings)

(clojure.core/declare deser-hls-stream-inf-resolution)

(clojure.core/declare deser-list-of-schedule-action)

(clojure.core/declare deser-hls-caption-language-setting)

(clojure.core/declare deser-m-2ts-settings)

(clojure.core/declare deser-string)

(clojure.core/declare deser-scte-35-splice-insert-no-regional-blackout-behavior)

(clojure.core/declare deser-dvb-sub-source-settings)

(clojure.core/declare deser-input-denoise-filter)

(clojure.core/declare deser-video-selector-pid)

(clojure.core/declare deser-scte-35-descriptor-settings)

(clojure.core/declare deser-afd-signaling)

(clojure.core/declare deser-list-of-audio-selector)

(clojure.core/declare deser-aac-profile)

(clojure.core/declare deser-burn-in-font-color)

(clojure.core/declare deser-pause-state-schedule-action-settings)

(clojure.core/declare deser-eac-3-metadata-control)

(clojure.core/declare deser-fec-output-settings)

(clojure.core/declare deser-global-configuration-input-end-action)

(clojure.core/declare deser-integer-min-0-max-65535)

(clojure.core/declare deser-hls-webdav-http-transfer-mode)

(clojure.core/declare deser-offering-duration-units)

(clojure.core/declare deser-hls-webdav-settings)

(clojure.core/declare deser-double-min-1)

(clojure.core/declare deser-dvb-sub-destination-background-color)

(clojure.core/declare deser-mp-2-coding-mode)

(clojure.core/declare deser-list-of-output-group)

(clojure.core/declare deser-reservation-resource-specification)

(clojure.core/declare deser-scte-35-delivery-restrictions)

(clojure.core/declare deser-m-2ts-timed-metadata-behavior)

(clojure.core/declare deser-tags)

(clojure.core/declare deser-fec-output-include-fec)

(clojure.core/declare deser-scte-35-segmentation-cancel-indicator)

(clojure.core/declare deser-rtmp-output-certificate-mode)

(clojure.core/declare deser-ac-3-drc-profile)

(clojure.core/declare deser-eac-3-lfe-control)

(clojure.core/declare deser-teletext-source-settings)

(clojure.core/declare deser-m-3u-8-scte-35-behavior)

(clojure.core/declare deser-rtmp-output-settings)

(clojure.core/declare deser-global-configuration-low-framerate-inputs)

(clojure.core/declare deser-eac-3-surround-mode)

(clojure.core/declare deser-avail-blanking-state)

(clojure.core/declare deser-audio-channel-mapping)

(clojure.core/declare deser-reservation-resolution)

(clojure.core/declare deser-h-264-look-ahead-rate-control)

(clojure.core/declare deser-input-source)

(clojure.core/declare deser-hls-akamai-http-transfer-mode)

(clojure.core/declare deser-reservation)

(clojure.core/declare deser-h-264-sub-gop-length)

(clojure.core/declare deser-ms-smooth-output-settings)

(clojure.core/declare deser-video-selector-settings)

(clojure.core/declare deser-eac-3-lfe-filter)

(clojure.core/declare deser-reservation-maximum-bitrate)

(clojure.core/declare deser-offering)

(clojure.core/declare deser-integer-min-negative-60-max-60)

(clojure.core/declare deser-integer-min-0-max-8589934591)

(clojure.core/declare deser-list-of-input-channel-level)

(clojure.core/declare deser-h-264-rate-control-mode)

(clojure.core/declare deser-integer-min-0-max-255)

(clojure.core/declare deser-list-of-output-destination)

(clojure.core/declare deser-video-selector)

(clojure.core/declare deser-ac-3-metadata-control)

(clojure.core/declare deser-double-min-0)

(clojure.core/declare deser-m-2ts-buffer-model)

(clojure.core/declare deser-udp-container-settings)

(clojure.core/declare deser-channel-summary)

(clojure.core/declare deser-integer-min-25-max-10000)

(clojure.core/declare deser-eac-3-coding-mode)

(clojure.core/declare deser-m-2ts-ebif-control)

(clojure.core/declare deser-caption-description)

(clojure.core/declare deser-hls-media-store-settings)

(clojure.core/declare deser-smooth-group-stream-manifest-behavior)

(clojure.core/declare deser-timecode-config-source)

(clojure.core/declare deser-m-2ts-audio-interval)

(clojure.core/declare deser-schedule-action-settings)

(clojure.core/declare deser-audio-pid-selection)

(clojure.core/declare deser-hls-output-selection)

(clojure.core/declare deser-input-loss-action-for-udp-out)

(clojure.core/declare deser-ac-3-bitstream-mode)

(clojure.core/declare deser-scte-35-time-signal-apos)

(clojure.core/declare deser-h-264-spatial-aq)

(clojure.core/declare deser-aac-raw-format)

(clojure.core/declare deser-static-image-activate-schedule-action-settings)

(clojure.core/declare deser-list-of-input-security-group)

(clojure.core/declare deser-output-destination)

(clojure.core/declare deser-integer-min-30)

(clojure.core/declare deser-reservation-special-feature)

(clojure.core/declare deser-input-maximum-bitrate)

(clojure.core/declare deser-reservation-video-quality)

(clojure.core/declare deser-integer-min-0-max-3600)

(clojure.core/declare deser-video-selector-color-space)

(clojure.core/declare deser-audio-only-hls-settings)

(clojure.core/declare deser-m-2ts-segmentation-markers)

(clojure.core/declare deser-eac-3-drc-line)

(clojure.core/declare deser-dvb-sub-destination-alignment)

(clojure.core/declare deser-m-2ts-scte-35-control)

(clojure.core/declare deser-input-location)

(clojure.core/declare deser-m-2ts-absent-input-audio-behavior)

(clojure.core/declare deser-integer-min-3)

(clojure.core/declare deser-h-264-level)

(clojure.core/declare deser-avail-settings)

(clojure.core/declare deser-h-264-par-control)

(clojure.core/declare deser-input-security-group)

(clojure.core/declare deser-smooth-group-audio-only-timecode-control)

(clojure.core/declare deser-pipeline-id)

(clojure.core/declare deser-video-description)

(clojure.core/declare deser-integer-min-0-max-15)

(clojure.core/declare deser-global-configuration-output-timing-source)

(clojure.core/declare deser-scte-35-no-regional-blackout-flag)

(clojure.core/declare deser-integer-min-1-max-10)

(clojure.core/declare deser-audio-language-selection)

(clojure.core/declare deser-reservation-codec)

(clojure.core/declare deser-output-group-settings)

(clojure.core/declare deser-integer-min-96-max-600)

(clojure.core/declare deser-rtmp-cache-full-behavior)

(clojure.core/declare deser-input-destination-vpc)

(clojure.core/declare deser-avail-configuration)

(clojure.core/declare deser-archive-container-settings)

(clojure.core/declare deser-list-of-hls-ad-markers)

(clojure.core/declare deser-blackout-slate-state)

(clojure.core/declare deser-mp-2-settings)

(clojure.core/declare deser-arib-destination-settings)

(clojure.core/declare deser-reservation-maximum-framerate)

(clojure.core/declare deser-smooth-group-sparse-track-type)

(clojure.core/declare deser-m-2ts-es-rate-in-pes)

(clojure.core/declare deser-caption-destination-settings)

(clojure.core/declare deser-integer-min-1000-max-30000)

(clojure.core/declare deser-hls-input-settings)

(clojure.core/declare deser-hls-ad-markers)

(clojure.core/declare deser-list-of-input-whitelist-rule)

(clojure.core/declare deser-list-of-string)

(clojure.core/declare deser-channel-state)

(clojure.core/declare deser-m-2ts-segmentation-style)

(clojure.core/declare deser-integer-min-0-max-30)

(clojure.core/declare deser-hls-iv-source)

(clojure.core/declare deser-authentication-scheme)

(clojure.core/declare deser-standard-hls-settings)

(clojure.core/declare deser-list-of-input-attachment)

(clojure.core/declare deser-hls-cdn-settings)

(clojure.core/declare deser-scte-35-descriptor)

(clojure.core/declare deser-smooth-group-event-stop-behavior)

(clojure.core/declare deser-list-of-input-destination)

(clojure.core/declare deser-scte-35-splice-insert)

(clojure.core/declare deser-m-2ts-rate-mode)

(clojure.core/declare deser-eac-3-bitstream-mode)

(clojure.core/declare deser-input-channel-level)

(clojure.core/declare deser-h-264-profile)

(clojure.core/declare deser-batch-schedule-action-delete-result)

(clojure.core/declare deser-m-2ts-arib-captions-pid-control)

(clojure.core/declare deser-integer-min-0-max-100)

(clojure.core/declare deser-integer-min-1-max-6)

(clojure.core/declare deser-input)

(clojure.core/declare deser-m-2ts-cc-descriptor)

(clojure.core/declare deser-list-of-pipeline-pause-state-settings)

(clojure.core/declare deser-string-min-1-max-256)

(clojure.core/declare deser-dvb-sub-destination-outline-color)

(clojure.core/declare deser-double-min-negative-59-max-0)

(clojure.core/declare deser-static-image-deactivate-schedule-action-settings)

(clojure.core/declare deser-video-codec-settings)

(clojure.core/declare deser-string-max-32)

(clojure.core/declare deser-eac-3-dc-filter)

(clojure.core/declare deser-m-3u-8-timed-metadata-behavior)

(clojure.core/declare deser-integer-min-1-max-5)

(clojure.core/declare deser-h-264-scene-change-detect)

(clojure.core/declare deser-aac-spec)

(clojure.core/declare deser-scte-35-apos-web-delivery-allowed-behavior)

(clojure.core/declare deser-blackout-slate-network-end-blackout)

(clojure.core/declare deser-network-input-server-validation)

(clojure.core/declare deser-hls-redundant-manifest)

(clojure.core/declare deser-input-destination)

(clojure.core/declare deser-rtmp-caption-info-destination-settings)

(clojure.core/declare deser-aac-coding-mode)

(clojure.core/declare deser-smooth-group-event-id-mode)

(clojure.core/declare deser-scte-27-source-settings)

(clojure.core/declare deser-integer-min-1-max-3600)

(clojure.core/declare deser-webvtt-destination-settings)

(clojure.core/declare deser-output-settings)

(clojure.core/declare deser-caption-language-mapping)

(clojure.core/declare deser-input-loss-action-for-rtmp-out)

(clojure.core/declare deser-schedule-action-start-settings)

(clojure.core/declare deser-list-of-output)

(clojure.core/declare deser-encoder-settings)

(clojure.core/declare deser-static-key-settings)

(clojure.core/declare deser-frame-capture-group-settings)

(clojure.core/declare deser-video-description-respond-to-afd)

(clojure.core/declare deser-teletext-destination-settings)

(clojure.core/declare deser-output-group)

(clojure.core/declare deser-list-of-channel-summary)

(clojure.core/declare deser-input-attachment)

(clojure.core/declare deser-hls-client-cache)

(clojure.core/declare deser-integer-min-0-max-10000)

(clojure.core/declare deser-h-264-temporal-aq)

(clojure.core/declare deser-smpte-tt-destination-settings)

(clojure.core/declare deser-embedded-source-settings)

(clojure.core/declare deser-h-264-gop-b-reference)

(clojure.core/declare deser-list-of-input)

(clojure.core/declare deser-network-input-settings)

(clojure.core/declare deser-input-whitelist-rule)

(clojure.core/declare deser-string-min-3-max-3)

(clojure.core/declare deser-smooth-group-certificate-mode)

(clojure.core/declare deser-input-specification)

(clojure.core/declare deser-reservation-resource-type)

(clojure.core/declare deser-input-deblock-filter)

(clojure.core/declare deser-embedded-scte-20-detection)

(clojure.core/declare deser-input-codec)

(clojure.core/declare deser-integer-min-4-max-20)

(clojure.core/declare deser-arib-source-settings)

(clojure.core/declare deser-audio-description-language-code-control)

(clojure.core/declare deser-double)

(clojure.core/declare deser-ac-3-coding-mode)

(clojure.core/declare deser-input-switch-schedule-action-settings)

(clojure.core/declare deser-integer-min-0-max-10)

(clojure.core/declare deser-aac-rate-control-mode)

(clojure.core/declare deser-integer-min-negative-1000-max-1000)

(clojure.core/declare deser-hls-segmentation-mode)

(clojure.core/declare deser-dvb-sub-destination-shadow-color)

(clojure.core/declare deser-list-of-reservation)

(clojure.core/declare deser-pass-through-settings)

(clojure.core/declare deser-media-connect-flow)

(clojure.core/declare deser-video-description-scaling-behavior)

(clojure.core/declare deser-scte-35-archive-allowed-flag)

(clojure.core/declare deser-eac-3-attenuation-control)

(clojure.core/declare deser-h-264-framerate-control)

(clojure.core/declare deser-aac-input-type)

(clojure.core/declare deser-channel)

(clojure.core/declare deser-timecode-config)

(clojure.core/declare deser-dvb-sub-destination-settings)

(clojure.core/declare deser-embedded-convert-608-to-708)

(clojure.core/declare deser-audio-only-hls-track-type)

(clojure.core/declare deser-h-264-color-metadata)

(clojure.core/declare deser-string-min-1)

(clojure.core/declare deser-blackout-slate)

(clojure.core/declare deser-ac-3-settings)

(clojure.core/declare deser-ms-smooth-group-settings)

(clojure.core/declare deser-integer-min-0-max-7)

(clojure.core/declare deser-h-264-entropy-encoding)

(clojure.core/declare deser-output)

(clojure.core/declare deser-burn-in-shadow-color)

(clojure.core/declare deser-audio-language-selection-policy)

(clojure.core/declare deser-integer)

(clojure.core/declare deser-aac-settings)

(clojure.core/declare deser-integer-min-1)

(clojure.core/declare deser-list-of-caption-selector)

(clojure.core/declare deser-integer-min-0-max-4294967295)

(clojure.core/declare deser-rtmp-group-settings)

(clojure.core/declare deser-burn-in-alignment)

(clojure.core/declare deser-list-of-caption-description)

(clojure.core/declare deser-embedded-destination-settings)

(clojure.core/declare deser-caption-selector)

(clojure.core/declare deser-embedded-plus-scte-20-destination-settings)

(clojure.core/declare deser-channel-egress-endpoint)

(clojure.core/declare deser-hls-group-settings)

(clojure.core/declare deser-input-loss-action-for-ms-smooth-out)

(clojure.core/declare deser-dvb-nit-settings)

(clojure.core/declare deser-integer-min-1-max-20)

(clojure.core/declare deser-offering-type)

(clojure.core/declare deser-integer-min-0-max-8191)

(clojure.core/declare deser-smooth-group-timestamp-offset-mode)

(clojure.core/declare deser-hls-media-store-storage-class)

(clojure.core/declare deser-pipeline-pause-state-settings)

(clojure.core/declare deser-frame-capture-settings)

(clojure.core/declare deser-hls-program-date-time)

(clojure.core/declare deser-list-of-validation-error)

(clojure.core/declare deser-output-destination-settings)

(clojure.core/declare deser-fixed-afd)

(clojure.core/declare deser-hls-ts-file-mode)

(clojure.core/declare deser-scte-35-segmentation-descriptor)

(clojure.core/declare deser-hls-iv-in-manifest)

(clojure.core/declare deser-list-of-caption-language-mapping)

(clojure.core/declare deser-audio-codec-settings)

(clojure.core/declare deser-scte-20-plus-embedded-destination-settings)

(clojure.core/declare deser-scte-35-web-delivery-allowed-flag)

(clojure.core/declare deser-scte-35-return-to-network-schedule-action-settings)

(clojure.core/declare deser-integer-min-1-max-32)

(clojure.core/declare deser-burn-in-outline-color)

(clojure.core/declare deser-h-264-timecode-insertion-behavior)

(clojure.core/declare deser-eac-3-passthrough-control)

(clojure.core/declare deser-input-settings)

(clojure.core/declare deser-integer-min-1-max-31)

(clojure.core/declare deser-audio-normalization-settings)

(clojure.core/declare deser-key-provider-settings)

(clojure.core/declare deser-list-of-scte-35-descriptor)

(clojure.core/declare deser-caption-selector-settings)

(clojure.core/declare deser-h-264-settings)

(clojure.core/declare deser-hls-timed-metadata-id-3-frame)

(clojure.core/declare deser-list-of-media-connect-flow)

(clojure.core/declare deser-eac-3-phase-control)

(clojure.core/declare deser-eac-3-surround-ex-mode)

(clojure.core/declare deser-integer-min-1-max-8)

(clojure.core/declare deser-smooth-group-segmentation-mode)

(clojure.core/declare deser-list-of-audio-description)

(clojure.core/declare deser-hls-output-settings)

(clojure.core/declare deser-scte-35-splice-insert-web-delivery-allowed-behavior)

(clojure.core/declare deser-m-3u-8-settings)

(clojure.core/declare deser-string-min-1-max-255)

(clojure.core/declare deser-list-of-audio-channel-mapping)

(clojure.core/declare deser-eac-3-stereo-downmix)

(clojure.core/declare deser-integer-min-0-max-128)

(clojure.core/declare deser-integer-min-0-max-1000000)

(clojure.core/declare deser-h-264-syntax)

(clojure.core/declare deser-string-min-32-max-32)

(clojure.core/declare deser-input-resolution)

(clojure.core/declare deser-scte-20-convert-608-to-708)

(clojure.core/declare deser-h-264-flicker-aq)

(clojure.core/declare deser-hls-codec-specification)

(clojure.core/declare deser-avail-blanking)

(clojure.core/declare deser-m-2ts-audio-stream-type)

(clojure.core/declare deser-string-min-34-max-34)

(clojure.core/declare deser-audio-selector)

(clojure.core/declare deser-integer-min-1-max-16)

(clojure.core/declare deser-hls-akamai-settings)

(clojure.core/declare deser-reservation-state)

(clojure.core/defn- deser-hls-manifest-compression [input] (clojure.core/get {"GZIP" :gzip, "NONE" :none} input))

(clojure.core/defn- deser-hls-encryption-type [input] (clojure.core/get {"AES128" :aes-128, "SAMPLE_AES" :sample-aes} input))

(clojure.core/defn- deser-integer-min-0-max-600 [input] input)

(clojure.core/defn- deser-output-location-ref [input] (clojure.core/cond-> {} (clojure.core/contains? input "destinationRefId") (clojure.core/assoc :destination-ref-id (deser-string (input "destinationRefId")))))

(clojure.core/defn- deser-hls-manifest-duration-format [input] (clojure.core/get {"FLOATING_POINT" :floating-point, "INTEGER" :integer} input))

(clojure.core/defn- deser-integer-min-1000 [input] input)

(clojure.core/defn- deser-integer-min-negative-60-max-6 [input] input)

(clojure.core/defn- deser-scte-35-apos-no-regional-blackout-behavior [input] (clojure.core/get {"FOLLOW" :follow, "IGNORE" :ignore} input))

(clojure.core/defn- deser-input-filter [input] (clojure.core/get {"AUTO" :auto, "DISABLED" :disabled, "FORCED" :forced} input))

(clojure.core/defn- deser-audio-selector-settings [input] (clojure.core/cond-> {} (clojure.core/contains? input "audioLanguageSelection") (clojure.core/assoc :audio-language-selection (deser-audio-language-selection (input "audioLanguageSelection"))) (clojure.core/contains? input "audioPidSelection") (clojure.core/assoc :audio-pid-selection (deser-audio-pid-selection (input "audioPidSelection")))))

(clojure.core/defn- deser-audio-description-audio-type-control [input] (clojure.core/get {"FOLLOW_INPUT" :follow-input, "USE_CONFIGURED" :use-configured} input))

(clojure.core/defn- deser-list-of-video-description [input] (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (deser-video-description coll))) input))

(clojure.core/defn- deser-integer-min-0-max-1000 [input] input)

(clojure.core/defn- deser-integer-min-0-max-65536 [input] input)

(clojure.core/defn- deser-h-264-adaptive-quantization [input] (clojure.core/get {"HIGH" :high, "HIGHER" :higher, "LOW" :low, "MAX" :max, "MEDIUM" :medium, "OFF" :off} input))

(clojure.core/defn- deser-integer-min-1-max-1000000 [input] input)

(clojure.core/defn- deser-integer-min-25-max-2000 [input] input)

(clojure.core/defn- deser-input-loss-action-for-hls-out [input] (clojure.core/get {"EMIT_OUTPUT" :emit-output, "PAUSE_OUTPUT" :pause-output} input))

(clojure.core/defn- deser-input-source-end-behavior [input] (clojure.core/get {"CONTINUE" :continue, "LOOP" :loop} input))

(clojure.core/defn- deser-ttml-destination-style-control [input] (clojure.core/get {"PASSTHROUGH" :passthrough, "USE_CONFIGURED" :use-configured} input))

(clojure.core/defn- deser-dvb-sdt-output-sdt [input] (clojure.core/get {"SDT_FOLLOW" :sdt-follow, "SDT_FOLLOW_IF_PRESENT" :sdt-follow-if-present, "SDT_MANUAL" :sdt-manual, "SDT_NONE" :sdt-none} input))

(clojure.core/defn- deser-ttml-destination-settings [input] (clojure.core/cond-> {} (clojure.core/contains? input "styleControl") (clojure.core/assoc :style-control (deser-ttml-destination-style-control (input "styleControl")))))

(clojure.core/defn- deser-integer-min-1-max-4 [input] input)

(clojure.core/defn- deser-m-2ts-pcr-control [input] (clojure.core/get {"CONFIGURED_PCR_PERIOD" :configured-pcr-period, "PCR_EVERY_PES_PACKET" :pcr-every-pes-packet} input))

(clojure.core/defn- deser-input-state [input] (clojure.core/get {"CREATING" :creating, "DETACHED" :detached, "ATTACHED" :attached, "DELETING" :deleting, "DELETED" :deleted} input))

(clojure.core/defn- deser-batch-schedule-action-create-result [input] (clojure.core/cond-> {:schedule-actions (deser-list-of-schedule-action (input "scheduleActions"))}))

(clojure.core/defn- deser-h-264-scan-type [input] (clojure.core/get {"INTERLACED" :interlaced, "PROGRESSIVE" :progressive} input))

(clojure.core/defn- deser-scte-35-device-restrictions [input] (clojure.core/get {"NONE" :none, "RESTRICT_GROUP0" :restrict-group-0, "RESTRICT_GROUP1" :restrict-group-1, "RESTRICT_GROUP2" :restrict-group-2} input))

(clojure.core/defn- deser-remix-settings [input] (clojure.core/cond-> {:channel-mappings (deser-list-of-audio-channel-mapping (input "channelMappings"))} (clojure.core/contains? input "channelsIn") (clojure.core/assoc :channels-in (deser-integer-min-1-max-16 (input "channelsIn"))) (clojure.core/contains? input "channelsOut") (clojure.core/assoc :channels-out (deser-integer-min-1-max-8 (input "channelsOut")))))

(clojure.core/defn- deser-dvb-tdt-settings [input] (clojure.core/cond-> {} (clojure.core/contains? input "repInterval") (clojure.core/assoc :rep-interval (deser-integer-min-1000-max-30000 (input "repInterval")))))

(clojure.core/defn- deser-scte-35-time-signal-schedule-action-settings [input] (clojure.core/cond-> {:scte-35-descriptors (deser-list-of-scte-35-descriptor (input "scte35Descriptors"))}))

(clojure.core/defn- deser-audio-type [input] (clojure.core/get {"CLEAN_EFFECTS" :clean-effects, "HEARING_IMPAIRED" :hearing-impaired, "UNDEFINED" :undefined, "VISUAL_IMPAIRED_COMMENTARY" :visual-impaired-commentary} input))

(clojure.core/defn- deser-audio-normalization-algorithm-control [input] (clojure.core/get {"CORRECT_AUDIO" :correct-audio} input))

(clojure.core/defn- deser-integer-min-0-max-1099511627775 [input] input)

(clojure.core/defn- deser-list-of-channel-egress-endpoint [input] (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (deser-channel-egress-endpoint coll))) input))

(clojure.core/defn- deser-fixed-mode-schedule-action-start-settings [input] (clojure.core/cond-> {:time (deser-string (input "time"))}))

(clojure.core/defn- deser-burn-in-destination-settings [input] (clojure.core/cond-> {} (clojure.core/contains? input "outlineColor") (clojure.core/assoc :outline-color (deser-burn-in-outline-color (input "outlineColor"))) (clojure.core/contains? input "outlineSize") (clojure.core/assoc :outline-size (deser-integer-min-0-max-10 (input "outlineSize"))) (clojure.core/contains? input "shadowColor") (clojure.core/assoc :shadow-color (deser-burn-in-shadow-color (input "shadowColor"))) (clojure.core/contains? input "shadowOpacity") (clojure.core/assoc :shadow-opacity (deser-integer-min-0-max-255 (input "shadowOpacity"))) (clojure.core/contains? input "shadowYOffset") (clojure.core/assoc :shadow-y-offset (deser-integer (input "shadowYOffset"))) (clojure.core/contains? input "backgroundColor") (clojure.core/assoc :background-color (deser-burn-in-background-color (input "backgroundColor"))) (clojure.core/contains? input "teletextGridControl") (clojure.core/assoc :teletext-grid-control (deser-burn-in-teletext-grid-control (input "teletextGridControl"))) (clojure.core/contains? input "yPosition") (clojure.core/assoc :y-position (deser-integer-min-0 (input "yPosition"))) (clojure.core/contains? input "fontColor") (clojure.core/assoc :font-color (deser-burn-in-font-color (input "fontColor"))) (clojure.core/contains? input "xPosition") (clojure.core/assoc :x-position (deser-integer-min-0 (input "xPosition"))) (clojure.core/contains? input "font") (clojure.core/assoc :font (deser-input-location (input "font"))) (clojure.core/contains? input "fontResolution") (clojure.core/assoc :font-resolution (deser-integer-min-96-max-600 (input "fontResolution"))) (clojure.core/contains? input "fontSize") (clojure.core/assoc :font-size (deser-string (input "fontSize"))) (clojure.core/contains? input "backgroundOpacity") (clojure.core/assoc :background-opacity (deser-integer-min-0-max-255 (input "backgroundOpacity"))) (clojure.core/contains? input "fontOpacity") (clojure.core/assoc :font-opacity (deser-integer-min-0-max-255 (input "fontOpacity"))) (clojure.core/contains? input "shadowXOffset") (clojure.core/assoc :shadow-x-offset (deser-integer (input "shadowXOffset"))) (clojure.core/contains? input "alignment") (clojure.core/assoc :alignment (deser-burn-in-alignment (input "alignment")))))

(clojure.core/defn- deser-eac-3-drc-rf [input] (clojure.core/get {"FILM_LIGHT" :film-light, "FILM_STANDARD" :film-standard, "MUSIC_LIGHT" :music-light, "MUSIC_STANDARD" :music-standard, "NONE" :none, "SPEECH" :speech} input))

(clojure.core/defn- deser-list-of-offering [input] (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (deser-offering coll))) input))

(clojure.core/defn- deser-input-security-group-state [input] (clojure.core/get {"IDLE" :idle, "IN_USE" :in-use, "UPDATING" :updating, "DELETED" :deleted} input))

(clojure.core/defn- deser-audio-description [input] (clojure.core/cond-> {:audio-selector-name (deser-string (input "audioSelectorName")), :name (deser-string (input "name"))} (clojure.core/contains? input "streamName") (clojure.core/assoc :stream-name (deser-string (input "streamName"))) (clojure.core/contains? input "remixSettings") (clojure.core/assoc :remix-settings (deser-remix-settings (input "remixSettings"))) (clojure.core/contains? input "audioType") (clojure.core/assoc :audio-type (deser-audio-type (input "audioType"))) (clojure.core/contains? input "codecSettings") (clojure.core/assoc :codec-settings (deser-audio-codec-settings (input "codecSettings"))) (clojure.core/contains? input "languageCodeControl") (clojure.core/assoc :language-code-control (deser-audio-description-language-code-control (input "languageCodeControl"))) (clojure.core/contains? input "audioTypeControl") (clojure.core/assoc :audio-type-control (deser-audio-description-audio-type-control (input "audioTypeControl"))) (clojure.core/contains? input "languageCode") (clojure.core/assoc :language-code (deser-string-min-3-max-3 (input "languageCode"))) (clojure.core/contains? input "audioNormalizationSettings") (clojure.core/assoc :audio-normalization-settings (deser-audio-normalization-settings (input "audioNormalizationSettings")))))

(clojure.core/defn- deser-aac-vbr-quality [input] (clojure.core/get {"HIGH" :high, "LOW" :low, "MEDIUM_HIGH" :medium-high, "MEDIUM_LOW" :medium-low} input))

(clojure.core/defn- deser-list-of-input-source [input] (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (deser-input-source coll))) input))

(clojure.core/defn- deser-hls-basic-put-settings [input] (clojure.core/cond-> {} (clojure.core/contains? input "connectionRetryInterval") (clojure.core/assoc :connection-retry-interval (deser-integer-min-0 (input "connectionRetryInterval"))) (clojure.core/contains? input "filecacheDuration") (clojure.core/assoc :filecache-duration (deser-integer-min-0-max-600 (input "filecacheDuration"))) (clojure.core/contains? input "numRetries") (clojure.core/assoc :num-retries (deser-integer-min-0 (input "numRetries"))) (clojure.core/contains? input "restartDelay") (clojure.core/assoc :restart-delay (deser-integer-min-0-max-15 (input "restartDelay")))))

(clojure.core/defn- deser-m-2ts-klv [input] (clojure.core/get {"NONE" :none, "PASSTHROUGH" :passthrough} input))

(clojure.core/defn- deser-global-configuration [input] (clojure.core/cond-> {} (clojure.core/contains? input "initialAudioGain") (clojure.core/assoc :initial-audio-gain (deser-integer-min-negative-60-max-60 (input "initialAudioGain"))) (clojure.core/contains? input "inputEndAction") (clojure.core/assoc :input-end-action (deser-global-configuration-input-end-action (input "inputEndAction"))) (clojure.core/contains? input "inputLossBehavior") (clojure.core/assoc :input-loss-behavior (deser-input-loss-behavior (input "inputLossBehavior"))) (clojure.core/contains? input "outputTimingSource") (clojure.core/assoc :output-timing-source (deser-global-configuration-output-timing-source (input "outputTimingSource"))) (clojure.core/contains? input "supportLowFramerateInputs") (clojure.core/assoc :support-low-framerate-inputs (deser-global-configuration-low-framerate-inputs (input "supportLowFramerateInputs")))))

(clojure.core/defn- deser-m-3u-8-pcr-control [input] (clojure.core/get {"CONFIGURED_PCR_PERIOD" :configured-pcr-period, "PCR_EVERY_PES_PACKET" :pcr-every-pes-packet} input))

(clojure.core/defn- deser-archive-output-settings [input] (clojure.core/cond-> {:container-settings (deser-archive-container-settings (input "containerSettings"))} (clojure.core/contains? input "extension") (clojure.core/assoc :extension (deser-string (input "extension"))) (clojure.core/contains? input "nameModifier") (clojure.core/assoc :name-modifier (deser-string (input "nameModifier")))))

(clojure.core/defn- deser-string-min-6-max-6 [input] input)

(clojure.core/defn- deser-m-2ts-audio-buffer-model [input] (clojure.core/get {"ATSC" :atsc, "DVB" :dvb} input))

(clojure.core/defn- deser-validation-error [input] (clojure.core/cond-> {} (clojure.core/contains? input "elementPath") (clojure.core/assoc :element-path (deser-string (input "elementPath"))) (clojure.core/contains? input "errorMessage") (clojure.core/assoc :error-message (deser-string (input "errorMessage")))))

(clojure.core/defn- deser-h-264-gop-size-units [input] (clojure.core/get {"FRAMES" :frames, "SECONDS" :seconds} input))

(clojure.core/defn- deser-hls-directory-structure [input] (clojure.core/get {"SINGLE_DIRECTORY" :single-directory, "SUBDIRECTORY_PER_STREAM" :subdirectory-per-stream} input))

(clojure.core/defn- deser-frame-capture-output-settings [input] (clojure.core/cond-> {} (clojure.core/contains? input "nameModifier") (clojure.core/assoc :name-modifier (deser-string (input "nameModifier")))))

(clojure.core/defn- deser-m-2ts-ebp-placement [input] (clojure.core/get {"VIDEO_AND_AUDIO_PIDS" :video-and-audio-pids, "VIDEO_PID" :video-pid} input))

(clojure.core/defn- deser-dvb-sub-destination-teletext-grid-control [input] (clojure.core/get {"FIXED" :fixed, "SCALED" :scaled} input))

(clojure.core/defn- deser-eac-3-settings [input] (clojure.core/cond-> {} (clojure.core/contains? input "ltRtSurroundMixLevel") (clojure.core/assoc :lt-rt-surround-mix-level (deser-double (input "ltRtSurroundMixLevel"))) (clojure.core/contains? input "codingMode") (clojure.core/assoc :coding-mode (deser-eac-3-coding-mode (input "codingMode"))) (clojure.core/contains? input "phaseControl") (clojure.core/assoc :phase-control (deser-eac-3-phase-control (input "phaseControl"))) (clojure.core/contains? input "passthroughControl") (clojure.core/assoc :passthrough-control (deser-eac-3-passthrough-control (input "passthroughControl"))) (clojure.core/contains? input "surroundMode") (clojure.core/assoc :surround-mode (deser-eac-3-surround-mode (input "surroundMode"))) (clojure.core/contains? input "attenuationControl") (clojure.core/assoc :attenuation-control (deser-eac-3-attenuation-control (input "attenuationControl"))) (clojure.core/contains? input "drcLine") (clojure.core/assoc :drc-line (deser-eac-3-drc-line (input "drcLine"))) (clojure.core/contains? input "dcFilter") (clojure.core/assoc :dc-filter (deser-eac-3-dc-filter (input "dcFilter"))) (clojure.core/contains? input "lfeFilter") (clojure.core/assoc :lfe-filter (deser-eac-3-lfe-filter (input "lfeFilter"))) (clojure.core/contains? input "lfeControl") (clojure.core/assoc :lfe-control (deser-eac-3-lfe-control (input "lfeControl"))) (clojure.core/contains? input "loRoCenterMixLevel") (clojure.core/assoc :lo-ro-center-mix-level (deser-double (input "loRoCenterMixLevel"))) (clojure.core/contains? input "stereoDownmix") (clojure.core/assoc :stereo-downmix (deser-eac-3-stereo-downmix (input "stereoDownmix"))) (clojure.core/contains? input "ltRtCenterMixLevel") (clojure.core/assoc :lt-rt-center-mix-level (deser-double (input "ltRtCenterMixLevel"))) (clojure.core/contains? input "surroundExMode") (clojure.core/assoc :surround-ex-mode (deser-eac-3-surround-ex-mode (input "surroundExMode"))) (clojure.core/contains? input "metadataControl") (clojure.core/assoc :metadata-control (deser-eac-3-metadata-control (input "metadataControl"))) (clojure.core/contains? input "loRoSurroundMixLevel") (clojure.core/assoc :lo-ro-surround-mix-level (deser-double (input "loRoSurroundMixLevel"))) (clojure.core/contains? input "drcRf") (clojure.core/assoc :drc-rf (deser-eac-3-drc-rf (input "drcRf"))) (clojure.core/contains? input "bitstreamMode") (clojure.core/assoc :bitstream-mode (deser-eac-3-bitstream-mode (input "bitstreamMode"))) (clojure.core/contains? input "dialnorm") (clojure.core/assoc :dialnorm (deser-integer-min-1-max-31 (input "dialnorm"))) (clojure.core/contains? input "bitrate") (clojure.core/assoc :bitrate (deser-double (input "bitrate")))))

(clojure.core/defn- deser-audio-normalization-algorithm [input] (clojure.core/get {"ITU_1770_1" :itu-1770-1, "ITU_1770_2" :itu-1770-2} input))

(clojure.core/defn- deser-follow-mode-schedule-action-start-settings [input] (clojure.core/cond-> {:reference-action-name (deser-string (input "referenceActionName")), :follow-point (deser-follow-point (input "followPoint"))}))

(clojure.core/defn- deser-rtmp-caption-data [input] (clojure.core/get {"ALL" :all, "FIELD1_608" :field-1-608, "FIELD1_AND_FIELD2_608" :field-1-and-field-2-608} input))

(clojure.core/defn- deser-hls-mode [input] (clojure.core/get {"LIVE" :live, "VOD" :vod} input))

(clojure.core/defn- deser-log-level [input] (clojure.core/get {"ERROR" :error, "WARNING" :warning, "INFO" :info, "DEBUG" :debug, "DISABLED" :disabled} input))

(clojure.core/defn- deser-follow-point [input] (clojure.core/get {"END" :end, "START" :start} input))

(clojure.core/defn- deser-integer-min-0-max-500 [input] input)

(clojure.core/defn- deser-i-frame-only-playlist-type [input] (clojure.core/get {"DISABLED" :disabled, "STANDARD" :standard} input))

(clojure.core/defn- deser-input-loss-behavior [input] (clojure.core/cond-> {} (clojure.core/contains? input "blackFrameMsec") (clojure.core/assoc :black-frame-msec (deser-integer-min-0-max-1000000 (input "blackFrameMsec"))) (clojure.core/contains? input "inputLossImageColor") (clojure.core/assoc :input-loss-image-color (deser-string-min-6-max-6 (input "inputLossImageColor"))) (clojure.core/contains? input "inputLossImageSlate") (clojure.core/assoc :input-loss-image-slate (deser-input-location (input "inputLossImageSlate"))) (clojure.core/contains? input "inputLossImageType") (clojure.core/assoc :input-loss-image-type (deser-input-loss-image-type (input "inputLossImageType"))) (clojure.core/contains? input "repeatFrameMsec") (clojure.core/assoc :repeat-frame-msec (deser-integer-min-0-max-1000000 (input "repeatFrameMsec")))))

(clojure.core/defn- deser-input-loss-image-type [input] (clojure.core/get {"COLOR" :color, "SLATE" :slate} input))

(clojure.core/defn- deser-list-of-output-destination-settings [input] (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (deser-output-destination-settings coll))) input))

(clojure.core/defn- deser-udp-group-settings [input] (clojure.core/cond-> {} (clojure.core/contains? input "inputLossAction") (clojure.core/assoc :input-loss-action (deser-input-loss-action-for-udp-out (input "inputLossAction"))) (clojure.core/contains? input "timedMetadataId3Frame") (clojure.core/assoc :timed-metadata-id-3-frame (deser-udp-timed-metadata-id-3-frame (input "timedMetadataId3Frame"))) (clojure.core/contains? input "timedMetadataId3Period") (clojure.core/assoc :timed-metadata-id-3-period (deser-integer-min-0 (input "timedMetadataId3Period")))))

(clojure.core/defn- deser-m-2ts-arib [input] (clojure.core/get {"DISABLED" :disabled, "ENABLED" :enabled} input))

(clojure.core/defn- deser-dvb-sub-destination-font-color [input] (clojure.core/get {"BLACK" :black, "BLUE" :blue, "GREEN" :green, "RED" :red, "WHITE" :white, "YELLOW" :yellow} input))

(clojure.core/defn- deser-input-type [input] (clojure.core/get {"UDP_PUSH" :udp-push, "RTP_PUSH" :rtp-push, "RTMP_PUSH" :rtmp-push, "RTMP_PULL" :rtmp-pull, "URL_PULL" :url-pull, "MP4_FILE" :mp-4-file, "MEDIACONNECT" :mediaconnect} input))

(clojure.core/defn- deser-dvb-sdt-settings [input] (clojure.core/cond-> {} (clojure.core/contains? input "outputSdt") (clojure.core/assoc :output-sdt (deser-dvb-sdt-output-sdt (input "outputSdt"))) (clojure.core/contains? input "repInterval") (clojure.core/assoc :rep-interval (deser-integer-min-25-max-2000 (input "repInterval"))) (clojure.core/contains? input "serviceName") (clojure.core/assoc :service-name (deser-string-min-1-max-256 (input "serviceName"))) (clojure.core/contains? input "serviceProviderName") (clojure.core/assoc :service-provider-name (deser-string-min-1-max-256 (input "serviceProviderName")))))

(clojure.core/defn- deser-burn-in-background-color [input] (clojure.core/get {"BLACK" :black, "NONE" :none, "WHITE" :white} input))

(clojure.core/defn- deser-video-selector-program-id [input] (clojure.core/cond-> {} (clojure.core/contains? input "programId") (clojure.core/assoc :program-id (deser-integer-min-0-max-65536 (input "programId")))))

(clojure.core/defn- deser-archive-group-settings [input] (clojure.core/cond-> {:destination (deser-output-location-ref (input "destination"))} (clojure.core/contains? input "rolloverInterval") (clojure.core/assoc :rollover-interval (deser-integer-min-1 (input "rolloverInterval")))))

(clojure.core/defn- deser-hls-timed-metadata-schedule-action-settings [input] (clojure.core/cond-> {:id-3 (deser-string (input "id3"))}))

(clojure.core/defn- deser-udp-output-settings [input] (clojure.core/cond-> {:destination (deser-output-location-ref (input "destination")), :container-settings (deser-udp-container-settings (input "containerSettings"))} (clojure.core/contains? input "bufferMsec") (clojure.core/assoc :buffer-msec (deser-integer-min-0-max-10000 (input "bufferMsec"))) (clojure.core/contains? input "fecOutputSettings") (clojure.core/assoc :fec-output-settings (deser-fec-output-settings (input "fecOutputSettings")))))

(clojure.core/defn- deser-udp-timed-metadata-id-3-frame [input] (clojure.core/get {"NONE" :none, "PRIV" :priv, "TDRL" :tdrl} input))

(clojure.core/defn- deser-integer-min-0 [input] input)

(clojure.core/defn- deser-hls-settings [input] (clojure.core/cond-> {} (clojure.core/contains? input "audioOnlyHlsSettings") (clojure.core/assoc :audio-only-hls-settings (deser-audio-only-hls-settings (input "audioOnlyHlsSettings"))) (clojure.core/contains? input "standardHlsSettings") (clojure.core/assoc :standard-hls-settings (deser-standard-hls-settings (input "standardHlsSettings")))))

(clojure.core/defn- deser-scte-35-splice-insert-schedule-action-settings [input] (clojure.core/cond-> {:splice-event-id (deser-integer-min-0-max-4294967295 (input "spliceEventId"))} (clojure.core/contains? input "duration") (clojure.core/assoc :duration (deser-integer-min-0-max-8589934591 (input "duration")))))

(clojure.core/defn- deser-ac-3-lfe-filter [input] (clojure.core/get {"DISABLED" :disabled, "ENABLED" :enabled} input))

(clojure.core/defn- deser-burn-in-teletext-grid-control [input] (clojure.core/get {"FIXED" :fixed, "SCALED" :scaled} input))

(clojure.core/defn- deser-scte-27-destination-settings [input] (clojure.core/cond-> {}))

(clojure.core/defn- deser-schedule-action [input] (clojure.core/cond-> {:action-name (deser-string (input "actionName")), :schedule-action-start-settings (deser-schedule-action-start-settings (input "scheduleActionStartSettings")), :schedule-action-settings (deser-schedule-action-settings (input "scheduleActionSettings"))}))

(clojure.core/defn- deser-video-selector-color-space-usage [input] (clojure.core/get {"FALLBACK" :fallback, "FORCE" :force} input))

(clojure.core/defn- deser-scte-20-source-settings [input] (clojure.core/cond-> {} (clojure.core/contains? input "convert608To708") (clojure.core/assoc :convert-608-to-708 (deser-scte-20-convert-608-to-708 (input "convert608To708"))) (clojure.core/contains? input "source608ChannelNumber") (clojure.core/assoc :source-608-channel-number (deser-integer-min-1-max-4 (input "source608ChannelNumber")))))

(clojure.core/defn- deser-hls-stream-inf-resolution [input] (clojure.core/get {"EXCLUDE" :exclude, "INCLUDE" :include} input))

(clojure.core/defn- deser-list-of-schedule-action [input] (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (deser-schedule-action coll))) input))

(clojure.core/defn- deser-hls-caption-language-setting [input] (clojure.core/get {"INSERT" :insert, "NONE" :none, "OMIT" :omit} input))

(clojure.core/defn- deser-m-2ts-settings [input] (clojure.core/cond-> {} (clojure.core/contains? input "patInterval") (clojure.core/assoc :pat-interval (deser-integer-min-0-max-1000 (input "patInterval"))) (clojure.core/contains? input "bufferModel") (clojure.core/assoc :buffer-model (deser-m-2ts-buffer-model (input "bufferModel"))) (clojure.core/contains? input "dvbTdtSettings") (clojure.core/assoc :dvb-tdt-settings (deser-dvb-tdt-settings (input "dvbTdtSettings"))) (clojure.core/contains? input "audioFramesPerPes") (clojure.core/assoc :audio-frames-per-pes (deser-integer-min-0 (input "audioFramesPerPes"))) (clojure.core/contains? input "fragmentTime") (clojure.core/assoc :fragment-time (deser-double-min-0 (input "fragmentTime"))) (clojure.core/contains? input "transportStreamId") (clojure.core/assoc :transport-stream-id (deser-integer-min-0-max-65535 (input "transportStreamId"))) (clojure.core/contains? input "timedMetadataBehavior") (clojure.core/assoc :timed-metadata-behavior (deser-m-2ts-timed-metadata-behavior (input "timedMetadataBehavior"))) (clojure.core/contains? input "dvbSdtSettings") (clojure.core/assoc :dvb-sdt-settings (deser-dvb-sdt-settings (input "dvbSdtSettings"))) (clojure.core/contains? input "absentInputAudioBehavior") (clojure.core/assoc :absent-input-audio-behavior (deser-m-2ts-absent-input-audio-behavior (input "absentInputAudioBehavior"))) (clojure.core/contains? input "pcrControl") (clojure.core/assoc :pcr-control (deser-m-2ts-pcr-control (input "pcrControl"))) (clojure.core/contains? input "scte35Pid") (clojure.core/assoc :scte-35-pid (deser-string (input "scte35Pid"))) (clojure.core/contains? input "pcrPid") (clojure.core/assoc :pcr-pid (deser-string (input "pcrPid"))) (clojure.core/contains? input "pmtPid") (clojure.core/assoc :pmt-pid (deser-string (input "pmtPid"))) (clojure.core/contains? input "videoPid") (clojure.core/assoc :video-pid (deser-string (input "videoPid"))) (clojure.core/contains? input "rateMode") (clojure.core/assoc :rate-mode (deser-m-2ts-rate-mode (input "rateMode"))) (clojure.core/contains? input "audioPids") (clojure.core/assoc :audio-pids (deser-string (input "audioPids"))) (clojure.core/contains? input "etvPlatformPid") (clojure.core/assoc :etv-platform-pid (deser-string (input "etvPlatformPid"))) (clojure.core/contains? input "ebpLookaheadMs") (clojure.core/assoc :ebp-lookahead-ms (deser-integer-min-0-max-10000 (input "ebpLookaheadMs"))) (clojure.core/contains? input "arib") (clojure.core/assoc :arib (deser-m-2ts-arib (input "arib"))) (clojure.core/contains? input "ebif") (clojure.core/assoc :ebif (deser-m-2ts-ebif-control (input "ebif"))) (clojure.core/contains? input "pcrPeriod") (clojure.core/assoc :pcr-period (deser-integer-min-0-max-500 (input "pcrPeriod"))) (clojure.core/contains? input "ccDescriptor") (clojure.core/assoc :cc-descriptor (deser-m-2ts-cc-descriptor (input "ccDescriptor"))) (clojure.core/contains? input "etvSignalPid") (clojure.core/assoc :etv-signal-pid (deser-string (input "etvSignalPid"))) (clojure.core/contains? input "pmtInterval") (clojure.core/assoc :pmt-interval (deser-integer-min-0-max-1000 (input "pmtInterval"))) (clojure.core/contains? input "segmentationStyle") (clojure.core/assoc :segmentation-style (deser-m-2ts-segmentation-style (input "segmentationStyle"))) (clojure.core/contains? input "nullPacketBitrate") (clojure.core/assoc :null-packet-bitrate (deser-double-min-0 (input "nullPacketBitrate"))) (clojure.core/contains? input "segmentationMarkers") (clojure.core/assoc :segmentation-markers (deser-m-2ts-segmentation-markers (input "segmentationMarkers"))) (clojure.core/contains? input "ebpPlacement") (clojure.core/assoc :ebp-placement (deser-m-2ts-ebp-placement (input "ebpPlacement"))) (clojure.core/contains? input "scte35Control") (clojure.core/assoc :scte-35-control (deser-m-2ts-scte-35-control (input "scte35Control"))) (clojure.core/contains? input "audioBufferModel") (clojure.core/assoc :audio-buffer-model (deser-m-2ts-audio-buffer-model (input "audioBufferModel"))) (clojure.core/contains? input "esRateInPes") (clojure.core/assoc :es-rate-in-pes (deser-m-2ts-es-rate-in-pes (input "esRateInPes"))) (clojure.core/contains? input "klv") (clojure.core/assoc :klv (deser-m-2ts-klv (input "klv"))) (clojure.core/contains? input "programNum") (clojure.core/assoc :program-num (deser-integer-min-0-max-65535 (input "programNum"))) (clojure.core/contains? input "timedMetadataPid") (clojure.core/assoc :timed-metadata-pid (deser-string (input "timedMetadataPid"))) (clojure.core/contains? input "audioStreamType") (clojure.core/assoc :audio-stream-type (deser-m-2ts-audio-stream-type (input "audioStreamType"))) (clojure.core/contains? input "scte27Pids") (clojure.core/assoc :scte-27-pids (deser-string (input "scte27Pids"))) (clojure.core/contains? input "aribCaptionsPidControl") (clojure.core/assoc :arib-captions-pid-control (deser-m-2ts-arib-captions-pid-control (input "aribCaptionsPidControl"))) (clojure.core/contains? input "klvDataPids") (clojure.core/assoc :klv-data-pids (deser-string (input "klvDataPids"))) (clojure.core/contains? input "dvbSubPids") (clojure.core/assoc :dvb-sub-pids (deser-string (input "dvbSubPids"))) (clojure.core/contains? input "ebpAudioInterval") (clojure.core/assoc :ebp-audio-interval (deser-m-2ts-audio-interval (input "ebpAudioInterval"))) (clojure.core/contains? input "ecmPid") (clojure.core/assoc :ecm-pid (deser-string (input "ecmPid"))) (clojure.core/contains? input "dvbNitSettings") (clojure.core/assoc :dvb-nit-settings (deser-dvb-nit-settings (input "dvbNitSettings"))) (clojure.core/contains? input "dvbTeletextPid") (clojure.core/assoc :dvb-teletext-pid (deser-string (input "dvbTeletextPid"))) (clojure.core/contains? input "aribCaptionsPid") (clojure.core/assoc :arib-captions-pid (deser-string (input "aribCaptionsPid"))) (clojure.core/contains? input "bitrate") (clojure.core/assoc :bitrate (deser-integer-min-0 (input "bitrate"))) (clojure.core/contains? input "segmentationTime") (clojure.core/assoc :segmentation-time (deser-double-min-1 (input "segmentationTime")))))

(clojure.core/defn- deser-string [input] input)

(clojure.core/defn- deser-scte-35-splice-insert-no-regional-blackout-behavior [input] (clojure.core/get {"FOLLOW" :follow, "IGNORE" :ignore} input))

(clojure.core/defn- deser-dvb-sub-source-settings [input] (clojure.core/cond-> {} (clojure.core/contains? input "pid") (clojure.core/assoc :pid (deser-integer-min-1 (input "pid")))))

(clojure.core/defn- deser-input-denoise-filter [input] (clojure.core/get {"DISABLED" :disabled, "ENABLED" :enabled} input))

(clojure.core/defn- deser-video-selector-pid [input] (clojure.core/cond-> {} (clojure.core/contains? input "pid") (clojure.core/assoc :pid (deser-integer-min-0-max-8191 (input "pid")))))

(clojure.core/defn- deser-scte-35-descriptor-settings [input] (clojure.core/cond-> {:segmentation-descriptor-scte-35-descriptor-settings (deser-scte-35-segmentation-descriptor (input "segmentationDescriptorScte35DescriptorSettings"))}))

(clojure.core/defn- deser-afd-signaling [input] (clojure.core/get {"AUTO" :auto, "FIXED" :fixed, "NONE" :none} input))

(clojure.core/defn- deser-list-of-audio-selector [input] (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (deser-audio-selector coll))) input))

(clojure.core/defn- deser-aac-profile [input] (clojure.core/get {"HEV1" :hev-1, "HEV2" :hev-2, "LC" :lc} input))

(clojure.core/defn- deser-burn-in-font-color [input] (clojure.core/get {"BLACK" :black, "BLUE" :blue, "GREEN" :green, "RED" :red, "WHITE" :white, "YELLOW" :yellow} input))

(clojure.core/defn- deser-pause-state-schedule-action-settings [input] (clojure.core/cond-> {} (clojure.core/contains? input "pipelines") (clojure.core/assoc :pipelines (deser-list-of-pipeline-pause-state-settings (input "pipelines")))))

(clojure.core/defn- deser-eac-3-metadata-control [input] (clojure.core/get {"FOLLOW_INPUT" :follow-input, "USE_CONFIGURED" :use-configured} input))

(clojure.core/defn- deser-fec-output-settings [input] (clojure.core/cond-> {} (clojure.core/contains? input "columnDepth") (clojure.core/assoc :column-depth (deser-integer-min-4-max-20 (input "columnDepth"))) (clojure.core/contains? input "includeFec") (clojure.core/assoc :include-fec (deser-fec-output-include-fec (input "includeFec"))) (clojure.core/contains? input "rowLength") (clojure.core/assoc :row-length (deser-integer-min-1-max-20 (input "rowLength")))))

(clojure.core/defn- deser-global-configuration-input-end-action [input] (clojure.core/get {"NONE" :none, "SWITCH_AND_LOOP_INPUTS" :switch-and-loop-inputs} input))

(clojure.core/defn- deser-integer-min-0-max-65535 [input] input)

(clojure.core/defn- deser-hls-webdav-http-transfer-mode [input] (clojure.core/get {"CHUNKED" :chunked, "NON_CHUNKED" :non-chunked} input))

(clojure.core/defn- deser-offering-duration-units [input] (clojure.core/get {"MONTHS" :months} input))

(clojure.core/defn- deser-hls-webdav-settings [input] (clojure.core/cond-> {} (clojure.core/contains? input "connectionRetryInterval") (clojure.core/assoc :connection-retry-interval (deser-integer-min-0 (input "connectionRetryInterval"))) (clojure.core/contains? input "filecacheDuration") (clojure.core/assoc :filecache-duration (deser-integer-min-0-max-600 (input "filecacheDuration"))) (clojure.core/contains? input "httpTransferMode") (clojure.core/assoc :http-transfer-mode (deser-hls-webdav-http-transfer-mode (input "httpTransferMode"))) (clojure.core/contains? input "numRetries") (clojure.core/assoc :num-retries (deser-integer-min-0 (input "numRetries"))) (clojure.core/contains? input "restartDelay") (clojure.core/assoc :restart-delay (deser-integer-min-0-max-15 (input "restartDelay")))))

(clojure.core/defn- deser-double-min-1 [input] input)

(clojure.core/defn- deser-dvb-sub-destination-background-color [input] (clojure.core/get {"BLACK" :black, "NONE" :none, "WHITE" :white} input))

(clojure.core/defn- deser-mp-2-coding-mode [input] (clojure.core/get {"CODING_MODE_1_0" :coding-mode-1-0, "CODING_MODE_2_0" :coding-mode-2-0} input))

(clojure.core/defn- deser-list-of-output-group [input] (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (deser-output-group coll))) input))

(clojure.core/defn- deser-reservation-resource-specification [input] (clojure.core/cond-> {} (clojure.core/contains? input "codec") (clojure.core/assoc :codec (deser-reservation-codec (input "codec"))) (clojure.core/contains? input "maximumBitrate") (clojure.core/assoc :maximum-bitrate (deser-reservation-maximum-bitrate (input "maximumBitrate"))) (clojure.core/contains? input "maximumFramerate") (clojure.core/assoc :maximum-framerate (deser-reservation-maximum-framerate (input "maximumFramerate"))) (clojure.core/contains? input "resolution") (clojure.core/assoc :resolution (deser-reservation-resolution (input "resolution"))) (clojure.core/contains? input "resourceType") (clojure.core/assoc :resource-type (deser-reservation-resource-type (input "resourceType"))) (clojure.core/contains? input "specialFeature") (clojure.core/assoc :special-feature (deser-reservation-special-feature (input "specialFeature"))) (clojure.core/contains? input "videoQuality") (clojure.core/assoc :video-quality (deser-reservation-video-quality (input "videoQuality")))))

(clojure.core/defn- deser-scte-35-delivery-restrictions [input] (clojure.core/cond-> {:device-restrictions (deser-scte-35-device-restrictions (input "deviceRestrictions")), :archive-allowed-flag (deser-scte-35-archive-allowed-flag (input "archiveAllowedFlag")), :web-delivery-allowed-flag (deser-scte-35-web-delivery-allowed-flag (input "webDeliveryAllowedFlag")), :no-regional-blackout-flag (deser-scte-35-no-regional-blackout-flag (input "noRegionalBlackoutFlag"))}))

(clojure.core/defn- deser-m-2ts-timed-metadata-behavior [input] (clojure.core/get {"NO_PASSTHROUGH" :no-passthrough, "PASSTHROUGH" :passthrough} input))

(clojure.core/defn- deser-tags [input] (clojure.core/into {} (clojure.core/map (clojure.core/fn [[k v]] [(deser-string k) (deser-string v)])) input))

(clojure.core/defn- deser-fec-output-include-fec [input] (clojure.core/get {"COLUMN" :column, "COLUMN_AND_ROW" :column-and-row} input))

(clojure.core/defn- deser-scte-35-segmentation-cancel-indicator [input] (clojure.core/get {"SEGMENTATION_EVENT_NOT_CANCELED" :segmentation-event-not-canceled, "SEGMENTATION_EVENT_CANCELED" :segmentation-event-canceled} input))

(clojure.core/defn- deser-rtmp-output-certificate-mode [input] (clojure.core/get {"SELF_SIGNED" :self-signed, "VERIFY_AUTHENTICITY" :verify-authenticity} input))

(clojure.core/defn- deser-ac-3-drc-profile [input] (clojure.core/get {"FILM_STANDARD" :film-standard, "NONE" :none} input))

(clojure.core/defn- deser-eac-3-lfe-control [input] (clojure.core/get {"LFE" :lfe, "NO_LFE" :no-lfe} input))

(clojure.core/defn- deser-teletext-source-settings [input] (clojure.core/cond-> {} (clojure.core/contains? input "pageNumber") (clojure.core/assoc :page-number (deser-string (input "pageNumber")))))

(clojure.core/defn- deser-m-3u-8-scte-35-behavior [input] (clojure.core/get {"NO_PASSTHROUGH" :no-passthrough, "PASSTHROUGH" :passthrough} input))

(clojure.core/defn- deser-rtmp-output-settings [input] (clojure.core/cond-> {:destination (deser-output-location-ref (input "destination"))} (clojure.core/contains? input "certificateMode") (clojure.core/assoc :certificate-mode (deser-rtmp-output-certificate-mode (input "certificateMode"))) (clojure.core/contains? input "connectionRetryInterval") (clojure.core/assoc :connection-retry-interval (deser-integer-min-1 (input "connectionRetryInterval"))) (clojure.core/contains? input "numRetries") (clojure.core/assoc :num-retries (deser-integer-min-0 (input "numRetries")))))

(clojure.core/defn- deser-global-configuration-low-framerate-inputs [input] (clojure.core/get {"DISABLED" :disabled, "ENABLED" :enabled} input))

(clojure.core/defn- deser-eac-3-surround-mode [input] (clojure.core/get {"DISABLED" :disabled, "ENABLED" :enabled, "NOT_INDICATED" :not-indicated} input))

(clojure.core/defn- deser-avail-blanking-state [input] (clojure.core/get {"DISABLED" :disabled, "ENABLED" :enabled} input))

(clojure.core/defn- deser-audio-channel-mapping [input] (clojure.core/cond-> {:output-channel (deser-integer-min-0-max-7 (input "outputChannel")), :input-channel-levels (deser-list-of-input-channel-level (input "inputChannelLevels"))}))

(clojure.core/defn- deser-reservation-resolution [input] (clojure.core/get {"SD" :sd, "HD" :hd, "UHD" :uhd} input))

(clojure.core/defn- deser-h-264-look-ahead-rate-control [input] (clojure.core/get {"HIGH" :high, "LOW" :low, "MEDIUM" :medium} input))

(clojure.core/defn- deser-input-source [input] (clojure.core/cond-> {} (clojure.core/contains? input "passwordParam") (clojure.core/assoc :password-param (deser-string (input "passwordParam"))) (clojure.core/contains? input "url") (clojure.core/assoc :url (deser-string (input "url"))) (clojure.core/contains? input "username") (clojure.core/assoc :username (deser-string (input "username")))))

(clojure.core/defn- deser-hls-akamai-http-transfer-mode [input] (clojure.core/get {"CHUNKED" :chunked, "NON_CHUNKED" :non-chunked} input))

(clojure.core/defn- deser-reservation [input] (clojure.core/cond-> {} (clojure.core/contains? input "durationUnits") (clojure.core/assoc :duration-units (deser-offering-duration-units (input "durationUnits"))) (clojure.core/contains? input "currencyCode") (clojure.core/assoc :currency-code (deser-string (input "currencyCode"))) (clojure.core/contains? input "offeringDescription") (clojure.core/assoc :offering-description (deser-string (input "offeringDescription"))) (clojure.core/contains? input "resourceSpecification") (clojure.core/assoc :resource-specification (deser-reservation-resource-specification (input "resourceSpecification"))) (clojure.core/contains? input "start") (clojure.core/assoc :start (deser-string (input "start"))) (clojure.core/contains? input "fixedPrice") (clojure.core/assoc :fixed-price (deser-double (input "fixedPrice"))) (clojure.core/contains? input "end") (clojure.core/assoc :end (deser-string (input "end"))) (clojure.core/contains? input "count") (clojure.core/assoc :count (deser-integer (input "count"))) (clojure.core/contains? input "offeringId") (clojure.core/assoc :offering-id (deser-string (input "offeringId"))) (clojure.core/contains? input "duration") (clojure.core/assoc :duration (deser-integer (input "duration"))) (clojure.core/contains? input "usagePrice") (clojure.core/assoc :usage-price (deser-double (input "usagePrice"))) (clojure.core/contains? input "arn") (clojure.core/assoc :arn (deser-string (input "arn"))) (clojure.core/contains? input "state") (clojure.core/assoc :state (deser-reservation-state (input "state"))) (clojure.core/contains? input "offeringType") (clojure.core/assoc :offering-type (deser-offering-type (input "offeringType"))) (clojure.core/contains? input "name") (clojure.core/assoc :name (deser-string (input "name"))) (clojure.core/contains? input "reservationId") (clojure.core/assoc :reservation-id (deser-string (input "reservationId"))) (clojure.core/contains? input "region") (clojure.core/assoc :region (deser-string (input "region")))))

(clojure.core/defn- deser-h-264-sub-gop-length [input] (clojure.core/get {"DYNAMIC" :dynamic, "FIXED" :fixed} input))

(clojure.core/defn- deser-ms-smooth-output-settings [input] (clojure.core/cond-> {} (clojure.core/contains? input "nameModifier") (clojure.core/assoc :name-modifier (deser-string (input "nameModifier")))))

(clojure.core/defn- deser-video-selector-settings [input] (clojure.core/cond-> {} (clojure.core/contains? input "videoSelectorPid") (clojure.core/assoc :video-selector-pid (deser-video-selector-pid (input "videoSelectorPid"))) (clojure.core/contains? input "videoSelectorProgramId") (clojure.core/assoc :video-selector-program-id (deser-video-selector-program-id (input "videoSelectorProgramId")))))

(clojure.core/defn- deser-eac-3-lfe-filter [input] (clojure.core/get {"DISABLED" :disabled, "ENABLED" :enabled} input))

(clojure.core/defn- deser-reservation-maximum-bitrate [input] (clojure.core/get {"MAX_10_MBPS" :max-10-mbps, "MAX_20_MBPS" :max-20-mbps, "MAX_50_MBPS" :max-50-mbps} input))

(clojure.core/defn- deser-offering [input] (clojure.core/cond-> {} (clojure.core/contains? input "durationUnits") (clojure.core/assoc :duration-units (deser-offering-duration-units (input "durationUnits"))) (clojure.core/contains? input "currencyCode") (clojure.core/assoc :currency-code (deser-string (input "currencyCode"))) (clojure.core/contains? input "offeringDescription") (clojure.core/assoc :offering-description (deser-string (input "offeringDescription"))) (clojure.core/contains? input "resourceSpecification") (clojure.core/assoc :resource-specification (deser-reservation-resource-specification (input "resourceSpecification"))) (clojure.core/contains? input "fixedPrice") (clojure.core/assoc :fixed-price (deser-double (input "fixedPrice"))) (clojure.core/contains? input "offeringId") (clojure.core/assoc :offering-id (deser-string (input "offeringId"))) (clojure.core/contains? input "duration") (clojure.core/assoc :duration (deser-integer (input "duration"))) (clojure.core/contains? input "usagePrice") (clojure.core/assoc :usage-price (deser-double (input "usagePrice"))) (clojure.core/contains? input "arn") (clojure.core/assoc :arn (deser-string (input "arn"))) (clojure.core/contains? input "offeringType") (clojure.core/assoc :offering-type (deser-offering-type (input "offeringType"))) (clojure.core/contains? input "region") (clojure.core/assoc :region (deser-string (input "region")))))

(clojure.core/defn- deser-integer-min-negative-60-max-60 [input] input)

(clojure.core/defn- deser-integer-min-0-max-8589934591 [input] input)

(clojure.core/defn- deser-list-of-input-channel-level [input] (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (deser-input-channel-level coll))) input))

(clojure.core/defn- deser-h-264-rate-control-mode [input] (clojure.core/get {"CBR" :cbr, "QVBR" :qvbr, "VBR" :vbr} input))

(clojure.core/defn- deser-integer-min-0-max-255 [input] input)

(clojure.core/defn- deser-list-of-output-destination [input] (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (deser-output-destination coll))) input))

(clojure.core/defn- deser-video-selector [input] (clojure.core/cond-> {} (clojure.core/contains? input "colorSpace") (clojure.core/assoc :color-space (deser-video-selector-color-space (input "colorSpace"))) (clojure.core/contains? input "colorSpaceUsage") (clojure.core/assoc :color-space-usage (deser-video-selector-color-space-usage (input "colorSpaceUsage"))) (clojure.core/contains? input "selectorSettings") (clojure.core/assoc :selector-settings (deser-video-selector-settings (input "selectorSettings")))))

(clojure.core/defn- deser-ac-3-metadata-control [input] (clojure.core/get {"FOLLOW_INPUT" :follow-input, "USE_CONFIGURED" :use-configured} input))

(clojure.core/defn- deser-double-min-0 [input] input)

(clojure.core/defn- deser-m-2ts-buffer-model [input] (clojure.core/get {"MULTIPLEX" :multiplex, "NONE" :none} input))

(clojure.core/defn- deser-udp-container-settings [input] (clojure.core/cond-> {} (clojure.core/contains? input "m2tsSettings") (clojure.core/assoc :m-2ts-settings (deser-m-2ts-settings (input "m2tsSettings")))))

(clojure.core/defn- deser-channel-summary [input] (clojure.core/cond-> {} (clojure.core/contains? input "inputAttachments") (clojure.core/assoc :input-attachments (deser-list-of-input-attachment (input "inputAttachments"))) (clojure.core/contains? input "pipelinesRunningCount") (clojure.core/assoc :pipelines-running-count (deser-integer (input "pipelinesRunningCount"))) (clojure.core/contains? input "logLevel") (clojure.core/assoc :log-level (deser-log-level (input "logLevel"))) (clojure.core/contains? input "roleArn") (clojure.core/assoc :role-arn (deser-string (input "roleArn"))) (clojure.core/contains? input "tags") (clojure.core/assoc :tags (deser-tags (input "tags"))) (clojure.core/contains? input "egressEndpoints") (clojure.core/assoc :egress-endpoints (deser-list-of-channel-egress-endpoint (input "egressEndpoints"))) (clojure.core/contains? input "arn") (clojure.core/assoc :arn (deser-string (input "arn"))) (clojure.core/contains? input "inputSpecification") (clojure.core/assoc :input-specification (deser-input-specification (input "inputSpecification"))) (clojure.core/contains? input "state") (clojure.core/assoc :state (deser-channel-state (input "state"))) (clojure.core/contains? input "destinations") (clojure.core/assoc :destinations (deser-list-of-output-destination (input "destinations"))) (clojure.core/contains? input "name") (clojure.core/assoc :name (deser-string (input "name"))) (clojure.core/contains? input "id") (clojure.core/assoc :id (deser-string (input "id")))))

(clojure.core/defn- deser-integer-min-25-max-10000 [input] input)

(clojure.core/defn- deser-eac-3-coding-mode [input] (clojure.core/get {"CODING_MODE_1_0" :coding-mode-1-0, "CODING_MODE_2_0" :coding-mode-2-0, "CODING_MODE_3_2" :coding-mode-3-2} input))

(clojure.core/defn- deser-m-2ts-ebif-control [input] (clojure.core/get {"NONE" :none, "PASSTHROUGH" :passthrough} input))

(clojure.core/defn- deser-caption-description [input] (clojure.core/cond-> {:caption-selector-name (deser-string (input "captionSelectorName")), :name (deser-string (input "name"))} (clojure.core/contains? input "destinationSettings") (clojure.core/assoc :destination-settings (deser-caption-destination-settings (input "destinationSettings"))) (clojure.core/contains? input "languageCode") (clojure.core/assoc :language-code (deser-string (input "languageCode"))) (clojure.core/contains? input "languageDescription") (clojure.core/assoc :language-description (deser-string (input "languageDescription")))))

(clojure.core/defn- deser-hls-media-store-settings [input] (clojure.core/cond-> {} (clojure.core/contains? input "connectionRetryInterval") (clojure.core/assoc :connection-retry-interval (deser-integer-min-0 (input "connectionRetryInterval"))) (clojure.core/contains? input "filecacheDuration") (clojure.core/assoc :filecache-duration (deser-integer-min-0-max-600 (input "filecacheDuration"))) (clojure.core/contains? input "mediaStoreStorageClass") (clojure.core/assoc :media-store-storage-class (deser-hls-media-store-storage-class (input "mediaStoreStorageClass"))) (clojure.core/contains? input "numRetries") (clojure.core/assoc :num-retries (deser-integer-min-0 (input "numRetries"))) (clojure.core/contains? input "restartDelay") (clojure.core/assoc :restart-delay (deser-integer-min-0-max-15 (input "restartDelay")))))

(clojure.core/defn- deser-smooth-group-stream-manifest-behavior [input] (clojure.core/get {"DO_NOT_SEND" :do-not-send, "SEND" :send} input))

(clojure.core/defn- deser-timecode-config-source [input] (clojure.core/get {"EMBEDDED" :embedded, "SYSTEMCLOCK" :systemclock, "ZEROBASED" :zerobased} input))

(clojure.core/defn- deser-m-2ts-audio-interval [input] (clojure.core/get {"VIDEO_AND_FIXED_INTERVALS" :video-and-fixed-intervals, "VIDEO_INTERVAL" :video-interval} input))

(clojure.core/defn- deser-schedule-action-settings [input] (clojure.core/cond-> {} (clojure.core/contains? input "hlsTimedMetadataSettings") (clojure.core/assoc :hls-timed-metadata-settings (deser-hls-timed-metadata-schedule-action-settings (input "hlsTimedMetadataSettings"))) (clojure.core/contains? input "inputSwitchSettings") (clojure.core/assoc :input-switch-settings (deser-input-switch-schedule-action-settings (input "inputSwitchSettings"))) (clojure.core/contains? input "pauseStateSettings") (clojure.core/assoc :pause-state-settings (deser-pause-state-schedule-action-settings (input "pauseStateSettings"))) (clojure.core/contains? input "scte35ReturnToNetworkSettings") (clojure.core/assoc :scte-35-return-to-network-settings (deser-scte-35-return-to-network-schedule-action-settings (input "scte35ReturnToNetworkSettings"))) (clojure.core/contains? input "scte35SpliceInsertSettings") (clojure.core/assoc :scte-35-splice-insert-settings (deser-scte-35-splice-insert-schedule-action-settings (input "scte35SpliceInsertSettings"))) (clojure.core/contains? input "scte35TimeSignalSettings") (clojure.core/assoc :scte-35-time-signal-settings (deser-scte-35-time-signal-schedule-action-settings (input "scte35TimeSignalSettings"))) (clojure.core/contains? input "staticImageActivateSettings") (clojure.core/assoc :static-image-activate-settings (deser-static-image-activate-schedule-action-settings (input "staticImageActivateSettings"))) (clojure.core/contains? input "staticImageDeactivateSettings") (clojure.core/assoc :static-image-deactivate-settings (deser-static-image-deactivate-schedule-action-settings (input "staticImageDeactivateSettings")))))

(clojure.core/defn- deser-audio-pid-selection [input] (clojure.core/cond-> {:pid (deser-integer-min-0-max-8191 (input "pid"))}))

(clojure.core/defn- deser-hls-output-selection [input] (clojure.core/get {"MANIFESTS_AND_SEGMENTS" :manifests-and-segments, "SEGMENTS_ONLY" :segments-only} input))

(clojure.core/defn- deser-input-loss-action-for-udp-out [input] (clojure.core/get {"DROP_PROGRAM" :drop-program, "DROP_TS" :drop-ts, "EMIT_PROGRAM" :emit-program} input))

(clojure.core/defn- deser-ac-3-bitstream-mode [input] (clojure.core/get {"COMMENTARY" :commentary, "COMPLETE_MAIN" :complete-main, "DIALOGUE" :dialogue, "EMERGENCY" :emergency, "HEARING_IMPAIRED" :hearing-impaired, "MUSIC_AND_EFFECTS" :music-and-effects, "VISUALLY_IMPAIRED" :visually-impaired, "VOICE_OVER" :voice-over} input))

(clojure.core/defn- deser-scte-35-time-signal-apos [input] (clojure.core/cond-> {} (clojure.core/contains? input "adAvailOffset") (clojure.core/assoc :ad-avail-offset (deser-integer-min-negative-1000-max-1000 (input "adAvailOffset"))) (clojure.core/contains? input "noRegionalBlackoutFlag") (clojure.core/assoc :no-regional-blackout-flag (deser-scte-35-apos-no-regional-blackout-behavior (input "noRegionalBlackoutFlag"))) (clojure.core/contains? input "webDeliveryAllowedFlag") (clojure.core/assoc :web-delivery-allowed-flag (deser-scte-35-apos-web-delivery-allowed-behavior (input "webDeliveryAllowedFlag")))))

(clojure.core/defn- deser-h-264-spatial-aq [input] (clojure.core/get {"DISABLED" :disabled, "ENABLED" :enabled} input))

(clojure.core/defn- deser-aac-raw-format [input] (clojure.core/get {"LATM_LOAS" :latm-loas, "NONE" :none} input))

(clojure.core/defn- deser-static-image-activate-schedule-action-settings [input] (clojure.core/cond-> {:image (deser-input-location (input "image"))} (clojure.core/contains? input "opacity") (clojure.core/assoc :opacity (deser-integer-min-0-max-100 (input "opacity"))) (clojure.core/contains? input "imageX") (clojure.core/assoc :image-x (deser-integer-min-0 (input "imageX"))) (clojure.core/contains? input "width") (clojure.core/assoc :width (deser-integer-min-1 (input "width"))) (clojure.core/contains? input "layer") (clojure.core/assoc :layer (deser-integer-min-0-max-7 (input "layer"))) (clojure.core/contains? input "duration") (clojure.core/assoc :duration (deser-integer-min-0 (input "duration"))) (clojure.core/contains? input "fadeIn") (clojure.core/assoc :fade-in (deser-integer-min-0 (input "fadeIn"))) (clojure.core/contains? input "height") (clojure.core/assoc :height (deser-integer-min-1 (input "height"))) (clojure.core/contains? input "imageY") (clojure.core/assoc :image-y (deser-integer-min-0 (input "imageY"))) (clojure.core/contains? input "fadeOut") (clojure.core/assoc :fade-out (deser-integer-min-0 (input "fadeOut")))))

(clojure.core/defn- deser-list-of-input-security-group [input] (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (deser-input-security-group coll))) input))

(clojure.core/defn- deser-output-destination [input] (clojure.core/cond-> {} (clojure.core/contains? input "id") (clojure.core/assoc :id (deser-string (input "id"))) (clojure.core/contains? input "settings") (clojure.core/assoc :settings (deser-list-of-output-destination-settings (input "settings")))))

(clojure.core/defn- deser-integer-min-30 [input] input)

(clojure.core/defn- deser-reservation-special-feature [input] (clojure.core/get {"ADVANCED_AUDIO" :advanced-audio, "AUDIO_NORMALIZATION" :audio-normalization} input))

(clojure.core/defn- deser-input-maximum-bitrate [input] (clojure.core/get {"MAX_10_MBPS" :max-10-mbps, "MAX_20_MBPS" :max-20-mbps, "MAX_50_MBPS" :max-50-mbps} input))

(clojure.core/defn- deser-reservation-video-quality [input] (clojure.core/get {"STANDARD" :standard, "ENHANCED" :enhanced, "PREMIUM" :premium} input))

(clojure.core/defn- deser-integer-min-0-max-3600 [input] input)

(clojure.core/defn- deser-video-selector-color-space [input] (clojure.core/get {"FOLLOW" :follow, "REC_601" :rec-601, "REC_709" :rec-709} input))

(clojure.core/defn- deser-audio-only-hls-settings [input] (clojure.core/cond-> {} (clojure.core/contains? input "audioGroupId") (clojure.core/assoc :audio-group-id (deser-string (input "audioGroupId"))) (clojure.core/contains? input "audioOnlyImage") (clojure.core/assoc :audio-only-image (deser-input-location (input "audioOnlyImage"))) (clojure.core/contains? input "audioTrackType") (clojure.core/assoc :audio-track-type (deser-audio-only-hls-track-type (input "audioTrackType")))))

(clojure.core/defn- deser-m-2ts-segmentation-markers [input] (clojure.core/get {"EBP" :ebp, "EBP_LEGACY" :ebp-legacy, "NONE" :none, "PSI_SEGSTART" :psi-segstart, "RAI_ADAPT" :rai-adapt, "RAI_SEGSTART" :rai-segstart} input))

(clojure.core/defn- deser-eac-3-drc-line [input] (clojure.core/get {"FILM_LIGHT" :film-light, "FILM_STANDARD" :film-standard, "MUSIC_LIGHT" :music-light, "MUSIC_STANDARD" :music-standard, "NONE" :none, "SPEECH" :speech} input))

(clojure.core/defn- deser-dvb-sub-destination-alignment [input] (clojure.core/get {"CENTERED" :centered, "LEFT" :left, "SMART" :smart} input))

(clojure.core/defn- deser-m-2ts-scte-35-control [input] (clojure.core/get {"NONE" :none, "PASSTHROUGH" :passthrough} input))

(clojure.core/defn- deser-input-location [input] (clojure.core/cond-> {:uri (deser-string (input "uri"))} (clojure.core/contains? input "passwordParam") (clojure.core/assoc :password-param (deser-string (input "passwordParam"))) (clojure.core/contains? input "username") (clojure.core/assoc :username (deser-string (input "username")))))

(clojure.core/defn- deser-m-2ts-absent-input-audio-behavior [input] (clojure.core/get {"DROP" :drop, "ENCODE_SILENCE" :encode-silence} input))

(clojure.core/defn- deser-integer-min-3 [input] input)

(clojure.core/defn- deser-h-264-level [input] (clojure.core/get {"H264_LEVEL_4_2" :h-264-level-4-2, "H264_LEVEL_2_2" :h-264-level-2-2, "H264_LEVEL_2" :h-264-level-2, "H264_LEVEL_1_1" :h-264-level-1-1, "H264_LEVEL_5" :h-264-level-5, "H264_LEVEL_1_3" :h-264-level-1-3, "H264_LEVEL_3" :h-264-level-3, "H264_LEVEL_2_1" :h-264-level-2-1, "H264_LEVEL_1_2" :h-264-level-1-2, "H264_LEVEL_1" :h-264-level-1, "H264_LEVEL_3_2" :h-264-level-3-2, "H264_LEVEL_4" :h-264-level-4, "H264_LEVEL_5_1" :h-264-level-5-1, "H264_LEVEL_3_1" :h-264-level-3-1, "H264_LEVEL_AUTO" :h-264-level-auto, "H264_LEVEL_5_2" :h-264-level-5-2, "H264_LEVEL_4_1" :h-264-level-4-1} input))

(clojure.core/defn- deser-avail-settings [input] (clojure.core/cond-> {} (clojure.core/contains? input "scte35SpliceInsert") (clojure.core/assoc :scte-35-splice-insert (deser-scte-35-splice-insert (input "scte35SpliceInsert"))) (clojure.core/contains? input "scte35TimeSignalApos") (clojure.core/assoc :scte-35-time-signal-apos (deser-scte-35-time-signal-apos (input "scte35TimeSignalApos")))))

(clojure.core/defn- deser-h-264-par-control [input] (clojure.core/get {"INITIALIZE_FROM_SOURCE" :initialize-from-source, "SPECIFIED" :specified} input))

(clojure.core/defn- deser-input-security-group [input] (clojure.core/cond-> {} (clojure.core/contains? input "arn") (clojure.core/assoc :arn (deser-string (input "arn"))) (clojure.core/contains? input "id") (clojure.core/assoc :id (deser-string (input "id"))) (clojure.core/contains? input "inputs") (clojure.core/assoc :inputs (deser-list-of-string (input "inputs"))) (clojure.core/contains? input "state") (clojure.core/assoc :state (deser-input-security-group-state (input "state"))) (clojure.core/contains? input "tags") (clojure.core/assoc :tags (deser-tags (input "tags"))) (clojure.core/contains? input "whitelistRules") (clojure.core/assoc :whitelist-rules (deser-list-of-input-whitelist-rule (input "whitelistRules")))))

(clojure.core/defn- deser-smooth-group-audio-only-timecode-control [input] (clojure.core/get {"PASSTHROUGH" :passthrough, "USE_CONFIGURED_CLOCK" :use-configured-clock} input))

(clojure.core/defn- deser-pipeline-id [input] (clojure.core/get {"PIPELINE_0" :pipeline-0, "PIPELINE_1" :pipeline-1} input))

(clojure.core/defn- deser-video-description [input] (clojure.core/cond-> {:name (deser-string (input "name"))} (clojure.core/contains? input "codecSettings") (clojure.core/assoc :codec-settings (deser-video-codec-settings (input "codecSettings"))) (clojure.core/contains? input "height") (clojure.core/assoc :height (deser-integer (input "height"))) (clojure.core/contains? input "respondToAfd") (clojure.core/assoc :respond-to-afd (deser-video-description-respond-to-afd (input "respondToAfd"))) (clojure.core/contains? input "scalingBehavior") (clojure.core/assoc :scaling-behavior (deser-video-description-scaling-behavior (input "scalingBehavior"))) (clojure.core/contains? input "sharpness") (clojure.core/assoc :sharpness (deser-integer-min-0-max-100 (input "sharpness"))) (clojure.core/contains? input "width") (clojure.core/assoc :width (deser-integer (input "width")))))

(clojure.core/defn- deser-integer-min-0-max-15 [input] input)

(clojure.core/defn- deser-global-configuration-output-timing-source [input] (clojure.core/get {"INPUT_CLOCK" :input-clock, "SYSTEM_CLOCK" :system-clock} input))

(clojure.core/defn- deser-scte-35-no-regional-blackout-flag [input] (clojure.core/get {"REGIONAL_BLACKOUT" :regional-blackout, "NO_REGIONAL_BLACKOUT" :no-regional-blackout} input))

(clojure.core/defn- deser-integer-min-1-max-10 [input] input)

(clojure.core/defn- deser-audio-language-selection [input] (clojure.core/cond-> {:language-code (deser-string (input "languageCode"))} (clojure.core/contains? input "languageSelectionPolicy") (clojure.core/assoc :language-selection-policy (deser-audio-language-selection-policy (input "languageSelectionPolicy")))))

(clojure.core/defn- deser-reservation-codec [input] (clojure.core/get {"MPEG2" :mpeg-2, "AVC" :avc, "HEVC" :hevc, "AUDIO" :audio} input))

(clojure.core/defn- deser-output-group-settings [input] (clojure.core/cond-> {} (clojure.core/contains? input "archiveGroupSettings") (clojure.core/assoc :archive-group-settings (deser-archive-group-settings (input "archiveGroupSettings"))) (clojure.core/contains? input "frameCaptureGroupSettings") (clojure.core/assoc :frame-capture-group-settings (deser-frame-capture-group-settings (input "frameCaptureGroupSettings"))) (clojure.core/contains? input "hlsGroupSettings") (clojure.core/assoc :hls-group-settings (deser-hls-group-settings (input "hlsGroupSettings"))) (clojure.core/contains? input "msSmoothGroupSettings") (clojure.core/assoc :ms-smooth-group-settings (deser-ms-smooth-group-settings (input "msSmoothGroupSettings"))) (clojure.core/contains? input "rtmpGroupSettings") (clojure.core/assoc :rtmp-group-settings (deser-rtmp-group-settings (input "rtmpGroupSettings"))) (clojure.core/contains? input "udpGroupSettings") (clojure.core/assoc :udp-group-settings (deser-udp-group-settings (input "udpGroupSettings")))))

(clojure.core/defn- deser-integer-min-96-max-600 [input] input)

(clojure.core/defn- deser-rtmp-cache-full-behavior [input] (clojure.core/get {"DISCONNECT_IMMEDIATELY" :disconnect-immediately, "WAIT_FOR_SERVER" :wait-for-server} input))

(clojure.core/defn- deser-input-destination-vpc [input] (clojure.core/cond-> {} (clojure.core/contains? input "availabilityZone") (clojure.core/assoc :availability-zone (deser-string (input "availabilityZone"))) (clojure.core/contains? input "networkInterfaceId") (clojure.core/assoc :network-interface-id (deser-string (input "networkInterfaceId")))))

(clojure.core/defn- deser-avail-configuration [input] (clojure.core/cond-> {} (clojure.core/contains? input "availSettings") (clojure.core/assoc :avail-settings (deser-avail-settings (input "availSettings")))))

(clojure.core/defn- deser-archive-container-settings [input] (clojure.core/cond-> {} (clojure.core/contains? input "m2tsSettings") (clojure.core/assoc :m-2ts-settings (deser-m-2ts-settings (input "m2tsSettings")))))

(clojure.core/defn- deser-list-of-hls-ad-markers [input] (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (deser-hls-ad-markers coll))) input))

(clojure.core/defn- deser-blackout-slate-state [input] (clojure.core/get {"DISABLED" :disabled, "ENABLED" :enabled} input))

(clojure.core/defn- deser-mp-2-settings [input] (clojure.core/cond-> {} (clojure.core/contains? input "bitrate") (clojure.core/assoc :bitrate (deser-double (input "bitrate"))) (clojure.core/contains? input "codingMode") (clojure.core/assoc :coding-mode (deser-mp-2-coding-mode (input "codingMode"))) (clojure.core/contains? input "sampleRate") (clojure.core/assoc :sample-rate (deser-double (input "sampleRate")))))

(clojure.core/defn- deser-arib-destination-settings [input] (clojure.core/cond-> {}))

(clojure.core/defn- deser-reservation-maximum-framerate [input] (clojure.core/get {"MAX_30_FPS" :max-30-fps, "MAX_60_FPS" :max-60-fps} input))

(clojure.core/defn- deser-smooth-group-sparse-track-type [input] (clojure.core/get {"NONE" :none, "SCTE_35" :scte-35} input))

(clojure.core/defn- deser-m-2ts-es-rate-in-pes [input] (clojure.core/get {"EXCLUDE" :exclude, "INCLUDE" :include} input))

(clojure.core/defn- deser-caption-destination-settings [input] (clojure.core/cond-> {} (clojure.core/contains? input "ttmlDestinationSettings") (clojure.core/assoc :ttml-destination-settings (deser-ttml-destination-settings (input "ttmlDestinationSettings"))) (clojure.core/contains? input "burnInDestinationSettings") (clojure.core/assoc :burn-in-destination-settings (deser-burn-in-destination-settings (input "burnInDestinationSettings"))) (clojure.core/contains? input "scte27DestinationSettings") (clojure.core/assoc :scte-27-destination-settings (deser-scte-27-destination-settings (input "scte27DestinationSettings"))) (clojure.core/contains? input "aribDestinationSettings") (clojure.core/assoc :arib-destination-settings (deser-arib-destination-settings (input "aribDestinationSettings"))) (clojure.core/contains? input "rtmpCaptionInfoDestinationSettings") (clojure.core/assoc :rtmp-caption-info-destination-settings (deser-rtmp-caption-info-destination-settings (input "rtmpCaptionInfoDestinationSettings"))) (clojure.core/contains? input "webvttDestinationSettings") (clojure.core/assoc :webvtt-destination-settings (deser-webvtt-destination-settings (input "webvttDestinationSettings"))) (clojure.core/contains? input "teletextDestinationSettings") (clojure.core/assoc :teletext-destination-settings (deser-teletext-destination-settings (input "teletextDestinationSettings"))) (clojure.core/contains? input "smpteTtDestinationSettings") (clojure.core/assoc :smpte-tt-destination-settings (deser-smpte-tt-destination-settings (input "smpteTtDestinationSettings"))) (clojure.core/contains? input "dvbSubDestinationSettings") (clojure.core/assoc :dvb-sub-destination-settings (deser-dvb-sub-destination-settings (input "dvbSubDestinationSettings"))) (clojure.core/contains? input "embeddedDestinationSettings") (clojure.core/assoc :embedded-destination-settings (deser-embedded-destination-settings (input "embeddedDestinationSettings"))) (clojure.core/contains? input "embeddedPlusScte20DestinationSettings") (clojure.core/assoc :embedded-plus-scte-20-destination-settings (deser-embedded-plus-scte-20-destination-settings (input "embeddedPlusScte20DestinationSettings"))) (clojure.core/contains? input "scte20PlusEmbeddedDestinationSettings") (clojure.core/assoc :scte-20-plus-embedded-destination-settings (deser-scte-20-plus-embedded-destination-settings (input "scte20PlusEmbeddedDestinationSettings")))))

(clojure.core/defn- deser-integer-min-1000-max-30000 [input] input)

(clojure.core/defn- deser-hls-input-settings [input] (clojure.core/cond-> {} (clojure.core/contains? input "bandwidth") (clojure.core/assoc :bandwidth (deser-integer-min-0 (input "bandwidth"))) (clojure.core/contains? input "bufferSegments") (clojure.core/assoc :buffer-segments (deser-integer-min-0 (input "bufferSegments"))) (clojure.core/contains? input "retries") (clojure.core/assoc :retries (deser-integer-min-0 (input "retries"))) (clojure.core/contains? input "retryInterval") (clojure.core/assoc :retry-interval (deser-integer-min-0 (input "retryInterval")))))

(clojure.core/defn- deser-hls-ad-markers [input] (clojure.core/get {"ADOBE" :adobe, "ELEMENTAL" :elemental, "ELEMENTAL_SCTE35" :elemental-scte-35} input))

(clojure.core/defn- deser-list-of-input-whitelist-rule [input] (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (deser-input-whitelist-rule coll))) input))

(clojure.core/defn- deser-list-of-string [input] (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (deser-string coll))) input))

(clojure.core/defn- deser-channel-state [input] (clojure.core/get {"IDLE" :idle, "CREATE_FAILED" :create-failed, "STARTING" :starting, "DELETING" :deleting, "CREATING" :creating, "DELETED" :deleted, "RECOVERING" :recovering, "STOPPING" :stopping, "RUNNING" :running} input))

(clojure.core/defn- deser-m-2ts-segmentation-style [input] (clojure.core/get {"MAINTAIN_CADENCE" :maintain-cadence, "RESET_CADENCE" :reset-cadence} input))

(clojure.core/defn- deser-integer-min-0-max-30 [input] input)

(clojure.core/defn- deser-hls-iv-source [input] (clojure.core/get {"EXPLICIT" :explicit, "FOLLOWS_SEGMENT_NUMBER" :follows-segment-number} input))

(clojure.core/defn- deser-authentication-scheme [input] (clojure.core/get {"AKAMAI" :akamai, "COMMON" :common} input))

(clojure.core/defn- deser-standard-hls-settings [input] (clojure.core/cond-> {:m-3u-8-settings (deser-m-3u-8-settings (input "m3u8Settings"))} (clojure.core/contains? input "audioRenditionSets") (clojure.core/assoc :audio-rendition-sets (deser-string (input "audioRenditionSets")))))

(clojure.core/defn- deser-list-of-input-attachment [input] (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (deser-input-attachment coll))) input))

(clojure.core/defn- deser-hls-cdn-settings [input] (clojure.core/cond-> {} (clojure.core/contains? input "hlsAkamaiSettings") (clojure.core/assoc :hls-akamai-settings (deser-hls-akamai-settings (input "hlsAkamaiSettings"))) (clojure.core/contains? input "hlsBasicPutSettings") (clojure.core/assoc :hls-basic-put-settings (deser-hls-basic-put-settings (input "hlsBasicPutSettings"))) (clojure.core/contains? input "hlsMediaStoreSettings") (clojure.core/assoc :hls-media-store-settings (deser-hls-media-store-settings (input "hlsMediaStoreSettings"))) (clojure.core/contains? input "hlsWebdavSettings") (clojure.core/assoc :hls-webdav-settings (deser-hls-webdav-settings (input "hlsWebdavSettings")))))

(clojure.core/defn- deser-scte-35-descriptor [input] (clojure.core/cond-> {:scte-35-descriptor-settings (deser-scte-35-descriptor-settings (input "scte35DescriptorSettings"))}))

(clojure.core/defn- deser-smooth-group-event-stop-behavior [input] (clojure.core/get {"NONE" :none, "SEND_EOS" :send-eos} input))

(clojure.core/defn- deser-list-of-input-destination [input] (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (deser-input-destination coll))) input))

(clojure.core/defn- deser-scte-35-splice-insert [input] (clojure.core/cond-> {} (clojure.core/contains? input "adAvailOffset") (clojure.core/assoc :ad-avail-offset (deser-integer-min-negative-1000-max-1000 (input "adAvailOffset"))) (clojure.core/contains? input "noRegionalBlackoutFlag") (clojure.core/assoc :no-regional-blackout-flag (deser-scte-35-splice-insert-no-regional-blackout-behavior (input "noRegionalBlackoutFlag"))) (clojure.core/contains? input "webDeliveryAllowedFlag") (clojure.core/assoc :web-delivery-allowed-flag (deser-scte-35-splice-insert-web-delivery-allowed-behavior (input "webDeliveryAllowedFlag")))))

(clojure.core/defn- deser-m-2ts-rate-mode [input] (clojure.core/get {"CBR" :cbr, "VBR" :vbr} input))

(clojure.core/defn- deser-eac-3-bitstream-mode [input] (clojure.core/get {"COMMENTARY" :commentary, "COMPLETE_MAIN" :complete-main, "EMERGENCY" :emergency, "HEARING_IMPAIRED" :hearing-impaired, "VISUALLY_IMPAIRED" :visually-impaired} input))

(clojure.core/defn- deser-input-channel-level [input] (clojure.core/cond-> {:input-channel (deser-integer-min-0-max-15 (input "inputChannel")), :gain (deser-integer-min-negative-60-max-6 (input "gain"))}))

(clojure.core/defn- deser-h-264-profile [input] (clojure.core/get {"BASELINE" :baseline, "HIGH" :high, "HIGH_10BIT" :high-10-bit, "HIGH_422" :high-422, "HIGH_422_10BIT" :high-422-10-bit, "MAIN" :main} input))

(clojure.core/defn- deser-batch-schedule-action-delete-result [input] (clojure.core/cond-> {:schedule-actions (deser-list-of-schedule-action (input "scheduleActions"))}))

(clojure.core/defn- deser-m-2ts-arib-captions-pid-control [input] (clojure.core/get {"AUTO" :auto, "USE_CONFIGURED" :use-configured} input))

(clojure.core/defn- deser-integer-min-0-max-100 [input] input)

(clojure.core/defn- deser-integer-min-1-max-6 [input] input)

(clojure.core/defn- deser-input [input] (clojure.core/cond-> {} (clojure.core/contains? input "mediaConnectFlows") (clojure.core/assoc :media-connect-flows (deser-list-of-media-connect-flow (input "mediaConnectFlows"))) (clojure.core/contains? input "type") (clojure.core/assoc :type (deser-input-type (input "type"))) (clojure.core/contains? input "securityGroups") (clojure.core/assoc :security-groups (deser-list-of-string (input "securityGroups"))) (clojure.core/contains? input "roleArn") (clojure.core/assoc :role-arn (deser-string (input "roleArn"))) (clojure.core/contains? input "tags") (clojure.core/assoc :tags (deser-tags (input "tags"))) (clojure.core/contains? input "arn") (clojure.core/assoc :arn (deser-string (input "arn"))) (clojure.core/contains? input "state") (clojure.core/assoc :state (deser-input-state (input "state"))) (clojure.core/contains? input "destinations") (clojure.core/assoc :destinations (deser-list-of-input-destination (input "destinations"))) (clojure.core/contains? input "name") (clojure.core/assoc :name (deser-string (input "name"))) (clojure.core/contains? input "sources") (clojure.core/assoc :sources (deser-list-of-input-source (input "sources"))) (clojure.core/contains? input "attachedChannels") (clojure.core/assoc :attached-channels (deser-list-of-string (input "attachedChannels"))) (clojure.core/contains? input "id") (clojure.core/assoc :id (deser-string (input "id")))))

(clojure.core/defn- deser-m-2ts-cc-descriptor [input] (clojure.core/get {"DISABLED" :disabled, "ENABLED" :enabled} input))

(clojure.core/defn- deser-list-of-pipeline-pause-state-settings [input] (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (deser-pipeline-pause-state-settings coll))) input))

(clojure.core/defn- deser-string-min-1-max-256 [input] input)

(clojure.core/defn- deser-dvb-sub-destination-outline-color [input] (clojure.core/get {"BLACK" :black, "BLUE" :blue, "GREEN" :green, "RED" :red, "WHITE" :white, "YELLOW" :yellow} input))

(clojure.core/defn- deser-double-min-negative-59-max-0 [input] input)

(clojure.core/defn- deser-static-image-deactivate-schedule-action-settings [input] (clojure.core/cond-> {} (clojure.core/contains? input "fadeOut") (clojure.core/assoc :fade-out (deser-integer-min-0 (input "fadeOut"))) (clojure.core/contains? input "layer") (clojure.core/assoc :layer (deser-integer-min-0-max-7 (input "layer")))))

(clojure.core/defn- deser-video-codec-settings [input] (clojure.core/cond-> {} (clojure.core/contains? input "frameCaptureSettings") (clojure.core/assoc :frame-capture-settings (deser-frame-capture-settings (input "frameCaptureSettings"))) (clojure.core/contains? input "h264Settings") (clojure.core/assoc :h-264-settings (deser-h-264-settings (input "h264Settings")))))

(clojure.core/defn- deser-string-max-32 [input] input)

(clojure.core/defn- deser-eac-3-dc-filter [input] (clojure.core/get {"DISABLED" :disabled, "ENABLED" :enabled} input))

(clojure.core/defn- deser-m-3u-8-timed-metadata-behavior [input] (clojure.core/get {"NO_PASSTHROUGH" :no-passthrough, "PASSTHROUGH" :passthrough} input))

(clojure.core/defn- deser-integer-min-1-max-5 [input] input)

(clojure.core/defn- deser-h-264-scene-change-detect [input] (clojure.core/get {"DISABLED" :disabled, "ENABLED" :enabled} input))

(clojure.core/defn- deser-aac-spec [input] (clojure.core/get {"MPEG2" :mpeg-2, "MPEG4" :mpeg-4} input))

(clojure.core/defn- deser-scte-35-apos-web-delivery-allowed-behavior [input] (clojure.core/get {"FOLLOW" :follow, "IGNORE" :ignore} input))

(clojure.core/defn- deser-blackout-slate-network-end-blackout [input] (clojure.core/get {"DISABLED" :disabled, "ENABLED" :enabled} input))

(clojure.core/defn- deser-network-input-server-validation [input] (clojure.core/get {"CHECK_CRYPTOGRAPHY_AND_VALIDATE_NAME" :check-cryptography-and-validate-name, "CHECK_CRYPTOGRAPHY_ONLY" :check-cryptography-only} input))

(clojure.core/defn- deser-hls-redundant-manifest [input] (clojure.core/get {"DISABLED" :disabled, "ENABLED" :enabled} input))

(clojure.core/defn- deser-input-destination [input] (clojure.core/cond-> {} (clojure.core/contains? input "ip") (clojure.core/assoc :ip (deser-string (input "ip"))) (clojure.core/contains? input "port") (clojure.core/assoc :port (deser-string (input "port"))) (clojure.core/contains? input "url") (clojure.core/assoc :url (deser-string (input "url"))) (clojure.core/contains? input "vpc") (clojure.core/assoc :vpc (deser-input-destination-vpc (input "vpc")))))

(clojure.core/defn- deser-rtmp-caption-info-destination-settings [input] (clojure.core/cond-> {}))

(clojure.core/defn- deser-aac-coding-mode [input] (clojure.core/get {"AD_RECEIVER_MIX" :ad-receiver-mix, "CODING_MODE_1_0" :coding-mode-1-0, "CODING_MODE_1_1" :coding-mode-1-1, "CODING_MODE_2_0" :coding-mode-2-0, "CODING_MODE_5_1" :coding-mode-5-1} input))

(clojure.core/defn- deser-smooth-group-event-id-mode [input] (clojure.core/get {"NO_EVENT_ID" :no-event-id, "USE_CONFIGURED" :use-configured, "USE_TIMESTAMP" :use-timestamp} input))

(clojure.core/defn- deser-scte-27-source-settings [input] (clojure.core/cond-> {} (clojure.core/contains? input "pid") (clojure.core/assoc :pid (deser-integer-min-1 (input "pid")))))

(clojure.core/defn- deser-integer-min-1-max-3600 [input] input)

(clojure.core/defn- deser-webvtt-destination-settings [input] (clojure.core/cond-> {}))

(clojure.core/defn- deser-output-settings [input] (clojure.core/cond-> {} (clojure.core/contains? input "archiveOutputSettings") (clojure.core/assoc :archive-output-settings (deser-archive-output-settings (input "archiveOutputSettings"))) (clojure.core/contains? input "frameCaptureOutputSettings") (clojure.core/assoc :frame-capture-output-settings (deser-frame-capture-output-settings (input "frameCaptureOutputSettings"))) (clojure.core/contains? input "hlsOutputSettings") (clojure.core/assoc :hls-output-settings (deser-hls-output-settings (input "hlsOutputSettings"))) (clojure.core/contains? input "msSmoothOutputSettings") (clojure.core/assoc :ms-smooth-output-settings (deser-ms-smooth-output-settings (input "msSmoothOutputSettings"))) (clojure.core/contains? input "rtmpOutputSettings") (clojure.core/assoc :rtmp-output-settings (deser-rtmp-output-settings (input "rtmpOutputSettings"))) (clojure.core/contains? input "udpOutputSettings") (clojure.core/assoc :udp-output-settings (deser-udp-output-settings (input "udpOutputSettings")))))

(clojure.core/defn- deser-caption-language-mapping [input] (clojure.core/cond-> {:language-code (deser-string-min-3-max-3 (input "languageCode")), :language-description (deser-string-min-1 (input "languageDescription")), :caption-channel (deser-integer-min-1-max-4 (input "captionChannel"))}))

(clojure.core/defn- deser-input-loss-action-for-rtmp-out [input] (clojure.core/get {"EMIT_OUTPUT" :emit-output, "PAUSE_OUTPUT" :pause-output} input))

(clojure.core/defn- deser-schedule-action-start-settings [input] (clojure.core/cond-> {} (clojure.core/contains? input "fixedModeScheduleActionStartSettings") (clojure.core/assoc :fixed-mode-schedule-action-start-settings (deser-fixed-mode-schedule-action-start-settings (input "fixedModeScheduleActionStartSettings"))) (clojure.core/contains? input "followModeScheduleActionStartSettings") (clojure.core/assoc :follow-mode-schedule-action-start-settings (deser-follow-mode-schedule-action-start-settings (input "followModeScheduleActionStartSettings")))))

(clojure.core/defn- deser-list-of-output [input] (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (deser-output coll))) input))

(clojure.core/defn- deser-encoder-settings [input] (clojure.core/cond-> {:video-descriptions (deser-list-of-video-description (input "videoDescriptions")), :audio-descriptions (deser-list-of-audio-description (input "audioDescriptions")), :output-groups (deser-list-of-output-group (input "outputGroups")), :timecode-config (deser-timecode-config (input "timecodeConfig"))} (clojure.core/contains? input "globalConfiguration") (clojure.core/assoc :global-configuration (deser-global-configuration (input "globalConfiguration"))) (clojure.core/contains? input "captionDescriptions") (clojure.core/assoc :caption-descriptions (deser-list-of-caption-description (input "captionDescriptions"))) (clojure.core/contains? input "availConfiguration") (clojure.core/assoc :avail-configuration (deser-avail-configuration (input "availConfiguration"))) (clojure.core/contains? input "blackoutSlate") (clojure.core/assoc :blackout-slate (deser-blackout-slate (input "blackoutSlate"))) (clojure.core/contains? input "availBlanking") (clojure.core/assoc :avail-blanking (deser-avail-blanking (input "availBlanking")))))

(clojure.core/defn- deser-static-key-settings [input] (clojure.core/cond-> {:static-key-value (deser-string-min-32-max-32 (input "staticKeyValue"))} (clojure.core/contains? input "keyProviderServer") (clojure.core/assoc :key-provider-server (deser-input-location (input "keyProviderServer")))))

(clojure.core/defn- deser-frame-capture-group-settings [input] (clojure.core/cond-> {:destination (deser-output-location-ref (input "destination"))}))

(clojure.core/defn- deser-video-description-respond-to-afd [input] (clojure.core/get {"NONE" :none, "PASSTHROUGH" :passthrough, "RESPOND" :respond} input))

(clojure.core/defn- deser-teletext-destination-settings [input] (clojure.core/cond-> {}))

(clojure.core/defn- deser-output-group [input] (clojure.core/cond-> {:outputs (deser-list-of-output (input "outputs")), :output-group-settings (deser-output-group-settings (input "outputGroupSettings"))} (clojure.core/contains? input "name") (clojure.core/assoc :name (deser-string-max-32 (input "name")))))

(clojure.core/defn- deser-list-of-channel-summary [input] (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (deser-channel-summary coll))) input))

(clojure.core/defn- deser-input-attachment [input] (clojure.core/cond-> {} (clojure.core/contains? input "inputAttachmentName") (clojure.core/assoc :input-attachment-name (deser-string (input "inputAttachmentName"))) (clojure.core/contains? input "inputId") (clojure.core/assoc :input-id (deser-string (input "inputId"))) (clojure.core/contains? input "inputSettings") (clojure.core/assoc :input-settings (deser-input-settings (input "inputSettings")))))

(clojure.core/defn- deser-hls-client-cache [input] (clojure.core/get {"DISABLED" :disabled, "ENABLED" :enabled} input))

(clojure.core/defn- deser-integer-min-0-max-10000 [input] input)

(clojure.core/defn- deser-h-264-temporal-aq [input] (clojure.core/get {"DISABLED" :disabled, "ENABLED" :enabled} input))

(clojure.core/defn- deser-smpte-tt-destination-settings [input] (clojure.core/cond-> {}))

(clojure.core/defn- deser-embedded-source-settings [input] (clojure.core/cond-> {} (clojure.core/contains? input "convert608To708") (clojure.core/assoc :convert-608-to-708 (deser-embedded-convert-608-to-708 (input "convert608To708"))) (clojure.core/contains? input "scte20Detection") (clojure.core/assoc :scte-20-detection (deser-embedded-scte-20-detection (input "scte20Detection"))) (clojure.core/contains? input "source608ChannelNumber") (clojure.core/assoc :source-608-channel-number (deser-integer-min-1-max-4 (input "source608ChannelNumber"))) (clojure.core/contains? input "source608TrackNumber") (clojure.core/assoc :source-608-track-number (deser-integer-min-1-max-5 (input "source608TrackNumber")))))

(clojure.core/defn- deser-h-264-gop-b-reference [input] (clojure.core/get {"DISABLED" :disabled, "ENABLED" :enabled} input))

(clojure.core/defn- deser-list-of-input [input] (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (deser-input coll))) input))

(clojure.core/defn- deser-network-input-settings [input] (clojure.core/cond-> {} (clojure.core/contains? input "hlsInputSettings") (clojure.core/assoc :hls-input-settings (deser-hls-input-settings (input "hlsInputSettings"))) (clojure.core/contains? input "serverValidation") (clojure.core/assoc :server-validation (deser-network-input-server-validation (input "serverValidation")))))

(clojure.core/defn- deser-input-whitelist-rule [input] (clojure.core/cond-> {} (clojure.core/contains? input "cidr") (clojure.core/assoc :cidr (deser-string (input "cidr")))))

(clojure.core/defn- deser-string-min-3-max-3 [input] input)

(clojure.core/defn- deser-smooth-group-certificate-mode [input] (clojure.core/get {"SELF_SIGNED" :self-signed, "VERIFY_AUTHENTICITY" :verify-authenticity} input))

(clojure.core/defn- deser-input-specification [input] (clojure.core/cond-> {} (clojure.core/contains? input "codec") (clojure.core/assoc :codec (deser-input-codec (input "codec"))) (clojure.core/contains? input "maximumBitrate") (clojure.core/assoc :maximum-bitrate (deser-input-maximum-bitrate (input "maximumBitrate"))) (clojure.core/contains? input "resolution") (clojure.core/assoc :resolution (deser-input-resolution (input "resolution")))))

(clojure.core/defn- deser-reservation-resource-type [input] (clojure.core/get {"INPUT" :input, "OUTPUT" :output, "CHANNEL" :channel} input))

(clojure.core/defn- deser-input-deblock-filter [input] (clojure.core/get {"DISABLED" :disabled, "ENABLED" :enabled} input))

(clojure.core/defn- deser-embedded-scte-20-detection [input] (clojure.core/get {"AUTO" :auto, "OFF" :off} input))

(clojure.core/defn- deser-input-codec [input] (clojure.core/get {"MPEG2" :mpeg-2, "AVC" :avc, "HEVC" :hevc} input))

(clojure.core/defn- deser-integer-min-4-max-20 [input] input)

(clojure.core/defn- deser-arib-source-settings [input] (clojure.core/cond-> {}))

(clojure.core/defn- deser-audio-description-language-code-control [input] (clojure.core/get {"FOLLOW_INPUT" :follow-input, "USE_CONFIGURED" :use-configured} input))

(clojure.core/defn- deser-double [input] input)

(clojure.core/defn- deser-ac-3-coding-mode [input] (clojure.core/get {"CODING_MODE_1_0" :coding-mode-1-0, "CODING_MODE_1_1" :coding-mode-1-1, "CODING_MODE_2_0" :coding-mode-2-0, "CODING_MODE_3_2_LFE" :coding-mode-3-2-lfe} input))

(clojure.core/defn- deser-input-switch-schedule-action-settings [input] (clojure.core/cond-> {:input-attachment-name-reference (deser-string (input "inputAttachmentNameReference"))}))

(clojure.core/defn- deser-integer-min-0-max-10 [input] input)

(clojure.core/defn- deser-aac-rate-control-mode [input] (clojure.core/get {"CBR" :cbr, "VBR" :vbr} input))

(clojure.core/defn- deser-integer-min-negative-1000-max-1000 [input] input)

(clojure.core/defn- deser-hls-segmentation-mode [input] (clojure.core/get {"USE_INPUT_SEGMENTATION" :use-input-segmentation, "USE_SEGMENT_DURATION" :use-segment-duration} input))

(clojure.core/defn- deser-dvb-sub-destination-shadow-color [input] (clojure.core/get {"BLACK" :black, "NONE" :none, "WHITE" :white} input))

(clojure.core/defn- deser-list-of-reservation [input] (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (deser-reservation coll))) input))

(clojure.core/defn- deser-pass-through-settings [input] (clojure.core/cond-> {}))

(clojure.core/defn- deser-media-connect-flow [input] (clojure.core/cond-> {} (clojure.core/contains? input "flowArn") (clojure.core/assoc :flow-arn (deser-string (input "flowArn")))))

(clojure.core/defn- deser-video-description-scaling-behavior [input] (clojure.core/get {"DEFAULT" :default, "STRETCH_TO_OUTPUT" :stretch-to-output} input))

(clojure.core/defn- deser-scte-35-archive-allowed-flag [input] (clojure.core/get {"ARCHIVE_NOT_ALLOWED" :archive-not-allowed, "ARCHIVE_ALLOWED" :archive-allowed} input))

(clojure.core/defn- deser-eac-3-attenuation-control [input] (clojure.core/get {"ATTENUATE_3_DB" :attenuate-3-db, "NONE" :none} input))

(clojure.core/defn- deser-h-264-framerate-control [input] (clojure.core/get {"INITIALIZE_FROM_SOURCE" :initialize-from-source, "SPECIFIED" :specified} input))

(clojure.core/defn- deser-aac-input-type [input] (clojure.core/get {"BROADCASTER_MIXED_AD" :broadcaster-mixed-ad, "NORMAL" :normal} input))

(clojure.core/defn- deser-channel [input] (clojure.core/cond-> {} (clojure.core/contains? input "inputAttachments") (clojure.core/assoc :input-attachments (deser-list-of-input-attachment (input "inputAttachments"))) (clojure.core/contains? input "pipelinesRunningCount") (clojure.core/assoc :pipelines-running-count (deser-integer (input "pipelinesRunningCount"))) (clojure.core/contains? input "logLevel") (clojure.core/assoc :log-level (deser-log-level (input "logLevel"))) (clojure.core/contains? input "roleArn") (clojure.core/assoc :role-arn (deser-string (input "roleArn"))) (clojure.core/contains? input "tags") (clojure.core/assoc :tags (deser-tags (input "tags"))) (clojure.core/contains? input "egressEndpoints") (clojure.core/assoc :egress-endpoints (deser-list-of-channel-egress-endpoint (input "egressEndpoints"))) (clojure.core/contains? input "encoderSettings") (clojure.core/assoc :encoder-settings (deser-encoder-settings (input "encoderSettings"))) (clojure.core/contains? input "arn") (clojure.core/assoc :arn (deser-string (input "arn"))) (clojure.core/contains? input "inputSpecification") (clojure.core/assoc :input-specification (deser-input-specification (input "inputSpecification"))) (clojure.core/contains? input "state") (clojure.core/assoc :state (deser-channel-state (input "state"))) (clojure.core/contains? input "destinations") (clojure.core/assoc :destinations (deser-list-of-output-destination (input "destinations"))) (clojure.core/contains? input "name") (clojure.core/assoc :name (deser-string (input "name"))) (clojure.core/contains? input "id") (clojure.core/assoc :id (deser-string (input "id")))))

(clojure.core/defn- deser-timecode-config [input] (clojure.core/cond-> {:source (deser-timecode-config-source (input "source"))} (clojure.core/contains? input "syncThreshold") (clojure.core/assoc :sync-threshold (deser-integer-min-1-max-1000000 (input "syncThreshold")))))

(clojure.core/defn- deser-dvb-sub-destination-settings [input] (clojure.core/cond-> {} (clojure.core/contains? input "outlineColor") (clojure.core/assoc :outline-color (deser-dvb-sub-destination-outline-color (input "outlineColor"))) (clojure.core/contains? input "outlineSize") (clojure.core/assoc :outline-size (deser-integer-min-0-max-10 (input "outlineSize"))) (clojure.core/contains? input "shadowColor") (clojure.core/assoc :shadow-color (deser-dvb-sub-destination-shadow-color (input "shadowColor"))) (clojure.core/contains? input "shadowOpacity") (clojure.core/assoc :shadow-opacity (deser-integer-min-0-max-255 (input "shadowOpacity"))) (clojure.core/contains? input "shadowYOffset") (clojure.core/assoc :shadow-y-offset (deser-integer (input "shadowYOffset"))) (clojure.core/contains? input "backgroundColor") (clojure.core/assoc :background-color (deser-dvb-sub-destination-background-color (input "backgroundColor"))) (clojure.core/contains? input "teletextGridControl") (clojure.core/assoc :teletext-grid-control (deser-dvb-sub-destination-teletext-grid-control (input "teletextGridControl"))) (clojure.core/contains? input "yPosition") (clojure.core/assoc :y-position (deser-integer-min-0 (input "yPosition"))) (clojure.core/contains? input "fontColor") (clojure.core/assoc :font-color (deser-dvb-sub-destination-font-color (input "fontColor"))) (clojure.core/contains? input "xPosition") (clojure.core/assoc :x-position (deser-integer-min-0 (input "xPosition"))) (clojure.core/contains? input "font") (clojure.core/assoc :font (deser-input-location (input "font"))) (clojure.core/contains? input "fontResolution") (clojure.core/assoc :font-resolution (deser-integer-min-96-max-600 (input "fontResolution"))) (clojure.core/contains? input "fontSize") (clojure.core/assoc :font-size (deser-string (input "fontSize"))) (clojure.core/contains? input "backgroundOpacity") (clojure.core/assoc :background-opacity (deser-integer-min-0-max-255 (input "backgroundOpacity"))) (clojure.core/contains? input "fontOpacity") (clojure.core/assoc :font-opacity (deser-integer-min-0-max-255 (input "fontOpacity"))) (clojure.core/contains? input "shadowXOffset") (clojure.core/assoc :shadow-x-offset (deser-integer (input "shadowXOffset"))) (clojure.core/contains? input "alignment") (clojure.core/assoc :alignment (deser-dvb-sub-destination-alignment (input "alignment")))))

(clojure.core/defn- deser-embedded-convert-608-to-708 [input] (clojure.core/get {"DISABLED" :disabled, "UPCONVERT" :upconvert} input))

(clojure.core/defn- deser-audio-only-hls-track-type [input] (clojure.core/get {"ALTERNATE_AUDIO_AUTO_SELECT" :alternate-audio-auto-select, "ALTERNATE_AUDIO_AUTO_SELECT_DEFAULT" :alternate-audio-auto-select-default, "ALTERNATE_AUDIO_NOT_AUTO_SELECT" :alternate-audio-not-auto-select, "AUDIO_ONLY_VARIANT_STREAM" :audio-only-variant-stream} input))

(clojure.core/defn- deser-h-264-color-metadata [input] (clojure.core/get {"IGNORE" :ignore, "INSERT" :insert} input))

(clojure.core/defn- deser-string-min-1 [input] input)

(clojure.core/defn- deser-blackout-slate [input] (clojure.core/cond-> {} (clojure.core/contains? input "blackoutSlateImage") (clojure.core/assoc :blackout-slate-image (deser-input-location (input "blackoutSlateImage"))) (clojure.core/contains? input "networkEndBlackout") (clojure.core/assoc :network-end-blackout (deser-blackout-slate-network-end-blackout (input "networkEndBlackout"))) (clojure.core/contains? input "networkEndBlackoutImage") (clojure.core/assoc :network-end-blackout-image (deser-input-location (input "networkEndBlackoutImage"))) (clojure.core/contains? input "networkId") (clojure.core/assoc :network-id (deser-string-min-34-max-34 (input "networkId"))) (clojure.core/contains? input "state") (clojure.core/assoc :state (deser-blackout-slate-state (input "state")))))

(clojure.core/defn- deser-ac-3-settings [input] (clojure.core/cond-> {} (clojure.core/contains? input "bitrate") (clojure.core/assoc :bitrate (deser-double (input "bitrate"))) (clojure.core/contains? input "bitstreamMode") (clojure.core/assoc :bitstream-mode (deser-ac-3-bitstream-mode (input "bitstreamMode"))) (clojure.core/contains? input "codingMode") (clojure.core/assoc :coding-mode (deser-ac-3-coding-mode (input "codingMode"))) (clojure.core/contains? input "dialnorm") (clojure.core/assoc :dialnorm (deser-integer-min-1-max-31 (input "dialnorm"))) (clojure.core/contains? input "drcProfile") (clojure.core/assoc :drc-profile (deser-ac-3-drc-profile (input "drcProfile"))) (clojure.core/contains? input "lfeFilter") (clojure.core/assoc :lfe-filter (deser-ac-3-lfe-filter (input "lfeFilter"))) (clojure.core/contains? input "metadataControl") (clojure.core/assoc :metadata-control (deser-ac-3-metadata-control (input "metadataControl")))))

(clojure.core/defn- deser-ms-smooth-group-settings [input] (clojure.core/cond-> {:destination (deser-output-location-ref (input "destination"))} (clojure.core/contains? input "fragmentLength") (clojure.core/assoc :fragment-length (deser-integer-min-1 (input "fragmentLength"))) (clojure.core/contains? input "inputLossAction") (clojure.core/assoc :input-loss-action (deser-input-loss-action-for-ms-smooth-out (input "inputLossAction"))) (clojure.core/contains? input "eventStopBehavior") (clojure.core/assoc :event-stop-behavior (deser-smooth-group-event-stop-behavior (input "eventStopBehavior"))) (clojure.core/contains? input "acquisitionPointId") (clojure.core/assoc :acquisition-point-id (deser-string (input "acquisitionPointId"))) (clojure.core/contains? input "streamManifestBehavior") (clojure.core/assoc :stream-manifest-behavior (deser-smooth-group-stream-manifest-behavior (input "streamManifestBehavior"))) (clojure.core/contains? input "numRetries") (clojure.core/assoc :num-retries (deser-integer-min-0 (input "numRetries"))) (clojure.core/contains? input "filecacheDuration") (clojure.core/assoc :filecache-duration (deser-integer-min-0 (input "filecacheDuration"))) (clojure.core/contains? input "sparseTrackType") (clojure.core/assoc :sparse-track-type (deser-smooth-group-sparse-track-type (input "sparseTrackType"))) (clojure.core/contains? input "certificateMode") (clojure.core/assoc :certificate-mode (deser-smooth-group-certificate-mode (input "certificateMode"))) (clojure.core/contains? input "sendDelayMs") (clojure.core/assoc :send-delay-ms (deser-integer-min-0-max-10000 (input "sendDelayMs"))) (clojure.core/contains? input "eventIdMode") (clojure.core/assoc :event-id-mode (deser-smooth-group-event-id-mode (input "eventIdMode"))) (clojure.core/contains? input "segmentationMode") (clojure.core/assoc :segmentation-mode (deser-smooth-group-segmentation-mode (input "segmentationMode"))) (clojure.core/contains? input "audioOnlyTimecodeControl") (clojure.core/assoc :audio-only-timecode-control (deser-smooth-group-audio-only-timecode-control (input "audioOnlyTimecodeControl"))) (clojure.core/contains? input "timestampOffset") (clojure.core/assoc :timestamp-offset (deser-string (input "timestampOffset"))) (clojure.core/contains? input "eventId") (clojure.core/assoc :event-id (deser-string (input "eventId"))) (clojure.core/contains? input "connectionRetryInterval") (clojure.core/assoc :connection-retry-interval (deser-integer-min-0 (input "connectionRetryInterval"))) (clojure.core/contains? input "timestampOffsetMode") (clojure.core/assoc :timestamp-offset-mode (deser-smooth-group-timestamp-offset-mode (input "timestampOffsetMode"))) (clojure.core/contains? input "restartDelay") (clojure.core/assoc :restart-delay (deser-integer-min-0 (input "restartDelay")))))

(clojure.core/defn- deser-integer-min-0-max-7 [input] input)

(clojure.core/defn- deser-h-264-entropy-encoding [input] (clojure.core/get {"CABAC" :cabac, "CAVLC" :cavlc} input))

(clojure.core/defn- deser-output [input] (clojure.core/cond-> {:output-settings (deser-output-settings (input "outputSettings"))} (clojure.core/contains? input "audioDescriptionNames") (clojure.core/assoc :audio-description-names (deser-list-of-string (input "audioDescriptionNames"))) (clojure.core/contains? input "captionDescriptionNames") (clojure.core/assoc :caption-description-names (deser-list-of-string (input "captionDescriptionNames"))) (clojure.core/contains? input "outputName") (clojure.core/assoc :output-name (deser-string-min-1-max-255 (input "outputName"))) (clojure.core/contains? input "videoDescriptionName") (clojure.core/assoc :video-description-name (deser-string (input "videoDescriptionName")))))

(clojure.core/defn- deser-burn-in-shadow-color [input] (clojure.core/get {"BLACK" :black, "NONE" :none, "WHITE" :white} input))

(clojure.core/defn- deser-audio-language-selection-policy [input] (clojure.core/get {"LOOSE" :loose, "STRICT" :strict} input))

(clojure.core/defn- deser-integer [input] input)

(clojure.core/defn- deser-aac-settings [input] (clojure.core/cond-> {} (clojure.core/contains? input "rateControlMode") (clojure.core/assoc :rate-control-mode (deser-aac-rate-control-mode (input "rateControlMode"))) (clojure.core/contains? input "codingMode") (clojure.core/assoc :coding-mode (deser-aac-coding-mode (input "codingMode"))) (clojure.core/contains? input "inputType") (clojure.core/assoc :input-type (deser-aac-input-type (input "inputType"))) (clojure.core/contains? input "sampleRate") (clojure.core/assoc :sample-rate (deser-double (input "sampleRate"))) (clojure.core/contains? input "spec") (clojure.core/assoc :spec (deser-aac-spec (input "spec"))) (clojure.core/contains? input "vbrQuality") (clojure.core/assoc :vbr-quality (deser-aac-vbr-quality (input "vbrQuality"))) (clojure.core/contains? input "profile") (clojure.core/assoc :profile (deser-aac-profile (input "profile"))) (clojure.core/contains? input "rawFormat") (clojure.core/assoc :raw-format (deser-aac-raw-format (input "rawFormat"))) (clojure.core/contains? input "bitrate") (clojure.core/assoc :bitrate (deser-double (input "bitrate")))))

(clojure.core/defn- deser-integer-min-1 [input] input)

(clojure.core/defn- deser-list-of-caption-selector [input] (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (deser-caption-selector coll))) input))

(clojure.core/defn- deser-integer-min-0-max-4294967295 [input] input)

(clojure.core/defn- deser-rtmp-group-settings [input] (clojure.core/cond-> {} (clojure.core/contains? input "authenticationScheme") (clojure.core/assoc :authentication-scheme (deser-authentication-scheme (input "authenticationScheme"))) (clojure.core/contains? input "cacheFullBehavior") (clojure.core/assoc :cache-full-behavior (deser-rtmp-cache-full-behavior (input "cacheFullBehavior"))) (clojure.core/contains? input "cacheLength") (clojure.core/assoc :cache-length (deser-integer-min-30 (input "cacheLength"))) (clojure.core/contains? input "captionData") (clojure.core/assoc :caption-data (deser-rtmp-caption-data (input "captionData"))) (clojure.core/contains? input "inputLossAction") (clojure.core/assoc :input-loss-action (deser-input-loss-action-for-rtmp-out (input "inputLossAction"))) (clojure.core/contains? input "restartDelay") (clojure.core/assoc :restart-delay (deser-integer-min-0 (input "restartDelay")))))

(clojure.core/defn- deser-burn-in-alignment [input] (clojure.core/get {"CENTERED" :centered, "LEFT" :left, "SMART" :smart} input))

(clojure.core/defn- deser-list-of-caption-description [input] (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (deser-caption-description coll))) input))

(clojure.core/defn- deser-embedded-destination-settings [input] (clojure.core/cond-> {}))

(clojure.core/defn- deser-caption-selector [input] (clojure.core/cond-> {:name (deser-string-min-1 (input "name"))} (clojure.core/contains? input "languageCode") (clojure.core/assoc :language-code (deser-string (input "languageCode"))) (clojure.core/contains? input "selectorSettings") (clojure.core/assoc :selector-settings (deser-caption-selector-settings (input "selectorSettings")))))

(clojure.core/defn- deser-embedded-plus-scte-20-destination-settings [input] (clojure.core/cond-> {}))

(clojure.core/defn- deser-channel-egress-endpoint [input] (clojure.core/cond-> {} (clojure.core/contains? input "sourceIp") (clojure.core/assoc :source-ip (deser-string (input "sourceIp")))))

(clojure.core/defn- deser-hls-group-settings [input] (clojure.core/cond-> {:destination (deser-output-location-ref (input "destination"))} (clojure.core/contains? input "segmentLength") (clojure.core/assoc :segment-length (deser-integer-min-1 (input "segmentLength"))) (clojure.core/contains? input "tsFileMode") (clojure.core/assoc :ts-file-mode (deser-hls-ts-file-mode (input "tsFileMode"))) (clojure.core/contains? input "timestampDeltaMilliseconds") (clojure.core/assoc :timestamp-delta-milliseconds (deser-integer-min-0 (input "timestampDeltaMilliseconds"))) (clojure.core/contains? input "programDateTimePeriod") (clojure.core/assoc :program-date-time-period (deser-integer-min-0-max-3600 (input "programDateTimePeriod"))) (clojure.core/contains? input "constantIv") (clojure.core/assoc :constant-iv (deser-string-min-32-max-32 (input "constantIv"))) (clojure.core/contains? input "keyFormatVersions") (clojure.core/assoc :key-format-versions (deser-string (input "keyFormatVersions"))) (clojure.core/contains? input "inputLossAction") (clojure.core/assoc :input-loss-action (deser-input-loss-action-for-hls-out (input "inputLossAction"))) (clojure.core/contains? input "adMarkers") (clojure.core/assoc :ad-markers (deser-list-of-hls-ad-markers (input "adMarkers"))) (clojure.core/contains? input "captionLanguageMappings") (clojure.core/assoc :caption-language-mappings (deser-list-of-caption-language-mapping (input "captionLanguageMappings"))) (clojure.core/contains? input "timedMetadataId3Frame") (clojure.core/assoc :timed-metadata-id-3-frame (deser-hls-timed-metadata-id-3-frame (input "timedMetadataId3Frame"))) (clojure.core/contains? input "mode") (clojure.core/assoc :mode (deser-hls-mode (input "mode"))) (clojure.core/contains? input "directoryStructure") (clojure.core/assoc :directory-structure (deser-hls-directory-structure (input "directoryStructure"))) (clojure.core/contains? input "encryptionType") (clojure.core/assoc :encryption-type (deser-hls-encryption-type (input "encryptionType"))) (clojure.core/contains? input "indexNSegments") (clojure.core/assoc :index-n-segments (deser-integer-min-3 (input "indexNSegments"))) (clojure.core/contains? input "keepSegments") (clojure.core/assoc :keep-segments (deser-integer-min-1 (input "keepSegments"))) (clojure.core/contains? input "minSegmentLength") (clojure.core/assoc :min-segment-length (deser-integer-min-0 (input "minSegmentLength"))) (clojure.core/contains? input "ivInManifest") (clojure.core/assoc :iv-in-manifest (deser-hls-iv-in-manifest (input "ivInManifest"))) (clojure.core/contains? input "streamInfResolution") (clojure.core/assoc :stream-inf-resolution (deser-hls-stream-inf-resolution (input "streamInfResolution"))) (clojure.core/contains? input "hlsCdnSettings") (clojure.core/assoc :hls-cdn-settings (deser-hls-cdn-settings (input "hlsCdnSettings"))) (clojure.core/contains? input "redundantManifest") (clojure.core/assoc :redundant-manifest (deser-hls-redundant-manifest (input "redundantManifest"))) (clojure.core/contains? input "programDateTime") (clojure.core/assoc :program-date-time (deser-hls-program-date-time (input "programDateTime"))) (clojure.core/contains? input "iFrameOnlyPlaylists") (clojure.core/assoc :i-frame-only-playlists (deser-i-frame-only-playlist-type (input "iFrameOnlyPlaylists"))) (clojure.core/contains? input "outputSelection") (clojure.core/assoc :output-selection (deser-hls-output-selection (input "outputSelection"))) (clojure.core/contains? input "baseUrlContent") (clojure.core/assoc :base-url-content (deser-string (input "baseUrlContent"))) (clojure.core/contains? input "captionLanguageSetting") (clojure.core/assoc :caption-language-setting (deser-hls-caption-language-setting (input "captionLanguageSetting"))) (clojure.core/contains? input "manifestDurationFormat") (clojure.core/assoc :manifest-duration-format (deser-hls-manifest-duration-format (input "manifestDurationFormat"))) (clojure.core/contains? input "segmentationMode") (clojure.core/assoc :segmentation-mode (deser-hls-segmentation-mode (input "segmentationMode"))) (clojure.core/contains? input "timedMetadataId3Period") (clojure.core/assoc :timed-metadata-id-3-period (deser-integer-min-0 (input "timedMetadataId3Period"))) (clojure.core/contains? input "manifestCompression") (clojure.core/assoc :manifest-compression (deser-hls-manifest-compression (input "manifestCompression"))) (clojure.core/contains? input "segmentsPerSubdirectory") (clojure.core/assoc :segments-per-subdirectory (deser-integer-min-1 (input "segmentsPerSubdirectory"))) (clojure.core/contains? input "keyFormat") (clojure.core/assoc :key-format (deser-string (input "keyFormat"))) (clojure.core/contains? input "ivSource") (clojure.core/assoc :iv-source (deser-hls-iv-source (input "ivSource"))) (clojure.core/contains? input "codecSpecification") (clojure.core/assoc :codec-specification (deser-hls-codec-specification (input "codecSpecification"))) (clojure.core/contains? input "keyProviderSettings") (clojure.core/assoc :key-provider-settings (deser-key-provider-settings (input "keyProviderSettings"))) (clojure.core/contains? input "baseUrlManifest") (clojure.core/assoc :base-url-manifest (deser-string (input "baseUrlManifest"))) (clojure.core/contains? input "clientCache") (clojure.core/assoc :client-cache (deser-hls-client-cache (input "clientCache")))))

(clojure.core/defn- deser-input-loss-action-for-ms-smooth-out [input] (clojure.core/get {"EMIT_OUTPUT" :emit-output, "PAUSE_OUTPUT" :pause-output} input))

(clojure.core/defn- deser-dvb-nit-settings [input] (clojure.core/cond-> {:network-name (deser-string-min-1-max-256 (input "networkName")), :network-id (deser-integer-min-0-max-65536 (input "networkId"))} (clojure.core/contains? input "repInterval") (clojure.core/assoc :rep-interval (deser-integer-min-25-max-10000 (input "repInterval")))))

(clojure.core/defn- deser-integer-min-1-max-20 [input] input)

(clojure.core/defn- deser-offering-type [input] (clojure.core/get {"NO_UPFRONT" :no-upfront} input))

(clojure.core/defn- deser-integer-min-0-max-8191 [input] input)

(clojure.core/defn- deser-smooth-group-timestamp-offset-mode [input] (clojure.core/get {"USE_CONFIGURED_OFFSET" :use-configured-offset, "USE_EVENT_START_DATE" :use-event-start-date} input))

(clojure.core/defn- deser-hls-media-store-storage-class [input] (clojure.core/get {"TEMPORAL" :temporal} input))

(clojure.core/defn- deser-pipeline-pause-state-settings [input] (clojure.core/cond-> {:pipeline-id (deser-pipeline-id (input "pipelineId"))}))

(clojure.core/defn- deser-frame-capture-settings [input] (clojure.core/cond-> {:capture-interval (deser-integer-min-1-max-3600 (input "captureInterval"))}))

(clojure.core/defn- deser-hls-program-date-time [input] (clojure.core/get {"EXCLUDE" :exclude, "INCLUDE" :include} input))

(clojure.core/defn- deser-list-of-validation-error [input] (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (deser-validation-error coll))) input))

(clojure.core/defn- deser-output-destination-settings [input] (clojure.core/cond-> {} (clojure.core/contains? input "passwordParam") (clojure.core/assoc :password-param (deser-string (input "passwordParam"))) (clojure.core/contains? input "streamName") (clojure.core/assoc :stream-name (deser-string (input "streamName"))) (clojure.core/contains? input "url") (clojure.core/assoc :url (deser-string (input "url"))) (clojure.core/contains? input "username") (clojure.core/assoc :username (deser-string (input "username")))))

(clojure.core/defn- deser-fixed-afd [input] (clojure.core/get {"AFD_0010" :afd-0010, "AFD_1101" :afd-1101, "AFD_1000" :afd-1000, "AFD_1111" :afd-1111, "AFD_0000" :afd-0000, "AFD_1011" :afd-1011, "AFD_0011" :afd-0011, "AFD_1001" :afd-1001, "AFD_0100" :afd-0100, "AFD_1010" :afd-1010, "AFD_1110" :afd-1110} input))

(clojure.core/defn- deser-hls-ts-file-mode [input] (clojure.core/get {"SEGMENTED_FILES" :segmented-files, "SINGLE_FILE" :single-file} input))

(clojure.core/defn- deser-scte-35-segmentation-descriptor [input] (clojure.core/cond-> {:segmentation-event-id (deser-integer-min-0-max-4294967295 (input "segmentationEventId")), :segmentation-cancel-indicator (deser-scte-35-segmentation-cancel-indicator (input "segmentationCancelIndicator"))} (clojure.core/contains? input "subSegmentNum") (clojure.core/assoc :sub-segment-num (deser-integer-min-0-max-255 (input "subSegmentNum"))) (clojure.core/contains? input "segmentationDuration") (clojure.core/assoc :segmentation-duration (deser-integer-min-0-max-1099511627775 (input "segmentationDuration"))) (clojure.core/contains? input "segmentationTypeId") (clojure.core/assoc :segmentation-type-id (deser-integer-min-0-max-255 (input "segmentationTypeId"))) (clojure.core/contains? input "segmentationUpid") (clojure.core/assoc :segmentation-upid (deser-string (input "segmentationUpid"))) (clojure.core/contains? input "segmentationUpidType") (clojure.core/assoc :segmentation-upid-type (deser-integer-min-0-max-255 (input "segmentationUpidType"))) (clojure.core/contains? input "segmentsExpected") (clojure.core/assoc :segments-expected (deser-integer-min-0-max-255 (input "segmentsExpected"))) (clojure.core/contains? input "subSegmentsExpected") (clojure.core/assoc :sub-segments-expected (deser-integer-min-0-max-255 (input "subSegmentsExpected"))) (clojure.core/contains? input "segmentNum") (clojure.core/assoc :segment-num (deser-integer-min-0-max-255 (input "segmentNum"))) (clojure.core/contains? input "deliveryRestrictions") (clojure.core/assoc :delivery-restrictions (deser-scte-35-delivery-restrictions (input "deliveryRestrictions")))))

(clojure.core/defn- deser-hls-iv-in-manifest [input] (clojure.core/get {"EXCLUDE" :exclude, "INCLUDE" :include} input))

(clojure.core/defn- deser-list-of-caption-language-mapping [input] (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (deser-caption-language-mapping coll))) input))

(clojure.core/defn- deser-audio-codec-settings [input] (clojure.core/cond-> {} (clojure.core/contains? input "aacSettings") (clojure.core/assoc :aac-settings (deser-aac-settings (input "aacSettings"))) (clojure.core/contains? input "ac3Settings") (clojure.core/assoc :ac-3-settings (deser-ac-3-settings (input "ac3Settings"))) (clojure.core/contains? input "eac3Settings") (clojure.core/assoc :eac-3-settings (deser-eac-3-settings (input "eac3Settings"))) (clojure.core/contains? input "mp2Settings") (clojure.core/assoc :mp-2-settings (deser-mp-2-settings (input "mp2Settings"))) (clojure.core/contains? input "passThroughSettings") (clojure.core/assoc :pass-through-settings (deser-pass-through-settings (input "passThroughSettings")))))

(clojure.core/defn- deser-scte-20-plus-embedded-destination-settings [input] (clojure.core/cond-> {}))

(clojure.core/defn- deser-scte-35-web-delivery-allowed-flag [input] (clojure.core/get {"WEB_DELIVERY_NOT_ALLOWED" :web-delivery-not-allowed, "WEB_DELIVERY_ALLOWED" :web-delivery-allowed} input))

(clojure.core/defn- deser-scte-35-return-to-network-schedule-action-settings [input] (clojure.core/cond-> {:splice-event-id (deser-integer-min-0-max-4294967295 (input "spliceEventId"))}))

(clojure.core/defn- deser-integer-min-1-max-32 [input] input)

(clojure.core/defn- deser-burn-in-outline-color [input] (clojure.core/get {"BLACK" :black, "BLUE" :blue, "GREEN" :green, "RED" :red, "WHITE" :white, "YELLOW" :yellow} input))

(clojure.core/defn- deser-h-264-timecode-insertion-behavior [input] (clojure.core/get {"DISABLED" :disabled, "PIC_TIMING_SEI" :pic-timing-sei} input))

(clojure.core/defn- deser-eac-3-passthrough-control [input] (clojure.core/get {"NO_PASSTHROUGH" :no-passthrough, "WHEN_POSSIBLE" :when-possible} input))

(clojure.core/defn- deser-input-settings [input] (clojure.core/cond-> {} (clojure.core/contains? input "inputFilter") (clojure.core/assoc :input-filter (deser-input-filter (input "inputFilter"))) (clojure.core/contains? input "denoiseFilter") (clojure.core/assoc :denoise-filter (deser-input-denoise-filter (input "denoiseFilter"))) (clojure.core/contains? input "sourceEndBehavior") (clojure.core/assoc :source-end-behavior (deser-input-source-end-behavior (input "sourceEndBehavior"))) (clojure.core/contains? input "filterStrength") (clojure.core/assoc :filter-strength (deser-integer-min-1-max-5 (input "filterStrength"))) (clojure.core/contains? input "captionSelectors") (clojure.core/assoc :caption-selectors (deser-list-of-caption-selector (input "captionSelectors"))) (clojure.core/contains? input "videoSelector") (clojure.core/assoc :video-selector (deser-video-selector (input "videoSelector"))) (clojure.core/contains? input "networkInputSettings") (clojure.core/assoc :network-input-settings (deser-network-input-settings (input "networkInputSettings"))) (clojure.core/contains? input "audioSelectors") (clojure.core/assoc :audio-selectors (deser-list-of-audio-selector (input "audioSelectors"))) (clojure.core/contains? input "deblockFilter") (clojure.core/assoc :deblock-filter (deser-input-deblock-filter (input "deblockFilter")))))

(clojure.core/defn- deser-integer-min-1-max-31 [input] input)

(clojure.core/defn- deser-audio-normalization-settings [input] (clojure.core/cond-> {} (clojure.core/contains? input "algorithm") (clojure.core/assoc :algorithm (deser-audio-normalization-algorithm (input "algorithm"))) (clojure.core/contains? input "algorithmControl") (clojure.core/assoc :algorithm-control (deser-audio-normalization-algorithm-control (input "algorithmControl"))) (clojure.core/contains? input "targetLkfs") (clojure.core/assoc :target-lkfs (deser-double-min-negative-59-max-0 (input "targetLkfs")))))

(clojure.core/defn- deser-key-provider-settings [input] (clojure.core/cond-> {} (clojure.core/contains? input "staticKeySettings") (clojure.core/assoc :static-key-settings (deser-static-key-settings (input "staticKeySettings")))))

(clojure.core/defn- deser-list-of-scte-35-descriptor [input] (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (deser-scte-35-descriptor coll))) input))

(clojure.core/defn- deser-caption-selector-settings [input] (clojure.core/cond-> {} (clojure.core/contains? input "aribSourceSettings") (clojure.core/assoc :arib-source-settings (deser-arib-source-settings (input "aribSourceSettings"))) (clojure.core/contains? input "dvbSubSourceSettings") (clojure.core/assoc :dvb-sub-source-settings (deser-dvb-sub-source-settings (input "dvbSubSourceSettings"))) (clojure.core/contains? input "embeddedSourceSettings") (clojure.core/assoc :embedded-source-settings (deser-embedded-source-settings (input "embeddedSourceSettings"))) (clojure.core/contains? input "scte20SourceSettings") (clojure.core/assoc :scte-20-source-settings (deser-scte-20-source-settings (input "scte20SourceSettings"))) (clojure.core/contains? input "scte27SourceSettings") (clojure.core/assoc :scte-27-source-settings (deser-scte-27-source-settings (input "scte27SourceSettings"))) (clojure.core/contains? input "teletextSourceSettings") (clojure.core/assoc :teletext-source-settings (deser-teletext-source-settings (input "teletextSourceSettings")))))

(clojure.core/defn- deser-h-264-settings [input] (clojure.core/cond-> {} (clojure.core/contains? input "level") (clojure.core/assoc :level (deser-h-264-level (input "level"))) (clojure.core/contains? input "rateControlMode") (clojure.core/assoc :rate-control-mode (deser-h-264-rate-control-mode (input "rateControlMode"))) (clojure.core/contains? input "subgopLength") (clojure.core/assoc :subgop-length (deser-h-264-sub-gop-length (input "subgopLength"))) (clojure.core/contains? input "minIInterval") (clojure.core/assoc :min-i-interval (deser-integer-min-0-max-30 (input "minIInterval"))) (clojure.core/contains? input "temporalAq") (clojure.core/assoc :temporal-aq (deser-h-264-temporal-aq (input "temporalAq"))) (clojure.core/contains? input "parDenominator") (clojure.core/assoc :par-denominator (deser-integer-min-1 (input "parDenominator"))) (clojure.core/contains? input "qvbrQualityLevel") (clojure.core/assoc :qvbr-quality-level (deser-integer-min-1-max-10 (input "qvbrQualityLevel"))) (clojure.core/contains? input "numRefFrames") (clojure.core/assoc :num-ref-frames (deser-integer-min-1-max-6 (input "numRefFrames"))) (clojure.core/contains? input "gopBReference") (clojure.core/assoc :gop-b-reference (deser-h-264-gop-b-reference (input "gopBReference"))) (clojure.core/contains? input "timecodeInsertion") (clojure.core/assoc :timecode-insertion (deser-h-264-timecode-insertion-behavior (input "timecodeInsertion"))) (clojure.core/contains? input "scanType") (clojure.core/assoc :scan-type (deser-h-264-scan-type (input "scanType"))) (clojure.core/contains? input "adaptiveQuantization") (clojure.core/assoc :adaptive-quantization (deser-h-264-adaptive-quantization (input "adaptiveQuantization"))) (clojure.core/contains? input "afdSignaling") (clojure.core/assoc :afd-signaling (deser-afd-signaling (input "afdSignaling"))) (clojure.core/contains? input "bufFillPct") (clojure.core/assoc :buf-fill-pct (deser-integer-min-0-max-100 (input "bufFillPct"))) (clojure.core/contains? input "framerateDenominator") (clojure.core/assoc :framerate-denominator (deser-integer-min-1 (input "framerateDenominator"))) (clojure.core/contains? input "spatialAq") (clojure.core/assoc :spatial-aq (deser-h-264-spatial-aq (input "spatialAq"))) (clojure.core/contains? input "framerateControl") (clojure.core/assoc :framerate-control (deser-h-264-framerate-control (input "framerateControl"))) (clojure.core/contains? input "gopNumBFrames") (clojure.core/assoc :gop-num-b-frames (deser-integer-min-0-max-7 (input "gopNumBFrames"))) (clojure.core/contains? input "bufSize") (clojure.core/assoc :buf-size (deser-integer-min-0 (input "bufSize"))) (clojure.core/contains? input "profile") (clojure.core/assoc :profile (deser-h-264-profile (input "profile"))) (clojure.core/contains? input "colorMetadata") (clojure.core/assoc :color-metadata (deser-h-264-color-metadata (input "colorMetadata"))) (clojure.core/contains? input "lookAheadRateControl") (clojure.core/assoc :look-ahead-rate-control (deser-h-264-look-ahead-rate-control (input "lookAheadRateControl"))) (clojure.core/contains? input "syntax") (clojure.core/assoc :syntax (deser-h-264-syntax (input "syntax"))) (clojure.core/contains? input "gopClosedCadence") (clojure.core/assoc :gop-closed-cadence (deser-integer-min-0 (input "gopClosedCadence"))) (clojure.core/contains? input "flickerAq") (clojure.core/assoc :flicker-aq (deser-h-264-flicker-aq (input "flickerAq"))) (clojure.core/contains? input "framerateNumerator") (clojure.core/assoc :framerate-numerator (deser-integer-min-1 (input "framerateNumerator"))) (clojure.core/contains? input "softness") (clojure.core/assoc :softness (deser-integer-min-0-max-128 (input "softness"))) (clojure.core/contains? input "gopSizeUnits") (clojure.core/assoc :gop-size-units (deser-h-264-gop-size-units (input "gopSizeUnits"))) (clojure.core/contains? input "maxBitrate") (clojure.core/assoc :max-bitrate (deser-integer-min-1000 (input "maxBitrate"))) (clojure.core/contains? input "parNumerator") (clojure.core/assoc :par-numerator (deser-integer (input "parNumerator"))) (clojure.core/contains? input "gopSize") (clojure.core/assoc :gop-size (deser-double-min-1 (input "gopSize"))) (clojure.core/contains? input "parControl") (clojure.core/assoc :par-control (deser-h-264-par-control (input "parControl"))) (clojure.core/contains? input "slices") (clojure.core/assoc :slices (deser-integer-min-1-max-32 (input "slices"))) (clojure.core/contains? input "fixedAfd") (clojure.core/assoc :fixed-afd (deser-fixed-afd (input "fixedAfd"))) (clojure.core/contains? input "entropyEncoding") (clojure.core/assoc :entropy-encoding (deser-h-264-entropy-encoding (input "entropyEncoding"))) (clojure.core/contains? input "sceneChangeDetect") (clojure.core/assoc :scene-change-detect (deser-h-264-scene-change-detect (input "sceneChangeDetect"))) (clojure.core/contains? input "bitrate") (clojure.core/assoc :bitrate (deser-integer-min-1000 (input "bitrate")))))

(clojure.core/defn- deser-hls-timed-metadata-id-3-frame [input] (clojure.core/get {"NONE" :none, "PRIV" :priv, "TDRL" :tdrl} input))

(clojure.core/defn- deser-list-of-media-connect-flow [input] (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (deser-media-connect-flow coll))) input))

(clojure.core/defn- deser-eac-3-phase-control [input] (clojure.core/get {"NO_SHIFT" :no-shift, "SHIFT_90_DEGREES" :shift-90-degrees} input))

(clojure.core/defn- deser-eac-3-surround-ex-mode [input] (clojure.core/get {"DISABLED" :disabled, "ENABLED" :enabled, "NOT_INDICATED" :not-indicated} input))

(clojure.core/defn- deser-integer-min-1-max-8 [input] input)

(clojure.core/defn- deser-smooth-group-segmentation-mode [input] (clojure.core/get {"USE_INPUT_SEGMENTATION" :use-input-segmentation, "USE_SEGMENT_DURATION" :use-segment-duration} input))

(clojure.core/defn- deser-list-of-audio-description [input] (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (deser-audio-description coll))) input))

(clojure.core/defn- deser-hls-output-settings [input] (clojure.core/cond-> {:hls-settings (deser-hls-settings (input "hlsSettings"))} (clojure.core/contains? input "nameModifier") (clojure.core/assoc :name-modifier (deser-string-min-1 (input "nameModifier"))) (clojure.core/contains? input "segmentModifier") (clojure.core/assoc :segment-modifier (deser-string (input "segmentModifier")))))

(clojure.core/defn- deser-scte-35-splice-insert-web-delivery-allowed-behavior [input] (clojure.core/get {"FOLLOW" :follow, "IGNORE" :ignore} input))

(clojure.core/defn- deser-m-3u-8-settings [input] (clojure.core/cond-> {} (clojure.core/contains? input "patInterval") (clojure.core/assoc :pat-interval (deser-integer-min-0-max-1000 (input "patInterval"))) (clojure.core/contains? input "audioFramesPerPes") (clojure.core/assoc :audio-frames-per-pes (deser-integer-min-0 (input "audioFramesPerPes"))) (clojure.core/contains? input "transportStreamId") (clojure.core/assoc :transport-stream-id (deser-integer-min-0-max-65535 (input "transportStreamId"))) (clojure.core/contains? input "scte35Behavior") (clojure.core/assoc :scte-35-behavior (deser-m-3u-8-scte-35-behavior (input "scte35Behavior"))) (clojure.core/contains? input "timedMetadataBehavior") (clojure.core/assoc :timed-metadata-behavior (deser-m-3u-8-timed-metadata-behavior (input "timedMetadataBehavior"))) (clojure.core/contains? input "pcrControl") (clojure.core/assoc :pcr-control (deser-m-3u-8-pcr-control (input "pcrControl"))) (clojure.core/contains? input "scte35Pid") (clojure.core/assoc :scte-35-pid (deser-string (input "scte35Pid"))) (clojure.core/contains? input "pcrPid") (clojure.core/assoc :pcr-pid (deser-string (input "pcrPid"))) (clojure.core/contains? input "pmtPid") (clojure.core/assoc :pmt-pid (deser-string (input "pmtPid"))) (clojure.core/contains? input "videoPid") (clojure.core/assoc :video-pid (deser-string (input "videoPid"))) (clojure.core/contains? input "audioPids") (clojure.core/assoc :audio-pids (deser-string (input "audioPids"))) (clojure.core/contains? input "pcrPeriod") (clojure.core/assoc :pcr-period (deser-integer-min-0-max-500 (input "pcrPeriod"))) (clojure.core/contains? input "pmtInterval") (clojure.core/assoc :pmt-interval (deser-integer-min-0-max-1000 (input "pmtInterval"))) (clojure.core/contains? input "programNum") (clojure.core/assoc :program-num (deser-integer-min-0-max-65535 (input "programNum"))) (clojure.core/contains? input "timedMetadataPid") (clojure.core/assoc :timed-metadata-pid (deser-string (input "timedMetadataPid"))) (clojure.core/contains? input "ecmPid") (clojure.core/assoc :ecm-pid (deser-string (input "ecmPid")))))

(clojure.core/defn- deser-string-min-1-max-255 [input] input)

(clojure.core/defn- deser-list-of-audio-channel-mapping [input] (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (deser-audio-channel-mapping coll))) input))

(clojure.core/defn- deser-eac-3-stereo-downmix [input] (clojure.core/get {"DPL2" :dpl-2, "LO_RO" :lo-ro, "LT_RT" :lt-rt, "NOT_INDICATED" :not-indicated} input))

(clojure.core/defn- deser-integer-min-0-max-128 [input] input)

(clojure.core/defn- deser-integer-min-0-max-1000000 [input] input)

(clojure.core/defn- deser-h-264-syntax [input] (clojure.core/get {"DEFAULT" :default, "RP2027" :rp-2027} input))

(clojure.core/defn- deser-string-min-32-max-32 [input] input)

(clojure.core/defn- deser-input-resolution [input] (clojure.core/get {"SD" :sd, "HD" :hd, "UHD" :uhd} input))

(clojure.core/defn- deser-scte-20-convert-608-to-708 [input] (clojure.core/get {"DISABLED" :disabled, "UPCONVERT" :upconvert} input))

(clojure.core/defn- deser-h-264-flicker-aq [input] (clojure.core/get {"DISABLED" :disabled, "ENABLED" :enabled} input))

(clojure.core/defn- deser-hls-codec-specification [input] (clojure.core/get {"RFC_4281" :rfc-4281, "RFC_6381" :rfc-6381} input))

(clojure.core/defn- deser-avail-blanking [input] (clojure.core/cond-> {} (clojure.core/contains? input "availBlankingImage") (clojure.core/assoc :avail-blanking-image (deser-input-location (input "availBlankingImage"))) (clojure.core/contains? input "state") (clojure.core/assoc :state (deser-avail-blanking-state (input "state")))))

(clojure.core/defn- deser-m-2ts-audio-stream-type [input] (clojure.core/get {"ATSC" :atsc, "DVB" :dvb} input))

(clojure.core/defn- deser-string-min-34-max-34 [input] input)

(clojure.core/defn- deser-audio-selector [input] (clojure.core/cond-> {:name (deser-string-min-1 (input "name"))} (clojure.core/contains? input "selectorSettings") (clojure.core/assoc :selector-settings (deser-audio-selector-settings (input "selectorSettings")))))

(clojure.core/defn- deser-integer-min-1-max-16 [input] input)

(clojure.core/defn- deser-hls-akamai-settings [input] (clojure.core/cond-> {} (clojure.core/contains? input "connectionRetryInterval") (clojure.core/assoc :connection-retry-interval (deser-integer-min-0 (input "connectionRetryInterval"))) (clojure.core/contains? input "filecacheDuration") (clojure.core/assoc :filecache-duration (deser-integer-min-0-max-600 (input "filecacheDuration"))) (clojure.core/contains? input "httpTransferMode") (clojure.core/assoc :http-transfer-mode (deser-hls-akamai-http-transfer-mode (input "httpTransferMode"))) (clojure.core/contains? input "numRetries") (clojure.core/assoc :num-retries (deser-integer-min-0 (input "numRetries"))) (clojure.core/contains? input "restartDelay") (clojure.core/assoc :restart-delay (deser-integer-min-0-max-15 (input "restartDelay"))) (clojure.core/contains? input "salt") (clojure.core/assoc :salt (deser-string (input "salt"))) (clojure.core/contains? input "token") (clojure.core/assoc :token (deser-string (input "token")))))

(clojure.core/defn- deser-reservation-state [input] (clojure.core/get {"ACTIVE" :active, "EXPIRED" :expired, "CANCELED" :canceled, "DELETED" :deleted} input))

(clojure.core/defn- response-internal-server-error-exception ([input] (response-internal-server-error-exception nil input)) ([resultWrapper351682 input] (clojure.core/let [rawinput351681 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar351683 {"message" (rawinput351681 "message")}] (clojure.core/cond-> {} (letvar351683 "message") (clojure.core/assoc :message (deser-string (clojure.core/get-in letvar351683 ["message"])))))))

(clojure.core/defn- response-delete-input-security-group-response ([input] (response-delete-input-security-group-response nil input)) ([resultWrapper351685 input] (clojure.core/let [rawinput351684 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar351686 {}] (clojure.core/cond-> {}))))

(clojure.core/defn- response-bad-request-exception ([input] (response-bad-request-exception nil input)) ([resultWrapper351688 input] (clojure.core/let [rawinput351687 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar351689 {"message" (rawinput351687 "message")}] (clojure.core/cond-> {} (letvar351689 "message") (clojure.core/assoc :message (deser-string (clojure.core/get-in letvar351689 ["message"])))))))

(clojure.core/defn- response-list-tags-for-resource-response ([input] (response-list-tags-for-resource-response nil input)) ([resultWrapper351691 input] (clojure.core/let [rawinput351690 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar351692 {"tags" (rawinput351690 "tags")}] (clojure.core/cond-> {} (letvar351692 "tags") (clojure.core/assoc :tags (deser-tags (clojure.core/get-in letvar351692 ["tags"])))))))

(clojure.core/defn- response-list-offerings-response ([input] (response-list-offerings-response nil input)) ([resultWrapper351694 input] (clojure.core/let [rawinput351693 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar351695 {"nextToken" (rawinput351693 "nextToken"), "offerings" (rawinput351693 "offerings")}] (clojure.core/cond-> {} (letvar351695 "nextToken") (clojure.core/assoc :next-token (deser-string (clojure.core/get-in letvar351695 ["nextToken"]))) (letvar351695 "offerings") (clojure.core/assoc :offerings (deser-list-of-offering (clojure.core/get-in letvar351695 ["offerings"])))))))

(clojure.core/defn- response-create-input-security-group-response ([input] (response-create-input-security-group-response nil input)) ([resultWrapper351697 input] (clojure.core/let [rawinput351696 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar351698 {"securityGroup" (rawinput351696 "securityGroup")}] (clojure.core/cond-> {} (letvar351698 "securityGroup") (clojure.core/assoc :security-group (deser-input-security-group (clojure.core/get-in letvar351698 ["securityGroup"])))))))

(clojure.core/defn- response-forbidden-exception ([input] (response-forbidden-exception nil input)) ([resultWrapper351700 input] (clojure.core/let [rawinput351699 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar351701 {"message" (rawinput351699 "message")}] (clojure.core/cond-> {} (letvar351701 "message") (clojure.core/assoc :message (deser-string (clojure.core/get-in letvar351701 ["message"])))))))

(clojure.core/defn- response-delete-input-response ([input] (response-delete-input-response nil input)) ([resultWrapper351703 input] (clojure.core/let [rawinput351702 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar351704 {}] (clojure.core/cond-> {}))))

(clojure.core/defn- response-create-channel-response ([input] (response-create-channel-response nil input)) ([resultWrapper351706 input] (clojure.core/let [rawinput351705 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar351707 {"channel" (rawinput351705 "channel")}] (clojure.core/cond-> {} (letvar351707 "channel") (clojure.core/assoc :channel (deser-channel (clojure.core/get-in letvar351707 ["channel"])))))))

(clojure.core/defn- response-unprocessable-entity-exception ([input] (response-unprocessable-entity-exception nil input)) ([resultWrapper351709 input] (clojure.core/let [rawinput351708 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar351710 {"message" (rawinput351708 "message"), "validationErrors" (rawinput351708 "validationErrors")}] (clojure.core/cond-> {} (letvar351710 "message") (clojure.core/assoc :message (deser-string (clojure.core/get-in letvar351710 ["message"]))) (letvar351710 "validationErrors") (clojure.core/assoc :validation-errors (deser-list-of-validation-error (clojure.core/get-in letvar351710 ["validationErrors"])))))))

(clojure.core/defn- response-update-input-security-group-response ([input] (response-update-input-security-group-response nil input)) ([resultWrapper351712 input] (clojure.core/let [rawinput351711 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar351713 {"securityGroup" (rawinput351711 "securityGroup")}] (clojure.core/cond-> {} (letvar351713 "securityGroup") (clojure.core/assoc :security-group (deser-input-security-group (clojure.core/get-in letvar351713 ["securityGroup"])))))))

(clojure.core/defn- response-purchase-offering-response ([input] (response-purchase-offering-response nil input)) ([resultWrapper351715 input] (clojure.core/let [rawinput351714 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar351716 {"reservation" (rawinput351714 "reservation")}] (clojure.core/cond-> {} (letvar351716 "reservation") (clojure.core/assoc :reservation (deser-reservation (clojure.core/get-in letvar351716 ["reservation"])))))))

(clojure.core/defn- response-describe-channel-response ([input] (response-describe-channel-response nil input)) ([resultWrapper351718 input] (clojure.core/let [rawinput351717 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar351719 {"egressEndpoints" (rawinput351717 "egressEndpoints"), "logLevel" (rawinput351717 "logLevel"), "arn" (rawinput351717 "arn"), "inputAttachments" (rawinput351717 "inputAttachments"), "tags" (rawinput351717 "tags"), "roleArn" (rawinput351717 "roleArn"), "id" (rawinput351717 "id"), "name" (rawinput351717 "name"), "destinations" (rawinput351717 "destinations"), "state" (rawinput351717 "state"), "pipelinesRunningCount" (rawinput351717 "pipelinesRunningCount"), "inputSpecification" (rawinput351717 "inputSpecification"), "encoderSettings" (rawinput351717 "encoderSettings")}] (clojure.core/cond-> {} (letvar351719 "inputAttachments") (clojure.core/assoc :input-attachments (deser-list-of-input-attachment (clojure.core/get-in letvar351719 ["inputAttachments"]))) (letvar351719 "pipelinesRunningCount") (clojure.core/assoc :pipelines-running-count (deser-integer (clojure.core/get-in letvar351719 ["pipelinesRunningCount"]))) (letvar351719 "logLevel") (clojure.core/assoc :log-level (deser-log-level (clojure.core/get-in letvar351719 ["logLevel"]))) (letvar351719 "roleArn") (clojure.core/assoc :role-arn (deser-string (clojure.core/get-in letvar351719 ["roleArn"]))) (letvar351719 "tags") (clojure.core/assoc :tags (deser-tags (clojure.core/get-in letvar351719 ["tags"]))) (letvar351719 "egressEndpoints") (clojure.core/assoc :egress-endpoints (deser-list-of-channel-egress-endpoint (clojure.core/get-in letvar351719 ["egressEndpoints"]))) (letvar351719 "encoderSettings") (clojure.core/assoc :encoder-settings (deser-encoder-settings (clojure.core/get-in letvar351719 ["encoderSettings"]))) (letvar351719 "arn") (clojure.core/assoc :arn (deser-string (clojure.core/get-in letvar351719 ["arn"]))) (letvar351719 "inputSpecification") (clojure.core/assoc :input-specification (deser-input-specification (clojure.core/get-in letvar351719 ["inputSpecification"]))) (letvar351719 "state") (clojure.core/assoc :state (deser-channel-state (clojure.core/get-in letvar351719 ["state"]))) (letvar351719 "destinations") (clojure.core/assoc :destinations (deser-list-of-output-destination (clojure.core/get-in letvar351719 ["destinations"]))) (letvar351719 "name") (clojure.core/assoc :name (deser-string (clojure.core/get-in letvar351719 ["name"]))) (letvar351719 "id") (clojure.core/assoc :id (deser-string (clojure.core/get-in letvar351719 ["id"])))))))

(clojure.core/defn- response-describe-input-security-group-response ([input] (response-describe-input-security-group-response nil input)) ([resultWrapper351721 input] (clojure.core/let [rawinput351720 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar351722 {"arn" (rawinput351720 "arn"), "id" (rawinput351720 "id"), "inputs" (rawinput351720 "inputs"), "state" (rawinput351720 "state"), "tags" (rawinput351720 "tags"), "whitelistRules" (rawinput351720 "whitelistRules")}] (clojure.core/cond-> {} (letvar351722 "arn") (clojure.core/assoc :arn (deser-string (clojure.core/get-in letvar351722 ["arn"]))) (letvar351722 "id") (clojure.core/assoc :id (deser-string (clojure.core/get-in letvar351722 ["id"]))) (letvar351722 "inputs") (clojure.core/assoc :inputs (deser-list-of-string (clojure.core/get-in letvar351722 ["inputs"]))) (letvar351722 "state") (clojure.core/assoc :state (deser-input-security-group-state (clojure.core/get-in letvar351722 ["state"]))) (letvar351722 "tags") (clojure.core/assoc :tags (deser-tags (clojure.core/get-in letvar351722 ["tags"]))) (letvar351722 "whitelistRules") (clojure.core/assoc :whitelist-rules (deser-list-of-input-whitelist-rule (clojure.core/get-in letvar351722 ["whitelistRules"])))))))

(clojure.core/defn- response-batch-update-schedule-response ([input] (response-batch-update-schedule-response nil input)) ([resultWrapper351724 input] (clojure.core/let [rawinput351723 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar351725 {"creates" (rawinput351723 "creates"), "deletes" (rawinput351723 "deletes")}] (clojure.core/cond-> {} (letvar351725 "creates") (clojure.core/assoc :creates (deser-batch-schedule-action-create-result (clojure.core/get-in letvar351725 ["creates"]))) (letvar351725 "deletes") (clojure.core/assoc :deletes (deser-batch-schedule-action-delete-result (clojure.core/get-in letvar351725 ["deletes"])))))))

(clojure.core/defn- response-delete-channel-response ([input] (response-delete-channel-response nil input)) ([resultWrapper351727 input] (clojure.core/let [rawinput351726 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar351728 {"egressEndpoints" (rawinput351726 "egressEndpoints"), "logLevel" (rawinput351726 "logLevel"), "arn" (rawinput351726 "arn"), "inputAttachments" (rawinput351726 "inputAttachments"), "tags" (rawinput351726 "tags"), "roleArn" (rawinput351726 "roleArn"), "id" (rawinput351726 "id"), "name" (rawinput351726 "name"), "destinations" (rawinput351726 "destinations"), "state" (rawinput351726 "state"), "pipelinesRunningCount" (rawinput351726 "pipelinesRunningCount"), "inputSpecification" (rawinput351726 "inputSpecification"), "encoderSettings" (rawinput351726 "encoderSettings")}] (clojure.core/cond-> {} (letvar351728 "inputAttachments") (clojure.core/assoc :input-attachments (deser-list-of-input-attachment (clojure.core/get-in letvar351728 ["inputAttachments"]))) (letvar351728 "pipelinesRunningCount") (clojure.core/assoc :pipelines-running-count (deser-integer (clojure.core/get-in letvar351728 ["pipelinesRunningCount"]))) (letvar351728 "logLevel") (clojure.core/assoc :log-level (deser-log-level (clojure.core/get-in letvar351728 ["logLevel"]))) (letvar351728 "roleArn") (clojure.core/assoc :role-arn (deser-string (clojure.core/get-in letvar351728 ["roleArn"]))) (letvar351728 "tags") (clojure.core/assoc :tags (deser-tags (clojure.core/get-in letvar351728 ["tags"]))) (letvar351728 "egressEndpoints") (clojure.core/assoc :egress-endpoints (deser-list-of-channel-egress-endpoint (clojure.core/get-in letvar351728 ["egressEndpoints"]))) (letvar351728 "encoderSettings") (clojure.core/assoc :encoder-settings (deser-encoder-settings (clojure.core/get-in letvar351728 ["encoderSettings"]))) (letvar351728 "arn") (clojure.core/assoc :arn (deser-string (clojure.core/get-in letvar351728 ["arn"]))) (letvar351728 "inputSpecification") (clojure.core/assoc :input-specification (deser-input-specification (clojure.core/get-in letvar351728 ["inputSpecification"]))) (letvar351728 "state") (clojure.core/assoc :state (deser-channel-state (clojure.core/get-in letvar351728 ["state"]))) (letvar351728 "destinations") (clojure.core/assoc :destinations (deser-list-of-output-destination (clojure.core/get-in letvar351728 ["destinations"]))) (letvar351728 "name") (clojure.core/assoc :name (deser-string (clojure.core/get-in letvar351728 ["name"]))) (letvar351728 "id") (clojure.core/assoc :id (deser-string (clojure.core/get-in letvar351728 ["id"])))))))

(clojure.core/defn- response-too-many-requests-exception ([input] (response-too-many-requests-exception nil input)) ([resultWrapper351730 input] (clojure.core/let [rawinput351729 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar351731 {"message" (rawinput351729 "message")}] (clojure.core/cond-> {} (letvar351731 "message") (clojure.core/assoc :message (deser-string (clojure.core/get-in letvar351731 ["message"])))))))

(clojure.core/defn- response-list-inputs-response ([input] (response-list-inputs-response nil input)) ([resultWrapper351733 input] (clojure.core/let [rawinput351732 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar351734 {"inputs" (rawinput351732 "inputs"), "nextToken" (rawinput351732 "nextToken")}] (clojure.core/cond-> {} (letvar351734 "inputs") (clojure.core/assoc :inputs (deser-list-of-input (clojure.core/get-in letvar351734 ["inputs"]))) (letvar351734 "nextToken") (clojure.core/assoc :next-token (deser-string (clojure.core/get-in letvar351734 ["nextToken"])))))))

(clojure.core/defn- response-start-channel-response ([input] (response-start-channel-response nil input)) ([resultWrapper351736 input] (clojure.core/let [rawinput351735 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar351737 {"egressEndpoints" (rawinput351735 "egressEndpoints"), "logLevel" (rawinput351735 "logLevel"), "arn" (rawinput351735 "arn"), "inputAttachments" (rawinput351735 "inputAttachments"), "tags" (rawinput351735 "tags"), "roleArn" (rawinput351735 "roleArn"), "id" (rawinput351735 "id"), "name" (rawinput351735 "name"), "destinations" (rawinput351735 "destinations"), "state" (rawinput351735 "state"), "pipelinesRunningCount" (rawinput351735 "pipelinesRunningCount"), "inputSpecification" (rawinput351735 "inputSpecification"), "encoderSettings" (rawinput351735 "encoderSettings")}] (clojure.core/cond-> {} (letvar351737 "inputAttachments") (clojure.core/assoc :input-attachments (deser-list-of-input-attachment (clojure.core/get-in letvar351737 ["inputAttachments"]))) (letvar351737 "pipelinesRunningCount") (clojure.core/assoc :pipelines-running-count (deser-integer (clojure.core/get-in letvar351737 ["pipelinesRunningCount"]))) (letvar351737 "logLevel") (clojure.core/assoc :log-level (deser-log-level (clojure.core/get-in letvar351737 ["logLevel"]))) (letvar351737 "roleArn") (clojure.core/assoc :role-arn (deser-string (clojure.core/get-in letvar351737 ["roleArn"]))) (letvar351737 "tags") (clojure.core/assoc :tags (deser-tags (clojure.core/get-in letvar351737 ["tags"]))) (letvar351737 "egressEndpoints") (clojure.core/assoc :egress-endpoints (deser-list-of-channel-egress-endpoint (clojure.core/get-in letvar351737 ["egressEndpoints"]))) (letvar351737 "encoderSettings") (clojure.core/assoc :encoder-settings (deser-encoder-settings (clojure.core/get-in letvar351737 ["encoderSettings"]))) (letvar351737 "arn") (clojure.core/assoc :arn (deser-string (clojure.core/get-in letvar351737 ["arn"]))) (letvar351737 "inputSpecification") (clojure.core/assoc :input-specification (deser-input-specification (clojure.core/get-in letvar351737 ["inputSpecification"]))) (letvar351737 "state") (clojure.core/assoc :state (deser-channel-state (clojure.core/get-in letvar351737 ["state"]))) (letvar351737 "destinations") (clojure.core/assoc :destinations (deser-list-of-output-destination (clojure.core/get-in letvar351737 ["destinations"]))) (letvar351737 "name") (clojure.core/assoc :name (deser-string (clojure.core/get-in letvar351737 ["name"]))) (letvar351737 "id") (clojure.core/assoc :id (deser-string (clojure.core/get-in letvar351737 ["id"])))))))

(clojure.core/defn- response-list-channels-response ([input] (response-list-channels-response nil input)) ([resultWrapper351739 input] (clojure.core/let [rawinput351738 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar351740 {"channels" (rawinput351738 "channels"), "nextToken" (rawinput351738 "nextToken")}] (clojure.core/cond-> {} (letvar351740 "channels") (clojure.core/assoc :channels (deser-list-of-channel-summary (clojure.core/get-in letvar351740 ["channels"]))) (letvar351740 "nextToken") (clojure.core/assoc :next-token (deser-string (clojure.core/get-in letvar351740 ["nextToken"])))))))

(clojure.core/defn- response-conflict-exception ([input] (response-conflict-exception nil input)) ([resultWrapper351742 input] (clojure.core/let [rawinput351741 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar351743 {"message" (rawinput351741 "message")}] (clojure.core/cond-> {} (letvar351743 "message") (clojure.core/assoc :message (deser-string (clojure.core/get-in letvar351743 ["message"])))))))

(clojure.core/defn- response-stop-channel-response ([input] (response-stop-channel-response nil input)) ([resultWrapper351745 input] (clojure.core/let [rawinput351744 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar351746 {"egressEndpoints" (rawinput351744 "egressEndpoints"), "logLevel" (rawinput351744 "logLevel"), "arn" (rawinput351744 "arn"), "inputAttachments" (rawinput351744 "inputAttachments"), "tags" (rawinput351744 "tags"), "roleArn" (rawinput351744 "roleArn"), "id" (rawinput351744 "id"), "name" (rawinput351744 "name"), "destinations" (rawinput351744 "destinations"), "state" (rawinput351744 "state"), "pipelinesRunningCount" (rawinput351744 "pipelinesRunningCount"), "inputSpecification" (rawinput351744 "inputSpecification"), "encoderSettings" (rawinput351744 "encoderSettings")}] (clojure.core/cond-> {} (letvar351746 "inputAttachments") (clojure.core/assoc :input-attachments (deser-list-of-input-attachment (clojure.core/get-in letvar351746 ["inputAttachments"]))) (letvar351746 "pipelinesRunningCount") (clojure.core/assoc :pipelines-running-count (deser-integer (clojure.core/get-in letvar351746 ["pipelinesRunningCount"]))) (letvar351746 "logLevel") (clojure.core/assoc :log-level (deser-log-level (clojure.core/get-in letvar351746 ["logLevel"]))) (letvar351746 "roleArn") (clojure.core/assoc :role-arn (deser-string (clojure.core/get-in letvar351746 ["roleArn"]))) (letvar351746 "tags") (clojure.core/assoc :tags (deser-tags (clojure.core/get-in letvar351746 ["tags"]))) (letvar351746 "egressEndpoints") (clojure.core/assoc :egress-endpoints (deser-list-of-channel-egress-endpoint (clojure.core/get-in letvar351746 ["egressEndpoints"]))) (letvar351746 "encoderSettings") (clojure.core/assoc :encoder-settings (deser-encoder-settings (clojure.core/get-in letvar351746 ["encoderSettings"]))) (letvar351746 "arn") (clojure.core/assoc :arn (deser-string (clojure.core/get-in letvar351746 ["arn"]))) (letvar351746 "inputSpecification") (clojure.core/assoc :input-specification (deser-input-specification (clojure.core/get-in letvar351746 ["inputSpecification"]))) (letvar351746 "state") (clojure.core/assoc :state (deser-channel-state (clojure.core/get-in letvar351746 ["state"]))) (letvar351746 "destinations") (clojure.core/assoc :destinations (deser-list-of-output-destination (clojure.core/get-in letvar351746 ["destinations"]))) (letvar351746 "name") (clojure.core/assoc :name (deser-string (clojure.core/get-in letvar351746 ["name"]))) (letvar351746 "id") (clojure.core/assoc :id (deser-string (clojure.core/get-in letvar351746 ["id"])))))))

(clojure.core/defn- response-not-found-exception ([input] (response-not-found-exception nil input)) ([resultWrapper351748 input] (clojure.core/let [rawinput351747 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar351749 {"message" (rawinput351747 "message")}] (clojure.core/cond-> {} (letvar351749 "message") (clojure.core/assoc :message (deser-string (clojure.core/get-in letvar351749 ["message"])))))))

(clojure.core/defn- response-delete-reservation-response ([input] (response-delete-reservation-response nil input)) ([resultWrapper351751 input] (clojure.core/let [rawinput351750 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar351752 {"offeringDescription" (rawinput351750 "offeringDescription"), "arn" (rawinput351750 "arn"), "resourceSpecification" (rawinput351750 "resourceSpecification"), "offeringType" (rawinput351750 "offeringType"), "count" (rawinput351750 "count"), "fixedPrice" (rawinput351750 "fixedPrice"), "name" (rawinput351750 "name"), "start" (rawinput351750 "start"), "region" (rawinput351750 "region"), "currencyCode" (rawinput351750 "currencyCode"), "duration" (rawinput351750 "duration"), "state" (rawinput351750 "state"), "reservationId" (rawinput351750 "reservationId"), "usagePrice" (rawinput351750 "usagePrice"), "offeringId" (rawinput351750 "offeringId"), "end" (rawinput351750 "end"), "durationUnits" (rawinput351750 "durationUnits")}] (clojure.core/cond-> {} (letvar351752 "durationUnits") (clojure.core/assoc :duration-units (deser-offering-duration-units (clojure.core/get-in letvar351752 ["durationUnits"]))) (letvar351752 "currencyCode") (clojure.core/assoc :currency-code (deser-string (clojure.core/get-in letvar351752 ["currencyCode"]))) (letvar351752 "offeringDescription") (clojure.core/assoc :offering-description (deser-string (clojure.core/get-in letvar351752 ["offeringDescription"]))) (letvar351752 "resourceSpecification") (clojure.core/assoc :resource-specification (deser-reservation-resource-specification (clojure.core/get-in letvar351752 ["resourceSpecification"]))) (letvar351752 "start") (clojure.core/assoc :start (deser-string (clojure.core/get-in letvar351752 ["start"]))) (letvar351752 "fixedPrice") (clojure.core/assoc :fixed-price (deser-double (clojure.core/get-in letvar351752 ["fixedPrice"]))) (letvar351752 "end") (clojure.core/assoc :end (deser-string (clojure.core/get-in letvar351752 ["end"]))) (letvar351752 "count") (clojure.core/assoc :count (deser-integer (clojure.core/get-in letvar351752 ["count"]))) (letvar351752 "offeringId") (clojure.core/assoc :offering-id (deser-string (clojure.core/get-in letvar351752 ["offeringId"]))) (letvar351752 "duration") (clojure.core/assoc :duration (deser-integer (clojure.core/get-in letvar351752 ["duration"]))) (letvar351752 "usagePrice") (clojure.core/assoc :usage-price (deser-double (clojure.core/get-in letvar351752 ["usagePrice"]))) (letvar351752 "arn") (clojure.core/assoc :arn (deser-string (clojure.core/get-in letvar351752 ["arn"]))) (letvar351752 "state") (clojure.core/assoc :state (deser-reservation-state (clojure.core/get-in letvar351752 ["state"]))) (letvar351752 "offeringType") (clojure.core/assoc :offering-type (deser-offering-type (clojure.core/get-in letvar351752 ["offeringType"]))) (letvar351752 "name") (clojure.core/assoc :name (deser-string (clojure.core/get-in letvar351752 ["name"]))) (letvar351752 "reservationId") (clojure.core/assoc :reservation-id (deser-string (clojure.core/get-in letvar351752 ["reservationId"]))) (letvar351752 "region") (clojure.core/assoc :region (deser-string (clojure.core/get-in letvar351752 ["region"])))))))

(clojure.core/defn- response-update-input-response ([input] (response-update-input-response nil input)) ([resultWrapper351754 input] (clojure.core/let [rawinput351753 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar351755 {"input" (rawinput351753 "input")}] (clojure.core/cond-> {} (letvar351755 "input") (clojure.core/assoc :input (deser-input (clojure.core/get-in letvar351755 ["input"])))))))

(clojure.core/defn- response-describe-reservation-response ([input] (response-describe-reservation-response nil input)) ([resultWrapper351757 input] (clojure.core/let [rawinput351756 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar351758 {"offeringDescription" (rawinput351756 "offeringDescription"), "arn" (rawinput351756 "arn"), "resourceSpecification" (rawinput351756 "resourceSpecification"), "offeringType" (rawinput351756 "offeringType"), "count" (rawinput351756 "count"), "fixedPrice" (rawinput351756 "fixedPrice"), "name" (rawinput351756 "name"), "start" (rawinput351756 "start"), "region" (rawinput351756 "region"), "currencyCode" (rawinput351756 "currencyCode"), "duration" (rawinput351756 "duration"), "state" (rawinput351756 "state"), "reservationId" (rawinput351756 "reservationId"), "usagePrice" (rawinput351756 "usagePrice"), "offeringId" (rawinput351756 "offeringId"), "end" (rawinput351756 "end"), "durationUnits" (rawinput351756 "durationUnits")}] (clojure.core/cond-> {} (letvar351758 "durationUnits") (clojure.core/assoc :duration-units (deser-offering-duration-units (clojure.core/get-in letvar351758 ["durationUnits"]))) (letvar351758 "currencyCode") (clojure.core/assoc :currency-code (deser-string (clojure.core/get-in letvar351758 ["currencyCode"]))) (letvar351758 "offeringDescription") (clojure.core/assoc :offering-description (deser-string (clojure.core/get-in letvar351758 ["offeringDescription"]))) (letvar351758 "resourceSpecification") (clojure.core/assoc :resource-specification (deser-reservation-resource-specification (clojure.core/get-in letvar351758 ["resourceSpecification"]))) (letvar351758 "start") (clojure.core/assoc :start (deser-string (clojure.core/get-in letvar351758 ["start"]))) (letvar351758 "fixedPrice") (clojure.core/assoc :fixed-price (deser-double (clojure.core/get-in letvar351758 ["fixedPrice"]))) (letvar351758 "end") (clojure.core/assoc :end (deser-string (clojure.core/get-in letvar351758 ["end"]))) (letvar351758 "count") (clojure.core/assoc :count (deser-integer (clojure.core/get-in letvar351758 ["count"]))) (letvar351758 "offeringId") (clojure.core/assoc :offering-id (deser-string (clojure.core/get-in letvar351758 ["offeringId"]))) (letvar351758 "duration") (clojure.core/assoc :duration (deser-integer (clojure.core/get-in letvar351758 ["duration"]))) (letvar351758 "usagePrice") (clojure.core/assoc :usage-price (deser-double (clojure.core/get-in letvar351758 ["usagePrice"]))) (letvar351758 "arn") (clojure.core/assoc :arn (deser-string (clojure.core/get-in letvar351758 ["arn"]))) (letvar351758 "state") (clojure.core/assoc :state (deser-reservation-state (clojure.core/get-in letvar351758 ["state"]))) (letvar351758 "offeringType") (clojure.core/assoc :offering-type (deser-offering-type (clojure.core/get-in letvar351758 ["offeringType"]))) (letvar351758 "name") (clojure.core/assoc :name (deser-string (clojure.core/get-in letvar351758 ["name"]))) (letvar351758 "reservationId") (clojure.core/assoc :reservation-id (deser-string (clojure.core/get-in letvar351758 ["reservationId"]))) (letvar351758 "region") (clojure.core/assoc :region (deser-string (clojure.core/get-in letvar351758 ["region"])))))))

(clojure.core/defn- response-describe-input-response ([input] (response-describe-input-response nil input)) ([resultWrapper351760 input] (clojure.core/let [rawinput351759 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar351761 {"sources" (rawinput351759 "sources"), "arn" (rawinput351759 "arn"), "tags" (rawinput351759 "tags"), "roleArn" (rawinput351759 "roleArn"), "id" (rawinput351759 "id"), "securityGroups" (rawinput351759 "securityGroups"), "name" (rawinput351759 "name"), "destinations" (rawinput351759 "destinations"), "mediaConnectFlows" (rawinput351759 "mediaConnectFlows"), "type" (rawinput351759 "type"), "state" (rawinput351759 "state"), "attachedChannels" (rawinput351759 "attachedChannels")}] (clojure.core/cond-> {} (letvar351761 "mediaConnectFlows") (clojure.core/assoc :media-connect-flows (deser-list-of-media-connect-flow (clojure.core/get-in letvar351761 ["mediaConnectFlows"]))) (letvar351761 "type") (clojure.core/assoc :type (deser-input-type (clojure.core/get-in letvar351761 ["type"]))) (letvar351761 "securityGroups") (clojure.core/assoc :security-groups (deser-list-of-string (clojure.core/get-in letvar351761 ["securityGroups"]))) (letvar351761 "roleArn") (clojure.core/assoc :role-arn (deser-string (clojure.core/get-in letvar351761 ["roleArn"]))) (letvar351761 "tags") (clojure.core/assoc :tags (deser-tags (clojure.core/get-in letvar351761 ["tags"]))) (letvar351761 "arn") (clojure.core/assoc :arn (deser-string (clojure.core/get-in letvar351761 ["arn"]))) (letvar351761 "state") (clojure.core/assoc :state (deser-input-state (clojure.core/get-in letvar351761 ["state"]))) (letvar351761 "destinations") (clojure.core/assoc :destinations (deser-list-of-input-destination (clojure.core/get-in letvar351761 ["destinations"]))) (letvar351761 "name") (clojure.core/assoc :name (deser-string (clojure.core/get-in letvar351761 ["name"]))) (letvar351761 "sources") (clojure.core/assoc :sources (deser-list-of-input-source (clojure.core/get-in letvar351761 ["sources"]))) (letvar351761 "attachedChannels") (clojure.core/assoc :attached-channels (deser-list-of-string (clojure.core/get-in letvar351761 ["attachedChannels"]))) (letvar351761 "id") (clojure.core/assoc :id (deser-string (clojure.core/get-in letvar351761 ["id"])))))))

(clojure.core/defn- response-list-input-security-groups-response ([input] (response-list-input-security-groups-response nil input)) ([resultWrapper351763 input] (clojure.core/let [rawinput351762 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar351764 {"inputSecurityGroups" (rawinput351762 "inputSecurityGroups"), "nextToken" (rawinput351762 "nextToken")}] (clojure.core/cond-> {} (letvar351764 "inputSecurityGroups") (clojure.core/assoc :input-security-groups (deser-list-of-input-security-group (clojure.core/get-in letvar351764 ["inputSecurityGroups"]))) (letvar351764 "nextToken") (clojure.core/assoc :next-token (deser-string (clojure.core/get-in letvar351764 ["nextToken"])))))))

(clojure.core/defn- response-bad-gateway-exception ([input] (response-bad-gateway-exception nil input)) ([resultWrapper351766 input] (clojure.core/let [rawinput351765 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar351767 {"message" (rawinput351765 "message")}] (clojure.core/cond-> {} (letvar351767 "message") (clojure.core/assoc :message (deser-string (clojure.core/get-in letvar351767 ["message"])))))))

(clojure.core/defn- response-describe-offering-response ([input] (response-describe-offering-response nil input)) ([resultWrapper351769 input] (clojure.core/let [rawinput351768 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar351770 {"offeringDescription" (rawinput351768 "offeringDescription"), "arn" (rawinput351768 "arn"), "resourceSpecification" (rawinput351768 "resourceSpecification"), "offeringType" (rawinput351768 "offeringType"), "fixedPrice" (rawinput351768 "fixedPrice"), "region" (rawinput351768 "region"), "currencyCode" (rawinput351768 "currencyCode"), "duration" (rawinput351768 "duration"), "usagePrice" (rawinput351768 "usagePrice"), "offeringId" (rawinput351768 "offeringId"), "durationUnits" (rawinput351768 "durationUnits")}] (clojure.core/cond-> {} (letvar351770 "durationUnits") (clojure.core/assoc :duration-units (deser-offering-duration-units (clojure.core/get-in letvar351770 ["durationUnits"]))) (letvar351770 "currencyCode") (clojure.core/assoc :currency-code (deser-string (clojure.core/get-in letvar351770 ["currencyCode"]))) (letvar351770 "offeringDescription") (clojure.core/assoc :offering-description (deser-string (clojure.core/get-in letvar351770 ["offeringDescription"]))) (letvar351770 "resourceSpecification") (clojure.core/assoc :resource-specification (deser-reservation-resource-specification (clojure.core/get-in letvar351770 ["resourceSpecification"]))) (letvar351770 "fixedPrice") (clojure.core/assoc :fixed-price (deser-double (clojure.core/get-in letvar351770 ["fixedPrice"]))) (letvar351770 "offeringId") (clojure.core/assoc :offering-id (deser-string (clojure.core/get-in letvar351770 ["offeringId"]))) (letvar351770 "duration") (clojure.core/assoc :duration (deser-integer (clojure.core/get-in letvar351770 ["duration"]))) (letvar351770 "usagePrice") (clojure.core/assoc :usage-price (deser-double (clojure.core/get-in letvar351770 ["usagePrice"]))) (letvar351770 "arn") (clojure.core/assoc :arn (deser-string (clojure.core/get-in letvar351770 ["arn"]))) (letvar351770 "offeringType") (clojure.core/assoc :offering-type (deser-offering-type (clojure.core/get-in letvar351770 ["offeringType"]))) (letvar351770 "region") (clojure.core/assoc :region (deser-string (clojure.core/get-in letvar351770 ["region"])))))))

(clojure.core/defn- response-describe-schedule-response ([input] (response-describe-schedule-response nil input)) ([resultWrapper351772 input] (clojure.core/let [rawinput351771 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar351773 {"nextToken" (rawinput351771 "nextToken"), "scheduleActions" (rawinput351771 "scheduleActions")}] (clojure.core/cond-> {} (letvar351773 "nextToken") (clojure.core/assoc :next-token (deser-string (clojure.core/get-in letvar351773 ["nextToken"]))) (letvar351773 "scheduleActions") (clojure.core/assoc :schedule-actions (deser-list-of-schedule-action (clojure.core/get-in letvar351773 ["scheduleActions"])))))))

(clojure.core/defn- response-gateway-timeout-exception ([input] (response-gateway-timeout-exception nil input)) ([resultWrapper351775 input] (clojure.core/let [rawinput351774 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar351776 {"message" (rawinput351774 "message")}] (clojure.core/cond-> {} (letvar351776 "message") (clojure.core/assoc :message (deser-string (clojure.core/get-in letvar351776 ["message"])))))))

(clojure.core/defn- response-list-reservations-response ([input] (response-list-reservations-response nil input)) ([resultWrapper351778 input] (clojure.core/let [rawinput351777 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar351779 {"nextToken" (rawinput351777 "nextToken"), "reservations" (rawinput351777 "reservations")}] (clojure.core/cond-> {} (letvar351779 "nextToken") (clojure.core/assoc :next-token (deser-string (clojure.core/get-in letvar351779 ["nextToken"]))) (letvar351779 "reservations") (clojure.core/assoc :reservations (deser-list-of-reservation (clojure.core/get-in letvar351779 ["reservations"])))))))

(clojure.core/defn- response-create-input-response ([input] (response-create-input-response nil input)) ([resultWrapper351781 input] (clojure.core/let [rawinput351780 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar351782 {"input" (rawinput351780 "input")}] (clojure.core/cond-> {} (letvar351782 "input") (clojure.core/assoc :input (deser-input (clojure.core/get-in letvar351782 ["input"])))))))

(clojure.core/defn- response-update-channel-response ([input] (response-update-channel-response nil input)) ([resultWrapper351784 input] (clojure.core/let [rawinput351783 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar351785 {"channel" (rawinput351783 "channel")}] (clojure.core/cond-> {} (letvar351785 "channel") (clojure.core/assoc :channel (deser-channel (clojure.core/get-in letvar351785 ["channel"])))))))

(clojure.spec.alpha/def :portkey.aws.medialive/hls-manifest-compression #{"GZIP" "NONE" :gzip :none})

(clojure.spec.alpha/def :portkey.aws.medialive/hls-encryption-type #{:aes-128 "SAMPLE_AES" :sample-aes "AES128"})

(clojure.spec.alpha/def :portkey.aws.medialive/integer-min-0-max-600 (clojure.spec.alpha/int-in 0 600))

(clojure.spec.alpha/def :portkey.aws.medialive.output-location-ref/destination-ref-id (clojure.spec.alpha/and :portkey.aws.medialive/string))
(clojure.spec.alpha/def :portkey.aws.medialive/output-location-ref (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.medialive.output-location-ref/destination-ref-id]))

(clojure.spec.alpha/def :portkey.aws.medialive/hls-manifest-duration-format #{"FLOATING_POINT" :floating-point "INTEGER" :integer})

(clojure.spec.alpha/def :portkey.aws.medialive/integer-min-1000 (clojure.spec.alpha/int-in 1000 Long/MAX_VALUE))

(clojure.spec.alpha/def :portkey.aws.medialive/integer-min-negative-60-max-6 (clojure.spec.alpha/int-in -60 6))

(clojure.spec.alpha/def :portkey.aws.medialive/scte-35-apos-no-regional-blackout-behavior #{:follow :ignore "FOLLOW" "IGNORE"})

(clojure.spec.alpha/def :portkey.aws.medialive/input-filter #{"DISABLED" :disabled "AUTO" "FORCED" :auto :forced})

(clojure.spec.alpha/def :portkey.aws.medialive/audio-selector-settings (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.medialive/audio-language-selection :portkey.aws.medialive/audio-pid-selection]))

(clojure.spec.alpha/def :portkey.aws.medialive.describe-schedule-request/channel-id (clojure.spec.alpha/and :portkey.aws.medialive/string))
(clojure.spec.alpha/def :portkey.aws.medialive.describe-schedule-request/next-token (clojure.spec.alpha/and :portkey.aws.medialive/string))
(clojure.spec.alpha/def :portkey.aws.medialive/describe-schedule-request (clojure.spec.alpha/keys :req-un [:portkey.aws.medialive.describe-schedule-request/channel-id] :opt-un [:portkey.aws.medialive/max-results :portkey.aws.medialive.describe-schedule-request/next-token]))

(clojure.spec.alpha/def :portkey.aws.medialive.internal-server-error-exception/message (clojure.spec.alpha/and :portkey.aws.medialive/string))
(clojure.spec.alpha/def :portkey.aws.medialive/internal-server-error-exception (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.medialive.internal-server-error-exception/message]))

(clojure.spec.alpha/def :portkey.aws.medialive/audio-description-audio-type-control #{"FOLLOW_INPUT" :follow-input "USE_CONFIGURED" :use-configured})

(clojure.spec.alpha/def :portkey.aws.medialive/list-of-video-description (clojure.spec.alpha/coll-of :portkey.aws.medialive/video-description))

(clojure.spec.alpha/def :portkey.aws.medialive/integer-min-0-max-1000 (clojure.spec.alpha/int-in 0 1000))

(clojure.spec.alpha/def :portkey.aws.medialive/integer-min-0-max-65536 (clojure.spec.alpha/int-in 0 65536))

(clojure.spec.alpha/def :portkey.aws.medialive/empty (clojure.spec.alpha/keys :req-un [] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.medialive/h-264-adaptive-quantization #{:higher :medium "LOW" "MAX" :high "HIGHER" :max :off "HIGH" :low "OFF" "MEDIUM"})

(clojure.spec.alpha/def :portkey.aws.medialive/integer-min-1-max-1000000 (clojure.spec.alpha/int-in 1 1000000))

(clojure.spec.alpha/def :portkey.aws.medialive/integer-min-25-max-2000 (clojure.spec.alpha/int-in 25 2000))

(clojure.spec.alpha/def :portkey.aws.medialive.list-input-security-groups-result-model/input-security-groups (clojure.spec.alpha/and :portkey.aws.medialive/list-of-input-security-group))
(clojure.spec.alpha/def :portkey.aws.medialive.list-input-security-groups-result-model/next-token (clojure.spec.alpha/and :portkey.aws.medialive/string))
(clojure.spec.alpha/def :portkey.aws.medialive/list-input-security-groups-result-model (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.medialive.list-input-security-groups-result-model/input-security-groups :portkey.aws.medialive.list-input-security-groups-result-model/next-token]))

(clojure.spec.alpha/def :portkey.aws.medialive/input-loss-action-for-hls-out #{:emit-output :pause-output "PAUSE_OUTPUT" "EMIT_OUTPUT"})

(clojure.spec.alpha/def :portkey.aws.medialive/input-source-end-behavior #{"CONTINUE" "LOOP" :continue :loop})

(clojure.spec.alpha/def :portkey.aws.medialive/ttml-destination-style-control #{"USE_CONFIGURED" "PASSTHROUGH" :use-configured :passthrough})

(clojure.spec.alpha/def :portkey.aws.medialive/dvb-sdt-output-sdt #{:sdt-none "SDT_MANUAL" :sdt-manual :sdt-follow-if-present "SDT_NONE" "SDT_FOLLOW_IF_PRESENT" "SDT_FOLLOW" :sdt-follow})

(clojure.spec.alpha/def :portkey.aws.medialive.ttml-destination-settings/style-control (clojure.spec.alpha/and :portkey.aws.medialive/ttml-destination-style-control))
(clojure.spec.alpha/def :portkey.aws.medialive/ttml-destination-settings (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.medialive.ttml-destination-settings/style-control]))

(clojure.spec.alpha/def :portkey.aws.medialive/integer-min-1-max-4 (clojure.spec.alpha/int-in 1 4))

(clojure.spec.alpha/def :portkey.aws.medialive/m-2ts-pcr-control #{:configured-pcr-period "CONFIGURED_PCR_PERIOD" :pcr-every-pes-packet "PCR_EVERY_PES_PACKET"})

(clojure.spec.alpha/def :portkey.aws.medialive.limit-exceeded/message (clojure.spec.alpha/and :portkey.aws.medialive/string))
(clojure.spec.alpha/def :portkey.aws.medialive/limit-exceeded (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.medialive.limit-exceeded/message]))

(clojure.spec.alpha/def :portkey.aws.medialive/input-state #{:deleted :creating :detached :deleting "ATTACHED" "DELETING" "CREATING" "DETACHED" "DELETED" :attached})

(clojure.spec.alpha/def :portkey.aws.medialive.batch-schedule-action-create-result/schedule-actions (clojure.spec.alpha/and :portkey.aws.medialive/list-of-schedule-action))
(clojure.spec.alpha/def :portkey.aws.medialive/batch-schedule-action-create-result (clojure.spec.alpha/keys :req-un [:portkey.aws.medialive.batch-schedule-action-create-result/schedule-actions] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.medialive/h-264-scan-type #{"PROGRESSIVE" "INTERLACED" :progressive :interlaced})

(clojure.spec.alpha/def :portkey.aws.medialive/scte-35-device-restrictions #{"RESTRICT_GROUP1" :restrict-group-0 "RESTRICT_GROUP0" :restrict-group-2 "RESTRICT_GROUP2" "NONE" :restrict-group-1 :none})

(clojure.spec.alpha/def :portkey.aws.medialive.remix-settings/channel-mappings (clojure.spec.alpha/and :portkey.aws.medialive/list-of-audio-channel-mapping))
(clojure.spec.alpha/def :portkey.aws.medialive.remix-settings/channels-in (clojure.spec.alpha/and :portkey.aws.medialive/integer-min-1-max-16))
(clojure.spec.alpha/def :portkey.aws.medialive.remix-settings/channels-out (clojure.spec.alpha/and :portkey.aws.medialive/integer-min-1-max-8))
(clojure.spec.alpha/def :portkey.aws.medialive/remix-settings (clojure.spec.alpha/keys :req-un [:portkey.aws.medialive.remix-settings/channel-mappings] :opt-un [:portkey.aws.medialive.remix-settings/channels-in :portkey.aws.medialive.remix-settings/channels-out]))

(clojure.spec.alpha/def :portkey.aws.medialive.update-channel-request/channel-id (clojure.spec.alpha/and :portkey.aws.medialive/string))
(clojure.spec.alpha/def :portkey.aws.medialive.update-channel-request/destinations (clojure.spec.alpha/and :portkey.aws.medialive/list-of-output-destination))
(clojure.spec.alpha/def :portkey.aws.medialive.update-channel-request/input-attachments (clojure.spec.alpha/and :portkey.aws.medialive/list-of-input-attachment))
(clojure.spec.alpha/def :portkey.aws.medialive.update-channel-request/name (clojure.spec.alpha/and :portkey.aws.medialive/string))
(clojure.spec.alpha/def :portkey.aws.medialive.update-channel-request/role-arn (clojure.spec.alpha/and :portkey.aws.medialive/string))
(clojure.spec.alpha/def :portkey.aws.medialive/update-channel-request (clojure.spec.alpha/keys :req-un [:portkey.aws.medialive.update-channel-request/channel-id] :opt-un [:portkey.aws.medialive.update-channel-request/destinations :portkey.aws.medialive/encoder-settings :portkey.aws.medialive.update-channel-request/input-attachments :portkey.aws.medialive/input-specification :portkey.aws.medialive/log-level :portkey.aws.medialive.update-channel-request/name :portkey.aws.medialive.update-channel-request/role-arn]))

(clojure.spec.alpha/def :portkey.aws.medialive.dvb-tdt-settings/rep-interval (clojure.spec.alpha/and :portkey.aws.medialive/integer-min-1000-max-30000))
(clojure.spec.alpha/def :portkey.aws.medialive/dvb-tdt-settings (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.medialive.dvb-tdt-settings/rep-interval]))

(clojure.spec.alpha/def :portkey.aws.medialive.scte-35-time-signal-schedule-action-settings/scte-35-descriptors (clojure.spec.alpha/and :portkey.aws.medialive/list-of-scte-35-descriptor))
(clojure.spec.alpha/def :portkey.aws.medialive/scte-35-time-signal-schedule-action-settings (clojure.spec.alpha/keys :req-un [:portkey.aws.medialive.scte-35-time-signal-schedule-action-settings/scte-35-descriptors] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.medialive.update-input-security-group-request/input-security-group-id (clojure.spec.alpha/and :portkey.aws.medialive/string))
(clojure.spec.alpha/def :portkey.aws.medialive.update-input-security-group-request/whitelist-rules (clojure.spec.alpha/and :portkey.aws.medialive/list-of-input-whitelist-rule-cidr))
(clojure.spec.alpha/def :portkey.aws.medialive/update-input-security-group-request (clojure.spec.alpha/keys :req-un [:portkey.aws.medialive.update-input-security-group-request/input-security-group-id] :opt-un [:portkey.aws.medialive/tags :portkey.aws.medialive.update-input-security-group-request/whitelist-rules]))

(clojure.spec.alpha/def :portkey.aws.medialive/audio-type #{:hearing-impaired :visual-impaired-commentary "VISUAL_IMPAIRED_COMMENTARY" "UNDEFINED" :undefined :clean-effects "HEARING_IMPAIRED" "CLEAN_EFFECTS"})

(clojure.spec.alpha/def :portkey.aws.medialive/audio-normalization-algorithm-control #{:correct-audio "CORRECT_AUDIO"})

(clojure.spec.alpha/def :portkey.aws.medialive/integer-min-0-max-1099511627775 clojure.core/int?)

(clojure.spec.alpha/def :portkey.aws.medialive/list-of-channel-egress-endpoint (clojure.spec.alpha/coll-of :portkey.aws.medialive/channel-egress-endpoint))

(clojure.spec.alpha/def :portkey.aws.medialive.fixed-mode-schedule-action-start-settings/time (clojure.spec.alpha/and :portkey.aws.medialive/string))
(clojure.spec.alpha/def :portkey.aws.medialive/fixed-mode-schedule-action-start-settings (clojure.spec.alpha/keys :req-un [:portkey.aws.medialive.fixed-mode-schedule-action-start-settings/time] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.medialive.burn-in-destination-settings/outline-color (clojure.spec.alpha/and :portkey.aws.medialive/burn-in-outline-color))
(clojure.spec.alpha/def :portkey.aws.medialive.burn-in-destination-settings/outline-size (clojure.spec.alpha/and :portkey.aws.medialive/integer-min-0-max-10))
(clojure.spec.alpha/def :portkey.aws.medialive.burn-in-destination-settings/shadow-color (clojure.spec.alpha/and :portkey.aws.medialive/burn-in-shadow-color))
(clojure.spec.alpha/def :portkey.aws.medialive.burn-in-destination-settings/shadow-opacity (clojure.spec.alpha/and :portkey.aws.medialive/integer-min-0-max-255))
(clojure.spec.alpha/def :portkey.aws.medialive.burn-in-destination-settings/shadow-y-offset (clojure.spec.alpha/and :portkey.aws.medialive/integer))
(clojure.spec.alpha/def :portkey.aws.medialive.burn-in-destination-settings/background-color (clojure.spec.alpha/and :portkey.aws.medialive/burn-in-background-color))
(clojure.spec.alpha/def :portkey.aws.medialive.burn-in-destination-settings/teletext-grid-control (clojure.spec.alpha/and :portkey.aws.medialive/burn-in-teletext-grid-control))
(clojure.spec.alpha/def :portkey.aws.medialive.burn-in-destination-settings/y-position (clojure.spec.alpha/and :portkey.aws.medialive/integer-min-0))
(clojure.spec.alpha/def :portkey.aws.medialive.burn-in-destination-settings/font-color (clojure.spec.alpha/and :portkey.aws.medialive/burn-in-font-color))
(clojure.spec.alpha/def :portkey.aws.medialive.burn-in-destination-settings/x-position (clojure.spec.alpha/and :portkey.aws.medialive/integer-min-0))
(clojure.spec.alpha/def :portkey.aws.medialive.burn-in-destination-settings/font (clojure.spec.alpha/and :portkey.aws.medialive/input-location))
(clojure.spec.alpha/def :portkey.aws.medialive.burn-in-destination-settings/font-resolution (clojure.spec.alpha/and :portkey.aws.medialive/integer-min-96-max-600))
(clojure.spec.alpha/def :portkey.aws.medialive.burn-in-destination-settings/font-size (clojure.spec.alpha/and :portkey.aws.medialive/string))
(clojure.spec.alpha/def :portkey.aws.medialive.burn-in-destination-settings/background-opacity (clojure.spec.alpha/and :portkey.aws.medialive/integer-min-0-max-255))
(clojure.spec.alpha/def :portkey.aws.medialive.burn-in-destination-settings/font-opacity (clojure.spec.alpha/and :portkey.aws.medialive/integer-min-0-max-255))
(clojure.spec.alpha/def :portkey.aws.medialive.burn-in-destination-settings/shadow-x-offset (clojure.spec.alpha/and :portkey.aws.medialive/integer))
(clojure.spec.alpha/def :portkey.aws.medialive.burn-in-destination-settings/alignment (clojure.spec.alpha/and :portkey.aws.medialive/burn-in-alignment))
(clojure.spec.alpha/def :portkey.aws.medialive/burn-in-destination-settings (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.medialive.burn-in-destination-settings/outline-color :portkey.aws.medialive.burn-in-destination-settings/outline-size :portkey.aws.medialive.burn-in-destination-settings/shadow-color :portkey.aws.medialive.burn-in-destination-settings/shadow-opacity :portkey.aws.medialive.burn-in-destination-settings/shadow-y-offset :portkey.aws.medialive.burn-in-destination-settings/background-color :portkey.aws.medialive.burn-in-destination-settings/teletext-grid-control :portkey.aws.medialive.burn-in-destination-settings/y-position :portkey.aws.medialive.burn-in-destination-settings/font-color :portkey.aws.medialive.burn-in-destination-settings/x-position :portkey.aws.medialive.burn-in-destination-settings/font :portkey.aws.medialive.burn-in-destination-settings/font-resolution :portkey.aws.medialive.burn-in-destination-settings/font-size :portkey.aws.medialive.burn-in-destination-settings/background-opacity :portkey.aws.medialive.burn-in-destination-settings/font-opacity :portkey.aws.medialive.burn-in-destination-settings/shadow-x-offset :portkey.aws.medialive.burn-in-destination-settings/alignment]))

(clojure.spec.alpha/def :portkey.aws.medialive/eac-3-drc-rf #{"MUSIC_LIGHT" :music-standard :film-standard "FILM_STANDARD" "NONE" "FILM_LIGHT" :film-light "SPEECH" :music-light "MUSIC_STANDARD" :speech :none})

(clojure.spec.alpha/def :portkey.aws.medialive/list-of-offering (clojure.spec.alpha/coll-of :portkey.aws.medialive/offering))

(clojure.spec.alpha/def :portkey.aws.medialive/delete-input-security-group-response (clojure.spec.alpha/keys :req-un [] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.medialive/input-security-group-state #{"IDLE" :deleted "IN_USE" :idle "UPDATING" :in-use :updating "DELETED"})

(clojure.spec.alpha/def :portkey.aws.medialive.bad-request-exception/message (clojure.spec.alpha/and :portkey.aws.medialive/string))
(clojure.spec.alpha/def :portkey.aws.medialive/bad-request-exception (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.medialive.bad-request-exception/message]))

(clojure.spec.alpha/def :portkey.aws.medialive.audio-description/stream-name (clojure.spec.alpha/and :portkey.aws.medialive/string))
(clojure.spec.alpha/def :portkey.aws.medialive.audio-description/codec-settings (clojure.spec.alpha/and :portkey.aws.medialive/audio-codec-settings))
(clojure.spec.alpha/def :portkey.aws.medialive.audio-description/language-code-control (clojure.spec.alpha/and :portkey.aws.medialive/audio-description-language-code-control))
(clojure.spec.alpha/def :portkey.aws.medialive.audio-description/audio-type-control (clojure.spec.alpha/and :portkey.aws.medialive/audio-description-audio-type-control))
(clojure.spec.alpha/def :portkey.aws.medialive.audio-description/language-code (clojure.spec.alpha/and :portkey.aws.medialive/string-min-3-max-3))
(clojure.spec.alpha/def :portkey.aws.medialive.audio-description/name (clojure.spec.alpha/and :portkey.aws.medialive/string))
(clojure.spec.alpha/def :portkey.aws.medialive.audio-description/audio-selector-name (clojure.spec.alpha/and :portkey.aws.medialive/string))
(clojure.spec.alpha/def :portkey.aws.medialive/audio-description (clojure.spec.alpha/keys :req-un [:portkey.aws.medialive.audio-description/audio-selector-name :portkey.aws.medialive.audio-description/name] :opt-un [:portkey.aws.medialive.audio-description/stream-name :portkey.aws.medialive/remix-settings :portkey.aws.medialive/audio-type :portkey.aws.medialive.audio-description/codec-settings :portkey.aws.medialive.audio-description/language-code-control :portkey.aws.medialive.audio-description/audio-type-control :portkey.aws.medialive.audio-description/language-code :portkey.aws.medialive/audio-normalization-settings]))

(clojure.spec.alpha/def :portkey.aws.medialive.batch-schedule-action-create-request/schedule-actions (clojure.spec.alpha/and :portkey.aws.medialive/list-of-schedule-action))
(clojure.spec.alpha/def :portkey.aws.medialive/batch-schedule-action-create-request (clojure.spec.alpha/keys :req-un [:portkey.aws.medialive.batch-schedule-action-create-request/schedule-actions] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.medialive/aac-vbr-quality #{:medium-high "LOW" "MEDIUM_LOW" :high "HIGH" :low "MEDIUM_HIGH" :medium-low})

(clojure.spec.alpha/def :portkey.aws.medialive/list-of-input-source (clojure.spec.alpha/coll-of :portkey.aws.medialive/input-source))

(clojure.spec.alpha/def :portkey.aws.medialive.hls-basic-put-settings/connection-retry-interval (clojure.spec.alpha/and :portkey.aws.medialive/integer-min-0))
(clojure.spec.alpha/def :portkey.aws.medialive.hls-basic-put-settings/filecache-duration (clojure.spec.alpha/and :portkey.aws.medialive/integer-min-0-max-600))
(clojure.spec.alpha/def :portkey.aws.medialive.hls-basic-put-settings/num-retries (clojure.spec.alpha/and :portkey.aws.medialive/integer-min-0))
(clojure.spec.alpha/def :portkey.aws.medialive.hls-basic-put-settings/restart-delay (clojure.spec.alpha/and :portkey.aws.medialive/integer-min-0-max-15))
(clojure.spec.alpha/def :portkey.aws.medialive/hls-basic-put-settings (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.medialive.hls-basic-put-settings/connection-retry-interval :portkey.aws.medialive.hls-basic-put-settings/filecache-duration :portkey.aws.medialive.hls-basic-put-settings/num-retries :portkey.aws.medialive.hls-basic-put-settings/restart-delay]))

(clojure.spec.alpha/def :portkey.aws.medialive.describe-input-security-group-request/input-security-group-id (clojure.spec.alpha/and :portkey.aws.medialive/string))
(clojure.spec.alpha/def :portkey.aws.medialive/describe-input-security-group-request (clojure.spec.alpha/keys :req-un [:portkey.aws.medialive.describe-input-security-group-request/input-security-group-id] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.medialive/m-2ts-klv #{"PASSTHROUGH" "NONE" :passthrough :none})

(clojure.spec.alpha/def :portkey.aws.medialive/list-tags-for-resource-response (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.medialive/tags]))

(clojure.spec.alpha/def :portkey.aws.medialive.global-configuration/initial-audio-gain (clojure.spec.alpha/and :portkey.aws.medialive/integer-min-negative-60-max-60))
(clojure.spec.alpha/def :portkey.aws.medialive.global-configuration/input-end-action (clojure.spec.alpha/and :portkey.aws.medialive/global-configuration-input-end-action))
(clojure.spec.alpha/def :portkey.aws.medialive.global-configuration/output-timing-source (clojure.spec.alpha/and :portkey.aws.medialive/global-configuration-output-timing-source))
(clojure.spec.alpha/def :portkey.aws.medialive.global-configuration/support-low-framerate-inputs (clojure.spec.alpha/and :portkey.aws.medialive/global-configuration-low-framerate-inputs))
(clojure.spec.alpha/def :portkey.aws.medialive/global-configuration (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.medialive.global-configuration/initial-audio-gain :portkey.aws.medialive.global-configuration/input-end-action :portkey.aws.medialive/input-loss-behavior :portkey.aws.medialive.global-configuration/output-timing-source :portkey.aws.medialive.global-configuration/support-low-framerate-inputs]))

(clojure.spec.alpha/def :portkey.aws.medialive/m-3u-8-pcr-control #{:configured-pcr-period "CONFIGURED_PCR_PERIOD" :pcr-every-pes-packet "PCR_EVERY_PES_PACKET"})

(clojure.spec.alpha/def :portkey.aws.medialive.archive-output-settings/container-settings (clojure.spec.alpha/and :portkey.aws.medialive/archive-container-settings))
(clojure.spec.alpha/def :portkey.aws.medialive.archive-output-settings/extension (clojure.spec.alpha/and :portkey.aws.medialive/string))
(clojure.spec.alpha/def :portkey.aws.medialive.archive-output-settings/name-modifier (clojure.spec.alpha/and :portkey.aws.medialive/string))
(clojure.spec.alpha/def :portkey.aws.medialive/archive-output-settings (clojure.spec.alpha/keys :req-un [:portkey.aws.medialive.archive-output-settings/container-settings] :opt-un [:portkey.aws.medialive.archive-output-settings/extension :portkey.aws.medialive.archive-output-settings/name-modifier]))

(clojure.spec.alpha/def :portkey.aws.medialive/string-min-6-max-6 (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__21110__auto__] (clojure.core/<= 6 (clojure.core/count s__21110__auto__))) (clojure.core/fn [s__21111__auto__] (clojure.core/< (clojure.core/count s__21111__auto__) 6))))

(clojure.spec.alpha/def :portkey.aws.medialive/m-2ts-audio-buffer-model #{:atsc :dvb "DVB" "ATSC"})

(clojure.spec.alpha/def :portkey.aws.medialive.validation-error/element-path (clojure.spec.alpha/and :portkey.aws.medialive/string))
(clojure.spec.alpha/def :portkey.aws.medialive.validation-error/error-message (clojure.spec.alpha/and :portkey.aws.medialive/string))
(clojure.spec.alpha/def :portkey.aws.medialive/validation-error (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.medialive.validation-error/element-path :portkey.aws.medialive.validation-error/error-message]))

(clojure.spec.alpha/def :portkey.aws.medialive/h-264-gop-size-units #{"SECONDS" :frames :seconds "FRAMES"})

(clojure.spec.alpha/def :portkey.aws.medialive/hls-directory-structure #{:single-directory "SINGLE_DIRECTORY" "SUBDIRECTORY_PER_STREAM" :subdirectory-per-stream})

(clojure.spec.alpha/def :portkey.aws.medialive.frame-capture-output-settings/name-modifier (clojure.spec.alpha/and :portkey.aws.medialive/string))
(clojure.spec.alpha/def :portkey.aws.medialive/frame-capture-output-settings (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.medialive.frame-capture-output-settings/name-modifier]))

(clojure.spec.alpha/def :portkey.aws.medialive/m-2ts-ebp-placement #{:video-and-audio-pids "VIDEO_AND_AUDIO_PIDS" "VIDEO_PID" :video-pid})

(clojure.spec.alpha/def :portkey.aws.medialive/dvb-sub-destination-teletext-grid-control #{"FIXED" "SCALED" :fixed :scaled})

(clojure.spec.alpha/def :portkey.aws.medialive.eac-3-settings/lt-rt-surround-mix-level (clojure.spec.alpha/and :portkey.aws.medialive/double))
(clojure.spec.alpha/def :portkey.aws.medialive.eac-3-settings/coding-mode (clojure.spec.alpha/and :portkey.aws.medialive/eac-3-coding-mode))
(clojure.spec.alpha/def :portkey.aws.medialive.eac-3-settings/phase-control (clojure.spec.alpha/and :portkey.aws.medialive/eac-3-phase-control))
(clojure.spec.alpha/def :portkey.aws.medialive.eac-3-settings/passthrough-control (clojure.spec.alpha/and :portkey.aws.medialive/eac-3-passthrough-control))
(clojure.spec.alpha/def :portkey.aws.medialive.eac-3-settings/surround-mode (clojure.spec.alpha/and :portkey.aws.medialive/eac-3-surround-mode))
(clojure.spec.alpha/def :portkey.aws.medialive.eac-3-settings/attenuation-control (clojure.spec.alpha/and :portkey.aws.medialive/eac-3-attenuation-control))
(clojure.spec.alpha/def :portkey.aws.medialive.eac-3-settings/drc-line (clojure.spec.alpha/and :portkey.aws.medialive/eac-3-drc-line))
(clojure.spec.alpha/def :portkey.aws.medialive.eac-3-settings/dc-filter (clojure.spec.alpha/and :portkey.aws.medialive/eac-3-dc-filter))
(clojure.spec.alpha/def :portkey.aws.medialive.eac-3-settings/lfe-filter (clojure.spec.alpha/and :portkey.aws.medialive/eac-3-lfe-filter))
(clojure.spec.alpha/def :portkey.aws.medialive.eac-3-settings/lfe-control (clojure.spec.alpha/and :portkey.aws.medialive/eac-3-lfe-control))
(clojure.spec.alpha/def :portkey.aws.medialive.eac-3-settings/lo-ro-center-mix-level (clojure.spec.alpha/and :portkey.aws.medialive/double))
(clojure.spec.alpha/def :portkey.aws.medialive.eac-3-settings/stereo-downmix (clojure.spec.alpha/and :portkey.aws.medialive/eac-3-stereo-downmix))
(clojure.spec.alpha/def :portkey.aws.medialive.eac-3-settings/lt-rt-center-mix-level (clojure.spec.alpha/and :portkey.aws.medialive/double))
(clojure.spec.alpha/def :portkey.aws.medialive.eac-3-settings/surround-ex-mode (clojure.spec.alpha/and :portkey.aws.medialive/eac-3-surround-ex-mode))
(clojure.spec.alpha/def :portkey.aws.medialive.eac-3-settings/metadata-control (clojure.spec.alpha/and :portkey.aws.medialive/eac-3-metadata-control))
(clojure.spec.alpha/def :portkey.aws.medialive.eac-3-settings/lo-ro-surround-mix-level (clojure.spec.alpha/and :portkey.aws.medialive/double))
(clojure.spec.alpha/def :portkey.aws.medialive.eac-3-settings/drc-rf (clojure.spec.alpha/and :portkey.aws.medialive/eac-3-drc-rf))
(clojure.spec.alpha/def :portkey.aws.medialive.eac-3-settings/bitstream-mode (clojure.spec.alpha/and :portkey.aws.medialive/eac-3-bitstream-mode))
(clojure.spec.alpha/def :portkey.aws.medialive.eac-3-settings/dialnorm (clojure.spec.alpha/and :portkey.aws.medialive/integer-min-1-max-31))
(clojure.spec.alpha/def :portkey.aws.medialive.eac-3-settings/bitrate (clojure.spec.alpha/and :portkey.aws.medialive/double))
(clojure.spec.alpha/def :portkey.aws.medialive/eac-3-settings (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.medialive.eac-3-settings/lt-rt-surround-mix-level :portkey.aws.medialive.eac-3-settings/coding-mode :portkey.aws.medialive.eac-3-settings/phase-control :portkey.aws.medialive.eac-3-settings/passthrough-control :portkey.aws.medialive.eac-3-settings/surround-mode :portkey.aws.medialive.eac-3-settings/attenuation-control :portkey.aws.medialive.eac-3-settings/drc-line :portkey.aws.medialive.eac-3-settings/dc-filter :portkey.aws.medialive.eac-3-settings/lfe-filter :portkey.aws.medialive.eac-3-settings/lfe-control :portkey.aws.medialive.eac-3-settings/lo-ro-center-mix-level :portkey.aws.medialive.eac-3-settings/stereo-downmix :portkey.aws.medialive.eac-3-settings/lt-rt-center-mix-level :portkey.aws.medialive.eac-3-settings/surround-ex-mode :portkey.aws.medialive.eac-3-settings/metadata-control :portkey.aws.medialive.eac-3-settings/lo-ro-surround-mix-level :portkey.aws.medialive.eac-3-settings/drc-rf :portkey.aws.medialive.eac-3-settings/bitstream-mode :portkey.aws.medialive.eac-3-settings/dialnorm :portkey.aws.medialive.eac-3-settings/bitrate]))

(clojure.spec.alpha/def :portkey.aws.medialive.access-denied/message (clojure.spec.alpha/and :portkey.aws.medialive/string))
(clojure.spec.alpha/def :portkey.aws.medialive/access-denied (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.medialive.access-denied/message]))

(clojure.spec.alpha/def :portkey.aws.medialive.list-offerings-response/next-token (clojure.spec.alpha/and :portkey.aws.medialive/string))
(clojure.spec.alpha/def :portkey.aws.medialive.list-offerings-response/offerings (clojure.spec.alpha/and :portkey.aws.medialive/list-of-offering))
(clojure.spec.alpha/def :portkey.aws.medialive/list-offerings-response (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.medialive.list-offerings-response/next-token :portkey.aws.medialive.list-offerings-response/offerings]))

(clojure.spec.alpha/def :portkey.aws.medialive/audio-normalization-algorithm #{:itu-1770-2 :itu-1770-1 "ITU_1770_1" "ITU_1770_2"})

(clojure.spec.alpha/def :portkey.aws.medialive.follow-mode-schedule-action-start-settings/reference-action-name (clojure.spec.alpha/and :portkey.aws.medialive/string))
(clojure.spec.alpha/def :portkey.aws.medialive/follow-mode-schedule-action-start-settings (clojure.spec.alpha/keys :req-un [:portkey.aws.medialive.follow-mode-schedule-action-start-settings/reference-action-name :portkey.aws.medialive/follow-point] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.medialive/rtmp-caption-data #{"FIELD1_608" :field-1-and-field-2-608 :all "FIELD1_AND_FIELD2_608" "ALL" :field-1-608})

(clojure.spec.alpha/def :portkey.aws.medialive/hls-mode #{"VOD" "LIVE" :vod :live})

(clojure.spec.alpha/def :portkey.aws.medialive/log-level #{"DISABLED" "WARNING" :disabled :debug "ERROR" :warning "DEBUG" :info :error "INFO"})

(clojure.spec.alpha/def :portkey.aws.medialive/follow-point #{:start "END" "START" :end})

(clojure.spec.alpha/def :portkey.aws.medialive/integer-min-0-max-500 (clojure.spec.alpha/int-in 0 500))

(clojure.spec.alpha/def :portkey.aws.medialive/i-frame-only-playlist-type #{"DISABLED" :disabled "STANDARD" :standard})

(clojure.spec.alpha/def :portkey.aws.medialive.input-loss-behavior/black-frame-msec (clojure.spec.alpha/and :portkey.aws.medialive/integer-min-0-max-1000000))
(clojure.spec.alpha/def :portkey.aws.medialive.input-loss-behavior/input-loss-image-color (clojure.spec.alpha/and :portkey.aws.medialive/string-min-6-max-6))
(clojure.spec.alpha/def :portkey.aws.medialive.input-loss-behavior/input-loss-image-slate (clojure.spec.alpha/and :portkey.aws.medialive/input-location))
(clojure.spec.alpha/def :portkey.aws.medialive.input-loss-behavior/repeat-frame-msec (clojure.spec.alpha/and :portkey.aws.medialive/integer-min-0-max-1000000))
(clojure.spec.alpha/def :portkey.aws.medialive/input-loss-behavior (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.medialive.input-loss-behavior/black-frame-msec :portkey.aws.medialive.input-loss-behavior/input-loss-image-color :portkey.aws.medialive.input-loss-behavior/input-loss-image-slate :portkey.aws.medialive/input-loss-image-type :portkey.aws.medialive.input-loss-behavior/repeat-frame-msec]))

(clojure.spec.alpha/def :portkey.aws.medialive/input-loss-image-type #{:color :slate "SLATE" "COLOR"})

(clojure.spec.alpha/def :portkey.aws.medialive/list-of-output-destination-settings (clojure.spec.alpha/coll-of :portkey.aws.medialive/output-destination-settings))

(clojure.spec.alpha/def :portkey.aws.medialive.udp-group-settings/input-loss-action (clojure.spec.alpha/and :portkey.aws.medialive/input-loss-action-for-udp-out))
(clojure.spec.alpha/def :portkey.aws.medialive.udp-group-settings/timed-metadata-id-3-frame (clojure.spec.alpha/and :portkey.aws.medialive/udp-timed-metadata-id-3-frame))
(clojure.spec.alpha/def :portkey.aws.medialive.udp-group-settings/timed-metadata-id-3-period (clojure.spec.alpha/and :portkey.aws.medialive/integer-min-0))
(clojure.spec.alpha/def :portkey.aws.medialive/udp-group-settings (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.medialive.udp-group-settings/input-loss-action :portkey.aws.medialive.udp-group-settings/timed-metadata-id-3-frame :portkey.aws.medialive.udp-group-settings/timed-metadata-id-3-period]))

(clojure.spec.alpha/def :portkey.aws.medialive.input-whitelist-rule-cidr/cidr (clojure.spec.alpha/and :portkey.aws.medialive/string))
(clojure.spec.alpha/def :portkey.aws.medialive/input-whitelist-rule-cidr (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.medialive.input-whitelist-rule-cidr/cidr]))

(clojure.spec.alpha/def :portkey.aws.medialive/m-2ts-arib #{"DISABLED" :disabled "ENABLED" :enabled})

(clojure.spec.alpha/def :portkey.aws.medialive.create-input-security-group-response/security-group (clojure.spec.alpha/and :portkey.aws.medialive/input-security-group))
(clojure.spec.alpha/def :portkey.aws.medialive/create-input-security-group-response (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.medialive.create-input-security-group-response/security-group]))

(clojure.spec.alpha/def :portkey.aws.medialive.delete-reservation-request/reservation-id (clojure.spec.alpha/and :portkey.aws.medialive/string))
(clojure.spec.alpha/def :portkey.aws.medialive/delete-reservation-request (clojure.spec.alpha/keys :req-un [:portkey.aws.medialive.delete-reservation-request/reservation-id] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.medialive/dvb-sub-destination-font-color #{:white :yellow :green "GREEN" "BLUE" :red :blue "WHITE" "YELLOW" "BLACK" "RED" :black})

(clojure.spec.alpha/def :portkey.aws.medialive/input-type #{:mediaconnect :rtmp-pull "MP4_FILE" :url-pull :mp-4-file :rtmp-push "RTMP_PULL" "UDP_PUSH" "URL_PULL" :rtp-push :udp-push "RTP_PUSH" "MEDIACONNECT" "RTMP_PUSH"})

(clojure.spec.alpha/def :portkey.aws.medialive.list-tags-for-resource-request/resource-arn (clojure.spec.alpha/and :portkey.aws.medialive/string))
(clojure.spec.alpha/def :portkey.aws.medialive/list-tags-for-resource-request (clojure.spec.alpha/keys :req-un [:portkey.aws.medialive.list-tags-for-resource-request/resource-arn] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.medialive.dvb-sdt-settings/output-sdt (clojure.spec.alpha/and :portkey.aws.medialive/dvb-sdt-output-sdt))
(clojure.spec.alpha/def :portkey.aws.medialive.dvb-sdt-settings/rep-interval (clojure.spec.alpha/and :portkey.aws.medialive/integer-min-25-max-2000))
(clojure.spec.alpha/def :portkey.aws.medialive.dvb-sdt-settings/service-name (clojure.spec.alpha/and :portkey.aws.medialive/string-min-1-max-256))
(clojure.spec.alpha/def :portkey.aws.medialive.dvb-sdt-settings/service-provider-name (clojure.spec.alpha/and :portkey.aws.medialive/string-min-1-max-256))
(clojure.spec.alpha/def :portkey.aws.medialive/dvb-sdt-settings (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.medialive.dvb-sdt-settings/output-sdt :portkey.aws.medialive.dvb-sdt-settings/rep-interval :portkey.aws.medialive.dvb-sdt-settings/service-name :portkey.aws.medialive.dvb-sdt-settings/service-provider-name]))

(clojure.spec.alpha/def :portkey.aws.medialive.forbidden-exception/message (clojure.spec.alpha/and :portkey.aws.medialive/string))
(clojure.spec.alpha/def :portkey.aws.medialive/forbidden-exception (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.medialive.forbidden-exception/message]))

(clojure.spec.alpha/def :portkey.aws.medialive/delete-input-response (clojure.spec.alpha/keys :req-un [] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.medialive/burn-in-background-color #{:white "NONE" "WHITE" "BLACK" :none :black})

(clojure.spec.alpha/def :portkey.aws.medialive.video-selector-program-id/program-id (clojure.spec.alpha/and :portkey.aws.medialive/integer-min-0-max-65536))
(clojure.spec.alpha/def :portkey.aws.medialive/video-selector-program-id (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.medialive.video-selector-program-id/program-id]))

(clojure.spec.alpha/def :portkey.aws.medialive.archive-group-settings/destination (clojure.spec.alpha/and :portkey.aws.medialive/output-location-ref))
(clojure.spec.alpha/def :portkey.aws.medialive.archive-group-settings/rollover-interval (clojure.spec.alpha/and :portkey.aws.medialive/integer-min-1))
(clojure.spec.alpha/def :portkey.aws.medialive/archive-group-settings (clojure.spec.alpha/keys :req-un [:portkey.aws.medialive.archive-group-settings/destination] :opt-un [:portkey.aws.medialive.archive-group-settings/rollover-interval]))

(clojure.spec.alpha/def :portkey.aws.medialive.update-channel/destinations (clojure.spec.alpha/and :portkey.aws.medialive/list-of-output-destination))
(clojure.spec.alpha/def :portkey.aws.medialive.update-channel/input-attachments (clojure.spec.alpha/and :portkey.aws.medialive/list-of-input-attachment))
(clojure.spec.alpha/def :portkey.aws.medialive.update-channel/name (clojure.spec.alpha/and :portkey.aws.medialive/string))
(clojure.spec.alpha/def :portkey.aws.medialive.update-channel/role-arn (clojure.spec.alpha/and :portkey.aws.medialive/string))
(clojure.spec.alpha/def :portkey.aws.medialive/update-channel (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.medialive.update-channel/destinations :portkey.aws.medialive/encoder-settings :portkey.aws.medialive.update-channel/input-attachments :portkey.aws.medialive/input-specification :portkey.aws.medialive/log-level :portkey.aws.medialive.update-channel/name :portkey.aws.medialive.update-channel/role-arn]))

(clojure.spec.alpha/def :portkey.aws.medialive.hls-timed-metadata-schedule-action-settings/id-3 (clojure.spec.alpha/and :portkey.aws.medialive/string))
(clojure.spec.alpha/def :portkey.aws.medialive/hls-timed-metadata-schedule-action-settings (clojure.spec.alpha/keys :req-un [:portkey.aws.medialive.hls-timed-metadata-schedule-action-settings/id-3] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.medialive.udp-output-settings/buffer-msec (clojure.spec.alpha/and :portkey.aws.medialive/integer-min-0-max-10000))
(clojure.spec.alpha/def :portkey.aws.medialive.udp-output-settings/container-settings (clojure.spec.alpha/and :portkey.aws.medialive/udp-container-settings))
(clojure.spec.alpha/def :portkey.aws.medialive.udp-output-settings/destination (clojure.spec.alpha/and :portkey.aws.medialive/output-location-ref))
(clojure.spec.alpha/def :portkey.aws.medialive/udp-output-settings (clojure.spec.alpha/keys :req-un [:portkey.aws.medialive.udp-output-settings/destination :portkey.aws.medialive.udp-output-settings/container-settings] :opt-un [:portkey.aws.medialive.udp-output-settings/buffer-msec :portkey.aws.medialive/fec-output-settings]))

(clojure.spec.alpha/def :portkey.aws.medialive/udp-timed-metadata-id-3-frame #{"TDRL" "NONE" "PRIV" :priv :none :tdrl})

(clojure.spec.alpha/def :portkey.aws.medialive/create-channel-response (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.medialive/channel]))

(clojure.spec.alpha/def :portkey.aws.medialive.input-destination-request/stream-name (clojure.spec.alpha/and :portkey.aws.medialive/string))
(clojure.spec.alpha/def :portkey.aws.medialive/input-destination-request (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.medialive.input-destination-request/stream-name]))

(clojure.spec.alpha/def :portkey.aws.medialive/integer-min-0 (clojure.spec.alpha/int-in 0 Long/MAX_VALUE))

(clojure.spec.alpha/def :portkey.aws.medialive.unprocessable-entity-exception/message (clojure.spec.alpha/and :portkey.aws.medialive/string))
(clojure.spec.alpha/def :portkey.aws.medialive.unprocessable-entity-exception/validation-errors (clojure.spec.alpha/and :portkey.aws.medialive/list-of-validation-error))
(clojure.spec.alpha/def :portkey.aws.medialive/unprocessable-entity-exception (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.medialive.unprocessable-entity-exception/message :portkey.aws.medialive.unprocessable-entity-exception/validation-errors]))

(clojure.spec.alpha/def :portkey.aws.medialive/hls-settings (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.medialive/audio-only-hls-settings :portkey.aws.medialive/standard-hls-settings]))

(clojure.spec.alpha/def :portkey.aws.medialive.scte-35-splice-insert-schedule-action-settings/duration (clojure.spec.alpha/and :portkey.aws.medialive/integer-min-0-max-8589934591))
(clojure.spec.alpha/def :portkey.aws.medialive.scte-35-splice-insert-schedule-action-settings/splice-event-id (clojure.spec.alpha/and :portkey.aws.medialive/integer-min-0-max-4294967295))
(clojure.spec.alpha/def :portkey.aws.medialive/scte-35-splice-insert-schedule-action-settings (clojure.spec.alpha/keys :req-un [:portkey.aws.medialive.scte-35-splice-insert-schedule-action-settings/splice-event-id] :opt-un [:portkey.aws.medialive.scte-35-splice-insert-schedule-action-settings/duration]))

(clojure.spec.alpha/def :portkey.aws.medialive/ac-3-lfe-filter #{"DISABLED" :disabled "ENABLED" :enabled})

(clojure.spec.alpha/def :portkey.aws.medialive.list-offerings-result-model/next-token (clojure.spec.alpha/and :portkey.aws.medialive/string))
(clojure.spec.alpha/def :portkey.aws.medialive.list-offerings-result-model/offerings (clojure.spec.alpha/and :portkey.aws.medialive/list-of-offering))
(clojure.spec.alpha/def :portkey.aws.medialive/list-offerings-result-model (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.medialive.list-offerings-result-model/next-token :portkey.aws.medialive.list-offerings-result-model/offerings]))

(clojure.spec.alpha/def :portkey.aws.medialive/burn-in-teletext-grid-control #{"FIXED" "SCALED" :fixed :scaled})

(clojure.spec.alpha/def :portkey.aws.medialive/scte-27-destination-settings (clojure.spec.alpha/keys :req-un [] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.medialive.schedule-action/action-name (clojure.spec.alpha/and :portkey.aws.medialive/string))
(clojure.spec.alpha/def :portkey.aws.medialive/schedule-action (clojure.spec.alpha/keys :req-un [:portkey.aws.medialive.schedule-action/action-name :portkey.aws.medialive/schedule-action-start-settings :portkey.aws.medialive/schedule-action-settings] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.medialive/video-selector-color-space-usage #{:force :fallback "FORCE" "FALLBACK"})

(clojure.spec.alpha/def :portkey.aws.medialive.scte-20-source-settings/convert-608-to-708 (clojure.spec.alpha/and :portkey.aws.medialive/scte-20-convert-608-to-708))
(clojure.spec.alpha/def :portkey.aws.medialive.scte-20-source-settings/source-608-channel-number (clojure.spec.alpha/and :portkey.aws.medialive/integer-min-1-max-4))
(clojure.spec.alpha/def :portkey.aws.medialive/scte-20-source-settings (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.medialive.scte-20-source-settings/convert-608-to-708 :portkey.aws.medialive.scte-20-source-settings/source-608-channel-number]))

(clojure.spec.alpha/def :portkey.aws.medialive/hls-stream-inf-resolution #{:exclude :include "INCLUDE" "EXCLUDE"})

(clojure.spec.alpha/def :portkey.aws.medialive/list-of-schedule-action (clojure.spec.alpha/coll-of :portkey.aws.medialive/schedule-action))

(clojure.spec.alpha/def :portkey.aws.medialive/hls-caption-language-setting #{:insert "INSERT" "NONE" :omit "OMIT" :none})

(clojure.spec.alpha/def :portkey.aws.medialive/list-of-input-whitelist-rule-cidr (clojure.spec.alpha/coll-of :portkey.aws.medialive/input-whitelist-rule-cidr))

(clojure.spec.alpha/def :portkey.aws.medialive.m-2ts-settings/pat-interval (clojure.spec.alpha/and :portkey.aws.medialive/integer-min-0-max-1000))
(clojure.spec.alpha/def :portkey.aws.medialive.m-2ts-settings/buffer-model (clojure.spec.alpha/and :portkey.aws.medialive/m-2ts-buffer-model))
(clojure.spec.alpha/def :portkey.aws.medialive.m-2ts-settings/audio-frames-per-pes (clojure.spec.alpha/and :portkey.aws.medialive/integer-min-0))
(clojure.spec.alpha/def :portkey.aws.medialive.m-2ts-settings/fragment-time (clojure.spec.alpha/and :portkey.aws.medialive/double-min-0))
(clojure.spec.alpha/def :portkey.aws.medialive.m-2ts-settings/transport-stream-id (clojure.spec.alpha/and :portkey.aws.medialive/integer-min-0-max-65535))
(clojure.spec.alpha/def :portkey.aws.medialive.m-2ts-settings/timed-metadata-behavior (clojure.spec.alpha/and :portkey.aws.medialive/m-2ts-timed-metadata-behavior))
(clojure.spec.alpha/def :portkey.aws.medialive.m-2ts-settings/absent-input-audio-behavior (clojure.spec.alpha/and :portkey.aws.medialive/m-2ts-absent-input-audio-behavior))
(clojure.spec.alpha/def :portkey.aws.medialive.m-2ts-settings/pcr-control (clojure.spec.alpha/and :portkey.aws.medialive/m-2ts-pcr-control))
(clojure.spec.alpha/def :portkey.aws.medialive.m-2ts-settings/scte-35-pid (clojure.spec.alpha/and :portkey.aws.medialive/string))
(clojure.spec.alpha/def :portkey.aws.medialive.m-2ts-settings/pcr-pid (clojure.spec.alpha/and :portkey.aws.medialive/string))
(clojure.spec.alpha/def :portkey.aws.medialive.m-2ts-settings/pmt-pid (clojure.spec.alpha/and :portkey.aws.medialive/string))
(clojure.spec.alpha/def :portkey.aws.medialive.m-2ts-settings/video-pid (clojure.spec.alpha/and :portkey.aws.medialive/string))
(clojure.spec.alpha/def :portkey.aws.medialive.m-2ts-settings/rate-mode (clojure.spec.alpha/and :portkey.aws.medialive/m-2ts-rate-mode))
(clojure.spec.alpha/def :portkey.aws.medialive.m-2ts-settings/audio-pids (clojure.spec.alpha/and :portkey.aws.medialive/string))
(clojure.spec.alpha/def :portkey.aws.medialive.m-2ts-settings/etv-platform-pid (clojure.spec.alpha/and :portkey.aws.medialive/string))
(clojure.spec.alpha/def :portkey.aws.medialive.m-2ts-settings/ebp-lookahead-ms (clojure.spec.alpha/and :portkey.aws.medialive/integer-min-0-max-10000))
(clojure.spec.alpha/def :portkey.aws.medialive.m-2ts-settings/arib (clojure.spec.alpha/and :portkey.aws.medialive/m-2ts-arib))
(clojure.spec.alpha/def :portkey.aws.medialive.m-2ts-settings/ebif (clojure.spec.alpha/and :portkey.aws.medialive/m-2ts-ebif-control))
(clojure.spec.alpha/def :portkey.aws.medialive.m-2ts-settings/pcr-period (clojure.spec.alpha/and :portkey.aws.medialive/integer-min-0-max-500))
(clojure.spec.alpha/def :portkey.aws.medialive.m-2ts-settings/cc-descriptor (clojure.spec.alpha/and :portkey.aws.medialive/m-2ts-cc-descriptor))
(clojure.spec.alpha/def :portkey.aws.medialive.m-2ts-settings/etv-signal-pid (clojure.spec.alpha/and :portkey.aws.medialive/string))
(clojure.spec.alpha/def :portkey.aws.medialive.m-2ts-settings/pmt-interval (clojure.spec.alpha/and :portkey.aws.medialive/integer-min-0-max-1000))
(clojure.spec.alpha/def :portkey.aws.medialive.m-2ts-settings/segmentation-style (clojure.spec.alpha/and :portkey.aws.medialive/m-2ts-segmentation-style))
(clojure.spec.alpha/def :portkey.aws.medialive.m-2ts-settings/null-packet-bitrate (clojure.spec.alpha/and :portkey.aws.medialive/double-min-0))
(clojure.spec.alpha/def :portkey.aws.medialive.m-2ts-settings/segmentation-markers (clojure.spec.alpha/and :portkey.aws.medialive/m-2ts-segmentation-markers))
(clojure.spec.alpha/def :portkey.aws.medialive.m-2ts-settings/ebp-placement (clojure.spec.alpha/and :portkey.aws.medialive/m-2ts-ebp-placement))
(clojure.spec.alpha/def :portkey.aws.medialive.m-2ts-settings/scte-35-control (clojure.spec.alpha/and :portkey.aws.medialive/m-2ts-scte-35-control))
(clojure.spec.alpha/def :portkey.aws.medialive.m-2ts-settings/audio-buffer-model (clojure.spec.alpha/and :portkey.aws.medialive/m-2ts-audio-buffer-model))
(clojure.spec.alpha/def :portkey.aws.medialive.m-2ts-settings/es-rate-in-pes (clojure.spec.alpha/and :portkey.aws.medialive/m-2ts-es-rate-in-pes))
(clojure.spec.alpha/def :portkey.aws.medialive.m-2ts-settings/klv (clojure.spec.alpha/and :portkey.aws.medialive/m-2ts-klv))
(clojure.spec.alpha/def :portkey.aws.medialive.m-2ts-settings/program-num (clojure.spec.alpha/and :portkey.aws.medialive/integer-min-0-max-65535))
(clojure.spec.alpha/def :portkey.aws.medialive.m-2ts-settings/timed-metadata-pid (clojure.spec.alpha/and :portkey.aws.medialive/string))
(clojure.spec.alpha/def :portkey.aws.medialive.m-2ts-settings/audio-stream-type (clojure.spec.alpha/and :portkey.aws.medialive/m-2ts-audio-stream-type))
(clojure.spec.alpha/def :portkey.aws.medialive.m-2ts-settings/scte-27-pids (clojure.spec.alpha/and :portkey.aws.medialive/string))
(clojure.spec.alpha/def :portkey.aws.medialive.m-2ts-settings/arib-captions-pid-control (clojure.spec.alpha/and :portkey.aws.medialive/m-2ts-arib-captions-pid-control))
(clojure.spec.alpha/def :portkey.aws.medialive.m-2ts-settings/klv-data-pids (clojure.spec.alpha/and :portkey.aws.medialive/string))
(clojure.spec.alpha/def :portkey.aws.medialive.m-2ts-settings/dvb-sub-pids (clojure.spec.alpha/and :portkey.aws.medialive/string))
(clojure.spec.alpha/def :portkey.aws.medialive.m-2ts-settings/ebp-audio-interval (clojure.spec.alpha/and :portkey.aws.medialive/m-2ts-audio-interval))
(clojure.spec.alpha/def :portkey.aws.medialive.m-2ts-settings/ecm-pid (clojure.spec.alpha/and :portkey.aws.medialive/string))
(clojure.spec.alpha/def :portkey.aws.medialive.m-2ts-settings/dvb-teletext-pid (clojure.spec.alpha/and :portkey.aws.medialive/string))
(clojure.spec.alpha/def :portkey.aws.medialive.m-2ts-settings/arib-captions-pid (clojure.spec.alpha/and :portkey.aws.medialive/string))
(clojure.spec.alpha/def :portkey.aws.medialive.m-2ts-settings/bitrate (clojure.spec.alpha/and :portkey.aws.medialive/integer-min-0))
(clojure.spec.alpha/def :portkey.aws.medialive.m-2ts-settings/segmentation-time (clojure.spec.alpha/and :portkey.aws.medialive/double-min-1))
(clojure.spec.alpha/def :portkey.aws.medialive/m-2ts-settings (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.medialive.m-2ts-settings/pat-interval :portkey.aws.medialive.m-2ts-settings/buffer-model :portkey.aws.medialive/dvb-tdt-settings :portkey.aws.medialive.m-2ts-settings/audio-frames-per-pes :portkey.aws.medialive.m-2ts-settings/fragment-time :portkey.aws.medialive.m-2ts-settings/transport-stream-id :portkey.aws.medialive.m-2ts-settings/timed-metadata-behavior :portkey.aws.medialive/dvb-sdt-settings :portkey.aws.medialive.m-2ts-settings/absent-input-audio-behavior :portkey.aws.medialive.m-2ts-settings/pcr-control :portkey.aws.medialive.m-2ts-settings/scte-35-pid :portkey.aws.medialive.m-2ts-settings/pcr-pid :portkey.aws.medialive.m-2ts-settings/pmt-pid :portkey.aws.medialive.m-2ts-settings/video-pid :portkey.aws.medialive.m-2ts-settings/rate-mode :portkey.aws.medialive.m-2ts-settings/audio-pids :portkey.aws.medialive.m-2ts-settings/etv-platform-pid :portkey.aws.medialive.m-2ts-settings/ebp-lookahead-ms :portkey.aws.medialive.m-2ts-settings/arib :portkey.aws.medialive.m-2ts-settings/ebif :portkey.aws.medialive.m-2ts-settings/pcr-period :portkey.aws.medialive.m-2ts-settings/cc-descriptor :portkey.aws.medialive.m-2ts-settings/etv-signal-pid :portkey.aws.medialive.m-2ts-settings/pmt-interval :portkey.aws.medialive.m-2ts-settings/segmentation-style :portkey.aws.medialive.m-2ts-settings/null-packet-bitrate :portkey.aws.medialive.m-2ts-settings/segmentation-markers :portkey.aws.medialive.m-2ts-settings/ebp-placement :portkey.aws.medialive.m-2ts-settings/scte-35-control :portkey.aws.medialive.m-2ts-settings/audio-buffer-model :portkey.aws.medialive.m-2ts-settings/es-rate-in-pes :portkey.aws.medialive.m-2ts-settings/klv :portkey.aws.medialive.m-2ts-settings/program-num :portkey.aws.medialive.m-2ts-settings/timed-metadata-pid :portkey.aws.medialive.m-2ts-settings/audio-stream-type :portkey.aws.medialive.m-2ts-settings/scte-27-pids :portkey.aws.medialive.m-2ts-settings/arib-captions-pid-control :portkey.aws.medialive.m-2ts-settings/klv-data-pids :portkey.aws.medialive.m-2ts-settings/dvb-sub-pids :portkey.aws.medialive.m-2ts-settings/ebp-audio-interval :portkey.aws.medialive.m-2ts-settings/ecm-pid :portkey.aws.medialive/dvb-nit-settings :portkey.aws.medialive.m-2ts-settings/dvb-teletext-pid :portkey.aws.medialive.m-2ts-settings/arib-captions-pid :portkey.aws.medialive.m-2ts-settings/bitrate :portkey.aws.medialive.m-2ts-settings/segmentation-time]))

(clojure.spec.alpha/def :portkey.aws.medialive/string (clojure.spec.alpha/and clojure.core/string?))

(clojure.spec.alpha/def :portkey.aws.medialive/scte-35-splice-insert-no-regional-blackout-behavior #{:follow :ignore "FOLLOW" "IGNORE"})

(clojure.spec.alpha/def :portkey.aws.medialive.dvb-sub-source-settings/pid (clojure.spec.alpha/and :portkey.aws.medialive/integer-min-1))
(clojure.spec.alpha/def :portkey.aws.medialive/dvb-sub-source-settings (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.medialive.dvb-sub-source-settings/pid]))

(clojure.spec.alpha/def :portkey.aws.medialive/input-denoise-filter #{"DISABLED" :disabled "ENABLED" :enabled})

(clojure.spec.alpha/def :portkey.aws.medialive.video-selector-pid/pid (clojure.spec.alpha/and :portkey.aws.medialive/integer-min-0-max-8191))
(clojure.spec.alpha/def :portkey.aws.medialive/video-selector-pid (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.medialive.video-selector-pid/pid]))

(clojure.spec.alpha/def :portkey.aws.medialive.scte-35-descriptor-settings/segmentation-descriptor-scte-35-descriptor-settings (clojure.spec.alpha/and :portkey.aws.medialive/scte-35-segmentation-descriptor))
(clojure.spec.alpha/def :portkey.aws.medialive/scte-35-descriptor-settings (clojure.spec.alpha/keys :req-un [:portkey.aws.medialive.scte-35-descriptor-settings/segmentation-descriptor-scte-35-descriptor-settings] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.medialive.update-input-security-group-response/security-group (clojure.spec.alpha/and :portkey.aws.medialive/input-security-group))
(clojure.spec.alpha/def :portkey.aws.medialive/update-input-security-group-response (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.medialive.update-input-security-group-response/security-group]))

(clojure.spec.alpha/def :portkey.aws.medialive/afd-signaling #{"AUTO" "FIXED" "NONE" :fixed :auto :none})

(clojure.spec.alpha/def :portkey.aws.medialive/list-of-audio-selector (clojure.spec.alpha/coll-of :portkey.aws.medialive/audio-selector))

(clojure.spec.alpha/def :portkey.aws.medialive/aac-profile #{"LC" :hev-1 :lc "HEV2" "HEV1" :hev-2})

(clojure.spec.alpha/def :portkey.aws.medialive/burn-in-font-color #{:white :yellow :green "GREEN" "BLUE" :red :blue "WHITE" "YELLOW" "BLACK" "RED" :black})

(clojure.spec.alpha/def :portkey.aws.medialive/purchase-offering-response (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.medialive/reservation]))

(clojure.spec.alpha/def :portkey.aws.medialive.pause-state-schedule-action-settings/pipelines (clojure.spec.alpha/and :portkey.aws.medialive/list-of-pipeline-pause-state-settings))
(clojure.spec.alpha/def :portkey.aws.medialive/pause-state-schedule-action-settings (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.medialive.pause-state-schedule-action-settings/pipelines]))

(clojure.spec.alpha/def :portkey.aws.medialive.input-source-request/password-param (clojure.spec.alpha/and :portkey.aws.medialive/string))
(clojure.spec.alpha/def :portkey.aws.medialive.input-source-request/url (clojure.spec.alpha/and :portkey.aws.medialive/string))
(clojure.spec.alpha/def :portkey.aws.medialive.input-source-request/username (clojure.spec.alpha/and :portkey.aws.medialive/string))
(clojure.spec.alpha/def :portkey.aws.medialive/input-source-request (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.medialive.input-source-request/password-param :portkey.aws.medialive.input-source-request/url :portkey.aws.medialive.input-source-request/username]))

(clojure.spec.alpha/def :portkey.aws.medialive/eac-3-metadata-control #{"FOLLOW_INPUT" :follow-input "USE_CONFIGURED" :use-configured})

(clojure.spec.alpha/def :portkey.aws.medialive.fec-output-settings/column-depth (clojure.spec.alpha/and :portkey.aws.medialive/integer-min-4-max-20))
(clojure.spec.alpha/def :portkey.aws.medialive.fec-output-settings/include-fec (clojure.spec.alpha/and :portkey.aws.medialive/fec-output-include-fec))
(clojure.spec.alpha/def :portkey.aws.medialive.fec-output-settings/row-length (clojure.spec.alpha/and :portkey.aws.medialive/integer-min-1-max-20))
(clojure.spec.alpha/def :portkey.aws.medialive/fec-output-settings (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.medialive.fec-output-settings/column-depth :portkey.aws.medialive.fec-output-settings/include-fec :portkey.aws.medialive.fec-output-settings/row-length]))

(clojure.spec.alpha/def :portkey.aws.medialive/global-configuration-input-end-action #{:switch-and-loop-inputs "SWITCH_AND_LOOP_INPUTS" "NONE" :none})

(clojure.spec.alpha/def :portkey.aws.medialive/integer-min-0-max-65535 (clojure.spec.alpha/int-in 0 65535))

(clojure.spec.alpha/def :portkey.aws.medialive/hls-webdav-http-transfer-mode #{"NON_CHUNKED" "CHUNKED" :chunked :non-chunked})

(clojure.spec.alpha/def :portkey.aws.medialive.delete-tags-request/resource-arn (clojure.spec.alpha/and :portkey.aws.medialive/string))
(clojure.spec.alpha/def :portkey.aws.medialive.delete-tags-request/tag-keys (clojure.spec.alpha/and :portkey.aws.medialive/list-of-string))
(clojure.spec.alpha/def :portkey.aws.medialive/delete-tags-request (clojure.spec.alpha/keys :req-un [:portkey.aws.medialive.delete-tags-request/tag-keys :portkey.aws.medialive.delete-tags-request/resource-arn] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.medialive/offering-duration-units #{:months "MONTHS"})

(clojure.spec.alpha/def :portkey.aws.medialive.hls-webdav-settings/connection-retry-interval (clojure.spec.alpha/and :portkey.aws.medialive/integer-min-0))
(clojure.spec.alpha/def :portkey.aws.medialive.hls-webdav-settings/filecache-duration (clojure.spec.alpha/and :portkey.aws.medialive/integer-min-0-max-600))
(clojure.spec.alpha/def :portkey.aws.medialive.hls-webdav-settings/http-transfer-mode (clojure.spec.alpha/and :portkey.aws.medialive/hls-webdav-http-transfer-mode))
(clojure.spec.alpha/def :portkey.aws.medialive.hls-webdav-settings/num-retries (clojure.spec.alpha/and :portkey.aws.medialive/integer-min-0))
(clojure.spec.alpha/def :portkey.aws.medialive.hls-webdav-settings/restart-delay (clojure.spec.alpha/and :portkey.aws.medialive/integer-min-0-max-15))
(clojure.spec.alpha/def :portkey.aws.medialive/hls-webdav-settings (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.medialive.hls-webdav-settings/connection-retry-interval :portkey.aws.medialive.hls-webdav-settings/filecache-duration :portkey.aws.medialive.hls-webdav-settings/http-transfer-mode :portkey.aws.medialive.hls-webdav-settings/num-retries :portkey.aws.medialive.hls-webdav-settings/restart-delay]))

(clojure.spec.alpha/def :portkey.aws.medialive/long clojure.core/int?)

(clojure.spec.alpha/def :portkey.aws.medialive.internal-service-error/message (clojure.spec.alpha/and :portkey.aws.medialive/string))
(clojure.spec.alpha/def :portkey.aws.medialive/internal-service-error (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.medialive.internal-service-error/message]))

(clojure.spec.alpha/def :portkey.aws.medialive/double-min-1 clojure.core/double?)

(clojure.spec.alpha/def :portkey.aws.medialive/dvb-sub-destination-background-color #{:white "NONE" "WHITE" "BLACK" :none :black})

(clojure.spec.alpha/def :portkey.aws.medialive.invalid-request/message (clojure.spec.alpha/and :portkey.aws.medialive/string))
(clojure.spec.alpha/def :portkey.aws.medialive/invalid-request (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.medialive.invalid-request/message]))

(clojure.spec.alpha/def :portkey.aws.medialive/mp-2-coding-mode #{"CODING_MODE_1_0" :coding-mode-1-0 :coding-mode-2-0 "CODING_MODE_2_0"})

(clojure.spec.alpha/def :portkey.aws.medialive/list-of-output-group (clojure.spec.alpha/coll-of :portkey.aws.medialive/output-group))

(clojure.spec.alpha/def :portkey.aws.medialive.reservation-resource-specification/codec (clojure.spec.alpha/and :portkey.aws.medialive/reservation-codec))
(clojure.spec.alpha/def :portkey.aws.medialive.reservation-resource-specification/maximum-bitrate (clojure.spec.alpha/and :portkey.aws.medialive/reservation-maximum-bitrate))
(clojure.spec.alpha/def :portkey.aws.medialive.reservation-resource-specification/maximum-framerate (clojure.spec.alpha/and :portkey.aws.medialive/reservation-maximum-framerate))
(clojure.spec.alpha/def :portkey.aws.medialive.reservation-resource-specification/resolution (clojure.spec.alpha/and :portkey.aws.medialive/reservation-resolution))
(clojure.spec.alpha/def :portkey.aws.medialive.reservation-resource-specification/resource-type (clojure.spec.alpha/and :portkey.aws.medialive/reservation-resource-type))
(clojure.spec.alpha/def :portkey.aws.medialive.reservation-resource-specification/special-feature (clojure.spec.alpha/and :portkey.aws.medialive/reservation-special-feature))
(clojure.spec.alpha/def :portkey.aws.medialive.reservation-resource-specification/video-quality (clojure.spec.alpha/and :portkey.aws.medialive/reservation-video-quality))
(clojure.spec.alpha/def :portkey.aws.medialive/reservation-resource-specification (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.medialive.reservation-resource-specification/codec :portkey.aws.medialive.reservation-resource-specification/maximum-bitrate :portkey.aws.medialive.reservation-resource-specification/maximum-framerate :portkey.aws.medialive.reservation-resource-specification/resolution :portkey.aws.medialive.reservation-resource-specification/resource-type :portkey.aws.medialive.reservation-resource-specification/special-feature :portkey.aws.medialive.reservation-resource-specification/video-quality]))

(clojure.spec.alpha/def :portkey.aws.medialive.scte-35-delivery-restrictions/archive-allowed-flag (clojure.spec.alpha/and :portkey.aws.medialive/scte-35-archive-allowed-flag))
(clojure.spec.alpha/def :portkey.aws.medialive.scte-35-delivery-restrictions/device-restrictions (clojure.spec.alpha/and :portkey.aws.medialive/scte-35-device-restrictions))
(clojure.spec.alpha/def :portkey.aws.medialive.scte-35-delivery-restrictions/no-regional-blackout-flag (clojure.spec.alpha/and :portkey.aws.medialive/scte-35-no-regional-blackout-flag))
(clojure.spec.alpha/def :portkey.aws.medialive.scte-35-delivery-restrictions/web-delivery-allowed-flag (clojure.spec.alpha/and :portkey.aws.medialive/scte-35-web-delivery-allowed-flag))
(clojure.spec.alpha/def :portkey.aws.medialive/scte-35-delivery-restrictions (clojure.spec.alpha/keys :req-un [:portkey.aws.medialive.scte-35-delivery-restrictions/device-restrictions :portkey.aws.medialive.scte-35-delivery-restrictions/archive-allowed-flag :portkey.aws.medialive.scte-35-delivery-restrictions/web-delivery-allowed-flag :portkey.aws.medialive.scte-35-delivery-restrictions/no-regional-blackout-flag] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.medialive/m-2ts-timed-metadata-behavior #{"PASSTHROUGH" :passthrough "NO_PASSTHROUGH" :no-passthrough})

(clojure.spec.alpha/def :portkey.aws.medialive.create-input-security-group-result-model/security-group (clojure.spec.alpha/and :portkey.aws.medialive/input-security-group))
(clojure.spec.alpha/def :portkey.aws.medialive/create-input-security-group-result-model (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.medialive.create-input-security-group-result-model/security-group]))

(clojure.spec.alpha/def :portkey.aws.medialive/tags (clojure.spec.alpha/map-of :portkey.aws.medialive/string :portkey.aws.medialive/string))

(clojure.spec.alpha/def :portkey.aws.medialive/fec-output-include-fec #{:column :column-and-row "COLUMN_AND_ROW" "COLUMN"})

(clojure.spec.alpha/def :portkey.aws.medialive/scte-35-segmentation-cancel-indicator #{:segmentation-event-canceled "SEGMENTATION_EVENT_NOT_CANCELED" "SEGMENTATION_EVENT_CANCELED" :segmentation-event-not-canceled})

(clojure.spec.alpha/def :portkey.aws.medialive/rtmp-output-certificate-mode #{:verify-authenticity "VERIFY_AUTHENTICITY" "SELF_SIGNED" :self-signed})

(clojure.spec.alpha/def :portkey.aws.medialive.describe-channel-response/input-attachments (clojure.spec.alpha/and :portkey.aws.medialive/list-of-input-attachment))
(clojure.spec.alpha/def :portkey.aws.medialive.describe-channel-response/pipelines-running-count (clojure.spec.alpha/and :portkey.aws.medialive/integer))
(clojure.spec.alpha/def :portkey.aws.medialive.describe-channel-response/role-arn (clojure.spec.alpha/and :portkey.aws.medialive/string))
(clojure.spec.alpha/def :portkey.aws.medialive.describe-channel-response/egress-endpoints (clojure.spec.alpha/and :portkey.aws.medialive/list-of-channel-egress-endpoint))
(clojure.spec.alpha/def :portkey.aws.medialive.describe-channel-response/arn (clojure.spec.alpha/and :portkey.aws.medialive/string))
(clojure.spec.alpha/def :portkey.aws.medialive.describe-channel-response/state (clojure.spec.alpha/and :portkey.aws.medialive/channel-state))
(clojure.spec.alpha/def :portkey.aws.medialive.describe-channel-response/destinations (clojure.spec.alpha/and :portkey.aws.medialive/list-of-output-destination))
(clojure.spec.alpha/def :portkey.aws.medialive.describe-channel-response/name (clojure.spec.alpha/and :portkey.aws.medialive/string))
(clojure.spec.alpha/def :portkey.aws.medialive.describe-channel-response/id (clojure.spec.alpha/and :portkey.aws.medialive/string))
(clojure.spec.alpha/def :portkey.aws.medialive/describe-channel-response (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.medialive.describe-channel-response/input-attachments :portkey.aws.medialive.describe-channel-response/pipelines-running-count :portkey.aws.medialive/log-level :portkey.aws.medialive.describe-channel-response/role-arn :portkey.aws.medialive/tags :portkey.aws.medialive.describe-channel-response/egress-endpoints :portkey.aws.medialive/encoder-settings :portkey.aws.medialive.describe-channel-response/arn :portkey.aws.medialive/input-specification :portkey.aws.medialive.describe-channel-response/state :portkey.aws.medialive.describe-channel-response/destinations :portkey.aws.medialive.describe-channel-response/name :portkey.aws.medialive.describe-channel-response/id]))

(clojure.spec.alpha/def :portkey.aws.medialive/ac-3-drc-profile #{:film-standard "FILM_STANDARD" "NONE" :none})

(clojure.spec.alpha/def :portkey.aws.medialive/eac-3-lfe-control #{:no-lfe "NO_LFE" "LFE" :lfe})

(clojure.spec.alpha/def :portkey.aws.medialive.media-connect-flow-request/flow-arn (clojure.spec.alpha/and :portkey.aws.medialive/string))
(clojure.spec.alpha/def :portkey.aws.medialive/media-connect-flow-request (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.medialive.media-connect-flow-request/flow-arn]))

(clojure.spec.alpha/def :portkey.aws.medialive.teletext-source-settings/page-number (clojure.spec.alpha/and :portkey.aws.medialive/string))
(clojure.spec.alpha/def :portkey.aws.medialive/teletext-source-settings (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.medialive.teletext-source-settings/page-number]))

(clojure.spec.alpha/def :portkey.aws.medialive/m-3u-8-scte-35-behavior #{"PASSTHROUGH" :passthrough "NO_PASSTHROUGH" :no-passthrough})

(clojure.spec.alpha/def :portkey.aws.medialive.rtmp-output-settings/certificate-mode (clojure.spec.alpha/and :portkey.aws.medialive/rtmp-output-certificate-mode))
(clojure.spec.alpha/def :portkey.aws.medialive.rtmp-output-settings/connection-retry-interval (clojure.spec.alpha/and :portkey.aws.medialive/integer-min-1))
(clojure.spec.alpha/def :portkey.aws.medialive.rtmp-output-settings/destination (clojure.spec.alpha/and :portkey.aws.medialive/output-location-ref))
(clojure.spec.alpha/def :portkey.aws.medialive.rtmp-output-settings/num-retries (clojure.spec.alpha/and :portkey.aws.medialive/integer-min-0))
(clojure.spec.alpha/def :portkey.aws.medialive/rtmp-output-settings (clojure.spec.alpha/keys :req-un [:portkey.aws.medialive.rtmp-output-settings/destination] :opt-un [:portkey.aws.medialive.rtmp-output-settings/certificate-mode :portkey.aws.medialive.rtmp-output-settings/connection-retry-interval :portkey.aws.medialive.rtmp-output-settings/num-retries]))

(clojure.spec.alpha/def :portkey.aws.medialive.update-input-request/destinations (clojure.spec.alpha/and :portkey.aws.medialive/list-of-input-destination-request))
(clojure.spec.alpha/def :portkey.aws.medialive.update-input-request/input-id (clojure.spec.alpha/and :portkey.aws.medialive/string))
(clojure.spec.alpha/def :portkey.aws.medialive.update-input-request/input-security-groups (clojure.spec.alpha/and :portkey.aws.medialive/list-of-string))
(clojure.spec.alpha/def :portkey.aws.medialive.update-input-request/media-connect-flows (clojure.spec.alpha/and :portkey.aws.medialive/list-of-media-connect-flow-request))
(clojure.spec.alpha/def :portkey.aws.medialive.update-input-request/name (clojure.spec.alpha/and :portkey.aws.medialive/string))
(clojure.spec.alpha/def :portkey.aws.medialive.update-input-request/role-arn (clojure.spec.alpha/and :portkey.aws.medialive/string))
(clojure.spec.alpha/def :portkey.aws.medialive.update-input-request/sources (clojure.spec.alpha/and :portkey.aws.medialive/list-of-input-source-request))
(clojure.spec.alpha/def :portkey.aws.medialive/update-input-request (clojure.spec.alpha/keys :req-un [:portkey.aws.medialive.update-input-request/input-id] :opt-un [:portkey.aws.medialive.update-input-request/destinations :portkey.aws.medialive.update-input-request/input-security-groups :portkey.aws.medialive.update-input-request/media-connect-flows :portkey.aws.medialive.update-input-request/name :portkey.aws.medialive.update-input-request/role-arn :portkey.aws.medialive.update-input-request/sources]))

(clojure.spec.alpha/def :portkey.aws.medialive/global-configuration-low-framerate-inputs #{"DISABLED" :disabled "ENABLED" :enabled})

(clojure.spec.alpha/def :portkey.aws.medialive/eac-3-surround-mode #{"DISABLED" "NOT_INDICATED" :disabled :not-indicated "ENABLED" :enabled})

(clojure.spec.alpha/def :portkey.aws.medialive/avail-blanking-state #{"DISABLED" :disabled "ENABLED" :enabled})

(clojure.spec.alpha/def :portkey.aws.medialive/create-input-result-model (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.medialive/input]))

(clojure.spec.alpha/def :portkey.aws.medialive.audio-channel-mapping/input-channel-levels (clojure.spec.alpha/and :portkey.aws.medialive/list-of-input-channel-level))
(clojure.spec.alpha/def :portkey.aws.medialive.audio-channel-mapping/output-channel (clojure.spec.alpha/and :portkey.aws.medialive/integer-min-0-max-7))
(clojure.spec.alpha/def :portkey.aws.medialive/audio-channel-mapping (clojure.spec.alpha/keys :req-un [:portkey.aws.medialive.audio-channel-mapping/output-channel :portkey.aws.medialive.audio-channel-mapping/input-channel-levels] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.medialive/reservation-resolution #{:uhd "UHD" "SD" "HD" :sd :hd})

(clojure.spec.alpha/def :portkey.aws.medialive/h-264-look-ahead-rate-control #{:medium "LOW" :high "HIGH" :low "MEDIUM"})

(clojure.spec.alpha/def :portkey.aws.medialive.input-source/password-param (clojure.spec.alpha/and :portkey.aws.medialive/string))
(clojure.spec.alpha/def :portkey.aws.medialive.input-source/url (clojure.spec.alpha/and :portkey.aws.medialive/string))
(clojure.spec.alpha/def :portkey.aws.medialive.input-source/username (clojure.spec.alpha/and :portkey.aws.medialive/string))
(clojure.spec.alpha/def :portkey.aws.medialive/input-source (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.medialive.input-source/password-param :portkey.aws.medialive.input-source/url :portkey.aws.medialive.input-source/username]))

(clojure.spec.alpha/def :portkey.aws.medialive/hls-akamai-http-transfer-mode #{"NON_CHUNKED" "CHUNKED" :chunked :non-chunked})

(clojure.spec.alpha/def :portkey.aws.medialive.reservation/duration-units (clojure.spec.alpha/and :portkey.aws.medialive/offering-duration-units))
(clojure.spec.alpha/def :portkey.aws.medialive.reservation/currency-code (clojure.spec.alpha/and :portkey.aws.medialive/string))
(clojure.spec.alpha/def :portkey.aws.medialive.reservation/offering-description (clojure.spec.alpha/and :portkey.aws.medialive/string))
(clojure.spec.alpha/def :portkey.aws.medialive.reservation/resource-specification (clojure.spec.alpha/and :portkey.aws.medialive/reservation-resource-specification))
(clojure.spec.alpha/def :portkey.aws.medialive.reservation/start (clojure.spec.alpha/and :portkey.aws.medialive/string))
(clojure.spec.alpha/def :portkey.aws.medialive.reservation/fixed-price (clojure.spec.alpha/and :portkey.aws.medialive/double))
(clojure.spec.alpha/def :portkey.aws.medialive.reservation/end (clojure.spec.alpha/and :portkey.aws.medialive/string))
(clojure.spec.alpha/def :portkey.aws.medialive.reservation/count (clojure.spec.alpha/and :portkey.aws.medialive/integer))
(clojure.spec.alpha/def :portkey.aws.medialive.reservation/offering-id (clojure.spec.alpha/and :portkey.aws.medialive/string))
(clojure.spec.alpha/def :portkey.aws.medialive.reservation/duration (clojure.spec.alpha/and :portkey.aws.medialive/integer))
(clojure.spec.alpha/def :portkey.aws.medialive.reservation/usage-price (clojure.spec.alpha/and :portkey.aws.medialive/double))
(clojure.spec.alpha/def :portkey.aws.medialive.reservation/arn (clojure.spec.alpha/and :portkey.aws.medialive/string))
(clojure.spec.alpha/def :portkey.aws.medialive.reservation/state (clojure.spec.alpha/and :portkey.aws.medialive/reservation-state))
(clojure.spec.alpha/def :portkey.aws.medialive.reservation/name (clojure.spec.alpha/and :portkey.aws.medialive/string))
(clojure.spec.alpha/def :portkey.aws.medialive.reservation/reservation-id (clojure.spec.alpha/and :portkey.aws.medialive/string))
(clojure.spec.alpha/def :portkey.aws.medialive.reservation/region (clojure.spec.alpha/and :portkey.aws.medialive/string))
(clojure.spec.alpha/def :portkey.aws.medialive/reservation (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.medialive.reservation/duration-units :portkey.aws.medialive.reservation/currency-code :portkey.aws.medialive.reservation/offering-description :portkey.aws.medialive.reservation/resource-specification :portkey.aws.medialive.reservation/start :portkey.aws.medialive.reservation/fixed-price :portkey.aws.medialive.reservation/end :portkey.aws.medialive.reservation/count :portkey.aws.medialive.reservation/offering-id :portkey.aws.medialive.reservation/duration :portkey.aws.medialive.reservation/usage-price :portkey.aws.medialive.reservation/arn :portkey.aws.medialive.reservation/state :portkey.aws.medialive/offering-type :portkey.aws.medialive.reservation/name :portkey.aws.medialive.reservation/reservation-id :portkey.aws.medialive.reservation/region]))

(clojure.spec.alpha/def :portkey.aws.medialive/h-264-sub-gop-length #{"FIXED" :dynamic :fixed "DYNAMIC"})

(clojure.spec.alpha/def :portkey.aws.medialive.ms-smooth-output-settings/name-modifier (clojure.spec.alpha/and :portkey.aws.medialive/string))
(clojure.spec.alpha/def :portkey.aws.medialive/ms-smooth-output-settings (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.medialive.ms-smooth-output-settings/name-modifier]))

(clojure.spec.alpha/def :portkey.aws.medialive/video-selector-settings (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.medialive/video-selector-pid :portkey.aws.medialive/video-selector-program-id]))

(clojure.spec.alpha/def :portkey.aws.medialive/eac-3-lfe-filter #{"DISABLED" :disabled "ENABLED" :enabled})

(clojure.spec.alpha/def :portkey.aws.medialive/reservation-maximum-bitrate #{:max-10-mbps :max-50-mbps :max-20-mbps "MAX_10_MBPS" "MAX_50_MBPS" "MAX_20_MBPS"})

(clojure.spec.alpha/def :portkey.aws.medialive.delete-input-security-group-request/input-security-group-id (clojure.spec.alpha/and :portkey.aws.medialive/string))
(clojure.spec.alpha/def :portkey.aws.medialive/delete-input-security-group-request (clojure.spec.alpha/keys :req-un [:portkey.aws.medialive.delete-input-security-group-request/input-security-group-id] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.medialive.offering/duration-units (clojure.spec.alpha/and :portkey.aws.medialive/offering-duration-units))
(clojure.spec.alpha/def :portkey.aws.medialive.offering/currency-code (clojure.spec.alpha/and :portkey.aws.medialive/string))
(clojure.spec.alpha/def :portkey.aws.medialive.offering/offering-description (clojure.spec.alpha/and :portkey.aws.medialive/string))
(clojure.spec.alpha/def :portkey.aws.medialive.offering/resource-specification (clojure.spec.alpha/and :portkey.aws.medialive/reservation-resource-specification))
(clojure.spec.alpha/def :portkey.aws.medialive.offering/fixed-price (clojure.spec.alpha/and :portkey.aws.medialive/double))
(clojure.spec.alpha/def :portkey.aws.medialive.offering/offering-id (clojure.spec.alpha/and :portkey.aws.medialive/string))
(clojure.spec.alpha/def :portkey.aws.medialive.offering/duration (clojure.spec.alpha/and :portkey.aws.medialive/integer))
(clojure.spec.alpha/def :portkey.aws.medialive.offering/usage-price (clojure.spec.alpha/and :portkey.aws.medialive/double))
(clojure.spec.alpha/def :portkey.aws.medialive.offering/arn (clojure.spec.alpha/and :portkey.aws.medialive/string))
(clojure.spec.alpha/def :portkey.aws.medialive.offering/region (clojure.spec.alpha/and :portkey.aws.medialive/string))
(clojure.spec.alpha/def :portkey.aws.medialive/offering (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.medialive.offering/duration-units :portkey.aws.medialive.offering/currency-code :portkey.aws.medialive.offering/offering-description :portkey.aws.medialive.offering/resource-specification :portkey.aws.medialive.offering/fixed-price :portkey.aws.medialive.offering/offering-id :portkey.aws.medialive.offering/duration :portkey.aws.medialive.offering/usage-price :portkey.aws.medialive.offering/arn :portkey.aws.medialive/offering-type :portkey.aws.medialive.offering/region]))

(clojure.spec.alpha/def :portkey.aws.medialive/integer-min-negative-60-max-60 (clojure.spec.alpha/int-in -60 60))

(clojure.spec.alpha/def :portkey.aws.medialive/integer-min-0-max-8589934591 clojure.core/int?)

(clojure.spec.alpha/def :portkey.aws.medialive.describe-reservation-request/reservation-id (clojure.spec.alpha/and :portkey.aws.medialive/string))
(clojure.spec.alpha/def :portkey.aws.medialive/describe-reservation-request (clojure.spec.alpha/keys :req-un [:portkey.aws.medialive.describe-reservation-request/reservation-id] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.medialive/list-of-input-channel-level (clojure.spec.alpha/coll-of :portkey.aws.medialive/input-channel-level))

(clojure.spec.alpha/def :portkey.aws.medialive/h-264-rate-control-mode #{"VBR" :cbr :vbr :qvbr "CBR" "QVBR"})

(clojure.spec.alpha/def :portkey.aws.medialive/integer-min-0-max-255 (clojure.spec.alpha/int-in 0 255))

(clojure.spec.alpha/def :portkey.aws.medialive/list-of-output-destination (clojure.spec.alpha/coll-of :portkey.aws.medialive/output-destination))

(clojure.spec.alpha/def :portkey.aws.medialive.video-selector/color-space (clojure.spec.alpha/and :portkey.aws.medialive/video-selector-color-space))
(clojure.spec.alpha/def :portkey.aws.medialive.video-selector/color-space-usage (clojure.spec.alpha/and :portkey.aws.medialive/video-selector-color-space-usage))
(clojure.spec.alpha/def :portkey.aws.medialive.video-selector/selector-settings (clojure.spec.alpha/and :portkey.aws.medialive/video-selector-settings))
(clojure.spec.alpha/def :portkey.aws.medialive/video-selector (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.medialive.video-selector/color-space :portkey.aws.medialive.video-selector/color-space-usage :portkey.aws.medialive.video-selector/selector-settings]))

(clojure.spec.alpha/def :portkey.aws.medialive.input-vpc-request/security-group-ids (clojure.spec.alpha/and :portkey.aws.medialive/list-of-string))
(clojure.spec.alpha/def :portkey.aws.medialive.input-vpc-request/subnet-ids (clojure.spec.alpha/and :portkey.aws.medialive/list-of-string))
(clojure.spec.alpha/def :portkey.aws.medialive/input-vpc-request (clojure.spec.alpha/keys :req-un [:portkey.aws.medialive.input-vpc-request/subnet-ids] :opt-un [:portkey.aws.medialive.input-vpc-request/security-group-ids]))

(clojure.spec.alpha/def :portkey.aws.medialive/ac-3-metadata-control #{"FOLLOW_INPUT" :follow-input "USE_CONFIGURED" :use-configured})

(clojure.spec.alpha/def :portkey.aws.medialive/double-min-0 clojure.core/double?)

(clojure.spec.alpha/def :portkey.aws.medialive/purchase-offering-result-model (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.medialive/reservation]))

(clojure.spec.alpha/def :portkey.aws.medialive/m-2ts-buffer-model #{"NONE" :none :multiplex "MULTIPLEX"})

(clojure.spec.alpha/def :portkey.aws.medialive/udp-container-settings (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.medialive/m-2ts-settings]))

(clojure.spec.alpha/def :portkey.aws.medialive.channel-summary/input-attachments (clojure.spec.alpha/and :portkey.aws.medialive/list-of-input-attachment))
(clojure.spec.alpha/def :portkey.aws.medialive.channel-summary/pipelines-running-count (clojure.spec.alpha/and :portkey.aws.medialive/integer))
(clojure.spec.alpha/def :portkey.aws.medialive.channel-summary/role-arn (clojure.spec.alpha/and :portkey.aws.medialive/string))
(clojure.spec.alpha/def :portkey.aws.medialive.channel-summary/egress-endpoints (clojure.spec.alpha/and :portkey.aws.medialive/list-of-channel-egress-endpoint))
(clojure.spec.alpha/def :portkey.aws.medialive.channel-summary/arn (clojure.spec.alpha/and :portkey.aws.medialive/string))
(clojure.spec.alpha/def :portkey.aws.medialive.channel-summary/state (clojure.spec.alpha/and :portkey.aws.medialive/channel-state))
(clojure.spec.alpha/def :portkey.aws.medialive.channel-summary/destinations (clojure.spec.alpha/and :portkey.aws.medialive/list-of-output-destination))
(clojure.spec.alpha/def :portkey.aws.medialive.channel-summary/name (clojure.spec.alpha/and :portkey.aws.medialive/string))
(clojure.spec.alpha/def :portkey.aws.medialive.channel-summary/id (clojure.spec.alpha/and :portkey.aws.medialive/string))
(clojure.spec.alpha/def :portkey.aws.medialive/channel-summary (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.medialive.channel-summary/input-attachments :portkey.aws.medialive.channel-summary/pipelines-running-count :portkey.aws.medialive/log-level :portkey.aws.medialive.channel-summary/role-arn :portkey.aws.medialive/tags :portkey.aws.medialive.channel-summary/egress-endpoints :portkey.aws.medialive.channel-summary/arn :portkey.aws.medialive/input-specification :portkey.aws.medialive.channel-summary/state :portkey.aws.medialive.channel-summary/destinations :portkey.aws.medialive.channel-summary/name :portkey.aws.medialive.channel-summary/id]))

(clojure.spec.alpha/def :portkey.aws.medialive/integer-min-25-max-10000 (clojure.spec.alpha/int-in 25 10000))

(clojure.spec.alpha/def :portkey.aws.medialive/eac-3-coding-mode #{"CODING_MODE_1_0" :coding-mode-1-0 :coding-mode-3-2 :coding-mode-2-0 "CODING_MODE_2_0" "CODING_MODE_3_2"})

(clojure.spec.alpha/def :portkey.aws.medialive/m-2ts-ebif-control #{"PASSTHROUGH" "NONE" :passthrough :none})

(clojure.spec.alpha/def :portkey.aws.medialive.caption-description/caption-selector-name (clojure.spec.alpha/and :portkey.aws.medialive/string))
(clojure.spec.alpha/def :portkey.aws.medialive.caption-description/destination-settings (clojure.spec.alpha/and :portkey.aws.medialive/caption-destination-settings))
(clojure.spec.alpha/def :portkey.aws.medialive.caption-description/language-code (clojure.spec.alpha/and :portkey.aws.medialive/string))
(clojure.spec.alpha/def :portkey.aws.medialive.caption-description/language-description (clojure.spec.alpha/and :portkey.aws.medialive/string))
(clojure.spec.alpha/def :portkey.aws.medialive.caption-description/name (clojure.spec.alpha/and :portkey.aws.medialive/string))
(clojure.spec.alpha/def :portkey.aws.medialive/caption-description (clojure.spec.alpha/keys :req-un [:portkey.aws.medialive.caption-description/caption-selector-name :portkey.aws.medialive.caption-description/name] :opt-un [:portkey.aws.medialive.caption-description/destination-settings :portkey.aws.medialive.caption-description/language-code :portkey.aws.medialive.caption-description/language-description]))

(clojure.spec.alpha/def :portkey.aws.medialive.hls-media-store-settings/connection-retry-interval (clojure.spec.alpha/and :portkey.aws.medialive/integer-min-0))
(clojure.spec.alpha/def :portkey.aws.medialive.hls-media-store-settings/filecache-duration (clojure.spec.alpha/and :portkey.aws.medialive/integer-min-0-max-600))
(clojure.spec.alpha/def :portkey.aws.medialive.hls-media-store-settings/media-store-storage-class (clojure.spec.alpha/and :portkey.aws.medialive/hls-media-store-storage-class))
(clojure.spec.alpha/def :portkey.aws.medialive.hls-media-store-settings/num-retries (clojure.spec.alpha/and :portkey.aws.medialive/integer-min-0))
(clojure.spec.alpha/def :portkey.aws.medialive.hls-media-store-settings/restart-delay (clojure.spec.alpha/and :portkey.aws.medialive/integer-min-0-max-15))
(clojure.spec.alpha/def :portkey.aws.medialive/hls-media-store-settings (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.medialive.hls-media-store-settings/connection-retry-interval :portkey.aws.medialive.hls-media-store-settings/filecache-duration :portkey.aws.medialive.hls-media-store-settings/media-store-storage-class :portkey.aws.medialive.hls-media-store-settings/num-retries :portkey.aws.medialive.hls-media-store-settings/restart-delay]))

(clojure.spec.alpha/def :portkey.aws.medialive/smooth-group-stream-manifest-behavior #{"SEND" :do-not-send :send "DO_NOT_SEND"})

(clojure.spec.alpha/def :portkey.aws.medialive.describe-input-security-group-response/arn (clojure.spec.alpha/and :portkey.aws.medialive/string))
(clojure.spec.alpha/def :portkey.aws.medialive.describe-input-security-group-response/id (clojure.spec.alpha/and :portkey.aws.medialive/string))
(clojure.spec.alpha/def :portkey.aws.medialive.describe-input-security-group-response/inputs (clojure.spec.alpha/and :portkey.aws.medialive/list-of-string))
(clojure.spec.alpha/def :portkey.aws.medialive.describe-input-security-group-response/state (clojure.spec.alpha/and :portkey.aws.medialive/input-security-group-state))
(clojure.spec.alpha/def :portkey.aws.medialive.describe-input-security-group-response/whitelist-rules (clojure.spec.alpha/and :portkey.aws.medialive/list-of-input-whitelist-rule))
(clojure.spec.alpha/def :portkey.aws.medialive/describe-input-security-group-response (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.medialive.describe-input-security-group-response/arn :portkey.aws.medialive.describe-input-security-group-response/id :portkey.aws.medialive.describe-input-security-group-response/inputs :portkey.aws.medialive.describe-input-security-group-response/state :portkey.aws.medialive/tags :portkey.aws.medialive.describe-input-security-group-response/whitelist-rules]))

(clojure.spec.alpha/def :portkey.aws.medialive.stop-channel-request/channel-id (clojure.spec.alpha/and :portkey.aws.medialive/string))
(clojure.spec.alpha/def :portkey.aws.medialive/stop-channel-request (clojure.spec.alpha/keys :req-un [:portkey.aws.medialive.stop-channel-request/channel-id] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.medialive/timecode-config-source #{"ZEROBASED" "EMBEDDED" "SYSTEMCLOCK" :systemclock :embedded :zerobased})

(clojure.spec.alpha/def :portkey.aws.medialive/m-2ts-audio-interval #{:video-interval "VIDEO_AND_FIXED_INTERVALS" "VIDEO_INTERVAL" :video-and-fixed-intervals})

(clojure.spec.alpha/def :portkey.aws.medialive.list-reservations-result-model/next-token (clojure.spec.alpha/and :portkey.aws.medialive/string))
(clojure.spec.alpha/def :portkey.aws.medialive.list-reservations-result-model/reservations (clojure.spec.alpha/and :portkey.aws.medialive/list-of-reservation))
(clojure.spec.alpha/def :portkey.aws.medialive/list-reservations-result-model (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.medialive.list-reservations-result-model/next-token :portkey.aws.medialive.list-reservations-result-model/reservations]))

(clojure.spec.alpha/def :portkey.aws.medialive.schedule-action-settings/hls-timed-metadata-settings (clojure.spec.alpha/and :portkey.aws.medialive/hls-timed-metadata-schedule-action-settings))
(clojure.spec.alpha/def :portkey.aws.medialive.schedule-action-settings/input-switch-settings (clojure.spec.alpha/and :portkey.aws.medialive/input-switch-schedule-action-settings))
(clojure.spec.alpha/def :portkey.aws.medialive.schedule-action-settings/pause-state-settings (clojure.spec.alpha/and :portkey.aws.medialive/pause-state-schedule-action-settings))
(clojure.spec.alpha/def :portkey.aws.medialive.schedule-action-settings/scte-35-return-to-network-settings (clojure.spec.alpha/and :portkey.aws.medialive/scte-35-return-to-network-schedule-action-settings))
(clojure.spec.alpha/def :portkey.aws.medialive.schedule-action-settings/scte-35-splice-insert-settings (clojure.spec.alpha/and :portkey.aws.medialive/scte-35-splice-insert-schedule-action-settings))
(clojure.spec.alpha/def :portkey.aws.medialive.schedule-action-settings/scte-35-time-signal-settings (clojure.spec.alpha/and :portkey.aws.medialive/scte-35-time-signal-schedule-action-settings))
(clojure.spec.alpha/def :portkey.aws.medialive.schedule-action-settings/static-image-activate-settings (clojure.spec.alpha/and :portkey.aws.medialive/static-image-activate-schedule-action-settings))
(clojure.spec.alpha/def :portkey.aws.medialive.schedule-action-settings/static-image-deactivate-settings (clojure.spec.alpha/and :portkey.aws.medialive/static-image-deactivate-schedule-action-settings))
(clojure.spec.alpha/def :portkey.aws.medialive/schedule-action-settings (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.medialive.schedule-action-settings/hls-timed-metadata-settings :portkey.aws.medialive.schedule-action-settings/input-switch-settings :portkey.aws.medialive.schedule-action-settings/pause-state-settings :portkey.aws.medialive.schedule-action-settings/scte-35-return-to-network-settings :portkey.aws.medialive.schedule-action-settings/scte-35-splice-insert-settings :portkey.aws.medialive.schedule-action-settings/scte-35-time-signal-settings :portkey.aws.medialive.schedule-action-settings/static-image-activate-settings :portkey.aws.medialive.schedule-action-settings/static-image-deactivate-settings]))

(clojure.spec.alpha/def :portkey.aws.medialive.batch-update-schedule-response/creates (clojure.spec.alpha/and :portkey.aws.medialive/batch-schedule-action-create-result))
(clojure.spec.alpha/def :portkey.aws.medialive.batch-update-schedule-response/deletes (clojure.spec.alpha/and :portkey.aws.medialive/batch-schedule-action-delete-result))
(clojure.spec.alpha/def :portkey.aws.medialive/batch-update-schedule-response (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.medialive.batch-update-schedule-response/creates :portkey.aws.medialive.batch-update-schedule-response/deletes]))

(clojure.spec.alpha/def :portkey.aws.medialive.audio-pid-selection/pid (clojure.spec.alpha/and :portkey.aws.medialive/integer-min-0-max-8191))
(clojure.spec.alpha/def :portkey.aws.medialive/audio-pid-selection (clojure.spec.alpha/keys :req-un [:portkey.aws.medialive.audio-pid-selection/pid] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.medialive/hls-output-selection #{:segments-only "MANIFESTS_AND_SEGMENTS" "SEGMENTS_ONLY" :manifests-and-segments})

(clojure.spec.alpha/def :portkey.aws.medialive/input-loss-action-for-udp-out #{:drop-ts "DROP_TS" :drop-program :emit-program "EMIT_PROGRAM" "DROP_PROGRAM"})

(clojure.spec.alpha/def :portkey.aws.medialive.delete-channel-response/input-attachments (clojure.spec.alpha/and :portkey.aws.medialive/list-of-input-attachment))
(clojure.spec.alpha/def :portkey.aws.medialive.delete-channel-response/pipelines-running-count (clojure.spec.alpha/and :portkey.aws.medialive/integer))
(clojure.spec.alpha/def :portkey.aws.medialive.delete-channel-response/role-arn (clojure.spec.alpha/and :portkey.aws.medialive/string))
(clojure.spec.alpha/def :portkey.aws.medialive.delete-channel-response/egress-endpoints (clojure.spec.alpha/and :portkey.aws.medialive/list-of-channel-egress-endpoint))
(clojure.spec.alpha/def :portkey.aws.medialive.delete-channel-response/arn (clojure.spec.alpha/and :portkey.aws.medialive/string))
(clojure.spec.alpha/def :portkey.aws.medialive.delete-channel-response/state (clojure.spec.alpha/and :portkey.aws.medialive/channel-state))
(clojure.spec.alpha/def :portkey.aws.medialive.delete-channel-response/destinations (clojure.spec.alpha/and :portkey.aws.medialive/list-of-output-destination))
(clojure.spec.alpha/def :portkey.aws.medialive.delete-channel-response/name (clojure.spec.alpha/and :portkey.aws.medialive/string))
(clojure.spec.alpha/def :portkey.aws.medialive.delete-channel-response/id (clojure.spec.alpha/and :portkey.aws.medialive/string))
(clojure.spec.alpha/def :portkey.aws.medialive/delete-channel-response (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.medialive.delete-channel-response/input-attachments :portkey.aws.medialive.delete-channel-response/pipelines-running-count :portkey.aws.medialive/log-level :portkey.aws.medialive.delete-channel-response/role-arn :portkey.aws.medialive/tags :portkey.aws.medialive.delete-channel-response/egress-endpoints :portkey.aws.medialive/encoder-settings :portkey.aws.medialive.delete-channel-response/arn :portkey.aws.medialive/input-specification :portkey.aws.medialive.delete-channel-response/state :portkey.aws.medialive.delete-channel-response/destinations :portkey.aws.medialive.delete-channel-response/name :portkey.aws.medialive.delete-channel-response/id]))

(clojure.spec.alpha/def :portkey.aws.medialive.list-input-security-groups-request/next-token (clojure.spec.alpha/and :portkey.aws.medialive/string))
(clojure.spec.alpha/def :portkey.aws.medialive/list-input-security-groups-request (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.medialive/max-results :portkey.aws.medialive.list-input-security-groups-request/next-token]))

(clojure.spec.alpha/def :portkey.aws.medialive/ac-3-bitstream-mode #{:hearing-impaired :visually-impaired :complete-main "COMPLETE_MAIN" "DIALOGUE" "VISUALLY_IMPAIRED" :dialogue "EMERGENCY" :emergency :music-and-effects "COMMENTARY" :commentary "MUSIC_AND_EFFECTS" "VOICE_OVER" "HEARING_IMPAIRED" :voice-over})

(clojure.spec.alpha/def :portkey.aws.medialive.too-many-requests-exception/message (clojure.spec.alpha/and :portkey.aws.medialive/string))
(clojure.spec.alpha/def :portkey.aws.medialive/too-many-requests-exception (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.medialive.too-many-requests-exception/message]))

(clojure.spec.alpha/def :portkey.aws.medialive.scte-35-time-signal-apos/ad-avail-offset (clojure.spec.alpha/and :portkey.aws.medialive/integer-min-negative-1000-max-1000))
(clojure.spec.alpha/def :portkey.aws.medialive.scte-35-time-signal-apos/no-regional-blackout-flag (clojure.spec.alpha/and :portkey.aws.medialive/scte-35-apos-no-regional-blackout-behavior))
(clojure.spec.alpha/def :portkey.aws.medialive.scte-35-time-signal-apos/web-delivery-allowed-flag (clojure.spec.alpha/and :portkey.aws.medialive/scte-35-apos-web-delivery-allowed-behavior))
(clojure.spec.alpha/def :portkey.aws.medialive/scte-35-time-signal-apos (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.medialive.scte-35-time-signal-apos/ad-avail-offset :portkey.aws.medialive.scte-35-time-signal-apos/no-regional-blackout-flag :portkey.aws.medialive.scte-35-time-signal-apos/web-delivery-allowed-flag]))

(clojure.spec.alpha/def :portkey.aws.medialive/h-264-spatial-aq #{"DISABLED" :disabled "ENABLED" :enabled})

(clojure.spec.alpha/def :portkey.aws.medialive/aac-raw-format #{:latm-loas "LATM_LOAS" "NONE" :none})

(clojure.spec.alpha/def :portkey.aws.medialive/list-of-input-source-request (clojure.spec.alpha/coll-of :portkey.aws.medialive/input-source-request))

(clojure.spec.alpha/def :portkey.aws.medialive.static-image-activate-schedule-action-settings/opacity (clojure.spec.alpha/and :portkey.aws.medialive/integer-min-0-max-100))
(clojure.spec.alpha/def :portkey.aws.medialive.static-image-activate-schedule-action-settings/image-x (clojure.spec.alpha/and :portkey.aws.medialive/integer-min-0))
(clojure.spec.alpha/def :portkey.aws.medialive.static-image-activate-schedule-action-settings/width (clojure.spec.alpha/and :portkey.aws.medialive/integer-min-1))
(clojure.spec.alpha/def :portkey.aws.medialive.static-image-activate-schedule-action-settings/layer (clojure.spec.alpha/and :portkey.aws.medialive/integer-min-0-max-7))
(clojure.spec.alpha/def :portkey.aws.medialive.static-image-activate-schedule-action-settings/duration (clojure.spec.alpha/and :portkey.aws.medialive/integer-min-0))
(clojure.spec.alpha/def :portkey.aws.medialive.static-image-activate-schedule-action-settings/fade-in (clojure.spec.alpha/and :portkey.aws.medialive/integer-min-0))
(clojure.spec.alpha/def :portkey.aws.medialive.static-image-activate-schedule-action-settings/height (clojure.spec.alpha/and :portkey.aws.medialive/integer-min-1))
(clojure.spec.alpha/def :portkey.aws.medialive.static-image-activate-schedule-action-settings/image (clojure.spec.alpha/and :portkey.aws.medialive/input-location))
(clojure.spec.alpha/def :portkey.aws.medialive.static-image-activate-schedule-action-settings/image-y (clojure.spec.alpha/and :portkey.aws.medialive/integer-min-0))
(clojure.spec.alpha/def :portkey.aws.medialive.static-image-activate-schedule-action-settings/fade-out (clojure.spec.alpha/and :portkey.aws.medialive/integer-min-0))
(clojure.spec.alpha/def :portkey.aws.medialive/static-image-activate-schedule-action-settings (clojure.spec.alpha/keys :req-un [:portkey.aws.medialive.static-image-activate-schedule-action-settings/image] :opt-un [:portkey.aws.medialive.static-image-activate-schedule-action-settings/opacity :portkey.aws.medialive.static-image-activate-schedule-action-settings/image-x :portkey.aws.medialive.static-image-activate-schedule-action-settings/width :portkey.aws.medialive.static-image-activate-schedule-action-settings/layer :portkey.aws.medialive.static-image-activate-schedule-action-settings/duration :portkey.aws.medialive.static-image-activate-schedule-action-settings/fade-in :portkey.aws.medialive.static-image-activate-schedule-action-settings/height :portkey.aws.medialive.static-image-activate-schedule-action-settings/image-y :portkey.aws.medialive.static-image-activate-schedule-action-settings/fade-out]))

(clojure.spec.alpha/def :portkey.aws.medialive/list-of-input-security-group (clojure.spec.alpha/coll-of :portkey.aws.medialive/input-security-group))

(clojure.spec.alpha/def :portkey.aws.medialive.output-destination/id (clojure.spec.alpha/and :portkey.aws.medialive/string))
(clojure.spec.alpha/def :portkey.aws.medialive.output-destination/settings (clojure.spec.alpha/and :portkey.aws.medialive/list-of-output-destination-settings))
(clojure.spec.alpha/def :portkey.aws.medialive/output-destination (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.medialive.output-destination/id :portkey.aws.medialive.output-destination/settings]))

(clojure.spec.alpha/def :portkey.aws.medialive/integer-min-30 (clojure.spec.alpha/int-in 30 Long/MAX_VALUE))

(clojure.spec.alpha/def :portkey.aws.medialive/reservation-special-feature #{:audio-normalization :advanced-audio "AUDIO_NORMALIZATION" "ADVANCED_AUDIO"})

(clojure.spec.alpha/def :portkey.aws.medialive/input-maximum-bitrate #{:max-10-mbps :max-50-mbps :max-20-mbps "MAX_10_MBPS" "MAX_50_MBPS" "MAX_20_MBPS"})

(clojure.spec.alpha/def :portkey.aws.medialive.create-channel-request/reserved (clojure.spec.alpha/and :portkey.aws.medialive/string))
(clojure.spec.alpha/def :portkey.aws.medialive.create-channel-request/input-attachments (clojure.spec.alpha/and :portkey.aws.medialive/list-of-input-attachment))
(clojure.spec.alpha/def :portkey.aws.medialive.create-channel-request/request-id (clojure.spec.alpha/and :portkey.aws.medialive/string))
(clojure.spec.alpha/def :portkey.aws.medialive.create-channel-request/role-arn (clojure.spec.alpha/and :portkey.aws.medialive/string))
(clojure.spec.alpha/def :portkey.aws.medialive.create-channel-request/destinations (clojure.spec.alpha/and :portkey.aws.medialive/list-of-output-destination))
(clojure.spec.alpha/def :portkey.aws.medialive.create-channel-request/name (clojure.spec.alpha/and :portkey.aws.medialive/string))
(clojure.spec.alpha/def :portkey.aws.medialive/create-channel-request (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.medialive.create-channel-request/reserved :portkey.aws.medialive.create-channel-request/input-attachments :portkey.aws.medialive.create-channel-request/request-id :portkey.aws.medialive/log-level :portkey.aws.medialive.create-channel-request/role-arn :portkey.aws.medialive/tags :portkey.aws.medialive/encoder-settings :portkey.aws.medialive/input-specification :portkey.aws.medialive.create-channel-request/destinations :portkey.aws.medialive.create-channel-request/name]))

(clojure.spec.alpha/def :portkey.aws.medialive.list-inputs-response/inputs (clojure.spec.alpha/and :portkey.aws.medialive/list-of-input))
(clojure.spec.alpha/def :portkey.aws.medialive.list-inputs-response/next-token (clojure.spec.alpha/and :portkey.aws.medialive/string))
(clojure.spec.alpha/def :portkey.aws.medialive/list-inputs-response (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.medialive.list-inputs-response/inputs :portkey.aws.medialive.list-inputs-response/next-token]))

(clojure.spec.alpha/def :portkey.aws.medialive/reservation-video-quality #{"ENHANCED" "STANDARD" :premium :enhanced "PREMIUM" :standard})

(clojure.spec.alpha/def :portkey.aws.medialive/integer-min-0-max-3600 (clojure.spec.alpha/int-in 0 3600))

(clojure.spec.alpha/def :portkey.aws.medialive/video-selector-color-space #{:follow :rec-709 "REC_601" "FOLLOW" :rec-601 "REC_709"})

(clojure.spec.alpha/def :portkey.aws.medialive.audio-only-hls-settings/audio-group-id (clojure.spec.alpha/and :portkey.aws.medialive/string))
(clojure.spec.alpha/def :portkey.aws.medialive.audio-only-hls-settings/audio-only-image (clojure.spec.alpha/and :portkey.aws.medialive/input-location))
(clojure.spec.alpha/def :portkey.aws.medialive.audio-only-hls-settings/audio-track-type (clojure.spec.alpha/and :portkey.aws.medialive/audio-only-hls-track-type))
(clojure.spec.alpha/def :portkey.aws.medialive/audio-only-hls-settings (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.medialive.audio-only-hls-settings/audio-group-id :portkey.aws.medialive.audio-only-hls-settings/audio-only-image :portkey.aws.medialive.audio-only-hls-settings/audio-track-type]))

(clojure.spec.alpha/def :portkey.aws.medialive/m-2ts-segmentation-markers #{"PSI_SEGSTART" "RAI_SEGSTART" "RAI_ADAPT" :rai-adapt :rai-segstart :ebp-legacy "NONE" :psi-segstart "EBP_LEGACY" "EBP" :ebp :none})

(clojure.spec.alpha/def :portkey.aws.medialive/eac-3-drc-line #{"MUSIC_LIGHT" :music-standard :film-standard "FILM_STANDARD" "NONE" "FILM_LIGHT" :film-light "SPEECH" :music-light "MUSIC_STANDARD" :speech :none})

(clojure.spec.alpha/def :portkey.aws.medialive/dvb-sub-destination-alignment #{"LEFT" "CENTERED" :smart :centered "SMART" :left})

(clojure.spec.alpha/def :portkey.aws.medialive/create-channel-result-model (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.medialive/channel]))

(clojure.spec.alpha/def :portkey.aws.medialive/m-2ts-scte-35-control #{"PASSTHROUGH" "NONE" :passthrough :none})

(clojure.spec.alpha/def :portkey.aws.medialive.input-location/password-param (clojure.spec.alpha/and :portkey.aws.medialive/string))
(clojure.spec.alpha/def :portkey.aws.medialive.input-location/uri (clojure.spec.alpha/and :portkey.aws.medialive/string))
(clojure.spec.alpha/def :portkey.aws.medialive.input-location/username (clojure.spec.alpha/and :portkey.aws.medialive/string))
(clojure.spec.alpha/def :portkey.aws.medialive/input-location (clojure.spec.alpha/keys :req-un [:portkey.aws.medialive.input-location/uri] :opt-un [:portkey.aws.medialive.input-location/password-param :portkey.aws.medialive.input-location/username]))

(clojure.spec.alpha/def :portkey.aws.medialive/m-2ts-absent-input-audio-behavior #{:encode-silence :drop "ENCODE_SILENCE" "DROP"})

(clojure.spec.alpha/def :portkey.aws.medialive/integer-min-3 (clojure.spec.alpha/int-in 3 Long/MAX_VALUE))

(clojure.spec.alpha/def :portkey.aws.medialive/h-264-level #{"H264_LEVEL_4_2" "H264_LEVEL_2_2" "H264_LEVEL_2" "H264_LEVEL_1_1" :h-264-level-3-1 "H264_LEVEL_5" "H264_LEVEL_1_3" :h-264-level-5-1 :h-264-level-1 :h-264-level-2 "H264_LEVEL_3" "H264_LEVEL_2_1" "H264_LEVEL_1_2" :h-264-level-auto "H264_LEVEL_1" :h-264-level-1-2 "H264_LEVEL_3_2" :h-264-level-5 :h-264-level-1-1 :h-264-level-2-2 "H264_LEVEL_4" :h-264-level-4-2 :h-264-level-3 "H264_LEVEL_5_1" :h-264-level-2-1 :h-264-level-3-2 :h-264-level-4-1 "H264_LEVEL_3_1" :h-264-level-4 "H264_LEVEL_AUTO" "H264_LEVEL_5_2" :h-264-level-1-3 "H264_LEVEL_4_1" :h-264-level-5-2})

(clojure.spec.alpha/def :portkey.aws.medialive/avail-settings (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.medialive/scte-35-splice-insert :portkey.aws.medialive/scte-35-time-signal-apos]))

(clojure.spec.alpha/def :portkey.aws.medialive/h-264-par-control #{"SPECIFIED" "INITIALIZE_FROM_SOURCE" :specified :initialize-from-source})

(clojure.spec.alpha/def :portkey.aws.medialive.start-channel-response/input-attachments (clojure.spec.alpha/and :portkey.aws.medialive/list-of-input-attachment))
(clojure.spec.alpha/def :portkey.aws.medialive.start-channel-response/pipelines-running-count (clojure.spec.alpha/and :portkey.aws.medialive/integer))
(clojure.spec.alpha/def :portkey.aws.medialive.start-channel-response/role-arn (clojure.spec.alpha/and :portkey.aws.medialive/string))
(clojure.spec.alpha/def :portkey.aws.medialive.start-channel-response/egress-endpoints (clojure.spec.alpha/and :portkey.aws.medialive/list-of-channel-egress-endpoint))
(clojure.spec.alpha/def :portkey.aws.medialive.start-channel-response/arn (clojure.spec.alpha/and :portkey.aws.medialive/string))
(clojure.spec.alpha/def :portkey.aws.medialive.start-channel-response/state (clojure.spec.alpha/and :portkey.aws.medialive/channel-state))
(clojure.spec.alpha/def :portkey.aws.medialive.start-channel-response/destinations (clojure.spec.alpha/and :portkey.aws.medialive/list-of-output-destination))
(clojure.spec.alpha/def :portkey.aws.medialive.start-channel-response/name (clojure.spec.alpha/and :portkey.aws.medialive/string))
(clojure.spec.alpha/def :portkey.aws.medialive.start-channel-response/id (clojure.spec.alpha/and :portkey.aws.medialive/string))
(clojure.spec.alpha/def :portkey.aws.medialive/start-channel-response (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.medialive.start-channel-response/input-attachments :portkey.aws.medialive.start-channel-response/pipelines-running-count :portkey.aws.medialive/log-level :portkey.aws.medialive.start-channel-response/role-arn :portkey.aws.medialive/tags :portkey.aws.medialive.start-channel-response/egress-endpoints :portkey.aws.medialive/encoder-settings :portkey.aws.medialive.start-channel-response/arn :portkey.aws.medialive/input-specification :portkey.aws.medialive.start-channel-response/state :portkey.aws.medialive.start-channel-response/destinations :portkey.aws.medialive.start-channel-response/name :portkey.aws.medialive.start-channel-response/id]))

(clojure.spec.alpha/def :portkey.aws.medialive.input-security-group/arn (clojure.spec.alpha/and :portkey.aws.medialive/string))
(clojure.spec.alpha/def :portkey.aws.medialive.input-security-group/id (clojure.spec.alpha/and :portkey.aws.medialive/string))
(clojure.spec.alpha/def :portkey.aws.medialive.input-security-group/inputs (clojure.spec.alpha/and :portkey.aws.medialive/list-of-string))
(clojure.spec.alpha/def :portkey.aws.medialive.input-security-group/state (clojure.spec.alpha/and :portkey.aws.medialive/input-security-group-state))
(clojure.spec.alpha/def :portkey.aws.medialive.input-security-group/whitelist-rules (clojure.spec.alpha/and :portkey.aws.medialive/list-of-input-whitelist-rule))
(clojure.spec.alpha/def :portkey.aws.medialive/input-security-group (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.medialive.input-security-group/arn :portkey.aws.medialive.input-security-group/id :portkey.aws.medialive.input-security-group/inputs :portkey.aws.medialive.input-security-group/state :portkey.aws.medialive/tags :portkey.aws.medialive.input-security-group/whitelist-rules]))

(clojure.spec.alpha/def :portkey.aws.medialive/smooth-group-audio-only-timecode-control #{"PASSTHROUGH" :passthrough :use-configured-clock "USE_CONFIGURED_CLOCK"})

(clojure.spec.alpha/def :portkey.aws.medialive/pipeline-id #{"PIPELINE_0" :pipeline-1 :pipeline-0 "PIPELINE_1"})

(clojure.spec.alpha/def :portkey.aws.medialive.video-description/codec-settings (clojure.spec.alpha/and :portkey.aws.medialive/video-codec-settings))
(clojure.spec.alpha/def :portkey.aws.medialive.video-description/height (clojure.spec.alpha/and :portkey.aws.medialive/integer))
(clojure.spec.alpha/def :portkey.aws.medialive.video-description/name (clojure.spec.alpha/and :portkey.aws.medialive/string))
(clojure.spec.alpha/def :portkey.aws.medialive.video-description/respond-to-afd (clojure.spec.alpha/and :portkey.aws.medialive/video-description-respond-to-afd))
(clojure.spec.alpha/def :portkey.aws.medialive.video-description/scaling-behavior (clojure.spec.alpha/and :portkey.aws.medialive/video-description-scaling-behavior))
(clojure.spec.alpha/def :portkey.aws.medialive.video-description/sharpness (clojure.spec.alpha/and :portkey.aws.medialive/integer-min-0-max-100))
(clojure.spec.alpha/def :portkey.aws.medialive.video-description/width (clojure.spec.alpha/and :portkey.aws.medialive/integer))
(clojure.spec.alpha/def :portkey.aws.medialive/video-description (clojure.spec.alpha/keys :req-un [:portkey.aws.medialive.video-description/name] :opt-un [:portkey.aws.medialive.video-description/codec-settings :portkey.aws.medialive.video-description/height :portkey.aws.medialive.video-description/respond-to-afd :portkey.aws.medialive.video-description/scaling-behavior :portkey.aws.medialive.video-description/sharpness :portkey.aws.medialive.video-description/width]))

(clojure.spec.alpha/def :portkey.aws.medialive/integer-min-0-max-15 (clojure.spec.alpha/int-in 0 15))

(clojure.spec.alpha/def :portkey.aws.medialive/global-configuration-output-timing-source #{"INPUT_CLOCK" :input-clock "SYSTEM_CLOCK" :system-clock})

(clojure.spec.alpha/def :portkey.aws.medialive/scte-35-no-regional-blackout-flag #{:regional-blackout "REGIONAL_BLACKOUT" :no-regional-blackout "NO_REGIONAL_BLACKOUT"})

(clojure.spec.alpha/def :portkey.aws.medialive/integer-min-1-max-10 (clojure.spec.alpha/int-in 1 10))

(clojure.spec.alpha/def :portkey.aws.medialive.audio-language-selection/language-code (clojure.spec.alpha/and :portkey.aws.medialive/string))
(clojure.spec.alpha/def :portkey.aws.medialive.audio-language-selection/language-selection-policy (clojure.spec.alpha/and :portkey.aws.medialive/audio-language-selection-policy))
(clojure.spec.alpha/def :portkey.aws.medialive/audio-language-selection (clojure.spec.alpha/keys :req-un [:portkey.aws.medialive.audio-language-selection/language-code] :opt-un [:portkey.aws.medialive.audio-language-selection/language-selection-policy]))

(clojure.spec.alpha/def :portkey.aws.medialive/reservation-codec #{:mpeg-2 :hevc "HEVC" "MPEG2" :audio "AUDIO" :avc "AVC"})

(clojure.spec.alpha/def :portkey.aws.medialive/output-group-settings (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.medialive/archive-group-settings :portkey.aws.medialive/frame-capture-group-settings :portkey.aws.medialive/hls-group-settings :portkey.aws.medialive/ms-smooth-group-settings :portkey.aws.medialive/rtmp-group-settings :portkey.aws.medialive/udp-group-settings]))

(clojure.spec.alpha/def :portkey.aws.medialive/integer-min-96-max-600 (clojure.spec.alpha/int-in 96 600))

(clojure.spec.alpha/def :portkey.aws.medialive/rtmp-cache-full-behavior #{:wait-for-server "WAIT_FOR_SERVER" :disconnect-immediately "DISCONNECT_IMMEDIATELY"})

(clojure.spec.alpha/def :portkey.aws.medialive.input-destination-vpc/availability-zone (clojure.spec.alpha/and :portkey.aws.medialive/string))
(clojure.spec.alpha/def :portkey.aws.medialive.input-destination-vpc/network-interface-id (clojure.spec.alpha/and :portkey.aws.medialive/string))
(clojure.spec.alpha/def :portkey.aws.medialive/input-destination-vpc (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.medialive.input-destination-vpc/availability-zone :portkey.aws.medialive.input-destination-vpc/network-interface-id]))

(clojure.spec.alpha/def :portkey.aws.medialive.describe-input-request/input-id (clojure.spec.alpha/and :portkey.aws.medialive/string))
(clojure.spec.alpha/def :portkey.aws.medialive/describe-input-request (clojure.spec.alpha/keys :req-un [:portkey.aws.medialive.describe-input-request/input-id] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.medialive/avail-configuration (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.medialive/avail-settings]))

(clojure.spec.alpha/def :portkey.aws.medialive/archive-container-settings (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.medialive/m-2ts-settings]))

(clojure.spec.alpha/def :portkey.aws.medialive/list-of-hls-ad-markers (clojure.spec.alpha/coll-of :portkey.aws.medialive/hls-ad-markers))

(clojure.spec.alpha/def :portkey.aws.medialive.list-channels-response/channels (clojure.spec.alpha/and :portkey.aws.medialive/list-of-channel-summary))
(clojure.spec.alpha/def :portkey.aws.medialive.list-channels-response/next-token (clojure.spec.alpha/and :portkey.aws.medialive/string))
(clojure.spec.alpha/def :portkey.aws.medialive/list-channels-response (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.medialive.list-channels-response/channels :portkey.aws.medialive.list-channels-response/next-token]))

(clojure.spec.alpha/def :portkey.aws.medialive/blackout-slate-state #{"DISABLED" :disabled "ENABLED" :enabled})

(clojure.spec.alpha/def :portkey.aws.medialive.mp-2-settings/bitrate (clojure.spec.alpha/and :portkey.aws.medialive/double))
(clojure.spec.alpha/def :portkey.aws.medialive.mp-2-settings/coding-mode (clojure.spec.alpha/and :portkey.aws.medialive/mp-2-coding-mode))
(clojure.spec.alpha/def :portkey.aws.medialive.mp-2-settings/sample-rate (clojure.spec.alpha/and :portkey.aws.medialive/double))
(clojure.spec.alpha/def :portkey.aws.medialive/mp-2-settings (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.medialive.mp-2-settings/bitrate :portkey.aws.medialive.mp-2-settings/coding-mode :portkey.aws.medialive.mp-2-settings/sample-rate]))

(clojure.spec.alpha/def :portkey.aws.medialive/arib-destination-settings (clojure.spec.alpha/keys :req-un [] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.medialive/reservation-maximum-framerate #{:max-30-fps :max-60-fps "MAX_30_FPS" "MAX_60_FPS"})

(clojure.spec.alpha/def :portkey.aws.medialive/smooth-group-sparse-track-type #{:scte-35 "NONE" "SCTE_35" :none})

(clojure.spec.alpha/def :portkey.aws.medialive/m-2ts-es-rate-in-pes #{:exclude :include "INCLUDE" "EXCLUDE"})

(clojure.spec.alpha/def :portkey.aws.medialive/caption-destination-settings (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.medialive/ttml-destination-settings :portkey.aws.medialive/burn-in-destination-settings :portkey.aws.medialive/scte-27-destination-settings :portkey.aws.medialive/arib-destination-settings :portkey.aws.medialive/rtmp-caption-info-destination-settings :portkey.aws.medialive/webvtt-destination-settings :portkey.aws.medialive/teletext-destination-settings :portkey.aws.medialive/smpte-tt-destination-settings :portkey.aws.medialive/dvb-sub-destination-settings :portkey.aws.medialive/embedded-destination-settings :portkey.aws.medialive/embedded-plus-scte-20-destination-settings :portkey.aws.medialive/scte-20-plus-embedded-destination-settings]))

(clojure.spec.alpha/def :portkey.aws.medialive/integer-min-1000-max-30000 (clojure.spec.alpha/int-in 1000 30000))

(clojure.spec.alpha/def :portkey.aws.medialive.hls-input-settings/bandwidth (clojure.spec.alpha/and :portkey.aws.medialive/integer-min-0))
(clojure.spec.alpha/def :portkey.aws.medialive.hls-input-settings/buffer-segments (clojure.spec.alpha/and :portkey.aws.medialive/integer-min-0))
(clojure.spec.alpha/def :portkey.aws.medialive.hls-input-settings/retries (clojure.spec.alpha/and :portkey.aws.medialive/integer-min-0))
(clojure.spec.alpha/def :portkey.aws.medialive.hls-input-settings/retry-interval (clojure.spec.alpha/and :portkey.aws.medialive/integer-min-0))
(clojure.spec.alpha/def :portkey.aws.medialive/hls-input-settings (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.medialive.hls-input-settings/bandwidth :portkey.aws.medialive.hls-input-settings/buffer-segments :portkey.aws.medialive.hls-input-settings/retries :portkey.aws.medialive.hls-input-settings/retry-interval]))

(clojure.spec.alpha/def :portkey.aws.medialive/hls-ad-markers #{"ELEMENTAL" "ADOBE" "ELEMENTAL_SCTE35" :elemental-scte-35 :adobe :elemental})

(clojure.spec.alpha/def :portkey.aws.medialive/list-of-input-whitelist-rule (clojure.spec.alpha/coll-of :portkey.aws.medialive/input-whitelist-rule))

(clojure.spec.alpha/def :portkey.aws.medialive/list-of-string (clojure.spec.alpha/coll-of :portkey.aws.medialive/string))

(clojure.spec.alpha/def :portkey.aws.medialive/channel-state #{"IDLE" :deleted :idle :starting :creating "CREATE_FAILED" :deleting :running :stopping :create-failed "STARTING" "DELETING" "CREATING" :recovering "DELETED" "RECOVERING" "STOPPING" "RUNNING"})

(clojure.spec.alpha/def :portkey.aws.medialive.create-tags-request/resource-arn (clojure.spec.alpha/and :portkey.aws.medialive/string))
(clojure.spec.alpha/def :portkey.aws.medialive/create-tags-request (clojure.spec.alpha/keys :req-un [:portkey.aws.medialive.create-tags-request/resource-arn] :opt-un [:portkey.aws.medialive/tags]))

(clojure.spec.alpha/def :portkey.aws.medialive/m-2ts-segmentation-style #{:reset-cadence :maintain-cadence "MAINTAIN_CADENCE" "RESET_CADENCE"})

(clojure.spec.alpha/def :portkey.aws.medialive/integer-min-0-max-30 (clojure.spec.alpha/int-in 0 30))

(clojure.spec.alpha/def :portkey.aws.medialive/hls-iv-source #{:explicit :follows-segment-number "EXPLICIT" "FOLLOWS_SEGMENT_NUMBER"})

(clojure.spec.alpha/def :portkey.aws.medialive/boolean clojure.core/boolean?)

(clojure.spec.alpha/def :portkey.aws.medialive.conflict-exception/message (clojure.spec.alpha/and :portkey.aws.medialive/string))
(clojure.spec.alpha/def :portkey.aws.medialive/conflict-exception (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.medialive.conflict-exception/message]))

(clojure.spec.alpha/def :portkey.aws.medialive/authentication-scheme #{:common "AKAMAI" "COMMON" :akamai})

(clojure.spec.alpha/def :portkey.aws.medialive.standard-hls-settings/audio-rendition-sets (clojure.spec.alpha/and :portkey.aws.medialive/string))
(clojure.spec.alpha/def :portkey.aws.medialive/standard-hls-settings (clojure.spec.alpha/keys :req-un [:portkey.aws.medialive/m-3u-8-settings] :opt-un [:portkey.aws.medialive.standard-hls-settings/audio-rendition-sets]))

(clojure.spec.alpha/def :portkey.aws.medialive/list-of-input-attachment (clojure.spec.alpha/coll-of :portkey.aws.medialive/input-attachment))

(clojure.spec.alpha/def :portkey.aws.medialive/hls-cdn-settings (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.medialive/hls-akamai-settings :portkey.aws.medialive/hls-basic-put-settings :portkey.aws.medialive/hls-media-store-settings :portkey.aws.medialive/hls-webdav-settings]))

(clojure.spec.alpha/def :portkey.aws.medialive.delete-input-request/input-id (clojure.spec.alpha/and :portkey.aws.medialive/string))
(clojure.spec.alpha/def :portkey.aws.medialive/delete-input-request (clojure.spec.alpha/keys :req-un [:portkey.aws.medialive.delete-input-request/input-id] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.medialive/scte-35-descriptor (clojure.spec.alpha/keys :req-un [:portkey.aws.medialive/scte-35-descriptor-settings] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.medialive.list-offerings-request/codec (clojure.spec.alpha/and :portkey.aws.medialive/string))
(clojure.spec.alpha/def :portkey.aws.medialive.list-offerings-request/resolution (clojure.spec.alpha/and :portkey.aws.medialive/string))
(clojure.spec.alpha/def :portkey.aws.medialive.list-offerings-request/next-token (clojure.spec.alpha/and :portkey.aws.medialive/string))
(clojure.spec.alpha/def :portkey.aws.medialive.list-offerings-request/maximum-bitrate (clojure.spec.alpha/and :portkey.aws.medialive/string))
(clojure.spec.alpha/def :portkey.aws.medialive.list-offerings-request/resource-type (clojure.spec.alpha/and :portkey.aws.medialive/string))
(clojure.spec.alpha/def :portkey.aws.medialive.list-offerings-request/video-quality (clojure.spec.alpha/and :portkey.aws.medialive/string))
(clojure.spec.alpha/def :portkey.aws.medialive.list-offerings-request/channel-configuration (clojure.spec.alpha/and :portkey.aws.medialive/string))
(clojure.spec.alpha/def :portkey.aws.medialive.list-offerings-request/special-feature (clojure.spec.alpha/and :portkey.aws.medialive/string))
(clojure.spec.alpha/def :portkey.aws.medialive.list-offerings-request/maximum-framerate (clojure.spec.alpha/and :portkey.aws.medialive/string))
(clojure.spec.alpha/def :portkey.aws.medialive/list-offerings-request (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.medialive.list-offerings-request/codec :portkey.aws.medialive.list-offerings-request/resolution :portkey.aws.medialive.list-offerings-request/next-token :portkey.aws.medialive.list-offerings-request/maximum-bitrate :portkey.aws.medialive.list-offerings-request/resource-type :portkey.aws.medialive/max-results :portkey.aws.medialive.list-offerings-request/video-quality :portkey.aws.medialive.list-offerings-request/channel-configuration :portkey.aws.medialive.list-offerings-request/special-feature :portkey.aws.medialive.list-offerings-request/maximum-framerate]))

(clojure.spec.alpha/def :portkey.aws.medialive.list-channels-result-model/channels (clojure.spec.alpha/and :portkey.aws.medialive/list-of-channel-summary))
(clojure.spec.alpha/def :portkey.aws.medialive.list-channels-result-model/next-token (clojure.spec.alpha/and :portkey.aws.medialive/string))
(clojure.spec.alpha/def :portkey.aws.medialive/list-channels-result-model (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.medialive.list-channels-result-model/channels :portkey.aws.medialive.list-channels-result-model/next-token]))

(clojure.spec.alpha/def :portkey.aws.medialive.stop-channel-response/input-attachments (clojure.spec.alpha/and :portkey.aws.medialive/list-of-input-attachment))
(clojure.spec.alpha/def :portkey.aws.medialive.stop-channel-response/pipelines-running-count (clojure.spec.alpha/and :portkey.aws.medialive/integer))
(clojure.spec.alpha/def :portkey.aws.medialive.stop-channel-response/role-arn (clojure.spec.alpha/and :portkey.aws.medialive/string))
(clojure.spec.alpha/def :portkey.aws.medialive.stop-channel-response/egress-endpoints (clojure.spec.alpha/and :portkey.aws.medialive/list-of-channel-egress-endpoint))
(clojure.spec.alpha/def :portkey.aws.medialive.stop-channel-response/arn (clojure.spec.alpha/and :portkey.aws.medialive/string))
(clojure.spec.alpha/def :portkey.aws.medialive.stop-channel-response/state (clojure.spec.alpha/and :portkey.aws.medialive/channel-state))
(clojure.spec.alpha/def :portkey.aws.medialive.stop-channel-response/destinations (clojure.spec.alpha/and :portkey.aws.medialive/list-of-output-destination))
(clojure.spec.alpha/def :portkey.aws.medialive.stop-channel-response/name (clojure.spec.alpha/and :portkey.aws.medialive/string))
(clojure.spec.alpha/def :portkey.aws.medialive.stop-channel-response/id (clojure.spec.alpha/and :portkey.aws.medialive/string))
(clojure.spec.alpha/def :portkey.aws.medialive/stop-channel-response (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.medialive.stop-channel-response/input-attachments :portkey.aws.medialive.stop-channel-response/pipelines-running-count :portkey.aws.medialive/log-level :portkey.aws.medialive.stop-channel-response/role-arn :portkey.aws.medialive/tags :portkey.aws.medialive.stop-channel-response/egress-endpoints :portkey.aws.medialive/encoder-settings :portkey.aws.medialive.stop-channel-response/arn :portkey.aws.medialive/input-specification :portkey.aws.medialive.stop-channel-response/state :portkey.aws.medialive.stop-channel-response/destinations :portkey.aws.medialive.stop-channel-response/name :portkey.aws.medialive.stop-channel-response/id]))

(clojure.spec.alpha/def :portkey.aws.medialive/smooth-group-event-stop-behavior #{"SEND_EOS" :send-eos "NONE" :none})

(clojure.spec.alpha/def :portkey.aws.medialive.create-input/media-connect-flows (clojure.spec.alpha/and :portkey.aws.medialive/list-of-media-connect-flow-request))
(clojure.spec.alpha/def :portkey.aws.medialive.create-input/request-id (clojure.spec.alpha/and :portkey.aws.medialive/string))
(clojure.spec.alpha/def :portkey.aws.medialive.create-input/type (clojure.spec.alpha/and :portkey.aws.medialive/input-type))
(clojure.spec.alpha/def :portkey.aws.medialive.create-input/input-security-groups (clojure.spec.alpha/and :portkey.aws.medialive/list-of-string))
(clojure.spec.alpha/def :portkey.aws.medialive.create-input/role-arn (clojure.spec.alpha/and :portkey.aws.medialive/string))
(clojure.spec.alpha/def :portkey.aws.medialive.create-input/vpc (clojure.spec.alpha/and :portkey.aws.medialive/input-vpc-request))
(clojure.spec.alpha/def :portkey.aws.medialive.create-input/destinations (clojure.spec.alpha/and :portkey.aws.medialive/list-of-input-destination-request))
(clojure.spec.alpha/def :portkey.aws.medialive.create-input/name (clojure.spec.alpha/and :portkey.aws.medialive/string))
(clojure.spec.alpha/def :portkey.aws.medialive.create-input/sources (clojure.spec.alpha/and :portkey.aws.medialive/list-of-input-source-request))
(clojure.spec.alpha/def :portkey.aws.medialive/create-input (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.medialive.create-input/media-connect-flows :portkey.aws.medialive.create-input/request-id :portkey.aws.medialive.create-input/type :portkey.aws.medialive.create-input/input-security-groups :portkey.aws.medialive.create-input/role-arn :portkey.aws.medialive/tags :portkey.aws.medialive.create-input/vpc :portkey.aws.medialive.create-input/destinations :portkey.aws.medialive.create-input/name :portkey.aws.medialive.create-input/sources]))

(clojure.spec.alpha/def :portkey.aws.medialive/list-of-input-destination (clojure.spec.alpha/coll-of :portkey.aws.medialive/input-destination))

(clojure.spec.alpha/def :portkey.aws.medialive.scte-35-splice-insert/ad-avail-offset (clojure.spec.alpha/and :portkey.aws.medialive/integer-min-negative-1000-max-1000))
(clojure.spec.alpha/def :portkey.aws.medialive.scte-35-splice-insert/no-regional-blackout-flag (clojure.spec.alpha/and :portkey.aws.medialive/scte-35-splice-insert-no-regional-blackout-behavior))
(clojure.spec.alpha/def :portkey.aws.medialive.scte-35-splice-insert/web-delivery-allowed-flag (clojure.spec.alpha/and :portkey.aws.medialive/scte-35-splice-insert-web-delivery-allowed-behavior))
(clojure.spec.alpha/def :portkey.aws.medialive/scte-35-splice-insert (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.medialive.scte-35-splice-insert/ad-avail-offset :portkey.aws.medialive.scte-35-splice-insert/no-regional-blackout-flag :portkey.aws.medialive.scte-35-splice-insert/web-delivery-allowed-flag]))

(clojure.spec.alpha/def :portkey.aws.medialive/m-2ts-rate-mode #{"VBR" :cbr :vbr "CBR"})

(clojure.spec.alpha/def :portkey.aws.medialive/eac-3-bitstream-mode #{:hearing-impaired :visually-impaired :complete-main "COMPLETE_MAIN" "VISUALLY_IMPAIRED" "EMERGENCY" :emergency "COMMENTARY" :commentary "HEARING_IMPAIRED"})

(clojure.spec.alpha/def :portkey.aws.medialive.input-channel-level/gain (clojure.spec.alpha/and :portkey.aws.medialive/integer-min-negative-60-max-6))
(clojure.spec.alpha/def :portkey.aws.medialive.input-channel-level/input-channel (clojure.spec.alpha/and :portkey.aws.medialive/integer-min-0-max-15))
(clojure.spec.alpha/def :portkey.aws.medialive/input-channel-level (clojure.spec.alpha/keys :req-un [:portkey.aws.medialive.input-channel-level/input-channel :portkey.aws.medialive.input-channel-level/gain] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.medialive/h-264-profile #{:baseline "HIGH_422" :high-422 "BASELINE" :high "MAIN" "HIGH_10BIT" "HIGH" "HIGH_422_10BIT" :high-10-bit :high-422-10-bit :main})

(clojure.spec.alpha/def :portkey.aws.medialive.batch-schedule-action-delete-result/schedule-actions (clojure.spec.alpha/and :portkey.aws.medialive/list-of-schedule-action))
(clojure.spec.alpha/def :portkey.aws.medialive/batch-schedule-action-delete-result (clojure.spec.alpha/keys :req-un [:portkey.aws.medialive.batch-schedule-action-delete-result/schedule-actions] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.medialive/m-2ts-arib-captions-pid-control #{"USE_CONFIGURED" "AUTO" :use-configured :auto})

(clojure.spec.alpha/def :portkey.aws.medialive/integer-min-0-max-100 (clojure.spec.alpha/int-in 0 100))

(clojure.spec.alpha/def :portkey.aws.medialive/integer-min-1-max-6 (clojure.spec.alpha/int-in 1 6))

(clojure.spec.alpha/def :portkey.aws.medialive.input/media-connect-flows (clojure.spec.alpha/and :portkey.aws.medialive/list-of-media-connect-flow))
(clojure.spec.alpha/def :portkey.aws.medialive.input/type (clojure.spec.alpha/and :portkey.aws.medialive/input-type))
(clojure.spec.alpha/def :portkey.aws.medialive.input/security-groups (clojure.spec.alpha/and :portkey.aws.medialive/list-of-string))
(clojure.spec.alpha/def :portkey.aws.medialive.input/role-arn (clojure.spec.alpha/and :portkey.aws.medialive/string))
(clojure.spec.alpha/def :portkey.aws.medialive.input/arn (clojure.spec.alpha/and :portkey.aws.medialive/string))
(clojure.spec.alpha/def :portkey.aws.medialive.input/state (clojure.spec.alpha/and :portkey.aws.medialive/input-state))
(clojure.spec.alpha/def :portkey.aws.medialive.input/destinations (clojure.spec.alpha/and :portkey.aws.medialive/list-of-input-destination))
(clojure.spec.alpha/def :portkey.aws.medialive.input/name (clojure.spec.alpha/and :portkey.aws.medialive/string))
(clojure.spec.alpha/def :portkey.aws.medialive.input/sources (clojure.spec.alpha/and :portkey.aws.medialive/list-of-input-source))
(clojure.spec.alpha/def :portkey.aws.medialive.input/attached-channels (clojure.spec.alpha/and :portkey.aws.medialive/list-of-string))
(clojure.spec.alpha/def :portkey.aws.medialive.input/id (clojure.spec.alpha/and :portkey.aws.medialive/string))
(clojure.spec.alpha/def :portkey.aws.medialive/input (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.medialive.input/media-connect-flows :portkey.aws.medialive.input/type :portkey.aws.medialive.input/security-groups :portkey.aws.medialive.input/role-arn :portkey.aws.medialive/tags :portkey.aws.medialive.input/arn :portkey.aws.medialive.input/state :portkey.aws.medialive.input/destinations :portkey.aws.medialive.input/name :portkey.aws.medialive.input/sources :portkey.aws.medialive.input/attached-channels :portkey.aws.medialive.input/id]))

(clojure.spec.alpha/def :portkey.aws.medialive.not-found-exception/message (clojure.spec.alpha/and :portkey.aws.medialive/string))
(clojure.spec.alpha/def :portkey.aws.medialive/not-found-exception (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.medialive.not-found-exception/message]))

(clojure.spec.alpha/def :portkey.aws.medialive/m-2ts-cc-descriptor #{"DISABLED" :disabled "ENABLED" :enabled})

(clojure.spec.alpha/def :portkey.aws.medialive/list-of-pipeline-pause-state-settings (clojure.spec.alpha/coll-of :portkey.aws.medialive/pipeline-pause-state-settings))

(clojure.spec.alpha/def :portkey.aws.medialive.list-inputs-request/next-token (clojure.spec.alpha/and :portkey.aws.medialive/string))
(clojure.spec.alpha/def :portkey.aws.medialive/list-inputs-request (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.medialive/max-results :portkey.aws.medialive.list-inputs-request/next-token]))

(clojure.spec.alpha/def :portkey.aws.medialive.delete-reservation-response/duration-units (clojure.spec.alpha/and :portkey.aws.medialive/offering-duration-units))
(clojure.spec.alpha/def :portkey.aws.medialive.delete-reservation-response/currency-code (clojure.spec.alpha/and :portkey.aws.medialive/string))
(clojure.spec.alpha/def :portkey.aws.medialive.delete-reservation-response/offering-description (clojure.spec.alpha/and :portkey.aws.medialive/string))
(clojure.spec.alpha/def :portkey.aws.medialive.delete-reservation-response/resource-specification (clojure.spec.alpha/and :portkey.aws.medialive/reservation-resource-specification))
(clojure.spec.alpha/def :portkey.aws.medialive.delete-reservation-response/start (clojure.spec.alpha/and :portkey.aws.medialive/string))
(clojure.spec.alpha/def :portkey.aws.medialive.delete-reservation-response/fixed-price (clojure.spec.alpha/and :portkey.aws.medialive/double))
(clojure.spec.alpha/def :portkey.aws.medialive.delete-reservation-response/end (clojure.spec.alpha/and :portkey.aws.medialive/string))
(clojure.spec.alpha/def :portkey.aws.medialive.delete-reservation-response/count (clojure.spec.alpha/and :portkey.aws.medialive/integer))
(clojure.spec.alpha/def :portkey.aws.medialive.delete-reservation-response/offering-id (clojure.spec.alpha/and :portkey.aws.medialive/string))
(clojure.spec.alpha/def :portkey.aws.medialive.delete-reservation-response/duration (clojure.spec.alpha/and :portkey.aws.medialive/integer))
(clojure.spec.alpha/def :portkey.aws.medialive.delete-reservation-response/usage-price (clojure.spec.alpha/and :portkey.aws.medialive/double))
(clojure.spec.alpha/def :portkey.aws.medialive.delete-reservation-response/arn (clojure.spec.alpha/and :portkey.aws.medialive/string))
(clojure.spec.alpha/def :portkey.aws.medialive.delete-reservation-response/state (clojure.spec.alpha/and :portkey.aws.medialive/reservation-state))
(clojure.spec.alpha/def :portkey.aws.medialive.delete-reservation-response/name (clojure.spec.alpha/and :portkey.aws.medialive/string))
(clojure.spec.alpha/def :portkey.aws.medialive.delete-reservation-response/reservation-id (clojure.spec.alpha/and :portkey.aws.medialive/string))
(clojure.spec.alpha/def :portkey.aws.medialive.delete-reservation-response/region (clojure.spec.alpha/and :portkey.aws.medialive/string))
(clojure.spec.alpha/def :portkey.aws.medialive/delete-reservation-response (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.medialive.delete-reservation-response/duration-units :portkey.aws.medialive.delete-reservation-response/currency-code :portkey.aws.medialive.delete-reservation-response/offering-description :portkey.aws.medialive.delete-reservation-response/resource-specification :portkey.aws.medialive.delete-reservation-response/start :portkey.aws.medialive.delete-reservation-response/fixed-price :portkey.aws.medialive.delete-reservation-response/end :portkey.aws.medialive.delete-reservation-response/count :portkey.aws.medialive.delete-reservation-response/offering-id :portkey.aws.medialive.delete-reservation-response/duration :portkey.aws.medialive.delete-reservation-response/usage-price :portkey.aws.medialive.delete-reservation-response/arn :portkey.aws.medialive.delete-reservation-response/state :portkey.aws.medialive/offering-type :portkey.aws.medialive.delete-reservation-response/name :portkey.aws.medialive.delete-reservation-response/reservation-id :portkey.aws.medialive.delete-reservation-response/region]))

(clojure.spec.alpha/def :portkey.aws.medialive.purchase-offering-request/count (clojure.spec.alpha/and :portkey.aws.medialive/integer-min-1))
(clojure.spec.alpha/def :portkey.aws.medialive.purchase-offering-request/name (clojure.spec.alpha/and :portkey.aws.medialive/string))
(clojure.spec.alpha/def :portkey.aws.medialive.purchase-offering-request/offering-id (clojure.spec.alpha/and :portkey.aws.medialive/string))
(clojure.spec.alpha/def :portkey.aws.medialive.purchase-offering-request/request-id (clojure.spec.alpha/and :portkey.aws.medialive/string))
(clojure.spec.alpha/def :portkey.aws.medialive.purchase-offering-request/start (clojure.spec.alpha/and :portkey.aws.medialive/string))
(clojure.spec.alpha/def :portkey.aws.medialive/purchase-offering-request (clojure.spec.alpha/keys :req-un [:portkey.aws.medialive.purchase-offering-request/offering-id :portkey.aws.medialive.purchase-offering-request/count] :opt-un [:portkey.aws.medialive.purchase-offering-request/name :portkey.aws.medialive.purchase-offering-request/request-id :portkey.aws.medialive.purchase-offering-request/start]))

(clojure.spec.alpha/def :portkey.aws.medialive/string-min-1-max-256 (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__21110__auto__] (clojure.core/<= 1 (clojure.core/count s__21110__auto__))) (clojure.core/fn [s__21111__auto__] (clojure.core/< (clojure.core/count s__21111__auto__) 256))))

(clojure.spec.alpha/def :portkey.aws.medialive.delete-channel-request/channel-id (clojure.spec.alpha/and :portkey.aws.medialive/string))
(clojure.spec.alpha/def :portkey.aws.medialive/delete-channel-request (clojure.spec.alpha/keys :req-un [:portkey.aws.medialive.delete-channel-request/channel-id] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.medialive/dvb-sub-destination-outline-color #{:white :yellow :green "GREEN" "BLUE" :red :blue "WHITE" "YELLOW" "BLACK" "RED" :black})

(clojure.spec.alpha/def :portkey.aws.medialive/double-min-negative-59-max-0 clojure.core/double?)

(clojure.spec.alpha/def :portkey.aws.medialive.list-reservations-request/codec (clojure.spec.alpha/and :portkey.aws.medialive/string))
(clojure.spec.alpha/def :portkey.aws.medialive.list-reservations-request/resolution (clojure.spec.alpha/and :portkey.aws.medialive/string))
(clojure.spec.alpha/def :portkey.aws.medialive.list-reservations-request/next-token (clojure.spec.alpha/and :portkey.aws.medialive/string))
(clojure.spec.alpha/def :portkey.aws.medialive.list-reservations-request/maximum-bitrate (clojure.spec.alpha/and :portkey.aws.medialive/string))
(clojure.spec.alpha/def :portkey.aws.medialive.list-reservations-request/resource-type (clojure.spec.alpha/and :portkey.aws.medialive/string))
(clojure.spec.alpha/def :portkey.aws.medialive.list-reservations-request/video-quality (clojure.spec.alpha/and :portkey.aws.medialive/string))
(clojure.spec.alpha/def :portkey.aws.medialive.list-reservations-request/special-feature (clojure.spec.alpha/and :portkey.aws.medialive/string))
(clojure.spec.alpha/def :portkey.aws.medialive.list-reservations-request/maximum-framerate (clojure.spec.alpha/and :portkey.aws.medialive/string))
(clojure.spec.alpha/def :portkey.aws.medialive/list-reservations-request (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.medialive.list-reservations-request/codec :portkey.aws.medialive.list-reservations-request/resolution :portkey.aws.medialive.list-reservations-request/next-token :portkey.aws.medialive.list-reservations-request/maximum-bitrate :portkey.aws.medialive.list-reservations-request/resource-type :portkey.aws.medialive/max-results :portkey.aws.medialive.list-reservations-request/video-quality :portkey.aws.medialive.list-reservations-request/special-feature :portkey.aws.medialive.list-reservations-request/maximum-framerate]))

(clojure.spec.alpha/def :portkey.aws.medialive.static-image-deactivate-schedule-action-settings/fade-out (clojure.spec.alpha/and :portkey.aws.medialive/integer-min-0))
(clojure.spec.alpha/def :portkey.aws.medialive.static-image-deactivate-schedule-action-settings/layer (clojure.spec.alpha/and :portkey.aws.medialive/integer-min-0-max-7))
(clojure.spec.alpha/def :portkey.aws.medialive/static-image-deactivate-schedule-action-settings (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.medialive.static-image-deactivate-schedule-action-settings/fade-out :portkey.aws.medialive.static-image-deactivate-schedule-action-settings/layer]))

(clojure.spec.alpha/def :portkey.aws.medialive/video-codec-settings (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.medialive/frame-capture-settings :portkey.aws.medialive/h-264-settings]))

(clojure.spec.alpha/def :portkey.aws.medialive/string-max-32 (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__21111__auto__] (clojure.core/< (clojure.core/count s__21111__auto__) 32))))

(clojure.spec.alpha/def :portkey.aws.medialive.describe-channel-request/channel-id (clojure.spec.alpha/and :portkey.aws.medialive/string))
(clojure.spec.alpha/def :portkey.aws.medialive/describe-channel-request (clojure.spec.alpha/keys :req-un [:portkey.aws.medialive.describe-channel-request/channel-id] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.medialive.schedule-describe-result-model/next-token (clojure.spec.alpha/and :portkey.aws.medialive/string))
(clojure.spec.alpha/def :portkey.aws.medialive.schedule-describe-result-model/schedule-actions (clojure.spec.alpha/and :portkey.aws.medialive/list-of-schedule-action))
(clojure.spec.alpha/def :portkey.aws.medialive/schedule-describe-result-model (clojure.spec.alpha/keys :req-un [:portkey.aws.medialive.schedule-describe-result-model/schedule-actions] :opt-un [:portkey.aws.medialive.schedule-describe-result-model/next-token]))

(clojure.spec.alpha/def :portkey.aws.medialive/eac-3-dc-filter #{"DISABLED" :disabled "ENABLED" :enabled})

(clojure.spec.alpha/def :portkey.aws.medialive/m-3u-8-timed-metadata-behavior #{"PASSTHROUGH" :passthrough "NO_PASSTHROUGH" :no-passthrough})

(clojure.spec.alpha/def :portkey.aws.medialive/integer-min-1-max-5 (clojure.spec.alpha/int-in 1 5))

(clojure.spec.alpha/def :portkey.aws.medialive/h-264-scene-change-detect #{"DISABLED" :disabled "ENABLED" :enabled})

(clojure.spec.alpha/def :portkey.aws.medialive/aac-spec #{:mpeg-2 :mpeg-4 "MPEG4" "MPEG2"})

(clojure.spec.alpha/def :portkey.aws.medialive/scte-35-apos-web-delivery-allowed-behavior #{:follow :ignore "FOLLOW" "IGNORE"})

(clojure.spec.alpha/def :portkey.aws.medialive.batch-update-schedule-request/channel-id (clojure.spec.alpha/and :portkey.aws.medialive/string))
(clojure.spec.alpha/def :portkey.aws.medialive.batch-update-schedule-request/creates (clojure.spec.alpha/and :portkey.aws.medialive/batch-schedule-action-create-request))
(clojure.spec.alpha/def :portkey.aws.medialive.batch-update-schedule-request/deletes (clojure.spec.alpha/and :portkey.aws.medialive/batch-schedule-action-delete-request))
(clojure.spec.alpha/def :portkey.aws.medialive/batch-update-schedule-request (clojure.spec.alpha/keys :req-un [:portkey.aws.medialive.batch-update-schedule-request/channel-id] :opt-un [:portkey.aws.medialive.batch-update-schedule-request/creates :portkey.aws.medialive.batch-update-schedule-request/deletes]))

(clojure.spec.alpha/def :portkey.aws.medialive/blackout-slate-network-end-blackout #{"DISABLED" :disabled "ENABLED" :enabled})

(clojure.spec.alpha/def :portkey.aws.medialive.list-inputs-result-model/inputs (clojure.spec.alpha/and :portkey.aws.medialive/list-of-input))
(clojure.spec.alpha/def :portkey.aws.medialive.list-inputs-result-model/next-token (clojure.spec.alpha/and :portkey.aws.medialive/string))
(clojure.spec.alpha/def :portkey.aws.medialive/list-inputs-result-model (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.medialive.list-inputs-result-model/inputs :portkey.aws.medialive.list-inputs-result-model/next-token]))

(clojure.spec.alpha/def :portkey.aws.medialive/network-input-server-validation #{:check-cryptography-only "CHECK_CRYPTOGRAPHY_AND_VALIDATE_NAME" "CHECK_CRYPTOGRAPHY_ONLY" :check-cryptography-and-validate-name})

(clojure.spec.alpha/def :portkey.aws.medialive/hls-redundant-manifest #{"DISABLED" :disabled "ENABLED" :enabled})

(clojure.spec.alpha/def :portkey.aws.medialive.input-destination/ip (clojure.spec.alpha/and :portkey.aws.medialive/string))
(clojure.spec.alpha/def :portkey.aws.medialive.input-destination/port (clojure.spec.alpha/and :portkey.aws.medialive/string))
(clojure.spec.alpha/def :portkey.aws.medialive.input-destination/url (clojure.spec.alpha/and :portkey.aws.medialive/string))
(clojure.spec.alpha/def :portkey.aws.medialive.input-destination/vpc (clojure.spec.alpha/and :portkey.aws.medialive/input-destination-vpc))
(clojure.spec.alpha/def :portkey.aws.medialive/input-destination (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.medialive.input-destination/ip :portkey.aws.medialive.input-destination/port :portkey.aws.medialive.input-destination/url :portkey.aws.medialive.input-destination/vpc]))

(clojure.spec.alpha/def :portkey.aws.medialive/rtmp-caption-info-destination-settings (clojure.spec.alpha/keys :req-un [] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.medialive/aac-coding-mode #{"AD_RECEIVER_MIX" "CODING_MODE_1_0" :ad-receiver-mix :coding-mode-1-0 :coding-mode-2-0 :coding-mode-5-1 "CODING_MODE_1_1" "CODING_MODE_2_0" :coding-mode-1-1 "CODING_MODE_5_1"})

(clojure.spec.alpha/def :portkey.aws.medialive.create-channel/reserved (clojure.spec.alpha/and :portkey.aws.medialive/string))
(clojure.spec.alpha/def :portkey.aws.medialive.create-channel/input-attachments (clojure.spec.alpha/and :portkey.aws.medialive/list-of-input-attachment))
(clojure.spec.alpha/def :portkey.aws.medialive.create-channel/request-id (clojure.spec.alpha/and :portkey.aws.medialive/string))
(clojure.spec.alpha/def :portkey.aws.medialive.create-channel/role-arn (clojure.spec.alpha/and :portkey.aws.medialive/string))
(clojure.spec.alpha/def :portkey.aws.medialive.create-channel/destinations (clojure.spec.alpha/and :portkey.aws.medialive/list-of-output-destination))
(clojure.spec.alpha/def :portkey.aws.medialive.create-channel/name (clojure.spec.alpha/and :portkey.aws.medialive/string))
(clojure.spec.alpha/def :portkey.aws.medialive/create-channel (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.medialive.create-channel/reserved :portkey.aws.medialive.create-channel/input-attachments :portkey.aws.medialive.create-channel/request-id :portkey.aws.medialive/log-level :portkey.aws.medialive.create-channel/role-arn :portkey.aws.medialive/tags :portkey.aws.medialive/encoder-settings :portkey.aws.medialive/input-specification :portkey.aws.medialive.create-channel/destinations :portkey.aws.medialive.create-channel/name]))

(clojure.spec.alpha/def :portkey.aws.medialive/smooth-group-event-id-mode #{"USE_CONFIGURED" :no-event-id :use-timestamp :use-configured "NO_EVENT_ID" "USE_TIMESTAMP"})

(clojure.spec.alpha/def :portkey.aws.medialive.scte-27-source-settings/pid (clojure.spec.alpha/and :portkey.aws.medialive/integer-min-1))
(clojure.spec.alpha/def :portkey.aws.medialive/scte-27-source-settings (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.medialive.scte-27-source-settings/pid]))

(clojure.spec.alpha/def :portkey.aws.medialive/integer-min-1-max-3600 (clojure.spec.alpha/int-in 1 3600))

(clojure.spec.alpha/def :portkey.aws.medialive/webvtt-destination-settings (clojure.spec.alpha/keys :req-un [] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.medialive/output-settings (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.medialive/archive-output-settings :portkey.aws.medialive/frame-capture-output-settings :portkey.aws.medialive/hls-output-settings :portkey.aws.medialive/ms-smooth-output-settings :portkey.aws.medialive/rtmp-output-settings :portkey.aws.medialive/udp-output-settings]))

(clojure.spec.alpha/def :portkey.aws.medialive.caption-language-mapping/caption-channel (clojure.spec.alpha/and :portkey.aws.medialive/integer-min-1-max-4))
(clojure.spec.alpha/def :portkey.aws.medialive.caption-language-mapping/language-code (clojure.spec.alpha/and :portkey.aws.medialive/string-min-3-max-3))
(clojure.spec.alpha/def :portkey.aws.medialive.caption-language-mapping/language-description (clojure.spec.alpha/and :portkey.aws.medialive/string-min-1))
(clojure.spec.alpha/def :portkey.aws.medialive/caption-language-mapping (clojure.spec.alpha/keys :req-un [:portkey.aws.medialive.caption-language-mapping/language-code :portkey.aws.medialive.caption-language-mapping/language-description :portkey.aws.medialive.caption-language-mapping/caption-channel] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.medialive/input-loss-action-for-rtmp-out #{:emit-output :pause-output "PAUSE_OUTPUT" "EMIT_OUTPUT"})

(clojure.spec.alpha/def :portkey.aws.medialive/schedule-action-start-settings (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.medialive/fixed-mode-schedule-action-start-settings :portkey.aws.medialive/follow-mode-schedule-action-start-settings]))

(clojure.spec.alpha/def :portkey.aws.medialive.describe-offering-request/offering-id (clojure.spec.alpha/and :portkey.aws.medialive/string))
(clojure.spec.alpha/def :portkey.aws.medialive/describe-offering-request (clojure.spec.alpha/keys :req-un [:portkey.aws.medialive.describe-offering-request/offering-id] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.medialive/list-of-output (clojure.spec.alpha/coll-of :portkey.aws.medialive/output))

(clojure.spec.alpha/def :portkey.aws.medialive.encoder-settings/caption-descriptions (clojure.spec.alpha/and :portkey.aws.medialive/list-of-caption-description))
(clojure.spec.alpha/def :portkey.aws.medialive.encoder-settings/output-groups (clojure.spec.alpha/and :portkey.aws.medialive/list-of-output-group))
(clojure.spec.alpha/def :portkey.aws.medialive.encoder-settings/video-descriptions (clojure.spec.alpha/and :portkey.aws.medialive/list-of-video-description))
(clojure.spec.alpha/def :portkey.aws.medialive.encoder-settings/audio-descriptions (clojure.spec.alpha/and :portkey.aws.medialive/list-of-audio-description))
(clojure.spec.alpha/def :portkey.aws.medialive/encoder-settings (clojure.spec.alpha/keys :req-un [:portkey.aws.medialive.encoder-settings/video-descriptions :portkey.aws.medialive.encoder-settings/audio-descriptions :portkey.aws.medialive.encoder-settings/output-groups :portkey.aws.medialive/timecode-config] :opt-un [:portkey.aws.medialive/global-configuration :portkey.aws.medialive.encoder-settings/caption-descriptions :portkey.aws.medialive/avail-configuration :portkey.aws.medialive/blackout-slate :portkey.aws.medialive/avail-blanking]))

(clojure.spec.alpha/def :portkey.aws.medialive/update-input-result-model (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.medialive/input]))

(clojure.spec.alpha/def :portkey.aws.medialive.static-key-settings/key-provider-server (clojure.spec.alpha/and :portkey.aws.medialive/input-location))
(clojure.spec.alpha/def :portkey.aws.medialive.static-key-settings/static-key-value (clojure.spec.alpha/and :portkey.aws.medialive/string-min-32-max-32))
(clojure.spec.alpha/def :portkey.aws.medialive/static-key-settings (clojure.spec.alpha/keys :req-un [:portkey.aws.medialive.static-key-settings/static-key-value] :opt-un [:portkey.aws.medialive.static-key-settings/key-provider-server]))

(clojure.spec.alpha/def :portkey.aws.medialive.frame-capture-group-settings/destination (clojure.spec.alpha/and :portkey.aws.medialive/output-location-ref))
(clojure.spec.alpha/def :portkey.aws.medialive/frame-capture-group-settings (clojure.spec.alpha/keys :req-un [:portkey.aws.medialive.frame-capture-group-settings/destination] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.medialive/video-description-respond-to-afd #{:respond "PASSTHROUGH" "NONE" :passthrough "RESPOND" :none})

(clojure.spec.alpha/def :portkey.aws.medialive.input-security-group-whitelist-request/whitelist-rules (clojure.spec.alpha/and :portkey.aws.medialive/list-of-input-whitelist-rule-cidr))
(clojure.spec.alpha/def :portkey.aws.medialive/input-security-group-whitelist-request (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.medialive/tags :portkey.aws.medialive.input-security-group-whitelist-request/whitelist-rules]))

(clojure.spec.alpha/def :portkey.aws.medialive/teletext-destination-settings (clojure.spec.alpha/keys :req-un [] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.medialive.output-group/name (clojure.spec.alpha/and :portkey.aws.medialive/string-max-32))
(clojure.spec.alpha/def :portkey.aws.medialive.output-group/outputs (clojure.spec.alpha/and :portkey.aws.medialive/list-of-output))
(clojure.spec.alpha/def :portkey.aws.medialive/output-group (clojure.spec.alpha/keys :req-un [:portkey.aws.medialive.output-group/outputs :portkey.aws.medialive/output-group-settings] :opt-un [:portkey.aws.medialive.output-group/name]))

(clojure.spec.alpha/def :portkey.aws.medialive/update-input-response (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.medialive/input]))

(clojure.spec.alpha/def :portkey.aws.medialive/list-of-channel-summary (clojure.spec.alpha/coll-of :portkey.aws.medialive/channel-summary))

(clojure.spec.alpha/def :portkey.aws.medialive.input-attachment/input-attachment-name (clojure.spec.alpha/and :portkey.aws.medialive/string))
(clojure.spec.alpha/def :portkey.aws.medialive.input-attachment/input-id (clojure.spec.alpha/and :portkey.aws.medialive/string))
(clojure.spec.alpha/def :portkey.aws.medialive/input-attachment (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.medialive.input-attachment/input-attachment-name :portkey.aws.medialive.input-attachment/input-id :portkey.aws.medialive/input-settings]))

(clojure.spec.alpha/def :portkey.aws.medialive/hls-client-cache #{"DISABLED" :disabled "ENABLED" :enabled})

(clojure.spec.alpha/def :portkey.aws.medialive/integer-min-0-max-10000 (clojure.spec.alpha/int-in 0 10000))

(clojure.spec.alpha/def :portkey.aws.medialive/h-264-temporal-aq #{"DISABLED" :disabled "ENABLED" :enabled})

(clojure.spec.alpha/def :portkey.aws.medialive.describe-reservation-response/duration-units (clojure.spec.alpha/and :portkey.aws.medialive/offering-duration-units))
(clojure.spec.alpha/def :portkey.aws.medialive.describe-reservation-response/currency-code (clojure.spec.alpha/and :portkey.aws.medialive/string))
(clojure.spec.alpha/def :portkey.aws.medialive.describe-reservation-response/offering-description (clojure.spec.alpha/and :portkey.aws.medialive/string))
(clojure.spec.alpha/def :portkey.aws.medialive.describe-reservation-response/resource-specification (clojure.spec.alpha/and :portkey.aws.medialive/reservation-resource-specification))
(clojure.spec.alpha/def :portkey.aws.medialive.describe-reservation-response/start (clojure.spec.alpha/and :portkey.aws.medialive/string))
(clojure.spec.alpha/def :portkey.aws.medialive.describe-reservation-response/fixed-price (clojure.spec.alpha/and :portkey.aws.medialive/double))
(clojure.spec.alpha/def :portkey.aws.medialive.describe-reservation-response/end (clojure.spec.alpha/and :portkey.aws.medialive/string))
(clojure.spec.alpha/def :portkey.aws.medialive.describe-reservation-response/count (clojure.spec.alpha/and :portkey.aws.medialive/integer))
(clojure.spec.alpha/def :portkey.aws.medialive.describe-reservation-response/offering-id (clojure.spec.alpha/and :portkey.aws.medialive/string))
(clojure.spec.alpha/def :portkey.aws.medialive.describe-reservation-response/duration (clojure.spec.alpha/and :portkey.aws.medialive/integer))
(clojure.spec.alpha/def :portkey.aws.medialive.describe-reservation-response/usage-price (clojure.spec.alpha/and :portkey.aws.medialive/double))
(clojure.spec.alpha/def :portkey.aws.medialive.describe-reservation-response/arn (clojure.spec.alpha/and :portkey.aws.medialive/string))
(clojure.spec.alpha/def :portkey.aws.medialive.describe-reservation-response/state (clojure.spec.alpha/and :portkey.aws.medialive/reservation-state))
(clojure.spec.alpha/def :portkey.aws.medialive.describe-reservation-response/name (clojure.spec.alpha/and :portkey.aws.medialive/string))
(clojure.spec.alpha/def :portkey.aws.medialive.describe-reservation-response/reservation-id (clojure.spec.alpha/and :portkey.aws.medialive/string))
(clojure.spec.alpha/def :portkey.aws.medialive.describe-reservation-response/region (clojure.spec.alpha/and :portkey.aws.medialive/string))
(clojure.spec.alpha/def :portkey.aws.medialive/describe-reservation-response (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.medialive.describe-reservation-response/duration-units :portkey.aws.medialive.describe-reservation-response/currency-code :portkey.aws.medialive.describe-reservation-response/offering-description :portkey.aws.medialive.describe-reservation-response/resource-specification :portkey.aws.medialive.describe-reservation-response/start :portkey.aws.medialive.describe-reservation-response/fixed-price :portkey.aws.medialive.describe-reservation-response/end :portkey.aws.medialive.describe-reservation-response/count :portkey.aws.medialive.describe-reservation-response/offering-id :portkey.aws.medialive.describe-reservation-response/duration :portkey.aws.medialive.describe-reservation-response/usage-price :portkey.aws.medialive.describe-reservation-response/arn :portkey.aws.medialive.describe-reservation-response/state :portkey.aws.medialive/offering-type :portkey.aws.medialive.describe-reservation-response/name :portkey.aws.medialive.describe-reservation-response/reservation-id :portkey.aws.medialive.describe-reservation-response/region]))

(clojure.spec.alpha/def :portkey.aws.medialive/smpte-tt-destination-settings (clojure.spec.alpha/keys :req-un [] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.medialive.embedded-source-settings/convert-608-to-708 (clojure.spec.alpha/and :portkey.aws.medialive/embedded-convert-608-to-708))
(clojure.spec.alpha/def :portkey.aws.medialive.embedded-source-settings/scte-20-detection (clojure.spec.alpha/and :portkey.aws.medialive/embedded-scte-20-detection))
(clojure.spec.alpha/def :portkey.aws.medialive.embedded-source-settings/source-608-channel-number (clojure.spec.alpha/and :portkey.aws.medialive/integer-min-1-max-4))
(clojure.spec.alpha/def :portkey.aws.medialive.embedded-source-settings/source-608-track-number (clojure.spec.alpha/and :portkey.aws.medialive/integer-min-1-max-5))
(clojure.spec.alpha/def :portkey.aws.medialive/embedded-source-settings (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.medialive.embedded-source-settings/convert-608-to-708 :portkey.aws.medialive.embedded-source-settings/scte-20-detection :portkey.aws.medialive.embedded-source-settings/source-608-channel-number :portkey.aws.medialive.embedded-source-settings/source-608-track-number]))

(clojure.spec.alpha/def :portkey.aws.medialive/h-264-gop-b-reference #{"DISABLED" :disabled "ENABLED" :enabled})

(clojure.spec.alpha/def :portkey.aws.medialive/list-of-input (clojure.spec.alpha/coll-of :portkey.aws.medialive/input))

(clojure.spec.alpha/def :portkey.aws.medialive.network-input-settings/server-validation (clojure.spec.alpha/and :portkey.aws.medialive/network-input-server-validation))
(clojure.spec.alpha/def :portkey.aws.medialive/network-input-settings (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.medialive/hls-input-settings :portkey.aws.medialive.network-input-settings/server-validation]))

(clojure.spec.alpha/def :portkey.aws.medialive.input-whitelist-rule/cidr (clojure.spec.alpha/and :portkey.aws.medialive/string))
(clojure.spec.alpha/def :portkey.aws.medialive/input-whitelist-rule (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.medialive.input-whitelist-rule/cidr]))

(clojure.spec.alpha/def :portkey.aws.medialive/string-min-3-max-3 (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__21110__auto__] (clojure.core/<= 3 (clojure.core/count s__21110__auto__))) (clojure.core/fn [s__21111__auto__] (clojure.core/< (clojure.core/count s__21111__auto__) 3))))

(clojure.spec.alpha/def :portkey.aws.medialive/smooth-group-certificate-mode #{:verify-authenticity "VERIFY_AUTHENTICITY" "SELF_SIGNED" :self-signed})

(clojure.spec.alpha/def :portkey.aws.medialive.input-specification/codec (clojure.spec.alpha/and :portkey.aws.medialive/input-codec))
(clojure.spec.alpha/def :portkey.aws.medialive.input-specification/maximum-bitrate (clojure.spec.alpha/and :portkey.aws.medialive/input-maximum-bitrate))
(clojure.spec.alpha/def :portkey.aws.medialive.input-specification/resolution (clojure.spec.alpha/and :portkey.aws.medialive/input-resolution))
(clojure.spec.alpha/def :portkey.aws.medialive/input-specification (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.medialive.input-specification/codec :portkey.aws.medialive.input-specification/maximum-bitrate :portkey.aws.medialive.input-specification/resolution]))

(clojure.spec.alpha/def :portkey.aws.medialive/reservation-resource-type #{"OUTPUT" :channel "CHANNEL" :output "INPUT" :input})

(clojure.spec.alpha/def :portkey.aws.medialive/input-deblock-filter #{"DISABLED" :disabled "ENABLED" :enabled})

(clojure.spec.alpha/def :portkey.aws.medialive.list-channels-request/next-token (clojure.spec.alpha/and :portkey.aws.medialive/string))
(clojure.spec.alpha/def :portkey.aws.medialive/list-channels-request (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.medialive/max-results :portkey.aws.medialive.list-channels-request/next-token]))

(clojure.spec.alpha/def :portkey.aws.medialive.describe-input-response/media-connect-flows (clojure.spec.alpha/and :portkey.aws.medialive/list-of-media-connect-flow))
(clojure.spec.alpha/def :portkey.aws.medialive.describe-input-response/type (clojure.spec.alpha/and :portkey.aws.medialive/input-type))
(clojure.spec.alpha/def :portkey.aws.medialive.describe-input-response/security-groups (clojure.spec.alpha/and :portkey.aws.medialive/list-of-string))
(clojure.spec.alpha/def :portkey.aws.medialive.describe-input-response/role-arn (clojure.spec.alpha/and :portkey.aws.medialive/string))
(clojure.spec.alpha/def :portkey.aws.medialive.describe-input-response/arn (clojure.spec.alpha/and :portkey.aws.medialive/string))
(clojure.spec.alpha/def :portkey.aws.medialive.describe-input-response/state (clojure.spec.alpha/and :portkey.aws.medialive/input-state))
(clojure.spec.alpha/def :portkey.aws.medialive.describe-input-response/destinations (clojure.spec.alpha/and :portkey.aws.medialive/list-of-input-destination))
(clojure.spec.alpha/def :portkey.aws.medialive.describe-input-response/name (clojure.spec.alpha/and :portkey.aws.medialive/string))
(clojure.spec.alpha/def :portkey.aws.medialive.describe-input-response/sources (clojure.spec.alpha/and :portkey.aws.medialive/list-of-input-source))
(clojure.spec.alpha/def :portkey.aws.medialive.describe-input-response/attached-channels (clojure.spec.alpha/and :portkey.aws.medialive/list-of-string))
(clojure.spec.alpha/def :portkey.aws.medialive.describe-input-response/id (clojure.spec.alpha/and :portkey.aws.medialive/string))
(clojure.spec.alpha/def :portkey.aws.medialive/describe-input-response (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.medialive.describe-input-response/media-connect-flows :portkey.aws.medialive.describe-input-response/type :portkey.aws.medialive.describe-input-response/security-groups :portkey.aws.medialive.describe-input-response/role-arn :portkey.aws.medialive/tags :portkey.aws.medialive.describe-input-response/arn :portkey.aws.medialive.describe-input-response/state :portkey.aws.medialive.describe-input-response/destinations :portkey.aws.medialive.describe-input-response/name :portkey.aws.medialive.describe-input-response/sources :portkey.aws.medialive.describe-input-response/attached-channels :portkey.aws.medialive.describe-input-response/id]))

(clojure.spec.alpha/def :portkey.aws.medialive.batch-schedule-action-delete-request/action-names (clojure.spec.alpha/and :portkey.aws.medialive/list-of-string))
(clojure.spec.alpha/def :portkey.aws.medialive/batch-schedule-action-delete-request (clojure.spec.alpha/keys :req-un [:portkey.aws.medialive.batch-schedule-action-delete-request/action-names] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.medialive/embedded-scte-20-detection #{"AUTO" :off "OFF" :auto})

(clojure.spec.alpha/def :portkey.aws.medialive/input-codec #{:mpeg-2 :hevc "HEVC" "MPEG2" :avc "AVC"})

(clojure.spec.alpha/def :portkey.aws.medialive.list-input-security-groups-response/input-security-groups (clojure.spec.alpha/and :portkey.aws.medialive/list-of-input-security-group))
(clojure.spec.alpha/def :portkey.aws.medialive.list-input-security-groups-response/next-token (clojure.spec.alpha/and :portkey.aws.medialive/string))
(clojure.spec.alpha/def :portkey.aws.medialive/list-input-security-groups-response (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.medialive.list-input-security-groups-response/input-security-groups :portkey.aws.medialive.list-input-security-groups-response/next-token]))

(clojure.spec.alpha/def :portkey.aws.medialive/integer-min-4-max-20 (clojure.spec.alpha/int-in 4 20))

(clojure.spec.alpha/def :portkey.aws.medialive/arib-source-settings (clojure.spec.alpha/keys :req-un [] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.medialive/audio-description-language-code-control #{"FOLLOW_INPUT" :follow-input "USE_CONFIGURED" :use-configured})

(clojure.spec.alpha/def :portkey.aws.medialive/timestamp-iso-8601 clojure.core/inst?)

(clojure.spec.alpha/def :portkey.aws.medialive/double clojure.core/double?)

(clojure.spec.alpha/def :portkey.aws.medialive/ac-3-coding-mode #{:coding-mode-3-2-lfe "CODING_MODE_1_0" :coding-mode-1-0 :coding-mode-2-0 "CODING_MODE_3_2_LFE" "CODING_MODE_1_1" "CODING_MODE_2_0" :coding-mode-1-1})

(clojure.spec.alpha/def :portkey.aws.medialive.input-switch-schedule-action-settings/input-attachment-name-reference (clojure.spec.alpha/and :portkey.aws.medialive/string))
(clojure.spec.alpha/def :portkey.aws.medialive/input-switch-schedule-action-settings (clojure.spec.alpha/keys :req-un [:portkey.aws.medialive.input-switch-schedule-action-settings/input-attachment-name-reference] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.medialive/integer-min-0-max-10 (clojure.spec.alpha/int-in 0 10))

(clojure.spec.alpha/def :portkey.aws.medialive/aac-rate-control-mode #{"VBR" :cbr :vbr "CBR"})

(clojure.spec.alpha/def :portkey.aws.medialive/integer-min-negative-1000-max-1000 (clojure.spec.alpha/int-in -1000 1000))

(clojure.spec.alpha/def :portkey.aws.medialive/hls-segmentation-mode #{:use-segment-duration "USE_INPUT_SEGMENTATION" "USE_SEGMENT_DURATION" :use-input-segmentation})

(clojure.spec.alpha/def :portkey.aws.medialive/dvb-sub-destination-shadow-color #{:white "NONE" "WHITE" "BLACK" :none :black})

(clojure.spec.alpha/def :portkey.aws.medialive/list-of-reservation (clojure.spec.alpha/coll-of :portkey.aws.medialive/reservation))

(clojure.spec.alpha/def :portkey.aws.medialive/pass-through-settings (clojure.spec.alpha/keys :req-un [] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.medialive.media-connect-flow/flow-arn (clojure.spec.alpha/and :portkey.aws.medialive/string))
(clojure.spec.alpha/def :portkey.aws.medialive/media-connect-flow (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.medialive.media-connect-flow/flow-arn]))

(clojure.spec.alpha/def :portkey.aws.medialive/video-description-scaling-behavior #{"STRETCH_TO_OUTPUT" :default :stretch-to-output "DEFAULT"})

(clojure.spec.alpha/def :portkey.aws.medialive/scte-35-archive-allowed-flag #{"ARCHIVE_ALLOWED" :archive-allowed "ARCHIVE_NOT_ALLOWED" :archive-not-allowed})

(clojure.spec.alpha/def :portkey.aws.medialive/eac-3-attenuation-control #{"ATTENUATE_3_DB" "NONE" :attenuate-3-db :none})

(clojure.spec.alpha/def :portkey.aws.medialive/h-264-framerate-control #{"SPECIFIED" "INITIALIZE_FROM_SOURCE" :specified :initialize-from-source})

(clojure.spec.alpha/def :portkey.aws.medialive/aac-input-type #{"NORMAL" "BROADCASTER_MIXED_AD" :normal :broadcaster-mixed-ad})

(clojure.spec.alpha/def :portkey.aws.medialive.channel/input-attachments (clojure.spec.alpha/and :portkey.aws.medialive/list-of-input-attachment))
(clojure.spec.alpha/def :portkey.aws.medialive.channel/pipelines-running-count (clojure.spec.alpha/and :portkey.aws.medialive/integer))
(clojure.spec.alpha/def :portkey.aws.medialive.channel/role-arn (clojure.spec.alpha/and :portkey.aws.medialive/string))
(clojure.spec.alpha/def :portkey.aws.medialive.channel/egress-endpoints (clojure.spec.alpha/and :portkey.aws.medialive/list-of-channel-egress-endpoint))
(clojure.spec.alpha/def :portkey.aws.medialive.channel/arn (clojure.spec.alpha/and :portkey.aws.medialive/string))
(clojure.spec.alpha/def :portkey.aws.medialive.channel/state (clojure.spec.alpha/and :portkey.aws.medialive/channel-state))
(clojure.spec.alpha/def :portkey.aws.medialive.channel/destinations (clojure.spec.alpha/and :portkey.aws.medialive/list-of-output-destination))
(clojure.spec.alpha/def :portkey.aws.medialive.channel/name (clojure.spec.alpha/and :portkey.aws.medialive/string))
(clojure.spec.alpha/def :portkey.aws.medialive.channel/id (clojure.spec.alpha/and :portkey.aws.medialive/string))
(clojure.spec.alpha/def :portkey.aws.medialive/channel (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.medialive.channel/input-attachments :portkey.aws.medialive.channel/pipelines-running-count :portkey.aws.medialive/log-level :portkey.aws.medialive.channel/role-arn :portkey.aws.medialive/tags :portkey.aws.medialive.channel/egress-endpoints :portkey.aws.medialive/encoder-settings :portkey.aws.medialive.channel/arn :portkey.aws.medialive/input-specification :portkey.aws.medialive.channel/state :portkey.aws.medialive.channel/destinations :portkey.aws.medialive.channel/name :portkey.aws.medialive.channel/id]))

(clojure.spec.alpha/def :portkey.aws.medialive.update-input-security-group-result-model/security-group (clojure.spec.alpha/and :portkey.aws.medialive/input-security-group))
(clojure.spec.alpha/def :portkey.aws.medialive/update-input-security-group-result-model (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.medialive.update-input-security-group-result-model/security-group]))

(clojure.spec.alpha/def :portkey.aws.medialive.timecode-config/source (clojure.spec.alpha/and :portkey.aws.medialive/timecode-config-source))
(clojure.spec.alpha/def :portkey.aws.medialive.timecode-config/sync-threshold (clojure.spec.alpha/and :portkey.aws.medialive/integer-min-1-max-1000000))
(clojure.spec.alpha/def :portkey.aws.medialive/timecode-config (clojure.spec.alpha/keys :req-un [:portkey.aws.medialive.timecode-config/source] :opt-un [:portkey.aws.medialive.timecode-config/sync-threshold]))

(clojure.spec.alpha/def :portkey.aws.medialive.dvb-sub-destination-settings/outline-color (clojure.spec.alpha/and :portkey.aws.medialive/dvb-sub-destination-outline-color))
(clojure.spec.alpha/def :portkey.aws.medialive.dvb-sub-destination-settings/outline-size (clojure.spec.alpha/and :portkey.aws.medialive/integer-min-0-max-10))
(clojure.spec.alpha/def :portkey.aws.medialive.dvb-sub-destination-settings/shadow-color (clojure.spec.alpha/and :portkey.aws.medialive/dvb-sub-destination-shadow-color))
(clojure.spec.alpha/def :portkey.aws.medialive.dvb-sub-destination-settings/shadow-opacity (clojure.spec.alpha/and :portkey.aws.medialive/integer-min-0-max-255))
(clojure.spec.alpha/def :portkey.aws.medialive.dvb-sub-destination-settings/shadow-y-offset (clojure.spec.alpha/and :portkey.aws.medialive/integer))
(clojure.spec.alpha/def :portkey.aws.medialive.dvb-sub-destination-settings/background-color (clojure.spec.alpha/and :portkey.aws.medialive/dvb-sub-destination-background-color))
(clojure.spec.alpha/def :portkey.aws.medialive.dvb-sub-destination-settings/teletext-grid-control (clojure.spec.alpha/and :portkey.aws.medialive/dvb-sub-destination-teletext-grid-control))
(clojure.spec.alpha/def :portkey.aws.medialive.dvb-sub-destination-settings/y-position (clojure.spec.alpha/and :portkey.aws.medialive/integer-min-0))
(clojure.spec.alpha/def :portkey.aws.medialive.dvb-sub-destination-settings/font-color (clojure.spec.alpha/and :portkey.aws.medialive/dvb-sub-destination-font-color))
(clojure.spec.alpha/def :portkey.aws.medialive.dvb-sub-destination-settings/x-position (clojure.spec.alpha/and :portkey.aws.medialive/integer-min-0))
(clojure.spec.alpha/def :portkey.aws.medialive.dvb-sub-destination-settings/font (clojure.spec.alpha/and :portkey.aws.medialive/input-location))
(clojure.spec.alpha/def :portkey.aws.medialive.dvb-sub-destination-settings/font-resolution (clojure.spec.alpha/and :portkey.aws.medialive/integer-min-96-max-600))
(clojure.spec.alpha/def :portkey.aws.medialive.dvb-sub-destination-settings/font-size (clojure.spec.alpha/and :portkey.aws.medialive/string))
(clojure.spec.alpha/def :portkey.aws.medialive.dvb-sub-destination-settings/background-opacity (clojure.spec.alpha/and :portkey.aws.medialive/integer-min-0-max-255))
(clojure.spec.alpha/def :portkey.aws.medialive.dvb-sub-destination-settings/font-opacity (clojure.spec.alpha/and :portkey.aws.medialive/integer-min-0-max-255))
(clojure.spec.alpha/def :portkey.aws.medialive.dvb-sub-destination-settings/shadow-x-offset (clojure.spec.alpha/and :portkey.aws.medialive/integer))
(clojure.spec.alpha/def :portkey.aws.medialive.dvb-sub-destination-settings/alignment (clojure.spec.alpha/and :portkey.aws.medialive/dvb-sub-destination-alignment))
(clojure.spec.alpha/def :portkey.aws.medialive/dvb-sub-destination-settings (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.medialive.dvb-sub-destination-settings/outline-color :portkey.aws.medialive.dvb-sub-destination-settings/outline-size :portkey.aws.medialive.dvb-sub-destination-settings/shadow-color :portkey.aws.medialive.dvb-sub-destination-settings/shadow-opacity :portkey.aws.medialive.dvb-sub-destination-settings/shadow-y-offset :portkey.aws.medialive.dvb-sub-destination-settings/background-color :portkey.aws.medialive.dvb-sub-destination-settings/teletext-grid-control :portkey.aws.medialive.dvb-sub-destination-settings/y-position :portkey.aws.medialive.dvb-sub-destination-settings/font-color :portkey.aws.medialive.dvb-sub-destination-settings/x-position :portkey.aws.medialive.dvb-sub-destination-settings/font :portkey.aws.medialive.dvb-sub-destination-settings/font-resolution :portkey.aws.medialive.dvb-sub-destination-settings/font-size :portkey.aws.medialive.dvb-sub-destination-settings/background-opacity :portkey.aws.medialive.dvb-sub-destination-settings/font-opacity :portkey.aws.medialive.dvb-sub-destination-settings/shadow-x-offset :portkey.aws.medialive.dvb-sub-destination-settings/alignment]))

(clojure.spec.alpha/def :portkey.aws.medialive/embedded-convert-608-to-708 #{"DISABLED" "UPCONVERT" :disabled :upconvert})

(clojure.spec.alpha/def :portkey.aws.medialive.bad-gateway-exception/message (clojure.spec.alpha/and :portkey.aws.medialive/string))
(clojure.spec.alpha/def :portkey.aws.medialive/bad-gateway-exception (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.medialive.bad-gateway-exception/message]))

(clojure.spec.alpha/def :portkey.aws.medialive/audio-only-hls-track-type #{"ALTERNATE_AUDIO_AUTO_SELECT_DEFAULT" "ALTERNATE_AUDIO_AUTO_SELECT" :audio-only-variant-stream :alternate-audio-auto-select-default "ALTERNATE_AUDIO_NOT_AUTO_SELECT" "AUDIO_ONLY_VARIANT_STREAM" :alternate-audio-auto-select :alternate-audio-not-auto-select})

(clojure.spec.alpha/def :portkey.aws.medialive/h-264-color-metadata #{:insert :ignore "INSERT" "IGNORE"})

(clojure.spec.alpha/def :portkey.aws.medialive/string-min-1 (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__21110__auto__] (clojure.core/<= 1 (clojure.core/count s__21110__auto__)))))

(clojure.spec.alpha/def :portkey.aws.medialive.describe-offering-response/duration-units (clojure.spec.alpha/and :portkey.aws.medialive/offering-duration-units))
(clojure.spec.alpha/def :portkey.aws.medialive.describe-offering-response/currency-code (clojure.spec.alpha/and :portkey.aws.medialive/string))
(clojure.spec.alpha/def :portkey.aws.medialive.describe-offering-response/offering-description (clojure.spec.alpha/and :portkey.aws.medialive/string))
(clojure.spec.alpha/def :portkey.aws.medialive.describe-offering-response/resource-specification (clojure.spec.alpha/and :portkey.aws.medialive/reservation-resource-specification))
(clojure.spec.alpha/def :portkey.aws.medialive.describe-offering-response/fixed-price (clojure.spec.alpha/and :portkey.aws.medialive/double))
(clojure.spec.alpha/def :portkey.aws.medialive.describe-offering-response/offering-id (clojure.spec.alpha/and :portkey.aws.medialive/string))
(clojure.spec.alpha/def :portkey.aws.medialive.describe-offering-response/duration (clojure.spec.alpha/and :portkey.aws.medialive/integer))
(clojure.spec.alpha/def :portkey.aws.medialive.describe-offering-response/usage-price (clojure.spec.alpha/and :portkey.aws.medialive/double))
(clojure.spec.alpha/def :portkey.aws.medialive.describe-offering-response/arn (clojure.spec.alpha/and :portkey.aws.medialive/string))
(clojure.spec.alpha/def :portkey.aws.medialive.describe-offering-response/region (clojure.spec.alpha/and :portkey.aws.medialive/string))
(clojure.spec.alpha/def :portkey.aws.medialive/describe-offering-response (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.medialive.describe-offering-response/duration-units :portkey.aws.medialive.describe-offering-response/currency-code :portkey.aws.medialive.describe-offering-response/offering-description :portkey.aws.medialive.describe-offering-response/resource-specification :portkey.aws.medialive.describe-offering-response/fixed-price :portkey.aws.medialive.describe-offering-response/offering-id :portkey.aws.medialive.describe-offering-response/duration :portkey.aws.medialive.describe-offering-response/usage-price :portkey.aws.medialive.describe-offering-response/arn :portkey.aws.medialive/offering-type :portkey.aws.medialive.describe-offering-response/region]))

(clojure.spec.alpha/def :portkey.aws.medialive/max-results (clojure.spec.alpha/int-in 1 1000))

(clojure.spec.alpha/def :portkey.aws.medialive.describe-schedule-response/next-token (clojure.spec.alpha/and :portkey.aws.medialive/string))
(clojure.spec.alpha/def :portkey.aws.medialive.describe-schedule-response/schedule-actions (clojure.spec.alpha/and :portkey.aws.medialive/list-of-schedule-action))
(clojure.spec.alpha/def :portkey.aws.medialive/describe-schedule-response (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.medialive.describe-schedule-response/next-token :portkey.aws.medialive.describe-schedule-response/schedule-actions]))

(clojure.spec.alpha/def :portkey.aws.medialive.blackout-slate/blackout-slate-image (clojure.spec.alpha/and :portkey.aws.medialive/input-location))
(clojure.spec.alpha/def :portkey.aws.medialive.blackout-slate/network-end-blackout (clojure.spec.alpha/and :portkey.aws.medialive/blackout-slate-network-end-blackout))
(clojure.spec.alpha/def :portkey.aws.medialive.blackout-slate/network-end-blackout-image (clojure.spec.alpha/and :portkey.aws.medialive/input-location))
(clojure.spec.alpha/def :portkey.aws.medialive.blackout-slate/network-id (clojure.spec.alpha/and :portkey.aws.medialive/string-min-34-max-34))
(clojure.spec.alpha/def :portkey.aws.medialive.blackout-slate/state (clojure.spec.alpha/and :portkey.aws.medialive/blackout-slate-state))
(clojure.spec.alpha/def :portkey.aws.medialive/blackout-slate (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.medialive.blackout-slate/blackout-slate-image :portkey.aws.medialive.blackout-slate/network-end-blackout :portkey.aws.medialive.blackout-slate/network-end-blackout-image :portkey.aws.medialive.blackout-slate/network-id :portkey.aws.medialive.blackout-slate/state]))

(clojure.spec.alpha/def :portkey.aws.medialive.ac-3-settings/bitrate (clojure.spec.alpha/and :portkey.aws.medialive/double))
(clojure.spec.alpha/def :portkey.aws.medialive.ac-3-settings/bitstream-mode (clojure.spec.alpha/and :portkey.aws.medialive/ac-3-bitstream-mode))
(clojure.spec.alpha/def :portkey.aws.medialive.ac-3-settings/coding-mode (clojure.spec.alpha/and :portkey.aws.medialive/ac-3-coding-mode))
(clojure.spec.alpha/def :portkey.aws.medialive.ac-3-settings/dialnorm (clojure.spec.alpha/and :portkey.aws.medialive/integer-min-1-max-31))
(clojure.spec.alpha/def :portkey.aws.medialive.ac-3-settings/drc-profile (clojure.spec.alpha/and :portkey.aws.medialive/ac-3-drc-profile))
(clojure.spec.alpha/def :portkey.aws.medialive.ac-3-settings/lfe-filter (clojure.spec.alpha/and :portkey.aws.medialive/ac-3-lfe-filter))
(clojure.spec.alpha/def :portkey.aws.medialive.ac-3-settings/metadata-control (clojure.spec.alpha/and :portkey.aws.medialive/ac-3-metadata-control))
(clojure.spec.alpha/def :portkey.aws.medialive/ac-3-settings (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.medialive.ac-3-settings/bitrate :portkey.aws.medialive.ac-3-settings/bitstream-mode :portkey.aws.medialive.ac-3-settings/coding-mode :portkey.aws.medialive.ac-3-settings/dialnorm :portkey.aws.medialive.ac-3-settings/drc-profile :portkey.aws.medialive.ac-3-settings/lfe-filter :portkey.aws.medialive.ac-3-settings/metadata-control]))

(clojure.spec.alpha/def :portkey.aws.medialive.gateway-timeout-exception/message (clojure.spec.alpha/and :portkey.aws.medialive/string))
(clojure.spec.alpha/def :portkey.aws.medialive/gateway-timeout-exception (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.medialive.gateway-timeout-exception/message]))

(clojure.spec.alpha/def :portkey.aws.medialive.ms-smooth-group-settings/fragment-length (clojure.spec.alpha/and :portkey.aws.medialive/integer-min-1))
(clojure.spec.alpha/def :portkey.aws.medialive.ms-smooth-group-settings/input-loss-action (clojure.spec.alpha/and :portkey.aws.medialive/input-loss-action-for-ms-smooth-out))
(clojure.spec.alpha/def :portkey.aws.medialive.ms-smooth-group-settings/event-stop-behavior (clojure.spec.alpha/and :portkey.aws.medialive/smooth-group-event-stop-behavior))
(clojure.spec.alpha/def :portkey.aws.medialive.ms-smooth-group-settings/acquisition-point-id (clojure.spec.alpha/and :portkey.aws.medialive/string))
(clojure.spec.alpha/def :portkey.aws.medialive.ms-smooth-group-settings/stream-manifest-behavior (clojure.spec.alpha/and :portkey.aws.medialive/smooth-group-stream-manifest-behavior))
(clojure.spec.alpha/def :portkey.aws.medialive.ms-smooth-group-settings/destination (clojure.spec.alpha/and :portkey.aws.medialive/output-location-ref))
(clojure.spec.alpha/def :portkey.aws.medialive.ms-smooth-group-settings/num-retries (clojure.spec.alpha/and :portkey.aws.medialive/integer-min-0))
(clojure.spec.alpha/def :portkey.aws.medialive.ms-smooth-group-settings/filecache-duration (clojure.spec.alpha/and :portkey.aws.medialive/integer-min-0))
(clojure.spec.alpha/def :portkey.aws.medialive.ms-smooth-group-settings/sparse-track-type (clojure.spec.alpha/and :portkey.aws.medialive/smooth-group-sparse-track-type))
(clojure.spec.alpha/def :portkey.aws.medialive.ms-smooth-group-settings/certificate-mode (clojure.spec.alpha/and :portkey.aws.medialive/smooth-group-certificate-mode))
(clojure.spec.alpha/def :portkey.aws.medialive.ms-smooth-group-settings/send-delay-ms (clojure.spec.alpha/and :portkey.aws.medialive/integer-min-0-max-10000))
(clojure.spec.alpha/def :portkey.aws.medialive.ms-smooth-group-settings/event-id-mode (clojure.spec.alpha/and :portkey.aws.medialive/smooth-group-event-id-mode))
(clojure.spec.alpha/def :portkey.aws.medialive.ms-smooth-group-settings/segmentation-mode (clojure.spec.alpha/and :portkey.aws.medialive/smooth-group-segmentation-mode))
(clojure.spec.alpha/def :portkey.aws.medialive.ms-smooth-group-settings/audio-only-timecode-control (clojure.spec.alpha/and :portkey.aws.medialive/smooth-group-audio-only-timecode-control))
(clojure.spec.alpha/def :portkey.aws.medialive.ms-smooth-group-settings/timestamp-offset (clojure.spec.alpha/and :portkey.aws.medialive/string))
(clojure.spec.alpha/def :portkey.aws.medialive.ms-smooth-group-settings/event-id (clojure.spec.alpha/and :portkey.aws.medialive/string))
(clojure.spec.alpha/def :portkey.aws.medialive.ms-smooth-group-settings/connection-retry-interval (clojure.spec.alpha/and :portkey.aws.medialive/integer-min-0))
(clojure.spec.alpha/def :portkey.aws.medialive.ms-smooth-group-settings/timestamp-offset-mode (clojure.spec.alpha/and :portkey.aws.medialive/smooth-group-timestamp-offset-mode))
(clojure.spec.alpha/def :portkey.aws.medialive.ms-smooth-group-settings/restart-delay (clojure.spec.alpha/and :portkey.aws.medialive/integer-min-0))
(clojure.spec.alpha/def :portkey.aws.medialive/ms-smooth-group-settings (clojure.spec.alpha/keys :req-un [:portkey.aws.medialive.ms-smooth-group-settings/destination] :opt-un [:portkey.aws.medialive.ms-smooth-group-settings/fragment-length :portkey.aws.medialive.ms-smooth-group-settings/input-loss-action :portkey.aws.medialive.ms-smooth-group-settings/event-stop-behavior :portkey.aws.medialive.ms-smooth-group-settings/acquisition-point-id :portkey.aws.medialive.ms-smooth-group-settings/stream-manifest-behavior :portkey.aws.medialive.ms-smooth-group-settings/num-retries :portkey.aws.medialive.ms-smooth-group-settings/filecache-duration :portkey.aws.medialive.ms-smooth-group-settings/sparse-track-type :portkey.aws.medialive.ms-smooth-group-settings/certificate-mode :portkey.aws.medialive.ms-smooth-group-settings/send-delay-ms :portkey.aws.medialive.ms-smooth-group-settings/event-id-mode :portkey.aws.medialive.ms-smooth-group-settings/segmentation-mode :portkey.aws.medialive.ms-smooth-group-settings/audio-only-timecode-control :portkey.aws.medialive.ms-smooth-group-settings/timestamp-offset :portkey.aws.medialive.ms-smooth-group-settings/event-id :portkey.aws.medialive.ms-smooth-group-settings/connection-retry-interval :portkey.aws.medialive.ms-smooth-group-settings/timestamp-offset-mode :portkey.aws.medialive.ms-smooth-group-settings/restart-delay]))

(clojure.spec.alpha/def :portkey.aws.medialive/integer-min-0-max-7 (clojure.spec.alpha/int-in 0 7))

(clojure.spec.alpha/def :portkey.aws.medialive/h-264-entropy-encoding #{"CABAC" :cabac "CAVLC" :cavlc})

(clojure.spec.alpha/def :portkey.aws.medialive.output/audio-description-names (clojure.spec.alpha/and :portkey.aws.medialive/list-of-string))
(clojure.spec.alpha/def :portkey.aws.medialive.output/caption-description-names (clojure.spec.alpha/and :portkey.aws.medialive/list-of-string))
(clojure.spec.alpha/def :portkey.aws.medialive.output/output-name (clojure.spec.alpha/and :portkey.aws.medialive/string-min-1-max-255))
(clojure.spec.alpha/def :portkey.aws.medialive.output/video-description-name (clojure.spec.alpha/and :portkey.aws.medialive/string))
(clojure.spec.alpha/def :portkey.aws.medialive/output (clojure.spec.alpha/keys :req-un [:portkey.aws.medialive/output-settings] :opt-un [:portkey.aws.medialive.output/audio-description-names :portkey.aws.medialive.output/caption-description-names :portkey.aws.medialive.output/output-name :portkey.aws.medialive.output/video-description-name]))

(clojure.spec.alpha/def :portkey.aws.medialive.purchase-offering/count (clojure.spec.alpha/and :portkey.aws.medialive/integer-min-1))
(clojure.spec.alpha/def :portkey.aws.medialive.purchase-offering/name (clojure.spec.alpha/and :portkey.aws.medialive/string))
(clojure.spec.alpha/def :portkey.aws.medialive.purchase-offering/request-id (clojure.spec.alpha/and :portkey.aws.medialive/string))
(clojure.spec.alpha/def :portkey.aws.medialive.purchase-offering/start (clojure.spec.alpha/and :portkey.aws.medialive/string))
(clojure.spec.alpha/def :portkey.aws.medialive/purchase-offering (clojure.spec.alpha/keys :req-un [:portkey.aws.medialive.purchase-offering/count] :opt-un [:portkey.aws.medialive.purchase-offering/name :portkey.aws.medialive.purchase-offering/request-id :portkey.aws.medialive.purchase-offering/start]))

(clojure.spec.alpha/def :portkey.aws.medialive/burn-in-shadow-color #{:white "NONE" "WHITE" "BLACK" :none :black})

(clojure.spec.alpha/def :portkey.aws.medialive.batch-update-schedule-result/creates (clojure.spec.alpha/and :portkey.aws.medialive/batch-schedule-action-create-result))
(clojure.spec.alpha/def :portkey.aws.medialive.batch-update-schedule-result/deletes (clojure.spec.alpha/and :portkey.aws.medialive/batch-schedule-action-delete-result))
(clojure.spec.alpha/def :portkey.aws.medialive/batch-update-schedule-result (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.medialive.batch-update-schedule-result/creates :portkey.aws.medialive.batch-update-schedule-result/deletes]))

(clojure.spec.alpha/def :portkey.aws.medialive/audio-language-selection-policy #{:strict :loose "LOOSE" "STRICT"})

(clojure.spec.alpha/def :portkey.aws.medialive/integer clojure.core/int?)

(clojure.spec.alpha/def :portkey.aws.medialive.aac-settings/rate-control-mode (clojure.spec.alpha/and :portkey.aws.medialive/aac-rate-control-mode))
(clojure.spec.alpha/def :portkey.aws.medialive.aac-settings/coding-mode (clojure.spec.alpha/and :portkey.aws.medialive/aac-coding-mode))
(clojure.spec.alpha/def :portkey.aws.medialive.aac-settings/input-type (clojure.spec.alpha/and :portkey.aws.medialive/aac-input-type))
(clojure.spec.alpha/def :portkey.aws.medialive.aac-settings/sample-rate (clojure.spec.alpha/and :portkey.aws.medialive/double))
(clojure.spec.alpha/def :portkey.aws.medialive.aac-settings/spec (clojure.spec.alpha/and :portkey.aws.medialive/aac-spec))
(clojure.spec.alpha/def :portkey.aws.medialive.aac-settings/vbr-quality (clojure.spec.alpha/and :portkey.aws.medialive/aac-vbr-quality))
(clojure.spec.alpha/def :portkey.aws.medialive.aac-settings/profile (clojure.spec.alpha/and :portkey.aws.medialive/aac-profile))
(clojure.spec.alpha/def :portkey.aws.medialive.aac-settings/raw-format (clojure.spec.alpha/and :portkey.aws.medialive/aac-raw-format))
(clojure.spec.alpha/def :portkey.aws.medialive.aac-settings/bitrate (clojure.spec.alpha/and :portkey.aws.medialive/double))
(clojure.spec.alpha/def :portkey.aws.medialive/aac-settings (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.medialive.aac-settings/rate-control-mode :portkey.aws.medialive.aac-settings/coding-mode :portkey.aws.medialive.aac-settings/input-type :portkey.aws.medialive.aac-settings/sample-rate :portkey.aws.medialive.aac-settings/spec :portkey.aws.medialive.aac-settings/vbr-quality :portkey.aws.medialive.aac-settings/profile :portkey.aws.medialive.aac-settings/raw-format :portkey.aws.medialive.aac-settings/bitrate]))

(clojure.spec.alpha/def :portkey.aws.medialive/integer-min-1 (clojure.spec.alpha/int-in 1 Long/MAX_VALUE))

(clojure.spec.alpha/def :portkey.aws.medialive/list-of-caption-selector (clojure.spec.alpha/coll-of :portkey.aws.medialive/caption-selector))

(clojure.spec.alpha/def :portkey.aws.medialive.resource-conflict/message (clojure.spec.alpha/and :portkey.aws.medialive/string))
(clojure.spec.alpha/def :portkey.aws.medialive/resource-conflict (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.medialive.resource-conflict/message]))

(clojure.spec.alpha/def :portkey.aws.medialive/integer-min-0-max-4294967295 clojure.core/int?)

(clojure.spec.alpha/def :portkey.aws.medialive.rtmp-group-settings/cache-full-behavior (clojure.spec.alpha/and :portkey.aws.medialive/rtmp-cache-full-behavior))
(clojure.spec.alpha/def :portkey.aws.medialive.rtmp-group-settings/cache-length (clojure.spec.alpha/and :portkey.aws.medialive/integer-min-30))
(clojure.spec.alpha/def :portkey.aws.medialive.rtmp-group-settings/caption-data (clojure.spec.alpha/and :portkey.aws.medialive/rtmp-caption-data))
(clojure.spec.alpha/def :portkey.aws.medialive.rtmp-group-settings/input-loss-action (clojure.spec.alpha/and :portkey.aws.medialive/input-loss-action-for-rtmp-out))
(clojure.spec.alpha/def :portkey.aws.medialive.rtmp-group-settings/restart-delay (clojure.spec.alpha/and :portkey.aws.medialive/integer-min-0))
(clojure.spec.alpha/def :portkey.aws.medialive/rtmp-group-settings (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.medialive/authentication-scheme :portkey.aws.medialive.rtmp-group-settings/cache-full-behavior :portkey.aws.medialive.rtmp-group-settings/cache-length :portkey.aws.medialive.rtmp-group-settings/caption-data :portkey.aws.medialive.rtmp-group-settings/input-loss-action :portkey.aws.medialive.rtmp-group-settings/restart-delay]))

(clojure.spec.alpha/def :portkey.aws.medialive/burn-in-alignment #{"LEFT" "CENTERED" :smart :centered "SMART" :left})

(clojure.spec.alpha/def :portkey.aws.medialive/list-of-caption-description (clojure.spec.alpha/coll-of :portkey.aws.medialive/caption-description))

(clojure.spec.alpha/def :portkey.aws.medialive/embedded-destination-settings (clojure.spec.alpha/keys :req-un [] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.medialive/timestamp-unix clojure.core/inst?)

(clojure.spec.alpha/def :portkey.aws.medialive.caption-selector/language-code (clojure.spec.alpha/and :portkey.aws.medialive/string))
(clojure.spec.alpha/def :portkey.aws.medialive.caption-selector/name (clojure.spec.alpha/and :portkey.aws.medialive/string-min-1))
(clojure.spec.alpha/def :portkey.aws.medialive.caption-selector/selector-settings (clojure.spec.alpha/and :portkey.aws.medialive/caption-selector-settings))
(clojure.spec.alpha/def :portkey.aws.medialive/caption-selector (clojure.spec.alpha/keys :req-un [:portkey.aws.medialive.caption-selector/name] :opt-un [:portkey.aws.medialive.caption-selector/language-code :portkey.aws.medialive.caption-selector/selector-settings]))

(clojure.spec.alpha/def :portkey.aws.medialive/embedded-plus-scte-20-destination-settings (clojure.spec.alpha/keys :req-un [] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.medialive.channel-egress-endpoint/source-ip (clojure.spec.alpha/and :portkey.aws.medialive/string))
(clojure.spec.alpha/def :portkey.aws.medialive/channel-egress-endpoint (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.medialive.channel-egress-endpoint/source-ip]))

(clojure.spec.alpha/def :portkey.aws.medialive.hls-group-settings/segment-length (clojure.spec.alpha/and :portkey.aws.medialive/integer-min-1))
(clojure.spec.alpha/def :portkey.aws.medialive.hls-group-settings/ts-file-mode (clojure.spec.alpha/and :portkey.aws.medialive/hls-ts-file-mode))
(clojure.spec.alpha/def :portkey.aws.medialive.hls-group-settings/timestamp-delta-milliseconds (clojure.spec.alpha/and :portkey.aws.medialive/integer-min-0))
(clojure.spec.alpha/def :portkey.aws.medialive.hls-group-settings/program-date-time-period (clojure.spec.alpha/and :portkey.aws.medialive/integer-min-0-max-3600))
(clojure.spec.alpha/def :portkey.aws.medialive.hls-group-settings/constant-iv (clojure.spec.alpha/and :portkey.aws.medialive/string-min-32-max-32))
(clojure.spec.alpha/def :portkey.aws.medialive.hls-group-settings/key-format-versions (clojure.spec.alpha/and :portkey.aws.medialive/string))
(clojure.spec.alpha/def :portkey.aws.medialive.hls-group-settings/input-loss-action (clojure.spec.alpha/and :portkey.aws.medialive/input-loss-action-for-hls-out))
(clojure.spec.alpha/def :portkey.aws.medialive.hls-group-settings/ad-markers (clojure.spec.alpha/and :portkey.aws.medialive/list-of-hls-ad-markers))
(clojure.spec.alpha/def :portkey.aws.medialive.hls-group-settings/destination (clojure.spec.alpha/and :portkey.aws.medialive/output-location-ref))
(clojure.spec.alpha/def :portkey.aws.medialive.hls-group-settings/caption-language-mappings (clojure.spec.alpha/and :portkey.aws.medialive/list-of-caption-language-mapping))
(clojure.spec.alpha/def :portkey.aws.medialive.hls-group-settings/timed-metadata-id-3-frame (clojure.spec.alpha/and :portkey.aws.medialive/hls-timed-metadata-id-3-frame))
(clojure.spec.alpha/def :portkey.aws.medialive.hls-group-settings/mode (clojure.spec.alpha/and :portkey.aws.medialive/hls-mode))
(clojure.spec.alpha/def :portkey.aws.medialive.hls-group-settings/directory-structure (clojure.spec.alpha/and :portkey.aws.medialive/hls-directory-structure))
(clojure.spec.alpha/def :portkey.aws.medialive.hls-group-settings/encryption-type (clojure.spec.alpha/and :portkey.aws.medialive/hls-encryption-type))
(clojure.spec.alpha/def :portkey.aws.medialive.hls-group-settings/index-n-segments (clojure.spec.alpha/and :portkey.aws.medialive/integer-min-3))
(clojure.spec.alpha/def :portkey.aws.medialive.hls-group-settings/keep-segments (clojure.spec.alpha/and :portkey.aws.medialive/integer-min-1))
(clojure.spec.alpha/def :portkey.aws.medialive.hls-group-settings/min-segment-length (clojure.spec.alpha/and :portkey.aws.medialive/integer-min-0))
(clojure.spec.alpha/def :portkey.aws.medialive.hls-group-settings/iv-in-manifest (clojure.spec.alpha/and :portkey.aws.medialive/hls-iv-in-manifest))
(clojure.spec.alpha/def :portkey.aws.medialive.hls-group-settings/stream-inf-resolution (clojure.spec.alpha/and :portkey.aws.medialive/hls-stream-inf-resolution))
(clojure.spec.alpha/def :portkey.aws.medialive.hls-group-settings/redundant-manifest (clojure.spec.alpha/and :portkey.aws.medialive/hls-redundant-manifest))
(clojure.spec.alpha/def :portkey.aws.medialive.hls-group-settings/program-date-time (clojure.spec.alpha/and :portkey.aws.medialive/hls-program-date-time))
(clojure.spec.alpha/def :portkey.aws.medialive.hls-group-settings/i-frame-only-playlists (clojure.spec.alpha/and :portkey.aws.medialive/i-frame-only-playlist-type))
(clojure.spec.alpha/def :portkey.aws.medialive.hls-group-settings/output-selection (clojure.spec.alpha/and :portkey.aws.medialive/hls-output-selection))
(clojure.spec.alpha/def :portkey.aws.medialive.hls-group-settings/base-url-content (clojure.spec.alpha/and :portkey.aws.medialive/string))
(clojure.spec.alpha/def :portkey.aws.medialive.hls-group-settings/caption-language-setting (clojure.spec.alpha/and :portkey.aws.medialive/hls-caption-language-setting))
(clojure.spec.alpha/def :portkey.aws.medialive.hls-group-settings/manifest-duration-format (clojure.spec.alpha/and :portkey.aws.medialive/hls-manifest-duration-format))
(clojure.spec.alpha/def :portkey.aws.medialive.hls-group-settings/segmentation-mode (clojure.spec.alpha/and :portkey.aws.medialive/hls-segmentation-mode))
(clojure.spec.alpha/def :portkey.aws.medialive.hls-group-settings/timed-metadata-id-3-period (clojure.spec.alpha/and :portkey.aws.medialive/integer-min-0))
(clojure.spec.alpha/def :portkey.aws.medialive.hls-group-settings/manifest-compression (clojure.spec.alpha/and :portkey.aws.medialive/hls-manifest-compression))
(clojure.spec.alpha/def :portkey.aws.medialive.hls-group-settings/segments-per-subdirectory (clojure.spec.alpha/and :portkey.aws.medialive/integer-min-1))
(clojure.spec.alpha/def :portkey.aws.medialive.hls-group-settings/key-format (clojure.spec.alpha/and :portkey.aws.medialive/string))
(clojure.spec.alpha/def :portkey.aws.medialive.hls-group-settings/iv-source (clojure.spec.alpha/and :portkey.aws.medialive/hls-iv-source))
(clojure.spec.alpha/def :portkey.aws.medialive.hls-group-settings/codec-specification (clojure.spec.alpha/and :portkey.aws.medialive/hls-codec-specification))
(clojure.spec.alpha/def :portkey.aws.medialive.hls-group-settings/base-url-manifest (clojure.spec.alpha/and :portkey.aws.medialive/string))
(clojure.spec.alpha/def :portkey.aws.medialive.hls-group-settings/client-cache (clojure.spec.alpha/and :portkey.aws.medialive/hls-client-cache))
(clojure.spec.alpha/def :portkey.aws.medialive/hls-group-settings (clojure.spec.alpha/keys :req-un [:portkey.aws.medialive.hls-group-settings/destination] :opt-un [:portkey.aws.medialive.hls-group-settings/segment-length :portkey.aws.medialive.hls-group-settings/ts-file-mode :portkey.aws.medialive.hls-group-settings/timestamp-delta-milliseconds :portkey.aws.medialive.hls-group-settings/program-date-time-period :portkey.aws.medialive.hls-group-settings/constant-iv :portkey.aws.medialive.hls-group-settings/key-format-versions :portkey.aws.medialive.hls-group-settings/input-loss-action :portkey.aws.medialive.hls-group-settings/ad-markers :portkey.aws.medialive.hls-group-settings/caption-language-mappings :portkey.aws.medialive.hls-group-settings/timed-metadata-id-3-frame :portkey.aws.medialive.hls-group-settings/mode :portkey.aws.medialive.hls-group-settings/directory-structure :portkey.aws.medialive.hls-group-settings/encryption-type :portkey.aws.medialive.hls-group-settings/index-n-segments :portkey.aws.medialive.hls-group-settings/keep-segments :portkey.aws.medialive.hls-group-settings/min-segment-length :portkey.aws.medialive.hls-group-settings/iv-in-manifest :portkey.aws.medialive.hls-group-settings/stream-inf-resolution :portkey.aws.medialive/hls-cdn-settings :portkey.aws.medialive.hls-group-settings/redundant-manifest :portkey.aws.medialive.hls-group-settings/program-date-time :portkey.aws.medialive.hls-group-settings/i-frame-only-playlists :portkey.aws.medialive.hls-group-settings/output-selection :portkey.aws.medialive.hls-group-settings/base-url-content :portkey.aws.medialive.hls-group-settings/caption-language-setting :portkey.aws.medialive.hls-group-settings/manifest-duration-format :portkey.aws.medialive.hls-group-settings/segmentation-mode :portkey.aws.medialive.hls-group-settings/timed-metadata-id-3-period :portkey.aws.medialive.hls-group-settings/manifest-compression :portkey.aws.medialive.hls-group-settings/segments-per-subdirectory :portkey.aws.medialive.hls-group-settings/key-format :portkey.aws.medialive.hls-group-settings/iv-source :portkey.aws.medialive.hls-group-settings/codec-specification :portkey.aws.medialive/key-provider-settings :portkey.aws.medialive.hls-group-settings/base-url-manifest :portkey.aws.medialive.hls-group-settings/client-cache]))

(clojure.spec.alpha/def :portkey.aws.medialive/input-loss-action-for-ms-smooth-out #{:emit-output :pause-output "PAUSE_OUTPUT" "EMIT_OUTPUT"})

(clojure.spec.alpha/def :portkey.aws.medialive.dvb-nit-settings/network-id (clojure.spec.alpha/and :portkey.aws.medialive/integer-min-0-max-65536))
(clojure.spec.alpha/def :portkey.aws.medialive.dvb-nit-settings/network-name (clojure.spec.alpha/and :portkey.aws.medialive/string-min-1-max-256))
(clojure.spec.alpha/def :portkey.aws.medialive.dvb-nit-settings/rep-interval (clojure.spec.alpha/and :portkey.aws.medialive/integer-min-25-max-10000))
(clojure.spec.alpha/def :portkey.aws.medialive/dvb-nit-settings (clojure.spec.alpha/keys :req-un [:portkey.aws.medialive.dvb-nit-settings/network-name :portkey.aws.medialive.dvb-nit-settings/network-id] :opt-un [:portkey.aws.medialive.dvb-nit-settings/rep-interval]))

(clojure.spec.alpha/def :portkey.aws.medialive/integer-min-1-max-20 (clojure.spec.alpha/int-in 1 20))

(clojure.spec.alpha/def :portkey.aws.medialive/offering-type #{:no-upfront "NO_UPFRONT"})

(clojure.spec.alpha/def :portkey.aws.medialive/integer-min-0-max-8191 (clojure.spec.alpha/int-in 0 8191))

(clojure.spec.alpha/def :portkey.aws.medialive/list-of-input-destination-request (clojure.spec.alpha/coll-of :portkey.aws.medialive/input-destination-request))

(clojure.spec.alpha/def :portkey.aws.medialive/smooth-group-timestamp-offset-mode #{"USE_EVENT_START_DATE" :use-configured-offset "USE_CONFIGURED_OFFSET" :use-event-start-date})

(clojure.spec.alpha/def :portkey.aws.medialive/hls-media-store-storage-class #{"TEMPORAL" :temporal})

(clojure.spec.alpha/def :portkey.aws.medialive/pipeline-pause-state-settings (clojure.spec.alpha/keys :req-un [:portkey.aws.medialive/pipeline-id] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.medialive.frame-capture-settings/capture-interval (clojure.spec.alpha/and :portkey.aws.medialive/integer-min-1-max-3600))
(clojure.spec.alpha/def :portkey.aws.medialive/frame-capture-settings (clojure.spec.alpha/keys :req-un [:portkey.aws.medialive.frame-capture-settings/capture-interval] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.medialive.start-channel-request/channel-id (clojure.spec.alpha/and :portkey.aws.medialive/string))
(clojure.spec.alpha/def :portkey.aws.medialive/start-channel-request (clojure.spec.alpha/keys :req-un [:portkey.aws.medialive.start-channel-request/channel-id] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.medialive/hls-program-date-time #{:exclude :include "INCLUDE" "EXCLUDE"})

(clojure.spec.alpha/def :portkey.aws.medialive/list-of-validation-error (clojure.spec.alpha/coll-of :portkey.aws.medialive/validation-error))

(clojure.spec.alpha/def :portkey.aws.medialive.output-destination-settings/password-param (clojure.spec.alpha/and :portkey.aws.medialive/string))
(clojure.spec.alpha/def :portkey.aws.medialive.output-destination-settings/stream-name (clojure.spec.alpha/and :portkey.aws.medialive/string))
(clojure.spec.alpha/def :portkey.aws.medialive.output-destination-settings/url (clojure.spec.alpha/and :portkey.aws.medialive/string))
(clojure.spec.alpha/def :portkey.aws.medialive.output-destination-settings/username (clojure.spec.alpha/and :portkey.aws.medialive/string))
(clojure.spec.alpha/def :portkey.aws.medialive/output-destination-settings (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.medialive.output-destination-settings/password-param :portkey.aws.medialive.output-destination-settings/stream-name :portkey.aws.medialive.output-destination-settings/url :portkey.aws.medialive.output-destination-settings/username]))

(clojure.spec.alpha/def :portkey.aws.medialive/fixed-afd #{"AFD_0010" "AFD_1101" :afd-1101 "AFD_1000" :afd-1000 :afd-1111 :afd-1011 :afd-1010 "AFD_1111" "AFD_0000" :afd-0100 "AFD_1011" :afd-0011 "AFD_0011" "AFD_1001" :afd-0000 "AFD_0100" :afd-1110 :afd-0010 "AFD_1010" "AFD_1110" :afd-1001})

(clojure.spec.alpha/def :portkey.aws.medialive/hls-ts-file-mode #{:segmented-files "SINGLE_FILE" "SEGMENTED_FILES" :single-file})

(clojure.spec.alpha/def :portkey.aws.medialive.scte-35-segmentation-descriptor/sub-segment-num (clojure.spec.alpha/and :portkey.aws.medialive/integer-min-0-max-255))
(clojure.spec.alpha/def :portkey.aws.medialive.scte-35-segmentation-descriptor/segmentation-duration (clojure.spec.alpha/and :portkey.aws.medialive/integer-min-0-max-1099511627775))
(clojure.spec.alpha/def :portkey.aws.medialive.scte-35-segmentation-descriptor/segmentation-type-id (clojure.spec.alpha/and :portkey.aws.medialive/integer-min-0-max-255))
(clojure.spec.alpha/def :portkey.aws.medialive.scte-35-segmentation-descriptor/segmentation-upid (clojure.spec.alpha/and :portkey.aws.medialive/string))
(clojure.spec.alpha/def :portkey.aws.medialive.scte-35-segmentation-descriptor/segmentation-cancel-indicator (clojure.spec.alpha/and :portkey.aws.medialive/scte-35-segmentation-cancel-indicator))
(clojure.spec.alpha/def :portkey.aws.medialive.scte-35-segmentation-descriptor/segmentation-upid-type (clojure.spec.alpha/and :portkey.aws.medialive/integer-min-0-max-255))
(clojure.spec.alpha/def :portkey.aws.medialive.scte-35-segmentation-descriptor/segmentation-event-id (clojure.spec.alpha/and :portkey.aws.medialive/integer-min-0-max-4294967295))
(clojure.spec.alpha/def :portkey.aws.medialive.scte-35-segmentation-descriptor/segments-expected (clojure.spec.alpha/and :portkey.aws.medialive/integer-min-0-max-255))
(clojure.spec.alpha/def :portkey.aws.medialive.scte-35-segmentation-descriptor/sub-segments-expected (clojure.spec.alpha/and :portkey.aws.medialive/integer-min-0-max-255))
(clojure.spec.alpha/def :portkey.aws.medialive.scte-35-segmentation-descriptor/segment-num (clojure.spec.alpha/and :portkey.aws.medialive/integer-min-0-max-255))
(clojure.spec.alpha/def :portkey.aws.medialive.scte-35-segmentation-descriptor/delivery-restrictions (clojure.spec.alpha/and :portkey.aws.medialive/scte-35-delivery-restrictions))
(clojure.spec.alpha/def :portkey.aws.medialive/scte-35-segmentation-descriptor (clojure.spec.alpha/keys :req-un [:portkey.aws.medialive.scte-35-segmentation-descriptor/segmentation-event-id :portkey.aws.medialive.scte-35-segmentation-descriptor/segmentation-cancel-indicator] :opt-un [:portkey.aws.medialive.scte-35-segmentation-descriptor/sub-segment-num :portkey.aws.medialive.scte-35-segmentation-descriptor/segmentation-duration :portkey.aws.medialive.scte-35-segmentation-descriptor/segmentation-type-id :portkey.aws.medialive.scte-35-segmentation-descriptor/segmentation-upid :portkey.aws.medialive.scte-35-segmentation-descriptor/segmentation-upid-type :portkey.aws.medialive.scte-35-segmentation-descriptor/segments-expected :portkey.aws.medialive.scte-35-segmentation-descriptor/sub-segments-expected :portkey.aws.medialive.scte-35-segmentation-descriptor/segment-num :portkey.aws.medialive.scte-35-segmentation-descriptor/delivery-restrictions]))

(clojure.spec.alpha/def :portkey.aws.medialive/hls-iv-in-manifest #{:exclude :include "INCLUDE" "EXCLUDE"})

(clojure.spec.alpha/def :portkey.aws.medialive/list-of-caption-language-mapping (clojure.spec.alpha/coll-of :portkey.aws.medialive/caption-language-mapping))

(clojure.spec.alpha/def :portkey.aws.medialive.list-reservations-response/next-token (clojure.spec.alpha/and :portkey.aws.medialive/string))
(clojure.spec.alpha/def :portkey.aws.medialive.list-reservations-response/reservations (clojure.spec.alpha/and :portkey.aws.medialive/list-of-reservation))
(clojure.spec.alpha/def :portkey.aws.medialive/list-reservations-response (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.medialive.list-reservations-response/next-token :portkey.aws.medialive.list-reservations-response/reservations]))

(clojure.spec.alpha/def :portkey.aws.medialive/create-input-response (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.medialive/input]))

(clojure.spec.alpha/def :portkey.aws.medialive.resource-not-found/message (clojure.spec.alpha/and :portkey.aws.medialive/string))
(clojure.spec.alpha/def :portkey.aws.medialive/resource-not-found (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.medialive.resource-not-found/message]))

(clojure.spec.alpha/def :portkey.aws.medialive/audio-codec-settings (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.medialive/aac-settings :portkey.aws.medialive/ac-3-settings :portkey.aws.medialive/eac-3-settings :portkey.aws.medialive/mp-2-settings :portkey.aws.medialive/pass-through-settings]))

(clojure.spec.alpha/def :portkey.aws.medialive.channel-configuration-validation-error/message (clojure.spec.alpha/and :portkey.aws.medialive/string))
(clojure.spec.alpha/def :portkey.aws.medialive.channel-configuration-validation-error/validation-errors (clojure.spec.alpha/and :portkey.aws.medialive/list-of-validation-error))
(clojure.spec.alpha/def :portkey.aws.medialive/channel-configuration-validation-error (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.medialive.channel-configuration-validation-error/message :portkey.aws.medialive.channel-configuration-validation-error/validation-errors]))

(clojure.spec.alpha/def :portkey.aws.medialive/scte-20-plus-embedded-destination-settings (clojure.spec.alpha/keys :req-un [] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.medialive/scte-35-web-delivery-allowed-flag #{"WEB_DELIVERY_ALLOWED" :web-delivery-not-allowed "WEB_DELIVERY_NOT_ALLOWED" :web-delivery-allowed})

(clojure.spec.alpha/def :portkey.aws.medialive.scte-35-return-to-network-schedule-action-settings/splice-event-id (clojure.spec.alpha/and :portkey.aws.medialive/integer-min-0-max-4294967295))
(clojure.spec.alpha/def :portkey.aws.medialive/scte-35-return-to-network-schedule-action-settings (clojure.spec.alpha/keys :req-un [:portkey.aws.medialive.scte-35-return-to-network-schedule-action-settings/splice-event-id] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.medialive/integer-min-1-max-32 (clojure.spec.alpha/int-in 1 32))

(clojure.spec.alpha/def :portkey.aws.medialive/burn-in-outline-color #{:white :yellow :green "GREEN" "BLUE" :red :blue "WHITE" "YELLOW" "BLACK" "RED" :black})

(clojure.spec.alpha/def :portkey.aws.medialive/h-264-timecode-insertion-behavior #{"DISABLED" "PIC_TIMING_SEI" :disabled :pic-timing-sei})

(clojure.spec.alpha/def :portkey.aws.medialive.create-input-request/media-connect-flows (clojure.spec.alpha/and :portkey.aws.medialive/list-of-media-connect-flow-request))
(clojure.spec.alpha/def :portkey.aws.medialive.create-input-request/request-id (clojure.spec.alpha/and :portkey.aws.medialive/string))
(clojure.spec.alpha/def :portkey.aws.medialive.create-input-request/type (clojure.spec.alpha/and :portkey.aws.medialive/input-type))
(clojure.spec.alpha/def :portkey.aws.medialive.create-input-request/input-security-groups (clojure.spec.alpha/and :portkey.aws.medialive/list-of-string))
(clojure.spec.alpha/def :portkey.aws.medialive.create-input-request/role-arn (clojure.spec.alpha/and :portkey.aws.medialive/string))
(clojure.spec.alpha/def :portkey.aws.medialive.create-input-request/vpc (clojure.spec.alpha/and :portkey.aws.medialive/input-vpc-request))
(clojure.spec.alpha/def :portkey.aws.medialive.create-input-request/destinations (clojure.spec.alpha/and :portkey.aws.medialive/list-of-input-destination-request))
(clojure.spec.alpha/def :portkey.aws.medialive.create-input-request/name (clojure.spec.alpha/and :portkey.aws.medialive/string))
(clojure.spec.alpha/def :portkey.aws.medialive.create-input-request/sources (clojure.spec.alpha/and :portkey.aws.medialive/list-of-input-source-request))
(clojure.spec.alpha/def :portkey.aws.medialive/create-input-request (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.medialive.create-input-request/media-connect-flows :portkey.aws.medialive.create-input-request/request-id :portkey.aws.medialive.create-input-request/type :portkey.aws.medialive.create-input-request/input-security-groups :portkey.aws.medialive.create-input-request/role-arn :portkey.aws.medialive/tags :portkey.aws.medialive.create-input-request/vpc :portkey.aws.medialive.create-input-request/destinations :portkey.aws.medialive.create-input-request/name :portkey.aws.medialive.create-input-request/sources]))

(clojure.spec.alpha/def :portkey.aws.medialive/eac-3-passthrough-control #{:when-possible "WHEN_POSSIBLE" "NO_PASSTHROUGH" :no-passthrough})

(clojure.spec.alpha/def :portkey.aws.medialive.input-settings/denoise-filter (clojure.spec.alpha/and :portkey.aws.medialive/input-denoise-filter))
(clojure.spec.alpha/def :portkey.aws.medialive.input-settings/source-end-behavior (clojure.spec.alpha/and :portkey.aws.medialive/input-source-end-behavior))
(clojure.spec.alpha/def :portkey.aws.medialive.input-settings/filter-strength (clojure.spec.alpha/and :portkey.aws.medialive/integer-min-1-max-5))
(clojure.spec.alpha/def :portkey.aws.medialive.input-settings/caption-selectors (clojure.spec.alpha/and :portkey.aws.medialive/list-of-caption-selector))
(clojure.spec.alpha/def :portkey.aws.medialive.input-settings/audio-selectors (clojure.spec.alpha/and :portkey.aws.medialive/list-of-audio-selector))
(clojure.spec.alpha/def :portkey.aws.medialive.input-settings/deblock-filter (clojure.spec.alpha/and :portkey.aws.medialive/input-deblock-filter))
(clojure.spec.alpha/def :portkey.aws.medialive/input-settings (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.medialive/input-filter :portkey.aws.medialive.input-settings/denoise-filter :portkey.aws.medialive.input-settings/source-end-behavior :portkey.aws.medialive.input-settings/filter-strength :portkey.aws.medialive.input-settings/caption-selectors :portkey.aws.medialive/video-selector :portkey.aws.medialive/network-input-settings :portkey.aws.medialive.input-settings/audio-selectors :portkey.aws.medialive.input-settings/deblock-filter]))

(clojure.spec.alpha/def :portkey.aws.medialive.update-input/destinations (clojure.spec.alpha/and :portkey.aws.medialive/list-of-input-destination-request))
(clojure.spec.alpha/def :portkey.aws.medialive.update-input/input-security-groups (clojure.spec.alpha/and :portkey.aws.medialive/list-of-string))
(clojure.spec.alpha/def :portkey.aws.medialive.update-input/media-connect-flows (clojure.spec.alpha/and :portkey.aws.medialive/list-of-media-connect-flow-request))
(clojure.spec.alpha/def :portkey.aws.medialive.update-input/name (clojure.spec.alpha/and :portkey.aws.medialive/string))
(clojure.spec.alpha/def :portkey.aws.medialive.update-input/role-arn (clojure.spec.alpha/and :portkey.aws.medialive/string))
(clojure.spec.alpha/def :portkey.aws.medialive.update-input/sources (clojure.spec.alpha/and :portkey.aws.medialive/list-of-input-source-request))
(clojure.spec.alpha/def :portkey.aws.medialive/update-input (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.medialive.update-input/destinations :portkey.aws.medialive.update-input/input-security-groups :portkey.aws.medialive.update-input/media-connect-flows :portkey.aws.medialive.update-input/name :portkey.aws.medialive.update-input/role-arn :portkey.aws.medialive.update-input/sources]))

(clojure.spec.alpha/def :portkey.aws.medialive.create-input-security-group-request/whitelist-rules (clojure.spec.alpha/and :portkey.aws.medialive/list-of-input-whitelist-rule-cidr))
(clojure.spec.alpha/def :portkey.aws.medialive/create-input-security-group-request (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.medialive/tags :portkey.aws.medialive.create-input-security-group-request/whitelist-rules]))

(clojure.spec.alpha/def :portkey.aws.medialive/integer-min-1-max-31 (clojure.spec.alpha/int-in 1 31))

(clojure.spec.alpha/def :portkey.aws.medialive.audio-normalization-settings/algorithm (clojure.spec.alpha/and :portkey.aws.medialive/audio-normalization-algorithm))
(clojure.spec.alpha/def :portkey.aws.medialive.audio-normalization-settings/algorithm-control (clojure.spec.alpha/and :portkey.aws.medialive/audio-normalization-algorithm-control))
(clojure.spec.alpha/def :portkey.aws.medialive.audio-normalization-settings/target-lkfs (clojure.spec.alpha/and :portkey.aws.medialive/double-min-negative-59-max-0))
(clojure.spec.alpha/def :portkey.aws.medialive/audio-normalization-settings (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.medialive.audio-normalization-settings/algorithm :portkey.aws.medialive.audio-normalization-settings/algorithm-control :portkey.aws.medialive.audio-normalization-settings/target-lkfs]))

(clojure.spec.alpha/def :portkey.aws.medialive/update-channel-result-model (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.medialive/channel]))

(clojure.spec.alpha/def :portkey.aws.medialive/key-provider-settings (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.medialive/static-key-settings]))

(clojure.spec.alpha/def :portkey.aws.medialive/list-of-scte-35-descriptor (clojure.spec.alpha/coll-of :portkey.aws.medialive/scte-35-descriptor))

(clojure.spec.alpha/def :portkey.aws.medialive/caption-selector-settings (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.medialive/arib-source-settings :portkey.aws.medialive/dvb-sub-source-settings :portkey.aws.medialive/embedded-source-settings :portkey.aws.medialive/scte-20-source-settings :portkey.aws.medialive/scte-27-source-settings :portkey.aws.medialive/teletext-source-settings]))

(clojure.spec.alpha/def :portkey.aws.medialive/tags-model (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.medialive/tags]))

(clojure.spec.alpha/def :portkey.aws.medialive.h-264-settings/level (clojure.spec.alpha/and :portkey.aws.medialive/h-264-level))
(clojure.spec.alpha/def :portkey.aws.medialive.h-264-settings/rate-control-mode (clojure.spec.alpha/and :portkey.aws.medialive/h-264-rate-control-mode))
(clojure.spec.alpha/def :portkey.aws.medialive.h-264-settings/subgop-length (clojure.spec.alpha/and :portkey.aws.medialive/h-264-sub-gop-length))
(clojure.spec.alpha/def :portkey.aws.medialive.h-264-settings/min-i-interval (clojure.spec.alpha/and :portkey.aws.medialive/integer-min-0-max-30))
(clojure.spec.alpha/def :portkey.aws.medialive.h-264-settings/temporal-aq (clojure.spec.alpha/and :portkey.aws.medialive/h-264-temporal-aq))
(clojure.spec.alpha/def :portkey.aws.medialive.h-264-settings/par-denominator (clojure.spec.alpha/and :portkey.aws.medialive/integer-min-1))
(clojure.spec.alpha/def :portkey.aws.medialive.h-264-settings/qvbr-quality-level (clojure.spec.alpha/and :portkey.aws.medialive/integer-min-1-max-10))
(clojure.spec.alpha/def :portkey.aws.medialive.h-264-settings/num-ref-frames (clojure.spec.alpha/and :portkey.aws.medialive/integer-min-1-max-6))
(clojure.spec.alpha/def :portkey.aws.medialive.h-264-settings/gop-b-reference (clojure.spec.alpha/and :portkey.aws.medialive/h-264-gop-b-reference))
(clojure.spec.alpha/def :portkey.aws.medialive.h-264-settings/timecode-insertion (clojure.spec.alpha/and :portkey.aws.medialive/h-264-timecode-insertion-behavior))
(clojure.spec.alpha/def :portkey.aws.medialive.h-264-settings/scan-type (clojure.spec.alpha/and :portkey.aws.medialive/h-264-scan-type))
(clojure.spec.alpha/def :portkey.aws.medialive.h-264-settings/adaptive-quantization (clojure.spec.alpha/and :portkey.aws.medialive/h-264-adaptive-quantization))
(clojure.spec.alpha/def :portkey.aws.medialive.h-264-settings/buf-fill-pct (clojure.spec.alpha/and :portkey.aws.medialive/integer-min-0-max-100))
(clojure.spec.alpha/def :portkey.aws.medialive.h-264-settings/framerate-denominator (clojure.spec.alpha/and :portkey.aws.medialive/integer-min-1))
(clojure.spec.alpha/def :portkey.aws.medialive.h-264-settings/spatial-aq (clojure.spec.alpha/and :portkey.aws.medialive/h-264-spatial-aq))
(clojure.spec.alpha/def :portkey.aws.medialive.h-264-settings/framerate-control (clojure.spec.alpha/and :portkey.aws.medialive/h-264-framerate-control))
(clojure.spec.alpha/def :portkey.aws.medialive.h-264-settings/gop-num-b-frames (clojure.spec.alpha/and :portkey.aws.medialive/integer-min-0-max-7))
(clojure.spec.alpha/def :portkey.aws.medialive.h-264-settings/buf-size (clojure.spec.alpha/and :portkey.aws.medialive/integer-min-0))
(clojure.spec.alpha/def :portkey.aws.medialive.h-264-settings/profile (clojure.spec.alpha/and :portkey.aws.medialive/h-264-profile))
(clojure.spec.alpha/def :portkey.aws.medialive.h-264-settings/color-metadata (clojure.spec.alpha/and :portkey.aws.medialive/h-264-color-metadata))
(clojure.spec.alpha/def :portkey.aws.medialive.h-264-settings/look-ahead-rate-control (clojure.spec.alpha/and :portkey.aws.medialive/h-264-look-ahead-rate-control))
(clojure.spec.alpha/def :portkey.aws.medialive.h-264-settings/syntax (clojure.spec.alpha/and :portkey.aws.medialive/h-264-syntax))
(clojure.spec.alpha/def :portkey.aws.medialive.h-264-settings/gop-closed-cadence (clojure.spec.alpha/and :portkey.aws.medialive/integer-min-0))
(clojure.spec.alpha/def :portkey.aws.medialive.h-264-settings/flicker-aq (clojure.spec.alpha/and :portkey.aws.medialive/h-264-flicker-aq))
(clojure.spec.alpha/def :portkey.aws.medialive.h-264-settings/framerate-numerator (clojure.spec.alpha/and :portkey.aws.medialive/integer-min-1))
(clojure.spec.alpha/def :portkey.aws.medialive.h-264-settings/softness (clojure.spec.alpha/and :portkey.aws.medialive/integer-min-0-max-128))
(clojure.spec.alpha/def :portkey.aws.medialive.h-264-settings/gop-size-units (clojure.spec.alpha/and :portkey.aws.medialive/h-264-gop-size-units))
(clojure.spec.alpha/def :portkey.aws.medialive.h-264-settings/max-bitrate (clojure.spec.alpha/and :portkey.aws.medialive/integer-min-1000))
(clojure.spec.alpha/def :portkey.aws.medialive.h-264-settings/par-numerator (clojure.spec.alpha/and :portkey.aws.medialive/integer))
(clojure.spec.alpha/def :portkey.aws.medialive.h-264-settings/gop-size (clojure.spec.alpha/and :portkey.aws.medialive/double-min-1))
(clojure.spec.alpha/def :portkey.aws.medialive.h-264-settings/par-control (clojure.spec.alpha/and :portkey.aws.medialive/h-264-par-control))
(clojure.spec.alpha/def :portkey.aws.medialive.h-264-settings/slices (clojure.spec.alpha/and :portkey.aws.medialive/integer-min-1-max-32))
(clojure.spec.alpha/def :portkey.aws.medialive.h-264-settings/entropy-encoding (clojure.spec.alpha/and :portkey.aws.medialive/h-264-entropy-encoding))
(clojure.spec.alpha/def :portkey.aws.medialive.h-264-settings/scene-change-detect (clojure.spec.alpha/and :portkey.aws.medialive/h-264-scene-change-detect))
(clojure.spec.alpha/def :portkey.aws.medialive.h-264-settings/bitrate (clojure.spec.alpha/and :portkey.aws.medialive/integer-min-1000))
(clojure.spec.alpha/def :portkey.aws.medialive/h-264-settings (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.medialive.h-264-settings/level :portkey.aws.medialive.h-264-settings/rate-control-mode :portkey.aws.medialive.h-264-settings/subgop-length :portkey.aws.medialive.h-264-settings/min-i-interval :portkey.aws.medialive.h-264-settings/temporal-aq :portkey.aws.medialive.h-264-settings/par-denominator :portkey.aws.medialive.h-264-settings/qvbr-quality-level :portkey.aws.medialive.h-264-settings/num-ref-frames :portkey.aws.medialive.h-264-settings/gop-b-reference :portkey.aws.medialive.h-264-settings/timecode-insertion :portkey.aws.medialive.h-264-settings/scan-type :portkey.aws.medialive.h-264-settings/adaptive-quantization :portkey.aws.medialive/afd-signaling :portkey.aws.medialive.h-264-settings/buf-fill-pct :portkey.aws.medialive.h-264-settings/framerate-denominator :portkey.aws.medialive.h-264-settings/spatial-aq :portkey.aws.medialive.h-264-settings/framerate-control :portkey.aws.medialive.h-264-settings/gop-num-b-frames :portkey.aws.medialive.h-264-settings/buf-size :portkey.aws.medialive.h-264-settings/profile :portkey.aws.medialive.h-264-settings/color-metadata :portkey.aws.medialive.h-264-settings/look-ahead-rate-control :portkey.aws.medialive.h-264-settings/syntax :portkey.aws.medialive.h-264-settings/gop-closed-cadence :portkey.aws.medialive.h-264-settings/flicker-aq :portkey.aws.medialive.h-264-settings/framerate-numerator :portkey.aws.medialive.h-264-settings/softness :portkey.aws.medialive.h-264-settings/gop-size-units :portkey.aws.medialive.h-264-settings/max-bitrate :portkey.aws.medialive.h-264-settings/par-numerator :portkey.aws.medialive.h-264-settings/gop-size :portkey.aws.medialive.h-264-settings/par-control :portkey.aws.medialive.h-264-settings/slices :portkey.aws.medialive/fixed-afd :portkey.aws.medialive.h-264-settings/entropy-encoding :portkey.aws.medialive.h-264-settings/scene-change-detect :portkey.aws.medialive.h-264-settings/bitrate]))

(clojure.spec.alpha/def :portkey.aws.medialive/hls-timed-metadata-id-3-frame #{"TDRL" "NONE" "PRIV" :priv :none :tdrl})

(clojure.spec.alpha/def :portkey.aws.medialive/list-of-media-connect-flow (clojure.spec.alpha/coll-of :portkey.aws.medialive/media-connect-flow))

(clojure.spec.alpha/def :portkey.aws.medialive/eac-3-phase-control #{:shift-90-degrees "SHIFT_90_DEGREES" "NO_SHIFT" :no-shift})

(clojure.spec.alpha/def :portkey.aws.medialive/eac-3-surround-ex-mode #{"DISABLED" "NOT_INDICATED" :disabled :not-indicated "ENABLED" :enabled})

(clojure.spec.alpha/def :portkey.aws.medialive/integer-min-1-max-8 (clojure.spec.alpha/int-in 1 8))

(clojure.spec.alpha/def :portkey.aws.medialive/update-channel-response (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.medialive/channel]))

(clojure.spec.alpha/def :portkey.aws.medialive/smooth-group-segmentation-mode #{:use-segment-duration "USE_INPUT_SEGMENTATION" "USE_SEGMENT_DURATION" :use-input-segmentation})

(clojure.spec.alpha/def :portkey.aws.medialive/list-of-audio-description (clojure.spec.alpha/coll-of :portkey.aws.medialive/audio-description))

(clojure.spec.alpha/def :portkey.aws.medialive.hls-output-settings/name-modifier (clojure.spec.alpha/and :portkey.aws.medialive/string-min-1))
(clojure.spec.alpha/def :portkey.aws.medialive.hls-output-settings/segment-modifier (clojure.spec.alpha/and :portkey.aws.medialive/string))
(clojure.spec.alpha/def :portkey.aws.medialive/hls-output-settings (clojure.spec.alpha/keys :req-un [:portkey.aws.medialive/hls-settings] :opt-un [:portkey.aws.medialive.hls-output-settings/name-modifier :portkey.aws.medialive.hls-output-settings/segment-modifier]))

(clojure.spec.alpha/def :portkey.aws.medialive/scte-35-splice-insert-web-delivery-allowed-behavior #{:follow :ignore "FOLLOW" "IGNORE"})

(clojure.spec.alpha/def :portkey.aws.medialive.m-3u-8-settings/pat-interval (clojure.spec.alpha/and :portkey.aws.medialive/integer-min-0-max-1000))
(clojure.spec.alpha/def :portkey.aws.medialive.m-3u-8-settings/audio-frames-per-pes (clojure.spec.alpha/and :portkey.aws.medialive/integer-min-0))
(clojure.spec.alpha/def :portkey.aws.medialive.m-3u-8-settings/transport-stream-id (clojure.spec.alpha/and :portkey.aws.medialive/integer-min-0-max-65535))
(clojure.spec.alpha/def :portkey.aws.medialive.m-3u-8-settings/scte-35-behavior (clojure.spec.alpha/and :portkey.aws.medialive/m-3u-8-scte-35-behavior))
(clojure.spec.alpha/def :portkey.aws.medialive.m-3u-8-settings/timed-metadata-behavior (clojure.spec.alpha/and :portkey.aws.medialive/m-3u-8-timed-metadata-behavior))
(clojure.spec.alpha/def :portkey.aws.medialive.m-3u-8-settings/pcr-control (clojure.spec.alpha/and :portkey.aws.medialive/m-3u-8-pcr-control))
(clojure.spec.alpha/def :portkey.aws.medialive.m-3u-8-settings/scte-35-pid (clojure.spec.alpha/and :portkey.aws.medialive/string))
(clojure.spec.alpha/def :portkey.aws.medialive.m-3u-8-settings/pcr-pid (clojure.spec.alpha/and :portkey.aws.medialive/string))
(clojure.spec.alpha/def :portkey.aws.medialive.m-3u-8-settings/pmt-pid (clojure.spec.alpha/and :portkey.aws.medialive/string))
(clojure.spec.alpha/def :portkey.aws.medialive.m-3u-8-settings/video-pid (clojure.spec.alpha/and :portkey.aws.medialive/string))
(clojure.spec.alpha/def :portkey.aws.medialive.m-3u-8-settings/audio-pids (clojure.spec.alpha/and :portkey.aws.medialive/string))
(clojure.spec.alpha/def :portkey.aws.medialive.m-3u-8-settings/pcr-period (clojure.spec.alpha/and :portkey.aws.medialive/integer-min-0-max-500))
(clojure.spec.alpha/def :portkey.aws.medialive.m-3u-8-settings/pmt-interval (clojure.spec.alpha/and :portkey.aws.medialive/integer-min-0-max-1000))
(clojure.spec.alpha/def :portkey.aws.medialive.m-3u-8-settings/program-num (clojure.spec.alpha/and :portkey.aws.medialive/integer-min-0-max-65535))
(clojure.spec.alpha/def :portkey.aws.medialive.m-3u-8-settings/timed-metadata-pid (clojure.spec.alpha/and :portkey.aws.medialive/string))
(clojure.spec.alpha/def :portkey.aws.medialive.m-3u-8-settings/ecm-pid (clojure.spec.alpha/and :portkey.aws.medialive/string))
(clojure.spec.alpha/def :portkey.aws.medialive/m-3u-8-settings (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.medialive.m-3u-8-settings/pat-interval :portkey.aws.medialive.m-3u-8-settings/audio-frames-per-pes :portkey.aws.medialive.m-3u-8-settings/transport-stream-id :portkey.aws.medialive.m-3u-8-settings/scte-35-behavior :portkey.aws.medialive.m-3u-8-settings/timed-metadata-behavior :portkey.aws.medialive.m-3u-8-settings/pcr-control :portkey.aws.medialive.m-3u-8-settings/scte-35-pid :portkey.aws.medialive.m-3u-8-settings/pcr-pid :portkey.aws.medialive.m-3u-8-settings/pmt-pid :portkey.aws.medialive.m-3u-8-settings/video-pid :portkey.aws.medialive.m-3u-8-settings/audio-pids :portkey.aws.medialive.m-3u-8-settings/pcr-period :portkey.aws.medialive.m-3u-8-settings/pmt-interval :portkey.aws.medialive.m-3u-8-settings/program-num :portkey.aws.medialive.m-3u-8-settings/timed-metadata-pid :portkey.aws.medialive.m-3u-8-settings/ecm-pid]))

(clojure.spec.alpha/def :portkey.aws.medialive/string-min-1-max-255 (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__21110__auto__] (clojure.core/<= 1 (clojure.core/count s__21110__auto__))) (clojure.core/fn [s__21111__auto__] (clojure.core/< (clojure.core/count s__21111__auto__) 255))))

(clojure.spec.alpha/def :portkey.aws.medialive/list-of-audio-channel-mapping (clojure.spec.alpha/coll-of :portkey.aws.medialive/audio-channel-mapping))

(clojure.spec.alpha/def :portkey.aws.medialive/list-of-media-connect-flow-request (clojure.spec.alpha/coll-of :portkey.aws.medialive/media-connect-flow-request))

(clojure.spec.alpha/def :portkey.aws.medialive/eac-3-stereo-downmix #{"NOT_INDICATED" :not-indicated "LO_RO" :lo-ro "LT_RT" :lt-rt "DPL2" :dpl-2})

(clojure.spec.alpha/def :portkey.aws.medialive/integer-min-0-max-128 (clojure.spec.alpha/int-in 0 128))

(clojure.spec.alpha/def :portkey.aws.medialive/integer-min-0-max-1000000 (clojure.spec.alpha/int-in 0 1000000))

(clojure.spec.alpha/def :portkey.aws.medialive/h-264-syntax #{"RP2027" :default "DEFAULT" :rp-2027})

(clojure.spec.alpha/def :portkey.aws.medialive/string-min-32-max-32 (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__21110__auto__] (clojure.core/<= 32 (clojure.core/count s__21110__auto__))) (clojure.core/fn [s__21111__auto__] (clojure.core/< (clojure.core/count s__21111__auto__) 32))))

(clojure.spec.alpha/def :portkey.aws.medialive/input-resolution #{:uhd "UHD" "SD" "HD" :sd :hd})

(clojure.spec.alpha/def :portkey.aws.medialive/scte-20-convert-608-to-708 #{"DISABLED" "UPCONVERT" :disabled :upconvert})

(clojure.spec.alpha/def :portkey.aws.medialive/h-264-flicker-aq #{"DISABLED" :disabled "ENABLED" :enabled})

(clojure.spec.alpha/def :portkey.aws.medialive/hls-codec-specification #{:rfc-6381 :rfc-4281 "RFC_4281" "RFC_6381"})

(clojure.spec.alpha/def :portkey.aws.medialive.avail-blanking/avail-blanking-image (clojure.spec.alpha/and :portkey.aws.medialive/input-location))
(clojure.spec.alpha/def :portkey.aws.medialive.avail-blanking/state (clojure.spec.alpha/and :portkey.aws.medialive/avail-blanking-state))
(clojure.spec.alpha/def :portkey.aws.medialive/avail-blanking (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.medialive.avail-blanking/avail-blanking-image :portkey.aws.medialive.avail-blanking/state]))

(clojure.spec.alpha/def :portkey.aws.medialive/m-2ts-audio-stream-type #{:atsc :dvb "DVB" "ATSC"})

(clojure.spec.alpha/def :portkey.aws.medialive/string-min-34-max-34 (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__21110__auto__] (clojure.core/<= 34 (clojure.core/count s__21110__auto__))) (clojure.core/fn [s__21111__auto__] (clojure.core/< (clojure.core/count s__21111__auto__) 34))))

(clojure.spec.alpha/def :portkey.aws.medialive.audio-selector/name (clojure.spec.alpha/and :portkey.aws.medialive/string-min-1))
(clojure.spec.alpha/def :portkey.aws.medialive.audio-selector/selector-settings (clojure.spec.alpha/and :portkey.aws.medialive/audio-selector-settings))
(clojure.spec.alpha/def :portkey.aws.medialive/audio-selector (clojure.spec.alpha/keys :req-un [:portkey.aws.medialive.audio-selector/name] :opt-un [:portkey.aws.medialive.audio-selector/selector-settings]))

(clojure.spec.alpha/def :portkey.aws.medialive/integer-min-1-max-16 (clojure.spec.alpha/int-in 1 16))

(clojure.spec.alpha/def :portkey.aws.medialive.hls-akamai-settings/connection-retry-interval (clojure.spec.alpha/and :portkey.aws.medialive/integer-min-0))
(clojure.spec.alpha/def :portkey.aws.medialive.hls-akamai-settings/filecache-duration (clojure.spec.alpha/and :portkey.aws.medialive/integer-min-0-max-600))
(clojure.spec.alpha/def :portkey.aws.medialive.hls-akamai-settings/http-transfer-mode (clojure.spec.alpha/and :portkey.aws.medialive/hls-akamai-http-transfer-mode))
(clojure.spec.alpha/def :portkey.aws.medialive.hls-akamai-settings/num-retries (clojure.spec.alpha/and :portkey.aws.medialive/integer-min-0))
(clojure.spec.alpha/def :portkey.aws.medialive.hls-akamai-settings/restart-delay (clojure.spec.alpha/and :portkey.aws.medialive/integer-min-0-max-15))
(clojure.spec.alpha/def :portkey.aws.medialive.hls-akamai-settings/salt (clojure.spec.alpha/and :portkey.aws.medialive/string))
(clojure.spec.alpha/def :portkey.aws.medialive.hls-akamai-settings/token (clojure.spec.alpha/and :portkey.aws.medialive/string))
(clojure.spec.alpha/def :portkey.aws.medialive/hls-akamai-settings (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.medialive.hls-akamai-settings/connection-retry-interval :portkey.aws.medialive.hls-akamai-settings/filecache-duration :portkey.aws.medialive.hls-akamai-settings/http-transfer-mode :portkey.aws.medialive.hls-akamai-settings/num-retries :portkey.aws.medialive.hls-akamai-settings/restart-delay :portkey.aws.medialive.hls-akamai-settings/salt :portkey.aws.medialive.hls-akamai-settings/token]))

(clojure.spec.alpha/def :portkey.aws.medialive/reservation-state #{"CANCELED" :deleted "EXPIRED" :canceled :active "ACTIVE" :expired "DELETED"})

(clojure.core/defn update-input-security-group "Update an Input Security Group's Whilelists." ([update-input-security-group-requestinput] (clojure.core/let [request-function-result__22153__auto__ (req-update-input-security-group-request update-input-security-group-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__22153__auto__ {:http.request.configuration/endpoints portkey.aws.medialive/endpoints, :http.request.configuration/target-prefix nil, :http.request.spec/output-spec :portkey.aws.medialive/update-input-security-group-response, :http.request.configuration/mime-type {"content-type" "application/json"}, :http.request.configuration/request-uri "/prod/inputSecurityGroups/{inputSecurityGroupId}", :http.request.configuration/version "2017-10-14", :http.request.configuration/service-id "MediaLive", :http.request.spec/input-spec :portkey.aws.medialive/update-input-security-group-request, :http.request.configuration/protocol "rest-json", :http.request.configuration/method :put, :http.request.configuration/response-code 200, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "UpdateInputSecurityGroup", :http.request.configuration/output-deser-fn response-update-input-security-group-response, :http.request.spec/error-spec {"BadRequestException" :portkey.aws.medialive/bad-request-exception, "InternalServerErrorException" :portkey.aws.medialive/internal-server-error-exception, "ForbiddenException" :portkey.aws.medialive/forbidden-exception, "BadGatewayException" :portkey.aws.medialive/bad-gateway-exception, "NotFoundException" :portkey.aws.medialive/not-found-exception, "GatewayTimeoutException" :portkey.aws.medialive/gateway-timeout-exception, "ConflictException" :portkey.aws.medialive/conflict-exception}})))))
(clojure.spec.alpha/fdef update-input-security-group :args (clojure.spec.alpha/tuple :portkey.aws.medialive/update-input-security-group-request) :ret (clojure.spec.alpha/and :portkey.aws.medialive/update-input-security-group-response))

(clojure.core/defn delete-channel "Starts deletion of channel. The associated outputs are also deleted." ([delete-channel-requestinput] (clojure.core/let [request-function-result__22153__auto__ (req-delete-channel-request delete-channel-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__22153__auto__ {:http.request.configuration/endpoints portkey.aws.medialive/endpoints, :http.request.configuration/target-prefix nil, :http.request.spec/output-spec :portkey.aws.medialive/delete-channel-response, :http.request.configuration/mime-type {"content-type" "application/json"}, :http.request.configuration/request-uri "/prod/channels/{channelId}", :http.request.configuration/version "2017-10-14", :http.request.configuration/service-id "MediaLive", :http.request.spec/input-spec :portkey.aws.medialive/delete-channel-request, :http.request.configuration/protocol "rest-json", :http.request.configuration/method :delete, :http.request.configuration/response-code 200, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "DeleteChannel", :http.request.configuration/output-deser-fn response-delete-channel-response, :http.request.spec/error-spec {"BadRequestException" :portkey.aws.medialive/bad-request-exception, "InternalServerErrorException" :portkey.aws.medialive/internal-server-error-exception, "ForbiddenException" :portkey.aws.medialive/forbidden-exception, "BadGatewayException" :portkey.aws.medialive/bad-gateway-exception, "NotFoundException" :portkey.aws.medialive/not-found-exception, "GatewayTimeoutException" :portkey.aws.medialive/gateway-timeout-exception, "TooManyRequestsException" :portkey.aws.medialive/too-many-requests-exception, "ConflictException" :portkey.aws.medialive/conflict-exception}})))))
(clojure.spec.alpha/fdef delete-channel :args (clojure.spec.alpha/tuple :portkey.aws.medialive/delete-channel-request) :ret (clojure.spec.alpha/and :portkey.aws.medialive/delete-channel-response))

(clojure.core/defn delete-tags "Removes tags for a resource" ([delete-tags-requestinput] (clojure.core/let [request-function-result__22153__auto__ (req-delete-tags-request delete-tags-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__22153__auto__ {:http.request.configuration/endpoints portkey.aws.medialive/endpoints, :http.request.configuration/target-prefix nil, :http.request.spec/output-spec nil, :http.request.configuration/mime-type {"content-type" "application/json"}, :http.request.configuration/request-uri "/prod/tags/{resource-arn}", :http.request.configuration/version "2017-10-14", :http.request.configuration/service-id "MediaLive", :http.request.spec/input-spec :portkey.aws.medialive/delete-tags-request, :http.request.configuration/protocol "rest-json", :http.request.configuration/method :delete, :http.request.configuration/response-code 204, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "DeleteTags", :http.request.configuration/output-deser-fn (clojure.core/fn [& args__22152__auto__] {}), :http.request.spec/error-spec {"NotFoundException" :portkey.aws.medialive/not-found-exception, "BadRequestException" :portkey.aws.medialive/bad-request-exception, "InternalServerErrorException" :portkey.aws.medialive/internal-server-error-exception, "ForbiddenException" :portkey.aws.medialive/forbidden-exception}})))))
(clojure.spec.alpha/fdef delete-tags :args (clojure.spec.alpha/tuple :portkey.aws.medialive/delete-tags-request) :ret clojure.core/true?)

(clojure.core/defn delete-input-security-group "Deletes an Input Security Group" ([delete-input-security-group-requestinput] (clojure.core/let [request-function-result__22153__auto__ (req-delete-input-security-group-request delete-input-security-group-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__22153__auto__ {:http.request.configuration/endpoints portkey.aws.medialive/endpoints, :http.request.configuration/target-prefix nil, :http.request.spec/output-spec :portkey.aws.medialive/delete-input-security-group-response, :http.request.configuration/mime-type {"content-type" "application/json"}, :http.request.configuration/request-uri "/prod/inputSecurityGroups/{inputSecurityGroupId}", :http.request.configuration/version "2017-10-14", :http.request.configuration/service-id "MediaLive", :http.request.spec/input-spec :portkey.aws.medialive/delete-input-security-group-request, :http.request.configuration/protocol "rest-json", :http.request.configuration/method :delete, :http.request.configuration/response-code 200, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "DeleteInputSecurityGroup", :http.request.configuration/output-deser-fn response-delete-input-security-group-response, :http.request.spec/error-spec {"BadRequestException" :portkey.aws.medialive/bad-request-exception, "InternalServerErrorException" :portkey.aws.medialive/internal-server-error-exception, "ForbiddenException" :portkey.aws.medialive/forbidden-exception, "BadGatewayException" :portkey.aws.medialive/bad-gateway-exception, "NotFoundException" :portkey.aws.medialive/not-found-exception, "GatewayTimeoutException" :portkey.aws.medialive/gateway-timeout-exception, "TooManyRequestsException" :portkey.aws.medialive/too-many-requests-exception}})))))
(clojure.spec.alpha/fdef delete-input-security-group :args (clojure.spec.alpha/tuple :portkey.aws.medialive/delete-input-security-group-request) :ret (clojure.spec.alpha/and :portkey.aws.medialive/delete-input-security-group-response))

(clojure.core/defn update-channel "Updates a channel." ([update-channel-requestinput] (clojure.core/let [request-function-result__22153__auto__ (req-update-channel-request update-channel-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__22153__auto__ {:http.request.configuration/endpoints portkey.aws.medialive/endpoints, :http.request.configuration/target-prefix nil, :http.request.spec/output-spec :portkey.aws.medialive/update-channel-response, :http.request.configuration/mime-type {"content-type" "application/json"}, :http.request.configuration/request-uri "/prod/channels/{channelId}", :http.request.configuration/version "2017-10-14", :http.request.configuration/service-id "MediaLive", :http.request.spec/input-spec :portkey.aws.medialive/update-channel-request, :http.request.configuration/protocol "rest-json", :http.request.configuration/method :put, :http.request.configuration/response-code 200, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "UpdateChannel", :http.request.configuration/output-deser-fn response-update-channel-response, :http.request.spec/error-spec {"BadRequestException" :portkey.aws.medialive/bad-request-exception, "UnprocessableEntityException" :portkey.aws.medialive/unprocessable-entity-exception, "InternalServerErrorException" :portkey.aws.medialive/internal-server-error-exception, "ForbiddenException" :portkey.aws.medialive/forbidden-exception, "BadGatewayException" :portkey.aws.medialive/bad-gateway-exception, "GatewayTimeoutException" :portkey.aws.medialive/gateway-timeout-exception, "ConflictException" :portkey.aws.medialive/conflict-exception}})))))
(clojure.spec.alpha/fdef update-channel :args (clojure.spec.alpha/tuple :portkey.aws.medialive/update-channel-request) :ret (clojure.spec.alpha/and :portkey.aws.medialive/update-channel-response))

(clojure.core/defn create-tags "Create tags for a resource" ([create-tags-requestinput] (clojure.core/let [request-function-result__22153__auto__ (req-create-tags-request create-tags-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__22153__auto__ {:http.request.configuration/endpoints portkey.aws.medialive/endpoints, :http.request.configuration/target-prefix nil, :http.request.spec/output-spec nil, :http.request.configuration/mime-type {"content-type" "application/json"}, :http.request.configuration/request-uri "/prod/tags/{resource-arn}", :http.request.configuration/version "2017-10-14", :http.request.configuration/service-id "MediaLive", :http.request.spec/input-spec :portkey.aws.medialive/create-tags-request, :http.request.configuration/protocol "rest-json", :http.request.configuration/method :post, :http.request.configuration/response-code 204, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "CreateTags", :http.request.configuration/output-deser-fn (clojure.core/fn [& args__22152__auto__] {}), :http.request.spec/error-spec {"NotFoundException" :portkey.aws.medialive/not-found-exception, "BadRequestException" :portkey.aws.medialive/bad-request-exception, "InternalServerErrorException" :portkey.aws.medialive/internal-server-error-exception, "ForbiddenException" :portkey.aws.medialive/forbidden-exception}})))))
(clojure.spec.alpha/fdef create-tags :args (clojure.spec.alpha/tuple :portkey.aws.medialive/create-tags-request) :ret clojure.core/true?)

(clojure.core/defn list-reservations "List purchased reservations." ([] (list-reservations {})) ([list-reservations-requestinput] (clojure.core/let [request-function-result__22153__auto__ (req-list-reservations-request list-reservations-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__22153__auto__ {:http.request.configuration/endpoints portkey.aws.medialive/endpoints, :http.request.configuration/target-prefix nil, :http.request.spec/output-spec :portkey.aws.medialive/list-reservations-response, :http.request.configuration/mime-type {"content-type" "application/json"}, :http.request.configuration/request-uri "/prod/reservations", :http.request.configuration/version "2017-10-14", :http.request.configuration/service-id "MediaLive", :http.request.spec/input-spec :portkey.aws.medialive/list-reservations-request, :http.request.configuration/protocol "rest-json", :http.request.configuration/method :get, :http.request.configuration/response-code 200, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "ListReservations", :http.request.configuration/output-deser-fn response-list-reservations-response, :http.request.spec/error-spec {"BadRequestException" :portkey.aws.medialive/bad-request-exception, "InternalServerErrorException" :portkey.aws.medialive/internal-server-error-exception, "ForbiddenException" :portkey.aws.medialive/forbidden-exception, "BadGatewayException" :portkey.aws.medialive/bad-gateway-exception, "GatewayTimeoutException" :portkey.aws.medialive/gateway-timeout-exception, "TooManyRequestsException" :portkey.aws.medialive/too-many-requests-exception}})))))
(clojure.spec.alpha/fdef list-reservations :args (clojure.spec.alpha/? :portkey.aws.medialive/list-reservations-request) :ret (clojure.spec.alpha/and :portkey.aws.medialive/list-reservations-response))

(clojure.core/defn delete-input "Deletes the input end point" ([delete-input-requestinput] (clojure.core/let [request-function-result__22153__auto__ (req-delete-input-request delete-input-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__22153__auto__ {:http.request.configuration/endpoints portkey.aws.medialive/endpoints, :http.request.configuration/target-prefix nil, :http.request.spec/output-spec :portkey.aws.medialive/delete-input-response, :http.request.configuration/mime-type {"content-type" "application/json"}, :http.request.configuration/request-uri "/prod/inputs/{inputId}", :http.request.configuration/version "2017-10-14", :http.request.configuration/service-id "MediaLive", :http.request.spec/input-spec :portkey.aws.medialive/delete-input-request, :http.request.configuration/protocol "rest-json", :http.request.configuration/method :delete, :http.request.configuration/response-code 200, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "DeleteInput", :http.request.configuration/output-deser-fn response-delete-input-response, :http.request.spec/error-spec {"BadRequestException" :portkey.aws.medialive/bad-request-exception, "InternalServerErrorException" :portkey.aws.medialive/internal-server-error-exception, "ForbiddenException" :portkey.aws.medialive/forbidden-exception, "BadGatewayException" :portkey.aws.medialive/bad-gateway-exception, "NotFoundException" :portkey.aws.medialive/not-found-exception, "GatewayTimeoutException" :portkey.aws.medialive/gateway-timeout-exception, "TooManyRequestsException" :portkey.aws.medialive/too-many-requests-exception, "ConflictException" :portkey.aws.medialive/conflict-exception}})))))
(clojure.spec.alpha/fdef delete-input :args (clojure.spec.alpha/tuple :portkey.aws.medialive/delete-input-request) :ret (clojure.spec.alpha/and :portkey.aws.medialive/delete-input-response))

(clojure.core/defn describe-input "Produces details about an input" ([describe-input-requestinput] (clojure.core/let [request-function-result__22153__auto__ (req-describe-input-request describe-input-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__22153__auto__ {:http.request.configuration/endpoints portkey.aws.medialive/endpoints, :http.request.configuration/target-prefix nil, :http.request.spec/output-spec :portkey.aws.medialive/describe-input-response, :http.request.configuration/mime-type {"content-type" "application/json"}, :http.request.configuration/request-uri "/prod/inputs/{inputId}", :http.request.configuration/version "2017-10-14", :http.request.configuration/service-id "MediaLive", :http.request.spec/input-spec :portkey.aws.medialive/describe-input-request, :http.request.configuration/protocol "rest-json", :http.request.configuration/method :get, :http.request.configuration/response-code 200, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "DescribeInput", :http.request.configuration/output-deser-fn response-describe-input-response, :http.request.spec/error-spec {"BadRequestException" :portkey.aws.medialive/bad-request-exception, "InternalServerErrorException" :portkey.aws.medialive/internal-server-error-exception, "ForbiddenException" :portkey.aws.medialive/forbidden-exception, "BadGatewayException" :portkey.aws.medialive/bad-gateway-exception, "NotFoundException" :portkey.aws.medialive/not-found-exception, "GatewayTimeoutException" :portkey.aws.medialive/gateway-timeout-exception, "TooManyRequestsException" :portkey.aws.medialive/too-many-requests-exception}})))))
(clojure.spec.alpha/fdef describe-input :args (clojure.spec.alpha/tuple :portkey.aws.medialive/describe-input-request) :ret (clojure.spec.alpha/and :portkey.aws.medialive/describe-input-response))

(clojure.core/defn list-tags-for-resource "Produces list of tags that have been created for a resource" ([list-tags-for-resource-requestinput] (clojure.core/let [request-function-result__22153__auto__ (req-list-tags-for-resource-request list-tags-for-resource-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__22153__auto__ {:http.request.configuration/endpoints portkey.aws.medialive/endpoints, :http.request.configuration/target-prefix nil, :http.request.spec/output-spec :portkey.aws.medialive/list-tags-for-resource-response, :http.request.configuration/mime-type {"content-type" "application/json"}, :http.request.configuration/request-uri "/prod/tags/{resource-arn}", :http.request.configuration/version "2017-10-14", :http.request.configuration/service-id "MediaLive", :http.request.spec/input-spec :portkey.aws.medialive/list-tags-for-resource-request, :http.request.configuration/protocol "rest-json", :http.request.configuration/method :get, :http.request.configuration/response-code 200, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "ListTagsForResource", :http.request.configuration/output-deser-fn response-list-tags-for-resource-response, :http.request.spec/error-spec {"NotFoundException" :portkey.aws.medialive/not-found-exception, "BadRequestException" :portkey.aws.medialive/bad-request-exception, "InternalServerErrorException" :portkey.aws.medialive/internal-server-error-exception, "ForbiddenException" :portkey.aws.medialive/forbidden-exception}})))))
(clojure.spec.alpha/fdef list-tags-for-resource :args (clojure.spec.alpha/tuple :portkey.aws.medialive/list-tags-for-resource-request) :ret (clojure.spec.alpha/and :portkey.aws.medialive/list-tags-for-resource-response))

(clojure.core/defn describe-offering "Get details for an offering." ([describe-offering-requestinput] (clojure.core/let [request-function-result__22153__auto__ (req-describe-offering-request describe-offering-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__22153__auto__ {:http.request.configuration/endpoints portkey.aws.medialive/endpoints, :http.request.configuration/target-prefix nil, :http.request.spec/output-spec :portkey.aws.medialive/describe-offering-response, :http.request.configuration/mime-type {"content-type" "application/json"}, :http.request.configuration/request-uri "/prod/offerings/{offeringId}", :http.request.configuration/version "2017-10-14", :http.request.configuration/service-id "MediaLive", :http.request.spec/input-spec :portkey.aws.medialive/describe-offering-request, :http.request.configuration/protocol "rest-json", :http.request.configuration/method :get, :http.request.configuration/response-code 200, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "DescribeOffering", :http.request.configuration/output-deser-fn response-describe-offering-response, :http.request.spec/error-spec {"BadRequestException" :portkey.aws.medialive/bad-request-exception, "InternalServerErrorException" :portkey.aws.medialive/internal-server-error-exception, "ForbiddenException" :portkey.aws.medialive/forbidden-exception, "BadGatewayException" :portkey.aws.medialive/bad-gateway-exception, "NotFoundException" :portkey.aws.medialive/not-found-exception, "GatewayTimeoutException" :portkey.aws.medialive/gateway-timeout-exception, "TooManyRequestsException" :portkey.aws.medialive/too-many-requests-exception}})))))
(clojure.spec.alpha/fdef describe-offering :args (clojure.spec.alpha/tuple :portkey.aws.medialive/describe-offering-request) :ret (clojure.spec.alpha/and :portkey.aws.medialive/describe-offering-response))

(clojure.core/defn list-inputs "Produces list of inputs that have been created" ([] (list-inputs {})) ([list-inputs-requestinput] (clojure.core/let [request-function-result__22153__auto__ (req-list-inputs-request list-inputs-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__22153__auto__ {:http.request.configuration/endpoints portkey.aws.medialive/endpoints, :http.request.configuration/target-prefix nil, :http.request.spec/output-spec :portkey.aws.medialive/list-inputs-response, :http.request.configuration/mime-type {"content-type" "application/json"}, :http.request.configuration/request-uri "/prod/inputs", :http.request.configuration/version "2017-10-14", :http.request.configuration/service-id "MediaLive", :http.request.spec/input-spec :portkey.aws.medialive/list-inputs-request, :http.request.configuration/protocol "rest-json", :http.request.configuration/method :get, :http.request.configuration/response-code 200, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "ListInputs", :http.request.configuration/output-deser-fn response-list-inputs-response, :http.request.spec/error-spec {"BadRequestException" :portkey.aws.medialive/bad-request-exception, "InternalServerErrorException" :portkey.aws.medialive/internal-server-error-exception, "ForbiddenException" :portkey.aws.medialive/forbidden-exception, "BadGatewayException" :portkey.aws.medialive/bad-gateway-exception, "GatewayTimeoutException" :portkey.aws.medialive/gateway-timeout-exception, "TooManyRequestsException" :portkey.aws.medialive/too-many-requests-exception}})))))
(clojure.spec.alpha/fdef list-inputs :args (clojure.spec.alpha/? :portkey.aws.medialive/list-inputs-request) :ret (clojure.spec.alpha/and :portkey.aws.medialive/list-inputs-response))

(clojure.core/defn create-input "Create an input" ([] (create-input {})) ([create-input-requestinput] (clojure.core/let [request-function-result__22153__auto__ (req-create-input-request create-input-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__22153__auto__ {:http.request.configuration/endpoints portkey.aws.medialive/endpoints, :http.request.configuration/target-prefix nil, :http.request.spec/output-spec :portkey.aws.medialive/create-input-response, :http.request.configuration/mime-type {"content-type" "application/json"}, :http.request.configuration/request-uri "/prod/inputs", :http.request.configuration/version "2017-10-14", :http.request.configuration/service-id "MediaLive", :http.request.spec/input-spec :portkey.aws.medialive/create-input-request, :http.request.configuration/protocol "rest-json", :http.request.configuration/method :post, :http.request.configuration/response-code 201, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "CreateInput", :http.request.configuration/output-deser-fn response-create-input-response, :http.request.spec/error-spec {"BadRequestException" :portkey.aws.medialive/bad-request-exception, "InternalServerErrorException" :portkey.aws.medialive/internal-server-error-exception, "ForbiddenException" :portkey.aws.medialive/forbidden-exception, "BadGatewayException" :portkey.aws.medialive/bad-gateway-exception, "GatewayTimeoutException" :portkey.aws.medialive/gateway-timeout-exception, "TooManyRequestsException" :portkey.aws.medialive/too-many-requests-exception}})))))
(clojure.spec.alpha/fdef create-input :args (clojure.spec.alpha/? :portkey.aws.medialive/create-input-request) :ret (clojure.spec.alpha/and :portkey.aws.medialive/create-input-response))

(clojure.core/defn create-channel "Creates a new channel" ([] (create-channel {})) ([create-channel-requestinput] (clojure.core/let [request-function-result__22153__auto__ (req-create-channel-request create-channel-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__22153__auto__ {:http.request.configuration/endpoints portkey.aws.medialive/endpoints, :http.request.configuration/target-prefix nil, :http.request.spec/output-spec :portkey.aws.medialive/create-channel-response, :http.request.configuration/mime-type {"content-type" "application/json"}, :http.request.configuration/request-uri "/prod/channels", :http.request.configuration/version "2017-10-14", :http.request.configuration/service-id "MediaLive", :http.request.spec/input-spec :portkey.aws.medialive/create-channel-request, :http.request.configuration/protocol "rest-json", :http.request.configuration/method :post, :http.request.configuration/response-code 201, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "CreateChannel", :http.request.configuration/output-deser-fn response-create-channel-response, :http.request.spec/error-spec {"BadRequestException" :portkey.aws.medialive/bad-request-exception, "UnprocessableEntityException" :portkey.aws.medialive/unprocessable-entity-exception, "InternalServerErrorException" :portkey.aws.medialive/internal-server-error-exception, "ForbiddenException" :portkey.aws.medialive/forbidden-exception, "BadGatewayException" :portkey.aws.medialive/bad-gateway-exception, "GatewayTimeoutException" :portkey.aws.medialive/gateway-timeout-exception, "TooManyRequestsException" :portkey.aws.medialive/too-many-requests-exception, "ConflictException" :portkey.aws.medialive/conflict-exception}})))))
(clojure.spec.alpha/fdef create-channel :args (clojure.spec.alpha/? :portkey.aws.medialive/create-channel-request) :ret (clojure.spec.alpha/and :portkey.aws.medialive/create-channel-response))

(clojure.core/defn describe-channel "Gets details about a channel" ([describe-channel-requestinput] (clojure.core/let [request-function-result__22153__auto__ (req-describe-channel-request describe-channel-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__22153__auto__ {:http.request.configuration/endpoints portkey.aws.medialive/endpoints, :http.request.configuration/target-prefix nil, :http.request.spec/output-spec :portkey.aws.medialive/describe-channel-response, :http.request.configuration/mime-type {"content-type" "application/json"}, :http.request.configuration/request-uri "/prod/channels/{channelId}", :http.request.configuration/version "2017-10-14", :http.request.configuration/service-id "MediaLive", :http.request.spec/input-spec :portkey.aws.medialive/describe-channel-request, :http.request.configuration/protocol "rest-json", :http.request.configuration/method :get, :http.request.configuration/response-code 200, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "DescribeChannel", :http.request.configuration/output-deser-fn response-describe-channel-response, :http.request.spec/error-spec {"BadRequestException" :portkey.aws.medialive/bad-request-exception, "InternalServerErrorException" :portkey.aws.medialive/internal-server-error-exception, "ForbiddenException" :portkey.aws.medialive/forbidden-exception, "BadGatewayException" :portkey.aws.medialive/bad-gateway-exception, "NotFoundException" :portkey.aws.medialive/not-found-exception, "GatewayTimeoutException" :portkey.aws.medialive/gateway-timeout-exception, "TooManyRequestsException" :portkey.aws.medialive/too-many-requests-exception}})))))
(clojure.spec.alpha/fdef describe-channel :args (clojure.spec.alpha/tuple :portkey.aws.medialive/describe-channel-request) :ret (clojure.spec.alpha/and :portkey.aws.medialive/describe-channel-response))

(clojure.core/defn list-channels "Produces list of channels that have been created" ([] (list-channels {})) ([list-channels-requestinput] (clojure.core/let [request-function-result__22153__auto__ (req-list-channels-request list-channels-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__22153__auto__ {:http.request.configuration/endpoints portkey.aws.medialive/endpoints, :http.request.configuration/target-prefix nil, :http.request.spec/output-spec :portkey.aws.medialive/list-channels-response, :http.request.configuration/mime-type {"content-type" "application/json"}, :http.request.configuration/request-uri "/prod/channels", :http.request.configuration/version "2017-10-14", :http.request.configuration/service-id "MediaLive", :http.request.spec/input-spec :portkey.aws.medialive/list-channels-request, :http.request.configuration/protocol "rest-json", :http.request.configuration/method :get, :http.request.configuration/response-code 200, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "ListChannels", :http.request.configuration/output-deser-fn response-list-channels-response, :http.request.spec/error-spec {"BadRequestException" :portkey.aws.medialive/bad-request-exception, "InternalServerErrorException" :portkey.aws.medialive/internal-server-error-exception, "ForbiddenException" :portkey.aws.medialive/forbidden-exception, "BadGatewayException" :portkey.aws.medialive/bad-gateway-exception, "GatewayTimeoutException" :portkey.aws.medialive/gateway-timeout-exception, "TooManyRequestsException" :portkey.aws.medialive/too-many-requests-exception}})))))
(clojure.spec.alpha/fdef list-channels :args (clojure.spec.alpha/? :portkey.aws.medialive/list-channels-request) :ret (clojure.spec.alpha/and :portkey.aws.medialive/list-channels-response))

(clojure.core/defn describe-reservation "Get details for a reservation." ([describe-reservation-requestinput] (clojure.core/let [request-function-result__22153__auto__ (req-describe-reservation-request describe-reservation-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__22153__auto__ {:http.request.configuration/endpoints portkey.aws.medialive/endpoints, :http.request.configuration/target-prefix nil, :http.request.spec/output-spec :portkey.aws.medialive/describe-reservation-response, :http.request.configuration/mime-type {"content-type" "application/json"}, :http.request.configuration/request-uri "/prod/reservations/{reservationId}", :http.request.configuration/version "2017-10-14", :http.request.configuration/service-id "MediaLive", :http.request.spec/input-spec :portkey.aws.medialive/describe-reservation-request, :http.request.configuration/protocol "rest-json", :http.request.configuration/method :get, :http.request.configuration/response-code 200, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "DescribeReservation", :http.request.configuration/output-deser-fn response-describe-reservation-response, :http.request.spec/error-spec {"BadRequestException" :portkey.aws.medialive/bad-request-exception, "InternalServerErrorException" :portkey.aws.medialive/internal-server-error-exception, "ForbiddenException" :portkey.aws.medialive/forbidden-exception, "BadGatewayException" :portkey.aws.medialive/bad-gateway-exception, "NotFoundException" :portkey.aws.medialive/not-found-exception, "GatewayTimeoutException" :portkey.aws.medialive/gateway-timeout-exception, "TooManyRequestsException" :portkey.aws.medialive/too-many-requests-exception}})))))
(clojure.spec.alpha/fdef describe-reservation :args (clojure.spec.alpha/tuple :portkey.aws.medialive/describe-reservation-request) :ret (clojure.spec.alpha/and :portkey.aws.medialive/describe-reservation-response))

(clojure.core/defn describe-input-security-group "Produces a summary of an Input Security Group" ([describe-input-security-group-requestinput] (clojure.core/let [request-function-result__22153__auto__ (req-describe-input-security-group-request describe-input-security-group-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__22153__auto__ {:http.request.configuration/endpoints portkey.aws.medialive/endpoints, :http.request.configuration/target-prefix nil, :http.request.spec/output-spec :portkey.aws.medialive/describe-input-security-group-response, :http.request.configuration/mime-type {"content-type" "application/json"}, :http.request.configuration/request-uri "/prod/inputSecurityGroups/{inputSecurityGroupId}", :http.request.configuration/version "2017-10-14", :http.request.configuration/service-id "MediaLive", :http.request.spec/input-spec :portkey.aws.medialive/describe-input-security-group-request, :http.request.configuration/protocol "rest-json", :http.request.configuration/method :get, :http.request.configuration/response-code 200, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "DescribeInputSecurityGroup", :http.request.configuration/output-deser-fn response-describe-input-security-group-response, :http.request.spec/error-spec {"BadRequestException" :portkey.aws.medialive/bad-request-exception, "InternalServerErrorException" :portkey.aws.medialive/internal-server-error-exception, "ForbiddenException" :portkey.aws.medialive/forbidden-exception, "BadGatewayException" :portkey.aws.medialive/bad-gateway-exception, "NotFoundException" :portkey.aws.medialive/not-found-exception, "GatewayTimeoutException" :portkey.aws.medialive/gateway-timeout-exception, "TooManyRequestsException" :portkey.aws.medialive/too-many-requests-exception}})))))
(clojure.spec.alpha/fdef describe-input-security-group :args (clojure.spec.alpha/tuple :portkey.aws.medialive/describe-input-security-group-request) :ret (clojure.spec.alpha/and :portkey.aws.medialive/describe-input-security-group-response))

(clojure.core/defn batch-update-schedule "Update a channel schedule" ([batch-update-schedule-requestinput] (clojure.core/let [request-function-result__22153__auto__ (req-batch-update-schedule-request batch-update-schedule-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__22153__auto__ {:http.request.configuration/endpoints portkey.aws.medialive/endpoints, :http.request.configuration/target-prefix nil, :http.request.spec/output-spec :portkey.aws.medialive/batch-update-schedule-response, :http.request.configuration/mime-type {"content-type" "application/json"}, :http.request.configuration/request-uri "/prod/channels/{channelId}/schedule", :http.request.configuration/version "2017-10-14", :http.request.configuration/service-id "MediaLive", :http.request.spec/input-spec :portkey.aws.medialive/batch-update-schedule-request, :http.request.configuration/protocol "rest-json", :http.request.configuration/method :put, :http.request.configuration/response-code 200, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "BatchUpdateSchedule", :http.request.configuration/output-deser-fn response-batch-update-schedule-response, :http.request.spec/error-spec {"BadRequestException" :portkey.aws.medialive/bad-request-exception, "UnprocessableEntityException" :portkey.aws.medialive/unprocessable-entity-exception, "InternalServerErrorException" :portkey.aws.medialive/internal-server-error-exception, "ForbiddenException" :portkey.aws.medialive/forbidden-exception, "BadGatewayException" :portkey.aws.medialive/bad-gateway-exception, "NotFoundException" :portkey.aws.medialive/not-found-exception, "GatewayTimeoutException" :portkey.aws.medialive/gateway-timeout-exception, "TooManyRequestsException" :portkey.aws.medialive/too-many-requests-exception}})))))
(clojure.spec.alpha/fdef batch-update-schedule :args (clojure.spec.alpha/tuple :portkey.aws.medialive/batch-update-schedule-request) :ret (clojure.spec.alpha/and :portkey.aws.medialive/batch-update-schedule-response))

(clojure.core/defn list-input-security-groups "Produces a list of Input Security Groups for an account" ([] (list-input-security-groups {})) ([list-input-security-groups-requestinput] (clojure.core/let [request-function-result__22153__auto__ (req-list-input-security-groups-request list-input-security-groups-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__22153__auto__ {:http.request.configuration/endpoints portkey.aws.medialive/endpoints, :http.request.configuration/target-prefix nil, :http.request.spec/output-spec :portkey.aws.medialive/list-input-security-groups-response, :http.request.configuration/mime-type {"content-type" "application/json"}, :http.request.configuration/request-uri "/prod/inputSecurityGroups", :http.request.configuration/version "2017-10-14", :http.request.configuration/service-id "MediaLive", :http.request.spec/input-spec :portkey.aws.medialive/list-input-security-groups-request, :http.request.configuration/protocol "rest-json", :http.request.configuration/method :get, :http.request.configuration/response-code 200, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "ListInputSecurityGroups", :http.request.configuration/output-deser-fn response-list-input-security-groups-response, :http.request.spec/error-spec {"BadRequestException" :portkey.aws.medialive/bad-request-exception, "InternalServerErrorException" :portkey.aws.medialive/internal-server-error-exception, "ForbiddenException" :portkey.aws.medialive/forbidden-exception, "BadGatewayException" :portkey.aws.medialive/bad-gateway-exception, "GatewayTimeoutException" :portkey.aws.medialive/gateway-timeout-exception, "TooManyRequestsException" :portkey.aws.medialive/too-many-requests-exception}})))))
(clojure.spec.alpha/fdef list-input-security-groups :args (clojure.spec.alpha/? :portkey.aws.medialive/list-input-security-groups-request) :ret (clojure.spec.alpha/and :portkey.aws.medialive/list-input-security-groups-response))

(clojure.core/defn purchase-offering "Purchase an offering and create a reservation." ([purchase-offering-requestinput] (clojure.core/let [request-function-result__22153__auto__ (req-purchase-offering-request purchase-offering-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__22153__auto__ {:http.request.configuration/endpoints portkey.aws.medialive/endpoints, :http.request.configuration/target-prefix nil, :http.request.spec/output-spec :portkey.aws.medialive/purchase-offering-response, :http.request.configuration/mime-type {"content-type" "application/json"}, :http.request.configuration/request-uri "/prod/offerings/{offeringId}/purchase", :http.request.configuration/version "2017-10-14", :http.request.configuration/service-id "MediaLive", :http.request.spec/input-spec :portkey.aws.medialive/purchase-offering-request, :http.request.configuration/protocol "rest-json", :http.request.configuration/method :post, :http.request.configuration/response-code 201, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "PurchaseOffering", :http.request.configuration/output-deser-fn response-purchase-offering-response, :http.request.spec/error-spec {"BadRequestException" :portkey.aws.medialive/bad-request-exception, "InternalServerErrorException" :portkey.aws.medialive/internal-server-error-exception, "ForbiddenException" :portkey.aws.medialive/forbidden-exception, "BadGatewayException" :portkey.aws.medialive/bad-gateway-exception, "NotFoundException" :portkey.aws.medialive/not-found-exception, "GatewayTimeoutException" :portkey.aws.medialive/gateway-timeout-exception, "TooManyRequestsException" :portkey.aws.medialive/too-many-requests-exception, "ConflictException" :portkey.aws.medialive/conflict-exception}})))))
(clojure.spec.alpha/fdef purchase-offering :args (clojure.spec.alpha/tuple :portkey.aws.medialive/purchase-offering-request) :ret (clojure.spec.alpha/and :portkey.aws.medialive/purchase-offering-response))

(clojure.core/defn list-offerings "List offerings available for purchase." ([] (list-offerings {})) ([list-offerings-requestinput] (clojure.core/let [request-function-result__22153__auto__ (req-list-offerings-request list-offerings-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__22153__auto__ {:http.request.configuration/endpoints portkey.aws.medialive/endpoints, :http.request.configuration/target-prefix nil, :http.request.spec/output-spec :portkey.aws.medialive/list-offerings-response, :http.request.configuration/mime-type {"content-type" "application/json"}, :http.request.configuration/request-uri "/prod/offerings", :http.request.configuration/version "2017-10-14", :http.request.configuration/service-id "MediaLive", :http.request.spec/input-spec :portkey.aws.medialive/list-offerings-request, :http.request.configuration/protocol "rest-json", :http.request.configuration/method :get, :http.request.configuration/response-code 200, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "ListOfferings", :http.request.configuration/output-deser-fn response-list-offerings-response, :http.request.spec/error-spec {"BadRequestException" :portkey.aws.medialive/bad-request-exception, "InternalServerErrorException" :portkey.aws.medialive/internal-server-error-exception, "ForbiddenException" :portkey.aws.medialive/forbidden-exception, "BadGatewayException" :portkey.aws.medialive/bad-gateway-exception, "GatewayTimeoutException" :portkey.aws.medialive/gateway-timeout-exception, "TooManyRequestsException" :portkey.aws.medialive/too-many-requests-exception}})))))
(clojure.spec.alpha/fdef list-offerings :args (clojure.spec.alpha/? :portkey.aws.medialive/list-offerings-request) :ret (clojure.spec.alpha/and :portkey.aws.medialive/list-offerings-response))

(clojure.core/defn stop-channel "Stops a running channel" ([stop-channel-requestinput] (clojure.core/let [request-function-result__22153__auto__ (req-stop-channel-request stop-channel-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__22153__auto__ {:http.request.configuration/endpoints portkey.aws.medialive/endpoints, :http.request.configuration/target-prefix nil, :http.request.spec/output-spec :portkey.aws.medialive/stop-channel-response, :http.request.configuration/mime-type {"content-type" "application/json"}, :http.request.configuration/request-uri "/prod/channels/{channelId}/stop", :http.request.configuration/version "2017-10-14", :http.request.configuration/service-id "MediaLive", :http.request.spec/input-spec :portkey.aws.medialive/stop-channel-request, :http.request.configuration/protocol "rest-json", :http.request.configuration/method :post, :http.request.configuration/response-code 200, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "StopChannel", :http.request.configuration/output-deser-fn response-stop-channel-response, :http.request.spec/error-spec {"BadRequestException" :portkey.aws.medialive/bad-request-exception, "InternalServerErrorException" :portkey.aws.medialive/internal-server-error-exception, "ForbiddenException" :portkey.aws.medialive/forbidden-exception, "BadGatewayException" :portkey.aws.medialive/bad-gateway-exception, "NotFoundException" :portkey.aws.medialive/not-found-exception, "GatewayTimeoutException" :portkey.aws.medialive/gateway-timeout-exception, "TooManyRequestsException" :portkey.aws.medialive/too-many-requests-exception, "ConflictException" :portkey.aws.medialive/conflict-exception}})))))
(clojure.spec.alpha/fdef stop-channel :args (clojure.spec.alpha/tuple :portkey.aws.medialive/stop-channel-request) :ret (clojure.spec.alpha/and :portkey.aws.medialive/stop-channel-response))

(clojure.core/defn update-input "Updates an input." ([update-input-requestinput] (clojure.core/let [request-function-result__22153__auto__ (req-update-input-request update-input-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__22153__auto__ {:http.request.configuration/endpoints portkey.aws.medialive/endpoints, :http.request.configuration/target-prefix nil, :http.request.spec/output-spec :portkey.aws.medialive/update-input-response, :http.request.configuration/mime-type {"content-type" "application/json"}, :http.request.configuration/request-uri "/prod/inputs/{inputId}", :http.request.configuration/version "2017-10-14", :http.request.configuration/service-id "MediaLive", :http.request.spec/input-spec :portkey.aws.medialive/update-input-request, :http.request.configuration/protocol "rest-json", :http.request.configuration/method :put, :http.request.configuration/response-code 200, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "UpdateInput", :http.request.configuration/output-deser-fn response-update-input-response, :http.request.spec/error-spec {"BadRequestException" :portkey.aws.medialive/bad-request-exception, "InternalServerErrorException" :portkey.aws.medialive/internal-server-error-exception, "ForbiddenException" :portkey.aws.medialive/forbidden-exception, "BadGatewayException" :portkey.aws.medialive/bad-gateway-exception, "NotFoundException" :portkey.aws.medialive/not-found-exception, "GatewayTimeoutException" :portkey.aws.medialive/gateway-timeout-exception, "ConflictException" :portkey.aws.medialive/conflict-exception}})))))
(clojure.spec.alpha/fdef update-input :args (clojure.spec.alpha/tuple :portkey.aws.medialive/update-input-request) :ret (clojure.spec.alpha/and :portkey.aws.medialive/update-input-response))

(clojure.core/defn delete-reservation "Delete an expired reservation." ([delete-reservation-requestinput] (clojure.core/let [request-function-result__22153__auto__ (req-delete-reservation-request delete-reservation-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__22153__auto__ {:http.request.configuration/endpoints portkey.aws.medialive/endpoints, :http.request.configuration/target-prefix nil, :http.request.spec/output-spec :portkey.aws.medialive/delete-reservation-response, :http.request.configuration/mime-type {"content-type" "application/json"}, :http.request.configuration/request-uri "/prod/reservations/{reservationId}", :http.request.configuration/version "2017-10-14", :http.request.configuration/service-id "MediaLive", :http.request.spec/input-spec :portkey.aws.medialive/delete-reservation-request, :http.request.configuration/protocol "rest-json", :http.request.configuration/method :delete, :http.request.configuration/response-code 200, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "DeleteReservation", :http.request.configuration/output-deser-fn response-delete-reservation-response, :http.request.spec/error-spec {"BadRequestException" :portkey.aws.medialive/bad-request-exception, "InternalServerErrorException" :portkey.aws.medialive/internal-server-error-exception, "ForbiddenException" :portkey.aws.medialive/forbidden-exception, "BadGatewayException" :portkey.aws.medialive/bad-gateway-exception, "NotFoundException" :portkey.aws.medialive/not-found-exception, "GatewayTimeoutException" :portkey.aws.medialive/gateway-timeout-exception, "TooManyRequestsException" :portkey.aws.medialive/too-many-requests-exception, "ConflictException" :portkey.aws.medialive/conflict-exception}})))))
(clojure.spec.alpha/fdef delete-reservation :args (clojure.spec.alpha/tuple :portkey.aws.medialive/delete-reservation-request) :ret (clojure.spec.alpha/and :portkey.aws.medialive/delete-reservation-response))

(clojure.core/defn create-input-security-group "Creates a Input Security Group" ([] (create-input-security-group {})) ([create-input-security-group-requestinput] (clojure.core/let [request-function-result__22153__auto__ (req-create-input-security-group-request create-input-security-group-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__22153__auto__ {:http.request.configuration/endpoints portkey.aws.medialive/endpoints, :http.request.configuration/target-prefix nil, :http.request.spec/output-spec :portkey.aws.medialive/create-input-security-group-response, :http.request.configuration/mime-type {"content-type" "application/json"}, :http.request.configuration/request-uri "/prod/inputSecurityGroups", :http.request.configuration/version "2017-10-14", :http.request.configuration/service-id "MediaLive", :http.request.spec/input-spec :portkey.aws.medialive/create-input-security-group-request, :http.request.configuration/protocol "rest-json", :http.request.configuration/method :post, :http.request.configuration/response-code 200, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "CreateInputSecurityGroup", :http.request.configuration/output-deser-fn response-create-input-security-group-response, :http.request.spec/error-spec {"BadRequestException" :portkey.aws.medialive/bad-request-exception, "InternalServerErrorException" :portkey.aws.medialive/internal-server-error-exception, "ForbiddenException" :portkey.aws.medialive/forbidden-exception, "BadGatewayException" :portkey.aws.medialive/bad-gateway-exception, "GatewayTimeoutException" :portkey.aws.medialive/gateway-timeout-exception, "TooManyRequestsException" :portkey.aws.medialive/too-many-requests-exception}})))))
(clojure.spec.alpha/fdef create-input-security-group :args (clojure.spec.alpha/? :portkey.aws.medialive/create-input-security-group-request) :ret (clojure.spec.alpha/and :portkey.aws.medialive/create-input-security-group-response))

(clojure.core/defn start-channel "Starts an existing channel" ([start-channel-requestinput] (clojure.core/let [request-function-result__22153__auto__ (req-start-channel-request start-channel-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__22153__auto__ {:http.request.configuration/endpoints portkey.aws.medialive/endpoints, :http.request.configuration/target-prefix nil, :http.request.spec/output-spec :portkey.aws.medialive/start-channel-response, :http.request.configuration/mime-type {"content-type" "application/json"}, :http.request.configuration/request-uri "/prod/channels/{channelId}/start", :http.request.configuration/version "2017-10-14", :http.request.configuration/service-id "MediaLive", :http.request.spec/input-spec :portkey.aws.medialive/start-channel-request, :http.request.configuration/protocol "rest-json", :http.request.configuration/method :post, :http.request.configuration/response-code 200, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "StartChannel", :http.request.configuration/output-deser-fn response-start-channel-response, :http.request.spec/error-spec {"BadRequestException" :portkey.aws.medialive/bad-request-exception, "InternalServerErrorException" :portkey.aws.medialive/internal-server-error-exception, "ForbiddenException" :portkey.aws.medialive/forbidden-exception, "BadGatewayException" :portkey.aws.medialive/bad-gateway-exception, "NotFoundException" :portkey.aws.medialive/not-found-exception, "GatewayTimeoutException" :portkey.aws.medialive/gateway-timeout-exception, "TooManyRequestsException" :portkey.aws.medialive/too-many-requests-exception, "ConflictException" :portkey.aws.medialive/conflict-exception}})))))
(clojure.spec.alpha/fdef start-channel :args (clojure.spec.alpha/tuple :portkey.aws.medialive/start-channel-request) :ret (clojure.spec.alpha/and :portkey.aws.medialive/start-channel-response))

(clojure.core/defn describe-schedule "Get a channel schedule" ([describe-schedule-requestinput] (clojure.core/let [request-function-result__22153__auto__ (req-describe-schedule-request describe-schedule-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__22153__auto__ {:http.request.configuration/endpoints portkey.aws.medialive/endpoints, :http.request.configuration/target-prefix nil, :http.request.spec/output-spec :portkey.aws.medialive/describe-schedule-response, :http.request.configuration/mime-type {"content-type" "application/json"}, :http.request.configuration/request-uri "/prod/channels/{channelId}/schedule", :http.request.configuration/version "2017-10-14", :http.request.configuration/service-id "MediaLive", :http.request.spec/input-spec :portkey.aws.medialive/describe-schedule-request, :http.request.configuration/protocol "rest-json", :http.request.configuration/method :get, :http.request.configuration/response-code 200, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "DescribeSchedule", :http.request.configuration/output-deser-fn response-describe-schedule-response, :http.request.spec/error-spec {"BadRequestException" :portkey.aws.medialive/bad-request-exception, "InternalServerErrorException" :portkey.aws.medialive/internal-server-error-exception, "ForbiddenException" :portkey.aws.medialive/forbidden-exception, "BadGatewayException" :portkey.aws.medialive/bad-gateway-exception, "NotFoundException" :portkey.aws.medialive/not-found-exception, "GatewayTimeoutException" :portkey.aws.medialive/gateway-timeout-exception, "TooManyRequestsException" :portkey.aws.medialive/too-many-requests-exception}})))))
(clojure.spec.alpha/fdef describe-schedule :args (clojure.spec.alpha/tuple :portkey.aws.medialive/describe-schedule-request) :ret (clojure.spec.alpha/and :portkey.aws.medialive/describe-schedule-response))
