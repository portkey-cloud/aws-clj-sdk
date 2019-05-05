(ns portkey.aws.mediatailor.-2018-04-23 (:require [portkey.aws]))

(def
 endpoints
 '{"ap-northeast-1"
   {:credential-scope
    {:service "api.mediatailor", :region "ap-northeast-1"},
    :ssl-common-name "api.mediatailor.ap-northeast-1.amazonaws.com",
    :endpoint "https://api.mediatailor.ap-northeast-1.amazonaws.com",
    :signature-version :v4},
   "eu-west-1"
   {:credential-scope
    {:service "api.mediatailor", :region "eu-west-1"},
    :ssl-common-name "api.mediatailor.eu-west-1.amazonaws.com",
    :endpoint "https://api.mediatailor.eu-west-1.amazonaws.com",
    :signature-version :v4},
   "ap-southeast-2"
   {:credential-scope
    {:service "api.mediatailor", :region "ap-southeast-2"},
    :ssl-common-name "api.mediatailor.ap-southeast-2.amazonaws.com",
    :endpoint "https://api.mediatailor.ap-southeast-2.amazonaws.com",
    :signature-version :v4},
   "ap-southeast-1"
   {:credential-scope
    {:service "api.mediatailor", :region "ap-southeast-1"},
    :ssl-common-name "api.mediatailor.ap-southeast-1.amazonaws.com",
    :endpoint "https://api.mediatailor.ap-southeast-1.amazonaws.com",
    :signature-version :v4},
   "us-west-2"
   {:credential-scope
    {:service "api.mediatailor", :region "us-west-2"},
    :ssl-common-name "api.mediatailor.us-west-2.amazonaws.com",
    :endpoint "https://api.mediatailor.us-west-2.amazonaws.com",
    :signature-version :v4},
   "us-east-1"
   {:credential-scope
    {:service "api.mediatailor", :region "us-east-1"},
    :ssl-common-name "api.mediatailor.us-east-1.amazonaws.com",
    :endpoint "https://api.mediatailor.us-east-1.amazonaws.com",
    :signature-version :v4}})

(clojure.core/declare ser-string)

(clojure.core/declare ser-dash-configuration-for-put)

(clojure.core/declare ser-integer-min-1-max-100)

(clojure.core/declare ser-cdn-configuration)

(clojure.core/declare ser-list-of-string)

(clojure.core/declare ser-map-of-string)

(clojure.core/defn- ser-string [input] #:http.request.field{:value input, :shape "__string"})

(clojure.core/defn- ser-dash-configuration-for-put [input] (clojure.core/cond-> #:http.request.field{:value [], :shape "DashConfigurationForPut", :type "structure"} (clojure.core/contains? input :mpd-location) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-string (input :mpd-location)) #:http.request.field{:name "MpdLocation", :shape "__string"}))))

(clojure.core/defn- ser-integer-min-1-max-100 [input] #:http.request.field{:value input, :shape "__integerMin1Max100"})

(clojure.core/defn- ser-cdn-configuration [input] (clojure.core/cond-> #:http.request.field{:value [], :shape "CdnConfiguration", :type "structure"} (clojure.core/contains? input :ad-segment-url-prefix) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-string (input :ad-segment-url-prefix)) #:http.request.field{:name "AdSegmentUrlPrefix", :shape "__string"})) (clojure.core/contains? input :content-segment-url-prefix) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-string (input :content-segment-url-prefix)) #:http.request.field{:name "ContentSegmentUrlPrefix", :shape "__string"}))))

(clojure.core/defn- ser-list-of-string [input] #:http.request.field{:value (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (clojure.core/merge (ser-string coll) #:http.request.field{:shape "__string"}))) input), :shape "__listOf__string", :type "list"})

(clojure.core/defn- ser-map-of-string [input] #:http.request.field{:value (clojure.core/into [] (clojure.core/map (clojure.core/fn [[k v]] [(clojure.core/into (ser-string k) #:http.request.field{:map-info "key", :shape "__string"}) (clojure.core/into (ser-string v) #:http.request.field{:map-info "value", :shape "__string"})])) input), :shape "__mapOf__string", :type "map"})

(clojure.core/defn- req-list-tags-for-resource-request [input] (clojure.core/cond-> #:http.request.configuration{:uri [(clojure.core/into (ser-string (input :resource-arn)) #:http.request.field{:name "ResourceArn", :shape "__string", :location "uri", :location-name "ResourceArn"})]}))

(clojure.core/defn- req-tag-resource-request [input] (clojure.core/cond-> #:http.request.configuration{:uri [(clojure.core/into (ser-string (input :resource-arn)) #:http.request.field{:name "ResourceArn", :shape "__string", :location "uri", :location-name "ResourceArn"})], :body [(clojure.core/into (ser-map-of-string (input :tags)) #:http.request.field{:name "Tags", :shape "__mapOf__string", :location-name "tags"})]}))

(clojure.core/defn- req-delete-playback-configuration-request [input] (clojure.core/cond-> #:http.request.configuration{:uri [(clojure.core/into (ser-string (input :name)) #:http.request.field{:name "Name", :shape "__string", :location "uri", :location-name "Name"})]}))

(clojure.core/defn- req-list-playback-configurations-request [input] (clojure.core/cond-> {} (clojure.core/contains? input :max-results) (clojure.core/update-in [:http.request.configuration/querystring] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-integer-min-1-max-100 (input :max-results)) #:http.request.field{:name "MaxResults", :shape "__integerMin1Max100", :location "querystring", :location-name "MaxResults"})) (clojure.core/contains? input :next-token) (clojure.core/update-in [:http.request.configuration/querystring] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-string (input :next-token)) #:http.request.field{:name "NextToken", :shape "__string", :location "querystring", :location-name "NextToken"}))))

(clojure.core/defn- req-put-playback-configuration-request [input] (clojure.core/cond-> {} (clojure.core/contains? input :ad-decision-server-url) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-string (input :ad-decision-server-url)) #:http.request.field{:name "AdDecisionServerUrl", :shape "__string"})) (clojure.core/contains? input :cdn-configuration) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-cdn-configuration (input :cdn-configuration)) #:http.request.field{:name "CdnConfiguration", :shape "CdnConfiguration"})) (clojure.core/contains? input :dash-configuration) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-dash-configuration-for-put (input :dash-configuration)) #:http.request.field{:name "DashConfiguration", :shape "DashConfigurationForPut"})) (clojure.core/contains? input :name) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-string (input :name)) #:http.request.field{:name "Name", :shape "__string"})) (clojure.core/contains? input :slate-ad-url) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-string (input :slate-ad-url)) #:http.request.field{:name "SlateAdUrl", :shape "__string"})) (clojure.core/contains? input :tags) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-map-of-string (input :tags)) #:http.request.field{:name "Tags", :shape "__mapOf__string", :location-name "tags"})) (clojure.core/contains? input :transcode-profile-name) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-string (input :transcode-profile-name)) #:http.request.field{:name "TranscodeProfileName", :shape "__string"})) (clojure.core/contains? input :video-content-source-url) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-string (input :video-content-source-url)) #:http.request.field{:name "VideoContentSourceUrl", :shape "__string"}))))

(clojure.core/defn- req-get-playback-configuration-request [input] (clojure.core/cond-> #:http.request.configuration{:uri [(clojure.core/into (ser-string (input :name)) #:http.request.field{:name "Name", :shape "__string", :location "uri", :location-name "Name"})]}))

(clojure.core/defn- req-untag-resource-request [input] (clojure.core/cond-> #:http.request.configuration{:uri [(clojure.core/into (ser-string (input :resource-arn)) #:http.request.field{:name "ResourceArn", :shape "__string", :location "uri", :location-name "ResourceArn"})], :querystring [(clojure.core/into (ser-list-of-string (input :tag-keys)) #:http.request.field{:name "TagKeys", :shape "__listOf__string", :location "querystring", :location-name "tagKeys"})]}))

(clojure.core/declare deser-hls-configuration)

(clojure.core/declare deser-playback-configuration)

(clojure.core/declare deser-string)

(clojure.core/declare deser-dash-configuration)

(clojure.core/declare deser-cdn-configuration)

(clojure.core/declare deser-list-of-playback-configurations)

(clojure.core/declare deser-map-of-string)

(clojure.core/defn- deser-hls-configuration [input] (clojure.core/cond-> {} (clojure.core/contains? input "ManifestEndpointPrefix") (clojure.core/assoc :manifest-endpoint-prefix (deser-string (input "ManifestEndpointPrefix")))))

(clojure.core/defn- deser-playback-configuration [input] (clojure.core/cond-> {} (clojure.core/contains? input "HlsConfiguration") (clojure.core/assoc :hls-configuration (deser-hls-configuration (input "HlsConfiguration"))) (clojure.core/contains? input "tags") (clojure.core/assoc :tags (deser-map-of-string (input "tags"))) (clojure.core/contains? input "DashConfiguration") (clojure.core/assoc :dash-configuration (deser-dash-configuration (input "DashConfiguration"))) (clojure.core/contains? input "CdnConfiguration") (clojure.core/assoc :cdn-configuration (deser-cdn-configuration (input "CdnConfiguration"))) (clojure.core/contains? input "VideoContentSourceUrl") (clojure.core/assoc :video-content-source-url (deser-string (input "VideoContentSourceUrl"))) (clojure.core/contains? input "PlaybackEndpointPrefix") (clojure.core/assoc :playback-endpoint-prefix (deser-string (input "PlaybackEndpointPrefix"))) (clojure.core/contains? input "AdDecisionServerUrl") (clojure.core/assoc :ad-decision-server-url (deser-string (input "AdDecisionServerUrl"))) (clojure.core/contains? input "PlaybackConfigurationArn") (clojure.core/assoc :playback-configuration-arn (deser-string (input "PlaybackConfigurationArn"))) (clojure.core/contains? input "SlateAdUrl") (clojure.core/assoc :slate-ad-url (deser-string (input "SlateAdUrl"))) (clojure.core/contains? input "Name") (clojure.core/assoc :name (deser-string (input "Name"))) (clojure.core/contains? input "SessionInitializationEndpointPrefix") (clojure.core/assoc :session-initialization-endpoint-prefix (deser-string (input "SessionInitializationEndpointPrefix"))) (clojure.core/contains? input "TranscodeProfileName") (clojure.core/assoc :transcode-profile-name (deser-string (input "TranscodeProfileName")))))

(clojure.core/defn- deser-string [input] input)

(clojure.core/defn- deser-dash-configuration [input] (clojure.core/cond-> {} (clojure.core/contains? input "ManifestEndpointPrefix") (clojure.core/assoc :manifest-endpoint-prefix (deser-string (input "ManifestEndpointPrefix"))) (clojure.core/contains? input "MpdLocation") (clojure.core/assoc :mpd-location (deser-string (input "MpdLocation")))))

(clojure.core/defn- deser-cdn-configuration [input] (clojure.core/cond-> {} (clojure.core/contains? input "AdSegmentUrlPrefix") (clojure.core/assoc :ad-segment-url-prefix (deser-string (input "AdSegmentUrlPrefix"))) (clojure.core/contains? input "ContentSegmentUrlPrefix") (clojure.core/assoc :content-segment-url-prefix (deser-string (input "ContentSegmentUrlPrefix")))))

(clojure.core/defn- deser-list-of-playback-configurations [input] (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (deser-playback-configuration coll))) input))

(clojure.core/defn- deser-map-of-string [input] (clojure.core/into {} (clojure.core/map (clojure.core/fn [[k v]] [(deser-string k) (deser-string v)])) input))

(clojure.core/defn- response-bad-request-exception ([input] (response-bad-request-exception nil input)) ([resultWrapper1378550 input] (clojure.core/let [rawinput1378549 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar1378551 {}] (clojure.core/cond-> {}))))

(clojure.core/defn- response-list-tags-for-resource-response ([input] (response-list-tags-for-resource-response nil input)) ([resultWrapper1378553 input] (clojure.core/let [rawinput1378552 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar1378554 {"tags" (rawinput1378552 "tags")}] (clojure.core/cond-> {} (letvar1378554 "tags") (clojure.core/assoc :tags (deser-map-of-string (clojure.core/get-in letvar1378554 ["tags"])))))))

(clojure.core/defn- response-list-playback-configurations-response ([input] (response-list-playback-configurations-response nil input)) ([resultWrapper1378556 input] (clojure.core/let [rawinput1378555 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar1378557 {"Items" (rawinput1378555 "Items"), "NextToken" (rawinput1378555 "NextToken")}] (clojure.core/cond-> {} (letvar1378557 "Items") (clojure.core/assoc :items (deser-list-of-playback-configurations (clojure.core/get-in letvar1378557 ["Items"]))) (letvar1378557 "NextToken") (clojure.core/assoc :next-token (deser-string (clojure.core/get-in letvar1378557 ["NextToken"])))))))

(clojure.core/defn- response-put-playback-configuration-response ([input] (response-put-playback-configuration-response nil input)) ([resultWrapper1378559 input] (clojure.core/let [rawinput1378558 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar1378560 {"HlsConfiguration" (rawinput1378558 "HlsConfiguration"), "tags" (rawinput1378558 "tags"), "DashConfiguration" (rawinput1378558 "DashConfiguration"), "CdnConfiguration" (rawinput1378558 "CdnConfiguration"), "VideoContentSourceUrl" (rawinput1378558 "VideoContentSourceUrl"), "PlaybackEndpointPrefix" (rawinput1378558 "PlaybackEndpointPrefix"), "AdDecisionServerUrl" (rawinput1378558 "AdDecisionServerUrl"), "PlaybackConfigurationArn" (rawinput1378558 "PlaybackConfigurationArn"), "SlateAdUrl" (rawinput1378558 "SlateAdUrl"), "Name" (rawinput1378558 "Name"), "SessionInitializationEndpointPrefix" (rawinput1378558 "SessionInitializationEndpointPrefix"), "TranscodeProfileName" (rawinput1378558 "TranscodeProfileName")}] (clojure.core/cond-> {} (letvar1378560 "HlsConfiguration") (clojure.core/assoc :hls-configuration (deser-hls-configuration (clojure.core/get-in letvar1378560 ["HlsConfiguration"]))) (letvar1378560 "tags") (clojure.core/assoc :tags (deser-map-of-string (clojure.core/get-in letvar1378560 ["tags"]))) (letvar1378560 "DashConfiguration") (clojure.core/assoc :dash-configuration (deser-dash-configuration (clojure.core/get-in letvar1378560 ["DashConfiguration"]))) (letvar1378560 "CdnConfiguration") (clojure.core/assoc :cdn-configuration (deser-cdn-configuration (clojure.core/get-in letvar1378560 ["CdnConfiguration"]))) (letvar1378560 "VideoContentSourceUrl") (clojure.core/assoc :video-content-source-url (deser-string (clojure.core/get-in letvar1378560 ["VideoContentSourceUrl"]))) (letvar1378560 "PlaybackEndpointPrefix") (clojure.core/assoc :playback-endpoint-prefix (deser-string (clojure.core/get-in letvar1378560 ["PlaybackEndpointPrefix"]))) (letvar1378560 "AdDecisionServerUrl") (clojure.core/assoc :ad-decision-server-url (deser-string (clojure.core/get-in letvar1378560 ["AdDecisionServerUrl"]))) (letvar1378560 "PlaybackConfigurationArn") (clojure.core/assoc :playback-configuration-arn (deser-string (clojure.core/get-in letvar1378560 ["PlaybackConfigurationArn"]))) (letvar1378560 "SlateAdUrl") (clojure.core/assoc :slate-ad-url (deser-string (clojure.core/get-in letvar1378560 ["SlateAdUrl"]))) (letvar1378560 "Name") (clojure.core/assoc :name (deser-string (clojure.core/get-in letvar1378560 ["Name"]))) (letvar1378560 "SessionInitializationEndpointPrefix") (clojure.core/assoc :session-initialization-endpoint-prefix (deser-string (clojure.core/get-in letvar1378560 ["SessionInitializationEndpointPrefix"]))) (letvar1378560 "TranscodeProfileName") (clojure.core/assoc :transcode-profile-name (deser-string (clojure.core/get-in letvar1378560 ["TranscodeProfileName"])))))))

(clojure.core/defn- response-get-playback-configuration-response ([input] (response-get-playback-configuration-response nil input)) ([resultWrapper1378562 input] (clojure.core/let [rawinput1378561 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar1378563 {"HlsConfiguration" (rawinput1378561 "HlsConfiguration"), "tags" (rawinput1378561 "tags"), "DashConfiguration" (rawinput1378561 "DashConfiguration"), "CdnConfiguration" (rawinput1378561 "CdnConfiguration"), "VideoContentSourceUrl" (rawinput1378561 "VideoContentSourceUrl"), "PlaybackEndpointPrefix" (rawinput1378561 "PlaybackEndpointPrefix"), "AdDecisionServerUrl" (rawinput1378561 "AdDecisionServerUrl"), "PlaybackConfigurationArn" (rawinput1378561 "PlaybackConfigurationArn"), "SlateAdUrl" (rawinput1378561 "SlateAdUrl"), "Name" (rawinput1378561 "Name"), "SessionInitializationEndpointPrefix" (rawinput1378561 "SessionInitializationEndpointPrefix"), "TranscodeProfileName" (rawinput1378561 "TranscodeProfileName")}] (clojure.core/cond-> {} (letvar1378563 "HlsConfiguration") (clojure.core/assoc :hls-configuration (deser-hls-configuration (clojure.core/get-in letvar1378563 ["HlsConfiguration"]))) (letvar1378563 "tags") (clojure.core/assoc :tags (deser-map-of-string (clojure.core/get-in letvar1378563 ["tags"]))) (letvar1378563 "DashConfiguration") (clojure.core/assoc :dash-configuration (deser-dash-configuration (clojure.core/get-in letvar1378563 ["DashConfiguration"]))) (letvar1378563 "CdnConfiguration") (clojure.core/assoc :cdn-configuration (deser-cdn-configuration (clojure.core/get-in letvar1378563 ["CdnConfiguration"]))) (letvar1378563 "VideoContentSourceUrl") (clojure.core/assoc :video-content-source-url (deser-string (clojure.core/get-in letvar1378563 ["VideoContentSourceUrl"]))) (letvar1378563 "PlaybackEndpointPrefix") (clojure.core/assoc :playback-endpoint-prefix (deser-string (clojure.core/get-in letvar1378563 ["PlaybackEndpointPrefix"]))) (letvar1378563 "AdDecisionServerUrl") (clojure.core/assoc :ad-decision-server-url (deser-string (clojure.core/get-in letvar1378563 ["AdDecisionServerUrl"]))) (letvar1378563 "PlaybackConfigurationArn") (clojure.core/assoc :playback-configuration-arn (deser-string (clojure.core/get-in letvar1378563 ["PlaybackConfigurationArn"]))) (letvar1378563 "SlateAdUrl") (clojure.core/assoc :slate-ad-url (deser-string (clojure.core/get-in letvar1378563 ["SlateAdUrl"]))) (letvar1378563 "Name") (clojure.core/assoc :name (deser-string (clojure.core/get-in letvar1378563 ["Name"]))) (letvar1378563 "SessionInitializationEndpointPrefix") (clojure.core/assoc :session-initialization-endpoint-prefix (deser-string (clojure.core/get-in letvar1378563 ["SessionInitializationEndpointPrefix"]))) (letvar1378563 "TranscodeProfileName") (clojure.core/assoc :transcode-profile-name (deser-string (clojure.core/get-in letvar1378563 ["TranscodeProfileName"])))))))

(clojure.spec.alpha/def :portkey.aws.mediatailor.-2018-04-23.hls-configuration/manifest-endpoint-prefix (clojure.spec.alpha/and :portkey.aws.mediatailor.-2018-04-23/string))
(clojure.spec.alpha/def :portkey.aws.mediatailor.-2018-04-23/hls-configuration (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.mediatailor.-2018-04-23.hls-configuration/manifest-endpoint-prefix]))

(clojure.spec.alpha/def :portkey.aws.mediatailor.-2018-04-23/bad-request-exception (clojure.spec.alpha/keys :req-un [] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.mediatailor.-2018-04-23.list-tags-for-resource-response/tags (clojure.spec.alpha/and :portkey.aws.mediatailor.-2018-04-23/map-of-string))
(clojure.spec.alpha/def :portkey.aws.mediatailor.-2018-04-23/list-tags-for-resource-response (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.mediatailor.-2018-04-23.list-tags-for-resource-response/tags]))

(clojure.spec.alpha/def :portkey.aws.mediatailor.-2018-04-23.list-playback-configurations-response/items (clojure.spec.alpha/and :portkey.aws.mediatailor.-2018-04-23/list-of-playback-configurations))
(clojure.spec.alpha/def :portkey.aws.mediatailor.-2018-04-23.list-playback-configurations-response/next-token (clojure.spec.alpha/and :portkey.aws.mediatailor.-2018-04-23/string))
(clojure.spec.alpha/def :portkey.aws.mediatailor.-2018-04-23/list-playback-configurations-response (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.mediatailor.-2018-04-23.list-playback-configurations-response/items :portkey.aws.mediatailor.-2018-04-23.list-playback-configurations-response/next-token]))

(clojure.spec.alpha/def :portkey.aws.mediatailor.-2018-04-23.put-playback-configuration-response/tags (clojure.spec.alpha/and :portkey.aws.mediatailor.-2018-04-23/map-of-string))
(clojure.spec.alpha/def :portkey.aws.mediatailor.-2018-04-23.put-playback-configuration-response/video-content-source-url (clojure.spec.alpha/and :portkey.aws.mediatailor.-2018-04-23/string))
(clojure.spec.alpha/def :portkey.aws.mediatailor.-2018-04-23.put-playback-configuration-response/playback-endpoint-prefix (clojure.spec.alpha/and :portkey.aws.mediatailor.-2018-04-23/string))
(clojure.spec.alpha/def :portkey.aws.mediatailor.-2018-04-23.put-playback-configuration-response/ad-decision-server-url (clojure.spec.alpha/and :portkey.aws.mediatailor.-2018-04-23/string))
(clojure.spec.alpha/def :portkey.aws.mediatailor.-2018-04-23.put-playback-configuration-response/playback-configuration-arn (clojure.spec.alpha/and :portkey.aws.mediatailor.-2018-04-23/string))
(clojure.spec.alpha/def :portkey.aws.mediatailor.-2018-04-23.put-playback-configuration-response/slate-ad-url (clojure.spec.alpha/and :portkey.aws.mediatailor.-2018-04-23/string))
(clojure.spec.alpha/def :portkey.aws.mediatailor.-2018-04-23.put-playback-configuration-response/name (clojure.spec.alpha/and :portkey.aws.mediatailor.-2018-04-23/string))
(clojure.spec.alpha/def :portkey.aws.mediatailor.-2018-04-23.put-playback-configuration-response/session-initialization-endpoint-prefix (clojure.spec.alpha/and :portkey.aws.mediatailor.-2018-04-23/string))
(clojure.spec.alpha/def :portkey.aws.mediatailor.-2018-04-23.put-playback-configuration-response/transcode-profile-name (clojure.spec.alpha/and :portkey.aws.mediatailor.-2018-04-23/string))
(clojure.spec.alpha/def :portkey.aws.mediatailor.-2018-04-23/put-playback-configuration-response (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.mediatailor.-2018-04-23/hls-configuration :portkey.aws.mediatailor.-2018-04-23.put-playback-configuration-response/tags :portkey.aws.mediatailor.-2018-04-23/dash-configuration :portkey.aws.mediatailor.-2018-04-23/cdn-configuration :portkey.aws.mediatailor.-2018-04-23.put-playback-configuration-response/video-content-source-url :portkey.aws.mediatailor.-2018-04-23.put-playback-configuration-response/playback-endpoint-prefix :portkey.aws.mediatailor.-2018-04-23.put-playback-configuration-response/ad-decision-server-url :portkey.aws.mediatailor.-2018-04-23.put-playback-configuration-response/playback-configuration-arn :portkey.aws.mediatailor.-2018-04-23.put-playback-configuration-response/slate-ad-url :portkey.aws.mediatailor.-2018-04-23.put-playback-configuration-response/name :portkey.aws.mediatailor.-2018-04-23.put-playback-configuration-response/session-initialization-endpoint-prefix :portkey.aws.mediatailor.-2018-04-23.put-playback-configuration-response/transcode-profile-name]))

(clojure.spec.alpha/def :portkey.aws.mediatailor.-2018-04-23.list-tags-for-resource-request/resource-arn (clojure.spec.alpha/and :portkey.aws.mediatailor.-2018-04-23/string))
(clojure.spec.alpha/def :portkey.aws.mediatailor.-2018-04-23/list-tags-for-resource-request (clojure.spec.alpha/keys :req-un [:portkey.aws.mediatailor.-2018-04-23.list-tags-for-resource-request/resource-arn] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.mediatailor.-2018-04-23.playback-configuration/tags (clojure.spec.alpha/and :portkey.aws.mediatailor.-2018-04-23/map-of-string))
(clojure.spec.alpha/def :portkey.aws.mediatailor.-2018-04-23.playback-configuration/video-content-source-url (clojure.spec.alpha/and :portkey.aws.mediatailor.-2018-04-23/string))
(clojure.spec.alpha/def :portkey.aws.mediatailor.-2018-04-23.playback-configuration/playback-endpoint-prefix (clojure.spec.alpha/and :portkey.aws.mediatailor.-2018-04-23/string))
(clojure.spec.alpha/def :portkey.aws.mediatailor.-2018-04-23.playback-configuration/ad-decision-server-url (clojure.spec.alpha/and :portkey.aws.mediatailor.-2018-04-23/string))
(clojure.spec.alpha/def :portkey.aws.mediatailor.-2018-04-23.playback-configuration/playback-configuration-arn (clojure.spec.alpha/and :portkey.aws.mediatailor.-2018-04-23/string))
(clojure.spec.alpha/def :portkey.aws.mediatailor.-2018-04-23.playback-configuration/slate-ad-url (clojure.spec.alpha/and :portkey.aws.mediatailor.-2018-04-23/string))
(clojure.spec.alpha/def :portkey.aws.mediatailor.-2018-04-23.playback-configuration/name (clojure.spec.alpha/and :portkey.aws.mediatailor.-2018-04-23/string))
(clojure.spec.alpha/def :portkey.aws.mediatailor.-2018-04-23.playback-configuration/session-initialization-endpoint-prefix (clojure.spec.alpha/and :portkey.aws.mediatailor.-2018-04-23/string))
(clojure.spec.alpha/def :portkey.aws.mediatailor.-2018-04-23.playback-configuration/transcode-profile-name (clojure.spec.alpha/and :portkey.aws.mediatailor.-2018-04-23/string))
(clojure.spec.alpha/def :portkey.aws.mediatailor.-2018-04-23/playback-configuration (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.mediatailor.-2018-04-23/hls-configuration :portkey.aws.mediatailor.-2018-04-23.playback-configuration/tags :portkey.aws.mediatailor.-2018-04-23/dash-configuration :portkey.aws.mediatailor.-2018-04-23/cdn-configuration :portkey.aws.mediatailor.-2018-04-23.playback-configuration/video-content-source-url :portkey.aws.mediatailor.-2018-04-23.playback-configuration/playback-endpoint-prefix :portkey.aws.mediatailor.-2018-04-23.playback-configuration/ad-decision-server-url :portkey.aws.mediatailor.-2018-04-23.playback-configuration/playback-configuration-arn :portkey.aws.mediatailor.-2018-04-23.playback-configuration/slate-ad-url :portkey.aws.mediatailor.-2018-04-23.playback-configuration/name :portkey.aws.mediatailor.-2018-04-23.playback-configuration/session-initialization-endpoint-prefix :portkey.aws.mediatailor.-2018-04-23.playback-configuration/transcode-profile-name]))

(clojure.spec.alpha/def :portkey.aws.mediatailor.-2018-04-23/string (clojure.spec.alpha/and clojure.core/string?))

(clojure.spec.alpha/def :portkey.aws.mediatailor.-2018-04-23.dash-configuration-for-put/mpd-location (clojure.spec.alpha/and :portkey.aws.mediatailor.-2018-04-23/string))
(clojure.spec.alpha/def :portkey.aws.mediatailor.-2018-04-23/dash-configuration-for-put (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.mediatailor.-2018-04-23.dash-configuration-for-put/mpd-location]))

(clojure.spec.alpha/def :portkey.aws.mediatailor.-2018-04-23/long clojure.core/int?)

(clojure.spec.alpha/def :portkey.aws.mediatailor.-2018-04-23/integer-min-1-max-100 (clojure.spec.alpha/int-in 1 100))

(clojure.spec.alpha/def :portkey.aws.mediatailor.-2018-04-23.dash-configuration/manifest-endpoint-prefix (clojure.spec.alpha/and :portkey.aws.mediatailor.-2018-04-23/string))
(clojure.spec.alpha/def :portkey.aws.mediatailor.-2018-04-23.dash-configuration/mpd-location (clojure.spec.alpha/and :portkey.aws.mediatailor.-2018-04-23/string))
(clojure.spec.alpha/def :portkey.aws.mediatailor.-2018-04-23/dash-configuration (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.mediatailor.-2018-04-23.dash-configuration/manifest-endpoint-prefix :portkey.aws.mediatailor.-2018-04-23.dash-configuration/mpd-location]))

(clojure.spec.alpha/def :portkey.aws.mediatailor.-2018-04-23.cdn-configuration/ad-segment-url-prefix (clojure.spec.alpha/and :portkey.aws.mediatailor.-2018-04-23/string))
(clojure.spec.alpha/def :portkey.aws.mediatailor.-2018-04-23.cdn-configuration/content-segment-url-prefix (clojure.spec.alpha/and :portkey.aws.mediatailor.-2018-04-23/string))
(clojure.spec.alpha/def :portkey.aws.mediatailor.-2018-04-23/cdn-configuration (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.mediatailor.-2018-04-23.cdn-configuration/ad-segment-url-prefix :portkey.aws.mediatailor.-2018-04-23.cdn-configuration/content-segment-url-prefix]))

(clojure.spec.alpha/def :portkey.aws.mediatailor.-2018-04-23.tag-resource-request/resource-arn (clojure.spec.alpha/and :portkey.aws.mediatailor.-2018-04-23/string))
(clojure.spec.alpha/def :portkey.aws.mediatailor.-2018-04-23.tag-resource-request/tags (clojure.spec.alpha/and :portkey.aws.mediatailor.-2018-04-23/map-of-string))
(clojure.spec.alpha/def :portkey.aws.mediatailor.-2018-04-23/tag-resource-request (clojure.spec.alpha/keys :req-un [:portkey.aws.mediatailor.-2018-04-23.tag-resource-request/resource-arn :portkey.aws.mediatailor.-2018-04-23.tag-resource-request/tags] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.mediatailor.-2018-04-23/list-of-string (clojure.spec.alpha/coll-of :portkey.aws.mediatailor.-2018-04-23/string))

(clojure.spec.alpha/def :portkey.aws.mediatailor.-2018-04-23/boolean clojure.core/boolean?)

(clojure.spec.alpha/def :portkey.aws.mediatailor.-2018-04-23/list-of-playback-configurations (clojure.spec.alpha/coll-of :portkey.aws.mediatailor.-2018-04-23/playback-configuration))

(clojure.spec.alpha/def :portkey.aws.mediatailor.-2018-04-23/timestamp-iso-8601 clojure.core/inst?)

(clojure.spec.alpha/def :portkey.aws.mediatailor.-2018-04-23/double clojure.core/double?)

(clojure.spec.alpha/def :portkey.aws.mediatailor.-2018-04-23.delete-playback-configuration-request/name (clojure.spec.alpha/and :portkey.aws.mediatailor.-2018-04-23/string))
(clojure.spec.alpha/def :portkey.aws.mediatailor.-2018-04-23/delete-playback-configuration-request (clojure.spec.alpha/keys :req-un [:portkey.aws.mediatailor.-2018-04-23.delete-playback-configuration-request/name] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.mediatailor.-2018-04-23.get-playback-configuration-response/tags (clojure.spec.alpha/and :portkey.aws.mediatailor.-2018-04-23/map-of-string))
(clojure.spec.alpha/def :portkey.aws.mediatailor.-2018-04-23.get-playback-configuration-response/video-content-source-url (clojure.spec.alpha/and :portkey.aws.mediatailor.-2018-04-23/string))
(clojure.spec.alpha/def :portkey.aws.mediatailor.-2018-04-23.get-playback-configuration-response/playback-endpoint-prefix (clojure.spec.alpha/and :portkey.aws.mediatailor.-2018-04-23/string))
(clojure.spec.alpha/def :portkey.aws.mediatailor.-2018-04-23.get-playback-configuration-response/ad-decision-server-url (clojure.spec.alpha/and :portkey.aws.mediatailor.-2018-04-23/string))
(clojure.spec.alpha/def :portkey.aws.mediatailor.-2018-04-23.get-playback-configuration-response/playback-configuration-arn (clojure.spec.alpha/and :portkey.aws.mediatailor.-2018-04-23/string))
(clojure.spec.alpha/def :portkey.aws.mediatailor.-2018-04-23.get-playback-configuration-response/slate-ad-url (clojure.spec.alpha/and :portkey.aws.mediatailor.-2018-04-23/string))
(clojure.spec.alpha/def :portkey.aws.mediatailor.-2018-04-23.get-playback-configuration-response/name (clojure.spec.alpha/and :portkey.aws.mediatailor.-2018-04-23/string))
(clojure.spec.alpha/def :portkey.aws.mediatailor.-2018-04-23.get-playback-configuration-response/session-initialization-endpoint-prefix (clojure.spec.alpha/and :portkey.aws.mediatailor.-2018-04-23/string))
(clojure.spec.alpha/def :portkey.aws.mediatailor.-2018-04-23.get-playback-configuration-response/transcode-profile-name (clojure.spec.alpha/and :portkey.aws.mediatailor.-2018-04-23/string))
(clojure.spec.alpha/def :portkey.aws.mediatailor.-2018-04-23/get-playback-configuration-response (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.mediatailor.-2018-04-23/hls-configuration :portkey.aws.mediatailor.-2018-04-23.get-playback-configuration-response/tags :portkey.aws.mediatailor.-2018-04-23/dash-configuration :portkey.aws.mediatailor.-2018-04-23/cdn-configuration :portkey.aws.mediatailor.-2018-04-23.get-playback-configuration-response/video-content-source-url :portkey.aws.mediatailor.-2018-04-23.get-playback-configuration-response/playback-endpoint-prefix :portkey.aws.mediatailor.-2018-04-23.get-playback-configuration-response/ad-decision-server-url :portkey.aws.mediatailor.-2018-04-23.get-playback-configuration-response/playback-configuration-arn :portkey.aws.mediatailor.-2018-04-23.get-playback-configuration-response/slate-ad-url :portkey.aws.mediatailor.-2018-04-23.get-playback-configuration-response/name :portkey.aws.mediatailor.-2018-04-23.get-playback-configuration-response/session-initialization-endpoint-prefix :portkey.aws.mediatailor.-2018-04-23.get-playback-configuration-response/transcode-profile-name]))

(clojure.spec.alpha/def :portkey.aws.mediatailor.-2018-04-23.list-playback-configurations-request/max-results (clojure.spec.alpha/and :portkey.aws.mediatailor.-2018-04-23/integer-min-1-max-100))
(clojure.spec.alpha/def :portkey.aws.mediatailor.-2018-04-23.list-playback-configurations-request/next-token (clojure.spec.alpha/and :portkey.aws.mediatailor.-2018-04-23/string))
(clojure.spec.alpha/def :portkey.aws.mediatailor.-2018-04-23/list-playback-configurations-request (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.mediatailor.-2018-04-23.list-playback-configurations-request/max-results :portkey.aws.mediatailor.-2018-04-23.list-playback-configurations-request/next-token]))

(clojure.spec.alpha/def :portkey.aws.mediatailor.-2018-04-23.put-playback-configuration-request/ad-decision-server-url (clojure.spec.alpha/and :portkey.aws.mediatailor.-2018-04-23/string))
(clojure.spec.alpha/def :portkey.aws.mediatailor.-2018-04-23.put-playback-configuration-request/dash-configuration (clojure.spec.alpha/and :portkey.aws.mediatailor.-2018-04-23/dash-configuration-for-put))
(clojure.spec.alpha/def :portkey.aws.mediatailor.-2018-04-23.put-playback-configuration-request/name (clojure.spec.alpha/and :portkey.aws.mediatailor.-2018-04-23/string))
(clojure.spec.alpha/def :portkey.aws.mediatailor.-2018-04-23.put-playback-configuration-request/slate-ad-url (clojure.spec.alpha/and :portkey.aws.mediatailor.-2018-04-23/string))
(clojure.spec.alpha/def :portkey.aws.mediatailor.-2018-04-23.put-playback-configuration-request/tags (clojure.spec.alpha/and :portkey.aws.mediatailor.-2018-04-23/map-of-string))
(clojure.spec.alpha/def :portkey.aws.mediatailor.-2018-04-23.put-playback-configuration-request/transcode-profile-name (clojure.spec.alpha/and :portkey.aws.mediatailor.-2018-04-23/string))
(clojure.spec.alpha/def :portkey.aws.mediatailor.-2018-04-23.put-playback-configuration-request/video-content-source-url (clojure.spec.alpha/and :portkey.aws.mediatailor.-2018-04-23/string))
(clojure.spec.alpha/def :portkey.aws.mediatailor.-2018-04-23/put-playback-configuration-request (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.mediatailor.-2018-04-23.put-playback-configuration-request/ad-decision-server-url :portkey.aws.mediatailor.-2018-04-23/cdn-configuration :portkey.aws.mediatailor.-2018-04-23.put-playback-configuration-request/dash-configuration :portkey.aws.mediatailor.-2018-04-23.put-playback-configuration-request/name :portkey.aws.mediatailor.-2018-04-23.put-playback-configuration-request/slate-ad-url :portkey.aws.mediatailor.-2018-04-23.put-playback-configuration-request/tags :portkey.aws.mediatailor.-2018-04-23.put-playback-configuration-request/transcode-profile-name :portkey.aws.mediatailor.-2018-04-23.put-playback-configuration-request/video-content-source-url]))

(clojure.spec.alpha/def :portkey.aws.mediatailor.-2018-04-23/integer clojure.core/int?)

(clojure.spec.alpha/def :portkey.aws.mediatailor.-2018-04-23.get-playback-configuration-request/name (clojure.spec.alpha/and :portkey.aws.mediatailor.-2018-04-23/string))
(clojure.spec.alpha/def :portkey.aws.mediatailor.-2018-04-23/get-playback-configuration-request (clojure.spec.alpha/keys :req-un [:portkey.aws.mediatailor.-2018-04-23.get-playback-configuration-request/name] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.mediatailor.-2018-04-23/timestamp-unix clojure.core/inst?)

(clojure.spec.alpha/def :portkey.aws.mediatailor.-2018-04-23.tags-model/tags (clojure.spec.alpha/and :portkey.aws.mediatailor.-2018-04-23/map-of-string))
(clojure.spec.alpha/def :portkey.aws.mediatailor.-2018-04-23/tags-model (clojure.spec.alpha/keys :req-un [:portkey.aws.mediatailor.-2018-04-23.tags-model/tags] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.mediatailor.-2018-04-23.untag-resource-request/resource-arn (clojure.spec.alpha/and :portkey.aws.mediatailor.-2018-04-23/string))
(clojure.spec.alpha/def :portkey.aws.mediatailor.-2018-04-23.untag-resource-request/tag-keys (clojure.spec.alpha/and :portkey.aws.mediatailor.-2018-04-23/list-of-string))
(clojure.spec.alpha/def :portkey.aws.mediatailor.-2018-04-23/untag-resource-request (clojure.spec.alpha/keys :req-un [:portkey.aws.mediatailor.-2018-04-23.untag-resource-request/resource-arn :portkey.aws.mediatailor.-2018-04-23.untag-resource-request/tag-keys] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.mediatailor.-2018-04-23/map-of-string (clojure.spec.alpha/map-of :portkey.aws.mediatailor.-2018-04-23/string :portkey.aws.mediatailor.-2018-04-23/string))

(clojure.core/defn delete-playback-configuration ([delete-playback-configuration-requestinput] (clojure.core/let [request-function-result__1013884__auto__ (req-delete-playback-configuration-request delete-playback-configuration-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__1013884__auto__ {:http.request.configuration/endpoints portkey.aws.mediatailor.-2018-04-23/endpoints, :http.request.configuration/target-prefix nil, :http.request.spec/output-spec nil, :http.request.configuration/mime-type {"content-type" "application/json"}, :http.request.configuration/request-uri "/playbackConfiguration/{Name}", :http.request.configuration/version "2018-04-23", :http.request.configuration/service-id "MediaTailor", :http.request.spec/input-spec :portkey.aws.mediatailor.-2018-04-23/delete-playback-configuration-request, :http.request.configuration/protocol "rest-json", :http.request.configuration/method :delete, :http.request.configuration/response-code 204, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "DeletePlaybackConfiguration", :http.request.configuration/output-deser-fn (clojure.core/fn [& args__1013883__auto__] {}), :http.request.spec/error-spec {}})))))
(clojure.spec.alpha/fdef delete-playback-configuration :args (clojure.spec.alpha/tuple :portkey.aws.mediatailor.-2018-04-23/delete-playback-configuration-request) :ret clojure.core/true?)

(clojure.core/defn get-playback-configuration ([get-playback-configuration-requestinput] (clojure.core/let [request-function-result__1013884__auto__ (req-get-playback-configuration-request get-playback-configuration-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__1013884__auto__ {:http.request.configuration/endpoints portkey.aws.mediatailor.-2018-04-23/endpoints, :http.request.configuration/target-prefix nil, :http.request.spec/output-spec :portkey.aws.mediatailor.-2018-04-23/get-playback-configuration-response, :http.request.configuration/mime-type {"content-type" "application/json"}, :http.request.configuration/request-uri "/playbackConfiguration/{Name}", :http.request.configuration/version "2018-04-23", :http.request.configuration/service-id "MediaTailor", :http.request.spec/input-spec :portkey.aws.mediatailor.-2018-04-23/get-playback-configuration-request, :http.request.configuration/protocol "rest-json", :http.request.configuration/method :get, :http.request.configuration/response-code 200, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "GetPlaybackConfiguration", :http.request.configuration/output-deser-fn response-get-playback-configuration-response, :http.request.spec/error-spec {}})))))
(clojure.spec.alpha/fdef get-playback-configuration :args (clojure.spec.alpha/tuple :portkey.aws.mediatailor.-2018-04-23/get-playback-configuration-request) :ret (clojure.spec.alpha/and :portkey.aws.mediatailor.-2018-04-23/get-playback-configuration-response))

(clojure.core/defn list-playback-configurations ([] (list-playback-configurations {})) ([list-playback-configurations-requestinput] (clojure.core/let [request-function-result__1013884__auto__ (req-list-playback-configurations-request list-playback-configurations-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__1013884__auto__ {:http.request.configuration/endpoints portkey.aws.mediatailor.-2018-04-23/endpoints, :http.request.configuration/target-prefix nil, :http.request.spec/output-spec :portkey.aws.mediatailor.-2018-04-23/list-playback-configurations-response, :http.request.configuration/mime-type {"content-type" "application/json"}, :http.request.configuration/request-uri "/playbackConfigurations", :http.request.configuration/version "2018-04-23", :http.request.configuration/service-id "MediaTailor", :http.request.spec/input-spec :portkey.aws.mediatailor.-2018-04-23/list-playback-configurations-request, :http.request.configuration/protocol "rest-json", :http.request.configuration/method :get, :http.request.configuration/response-code 200, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "ListPlaybackConfigurations", :http.request.configuration/output-deser-fn response-list-playback-configurations-response, :http.request.spec/error-spec {}})))))
(clojure.spec.alpha/fdef list-playback-configurations :args (clojure.spec.alpha/? :portkey.aws.mediatailor.-2018-04-23/list-playback-configurations-request) :ret (clojure.spec.alpha/and :portkey.aws.mediatailor.-2018-04-23/list-playback-configurations-response))

(clojure.core/defn list-tags-for-resource ([list-tags-for-resource-requestinput] (clojure.core/let [request-function-result__1013884__auto__ (req-list-tags-for-resource-request list-tags-for-resource-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__1013884__auto__ {:http.request.configuration/endpoints portkey.aws.mediatailor.-2018-04-23/endpoints, :http.request.configuration/target-prefix nil, :http.request.spec/output-spec :portkey.aws.mediatailor.-2018-04-23/list-tags-for-resource-response, :http.request.configuration/mime-type {"content-type" "application/json"}, :http.request.configuration/request-uri "/tags/{ResourceArn}", :http.request.configuration/version "2018-04-23", :http.request.configuration/service-id "MediaTailor", :http.request.spec/input-spec :portkey.aws.mediatailor.-2018-04-23/list-tags-for-resource-request, :http.request.configuration/protocol "rest-json", :http.request.configuration/method :get, :http.request.configuration/response-code 200, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "ListTagsForResource", :http.request.configuration/output-deser-fn response-list-tags-for-resource-response, :http.request.spec/error-spec {"BadRequestException" :portkey.aws.mediatailor.-2018-04-23/bad-request-exception}})))))
(clojure.spec.alpha/fdef list-tags-for-resource :args (clojure.spec.alpha/tuple :portkey.aws.mediatailor.-2018-04-23/list-tags-for-resource-request) :ret (clojure.spec.alpha/and :portkey.aws.mediatailor.-2018-04-23/list-tags-for-resource-response))

(clojure.core/defn put-playback-configuration ([] (put-playback-configuration {})) ([put-playback-configuration-requestinput] (clojure.core/let [request-function-result__1013884__auto__ (req-put-playback-configuration-request put-playback-configuration-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__1013884__auto__ {:http.request.configuration/endpoints portkey.aws.mediatailor.-2018-04-23/endpoints, :http.request.configuration/target-prefix nil, :http.request.spec/output-spec :portkey.aws.mediatailor.-2018-04-23/put-playback-configuration-response, :http.request.configuration/mime-type {"content-type" "application/json"}, :http.request.configuration/request-uri "/playbackConfiguration", :http.request.configuration/version "2018-04-23", :http.request.configuration/service-id "MediaTailor", :http.request.spec/input-spec :portkey.aws.mediatailor.-2018-04-23/put-playback-configuration-request, :http.request.configuration/protocol "rest-json", :http.request.configuration/method :put, :http.request.configuration/response-code 200, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "PutPlaybackConfiguration", :http.request.configuration/output-deser-fn response-put-playback-configuration-response, :http.request.spec/error-spec {}})))))
(clojure.spec.alpha/fdef put-playback-configuration :args (clojure.spec.alpha/? :portkey.aws.mediatailor.-2018-04-23/put-playback-configuration-request) :ret (clojure.spec.alpha/and :portkey.aws.mediatailor.-2018-04-23/put-playback-configuration-response))

(clojure.core/defn tag-resource ([tag-resource-requestinput] (clojure.core/let [request-function-result__1013884__auto__ (req-tag-resource-request tag-resource-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__1013884__auto__ {:http.request.configuration/endpoints portkey.aws.mediatailor.-2018-04-23/endpoints, :http.request.configuration/target-prefix nil, :http.request.spec/output-spec nil, :http.request.configuration/mime-type {"content-type" "application/json"}, :http.request.configuration/request-uri "/tags/{ResourceArn}", :http.request.configuration/version "2018-04-23", :http.request.configuration/service-id "MediaTailor", :http.request.spec/input-spec :portkey.aws.mediatailor.-2018-04-23/tag-resource-request, :http.request.configuration/protocol "rest-json", :http.request.configuration/method :post, :http.request.configuration/response-code 204, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "TagResource", :http.request.configuration/output-deser-fn (clojure.core/fn [& args__1013883__auto__] {}), :http.request.spec/error-spec {"BadRequestException" :portkey.aws.mediatailor.-2018-04-23/bad-request-exception}})))))
(clojure.spec.alpha/fdef tag-resource :args (clojure.spec.alpha/tuple :portkey.aws.mediatailor.-2018-04-23/tag-resource-request) :ret clojure.core/true?)

(clojure.core/defn untag-resource ([untag-resource-requestinput] (clojure.core/let [request-function-result__1013884__auto__ (req-untag-resource-request untag-resource-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__1013884__auto__ {:http.request.configuration/endpoints portkey.aws.mediatailor.-2018-04-23/endpoints, :http.request.configuration/target-prefix nil, :http.request.spec/output-spec nil, :http.request.configuration/mime-type {"content-type" "application/json"}, :http.request.configuration/request-uri "/tags/{ResourceArn}", :http.request.configuration/version "2018-04-23", :http.request.configuration/service-id "MediaTailor", :http.request.spec/input-spec :portkey.aws.mediatailor.-2018-04-23/untag-resource-request, :http.request.configuration/protocol "rest-json", :http.request.configuration/method :delete, :http.request.configuration/response-code 204, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "UntagResource", :http.request.configuration/output-deser-fn (clojure.core/fn [& args__1013883__auto__] {}), :http.request.spec/error-spec {"BadRequestException" :portkey.aws.mediatailor.-2018-04-23/bad-request-exception}})))))
(clojure.spec.alpha/fdef untag-resource :args (clojure.spec.alpha/tuple :portkey.aws.mediatailor.-2018-04-23/untag-resource-request) :ret clojure.core/true?)
