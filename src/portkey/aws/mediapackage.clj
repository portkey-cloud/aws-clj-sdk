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
    :signature-version :v4},
   "us-west-1"
   {:credential-scope {:service "mediapackage", :region "us-west-1"},
    :ssl-common-name "mediapackage.us-west-1.amazonaws.com",
    :endpoint "https://mediapackage.us-west-1.amazonaws.com",
    :signature-version :v4},
   "ap-south-1"
   {:credential-scope {:service "mediapackage", :region "ap-south-1"},
    :ssl-common-name "mediapackage.ap-south-1.amazonaws.com",
    :endpoint "https://mediapackage.ap-south-1.amazonaws.com",
    :signature-version :v4}})

(clojure.core/declare ser-segment-template-format)

(clojure.core/declare ser-cmaf-package-create-or-update-parameters)

(clojure.core/declare ser-ad-markers)

(clojure.core/declare ser-stream-selection)

(clojure.core/declare ser-string)

(clojure.core/declare ser-hls-package)

(clojure.core/declare ser-tags)

(clojure.core/declare ser-mss-package)

(clojure.core/declare ser-dash-encryption)

(clojure.core/declare ser-mss-encryption)

(clojure.core/declare ser-speke-key-provider)

(clojure.core/declare ser-list-of-hls-manifest-create-or-update-parameters)

(clojure.core/declare ser-list-of-string)

(clojure.core/declare ser-boolean)

(clojure.core/declare ser-profile)

(clojure.core/declare ser-hls-encryption)

(clojure.core/declare ser-manifest-layout)

(clojure.core/declare ser-stream-order)

(clojure.core/declare ser-dash-package)

(clojure.core/declare ser-max-results)

(clojure.core/declare ser-encryption-method)

(clojure.core/declare ser-list-of-period-triggers-element)

(clojure.core/declare ser-integer)

(clojure.core/declare ser-cmaf-encryption)

(clojure.core/declare ser-period-triggers-element)

(clojure.core/declare ser-hls-manifest-create-or-update-parameters)

(clojure.core/declare ser-playlist-type)

(clojure.core/declare ser-map-of-string)

(clojure.core/defn- ser-segment-template-format [input] #:http.request.field{:value (clojure.core/get {"NUMBER_WITH_TIMELINE" "NUMBER_WITH_TIMELINE", :number-with-timeline "NUMBER_WITH_TIMELINE", "TIME_WITH_TIMELINE" "TIME_WITH_TIMELINE", :time-with-timeline "TIME_WITH_TIMELINE"} input), :shape "SegmentTemplateFormat"})

(clojure.core/defn- ser-cmaf-package-create-or-update-parameters [input] (clojure.core/cond-> #:http.request.field{:value [], :shape "CmafPackageCreateOrUpdateParameters", :type "structure"} (clojure.core/contains? input :encryption) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-cmaf-encryption (input :encryption)) #:http.request.field{:name "Encryption", :location-name "encryption", :shape "CmafEncryption"})) (clojure.core/contains? input :hls-manifests) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-list-of-hls-manifest-create-or-update-parameters (input :hls-manifests)) #:http.request.field{:name "HlsManifests", :location-name "hlsManifests", :shape "__listOfHlsManifestCreateOrUpdateParameters"})) (clojure.core/contains? input :segment-duration-seconds) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-integer (input :segment-duration-seconds)) #:http.request.field{:name "SegmentDurationSeconds", :location-name "segmentDurationSeconds", :shape "__integer"})) (clojure.core/contains? input :segment-prefix) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-string (input :segment-prefix)) #:http.request.field{:name "SegmentPrefix", :location-name "segmentPrefix", :shape "__string"})) (clojure.core/contains? input :stream-selection) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-stream-selection (input :stream-selection)) #:http.request.field{:name "StreamSelection", :location-name "streamSelection", :shape "StreamSelection"}))))

(clojure.core/defn- ser-ad-markers [input] #:http.request.field{:value (clojure.core/get {"NONE" "NONE", :none "NONE", "SCTE35_ENHANCED" "SCTE35_ENHANCED", :scte-35-enhanced "SCTE35_ENHANCED", "PASSTHROUGH" "PASSTHROUGH", :passthrough "PASSTHROUGH"} input), :shape "AdMarkers"})

(clojure.core/defn- ser-stream-selection [input] (clojure.core/cond-> #:http.request.field{:value [], :shape "StreamSelection", :type "structure"} (clojure.core/contains? input :max-video-bits-per-second) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-integer (input :max-video-bits-per-second)) #:http.request.field{:name "MaxVideoBitsPerSecond", :location-name "maxVideoBitsPerSecond", :shape "__integer"})) (clojure.core/contains? input :min-video-bits-per-second) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-integer (input :min-video-bits-per-second)) #:http.request.field{:name "MinVideoBitsPerSecond", :location-name "minVideoBitsPerSecond", :shape "__integer"})) (clojure.core/contains? input :stream-order) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-stream-order (input :stream-order)) #:http.request.field{:name "StreamOrder", :location-name "streamOrder", :shape "StreamOrder"}))))

(clojure.core/defn- ser-string [input] #:http.request.field{:value input, :shape "__string"})

(clojure.core/defn- ser-hls-package [input] (clojure.core/cond-> #:http.request.field{:value [], :shape "HlsPackage", :type "structure"} (clojure.core/contains? input :ad-markers) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-ad-markers (input :ad-markers)) #:http.request.field{:name "AdMarkers", :location-name "adMarkers", :shape "AdMarkers"})) (clojure.core/contains? input :stream-selection) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-stream-selection (input :stream-selection)) #:http.request.field{:name "StreamSelection", :location-name "streamSelection", :shape "StreamSelection"})) (clojure.core/contains? input :include-iframe-only-stream) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-boolean (input :include-iframe-only-stream)) #:http.request.field{:name "IncludeIframeOnlyStream", :location-name "includeIframeOnlyStream", :shape "__boolean"})) (clojure.core/contains? input :use-audio-rendition-group) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-boolean (input :use-audio-rendition-group)) #:http.request.field{:name "UseAudioRenditionGroup", :location-name "useAudioRenditionGroup", :shape "__boolean"})) (clojure.core/contains? input :program-date-time-interval-seconds) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-integer (input :program-date-time-interval-seconds)) #:http.request.field{:name "ProgramDateTimeIntervalSeconds", :location-name "programDateTimeIntervalSeconds", :shape "__integer"})) (clojure.core/contains? input :encryption) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-hls-encryption (input :encryption)) #:http.request.field{:name "Encryption", :location-name "encryption", :shape "HlsEncryption"})) (clojure.core/contains? input :playlist-window-seconds) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-integer (input :playlist-window-seconds)) #:http.request.field{:name "PlaylistWindowSeconds", :location-name "playlistWindowSeconds", :shape "__integer"})) (clojure.core/contains? input :segment-duration-seconds) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-integer (input :segment-duration-seconds)) #:http.request.field{:name "SegmentDurationSeconds", :location-name "segmentDurationSeconds", :shape "__integer"})) (clojure.core/contains? input :playlist-type) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-playlist-type (input :playlist-type)) #:http.request.field{:name "PlaylistType", :location-name "playlistType", :shape "PlaylistType"}))))

(clojure.core/defn- ser-tags [input] #:http.request.field{:value (clojure.core/into [] (clojure.core/map (clojure.core/fn [[k v]] [(clojure.core/into (ser-string k) #:http.request.field{:map-info "key", :shape "__string"}) (clojure.core/into (ser-string v) #:http.request.field{:map-info "value", :shape "__string"})])) input), :shape "Tags", :type "map"})

(clojure.core/defn- ser-mss-package [input] (clojure.core/cond-> #:http.request.field{:value [], :shape "MssPackage", :type "structure"} (clojure.core/contains? input :encryption) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-mss-encryption (input :encryption)) #:http.request.field{:name "Encryption", :location-name "encryption", :shape "MssEncryption"})) (clojure.core/contains? input :manifest-window-seconds) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-integer (input :manifest-window-seconds)) #:http.request.field{:name "ManifestWindowSeconds", :location-name "manifestWindowSeconds", :shape "__integer"})) (clojure.core/contains? input :segment-duration-seconds) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-integer (input :segment-duration-seconds)) #:http.request.field{:name "SegmentDurationSeconds", :location-name "segmentDurationSeconds", :shape "__integer"})) (clojure.core/contains? input :stream-selection) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-stream-selection (input :stream-selection)) #:http.request.field{:name "StreamSelection", :location-name "streamSelection", :shape "StreamSelection"}))))

(clojure.core/defn- ser-dash-encryption [input] (clojure.core/cond-> #:http.request.field{:value [(clojure.core/into (ser-speke-key-provider (:speke-key-provider input)) #:http.request.field{:name "SpekeKeyProvider", :location-name "spekeKeyProvider", :shape "SpekeKeyProvider"})], :shape "DashEncryption", :type "structure"} (clojure.core/contains? input :key-rotation-interval-seconds) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-integer (input :key-rotation-interval-seconds)) #:http.request.field{:name "KeyRotationIntervalSeconds", :location-name "keyRotationIntervalSeconds", :shape "__integer"}))))

(clojure.core/defn- ser-mss-encryption [input] (clojure.core/cond-> #:http.request.field{:value [(clojure.core/into (ser-speke-key-provider (:speke-key-provider input)) #:http.request.field{:name "SpekeKeyProvider", :location-name "spekeKeyProvider", :shape "SpekeKeyProvider"})], :shape "MssEncryption", :type "structure"}))

(clojure.core/defn- ser-speke-key-provider [input] (clojure.core/cond-> #:http.request.field{:value [(clojure.core/into (ser-string (:url input)) #:http.request.field{:name "Url", :location-name "url", :shape "__string"}) (clojure.core/into (ser-string (:resource-id input)) #:http.request.field{:name "ResourceId", :location-name "resourceId", :shape "__string"}) (clojure.core/into (ser-string (:role-arn input)) #:http.request.field{:name "RoleArn", :location-name "roleArn", :shape "__string"}) (clojure.core/into (ser-list-of-string (:system-ids input)) #:http.request.field{:name "SystemIds", :location-name "systemIds", :shape "__listOf__string"})], :shape "SpekeKeyProvider", :type "structure"} (clojure.core/contains? input :certificate-arn) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-string (input :certificate-arn)) #:http.request.field{:name "CertificateArn", :location-name "certificateArn", :shape "__string"}))))

(clojure.core/defn- ser-list-of-hls-manifest-create-or-update-parameters [input] #:http.request.field{:value (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (clojure.core/merge (ser-hls-manifest-create-or-update-parameters coll) #:http.request.field{:shape "HlsManifestCreateOrUpdateParameters"}))) input), :shape "__listOfHlsManifestCreateOrUpdateParameters", :type "list"})

(clojure.core/defn- ser-list-of-string [input] #:http.request.field{:value (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (clojure.core/merge (ser-string coll) #:http.request.field{:shape "__string"}))) input), :shape "__listOf__string", :type "list"})

(clojure.core/defn- ser-boolean [input] #:http.request.field{:value input, :shape "__boolean"})

(clojure.core/defn- ser-profile [input] #:http.request.field{:value (clojure.core/get {"NONE" "NONE", :none "NONE", "HBBTV_1_5" "HBBTV_1_5", :hbbtv-1-5 "HBBTV_1_5"} input), :shape "Profile"})

(clojure.core/defn- ser-hls-encryption [input] (clojure.core/cond-> #:http.request.field{:value [(clojure.core/into (ser-speke-key-provider (:speke-key-provider input)) #:http.request.field{:name "SpekeKeyProvider", :location-name "spekeKeyProvider", :shape "SpekeKeyProvider"})], :shape "HlsEncryption", :type "structure"} (clojure.core/contains? input :constant-initialization-vector) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-string (input :constant-initialization-vector)) #:http.request.field{:name "ConstantInitializationVector", :location-name "constantInitializationVector", :shape "__string"})) (clojure.core/contains? input :encryption-method) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-encryption-method (input :encryption-method)) #:http.request.field{:name "EncryptionMethod", :location-name "encryptionMethod", :shape "EncryptionMethod"})) (clojure.core/contains? input :key-rotation-interval-seconds) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-integer (input :key-rotation-interval-seconds)) #:http.request.field{:name "KeyRotationIntervalSeconds", :location-name "keyRotationIntervalSeconds", :shape "__integer"})) (clojure.core/contains? input :repeat-ext-x-key) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-boolean (input :repeat-ext-x-key)) #:http.request.field{:name "RepeatExtXKey", :location-name "repeatExtXKey", :shape "__boolean"}))))

(clojure.core/defn- ser-manifest-layout [input] #:http.request.field{:value (clojure.core/get {"FULL" "FULL", :full "FULL", "COMPACT" "COMPACT", :compact "COMPACT"} input), :shape "ManifestLayout"})

(clojure.core/defn- ser-stream-order [input] #:http.request.field{:value (clojure.core/get {"ORIGINAL" "ORIGINAL", :original "ORIGINAL", "VIDEO_BITRATE_ASCENDING" "VIDEO_BITRATE_ASCENDING", :video-bitrate-ascending "VIDEO_BITRATE_ASCENDING", "VIDEO_BITRATE_DESCENDING" "VIDEO_BITRATE_DESCENDING", :video-bitrate-descending "VIDEO_BITRATE_DESCENDING"} input), :shape "StreamOrder"})

(clojure.core/defn- ser-dash-package [input] (clojure.core/cond-> #:http.request.field{:value [], :shape "DashPackage", :type "structure"} (clojure.core/contains? input :min-update-period-seconds) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-integer (input :min-update-period-seconds)) #:http.request.field{:name "MinUpdatePeriodSeconds", :location-name "minUpdatePeriodSeconds", :shape "__integer"})) (clojure.core/contains? input :segment-template-format) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-segment-template-format (input :segment-template-format)) #:http.request.field{:name "SegmentTemplateFormat", :location-name "segmentTemplateFormat", :shape "SegmentTemplateFormat"})) (clojure.core/contains? input :stream-selection) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-stream-selection (input :stream-selection)) #:http.request.field{:name "StreamSelection", :location-name "streamSelection", :shape "StreamSelection"})) (clojure.core/contains? input :manifest-window-seconds) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-integer (input :manifest-window-seconds)) #:http.request.field{:name "ManifestWindowSeconds", :location-name "manifestWindowSeconds", :shape "__integer"})) (clojure.core/contains? input :profile) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-profile (input :profile)) #:http.request.field{:name "Profile", :location-name "profile", :shape "Profile"})) (clojure.core/contains? input :period-triggers) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-list-of-period-triggers-element (input :period-triggers)) #:http.request.field{:name "PeriodTriggers", :location-name "periodTriggers", :shape "__listOf__PeriodTriggersElement"})) (clojure.core/contains? input :manifest-layout) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-manifest-layout (input :manifest-layout)) #:http.request.field{:name "ManifestLayout", :location-name "manifestLayout", :shape "ManifestLayout"})) (clojure.core/contains? input :min-buffer-time-seconds) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-integer (input :min-buffer-time-seconds)) #:http.request.field{:name "MinBufferTimeSeconds", :location-name "minBufferTimeSeconds", :shape "__integer"})) (clojure.core/contains? input :encryption) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-dash-encryption (input :encryption)) #:http.request.field{:name "Encryption", :location-name "encryption", :shape "DashEncryption"})) (clojure.core/contains? input :segment-duration-seconds) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-integer (input :segment-duration-seconds)) #:http.request.field{:name "SegmentDurationSeconds", :location-name "segmentDurationSeconds", :shape "__integer"})) (clojure.core/contains? input :suggested-presentation-delay-seconds) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-integer (input :suggested-presentation-delay-seconds)) #:http.request.field{:name "SuggestedPresentationDelaySeconds", :location-name "suggestedPresentationDelaySeconds", :shape "__integer"}))))

(clojure.core/defn- ser-max-results [input] #:http.request.field{:value input, :shape "MaxResults"})

(clojure.core/defn- ser-encryption-method [input] #:http.request.field{:value (clojure.core/get {"AES_128" "AES_128", :aes-128 "AES_128", "SAMPLE_AES" "SAMPLE_AES", :sample-aes "SAMPLE_AES"} input), :shape "EncryptionMethod"})

(clojure.core/defn- ser-list-of-period-triggers-element [input] #:http.request.field{:value (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (clojure.core/merge (ser-period-triggers-element coll) #:http.request.field{:shape "__PeriodTriggersElement"}))) input), :shape "__listOf__PeriodTriggersElement", :type "list"})

(clojure.core/defn- ser-integer [input] #:http.request.field{:value input, :shape "__integer"})

(clojure.core/defn- ser-cmaf-encryption [input] (clojure.core/cond-> #:http.request.field{:value [(clojure.core/into (ser-speke-key-provider (:speke-key-provider input)) #:http.request.field{:name "SpekeKeyProvider", :location-name "spekeKeyProvider", :shape "SpekeKeyProvider"})], :shape "CmafEncryption", :type "structure"} (clojure.core/contains? input :key-rotation-interval-seconds) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-integer (input :key-rotation-interval-seconds)) #:http.request.field{:name "KeyRotationIntervalSeconds", :location-name "keyRotationIntervalSeconds", :shape "__integer"}))))

(clojure.core/defn- ser-period-triggers-element [input] #:http.request.field{:value (clojure.core/get {"ADS" "ADS", :ads "ADS"} input), :shape "__PeriodTriggersElement"})

(clojure.core/defn- ser-hls-manifest-create-or-update-parameters [input] (clojure.core/cond-> #:http.request.field{:value [(clojure.core/into (ser-string (:id input)) #:http.request.field{:name "Id", :location-name "id", :shape "__string"})], :shape "HlsManifestCreateOrUpdateParameters", :type "structure"} (clojure.core/contains? input :ad-markers) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-ad-markers (input :ad-markers)) #:http.request.field{:name "AdMarkers", :location-name "adMarkers", :shape "AdMarkers"})) (clojure.core/contains? input :include-iframe-only-stream) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-boolean (input :include-iframe-only-stream)) #:http.request.field{:name "IncludeIframeOnlyStream", :location-name "includeIframeOnlyStream", :shape "__boolean"})) (clojure.core/contains? input :manifest-name) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-string (input :manifest-name)) #:http.request.field{:name "ManifestName", :location-name "manifestName", :shape "__string"})) (clojure.core/contains? input :playlist-type) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-playlist-type (input :playlist-type)) #:http.request.field{:name "PlaylistType", :location-name "playlistType", :shape "PlaylistType"})) (clojure.core/contains? input :playlist-window-seconds) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-integer (input :playlist-window-seconds)) #:http.request.field{:name "PlaylistWindowSeconds", :location-name "playlistWindowSeconds", :shape "__integer"})) (clojure.core/contains? input :program-date-time-interval-seconds) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-integer (input :program-date-time-interval-seconds)) #:http.request.field{:name "ProgramDateTimeIntervalSeconds", :location-name "programDateTimeIntervalSeconds", :shape "__integer"}))))

(clojure.core/defn- ser-playlist-type [input] #:http.request.field{:value (clojure.core/get {"NONE" "NONE", :none "NONE", "EVENT" "EVENT", :event "EVENT", "VOD" "VOD", :vod "VOD"} input), :shape "PlaylistType"})

(clojure.core/defn- ser-map-of-string [input] #:http.request.field{:value (clojure.core/into [] (clojure.core/map (clojure.core/fn [[k v]] [(clojure.core/into (ser-string k) #:http.request.field{:map-info "key", :shape "__string"}) (clojure.core/into (ser-string v) #:http.request.field{:map-info "value", :shape "__string"})])) input), :shape "__mapOf__string", :type "map"})

(clojure.core/defn- req-update-channel-request [input] (clojure.core/cond-> #:http.request.configuration{:uri [(clojure.core/into (ser-string (input :id)) #:http.request.field{:name "Id", :location "uri", :location-name "id", :shape "__string"})]} (clojure.core/contains? input :description) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-string (input :description)) #:http.request.field{:name "Description", :location-name "description", :shape "__string"}))))

(clojure.core/defn- req-delete-origin-endpoint-request [input] (clojure.core/cond-> #:http.request.configuration{:uri [(clojure.core/into (ser-string (input :id)) #:http.request.field{:name "Id", :location "uri", :location-name "id", :shape "__string"})]}))

(clojure.core/defn- req-list-origin-endpoints-request [input] (clojure.core/cond-> {} (clojure.core/contains? input :channel-id) (clojure.core/update-in [:http.request.configuration/querystring] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-string (input :channel-id)) #:http.request.field{:name "ChannelId", :location "querystring", :location-name "channelId", :shape "__string"})) (clojure.core/contains? input :max-results) (clojure.core/update-in [:http.request.configuration/querystring] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-max-results (input :max-results)) #:http.request.field{:name "MaxResults", :location "querystring", :location-name "maxResults", :shape "MaxResults"})) (clojure.core/contains? input :next-token) (clojure.core/update-in [:http.request.configuration/querystring] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-string (input :next-token)) #:http.request.field{:name "NextToken", :location "querystring", :location-name "nextToken", :shape "__string"}))))

(clojure.core/defn- req-list-tags-for-resource-request [input] (clojure.core/cond-> #:http.request.configuration{:uri [(clojure.core/into (ser-string (input :resource-arn)) #:http.request.field{:name "ResourceArn", :location "uri", :location-name "resource-arn", :shape "__string"})]}))

(clojure.core/defn- req-describe-origin-endpoint-request [input] (clojure.core/cond-> #:http.request.configuration{:uri [(clojure.core/into (ser-string (input :id)) #:http.request.field{:name "Id", :location "uri", :location-name "id", :shape "__string"})]}))

(clojure.core/defn- req-rotate-ingest-endpoint-credentials-request [input] (clojure.core/cond-> #:http.request.configuration{:uri [(clojure.core/into (ser-string (input :ingest-endpoint-id)) #:http.request.field{:name "IngestEndpointId", :location "uri", :location-name "ingest_endpoint_id", :shape "__string"}) (clojure.core/into (ser-string (input :id)) #:http.request.field{:name "Id", :location "uri", :location-name "id", :shape "__string"})]}))

(clojure.core/defn- req-create-channel-request [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (ser-string (input :id)) #:http.request.field{:name "Id", :location-name "id", :shape "__string"})]} (clojure.core/contains? input :description) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-string (input :description)) #:http.request.field{:name "Description", :location-name "description", :shape "__string"})) (clojure.core/contains? input :tags) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-tags (input :tags)) #:http.request.field{:name "Tags", :location-name "tags", :shape "Tags"}))))

(clojure.core/defn- req-tag-resource-request [input] (clojure.core/cond-> #:http.request.configuration{:uri [(clojure.core/into (ser-string (input :resource-arn)) #:http.request.field{:name "ResourceArn", :location "uri", :location-name "resource-arn", :shape "__string"})], :body [(clojure.core/into (ser-map-of-string (input :tags)) #:http.request.field{:name "Tags", :location-name "tags", :shape "__mapOf__string"})]}))

(clojure.core/defn- req-create-origin-endpoint-request [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (ser-string (input :channel-id)) #:http.request.field{:name "ChannelId", :location-name "channelId", :shape "__string"}) (clojure.core/into (ser-string (input :id)) #:http.request.field{:name "Id", :location-name "id", :shape "__string"})]} (clojure.core/contains? input :hls-package) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-hls-package (input :hls-package)) #:http.request.field{:name "HlsPackage", :location-name "hlsPackage", :shape "HlsPackage"})) (clojure.core/contains? input :tags) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-tags (input :tags)) #:http.request.field{:name "Tags", :location-name "tags", :shape "Tags"})) (clojure.core/contains? input :mss-package) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-mss-package (input :mss-package)) #:http.request.field{:name "MssPackage", :location-name "mssPackage", :shape "MssPackage"})) (clojure.core/contains? input :cmaf-package) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-cmaf-package-create-or-update-parameters (input :cmaf-package)) #:http.request.field{:name "CmafPackage", :location-name "cmafPackage", :shape "CmafPackageCreateOrUpdateParameters"})) (clojure.core/contains? input :time-delay-seconds) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-integer (input :time-delay-seconds)) #:http.request.field{:name "TimeDelaySeconds", :location-name "timeDelaySeconds", :shape "__integer"})) (clojure.core/contains? input :description) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-string (input :description)) #:http.request.field{:name "Description", :location-name "description", :shape "__string"})) (clojure.core/contains? input :whitelist) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-list-of-string (input :whitelist)) #:http.request.field{:name "Whitelist", :location-name "whitelist", :shape "__listOf__string"})) (clojure.core/contains? input :dash-package) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-dash-package (input :dash-package)) #:http.request.field{:name "DashPackage", :location-name "dashPackage", :shape "DashPackage"})) (clojure.core/contains? input :manifest-name) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-string (input :manifest-name)) #:http.request.field{:name "ManifestName", :location-name "manifestName", :shape "__string"})) (clojure.core/contains? input :startover-window-seconds) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-integer (input :startover-window-seconds)) #:http.request.field{:name "StartoverWindowSeconds", :location-name "startoverWindowSeconds", :shape "__integer"}))))

(clojure.core/defn- req-delete-channel-request [input] (clojure.core/cond-> #:http.request.configuration{:uri [(clojure.core/into (ser-string (input :id)) #:http.request.field{:name "Id", :location "uri", :location-name "id", :shape "__string"})]}))

(clojure.core/defn- req-describe-channel-request [input] (clojure.core/cond-> #:http.request.configuration{:uri [(clojure.core/into (ser-string (input :id)) #:http.request.field{:name "Id", :location "uri", :location-name "id", :shape "__string"})]}))

(clojure.core/defn- req-list-channels-request [input] (clojure.core/cond-> {} (clojure.core/contains? input :max-results) (clojure.core/update-in [:http.request.configuration/querystring] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-max-results (input :max-results)) #:http.request.field{:name "MaxResults", :location "querystring", :location-name "maxResults", :shape "MaxResults"})) (clojure.core/contains? input :next-token) (clojure.core/update-in [:http.request.configuration/querystring] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-string (input :next-token)) #:http.request.field{:name "NextToken", :location "querystring", :location-name "nextToken", :shape "__string"}))))

(clojure.core/defn- req-rotate-channel-credentials-request [input] (clojure.core/cond-> #:http.request.configuration{:uri [(clojure.core/into (ser-string (input :id)) #:http.request.field{:name "Id", :location "uri", :location-name "id", :shape "__string"})]}))

(clojure.core/defn- req-untag-resource-request [input] (clojure.core/cond-> #:http.request.configuration{:querystring [(clojure.core/into (ser-list-of-string (input :tag-keys)) #:http.request.field{:name "TagKeys", :location "querystring", :location-name "tagKeys", :shape "__listOf__string"})], :uri [(clojure.core/into (ser-string (input :resource-arn)) #:http.request.field{:name "ResourceArn", :location "uri", :location-name "resource-arn", :shape "__string"})]}))

(clojure.core/defn- req-update-origin-endpoint-request [input] (clojure.core/cond-> #:http.request.configuration{:uri [(clojure.core/into (ser-string (input :id)) #:http.request.field{:name "Id", :location "uri", :location-name "id", :shape "__string"})]} (clojure.core/contains? input :hls-package) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-hls-package (input :hls-package)) #:http.request.field{:name "HlsPackage", :location-name "hlsPackage", :shape "HlsPackage"})) (clojure.core/contains? input :mss-package) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-mss-package (input :mss-package)) #:http.request.field{:name "MssPackage", :location-name "mssPackage", :shape "MssPackage"})) (clojure.core/contains? input :cmaf-package) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-cmaf-package-create-or-update-parameters (input :cmaf-package)) #:http.request.field{:name "CmafPackage", :location-name "cmafPackage", :shape "CmafPackageCreateOrUpdateParameters"})) (clojure.core/contains? input :time-delay-seconds) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-integer (input :time-delay-seconds)) #:http.request.field{:name "TimeDelaySeconds", :location-name "timeDelaySeconds", :shape "__integer"})) (clojure.core/contains? input :description) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-string (input :description)) #:http.request.field{:name "Description", :location-name "description", :shape "__string"})) (clojure.core/contains? input :whitelist) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-list-of-string (input :whitelist)) #:http.request.field{:name "Whitelist", :location-name "whitelist", :shape "__listOf__string"})) (clojure.core/contains? input :dash-package) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-dash-package (input :dash-package)) #:http.request.field{:name "DashPackage", :location-name "dashPackage", :shape "DashPackage"})) (clojure.core/contains? input :manifest-name) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-string (input :manifest-name)) #:http.request.field{:name "ManifestName", :location-name "manifestName", :shape "__string"})) (clojure.core/contains? input :startover-window-seconds) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-integer (input :startover-window-seconds)) #:http.request.field{:name "StartoverWindowSeconds", :location-name "startoverWindowSeconds", :shape "__integer"}))))

(clojure.core/declare deser-segment-template-format)

(clojure.core/declare deser-list-of-ingest-endpoint)

(clojure.core/declare deser-ad-markers)

(clojure.core/declare deser-stream-selection)

(clojure.core/declare deser-string)

(clojure.core/declare deser-hls-package)

(clojure.core/declare deser-ingest-endpoint)

(clojure.core/declare deser-tags)

(clojure.core/declare deser-mss-package)

(clojure.core/declare deser-dash-encryption)

(clojure.core/declare deser-cmaf-package)

(clojure.core/declare deser-mss-encryption)

(clojure.core/declare deser-hls-ingest)

(clojure.core/declare deser-origin-endpoint)

(clojure.core/declare deser-speke-key-provider)

(clojure.core/declare deser-list-of-hls-manifest)

(clojure.core/declare deser-hls-manifest)

(clojure.core/declare deser-list-of-string)

(clojure.core/declare deser-boolean)

(clojure.core/declare deser-profile)

(clojure.core/declare deser-hls-encryption)

(clojure.core/declare deser-list-of-channel)

(clojure.core/declare deser-manifest-layout)

(clojure.core/declare deser-list-of-origin-endpoint)

(clojure.core/declare deser-stream-order)

(clojure.core/declare deser-dash-package)

(clojure.core/declare deser-channel)

(clojure.core/declare deser-encryption-method)

(clojure.core/declare deser-list-of-period-triggers-element)

(clojure.core/declare deser-integer)

(clojure.core/declare deser-cmaf-encryption)

(clojure.core/declare deser-period-triggers-element)

(clojure.core/declare deser-playlist-type)

(clojure.core/declare deser-map-of-string)

(clojure.core/defn- deser-segment-template-format [input] (clojure.core/get {"NUMBER_WITH_TIMELINE" :number-with-timeline, "TIME_WITH_TIMELINE" :time-with-timeline} input))

(clojure.core/defn- deser-list-of-ingest-endpoint [input] (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (deser-ingest-endpoint coll))) input))

(clojure.core/defn- deser-ad-markers [input] (clojure.core/get {"NONE" :none, "SCTE35_ENHANCED" :scte-35-enhanced, "PASSTHROUGH" :passthrough} input))

(clojure.core/defn- deser-stream-selection [input] (clojure.core/cond-> {} (clojure.core/contains? input "maxVideoBitsPerSecond") (clojure.core/assoc :max-video-bits-per-second (deser-integer (input "maxVideoBitsPerSecond"))) (clojure.core/contains? input "minVideoBitsPerSecond") (clojure.core/assoc :min-video-bits-per-second (deser-integer (input "minVideoBitsPerSecond"))) (clojure.core/contains? input "streamOrder") (clojure.core/assoc :stream-order (deser-stream-order (input "streamOrder")))))

(clojure.core/defn- deser-string [input] input)

(clojure.core/defn- deser-hls-package [input] (clojure.core/cond-> {} (clojure.core/contains? input "adMarkers") (clojure.core/assoc :ad-markers (deser-ad-markers (input "adMarkers"))) (clojure.core/contains? input "streamSelection") (clojure.core/assoc :stream-selection (deser-stream-selection (input "streamSelection"))) (clojure.core/contains? input "includeIframeOnlyStream") (clojure.core/assoc :include-iframe-only-stream (deser-boolean (input "includeIframeOnlyStream"))) (clojure.core/contains? input "useAudioRenditionGroup") (clojure.core/assoc :use-audio-rendition-group (deser-boolean (input "useAudioRenditionGroup"))) (clojure.core/contains? input "programDateTimeIntervalSeconds") (clojure.core/assoc :program-date-time-interval-seconds (deser-integer (input "programDateTimeIntervalSeconds"))) (clojure.core/contains? input "encryption") (clojure.core/assoc :encryption (deser-hls-encryption (input "encryption"))) (clojure.core/contains? input "playlistWindowSeconds") (clojure.core/assoc :playlist-window-seconds (deser-integer (input "playlistWindowSeconds"))) (clojure.core/contains? input "segmentDurationSeconds") (clojure.core/assoc :segment-duration-seconds (deser-integer (input "segmentDurationSeconds"))) (clojure.core/contains? input "playlistType") (clojure.core/assoc :playlist-type (deser-playlist-type (input "playlistType")))))

(clojure.core/defn- deser-ingest-endpoint [input] (clojure.core/cond-> {} (clojure.core/contains? input "id") (clojure.core/assoc :id (deser-string (input "id"))) (clojure.core/contains? input "password") (clojure.core/assoc :password (deser-string (input "password"))) (clojure.core/contains? input "url") (clojure.core/assoc :url (deser-string (input "url"))) (clojure.core/contains? input "username") (clojure.core/assoc :username (deser-string (input "username")))))

(clojure.core/defn- deser-tags [input] (clojure.core/into {} (clojure.core/map (clojure.core/fn [[k v]] [(deser-string k) (deser-string v)])) input))

(clojure.core/defn- deser-mss-package [input] (clojure.core/cond-> {} (clojure.core/contains? input "encryption") (clojure.core/assoc :encryption (deser-mss-encryption (input "encryption"))) (clojure.core/contains? input "manifestWindowSeconds") (clojure.core/assoc :manifest-window-seconds (deser-integer (input "manifestWindowSeconds"))) (clojure.core/contains? input "segmentDurationSeconds") (clojure.core/assoc :segment-duration-seconds (deser-integer (input "segmentDurationSeconds"))) (clojure.core/contains? input "streamSelection") (clojure.core/assoc :stream-selection (deser-stream-selection (input "streamSelection")))))

(clojure.core/defn- deser-dash-encryption [input] (clojure.core/cond-> {:speke-key-provider (deser-speke-key-provider (input "spekeKeyProvider"))} (clojure.core/contains? input "keyRotationIntervalSeconds") (clojure.core/assoc :key-rotation-interval-seconds (deser-integer (input "keyRotationIntervalSeconds")))))

(clojure.core/defn- deser-cmaf-package [input] (clojure.core/cond-> {} (clojure.core/contains? input "encryption") (clojure.core/assoc :encryption (deser-cmaf-encryption (input "encryption"))) (clojure.core/contains? input "hlsManifests") (clojure.core/assoc :hls-manifests (deser-list-of-hls-manifest (input "hlsManifests"))) (clojure.core/contains? input "segmentDurationSeconds") (clojure.core/assoc :segment-duration-seconds (deser-integer (input "segmentDurationSeconds"))) (clojure.core/contains? input "segmentPrefix") (clojure.core/assoc :segment-prefix (deser-string (input "segmentPrefix"))) (clojure.core/contains? input "streamSelection") (clojure.core/assoc :stream-selection (deser-stream-selection (input "streamSelection")))))

(clojure.core/defn- deser-mss-encryption [input] (clojure.core/cond-> {:speke-key-provider (deser-speke-key-provider (input "spekeKeyProvider"))}))

(clojure.core/defn- deser-hls-ingest [input] (clojure.core/cond-> {} (clojure.core/contains? input "ingestEndpoints") (clojure.core/assoc :ingest-endpoints (deser-list-of-ingest-endpoint (input "ingestEndpoints")))))

(clojure.core/defn- deser-origin-endpoint [input] (clojure.core/cond-> {} (clojure.core/contains? input "hlsPackage") (clojure.core/assoc :hls-package (deser-hls-package (input "hlsPackage"))) (clojure.core/contains? input "channelId") (clojure.core/assoc :channel-id (deser-string (input "channelId"))) (clojure.core/contains? input "tags") (clojure.core/assoc :tags (deser-tags (input "tags"))) (clojure.core/contains? input "mssPackage") (clojure.core/assoc :mss-package (deser-mss-package (input "mssPackage"))) (clojure.core/contains? input "cmafPackage") (clojure.core/assoc :cmaf-package (deser-cmaf-package (input "cmafPackage"))) (clojure.core/contains? input "timeDelaySeconds") (clojure.core/assoc :time-delay-seconds (deser-integer (input "timeDelaySeconds"))) (clojure.core/contains? input "url") (clojure.core/assoc :url (deser-string (input "url"))) (clojure.core/contains? input "description") (clojure.core/assoc :description (deser-string (input "description"))) (clojure.core/contains? input "whitelist") (clojure.core/assoc :whitelist (deser-list-of-string (input "whitelist"))) (clojure.core/contains? input "arn") (clojure.core/assoc :arn (deser-string (input "arn"))) (clojure.core/contains? input "dashPackage") (clojure.core/assoc :dash-package (deser-dash-package (input "dashPackage"))) (clojure.core/contains? input "manifestName") (clojure.core/assoc :manifest-name (deser-string (input "manifestName"))) (clojure.core/contains? input "startoverWindowSeconds") (clojure.core/assoc :startover-window-seconds (deser-integer (input "startoverWindowSeconds"))) (clojure.core/contains? input "id") (clojure.core/assoc :id (deser-string (input "id")))))

(clojure.core/defn- deser-speke-key-provider [input] (clojure.core/cond-> {:url (deser-string (input "url")), :resource-id (deser-string (input "resourceId")), :role-arn (deser-string (input "roleArn")), :system-ids (deser-list-of-string (input "systemIds"))} (clojure.core/contains? input "certificateArn") (clojure.core/assoc :certificate-arn (deser-string (input "certificateArn")))))

(clojure.core/defn- deser-list-of-hls-manifest [input] (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (deser-hls-manifest coll))) input))

(clojure.core/defn- deser-hls-manifest [input] (clojure.core/cond-> {:id (deser-string (input "id"))} (clojure.core/contains? input "adMarkers") (clojure.core/assoc :ad-markers (deser-ad-markers (input "adMarkers"))) (clojure.core/contains? input "includeIframeOnlyStream") (clojure.core/assoc :include-iframe-only-stream (deser-boolean (input "includeIframeOnlyStream"))) (clojure.core/contains? input "manifestName") (clojure.core/assoc :manifest-name (deser-string (input "manifestName"))) (clojure.core/contains? input "playlistType") (clojure.core/assoc :playlist-type (deser-playlist-type (input "playlistType"))) (clojure.core/contains? input "playlistWindowSeconds") (clojure.core/assoc :playlist-window-seconds (deser-integer (input "playlistWindowSeconds"))) (clojure.core/contains? input "programDateTimeIntervalSeconds") (clojure.core/assoc :program-date-time-interval-seconds (deser-integer (input "programDateTimeIntervalSeconds"))) (clojure.core/contains? input "url") (clojure.core/assoc :url (deser-string (input "url")))))

(clojure.core/defn- deser-list-of-string [input] (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (deser-string coll))) input))

(clojure.core/defn- deser-boolean [input] input)

(clojure.core/defn- deser-profile [input] (clojure.core/get {"NONE" :none, "HBBTV_1_5" :hbbtv-1-5} input))

(clojure.core/defn- deser-hls-encryption [input] (clojure.core/cond-> {:speke-key-provider (deser-speke-key-provider (input "spekeKeyProvider"))} (clojure.core/contains? input "constantInitializationVector") (clojure.core/assoc :constant-initialization-vector (deser-string (input "constantInitializationVector"))) (clojure.core/contains? input "encryptionMethod") (clojure.core/assoc :encryption-method (deser-encryption-method (input "encryptionMethod"))) (clojure.core/contains? input "keyRotationIntervalSeconds") (clojure.core/assoc :key-rotation-interval-seconds (deser-integer (input "keyRotationIntervalSeconds"))) (clojure.core/contains? input "repeatExtXKey") (clojure.core/assoc :repeat-ext-x-key (deser-boolean (input "repeatExtXKey")))))

(clojure.core/defn- deser-list-of-channel [input] (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (deser-channel coll))) input))

(clojure.core/defn- deser-manifest-layout [input] (clojure.core/get {"FULL" :full, "COMPACT" :compact} input))

(clojure.core/defn- deser-list-of-origin-endpoint [input] (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (deser-origin-endpoint coll))) input))

(clojure.core/defn- deser-stream-order [input] (clojure.core/get {"ORIGINAL" :original, "VIDEO_BITRATE_ASCENDING" :video-bitrate-ascending, "VIDEO_BITRATE_DESCENDING" :video-bitrate-descending} input))

(clojure.core/defn- deser-dash-package [input] (clojure.core/cond-> {} (clojure.core/contains? input "minUpdatePeriodSeconds") (clojure.core/assoc :min-update-period-seconds (deser-integer (input "minUpdatePeriodSeconds"))) (clojure.core/contains? input "segmentTemplateFormat") (clojure.core/assoc :segment-template-format (deser-segment-template-format (input "segmentTemplateFormat"))) (clojure.core/contains? input "streamSelection") (clojure.core/assoc :stream-selection (deser-stream-selection (input "streamSelection"))) (clojure.core/contains? input "manifestWindowSeconds") (clojure.core/assoc :manifest-window-seconds (deser-integer (input "manifestWindowSeconds"))) (clojure.core/contains? input "profile") (clojure.core/assoc :profile (deser-profile (input "profile"))) (clojure.core/contains? input "periodTriggers") (clojure.core/assoc :period-triggers (deser-list-of-period-triggers-element (input "periodTriggers"))) (clojure.core/contains? input "manifestLayout") (clojure.core/assoc :manifest-layout (deser-manifest-layout (input "manifestLayout"))) (clojure.core/contains? input "minBufferTimeSeconds") (clojure.core/assoc :min-buffer-time-seconds (deser-integer (input "minBufferTimeSeconds"))) (clojure.core/contains? input "encryption") (clojure.core/assoc :encryption (deser-dash-encryption (input "encryption"))) (clojure.core/contains? input "segmentDurationSeconds") (clojure.core/assoc :segment-duration-seconds (deser-integer (input "segmentDurationSeconds"))) (clojure.core/contains? input "suggestedPresentationDelaySeconds") (clojure.core/assoc :suggested-presentation-delay-seconds (deser-integer (input "suggestedPresentationDelaySeconds")))))

(clojure.core/defn- deser-channel [input] (clojure.core/cond-> {} (clojure.core/contains? input "arn") (clojure.core/assoc :arn (deser-string (input "arn"))) (clojure.core/contains? input "description") (clojure.core/assoc :description (deser-string (input "description"))) (clojure.core/contains? input "hlsIngest") (clojure.core/assoc :hls-ingest (deser-hls-ingest (input "hlsIngest"))) (clojure.core/contains? input "id") (clojure.core/assoc :id (deser-string (input "id"))) (clojure.core/contains? input "tags") (clojure.core/assoc :tags (deser-tags (input "tags")))))

(clojure.core/defn- deser-encryption-method [input] (clojure.core/get {"AES_128" :aes-128, "SAMPLE_AES" :sample-aes} input))

(clojure.core/defn- deser-list-of-period-triggers-element [input] (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (deser-period-triggers-element coll))) input))

(clojure.core/defn- deser-integer [input] input)

(clojure.core/defn- deser-cmaf-encryption [input] (clojure.core/cond-> {:speke-key-provider (deser-speke-key-provider (input "spekeKeyProvider"))} (clojure.core/contains? input "keyRotationIntervalSeconds") (clojure.core/assoc :key-rotation-interval-seconds (deser-integer (input "keyRotationIntervalSeconds")))))

(clojure.core/defn- deser-period-triggers-element [input] (clojure.core/get {"ADS" :ads} input))

(clojure.core/defn- deser-playlist-type [input] (clojure.core/get {"NONE" :none, "EVENT" :event, "VOD" :vod} input))

(clojure.core/defn- deser-map-of-string [input] (clojure.core/into {} (clojure.core/map (clojure.core/fn [[k v]] [(deser-string k) (deser-string v)])) input))

(clojure.core/defn- response-internal-server-error-exception ([input] (response-internal-server-error-exception nil input)) ([resultWrapper1361010 input] (clojure.core/let [rawinput1361009 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar1361011 {"message" (rawinput1361009 "message")}] (clojure.core/cond-> {} (letvar1361011 "message") (clojure.core/assoc :message (deser-string (clojure.core/get-in letvar1361011 ["message"])))))))

(clojure.core/defn- response-list-tags-for-resource-response ([input] (response-list-tags-for-resource-response nil input)) ([resultWrapper1361013 input] (clojure.core/let [rawinput1361012 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar1361014 {"tags" (rawinput1361012 "tags")}] (clojure.core/cond-> {} (letvar1361014 "tags") (clojure.core/assoc :tags (deser-map-of-string (clojure.core/get-in letvar1361014 ["tags"])))))))

(clojure.core/defn- response-create-origin-endpoint-response ([input] (response-create-origin-endpoint-response nil input)) ([resultWrapper1361016 input] (clojure.core/let [rawinput1361015 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar1361017 {"url" (rawinput1361015 "url"), "arn" (rawinput1361015 "arn"), "cmafPackage" (rawinput1361015 "cmafPackage"), "tags" (rawinput1361015 "tags"), "manifestName" (rawinput1361015 "manifestName"), "whitelist" (rawinput1361015 "whitelist"), "id" (rawinput1361015 "id"), "timeDelaySeconds" (rawinput1361015 "timeDelaySeconds"), "dashPackage" (rawinput1361015 "dashPackage"), "startoverWindowSeconds" (rawinput1361015 "startoverWindowSeconds"), "channelId" (rawinput1361015 "channelId"), "hlsPackage" (rawinput1361015 "hlsPackage"), "mssPackage" (rawinput1361015 "mssPackage"), "description" (rawinput1361015 "description")}] (clojure.core/cond-> {} (letvar1361017 "hlsPackage") (clojure.core/assoc :hls-package (deser-hls-package (clojure.core/get-in letvar1361017 ["hlsPackage"]))) (letvar1361017 "channelId") (clojure.core/assoc :channel-id (deser-string (clojure.core/get-in letvar1361017 ["channelId"]))) (letvar1361017 "tags") (clojure.core/assoc :tags (deser-tags (clojure.core/get-in letvar1361017 ["tags"]))) (letvar1361017 "mssPackage") (clojure.core/assoc :mss-package (deser-mss-package (clojure.core/get-in letvar1361017 ["mssPackage"]))) (letvar1361017 "cmafPackage") (clojure.core/assoc :cmaf-package (deser-cmaf-package (clojure.core/get-in letvar1361017 ["cmafPackage"]))) (letvar1361017 "timeDelaySeconds") (clojure.core/assoc :time-delay-seconds (deser-integer (clojure.core/get-in letvar1361017 ["timeDelaySeconds"]))) (letvar1361017 "url") (clojure.core/assoc :url (deser-string (clojure.core/get-in letvar1361017 ["url"]))) (letvar1361017 "description") (clojure.core/assoc :description (deser-string (clojure.core/get-in letvar1361017 ["description"]))) (letvar1361017 "whitelist") (clojure.core/assoc :whitelist (deser-list-of-string (clojure.core/get-in letvar1361017 ["whitelist"]))) (letvar1361017 "arn") (clojure.core/assoc :arn (deser-string (clojure.core/get-in letvar1361017 ["arn"]))) (letvar1361017 "dashPackage") (clojure.core/assoc :dash-package (deser-dash-package (clojure.core/get-in letvar1361017 ["dashPackage"]))) (letvar1361017 "manifestName") (clojure.core/assoc :manifest-name (deser-string (clojure.core/get-in letvar1361017 ["manifestName"]))) (letvar1361017 "startoverWindowSeconds") (clojure.core/assoc :startover-window-seconds (deser-integer (clojure.core/get-in letvar1361017 ["startoverWindowSeconds"]))) (letvar1361017 "id") (clojure.core/assoc :id (deser-string (clojure.core/get-in letvar1361017 ["id"])))))))

(clojure.core/defn- response-forbidden-exception ([input] (response-forbidden-exception nil input)) ([resultWrapper1361019 input] (clojure.core/let [rawinput1361018 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar1361020 {"message" (rawinput1361018 "message")}] (clojure.core/cond-> {} (letvar1361020 "message") (clojure.core/assoc :message (deser-string (clojure.core/get-in letvar1361020 ["message"])))))))

(clojure.core/defn- response-create-channel-response ([input] (response-create-channel-response nil input)) ([resultWrapper1361022 input] (clojure.core/let [rawinput1361021 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar1361023 {"arn" (rawinput1361021 "arn"), "description" (rawinput1361021 "description"), "hlsIngest" (rawinput1361021 "hlsIngest"), "id" (rawinput1361021 "id"), "tags" (rawinput1361021 "tags")}] (clojure.core/cond-> {} (letvar1361023 "arn") (clojure.core/assoc :arn (deser-string (clojure.core/get-in letvar1361023 ["arn"]))) (letvar1361023 "description") (clojure.core/assoc :description (deser-string (clojure.core/get-in letvar1361023 ["description"]))) (letvar1361023 "hlsIngest") (clojure.core/assoc :hls-ingest (deser-hls-ingest (clojure.core/get-in letvar1361023 ["hlsIngest"]))) (letvar1361023 "id") (clojure.core/assoc :id (deser-string (clojure.core/get-in letvar1361023 ["id"]))) (letvar1361023 "tags") (clojure.core/assoc :tags (deser-tags (clojure.core/get-in letvar1361023 ["tags"])))))))

(clojure.core/defn- response-unprocessable-entity-exception ([input] (response-unprocessable-entity-exception nil input)) ([resultWrapper1361025 input] (clojure.core/let [rawinput1361024 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar1361026 {"message" (rawinput1361024 "message")}] (clojure.core/cond-> {} (letvar1361026 "message") (clojure.core/assoc :message (deser-string (clojure.core/get-in letvar1361026 ["message"])))))))

(clojure.core/defn- response-describe-channel-response ([input] (response-describe-channel-response nil input)) ([resultWrapper1361028 input] (clojure.core/let [rawinput1361027 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar1361029 {"arn" (rawinput1361027 "arn"), "description" (rawinput1361027 "description"), "hlsIngest" (rawinput1361027 "hlsIngest"), "id" (rawinput1361027 "id"), "tags" (rawinput1361027 "tags")}] (clojure.core/cond-> {} (letvar1361029 "arn") (clojure.core/assoc :arn (deser-string (clojure.core/get-in letvar1361029 ["arn"]))) (letvar1361029 "description") (clojure.core/assoc :description (deser-string (clojure.core/get-in letvar1361029 ["description"]))) (letvar1361029 "hlsIngest") (clojure.core/assoc :hls-ingest (deser-hls-ingest (clojure.core/get-in letvar1361029 ["hlsIngest"]))) (letvar1361029 "id") (clojure.core/assoc :id (deser-string (clojure.core/get-in letvar1361029 ["id"]))) (letvar1361029 "tags") (clojure.core/assoc :tags (deser-tags (clojure.core/get-in letvar1361029 ["tags"])))))))

(clojure.core/defn- response-describe-origin-endpoint-response ([input] (response-describe-origin-endpoint-response nil input)) ([resultWrapper1361031 input] (clojure.core/let [rawinput1361030 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar1361032 {"url" (rawinput1361030 "url"), "arn" (rawinput1361030 "arn"), "cmafPackage" (rawinput1361030 "cmafPackage"), "tags" (rawinput1361030 "tags"), "manifestName" (rawinput1361030 "manifestName"), "whitelist" (rawinput1361030 "whitelist"), "id" (rawinput1361030 "id"), "timeDelaySeconds" (rawinput1361030 "timeDelaySeconds"), "dashPackage" (rawinput1361030 "dashPackage"), "startoverWindowSeconds" (rawinput1361030 "startoverWindowSeconds"), "channelId" (rawinput1361030 "channelId"), "hlsPackage" (rawinput1361030 "hlsPackage"), "mssPackage" (rawinput1361030 "mssPackage"), "description" (rawinput1361030 "description")}] (clojure.core/cond-> {} (letvar1361032 "hlsPackage") (clojure.core/assoc :hls-package (deser-hls-package (clojure.core/get-in letvar1361032 ["hlsPackage"]))) (letvar1361032 "channelId") (clojure.core/assoc :channel-id (deser-string (clojure.core/get-in letvar1361032 ["channelId"]))) (letvar1361032 "tags") (clojure.core/assoc :tags (deser-tags (clojure.core/get-in letvar1361032 ["tags"]))) (letvar1361032 "mssPackage") (clojure.core/assoc :mss-package (deser-mss-package (clojure.core/get-in letvar1361032 ["mssPackage"]))) (letvar1361032 "cmafPackage") (clojure.core/assoc :cmaf-package (deser-cmaf-package (clojure.core/get-in letvar1361032 ["cmafPackage"]))) (letvar1361032 "timeDelaySeconds") (clojure.core/assoc :time-delay-seconds (deser-integer (clojure.core/get-in letvar1361032 ["timeDelaySeconds"]))) (letvar1361032 "url") (clojure.core/assoc :url (deser-string (clojure.core/get-in letvar1361032 ["url"]))) (letvar1361032 "description") (clojure.core/assoc :description (deser-string (clojure.core/get-in letvar1361032 ["description"]))) (letvar1361032 "whitelist") (clojure.core/assoc :whitelist (deser-list-of-string (clojure.core/get-in letvar1361032 ["whitelist"]))) (letvar1361032 "arn") (clojure.core/assoc :arn (deser-string (clojure.core/get-in letvar1361032 ["arn"]))) (letvar1361032 "dashPackage") (clojure.core/assoc :dash-package (deser-dash-package (clojure.core/get-in letvar1361032 ["dashPackage"]))) (letvar1361032 "manifestName") (clojure.core/assoc :manifest-name (deser-string (clojure.core/get-in letvar1361032 ["manifestName"]))) (letvar1361032 "startoverWindowSeconds") (clojure.core/assoc :startover-window-seconds (deser-integer (clojure.core/get-in letvar1361032 ["startoverWindowSeconds"]))) (letvar1361032 "id") (clojure.core/assoc :id (deser-string (clojure.core/get-in letvar1361032 ["id"])))))))

(clojure.core/defn- response-update-origin-endpoint-response ([input] (response-update-origin-endpoint-response nil input)) ([resultWrapper1361034 input] (clojure.core/let [rawinput1361033 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar1361035 {"url" (rawinput1361033 "url"), "arn" (rawinput1361033 "arn"), "cmafPackage" (rawinput1361033 "cmafPackage"), "tags" (rawinput1361033 "tags"), "manifestName" (rawinput1361033 "manifestName"), "whitelist" (rawinput1361033 "whitelist"), "id" (rawinput1361033 "id"), "timeDelaySeconds" (rawinput1361033 "timeDelaySeconds"), "dashPackage" (rawinput1361033 "dashPackage"), "startoverWindowSeconds" (rawinput1361033 "startoverWindowSeconds"), "channelId" (rawinput1361033 "channelId"), "hlsPackage" (rawinput1361033 "hlsPackage"), "mssPackage" (rawinput1361033 "mssPackage"), "description" (rawinput1361033 "description")}] (clojure.core/cond-> {} (letvar1361035 "hlsPackage") (clojure.core/assoc :hls-package (deser-hls-package (clojure.core/get-in letvar1361035 ["hlsPackage"]))) (letvar1361035 "channelId") (clojure.core/assoc :channel-id (deser-string (clojure.core/get-in letvar1361035 ["channelId"]))) (letvar1361035 "tags") (clojure.core/assoc :tags (deser-tags (clojure.core/get-in letvar1361035 ["tags"]))) (letvar1361035 "mssPackage") (clojure.core/assoc :mss-package (deser-mss-package (clojure.core/get-in letvar1361035 ["mssPackage"]))) (letvar1361035 "cmafPackage") (clojure.core/assoc :cmaf-package (deser-cmaf-package (clojure.core/get-in letvar1361035 ["cmafPackage"]))) (letvar1361035 "timeDelaySeconds") (clojure.core/assoc :time-delay-seconds (deser-integer (clojure.core/get-in letvar1361035 ["timeDelaySeconds"]))) (letvar1361035 "url") (clojure.core/assoc :url (deser-string (clojure.core/get-in letvar1361035 ["url"]))) (letvar1361035 "description") (clojure.core/assoc :description (deser-string (clojure.core/get-in letvar1361035 ["description"]))) (letvar1361035 "whitelist") (clojure.core/assoc :whitelist (deser-list-of-string (clojure.core/get-in letvar1361035 ["whitelist"]))) (letvar1361035 "arn") (clojure.core/assoc :arn (deser-string (clojure.core/get-in letvar1361035 ["arn"]))) (letvar1361035 "dashPackage") (clojure.core/assoc :dash-package (deser-dash-package (clojure.core/get-in letvar1361035 ["dashPackage"]))) (letvar1361035 "manifestName") (clojure.core/assoc :manifest-name (deser-string (clojure.core/get-in letvar1361035 ["manifestName"]))) (letvar1361035 "startoverWindowSeconds") (clojure.core/assoc :startover-window-seconds (deser-integer (clojure.core/get-in letvar1361035 ["startoverWindowSeconds"]))) (letvar1361035 "id") (clojure.core/assoc :id (deser-string (clojure.core/get-in letvar1361035 ["id"])))))))

(clojure.core/defn- response-service-unavailable-exception ([input] (response-service-unavailable-exception nil input)) ([resultWrapper1361037 input] (clojure.core/let [rawinput1361036 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar1361038 {"message" (rawinput1361036 "message")}] (clojure.core/cond-> {} (letvar1361038 "message") (clojure.core/assoc :message (deser-string (clojure.core/get-in letvar1361038 ["message"])))))))

(clojure.core/defn- response-delete-channel-response ([input] (response-delete-channel-response nil input)) ([resultWrapper1361040 input] (clojure.core/let [rawinput1361039 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar1361041 {}] (clojure.core/cond-> {}))))

(clojure.core/defn- response-too-many-requests-exception ([input] (response-too-many-requests-exception nil input)) ([resultWrapper1361043 input] (clojure.core/let [rawinput1361042 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar1361044 {"message" (rawinput1361042 "message")}] (clojure.core/cond-> {} (letvar1361044 "message") (clojure.core/assoc :message (deser-string (clojure.core/get-in letvar1361044 ["message"])))))))

(clojure.core/defn- response-list-channels-response ([input] (response-list-channels-response nil input)) ([resultWrapper1361046 input] (clojure.core/let [rawinput1361045 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar1361047 {"channels" (rawinput1361045 "channels"), "nextToken" (rawinput1361045 "nextToken")}] (clojure.core/cond-> {} (letvar1361047 "channels") (clojure.core/assoc :channels (deser-list-of-channel (clojure.core/get-in letvar1361047 ["channels"]))) (letvar1361047 "nextToken") (clojure.core/assoc :next-token (deser-string (clojure.core/get-in letvar1361047 ["nextToken"])))))))

(clojure.core/defn- response-not-found-exception ([input] (response-not-found-exception nil input)) ([resultWrapper1361049 input] (clojure.core/let [rawinput1361048 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar1361050 {"message" (rawinput1361048 "message")}] (clojure.core/cond-> {} (letvar1361050 "message") (clojure.core/assoc :message (deser-string (clojure.core/get-in letvar1361050 ["message"])))))))

(clojure.core/defn- response-rotate-channel-credentials-response ([input] (response-rotate-channel-credentials-response nil input)) ([resultWrapper1361052 input] (clojure.core/let [rawinput1361051 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar1361053 {"arn" (rawinput1361051 "arn"), "description" (rawinput1361051 "description"), "hlsIngest" (rawinput1361051 "hlsIngest"), "id" (rawinput1361051 "id"), "tags" (rawinput1361051 "tags")}] (clojure.core/cond-> {} (letvar1361053 "arn") (clojure.core/assoc :arn (deser-string (clojure.core/get-in letvar1361053 ["arn"]))) (letvar1361053 "description") (clojure.core/assoc :description (deser-string (clojure.core/get-in letvar1361053 ["description"]))) (letvar1361053 "hlsIngest") (clojure.core/assoc :hls-ingest (deser-hls-ingest (clojure.core/get-in letvar1361053 ["hlsIngest"]))) (letvar1361053 "id") (clojure.core/assoc :id (deser-string (clojure.core/get-in letvar1361053 ["id"]))) (letvar1361053 "tags") (clojure.core/assoc :tags (deser-tags (clojure.core/get-in letvar1361053 ["tags"])))))))

(clojure.core/defn- response-list-origin-endpoints-response ([input] (response-list-origin-endpoints-response nil input)) ([resultWrapper1361055 input] (clojure.core/let [rawinput1361054 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar1361056 {"nextToken" (rawinput1361054 "nextToken"), "originEndpoints" (rawinput1361054 "originEndpoints")}] (clojure.core/cond-> {} (letvar1361056 "nextToken") (clojure.core/assoc :next-token (deser-string (clojure.core/get-in letvar1361056 ["nextToken"]))) (letvar1361056 "originEndpoints") (clojure.core/assoc :origin-endpoints (deser-list-of-origin-endpoint (clojure.core/get-in letvar1361056 ["originEndpoints"])))))))

(clojure.core/defn- response-delete-origin-endpoint-response ([input] (response-delete-origin-endpoint-response nil input)) ([resultWrapper1361058 input] (clojure.core/let [rawinput1361057 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar1361059 {}] (clojure.core/cond-> {}))))

(clojure.core/defn- response-rotate-ingest-endpoint-credentials-response ([input] (response-rotate-ingest-endpoint-credentials-response nil input)) ([resultWrapper1361061 input] (clojure.core/let [rawinput1361060 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar1361062 {"arn" (rawinput1361060 "arn"), "description" (rawinput1361060 "description"), "hlsIngest" (rawinput1361060 "hlsIngest"), "id" (rawinput1361060 "id"), "tags" (rawinput1361060 "tags")}] (clojure.core/cond-> {} (letvar1361062 "arn") (clojure.core/assoc :arn (deser-string (clojure.core/get-in letvar1361062 ["arn"]))) (letvar1361062 "description") (clojure.core/assoc :description (deser-string (clojure.core/get-in letvar1361062 ["description"]))) (letvar1361062 "hlsIngest") (clojure.core/assoc :hls-ingest (deser-hls-ingest (clojure.core/get-in letvar1361062 ["hlsIngest"]))) (letvar1361062 "id") (clojure.core/assoc :id (deser-string (clojure.core/get-in letvar1361062 ["id"]))) (letvar1361062 "tags") (clojure.core/assoc :tags (deser-tags (clojure.core/get-in letvar1361062 ["tags"])))))))

(clojure.core/defn- response-update-channel-response ([input] (response-update-channel-response nil input)) ([resultWrapper1361064 input] (clojure.core/let [rawinput1361063 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar1361065 {"arn" (rawinput1361063 "arn"), "description" (rawinput1361063 "description"), "hlsIngest" (rawinput1361063 "hlsIngest"), "id" (rawinput1361063 "id"), "tags" (rawinput1361063 "tags")}] (clojure.core/cond-> {} (letvar1361065 "arn") (clojure.core/assoc :arn (deser-string (clojure.core/get-in letvar1361065 ["arn"]))) (letvar1361065 "description") (clojure.core/assoc :description (deser-string (clojure.core/get-in letvar1361065 ["description"]))) (letvar1361065 "hlsIngest") (clojure.core/assoc :hls-ingest (deser-hls-ingest (clojure.core/get-in letvar1361065 ["hlsIngest"]))) (letvar1361065 "id") (clojure.core/assoc :id (deser-string (clojure.core/get-in letvar1361065 ["id"]))) (letvar1361065 "tags") (clojure.core/assoc :tags (deser-tags (clojure.core/get-in letvar1361065 ["tags"])))))))

(clojure.spec.alpha/def :portkey.aws.mediapackage.internal-server-error-exception/message (clojure.spec.alpha/and :portkey.aws.mediapackage/string))
(clojure.spec.alpha/def :portkey.aws.mediapackage/internal-server-error-exception (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.mediapackage.internal-server-error-exception/message]))

(clojure.spec.alpha/def :portkey.aws.mediapackage/segment-template-format #{"NUMBER_WITH_TIMELINE" :number-with-timeline :time-with-timeline "TIME_WITH_TIMELINE"})

(clojure.spec.alpha/def :portkey.aws.mediapackage.cmaf-package-create-or-update-parameters/encryption (clojure.spec.alpha/and :portkey.aws.mediapackage/cmaf-encryption))
(clojure.spec.alpha/def :portkey.aws.mediapackage.cmaf-package-create-or-update-parameters/hls-manifests (clojure.spec.alpha/and :portkey.aws.mediapackage/list-of-hls-manifest-create-or-update-parameters))
(clojure.spec.alpha/def :portkey.aws.mediapackage.cmaf-package-create-or-update-parameters/segment-duration-seconds (clojure.spec.alpha/and :portkey.aws.mediapackage/integer))
(clojure.spec.alpha/def :portkey.aws.mediapackage.cmaf-package-create-or-update-parameters/segment-prefix (clojure.spec.alpha/and :portkey.aws.mediapackage/string))
(clojure.spec.alpha/def :portkey.aws.mediapackage/cmaf-package-create-or-update-parameters (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.mediapackage.cmaf-package-create-or-update-parameters/encryption :portkey.aws.mediapackage.cmaf-package-create-or-update-parameters/hls-manifests :portkey.aws.mediapackage.cmaf-package-create-or-update-parameters/segment-duration-seconds :portkey.aws.mediapackage.cmaf-package-create-or-update-parameters/segment-prefix :portkey.aws.mediapackage/stream-selection]))

(clojure.spec.alpha/def :portkey.aws.mediapackage.update-channel-request/description (clojure.spec.alpha/and :portkey.aws.mediapackage/string))
(clojure.spec.alpha/def :portkey.aws.mediapackage.update-channel-request/id (clojure.spec.alpha/and :portkey.aws.mediapackage/string))
(clojure.spec.alpha/def :portkey.aws.mediapackage/update-channel-request (clojure.spec.alpha/keys :req-un [:portkey.aws.mediapackage.update-channel-request/id] :opt-un [:portkey.aws.mediapackage.update-channel-request/description]))

(clojure.spec.alpha/def :portkey.aws.mediapackage/list-of-ingest-endpoint (clojure.spec.alpha/coll-of :portkey.aws.mediapackage/ingest-endpoint))

(clojure.spec.alpha/def :portkey.aws.mediapackage.list-tags-for-resource-response/tags (clojure.spec.alpha/and :portkey.aws.mediapackage/map-of-string))
(clojure.spec.alpha/def :portkey.aws.mediapackage/list-tags-for-resource-response (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.mediapackage.list-tags-for-resource-response/tags]))

(clojure.spec.alpha/def :portkey.aws.mediapackage.create-origin-endpoint-response/channel-id (clojure.spec.alpha/and :portkey.aws.mediapackage/string))
(clojure.spec.alpha/def :portkey.aws.mediapackage.create-origin-endpoint-response/time-delay-seconds (clojure.spec.alpha/and :portkey.aws.mediapackage/integer))
(clojure.spec.alpha/def :portkey.aws.mediapackage.create-origin-endpoint-response/url (clojure.spec.alpha/and :portkey.aws.mediapackage/string))
(clojure.spec.alpha/def :portkey.aws.mediapackage.create-origin-endpoint-response/description (clojure.spec.alpha/and :portkey.aws.mediapackage/string))
(clojure.spec.alpha/def :portkey.aws.mediapackage.create-origin-endpoint-response/whitelist (clojure.spec.alpha/and :portkey.aws.mediapackage/list-of-string))
(clojure.spec.alpha/def :portkey.aws.mediapackage.create-origin-endpoint-response/arn (clojure.spec.alpha/and :portkey.aws.mediapackage/string))
(clojure.spec.alpha/def :portkey.aws.mediapackage.create-origin-endpoint-response/manifest-name (clojure.spec.alpha/and :portkey.aws.mediapackage/string))
(clojure.spec.alpha/def :portkey.aws.mediapackage.create-origin-endpoint-response/startover-window-seconds (clojure.spec.alpha/and :portkey.aws.mediapackage/integer))
(clojure.spec.alpha/def :portkey.aws.mediapackage.create-origin-endpoint-response/id (clojure.spec.alpha/and :portkey.aws.mediapackage/string))
(clojure.spec.alpha/def :portkey.aws.mediapackage/create-origin-endpoint-response (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.mediapackage/hls-package :portkey.aws.mediapackage.create-origin-endpoint-response/channel-id :portkey.aws.mediapackage/tags :portkey.aws.mediapackage/mss-package :portkey.aws.mediapackage/cmaf-package :portkey.aws.mediapackage.create-origin-endpoint-response/time-delay-seconds :portkey.aws.mediapackage.create-origin-endpoint-response/url :portkey.aws.mediapackage.create-origin-endpoint-response/description :portkey.aws.mediapackage.create-origin-endpoint-response/whitelist :portkey.aws.mediapackage.create-origin-endpoint-response/arn :portkey.aws.mediapackage/dash-package :portkey.aws.mediapackage.create-origin-endpoint-response/manifest-name :portkey.aws.mediapackage.create-origin-endpoint-response/startover-window-seconds :portkey.aws.mediapackage.create-origin-endpoint-response/id]))

(clojure.spec.alpha/def :portkey.aws.mediapackage.delete-origin-endpoint-request/id (clojure.spec.alpha/and :portkey.aws.mediapackage/string))
(clojure.spec.alpha/def :portkey.aws.mediapackage/delete-origin-endpoint-request (clojure.spec.alpha/keys :req-un [:portkey.aws.mediapackage.delete-origin-endpoint-request/id] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.mediapackage/ad-markers #{"PASSTHROUGH" "NONE" :passthrough :scte-35-enhanced "SCTE35_ENHANCED" :none})

(clojure.spec.alpha/def :portkey.aws.mediapackage.list-origin-endpoints-request/channel-id (clojure.spec.alpha/and :portkey.aws.mediapackage/string))
(clojure.spec.alpha/def :portkey.aws.mediapackage.list-origin-endpoints-request/next-token (clojure.spec.alpha/and :portkey.aws.mediapackage/string))
(clojure.spec.alpha/def :portkey.aws.mediapackage/list-origin-endpoints-request (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.mediapackage.list-origin-endpoints-request/channel-id :portkey.aws.mediapackage/max-results :portkey.aws.mediapackage.list-origin-endpoints-request/next-token]))

(clojure.spec.alpha/def :portkey.aws.mediapackage.list-tags-for-resource-request/resource-arn (clojure.spec.alpha/and :portkey.aws.mediapackage/string))
(clojure.spec.alpha/def :portkey.aws.mediapackage/list-tags-for-resource-request (clojure.spec.alpha/keys :req-un [:portkey.aws.mediapackage.list-tags-for-resource-request/resource-arn] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.mediapackage.forbidden-exception/message (clojure.spec.alpha/and :portkey.aws.mediapackage/string))
(clojure.spec.alpha/def :portkey.aws.mediapackage/forbidden-exception (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.mediapackage.forbidden-exception/message]))

(clojure.spec.alpha/def :portkey.aws.mediapackage.stream-selection/max-video-bits-per-second (clojure.spec.alpha/and :portkey.aws.mediapackage/integer))
(clojure.spec.alpha/def :portkey.aws.mediapackage.stream-selection/min-video-bits-per-second (clojure.spec.alpha/and :portkey.aws.mediapackage/integer))
(clojure.spec.alpha/def :portkey.aws.mediapackage/stream-selection (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.mediapackage.stream-selection/max-video-bits-per-second :portkey.aws.mediapackage.stream-selection/min-video-bits-per-second :portkey.aws.mediapackage/stream-order]))

(clojure.spec.alpha/def :portkey.aws.mediapackage.create-channel-response/arn (clojure.spec.alpha/and :portkey.aws.mediapackage/string))
(clojure.spec.alpha/def :portkey.aws.mediapackage.create-channel-response/description (clojure.spec.alpha/and :portkey.aws.mediapackage/string))
(clojure.spec.alpha/def :portkey.aws.mediapackage.create-channel-response/id (clojure.spec.alpha/and :portkey.aws.mediapackage/string))
(clojure.spec.alpha/def :portkey.aws.mediapackage/create-channel-response (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.mediapackage.create-channel-response/arn :portkey.aws.mediapackage.create-channel-response/description :portkey.aws.mediapackage/hls-ingest :portkey.aws.mediapackage.create-channel-response/id :portkey.aws.mediapackage/tags]))

(clojure.spec.alpha/def :portkey.aws.mediapackage.unprocessable-entity-exception/message (clojure.spec.alpha/and :portkey.aws.mediapackage/string))
(clojure.spec.alpha/def :portkey.aws.mediapackage/unprocessable-entity-exception (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.mediapackage.unprocessable-entity-exception/message]))

(clojure.spec.alpha/def :portkey.aws.mediapackage/string (clojure.spec.alpha/and clojure.core/string?))

(clojure.spec.alpha/def :portkey.aws.mediapackage.describe-origin-endpoint-request/id (clojure.spec.alpha/and :portkey.aws.mediapackage/string))
(clojure.spec.alpha/def :portkey.aws.mediapackage/describe-origin-endpoint-request (clojure.spec.alpha/keys :req-un [:portkey.aws.mediapackage.describe-origin-endpoint-request/id] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.mediapackage.origin-endpoint-update-parameters/cmaf-package (clojure.spec.alpha/and :portkey.aws.mediapackage/cmaf-package-create-or-update-parameters))
(clojure.spec.alpha/def :portkey.aws.mediapackage.origin-endpoint-update-parameters/time-delay-seconds (clojure.spec.alpha/and :portkey.aws.mediapackage/integer))
(clojure.spec.alpha/def :portkey.aws.mediapackage.origin-endpoint-update-parameters/description (clojure.spec.alpha/and :portkey.aws.mediapackage/string))
(clojure.spec.alpha/def :portkey.aws.mediapackage.origin-endpoint-update-parameters/whitelist (clojure.spec.alpha/and :portkey.aws.mediapackage/list-of-string))
(clojure.spec.alpha/def :portkey.aws.mediapackage.origin-endpoint-update-parameters/manifest-name (clojure.spec.alpha/and :portkey.aws.mediapackage/string))
(clojure.spec.alpha/def :portkey.aws.mediapackage.origin-endpoint-update-parameters/startover-window-seconds (clojure.spec.alpha/and :portkey.aws.mediapackage/integer))
(clojure.spec.alpha/def :portkey.aws.mediapackage/origin-endpoint-update-parameters (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.mediapackage/hls-package :portkey.aws.mediapackage/mss-package :portkey.aws.mediapackage.origin-endpoint-update-parameters/cmaf-package :portkey.aws.mediapackage.origin-endpoint-update-parameters/time-delay-seconds :portkey.aws.mediapackage.origin-endpoint-update-parameters/description :portkey.aws.mediapackage.origin-endpoint-update-parameters/whitelist :portkey.aws.mediapackage/dash-package :portkey.aws.mediapackage.origin-endpoint-update-parameters/manifest-name :portkey.aws.mediapackage.origin-endpoint-update-parameters/startover-window-seconds]))

(clojure.spec.alpha/def :portkey.aws.mediapackage.hls-package/include-iframe-only-stream (clojure.spec.alpha/and :portkey.aws.mediapackage/boolean))
(clojure.spec.alpha/def :portkey.aws.mediapackage.hls-package/use-audio-rendition-group (clojure.spec.alpha/and :portkey.aws.mediapackage/boolean))
(clojure.spec.alpha/def :portkey.aws.mediapackage.hls-package/program-date-time-interval-seconds (clojure.spec.alpha/and :portkey.aws.mediapackage/integer))
(clojure.spec.alpha/def :portkey.aws.mediapackage.hls-package/encryption (clojure.spec.alpha/and :portkey.aws.mediapackage/hls-encryption))
(clojure.spec.alpha/def :portkey.aws.mediapackage.hls-package/playlist-window-seconds (clojure.spec.alpha/and :portkey.aws.mediapackage/integer))
(clojure.spec.alpha/def :portkey.aws.mediapackage.hls-package/segment-duration-seconds (clojure.spec.alpha/and :portkey.aws.mediapackage/integer))
(clojure.spec.alpha/def :portkey.aws.mediapackage/hls-package (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.mediapackage/ad-markers :portkey.aws.mediapackage/stream-selection :portkey.aws.mediapackage.hls-package/include-iframe-only-stream :portkey.aws.mediapackage.hls-package/use-audio-rendition-group :portkey.aws.mediapackage.hls-package/program-date-time-interval-seconds :portkey.aws.mediapackage.hls-package/encryption :portkey.aws.mediapackage.hls-package/playlist-window-seconds :portkey.aws.mediapackage.hls-package/segment-duration-seconds :portkey.aws.mediapackage/playlist-type]))

(clojure.spec.alpha/def :portkey.aws.mediapackage/long clojure.core/int?)

(clojure.spec.alpha/def :portkey.aws.mediapackage.ingest-endpoint/id (clojure.spec.alpha/and :portkey.aws.mediapackage/string))
(clojure.spec.alpha/def :portkey.aws.mediapackage.ingest-endpoint/password (clojure.spec.alpha/and :portkey.aws.mediapackage/string))
(clojure.spec.alpha/def :portkey.aws.mediapackage.ingest-endpoint/url (clojure.spec.alpha/and :portkey.aws.mediapackage/string))
(clojure.spec.alpha/def :portkey.aws.mediapackage.ingest-endpoint/username (clojure.spec.alpha/and :portkey.aws.mediapackage/string))
(clojure.spec.alpha/def :portkey.aws.mediapackage/ingest-endpoint (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.mediapackage.ingest-endpoint/id :portkey.aws.mediapackage.ingest-endpoint/password :portkey.aws.mediapackage.ingest-endpoint/url :portkey.aws.mediapackage.ingest-endpoint/username]))

(clojure.spec.alpha/def :portkey.aws.mediapackage/tags (clojure.spec.alpha/map-of :portkey.aws.mediapackage/string :portkey.aws.mediapackage/string))

(clojure.spec.alpha/def :portkey.aws.mediapackage.describe-channel-response/arn (clojure.spec.alpha/and :portkey.aws.mediapackage/string))
(clojure.spec.alpha/def :portkey.aws.mediapackage.describe-channel-response/description (clojure.spec.alpha/and :portkey.aws.mediapackage/string))
(clojure.spec.alpha/def :portkey.aws.mediapackage.describe-channel-response/id (clojure.spec.alpha/and :portkey.aws.mediapackage/string))
(clojure.spec.alpha/def :portkey.aws.mediapackage/describe-channel-response (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.mediapackage.describe-channel-response/arn :portkey.aws.mediapackage.describe-channel-response/description :portkey.aws.mediapackage/hls-ingest :portkey.aws.mediapackage.describe-channel-response/id :portkey.aws.mediapackage/tags]))

(clojure.spec.alpha/def :portkey.aws.mediapackage.mss-package/encryption (clojure.spec.alpha/and :portkey.aws.mediapackage/mss-encryption))
(clojure.spec.alpha/def :portkey.aws.mediapackage.mss-package/manifest-window-seconds (clojure.spec.alpha/and :portkey.aws.mediapackage/integer))
(clojure.spec.alpha/def :portkey.aws.mediapackage.mss-package/segment-duration-seconds (clojure.spec.alpha/and :portkey.aws.mediapackage/integer))
(clojure.spec.alpha/def :portkey.aws.mediapackage/mss-package (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.mediapackage.mss-package/encryption :portkey.aws.mediapackage.mss-package/manifest-window-seconds :portkey.aws.mediapackage.mss-package/segment-duration-seconds :portkey.aws.mediapackage/stream-selection]))

(clojure.spec.alpha/def :portkey.aws.mediapackage.dash-encryption/key-rotation-interval-seconds (clojure.spec.alpha/and :portkey.aws.mediapackage/integer))
(clojure.spec.alpha/def :portkey.aws.mediapackage/dash-encryption (clojure.spec.alpha/keys :req-un [:portkey.aws.mediapackage/speke-key-provider] :opt-un [:portkey.aws.mediapackage.dash-encryption/key-rotation-interval-seconds]))

(clojure.spec.alpha/def :portkey.aws.mediapackage.cmaf-package/encryption (clojure.spec.alpha/and :portkey.aws.mediapackage/cmaf-encryption))
(clojure.spec.alpha/def :portkey.aws.mediapackage.cmaf-package/hls-manifests (clojure.spec.alpha/and :portkey.aws.mediapackage/list-of-hls-manifest))
(clojure.spec.alpha/def :portkey.aws.mediapackage.cmaf-package/segment-duration-seconds (clojure.spec.alpha/and :portkey.aws.mediapackage/integer))
(clojure.spec.alpha/def :portkey.aws.mediapackage.cmaf-package/segment-prefix (clojure.spec.alpha/and :portkey.aws.mediapackage/string))
(clojure.spec.alpha/def :portkey.aws.mediapackage/cmaf-package (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.mediapackage.cmaf-package/encryption :portkey.aws.mediapackage.cmaf-package/hls-manifests :portkey.aws.mediapackage.cmaf-package/segment-duration-seconds :portkey.aws.mediapackage.cmaf-package/segment-prefix :portkey.aws.mediapackage/stream-selection]))

(clojure.spec.alpha/def :portkey.aws.mediapackage/mss-encryption (clojure.spec.alpha/keys :req-un [:portkey.aws.mediapackage/speke-key-provider] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.mediapackage.describe-origin-endpoint-response/channel-id (clojure.spec.alpha/and :portkey.aws.mediapackage/string))
(clojure.spec.alpha/def :portkey.aws.mediapackage.describe-origin-endpoint-response/time-delay-seconds (clojure.spec.alpha/and :portkey.aws.mediapackage/integer))
(clojure.spec.alpha/def :portkey.aws.mediapackage.describe-origin-endpoint-response/url (clojure.spec.alpha/and :portkey.aws.mediapackage/string))
(clojure.spec.alpha/def :portkey.aws.mediapackage.describe-origin-endpoint-response/description (clojure.spec.alpha/and :portkey.aws.mediapackage/string))
(clojure.spec.alpha/def :portkey.aws.mediapackage.describe-origin-endpoint-response/whitelist (clojure.spec.alpha/and :portkey.aws.mediapackage/list-of-string))
(clojure.spec.alpha/def :portkey.aws.mediapackage.describe-origin-endpoint-response/arn (clojure.spec.alpha/and :portkey.aws.mediapackage/string))
(clojure.spec.alpha/def :portkey.aws.mediapackage.describe-origin-endpoint-response/manifest-name (clojure.spec.alpha/and :portkey.aws.mediapackage/string))
(clojure.spec.alpha/def :portkey.aws.mediapackage.describe-origin-endpoint-response/startover-window-seconds (clojure.spec.alpha/and :portkey.aws.mediapackage/integer))
(clojure.spec.alpha/def :portkey.aws.mediapackage.describe-origin-endpoint-response/id (clojure.spec.alpha/and :portkey.aws.mediapackage/string))
(clojure.spec.alpha/def :portkey.aws.mediapackage/describe-origin-endpoint-response (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.mediapackage/hls-package :portkey.aws.mediapackage.describe-origin-endpoint-response/channel-id :portkey.aws.mediapackage/tags :portkey.aws.mediapackage/mss-package :portkey.aws.mediapackage/cmaf-package :portkey.aws.mediapackage.describe-origin-endpoint-response/time-delay-seconds :portkey.aws.mediapackage.describe-origin-endpoint-response/url :portkey.aws.mediapackage.describe-origin-endpoint-response/description :portkey.aws.mediapackage.describe-origin-endpoint-response/whitelist :portkey.aws.mediapackage.describe-origin-endpoint-response/arn :portkey.aws.mediapackage/dash-package :portkey.aws.mediapackage.describe-origin-endpoint-response/manifest-name :portkey.aws.mediapackage.describe-origin-endpoint-response/startover-window-seconds :portkey.aws.mediapackage.describe-origin-endpoint-response/id]))

(clojure.spec.alpha/def :portkey.aws.mediapackage.update-origin-endpoint-response/channel-id (clojure.spec.alpha/and :portkey.aws.mediapackage/string))
(clojure.spec.alpha/def :portkey.aws.mediapackage.update-origin-endpoint-response/time-delay-seconds (clojure.spec.alpha/and :portkey.aws.mediapackage/integer))
(clojure.spec.alpha/def :portkey.aws.mediapackage.update-origin-endpoint-response/url (clojure.spec.alpha/and :portkey.aws.mediapackage/string))
(clojure.spec.alpha/def :portkey.aws.mediapackage.update-origin-endpoint-response/description (clojure.spec.alpha/and :portkey.aws.mediapackage/string))
(clojure.spec.alpha/def :portkey.aws.mediapackage.update-origin-endpoint-response/whitelist (clojure.spec.alpha/and :portkey.aws.mediapackage/list-of-string))
(clojure.spec.alpha/def :portkey.aws.mediapackage.update-origin-endpoint-response/arn (clojure.spec.alpha/and :portkey.aws.mediapackage/string))
(clojure.spec.alpha/def :portkey.aws.mediapackage.update-origin-endpoint-response/manifest-name (clojure.spec.alpha/and :portkey.aws.mediapackage/string))
(clojure.spec.alpha/def :portkey.aws.mediapackage.update-origin-endpoint-response/startover-window-seconds (clojure.spec.alpha/and :portkey.aws.mediapackage/integer))
(clojure.spec.alpha/def :portkey.aws.mediapackage.update-origin-endpoint-response/id (clojure.spec.alpha/and :portkey.aws.mediapackage/string))
(clojure.spec.alpha/def :portkey.aws.mediapackage/update-origin-endpoint-response (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.mediapackage/hls-package :portkey.aws.mediapackage.update-origin-endpoint-response/channel-id :portkey.aws.mediapackage/tags :portkey.aws.mediapackage/mss-package :portkey.aws.mediapackage/cmaf-package :portkey.aws.mediapackage.update-origin-endpoint-response/time-delay-seconds :portkey.aws.mediapackage.update-origin-endpoint-response/url :portkey.aws.mediapackage.update-origin-endpoint-response/description :portkey.aws.mediapackage.update-origin-endpoint-response/whitelist :portkey.aws.mediapackage.update-origin-endpoint-response/arn :portkey.aws.mediapackage/dash-package :portkey.aws.mediapackage.update-origin-endpoint-response/manifest-name :portkey.aws.mediapackage.update-origin-endpoint-response/startover-window-seconds :portkey.aws.mediapackage.update-origin-endpoint-response/id]))

(clojure.spec.alpha/def :portkey.aws.mediapackage.service-unavailable-exception/message (clojure.spec.alpha/and :portkey.aws.mediapackage/string))
(clojure.spec.alpha/def :portkey.aws.mediapackage/service-unavailable-exception (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.mediapackage.service-unavailable-exception/message]))

(clojure.spec.alpha/def :portkey.aws.mediapackage.hls-ingest/ingest-endpoints (clojure.spec.alpha/and :portkey.aws.mediapackage/list-of-ingest-endpoint))
(clojure.spec.alpha/def :portkey.aws.mediapackage/hls-ingest (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.mediapackage.hls-ingest/ingest-endpoints]))

(clojure.spec.alpha/def :portkey.aws.mediapackage.origin-endpoint/channel-id (clojure.spec.alpha/and :portkey.aws.mediapackage/string))
(clojure.spec.alpha/def :portkey.aws.mediapackage.origin-endpoint/time-delay-seconds (clojure.spec.alpha/and :portkey.aws.mediapackage/integer))
(clojure.spec.alpha/def :portkey.aws.mediapackage.origin-endpoint/url (clojure.spec.alpha/and :portkey.aws.mediapackage/string))
(clojure.spec.alpha/def :portkey.aws.mediapackage.origin-endpoint/description (clojure.spec.alpha/and :portkey.aws.mediapackage/string))
(clojure.spec.alpha/def :portkey.aws.mediapackage.origin-endpoint/whitelist (clojure.spec.alpha/and :portkey.aws.mediapackage/list-of-string))
(clojure.spec.alpha/def :portkey.aws.mediapackage.origin-endpoint/arn (clojure.spec.alpha/and :portkey.aws.mediapackage/string))
(clojure.spec.alpha/def :portkey.aws.mediapackage.origin-endpoint/manifest-name (clojure.spec.alpha/and :portkey.aws.mediapackage/string))
(clojure.spec.alpha/def :portkey.aws.mediapackage.origin-endpoint/startover-window-seconds (clojure.spec.alpha/and :portkey.aws.mediapackage/integer))
(clojure.spec.alpha/def :portkey.aws.mediapackage.origin-endpoint/id (clojure.spec.alpha/and :portkey.aws.mediapackage/string))
(clojure.spec.alpha/def :portkey.aws.mediapackage/origin-endpoint (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.mediapackage/hls-package :portkey.aws.mediapackage.origin-endpoint/channel-id :portkey.aws.mediapackage/tags :portkey.aws.mediapackage/mss-package :portkey.aws.mediapackage/cmaf-package :portkey.aws.mediapackage.origin-endpoint/time-delay-seconds :portkey.aws.mediapackage.origin-endpoint/url :portkey.aws.mediapackage.origin-endpoint/description :portkey.aws.mediapackage.origin-endpoint/whitelist :portkey.aws.mediapackage.origin-endpoint/arn :portkey.aws.mediapackage/dash-package :portkey.aws.mediapackage.origin-endpoint/manifest-name :portkey.aws.mediapackage.origin-endpoint/startover-window-seconds :portkey.aws.mediapackage.origin-endpoint/id]))

(clojure.spec.alpha/def :portkey.aws.mediapackage.channel-create-parameters/description (clojure.spec.alpha/and :portkey.aws.mediapackage/string))
(clojure.spec.alpha/def :portkey.aws.mediapackage.channel-create-parameters/id (clojure.spec.alpha/and :portkey.aws.mediapackage/string))
(clojure.spec.alpha/def :portkey.aws.mediapackage/channel-create-parameters (clojure.spec.alpha/keys :req-un [:portkey.aws.mediapackage.channel-create-parameters/id] :opt-un [:portkey.aws.mediapackage.channel-create-parameters/description :portkey.aws.mediapackage/tags]))

(clojure.spec.alpha/def :portkey.aws.mediapackage/delete-channel-response (clojure.spec.alpha/keys :req-un [] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.mediapackage.speke-key-provider/certificate-arn (clojure.spec.alpha/and :portkey.aws.mediapackage/string))
(clojure.spec.alpha/def :portkey.aws.mediapackage.speke-key-provider/resource-id (clojure.spec.alpha/and :portkey.aws.mediapackage/string))
(clojure.spec.alpha/def :portkey.aws.mediapackage.speke-key-provider/role-arn (clojure.spec.alpha/and :portkey.aws.mediapackage/string))
(clojure.spec.alpha/def :portkey.aws.mediapackage.speke-key-provider/system-ids (clojure.spec.alpha/and :portkey.aws.mediapackage/list-of-string))
(clojure.spec.alpha/def :portkey.aws.mediapackage.speke-key-provider/url (clojure.spec.alpha/and :portkey.aws.mediapackage/string))
(clojure.spec.alpha/def :portkey.aws.mediapackage/speke-key-provider (clojure.spec.alpha/keys :req-un [:portkey.aws.mediapackage.speke-key-provider/url :portkey.aws.mediapackage.speke-key-provider/resource-id :portkey.aws.mediapackage.speke-key-provider/role-arn :portkey.aws.mediapackage.speke-key-provider/system-ids] :opt-un [:portkey.aws.mediapackage.speke-key-provider/certificate-arn]))

(clojure.spec.alpha/def :portkey.aws.mediapackage.too-many-requests-exception/message (clojure.spec.alpha/and :portkey.aws.mediapackage/string))
(clojure.spec.alpha/def :portkey.aws.mediapackage/too-many-requests-exception (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.mediapackage.too-many-requests-exception/message]))

(clojure.spec.alpha/def :portkey.aws.mediapackage.rotate-ingest-endpoint-credentials-request/id (clojure.spec.alpha/and :portkey.aws.mediapackage/string))
(clojure.spec.alpha/def :portkey.aws.mediapackage.rotate-ingest-endpoint-credentials-request/ingest-endpoint-id (clojure.spec.alpha/and :portkey.aws.mediapackage/string))
(clojure.spec.alpha/def :portkey.aws.mediapackage/rotate-ingest-endpoint-credentials-request (clojure.spec.alpha/keys :req-un [:portkey.aws.mediapackage.rotate-ingest-endpoint-credentials-request/ingest-endpoint-id :portkey.aws.mediapackage.rotate-ingest-endpoint-credentials-request/id] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.mediapackage.create-channel-request/description (clojure.spec.alpha/and :portkey.aws.mediapackage/string))
(clojure.spec.alpha/def :portkey.aws.mediapackage.create-channel-request/id (clojure.spec.alpha/and :portkey.aws.mediapackage/string))
(clojure.spec.alpha/def :portkey.aws.mediapackage/create-channel-request (clojure.spec.alpha/keys :req-un [:portkey.aws.mediapackage.create-channel-request/id] :opt-un [:portkey.aws.mediapackage.create-channel-request/description :portkey.aws.mediapackage/tags]))

(clojure.spec.alpha/def :portkey.aws.mediapackage/list-of-hls-manifest-create-or-update-parameters (clojure.spec.alpha/coll-of :portkey.aws.mediapackage/hls-manifest-create-or-update-parameters))

(clojure.spec.alpha/def :portkey.aws.mediapackage.tag-resource-request/resource-arn (clojure.spec.alpha/and :portkey.aws.mediapackage/string))
(clojure.spec.alpha/def :portkey.aws.mediapackage.tag-resource-request/tags (clojure.spec.alpha/and :portkey.aws.mediapackage/map-of-string))
(clojure.spec.alpha/def :portkey.aws.mediapackage/tag-resource-request (clojure.spec.alpha/keys :req-un [:portkey.aws.mediapackage.tag-resource-request/resource-arn :portkey.aws.mediapackage.tag-resource-request/tags] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.mediapackage/list-of-hls-manifest (clojure.spec.alpha/coll-of :portkey.aws.mediapackage/hls-manifest))

(clojure.spec.alpha/def :portkey.aws.mediapackage.hls-manifest/id (clojure.spec.alpha/and :portkey.aws.mediapackage/string))
(clojure.spec.alpha/def :portkey.aws.mediapackage.hls-manifest/include-iframe-only-stream (clojure.spec.alpha/and :portkey.aws.mediapackage/boolean))
(clojure.spec.alpha/def :portkey.aws.mediapackage.hls-manifest/manifest-name (clojure.spec.alpha/and :portkey.aws.mediapackage/string))
(clojure.spec.alpha/def :portkey.aws.mediapackage.hls-manifest/playlist-window-seconds (clojure.spec.alpha/and :portkey.aws.mediapackage/integer))
(clojure.spec.alpha/def :portkey.aws.mediapackage.hls-manifest/program-date-time-interval-seconds (clojure.spec.alpha/and :portkey.aws.mediapackage/integer))
(clojure.spec.alpha/def :portkey.aws.mediapackage.hls-manifest/url (clojure.spec.alpha/and :portkey.aws.mediapackage/string))
(clojure.spec.alpha/def :portkey.aws.mediapackage/hls-manifest (clojure.spec.alpha/keys :req-un [:portkey.aws.mediapackage.hls-manifest/id] :opt-un [:portkey.aws.mediapackage/ad-markers :portkey.aws.mediapackage.hls-manifest/include-iframe-only-stream :portkey.aws.mediapackage.hls-manifest/manifest-name :portkey.aws.mediapackage/playlist-type :portkey.aws.mediapackage.hls-manifest/playlist-window-seconds :portkey.aws.mediapackage.hls-manifest/program-date-time-interval-seconds :portkey.aws.mediapackage.hls-manifest/url]))

(clojure.spec.alpha/def :portkey.aws.mediapackage.list-channels-response/channels (clojure.spec.alpha/and :portkey.aws.mediapackage/list-of-channel))
(clojure.spec.alpha/def :portkey.aws.mediapackage.list-channels-response/next-token (clojure.spec.alpha/and :portkey.aws.mediapackage/string))
(clojure.spec.alpha/def :portkey.aws.mediapackage/list-channels-response (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.mediapackage.list-channels-response/channels :portkey.aws.mediapackage.list-channels-response/next-token]))

(clojure.spec.alpha/def :portkey.aws.mediapackage/list-of-string (clojure.spec.alpha/coll-of :portkey.aws.mediapackage/string))

(clojure.spec.alpha/def :portkey.aws.mediapackage/boolean clojure.core/boolean?)

(clojure.spec.alpha/def :portkey.aws.mediapackage/profile #{:hbbtv-1-5 "HBBTV_1_5" "NONE" :none})

(clojure.spec.alpha/def :portkey.aws.mediapackage.hls-encryption/constant-initialization-vector (clojure.spec.alpha/and :portkey.aws.mediapackage/string))
(clojure.spec.alpha/def :portkey.aws.mediapackage.hls-encryption/key-rotation-interval-seconds (clojure.spec.alpha/and :portkey.aws.mediapackage/integer))
(clojure.spec.alpha/def :portkey.aws.mediapackage.hls-encryption/repeat-ext-x-key (clojure.spec.alpha/and :portkey.aws.mediapackage/boolean))
(clojure.spec.alpha/def :portkey.aws.mediapackage/hls-encryption (clojure.spec.alpha/keys :req-un [:portkey.aws.mediapackage/speke-key-provider] :opt-un [:portkey.aws.mediapackage.hls-encryption/constant-initialization-vector :portkey.aws.mediapackage/encryption-method :portkey.aws.mediapackage.hls-encryption/key-rotation-interval-seconds :portkey.aws.mediapackage.hls-encryption/repeat-ext-x-key]))

(clojure.spec.alpha/def :portkey.aws.mediapackage/list-of-channel (clojure.spec.alpha/coll-of :portkey.aws.mediapackage/channel))

(clojure.spec.alpha/def :portkey.aws.mediapackage.create-origin-endpoint-request/channel-id (clojure.spec.alpha/and :portkey.aws.mediapackage/string))
(clojure.spec.alpha/def :portkey.aws.mediapackage.create-origin-endpoint-request/cmaf-package (clojure.spec.alpha/and :portkey.aws.mediapackage/cmaf-package-create-or-update-parameters))
(clojure.spec.alpha/def :portkey.aws.mediapackage.create-origin-endpoint-request/time-delay-seconds (clojure.spec.alpha/and :portkey.aws.mediapackage/integer))
(clojure.spec.alpha/def :portkey.aws.mediapackage.create-origin-endpoint-request/description (clojure.spec.alpha/and :portkey.aws.mediapackage/string))
(clojure.spec.alpha/def :portkey.aws.mediapackage.create-origin-endpoint-request/whitelist (clojure.spec.alpha/and :portkey.aws.mediapackage/list-of-string))
(clojure.spec.alpha/def :portkey.aws.mediapackage.create-origin-endpoint-request/manifest-name (clojure.spec.alpha/and :portkey.aws.mediapackage/string))
(clojure.spec.alpha/def :portkey.aws.mediapackage.create-origin-endpoint-request/startover-window-seconds (clojure.spec.alpha/and :portkey.aws.mediapackage/integer))
(clojure.spec.alpha/def :portkey.aws.mediapackage.create-origin-endpoint-request/id (clojure.spec.alpha/and :portkey.aws.mediapackage/string))
(clojure.spec.alpha/def :portkey.aws.mediapackage/create-origin-endpoint-request (clojure.spec.alpha/keys :req-un [:portkey.aws.mediapackage.create-origin-endpoint-request/channel-id :portkey.aws.mediapackage.create-origin-endpoint-request/id] :opt-un [:portkey.aws.mediapackage/hls-package :portkey.aws.mediapackage/tags :portkey.aws.mediapackage/mss-package :portkey.aws.mediapackage.create-origin-endpoint-request/cmaf-package :portkey.aws.mediapackage.create-origin-endpoint-request/time-delay-seconds :portkey.aws.mediapackage.create-origin-endpoint-request/description :portkey.aws.mediapackage.create-origin-endpoint-request/whitelist :portkey.aws.mediapackage/dash-package :portkey.aws.mediapackage.create-origin-endpoint-request/manifest-name :portkey.aws.mediapackage.create-origin-endpoint-request/startover-window-seconds]))

(clojure.spec.alpha/def :portkey.aws.mediapackage.not-found-exception/message (clojure.spec.alpha/and :portkey.aws.mediapackage/string))
(clojure.spec.alpha/def :portkey.aws.mediapackage/not-found-exception (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.mediapackage.not-found-exception/message]))

(clojure.spec.alpha/def :portkey.aws.mediapackage.delete-channel-request/id (clojure.spec.alpha/and :portkey.aws.mediapackage/string))
(clojure.spec.alpha/def :portkey.aws.mediapackage/delete-channel-request (clojure.spec.alpha/keys :req-un [:portkey.aws.mediapackage.delete-channel-request/id] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.mediapackage.describe-channel-request/id (clojure.spec.alpha/and :portkey.aws.mediapackage/string))
(clojure.spec.alpha/def :portkey.aws.mediapackage/describe-channel-request (clojure.spec.alpha/keys :req-un [:portkey.aws.mediapackage.describe-channel-request/id] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.mediapackage/manifest-layout #{"COMPACT" :full :compact "FULL"})

(clojure.spec.alpha/def :portkey.aws.mediapackage/list-of-origin-endpoint (clojure.spec.alpha/coll-of :portkey.aws.mediapackage/origin-endpoint))

(clojure.spec.alpha/def :portkey.aws.mediapackage.rotate-channel-credentials-response/arn (clojure.spec.alpha/and :portkey.aws.mediapackage/string))
(clojure.spec.alpha/def :portkey.aws.mediapackage.rotate-channel-credentials-response/description (clojure.spec.alpha/and :portkey.aws.mediapackage/string))
(clojure.spec.alpha/def :portkey.aws.mediapackage.rotate-channel-credentials-response/id (clojure.spec.alpha/and :portkey.aws.mediapackage/string))
(clojure.spec.alpha/def :portkey.aws.mediapackage/rotate-channel-credentials-response (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.mediapackage.rotate-channel-credentials-response/arn :portkey.aws.mediapackage.rotate-channel-credentials-response/description :portkey.aws.mediapackage/hls-ingest :portkey.aws.mediapackage.rotate-channel-credentials-response/id :portkey.aws.mediapackage/tags]))

(clojure.spec.alpha/def :portkey.aws.mediapackage.list-origin-endpoints-response/next-token (clojure.spec.alpha/and :portkey.aws.mediapackage/string))
(clojure.spec.alpha/def :portkey.aws.mediapackage.list-origin-endpoints-response/origin-endpoints (clojure.spec.alpha/and :portkey.aws.mediapackage/list-of-origin-endpoint))
(clojure.spec.alpha/def :portkey.aws.mediapackage/list-origin-endpoints-response (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.mediapackage.list-origin-endpoints-response/next-token :portkey.aws.mediapackage.list-origin-endpoints-response/origin-endpoints]))

(clojure.spec.alpha/def :portkey.aws.mediapackage.list-channels-request/next-token (clojure.spec.alpha/and :portkey.aws.mediapackage/string))
(clojure.spec.alpha/def :portkey.aws.mediapackage/list-channels-request (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.mediapackage/max-results :portkey.aws.mediapackage.list-channels-request/next-token]))

(clojure.spec.alpha/def :portkey.aws.mediapackage/double clojure.core/double?)

(clojure.spec.alpha/def :portkey.aws.mediapackage/stream-order #{:video-bitrate-ascending :video-bitrate-descending :original "VIDEO_BITRATE_DESCENDING" "ORIGINAL" "VIDEO_BITRATE_ASCENDING"})

(clojure.spec.alpha/def :portkey.aws.mediapackage.dash-package/min-update-period-seconds (clojure.spec.alpha/and :portkey.aws.mediapackage/integer))
(clojure.spec.alpha/def :portkey.aws.mediapackage.dash-package/manifest-window-seconds (clojure.spec.alpha/and :portkey.aws.mediapackage/integer))
(clojure.spec.alpha/def :portkey.aws.mediapackage.dash-package/period-triggers (clojure.spec.alpha/and :portkey.aws.mediapackage/list-of-period-triggers-element))
(clojure.spec.alpha/def :portkey.aws.mediapackage.dash-package/min-buffer-time-seconds (clojure.spec.alpha/and :portkey.aws.mediapackage/integer))
(clojure.spec.alpha/def :portkey.aws.mediapackage.dash-package/encryption (clojure.spec.alpha/and :portkey.aws.mediapackage/dash-encryption))
(clojure.spec.alpha/def :portkey.aws.mediapackage.dash-package/segment-duration-seconds (clojure.spec.alpha/and :portkey.aws.mediapackage/integer))
(clojure.spec.alpha/def :portkey.aws.mediapackage.dash-package/suggested-presentation-delay-seconds (clojure.spec.alpha/and :portkey.aws.mediapackage/integer))
(clojure.spec.alpha/def :portkey.aws.mediapackage/dash-package (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.mediapackage.dash-package/min-update-period-seconds :portkey.aws.mediapackage/segment-template-format :portkey.aws.mediapackage/stream-selection :portkey.aws.mediapackage.dash-package/manifest-window-seconds :portkey.aws.mediapackage/profile :portkey.aws.mediapackage.dash-package/period-triggers :portkey.aws.mediapackage/manifest-layout :portkey.aws.mediapackage.dash-package/min-buffer-time-seconds :portkey.aws.mediapackage.dash-package/encryption :portkey.aws.mediapackage.dash-package/segment-duration-seconds :portkey.aws.mediapackage.dash-package/suggested-presentation-delay-seconds]))

(clojure.spec.alpha/def :portkey.aws.mediapackage.origin-endpoint-list/next-token (clojure.spec.alpha/and :portkey.aws.mediapackage/string))
(clojure.spec.alpha/def :portkey.aws.mediapackage.origin-endpoint-list/origin-endpoints (clojure.spec.alpha/and :portkey.aws.mediapackage/list-of-origin-endpoint))
(clojure.spec.alpha/def :portkey.aws.mediapackage/origin-endpoint-list (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.mediapackage.origin-endpoint-list/next-token :portkey.aws.mediapackage.origin-endpoint-list/origin-endpoints]))

(clojure.spec.alpha/def :portkey.aws.mediapackage.channel/arn (clojure.spec.alpha/and :portkey.aws.mediapackage/string))
(clojure.spec.alpha/def :portkey.aws.mediapackage.channel/description (clojure.spec.alpha/and :portkey.aws.mediapackage/string))
(clojure.spec.alpha/def :portkey.aws.mediapackage.channel/id (clojure.spec.alpha/and :portkey.aws.mediapackage/string))
(clojure.spec.alpha/def :portkey.aws.mediapackage/channel (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.mediapackage.channel/arn :portkey.aws.mediapackage.channel/description :portkey.aws.mediapackage/hls-ingest :portkey.aws.mediapackage.channel/id :portkey.aws.mediapackage/tags]))

(clojure.spec.alpha/def :portkey.aws.mediapackage/max-results (clojure.spec.alpha/int-in 1 1000))

(clojure.spec.alpha/def :portkey.aws.mediapackage.rotate-channel-credentials-request/id (clojure.spec.alpha/and :portkey.aws.mediapackage/string))
(clojure.spec.alpha/def :portkey.aws.mediapackage/rotate-channel-credentials-request (clojure.spec.alpha/keys :req-un [:portkey.aws.mediapackage.rotate-channel-credentials-request/id] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.mediapackage/encryption-method #{:aes-128 "SAMPLE_AES" :sample-aes "AES_128"})

(clojure.spec.alpha/def :portkey.aws.mediapackage/list-of-period-triggers-element (clojure.spec.alpha/coll-of :portkey.aws.mediapackage/period-triggers-element))

(clojure.spec.alpha/def :portkey.aws.mediapackage/delete-origin-endpoint-response (clojure.spec.alpha/keys :req-un [] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.mediapackage/integer clojure.core/int?)

(clojure.spec.alpha/def :portkey.aws.mediapackage.rotate-ingest-endpoint-credentials-response/arn (clojure.spec.alpha/and :portkey.aws.mediapackage/string))
(clojure.spec.alpha/def :portkey.aws.mediapackage.rotate-ingest-endpoint-credentials-response/description (clojure.spec.alpha/and :portkey.aws.mediapackage/string))
(clojure.spec.alpha/def :portkey.aws.mediapackage.rotate-ingest-endpoint-credentials-response/id (clojure.spec.alpha/and :portkey.aws.mediapackage/string))
(clojure.spec.alpha/def :portkey.aws.mediapackage/rotate-ingest-endpoint-credentials-response (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.mediapackage.rotate-ingest-endpoint-credentials-response/arn :portkey.aws.mediapackage.rotate-ingest-endpoint-credentials-response/description :portkey.aws.mediapackage/hls-ingest :portkey.aws.mediapackage.rotate-ingest-endpoint-credentials-response/id :portkey.aws.mediapackage/tags]))

(clojure.spec.alpha/def :portkey.aws.mediapackage.origin-endpoint-create-parameters/channel-id (clojure.spec.alpha/and :portkey.aws.mediapackage/string))
(clojure.spec.alpha/def :portkey.aws.mediapackage.origin-endpoint-create-parameters/cmaf-package (clojure.spec.alpha/and :portkey.aws.mediapackage/cmaf-package-create-or-update-parameters))
(clojure.spec.alpha/def :portkey.aws.mediapackage.origin-endpoint-create-parameters/time-delay-seconds (clojure.spec.alpha/and :portkey.aws.mediapackage/integer))
(clojure.spec.alpha/def :portkey.aws.mediapackage.origin-endpoint-create-parameters/description (clojure.spec.alpha/and :portkey.aws.mediapackage/string))
(clojure.spec.alpha/def :portkey.aws.mediapackage.origin-endpoint-create-parameters/whitelist (clojure.spec.alpha/and :portkey.aws.mediapackage/list-of-string))
(clojure.spec.alpha/def :portkey.aws.mediapackage.origin-endpoint-create-parameters/manifest-name (clojure.spec.alpha/and :portkey.aws.mediapackage/string))
(clojure.spec.alpha/def :portkey.aws.mediapackage.origin-endpoint-create-parameters/startover-window-seconds (clojure.spec.alpha/and :portkey.aws.mediapackage/integer))
(clojure.spec.alpha/def :portkey.aws.mediapackage.origin-endpoint-create-parameters/id (clojure.spec.alpha/and :portkey.aws.mediapackage/string))
(clojure.spec.alpha/def :portkey.aws.mediapackage/origin-endpoint-create-parameters (clojure.spec.alpha/keys :req-un [:portkey.aws.mediapackage.origin-endpoint-create-parameters/id :portkey.aws.mediapackage.origin-endpoint-create-parameters/channel-id] :opt-un [:portkey.aws.mediapackage/hls-package :portkey.aws.mediapackage/tags :portkey.aws.mediapackage/mss-package :portkey.aws.mediapackage.origin-endpoint-create-parameters/cmaf-package :portkey.aws.mediapackage.origin-endpoint-create-parameters/time-delay-seconds :portkey.aws.mediapackage.origin-endpoint-create-parameters/description :portkey.aws.mediapackage.origin-endpoint-create-parameters/whitelist :portkey.aws.mediapackage/dash-package :portkey.aws.mediapackage.origin-endpoint-create-parameters/manifest-name :portkey.aws.mediapackage.origin-endpoint-create-parameters/startover-window-seconds]))

(clojure.spec.alpha/def :portkey.aws.mediapackage.channel-list/channels (clojure.spec.alpha/and :portkey.aws.mediapackage/list-of-channel))
(clojure.spec.alpha/def :portkey.aws.mediapackage.channel-list/next-token (clojure.spec.alpha/and :portkey.aws.mediapackage/string))
(clojure.spec.alpha/def :portkey.aws.mediapackage/channel-list (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.mediapackage.channel-list/channels :portkey.aws.mediapackage.channel-list/next-token]))

(clojure.spec.alpha/def :portkey.aws.mediapackage.channel-update-parameters/description (clojure.spec.alpha/and :portkey.aws.mediapackage/string))
(clojure.spec.alpha/def :portkey.aws.mediapackage/channel-update-parameters (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.mediapackage.channel-update-parameters/description]))

(clojure.spec.alpha/def :portkey.aws.mediapackage.cmaf-encryption/key-rotation-interval-seconds (clojure.spec.alpha/and :portkey.aws.mediapackage/integer))
(clojure.spec.alpha/def :portkey.aws.mediapackage/cmaf-encryption (clojure.spec.alpha/keys :req-un [:portkey.aws.mediapackage/speke-key-provider] :opt-un [:portkey.aws.mediapackage.cmaf-encryption/key-rotation-interval-seconds]))

(clojure.spec.alpha/def :portkey.aws.mediapackage.tags-model/tags (clojure.spec.alpha/and :portkey.aws.mediapackage/map-of-string))
(clojure.spec.alpha/def :portkey.aws.mediapackage/tags-model (clojure.spec.alpha/keys :req-un [:portkey.aws.mediapackage.tags-model/tags] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.mediapackage/period-triggers-element #{:ads "ADS"})

(clojure.spec.alpha/def :portkey.aws.mediapackage.update-channel-response/arn (clojure.spec.alpha/and :portkey.aws.mediapackage/string))
(clojure.spec.alpha/def :portkey.aws.mediapackage.update-channel-response/description (clojure.spec.alpha/and :portkey.aws.mediapackage/string))
(clojure.spec.alpha/def :portkey.aws.mediapackage.update-channel-response/id (clojure.spec.alpha/and :portkey.aws.mediapackage/string))
(clojure.spec.alpha/def :portkey.aws.mediapackage/update-channel-response (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.mediapackage.update-channel-response/arn :portkey.aws.mediapackage.update-channel-response/description :portkey.aws.mediapackage/hls-ingest :portkey.aws.mediapackage.update-channel-response/id :portkey.aws.mediapackage/tags]))

(clojure.spec.alpha/def :portkey.aws.mediapackage.hls-manifest-create-or-update-parameters/id (clojure.spec.alpha/and :portkey.aws.mediapackage/string))
(clojure.spec.alpha/def :portkey.aws.mediapackage.hls-manifest-create-or-update-parameters/include-iframe-only-stream (clojure.spec.alpha/and :portkey.aws.mediapackage/boolean))
(clojure.spec.alpha/def :portkey.aws.mediapackage.hls-manifest-create-or-update-parameters/manifest-name (clojure.spec.alpha/and :portkey.aws.mediapackage/string))
(clojure.spec.alpha/def :portkey.aws.mediapackage.hls-manifest-create-or-update-parameters/playlist-window-seconds (clojure.spec.alpha/and :portkey.aws.mediapackage/integer))
(clojure.spec.alpha/def :portkey.aws.mediapackage.hls-manifest-create-or-update-parameters/program-date-time-interval-seconds (clojure.spec.alpha/and :portkey.aws.mediapackage/integer))
(clojure.spec.alpha/def :portkey.aws.mediapackage/hls-manifest-create-or-update-parameters (clojure.spec.alpha/keys :req-un [:portkey.aws.mediapackage.hls-manifest-create-or-update-parameters/id] :opt-un [:portkey.aws.mediapackage/ad-markers :portkey.aws.mediapackage.hls-manifest-create-or-update-parameters/include-iframe-only-stream :portkey.aws.mediapackage.hls-manifest-create-or-update-parameters/manifest-name :portkey.aws.mediapackage/playlist-type :portkey.aws.mediapackage.hls-manifest-create-or-update-parameters/playlist-window-seconds :portkey.aws.mediapackage.hls-manifest-create-or-update-parameters/program-date-time-interval-seconds]))

(clojure.spec.alpha/def :portkey.aws.mediapackage.untag-resource-request/resource-arn (clojure.spec.alpha/and :portkey.aws.mediapackage/string))
(clojure.spec.alpha/def :portkey.aws.mediapackage.untag-resource-request/tag-keys (clojure.spec.alpha/and :portkey.aws.mediapackage/list-of-string))
(clojure.spec.alpha/def :portkey.aws.mediapackage/untag-resource-request (clojure.spec.alpha/keys :req-un [:portkey.aws.mediapackage.untag-resource-request/tag-keys :portkey.aws.mediapackage.untag-resource-request/resource-arn] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.mediapackage.update-origin-endpoint-request/cmaf-package (clojure.spec.alpha/and :portkey.aws.mediapackage/cmaf-package-create-or-update-parameters))
(clojure.spec.alpha/def :portkey.aws.mediapackage.update-origin-endpoint-request/time-delay-seconds (clojure.spec.alpha/and :portkey.aws.mediapackage/integer))
(clojure.spec.alpha/def :portkey.aws.mediapackage.update-origin-endpoint-request/description (clojure.spec.alpha/and :portkey.aws.mediapackage/string))
(clojure.spec.alpha/def :portkey.aws.mediapackage.update-origin-endpoint-request/whitelist (clojure.spec.alpha/and :portkey.aws.mediapackage/list-of-string))
(clojure.spec.alpha/def :portkey.aws.mediapackage.update-origin-endpoint-request/manifest-name (clojure.spec.alpha/and :portkey.aws.mediapackage/string))
(clojure.spec.alpha/def :portkey.aws.mediapackage.update-origin-endpoint-request/startover-window-seconds (clojure.spec.alpha/and :portkey.aws.mediapackage/integer))
(clojure.spec.alpha/def :portkey.aws.mediapackage.update-origin-endpoint-request/id (clojure.spec.alpha/and :portkey.aws.mediapackage/string))
(clojure.spec.alpha/def :portkey.aws.mediapackage/update-origin-endpoint-request (clojure.spec.alpha/keys :req-un [:portkey.aws.mediapackage.update-origin-endpoint-request/id] :opt-un [:portkey.aws.mediapackage/hls-package :portkey.aws.mediapackage/mss-package :portkey.aws.mediapackage.update-origin-endpoint-request/cmaf-package :portkey.aws.mediapackage.update-origin-endpoint-request/time-delay-seconds :portkey.aws.mediapackage.update-origin-endpoint-request/description :portkey.aws.mediapackage.update-origin-endpoint-request/whitelist :portkey.aws.mediapackage/dash-package :portkey.aws.mediapackage.update-origin-endpoint-request/manifest-name :portkey.aws.mediapackage.update-origin-endpoint-request/startover-window-seconds]))

(clojure.spec.alpha/def :portkey.aws.mediapackage/playlist-type #{"VOD" :vod "EVENT" "NONE" :event :none})

(clojure.spec.alpha/def :portkey.aws.mediapackage/map-of-string (clojure.spec.alpha/map-of :portkey.aws.mediapackage/string :portkey.aws.mediapackage/string))

(clojure.core/defn tag-resource ([tag-resource-requestinput] (clojure.core/let [request-function-result__22119__auto__ (req-tag-resource-request tag-resource-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__22119__auto__ {:http.request.configuration/endpoints portkey.aws.mediapackage/endpoints, :http.request.configuration/target-prefix nil, :http.request.spec/output-spec nil, :http.request.configuration/mime-type {"content-type" "application/json"}, :http.request.configuration/request-uri "/tags/{resource-arn}", :http.request.configuration/version "2017-10-12", :http.request.configuration/service-id "MediaPackage", :http.request.spec/input-spec :portkey.aws.mediapackage/tag-resource-request, :http.request.configuration/protocol "rest-json", :http.request.configuration/method :post, :http.request.configuration/response-code 204, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "TagResource", :http.request.configuration/output-deser-fn (clojure.core/fn [& args__22118__auto__] {}), :http.request.spec/error-spec {}})))))
(clojure.spec.alpha/fdef tag-resource :args (clojure.spec.alpha/tuple :portkey.aws.mediapackage/tag-resource-request) :ret clojure.core/true?)

(clojure.core/defn delete-channel "Deletes an existing Channel." ([delete-channel-requestinput] (clojure.core/let [request-function-result__22119__auto__ (req-delete-channel-request delete-channel-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__22119__auto__ {:http.request.configuration/endpoints portkey.aws.mediapackage/endpoints, :http.request.configuration/target-prefix nil, :http.request.spec/output-spec :portkey.aws.mediapackage/delete-channel-response, :http.request.configuration/mime-type {"content-type" "application/json"}, :http.request.configuration/request-uri "/channels/{id}", :http.request.configuration/version "2017-10-12", :http.request.configuration/service-id "MediaPackage", :http.request.spec/input-spec :portkey.aws.mediapackage/delete-channel-request, :http.request.configuration/protocol "rest-json", :http.request.configuration/method :delete, :http.request.configuration/response-code 202, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "DeleteChannel", :http.request.configuration/output-deser-fn response-delete-channel-response, :http.request.spec/error-spec {"UnprocessableEntityException" :portkey.aws.mediapackage/unprocessable-entity-exception, "InternalServerErrorException" :portkey.aws.mediapackage/internal-server-error-exception, "ForbiddenException" :portkey.aws.mediapackage/forbidden-exception, "NotFoundException" :portkey.aws.mediapackage/not-found-exception, "ServiceUnavailableException" :portkey.aws.mediapackage/service-unavailable-exception, "TooManyRequestsException" :portkey.aws.mediapackage/too-many-requests-exception}})))))
(clojure.spec.alpha/fdef delete-channel :args (clojure.spec.alpha/tuple :portkey.aws.mediapackage/delete-channel-request) :ret (clojure.spec.alpha/and :portkey.aws.mediapackage/delete-channel-response))

(clojure.core/defn create-origin-endpoint "Creates a new OriginEndpoint record." ([create-origin-endpoint-requestinput] (clojure.core/let [request-function-result__22119__auto__ (req-create-origin-endpoint-request create-origin-endpoint-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__22119__auto__ {:http.request.configuration/endpoints portkey.aws.mediapackage/endpoints, :http.request.configuration/target-prefix nil, :http.request.spec/output-spec :portkey.aws.mediapackage/create-origin-endpoint-response, :http.request.configuration/mime-type {"content-type" "application/json"}, :http.request.configuration/request-uri "/origin_endpoints", :http.request.configuration/version "2017-10-12", :http.request.configuration/service-id "MediaPackage", :http.request.spec/input-spec :portkey.aws.mediapackage/create-origin-endpoint-request, :http.request.configuration/protocol "rest-json", :http.request.configuration/method :post, :http.request.configuration/response-code 200, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "CreateOriginEndpoint", :http.request.configuration/output-deser-fn response-create-origin-endpoint-response, :http.request.spec/error-spec {"UnprocessableEntityException" :portkey.aws.mediapackage/unprocessable-entity-exception, "InternalServerErrorException" :portkey.aws.mediapackage/internal-server-error-exception, "ForbiddenException" :portkey.aws.mediapackage/forbidden-exception, "NotFoundException" :portkey.aws.mediapackage/not-found-exception, "ServiceUnavailableException" :portkey.aws.mediapackage/service-unavailable-exception, "TooManyRequestsException" :portkey.aws.mediapackage/too-many-requests-exception}})))))
(clojure.spec.alpha/fdef create-origin-endpoint :args (clojure.spec.alpha/tuple :portkey.aws.mediapackage/create-origin-endpoint-request) :ret (clojure.spec.alpha/and :portkey.aws.mediapackage/create-origin-endpoint-response))

(clojure.core/defn list-origin-endpoints "Returns a collection of OriginEndpoint records." ([] (list-origin-endpoints {})) ([list-origin-endpoints-requestinput] (clojure.core/let [request-function-result__22119__auto__ (req-list-origin-endpoints-request list-origin-endpoints-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__22119__auto__ {:http.request.configuration/endpoints portkey.aws.mediapackage/endpoints, :http.request.configuration/target-prefix nil, :http.request.spec/output-spec :portkey.aws.mediapackage/list-origin-endpoints-response, :http.request.configuration/mime-type {"content-type" "application/json"}, :http.request.configuration/request-uri "/origin_endpoints", :http.request.configuration/version "2017-10-12", :http.request.configuration/service-id "MediaPackage", :http.request.spec/input-spec :portkey.aws.mediapackage/list-origin-endpoints-request, :http.request.configuration/protocol "rest-json", :http.request.configuration/method :get, :http.request.configuration/response-code 200, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "ListOriginEndpoints", :http.request.configuration/output-deser-fn response-list-origin-endpoints-response, :http.request.spec/error-spec {"UnprocessableEntityException" :portkey.aws.mediapackage/unprocessable-entity-exception, "InternalServerErrorException" :portkey.aws.mediapackage/internal-server-error-exception, "ForbiddenException" :portkey.aws.mediapackage/forbidden-exception, "NotFoundException" :portkey.aws.mediapackage/not-found-exception, "ServiceUnavailableException" :portkey.aws.mediapackage/service-unavailable-exception, "TooManyRequestsException" :portkey.aws.mediapackage/too-many-requests-exception}})))))
(clojure.spec.alpha/fdef list-origin-endpoints :args (clojure.spec.alpha/? :portkey.aws.mediapackage/list-origin-endpoints-request) :ret (clojure.spec.alpha/and :portkey.aws.mediapackage/list-origin-endpoints-response))

(clojure.core/defn update-channel "Updates an existing Channel." ([update-channel-requestinput] (clojure.core/let [request-function-result__22119__auto__ (req-update-channel-request update-channel-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__22119__auto__ {:http.request.configuration/endpoints portkey.aws.mediapackage/endpoints, :http.request.configuration/target-prefix nil, :http.request.spec/output-spec :portkey.aws.mediapackage/update-channel-response, :http.request.configuration/mime-type {"content-type" "application/json"}, :http.request.configuration/request-uri "/channels/{id}", :http.request.configuration/version "2017-10-12", :http.request.configuration/service-id "MediaPackage", :http.request.spec/input-spec :portkey.aws.mediapackage/update-channel-request, :http.request.configuration/protocol "rest-json", :http.request.configuration/method :put, :http.request.configuration/response-code 200, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "UpdateChannel", :http.request.configuration/output-deser-fn response-update-channel-response, :http.request.spec/error-spec {"UnprocessableEntityException" :portkey.aws.mediapackage/unprocessable-entity-exception, "InternalServerErrorException" :portkey.aws.mediapackage/internal-server-error-exception, "ForbiddenException" :portkey.aws.mediapackage/forbidden-exception, "NotFoundException" :portkey.aws.mediapackage/not-found-exception, "ServiceUnavailableException" :portkey.aws.mediapackage/service-unavailable-exception, "TooManyRequestsException" :portkey.aws.mediapackage/too-many-requests-exception}})))))
(clojure.spec.alpha/fdef update-channel :args (clojure.spec.alpha/tuple :portkey.aws.mediapackage/update-channel-request) :ret (clojure.spec.alpha/and :portkey.aws.mediapackage/update-channel-response))

(clojure.core/defn list-tags-for-resource ([list-tags-for-resource-requestinput] (clojure.core/let [request-function-result__22119__auto__ (req-list-tags-for-resource-request list-tags-for-resource-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__22119__auto__ {:http.request.configuration/endpoints portkey.aws.mediapackage/endpoints, :http.request.configuration/target-prefix nil, :http.request.spec/output-spec :portkey.aws.mediapackage/list-tags-for-resource-response, :http.request.configuration/mime-type {"content-type" "application/json"}, :http.request.configuration/request-uri "/tags/{resource-arn}", :http.request.configuration/version "2017-10-12", :http.request.configuration/service-id "MediaPackage", :http.request.spec/input-spec :portkey.aws.mediapackage/list-tags-for-resource-request, :http.request.configuration/protocol "rest-json", :http.request.configuration/method :get, :http.request.configuration/response-code 200, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "ListTagsForResource", :http.request.configuration/output-deser-fn response-list-tags-for-resource-response, :http.request.spec/error-spec {}})))))
(clojure.spec.alpha/fdef list-tags-for-resource :args (clojure.spec.alpha/tuple :portkey.aws.mediapackage/list-tags-for-resource-request) :ret (clojure.spec.alpha/and :portkey.aws.mediapackage/list-tags-for-resource-response))

(clojure.core/defn update-origin-endpoint "Updates an existing OriginEndpoint." ([update-origin-endpoint-requestinput] (clojure.core/let [request-function-result__22119__auto__ (req-update-origin-endpoint-request update-origin-endpoint-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__22119__auto__ {:http.request.configuration/endpoints portkey.aws.mediapackage/endpoints, :http.request.configuration/target-prefix nil, :http.request.spec/output-spec :portkey.aws.mediapackage/update-origin-endpoint-response, :http.request.configuration/mime-type {"content-type" "application/json"}, :http.request.configuration/request-uri "/origin_endpoints/{id}", :http.request.configuration/version "2017-10-12", :http.request.configuration/service-id "MediaPackage", :http.request.spec/input-spec :portkey.aws.mediapackage/update-origin-endpoint-request, :http.request.configuration/protocol "rest-json", :http.request.configuration/method :put, :http.request.configuration/response-code 200, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "UpdateOriginEndpoint", :http.request.configuration/output-deser-fn response-update-origin-endpoint-response, :http.request.spec/error-spec {"UnprocessableEntityException" :portkey.aws.mediapackage/unprocessable-entity-exception, "InternalServerErrorException" :portkey.aws.mediapackage/internal-server-error-exception, "ForbiddenException" :portkey.aws.mediapackage/forbidden-exception, "NotFoundException" :portkey.aws.mediapackage/not-found-exception, "ServiceUnavailableException" :portkey.aws.mediapackage/service-unavailable-exception, "TooManyRequestsException" :portkey.aws.mediapackage/too-many-requests-exception}})))))
(clojure.spec.alpha/fdef update-origin-endpoint :args (clojure.spec.alpha/tuple :portkey.aws.mediapackage/update-origin-endpoint-request) :ret (clojure.spec.alpha/and :portkey.aws.mediapackage/update-origin-endpoint-response))

(clojure.core/defn rotate-channel-credentials "Changes the Channel's first IngestEndpoint's username and password. WARNING -\nThis API is deprecated. Please use RotateIngestEndpointCredentials instead" ([rotate-channel-credentials-requestinput] (clojure.core/let [request-function-result__22119__auto__ (req-rotate-channel-credentials-request rotate-channel-credentials-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__22119__auto__ {:http.request.configuration/endpoints portkey.aws.mediapackage/endpoints, :http.request.configuration/target-prefix nil, :http.request.spec/output-spec :portkey.aws.mediapackage/rotate-channel-credentials-response, :http.request.configuration/mime-type {"content-type" "application/json"}, :http.request.configuration/request-uri "/channels/{id}/credentials", :http.request.configuration/version "2017-10-12", :http.request.configuration/service-id "MediaPackage", :http.request.spec/input-spec :portkey.aws.mediapackage/rotate-channel-credentials-request, :http.request.configuration/protocol "rest-json", :http.request.configuration/method :put, :http.request.configuration/response-code 200, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "RotateChannelCredentials", :http.request.configuration/output-deser-fn response-rotate-channel-credentials-response, :http.request.spec/error-spec {"UnprocessableEntityException" :portkey.aws.mediapackage/unprocessable-entity-exception, "InternalServerErrorException" :portkey.aws.mediapackage/internal-server-error-exception, "ForbiddenException" :portkey.aws.mediapackage/forbidden-exception, "NotFoundException" :portkey.aws.mediapackage/not-found-exception, "ServiceUnavailableException" :portkey.aws.mediapackage/service-unavailable-exception, "TooManyRequestsException" :portkey.aws.mediapackage/too-many-requests-exception}})))))
(clojure.spec.alpha/fdef rotate-channel-credentials :args (clojure.spec.alpha/tuple :portkey.aws.mediapackage/rotate-channel-credentials-request) :ret (clojure.spec.alpha/and :portkey.aws.mediapackage/rotate-channel-credentials-response))

(clojure.core/defn describe-origin-endpoint "Gets details about an existing OriginEndpoint." ([describe-origin-endpoint-requestinput] (clojure.core/let [request-function-result__22119__auto__ (req-describe-origin-endpoint-request describe-origin-endpoint-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__22119__auto__ {:http.request.configuration/endpoints portkey.aws.mediapackage/endpoints, :http.request.configuration/target-prefix nil, :http.request.spec/output-spec :portkey.aws.mediapackage/describe-origin-endpoint-response, :http.request.configuration/mime-type {"content-type" "application/json"}, :http.request.configuration/request-uri "/origin_endpoints/{id}", :http.request.configuration/version "2017-10-12", :http.request.configuration/service-id "MediaPackage", :http.request.spec/input-spec :portkey.aws.mediapackage/describe-origin-endpoint-request, :http.request.configuration/protocol "rest-json", :http.request.configuration/method :get, :http.request.configuration/response-code 200, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "DescribeOriginEndpoint", :http.request.configuration/output-deser-fn response-describe-origin-endpoint-response, :http.request.spec/error-spec {"UnprocessableEntityException" :portkey.aws.mediapackage/unprocessable-entity-exception, "InternalServerErrorException" :portkey.aws.mediapackage/internal-server-error-exception, "ForbiddenException" :portkey.aws.mediapackage/forbidden-exception, "NotFoundException" :portkey.aws.mediapackage/not-found-exception, "ServiceUnavailableException" :portkey.aws.mediapackage/service-unavailable-exception, "TooManyRequestsException" :portkey.aws.mediapackage/too-many-requests-exception}})))))
(clojure.spec.alpha/fdef describe-origin-endpoint :args (clojure.spec.alpha/tuple :portkey.aws.mediapackage/describe-origin-endpoint-request) :ret (clojure.spec.alpha/and :portkey.aws.mediapackage/describe-origin-endpoint-response))

(clojure.core/defn create-channel "Creates a new Channel." ([create-channel-requestinput] (clojure.core/let [request-function-result__22119__auto__ (req-create-channel-request create-channel-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__22119__auto__ {:http.request.configuration/endpoints portkey.aws.mediapackage/endpoints, :http.request.configuration/target-prefix nil, :http.request.spec/output-spec :portkey.aws.mediapackage/create-channel-response, :http.request.configuration/mime-type {"content-type" "application/json"}, :http.request.configuration/request-uri "/channels", :http.request.configuration/version "2017-10-12", :http.request.configuration/service-id "MediaPackage", :http.request.spec/input-spec :portkey.aws.mediapackage/create-channel-request, :http.request.configuration/protocol "rest-json", :http.request.configuration/method :post, :http.request.configuration/response-code 200, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "CreateChannel", :http.request.configuration/output-deser-fn response-create-channel-response, :http.request.spec/error-spec {"UnprocessableEntityException" :portkey.aws.mediapackage/unprocessable-entity-exception, "InternalServerErrorException" :portkey.aws.mediapackage/internal-server-error-exception, "ForbiddenException" :portkey.aws.mediapackage/forbidden-exception, "NotFoundException" :portkey.aws.mediapackage/not-found-exception, "ServiceUnavailableException" :portkey.aws.mediapackage/service-unavailable-exception, "TooManyRequestsException" :portkey.aws.mediapackage/too-many-requests-exception}})))))
(clojure.spec.alpha/fdef create-channel :args (clojure.spec.alpha/tuple :portkey.aws.mediapackage/create-channel-request) :ret (clojure.spec.alpha/and :portkey.aws.mediapackage/create-channel-response))

(clojure.core/defn describe-channel "Gets details about a Channel." ([describe-channel-requestinput] (clojure.core/let [request-function-result__22119__auto__ (req-describe-channel-request describe-channel-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__22119__auto__ {:http.request.configuration/endpoints portkey.aws.mediapackage/endpoints, :http.request.configuration/target-prefix nil, :http.request.spec/output-spec :portkey.aws.mediapackage/describe-channel-response, :http.request.configuration/mime-type {"content-type" "application/json"}, :http.request.configuration/request-uri "/channels/{id}", :http.request.configuration/version "2017-10-12", :http.request.configuration/service-id "MediaPackage", :http.request.spec/input-spec :portkey.aws.mediapackage/describe-channel-request, :http.request.configuration/protocol "rest-json", :http.request.configuration/method :get, :http.request.configuration/response-code 200, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "DescribeChannel", :http.request.configuration/output-deser-fn response-describe-channel-response, :http.request.spec/error-spec {"UnprocessableEntityException" :portkey.aws.mediapackage/unprocessable-entity-exception, "InternalServerErrorException" :portkey.aws.mediapackage/internal-server-error-exception, "ForbiddenException" :portkey.aws.mediapackage/forbidden-exception, "NotFoundException" :portkey.aws.mediapackage/not-found-exception, "ServiceUnavailableException" :portkey.aws.mediapackage/service-unavailable-exception, "TooManyRequestsException" :portkey.aws.mediapackage/too-many-requests-exception}})))))
(clojure.spec.alpha/fdef describe-channel :args (clojure.spec.alpha/tuple :portkey.aws.mediapackage/describe-channel-request) :ret (clojure.spec.alpha/and :portkey.aws.mediapackage/describe-channel-response))

(clojure.core/defn list-channels "Returns a collection of Channels." ([] (list-channels {})) ([list-channels-requestinput] (clojure.core/let [request-function-result__22119__auto__ (req-list-channels-request list-channels-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__22119__auto__ {:http.request.configuration/endpoints portkey.aws.mediapackage/endpoints, :http.request.configuration/target-prefix nil, :http.request.spec/output-spec :portkey.aws.mediapackage/list-channels-response, :http.request.configuration/mime-type {"content-type" "application/json"}, :http.request.configuration/request-uri "/channels", :http.request.configuration/version "2017-10-12", :http.request.configuration/service-id "MediaPackage", :http.request.spec/input-spec :portkey.aws.mediapackage/list-channels-request, :http.request.configuration/protocol "rest-json", :http.request.configuration/method :get, :http.request.configuration/response-code 200, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "ListChannels", :http.request.configuration/output-deser-fn response-list-channels-response, :http.request.spec/error-spec {"UnprocessableEntityException" :portkey.aws.mediapackage/unprocessable-entity-exception, "InternalServerErrorException" :portkey.aws.mediapackage/internal-server-error-exception, "ForbiddenException" :portkey.aws.mediapackage/forbidden-exception, "NotFoundException" :portkey.aws.mediapackage/not-found-exception, "ServiceUnavailableException" :portkey.aws.mediapackage/service-unavailable-exception, "TooManyRequestsException" :portkey.aws.mediapackage/too-many-requests-exception}})))))
(clojure.spec.alpha/fdef list-channels :args (clojure.spec.alpha/? :portkey.aws.mediapackage/list-channels-request) :ret (clojure.spec.alpha/and :portkey.aws.mediapackage/list-channels-response))

(clojure.core/defn untag-resource ([untag-resource-requestinput] (clojure.core/let [request-function-result__22119__auto__ (req-untag-resource-request untag-resource-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__22119__auto__ {:http.request.configuration/endpoints portkey.aws.mediapackage/endpoints, :http.request.configuration/target-prefix nil, :http.request.spec/output-spec nil, :http.request.configuration/mime-type {"content-type" "application/json"}, :http.request.configuration/request-uri "/tags/{resource-arn}", :http.request.configuration/version "2017-10-12", :http.request.configuration/service-id "MediaPackage", :http.request.spec/input-spec :portkey.aws.mediapackage/untag-resource-request, :http.request.configuration/protocol "rest-json", :http.request.configuration/method :delete, :http.request.configuration/response-code 204, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "UntagResource", :http.request.configuration/output-deser-fn (clojure.core/fn [& args__22118__auto__] {}), :http.request.spec/error-spec {}})))))
(clojure.spec.alpha/fdef untag-resource :args (clojure.spec.alpha/tuple :portkey.aws.mediapackage/untag-resource-request) :ret clojure.core/true?)

(clojure.core/defn rotate-ingest-endpoint-credentials "Rotate the IngestEndpoint's username and password, as specified by the\nIngestEndpoint's id." ([rotate-ingest-endpoint-credentials-requestinput] (clojure.core/let [request-function-result__22119__auto__ (req-rotate-ingest-endpoint-credentials-request rotate-ingest-endpoint-credentials-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__22119__auto__ {:http.request.configuration/endpoints portkey.aws.mediapackage/endpoints, :http.request.configuration/target-prefix nil, :http.request.spec/output-spec :portkey.aws.mediapackage/rotate-ingest-endpoint-credentials-response, :http.request.configuration/mime-type {"content-type" "application/json"}, :http.request.configuration/request-uri "/channels/{id}/ingest_endpoints/{ingest_endpoint_id}/credentials", :http.request.configuration/version "2017-10-12", :http.request.configuration/service-id "MediaPackage", :http.request.spec/input-spec :portkey.aws.mediapackage/rotate-ingest-endpoint-credentials-request, :http.request.configuration/protocol "rest-json", :http.request.configuration/method :put, :http.request.configuration/response-code 200, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "RotateIngestEndpointCredentials", :http.request.configuration/output-deser-fn response-rotate-ingest-endpoint-credentials-response, :http.request.spec/error-spec {"UnprocessableEntityException" :portkey.aws.mediapackage/unprocessable-entity-exception, "InternalServerErrorException" :portkey.aws.mediapackage/internal-server-error-exception, "ForbiddenException" :portkey.aws.mediapackage/forbidden-exception, "NotFoundException" :portkey.aws.mediapackage/not-found-exception, "ServiceUnavailableException" :portkey.aws.mediapackage/service-unavailable-exception, "TooManyRequestsException" :portkey.aws.mediapackage/too-many-requests-exception}})))))
(clojure.spec.alpha/fdef rotate-ingest-endpoint-credentials :args (clojure.spec.alpha/tuple :portkey.aws.mediapackage/rotate-ingest-endpoint-credentials-request) :ret (clojure.spec.alpha/and :portkey.aws.mediapackage/rotate-ingest-endpoint-credentials-response))

(clojure.core/defn delete-origin-endpoint "Deletes an existing OriginEndpoint." ([delete-origin-endpoint-requestinput] (clojure.core/let [request-function-result__22119__auto__ (req-delete-origin-endpoint-request delete-origin-endpoint-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__22119__auto__ {:http.request.configuration/endpoints portkey.aws.mediapackage/endpoints, :http.request.configuration/target-prefix nil, :http.request.spec/output-spec :portkey.aws.mediapackage/delete-origin-endpoint-response, :http.request.configuration/mime-type {"content-type" "application/json"}, :http.request.configuration/request-uri "/origin_endpoints/{id}", :http.request.configuration/version "2017-10-12", :http.request.configuration/service-id "MediaPackage", :http.request.spec/input-spec :portkey.aws.mediapackage/delete-origin-endpoint-request, :http.request.configuration/protocol "rest-json", :http.request.configuration/method :delete, :http.request.configuration/response-code 202, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "DeleteOriginEndpoint", :http.request.configuration/output-deser-fn response-delete-origin-endpoint-response, :http.request.spec/error-spec {"UnprocessableEntityException" :portkey.aws.mediapackage/unprocessable-entity-exception, "InternalServerErrorException" :portkey.aws.mediapackage/internal-server-error-exception, "ForbiddenException" :portkey.aws.mediapackage/forbidden-exception, "NotFoundException" :portkey.aws.mediapackage/not-found-exception, "ServiceUnavailableException" :portkey.aws.mediapackage/service-unavailable-exception, "TooManyRequestsException" :portkey.aws.mediapackage/too-many-requests-exception}})))))
(clojure.spec.alpha/fdef delete-origin-endpoint :args (clojure.spec.alpha/tuple :portkey.aws.mediapackage/delete-origin-endpoint-request) :ret (clojure.spec.alpha/and :portkey.aws.mediapackage/delete-origin-endpoint-response))
