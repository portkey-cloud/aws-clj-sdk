(ns portkey.aws.mediaconvert.-2017-08-29 (:require [portkey.aws]))

(def
 endpoints
 '{"ap-northeast-1"
   {:credential-scope
    {:service "mediaconvert", :region "ap-northeast-1"},
    :ssl-common-name "mediaconvert.ap-northeast-1.amazonaws.com",
    :endpoint "https://mediaconvert.ap-northeast-1.amazonaws.com",
    :signature-version :v4},
   "eu-west-1"
   {:credential-scope {:service "mediaconvert", :region "eu-west-1"},
    :ssl-common-name "mediaconvert.eu-west-1.amazonaws.com",
    :endpoint "https://mediaconvert.eu-west-1.amazonaws.com",
    :signature-version :v4},
   "us-east-2"
   {:credential-scope {:service "mediaconvert", :region "us-east-2"},
    :ssl-common-name "mediaconvert.us-east-2.amazonaws.com",
    :endpoint "https://mediaconvert.us-east-2.amazonaws.com",
    :signature-version :v4},
   "ap-southeast-2"
   {:credential-scope
    {:service "mediaconvert", :region "ap-southeast-2"},
    :ssl-common-name "mediaconvert.ap-southeast-2.amazonaws.com",
    :endpoint "https://mediaconvert.ap-southeast-2.amazonaws.com",
    :signature-version :v4},
   "sa-east-1"
   {:credential-scope {:service "mediaconvert", :region "sa-east-1"},
    :ssl-common-name "mediaconvert.sa-east-1.amazonaws.com",
    :endpoint "https://mediaconvert.sa-east-1.amazonaws.com",
    :signature-version :v4},
   "ap-southeast-1"
   {:credential-scope
    {:service "mediaconvert", :region "ap-southeast-1"},
    :ssl-common-name "mediaconvert.ap-southeast-1.amazonaws.com",
    :endpoint "https://mediaconvert.ap-southeast-1.amazonaws.com",
    :signature-version :v4},
   "ap-northeast-2"
   {:credential-scope
    {:service "mediaconvert", :region "ap-northeast-2"},
    :ssl-common-name "mediaconvert.ap-northeast-2.amazonaws.com",
    :endpoint "https://mediaconvert.ap-northeast-2.amazonaws.com",
    :signature-version :v4},
   "ca-central-1"
   {:credential-scope
    {:service "mediaconvert", :region "ca-central-1"},
    :ssl-common-name "mediaconvert.ca-central-1.amazonaws.com",
    :endpoint "https://mediaconvert.ca-central-1.amazonaws.com",
    :signature-version :v4},
   "eu-central-1"
   {:credential-scope
    {:service "mediaconvert", :region "eu-central-1"},
    :ssl-common-name "mediaconvert.eu-central-1.amazonaws.com",
    :endpoint "https://mediaconvert.eu-central-1.amazonaws.com",
    :signature-version :v4},
   "eu-west-2"
   {:credential-scope {:service "mediaconvert", :region "eu-west-2"},
    :ssl-common-name "mediaconvert.eu-west-2.amazonaws.com",
    :endpoint "https://mediaconvert.eu-west-2.amazonaws.com",
    :signature-version :v4},
   "us-gov-west-1"
   {:credential-scope
    {:service "mediaconvert", :region "us-gov-west-1"},
    :ssl-common-name "mediaconvert.us-gov-west-1.amazonaws.com",
    :endpoint "https://mediaconvert.us-gov-west-1.amazonaws.com",
    :signature-version :v4},
   "us-west-2"
   {:credential-scope {:service "mediaconvert", :region "us-west-2"},
    :ssl-common-name "mediaconvert.us-west-2.amazonaws.com",
    :endpoint "https://mediaconvert.us-west-2.amazonaws.com",
    :signature-version :v4},
   "us-east-1"
   {:credential-scope {:service "mediaconvert", :region "us-east-1"},
    :ssl-common-name "mediaconvert.us-east-1.amazonaws.com",
    :endpoint "https://mediaconvert.us-east-1.amazonaws.com",
    :signature-version :v4},
   "us-west-1"
   {:credential-scope {:service "mediaconvert", :region "us-west-1"},
    :ssl-common-name "mediaconvert.us-west-1.amazonaws.com",
    :endpoint "https://mediaconvert.us-west-1.amazonaws.com",
    :signature-version :v4},
   "ap-south-1"
   {:credential-scope {:service "mediaconvert", :region "ap-south-1"},
    :ssl-common-name "mediaconvert.ap-south-1.amazonaws.com",
    :endpoint "https://mediaconvert.ap-south-1.amazonaws.com",
    :signature-version :v4}})

(clojure.core/declare ser-dvb-subtitle-shadow-color)

(clojure.core/declare ser-hls-manifest-compression)

(clojure.core/declare ser-hls-encryption-type)

(clojure.core/declare ser-video-preprocessor)

(clojure.core/declare ser-prores-slow-pal)

(clojure.core/declare ser-hls-manifest-duration-format)

(clojure.core/declare ser-integer-min-negative-60-max-6)

(clojure.core/declare ser-dvb-subtitle-font-color)

(clojure.core/declare ser-output-sdt)

(clojure.core/declare ser-eac-3-dynamic-range-compression-line)

(clojure.core/declare ser-integer-min-0-max-1000)

(clojure.core/declare ser-prores-framerate-conversion-algorithm)

(clojure.core/declare ser-h-264-adaptive-quantization)

(clojure.core/declare ser-order)

(clojure.core/declare ser-noise-reducer-spatial-filter-settings)

(clojure.core/declare ser-drop-frame-timecode)

(clojure.core/declare ser-string-pattern-sn-manifest-confirm-condition-notification-ns)

(clojure.core/declare ser-integer-min-25-max-2000)

(clojure.core/declare ser-timecode-burnin)

(clojure.core/declare ser-scc-destination-framerate)

(clojure.core/declare ser-preset-settings)

(clojure.core/declare ser-commitment)

(clojure.core/declare ser-h-265-sample-adaptive-offset-filter-mode)

(clojure.core/declare ser-ttml-destination-settings)

(clojure.core/declare ser-integer-min-1-max-4)

(clojure.core/declare ser-mpeg-2-framerate-conversion-algorithm)

(clojure.core/declare ser-integer-min-2-max-2147483647)

(clojure.core/declare ser-m-2ts-pcr-control)

(clojure.core/declare ser-mpeg-2-gop-size-units)

(clojure.core/declare ser-string-pattern-sn-signal-processing-notification-ns)

(clojure.core/declare ser-preset-list-by)

(clojure.core/declare ser-esam-signal-processing-notification)

(clojure.core/declare ser-remix-settings)

(clojure.core/declare ser-font-script)

(clojure.core/declare ser-integer-min-0-max-99)

(clojure.core/declare ser-dvb-tdt-settings)

(clojure.core/declare ser-string-min-32-max-32-pattern-09a-faf-32)

(clojure.core/declare ser-cmaf-client-cache)

(clojure.core/declare ser-h-265-par-control)

(clojure.core/declare ser-mpeg-2-adaptive-quantization)

(clojure.core/declare ser-mov-padding-control)

(clojure.core/declare ser-prores-framerate-control)

(clojure.core/declare ser-audio-normalization-algorithm-control)

(clojure.core/declare ser-map-of-audio-selector)

(clojure.core/declare ser-string-pattern-arn-aws-us-gov-acm)

(clojure.core/declare ser-ttml-style-passthrough)

(clojure.core/declare ser-h-264-temporal-adaptive-quantization)

(clojure.core/declare ser-insertable-image)

(clojure.core/declare ser-container-settings)

(clojure.core/declare ser-cmaf-codec-specification)

(clojure.core/declare ser-integer-min-1-max-1)

(clojure.core/declare ser-h-265-gop-b-reference)

(clojure.core/declare ser-h-265-temporal-adaptive-quantization)

(clojure.core/declare ser-audio-description)

(clojure.core/declare ser-job-status)

(clojure.core/declare ser-aac-vbr-quality)

(clojure.core/declare ser-deinterlacer-control)

(clojure.core/declare ser-string-min-11-max-11-pattern-01-d-20305-d-205-d)

(clojure.core/declare ser-track-source-settings)

(clojure.core/declare ser-h-265-codec-level)

(clojure.core/declare ser-string-pattern-ws)

(clojure.core/declare ser-m-3u-8-pcr-control)

(clojure.core/declare ser-integer-min-32-max-8182)

(clojure.core/declare ser-scc-destination-settings)

(clojure.core/declare ser-list-of-id-3-insertion)

(clojure.core/declare ser-h-264-slow-pal)

(clojure.core/declare ser-m-2ts-audio-buffer-model)

(clojure.core/declare ser-h-265-unregistered-sei-timecode)

(clojure.core/declare ser-hls-audio-track-type)

(clojure.core/declare ser-h-264-gop-size-units)

(clojure.core/declare ser-hls-directory-structure)

(clojure.core/declare ser-m-2ts-ebp-placement)

(clojure.core/declare ser-h-265-tiles)

(clojure.core/declare ser-deinterlacer-mode)

(clojure.core/declare ser-motion-image-insertion-offset)

(clojure.core/declare ser-eac-3-settings)

(clojure.core/declare ser-cmaf-segment-control)

(clojure.core/declare ser-caption-destination-type)

(clojure.core/declare ser-hls-key-provider-type)

(clojure.core/declare ser-h-264-dynamic-sub-gop)

(clojure.core/declare ser-audio-normalization-algorithm)

(clojure.core/declare ser-cmaf-encryption-type)

(clojure.core/declare ser-hls-i-frame-only-manifest)

(clojure.core/declare ser-mp-4-moov-placement)

(clojure.core/declare ser-string-pattern-s-3-mm-2-vvmmppeeggaavviimmpp-4-ffllvvmmppttmmppggmm-4-vvttrrppff-4-vvmm-2-ttssttss-264-hh-264-mmkkvvmmoovvmmttssmm-2-ttwwmmvvaassffvvoobb-3-ggpp-3-ggppppmmxxffddiivvxxxxvviiddrraawwddvvggxxffmm-1-vv-3-gg-2-vvmmffmm-3-uu-8-llcchhggxxffmmppeegg-2-mmxxffmmppeegg-2-mmxxffhhddwwaavvyy-4-mmxxmmll)

(clojure.core/declare ser-job-template-settings)

(clojure.core/declare ser-integer-min-0-max-500)

(clojure.core/declare ser-string-min-14-pattern-s-3-scc-scc-ttml-ttml-dfxp-dfxp-stl-stl-srt-srt-smi-smi)

(clojure.core/declare ser-h-264-repeat-pps)

(clojure.core/declare ser-cmaf-manifest-compression)

(clojure.core/declare ser-mpeg-2-interlace-mode)

(clojure.core/declare ser-h-264-telecine)

(clojure.core/declare ser-integer-min-1000-max-288000000)

(clojure.core/declare ser-integer-min-0-max-30000)

(clojure.core/declare ser-esam-manifest-confirm-condition-notification)

(clojure.core/declare ser-job-template-list-by)

(clojure.core/declare ser-container-type)

(clojure.core/declare ser-integer-min-0-max-1152000000)

(clojure.core/declare ser-dvb-sdt-settings)

(clojure.core/declare ser-dvb-subtitle-outline-color)

(clojure.core/declare ser-cmaf-stream-inf-resolution)

(clojure.core/declare ser-h-265-adaptive-quantization)

(clojure.core/declare ser-string-min-24-max-512-pattern-a-za-z-0902)

(clojure.core/declare ser-hls-offline-encrypted)

(clojure.core/declare ser-hls-settings)

(clojure.core/declare ser-ac-3-lfe-filter)

(clojure.core/declare ser-string-pattern-01-d-20305-d-205-d)

(clojure.core/declare ser-integer-min-0-max-9)

(clojure.core/declare ser-mpeg-2-codec-level)

(clojure.core/declare ser-mpeg-2-rate-control-mode)

(clojure.core/declare ser-aiff-settings)

(clojure.core/declare ser-hls-stream-inf-resolution)

(clojure.core/declare ser-h-264-field-encoding)

(clojure.core/declare ser-string-pattern-0940191020191209301)

(clojure.core/declare ser-integer-min-0-max-47185920)

(clojure.core/declare ser-hls-caption-language-setting)

(clojure.core/declare ser-m-2ts-settings)

(clojure.core/declare ser-string)

(clojure.core/declare ser-dvb-sub-source-settings)

(clojure.core/declare ser-input-denoise-filter)

(clojure.core/declare ser-audio-selector-type)

(clojure.core/declare ser-mpeg-2-framerate-control)

(clojure.core/declare ser-afd-signaling)

(clojure.core/declare ser-pricing-plan)

(clojure.core/declare ser-eac-3-metadata-control)

(clojure.core/declare ser-integer-min-0-max-65535)

(clojure.core/declare ser-integer-min-8000-max-192000)

(clojure.core/declare ser-h-264-quality-tuning-level)

(clojure.core/declare ser-m-3u-8-scte-35-source)

(clojure.core/declare ser-noise-reducer-filter)

(clojure.core/declare ser-integer-min-0-max-2147483647)

(clojure.core/declare ser-integer-min-6000-max-1024000)

(clojure.core/declare ser-cmaf-group-settings)

(clojure.core/declare ser-h-265-qvbr-settings)

(clojure.core/declare ser-list-of-output-group)

(clojure.core/declare ser-list-of-caption-description-preset)

(clojure.core/declare ser-motion-image-insertion-mode)

(clojure.core/declare ser-renewal-type)

(clojure.core/declare ser-integer-min-1-max-100)

(clojure.core/declare ser-eac-3-lfe-control)

(clojure.core/declare ser-prores-codec-profile)

(clojure.core/declare ser-teletext-source-settings)

(clojure.core/declare ser-caption-description-preset)

(clojure.core/declare ser-h-264-flicker-adaptive-quantization)

(clojure.core/declare ser-h-265-slow-pal)

(clojure.core/declare ser-eac-3-surround-mode)

(clojure.core/declare ser-string-min-0)

(clojure.core/declare ser-hls-caption-language-mapping)

(clojure.core/declare ser-mpeg-2-syntax)

(clojure.core/declare ser-h-264-codec-profile)

(clojure.core/declare ser-h-265-telecine)

(clojure.core/declare ser-list-of-insertable-image)

(clojure.core/declare ser-wav-format)

(clojure.core/declare ser-list-of-output-channel-mapping)

(clojure.core/declare ser-h-264-unregistered-sei-timecode)

(clojure.core/declare ser-string-pattern-dd)

(clojure.core/declare ser-eac-3-lfe-filter)

(clojure.core/declare ser-input-timecode-source)

(clojure.core/declare ser-timecode-source)

(clojure.core/declare ser-hls-encryption-settings)

(clojure.core/declare ser-h-265-framerate-conversion-algorithm)

(clojure.core/declare ser-h-264-rate-control-mode)

(clojure.core/declare ser-integer-min-0-max-255)

(clojure.core/declare ser-motion-image-insertion-framerate)

(clojure.core/declare ser-video-selector)

(clojure.core/declare ser-burnin-subtitle-teletext-spacing)

(clojure.core/declare ser-ac-3-metadata-control)

(clojure.core/declare ser-double-min-0)

(clojure.core/declare ser-mp-4-settings)

(clojure.core/declare ser-list-of-integer-min-negative-60-max-6)

(clojure.core/declare ser-cmaf-write-hls-manifest)

(clojure.core/declare ser-m-2ts-buffer-model)

(clojure.core/declare ser-integer-min-25-max-10000)

(clojure.core/declare ser-hdr-10-metadata)

(clojure.core/declare ser-eac-3-coding-mode)

(clojure.core/declare ser-caption-description)

(clojure.core/declare ser-dash-iso-segment-control)

(clojure.core/declare ser-m-3u-8-nielsen-id-3)

(clojure.core/declare ser-list-of-integer-min-32-max-8182)

(clojure.core/declare ser-audio-type-control)

(clojure.core/declare ser-hls-output-selection)

(clojure.core/declare ser-speke-key-provider)

(clojure.core/declare ser-deinterlace-algorithm)

(clojure.core/declare ser-ac-3-bitstream-mode)

(clojure.core/declare ser-integer-min-16-max-24)

(clojure.core/declare ser-integer-min-negative-2-max-3)

(clojure.core/declare ser-f-4v-moov-placement)

(clojure.core/declare ser-eac-3-dynamic-range-compression-rf)

(clojure.core/declare ser-aac-raw-format)

(clojure.core/declare ser-string-pattern-s-3-assetmap-xml)

(clojure.core/declare ser-integer-min-32000-max-384000)

(clojure.core/declare ser-timed-metadata)

(clojure.core/declare ser-integer-min-32-max-4096)

(clojure.core/declare ser-h-265-rate-control-mode)

(clojure.core/declare ser-mov-reference)

(clojure.core/declare ser-integer-min-0-max-3600)

(clojure.core/declare ser-acceleration-settings)

(clojure.core/declare ser-string-pattern-s-3)

(clojure.core/declare ser-m-2ts-segmentation-markers)

(clojure.core/declare ser-acceleration-mode)

(clojure.core/declare ser-m-2ts-scte-35-source)

(clojure.core/declare ser-h-264-par-control)

(clojure.core/declare ser-color-corrector)

(clojure.core/declare ser-video-description)

(clojure.core/declare ser-integer-min-0-max-15)

(clojure.core/declare ser-string-min-3-max-3-pattern-1809a-faf-09a-eae)

(clojure.core/declare ser-integer-min-1-max-10)

(clojure.core/declare ser-id-3-insertion)

(clojure.core/declare ser-output-group-settings)

(clojure.core/declare ser-integer-min-32000-max-48000)

(clojure.core/declare ser-string-pattern-s-3-mm-2-vvmmppeeggaavviimmpp-4-ffllvvmmppttmmppggmm-4-vvttrrppff-4-vvmm-2-ttssttss-264-hh-264-mmkkvvmmoovvmmttssmm-2-ttwwmmvvaassffvvoobb-3-ggpp-3-ggppppmmxxffddiivvxxxxvviiddrraawwddvvggxxffmm-1-vv-3-gg-2-vvmmffmm-3-uu-8-llcchhggxxffmmppeegg-2-mmxxffmmppeegg-2-mmxxffhhddwwaavvyy-4-mmaaaaccaaiiffffmmpp-2-aacc-3-eecc-3-ddttssee)

(clojure.core/declare ser-integer-min-96-max-600)

(clojure.core/declare ser-ms-smooth-encryption-settings)

(clojure.core/declare ser-file-source-convert-608-to-708)

(clojure.core/declare ser-map-of-audio-selector-group)

(clojure.core/declare ser-list-of-hls-ad-markers)

(clojure.core/declare ser-list-of-integer-min-1-max-2147483647)

(clojure.core/declare ser-dash-iso-hbbtv-compliance)

(clojure.core/declare ser-input-clipping)

(clojure.core/declare ser-color-space)

(clojure.core/declare ser-scaling-behavior)

(clojure.core/declare ser-mp-2-settings)

(clojure.core/declare ser-mpeg-2-scene-change-detect)

(clojure.core/declare ser-integer-min-1-max-1001)

(clojure.core/declare ser-m-2ts-es-rate-in-pes)

(clojure.core/declare ser-caption-source-settings)

(clojure.core/declare ser-caption-destination-settings)

(clojure.core/declare ser-integer-min-1000-max-30000)

(clojure.core/declare ser-integer-min-1-max-2147483647)

(clojure.core/declare ser-integer-min-32-max-2160)

(clojure.core/declare ser-hls-ad-markers)

(clojure.core/declare ser-list-of-string)

(clojure.core/declare ser-integer-min-10-max-600)

(clojure.core/declare ser-m-2ts-segmentation-style)

(clojure.core/declare ser-channel-mapping)

(clojure.core/declare ser-integer-min-0-max-30)

(clojure.core/declare ser-h-264-framerate-conversion-algorithm)

(clojure.core/declare ser-m-2ts-force-ts-video-ebp-order)

(clojure.core/declare ser-dvb-subtitle-background-color)

(clojure.core/declare ser-string-pattern-https)

(clojure.core/declare ser-audio-normalization-peak-calculation)

(clojure.core/declare ser-integer-min-0-max-16)

(clojure.core/declare ser-integer-min-negative-70-max-0)

(clojure.core/declare ser-anti-alias)

(clojure.core/declare ser-burnin-subtitle-background-color)

(clojure.core/declare ser-m-2ts-rate-mode)

(clojure.core/declare ser-eac-3-bitstream-mode)

(clojure.core/declare ser-timed-metadata-insertion)

(clojure.core/declare ser-input-template)

(clojure.core/declare ser-language-code)

(clojure.core/declare ser-string-min-9-max-19-pattern-az-26-east-west-central-north-south-east-west-1912)

(clojure.core/declare ser-mov-settings)

(clojure.core/declare ser-integer-min-0-max-100)

(clojure.core/declare ser-list-of-hls-caption-language-mapping)

(clojure.core/declare ser-dash-iso-write-segment-timeline-in-representation)

(clojure.core/declare ser-integer-min-1-max-6)

(clojure.core/declare ser-ancillary-source-settings)

(clojure.core/declare ser-input)

(clojure.core/declare ser-h-265-alternate-transfer-function-sei)

(clojure.core/declare ser-m-2ts-ebp-audio-interval)

(clojure.core/declare ser-input-psi-control)

(clojure.core/declare ser-burnin-subtitle-alignment)

(clojure.core/declare ser-file-source-settings)

(clojure.core/declare ser-prores-interlace-mode)

(clojure.core/declare ser-caption-source-type)

(clojure.core/declare ser-string-min-1-max-256)

(clojure.core/declare ser-motion-image-inserter)

(clojure.core/declare ser-color-metadata)

(clojure.core/declare ser-integer-min-48000-max-48000)

(clojure.core/declare ser-double-min-negative-59-max-0)

(clojure.core/declare ser-string-min-16-max-24-pattern-a-za-z-0922-a-za-z-0916)

(clojure.core/declare ser-integer-min-1000-max-300000000)

(clojure.core/declare ser-video-codec-settings)

(clojure.core/declare ser-h-264-qvbr-settings)

(clojure.core/declare ser-ms-smooth-manifest-encoding)

(clojure.core/declare ser-output-group-type)

(clojure.core/declare ser-eac-3-dc-filter)

(clojure.core/declare ser-h-264-scene-change-detect)

(clojure.core/declare ser-noise-reducer)

(clojure.core/declare ser-list-of-string-min-1)

(clojure.core/declare ser-audio-language-code-control)

(clojure.core/declare ser-input-rotate)

(clojure.core/declare ser-integer-min-0-max-50000)

(clojure.core/declare ser-aac-coding-mode)

(clojure.core/declare ser-h-264-spatial-adaptive-quantization)

(clojure.core/declare ser-reservation-plan-settings)

(clojure.core/declare ser-string-pattern-010920405090509092)

(clojure.core/declare ser-output-settings)

(clojure.core/declare ser-burnin-subtitle-shadow-color)

(clojure.core/declare ser-input-decryption-settings)

(clojure.core/declare ser-h-265-gop-size-units)

(clojure.core/declare ser-mp-4-cslg-atom)

(clojure.core/declare ser-list-of-output)

(clojure.core/declare ser-mpeg-2-slow-pal)

(clojure.core/declare ser-teletext-destination-settings)

(clojure.core/declare ser-output-group)

(clojure.core/declare ser-h-265-quality-tuning-level)

(clojure.core/declare ser-mpeg-2-dynamic-sub-gop)

(clojure.core/declare ser-image-inserter)

(clojure.core/declare ser-hls-client-cache)

(clojure.core/declare ser-input-filter-enable)

(clojure.core/declare ser-integer-min-0-max-10000)

(clojure.core/declare ser-burnin-subtitle-outline-color)

(clojure.core/declare ser-embedded-source-settings)

(clojure.core/declare ser-cmaf-key-provider-type)

(clojure.core/declare ser-integer-min-negative-2147483648-max-2147483647)

(clojure.core/declare ser-h-264-gop-b-reference)

(clojure.core/declare ser-video-codec)

(clojure.core/declare ser-list-of-input)

(clojure.core/declare ser-integer-min-negative-5-max-5)

(clojure.core/declare ser-integer-min-24-max-60000)

(clojure.core/declare ser-double-min-negative-60-max-3)

(clojure.core/declare ser-input-deblock-filter)

(clojure.core/declare ser-string-min-14-pattern-s-3-bmp-bmp-png-png-tga-tga)

(clojure.core/declare ser-double-min-0-max-2147483647)

(clojure.core/declare ser-job-settings)

(clojure.core/declare ser-string-min-14-max-1285-pattern-s-3-mov-09-png)

(clojure.core/declare ser-audio-codec)

(clojure.core/declare ser-h-265-settings)

(clojure.core/declare ser-cmaf-initialization-vector-in-manifest)

(clojure.core/declare ser-ac-3-coding-mode)

(clojure.core/declare ser-integer-min-10-max-48)

(clojure.core/declare ser-m-2ts-nielsen-id-3)

(clojure.core/declare ser-integer-min-0-max-10)

(clojure.core/declare ser-aac-rate-control-mode)

(clojure.core/declare ser-h-264-interlace-mode)

(clojure.core/declare ser-mpeg-2-codec-profile)

(clojure.core/declare ser-integer-min-negative-1000-max-1000)

(clojure.core/declare ser-integer-min-1-max-2)

(clojure.core/declare ser-mpeg-2-telecine)

(clojure.core/declare ser-audio-normalization-loudness-logging)

(clojure.core/declare ser-h-265-dynamic-sub-gop)

(clojure.core/declare ser-cmaf-write-dash-manifest)

(clojure.core/declare ser-dvb-subtitle-alignment)

(clojure.core/declare ser-mpeg-2-temporal-adaptive-quantization)

(clojure.core/declare ser-aac-codec-profile)

(clojure.core/declare ser-prores-par-control)

(clojure.core/declare ser-mpeg-2-par-control)

(clojure.core/declare ser-deinterlacer)

(clojure.core/declare ser-cmaf-encryption-settings)

(clojure.core/declare ser-mov-clap-atom)

(clojure.core/declare ser-integer-min-negative-180-max-180)

(clojure.core/declare ser-integer-min-64000-max-640000)

(clojure.core/declare ser-respond-to-afd)

(clojure.core/declare ser-string-pattern-a-za-z-0932)

(clojure.core/declare ser-eac-3-attenuation-control)

(clojure.core/declare ser-integer-min-0-max-96)

(clojure.core/declare ser-h-264-framerate-control)

(clojure.core/declare ser-timecode-config)

(clojure.core/declare ser-dvb-sub-destination-settings)

(clojure.core/declare ser-aac-audio-description-broadcaster-mix)

(clojure.core/declare ser-embedded-convert-608-to-708)

(clojure.core/declare ser-string-min-1)

(clojure.core/declare ser-dvb-subtitle-teletext-spacing)

(clojure.core/declare ser-video-timecode-insertion)

(clojure.core/declare ser-mp-4-free-space-box)

(clojure.core/declare ser-integer-min-1-max-2147483640)

(clojure.core/declare ser-describe-endpoints-mode)

(clojure.core/declare ser-list-of-string-pattern-09a-faf-809a-faf-409a-faf-409a-faf-409a-faf-12)

(clojure.core/declare ser-audio-selector-group)

(clojure.core/declare ser-ac-3-settings)

(clojure.core/declare ser-integer-min-0-max-8)

(clojure.core/declare ser-ms-smooth-group-settings)

(clojure.core/declare ser-h-265-scene-change-detect)

(clojure.core/declare ser-integer-min-0-max-7)

(clojure.core/declare ser-h-264-entropy-encoding)

(clojure.core/declare ser-hls-initialization-vector-in-manifest)

(clojure.core/declare ser-h-265-spatial-adaptive-quantization)

(clojure.core/declare ser-mov-cslg-atom)

(clojure.core/declare ser-output)

(clojure.core/declare ser-string-pattern-identity-a-za-z-26-a-za-z-09163)

(clojure.core/declare ser-integer-min-1-max-17895697)

(clojure.core/declare ser-h-265-codec-profile)

(clojure.core/declare ser-burnin-subtitle-font-color)

(clojure.core/declare ser-color-space-usage)

(clojure.core/declare ser-integer)

(clojure.core/declare ser-aac-settings)

(clojure.core/declare ser-integer-min-1000-max-1466400000)

(clojure.core/declare ser-h-265-temporal-ids)

(clojure.core/declare ser-list-of-caption-description)

(clojure.core/declare ser-embedded-destination-settings)

(clojure.core/declare ser-timecode-burnin-position)

(clojure.core/declare ser-caption-selector)

(clojure.core/declare ser-burnin-destination-settings)

(clojure.core/declare ser-hls-group-settings)

(clojure.core/declare ser-dvb-nit-settings)

(clojure.core/declare ser-integer-min-1-max-20)

(clojure.core/declare ser-cmaf-manifest-duration-format)

(clojure.core/declare ser-queue-list-by)

(clojure.core/declare ser-h-265-write-mp-4-packaging-type)

(clojure.core/declare ser-hls-segment-control)

(clojure.core/declare ser-prores-telecine)

(clojure.core/declare ser-ac-3-dynamic-range-compression-profile)

(clojure.core/declare ser-h-265-flicker-adaptive-quantization)

(clojure.core/declare ser-string-min-3-max-3-pattern-a-za-z-3)

(clojure.core/declare ser-double-min-negative-60-max-negative-1)

(clojure.core/declare ser-m-2ts-scte-35-esam)

(clojure.core/declare ser-frame-capture-settings)

(clojure.core/declare ser-hls-program-date-time)

(clojure.core/declare ser-h-265-framerate-control)

(clojure.core/declare ser-nielsen-configuration)

(clojure.core/declare ser-static-key-provider)

(clojure.core/declare ser-esam-settings)

(clojure.core/declare ser-decryption-mode)

(clojure.core/declare ser-integer-min-1000-max-1152000000)

(clojure.core/declare ser-audio-codec-settings)

(clojure.core/declare ser-mpeg-2-intra-dc-precision)

(clojure.core/declare ser-mpeg-2-spatial-adaptive-quantization)

(clojure.core/declare ser-rectangle)

(clojure.core/declare ser-mpeg-2-quality-tuning-level)

(clojure.core/declare ser-integer-min-1-max-32)

(clojure.core/declare ser-dash-iso-group-settings)

(clojure.core/declare ser-ms-smooth-audio-deduplication)

(clojure.core/declare ser-aac-specification)

(clojure.core/declare ser-eac-3-passthrough-control)

(clojure.core/declare ser-string-pattern-a-za-z-0902)

(clojure.core/declare ser-integer-min-1-max-31)

(clojure.core/declare ser-motion-image-playback)

(clojure.core/declare ser-string-min-14-pattern-s-3-bmp-bmp-png-png)

(clojure.core/declare ser-audio-normalization-settings)

(clojure.core/declare ser-billing-tags-source)

(clojure.core/declare ser-mpeg-2-settings)

(clojure.core/declare ser-h-264-settings)

(clojure.core/declare ser-integer-min-8000-max-96000)

(clojure.core/declare ser-hls-timed-metadata-id-3-frame)

(clojure.core/declare ser-output-channel-mapping)

(clojure.core/declare ser-eac-3-phase-control)

(clojure.core/declare ser-eac-3-surround-ex-mode)

(clojure.core/declare ser-dash-iso-encryption-settings)

(clojure.core/declare ser-integer-min-1-max-8)

(clojure.core/declare ser-list-of-audio-description)

(clojure.core/declare ser-file-group-settings)

(clojure.core/declare ser-integer-min-0-max-3)

(clojure.core/declare ser-m-3u-8-settings)

(clojure.core/declare ser-eac-3-stereo-downmix)

(clojure.core/declare ser-mov-mpeg-2-four-cc-control)

(clojure.core/declare ser-wav-settings)

(clojure.core/declare ser-integer-min-1-max-10000000)

(clojure.core/declare ser-integer-min-0-max-128)

(clojure.core/declare ser-f-4v-settings)

(clojure.core/declare ser-h-264-syntax)

(clojure.core/declare ser-noise-reducer-filter-settings)

(clojure.core/declare ser-list-of-input-clipping)

(clojure.core/declare ser-prores-settings)

(clojure.core/declare ser-map-of-string)

(clojure.core/declare ser-queue-status)

(clojure.core/declare ser-list-of-string-pattern-s-3-assetmap-xml)

(clojure.core/declare ser-list-of-input-template)

(clojure.core/declare ser-string-pattern-09a-faf-809a-faf-409a-faf-409a-faf-409a-faf-12)

(clojure.core/declare ser-h-265-interlace-mode)

(clojure.core/declare ser-hls-codec-specification)

(clojure.core/declare ser-color-space-conversion)

(clojure.core/declare ser-h-264-codec-level)

(clojure.core/declare ser-avail-blanking)

(clojure.core/declare ser-string-pattern)

(clojure.core/declare ser-audio-selector)

(clojure.core/declare ser-map-of-caption-selector)

(clojure.core/declare ser-integer-min-1-max-16)

(clojure.core/declare ser-integer-min-0-max-1466400000)

(clojure.core/declare ser-audio-default-selection)

(clojure.core/defn- ser-dvb-subtitle-shadow-color [input] #:http.request.field{:value (clojure.core/get {"NONE" "NONE", :none "NONE", "BLACK" "BLACK", :black "BLACK", "WHITE" "WHITE", :white "WHITE"} input), :shape "DvbSubtitleShadowColor"})

(clojure.core/defn- ser-hls-manifest-compression [input] #:http.request.field{:value (clojure.core/get {"GZIP" "GZIP", :gzip "GZIP", "NONE" "NONE", :none "NONE"} input), :shape "HlsManifestCompression"})

(clojure.core/defn- ser-hls-encryption-type [input] #:http.request.field{:value (clojure.core/get {"AES128" "AES128", :aes-128 "AES128", "SAMPLE_AES" "SAMPLE_AES", :sample-aes "SAMPLE_AES"} input), :shape "HlsEncryptionType"})

(clojure.core/defn- ser-video-preprocessor [input] (clojure.core/cond-> #:http.request.field{:value [], :shape "VideoPreprocessor", :type "structure"} (clojure.core/contains? input :color-corrector) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-color-corrector (input :color-corrector)) #:http.request.field{:name "ColorCorrector", :shape "ColorCorrector", :location-name "colorCorrector"})) (clojure.core/contains? input :deinterlacer) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-deinterlacer (input :deinterlacer)) #:http.request.field{:name "Deinterlacer", :shape "Deinterlacer", :location-name "deinterlacer"})) (clojure.core/contains? input :image-inserter) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-image-inserter (input :image-inserter)) #:http.request.field{:name "ImageInserter", :shape "ImageInserter", :location-name "imageInserter"})) (clojure.core/contains? input :noise-reducer) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-noise-reducer (input :noise-reducer)) #:http.request.field{:name "NoiseReducer", :shape "NoiseReducer", :location-name "noiseReducer"})) (clojure.core/contains? input :timecode-burnin) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-timecode-burnin (input :timecode-burnin)) #:http.request.field{:name "TimecodeBurnin", :shape "TimecodeBurnin", :location-name "timecodeBurnin"}))))

(clojure.core/defn- ser-prores-slow-pal [input] #:http.request.field{:value (clojure.core/get {"DISABLED" "DISABLED", :disabled "DISABLED", "ENABLED" "ENABLED", :enabled "ENABLED"} input), :shape "ProresSlowPal"})

(clojure.core/defn- ser-hls-manifest-duration-format [input] #:http.request.field{:value (clojure.core/get {"FLOATING_POINT" "FLOATING_POINT", :floating-point "FLOATING_POINT", "INTEGER" "INTEGER", :integer "INTEGER"} input), :shape "HlsManifestDurationFormat"})

(clojure.core/defn- ser-integer-min-negative-60-max-6 [input] #:http.request.field{:value input, :shape "__integerMinNegative60Max6"})

(clojure.core/defn- ser-dvb-subtitle-font-color [input] #:http.request.field{:value (clojure.core/get {:white "WHITE", :yellow "YELLOW", :green "GREEN", "GREEN" "GREEN", "BLUE" "BLUE", :red "RED", :blue "BLUE", "WHITE" "WHITE", "YELLOW" "YELLOW", "BLACK" "BLACK", "RED" "RED", :black "BLACK"} input), :shape "DvbSubtitleFontColor"})

(clojure.core/defn- ser-output-sdt [input] #:http.request.field{:value (clojure.core/get {"SDT_FOLLOW" "SDT_FOLLOW", :sdt-follow "SDT_FOLLOW", "SDT_FOLLOW_IF_PRESENT" "SDT_FOLLOW_IF_PRESENT", :sdt-follow-if-present "SDT_FOLLOW_IF_PRESENT", "SDT_MANUAL" "SDT_MANUAL", :sdt-manual "SDT_MANUAL", "SDT_NONE" "SDT_NONE", :sdt-none "SDT_NONE"} input), :shape "OutputSdt"})

(clojure.core/defn- ser-eac-3-dynamic-range-compression-line [input] #:http.request.field{:value (clojure.core/get {"MUSIC_LIGHT" "MUSIC_LIGHT", :music-standard "MUSIC_STANDARD", :film-standard "FILM_STANDARD", "FILM_STANDARD" "FILM_STANDARD", "NONE" "NONE", "FILM_LIGHT" "FILM_LIGHT", :film-light "FILM_LIGHT", "SPEECH" "SPEECH", :music-light "MUSIC_LIGHT", "MUSIC_STANDARD" "MUSIC_STANDARD", :speech "SPEECH", :none "NONE"} input), :shape "Eac3DynamicRangeCompressionLine"})

(clojure.core/defn- ser-integer-min-0-max-1000 [input] #:http.request.field{:value input, :shape "__integerMin0Max1000"})

(clojure.core/defn- ser-prores-framerate-conversion-algorithm [input] #:http.request.field{:value (clojure.core/get {"DUPLICATE_DROP" "DUPLICATE_DROP", :duplicate-drop "DUPLICATE_DROP", "INTERPOLATE" "INTERPOLATE", :interpolate "INTERPOLATE"} input), :shape "ProresFramerateConversionAlgorithm"})

(clojure.core/defn- ser-h-264-adaptive-quantization [input] #:http.request.field{:value (clojure.core/get {:higher "HIGHER", :medium "MEDIUM", "LOW" "LOW", "MAX" "MAX", :high "HIGH", "HIGHER" "HIGHER", :max "MAX", :off "OFF", "HIGH" "HIGH", :low "LOW", "OFF" "OFF", "MEDIUM" "MEDIUM"} input), :shape "H264AdaptiveQuantization"})

(clojure.core/defn- ser-order [input] #:http.request.field{:value (clojure.core/get {"ASCENDING" "ASCENDING", :ascending "ASCENDING", "DESCENDING" "DESCENDING", :descending "DESCENDING"} input), :shape "Order"})

(clojure.core/defn- ser-noise-reducer-spatial-filter-settings [input] (clojure.core/cond-> #:http.request.field{:value [], :shape "NoiseReducerSpatialFilterSettings", :type "structure"} (clojure.core/contains? input :post-filter-sharpen-strength) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-integer-min-0-max-3 (input :post-filter-sharpen-strength)) #:http.request.field{:name "PostFilterSharpenStrength", :shape "__integerMin0Max3", :location-name "postFilterSharpenStrength"})) (clojure.core/contains? input :speed) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-integer-min-negative-2-max-3 (input :speed)) #:http.request.field{:name "Speed", :shape "__integerMinNegative2Max3", :location-name "speed"})) (clojure.core/contains? input :strength) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-integer-min-0-max-16 (input :strength)) #:http.request.field{:name "Strength", :shape "__integerMin0Max16", :location-name "strength"}))))

(clojure.core/defn- ser-drop-frame-timecode [input] #:http.request.field{:value (clojure.core/get {"DISABLED" "DISABLED", :disabled "DISABLED", "ENABLED" "ENABLED", :enabled "ENABLED"} input), :shape "DropFrameTimecode"})

(clojure.core/defn- ser-string-pattern-sn-manifest-confirm-condition-notification-ns [input] #:http.request.field{:value input, :shape "__stringPatternSNManifestConfirmConditionNotificationNS"})

(clojure.core/defn- ser-integer-min-25-max-2000 [input] #:http.request.field{:value input, :shape "__integerMin25Max2000"})

(clojure.core/defn- ser-timecode-burnin [input] (clojure.core/cond-> #:http.request.field{:value [], :shape "TimecodeBurnin", :type "structure"} (clojure.core/contains? input :font-size) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-integer-min-10-max-48 (input :font-size)) #:http.request.field{:name "FontSize", :shape "__integerMin10Max48", :location-name "fontSize"})) (clojure.core/contains? input :position) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-timecode-burnin-position (input :position)) #:http.request.field{:name "Position", :shape "TimecodeBurninPosition", :location-name "position"})) (clojure.core/contains? input :prefix) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-string-pattern (input :prefix)) #:http.request.field{:name "Prefix", :shape "__stringPattern", :location-name "prefix"}))))

(clojure.core/defn- ser-scc-destination-framerate [input] #:http.request.field{:value (clojure.core/get {"FRAMERATE_23_97" "FRAMERATE_23_97", :framerate-23-97 "FRAMERATE_23_97", "FRAMERATE_24" "FRAMERATE_24", :framerate-24 "FRAMERATE_24", "FRAMERATE_29_97_DROPFRAME" "FRAMERATE_29_97_DROPFRAME", :framerate-29-97-dropframe "FRAMERATE_29_97_DROPFRAME", "FRAMERATE_29_97_NON_DROPFRAME" "FRAMERATE_29_97_NON_DROPFRAME", :framerate-29-97-non-dropframe "FRAMERATE_29_97_NON_DROPFRAME"} input), :shape "SccDestinationFramerate"})

(clojure.core/defn- ser-preset-settings [input] (clojure.core/cond-> #:http.request.field{:value [], :shape "PresetSettings", :type "structure"} (clojure.core/contains? input :audio-descriptions) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-list-of-audio-description (input :audio-descriptions)) #:http.request.field{:name "AudioDescriptions", :shape "__listOfAudioDescription", :location-name "audioDescriptions"})) (clojure.core/contains? input :caption-descriptions) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-list-of-caption-description-preset (input :caption-descriptions)) #:http.request.field{:name "CaptionDescriptions", :shape "__listOfCaptionDescriptionPreset", :location-name "captionDescriptions"})) (clojure.core/contains? input :container-settings) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-container-settings (input :container-settings)) #:http.request.field{:name "ContainerSettings", :shape "ContainerSettings", :location-name "containerSettings"})) (clojure.core/contains? input :video-description) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-video-description (input :video-description)) #:http.request.field{:name "VideoDescription", :shape "VideoDescription", :location-name "videoDescription"}))))

(clojure.core/defn- ser-commitment [input] #:http.request.field{:value (clojure.core/get {"ONE_YEAR" "ONE_YEAR", :one-year "ONE_YEAR"} input), :shape "Commitment"})

(clojure.core/defn- ser-h-265-sample-adaptive-offset-filter-mode [input] #:http.request.field{:value (clojure.core/get {"DEFAULT" "DEFAULT", :default "DEFAULT", "ADAPTIVE" "ADAPTIVE", :adaptive "ADAPTIVE", "OFF" "OFF", :off "OFF"} input), :shape "H265SampleAdaptiveOffsetFilterMode"})

(clojure.core/defn- ser-ttml-destination-settings [input] (clojure.core/cond-> #:http.request.field{:value [], :shape "TtmlDestinationSettings", :type "structure"} (clojure.core/contains? input :style-passthrough) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-ttml-style-passthrough (input :style-passthrough)) #:http.request.field{:name "StylePassthrough", :shape "TtmlStylePassthrough", :location-name "stylePassthrough"}))))

(clojure.core/defn- ser-integer-min-1-max-4 [input] #:http.request.field{:value input, :shape "__integerMin1Max4"})

(clojure.core/defn- ser-mpeg-2-framerate-conversion-algorithm [input] #:http.request.field{:value (clojure.core/get {"DUPLICATE_DROP" "DUPLICATE_DROP", :duplicate-drop "DUPLICATE_DROP", "INTERPOLATE" "INTERPOLATE", :interpolate "INTERPOLATE"} input), :shape "Mpeg2FramerateConversionAlgorithm"})

(clojure.core/defn- ser-integer-min-2-max-2147483647 [input] #:http.request.field{:value input, :shape "__integerMin2Max2147483647"})

(clojure.core/defn- ser-m-2ts-pcr-control [input] #:http.request.field{:value (clojure.core/get {"PCR_EVERY_PES_PACKET" "PCR_EVERY_PES_PACKET", :pcr-every-pes-packet "PCR_EVERY_PES_PACKET", "CONFIGURED_PCR_PERIOD" "CONFIGURED_PCR_PERIOD", :configured-pcr-period "CONFIGURED_PCR_PERIOD"} input), :shape "M2tsPcrControl"})

(clojure.core/defn- ser-mpeg-2-gop-size-units [input] #:http.request.field{:value (clojure.core/get {"FRAMES" "FRAMES", :frames "FRAMES", "SECONDS" "SECONDS", :seconds "SECONDS"} input), :shape "Mpeg2GopSizeUnits"})

(clojure.core/defn- ser-string-pattern-sn-signal-processing-notification-ns [input] #:http.request.field{:value input, :shape "__stringPatternSNSignalProcessingNotificationNS"})

(clojure.core/defn- ser-preset-list-by [input] #:http.request.field{:value (clojure.core/get {"NAME" "NAME", :name "NAME", "CREATION_DATE" "CREATION_DATE", :creation-date "CREATION_DATE", "SYSTEM" "SYSTEM", :system "SYSTEM"} input), :shape "PresetListBy"})

(clojure.core/defn- ser-esam-signal-processing-notification [input] (clojure.core/cond-> #:http.request.field{:value [], :shape "EsamSignalProcessingNotification", :type "structure"} (clojure.core/contains? input :scc-xml) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-string-pattern-sn-signal-processing-notification-ns (input :scc-xml)) #:http.request.field{:name "SccXml", :shape "__stringPatternSNSignalProcessingNotificationNS", :location-name "sccXml"}))))

(clojure.core/defn- ser-remix-settings [input] (clojure.core/cond-> #:http.request.field{:value [], :shape "RemixSettings", :type "structure"} (clojure.core/contains? input :channel-mapping) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-channel-mapping (input :channel-mapping)) #:http.request.field{:name "ChannelMapping", :shape "ChannelMapping", :location-name "channelMapping"})) (clojure.core/contains? input :channels-in) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-integer-min-1-max-16 (input :channels-in)) #:http.request.field{:name "ChannelsIn", :shape "__integerMin1Max16", :location-name "channelsIn"})) (clojure.core/contains? input :channels-out) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-integer-min-1-max-8 (input :channels-out)) #:http.request.field{:name "ChannelsOut", :shape "__integerMin1Max8", :location-name "channelsOut"}))))

(clojure.core/defn- ser-font-script [input] #:http.request.field{:value (clojure.core/get {"AUTOMATIC" "AUTOMATIC", :automatic "AUTOMATIC", "HANS" "HANS", :hans "HANS", "HANT" "HANT", :hant "HANT"} input), :shape "FontScript"})

(clojure.core/defn- ser-integer-min-0-max-99 [input] #:http.request.field{:value input, :shape "__integerMin0Max99"})

(clojure.core/defn- ser-dvb-tdt-settings [input] (clojure.core/cond-> #:http.request.field{:value [], :shape "DvbTdtSettings", :type "structure"} (clojure.core/contains? input :tdt-interval) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-integer-min-1000-max-30000 (input :tdt-interval)) #:http.request.field{:name "TdtInterval", :shape "__integerMin1000Max30000", :location-name "tdtInterval"}))))

(clojure.core/defn- ser-string-min-32-max-32-pattern-09a-faf-32 [input] #:http.request.field{:value input, :shape "__stringMin32Max32Pattern09aFAF32"})

(clojure.core/defn- ser-cmaf-client-cache [input] #:http.request.field{:value (clojure.core/get {"DISABLED" "DISABLED", :disabled "DISABLED", "ENABLED" "ENABLED", :enabled "ENABLED"} input), :shape "CmafClientCache"})

(clojure.core/defn- ser-h-265-par-control [input] #:http.request.field{:value (clojure.core/get {"INITIALIZE_FROM_SOURCE" "INITIALIZE_FROM_SOURCE", :initialize-from-source "INITIALIZE_FROM_SOURCE", "SPECIFIED" "SPECIFIED", :specified "SPECIFIED"} input), :shape "H265ParControl"})

(clojure.core/defn- ser-mpeg-2-adaptive-quantization [input] #:http.request.field{:value (clojure.core/get {"OFF" "OFF", :off "OFF", "LOW" "LOW", :low "LOW", "MEDIUM" "MEDIUM", :medium "MEDIUM", "HIGH" "HIGH", :high "HIGH"} input), :shape "Mpeg2AdaptiveQuantization"})

(clojure.core/defn- ser-mov-padding-control [input] #:http.request.field{:value (clojure.core/get {"OMNEON" "OMNEON", :omneon "OMNEON", "NONE" "NONE", :none "NONE"} input), :shape "MovPaddingControl"})

(clojure.core/defn- ser-prores-framerate-control [input] #:http.request.field{:value (clojure.core/get {"INITIALIZE_FROM_SOURCE" "INITIALIZE_FROM_SOURCE", :initialize-from-source "INITIALIZE_FROM_SOURCE", "SPECIFIED" "SPECIFIED", :specified "SPECIFIED"} input), :shape "ProresFramerateControl"})

(clojure.core/defn- ser-audio-normalization-algorithm-control [input] #:http.request.field{:value (clojure.core/get {"CORRECT_AUDIO" "CORRECT_AUDIO", :correct-audio "CORRECT_AUDIO", "MEASURE_ONLY" "MEASURE_ONLY", :measure-only "MEASURE_ONLY"} input), :shape "AudioNormalizationAlgorithmControl"})

(clojure.core/defn- ser-map-of-audio-selector [input] #:http.request.field{:value (clojure.core/into [] (clojure.core/map (clojure.core/fn [[k v]] [(clojure.core/into (ser-string k) #:http.request.field{:map-info "key", :shape "__string"}) (clojure.core/into (ser-audio-selector v) #:http.request.field{:map-info "value", :shape "AudioSelector"})])) input), :shape "__mapOfAudioSelector", :type "map"})

(clojure.core/defn- ser-string-pattern-arn-aws-us-gov-acm [input] #:http.request.field{:value input, :shape "__stringPatternArnAwsUsGovAcm"})

(clojure.core/defn- ser-ttml-style-passthrough [input] #:http.request.field{:value (clojure.core/get {"ENABLED" "ENABLED", :enabled "ENABLED", "DISABLED" "DISABLED", :disabled "DISABLED"} input), :shape "TtmlStylePassthrough"})

(clojure.core/defn- ser-h-264-temporal-adaptive-quantization [input] #:http.request.field{:value (clojure.core/get {"DISABLED" "DISABLED", :disabled "DISABLED", "ENABLED" "ENABLED", :enabled "ENABLED"} input), :shape "H264TemporalAdaptiveQuantization"})

(clojure.core/defn- ser-insertable-image [input] (clojure.core/cond-> #:http.request.field{:value [], :shape "InsertableImage", :type "structure"} (clojure.core/contains? input :start-time) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-string-pattern-01-d-20305-d-205-d (input :start-time)) #:http.request.field{:name "StartTime", :shape "__stringPattern01D20305D205D", :location-name "startTime"})) (clojure.core/contains? input :opacity) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-integer-min-0-max-100 (input :opacity)) #:http.request.field{:name "Opacity", :shape "__integerMin0Max100", :location-name "opacity"})) (clojure.core/contains? input :image-x) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-integer-min-0-max-2147483647 (input :image-x)) #:http.request.field{:name "ImageX", :shape "__integerMin0Max2147483647", :location-name "imageX"})) (clojure.core/contains? input :width) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-integer-min-0-max-2147483647 (input :width)) #:http.request.field{:name "Width", :shape "__integerMin0Max2147483647", :location-name "width"})) (clojure.core/contains? input :layer) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-integer-min-0-max-99 (input :layer)) #:http.request.field{:name "Layer", :shape "__integerMin0Max99", :location-name "layer"})) (clojure.core/contains? input :duration) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-integer-min-0-max-2147483647 (input :duration)) #:http.request.field{:name "Duration", :shape "__integerMin0Max2147483647", :location-name "duration"})) (clojure.core/contains? input :fade-in) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-integer-min-0-max-2147483647 (input :fade-in)) #:http.request.field{:name "FadeIn", :shape "__integerMin0Max2147483647", :location-name "fadeIn"})) (clojure.core/contains? input :image-inserter-input) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-string-min-14-pattern-s-3-bmp-bmp-png-png-tga-tga (input :image-inserter-input)) #:http.request.field{:name "ImageInserterInput", :shape "__stringMin14PatternS3BmpBMPPngPNGTgaTGA", :location-name "imageInserterInput"})) (clojure.core/contains? input :height) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-integer-min-0-max-2147483647 (input :height)) #:http.request.field{:name "Height", :shape "__integerMin0Max2147483647", :location-name "height"})) (clojure.core/contains? input :image-y) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-integer-min-0-max-2147483647 (input :image-y)) #:http.request.field{:name "ImageY", :shape "__integerMin0Max2147483647", :location-name "imageY"})) (clojure.core/contains? input :fade-out) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-integer-min-0-max-2147483647 (input :fade-out)) #:http.request.field{:name "FadeOut", :shape "__integerMin0Max2147483647", :location-name "fadeOut"}))))

(clojure.core/defn- ser-container-settings [input] (clojure.core/cond-> #:http.request.field{:value [], :shape "ContainerSettings", :type "structure"} (clojure.core/contains? input :container) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-container-type (input :container)) #:http.request.field{:name "Container", :shape "ContainerType", :location-name "container"})) (clojure.core/contains? input :f-4v-settings) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-f-4v-settings (input :f-4v-settings)) #:http.request.field{:name "F4vSettings", :shape "F4vSettings", :location-name "f4vSettings"})) (clojure.core/contains? input :m-2ts-settings) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-m-2ts-settings (input :m-2ts-settings)) #:http.request.field{:name "M2tsSettings", :shape "M2tsSettings", :location-name "m2tsSettings"})) (clojure.core/contains? input :m-3u-8-settings) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-m-3u-8-settings (input :m-3u-8-settings)) #:http.request.field{:name "M3u8Settings", :shape "M3u8Settings", :location-name "m3u8Settings"})) (clojure.core/contains? input :mov-settings) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-mov-settings (input :mov-settings)) #:http.request.field{:name "MovSettings", :shape "MovSettings", :location-name "movSettings"})) (clojure.core/contains? input :mp-4-settings) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-mp-4-settings (input :mp-4-settings)) #:http.request.field{:name "Mp4Settings", :shape "Mp4Settings", :location-name "mp4Settings"}))))

(clojure.core/defn- ser-cmaf-codec-specification [input] #:http.request.field{:value (clojure.core/get {"RFC_6381" "RFC_6381", :rfc-6381 "RFC_6381", "RFC_4281" "RFC_4281", :rfc-4281 "RFC_4281"} input), :shape "CmafCodecSpecification"})

(clojure.core/defn- ser-integer-min-1-max-1 [input] #:http.request.field{:value input, :shape "__integerMin1Max1"})

(clojure.core/defn- ser-h-265-gop-b-reference [input] #:http.request.field{:value (clojure.core/get {"DISABLED" "DISABLED", :disabled "DISABLED", "ENABLED" "ENABLED", :enabled "ENABLED"} input), :shape "H265GopBReference"})

(clojure.core/defn- ser-h-265-temporal-adaptive-quantization [input] #:http.request.field{:value (clojure.core/get {"DISABLED" "DISABLED", :disabled "DISABLED", "ENABLED" "ENABLED", :enabled "ENABLED"} input), :shape "H265TemporalAdaptiveQuantization"})

(clojure.core/defn- ser-audio-description [input] (clojure.core/cond-> #:http.request.field{:value [], :shape "AudioDescription", :type "structure"} (clojure.core/contains? input :custom-language-code) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-string-min-3-max-3-pattern-a-za-z-3 (input :custom-language-code)) #:http.request.field{:name "CustomLanguageCode", :shape "__stringMin3Max3PatternAZaZ3", :location-name "customLanguageCode"})) (clojure.core/contains? input :stream-name) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-string-pattern-ws (input :stream-name)) #:http.request.field{:name "StreamName", :shape "__stringPatternWS", :location-name "streamName"})) (clojure.core/contains? input :remix-settings) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-remix-settings (input :remix-settings)) #:http.request.field{:name "RemixSettings", :shape "RemixSettings", :location-name "remixSettings"})) (clojure.core/contains? input :audio-type) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-integer-min-0-max-255 (input :audio-type)) #:http.request.field{:name "AudioType", :shape "__integerMin0Max255", :location-name "audioType"})) (clojure.core/contains? input :codec-settings) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-audio-codec-settings (input :codec-settings)) #:http.request.field{:name "CodecSettings", :shape "AudioCodecSettings", :location-name "codecSettings"})) (clojure.core/contains? input :language-code-control) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-audio-language-code-control (input :language-code-control)) #:http.request.field{:name "LanguageCodeControl", :shape "AudioLanguageCodeControl", :location-name "languageCodeControl"})) (clojure.core/contains? input :audio-type-control) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-audio-type-control (input :audio-type-control)) #:http.request.field{:name "AudioTypeControl", :shape "AudioTypeControl", :location-name "audioTypeControl"})) (clojure.core/contains? input :language-code) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-language-code (input :language-code)) #:http.request.field{:name "LanguageCode", :shape "LanguageCode", :location-name "languageCode"})) (clojure.core/contains? input :audio-source-name) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-string (input :audio-source-name)) #:http.request.field{:name "AudioSourceName", :shape "__string", :location-name "audioSourceName"})) (clojure.core/contains? input :audio-normalization-settings) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-audio-normalization-settings (input :audio-normalization-settings)) #:http.request.field{:name "AudioNormalizationSettings", :shape "AudioNormalizationSettings", :location-name "audioNormalizationSettings"}))))

(clojure.core/defn- ser-job-status [input] #:http.request.field{:value (clojure.core/get {"CANCELED" "CANCELED", "ERROR" "ERROR", :submitted "SUBMITTED", "SUBMITTED" "SUBMITTED", :canceled "CANCELED", "PROGRESSING" "PROGRESSING", "COMPLETE" "COMPLETE", :progressing "PROGRESSING", :error "ERROR", :complete "COMPLETE"} input), :shape "JobStatus"})

(clojure.core/defn- ser-aac-vbr-quality [input] #:http.request.field{:value (clojure.core/get {"LOW" "LOW", :low "LOW", "MEDIUM_LOW" "MEDIUM_LOW", :medium-low "MEDIUM_LOW", "MEDIUM_HIGH" "MEDIUM_HIGH", :medium-high "MEDIUM_HIGH", "HIGH" "HIGH", :high "HIGH"} input), :shape "AacVbrQuality"})

(clojure.core/defn- ser-deinterlacer-control [input] #:http.request.field{:value (clojure.core/get {"FORCE_ALL_FRAMES" "FORCE_ALL_FRAMES", :force-all-frames "FORCE_ALL_FRAMES", "NORMAL" "NORMAL", :normal "NORMAL"} input), :shape "DeinterlacerControl"})

(clojure.core/defn- ser-string-min-11-max-11-pattern-01-d-20305-d-205-d [input] #:http.request.field{:value input, :shape "__stringMin11Max11Pattern01D20305D205D"})

(clojure.core/defn- ser-track-source-settings [input] (clojure.core/cond-> #:http.request.field{:value [], :shape "TrackSourceSettings", :type "structure"} (clojure.core/contains? input :track-number) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-integer-min-1-max-2147483647 (input :track-number)) #:http.request.field{:name "TrackNumber", :shape "__integerMin1Max2147483647", :location-name "trackNumber"}))))

(clojure.core/defn- ser-h-265-codec-level [input] #:http.request.field{:value (clojure.core/get {:level-2-1 "LEVEL_2_1", :level-5-1 "LEVEL_5_1", :level-3 "LEVEL_3", "LEVEL_2_1" "LEVEL_2_1", :level-6 "LEVEL_6", "LEVEL_5" "LEVEL_5", "LEVEL_1" "LEVEL_1", :level-4 "LEVEL_4", "AUTO" "AUTO", "LEVEL_4_1" "LEVEL_4_1", "LEVEL_5_1" "LEVEL_5_1", "LEVEL_5_2" "LEVEL_5_2", "LEVEL_4" "LEVEL_4", :level-1 "LEVEL_1", :level-4-1 "LEVEL_4_1", "LEVEL_2" "LEVEL_2", "LEVEL_3" "LEVEL_3", :level-3-1 "LEVEL_3_1", "LEVEL_6_2" "LEVEL_6_2", :level-6-2 "LEVEL_6_2", "LEVEL_6" "LEVEL_6", :level-6-1 "LEVEL_6_1", "LEVEL_6_1" "LEVEL_6_1", "LEVEL_3_1" "LEVEL_3_1", :auto "AUTO", :level-5 "LEVEL_5", :level-5-2 "LEVEL_5_2", :level-2 "LEVEL_2"} input), :shape "H265CodecLevel"})

(clojure.core/defn- ser-string-pattern-ws [input] #:http.request.field{:value input, :shape "__stringPatternWS"})

(clojure.core/defn- ser-m-3u-8-pcr-control [input] #:http.request.field{:value (clojure.core/get {"PCR_EVERY_PES_PACKET" "PCR_EVERY_PES_PACKET", :pcr-every-pes-packet "PCR_EVERY_PES_PACKET", "CONFIGURED_PCR_PERIOD" "CONFIGURED_PCR_PERIOD", :configured-pcr-period "CONFIGURED_PCR_PERIOD"} input), :shape "M3u8PcrControl"})

(clojure.core/defn- ser-integer-min-32-max-8182 [input] #:http.request.field{:value input, :shape "__integerMin32Max8182"})

(clojure.core/defn- ser-scc-destination-settings [input] (clojure.core/cond-> #:http.request.field{:value [], :shape "SccDestinationSettings", :type "structure"} (clojure.core/contains? input :framerate) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-scc-destination-framerate (input :framerate)) #:http.request.field{:name "Framerate", :shape "SccDestinationFramerate", :location-name "framerate"}))))

(clojure.core/defn- ser-list-of-id-3-insertion [input] #:http.request.field{:value (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (clojure.core/merge (ser-id-3-insertion coll) #:http.request.field{:shape "Id3Insertion"}))) input), :shape "__listOfId3Insertion", :type "list"})

(clojure.core/defn- ser-h-264-slow-pal [input] #:http.request.field{:value (clojure.core/get {"DISABLED" "DISABLED", :disabled "DISABLED", "ENABLED" "ENABLED", :enabled "ENABLED"} input), :shape "H264SlowPal"})

(clojure.core/defn- ser-m-2ts-audio-buffer-model [input] #:http.request.field{:value (clojure.core/get {"DVB" "DVB", :dvb "DVB", "ATSC" "ATSC", :atsc "ATSC"} input), :shape "M2tsAudioBufferModel"})

(clojure.core/defn- ser-h-265-unregistered-sei-timecode [input] #:http.request.field{:value (clojure.core/get {"DISABLED" "DISABLED", :disabled "DISABLED", "ENABLED" "ENABLED", :enabled "ENABLED"} input), :shape "H265UnregisteredSeiTimecode"})

(clojure.core/defn- ser-hls-audio-track-type [input] #:http.request.field{:value (clojure.core/get {"ALTERNATE_AUDIO_AUTO_SELECT_DEFAULT" "ALTERNATE_AUDIO_AUTO_SELECT_DEFAULT", :alternate-audio-auto-select-default "ALTERNATE_AUDIO_AUTO_SELECT_DEFAULT", "ALTERNATE_AUDIO_AUTO_SELECT" "ALTERNATE_AUDIO_AUTO_SELECT", :alternate-audio-auto-select "ALTERNATE_AUDIO_AUTO_SELECT", "ALTERNATE_AUDIO_NOT_AUTO_SELECT" "ALTERNATE_AUDIO_NOT_AUTO_SELECT", :alternate-audio-not-auto-select "ALTERNATE_AUDIO_NOT_AUTO_SELECT", "AUDIO_ONLY_VARIANT_STREAM" "AUDIO_ONLY_VARIANT_STREAM", :audio-only-variant-stream "AUDIO_ONLY_VARIANT_STREAM"} input), :shape "HlsAudioTrackType"})

(clojure.core/defn- ser-h-264-gop-size-units [input] #:http.request.field{:value (clojure.core/get {"FRAMES" "FRAMES", :frames "FRAMES", "SECONDS" "SECONDS", :seconds "SECONDS"} input), :shape "H264GopSizeUnits"})

(clojure.core/defn- ser-hls-directory-structure [input] #:http.request.field{:value (clojure.core/get {"SINGLE_DIRECTORY" "SINGLE_DIRECTORY", :single-directory "SINGLE_DIRECTORY", "SUBDIRECTORY_PER_STREAM" "SUBDIRECTORY_PER_STREAM", :subdirectory-per-stream "SUBDIRECTORY_PER_STREAM"} input), :shape "HlsDirectoryStructure"})

(clojure.core/defn- ser-m-2ts-ebp-placement [input] #:http.request.field{:value (clojure.core/get {"VIDEO_AND_AUDIO_PIDS" "VIDEO_AND_AUDIO_PIDS", :video-and-audio-pids "VIDEO_AND_AUDIO_PIDS", "VIDEO_PID" "VIDEO_PID", :video-pid "VIDEO_PID"} input), :shape "M2tsEbpPlacement"})

(clojure.core/defn- ser-h-265-tiles [input] #:http.request.field{:value (clojure.core/get {"DISABLED" "DISABLED", :disabled "DISABLED", "ENABLED" "ENABLED", :enabled "ENABLED"} input), :shape "H265Tiles"})

(clojure.core/defn- ser-deinterlacer-mode [input] #:http.request.field{:value (clojure.core/get {"DEINTERLACE" "DEINTERLACE", :deinterlace "DEINTERLACE", "INVERSE_TELECINE" "INVERSE_TELECINE", :inverse-telecine "INVERSE_TELECINE", "ADAPTIVE" "ADAPTIVE", :adaptive "ADAPTIVE"} input), :shape "DeinterlacerMode"})

(clojure.core/defn- ser-motion-image-insertion-offset [input] (clojure.core/cond-> #:http.request.field{:value [], :shape "MotionImageInsertionOffset", :type "structure"} (clojure.core/contains? input :image-x) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-integer-min-0-max-2147483647 (input :image-x)) #:http.request.field{:name "ImageX", :shape "__integerMin0Max2147483647", :location-name "imageX"})) (clojure.core/contains? input :image-y) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-integer-min-0-max-2147483647 (input :image-y)) #:http.request.field{:name "ImageY", :shape "__integerMin0Max2147483647", :location-name "imageY"}))))

(clojure.core/defn- ser-eac-3-settings [input] (clojure.core/cond-> #:http.request.field{:value [], :shape "Eac3Settings", :type "structure"} (clojure.core/contains? input :lt-rt-surround-mix-level) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-double-min-negative-60-max-negative-1 (input :lt-rt-surround-mix-level)) #:http.request.field{:name "LtRtSurroundMixLevel", :shape "__doubleMinNegative60MaxNegative1", :location-name "ltRtSurroundMixLevel"})) (clojure.core/contains? input :coding-mode) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-eac-3-coding-mode (input :coding-mode)) #:http.request.field{:name "CodingMode", :shape "Eac3CodingMode", :location-name "codingMode"})) (clojure.core/contains? input :phase-control) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-eac-3-phase-control (input :phase-control)) #:http.request.field{:name "PhaseControl", :shape "Eac3PhaseControl", :location-name "phaseControl"})) (clojure.core/contains? input :sample-rate) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-integer-min-48000-max-48000 (input :sample-rate)) #:http.request.field{:name "SampleRate", :shape "__integerMin48000Max48000", :location-name "sampleRate"})) (clojure.core/contains? input :passthrough-control) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-eac-3-passthrough-control (input :passthrough-control)) #:http.request.field{:name "PassthroughControl", :shape "Eac3PassthroughControl", :location-name "passthroughControl"})) (clojure.core/contains? input :dynamic-range-compression-line) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-eac-3-dynamic-range-compression-line (input :dynamic-range-compression-line)) #:http.request.field{:name "DynamicRangeCompressionLine", :shape "Eac3DynamicRangeCompressionLine", :location-name "dynamicRangeCompressionLine"})) (clojure.core/contains? input :surround-mode) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-eac-3-surround-mode (input :surround-mode)) #:http.request.field{:name "SurroundMode", :shape "Eac3SurroundMode", :location-name "surroundMode"})) (clojure.core/contains? input :attenuation-control) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-eac-3-attenuation-control (input :attenuation-control)) #:http.request.field{:name "AttenuationControl", :shape "Eac3AttenuationControl", :location-name "attenuationControl"})) (clojure.core/contains? input :dc-filter) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-eac-3-dc-filter (input :dc-filter)) #:http.request.field{:name "DcFilter", :shape "Eac3DcFilter", :location-name "dcFilter"})) (clojure.core/contains? input :lfe-filter) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-eac-3-lfe-filter (input :lfe-filter)) #:http.request.field{:name "LfeFilter", :shape "Eac3LfeFilter", :location-name "lfeFilter"})) (clojure.core/contains? input :lfe-control) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-eac-3-lfe-control (input :lfe-control)) #:http.request.field{:name "LfeControl", :shape "Eac3LfeControl", :location-name "lfeControl"})) (clojure.core/contains? input :lo-ro-center-mix-level) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-double-min-negative-60-max-3 (input :lo-ro-center-mix-level)) #:http.request.field{:name "LoRoCenterMixLevel", :shape "__doubleMinNegative60Max3", :location-name "loRoCenterMixLevel"})) (clojure.core/contains? input :stereo-downmix) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-eac-3-stereo-downmix (input :stereo-downmix)) #:http.request.field{:name "StereoDownmix", :shape "Eac3StereoDownmix", :location-name "stereoDownmix"})) (clojure.core/contains? input :lt-rt-center-mix-level) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-double-min-negative-60-max-3 (input :lt-rt-center-mix-level)) #:http.request.field{:name "LtRtCenterMixLevel", :shape "__doubleMinNegative60Max3", :location-name "ltRtCenterMixLevel"})) (clojure.core/contains? input :surround-ex-mode) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-eac-3-surround-ex-mode (input :surround-ex-mode)) #:http.request.field{:name "SurroundExMode", :shape "Eac3SurroundExMode", :location-name "surroundExMode"})) (clojure.core/contains? input :metadata-control) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-eac-3-metadata-control (input :metadata-control)) #:http.request.field{:name "MetadataControl", :shape "Eac3MetadataControl", :location-name "metadataControl"})) (clojure.core/contains? input :lo-ro-surround-mix-level) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-double-min-negative-60-max-negative-1 (input :lo-ro-surround-mix-level)) #:http.request.field{:name "LoRoSurroundMixLevel", :shape "__doubleMinNegative60MaxNegative1", :location-name "loRoSurroundMixLevel"})) (clojure.core/contains? input :bitstream-mode) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-eac-3-bitstream-mode (input :bitstream-mode)) #:http.request.field{:name "BitstreamMode", :shape "Eac3BitstreamMode", :location-name "bitstreamMode"})) (clojure.core/contains? input :dialnorm) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-integer-min-1-max-31 (input :dialnorm)) #:http.request.field{:name "Dialnorm", :shape "__integerMin1Max31", :location-name "dialnorm"})) (clojure.core/contains? input :dynamic-range-compression-rf) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-eac-3-dynamic-range-compression-rf (input :dynamic-range-compression-rf)) #:http.request.field{:name "DynamicRangeCompressionRf", :shape "Eac3DynamicRangeCompressionRf", :location-name "dynamicRangeCompressionRf"})) (clojure.core/contains? input :bitrate) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-integer-min-64000-max-640000 (input :bitrate)) #:http.request.field{:name "Bitrate", :shape "__integerMin64000Max640000", :location-name "bitrate"}))))

(clojure.core/defn- ser-cmaf-segment-control [input] #:http.request.field{:value (clojure.core/get {"SINGLE_FILE" "SINGLE_FILE", :single-file "SINGLE_FILE", "SEGMENTED_FILES" "SEGMENTED_FILES", :segmented-files "SEGMENTED_FILES"} input), :shape "CmafSegmentControl"})

(clojure.core/defn- ser-caption-destination-type [input] #:http.request.field{:value (clojure.core/get {"EMBEDDED_PLUS_SCTE20" "EMBEDDED_PLUS_SCTE20", "SCC" "SCC", :scc "SCC", :smi "SMI", :burn-in "BURN_IN", "SRT" "SRT", "SCTE20_PLUS_EMBEDDED" "SCTE20_PLUS_EMBEDDED", "TELETEXT" "TELETEXT", "DVB_SUB" "DVB_SUB", "SMI" "SMI", "BURN_IN" "BURN_IN", "WEBVTT" "WEBVTT", :embedded-plus-scte-20 "EMBEDDED_PLUS_SCTE20", :ttml "TTML", :teletext "TELETEXT", :scte-20-plus-embedded "SCTE20_PLUS_EMBEDDED", "EMBEDDED" "EMBEDDED", :webvtt "WEBVTT", "TTML" "TTML", :embedded "EMBEDDED", :srt "SRT", :dvb-sub "DVB_SUB"} input), :shape "CaptionDestinationType"})

(clojure.core/defn- ser-hls-key-provider-type [input] #:http.request.field{:value (clojure.core/get {"SPEKE" "SPEKE", :speke "SPEKE", "STATIC_KEY" "STATIC_KEY", :static-key "STATIC_KEY"} input), :shape "HlsKeyProviderType"})

(clojure.core/defn- ser-h-264-dynamic-sub-gop [input] #:http.request.field{:value (clojure.core/get {"ADAPTIVE" "ADAPTIVE", :adaptive "ADAPTIVE", "STATIC" "STATIC", :static "STATIC"} input), :shape "H264DynamicSubGop"})

(clojure.core/defn- ser-audio-normalization-algorithm [input] #:http.request.field{:value (clojure.core/get {"ITU_BS_1770_1" "ITU_BS_1770_1", :itu-bs-1770-1 "ITU_BS_1770_1", "ITU_BS_1770_2" "ITU_BS_1770_2", :itu-bs-1770-2 "ITU_BS_1770_2"} input), :shape "AudioNormalizationAlgorithm"})

(clojure.core/defn- ser-cmaf-encryption-type [input] #:http.request.field{:value (clojure.core/get {"SAMPLE_AES" "SAMPLE_AES", :sample-aes "SAMPLE_AES"} input), :shape "CmafEncryptionType"})

(clojure.core/defn- ser-hls-i-frame-only-manifest [input] #:http.request.field{:value (clojure.core/get {"INCLUDE" "INCLUDE", :include "INCLUDE", "EXCLUDE" "EXCLUDE", :exclude "EXCLUDE"} input), :shape "HlsIFrameOnlyManifest"})

(clojure.core/defn- ser-mp-4-moov-placement [input] #:http.request.field{:value (clojure.core/get {"PROGRESSIVE_DOWNLOAD" "PROGRESSIVE_DOWNLOAD", :progressive-download "PROGRESSIVE_DOWNLOAD", "NORMAL" "NORMAL", :normal "NORMAL"} input), :shape "Mp4MoovPlacement"})

(clojure.core/defn- ser-string-pattern-s-3-mm-2-vvmmppeeggaavviimmpp-4-ffllvvmmppttmmppggmm-4-vvttrrppff-4-vvmm-2-ttssttss-264-hh-264-mmkkvvmmoovvmmttssmm-2-ttwwmmvvaassffvvoobb-3-ggpp-3-ggppppmmxxffddiivvxxxxvviiddrraawwddvvggxxffmm-1-vv-3-gg-2-vvmmffmm-3-uu-8-llcchhggxxffmmppeegg-2-mmxxffmmppeegg-2-mmxxffhhddwwaavvyy-4-mmxxmmll [input] #:http.request.field{:value input, :shape "__stringPatternS3MM2VVMMPPEEGGAAVVIIMMPP4FFLLVVMMPPTTMMPPGGMM4VVTTRRPPFF4VVMM2TTSSTTSS264HH264MMKKVVMMOOVVMMTTSSMM2TTWWMMVVAASSFFVVOOBB3GGPP3GGPPPPMMXXFFDDIIVVXXXXVVIIDDRRAAWWDDVVGGXXFFMM1VV3GG2VVMMFFMM3UU8LLCCHHGGXXFFMMPPEEGG2MMXXFFMMPPEEGG2MMXXFFHHDDWWAAVVYY4MMXXMMLL"})

(clojure.core/defn- ser-job-template-settings [input] (clojure.core/cond-> #:http.request.field{:value [], :shape "JobTemplateSettings", :type "structure"} (clojure.core/contains? input :esam) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-esam-settings (input :esam)) #:http.request.field{:name "Esam", :shape "EsamSettings", :location-name "esam"})) (clojure.core/contains? input :inputs) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-list-of-input-template (input :inputs)) #:http.request.field{:name "Inputs", :shape "__listOfInputTemplate", :location-name "inputs"})) (clojure.core/contains? input :timed-metadata-insertion) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-timed-metadata-insertion (input :timed-metadata-insertion)) #:http.request.field{:name "TimedMetadataInsertion", :shape "TimedMetadataInsertion", :location-name "timedMetadataInsertion"})) (clojure.core/contains? input :motion-image-inserter) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-motion-image-inserter (input :motion-image-inserter)) #:http.request.field{:name "MotionImageInserter", :shape "MotionImageInserter", :location-name "motionImageInserter"})) (clojure.core/contains? input :timecode-config) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-timecode-config (input :timecode-config)) #:http.request.field{:name "TimecodeConfig", :shape "TimecodeConfig", :location-name "timecodeConfig"})) (clojure.core/contains? input :ad-avail-offset) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-integer-min-negative-1000-max-1000 (input :ad-avail-offset)) #:http.request.field{:name "AdAvailOffset", :shape "__integerMinNegative1000Max1000", :location-name "adAvailOffset"})) (clojure.core/contains? input :output-groups) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-list-of-output-group (input :output-groups)) #:http.request.field{:name "OutputGroups", :shape "__listOfOutputGroup", :location-name "outputGroups"})) (clojure.core/contains? input :nielsen-configuration) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-nielsen-configuration (input :nielsen-configuration)) #:http.request.field{:name "NielsenConfiguration", :shape "NielsenConfiguration", :location-name "nielsenConfiguration"})) (clojure.core/contains? input :avail-blanking) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-avail-blanking (input :avail-blanking)) #:http.request.field{:name "AvailBlanking", :shape "AvailBlanking", :location-name "availBlanking"}))))

(clojure.core/defn- ser-integer-min-0-max-500 [input] #:http.request.field{:value input, :shape "__integerMin0Max500"})

(clojure.core/defn- ser-string-min-14-pattern-s-3-scc-scc-ttml-ttml-dfxp-dfxp-stl-stl-srt-srt-smi-smi [input] #:http.request.field{:value input, :shape "__stringMin14PatternS3SccSCCTtmlTTMLDfxpDFXPStlSTLSrtSRTSmiSMI"})

(clojure.core/defn- ser-h-264-repeat-pps [input] #:http.request.field{:value (clojure.core/get {"DISABLED" "DISABLED", :disabled "DISABLED", "ENABLED" "ENABLED", :enabled "ENABLED"} input), :shape "H264RepeatPps"})

(clojure.core/defn- ser-cmaf-manifest-compression [input] #:http.request.field{:value (clojure.core/get {"GZIP" "GZIP", :gzip "GZIP", "NONE" "NONE", :none "NONE"} input), :shape "CmafManifestCompression"})

(clojure.core/defn- ser-mpeg-2-interlace-mode [input] #:http.request.field{:value (clojure.core/get {:follow-top-field "FOLLOW_TOP_FIELD", :follow-bottom-field "FOLLOW_BOTTOM_FIELD", "BOTTOM_FIELD" "BOTTOM_FIELD", "FOLLOW_TOP_FIELD" "FOLLOW_TOP_FIELD", "PROGRESSIVE" "PROGRESSIVE", "FOLLOW_BOTTOM_FIELD" "FOLLOW_BOTTOM_FIELD", :bottom-field "BOTTOM_FIELD", :progressive "PROGRESSIVE", :top-field "TOP_FIELD", "TOP_FIELD" "TOP_FIELD"} input), :shape "Mpeg2InterlaceMode"})

(clojure.core/defn- ser-h-264-telecine [input] #:http.request.field{:value (clojure.core/get {"NONE" "NONE", :none "NONE", "SOFT" "SOFT", :soft "SOFT", "HARD" "HARD", :hard "HARD"} input), :shape "H264Telecine"})

(clojure.core/defn- ser-integer-min-1000-max-288000000 [input] #:http.request.field{:value input, :shape "__integerMin1000Max288000000"})

(clojure.core/defn- ser-integer-min-0-max-30000 [input] #:http.request.field{:value input, :shape "__integerMin0Max30000"})

(clojure.core/defn- ser-esam-manifest-confirm-condition-notification [input] (clojure.core/cond-> #:http.request.field{:value [], :shape "EsamManifestConfirmConditionNotification", :type "structure"} (clojure.core/contains? input :mcc-xml) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-string-pattern-sn-manifest-confirm-condition-notification-ns (input :mcc-xml)) #:http.request.field{:name "MccXml", :shape "__stringPatternSNManifestConfirmConditionNotificationNS", :location-name "mccXml"}))))

(clojure.core/defn- ser-job-template-list-by [input] #:http.request.field{:value (clojure.core/get {"NAME" "NAME", :name "NAME", "CREATION_DATE" "CREATION_DATE", :creation-date "CREATION_DATE", "SYSTEM" "SYSTEM", :system "SYSTEM"} input), :shape "JobTemplateListBy"})

(clojure.core/defn- ser-container-type [input] #:http.request.field{:value (clojure.core/get {:m-2-ts "M2TS", :ismv "ISMV", :mp-4 "MP4", "MOV" "MOV", "MP4" "MP4", :m-3-u-8 "M3U8", :raw "RAW", :mxf "MXF", "F4V" "F4V", "ISMV" "ISMV", :cmfc "CMFC", "MXF" "MXF", "MPD" "MPD", :f-4-v "F4V", :mov "MOV", "RAW" "RAW", :mpd "MPD", "M3U8" "M3U8", "CMFC" "CMFC", "M2TS" "M2TS"} input), :shape "ContainerType"})

(clojure.core/defn- ser-integer-min-0-max-1152000000 [input] #:http.request.field{:value input, :shape "__integerMin0Max1152000000"})

(clojure.core/defn- ser-dvb-sdt-settings [input] (clojure.core/cond-> #:http.request.field{:value [], :shape "DvbSdtSettings", :type "structure"} (clojure.core/contains? input :output-sdt) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-output-sdt (input :output-sdt)) #:http.request.field{:name "OutputSdt", :shape "OutputSdt", :location-name "outputSdt"})) (clojure.core/contains? input :sdt-interval) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-integer-min-25-max-2000 (input :sdt-interval)) #:http.request.field{:name "SdtInterval", :shape "__integerMin25Max2000", :location-name "sdtInterval"})) (clojure.core/contains? input :service-name) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-string-min-1-max-256 (input :service-name)) #:http.request.field{:name "ServiceName", :shape "__stringMin1Max256", :location-name "serviceName"})) (clojure.core/contains? input :service-provider-name) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-string-min-1-max-256 (input :service-provider-name)) #:http.request.field{:name "ServiceProviderName", :shape "__stringMin1Max256", :location-name "serviceProviderName"}))))

(clojure.core/defn- ser-dvb-subtitle-outline-color [input] #:http.request.field{:value (clojure.core/get {:white "WHITE", :yellow "YELLOW", :green "GREEN", "GREEN" "GREEN", "BLUE" "BLUE", :red "RED", :blue "BLUE", "WHITE" "WHITE", "YELLOW" "YELLOW", "BLACK" "BLACK", "RED" "RED", :black "BLACK"} input), :shape "DvbSubtitleOutlineColor"})

(clojure.core/defn- ser-cmaf-stream-inf-resolution [input] #:http.request.field{:value (clojure.core/get {"INCLUDE" "INCLUDE", :include "INCLUDE", "EXCLUDE" "EXCLUDE", :exclude "EXCLUDE"} input), :shape "CmafStreamInfResolution"})

(clojure.core/defn- ser-h-265-adaptive-quantization [input] #:http.request.field{:value (clojure.core/get {:higher "HIGHER", :medium "MEDIUM", "LOW" "LOW", "MAX" "MAX", :high "HIGH", "HIGHER" "HIGHER", :max "MAX", :off "OFF", "HIGH" "HIGH", :low "LOW", "OFF" "OFF", "MEDIUM" "MEDIUM"} input), :shape "H265AdaptiveQuantization"})

(clojure.core/defn- ser-string-min-24-max-512-pattern-a-za-z-0902 [input] #:http.request.field{:value input, :shape "__stringMin24Max512PatternAZaZ0902"})

(clojure.core/defn- ser-hls-offline-encrypted [input] #:http.request.field{:value (clojure.core/get {"ENABLED" "ENABLED", :enabled "ENABLED", "DISABLED" "DISABLED", :disabled "DISABLED"} input), :shape "HlsOfflineEncrypted"})

(clojure.core/defn- ser-hls-settings [input] (clojure.core/cond-> #:http.request.field{:value [], :shape "HlsSettings", :type "structure"} (clojure.core/contains? input :audio-group-id) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-string (input :audio-group-id)) #:http.request.field{:name "AudioGroupId", :shape "__string", :location-name "audioGroupId"})) (clojure.core/contains? input :audio-rendition-sets) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-string (input :audio-rendition-sets)) #:http.request.field{:name "AudioRenditionSets", :shape "__string", :location-name "audioRenditionSets"})) (clojure.core/contains? input :audio-track-type) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-hls-audio-track-type (input :audio-track-type)) #:http.request.field{:name "AudioTrackType", :shape "HlsAudioTrackType", :location-name "audioTrackType"})) (clojure.core/contains? input :i-frame-only-manifest) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-hls-i-frame-only-manifest (input :i-frame-only-manifest)) #:http.request.field{:name "IFrameOnlyManifest", :shape "HlsIFrameOnlyManifest", :location-name "iFrameOnlyManifest"})) (clojure.core/contains? input :segment-modifier) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-string (input :segment-modifier)) #:http.request.field{:name "SegmentModifier", :shape "__string", :location-name "segmentModifier"}))))

(clojure.core/defn- ser-ac-3-lfe-filter [input] #:http.request.field{:value (clojure.core/get {"ENABLED" "ENABLED", :enabled "ENABLED", "DISABLED" "DISABLED", :disabled "DISABLED"} input), :shape "Ac3LfeFilter"})

(clojure.core/defn- ser-string-pattern-01-d-20305-d-205-d [input] #:http.request.field{:value input, :shape "__stringPattern01D20305D205D"})

(clojure.core/defn- ser-integer-min-0-max-9 [input] #:http.request.field{:value input, :shape "__integerMin0Max9"})

(clojure.core/defn- ser-mpeg-2-codec-level [input] #:http.request.field{:value (clojure.core/get {"HIGH1440" "HIGH1440", :high-1440 "HIGH1440", "AUTO" "AUTO", "LOW" "LOW", :high "HIGH", "MAIN" "MAIN", "HIGH" "HIGH", :low "LOW", :main "MAIN", :auto "AUTO"} input), :shape "Mpeg2CodecLevel"})

(clojure.core/defn- ser-mpeg-2-rate-control-mode [input] #:http.request.field{:value (clojure.core/get {"VBR" "VBR", :vbr "VBR", "CBR" "CBR", :cbr "CBR"} input), :shape "Mpeg2RateControlMode"})

(clojure.core/defn- ser-aiff-settings [input] (clojure.core/cond-> #:http.request.field{:value [], :shape "AiffSettings", :type "structure"} (clojure.core/contains? input :bit-depth) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-integer-min-16-max-24 (input :bit-depth)) #:http.request.field{:name "BitDepth", :shape "__integerMin16Max24", :location-name "bitDepth"})) (clojure.core/contains? input :channels) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-integer-min-1-max-2 (input :channels)) #:http.request.field{:name "Channels", :shape "__integerMin1Max2", :location-name "channels"})) (clojure.core/contains? input :sample-rate) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-integer-min-8000-max-192000 (input :sample-rate)) #:http.request.field{:name "SampleRate", :shape "__integerMin8000Max192000", :location-name "sampleRate"}))))

(clojure.core/defn- ser-hls-stream-inf-resolution [input] #:http.request.field{:value (clojure.core/get {"INCLUDE" "INCLUDE", :include "INCLUDE", "EXCLUDE" "EXCLUDE", :exclude "EXCLUDE"} input), :shape "HlsStreamInfResolution"})

(clojure.core/defn- ser-h-264-field-encoding [input] #:http.request.field{:value (clojure.core/get {"PAFF" "PAFF", :paff "PAFF", "FORCE_FIELD" "FORCE_FIELD", :force-field "FORCE_FIELD"} input), :shape "H264FieldEncoding"})

(clojure.core/defn- ser-string-pattern-0940191020191209301 [input] #:http.request.field{:value input, :shape "__stringPattern0940191020191209301"})

(clojure.core/defn- ser-integer-min-0-max-47185920 [input] #:http.request.field{:value input, :shape "__integerMin0Max47185920"})

(clojure.core/defn- ser-hls-caption-language-setting [input] #:http.request.field{:value (clojure.core/get {"INSERT" "INSERT", :insert "INSERT", "OMIT" "OMIT", :omit "OMIT", "NONE" "NONE", :none "NONE"} input), :shape "HlsCaptionLanguageSetting"})

(clojure.core/defn- ser-m-2ts-settings [input] (clojure.core/cond-> #:http.request.field{:value [], :shape "M2tsSettings", :type "structure"} (clojure.core/contains? input :pat-interval) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-integer-min-0-max-1000 (input :pat-interval)) #:http.request.field{:name "PatInterval", :shape "__integerMin0Max1000", :location-name "patInterval"})) (clojure.core/contains? input :scte-35-source) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-m-2ts-scte-35-source (input :scte-35-source)) #:http.request.field{:name "Scte35Source", :shape "M2tsScte35Source", :location-name "scte35Source"})) (clojure.core/contains? input :buffer-model) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-m-2ts-buffer-model (input :buffer-model)) #:http.request.field{:name "BufferModel", :shape "M2tsBufferModel", :location-name "bufferModel"})) (clojure.core/contains? input :dvb-tdt-settings) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-dvb-tdt-settings (input :dvb-tdt-settings)) #:http.request.field{:name "DvbTdtSettings", :shape "DvbTdtSettings", :location-name "dvbTdtSettings"})) (clojure.core/contains? input :audio-frames-per-pes) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-integer-min-0-max-2147483647 (input :audio-frames-per-pes)) #:http.request.field{:name "AudioFramesPerPes", :shape "__integerMin0Max2147483647", :location-name "audioFramesPerPes"})) (clojure.core/contains? input :fragment-time) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-double-min-0 (input :fragment-time)) #:http.request.field{:name "FragmentTime", :shape "__doubleMin0", :location-name "fragmentTime"})) (clojure.core/contains? input :transport-stream-id) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-integer-min-0-max-65535 (input :transport-stream-id)) #:http.request.field{:name "TransportStreamId", :shape "__integerMin0Max65535", :location-name "transportStreamId"})) (clojure.core/contains? input :dvb-sdt-settings) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-dvb-sdt-settings (input :dvb-sdt-settings)) #:http.request.field{:name "DvbSdtSettings", :shape "DvbSdtSettings", :location-name "dvbSdtSettings"})) (clojure.core/contains? input :pcr-control) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-m-2ts-pcr-control (input :pcr-control)) #:http.request.field{:name "PcrControl", :shape "M2tsPcrControl", :location-name "pcrControl"})) (clojure.core/contains? input :scte-35-pid) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-integer-min-32-max-8182 (input :scte-35-pid)) #:http.request.field{:name "Scte35Pid", :shape "__integerMin32Max8182", :location-name "scte35Pid"})) (clojure.core/contains? input :min-ebp-interval) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-integer-min-0-max-10000 (input :min-ebp-interval)) #:http.request.field{:name "MinEbpInterval", :shape "__integerMin0Max10000", :location-name "minEbpInterval"})) (clojure.core/contains? input :program-number) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-integer-min-0-max-65535 (input :program-number)) #:http.request.field{:name "ProgramNumber", :shape "__integerMin0Max65535", :location-name "programNumber"})) (clojure.core/contains? input :pcr-pid) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-integer-min-32-max-8182 (input :pcr-pid)) #:http.request.field{:name "PcrPid", :shape "__integerMin32Max8182", :location-name "pcrPid"})) (clojure.core/contains? input :pmt-pid) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-integer-min-32-max-8182 (input :pmt-pid)) #:http.request.field{:name "PmtPid", :shape "__integerMin32Max8182", :location-name "pmtPid"})) (clojure.core/contains? input :video-pid) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-integer-min-32-max-8182 (input :video-pid)) #:http.request.field{:name "VideoPid", :shape "__integerMin32Max8182", :location-name "videoPid"})) (clojure.core/contains? input :rate-mode) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-m-2ts-rate-mode (input :rate-mode)) #:http.request.field{:name "RateMode", :shape "M2tsRateMode", :location-name "rateMode"})) (clojure.core/contains? input :audio-pids) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-list-of-integer-min-32-max-8182 (input :audio-pids)) #:http.request.field{:name "AudioPids", :shape "__listOf__integerMin32Max8182", :location-name "audioPids"})) (clojure.core/contains? input :nielsen-id-3) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-m-2ts-nielsen-id-3 (input :nielsen-id-3)) #:http.request.field{:name "NielsenId3", :shape "M2tsNielsenId3", :location-name "nielsenId3"})) (clojure.core/contains? input :max-pcr-interval) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-integer-min-0-max-500 (input :max-pcr-interval)) #:http.request.field{:name "MaxPcrInterval", :shape "__integerMin0Max500", :location-name "maxPcrInterval"})) (clojure.core/contains? input :pmt-interval) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-integer-min-0-max-1000 (input :pmt-interval)) #:http.request.field{:name "PmtInterval", :shape "__integerMin0Max1000", :location-name "pmtInterval"})) (clojure.core/contains? input :segmentation-style) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-m-2ts-segmentation-style (input :segmentation-style)) #:http.request.field{:name "SegmentationStyle", :shape "M2tsSegmentationStyle", :location-name "segmentationStyle"})) (clojure.core/contains? input :null-packet-bitrate) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-double-min-0 (input :null-packet-bitrate)) #:http.request.field{:name "NullPacketBitrate", :shape "__doubleMin0", :location-name "nullPacketBitrate"})) (clojure.core/contains? input :segmentation-markers) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-m-2ts-segmentation-markers (input :segmentation-markers)) #:http.request.field{:name "SegmentationMarkers", :shape "M2tsSegmentationMarkers", :location-name "segmentationMarkers"})) (clojure.core/contains? input :ebp-placement) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-m-2ts-ebp-placement (input :ebp-placement)) #:http.request.field{:name "EbpPlacement", :shape "M2tsEbpPlacement", :location-name "ebpPlacement"})) (clojure.core/contains? input :audio-buffer-model) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-m-2ts-audio-buffer-model (input :audio-buffer-model)) #:http.request.field{:name "AudioBufferModel", :shape "M2tsAudioBufferModel", :location-name "audioBufferModel"})) (clojure.core/contains? input :es-rate-in-pes) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-m-2ts-es-rate-in-pes (input :es-rate-in-pes)) #:http.request.field{:name "EsRateInPes", :shape "M2tsEsRateInPes", :location-name "esRateInPes"})) (clojure.core/contains? input :timed-metadata-pid) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-integer-min-32-max-8182 (input :timed-metadata-pid)) #:http.request.field{:name "TimedMetadataPid", :shape "__integerMin32Max8182", :location-name "timedMetadataPid"})) (clojure.core/contains? input :force-ts-video-ebp-order) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-m-2ts-force-ts-video-ebp-order (input :force-ts-video-ebp-order)) #:http.request.field{:name "ForceTsVideoEbpOrder", :shape "M2tsForceTsVideoEbpOrder", :location-name "forceTsVideoEbpOrder"})) (clojure.core/contains? input :scte-35-esam) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-m-2ts-scte-35-esam (input :scte-35-esam)) #:http.request.field{:name "Scte35Esam", :shape "M2tsScte35Esam", :location-name "scte35Esam"})) (clojure.core/contains? input :dvb-sub-pids) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-list-of-integer-min-32-max-8182 (input :dvb-sub-pids)) #:http.request.field{:name "DvbSubPids", :shape "__listOf__integerMin32Max8182", :location-name "dvbSubPids"})) (clojure.core/contains? input :ebp-audio-interval) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-m-2ts-ebp-audio-interval (input :ebp-audio-interval)) #:http.request.field{:name "EbpAudioInterval", :shape "M2tsEbpAudioInterval", :location-name "ebpAudioInterval"})) (clojure.core/contains? input :dvb-nit-settings) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-dvb-nit-settings (input :dvb-nit-settings)) #:http.request.field{:name "DvbNitSettings", :shape "DvbNitSettings", :location-name "dvbNitSettings"})) (clojure.core/contains? input :private-metadata-pid) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-integer-min-32-max-8182 (input :private-metadata-pid)) #:http.request.field{:name "PrivateMetadataPid", :shape "__integerMin32Max8182", :location-name "privateMetadataPid"})) (clojure.core/contains? input :dvb-teletext-pid) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-integer-min-32-max-8182 (input :dvb-teletext-pid)) #:http.request.field{:name "DvbTeletextPid", :shape "__integerMin32Max8182", :location-name "dvbTeletextPid"})) (clojure.core/contains? input :bitrate) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-integer-min-0-max-2147483647 (input :bitrate)) #:http.request.field{:name "Bitrate", :shape "__integerMin0Max2147483647", :location-name "bitrate"})) (clojure.core/contains? input :segmentation-time) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-double-min-0 (input :segmentation-time)) #:http.request.field{:name "SegmentationTime", :shape "__doubleMin0", :location-name "segmentationTime"}))))

(clojure.core/defn- ser-string [input] #:http.request.field{:value input, :shape "__string"})

(clojure.core/defn- ser-dvb-sub-source-settings [input] (clojure.core/cond-> #:http.request.field{:value [], :shape "DvbSubSourceSettings", :type "structure"} (clojure.core/contains? input :pid) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-integer-min-1-max-2147483647 (input :pid)) #:http.request.field{:name "Pid", :shape "__integerMin1Max2147483647", :location-name "pid"}))))

(clojure.core/defn- ser-input-denoise-filter [input] #:http.request.field{:value (clojure.core/get {"ENABLED" "ENABLED", :enabled "ENABLED", "DISABLED" "DISABLED", :disabled "DISABLED"} input), :shape "InputDenoiseFilter"})

(clojure.core/defn- ser-audio-selector-type [input] #:http.request.field{:value (clojure.core/get {"PID" "PID", :pid "PID", "TRACK" "TRACK", :track "TRACK", "LANGUAGE_CODE" "LANGUAGE_CODE", :language-code "LANGUAGE_CODE"} input), :shape "AudioSelectorType"})

(clojure.core/defn- ser-mpeg-2-framerate-control [input] #:http.request.field{:value (clojure.core/get {"INITIALIZE_FROM_SOURCE" "INITIALIZE_FROM_SOURCE", :initialize-from-source "INITIALIZE_FROM_SOURCE", "SPECIFIED" "SPECIFIED", :specified "SPECIFIED"} input), :shape "Mpeg2FramerateControl"})

(clojure.core/defn- ser-afd-signaling [input] #:http.request.field{:value (clojure.core/get {"NONE" "NONE", :none "NONE", "AUTO" "AUTO", :auto "AUTO", "FIXED" "FIXED", :fixed "FIXED"} input), :shape "AfdSignaling"})

(clojure.core/defn- ser-pricing-plan [input] #:http.request.field{:value (clojure.core/get {"ON_DEMAND" "ON_DEMAND", :on-demand "ON_DEMAND", "RESERVED" "RESERVED", :reserved "RESERVED"} input), :shape "PricingPlan"})

(clojure.core/defn- ser-eac-3-metadata-control [input] #:http.request.field{:value (clojure.core/get {"FOLLOW_INPUT" "FOLLOW_INPUT", :follow-input "FOLLOW_INPUT", "USE_CONFIGURED" "USE_CONFIGURED", :use-configured "USE_CONFIGURED"} input), :shape "Eac3MetadataControl"})

(clojure.core/defn- ser-integer-min-0-max-65535 [input] #:http.request.field{:value input, :shape "__integerMin0Max65535"})

(clojure.core/defn- ser-integer-min-8000-max-192000 [input] #:http.request.field{:value input, :shape "__integerMin8000Max192000"})

(clojure.core/defn- ser-h-264-quality-tuning-level [input] #:http.request.field{:value (clojure.core/get {"SINGLE_PASS" "SINGLE_PASS", :single-pass "SINGLE_PASS", "SINGLE_PASS_HQ" "SINGLE_PASS_HQ", :single-pass-hq "SINGLE_PASS_HQ", "MULTI_PASS_HQ" "MULTI_PASS_HQ", :multi-pass-hq "MULTI_PASS_HQ"} input), :shape "H264QualityTuningLevel"})

(clojure.core/defn- ser-m-3u-8-scte-35-source [input] #:http.request.field{:value (clojure.core/get {"PASSTHROUGH" "PASSTHROUGH", :passthrough "PASSTHROUGH", "NONE" "NONE", :none "NONE"} input), :shape "M3u8Scte35Source"})

(clojure.core/defn- ser-noise-reducer-filter [input] #:http.request.field{:value (clojure.core/get {"LANCZOS" "LANCZOS", :bilateral "BILATERAL", "MEAN" "MEAN", "SPATIAL" "SPATIAL", :conserve "CONSERVE", :mean "MEAN", "GAUSSIAN" "GAUSSIAN", "SHARPEN" "SHARPEN", "BILATERAL" "BILATERAL", :spatial "SPATIAL", :gaussian "GAUSSIAN", :sharpen "SHARPEN", :lanczos "LANCZOS", "CONSERVE" "CONSERVE"} input), :shape "NoiseReducerFilter"})

(clojure.core/defn- ser-integer-min-0-max-2147483647 [input] #:http.request.field{:value input, :shape "__integerMin0Max2147483647"})

(clojure.core/defn- ser-integer-min-6000-max-1024000 [input] #:http.request.field{:value input, :shape "__integerMin6000Max1024000"})

(clojure.core/defn- ser-cmaf-group-settings [input] (clojure.core/cond-> #:http.request.field{:value [], :shape "CmafGroupSettings", :type "structure"} (clojure.core/contains? input :segment-length) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-integer-min-1-max-2147483647 (input :segment-length)) #:http.request.field{:name "SegmentLength", :shape "__integerMin1Max2147483647", :location-name "segmentLength"})) (clojure.core/contains? input :min-buffer-time) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-integer-min-0-max-2147483647 (input :min-buffer-time)) #:http.request.field{:name "MinBufferTime", :shape "__integerMin0Max2147483647", :location-name "minBufferTime"})) (clojure.core/contains? input :fragment-length) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-integer-min-1-max-2147483647 (input :fragment-length)) #:http.request.field{:name "FragmentLength", :shape "__integerMin1Max2147483647", :location-name "fragmentLength"})) (clojure.core/contains? input :segment-control) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-cmaf-segment-control (input :segment-control)) #:http.request.field{:name "SegmentControl", :shape "CmafSegmentControl", :location-name "segmentControl"})) (clojure.core/contains? input :write-hls-manifest) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-cmaf-write-hls-manifest (input :write-hls-manifest)) #:http.request.field{:name "WriteHlsManifest", :shape "CmafWriteHLSManifest", :location-name "writeHlsManifest"})) (clojure.core/contains? input :base-url) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-string (input :base-url)) #:http.request.field{:name "BaseUrl", :shape "__string", :location-name "baseUrl"})) (clojure.core/contains? input :destination) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-string-pattern-s-3 (input :destination)) #:http.request.field{:name "Destination", :shape "__stringPatternS3", :location-name "destination"})) (clojure.core/contains? input :min-final-segment-length) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-double-min-0-max-2147483647 (input :min-final-segment-length)) #:http.request.field{:name "MinFinalSegmentLength", :shape "__doubleMin0Max2147483647", :location-name "minFinalSegmentLength"})) (clojure.core/contains? input :stream-inf-resolution) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-cmaf-stream-inf-resolution (input :stream-inf-resolution)) #:http.request.field{:name "StreamInfResolution", :shape "CmafStreamInfResolution", :location-name "streamInfResolution"})) (clojure.core/contains? input :manifest-duration-format) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-cmaf-manifest-duration-format (input :manifest-duration-format)) #:http.request.field{:name "ManifestDurationFormat", :shape "CmafManifestDurationFormat", :location-name "manifestDurationFormat"})) (clojure.core/contains? input :write-dash-manifest) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-cmaf-write-dash-manifest (input :write-dash-manifest)) #:http.request.field{:name "WriteDashManifest", :shape "CmafWriteDASHManifest", :location-name "writeDashManifest"})) (clojure.core/contains? input :manifest-compression) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-cmaf-manifest-compression (input :manifest-compression)) #:http.request.field{:name "ManifestCompression", :shape "CmafManifestCompression", :location-name "manifestCompression"})) (clojure.core/contains? input :encryption) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-cmaf-encryption-settings (input :encryption)) #:http.request.field{:name "Encryption", :shape "CmafEncryptionSettings", :location-name "encryption"})) (clojure.core/contains? input :codec-specification) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-cmaf-codec-specification (input :codec-specification)) #:http.request.field{:name "CodecSpecification", :shape "CmafCodecSpecification", :location-name "codecSpecification"})) (clojure.core/contains? input :client-cache) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-cmaf-client-cache (input :client-cache)) #:http.request.field{:name "ClientCache", :shape "CmafClientCache", :location-name "clientCache"}))))

(clojure.core/defn- ser-h-265-qvbr-settings [input] (clojure.core/cond-> #:http.request.field{:value [], :shape "H265QvbrSettings", :type "structure"} (clojure.core/contains? input :max-average-bitrate) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-integer-min-1000-max-1466400000 (input :max-average-bitrate)) #:http.request.field{:name "MaxAverageBitrate", :shape "__integerMin1000Max1466400000", :location-name "maxAverageBitrate"})) (clojure.core/contains? input :qvbr-quality-level) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-integer-min-1-max-10 (input :qvbr-quality-level)) #:http.request.field{:name "QvbrQualityLevel", :shape "__integerMin1Max10", :location-name "qvbrQualityLevel"}))))

(clojure.core/defn- ser-list-of-output-group [input] #:http.request.field{:value (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (clojure.core/merge (ser-output-group coll) #:http.request.field{:shape "OutputGroup"}))) input), :shape "__listOfOutputGroup", :type "list"})

(clojure.core/defn- ser-list-of-caption-description-preset [input] #:http.request.field{:value (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (clojure.core/merge (ser-caption-description-preset coll) #:http.request.field{:shape "CaptionDescriptionPreset"}))) input), :shape "__listOfCaptionDescriptionPreset", :type "list"})

(clojure.core/defn- ser-motion-image-insertion-mode [input] #:http.request.field{:value (clojure.core/get {"MOV" "MOV", :mov "MOV", "PNG" "PNG", :png "PNG"} input), :shape "MotionImageInsertionMode"})

(clojure.core/defn- ser-renewal-type [input] #:http.request.field{:value (clojure.core/get {"AUTO_RENEW" "AUTO_RENEW", :auto-renew "AUTO_RENEW", "EXPIRE" "EXPIRE", :expire "EXPIRE"} input), :shape "RenewalType"})

(clojure.core/defn- ser-integer-min-1-max-100 [input] #:http.request.field{:value input, :shape "__integerMin1Max100"})

(clojure.core/defn- ser-eac-3-lfe-control [input] #:http.request.field{:value (clojure.core/get {"LFE" "LFE", :lfe "LFE", "NO_LFE" "NO_LFE", :no-lfe "NO_LFE"} input), :shape "Eac3LfeControl"})

(clojure.core/defn- ser-prores-codec-profile [input] #:http.request.field{:value (clojure.core/get {"APPLE_PRORES_422" "APPLE_PRORES_422", :apple-prores-422 "APPLE_PRORES_422", "APPLE_PRORES_422_HQ" "APPLE_PRORES_422_HQ", :apple-prores-422-hq "APPLE_PRORES_422_HQ", "APPLE_PRORES_422_LT" "APPLE_PRORES_422_LT", :apple-prores-422-lt "APPLE_PRORES_422_LT", "APPLE_PRORES_422_PROXY" "APPLE_PRORES_422_PROXY", :apple-prores-422-proxy "APPLE_PRORES_422_PROXY"} input), :shape "ProresCodecProfile"})

(clojure.core/defn- ser-teletext-source-settings [input] (clojure.core/cond-> #:http.request.field{:value [], :shape "TeletextSourceSettings", :type "structure"} (clojure.core/contains? input :page-number) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-string-min-3-max-3-pattern-1809a-faf-09a-eae (input :page-number)) #:http.request.field{:name "PageNumber", :shape "__stringMin3Max3Pattern1809aFAF09aEAE", :location-name "pageNumber"}))))

(clojure.core/defn- ser-caption-description-preset [input] (clojure.core/cond-> #:http.request.field{:value [], :shape "CaptionDescriptionPreset", :type "structure"} (clojure.core/contains? input :custom-language-code) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-string-min-3-max-3-pattern-a-za-z-3 (input :custom-language-code)) #:http.request.field{:name "CustomLanguageCode", :shape "__stringMin3Max3PatternAZaZ3", :location-name "customLanguageCode"})) (clojure.core/contains? input :destination-settings) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-caption-destination-settings (input :destination-settings)) #:http.request.field{:name "DestinationSettings", :shape "CaptionDestinationSettings", :location-name "destinationSettings"})) (clojure.core/contains? input :language-code) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-language-code (input :language-code)) #:http.request.field{:name "LanguageCode", :shape "LanguageCode", :location-name "languageCode"})) (clojure.core/contains? input :language-description) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-string (input :language-description)) #:http.request.field{:name "LanguageDescription", :shape "__string", :location-name "languageDescription"}))))

(clojure.core/defn- ser-h-264-flicker-adaptive-quantization [input] #:http.request.field{:value (clojure.core/get {"DISABLED" "DISABLED", :disabled "DISABLED", "ENABLED" "ENABLED", :enabled "ENABLED"} input), :shape "H264FlickerAdaptiveQuantization"})

(clojure.core/defn- ser-h-265-slow-pal [input] #:http.request.field{:value (clojure.core/get {"DISABLED" "DISABLED", :disabled "DISABLED", "ENABLED" "ENABLED", :enabled "ENABLED"} input), :shape "H265SlowPal"})

(clojure.core/defn- ser-eac-3-surround-mode [input] #:http.request.field{:value (clojure.core/get {"NOT_INDICATED" "NOT_INDICATED", :not-indicated "NOT_INDICATED", "ENABLED" "ENABLED", :enabled "ENABLED", "DISABLED" "DISABLED", :disabled "DISABLED"} input), :shape "Eac3SurroundMode"})

(clojure.core/defn- ser-string-min-0 [input] #:http.request.field{:value input, :shape "__stringMin0"})

(clojure.core/defn- ser-hls-caption-language-mapping [input] (clojure.core/cond-> #:http.request.field{:value [], :shape "HlsCaptionLanguageMapping", :type "structure"} (clojure.core/contains? input :caption-channel) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-integer-min-negative-2147483648-max-2147483647 (input :caption-channel)) #:http.request.field{:name "CaptionChannel", :shape "__integerMinNegative2147483648Max2147483647", :location-name "captionChannel"})) (clojure.core/contains? input :custom-language-code) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-string-min-3-max-3-pattern-a-za-z-3 (input :custom-language-code)) #:http.request.field{:name "CustomLanguageCode", :shape "__stringMin3Max3PatternAZaZ3", :location-name "customLanguageCode"})) (clojure.core/contains? input :language-code) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-language-code (input :language-code)) #:http.request.field{:name "LanguageCode", :shape "LanguageCode", :location-name "languageCode"})) (clojure.core/contains? input :language-description) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-string (input :language-description)) #:http.request.field{:name "LanguageDescription", :shape "__string", :location-name "languageDescription"}))))

(clojure.core/defn- ser-mpeg-2-syntax [input] #:http.request.field{:value (clojure.core/get {"DEFAULT" "DEFAULT", :default "DEFAULT", "D_10" "D_10", :d-10 "D_10"} input), :shape "Mpeg2Syntax"})

(clojure.core/defn- ser-h-264-codec-profile [input] #:http.request.field{:value (clojure.core/get {:baseline "BASELINE", "HIGH_422" "HIGH_422", :high-422 "HIGH_422", "BASELINE" "BASELINE", :high "HIGH", "MAIN" "MAIN", "HIGH_10BIT" "HIGH_10BIT", "HIGH" "HIGH", "HIGH_422_10BIT" "HIGH_422_10BIT", :high-10-bit "HIGH_10BIT", :high-422-10-bit "HIGH_422_10BIT", :main "MAIN"} input), :shape "H264CodecProfile"})

(clojure.core/defn- ser-h-265-telecine [input] #:http.request.field{:value (clojure.core/get {"NONE" "NONE", :none "NONE", "SOFT" "SOFT", :soft "SOFT", "HARD" "HARD", :hard "HARD"} input), :shape "H265Telecine"})

(clojure.core/defn- ser-list-of-insertable-image [input] #:http.request.field{:value (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (clojure.core/merge (ser-insertable-image coll) #:http.request.field{:shape "InsertableImage"}))) input), :shape "__listOfInsertableImage", :type "list"})

(clojure.core/defn- ser-wav-format [input] #:http.request.field{:value (clojure.core/get {"RIFF" "RIFF", :riff "RIFF", "RF64" "RF64", :rf-64 "RF64"} input), :shape "WavFormat"})

(clojure.core/defn- ser-list-of-output-channel-mapping [input] #:http.request.field{:value (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (clojure.core/merge (ser-output-channel-mapping coll) #:http.request.field{:shape "OutputChannelMapping"}))) input), :shape "__listOfOutputChannelMapping", :type "list"})

(clojure.core/defn- ser-h-264-unregistered-sei-timecode [input] #:http.request.field{:value (clojure.core/get {"DISABLED" "DISABLED", :disabled "DISABLED", "ENABLED" "ENABLED", :enabled "ENABLED"} input), :shape "H264UnregisteredSeiTimecode"})

(clojure.core/defn- ser-string-pattern-dd [input] #:http.request.field{:value input, :shape "__stringPatternDD"})

(clojure.core/defn- ser-eac-3-lfe-filter [input] #:http.request.field{:value (clojure.core/get {"ENABLED" "ENABLED", :enabled "ENABLED", "DISABLED" "DISABLED", :disabled "DISABLED"} input), :shape "Eac3LfeFilter"})

(clojure.core/defn- ser-input-timecode-source [input] #:http.request.field{:value (clojure.core/get {"EMBEDDED" "EMBEDDED", :embedded "EMBEDDED", "ZEROBASED" "ZEROBASED", :zerobased "ZEROBASED", "SPECIFIEDSTART" "SPECIFIEDSTART", :specifiedstart "SPECIFIEDSTART"} input), :shape "InputTimecodeSource"})

(clojure.core/defn- ser-timecode-source [input] #:http.request.field{:value (clojure.core/get {"EMBEDDED" "EMBEDDED", :embedded "EMBEDDED", "ZEROBASED" "ZEROBASED", :zerobased "ZEROBASED", "SPECIFIEDSTART" "SPECIFIEDSTART", :specifiedstart "SPECIFIEDSTART"} input), :shape "TimecodeSource"})

(clojure.core/defn- ser-hls-encryption-settings [input] (clojure.core/cond-> #:http.request.field{:value [], :shape "HlsEncryptionSettings", :type "structure"} (clojure.core/contains? input :constant-initialization-vector) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-string-min-32-max-32-pattern-09a-faf-32 (input :constant-initialization-vector)) #:http.request.field{:name "ConstantInitializationVector", :shape "__stringMin32Max32Pattern09aFAF32", :location-name "constantInitializationVector"})) (clojure.core/contains? input :encryption-method) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-hls-encryption-type (input :encryption-method)) #:http.request.field{:name "EncryptionMethod", :shape "HlsEncryptionType", :location-name "encryptionMethod"})) (clojure.core/contains? input :initialization-vector-in-manifest) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-hls-initialization-vector-in-manifest (input :initialization-vector-in-manifest)) #:http.request.field{:name "InitializationVectorInManifest", :shape "HlsInitializationVectorInManifest", :location-name "initializationVectorInManifest"})) (clojure.core/contains? input :offline-encrypted) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-hls-offline-encrypted (input :offline-encrypted)) #:http.request.field{:name "OfflineEncrypted", :shape "HlsOfflineEncrypted", :location-name "offlineEncrypted"})) (clojure.core/contains? input :speke-key-provider) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-speke-key-provider (input :speke-key-provider)) #:http.request.field{:name "SpekeKeyProvider", :shape "SpekeKeyProvider", :location-name "spekeKeyProvider"})) (clojure.core/contains? input :static-key-provider) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-static-key-provider (input :static-key-provider)) #:http.request.field{:name "StaticKeyProvider", :shape "StaticKeyProvider", :location-name "staticKeyProvider"})) (clojure.core/contains? input :type) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-hls-key-provider-type (input :type)) #:http.request.field{:name "Type", :shape "HlsKeyProviderType", :location-name "type"}))))

(clojure.core/defn- ser-h-265-framerate-conversion-algorithm [input] #:http.request.field{:value (clojure.core/get {"DUPLICATE_DROP" "DUPLICATE_DROP", :duplicate-drop "DUPLICATE_DROP", "INTERPOLATE" "INTERPOLATE", :interpolate "INTERPOLATE"} input), :shape "H265FramerateConversionAlgorithm"})

(clojure.core/defn- ser-h-264-rate-control-mode [input] #:http.request.field{:value (clojure.core/get {"VBR" "VBR", :vbr "VBR", "CBR" "CBR", :cbr "CBR", "QVBR" "QVBR", :qvbr "QVBR"} input), :shape "H264RateControlMode"})

(clojure.core/defn- ser-integer-min-0-max-255 [input] #:http.request.field{:value input, :shape "__integerMin0Max255"})

(clojure.core/defn- ser-motion-image-insertion-framerate [input] (clojure.core/cond-> #:http.request.field{:value [], :shape "MotionImageInsertionFramerate", :type "structure"} (clojure.core/contains? input :framerate-denominator) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-integer-min-1-max-17895697 (input :framerate-denominator)) #:http.request.field{:name "FramerateDenominator", :shape "__integerMin1Max17895697", :location-name "framerateDenominator"})) (clojure.core/contains? input :framerate-numerator) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-integer-min-1-max-2147483640 (input :framerate-numerator)) #:http.request.field{:name "FramerateNumerator", :shape "__integerMin1Max2147483640", :location-name "framerateNumerator"}))))

(clojure.core/defn- ser-video-selector [input] (clojure.core/cond-> #:http.request.field{:value [], :shape "VideoSelector", :type "structure"} (clojure.core/contains? input :color-space) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-color-space (input :color-space)) #:http.request.field{:name "ColorSpace", :shape "ColorSpace", :location-name "colorSpace"})) (clojure.core/contains? input :color-space-usage) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-color-space-usage (input :color-space-usage)) #:http.request.field{:name "ColorSpaceUsage", :shape "ColorSpaceUsage", :location-name "colorSpaceUsage"})) (clojure.core/contains? input :hdr-10-metadata) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-hdr-10-metadata (input :hdr-10-metadata)) #:http.request.field{:name "Hdr10Metadata", :shape "Hdr10Metadata", :location-name "hdr10Metadata"})) (clojure.core/contains? input :pid) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-integer-min-1-max-2147483647 (input :pid)) #:http.request.field{:name "Pid", :shape "__integerMin1Max2147483647", :location-name "pid"})) (clojure.core/contains? input :program-number) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-integer-min-negative-2147483648-max-2147483647 (input :program-number)) #:http.request.field{:name "ProgramNumber", :shape "__integerMinNegative2147483648Max2147483647", :location-name "programNumber"})) (clojure.core/contains? input :rotate) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-input-rotate (input :rotate)) #:http.request.field{:name "Rotate", :shape "InputRotate", :location-name "rotate"}))))

(clojure.core/defn- ser-burnin-subtitle-teletext-spacing [input] #:http.request.field{:value (clojure.core/get {"FIXED_GRID" "FIXED_GRID", :fixed-grid "FIXED_GRID", "PROPORTIONAL" "PROPORTIONAL", :proportional "PROPORTIONAL"} input), :shape "BurninSubtitleTeletextSpacing"})

(clojure.core/defn- ser-ac-3-metadata-control [input] #:http.request.field{:value (clojure.core/get {"FOLLOW_INPUT" "FOLLOW_INPUT", :follow-input "FOLLOW_INPUT", "USE_CONFIGURED" "USE_CONFIGURED", :use-configured "USE_CONFIGURED"} input), :shape "Ac3MetadataControl"})

(clojure.core/defn- ser-double-min-0 [input] #:http.request.field{:value input, :shape "__doubleMin0"})

(clojure.core/defn- ser-mp-4-settings [input] (clojure.core/cond-> #:http.request.field{:value [], :shape "Mp4Settings", :type "structure"} (clojure.core/contains? input :cslg-atom) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-mp-4-cslg-atom (input :cslg-atom)) #:http.request.field{:name "CslgAtom", :shape "Mp4CslgAtom", :location-name "cslgAtom"})) (clojure.core/contains? input :free-space-box) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-mp-4-free-space-box (input :free-space-box)) #:http.request.field{:name "FreeSpaceBox", :shape "Mp4FreeSpaceBox", :location-name "freeSpaceBox"})) (clojure.core/contains? input :moov-placement) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-mp-4-moov-placement (input :moov-placement)) #:http.request.field{:name "MoovPlacement", :shape "Mp4MoovPlacement", :location-name "moovPlacement"})) (clojure.core/contains? input :mp-4-major-brand) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-string (input :mp-4-major-brand)) #:http.request.field{:name "Mp4MajorBrand", :shape "__string", :location-name "mp4MajorBrand"}))))

(clojure.core/defn- ser-list-of-integer-min-negative-60-max-6 [input] #:http.request.field{:value (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (clojure.core/merge (ser-integer-min-negative-60-max-6 coll) #:http.request.field{:shape "__integerMinNegative60Max6"}))) input), :shape "__listOf__integerMinNegative60Max6", :type "list"})

(clojure.core/defn- ser-cmaf-write-hls-manifest [input] #:http.request.field{:value (clojure.core/get {"DISABLED" "DISABLED", :disabled "DISABLED", "ENABLED" "ENABLED", :enabled "ENABLED"} input), :shape "CmafWriteHLSManifest"})

(clojure.core/defn- ser-m-2ts-buffer-model [input] #:http.request.field{:value (clojure.core/get {"MULTIPLEX" "MULTIPLEX", :multiplex "MULTIPLEX", "NONE" "NONE", :none "NONE"} input), :shape "M2tsBufferModel"})

(clojure.core/defn- ser-integer-min-25-max-10000 [input] #:http.request.field{:value input, :shape "__integerMin25Max10000"})

(clojure.core/defn- ser-hdr-10-metadata [input] (clojure.core/cond-> #:http.request.field{:value [], :shape "Hdr10Metadata", :type "structure"} (clojure.core/contains? input :min-luminance) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-integer-min-0-max-2147483647 (input :min-luminance)) #:http.request.field{:name "MinLuminance", :shape "__integerMin0Max2147483647", :location-name "minLuminance"})) (clojure.core/contains? input :blue-primary-x) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-integer-min-0-max-50000 (input :blue-primary-x)) #:http.request.field{:name "BluePrimaryX", :shape "__integerMin0Max50000", :location-name "bluePrimaryX"})) (clojure.core/contains? input :green-primary-x) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-integer-min-0-max-50000 (input :green-primary-x)) #:http.request.field{:name "GreenPrimaryX", :shape "__integerMin0Max50000", :location-name "greenPrimaryX"})) (clojure.core/contains? input :max-luminance) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-integer-min-0-max-2147483647 (input :max-luminance)) #:http.request.field{:name "MaxLuminance", :shape "__integerMin0Max2147483647", :location-name "maxLuminance"})) (clojure.core/contains? input :max-frame-average-light-level) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-integer-min-0-max-65535 (input :max-frame-average-light-level)) #:http.request.field{:name "MaxFrameAverageLightLevel", :shape "__integerMin0Max65535", :location-name "maxFrameAverageLightLevel"})) (clojure.core/contains? input :green-primary-y) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-integer-min-0-max-50000 (input :green-primary-y)) #:http.request.field{:name "GreenPrimaryY", :shape "__integerMin0Max50000", :location-name "greenPrimaryY"})) (clojure.core/contains? input :max-content-light-level) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-integer-min-0-max-65535 (input :max-content-light-level)) #:http.request.field{:name "MaxContentLightLevel", :shape "__integerMin0Max65535", :location-name "maxContentLightLevel"})) (clojure.core/contains? input :white-point-x) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-integer-min-0-max-50000 (input :white-point-x)) #:http.request.field{:name "WhitePointX", :shape "__integerMin0Max50000", :location-name "whitePointX"})) (clojure.core/contains? input :red-primary-x) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-integer-min-0-max-50000 (input :red-primary-x)) #:http.request.field{:name "RedPrimaryX", :shape "__integerMin0Max50000", :location-name "redPrimaryX"})) (clojure.core/contains? input :white-point-y) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-integer-min-0-max-50000 (input :white-point-y)) #:http.request.field{:name "WhitePointY", :shape "__integerMin0Max50000", :location-name "whitePointY"})) (clojure.core/contains? input :blue-primary-y) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-integer-min-0-max-50000 (input :blue-primary-y)) #:http.request.field{:name "BluePrimaryY", :shape "__integerMin0Max50000", :location-name "bluePrimaryY"})) (clojure.core/contains? input :red-primary-y) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-integer-min-0-max-50000 (input :red-primary-y)) #:http.request.field{:name "RedPrimaryY", :shape "__integerMin0Max50000", :location-name "redPrimaryY"}))))

(clojure.core/defn- ser-eac-3-coding-mode [input] #:http.request.field{:value (clojure.core/get {"CODING_MODE_1_0" "CODING_MODE_1_0", :coding-mode-1-0 "CODING_MODE_1_0", "CODING_MODE_2_0" "CODING_MODE_2_0", :coding-mode-2-0 "CODING_MODE_2_0", "CODING_MODE_3_2" "CODING_MODE_3_2", :coding-mode-3-2 "CODING_MODE_3_2"} input), :shape "Eac3CodingMode"})

(clojure.core/defn- ser-caption-description [input] (clojure.core/cond-> #:http.request.field{:value [], :shape "CaptionDescription", :type "structure"} (clojure.core/contains? input :caption-selector-name) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-string-min-1 (input :caption-selector-name)) #:http.request.field{:name "CaptionSelectorName", :shape "__stringMin1", :location-name "captionSelectorName"})) (clojure.core/contains? input :custom-language-code) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-string-min-3-max-3-pattern-a-za-z-3 (input :custom-language-code)) #:http.request.field{:name "CustomLanguageCode", :shape "__stringMin3Max3PatternAZaZ3", :location-name "customLanguageCode"})) (clojure.core/contains? input :destination-settings) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-caption-destination-settings (input :destination-settings)) #:http.request.field{:name "DestinationSettings", :shape "CaptionDestinationSettings", :location-name "destinationSettings"})) (clojure.core/contains? input :language-code) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-language-code (input :language-code)) #:http.request.field{:name "LanguageCode", :shape "LanguageCode", :location-name "languageCode"})) (clojure.core/contains? input :language-description) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-string (input :language-description)) #:http.request.field{:name "LanguageDescription", :shape "__string", :location-name "languageDescription"}))))

(clojure.core/defn- ser-dash-iso-segment-control [input] #:http.request.field{:value (clojure.core/get {"SINGLE_FILE" "SINGLE_FILE", :single-file "SINGLE_FILE", "SEGMENTED_FILES" "SEGMENTED_FILES", :segmented-files "SEGMENTED_FILES"} input), :shape "DashIsoSegmentControl"})

(clojure.core/defn- ser-m-3u-8-nielsen-id-3 [input] #:http.request.field{:value (clojure.core/get {"INSERT" "INSERT", :insert "INSERT", "NONE" "NONE", :none "NONE"} input), :shape "M3u8NielsenId3"})

(clojure.core/defn- ser-list-of-integer-min-32-max-8182 [input] #:http.request.field{:value (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (clojure.core/merge (ser-integer-min-32-max-8182 coll) #:http.request.field{:shape "__integerMin32Max8182"}))) input), :shape "__listOf__integerMin32Max8182", :type "list"})

(clojure.core/defn- ser-audio-type-control [input] #:http.request.field{:value (clojure.core/get {"FOLLOW_INPUT" "FOLLOW_INPUT", :follow-input "FOLLOW_INPUT", "USE_CONFIGURED" "USE_CONFIGURED", :use-configured "USE_CONFIGURED"} input), :shape "AudioTypeControl"})

(clojure.core/defn- ser-hls-output-selection [input] #:http.request.field{:value (clojure.core/get {"MANIFESTS_AND_SEGMENTS" "MANIFESTS_AND_SEGMENTS", :manifests-and-segments "MANIFESTS_AND_SEGMENTS", "SEGMENTS_ONLY" "SEGMENTS_ONLY", :segments-only "SEGMENTS_ONLY"} input), :shape "HlsOutputSelection"})

(clojure.core/defn- ser-speke-key-provider [input] (clojure.core/cond-> #:http.request.field{:value [], :shape "SpekeKeyProvider", :type "structure"} (clojure.core/contains? input :certificate-arn) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-string-pattern-arn-aws-us-gov-acm (input :certificate-arn)) #:http.request.field{:name "CertificateArn", :shape "__stringPatternArnAwsUsGovAcm", :location-name "certificateArn"})) (clojure.core/contains? input :resource-id) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-string (input :resource-id)) #:http.request.field{:name "ResourceId", :shape "__string", :location-name "resourceId"})) (clojure.core/contains? input :system-ids) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-list-of-string-pattern-09a-faf-809a-faf-409a-faf-409a-faf-409a-faf-12 (input :system-ids)) #:http.request.field{:name "SystemIds", :shape "__listOf__stringPattern09aFAF809aFAF409aFAF409aFAF409aFAF12", :location-name "systemIds"})) (clojure.core/contains? input :url) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-string-pattern-https (input :url)) #:http.request.field{:name "Url", :shape "__stringPatternHttps", :location-name "url"}))))

(clojure.core/defn- ser-deinterlace-algorithm [input] #:http.request.field{:value (clojure.core/get {"INTERPOLATE" "INTERPOLATE", :interpolate "INTERPOLATE", "INTERPOLATE_TICKER" "INTERPOLATE_TICKER", :interpolate-ticker "INTERPOLATE_TICKER", "BLEND" "BLEND", :blend "BLEND", "BLEND_TICKER" "BLEND_TICKER", :blend-ticker "BLEND_TICKER"} input), :shape "DeinterlaceAlgorithm"})

(clojure.core/defn- ser-ac-3-bitstream-mode [input] #:http.request.field{:value (clojure.core/get {:hearing-impaired "HEARING_IMPAIRED", :visually-impaired "VISUALLY_IMPAIRED", :complete-main "COMPLETE_MAIN", "COMPLETE_MAIN" "COMPLETE_MAIN", "DIALOGUE" "DIALOGUE", "VISUALLY_IMPAIRED" "VISUALLY_IMPAIRED", :dialogue "DIALOGUE", "EMERGENCY" "EMERGENCY", :emergency "EMERGENCY", :music-and-effects "MUSIC_AND_EFFECTS", "COMMENTARY" "COMMENTARY", :commentary "COMMENTARY", "MUSIC_AND_EFFECTS" "MUSIC_AND_EFFECTS", "VOICE_OVER" "VOICE_OVER", "HEARING_IMPAIRED" "HEARING_IMPAIRED", :voice-over "VOICE_OVER"} input), :shape "Ac3BitstreamMode"})

(clojure.core/defn- ser-integer-min-16-max-24 [input] #:http.request.field{:value input, :shape "__integerMin16Max24"})

(clojure.core/defn- ser-integer-min-negative-2-max-3 [input] #:http.request.field{:value input, :shape "__integerMinNegative2Max3"})

(clojure.core/defn- ser-f-4v-moov-placement [input] #:http.request.field{:value (clojure.core/get {"PROGRESSIVE_DOWNLOAD" "PROGRESSIVE_DOWNLOAD", :progressive-download "PROGRESSIVE_DOWNLOAD", "NORMAL" "NORMAL", :normal "NORMAL"} input), :shape "F4vMoovPlacement"})

(clojure.core/defn- ser-eac-3-dynamic-range-compression-rf [input] #:http.request.field{:value (clojure.core/get {"MUSIC_LIGHT" "MUSIC_LIGHT", :music-standard "MUSIC_STANDARD", :film-standard "FILM_STANDARD", "FILM_STANDARD" "FILM_STANDARD", "NONE" "NONE", "FILM_LIGHT" "FILM_LIGHT", :film-light "FILM_LIGHT", "SPEECH" "SPEECH", :music-light "MUSIC_LIGHT", "MUSIC_STANDARD" "MUSIC_STANDARD", :speech "SPEECH", :none "NONE"} input), :shape "Eac3DynamicRangeCompressionRf"})

(clojure.core/defn- ser-aac-raw-format [input] #:http.request.field{:value (clojure.core/get {"LATM_LOAS" "LATM_LOAS", :latm-loas "LATM_LOAS", "NONE" "NONE", :none "NONE"} input), :shape "AacRawFormat"})

(clojure.core/defn- ser-string-pattern-s-3-assetmap-xml [input] #:http.request.field{:value input, :shape "__stringPatternS3ASSETMAPXml"})

(clojure.core/defn- ser-integer-min-32000-max-384000 [input] #:http.request.field{:value input, :shape "__integerMin32000Max384000"})

(clojure.core/defn- ser-timed-metadata [input] #:http.request.field{:value (clojure.core/get {"PASSTHROUGH" "PASSTHROUGH", :passthrough "PASSTHROUGH", "NONE" "NONE", :none "NONE"} input), :shape "TimedMetadata"})

(clojure.core/defn- ser-integer-min-32-max-4096 [input] #:http.request.field{:value input, :shape "__integerMin32Max4096"})

(clojure.core/defn- ser-h-265-rate-control-mode [input] #:http.request.field{:value (clojure.core/get {"VBR" "VBR", :vbr "VBR", "CBR" "CBR", :cbr "CBR", "QVBR" "QVBR", :qvbr "QVBR"} input), :shape "H265RateControlMode"})

(clojure.core/defn- ser-mov-reference [input] #:http.request.field{:value (clojure.core/get {"SELF_CONTAINED" "SELF_CONTAINED", :self-contained "SELF_CONTAINED", "EXTERNAL" "EXTERNAL", :external "EXTERNAL"} input), :shape "MovReference"})

(clojure.core/defn- ser-integer-min-0-max-3600 [input] #:http.request.field{:value input, :shape "__integerMin0Max3600"})

(clojure.core/defn- ser-acceleration-settings [input] (clojure.core/cond-> #:http.request.field{:value [(clojure.core/into (ser-acceleration-mode (:mode input)) #:http.request.field{:name "Mode", :shape "AccelerationMode", :location-name "mode"})], :shape "AccelerationSettings", :type "structure"}))

(clojure.core/defn- ser-string-pattern-s-3 [input] #:http.request.field{:value input, :shape "__stringPatternS3"})

(clojure.core/defn- ser-m-2ts-segmentation-markers [input] #:http.request.field{:value (clojure.core/get {"PSI_SEGSTART" "PSI_SEGSTART", "RAI_SEGSTART" "RAI_SEGSTART", "RAI_ADAPT" "RAI_ADAPT", :rai-adapt "RAI_ADAPT", :rai-segstart "RAI_SEGSTART", :ebp-legacy "EBP_LEGACY", "NONE" "NONE", :psi-segstart "PSI_SEGSTART", "EBP_LEGACY" "EBP_LEGACY", "EBP" "EBP", :ebp "EBP", :none "NONE"} input), :shape "M2tsSegmentationMarkers"})

(clojure.core/defn- ser-acceleration-mode [input] #:http.request.field{:value (clojure.core/get {"DISABLED" "DISABLED", :disabled "DISABLED", "ENABLED" "ENABLED", :enabled "ENABLED"} input), :shape "AccelerationMode"})

(clojure.core/defn- ser-m-2ts-scte-35-source [input] #:http.request.field{:value (clojure.core/get {"PASSTHROUGH" "PASSTHROUGH", :passthrough "PASSTHROUGH", "NONE" "NONE", :none "NONE"} input), :shape "M2tsScte35Source"})

(clojure.core/defn- ser-h-264-par-control [input] #:http.request.field{:value (clojure.core/get {"INITIALIZE_FROM_SOURCE" "INITIALIZE_FROM_SOURCE", :initialize-from-source "INITIALIZE_FROM_SOURCE", "SPECIFIED" "SPECIFIED", :specified "SPECIFIED"} input), :shape "H264ParControl"})

(clojure.core/defn- ser-color-corrector [input] (clojure.core/cond-> #:http.request.field{:value [], :shape "ColorCorrector", :type "structure"} (clojure.core/contains? input :brightness) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-integer-min-1-max-100 (input :brightness)) #:http.request.field{:name "Brightness", :shape "__integerMin1Max100", :location-name "brightness"})) (clojure.core/contains? input :color-space-conversion) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-color-space-conversion (input :color-space-conversion)) #:http.request.field{:name "ColorSpaceConversion", :shape "ColorSpaceConversion", :location-name "colorSpaceConversion"})) (clojure.core/contains? input :contrast) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-integer-min-1-max-100 (input :contrast)) #:http.request.field{:name "Contrast", :shape "__integerMin1Max100", :location-name "contrast"})) (clojure.core/contains? input :hdr-10-metadata) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-hdr-10-metadata (input :hdr-10-metadata)) #:http.request.field{:name "Hdr10Metadata", :shape "Hdr10Metadata", :location-name "hdr10Metadata"})) (clojure.core/contains? input :hue) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-integer-min-negative-180-max-180 (input :hue)) #:http.request.field{:name "Hue", :shape "__integerMinNegative180Max180", :location-name "hue"})) (clojure.core/contains? input :saturation) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-integer-min-1-max-100 (input :saturation)) #:http.request.field{:name "Saturation", :shape "__integerMin1Max100", :location-name "saturation"}))))

(clojure.core/defn- ser-video-description [input] (clojure.core/cond-> #:http.request.field{:value [], :shape "VideoDescription", :type "structure"} (clojure.core/contains? input :crop) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-rectangle (input :crop)) #:http.request.field{:name "Crop", :shape "Rectangle", :location-name "crop"})) (clojure.core/contains? input :drop-frame-timecode) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-drop-frame-timecode (input :drop-frame-timecode)) #:http.request.field{:name "DropFrameTimecode", :shape "DropFrameTimecode", :location-name "dropFrameTimecode"})) (clojure.core/contains? input :timecode-insertion) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-video-timecode-insertion (input :timecode-insertion)) #:http.request.field{:name "TimecodeInsertion", :shape "VideoTimecodeInsertion", :location-name "timecodeInsertion"})) (clojure.core/contains? input :sharpness) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-integer-min-0-max-100 (input :sharpness)) #:http.request.field{:name "Sharpness", :shape "__integerMin0Max100", :location-name "sharpness"})) (clojure.core/contains? input :codec-settings) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-video-codec-settings (input :codec-settings)) #:http.request.field{:name "CodecSettings", :shape "VideoCodecSettings", :location-name "codecSettings"})) (clojure.core/contains? input :afd-signaling) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-afd-signaling (input :afd-signaling)) #:http.request.field{:name "AfdSignaling", :shape "AfdSignaling", :location-name "afdSignaling"})) (clojure.core/contains? input :video-preprocessors) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-video-preprocessor (input :video-preprocessors)) #:http.request.field{:name "VideoPreprocessors", :shape "VideoPreprocessor", :location-name "videoPreprocessors"})) (clojure.core/contains? input :width) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-integer-min-32-max-4096 (input :width)) #:http.request.field{:name "Width", :shape "__integerMin32Max4096", :location-name "width"})) (clojure.core/contains? input :scaling-behavior) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-scaling-behavior (input :scaling-behavior)) #:http.request.field{:name "ScalingBehavior", :shape "ScalingBehavior", :location-name "scalingBehavior"})) (clojure.core/contains? input :anti-alias) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-anti-alias (input :anti-alias)) #:http.request.field{:name "AntiAlias", :shape "AntiAlias", :location-name "antiAlias"})) (clojure.core/contains? input :color-metadata) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-color-metadata (input :color-metadata)) #:http.request.field{:name "ColorMetadata", :shape "ColorMetadata", :location-name "colorMetadata"})) (clojure.core/contains? input :position) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-rectangle (input :position)) #:http.request.field{:name "Position", :shape "Rectangle", :location-name "position"})) (clojure.core/contains? input :height) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-integer-min-32-max-2160 (input :height)) #:http.request.field{:name "Height", :shape "__integerMin32Max2160", :location-name "height"})) (clojure.core/contains? input :respond-to-afd) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-respond-to-afd (input :respond-to-afd)) #:http.request.field{:name "RespondToAfd", :shape "RespondToAfd", :location-name "respondToAfd"})) (clojure.core/contains? input :fixed-afd) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-integer-min-0-max-15 (input :fixed-afd)) #:http.request.field{:name "FixedAfd", :shape "__integerMin0Max15", :location-name "fixedAfd"}))))

(clojure.core/defn- ser-integer-min-0-max-15 [input] #:http.request.field{:value input, :shape "__integerMin0Max15"})

(clojure.core/defn- ser-string-min-3-max-3-pattern-1809a-faf-09a-eae [input] #:http.request.field{:value input, :shape "__stringMin3Max3Pattern1809aFAF09aEAE"})

(clojure.core/defn- ser-integer-min-1-max-10 [input] #:http.request.field{:value input, :shape "__integerMin1Max10"})

(clojure.core/defn- ser-id-3-insertion [input] (clojure.core/cond-> #:http.request.field{:value [], :shape "Id3Insertion", :type "structure"} (clojure.core/contains? input :id-3) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-string-pattern-a-za-z-0902 (input :id-3)) #:http.request.field{:name "Id3", :shape "__stringPatternAZaZ0902", :location-name "id3"})) (clojure.core/contains? input :timecode) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-string-pattern-010920405090509092 (input :timecode)) #:http.request.field{:name "Timecode", :shape "__stringPattern010920405090509092", :location-name "timecode"}))))

(clojure.core/defn- ser-output-group-settings [input] (clojure.core/cond-> #:http.request.field{:value [], :shape "OutputGroupSettings", :type "structure"} (clojure.core/contains? input :cmaf-group-settings) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-cmaf-group-settings (input :cmaf-group-settings)) #:http.request.field{:name "CmafGroupSettings", :shape "CmafGroupSettings", :location-name "cmafGroupSettings"})) (clojure.core/contains? input :dash-iso-group-settings) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-dash-iso-group-settings (input :dash-iso-group-settings)) #:http.request.field{:name "DashIsoGroupSettings", :shape "DashIsoGroupSettings", :location-name "dashIsoGroupSettings"})) (clojure.core/contains? input :file-group-settings) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-file-group-settings (input :file-group-settings)) #:http.request.field{:name "FileGroupSettings", :shape "FileGroupSettings", :location-name "fileGroupSettings"})) (clojure.core/contains? input :hls-group-settings) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-hls-group-settings (input :hls-group-settings)) #:http.request.field{:name "HlsGroupSettings", :shape "HlsGroupSettings", :location-name "hlsGroupSettings"})) (clojure.core/contains? input :ms-smooth-group-settings) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-ms-smooth-group-settings (input :ms-smooth-group-settings)) #:http.request.field{:name "MsSmoothGroupSettings", :shape "MsSmoothGroupSettings", :location-name "msSmoothGroupSettings"})) (clojure.core/contains? input :type) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-output-group-type (input :type)) #:http.request.field{:name "Type", :shape "OutputGroupType", :location-name "type"}))))

(clojure.core/defn- ser-integer-min-32000-max-48000 [input] #:http.request.field{:value input, :shape "__integerMin32000Max48000"})

(clojure.core/defn- ser-string-pattern-s-3-mm-2-vvmmppeeggaavviimmpp-4-ffllvvmmppttmmppggmm-4-vvttrrppff-4-vvmm-2-ttssttss-264-hh-264-mmkkvvmmoovvmmttssmm-2-ttwwmmvvaassffvvoobb-3-ggpp-3-ggppppmmxxffddiivvxxxxvviiddrraawwddvvggxxffmm-1-vv-3-gg-2-vvmmffmm-3-uu-8-llcchhggxxffmmppeegg-2-mmxxffmmppeegg-2-mmxxffhhddwwaavvyy-4-mmaaaaccaaiiffffmmpp-2-aacc-3-eecc-3-ddttssee [input] #:http.request.field{:value input, :shape "__stringPatternS3MM2VVMMPPEEGGAAVVIIMMPP4FFLLVVMMPPTTMMPPGGMM4VVTTRRPPFF4VVMM2TTSSTTSS264HH264MMKKVVMMOOVVMMTTSSMM2TTWWMMVVAASSFFVVOOBB3GGPP3GGPPPPMMXXFFDDIIVVXXXXVVIIDDRRAAWWDDVVGGXXFFMM1VV3GG2VVMMFFMM3UU8LLCCHHGGXXFFMMPPEEGG2MMXXFFMMPPEEGG2MMXXFFHHDDWWAAVVYY4MMAAAACCAAIIFFFFMMPP2AACC3EECC3DDTTSSEE"})

(clojure.core/defn- ser-integer-min-96-max-600 [input] #:http.request.field{:value input, :shape "__integerMin96Max600"})

(clojure.core/defn- ser-ms-smooth-encryption-settings [input] (clojure.core/cond-> #:http.request.field{:value [], :shape "MsSmoothEncryptionSettings", :type "structure"} (clojure.core/contains? input :speke-key-provider) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-speke-key-provider (input :speke-key-provider)) #:http.request.field{:name "SpekeKeyProvider", :shape "SpekeKeyProvider", :location-name "spekeKeyProvider"}))))

(clojure.core/defn- ser-file-source-convert-608-to-708 [input] #:http.request.field{:value (clojure.core/get {"UPCONVERT" "UPCONVERT", :upconvert "UPCONVERT", "DISABLED" "DISABLED", :disabled "DISABLED"} input), :shape "FileSourceConvert608To708"})

(clojure.core/defn- ser-map-of-audio-selector-group [input] #:http.request.field{:value (clojure.core/into [] (clojure.core/map (clojure.core/fn [[k v]] [(clojure.core/into (ser-string k) #:http.request.field{:map-info "key", :shape "__string"}) (clojure.core/into (ser-audio-selector-group v) #:http.request.field{:map-info "value", :shape "AudioSelectorGroup"})])) input), :shape "__mapOfAudioSelectorGroup", :type "map"})

(clojure.core/defn- ser-list-of-hls-ad-markers [input] #:http.request.field{:value (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (clojure.core/merge (ser-hls-ad-markers coll) #:http.request.field{:shape "HlsAdMarkers"}))) input), :shape "__listOfHlsAdMarkers", :type "list"})

(clojure.core/defn- ser-list-of-integer-min-1-max-2147483647 [input] #:http.request.field{:value (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (clojure.core/merge (ser-integer-min-1-max-2147483647 coll) #:http.request.field{:shape "__integerMin1Max2147483647"}))) input), :shape "__listOf__integerMin1Max2147483647", :type "list"})

(clojure.core/defn- ser-dash-iso-hbbtv-compliance [input] #:http.request.field{:value (clojure.core/get {"HBBTV_1_5" "HBBTV_1_5", :hbbtv-1-5 "HBBTV_1_5", "NONE" "NONE", :none "NONE"} input), :shape "DashIsoHbbtvCompliance"})

(clojure.core/defn- ser-input-clipping [input] (clojure.core/cond-> #:http.request.field{:value [], :shape "InputClipping", :type "structure"} (clojure.core/contains? input :end-timecode) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-string-pattern-010920405090509092 (input :end-timecode)) #:http.request.field{:name "EndTimecode", :shape "__stringPattern010920405090509092", :location-name "endTimecode"})) (clojure.core/contains? input :start-timecode) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-string-pattern-010920405090509092 (input :start-timecode)) #:http.request.field{:name "StartTimecode", :shape "__stringPattern010920405090509092", :location-name "startTimecode"}))))

(clojure.core/defn- ser-color-space [input] #:http.request.field{:value (clojure.core/get {:follow "FOLLOW", "HLG_2020" "HLG_2020", :rec-709 "REC_709", "REC_601" "REC_601", "FOLLOW" "FOLLOW", "HDR10" "HDR10", :hlg-2020 "HLG_2020", :hdr-10 "HDR10", :rec-601 "REC_601", "REC_709" "REC_709"} input), :shape "ColorSpace"})

(clojure.core/defn- ser-scaling-behavior [input] #:http.request.field{:value (clojure.core/get {"DEFAULT" "DEFAULT", :default "DEFAULT", "STRETCH_TO_OUTPUT" "STRETCH_TO_OUTPUT", :stretch-to-output "STRETCH_TO_OUTPUT"} input), :shape "ScalingBehavior"})

(clojure.core/defn- ser-mp-2-settings [input] (clojure.core/cond-> #:http.request.field{:value [], :shape "Mp2Settings", :type "structure"} (clojure.core/contains? input :bitrate) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-integer-min-32000-max-384000 (input :bitrate)) #:http.request.field{:name "Bitrate", :shape "__integerMin32000Max384000", :location-name "bitrate"})) (clojure.core/contains? input :channels) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-integer-min-1-max-2 (input :channels)) #:http.request.field{:name "Channels", :shape "__integerMin1Max2", :location-name "channels"})) (clojure.core/contains? input :sample-rate) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-integer-min-32000-max-48000 (input :sample-rate)) #:http.request.field{:name "SampleRate", :shape "__integerMin32000Max48000", :location-name "sampleRate"}))))

(clojure.core/defn- ser-mpeg-2-scene-change-detect [input] #:http.request.field{:value (clojure.core/get {"DISABLED" "DISABLED", :disabled "DISABLED", "ENABLED" "ENABLED", :enabled "ENABLED"} input), :shape "Mpeg2SceneChangeDetect"})

(clojure.core/defn- ser-integer-min-1-max-1001 [input] #:http.request.field{:value input, :shape "__integerMin1Max1001"})

(clojure.core/defn- ser-m-2ts-es-rate-in-pes [input] #:http.request.field{:value (clojure.core/get {"INCLUDE" "INCLUDE", :include "INCLUDE", "EXCLUDE" "EXCLUDE", :exclude "EXCLUDE"} input), :shape "M2tsEsRateInPes"})

(clojure.core/defn- ser-caption-source-settings [input] (clojure.core/cond-> #:http.request.field{:value [], :shape "CaptionSourceSettings", :type "structure"} (clojure.core/contains? input :ancillary-source-settings) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-ancillary-source-settings (input :ancillary-source-settings)) #:http.request.field{:name "AncillarySourceSettings", :shape "AncillarySourceSettings", :location-name "ancillarySourceSettings"})) (clojure.core/contains? input :dvb-sub-source-settings) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-dvb-sub-source-settings (input :dvb-sub-source-settings)) #:http.request.field{:name "DvbSubSourceSettings", :shape "DvbSubSourceSettings", :location-name "dvbSubSourceSettings"})) (clojure.core/contains? input :embedded-source-settings) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-embedded-source-settings (input :embedded-source-settings)) #:http.request.field{:name "EmbeddedSourceSettings", :shape "EmbeddedSourceSettings", :location-name "embeddedSourceSettings"})) (clojure.core/contains? input :file-source-settings) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-file-source-settings (input :file-source-settings)) #:http.request.field{:name "FileSourceSettings", :shape "FileSourceSettings", :location-name "fileSourceSettings"})) (clojure.core/contains? input :source-type) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-caption-source-type (input :source-type)) #:http.request.field{:name "SourceType", :shape "CaptionSourceType", :location-name "sourceType"})) (clojure.core/contains? input :teletext-source-settings) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-teletext-source-settings (input :teletext-source-settings)) #:http.request.field{:name "TeletextSourceSettings", :shape "TeletextSourceSettings", :location-name "teletextSourceSettings"})) (clojure.core/contains? input :track-source-settings) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-track-source-settings (input :track-source-settings)) #:http.request.field{:name "TrackSourceSettings", :shape "TrackSourceSettings", :location-name "trackSourceSettings"}))))

(clojure.core/defn- ser-caption-destination-settings [input] (clojure.core/cond-> #:http.request.field{:value [], :shape "CaptionDestinationSettings", :type "structure"} (clojure.core/contains? input :burnin-destination-settings) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-burnin-destination-settings (input :burnin-destination-settings)) #:http.request.field{:name "BurninDestinationSettings", :shape "BurninDestinationSettings", :location-name "burninDestinationSettings"})) (clojure.core/contains? input :destination-type) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-caption-destination-type (input :destination-type)) #:http.request.field{:name "DestinationType", :shape "CaptionDestinationType", :location-name "destinationType"})) (clojure.core/contains? input :dvb-sub-destination-settings) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-dvb-sub-destination-settings (input :dvb-sub-destination-settings)) #:http.request.field{:name "DvbSubDestinationSettings", :shape "DvbSubDestinationSettings", :location-name "dvbSubDestinationSettings"})) (clojure.core/contains? input :embedded-destination-settings) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-embedded-destination-settings (input :embedded-destination-settings)) #:http.request.field{:name "EmbeddedDestinationSettings", :shape "EmbeddedDestinationSettings", :location-name "embeddedDestinationSettings"})) (clojure.core/contains? input :scc-destination-settings) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-scc-destination-settings (input :scc-destination-settings)) #:http.request.field{:name "SccDestinationSettings", :shape "SccDestinationSettings", :location-name "sccDestinationSettings"})) (clojure.core/contains? input :teletext-destination-settings) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-teletext-destination-settings (input :teletext-destination-settings)) #:http.request.field{:name "TeletextDestinationSettings", :shape "TeletextDestinationSettings", :location-name "teletextDestinationSettings"})) (clojure.core/contains? input :ttml-destination-settings) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-ttml-destination-settings (input :ttml-destination-settings)) #:http.request.field{:name "TtmlDestinationSettings", :shape "TtmlDestinationSettings", :location-name "ttmlDestinationSettings"}))))

(clojure.core/defn- ser-integer-min-1000-max-30000 [input] #:http.request.field{:value input, :shape "__integerMin1000Max30000"})

(clojure.core/defn- ser-integer-min-1-max-2147483647 [input] #:http.request.field{:value input, :shape "__integerMin1Max2147483647"})

(clojure.core/defn- ser-integer-min-32-max-2160 [input] #:http.request.field{:value input, :shape "__integerMin32Max2160"})

(clojure.core/defn- ser-hls-ad-markers [input] #:http.request.field{:value (clojure.core/get {"ELEMENTAL" "ELEMENTAL", :elemental "ELEMENTAL", "ELEMENTAL_SCTE35" "ELEMENTAL_SCTE35", :elemental-scte-35 "ELEMENTAL_SCTE35"} input), :shape "HlsAdMarkers"})

(clojure.core/defn- ser-list-of-string [input] #:http.request.field{:value (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (clojure.core/merge (ser-string coll) #:http.request.field{:shape "__string"}))) input), :shape "__listOf__string", :type "list"})

(clojure.core/defn- ser-integer-min-10-max-600 [input] #:http.request.field{:value input, :shape "__integerMin10Max600"})

(clojure.core/defn- ser-m-2ts-segmentation-style [input] #:http.request.field{:value (clojure.core/get {"MAINTAIN_CADENCE" "MAINTAIN_CADENCE", :maintain-cadence "MAINTAIN_CADENCE", "RESET_CADENCE" "RESET_CADENCE", :reset-cadence "RESET_CADENCE"} input), :shape "M2tsSegmentationStyle"})

(clojure.core/defn- ser-channel-mapping [input] (clojure.core/cond-> #:http.request.field{:value [], :shape "ChannelMapping", :type "structure"} (clojure.core/contains? input :output-channels) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-list-of-output-channel-mapping (input :output-channels)) #:http.request.field{:name "OutputChannels", :shape "__listOfOutputChannelMapping", :location-name "outputChannels"}))))

(clojure.core/defn- ser-integer-min-0-max-30 [input] #:http.request.field{:value input, :shape "__integerMin0Max30"})

(clojure.core/defn- ser-h-264-framerate-conversion-algorithm [input] #:http.request.field{:value (clojure.core/get {"DUPLICATE_DROP" "DUPLICATE_DROP", :duplicate-drop "DUPLICATE_DROP", "INTERPOLATE" "INTERPOLATE", :interpolate "INTERPOLATE"} input), :shape "H264FramerateConversionAlgorithm"})

(clojure.core/defn- ser-m-2ts-force-ts-video-ebp-order [input] #:http.request.field{:value (clojure.core/get {"FORCE" "FORCE", :force "FORCE", "DEFAULT" "DEFAULT", :default "DEFAULT"} input), :shape "M2tsForceTsVideoEbpOrder"})

(clojure.core/defn- ser-dvb-subtitle-background-color [input] #:http.request.field{:value (clojure.core/get {"NONE" "NONE", :none "NONE", "BLACK" "BLACK", :black "BLACK", "WHITE" "WHITE", :white "WHITE"} input), :shape "DvbSubtitleBackgroundColor"})

(clojure.core/defn- ser-string-pattern-https [input] #:http.request.field{:value input, :shape "__stringPatternHttps"})

(clojure.core/defn- ser-audio-normalization-peak-calculation [input] #:http.request.field{:value (clojure.core/get {"TRUE_PEAK" "TRUE_PEAK", :true-peak "TRUE_PEAK", "NONE" "NONE", :none "NONE"} input), :shape "AudioNormalizationPeakCalculation"})

(clojure.core/defn- ser-integer-min-0-max-16 [input] #:http.request.field{:value input, :shape "__integerMin0Max16"})

(clojure.core/defn- ser-integer-min-negative-70-max-0 [input] #:http.request.field{:value input, :shape "__integerMinNegative70Max0"})

(clojure.core/defn- ser-anti-alias [input] #:http.request.field{:value (clojure.core/get {"DISABLED" "DISABLED", :disabled "DISABLED", "ENABLED" "ENABLED", :enabled "ENABLED"} input), :shape "AntiAlias"})

(clojure.core/defn- ser-burnin-subtitle-background-color [input] #:http.request.field{:value (clojure.core/get {"NONE" "NONE", :none "NONE", "BLACK" "BLACK", :black "BLACK", "WHITE" "WHITE", :white "WHITE"} input), :shape "BurninSubtitleBackgroundColor"})

(clojure.core/defn- ser-m-2ts-rate-mode [input] #:http.request.field{:value (clojure.core/get {"VBR" "VBR", :vbr "VBR", "CBR" "CBR", :cbr "CBR"} input), :shape "M2tsRateMode"})

(clojure.core/defn- ser-eac-3-bitstream-mode [input] #:http.request.field{:value (clojure.core/get {:hearing-impaired "HEARING_IMPAIRED", :visually-impaired "VISUALLY_IMPAIRED", :complete-main "COMPLETE_MAIN", "COMPLETE_MAIN" "COMPLETE_MAIN", "VISUALLY_IMPAIRED" "VISUALLY_IMPAIRED", "EMERGENCY" "EMERGENCY", :emergency "EMERGENCY", "COMMENTARY" "COMMENTARY", :commentary "COMMENTARY", "HEARING_IMPAIRED" "HEARING_IMPAIRED"} input), :shape "Eac3BitstreamMode"})

(clojure.core/defn- ser-timed-metadata-insertion [input] (clojure.core/cond-> #:http.request.field{:value [], :shape "TimedMetadataInsertion", :type "structure"} (clojure.core/contains? input :id-3-insertions) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-list-of-id-3-insertion (input :id-3-insertions)) #:http.request.field{:name "Id3Insertions", :shape "__listOfId3Insertion", :location-name "id3Insertions"}))))

(clojure.core/defn- ser-input-template [input] (clojure.core/cond-> #:http.request.field{:value [], :shape "InputTemplate", :type "structure"} (clojure.core/contains? input :denoise-filter) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-input-denoise-filter (input :denoise-filter)) #:http.request.field{:name "DenoiseFilter", :shape "InputDenoiseFilter", :location-name "denoiseFilter"})) (clojure.core/contains? input :filter-strength) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-integer-min-negative-5-max-5 (input :filter-strength)) #:http.request.field{:name "FilterStrength", :shape "__integerMinNegative5Max5", :location-name "filterStrength"})) (clojure.core/contains? input :program-number) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-integer-min-1-max-2147483647 (input :program-number)) #:http.request.field{:name "ProgramNumber", :shape "__integerMin1Max2147483647", :location-name "programNumber"})) (clojure.core/contains? input :input-clippings) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-list-of-input-clipping (input :input-clippings)) #:http.request.field{:name "InputClippings", :shape "__listOfInputClipping", :location-name "inputClippings"})) (clojure.core/contains? input :timecode-source) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-input-timecode-source (input :timecode-source)) #:http.request.field{:name "TimecodeSource", :shape "InputTimecodeSource", :location-name "timecodeSource"})) (clojure.core/contains? input :caption-selectors) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-map-of-caption-selector (input :caption-selectors)) #:http.request.field{:name "CaptionSelectors", :shape "__mapOfCaptionSelector", :location-name "captionSelectors"})) (clojure.core/contains? input :video-selector) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-video-selector (input :video-selector)) #:http.request.field{:name "VideoSelector", :shape "VideoSelector", :location-name "videoSelector"})) (clojure.core/contains? input :audio-selector-groups) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-map-of-audio-selector-group (input :audio-selector-groups)) #:http.request.field{:name "AudioSelectorGroups", :shape "__mapOfAudioSelectorGroup", :location-name "audioSelectorGroups"})) (clojure.core/contains? input :filter-enable) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-input-filter-enable (input :filter-enable)) #:http.request.field{:name "FilterEnable", :shape "InputFilterEnable", :location-name "filterEnable"})) (clojure.core/contains? input :image-inserter) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-image-inserter (input :image-inserter)) #:http.request.field{:name "ImageInserter", :shape "ImageInserter", :location-name "imageInserter"})) (clojure.core/contains? input :psi-control) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-input-psi-control (input :psi-control)) #:http.request.field{:name "PsiControl", :shape "InputPsiControl", :location-name "psiControl"})) (clojure.core/contains? input :audio-selectors) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-map-of-audio-selector (input :audio-selectors)) #:http.request.field{:name "AudioSelectors", :shape "__mapOfAudioSelector", :location-name "audioSelectors"})) (clojure.core/contains? input :deblock-filter) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-input-deblock-filter (input :deblock-filter)) #:http.request.field{:name "DeblockFilter", :shape "InputDeblockFilter", :location-name "deblockFilter"}))))

(clojure.core/defn- ser-language-code [input] #:http.request.field{:value (clojure.core/get {"VIE" "VIE", "ZUL" "ZUL", "COR" "COR", :sqi "SQI", "URD" "URD", "EPO" "EPO", :cat "CAT", "MAR" "MAR", :ile "ILE", "SRB" "SRB", "TAM" "TAM", "TAH" "TAH", :kir "KIR", :bam "BAM", "LIM" "LIM", "SMO" "SMO", :ibo "IBO", :orm "ORM", "POL" "POL", "JAV" "JAV", :xho "XHO", :zho "ZHO", "BEL" "BEL", :ara "ARA", "AAR" "AAR", "KAU" "KAU", "SQI" "SQI", "III" "III", "AVA" "AVA", :kaz "KAZ", :lub "LUB", "LUB" "LUB", :her "HER", :por "POR", :sme "SME", :aar "AAR", "SWE" "SWE", :tur "TUR", "POR" "POR", :hun "HUN", :sna "SNA", "AYM" "AYM", :ita "ITA", "NBL" "NBL", :zha "ZHA", :run "RUN", :cym "CYM", "FIN" "FIN", :dan "DAN", :sot "SOT", :cos "COS", :mya "MYA", :slk "SLK", "HEB" "HEB", :bis "BIS", :smo "SMO", "SNA" "SNA", :swa "SWA", "PLI" "PLI", :hrv "HRV", "RON" "RON", "ABK" "ABK", "CYM" "CYM", "LAV" "LAV", "AMH" "AMH", "IDO" "IDO", "FRY" "FRY", "IPK" "IPK", "VOL" "VOL", "HAT" "HAT", :lav "LAV", :bul "BUL", "KOM" "KOM", :mri "MRI", :kal "KAL", :jpn "JPN", :tso "TSO", :bre "BRE", :tir "TIR", "IBO" "IBO", :mal "MAL", :kas "KAS", :gla "GLA", "MAH" "MAH", :nbl "NBL", "ARG" "ARG", "KIK" "KIK", :aka "AKA", :fij "FIJ", :pan "PAN", "BEN" "BEN", "AVE" "AVE", "GER" "GER", "ORJ" "ORJ", "FUL" "FUL", "KUR" "KUR", "KUA" "KUA", :cor "COR", "NYA" "NYA", "CHA" "CHA", "NOB" "NOB", :yid "YID", :grn "GRN", "DEU" "DEU", "SUN" "SUN", "MKD" "MKD", "HRV" "HRV", :bak "BAK", "XHO" "XHO", "HUN" "HUN", "LUG" "LUG", :kik "KIK", :ukr "UKR", :abk "ABK", :ton "TON", :nor "NOR", "KAS" "KAS", :ven "VEN", "IND" "IND", :som "SOM", :cha "CHA", "KON" "KON", "ILE" "ILE", :fra "FRA", :tng "TNG", :ssw "SSW", :deu "DEU", :iii "III", :guj "GUJ", "NDE" "NDE", "TGL" "TGL", "LAT" "LAT", "TWI" "TWI", "EUS" "EUS", "UKR" "UKR", "HMO" "HMO", "BRE" "BRE", :ltz "LTZ", :yor "YOR", "KAL" "KAL", :nob "NOB", :isl "ISL", :hau "HAU", :twi "TWI", :lit "LIT", "ELL" "ELL", "LIN" "LIN", :kor "KOR", :rus "RUS", :spa "SPA", "NAU" "NAU", :snd "SND", "MLT" "MLT", "SME" "SME", :ipk "IPK", :tat "TAT", :msa "MSA", "KHM" "KHM", :hye "HYE", "HIN" "HIN", :ave "AVE", "FRA" "FRA", "MRI" "MRI", "SLK" "SLK", "THA" "THA", :pol "POL", :lin "LIN", "AFR" "AFR", :srb "SRB", "AZE" "AZE", :fry "FRY", :uzb "UZB", "KAT" "KAT", :hat "HAT", "EWE" "EWE", "TSN" "TSN", :bod "BOD", :urd "URD", :mkd "MKD", "ZHO" "ZHO", "OSS" "OSS", :pus "PUS", "ORM" "ORM", :san "SAN", :eng "ENG", :tel "TEL", :chv "CHV", "SSW" "SSW", "GUJ" "GUJ", :nau "NAU", "EST" "EST", :div "DIV", :ina "INA", :cre "CRE", :che "CHE", "KIR" "KIR", "QUE" "QUE", :aym "AYM", "COS" "COS", "TUK" "TUK", :afr "AFR", "KOR" "KOR", :vie "VIE", "FIJ" "FIJ", "KAZ" "KAZ", "MYA" "MYA", :ewe "EWE", "AKA" "AKA", :hin "HIN", "TGK" "TGK", :srd "SRD", "ITA" "ITA", :ful "FUL", :glv "GLV", :hmo "HMO", :qaa "QAA", "MON" "MON", "KAN" "KAN", :kin "KIN", :khm "KHM", :slv "SLV", "RUS" "RUS", "YID" "YID", "NLD" "NLD", :amh "AMH", :tgk "TGK", :mah "MAH", "TAT" "TAT", :arg "ARG", :kat "KAT", :frm "FRM", "MSA" "MSA", :ndo "NDO", :aze "AZE", :kur "KUR", "DIV" "DIV", "YOR" "YOR", "MAL" "MAL", "NNO" "NNO", :ido "IDO", :wln "WLN", "FAS" "FAS", :orj "ORJ", "SAG" "SAG", :nld "NLD", "SOM" "SOM", :roh "ROH", "BAM" "BAM", "TON" "TON", :bel "BEL", :ger "GER", "CHV" "CHV", :uig "UIG", :fas "FAS", "GLE" "GLE", "SLV" "SLV", :oji "OJI", "TEL" "TEL", :zul "ZUL", "ARA" "ARA", "ISL" "ISL", :nya "NYA", "SOT" "SOT", "BIH" "BIH", :sun "SUN", "JPN" "JPN", :lim "LIM", :sin "SIN", :kon "KON", :lao "LAO", :nep "NEP", :tam "TAM", "TUR" "TUR", :mlt "MLT", "BAK" "BAK", "VEN" "VEN", :oci "OCI", :lat "LAT", :ron "RON", "FRM" "FRM", "CES" "CES", "NAV" "NAV", :tgl "TGL", :ces "CES", "GLG" "GLG", :tuk "TUK", "IKU" "IKU", :ori "ORI", "TIR" "TIR", "SAN" "SAN", :kua "KUA", "SIN" "SIN", :mlg "MLG", "WOL" "WOL", "ORI" "ORI", "ASM" "ASM", :ava "AVA", "DZO" "DZO", "CRE" "CRE", "BOD" "BOD", "ENG" "ENG", "BUL" "BUL", "BOS" "BOS", :mar "MAR", :mon "MON", :tah "TAH", "KIN" "KIN", :tha "THA", "GRN" "GRN", :pli "PLI", :ben "BEN", :fao "FAO", "QAA" "QAA", :est "EST", "PAN" "PAN", "BIS" "BIS", "PUS" "PUS", :ind "IND", "MLG" "MLG", "QPC" "QPC", :kau "KAU", "HAU" "HAU", "WLN" "WLN", :iku "IKU", "LIT" "LIT", :asm "ASM", "HYE" "HYE", "LTZ" "LTZ", :oss "OSS", :qpc "QPC", :chu "CHU", "CHU" "CHU", "SWA" "SWA", "HER" "HER", :sag "SAG", :kom "KOM", "DAN" "DAN", "TNG" "TNG", :wol "WOL", :ell "ELL", :heb "HEB", :swe "SWE", "SRD" "SRD", :gle "GLE", "RUN" "RUN", :lug "LUG", :kan "KAN", "UZB" "UZB", "OJI" "OJI", :jav "JAV", :nno "NNO", :que "QUE", :nav "NAV", "ZHA" "ZHA", :bos "BOS", "SND" "SND", "TSO" "TSO", "CHE" "CHE", :epo "EPO", "OCI" "OCI", "ROH" "ROH", :eus "EUS", "NEP" "NEP", "GLV" "GLV", "CAT" "CAT", :vol "VOL", :dzo "DZO", "ENM" "ENM", :glg "GLG", "FAO" "FAO", "GLA" "GLA", "UIG" "UIG", "NDO" "NDO", "SPA" "SPA", :enm "ENM", :tsn "TSN", "LAO" "LAO", "NOR" "NOR", :bih "BIH", "INA" "INA", :nde "NDE", :fin "FIN"} input), :shape "LanguageCode"})

(clojure.core/defn- ser-string-min-9-max-19-pattern-az-26-east-west-central-north-south-east-west-1912 [input] #:http.request.field{:value input, :shape "__stringMin9Max19PatternAZ26EastWestCentralNorthSouthEastWest1912"})

(clojure.core/defn- ser-mov-settings [input] (clojure.core/cond-> #:http.request.field{:value [], :shape "MovSettings", :type "structure"} (clojure.core/contains? input :clap-atom) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-mov-clap-atom (input :clap-atom)) #:http.request.field{:name "ClapAtom", :shape "MovClapAtom", :location-name "clapAtom"})) (clojure.core/contains? input :cslg-atom) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-mov-cslg-atom (input :cslg-atom)) #:http.request.field{:name "CslgAtom", :shape "MovCslgAtom", :location-name "cslgAtom"})) (clojure.core/contains? input :mpeg-2-four-cc-control) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-mov-mpeg-2-four-cc-control (input :mpeg-2-four-cc-control)) #:http.request.field{:name "Mpeg2FourCCControl", :shape "MovMpeg2FourCCControl", :location-name "mpeg2FourCCControl"})) (clojure.core/contains? input :padding-control) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-mov-padding-control (input :padding-control)) #:http.request.field{:name "PaddingControl", :shape "MovPaddingControl", :location-name "paddingControl"})) (clojure.core/contains? input :reference) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-mov-reference (input :reference)) #:http.request.field{:name "Reference", :shape "MovReference", :location-name "reference"}))))

(clojure.core/defn- ser-integer-min-0-max-100 [input] #:http.request.field{:value input, :shape "__integerMin0Max100"})

(clojure.core/defn- ser-list-of-hls-caption-language-mapping [input] #:http.request.field{:value (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (clojure.core/merge (ser-hls-caption-language-mapping coll) #:http.request.field{:shape "HlsCaptionLanguageMapping"}))) input), :shape "__listOfHlsCaptionLanguageMapping", :type "list"})

(clojure.core/defn- ser-dash-iso-write-segment-timeline-in-representation [input] #:http.request.field{:value (clojure.core/get {"ENABLED" "ENABLED", :enabled "ENABLED", "DISABLED" "DISABLED", :disabled "DISABLED"} input), :shape "DashIsoWriteSegmentTimelineInRepresentation"})

(clojure.core/defn- ser-integer-min-1-max-6 [input] #:http.request.field{:value input, :shape "__integerMin1Max6"})

(clojure.core/defn- ser-ancillary-source-settings [input] (clojure.core/cond-> #:http.request.field{:value [], :shape "AncillarySourceSettings", :type "structure"} (clojure.core/contains? input :source-ancillary-channel-number) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-integer-min-1-max-4 (input :source-ancillary-channel-number)) #:http.request.field{:name "SourceAncillaryChannelNumber", :shape "__integerMin1Max4", :location-name "sourceAncillaryChannelNumber"}))))

(clojure.core/defn- ser-input [input] (clojure.core/cond-> #:http.request.field{:value [], :shape "Input", :type "structure"} (clojure.core/contains? input :denoise-filter) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-input-denoise-filter (input :denoise-filter)) #:http.request.field{:name "DenoiseFilter", :shape "InputDenoiseFilter", :location-name "denoiseFilter"})) (clojure.core/contains? input :filter-strength) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-integer-min-negative-5-max-5 (input :filter-strength)) #:http.request.field{:name "FilterStrength", :shape "__integerMinNegative5Max5", :location-name "filterStrength"})) (clojure.core/contains? input :program-number) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-integer-min-1-max-2147483647 (input :program-number)) #:http.request.field{:name "ProgramNumber", :shape "__integerMin1Max2147483647", :location-name "programNumber"})) (clojure.core/contains? input :input-clippings) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-list-of-input-clipping (input :input-clippings)) #:http.request.field{:name "InputClippings", :shape "__listOfInputClipping", :location-name "inputClippings"})) (clojure.core/contains? input :timecode-source) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-input-timecode-source (input :timecode-source)) #:http.request.field{:name "TimecodeSource", :shape "InputTimecodeSource", :location-name "timecodeSource"})) (clojure.core/contains? input :supplemental-imps) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-list-of-string-pattern-s-3-assetmap-xml (input :supplemental-imps)) #:http.request.field{:name "SupplementalImps", :shape "__listOf__stringPatternS3ASSETMAPXml", :location-name "supplementalImps"})) (clojure.core/contains? input :caption-selectors) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-map-of-caption-selector (input :caption-selectors)) #:http.request.field{:name "CaptionSelectors", :shape "__mapOfCaptionSelector", :location-name "captionSelectors"})) (clojure.core/contains? input :video-selector) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-video-selector (input :video-selector)) #:http.request.field{:name "VideoSelector", :shape "VideoSelector", :location-name "videoSelector"})) (clojure.core/contains? input :audio-selector-groups) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-map-of-audio-selector-group (input :audio-selector-groups)) #:http.request.field{:name "AudioSelectorGroups", :shape "__mapOfAudioSelectorGroup", :location-name "audioSelectorGroups"})) (clojure.core/contains? input :filter-enable) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-input-filter-enable (input :filter-enable)) #:http.request.field{:name "FilterEnable", :shape "InputFilterEnable", :location-name "filterEnable"})) (clojure.core/contains? input :image-inserter) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-image-inserter (input :image-inserter)) #:http.request.field{:name "ImageInserter", :shape "ImageInserter", :location-name "imageInserter"})) (clojure.core/contains? input :psi-control) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-input-psi-control (input :psi-control)) #:http.request.field{:name "PsiControl", :shape "InputPsiControl", :location-name "psiControl"})) (clojure.core/contains? input :audio-selectors) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-map-of-audio-selector (input :audio-selectors)) #:http.request.field{:name "AudioSelectors", :shape "__mapOfAudioSelector", :location-name "audioSelectors"})) (clojure.core/contains? input :file-input) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-string-pattern-s-3-mm-2-vvmmppeeggaavviimmpp-4-ffllvvmmppttmmppggmm-4-vvttrrppff-4-vvmm-2-ttssttss-264-hh-264-mmkkvvmmoovvmmttssmm-2-ttwwmmvvaassffvvoobb-3-ggpp-3-ggppppmmxxffddiivvxxxxvviiddrraawwddvvggxxffmm-1-vv-3-gg-2-vvmmffmm-3-uu-8-llcchhggxxffmmppeegg-2-mmxxffmmppeegg-2-mmxxffhhddwwaavvyy-4-mmxxmmll (input :file-input)) #:http.request.field{:name "FileInput", :shape "__stringPatternS3MM2VVMMPPEEGGAAVVIIMMPP4FFLLVVMMPPTTMMPPGGMM4VVTTRRPPFF4VVMM2TTSSTTSS264HH264MMKKVVMMOOVVMMTTSSMM2TTWWMMVVAASSFFVVOOBB3GGPP3GGPPPPMMXXFFDDIIVVXXXXVVIIDDRRAAWWDDVVGGXXFFMM1VV3GG2VVMMFFMM3UU8LLCCHHGGXXFFMMPPEEGG2MMXXFFMMPPEEGG2MMXXFFHHDDWWAAVVYY4MMXXMMLL", :location-name "fileInput"})) (clojure.core/contains? input :deblock-filter) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-input-deblock-filter (input :deblock-filter)) #:http.request.field{:name "DeblockFilter", :shape "InputDeblockFilter", :location-name "deblockFilter"})) (clojure.core/contains? input :decryption-settings) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-input-decryption-settings (input :decryption-settings)) #:http.request.field{:name "DecryptionSettings", :shape "InputDecryptionSettings", :location-name "decryptionSettings"}))))

(clojure.core/defn- ser-h-265-alternate-transfer-function-sei [input] #:http.request.field{:value (clojure.core/get {"DISABLED" "DISABLED", :disabled "DISABLED", "ENABLED" "ENABLED", :enabled "ENABLED"} input), :shape "H265AlternateTransferFunctionSei"})

(clojure.core/defn- ser-m-2ts-ebp-audio-interval [input] #:http.request.field{:value (clojure.core/get {"VIDEO_AND_FIXED_INTERVALS" "VIDEO_AND_FIXED_INTERVALS", :video-and-fixed-intervals "VIDEO_AND_FIXED_INTERVALS", "VIDEO_INTERVAL" "VIDEO_INTERVAL", :video-interval "VIDEO_INTERVAL"} input), :shape "M2tsEbpAudioInterval"})

(clojure.core/defn- ser-input-psi-control [input] #:http.request.field{:value (clojure.core/get {"IGNORE_PSI" "IGNORE_PSI", :ignore-psi "IGNORE_PSI", "USE_PSI" "USE_PSI", :use-psi "USE_PSI"} input), :shape "InputPsiControl"})

(clojure.core/defn- ser-burnin-subtitle-alignment [input] #:http.request.field{:value (clojure.core/get {"CENTERED" "CENTERED", :centered "CENTERED", "LEFT" "LEFT", :left "LEFT"} input), :shape "BurninSubtitleAlignment"})

(clojure.core/defn- ser-file-source-settings [input] (clojure.core/cond-> #:http.request.field{:value [], :shape "FileSourceSettings", :type "structure"} (clojure.core/contains? input :convert-608-to-708) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-file-source-convert-608-to-708 (input :convert-608-to-708)) #:http.request.field{:name "Convert608To708", :shape "FileSourceConvert608To708", :location-name "convert608To708"})) (clojure.core/contains? input :source-file) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-string-min-14-pattern-s-3-scc-scc-ttml-ttml-dfxp-dfxp-stl-stl-srt-srt-smi-smi (input :source-file)) #:http.request.field{:name "SourceFile", :shape "__stringMin14PatternS3SccSCCTtmlTTMLDfxpDFXPStlSTLSrtSRTSmiSMI", :location-name "sourceFile"})) (clojure.core/contains? input :time-delta) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-integer-min-negative-2147483648-max-2147483647 (input :time-delta)) #:http.request.field{:name "TimeDelta", :shape "__integerMinNegative2147483648Max2147483647", :location-name "timeDelta"}))))

(clojure.core/defn- ser-prores-interlace-mode [input] #:http.request.field{:value (clojure.core/get {:follow-top-field "FOLLOW_TOP_FIELD", :follow-bottom-field "FOLLOW_BOTTOM_FIELD", "BOTTOM_FIELD" "BOTTOM_FIELD", "FOLLOW_TOP_FIELD" "FOLLOW_TOP_FIELD", "PROGRESSIVE" "PROGRESSIVE", "FOLLOW_BOTTOM_FIELD" "FOLLOW_BOTTOM_FIELD", :bottom-field "BOTTOM_FIELD", :progressive "PROGRESSIVE", :top-field "TOP_FIELD", "TOP_FIELD" "TOP_FIELD"} input), :shape "ProresInterlaceMode"})

(clojure.core/defn- ser-caption-source-type [input] #:http.request.field{:value (clojure.core/get {"SCC" "SCC", :scc "SCC", :smi "SMI", "STL" "STL", :imsc "IMSC", :ancillary "ANCILLARY", "SRT" "SRT", :stl "STL", "TELETEXT" "TELETEXT", "DVB_SUB" "DVB_SUB", "SMI" "SMI", :ttml "TTML", "SCTE20" "SCTE20", :null-source "NULL_SOURCE", :teletext "TELETEXT", "EMBEDDED" "EMBEDDED", "TTML" "TTML", :embedded "EMBEDDED", "NULL_SOURCE" "NULL_SOURCE", "IMSC" "IMSC", :scte-20 "SCTE20", "ANCILLARY" "ANCILLARY", :srt "SRT", :dvb-sub "DVB_SUB"} input), :shape "CaptionSourceType"})

(clojure.core/defn- ser-string-min-1-max-256 [input] #:http.request.field{:value input, :shape "__stringMin1Max256"})

(clojure.core/defn- ser-motion-image-inserter [input] (clojure.core/cond-> #:http.request.field{:value [], :shape "MotionImageInserter", :type "structure"} (clojure.core/contains? input :framerate) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-motion-image-insertion-framerate (input :framerate)) #:http.request.field{:name "Framerate", :shape "MotionImageInsertionFramerate", :location-name "framerate"})) (clojure.core/contains? input :input) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-string-min-14-max-1285-pattern-s-3-mov-09-png (input :input)) #:http.request.field{:name "Input", :shape "__stringMin14Max1285PatternS3Mov09Png", :location-name "input"})) (clojure.core/contains? input :insertion-mode) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-motion-image-insertion-mode (input :insertion-mode)) #:http.request.field{:name "InsertionMode", :shape "MotionImageInsertionMode", :location-name "insertionMode"})) (clojure.core/contains? input :offset) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-motion-image-insertion-offset (input :offset)) #:http.request.field{:name "Offset", :shape "MotionImageInsertionOffset", :location-name "offset"})) (clojure.core/contains? input :playback) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-motion-image-playback (input :playback)) #:http.request.field{:name "Playback", :shape "MotionImagePlayback", :location-name "playback"})) (clojure.core/contains? input :start-time) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-string-min-11-max-11-pattern-01-d-20305-d-205-d (input :start-time)) #:http.request.field{:name "StartTime", :shape "__stringMin11Max11Pattern01D20305D205D", :location-name "startTime"}))))

(clojure.core/defn- ser-color-metadata [input] #:http.request.field{:value (clojure.core/get {"IGNORE" "IGNORE", :ignore "IGNORE", "INSERT" "INSERT", :insert "INSERT"} input), :shape "ColorMetadata"})

(clojure.core/defn- ser-integer-min-48000-max-48000 [input] #:http.request.field{:value input, :shape "__integerMin48000Max48000"})

(clojure.core/defn- ser-double-min-negative-59-max-0 [input] #:http.request.field{:value input, :shape "__doubleMinNegative59Max0"})

(clojure.core/defn- ser-string-min-16-max-24-pattern-a-za-z-0922-a-za-z-0916 [input] #:http.request.field{:value input, :shape "__stringMin16Max24PatternAZaZ0922AZaZ0916"})

(clojure.core/defn- ser-integer-min-1000-max-300000000 [input] #:http.request.field{:value input, :shape "__integerMin1000Max300000000"})

(clojure.core/defn- ser-video-codec-settings [input] (clojure.core/cond-> #:http.request.field{:value [], :shape "VideoCodecSettings", :type "structure"} (clojure.core/contains? input :codec) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-video-codec (input :codec)) #:http.request.field{:name "Codec", :shape "VideoCodec", :location-name "codec"})) (clojure.core/contains? input :frame-capture-settings) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-frame-capture-settings (input :frame-capture-settings)) #:http.request.field{:name "FrameCaptureSettings", :shape "FrameCaptureSettings", :location-name "frameCaptureSettings"})) (clojure.core/contains? input :h-264-settings) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-h-264-settings (input :h-264-settings)) #:http.request.field{:name "H264Settings", :shape "H264Settings", :location-name "h264Settings"})) (clojure.core/contains? input :h-265-settings) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-h-265-settings (input :h-265-settings)) #:http.request.field{:name "H265Settings", :shape "H265Settings", :location-name "h265Settings"})) (clojure.core/contains? input :mpeg-2-settings) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-mpeg-2-settings (input :mpeg-2-settings)) #:http.request.field{:name "Mpeg2Settings", :shape "Mpeg2Settings", :location-name "mpeg2Settings"})) (clojure.core/contains? input :prores-settings) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-prores-settings (input :prores-settings)) #:http.request.field{:name "ProresSettings", :shape "ProresSettings", :location-name "proresSettings"}))))

(clojure.core/defn- ser-h-264-qvbr-settings [input] (clojure.core/cond-> #:http.request.field{:value [], :shape "H264QvbrSettings", :type "structure"} (clojure.core/contains? input :max-average-bitrate) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-integer-min-1000-max-1152000000 (input :max-average-bitrate)) #:http.request.field{:name "MaxAverageBitrate", :shape "__integerMin1000Max1152000000", :location-name "maxAverageBitrate"})) (clojure.core/contains? input :qvbr-quality-level) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-integer-min-1-max-10 (input :qvbr-quality-level)) #:http.request.field{:name "QvbrQualityLevel", :shape "__integerMin1Max10", :location-name "qvbrQualityLevel"}))))

(clojure.core/defn- ser-ms-smooth-manifest-encoding [input] #:http.request.field{:value (clojure.core/get {"UTF8" "UTF8", :utf-8 "UTF8", "UTF16" "UTF16", :utf-16 "UTF16"} input), :shape "MsSmoothManifestEncoding"})

(clojure.core/defn- ser-output-group-type [input] #:http.request.field{:value (clojure.core/get {:file-group-settings "FILE_GROUP_SETTINGS", "MS_SMOOTH_GROUP_SETTINGS" "MS_SMOOTH_GROUP_SETTINGS", :cmaf-group-settings "CMAF_GROUP_SETTINGS", "FILE_GROUP_SETTINGS" "FILE_GROUP_SETTINGS", "DASH_ISO_GROUP_SETTINGS" "DASH_ISO_GROUP_SETTINGS", :hls-group-settings "HLS_GROUP_SETTINGS", :ms-smooth-group-settings "MS_SMOOTH_GROUP_SETTINGS", :dash-iso-group-settings "DASH_ISO_GROUP_SETTINGS", "HLS_GROUP_SETTINGS" "HLS_GROUP_SETTINGS", "CMAF_GROUP_SETTINGS" "CMAF_GROUP_SETTINGS"} input), :shape "OutputGroupType"})

(clojure.core/defn- ser-eac-3-dc-filter [input] #:http.request.field{:value (clojure.core/get {"ENABLED" "ENABLED", :enabled "ENABLED", "DISABLED" "DISABLED", :disabled "DISABLED"} input), :shape "Eac3DcFilter"})

(clojure.core/defn- ser-h-264-scene-change-detect [input] #:http.request.field{:value (clojure.core/get {"DISABLED" "DISABLED", :disabled "DISABLED", "ENABLED" "ENABLED", :enabled "ENABLED"} input), :shape "H264SceneChangeDetect"})

(clojure.core/defn- ser-noise-reducer [input] (clojure.core/cond-> #:http.request.field{:value [], :shape "NoiseReducer", :type "structure"} (clojure.core/contains? input :filter) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-noise-reducer-filter (input :filter)) #:http.request.field{:name "Filter", :shape "NoiseReducerFilter", :location-name "filter"})) (clojure.core/contains? input :filter-settings) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-noise-reducer-filter-settings (input :filter-settings)) #:http.request.field{:name "FilterSettings", :shape "NoiseReducerFilterSettings", :location-name "filterSettings"})) (clojure.core/contains? input :spatial-filter-settings) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-noise-reducer-spatial-filter-settings (input :spatial-filter-settings)) #:http.request.field{:name "SpatialFilterSettings", :shape "NoiseReducerSpatialFilterSettings", :location-name "spatialFilterSettings"}))))

(clojure.core/defn- ser-list-of-string-min-1 [input] #:http.request.field{:value (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (clojure.core/merge (ser-string-min-1 coll) #:http.request.field{:shape "__stringMin1"}))) input), :shape "__listOf__stringMin1", :type "list"})

(clojure.core/defn- ser-audio-language-code-control [input] #:http.request.field{:value (clojure.core/get {"FOLLOW_INPUT" "FOLLOW_INPUT", :follow-input "FOLLOW_INPUT", "USE_CONFIGURED" "USE_CONFIGURED", :use-configured "USE_CONFIGURED"} input), :shape "AudioLanguageCodeControl"})

(clojure.core/defn- ser-input-rotate [input] #:http.request.field{:value (clojure.core/get {"DEGREES_180" "DEGREES_180", :degrees-90 "DEGREES_90", "DEGREE_0" "DEGREE_0", "DEGREES_90" "DEGREES_90", :degrees-180 "DEGREES_180", "AUTO" "AUTO", :degrees-270 "DEGREES_270", "DEGREES_270" "DEGREES_270", :degree-0 "DEGREE_0", :auto "AUTO"} input), :shape "InputRotate"})

(clojure.core/defn- ser-integer-min-0-max-50000 [input] #:http.request.field{:value input, :shape "__integerMin0Max50000"})

(clojure.core/defn- ser-aac-coding-mode [input] #:http.request.field{:value (clojure.core/get {"AD_RECEIVER_MIX" "AD_RECEIVER_MIX", "CODING_MODE_1_0" "CODING_MODE_1_0", :ad-receiver-mix "AD_RECEIVER_MIX", :coding-mode-1-0 "CODING_MODE_1_0", :coding-mode-2-0 "CODING_MODE_2_0", :coding-mode-5-1 "CODING_MODE_5_1", "CODING_MODE_1_1" "CODING_MODE_1_1", "CODING_MODE_2_0" "CODING_MODE_2_0", :coding-mode-1-1 "CODING_MODE_1_1", "CODING_MODE_5_1" "CODING_MODE_5_1"} input), :shape "AacCodingMode"})

(clojure.core/defn- ser-h-264-spatial-adaptive-quantization [input] #:http.request.field{:value (clojure.core/get {"DISABLED" "DISABLED", :disabled "DISABLED", "ENABLED" "ENABLED", :enabled "ENABLED"} input), :shape "H264SpatialAdaptiveQuantization"})

(clojure.core/defn- ser-reservation-plan-settings [input] (clojure.core/cond-> #:http.request.field{:value [(clojure.core/into (ser-commitment (:commitment input)) #:http.request.field{:name "Commitment", :shape "Commitment", :location-name "commitment"}) (clojure.core/into (ser-integer (:reserved-slots input)) #:http.request.field{:name "ReservedSlots", :shape "__integer", :location-name "reservedSlots"}) (clojure.core/into (ser-renewal-type (:renewal-type input)) #:http.request.field{:name "RenewalType", :shape "RenewalType", :location-name "renewalType"})], :shape "ReservationPlanSettings", :type "structure"}))

(clojure.core/defn- ser-string-pattern-010920405090509092 [input] #:http.request.field{:value input, :shape "__stringPattern010920405090509092"})

(clojure.core/defn- ser-output-settings [input] (clojure.core/cond-> #:http.request.field{:value [], :shape "OutputSettings", :type "structure"} (clojure.core/contains? input :hls-settings) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-hls-settings (input :hls-settings)) #:http.request.field{:name "HlsSettings", :shape "HlsSettings", :location-name "hlsSettings"}))))

(clojure.core/defn- ser-burnin-subtitle-shadow-color [input] #:http.request.field{:value (clojure.core/get {"NONE" "NONE", :none "NONE", "BLACK" "BLACK", :black "BLACK", "WHITE" "WHITE", :white "WHITE"} input), :shape "BurninSubtitleShadowColor"})

(clojure.core/defn- ser-input-decryption-settings [input] (clojure.core/cond-> #:http.request.field{:value [], :shape "InputDecryptionSettings", :type "structure"} (clojure.core/contains? input :decryption-mode) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-decryption-mode (input :decryption-mode)) #:http.request.field{:name "DecryptionMode", :shape "DecryptionMode", :location-name "decryptionMode"})) (clojure.core/contains? input :encrypted-decryption-key) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-string-min-24-max-512-pattern-a-za-z-0902 (input :encrypted-decryption-key)) #:http.request.field{:name "EncryptedDecryptionKey", :shape "__stringMin24Max512PatternAZaZ0902", :location-name "encryptedDecryptionKey"})) (clojure.core/contains? input :initialization-vector) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-string-min-16-max-24-pattern-a-za-z-0922-a-za-z-0916 (input :initialization-vector)) #:http.request.field{:name "InitializationVector", :shape "__stringMin16Max24PatternAZaZ0922AZaZ0916", :location-name "initializationVector"})) (clojure.core/contains? input :kms-key-region) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-string-min-9-max-19-pattern-az-26-east-west-central-north-south-east-west-1912 (input :kms-key-region)) #:http.request.field{:name "KmsKeyRegion", :shape "__stringMin9Max19PatternAZ26EastWestCentralNorthSouthEastWest1912", :location-name "kmsKeyRegion"}))))

(clojure.core/defn- ser-h-265-gop-size-units [input] #:http.request.field{:value (clojure.core/get {"FRAMES" "FRAMES", :frames "FRAMES", "SECONDS" "SECONDS", :seconds "SECONDS"} input), :shape "H265GopSizeUnits"})

(clojure.core/defn- ser-mp-4-cslg-atom [input] #:http.request.field{:value (clojure.core/get {"INCLUDE" "INCLUDE", :include "INCLUDE", "EXCLUDE" "EXCLUDE", :exclude "EXCLUDE"} input), :shape "Mp4CslgAtom"})

(clojure.core/defn- ser-list-of-output [input] #:http.request.field{:value (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (clojure.core/merge (ser-output coll) #:http.request.field{:shape "Output"}))) input), :shape "__listOfOutput", :type "list"})

(clojure.core/defn- ser-mpeg-2-slow-pal [input] #:http.request.field{:value (clojure.core/get {"DISABLED" "DISABLED", :disabled "DISABLED", "ENABLED" "ENABLED", :enabled "ENABLED"} input), :shape "Mpeg2SlowPal"})

(clojure.core/defn- ser-teletext-destination-settings [input] (clojure.core/cond-> #:http.request.field{:value [], :shape "TeletextDestinationSettings", :type "structure"} (clojure.core/contains? input :page-number) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-string-min-3-max-3-pattern-1809a-faf-09a-eae (input :page-number)) #:http.request.field{:name "PageNumber", :shape "__stringMin3Max3Pattern1809aFAF09aEAE", :location-name "pageNumber"}))))

(clojure.core/defn- ser-output-group [input] (clojure.core/cond-> #:http.request.field{:value [], :shape "OutputGroup", :type "structure"} (clojure.core/contains? input :custom-name) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-string (input :custom-name)) #:http.request.field{:name "CustomName", :shape "__string", :location-name "customName"})) (clojure.core/contains? input :name) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-string (input :name)) #:http.request.field{:name "Name", :shape "__string", :location-name "name"})) (clojure.core/contains? input :output-group-settings) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-output-group-settings (input :output-group-settings)) #:http.request.field{:name "OutputGroupSettings", :shape "OutputGroupSettings", :location-name "outputGroupSettings"})) (clojure.core/contains? input :outputs) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-list-of-output (input :outputs)) #:http.request.field{:name "Outputs", :shape "__listOfOutput", :location-name "outputs"}))))

(clojure.core/defn- ser-h-265-quality-tuning-level [input] #:http.request.field{:value (clojure.core/get {"SINGLE_PASS" "SINGLE_PASS", :single-pass "SINGLE_PASS", "SINGLE_PASS_HQ" "SINGLE_PASS_HQ", :single-pass-hq "SINGLE_PASS_HQ", "MULTI_PASS_HQ" "MULTI_PASS_HQ", :multi-pass-hq "MULTI_PASS_HQ"} input), :shape "H265QualityTuningLevel"})

(clojure.core/defn- ser-mpeg-2-dynamic-sub-gop [input] #:http.request.field{:value (clojure.core/get {"ADAPTIVE" "ADAPTIVE", :adaptive "ADAPTIVE", "STATIC" "STATIC", :static "STATIC"} input), :shape "Mpeg2DynamicSubGop"})

(clojure.core/defn- ser-image-inserter [input] (clojure.core/cond-> #:http.request.field{:value [], :shape "ImageInserter", :type "structure"} (clojure.core/contains? input :insertable-images) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-list-of-insertable-image (input :insertable-images)) #:http.request.field{:name "InsertableImages", :shape "__listOfInsertableImage", :location-name "insertableImages"}))))

(clojure.core/defn- ser-hls-client-cache [input] #:http.request.field{:value (clojure.core/get {"DISABLED" "DISABLED", :disabled "DISABLED", "ENABLED" "ENABLED", :enabled "ENABLED"} input), :shape "HlsClientCache"})

(clojure.core/defn- ser-input-filter-enable [input] #:http.request.field{:value (clojure.core/get {"AUTO" "AUTO", :auto "AUTO", "DISABLE" "DISABLE", :disable "DISABLE", "FORCE" "FORCE", :force "FORCE"} input), :shape "InputFilterEnable"})

(clojure.core/defn- ser-integer-min-0-max-10000 [input] #:http.request.field{:value input, :shape "__integerMin0Max10000"})

(clojure.core/defn- ser-burnin-subtitle-outline-color [input] #:http.request.field{:value (clojure.core/get {:white "WHITE", :yellow "YELLOW", :green "GREEN", "GREEN" "GREEN", "BLUE" "BLUE", :red "RED", :blue "BLUE", "WHITE" "WHITE", "YELLOW" "YELLOW", "BLACK" "BLACK", "RED" "RED", :black "BLACK"} input), :shape "BurninSubtitleOutlineColor"})

(clojure.core/defn- ser-embedded-source-settings [input] (clojure.core/cond-> #:http.request.field{:value [], :shape "EmbeddedSourceSettings", :type "structure"} (clojure.core/contains? input :convert-608-to-708) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-embedded-convert-608-to-708 (input :convert-608-to-708)) #:http.request.field{:name "Convert608To708", :shape "EmbeddedConvert608To708", :location-name "convert608To708"})) (clojure.core/contains? input :source-608-channel-number) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-integer-min-1-max-4 (input :source-608-channel-number)) #:http.request.field{:name "Source608ChannelNumber", :shape "__integerMin1Max4", :location-name "source608ChannelNumber"})) (clojure.core/contains? input :source-608-track-number) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-integer-min-1-max-1 (input :source-608-track-number)) #:http.request.field{:name "Source608TrackNumber", :shape "__integerMin1Max1", :location-name "source608TrackNumber"}))))

(clojure.core/defn- ser-cmaf-key-provider-type [input] #:http.request.field{:value (clojure.core/get {"STATIC_KEY" "STATIC_KEY", :static-key "STATIC_KEY"} input), :shape "CmafKeyProviderType"})

(clojure.core/defn- ser-integer-min-negative-2147483648-max-2147483647 [input] #:http.request.field{:value input, :shape "__integerMinNegative2147483648Max2147483647"})

(clojure.core/defn- ser-h-264-gop-b-reference [input] #:http.request.field{:value (clojure.core/get {"DISABLED" "DISABLED", :disabled "DISABLED", "ENABLED" "ENABLED", :enabled "ENABLED"} input), :shape "H264GopBReference"})

(clojure.core/defn- ser-video-codec [input] #:http.request.field{:value (clojure.core/get {:h-264 "H_264", :mpeg-2 "MPEG2", "H_264" "H_264", :prores "PRORES", "MPEG2" "MPEG2", :h-265 "H_265", :frame-capture "FRAME_CAPTURE", "H_265" "H_265", "FRAME_CAPTURE" "FRAME_CAPTURE", "PRORES" "PRORES"} input), :shape "VideoCodec"})

(clojure.core/defn- ser-list-of-input [input] #:http.request.field{:value (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (clojure.core/merge (ser-input coll) #:http.request.field{:shape "Input"}))) input), :shape "__listOfInput", :type "list"})

(clojure.core/defn- ser-integer-min-negative-5-max-5 [input] #:http.request.field{:value input, :shape "__integerMinNegative5Max5"})

(clojure.core/defn- ser-integer-min-24-max-60000 [input] #:http.request.field{:value input, :shape "__integerMin24Max60000"})

(clojure.core/defn- ser-double-min-negative-60-max-3 [input] #:http.request.field{:value input, :shape "__doubleMinNegative60Max3"})

(clojure.core/defn- ser-input-deblock-filter [input] #:http.request.field{:value (clojure.core/get {"ENABLED" "ENABLED", :enabled "ENABLED", "DISABLED" "DISABLED", :disabled "DISABLED"} input), :shape "InputDeblockFilter"})

(clojure.core/defn- ser-string-min-14-pattern-s-3-bmp-bmp-png-png-tga-tga [input] #:http.request.field{:value input, :shape "__stringMin14PatternS3BmpBMPPngPNGTgaTGA"})

(clojure.core/defn- ser-double-min-0-max-2147483647 [input] #:http.request.field{:value input, :shape "__doubleMin0Max2147483647"})

(clojure.core/defn- ser-job-settings [input] (clojure.core/cond-> #:http.request.field{:value [], :shape "JobSettings", :type "structure"} (clojure.core/contains? input :esam) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-esam-settings (input :esam)) #:http.request.field{:name "Esam", :shape "EsamSettings", :location-name "esam"})) (clojure.core/contains? input :inputs) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-list-of-input (input :inputs)) #:http.request.field{:name "Inputs", :shape "__listOfInput", :location-name "inputs"})) (clojure.core/contains? input :timed-metadata-insertion) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-timed-metadata-insertion (input :timed-metadata-insertion)) #:http.request.field{:name "TimedMetadataInsertion", :shape "TimedMetadataInsertion", :location-name "timedMetadataInsertion"})) (clojure.core/contains? input :motion-image-inserter) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-motion-image-inserter (input :motion-image-inserter)) #:http.request.field{:name "MotionImageInserter", :shape "MotionImageInserter", :location-name "motionImageInserter"})) (clojure.core/contains? input :timecode-config) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-timecode-config (input :timecode-config)) #:http.request.field{:name "TimecodeConfig", :shape "TimecodeConfig", :location-name "timecodeConfig"})) (clojure.core/contains? input :ad-avail-offset) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-integer-min-negative-1000-max-1000 (input :ad-avail-offset)) #:http.request.field{:name "AdAvailOffset", :shape "__integerMinNegative1000Max1000", :location-name "adAvailOffset"})) (clojure.core/contains? input :output-groups) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-list-of-output-group (input :output-groups)) #:http.request.field{:name "OutputGroups", :shape "__listOfOutputGroup", :location-name "outputGroups"})) (clojure.core/contains? input :nielsen-configuration) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-nielsen-configuration (input :nielsen-configuration)) #:http.request.field{:name "NielsenConfiguration", :shape "NielsenConfiguration", :location-name "nielsenConfiguration"})) (clojure.core/contains? input :avail-blanking) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-avail-blanking (input :avail-blanking)) #:http.request.field{:name "AvailBlanking", :shape "AvailBlanking", :location-name "availBlanking"}))))

(clojure.core/defn- ser-string-min-14-max-1285-pattern-s-3-mov-09-png [input] #:http.request.field{:value input, :shape "__stringMin14Max1285PatternS3Mov09Png"})

(clojure.core/defn- ser-audio-codec [input] #:http.request.field{:value (clojure.core/get {:eac-3 "EAC3", :mp-2 "MP2", "EAC3" "EAC3", :wav "WAV", "AC3" "AC3", "PASSTHROUGH" "PASSTHROUGH", :aac "AAC", "MP2" "MP2", "AAC" "AAC", :aiff "AIFF", "AIFF" "AIFF", :passthrough "PASSTHROUGH", "WAV" "WAV", :ac-3 "AC3"} input), :shape "AudioCodec"})

(clojure.core/defn- ser-h-265-settings [input] (clojure.core/cond-> #:http.request.field{:value [], :shape "H265Settings", :type "structure"} (clojure.core/contains? input :rate-control-mode) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-h-265-rate-control-mode (input :rate-control-mode)) #:http.request.field{:name "RateControlMode", :shape "H265RateControlMode", :location-name "rateControlMode"})) (clojure.core/contains? input :unregistered-sei-timecode) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-h-265-unregistered-sei-timecode (input :unregistered-sei-timecode)) #:http.request.field{:name "UnregisteredSeiTimecode", :shape "H265UnregisteredSeiTimecode", :location-name "unregisteredSeiTimecode"})) (clojure.core/contains? input :interlace-mode) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-h-265-interlace-mode (input :interlace-mode)) #:http.request.field{:name "InterlaceMode", :shape "H265InterlaceMode", :location-name "interlaceMode"})) (clojure.core/contains? input :min-i-interval) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-integer-min-0-max-30 (input :min-i-interval)) #:http.request.field{:name "MinIInterval", :shape "__integerMin0Max30", :location-name "minIInterval"})) (clojure.core/contains? input :par-denominator) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-integer-min-1-max-2147483647 (input :par-denominator)) #:http.request.field{:name "ParDenominator", :shape "__integerMin1Max2147483647", :location-name "parDenominator"})) (clojure.core/contains? input :gop-b-reference) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-h-265-gop-b-reference (input :gop-b-reference)) #:http.request.field{:name "GopBReference", :shape "H265GopBReference", :location-name "gopBReference"})) (clojure.core/contains? input :number-reference-frames) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-integer-min-1-max-6 (input :number-reference-frames)) #:http.request.field{:name "NumberReferenceFrames", :shape "__integerMin1Max6", :location-name "numberReferenceFrames"})) (clojure.core/contains? input :quality-tuning-level) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-h-265-quality-tuning-level (input :quality-tuning-level)) #:http.request.field{:name "QualityTuningLevel", :shape "H265QualityTuningLevel", :location-name "qualityTuningLevel"})) (clojure.core/contains? input :tiles) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-h-265-tiles (input :tiles)) #:http.request.field{:name "Tiles", :shape "H265Tiles", :location-name "tiles"})) (clojure.core/contains? input :adaptive-quantization) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-h-265-adaptive-quantization (input :adaptive-quantization)) #:http.request.field{:name "AdaptiveQuantization", :shape "H265AdaptiveQuantization", :location-name "adaptiveQuantization"})) (clojure.core/contains? input :framerate-denominator) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-integer-min-1-max-2147483647 (input :framerate-denominator)) #:http.request.field{:name "FramerateDenominator", :shape "__integerMin1Max2147483647", :location-name "framerateDenominator"})) (clojure.core/contains? input :framerate-control) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-h-265-framerate-control (input :framerate-control)) #:http.request.field{:name "FramerateControl", :shape "H265FramerateControl", :location-name "framerateControl"})) (clojure.core/contains? input :alternate-transfer-function-sei) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-h-265-alternate-transfer-function-sei (input :alternate-transfer-function-sei)) #:http.request.field{:name "AlternateTransferFunctionSei", :shape "H265AlternateTransferFunctionSei", :location-name "alternateTransferFunctionSei"})) (clojure.core/contains? input :hrd-buffer-size) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-integer-min-0-max-1466400000 (input :hrd-buffer-size)) #:http.request.field{:name "HrdBufferSize", :shape "__integerMin0Max1466400000", :location-name "hrdBufferSize"})) (clojure.core/contains? input :slow-pal) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-h-265-slow-pal (input :slow-pal)) #:http.request.field{:name "SlowPal", :shape "H265SlowPal", :location-name "slowPal"})) (clojure.core/contains? input :dynamic-sub-gop) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-h-265-dynamic-sub-gop (input :dynamic-sub-gop)) #:http.request.field{:name "DynamicSubGop", :shape "H265DynamicSubGop", :location-name "dynamicSubGop"})) (clojure.core/contains? input :number-b-frames-between-reference-frames) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-integer-min-0-max-7 (input :number-b-frames-between-reference-frames)) #:http.request.field{:name "NumberBFramesBetweenReferenceFrames", :shape "__integerMin0Max7", :location-name "numberBFramesBetweenReferenceFrames"})) (clojure.core/contains? input :qvbr-settings) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-h-265-qvbr-settings (input :qvbr-settings)) #:http.request.field{:name "QvbrSettings", :shape "H265QvbrSettings", :location-name "qvbrSettings"})) (clojure.core/contains? input :gop-closed-cadence) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-integer-min-0-max-2147483647 (input :gop-closed-cadence)) #:http.request.field{:name "GopClosedCadence", :shape "__integerMin0Max2147483647", :location-name "gopClosedCadence"})) (clojure.core/contains? input :spatial-adaptive-quantization) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-h-265-spatial-adaptive-quantization (input :spatial-adaptive-quantization)) #:http.request.field{:name "SpatialAdaptiveQuantization", :shape "H265SpatialAdaptiveQuantization", :location-name "spatialAdaptiveQuantization"})) (clojure.core/contains? input :framerate-numerator) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-integer-min-1-max-2147483647 (input :framerate-numerator)) #:http.request.field{:name "FramerateNumerator", :shape "__integerMin1Max2147483647", :location-name "framerateNumerator"})) (clojure.core/contains? input :gop-size-units) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-h-265-gop-size-units (input :gop-size-units)) #:http.request.field{:name "GopSizeUnits", :shape "H265GopSizeUnits", :location-name "gopSizeUnits"})) (clojure.core/contains? input :max-bitrate) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-integer-min-1000-max-1466400000 (input :max-bitrate)) #:http.request.field{:name "MaxBitrate", :shape "__integerMin1000Max1466400000", :location-name "maxBitrate"})) (clojure.core/contains? input :codec-profile) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-h-265-codec-profile (input :codec-profile)) #:http.request.field{:name "CodecProfile", :shape "H265CodecProfile", :location-name "codecProfile"})) (clojure.core/contains? input :temporal-ids) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-h-265-temporal-ids (input :temporal-ids)) #:http.request.field{:name "TemporalIds", :shape "H265TemporalIds", :location-name "temporalIds"})) (clojure.core/contains? input :flicker-adaptive-quantization) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-h-265-flicker-adaptive-quantization (input :flicker-adaptive-quantization)) #:http.request.field{:name "FlickerAdaptiveQuantization", :shape "H265FlickerAdaptiveQuantization", :location-name "flickerAdaptiveQuantization"})) (clojure.core/contains? input :par-numerator) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-integer-min-1-max-2147483647 (input :par-numerator)) #:http.request.field{:name "ParNumerator", :shape "__integerMin1Max2147483647", :location-name "parNumerator"})) (clojure.core/contains? input :gop-size) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-double-min-0 (input :gop-size)) #:http.request.field{:name "GopSize", :shape "__doubleMin0", :location-name "gopSize"})) (clojure.core/contains? input :sample-adaptive-offset-filter-mode) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-h-265-sample-adaptive-offset-filter-mode (input :sample-adaptive-offset-filter-mode)) #:http.request.field{:name "SampleAdaptiveOffsetFilterMode", :shape "H265SampleAdaptiveOffsetFilterMode", :location-name "sampleAdaptiveOffsetFilterMode"})) (clojure.core/contains? input :par-control) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-h-265-par-control (input :par-control)) #:http.request.field{:name "ParControl", :shape "H265ParControl", :location-name "parControl"})) (clojure.core/contains? input :codec-level) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-h-265-codec-level (input :codec-level)) #:http.request.field{:name "CodecLevel", :shape "H265CodecLevel", :location-name "codecLevel"})) (clojure.core/contains? input :telecine) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-h-265-telecine (input :telecine)) #:http.request.field{:name "Telecine", :shape "H265Telecine", :location-name "telecine"})) (clojure.core/contains? input :hrd-buffer-initial-fill-percentage) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-integer-min-0-max-100 (input :hrd-buffer-initial-fill-percentage)) #:http.request.field{:name "HrdBufferInitialFillPercentage", :shape "__integerMin0Max100", :location-name "hrdBufferInitialFillPercentage"})) (clojure.core/contains? input :slices) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-integer-min-1-max-32 (input :slices)) #:http.request.field{:name "Slices", :shape "__integerMin1Max32", :location-name "slices"})) (clojure.core/contains? input :temporal-adaptive-quantization) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-h-265-temporal-adaptive-quantization (input :temporal-adaptive-quantization)) #:http.request.field{:name "TemporalAdaptiveQuantization", :shape "H265TemporalAdaptiveQuantization", :location-name "temporalAdaptiveQuantization"})) (clojure.core/contains? input :framerate-conversion-algorithm) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-h-265-framerate-conversion-algorithm (input :framerate-conversion-algorithm)) #:http.request.field{:name "FramerateConversionAlgorithm", :shape "H265FramerateConversionAlgorithm", :location-name "framerateConversionAlgorithm"})) (clojure.core/contains? input :scene-change-detect) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-h-265-scene-change-detect (input :scene-change-detect)) #:http.request.field{:name "SceneChangeDetect", :shape "H265SceneChangeDetect", :location-name "sceneChangeDetect"})) (clojure.core/contains? input :write-mp-4-packaging-type) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-h-265-write-mp-4-packaging-type (input :write-mp-4-packaging-type)) #:http.request.field{:name "WriteMp4PackagingType", :shape "H265WriteMp4PackagingType", :location-name "writeMp4PackagingType"})) (clojure.core/contains? input :bitrate) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-integer-min-1000-max-1466400000 (input :bitrate)) #:http.request.field{:name "Bitrate", :shape "__integerMin1000Max1466400000", :location-name "bitrate"}))))

(clojure.core/defn- ser-cmaf-initialization-vector-in-manifest [input] #:http.request.field{:value (clojure.core/get {"INCLUDE" "INCLUDE", :include "INCLUDE", "EXCLUDE" "EXCLUDE", :exclude "EXCLUDE"} input), :shape "CmafInitializationVectorInManifest"})

(clojure.core/defn- ser-ac-3-coding-mode [input] #:http.request.field{:value (clojure.core/get {"CODING_MODE_1_0" "CODING_MODE_1_0", :coding-mode-1-0 "CODING_MODE_1_0", "CODING_MODE_1_1" "CODING_MODE_1_1", :coding-mode-1-1 "CODING_MODE_1_1", "CODING_MODE_2_0" "CODING_MODE_2_0", :coding-mode-2-0 "CODING_MODE_2_0", "CODING_MODE_3_2_LFE" "CODING_MODE_3_2_LFE", :coding-mode-3-2-lfe "CODING_MODE_3_2_LFE"} input), :shape "Ac3CodingMode"})

(clojure.core/defn- ser-integer-min-10-max-48 [input] #:http.request.field{:value input, :shape "__integerMin10Max48"})

(clojure.core/defn- ser-m-2ts-nielsen-id-3 [input] #:http.request.field{:value (clojure.core/get {"INSERT" "INSERT", :insert "INSERT", "NONE" "NONE", :none "NONE"} input), :shape "M2tsNielsenId3"})

(clojure.core/defn- ser-integer-min-0-max-10 [input] #:http.request.field{:value input, :shape "__integerMin0Max10"})

(clojure.core/defn- ser-aac-rate-control-mode [input] #:http.request.field{:value (clojure.core/get {"CBR" "CBR", :cbr "CBR", "VBR" "VBR", :vbr "VBR"} input), :shape "AacRateControlMode"})

(clojure.core/defn- ser-h-264-interlace-mode [input] #:http.request.field{:value (clojure.core/get {:follow-top-field "FOLLOW_TOP_FIELD", :follow-bottom-field "FOLLOW_BOTTOM_FIELD", "BOTTOM_FIELD" "BOTTOM_FIELD", "FOLLOW_TOP_FIELD" "FOLLOW_TOP_FIELD", "PROGRESSIVE" "PROGRESSIVE", "FOLLOW_BOTTOM_FIELD" "FOLLOW_BOTTOM_FIELD", :bottom-field "BOTTOM_FIELD", :progressive "PROGRESSIVE", :top-field "TOP_FIELD", "TOP_FIELD" "TOP_FIELD"} input), :shape "H264InterlaceMode"})

(clojure.core/defn- ser-mpeg-2-codec-profile [input] #:http.request.field{:value (clojure.core/get {"MAIN" "MAIN", :main "MAIN", "PROFILE_422" "PROFILE_422", :profile-422 "PROFILE_422"} input), :shape "Mpeg2CodecProfile"})

(clojure.core/defn- ser-integer-min-negative-1000-max-1000 [input] #:http.request.field{:value input, :shape "__integerMinNegative1000Max1000"})

(clojure.core/defn- ser-integer-min-1-max-2 [input] #:http.request.field{:value input, :shape "__integerMin1Max2"})

(clojure.core/defn- ser-mpeg-2-telecine [input] #:http.request.field{:value (clojure.core/get {"NONE" "NONE", :none "NONE", "SOFT" "SOFT", :soft "SOFT", "HARD" "HARD", :hard "HARD"} input), :shape "Mpeg2Telecine"})

(clojure.core/defn- ser-audio-normalization-loudness-logging [input] #:http.request.field{:value (clojure.core/get {"LOG" "LOG", :log "LOG", "DONT_LOG" "DONT_LOG", :dont-log "DONT_LOG"} input), :shape "AudioNormalizationLoudnessLogging"})

(clojure.core/defn- ser-h-265-dynamic-sub-gop [input] #:http.request.field{:value (clojure.core/get {"ADAPTIVE" "ADAPTIVE", :adaptive "ADAPTIVE", "STATIC" "STATIC", :static "STATIC"} input), :shape "H265DynamicSubGop"})

(clojure.core/defn- ser-cmaf-write-dash-manifest [input] #:http.request.field{:value (clojure.core/get {"DISABLED" "DISABLED", :disabled "DISABLED", "ENABLED" "ENABLED", :enabled "ENABLED"} input), :shape "CmafWriteDASHManifest"})

(clojure.core/defn- ser-dvb-subtitle-alignment [input] #:http.request.field{:value (clojure.core/get {"CENTERED" "CENTERED", :centered "CENTERED", "LEFT" "LEFT", :left "LEFT"} input), :shape "DvbSubtitleAlignment"})

(clojure.core/defn- ser-mpeg-2-temporal-adaptive-quantization [input] #:http.request.field{:value (clojure.core/get {"DISABLED" "DISABLED", :disabled "DISABLED", "ENABLED" "ENABLED", :enabled "ENABLED"} input), :shape "Mpeg2TemporalAdaptiveQuantization"})

(clojure.core/defn- ser-aac-codec-profile [input] #:http.request.field{:value (clojure.core/get {"LC" "LC", :lc "LC", "HEV1" "HEV1", :hev-1 "HEV1", "HEV2" "HEV2", :hev-2 "HEV2"} input), :shape "AacCodecProfile"})

(clojure.core/defn- ser-prores-par-control [input] #:http.request.field{:value (clojure.core/get {"INITIALIZE_FROM_SOURCE" "INITIALIZE_FROM_SOURCE", :initialize-from-source "INITIALIZE_FROM_SOURCE", "SPECIFIED" "SPECIFIED", :specified "SPECIFIED"} input), :shape "ProresParControl"})

(clojure.core/defn- ser-mpeg-2-par-control [input] #:http.request.field{:value (clojure.core/get {"INITIALIZE_FROM_SOURCE" "INITIALIZE_FROM_SOURCE", :initialize-from-source "INITIALIZE_FROM_SOURCE", "SPECIFIED" "SPECIFIED", :specified "SPECIFIED"} input), :shape "Mpeg2ParControl"})

(clojure.core/defn- ser-deinterlacer [input] (clojure.core/cond-> #:http.request.field{:value [], :shape "Deinterlacer", :type "structure"} (clojure.core/contains? input :algorithm) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-deinterlace-algorithm (input :algorithm)) #:http.request.field{:name "Algorithm", :shape "DeinterlaceAlgorithm", :location-name "algorithm"})) (clojure.core/contains? input :control) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-deinterlacer-control (input :control)) #:http.request.field{:name "Control", :shape "DeinterlacerControl", :location-name "control"})) (clojure.core/contains? input :mode) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-deinterlacer-mode (input :mode)) #:http.request.field{:name "Mode", :shape "DeinterlacerMode", :location-name "mode"}))))

(clojure.core/defn- ser-cmaf-encryption-settings [input] (clojure.core/cond-> #:http.request.field{:value [], :shape "CmafEncryptionSettings", :type "structure"} (clojure.core/contains? input :constant-initialization-vector) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-string-min-32-max-32-pattern-09a-faf-32 (input :constant-initialization-vector)) #:http.request.field{:name "ConstantInitializationVector", :shape "__stringMin32Max32Pattern09aFAF32", :location-name "constantInitializationVector"})) (clojure.core/contains? input :encryption-method) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-cmaf-encryption-type (input :encryption-method)) #:http.request.field{:name "EncryptionMethod", :shape "CmafEncryptionType", :location-name "encryptionMethod"})) (clojure.core/contains? input :initialization-vector-in-manifest) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-cmaf-initialization-vector-in-manifest (input :initialization-vector-in-manifest)) #:http.request.field{:name "InitializationVectorInManifest", :shape "CmafInitializationVectorInManifest", :location-name "initializationVectorInManifest"})) (clojure.core/contains? input :static-key-provider) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-static-key-provider (input :static-key-provider)) #:http.request.field{:name "StaticKeyProvider", :shape "StaticKeyProvider", :location-name "staticKeyProvider"})) (clojure.core/contains? input :type) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-cmaf-key-provider-type (input :type)) #:http.request.field{:name "Type", :shape "CmafKeyProviderType", :location-name "type"}))))

(clojure.core/defn- ser-mov-clap-atom [input] #:http.request.field{:value (clojure.core/get {"INCLUDE" "INCLUDE", :include "INCLUDE", "EXCLUDE" "EXCLUDE", :exclude "EXCLUDE"} input), :shape "MovClapAtom"})

(clojure.core/defn- ser-integer-min-negative-180-max-180 [input] #:http.request.field{:value input, :shape "__integerMinNegative180Max180"})

(clojure.core/defn- ser-integer-min-64000-max-640000 [input] #:http.request.field{:value input, :shape "__integerMin64000Max640000"})

(clojure.core/defn- ser-respond-to-afd [input] #:http.request.field{:value (clojure.core/get {"NONE" "NONE", :none "NONE", "RESPOND" "RESPOND", :respond "RESPOND", "PASSTHROUGH" "PASSTHROUGH", :passthrough "PASSTHROUGH"} input), :shape "RespondToAfd"})

(clojure.core/defn- ser-string-pattern-a-za-z-0932 [input] #:http.request.field{:value input, :shape "__stringPatternAZaZ0932"})

(clojure.core/defn- ser-eac-3-attenuation-control [input] #:http.request.field{:value (clojure.core/get {"ATTENUATE_3_DB" "ATTENUATE_3_DB", :attenuate-3-db "ATTENUATE_3_DB", "NONE" "NONE", :none "NONE"} input), :shape "Eac3AttenuationControl"})

(clojure.core/defn- ser-integer-min-0-max-96 [input] #:http.request.field{:value input, :shape "__integerMin0Max96"})

(clojure.core/defn- ser-h-264-framerate-control [input] #:http.request.field{:value (clojure.core/get {"INITIALIZE_FROM_SOURCE" "INITIALIZE_FROM_SOURCE", :initialize-from-source "INITIALIZE_FROM_SOURCE", "SPECIFIED" "SPECIFIED", :specified "SPECIFIED"} input), :shape "H264FramerateControl"})

(clojure.core/defn- ser-timecode-config [input] (clojure.core/cond-> #:http.request.field{:value [], :shape "TimecodeConfig", :type "structure"} (clojure.core/contains? input :anchor) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-string-pattern-010920405090509092 (input :anchor)) #:http.request.field{:name "Anchor", :shape "__stringPattern010920405090509092", :location-name "anchor"})) (clojure.core/contains? input :source) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-timecode-source (input :source)) #:http.request.field{:name "Source", :shape "TimecodeSource", :location-name "source"})) (clojure.core/contains? input :start) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-string-pattern-010920405090509092 (input :start)) #:http.request.field{:name "Start", :shape "__stringPattern010920405090509092", :location-name "start"})) (clojure.core/contains? input :timestamp-offset) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-string-pattern-0940191020191209301 (input :timestamp-offset)) #:http.request.field{:name "TimestampOffset", :shape "__stringPattern0940191020191209301", :location-name "timestampOffset"}))))

(clojure.core/defn- ser-dvb-sub-destination-settings [input] (clojure.core/cond-> #:http.request.field{:value [], :shape "DvbSubDestinationSettings", :type "structure"} (clojure.core/contains? input :teletext-spacing) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-dvb-subtitle-teletext-spacing (input :teletext-spacing)) #:http.request.field{:name "TeletextSpacing", :shape "DvbSubtitleTeletextSpacing", :location-name "teletextSpacing"})) (clojure.core/contains? input :outline-color) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-dvb-subtitle-outline-color (input :outline-color)) #:http.request.field{:name "OutlineColor", :shape "DvbSubtitleOutlineColor", :location-name "outlineColor"})) (clojure.core/contains? input :font-script) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-font-script (input :font-script)) #:http.request.field{:name "FontScript", :shape "FontScript", :location-name "fontScript"})) (clojure.core/contains? input :outline-size) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-integer-min-0-max-10 (input :outline-size)) #:http.request.field{:name "OutlineSize", :shape "__integerMin0Max10", :location-name "outlineSize"})) (clojure.core/contains? input :shadow-color) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-dvb-subtitle-shadow-color (input :shadow-color)) #:http.request.field{:name "ShadowColor", :shape "DvbSubtitleShadowColor", :location-name "shadowColor"})) (clojure.core/contains? input :shadow-opacity) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-integer-min-0-max-255 (input :shadow-opacity)) #:http.request.field{:name "ShadowOpacity", :shape "__integerMin0Max255", :location-name "shadowOpacity"})) (clojure.core/contains? input :shadow-y-offset) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-integer-min-negative-2147483648-max-2147483647 (input :shadow-y-offset)) #:http.request.field{:name "ShadowYOffset", :shape "__integerMinNegative2147483648Max2147483647", :location-name "shadowYOffset"})) (clojure.core/contains? input :background-color) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-dvb-subtitle-background-color (input :background-color)) #:http.request.field{:name "BackgroundColor", :shape "DvbSubtitleBackgroundColor", :location-name "backgroundColor"})) (clojure.core/contains? input :y-position) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-integer-min-0-max-2147483647 (input :y-position)) #:http.request.field{:name "YPosition", :shape "__integerMin0Max2147483647", :location-name "yPosition"})) (clojure.core/contains? input :font-color) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-dvb-subtitle-font-color (input :font-color)) #:http.request.field{:name "FontColor", :shape "DvbSubtitleFontColor", :location-name "fontColor"})) (clojure.core/contains? input :x-position) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-integer-min-0-max-2147483647 (input :x-position)) #:http.request.field{:name "XPosition", :shape "__integerMin0Max2147483647", :location-name "xPosition"})) (clojure.core/contains? input :font-resolution) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-integer-min-96-max-600 (input :font-resolution)) #:http.request.field{:name "FontResolution", :shape "__integerMin96Max600", :location-name "fontResolution"})) (clojure.core/contains? input :font-size) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-integer-min-0-max-96 (input :font-size)) #:http.request.field{:name "FontSize", :shape "__integerMin0Max96", :location-name "fontSize"})) (clojure.core/contains? input :background-opacity) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-integer-min-0-max-255 (input :background-opacity)) #:http.request.field{:name "BackgroundOpacity", :shape "__integerMin0Max255", :location-name "backgroundOpacity"})) (clojure.core/contains? input :font-opacity) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-integer-min-0-max-255 (input :font-opacity)) #:http.request.field{:name "FontOpacity", :shape "__integerMin0Max255", :location-name "fontOpacity"})) (clojure.core/contains? input :shadow-x-offset) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-integer-min-negative-2147483648-max-2147483647 (input :shadow-x-offset)) #:http.request.field{:name "ShadowXOffset", :shape "__integerMinNegative2147483648Max2147483647", :location-name "shadowXOffset"})) (clojure.core/contains? input :alignment) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-dvb-subtitle-alignment (input :alignment)) #:http.request.field{:name "Alignment", :shape "DvbSubtitleAlignment", :location-name "alignment"}))))

(clojure.core/defn- ser-aac-audio-description-broadcaster-mix [input] #:http.request.field{:value (clojure.core/get {"BROADCASTER_MIXED_AD" "BROADCASTER_MIXED_AD", :broadcaster-mixed-ad "BROADCASTER_MIXED_AD", "NORMAL" "NORMAL", :normal "NORMAL"} input), :shape "AacAudioDescriptionBroadcasterMix"})

(clojure.core/defn- ser-embedded-convert-608-to-708 [input] #:http.request.field{:value (clojure.core/get {"UPCONVERT" "UPCONVERT", :upconvert "UPCONVERT", "DISABLED" "DISABLED", :disabled "DISABLED"} input), :shape "EmbeddedConvert608To708"})

(clojure.core/defn- ser-string-min-1 [input] #:http.request.field{:value input, :shape "__stringMin1"})

(clojure.core/defn- ser-dvb-subtitle-teletext-spacing [input] #:http.request.field{:value (clojure.core/get {"FIXED_GRID" "FIXED_GRID", :fixed-grid "FIXED_GRID", "PROPORTIONAL" "PROPORTIONAL", :proportional "PROPORTIONAL"} input), :shape "DvbSubtitleTeletextSpacing"})

(clojure.core/defn- ser-video-timecode-insertion [input] #:http.request.field{:value (clojure.core/get {"DISABLED" "DISABLED", :disabled "DISABLED", "PIC_TIMING_SEI" "PIC_TIMING_SEI", :pic-timing-sei "PIC_TIMING_SEI"} input), :shape "VideoTimecodeInsertion"})

(clojure.core/defn- ser-mp-4-free-space-box [input] #:http.request.field{:value (clojure.core/get {"INCLUDE" "INCLUDE", :include "INCLUDE", "EXCLUDE" "EXCLUDE", :exclude "EXCLUDE"} input), :shape "Mp4FreeSpaceBox"})

(clojure.core/defn- ser-integer-min-1-max-2147483640 [input] #:http.request.field{:value input, :shape "__integerMin1Max2147483640"})

(clojure.core/defn- ser-describe-endpoints-mode [input] #:http.request.field{:value (clojure.core/get {"DEFAULT" "DEFAULT", :default "DEFAULT", "GET_ONLY" "GET_ONLY", :get-only "GET_ONLY"} input), :shape "DescribeEndpointsMode"})

(clojure.core/defn- ser-list-of-string-pattern-09a-faf-809a-faf-409a-faf-409a-faf-409a-faf-12 [input] #:http.request.field{:value (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (clojure.core/merge (ser-string-pattern-09a-faf-809a-faf-409a-faf-409a-faf-409a-faf-12 coll) #:http.request.field{:shape "__stringPattern09aFAF809aFAF409aFAF409aFAF409aFAF12"}))) input), :shape "__listOf__stringPattern09aFAF809aFAF409aFAF409aFAF409aFAF12", :type "list"})

(clojure.core/defn- ser-audio-selector-group [input] (clojure.core/cond-> #:http.request.field{:value [], :shape "AudioSelectorGroup", :type "structure"} (clojure.core/contains? input :audio-selector-names) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-list-of-string-min-1 (input :audio-selector-names)) #:http.request.field{:name "AudioSelectorNames", :shape "__listOf__stringMin1", :location-name "audioSelectorNames"}))))

(clojure.core/defn- ser-ac-3-settings [input] (clojure.core/cond-> #:http.request.field{:value [], :shape "Ac3Settings", :type "structure"} (clojure.core/contains? input :bitrate) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-integer-min-64000-max-640000 (input :bitrate)) #:http.request.field{:name "Bitrate", :shape "__integerMin64000Max640000", :location-name "bitrate"})) (clojure.core/contains? input :bitstream-mode) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-ac-3-bitstream-mode (input :bitstream-mode)) #:http.request.field{:name "BitstreamMode", :shape "Ac3BitstreamMode", :location-name "bitstreamMode"})) (clojure.core/contains? input :coding-mode) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-ac-3-coding-mode (input :coding-mode)) #:http.request.field{:name "CodingMode", :shape "Ac3CodingMode", :location-name "codingMode"})) (clojure.core/contains? input :dialnorm) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-integer-min-1-max-31 (input :dialnorm)) #:http.request.field{:name "Dialnorm", :shape "__integerMin1Max31", :location-name "dialnorm"})) (clojure.core/contains? input :dynamic-range-compression-profile) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-ac-3-dynamic-range-compression-profile (input :dynamic-range-compression-profile)) #:http.request.field{:name "DynamicRangeCompressionProfile", :shape "Ac3DynamicRangeCompressionProfile", :location-name "dynamicRangeCompressionProfile"})) (clojure.core/contains? input :lfe-filter) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-ac-3-lfe-filter (input :lfe-filter)) #:http.request.field{:name "LfeFilter", :shape "Ac3LfeFilter", :location-name "lfeFilter"})) (clojure.core/contains? input :metadata-control) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-ac-3-metadata-control (input :metadata-control)) #:http.request.field{:name "MetadataControl", :shape "Ac3MetadataControl", :location-name "metadataControl"})) (clojure.core/contains? input :sample-rate) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-integer-min-48000-max-48000 (input :sample-rate)) #:http.request.field{:name "SampleRate", :shape "__integerMin48000Max48000", :location-name "sampleRate"}))))

(clojure.core/defn- ser-integer-min-0-max-8 [input] #:http.request.field{:value input, :shape "__integerMin0Max8"})

(clojure.core/defn- ser-ms-smooth-group-settings [input] (clojure.core/cond-> #:http.request.field{:value [], :shape "MsSmoothGroupSettings", :type "structure"} (clojure.core/contains? input :audio-deduplication) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-ms-smooth-audio-deduplication (input :audio-deduplication)) #:http.request.field{:name "AudioDeduplication", :shape "MsSmoothAudioDeduplication", :location-name "audioDeduplication"})) (clojure.core/contains? input :destination) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-string-pattern-s-3 (input :destination)) #:http.request.field{:name "Destination", :shape "__stringPatternS3", :location-name "destination"})) (clojure.core/contains? input :encryption) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-ms-smooth-encryption-settings (input :encryption)) #:http.request.field{:name "Encryption", :shape "MsSmoothEncryptionSettings", :location-name "encryption"})) (clojure.core/contains? input :fragment-length) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-integer-min-1-max-2147483647 (input :fragment-length)) #:http.request.field{:name "FragmentLength", :shape "__integerMin1Max2147483647", :location-name "fragmentLength"})) (clojure.core/contains? input :manifest-encoding) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-ms-smooth-manifest-encoding (input :manifest-encoding)) #:http.request.field{:name "ManifestEncoding", :shape "MsSmoothManifestEncoding", :location-name "manifestEncoding"}))))

(clojure.core/defn- ser-h-265-scene-change-detect [input] #:http.request.field{:value (clojure.core/get {"DISABLED" "DISABLED", :disabled "DISABLED", "ENABLED" "ENABLED", :enabled "ENABLED"} input), :shape "H265SceneChangeDetect"})

(clojure.core/defn- ser-integer-min-0-max-7 [input] #:http.request.field{:value input, :shape "__integerMin0Max7"})

(clojure.core/defn- ser-h-264-entropy-encoding [input] #:http.request.field{:value (clojure.core/get {"CABAC" "CABAC", :cabac "CABAC", "CAVLC" "CAVLC", :cavlc "CAVLC"} input), :shape "H264EntropyEncoding"})

(clojure.core/defn- ser-hls-initialization-vector-in-manifest [input] #:http.request.field{:value (clojure.core/get {"INCLUDE" "INCLUDE", :include "INCLUDE", "EXCLUDE" "EXCLUDE", :exclude "EXCLUDE"} input), :shape "HlsInitializationVectorInManifest"})

(clojure.core/defn- ser-h-265-spatial-adaptive-quantization [input] #:http.request.field{:value (clojure.core/get {"DISABLED" "DISABLED", :disabled "DISABLED", "ENABLED" "ENABLED", :enabled "ENABLED"} input), :shape "H265SpatialAdaptiveQuantization"})

(clojure.core/defn- ser-mov-cslg-atom [input] #:http.request.field{:value (clojure.core/get {"INCLUDE" "INCLUDE", :include "INCLUDE", "EXCLUDE" "EXCLUDE", :exclude "EXCLUDE"} input), :shape "MovCslgAtom"})

(clojure.core/defn- ser-output [input] (clojure.core/cond-> #:http.request.field{:value [], :shape "Output", :type "structure"} (clojure.core/contains? input :audio-descriptions) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-list-of-audio-description (input :audio-descriptions)) #:http.request.field{:name "AudioDescriptions", :shape "__listOfAudioDescription", :location-name "audioDescriptions"})) (clojure.core/contains? input :caption-descriptions) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-list-of-caption-description (input :caption-descriptions)) #:http.request.field{:name "CaptionDescriptions", :shape "__listOfCaptionDescription", :location-name "captionDescriptions"})) (clojure.core/contains? input :container-settings) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-container-settings (input :container-settings)) #:http.request.field{:name "ContainerSettings", :shape "ContainerSettings", :location-name "containerSettings"})) (clojure.core/contains? input :extension) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-string (input :extension)) #:http.request.field{:name "Extension", :shape "__string", :location-name "extension"})) (clojure.core/contains? input :name-modifier) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-string-min-1 (input :name-modifier)) #:http.request.field{:name "NameModifier", :shape "__stringMin1", :location-name "nameModifier"})) (clojure.core/contains? input :output-settings) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-output-settings (input :output-settings)) #:http.request.field{:name "OutputSettings", :shape "OutputSettings", :location-name "outputSettings"})) (clojure.core/contains? input :preset) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-string-min-0 (input :preset)) #:http.request.field{:name "Preset", :shape "__stringMin0", :location-name "preset"})) (clojure.core/contains? input :video-description) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-video-description (input :video-description)) #:http.request.field{:name "VideoDescription", :shape "VideoDescription", :location-name "videoDescription"}))))

(clojure.core/defn- ser-string-pattern-identity-a-za-z-26-a-za-z-09163 [input] #:http.request.field{:value input, :shape "__stringPatternIdentityAZaZ26AZaZ09163"})

(clojure.core/defn- ser-integer-min-1-max-17895697 [input] #:http.request.field{:value input, :shape "__integerMin1Max17895697"})

(clojure.core/defn- ser-h-265-codec-profile [input] #:http.request.field{:value (clojure.core/get {"MAIN_422_10BIT_HIGH" "MAIN_422_10BIT_HIGH", :main-422-8-bit-main "MAIN_422_8BIT_MAIN", :main-main "MAIN_MAIN", "MAIN10_MAIN" "MAIN10_MAIN", :main-10-high "MAIN10_HIGH", "MAIN_MAIN" "MAIN_MAIN", "MAIN_422_8BIT_HIGH" "MAIN_422_8BIT_HIGH", :main-10-main "MAIN10_MAIN", :main-422-10-bit-high "MAIN_422_10BIT_HIGH", "MAIN_422_8BIT_MAIN" "MAIN_422_8BIT_MAIN", :main-422-8-bit-high "MAIN_422_8BIT_HIGH", :main-422-10-bit-main "MAIN_422_10BIT_MAIN", :main-high "MAIN_HIGH", "MAIN_422_10BIT_MAIN" "MAIN_422_10BIT_MAIN", "MAIN10_HIGH" "MAIN10_HIGH", "MAIN_HIGH" "MAIN_HIGH"} input), :shape "H265CodecProfile"})

(clojure.core/defn- ser-burnin-subtitle-font-color [input] #:http.request.field{:value (clojure.core/get {:white "WHITE", :yellow "YELLOW", :green "GREEN", "GREEN" "GREEN", "BLUE" "BLUE", :red "RED", :blue "BLUE", "WHITE" "WHITE", "YELLOW" "YELLOW", "BLACK" "BLACK", "RED" "RED", :black "BLACK"} input), :shape "BurninSubtitleFontColor"})

(clojure.core/defn- ser-color-space-usage [input] #:http.request.field{:value (clojure.core/get {"FORCE" "FORCE", :force "FORCE", "FALLBACK" "FALLBACK", :fallback "FALLBACK"} input), :shape "ColorSpaceUsage"})

(clojure.core/defn- ser-integer [input] #:http.request.field{:value input, :shape "__integer"})

(clojure.core/defn- ser-aac-settings [input] (clojure.core/cond-> #:http.request.field{:value [], :shape "AacSettings", :type "structure"} (clojure.core/contains? input :rate-control-mode) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-aac-rate-control-mode (input :rate-control-mode)) #:http.request.field{:name "RateControlMode", :shape "AacRateControlMode", :location-name "rateControlMode"})) (clojure.core/contains? input :coding-mode) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-aac-coding-mode (input :coding-mode)) #:http.request.field{:name "CodingMode", :shape "AacCodingMode", :location-name "codingMode"})) (clojure.core/contains? input :sample-rate) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-integer-min-8000-max-96000 (input :sample-rate)) #:http.request.field{:name "SampleRate", :shape "__integerMin8000Max96000", :location-name "sampleRate"})) (clojure.core/contains? input :vbr-quality) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-aac-vbr-quality (input :vbr-quality)) #:http.request.field{:name "VbrQuality", :shape "AacVbrQuality", :location-name "vbrQuality"})) (clojure.core/contains? input :specification) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-aac-specification (input :specification)) #:http.request.field{:name "Specification", :shape "AacSpecification", :location-name "specification"})) (clojure.core/contains? input :codec-profile) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-aac-codec-profile (input :codec-profile)) #:http.request.field{:name "CodecProfile", :shape "AacCodecProfile", :location-name "codecProfile"})) (clojure.core/contains? input :raw-format) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-aac-raw-format (input :raw-format)) #:http.request.field{:name "RawFormat", :shape "AacRawFormat", :location-name "rawFormat"})) (clojure.core/contains? input :audio-description-broadcaster-mix) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-aac-audio-description-broadcaster-mix (input :audio-description-broadcaster-mix)) #:http.request.field{:name "AudioDescriptionBroadcasterMix", :shape "AacAudioDescriptionBroadcasterMix", :location-name "audioDescriptionBroadcasterMix"})) (clojure.core/contains? input :bitrate) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-integer-min-6000-max-1024000 (input :bitrate)) #:http.request.field{:name "Bitrate", :shape "__integerMin6000Max1024000", :location-name "bitrate"}))))

(clojure.core/defn- ser-integer-min-1000-max-1466400000 [input] #:http.request.field{:value input, :shape "__integerMin1000Max1466400000"})

(clojure.core/defn- ser-h-265-temporal-ids [input] #:http.request.field{:value (clojure.core/get {"DISABLED" "DISABLED", :disabled "DISABLED", "ENABLED" "ENABLED", :enabled "ENABLED"} input), :shape "H265TemporalIds"})

(clojure.core/defn- ser-list-of-caption-description [input] #:http.request.field{:value (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (clojure.core/merge (ser-caption-description coll) #:http.request.field{:shape "CaptionDescription"}))) input), :shape "__listOfCaptionDescription", :type "list"})

(clojure.core/defn- ser-embedded-destination-settings [input] (clojure.core/cond-> #:http.request.field{:value [], :shape "EmbeddedDestinationSettings", :type "structure"} (clojure.core/contains? input :destination-608-channel-number) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-integer-min-1-max-4 (input :destination-608-channel-number)) #:http.request.field{:name "Destination608ChannelNumber", :shape "__integerMin1Max4", :location-name "destination608ChannelNumber"}))))

(clojure.core/defn- ser-timecode-burnin-position [input] #:http.request.field{:value (clojure.core/get {"TOP_CENTER" "TOP_CENTER", "MIDDLE_LEFT" "MIDDLE_LEFT", :top-right "TOP_RIGHT", "MIDDLE_CENTER" "MIDDLE_CENTER", "MIDDLE_RIGHT" "MIDDLE_RIGHT", "BOTTOM_LEFT" "BOTTOM_LEFT", :top-left "TOP_LEFT", "TOP_LEFT" "TOP_LEFT", :bottom-right "BOTTOM_RIGHT", "BOTTOM_CENTER" "BOTTOM_CENTER", :bottom-left "BOTTOM_LEFT", :top-center "TOP_CENTER", "TOP_RIGHT" "TOP_RIGHT", :middle-left "MIDDLE_LEFT", :bottom-center "BOTTOM_CENTER", :middle-center "MIDDLE_CENTER", :middle-right "MIDDLE_RIGHT", "BOTTOM_RIGHT" "BOTTOM_RIGHT"} input), :shape "TimecodeBurninPosition"})

(clojure.core/defn- ser-caption-selector [input] (clojure.core/cond-> #:http.request.field{:value [], :shape "CaptionSelector", :type "structure"} (clojure.core/contains? input :custom-language-code) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-string-min-3-max-3-pattern-a-za-z-3 (input :custom-language-code)) #:http.request.field{:name "CustomLanguageCode", :shape "__stringMin3Max3PatternAZaZ3", :location-name "customLanguageCode"})) (clojure.core/contains? input :language-code) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-language-code (input :language-code)) #:http.request.field{:name "LanguageCode", :shape "LanguageCode", :location-name "languageCode"})) (clojure.core/contains? input :source-settings) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-caption-source-settings (input :source-settings)) #:http.request.field{:name "SourceSettings", :shape "CaptionSourceSettings", :location-name "sourceSettings"}))))

(clojure.core/defn- ser-burnin-destination-settings [input] (clojure.core/cond-> #:http.request.field{:value [], :shape "BurninDestinationSettings", :type "structure"} (clojure.core/contains? input :teletext-spacing) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-burnin-subtitle-teletext-spacing (input :teletext-spacing)) #:http.request.field{:name "TeletextSpacing", :shape "BurninSubtitleTeletextSpacing", :location-name "teletextSpacing"})) (clojure.core/contains? input :outline-color) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-burnin-subtitle-outline-color (input :outline-color)) #:http.request.field{:name "OutlineColor", :shape "BurninSubtitleOutlineColor", :location-name "outlineColor"})) (clojure.core/contains? input :font-script) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-font-script (input :font-script)) #:http.request.field{:name "FontScript", :shape "FontScript", :location-name "fontScript"})) (clojure.core/contains? input :outline-size) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-integer-min-0-max-10 (input :outline-size)) #:http.request.field{:name "OutlineSize", :shape "__integerMin0Max10", :location-name "outlineSize"})) (clojure.core/contains? input :shadow-color) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-burnin-subtitle-shadow-color (input :shadow-color)) #:http.request.field{:name "ShadowColor", :shape "BurninSubtitleShadowColor", :location-name "shadowColor"})) (clojure.core/contains? input :shadow-opacity) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-integer-min-0-max-255 (input :shadow-opacity)) #:http.request.field{:name "ShadowOpacity", :shape "__integerMin0Max255", :location-name "shadowOpacity"})) (clojure.core/contains? input :shadow-y-offset) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-integer-min-negative-2147483648-max-2147483647 (input :shadow-y-offset)) #:http.request.field{:name "ShadowYOffset", :shape "__integerMinNegative2147483648Max2147483647", :location-name "shadowYOffset"})) (clojure.core/contains? input :background-color) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-burnin-subtitle-background-color (input :background-color)) #:http.request.field{:name "BackgroundColor", :shape "BurninSubtitleBackgroundColor", :location-name "backgroundColor"})) (clojure.core/contains? input :y-position) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-integer-min-0-max-2147483647 (input :y-position)) #:http.request.field{:name "YPosition", :shape "__integerMin0Max2147483647", :location-name "yPosition"})) (clojure.core/contains? input :font-color) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-burnin-subtitle-font-color (input :font-color)) #:http.request.field{:name "FontColor", :shape "BurninSubtitleFontColor", :location-name "fontColor"})) (clojure.core/contains? input :x-position) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-integer-min-0-max-2147483647 (input :x-position)) #:http.request.field{:name "XPosition", :shape "__integerMin0Max2147483647", :location-name "xPosition"})) (clojure.core/contains? input :font-resolution) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-integer-min-96-max-600 (input :font-resolution)) #:http.request.field{:name "FontResolution", :shape "__integerMin96Max600", :location-name "fontResolution"})) (clojure.core/contains? input :font-size) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-integer-min-0-max-96 (input :font-size)) #:http.request.field{:name "FontSize", :shape "__integerMin0Max96", :location-name "fontSize"})) (clojure.core/contains? input :background-opacity) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-integer-min-0-max-255 (input :background-opacity)) #:http.request.field{:name "BackgroundOpacity", :shape "__integerMin0Max255", :location-name "backgroundOpacity"})) (clojure.core/contains? input :font-opacity) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-integer-min-0-max-255 (input :font-opacity)) #:http.request.field{:name "FontOpacity", :shape "__integerMin0Max255", :location-name "fontOpacity"})) (clojure.core/contains? input :shadow-x-offset) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-integer-min-negative-2147483648-max-2147483647 (input :shadow-x-offset)) #:http.request.field{:name "ShadowXOffset", :shape "__integerMinNegative2147483648Max2147483647", :location-name "shadowXOffset"})) (clojure.core/contains? input :alignment) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-burnin-subtitle-alignment (input :alignment)) #:http.request.field{:name "Alignment", :shape "BurninSubtitleAlignment", :location-name "alignment"}))))

(clojure.core/defn- ser-hls-group-settings [input] (clojure.core/cond-> #:http.request.field{:value [], :shape "HlsGroupSettings", :type "structure"} (clojure.core/contains? input :segment-length) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-integer-min-1-max-2147483647 (input :segment-length)) #:http.request.field{:name "SegmentLength", :shape "__integerMin1Max2147483647", :location-name "segmentLength"})) (clojure.core/contains? input :timestamp-delta-milliseconds) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-integer-min-negative-2147483648-max-2147483647 (input :timestamp-delta-milliseconds)) #:http.request.field{:name "TimestampDeltaMilliseconds", :shape "__integerMinNegative2147483648Max2147483647", :location-name "timestampDeltaMilliseconds"})) (clojure.core/contains? input :program-date-time-period) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-integer-min-0-max-3600 (input :program-date-time-period)) #:http.request.field{:name "ProgramDateTimePeriod", :shape "__integerMin0Max3600", :location-name "programDateTimePeriod"})) (clojure.core/contains? input :segment-control) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-hls-segment-control (input :segment-control)) #:http.request.field{:name "SegmentControl", :shape "HlsSegmentControl", :location-name "segmentControl"})) (clojure.core/contains? input :ad-markers) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-list-of-hls-ad-markers (input :ad-markers)) #:http.request.field{:name "AdMarkers", :shape "__listOfHlsAdMarkers", :location-name "adMarkers"})) (clojure.core/contains? input :base-url) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-string (input :base-url)) #:http.request.field{:name "BaseUrl", :shape "__string", :location-name "baseUrl"})) (clojure.core/contains? input :destination) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-string-pattern-s-3 (input :destination)) #:http.request.field{:name "Destination", :shape "__stringPatternS3", :location-name "destination"})) (clojure.core/contains? input :min-final-segment-length) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-double-min-0-max-2147483647 (input :min-final-segment-length)) #:http.request.field{:name "MinFinalSegmentLength", :shape "__doubleMin0Max2147483647", :location-name "minFinalSegmentLength"})) (clojure.core/contains? input :caption-language-mappings) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-list-of-hls-caption-language-mapping (input :caption-language-mappings)) #:http.request.field{:name "CaptionLanguageMappings", :shape "__listOfHlsCaptionLanguageMapping", :location-name "captionLanguageMappings"})) (clojure.core/contains? input :timed-metadata-id-3-frame) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-hls-timed-metadata-id-3-frame (input :timed-metadata-id-3-frame)) #:http.request.field{:name "TimedMetadataId3Frame", :shape "HlsTimedMetadataId3Frame", :location-name "timedMetadataId3Frame"})) (clojure.core/contains? input :directory-structure) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-hls-directory-structure (input :directory-structure)) #:http.request.field{:name "DirectoryStructure", :shape "HlsDirectoryStructure", :location-name "directoryStructure"})) (clojure.core/contains? input :min-segment-length) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-integer-min-0-max-2147483647 (input :min-segment-length)) #:http.request.field{:name "MinSegmentLength", :shape "__integerMin0Max2147483647", :location-name "minSegmentLength"})) (clojure.core/contains? input :stream-inf-resolution) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-hls-stream-inf-resolution (input :stream-inf-resolution)) #:http.request.field{:name "StreamInfResolution", :shape "HlsStreamInfResolution", :location-name "streamInfResolution"})) (clojure.core/contains? input :program-date-time) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-hls-program-date-time (input :program-date-time)) #:http.request.field{:name "ProgramDateTime", :shape "HlsProgramDateTime", :location-name "programDateTime"})) (clojure.core/contains? input :output-selection) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-hls-output-selection (input :output-selection)) #:http.request.field{:name "OutputSelection", :shape "HlsOutputSelection", :location-name "outputSelection"})) (clojure.core/contains? input :caption-language-setting) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-hls-caption-language-setting (input :caption-language-setting)) #:http.request.field{:name "CaptionLanguageSetting", :shape "HlsCaptionLanguageSetting", :location-name "captionLanguageSetting"})) (clojure.core/contains? input :manifest-duration-format) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-hls-manifest-duration-format (input :manifest-duration-format)) #:http.request.field{:name "ManifestDurationFormat", :shape "HlsManifestDurationFormat", :location-name "manifestDurationFormat"})) (clojure.core/contains? input :timed-metadata-id-3-period) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-integer-min-negative-2147483648-max-2147483647 (input :timed-metadata-id-3-period)) #:http.request.field{:name "TimedMetadataId3Period", :shape "__integerMinNegative2147483648Max2147483647", :location-name "timedMetadataId3Period"})) (clojure.core/contains? input :manifest-compression) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-hls-manifest-compression (input :manifest-compression)) #:http.request.field{:name "ManifestCompression", :shape "HlsManifestCompression", :location-name "manifestCompression"})) (clojure.core/contains? input :segments-per-subdirectory) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-integer-min-1-max-2147483647 (input :segments-per-subdirectory)) #:http.request.field{:name "SegmentsPerSubdirectory", :shape "__integerMin1Max2147483647", :location-name "segmentsPerSubdirectory"})) (clojure.core/contains? input :encryption) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-hls-encryption-settings (input :encryption)) #:http.request.field{:name "Encryption", :shape "HlsEncryptionSettings", :location-name "encryption"})) (clojure.core/contains? input :codec-specification) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-hls-codec-specification (input :codec-specification)) #:http.request.field{:name "CodecSpecification", :shape "HlsCodecSpecification", :location-name "codecSpecification"})) (clojure.core/contains? input :client-cache) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-hls-client-cache (input :client-cache)) #:http.request.field{:name "ClientCache", :shape "HlsClientCache", :location-name "clientCache"}))))

(clojure.core/defn- ser-dvb-nit-settings [input] (clojure.core/cond-> #:http.request.field{:value [], :shape "DvbNitSettings", :type "structure"} (clojure.core/contains? input :network-id) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-integer-min-0-max-65535 (input :network-id)) #:http.request.field{:name "NetworkId", :shape "__integerMin0Max65535", :location-name "networkId"})) (clojure.core/contains? input :network-name) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-string-min-1-max-256 (input :network-name)) #:http.request.field{:name "NetworkName", :shape "__stringMin1Max256", :location-name "networkName"})) (clojure.core/contains? input :nit-interval) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-integer-min-25-max-10000 (input :nit-interval)) #:http.request.field{:name "NitInterval", :shape "__integerMin25Max10000", :location-name "nitInterval"}))))

(clojure.core/defn- ser-integer-min-1-max-20 [input] #:http.request.field{:value input, :shape "__integerMin1Max20"})

(clojure.core/defn- ser-cmaf-manifest-duration-format [input] #:http.request.field{:value (clojure.core/get {"FLOATING_POINT" "FLOATING_POINT", :floating-point "FLOATING_POINT", "INTEGER" "INTEGER", :integer "INTEGER"} input), :shape "CmafManifestDurationFormat"})

(clojure.core/defn- ser-queue-list-by [input] #:http.request.field{:value (clojure.core/get {"NAME" "NAME", :name "NAME", "CREATION_DATE" "CREATION_DATE", :creation-date "CREATION_DATE"} input), :shape "QueueListBy"})

(clojure.core/defn- ser-h-265-write-mp-4-packaging-type [input] #:http.request.field{:value (clojure.core/get {"HVC1" "HVC1", :hvc-1 "HVC1", "HEV1" "HEV1", :hev-1 "HEV1"} input), :shape "H265WriteMp4PackagingType"})

(clojure.core/defn- ser-hls-segment-control [input] #:http.request.field{:value (clojure.core/get {"SINGLE_FILE" "SINGLE_FILE", :single-file "SINGLE_FILE", "SEGMENTED_FILES" "SEGMENTED_FILES", :segmented-files "SEGMENTED_FILES"} input), :shape "HlsSegmentControl"})

(clojure.core/defn- ser-prores-telecine [input] #:http.request.field{:value (clojure.core/get {"NONE" "NONE", :none "NONE", "HARD" "HARD", :hard "HARD"} input), :shape "ProresTelecine"})

(clojure.core/defn- ser-ac-3-dynamic-range-compression-profile [input] #:http.request.field{:value (clojure.core/get {"FILM_STANDARD" "FILM_STANDARD", :film-standard "FILM_STANDARD", "NONE" "NONE", :none "NONE"} input), :shape "Ac3DynamicRangeCompressionProfile"})

(clojure.core/defn- ser-h-265-flicker-adaptive-quantization [input] #:http.request.field{:value (clojure.core/get {"DISABLED" "DISABLED", :disabled "DISABLED", "ENABLED" "ENABLED", :enabled "ENABLED"} input), :shape "H265FlickerAdaptiveQuantization"})

(clojure.core/defn- ser-string-min-3-max-3-pattern-a-za-z-3 [input] #:http.request.field{:value input, :shape "__stringMin3Max3PatternAZaZ3"})

(clojure.core/defn- ser-double-min-negative-60-max-negative-1 [input] #:http.request.field{:value input, :shape "__doubleMinNegative60MaxNegative1"})

(clojure.core/defn- ser-m-2ts-scte-35-esam [input] (clojure.core/cond-> #:http.request.field{:value [], :shape "M2tsScte35Esam", :type "structure"} (clojure.core/contains? input :scte-35-esam-pid) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-integer-min-32-max-8182 (input :scte-35-esam-pid)) #:http.request.field{:name "Scte35EsamPid", :shape "__integerMin32Max8182", :location-name "scte35EsamPid"}))))

(clojure.core/defn- ser-frame-capture-settings [input] (clojure.core/cond-> #:http.request.field{:value [], :shape "FrameCaptureSettings", :type "structure"} (clojure.core/contains? input :framerate-denominator) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-integer-min-1-max-2147483647 (input :framerate-denominator)) #:http.request.field{:name "FramerateDenominator", :shape "__integerMin1Max2147483647", :location-name "framerateDenominator"})) (clojure.core/contains? input :framerate-numerator) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-integer-min-1-max-2147483647 (input :framerate-numerator)) #:http.request.field{:name "FramerateNumerator", :shape "__integerMin1Max2147483647", :location-name "framerateNumerator"})) (clojure.core/contains? input :max-captures) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-integer-min-1-max-10000000 (input :max-captures)) #:http.request.field{:name "MaxCaptures", :shape "__integerMin1Max10000000", :location-name "maxCaptures"})) (clojure.core/contains? input :quality) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-integer-min-1-max-100 (input :quality)) #:http.request.field{:name "Quality", :shape "__integerMin1Max100", :location-name "quality"}))))

(clojure.core/defn- ser-hls-program-date-time [input] #:http.request.field{:value (clojure.core/get {"INCLUDE" "INCLUDE", :include "INCLUDE", "EXCLUDE" "EXCLUDE", :exclude "EXCLUDE"} input), :shape "HlsProgramDateTime"})

(clojure.core/defn- ser-h-265-framerate-control [input] #:http.request.field{:value (clojure.core/get {"INITIALIZE_FROM_SOURCE" "INITIALIZE_FROM_SOURCE", :initialize-from-source "INITIALIZE_FROM_SOURCE", "SPECIFIED" "SPECIFIED", :specified "SPECIFIED"} input), :shape "H265FramerateControl"})

(clojure.core/defn- ser-nielsen-configuration [input] (clojure.core/cond-> #:http.request.field{:value [], :shape "NielsenConfiguration", :type "structure"} (clojure.core/contains? input :breakout-code) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-integer-min-0-max-9 (input :breakout-code)) #:http.request.field{:name "BreakoutCode", :shape "__integerMin0Max9", :location-name "breakoutCode"})) (clojure.core/contains? input :distributor-id) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-string (input :distributor-id)) #:http.request.field{:name "DistributorId", :shape "__string", :location-name "distributorId"}))))

(clojure.core/defn- ser-static-key-provider [input] (clojure.core/cond-> #:http.request.field{:value [], :shape "StaticKeyProvider", :type "structure"} (clojure.core/contains? input :key-format) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-string-pattern-identity-a-za-z-26-a-za-z-09163 (input :key-format)) #:http.request.field{:name "KeyFormat", :shape "__stringPatternIdentityAZaZ26AZaZ09163", :location-name "keyFormat"})) (clojure.core/contains? input :key-format-versions) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-string-pattern-dd (input :key-format-versions)) #:http.request.field{:name "KeyFormatVersions", :shape "__stringPatternDD", :location-name "keyFormatVersions"})) (clojure.core/contains? input :static-key-value) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-string-pattern-a-za-z-0932 (input :static-key-value)) #:http.request.field{:name "StaticKeyValue", :shape "__stringPatternAZaZ0932", :location-name "staticKeyValue"})) (clojure.core/contains? input :url) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-string (input :url)) #:http.request.field{:name "Url", :shape "__string", :location-name "url"}))))

(clojure.core/defn- ser-esam-settings [input] (clojure.core/cond-> #:http.request.field{:value [], :shape "EsamSettings", :type "structure"} (clojure.core/contains? input :manifest-confirm-condition-notification) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-esam-manifest-confirm-condition-notification (input :manifest-confirm-condition-notification)) #:http.request.field{:name "ManifestConfirmConditionNotification", :shape "EsamManifestConfirmConditionNotification", :location-name "manifestConfirmConditionNotification"})) (clojure.core/contains? input :response-signal-preroll) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-integer-min-0-max-30000 (input :response-signal-preroll)) #:http.request.field{:name "ResponseSignalPreroll", :shape "__integerMin0Max30000", :location-name "responseSignalPreroll"})) (clojure.core/contains? input :signal-processing-notification) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-esam-signal-processing-notification (input :signal-processing-notification)) #:http.request.field{:name "SignalProcessingNotification", :shape "EsamSignalProcessingNotification", :location-name "signalProcessingNotification"}))))

(clojure.core/defn- ser-decryption-mode [input] #:http.request.field{:value (clojure.core/get {"AES_CTR" "AES_CTR", :aes-ctr "AES_CTR", "AES_CBC" "AES_CBC", :aes-cbc "AES_CBC", "AES_GCM" "AES_GCM", :aes-gcm "AES_GCM"} input), :shape "DecryptionMode"})

(clojure.core/defn- ser-integer-min-1000-max-1152000000 [input] #:http.request.field{:value input, :shape "__integerMin1000Max1152000000"})

(clojure.core/defn- ser-audio-codec-settings [input] (clojure.core/cond-> #:http.request.field{:value [], :shape "AudioCodecSettings", :type "structure"} (clojure.core/contains? input :aac-settings) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-aac-settings (input :aac-settings)) #:http.request.field{:name "AacSettings", :shape "AacSettings", :location-name "aacSettings"})) (clojure.core/contains? input :ac-3-settings) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-ac-3-settings (input :ac-3-settings)) #:http.request.field{:name "Ac3Settings", :shape "Ac3Settings", :location-name "ac3Settings"})) (clojure.core/contains? input :aiff-settings) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-aiff-settings (input :aiff-settings)) #:http.request.field{:name "AiffSettings", :shape "AiffSettings", :location-name "aiffSettings"})) (clojure.core/contains? input :codec) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-audio-codec (input :codec)) #:http.request.field{:name "Codec", :shape "AudioCodec", :location-name "codec"})) (clojure.core/contains? input :eac-3-settings) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-eac-3-settings (input :eac-3-settings)) #:http.request.field{:name "Eac3Settings", :shape "Eac3Settings", :location-name "eac3Settings"})) (clojure.core/contains? input :mp-2-settings) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-mp-2-settings (input :mp-2-settings)) #:http.request.field{:name "Mp2Settings", :shape "Mp2Settings", :location-name "mp2Settings"})) (clojure.core/contains? input :wav-settings) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-wav-settings (input :wav-settings)) #:http.request.field{:name "WavSettings", :shape "WavSettings", :location-name "wavSettings"}))))

(clojure.core/defn- ser-mpeg-2-intra-dc-precision [input] #:http.request.field{:value (clojure.core/get {"INTRA_DC_PRECISION_10" "INTRA_DC_PRECISION_10", :intra-dc-precision-8 "INTRA_DC_PRECISION_8", "AUTO" "AUTO", :intra-dc-precision-9 "INTRA_DC_PRECISION_9", :intra-dc-precision-11 "INTRA_DC_PRECISION_11", "INTRA_DC_PRECISION_9" "INTRA_DC_PRECISION_9", "INTRA_DC_PRECISION_11" "INTRA_DC_PRECISION_11", :intra-dc-precision-10 "INTRA_DC_PRECISION_10", :auto "AUTO", "INTRA_DC_PRECISION_8" "INTRA_DC_PRECISION_8"} input), :shape "Mpeg2IntraDcPrecision"})

(clojure.core/defn- ser-mpeg-2-spatial-adaptive-quantization [input] #:http.request.field{:value (clojure.core/get {"DISABLED" "DISABLED", :disabled "DISABLED", "ENABLED" "ENABLED", :enabled "ENABLED"} input), :shape "Mpeg2SpatialAdaptiveQuantization"})

(clojure.core/defn- ser-rectangle [input] (clojure.core/cond-> #:http.request.field{:value [], :shape "Rectangle", :type "structure"} (clojure.core/contains? input :height) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-integer-min-2-max-2147483647 (input :height)) #:http.request.field{:name "Height", :shape "__integerMin2Max2147483647", :location-name "height"})) (clojure.core/contains? input :width) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-integer-min-2-max-2147483647 (input :width)) #:http.request.field{:name "Width", :shape "__integerMin2Max2147483647", :location-name "width"})) (clojure.core/contains? input :x) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-integer-min-0-max-2147483647 (input :x)) #:http.request.field{:name "X", :shape "__integerMin0Max2147483647", :location-name "x"})) (clojure.core/contains? input :y) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-integer-min-0-max-2147483647 (input :y)) #:http.request.field{:name "Y", :shape "__integerMin0Max2147483647", :location-name "y"}))))

(clojure.core/defn- ser-mpeg-2-quality-tuning-level [input] #:http.request.field{:value (clojure.core/get {"SINGLE_PASS" "SINGLE_PASS", :single-pass "SINGLE_PASS", "MULTI_PASS" "MULTI_PASS", :multi-pass "MULTI_PASS"} input), :shape "Mpeg2QualityTuningLevel"})

(clojure.core/defn- ser-integer-min-1-max-32 [input] #:http.request.field{:value input, :shape "__integerMin1Max32"})

(clojure.core/defn- ser-dash-iso-group-settings [input] (clojure.core/cond-> #:http.request.field{:value [], :shape "DashIsoGroupSettings", :type "structure"} (clojure.core/contains? input :segment-length) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-integer-min-1-max-2147483647 (input :segment-length)) #:http.request.field{:name "SegmentLength", :shape "__integerMin1Max2147483647", :location-name "segmentLength"})) (clojure.core/contains? input :min-buffer-time) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-integer-min-0-max-2147483647 (input :min-buffer-time)) #:http.request.field{:name "MinBufferTime", :shape "__integerMin0Max2147483647", :location-name "minBufferTime"})) (clojure.core/contains? input :write-segment-timeline-in-representation) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-dash-iso-write-segment-timeline-in-representation (input :write-segment-timeline-in-representation)) #:http.request.field{:name "WriteSegmentTimelineInRepresentation", :shape "DashIsoWriteSegmentTimelineInRepresentation", :location-name "writeSegmentTimelineInRepresentation"})) (clojure.core/contains? input :fragment-length) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-integer-min-1-max-2147483647 (input :fragment-length)) #:http.request.field{:name "FragmentLength", :shape "__integerMin1Max2147483647", :location-name "fragmentLength"})) (clojure.core/contains? input :hbbtv-compliance) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-dash-iso-hbbtv-compliance (input :hbbtv-compliance)) #:http.request.field{:name "HbbtvCompliance", :shape "DashIsoHbbtvCompliance", :location-name "hbbtvCompliance"})) (clojure.core/contains? input :segment-control) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-dash-iso-segment-control (input :segment-control)) #:http.request.field{:name "SegmentControl", :shape "DashIsoSegmentControl", :location-name "segmentControl"})) (clojure.core/contains? input :base-url) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-string (input :base-url)) #:http.request.field{:name "BaseUrl", :shape "__string", :location-name "baseUrl"})) (clojure.core/contains? input :destination) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-string-pattern-s-3 (input :destination)) #:http.request.field{:name "Destination", :shape "__stringPatternS3", :location-name "destination"})) (clojure.core/contains? input :encryption) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-dash-iso-encryption-settings (input :encryption)) #:http.request.field{:name "Encryption", :shape "DashIsoEncryptionSettings", :location-name "encryption"}))))

(clojure.core/defn- ser-ms-smooth-audio-deduplication [input] #:http.request.field{:value (clojure.core/get {"COMBINE_DUPLICATE_STREAMS" "COMBINE_DUPLICATE_STREAMS", :combine-duplicate-streams "COMBINE_DUPLICATE_STREAMS", "NONE" "NONE", :none "NONE"} input), :shape "MsSmoothAudioDeduplication"})

(clojure.core/defn- ser-aac-specification [input] #:http.request.field{:value (clojure.core/get {"MPEG2" "MPEG2", :mpeg-2 "MPEG2", "MPEG4" "MPEG4", :mpeg-4 "MPEG4"} input), :shape "AacSpecification"})

(clojure.core/defn- ser-eac-3-passthrough-control [input] #:http.request.field{:value (clojure.core/get {"WHEN_POSSIBLE" "WHEN_POSSIBLE", :when-possible "WHEN_POSSIBLE", "NO_PASSTHROUGH" "NO_PASSTHROUGH", :no-passthrough "NO_PASSTHROUGH"} input), :shape "Eac3PassthroughControl"})

(clojure.core/defn- ser-string-pattern-a-za-z-0902 [input] #:http.request.field{:value input, :shape "__stringPatternAZaZ0902"})

(clojure.core/defn- ser-integer-min-1-max-31 [input] #:http.request.field{:value input, :shape "__integerMin1Max31"})

(clojure.core/defn- ser-motion-image-playback [input] #:http.request.field{:value (clojure.core/get {"ONCE" "ONCE", :once "ONCE", "REPEAT" "REPEAT", :repeat "REPEAT"} input), :shape "MotionImagePlayback"})

(clojure.core/defn- ser-string-min-14-pattern-s-3-bmp-bmp-png-png [input] #:http.request.field{:value input, :shape "__stringMin14PatternS3BmpBMPPngPNG"})

(clojure.core/defn- ser-audio-normalization-settings [input] (clojure.core/cond-> #:http.request.field{:value [], :shape "AudioNormalizationSettings", :type "structure"} (clojure.core/contains? input :algorithm) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-audio-normalization-algorithm (input :algorithm)) #:http.request.field{:name "Algorithm", :shape "AudioNormalizationAlgorithm", :location-name "algorithm"})) (clojure.core/contains? input :algorithm-control) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-audio-normalization-algorithm-control (input :algorithm-control)) #:http.request.field{:name "AlgorithmControl", :shape "AudioNormalizationAlgorithmControl", :location-name "algorithmControl"})) (clojure.core/contains? input :correction-gate-level) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-integer-min-negative-70-max-0 (input :correction-gate-level)) #:http.request.field{:name "CorrectionGateLevel", :shape "__integerMinNegative70Max0", :location-name "correctionGateLevel"})) (clojure.core/contains? input :loudness-logging) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-audio-normalization-loudness-logging (input :loudness-logging)) #:http.request.field{:name "LoudnessLogging", :shape "AudioNormalizationLoudnessLogging", :location-name "loudnessLogging"})) (clojure.core/contains? input :peak-calculation) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-audio-normalization-peak-calculation (input :peak-calculation)) #:http.request.field{:name "PeakCalculation", :shape "AudioNormalizationPeakCalculation", :location-name "peakCalculation"})) (clojure.core/contains? input :target-lkfs) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-double-min-negative-59-max-0 (input :target-lkfs)) #:http.request.field{:name "TargetLkfs", :shape "__doubleMinNegative59Max0", :location-name "targetLkfs"}))))

(clojure.core/defn- ser-billing-tags-source [input] #:http.request.field{:value (clojure.core/get {"QUEUE" "QUEUE", :queue "QUEUE", "PRESET" "PRESET", :preset "PRESET", "JOB_TEMPLATE" "JOB_TEMPLATE", :job-template "JOB_TEMPLATE"} input), :shape "BillingTagsSource"})

(clojure.core/defn- ser-mpeg-2-settings [input] (clojure.core/cond-> #:http.request.field{:value [], :shape "Mpeg2Settings", :type "structure"} (clojure.core/contains? input :rate-control-mode) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-mpeg-2-rate-control-mode (input :rate-control-mode)) #:http.request.field{:name "RateControlMode", :shape "Mpeg2RateControlMode", :location-name "rateControlMode"})) (clojure.core/contains? input :interlace-mode) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-mpeg-2-interlace-mode (input :interlace-mode)) #:http.request.field{:name "InterlaceMode", :shape "Mpeg2InterlaceMode", :location-name "interlaceMode"})) (clojure.core/contains? input :min-i-interval) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-integer-min-0-max-30 (input :min-i-interval)) #:http.request.field{:name "MinIInterval", :shape "__integerMin0Max30", :location-name "minIInterval"})) (clojure.core/contains? input :par-denominator) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-integer-min-1-max-2147483647 (input :par-denominator)) #:http.request.field{:name "ParDenominator", :shape "__integerMin1Max2147483647", :location-name "parDenominator"})) (clojure.core/contains? input :quality-tuning-level) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-mpeg-2-quality-tuning-level (input :quality-tuning-level)) #:http.request.field{:name "QualityTuningLevel", :shape "Mpeg2QualityTuningLevel", :location-name "qualityTuningLevel"})) (clojure.core/contains? input :adaptive-quantization) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-mpeg-2-adaptive-quantization (input :adaptive-quantization)) #:http.request.field{:name "AdaptiveQuantization", :shape "Mpeg2AdaptiveQuantization", :location-name "adaptiveQuantization"})) (clojure.core/contains? input :framerate-denominator) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-integer-min-1-max-1001 (input :framerate-denominator)) #:http.request.field{:name "FramerateDenominator", :shape "__integerMin1Max1001", :location-name "framerateDenominator"})) (clojure.core/contains? input :framerate-control) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-mpeg-2-framerate-control (input :framerate-control)) #:http.request.field{:name "FramerateControl", :shape "Mpeg2FramerateControl", :location-name "framerateControl"})) (clojure.core/contains? input :hrd-buffer-size) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-integer-min-0-max-47185920 (input :hrd-buffer-size)) #:http.request.field{:name "HrdBufferSize", :shape "__integerMin0Max47185920", :location-name "hrdBufferSize"})) (clojure.core/contains? input :slow-pal) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-mpeg-2-slow-pal (input :slow-pal)) #:http.request.field{:name "SlowPal", :shape "Mpeg2SlowPal", :location-name "slowPal"})) (clojure.core/contains? input :dynamic-sub-gop) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-mpeg-2-dynamic-sub-gop (input :dynamic-sub-gop)) #:http.request.field{:name "DynamicSubGop", :shape "Mpeg2DynamicSubGop", :location-name "dynamicSubGop"})) (clojure.core/contains? input :number-b-frames-between-reference-frames) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-integer-min-0-max-7 (input :number-b-frames-between-reference-frames)) #:http.request.field{:name "NumberBFramesBetweenReferenceFrames", :shape "__integerMin0Max7", :location-name "numberBFramesBetweenReferenceFrames"})) (clojure.core/contains? input :intra-dc-precision) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-mpeg-2-intra-dc-precision (input :intra-dc-precision)) #:http.request.field{:name "IntraDcPrecision", :shape "Mpeg2IntraDcPrecision", :location-name "intraDcPrecision"})) (clojure.core/contains? input :syntax) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-mpeg-2-syntax (input :syntax)) #:http.request.field{:name "Syntax", :shape "Mpeg2Syntax", :location-name "syntax"})) (clojure.core/contains? input :gop-closed-cadence) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-integer-min-0-max-2147483647 (input :gop-closed-cadence)) #:http.request.field{:name "GopClosedCadence", :shape "__integerMin0Max2147483647", :location-name "gopClosedCadence"})) (clojure.core/contains? input :spatial-adaptive-quantization) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-mpeg-2-spatial-adaptive-quantization (input :spatial-adaptive-quantization)) #:http.request.field{:name "SpatialAdaptiveQuantization", :shape "Mpeg2SpatialAdaptiveQuantization", :location-name "spatialAdaptiveQuantization"})) (clojure.core/contains? input :framerate-numerator) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-integer-min-24-max-60000 (input :framerate-numerator)) #:http.request.field{:name "FramerateNumerator", :shape "__integerMin24Max60000", :location-name "framerateNumerator"})) (clojure.core/contains? input :softness) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-integer-min-0-max-128 (input :softness)) #:http.request.field{:name "Softness", :shape "__integerMin0Max128", :location-name "softness"})) (clojure.core/contains? input :gop-size-units) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-mpeg-2-gop-size-units (input :gop-size-units)) #:http.request.field{:name "GopSizeUnits", :shape "Mpeg2GopSizeUnits", :location-name "gopSizeUnits"})) (clojure.core/contains? input :max-bitrate) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-integer-min-1000-max-300000000 (input :max-bitrate)) #:http.request.field{:name "MaxBitrate", :shape "__integerMin1000Max300000000", :location-name "maxBitrate"})) (clojure.core/contains? input :codec-profile) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-mpeg-2-codec-profile (input :codec-profile)) #:http.request.field{:name "CodecProfile", :shape "Mpeg2CodecProfile", :location-name "codecProfile"})) (clojure.core/contains? input :par-numerator) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-integer-min-1-max-2147483647 (input :par-numerator)) #:http.request.field{:name "ParNumerator", :shape "__integerMin1Max2147483647", :location-name "parNumerator"})) (clojure.core/contains? input :gop-size) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-double-min-0 (input :gop-size)) #:http.request.field{:name "GopSize", :shape "__doubleMin0", :location-name "gopSize"})) (clojure.core/contains? input :par-control) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-mpeg-2-par-control (input :par-control)) #:http.request.field{:name "ParControl", :shape "Mpeg2ParControl", :location-name "parControl"})) (clojure.core/contains? input :codec-level) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-mpeg-2-codec-level (input :codec-level)) #:http.request.field{:name "CodecLevel", :shape "Mpeg2CodecLevel", :location-name "codecLevel"})) (clojure.core/contains? input :telecine) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-mpeg-2-telecine (input :telecine)) #:http.request.field{:name "Telecine", :shape "Mpeg2Telecine", :location-name "telecine"})) (clojure.core/contains? input :hrd-buffer-initial-fill-percentage) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-integer-min-0-max-100 (input :hrd-buffer-initial-fill-percentage)) #:http.request.field{:name "HrdBufferInitialFillPercentage", :shape "__integerMin0Max100", :location-name "hrdBufferInitialFillPercentage"})) (clojure.core/contains? input :temporal-adaptive-quantization) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-mpeg-2-temporal-adaptive-quantization (input :temporal-adaptive-quantization)) #:http.request.field{:name "TemporalAdaptiveQuantization", :shape "Mpeg2TemporalAdaptiveQuantization", :location-name "temporalAdaptiveQuantization"})) (clojure.core/contains? input :framerate-conversion-algorithm) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-mpeg-2-framerate-conversion-algorithm (input :framerate-conversion-algorithm)) #:http.request.field{:name "FramerateConversionAlgorithm", :shape "Mpeg2FramerateConversionAlgorithm", :location-name "framerateConversionAlgorithm"})) (clojure.core/contains? input :scene-change-detect) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-mpeg-2-scene-change-detect (input :scene-change-detect)) #:http.request.field{:name "SceneChangeDetect", :shape "Mpeg2SceneChangeDetect", :location-name "sceneChangeDetect"})) (clojure.core/contains? input :bitrate) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-integer-min-1000-max-288000000 (input :bitrate)) #:http.request.field{:name "Bitrate", :shape "__integerMin1000Max288000000", :location-name "bitrate"}))))

(clojure.core/defn- ser-h-264-settings [input] (clojure.core/cond-> #:http.request.field{:value [], :shape "H264Settings", :type "structure"} (clojure.core/contains? input :rate-control-mode) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-h-264-rate-control-mode (input :rate-control-mode)) #:http.request.field{:name "RateControlMode", :shape "H264RateControlMode", :location-name "rateControlMode"})) (clojure.core/contains? input :unregistered-sei-timecode) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-h-264-unregistered-sei-timecode (input :unregistered-sei-timecode)) #:http.request.field{:name "UnregisteredSeiTimecode", :shape "H264UnregisteredSeiTimecode", :location-name "unregisteredSeiTimecode"})) (clojure.core/contains? input :interlace-mode) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-h-264-interlace-mode (input :interlace-mode)) #:http.request.field{:name "InterlaceMode", :shape "H264InterlaceMode", :location-name "interlaceMode"})) (clojure.core/contains? input :min-i-interval) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-integer-min-0-max-30 (input :min-i-interval)) #:http.request.field{:name "MinIInterval", :shape "__integerMin0Max30", :location-name "minIInterval"})) (clojure.core/contains? input :par-denominator) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-integer-min-1-max-2147483647 (input :par-denominator)) #:http.request.field{:name "ParDenominator", :shape "__integerMin1Max2147483647", :location-name "parDenominator"})) (clojure.core/contains? input :gop-b-reference) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-h-264-gop-b-reference (input :gop-b-reference)) #:http.request.field{:name "GopBReference", :shape "H264GopBReference", :location-name "gopBReference"})) (clojure.core/contains? input :number-reference-frames) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-integer-min-1-max-6 (input :number-reference-frames)) #:http.request.field{:name "NumberReferenceFrames", :shape "__integerMin1Max6", :location-name "numberReferenceFrames"})) (clojure.core/contains? input :quality-tuning-level) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-h-264-quality-tuning-level (input :quality-tuning-level)) #:http.request.field{:name "QualityTuningLevel", :shape "H264QualityTuningLevel", :location-name "qualityTuningLevel"})) (clojure.core/contains? input :repeat-pps) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-h-264-repeat-pps (input :repeat-pps)) #:http.request.field{:name "RepeatPps", :shape "H264RepeatPps", :location-name "repeatPps"})) (clojure.core/contains? input :adaptive-quantization) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-h-264-adaptive-quantization (input :adaptive-quantization)) #:http.request.field{:name "AdaptiveQuantization", :shape "H264AdaptiveQuantization", :location-name "adaptiveQuantization"})) (clojure.core/contains? input :framerate-denominator) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-integer-min-1-max-2147483647 (input :framerate-denominator)) #:http.request.field{:name "FramerateDenominator", :shape "__integerMin1Max2147483647", :location-name "framerateDenominator"})) (clojure.core/contains? input :framerate-control) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-h-264-framerate-control (input :framerate-control)) #:http.request.field{:name "FramerateControl", :shape "H264FramerateControl", :location-name "framerateControl"})) (clojure.core/contains? input :hrd-buffer-size) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-integer-min-0-max-1152000000 (input :hrd-buffer-size)) #:http.request.field{:name "HrdBufferSize", :shape "__integerMin0Max1152000000", :location-name "hrdBufferSize"})) (clojure.core/contains? input :slow-pal) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-h-264-slow-pal (input :slow-pal)) #:http.request.field{:name "SlowPal", :shape "H264SlowPal", :location-name "slowPal"})) (clojure.core/contains? input :dynamic-sub-gop) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-h-264-dynamic-sub-gop (input :dynamic-sub-gop)) #:http.request.field{:name "DynamicSubGop", :shape "H264DynamicSubGop", :location-name "dynamicSubGop"})) (clojure.core/contains? input :number-b-frames-between-reference-frames) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-integer-min-0-max-7 (input :number-b-frames-between-reference-frames)) #:http.request.field{:name "NumberBFramesBetweenReferenceFrames", :shape "__integerMin0Max7", :location-name "numberBFramesBetweenReferenceFrames"})) (clojure.core/contains? input :qvbr-settings) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-h-264-qvbr-settings (input :qvbr-settings)) #:http.request.field{:name "QvbrSettings", :shape "H264QvbrSettings", :location-name "qvbrSettings"})) (clojure.core/contains? input :field-encoding) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-h-264-field-encoding (input :field-encoding)) #:http.request.field{:name "FieldEncoding", :shape "H264FieldEncoding", :location-name "fieldEncoding"})) (clojure.core/contains? input :syntax) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-h-264-syntax (input :syntax)) #:http.request.field{:name "Syntax", :shape "H264Syntax", :location-name "syntax"})) (clojure.core/contains? input :gop-closed-cadence) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-integer-min-0-max-2147483647 (input :gop-closed-cadence)) #:http.request.field{:name "GopClosedCadence", :shape "__integerMin0Max2147483647", :location-name "gopClosedCadence"})) (clojure.core/contains? input :spatial-adaptive-quantization) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-h-264-spatial-adaptive-quantization (input :spatial-adaptive-quantization)) #:http.request.field{:name "SpatialAdaptiveQuantization", :shape "H264SpatialAdaptiveQuantization", :location-name "spatialAdaptiveQuantization"})) (clojure.core/contains? input :framerate-numerator) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-integer-min-1-max-2147483647 (input :framerate-numerator)) #:http.request.field{:name "FramerateNumerator", :shape "__integerMin1Max2147483647", :location-name "framerateNumerator"})) (clojure.core/contains? input :softness) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-integer-min-0-max-128 (input :softness)) #:http.request.field{:name "Softness", :shape "__integerMin0Max128", :location-name "softness"})) (clojure.core/contains? input :gop-size-units) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-h-264-gop-size-units (input :gop-size-units)) #:http.request.field{:name "GopSizeUnits", :shape "H264GopSizeUnits", :location-name "gopSizeUnits"})) (clojure.core/contains? input :max-bitrate) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-integer-min-1000-max-1152000000 (input :max-bitrate)) #:http.request.field{:name "MaxBitrate", :shape "__integerMin1000Max1152000000", :location-name "maxBitrate"})) (clojure.core/contains? input :codec-profile) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-h-264-codec-profile (input :codec-profile)) #:http.request.field{:name "CodecProfile", :shape "H264CodecProfile", :location-name "codecProfile"})) (clojure.core/contains? input :flicker-adaptive-quantization) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-h-264-flicker-adaptive-quantization (input :flicker-adaptive-quantization)) #:http.request.field{:name "FlickerAdaptiveQuantization", :shape "H264FlickerAdaptiveQuantization", :location-name "flickerAdaptiveQuantization"})) (clojure.core/contains? input :par-numerator) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-integer-min-1-max-2147483647 (input :par-numerator)) #:http.request.field{:name "ParNumerator", :shape "__integerMin1Max2147483647", :location-name "parNumerator"})) (clojure.core/contains? input :gop-size) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-double-min-0 (input :gop-size)) #:http.request.field{:name "GopSize", :shape "__doubleMin0", :location-name "gopSize"})) (clojure.core/contains? input :par-control) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-h-264-par-control (input :par-control)) #:http.request.field{:name "ParControl", :shape "H264ParControl", :location-name "parControl"})) (clojure.core/contains? input :codec-level) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-h-264-codec-level (input :codec-level)) #:http.request.field{:name "CodecLevel", :shape "H264CodecLevel", :location-name "codecLevel"})) (clojure.core/contains? input :telecine) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-h-264-telecine (input :telecine)) #:http.request.field{:name "Telecine", :shape "H264Telecine", :location-name "telecine"})) (clojure.core/contains? input :hrd-buffer-initial-fill-percentage) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-integer-min-0-max-100 (input :hrd-buffer-initial-fill-percentage)) #:http.request.field{:name "HrdBufferInitialFillPercentage", :shape "__integerMin0Max100", :location-name "hrdBufferInitialFillPercentage"})) (clojure.core/contains? input :slices) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-integer-min-1-max-32 (input :slices)) #:http.request.field{:name "Slices", :shape "__integerMin1Max32", :location-name "slices"})) (clojure.core/contains? input :temporal-adaptive-quantization) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-h-264-temporal-adaptive-quantization (input :temporal-adaptive-quantization)) #:http.request.field{:name "TemporalAdaptiveQuantization", :shape "H264TemporalAdaptiveQuantization", :location-name "temporalAdaptiveQuantization"})) (clojure.core/contains? input :framerate-conversion-algorithm) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-h-264-framerate-conversion-algorithm (input :framerate-conversion-algorithm)) #:http.request.field{:name "FramerateConversionAlgorithm", :shape "H264FramerateConversionAlgorithm", :location-name "framerateConversionAlgorithm"})) (clojure.core/contains? input :entropy-encoding) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-h-264-entropy-encoding (input :entropy-encoding)) #:http.request.field{:name "EntropyEncoding", :shape "H264EntropyEncoding", :location-name "entropyEncoding"})) (clojure.core/contains? input :scene-change-detect) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-h-264-scene-change-detect (input :scene-change-detect)) #:http.request.field{:name "SceneChangeDetect", :shape "H264SceneChangeDetect", :location-name "sceneChangeDetect"})) (clojure.core/contains? input :bitrate) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-integer-min-1000-max-1152000000 (input :bitrate)) #:http.request.field{:name "Bitrate", :shape "__integerMin1000Max1152000000", :location-name "bitrate"}))))

(clojure.core/defn- ser-integer-min-8000-max-96000 [input] #:http.request.field{:value input, :shape "__integerMin8000Max96000"})

(clojure.core/defn- ser-hls-timed-metadata-id-3-frame [input] #:http.request.field{:value (clojure.core/get {"NONE" "NONE", :none "NONE", "PRIV" "PRIV", :priv "PRIV", "TDRL" "TDRL", :tdrl "TDRL"} input), :shape "HlsTimedMetadataId3Frame"})

(clojure.core/defn- ser-output-channel-mapping [input] (clojure.core/cond-> #:http.request.field{:value [], :shape "OutputChannelMapping", :type "structure"} (clojure.core/contains? input :input-channels) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-list-of-integer-min-negative-60-max-6 (input :input-channels)) #:http.request.field{:name "InputChannels", :shape "__listOf__integerMinNegative60Max6", :location-name "inputChannels"}))))

(clojure.core/defn- ser-eac-3-phase-control [input] #:http.request.field{:value (clojure.core/get {"SHIFT_90_DEGREES" "SHIFT_90_DEGREES", :shift-90-degrees "SHIFT_90_DEGREES", "NO_SHIFT" "NO_SHIFT", :no-shift "NO_SHIFT"} input), :shape "Eac3PhaseControl"})

(clojure.core/defn- ser-eac-3-surround-ex-mode [input] #:http.request.field{:value (clojure.core/get {"NOT_INDICATED" "NOT_INDICATED", :not-indicated "NOT_INDICATED", "ENABLED" "ENABLED", :enabled "ENABLED", "DISABLED" "DISABLED", :disabled "DISABLED"} input), :shape "Eac3SurroundExMode"})

(clojure.core/defn- ser-dash-iso-encryption-settings [input] (clojure.core/cond-> #:http.request.field{:value [], :shape "DashIsoEncryptionSettings", :type "structure"} (clojure.core/contains? input :speke-key-provider) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-speke-key-provider (input :speke-key-provider)) #:http.request.field{:name "SpekeKeyProvider", :shape "SpekeKeyProvider", :location-name "spekeKeyProvider"}))))

(clojure.core/defn- ser-integer-min-1-max-8 [input] #:http.request.field{:value input, :shape "__integerMin1Max8"})

(clojure.core/defn- ser-list-of-audio-description [input] #:http.request.field{:value (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (clojure.core/merge (ser-audio-description coll) #:http.request.field{:shape "AudioDescription"}))) input), :shape "__listOfAudioDescription", :type "list"})

(clojure.core/defn- ser-file-group-settings [input] (clojure.core/cond-> #:http.request.field{:value [], :shape "FileGroupSettings", :type "structure"} (clojure.core/contains? input :destination) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-string-pattern-s-3 (input :destination)) #:http.request.field{:name "Destination", :shape "__stringPatternS3", :location-name "destination"}))))

(clojure.core/defn- ser-integer-min-0-max-3 [input] #:http.request.field{:value input, :shape "__integerMin0Max3"})

(clojure.core/defn- ser-m-3u-8-settings [input] (clojure.core/cond-> #:http.request.field{:value [], :shape "M3u8Settings", :type "structure"} (clojure.core/contains? input :pat-interval) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-integer-min-0-max-1000 (input :pat-interval)) #:http.request.field{:name "PatInterval", :shape "__integerMin0Max1000", :location-name "patInterval"})) (clojure.core/contains? input :scte-35-source) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-m-3u-8-scte-35-source (input :scte-35-source)) #:http.request.field{:name "Scte35Source", :shape "M3u8Scte35Source", :location-name "scte35Source"})) (clojure.core/contains? input :audio-frames-per-pes) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-integer-min-0-max-2147483647 (input :audio-frames-per-pes)) #:http.request.field{:name "AudioFramesPerPes", :shape "__integerMin0Max2147483647", :location-name "audioFramesPerPes"})) (clojure.core/contains? input :transport-stream-id) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-integer-min-0-max-65535 (input :transport-stream-id)) #:http.request.field{:name "TransportStreamId", :shape "__integerMin0Max65535", :location-name "transportStreamId"})) (clojure.core/contains? input :pcr-control) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-m-3u-8-pcr-control (input :pcr-control)) #:http.request.field{:name "PcrControl", :shape "M3u8PcrControl", :location-name "pcrControl"})) (clojure.core/contains? input :scte-35-pid) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-integer-min-32-max-8182 (input :scte-35-pid)) #:http.request.field{:name "Scte35Pid", :shape "__integerMin32Max8182", :location-name "scte35Pid"})) (clojure.core/contains? input :program-number) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-integer-min-0-max-65535 (input :program-number)) #:http.request.field{:name "ProgramNumber", :shape "__integerMin0Max65535", :location-name "programNumber"})) (clojure.core/contains? input :pcr-pid) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-integer-min-32-max-8182 (input :pcr-pid)) #:http.request.field{:name "PcrPid", :shape "__integerMin32Max8182", :location-name "pcrPid"})) (clojure.core/contains? input :pmt-pid) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-integer-min-32-max-8182 (input :pmt-pid)) #:http.request.field{:name "PmtPid", :shape "__integerMin32Max8182", :location-name "pmtPid"})) (clojure.core/contains? input :video-pid) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-integer-min-32-max-8182 (input :video-pid)) #:http.request.field{:name "VideoPid", :shape "__integerMin32Max8182", :location-name "videoPid"})) (clojure.core/contains? input :audio-pids) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-list-of-integer-min-32-max-8182 (input :audio-pids)) #:http.request.field{:name "AudioPids", :shape "__listOf__integerMin32Max8182", :location-name "audioPids"})) (clojure.core/contains? input :timed-metadata) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-timed-metadata (input :timed-metadata)) #:http.request.field{:name "TimedMetadata", :shape "TimedMetadata", :location-name "timedMetadata"})) (clojure.core/contains? input :nielsen-id-3) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-m-3u-8-nielsen-id-3 (input :nielsen-id-3)) #:http.request.field{:name "NielsenId3", :shape "M3u8NielsenId3", :location-name "nielsenId3"})) (clojure.core/contains? input :pmt-interval) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-integer-min-0-max-1000 (input :pmt-interval)) #:http.request.field{:name "PmtInterval", :shape "__integerMin0Max1000", :location-name "pmtInterval"})) (clojure.core/contains? input :timed-metadata-pid) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-integer-min-32-max-8182 (input :timed-metadata-pid)) #:http.request.field{:name "TimedMetadataPid", :shape "__integerMin32Max8182", :location-name "timedMetadataPid"})) (clojure.core/contains? input :private-metadata-pid) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-integer-min-32-max-8182 (input :private-metadata-pid)) #:http.request.field{:name "PrivateMetadataPid", :shape "__integerMin32Max8182", :location-name "privateMetadataPid"}))))

(clojure.core/defn- ser-eac-3-stereo-downmix [input] #:http.request.field{:value (clojure.core/get {"NOT_INDICATED" "NOT_INDICATED", :not-indicated "NOT_INDICATED", "LO_RO" "LO_RO", :lo-ro "LO_RO", "LT_RT" "LT_RT", :lt-rt "LT_RT", "DPL2" "DPL2", :dpl-2 "DPL2"} input), :shape "Eac3StereoDownmix"})

(clojure.core/defn- ser-mov-mpeg-2-four-cc-control [input] #:http.request.field{:value (clojure.core/get {"XDCAM" "XDCAM", :xdcam "XDCAM", "MPEG" "MPEG", :mpeg "MPEG"} input), :shape "MovMpeg2FourCCControl"})

(clojure.core/defn- ser-wav-settings [input] (clojure.core/cond-> #:http.request.field{:value [], :shape "WavSettings", :type "structure"} (clojure.core/contains? input :bit-depth) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-integer-min-16-max-24 (input :bit-depth)) #:http.request.field{:name "BitDepth", :shape "__integerMin16Max24", :location-name "bitDepth"})) (clojure.core/contains? input :channels) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-integer-min-1-max-8 (input :channels)) #:http.request.field{:name "Channels", :shape "__integerMin1Max8", :location-name "channels"})) (clojure.core/contains? input :format) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-wav-format (input :format)) #:http.request.field{:name "Format", :shape "WavFormat", :location-name "format"})) (clojure.core/contains? input :sample-rate) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-integer-min-8000-max-192000 (input :sample-rate)) #:http.request.field{:name "SampleRate", :shape "__integerMin8000Max192000", :location-name "sampleRate"}))))

(clojure.core/defn- ser-integer-min-1-max-10000000 [input] #:http.request.field{:value input, :shape "__integerMin1Max10000000"})

(clojure.core/defn- ser-integer-min-0-max-128 [input] #:http.request.field{:value input, :shape "__integerMin0Max128"})

(clojure.core/defn- ser-f-4v-settings [input] (clojure.core/cond-> #:http.request.field{:value [], :shape "F4vSettings", :type "structure"} (clojure.core/contains? input :moov-placement) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-f-4v-moov-placement (input :moov-placement)) #:http.request.field{:name "MoovPlacement", :shape "F4vMoovPlacement", :location-name "moovPlacement"}))))

(clojure.core/defn- ser-h-264-syntax [input] #:http.request.field{:value (clojure.core/get {"DEFAULT" "DEFAULT", :default "DEFAULT", "RP2027" "RP2027", :rp-2027 "RP2027"} input), :shape "H264Syntax"})

(clojure.core/defn- ser-noise-reducer-filter-settings [input] (clojure.core/cond-> #:http.request.field{:value [], :shape "NoiseReducerFilterSettings", :type "structure"} (clojure.core/contains? input :strength) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-integer-min-0-max-3 (input :strength)) #:http.request.field{:name "Strength", :shape "__integerMin0Max3", :location-name "strength"}))))

(clojure.core/defn- ser-list-of-input-clipping [input] #:http.request.field{:value (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (clojure.core/merge (ser-input-clipping coll) #:http.request.field{:shape "InputClipping"}))) input), :shape "__listOfInputClipping", :type "list"})

(clojure.core/defn- ser-prores-settings [input] (clojure.core/cond-> #:http.request.field{:value [], :shape "ProresSettings", :type "structure"} (clojure.core/contains? input :interlace-mode) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-prores-interlace-mode (input :interlace-mode)) #:http.request.field{:name "InterlaceMode", :shape "ProresInterlaceMode", :location-name "interlaceMode"})) (clojure.core/contains? input :par-denominator) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-integer-min-1-max-2147483647 (input :par-denominator)) #:http.request.field{:name "ParDenominator", :shape "__integerMin1Max2147483647", :location-name "parDenominator"})) (clojure.core/contains? input :framerate-denominator) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-integer-min-1-max-2147483647 (input :framerate-denominator)) #:http.request.field{:name "FramerateDenominator", :shape "__integerMin1Max2147483647", :location-name "framerateDenominator"})) (clojure.core/contains? input :framerate-control) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-prores-framerate-control (input :framerate-control)) #:http.request.field{:name "FramerateControl", :shape "ProresFramerateControl", :location-name "framerateControl"})) (clojure.core/contains? input :slow-pal) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-prores-slow-pal (input :slow-pal)) #:http.request.field{:name "SlowPal", :shape "ProresSlowPal", :location-name "slowPal"})) (clojure.core/contains? input :framerate-numerator) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-integer-min-1-max-2147483647 (input :framerate-numerator)) #:http.request.field{:name "FramerateNumerator", :shape "__integerMin1Max2147483647", :location-name "framerateNumerator"})) (clojure.core/contains? input :codec-profile) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-prores-codec-profile (input :codec-profile)) #:http.request.field{:name "CodecProfile", :shape "ProresCodecProfile", :location-name "codecProfile"})) (clojure.core/contains? input :par-numerator) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-integer-min-1-max-2147483647 (input :par-numerator)) #:http.request.field{:name "ParNumerator", :shape "__integerMin1Max2147483647", :location-name "parNumerator"})) (clojure.core/contains? input :par-control) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-prores-par-control (input :par-control)) #:http.request.field{:name "ParControl", :shape "ProresParControl", :location-name "parControl"})) (clojure.core/contains? input :telecine) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-prores-telecine (input :telecine)) #:http.request.field{:name "Telecine", :shape "ProresTelecine", :location-name "telecine"})) (clojure.core/contains? input :framerate-conversion-algorithm) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-prores-framerate-conversion-algorithm (input :framerate-conversion-algorithm)) #:http.request.field{:name "FramerateConversionAlgorithm", :shape "ProresFramerateConversionAlgorithm", :location-name "framerateConversionAlgorithm"}))))

(clojure.core/defn- ser-map-of-string [input] #:http.request.field{:value (clojure.core/into [] (clojure.core/map (clojure.core/fn [[k v]] [(clojure.core/into (ser-string k) #:http.request.field{:map-info "key", :shape "__string"}) (clojure.core/into (ser-string v) #:http.request.field{:map-info "value", :shape "__string"})])) input), :shape "__mapOf__string", :type "map"})

(clojure.core/defn- ser-queue-status [input] #:http.request.field{:value (clojure.core/get {"ACTIVE" "ACTIVE", :active "ACTIVE", "PAUSED" "PAUSED", :paused "PAUSED"} input), :shape "QueueStatus"})

(clojure.core/defn- ser-list-of-string-pattern-s-3-assetmap-xml [input] #:http.request.field{:value (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (clojure.core/merge (ser-string-pattern-s-3-assetmap-xml coll) #:http.request.field{:shape "__stringPatternS3ASSETMAPXml"}))) input), :shape "__listOf__stringPatternS3ASSETMAPXml", :type "list"})

(clojure.core/defn- ser-list-of-input-template [input] #:http.request.field{:value (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (clojure.core/merge (ser-input-template coll) #:http.request.field{:shape "InputTemplate"}))) input), :shape "__listOfInputTemplate", :type "list"})

(clojure.core/defn- ser-string-pattern-09a-faf-809a-faf-409a-faf-409a-faf-409a-faf-12 [input] #:http.request.field{:value input, :shape "__stringPattern09aFAF809aFAF409aFAF409aFAF409aFAF12"})

(clojure.core/defn- ser-h-265-interlace-mode [input] #:http.request.field{:value (clojure.core/get {:follow-top-field "FOLLOW_TOP_FIELD", :follow-bottom-field "FOLLOW_BOTTOM_FIELD", "BOTTOM_FIELD" "BOTTOM_FIELD", "FOLLOW_TOP_FIELD" "FOLLOW_TOP_FIELD", "PROGRESSIVE" "PROGRESSIVE", "FOLLOW_BOTTOM_FIELD" "FOLLOW_BOTTOM_FIELD", :bottom-field "BOTTOM_FIELD", :progressive "PROGRESSIVE", :top-field "TOP_FIELD", "TOP_FIELD" "TOP_FIELD"} input), :shape "H265InterlaceMode"})

(clojure.core/defn- ser-hls-codec-specification [input] #:http.request.field{:value (clojure.core/get {"RFC_6381" "RFC_6381", :rfc-6381 "RFC_6381", "RFC_4281" "RFC_4281", :rfc-4281 "RFC_4281"} input), :shape "HlsCodecSpecification"})

(clojure.core/defn- ser-color-space-conversion [input] #:http.request.field{:value (clojure.core/get {:force-709 "FORCE_709", :force-hlg-2020 "FORCE_HLG_2020", "FORCE_709" "FORCE_709", "FORCE_601" "FORCE_601", "NONE" "NONE", :force-601 "FORCE_601", "FORCE_HDR10" "FORCE_HDR10", "FORCE_HLG_2020" "FORCE_HLG_2020", :force-hdr-10 "FORCE_HDR10", :none "NONE"} input), :shape "ColorSpaceConversion"})

(clojure.core/defn- ser-h-264-codec-level [input] #:http.request.field{:value (clojure.core/get {:level-2-1 "LEVEL_2_1", :level-5-1 "LEVEL_5_1", :level-3 "LEVEL_3", "LEVEL_2_1" "LEVEL_2_1", "LEVEL_1_3" "LEVEL_1_3", "LEVEL_5" "LEVEL_5", "LEVEL_1" "LEVEL_1", "LEVEL_3_2" "LEVEL_3_2", :level-4 "LEVEL_4", "AUTO" "AUTO", :level-1-3 "LEVEL_1_3", "LEVEL_4_1" "LEVEL_4_1", :level-2-2 "LEVEL_2_2", "LEVEL_5_1" "LEVEL_5_1", "LEVEL_5_2" "LEVEL_5_2", "LEVEL_4" "LEVEL_4", :level-1 "LEVEL_1", :level-4-1 "LEVEL_4_1", "LEVEL_2" "LEVEL_2", :level-1-1 "LEVEL_1_1", "LEVEL_3" "LEVEL_3", :level-3-1 "LEVEL_3_1", :level-1-2 "LEVEL_1_2", "LEVEL_1_1" "LEVEL_1_1", :level-3-2 "LEVEL_3_2", :level-4-2 "LEVEL_4_2", "LEVEL_4_2" "LEVEL_4_2", "LEVEL_3_1" "LEVEL_3_1", :auto "AUTO", :level-5 "LEVEL_5", :level-5-2 "LEVEL_5_2", "LEVEL_2_2" "LEVEL_2_2", "LEVEL_1_2" "LEVEL_1_2", :level-2 "LEVEL_2"} input), :shape "H264CodecLevel"})

(clojure.core/defn- ser-avail-blanking [input] (clojure.core/cond-> #:http.request.field{:value [], :shape "AvailBlanking", :type "structure"} (clojure.core/contains? input :avail-blanking-image) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-string-min-14-pattern-s-3-bmp-bmp-png-png (input :avail-blanking-image)) #:http.request.field{:name "AvailBlankingImage", :shape "__stringMin14PatternS3BmpBMPPngPNG", :location-name "availBlankingImage"}))))

(clojure.core/defn- ser-string-pattern [input] #:http.request.field{:value input, :shape "__stringPattern"})

(clojure.core/defn- ser-audio-selector [input] (clojure.core/cond-> #:http.request.field{:value [], :shape "AudioSelector", :type "structure"} (clojure.core/contains? input :pids) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-list-of-integer-min-1-max-2147483647 (input :pids)) #:http.request.field{:name "Pids", :shape "__listOf__integerMin1Max2147483647", :location-name "pids"})) (clojure.core/contains? input :custom-language-code) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-string-min-3-max-3-pattern-a-za-z-3 (input :custom-language-code)) #:http.request.field{:name "CustomLanguageCode", :shape "__stringMin3Max3PatternAZaZ3", :location-name "customLanguageCode"})) (clojure.core/contains? input :remix-settings) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-remix-settings (input :remix-settings)) #:http.request.field{:name "RemixSettings", :shape "RemixSettings", :location-name "remixSettings"})) (clojure.core/contains? input :offset) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-integer-min-negative-2147483648-max-2147483647 (input :offset)) #:http.request.field{:name "Offset", :shape "__integerMinNegative2147483648Max2147483647", :location-name "offset"})) (clojure.core/contains? input :default-selection) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-audio-default-selection (input :default-selection)) #:http.request.field{:name "DefaultSelection", :shape "AudioDefaultSelection", :location-name "defaultSelection"})) (clojure.core/contains? input :tracks) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-list-of-integer-min-1-max-2147483647 (input :tracks)) #:http.request.field{:name "Tracks", :shape "__listOf__integerMin1Max2147483647", :location-name "tracks"})) (clojure.core/contains? input :language-code) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-language-code (input :language-code)) #:http.request.field{:name "LanguageCode", :shape "LanguageCode", :location-name "languageCode"})) (clojure.core/contains? input :external-audio-file-input) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-string-pattern-s-3-mm-2-vvmmppeeggaavviimmpp-4-ffllvvmmppttmmppggmm-4-vvttrrppff-4-vvmm-2-ttssttss-264-hh-264-mmkkvvmmoovvmmttssmm-2-ttwwmmvvaassffvvoobb-3-ggpp-3-ggppppmmxxffddiivvxxxxvviiddrraawwddvvggxxffmm-1-vv-3-gg-2-vvmmffmm-3-uu-8-llcchhggxxffmmppeegg-2-mmxxffmmppeegg-2-mmxxffhhddwwaavvyy-4-mmaaaaccaaiiffffmmpp-2-aacc-3-eecc-3-ddttssee (input :external-audio-file-input)) #:http.request.field{:name "ExternalAudioFileInput", :shape "__stringPatternS3MM2VVMMPPEEGGAAVVIIMMPP4FFLLVVMMPPTTMMPPGGMM4VVTTRRPPFF4VVMM2TTSSTTSS264HH264MMKKVVMMOOVVMMTTSSMM2TTWWMMVVAASSFFVVOOBB3GGPP3GGPPPPMMXXFFDDIIVVXXXXVVIIDDRRAAWWDDVVGGXXFFMM1VV3GG2VVMMFFMM3UU8LLCCHHGGXXFFMMPPEEGG2MMXXFFMMPPEEGG2MMXXFFHHDDWWAAVVYY4MMAAAACCAAIIFFFFMMPP2AACC3EECC3DDTTSSEE", :location-name "externalAudioFileInput"})) (clojure.core/contains? input :program-selection) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-integer-min-0-max-8 (input :program-selection)) #:http.request.field{:name "ProgramSelection", :shape "__integerMin0Max8", :location-name "programSelection"})) (clojure.core/contains? input :selector-type) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-audio-selector-type (input :selector-type)) #:http.request.field{:name "SelectorType", :shape "AudioSelectorType", :location-name "selectorType"}))))

(clojure.core/defn- ser-map-of-caption-selector [input] #:http.request.field{:value (clojure.core/into [] (clojure.core/map (clojure.core/fn [[k v]] [(clojure.core/into (ser-string k) #:http.request.field{:map-info "key", :shape "__string"}) (clojure.core/into (ser-caption-selector v) #:http.request.field{:map-info "value", :shape "CaptionSelector"})])) input), :shape "__mapOfCaptionSelector", :type "map"})

(clojure.core/defn- ser-integer-min-1-max-16 [input] #:http.request.field{:value input, :shape "__integerMin1Max16"})

(clojure.core/defn- ser-integer-min-0-max-1466400000 [input] #:http.request.field{:value input, :shape "__integerMin0Max1466400000"})

(clojure.core/defn- ser-audio-default-selection [input] #:http.request.field{:value (clojure.core/get {"DEFAULT" "DEFAULT", :default "DEFAULT", "NOT_DEFAULT" "NOT_DEFAULT", :not-default "NOT_DEFAULT"} input), :shape "AudioDefaultSelection"})

(clojure.core/defn- req-update-preset-request [input] (clojure.core/cond-> #:http.request.configuration{:uri [(clojure.core/into (ser-string (input :name)) #:http.request.field{:name "Name", :shape "__string", :location-name "name", :location "uri"})]} (clojure.core/contains? input :category) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-string (input :category)) #:http.request.field{:name "Category", :shape "__string", :location-name "category"})) (clojure.core/contains? input :description) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-string (input :description)) #:http.request.field{:name "Description", :shape "__string", :location-name "description"})) (clojure.core/contains? input :settings) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-preset-settings (input :settings)) #:http.request.field{:name "Settings", :shape "PresetSettings", :location-name "settings"}))))

(clojure.core/defn- req-create-preset-request [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (ser-preset-settings (input :settings)) #:http.request.field{:name "Settings", :shape "PresetSettings", :location-name "settings"}) (clojure.core/into (ser-string (input :name)) #:http.request.field{:name "Name", :shape "__string", :location-name "name"})]} (clojure.core/contains? input :category) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-string (input :category)) #:http.request.field{:name "Category", :shape "__string", :location-name "category"})) (clojure.core/contains? input :description) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-string (input :description)) #:http.request.field{:name "Description", :shape "__string", :location-name "description"})) (clojure.core/contains? input :tags) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-map-of-string (input :tags)) #:http.request.field{:name "Tags", :shape "__mapOf__string", :location-name "tags"}))))

(clojure.core/defn- req-list-queues-request [input] (clojure.core/cond-> {} (clojure.core/contains? input :list-by) (clojure.core/update-in [:http.request.configuration/querystring] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-queue-list-by (input :list-by)) #:http.request.field{:name "ListBy", :shape "QueueListBy", :location-name "listBy", :location "querystring"})) (clojure.core/contains? input :max-results) (clojure.core/update-in [:http.request.configuration/querystring] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-integer-min-1-max-20 (input :max-results)) #:http.request.field{:name "MaxResults", :shape "__integerMin1Max20", :location-name "maxResults", :location "querystring"})) (clojure.core/contains? input :next-token) (clojure.core/update-in [:http.request.configuration/querystring] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-string (input :next-token)) #:http.request.field{:name "NextToken", :shape "__string", :location-name "nextToken", :location "querystring"})) (clojure.core/contains? input :order) (clojure.core/update-in [:http.request.configuration/querystring] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-order (input :order)) #:http.request.field{:name "Order", :shape "Order", :location-name "order", :location "querystring"}))))

(clojure.core/defn- req-delete-job-template-request [input] (clojure.core/cond-> #:http.request.configuration{:uri [(clojure.core/into (ser-string (input :name)) #:http.request.field{:name "Name", :shape "__string", :location-name "name", :location "uri"})]}))

(clojure.core/defn- req-list-jobs-request [input] (clojure.core/cond-> {} (clojure.core/contains? input :max-results) (clojure.core/update-in [:http.request.configuration/querystring] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-integer-min-1-max-20 (input :max-results)) #:http.request.field{:name "MaxResults", :shape "__integerMin1Max20", :location-name "maxResults", :location "querystring"})) (clojure.core/contains? input :next-token) (clojure.core/update-in [:http.request.configuration/querystring] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-string (input :next-token)) #:http.request.field{:name "NextToken", :shape "__string", :location-name "nextToken", :location "querystring"})) (clojure.core/contains? input :order) (clojure.core/update-in [:http.request.configuration/querystring] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-order (input :order)) #:http.request.field{:name "Order", :shape "Order", :location-name "order", :location "querystring"})) (clojure.core/contains? input :queue) (clojure.core/update-in [:http.request.configuration/querystring] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-string (input :queue)) #:http.request.field{:name "Queue", :shape "__string", :location-name "queue", :location "querystring"})) (clojure.core/contains? input :status) (clojure.core/update-in [:http.request.configuration/querystring] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-job-status (input :status)) #:http.request.field{:name "Status", :shape "JobStatus", :location-name "status", :location "querystring"}))))

(clojure.core/defn- req-list-tags-for-resource-request [input] (clojure.core/cond-> #:http.request.configuration{:uri [(clojure.core/into (ser-string (input :arn)) #:http.request.field{:name "Arn", :shape "__string", :location-name "arn", :location "uri"})]}))

(clojure.core/defn- req-disassociate-certificate-request [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (ser-string (input :arn)) #:http.request.field{:name "Arn", :shape "__string", :location-name "arn"})]}))

(clojure.core/defn- req-associate-certificate-request [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (ser-string (input :arn)) #:http.request.field{:name "Arn", :shape "__string", :location-name "arn"})]}))

(clojure.core/defn- req-get-preset-request [input] (clojure.core/cond-> #:http.request.configuration{:uri [(clojure.core/into (ser-string (input :name)) #:http.request.field{:name "Name", :shape "__string", :location-name "name", :location "uri"})]}))

(clojure.core/defn- req-cancel-job-request [input] (clojure.core/cond-> #:http.request.configuration{:uri [(clojure.core/into (ser-string (input :id)) #:http.request.field{:name "Id", :shape "__string", :location-name "id", :location "uri"})]}))

(clojure.core/defn- req-get-job-template-request [input] (clojure.core/cond-> #:http.request.configuration{:uri [(clojure.core/into (ser-string (input :name)) #:http.request.field{:name "Name", :shape "__string", :location-name "name", :location "uri"})]}))

(clojure.core/defn- req-create-job-template-request [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (ser-job-template-settings (input :settings)) #:http.request.field{:name "Settings", :shape "JobTemplateSettings", :location-name "settings"}) (clojure.core/into (ser-string (input :name)) #:http.request.field{:name "Name", :shape "__string", :location-name "name"})]} (clojure.core/contains? input :acceleration-settings) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-acceleration-settings (input :acceleration-settings)) #:http.request.field{:name "AccelerationSettings", :shape "AccelerationSettings", :location-name "accelerationSettings"})) (clojure.core/contains? input :category) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-string (input :category)) #:http.request.field{:name "Category", :shape "__string", :location-name "category"})) (clojure.core/contains? input :description) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-string (input :description)) #:http.request.field{:name "Description", :shape "__string", :location-name "description"})) (clojure.core/contains? input :queue) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-string (input :queue)) #:http.request.field{:name "Queue", :shape "__string", :location-name "queue"})) (clojure.core/contains? input :status-update-interval-in-secs) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-integer-min-10-max-600 (input :status-update-interval-in-secs)) #:http.request.field{:name "StatusUpdateIntervalInSecs", :shape "__integerMin10Max600", :location-name "statusUpdateIntervalInSecs"})) (clojure.core/contains? input :tags) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-map-of-string (input :tags)) #:http.request.field{:name "Tags", :shape "__mapOf__string", :location-name "tags"}))))

(clojure.core/defn- req-get-queue-request [input] (clojure.core/cond-> #:http.request.configuration{:uri [(clojure.core/into (ser-string (input :name)) #:http.request.field{:name "Name", :shape "__string", :location-name "name", :location "uri"})]}))

(clojure.core/defn- req-delete-queue-request [input] (clojure.core/cond-> #:http.request.configuration{:uri [(clojure.core/into (ser-string (input :name)) #:http.request.field{:name "Name", :shape "__string", :location-name "name", :location "uri"})]}))

(clojure.core/defn- req-list-job-templates-request [input] (clojure.core/cond-> {} (clojure.core/contains? input :category) (clojure.core/update-in [:http.request.configuration/querystring] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-string (input :category)) #:http.request.field{:name "Category", :shape "__string", :location-name "category", :location "querystring"})) (clojure.core/contains? input :list-by) (clojure.core/update-in [:http.request.configuration/querystring] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-job-template-list-by (input :list-by)) #:http.request.field{:name "ListBy", :shape "JobTemplateListBy", :location-name "listBy", :location "querystring"})) (clojure.core/contains? input :max-results) (clojure.core/update-in [:http.request.configuration/querystring] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-integer-min-1-max-20 (input :max-results)) #:http.request.field{:name "MaxResults", :shape "__integerMin1Max20", :location-name "maxResults", :location "querystring"})) (clojure.core/contains? input :next-token) (clojure.core/update-in [:http.request.configuration/querystring] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-string (input :next-token)) #:http.request.field{:name "NextToken", :shape "__string", :location-name "nextToken", :location "querystring"})) (clojure.core/contains? input :order) (clojure.core/update-in [:http.request.configuration/querystring] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-order (input :order)) #:http.request.field{:name "Order", :shape "Order", :location-name "order", :location "querystring"}))))

(clojure.core/defn- req-tag-resource-request [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (ser-string (input :arn)) #:http.request.field{:name "Arn", :shape "__string", :location-name "arn"}) (clojure.core/into (ser-map-of-string (input :tags)) #:http.request.field{:name "Tags", :shape "__mapOf__string", :location-name "tags"})]}))

(clojure.core/defn- req-create-job-request [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (ser-string (input :role)) #:http.request.field{:name "Role", :shape "__string", :location-name "role"}) (clojure.core/into (ser-job-settings (input :settings)) #:http.request.field{:name "Settings", :shape "JobSettings", :location-name "settings"})]} (clojure.core/contains? input :status-update-interval-in-secs) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-integer-min-10-max-600 (input :status-update-interval-in-secs)) #:http.request.field{:name "StatusUpdateIntervalInSecs", :shape "__integerMin10Max600", :location-name "statusUpdateIntervalInSecs"})) (clojure.core/contains? input :client-request-token) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-string (input :client-request-token)) #:http.request.field{:name "ClientRequestToken", :shape "__string", :location-name "clientRequestToken", :idempotency-token true})) (clojure.core/contains? input :queue) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-string (input :queue)) #:http.request.field{:name "Queue", :shape "__string", :location-name "queue"})) (clojure.core/contains? input :job-template) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-string (input :job-template)) #:http.request.field{:name "JobTemplate", :shape "__string", :location-name "jobTemplate"})) (clojure.core/contains? input :user-metadata) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-map-of-string (input :user-metadata)) #:http.request.field{:name "UserMetadata", :shape "__mapOf__string", :location-name "userMetadata"})) (clojure.core/contains? input :acceleration-settings) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-acceleration-settings (input :acceleration-settings)) #:http.request.field{:name "AccelerationSettings", :shape "AccelerationSettings", :location-name "accelerationSettings"})) (clojure.core/contains? input :billing-tags-source) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-billing-tags-source (input :billing-tags-source)) #:http.request.field{:name "BillingTagsSource", :shape "BillingTagsSource", :location-name "billingTagsSource"}))))

(clojure.core/defn- req-list-presets-request [input] (clojure.core/cond-> {} (clojure.core/contains? input :category) (clojure.core/update-in [:http.request.configuration/querystring] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-string (input :category)) #:http.request.field{:name "Category", :shape "__string", :location-name "category", :location "querystring"})) (clojure.core/contains? input :list-by) (clojure.core/update-in [:http.request.configuration/querystring] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-preset-list-by (input :list-by)) #:http.request.field{:name "ListBy", :shape "PresetListBy", :location-name "listBy", :location "querystring"})) (clojure.core/contains? input :max-results) (clojure.core/update-in [:http.request.configuration/querystring] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-integer-min-1-max-20 (input :max-results)) #:http.request.field{:name "MaxResults", :shape "__integerMin1Max20", :location-name "maxResults", :location "querystring"})) (clojure.core/contains? input :next-token) (clojure.core/update-in [:http.request.configuration/querystring] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-string (input :next-token)) #:http.request.field{:name "NextToken", :shape "__string", :location-name "nextToken", :location "querystring"})) (clojure.core/contains? input :order) (clojure.core/update-in [:http.request.configuration/querystring] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-order (input :order)) #:http.request.field{:name "Order", :shape "Order", :location-name "order", :location "querystring"}))))

(clojure.core/defn- req-get-job-request [input] (clojure.core/cond-> #:http.request.configuration{:uri [(clojure.core/into (ser-string (input :id)) #:http.request.field{:name "Id", :shape "__string", :location-name "id", :location "uri"})]}))

(clojure.core/defn- req-update-queue-request [input] (clojure.core/cond-> #:http.request.configuration{:uri [(clojure.core/into (ser-string (input :name)) #:http.request.field{:name "Name", :shape "__string", :location-name "name", :location "uri"})]} (clojure.core/contains? input :description) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-string (input :description)) #:http.request.field{:name "Description", :shape "__string", :location-name "description"})) (clojure.core/contains? input :reservation-plan-settings) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-reservation-plan-settings (input :reservation-plan-settings)) #:http.request.field{:name "ReservationPlanSettings", :shape "ReservationPlanSettings", :location-name "reservationPlanSettings"})) (clojure.core/contains? input :status) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-queue-status (input :status)) #:http.request.field{:name "Status", :shape "QueueStatus", :location-name "status"}))))

(clojure.core/defn- req-create-queue-request [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (ser-string (input :name)) #:http.request.field{:name "Name", :shape "__string", :location-name "name"})]} (clojure.core/contains? input :description) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-string (input :description)) #:http.request.field{:name "Description", :shape "__string", :location-name "description"})) (clojure.core/contains? input :pricing-plan) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-pricing-plan (input :pricing-plan)) #:http.request.field{:name "PricingPlan", :shape "PricingPlan", :location-name "pricingPlan"})) (clojure.core/contains? input :reservation-plan-settings) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-reservation-plan-settings (input :reservation-plan-settings)) #:http.request.field{:name "ReservationPlanSettings", :shape "ReservationPlanSettings", :location-name "reservationPlanSettings"})) (clojure.core/contains? input :tags) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-map-of-string (input :tags)) #:http.request.field{:name "Tags", :shape "__mapOf__string", :location-name "tags"}))))

(clojure.core/defn- req-describe-endpoints-request [input] (clojure.core/cond-> {} (clojure.core/contains? input :max-results) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-integer (input :max-results)) #:http.request.field{:name "MaxResults", :shape "__integer", :location-name "maxResults"})) (clojure.core/contains? input :mode) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-describe-endpoints-mode (input :mode)) #:http.request.field{:name "Mode", :shape "DescribeEndpointsMode", :location-name "mode"})) (clojure.core/contains? input :next-token) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-string (input :next-token)) #:http.request.field{:name "NextToken", :shape "__string", :location-name "nextToken"}))))

(clojure.core/defn- req-update-job-template-request [input] (clojure.core/cond-> #:http.request.configuration{:uri [(clojure.core/into (ser-string (input :name)) #:http.request.field{:name "Name", :shape "__string", :location-name "name", :location "uri"})]} (clojure.core/contains? input :acceleration-settings) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-acceleration-settings (input :acceleration-settings)) #:http.request.field{:name "AccelerationSettings", :shape "AccelerationSettings", :location-name "accelerationSettings"})) (clojure.core/contains? input :category) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-string (input :category)) #:http.request.field{:name "Category", :shape "__string", :location-name "category"})) (clojure.core/contains? input :description) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-string (input :description)) #:http.request.field{:name "Description", :shape "__string", :location-name "description"})) (clojure.core/contains? input :queue) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-string (input :queue)) #:http.request.field{:name "Queue", :shape "__string", :location-name "queue"})) (clojure.core/contains? input :settings) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-job-template-settings (input :settings)) #:http.request.field{:name "Settings", :shape "JobTemplateSettings", :location-name "settings"})) (clojure.core/contains? input :status-update-interval-in-secs) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-integer-min-10-max-600 (input :status-update-interval-in-secs)) #:http.request.field{:name "StatusUpdateIntervalInSecs", :shape "__integerMin10Max600", :location-name "statusUpdateIntervalInSecs"}))))

(clojure.core/defn- req-delete-preset-request [input] (clojure.core/cond-> #:http.request.configuration{:uri [(clojure.core/into (ser-string (input :name)) #:http.request.field{:name "Name", :shape "__string", :location-name "name", :location "uri"})]}))

(clojure.core/defn- req-untag-resource-request [input] (clojure.core/cond-> #:http.request.configuration{:uri [(clojure.core/into (ser-string (input :arn)) #:http.request.field{:name "Arn", :shape "__string", :location-name "arn", :location "uri"})]} (clojure.core/contains? input :tag-keys) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-list-of-string (input :tag-keys)) #:http.request.field{:name "TagKeys", :shape "__listOf__string", :location-name "tagKeys"}))))

(clojure.core/declare deser-dvb-subtitle-shadow-color)

(clojure.core/declare deser-hls-manifest-compression)

(clojure.core/declare deser-hls-encryption-type)

(clojure.core/declare deser-video-preprocessor)

(clojure.core/declare deser-prores-slow-pal)

(clojure.core/declare deser-hls-manifest-duration-format)

(clojure.core/declare deser-integer-min-negative-60-max-6)

(clojure.core/declare deser-dvb-subtitle-font-color)

(clojure.core/declare deser-reservation-plan)

(clojure.core/declare deser-output-sdt)

(clojure.core/declare deser-eac-3-dynamic-range-compression-line)

(clojure.core/declare deser-output-detail)

(clojure.core/declare deser-integer-min-0-max-1000)

(clojure.core/declare deser-prores-framerate-conversion-algorithm)

(clojure.core/declare deser-h-264-adaptive-quantization)

(clojure.core/declare deser-noise-reducer-spatial-filter-settings)

(clojure.core/declare deser-drop-frame-timecode)

(clojure.core/declare deser-string-pattern-sn-manifest-confirm-condition-notification-ns)

(clojure.core/declare deser-integer-min-25-max-2000)

(clojure.core/declare deser-timecode-burnin)

(clojure.core/declare deser-scc-destination-framerate)

(clojure.core/declare deser-preset-settings)

(clojure.core/declare deser-commitment)

(clojure.core/declare deser-h-265-sample-adaptive-offset-filter-mode)

(clojure.core/declare deser-ttml-destination-settings)

(clojure.core/declare deser-integer-min-1-max-4)

(clojure.core/declare deser-mpeg-2-framerate-conversion-algorithm)

(clojure.core/declare deser-integer-min-2-max-2147483647)

(clojure.core/declare deser-m-2ts-pcr-control)

(clojure.core/declare deser-mpeg-2-gop-size-units)

(clojure.core/declare deser-string-pattern-sn-signal-processing-notification-ns)

(clojure.core/declare deser-esam-signal-processing-notification)

(clojure.core/declare deser-remix-settings)

(clojure.core/declare deser-font-script)

(clojure.core/declare deser-integer-min-0-max-99)

(clojure.core/declare deser-dvb-tdt-settings)

(clojure.core/declare deser-string-min-32-max-32-pattern-09a-faf-32)

(clojure.core/declare deser-cmaf-client-cache)

(clojure.core/declare deser-h-265-par-control)

(clojure.core/declare deser-mpeg-2-adaptive-quantization)

(clojure.core/declare deser-mov-padding-control)

(clojure.core/declare deser-prores-framerate-control)

(clojure.core/declare deser-audio-normalization-algorithm-control)

(clojure.core/declare deser-map-of-audio-selector)

(clojure.core/declare deser-string-pattern-arn-aws-us-gov-acm)

(clojure.core/declare deser-ttml-style-passthrough)

(clojure.core/declare deser-h-264-temporal-adaptive-quantization)

(clojure.core/declare deser-insertable-image)

(clojure.core/declare deser-container-settings)

(clojure.core/declare deser-cmaf-codec-specification)

(clojure.core/declare deser-integer-min-1-max-1)

(clojure.core/declare deser-h-265-gop-b-reference)

(clojure.core/declare deser-h-265-temporal-adaptive-quantization)

(clojure.core/declare deser-audio-description)

(clojure.core/declare deser-job-status)

(clojure.core/declare deser-aac-vbr-quality)

(clojure.core/declare deser-deinterlacer-control)

(clojure.core/declare deser-string-min-11-max-11-pattern-01-d-20305-d-205-d)

(clojure.core/declare deser-track-source-settings)

(clojure.core/declare deser-h-265-codec-level)

(clojure.core/declare deser-string-pattern-ws)

(clojure.core/declare deser-m-3u-8-pcr-control)

(clojure.core/declare deser-integer-min-32-max-8182)

(clojure.core/declare deser-scc-destination-settings)

(clojure.core/declare deser-list-of-id-3-insertion)

(clojure.core/declare deser-type)

(clojure.core/declare deser-h-264-slow-pal)

(clojure.core/declare deser-m-2ts-audio-buffer-model)

(clojure.core/declare deser-h-265-unregistered-sei-timecode)

(clojure.core/declare deser-hls-audio-track-type)

(clojure.core/declare deser-h-264-gop-size-units)

(clojure.core/declare deser-hls-directory-structure)

(clojure.core/declare deser-m-2ts-ebp-placement)

(clojure.core/declare deser-h-265-tiles)

(clojure.core/declare deser-deinterlacer-mode)

(clojure.core/declare deser-motion-image-insertion-offset)

(clojure.core/declare deser-eac-3-settings)

(clojure.core/declare deser-cmaf-segment-control)

(clojure.core/declare deser-caption-destination-type)

(clojure.core/declare deser-hls-key-provider-type)

(clojure.core/declare deser-h-264-dynamic-sub-gop)

(clojure.core/declare deser-audio-normalization-algorithm)

(clojure.core/declare deser-cmaf-encryption-type)

(clojure.core/declare deser-hls-i-frame-only-manifest)

(clojure.core/declare deser-mp-4-moov-placement)

(clojure.core/declare deser-string-pattern-s-3-mm-2-vvmmppeeggaavviimmpp-4-ffllvvmmppttmmppggmm-4-vvttrrppff-4-vvmm-2-ttssttss-264-hh-264-mmkkvvmmoovvmmttssmm-2-ttwwmmvvaassffvvoobb-3-ggpp-3-ggppppmmxxffddiivvxxxxvviiddrraawwddvvggxxffmm-1-vv-3-gg-2-vvmmffmm-3-uu-8-llcchhggxxffmmppeegg-2-mmxxffmmppeegg-2-mmxxffhhddwwaavvyy-4-mmxxmmll)

(clojure.core/declare deser-job-template-settings)

(clojure.core/declare deser-integer-min-0-max-500)

(clojure.core/declare deser-string-min-14-pattern-s-3-scc-scc-ttml-ttml-dfxp-dfxp-stl-stl-srt-srt-smi-smi)

(clojure.core/declare deser-h-264-repeat-pps)

(clojure.core/declare deser-cmaf-manifest-compression)

(clojure.core/declare deser-mpeg-2-interlace-mode)

(clojure.core/declare deser-h-264-telecine)

(clojure.core/declare deser-integer-min-1000-max-288000000)

(clojure.core/declare deser-integer-min-0-max-30000)

(clojure.core/declare deser-esam-manifest-confirm-condition-notification)

(clojure.core/declare deser-container-type)

(clojure.core/declare deser-integer-min-0-max-1152000000)

(clojure.core/declare deser-dvb-sdt-settings)

(clojure.core/declare deser-dvb-subtitle-outline-color)

(clojure.core/declare deser-cmaf-stream-inf-resolution)

(clojure.core/declare deser-h-265-adaptive-quantization)

(clojure.core/declare deser-string-min-24-max-512-pattern-a-za-z-0902)

(clojure.core/declare deser-hls-offline-encrypted)

(clojure.core/declare deser-hls-settings)

(clojure.core/declare deser-ac-3-lfe-filter)

(clojure.core/declare deser-list-of-endpoint)

(clojure.core/declare deser-string-pattern-01-d-20305-d-205-d)

(clojure.core/declare deser-integer-min-0-max-9)

(clojure.core/declare deser-resource-tags)

(clojure.core/declare deser-mpeg-2-codec-level)

(clojure.core/declare deser-mpeg-2-rate-control-mode)

(clojure.core/declare deser-aiff-settings)

(clojure.core/declare deser-queue)

(clojure.core/declare deser-hls-stream-inf-resolution)

(clojure.core/declare deser-h-264-field-encoding)

(clojure.core/declare deser-string-pattern-0940191020191209301)

(clojure.core/declare deser-integer-min-0-max-47185920)

(clojure.core/declare deser-hls-caption-language-setting)

(clojure.core/declare deser-m-2ts-settings)

(clojure.core/declare deser-string)

(clojure.core/declare deser-dvb-sub-source-settings)

(clojure.core/declare deser-input-denoise-filter)

(clojure.core/declare deser-audio-selector-type)

(clojure.core/declare deser-mpeg-2-framerate-control)

(clojure.core/declare deser-afd-signaling)

(clojure.core/declare deser-pricing-plan)

(clojure.core/declare deser-eac-3-metadata-control)

(clojure.core/declare deser-integer-min-0-max-65535)

(clojure.core/declare deser-integer-min-8000-max-192000)

(clojure.core/declare deser-h-264-quality-tuning-level)

(clojure.core/declare deser-m-3u-8-scte-35-source)

(clojure.core/declare deser-noise-reducer-filter)

(clojure.core/declare deser-integer-min-0-max-2147483647)

(clojure.core/declare deser-integer-min-6000-max-1024000)

(clojure.core/declare deser-cmaf-group-settings)

(clojure.core/declare deser-h-265-qvbr-settings)

(clojure.core/declare deser-list-of-output-group)

(clojure.core/declare deser-list-of-caption-description-preset)

(clojure.core/declare deser-motion-image-insertion-mode)

(clojure.core/declare deser-renewal-type)

(clojure.core/declare deser-integer-min-1-max-100)

(clojure.core/declare deser-eac-3-lfe-control)

(clojure.core/declare deser-prores-codec-profile)

(clojure.core/declare deser-teletext-source-settings)

(clojure.core/declare deser-caption-description-preset)

(clojure.core/declare deser-video-detail)

(clojure.core/declare deser-h-264-flicker-adaptive-quantization)

(clojure.core/declare deser-h-265-slow-pal)

(clojure.core/declare deser-eac-3-surround-mode)

(clojure.core/declare deser-string-min-0)

(clojure.core/declare deser-hls-caption-language-mapping)

(clojure.core/declare deser-mpeg-2-syntax)

(clojure.core/declare deser-h-264-codec-profile)

(clojure.core/declare deser-h-265-telecine)

(clojure.core/declare deser-list-of-insertable-image)

(clojure.core/declare deser-wav-format)

(clojure.core/declare deser-list-of-output-channel-mapping)

(clojure.core/declare deser-h-264-unregistered-sei-timecode)

(clojure.core/declare deser-string-pattern-dd)

(clojure.core/declare deser-eac-3-lfe-filter)

(clojure.core/declare deser-input-timecode-source)

(clojure.core/declare deser-timecode-source)

(clojure.core/declare deser-hls-encryption-settings)

(clojure.core/declare deser-h-265-framerate-conversion-algorithm)

(clojure.core/declare deser-h-264-rate-control-mode)

(clojure.core/declare deser-integer-min-0-max-255)

(clojure.core/declare deser-motion-image-insertion-framerate)

(clojure.core/declare deser-video-selector)

(clojure.core/declare deser-burnin-subtitle-teletext-spacing)

(clojure.core/declare deser-job-template)

(clojure.core/declare deser-ac-3-metadata-control)

(clojure.core/declare deser-double-min-0)

(clojure.core/declare deser-mp-4-settings)

(clojure.core/declare deser-list-of-integer-min-negative-60-max-6)

(clojure.core/declare deser-cmaf-write-hls-manifest)

(clojure.core/declare deser-m-2ts-buffer-model)

(clojure.core/declare deser-integer-min-25-max-10000)

(clojure.core/declare deser-hdr-10-metadata)

(clojure.core/declare deser-eac-3-coding-mode)

(clojure.core/declare deser-caption-description)

(clojure.core/declare deser-dash-iso-segment-control)

(clojure.core/declare deser-m-3u-8-nielsen-id-3)

(clojure.core/declare deser-list-of-integer-min-32-max-8182)

(clojure.core/declare deser-audio-type-control)

(clojure.core/declare deser-hls-output-selection)

(clojure.core/declare deser-speke-key-provider)

(clojure.core/declare deser-deinterlace-algorithm)

(clojure.core/declare deser-ac-3-bitstream-mode)

(clojure.core/declare deser-integer-min-16-max-24)

(clojure.core/declare deser-integer-min-negative-2-max-3)

(clojure.core/declare deser-f-4v-moov-placement)

(clojure.core/declare deser-eac-3-dynamic-range-compression-rf)

(clojure.core/declare deser-aac-raw-format)

(clojure.core/declare deser-string-pattern-s-3-assetmap-xml)

(clojure.core/declare deser-integer-min-32000-max-384000)

(clojure.core/declare deser-list-of-preset)

(clojure.core/declare deser-timed-metadata)

(clojure.core/declare deser-integer-min-32-max-4096)

(clojure.core/declare deser-h-265-rate-control-mode)

(clojure.core/declare deser-mov-reference)

(clojure.core/declare deser-integer-min-0-max-3600)

(clojure.core/declare deser-acceleration-settings)

(clojure.core/declare deser-string-pattern-s-3)

(clojure.core/declare deser-m-2ts-segmentation-markers)

(clojure.core/declare deser-acceleration-mode)

(clojure.core/declare deser-m-2ts-scte-35-source)

(clojure.core/declare deser-list-of-job-template)

(clojure.core/declare deser-h-264-par-control)

(clojure.core/declare deser-color-corrector)

(clojure.core/declare deser-video-description)

(clojure.core/declare deser-integer-min-0-max-15)

(clojure.core/declare deser-string-min-3-max-3-pattern-1809a-faf-09a-eae)

(clojure.core/declare deser-integer-min-1-max-10)

(clojure.core/declare deser-id-3-insertion)

(clojure.core/declare deser-output-group-settings)

(clojure.core/declare deser-integer-min-32000-max-48000)

(clojure.core/declare deser-string-pattern-s-3-mm-2-vvmmppeeggaavviimmpp-4-ffllvvmmppttmmppggmm-4-vvttrrppff-4-vvmm-2-ttssttss-264-hh-264-mmkkvvmmoovvmmttssmm-2-ttwwmmvvaassffvvoobb-3-ggpp-3-ggppppmmxxffddiivvxxxxvviiddrraawwddvvggxxffmm-1-vv-3-gg-2-vvmmffmm-3-uu-8-llcchhggxxffmmppeegg-2-mmxxffmmppeegg-2-mmxxffhhddwwaavvyy-4-mmaaaaccaaiiffffmmpp-2-aacc-3-eecc-3-ddttssee)

(clojure.core/declare deser-integer-min-96-max-600)

(clojure.core/declare deser-ms-smooth-encryption-settings)

(clojure.core/declare deser-file-source-convert-608-to-708)

(clojure.core/declare deser-map-of-audio-selector-group)

(clojure.core/declare deser-list-of-hls-ad-markers)

(clojure.core/declare deser-list-of-integer-min-1-max-2147483647)

(clojure.core/declare deser-dash-iso-hbbtv-compliance)

(clojure.core/declare deser-input-clipping)

(clojure.core/declare deser-color-space)

(clojure.core/declare deser-scaling-behavior)

(clojure.core/declare deser-mp-2-settings)

(clojure.core/declare deser-mpeg-2-scene-change-detect)

(clojure.core/declare deser-integer-min-1-max-1001)

(clojure.core/declare deser-m-2ts-es-rate-in-pes)

(clojure.core/declare deser-caption-source-settings)

(clojure.core/declare deser-caption-destination-settings)

(clojure.core/declare deser-integer-min-1000-max-30000)

(clojure.core/declare deser-integer-min-1-max-2147483647)

(clojure.core/declare deser-integer-min-32-max-2160)

(clojure.core/declare deser-hls-ad-markers)

(clojure.core/declare deser-integer-min-10-max-600)

(clojure.core/declare deser-m-2ts-segmentation-style)

(clojure.core/declare deser-channel-mapping)

(clojure.core/declare deser-integer-min-0-max-30)

(clojure.core/declare deser-timing)

(clojure.core/declare deser-h-264-framerate-conversion-algorithm)

(clojure.core/declare deser-m-2ts-force-ts-video-ebp-order)

(clojure.core/declare deser-dvb-subtitle-background-color)

(clojure.core/declare deser-string-pattern-https)

(clojure.core/declare deser-audio-normalization-peak-calculation)

(clojure.core/declare deser-integer-min-0-max-16)

(clojure.core/declare deser-integer-min-negative-70-max-0)

(clojure.core/declare deser-anti-alias)

(clojure.core/declare deser-burnin-subtitle-background-color)

(clojure.core/declare deser-m-2ts-rate-mode)

(clojure.core/declare deser-eac-3-bitstream-mode)

(clojure.core/declare deser-timed-metadata-insertion)

(clojure.core/declare deser-input-template)

(clojure.core/declare deser-language-code)

(clojure.core/declare deser-string-min-9-max-19-pattern-az-26-east-west-central-north-south-east-west-1912)

(clojure.core/declare deser-mov-settings)

(clojure.core/declare deser-integer-min-0-max-100)

(clojure.core/declare deser-list-of-hls-caption-language-mapping)

(clojure.core/declare deser-dash-iso-write-segment-timeline-in-representation)

(clojure.core/declare deser-integer-min-1-max-6)

(clojure.core/declare deser-ancillary-source-settings)

(clojure.core/declare deser-input)

(clojure.core/declare deser-h-265-alternate-transfer-function-sei)

(clojure.core/declare deser-m-2ts-ebp-audio-interval)

(clojure.core/declare deser-input-psi-control)

(clojure.core/declare deser-burnin-subtitle-alignment)

(clojure.core/declare deser-file-source-settings)

(clojure.core/declare deser-prores-interlace-mode)

(clojure.core/declare deser-caption-source-type)

(clojure.core/declare deser-string-min-1-max-256)

(clojure.core/declare deser-motion-image-inserter)

(clojure.core/declare deser-color-metadata)

(clojure.core/declare deser-integer-min-48000-max-48000)

(clojure.core/declare deser-double-min-negative-59-max-0)

(clojure.core/declare deser-string-min-16-max-24-pattern-a-za-z-0922-a-za-z-0916)

(clojure.core/declare deser-integer-min-1000-max-300000000)

(clojure.core/declare deser-list-of-queue)

(clojure.core/declare deser-video-codec-settings)

(clojure.core/declare deser-h-264-qvbr-settings)

(clojure.core/declare deser-ms-smooth-manifest-encoding)

(clojure.core/declare deser-output-group-type)

(clojure.core/declare deser-eac-3-dc-filter)

(clojure.core/declare deser-h-264-scene-change-detect)

(clojure.core/declare deser-noise-reducer)

(clojure.core/declare deser-list-of-string-min-1)

(clojure.core/declare deser-audio-language-code-control)

(clojure.core/declare deser-input-rotate)

(clojure.core/declare deser-list-of-job)

(clojure.core/declare deser-integer-min-0-max-50000)

(clojure.core/declare deser-aac-coding-mode)

(clojure.core/declare deser-list-of-output-group-detail)

(clojure.core/declare deser-h-264-spatial-adaptive-quantization)

(clojure.core/declare deser-string-pattern-010920405090509092)

(clojure.core/declare deser-output-settings)

(clojure.core/declare deser-burnin-subtitle-shadow-color)

(clojure.core/declare deser-input-decryption-settings)

(clojure.core/declare deser-h-265-gop-size-units)

(clojure.core/declare deser-mp-4-cslg-atom)

(clojure.core/declare deser-list-of-output)

(clojure.core/declare deser-mpeg-2-slow-pal)

(clojure.core/declare deser-teletext-destination-settings)

(clojure.core/declare deser-output-group)

(clojure.core/declare deser-h-265-quality-tuning-level)

(clojure.core/declare deser-mpeg-2-dynamic-sub-gop)

(clojure.core/declare deser-image-inserter)

(clojure.core/declare deser-hls-client-cache)

(clojure.core/declare deser-input-filter-enable)

(clojure.core/declare deser-integer-min-0-max-10000)

(clojure.core/declare deser-burnin-subtitle-outline-color)

(clojure.core/declare deser-embedded-source-settings)

(clojure.core/declare deser-cmaf-key-provider-type)

(clojure.core/declare deser-integer-min-negative-2147483648-max-2147483647)

(clojure.core/declare deser-h-264-gop-b-reference)

(clojure.core/declare deser-video-codec)

(clojure.core/declare deser-list-of-input)

(clojure.core/declare deser-integer-min-negative-5-max-5)

(clojure.core/declare deser-integer-min-24-max-60000)

(clojure.core/declare deser-double-min-negative-60-max-3)

(clojure.core/declare deser-list-of-output-detail)

(clojure.core/declare deser-input-deblock-filter)

(clojure.core/declare deser-string-min-14-pattern-s-3-bmp-bmp-png-png-tga-tga)

(clojure.core/declare deser-double-min-0-max-2147483647)

(clojure.core/declare deser-job-settings)

(clojure.core/declare deser-string-min-14-max-1285-pattern-s-3-mov-09-png)

(clojure.core/declare deser-audio-codec)

(clojure.core/declare deser-h-265-settings)

(clojure.core/declare deser-output-group-detail)

(clojure.core/declare deser-endpoint)

(clojure.core/declare deser-cmaf-initialization-vector-in-manifest)

(clojure.core/declare deser-ac-3-coding-mode)

(clojure.core/declare deser-integer-min-10-max-48)

(clojure.core/declare deser-preset)

(clojure.core/declare deser-m-2ts-nielsen-id-3)

(clojure.core/declare deser-integer-min-0-max-10)

(clojure.core/declare deser-aac-rate-control-mode)

(clojure.core/declare deser-h-264-interlace-mode)

(clojure.core/declare deser-mpeg-2-codec-profile)

(clojure.core/declare deser-integer-min-negative-1000-max-1000)

(clojure.core/declare deser-integer-min-1-max-2)

(clojure.core/declare deser-mpeg-2-telecine)

(clojure.core/declare deser-audio-normalization-loudness-logging)

(clojure.core/declare deser-h-265-dynamic-sub-gop)

(clojure.core/declare deser-cmaf-write-dash-manifest)

(clojure.core/declare deser-dvb-subtitle-alignment)

(clojure.core/declare deser-mpeg-2-temporal-adaptive-quantization)

(clojure.core/declare deser-aac-codec-profile)

(clojure.core/declare deser-prores-par-control)

(clojure.core/declare deser-mpeg-2-par-control)

(clojure.core/declare deser-deinterlacer)

(clojure.core/declare deser-cmaf-encryption-settings)

(clojure.core/declare deser-mov-clap-atom)

(clojure.core/declare deser-integer-min-negative-180-max-180)

(clojure.core/declare deser-integer-min-64000-max-640000)

(clojure.core/declare deser-respond-to-afd)

(clojure.core/declare deser-string-pattern-a-za-z-0932)

(clojure.core/declare deser-eac-3-attenuation-control)

(clojure.core/declare deser-integer-min-0-max-96)

(clojure.core/declare deser-h-264-framerate-control)

(clojure.core/declare deser-timecode-config)

(clojure.core/declare deser-dvb-sub-destination-settings)

(clojure.core/declare deser-aac-audio-description-broadcaster-mix)

(clojure.core/declare deser-embedded-convert-608-to-708)

(clojure.core/declare deser-string-min-1)

(clojure.core/declare deser-dvb-subtitle-teletext-spacing)

(clojure.core/declare deser-video-timecode-insertion)

(clojure.core/declare deser-mp-4-free-space-box)

(clojure.core/declare deser-integer-min-1-max-2147483640)

(clojure.core/declare deser-list-of-string-pattern-09a-faf-809a-faf-409a-faf-409a-faf-409a-faf-12)

(clojure.core/declare deser-audio-selector-group)

(clojure.core/declare deser-ac-3-settings)

(clojure.core/declare deser-integer-min-0-max-8)

(clojure.core/declare deser-ms-smooth-group-settings)

(clojure.core/declare deser-h-265-scene-change-detect)

(clojure.core/declare deser-integer-min-0-max-7)

(clojure.core/declare deser-reservation-plan-status)

(clojure.core/declare deser-h-264-entropy-encoding)

(clojure.core/declare deser-hls-initialization-vector-in-manifest)

(clojure.core/declare deser-h-265-spatial-adaptive-quantization)

(clojure.core/declare deser-mov-cslg-atom)

(clojure.core/declare deser-output)

(clojure.core/declare deser-string-pattern-identity-a-za-z-26-a-za-z-09163)

(clojure.core/declare deser-integer-min-1-max-17895697)

(clojure.core/declare deser-h-265-codec-profile)

(clojure.core/declare deser-burnin-subtitle-font-color)

(clojure.core/declare deser-color-space-usage)

(clojure.core/declare deser-integer)

(clojure.core/declare deser-aac-settings)

(clojure.core/declare deser-integer-min-1000-max-1466400000)

(clojure.core/declare deser-h-265-temporal-ids)

(clojure.core/declare deser-list-of-caption-description)

(clojure.core/declare deser-embedded-destination-settings)

(clojure.core/declare deser-timestamp-unix)

(clojure.core/declare deser-timecode-burnin-position)

(clojure.core/declare deser-caption-selector)

(clojure.core/declare deser-burnin-destination-settings)

(clojure.core/declare deser-job)

(clojure.core/declare deser-hls-group-settings)

(clojure.core/declare deser-dvb-nit-settings)

(clojure.core/declare deser-cmaf-manifest-duration-format)

(clojure.core/declare deser-h-265-write-mp-4-packaging-type)

(clojure.core/declare deser-hls-segment-control)

(clojure.core/declare deser-prores-telecine)

(clojure.core/declare deser-ac-3-dynamic-range-compression-profile)

(clojure.core/declare deser-h-265-flicker-adaptive-quantization)

(clojure.core/declare deser-string-min-3-max-3-pattern-a-za-z-3)

(clojure.core/declare deser-double-min-negative-60-max-negative-1)

(clojure.core/declare deser-m-2ts-scte-35-esam)

(clojure.core/declare deser-frame-capture-settings)

(clojure.core/declare deser-hls-program-date-time)

(clojure.core/declare deser-h-265-framerate-control)

(clojure.core/declare deser-nielsen-configuration)

(clojure.core/declare deser-static-key-provider)

(clojure.core/declare deser-esam-settings)

(clojure.core/declare deser-decryption-mode)

(clojure.core/declare deser-integer-min-1000-max-1152000000)

(clojure.core/declare deser-audio-codec-settings)

(clojure.core/declare deser-mpeg-2-intra-dc-precision)

(clojure.core/declare deser-mpeg-2-spatial-adaptive-quantization)

(clojure.core/declare deser-rectangle)

(clojure.core/declare deser-mpeg-2-quality-tuning-level)

(clojure.core/declare deser-integer-min-1-max-32)

(clojure.core/declare deser-dash-iso-group-settings)

(clojure.core/declare deser-ms-smooth-audio-deduplication)

(clojure.core/declare deser-aac-specification)

(clojure.core/declare deser-eac-3-passthrough-control)

(clojure.core/declare deser-string-pattern-a-za-z-0902)

(clojure.core/declare deser-integer-min-1-max-31)

(clojure.core/declare deser-motion-image-playback)

(clojure.core/declare deser-string-min-14-pattern-s-3-bmp-bmp-png-png)

(clojure.core/declare deser-audio-normalization-settings)

(clojure.core/declare deser-billing-tags-source)

(clojure.core/declare deser-mpeg-2-settings)

(clojure.core/declare deser-h-264-settings)

(clojure.core/declare deser-integer-min-8000-max-96000)

(clojure.core/declare deser-hls-timed-metadata-id-3-frame)

(clojure.core/declare deser-output-channel-mapping)

(clojure.core/declare deser-eac-3-phase-control)

(clojure.core/declare deser-eac-3-surround-ex-mode)

(clojure.core/declare deser-dash-iso-encryption-settings)

(clojure.core/declare deser-integer-min-1-max-8)

(clojure.core/declare deser-list-of-audio-description)

(clojure.core/declare deser-file-group-settings)

(clojure.core/declare deser-integer-min-0-max-3)

(clojure.core/declare deser-m-3u-8-settings)

(clojure.core/declare deser-eac-3-stereo-downmix)

(clojure.core/declare deser-mov-mpeg-2-four-cc-control)

(clojure.core/declare deser-wav-settings)

(clojure.core/declare deser-integer-min-1-max-10000000)

(clojure.core/declare deser-integer-min-0-max-128)

(clojure.core/declare deser-f-4v-settings)

(clojure.core/declare deser-h-264-syntax)

(clojure.core/declare deser-noise-reducer-filter-settings)

(clojure.core/declare deser-list-of-input-clipping)

(clojure.core/declare deser-prores-settings)

(clojure.core/declare deser-map-of-string)

(clojure.core/declare deser-queue-status)

(clojure.core/declare deser-list-of-string-pattern-s-3-assetmap-xml)

(clojure.core/declare deser-list-of-input-template)

(clojure.core/declare deser-string-pattern-09a-faf-809a-faf-409a-faf-409a-faf-409a-faf-12)

(clojure.core/declare deser-h-265-interlace-mode)

(clojure.core/declare deser-hls-codec-specification)

(clojure.core/declare deser-color-space-conversion)

(clojure.core/declare deser-h-264-codec-level)

(clojure.core/declare deser-avail-blanking)

(clojure.core/declare deser-string-pattern)

(clojure.core/declare deser-audio-selector)

(clojure.core/declare deser-map-of-caption-selector)

(clojure.core/declare deser-integer-min-1-max-16)

(clojure.core/declare deser-integer-min-0-max-1466400000)

(clojure.core/declare deser-audio-default-selection)

(clojure.core/defn- deser-dvb-subtitle-shadow-color [input] (clojure.core/get {"NONE" :none, "BLACK" :black, "WHITE" :white} input))

(clojure.core/defn- deser-hls-manifest-compression [input] (clojure.core/get {"GZIP" :gzip, "NONE" :none} input))

(clojure.core/defn- deser-hls-encryption-type [input] (clojure.core/get {"AES128" :aes-128, "SAMPLE_AES" :sample-aes} input))

(clojure.core/defn- deser-video-preprocessor [input] (clojure.core/cond-> {} (clojure.core/contains? input "colorCorrector") (clojure.core/assoc :color-corrector (deser-color-corrector (input "colorCorrector"))) (clojure.core/contains? input "deinterlacer") (clojure.core/assoc :deinterlacer (deser-deinterlacer (input "deinterlacer"))) (clojure.core/contains? input "imageInserter") (clojure.core/assoc :image-inserter (deser-image-inserter (input "imageInserter"))) (clojure.core/contains? input "noiseReducer") (clojure.core/assoc :noise-reducer (deser-noise-reducer (input "noiseReducer"))) (clojure.core/contains? input "timecodeBurnin") (clojure.core/assoc :timecode-burnin (deser-timecode-burnin (input "timecodeBurnin")))))

(clojure.core/defn- deser-prores-slow-pal [input] (clojure.core/get {"DISABLED" :disabled, "ENABLED" :enabled} input))

(clojure.core/defn- deser-hls-manifest-duration-format [input] (clojure.core/get {"FLOATING_POINT" :floating-point, "INTEGER" :integer} input))

(clojure.core/defn- deser-integer-min-negative-60-max-6 [input] input)

(clojure.core/defn- deser-dvb-subtitle-font-color [input] (clojure.core/get {"WHITE" :white, "BLACK" :black, "YELLOW" :yellow, "RED" :red, "GREEN" :green, "BLUE" :blue} input))

(clojure.core/defn- deser-reservation-plan [input] (clojure.core/cond-> {} (clojure.core/contains? input "commitment") (clojure.core/assoc :commitment (deser-commitment (input "commitment"))) (clojure.core/contains? input "expiresAt") (clojure.core/assoc :expires-at (deser-timestamp-unix (input "expiresAt"))) (clojure.core/contains? input "purchasedAt") (clojure.core/assoc :purchased-at (deser-timestamp-unix (input "purchasedAt"))) (clojure.core/contains? input "renewalType") (clojure.core/assoc :renewal-type (deser-renewal-type (input "renewalType"))) (clojure.core/contains? input "reservedSlots") (clojure.core/assoc :reserved-slots (deser-integer (input "reservedSlots"))) (clojure.core/contains? input "status") (clojure.core/assoc :status (deser-reservation-plan-status (input "status")))))

(clojure.core/defn- deser-output-sdt [input] (clojure.core/get {"SDT_FOLLOW" :sdt-follow, "SDT_FOLLOW_IF_PRESENT" :sdt-follow-if-present, "SDT_MANUAL" :sdt-manual, "SDT_NONE" :sdt-none} input))

(clojure.core/defn- deser-eac-3-dynamic-range-compression-line [input] (clojure.core/get {"NONE" :none, "FILM_STANDARD" :film-standard, "FILM_LIGHT" :film-light, "MUSIC_STANDARD" :music-standard, "MUSIC_LIGHT" :music-light, "SPEECH" :speech} input))

(clojure.core/defn- deser-output-detail [input] (clojure.core/cond-> {} (clojure.core/contains? input "durationInMs") (clojure.core/assoc :duration-in-ms (deser-integer (input "durationInMs"))) (clojure.core/contains? input "videoDetails") (clojure.core/assoc :video-details (deser-video-detail (input "videoDetails")))))

(clojure.core/defn- deser-integer-min-0-max-1000 [input] input)

(clojure.core/defn- deser-prores-framerate-conversion-algorithm [input] (clojure.core/get {"DUPLICATE_DROP" :duplicate-drop, "INTERPOLATE" :interpolate} input))

(clojure.core/defn- deser-h-264-adaptive-quantization [input] (clojure.core/get {"OFF" :off, "LOW" :low, "MEDIUM" :medium, "HIGH" :high, "HIGHER" :higher, "MAX" :max} input))

(clojure.core/defn- deser-noise-reducer-spatial-filter-settings [input] (clojure.core/cond-> {} (clojure.core/contains? input "postFilterSharpenStrength") (clojure.core/assoc :post-filter-sharpen-strength (deser-integer-min-0-max-3 (input "postFilterSharpenStrength"))) (clojure.core/contains? input "speed") (clojure.core/assoc :speed (deser-integer-min-negative-2-max-3 (input "speed"))) (clojure.core/contains? input "strength") (clojure.core/assoc :strength (deser-integer-min-0-max-16 (input "strength")))))

(clojure.core/defn- deser-drop-frame-timecode [input] (clojure.core/get {"DISABLED" :disabled, "ENABLED" :enabled} input))

(clojure.core/defn- deser-string-pattern-sn-manifest-confirm-condition-notification-ns [input] input)

(clojure.core/defn- deser-integer-min-25-max-2000 [input] input)

(clojure.core/defn- deser-timecode-burnin [input] (clojure.core/cond-> {} (clojure.core/contains? input "fontSize") (clojure.core/assoc :font-size (deser-integer-min-10-max-48 (input "fontSize"))) (clojure.core/contains? input "position") (clojure.core/assoc :position (deser-timecode-burnin-position (input "position"))) (clojure.core/contains? input "prefix") (clojure.core/assoc :prefix (deser-string-pattern (input "prefix")))))

(clojure.core/defn- deser-scc-destination-framerate [input] (clojure.core/get {"FRAMERATE_23_97" :framerate-23-97, "FRAMERATE_24" :framerate-24, "FRAMERATE_29_97_DROPFRAME" :framerate-29-97-dropframe, "FRAMERATE_29_97_NON_DROPFRAME" :framerate-29-97-non-dropframe} input))

(clojure.core/defn- deser-preset-settings [input] (clojure.core/cond-> {} (clojure.core/contains? input "audioDescriptions") (clojure.core/assoc :audio-descriptions (deser-list-of-audio-description (input "audioDescriptions"))) (clojure.core/contains? input "captionDescriptions") (clojure.core/assoc :caption-descriptions (deser-list-of-caption-description-preset (input "captionDescriptions"))) (clojure.core/contains? input "containerSettings") (clojure.core/assoc :container-settings (deser-container-settings (input "containerSettings"))) (clojure.core/contains? input "videoDescription") (clojure.core/assoc :video-description (deser-video-description (input "videoDescription")))))

(clojure.core/defn- deser-commitment [input] (clojure.core/get {"ONE_YEAR" :one-year} input))

(clojure.core/defn- deser-h-265-sample-adaptive-offset-filter-mode [input] (clojure.core/get {"DEFAULT" :default, "ADAPTIVE" :adaptive, "OFF" :off} input))

(clojure.core/defn- deser-ttml-destination-settings [input] (clojure.core/cond-> {} (clojure.core/contains? input "stylePassthrough") (clojure.core/assoc :style-passthrough (deser-ttml-style-passthrough (input "stylePassthrough")))))

(clojure.core/defn- deser-integer-min-1-max-4 [input] input)

(clojure.core/defn- deser-mpeg-2-framerate-conversion-algorithm [input] (clojure.core/get {"DUPLICATE_DROP" :duplicate-drop, "INTERPOLATE" :interpolate} input))

(clojure.core/defn- deser-integer-min-2-max-2147483647 [input] input)

(clojure.core/defn- deser-m-2ts-pcr-control [input] (clojure.core/get {"PCR_EVERY_PES_PACKET" :pcr-every-pes-packet, "CONFIGURED_PCR_PERIOD" :configured-pcr-period} input))

(clojure.core/defn- deser-mpeg-2-gop-size-units [input] (clojure.core/get {"FRAMES" :frames, "SECONDS" :seconds} input))

(clojure.core/defn- deser-string-pattern-sn-signal-processing-notification-ns [input] input)

(clojure.core/defn- deser-esam-signal-processing-notification [input] (clojure.core/cond-> {} (clojure.core/contains? input "sccXml") (clojure.core/assoc :scc-xml (deser-string-pattern-sn-signal-processing-notification-ns (input "sccXml")))))

(clojure.core/defn- deser-remix-settings [input] (clojure.core/cond-> {} (clojure.core/contains? input "channelMapping") (clojure.core/assoc :channel-mapping (deser-channel-mapping (input "channelMapping"))) (clojure.core/contains? input "channelsIn") (clojure.core/assoc :channels-in (deser-integer-min-1-max-16 (input "channelsIn"))) (clojure.core/contains? input "channelsOut") (clojure.core/assoc :channels-out (deser-integer-min-1-max-8 (input "channelsOut")))))

(clojure.core/defn- deser-font-script [input] (clojure.core/get {"AUTOMATIC" :automatic, "HANS" :hans, "HANT" :hant} input))

(clojure.core/defn- deser-integer-min-0-max-99 [input] input)

(clojure.core/defn- deser-dvb-tdt-settings [input] (clojure.core/cond-> {} (clojure.core/contains? input "tdtInterval") (clojure.core/assoc :tdt-interval (deser-integer-min-1000-max-30000 (input "tdtInterval")))))

(clojure.core/defn- deser-string-min-32-max-32-pattern-09a-faf-32 [input] input)

(clojure.core/defn- deser-cmaf-client-cache [input] (clojure.core/get {"DISABLED" :disabled, "ENABLED" :enabled} input))

(clojure.core/defn- deser-h-265-par-control [input] (clojure.core/get {"INITIALIZE_FROM_SOURCE" :initialize-from-source, "SPECIFIED" :specified} input))

(clojure.core/defn- deser-mpeg-2-adaptive-quantization [input] (clojure.core/get {"OFF" :off, "LOW" :low, "MEDIUM" :medium, "HIGH" :high} input))

(clojure.core/defn- deser-mov-padding-control [input] (clojure.core/get {"OMNEON" :omneon, "NONE" :none} input))

(clojure.core/defn- deser-prores-framerate-control [input] (clojure.core/get {"INITIALIZE_FROM_SOURCE" :initialize-from-source, "SPECIFIED" :specified} input))

(clojure.core/defn- deser-audio-normalization-algorithm-control [input] (clojure.core/get {"CORRECT_AUDIO" :correct-audio, "MEASURE_ONLY" :measure-only} input))

(clojure.core/defn- deser-map-of-audio-selector [input] (clojure.core/into {} (clojure.core/map (clojure.core/fn [[k v]] [(deser-string k) (deser-audio-selector v)])) input))

(clojure.core/defn- deser-string-pattern-arn-aws-us-gov-acm [input] input)

(clojure.core/defn- deser-ttml-style-passthrough [input] (clojure.core/get {"ENABLED" :enabled, "DISABLED" :disabled} input))

(clojure.core/defn- deser-h-264-temporal-adaptive-quantization [input] (clojure.core/get {"DISABLED" :disabled, "ENABLED" :enabled} input))

(clojure.core/defn- deser-insertable-image [input] (clojure.core/cond-> {} (clojure.core/contains? input "startTime") (clojure.core/assoc :start-time (deser-string-pattern-01-d-20305-d-205-d (input "startTime"))) (clojure.core/contains? input "opacity") (clojure.core/assoc :opacity (deser-integer-min-0-max-100 (input "opacity"))) (clojure.core/contains? input "imageX") (clojure.core/assoc :image-x (deser-integer-min-0-max-2147483647 (input "imageX"))) (clojure.core/contains? input "width") (clojure.core/assoc :width (deser-integer-min-0-max-2147483647 (input "width"))) (clojure.core/contains? input "layer") (clojure.core/assoc :layer (deser-integer-min-0-max-99 (input "layer"))) (clojure.core/contains? input "duration") (clojure.core/assoc :duration (deser-integer-min-0-max-2147483647 (input "duration"))) (clojure.core/contains? input "fadeIn") (clojure.core/assoc :fade-in (deser-integer-min-0-max-2147483647 (input "fadeIn"))) (clojure.core/contains? input "imageInserterInput") (clojure.core/assoc :image-inserter-input (deser-string-min-14-pattern-s-3-bmp-bmp-png-png-tga-tga (input "imageInserterInput"))) (clojure.core/contains? input "height") (clojure.core/assoc :height (deser-integer-min-0-max-2147483647 (input "height"))) (clojure.core/contains? input "imageY") (clojure.core/assoc :image-y (deser-integer-min-0-max-2147483647 (input "imageY"))) (clojure.core/contains? input "fadeOut") (clojure.core/assoc :fade-out (deser-integer-min-0-max-2147483647 (input "fadeOut")))))

(clojure.core/defn- deser-container-settings [input] (clojure.core/cond-> {} (clojure.core/contains? input "container") (clojure.core/assoc :container (deser-container-type (input "container"))) (clojure.core/contains? input "f4vSettings") (clojure.core/assoc :f-4v-settings (deser-f-4v-settings (input "f4vSettings"))) (clojure.core/contains? input "m2tsSettings") (clojure.core/assoc :m-2ts-settings (deser-m-2ts-settings (input "m2tsSettings"))) (clojure.core/contains? input "m3u8Settings") (clojure.core/assoc :m-3u-8-settings (deser-m-3u-8-settings (input "m3u8Settings"))) (clojure.core/contains? input "movSettings") (clojure.core/assoc :mov-settings (deser-mov-settings (input "movSettings"))) (clojure.core/contains? input "mp4Settings") (clojure.core/assoc :mp-4-settings (deser-mp-4-settings (input "mp4Settings")))))

(clojure.core/defn- deser-cmaf-codec-specification [input] (clojure.core/get {"RFC_6381" :rfc-6381, "RFC_4281" :rfc-4281} input))

(clojure.core/defn- deser-integer-min-1-max-1 [input] input)

(clojure.core/defn- deser-h-265-gop-b-reference [input] (clojure.core/get {"DISABLED" :disabled, "ENABLED" :enabled} input))

(clojure.core/defn- deser-h-265-temporal-adaptive-quantization [input] (clojure.core/get {"DISABLED" :disabled, "ENABLED" :enabled} input))

(clojure.core/defn- deser-audio-description [input] (clojure.core/cond-> {} (clojure.core/contains? input "customLanguageCode") (clojure.core/assoc :custom-language-code (deser-string-min-3-max-3-pattern-a-za-z-3 (input "customLanguageCode"))) (clojure.core/contains? input "streamName") (clojure.core/assoc :stream-name (deser-string-pattern-ws (input "streamName"))) (clojure.core/contains? input "remixSettings") (clojure.core/assoc :remix-settings (deser-remix-settings (input "remixSettings"))) (clojure.core/contains? input "audioType") (clojure.core/assoc :audio-type (deser-integer-min-0-max-255 (input "audioType"))) (clojure.core/contains? input "codecSettings") (clojure.core/assoc :codec-settings (deser-audio-codec-settings (input "codecSettings"))) (clojure.core/contains? input "languageCodeControl") (clojure.core/assoc :language-code-control (deser-audio-language-code-control (input "languageCodeControl"))) (clojure.core/contains? input "audioTypeControl") (clojure.core/assoc :audio-type-control (deser-audio-type-control (input "audioTypeControl"))) (clojure.core/contains? input "languageCode") (clojure.core/assoc :language-code (deser-language-code (input "languageCode"))) (clojure.core/contains? input "audioSourceName") (clojure.core/assoc :audio-source-name (deser-string (input "audioSourceName"))) (clojure.core/contains? input "audioNormalizationSettings") (clojure.core/assoc :audio-normalization-settings (deser-audio-normalization-settings (input "audioNormalizationSettings")))))

(clojure.core/defn- deser-job-status [input] (clojure.core/get {"SUBMITTED" :submitted, "PROGRESSING" :progressing, "COMPLETE" :complete, "CANCELED" :canceled, "ERROR" :error} input))

(clojure.core/defn- deser-aac-vbr-quality [input] (clojure.core/get {"LOW" :low, "MEDIUM_LOW" :medium-low, "MEDIUM_HIGH" :medium-high, "HIGH" :high} input))

(clojure.core/defn- deser-deinterlacer-control [input] (clojure.core/get {"FORCE_ALL_FRAMES" :force-all-frames, "NORMAL" :normal} input))

(clojure.core/defn- deser-string-min-11-max-11-pattern-01-d-20305-d-205-d [input] input)

(clojure.core/defn- deser-track-source-settings [input] (clojure.core/cond-> {} (clojure.core/contains? input "trackNumber") (clojure.core/assoc :track-number (deser-integer-min-1-max-2147483647 (input "trackNumber")))))

(clojure.core/defn- deser-h-265-codec-level [input] (clojure.core/get {"LEVEL_2_1" :level-2-1, "LEVEL_5" :level-5, "LEVEL_1" :level-1, "AUTO" :auto, "LEVEL_4_1" :level-4-1, "LEVEL_5_1" :level-5-1, "LEVEL_5_2" :level-5-2, "LEVEL_4" :level-4, "LEVEL_2" :level-2, "LEVEL_3" :level-3, "LEVEL_6_2" :level-6-2, "LEVEL_6" :level-6, "LEVEL_6_1" :level-6-1, "LEVEL_3_1" :level-3-1} input))

(clojure.core/defn- deser-string-pattern-ws [input] input)

(clojure.core/defn- deser-m-3u-8-pcr-control [input] (clojure.core/get {"PCR_EVERY_PES_PACKET" :pcr-every-pes-packet, "CONFIGURED_PCR_PERIOD" :configured-pcr-period} input))

(clojure.core/defn- deser-integer-min-32-max-8182 [input] input)

(clojure.core/defn- deser-scc-destination-settings [input] (clojure.core/cond-> {} (clojure.core/contains? input "framerate") (clojure.core/assoc :framerate (deser-scc-destination-framerate (input "framerate")))))

(clojure.core/defn- deser-list-of-id-3-insertion [input] (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (deser-id-3-insertion coll))) input))

(clojure.core/defn- deser-type [input] (clojure.core/get {"SYSTEM" :system, "CUSTOM" :custom} input))

(clojure.core/defn- deser-h-264-slow-pal [input] (clojure.core/get {"DISABLED" :disabled, "ENABLED" :enabled} input))

(clojure.core/defn- deser-m-2ts-audio-buffer-model [input] (clojure.core/get {"DVB" :dvb, "ATSC" :atsc} input))

(clojure.core/defn- deser-h-265-unregistered-sei-timecode [input] (clojure.core/get {"DISABLED" :disabled, "ENABLED" :enabled} input))

(clojure.core/defn- deser-hls-audio-track-type [input] (clojure.core/get {"ALTERNATE_AUDIO_AUTO_SELECT_DEFAULT" :alternate-audio-auto-select-default, "ALTERNATE_AUDIO_AUTO_SELECT" :alternate-audio-auto-select, "ALTERNATE_AUDIO_NOT_AUTO_SELECT" :alternate-audio-not-auto-select, "AUDIO_ONLY_VARIANT_STREAM" :audio-only-variant-stream} input))

(clojure.core/defn- deser-h-264-gop-size-units [input] (clojure.core/get {"FRAMES" :frames, "SECONDS" :seconds} input))

(clojure.core/defn- deser-hls-directory-structure [input] (clojure.core/get {"SINGLE_DIRECTORY" :single-directory, "SUBDIRECTORY_PER_STREAM" :subdirectory-per-stream} input))

(clojure.core/defn- deser-m-2ts-ebp-placement [input] (clojure.core/get {"VIDEO_AND_AUDIO_PIDS" :video-and-audio-pids, "VIDEO_PID" :video-pid} input))

(clojure.core/defn- deser-h-265-tiles [input] (clojure.core/get {"DISABLED" :disabled, "ENABLED" :enabled} input))

(clojure.core/defn- deser-deinterlacer-mode [input] (clojure.core/get {"DEINTERLACE" :deinterlace, "INVERSE_TELECINE" :inverse-telecine, "ADAPTIVE" :adaptive} input))

(clojure.core/defn- deser-motion-image-insertion-offset [input] (clojure.core/cond-> {} (clojure.core/contains? input "imageX") (clojure.core/assoc :image-x (deser-integer-min-0-max-2147483647 (input "imageX"))) (clojure.core/contains? input "imageY") (clojure.core/assoc :image-y (deser-integer-min-0-max-2147483647 (input "imageY")))))

(clojure.core/defn- deser-eac-3-settings [input] (clojure.core/cond-> {} (clojure.core/contains? input "ltRtSurroundMixLevel") (clojure.core/assoc :lt-rt-surround-mix-level (deser-double-min-negative-60-max-negative-1 (input "ltRtSurroundMixLevel"))) (clojure.core/contains? input "codingMode") (clojure.core/assoc :coding-mode (deser-eac-3-coding-mode (input "codingMode"))) (clojure.core/contains? input "phaseControl") (clojure.core/assoc :phase-control (deser-eac-3-phase-control (input "phaseControl"))) (clojure.core/contains? input "sampleRate") (clojure.core/assoc :sample-rate (deser-integer-min-48000-max-48000 (input "sampleRate"))) (clojure.core/contains? input "passthroughControl") (clojure.core/assoc :passthrough-control (deser-eac-3-passthrough-control (input "passthroughControl"))) (clojure.core/contains? input "dynamicRangeCompressionLine") (clojure.core/assoc :dynamic-range-compression-line (deser-eac-3-dynamic-range-compression-line (input "dynamicRangeCompressionLine"))) (clojure.core/contains? input "surroundMode") (clojure.core/assoc :surround-mode (deser-eac-3-surround-mode (input "surroundMode"))) (clojure.core/contains? input "attenuationControl") (clojure.core/assoc :attenuation-control (deser-eac-3-attenuation-control (input "attenuationControl"))) (clojure.core/contains? input "dcFilter") (clojure.core/assoc :dc-filter (deser-eac-3-dc-filter (input "dcFilter"))) (clojure.core/contains? input "lfeFilter") (clojure.core/assoc :lfe-filter (deser-eac-3-lfe-filter (input "lfeFilter"))) (clojure.core/contains? input "lfeControl") (clojure.core/assoc :lfe-control (deser-eac-3-lfe-control (input "lfeControl"))) (clojure.core/contains? input "loRoCenterMixLevel") (clojure.core/assoc :lo-ro-center-mix-level (deser-double-min-negative-60-max-3 (input "loRoCenterMixLevel"))) (clojure.core/contains? input "stereoDownmix") (clojure.core/assoc :stereo-downmix (deser-eac-3-stereo-downmix (input "stereoDownmix"))) (clojure.core/contains? input "ltRtCenterMixLevel") (clojure.core/assoc :lt-rt-center-mix-level (deser-double-min-negative-60-max-3 (input "ltRtCenterMixLevel"))) (clojure.core/contains? input "surroundExMode") (clojure.core/assoc :surround-ex-mode (deser-eac-3-surround-ex-mode (input "surroundExMode"))) (clojure.core/contains? input "metadataControl") (clojure.core/assoc :metadata-control (deser-eac-3-metadata-control (input "metadataControl"))) (clojure.core/contains? input "loRoSurroundMixLevel") (clojure.core/assoc :lo-ro-surround-mix-level (deser-double-min-negative-60-max-negative-1 (input "loRoSurroundMixLevel"))) (clojure.core/contains? input "bitstreamMode") (clojure.core/assoc :bitstream-mode (deser-eac-3-bitstream-mode (input "bitstreamMode"))) (clojure.core/contains? input "dialnorm") (clojure.core/assoc :dialnorm (deser-integer-min-1-max-31 (input "dialnorm"))) (clojure.core/contains? input "dynamicRangeCompressionRf") (clojure.core/assoc :dynamic-range-compression-rf (deser-eac-3-dynamic-range-compression-rf (input "dynamicRangeCompressionRf"))) (clojure.core/contains? input "bitrate") (clojure.core/assoc :bitrate (deser-integer-min-64000-max-640000 (input "bitrate")))))

(clojure.core/defn- deser-cmaf-segment-control [input] (clojure.core/get {"SINGLE_FILE" :single-file, "SEGMENTED_FILES" :segmented-files} input))

(clojure.core/defn- deser-caption-destination-type [input] (clojure.core/get {"EMBEDDED_PLUS_SCTE20" :embedded-plus-scte-20, "SCC" :scc, "SRT" :srt, "SCTE20_PLUS_EMBEDDED" :scte-20-plus-embedded, "TELETEXT" :teletext, "DVB_SUB" :dvb-sub, "SMI" :smi, "BURN_IN" :burn-in, "WEBVTT" :webvtt, "EMBEDDED" :embedded, "TTML" :ttml} input))

(clojure.core/defn- deser-hls-key-provider-type [input] (clojure.core/get {"SPEKE" :speke, "STATIC_KEY" :static-key} input))

(clojure.core/defn- deser-h-264-dynamic-sub-gop [input] (clojure.core/get {"ADAPTIVE" :adaptive, "STATIC" :static} input))

(clojure.core/defn- deser-audio-normalization-algorithm [input] (clojure.core/get {"ITU_BS_1770_1" :itu-bs-1770-1, "ITU_BS_1770_2" :itu-bs-1770-2} input))

(clojure.core/defn- deser-cmaf-encryption-type [input] (clojure.core/get {"SAMPLE_AES" :sample-aes} input))

(clojure.core/defn- deser-hls-i-frame-only-manifest [input] (clojure.core/get {"INCLUDE" :include, "EXCLUDE" :exclude} input))

(clojure.core/defn- deser-mp-4-moov-placement [input] (clojure.core/get {"PROGRESSIVE_DOWNLOAD" :progressive-download, "NORMAL" :normal} input))

(clojure.core/defn- deser-string-pattern-s-3-mm-2-vvmmppeeggaavviimmpp-4-ffllvvmmppttmmppggmm-4-vvttrrppff-4-vvmm-2-ttssttss-264-hh-264-mmkkvvmmoovvmmttssmm-2-ttwwmmvvaassffvvoobb-3-ggpp-3-ggppppmmxxffddiivvxxxxvviiddrraawwddvvggxxffmm-1-vv-3-gg-2-vvmmffmm-3-uu-8-llcchhggxxffmmppeegg-2-mmxxffmmppeegg-2-mmxxffhhddwwaavvyy-4-mmxxmmll [input] input)

(clojure.core/defn- deser-job-template-settings [input] (clojure.core/cond-> {} (clojure.core/contains? input "esam") (clojure.core/assoc :esam (deser-esam-settings (input "esam"))) (clojure.core/contains? input "inputs") (clojure.core/assoc :inputs (deser-list-of-input-template (input "inputs"))) (clojure.core/contains? input "timedMetadataInsertion") (clojure.core/assoc :timed-metadata-insertion (deser-timed-metadata-insertion (input "timedMetadataInsertion"))) (clojure.core/contains? input "motionImageInserter") (clojure.core/assoc :motion-image-inserter (deser-motion-image-inserter (input "motionImageInserter"))) (clojure.core/contains? input "timecodeConfig") (clojure.core/assoc :timecode-config (deser-timecode-config (input "timecodeConfig"))) (clojure.core/contains? input "adAvailOffset") (clojure.core/assoc :ad-avail-offset (deser-integer-min-negative-1000-max-1000 (input "adAvailOffset"))) (clojure.core/contains? input "outputGroups") (clojure.core/assoc :output-groups (deser-list-of-output-group (input "outputGroups"))) (clojure.core/contains? input "nielsenConfiguration") (clojure.core/assoc :nielsen-configuration (deser-nielsen-configuration (input "nielsenConfiguration"))) (clojure.core/contains? input "availBlanking") (clojure.core/assoc :avail-blanking (deser-avail-blanking (input "availBlanking")))))

(clojure.core/defn- deser-integer-min-0-max-500 [input] input)

(clojure.core/defn- deser-string-min-14-pattern-s-3-scc-scc-ttml-ttml-dfxp-dfxp-stl-stl-srt-srt-smi-smi [input] input)

(clojure.core/defn- deser-h-264-repeat-pps [input] (clojure.core/get {"DISABLED" :disabled, "ENABLED" :enabled} input))

(clojure.core/defn- deser-cmaf-manifest-compression [input] (clojure.core/get {"GZIP" :gzip, "NONE" :none} input))

(clojure.core/defn- deser-mpeg-2-interlace-mode [input] (clojure.core/get {"PROGRESSIVE" :progressive, "TOP_FIELD" :top-field, "BOTTOM_FIELD" :bottom-field, "FOLLOW_TOP_FIELD" :follow-top-field, "FOLLOW_BOTTOM_FIELD" :follow-bottom-field} input))

(clojure.core/defn- deser-h-264-telecine [input] (clojure.core/get {"NONE" :none, "SOFT" :soft, "HARD" :hard} input))

(clojure.core/defn- deser-integer-min-1000-max-288000000 [input] input)

(clojure.core/defn- deser-integer-min-0-max-30000 [input] input)

(clojure.core/defn- deser-esam-manifest-confirm-condition-notification [input] (clojure.core/cond-> {} (clojure.core/contains? input "mccXml") (clojure.core/assoc :mcc-xml (deser-string-pattern-sn-manifest-confirm-condition-notification-ns (input "mccXml")))))

(clojure.core/defn- deser-container-type [input] (clojure.core/get {"MOV" :mov, "MP4" :mp-4, "F4V" :f-4-v, "ISMV" :ismv, "MXF" :mxf, "MPD" :mpd, "RAW" :raw, "M3U8" :m-3-u-8, "CMFC" :cmfc, "M2TS" :m-2-ts} input))

(clojure.core/defn- deser-integer-min-0-max-1152000000 [input] input)

(clojure.core/defn- deser-dvb-sdt-settings [input] (clojure.core/cond-> {} (clojure.core/contains? input "outputSdt") (clojure.core/assoc :output-sdt (deser-output-sdt (input "outputSdt"))) (clojure.core/contains? input "sdtInterval") (clojure.core/assoc :sdt-interval (deser-integer-min-25-max-2000 (input "sdtInterval"))) (clojure.core/contains? input "serviceName") (clojure.core/assoc :service-name (deser-string-min-1-max-256 (input "serviceName"))) (clojure.core/contains? input "serviceProviderName") (clojure.core/assoc :service-provider-name (deser-string-min-1-max-256 (input "serviceProviderName")))))

(clojure.core/defn- deser-dvb-subtitle-outline-color [input] (clojure.core/get {"BLACK" :black, "WHITE" :white, "YELLOW" :yellow, "RED" :red, "GREEN" :green, "BLUE" :blue} input))

(clojure.core/defn- deser-cmaf-stream-inf-resolution [input] (clojure.core/get {"INCLUDE" :include, "EXCLUDE" :exclude} input))

(clojure.core/defn- deser-h-265-adaptive-quantization [input] (clojure.core/get {"OFF" :off, "LOW" :low, "MEDIUM" :medium, "HIGH" :high, "HIGHER" :higher, "MAX" :max} input))

(clojure.core/defn- deser-string-min-24-max-512-pattern-a-za-z-0902 [input] input)

(clojure.core/defn- deser-hls-offline-encrypted [input] (clojure.core/get {"ENABLED" :enabled, "DISABLED" :disabled} input))

(clojure.core/defn- deser-hls-settings [input] (clojure.core/cond-> {} (clojure.core/contains? input "audioGroupId") (clojure.core/assoc :audio-group-id (deser-string (input "audioGroupId"))) (clojure.core/contains? input "audioRenditionSets") (clojure.core/assoc :audio-rendition-sets (deser-string (input "audioRenditionSets"))) (clojure.core/contains? input "audioTrackType") (clojure.core/assoc :audio-track-type (deser-hls-audio-track-type (input "audioTrackType"))) (clojure.core/contains? input "iFrameOnlyManifest") (clojure.core/assoc :i-frame-only-manifest (deser-hls-i-frame-only-manifest (input "iFrameOnlyManifest"))) (clojure.core/contains? input "segmentModifier") (clojure.core/assoc :segment-modifier (deser-string (input "segmentModifier")))))

(clojure.core/defn- deser-ac-3-lfe-filter [input] (clojure.core/get {"ENABLED" :enabled, "DISABLED" :disabled} input))

(clojure.core/defn- deser-list-of-endpoint [input] (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (deser-endpoint coll))) input))

(clojure.core/defn- deser-string-pattern-01-d-20305-d-205-d [input] input)

(clojure.core/defn- deser-integer-min-0-max-9 [input] input)

(clojure.core/defn- deser-resource-tags [input] (clojure.core/cond-> {} (clojure.core/contains? input "arn") (clojure.core/assoc :arn (deser-string (input "arn"))) (clojure.core/contains? input "tags") (clojure.core/assoc :tags (deser-map-of-string (input "tags")))))

(clojure.core/defn- deser-mpeg-2-codec-level [input] (clojure.core/get {"AUTO" :auto, "LOW" :low, "MAIN" :main, "HIGH1440" :high-1440, "HIGH" :high} input))

(clojure.core/defn- deser-mpeg-2-rate-control-mode [input] (clojure.core/get {"VBR" :vbr, "CBR" :cbr} input))

(clojure.core/defn- deser-aiff-settings [input] (clojure.core/cond-> {} (clojure.core/contains? input "bitDepth") (clojure.core/assoc :bit-depth (deser-integer-min-16-max-24 (input "bitDepth"))) (clojure.core/contains? input "channels") (clojure.core/assoc :channels (deser-integer-min-1-max-2 (input "channels"))) (clojure.core/contains? input "sampleRate") (clojure.core/assoc :sample-rate (deser-integer-min-8000-max-192000 (input "sampleRate")))))

(clojure.core/defn- deser-queue [input] (clojure.core/cond-> {:name (deser-string (input "name"))} (clojure.core/contains? input "reservationPlan") (clojure.core/assoc :reservation-plan (deser-reservation-plan (input "reservationPlan"))) (clojure.core/contains? input "type") (clojure.core/assoc :type (deser-type (input "type"))) (clojure.core/contains? input "submittedJobsCount") (clojure.core/assoc :submitted-jobs-count (deser-integer (input "submittedJobsCount"))) (clojure.core/contains? input "pricingPlan") (clojure.core/assoc :pricing-plan (deser-pricing-plan (input "pricingPlan"))) (clojure.core/contains? input "status") (clojure.core/assoc :status (deser-queue-status (input "status"))) (clojure.core/contains? input "progressingJobsCount") (clojure.core/assoc :progressing-jobs-count (deser-integer (input "progressingJobsCount"))) (clojure.core/contains? input "description") (clojure.core/assoc :description (deser-string (input "description"))) (clojure.core/contains? input "arn") (clojure.core/assoc :arn (deser-string (input "arn"))) (clojure.core/contains? input "createdAt") (clojure.core/assoc :created-at (deser-timestamp-unix (input "createdAt"))) (clojure.core/contains? input "lastUpdated") (clojure.core/assoc :last-updated (deser-timestamp-unix (input "lastUpdated")))))

(clojure.core/defn- deser-hls-stream-inf-resolution [input] (clojure.core/get {"INCLUDE" :include, "EXCLUDE" :exclude} input))

(clojure.core/defn- deser-h-264-field-encoding [input] (clojure.core/get {"PAFF" :paff, "FORCE_FIELD" :force-field} input))

(clojure.core/defn- deser-string-pattern-0940191020191209301 [input] input)

(clojure.core/defn- deser-integer-min-0-max-47185920 [input] input)

(clojure.core/defn- deser-hls-caption-language-setting [input] (clojure.core/get {"INSERT" :insert, "OMIT" :omit, "NONE" :none} input))

(clojure.core/defn- deser-m-2ts-settings [input] (clojure.core/cond-> {} (clojure.core/contains? input "patInterval") (clojure.core/assoc :pat-interval (deser-integer-min-0-max-1000 (input "patInterval"))) (clojure.core/contains? input "scte35Source") (clojure.core/assoc :scte-35-source (deser-m-2ts-scte-35-source (input "scte35Source"))) (clojure.core/contains? input "bufferModel") (clojure.core/assoc :buffer-model (deser-m-2ts-buffer-model (input "bufferModel"))) (clojure.core/contains? input "dvbTdtSettings") (clojure.core/assoc :dvb-tdt-settings (deser-dvb-tdt-settings (input "dvbTdtSettings"))) (clojure.core/contains? input "audioFramesPerPes") (clojure.core/assoc :audio-frames-per-pes (deser-integer-min-0-max-2147483647 (input "audioFramesPerPes"))) (clojure.core/contains? input "fragmentTime") (clojure.core/assoc :fragment-time (deser-double-min-0 (input "fragmentTime"))) (clojure.core/contains? input "transportStreamId") (clojure.core/assoc :transport-stream-id (deser-integer-min-0-max-65535 (input "transportStreamId"))) (clojure.core/contains? input "dvbSdtSettings") (clojure.core/assoc :dvb-sdt-settings (deser-dvb-sdt-settings (input "dvbSdtSettings"))) (clojure.core/contains? input "pcrControl") (clojure.core/assoc :pcr-control (deser-m-2ts-pcr-control (input "pcrControl"))) (clojure.core/contains? input "scte35Pid") (clojure.core/assoc :scte-35-pid (deser-integer-min-32-max-8182 (input "scte35Pid"))) (clojure.core/contains? input "minEbpInterval") (clojure.core/assoc :min-ebp-interval (deser-integer-min-0-max-10000 (input "minEbpInterval"))) (clojure.core/contains? input "programNumber") (clojure.core/assoc :program-number (deser-integer-min-0-max-65535 (input "programNumber"))) (clojure.core/contains? input "pcrPid") (clojure.core/assoc :pcr-pid (deser-integer-min-32-max-8182 (input "pcrPid"))) (clojure.core/contains? input "pmtPid") (clojure.core/assoc :pmt-pid (deser-integer-min-32-max-8182 (input "pmtPid"))) (clojure.core/contains? input "videoPid") (clojure.core/assoc :video-pid (deser-integer-min-32-max-8182 (input "videoPid"))) (clojure.core/contains? input "rateMode") (clojure.core/assoc :rate-mode (deser-m-2ts-rate-mode (input "rateMode"))) (clojure.core/contains? input "audioPids") (clojure.core/assoc :audio-pids (deser-list-of-integer-min-32-max-8182 (input "audioPids"))) (clojure.core/contains? input "nielsenId3") (clojure.core/assoc :nielsen-id-3 (deser-m-2ts-nielsen-id-3 (input "nielsenId3"))) (clojure.core/contains? input "maxPcrInterval") (clojure.core/assoc :max-pcr-interval (deser-integer-min-0-max-500 (input "maxPcrInterval"))) (clojure.core/contains? input "pmtInterval") (clojure.core/assoc :pmt-interval (deser-integer-min-0-max-1000 (input "pmtInterval"))) (clojure.core/contains? input "segmentationStyle") (clojure.core/assoc :segmentation-style (deser-m-2ts-segmentation-style (input "segmentationStyle"))) (clojure.core/contains? input "nullPacketBitrate") (clojure.core/assoc :null-packet-bitrate (deser-double-min-0 (input "nullPacketBitrate"))) (clojure.core/contains? input "segmentationMarkers") (clojure.core/assoc :segmentation-markers (deser-m-2ts-segmentation-markers (input "segmentationMarkers"))) (clojure.core/contains? input "ebpPlacement") (clojure.core/assoc :ebp-placement (deser-m-2ts-ebp-placement (input "ebpPlacement"))) (clojure.core/contains? input "audioBufferModel") (clojure.core/assoc :audio-buffer-model (deser-m-2ts-audio-buffer-model (input "audioBufferModel"))) (clojure.core/contains? input "esRateInPes") (clojure.core/assoc :es-rate-in-pes (deser-m-2ts-es-rate-in-pes (input "esRateInPes"))) (clojure.core/contains? input "timedMetadataPid") (clojure.core/assoc :timed-metadata-pid (deser-integer-min-32-max-8182 (input "timedMetadataPid"))) (clojure.core/contains? input "forceTsVideoEbpOrder") (clojure.core/assoc :force-ts-video-ebp-order (deser-m-2ts-force-ts-video-ebp-order (input "forceTsVideoEbpOrder"))) (clojure.core/contains? input "scte35Esam") (clojure.core/assoc :scte-35-esam (deser-m-2ts-scte-35-esam (input "scte35Esam"))) (clojure.core/contains? input "dvbSubPids") (clojure.core/assoc :dvb-sub-pids (deser-list-of-integer-min-32-max-8182 (input "dvbSubPids"))) (clojure.core/contains? input "ebpAudioInterval") (clojure.core/assoc :ebp-audio-interval (deser-m-2ts-ebp-audio-interval (input "ebpAudioInterval"))) (clojure.core/contains? input "dvbNitSettings") (clojure.core/assoc :dvb-nit-settings (deser-dvb-nit-settings (input "dvbNitSettings"))) (clojure.core/contains? input "privateMetadataPid") (clojure.core/assoc :private-metadata-pid (deser-integer-min-32-max-8182 (input "privateMetadataPid"))) (clojure.core/contains? input "dvbTeletextPid") (clojure.core/assoc :dvb-teletext-pid (deser-integer-min-32-max-8182 (input "dvbTeletextPid"))) (clojure.core/contains? input "bitrate") (clojure.core/assoc :bitrate (deser-integer-min-0-max-2147483647 (input "bitrate"))) (clojure.core/contains? input "segmentationTime") (clojure.core/assoc :segmentation-time (deser-double-min-0 (input "segmentationTime")))))

(clojure.core/defn- deser-string [input] input)

(clojure.core/defn- deser-dvb-sub-source-settings [input] (clojure.core/cond-> {} (clojure.core/contains? input "pid") (clojure.core/assoc :pid (deser-integer-min-1-max-2147483647 (input "pid")))))

(clojure.core/defn- deser-input-denoise-filter [input] (clojure.core/get {"ENABLED" :enabled, "DISABLED" :disabled} input))

(clojure.core/defn- deser-audio-selector-type [input] (clojure.core/get {"PID" :pid, "TRACK" :track, "LANGUAGE_CODE" :language-code} input))

(clojure.core/defn- deser-mpeg-2-framerate-control [input] (clojure.core/get {"INITIALIZE_FROM_SOURCE" :initialize-from-source, "SPECIFIED" :specified} input))

(clojure.core/defn- deser-afd-signaling [input] (clojure.core/get {"NONE" :none, "AUTO" :auto, "FIXED" :fixed} input))

(clojure.core/defn- deser-pricing-plan [input] (clojure.core/get {"ON_DEMAND" :on-demand, "RESERVED" :reserved} input))

(clojure.core/defn- deser-eac-3-metadata-control [input] (clojure.core/get {"FOLLOW_INPUT" :follow-input, "USE_CONFIGURED" :use-configured} input))

(clojure.core/defn- deser-integer-min-0-max-65535 [input] input)

(clojure.core/defn- deser-integer-min-8000-max-192000 [input] input)

(clojure.core/defn- deser-h-264-quality-tuning-level [input] (clojure.core/get {"SINGLE_PASS" :single-pass, "SINGLE_PASS_HQ" :single-pass-hq, "MULTI_PASS_HQ" :multi-pass-hq} input))

(clojure.core/defn- deser-m-3u-8-scte-35-source [input] (clojure.core/get {"PASSTHROUGH" :passthrough, "NONE" :none} input))

(clojure.core/defn- deser-noise-reducer-filter [input] (clojure.core/get {"BILATERAL" :bilateral, "MEAN" :mean, "GAUSSIAN" :gaussian, "LANCZOS" :lanczos, "SHARPEN" :sharpen, "CONSERVE" :conserve, "SPATIAL" :spatial} input))

(clojure.core/defn- deser-integer-min-0-max-2147483647 [input] input)

(clojure.core/defn- deser-integer-min-6000-max-1024000 [input] input)

(clojure.core/defn- deser-cmaf-group-settings [input] (clojure.core/cond-> {} (clojure.core/contains? input "segmentLength") (clojure.core/assoc :segment-length (deser-integer-min-1-max-2147483647 (input "segmentLength"))) (clojure.core/contains? input "minBufferTime") (clojure.core/assoc :min-buffer-time (deser-integer-min-0-max-2147483647 (input "minBufferTime"))) (clojure.core/contains? input "fragmentLength") (clojure.core/assoc :fragment-length (deser-integer-min-1-max-2147483647 (input "fragmentLength"))) (clojure.core/contains? input "segmentControl") (clojure.core/assoc :segment-control (deser-cmaf-segment-control (input "segmentControl"))) (clojure.core/contains? input "writeHlsManifest") (clojure.core/assoc :write-hls-manifest (deser-cmaf-write-hls-manifest (input "writeHlsManifest"))) (clojure.core/contains? input "baseUrl") (clojure.core/assoc :base-url (deser-string (input "baseUrl"))) (clojure.core/contains? input "destination") (clojure.core/assoc :destination (deser-string-pattern-s-3 (input "destination"))) (clojure.core/contains? input "minFinalSegmentLength") (clojure.core/assoc :min-final-segment-length (deser-double-min-0-max-2147483647 (input "minFinalSegmentLength"))) (clojure.core/contains? input "streamInfResolution") (clojure.core/assoc :stream-inf-resolution (deser-cmaf-stream-inf-resolution (input "streamInfResolution"))) (clojure.core/contains? input "manifestDurationFormat") (clojure.core/assoc :manifest-duration-format (deser-cmaf-manifest-duration-format (input "manifestDurationFormat"))) (clojure.core/contains? input "writeDashManifest") (clojure.core/assoc :write-dash-manifest (deser-cmaf-write-dash-manifest (input "writeDashManifest"))) (clojure.core/contains? input "manifestCompression") (clojure.core/assoc :manifest-compression (deser-cmaf-manifest-compression (input "manifestCompression"))) (clojure.core/contains? input "encryption") (clojure.core/assoc :encryption (deser-cmaf-encryption-settings (input "encryption"))) (clojure.core/contains? input "codecSpecification") (clojure.core/assoc :codec-specification (deser-cmaf-codec-specification (input "codecSpecification"))) (clojure.core/contains? input "clientCache") (clojure.core/assoc :client-cache (deser-cmaf-client-cache (input "clientCache")))))

(clojure.core/defn- deser-h-265-qvbr-settings [input] (clojure.core/cond-> {} (clojure.core/contains? input "maxAverageBitrate") (clojure.core/assoc :max-average-bitrate (deser-integer-min-1000-max-1466400000 (input "maxAverageBitrate"))) (clojure.core/contains? input "qvbrQualityLevel") (clojure.core/assoc :qvbr-quality-level (deser-integer-min-1-max-10 (input "qvbrQualityLevel")))))

(clojure.core/defn- deser-list-of-output-group [input] (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (deser-output-group coll))) input))

(clojure.core/defn- deser-list-of-caption-description-preset [input] (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (deser-caption-description-preset coll))) input))

(clojure.core/defn- deser-motion-image-insertion-mode [input] (clojure.core/get {"MOV" :mov, "PNG" :png} input))

(clojure.core/defn- deser-renewal-type [input] (clojure.core/get {"AUTO_RENEW" :auto-renew, "EXPIRE" :expire} input))

(clojure.core/defn- deser-integer-min-1-max-100 [input] input)

(clojure.core/defn- deser-eac-3-lfe-control [input] (clojure.core/get {"LFE" :lfe, "NO_LFE" :no-lfe} input))

(clojure.core/defn- deser-prores-codec-profile [input] (clojure.core/get {"APPLE_PRORES_422" :apple-prores-422, "APPLE_PRORES_422_HQ" :apple-prores-422-hq, "APPLE_PRORES_422_LT" :apple-prores-422-lt, "APPLE_PRORES_422_PROXY" :apple-prores-422-proxy} input))

(clojure.core/defn- deser-teletext-source-settings [input] (clojure.core/cond-> {} (clojure.core/contains? input "pageNumber") (clojure.core/assoc :page-number (deser-string-min-3-max-3-pattern-1809a-faf-09a-eae (input "pageNumber")))))

(clojure.core/defn- deser-caption-description-preset [input] (clojure.core/cond-> {} (clojure.core/contains? input "customLanguageCode") (clojure.core/assoc :custom-language-code (deser-string-min-3-max-3-pattern-a-za-z-3 (input "customLanguageCode"))) (clojure.core/contains? input "destinationSettings") (clojure.core/assoc :destination-settings (deser-caption-destination-settings (input "destinationSettings"))) (clojure.core/contains? input "languageCode") (clojure.core/assoc :language-code (deser-language-code (input "languageCode"))) (clojure.core/contains? input "languageDescription") (clojure.core/assoc :language-description (deser-string (input "languageDescription")))))

(clojure.core/defn- deser-video-detail [input] (clojure.core/cond-> {} (clojure.core/contains? input "heightInPx") (clojure.core/assoc :height-in-px (deser-integer (input "heightInPx"))) (clojure.core/contains? input "widthInPx") (clojure.core/assoc :width-in-px (deser-integer (input "widthInPx")))))

(clojure.core/defn- deser-h-264-flicker-adaptive-quantization [input] (clojure.core/get {"DISABLED" :disabled, "ENABLED" :enabled} input))

(clojure.core/defn- deser-h-265-slow-pal [input] (clojure.core/get {"DISABLED" :disabled, "ENABLED" :enabled} input))

(clojure.core/defn- deser-eac-3-surround-mode [input] (clojure.core/get {"NOT_INDICATED" :not-indicated, "ENABLED" :enabled, "DISABLED" :disabled} input))

(clojure.core/defn- deser-string-min-0 [input] input)

(clojure.core/defn- deser-hls-caption-language-mapping [input] (clojure.core/cond-> {} (clojure.core/contains? input "captionChannel") (clojure.core/assoc :caption-channel (deser-integer-min-negative-2147483648-max-2147483647 (input "captionChannel"))) (clojure.core/contains? input "customLanguageCode") (clojure.core/assoc :custom-language-code (deser-string-min-3-max-3-pattern-a-za-z-3 (input "customLanguageCode"))) (clojure.core/contains? input "languageCode") (clojure.core/assoc :language-code (deser-language-code (input "languageCode"))) (clojure.core/contains? input "languageDescription") (clojure.core/assoc :language-description (deser-string (input "languageDescription")))))

(clojure.core/defn- deser-mpeg-2-syntax [input] (clojure.core/get {"DEFAULT" :default, "D_10" :d-10} input))

(clojure.core/defn- deser-h-264-codec-profile [input] (clojure.core/get {"BASELINE" :baseline, "HIGH" :high, "HIGH_10BIT" :high-10-bit, "HIGH_422" :high-422, "HIGH_422_10BIT" :high-422-10-bit, "MAIN" :main} input))

(clojure.core/defn- deser-h-265-telecine [input] (clojure.core/get {"NONE" :none, "SOFT" :soft, "HARD" :hard} input))

(clojure.core/defn- deser-list-of-insertable-image [input] (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (deser-insertable-image coll))) input))

(clojure.core/defn- deser-wav-format [input] (clojure.core/get {"RIFF" :riff, "RF64" :rf-64} input))

(clojure.core/defn- deser-list-of-output-channel-mapping [input] (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (deser-output-channel-mapping coll))) input))

(clojure.core/defn- deser-h-264-unregistered-sei-timecode [input] (clojure.core/get {"DISABLED" :disabled, "ENABLED" :enabled} input))

(clojure.core/defn- deser-string-pattern-dd [input] input)

(clojure.core/defn- deser-eac-3-lfe-filter [input] (clojure.core/get {"ENABLED" :enabled, "DISABLED" :disabled} input))

(clojure.core/defn- deser-input-timecode-source [input] (clojure.core/get {"EMBEDDED" :embedded, "ZEROBASED" :zerobased, "SPECIFIEDSTART" :specifiedstart} input))

(clojure.core/defn- deser-timecode-source [input] (clojure.core/get {"EMBEDDED" :embedded, "ZEROBASED" :zerobased, "SPECIFIEDSTART" :specifiedstart} input))

(clojure.core/defn- deser-hls-encryption-settings [input] (clojure.core/cond-> {} (clojure.core/contains? input "constantInitializationVector") (clojure.core/assoc :constant-initialization-vector (deser-string-min-32-max-32-pattern-09a-faf-32 (input "constantInitializationVector"))) (clojure.core/contains? input "encryptionMethod") (clojure.core/assoc :encryption-method (deser-hls-encryption-type (input "encryptionMethod"))) (clojure.core/contains? input "initializationVectorInManifest") (clojure.core/assoc :initialization-vector-in-manifest (deser-hls-initialization-vector-in-manifest (input "initializationVectorInManifest"))) (clojure.core/contains? input "offlineEncrypted") (clojure.core/assoc :offline-encrypted (deser-hls-offline-encrypted (input "offlineEncrypted"))) (clojure.core/contains? input "spekeKeyProvider") (clojure.core/assoc :speke-key-provider (deser-speke-key-provider (input "spekeKeyProvider"))) (clojure.core/contains? input "staticKeyProvider") (clojure.core/assoc :static-key-provider (deser-static-key-provider (input "staticKeyProvider"))) (clojure.core/contains? input "type") (clojure.core/assoc :type (deser-hls-key-provider-type (input "type")))))

(clojure.core/defn- deser-h-265-framerate-conversion-algorithm [input] (clojure.core/get {"DUPLICATE_DROP" :duplicate-drop, "INTERPOLATE" :interpolate} input))

(clojure.core/defn- deser-h-264-rate-control-mode [input] (clojure.core/get {"VBR" :vbr, "CBR" :cbr, "QVBR" :qvbr} input))

(clojure.core/defn- deser-integer-min-0-max-255 [input] input)

(clojure.core/defn- deser-motion-image-insertion-framerate [input] (clojure.core/cond-> {} (clojure.core/contains? input "framerateDenominator") (clojure.core/assoc :framerate-denominator (deser-integer-min-1-max-17895697 (input "framerateDenominator"))) (clojure.core/contains? input "framerateNumerator") (clojure.core/assoc :framerate-numerator (deser-integer-min-1-max-2147483640 (input "framerateNumerator")))))

(clojure.core/defn- deser-video-selector [input] (clojure.core/cond-> {} (clojure.core/contains? input "colorSpace") (clojure.core/assoc :color-space (deser-color-space (input "colorSpace"))) (clojure.core/contains? input "colorSpaceUsage") (clojure.core/assoc :color-space-usage (deser-color-space-usage (input "colorSpaceUsage"))) (clojure.core/contains? input "hdr10Metadata") (clojure.core/assoc :hdr-10-metadata (deser-hdr-10-metadata (input "hdr10Metadata"))) (clojure.core/contains? input "pid") (clojure.core/assoc :pid (deser-integer-min-1-max-2147483647 (input "pid"))) (clojure.core/contains? input "programNumber") (clojure.core/assoc :program-number (deser-integer-min-negative-2147483648-max-2147483647 (input "programNumber"))) (clojure.core/contains? input "rotate") (clojure.core/assoc :rotate (deser-input-rotate (input "rotate")))))

(clojure.core/defn- deser-burnin-subtitle-teletext-spacing [input] (clojure.core/get {"FIXED_GRID" :fixed-grid, "PROPORTIONAL" :proportional} input))

(clojure.core/defn- deser-job-template [input] (clojure.core/cond-> {:settings (deser-job-template-settings (input "settings")), :name (deser-string (input "name"))} (clojure.core/contains? input "statusUpdateIntervalInSecs") (clojure.core/assoc :status-update-interval-in-secs (deser-integer-min-10-max-600 (input "statusUpdateIntervalInSecs"))) (clojure.core/contains? input "type") (clojure.core/assoc :type (deser-type (input "type"))) (clojure.core/contains? input "category") (clojure.core/assoc :category (deser-string (input "category"))) (clojure.core/contains? input "queue") (clojure.core/assoc :queue (deser-string (input "queue"))) (clojure.core/contains? input "accelerationSettings") (clojure.core/assoc :acceleration-settings (deser-acceleration-settings (input "accelerationSettings"))) (clojure.core/contains? input "description") (clojure.core/assoc :description (deser-string (input "description"))) (clojure.core/contains? input "arn") (clojure.core/assoc :arn (deser-string (input "arn"))) (clojure.core/contains? input "createdAt") (clojure.core/assoc :created-at (deser-timestamp-unix (input "createdAt"))) (clojure.core/contains? input "lastUpdated") (clojure.core/assoc :last-updated (deser-timestamp-unix (input "lastUpdated")))))

(clojure.core/defn- deser-ac-3-metadata-control [input] (clojure.core/get {"FOLLOW_INPUT" :follow-input, "USE_CONFIGURED" :use-configured} input))

(clojure.core/defn- deser-double-min-0 [input] input)

(clojure.core/defn- deser-mp-4-settings [input] (clojure.core/cond-> {} (clojure.core/contains? input "cslgAtom") (clojure.core/assoc :cslg-atom (deser-mp-4-cslg-atom (input "cslgAtom"))) (clojure.core/contains? input "freeSpaceBox") (clojure.core/assoc :free-space-box (deser-mp-4-free-space-box (input "freeSpaceBox"))) (clojure.core/contains? input "moovPlacement") (clojure.core/assoc :moov-placement (deser-mp-4-moov-placement (input "moovPlacement"))) (clojure.core/contains? input "mp4MajorBrand") (clojure.core/assoc :mp-4-major-brand (deser-string (input "mp4MajorBrand")))))

(clojure.core/defn- deser-list-of-integer-min-negative-60-max-6 [input] (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (deser-integer-min-negative-60-max-6 coll))) input))

(clojure.core/defn- deser-cmaf-write-hls-manifest [input] (clojure.core/get {"DISABLED" :disabled, "ENABLED" :enabled} input))

(clojure.core/defn- deser-m-2ts-buffer-model [input] (clojure.core/get {"MULTIPLEX" :multiplex, "NONE" :none} input))

(clojure.core/defn- deser-integer-min-25-max-10000 [input] input)

(clojure.core/defn- deser-hdr-10-metadata [input] (clojure.core/cond-> {} (clojure.core/contains? input "minLuminance") (clojure.core/assoc :min-luminance (deser-integer-min-0-max-2147483647 (input "minLuminance"))) (clojure.core/contains? input "bluePrimaryX") (clojure.core/assoc :blue-primary-x (deser-integer-min-0-max-50000 (input "bluePrimaryX"))) (clojure.core/contains? input "greenPrimaryX") (clojure.core/assoc :green-primary-x (deser-integer-min-0-max-50000 (input "greenPrimaryX"))) (clojure.core/contains? input "maxLuminance") (clojure.core/assoc :max-luminance (deser-integer-min-0-max-2147483647 (input "maxLuminance"))) (clojure.core/contains? input "maxFrameAverageLightLevel") (clojure.core/assoc :max-frame-average-light-level (deser-integer-min-0-max-65535 (input "maxFrameAverageLightLevel"))) (clojure.core/contains? input "greenPrimaryY") (clojure.core/assoc :green-primary-y (deser-integer-min-0-max-50000 (input "greenPrimaryY"))) (clojure.core/contains? input "maxContentLightLevel") (clojure.core/assoc :max-content-light-level (deser-integer-min-0-max-65535 (input "maxContentLightLevel"))) (clojure.core/contains? input "whitePointX") (clojure.core/assoc :white-point-x (deser-integer-min-0-max-50000 (input "whitePointX"))) (clojure.core/contains? input "redPrimaryX") (clojure.core/assoc :red-primary-x (deser-integer-min-0-max-50000 (input "redPrimaryX"))) (clojure.core/contains? input "whitePointY") (clojure.core/assoc :white-point-y (deser-integer-min-0-max-50000 (input "whitePointY"))) (clojure.core/contains? input "bluePrimaryY") (clojure.core/assoc :blue-primary-y (deser-integer-min-0-max-50000 (input "bluePrimaryY"))) (clojure.core/contains? input "redPrimaryY") (clojure.core/assoc :red-primary-y (deser-integer-min-0-max-50000 (input "redPrimaryY")))))

(clojure.core/defn- deser-eac-3-coding-mode [input] (clojure.core/get {"CODING_MODE_1_0" :coding-mode-1-0, "CODING_MODE_2_0" :coding-mode-2-0, "CODING_MODE_3_2" :coding-mode-3-2} input))

(clojure.core/defn- deser-caption-description [input] (clojure.core/cond-> {} (clojure.core/contains? input "captionSelectorName") (clojure.core/assoc :caption-selector-name (deser-string-min-1 (input "captionSelectorName"))) (clojure.core/contains? input "customLanguageCode") (clojure.core/assoc :custom-language-code (deser-string-min-3-max-3-pattern-a-za-z-3 (input "customLanguageCode"))) (clojure.core/contains? input "destinationSettings") (clojure.core/assoc :destination-settings (deser-caption-destination-settings (input "destinationSettings"))) (clojure.core/contains? input "languageCode") (clojure.core/assoc :language-code (deser-language-code (input "languageCode"))) (clojure.core/contains? input "languageDescription") (clojure.core/assoc :language-description (deser-string (input "languageDescription")))))

(clojure.core/defn- deser-dash-iso-segment-control [input] (clojure.core/get {"SINGLE_FILE" :single-file, "SEGMENTED_FILES" :segmented-files} input))

(clojure.core/defn- deser-m-3u-8-nielsen-id-3 [input] (clojure.core/get {"INSERT" :insert, "NONE" :none} input))

(clojure.core/defn- deser-list-of-integer-min-32-max-8182 [input] (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (deser-integer-min-32-max-8182 coll))) input))

(clojure.core/defn- deser-audio-type-control [input] (clojure.core/get {"FOLLOW_INPUT" :follow-input, "USE_CONFIGURED" :use-configured} input))

(clojure.core/defn- deser-hls-output-selection [input] (clojure.core/get {"MANIFESTS_AND_SEGMENTS" :manifests-and-segments, "SEGMENTS_ONLY" :segments-only} input))

(clojure.core/defn- deser-speke-key-provider [input] (clojure.core/cond-> {} (clojure.core/contains? input "certificateArn") (clojure.core/assoc :certificate-arn (deser-string-pattern-arn-aws-us-gov-acm (input "certificateArn"))) (clojure.core/contains? input "resourceId") (clojure.core/assoc :resource-id (deser-string (input "resourceId"))) (clojure.core/contains? input "systemIds") (clojure.core/assoc :system-ids (deser-list-of-string-pattern-09a-faf-809a-faf-409a-faf-409a-faf-409a-faf-12 (input "systemIds"))) (clojure.core/contains? input "url") (clojure.core/assoc :url (deser-string-pattern-https (input "url")))))

(clojure.core/defn- deser-deinterlace-algorithm [input] (clojure.core/get {"INTERPOLATE" :interpolate, "INTERPOLATE_TICKER" :interpolate-ticker, "BLEND" :blend, "BLEND_TICKER" :blend-ticker} input))

(clojure.core/defn- deser-ac-3-bitstream-mode [input] (clojure.core/get {"COMPLETE_MAIN" :complete-main, "COMMENTARY" :commentary, "DIALOGUE" :dialogue, "EMERGENCY" :emergency, "HEARING_IMPAIRED" :hearing-impaired, "MUSIC_AND_EFFECTS" :music-and-effects, "VISUALLY_IMPAIRED" :visually-impaired, "VOICE_OVER" :voice-over} input))

(clojure.core/defn- deser-integer-min-16-max-24 [input] input)

(clojure.core/defn- deser-integer-min-negative-2-max-3 [input] input)

(clojure.core/defn- deser-f-4v-moov-placement [input] (clojure.core/get {"PROGRESSIVE_DOWNLOAD" :progressive-download, "NORMAL" :normal} input))

(clojure.core/defn- deser-eac-3-dynamic-range-compression-rf [input] (clojure.core/get {"NONE" :none, "FILM_STANDARD" :film-standard, "FILM_LIGHT" :film-light, "MUSIC_STANDARD" :music-standard, "MUSIC_LIGHT" :music-light, "SPEECH" :speech} input))

(clojure.core/defn- deser-aac-raw-format [input] (clojure.core/get {"LATM_LOAS" :latm-loas, "NONE" :none} input))

(clojure.core/defn- deser-string-pattern-s-3-assetmap-xml [input] input)

(clojure.core/defn- deser-integer-min-32000-max-384000 [input] input)

(clojure.core/defn- deser-list-of-preset [input] (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (deser-preset coll))) input))

(clojure.core/defn- deser-timed-metadata [input] (clojure.core/get {"PASSTHROUGH" :passthrough, "NONE" :none} input))

(clojure.core/defn- deser-integer-min-32-max-4096 [input] input)

(clojure.core/defn- deser-h-265-rate-control-mode [input] (clojure.core/get {"VBR" :vbr, "CBR" :cbr, "QVBR" :qvbr} input))

(clojure.core/defn- deser-mov-reference [input] (clojure.core/get {"SELF_CONTAINED" :self-contained, "EXTERNAL" :external} input))

(clojure.core/defn- deser-integer-min-0-max-3600 [input] input)

(clojure.core/defn- deser-acceleration-settings [input] (clojure.core/cond-> {:mode (deser-acceleration-mode (input "mode"))}))

(clojure.core/defn- deser-string-pattern-s-3 [input] input)

(clojure.core/defn- deser-m-2ts-segmentation-markers [input] (clojure.core/get {"NONE" :none, "RAI_SEGSTART" :rai-segstart, "RAI_ADAPT" :rai-adapt, "PSI_SEGSTART" :psi-segstart, "EBP" :ebp, "EBP_LEGACY" :ebp-legacy} input))

(clojure.core/defn- deser-acceleration-mode [input] (clojure.core/get {"DISABLED" :disabled, "ENABLED" :enabled} input))

(clojure.core/defn- deser-m-2ts-scte-35-source [input] (clojure.core/get {"PASSTHROUGH" :passthrough, "NONE" :none} input))

(clojure.core/defn- deser-list-of-job-template [input] (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (deser-job-template coll))) input))

(clojure.core/defn- deser-h-264-par-control [input] (clojure.core/get {"INITIALIZE_FROM_SOURCE" :initialize-from-source, "SPECIFIED" :specified} input))

(clojure.core/defn- deser-color-corrector [input] (clojure.core/cond-> {} (clojure.core/contains? input "brightness") (clojure.core/assoc :brightness (deser-integer-min-1-max-100 (input "brightness"))) (clojure.core/contains? input "colorSpaceConversion") (clojure.core/assoc :color-space-conversion (deser-color-space-conversion (input "colorSpaceConversion"))) (clojure.core/contains? input "contrast") (clojure.core/assoc :contrast (deser-integer-min-1-max-100 (input "contrast"))) (clojure.core/contains? input "hdr10Metadata") (clojure.core/assoc :hdr-10-metadata (deser-hdr-10-metadata (input "hdr10Metadata"))) (clojure.core/contains? input "hue") (clojure.core/assoc :hue (deser-integer-min-negative-180-max-180 (input "hue"))) (clojure.core/contains? input "saturation") (clojure.core/assoc :saturation (deser-integer-min-1-max-100 (input "saturation")))))

(clojure.core/defn- deser-video-description [input] (clojure.core/cond-> {} (clojure.core/contains? input "crop") (clojure.core/assoc :crop (deser-rectangle (input "crop"))) (clojure.core/contains? input "dropFrameTimecode") (clojure.core/assoc :drop-frame-timecode (deser-drop-frame-timecode (input "dropFrameTimecode"))) (clojure.core/contains? input "timecodeInsertion") (clojure.core/assoc :timecode-insertion (deser-video-timecode-insertion (input "timecodeInsertion"))) (clojure.core/contains? input "sharpness") (clojure.core/assoc :sharpness (deser-integer-min-0-max-100 (input "sharpness"))) (clojure.core/contains? input "codecSettings") (clojure.core/assoc :codec-settings (deser-video-codec-settings (input "codecSettings"))) (clojure.core/contains? input "afdSignaling") (clojure.core/assoc :afd-signaling (deser-afd-signaling (input "afdSignaling"))) (clojure.core/contains? input "videoPreprocessors") (clojure.core/assoc :video-preprocessors (deser-video-preprocessor (input "videoPreprocessors"))) (clojure.core/contains? input "width") (clojure.core/assoc :width (deser-integer-min-32-max-4096 (input "width"))) (clojure.core/contains? input "scalingBehavior") (clojure.core/assoc :scaling-behavior (deser-scaling-behavior (input "scalingBehavior"))) (clojure.core/contains? input "antiAlias") (clojure.core/assoc :anti-alias (deser-anti-alias (input "antiAlias"))) (clojure.core/contains? input "colorMetadata") (clojure.core/assoc :color-metadata (deser-color-metadata (input "colorMetadata"))) (clojure.core/contains? input "position") (clojure.core/assoc :position (deser-rectangle (input "position"))) (clojure.core/contains? input "height") (clojure.core/assoc :height (deser-integer-min-32-max-2160 (input "height"))) (clojure.core/contains? input "respondToAfd") (clojure.core/assoc :respond-to-afd (deser-respond-to-afd (input "respondToAfd"))) (clojure.core/contains? input "fixedAfd") (clojure.core/assoc :fixed-afd (deser-integer-min-0-max-15 (input "fixedAfd")))))

(clojure.core/defn- deser-integer-min-0-max-15 [input] input)

(clojure.core/defn- deser-string-min-3-max-3-pattern-1809a-faf-09a-eae [input] input)

(clojure.core/defn- deser-integer-min-1-max-10 [input] input)

(clojure.core/defn- deser-id-3-insertion [input] (clojure.core/cond-> {} (clojure.core/contains? input "id3") (clojure.core/assoc :id-3 (deser-string-pattern-a-za-z-0902 (input "id3"))) (clojure.core/contains? input "timecode") (clojure.core/assoc :timecode (deser-string-pattern-010920405090509092 (input "timecode")))))

(clojure.core/defn- deser-output-group-settings [input] (clojure.core/cond-> {} (clojure.core/contains? input "cmafGroupSettings") (clojure.core/assoc :cmaf-group-settings (deser-cmaf-group-settings (input "cmafGroupSettings"))) (clojure.core/contains? input "dashIsoGroupSettings") (clojure.core/assoc :dash-iso-group-settings (deser-dash-iso-group-settings (input "dashIsoGroupSettings"))) (clojure.core/contains? input "fileGroupSettings") (clojure.core/assoc :file-group-settings (deser-file-group-settings (input "fileGroupSettings"))) (clojure.core/contains? input "hlsGroupSettings") (clojure.core/assoc :hls-group-settings (deser-hls-group-settings (input "hlsGroupSettings"))) (clojure.core/contains? input "msSmoothGroupSettings") (clojure.core/assoc :ms-smooth-group-settings (deser-ms-smooth-group-settings (input "msSmoothGroupSettings"))) (clojure.core/contains? input "type") (clojure.core/assoc :type (deser-output-group-type (input "type")))))

(clojure.core/defn- deser-integer-min-32000-max-48000 [input] input)

(clojure.core/defn- deser-string-pattern-s-3-mm-2-vvmmppeeggaavviimmpp-4-ffllvvmmppttmmppggmm-4-vvttrrppff-4-vvmm-2-ttssttss-264-hh-264-mmkkvvmmoovvmmttssmm-2-ttwwmmvvaassffvvoobb-3-ggpp-3-ggppppmmxxffddiivvxxxxvviiddrraawwddvvggxxffmm-1-vv-3-gg-2-vvmmffmm-3-uu-8-llcchhggxxffmmppeegg-2-mmxxffmmppeegg-2-mmxxffhhddwwaavvyy-4-mmaaaaccaaiiffffmmpp-2-aacc-3-eecc-3-ddttssee [input] input)

(clojure.core/defn- deser-integer-min-96-max-600 [input] input)

(clojure.core/defn- deser-ms-smooth-encryption-settings [input] (clojure.core/cond-> {} (clojure.core/contains? input "spekeKeyProvider") (clojure.core/assoc :speke-key-provider (deser-speke-key-provider (input "spekeKeyProvider")))))

(clojure.core/defn- deser-file-source-convert-608-to-708 [input] (clojure.core/get {"UPCONVERT" :upconvert, "DISABLED" :disabled} input))

(clojure.core/defn- deser-map-of-audio-selector-group [input] (clojure.core/into {} (clojure.core/map (clojure.core/fn [[k v]] [(deser-string k) (deser-audio-selector-group v)])) input))

(clojure.core/defn- deser-list-of-hls-ad-markers [input] (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (deser-hls-ad-markers coll))) input))

(clojure.core/defn- deser-list-of-integer-min-1-max-2147483647 [input] (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (deser-integer-min-1-max-2147483647 coll))) input))

(clojure.core/defn- deser-dash-iso-hbbtv-compliance [input] (clojure.core/get {"HBBTV_1_5" :hbbtv-1-5, "NONE" :none} input))

(clojure.core/defn- deser-input-clipping [input] (clojure.core/cond-> {} (clojure.core/contains? input "endTimecode") (clojure.core/assoc :end-timecode (deser-string-pattern-010920405090509092 (input "endTimecode"))) (clojure.core/contains? input "startTimecode") (clojure.core/assoc :start-timecode (deser-string-pattern-010920405090509092 (input "startTimecode")))))

(clojure.core/defn- deser-color-space [input] (clojure.core/get {"FOLLOW" :follow, "REC_601" :rec-601, "REC_709" :rec-709, "HDR10" :hdr-10, "HLG_2020" :hlg-2020} input))

(clojure.core/defn- deser-scaling-behavior [input] (clojure.core/get {"DEFAULT" :default, "STRETCH_TO_OUTPUT" :stretch-to-output} input))

(clojure.core/defn- deser-mp-2-settings [input] (clojure.core/cond-> {} (clojure.core/contains? input "bitrate") (clojure.core/assoc :bitrate (deser-integer-min-32000-max-384000 (input "bitrate"))) (clojure.core/contains? input "channels") (clojure.core/assoc :channels (deser-integer-min-1-max-2 (input "channels"))) (clojure.core/contains? input "sampleRate") (clojure.core/assoc :sample-rate (deser-integer-min-32000-max-48000 (input "sampleRate")))))

(clojure.core/defn- deser-mpeg-2-scene-change-detect [input] (clojure.core/get {"DISABLED" :disabled, "ENABLED" :enabled} input))

(clojure.core/defn- deser-integer-min-1-max-1001 [input] input)

(clojure.core/defn- deser-m-2ts-es-rate-in-pes [input] (clojure.core/get {"INCLUDE" :include, "EXCLUDE" :exclude} input))

(clojure.core/defn- deser-caption-source-settings [input] (clojure.core/cond-> {} (clojure.core/contains? input "ancillarySourceSettings") (clojure.core/assoc :ancillary-source-settings (deser-ancillary-source-settings (input "ancillarySourceSettings"))) (clojure.core/contains? input "dvbSubSourceSettings") (clojure.core/assoc :dvb-sub-source-settings (deser-dvb-sub-source-settings (input "dvbSubSourceSettings"))) (clojure.core/contains? input "embeddedSourceSettings") (clojure.core/assoc :embedded-source-settings (deser-embedded-source-settings (input "embeddedSourceSettings"))) (clojure.core/contains? input "fileSourceSettings") (clojure.core/assoc :file-source-settings (deser-file-source-settings (input "fileSourceSettings"))) (clojure.core/contains? input "sourceType") (clojure.core/assoc :source-type (deser-caption-source-type (input "sourceType"))) (clojure.core/contains? input "teletextSourceSettings") (clojure.core/assoc :teletext-source-settings (deser-teletext-source-settings (input "teletextSourceSettings"))) (clojure.core/contains? input "trackSourceSettings") (clojure.core/assoc :track-source-settings (deser-track-source-settings (input "trackSourceSettings")))))

(clojure.core/defn- deser-caption-destination-settings [input] (clojure.core/cond-> {} (clojure.core/contains? input "burninDestinationSettings") (clojure.core/assoc :burnin-destination-settings (deser-burnin-destination-settings (input "burninDestinationSettings"))) (clojure.core/contains? input "destinationType") (clojure.core/assoc :destination-type (deser-caption-destination-type (input "destinationType"))) (clojure.core/contains? input "dvbSubDestinationSettings") (clojure.core/assoc :dvb-sub-destination-settings (deser-dvb-sub-destination-settings (input "dvbSubDestinationSettings"))) (clojure.core/contains? input "embeddedDestinationSettings") (clojure.core/assoc :embedded-destination-settings (deser-embedded-destination-settings (input "embeddedDestinationSettings"))) (clojure.core/contains? input "sccDestinationSettings") (clojure.core/assoc :scc-destination-settings (deser-scc-destination-settings (input "sccDestinationSettings"))) (clojure.core/contains? input "teletextDestinationSettings") (clojure.core/assoc :teletext-destination-settings (deser-teletext-destination-settings (input "teletextDestinationSettings"))) (clojure.core/contains? input "ttmlDestinationSettings") (clojure.core/assoc :ttml-destination-settings (deser-ttml-destination-settings (input "ttmlDestinationSettings")))))

(clojure.core/defn- deser-integer-min-1000-max-30000 [input] input)

(clojure.core/defn- deser-integer-min-1-max-2147483647 [input] input)

(clojure.core/defn- deser-integer-min-32-max-2160 [input] input)

(clojure.core/defn- deser-hls-ad-markers [input] (clojure.core/get {"ELEMENTAL" :elemental, "ELEMENTAL_SCTE35" :elemental-scte-35} input))

(clojure.core/defn- deser-integer-min-10-max-600 [input] input)

(clojure.core/defn- deser-m-2ts-segmentation-style [input] (clojure.core/get {"MAINTAIN_CADENCE" :maintain-cadence, "RESET_CADENCE" :reset-cadence} input))

(clojure.core/defn- deser-channel-mapping [input] (clojure.core/cond-> {} (clojure.core/contains? input "outputChannels") (clojure.core/assoc :output-channels (deser-list-of-output-channel-mapping (input "outputChannels")))))

(clojure.core/defn- deser-integer-min-0-max-30 [input] input)

(clojure.core/defn- deser-timing [input] (clojure.core/cond-> {} (clojure.core/contains? input "finishTime") (clojure.core/assoc :finish-time (deser-timestamp-unix (input "finishTime"))) (clojure.core/contains? input "startTime") (clojure.core/assoc :start-time (deser-timestamp-unix (input "startTime"))) (clojure.core/contains? input "submitTime") (clojure.core/assoc :submit-time (deser-timestamp-unix (input "submitTime")))))

(clojure.core/defn- deser-h-264-framerate-conversion-algorithm [input] (clojure.core/get {"DUPLICATE_DROP" :duplicate-drop, "INTERPOLATE" :interpolate} input))

(clojure.core/defn- deser-m-2ts-force-ts-video-ebp-order [input] (clojure.core/get {"FORCE" :force, "DEFAULT" :default} input))

(clojure.core/defn- deser-dvb-subtitle-background-color [input] (clojure.core/get {"NONE" :none, "BLACK" :black, "WHITE" :white} input))

(clojure.core/defn- deser-string-pattern-https [input] input)

(clojure.core/defn- deser-audio-normalization-peak-calculation [input] (clojure.core/get {"TRUE_PEAK" :true-peak, "NONE" :none} input))

(clojure.core/defn- deser-integer-min-0-max-16 [input] input)

(clojure.core/defn- deser-integer-min-negative-70-max-0 [input] input)

(clojure.core/defn- deser-anti-alias [input] (clojure.core/get {"DISABLED" :disabled, "ENABLED" :enabled} input))

(clojure.core/defn- deser-burnin-subtitle-background-color [input] (clojure.core/get {"NONE" :none, "BLACK" :black, "WHITE" :white} input))

(clojure.core/defn- deser-m-2ts-rate-mode [input] (clojure.core/get {"VBR" :vbr, "CBR" :cbr} input))

(clojure.core/defn- deser-eac-3-bitstream-mode [input] (clojure.core/get {"COMPLETE_MAIN" :complete-main, "COMMENTARY" :commentary, "EMERGENCY" :emergency, "HEARING_IMPAIRED" :hearing-impaired, "VISUALLY_IMPAIRED" :visually-impaired} input))

(clojure.core/defn- deser-timed-metadata-insertion [input] (clojure.core/cond-> {} (clojure.core/contains? input "id3Insertions") (clojure.core/assoc :id-3-insertions (deser-list-of-id-3-insertion (input "id3Insertions")))))

(clojure.core/defn- deser-input-template [input] (clojure.core/cond-> {} (clojure.core/contains? input "denoiseFilter") (clojure.core/assoc :denoise-filter (deser-input-denoise-filter (input "denoiseFilter"))) (clojure.core/contains? input "filterStrength") (clojure.core/assoc :filter-strength (deser-integer-min-negative-5-max-5 (input "filterStrength"))) (clojure.core/contains? input "programNumber") (clojure.core/assoc :program-number (deser-integer-min-1-max-2147483647 (input "programNumber"))) (clojure.core/contains? input "inputClippings") (clojure.core/assoc :input-clippings (deser-list-of-input-clipping (input "inputClippings"))) (clojure.core/contains? input "timecodeSource") (clojure.core/assoc :timecode-source (deser-input-timecode-source (input "timecodeSource"))) (clojure.core/contains? input "captionSelectors") (clojure.core/assoc :caption-selectors (deser-map-of-caption-selector (input "captionSelectors"))) (clojure.core/contains? input "videoSelector") (clojure.core/assoc :video-selector (deser-video-selector (input "videoSelector"))) (clojure.core/contains? input "audioSelectorGroups") (clojure.core/assoc :audio-selector-groups (deser-map-of-audio-selector-group (input "audioSelectorGroups"))) (clojure.core/contains? input "filterEnable") (clojure.core/assoc :filter-enable (deser-input-filter-enable (input "filterEnable"))) (clojure.core/contains? input "imageInserter") (clojure.core/assoc :image-inserter (deser-image-inserter (input "imageInserter"))) (clojure.core/contains? input "psiControl") (clojure.core/assoc :psi-control (deser-input-psi-control (input "psiControl"))) (clojure.core/contains? input "audioSelectors") (clojure.core/assoc :audio-selectors (deser-map-of-audio-selector (input "audioSelectors"))) (clojure.core/contains? input "deblockFilter") (clojure.core/assoc :deblock-filter (deser-input-deblock-filter (input "deblockFilter")))))

(clojure.core/defn- deser-language-code [input] (clojure.core/get {"VIE" :vie, "ZUL" :zul, "COR" :cor, "URD" :urd, "EPO" :epo, "MAR" :mar, "SRB" :srb, "TAM" :tam, "TAH" :tah, "LIM" :lim, "SMO" :smo, "POL" :pol, "JAV" :jav, "BEL" :bel, "AAR" :aar, "KAU" :kau, "SQI" :sqi, "III" :iii, "AVA" :ava, "LUB" :lub, "SWE" :swe, "POR" :por, "AYM" :aym, "NBL" :nbl, "FIN" :fin, "HEB" :heb, "SNA" :sna, "PLI" :pli, "RON" :ron, "ABK" :abk, "CYM" :cym, "LAV" :lav, "AMH" :amh, "IDO" :ido, "FRY" :fry, "IPK" :ipk, "VOL" :vol, "HAT" :hat, "KOM" :kom, "IBO" :ibo, "MAH" :mah, "ARG" :arg, "KIK" :kik, "BEN" :ben, "AVE" :ave, "GER" :ger, "ORJ" :orj, "FUL" :ful, "KUR" :kur, "KUA" :kua, "NYA" :nya, "CHA" :cha, "NOB" :nob, "DEU" :deu, "SUN" :sun, "MKD" :mkd, "HRV" :hrv, "XHO" :xho, "HUN" :hun, "LUG" :lug, "KAS" :kas, "IND" :ind, "KON" :kon, "ILE" :ile, "NDE" :nde, "TGL" :tgl, "LAT" :lat, "TWI" :twi, "EUS" :eus, "UKR" :ukr, "HMO" :hmo, "BRE" :bre, "KAL" :kal, "ELL" :ell, "LIN" :lin, "NAU" :nau, "MLT" :mlt, "SME" :sme, "KHM" :khm, "HIN" :hin, "FRA" :fra, "MRI" :mri, "SLK" :slk, "THA" :tha, "AFR" :afr, "AZE" :aze, "KAT" :kat, "EWE" :ewe, "TSN" :tsn, "ZHO" :zho, "OSS" :oss, "ORM" :orm, "SSW" :ssw, "GUJ" :guj, "EST" :est, "KIR" :kir, "QUE" :que, "COS" :cos, "TUK" :tuk, "KOR" :kor, "FIJ" :fij, "KAZ" :kaz, "MYA" :mya, "AKA" :aka, "TGK" :tgk, "ITA" :ita, "MON" :mon, "KAN" :kan, "RUS" :rus, "YID" :yid, "NLD" :nld, "TAT" :tat, "MSA" :msa, "DIV" :div, "YOR" :yor, "MAL" :mal, "NNO" :nno, "FAS" :fas, "SAG" :sag, "SOM" :som, "BAM" :bam, "TON" :ton, "CHV" :chv, "GLE" :gle, "SLV" :slv, "TEL" :tel, "ARA" :ara, "ISL" :isl, "SOT" :sot, "BIH" :bih, "JPN" :jpn, "TUR" :tur, "BAK" :bak, "VEN" :ven, "FRM" :frm, "CES" :ces, "NAV" :nav, "GLG" :glg, "IKU" :iku, "TIR" :tir, "SAN" :san, "SIN" :sin, "WOL" :wol, "ORI" :ori, "ASM" :asm, "DZO" :dzo, "CRE" :cre, "BOD" :bod, "ENG" :eng, "BUL" :bul, "BOS" :bos, "KIN" :kin, "GRN" :grn, "QAA" :qaa, "PAN" :pan, "BIS" :bis, "PUS" :pus, "MLG" :mlg, "QPC" :qpc, "HAU" :hau, "WLN" :wln, "LIT" :lit, "HYE" :hye, "LTZ" :ltz, "CHU" :chu, "SWA" :swa, "HER" :her, "DAN" :dan, "TNG" :tng, "SRD" :srd, "RUN" :run, "UZB" :uzb, "OJI" :oji, "ZHA" :zha, "SND" :snd, "TSO" :tso, "CHE" :che, "OCI" :oci, "ROH" :roh, "NEP" :nep, "GLV" :glv, "CAT" :cat, "ENM" :enm, "FAO" :fao, "GLA" :gla, "UIG" :uig, "NDO" :ndo, "SPA" :spa, "LAO" :lao, "NOR" :nor, "INA" :ina} input))

(clojure.core/defn- deser-string-min-9-max-19-pattern-az-26-east-west-central-north-south-east-west-1912 [input] input)

(clojure.core/defn- deser-mov-settings [input] (clojure.core/cond-> {} (clojure.core/contains? input "clapAtom") (clojure.core/assoc :clap-atom (deser-mov-clap-atom (input "clapAtom"))) (clojure.core/contains? input "cslgAtom") (clojure.core/assoc :cslg-atom (deser-mov-cslg-atom (input "cslgAtom"))) (clojure.core/contains? input "mpeg2FourCCControl") (clojure.core/assoc :mpeg-2-four-cc-control (deser-mov-mpeg-2-four-cc-control (input "mpeg2FourCCControl"))) (clojure.core/contains? input "paddingControl") (clojure.core/assoc :padding-control (deser-mov-padding-control (input "paddingControl"))) (clojure.core/contains? input "reference") (clojure.core/assoc :reference (deser-mov-reference (input "reference")))))

(clojure.core/defn- deser-integer-min-0-max-100 [input] input)

(clojure.core/defn- deser-list-of-hls-caption-language-mapping [input] (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (deser-hls-caption-language-mapping coll))) input))

(clojure.core/defn- deser-dash-iso-write-segment-timeline-in-representation [input] (clojure.core/get {"ENABLED" :enabled, "DISABLED" :disabled} input))

(clojure.core/defn- deser-integer-min-1-max-6 [input] input)

(clojure.core/defn- deser-ancillary-source-settings [input] (clojure.core/cond-> {} (clojure.core/contains? input "sourceAncillaryChannelNumber") (clojure.core/assoc :source-ancillary-channel-number (deser-integer-min-1-max-4 (input "sourceAncillaryChannelNumber")))))

(clojure.core/defn- deser-input [input] (clojure.core/cond-> {} (clojure.core/contains? input "denoiseFilter") (clojure.core/assoc :denoise-filter (deser-input-denoise-filter (input "denoiseFilter"))) (clojure.core/contains? input "filterStrength") (clojure.core/assoc :filter-strength (deser-integer-min-negative-5-max-5 (input "filterStrength"))) (clojure.core/contains? input "programNumber") (clojure.core/assoc :program-number (deser-integer-min-1-max-2147483647 (input "programNumber"))) (clojure.core/contains? input "inputClippings") (clojure.core/assoc :input-clippings (deser-list-of-input-clipping (input "inputClippings"))) (clojure.core/contains? input "timecodeSource") (clojure.core/assoc :timecode-source (deser-input-timecode-source (input "timecodeSource"))) (clojure.core/contains? input "supplementalImps") (clojure.core/assoc :supplemental-imps (deser-list-of-string-pattern-s-3-assetmap-xml (input "supplementalImps"))) (clojure.core/contains? input "captionSelectors") (clojure.core/assoc :caption-selectors (deser-map-of-caption-selector (input "captionSelectors"))) (clojure.core/contains? input "videoSelector") (clojure.core/assoc :video-selector (deser-video-selector (input "videoSelector"))) (clojure.core/contains? input "audioSelectorGroups") (clojure.core/assoc :audio-selector-groups (deser-map-of-audio-selector-group (input "audioSelectorGroups"))) (clojure.core/contains? input "filterEnable") (clojure.core/assoc :filter-enable (deser-input-filter-enable (input "filterEnable"))) (clojure.core/contains? input "imageInserter") (clojure.core/assoc :image-inserter (deser-image-inserter (input "imageInserter"))) (clojure.core/contains? input "psiControl") (clojure.core/assoc :psi-control (deser-input-psi-control (input "psiControl"))) (clojure.core/contains? input "audioSelectors") (clojure.core/assoc :audio-selectors (deser-map-of-audio-selector (input "audioSelectors"))) (clojure.core/contains? input "fileInput") (clojure.core/assoc :file-input (deser-string-pattern-s-3-mm-2-vvmmppeeggaavviimmpp-4-ffllvvmmppttmmppggmm-4-vvttrrppff-4-vvmm-2-ttssttss-264-hh-264-mmkkvvmmoovvmmttssmm-2-ttwwmmvvaassffvvoobb-3-ggpp-3-ggppppmmxxffddiivvxxxxvviiddrraawwddvvggxxffmm-1-vv-3-gg-2-vvmmffmm-3-uu-8-llcchhggxxffmmppeegg-2-mmxxffmmppeegg-2-mmxxffhhddwwaavvyy-4-mmxxmmll (input "fileInput"))) (clojure.core/contains? input "deblockFilter") (clojure.core/assoc :deblock-filter (deser-input-deblock-filter (input "deblockFilter"))) (clojure.core/contains? input "decryptionSettings") (clojure.core/assoc :decryption-settings (deser-input-decryption-settings (input "decryptionSettings")))))

(clojure.core/defn- deser-h-265-alternate-transfer-function-sei [input] (clojure.core/get {"DISABLED" :disabled, "ENABLED" :enabled} input))

(clojure.core/defn- deser-m-2ts-ebp-audio-interval [input] (clojure.core/get {"VIDEO_AND_FIXED_INTERVALS" :video-and-fixed-intervals, "VIDEO_INTERVAL" :video-interval} input))

(clojure.core/defn- deser-input-psi-control [input] (clojure.core/get {"IGNORE_PSI" :ignore-psi, "USE_PSI" :use-psi} input))

(clojure.core/defn- deser-burnin-subtitle-alignment [input] (clojure.core/get {"CENTERED" :centered, "LEFT" :left} input))

(clojure.core/defn- deser-file-source-settings [input] (clojure.core/cond-> {} (clojure.core/contains? input "convert608To708") (clojure.core/assoc :convert-608-to-708 (deser-file-source-convert-608-to-708 (input "convert608To708"))) (clojure.core/contains? input "sourceFile") (clojure.core/assoc :source-file (deser-string-min-14-pattern-s-3-scc-scc-ttml-ttml-dfxp-dfxp-stl-stl-srt-srt-smi-smi (input "sourceFile"))) (clojure.core/contains? input "timeDelta") (clojure.core/assoc :time-delta (deser-integer-min-negative-2147483648-max-2147483647 (input "timeDelta")))))

(clojure.core/defn- deser-prores-interlace-mode [input] (clojure.core/get {"PROGRESSIVE" :progressive, "TOP_FIELD" :top-field, "BOTTOM_FIELD" :bottom-field, "FOLLOW_TOP_FIELD" :follow-top-field, "FOLLOW_BOTTOM_FIELD" :follow-bottom-field} input))

(clojure.core/defn- deser-caption-source-type [input] (clojure.core/get {"SCC" :scc, "STL" :stl, "SRT" :srt, "TELETEXT" :teletext, "DVB_SUB" :dvb-sub, "SMI" :smi, "SCTE20" :scte-20, "EMBEDDED" :embedded, "TTML" :ttml, "NULL_SOURCE" :null-source, "IMSC" :imsc, "ANCILLARY" :ancillary} input))

(clojure.core/defn- deser-string-min-1-max-256 [input] input)

(clojure.core/defn- deser-motion-image-inserter [input] (clojure.core/cond-> {} (clojure.core/contains? input "framerate") (clojure.core/assoc :framerate (deser-motion-image-insertion-framerate (input "framerate"))) (clojure.core/contains? input "input") (clojure.core/assoc :input (deser-string-min-14-max-1285-pattern-s-3-mov-09-png (input "input"))) (clojure.core/contains? input "insertionMode") (clojure.core/assoc :insertion-mode (deser-motion-image-insertion-mode (input "insertionMode"))) (clojure.core/contains? input "offset") (clojure.core/assoc :offset (deser-motion-image-insertion-offset (input "offset"))) (clojure.core/contains? input "playback") (clojure.core/assoc :playback (deser-motion-image-playback (input "playback"))) (clojure.core/contains? input "startTime") (clojure.core/assoc :start-time (deser-string-min-11-max-11-pattern-01-d-20305-d-205-d (input "startTime")))))

(clojure.core/defn- deser-color-metadata [input] (clojure.core/get {"IGNORE" :ignore, "INSERT" :insert} input))

(clojure.core/defn- deser-integer-min-48000-max-48000 [input] input)

(clojure.core/defn- deser-double-min-negative-59-max-0 [input] input)

(clojure.core/defn- deser-string-min-16-max-24-pattern-a-za-z-0922-a-za-z-0916 [input] input)

(clojure.core/defn- deser-integer-min-1000-max-300000000 [input] input)

(clojure.core/defn- deser-list-of-queue [input] (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (deser-queue coll))) input))

(clojure.core/defn- deser-video-codec-settings [input] (clojure.core/cond-> {} (clojure.core/contains? input "codec") (clojure.core/assoc :codec (deser-video-codec (input "codec"))) (clojure.core/contains? input "frameCaptureSettings") (clojure.core/assoc :frame-capture-settings (deser-frame-capture-settings (input "frameCaptureSettings"))) (clojure.core/contains? input "h264Settings") (clojure.core/assoc :h-264-settings (deser-h-264-settings (input "h264Settings"))) (clojure.core/contains? input "h265Settings") (clojure.core/assoc :h-265-settings (deser-h-265-settings (input "h265Settings"))) (clojure.core/contains? input "mpeg2Settings") (clojure.core/assoc :mpeg-2-settings (deser-mpeg-2-settings (input "mpeg2Settings"))) (clojure.core/contains? input "proresSettings") (clojure.core/assoc :prores-settings (deser-prores-settings (input "proresSettings")))))

(clojure.core/defn- deser-h-264-qvbr-settings [input] (clojure.core/cond-> {} (clojure.core/contains? input "maxAverageBitrate") (clojure.core/assoc :max-average-bitrate (deser-integer-min-1000-max-1152000000 (input "maxAverageBitrate"))) (clojure.core/contains? input "qvbrQualityLevel") (clojure.core/assoc :qvbr-quality-level (deser-integer-min-1-max-10 (input "qvbrQualityLevel")))))

(clojure.core/defn- deser-ms-smooth-manifest-encoding [input] (clojure.core/get {"UTF8" :utf-8, "UTF16" :utf-16} input))

(clojure.core/defn- deser-output-group-type [input] (clojure.core/get {"HLS_GROUP_SETTINGS" :hls-group-settings, "DASH_ISO_GROUP_SETTINGS" :dash-iso-group-settings, "FILE_GROUP_SETTINGS" :file-group-settings, "MS_SMOOTH_GROUP_SETTINGS" :ms-smooth-group-settings, "CMAF_GROUP_SETTINGS" :cmaf-group-settings} input))

(clojure.core/defn- deser-eac-3-dc-filter [input] (clojure.core/get {"ENABLED" :enabled, "DISABLED" :disabled} input))

(clojure.core/defn- deser-h-264-scene-change-detect [input] (clojure.core/get {"DISABLED" :disabled, "ENABLED" :enabled} input))

(clojure.core/defn- deser-noise-reducer [input] (clojure.core/cond-> {} (clojure.core/contains? input "filter") (clojure.core/assoc :filter (deser-noise-reducer-filter (input "filter"))) (clojure.core/contains? input "filterSettings") (clojure.core/assoc :filter-settings (deser-noise-reducer-filter-settings (input "filterSettings"))) (clojure.core/contains? input "spatialFilterSettings") (clojure.core/assoc :spatial-filter-settings (deser-noise-reducer-spatial-filter-settings (input "spatialFilterSettings")))))

(clojure.core/defn- deser-list-of-string-min-1 [input] (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (deser-string-min-1 coll))) input))

(clojure.core/defn- deser-audio-language-code-control [input] (clojure.core/get {"FOLLOW_INPUT" :follow-input, "USE_CONFIGURED" :use-configured} input))

(clojure.core/defn- deser-input-rotate [input] (clojure.core/get {"DEGREE_0" :degree-0, "DEGREES_90" :degrees-90, "DEGREES_180" :degrees-180, "DEGREES_270" :degrees-270, "AUTO" :auto} input))

(clojure.core/defn- deser-list-of-job [input] (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (deser-job coll))) input))

(clojure.core/defn- deser-integer-min-0-max-50000 [input] input)

(clojure.core/defn- deser-aac-coding-mode [input] (clojure.core/get {"AD_RECEIVER_MIX" :ad-receiver-mix, "CODING_MODE_1_0" :coding-mode-1-0, "CODING_MODE_1_1" :coding-mode-1-1, "CODING_MODE_2_0" :coding-mode-2-0, "CODING_MODE_5_1" :coding-mode-5-1} input))

(clojure.core/defn- deser-list-of-output-group-detail [input] (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (deser-output-group-detail coll))) input))

(clojure.core/defn- deser-h-264-spatial-adaptive-quantization [input] (clojure.core/get {"DISABLED" :disabled, "ENABLED" :enabled} input))

(clojure.core/defn- deser-string-pattern-010920405090509092 [input] input)

(clojure.core/defn- deser-output-settings [input] (clojure.core/cond-> {} (clojure.core/contains? input "hlsSettings") (clojure.core/assoc :hls-settings (deser-hls-settings (input "hlsSettings")))))

(clojure.core/defn- deser-burnin-subtitle-shadow-color [input] (clojure.core/get {"NONE" :none, "BLACK" :black, "WHITE" :white} input))

(clojure.core/defn- deser-input-decryption-settings [input] (clojure.core/cond-> {} (clojure.core/contains? input "decryptionMode") (clojure.core/assoc :decryption-mode (deser-decryption-mode (input "decryptionMode"))) (clojure.core/contains? input "encryptedDecryptionKey") (clojure.core/assoc :encrypted-decryption-key (deser-string-min-24-max-512-pattern-a-za-z-0902 (input "encryptedDecryptionKey"))) (clojure.core/contains? input "initializationVector") (clojure.core/assoc :initialization-vector (deser-string-min-16-max-24-pattern-a-za-z-0922-a-za-z-0916 (input "initializationVector"))) (clojure.core/contains? input "kmsKeyRegion") (clojure.core/assoc :kms-key-region (deser-string-min-9-max-19-pattern-az-26-east-west-central-north-south-east-west-1912 (input "kmsKeyRegion")))))

(clojure.core/defn- deser-h-265-gop-size-units [input] (clojure.core/get {"FRAMES" :frames, "SECONDS" :seconds} input))

(clojure.core/defn- deser-mp-4-cslg-atom [input] (clojure.core/get {"INCLUDE" :include, "EXCLUDE" :exclude} input))

(clojure.core/defn- deser-list-of-output [input] (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (deser-output coll))) input))

(clojure.core/defn- deser-mpeg-2-slow-pal [input] (clojure.core/get {"DISABLED" :disabled, "ENABLED" :enabled} input))

(clojure.core/defn- deser-teletext-destination-settings [input] (clojure.core/cond-> {} (clojure.core/contains? input "pageNumber") (clojure.core/assoc :page-number (deser-string-min-3-max-3-pattern-1809a-faf-09a-eae (input "pageNumber")))))

(clojure.core/defn- deser-output-group [input] (clojure.core/cond-> {} (clojure.core/contains? input "customName") (clojure.core/assoc :custom-name (deser-string (input "customName"))) (clojure.core/contains? input "name") (clojure.core/assoc :name (deser-string (input "name"))) (clojure.core/contains? input "outputGroupSettings") (clojure.core/assoc :output-group-settings (deser-output-group-settings (input "outputGroupSettings"))) (clojure.core/contains? input "outputs") (clojure.core/assoc :outputs (deser-list-of-output (input "outputs")))))

(clojure.core/defn- deser-h-265-quality-tuning-level [input] (clojure.core/get {"SINGLE_PASS" :single-pass, "SINGLE_PASS_HQ" :single-pass-hq, "MULTI_PASS_HQ" :multi-pass-hq} input))

(clojure.core/defn- deser-mpeg-2-dynamic-sub-gop [input] (clojure.core/get {"ADAPTIVE" :adaptive, "STATIC" :static} input))

(clojure.core/defn- deser-image-inserter [input] (clojure.core/cond-> {} (clojure.core/contains? input "insertableImages") (clojure.core/assoc :insertable-images (deser-list-of-insertable-image (input "insertableImages")))))

(clojure.core/defn- deser-hls-client-cache [input] (clojure.core/get {"DISABLED" :disabled, "ENABLED" :enabled} input))

(clojure.core/defn- deser-input-filter-enable [input] (clojure.core/get {"AUTO" :auto, "DISABLE" :disable, "FORCE" :force} input))

(clojure.core/defn- deser-integer-min-0-max-10000 [input] input)

(clojure.core/defn- deser-burnin-subtitle-outline-color [input] (clojure.core/get {"BLACK" :black, "WHITE" :white, "YELLOW" :yellow, "RED" :red, "GREEN" :green, "BLUE" :blue} input))

(clojure.core/defn- deser-embedded-source-settings [input] (clojure.core/cond-> {} (clojure.core/contains? input "convert608To708") (clojure.core/assoc :convert-608-to-708 (deser-embedded-convert-608-to-708 (input "convert608To708"))) (clojure.core/contains? input "source608ChannelNumber") (clojure.core/assoc :source-608-channel-number (deser-integer-min-1-max-4 (input "source608ChannelNumber"))) (clojure.core/contains? input "source608TrackNumber") (clojure.core/assoc :source-608-track-number (deser-integer-min-1-max-1 (input "source608TrackNumber")))))

(clojure.core/defn- deser-cmaf-key-provider-type [input] (clojure.core/get {"STATIC_KEY" :static-key} input))

(clojure.core/defn- deser-integer-min-negative-2147483648-max-2147483647 [input] input)

(clojure.core/defn- deser-h-264-gop-b-reference [input] (clojure.core/get {"DISABLED" :disabled, "ENABLED" :enabled} input))

(clojure.core/defn- deser-video-codec [input] (clojure.core/get {"FRAME_CAPTURE" :frame-capture, "H_264" :h-264, "H_265" :h-265, "MPEG2" :mpeg-2, "PRORES" :prores} input))

(clojure.core/defn- deser-list-of-input [input] (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (deser-input coll))) input))

(clojure.core/defn- deser-integer-min-negative-5-max-5 [input] input)

(clojure.core/defn- deser-integer-min-24-max-60000 [input] input)

(clojure.core/defn- deser-double-min-negative-60-max-3 [input] input)

(clojure.core/defn- deser-list-of-output-detail [input] (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (deser-output-detail coll))) input))

(clojure.core/defn- deser-input-deblock-filter [input] (clojure.core/get {"ENABLED" :enabled, "DISABLED" :disabled} input))

(clojure.core/defn- deser-string-min-14-pattern-s-3-bmp-bmp-png-png-tga-tga [input] input)

(clojure.core/defn- deser-double-min-0-max-2147483647 [input] input)

(clojure.core/defn- deser-job-settings [input] (clojure.core/cond-> {} (clojure.core/contains? input "esam") (clojure.core/assoc :esam (deser-esam-settings (input "esam"))) (clojure.core/contains? input "inputs") (clojure.core/assoc :inputs (deser-list-of-input (input "inputs"))) (clojure.core/contains? input "timedMetadataInsertion") (clojure.core/assoc :timed-metadata-insertion (deser-timed-metadata-insertion (input "timedMetadataInsertion"))) (clojure.core/contains? input "motionImageInserter") (clojure.core/assoc :motion-image-inserter (deser-motion-image-inserter (input "motionImageInserter"))) (clojure.core/contains? input "timecodeConfig") (clojure.core/assoc :timecode-config (deser-timecode-config (input "timecodeConfig"))) (clojure.core/contains? input "adAvailOffset") (clojure.core/assoc :ad-avail-offset (deser-integer-min-negative-1000-max-1000 (input "adAvailOffset"))) (clojure.core/contains? input "outputGroups") (clojure.core/assoc :output-groups (deser-list-of-output-group (input "outputGroups"))) (clojure.core/contains? input "nielsenConfiguration") (clojure.core/assoc :nielsen-configuration (deser-nielsen-configuration (input "nielsenConfiguration"))) (clojure.core/contains? input "availBlanking") (clojure.core/assoc :avail-blanking (deser-avail-blanking (input "availBlanking")))))

(clojure.core/defn- deser-string-min-14-max-1285-pattern-s-3-mov-09-png [input] input)

(clojure.core/defn- deser-audio-codec [input] (clojure.core/get {"AAC" :aac, "MP2" :mp-2, "WAV" :wav, "AIFF" :aiff, "AC3" :ac-3, "EAC3" :eac-3, "PASSTHROUGH" :passthrough} input))

(clojure.core/defn- deser-h-265-settings [input] (clojure.core/cond-> {} (clojure.core/contains? input "rateControlMode") (clojure.core/assoc :rate-control-mode (deser-h-265-rate-control-mode (input "rateControlMode"))) (clojure.core/contains? input "unregisteredSeiTimecode") (clojure.core/assoc :unregistered-sei-timecode (deser-h-265-unregistered-sei-timecode (input "unregisteredSeiTimecode"))) (clojure.core/contains? input "interlaceMode") (clojure.core/assoc :interlace-mode (deser-h-265-interlace-mode (input "interlaceMode"))) (clojure.core/contains? input "minIInterval") (clojure.core/assoc :min-i-interval (deser-integer-min-0-max-30 (input "minIInterval"))) (clojure.core/contains? input "parDenominator") (clojure.core/assoc :par-denominator (deser-integer-min-1-max-2147483647 (input "parDenominator"))) (clojure.core/contains? input "gopBReference") (clojure.core/assoc :gop-b-reference (deser-h-265-gop-b-reference (input "gopBReference"))) (clojure.core/contains? input "numberReferenceFrames") (clojure.core/assoc :number-reference-frames (deser-integer-min-1-max-6 (input "numberReferenceFrames"))) (clojure.core/contains? input "qualityTuningLevel") (clojure.core/assoc :quality-tuning-level (deser-h-265-quality-tuning-level (input "qualityTuningLevel"))) (clojure.core/contains? input "tiles") (clojure.core/assoc :tiles (deser-h-265-tiles (input "tiles"))) (clojure.core/contains? input "adaptiveQuantization") (clojure.core/assoc :adaptive-quantization (deser-h-265-adaptive-quantization (input "adaptiveQuantization"))) (clojure.core/contains? input "framerateDenominator") (clojure.core/assoc :framerate-denominator (deser-integer-min-1-max-2147483647 (input "framerateDenominator"))) (clojure.core/contains? input "framerateControl") (clojure.core/assoc :framerate-control (deser-h-265-framerate-control (input "framerateControl"))) (clojure.core/contains? input "alternateTransferFunctionSei") (clojure.core/assoc :alternate-transfer-function-sei (deser-h-265-alternate-transfer-function-sei (input "alternateTransferFunctionSei"))) (clojure.core/contains? input "hrdBufferSize") (clojure.core/assoc :hrd-buffer-size (deser-integer-min-0-max-1466400000 (input "hrdBufferSize"))) (clojure.core/contains? input "slowPal") (clojure.core/assoc :slow-pal (deser-h-265-slow-pal (input "slowPal"))) (clojure.core/contains? input "dynamicSubGop") (clojure.core/assoc :dynamic-sub-gop (deser-h-265-dynamic-sub-gop (input "dynamicSubGop"))) (clojure.core/contains? input "numberBFramesBetweenReferenceFrames") (clojure.core/assoc :number-b-frames-between-reference-frames (deser-integer-min-0-max-7 (input "numberBFramesBetweenReferenceFrames"))) (clojure.core/contains? input "qvbrSettings") (clojure.core/assoc :qvbr-settings (deser-h-265-qvbr-settings (input "qvbrSettings"))) (clojure.core/contains? input "gopClosedCadence") (clojure.core/assoc :gop-closed-cadence (deser-integer-min-0-max-2147483647 (input "gopClosedCadence"))) (clojure.core/contains? input "spatialAdaptiveQuantization") (clojure.core/assoc :spatial-adaptive-quantization (deser-h-265-spatial-adaptive-quantization (input "spatialAdaptiveQuantization"))) (clojure.core/contains? input "framerateNumerator") (clojure.core/assoc :framerate-numerator (deser-integer-min-1-max-2147483647 (input "framerateNumerator"))) (clojure.core/contains? input "gopSizeUnits") (clojure.core/assoc :gop-size-units (deser-h-265-gop-size-units (input "gopSizeUnits"))) (clojure.core/contains? input "maxBitrate") (clojure.core/assoc :max-bitrate (deser-integer-min-1000-max-1466400000 (input "maxBitrate"))) (clojure.core/contains? input "codecProfile") (clojure.core/assoc :codec-profile (deser-h-265-codec-profile (input "codecProfile"))) (clojure.core/contains? input "temporalIds") (clojure.core/assoc :temporal-ids (deser-h-265-temporal-ids (input "temporalIds"))) (clojure.core/contains? input "flickerAdaptiveQuantization") (clojure.core/assoc :flicker-adaptive-quantization (deser-h-265-flicker-adaptive-quantization (input "flickerAdaptiveQuantization"))) (clojure.core/contains? input "parNumerator") (clojure.core/assoc :par-numerator (deser-integer-min-1-max-2147483647 (input "parNumerator"))) (clojure.core/contains? input "gopSize") (clojure.core/assoc :gop-size (deser-double-min-0 (input "gopSize"))) (clojure.core/contains? input "sampleAdaptiveOffsetFilterMode") (clojure.core/assoc :sample-adaptive-offset-filter-mode (deser-h-265-sample-adaptive-offset-filter-mode (input "sampleAdaptiveOffsetFilterMode"))) (clojure.core/contains? input "parControl") (clojure.core/assoc :par-control (deser-h-265-par-control (input "parControl"))) (clojure.core/contains? input "codecLevel") (clojure.core/assoc :codec-level (deser-h-265-codec-level (input "codecLevel"))) (clojure.core/contains? input "telecine") (clojure.core/assoc :telecine (deser-h-265-telecine (input "telecine"))) (clojure.core/contains? input "hrdBufferInitialFillPercentage") (clojure.core/assoc :hrd-buffer-initial-fill-percentage (deser-integer-min-0-max-100 (input "hrdBufferInitialFillPercentage"))) (clojure.core/contains? input "slices") (clojure.core/assoc :slices (deser-integer-min-1-max-32 (input "slices"))) (clojure.core/contains? input "temporalAdaptiveQuantization") (clojure.core/assoc :temporal-adaptive-quantization (deser-h-265-temporal-adaptive-quantization (input "temporalAdaptiveQuantization"))) (clojure.core/contains? input "framerateConversionAlgorithm") (clojure.core/assoc :framerate-conversion-algorithm (deser-h-265-framerate-conversion-algorithm (input "framerateConversionAlgorithm"))) (clojure.core/contains? input "sceneChangeDetect") (clojure.core/assoc :scene-change-detect (deser-h-265-scene-change-detect (input "sceneChangeDetect"))) (clojure.core/contains? input "writeMp4PackagingType") (clojure.core/assoc :write-mp-4-packaging-type (deser-h-265-write-mp-4-packaging-type (input "writeMp4PackagingType"))) (clojure.core/contains? input "bitrate") (clojure.core/assoc :bitrate (deser-integer-min-1000-max-1466400000 (input "bitrate")))))

(clojure.core/defn- deser-output-group-detail [input] (clojure.core/cond-> {} (clojure.core/contains? input "outputDetails") (clojure.core/assoc :output-details (deser-list-of-output-detail (input "outputDetails")))))

(clojure.core/defn- deser-endpoint [input] (clojure.core/cond-> {} (clojure.core/contains? input "url") (clojure.core/assoc :url (deser-string (input "url")))))

(clojure.core/defn- deser-cmaf-initialization-vector-in-manifest [input] (clojure.core/get {"INCLUDE" :include, "EXCLUDE" :exclude} input))

(clojure.core/defn- deser-ac-3-coding-mode [input] (clojure.core/get {"CODING_MODE_1_0" :coding-mode-1-0, "CODING_MODE_1_1" :coding-mode-1-1, "CODING_MODE_2_0" :coding-mode-2-0, "CODING_MODE_3_2_LFE" :coding-mode-3-2-lfe} input))

(clojure.core/defn- deser-integer-min-10-max-48 [input] input)

(clojure.core/defn- deser-preset [input] (clojure.core/cond-> {:settings (deser-preset-settings (input "settings")), :name (deser-string (input "name"))} (clojure.core/contains? input "arn") (clojure.core/assoc :arn (deser-string (input "arn"))) (clojure.core/contains? input "category") (clojure.core/assoc :category (deser-string (input "category"))) (clojure.core/contains? input "createdAt") (clojure.core/assoc :created-at (deser-timestamp-unix (input "createdAt"))) (clojure.core/contains? input "description") (clojure.core/assoc :description (deser-string (input "description"))) (clojure.core/contains? input "lastUpdated") (clojure.core/assoc :last-updated (deser-timestamp-unix (input "lastUpdated"))) (clojure.core/contains? input "type") (clojure.core/assoc :type (deser-type (input "type")))))

(clojure.core/defn- deser-m-2ts-nielsen-id-3 [input] (clojure.core/get {"INSERT" :insert, "NONE" :none} input))

(clojure.core/defn- deser-integer-min-0-max-10 [input] input)

(clojure.core/defn- deser-aac-rate-control-mode [input] (clojure.core/get {"CBR" :cbr, "VBR" :vbr} input))

(clojure.core/defn- deser-h-264-interlace-mode [input] (clojure.core/get {"PROGRESSIVE" :progressive, "TOP_FIELD" :top-field, "BOTTOM_FIELD" :bottom-field, "FOLLOW_TOP_FIELD" :follow-top-field, "FOLLOW_BOTTOM_FIELD" :follow-bottom-field} input))

(clojure.core/defn- deser-mpeg-2-codec-profile [input] (clojure.core/get {"MAIN" :main, "PROFILE_422" :profile-422} input))

(clojure.core/defn- deser-integer-min-negative-1000-max-1000 [input] input)

(clojure.core/defn- deser-integer-min-1-max-2 [input] input)

(clojure.core/defn- deser-mpeg-2-telecine [input] (clojure.core/get {"NONE" :none, "SOFT" :soft, "HARD" :hard} input))

(clojure.core/defn- deser-audio-normalization-loudness-logging [input] (clojure.core/get {"LOG" :log, "DONT_LOG" :dont-log} input))

(clojure.core/defn- deser-h-265-dynamic-sub-gop [input] (clojure.core/get {"ADAPTIVE" :adaptive, "STATIC" :static} input))

(clojure.core/defn- deser-cmaf-write-dash-manifest [input] (clojure.core/get {"DISABLED" :disabled, "ENABLED" :enabled} input))

(clojure.core/defn- deser-dvb-subtitle-alignment [input] (clojure.core/get {"CENTERED" :centered, "LEFT" :left} input))

(clojure.core/defn- deser-mpeg-2-temporal-adaptive-quantization [input] (clojure.core/get {"DISABLED" :disabled, "ENABLED" :enabled} input))

(clojure.core/defn- deser-aac-codec-profile [input] (clojure.core/get {"LC" :lc, "HEV1" :hev-1, "HEV2" :hev-2} input))

(clojure.core/defn- deser-prores-par-control [input] (clojure.core/get {"INITIALIZE_FROM_SOURCE" :initialize-from-source, "SPECIFIED" :specified} input))

(clojure.core/defn- deser-mpeg-2-par-control [input] (clojure.core/get {"INITIALIZE_FROM_SOURCE" :initialize-from-source, "SPECIFIED" :specified} input))

(clojure.core/defn- deser-deinterlacer [input] (clojure.core/cond-> {} (clojure.core/contains? input "algorithm") (clojure.core/assoc :algorithm (deser-deinterlace-algorithm (input "algorithm"))) (clojure.core/contains? input "control") (clojure.core/assoc :control (deser-deinterlacer-control (input "control"))) (clojure.core/contains? input "mode") (clojure.core/assoc :mode (deser-deinterlacer-mode (input "mode")))))

(clojure.core/defn- deser-cmaf-encryption-settings [input] (clojure.core/cond-> {} (clojure.core/contains? input "constantInitializationVector") (clojure.core/assoc :constant-initialization-vector (deser-string-min-32-max-32-pattern-09a-faf-32 (input "constantInitializationVector"))) (clojure.core/contains? input "encryptionMethod") (clojure.core/assoc :encryption-method (deser-cmaf-encryption-type (input "encryptionMethod"))) (clojure.core/contains? input "initializationVectorInManifest") (clojure.core/assoc :initialization-vector-in-manifest (deser-cmaf-initialization-vector-in-manifest (input "initializationVectorInManifest"))) (clojure.core/contains? input "staticKeyProvider") (clojure.core/assoc :static-key-provider (deser-static-key-provider (input "staticKeyProvider"))) (clojure.core/contains? input "type") (clojure.core/assoc :type (deser-cmaf-key-provider-type (input "type")))))

(clojure.core/defn- deser-mov-clap-atom [input] (clojure.core/get {"INCLUDE" :include, "EXCLUDE" :exclude} input))

(clojure.core/defn- deser-integer-min-negative-180-max-180 [input] input)

(clojure.core/defn- deser-integer-min-64000-max-640000 [input] input)

(clojure.core/defn- deser-respond-to-afd [input] (clojure.core/get {"NONE" :none, "RESPOND" :respond, "PASSTHROUGH" :passthrough} input))

(clojure.core/defn- deser-string-pattern-a-za-z-0932 [input] input)

(clojure.core/defn- deser-eac-3-attenuation-control [input] (clojure.core/get {"ATTENUATE_3_DB" :attenuate-3-db, "NONE" :none} input))

(clojure.core/defn- deser-integer-min-0-max-96 [input] input)

(clojure.core/defn- deser-h-264-framerate-control [input] (clojure.core/get {"INITIALIZE_FROM_SOURCE" :initialize-from-source, "SPECIFIED" :specified} input))

(clojure.core/defn- deser-timecode-config [input] (clojure.core/cond-> {} (clojure.core/contains? input "anchor") (clojure.core/assoc :anchor (deser-string-pattern-010920405090509092 (input "anchor"))) (clojure.core/contains? input "source") (clojure.core/assoc :source (deser-timecode-source (input "source"))) (clojure.core/contains? input "start") (clojure.core/assoc :start (deser-string-pattern-010920405090509092 (input "start"))) (clojure.core/contains? input "timestampOffset") (clojure.core/assoc :timestamp-offset (deser-string-pattern-0940191020191209301 (input "timestampOffset")))))

(clojure.core/defn- deser-dvb-sub-destination-settings [input] (clojure.core/cond-> {} (clojure.core/contains? input "teletextSpacing") (clojure.core/assoc :teletext-spacing (deser-dvb-subtitle-teletext-spacing (input "teletextSpacing"))) (clojure.core/contains? input "outlineColor") (clojure.core/assoc :outline-color (deser-dvb-subtitle-outline-color (input "outlineColor"))) (clojure.core/contains? input "fontScript") (clojure.core/assoc :font-script (deser-font-script (input "fontScript"))) (clojure.core/contains? input "outlineSize") (clojure.core/assoc :outline-size (deser-integer-min-0-max-10 (input "outlineSize"))) (clojure.core/contains? input "shadowColor") (clojure.core/assoc :shadow-color (deser-dvb-subtitle-shadow-color (input "shadowColor"))) (clojure.core/contains? input "shadowOpacity") (clojure.core/assoc :shadow-opacity (deser-integer-min-0-max-255 (input "shadowOpacity"))) (clojure.core/contains? input "shadowYOffset") (clojure.core/assoc :shadow-y-offset (deser-integer-min-negative-2147483648-max-2147483647 (input "shadowYOffset"))) (clojure.core/contains? input "backgroundColor") (clojure.core/assoc :background-color (deser-dvb-subtitle-background-color (input "backgroundColor"))) (clojure.core/contains? input "yPosition") (clojure.core/assoc :y-position (deser-integer-min-0-max-2147483647 (input "yPosition"))) (clojure.core/contains? input "fontColor") (clojure.core/assoc :font-color (deser-dvb-subtitle-font-color (input "fontColor"))) (clojure.core/contains? input "xPosition") (clojure.core/assoc :x-position (deser-integer-min-0-max-2147483647 (input "xPosition"))) (clojure.core/contains? input "fontResolution") (clojure.core/assoc :font-resolution (deser-integer-min-96-max-600 (input "fontResolution"))) (clojure.core/contains? input "fontSize") (clojure.core/assoc :font-size (deser-integer-min-0-max-96 (input "fontSize"))) (clojure.core/contains? input "backgroundOpacity") (clojure.core/assoc :background-opacity (deser-integer-min-0-max-255 (input "backgroundOpacity"))) (clojure.core/contains? input "fontOpacity") (clojure.core/assoc :font-opacity (deser-integer-min-0-max-255 (input "fontOpacity"))) (clojure.core/contains? input "shadowXOffset") (clojure.core/assoc :shadow-x-offset (deser-integer-min-negative-2147483648-max-2147483647 (input "shadowXOffset"))) (clojure.core/contains? input "alignment") (clojure.core/assoc :alignment (deser-dvb-subtitle-alignment (input "alignment")))))

(clojure.core/defn- deser-aac-audio-description-broadcaster-mix [input] (clojure.core/get {"BROADCASTER_MIXED_AD" :broadcaster-mixed-ad, "NORMAL" :normal} input))

(clojure.core/defn- deser-embedded-convert-608-to-708 [input] (clojure.core/get {"UPCONVERT" :upconvert, "DISABLED" :disabled} input))

(clojure.core/defn- deser-string-min-1 [input] input)

(clojure.core/defn- deser-dvb-subtitle-teletext-spacing [input] (clojure.core/get {"FIXED_GRID" :fixed-grid, "PROPORTIONAL" :proportional} input))

(clojure.core/defn- deser-video-timecode-insertion [input] (clojure.core/get {"DISABLED" :disabled, "PIC_TIMING_SEI" :pic-timing-sei} input))

(clojure.core/defn- deser-mp-4-free-space-box [input] (clojure.core/get {"INCLUDE" :include, "EXCLUDE" :exclude} input))

(clojure.core/defn- deser-integer-min-1-max-2147483640 [input] input)

(clojure.core/defn- deser-list-of-string-pattern-09a-faf-809a-faf-409a-faf-409a-faf-409a-faf-12 [input] (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (deser-string-pattern-09a-faf-809a-faf-409a-faf-409a-faf-409a-faf-12 coll))) input))

(clojure.core/defn- deser-audio-selector-group [input] (clojure.core/cond-> {} (clojure.core/contains? input "audioSelectorNames") (clojure.core/assoc :audio-selector-names (deser-list-of-string-min-1 (input "audioSelectorNames")))))

(clojure.core/defn- deser-ac-3-settings [input] (clojure.core/cond-> {} (clojure.core/contains? input "bitrate") (clojure.core/assoc :bitrate (deser-integer-min-64000-max-640000 (input "bitrate"))) (clojure.core/contains? input "bitstreamMode") (clojure.core/assoc :bitstream-mode (deser-ac-3-bitstream-mode (input "bitstreamMode"))) (clojure.core/contains? input "codingMode") (clojure.core/assoc :coding-mode (deser-ac-3-coding-mode (input "codingMode"))) (clojure.core/contains? input "dialnorm") (clojure.core/assoc :dialnorm (deser-integer-min-1-max-31 (input "dialnorm"))) (clojure.core/contains? input "dynamicRangeCompressionProfile") (clojure.core/assoc :dynamic-range-compression-profile (deser-ac-3-dynamic-range-compression-profile (input "dynamicRangeCompressionProfile"))) (clojure.core/contains? input "lfeFilter") (clojure.core/assoc :lfe-filter (deser-ac-3-lfe-filter (input "lfeFilter"))) (clojure.core/contains? input "metadataControl") (clojure.core/assoc :metadata-control (deser-ac-3-metadata-control (input "metadataControl"))) (clojure.core/contains? input "sampleRate") (clojure.core/assoc :sample-rate (deser-integer-min-48000-max-48000 (input "sampleRate")))))

(clojure.core/defn- deser-integer-min-0-max-8 [input] input)

(clojure.core/defn- deser-ms-smooth-group-settings [input] (clojure.core/cond-> {} (clojure.core/contains? input "audioDeduplication") (clojure.core/assoc :audio-deduplication (deser-ms-smooth-audio-deduplication (input "audioDeduplication"))) (clojure.core/contains? input "destination") (clojure.core/assoc :destination (deser-string-pattern-s-3 (input "destination"))) (clojure.core/contains? input "encryption") (clojure.core/assoc :encryption (deser-ms-smooth-encryption-settings (input "encryption"))) (clojure.core/contains? input "fragmentLength") (clojure.core/assoc :fragment-length (deser-integer-min-1-max-2147483647 (input "fragmentLength"))) (clojure.core/contains? input "manifestEncoding") (clojure.core/assoc :manifest-encoding (deser-ms-smooth-manifest-encoding (input "manifestEncoding")))))

(clojure.core/defn- deser-h-265-scene-change-detect [input] (clojure.core/get {"DISABLED" :disabled, "ENABLED" :enabled} input))

(clojure.core/defn- deser-integer-min-0-max-7 [input] input)

(clojure.core/defn- deser-reservation-plan-status [input] (clojure.core/get {"ACTIVE" :active, "EXPIRED" :expired} input))

(clojure.core/defn- deser-h-264-entropy-encoding [input] (clojure.core/get {"CABAC" :cabac, "CAVLC" :cavlc} input))

(clojure.core/defn- deser-hls-initialization-vector-in-manifest [input] (clojure.core/get {"INCLUDE" :include, "EXCLUDE" :exclude} input))

(clojure.core/defn- deser-h-265-spatial-adaptive-quantization [input] (clojure.core/get {"DISABLED" :disabled, "ENABLED" :enabled} input))

(clojure.core/defn- deser-mov-cslg-atom [input] (clojure.core/get {"INCLUDE" :include, "EXCLUDE" :exclude} input))

(clojure.core/defn- deser-output [input] (clojure.core/cond-> {} (clojure.core/contains? input "audioDescriptions") (clojure.core/assoc :audio-descriptions (deser-list-of-audio-description (input "audioDescriptions"))) (clojure.core/contains? input "captionDescriptions") (clojure.core/assoc :caption-descriptions (deser-list-of-caption-description (input "captionDescriptions"))) (clojure.core/contains? input "containerSettings") (clojure.core/assoc :container-settings (deser-container-settings (input "containerSettings"))) (clojure.core/contains? input "extension") (clojure.core/assoc :extension (deser-string (input "extension"))) (clojure.core/contains? input "nameModifier") (clojure.core/assoc :name-modifier (deser-string-min-1 (input "nameModifier"))) (clojure.core/contains? input "outputSettings") (clojure.core/assoc :output-settings (deser-output-settings (input "outputSettings"))) (clojure.core/contains? input "preset") (clojure.core/assoc :preset (deser-string-min-0 (input "preset"))) (clojure.core/contains? input "videoDescription") (clojure.core/assoc :video-description (deser-video-description (input "videoDescription")))))

(clojure.core/defn- deser-string-pattern-identity-a-za-z-26-a-za-z-09163 [input] input)

(clojure.core/defn- deser-integer-min-1-max-17895697 [input] input)

(clojure.core/defn- deser-h-265-codec-profile [input] (clojure.core/get {"MAIN_MAIN" :main-main, "MAIN_HIGH" :main-high, "MAIN10_MAIN" :main-10-main, "MAIN10_HIGH" :main-10-high, "MAIN_422_8BIT_MAIN" :main-422-8-bit-main, "MAIN_422_8BIT_HIGH" :main-422-8-bit-high, "MAIN_422_10BIT_MAIN" :main-422-10-bit-main, "MAIN_422_10BIT_HIGH" :main-422-10-bit-high} input))

(clojure.core/defn- deser-burnin-subtitle-font-color [input] (clojure.core/get {"WHITE" :white, "BLACK" :black, "YELLOW" :yellow, "RED" :red, "GREEN" :green, "BLUE" :blue} input))

(clojure.core/defn- deser-color-space-usage [input] (clojure.core/get {"FORCE" :force, "FALLBACK" :fallback} input))

(clojure.core/defn- deser-integer [input] input)

(clojure.core/defn- deser-aac-settings [input] (clojure.core/cond-> {} (clojure.core/contains? input "rateControlMode") (clojure.core/assoc :rate-control-mode (deser-aac-rate-control-mode (input "rateControlMode"))) (clojure.core/contains? input "codingMode") (clojure.core/assoc :coding-mode (deser-aac-coding-mode (input "codingMode"))) (clojure.core/contains? input "sampleRate") (clojure.core/assoc :sample-rate (deser-integer-min-8000-max-96000 (input "sampleRate"))) (clojure.core/contains? input "vbrQuality") (clojure.core/assoc :vbr-quality (deser-aac-vbr-quality (input "vbrQuality"))) (clojure.core/contains? input "specification") (clojure.core/assoc :specification (deser-aac-specification (input "specification"))) (clojure.core/contains? input "codecProfile") (clojure.core/assoc :codec-profile (deser-aac-codec-profile (input "codecProfile"))) (clojure.core/contains? input "rawFormat") (clojure.core/assoc :raw-format (deser-aac-raw-format (input "rawFormat"))) (clojure.core/contains? input "audioDescriptionBroadcasterMix") (clojure.core/assoc :audio-description-broadcaster-mix (deser-aac-audio-description-broadcaster-mix (input "audioDescriptionBroadcasterMix"))) (clojure.core/contains? input "bitrate") (clojure.core/assoc :bitrate (deser-integer-min-6000-max-1024000 (input "bitrate")))))

(clojure.core/defn- deser-integer-min-1000-max-1466400000 [input] input)

(clojure.core/defn- deser-h-265-temporal-ids [input] (clojure.core/get {"DISABLED" :disabled, "ENABLED" :enabled} input))

(clojure.core/defn- deser-list-of-caption-description [input] (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (deser-caption-description coll))) input))

(clojure.core/defn- deser-embedded-destination-settings [input] (clojure.core/cond-> {} (clojure.core/contains? input "destination608ChannelNumber") (clojure.core/assoc :destination-608-channel-number (deser-integer-min-1-max-4 (input "destination608ChannelNumber")))))

(clojure.core/defn- deser-timestamp-unix [input] input)

(clojure.core/defn- deser-timecode-burnin-position [input] (clojure.core/get {"TOP_CENTER" :top-center, "MIDDLE_LEFT" :middle-left, "MIDDLE_CENTER" :middle-center, "MIDDLE_RIGHT" :middle-right, "BOTTOM_LEFT" :bottom-left, "TOP_LEFT" :top-left, "BOTTOM_CENTER" :bottom-center, "TOP_RIGHT" :top-right, "BOTTOM_RIGHT" :bottom-right} input))

(clojure.core/defn- deser-caption-selector [input] (clojure.core/cond-> {} (clojure.core/contains? input "customLanguageCode") (clojure.core/assoc :custom-language-code (deser-string-min-3-max-3-pattern-a-za-z-3 (input "customLanguageCode"))) (clojure.core/contains? input "languageCode") (clojure.core/assoc :language-code (deser-language-code (input "languageCode"))) (clojure.core/contains? input "sourceSettings") (clojure.core/assoc :source-settings (deser-caption-source-settings (input "sourceSettings")))))

(clojure.core/defn- deser-burnin-destination-settings [input] (clojure.core/cond-> {} (clojure.core/contains? input "teletextSpacing") (clojure.core/assoc :teletext-spacing (deser-burnin-subtitle-teletext-spacing (input "teletextSpacing"))) (clojure.core/contains? input "outlineColor") (clojure.core/assoc :outline-color (deser-burnin-subtitle-outline-color (input "outlineColor"))) (clojure.core/contains? input "fontScript") (clojure.core/assoc :font-script (deser-font-script (input "fontScript"))) (clojure.core/contains? input "outlineSize") (clojure.core/assoc :outline-size (deser-integer-min-0-max-10 (input "outlineSize"))) (clojure.core/contains? input "shadowColor") (clojure.core/assoc :shadow-color (deser-burnin-subtitle-shadow-color (input "shadowColor"))) (clojure.core/contains? input "shadowOpacity") (clojure.core/assoc :shadow-opacity (deser-integer-min-0-max-255 (input "shadowOpacity"))) (clojure.core/contains? input "shadowYOffset") (clojure.core/assoc :shadow-y-offset (deser-integer-min-negative-2147483648-max-2147483647 (input "shadowYOffset"))) (clojure.core/contains? input "backgroundColor") (clojure.core/assoc :background-color (deser-burnin-subtitle-background-color (input "backgroundColor"))) (clojure.core/contains? input "yPosition") (clojure.core/assoc :y-position (deser-integer-min-0-max-2147483647 (input "yPosition"))) (clojure.core/contains? input "fontColor") (clojure.core/assoc :font-color (deser-burnin-subtitle-font-color (input "fontColor"))) (clojure.core/contains? input "xPosition") (clojure.core/assoc :x-position (deser-integer-min-0-max-2147483647 (input "xPosition"))) (clojure.core/contains? input "fontResolution") (clojure.core/assoc :font-resolution (deser-integer-min-96-max-600 (input "fontResolution"))) (clojure.core/contains? input "fontSize") (clojure.core/assoc :font-size (deser-integer-min-0-max-96 (input "fontSize"))) (clojure.core/contains? input "backgroundOpacity") (clojure.core/assoc :background-opacity (deser-integer-min-0-max-255 (input "backgroundOpacity"))) (clojure.core/contains? input "fontOpacity") (clojure.core/assoc :font-opacity (deser-integer-min-0-max-255 (input "fontOpacity"))) (clojure.core/contains? input "shadowXOffset") (clojure.core/assoc :shadow-x-offset (deser-integer-min-negative-2147483648-max-2147483647 (input "shadowXOffset"))) (clojure.core/contains? input "alignment") (clojure.core/assoc :alignment (deser-burnin-subtitle-alignment (input "alignment")))))

(clojure.core/defn- deser-job [input] (clojure.core/cond-> {:role (deser-string (input "role")), :settings (deser-job-settings (input "settings"))} (clojure.core/contains? input "statusUpdateIntervalInSecs") (clojure.core/assoc :status-update-interval-in-secs (deser-integer-min-10-max-600 (input "statusUpdateIntervalInSecs"))) (clojure.core/contains? input "queue") (clojure.core/assoc :queue (deser-string (input "queue"))) (clojure.core/contains? input "outputGroupDetails") (clojure.core/assoc :output-group-details (deser-list-of-output-group-detail (input "outputGroupDetails"))) (clojure.core/contains? input "status") (clojure.core/assoc :status (deser-job-status (input "status"))) (clojure.core/contains? input "jobTemplate") (clojure.core/assoc :job-template (deser-string (input "jobTemplate"))) (clojure.core/contains? input "userMetadata") (clojure.core/assoc :user-metadata (deser-map-of-string (input "userMetadata"))) (clojure.core/contains? input "errorMessage") (clojure.core/assoc :error-message (deser-string (input "errorMessage"))) (clojure.core/contains? input "accelerationSettings") (clojure.core/assoc :acceleration-settings (deser-acceleration-settings (input "accelerationSettings"))) (clojure.core/contains? input "errorCode") (clojure.core/assoc :error-code (deser-integer (input "errorCode"))) (clojure.core/contains? input "timing") (clojure.core/assoc :timing (deser-timing (input "timing"))) (clojure.core/contains? input "arn") (clojure.core/assoc :arn (deser-string (input "arn"))) (clojure.core/contains? input "createdAt") (clojure.core/assoc :created-at (deser-timestamp-unix (input "createdAt"))) (clojure.core/contains? input "billingTagsSource") (clojure.core/assoc :billing-tags-source (deser-billing-tags-source (input "billingTagsSource"))) (clojure.core/contains? input "id") (clojure.core/assoc :id (deser-string (input "id")))))

(clojure.core/defn- deser-hls-group-settings [input] (clojure.core/cond-> {} (clojure.core/contains? input "segmentLength") (clojure.core/assoc :segment-length (deser-integer-min-1-max-2147483647 (input "segmentLength"))) (clojure.core/contains? input "timestampDeltaMilliseconds") (clojure.core/assoc :timestamp-delta-milliseconds (deser-integer-min-negative-2147483648-max-2147483647 (input "timestampDeltaMilliseconds"))) (clojure.core/contains? input "programDateTimePeriod") (clojure.core/assoc :program-date-time-period (deser-integer-min-0-max-3600 (input "programDateTimePeriod"))) (clojure.core/contains? input "segmentControl") (clojure.core/assoc :segment-control (deser-hls-segment-control (input "segmentControl"))) (clojure.core/contains? input "adMarkers") (clojure.core/assoc :ad-markers (deser-list-of-hls-ad-markers (input "adMarkers"))) (clojure.core/contains? input "baseUrl") (clojure.core/assoc :base-url (deser-string (input "baseUrl"))) (clojure.core/contains? input "destination") (clojure.core/assoc :destination (deser-string-pattern-s-3 (input "destination"))) (clojure.core/contains? input "minFinalSegmentLength") (clojure.core/assoc :min-final-segment-length (deser-double-min-0-max-2147483647 (input "minFinalSegmentLength"))) (clojure.core/contains? input "captionLanguageMappings") (clojure.core/assoc :caption-language-mappings (deser-list-of-hls-caption-language-mapping (input "captionLanguageMappings"))) (clojure.core/contains? input "timedMetadataId3Frame") (clojure.core/assoc :timed-metadata-id-3-frame (deser-hls-timed-metadata-id-3-frame (input "timedMetadataId3Frame"))) (clojure.core/contains? input "directoryStructure") (clojure.core/assoc :directory-structure (deser-hls-directory-structure (input "directoryStructure"))) (clojure.core/contains? input "minSegmentLength") (clojure.core/assoc :min-segment-length (deser-integer-min-0-max-2147483647 (input "minSegmentLength"))) (clojure.core/contains? input "streamInfResolution") (clojure.core/assoc :stream-inf-resolution (deser-hls-stream-inf-resolution (input "streamInfResolution"))) (clojure.core/contains? input "programDateTime") (clojure.core/assoc :program-date-time (deser-hls-program-date-time (input "programDateTime"))) (clojure.core/contains? input "outputSelection") (clojure.core/assoc :output-selection (deser-hls-output-selection (input "outputSelection"))) (clojure.core/contains? input "captionLanguageSetting") (clojure.core/assoc :caption-language-setting (deser-hls-caption-language-setting (input "captionLanguageSetting"))) (clojure.core/contains? input "manifestDurationFormat") (clojure.core/assoc :manifest-duration-format (deser-hls-manifest-duration-format (input "manifestDurationFormat"))) (clojure.core/contains? input "timedMetadataId3Period") (clojure.core/assoc :timed-metadata-id-3-period (deser-integer-min-negative-2147483648-max-2147483647 (input "timedMetadataId3Period"))) (clojure.core/contains? input "manifestCompression") (clojure.core/assoc :manifest-compression (deser-hls-manifest-compression (input "manifestCompression"))) (clojure.core/contains? input "segmentsPerSubdirectory") (clojure.core/assoc :segments-per-subdirectory (deser-integer-min-1-max-2147483647 (input "segmentsPerSubdirectory"))) (clojure.core/contains? input "encryption") (clojure.core/assoc :encryption (deser-hls-encryption-settings (input "encryption"))) (clojure.core/contains? input "codecSpecification") (clojure.core/assoc :codec-specification (deser-hls-codec-specification (input "codecSpecification"))) (clojure.core/contains? input "clientCache") (clojure.core/assoc :client-cache (deser-hls-client-cache (input "clientCache")))))

(clojure.core/defn- deser-dvb-nit-settings [input] (clojure.core/cond-> {} (clojure.core/contains? input "networkId") (clojure.core/assoc :network-id (deser-integer-min-0-max-65535 (input "networkId"))) (clojure.core/contains? input "networkName") (clojure.core/assoc :network-name (deser-string-min-1-max-256 (input "networkName"))) (clojure.core/contains? input "nitInterval") (clojure.core/assoc :nit-interval (deser-integer-min-25-max-10000 (input "nitInterval")))))

(clojure.core/defn- deser-cmaf-manifest-duration-format [input] (clojure.core/get {"FLOATING_POINT" :floating-point, "INTEGER" :integer} input))

(clojure.core/defn- deser-h-265-write-mp-4-packaging-type [input] (clojure.core/get {"HVC1" :hvc-1, "HEV1" :hev-1} input))

(clojure.core/defn- deser-hls-segment-control [input] (clojure.core/get {"SINGLE_FILE" :single-file, "SEGMENTED_FILES" :segmented-files} input))

(clojure.core/defn- deser-prores-telecine [input] (clojure.core/get {"NONE" :none, "HARD" :hard} input))

(clojure.core/defn- deser-ac-3-dynamic-range-compression-profile [input] (clojure.core/get {"FILM_STANDARD" :film-standard, "NONE" :none} input))

(clojure.core/defn- deser-h-265-flicker-adaptive-quantization [input] (clojure.core/get {"DISABLED" :disabled, "ENABLED" :enabled} input))

(clojure.core/defn- deser-string-min-3-max-3-pattern-a-za-z-3 [input] input)

(clojure.core/defn- deser-double-min-negative-60-max-negative-1 [input] input)

(clojure.core/defn- deser-m-2ts-scte-35-esam [input] (clojure.core/cond-> {} (clojure.core/contains? input "scte35EsamPid") (clojure.core/assoc :scte-35-esam-pid (deser-integer-min-32-max-8182 (input "scte35EsamPid")))))

(clojure.core/defn- deser-frame-capture-settings [input] (clojure.core/cond-> {} (clojure.core/contains? input "framerateDenominator") (clojure.core/assoc :framerate-denominator (deser-integer-min-1-max-2147483647 (input "framerateDenominator"))) (clojure.core/contains? input "framerateNumerator") (clojure.core/assoc :framerate-numerator (deser-integer-min-1-max-2147483647 (input "framerateNumerator"))) (clojure.core/contains? input "maxCaptures") (clojure.core/assoc :max-captures (deser-integer-min-1-max-10000000 (input "maxCaptures"))) (clojure.core/contains? input "quality") (clojure.core/assoc :quality (deser-integer-min-1-max-100 (input "quality")))))

(clojure.core/defn- deser-hls-program-date-time [input] (clojure.core/get {"INCLUDE" :include, "EXCLUDE" :exclude} input))

(clojure.core/defn- deser-h-265-framerate-control [input] (clojure.core/get {"INITIALIZE_FROM_SOURCE" :initialize-from-source, "SPECIFIED" :specified} input))

(clojure.core/defn- deser-nielsen-configuration [input] (clojure.core/cond-> {} (clojure.core/contains? input "breakoutCode") (clojure.core/assoc :breakout-code (deser-integer-min-0-max-9 (input "breakoutCode"))) (clojure.core/contains? input "distributorId") (clojure.core/assoc :distributor-id (deser-string (input "distributorId")))))

(clojure.core/defn- deser-static-key-provider [input] (clojure.core/cond-> {} (clojure.core/contains? input "keyFormat") (clojure.core/assoc :key-format (deser-string-pattern-identity-a-za-z-26-a-za-z-09163 (input "keyFormat"))) (clojure.core/contains? input "keyFormatVersions") (clojure.core/assoc :key-format-versions (deser-string-pattern-dd (input "keyFormatVersions"))) (clojure.core/contains? input "staticKeyValue") (clojure.core/assoc :static-key-value (deser-string-pattern-a-za-z-0932 (input "staticKeyValue"))) (clojure.core/contains? input "url") (clojure.core/assoc :url (deser-string (input "url")))))

(clojure.core/defn- deser-esam-settings [input] (clojure.core/cond-> {} (clojure.core/contains? input "manifestConfirmConditionNotification") (clojure.core/assoc :manifest-confirm-condition-notification (deser-esam-manifest-confirm-condition-notification (input "manifestConfirmConditionNotification"))) (clojure.core/contains? input "responseSignalPreroll") (clojure.core/assoc :response-signal-preroll (deser-integer-min-0-max-30000 (input "responseSignalPreroll"))) (clojure.core/contains? input "signalProcessingNotification") (clojure.core/assoc :signal-processing-notification (deser-esam-signal-processing-notification (input "signalProcessingNotification")))))

(clojure.core/defn- deser-decryption-mode [input] (clojure.core/get {"AES_CTR" :aes-ctr, "AES_CBC" :aes-cbc, "AES_GCM" :aes-gcm} input))

(clojure.core/defn- deser-integer-min-1000-max-1152000000 [input] input)

(clojure.core/defn- deser-audio-codec-settings [input] (clojure.core/cond-> {} (clojure.core/contains? input "aacSettings") (clojure.core/assoc :aac-settings (deser-aac-settings (input "aacSettings"))) (clojure.core/contains? input "ac3Settings") (clojure.core/assoc :ac-3-settings (deser-ac-3-settings (input "ac3Settings"))) (clojure.core/contains? input "aiffSettings") (clojure.core/assoc :aiff-settings (deser-aiff-settings (input "aiffSettings"))) (clojure.core/contains? input "codec") (clojure.core/assoc :codec (deser-audio-codec (input "codec"))) (clojure.core/contains? input "eac3Settings") (clojure.core/assoc :eac-3-settings (deser-eac-3-settings (input "eac3Settings"))) (clojure.core/contains? input "mp2Settings") (clojure.core/assoc :mp-2-settings (deser-mp-2-settings (input "mp2Settings"))) (clojure.core/contains? input "wavSettings") (clojure.core/assoc :wav-settings (deser-wav-settings (input "wavSettings")))))

(clojure.core/defn- deser-mpeg-2-intra-dc-precision [input] (clojure.core/get {"AUTO" :auto, "INTRA_DC_PRECISION_8" :intra-dc-precision-8, "INTRA_DC_PRECISION_9" :intra-dc-precision-9, "INTRA_DC_PRECISION_10" :intra-dc-precision-10, "INTRA_DC_PRECISION_11" :intra-dc-precision-11} input))

(clojure.core/defn- deser-mpeg-2-spatial-adaptive-quantization [input] (clojure.core/get {"DISABLED" :disabled, "ENABLED" :enabled} input))

(clojure.core/defn- deser-rectangle [input] (clojure.core/cond-> {} (clojure.core/contains? input "height") (clojure.core/assoc :height (deser-integer-min-2-max-2147483647 (input "height"))) (clojure.core/contains? input "width") (clojure.core/assoc :width (deser-integer-min-2-max-2147483647 (input "width"))) (clojure.core/contains? input "x") (clojure.core/assoc :x (deser-integer-min-0-max-2147483647 (input "x"))) (clojure.core/contains? input "y") (clojure.core/assoc :y (deser-integer-min-0-max-2147483647 (input "y")))))

(clojure.core/defn- deser-mpeg-2-quality-tuning-level [input] (clojure.core/get {"SINGLE_PASS" :single-pass, "MULTI_PASS" :multi-pass} input))

(clojure.core/defn- deser-integer-min-1-max-32 [input] input)

(clojure.core/defn- deser-dash-iso-group-settings [input] (clojure.core/cond-> {} (clojure.core/contains? input "segmentLength") (clojure.core/assoc :segment-length (deser-integer-min-1-max-2147483647 (input "segmentLength"))) (clojure.core/contains? input "minBufferTime") (clojure.core/assoc :min-buffer-time (deser-integer-min-0-max-2147483647 (input "minBufferTime"))) (clojure.core/contains? input "writeSegmentTimelineInRepresentation") (clojure.core/assoc :write-segment-timeline-in-representation (deser-dash-iso-write-segment-timeline-in-representation (input "writeSegmentTimelineInRepresentation"))) (clojure.core/contains? input "fragmentLength") (clojure.core/assoc :fragment-length (deser-integer-min-1-max-2147483647 (input "fragmentLength"))) (clojure.core/contains? input "hbbtvCompliance") (clojure.core/assoc :hbbtv-compliance (deser-dash-iso-hbbtv-compliance (input "hbbtvCompliance"))) (clojure.core/contains? input "segmentControl") (clojure.core/assoc :segment-control (deser-dash-iso-segment-control (input "segmentControl"))) (clojure.core/contains? input "baseUrl") (clojure.core/assoc :base-url (deser-string (input "baseUrl"))) (clojure.core/contains? input "destination") (clojure.core/assoc :destination (deser-string-pattern-s-3 (input "destination"))) (clojure.core/contains? input "encryption") (clojure.core/assoc :encryption (deser-dash-iso-encryption-settings (input "encryption")))))

(clojure.core/defn- deser-ms-smooth-audio-deduplication [input] (clojure.core/get {"COMBINE_DUPLICATE_STREAMS" :combine-duplicate-streams, "NONE" :none} input))

(clojure.core/defn- deser-aac-specification [input] (clojure.core/get {"MPEG2" :mpeg-2, "MPEG4" :mpeg-4} input))

(clojure.core/defn- deser-eac-3-passthrough-control [input] (clojure.core/get {"WHEN_POSSIBLE" :when-possible, "NO_PASSTHROUGH" :no-passthrough} input))

(clojure.core/defn- deser-string-pattern-a-za-z-0902 [input] input)

(clojure.core/defn- deser-integer-min-1-max-31 [input] input)

(clojure.core/defn- deser-motion-image-playback [input] (clojure.core/get {"ONCE" :once, "REPEAT" :repeat} input))

(clojure.core/defn- deser-string-min-14-pattern-s-3-bmp-bmp-png-png [input] input)

(clojure.core/defn- deser-audio-normalization-settings [input] (clojure.core/cond-> {} (clojure.core/contains? input "algorithm") (clojure.core/assoc :algorithm (deser-audio-normalization-algorithm (input "algorithm"))) (clojure.core/contains? input "algorithmControl") (clojure.core/assoc :algorithm-control (deser-audio-normalization-algorithm-control (input "algorithmControl"))) (clojure.core/contains? input "correctionGateLevel") (clojure.core/assoc :correction-gate-level (deser-integer-min-negative-70-max-0 (input "correctionGateLevel"))) (clojure.core/contains? input "loudnessLogging") (clojure.core/assoc :loudness-logging (deser-audio-normalization-loudness-logging (input "loudnessLogging"))) (clojure.core/contains? input "peakCalculation") (clojure.core/assoc :peak-calculation (deser-audio-normalization-peak-calculation (input "peakCalculation"))) (clojure.core/contains? input "targetLkfs") (clojure.core/assoc :target-lkfs (deser-double-min-negative-59-max-0 (input "targetLkfs")))))

(clojure.core/defn- deser-billing-tags-source [input] (clojure.core/get {"QUEUE" :queue, "PRESET" :preset, "JOB_TEMPLATE" :job-template} input))

(clojure.core/defn- deser-mpeg-2-settings [input] (clojure.core/cond-> {} (clojure.core/contains? input "rateControlMode") (clojure.core/assoc :rate-control-mode (deser-mpeg-2-rate-control-mode (input "rateControlMode"))) (clojure.core/contains? input "interlaceMode") (clojure.core/assoc :interlace-mode (deser-mpeg-2-interlace-mode (input "interlaceMode"))) (clojure.core/contains? input "minIInterval") (clojure.core/assoc :min-i-interval (deser-integer-min-0-max-30 (input "minIInterval"))) (clojure.core/contains? input "parDenominator") (clojure.core/assoc :par-denominator (deser-integer-min-1-max-2147483647 (input "parDenominator"))) (clojure.core/contains? input "qualityTuningLevel") (clojure.core/assoc :quality-tuning-level (deser-mpeg-2-quality-tuning-level (input "qualityTuningLevel"))) (clojure.core/contains? input "adaptiveQuantization") (clojure.core/assoc :adaptive-quantization (deser-mpeg-2-adaptive-quantization (input "adaptiveQuantization"))) (clojure.core/contains? input "framerateDenominator") (clojure.core/assoc :framerate-denominator (deser-integer-min-1-max-1001 (input "framerateDenominator"))) (clojure.core/contains? input "framerateControl") (clojure.core/assoc :framerate-control (deser-mpeg-2-framerate-control (input "framerateControl"))) (clojure.core/contains? input "hrdBufferSize") (clojure.core/assoc :hrd-buffer-size (deser-integer-min-0-max-47185920 (input "hrdBufferSize"))) (clojure.core/contains? input "slowPal") (clojure.core/assoc :slow-pal (deser-mpeg-2-slow-pal (input "slowPal"))) (clojure.core/contains? input "dynamicSubGop") (clojure.core/assoc :dynamic-sub-gop (deser-mpeg-2-dynamic-sub-gop (input "dynamicSubGop"))) (clojure.core/contains? input "numberBFramesBetweenReferenceFrames") (clojure.core/assoc :number-b-frames-between-reference-frames (deser-integer-min-0-max-7 (input "numberBFramesBetweenReferenceFrames"))) (clojure.core/contains? input "intraDcPrecision") (clojure.core/assoc :intra-dc-precision (deser-mpeg-2-intra-dc-precision (input "intraDcPrecision"))) (clojure.core/contains? input "syntax") (clojure.core/assoc :syntax (deser-mpeg-2-syntax (input "syntax"))) (clojure.core/contains? input "gopClosedCadence") (clojure.core/assoc :gop-closed-cadence (deser-integer-min-0-max-2147483647 (input "gopClosedCadence"))) (clojure.core/contains? input "spatialAdaptiveQuantization") (clojure.core/assoc :spatial-adaptive-quantization (deser-mpeg-2-spatial-adaptive-quantization (input "spatialAdaptiveQuantization"))) (clojure.core/contains? input "framerateNumerator") (clojure.core/assoc :framerate-numerator (deser-integer-min-24-max-60000 (input "framerateNumerator"))) (clojure.core/contains? input "softness") (clojure.core/assoc :softness (deser-integer-min-0-max-128 (input "softness"))) (clojure.core/contains? input "gopSizeUnits") (clojure.core/assoc :gop-size-units (deser-mpeg-2-gop-size-units (input "gopSizeUnits"))) (clojure.core/contains? input "maxBitrate") (clojure.core/assoc :max-bitrate (deser-integer-min-1000-max-300000000 (input "maxBitrate"))) (clojure.core/contains? input "codecProfile") (clojure.core/assoc :codec-profile (deser-mpeg-2-codec-profile (input "codecProfile"))) (clojure.core/contains? input "parNumerator") (clojure.core/assoc :par-numerator (deser-integer-min-1-max-2147483647 (input "parNumerator"))) (clojure.core/contains? input "gopSize") (clojure.core/assoc :gop-size (deser-double-min-0 (input "gopSize"))) (clojure.core/contains? input "parControl") (clojure.core/assoc :par-control (deser-mpeg-2-par-control (input "parControl"))) (clojure.core/contains? input "codecLevel") (clojure.core/assoc :codec-level (deser-mpeg-2-codec-level (input "codecLevel"))) (clojure.core/contains? input "telecine") (clojure.core/assoc :telecine (deser-mpeg-2-telecine (input "telecine"))) (clojure.core/contains? input "hrdBufferInitialFillPercentage") (clojure.core/assoc :hrd-buffer-initial-fill-percentage (deser-integer-min-0-max-100 (input "hrdBufferInitialFillPercentage"))) (clojure.core/contains? input "temporalAdaptiveQuantization") (clojure.core/assoc :temporal-adaptive-quantization (deser-mpeg-2-temporal-adaptive-quantization (input "temporalAdaptiveQuantization"))) (clojure.core/contains? input "framerateConversionAlgorithm") (clojure.core/assoc :framerate-conversion-algorithm (deser-mpeg-2-framerate-conversion-algorithm (input "framerateConversionAlgorithm"))) (clojure.core/contains? input "sceneChangeDetect") (clojure.core/assoc :scene-change-detect (deser-mpeg-2-scene-change-detect (input "sceneChangeDetect"))) (clojure.core/contains? input "bitrate") (clojure.core/assoc :bitrate (deser-integer-min-1000-max-288000000 (input "bitrate")))))

(clojure.core/defn- deser-h-264-settings [input] (clojure.core/cond-> {} (clojure.core/contains? input "rateControlMode") (clojure.core/assoc :rate-control-mode (deser-h-264-rate-control-mode (input "rateControlMode"))) (clojure.core/contains? input "unregisteredSeiTimecode") (clojure.core/assoc :unregistered-sei-timecode (deser-h-264-unregistered-sei-timecode (input "unregisteredSeiTimecode"))) (clojure.core/contains? input "interlaceMode") (clojure.core/assoc :interlace-mode (deser-h-264-interlace-mode (input "interlaceMode"))) (clojure.core/contains? input "minIInterval") (clojure.core/assoc :min-i-interval (deser-integer-min-0-max-30 (input "minIInterval"))) (clojure.core/contains? input "parDenominator") (clojure.core/assoc :par-denominator (deser-integer-min-1-max-2147483647 (input "parDenominator"))) (clojure.core/contains? input "gopBReference") (clojure.core/assoc :gop-b-reference (deser-h-264-gop-b-reference (input "gopBReference"))) (clojure.core/contains? input "numberReferenceFrames") (clojure.core/assoc :number-reference-frames (deser-integer-min-1-max-6 (input "numberReferenceFrames"))) (clojure.core/contains? input "qualityTuningLevel") (clojure.core/assoc :quality-tuning-level (deser-h-264-quality-tuning-level (input "qualityTuningLevel"))) (clojure.core/contains? input "repeatPps") (clojure.core/assoc :repeat-pps (deser-h-264-repeat-pps (input "repeatPps"))) (clojure.core/contains? input "adaptiveQuantization") (clojure.core/assoc :adaptive-quantization (deser-h-264-adaptive-quantization (input "adaptiveQuantization"))) (clojure.core/contains? input "framerateDenominator") (clojure.core/assoc :framerate-denominator (deser-integer-min-1-max-2147483647 (input "framerateDenominator"))) (clojure.core/contains? input "framerateControl") (clojure.core/assoc :framerate-control (deser-h-264-framerate-control (input "framerateControl"))) (clojure.core/contains? input "hrdBufferSize") (clojure.core/assoc :hrd-buffer-size (deser-integer-min-0-max-1152000000 (input "hrdBufferSize"))) (clojure.core/contains? input "slowPal") (clojure.core/assoc :slow-pal (deser-h-264-slow-pal (input "slowPal"))) (clojure.core/contains? input "dynamicSubGop") (clojure.core/assoc :dynamic-sub-gop (deser-h-264-dynamic-sub-gop (input "dynamicSubGop"))) (clojure.core/contains? input "numberBFramesBetweenReferenceFrames") (clojure.core/assoc :number-b-frames-between-reference-frames (deser-integer-min-0-max-7 (input "numberBFramesBetweenReferenceFrames"))) (clojure.core/contains? input "qvbrSettings") (clojure.core/assoc :qvbr-settings (deser-h-264-qvbr-settings (input "qvbrSettings"))) (clojure.core/contains? input "fieldEncoding") (clojure.core/assoc :field-encoding (deser-h-264-field-encoding (input "fieldEncoding"))) (clojure.core/contains? input "syntax") (clojure.core/assoc :syntax (deser-h-264-syntax (input "syntax"))) (clojure.core/contains? input "gopClosedCadence") (clojure.core/assoc :gop-closed-cadence (deser-integer-min-0-max-2147483647 (input "gopClosedCadence"))) (clojure.core/contains? input "spatialAdaptiveQuantization") (clojure.core/assoc :spatial-adaptive-quantization (deser-h-264-spatial-adaptive-quantization (input "spatialAdaptiveQuantization"))) (clojure.core/contains? input "framerateNumerator") (clojure.core/assoc :framerate-numerator (deser-integer-min-1-max-2147483647 (input "framerateNumerator"))) (clojure.core/contains? input "softness") (clojure.core/assoc :softness (deser-integer-min-0-max-128 (input "softness"))) (clojure.core/contains? input "gopSizeUnits") (clojure.core/assoc :gop-size-units (deser-h-264-gop-size-units (input "gopSizeUnits"))) (clojure.core/contains? input "maxBitrate") (clojure.core/assoc :max-bitrate (deser-integer-min-1000-max-1152000000 (input "maxBitrate"))) (clojure.core/contains? input "codecProfile") (clojure.core/assoc :codec-profile (deser-h-264-codec-profile (input "codecProfile"))) (clojure.core/contains? input "flickerAdaptiveQuantization") (clojure.core/assoc :flicker-adaptive-quantization (deser-h-264-flicker-adaptive-quantization (input "flickerAdaptiveQuantization"))) (clojure.core/contains? input "parNumerator") (clojure.core/assoc :par-numerator (deser-integer-min-1-max-2147483647 (input "parNumerator"))) (clojure.core/contains? input "gopSize") (clojure.core/assoc :gop-size (deser-double-min-0 (input "gopSize"))) (clojure.core/contains? input "parControl") (clojure.core/assoc :par-control (deser-h-264-par-control (input "parControl"))) (clojure.core/contains? input "codecLevel") (clojure.core/assoc :codec-level (deser-h-264-codec-level (input "codecLevel"))) (clojure.core/contains? input "telecine") (clojure.core/assoc :telecine (deser-h-264-telecine (input "telecine"))) (clojure.core/contains? input "hrdBufferInitialFillPercentage") (clojure.core/assoc :hrd-buffer-initial-fill-percentage (deser-integer-min-0-max-100 (input "hrdBufferInitialFillPercentage"))) (clojure.core/contains? input "slices") (clojure.core/assoc :slices (deser-integer-min-1-max-32 (input "slices"))) (clojure.core/contains? input "temporalAdaptiveQuantization") (clojure.core/assoc :temporal-adaptive-quantization (deser-h-264-temporal-adaptive-quantization (input "temporalAdaptiveQuantization"))) (clojure.core/contains? input "framerateConversionAlgorithm") (clojure.core/assoc :framerate-conversion-algorithm (deser-h-264-framerate-conversion-algorithm (input "framerateConversionAlgorithm"))) (clojure.core/contains? input "entropyEncoding") (clojure.core/assoc :entropy-encoding (deser-h-264-entropy-encoding (input "entropyEncoding"))) (clojure.core/contains? input "sceneChangeDetect") (clojure.core/assoc :scene-change-detect (deser-h-264-scene-change-detect (input "sceneChangeDetect"))) (clojure.core/contains? input "bitrate") (clojure.core/assoc :bitrate (deser-integer-min-1000-max-1152000000 (input "bitrate")))))

(clojure.core/defn- deser-integer-min-8000-max-96000 [input] input)

(clojure.core/defn- deser-hls-timed-metadata-id-3-frame [input] (clojure.core/get {"NONE" :none, "PRIV" :priv, "TDRL" :tdrl} input))

(clojure.core/defn- deser-output-channel-mapping [input] (clojure.core/cond-> {} (clojure.core/contains? input "inputChannels") (clojure.core/assoc :input-channels (deser-list-of-integer-min-negative-60-max-6 (input "inputChannels")))))

(clojure.core/defn- deser-eac-3-phase-control [input] (clojure.core/get {"SHIFT_90_DEGREES" :shift-90-degrees, "NO_SHIFT" :no-shift} input))

(clojure.core/defn- deser-eac-3-surround-ex-mode [input] (clojure.core/get {"NOT_INDICATED" :not-indicated, "ENABLED" :enabled, "DISABLED" :disabled} input))

(clojure.core/defn- deser-dash-iso-encryption-settings [input] (clojure.core/cond-> {} (clojure.core/contains? input "spekeKeyProvider") (clojure.core/assoc :speke-key-provider (deser-speke-key-provider (input "spekeKeyProvider")))))

(clojure.core/defn- deser-integer-min-1-max-8 [input] input)

(clojure.core/defn- deser-list-of-audio-description [input] (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (deser-audio-description coll))) input))

(clojure.core/defn- deser-file-group-settings [input] (clojure.core/cond-> {} (clojure.core/contains? input "destination") (clojure.core/assoc :destination (deser-string-pattern-s-3 (input "destination")))))

(clojure.core/defn- deser-integer-min-0-max-3 [input] input)

(clojure.core/defn- deser-m-3u-8-settings [input] (clojure.core/cond-> {} (clojure.core/contains? input "patInterval") (clojure.core/assoc :pat-interval (deser-integer-min-0-max-1000 (input "patInterval"))) (clojure.core/contains? input "scte35Source") (clojure.core/assoc :scte-35-source (deser-m-3u-8-scte-35-source (input "scte35Source"))) (clojure.core/contains? input "audioFramesPerPes") (clojure.core/assoc :audio-frames-per-pes (deser-integer-min-0-max-2147483647 (input "audioFramesPerPes"))) (clojure.core/contains? input "transportStreamId") (clojure.core/assoc :transport-stream-id (deser-integer-min-0-max-65535 (input "transportStreamId"))) (clojure.core/contains? input "pcrControl") (clojure.core/assoc :pcr-control (deser-m-3u-8-pcr-control (input "pcrControl"))) (clojure.core/contains? input "scte35Pid") (clojure.core/assoc :scte-35-pid (deser-integer-min-32-max-8182 (input "scte35Pid"))) (clojure.core/contains? input "programNumber") (clojure.core/assoc :program-number (deser-integer-min-0-max-65535 (input "programNumber"))) (clojure.core/contains? input "pcrPid") (clojure.core/assoc :pcr-pid (deser-integer-min-32-max-8182 (input "pcrPid"))) (clojure.core/contains? input "pmtPid") (clojure.core/assoc :pmt-pid (deser-integer-min-32-max-8182 (input "pmtPid"))) (clojure.core/contains? input "videoPid") (clojure.core/assoc :video-pid (deser-integer-min-32-max-8182 (input "videoPid"))) (clojure.core/contains? input "audioPids") (clojure.core/assoc :audio-pids (deser-list-of-integer-min-32-max-8182 (input "audioPids"))) (clojure.core/contains? input "timedMetadata") (clojure.core/assoc :timed-metadata (deser-timed-metadata (input "timedMetadata"))) (clojure.core/contains? input "nielsenId3") (clojure.core/assoc :nielsen-id-3 (deser-m-3u-8-nielsen-id-3 (input "nielsenId3"))) (clojure.core/contains? input "pmtInterval") (clojure.core/assoc :pmt-interval (deser-integer-min-0-max-1000 (input "pmtInterval"))) (clojure.core/contains? input "timedMetadataPid") (clojure.core/assoc :timed-metadata-pid (deser-integer-min-32-max-8182 (input "timedMetadataPid"))) (clojure.core/contains? input "privateMetadataPid") (clojure.core/assoc :private-metadata-pid (deser-integer-min-32-max-8182 (input "privateMetadataPid")))))

(clojure.core/defn- deser-eac-3-stereo-downmix [input] (clojure.core/get {"NOT_INDICATED" :not-indicated, "LO_RO" :lo-ro, "LT_RT" :lt-rt, "DPL2" :dpl-2} input))

(clojure.core/defn- deser-mov-mpeg-2-four-cc-control [input] (clojure.core/get {"XDCAM" :xdcam, "MPEG" :mpeg} input))

(clojure.core/defn- deser-wav-settings [input] (clojure.core/cond-> {} (clojure.core/contains? input "bitDepth") (clojure.core/assoc :bit-depth (deser-integer-min-16-max-24 (input "bitDepth"))) (clojure.core/contains? input "channels") (clojure.core/assoc :channels (deser-integer-min-1-max-8 (input "channels"))) (clojure.core/contains? input "format") (clojure.core/assoc :format (deser-wav-format (input "format"))) (clojure.core/contains? input "sampleRate") (clojure.core/assoc :sample-rate (deser-integer-min-8000-max-192000 (input "sampleRate")))))

(clojure.core/defn- deser-integer-min-1-max-10000000 [input] input)

(clojure.core/defn- deser-integer-min-0-max-128 [input] input)

(clojure.core/defn- deser-f-4v-settings [input] (clojure.core/cond-> {} (clojure.core/contains? input "moovPlacement") (clojure.core/assoc :moov-placement (deser-f-4v-moov-placement (input "moovPlacement")))))

(clojure.core/defn- deser-h-264-syntax [input] (clojure.core/get {"DEFAULT" :default, "RP2027" :rp-2027} input))

(clojure.core/defn- deser-noise-reducer-filter-settings [input] (clojure.core/cond-> {} (clojure.core/contains? input "strength") (clojure.core/assoc :strength (deser-integer-min-0-max-3 (input "strength")))))

(clojure.core/defn- deser-list-of-input-clipping [input] (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (deser-input-clipping coll))) input))

(clojure.core/defn- deser-prores-settings [input] (clojure.core/cond-> {} (clojure.core/contains? input "interlaceMode") (clojure.core/assoc :interlace-mode (deser-prores-interlace-mode (input "interlaceMode"))) (clojure.core/contains? input "parDenominator") (clojure.core/assoc :par-denominator (deser-integer-min-1-max-2147483647 (input "parDenominator"))) (clojure.core/contains? input "framerateDenominator") (clojure.core/assoc :framerate-denominator (deser-integer-min-1-max-2147483647 (input "framerateDenominator"))) (clojure.core/contains? input "framerateControl") (clojure.core/assoc :framerate-control (deser-prores-framerate-control (input "framerateControl"))) (clojure.core/contains? input "slowPal") (clojure.core/assoc :slow-pal (deser-prores-slow-pal (input "slowPal"))) (clojure.core/contains? input "framerateNumerator") (clojure.core/assoc :framerate-numerator (deser-integer-min-1-max-2147483647 (input "framerateNumerator"))) (clojure.core/contains? input "codecProfile") (clojure.core/assoc :codec-profile (deser-prores-codec-profile (input "codecProfile"))) (clojure.core/contains? input "parNumerator") (clojure.core/assoc :par-numerator (deser-integer-min-1-max-2147483647 (input "parNumerator"))) (clojure.core/contains? input "parControl") (clojure.core/assoc :par-control (deser-prores-par-control (input "parControl"))) (clojure.core/contains? input "telecine") (clojure.core/assoc :telecine (deser-prores-telecine (input "telecine"))) (clojure.core/contains? input "framerateConversionAlgorithm") (clojure.core/assoc :framerate-conversion-algorithm (deser-prores-framerate-conversion-algorithm (input "framerateConversionAlgorithm")))))

(clojure.core/defn- deser-map-of-string [input] (clojure.core/into {} (clojure.core/map (clojure.core/fn [[k v]] [(deser-string k) (deser-string v)])) input))

(clojure.core/defn- deser-queue-status [input] (clojure.core/get {"ACTIVE" :active, "PAUSED" :paused} input))

(clojure.core/defn- deser-list-of-string-pattern-s-3-assetmap-xml [input] (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (deser-string-pattern-s-3-assetmap-xml coll))) input))

(clojure.core/defn- deser-list-of-input-template [input] (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (deser-input-template coll))) input))

(clojure.core/defn- deser-string-pattern-09a-faf-809a-faf-409a-faf-409a-faf-409a-faf-12 [input] input)

(clojure.core/defn- deser-h-265-interlace-mode [input] (clojure.core/get {"PROGRESSIVE" :progressive, "TOP_FIELD" :top-field, "BOTTOM_FIELD" :bottom-field, "FOLLOW_TOP_FIELD" :follow-top-field, "FOLLOW_BOTTOM_FIELD" :follow-bottom-field} input))

(clojure.core/defn- deser-hls-codec-specification [input] (clojure.core/get {"RFC_6381" :rfc-6381, "RFC_4281" :rfc-4281} input))

(clojure.core/defn- deser-color-space-conversion [input] (clojure.core/get {"NONE" :none, "FORCE_601" :force-601, "FORCE_709" :force-709, "FORCE_HDR10" :force-hdr-10, "FORCE_HLG_2020" :force-hlg-2020} input))

(clojure.core/defn- deser-h-264-codec-level [input] (clojure.core/get {"LEVEL_2_1" :level-2-1, "LEVEL_1_3" :level-1-3, "LEVEL_5" :level-5, "LEVEL_1" :level-1, "LEVEL_3_2" :level-3-2, "AUTO" :auto, "LEVEL_4_1" :level-4-1, "LEVEL_5_1" :level-5-1, "LEVEL_5_2" :level-5-2, "LEVEL_4" :level-4, "LEVEL_2" :level-2, "LEVEL_3" :level-3, "LEVEL_1_1" :level-1-1, "LEVEL_4_2" :level-4-2, "LEVEL_3_1" :level-3-1, "LEVEL_2_2" :level-2-2, "LEVEL_1_2" :level-1-2} input))

(clojure.core/defn- deser-avail-blanking [input] (clojure.core/cond-> {} (clojure.core/contains? input "availBlankingImage") (clojure.core/assoc :avail-blanking-image (deser-string-min-14-pattern-s-3-bmp-bmp-png-png (input "availBlankingImage")))))

(clojure.core/defn- deser-string-pattern [input] input)

(clojure.core/defn- deser-audio-selector [input] (clojure.core/cond-> {} (clojure.core/contains? input "pids") (clojure.core/assoc :pids (deser-list-of-integer-min-1-max-2147483647 (input "pids"))) (clojure.core/contains? input "customLanguageCode") (clojure.core/assoc :custom-language-code (deser-string-min-3-max-3-pattern-a-za-z-3 (input "customLanguageCode"))) (clojure.core/contains? input "remixSettings") (clojure.core/assoc :remix-settings (deser-remix-settings (input "remixSettings"))) (clojure.core/contains? input "offset") (clojure.core/assoc :offset (deser-integer-min-negative-2147483648-max-2147483647 (input "offset"))) (clojure.core/contains? input "defaultSelection") (clojure.core/assoc :default-selection (deser-audio-default-selection (input "defaultSelection"))) (clojure.core/contains? input "tracks") (clojure.core/assoc :tracks (deser-list-of-integer-min-1-max-2147483647 (input "tracks"))) (clojure.core/contains? input "languageCode") (clojure.core/assoc :language-code (deser-language-code (input "languageCode"))) (clojure.core/contains? input "externalAudioFileInput") (clojure.core/assoc :external-audio-file-input (deser-string-pattern-s-3-mm-2-vvmmppeeggaavviimmpp-4-ffllvvmmppttmmppggmm-4-vvttrrppff-4-vvmm-2-ttssttss-264-hh-264-mmkkvvmmoovvmmttssmm-2-ttwwmmvvaassffvvoobb-3-ggpp-3-ggppppmmxxffddiivvxxxxvviiddrraawwddvvggxxffmm-1-vv-3-gg-2-vvmmffmm-3-uu-8-llcchhggxxffmmppeegg-2-mmxxffmmppeegg-2-mmxxffhhddwwaavvyy-4-mmaaaaccaaiiffffmmpp-2-aacc-3-eecc-3-ddttssee (input "externalAudioFileInput"))) (clojure.core/contains? input "programSelection") (clojure.core/assoc :program-selection (deser-integer-min-0-max-8 (input "programSelection"))) (clojure.core/contains? input "selectorType") (clojure.core/assoc :selector-type (deser-audio-selector-type (input "selectorType")))))

(clojure.core/defn- deser-map-of-caption-selector [input] (clojure.core/into {} (clojure.core/map (clojure.core/fn [[k v]] [(deser-string k) (deser-caption-selector v)])) input))

(clojure.core/defn- deser-integer-min-1-max-16 [input] input)

(clojure.core/defn- deser-integer-min-0-max-1466400000 [input] input)

(clojure.core/defn- deser-audio-default-selection [input] (clojure.core/get {"DEFAULT" :default, "NOT_DEFAULT" :not-default} input))

(clojure.core/defn- response-get-job-response ([input] (response-get-job-response nil input)) ([resultWrapper1320656 input] (clojure.core/let [rawinput1320655 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar1320657 {"job" (rawinput1320655 "job")}] (clojure.core/cond-> {} (letvar1320657 "job") (clojure.core/assoc :job (deser-job (clojure.core/get-in letvar1320657 ["job"])))))))

(clojure.core/defn- response-internal-server-error-exception ([input] (response-internal-server-error-exception nil input)) ([resultWrapper1320659 input] (clojure.core/let [rawinput1320658 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar1320660 {"message" (rawinput1320658 "message")}] (clojure.core/cond-> {} (letvar1320660 "message") (clojure.core/assoc :message (deser-string (clojure.core/get-in letvar1320660 ["message"])))))))

(clojure.core/defn- response-create-job-template-response ([input] (response-create-job-template-response nil input)) ([resultWrapper1320662 input] (clojure.core/let [rawinput1320661 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar1320663 {"jobTemplate" (rawinput1320661 "jobTemplate")}] (clojure.core/cond-> {} (letvar1320663 "jobTemplate") (clojure.core/assoc :job-template (deser-job-template (clojure.core/get-in letvar1320663 ["jobTemplate"])))))))

(clojure.core/defn- response-cancel-job-response ([input] (response-cancel-job-response nil input)) ([resultWrapper1320665 input] (clojure.core/let [rawinput1320664 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar1320666 {}] (clojure.core/cond-> {}))))

(clojure.core/defn- response-get-job-template-response ([input] (response-get-job-template-response nil input)) ([resultWrapper1320668 input] (clojure.core/let [rawinput1320667 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar1320669 {"jobTemplate" (rawinput1320667 "jobTemplate")}] (clojure.core/cond-> {} (letvar1320669 "jobTemplate") (clojure.core/assoc :job-template (deser-job-template (clojure.core/get-in letvar1320669 ["jobTemplate"])))))))

(clojure.core/defn- response-bad-request-exception ([input] (response-bad-request-exception nil input)) ([resultWrapper1320671 input] (clojure.core/let [rawinput1320670 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar1320672 {"message" (rawinput1320670 "message")}] (clojure.core/cond-> {} (letvar1320672 "message") (clojure.core/assoc :message (deser-string (clojure.core/get-in letvar1320672 ["message"])))))))

(clojure.core/defn- response-list-tags-for-resource-response ([input] (response-list-tags-for-resource-response nil input)) ([resultWrapper1320674 input] (clojure.core/let [rawinput1320673 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar1320675 {"resourceTags" (rawinput1320673 "resourceTags")}] (clojure.core/cond-> {} (letvar1320675 "resourceTags") (clojure.core/assoc :resource-tags (deser-resource-tags (clojure.core/get-in letvar1320675 ["resourceTags"])))))))

(clojure.core/defn- response-get-queue-response ([input] (response-get-queue-response nil input)) ([resultWrapper1320677 input] (clojure.core/let [rawinput1320676 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar1320678 {"queue" (rawinput1320676 "queue")}] (clojure.core/cond-> {} (letvar1320678 "queue") (clojure.core/assoc :queue (deser-queue (clojure.core/get-in letvar1320678 ["queue"])))))))

(clojure.core/defn- response-update-queue-response ([input] (response-update-queue-response nil input)) ([resultWrapper1320680 input] (clojure.core/let [rawinput1320679 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar1320681 {"queue" (rawinput1320679 "queue")}] (clojure.core/cond-> {} (letvar1320681 "queue") (clojure.core/assoc :queue (deser-queue (clojure.core/get-in letvar1320681 ["queue"])))))))

(clojure.core/defn- response-forbidden-exception ([input] (response-forbidden-exception nil input)) ([resultWrapper1320683 input] (clojure.core/let [rawinput1320682 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar1320684 {"message" (rawinput1320682 "message")}] (clojure.core/cond-> {} (letvar1320684 "message") (clojure.core/assoc :message (deser-string (clojure.core/get-in letvar1320684 ["message"])))))))

(clojure.core/defn- response-create-job-response ([input] (response-create-job-response nil input)) ([resultWrapper1320686 input] (clojure.core/let [rawinput1320685 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar1320687 {"job" (rawinput1320685 "job")}] (clojure.core/cond-> {} (letvar1320687 "job") (clojure.core/assoc :job (deser-job (clojure.core/get-in letvar1320687 ["job"])))))))

(clojure.core/defn- response-list-queues-response ([input] (response-list-queues-response nil input)) ([resultWrapper1320689 input] (clojure.core/let [rawinput1320688 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar1320690 {"nextToken" (rawinput1320688 "nextToken"), "queues" (rawinput1320688 "queues")}] (clojure.core/cond-> {} (letvar1320690 "nextToken") (clojure.core/assoc :next-token (deser-string (clojure.core/get-in letvar1320690 ["nextToken"]))) (letvar1320690 "queues") (clojure.core/assoc :queues (deser-list-of-queue (clojure.core/get-in letvar1320690 ["queues"])))))))

(clojure.core/defn- response-update-job-template-response ([input] (response-update-job-template-response nil input)) ([resultWrapper1320692 input] (clojure.core/let [rawinput1320691 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar1320693 {"jobTemplate" (rawinput1320691 "jobTemplate")}] (clojure.core/cond-> {} (letvar1320693 "jobTemplate") (clojure.core/assoc :job-template (deser-job-template (clojure.core/get-in letvar1320693 ["jobTemplate"])))))))

(clojure.core/defn- response-get-preset-response ([input] (response-get-preset-response nil input)) ([resultWrapper1320695 input] (clojure.core/let [rawinput1320694 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar1320696 {"preset" (rawinput1320694 "preset")}] (clojure.core/cond-> {} (letvar1320696 "preset") (clojure.core/assoc :preset (deser-preset (clojure.core/get-in letvar1320696 ["preset"])))))))

(clojure.core/defn- response-tag-resource-response ([input] (response-tag-resource-response nil input)) ([resultWrapper1320698 input] (clojure.core/let [rawinput1320697 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar1320699 {}] (clojure.core/cond-> {}))))

(clojure.core/defn- response-too-many-requests-exception ([input] (response-too-many-requests-exception nil input)) ([resultWrapper1320701 input] (clojure.core/let [rawinput1320700 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar1320702 {"message" (rawinput1320700 "message")}] (clojure.core/cond-> {} (letvar1320702 "message") (clojure.core/assoc :message (deser-string (clojure.core/get-in letvar1320702 ["message"])))))))

(clojure.core/defn- response-list-job-templates-response ([input] (response-list-job-templates-response nil input)) ([resultWrapper1320704 input] (clojure.core/let [rawinput1320703 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar1320705 {"jobTemplates" (rawinput1320703 "jobTemplates"), "nextToken" (rawinput1320703 "nextToken")}] (clojure.core/cond-> {} (letvar1320705 "jobTemplates") (clojure.core/assoc :job-templates (deser-list-of-job-template (clojure.core/get-in letvar1320705 ["jobTemplates"]))) (letvar1320705 "nextToken") (clojure.core/assoc :next-token (deser-string (clojure.core/get-in letvar1320705 ["nextToken"])))))))

(clojure.core/defn- response-associate-certificate-response ([input] (response-associate-certificate-response nil input)) ([resultWrapper1320707 input] (clojure.core/let [rawinput1320706 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar1320708 {}] (clojure.core/cond-> {}))))

(clojure.core/defn- response-conflict-exception ([input] (response-conflict-exception nil input)) ([resultWrapper1320710 input] (clojure.core/let [rawinput1320709 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar1320711 {"message" (rawinput1320709 "message")}] (clojure.core/cond-> {} (letvar1320711 "message") (clojure.core/assoc :message (deser-string (clojure.core/get-in letvar1320711 ["message"])))))))

(clojure.core/defn- response-describe-endpoints-response ([input] (response-describe-endpoints-response nil input)) ([resultWrapper1320713 input] (clojure.core/let [rawinput1320712 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar1320714 {"endpoints" (rawinput1320712 "endpoints"), "nextToken" (rawinput1320712 "nextToken")}] (clojure.core/cond-> {} (letvar1320714 "endpoints") (clojure.core/assoc :endpoints (deser-list-of-endpoint (clojure.core/get-in letvar1320714 ["endpoints"]))) (letvar1320714 "nextToken") (clojure.core/assoc :next-token (deser-string (clojure.core/get-in letvar1320714 ["nextToken"])))))))

(clojure.core/defn- response-create-preset-response ([input] (response-create-preset-response nil input)) ([resultWrapper1320716 input] (clojure.core/let [rawinput1320715 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar1320717 {"preset" (rawinput1320715 "preset")}] (clojure.core/cond-> {} (letvar1320717 "preset") (clojure.core/assoc :preset (deser-preset (clojure.core/get-in letvar1320717 ["preset"])))))))

(clojure.core/defn- response-not-found-exception ([input] (response-not-found-exception nil input)) ([resultWrapper1320719 input] (clojure.core/let [rawinput1320718 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar1320720 {"message" (rawinput1320718 "message")}] (clojure.core/cond-> {} (letvar1320720 "message") (clojure.core/assoc :message (deser-string (clojure.core/get-in letvar1320720 ["message"])))))))

(clojure.core/defn- response-create-queue-response ([input] (response-create-queue-response nil input)) ([resultWrapper1320722 input] (clojure.core/let [rawinput1320721 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar1320723 {"queue" (rawinput1320721 "queue")}] (clojure.core/cond-> {} (letvar1320723 "queue") (clojure.core/assoc :queue (deser-queue (clojure.core/get-in letvar1320723 ["queue"])))))))

(clojure.core/defn- response-delete-queue-response ([input] (response-delete-queue-response nil input)) ([resultWrapper1320725 input] (clojure.core/let [rawinput1320724 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar1320726 {}] (clojure.core/cond-> {}))))

(clojure.core/defn- response-list-presets-response ([input] (response-list-presets-response nil input)) ([resultWrapper1320728 input] (clojure.core/let [rawinput1320727 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar1320729 {"nextToken" (rawinput1320727 "nextToken"), "presets" (rawinput1320727 "presets")}] (clojure.core/cond-> {} (letvar1320729 "nextToken") (clojure.core/assoc :next-token (deser-string (clojure.core/get-in letvar1320729 ["nextToken"]))) (letvar1320729 "presets") (clojure.core/assoc :presets (deser-list-of-preset (clojure.core/get-in letvar1320729 ["presets"])))))))

(clojure.core/defn- response-update-preset-response ([input] (response-update-preset-response nil input)) ([resultWrapper1320731 input] (clojure.core/let [rawinput1320730 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar1320732 {"preset" (rawinput1320730 "preset")}] (clojure.core/cond-> {} (letvar1320732 "preset") (clojure.core/assoc :preset (deser-preset (clojure.core/get-in letvar1320732 ["preset"])))))))

(clojure.core/defn- response-delete-job-template-response ([input] (response-delete-job-template-response nil input)) ([resultWrapper1320734 input] (clojure.core/let [rawinput1320733 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar1320735 {}] (clojure.core/cond-> {}))))

(clojure.core/defn- response-list-jobs-response ([input] (response-list-jobs-response nil input)) ([resultWrapper1320737 input] (clojure.core/let [rawinput1320736 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar1320738 {"jobs" (rawinput1320736 "jobs"), "nextToken" (rawinput1320736 "nextToken")}] (clojure.core/cond-> {} (letvar1320738 "jobs") (clojure.core/assoc :jobs (deser-list-of-job (clojure.core/get-in letvar1320738 ["jobs"]))) (letvar1320738 "nextToken") (clojure.core/assoc :next-token (deser-string (clojure.core/get-in letvar1320738 ["nextToken"])))))))

(clojure.core/defn- response-untag-resource-response ([input] (response-untag-resource-response nil input)) ([resultWrapper1320740 input] (clojure.core/let [rawinput1320739 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar1320741 {}] (clojure.core/cond-> {}))))

(clojure.core/defn- response-delete-preset-response ([input] (response-delete-preset-response nil input)) ([resultWrapper1320743 input] (clojure.core/let [rawinput1320742 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar1320744 {}] (clojure.core/cond-> {}))))

(clojure.core/defn- response-disassociate-certificate-response ([input] (response-disassociate-certificate-response nil input)) ([resultWrapper1320746 input] (clojure.core/let [rawinput1320745 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar1320747 {}] (clojure.core/cond-> {}))))

(clojure.spec.alpha/def :portkey.aws.mediaconvert.-2017-08-29/dvb-subtitle-shadow-color #{:white "NONE" "WHITE" "BLACK" :none :black})

(clojure.spec.alpha/def :portkey.aws.mediaconvert.-2017-08-29/hls-manifest-compression #{"GZIP" "NONE" :gzip :none})

(clojure.spec.alpha/def :portkey.aws.mediaconvert.-2017-08-29/hls-encryption-type #{:aes-128 "SAMPLE_AES" :sample-aes "AES128"})

(clojure.spec.alpha/def :portkey.aws.mediaconvert.-2017-08-29/get-job-response (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.mediaconvert.-2017-08-29/job]))

(clojure.spec.alpha/def :portkey.aws.mediaconvert.-2017-08-29/video-preprocessor (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.mediaconvert.-2017-08-29/color-corrector :portkey.aws.mediaconvert.-2017-08-29/deinterlacer :portkey.aws.mediaconvert.-2017-08-29/image-inserter :portkey.aws.mediaconvert.-2017-08-29/noise-reducer :portkey.aws.mediaconvert.-2017-08-29/timecode-burnin]))

(clojure.spec.alpha/def :portkey.aws.mediaconvert.-2017-08-29/prores-slow-pal #{"DISABLED" :disabled "ENABLED" :enabled})

(clojure.spec.alpha/def :portkey.aws.mediaconvert.-2017-08-29.update-preset-request/category (clojure.spec.alpha/and :portkey.aws.mediaconvert.-2017-08-29/string))
(clojure.spec.alpha/def :portkey.aws.mediaconvert.-2017-08-29.update-preset-request/description (clojure.spec.alpha/and :portkey.aws.mediaconvert.-2017-08-29/string))
(clojure.spec.alpha/def :portkey.aws.mediaconvert.-2017-08-29.update-preset-request/name (clojure.spec.alpha/and :portkey.aws.mediaconvert.-2017-08-29/string))
(clojure.spec.alpha/def :portkey.aws.mediaconvert.-2017-08-29.update-preset-request/settings (clojure.spec.alpha/and :portkey.aws.mediaconvert.-2017-08-29/preset-settings))
(clojure.spec.alpha/def :portkey.aws.mediaconvert.-2017-08-29/update-preset-request (clojure.spec.alpha/keys :req-un [:portkey.aws.mediaconvert.-2017-08-29.update-preset-request/name] :opt-un [:portkey.aws.mediaconvert.-2017-08-29.update-preset-request/category :portkey.aws.mediaconvert.-2017-08-29.update-preset-request/description :portkey.aws.mediaconvert.-2017-08-29.update-preset-request/settings]))

(clojure.spec.alpha/def :portkey.aws.mediaconvert.-2017-08-29/hls-manifest-duration-format #{"FLOATING_POINT" :floating-point "INTEGER" :integer})

(clojure.spec.alpha/def :portkey.aws.mediaconvert.-2017-08-29/integer-min-negative-60-max-6 (clojure.spec.alpha/int-in -60 6))

(clojure.spec.alpha/def :portkey.aws.mediaconvert.-2017-08-29/dvb-subtitle-font-color #{:white :yellow :green "GREEN" "BLUE" :red :blue "WHITE" "YELLOW" "BLACK" "RED" :black})

(clojure.spec.alpha/def :portkey.aws.mediaconvert.-2017-08-29.create-preset-request/category (clojure.spec.alpha/and :portkey.aws.mediaconvert.-2017-08-29/string))
(clojure.spec.alpha/def :portkey.aws.mediaconvert.-2017-08-29.create-preset-request/description (clojure.spec.alpha/and :portkey.aws.mediaconvert.-2017-08-29/string))
(clojure.spec.alpha/def :portkey.aws.mediaconvert.-2017-08-29.create-preset-request/name (clojure.spec.alpha/and :portkey.aws.mediaconvert.-2017-08-29/string))
(clojure.spec.alpha/def :portkey.aws.mediaconvert.-2017-08-29.create-preset-request/settings (clojure.spec.alpha/and :portkey.aws.mediaconvert.-2017-08-29/preset-settings))
(clojure.spec.alpha/def :portkey.aws.mediaconvert.-2017-08-29.create-preset-request/tags (clojure.spec.alpha/and :portkey.aws.mediaconvert.-2017-08-29/map-of-string))
(clojure.spec.alpha/def :portkey.aws.mediaconvert.-2017-08-29/create-preset-request (clojure.spec.alpha/keys :req-un [:portkey.aws.mediaconvert.-2017-08-29.create-preset-request/settings :portkey.aws.mediaconvert.-2017-08-29.create-preset-request/name] :opt-un [:portkey.aws.mediaconvert.-2017-08-29.create-preset-request/category :portkey.aws.mediaconvert.-2017-08-29.create-preset-request/description :portkey.aws.mediaconvert.-2017-08-29.create-preset-request/tags]))

(clojure.spec.alpha/def :portkey.aws.mediaconvert.-2017-08-29.reservation-plan/expires-at (clojure.spec.alpha/and :portkey.aws.mediaconvert.-2017-08-29/timestamp-unix))
(clojure.spec.alpha/def :portkey.aws.mediaconvert.-2017-08-29.reservation-plan/purchased-at (clojure.spec.alpha/and :portkey.aws.mediaconvert.-2017-08-29/timestamp-unix))
(clojure.spec.alpha/def :portkey.aws.mediaconvert.-2017-08-29.reservation-plan/reserved-slots (clojure.spec.alpha/and :portkey.aws.mediaconvert.-2017-08-29/integer))
(clojure.spec.alpha/def :portkey.aws.mediaconvert.-2017-08-29.reservation-plan/status (clojure.spec.alpha/and :portkey.aws.mediaconvert.-2017-08-29/reservation-plan-status))
(clojure.spec.alpha/def :portkey.aws.mediaconvert.-2017-08-29/reservation-plan (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.mediaconvert.-2017-08-29/commitment :portkey.aws.mediaconvert.-2017-08-29.reservation-plan/expires-at :portkey.aws.mediaconvert.-2017-08-29.reservation-plan/purchased-at :portkey.aws.mediaconvert.-2017-08-29/renewal-type :portkey.aws.mediaconvert.-2017-08-29.reservation-plan/reserved-slots :portkey.aws.mediaconvert.-2017-08-29.reservation-plan/status]))

(clojure.spec.alpha/def :portkey.aws.mediaconvert.-2017-08-29/output-sdt #{:sdt-none "SDT_MANUAL" :sdt-manual :sdt-follow-if-present "SDT_NONE" "SDT_FOLLOW_IF_PRESENT" "SDT_FOLLOW" :sdt-follow})

(clojure.spec.alpha/def :portkey.aws.mediaconvert.-2017-08-29/eac-3-dynamic-range-compression-line #{"MUSIC_LIGHT" :music-standard :film-standard "FILM_STANDARD" "NONE" "FILM_LIGHT" :film-light "SPEECH" :music-light "MUSIC_STANDARD" :speech :none})

(clojure.spec.alpha/def :portkey.aws.mediaconvert.-2017-08-29.output-detail/duration-in-ms (clojure.spec.alpha/and :portkey.aws.mediaconvert.-2017-08-29/integer))
(clojure.spec.alpha/def :portkey.aws.mediaconvert.-2017-08-29.output-detail/video-details (clojure.spec.alpha/and :portkey.aws.mediaconvert.-2017-08-29/video-detail))
(clojure.spec.alpha/def :portkey.aws.mediaconvert.-2017-08-29/output-detail (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.mediaconvert.-2017-08-29.output-detail/duration-in-ms :portkey.aws.mediaconvert.-2017-08-29.output-detail/video-details]))

(clojure.spec.alpha/def :portkey.aws.mediaconvert.-2017-08-29.internal-server-error-exception/message (clojure.spec.alpha/and :portkey.aws.mediaconvert.-2017-08-29/string))
(clojure.spec.alpha/def :portkey.aws.mediaconvert.-2017-08-29/internal-server-error-exception (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.mediaconvert.-2017-08-29.internal-server-error-exception/message]))

(clojure.spec.alpha/def :portkey.aws.mediaconvert.-2017-08-29/integer-min-0-max-1000 (clojure.spec.alpha/int-in 0 1000))

(clojure.spec.alpha/def :portkey.aws.mediaconvert.-2017-08-29/prores-framerate-conversion-algorithm #{"DUPLICATE_DROP" :interpolate "INTERPOLATE" :duplicate-drop})

(clojure.spec.alpha/def :portkey.aws.mediaconvert.-2017-08-29/h-264-adaptive-quantization #{:higher :medium "LOW" "MAX" :high "HIGHER" :max :off "HIGH" :low "OFF" "MEDIUM"})

(clojure.spec.alpha/def :portkey.aws.mediaconvert.-2017-08-29/order #{:descending :ascending "ASCENDING" "DESCENDING"})

(clojure.spec.alpha/def :portkey.aws.mediaconvert.-2017-08-29.noise-reducer-spatial-filter-settings/post-filter-sharpen-strength (clojure.spec.alpha/and :portkey.aws.mediaconvert.-2017-08-29/integer-min-0-max-3))
(clojure.spec.alpha/def :portkey.aws.mediaconvert.-2017-08-29.noise-reducer-spatial-filter-settings/speed (clojure.spec.alpha/and :portkey.aws.mediaconvert.-2017-08-29/integer-min-negative-2-max-3))
(clojure.spec.alpha/def :portkey.aws.mediaconvert.-2017-08-29.noise-reducer-spatial-filter-settings/strength (clojure.spec.alpha/and :portkey.aws.mediaconvert.-2017-08-29/integer-min-0-max-16))
(clojure.spec.alpha/def :portkey.aws.mediaconvert.-2017-08-29/noise-reducer-spatial-filter-settings (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.mediaconvert.-2017-08-29.noise-reducer-spatial-filter-settings/post-filter-sharpen-strength :portkey.aws.mediaconvert.-2017-08-29.noise-reducer-spatial-filter-settings/speed :portkey.aws.mediaconvert.-2017-08-29.noise-reducer-spatial-filter-settings/strength]))

(clojure.spec.alpha/def :portkey.aws.mediaconvert.-2017-08-29/drop-frame-timecode #{"DISABLED" :disabled "ENABLED" :enabled})

(clojure.spec.alpha/def :portkey.aws.mediaconvert.-2017-08-29/string-pattern-sn-manifest-confirm-condition-notification-ns (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__1012854__auto__] (clojure.core/re-matches #"^\s*<(.|\n)*ManifestConfirmConditionNotification(.|\n)*>\s*$" s__1012854__auto__))))

(clojure.spec.alpha/def :portkey.aws.mediaconvert.-2017-08-29/integer-min-25-max-2000 (clojure.spec.alpha/int-in 25 2000))

(clojure.spec.alpha/def :portkey.aws.mediaconvert.-2017-08-29.timecode-burnin/font-size (clojure.spec.alpha/and :portkey.aws.mediaconvert.-2017-08-29/integer-min-10-max-48))
(clojure.spec.alpha/def :portkey.aws.mediaconvert.-2017-08-29.timecode-burnin/position (clojure.spec.alpha/and :portkey.aws.mediaconvert.-2017-08-29/timecode-burnin-position))
(clojure.spec.alpha/def :portkey.aws.mediaconvert.-2017-08-29.timecode-burnin/prefix (clojure.spec.alpha/and :portkey.aws.mediaconvert.-2017-08-29/string-pattern))
(clojure.spec.alpha/def :portkey.aws.mediaconvert.-2017-08-29/timecode-burnin (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.mediaconvert.-2017-08-29.timecode-burnin/font-size :portkey.aws.mediaconvert.-2017-08-29.timecode-burnin/position :portkey.aws.mediaconvert.-2017-08-29.timecode-burnin/prefix]))

(clojure.spec.alpha/def :portkey.aws.mediaconvert.-2017-08-29/scc-destination-framerate #{:framerate-29-97-dropframe :framerate-29-97-non-dropframe "FRAMERATE_23_97" :framerate-24 "FRAMERATE_29_97_NON_DROPFRAME" "FRAMERATE_24" :framerate-23-97 "FRAMERATE_29_97_DROPFRAME"})

(clojure.spec.alpha/def :portkey.aws.mediaconvert.-2017-08-29.preset-settings/audio-descriptions (clojure.spec.alpha/and :portkey.aws.mediaconvert.-2017-08-29/list-of-audio-description))
(clojure.spec.alpha/def :portkey.aws.mediaconvert.-2017-08-29.preset-settings/caption-descriptions (clojure.spec.alpha/and :portkey.aws.mediaconvert.-2017-08-29/list-of-caption-description-preset))
(clojure.spec.alpha/def :portkey.aws.mediaconvert.-2017-08-29/preset-settings (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.mediaconvert.-2017-08-29.preset-settings/audio-descriptions :portkey.aws.mediaconvert.-2017-08-29.preset-settings/caption-descriptions :portkey.aws.mediaconvert.-2017-08-29/container-settings :portkey.aws.mediaconvert.-2017-08-29/video-description]))

(clojure.spec.alpha/def :portkey.aws.mediaconvert.-2017-08-29.list-queues-request/list-by (clojure.spec.alpha/and :portkey.aws.mediaconvert.-2017-08-29/queue-list-by))
(clojure.spec.alpha/def :portkey.aws.mediaconvert.-2017-08-29.list-queues-request/max-results (clojure.spec.alpha/and :portkey.aws.mediaconvert.-2017-08-29/integer-min-1-max-20))
(clojure.spec.alpha/def :portkey.aws.mediaconvert.-2017-08-29.list-queues-request/next-token (clojure.spec.alpha/and :portkey.aws.mediaconvert.-2017-08-29/string))
(clojure.spec.alpha/def :portkey.aws.mediaconvert.-2017-08-29/list-queues-request (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.mediaconvert.-2017-08-29.list-queues-request/list-by :portkey.aws.mediaconvert.-2017-08-29.list-queues-request/max-results :portkey.aws.mediaconvert.-2017-08-29.list-queues-request/next-token :portkey.aws.mediaconvert.-2017-08-29/order]))

(clojure.spec.alpha/def :portkey.aws.mediaconvert.-2017-08-29/commitment #{"ONE_YEAR" :one-year})

(clojure.spec.alpha/def :portkey.aws.mediaconvert.-2017-08-29/h-265-sample-adaptive-offset-filter-mode #{:adaptive :default "ADAPTIVE" :off "DEFAULT" "OFF"})

(clojure.spec.alpha/def :portkey.aws.mediaconvert.-2017-08-29.ttml-destination-settings/style-passthrough (clojure.spec.alpha/and :portkey.aws.mediaconvert.-2017-08-29/ttml-style-passthrough))
(clojure.spec.alpha/def :portkey.aws.mediaconvert.-2017-08-29/ttml-destination-settings (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.mediaconvert.-2017-08-29.ttml-destination-settings/style-passthrough]))

(clojure.spec.alpha/def :portkey.aws.mediaconvert.-2017-08-29/integer-min-1-max-4 (clojure.spec.alpha/int-in 1 4))

(clojure.spec.alpha/def :portkey.aws.mediaconvert.-2017-08-29/mpeg-2-framerate-conversion-algorithm #{"DUPLICATE_DROP" :interpolate "INTERPOLATE" :duplicate-drop})

(clojure.spec.alpha/def :portkey.aws.mediaconvert.-2017-08-29/integer-min-2-max-2147483647 (clojure.spec.alpha/int-in 2 2147483647))

(clojure.spec.alpha/def :portkey.aws.mediaconvert.-2017-08-29/m-2ts-pcr-control #{:configured-pcr-period "CONFIGURED_PCR_PERIOD" :pcr-every-pes-packet "PCR_EVERY_PES_PACKET"})

(clojure.spec.alpha/def :portkey.aws.mediaconvert.-2017-08-29/mpeg-2-gop-size-units #{"SECONDS" :frames :seconds "FRAMES"})

(clojure.spec.alpha/def :portkey.aws.mediaconvert.-2017-08-29/string-pattern-sn-signal-processing-notification-ns (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__1012854__auto__] (clojure.core/re-matches #"^\s*<(.|\n)*SignalProcessingNotification(.|\n)*>\s*$" s__1012854__auto__))))

(clojure.spec.alpha/def :portkey.aws.mediaconvert.-2017-08-29/preset-list-by #{"SYSTEM" "CREATION_DATE" :system "NAME" :name :creation-date})

(clojure.spec.alpha/def :portkey.aws.mediaconvert.-2017-08-29.esam-signal-processing-notification/scc-xml (clojure.spec.alpha/and :portkey.aws.mediaconvert.-2017-08-29/string-pattern-sn-signal-processing-notification-ns))
(clojure.spec.alpha/def :portkey.aws.mediaconvert.-2017-08-29/esam-signal-processing-notification (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.mediaconvert.-2017-08-29.esam-signal-processing-notification/scc-xml]))

(clojure.spec.alpha/def :portkey.aws.mediaconvert.-2017-08-29.remix-settings/channels-in (clojure.spec.alpha/and :portkey.aws.mediaconvert.-2017-08-29/integer-min-1-max-16))
(clojure.spec.alpha/def :portkey.aws.mediaconvert.-2017-08-29.remix-settings/channels-out (clojure.spec.alpha/and :portkey.aws.mediaconvert.-2017-08-29/integer-min-1-max-8))
(clojure.spec.alpha/def :portkey.aws.mediaconvert.-2017-08-29/remix-settings (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.mediaconvert.-2017-08-29/channel-mapping :portkey.aws.mediaconvert.-2017-08-29.remix-settings/channels-in :portkey.aws.mediaconvert.-2017-08-29.remix-settings/channels-out]))

(clojure.spec.alpha/def :portkey.aws.mediaconvert.-2017-08-29/font-script #{"HANT" :hant "AUTOMATIC" :hans :automatic "HANS"})

(clojure.spec.alpha/def :portkey.aws.mediaconvert.-2017-08-29/integer-min-0-max-99 (clojure.spec.alpha/int-in 0 99))

(clojure.spec.alpha/def :portkey.aws.mediaconvert.-2017-08-29.dvb-tdt-settings/tdt-interval (clojure.spec.alpha/and :portkey.aws.mediaconvert.-2017-08-29/integer-min-1000-max-30000))
(clojure.spec.alpha/def :portkey.aws.mediaconvert.-2017-08-29/dvb-tdt-settings (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.mediaconvert.-2017-08-29.dvb-tdt-settings/tdt-interval]))

(clojure.spec.alpha/def :portkey.aws.mediaconvert.-2017-08-29/string-min-32-max-32-pattern-09a-faf-32 (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__1012852__auto__] (clojure.core/<= 32 (clojure.core/count s__1012852__auto__))) (clojure.core/fn [s__1012853__auto__] (clojure.core/< (clojure.core/count s__1012853__auto__) 32)) (clojure.core/fn [s__1012854__auto__] (clojure.core/re-matches #"^[0-9a-fA-F]{32}$" s__1012854__auto__))))

(clojure.spec.alpha/def :portkey.aws.mediaconvert.-2017-08-29/cmaf-client-cache #{"DISABLED" :disabled "ENABLED" :enabled})

(clojure.spec.alpha/def :portkey.aws.mediaconvert.-2017-08-29/h-265-par-control #{"SPECIFIED" "INITIALIZE_FROM_SOURCE" :specified :initialize-from-source})

(clojure.spec.alpha/def :portkey.aws.mediaconvert.-2017-08-29/mpeg-2-adaptive-quantization #{:medium "LOW" :high :off "HIGH" :low "OFF" "MEDIUM"})

(clojure.spec.alpha/def :portkey.aws.mediaconvert.-2017-08-29/mov-padding-control #{:omneon "OMNEON" "NONE" :none})

(clojure.spec.alpha/def :portkey.aws.mediaconvert.-2017-08-29/prores-framerate-control #{"SPECIFIED" "INITIALIZE_FROM_SOURCE" :specified :initialize-from-source})

(clojure.spec.alpha/def :portkey.aws.mediaconvert.-2017-08-29/create-job-template-response (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.mediaconvert.-2017-08-29/job-template]))

(clojure.spec.alpha/def :portkey.aws.mediaconvert.-2017-08-29/audio-normalization-algorithm-control #{:measure-only :correct-audio "CORRECT_AUDIO" "MEASURE_ONLY"})

(clojure.spec.alpha/def :portkey.aws.mediaconvert.-2017-08-29/cancel-job-response (clojure.spec.alpha/keys :req-un [] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.mediaconvert.-2017-08-29/map-of-audio-selector (clojure.spec.alpha/map-of :portkey.aws.mediaconvert.-2017-08-29/string :portkey.aws.mediaconvert.-2017-08-29/audio-selector))

(clojure.spec.alpha/def :portkey.aws.mediaconvert.-2017-08-29/string-pattern-arn-aws-us-gov-acm (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__1012854__auto__] (clojure.core/re-matches #"^arn:aws(-us-gov)?:acm:" s__1012854__auto__))))

(clojure.spec.alpha/def :portkey.aws.mediaconvert.-2017-08-29/ttml-style-passthrough #{"DISABLED" :disabled "ENABLED" :enabled})

(clojure.spec.alpha/def :portkey.aws.mediaconvert.-2017-08-29/get-job-template-response (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.mediaconvert.-2017-08-29/job-template]))

(clojure.spec.alpha/def :portkey.aws.mediaconvert.-2017-08-29/h-264-temporal-adaptive-quantization #{"DISABLED" :disabled "ENABLED" :enabled})

(clojure.spec.alpha/def :portkey.aws.mediaconvert.-2017-08-29.insertable-image/start-time (clojure.spec.alpha/and :portkey.aws.mediaconvert.-2017-08-29/string-pattern-01-d-20305-d-205-d))
(clojure.spec.alpha/def :portkey.aws.mediaconvert.-2017-08-29.insertable-image/opacity (clojure.spec.alpha/and :portkey.aws.mediaconvert.-2017-08-29/integer-min-0-max-100))
(clojure.spec.alpha/def :portkey.aws.mediaconvert.-2017-08-29.insertable-image/image-x (clojure.spec.alpha/and :portkey.aws.mediaconvert.-2017-08-29/integer-min-0-max-2147483647))
(clojure.spec.alpha/def :portkey.aws.mediaconvert.-2017-08-29.insertable-image/width (clojure.spec.alpha/and :portkey.aws.mediaconvert.-2017-08-29/integer-min-0-max-2147483647))
(clojure.spec.alpha/def :portkey.aws.mediaconvert.-2017-08-29.insertable-image/layer (clojure.spec.alpha/and :portkey.aws.mediaconvert.-2017-08-29/integer-min-0-max-99))
(clojure.spec.alpha/def :portkey.aws.mediaconvert.-2017-08-29.insertable-image/duration (clojure.spec.alpha/and :portkey.aws.mediaconvert.-2017-08-29/integer-min-0-max-2147483647))
(clojure.spec.alpha/def :portkey.aws.mediaconvert.-2017-08-29.insertable-image/fade-in (clojure.spec.alpha/and :portkey.aws.mediaconvert.-2017-08-29/integer-min-0-max-2147483647))
(clojure.spec.alpha/def :portkey.aws.mediaconvert.-2017-08-29.insertable-image/image-inserter-input (clojure.spec.alpha/and :portkey.aws.mediaconvert.-2017-08-29/string-min-14-pattern-s-3-bmp-bmp-png-png-tga-tga))
(clojure.spec.alpha/def :portkey.aws.mediaconvert.-2017-08-29.insertable-image/height (clojure.spec.alpha/and :portkey.aws.mediaconvert.-2017-08-29/integer-min-0-max-2147483647))
(clojure.spec.alpha/def :portkey.aws.mediaconvert.-2017-08-29.insertable-image/image-y (clojure.spec.alpha/and :portkey.aws.mediaconvert.-2017-08-29/integer-min-0-max-2147483647))
(clojure.spec.alpha/def :portkey.aws.mediaconvert.-2017-08-29.insertable-image/fade-out (clojure.spec.alpha/and :portkey.aws.mediaconvert.-2017-08-29/integer-min-0-max-2147483647))
(clojure.spec.alpha/def :portkey.aws.mediaconvert.-2017-08-29/insertable-image (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.mediaconvert.-2017-08-29.insertable-image/start-time :portkey.aws.mediaconvert.-2017-08-29.insertable-image/opacity :portkey.aws.mediaconvert.-2017-08-29.insertable-image/image-x :portkey.aws.mediaconvert.-2017-08-29.insertable-image/width :portkey.aws.mediaconvert.-2017-08-29.insertable-image/layer :portkey.aws.mediaconvert.-2017-08-29.insertable-image/duration :portkey.aws.mediaconvert.-2017-08-29.insertable-image/fade-in :portkey.aws.mediaconvert.-2017-08-29.insertable-image/image-inserter-input :portkey.aws.mediaconvert.-2017-08-29.insertable-image/height :portkey.aws.mediaconvert.-2017-08-29.insertable-image/image-y :portkey.aws.mediaconvert.-2017-08-29.insertable-image/fade-out]))

(clojure.spec.alpha/def :portkey.aws.mediaconvert.-2017-08-29.container-settings/container (clojure.spec.alpha/and :portkey.aws.mediaconvert.-2017-08-29/container-type))
(clojure.spec.alpha/def :portkey.aws.mediaconvert.-2017-08-29/container-settings (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.mediaconvert.-2017-08-29.container-settings/container :portkey.aws.mediaconvert.-2017-08-29/f-4v-settings :portkey.aws.mediaconvert.-2017-08-29/m-2ts-settings :portkey.aws.mediaconvert.-2017-08-29/m-3u-8-settings :portkey.aws.mediaconvert.-2017-08-29/mov-settings :portkey.aws.mediaconvert.-2017-08-29/mp-4-settings]))

(clojure.spec.alpha/def :portkey.aws.mediaconvert.-2017-08-29/cmaf-codec-specification #{:rfc-6381 :rfc-4281 "RFC_4281" "RFC_6381"})

(clojure.spec.alpha/def :portkey.aws.mediaconvert.-2017-08-29.bad-request-exception/message (clojure.spec.alpha/and :portkey.aws.mediaconvert.-2017-08-29/string))
(clojure.spec.alpha/def :portkey.aws.mediaconvert.-2017-08-29/bad-request-exception (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.mediaconvert.-2017-08-29.bad-request-exception/message]))

(clojure.spec.alpha/def :portkey.aws.mediaconvert.-2017-08-29/integer-min-1-max-1 (clojure.spec.alpha/int-in 1 1))

(clojure.spec.alpha/def :portkey.aws.mediaconvert.-2017-08-29/h-265-gop-b-reference #{"DISABLED" :disabled "ENABLED" :enabled})

(clojure.spec.alpha/def :portkey.aws.mediaconvert.-2017-08-29/h-265-temporal-adaptive-quantization #{"DISABLED" :disabled "ENABLED" :enabled})

(clojure.spec.alpha/def :portkey.aws.mediaconvert.-2017-08-29.audio-description/custom-language-code (clojure.spec.alpha/and :portkey.aws.mediaconvert.-2017-08-29/string-min-3-max-3-pattern-a-za-z-3))
(clojure.spec.alpha/def :portkey.aws.mediaconvert.-2017-08-29.audio-description/stream-name (clojure.spec.alpha/and :portkey.aws.mediaconvert.-2017-08-29/string-pattern-ws))
(clojure.spec.alpha/def :portkey.aws.mediaconvert.-2017-08-29.audio-description/audio-type (clojure.spec.alpha/and :portkey.aws.mediaconvert.-2017-08-29/integer-min-0-max-255))
(clojure.spec.alpha/def :portkey.aws.mediaconvert.-2017-08-29.audio-description/codec-settings (clojure.spec.alpha/and :portkey.aws.mediaconvert.-2017-08-29/audio-codec-settings))
(clojure.spec.alpha/def :portkey.aws.mediaconvert.-2017-08-29.audio-description/language-code-control (clojure.spec.alpha/and :portkey.aws.mediaconvert.-2017-08-29/audio-language-code-control))
(clojure.spec.alpha/def :portkey.aws.mediaconvert.-2017-08-29.audio-description/audio-source-name (clojure.spec.alpha/and :portkey.aws.mediaconvert.-2017-08-29/string))
(clojure.spec.alpha/def :portkey.aws.mediaconvert.-2017-08-29/audio-description (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.mediaconvert.-2017-08-29.audio-description/custom-language-code :portkey.aws.mediaconvert.-2017-08-29.audio-description/stream-name :portkey.aws.mediaconvert.-2017-08-29/remix-settings :portkey.aws.mediaconvert.-2017-08-29.audio-description/audio-type :portkey.aws.mediaconvert.-2017-08-29.audio-description/codec-settings :portkey.aws.mediaconvert.-2017-08-29.audio-description/language-code-control :portkey.aws.mediaconvert.-2017-08-29/audio-type-control :portkey.aws.mediaconvert.-2017-08-29/language-code :portkey.aws.mediaconvert.-2017-08-29.audio-description/audio-source-name :portkey.aws.mediaconvert.-2017-08-29/audio-normalization-settings]))

(clojure.spec.alpha/def :portkey.aws.mediaconvert.-2017-08-29/job-status #{"CANCELED" "ERROR" :submitted "SUBMITTED" :canceled "PROGRESSING" "COMPLETE" :progressing :error :complete})

(clojure.spec.alpha/def :portkey.aws.mediaconvert.-2017-08-29/aac-vbr-quality #{:medium-high "LOW" "MEDIUM_LOW" :high "HIGH" :low "MEDIUM_HIGH" :medium-low})

(clojure.spec.alpha/def :portkey.aws.mediaconvert.-2017-08-29/deinterlacer-control #{"NORMAL" "FORCE_ALL_FRAMES" :normal :force-all-frames})

(clojure.spec.alpha/def :portkey.aws.mediaconvert.-2017-08-29/string-min-11-max-11-pattern-01-d-20305-d-205-d (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__1012852__auto__] (clojure.core/<= 11 (clojure.core/count s__1012852__auto__))) (clojure.core/fn [s__1012853__auto__] (clojure.core/< (clojure.core/count s__1012853__auto__) 11)) (clojure.core/fn [s__1012854__auto__] (clojure.core/re-matches #"^((([0-1]\d)|(2[0-3]))(:[0-5]\d){2}([:;][0-5]\d))$" s__1012854__auto__))))

(clojure.spec.alpha/def :portkey.aws.mediaconvert.-2017-08-29.track-source-settings/track-number (clojure.spec.alpha/and :portkey.aws.mediaconvert.-2017-08-29/integer-min-1-max-2147483647))
(clojure.spec.alpha/def :portkey.aws.mediaconvert.-2017-08-29/track-source-settings (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.mediaconvert.-2017-08-29.track-source-settings/track-number]))

(clojure.spec.alpha/def :portkey.aws.mediaconvert.-2017-08-29/h-265-codec-level #{:level-2-1 :level-5-1 :level-3 "LEVEL_2_1" :level-6 "LEVEL_5" "LEVEL_1" :level-4 "AUTO" "LEVEL_4_1" "LEVEL_5_1" "LEVEL_5_2" "LEVEL_4" :level-1 :level-4-1 "LEVEL_2" "LEVEL_3" :level-3-1 "LEVEL_6_2" :level-6-2 "LEVEL_6" :level-6-1 "LEVEL_6_1" "LEVEL_3_1" :auto :level-5 :level-5-2 :level-2})

(clojure.spec.alpha/def :portkey.aws.mediaconvert.-2017-08-29/list-tags-for-resource-response (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.mediaconvert.-2017-08-29/resource-tags]))

(clojure.spec.alpha/def :portkey.aws.mediaconvert.-2017-08-29/string-pattern-ws (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__1012854__auto__] (clojure.core/re-matches #"^[\w\s]*$" s__1012854__auto__))))

(clojure.spec.alpha/def :portkey.aws.mediaconvert.-2017-08-29/m-3u-8-pcr-control #{:configured-pcr-period "CONFIGURED_PCR_PERIOD" :pcr-every-pes-packet "PCR_EVERY_PES_PACKET"})

(clojure.spec.alpha/def :portkey.aws.mediaconvert.-2017-08-29/integer-min-32-max-8182 (clojure.spec.alpha/int-in 32 8182))

(clojure.spec.alpha/def :portkey.aws.mediaconvert.-2017-08-29.scc-destination-settings/framerate (clojure.spec.alpha/and :portkey.aws.mediaconvert.-2017-08-29/scc-destination-framerate))
(clojure.spec.alpha/def :portkey.aws.mediaconvert.-2017-08-29/scc-destination-settings (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.mediaconvert.-2017-08-29.scc-destination-settings/framerate]))

(clojure.spec.alpha/def :portkey.aws.mediaconvert.-2017-08-29/list-of-id-3-insertion (clojure.spec.alpha/coll-of :portkey.aws.mediaconvert.-2017-08-29/id-3-insertion))

(clojure.spec.alpha/def :portkey.aws.mediaconvert.-2017-08-29/type #{"SYSTEM" "CUSTOM" :system :custom})

(clojure.spec.alpha/def :portkey.aws.mediaconvert.-2017-08-29/h-264-slow-pal #{"DISABLED" :disabled "ENABLED" :enabled})

(clojure.spec.alpha/def :portkey.aws.mediaconvert.-2017-08-29/m-2ts-audio-buffer-model #{:atsc :dvb "DVB" "ATSC"})

(clojure.spec.alpha/def :portkey.aws.mediaconvert.-2017-08-29/h-265-unregistered-sei-timecode #{"DISABLED" :disabled "ENABLED" :enabled})

(clojure.spec.alpha/def :portkey.aws.mediaconvert.-2017-08-29/hls-audio-track-type #{"ALTERNATE_AUDIO_AUTO_SELECT_DEFAULT" "ALTERNATE_AUDIO_AUTO_SELECT" :audio-only-variant-stream :alternate-audio-auto-select-default "ALTERNATE_AUDIO_NOT_AUTO_SELECT" "AUDIO_ONLY_VARIANT_STREAM" :alternate-audio-auto-select :alternate-audio-not-auto-select})

(clojure.spec.alpha/def :portkey.aws.mediaconvert.-2017-08-29/get-queue-response (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.mediaconvert.-2017-08-29/queue]))

(clojure.spec.alpha/def :portkey.aws.mediaconvert.-2017-08-29/h-264-gop-size-units #{"SECONDS" :frames :seconds "FRAMES"})

(clojure.spec.alpha/def :portkey.aws.mediaconvert.-2017-08-29/hls-directory-structure #{:single-directory "SINGLE_DIRECTORY" "SUBDIRECTORY_PER_STREAM" :subdirectory-per-stream})

(clojure.spec.alpha/def :portkey.aws.mediaconvert.-2017-08-29/m-2ts-ebp-placement #{:video-and-audio-pids "VIDEO_AND_AUDIO_PIDS" "VIDEO_PID" :video-pid})

(clojure.spec.alpha/def :portkey.aws.mediaconvert.-2017-08-29/h-265-tiles #{"DISABLED" :disabled "ENABLED" :enabled})

(clojure.spec.alpha/def :portkey.aws.mediaconvert.-2017-08-29/deinterlacer-mode #{"DEINTERLACE" :inverse-telecine :adaptive "ADAPTIVE" "INVERSE_TELECINE" :deinterlace})

(clojure.spec.alpha/def :portkey.aws.mediaconvert.-2017-08-29.motion-image-insertion-offset/image-x (clojure.spec.alpha/and :portkey.aws.mediaconvert.-2017-08-29/integer-min-0-max-2147483647))
(clojure.spec.alpha/def :portkey.aws.mediaconvert.-2017-08-29.motion-image-insertion-offset/image-y (clojure.spec.alpha/and :portkey.aws.mediaconvert.-2017-08-29/integer-min-0-max-2147483647))
(clojure.spec.alpha/def :portkey.aws.mediaconvert.-2017-08-29/motion-image-insertion-offset (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.mediaconvert.-2017-08-29.motion-image-insertion-offset/image-x :portkey.aws.mediaconvert.-2017-08-29.motion-image-insertion-offset/image-y]))

(clojure.spec.alpha/def :portkey.aws.mediaconvert.-2017-08-29.eac-3-settings/lt-rt-surround-mix-level (clojure.spec.alpha/and :portkey.aws.mediaconvert.-2017-08-29/double-min-negative-60-max-negative-1))
(clojure.spec.alpha/def :portkey.aws.mediaconvert.-2017-08-29.eac-3-settings/coding-mode (clojure.spec.alpha/and :portkey.aws.mediaconvert.-2017-08-29/eac-3-coding-mode))
(clojure.spec.alpha/def :portkey.aws.mediaconvert.-2017-08-29.eac-3-settings/phase-control (clojure.spec.alpha/and :portkey.aws.mediaconvert.-2017-08-29/eac-3-phase-control))
(clojure.spec.alpha/def :portkey.aws.mediaconvert.-2017-08-29.eac-3-settings/sample-rate (clojure.spec.alpha/and :portkey.aws.mediaconvert.-2017-08-29/integer-min-48000-max-48000))
(clojure.spec.alpha/def :portkey.aws.mediaconvert.-2017-08-29.eac-3-settings/passthrough-control (clojure.spec.alpha/and :portkey.aws.mediaconvert.-2017-08-29/eac-3-passthrough-control))
(clojure.spec.alpha/def :portkey.aws.mediaconvert.-2017-08-29.eac-3-settings/dynamic-range-compression-line (clojure.spec.alpha/and :portkey.aws.mediaconvert.-2017-08-29/eac-3-dynamic-range-compression-line))
(clojure.spec.alpha/def :portkey.aws.mediaconvert.-2017-08-29.eac-3-settings/surround-mode (clojure.spec.alpha/and :portkey.aws.mediaconvert.-2017-08-29/eac-3-surround-mode))
(clojure.spec.alpha/def :portkey.aws.mediaconvert.-2017-08-29.eac-3-settings/attenuation-control (clojure.spec.alpha/and :portkey.aws.mediaconvert.-2017-08-29/eac-3-attenuation-control))
(clojure.spec.alpha/def :portkey.aws.mediaconvert.-2017-08-29.eac-3-settings/dc-filter (clojure.spec.alpha/and :portkey.aws.mediaconvert.-2017-08-29/eac-3-dc-filter))
(clojure.spec.alpha/def :portkey.aws.mediaconvert.-2017-08-29.eac-3-settings/lfe-filter (clojure.spec.alpha/and :portkey.aws.mediaconvert.-2017-08-29/eac-3-lfe-filter))
(clojure.spec.alpha/def :portkey.aws.mediaconvert.-2017-08-29.eac-3-settings/lfe-control (clojure.spec.alpha/and :portkey.aws.mediaconvert.-2017-08-29/eac-3-lfe-control))
(clojure.spec.alpha/def :portkey.aws.mediaconvert.-2017-08-29.eac-3-settings/lo-ro-center-mix-level (clojure.spec.alpha/and :portkey.aws.mediaconvert.-2017-08-29/double-min-negative-60-max-3))
(clojure.spec.alpha/def :portkey.aws.mediaconvert.-2017-08-29.eac-3-settings/stereo-downmix (clojure.spec.alpha/and :portkey.aws.mediaconvert.-2017-08-29/eac-3-stereo-downmix))
(clojure.spec.alpha/def :portkey.aws.mediaconvert.-2017-08-29.eac-3-settings/lt-rt-center-mix-level (clojure.spec.alpha/and :portkey.aws.mediaconvert.-2017-08-29/double-min-negative-60-max-3))
(clojure.spec.alpha/def :portkey.aws.mediaconvert.-2017-08-29.eac-3-settings/surround-ex-mode (clojure.spec.alpha/and :portkey.aws.mediaconvert.-2017-08-29/eac-3-surround-ex-mode))
(clojure.spec.alpha/def :portkey.aws.mediaconvert.-2017-08-29.eac-3-settings/metadata-control (clojure.spec.alpha/and :portkey.aws.mediaconvert.-2017-08-29/eac-3-metadata-control))
(clojure.spec.alpha/def :portkey.aws.mediaconvert.-2017-08-29.eac-3-settings/lo-ro-surround-mix-level (clojure.spec.alpha/and :portkey.aws.mediaconvert.-2017-08-29/double-min-negative-60-max-negative-1))
(clojure.spec.alpha/def :portkey.aws.mediaconvert.-2017-08-29.eac-3-settings/bitstream-mode (clojure.spec.alpha/and :portkey.aws.mediaconvert.-2017-08-29/eac-3-bitstream-mode))
(clojure.spec.alpha/def :portkey.aws.mediaconvert.-2017-08-29.eac-3-settings/dialnorm (clojure.spec.alpha/and :portkey.aws.mediaconvert.-2017-08-29/integer-min-1-max-31))
(clojure.spec.alpha/def :portkey.aws.mediaconvert.-2017-08-29.eac-3-settings/dynamic-range-compression-rf (clojure.spec.alpha/and :portkey.aws.mediaconvert.-2017-08-29/eac-3-dynamic-range-compression-rf))
(clojure.spec.alpha/def :portkey.aws.mediaconvert.-2017-08-29.eac-3-settings/bitrate (clojure.spec.alpha/and :portkey.aws.mediaconvert.-2017-08-29/integer-min-64000-max-640000))
(clojure.spec.alpha/def :portkey.aws.mediaconvert.-2017-08-29/eac-3-settings (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.mediaconvert.-2017-08-29.eac-3-settings/lt-rt-surround-mix-level :portkey.aws.mediaconvert.-2017-08-29.eac-3-settings/coding-mode :portkey.aws.mediaconvert.-2017-08-29.eac-3-settings/phase-control :portkey.aws.mediaconvert.-2017-08-29.eac-3-settings/sample-rate :portkey.aws.mediaconvert.-2017-08-29.eac-3-settings/passthrough-control :portkey.aws.mediaconvert.-2017-08-29.eac-3-settings/dynamic-range-compression-line :portkey.aws.mediaconvert.-2017-08-29.eac-3-settings/surround-mode :portkey.aws.mediaconvert.-2017-08-29.eac-3-settings/attenuation-control :portkey.aws.mediaconvert.-2017-08-29.eac-3-settings/dc-filter :portkey.aws.mediaconvert.-2017-08-29.eac-3-settings/lfe-filter :portkey.aws.mediaconvert.-2017-08-29.eac-3-settings/lfe-control :portkey.aws.mediaconvert.-2017-08-29.eac-3-settings/lo-ro-center-mix-level :portkey.aws.mediaconvert.-2017-08-29.eac-3-settings/stereo-downmix :portkey.aws.mediaconvert.-2017-08-29.eac-3-settings/lt-rt-center-mix-level :portkey.aws.mediaconvert.-2017-08-29.eac-3-settings/surround-ex-mode :portkey.aws.mediaconvert.-2017-08-29.eac-3-settings/metadata-control :portkey.aws.mediaconvert.-2017-08-29.eac-3-settings/lo-ro-surround-mix-level :portkey.aws.mediaconvert.-2017-08-29.eac-3-settings/bitstream-mode :portkey.aws.mediaconvert.-2017-08-29.eac-3-settings/dialnorm :portkey.aws.mediaconvert.-2017-08-29.eac-3-settings/dynamic-range-compression-rf :portkey.aws.mediaconvert.-2017-08-29.eac-3-settings/bitrate]))

(clojure.spec.alpha/def :portkey.aws.mediaconvert.-2017-08-29/cmaf-segment-control #{:segmented-files "SINGLE_FILE" "SEGMENTED_FILES" :single-file})

(clojure.spec.alpha/def :portkey.aws.mediaconvert.-2017-08-29/caption-destination-type #{"EMBEDDED_PLUS_SCTE20" "SCC" :scc :smi :burn-in "SRT" "SCTE20_PLUS_EMBEDDED" "TELETEXT" "DVB_SUB" "SMI" "BURN_IN" "WEBVTT" :embedded-plus-scte-20 :ttml :teletext :scte-20-plus-embedded "EMBEDDED" :webvtt "TTML" :embedded :srt :dvb-sub})

(clojure.spec.alpha/def :portkey.aws.mediaconvert.-2017-08-29/hls-key-provider-type #{"SPEKE" :static-key :speke "STATIC_KEY"})

(clojure.spec.alpha/def :portkey.aws.mediaconvert.-2017-08-29/h-264-dynamic-sub-gop #{:adaptive :static "ADAPTIVE" "STATIC"})

(clojure.spec.alpha/def :portkey.aws.mediaconvert.-2017-08-29/audio-normalization-algorithm #{:itu-bs-1770-2 "ITU_BS_1770_1" "ITU_BS_1770_2" :itu-bs-1770-1})

(clojure.spec.alpha/def :portkey.aws.mediaconvert.-2017-08-29/cmaf-encryption-type #{"SAMPLE_AES" :sample-aes})

(clojure.spec.alpha/def :portkey.aws.mediaconvert.-2017-08-29/hls-i-frame-only-manifest #{:exclude :include "INCLUDE" "EXCLUDE"})

(clojure.spec.alpha/def :portkey.aws.mediaconvert.-2017-08-29/mp-4-moov-placement #{"NORMAL" "PROGRESSIVE_DOWNLOAD" :progressive-download :normal})

(clojure.spec.alpha/def :portkey.aws.mediaconvert.-2017-08-29/string-pattern-s-3-mm-2-vvmmppeeggaavviimmpp-4-ffllvvmmppttmmppggmm-4-vvttrrppff-4-vvmm-2-ttssttss-264-hh-264-mmkkvvmmoovvmmttssmm-2-ttwwmmvvaassffvvoobb-3-ggpp-3-ggppppmmxxffddiivvxxxxvviiddrraawwddvvggxxffmm-1-vv-3-gg-2-vvmmffmm-3-uu-8-llcchhggxxffmmppeegg-2-mmxxffmmppeegg-2-mmxxffhhddwwaavvyy-4-mmxxmmll (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__1012854__auto__] (clojure.core/re-matches #"^(s3:\/\/)([^\/]+\/)+([^\/\.]+|(([^\/]*)\.([mM]2[vV]|[mM][pP][eE][gG]|[aA][vV][iI]|[mM][pP]4|[fF][lL][vV]|[mM][pP][tT]|[mM][pP][gG]|[mM]4[vV]|[tT][rR][pP]|[fF]4[vV]|[mM]2[tT][sS]|[tT][sS]|264|[hH]264|[mM][kK][vV]|[mM][oO][vV]|[mM][tT][sS]|[mM]2[tT]|[wW][mM][vV]|[aA][sS][fF]|[vV][oO][bB]|3[gG][pP]|3[gG][pP][pP]|[mM][xX][fF]|[dD][iI][vV][xX]|[xX][vV][iI][dD]|[rR][aA][wW]|[dD][vV]|[gG][xX][fF]|[mM]1[vV]|3[gG]2|[vV][mM][fF]|[mM]3[uU]8|[lL][cC][hH]|[gG][xX][fF]_[mM][pP][eE][gG]2|[mM][xX][fF]_[mM][pP][eE][gG]2|[mM][xX][fF][hH][dD]|[wW][aA][vV]|[yY]4[mM]|[xX][mM][lL])))$" s__1012854__auto__))))

(clojure.spec.alpha/def :portkey.aws.mediaconvert.-2017-08-29.job-template-settings/esam (clojure.spec.alpha/and :portkey.aws.mediaconvert.-2017-08-29/esam-settings))
(clojure.spec.alpha/def :portkey.aws.mediaconvert.-2017-08-29.job-template-settings/inputs (clojure.spec.alpha/and :portkey.aws.mediaconvert.-2017-08-29/list-of-input-template))
(clojure.spec.alpha/def :portkey.aws.mediaconvert.-2017-08-29.job-template-settings/ad-avail-offset (clojure.spec.alpha/and :portkey.aws.mediaconvert.-2017-08-29/integer-min-negative-1000-max-1000))
(clojure.spec.alpha/def :portkey.aws.mediaconvert.-2017-08-29.job-template-settings/output-groups (clojure.spec.alpha/and :portkey.aws.mediaconvert.-2017-08-29/list-of-output-group))
(clojure.spec.alpha/def :portkey.aws.mediaconvert.-2017-08-29/job-template-settings (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.mediaconvert.-2017-08-29.job-template-settings/esam :portkey.aws.mediaconvert.-2017-08-29.job-template-settings/inputs :portkey.aws.mediaconvert.-2017-08-29/timed-metadata-insertion :portkey.aws.mediaconvert.-2017-08-29/motion-image-inserter :portkey.aws.mediaconvert.-2017-08-29/timecode-config :portkey.aws.mediaconvert.-2017-08-29.job-template-settings/ad-avail-offset :portkey.aws.mediaconvert.-2017-08-29.job-template-settings/output-groups :portkey.aws.mediaconvert.-2017-08-29/nielsen-configuration :portkey.aws.mediaconvert.-2017-08-29/avail-blanking]))

(clojure.spec.alpha/def :portkey.aws.mediaconvert.-2017-08-29/integer-min-0-max-500 (clojure.spec.alpha/int-in 0 500))

(clojure.spec.alpha/def :portkey.aws.mediaconvert.-2017-08-29/string-min-14-pattern-s-3-scc-scc-ttml-ttml-dfxp-dfxp-stl-stl-srt-srt-smi-smi (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__1012852__auto__] (clojure.core/<= 14 (clojure.core/count s__1012852__auto__))) (clojure.core/fn [s__1012854__auto__] (clojure.core/re-matches #"^(s3:\/\/)(.*?)\.(scc|SCC|ttml|TTML|dfxp|DFXP|stl|STL|srt|SRT|smi|SMI)$" s__1012854__auto__))))

(clojure.spec.alpha/def :portkey.aws.mediaconvert.-2017-08-29/h-264-repeat-pps #{"DISABLED" :disabled "ENABLED" :enabled})

(clojure.spec.alpha/def :portkey.aws.mediaconvert.-2017-08-29/cmaf-manifest-compression #{"GZIP" "NONE" :gzip :none})

(clojure.spec.alpha/def :portkey.aws.mediaconvert.-2017-08-29/update-queue-response (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.mediaconvert.-2017-08-29/queue]))

(clojure.spec.alpha/def :portkey.aws.mediaconvert.-2017-08-29/mpeg-2-interlace-mode #{:follow-top-field :follow-bottom-field "BOTTOM_FIELD" "FOLLOW_TOP_FIELD" "PROGRESSIVE" "FOLLOW_BOTTOM_FIELD" :bottom-field :progressive :top-field "TOP_FIELD"})

(clojure.spec.alpha/def :portkey.aws.mediaconvert.-2017-08-29/h-264-telecine #{:soft "SOFT" "HARD" "NONE" :none :hard})

(clojure.spec.alpha/def :portkey.aws.mediaconvert.-2017-08-29.delete-job-template-request/name (clojure.spec.alpha/and :portkey.aws.mediaconvert.-2017-08-29/string))
(clojure.spec.alpha/def :portkey.aws.mediaconvert.-2017-08-29/delete-job-template-request (clojure.spec.alpha/keys :req-un [:portkey.aws.mediaconvert.-2017-08-29.delete-job-template-request/name] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.mediaconvert.-2017-08-29/integer-min-1000-max-288000000 (clojure.spec.alpha/int-in 1000 288000000))

(clojure.spec.alpha/def :portkey.aws.mediaconvert.-2017-08-29.list-jobs-request/max-results (clojure.spec.alpha/and :portkey.aws.mediaconvert.-2017-08-29/integer-min-1-max-20))
(clojure.spec.alpha/def :portkey.aws.mediaconvert.-2017-08-29.list-jobs-request/next-token (clojure.spec.alpha/and :portkey.aws.mediaconvert.-2017-08-29/string))
(clojure.spec.alpha/def :portkey.aws.mediaconvert.-2017-08-29.list-jobs-request/queue (clojure.spec.alpha/and :portkey.aws.mediaconvert.-2017-08-29/string))
(clojure.spec.alpha/def :portkey.aws.mediaconvert.-2017-08-29.list-jobs-request/status (clojure.spec.alpha/and :portkey.aws.mediaconvert.-2017-08-29/job-status))
(clojure.spec.alpha/def :portkey.aws.mediaconvert.-2017-08-29/list-jobs-request (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.mediaconvert.-2017-08-29.list-jobs-request/max-results :portkey.aws.mediaconvert.-2017-08-29.list-jobs-request/next-token :portkey.aws.mediaconvert.-2017-08-29/order :portkey.aws.mediaconvert.-2017-08-29.list-jobs-request/queue :portkey.aws.mediaconvert.-2017-08-29.list-jobs-request/status]))

(clojure.spec.alpha/def :portkey.aws.mediaconvert.-2017-08-29/integer-min-0-max-30000 (clojure.spec.alpha/int-in 0 30000))

(clojure.spec.alpha/def :portkey.aws.mediaconvert.-2017-08-29.esam-manifest-confirm-condition-notification/mcc-xml (clojure.spec.alpha/and :portkey.aws.mediaconvert.-2017-08-29/string-pattern-sn-manifest-confirm-condition-notification-ns))
(clojure.spec.alpha/def :portkey.aws.mediaconvert.-2017-08-29/esam-manifest-confirm-condition-notification (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.mediaconvert.-2017-08-29.esam-manifest-confirm-condition-notification/mcc-xml]))

(clojure.spec.alpha/def :portkey.aws.mediaconvert.-2017-08-29/job-template-list-by #{"SYSTEM" "CREATION_DATE" :system "NAME" :name :creation-date})

(clojure.spec.alpha/def :portkey.aws.mediaconvert.-2017-08-29/container-type #{:m-2-ts :ismv :mp-4 "MOV" "MP4" :m-3-u-8 :raw :mxf "F4V" "ISMV" :cmfc "MXF" "MPD" :f-4-v :mov "RAW" :mpd "M3U8" "CMFC" "M2TS"})

(clojure.spec.alpha/def :portkey.aws.mediaconvert.-2017-08-29/integer-min-0-max-1152000000 (clojure.spec.alpha/int-in 0 1152000000))

(clojure.spec.alpha/def :portkey.aws.mediaconvert.-2017-08-29.list-tags-for-resource-request/arn (clojure.spec.alpha/and :portkey.aws.mediaconvert.-2017-08-29/string))
(clojure.spec.alpha/def :portkey.aws.mediaconvert.-2017-08-29/list-tags-for-resource-request (clojure.spec.alpha/keys :req-un [:portkey.aws.mediaconvert.-2017-08-29.list-tags-for-resource-request/arn] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.mediaconvert.-2017-08-29.dvb-sdt-settings/sdt-interval (clojure.spec.alpha/and :portkey.aws.mediaconvert.-2017-08-29/integer-min-25-max-2000))
(clojure.spec.alpha/def :portkey.aws.mediaconvert.-2017-08-29.dvb-sdt-settings/service-name (clojure.spec.alpha/and :portkey.aws.mediaconvert.-2017-08-29/string-min-1-max-256))
(clojure.spec.alpha/def :portkey.aws.mediaconvert.-2017-08-29.dvb-sdt-settings/service-provider-name (clojure.spec.alpha/and :portkey.aws.mediaconvert.-2017-08-29/string-min-1-max-256))
(clojure.spec.alpha/def :portkey.aws.mediaconvert.-2017-08-29/dvb-sdt-settings (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.mediaconvert.-2017-08-29/output-sdt :portkey.aws.mediaconvert.-2017-08-29.dvb-sdt-settings/sdt-interval :portkey.aws.mediaconvert.-2017-08-29.dvb-sdt-settings/service-name :portkey.aws.mediaconvert.-2017-08-29.dvb-sdt-settings/service-provider-name]))

(clojure.spec.alpha/def :portkey.aws.mediaconvert.-2017-08-29.forbidden-exception/message (clojure.spec.alpha/and :portkey.aws.mediaconvert.-2017-08-29/string))
(clojure.spec.alpha/def :portkey.aws.mediaconvert.-2017-08-29/forbidden-exception (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.mediaconvert.-2017-08-29.forbidden-exception/message]))

(clojure.spec.alpha/def :portkey.aws.mediaconvert.-2017-08-29/dvb-subtitle-outline-color #{:white :yellow :green "GREEN" "BLUE" :red :blue "WHITE" "YELLOW" "BLACK" "RED" :black})

(clojure.spec.alpha/def :portkey.aws.mediaconvert.-2017-08-29/cmaf-stream-inf-resolution #{:exclude :include "INCLUDE" "EXCLUDE"})

(clojure.spec.alpha/def :portkey.aws.mediaconvert.-2017-08-29/h-265-adaptive-quantization #{:higher :medium "LOW" "MAX" :high "HIGHER" :max :off "HIGH" :low "OFF" "MEDIUM"})

(clojure.spec.alpha/def :portkey.aws.mediaconvert.-2017-08-29/string-min-24-max-512-pattern-a-za-z-0902 (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__1012852__auto__] (clojure.core/<= 24 (clojure.core/count s__1012852__auto__))) (clojure.core/fn [s__1012853__auto__] (clojure.core/< (clojure.core/count s__1012853__auto__) 512)) (clojure.core/fn [s__1012854__auto__] (clojure.core/re-matches #"^[A-Za-z0-9+\/]+={0,2}$" s__1012854__auto__))))

(clojure.spec.alpha/def :portkey.aws.mediaconvert.-2017-08-29/hls-offline-encrypted #{"DISABLED" :disabled "ENABLED" :enabled})

(clojure.spec.alpha/def :portkey.aws.mediaconvert.-2017-08-29.hls-settings/audio-group-id (clojure.spec.alpha/and :portkey.aws.mediaconvert.-2017-08-29/string))
(clojure.spec.alpha/def :portkey.aws.mediaconvert.-2017-08-29.hls-settings/audio-rendition-sets (clojure.spec.alpha/and :portkey.aws.mediaconvert.-2017-08-29/string))
(clojure.spec.alpha/def :portkey.aws.mediaconvert.-2017-08-29.hls-settings/audio-track-type (clojure.spec.alpha/and :portkey.aws.mediaconvert.-2017-08-29/hls-audio-track-type))
(clojure.spec.alpha/def :portkey.aws.mediaconvert.-2017-08-29.hls-settings/i-frame-only-manifest (clojure.spec.alpha/and :portkey.aws.mediaconvert.-2017-08-29/hls-i-frame-only-manifest))
(clojure.spec.alpha/def :portkey.aws.mediaconvert.-2017-08-29.hls-settings/segment-modifier (clojure.spec.alpha/and :portkey.aws.mediaconvert.-2017-08-29/string))
(clojure.spec.alpha/def :portkey.aws.mediaconvert.-2017-08-29/hls-settings (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.mediaconvert.-2017-08-29.hls-settings/audio-group-id :portkey.aws.mediaconvert.-2017-08-29.hls-settings/audio-rendition-sets :portkey.aws.mediaconvert.-2017-08-29.hls-settings/audio-track-type :portkey.aws.mediaconvert.-2017-08-29.hls-settings/i-frame-only-manifest :portkey.aws.mediaconvert.-2017-08-29.hls-settings/segment-modifier]))

(clojure.spec.alpha/def :portkey.aws.mediaconvert.-2017-08-29/ac-3-lfe-filter #{"DISABLED" :disabled "ENABLED" :enabled})

(clojure.spec.alpha/def :portkey.aws.mediaconvert.-2017-08-29/list-of-endpoint (clojure.spec.alpha/coll-of :portkey.aws.mediaconvert.-2017-08-29/endpoint))

(clojure.spec.alpha/def :portkey.aws.mediaconvert.-2017-08-29/string-pattern-01-d-20305-d-205-d (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__1012854__auto__] (clojure.core/re-matches #"^((([0-1]\d)|(2[0-3]))(:[0-5]\d){2}([:;][0-5]\d))$" s__1012854__auto__))))

(clojure.spec.alpha/def :portkey.aws.mediaconvert.-2017-08-29/integer-min-0-max-9 (clojure.spec.alpha/int-in 0 9))

(clojure.spec.alpha/def :portkey.aws.mediaconvert.-2017-08-29.resource-tags/arn (clojure.spec.alpha/and :portkey.aws.mediaconvert.-2017-08-29/string))
(clojure.spec.alpha/def :portkey.aws.mediaconvert.-2017-08-29.resource-tags/tags (clojure.spec.alpha/and :portkey.aws.mediaconvert.-2017-08-29/map-of-string))
(clojure.spec.alpha/def :portkey.aws.mediaconvert.-2017-08-29/resource-tags (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.mediaconvert.-2017-08-29.resource-tags/arn :portkey.aws.mediaconvert.-2017-08-29.resource-tags/tags]))

(clojure.spec.alpha/def :portkey.aws.mediaconvert.-2017-08-29/mpeg-2-codec-level #{"HIGH1440" :high-1440 "AUTO" "LOW" :high "MAIN" "HIGH" :low :main :auto})

(clojure.spec.alpha/def :portkey.aws.mediaconvert.-2017-08-29/create-job-response (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.mediaconvert.-2017-08-29/job]))

(clojure.spec.alpha/def :portkey.aws.mediaconvert.-2017-08-29/mpeg-2-rate-control-mode #{"VBR" :cbr :vbr "CBR"})

(clojure.spec.alpha/def :portkey.aws.mediaconvert.-2017-08-29.aiff-settings/bit-depth (clojure.spec.alpha/and :portkey.aws.mediaconvert.-2017-08-29/integer-min-16-max-24))
(clojure.spec.alpha/def :portkey.aws.mediaconvert.-2017-08-29.aiff-settings/channels (clojure.spec.alpha/and :portkey.aws.mediaconvert.-2017-08-29/integer-min-1-max-2))
(clojure.spec.alpha/def :portkey.aws.mediaconvert.-2017-08-29.aiff-settings/sample-rate (clojure.spec.alpha/and :portkey.aws.mediaconvert.-2017-08-29/integer-min-8000-max-192000))
(clojure.spec.alpha/def :portkey.aws.mediaconvert.-2017-08-29/aiff-settings (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.mediaconvert.-2017-08-29.aiff-settings/bit-depth :portkey.aws.mediaconvert.-2017-08-29.aiff-settings/channels :portkey.aws.mediaconvert.-2017-08-29.aiff-settings/sample-rate]))

(clojure.spec.alpha/def :portkey.aws.mediaconvert.-2017-08-29.queue/submitted-jobs-count (clojure.spec.alpha/and :portkey.aws.mediaconvert.-2017-08-29/integer))
(clojure.spec.alpha/def :portkey.aws.mediaconvert.-2017-08-29.queue/status (clojure.spec.alpha/and :portkey.aws.mediaconvert.-2017-08-29/queue-status))
(clojure.spec.alpha/def :portkey.aws.mediaconvert.-2017-08-29.queue/progressing-jobs-count (clojure.spec.alpha/and :portkey.aws.mediaconvert.-2017-08-29/integer))
(clojure.spec.alpha/def :portkey.aws.mediaconvert.-2017-08-29.queue/description (clojure.spec.alpha/and :portkey.aws.mediaconvert.-2017-08-29/string))
(clojure.spec.alpha/def :portkey.aws.mediaconvert.-2017-08-29.queue/arn (clojure.spec.alpha/and :portkey.aws.mediaconvert.-2017-08-29/string))
(clojure.spec.alpha/def :portkey.aws.mediaconvert.-2017-08-29.queue/created-at (clojure.spec.alpha/and :portkey.aws.mediaconvert.-2017-08-29/timestamp-unix))
(clojure.spec.alpha/def :portkey.aws.mediaconvert.-2017-08-29.queue/name (clojure.spec.alpha/and :portkey.aws.mediaconvert.-2017-08-29/string))
(clojure.spec.alpha/def :portkey.aws.mediaconvert.-2017-08-29.queue/last-updated (clojure.spec.alpha/and :portkey.aws.mediaconvert.-2017-08-29/timestamp-unix))
(clojure.spec.alpha/def :portkey.aws.mediaconvert.-2017-08-29/queue (clojure.spec.alpha/keys :req-un [:portkey.aws.mediaconvert.-2017-08-29.queue/name] :opt-un [:portkey.aws.mediaconvert.-2017-08-29/reservation-plan :portkey.aws.mediaconvert.-2017-08-29/type :portkey.aws.mediaconvert.-2017-08-29.queue/submitted-jobs-count :portkey.aws.mediaconvert.-2017-08-29/pricing-plan :portkey.aws.mediaconvert.-2017-08-29.queue/status :portkey.aws.mediaconvert.-2017-08-29.queue/progressing-jobs-count :portkey.aws.mediaconvert.-2017-08-29.queue/description :portkey.aws.mediaconvert.-2017-08-29.queue/arn :portkey.aws.mediaconvert.-2017-08-29.queue/created-at :portkey.aws.mediaconvert.-2017-08-29.queue/last-updated]))

(clojure.spec.alpha/def :portkey.aws.mediaconvert.-2017-08-29/hls-stream-inf-resolution #{:exclude :include "INCLUDE" "EXCLUDE"})

(clojure.spec.alpha/def :portkey.aws.mediaconvert.-2017-08-29/h-264-field-encoding #{:force-field "FORCE_FIELD" "PAFF" :paff})

(clojure.spec.alpha/def :portkey.aws.mediaconvert.-2017-08-29/string-pattern-0940191020191209301 (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__1012854__auto__] (clojure.core/re-matches #"^([0-9]{4})-(0[1-9]|1[0-2])-(0[1-9]|[12][0-9]|3[01])$" s__1012854__auto__))))

(clojure.spec.alpha/def :portkey.aws.mediaconvert.-2017-08-29/integer-min-0-max-47185920 (clojure.spec.alpha/int-in 0 47185920))

(clojure.spec.alpha/def :portkey.aws.mediaconvert.-2017-08-29/hls-caption-language-setting #{:insert "INSERT" "NONE" :omit "OMIT" :none})

(clojure.spec.alpha/def :portkey.aws.mediaconvert.-2017-08-29.m-2ts-settings/pat-interval (clojure.spec.alpha/and :portkey.aws.mediaconvert.-2017-08-29/integer-min-0-max-1000))
(clojure.spec.alpha/def :portkey.aws.mediaconvert.-2017-08-29.m-2ts-settings/scte-35-source (clojure.spec.alpha/and :portkey.aws.mediaconvert.-2017-08-29/m-2ts-scte-35-source))
(clojure.spec.alpha/def :portkey.aws.mediaconvert.-2017-08-29.m-2ts-settings/buffer-model (clojure.spec.alpha/and :portkey.aws.mediaconvert.-2017-08-29/m-2ts-buffer-model))
(clojure.spec.alpha/def :portkey.aws.mediaconvert.-2017-08-29.m-2ts-settings/audio-frames-per-pes (clojure.spec.alpha/and :portkey.aws.mediaconvert.-2017-08-29/integer-min-0-max-2147483647))
(clojure.spec.alpha/def :portkey.aws.mediaconvert.-2017-08-29.m-2ts-settings/fragment-time (clojure.spec.alpha/and :portkey.aws.mediaconvert.-2017-08-29/double-min-0))
(clojure.spec.alpha/def :portkey.aws.mediaconvert.-2017-08-29.m-2ts-settings/transport-stream-id (clojure.spec.alpha/and :portkey.aws.mediaconvert.-2017-08-29/integer-min-0-max-65535))
(clojure.spec.alpha/def :portkey.aws.mediaconvert.-2017-08-29.m-2ts-settings/pcr-control (clojure.spec.alpha/and :portkey.aws.mediaconvert.-2017-08-29/m-2ts-pcr-control))
(clojure.spec.alpha/def :portkey.aws.mediaconvert.-2017-08-29.m-2ts-settings/scte-35-pid (clojure.spec.alpha/and :portkey.aws.mediaconvert.-2017-08-29/integer-min-32-max-8182))
(clojure.spec.alpha/def :portkey.aws.mediaconvert.-2017-08-29.m-2ts-settings/min-ebp-interval (clojure.spec.alpha/and :portkey.aws.mediaconvert.-2017-08-29/integer-min-0-max-10000))
(clojure.spec.alpha/def :portkey.aws.mediaconvert.-2017-08-29.m-2ts-settings/program-number (clojure.spec.alpha/and :portkey.aws.mediaconvert.-2017-08-29/integer-min-0-max-65535))
(clojure.spec.alpha/def :portkey.aws.mediaconvert.-2017-08-29.m-2ts-settings/pcr-pid (clojure.spec.alpha/and :portkey.aws.mediaconvert.-2017-08-29/integer-min-32-max-8182))
(clojure.spec.alpha/def :portkey.aws.mediaconvert.-2017-08-29.m-2ts-settings/pmt-pid (clojure.spec.alpha/and :portkey.aws.mediaconvert.-2017-08-29/integer-min-32-max-8182))
(clojure.spec.alpha/def :portkey.aws.mediaconvert.-2017-08-29.m-2ts-settings/video-pid (clojure.spec.alpha/and :portkey.aws.mediaconvert.-2017-08-29/integer-min-32-max-8182))
(clojure.spec.alpha/def :portkey.aws.mediaconvert.-2017-08-29.m-2ts-settings/rate-mode (clojure.spec.alpha/and :portkey.aws.mediaconvert.-2017-08-29/m-2ts-rate-mode))
(clojure.spec.alpha/def :portkey.aws.mediaconvert.-2017-08-29.m-2ts-settings/audio-pids (clojure.spec.alpha/and :portkey.aws.mediaconvert.-2017-08-29/list-of-integer-min-32-max-8182))
(clojure.spec.alpha/def :portkey.aws.mediaconvert.-2017-08-29.m-2ts-settings/nielsen-id-3 (clojure.spec.alpha/and :portkey.aws.mediaconvert.-2017-08-29/m-2ts-nielsen-id-3))
(clojure.spec.alpha/def :portkey.aws.mediaconvert.-2017-08-29.m-2ts-settings/max-pcr-interval (clojure.spec.alpha/and :portkey.aws.mediaconvert.-2017-08-29/integer-min-0-max-500))
(clojure.spec.alpha/def :portkey.aws.mediaconvert.-2017-08-29.m-2ts-settings/pmt-interval (clojure.spec.alpha/and :portkey.aws.mediaconvert.-2017-08-29/integer-min-0-max-1000))
(clojure.spec.alpha/def :portkey.aws.mediaconvert.-2017-08-29.m-2ts-settings/segmentation-style (clojure.spec.alpha/and :portkey.aws.mediaconvert.-2017-08-29/m-2ts-segmentation-style))
(clojure.spec.alpha/def :portkey.aws.mediaconvert.-2017-08-29.m-2ts-settings/null-packet-bitrate (clojure.spec.alpha/and :portkey.aws.mediaconvert.-2017-08-29/double-min-0))
(clojure.spec.alpha/def :portkey.aws.mediaconvert.-2017-08-29.m-2ts-settings/segmentation-markers (clojure.spec.alpha/and :portkey.aws.mediaconvert.-2017-08-29/m-2ts-segmentation-markers))
(clojure.spec.alpha/def :portkey.aws.mediaconvert.-2017-08-29.m-2ts-settings/ebp-placement (clojure.spec.alpha/and :portkey.aws.mediaconvert.-2017-08-29/m-2ts-ebp-placement))
(clojure.spec.alpha/def :portkey.aws.mediaconvert.-2017-08-29.m-2ts-settings/audio-buffer-model (clojure.spec.alpha/and :portkey.aws.mediaconvert.-2017-08-29/m-2ts-audio-buffer-model))
(clojure.spec.alpha/def :portkey.aws.mediaconvert.-2017-08-29.m-2ts-settings/es-rate-in-pes (clojure.spec.alpha/and :portkey.aws.mediaconvert.-2017-08-29/m-2ts-es-rate-in-pes))
(clojure.spec.alpha/def :portkey.aws.mediaconvert.-2017-08-29.m-2ts-settings/timed-metadata-pid (clojure.spec.alpha/and :portkey.aws.mediaconvert.-2017-08-29/integer-min-32-max-8182))
(clojure.spec.alpha/def :portkey.aws.mediaconvert.-2017-08-29.m-2ts-settings/force-ts-video-ebp-order (clojure.spec.alpha/and :portkey.aws.mediaconvert.-2017-08-29/m-2ts-force-ts-video-ebp-order))
(clojure.spec.alpha/def :portkey.aws.mediaconvert.-2017-08-29.m-2ts-settings/scte-35-esam (clojure.spec.alpha/and :portkey.aws.mediaconvert.-2017-08-29/m-2ts-scte-35-esam))
(clojure.spec.alpha/def :portkey.aws.mediaconvert.-2017-08-29.m-2ts-settings/dvb-sub-pids (clojure.spec.alpha/and :portkey.aws.mediaconvert.-2017-08-29/list-of-integer-min-32-max-8182))
(clojure.spec.alpha/def :portkey.aws.mediaconvert.-2017-08-29.m-2ts-settings/ebp-audio-interval (clojure.spec.alpha/and :portkey.aws.mediaconvert.-2017-08-29/m-2ts-ebp-audio-interval))
(clojure.spec.alpha/def :portkey.aws.mediaconvert.-2017-08-29.m-2ts-settings/private-metadata-pid (clojure.spec.alpha/and :portkey.aws.mediaconvert.-2017-08-29/integer-min-32-max-8182))
(clojure.spec.alpha/def :portkey.aws.mediaconvert.-2017-08-29.m-2ts-settings/dvb-teletext-pid (clojure.spec.alpha/and :portkey.aws.mediaconvert.-2017-08-29/integer-min-32-max-8182))
(clojure.spec.alpha/def :portkey.aws.mediaconvert.-2017-08-29.m-2ts-settings/bitrate (clojure.spec.alpha/and :portkey.aws.mediaconvert.-2017-08-29/integer-min-0-max-2147483647))
(clojure.spec.alpha/def :portkey.aws.mediaconvert.-2017-08-29.m-2ts-settings/segmentation-time (clojure.spec.alpha/and :portkey.aws.mediaconvert.-2017-08-29/double-min-0))
(clojure.spec.alpha/def :portkey.aws.mediaconvert.-2017-08-29/m-2ts-settings (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.mediaconvert.-2017-08-29.m-2ts-settings/pat-interval :portkey.aws.mediaconvert.-2017-08-29.m-2ts-settings/scte-35-source :portkey.aws.mediaconvert.-2017-08-29.m-2ts-settings/buffer-model :portkey.aws.mediaconvert.-2017-08-29/dvb-tdt-settings :portkey.aws.mediaconvert.-2017-08-29.m-2ts-settings/audio-frames-per-pes :portkey.aws.mediaconvert.-2017-08-29.m-2ts-settings/fragment-time :portkey.aws.mediaconvert.-2017-08-29.m-2ts-settings/transport-stream-id :portkey.aws.mediaconvert.-2017-08-29/dvb-sdt-settings :portkey.aws.mediaconvert.-2017-08-29.m-2ts-settings/pcr-control :portkey.aws.mediaconvert.-2017-08-29.m-2ts-settings/scte-35-pid :portkey.aws.mediaconvert.-2017-08-29.m-2ts-settings/min-ebp-interval :portkey.aws.mediaconvert.-2017-08-29.m-2ts-settings/program-number :portkey.aws.mediaconvert.-2017-08-29.m-2ts-settings/pcr-pid :portkey.aws.mediaconvert.-2017-08-29.m-2ts-settings/pmt-pid :portkey.aws.mediaconvert.-2017-08-29.m-2ts-settings/video-pid :portkey.aws.mediaconvert.-2017-08-29.m-2ts-settings/rate-mode :portkey.aws.mediaconvert.-2017-08-29.m-2ts-settings/audio-pids :portkey.aws.mediaconvert.-2017-08-29.m-2ts-settings/nielsen-id-3 :portkey.aws.mediaconvert.-2017-08-29.m-2ts-settings/max-pcr-interval :portkey.aws.mediaconvert.-2017-08-29.m-2ts-settings/pmt-interval :portkey.aws.mediaconvert.-2017-08-29.m-2ts-settings/segmentation-style :portkey.aws.mediaconvert.-2017-08-29.m-2ts-settings/null-packet-bitrate :portkey.aws.mediaconvert.-2017-08-29.m-2ts-settings/segmentation-markers :portkey.aws.mediaconvert.-2017-08-29.m-2ts-settings/ebp-placement :portkey.aws.mediaconvert.-2017-08-29.m-2ts-settings/audio-buffer-model :portkey.aws.mediaconvert.-2017-08-29.m-2ts-settings/es-rate-in-pes :portkey.aws.mediaconvert.-2017-08-29.m-2ts-settings/timed-metadata-pid :portkey.aws.mediaconvert.-2017-08-29.m-2ts-settings/force-ts-video-ebp-order :portkey.aws.mediaconvert.-2017-08-29.m-2ts-settings/scte-35-esam :portkey.aws.mediaconvert.-2017-08-29.m-2ts-settings/dvb-sub-pids :portkey.aws.mediaconvert.-2017-08-29.m-2ts-settings/ebp-audio-interval :portkey.aws.mediaconvert.-2017-08-29/dvb-nit-settings :portkey.aws.mediaconvert.-2017-08-29.m-2ts-settings/private-metadata-pid :portkey.aws.mediaconvert.-2017-08-29.m-2ts-settings/dvb-teletext-pid :portkey.aws.mediaconvert.-2017-08-29.m-2ts-settings/bitrate :portkey.aws.mediaconvert.-2017-08-29.m-2ts-settings/segmentation-time]))

(clojure.spec.alpha/def :portkey.aws.mediaconvert.-2017-08-29/string (clojure.spec.alpha/and clojure.core/string?))

(clojure.spec.alpha/def :portkey.aws.mediaconvert.-2017-08-29.dvb-sub-source-settings/pid (clojure.spec.alpha/and :portkey.aws.mediaconvert.-2017-08-29/integer-min-1-max-2147483647))
(clojure.spec.alpha/def :portkey.aws.mediaconvert.-2017-08-29/dvb-sub-source-settings (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.mediaconvert.-2017-08-29.dvb-sub-source-settings/pid]))

(clojure.spec.alpha/def :portkey.aws.mediaconvert.-2017-08-29/input-denoise-filter #{"DISABLED" :disabled "ENABLED" :enabled})

(clojure.spec.alpha/def :portkey.aws.mediaconvert.-2017-08-29/audio-selector-type #{"LANGUAGE_CODE" :pid :language-code "TRACK" "PID" :track})

(clojure.spec.alpha/def :portkey.aws.mediaconvert.-2017-08-29/mpeg-2-framerate-control #{"SPECIFIED" "INITIALIZE_FROM_SOURCE" :specified :initialize-from-source})

(clojure.spec.alpha/def :portkey.aws.mediaconvert.-2017-08-29/afd-signaling #{"AUTO" "FIXED" "NONE" :fixed :auto :none})

(clojure.spec.alpha/def :portkey.aws.mediaconvert.-2017-08-29/pricing-plan #{"ON_DEMAND" :reserved "RESERVED" :on-demand})

(clojure.spec.alpha/def :portkey.aws.mediaconvert.-2017-08-29.disassociate-certificate-request/arn (clojure.spec.alpha/and :portkey.aws.mediaconvert.-2017-08-29/string))
(clojure.spec.alpha/def :portkey.aws.mediaconvert.-2017-08-29/disassociate-certificate-request (clojure.spec.alpha/keys :req-un [:portkey.aws.mediaconvert.-2017-08-29.disassociate-certificate-request/arn] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.mediaconvert.-2017-08-29/eac-3-metadata-control #{"FOLLOW_INPUT" :follow-input "USE_CONFIGURED" :use-configured})

(clojure.spec.alpha/def :portkey.aws.mediaconvert.-2017-08-29/integer-min-0-max-65535 (clojure.spec.alpha/int-in 0 65535))

(clojure.spec.alpha/def :portkey.aws.mediaconvert.-2017-08-29/integer-min-8000-max-192000 (clojure.spec.alpha/int-in 8000 192000))

(clojure.spec.alpha/def :portkey.aws.mediaconvert.-2017-08-29/h-264-quality-tuning-level #{:single-pass "MULTI_PASS_HQ" "SINGLE_PASS" :multi-pass-hq :single-pass-hq "SINGLE_PASS_HQ"})

(clojure.spec.alpha/def :portkey.aws.mediaconvert.-2017-08-29/m-3u-8-scte-35-source #{"PASSTHROUGH" "NONE" :passthrough :none})

(clojure.spec.alpha/def :portkey.aws.mediaconvert.-2017-08-29/noise-reducer-filter #{"LANCZOS" :bilateral "MEAN" "SPATIAL" :conserve :mean "GAUSSIAN" "SHARPEN" "BILATERAL" :spatial :gaussian :sharpen :lanczos "CONSERVE"})

(clojure.spec.alpha/def :portkey.aws.mediaconvert.-2017-08-29/integer-min-0-max-2147483647 (clojure.spec.alpha/int-in 0 2147483647))

(clojure.spec.alpha/def :portkey.aws.mediaconvert.-2017-08-29/integer-min-6000-max-1024000 (clojure.spec.alpha/int-in 6000 1024000))

(clojure.spec.alpha/def :portkey.aws.mediaconvert.-2017-08-29/long clojure.core/int?)

(clojure.spec.alpha/def :portkey.aws.mediaconvert.-2017-08-29.cmaf-group-settings/segment-length (clojure.spec.alpha/and :portkey.aws.mediaconvert.-2017-08-29/integer-min-1-max-2147483647))
(clojure.spec.alpha/def :portkey.aws.mediaconvert.-2017-08-29.cmaf-group-settings/min-buffer-time (clojure.spec.alpha/and :portkey.aws.mediaconvert.-2017-08-29/integer-min-0-max-2147483647))
(clojure.spec.alpha/def :portkey.aws.mediaconvert.-2017-08-29.cmaf-group-settings/fragment-length (clojure.spec.alpha/and :portkey.aws.mediaconvert.-2017-08-29/integer-min-1-max-2147483647))
(clojure.spec.alpha/def :portkey.aws.mediaconvert.-2017-08-29.cmaf-group-settings/segment-control (clojure.spec.alpha/and :portkey.aws.mediaconvert.-2017-08-29/cmaf-segment-control))
(clojure.spec.alpha/def :portkey.aws.mediaconvert.-2017-08-29.cmaf-group-settings/write-hls-manifest (clojure.spec.alpha/and :portkey.aws.mediaconvert.-2017-08-29/cmaf-write-hls-manifest))
(clojure.spec.alpha/def :portkey.aws.mediaconvert.-2017-08-29.cmaf-group-settings/base-url (clojure.spec.alpha/and :portkey.aws.mediaconvert.-2017-08-29/string))
(clojure.spec.alpha/def :portkey.aws.mediaconvert.-2017-08-29.cmaf-group-settings/destination (clojure.spec.alpha/and :portkey.aws.mediaconvert.-2017-08-29/string-pattern-s-3))
(clojure.spec.alpha/def :portkey.aws.mediaconvert.-2017-08-29.cmaf-group-settings/min-final-segment-length (clojure.spec.alpha/and :portkey.aws.mediaconvert.-2017-08-29/double-min-0-max-2147483647))
(clojure.spec.alpha/def :portkey.aws.mediaconvert.-2017-08-29.cmaf-group-settings/stream-inf-resolution (clojure.spec.alpha/and :portkey.aws.mediaconvert.-2017-08-29/cmaf-stream-inf-resolution))
(clojure.spec.alpha/def :portkey.aws.mediaconvert.-2017-08-29.cmaf-group-settings/manifest-duration-format (clojure.spec.alpha/and :portkey.aws.mediaconvert.-2017-08-29/cmaf-manifest-duration-format))
(clojure.spec.alpha/def :portkey.aws.mediaconvert.-2017-08-29.cmaf-group-settings/write-dash-manifest (clojure.spec.alpha/and :portkey.aws.mediaconvert.-2017-08-29/cmaf-write-dash-manifest))
(clojure.spec.alpha/def :portkey.aws.mediaconvert.-2017-08-29.cmaf-group-settings/manifest-compression (clojure.spec.alpha/and :portkey.aws.mediaconvert.-2017-08-29/cmaf-manifest-compression))
(clojure.spec.alpha/def :portkey.aws.mediaconvert.-2017-08-29.cmaf-group-settings/encryption (clojure.spec.alpha/and :portkey.aws.mediaconvert.-2017-08-29/cmaf-encryption-settings))
(clojure.spec.alpha/def :portkey.aws.mediaconvert.-2017-08-29.cmaf-group-settings/codec-specification (clojure.spec.alpha/and :portkey.aws.mediaconvert.-2017-08-29/cmaf-codec-specification))
(clojure.spec.alpha/def :portkey.aws.mediaconvert.-2017-08-29.cmaf-group-settings/client-cache (clojure.spec.alpha/and :portkey.aws.mediaconvert.-2017-08-29/cmaf-client-cache))
(clojure.spec.alpha/def :portkey.aws.mediaconvert.-2017-08-29/cmaf-group-settings (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.mediaconvert.-2017-08-29.cmaf-group-settings/segment-length :portkey.aws.mediaconvert.-2017-08-29.cmaf-group-settings/min-buffer-time :portkey.aws.mediaconvert.-2017-08-29.cmaf-group-settings/fragment-length :portkey.aws.mediaconvert.-2017-08-29.cmaf-group-settings/segment-control :portkey.aws.mediaconvert.-2017-08-29.cmaf-group-settings/write-hls-manifest :portkey.aws.mediaconvert.-2017-08-29.cmaf-group-settings/base-url :portkey.aws.mediaconvert.-2017-08-29.cmaf-group-settings/destination :portkey.aws.mediaconvert.-2017-08-29.cmaf-group-settings/min-final-segment-length :portkey.aws.mediaconvert.-2017-08-29.cmaf-group-settings/stream-inf-resolution :portkey.aws.mediaconvert.-2017-08-29.cmaf-group-settings/manifest-duration-format :portkey.aws.mediaconvert.-2017-08-29.cmaf-group-settings/write-dash-manifest :portkey.aws.mediaconvert.-2017-08-29.cmaf-group-settings/manifest-compression :portkey.aws.mediaconvert.-2017-08-29.cmaf-group-settings/encryption :portkey.aws.mediaconvert.-2017-08-29.cmaf-group-settings/codec-specification :portkey.aws.mediaconvert.-2017-08-29.cmaf-group-settings/client-cache]))

(clojure.spec.alpha/def :portkey.aws.mediaconvert.-2017-08-29.h-265-qvbr-settings/max-average-bitrate (clojure.spec.alpha/and :portkey.aws.mediaconvert.-2017-08-29/integer-min-1000-max-1466400000))
(clojure.spec.alpha/def :portkey.aws.mediaconvert.-2017-08-29.h-265-qvbr-settings/qvbr-quality-level (clojure.spec.alpha/and :portkey.aws.mediaconvert.-2017-08-29/integer-min-1-max-10))
(clojure.spec.alpha/def :portkey.aws.mediaconvert.-2017-08-29/h-265-qvbr-settings (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.mediaconvert.-2017-08-29.h-265-qvbr-settings/max-average-bitrate :portkey.aws.mediaconvert.-2017-08-29.h-265-qvbr-settings/qvbr-quality-level]))

(clojure.spec.alpha/def :portkey.aws.mediaconvert.-2017-08-29/list-of-output-group (clojure.spec.alpha/coll-of :portkey.aws.mediaconvert.-2017-08-29/output-group))

(clojure.spec.alpha/def :portkey.aws.mediaconvert.-2017-08-29.list-queues-response/next-token (clojure.spec.alpha/and :portkey.aws.mediaconvert.-2017-08-29/string))
(clojure.spec.alpha/def :portkey.aws.mediaconvert.-2017-08-29.list-queues-response/queues (clojure.spec.alpha/and :portkey.aws.mediaconvert.-2017-08-29/list-of-queue))
(clojure.spec.alpha/def :portkey.aws.mediaconvert.-2017-08-29/list-queues-response (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.mediaconvert.-2017-08-29.list-queues-response/next-token :portkey.aws.mediaconvert.-2017-08-29.list-queues-response/queues]))

(clojure.spec.alpha/def :portkey.aws.mediaconvert.-2017-08-29/list-of-caption-description-preset (clojure.spec.alpha/coll-of :portkey.aws.mediaconvert.-2017-08-29/caption-description-preset))

(clojure.spec.alpha/def :portkey.aws.mediaconvert.-2017-08-29/motion-image-insertion-mode #{:png "MOV" "PNG" :mov})

(clojure.spec.alpha/def :portkey.aws.mediaconvert.-2017-08-29/renewal-type #{"EXPIRE" :auto-renew :expire "AUTO_RENEW"})

(clojure.spec.alpha/def :portkey.aws.mediaconvert.-2017-08-29.associate-certificate-request/arn (clojure.spec.alpha/and :portkey.aws.mediaconvert.-2017-08-29/string))
(clojure.spec.alpha/def :portkey.aws.mediaconvert.-2017-08-29/associate-certificate-request (clojure.spec.alpha/keys :req-un [:portkey.aws.mediaconvert.-2017-08-29.associate-certificate-request/arn] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.mediaconvert.-2017-08-29/integer-min-1-max-100 (clojure.spec.alpha/int-in 1 100))

(clojure.spec.alpha/def :portkey.aws.mediaconvert.-2017-08-29/eac-3-lfe-control #{:no-lfe "NO_LFE" "LFE" :lfe})

(clojure.spec.alpha/def :portkey.aws.mediaconvert.-2017-08-29/prores-codec-profile #{:apple-prores-422-proxy :apple-prores-422 :apple-prores-422-hq :apple-prores-422-lt "APPLE_PRORES_422_PROXY" "APPLE_PRORES_422_LT" "APPLE_PRORES_422_HQ" "APPLE_PRORES_422"})

(clojure.spec.alpha/def :portkey.aws.mediaconvert.-2017-08-29.teletext-source-settings/page-number (clojure.spec.alpha/and :portkey.aws.mediaconvert.-2017-08-29/string-min-3-max-3-pattern-1809a-faf-09a-eae))
(clojure.spec.alpha/def :portkey.aws.mediaconvert.-2017-08-29/teletext-source-settings (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.mediaconvert.-2017-08-29.teletext-source-settings/page-number]))

(clojure.spec.alpha/def :portkey.aws.mediaconvert.-2017-08-29.caption-description-preset/custom-language-code (clojure.spec.alpha/and :portkey.aws.mediaconvert.-2017-08-29/string-min-3-max-3-pattern-a-za-z-3))
(clojure.spec.alpha/def :portkey.aws.mediaconvert.-2017-08-29.caption-description-preset/destination-settings (clojure.spec.alpha/and :portkey.aws.mediaconvert.-2017-08-29/caption-destination-settings))
(clojure.spec.alpha/def :portkey.aws.mediaconvert.-2017-08-29.caption-description-preset/language-description (clojure.spec.alpha/and :portkey.aws.mediaconvert.-2017-08-29/string))
(clojure.spec.alpha/def :portkey.aws.mediaconvert.-2017-08-29/caption-description-preset (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.mediaconvert.-2017-08-29.caption-description-preset/custom-language-code :portkey.aws.mediaconvert.-2017-08-29.caption-description-preset/destination-settings :portkey.aws.mediaconvert.-2017-08-29/language-code :portkey.aws.mediaconvert.-2017-08-29.caption-description-preset/language-description]))

(clojure.spec.alpha/def :portkey.aws.mediaconvert.-2017-08-29.video-detail/height-in-px (clojure.spec.alpha/and :portkey.aws.mediaconvert.-2017-08-29/integer))
(clojure.spec.alpha/def :portkey.aws.mediaconvert.-2017-08-29.video-detail/width-in-px (clojure.spec.alpha/and :portkey.aws.mediaconvert.-2017-08-29/integer))
(clojure.spec.alpha/def :portkey.aws.mediaconvert.-2017-08-29/video-detail (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.mediaconvert.-2017-08-29.video-detail/height-in-px :portkey.aws.mediaconvert.-2017-08-29.video-detail/width-in-px]))

(clojure.spec.alpha/def :portkey.aws.mediaconvert.-2017-08-29.get-preset-request/name (clojure.spec.alpha/and :portkey.aws.mediaconvert.-2017-08-29/string))
(clojure.spec.alpha/def :portkey.aws.mediaconvert.-2017-08-29/get-preset-request (clojure.spec.alpha/keys :req-un [:portkey.aws.mediaconvert.-2017-08-29.get-preset-request/name] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.mediaconvert.-2017-08-29/h-264-flicker-adaptive-quantization #{"DISABLED" :disabled "ENABLED" :enabled})

(clojure.spec.alpha/def :portkey.aws.mediaconvert.-2017-08-29/h-265-slow-pal #{"DISABLED" :disabled "ENABLED" :enabled})

(clojure.spec.alpha/def :portkey.aws.mediaconvert.-2017-08-29.cancel-job-request/id (clojure.spec.alpha/and :portkey.aws.mediaconvert.-2017-08-29/string))
(clojure.spec.alpha/def :portkey.aws.mediaconvert.-2017-08-29/cancel-job-request (clojure.spec.alpha/keys :req-un [:portkey.aws.mediaconvert.-2017-08-29.cancel-job-request/id] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.mediaconvert.-2017-08-29/eac-3-surround-mode #{"DISABLED" "NOT_INDICATED" :disabled :not-indicated "ENABLED" :enabled})

(clojure.spec.alpha/def :portkey.aws.mediaconvert.-2017-08-29/string-min-0 (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__1012852__auto__] (clojure.core/<= 0 (clojure.core/count s__1012852__auto__)))))

(clojure.spec.alpha/def :portkey.aws.mediaconvert.-2017-08-29.hls-caption-language-mapping/caption-channel (clojure.spec.alpha/and :portkey.aws.mediaconvert.-2017-08-29/integer-min-negative-2147483648-max-2147483647))
(clojure.spec.alpha/def :portkey.aws.mediaconvert.-2017-08-29.hls-caption-language-mapping/custom-language-code (clojure.spec.alpha/and :portkey.aws.mediaconvert.-2017-08-29/string-min-3-max-3-pattern-a-za-z-3))
(clojure.spec.alpha/def :portkey.aws.mediaconvert.-2017-08-29.hls-caption-language-mapping/language-description (clojure.spec.alpha/and :portkey.aws.mediaconvert.-2017-08-29/string))
(clojure.spec.alpha/def :portkey.aws.mediaconvert.-2017-08-29/hls-caption-language-mapping (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.mediaconvert.-2017-08-29.hls-caption-language-mapping/caption-channel :portkey.aws.mediaconvert.-2017-08-29.hls-caption-language-mapping/custom-language-code :portkey.aws.mediaconvert.-2017-08-29/language-code :portkey.aws.mediaconvert.-2017-08-29.hls-caption-language-mapping/language-description]))

(clojure.spec.alpha/def :portkey.aws.mediaconvert.-2017-08-29/mpeg-2-syntax #{:d-10 :default "D_10" "DEFAULT"})

(clojure.spec.alpha/def :portkey.aws.mediaconvert.-2017-08-29/h-264-codec-profile #{:baseline "HIGH_422" :high-422 "BASELINE" :high "MAIN" "HIGH_10BIT" "HIGH" "HIGH_422_10BIT" :high-10-bit :high-422-10-bit :main})

(clojure.spec.alpha/def :portkey.aws.mediaconvert.-2017-08-29/h-265-telecine #{:soft "SOFT" "HARD" "NONE" :none :hard})

(clojure.spec.alpha/def :portkey.aws.mediaconvert.-2017-08-29/list-of-insertable-image (clojure.spec.alpha/coll-of :portkey.aws.mediaconvert.-2017-08-29/insertable-image))

(clojure.spec.alpha/def :portkey.aws.mediaconvert.-2017-08-29/wav-format #{"RF64" :rf-64 "RIFF" :riff})

(clojure.spec.alpha/def :portkey.aws.mediaconvert.-2017-08-29/list-of-output-channel-mapping (clojure.spec.alpha/coll-of :portkey.aws.mediaconvert.-2017-08-29/output-channel-mapping))

(clojure.spec.alpha/def :portkey.aws.mediaconvert.-2017-08-29.get-job-template-request/name (clojure.spec.alpha/and :portkey.aws.mediaconvert.-2017-08-29/string))
(clojure.spec.alpha/def :portkey.aws.mediaconvert.-2017-08-29/get-job-template-request (clojure.spec.alpha/keys :req-un [:portkey.aws.mediaconvert.-2017-08-29.get-job-template-request/name] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.mediaconvert.-2017-08-29/h-264-unregistered-sei-timecode #{"DISABLED" :disabled "ENABLED" :enabled})

(clojure.spec.alpha/def :portkey.aws.mediaconvert.-2017-08-29/string-pattern-dd (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__1012854__auto__] (clojure.core/re-matches #"^(\d+(\/\d+)*)$" s__1012854__auto__))))

(clojure.spec.alpha/def :portkey.aws.mediaconvert.-2017-08-29/eac-3-lfe-filter #{"DISABLED" :disabled "ENABLED" :enabled})

(clojure.spec.alpha/def :portkey.aws.mediaconvert.-2017-08-29/input-timecode-source #{:specifiedstart "ZEROBASED" "EMBEDDED" :embedded :zerobased "SPECIFIEDSTART"})

(clojure.spec.alpha/def :portkey.aws.mediaconvert.-2017-08-29.create-job-template-request/category (clojure.spec.alpha/and :portkey.aws.mediaconvert.-2017-08-29/string))
(clojure.spec.alpha/def :portkey.aws.mediaconvert.-2017-08-29.create-job-template-request/description (clojure.spec.alpha/and :portkey.aws.mediaconvert.-2017-08-29/string))
(clojure.spec.alpha/def :portkey.aws.mediaconvert.-2017-08-29.create-job-template-request/name (clojure.spec.alpha/and :portkey.aws.mediaconvert.-2017-08-29/string))
(clojure.spec.alpha/def :portkey.aws.mediaconvert.-2017-08-29.create-job-template-request/queue (clojure.spec.alpha/and :portkey.aws.mediaconvert.-2017-08-29/string))
(clojure.spec.alpha/def :portkey.aws.mediaconvert.-2017-08-29.create-job-template-request/settings (clojure.spec.alpha/and :portkey.aws.mediaconvert.-2017-08-29/job-template-settings))
(clojure.spec.alpha/def :portkey.aws.mediaconvert.-2017-08-29.create-job-template-request/status-update-interval-in-secs (clojure.spec.alpha/and :portkey.aws.mediaconvert.-2017-08-29/integer-min-10-max-600))
(clojure.spec.alpha/def :portkey.aws.mediaconvert.-2017-08-29.create-job-template-request/tags (clojure.spec.alpha/and :portkey.aws.mediaconvert.-2017-08-29/map-of-string))
(clojure.spec.alpha/def :portkey.aws.mediaconvert.-2017-08-29/create-job-template-request (clojure.spec.alpha/keys :req-un [:portkey.aws.mediaconvert.-2017-08-29.create-job-template-request/settings :portkey.aws.mediaconvert.-2017-08-29.create-job-template-request/name] :opt-un [:portkey.aws.mediaconvert.-2017-08-29/acceleration-settings :portkey.aws.mediaconvert.-2017-08-29.create-job-template-request/category :portkey.aws.mediaconvert.-2017-08-29.create-job-template-request/description :portkey.aws.mediaconvert.-2017-08-29.create-job-template-request/queue :portkey.aws.mediaconvert.-2017-08-29.create-job-template-request/status-update-interval-in-secs :portkey.aws.mediaconvert.-2017-08-29.create-job-template-request/tags]))

(clojure.spec.alpha/def :portkey.aws.mediaconvert.-2017-08-29/timecode-source #{:specifiedstart "ZEROBASED" "EMBEDDED" :embedded :zerobased "SPECIFIEDSTART"})

(clojure.spec.alpha/def :portkey.aws.mediaconvert.-2017-08-29/update-job-template-response (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.mediaconvert.-2017-08-29/job-template]))

(clojure.spec.alpha/def :portkey.aws.mediaconvert.-2017-08-29.hls-encryption-settings/constant-initialization-vector (clojure.spec.alpha/and :portkey.aws.mediaconvert.-2017-08-29/string-min-32-max-32-pattern-09a-faf-32))
(clojure.spec.alpha/def :portkey.aws.mediaconvert.-2017-08-29.hls-encryption-settings/encryption-method (clojure.spec.alpha/and :portkey.aws.mediaconvert.-2017-08-29/hls-encryption-type))
(clojure.spec.alpha/def :portkey.aws.mediaconvert.-2017-08-29.hls-encryption-settings/initialization-vector-in-manifest (clojure.spec.alpha/and :portkey.aws.mediaconvert.-2017-08-29/hls-initialization-vector-in-manifest))
(clojure.spec.alpha/def :portkey.aws.mediaconvert.-2017-08-29.hls-encryption-settings/offline-encrypted (clojure.spec.alpha/and :portkey.aws.mediaconvert.-2017-08-29/hls-offline-encrypted))
(clojure.spec.alpha/def :portkey.aws.mediaconvert.-2017-08-29.hls-encryption-settings/type (clojure.spec.alpha/and :portkey.aws.mediaconvert.-2017-08-29/hls-key-provider-type))
(clojure.spec.alpha/def :portkey.aws.mediaconvert.-2017-08-29/hls-encryption-settings (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.mediaconvert.-2017-08-29.hls-encryption-settings/constant-initialization-vector :portkey.aws.mediaconvert.-2017-08-29.hls-encryption-settings/encryption-method :portkey.aws.mediaconvert.-2017-08-29.hls-encryption-settings/initialization-vector-in-manifest :portkey.aws.mediaconvert.-2017-08-29.hls-encryption-settings/offline-encrypted :portkey.aws.mediaconvert.-2017-08-29/speke-key-provider :portkey.aws.mediaconvert.-2017-08-29/static-key-provider :portkey.aws.mediaconvert.-2017-08-29.hls-encryption-settings/type]))

(clojure.spec.alpha/def :portkey.aws.mediaconvert.-2017-08-29/h-265-framerate-conversion-algorithm #{"DUPLICATE_DROP" :interpolate "INTERPOLATE" :duplicate-drop})

(clojure.spec.alpha/def :portkey.aws.mediaconvert.-2017-08-29/get-preset-response (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.mediaconvert.-2017-08-29/preset]))

(clojure.spec.alpha/def :portkey.aws.mediaconvert.-2017-08-29/h-264-rate-control-mode #{"VBR" :cbr :vbr :qvbr "CBR" "QVBR"})

(clojure.spec.alpha/def :portkey.aws.mediaconvert.-2017-08-29/integer-min-0-max-255 (clojure.spec.alpha/int-in 0 255))

(clojure.spec.alpha/def :portkey.aws.mediaconvert.-2017-08-29.motion-image-insertion-framerate/framerate-denominator (clojure.spec.alpha/and :portkey.aws.mediaconvert.-2017-08-29/integer-min-1-max-17895697))
(clojure.spec.alpha/def :portkey.aws.mediaconvert.-2017-08-29.motion-image-insertion-framerate/framerate-numerator (clojure.spec.alpha/and :portkey.aws.mediaconvert.-2017-08-29/integer-min-1-max-2147483640))
(clojure.spec.alpha/def :portkey.aws.mediaconvert.-2017-08-29/motion-image-insertion-framerate (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.mediaconvert.-2017-08-29.motion-image-insertion-framerate/framerate-denominator :portkey.aws.mediaconvert.-2017-08-29.motion-image-insertion-framerate/framerate-numerator]))

(clojure.spec.alpha/def :portkey.aws.mediaconvert.-2017-08-29.video-selector/pid (clojure.spec.alpha/and :portkey.aws.mediaconvert.-2017-08-29/integer-min-1-max-2147483647))
(clojure.spec.alpha/def :portkey.aws.mediaconvert.-2017-08-29.video-selector/program-number (clojure.spec.alpha/and :portkey.aws.mediaconvert.-2017-08-29/integer-min-negative-2147483648-max-2147483647))
(clojure.spec.alpha/def :portkey.aws.mediaconvert.-2017-08-29.video-selector/rotate (clojure.spec.alpha/and :portkey.aws.mediaconvert.-2017-08-29/input-rotate))
(clojure.spec.alpha/def :portkey.aws.mediaconvert.-2017-08-29/video-selector (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.mediaconvert.-2017-08-29/color-space :portkey.aws.mediaconvert.-2017-08-29/color-space-usage :portkey.aws.mediaconvert.-2017-08-29/hdr-10-metadata :portkey.aws.mediaconvert.-2017-08-29.video-selector/pid :portkey.aws.mediaconvert.-2017-08-29.video-selector/program-number :portkey.aws.mediaconvert.-2017-08-29.video-selector/rotate]))

(clojure.spec.alpha/def :portkey.aws.mediaconvert.-2017-08-29/burnin-subtitle-teletext-spacing #{:fixed-grid "FIXED_GRID" "PROPORTIONAL" :proportional})

(clojure.spec.alpha/def :portkey.aws.mediaconvert.-2017-08-29.job-template/status-update-interval-in-secs (clojure.spec.alpha/and :portkey.aws.mediaconvert.-2017-08-29/integer-min-10-max-600))
(clojure.spec.alpha/def :portkey.aws.mediaconvert.-2017-08-29.job-template/category (clojure.spec.alpha/and :portkey.aws.mediaconvert.-2017-08-29/string))
(clojure.spec.alpha/def :portkey.aws.mediaconvert.-2017-08-29.job-template/queue (clojure.spec.alpha/and :portkey.aws.mediaconvert.-2017-08-29/string))
(clojure.spec.alpha/def :portkey.aws.mediaconvert.-2017-08-29.job-template/description (clojure.spec.alpha/and :portkey.aws.mediaconvert.-2017-08-29/string))
(clojure.spec.alpha/def :portkey.aws.mediaconvert.-2017-08-29.job-template/settings (clojure.spec.alpha/and :portkey.aws.mediaconvert.-2017-08-29/job-template-settings))
(clojure.spec.alpha/def :portkey.aws.mediaconvert.-2017-08-29.job-template/arn (clojure.spec.alpha/and :portkey.aws.mediaconvert.-2017-08-29/string))
(clojure.spec.alpha/def :portkey.aws.mediaconvert.-2017-08-29.job-template/created-at (clojure.spec.alpha/and :portkey.aws.mediaconvert.-2017-08-29/timestamp-unix))
(clojure.spec.alpha/def :portkey.aws.mediaconvert.-2017-08-29.job-template/name (clojure.spec.alpha/and :portkey.aws.mediaconvert.-2017-08-29/string))
(clojure.spec.alpha/def :portkey.aws.mediaconvert.-2017-08-29.job-template/last-updated (clojure.spec.alpha/and :portkey.aws.mediaconvert.-2017-08-29/timestamp-unix))
(clojure.spec.alpha/def :portkey.aws.mediaconvert.-2017-08-29/job-template (clojure.spec.alpha/keys :req-un [:portkey.aws.mediaconvert.-2017-08-29.job-template/settings :portkey.aws.mediaconvert.-2017-08-29.job-template/name] :opt-un [:portkey.aws.mediaconvert.-2017-08-29.job-template/status-update-interval-in-secs :portkey.aws.mediaconvert.-2017-08-29/type :portkey.aws.mediaconvert.-2017-08-29.job-template/category :portkey.aws.mediaconvert.-2017-08-29.job-template/queue :portkey.aws.mediaconvert.-2017-08-29/acceleration-settings :portkey.aws.mediaconvert.-2017-08-29.job-template/description :portkey.aws.mediaconvert.-2017-08-29.job-template/arn :portkey.aws.mediaconvert.-2017-08-29.job-template/created-at :portkey.aws.mediaconvert.-2017-08-29.job-template/last-updated]))

(clojure.spec.alpha/def :portkey.aws.mediaconvert.-2017-08-29/ac-3-metadata-control #{"FOLLOW_INPUT" :follow-input "USE_CONFIGURED" :use-configured})

(clojure.spec.alpha/def :portkey.aws.mediaconvert.-2017-08-29/double-min-0 clojure.core/double?)

(clojure.spec.alpha/def :portkey.aws.mediaconvert.-2017-08-29.mp-4-settings/cslg-atom (clojure.spec.alpha/and :portkey.aws.mediaconvert.-2017-08-29/mp-4-cslg-atom))
(clojure.spec.alpha/def :portkey.aws.mediaconvert.-2017-08-29.mp-4-settings/free-space-box (clojure.spec.alpha/and :portkey.aws.mediaconvert.-2017-08-29/mp-4-free-space-box))
(clojure.spec.alpha/def :portkey.aws.mediaconvert.-2017-08-29.mp-4-settings/moov-placement (clojure.spec.alpha/and :portkey.aws.mediaconvert.-2017-08-29/mp-4-moov-placement))
(clojure.spec.alpha/def :portkey.aws.mediaconvert.-2017-08-29.mp-4-settings/mp-4-major-brand (clojure.spec.alpha/and :portkey.aws.mediaconvert.-2017-08-29/string))
(clojure.spec.alpha/def :portkey.aws.mediaconvert.-2017-08-29/mp-4-settings (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.mediaconvert.-2017-08-29.mp-4-settings/cslg-atom :portkey.aws.mediaconvert.-2017-08-29.mp-4-settings/free-space-box :portkey.aws.mediaconvert.-2017-08-29.mp-4-settings/moov-placement :portkey.aws.mediaconvert.-2017-08-29.mp-4-settings/mp-4-major-brand]))

(clojure.spec.alpha/def :portkey.aws.mediaconvert.-2017-08-29/list-of-integer-min-negative-60-max-6 (clojure.spec.alpha/coll-of :portkey.aws.mediaconvert.-2017-08-29/integer-min-negative-60-max-6))

(clojure.spec.alpha/def :portkey.aws.mediaconvert.-2017-08-29/cmaf-write-hls-manifest #{"DISABLED" :disabled "ENABLED" :enabled})

(clojure.spec.alpha/def :portkey.aws.mediaconvert.-2017-08-29/tag-resource-response (clojure.spec.alpha/keys :req-un [] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.mediaconvert.-2017-08-29/m-2ts-buffer-model #{"NONE" :none :multiplex "MULTIPLEX"})

(clojure.spec.alpha/def :portkey.aws.mediaconvert.-2017-08-29/integer-min-25-max-10000 (clojure.spec.alpha/int-in 25 10000))

(clojure.spec.alpha/def :portkey.aws.mediaconvert.-2017-08-29.hdr-10-metadata/min-luminance (clojure.spec.alpha/and :portkey.aws.mediaconvert.-2017-08-29/integer-min-0-max-2147483647))
(clojure.spec.alpha/def :portkey.aws.mediaconvert.-2017-08-29.hdr-10-metadata/blue-primary-x (clojure.spec.alpha/and :portkey.aws.mediaconvert.-2017-08-29/integer-min-0-max-50000))
(clojure.spec.alpha/def :portkey.aws.mediaconvert.-2017-08-29.hdr-10-metadata/green-primary-x (clojure.spec.alpha/and :portkey.aws.mediaconvert.-2017-08-29/integer-min-0-max-50000))
(clojure.spec.alpha/def :portkey.aws.mediaconvert.-2017-08-29.hdr-10-metadata/max-luminance (clojure.spec.alpha/and :portkey.aws.mediaconvert.-2017-08-29/integer-min-0-max-2147483647))
(clojure.spec.alpha/def :portkey.aws.mediaconvert.-2017-08-29.hdr-10-metadata/max-frame-average-light-level (clojure.spec.alpha/and :portkey.aws.mediaconvert.-2017-08-29/integer-min-0-max-65535))
(clojure.spec.alpha/def :portkey.aws.mediaconvert.-2017-08-29.hdr-10-metadata/green-primary-y (clojure.spec.alpha/and :portkey.aws.mediaconvert.-2017-08-29/integer-min-0-max-50000))
(clojure.spec.alpha/def :portkey.aws.mediaconvert.-2017-08-29.hdr-10-metadata/max-content-light-level (clojure.spec.alpha/and :portkey.aws.mediaconvert.-2017-08-29/integer-min-0-max-65535))
(clojure.spec.alpha/def :portkey.aws.mediaconvert.-2017-08-29.hdr-10-metadata/white-point-x (clojure.spec.alpha/and :portkey.aws.mediaconvert.-2017-08-29/integer-min-0-max-50000))
(clojure.spec.alpha/def :portkey.aws.mediaconvert.-2017-08-29.hdr-10-metadata/red-primary-x (clojure.spec.alpha/and :portkey.aws.mediaconvert.-2017-08-29/integer-min-0-max-50000))
(clojure.spec.alpha/def :portkey.aws.mediaconvert.-2017-08-29.hdr-10-metadata/white-point-y (clojure.spec.alpha/and :portkey.aws.mediaconvert.-2017-08-29/integer-min-0-max-50000))
(clojure.spec.alpha/def :portkey.aws.mediaconvert.-2017-08-29.hdr-10-metadata/blue-primary-y (clojure.spec.alpha/and :portkey.aws.mediaconvert.-2017-08-29/integer-min-0-max-50000))
(clojure.spec.alpha/def :portkey.aws.mediaconvert.-2017-08-29.hdr-10-metadata/red-primary-y (clojure.spec.alpha/and :portkey.aws.mediaconvert.-2017-08-29/integer-min-0-max-50000))
(clojure.spec.alpha/def :portkey.aws.mediaconvert.-2017-08-29/hdr-10-metadata (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.mediaconvert.-2017-08-29.hdr-10-metadata/min-luminance :portkey.aws.mediaconvert.-2017-08-29.hdr-10-metadata/blue-primary-x :portkey.aws.mediaconvert.-2017-08-29.hdr-10-metadata/green-primary-x :portkey.aws.mediaconvert.-2017-08-29.hdr-10-metadata/max-luminance :portkey.aws.mediaconvert.-2017-08-29.hdr-10-metadata/max-frame-average-light-level :portkey.aws.mediaconvert.-2017-08-29.hdr-10-metadata/green-primary-y :portkey.aws.mediaconvert.-2017-08-29.hdr-10-metadata/max-content-light-level :portkey.aws.mediaconvert.-2017-08-29.hdr-10-metadata/white-point-x :portkey.aws.mediaconvert.-2017-08-29.hdr-10-metadata/red-primary-x :portkey.aws.mediaconvert.-2017-08-29.hdr-10-metadata/white-point-y :portkey.aws.mediaconvert.-2017-08-29.hdr-10-metadata/blue-primary-y :portkey.aws.mediaconvert.-2017-08-29.hdr-10-metadata/red-primary-y]))

(clojure.spec.alpha/def :portkey.aws.mediaconvert.-2017-08-29/eac-3-coding-mode #{"CODING_MODE_1_0" :coding-mode-1-0 :coding-mode-3-2 :coding-mode-2-0 "CODING_MODE_2_0" "CODING_MODE_3_2"})

(clojure.spec.alpha/def :portkey.aws.mediaconvert.-2017-08-29.caption-description/caption-selector-name (clojure.spec.alpha/and :portkey.aws.mediaconvert.-2017-08-29/string-min-1))
(clojure.spec.alpha/def :portkey.aws.mediaconvert.-2017-08-29.caption-description/custom-language-code (clojure.spec.alpha/and :portkey.aws.mediaconvert.-2017-08-29/string-min-3-max-3-pattern-a-za-z-3))
(clojure.spec.alpha/def :portkey.aws.mediaconvert.-2017-08-29.caption-description/destination-settings (clojure.spec.alpha/and :portkey.aws.mediaconvert.-2017-08-29/caption-destination-settings))
(clojure.spec.alpha/def :portkey.aws.mediaconvert.-2017-08-29.caption-description/language-description (clojure.spec.alpha/and :portkey.aws.mediaconvert.-2017-08-29/string))
(clojure.spec.alpha/def :portkey.aws.mediaconvert.-2017-08-29/caption-description (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.mediaconvert.-2017-08-29.caption-description/caption-selector-name :portkey.aws.mediaconvert.-2017-08-29.caption-description/custom-language-code :portkey.aws.mediaconvert.-2017-08-29.caption-description/destination-settings :portkey.aws.mediaconvert.-2017-08-29/language-code :portkey.aws.mediaconvert.-2017-08-29.caption-description/language-description]))

(clojure.spec.alpha/def :portkey.aws.mediaconvert.-2017-08-29/dash-iso-segment-control #{:segmented-files "SINGLE_FILE" "SEGMENTED_FILES" :single-file})

(clojure.spec.alpha/def :portkey.aws.mediaconvert.-2017-08-29/m-3u-8-nielsen-id-3 #{:insert "INSERT" "NONE" :none})

(clojure.spec.alpha/def :portkey.aws.mediaconvert.-2017-08-29/list-of-integer-min-32-max-8182 (clojure.spec.alpha/coll-of :portkey.aws.mediaconvert.-2017-08-29/integer-min-32-max-8182))

(clojure.spec.alpha/def :portkey.aws.mediaconvert.-2017-08-29/audio-type-control #{"FOLLOW_INPUT" :follow-input "USE_CONFIGURED" :use-configured})

(clojure.spec.alpha/def :portkey.aws.mediaconvert.-2017-08-29.get-queue-request/name (clojure.spec.alpha/and :portkey.aws.mediaconvert.-2017-08-29/string))
(clojure.spec.alpha/def :portkey.aws.mediaconvert.-2017-08-29/get-queue-request (clojure.spec.alpha/keys :req-un [:portkey.aws.mediaconvert.-2017-08-29.get-queue-request/name] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.mediaconvert.-2017-08-29/hls-output-selection #{:segments-only "MANIFESTS_AND_SEGMENTS" "SEGMENTS_ONLY" :manifests-and-segments})

(clojure.spec.alpha/def :portkey.aws.mediaconvert.-2017-08-29.speke-key-provider/certificate-arn (clojure.spec.alpha/and :portkey.aws.mediaconvert.-2017-08-29/string-pattern-arn-aws-us-gov-acm))
(clojure.spec.alpha/def :portkey.aws.mediaconvert.-2017-08-29.speke-key-provider/resource-id (clojure.spec.alpha/and :portkey.aws.mediaconvert.-2017-08-29/string))
(clojure.spec.alpha/def :portkey.aws.mediaconvert.-2017-08-29.speke-key-provider/system-ids (clojure.spec.alpha/and :portkey.aws.mediaconvert.-2017-08-29/list-of-string-pattern-09a-faf-809a-faf-409a-faf-409a-faf-409a-faf-12))
(clojure.spec.alpha/def :portkey.aws.mediaconvert.-2017-08-29.speke-key-provider/url (clojure.spec.alpha/and :portkey.aws.mediaconvert.-2017-08-29/string-pattern-https))
(clojure.spec.alpha/def :portkey.aws.mediaconvert.-2017-08-29/speke-key-provider (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.mediaconvert.-2017-08-29.speke-key-provider/certificate-arn :portkey.aws.mediaconvert.-2017-08-29.speke-key-provider/resource-id :portkey.aws.mediaconvert.-2017-08-29.speke-key-provider/system-ids :portkey.aws.mediaconvert.-2017-08-29.speke-key-provider/url]))

(clojure.spec.alpha/def :portkey.aws.mediaconvert.-2017-08-29/deinterlace-algorithm #{"INTERPOLATE_TICKER" :interpolate-ticker :interpolate "INTERPOLATE" :blend-ticker "BLEND" "BLEND_TICKER" :blend})

(clojure.spec.alpha/def :portkey.aws.mediaconvert.-2017-08-29/ac-3-bitstream-mode #{:hearing-impaired :visually-impaired :complete-main "COMPLETE_MAIN" "DIALOGUE" "VISUALLY_IMPAIRED" :dialogue "EMERGENCY" :emergency :music-and-effects "COMMENTARY" :commentary "MUSIC_AND_EFFECTS" "VOICE_OVER" "HEARING_IMPAIRED" :voice-over})

(clojure.spec.alpha/def :portkey.aws.mediaconvert.-2017-08-29/integer-min-16-max-24 (clojure.spec.alpha/int-in 16 24))

(clojure.spec.alpha/def :portkey.aws.mediaconvert.-2017-08-29/integer-min-negative-2-max-3 (clojure.spec.alpha/int-in -2 3))

(clojure.spec.alpha/def :portkey.aws.mediaconvert.-2017-08-29/f-4v-moov-placement #{"NORMAL" "PROGRESSIVE_DOWNLOAD" :progressive-download :normal})

(clojure.spec.alpha/def :portkey.aws.mediaconvert.-2017-08-29/eac-3-dynamic-range-compression-rf #{"MUSIC_LIGHT" :music-standard :film-standard "FILM_STANDARD" "NONE" "FILM_LIGHT" :film-light "SPEECH" :music-light "MUSIC_STANDARD" :speech :none})

(clojure.spec.alpha/def :portkey.aws.mediaconvert.-2017-08-29.too-many-requests-exception/message (clojure.spec.alpha/and :portkey.aws.mediaconvert.-2017-08-29/string))
(clojure.spec.alpha/def :portkey.aws.mediaconvert.-2017-08-29/too-many-requests-exception (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.mediaconvert.-2017-08-29.too-many-requests-exception/message]))

(clojure.spec.alpha/def :portkey.aws.mediaconvert.-2017-08-29/aac-raw-format #{:latm-loas "LATM_LOAS" "NONE" :none})

(clojure.spec.alpha/def :portkey.aws.mediaconvert.-2017-08-29/string-pattern-s-3-assetmap-xml (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__1012854__auto__] (clojure.core/re-matches #"^s3:\/\/.*\/(ASSETMAP.xml)?$" s__1012854__auto__))))

(clojure.spec.alpha/def :portkey.aws.mediaconvert.-2017-08-29/integer-min-32000-max-384000 (clojure.spec.alpha/int-in 32000 384000))

(clojure.spec.alpha/def :portkey.aws.mediaconvert.-2017-08-29/list-of-preset (clojure.spec.alpha/coll-of :portkey.aws.mediaconvert.-2017-08-29/preset))

(clojure.spec.alpha/def :portkey.aws.mediaconvert.-2017-08-29/timed-metadata #{"PASSTHROUGH" "NONE" :passthrough :none})

(clojure.spec.alpha/def :portkey.aws.mediaconvert.-2017-08-29/integer-min-32-max-4096 (clojure.spec.alpha/int-in 32 4096))

(clojure.spec.alpha/def :portkey.aws.mediaconvert.-2017-08-29/h-265-rate-control-mode #{"VBR" :cbr :vbr :qvbr "CBR" "QVBR"})

(clojure.spec.alpha/def :portkey.aws.mediaconvert.-2017-08-29/mov-reference #{"SELF_CONTAINED" :external :self-contained "EXTERNAL"})

(clojure.spec.alpha/def :portkey.aws.mediaconvert.-2017-08-29/integer-min-0-max-3600 (clojure.spec.alpha/int-in 0 3600))

(clojure.spec.alpha/def :portkey.aws.mediaconvert.-2017-08-29.acceleration-settings/mode (clojure.spec.alpha/and :portkey.aws.mediaconvert.-2017-08-29/acceleration-mode))
(clojure.spec.alpha/def :portkey.aws.mediaconvert.-2017-08-29/acceleration-settings (clojure.spec.alpha/keys :req-un [:portkey.aws.mediaconvert.-2017-08-29.acceleration-settings/mode] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.mediaconvert.-2017-08-29/string-pattern-s-3 (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__1012854__auto__] (clojure.core/re-matches #"^s3:\/\/" s__1012854__auto__))))

(clojure.spec.alpha/def :portkey.aws.mediaconvert.-2017-08-29/m-2ts-segmentation-markers #{"PSI_SEGSTART" "RAI_SEGSTART" "RAI_ADAPT" :rai-adapt :rai-segstart :ebp-legacy "NONE" :psi-segstart "EBP_LEGACY" "EBP" :ebp :none})

(clojure.spec.alpha/def :portkey.aws.mediaconvert.-2017-08-29/acceleration-mode #{"DISABLED" :disabled "ENABLED" :enabled})

(clojure.spec.alpha/def :portkey.aws.mediaconvert.-2017-08-29.delete-queue-request/name (clojure.spec.alpha/and :portkey.aws.mediaconvert.-2017-08-29/string))
(clojure.spec.alpha/def :portkey.aws.mediaconvert.-2017-08-29/delete-queue-request (clojure.spec.alpha/keys :req-un [:portkey.aws.mediaconvert.-2017-08-29.delete-queue-request/name] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.mediaconvert.-2017-08-29/m-2ts-scte-35-source #{"PASSTHROUGH" "NONE" :passthrough :none})

(clojure.spec.alpha/def :portkey.aws.mediaconvert.-2017-08-29.list-job-templates-request/category (clojure.spec.alpha/and :portkey.aws.mediaconvert.-2017-08-29/string))
(clojure.spec.alpha/def :portkey.aws.mediaconvert.-2017-08-29.list-job-templates-request/list-by (clojure.spec.alpha/and :portkey.aws.mediaconvert.-2017-08-29/job-template-list-by))
(clojure.spec.alpha/def :portkey.aws.mediaconvert.-2017-08-29.list-job-templates-request/max-results (clojure.spec.alpha/and :portkey.aws.mediaconvert.-2017-08-29/integer-min-1-max-20))
(clojure.spec.alpha/def :portkey.aws.mediaconvert.-2017-08-29.list-job-templates-request/next-token (clojure.spec.alpha/and :portkey.aws.mediaconvert.-2017-08-29/string))
(clojure.spec.alpha/def :portkey.aws.mediaconvert.-2017-08-29/list-job-templates-request (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.mediaconvert.-2017-08-29.list-job-templates-request/category :portkey.aws.mediaconvert.-2017-08-29.list-job-templates-request/list-by :portkey.aws.mediaconvert.-2017-08-29.list-job-templates-request/max-results :portkey.aws.mediaconvert.-2017-08-29.list-job-templates-request/next-token :portkey.aws.mediaconvert.-2017-08-29/order]))

(clojure.spec.alpha/def :portkey.aws.mediaconvert.-2017-08-29.tag-resource-request/arn (clojure.spec.alpha/and :portkey.aws.mediaconvert.-2017-08-29/string))
(clojure.spec.alpha/def :portkey.aws.mediaconvert.-2017-08-29.tag-resource-request/tags (clojure.spec.alpha/and :portkey.aws.mediaconvert.-2017-08-29/map-of-string))
(clojure.spec.alpha/def :portkey.aws.mediaconvert.-2017-08-29/tag-resource-request (clojure.spec.alpha/keys :req-un [:portkey.aws.mediaconvert.-2017-08-29.tag-resource-request/arn :portkey.aws.mediaconvert.-2017-08-29.tag-resource-request/tags] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.mediaconvert.-2017-08-29/list-of-job-template (clojure.spec.alpha/coll-of :portkey.aws.mediaconvert.-2017-08-29/job-template))

(clojure.spec.alpha/def :portkey.aws.mediaconvert.-2017-08-29/h-264-par-control #{"SPECIFIED" "INITIALIZE_FROM_SOURCE" :specified :initialize-from-source})

(clojure.spec.alpha/def :portkey.aws.mediaconvert.-2017-08-29.color-corrector/brightness (clojure.spec.alpha/and :portkey.aws.mediaconvert.-2017-08-29/integer-min-1-max-100))
(clojure.spec.alpha/def :portkey.aws.mediaconvert.-2017-08-29.color-corrector/contrast (clojure.spec.alpha/and :portkey.aws.mediaconvert.-2017-08-29/integer-min-1-max-100))
(clojure.spec.alpha/def :portkey.aws.mediaconvert.-2017-08-29.color-corrector/hue (clojure.spec.alpha/and :portkey.aws.mediaconvert.-2017-08-29/integer-min-negative-180-max-180))
(clojure.spec.alpha/def :portkey.aws.mediaconvert.-2017-08-29.color-corrector/saturation (clojure.spec.alpha/and :portkey.aws.mediaconvert.-2017-08-29/integer-min-1-max-100))
(clojure.spec.alpha/def :portkey.aws.mediaconvert.-2017-08-29/color-corrector (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.mediaconvert.-2017-08-29.color-corrector/brightness :portkey.aws.mediaconvert.-2017-08-29/color-space-conversion :portkey.aws.mediaconvert.-2017-08-29.color-corrector/contrast :portkey.aws.mediaconvert.-2017-08-29/hdr-10-metadata :portkey.aws.mediaconvert.-2017-08-29.color-corrector/hue :portkey.aws.mediaconvert.-2017-08-29.color-corrector/saturation]))

(clojure.spec.alpha/def :portkey.aws.mediaconvert.-2017-08-29.video-description/crop (clojure.spec.alpha/and :portkey.aws.mediaconvert.-2017-08-29/rectangle))
(clojure.spec.alpha/def :portkey.aws.mediaconvert.-2017-08-29.video-description/timecode-insertion (clojure.spec.alpha/and :portkey.aws.mediaconvert.-2017-08-29/video-timecode-insertion))
(clojure.spec.alpha/def :portkey.aws.mediaconvert.-2017-08-29.video-description/sharpness (clojure.spec.alpha/and :portkey.aws.mediaconvert.-2017-08-29/integer-min-0-max-100))
(clojure.spec.alpha/def :portkey.aws.mediaconvert.-2017-08-29.video-description/codec-settings (clojure.spec.alpha/and :portkey.aws.mediaconvert.-2017-08-29/video-codec-settings))
(clojure.spec.alpha/def :portkey.aws.mediaconvert.-2017-08-29.video-description/video-preprocessors (clojure.spec.alpha/and :portkey.aws.mediaconvert.-2017-08-29/video-preprocessor))
(clojure.spec.alpha/def :portkey.aws.mediaconvert.-2017-08-29.video-description/width (clojure.spec.alpha/and :portkey.aws.mediaconvert.-2017-08-29/integer-min-32-max-4096))
(clojure.spec.alpha/def :portkey.aws.mediaconvert.-2017-08-29.video-description/position (clojure.spec.alpha/and :portkey.aws.mediaconvert.-2017-08-29/rectangle))
(clojure.spec.alpha/def :portkey.aws.mediaconvert.-2017-08-29.video-description/height (clojure.spec.alpha/and :portkey.aws.mediaconvert.-2017-08-29/integer-min-32-max-2160))
(clojure.spec.alpha/def :portkey.aws.mediaconvert.-2017-08-29.video-description/fixed-afd (clojure.spec.alpha/and :portkey.aws.mediaconvert.-2017-08-29/integer-min-0-max-15))
(clojure.spec.alpha/def :portkey.aws.mediaconvert.-2017-08-29/video-description (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.mediaconvert.-2017-08-29.video-description/crop :portkey.aws.mediaconvert.-2017-08-29/drop-frame-timecode :portkey.aws.mediaconvert.-2017-08-29.video-description/timecode-insertion :portkey.aws.mediaconvert.-2017-08-29.video-description/sharpness :portkey.aws.mediaconvert.-2017-08-29.video-description/codec-settings :portkey.aws.mediaconvert.-2017-08-29/afd-signaling :portkey.aws.mediaconvert.-2017-08-29.video-description/video-preprocessors :portkey.aws.mediaconvert.-2017-08-29.video-description/width :portkey.aws.mediaconvert.-2017-08-29/scaling-behavior :portkey.aws.mediaconvert.-2017-08-29/anti-alias :portkey.aws.mediaconvert.-2017-08-29/color-metadata :portkey.aws.mediaconvert.-2017-08-29.video-description/position :portkey.aws.mediaconvert.-2017-08-29.video-description/height :portkey.aws.mediaconvert.-2017-08-29/respond-to-afd :portkey.aws.mediaconvert.-2017-08-29.video-description/fixed-afd]))

(clojure.spec.alpha/def :portkey.aws.mediaconvert.-2017-08-29/integer-min-0-max-15 (clojure.spec.alpha/int-in 0 15))

(clojure.spec.alpha/def :portkey.aws.mediaconvert.-2017-08-29/string-min-3-max-3-pattern-1809a-faf-09a-eae (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__1012852__auto__] (clojure.core/<= 3 (clojure.core/count s__1012852__auto__))) (clojure.core/fn [s__1012853__auto__] (clojure.core/< (clojure.core/count s__1012853__auto__) 3)) (clojure.core/fn [s__1012854__auto__] (clojure.core/re-matches #"^[1-8][0-9a-fA-F][0-9a-eA-E]$" s__1012854__auto__))))

(clojure.spec.alpha/def :portkey.aws.mediaconvert.-2017-08-29/integer-min-1-max-10 (clojure.spec.alpha/int-in 1 10))

(clojure.spec.alpha/def :portkey.aws.mediaconvert.-2017-08-29.id-3-insertion/id-3 (clojure.spec.alpha/and :portkey.aws.mediaconvert.-2017-08-29/string-pattern-a-za-z-0902))
(clojure.spec.alpha/def :portkey.aws.mediaconvert.-2017-08-29.id-3-insertion/timecode (clojure.spec.alpha/and :portkey.aws.mediaconvert.-2017-08-29/string-pattern-010920405090509092))
(clojure.spec.alpha/def :portkey.aws.mediaconvert.-2017-08-29/id-3-insertion (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.mediaconvert.-2017-08-29.id-3-insertion/id-3 :portkey.aws.mediaconvert.-2017-08-29.id-3-insertion/timecode]))

(clojure.spec.alpha/def :portkey.aws.mediaconvert.-2017-08-29.output-group-settings/type (clojure.spec.alpha/and :portkey.aws.mediaconvert.-2017-08-29/output-group-type))
(clojure.spec.alpha/def :portkey.aws.mediaconvert.-2017-08-29/output-group-settings (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.mediaconvert.-2017-08-29/cmaf-group-settings :portkey.aws.mediaconvert.-2017-08-29/dash-iso-group-settings :portkey.aws.mediaconvert.-2017-08-29/file-group-settings :portkey.aws.mediaconvert.-2017-08-29/hls-group-settings :portkey.aws.mediaconvert.-2017-08-29/ms-smooth-group-settings :portkey.aws.mediaconvert.-2017-08-29.output-group-settings/type]))

(clojure.spec.alpha/def :portkey.aws.mediaconvert.-2017-08-29/integer-min-32000-max-48000 (clojure.spec.alpha/int-in 32000 48000))

(clojure.spec.alpha/def :portkey.aws.mediaconvert.-2017-08-29/string-pattern-s-3-mm-2-vvmmppeeggaavviimmpp-4-ffllvvmmppttmmppggmm-4-vvttrrppff-4-vvmm-2-ttssttss-264-hh-264-mmkkvvmmoovvmmttssmm-2-ttwwmmvvaassffvvoobb-3-ggpp-3-ggppppmmxxffddiivvxxxxvviiddrraawwddvvggxxffmm-1-vv-3-gg-2-vvmmffmm-3-uu-8-llcchhggxxffmmppeegg-2-mmxxffmmppeegg-2-mmxxffhhddwwaavvyy-4-mmaaaaccaaiiffffmmpp-2-aacc-3-eecc-3-ddttssee (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__1012854__auto__] (clojure.core/re-matches #"^(s3:\/\/)([^\/]+\/)+([^\/\.]+|(([^\/]*)\.([mM]2[vV]|[mM][pP][eE][gG]|[aA][vV][iI]|[mM][pP]4|[fF][lL][vV]|[mM][pP][tT]|[mM][pP][gG]|[mM]4[vV]|[tT][rR][pP]|[fF]4[vV]|[mM]2[tT][sS]|[tT][sS]|264|[hH]264|[mM][kK][vV]|[mM][oO][vV]|[mM][tT][sS]|[mM]2[tT]|[wW][mM][vV]|[aA][sS][fF]|[vV][oO][bB]|3[gG][pP]|3[gG][pP][pP]|[mM][xX][fF]|[dD][iI][vV][xX]|[xX][vV][iI][dD]|[rR][aA][wW]|[dD][vV]|[gG][xX][fF]|[mM]1[vV]|3[gG]2|[vV][mM][fF]|[mM]3[uU]8|[lL][cC][hH]|[gG][xX][fF]_[mM][pP][eE][gG]2|[mM][xX][fF]_[mM][pP][eE][gG]2|[mM][xX][fF][hH][dD]|[wW][aA][vV]|[yY]4[mM]|[aA][aA][cC]|[aA][iI][fF][fF]|[mM][pP]2|[aA][cC]3|[eE][cC]3|[dD][tT][sS][eE])))$" s__1012854__auto__))))

(clojure.spec.alpha/def :portkey.aws.mediaconvert.-2017-08-29/integer-min-96-max-600 (clojure.spec.alpha/int-in 96 600))

(clojure.spec.alpha/def :portkey.aws.mediaconvert.-2017-08-29/ms-smooth-encryption-settings (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.mediaconvert.-2017-08-29/speke-key-provider]))

(clojure.spec.alpha/def :portkey.aws.mediaconvert.-2017-08-29/file-source-convert-608-to-708 #{"DISABLED" "UPCONVERT" :disabled :upconvert})

(clojure.spec.alpha/def :portkey.aws.mediaconvert.-2017-08-29.list-job-templates-response/job-templates (clojure.spec.alpha/and :portkey.aws.mediaconvert.-2017-08-29/list-of-job-template))
(clojure.spec.alpha/def :portkey.aws.mediaconvert.-2017-08-29.list-job-templates-response/next-token (clojure.spec.alpha/and :portkey.aws.mediaconvert.-2017-08-29/string))
(clojure.spec.alpha/def :portkey.aws.mediaconvert.-2017-08-29/list-job-templates-response (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.mediaconvert.-2017-08-29.list-job-templates-response/job-templates :portkey.aws.mediaconvert.-2017-08-29.list-job-templates-response/next-token]))

(clojure.spec.alpha/def :portkey.aws.mediaconvert.-2017-08-29/map-of-audio-selector-group (clojure.spec.alpha/map-of :portkey.aws.mediaconvert.-2017-08-29/string :portkey.aws.mediaconvert.-2017-08-29/audio-selector-group))

(clojure.spec.alpha/def :portkey.aws.mediaconvert.-2017-08-29/list-of-hls-ad-markers (clojure.spec.alpha/coll-of :portkey.aws.mediaconvert.-2017-08-29/hls-ad-markers))

(clojure.spec.alpha/def :portkey.aws.mediaconvert.-2017-08-29/list-of-integer-min-1-max-2147483647 (clojure.spec.alpha/coll-of :portkey.aws.mediaconvert.-2017-08-29/integer-min-1-max-2147483647))

(clojure.spec.alpha/def :portkey.aws.mediaconvert.-2017-08-29/dash-iso-hbbtv-compliance #{:hbbtv-1-5 "HBBTV_1_5" "NONE" :none})

(clojure.spec.alpha/def :portkey.aws.mediaconvert.-2017-08-29.input-clipping/end-timecode (clojure.spec.alpha/and :portkey.aws.mediaconvert.-2017-08-29/string-pattern-010920405090509092))
(clojure.spec.alpha/def :portkey.aws.mediaconvert.-2017-08-29.input-clipping/start-timecode (clojure.spec.alpha/and :portkey.aws.mediaconvert.-2017-08-29/string-pattern-010920405090509092))
(clojure.spec.alpha/def :portkey.aws.mediaconvert.-2017-08-29/input-clipping (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.mediaconvert.-2017-08-29.input-clipping/end-timecode :portkey.aws.mediaconvert.-2017-08-29.input-clipping/start-timecode]))

(clojure.spec.alpha/def :portkey.aws.mediaconvert.-2017-08-29/color-space #{:follow "HLG_2020" :rec-709 "REC_601" "FOLLOW" "HDR10" :hlg-2020 :hdr-10 :rec-601 "REC_709"})

(clojure.spec.alpha/def :portkey.aws.mediaconvert.-2017-08-29/scaling-behavior #{"STRETCH_TO_OUTPUT" :default :stretch-to-output "DEFAULT"})

(clojure.spec.alpha/def :portkey.aws.mediaconvert.-2017-08-29.mp-2-settings/bitrate (clojure.spec.alpha/and :portkey.aws.mediaconvert.-2017-08-29/integer-min-32000-max-384000))
(clojure.spec.alpha/def :portkey.aws.mediaconvert.-2017-08-29.mp-2-settings/channels (clojure.spec.alpha/and :portkey.aws.mediaconvert.-2017-08-29/integer-min-1-max-2))
(clojure.spec.alpha/def :portkey.aws.mediaconvert.-2017-08-29.mp-2-settings/sample-rate (clojure.spec.alpha/and :portkey.aws.mediaconvert.-2017-08-29/integer-min-32000-max-48000))
(clojure.spec.alpha/def :portkey.aws.mediaconvert.-2017-08-29/mp-2-settings (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.mediaconvert.-2017-08-29.mp-2-settings/bitrate :portkey.aws.mediaconvert.-2017-08-29.mp-2-settings/channels :portkey.aws.mediaconvert.-2017-08-29.mp-2-settings/sample-rate]))

(clojure.spec.alpha/def :portkey.aws.mediaconvert.-2017-08-29/mpeg-2-scene-change-detect #{"DISABLED" :disabled "ENABLED" :enabled})

(clojure.spec.alpha/def :portkey.aws.mediaconvert.-2017-08-29/integer-min-1-max-1001 (clojure.spec.alpha/int-in 1 1001))

(clojure.spec.alpha/def :portkey.aws.mediaconvert.-2017-08-29/m-2ts-es-rate-in-pes #{:exclude :include "INCLUDE" "EXCLUDE"})

(clojure.spec.alpha/def :portkey.aws.mediaconvert.-2017-08-29.create-job-request/status-update-interval-in-secs (clojure.spec.alpha/and :portkey.aws.mediaconvert.-2017-08-29/integer-min-10-max-600))
(clojure.spec.alpha/def :portkey.aws.mediaconvert.-2017-08-29.create-job-request/client-request-token (clojure.spec.alpha/and :portkey.aws.mediaconvert.-2017-08-29/string))
(clojure.spec.alpha/def :portkey.aws.mediaconvert.-2017-08-29.create-job-request/queue (clojure.spec.alpha/and :portkey.aws.mediaconvert.-2017-08-29/string))
(clojure.spec.alpha/def :portkey.aws.mediaconvert.-2017-08-29.create-job-request/job-template (clojure.spec.alpha/and :portkey.aws.mediaconvert.-2017-08-29/string))
(clojure.spec.alpha/def :portkey.aws.mediaconvert.-2017-08-29.create-job-request/user-metadata (clojure.spec.alpha/and :portkey.aws.mediaconvert.-2017-08-29/map-of-string))
(clojure.spec.alpha/def :portkey.aws.mediaconvert.-2017-08-29.create-job-request/role (clojure.spec.alpha/and :portkey.aws.mediaconvert.-2017-08-29/string))
(clojure.spec.alpha/def :portkey.aws.mediaconvert.-2017-08-29.create-job-request/settings (clojure.spec.alpha/and :portkey.aws.mediaconvert.-2017-08-29/job-settings))
(clojure.spec.alpha/def :portkey.aws.mediaconvert.-2017-08-29/create-job-request (clojure.spec.alpha/keys :req-un [:portkey.aws.mediaconvert.-2017-08-29.create-job-request/role :portkey.aws.mediaconvert.-2017-08-29.create-job-request/settings] :opt-un [:portkey.aws.mediaconvert.-2017-08-29.create-job-request/status-update-interval-in-secs :portkey.aws.mediaconvert.-2017-08-29.create-job-request/client-request-token :portkey.aws.mediaconvert.-2017-08-29.create-job-request/queue :portkey.aws.mediaconvert.-2017-08-29.create-job-request/job-template :portkey.aws.mediaconvert.-2017-08-29.create-job-request/user-metadata :portkey.aws.mediaconvert.-2017-08-29/acceleration-settings :portkey.aws.mediaconvert.-2017-08-29/billing-tags-source]))

(clojure.spec.alpha/def :portkey.aws.mediaconvert.-2017-08-29.caption-source-settings/source-type (clojure.spec.alpha/and :portkey.aws.mediaconvert.-2017-08-29/caption-source-type))
(clojure.spec.alpha/def :portkey.aws.mediaconvert.-2017-08-29/caption-source-settings (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.mediaconvert.-2017-08-29/ancillary-source-settings :portkey.aws.mediaconvert.-2017-08-29/dvb-sub-source-settings :portkey.aws.mediaconvert.-2017-08-29/embedded-source-settings :portkey.aws.mediaconvert.-2017-08-29/file-source-settings :portkey.aws.mediaconvert.-2017-08-29.caption-source-settings/source-type :portkey.aws.mediaconvert.-2017-08-29/teletext-source-settings :portkey.aws.mediaconvert.-2017-08-29/track-source-settings]))

(clojure.spec.alpha/def :portkey.aws.mediaconvert.-2017-08-29.caption-destination-settings/destination-type (clojure.spec.alpha/and :portkey.aws.mediaconvert.-2017-08-29/caption-destination-type))
(clojure.spec.alpha/def :portkey.aws.mediaconvert.-2017-08-29/caption-destination-settings (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.mediaconvert.-2017-08-29/burnin-destination-settings :portkey.aws.mediaconvert.-2017-08-29.caption-destination-settings/destination-type :portkey.aws.mediaconvert.-2017-08-29/dvb-sub-destination-settings :portkey.aws.mediaconvert.-2017-08-29/embedded-destination-settings :portkey.aws.mediaconvert.-2017-08-29/scc-destination-settings :portkey.aws.mediaconvert.-2017-08-29/teletext-destination-settings :portkey.aws.mediaconvert.-2017-08-29/ttml-destination-settings]))

(clojure.spec.alpha/def :portkey.aws.mediaconvert.-2017-08-29/integer-min-1000-max-30000 (clojure.spec.alpha/int-in 1000 30000))

(clojure.spec.alpha/def :portkey.aws.mediaconvert.-2017-08-29/integer-min-1-max-2147483647 (clojure.spec.alpha/int-in 1 2147483647))

(clojure.spec.alpha/def :portkey.aws.mediaconvert.-2017-08-29/integer-min-32-max-2160 (clojure.spec.alpha/int-in 32 2160))

(clojure.spec.alpha/def :portkey.aws.mediaconvert.-2017-08-29/hls-ad-markers #{"ELEMENTAL" "ELEMENTAL_SCTE35" :elemental-scte-35 :elemental})

(clojure.spec.alpha/def :portkey.aws.mediaconvert.-2017-08-29/list-of-string (clojure.spec.alpha/coll-of :portkey.aws.mediaconvert.-2017-08-29/string))

(clojure.spec.alpha/def :portkey.aws.mediaconvert.-2017-08-29/integer-min-10-max-600 clojure.core/int?)

(clojure.spec.alpha/def :portkey.aws.mediaconvert.-2017-08-29/m-2ts-segmentation-style #{:reset-cadence :maintain-cadence "MAINTAIN_CADENCE" "RESET_CADENCE"})

(clojure.spec.alpha/def :portkey.aws.mediaconvert.-2017-08-29.channel-mapping/output-channels (clojure.spec.alpha/and :portkey.aws.mediaconvert.-2017-08-29/list-of-output-channel-mapping))
(clojure.spec.alpha/def :portkey.aws.mediaconvert.-2017-08-29/channel-mapping (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.mediaconvert.-2017-08-29.channel-mapping/output-channels]))

(clojure.spec.alpha/def :portkey.aws.mediaconvert.-2017-08-29/integer-min-0-max-30 (clojure.spec.alpha/int-in 0 30))

(clojure.spec.alpha/def :portkey.aws.mediaconvert.-2017-08-29/associate-certificate-response (clojure.spec.alpha/keys :req-un [] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.mediaconvert.-2017-08-29.timing/finish-time (clojure.spec.alpha/and :portkey.aws.mediaconvert.-2017-08-29/timestamp-unix))
(clojure.spec.alpha/def :portkey.aws.mediaconvert.-2017-08-29.timing/start-time (clojure.spec.alpha/and :portkey.aws.mediaconvert.-2017-08-29/timestamp-unix))
(clojure.spec.alpha/def :portkey.aws.mediaconvert.-2017-08-29.timing/submit-time (clojure.spec.alpha/and :portkey.aws.mediaconvert.-2017-08-29/timestamp-unix))
(clojure.spec.alpha/def :portkey.aws.mediaconvert.-2017-08-29/timing (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.mediaconvert.-2017-08-29.timing/finish-time :portkey.aws.mediaconvert.-2017-08-29.timing/start-time :portkey.aws.mediaconvert.-2017-08-29.timing/submit-time]))

(clojure.spec.alpha/def :portkey.aws.mediaconvert.-2017-08-29/h-264-framerate-conversion-algorithm #{"DUPLICATE_DROP" :interpolate "INTERPOLATE" :duplicate-drop})

(clojure.spec.alpha/def :portkey.aws.mediaconvert.-2017-08-29/boolean clojure.core/boolean?)

(clojure.spec.alpha/def :portkey.aws.mediaconvert.-2017-08-29.conflict-exception/message (clojure.spec.alpha/and :portkey.aws.mediaconvert.-2017-08-29/string))
(clojure.spec.alpha/def :portkey.aws.mediaconvert.-2017-08-29/conflict-exception (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.mediaconvert.-2017-08-29.conflict-exception/message]))

(clojure.spec.alpha/def :portkey.aws.mediaconvert.-2017-08-29/m-2ts-force-ts-video-ebp-order #{:force :default "DEFAULT" "FORCE"})

(clojure.spec.alpha/def :portkey.aws.mediaconvert.-2017-08-29.list-presets-request/category (clojure.spec.alpha/and :portkey.aws.mediaconvert.-2017-08-29/string))
(clojure.spec.alpha/def :portkey.aws.mediaconvert.-2017-08-29.list-presets-request/list-by (clojure.spec.alpha/and :portkey.aws.mediaconvert.-2017-08-29/preset-list-by))
(clojure.spec.alpha/def :portkey.aws.mediaconvert.-2017-08-29.list-presets-request/max-results (clojure.spec.alpha/and :portkey.aws.mediaconvert.-2017-08-29/integer-min-1-max-20))
(clojure.spec.alpha/def :portkey.aws.mediaconvert.-2017-08-29.list-presets-request/next-token (clojure.spec.alpha/and :portkey.aws.mediaconvert.-2017-08-29/string))
(clojure.spec.alpha/def :portkey.aws.mediaconvert.-2017-08-29/list-presets-request (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.mediaconvert.-2017-08-29.list-presets-request/category :portkey.aws.mediaconvert.-2017-08-29.list-presets-request/list-by :portkey.aws.mediaconvert.-2017-08-29.list-presets-request/max-results :portkey.aws.mediaconvert.-2017-08-29.list-presets-request/next-token :portkey.aws.mediaconvert.-2017-08-29/order]))

(clojure.spec.alpha/def :portkey.aws.mediaconvert.-2017-08-29/dvb-subtitle-background-color #{:white "NONE" "WHITE" "BLACK" :none :black})

(clojure.spec.alpha/def :portkey.aws.mediaconvert.-2017-08-29/string-pattern-https (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__1012854__auto__] (clojure.core/re-matches #"^https:\/\/" s__1012854__auto__))))

(clojure.spec.alpha/def :portkey.aws.mediaconvert.-2017-08-29/audio-normalization-peak-calculation #{"TRUE_PEAK" "NONE" :true-peak :none})

(clojure.spec.alpha/def :portkey.aws.mediaconvert.-2017-08-29/integer-min-0-max-16 (clojure.spec.alpha/int-in 0 16))

(clojure.spec.alpha/def :portkey.aws.mediaconvert.-2017-08-29/integer-min-negative-70-max-0 (clojure.spec.alpha/int-in -70 0))

(clojure.spec.alpha/def :portkey.aws.mediaconvert.-2017-08-29.describe-endpoints-response/endpoints (clojure.spec.alpha/and :portkey.aws.mediaconvert.-2017-08-29/list-of-endpoint))
(clojure.spec.alpha/def :portkey.aws.mediaconvert.-2017-08-29.describe-endpoints-response/next-token (clojure.spec.alpha/and :portkey.aws.mediaconvert.-2017-08-29/string))
(clojure.spec.alpha/def :portkey.aws.mediaconvert.-2017-08-29/describe-endpoints-response (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.mediaconvert.-2017-08-29.describe-endpoints-response/endpoints :portkey.aws.mediaconvert.-2017-08-29.describe-endpoints-response/next-token]))

(clojure.spec.alpha/def :portkey.aws.mediaconvert.-2017-08-29/anti-alias #{"DISABLED" :disabled "ENABLED" :enabled})

(clojure.spec.alpha/def :portkey.aws.mediaconvert.-2017-08-29/burnin-subtitle-background-color #{:white "NONE" "WHITE" "BLACK" :none :black})

(clojure.spec.alpha/def :portkey.aws.mediaconvert.-2017-08-29/create-preset-response (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.mediaconvert.-2017-08-29/preset]))

(clojure.spec.alpha/def :portkey.aws.mediaconvert.-2017-08-29/m-2ts-rate-mode #{"VBR" :cbr :vbr "CBR"})

(clojure.spec.alpha/def :portkey.aws.mediaconvert.-2017-08-29/eac-3-bitstream-mode #{:hearing-impaired :visually-impaired :complete-main "COMPLETE_MAIN" "VISUALLY_IMPAIRED" "EMERGENCY" :emergency "COMMENTARY" :commentary "HEARING_IMPAIRED"})

(clojure.spec.alpha/def :portkey.aws.mediaconvert.-2017-08-29.timed-metadata-insertion/id-3-insertions (clojure.spec.alpha/and :portkey.aws.mediaconvert.-2017-08-29/list-of-id-3-insertion))
(clojure.spec.alpha/def :portkey.aws.mediaconvert.-2017-08-29/timed-metadata-insertion (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.mediaconvert.-2017-08-29.timed-metadata-insertion/id-3-insertions]))

(clojure.spec.alpha/def :portkey.aws.mediaconvert.-2017-08-29.input-template/denoise-filter (clojure.spec.alpha/and :portkey.aws.mediaconvert.-2017-08-29/input-denoise-filter))
(clojure.spec.alpha/def :portkey.aws.mediaconvert.-2017-08-29.input-template/filter-strength (clojure.spec.alpha/and :portkey.aws.mediaconvert.-2017-08-29/integer-min-negative-5-max-5))
(clojure.spec.alpha/def :portkey.aws.mediaconvert.-2017-08-29.input-template/program-number (clojure.spec.alpha/and :portkey.aws.mediaconvert.-2017-08-29/integer-min-1-max-2147483647))
(clojure.spec.alpha/def :portkey.aws.mediaconvert.-2017-08-29.input-template/input-clippings (clojure.spec.alpha/and :portkey.aws.mediaconvert.-2017-08-29/list-of-input-clipping))
(clojure.spec.alpha/def :portkey.aws.mediaconvert.-2017-08-29.input-template/timecode-source (clojure.spec.alpha/and :portkey.aws.mediaconvert.-2017-08-29/input-timecode-source))
(clojure.spec.alpha/def :portkey.aws.mediaconvert.-2017-08-29.input-template/caption-selectors (clojure.spec.alpha/and :portkey.aws.mediaconvert.-2017-08-29/map-of-caption-selector))
(clojure.spec.alpha/def :portkey.aws.mediaconvert.-2017-08-29.input-template/audio-selector-groups (clojure.spec.alpha/and :portkey.aws.mediaconvert.-2017-08-29/map-of-audio-selector-group))
(clojure.spec.alpha/def :portkey.aws.mediaconvert.-2017-08-29.input-template/filter-enable (clojure.spec.alpha/and :portkey.aws.mediaconvert.-2017-08-29/input-filter-enable))
(clojure.spec.alpha/def :portkey.aws.mediaconvert.-2017-08-29.input-template/psi-control (clojure.spec.alpha/and :portkey.aws.mediaconvert.-2017-08-29/input-psi-control))
(clojure.spec.alpha/def :portkey.aws.mediaconvert.-2017-08-29.input-template/audio-selectors (clojure.spec.alpha/and :portkey.aws.mediaconvert.-2017-08-29/map-of-audio-selector))
(clojure.spec.alpha/def :portkey.aws.mediaconvert.-2017-08-29.input-template/deblock-filter (clojure.spec.alpha/and :portkey.aws.mediaconvert.-2017-08-29/input-deblock-filter))
(clojure.spec.alpha/def :portkey.aws.mediaconvert.-2017-08-29/input-template (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.mediaconvert.-2017-08-29.input-template/denoise-filter :portkey.aws.mediaconvert.-2017-08-29.input-template/filter-strength :portkey.aws.mediaconvert.-2017-08-29.input-template/program-number :portkey.aws.mediaconvert.-2017-08-29.input-template/input-clippings :portkey.aws.mediaconvert.-2017-08-29.input-template/timecode-source :portkey.aws.mediaconvert.-2017-08-29.input-template/caption-selectors :portkey.aws.mediaconvert.-2017-08-29/video-selector :portkey.aws.mediaconvert.-2017-08-29.input-template/audio-selector-groups :portkey.aws.mediaconvert.-2017-08-29.input-template/filter-enable :portkey.aws.mediaconvert.-2017-08-29/image-inserter :portkey.aws.mediaconvert.-2017-08-29.input-template/psi-control :portkey.aws.mediaconvert.-2017-08-29.input-template/audio-selectors :portkey.aws.mediaconvert.-2017-08-29.input-template/deblock-filter]))

(clojure.spec.alpha/def :portkey.aws.mediaconvert.-2017-08-29/language-code #{"VIE" "ZUL" "COR" :sqi "URD" "EPO" :cat "MAR" :ile "SRB" "TAM" "TAH" :kir :bam "LIM" "SMO" :ibo :orm "POL" "JAV" :xho :zho "BEL" :ara "AAR" "KAU" "SQI" "III" "AVA" :kaz :lub "LUB" :her :por :sme :aar "SWE" :tur "POR" :hun :sna "AYM" :ita "NBL" :zha :run :cym "FIN" :dan :sot :cos :mya :slk "HEB" :bis :smo "SNA" :swa "PLI" :hrv "RON" "ABK" "CYM" "LAV" "AMH" "IDO" "FRY" "IPK" "VOL" "HAT" :lav :bul "KOM" :mri :kal :jpn :tso :bre :tir "IBO" :mal :kas :gla "MAH" :nbl "ARG" "KIK" :aka :fij :pan "BEN" "AVE" "GER" "ORJ" "FUL" "KUR" "KUA" :cor "NYA" "CHA" "NOB" :yid :grn "DEU" "SUN" "MKD" "HRV" :bak "XHO" "HUN" "LUG" :kik :ukr :abk :ton :nor "KAS" :ven "IND" :som :cha "KON" "ILE" :fra :tng :ssw :deu :iii :guj "NDE" "TGL" "LAT" "TWI" "EUS" "UKR" "HMO" "BRE" :ltz :yor "KAL" :nob :isl :hau :twi :lit "ELL" "LIN" :kor :rus :spa "NAU" :snd "MLT" "SME" :ipk :tat :msa "KHM" :hye "HIN" :ave "FRA" "MRI" "SLK" "THA" :pol :lin "AFR" :srb "AZE" :fry :uzb "KAT" :hat "EWE" "TSN" :bod :urd :mkd "ZHO" "OSS" :pus "ORM" :san :eng :tel :chv "SSW" "GUJ" :nau "EST" :div :ina :cre :che "KIR" "QUE" :aym "COS" "TUK" :afr "KOR" :vie "FIJ" "KAZ" "MYA" :ewe "AKA" :hin "TGK" :srd "ITA" :ful :glv :hmo :qaa "MON" "KAN" :kin :khm :slv "RUS" "YID" "NLD" :amh :tgk :mah "TAT" :arg :kat :frm "MSA" :ndo :aze :kur "DIV" "YOR" "MAL" "NNO" :ido :wln "FAS" :orj "SAG" :nld "SOM" :roh "BAM" "TON" :bel :ger "CHV" :uig :fas "GLE" "SLV" :oji "TEL" :zul "ARA" "ISL" :nya "SOT" "BIH" :sun "JPN" :lim :sin :kon :lao :nep :tam "TUR" :mlt "BAK" "VEN" :oci :lat :ron "FRM" "CES" "NAV" :tgl :ces "GLG" :tuk "IKU" :ori "TIR" "SAN" :kua "SIN" :mlg "WOL" "ORI" "ASM" :ava "DZO" "CRE" "BOD" "ENG" "BUL" "BOS" :mar :mon :tah "KIN" :tha "GRN" :pli :ben :fao "QAA" :est "PAN" "BIS" "PUS" :ind "MLG" "QPC" :kau "HAU" "WLN" :iku "LIT" :asm "HYE" "LTZ" :oss :qpc :chu "CHU" "SWA" "HER" :sag :kom "DAN" "TNG" :wol :ell :heb :swe "SRD" :gle "RUN" :lug :kan "UZB" "OJI" :jav :nno :que :nav "ZHA" :bos "SND" "TSO" "CHE" :epo "OCI" "ROH" :eus "NEP" "GLV" "CAT" :vol :dzo "ENM" :glg "FAO" "GLA" "UIG" "NDO" "SPA" :enm :tsn "LAO" "NOR" :bih "INA" :nde :fin})

(clojure.spec.alpha/def :portkey.aws.mediaconvert.-2017-08-29/string-min-9-max-19-pattern-az-26-east-west-central-north-south-east-west-1912 (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__1012852__auto__] (clojure.core/<= 9 (clojure.core/count s__1012852__auto__))) (clojure.core/fn [s__1012853__auto__] (clojure.core/< (clojure.core/count s__1012853__auto__) 19)) (clojure.core/fn [s__1012854__auto__] (clojure.core/re-matches #"^[a-z-]{2,6}-(east|west|central|((north|south)(east|west)?))-[1-9]{1,2}$" s__1012854__auto__))))

(clojure.spec.alpha/def :portkey.aws.mediaconvert.-2017-08-29.mov-settings/clap-atom (clojure.spec.alpha/and :portkey.aws.mediaconvert.-2017-08-29/mov-clap-atom))
(clojure.spec.alpha/def :portkey.aws.mediaconvert.-2017-08-29.mov-settings/cslg-atom (clojure.spec.alpha/and :portkey.aws.mediaconvert.-2017-08-29/mov-cslg-atom))
(clojure.spec.alpha/def :portkey.aws.mediaconvert.-2017-08-29.mov-settings/mpeg-2-four-cc-control (clojure.spec.alpha/and :portkey.aws.mediaconvert.-2017-08-29/mov-mpeg-2-four-cc-control))
(clojure.spec.alpha/def :portkey.aws.mediaconvert.-2017-08-29.mov-settings/padding-control (clojure.spec.alpha/and :portkey.aws.mediaconvert.-2017-08-29/mov-padding-control))
(clojure.spec.alpha/def :portkey.aws.mediaconvert.-2017-08-29.mov-settings/reference (clojure.spec.alpha/and :portkey.aws.mediaconvert.-2017-08-29/mov-reference))
(clojure.spec.alpha/def :portkey.aws.mediaconvert.-2017-08-29/mov-settings (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.mediaconvert.-2017-08-29.mov-settings/clap-atom :portkey.aws.mediaconvert.-2017-08-29.mov-settings/cslg-atom :portkey.aws.mediaconvert.-2017-08-29.mov-settings/mpeg-2-four-cc-control :portkey.aws.mediaconvert.-2017-08-29.mov-settings/padding-control :portkey.aws.mediaconvert.-2017-08-29.mov-settings/reference]))

(clojure.spec.alpha/def :portkey.aws.mediaconvert.-2017-08-29/integer-min-0-max-100 (clojure.spec.alpha/int-in 0 100))

(clojure.spec.alpha/def :portkey.aws.mediaconvert.-2017-08-29/list-of-hls-caption-language-mapping (clojure.spec.alpha/coll-of :portkey.aws.mediaconvert.-2017-08-29/hls-caption-language-mapping))

(clojure.spec.alpha/def :portkey.aws.mediaconvert.-2017-08-29/dash-iso-write-segment-timeline-in-representation #{"DISABLED" :disabled "ENABLED" :enabled})

(clojure.spec.alpha/def :portkey.aws.mediaconvert.-2017-08-29/integer-min-1-max-6 (clojure.spec.alpha/int-in 1 6))

(clojure.spec.alpha/def :portkey.aws.mediaconvert.-2017-08-29.ancillary-source-settings/source-ancillary-channel-number (clojure.spec.alpha/and :portkey.aws.mediaconvert.-2017-08-29/integer-min-1-max-4))
(clojure.spec.alpha/def :portkey.aws.mediaconvert.-2017-08-29/ancillary-source-settings (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.mediaconvert.-2017-08-29.ancillary-source-settings/source-ancillary-channel-number]))

(clojure.spec.alpha/def :portkey.aws.mediaconvert.-2017-08-29.input/denoise-filter (clojure.spec.alpha/and :portkey.aws.mediaconvert.-2017-08-29/input-denoise-filter))
(clojure.spec.alpha/def :portkey.aws.mediaconvert.-2017-08-29.input/filter-strength (clojure.spec.alpha/and :portkey.aws.mediaconvert.-2017-08-29/integer-min-negative-5-max-5))
(clojure.spec.alpha/def :portkey.aws.mediaconvert.-2017-08-29.input/program-number (clojure.spec.alpha/and :portkey.aws.mediaconvert.-2017-08-29/integer-min-1-max-2147483647))
(clojure.spec.alpha/def :portkey.aws.mediaconvert.-2017-08-29.input/input-clippings (clojure.spec.alpha/and :portkey.aws.mediaconvert.-2017-08-29/list-of-input-clipping))
(clojure.spec.alpha/def :portkey.aws.mediaconvert.-2017-08-29.input/timecode-source (clojure.spec.alpha/and :portkey.aws.mediaconvert.-2017-08-29/input-timecode-source))
(clojure.spec.alpha/def :portkey.aws.mediaconvert.-2017-08-29.input/supplemental-imps (clojure.spec.alpha/and :portkey.aws.mediaconvert.-2017-08-29/list-of-string-pattern-s-3-assetmap-xml))
(clojure.spec.alpha/def :portkey.aws.mediaconvert.-2017-08-29.input/caption-selectors (clojure.spec.alpha/and :portkey.aws.mediaconvert.-2017-08-29/map-of-caption-selector))
(clojure.spec.alpha/def :portkey.aws.mediaconvert.-2017-08-29.input/audio-selector-groups (clojure.spec.alpha/and :portkey.aws.mediaconvert.-2017-08-29/map-of-audio-selector-group))
(clojure.spec.alpha/def :portkey.aws.mediaconvert.-2017-08-29.input/filter-enable (clojure.spec.alpha/and :portkey.aws.mediaconvert.-2017-08-29/input-filter-enable))
(clojure.spec.alpha/def :portkey.aws.mediaconvert.-2017-08-29.input/psi-control (clojure.spec.alpha/and :portkey.aws.mediaconvert.-2017-08-29/input-psi-control))
(clojure.spec.alpha/def :portkey.aws.mediaconvert.-2017-08-29.input/audio-selectors (clojure.spec.alpha/and :portkey.aws.mediaconvert.-2017-08-29/map-of-audio-selector))
(clojure.spec.alpha/def :portkey.aws.mediaconvert.-2017-08-29.input/file-input (clojure.spec.alpha/and :portkey.aws.mediaconvert.-2017-08-29/string-pattern-s-3-mm-2-vvmmppeeggaavviimmpp-4-ffllvvmmppttmmppggmm-4-vvttrrppff-4-vvmm-2-ttssttss-264-hh-264-mmkkvvmmoovvmmttssmm-2-ttwwmmvvaassffvvoobb-3-ggpp-3-ggppppmmxxffddiivvxxxxvviiddrraawwddvvggxxffmm-1-vv-3-gg-2-vvmmffmm-3-uu-8-llcchhggxxffmmppeegg-2-mmxxffmmppeegg-2-mmxxffhhddwwaavvyy-4-mmxxmmll))
(clojure.spec.alpha/def :portkey.aws.mediaconvert.-2017-08-29.input/deblock-filter (clojure.spec.alpha/and :portkey.aws.mediaconvert.-2017-08-29/input-deblock-filter))
(clojure.spec.alpha/def :portkey.aws.mediaconvert.-2017-08-29.input/decryption-settings (clojure.spec.alpha/and :portkey.aws.mediaconvert.-2017-08-29/input-decryption-settings))
(clojure.spec.alpha/def :portkey.aws.mediaconvert.-2017-08-29/input (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.mediaconvert.-2017-08-29.input/denoise-filter :portkey.aws.mediaconvert.-2017-08-29.input/filter-strength :portkey.aws.mediaconvert.-2017-08-29.input/program-number :portkey.aws.mediaconvert.-2017-08-29.input/input-clippings :portkey.aws.mediaconvert.-2017-08-29.input/timecode-source :portkey.aws.mediaconvert.-2017-08-29.input/supplemental-imps :portkey.aws.mediaconvert.-2017-08-29.input/caption-selectors :portkey.aws.mediaconvert.-2017-08-29/video-selector :portkey.aws.mediaconvert.-2017-08-29.input/audio-selector-groups :portkey.aws.mediaconvert.-2017-08-29.input/filter-enable :portkey.aws.mediaconvert.-2017-08-29/image-inserter :portkey.aws.mediaconvert.-2017-08-29.input/psi-control :portkey.aws.mediaconvert.-2017-08-29.input/audio-selectors :portkey.aws.mediaconvert.-2017-08-29.input/file-input :portkey.aws.mediaconvert.-2017-08-29.input/deblock-filter :portkey.aws.mediaconvert.-2017-08-29.input/decryption-settings]))

(clojure.spec.alpha/def :portkey.aws.mediaconvert.-2017-08-29/h-265-alternate-transfer-function-sei #{"DISABLED" :disabled "ENABLED" :enabled})

(clojure.spec.alpha/def :portkey.aws.mediaconvert.-2017-08-29/m-2ts-ebp-audio-interval #{:video-interval "VIDEO_AND_FIXED_INTERVALS" "VIDEO_INTERVAL" :video-and-fixed-intervals})

(clojure.spec.alpha/def :portkey.aws.mediaconvert.-2017-08-29/input-psi-control #{"IGNORE_PSI" :ignore-psi "USE_PSI" :use-psi})

(clojure.spec.alpha/def :portkey.aws.mediaconvert.-2017-08-29/burnin-subtitle-alignment #{"LEFT" "CENTERED" :centered :left})

(clojure.spec.alpha/def :portkey.aws.mediaconvert.-2017-08-29.file-source-settings/convert-608-to-708 (clojure.spec.alpha/and :portkey.aws.mediaconvert.-2017-08-29/file-source-convert-608-to-708))
(clojure.spec.alpha/def :portkey.aws.mediaconvert.-2017-08-29.file-source-settings/source-file (clojure.spec.alpha/and :portkey.aws.mediaconvert.-2017-08-29/string-min-14-pattern-s-3-scc-scc-ttml-ttml-dfxp-dfxp-stl-stl-srt-srt-smi-smi))
(clojure.spec.alpha/def :portkey.aws.mediaconvert.-2017-08-29.file-source-settings/time-delta (clojure.spec.alpha/and :portkey.aws.mediaconvert.-2017-08-29/integer-min-negative-2147483648-max-2147483647))
(clojure.spec.alpha/def :portkey.aws.mediaconvert.-2017-08-29/file-source-settings (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.mediaconvert.-2017-08-29.file-source-settings/convert-608-to-708 :portkey.aws.mediaconvert.-2017-08-29.file-source-settings/source-file :portkey.aws.mediaconvert.-2017-08-29.file-source-settings/time-delta]))

(clojure.spec.alpha/def :portkey.aws.mediaconvert.-2017-08-29.not-found-exception/message (clojure.spec.alpha/and :portkey.aws.mediaconvert.-2017-08-29/string))
(clojure.spec.alpha/def :portkey.aws.mediaconvert.-2017-08-29/not-found-exception (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.mediaconvert.-2017-08-29.not-found-exception/message]))

(clojure.spec.alpha/def :portkey.aws.mediaconvert.-2017-08-29/prores-interlace-mode #{:follow-top-field :follow-bottom-field "BOTTOM_FIELD" "FOLLOW_TOP_FIELD" "PROGRESSIVE" "FOLLOW_BOTTOM_FIELD" :bottom-field :progressive :top-field "TOP_FIELD"})

(clojure.spec.alpha/def :portkey.aws.mediaconvert.-2017-08-29/caption-source-type #{"SCC" :scc :smi "STL" :imsc :ancillary "SRT" :stl "TELETEXT" "DVB_SUB" "SMI" :ttml "SCTE20" :null-source :teletext "EMBEDDED" "TTML" :embedded "NULL_SOURCE" "IMSC" :scte-20 "ANCILLARY" :srt :dvb-sub})

(clojure.spec.alpha/def :portkey.aws.mediaconvert.-2017-08-29/string-min-1-max-256 (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__1012852__auto__] (clojure.core/<= 1 (clojure.core/count s__1012852__auto__))) (clojure.core/fn [s__1012853__auto__] (clojure.core/< (clojure.core/count s__1012853__auto__) 256))))

(clojure.spec.alpha/def :portkey.aws.mediaconvert.-2017-08-29.motion-image-inserter/framerate (clojure.spec.alpha/and :portkey.aws.mediaconvert.-2017-08-29/motion-image-insertion-framerate))
(clojure.spec.alpha/def :portkey.aws.mediaconvert.-2017-08-29.motion-image-inserter/input (clojure.spec.alpha/and :portkey.aws.mediaconvert.-2017-08-29/string-min-14-max-1285-pattern-s-3-mov-09-png))
(clojure.spec.alpha/def :portkey.aws.mediaconvert.-2017-08-29.motion-image-inserter/insertion-mode (clojure.spec.alpha/and :portkey.aws.mediaconvert.-2017-08-29/motion-image-insertion-mode))
(clojure.spec.alpha/def :portkey.aws.mediaconvert.-2017-08-29.motion-image-inserter/offset (clojure.spec.alpha/and :portkey.aws.mediaconvert.-2017-08-29/motion-image-insertion-offset))
(clojure.spec.alpha/def :portkey.aws.mediaconvert.-2017-08-29.motion-image-inserter/playback (clojure.spec.alpha/and :portkey.aws.mediaconvert.-2017-08-29/motion-image-playback))
(clojure.spec.alpha/def :portkey.aws.mediaconvert.-2017-08-29.motion-image-inserter/start-time (clojure.spec.alpha/and :portkey.aws.mediaconvert.-2017-08-29/string-min-11-max-11-pattern-01-d-20305-d-205-d))
(clojure.spec.alpha/def :portkey.aws.mediaconvert.-2017-08-29/motion-image-inserter (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.mediaconvert.-2017-08-29.motion-image-inserter/framerate :portkey.aws.mediaconvert.-2017-08-29.motion-image-inserter/input :portkey.aws.mediaconvert.-2017-08-29.motion-image-inserter/insertion-mode :portkey.aws.mediaconvert.-2017-08-29.motion-image-inserter/offset :portkey.aws.mediaconvert.-2017-08-29.motion-image-inserter/playback :portkey.aws.mediaconvert.-2017-08-29.motion-image-inserter/start-time]))

(clojure.spec.alpha/def :portkey.aws.mediaconvert.-2017-08-29/color-metadata #{:insert :ignore "INSERT" "IGNORE"})

(clojure.spec.alpha/def :portkey.aws.mediaconvert.-2017-08-29/integer-min-48000-max-48000 (clojure.spec.alpha/int-in 48000 48000))

(clojure.spec.alpha/def :portkey.aws.mediaconvert.-2017-08-29/double-min-negative-59-max-0 clojure.core/double?)

(clojure.spec.alpha/def :portkey.aws.mediaconvert.-2017-08-29.get-job-request/id (clojure.spec.alpha/and :portkey.aws.mediaconvert.-2017-08-29/string))
(clojure.spec.alpha/def :portkey.aws.mediaconvert.-2017-08-29/get-job-request (clojure.spec.alpha/keys :req-un [:portkey.aws.mediaconvert.-2017-08-29.get-job-request/id] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.mediaconvert.-2017-08-29/string-min-16-max-24-pattern-a-za-z-0922-a-za-z-0916 (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__1012852__auto__] (clojure.core/<= 16 (clojure.core/count s__1012852__auto__))) (clojure.core/fn [s__1012853__auto__] (clojure.core/< (clojure.core/count s__1012853__auto__) 24)) (clojure.core/fn [s__1012854__auto__] (clojure.core/re-matches #"^[A-Za-z0-9+\/]{22}==$|^[A-Za-z0-9+\/]{16}$" s__1012854__auto__))))

(clojure.spec.alpha/def :portkey.aws.mediaconvert.-2017-08-29/integer-min-1000-max-300000000 (clojure.spec.alpha/int-in 1000 300000000))

(clojure.spec.alpha/def :portkey.aws.mediaconvert.-2017-08-29/list-of-queue (clojure.spec.alpha/coll-of :portkey.aws.mediaconvert.-2017-08-29/queue))

(clojure.spec.alpha/def :portkey.aws.mediaconvert.-2017-08-29.video-codec-settings/codec (clojure.spec.alpha/and :portkey.aws.mediaconvert.-2017-08-29/video-codec))
(clojure.spec.alpha/def :portkey.aws.mediaconvert.-2017-08-29/video-codec-settings (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.mediaconvert.-2017-08-29.video-codec-settings/codec :portkey.aws.mediaconvert.-2017-08-29/frame-capture-settings :portkey.aws.mediaconvert.-2017-08-29/h-264-settings :portkey.aws.mediaconvert.-2017-08-29/h-265-settings :portkey.aws.mediaconvert.-2017-08-29/mpeg-2-settings :portkey.aws.mediaconvert.-2017-08-29/prores-settings]))

(clojure.spec.alpha/def :portkey.aws.mediaconvert.-2017-08-29.h-264-qvbr-settings/max-average-bitrate (clojure.spec.alpha/and :portkey.aws.mediaconvert.-2017-08-29/integer-min-1000-max-1152000000))
(clojure.spec.alpha/def :portkey.aws.mediaconvert.-2017-08-29.h-264-qvbr-settings/qvbr-quality-level (clojure.spec.alpha/and :portkey.aws.mediaconvert.-2017-08-29/integer-min-1-max-10))
(clojure.spec.alpha/def :portkey.aws.mediaconvert.-2017-08-29/h-264-qvbr-settings (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.mediaconvert.-2017-08-29.h-264-qvbr-settings/max-average-bitrate :portkey.aws.mediaconvert.-2017-08-29.h-264-qvbr-settings/qvbr-quality-level]))

(clojure.spec.alpha/def :portkey.aws.mediaconvert.-2017-08-29/ms-smooth-manifest-encoding #{"UTF16" :utf-16 "UTF8" :utf-8})

(clojure.spec.alpha/def :portkey.aws.mediaconvert.-2017-08-29/output-group-type #{:file-group-settings "MS_SMOOTH_GROUP_SETTINGS" :cmaf-group-settings "FILE_GROUP_SETTINGS" "DASH_ISO_GROUP_SETTINGS" :hls-group-settings :ms-smooth-group-settings :dash-iso-group-settings "HLS_GROUP_SETTINGS" "CMAF_GROUP_SETTINGS"})

(clojure.spec.alpha/def :portkey.aws.mediaconvert.-2017-08-29/eac-3-dc-filter #{"DISABLED" :disabled "ENABLED" :enabled})

(clojure.spec.alpha/def :portkey.aws.mediaconvert.-2017-08-29/h-264-scene-change-detect #{"DISABLED" :disabled "ENABLED" :enabled})

(clojure.spec.alpha/def :portkey.aws.mediaconvert.-2017-08-29.noise-reducer/filter (clojure.spec.alpha/and :portkey.aws.mediaconvert.-2017-08-29/noise-reducer-filter))
(clojure.spec.alpha/def :portkey.aws.mediaconvert.-2017-08-29.noise-reducer/filter-settings (clojure.spec.alpha/and :portkey.aws.mediaconvert.-2017-08-29/noise-reducer-filter-settings))
(clojure.spec.alpha/def :portkey.aws.mediaconvert.-2017-08-29.noise-reducer/spatial-filter-settings (clojure.spec.alpha/and :portkey.aws.mediaconvert.-2017-08-29/noise-reducer-spatial-filter-settings))
(clojure.spec.alpha/def :portkey.aws.mediaconvert.-2017-08-29/noise-reducer (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.mediaconvert.-2017-08-29.noise-reducer/filter :portkey.aws.mediaconvert.-2017-08-29.noise-reducer/filter-settings :portkey.aws.mediaconvert.-2017-08-29.noise-reducer/spatial-filter-settings]))

(clojure.spec.alpha/def :portkey.aws.mediaconvert.-2017-08-29/list-of-string-min-1 (clojure.spec.alpha/coll-of :portkey.aws.mediaconvert.-2017-08-29/string-min-1))

(clojure.spec.alpha/def :portkey.aws.mediaconvert.-2017-08-29/audio-language-code-control #{"FOLLOW_INPUT" :follow-input "USE_CONFIGURED" :use-configured})

(clojure.spec.alpha/def :portkey.aws.mediaconvert.-2017-08-29/input-rotate #{"DEGREES_180" :degrees-90 "DEGREE_0" "DEGREES_90" :degrees-180 "AUTO" :degrees-270 "DEGREES_270" :degree-0 :auto})

(clojure.spec.alpha/def :portkey.aws.mediaconvert.-2017-08-29/list-of-job (clojure.spec.alpha/coll-of :portkey.aws.mediaconvert.-2017-08-29/job))

(clojure.spec.alpha/def :portkey.aws.mediaconvert.-2017-08-29/integer-min-0-max-50000 (clojure.spec.alpha/int-in 0 50000))

(clojure.spec.alpha/def :portkey.aws.mediaconvert.-2017-08-29/aac-coding-mode #{"AD_RECEIVER_MIX" "CODING_MODE_1_0" :ad-receiver-mix :coding-mode-1-0 :coding-mode-2-0 :coding-mode-5-1 "CODING_MODE_1_1" "CODING_MODE_2_0" :coding-mode-1-1 "CODING_MODE_5_1"})

(clojure.spec.alpha/def :portkey.aws.mediaconvert.-2017-08-29/list-of-output-group-detail (clojure.spec.alpha/coll-of :portkey.aws.mediaconvert.-2017-08-29/output-group-detail))

(clojure.spec.alpha/def :portkey.aws.mediaconvert.-2017-08-29/h-264-spatial-adaptive-quantization #{"DISABLED" :disabled "ENABLED" :enabled})

(clojure.spec.alpha/def :portkey.aws.mediaconvert.-2017-08-29.reservation-plan-settings/reserved-slots (clojure.spec.alpha/and :portkey.aws.mediaconvert.-2017-08-29/integer))
(clojure.spec.alpha/def :portkey.aws.mediaconvert.-2017-08-29/reservation-plan-settings (clojure.spec.alpha/keys :req-un [:portkey.aws.mediaconvert.-2017-08-29/commitment :portkey.aws.mediaconvert.-2017-08-29.reservation-plan-settings/reserved-slots :portkey.aws.mediaconvert.-2017-08-29/renewal-type] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.mediaconvert.-2017-08-29/string-pattern-010920405090509092 (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__1012854__auto__] (clojure.core/re-matches #"^([01][0-9]|2[0-4]):[0-5][0-9]:[0-5][0-9][:;][0-9]{2}$" s__1012854__auto__))))

(clojure.spec.alpha/def :portkey.aws.mediaconvert.-2017-08-29/output-settings (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.mediaconvert.-2017-08-29/hls-settings]))

(clojure.spec.alpha/def :portkey.aws.mediaconvert.-2017-08-29/burnin-subtitle-shadow-color #{:white "NONE" "WHITE" "BLACK" :none :black})

(clojure.spec.alpha/def :portkey.aws.mediaconvert.-2017-08-29.input-decryption-settings/encrypted-decryption-key (clojure.spec.alpha/and :portkey.aws.mediaconvert.-2017-08-29/string-min-24-max-512-pattern-a-za-z-0902))
(clojure.spec.alpha/def :portkey.aws.mediaconvert.-2017-08-29.input-decryption-settings/initialization-vector (clojure.spec.alpha/and :portkey.aws.mediaconvert.-2017-08-29/string-min-16-max-24-pattern-a-za-z-0922-a-za-z-0916))
(clojure.spec.alpha/def :portkey.aws.mediaconvert.-2017-08-29.input-decryption-settings/kms-key-region (clojure.spec.alpha/and :portkey.aws.mediaconvert.-2017-08-29/string-min-9-max-19-pattern-az-26-east-west-central-north-south-east-west-1912))
(clojure.spec.alpha/def :portkey.aws.mediaconvert.-2017-08-29/input-decryption-settings (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.mediaconvert.-2017-08-29/decryption-mode :portkey.aws.mediaconvert.-2017-08-29.input-decryption-settings/encrypted-decryption-key :portkey.aws.mediaconvert.-2017-08-29.input-decryption-settings/initialization-vector :portkey.aws.mediaconvert.-2017-08-29.input-decryption-settings/kms-key-region]))

(clojure.spec.alpha/def :portkey.aws.mediaconvert.-2017-08-29/h-265-gop-size-units #{"SECONDS" :frames :seconds "FRAMES"})

(clojure.spec.alpha/def :portkey.aws.mediaconvert.-2017-08-29/mp-4-cslg-atom #{:exclude :include "INCLUDE" "EXCLUDE"})

(clojure.spec.alpha/def :portkey.aws.mediaconvert.-2017-08-29/list-of-output (clojure.spec.alpha/coll-of :portkey.aws.mediaconvert.-2017-08-29/output))

(clojure.spec.alpha/def :portkey.aws.mediaconvert.-2017-08-29/mpeg-2-slow-pal #{"DISABLED" :disabled "ENABLED" :enabled})

(clojure.spec.alpha/def :portkey.aws.mediaconvert.-2017-08-29.teletext-destination-settings/page-number (clojure.spec.alpha/and :portkey.aws.mediaconvert.-2017-08-29/string-min-3-max-3-pattern-1809a-faf-09a-eae))
(clojure.spec.alpha/def :portkey.aws.mediaconvert.-2017-08-29/teletext-destination-settings (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.mediaconvert.-2017-08-29.teletext-destination-settings/page-number]))

(clojure.spec.alpha/def :portkey.aws.mediaconvert.-2017-08-29.output-group/custom-name (clojure.spec.alpha/and :portkey.aws.mediaconvert.-2017-08-29/string))
(clojure.spec.alpha/def :portkey.aws.mediaconvert.-2017-08-29.output-group/name (clojure.spec.alpha/and :portkey.aws.mediaconvert.-2017-08-29/string))
(clojure.spec.alpha/def :portkey.aws.mediaconvert.-2017-08-29.output-group/outputs (clojure.spec.alpha/and :portkey.aws.mediaconvert.-2017-08-29/list-of-output))
(clojure.spec.alpha/def :portkey.aws.mediaconvert.-2017-08-29/output-group (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.mediaconvert.-2017-08-29.output-group/custom-name :portkey.aws.mediaconvert.-2017-08-29.output-group/name :portkey.aws.mediaconvert.-2017-08-29/output-group-settings :portkey.aws.mediaconvert.-2017-08-29.output-group/outputs]))

(clojure.spec.alpha/def :portkey.aws.mediaconvert.-2017-08-29/h-265-quality-tuning-level #{:single-pass "MULTI_PASS_HQ" "SINGLE_PASS" :multi-pass-hq :single-pass-hq "SINGLE_PASS_HQ"})

(clojure.spec.alpha/def :portkey.aws.mediaconvert.-2017-08-29/mpeg-2-dynamic-sub-gop #{:adaptive :static "ADAPTIVE" "STATIC"})

(clojure.spec.alpha/def :portkey.aws.mediaconvert.-2017-08-29.image-inserter/insertable-images (clojure.spec.alpha/and :portkey.aws.mediaconvert.-2017-08-29/list-of-insertable-image))
(clojure.spec.alpha/def :portkey.aws.mediaconvert.-2017-08-29/image-inserter (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.mediaconvert.-2017-08-29.image-inserter/insertable-images]))

(clojure.spec.alpha/def :portkey.aws.mediaconvert.-2017-08-29/hls-client-cache #{"DISABLED" :disabled "ENABLED" :enabled})

(clojure.spec.alpha/def :portkey.aws.mediaconvert.-2017-08-29/input-filter-enable #{:disable "DISABLE" :force "AUTO" "FORCE" :auto})

(clojure.spec.alpha/def :portkey.aws.mediaconvert.-2017-08-29/integer-min-0-max-10000 (clojure.spec.alpha/int-in 0 10000))

(clojure.spec.alpha/def :portkey.aws.mediaconvert.-2017-08-29/burnin-subtitle-outline-color #{:white :yellow :green "GREEN" "BLUE" :red :blue "WHITE" "YELLOW" "BLACK" "RED" :black})

(clojure.spec.alpha/def :portkey.aws.mediaconvert.-2017-08-29.embedded-source-settings/convert-608-to-708 (clojure.spec.alpha/and :portkey.aws.mediaconvert.-2017-08-29/embedded-convert-608-to-708))
(clojure.spec.alpha/def :portkey.aws.mediaconvert.-2017-08-29.embedded-source-settings/source-608-channel-number (clojure.spec.alpha/and :portkey.aws.mediaconvert.-2017-08-29/integer-min-1-max-4))
(clojure.spec.alpha/def :portkey.aws.mediaconvert.-2017-08-29.embedded-source-settings/source-608-track-number (clojure.spec.alpha/and :portkey.aws.mediaconvert.-2017-08-29/integer-min-1-max-1))
(clojure.spec.alpha/def :portkey.aws.mediaconvert.-2017-08-29/embedded-source-settings (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.mediaconvert.-2017-08-29.embedded-source-settings/convert-608-to-708 :portkey.aws.mediaconvert.-2017-08-29.embedded-source-settings/source-608-channel-number :portkey.aws.mediaconvert.-2017-08-29.embedded-source-settings/source-608-track-number]))

(clojure.spec.alpha/def :portkey.aws.mediaconvert.-2017-08-29/create-queue-response (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.mediaconvert.-2017-08-29/queue]))

(clojure.spec.alpha/def :portkey.aws.mediaconvert.-2017-08-29/cmaf-key-provider-type #{:static-key "STATIC_KEY"})

(clojure.spec.alpha/def :portkey.aws.mediaconvert.-2017-08-29/integer-min-negative-2147483648-max-2147483647 (clojure.spec.alpha/int-in -2147483648 2147483647))

(clojure.spec.alpha/def :portkey.aws.mediaconvert.-2017-08-29.update-queue-request/description (clojure.spec.alpha/and :portkey.aws.mediaconvert.-2017-08-29/string))
(clojure.spec.alpha/def :portkey.aws.mediaconvert.-2017-08-29.update-queue-request/name (clojure.spec.alpha/and :portkey.aws.mediaconvert.-2017-08-29/string))
(clojure.spec.alpha/def :portkey.aws.mediaconvert.-2017-08-29.update-queue-request/status (clojure.spec.alpha/and :portkey.aws.mediaconvert.-2017-08-29/queue-status))
(clojure.spec.alpha/def :portkey.aws.mediaconvert.-2017-08-29/update-queue-request (clojure.spec.alpha/keys :req-un [:portkey.aws.mediaconvert.-2017-08-29.update-queue-request/name] :opt-un [:portkey.aws.mediaconvert.-2017-08-29.update-queue-request/description :portkey.aws.mediaconvert.-2017-08-29/reservation-plan-settings :portkey.aws.mediaconvert.-2017-08-29.update-queue-request/status]))

(clojure.spec.alpha/def :portkey.aws.mediaconvert.-2017-08-29/h-264-gop-b-reference #{"DISABLED" :disabled "ENABLED" :enabled})

(clojure.spec.alpha/def :portkey.aws.mediaconvert.-2017-08-29/video-codec #{:h-264 :mpeg-2 "H_264" :prores "MPEG2" :h-265 :frame-capture "H_265" "FRAME_CAPTURE" "PRORES"})

(clojure.spec.alpha/def :portkey.aws.mediaconvert.-2017-08-29/list-of-input (clojure.spec.alpha/coll-of :portkey.aws.mediaconvert.-2017-08-29/input))

(clojure.spec.alpha/def :portkey.aws.mediaconvert.-2017-08-29/integer-min-negative-5-max-5 (clojure.spec.alpha/int-in -5 5))

(clojure.spec.alpha/def :portkey.aws.mediaconvert.-2017-08-29/integer-min-24-max-60000 (clojure.spec.alpha/int-in 24 60000))

(clojure.spec.alpha/def :portkey.aws.mediaconvert.-2017-08-29/double-min-negative-60-max-3 clojure.core/double?)

(clojure.spec.alpha/def :portkey.aws.mediaconvert.-2017-08-29/list-of-output-detail (clojure.spec.alpha/coll-of :portkey.aws.mediaconvert.-2017-08-29/output-detail))

(clojure.spec.alpha/def :portkey.aws.mediaconvert.-2017-08-29/input-deblock-filter #{"DISABLED" :disabled "ENABLED" :enabled})

(clojure.spec.alpha/def :portkey.aws.mediaconvert.-2017-08-29/string-min-14-pattern-s-3-bmp-bmp-png-png-tga-tga (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__1012852__auto__] (clojure.core/<= 14 (clojure.core/count s__1012852__auto__))) (clojure.core/fn [s__1012854__auto__] (clojure.core/re-matches #"^(s3:\/\/)(.*?)\.(bmp|BMP|png|PNG|tga|TGA)$" s__1012854__auto__))))

(clojure.spec.alpha/def :portkey.aws.mediaconvert.-2017-08-29/double-min-0-max-2147483647 clojure.core/double?)

(clojure.spec.alpha/def :portkey.aws.mediaconvert.-2017-08-29.job-settings/esam (clojure.spec.alpha/and :portkey.aws.mediaconvert.-2017-08-29/esam-settings))
(clojure.spec.alpha/def :portkey.aws.mediaconvert.-2017-08-29.job-settings/inputs (clojure.spec.alpha/and :portkey.aws.mediaconvert.-2017-08-29/list-of-input))
(clojure.spec.alpha/def :portkey.aws.mediaconvert.-2017-08-29.job-settings/ad-avail-offset (clojure.spec.alpha/and :portkey.aws.mediaconvert.-2017-08-29/integer-min-negative-1000-max-1000))
(clojure.spec.alpha/def :portkey.aws.mediaconvert.-2017-08-29.job-settings/output-groups (clojure.spec.alpha/and :portkey.aws.mediaconvert.-2017-08-29/list-of-output-group))
(clojure.spec.alpha/def :portkey.aws.mediaconvert.-2017-08-29/job-settings (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.mediaconvert.-2017-08-29.job-settings/esam :portkey.aws.mediaconvert.-2017-08-29.job-settings/inputs :portkey.aws.mediaconvert.-2017-08-29/timed-metadata-insertion :portkey.aws.mediaconvert.-2017-08-29/motion-image-inserter :portkey.aws.mediaconvert.-2017-08-29/timecode-config :portkey.aws.mediaconvert.-2017-08-29.job-settings/ad-avail-offset :portkey.aws.mediaconvert.-2017-08-29.job-settings/output-groups :portkey.aws.mediaconvert.-2017-08-29/nielsen-configuration :portkey.aws.mediaconvert.-2017-08-29/avail-blanking]))

(clojure.spec.alpha/def :portkey.aws.mediaconvert.-2017-08-29/string-min-14-max-1285-pattern-s-3-mov-09-png (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__1012852__auto__] (clojure.core/<= 14 (clojure.core/count s__1012852__auto__))) (clojure.core/fn [s__1012853__auto__] (clojure.core/< (clojure.core/count s__1012853__auto__) 1285)) (clojure.core/fn [s__1012854__auto__] (clojure.core/re-matches #"^(s3:\/\/)(.*)(\.mov|[0-9]+\.png)$" s__1012854__auto__))))

(clojure.spec.alpha/def :portkey.aws.mediaconvert.-2017-08-29/audio-codec #{:eac-3 :mp-2 "EAC3" :wav "AC3" "PASSTHROUGH" :aac "MP2" "AAC" :aiff "AIFF" :passthrough "WAV" :ac-3})

(clojure.spec.alpha/def :portkey.aws.mediaconvert.-2017-08-29.h-265-settings/rate-control-mode (clojure.spec.alpha/and :portkey.aws.mediaconvert.-2017-08-29/h-265-rate-control-mode))
(clojure.spec.alpha/def :portkey.aws.mediaconvert.-2017-08-29.h-265-settings/unregistered-sei-timecode (clojure.spec.alpha/and :portkey.aws.mediaconvert.-2017-08-29/h-265-unregistered-sei-timecode))
(clojure.spec.alpha/def :portkey.aws.mediaconvert.-2017-08-29.h-265-settings/interlace-mode (clojure.spec.alpha/and :portkey.aws.mediaconvert.-2017-08-29/h-265-interlace-mode))
(clojure.spec.alpha/def :portkey.aws.mediaconvert.-2017-08-29.h-265-settings/min-i-interval (clojure.spec.alpha/and :portkey.aws.mediaconvert.-2017-08-29/integer-min-0-max-30))
(clojure.spec.alpha/def :portkey.aws.mediaconvert.-2017-08-29.h-265-settings/par-denominator (clojure.spec.alpha/and :portkey.aws.mediaconvert.-2017-08-29/integer-min-1-max-2147483647))
(clojure.spec.alpha/def :portkey.aws.mediaconvert.-2017-08-29.h-265-settings/gop-b-reference (clojure.spec.alpha/and :portkey.aws.mediaconvert.-2017-08-29/h-265-gop-b-reference))
(clojure.spec.alpha/def :portkey.aws.mediaconvert.-2017-08-29.h-265-settings/number-reference-frames (clojure.spec.alpha/and :portkey.aws.mediaconvert.-2017-08-29/integer-min-1-max-6))
(clojure.spec.alpha/def :portkey.aws.mediaconvert.-2017-08-29.h-265-settings/quality-tuning-level (clojure.spec.alpha/and :portkey.aws.mediaconvert.-2017-08-29/h-265-quality-tuning-level))
(clojure.spec.alpha/def :portkey.aws.mediaconvert.-2017-08-29.h-265-settings/tiles (clojure.spec.alpha/and :portkey.aws.mediaconvert.-2017-08-29/h-265-tiles))
(clojure.spec.alpha/def :portkey.aws.mediaconvert.-2017-08-29.h-265-settings/adaptive-quantization (clojure.spec.alpha/and :portkey.aws.mediaconvert.-2017-08-29/h-265-adaptive-quantization))
(clojure.spec.alpha/def :portkey.aws.mediaconvert.-2017-08-29.h-265-settings/framerate-denominator (clojure.spec.alpha/and :portkey.aws.mediaconvert.-2017-08-29/integer-min-1-max-2147483647))
(clojure.spec.alpha/def :portkey.aws.mediaconvert.-2017-08-29.h-265-settings/framerate-control (clojure.spec.alpha/and :portkey.aws.mediaconvert.-2017-08-29/h-265-framerate-control))
(clojure.spec.alpha/def :portkey.aws.mediaconvert.-2017-08-29.h-265-settings/alternate-transfer-function-sei (clojure.spec.alpha/and :portkey.aws.mediaconvert.-2017-08-29/h-265-alternate-transfer-function-sei))
(clojure.spec.alpha/def :portkey.aws.mediaconvert.-2017-08-29.h-265-settings/hrd-buffer-size (clojure.spec.alpha/and :portkey.aws.mediaconvert.-2017-08-29/integer-min-0-max-1466400000))
(clojure.spec.alpha/def :portkey.aws.mediaconvert.-2017-08-29.h-265-settings/slow-pal (clojure.spec.alpha/and :portkey.aws.mediaconvert.-2017-08-29/h-265-slow-pal))
(clojure.spec.alpha/def :portkey.aws.mediaconvert.-2017-08-29.h-265-settings/dynamic-sub-gop (clojure.spec.alpha/and :portkey.aws.mediaconvert.-2017-08-29/h-265-dynamic-sub-gop))
(clojure.spec.alpha/def :portkey.aws.mediaconvert.-2017-08-29.h-265-settings/number-b-frames-between-reference-frames (clojure.spec.alpha/and :portkey.aws.mediaconvert.-2017-08-29/integer-min-0-max-7))
(clojure.spec.alpha/def :portkey.aws.mediaconvert.-2017-08-29.h-265-settings/qvbr-settings (clojure.spec.alpha/and :portkey.aws.mediaconvert.-2017-08-29/h-265-qvbr-settings))
(clojure.spec.alpha/def :portkey.aws.mediaconvert.-2017-08-29.h-265-settings/gop-closed-cadence (clojure.spec.alpha/and :portkey.aws.mediaconvert.-2017-08-29/integer-min-0-max-2147483647))
(clojure.spec.alpha/def :portkey.aws.mediaconvert.-2017-08-29.h-265-settings/spatial-adaptive-quantization (clojure.spec.alpha/and :portkey.aws.mediaconvert.-2017-08-29/h-265-spatial-adaptive-quantization))
(clojure.spec.alpha/def :portkey.aws.mediaconvert.-2017-08-29.h-265-settings/framerate-numerator (clojure.spec.alpha/and :portkey.aws.mediaconvert.-2017-08-29/integer-min-1-max-2147483647))
(clojure.spec.alpha/def :portkey.aws.mediaconvert.-2017-08-29.h-265-settings/gop-size-units (clojure.spec.alpha/and :portkey.aws.mediaconvert.-2017-08-29/h-265-gop-size-units))
(clojure.spec.alpha/def :portkey.aws.mediaconvert.-2017-08-29.h-265-settings/max-bitrate (clojure.spec.alpha/and :portkey.aws.mediaconvert.-2017-08-29/integer-min-1000-max-1466400000))
(clojure.spec.alpha/def :portkey.aws.mediaconvert.-2017-08-29.h-265-settings/codec-profile (clojure.spec.alpha/and :portkey.aws.mediaconvert.-2017-08-29/h-265-codec-profile))
(clojure.spec.alpha/def :portkey.aws.mediaconvert.-2017-08-29.h-265-settings/temporal-ids (clojure.spec.alpha/and :portkey.aws.mediaconvert.-2017-08-29/h-265-temporal-ids))
(clojure.spec.alpha/def :portkey.aws.mediaconvert.-2017-08-29.h-265-settings/flicker-adaptive-quantization (clojure.spec.alpha/and :portkey.aws.mediaconvert.-2017-08-29/h-265-flicker-adaptive-quantization))
(clojure.spec.alpha/def :portkey.aws.mediaconvert.-2017-08-29.h-265-settings/par-numerator (clojure.spec.alpha/and :portkey.aws.mediaconvert.-2017-08-29/integer-min-1-max-2147483647))
(clojure.spec.alpha/def :portkey.aws.mediaconvert.-2017-08-29.h-265-settings/gop-size (clojure.spec.alpha/and :portkey.aws.mediaconvert.-2017-08-29/double-min-0))
(clojure.spec.alpha/def :portkey.aws.mediaconvert.-2017-08-29.h-265-settings/sample-adaptive-offset-filter-mode (clojure.spec.alpha/and :portkey.aws.mediaconvert.-2017-08-29/h-265-sample-adaptive-offset-filter-mode))
(clojure.spec.alpha/def :portkey.aws.mediaconvert.-2017-08-29.h-265-settings/par-control (clojure.spec.alpha/and :portkey.aws.mediaconvert.-2017-08-29/h-265-par-control))
(clojure.spec.alpha/def :portkey.aws.mediaconvert.-2017-08-29.h-265-settings/codec-level (clojure.spec.alpha/and :portkey.aws.mediaconvert.-2017-08-29/h-265-codec-level))
(clojure.spec.alpha/def :portkey.aws.mediaconvert.-2017-08-29.h-265-settings/telecine (clojure.spec.alpha/and :portkey.aws.mediaconvert.-2017-08-29/h-265-telecine))
(clojure.spec.alpha/def :portkey.aws.mediaconvert.-2017-08-29.h-265-settings/hrd-buffer-initial-fill-percentage (clojure.spec.alpha/and :portkey.aws.mediaconvert.-2017-08-29/integer-min-0-max-100))
(clojure.spec.alpha/def :portkey.aws.mediaconvert.-2017-08-29.h-265-settings/slices (clojure.spec.alpha/and :portkey.aws.mediaconvert.-2017-08-29/integer-min-1-max-32))
(clojure.spec.alpha/def :portkey.aws.mediaconvert.-2017-08-29.h-265-settings/temporal-adaptive-quantization (clojure.spec.alpha/and :portkey.aws.mediaconvert.-2017-08-29/h-265-temporal-adaptive-quantization))
(clojure.spec.alpha/def :portkey.aws.mediaconvert.-2017-08-29.h-265-settings/framerate-conversion-algorithm (clojure.spec.alpha/and :portkey.aws.mediaconvert.-2017-08-29/h-265-framerate-conversion-algorithm))
(clojure.spec.alpha/def :portkey.aws.mediaconvert.-2017-08-29.h-265-settings/scene-change-detect (clojure.spec.alpha/and :portkey.aws.mediaconvert.-2017-08-29/h-265-scene-change-detect))
(clojure.spec.alpha/def :portkey.aws.mediaconvert.-2017-08-29.h-265-settings/write-mp-4-packaging-type (clojure.spec.alpha/and :portkey.aws.mediaconvert.-2017-08-29/h-265-write-mp-4-packaging-type))
(clojure.spec.alpha/def :portkey.aws.mediaconvert.-2017-08-29.h-265-settings/bitrate (clojure.spec.alpha/and :portkey.aws.mediaconvert.-2017-08-29/integer-min-1000-max-1466400000))
(clojure.spec.alpha/def :portkey.aws.mediaconvert.-2017-08-29/h-265-settings (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.mediaconvert.-2017-08-29.h-265-settings/rate-control-mode :portkey.aws.mediaconvert.-2017-08-29.h-265-settings/unregistered-sei-timecode :portkey.aws.mediaconvert.-2017-08-29.h-265-settings/interlace-mode :portkey.aws.mediaconvert.-2017-08-29.h-265-settings/min-i-interval :portkey.aws.mediaconvert.-2017-08-29.h-265-settings/par-denominator :portkey.aws.mediaconvert.-2017-08-29.h-265-settings/gop-b-reference :portkey.aws.mediaconvert.-2017-08-29.h-265-settings/number-reference-frames :portkey.aws.mediaconvert.-2017-08-29.h-265-settings/quality-tuning-level :portkey.aws.mediaconvert.-2017-08-29.h-265-settings/tiles :portkey.aws.mediaconvert.-2017-08-29.h-265-settings/adaptive-quantization :portkey.aws.mediaconvert.-2017-08-29.h-265-settings/framerate-denominator :portkey.aws.mediaconvert.-2017-08-29.h-265-settings/framerate-control :portkey.aws.mediaconvert.-2017-08-29.h-265-settings/alternate-transfer-function-sei :portkey.aws.mediaconvert.-2017-08-29.h-265-settings/hrd-buffer-size :portkey.aws.mediaconvert.-2017-08-29.h-265-settings/slow-pal :portkey.aws.mediaconvert.-2017-08-29.h-265-settings/dynamic-sub-gop :portkey.aws.mediaconvert.-2017-08-29.h-265-settings/number-b-frames-between-reference-frames :portkey.aws.mediaconvert.-2017-08-29.h-265-settings/qvbr-settings :portkey.aws.mediaconvert.-2017-08-29.h-265-settings/gop-closed-cadence :portkey.aws.mediaconvert.-2017-08-29.h-265-settings/spatial-adaptive-quantization :portkey.aws.mediaconvert.-2017-08-29.h-265-settings/framerate-numerator :portkey.aws.mediaconvert.-2017-08-29.h-265-settings/gop-size-units :portkey.aws.mediaconvert.-2017-08-29.h-265-settings/max-bitrate :portkey.aws.mediaconvert.-2017-08-29.h-265-settings/codec-profile :portkey.aws.mediaconvert.-2017-08-29.h-265-settings/temporal-ids :portkey.aws.mediaconvert.-2017-08-29.h-265-settings/flicker-adaptive-quantization :portkey.aws.mediaconvert.-2017-08-29.h-265-settings/par-numerator :portkey.aws.mediaconvert.-2017-08-29.h-265-settings/gop-size :portkey.aws.mediaconvert.-2017-08-29.h-265-settings/sample-adaptive-offset-filter-mode :portkey.aws.mediaconvert.-2017-08-29.h-265-settings/par-control :portkey.aws.mediaconvert.-2017-08-29.h-265-settings/codec-level :portkey.aws.mediaconvert.-2017-08-29.h-265-settings/telecine :portkey.aws.mediaconvert.-2017-08-29.h-265-settings/hrd-buffer-initial-fill-percentage :portkey.aws.mediaconvert.-2017-08-29.h-265-settings/slices :portkey.aws.mediaconvert.-2017-08-29.h-265-settings/temporal-adaptive-quantization :portkey.aws.mediaconvert.-2017-08-29.h-265-settings/framerate-conversion-algorithm :portkey.aws.mediaconvert.-2017-08-29.h-265-settings/scene-change-detect :portkey.aws.mediaconvert.-2017-08-29.h-265-settings/write-mp-4-packaging-type :portkey.aws.mediaconvert.-2017-08-29.h-265-settings/bitrate]))

(clojure.spec.alpha/def :portkey.aws.mediaconvert.-2017-08-29.output-group-detail/output-details (clojure.spec.alpha/and :portkey.aws.mediaconvert.-2017-08-29/list-of-output-detail))
(clojure.spec.alpha/def :portkey.aws.mediaconvert.-2017-08-29/output-group-detail (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.mediaconvert.-2017-08-29.output-group-detail/output-details]))

(clojure.spec.alpha/def :portkey.aws.mediaconvert.-2017-08-29.endpoint/url (clojure.spec.alpha/and :portkey.aws.mediaconvert.-2017-08-29/string))
(clojure.spec.alpha/def :portkey.aws.mediaconvert.-2017-08-29/endpoint (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.mediaconvert.-2017-08-29.endpoint/url]))

(clojure.spec.alpha/def :portkey.aws.mediaconvert.-2017-08-29/timestamp-iso-8601 clojure.core/inst?)

(clojure.spec.alpha/def :portkey.aws.mediaconvert.-2017-08-29/double clojure.core/double?)

(clojure.spec.alpha/def :portkey.aws.mediaconvert.-2017-08-29/cmaf-initialization-vector-in-manifest #{:exclude :include "INCLUDE" "EXCLUDE"})

(clojure.spec.alpha/def :portkey.aws.mediaconvert.-2017-08-29/ac-3-coding-mode #{:coding-mode-3-2-lfe "CODING_MODE_1_0" :coding-mode-1-0 :coding-mode-2-0 "CODING_MODE_3_2_LFE" "CODING_MODE_1_1" "CODING_MODE_2_0" :coding-mode-1-1})

(clojure.spec.alpha/def :portkey.aws.mediaconvert.-2017-08-29/integer-min-10-max-48 (clojure.spec.alpha/int-in 10 48))

(clojure.spec.alpha/def :portkey.aws.mediaconvert.-2017-08-29.preset/arn (clojure.spec.alpha/and :portkey.aws.mediaconvert.-2017-08-29/string))
(clojure.spec.alpha/def :portkey.aws.mediaconvert.-2017-08-29.preset/category (clojure.spec.alpha/and :portkey.aws.mediaconvert.-2017-08-29/string))
(clojure.spec.alpha/def :portkey.aws.mediaconvert.-2017-08-29.preset/created-at (clojure.spec.alpha/and :portkey.aws.mediaconvert.-2017-08-29/timestamp-unix))
(clojure.spec.alpha/def :portkey.aws.mediaconvert.-2017-08-29.preset/description (clojure.spec.alpha/and :portkey.aws.mediaconvert.-2017-08-29/string))
(clojure.spec.alpha/def :portkey.aws.mediaconvert.-2017-08-29.preset/last-updated (clojure.spec.alpha/and :portkey.aws.mediaconvert.-2017-08-29/timestamp-unix))
(clojure.spec.alpha/def :portkey.aws.mediaconvert.-2017-08-29.preset/name (clojure.spec.alpha/and :portkey.aws.mediaconvert.-2017-08-29/string))
(clojure.spec.alpha/def :portkey.aws.mediaconvert.-2017-08-29.preset/settings (clojure.spec.alpha/and :portkey.aws.mediaconvert.-2017-08-29/preset-settings))
(clojure.spec.alpha/def :portkey.aws.mediaconvert.-2017-08-29/preset (clojure.spec.alpha/keys :req-un [:portkey.aws.mediaconvert.-2017-08-29.preset/settings :portkey.aws.mediaconvert.-2017-08-29.preset/name] :opt-un [:portkey.aws.mediaconvert.-2017-08-29.preset/arn :portkey.aws.mediaconvert.-2017-08-29.preset/category :portkey.aws.mediaconvert.-2017-08-29.preset/created-at :portkey.aws.mediaconvert.-2017-08-29.preset/description :portkey.aws.mediaconvert.-2017-08-29.preset/last-updated :portkey.aws.mediaconvert.-2017-08-29/type]))

(clojure.spec.alpha/def :portkey.aws.mediaconvert.-2017-08-29/m-2ts-nielsen-id-3 #{:insert "INSERT" "NONE" :none})

(clojure.spec.alpha/def :portkey.aws.mediaconvert.-2017-08-29/integer-min-0-max-10 (clojure.spec.alpha/int-in 0 10))

(clojure.spec.alpha/def :portkey.aws.mediaconvert.-2017-08-29/aac-rate-control-mode #{"VBR" :cbr :vbr "CBR"})

(clojure.spec.alpha/def :portkey.aws.mediaconvert.-2017-08-29/h-264-interlace-mode #{:follow-top-field :follow-bottom-field "BOTTOM_FIELD" "FOLLOW_TOP_FIELD" "PROGRESSIVE" "FOLLOW_BOTTOM_FIELD" :bottom-field :progressive :top-field "TOP_FIELD"})

(clojure.spec.alpha/def :portkey.aws.mediaconvert.-2017-08-29/mpeg-2-codec-profile #{:profile-422 "MAIN" "PROFILE_422" :main})

(clojure.spec.alpha/def :portkey.aws.mediaconvert.-2017-08-29/integer-min-negative-1000-max-1000 (clojure.spec.alpha/int-in -1000 1000))

(clojure.spec.alpha/def :portkey.aws.mediaconvert.-2017-08-29/integer-min-1-max-2 (clojure.spec.alpha/int-in 1 2))

(clojure.spec.alpha/def :portkey.aws.mediaconvert.-2017-08-29/mpeg-2-telecine #{:soft "SOFT" "HARD" "NONE" :none :hard})

(clojure.spec.alpha/def :portkey.aws.mediaconvert.-2017-08-29/audio-normalization-loudness-logging #{"DONT_LOG" :dont-log :log "LOG"})

(clojure.spec.alpha/def :portkey.aws.mediaconvert.-2017-08-29/h-265-dynamic-sub-gop #{:adaptive :static "ADAPTIVE" "STATIC"})

(clojure.spec.alpha/def :portkey.aws.mediaconvert.-2017-08-29/cmaf-write-dash-manifest #{"DISABLED" :disabled "ENABLED" :enabled})

(clojure.spec.alpha/def :portkey.aws.mediaconvert.-2017-08-29/dvb-subtitle-alignment #{"LEFT" "CENTERED" :centered :left})

(clojure.spec.alpha/def :portkey.aws.mediaconvert.-2017-08-29/mpeg-2-temporal-adaptive-quantization #{"DISABLED" :disabled "ENABLED" :enabled})

(clojure.spec.alpha/def :portkey.aws.mediaconvert.-2017-08-29/aac-codec-profile #{"LC" :hev-1 :lc "HEV2" "HEV1" :hev-2})

(clojure.spec.alpha/def :portkey.aws.mediaconvert.-2017-08-29/prores-par-control #{"SPECIFIED" "INITIALIZE_FROM_SOURCE" :specified :initialize-from-source})

(clojure.spec.alpha/def :portkey.aws.mediaconvert.-2017-08-29/mpeg-2-par-control #{"SPECIFIED" "INITIALIZE_FROM_SOURCE" :specified :initialize-from-source})

(clojure.spec.alpha/def :portkey.aws.mediaconvert.-2017-08-29.deinterlacer/algorithm (clojure.spec.alpha/and :portkey.aws.mediaconvert.-2017-08-29/deinterlace-algorithm))
(clojure.spec.alpha/def :portkey.aws.mediaconvert.-2017-08-29.deinterlacer/control (clojure.spec.alpha/and :portkey.aws.mediaconvert.-2017-08-29/deinterlacer-control))
(clojure.spec.alpha/def :portkey.aws.mediaconvert.-2017-08-29.deinterlacer/mode (clojure.spec.alpha/and :portkey.aws.mediaconvert.-2017-08-29/deinterlacer-mode))
(clojure.spec.alpha/def :portkey.aws.mediaconvert.-2017-08-29/deinterlacer (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.mediaconvert.-2017-08-29.deinterlacer/algorithm :portkey.aws.mediaconvert.-2017-08-29.deinterlacer/control :portkey.aws.mediaconvert.-2017-08-29.deinterlacer/mode]))

(clojure.spec.alpha/def :portkey.aws.mediaconvert.-2017-08-29.cmaf-encryption-settings/constant-initialization-vector (clojure.spec.alpha/and :portkey.aws.mediaconvert.-2017-08-29/string-min-32-max-32-pattern-09a-faf-32))
(clojure.spec.alpha/def :portkey.aws.mediaconvert.-2017-08-29.cmaf-encryption-settings/encryption-method (clojure.spec.alpha/and :portkey.aws.mediaconvert.-2017-08-29/cmaf-encryption-type))
(clojure.spec.alpha/def :portkey.aws.mediaconvert.-2017-08-29.cmaf-encryption-settings/initialization-vector-in-manifest (clojure.spec.alpha/and :portkey.aws.mediaconvert.-2017-08-29/cmaf-initialization-vector-in-manifest))
(clojure.spec.alpha/def :portkey.aws.mediaconvert.-2017-08-29.cmaf-encryption-settings/type (clojure.spec.alpha/and :portkey.aws.mediaconvert.-2017-08-29/cmaf-key-provider-type))
(clojure.spec.alpha/def :portkey.aws.mediaconvert.-2017-08-29/cmaf-encryption-settings (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.mediaconvert.-2017-08-29.cmaf-encryption-settings/constant-initialization-vector :portkey.aws.mediaconvert.-2017-08-29.cmaf-encryption-settings/encryption-method :portkey.aws.mediaconvert.-2017-08-29.cmaf-encryption-settings/initialization-vector-in-manifest :portkey.aws.mediaconvert.-2017-08-29/static-key-provider :portkey.aws.mediaconvert.-2017-08-29.cmaf-encryption-settings/type]))

(clojure.spec.alpha/def :portkey.aws.mediaconvert.-2017-08-29/mov-clap-atom #{:exclude :include "INCLUDE" "EXCLUDE"})

(clojure.spec.alpha/def :portkey.aws.mediaconvert.-2017-08-29/integer-min-negative-180-max-180 (clojure.spec.alpha/int-in -180 180))

(clojure.spec.alpha/def :portkey.aws.mediaconvert.-2017-08-29/integer-min-64000-max-640000 (clojure.spec.alpha/int-in 64000 640000))

(clojure.spec.alpha/def :portkey.aws.mediaconvert.-2017-08-29/delete-queue-response (clojure.spec.alpha/keys :req-un [] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.mediaconvert.-2017-08-29/respond-to-afd #{:respond "PASSTHROUGH" "NONE" :passthrough "RESPOND" :none})

(clojure.spec.alpha/def :portkey.aws.mediaconvert.-2017-08-29/string-pattern-a-za-z-0932 (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__1012854__auto__] (clojure.core/re-matches #"^[A-Za-z0-9]{32}$" s__1012854__auto__))))

(clojure.spec.alpha/def :portkey.aws.mediaconvert.-2017-08-29/eac-3-attenuation-control #{"ATTENUATE_3_DB" "NONE" :attenuate-3-db :none})

(clojure.spec.alpha/def :portkey.aws.mediaconvert.-2017-08-29/integer-min-0-max-96 (clojure.spec.alpha/int-in 0 96))

(clojure.spec.alpha/def :portkey.aws.mediaconvert.-2017-08-29/h-264-framerate-control #{"SPECIFIED" "INITIALIZE_FROM_SOURCE" :specified :initialize-from-source})

(clojure.spec.alpha/def :portkey.aws.mediaconvert.-2017-08-29.timecode-config/anchor (clojure.spec.alpha/and :portkey.aws.mediaconvert.-2017-08-29/string-pattern-010920405090509092))
(clojure.spec.alpha/def :portkey.aws.mediaconvert.-2017-08-29.timecode-config/source (clojure.spec.alpha/and :portkey.aws.mediaconvert.-2017-08-29/timecode-source))
(clojure.spec.alpha/def :portkey.aws.mediaconvert.-2017-08-29.timecode-config/start (clojure.spec.alpha/and :portkey.aws.mediaconvert.-2017-08-29/string-pattern-010920405090509092))
(clojure.spec.alpha/def :portkey.aws.mediaconvert.-2017-08-29.timecode-config/timestamp-offset (clojure.spec.alpha/and :portkey.aws.mediaconvert.-2017-08-29/string-pattern-0940191020191209301))
(clojure.spec.alpha/def :portkey.aws.mediaconvert.-2017-08-29/timecode-config (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.mediaconvert.-2017-08-29.timecode-config/anchor :portkey.aws.mediaconvert.-2017-08-29.timecode-config/source :portkey.aws.mediaconvert.-2017-08-29.timecode-config/start :portkey.aws.mediaconvert.-2017-08-29.timecode-config/timestamp-offset]))

(clojure.spec.alpha/def :portkey.aws.mediaconvert.-2017-08-29.dvb-sub-destination-settings/teletext-spacing (clojure.spec.alpha/and :portkey.aws.mediaconvert.-2017-08-29/dvb-subtitle-teletext-spacing))
(clojure.spec.alpha/def :portkey.aws.mediaconvert.-2017-08-29.dvb-sub-destination-settings/outline-color (clojure.spec.alpha/and :portkey.aws.mediaconvert.-2017-08-29/dvb-subtitle-outline-color))
(clojure.spec.alpha/def :portkey.aws.mediaconvert.-2017-08-29.dvb-sub-destination-settings/outline-size (clojure.spec.alpha/and :portkey.aws.mediaconvert.-2017-08-29/integer-min-0-max-10))
(clojure.spec.alpha/def :portkey.aws.mediaconvert.-2017-08-29.dvb-sub-destination-settings/shadow-color (clojure.spec.alpha/and :portkey.aws.mediaconvert.-2017-08-29/dvb-subtitle-shadow-color))
(clojure.spec.alpha/def :portkey.aws.mediaconvert.-2017-08-29.dvb-sub-destination-settings/shadow-opacity (clojure.spec.alpha/and :portkey.aws.mediaconvert.-2017-08-29/integer-min-0-max-255))
(clojure.spec.alpha/def :portkey.aws.mediaconvert.-2017-08-29.dvb-sub-destination-settings/shadow-y-offset (clojure.spec.alpha/and :portkey.aws.mediaconvert.-2017-08-29/integer-min-negative-2147483648-max-2147483647))
(clojure.spec.alpha/def :portkey.aws.mediaconvert.-2017-08-29.dvb-sub-destination-settings/background-color (clojure.spec.alpha/and :portkey.aws.mediaconvert.-2017-08-29/dvb-subtitle-background-color))
(clojure.spec.alpha/def :portkey.aws.mediaconvert.-2017-08-29.dvb-sub-destination-settings/y-position (clojure.spec.alpha/and :portkey.aws.mediaconvert.-2017-08-29/integer-min-0-max-2147483647))
(clojure.spec.alpha/def :portkey.aws.mediaconvert.-2017-08-29.dvb-sub-destination-settings/font-color (clojure.spec.alpha/and :portkey.aws.mediaconvert.-2017-08-29/dvb-subtitle-font-color))
(clojure.spec.alpha/def :portkey.aws.mediaconvert.-2017-08-29.dvb-sub-destination-settings/x-position (clojure.spec.alpha/and :portkey.aws.mediaconvert.-2017-08-29/integer-min-0-max-2147483647))
(clojure.spec.alpha/def :portkey.aws.mediaconvert.-2017-08-29.dvb-sub-destination-settings/font-resolution (clojure.spec.alpha/and :portkey.aws.mediaconvert.-2017-08-29/integer-min-96-max-600))
(clojure.spec.alpha/def :portkey.aws.mediaconvert.-2017-08-29.dvb-sub-destination-settings/font-size (clojure.spec.alpha/and :portkey.aws.mediaconvert.-2017-08-29/integer-min-0-max-96))
(clojure.spec.alpha/def :portkey.aws.mediaconvert.-2017-08-29.dvb-sub-destination-settings/background-opacity (clojure.spec.alpha/and :portkey.aws.mediaconvert.-2017-08-29/integer-min-0-max-255))
(clojure.spec.alpha/def :portkey.aws.mediaconvert.-2017-08-29.dvb-sub-destination-settings/font-opacity (clojure.spec.alpha/and :portkey.aws.mediaconvert.-2017-08-29/integer-min-0-max-255))
(clojure.spec.alpha/def :portkey.aws.mediaconvert.-2017-08-29.dvb-sub-destination-settings/shadow-x-offset (clojure.spec.alpha/and :portkey.aws.mediaconvert.-2017-08-29/integer-min-negative-2147483648-max-2147483647))
(clojure.spec.alpha/def :portkey.aws.mediaconvert.-2017-08-29.dvb-sub-destination-settings/alignment (clojure.spec.alpha/and :portkey.aws.mediaconvert.-2017-08-29/dvb-subtitle-alignment))
(clojure.spec.alpha/def :portkey.aws.mediaconvert.-2017-08-29/dvb-sub-destination-settings (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.mediaconvert.-2017-08-29.dvb-sub-destination-settings/teletext-spacing :portkey.aws.mediaconvert.-2017-08-29.dvb-sub-destination-settings/outline-color :portkey.aws.mediaconvert.-2017-08-29/font-script :portkey.aws.mediaconvert.-2017-08-29.dvb-sub-destination-settings/outline-size :portkey.aws.mediaconvert.-2017-08-29.dvb-sub-destination-settings/shadow-color :portkey.aws.mediaconvert.-2017-08-29.dvb-sub-destination-settings/shadow-opacity :portkey.aws.mediaconvert.-2017-08-29.dvb-sub-destination-settings/shadow-y-offset :portkey.aws.mediaconvert.-2017-08-29.dvb-sub-destination-settings/background-color :portkey.aws.mediaconvert.-2017-08-29.dvb-sub-destination-settings/y-position :portkey.aws.mediaconvert.-2017-08-29.dvb-sub-destination-settings/font-color :portkey.aws.mediaconvert.-2017-08-29.dvb-sub-destination-settings/x-position :portkey.aws.mediaconvert.-2017-08-29.dvb-sub-destination-settings/font-resolution :portkey.aws.mediaconvert.-2017-08-29.dvb-sub-destination-settings/font-size :portkey.aws.mediaconvert.-2017-08-29.dvb-sub-destination-settings/background-opacity :portkey.aws.mediaconvert.-2017-08-29.dvb-sub-destination-settings/font-opacity :portkey.aws.mediaconvert.-2017-08-29.dvb-sub-destination-settings/shadow-x-offset :portkey.aws.mediaconvert.-2017-08-29.dvb-sub-destination-settings/alignment]))

(clojure.spec.alpha/def :portkey.aws.mediaconvert.-2017-08-29/aac-audio-description-broadcaster-mix #{"NORMAL" "BROADCASTER_MIXED_AD" :normal :broadcaster-mixed-ad})

(clojure.spec.alpha/def :portkey.aws.mediaconvert.-2017-08-29/embedded-convert-608-to-708 #{"DISABLED" "UPCONVERT" :disabled :upconvert})

(clojure.spec.alpha/def :portkey.aws.mediaconvert.-2017-08-29/string-min-1 (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__1012852__auto__] (clojure.core/<= 1 (clojure.core/count s__1012852__auto__)))))

(clojure.spec.alpha/def :portkey.aws.mediaconvert.-2017-08-29/dvb-subtitle-teletext-spacing #{:fixed-grid "FIXED_GRID" "PROPORTIONAL" :proportional})

(clojure.spec.alpha/def :portkey.aws.mediaconvert.-2017-08-29/video-timecode-insertion #{"DISABLED" "PIC_TIMING_SEI" :disabled :pic-timing-sei})

(clojure.spec.alpha/def :portkey.aws.mediaconvert.-2017-08-29/mp-4-free-space-box #{:exclude :include "INCLUDE" "EXCLUDE"})

(clojure.spec.alpha/def :portkey.aws.mediaconvert.-2017-08-29/integer-min-1-max-2147483640 (clojure.spec.alpha/int-in 1 2147483640))

(clojure.spec.alpha/def :portkey.aws.mediaconvert.-2017-08-29/describe-endpoints-mode #{"GET_ONLY" :default "DEFAULT" :get-only})

(clojure.spec.alpha/def :portkey.aws.mediaconvert.-2017-08-29/list-of-string-pattern-09a-faf-809a-faf-409a-faf-409a-faf-409a-faf-12 (clojure.spec.alpha/coll-of :portkey.aws.mediaconvert.-2017-08-29/string-pattern-09a-faf-809a-faf-409a-faf-409a-faf-409a-faf-12))

(clojure.spec.alpha/def :portkey.aws.mediaconvert.-2017-08-29.audio-selector-group/audio-selector-names (clojure.spec.alpha/and :portkey.aws.mediaconvert.-2017-08-29/list-of-string-min-1))
(clojure.spec.alpha/def :portkey.aws.mediaconvert.-2017-08-29/audio-selector-group (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.mediaconvert.-2017-08-29.audio-selector-group/audio-selector-names]))

(clojure.spec.alpha/def :portkey.aws.mediaconvert.-2017-08-29.ac-3-settings/bitrate (clojure.spec.alpha/and :portkey.aws.mediaconvert.-2017-08-29/integer-min-64000-max-640000))
(clojure.spec.alpha/def :portkey.aws.mediaconvert.-2017-08-29.ac-3-settings/bitstream-mode (clojure.spec.alpha/and :portkey.aws.mediaconvert.-2017-08-29/ac-3-bitstream-mode))
(clojure.spec.alpha/def :portkey.aws.mediaconvert.-2017-08-29.ac-3-settings/coding-mode (clojure.spec.alpha/and :portkey.aws.mediaconvert.-2017-08-29/ac-3-coding-mode))
(clojure.spec.alpha/def :portkey.aws.mediaconvert.-2017-08-29.ac-3-settings/dialnorm (clojure.spec.alpha/and :portkey.aws.mediaconvert.-2017-08-29/integer-min-1-max-31))
(clojure.spec.alpha/def :portkey.aws.mediaconvert.-2017-08-29.ac-3-settings/dynamic-range-compression-profile (clojure.spec.alpha/and :portkey.aws.mediaconvert.-2017-08-29/ac-3-dynamic-range-compression-profile))
(clojure.spec.alpha/def :portkey.aws.mediaconvert.-2017-08-29.ac-3-settings/lfe-filter (clojure.spec.alpha/and :portkey.aws.mediaconvert.-2017-08-29/ac-3-lfe-filter))
(clojure.spec.alpha/def :portkey.aws.mediaconvert.-2017-08-29.ac-3-settings/metadata-control (clojure.spec.alpha/and :portkey.aws.mediaconvert.-2017-08-29/ac-3-metadata-control))
(clojure.spec.alpha/def :portkey.aws.mediaconvert.-2017-08-29.ac-3-settings/sample-rate (clojure.spec.alpha/and :portkey.aws.mediaconvert.-2017-08-29/integer-min-48000-max-48000))
(clojure.spec.alpha/def :portkey.aws.mediaconvert.-2017-08-29/ac-3-settings (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.mediaconvert.-2017-08-29.ac-3-settings/bitrate :portkey.aws.mediaconvert.-2017-08-29.ac-3-settings/bitstream-mode :portkey.aws.mediaconvert.-2017-08-29.ac-3-settings/coding-mode :portkey.aws.mediaconvert.-2017-08-29.ac-3-settings/dialnorm :portkey.aws.mediaconvert.-2017-08-29.ac-3-settings/dynamic-range-compression-profile :portkey.aws.mediaconvert.-2017-08-29.ac-3-settings/lfe-filter :portkey.aws.mediaconvert.-2017-08-29.ac-3-settings/metadata-control :portkey.aws.mediaconvert.-2017-08-29.ac-3-settings/sample-rate]))

(clojure.spec.alpha/def :portkey.aws.mediaconvert.-2017-08-29/integer-min-0-max-8 (clojure.spec.alpha/int-in 0 8))

(clojure.spec.alpha/def :portkey.aws.mediaconvert.-2017-08-29.ms-smooth-group-settings/audio-deduplication (clojure.spec.alpha/and :portkey.aws.mediaconvert.-2017-08-29/ms-smooth-audio-deduplication))
(clojure.spec.alpha/def :portkey.aws.mediaconvert.-2017-08-29.ms-smooth-group-settings/destination (clojure.spec.alpha/and :portkey.aws.mediaconvert.-2017-08-29/string-pattern-s-3))
(clojure.spec.alpha/def :portkey.aws.mediaconvert.-2017-08-29.ms-smooth-group-settings/encryption (clojure.spec.alpha/and :portkey.aws.mediaconvert.-2017-08-29/ms-smooth-encryption-settings))
(clojure.spec.alpha/def :portkey.aws.mediaconvert.-2017-08-29.ms-smooth-group-settings/fragment-length (clojure.spec.alpha/and :portkey.aws.mediaconvert.-2017-08-29/integer-min-1-max-2147483647))
(clojure.spec.alpha/def :portkey.aws.mediaconvert.-2017-08-29.ms-smooth-group-settings/manifest-encoding (clojure.spec.alpha/and :portkey.aws.mediaconvert.-2017-08-29/ms-smooth-manifest-encoding))
(clojure.spec.alpha/def :portkey.aws.mediaconvert.-2017-08-29/ms-smooth-group-settings (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.mediaconvert.-2017-08-29.ms-smooth-group-settings/audio-deduplication :portkey.aws.mediaconvert.-2017-08-29.ms-smooth-group-settings/destination :portkey.aws.mediaconvert.-2017-08-29.ms-smooth-group-settings/encryption :portkey.aws.mediaconvert.-2017-08-29.ms-smooth-group-settings/fragment-length :portkey.aws.mediaconvert.-2017-08-29.ms-smooth-group-settings/manifest-encoding]))

(clojure.spec.alpha/def :portkey.aws.mediaconvert.-2017-08-29/h-265-scene-change-detect #{"DISABLED" :disabled "ENABLED" :enabled})

(clojure.spec.alpha/def :portkey.aws.mediaconvert.-2017-08-29/integer-min-0-max-7 (clojure.spec.alpha/int-in 0 7))

(clojure.spec.alpha/def :portkey.aws.mediaconvert.-2017-08-29.create-queue-request/description (clojure.spec.alpha/and :portkey.aws.mediaconvert.-2017-08-29/string))
(clojure.spec.alpha/def :portkey.aws.mediaconvert.-2017-08-29.create-queue-request/name (clojure.spec.alpha/and :portkey.aws.mediaconvert.-2017-08-29/string))
(clojure.spec.alpha/def :portkey.aws.mediaconvert.-2017-08-29.create-queue-request/tags (clojure.spec.alpha/and :portkey.aws.mediaconvert.-2017-08-29/map-of-string))
(clojure.spec.alpha/def :portkey.aws.mediaconvert.-2017-08-29/create-queue-request (clojure.spec.alpha/keys :req-un [:portkey.aws.mediaconvert.-2017-08-29.create-queue-request/name] :opt-un [:portkey.aws.mediaconvert.-2017-08-29.create-queue-request/description :portkey.aws.mediaconvert.-2017-08-29/pricing-plan :portkey.aws.mediaconvert.-2017-08-29/reservation-plan-settings :portkey.aws.mediaconvert.-2017-08-29.create-queue-request/tags]))

(clojure.spec.alpha/def :portkey.aws.mediaconvert.-2017-08-29/reservation-plan-status #{"EXPIRED" :active "ACTIVE" :expired})

(clojure.spec.alpha/def :portkey.aws.mediaconvert.-2017-08-29/h-264-entropy-encoding #{"CABAC" :cabac "CAVLC" :cavlc})

(clojure.spec.alpha/def :portkey.aws.mediaconvert.-2017-08-29/hls-initialization-vector-in-manifest #{:exclude :include "INCLUDE" "EXCLUDE"})

(clojure.spec.alpha/def :portkey.aws.mediaconvert.-2017-08-29/h-265-spatial-adaptive-quantization #{"DISABLED" :disabled "ENABLED" :enabled})

(clojure.spec.alpha/def :portkey.aws.mediaconvert.-2017-08-29.list-presets-response/next-token (clojure.spec.alpha/and :portkey.aws.mediaconvert.-2017-08-29/string))
(clojure.spec.alpha/def :portkey.aws.mediaconvert.-2017-08-29.list-presets-response/presets (clojure.spec.alpha/and :portkey.aws.mediaconvert.-2017-08-29/list-of-preset))
(clojure.spec.alpha/def :portkey.aws.mediaconvert.-2017-08-29/list-presets-response (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.mediaconvert.-2017-08-29.list-presets-response/next-token :portkey.aws.mediaconvert.-2017-08-29.list-presets-response/presets]))

(clojure.spec.alpha/def :portkey.aws.mediaconvert.-2017-08-29/mov-cslg-atom #{:exclude :include "INCLUDE" "EXCLUDE"})

(clojure.spec.alpha/def :portkey.aws.mediaconvert.-2017-08-29.output/audio-descriptions (clojure.spec.alpha/and :portkey.aws.mediaconvert.-2017-08-29/list-of-audio-description))
(clojure.spec.alpha/def :portkey.aws.mediaconvert.-2017-08-29.output/caption-descriptions (clojure.spec.alpha/and :portkey.aws.mediaconvert.-2017-08-29/list-of-caption-description))
(clojure.spec.alpha/def :portkey.aws.mediaconvert.-2017-08-29.output/extension (clojure.spec.alpha/and :portkey.aws.mediaconvert.-2017-08-29/string))
(clojure.spec.alpha/def :portkey.aws.mediaconvert.-2017-08-29.output/name-modifier (clojure.spec.alpha/and :portkey.aws.mediaconvert.-2017-08-29/string-min-1))
(clojure.spec.alpha/def :portkey.aws.mediaconvert.-2017-08-29.output/preset (clojure.spec.alpha/and :portkey.aws.mediaconvert.-2017-08-29/string-min-0))
(clojure.spec.alpha/def :portkey.aws.mediaconvert.-2017-08-29/output (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.mediaconvert.-2017-08-29.output/audio-descriptions :portkey.aws.mediaconvert.-2017-08-29.output/caption-descriptions :portkey.aws.mediaconvert.-2017-08-29/container-settings :portkey.aws.mediaconvert.-2017-08-29.output/extension :portkey.aws.mediaconvert.-2017-08-29.output/name-modifier :portkey.aws.mediaconvert.-2017-08-29/output-settings :portkey.aws.mediaconvert.-2017-08-29.output/preset :portkey.aws.mediaconvert.-2017-08-29/video-description]))

(clojure.spec.alpha/def :portkey.aws.mediaconvert.-2017-08-29/string-pattern-identity-a-za-z-26-a-za-z-09163 (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__1012854__auto__] (clojure.core/re-matches #"^(identity|[A-Za-z]{2,6}(\.[A-Za-z0-9-]{1,63})+)$" s__1012854__auto__))))

(clojure.spec.alpha/def :portkey.aws.mediaconvert.-2017-08-29/integer-min-1-max-17895697 (clojure.spec.alpha/int-in 1 17895697))

(clojure.spec.alpha/def :portkey.aws.mediaconvert.-2017-08-29/h-265-codec-profile #{"MAIN_422_10BIT_HIGH" :main-422-8-bit-main :main-main "MAIN10_MAIN" :main-10-high "MAIN_MAIN" "MAIN_422_8BIT_HIGH" :main-10-main :main-422-10-bit-high "MAIN_422_8BIT_MAIN" :main-422-8-bit-high :main-422-10-bit-main :main-high "MAIN_422_10BIT_MAIN" "MAIN10_HIGH" "MAIN_HIGH"})

(clojure.spec.alpha/def :portkey.aws.mediaconvert.-2017-08-29/burnin-subtitle-font-color #{:white :yellow :green "GREEN" "BLUE" :red :blue "WHITE" "YELLOW" "BLACK" "RED" :black})

(clojure.spec.alpha/def :portkey.aws.mediaconvert.-2017-08-29/color-space-usage #{:force :fallback "FORCE" "FALLBACK"})

(clojure.spec.alpha/def :portkey.aws.mediaconvert.-2017-08-29/integer clojure.core/int?)

(clojure.spec.alpha/def :portkey.aws.mediaconvert.-2017-08-29.aac-settings/rate-control-mode (clojure.spec.alpha/and :portkey.aws.mediaconvert.-2017-08-29/aac-rate-control-mode))
(clojure.spec.alpha/def :portkey.aws.mediaconvert.-2017-08-29.aac-settings/coding-mode (clojure.spec.alpha/and :portkey.aws.mediaconvert.-2017-08-29/aac-coding-mode))
(clojure.spec.alpha/def :portkey.aws.mediaconvert.-2017-08-29.aac-settings/sample-rate (clojure.spec.alpha/and :portkey.aws.mediaconvert.-2017-08-29/integer-min-8000-max-96000))
(clojure.spec.alpha/def :portkey.aws.mediaconvert.-2017-08-29.aac-settings/vbr-quality (clojure.spec.alpha/and :portkey.aws.mediaconvert.-2017-08-29/aac-vbr-quality))
(clojure.spec.alpha/def :portkey.aws.mediaconvert.-2017-08-29.aac-settings/specification (clojure.spec.alpha/and :portkey.aws.mediaconvert.-2017-08-29/aac-specification))
(clojure.spec.alpha/def :portkey.aws.mediaconvert.-2017-08-29.aac-settings/codec-profile (clojure.spec.alpha/and :portkey.aws.mediaconvert.-2017-08-29/aac-codec-profile))
(clojure.spec.alpha/def :portkey.aws.mediaconvert.-2017-08-29.aac-settings/raw-format (clojure.spec.alpha/and :portkey.aws.mediaconvert.-2017-08-29/aac-raw-format))
(clojure.spec.alpha/def :portkey.aws.mediaconvert.-2017-08-29.aac-settings/audio-description-broadcaster-mix (clojure.spec.alpha/and :portkey.aws.mediaconvert.-2017-08-29/aac-audio-description-broadcaster-mix))
(clojure.spec.alpha/def :portkey.aws.mediaconvert.-2017-08-29.aac-settings/bitrate (clojure.spec.alpha/and :portkey.aws.mediaconvert.-2017-08-29/integer-min-6000-max-1024000))
(clojure.spec.alpha/def :portkey.aws.mediaconvert.-2017-08-29/aac-settings (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.mediaconvert.-2017-08-29.aac-settings/rate-control-mode :portkey.aws.mediaconvert.-2017-08-29.aac-settings/coding-mode :portkey.aws.mediaconvert.-2017-08-29.aac-settings/sample-rate :portkey.aws.mediaconvert.-2017-08-29.aac-settings/vbr-quality :portkey.aws.mediaconvert.-2017-08-29.aac-settings/specification :portkey.aws.mediaconvert.-2017-08-29.aac-settings/codec-profile :portkey.aws.mediaconvert.-2017-08-29.aac-settings/raw-format :portkey.aws.mediaconvert.-2017-08-29.aac-settings/audio-description-broadcaster-mix :portkey.aws.mediaconvert.-2017-08-29.aac-settings/bitrate]))

(clojure.spec.alpha/def :portkey.aws.mediaconvert.-2017-08-29/integer-min-1000-max-1466400000 (clojure.spec.alpha/int-in 1000 1466400000))

(clojure.spec.alpha/def :portkey.aws.mediaconvert.-2017-08-29/h-265-temporal-ids #{"DISABLED" :disabled "ENABLED" :enabled})

(clojure.spec.alpha/def :portkey.aws.mediaconvert.-2017-08-29/list-of-caption-description (clojure.spec.alpha/coll-of :portkey.aws.mediaconvert.-2017-08-29/caption-description))

(clojure.spec.alpha/def :portkey.aws.mediaconvert.-2017-08-29.embedded-destination-settings/destination-608-channel-number (clojure.spec.alpha/and :portkey.aws.mediaconvert.-2017-08-29/integer-min-1-max-4))
(clojure.spec.alpha/def :portkey.aws.mediaconvert.-2017-08-29/embedded-destination-settings (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.mediaconvert.-2017-08-29.embedded-destination-settings/destination-608-channel-number]))

(clojure.spec.alpha/def :portkey.aws.mediaconvert.-2017-08-29/timestamp-unix clojure.core/inst?)

(clojure.spec.alpha/def :portkey.aws.mediaconvert.-2017-08-29/timecode-burnin-position #{"TOP_CENTER" "MIDDLE_LEFT" :top-right "MIDDLE_CENTER" "MIDDLE_RIGHT" "BOTTOM_LEFT" :top-left "TOP_LEFT" :bottom-right "BOTTOM_CENTER" :bottom-left :top-center "TOP_RIGHT" :middle-left :bottom-center :middle-center :middle-right "BOTTOM_RIGHT"})

(clojure.spec.alpha/def :portkey.aws.mediaconvert.-2017-08-29.caption-selector/custom-language-code (clojure.spec.alpha/and :portkey.aws.mediaconvert.-2017-08-29/string-min-3-max-3-pattern-a-za-z-3))
(clojure.spec.alpha/def :portkey.aws.mediaconvert.-2017-08-29.caption-selector/source-settings (clojure.spec.alpha/and :portkey.aws.mediaconvert.-2017-08-29/caption-source-settings))
(clojure.spec.alpha/def :portkey.aws.mediaconvert.-2017-08-29/caption-selector (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.mediaconvert.-2017-08-29.caption-selector/custom-language-code :portkey.aws.mediaconvert.-2017-08-29/language-code :portkey.aws.mediaconvert.-2017-08-29.caption-selector/source-settings]))

(clojure.spec.alpha/def :portkey.aws.mediaconvert.-2017-08-29.burnin-destination-settings/teletext-spacing (clojure.spec.alpha/and :portkey.aws.mediaconvert.-2017-08-29/burnin-subtitle-teletext-spacing))
(clojure.spec.alpha/def :portkey.aws.mediaconvert.-2017-08-29.burnin-destination-settings/outline-color (clojure.spec.alpha/and :portkey.aws.mediaconvert.-2017-08-29/burnin-subtitle-outline-color))
(clojure.spec.alpha/def :portkey.aws.mediaconvert.-2017-08-29.burnin-destination-settings/outline-size (clojure.spec.alpha/and :portkey.aws.mediaconvert.-2017-08-29/integer-min-0-max-10))
(clojure.spec.alpha/def :portkey.aws.mediaconvert.-2017-08-29.burnin-destination-settings/shadow-color (clojure.spec.alpha/and :portkey.aws.mediaconvert.-2017-08-29/burnin-subtitle-shadow-color))
(clojure.spec.alpha/def :portkey.aws.mediaconvert.-2017-08-29.burnin-destination-settings/shadow-opacity (clojure.spec.alpha/and :portkey.aws.mediaconvert.-2017-08-29/integer-min-0-max-255))
(clojure.spec.alpha/def :portkey.aws.mediaconvert.-2017-08-29.burnin-destination-settings/shadow-y-offset (clojure.spec.alpha/and :portkey.aws.mediaconvert.-2017-08-29/integer-min-negative-2147483648-max-2147483647))
(clojure.spec.alpha/def :portkey.aws.mediaconvert.-2017-08-29.burnin-destination-settings/background-color (clojure.spec.alpha/and :portkey.aws.mediaconvert.-2017-08-29/burnin-subtitle-background-color))
(clojure.spec.alpha/def :portkey.aws.mediaconvert.-2017-08-29.burnin-destination-settings/y-position (clojure.spec.alpha/and :portkey.aws.mediaconvert.-2017-08-29/integer-min-0-max-2147483647))
(clojure.spec.alpha/def :portkey.aws.mediaconvert.-2017-08-29.burnin-destination-settings/font-color (clojure.spec.alpha/and :portkey.aws.mediaconvert.-2017-08-29/burnin-subtitle-font-color))
(clojure.spec.alpha/def :portkey.aws.mediaconvert.-2017-08-29.burnin-destination-settings/x-position (clojure.spec.alpha/and :portkey.aws.mediaconvert.-2017-08-29/integer-min-0-max-2147483647))
(clojure.spec.alpha/def :portkey.aws.mediaconvert.-2017-08-29.burnin-destination-settings/font-resolution (clojure.spec.alpha/and :portkey.aws.mediaconvert.-2017-08-29/integer-min-96-max-600))
(clojure.spec.alpha/def :portkey.aws.mediaconvert.-2017-08-29.burnin-destination-settings/font-size (clojure.spec.alpha/and :portkey.aws.mediaconvert.-2017-08-29/integer-min-0-max-96))
(clojure.spec.alpha/def :portkey.aws.mediaconvert.-2017-08-29.burnin-destination-settings/background-opacity (clojure.spec.alpha/and :portkey.aws.mediaconvert.-2017-08-29/integer-min-0-max-255))
(clojure.spec.alpha/def :portkey.aws.mediaconvert.-2017-08-29.burnin-destination-settings/font-opacity (clojure.spec.alpha/and :portkey.aws.mediaconvert.-2017-08-29/integer-min-0-max-255))
(clojure.spec.alpha/def :portkey.aws.mediaconvert.-2017-08-29.burnin-destination-settings/shadow-x-offset (clojure.spec.alpha/and :portkey.aws.mediaconvert.-2017-08-29/integer-min-negative-2147483648-max-2147483647))
(clojure.spec.alpha/def :portkey.aws.mediaconvert.-2017-08-29.burnin-destination-settings/alignment (clojure.spec.alpha/and :portkey.aws.mediaconvert.-2017-08-29/burnin-subtitle-alignment))
(clojure.spec.alpha/def :portkey.aws.mediaconvert.-2017-08-29/burnin-destination-settings (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.mediaconvert.-2017-08-29.burnin-destination-settings/teletext-spacing :portkey.aws.mediaconvert.-2017-08-29.burnin-destination-settings/outline-color :portkey.aws.mediaconvert.-2017-08-29/font-script :portkey.aws.mediaconvert.-2017-08-29.burnin-destination-settings/outline-size :portkey.aws.mediaconvert.-2017-08-29.burnin-destination-settings/shadow-color :portkey.aws.mediaconvert.-2017-08-29.burnin-destination-settings/shadow-opacity :portkey.aws.mediaconvert.-2017-08-29.burnin-destination-settings/shadow-y-offset :portkey.aws.mediaconvert.-2017-08-29.burnin-destination-settings/background-color :portkey.aws.mediaconvert.-2017-08-29.burnin-destination-settings/y-position :portkey.aws.mediaconvert.-2017-08-29.burnin-destination-settings/font-color :portkey.aws.mediaconvert.-2017-08-29.burnin-destination-settings/x-position :portkey.aws.mediaconvert.-2017-08-29.burnin-destination-settings/font-resolution :portkey.aws.mediaconvert.-2017-08-29.burnin-destination-settings/font-size :portkey.aws.mediaconvert.-2017-08-29.burnin-destination-settings/background-opacity :portkey.aws.mediaconvert.-2017-08-29.burnin-destination-settings/font-opacity :portkey.aws.mediaconvert.-2017-08-29.burnin-destination-settings/shadow-x-offset :portkey.aws.mediaconvert.-2017-08-29.burnin-destination-settings/alignment]))

(clojure.spec.alpha/def :portkey.aws.mediaconvert.-2017-08-29/update-preset-response (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.mediaconvert.-2017-08-29/preset]))

(clojure.spec.alpha/def :portkey.aws.mediaconvert.-2017-08-29.job/status-update-interval-in-secs (clojure.spec.alpha/and :portkey.aws.mediaconvert.-2017-08-29/integer-min-10-max-600))
(clojure.spec.alpha/def :portkey.aws.mediaconvert.-2017-08-29.job/queue (clojure.spec.alpha/and :portkey.aws.mediaconvert.-2017-08-29/string))
(clojure.spec.alpha/def :portkey.aws.mediaconvert.-2017-08-29.job/output-group-details (clojure.spec.alpha/and :portkey.aws.mediaconvert.-2017-08-29/list-of-output-group-detail))
(clojure.spec.alpha/def :portkey.aws.mediaconvert.-2017-08-29.job/status (clojure.spec.alpha/and :portkey.aws.mediaconvert.-2017-08-29/job-status))
(clojure.spec.alpha/def :portkey.aws.mediaconvert.-2017-08-29.job/job-template (clojure.spec.alpha/and :portkey.aws.mediaconvert.-2017-08-29/string))
(clojure.spec.alpha/def :portkey.aws.mediaconvert.-2017-08-29.job/user-metadata (clojure.spec.alpha/and :portkey.aws.mediaconvert.-2017-08-29/map-of-string))
(clojure.spec.alpha/def :portkey.aws.mediaconvert.-2017-08-29.job/error-message (clojure.spec.alpha/and :portkey.aws.mediaconvert.-2017-08-29/string))
(clojure.spec.alpha/def :portkey.aws.mediaconvert.-2017-08-29.job/role (clojure.spec.alpha/and :portkey.aws.mediaconvert.-2017-08-29/string))
(clojure.spec.alpha/def :portkey.aws.mediaconvert.-2017-08-29.job/error-code (clojure.spec.alpha/and :portkey.aws.mediaconvert.-2017-08-29/integer))
(clojure.spec.alpha/def :portkey.aws.mediaconvert.-2017-08-29.job/settings (clojure.spec.alpha/and :portkey.aws.mediaconvert.-2017-08-29/job-settings))
(clojure.spec.alpha/def :portkey.aws.mediaconvert.-2017-08-29.job/arn (clojure.spec.alpha/and :portkey.aws.mediaconvert.-2017-08-29/string))
(clojure.spec.alpha/def :portkey.aws.mediaconvert.-2017-08-29.job/created-at (clojure.spec.alpha/and :portkey.aws.mediaconvert.-2017-08-29/timestamp-unix))
(clojure.spec.alpha/def :portkey.aws.mediaconvert.-2017-08-29.job/id (clojure.spec.alpha/and :portkey.aws.mediaconvert.-2017-08-29/string))
(clojure.spec.alpha/def :portkey.aws.mediaconvert.-2017-08-29/job (clojure.spec.alpha/keys :req-un [:portkey.aws.mediaconvert.-2017-08-29.job/role :portkey.aws.mediaconvert.-2017-08-29.job/settings] :opt-un [:portkey.aws.mediaconvert.-2017-08-29.job/status-update-interval-in-secs :portkey.aws.mediaconvert.-2017-08-29.job/queue :portkey.aws.mediaconvert.-2017-08-29.job/output-group-details :portkey.aws.mediaconvert.-2017-08-29.job/status :portkey.aws.mediaconvert.-2017-08-29.job/job-template :portkey.aws.mediaconvert.-2017-08-29.job/user-metadata :portkey.aws.mediaconvert.-2017-08-29.job/error-message :portkey.aws.mediaconvert.-2017-08-29/acceleration-settings :portkey.aws.mediaconvert.-2017-08-29.job/error-code :portkey.aws.mediaconvert.-2017-08-29/timing :portkey.aws.mediaconvert.-2017-08-29.job/arn :portkey.aws.mediaconvert.-2017-08-29.job/created-at :portkey.aws.mediaconvert.-2017-08-29/billing-tags-source :portkey.aws.mediaconvert.-2017-08-29.job/id]))

(clojure.spec.alpha/def :portkey.aws.mediaconvert.-2017-08-29.hls-group-settings/segment-length (clojure.spec.alpha/and :portkey.aws.mediaconvert.-2017-08-29/integer-min-1-max-2147483647))
(clojure.spec.alpha/def :portkey.aws.mediaconvert.-2017-08-29.hls-group-settings/timestamp-delta-milliseconds (clojure.spec.alpha/and :portkey.aws.mediaconvert.-2017-08-29/integer-min-negative-2147483648-max-2147483647))
(clojure.spec.alpha/def :portkey.aws.mediaconvert.-2017-08-29.hls-group-settings/program-date-time-period (clojure.spec.alpha/and :portkey.aws.mediaconvert.-2017-08-29/integer-min-0-max-3600))
(clojure.spec.alpha/def :portkey.aws.mediaconvert.-2017-08-29.hls-group-settings/segment-control (clojure.spec.alpha/and :portkey.aws.mediaconvert.-2017-08-29/hls-segment-control))
(clojure.spec.alpha/def :portkey.aws.mediaconvert.-2017-08-29.hls-group-settings/ad-markers (clojure.spec.alpha/and :portkey.aws.mediaconvert.-2017-08-29/list-of-hls-ad-markers))
(clojure.spec.alpha/def :portkey.aws.mediaconvert.-2017-08-29.hls-group-settings/base-url (clojure.spec.alpha/and :portkey.aws.mediaconvert.-2017-08-29/string))
(clojure.spec.alpha/def :portkey.aws.mediaconvert.-2017-08-29.hls-group-settings/destination (clojure.spec.alpha/and :portkey.aws.mediaconvert.-2017-08-29/string-pattern-s-3))
(clojure.spec.alpha/def :portkey.aws.mediaconvert.-2017-08-29.hls-group-settings/min-final-segment-length (clojure.spec.alpha/and :portkey.aws.mediaconvert.-2017-08-29/double-min-0-max-2147483647))
(clojure.spec.alpha/def :portkey.aws.mediaconvert.-2017-08-29.hls-group-settings/caption-language-mappings (clojure.spec.alpha/and :portkey.aws.mediaconvert.-2017-08-29/list-of-hls-caption-language-mapping))
(clojure.spec.alpha/def :portkey.aws.mediaconvert.-2017-08-29.hls-group-settings/timed-metadata-id-3-frame (clojure.spec.alpha/and :portkey.aws.mediaconvert.-2017-08-29/hls-timed-metadata-id-3-frame))
(clojure.spec.alpha/def :portkey.aws.mediaconvert.-2017-08-29.hls-group-settings/directory-structure (clojure.spec.alpha/and :portkey.aws.mediaconvert.-2017-08-29/hls-directory-structure))
(clojure.spec.alpha/def :portkey.aws.mediaconvert.-2017-08-29.hls-group-settings/min-segment-length (clojure.spec.alpha/and :portkey.aws.mediaconvert.-2017-08-29/integer-min-0-max-2147483647))
(clojure.spec.alpha/def :portkey.aws.mediaconvert.-2017-08-29.hls-group-settings/stream-inf-resolution (clojure.spec.alpha/and :portkey.aws.mediaconvert.-2017-08-29/hls-stream-inf-resolution))
(clojure.spec.alpha/def :portkey.aws.mediaconvert.-2017-08-29.hls-group-settings/program-date-time (clojure.spec.alpha/and :portkey.aws.mediaconvert.-2017-08-29/hls-program-date-time))
(clojure.spec.alpha/def :portkey.aws.mediaconvert.-2017-08-29.hls-group-settings/output-selection (clojure.spec.alpha/and :portkey.aws.mediaconvert.-2017-08-29/hls-output-selection))
(clojure.spec.alpha/def :portkey.aws.mediaconvert.-2017-08-29.hls-group-settings/caption-language-setting (clojure.spec.alpha/and :portkey.aws.mediaconvert.-2017-08-29/hls-caption-language-setting))
(clojure.spec.alpha/def :portkey.aws.mediaconvert.-2017-08-29.hls-group-settings/manifest-duration-format (clojure.spec.alpha/and :portkey.aws.mediaconvert.-2017-08-29/hls-manifest-duration-format))
(clojure.spec.alpha/def :portkey.aws.mediaconvert.-2017-08-29.hls-group-settings/timed-metadata-id-3-period (clojure.spec.alpha/and :portkey.aws.mediaconvert.-2017-08-29/integer-min-negative-2147483648-max-2147483647))
(clojure.spec.alpha/def :portkey.aws.mediaconvert.-2017-08-29.hls-group-settings/manifest-compression (clojure.spec.alpha/and :portkey.aws.mediaconvert.-2017-08-29/hls-manifest-compression))
(clojure.spec.alpha/def :portkey.aws.mediaconvert.-2017-08-29.hls-group-settings/segments-per-subdirectory (clojure.spec.alpha/and :portkey.aws.mediaconvert.-2017-08-29/integer-min-1-max-2147483647))
(clojure.spec.alpha/def :portkey.aws.mediaconvert.-2017-08-29.hls-group-settings/encryption (clojure.spec.alpha/and :portkey.aws.mediaconvert.-2017-08-29/hls-encryption-settings))
(clojure.spec.alpha/def :portkey.aws.mediaconvert.-2017-08-29.hls-group-settings/codec-specification (clojure.spec.alpha/and :portkey.aws.mediaconvert.-2017-08-29/hls-codec-specification))
(clojure.spec.alpha/def :portkey.aws.mediaconvert.-2017-08-29.hls-group-settings/client-cache (clojure.spec.alpha/and :portkey.aws.mediaconvert.-2017-08-29/hls-client-cache))
(clojure.spec.alpha/def :portkey.aws.mediaconvert.-2017-08-29/hls-group-settings (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.mediaconvert.-2017-08-29.hls-group-settings/segment-length :portkey.aws.mediaconvert.-2017-08-29.hls-group-settings/timestamp-delta-milliseconds :portkey.aws.mediaconvert.-2017-08-29.hls-group-settings/program-date-time-period :portkey.aws.mediaconvert.-2017-08-29.hls-group-settings/segment-control :portkey.aws.mediaconvert.-2017-08-29.hls-group-settings/ad-markers :portkey.aws.mediaconvert.-2017-08-29.hls-group-settings/base-url :portkey.aws.mediaconvert.-2017-08-29.hls-group-settings/destination :portkey.aws.mediaconvert.-2017-08-29.hls-group-settings/min-final-segment-length :portkey.aws.mediaconvert.-2017-08-29.hls-group-settings/caption-language-mappings :portkey.aws.mediaconvert.-2017-08-29.hls-group-settings/timed-metadata-id-3-frame :portkey.aws.mediaconvert.-2017-08-29.hls-group-settings/directory-structure :portkey.aws.mediaconvert.-2017-08-29.hls-group-settings/min-segment-length :portkey.aws.mediaconvert.-2017-08-29.hls-group-settings/stream-inf-resolution :portkey.aws.mediaconvert.-2017-08-29.hls-group-settings/program-date-time :portkey.aws.mediaconvert.-2017-08-29.hls-group-settings/output-selection :portkey.aws.mediaconvert.-2017-08-29.hls-group-settings/caption-language-setting :portkey.aws.mediaconvert.-2017-08-29.hls-group-settings/manifest-duration-format :portkey.aws.mediaconvert.-2017-08-29.hls-group-settings/timed-metadata-id-3-period :portkey.aws.mediaconvert.-2017-08-29.hls-group-settings/manifest-compression :portkey.aws.mediaconvert.-2017-08-29.hls-group-settings/segments-per-subdirectory :portkey.aws.mediaconvert.-2017-08-29.hls-group-settings/encryption :portkey.aws.mediaconvert.-2017-08-29.hls-group-settings/codec-specification :portkey.aws.mediaconvert.-2017-08-29.hls-group-settings/client-cache]))

(clojure.spec.alpha/def :portkey.aws.mediaconvert.-2017-08-29.dvb-nit-settings/network-id (clojure.spec.alpha/and :portkey.aws.mediaconvert.-2017-08-29/integer-min-0-max-65535))
(clojure.spec.alpha/def :portkey.aws.mediaconvert.-2017-08-29.dvb-nit-settings/network-name (clojure.spec.alpha/and :portkey.aws.mediaconvert.-2017-08-29/string-min-1-max-256))
(clojure.spec.alpha/def :portkey.aws.mediaconvert.-2017-08-29.dvb-nit-settings/nit-interval (clojure.spec.alpha/and :portkey.aws.mediaconvert.-2017-08-29/integer-min-25-max-10000))
(clojure.spec.alpha/def :portkey.aws.mediaconvert.-2017-08-29/dvb-nit-settings (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.mediaconvert.-2017-08-29.dvb-nit-settings/network-id :portkey.aws.mediaconvert.-2017-08-29.dvb-nit-settings/network-name :portkey.aws.mediaconvert.-2017-08-29.dvb-nit-settings/nit-interval]))

(clojure.spec.alpha/def :portkey.aws.mediaconvert.-2017-08-29/integer-min-1-max-20 (clojure.spec.alpha/int-in 1 20))

(clojure.spec.alpha/def :portkey.aws.mediaconvert.-2017-08-29/delete-job-template-response (clojure.spec.alpha/keys :req-un [] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.mediaconvert.-2017-08-29/cmaf-manifest-duration-format #{"FLOATING_POINT" :floating-point "INTEGER" :integer})

(clojure.spec.alpha/def :portkey.aws.mediaconvert.-2017-08-29/queue-list-by #{"CREATION_DATE" "NAME" :name :creation-date})

(clojure.spec.alpha/def :portkey.aws.mediaconvert.-2017-08-29/h-265-write-mp-4-packaging-type #{:hev-1 "HVC1" :hvc-1 "HEV1"})

(clojure.spec.alpha/def :portkey.aws.mediaconvert.-2017-08-29/hls-segment-control #{:segmented-files "SINGLE_FILE" "SEGMENTED_FILES" :single-file})

(clojure.spec.alpha/def :portkey.aws.mediaconvert.-2017-08-29/prores-telecine #{"HARD" "NONE" :none :hard})

(clojure.spec.alpha/def :portkey.aws.mediaconvert.-2017-08-29/ac-3-dynamic-range-compression-profile #{:film-standard "FILM_STANDARD" "NONE" :none})

(clojure.spec.alpha/def :portkey.aws.mediaconvert.-2017-08-29/h-265-flicker-adaptive-quantization #{"DISABLED" :disabled "ENABLED" :enabled})

(clojure.spec.alpha/def :portkey.aws.mediaconvert.-2017-08-29/string-min-3-max-3-pattern-a-za-z-3 (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__1012852__auto__] (clojure.core/<= 3 (clojure.core/count s__1012852__auto__))) (clojure.core/fn [s__1012853__auto__] (clojure.core/< (clojure.core/count s__1012853__auto__) 3)) (clojure.core/fn [s__1012854__auto__] (clojure.core/re-matches #"^[A-Za-z]{3}$" s__1012854__auto__))))

(clojure.spec.alpha/def :portkey.aws.mediaconvert.-2017-08-29/double-min-negative-60-max-negative-1 clojure.core/double?)

(clojure.spec.alpha/def :portkey.aws.mediaconvert.-2017-08-29.describe-endpoints-request/max-results (clojure.spec.alpha/and :portkey.aws.mediaconvert.-2017-08-29/integer))
(clojure.spec.alpha/def :portkey.aws.mediaconvert.-2017-08-29.describe-endpoints-request/mode (clojure.spec.alpha/and :portkey.aws.mediaconvert.-2017-08-29/describe-endpoints-mode))
(clojure.spec.alpha/def :portkey.aws.mediaconvert.-2017-08-29.describe-endpoints-request/next-token (clojure.spec.alpha/and :portkey.aws.mediaconvert.-2017-08-29/string))
(clojure.spec.alpha/def :portkey.aws.mediaconvert.-2017-08-29/describe-endpoints-request (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.mediaconvert.-2017-08-29.describe-endpoints-request/max-results :portkey.aws.mediaconvert.-2017-08-29.describe-endpoints-request/mode :portkey.aws.mediaconvert.-2017-08-29.describe-endpoints-request/next-token]))

(clojure.spec.alpha/def :portkey.aws.mediaconvert.-2017-08-29.m-2ts-scte-35-esam/scte-35-esam-pid (clojure.spec.alpha/and :portkey.aws.mediaconvert.-2017-08-29/integer-min-32-max-8182))
(clojure.spec.alpha/def :portkey.aws.mediaconvert.-2017-08-29/m-2ts-scte-35-esam (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.mediaconvert.-2017-08-29.m-2ts-scte-35-esam/scte-35-esam-pid]))

(clojure.spec.alpha/def :portkey.aws.mediaconvert.-2017-08-29.frame-capture-settings/framerate-denominator (clojure.spec.alpha/and :portkey.aws.mediaconvert.-2017-08-29/integer-min-1-max-2147483647))
(clojure.spec.alpha/def :portkey.aws.mediaconvert.-2017-08-29.frame-capture-settings/framerate-numerator (clojure.spec.alpha/and :portkey.aws.mediaconvert.-2017-08-29/integer-min-1-max-2147483647))
(clojure.spec.alpha/def :portkey.aws.mediaconvert.-2017-08-29.frame-capture-settings/max-captures (clojure.spec.alpha/and :portkey.aws.mediaconvert.-2017-08-29/integer-min-1-max-10000000))
(clojure.spec.alpha/def :portkey.aws.mediaconvert.-2017-08-29.frame-capture-settings/quality (clojure.spec.alpha/and :portkey.aws.mediaconvert.-2017-08-29/integer-min-1-max-100))
(clojure.spec.alpha/def :portkey.aws.mediaconvert.-2017-08-29/frame-capture-settings (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.mediaconvert.-2017-08-29.frame-capture-settings/framerate-denominator :portkey.aws.mediaconvert.-2017-08-29.frame-capture-settings/framerate-numerator :portkey.aws.mediaconvert.-2017-08-29.frame-capture-settings/max-captures :portkey.aws.mediaconvert.-2017-08-29.frame-capture-settings/quality]))

(clojure.spec.alpha/def :portkey.aws.mediaconvert.-2017-08-29/hls-program-date-time #{:exclude :include "INCLUDE" "EXCLUDE"})

(clojure.spec.alpha/def :portkey.aws.mediaconvert.-2017-08-29/h-265-framerate-control #{"SPECIFIED" "INITIALIZE_FROM_SOURCE" :specified :initialize-from-source})

(clojure.spec.alpha/def :portkey.aws.mediaconvert.-2017-08-29.nielsen-configuration/breakout-code (clojure.spec.alpha/and :portkey.aws.mediaconvert.-2017-08-29/integer-min-0-max-9))
(clojure.spec.alpha/def :portkey.aws.mediaconvert.-2017-08-29.nielsen-configuration/distributor-id (clojure.spec.alpha/and :portkey.aws.mediaconvert.-2017-08-29/string))
(clojure.spec.alpha/def :portkey.aws.mediaconvert.-2017-08-29/nielsen-configuration (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.mediaconvert.-2017-08-29.nielsen-configuration/breakout-code :portkey.aws.mediaconvert.-2017-08-29.nielsen-configuration/distributor-id]))

(clojure.spec.alpha/def :portkey.aws.mediaconvert.-2017-08-29.static-key-provider/key-format (clojure.spec.alpha/and :portkey.aws.mediaconvert.-2017-08-29/string-pattern-identity-a-za-z-26-a-za-z-09163))
(clojure.spec.alpha/def :portkey.aws.mediaconvert.-2017-08-29.static-key-provider/key-format-versions (clojure.spec.alpha/and :portkey.aws.mediaconvert.-2017-08-29/string-pattern-dd))
(clojure.spec.alpha/def :portkey.aws.mediaconvert.-2017-08-29.static-key-provider/static-key-value (clojure.spec.alpha/and :portkey.aws.mediaconvert.-2017-08-29/string-pattern-a-za-z-0932))
(clojure.spec.alpha/def :portkey.aws.mediaconvert.-2017-08-29.static-key-provider/url (clojure.spec.alpha/and :portkey.aws.mediaconvert.-2017-08-29/string))
(clojure.spec.alpha/def :portkey.aws.mediaconvert.-2017-08-29/static-key-provider (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.mediaconvert.-2017-08-29.static-key-provider/key-format :portkey.aws.mediaconvert.-2017-08-29.static-key-provider/key-format-versions :portkey.aws.mediaconvert.-2017-08-29.static-key-provider/static-key-value :portkey.aws.mediaconvert.-2017-08-29.static-key-provider/url]))

(clojure.spec.alpha/def :portkey.aws.mediaconvert.-2017-08-29.esam-settings/manifest-confirm-condition-notification (clojure.spec.alpha/and :portkey.aws.mediaconvert.-2017-08-29/esam-manifest-confirm-condition-notification))
(clojure.spec.alpha/def :portkey.aws.mediaconvert.-2017-08-29.esam-settings/response-signal-preroll (clojure.spec.alpha/and :portkey.aws.mediaconvert.-2017-08-29/integer-min-0-max-30000))
(clojure.spec.alpha/def :portkey.aws.mediaconvert.-2017-08-29.esam-settings/signal-processing-notification (clojure.spec.alpha/and :portkey.aws.mediaconvert.-2017-08-29/esam-signal-processing-notification))
(clojure.spec.alpha/def :portkey.aws.mediaconvert.-2017-08-29/esam-settings (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.mediaconvert.-2017-08-29.esam-settings/manifest-confirm-condition-notification :portkey.aws.mediaconvert.-2017-08-29.esam-settings/response-signal-preroll :portkey.aws.mediaconvert.-2017-08-29.esam-settings/signal-processing-notification]))

(clojure.spec.alpha/def :portkey.aws.mediaconvert.-2017-08-29/decryption-mode #{:aes-cbc :aes-gcm "AES_GCM" "AES_CBC" :aes-ctr "AES_CTR"})

(clojure.spec.alpha/def :portkey.aws.mediaconvert.-2017-08-29/integer-min-1000-max-1152000000 (clojure.spec.alpha/int-in 1000 1152000000))

(clojure.spec.alpha/def :portkey.aws.mediaconvert.-2017-08-29.audio-codec-settings/codec (clojure.spec.alpha/and :portkey.aws.mediaconvert.-2017-08-29/audio-codec))
(clojure.spec.alpha/def :portkey.aws.mediaconvert.-2017-08-29/audio-codec-settings (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.mediaconvert.-2017-08-29/aac-settings :portkey.aws.mediaconvert.-2017-08-29/ac-3-settings :portkey.aws.mediaconvert.-2017-08-29/aiff-settings :portkey.aws.mediaconvert.-2017-08-29.audio-codec-settings/codec :portkey.aws.mediaconvert.-2017-08-29/eac-3-settings :portkey.aws.mediaconvert.-2017-08-29/mp-2-settings :portkey.aws.mediaconvert.-2017-08-29/wav-settings]))

(clojure.spec.alpha/def :portkey.aws.mediaconvert.-2017-08-29/mpeg-2-intra-dc-precision #{"INTRA_DC_PRECISION_10" :intra-dc-precision-8 "AUTO" :intra-dc-precision-9 :intra-dc-precision-11 "INTRA_DC_PRECISION_9" "INTRA_DC_PRECISION_11" :intra-dc-precision-10 :auto "INTRA_DC_PRECISION_8"})

(clojure.spec.alpha/def :portkey.aws.mediaconvert.-2017-08-29/mpeg-2-spatial-adaptive-quantization #{"DISABLED" :disabled "ENABLED" :enabled})

(clojure.spec.alpha/def :portkey.aws.mediaconvert.-2017-08-29.rectangle/height (clojure.spec.alpha/and :portkey.aws.mediaconvert.-2017-08-29/integer-min-2-max-2147483647))
(clojure.spec.alpha/def :portkey.aws.mediaconvert.-2017-08-29.rectangle/width (clojure.spec.alpha/and :portkey.aws.mediaconvert.-2017-08-29/integer-min-2-max-2147483647))
(clojure.spec.alpha/def :portkey.aws.mediaconvert.-2017-08-29.rectangle/x (clojure.spec.alpha/and :portkey.aws.mediaconvert.-2017-08-29/integer-min-0-max-2147483647))
(clojure.spec.alpha/def :portkey.aws.mediaconvert.-2017-08-29.rectangle/y (clojure.spec.alpha/and :portkey.aws.mediaconvert.-2017-08-29/integer-min-0-max-2147483647))
(clojure.spec.alpha/def :portkey.aws.mediaconvert.-2017-08-29/rectangle (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.mediaconvert.-2017-08-29.rectangle/height :portkey.aws.mediaconvert.-2017-08-29.rectangle/width :portkey.aws.mediaconvert.-2017-08-29.rectangle/x :portkey.aws.mediaconvert.-2017-08-29.rectangle/y]))

(clojure.spec.alpha/def :portkey.aws.mediaconvert.-2017-08-29/mpeg-2-quality-tuning-level #{:single-pass :multi-pass "SINGLE_PASS" "MULTI_PASS"})

(clojure.spec.alpha/def :portkey.aws.mediaconvert.-2017-08-29/integer-min-1-max-32 (clojure.spec.alpha/int-in 1 32))

(clojure.spec.alpha/def :portkey.aws.mediaconvert.-2017-08-29.dash-iso-group-settings/segment-length (clojure.spec.alpha/and :portkey.aws.mediaconvert.-2017-08-29/integer-min-1-max-2147483647))
(clojure.spec.alpha/def :portkey.aws.mediaconvert.-2017-08-29.dash-iso-group-settings/min-buffer-time (clojure.spec.alpha/and :portkey.aws.mediaconvert.-2017-08-29/integer-min-0-max-2147483647))
(clojure.spec.alpha/def :portkey.aws.mediaconvert.-2017-08-29.dash-iso-group-settings/write-segment-timeline-in-representation (clojure.spec.alpha/and :portkey.aws.mediaconvert.-2017-08-29/dash-iso-write-segment-timeline-in-representation))
(clojure.spec.alpha/def :portkey.aws.mediaconvert.-2017-08-29.dash-iso-group-settings/fragment-length (clojure.spec.alpha/and :portkey.aws.mediaconvert.-2017-08-29/integer-min-1-max-2147483647))
(clojure.spec.alpha/def :portkey.aws.mediaconvert.-2017-08-29.dash-iso-group-settings/hbbtv-compliance (clojure.spec.alpha/and :portkey.aws.mediaconvert.-2017-08-29/dash-iso-hbbtv-compliance))
(clojure.spec.alpha/def :portkey.aws.mediaconvert.-2017-08-29.dash-iso-group-settings/segment-control (clojure.spec.alpha/and :portkey.aws.mediaconvert.-2017-08-29/dash-iso-segment-control))
(clojure.spec.alpha/def :portkey.aws.mediaconvert.-2017-08-29.dash-iso-group-settings/base-url (clojure.spec.alpha/and :portkey.aws.mediaconvert.-2017-08-29/string))
(clojure.spec.alpha/def :portkey.aws.mediaconvert.-2017-08-29.dash-iso-group-settings/destination (clojure.spec.alpha/and :portkey.aws.mediaconvert.-2017-08-29/string-pattern-s-3))
(clojure.spec.alpha/def :portkey.aws.mediaconvert.-2017-08-29.dash-iso-group-settings/encryption (clojure.spec.alpha/and :portkey.aws.mediaconvert.-2017-08-29/dash-iso-encryption-settings))
(clojure.spec.alpha/def :portkey.aws.mediaconvert.-2017-08-29/dash-iso-group-settings (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.mediaconvert.-2017-08-29.dash-iso-group-settings/segment-length :portkey.aws.mediaconvert.-2017-08-29.dash-iso-group-settings/min-buffer-time :portkey.aws.mediaconvert.-2017-08-29.dash-iso-group-settings/write-segment-timeline-in-representation :portkey.aws.mediaconvert.-2017-08-29.dash-iso-group-settings/fragment-length :portkey.aws.mediaconvert.-2017-08-29.dash-iso-group-settings/hbbtv-compliance :portkey.aws.mediaconvert.-2017-08-29.dash-iso-group-settings/segment-control :portkey.aws.mediaconvert.-2017-08-29.dash-iso-group-settings/base-url :portkey.aws.mediaconvert.-2017-08-29.dash-iso-group-settings/destination :portkey.aws.mediaconvert.-2017-08-29.dash-iso-group-settings/encryption]))

(clojure.spec.alpha/def :portkey.aws.mediaconvert.-2017-08-29/ms-smooth-audio-deduplication #{:combine-duplicate-streams "NONE" "COMBINE_DUPLICATE_STREAMS" :none})

(clojure.spec.alpha/def :portkey.aws.mediaconvert.-2017-08-29.update-job-template-request/category (clojure.spec.alpha/and :portkey.aws.mediaconvert.-2017-08-29/string))
(clojure.spec.alpha/def :portkey.aws.mediaconvert.-2017-08-29.update-job-template-request/description (clojure.spec.alpha/and :portkey.aws.mediaconvert.-2017-08-29/string))
(clojure.spec.alpha/def :portkey.aws.mediaconvert.-2017-08-29.update-job-template-request/name (clojure.spec.alpha/and :portkey.aws.mediaconvert.-2017-08-29/string))
(clojure.spec.alpha/def :portkey.aws.mediaconvert.-2017-08-29.update-job-template-request/queue (clojure.spec.alpha/and :portkey.aws.mediaconvert.-2017-08-29/string))
(clojure.spec.alpha/def :portkey.aws.mediaconvert.-2017-08-29.update-job-template-request/settings (clojure.spec.alpha/and :portkey.aws.mediaconvert.-2017-08-29/job-template-settings))
(clojure.spec.alpha/def :portkey.aws.mediaconvert.-2017-08-29.update-job-template-request/status-update-interval-in-secs (clojure.spec.alpha/and :portkey.aws.mediaconvert.-2017-08-29/integer-min-10-max-600))
(clojure.spec.alpha/def :portkey.aws.mediaconvert.-2017-08-29/update-job-template-request (clojure.spec.alpha/keys :req-un [:portkey.aws.mediaconvert.-2017-08-29.update-job-template-request/name] :opt-un [:portkey.aws.mediaconvert.-2017-08-29/acceleration-settings :portkey.aws.mediaconvert.-2017-08-29.update-job-template-request/category :portkey.aws.mediaconvert.-2017-08-29.update-job-template-request/description :portkey.aws.mediaconvert.-2017-08-29.update-job-template-request/queue :portkey.aws.mediaconvert.-2017-08-29.update-job-template-request/settings :portkey.aws.mediaconvert.-2017-08-29.update-job-template-request/status-update-interval-in-secs]))

(clojure.spec.alpha/def :portkey.aws.mediaconvert.-2017-08-29/aac-specification #{:mpeg-2 :mpeg-4 "MPEG4" "MPEG2"})

(clojure.spec.alpha/def :portkey.aws.mediaconvert.-2017-08-29/eac-3-passthrough-control #{:when-possible "WHEN_POSSIBLE" "NO_PASSTHROUGH" :no-passthrough})

(clojure.spec.alpha/def :portkey.aws.mediaconvert.-2017-08-29.list-jobs-response/jobs (clojure.spec.alpha/and :portkey.aws.mediaconvert.-2017-08-29/list-of-job))
(clojure.spec.alpha/def :portkey.aws.mediaconvert.-2017-08-29.list-jobs-response/next-token (clojure.spec.alpha/and :portkey.aws.mediaconvert.-2017-08-29/string))
(clojure.spec.alpha/def :portkey.aws.mediaconvert.-2017-08-29/list-jobs-response (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.mediaconvert.-2017-08-29.list-jobs-response/jobs :portkey.aws.mediaconvert.-2017-08-29.list-jobs-response/next-token]))

(clojure.spec.alpha/def :portkey.aws.mediaconvert.-2017-08-29/string-pattern-a-za-z-0902 (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__1012854__auto__] (clojure.core/re-matches #"^[A-Za-z0-9+\/]+={0,2}$" s__1012854__auto__))))

(clojure.spec.alpha/def :portkey.aws.mediaconvert.-2017-08-29/integer-min-1-max-31 (clojure.spec.alpha/int-in 1 31))

(clojure.spec.alpha/def :portkey.aws.mediaconvert.-2017-08-29/motion-image-playback #{"ONCE" "REPEAT" :once :repeat})

(clojure.spec.alpha/def :portkey.aws.mediaconvert.-2017-08-29/string-min-14-pattern-s-3-bmp-bmp-png-png (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__1012852__auto__] (clojure.core/<= 14 (clojure.core/count s__1012852__auto__))) (clojure.core/fn [s__1012854__auto__] (clojure.core/re-matches #"^(s3:\/\/)(.*?)\.(bmp|BMP|png|PNG)$" s__1012854__auto__))))

(clojure.spec.alpha/def :portkey.aws.mediaconvert.-2017-08-29.audio-normalization-settings/algorithm (clojure.spec.alpha/and :portkey.aws.mediaconvert.-2017-08-29/audio-normalization-algorithm))
(clojure.spec.alpha/def :portkey.aws.mediaconvert.-2017-08-29.audio-normalization-settings/algorithm-control (clojure.spec.alpha/and :portkey.aws.mediaconvert.-2017-08-29/audio-normalization-algorithm-control))
(clojure.spec.alpha/def :portkey.aws.mediaconvert.-2017-08-29.audio-normalization-settings/correction-gate-level (clojure.spec.alpha/and :portkey.aws.mediaconvert.-2017-08-29/integer-min-negative-70-max-0))
(clojure.spec.alpha/def :portkey.aws.mediaconvert.-2017-08-29.audio-normalization-settings/loudness-logging (clojure.spec.alpha/and :portkey.aws.mediaconvert.-2017-08-29/audio-normalization-loudness-logging))
(clojure.spec.alpha/def :portkey.aws.mediaconvert.-2017-08-29.audio-normalization-settings/peak-calculation (clojure.spec.alpha/and :portkey.aws.mediaconvert.-2017-08-29/audio-normalization-peak-calculation))
(clojure.spec.alpha/def :portkey.aws.mediaconvert.-2017-08-29.audio-normalization-settings/target-lkfs (clojure.spec.alpha/and :portkey.aws.mediaconvert.-2017-08-29/double-min-negative-59-max-0))
(clojure.spec.alpha/def :portkey.aws.mediaconvert.-2017-08-29/audio-normalization-settings (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.mediaconvert.-2017-08-29.audio-normalization-settings/algorithm :portkey.aws.mediaconvert.-2017-08-29.audio-normalization-settings/algorithm-control :portkey.aws.mediaconvert.-2017-08-29.audio-normalization-settings/correction-gate-level :portkey.aws.mediaconvert.-2017-08-29.audio-normalization-settings/loudness-logging :portkey.aws.mediaconvert.-2017-08-29.audio-normalization-settings/peak-calculation :portkey.aws.mediaconvert.-2017-08-29.audio-normalization-settings/target-lkfs]))

(clojure.spec.alpha/def :portkey.aws.mediaconvert.-2017-08-29.delete-preset-request/name (clojure.spec.alpha/and :portkey.aws.mediaconvert.-2017-08-29/string))
(clojure.spec.alpha/def :portkey.aws.mediaconvert.-2017-08-29/delete-preset-request (clojure.spec.alpha/keys :req-un [:portkey.aws.mediaconvert.-2017-08-29.delete-preset-request/name] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.mediaconvert.-2017-08-29/billing-tags-source #{:queue "PRESET" "QUEUE" "JOB_TEMPLATE" :preset :job-template})

(clojure.spec.alpha/def :portkey.aws.mediaconvert.-2017-08-29.mpeg-2-settings/rate-control-mode (clojure.spec.alpha/and :portkey.aws.mediaconvert.-2017-08-29/mpeg-2-rate-control-mode))
(clojure.spec.alpha/def :portkey.aws.mediaconvert.-2017-08-29.mpeg-2-settings/interlace-mode (clojure.spec.alpha/and :portkey.aws.mediaconvert.-2017-08-29/mpeg-2-interlace-mode))
(clojure.spec.alpha/def :portkey.aws.mediaconvert.-2017-08-29.mpeg-2-settings/min-i-interval (clojure.spec.alpha/and :portkey.aws.mediaconvert.-2017-08-29/integer-min-0-max-30))
(clojure.spec.alpha/def :portkey.aws.mediaconvert.-2017-08-29.mpeg-2-settings/par-denominator (clojure.spec.alpha/and :portkey.aws.mediaconvert.-2017-08-29/integer-min-1-max-2147483647))
(clojure.spec.alpha/def :portkey.aws.mediaconvert.-2017-08-29.mpeg-2-settings/quality-tuning-level (clojure.spec.alpha/and :portkey.aws.mediaconvert.-2017-08-29/mpeg-2-quality-tuning-level))
(clojure.spec.alpha/def :portkey.aws.mediaconvert.-2017-08-29.mpeg-2-settings/adaptive-quantization (clojure.spec.alpha/and :portkey.aws.mediaconvert.-2017-08-29/mpeg-2-adaptive-quantization))
(clojure.spec.alpha/def :portkey.aws.mediaconvert.-2017-08-29.mpeg-2-settings/framerate-denominator (clojure.spec.alpha/and :portkey.aws.mediaconvert.-2017-08-29/integer-min-1-max-1001))
(clojure.spec.alpha/def :portkey.aws.mediaconvert.-2017-08-29.mpeg-2-settings/framerate-control (clojure.spec.alpha/and :portkey.aws.mediaconvert.-2017-08-29/mpeg-2-framerate-control))
(clojure.spec.alpha/def :portkey.aws.mediaconvert.-2017-08-29.mpeg-2-settings/hrd-buffer-size (clojure.spec.alpha/and :portkey.aws.mediaconvert.-2017-08-29/integer-min-0-max-47185920))
(clojure.spec.alpha/def :portkey.aws.mediaconvert.-2017-08-29.mpeg-2-settings/slow-pal (clojure.spec.alpha/and :portkey.aws.mediaconvert.-2017-08-29/mpeg-2-slow-pal))
(clojure.spec.alpha/def :portkey.aws.mediaconvert.-2017-08-29.mpeg-2-settings/dynamic-sub-gop (clojure.spec.alpha/and :portkey.aws.mediaconvert.-2017-08-29/mpeg-2-dynamic-sub-gop))
(clojure.spec.alpha/def :portkey.aws.mediaconvert.-2017-08-29.mpeg-2-settings/number-b-frames-between-reference-frames (clojure.spec.alpha/and :portkey.aws.mediaconvert.-2017-08-29/integer-min-0-max-7))
(clojure.spec.alpha/def :portkey.aws.mediaconvert.-2017-08-29.mpeg-2-settings/intra-dc-precision (clojure.spec.alpha/and :portkey.aws.mediaconvert.-2017-08-29/mpeg-2-intra-dc-precision))
(clojure.spec.alpha/def :portkey.aws.mediaconvert.-2017-08-29.mpeg-2-settings/syntax (clojure.spec.alpha/and :portkey.aws.mediaconvert.-2017-08-29/mpeg-2-syntax))
(clojure.spec.alpha/def :portkey.aws.mediaconvert.-2017-08-29.mpeg-2-settings/gop-closed-cadence (clojure.spec.alpha/and :portkey.aws.mediaconvert.-2017-08-29/integer-min-0-max-2147483647))
(clojure.spec.alpha/def :portkey.aws.mediaconvert.-2017-08-29.mpeg-2-settings/spatial-adaptive-quantization (clojure.spec.alpha/and :portkey.aws.mediaconvert.-2017-08-29/mpeg-2-spatial-adaptive-quantization))
(clojure.spec.alpha/def :portkey.aws.mediaconvert.-2017-08-29.mpeg-2-settings/framerate-numerator (clojure.spec.alpha/and :portkey.aws.mediaconvert.-2017-08-29/integer-min-24-max-60000))
(clojure.spec.alpha/def :portkey.aws.mediaconvert.-2017-08-29.mpeg-2-settings/softness (clojure.spec.alpha/and :portkey.aws.mediaconvert.-2017-08-29/integer-min-0-max-128))
(clojure.spec.alpha/def :portkey.aws.mediaconvert.-2017-08-29.mpeg-2-settings/gop-size-units (clojure.spec.alpha/and :portkey.aws.mediaconvert.-2017-08-29/mpeg-2-gop-size-units))
(clojure.spec.alpha/def :portkey.aws.mediaconvert.-2017-08-29.mpeg-2-settings/max-bitrate (clojure.spec.alpha/and :portkey.aws.mediaconvert.-2017-08-29/integer-min-1000-max-300000000))
(clojure.spec.alpha/def :portkey.aws.mediaconvert.-2017-08-29.mpeg-2-settings/codec-profile (clojure.spec.alpha/and :portkey.aws.mediaconvert.-2017-08-29/mpeg-2-codec-profile))
(clojure.spec.alpha/def :portkey.aws.mediaconvert.-2017-08-29.mpeg-2-settings/par-numerator (clojure.spec.alpha/and :portkey.aws.mediaconvert.-2017-08-29/integer-min-1-max-2147483647))
(clojure.spec.alpha/def :portkey.aws.mediaconvert.-2017-08-29.mpeg-2-settings/gop-size (clojure.spec.alpha/and :portkey.aws.mediaconvert.-2017-08-29/double-min-0))
(clojure.spec.alpha/def :portkey.aws.mediaconvert.-2017-08-29.mpeg-2-settings/par-control (clojure.spec.alpha/and :portkey.aws.mediaconvert.-2017-08-29/mpeg-2-par-control))
(clojure.spec.alpha/def :portkey.aws.mediaconvert.-2017-08-29.mpeg-2-settings/codec-level (clojure.spec.alpha/and :portkey.aws.mediaconvert.-2017-08-29/mpeg-2-codec-level))
(clojure.spec.alpha/def :portkey.aws.mediaconvert.-2017-08-29.mpeg-2-settings/telecine (clojure.spec.alpha/and :portkey.aws.mediaconvert.-2017-08-29/mpeg-2-telecine))
(clojure.spec.alpha/def :portkey.aws.mediaconvert.-2017-08-29.mpeg-2-settings/hrd-buffer-initial-fill-percentage (clojure.spec.alpha/and :portkey.aws.mediaconvert.-2017-08-29/integer-min-0-max-100))
(clojure.spec.alpha/def :portkey.aws.mediaconvert.-2017-08-29.mpeg-2-settings/temporal-adaptive-quantization (clojure.spec.alpha/and :portkey.aws.mediaconvert.-2017-08-29/mpeg-2-temporal-adaptive-quantization))
(clojure.spec.alpha/def :portkey.aws.mediaconvert.-2017-08-29.mpeg-2-settings/framerate-conversion-algorithm (clojure.spec.alpha/and :portkey.aws.mediaconvert.-2017-08-29/mpeg-2-framerate-conversion-algorithm))
(clojure.spec.alpha/def :portkey.aws.mediaconvert.-2017-08-29.mpeg-2-settings/scene-change-detect (clojure.spec.alpha/and :portkey.aws.mediaconvert.-2017-08-29/mpeg-2-scene-change-detect))
(clojure.spec.alpha/def :portkey.aws.mediaconvert.-2017-08-29.mpeg-2-settings/bitrate (clojure.spec.alpha/and :portkey.aws.mediaconvert.-2017-08-29/integer-min-1000-max-288000000))
(clojure.spec.alpha/def :portkey.aws.mediaconvert.-2017-08-29/mpeg-2-settings (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.mediaconvert.-2017-08-29.mpeg-2-settings/rate-control-mode :portkey.aws.mediaconvert.-2017-08-29.mpeg-2-settings/interlace-mode :portkey.aws.mediaconvert.-2017-08-29.mpeg-2-settings/min-i-interval :portkey.aws.mediaconvert.-2017-08-29.mpeg-2-settings/par-denominator :portkey.aws.mediaconvert.-2017-08-29.mpeg-2-settings/quality-tuning-level :portkey.aws.mediaconvert.-2017-08-29.mpeg-2-settings/adaptive-quantization :portkey.aws.mediaconvert.-2017-08-29.mpeg-2-settings/framerate-denominator :portkey.aws.mediaconvert.-2017-08-29.mpeg-2-settings/framerate-control :portkey.aws.mediaconvert.-2017-08-29.mpeg-2-settings/hrd-buffer-size :portkey.aws.mediaconvert.-2017-08-29.mpeg-2-settings/slow-pal :portkey.aws.mediaconvert.-2017-08-29.mpeg-2-settings/dynamic-sub-gop :portkey.aws.mediaconvert.-2017-08-29.mpeg-2-settings/number-b-frames-between-reference-frames :portkey.aws.mediaconvert.-2017-08-29.mpeg-2-settings/intra-dc-precision :portkey.aws.mediaconvert.-2017-08-29.mpeg-2-settings/syntax :portkey.aws.mediaconvert.-2017-08-29.mpeg-2-settings/gop-closed-cadence :portkey.aws.mediaconvert.-2017-08-29.mpeg-2-settings/spatial-adaptive-quantization :portkey.aws.mediaconvert.-2017-08-29.mpeg-2-settings/framerate-numerator :portkey.aws.mediaconvert.-2017-08-29.mpeg-2-settings/softness :portkey.aws.mediaconvert.-2017-08-29.mpeg-2-settings/gop-size-units :portkey.aws.mediaconvert.-2017-08-29.mpeg-2-settings/max-bitrate :portkey.aws.mediaconvert.-2017-08-29.mpeg-2-settings/codec-profile :portkey.aws.mediaconvert.-2017-08-29.mpeg-2-settings/par-numerator :portkey.aws.mediaconvert.-2017-08-29.mpeg-2-settings/gop-size :portkey.aws.mediaconvert.-2017-08-29.mpeg-2-settings/par-control :portkey.aws.mediaconvert.-2017-08-29.mpeg-2-settings/codec-level :portkey.aws.mediaconvert.-2017-08-29.mpeg-2-settings/telecine :portkey.aws.mediaconvert.-2017-08-29.mpeg-2-settings/hrd-buffer-initial-fill-percentage :portkey.aws.mediaconvert.-2017-08-29.mpeg-2-settings/temporal-adaptive-quantization :portkey.aws.mediaconvert.-2017-08-29.mpeg-2-settings/framerate-conversion-algorithm :portkey.aws.mediaconvert.-2017-08-29.mpeg-2-settings/scene-change-detect :portkey.aws.mediaconvert.-2017-08-29.mpeg-2-settings/bitrate]))

(clojure.spec.alpha/def :portkey.aws.mediaconvert.-2017-08-29.h-264-settings/rate-control-mode (clojure.spec.alpha/and :portkey.aws.mediaconvert.-2017-08-29/h-264-rate-control-mode))
(clojure.spec.alpha/def :portkey.aws.mediaconvert.-2017-08-29.h-264-settings/unregistered-sei-timecode (clojure.spec.alpha/and :portkey.aws.mediaconvert.-2017-08-29/h-264-unregistered-sei-timecode))
(clojure.spec.alpha/def :portkey.aws.mediaconvert.-2017-08-29.h-264-settings/interlace-mode (clojure.spec.alpha/and :portkey.aws.mediaconvert.-2017-08-29/h-264-interlace-mode))
(clojure.spec.alpha/def :portkey.aws.mediaconvert.-2017-08-29.h-264-settings/min-i-interval (clojure.spec.alpha/and :portkey.aws.mediaconvert.-2017-08-29/integer-min-0-max-30))
(clojure.spec.alpha/def :portkey.aws.mediaconvert.-2017-08-29.h-264-settings/par-denominator (clojure.spec.alpha/and :portkey.aws.mediaconvert.-2017-08-29/integer-min-1-max-2147483647))
(clojure.spec.alpha/def :portkey.aws.mediaconvert.-2017-08-29.h-264-settings/gop-b-reference (clojure.spec.alpha/and :portkey.aws.mediaconvert.-2017-08-29/h-264-gop-b-reference))
(clojure.spec.alpha/def :portkey.aws.mediaconvert.-2017-08-29.h-264-settings/number-reference-frames (clojure.spec.alpha/and :portkey.aws.mediaconvert.-2017-08-29/integer-min-1-max-6))
(clojure.spec.alpha/def :portkey.aws.mediaconvert.-2017-08-29.h-264-settings/quality-tuning-level (clojure.spec.alpha/and :portkey.aws.mediaconvert.-2017-08-29/h-264-quality-tuning-level))
(clojure.spec.alpha/def :portkey.aws.mediaconvert.-2017-08-29.h-264-settings/repeat-pps (clojure.spec.alpha/and :portkey.aws.mediaconvert.-2017-08-29/h-264-repeat-pps))
(clojure.spec.alpha/def :portkey.aws.mediaconvert.-2017-08-29.h-264-settings/adaptive-quantization (clojure.spec.alpha/and :portkey.aws.mediaconvert.-2017-08-29/h-264-adaptive-quantization))
(clojure.spec.alpha/def :portkey.aws.mediaconvert.-2017-08-29.h-264-settings/framerate-denominator (clojure.spec.alpha/and :portkey.aws.mediaconvert.-2017-08-29/integer-min-1-max-2147483647))
(clojure.spec.alpha/def :portkey.aws.mediaconvert.-2017-08-29.h-264-settings/framerate-control (clojure.spec.alpha/and :portkey.aws.mediaconvert.-2017-08-29/h-264-framerate-control))
(clojure.spec.alpha/def :portkey.aws.mediaconvert.-2017-08-29.h-264-settings/hrd-buffer-size (clojure.spec.alpha/and :portkey.aws.mediaconvert.-2017-08-29/integer-min-0-max-1152000000))
(clojure.spec.alpha/def :portkey.aws.mediaconvert.-2017-08-29.h-264-settings/slow-pal (clojure.spec.alpha/and :portkey.aws.mediaconvert.-2017-08-29/h-264-slow-pal))
(clojure.spec.alpha/def :portkey.aws.mediaconvert.-2017-08-29.h-264-settings/dynamic-sub-gop (clojure.spec.alpha/and :portkey.aws.mediaconvert.-2017-08-29/h-264-dynamic-sub-gop))
(clojure.spec.alpha/def :portkey.aws.mediaconvert.-2017-08-29.h-264-settings/number-b-frames-between-reference-frames (clojure.spec.alpha/and :portkey.aws.mediaconvert.-2017-08-29/integer-min-0-max-7))
(clojure.spec.alpha/def :portkey.aws.mediaconvert.-2017-08-29.h-264-settings/qvbr-settings (clojure.spec.alpha/and :portkey.aws.mediaconvert.-2017-08-29/h-264-qvbr-settings))
(clojure.spec.alpha/def :portkey.aws.mediaconvert.-2017-08-29.h-264-settings/field-encoding (clojure.spec.alpha/and :portkey.aws.mediaconvert.-2017-08-29/h-264-field-encoding))
(clojure.spec.alpha/def :portkey.aws.mediaconvert.-2017-08-29.h-264-settings/syntax (clojure.spec.alpha/and :portkey.aws.mediaconvert.-2017-08-29/h-264-syntax))
(clojure.spec.alpha/def :portkey.aws.mediaconvert.-2017-08-29.h-264-settings/gop-closed-cadence (clojure.spec.alpha/and :portkey.aws.mediaconvert.-2017-08-29/integer-min-0-max-2147483647))
(clojure.spec.alpha/def :portkey.aws.mediaconvert.-2017-08-29.h-264-settings/spatial-adaptive-quantization (clojure.spec.alpha/and :portkey.aws.mediaconvert.-2017-08-29/h-264-spatial-adaptive-quantization))
(clojure.spec.alpha/def :portkey.aws.mediaconvert.-2017-08-29.h-264-settings/framerate-numerator (clojure.spec.alpha/and :portkey.aws.mediaconvert.-2017-08-29/integer-min-1-max-2147483647))
(clojure.spec.alpha/def :portkey.aws.mediaconvert.-2017-08-29.h-264-settings/softness (clojure.spec.alpha/and :portkey.aws.mediaconvert.-2017-08-29/integer-min-0-max-128))
(clojure.spec.alpha/def :portkey.aws.mediaconvert.-2017-08-29.h-264-settings/gop-size-units (clojure.spec.alpha/and :portkey.aws.mediaconvert.-2017-08-29/h-264-gop-size-units))
(clojure.spec.alpha/def :portkey.aws.mediaconvert.-2017-08-29.h-264-settings/max-bitrate (clojure.spec.alpha/and :portkey.aws.mediaconvert.-2017-08-29/integer-min-1000-max-1152000000))
(clojure.spec.alpha/def :portkey.aws.mediaconvert.-2017-08-29.h-264-settings/codec-profile (clojure.spec.alpha/and :portkey.aws.mediaconvert.-2017-08-29/h-264-codec-profile))
(clojure.spec.alpha/def :portkey.aws.mediaconvert.-2017-08-29.h-264-settings/flicker-adaptive-quantization (clojure.spec.alpha/and :portkey.aws.mediaconvert.-2017-08-29/h-264-flicker-adaptive-quantization))
(clojure.spec.alpha/def :portkey.aws.mediaconvert.-2017-08-29.h-264-settings/par-numerator (clojure.spec.alpha/and :portkey.aws.mediaconvert.-2017-08-29/integer-min-1-max-2147483647))
(clojure.spec.alpha/def :portkey.aws.mediaconvert.-2017-08-29.h-264-settings/gop-size (clojure.spec.alpha/and :portkey.aws.mediaconvert.-2017-08-29/double-min-0))
(clojure.spec.alpha/def :portkey.aws.mediaconvert.-2017-08-29.h-264-settings/par-control (clojure.spec.alpha/and :portkey.aws.mediaconvert.-2017-08-29/h-264-par-control))
(clojure.spec.alpha/def :portkey.aws.mediaconvert.-2017-08-29.h-264-settings/codec-level (clojure.spec.alpha/and :portkey.aws.mediaconvert.-2017-08-29/h-264-codec-level))
(clojure.spec.alpha/def :portkey.aws.mediaconvert.-2017-08-29.h-264-settings/telecine (clojure.spec.alpha/and :portkey.aws.mediaconvert.-2017-08-29/h-264-telecine))
(clojure.spec.alpha/def :portkey.aws.mediaconvert.-2017-08-29.h-264-settings/hrd-buffer-initial-fill-percentage (clojure.spec.alpha/and :portkey.aws.mediaconvert.-2017-08-29/integer-min-0-max-100))
(clojure.spec.alpha/def :portkey.aws.mediaconvert.-2017-08-29.h-264-settings/slices (clojure.spec.alpha/and :portkey.aws.mediaconvert.-2017-08-29/integer-min-1-max-32))
(clojure.spec.alpha/def :portkey.aws.mediaconvert.-2017-08-29.h-264-settings/temporal-adaptive-quantization (clojure.spec.alpha/and :portkey.aws.mediaconvert.-2017-08-29/h-264-temporal-adaptive-quantization))
(clojure.spec.alpha/def :portkey.aws.mediaconvert.-2017-08-29.h-264-settings/framerate-conversion-algorithm (clojure.spec.alpha/and :portkey.aws.mediaconvert.-2017-08-29/h-264-framerate-conversion-algorithm))
(clojure.spec.alpha/def :portkey.aws.mediaconvert.-2017-08-29.h-264-settings/entropy-encoding (clojure.spec.alpha/and :portkey.aws.mediaconvert.-2017-08-29/h-264-entropy-encoding))
(clojure.spec.alpha/def :portkey.aws.mediaconvert.-2017-08-29.h-264-settings/scene-change-detect (clojure.spec.alpha/and :portkey.aws.mediaconvert.-2017-08-29/h-264-scene-change-detect))
(clojure.spec.alpha/def :portkey.aws.mediaconvert.-2017-08-29.h-264-settings/bitrate (clojure.spec.alpha/and :portkey.aws.mediaconvert.-2017-08-29/integer-min-1000-max-1152000000))
(clojure.spec.alpha/def :portkey.aws.mediaconvert.-2017-08-29/h-264-settings (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.mediaconvert.-2017-08-29.h-264-settings/rate-control-mode :portkey.aws.mediaconvert.-2017-08-29.h-264-settings/unregistered-sei-timecode :portkey.aws.mediaconvert.-2017-08-29.h-264-settings/interlace-mode :portkey.aws.mediaconvert.-2017-08-29.h-264-settings/min-i-interval :portkey.aws.mediaconvert.-2017-08-29.h-264-settings/par-denominator :portkey.aws.mediaconvert.-2017-08-29.h-264-settings/gop-b-reference :portkey.aws.mediaconvert.-2017-08-29.h-264-settings/number-reference-frames :portkey.aws.mediaconvert.-2017-08-29.h-264-settings/quality-tuning-level :portkey.aws.mediaconvert.-2017-08-29.h-264-settings/repeat-pps :portkey.aws.mediaconvert.-2017-08-29.h-264-settings/adaptive-quantization :portkey.aws.mediaconvert.-2017-08-29.h-264-settings/framerate-denominator :portkey.aws.mediaconvert.-2017-08-29.h-264-settings/framerate-control :portkey.aws.mediaconvert.-2017-08-29.h-264-settings/hrd-buffer-size :portkey.aws.mediaconvert.-2017-08-29.h-264-settings/slow-pal :portkey.aws.mediaconvert.-2017-08-29.h-264-settings/dynamic-sub-gop :portkey.aws.mediaconvert.-2017-08-29.h-264-settings/number-b-frames-between-reference-frames :portkey.aws.mediaconvert.-2017-08-29.h-264-settings/qvbr-settings :portkey.aws.mediaconvert.-2017-08-29.h-264-settings/field-encoding :portkey.aws.mediaconvert.-2017-08-29.h-264-settings/syntax :portkey.aws.mediaconvert.-2017-08-29.h-264-settings/gop-closed-cadence :portkey.aws.mediaconvert.-2017-08-29.h-264-settings/spatial-adaptive-quantization :portkey.aws.mediaconvert.-2017-08-29.h-264-settings/framerate-numerator :portkey.aws.mediaconvert.-2017-08-29.h-264-settings/softness :portkey.aws.mediaconvert.-2017-08-29.h-264-settings/gop-size-units :portkey.aws.mediaconvert.-2017-08-29.h-264-settings/max-bitrate :portkey.aws.mediaconvert.-2017-08-29.h-264-settings/codec-profile :portkey.aws.mediaconvert.-2017-08-29.h-264-settings/flicker-adaptive-quantization :portkey.aws.mediaconvert.-2017-08-29.h-264-settings/par-numerator :portkey.aws.mediaconvert.-2017-08-29.h-264-settings/gop-size :portkey.aws.mediaconvert.-2017-08-29.h-264-settings/par-control :portkey.aws.mediaconvert.-2017-08-29.h-264-settings/codec-level :portkey.aws.mediaconvert.-2017-08-29.h-264-settings/telecine :portkey.aws.mediaconvert.-2017-08-29.h-264-settings/hrd-buffer-initial-fill-percentage :portkey.aws.mediaconvert.-2017-08-29.h-264-settings/slices :portkey.aws.mediaconvert.-2017-08-29.h-264-settings/temporal-adaptive-quantization :portkey.aws.mediaconvert.-2017-08-29.h-264-settings/framerate-conversion-algorithm :portkey.aws.mediaconvert.-2017-08-29.h-264-settings/entropy-encoding :portkey.aws.mediaconvert.-2017-08-29.h-264-settings/scene-change-detect :portkey.aws.mediaconvert.-2017-08-29.h-264-settings/bitrate]))

(clojure.spec.alpha/def :portkey.aws.mediaconvert.-2017-08-29/integer-min-8000-max-96000 (clojure.spec.alpha/int-in 8000 96000))

(clojure.spec.alpha/def :portkey.aws.mediaconvert.-2017-08-29.exception-body/message (clojure.spec.alpha/and :portkey.aws.mediaconvert.-2017-08-29/string))
(clojure.spec.alpha/def :portkey.aws.mediaconvert.-2017-08-29/exception-body (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.mediaconvert.-2017-08-29.exception-body/message]))

(clojure.spec.alpha/def :portkey.aws.mediaconvert.-2017-08-29/hls-timed-metadata-id-3-frame #{"TDRL" "NONE" "PRIV" :priv :none :tdrl})

(clojure.spec.alpha/def :portkey.aws.mediaconvert.-2017-08-29.output-channel-mapping/input-channels (clojure.spec.alpha/and :portkey.aws.mediaconvert.-2017-08-29/list-of-integer-min-negative-60-max-6))
(clojure.spec.alpha/def :portkey.aws.mediaconvert.-2017-08-29/output-channel-mapping (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.mediaconvert.-2017-08-29.output-channel-mapping/input-channels]))

(clojure.spec.alpha/def :portkey.aws.mediaconvert.-2017-08-29/untag-resource-response (clojure.spec.alpha/keys :req-un [] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.mediaconvert.-2017-08-29/eac-3-phase-control #{:shift-90-degrees "SHIFT_90_DEGREES" "NO_SHIFT" :no-shift})

(clojure.spec.alpha/def :portkey.aws.mediaconvert.-2017-08-29/eac-3-surround-ex-mode #{"DISABLED" "NOT_INDICATED" :disabled :not-indicated "ENABLED" :enabled})

(clojure.spec.alpha/def :portkey.aws.mediaconvert.-2017-08-29/dash-iso-encryption-settings (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.mediaconvert.-2017-08-29/speke-key-provider]))

(clojure.spec.alpha/def :portkey.aws.mediaconvert.-2017-08-29/integer-min-1-max-8 (clojure.spec.alpha/int-in 1 8))

(clojure.spec.alpha/def :portkey.aws.mediaconvert.-2017-08-29/list-of-audio-description (clojure.spec.alpha/coll-of :portkey.aws.mediaconvert.-2017-08-29/audio-description))

(clojure.spec.alpha/def :portkey.aws.mediaconvert.-2017-08-29.file-group-settings/destination (clojure.spec.alpha/and :portkey.aws.mediaconvert.-2017-08-29/string-pattern-s-3))
(clojure.spec.alpha/def :portkey.aws.mediaconvert.-2017-08-29/file-group-settings (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.mediaconvert.-2017-08-29.file-group-settings/destination]))

(clojure.spec.alpha/def :portkey.aws.mediaconvert.-2017-08-29/integer-min-0-max-3 (clojure.spec.alpha/int-in 0 3))

(clojure.spec.alpha/def :portkey.aws.mediaconvert.-2017-08-29.m-3u-8-settings/pat-interval (clojure.spec.alpha/and :portkey.aws.mediaconvert.-2017-08-29/integer-min-0-max-1000))
(clojure.spec.alpha/def :portkey.aws.mediaconvert.-2017-08-29.m-3u-8-settings/scte-35-source (clojure.spec.alpha/and :portkey.aws.mediaconvert.-2017-08-29/m-3u-8-scte-35-source))
(clojure.spec.alpha/def :portkey.aws.mediaconvert.-2017-08-29.m-3u-8-settings/audio-frames-per-pes (clojure.spec.alpha/and :portkey.aws.mediaconvert.-2017-08-29/integer-min-0-max-2147483647))
(clojure.spec.alpha/def :portkey.aws.mediaconvert.-2017-08-29.m-3u-8-settings/transport-stream-id (clojure.spec.alpha/and :portkey.aws.mediaconvert.-2017-08-29/integer-min-0-max-65535))
(clojure.spec.alpha/def :portkey.aws.mediaconvert.-2017-08-29.m-3u-8-settings/pcr-control (clojure.spec.alpha/and :portkey.aws.mediaconvert.-2017-08-29/m-3u-8-pcr-control))
(clojure.spec.alpha/def :portkey.aws.mediaconvert.-2017-08-29.m-3u-8-settings/scte-35-pid (clojure.spec.alpha/and :portkey.aws.mediaconvert.-2017-08-29/integer-min-32-max-8182))
(clojure.spec.alpha/def :portkey.aws.mediaconvert.-2017-08-29.m-3u-8-settings/program-number (clojure.spec.alpha/and :portkey.aws.mediaconvert.-2017-08-29/integer-min-0-max-65535))
(clojure.spec.alpha/def :portkey.aws.mediaconvert.-2017-08-29.m-3u-8-settings/pcr-pid (clojure.spec.alpha/and :portkey.aws.mediaconvert.-2017-08-29/integer-min-32-max-8182))
(clojure.spec.alpha/def :portkey.aws.mediaconvert.-2017-08-29.m-3u-8-settings/pmt-pid (clojure.spec.alpha/and :portkey.aws.mediaconvert.-2017-08-29/integer-min-32-max-8182))
(clojure.spec.alpha/def :portkey.aws.mediaconvert.-2017-08-29.m-3u-8-settings/video-pid (clojure.spec.alpha/and :portkey.aws.mediaconvert.-2017-08-29/integer-min-32-max-8182))
(clojure.spec.alpha/def :portkey.aws.mediaconvert.-2017-08-29.m-3u-8-settings/audio-pids (clojure.spec.alpha/and :portkey.aws.mediaconvert.-2017-08-29/list-of-integer-min-32-max-8182))
(clojure.spec.alpha/def :portkey.aws.mediaconvert.-2017-08-29.m-3u-8-settings/nielsen-id-3 (clojure.spec.alpha/and :portkey.aws.mediaconvert.-2017-08-29/m-3u-8-nielsen-id-3))
(clojure.spec.alpha/def :portkey.aws.mediaconvert.-2017-08-29.m-3u-8-settings/pmt-interval (clojure.spec.alpha/and :portkey.aws.mediaconvert.-2017-08-29/integer-min-0-max-1000))
(clojure.spec.alpha/def :portkey.aws.mediaconvert.-2017-08-29.m-3u-8-settings/timed-metadata-pid (clojure.spec.alpha/and :portkey.aws.mediaconvert.-2017-08-29/integer-min-32-max-8182))
(clojure.spec.alpha/def :portkey.aws.mediaconvert.-2017-08-29.m-3u-8-settings/private-metadata-pid (clojure.spec.alpha/and :portkey.aws.mediaconvert.-2017-08-29/integer-min-32-max-8182))
(clojure.spec.alpha/def :portkey.aws.mediaconvert.-2017-08-29/m-3u-8-settings (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.mediaconvert.-2017-08-29.m-3u-8-settings/pat-interval :portkey.aws.mediaconvert.-2017-08-29.m-3u-8-settings/scte-35-source :portkey.aws.mediaconvert.-2017-08-29.m-3u-8-settings/audio-frames-per-pes :portkey.aws.mediaconvert.-2017-08-29.m-3u-8-settings/transport-stream-id :portkey.aws.mediaconvert.-2017-08-29.m-3u-8-settings/pcr-control :portkey.aws.mediaconvert.-2017-08-29.m-3u-8-settings/scte-35-pid :portkey.aws.mediaconvert.-2017-08-29.m-3u-8-settings/program-number :portkey.aws.mediaconvert.-2017-08-29.m-3u-8-settings/pcr-pid :portkey.aws.mediaconvert.-2017-08-29.m-3u-8-settings/pmt-pid :portkey.aws.mediaconvert.-2017-08-29.m-3u-8-settings/video-pid :portkey.aws.mediaconvert.-2017-08-29.m-3u-8-settings/audio-pids :portkey.aws.mediaconvert.-2017-08-29/timed-metadata :portkey.aws.mediaconvert.-2017-08-29.m-3u-8-settings/nielsen-id-3 :portkey.aws.mediaconvert.-2017-08-29.m-3u-8-settings/pmt-interval :portkey.aws.mediaconvert.-2017-08-29.m-3u-8-settings/timed-metadata-pid :portkey.aws.mediaconvert.-2017-08-29.m-3u-8-settings/private-metadata-pid]))

(clojure.spec.alpha/def :portkey.aws.mediaconvert.-2017-08-29/eac-3-stereo-downmix #{"NOT_INDICATED" :not-indicated "LO_RO" :lo-ro "LT_RT" :lt-rt "DPL2" :dpl-2})

(clojure.spec.alpha/def :portkey.aws.mediaconvert.-2017-08-29/mov-mpeg-2-four-cc-control #{:xdcam "XDCAM" :mpeg "MPEG"})

(clojure.spec.alpha/def :portkey.aws.mediaconvert.-2017-08-29/delete-preset-response (clojure.spec.alpha/keys :req-un [] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.mediaconvert.-2017-08-29.untag-resource-request/arn (clojure.spec.alpha/and :portkey.aws.mediaconvert.-2017-08-29/string))
(clojure.spec.alpha/def :portkey.aws.mediaconvert.-2017-08-29.untag-resource-request/tag-keys (clojure.spec.alpha/and :portkey.aws.mediaconvert.-2017-08-29/list-of-string))
(clojure.spec.alpha/def :portkey.aws.mediaconvert.-2017-08-29/untag-resource-request (clojure.spec.alpha/keys :req-un [:portkey.aws.mediaconvert.-2017-08-29.untag-resource-request/arn] :opt-un [:portkey.aws.mediaconvert.-2017-08-29.untag-resource-request/tag-keys]))

(clojure.spec.alpha/def :portkey.aws.mediaconvert.-2017-08-29.wav-settings/bit-depth (clojure.spec.alpha/and :portkey.aws.mediaconvert.-2017-08-29/integer-min-16-max-24))
(clojure.spec.alpha/def :portkey.aws.mediaconvert.-2017-08-29.wav-settings/channels (clojure.spec.alpha/and :portkey.aws.mediaconvert.-2017-08-29/integer-min-1-max-8))
(clojure.spec.alpha/def :portkey.aws.mediaconvert.-2017-08-29.wav-settings/format (clojure.spec.alpha/and :portkey.aws.mediaconvert.-2017-08-29/wav-format))
(clojure.spec.alpha/def :portkey.aws.mediaconvert.-2017-08-29.wav-settings/sample-rate (clojure.spec.alpha/and :portkey.aws.mediaconvert.-2017-08-29/integer-min-8000-max-192000))
(clojure.spec.alpha/def :portkey.aws.mediaconvert.-2017-08-29/wav-settings (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.mediaconvert.-2017-08-29.wav-settings/bit-depth :portkey.aws.mediaconvert.-2017-08-29.wav-settings/channels :portkey.aws.mediaconvert.-2017-08-29.wav-settings/format :portkey.aws.mediaconvert.-2017-08-29.wav-settings/sample-rate]))

(clojure.spec.alpha/def :portkey.aws.mediaconvert.-2017-08-29/integer-min-1-max-10000000 (clojure.spec.alpha/int-in 1 10000000))

(clojure.spec.alpha/def :portkey.aws.mediaconvert.-2017-08-29/integer-min-0-max-128 (clojure.spec.alpha/int-in 0 128))

(clojure.spec.alpha/def :portkey.aws.mediaconvert.-2017-08-29.f-4v-settings/moov-placement (clojure.spec.alpha/and :portkey.aws.mediaconvert.-2017-08-29/f-4v-moov-placement))
(clojure.spec.alpha/def :portkey.aws.mediaconvert.-2017-08-29/f-4v-settings (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.mediaconvert.-2017-08-29.f-4v-settings/moov-placement]))

(clojure.spec.alpha/def :portkey.aws.mediaconvert.-2017-08-29/h-264-syntax #{"RP2027" :default "DEFAULT" :rp-2027})

(clojure.spec.alpha/def :portkey.aws.mediaconvert.-2017-08-29.noise-reducer-filter-settings/strength (clojure.spec.alpha/and :portkey.aws.mediaconvert.-2017-08-29/integer-min-0-max-3))
(clojure.spec.alpha/def :portkey.aws.mediaconvert.-2017-08-29/noise-reducer-filter-settings (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.mediaconvert.-2017-08-29.noise-reducer-filter-settings/strength]))

(clojure.spec.alpha/def :portkey.aws.mediaconvert.-2017-08-29/list-of-input-clipping (clojure.spec.alpha/coll-of :portkey.aws.mediaconvert.-2017-08-29/input-clipping))

(clojure.spec.alpha/def :portkey.aws.mediaconvert.-2017-08-29.prores-settings/interlace-mode (clojure.spec.alpha/and :portkey.aws.mediaconvert.-2017-08-29/prores-interlace-mode))
(clojure.spec.alpha/def :portkey.aws.mediaconvert.-2017-08-29.prores-settings/par-denominator (clojure.spec.alpha/and :portkey.aws.mediaconvert.-2017-08-29/integer-min-1-max-2147483647))
(clojure.spec.alpha/def :portkey.aws.mediaconvert.-2017-08-29.prores-settings/framerate-denominator (clojure.spec.alpha/and :portkey.aws.mediaconvert.-2017-08-29/integer-min-1-max-2147483647))
(clojure.spec.alpha/def :portkey.aws.mediaconvert.-2017-08-29.prores-settings/framerate-control (clojure.spec.alpha/and :portkey.aws.mediaconvert.-2017-08-29/prores-framerate-control))
(clojure.spec.alpha/def :portkey.aws.mediaconvert.-2017-08-29.prores-settings/slow-pal (clojure.spec.alpha/and :portkey.aws.mediaconvert.-2017-08-29/prores-slow-pal))
(clojure.spec.alpha/def :portkey.aws.mediaconvert.-2017-08-29.prores-settings/framerate-numerator (clojure.spec.alpha/and :portkey.aws.mediaconvert.-2017-08-29/integer-min-1-max-2147483647))
(clojure.spec.alpha/def :portkey.aws.mediaconvert.-2017-08-29.prores-settings/codec-profile (clojure.spec.alpha/and :portkey.aws.mediaconvert.-2017-08-29/prores-codec-profile))
(clojure.spec.alpha/def :portkey.aws.mediaconvert.-2017-08-29.prores-settings/par-numerator (clojure.spec.alpha/and :portkey.aws.mediaconvert.-2017-08-29/integer-min-1-max-2147483647))
(clojure.spec.alpha/def :portkey.aws.mediaconvert.-2017-08-29.prores-settings/par-control (clojure.spec.alpha/and :portkey.aws.mediaconvert.-2017-08-29/prores-par-control))
(clojure.spec.alpha/def :portkey.aws.mediaconvert.-2017-08-29.prores-settings/telecine (clojure.spec.alpha/and :portkey.aws.mediaconvert.-2017-08-29/prores-telecine))
(clojure.spec.alpha/def :portkey.aws.mediaconvert.-2017-08-29.prores-settings/framerate-conversion-algorithm (clojure.spec.alpha/and :portkey.aws.mediaconvert.-2017-08-29/prores-framerate-conversion-algorithm))
(clojure.spec.alpha/def :portkey.aws.mediaconvert.-2017-08-29/prores-settings (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.mediaconvert.-2017-08-29.prores-settings/interlace-mode :portkey.aws.mediaconvert.-2017-08-29.prores-settings/par-denominator :portkey.aws.mediaconvert.-2017-08-29.prores-settings/framerate-denominator :portkey.aws.mediaconvert.-2017-08-29.prores-settings/framerate-control :portkey.aws.mediaconvert.-2017-08-29.prores-settings/slow-pal :portkey.aws.mediaconvert.-2017-08-29.prores-settings/framerate-numerator :portkey.aws.mediaconvert.-2017-08-29.prores-settings/codec-profile :portkey.aws.mediaconvert.-2017-08-29.prores-settings/par-numerator :portkey.aws.mediaconvert.-2017-08-29.prores-settings/par-control :portkey.aws.mediaconvert.-2017-08-29.prores-settings/telecine :portkey.aws.mediaconvert.-2017-08-29.prores-settings/framerate-conversion-algorithm]))

(clojure.spec.alpha/def :portkey.aws.mediaconvert.-2017-08-29/map-of-string (clojure.spec.alpha/map-of :portkey.aws.mediaconvert.-2017-08-29/string :portkey.aws.mediaconvert.-2017-08-29/string))

(clojure.spec.alpha/def :portkey.aws.mediaconvert.-2017-08-29/queue-status #{:paused :active "ACTIVE" "PAUSED"})

(clojure.spec.alpha/def :portkey.aws.mediaconvert.-2017-08-29/list-of-string-pattern-s-3-assetmap-xml (clojure.spec.alpha/coll-of :portkey.aws.mediaconvert.-2017-08-29/string-pattern-s-3-assetmap-xml))

(clojure.spec.alpha/def :portkey.aws.mediaconvert.-2017-08-29/list-of-input-template (clojure.spec.alpha/coll-of :portkey.aws.mediaconvert.-2017-08-29/input-template))

(clojure.spec.alpha/def :portkey.aws.mediaconvert.-2017-08-29/string-pattern-09a-faf-809a-faf-409a-faf-409a-faf-409a-faf-12 (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__1012854__auto__] (clojure.core/re-matches #"^[0-9a-fA-F]{8}-[0-9a-fA-F]{4}-[0-9a-fA-F]{4}-[0-9a-fA-F]{4}-[0-9a-fA-F]{12}$" s__1012854__auto__))))

(clojure.spec.alpha/def :portkey.aws.mediaconvert.-2017-08-29/h-265-interlace-mode #{:follow-top-field :follow-bottom-field "BOTTOM_FIELD" "FOLLOW_TOP_FIELD" "PROGRESSIVE" "FOLLOW_BOTTOM_FIELD" :bottom-field :progressive :top-field "TOP_FIELD"})

(clojure.spec.alpha/def :portkey.aws.mediaconvert.-2017-08-29/hls-codec-specification #{:rfc-6381 :rfc-4281 "RFC_4281" "RFC_6381"})

(clojure.spec.alpha/def :portkey.aws.mediaconvert.-2017-08-29/color-space-conversion #{:force-709 :force-hlg-2020 "FORCE_709" "FORCE_601" "NONE" :force-601 "FORCE_HDR10" "FORCE_HLG_2020" :force-hdr-10 :none})

(clojure.spec.alpha/def :portkey.aws.mediaconvert.-2017-08-29/h-264-codec-level #{:level-2-1 :level-5-1 :level-3 "LEVEL_2_1" "LEVEL_1_3" "LEVEL_5" "LEVEL_1" "LEVEL_3_2" :level-4 "AUTO" :level-1-3 "LEVEL_4_1" :level-2-2 "LEVEL_5_1" "LEVEL_5_2" "LEVEL_4" :level-1 :level-4-1 "LEVEL_2" :level-1-1 "LEVEL_3" :level-3-1 :level-1-2 "LEVEL_1_1" :level-3-2 :level-4-2 "LEVEL_4_2" "LEVEL_3_1" :auto :level-5 :level-5-2 "LEVEL_2_2" "LEVEL_1_2" :level-2})

(clojure.spec.alpha/def :portkey.aws.mediaconvert.-2017-08-29.avail-blanking/avail-blanking-image (clojure.spec.alpha/and :portkey.aws.mediaconvert.-2017-08-29/string-min-14-pattern-s-3-bmp-bmp-png-png))
(clojure.spec.alpha/def :portkey.aws.mediaconvert.-2017-08-29/avail-blanking (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.mediaconvert.-2017-08-29.avail-blanking/avail-blanking-image]))

(clojure.spec.alpha/def :portkey.aws.mediaconvert.-2017-08-29/string-pattern (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__1012854__auto__] (clojure.core/re-matches #"^[ -~]+$" s__1012854__auto__))))

(clojure.spec.alpha/def :portkey.aws.mediaconvert.-2017-08-29.audio-selector/pids (clojure.spec.alpha/and :portkey.aws.mediaconvert.-2017-08-29/list-of-integer-min-1-max-2147483647))
(clojure.spec.alpha/def :portkey.aws.mediaconvert.-2017-08-29.audio-selector/custom-language-code (clojure.spec.alpha/and :portkey.aws.mediaconvert.-2017-08-29/string-min-3-max-3-pattern-a-za-z-3))
(clojure.spec.alpha/def :portkey.aws.mediaconvert.-2017-08-29.audio-selector/offset (clojure.spec.alpha/and :portkey.aws.mediaconvert.-2017-08-29/integer-min-negative-2147483648-max-2147483647))
(clojure.spec.alpha/def :portkey.aws.mediaconvert.-2017-08-29.audio-selector/default-selection (clojure.spec.alpha/and :portkey.aws.mediaconvert.-2017-08-29/audio-default-selection))
(clojure.spec.alpha/def :portkey.aws.mediaconvert.-2017-08-29.audio-selector/tracks (clojure.spec.alpha/and :portkey.aws.mediaconvert.-2017-08-29/list-of-integer-min-1-max-2147483647))
(clojure.spec.alpha/def :portkey.aws.mediaconvert.-2017-08-29.audio-selector/external-audio-file-input (clojure.spec.alpha/and :portkey.aws.mediaconvert.-2017-08-29/string-pattern-s-3-mm-2-vvmmppeeggaavviimmpp-4-ffllvvmmppttmmppggmm-4-vvttrrppff-4-vvmm-2-ttssttss-264-hh-264-mmkkvvmmoovvmmttssmm-2-ttwwmmvvaassffvvoobb-3-ggpp-3-ggppppmmxxffddiivvxxxxvviiddrraawwddvvggxxffmm-1-vv-3-gg-2-vvmmffmm-3-uu-8-llcchhggxxffmmppeegg-2-mmxxffmmppeegg-2-mmxxffhhddwwaavvyy-4-mmaaaaccaaiiffffmmpp-2-aacc-3-eecc-3-ddttssee))
(clojure.spec.alpha/def :portkey.aws.mediaconvert.-2017-08-29.audio-selector/program-selection (clojure.spec.alpha/and :portkey.aws.mediaconvert.-2017-08-29/integer-min-0-max-8))
(clojure.spec.alpha/def :portkey.aws.mediaconvert.-2017-08-29.audio-selector/selector-type (clojure.spec.alpha/and :portkey.aws.mediaconvert.-2017-08-29/audio-selector-type))
(clojure.spec.alpha/def :portkey.aws.mediaconvert.-2017-08-29/audio-selector (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.mediaconvert.-2017-08-29.audio-selector/pids :portkey.aws.mediaconvert.-2017-08-29.audio-selector/custom-language-code :portkey.aws.mediaconvert.-2017-08-29/remix-settings :portkey.aws.mediaconvert.-2017-08-29.audio-selector/offset :portkey.aws.mediaconvert.-2017-08-29.audio-selector/default-selection :portkey.aws.mediaconvert.-2017-08-29.audio-selector/tracks :portkey.aws.mediaconvert.-2017-08-29/language-code :portkey.aws.mediaconvert.-2017-08-29.audio-selector/external-audio-file-input :portkey.aws.mediaconvert.-2017-08-29.audio-selector/program-selection :portkey.aws.mediaconvert.-2017-08-29.audio-selector/selector-type]))

(clojure.spec.alpha/def :portkey.aws.mediaconvert.-2017-08-29/map-of-caption-selector (clojure.spec.alpha/map-of :portkey.aws.mediaconvert.-2017-08-29/string :portkey.aws.mediaconvert.-2017-08-29/caption-selector))

(clojure.spec.alpha/def :portkey.aws.mediaconvert.-2017-08-29/integer-min-1-max-16 (clojure.spec.alpha/int-in 1 16))

(clojure.spec.alpha/def :portkey.aws.mediaconvert.-2017-08-29/integer-min-0-max-1466400000 (clojure.spec.alpha/int-in 0 1466400000))

(clojure.spec.alpha/def :portkey.aws.mediaconvert.-2017-08-29/disassociate-certificate-response (clojure.spec.alpha/keys :req-un [] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.mediaconvert.-2017-08-29/audio-default-selection #{:default "NOT_DEFAULT" "DEFAULT" :not-default})

(clojure.core/defn tag-resource ([tag-resource-requestinput] (clojure.core/let [request-function-result__1013884__auto__ (req-tag-resource-request tag-resource-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__1013884__auto__ {:http.request.configuration/endpoints portkey.aws.mediaconvert.-2017-08-29/endpoints, :http.request.configuration/target-prefix nil, :http.request.spec/output-spec :portkey.aws.mediaconvert.-2017-08-29/tag-resource-response, :http.request.configuration/mime-type {"content-type" "application/json"}, :http.request.configuration/request-uri "/2017-08-29/tags", :http.request.configuration/version "2017-08-29", :http.request.configuration/service-id "MediaConvert", :http.request.spec/input-spec :portkey.aws.mediaconvert.-2017-08-29/tag-resource-request, :http.request.configuration/protocol "rest-json", :http.request.configuration/method :post, :http.request.configuration/response-code 200, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "TagResource", :http.request.configuration/output-deser-fn response-tag-resource-response, :http.request.spec/error-spec {"BadRequestException" :portkey.aws.mediaconvert.-2017-08-29/bad-request-exception, "InternalServerErrorException" :portkey.aws.mediaconvert.-2017-08-29/internal-server-error-exception, "ForbiddenException" :portkey.aws.mediaconvert.-2017-08-29/forbidden-exception, "NotFoundException" :portkey.aws.mediaconvert.-2017-08-29/not-found-exception, "TooManyRequestsException" :portkey.aws.mediaconvert.-2017-08-29/too-many-requests-exception, "ConflictException" :portkey.aws.mediaconvert.-2017-08-29/conflict-exception}})))))
(clojure.spec.alpha/fdef tag-resource :args (clojure.spec.alpha/tuple :portkey.aws.mediaconvert.-2017-08-29/tag-resource-request) :ret (clojure.spec.alpha/and :portkey.aws.mediaconvert.-2017-08-29/tag-resource-response))

(clojure.core/defn list-queues ([] (list-queues {})) ([list-queues-requestinput] (clojure.core/let [request-function-result__1013884__auto__ (req-list-queues-request list-queues-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__1013884__auto__ {:http.request.configuration/endpoints portkey.aws.mediaconvert.-2017-08-29/endpoints, :http.request.configuration/target-prefix nil, :http.request.spec/output-spec :portkey.aws.mediaconvert.-2017-08-29/list-queues-response, :http.request.configuration/mime-type {"content-type" "application/json"}, :http.request.configuration/request-uri "/2017-08-29/queues", :http.request.configuration/version "2017-08-29", :http.request.configuration/service-id "MediaConvert", :http.request.spec/input-spec :portkey.aws.mediaconvert.-2017-08-29/list-queues-request, :http.request.configuration/protocol "rest-json", :http.request.configuration/method :get, :http.request.configuration/response-code 200, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "ListQueues", :http.request.configuration/output-deser-fn response-list-queues-response, :http.request.spec/error-spec {"BadRequestException" :portkey.aws.mediaconvert.-2017-08-29/bad-request-exception, "InternalServerErrorException" :portkey.aws.mediaconvert.-2017-08-29/internal-server-error-exception, "ForbiddenException" :portkey.aws.mediaconvert.-2017-08-29/forbidden-exception, "NotFoundException" :portkey.aws.mediaconvert.-2017-08-29/not-found-exception, "TooManyRequestsException" :portkey.aws.mediaconvert.-2017-08-29/too-many-requests-exception, "ConflictException" :portkey.aws.mediaconvert.-2017-08-29/conflict-exception}})))))
(clojure.spec.alpha/fdef list-queues :args (clojure.spec.alpha/? :portkey.aws.mediaconvert.-2017-08-29/list-queues-request) :ret (clojure.spec.alpha/and :portkey.aws.mediaconvert.-2017-08-29/list-queues-response))

(clojure.core/defn delete-job-template ([delete-job-template-requestinput] (clojure.core/let [request-function-result__1013884__auto__ (req-delete-job-template-request delete-job-template-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__1013884__auto__ {:http.request.configuration/endpoints portkey.aws.mediaconvert.-2017-08-29/endpoints, :http.request.configuration/target-prefix nil, :http.request.spec/output-spec :portkey.aws.mediaconvert.-2017-08-29/delete-job-template-response, :http.request.configuration/mime-type {"content-type" "application/json"}, :http.request.configuration/request-uri "/2017-08-29/jobTemplates/{name}", :http.request.configuration/version "2017-08-29", :http.request.configuration/service-id "MediaConvert", :http.request.spec/input-spec :portkey.aws.mediaconvert.-2017-08-29/delete-job-template-request, :http.request.configuration/protocol "rest-json", :http.request.configuration/method :delete, :http.request.configuration/response-code 202, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "DeleteJobTemplate", :http.request.configuration/output-deser-fn response-delete-job-template-response, :http.request.spec/error-spec {"BadRequestException" :portkey.aws.mediaconvert.-2017-08-29/bad-request-exception, "InternalServerErrorException" :portkey.aws.mediaconvert.-2017-08-29/internal-server-error-exception, "ForbiddenException" :portkey.aws.mediaconvert.-2017-08-29/forbidden-exception, "NotFoundException" :portkey.aws.mediaconvert.-2017-08-29/not-found-exception, "TooManyRequestsException" :portkey.aws.mediaconvert.-2017-08-29/too-many-requests-exception, "ConflictException" :portkey.aws.mediaconvert.-2017-08-29/conflict-exception}})))))
(clojure.spec.alpha/fdef delete-job-template :args (clojure.spec.alpha/tuple :portkey.aws.mediaconvert.-2017-08-29/delete-job-template-request) :ret (clojure.spec.alpha/and :portkey.aws.mediaconvert.-2017-08-29/delete-job-template-response))

(clojure.core/defn describe-endpoints ([] (describe-endpoints {})) ([describe-endpoints-requestinput] (clojure.core/let [request-function-result__1013884__auto__ (req-describe-endpoints-request describe-endpoints-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__1013884__auto__ {:http.request.configuration/endpoints portkey.aws.mediaconvert.-2017-08-29/endpoints, :http.request.configuration/target-prefix nil, :http.request.spec/output-spec :portkey.aws.mediaconvert.-2017-08-29/describe-endpoints-response, :http.request.configuration/mime-type {"content-type" "application/json"}, :http.request.configuration/request-uri "/2017-08-29/endpoints", :http.request.configuration/version "2017-08-29", :http.request.configuration/service-id "MediaConvert", :http.request.spec/input-spec :portkey.aws.mediaconvert.-2017-08-29/describe-endpoints-request, :http.request.configuration/protocol "rest-json", :http.request.configuration/method :post, :http.request.configuration/response-code 200, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "DescribeEndpoints", :http.request.configuration/output-deser-fn response-describe-endpoints-response, :http.request.spec/error-spec {"BadRequestException" :portkey.aws.mediaconvert.-2017-08-29/bad-request-exception, "InternalServerErrorException" :portkey.aws.mediaconvert.-2017-08-29/internal-server-error-exception, "ForbiddenException" :portkey.aws.mediaconvert.-2017-08-29/forbidden-exception, "NotFoundException" :portkey.aws.mediaconvert.-2017-08-29/not-found-exception, "TooManyRequestsException" :portkey.aws.mediaconvert.-2017-08-29/too-many-requests-exception, "ConflictException" :portkey.aws.mediaconvert.-2017-08-29/conflict-exception}})))))
(clojure.spec.alpha/fdef describe-endpoints :args (clojure.spec.alpha/? :portkey.aws.mediaconvert.-2017-08-29/describe-endpoints-request) :ret (clojure.spec.alpha/and :portkey.aws.mediaconvert.-2017-08-29/describe-endpoints-response))

(clojure.core/defn update-preset ([update-preset-requestinput] (clojure.core/let [request-function-result__1013884__auto__ (req-update-preset-request update-preset-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__1013884__auto__ {:http.request.configuration/endpoints portkey.aws.mediaconvert.-2017-08-29/endpoints, :http.request.configuration/target-prefix nil, :http.request.spec/output-spec :portkey.aws.mediaconvert.-2017-08-29/update-preset-response, :http.request.configuration/mime-type {"content-type" "application/json"}, :http.request.configuration/request-uri "/2017-08-29/presets/{name}", :http.request.configuration/version "2017-08-29", :http.request.configuration/service-id "MediaConvert", :http.request.spec/input-spec :portkey.aws.mediaconvert.-2017-08-29/update-preset-request, :http.request.configuration/protocol "rest-json", :http.request.configuration/method :put, :http.request.configuration/response-code 200, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "UpdatePreset", :http.request.configuration/output-deser-fn response-update-preset-response, :http.request.spec/error-spec {"BadRequestException" :portkey.aws.mediaconvert.-2017-08-29/bad-request-exception, "InternalServerErrorException" :portkey.aws.mediaconvert.-2017-08-29/internal-server-error-exception, "ForbiddenException" :portkey.aws.mediaconvert.-2017-08-29/forbidden-exception, "NotFoundException" :portkey.aws.mediaconvert.-2017-08-29/not-found-exception, "TooManyRequestsException" :portkey.aws.mediaconvert.-2017-08-29/too-many-requests-exception, "ConflictException" :portkey.aws.mediaconvert.-2017-08-29/conflict-exception}})))))
(clojure.spec.alpha/fdef update-preset :args (clojure.spec.alpha/tuple :portkey.aws.mediaconvert.-2017-08-29/update-preset-request) :ret (clojure.spec.alpha/and :portkey.aws.mediaconvert.-2017-08-29/update-preset-response))

(clojure.core/defn delete-queue ([delete-queue-requestinput] (clojure.core/let [request-function-result__1013884__auto__ (req-delete-queue-request delete-queue-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__1013884__auto__ {:http.request.configuration/endpoints portkey.aws.mediaconvert.-2017-08-29/endpoints, :http.request.configuration/target-prefix nil, :http.request.spec/output-spec :portkey.aws.mediaconvert.-2017-08-29/delete-queue-response, :http.request.configuration/mime-type {"content-type" "application/json"}, :http.request.configuration/request-uri "/2017-08-29/queues/{name}", :http.request.configuration/version "2017-08-29", :http.request.configuration/service-id "MediaConvert", :http.request.spec/input-spec :portkey.aws.mediaconvert.-2017-08-29/delete-queue-request, :http.request.configuration/protocol "rest-json", :http.request.configuration/method :delete, :http.request.configuration/response-code 202, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "DeleteQueue", :http.request.configuration/output-deser-fn response-delete-queue-response, :http.request.spec/error-spec {"BadRequestException" :portkey.aws.mediaconvert.-2017-08-29/bad-request-exception, "InternalServerErrorException" :portkey.aws.mediaconvert.-2017-08-29/internal-server-error-exception, "ForbiddenException" :portkey.aws.mediaconvert.-2017-08-29/forbidden-exception, "NotFoundException" :portkey.aws.mediaconvert.-2017-08-29/not-found-exception, "TooManyRequestsException" :portkey.aws.mediaconvert.-2017-08-29/too-many-requests-exception, "ConflictException" :portkey.aws.mediaconvert.-2017-08-29/conflict-exception}})))))
(clojure.spec.alpha/fdef delete-queue :args (clojure.spec.alpha/tuple :portkey.aws.mediaconvert.-2017-08-29/delete-queue-request) :ret (clojure.spec.alpha/and :portkey.aws.mediaconvert.-2017-08-29/delete-queue-response))

(clojure.core/defn get-job-template ([get-job-template-requestinput] (clojure.core/let [request-function-result__1013884__auto__ (req-get-job-template-request get-job-template-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__1013884__auto__ {:http.request.configuration/endpoints portkey.aws.mediaconvert.-2017-08-29/endpoints, :http.request.configuration/target-prefix nil, :http.request.spec/output-spec :portkey.aws.mediaconvert.-2017-08-29/get-job-template-response, :http.request.configuration/mime-type {"content-type" "application/json"}, :http.request.configuration/request-uri "/2017-08-29/jobTemplates/{name}", :http.request.configuration/version "2017-08-29", :http.request.configuration/service-id "MediaConvert", :http.request.spec/input-spec :portkey.aws.mediaconvert.-2017-08-29/get-job-template-request, :http.request.configuration/protocol "rest-json", :http.request.configuration/method :get, :http.request.configuration/response-code 200, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "GetJobTemplate", :http.request.configuration/output-deser-fn response-get-job-template-response, :http.request.spec/error-spec {"BadRequestException" :portkey.aws.mediaconvert.-2017-08-29/bad-request-exception, "InternalServerErrorException" :portkey.aws.mediaconvert.-2017-08-29/internal-server-error-exception, "ForbiddenException" :portkey.aws.mediaconvert.-2017-08-29/forbidden-exception, "NotFoundException" :portkey.aws.mediaconvert.-2017-08-29/not-found-exception, "TooManyRequestsException" :portkey.aws.mediaconvert.-2017-08-29/too-many-requests-exception, "ConflictException" :portkey.aws.mediaconvert.-2017-08-29/conflict-exception}})))))
(clojure.spec.alpha/fdef get-job-template :args (clojure.spec.alpha/tuple :portkey.aws.mediaconvert.-2017-08-29/get-job-template-request) :ret (clojure.spec.alpha/and :portkey.aws.mediaconvert.-2017-08-29/get-job-template-response))

(clojure.core/defn list-tags-for-resource ([list-tags-for-resource-requestinput] (clojure.core/let [request-function-result__1013884__auto__ (req-list-tags-for-resource-request list-tags-for-resource-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__1013884__auto__ {:http.request.configuration/endpoints portkey.aws.mediaconvert.-2017-08-29/endpoints, :http.request.configuration/target-prefix nil, :http.request.spec/output-spec :portkey.aws.mediaconvert.-2017-08-29/list-tags-for-resource-response, :http.request.configuration/mime-type {"content-type" "application/json"}, :http.request.configuration/request-uri "/2017-08-29/tags/{arn}", :http.request.configuration/version "2017-08-29", :http.request.configuration/service-id "MediaConvert", :http.request.spec/input-spec :portkey.aws.mediaconvert.-2017-08-29/list-tags-for-resource-request, :http.request.configuration/protocol "rest-json", :http.request.configuration/method :get, :http.request.configuration/response-code 200, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "ListTagsForResource", :http.request.configuration/output-deser-fn response-list-tags-for-resource-response, :http.request.spec/error-spec {"BadRequestException" :portkey.aws.mediaconvert.-2017-08-29/bad-request-exception, "InternalServerErrorException" :portkey.aws.mediaconvert.-2017-08-29/internal-server-error-exception, "ForbiddenException" :portkey.aws.mediaconvert.-2017-08-29/forbidden-exception, "NotFoundException" :portkey.aws.mediaconvert.-2017-08-29/not-found-exception, "TooManyRequestsException" :portkey.aws.mediaconvert.-2017-08-29/too-many-requests-exception, "ConflictException" :portkey.aws.mediaconvert.-2017-08-29/conflict-exception}})))))
(clojure.spec.alpha/fdef list-tags-for-resource :args (clojure.spec.alpha/tuple :portkey.aws.mediaconvert.-2017-08-29/list-tags-for-resource-request) :ret (clojure.spec.alpha/and :portkey.aws.mediaconvert.-2017-08-29/list-tags-for-resource-response))

(clojure.core/defn create-job-template ([create-job-template-requestinput] (clojure.core/let [request-function-result__1013884__auto__ (req-create-job-template-request create-job-template-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__1013884__auto__ {:http.request.configuration/endpoints portkey.aws.mediaconvert.-2017-08-29/endpoints, :http.request.configuration/target-prefix nil, :http.request.spec/output-spec :portkey.aws.mediaconvert.-2017-08-29/create-job-template-response, :http.request.configuration/mime-type {"content-type" "application/json"}, :http.request.configuration/request-uri "/2017-08-29/jobTemplates", :http.request.configuration/version "2017-08-29", :http.request.configuration/service-id "MediaConvert", :http.request.spec/input-spec :portkey.aws.mediaconvert.-2017-08-29/create-job-template-request, :http.request.configuration/protocol "rest-json", :http.request.configuration/method :post, :http.request.configuration/response-code 201, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "CreateJobTemplate", :http.request.configuration/output-deser-fn response-create-job-template-response, :http.request.spec/error-spec {"BadRequestException" :portkey.aws.mediaconvert.-2017-08-29/bad-request-exception, "InternalServerErrorException" :portkey.aws.mediaconvert.-2017-08-29/internal-server-error-exception, "ForbiddenException" :portkey.aws.mediaconvert.-2017-08-29/forbidden-exception, "NotFoundException" :portkey.aws.mediaconvert.-2017-08-29/not-found-exception, "TooManyRequestsException" :portkey.aws.mediaconvert.-2017-08-29/too-many-requests-exception, "ConflictException" :portkey.aws.mediaconvert.-2017-08-29/conflict-exception}})))))
(clojure.spec.alpha/fdef create-job-template :args (clojure.spec.alpha/tuple :portkey.aws.mediaconvert.-2017-08-29/create-job-template-request) :ret (clojure.spec.alpha/and :portkey.aws.mediaconvert.-2017-08-29/create-job-template-response))

(clojure.core/defn create-preset ([create-preset-requestinput] (clojure.core/let [request-function-result__1013884__auto__ (req-create-preset-request create-preset-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__1013884__auto__ {:http.request.configuration/endpoints portkey.aws.mediaconvert.-2017-08-29/endpoints, :http.request.configuration/target-prefix nil, :http.request.spec/output-spec :portkey.aws.mediaconvert.-2017-08-29/create-preset-response, :http.request.configuration/mime-type {"content-type" "application/json"}, :http.request.configuration/request-uri "/2017-08-29/presets", :http.request.configuration/version "2017-08-29", :http.request.configuration/service-id "MediaConvert", :http.request.spec/input-spec :portkey.aws.mediaconvert.-2017-08-29/create-preset-request, :http.request.configuration/protocol "rest-json", :http.request.configuration/method :post, :http.request.configuration/response-code 201, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "CreatePreset", :http.request.configuration/output-deser-fn response-create-preset-response, :http.request.spec/error-spec {"BadRequestException" :portkey.aws.mediaconvert.-2017-08-29/bad-request-exception, "InternalServerErrorException" :portkey.aws.mediaconvert.-2017-08-29/internal-server-error-exception, "ForbiddenException" :portkey.aws.mediaconvert.-2017-08-29/forbidden-exception, "NotFoundException" :portkey.aws.mediaconvert.-2017-08-29/not-found-exception, "TooManyRequestsException" :portkey.aws.mediaconvert.-2017-08-29/too-many-requests-exception, "ConflictException" :portkey.aws.mediaconvert.-2017-08-29/conflict-exception}})))))
(clojure.spec.alpha/fdef create-preset :args (clojure.spec.alpha/tuple :portkey.aws.mediaconvert.-2017-08-29/create-preset-request) :ret (clojure.spec.alpha/and :portkey.aws.mediaconvert.-2017-08-29/create-preset-response))

(clojure.core/defn update-queue ([update-queue-requestinput] (clojure.core/let [request-function-result__1013884__auto__ (req-update-queue-request update-queue-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__1013884__auto__ {:http.request.configuration/endpoints portkey.aws.mediaconvert.-2017-08-29/endpoints, :http.request.configuration/target-prefix nil, :http.request.spec/output-spec :portkey.aws.mediaconvert.-2017-08-29/update-queue-response, :http.request.configuration/mime-type {"content-type" "application/json"}, :http.request.configuration/request-uri "/2017-08-29/queues/{name}", :http.request.configuration/version "2017-08-29", :http.request.configuration/service-id "MediaConvert", :http.request.spec/input-spec :portkey.aws.mediaconvert.-2017-08-29/update-queue-request, :http.request.configuration/protocol "rest-json", :http.request.configuration/method :put, :http.request.configuration/response-code 200, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "UpdateQueue", :http.request.configuration/output-deser-fn response-update-queue-response, :http.request.spec/error-spec {"BadRequestException" :portkey.aws.mediaconvert.-2017-08-29/bad-request-exception, "InternalServerErrorException" :portkey.aws.mediaconvert.-2017-08-29/internal-server-error-exception, "ForbiddenException" :portkey.aws.mediaconvert.-2017-08-29/forbidden-exception, "NotFoundException" :portkey.aws.mediaconvert.-2017-08-29/not-found-exception, "TooManyRequestsException" :portkey.aws.mediaconvert.-2017-08-29/too-many-requests-exception, "ConflictException" :portkey.aws.mediaconvert.-2017-08-29/conflict-exception}})))))
(clojure.spec.alpha/fdef update-queue :args (clojure.spec.alpha/tuple :portkey.aws.mediaconvert.-2017-08-29/update-queue-request) :ret (clojure.spec.alpha/and :portkey.aws.mediaconvert.-2017-08-29/update-queue-response))

(clojure.core/defn create-queue ([create-queue-requestinput] (clojure.core/let [request-function-result__1013884__auto__ (req-create-queue-request create-queue-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__1013884__auto__ {:http.request.configuration/endpoints portkey.aws.mediaconvert.-2017-08-29/endpoints, :http.request.configuration/target-prefix nil, :http.request.spec/output-spec :portkey.aws.mediaconvert.-2017-08-29/create-queue-response, :http.request.configuration/mime-type {"content-type" "application/json"}, :http.request.configuration/request-uri "/2017-08-29/queues", :http.request.configuration/version "2017-08-29", :http.request.configuration/service-id "MediaConvert", :http.request.spec/input-spec :portkey.aws.mediaconvert.-2017-08-29/create-queue-request, :http.request.configuration/protocol "rest-json", :http.request.configuration/method :post, :http.request.configuration/response-code 201, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "CreateQueue", :http.request.configuration/output-deser-fn response-create-queue-response, :http.request.spec/error-spec {"BadRequestException" :portkey.aws.mediaconvert.-2017-08-29/bad-request-exception, "InternalServerErrorException" :portkey.aws.mediaconvert.-2017-08-29/internal-server-error-exception, "ForbiddenException" :portkey.aws.mediaconvert.-2017-08-29/forbidden-exception, "NotFoundException" :portkey.aws.mediaconvert.-2017-08-29/not-found-exception, "TooManyRequestsException" :portkey.aws.mediaconvert.-2017-08-29/too-many-requests-exception, "ConflictException" :portkey.aws.mediaconvert.-2017-08-29/conflict-exception}})))))
(clojure.spec.alpha/fdef create-queue :args (clojure.spec.alpha/tuple :portkey.aws.mediaconvert.-2017-08-29/create-queue-request) :ret (clojure.spec.alpha/and :portkey.aws.mediaconvert.-2017-08-29/create-queue-response))

(clojure.core/defn get-queue ([get-queue-requestinput] (clojure.core/let [request-function-result__1013884__auto__ (req-get-queue-request get-queue-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__1013884__auto__ {:http.request.configuration/endpoints portkey.aws.mediaconvert.-2017-08-29/endpoints, :http.request.configuration/target-prefix nil, :http.request.spec/output-spec :portkey.aws.mediaconvert.-2017-08-29/get-queue-response, :http.request.configuration/mime-type {"content-type" "application/json"}, :http.request.configuration/request-uri "/2017-08-29/queues/{name}", :http.request.configuration/version "2017-08-29", :http.request.configuration/service-id "MediaConvert", :http.request.spec/input-spec :portkey.aws.mediaconvert.-2017-08-29/get-queue-request, :http.request.configuration/protocol "rest-json", :http.request.configuration/method :get, :http.request.configuration/response-code 200, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "GetQueue", :http.request.configuration/output-deser-fn response-get-queue-response, :http.request.spec/error-spec {"BadRequestException" :portkey.aws.mediaconvert.-2017-08-29/bad-request-exception, "InternalServerErrorException" :portkey.aws.mediaconvert.-2017-08-29/internal-server-error-exception, "ForbiddenException" :portkey.aws.mediaconvert.-2017-08-29/forbidden-exception, "NotFoundException" :portkey.aws.mediaconvert.-2017-08-29/not-found-exception, "TooManyRequestsException" :portkey.aws.mediaconvert.-2017-08-29/too-many-requests-exception, "ConflictException" :portkey.aws.mediaconvert.-2017-08-29/conflict-exception}})))))
(clojure.spec.alpha/fdef get-queue :args (clojure.spec.alpha/tuple :portkey.aws.mediaconvert.-2017-08-29/get-queue-request) :ret (clojure.spec.alpha/and :portkey.aws.mediaconvert.-2017-08-29/get-queue-response))

(clojure.core/defn create-job ([create-job-requestinput] (clojure.core/let [request-function-result__1013884__auto__ (req-create-job-request create-job-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__1013884__auto__ {:http.request.configuration/endpoints portkey.aws.mediaconvert.-2017-08-29/endpoints, :http.request.configuration/target-prefix nil, :http.request.spec/output-spec :portkey.aws.mediaconvert.-2017-08-29/create-job-response, :http.request.configuration/mime-type {"content-type" "application/json"}, :http.request.configuration/request-uri "/2017-08-29/jobs", :http.request.configuration/version "2017-08-29", :http.request.configuration/service-id "MediaConvert", :http.request.spec/input-spec :portkey.aws.mediaconvert.-2017-08-29/create-job-request, :http.request.configuration/protocol "rest-json", :http.request.configuration/method :post, :http.request.configuration/response-code 201, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "CreateJob", :http.request.configuration/output-deser-fn response-create-job-response, :http.request.spec/error-spec {"BadRequestException" :portkey.aws.mediaconvert.-2017-08-29/bad-request-exception, "InternalServerErrorException" :portkey.aws.mediaconvert.-2017-08-29/internal-server-error-exception, "ForbiddenException" :portkey.aws.mediaconvert.-2017-08-29/forbidden-exception, "NotFoundException" :portkey.aws.mediaconvert.-2017-08-29/not-found-exception, "TooManyRequestsException" :portkey.aws.mediaconvert.-2017-08-29/too-many-requests-exception, "ConflictException" :portkey.aws.mediaconvert.-2017-08-29/conflict-exception}})))))
(clojure.spec.alpha/fdef create-job :args (clojure.spec.alpha/tuple :portkey.aws.mediaconvert.-2017-08-29/create-job-request) :ret (clojure.spec.alpha/and :portkey.aws.mediaconvert.-2017-08-29/create-job-response))

(clojure.core/defn untag-resource ([untag-resource-requestinput] (clojure.core/let [request-function-result__1013884__auto__ (req-untag-resource-request untag-resource-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__1013884__auto__ {:http.request.configuration/endpoints portkey.aws.mediaconvert.-2017-08-29/endpoints, :http.request.configuration/target-prefix nil, :http.request.spec/output-spec :portkey.aws.mediaconvert.-2017-08-29/untag-resource-response, :http.request.configuration/mime-type {"content-type" "application/json"}, :http.request.configuration/request-uri "/2017-08-29/tags/{arn}", :http.request.configuration/version "2017-08-29", :http.request.configuration/service-id "MediaConvert", :http.request.spec/input-spec :portkey.aws.mediaconvert.-2017-08-29/untag-resource-request, :http.request.configuration/protocol "rest-json", :http.request.configuration/method :put, :http.request.configuration/response-code 200, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "UntagResource", :http.request.configuration/output-deser-fn response-untag-resource-response, :http.request.spec/error-spec {"BadRequestException" :portkey.aws.mediaconvert.-2017-08-29/bad-request-exception, "InternalServerErrorException" :portkey.aws.mediaconvert.-2017-08-29/internal-server-error-exception, "ForbiddenException" :portkey.aws.mediaconvert.-2017-08-29/forbidden-exception, "NotFoundException" :portkey.aws.mediaconvert.-2017-08-29/not-found-exception, "TooManyRequestsException" :portkey.aws.mediaconvert.-2017-08-29/too-many-requests-exception, "ConflictException" :portkey.aws.mediaconvert.-2017-08-29/conflict-exception}})))))
(clojure.spec.alpha/fdef untag-resource :args (clojure.spec.alpha/tuple :portkey.aws.mediaconvert.-2017-08-29/untag-resource-request) :ret (clojure.spec.alpha/and :portkey.aws.mediaconvert.-2017-08-29/untag-resource-response))

(clojure.core/defn get-job ([get-job-requestinput] (clojure.core/let [request-function-result__1013884__auto__ (req-get-job-request get-job-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__1013884__auto__ {:http.request.configuration/endpoints portkey.aws.mediaconvert.-2017-08-29/endpoints, :http.request.configuration/target-prefix nil, :http.request.spec/output-spec :portkey.aws.mediaconvert.-2017-08-29/get-job-response, :http.request.configuration/mime-type {"content-type" "application/json"}, :http.request.configuration/request-uri "/2017-08-29/jobs/{id}", :http.request.configuration/version "2017-08-29", :http.request.configuration/service-id "MediaConvert", :http.request.spec/input-spec :portkey.aws.mediaconvert.-2017-08-29/get-job-request, :http.request.configuration/protocol "rest-json", :http.request.configuration/method :get, :http.request.configuration/response-code 200, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "GetJob", :http.request.configuration/output-deser-fn response-get-job-response, :http.request.spec/error-spec {"BadRequestException" :portkey.aws.mediaconvert.-2017-08-29/bad-request-exception, "InternalServerErrorException" :portkey.aws.mediaconvert.-2017-08-29/internal-server-error-exception, "ForbiddenException" :portkey.aws.mediaconvert.-2017-08-29/forbidden-exception, "NotFoundException" :portkey.aws.mediaconvert.-2017-08-29/not-found-exception, "TooManyRequestsException" :portkey.aws.mediaconvert.-2017-08-29/too-many-requests-exception, "ConflictException" :portkey.aws.mediaconvert.-2017-08-29/conflict-exception}})))))
(clojure.spec.alpha/fdef get-job :args (clojure.spec.alpha/tuple :portkey.aws.mediaconvert.-2017-08-29/get-job-request) :ret (clojure.spec.alpha/and :portkey.aws.mediaconvert.-2017-08-29/get-job-response))

(clojure.core/defn list-job-templates ([] (list-job-templates {})) ([list-job-templates-requestinput] (clojure.core/let [request-function-result__1013884__auto__ (req-list-job-templates-request list-job-templates-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__1013884__auto__ {:http.request.configuration/endpoints portkey.aws.mediaconvert.-2017-08-29/endpoints, :http.request.configuration/target-prefix nil, :http.request.spec/output-spec :portkey.aws.mediaconvert.-2017-08-29/list-job-templates-response, :http.request.configuration/mime-type {"content-type" "application/json"}, :http.request.configuration/request-uri "/2017-08-29/jobTemplates", :http.request.configuration/version "2017-08-29", :http.request.configuration/service-id "MediaConvert", :http.request.spec/input-spec :portkey.aws.mediaconvert.-2017-08-29/list-job-templates-request, :http.request.configuration/protocol "rest-json", :http.request.configuration/method :get, :http.request.configuration/response-code 200, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "ListJobTemplates", :http.request.configuration/output-deser-fn response-list-job-templates-response, :http.request.spec/error-spec {"BadRequestException" :portkey.aws.mediaconvert.-2017-08-29/bad-request-exception, "InternalServerErrorException" :portkey.aws.mediaconvert.-2017-08-29/internal-server-error-exception, "ForbiddenException" :portkey.aws.mediaconvert.-2017-08-29/forbidden-exception, "NotFoundException" :portkey.aws.mediaconvert.-2017-08-29/not-found-exception, "TooManyRequestsException" :portkey.aws.mediaconvert.-2017-08-29/too-many-requests-exception, "ConflictException" :portkey.aws.mediaconvert.-2017-08-29/conflict-exception}})))))
(clojure.spec.alpha/fdef list-job-templates :args (clojure.spec.alpha/? :portkey.aws.mediaconvert.-2017-08-29/list-job-templates-request) :ret (clojure.spec.alpha/and :portkey.aws.mediaconvert.-2017-08-29/list-job-templates-response))

(clojure.core/defn delete-preset ([delete-preset-requestinput] (clojure.core/let [request-function-result__1013884__auto__ (req-delete-preset-request delete-preset-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__1013884__auto__ {:http.request.configuration/endpoints portkey.aws.mediaconvert.-2017-08-29/endpoints, :http.request.configuration/target-prefix nil, :http.request.spec/output-spec :portkey.aws.mediaconvert.-2017-08-29/delete-preset-response, :http.request.configuration/mime-type {"content-type" "application/json"}, :http.request.configuration/request-uri "/2017-08-29/presets/{name}", :http.request.configuration/version "2017-08-29", :http.request.configuration/service-id "MediaConvert", :http.request.spec/input-spec :portkey.aws.mediaconvert.-2017-08-29/delete-preset-request, :http.request.configuration/protocol "rest-json", :http.request.configuration/method :delete, :http.request.configuration/response-code 202, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "DeletePreset", :http.request.configuration/output-deser-fn response-delete-preset-response, :http.request.spec/error-spec {"BadRequestException" :portkey.aws.mediaconvert.-2017-08-29/bad-request-exception, "InternalServerErrorException" :portkey.aws.mediaconvert.-2017-08-29/internal-server-error-exception, "ForbiddenException" :portkey.aws.mediaconvert.-2017-08-29/forbidden-exception, "NotFoundException" :portkey.aws.mediaconvert.-2017-08-29/not-found-exception, "TooManyRequestsException" :portkey.aws.mediaconvert.-2017-08-29/too-many-requests-exception, "ConflictException" :portkey.aws.mediaconvert.-2017-08-29/conflict-exception}})))))
(clojure.spec.alpha/fdef delete-preset :args (clojure.spec.alpha/tuple :portkey.aws.mediaconvert.-2017-08-29/delete-preset-request) :ret (clojure.spec.alpha/and :portkey.aws.mediaconvert.-2017-08-29/delete-preset-response))

(clojure.core/defn update-job-template ([update-job-template-requestinput] (clojure.core/let [request-function-result__1013884__auto__ (req-update-job-template-request update-job-template-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__1013884__auto__ {:http.request.configuration/endpoints portkey.aws.mediaconvert.-2017-08-29/endpoints, :http.request.configuration/target-prefix nil, :http.request.spec/output-spec :portkey.aws.mediaconvert.-2017-08-29/update-job-template-response, :http.request.configuration/mime-type {"content-type" "application/json"}, :http.request.configuration/request-uri "/2017-08-29/jobTemplates/{name}", :http.request.configuration/version "2017-08-29", :http.request.configuration/service-id "MediaConvert", :http.request.spec/input-spec :portkey.aws.mediaconvert.-2017-08-29/update-job-template-request, :http.request.configuration/protocol "rest-json", :http.request.configuration/method :put, :http.request.configuration/response-code 200, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "UpdateJobTemplate", :http.request.configuration/output-deser-fn response-update-job-template-response, :http.request.spec/error-spec {"BadRequestException" :portkey.aws.mediaconvert.-2017-08-29/bad-request-exception, "InternalServerErrorException" :portkey.aws.mediaconvert.-2017-08-29/internal-server-error-exception, "ForbiddenException" :portkey.aws.mediaconvert.-2017-08-29/forbidden-exception, "NotFoundException" :portkey.aws.mediaconvert.-2017-08-29/not-found-exception, "TooManyRequestsException" :portkey.aws.mediaconvert.-2017-08-29/too-many-requests-exception, "ConflictException" :portkey.aws.mediaconvert.-2017-08-29/conflict-exception}})))))
(clojure.spec.alpha/fdef update-job-template :args (clojure.spec.alpha/tuple :portkey.aws.mediaconvert.-2017-08-29/update-job-template-request) :ret (clojure.spec.alpha/and :portkey.aws.mediaconvert.-2017-08-29/update-job-template-response))

(clojure.core/defn get-preset ([get-preset-requestinput] (clojure.core/let [request-function-result__1013884__auto__ (req-get-preset-request get-preset-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__1013884__auto__ {:http.request.configuration/endpoints portkey.aws.mediaconvert.-2017-08-29/endpoints, :http.request.configuration/target-prefix nil, :http.request.spec/output-spec :portkey.aws.mediaconvert.-2017-08-29/get-preset-response, :http.request.configuration/mime-type {"content-type" "application/json"}, :http.request.configuration/request-uri "/2017-08-29/presets/{name}", :http.request.configuration/version "2017-08-29", :http.request.configuration/service-id "MediaConvert", :http.request.spec/input-spec :portkey.aws.mediaconvert.-2017-08-29/get-preset-request, :http.request.configuration/protocol "rest-json", :http.request.configuration/method :get, :http.request.configuration/response-code 200, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "GetPreset", :http.request.configuration/output-deser-fn response-get-preset-response, :http.request.spec/error-spec {"BadRequestException" :portkey.aws.mediaconvert.-2017-08-29/bad-request-exception, "InternalServerErrorException" :portkey.aws.mediaconvert.-2017-08-29/internal-server-error-exception, "ForbiddenException" :portkey.aws.mediaconvert.-2017-08-29/forbidden-exception, "NotFoundException" :portkey.aws.mediaconvert.-2017-08-29/not-found-exception, "TooManyRequestsException" :portkey.aws.mediaconvert.-2017-08-29/too-many-requests-exception, "ConflictException" :portkey.aws.mediaconvert.-2017-08-29/conflict-exception}})))))
(clojure.spec.alpha/fdef get-preset :args (clojure.spec.alpha/tuple :portkey.aws.mediaconvert.-2017-08-29/get-preset-request) :ret (clojure.spec.alpha/and :portkey.aws.mediaconvert.-2017-08-29/get-preset-response))

(clojure.core/defn associate-certificate ([associate-certificate-requestinput] (clojure.core/let [request-function-result__1013884__auto__ (req-associate-certificate-request associate-certificate-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__1013884__auto__ {:http.request.configuration/endpoints portkey.aws.mediaconvert.-2017-08-29/endpoints, :http.request.configuration/target-prefix nil, :http.request.spec/output-spec :portkey.aws.mediaconvert.-2017-08-29/associate-certificate-response, :http.request.configuration/mime-type {"content-type" "application/json"}, :http.request.configuration/request-uri "/2017-08-29/certificates", :http.request.configuration/version "2017-08-29", :http.request.configuration/service-id "MediaConvert", :http.request.spec/input-spec :portkey.aws.mediaconvert.-2017-08-29/associate-certificate-request, :http.request.configuration/protocol "rest-json", :http.request.configuration/method :post, :http.request.configuration/response-code 201, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "AssociateCertificate", :http.request.configuration/output-deser-fn response-associate-certificate-response, :http.request.spec/error-spec {"BadRequestException" :portkey.aws.mediaconvert.-2017-08-29/bad-request-exception, "InternalServerErrorException" :portkey.aws.mediaconvert.-2017-08-29/internal-server-error-exception, "ForbiddenException" :portkey.aws.mediaconvert.-2017-08-29/forbidden-exception, "NotFoundException" :portkey.aws.mediaconvert.-2017-08-29/not-found-exception, "TooManyRequestsException" :portkey.aws.mediaconvert.-2017-08-29/too-many-requests-exception, "ConflictException" :portkey.aws.mediaconvert.-2017-08-29/conflict-exception}})))))
(clojure.spec.alpha/fdef associate-certificate :args (clojure.spec.alpha/tuple :portkey.aws.mediaconvert.-2017-08-29/associate-certificate-request) :ret (clojure.spec.alpha/and :portkey.aws.mediaconvert.-2017-08-29/associate-certificate-response))

(clojure.core/defn list-presets ([] (list-presets {})) ([list-presets-requestinput] (clojure.core/let [request-function-result__1013884__auto__ (req-list-presets-request list-presets-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__1013884__auto__ {:http.request.configuration/endpoints portkey.aws.mediaconvert.-2017-08-29/endpoints, :http.request.configuration/target-prefix nil, :http.request.spec/output-spec :portkey.aws.mediaconvert.-2017-08-29/list-presets-response, :http.request.configuration/mime-type {"content-type" "application/json"}, :http.request.configuration/request-uri "/2017-08-29/presets", :http.request.configuration/version "2017-08-29", :http.request.configuration/service-id "MediaConvert", :http.request.spec/input-spec :portkey.aws.mediaconvert.-2017-08-29/list-presets-request, :http.request.configuration/protocol "rest-json", :http.request.configuration/method :get, :http.request.configuration/response-code 200, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "ListPresets", :http.request.configuration/output-deser-fn response-list-presets-response, :http.request.spec/error-spec {"BadRequestException" :portkey.aws.mediaconvert.-2017-08-29/bad-request-exception, "InternalServerErrorException" :portkey.aws.mediaconvert.-2017-08-29/internal-server-error-exception, "ForbiddenException" :portkey.aws.mediaconvert.-2017-08-29/forbidden-exception, "NotFoundException" :portkey.aws.mediaconvert.-2017-08-29/not-found-exception, "TooManyRequestsException" :portkey.aws.mediaconvert.-2017-08-29/too-many-requests-exception, "ConflictException" :portkey.aws.mediaconvert.-2017-08-29/conflict-exception}})))))
(clojure.spec.alpha/fdef list-presets :args (clojure.spec.alpha/? :portkey.aws.mediaconvert.-2017-08-29/list-presets-request) :ret (clojure.spec.alpha/and :portkey.aws.mediaconvert.-2017-08-29/list-presets-response))

(clojure.core/defn disassociate-certificate ([disassociate-certificate-requestinput] (clojure.core/let [request-function-result__1013884__auto__ (req-disassociate-certificate-request disassociate-certificate-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__1013884__auto__ {:http.request.configuration/endpoints portkey.aws.mediaconvert.-2017-08-29/endpoints, :http.request.configuration/target-prefix nil, :http.request.spec/output-spec :portkey.aws.mediaconvert.-2017-08-29/disassociate-certificate-response, :http.request.configuration/mime-type {"content-type" "application/json"}, :http.request.configuration/request-uri "/2017-08-29/certificates/{arn}", :http.request.configuration/version "2017-08-29", :http.request.configuration/service-id "MediaConvert", :http.request.spec/input-spec :portkey.aws.mediaconvert.-2017-08-29/disassociate-certificate-request, :http.request.configuration/protocol "rest-json", :http.request.configuration/method :delete, :http.request.configuration/response-code 202, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "DisassociateCertificate", :http.request.configuration/output-deser-fn response-disassociate-certificate-response, :http.request.spec/error-spec {"BadRequestException" :portkey.aws.mediaconvert.-2017-08-29/bad-request-exception, "InternalServerErrorException" :portkey.aws.mediaconvert.-2017-08-29/internal-server-error-exception, "ForbiddenException" :portkey.aws.mediaconvert.-2017-08-29/forbidden-exception, "NotFoundException" :portkey.aws.mediaconvert.-2017-08-29/not-found-exception, "TooManyRequestsException" :portkey.aws.mediaconvert.-2017-08-29/too-many-requests-exception, "ConflictException" :portkey.aws.mediaconvert.-2017-08-29/conflict-exception}})))))
(clojure.spec.alpha/fdef disassociate-certificate :args (clojure.spec.alpha/tuple :portkey.aws.mediaconvert.-2017-08-29/disassociate-certificate-request) :ret (clojure.spec.alpha/and :portkey.aws.mediaconvert.-2017-08-29/disassociate-certificate-response))

(clojure.core/defn list-jobs ([] (list-jobs {})) ([list-jobs-requestinput] (clojure.core/let [request-function-result__1013884__auto__ (req-list-jobs-request list-jobs-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__1013884__auto__ {:http.request.configuration/endpoints portkey.aws.mediaconvert.-2017-08-29/endpoints, :http.request.configuration/target-prefix nil, :http.request.spec/output-spec :portkey.aws.mediaconvert.-2017-08-29/list-jobs-response, :http.request.configuration/mime-type {"content-type" "application/json"}, :http.request.configuration/request-uri "/2017-08-29/jobs", :http.request.configuration/version "2017-08-29", :http.request.configuration/service-id "MediaConvert", :http.request.spec/input-spec :portkey.aws.mediaconvert.-2017-08-29/list-jobs-request, :http.request.configuration/protocol "rest-json", :http.request.configuration/method :get, :http.request.configuration/response-code 200, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "ListJobs", :http.request.configuration/output-deser-fn response-list-jobs-response, :http.request.spec/error-spec {"BadRequestException" :portkey.aws.mediaconvert.-2017-08-29/bad-request-exception, "InternalServerErrorException" :portkey.aws.mediaconvert.-2017-08-29/internal-server-error-exception, "ForbiddenException" :portkey.aws.mediaconvert.-2017-08-29/forbidden-exception, "NotFoundException" :portkey.aws.mediaconvert.-2017-08-29/not-found-exception, "TooManyRequestsException" :portkey.aws.mediaconvert.-2017-08-29/too-many-requests-exception, "ConflictException" :portkey.aws.mediaconvert.-2017-08-29/conflict-exception}})))))
(clojure.spec.alpha/fdef list-jobs :args (clojure.spec.alpha/? :portkey.aws.mediaconvert.-2017-08-29/list-jobs-request) :ret (clojure.spec.alpha/and :portkey.aws.mediaconvert.-2017-08-29/list-jobs-response))

(clojure.core/defn cancel-job ([cancel-job-requestinput] (clojure.core/let [request-function-result__1013884__auto__ (req-cancel-job-request cancel-job-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__1013884__auto__ {:http.request.configuration/endpoints portkey.aws.mediaconvert.-2017-08-29/endpoints, :http.request.configuration/target-prefix nil, :http.request.spec/output-spec :portkey.aws.mediaconvert.-2017-08-29/cancel-job-response, :http.request.configuration/mime-type {"content-type" "application/json"}, :http.request.configuration/request-uri "/2017-08-29/jobs/{id}", :http.request.configuration/version "2017-08-29", :http.request.configuration/service-id "MediaConvert", :http.request.spec/input-spec :portkey.aws.mediaconvert.-2017-08-29/cancel-job-request, :http.request.configuration/protocol "rest-json", :http.request.configuration/method :delete, :http.request.configuration/response-code 202, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "CancelJob", :http.request.configuration/output-deser-fn response-cancel-job-response, :http.request.spec/error-spec {"BadRequestException" :portkey.aws.mediaconvert.-2017-08-29/bad-request-exception, "InternalServerErrorException" :portkey.aws.mediaconvert.-2017-08-29/internal-server-error-exception, "ForbiddenException" :portkey.aws.mediaconvert.-2017-08-29/forbidden-exception, "NotFoundException" :portkey.aws.mediaconvert.-2017-08-29/not-found-exception, "TooManyRequestsException" :portkey.aws.mediaconvert.-2017-08-29/too-many-requests-exception, "ConflictException" :portkey.aws.mediaconvert.-2017-08-29/conflict-exception}})))))
(clojure.spec.alpha/fdef cancel-job :args (clojure.spec.alpha/tuple :portkey.aws.mediaconvert.-2017-08-29/cancel-job-request) :ret (clojure.spec.alpha/and :portkey.aws.mediaconvert.-2017-08-29/cancel-job-response))
