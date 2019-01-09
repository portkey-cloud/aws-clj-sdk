(ns portkey.aws.translate (:require [portkey.aws]))

(def
 endpoints
 '{"eu-west-1"
   {:credential-scope {:service "translate", :region "eu-west-1"},
    :ssl-common-name "translate.eu-west-1.amazonaws.com",
    :endpoint "https://translate.eu-west-1.amazonaws.com",
    :signature-version :v4},
   "us-east-2"
   {:credential-scope {:service "translate", :region "us-east-2"},
    :ssl-common-name "translate.us-east-2.amazonaws.com",
    :endpoint "https://translate.us-east-2.amazonaws.com",
    :signature-version :v4},
   "us-east-2-fips"
   {:credential-scope {:service "translate", :region "us-east-2"},
    :ssl-common-name "translate-fips.us-east-2.amazonaws.com",
    :endpoint "https://translate-fips.us-east-2.amazonaws.com",
    :signature-version :v4},
   "us-east-1-fips"
   {:credential-scope {:service "translate", :region "us-east-1"},
    :ssl-common-name "translate-fips.us-east-1.amazonaws.com",
    :endpoint "https://translate-fips.us-east-1.amazonaws.com",
    :signature-version :v4},
   "us-west-2"
   {:credential-scope {:service "translate", :region "us-west-2"},
    :ssl-common-name "translate.us-west-2.amazonaws.com",
    :endpoint "https://translate.us-west-2.amazonaws.com",
    :signature-version :v4},
   "us-west-2-fips"
   {:credential-scope {:service "translate", :region "us-west-2"},
    :ssl-common-name "translate-fips.us-west-2.amazonaws.com",
    :endpoint "https://translate-fips.us-west-2.amazonaws.com",
    :signature-version :v4},
   "us-east-1"
   {:credential-scope {:service "translate", :region "us-east-1"},
    :ssl-common-name "translate.us-east-1.amazonaws.com",
    :endpoint "https://translate.us-east-1.amazonaws.com",
    :signature-version :v4},
   "us-gov-west-1-fips"
   {:credential-scope {:service "translate", :region "us-gov-west-1"},
    :ssl-common-name "translate-fips.us-gov-west-1.amazonaws.com",
    :endpoint "https://translate-fips.us-gov-west-1.amazonaws.com",
    :signature-version :v4},
   "us-gov-west-1"
   {:credential-scope {:service "translate", :region "us-gov-west-1"},
    :ssl-common-name "translate.us-gov-west-1.amazonaws.com",
    :endpoint "https://translate.us-gov-west-1.amazonaws.com",
    :signature-version :v4}})

(clojure.core/declare ser-language-code-string)

(clojure.core/declare ser-bounded-length-string)

(clojure.core/defn- ser-language-code-string [input] #:http.request.field{:value input, :shape "LanguageCodeString"})

(clojure.core/defn- ser-bounded-length-string [input] #:http.request.field{:value input, :shape "BoundedLengthString"})

(clojure.core/defn- req-translate-text-request [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (ser-bounded-length-string (input :text)) #:http.request.field{:name "Text", :shape "BoundedLengthString"}) (clojure.core/into (ser-language-code-string (input :source-language-code)) #:http.request.field{:name "SourceLanguageCode", :shape "LanguageCodeString"}) (clojure.core/into (ser-language-code-string (input :target-language-code)) #:http.request.field{:name "TargetLanguageCode", :shape "LanguageCodeString"})]}))

(clojure.spec.alpha/def :portkey.aws.translate.detected-language-low-confidence-exception/message (clojure.spec.alpha/and :portkey.aws.translate/string))
(clojure.spec.alpha/def :portkey.aws.translate.detected-language-low-confidence-exception/detected-language-code (clojure.spec.alpha/and :portkey.aws.translate/language-code-string))
(clojure.spec.alpha/def :portkey.aws.translate/detected-language-low-confidence-exception (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.translate.detected-language-low-confidence-exception/message :portkey.aws.translate.detected-language-low-confidence-exception/detected-language-code]))

(clojure.spec.alpha/def :portkey.aws.translate.invalid-request-exception/message (clojure.spec.alpha/and :portkey.aws.translate/string))
(clojure.spec.alpha/def :portkey.aws.translate/invalid-request-exception (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.translate.invalid-request-exception/message]))

(clojure.spec.alpha/def :portkey.aws.translate/language-code-string (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__27880__auto__] (clojure.core/<= 2 (clojure.core/count s__27880__auto__))) (clojure.core/fn [s__27881__auto__] (clojure.core/< (clojure.core/count s__27881__auto__) 5))))

(clojure.spec.alpha/def :portkey.aws.translate.translate-text-request/text (clojure.spec.alpha/and :portkey.aws.translate/bounded-length-string))
(clojure.spec.alpha/def :portkey.aws.translate.translate-text-request/source-language-code (clojure.spec.alpha/and :portkey.aws.translate/language-code-string))
(clojure.spec.alpha/def :portkey.aws.translate.translate-text-request/target-language-code (clojure.spec.alpha/and :portkey.aws.translate/language-code-string))
(clojure.spec.alpha/def :portkey.aws.translate/translate-text-request (clojure.spec.alpha/keys :req-un [:portkey.aws.translate.translate-text-request/text :portkey.aws.translate.translate-text-request/source-language-code :portkey.aws.translate.translate-text-request/target-language-code] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.translate.text-size-limit-exceeded-exception/message (clojure.spec.alpha/and :portkey.aws.translate/string))
(clojure.spec.alpha/def :portkey.aws.translate/text-size-limit-exceeded-exception (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.translate.text-size-limit-exceeded-exception/message]))

(clojure.spec.alpha/def :portkey.aws.translate.service-unavailable-exception/message (clojure.spec.alpha/and :portkey.aws.translate/string))
(clojure.spec.alpha/def :portkey.aws.translate/service-unavailable-exception (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.translate.service-unavailable-exception/message]))

(clojure.spec.alpha/def :portkey.aws.translate.too-many-requests-exception/message (clojure.spec.alpha/and :portkey.aws.translate/string))
(clojure.spec.alpha/def :portkey.aws.translate/too-many-requests-exception (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.translate.too-many-requests-exception/message]))

(clojure.spec.alpha/def :portkey.aws.translate.internal-server-exception/message (clojure.spec.alpha/and :portkey.aws.translate/string))
(clojure.spec.alpha/def :portkey.aws.translate/internal-server-exception (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.translate.internal-server-exception/message]))

(clojure.spec.alpha/def :portkey.aws.translate/string (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__27880__auto__] (clojure.core/<= 1 (clojure.core/count s__27880__auto__)))))

(clojure.spec.alpha/def :portkey.aws.translate.translate-text-response/translated-text (clojure.spec.alpha/and :portkey.aws.translate/string))
(clojure.spec.alpha/def :portkey.aws.translate.translate-text-response/source-language-code (clojure.spec.alpha/and :portkey.aws.translate/language-code-string))
(clojure.spec.alpha/def :portkey.aws.translate.translate-text-response/target-language-code (clojure.spec.alpha/and :portkey.aws.translate/language-code-string))
(clojure.spec.alpha/def :portkey.aws.translate/translate-text-response (clojure.spec.alpha/keys :req-un [:portkey.aws.translate.translate-text-response/translated-text :portkey.aws.translate.translate-text-response/source-language-code :portkey.aws.translate.translate-text-response/target-language-code] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.translate.unsupported-language-pair-exception/message (clojure.spec.alpha/and :portkey.aws.translate/string))
(clojure.spec.alpha/def :portkey.aws.translate/unsupported-language-pair-exception (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.translate.unsupported-language-pair-exception/message]))

(clojure.spec.alpha/def :portkey.aws.translate/bounded-length-string (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__27880__auto__] (clojure.core/<= 1 (clojure.core/count s__27880__auto__))) (clojure.core/fn [s__27881__auto__] (clojure.core/< (clojure.core/count s__27881__auto__) 5000))))

(clojure.core/defn translate-text ([translate-text-requestinput] (clojure.core/let [request-function-result__28521__auto__ (req-translate-text-request translate-text-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__28521__auto__ {:http.request.configuration/endpoints portkey.aws.translate/endpoints, :http.request.configuration/target-prefix "AWSShineFrontendService_20170701", :http.request.spec/output-spec :portkey.aws.translate/translate-text-response, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2017-07-01", :http.request.configuration/service-id "Translate", :http.request.spec/input-spec :portkey.aws.translate/translate-text-request, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/action "TranslateText", :http.request.spec/error-spec {"InvalidRequestException" :portkey.aws.translate/invalid-request-exception, "TextSizeLimitExceededException" :portkey.aws.translate/text-size-limit-exceeded-exception, "TooManyRequestsException" :portkey.aws.translate/too-many-requests-exception, "UnsupportedLanguagePairException" :portkey.aws.translate/unsupported-language-pair-exception, "DetectedLanguageLowConfidenceException" :portkey.aws.translate/detected-language-low-confidence-exception, "InternalServerException" :portkey.aws.translate/internal-server-exception, "ServiceUnavailableException" :portkey.aws.translate/service-unavailable-exception}})))))
(clojure.spec.alpha/fdef translate-text :args (clojure.spec.alpha/tuple :portkey.aws.translate/translate-text-request) :ret (clojure.spec.alpha/and :portkey.aws.translate/translate-text-response))
