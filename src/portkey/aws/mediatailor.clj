(ns portkey.aws.mediatailor (:require [portkey.aws]))

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
   "us-east-1"
   {:credential-scope
    {:service "api.mediatailor", :region "us-east-1"},
    :ssl-common-name "api.mediatailor.us-east-1.amazonaws.com",
    :endpoint "https://api.mediatailor.us-east-1.amazonaws.com",
    :signature-version :v4}})

(clojure.core/declare ser-string)

(clojure.core/declare ser-integer-min-1-max-100)

(clojure.core/declare ser-cdn-configuration)

(clojure.core/defn- ser-string [input] #:http.request.field{:value input, :shape "__string"})

(clojure.core/defn- ser-integer-min-1-max-100 [input] #:http.request.field{:value input, :shape "__integerMin1Max100"})

(clojure.core/defn- ser-cdn-configuration [input] (clojure.core/cond-> #:http.request.field{:value [], :shape "CdnConfiguration", :type "structure"} (clojure.core/contains? input :ad-segment-url-prefix) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-string (input :ad-segment-url-prefix)) #:http.request.field{:name "AdSegmentUrlPrefix", :shape "__string"})) (clojure.core/contains? input :content-segment-url-prefix) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-string (input :content-segment-url-prefix)) #:http.request.field{:name "ContentSegmentUrlPrefix", :shape "__string"}))))

(clojure.core/defn- req-delete-playback-configuration-request [input] (clojure.core/cond-> #:http.request.configuration{:uri [(clojure.core/into (ser-string (input :name)) #:http.request.field{:name "Name", :shape "__string", :location "uri", :location-name "Name"})]}))

(clojure.core/defn- req-list-playback-configurations-request [input] (clojure.core/cond-> {} (clojure.core/contains? input :max-results) (clojure.core/update-in [:http.request.configuration/querystring] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-integer-min-1-max-100 (input :max-results)) #:http.request.field{:name "MaxResults", :shape "__integerMin1Max100", :location "querystring", :location-name "MaxResults"})) (clojure.core/contains? input :next-token) (clojure.core/update-in [:http.request.configuration/querystring] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-string (input :next-token)) #:http.request.field{:name "NextToken", :shape "__string", :location "querystring", :location-name "NextToken"}))))

(clojure.core/defn- req-put-playback-configuration-request [input] (clojure.core/cond-> {} (clojure.core/contains? input :ad-decision-server-url) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-string (input :ad-decision-server-url)) #:http.request.field{:name "AdDecisionServerUrl", :shape "__string"})) (clojure.core/contains? input :cdn-configuration) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-cdn-configuration (input :cdn-configuration)) #:http.request.field{:name "CdnConfiguration", :shape "CdnConfiguration"})) (clojure.core/contains? input :name) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-string (input :name)) #:http.request.field{:name "Name", :shape "__string"})) (clojure.core/contains? input :slate-ad-url) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-string (input :slate-ad-url)) #:http.request.field{:name "SlateAdUrl", :shape "__string"})) (clojure.core/contains? input :video-content-source-url) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-string (input :video-content-source-url)) #:http.request.field{:name "VideoContentSourceUrl", :shape "__string"}))))

(clojure.core/defn- req-get-playback-configuration-request [input] (clojure.core/cond-> #:http.request.configuration{:uri [(clojure.core/into (ser-string (input :name)) #:http.request.field{:name "Name", :shape "__string", :location "uri", :location-name "Name"})]}))

(clojure.spec.alpha/def :portkey.aws.mediatailor.hls-configuration/manifest-endpoint-prefix (clojure.spec.alpha/and :portkey.aws.mediatailor/string))
(clojure.spec.alpha/def :portkey.aws.mediatailor/hls-configuration (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.mediatailor.hls-configuration/manifest-endpoint-prefix]))

(clojure.spec.alpha/def :portkey.aws.mediatailor.list-playback-configurations-response/items (clojure.spec.alpha/and :portkey.aws.mediatailor/list-of-playback-configurations))
(clojure.spec.alpha/def :portkey.aws.mediatailor.list-playback-configurations-response/next-token (clojure.spec.alpha/and :portkey.aws.mediatailor/string))
(clojure.spec.alpha/def :portkey.aws.mediatailor/list-playback-configurations-response (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.mediatailor.list-playback-configurations-response/items :portkey.aws.mediatailor.list-playback-configurations-response/next-token]))

(clojure.spec.alpha/def :portkey.aws.mediatailor.put-playback-configuration-response/ad-decision-server-url (clojure.spec.alpha/and :portkey.aws.mediatailor/string))
(clojure.spec.alpha/def :portkey.aws.mediatailor.put-playback-configuration-response/name (clojure.spec.alpha/and :portkey.aws.mediatailor/string))
(clojure.spec.alpha/def :portkey.aws.mediatailor.put-playback-configuration-response/playback-endpoint-prefix (clojure.spec.alpha/and :portkey.aws.mediatailor/string))
(clojure.spec.alpha/def :portkey.aws.mediatailor.put-playback-configuration-response/session-initialization-endpoint-prefix (clojure.spec.alpha/and :portkey.aws.mediatailor/string))
(clojure.spec.alpha/def :portkey.aws.mediatailor.put-playback-configuration-response/slate-ad-url (clojure.spec.alpha/and :portkey.aws.mediatailor/string))
(clojure.spec.alpha/def :portkey.aws.mediatailor.put-playback-configuration-response/video-content-source-url (clojure.spec.alpha/and :portkey.aws.mediatailor/string))
(clojure.spec.alpha/def :portkey.aws.mediatailor/put-playback-configuration-response (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.mediatailor.put-playback-configuration-response/ad-decision-server-url :portkey.aws.mediatailor/cdn-configuration :portkey.aws.mediatailor/hls-configuration :portkey.aws.mediatailor.put-playback-configuration-response/name :portkey.aws.mediatailor.put-playback-configuration-response/playback-endpoint-prefix :portkey.aws.mediatailor.put-playback-configuration-response/session-initialization-endpoint-prefix :portkey.aws.mediatailor.put-playback-configuration-response/slate-ad-url :portkey.aws.mediatailor.put-playback-configuration-response/video-content-source-url]))

(clojure.spec.alpha/def :portkey.aws.mediatailor.playback-configuration/ad-decision-server-url (clojure.spec.alpha/and :portkey.aws.mediatailor/string))
(clojure.spec.alpha/def :portkey.aws.mediatailor.playback-configuration/name (clojure.spec.alpha/and :portkey.aws.mediatailor/string))
(clojure.spec.alpha/def :portkey.aws.mediatailor.playback-configuration/slate-ad-url (clojure.spec.alpha/and :portkey.aws.mediatailor/string))
(clojure.spec.alpha/def :portkey.aws.mediatailor.playback-configuration/video-content-source-url (clojure.spec.alpha/and :portkey.aws.mediatailor/string))
(clojure.spec.alpha/def :portkey.aws.mediatailor/playback-configuration (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.mediatailor.playback-configuration/ad-decision-server-url :portkey.aws.mediatailor/cdn-configuration :portkey.aws.mediatailor.playback-configuration/name :portkey.aws.mediatailor.playback-configuration/slate-ad-url :portkey.aws.mediatailor.playback-configuration/video-content-source-url]))

(clojure.spec.alpha/def :portkey.aws.mediatailor/string (clojure.spec.alpha/and clojure.core/string?))

(clojure.spec.alpha/def :portkey.aws.mediatailor/long clojure.core/int?)

(clojure.spec.alpha/def :portkey.aws.mediatailor/integer-min-1-max-100 (clojure.spec.alpha/int-in 1 100))

(clojure.spec.alpha/def :portkey.aws.mediatailor.cdn-configuration/ad-segment-url-prefix (clojure.spec.alpha/and :portkey.aws.mediatailor/string))
(clojure.spec.alpha/def :portkey.aws.mediatailor.cdn-configuration/content-segment-url-prefix (clojure.spec.alpha/and :portkey.aws.mediatailor/string))
(clojure.spec.alpha/def :portkey.aws.mediatailor/cdn-configuration (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.mediatailor.cdn-configuration/ad-segment-url-prefix :portkey.aws.mediatailor.cdn-configuration/content-segment-url-prefix]))

(clojure.spec.alpha/def :portkey.aws.mediatailor/boolean clojure.core/boolean?)

(clojure.spec.alpha/def :portkey.aws.mediatailor/list-of-playback-configurations (clojure.spec.alpha/coll-of :portkey.aws.mediatailor/playback-configuration))

(clojure.spec.alpha/def :portkey.aws.mediatailor/double clojure.core/double?)

(clojure.spec.alpha/def :portkey.aws.mediatailor.delete-playback-configuration-request/name (clojure.spec.alpha/and :portkey.aws.mediatailor/string))
(clojure.spec.alpha/def :portkey.aws.mediatailor/delete-playback-configuration-request (clojure.spec.alpha/keys :req-un [:portkey.aws.mediatailor.delete-playback-configuration-request/name] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.mediatailor.get-playback-configuration-response/ad-decision-server-url (clojure.spec.alpha/and :portkey.aws.mediatailor/string))
(clojure.spec.alpha/def :portkey.aws.mediatailor.get-playback-configuration-response/name (clojure.spec.alpha/and :portkey.aws.mediatailor/string))
(clojure.spec.alpha/def :portkey.aws.mediatailor.get-playback-configuration-response/playback-endpoint-prefix (clojure.spec.alpha/and :portkey.aws.mediatailor/string))
(clojure.spec.alpha/def :portkey.aws.mediatailor.get-playback-configuration-response/session-initialization-endpoint-prefix (clojure.spec.alpha/and :portkey.aws.mediatailor/string))
(clojure.spec.alpha/def :portkey.aws.mediatailor.get-playback-configuration-response/slate-ad-url (clojure.spec.alpha/and :portkey.aws.mediatailor/string))
(clojure.spec.alpha/def :portkey.aws.mediatailor.get-playback-configuration-response/video-content-source-url (clojure.spec.alpha/and :portkey.aws.mediatailor/string))
(clojure.spec.alpha/def :portkey.aws.mediatailor/get-playback-configuration-response (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.mediatailor.get-playback-configuration-response/ad-decision-server-url :portkey.aws.mediatailor/cdn-configuration :portkey.aws.mediatailor/hls-configuration :portkey.aws.mediatailor.get-playback-configuration-response/name :portkey.aws.mediatailor.get-playback-configuration-response/playback-endpoint-prefix :portkey.aws.mediatailor.get-playback-configuration-response/session-initialization-endpoint-prefix :portkey.aws.mediatailor.get-playback-configuration-response/slate-ad-url :portkey.aws.mediatailor.get-playback-configuration-response/video-content-source-url]))

(clojure.spec.alpha/def :portkey.aws.mediatailor.list-playback-configurations-request/max-results (clojure.spec.alpha/and :portkey.aws.mediatailor/integer-min-1-max-100))
(clojure.spec.alpha/def :portkey.aws.mediatailor.list-playback-configurations-request/next-token (clojure.spec.alpha/and :portkey.aws.mediatailor/string))
(clojure.spec.alpha/def :portkey.aws.mediatailor/list-playback-configurations-request (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.mediatailor.list-playback-configurations-request/max-results :portkey.aws.mediatailor.list-playback-configurations-request/next-token]))

(clojure.spec.alpha/def :portkey.aws.mediatailor.put-playback-configuration-request/ad-decision-server-url (clojure.spec.alpha/and :portkey.aws.mediatailor/string))
(clojure.spec.alpha/def :portkey.aws.mediatailor.put-playback-configuration-request/name (clojure.spec.alpha/and :portkey.aws.mediatailor/string))
(clojure.spec.alpha/def :portkey.aws.mediatailor.put-playback-configuration-request/slate-ad-url (clojure.spec.alpha/and :portkey.aws.mediatailor/string))
(clojure.spec.alpha/def :portkey.aws.mediatailor.put-playback-configuration-request/video-content-source-url (clojure.spec.alpha/and :portkey.aws.mediatailor/string))
(clojure.spec.alpha/def :portkey.aws.mediatailor/put-playback-configuration-request (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.mediatailor.put-playback-configuration-request/ad-decision-server-url :portkey.aws.mediatailor/cdn-configuration :portkey.aws.mediatailor.put-playback-configuration-request/name :portkey.aws.mediatailor.put-playback-configuration-request/slate-ad-url :portkey.aws.mediatailor.put-playback-configuration-request/video-content-source-url]))

(clojure.spec.alpha/def :portkey.aws.mediatailor/integer clojure.core/int?)

(clojure.spec.alpha/def :portkey.aws.mediatailor.get-playback-configuration-request/name (clojure.spec.alpha/and :portkey.aws.mediatailor/string))
(clojure.spec.alpha/def :portkey.aws.mediatailor/get-playback-configuration-request (clojure.spec.alpha/keys :req-un [:portkey.aws.mediatailor.get-playback-configuration-request/name] :opt-un []))

(clojure.core/defn delete-playback-configuration ([delete-playback-configuration-requestinput] (clojure.core/let [request-function-result__28521__auto__ (req-delete-playback-configuration-request delete-playback-configuration-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__28521__auto__ {:http.request.configuration/endpoints portkey.aws.mediatailor/endpoints, :http.request.configuration/target-prefix nil, :http.request.spec/output-spec nil, :http.request.configuration/mime-type {"content-type" "application/json"}, :http.request.configuration/request-uri "/playbackConfiguration/{Name}", :http.request.configuration/version "2018-04-23", :http.request.configuration/service-id "MediaTailor", :http.request.spec/input-spec :portkey.aws.mediatailor/delete-playback-configuration-request, :http.request.configuration/protocol "rest-json", :http.request.configuration/method :delete, :http.request.configuration/response-code 204, :http.request.configuration/action "DeletePlaybackConfiguration", :http.request.spec/error-spec {}})))))
(clojure.spec.alpha/fdef delete-playback-configuration :args (clojure.spec.alpha/tuple :portkey.aws.mediatailor/delete-playback-configuration-request) :ret clojure.core/true?)

(clojure.core/defn get-playback-configuration ([get-playback-configuration-requestinput] (clojure.core/let [request-function-result__28521__auto__ (req-get-playback-configuration-request get-playback-configuration-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__28521__auto__ {:http.request.configuration/endpoints portkey.aws.mediatailor/endpoints, :http.request.configuration/target-prefix nil, :http.request.spec/output-spec :portkey.aws.mediatailor/get-playback-configuration-response, :http.request.configuration/mime-type {"content-type" "application/json"}, :http.request.configuration/request-uri "/playbackConfiguration/{Name}", :http.request.configuration/version "2018-04-23", :http.request.configuration/service-id "MediaTailor", :http.request.spec/input-spec :portkey.aws.mediatailor/get-playback-configuration-request, :http.request.configuration/protocol "rest-json", :http.request.configuration/method :get, :http.request.configuration/response-code 200, :http.request.configuration/action "GetPlaybackConfiguration", :http.request.spec/error-spec {}})))))
(clojure.spec.alpha/fdef get-playback-configuration :args (clojure.spec.alpha/tuple :portkey.aws.mediatailor/get-playback-configuration-request) :ret (clojure.spec.alpha/and :portkey.aws.mediatailor/get-playback-configuration-response))

(clojure.core/defn list-playback-configurations ([] (list-playback-configurations {})) ([list-playback-configurations-requestinput] (clojure.core/let [request-function-result__28521__auto__ (req-list-playback-configurations-request list-playback-configurations-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__28521__auto__ {:http.request.configuration/endpoints portkey.aws.mediatailor/endpoints, :http.request.configuration/target-prefix nil, :http.request.spec/output-spec :portkey.aws.mediatailor/list-playback-configurations-response, :http.request.configuration/mime-type {"content-type" "application/json"}, :http.request.configuration/request-uri "/playbackConfigurations", :http.request.configuration/version "2018-04-23", :http.request.configuration/service-id "MediaTailor", :http.request.spec/input-spec :portkey.aws.mediatailor/list-playback-configurations-request, :http.request.configuration/protocol "rest-json", :http.request.configuration/method :get, :http.request.configuration/response-code 200, :http.request.configuration/action "ListPlaybackConfigurations", :http.request.spec/error-spec {}})))))
(clojure.spec.alpha/fdef list-playback-configurations :args (clojure.spec.alpha/? :portkey.aws.mediatailor/list-playback-configurations-request) :ret (clojure.spec.alpha/and :portkey.aws.mediatailor/list-playback-configurations-response))

(clojure.core/defn put-playback-configuration ([] (put-playback-configuration {})) ([put-playback-configuration-requestinput] (clojure.core/let [request-function-result__28521__auto__ (req-put-playback-configuration-request put-playback-configuration-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__28521__auto__ {:http.request.configuration/endpoints portkey.aws.mediatailor/endpoints, :http.request.configuration/target-prefix nil, :http.request.spec/output-spec :portkey.aws.mediatailor/put-playback-configuration-response, :http.request.configuration/mime-type {"content-type" "application/json"}, :http.request.configuration/request-uri "/playbackConfiguration", :http.request.configuration/version "2018-04-23", :http.request.configuration/service-id "MediaTailor", :http.request.spec/input-spec :portkey.aws.mediatailor/put-playback-configuration-request, :http.request.configuration/protocol "rest-json", :http.request.configuration/method :put, :http.request.configuration/response-code 200, :http.request.configuration/action "PutPlaybackConfiguration", :http.request.spec/error-spec {}})))))
(clojure.spec.alpha/fdef put-playback-configuration :args (clojure.spec.alpha/? :portkey.aws.mediatailor/put-playback-configuration-request) :ret (clojure.spec.alpha/and :portkey.aws.mediatailor/put-playback-configuration-response))
