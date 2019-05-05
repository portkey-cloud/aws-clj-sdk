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

(clojure.core/defn- response-bad-request-exception ([input] (response-bad-request-exception nil input)) ([resultWrapper1368321 input] (clojure.core/let [rawinput1368320 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar1368322 {}] (clojure.core/cond-> {}))))

(clojure.core/defn- response-list-tags-for-resource-response ([input] (response-list-tags-for-resource-response nil input)) ([resultWrapper1368324 input] (clojure.core/let [rawinput1368323 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar1368325 {"tags" (rawinput1368323 "tags")}] (clojure.core/cond-> {} (letvar1368325 "tags") (clojure.core/assoc :tags (deser-map-of-string (clojure.core/get-in letvar1368325 ["tags"])))))))

(clojure.core/defn- response-list-playback-configurations-response ([input] (response-list-playback-configurations-response nil input)) ([resultWrapper1368327 input] (clojure.core/let [rawinput1368326 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar1368328 {"Items" (rawinput1368326 "Items"), "NextToken" (rawinput1368326 "NextToken")}] (clojure.core/cond-> {} (letvar1368328 "Items") (clojure.core/assoc :items (deser-list-of-playback-configurations (clojure.core/get-in letvar1368328 ["Items"]))) (letvar1368328 "NextToken") (clojure.core/assoc :next-token (deser-string (clojure.core/get-in letvar1368328 ["NextToken"])))))))

(clojure.core/defn- response-put-playback-configuration-response ([input] (response-put-playback-configuration-response nil input)) ([resultWrapper1368330 input] (clojure.core/let [rawinput1368329 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar1368331 {"HlsConfiguration" (rawinput1368329 "HlsConfiguration"), "tags" (rawinput1368329 "tags"), "DashConfiguration" (rawinput1368329 "DashConfiguration"), "CdnConfiguration" (rawinput1368329 "CdnConfiguration"), "VideoContentSourceUrl" (rawinput1368329 "VideoContentSourceUrl"), "PlaybackEndpointPrefix" (rawinput1368329 "PlaybackEndpointPrefix"), "AdDecisionServerUrl" (rawinput1368329 "AdDecisionServerUrl"), "PlaybackConfigurationArn" (rawinput1368329 "PlaybackConfigurationArn"), "SlateAdUrl" (rawinput1368329 "SlateAdUrl"), "Name" (rawinput1368329 "Name"), "SessionInitializationEndpointPrefix" (rawinput1368329 "SessionInitializationEndpointPrefix"), "TranscodeProfileName" (rawinput1368329 "TranscodeProfileName")}] (clojure.core/cond-> {} (letvar1368331 "HlsConfiguration") (clojure.core/assoc :hls-configuration (deser-hls-configuration (clojure.core/get-in letvar1368331 ["HlsConfiguration"]))) (letvar1368331 "tags") (clojure.core/assoc :tags (deser-map-of-string (clojure.core/get-in letvar1368331 ["tags"]))) (letvar1368331 "DashConfiguration") (clojure.core/assoc :dash-configuration (deser-dash-configuration (clojure.core/get-in letvar1368331 ["DashConfiguration"]))) (letvar1368331 "CdnConfiguration") (clojure.core/assoc :cdn-configuration (deser-cdn-configuration (clojure.core/get-in letvar1368331 ["CdnConfiguration"]))) (letvar1368331 "VideoContentSourceUrl") (clojure.core/assoc :video-content-source-url (deser-string (clojure.core/get-in letvar1368331 ["VideoContentSourceUrl"]))) (letvar1368331 "PlaybackEndpointPrefix") (clojure.core/assoc :playback-endpoint-prefix (deser-string (clojure.core/get-in letvar1368331 ["PlaybackEndpointPrefix"]))) (letvar1368331 "AdDecisionServerUrl") (clojure.core/assoc :ad-decision-server-url (deser-string (clojure.core/get-in letvar1368331 ["AdDecisionServerUrl"]))) (letvar1368331 "PlaybackConfigurationArn") (clojure.core/assoc :playback-configuration-arn (deser-string (clojure.core/get-in letvar1368331 ["PlaybackConfigurationArn"]))) (letvar1368331 "SlateAdUrl") (clojure.core/assoc :slate-ad-url (deser-string (clojure.core/get-in letvar1368331 ["SlateAdUrl"]))) (letvar1368331 "Name") (clojure.core/assoc :name (deser-string (clojure.core/get-in letvar1368331 ["Name"]))) (letvar1368331 "SessionInitializationEndpointPrefix") (clojure.core/assoc :session-initialization-endpoint-prefix (deser-string (clojure.core/get-in letvar1368331 ["SessionInitializationEndpointPrefix"]))) (letvar1368331 "TranscodeProfileName") (clojure.core/assoc :transcode-profile-name (deser-string (clojure.core/get-in letvar1368331 ["TranscodeProfileName"])))))))

(clojure.core/defn- response-get-playback-configuration-response ([input] (response-get-playback-configuration-response nil input)) ([resultWrapper1368333 input] (clojure.core/let [rawinput1368332 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar1368334 {"HlsConfiguration" (rawinput1368332 "HlsConfiguration"), "tags" (rawinput1368332 "tags"), "DashConfiguration" (rawinput1368332 "DashConfiguration"), "CdnConfiguration" (rawinput1368332 "CdnConfiguration"), "VideoContentSourceUrl" (rawinput1368332 "VideoContentSourceUrl"), "PlaybackEndpointPrefix" (rawinput1368332 "PlaybackEndpointPrefix"), "AdDecisionServerUrl" (rawinput1368332 "AdDecisionServerUrl"), "PlaybackConfigurationArn" (rawinput1368332 "PlaybackConfigurationArn"), "SlateAdUrl" (rawinput1368332 "SlateAdUrl"), "Name" (rawinput1368332 "Name"), "SessionInitializationEndpointPrefix" (rawinput1368332 "SessionInitializationEndpointPrefix"), "TranscodeProfileName" (rawinput1368332 "TranscodeProfileName")}] (clojure.core/cond-> {} (letvar1368334 "HlsConfiguration") (clojure.core/assoc :hls-configuration (deser-hls-configuration (clojure.core/get-in letvar1368334 ["HlsConfiguration"]))) (letvar1368334 "tags") (clojure.core/assoc :tags (deser-map-of-string (clojure.core/get-in letvar1368334 ["tags"]))) (letvar1368334 "DashConfiguration") (clojure.core/assoc :dash-configuration (deser-dash-configuration (clojure.core/get-in letvar1368334 ["DashConfiguration"]))) (letvar1368334 "CdnConfiguration") (clojure.core/assoc :cdn-configuration (deser-cdn-configuration (clojure.core/get-in letvar1368334 ["CdnConfiguration"]))) (letvar1368334 "VideoContentSourceUrl") (clojure.core/assoc :video-content-source-url (deser-string (clojure.core/get-in letvar1368334 ["VideoContentSourceUrl"]))) (letvar1368334 "PlaybackEndpointPrefix") (clojure.core/assoc :playback-endpoint-prefix (deser-string (clojure.core/get-in letvar1368334 ["PlaybackEndpointPrefix"]))) (letvar1368334 "AdDecisionServerUrl") (clojure.core/assoc :ad-decision-server-url (deser-string (clojure.core/get-in letvar1368334 ["AdDecisionServerUrl"]))) (letvar1368334 "PlaybackConfigurationArn") (clojure.core/assoc :playback-configuration-arn (deser-string (clojure.core/get-in letvar1368334 ["PlaybackConfigurationArn"]))) (letvar1368334 "SlateAdUrl") (clojure.core/assoc :slate-ad-url (deser-string (clojure.core/get-in letvar1368334 ["SlateAdUrl"]))) (letvar1368334 "Name") (clojure.core/assoc :name (deser-string (clojure.core/get-in letvar1368334 ["Name"]))) (letvar1368334 "SessionInitializationEndpointPrefix") (clojure.core/assoc :session-initialization-endpoint-prefix (deser-string (clojure.core/get-in letvar1368334 ["SessionInitializationEndpointPrefix"]))) (letvar1368334 "TranscodeProfileName") (clojure.core/assoc :transcode-profile-name (deser-string (clojure.core/get-in letvar1368334 ["TranscodeProfileName"])))))))

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

(clojure.core/defn delete-playback-configuration "Deletes the playback configuration for the specified name." ([delete-playback-configuration-requestinput] (clojure.core/let [request-function-result__22119__auto__ (req-delete-playback-configuration-request delete-playback-configuration-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__22119__auto__ {:http.request.configuration/endpoints portkey.aws.mediatailor.-2018-04-23/endpoints, :http.request.configuration/target-prefix nil, :http.request.spec/output-spec nil, :http.request.configuration/mime-type {"content-type" "application/json"}, :http.request.configuration/request-uri "/playbackConfiguration/{Name}", :http.request.configuration/version "2018-04-23", :http.request.configuration/service-id "MediaTailor", :http.request.spec/input-spec :portkey.aws.mediatailor.-2018-04-23/delete-playback-configuration-request, :http.request.configuration/protocol "rest-json", :http.request.configuration/method :delete, :http.request.configuration/response-code 204, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "DeletePlaybackConfiguration", :http.request.configuration/output-deser-fn (clojure.core/fn [& args__22118__auto__] {}), :http.request.spec/error-spec {}})))))
(clojure.spec.alpha/fdef delete-playback-configuration :args (clojure.spec.alpha/tuple :portkey.aws.mediatailor.-2018-04-23/delete-playback-configuration-request) :ret clojure.core/true?)

(clojure.core/defn get-playback-configuration "Returns the playback configuration for the specified name." ([get-playback-configuration-requestinput] (clojure.core/let [request-function-result__22119__auto__ (req-get-playback-configuration-request get-playback-configuration-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__22119__auto__ {:http.request.configuration/endpoints portkey.aws.mediatailor.-2018-04-23/endpoints, :http.request.configuration/target-prefix nil, :http.request.spec/output-spec :portkey.aws.mediatailor.-2018-04-23/get-playback-configuration-response, :http.request.configuration/mime-type {"content-type" "application/json"}, :http.request.configuration/request-uri "/playbackConfiguration/{Name}", :http.request.configuration/version "2018-04-23", :http.request.configuration/service-id "MediaTailor", :http.request.spec/input-spec :portkey.aws.mediatailor.-2018-04-23/get-playback-configuration-request, :http.request.configuration/protocol "rest-json", :http.request.configuration/method :get, :http.request.configuration/response-code 200, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "GetPlaybackConfiguration", :http.request.configuration/output-deser-fn response-get-playback-configuration-response, :http.request.spec/error-spec {}})))))
(clojure.spec.alpha/fdef get-playback-configuration :args (clojure.spec.alpha/tuple :portkey.aws.mediatailor.-2018-04-23/get-playback-configuration-request) :ret (clojure.spec.alpha/and :portkey.aws.mediatailor.-2018-04-23/get-playback-configuration-response))

(clojure.core/defn list-playback-configurations "Returns a list of the playback configurations defined in AWS Elemental\nMediaTailor. You can specify a maximum number of configurations to return at a\ntime. The default maximum is 50. Results are returned in pagefuls. If\nMediaTailor has more configurations than the specified maximum, it provides\nparameters in the response that you can use to retrieve the next pageful." ([] (list-playback-configurations {})) ([list-playback-configurations-requestinput] (clojure.core/let [request-function-result__22119__auto__ (req-list-playback-configurations-request list-playback-configurations-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__22119__auto__ {:http.request.configuration/endpoints portkey.aws.mediatailor.-2018-04-23/endpoints, :http.request.configuration/target-prefix nil, :http.request.spec/output-spec :portkey.aws.mediatailor.-2018-04-23/list-playback-configurations-response, :http.request.configuration/mime-type {"content-type" "application/json"}, :http.request.configuration/request-uri "/playbackConfigurations", :http.request.configuration/version "2018-04-23", :http.request.configuration/service-id "MediaTailor", :http.request.spec/input-spec :portkey.aws.mediatailor.-2018-04-23/list-playback-configurations-request, :http.request.configuration/protocol "rest-json", :http.request.configuration/method :get, :http.request.configuration/response-code 200, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "ListPlaybackConfigurations", :http.request.configuration/output-deser-fn response-list-playback-configurations-response, :http.request.spec/error-spec {}})))))
(clojure.spec.alpha/fdef list-playback-configurations :args (clojure.spec.alpha/? :portkey.aws.mediatailor.-2018-04-23/list-playback-configurations-request) :ret (clojure.spec.alpha/and :portkey.aws.mediatailor.-2018-04-23/list-playback-configurations-response))

(clojure.core/defn list-tags-for-resource "Returns a list of the tags assigned to the specified playback configuration\nresource." ([list-tags-for-resource-requestinput] (clojure.core/let [request-function-result__22119__auto__ (req-list-tags-for-resource-request list-tags-for-resource-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__22119__auto__ {:http.request.configuration/endpoints portkey.aws.mediatailor.-2018-04-23/endpoints, :http.request.configuration/target-prefix nil, :http.request.spec/output-spec :portkey.aws.mediatailor.-2018-04-23/list-tags-for-resource-response, :http.request.configuration/mime-type {"content-type" "application/json"}, :http.request.configuration/request-uri "/tags/{ResourceArn}", :http.request.configuration/version "2018-04-23", :http.request.configuration/service-id "MediaTailor", :http.request.spec/input-spec :portkey.aws.mediatailor.-2018-04-23/list-tags-for-resource-request, :http.request.configuration/protocol "rest-json", :http.request.configuration/method :get, :http.request.configuration/response-code 200, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "ListTagsForResource", :http.request.configuration/output-deser-fn response-list-tags-for-resource-response, :http.request.spec/error-spec {"BadRequestException" :portkey.aws.mediatailor.-2018-04-23/bad-request-exception}})))))
(clojure.spec.alpha/fdef list-tags-for-resource :args (clojure.spec.alpha/tuple :portkey.aws.mediatailor.-2018-04-23/list-tags-for-resource-request) :ret (clojure.spec.alpha/and :portkey.aws.mediatailor.-2018-04-23/list-tags-for-resource-response))

(clojure.core/defn put-playback-configuration "Adds a new playback configuration to AWS Elemental MediaTailor." ([] (put-playback-configuration {})) ([put-playback-configuration-requestinput] (clojure.core/let [request-function-result__22119__auto__ (req-put-playback-configuration-request put-playback-configuration-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__22119__auto__ {:http.request.configuration/endpoints portkey.aws.mediatailor.-2018-04-23/endpoints, :http.request.configuration/target-prefix nil, :http.request.spec/output-spec :portkey.aws.mediatailor.-2018-04-23/put-playback-configuration-response, :http.request.configuration/mime-type {"content-type" "application/json"}, :http.request.configuration/request-uri "/playbackConfiguration", :http.request.configuration/version "2018-04-23", :http.request.configuration/service-id "MediaTailor", :http.request.spec/input-spec :portkey.aws.mediatailor.-2018-04-23/put-playback-configuration-request, :http.request.configuration/protocol "rest-json", :http.request.configuration/method :put, :http.request.configuration/response-code 200, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "PutPlaybackConfiguration", :http.request.configuration/output-deser-fn response-put-playback-configuration-response, :http.request.spec/error-spec {}})))))
(clojure.spec.alpha/fdef put-playback-configuration :args (clojure.spec.alpha/? :portkey.aws.mediatailor.-2018-04-23/put-playback-configuration-request) :ret (clojure.spec.alpha/and :portkey.aws.mediatailor.-2018-04-23/put-playback-configuration-response))

(clojure.core/defn tag-resource "Adds tags to the specified playback configuration resource. You can specify one\nor more tags to add." ([tag-resource-requestinput] (clojure.core/let [request-function-result__22119__auto__ (req-tag-resource-request tag-resource-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__22119__auto__ {:http.request.configuration/endpoints portkey.aws.mediatailor.-2018-04-23/endpoints, :http.request.configuration/target-prefix nil, :http.request.spec/output-spec nil, :http.request.configuration/mime-type {"content-type" "application/json"}, :http.request.configuration/request-uri "/tags/{ResourceArn}", :http.request.configuration/version "2018-04-23", :http.request.configuration/service-id "MediaTailor", :http.request.spec/input-spec :portkey.aws.mediatailor.-2018-04-23/tag-resource-request, :http.request.configuration/protocol "rest-json", :http.request.configuration/method :post, :http.request.configuration/response-code 204, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "TagResource", :http.request.configuration/output-deser-fn (clojure.core/fn [& args__22118__auto__] {}), :http.request.spec/error-spec {"BadRequestException" :portkey.aws.mediatailor.-2018-04-23/bad-request-exception}})))))
(clojure.spec.alpha/fdef tag-resource :args (clojure.spec.alpha/tuple :portkey.aws.mediatailor.-2018-04-23/tag-resource-request) :ret clojure.core/true?)

(clojure.core/defn untag-resource "Removes tags from the specified playback configuration resource. You can specify\none or more tags to remove." ([untag-resource-requestinput] (clojure.core/let [request-function-result__22119__auto__ (req-untag-resource-request untag-resource-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__22119__auto__ {:http.request.configuration/endpoints portkey.aws.mediatailor.-2018-04-23/endpoints, :http.request.configuration/target-prefix nil, :http.request.spec/output-spec nil, :http.request.configuration/mime-type {"content-type" "application/json"}, :http.request.configuration/request-uri "/tags/{ResourceArn}", :http.request.configuration/version "2018-04-23", :http.request.configuration/service-id "MediaTailor", :http.request.spec/input-spec :portkey.aws.mediatailor.-2018-04-23/untag-resource-request, :http.request.configuration/protocol "rest-json", :http.request.configuration/method :delete, :http.request.configuration/response-code 204, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "UntagResource", :http.request.configuration/output-deser-fn (clojure.core/fn [& args__22118__auto__] {}), :http.request.spec/error-spec {"BadRequestException" :portkey.aws.mediatailor.-2018-04-23/bad-request-exception}})))))
(clojure.spec.alpha/fdef untag-resource :args (clojure.spec.alpha/tuple :portkey.aws.mediatailor.-2018-04-23/untag-resource-request) :ret clojure.core/true?)
