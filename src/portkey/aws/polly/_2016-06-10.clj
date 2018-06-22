(ns portkey.aws.polly.-2016-06-10 (:require [portkey.aws]))

(def
 endpoints
 '{"ap-northeast-1"
   {:credential-scope {:service "polly", :region "ap-northeast-1"},
    :ssl-common-name "polly.ap-northeast-1.amazonaws.com",
    :endpoint "https://polly.ap-northeast-1.amazonaws.com",
    :signature-version :v4},
   "eu-west-1"
   {:credential-scope {:service "polly", :region "eu-west-1"},
    :ssl-common-name "polly.eu-west-1.amazonaws.com",
    :endpoint "https://polly.eu-west-1.amazonaws.com",
    :signature-version :v4},
   "us-east-2"
   {:credential-scope {:service "polly", :region "us-east-2"},
    :ssl-common-name "polly.us-east-2.amazonaws.com",
    :endpoint "https://polly.us-east-2.amazonaws.com",
    :signature-version :v4},
   "ap-southeast-2"
   {:credential-scope {:service "polly", :region "ap-southeast-2"},
    :ssl-common-name "polly.ap-southeast-2.amazonaws.com",
    :endpoint "https://polly.ap-southeast-2.amazonaws.com",
    :signature-version :v4},
   "sa-east-1"
   {:credential-scope {:service "polly", :region "sa-east-1"},
    :ssl-common-name "polly.sa-east-1.amazonaws.com",
    :endpoint "https://polly.sa-east-1.amazonaws.com",
    :signature-version :v4},
   "ap-southeast-1"
   {:credential-scope {:service "polly", :region "ap-southeast-1"},
    :ssl-common-name "polly.ap-southeast-1.amazonaws.com",
    :endpoint "https://polly.ap-southeast-1.amazonaws.com",
    :signature-version :v4},
   "ap-northeast-2"
   {:credential-scope {:service "polly", :region "ap-northeast-2"},
    :ssl-common-name "polly.ap-northeast-2.amazonaws.com",
    :endpoint "https://polly.ap-northeast-2.amazonaws.com",
    :signature-version :v4},
   "eu-west-3"
   {:credential-scope {:service "polly", :region "eu-west-3"},
    :ssl-common-name "polly.eu-west-3.amazonaws.com",
    :endpoint "https://polly.eu-west-3.amazonaws.com",
    :signature-version :v4},
   "ca-central-1"
   {:credential-scope {:service "polly", :region "ca-central-1"},
    :ssl-common-name "polly.ca-central-1.amazonaws.com",
    :endpoint "https://polly.ca-central-1.amazonaws.com",
    :signature-version :v4},
   "eu-central-1"
   {:credential-scope {:service "polly", :region "eu-central-1"},
    :ssl-common-name "polly.eu-central-1.amazonaws.com",
    :endpoint "https://polly.eu-central-1.amazonaws.com",
    :signature-version :v4},
   "eu-west-2"
   {:credential-scope {:service "polly", :region "eu-west-2"},
    :ssl-common-name "polly.eu-west-2.amazonaws.com",
    :endpoint "https://polly.eu-west-2.amazonaws.com",
    :signature-version :v4},
   "us-gov-west-1"
   {:credential-scope {:service "polly", :region "us-gov-west-1"},
    :ssl-common-name "polly.us-gov-west-1.amazonaws.com",
    :endpoint "https://polly.us-gov-west-1.amazonaws.com",
    :signature-version :v4},
   "us-west-2"
   {:credential-scope {:service "polly", :region "us-west-2"},
    :ssl-common-name "polly.us-west-2.amazonaws.com",
    :endpoint "https://polly.us-west-2.amazonaws.com",
    :signature-version :v4},
   "us-east-1"
   {:credential-scope {:service "polly", :region "us-east-1"},
    :ssl-common-name "polly.us-east-1.amazonaws.com",
    :endpoint "https://polly.us-east-1.amazonaws.com",
    :signature-version :v4},
   "us-west-1"
   {:credential-scope {:service "polly", :region "us-west-1"},
    :ssl-common-name "polly.us-west-1.amazonaws.com",
    :endpoint "https://polly.us-west-1.amazonaws.com",
    :signature-version :v4},
   "ap-south-1"
   {:credential-scope {:service "polly", :region "ap-south-1"},
    :ssl-common-name "polly.ap-south-1.amazonaws.com",
    :endpoint "https://polly.ap-south-1.amazonaws.com",
    :signature-version :v4}})

(clojure.spec.alpha/def :portkey.aws.polly.-2016-06-10.list-lexicons-output/lexicons (clojure.spec.alpha/and :portkey.aws.polly.-2016-06-10/lexicon-description-list))
(clojure.spec.alpha/def :portkey.aws.polly.-2016-06-10/list-lexicons-output (portkey.aws/json-keys :req-un [] :opt-un [:portkey.aws.polly.-2016-06-10.list-lexicons-output/Lexicons :portkey.aws.polly.-2016-06-10/NextToken] :locations {}))

(clojure.spec.alpha/def :portkey.aws.polly.-2016-06-10.max-lexeme-length-exceeded-exception/message (clojure.spec.alpha/and :portkey.aws.polly.-2016-06-10/error-message))
(clojure.spec.alpha/def :portkey.aws.polly.-2016-06-10/max-lexeme-length-exceeded-exception (portkey.aws/json-keys :req-un [] :opt-un [:portkey.aws.polly.-2016-06-10.max-lexeme-length-exceeded-exception/message] :locations {}))

(clojure.spec.alpha/def :portkey.aws.polly.-2016-06-10/lexicon-arn (clojure.spec.alpha/and clojure.core/string?))

(clojure.spec.alpha/def :portkey.aws.polly.-2016-06-10.invalid-ssml-exception/message (clojure.spec.alpha/and :portkey.aws.polly.-2016-06-10/error-message))
(clojure.spec.alpha/def :portkey.aws.polly.-2016-06-10/invalid-ssml-exception (portkey.aws/json-keys :req-un [] :opt-un [:portkey.aws.polly.-2016-06-10.invalid-ssml-exception/message] :locations {}))

(clojure.spec.alpha/def :portkey.aws.polly.-2016-06-10.unsupported-pls-alphabet-exception/message (clojure.spec.alpha/and :portkey.aws.polly.-2016-06-10/error-message))
(clojure.spec.alpha/def :portkey.aws.polly.-2016-06-10/unsupported-pls-alphabet-exception (portkey.aws/json-keys :req-un [] :opt-un [:portkey.aws.polly.-2016-06-10.unsupported-pls-alphabet-exception/message] :locations {}))

(clojure.spec.alpha/def :portkey.aws.polly.-2016-06-10/get-lexicon-output (portkey.aws/json-keys :req-un [] :opt-un [:portkey.aws.polly.-2016-06-10/Lexicon :portkey.aws.polly.-2016-06-10/LexiconAttributes] :locations {}))

(clojure.spec.alpha/def :portkey.aws.polly.-2016-06-10.delete-lexicon-input/name (clojure.spec.alpha/and :portkey.aws.polly.-2016-06-10/lexicon-name))
(clojure.spec.alpha/def :portkey.aws.polly.-2016-06-10/delete-lexicon-input (portkey.aws/json-keys :req-un [:portkey.aws.polly.-2016-06-10.delete-lexicon-input/Name] :opt-un [] :locations {}))

(clojure.spec.alpha/def :portkey.aws.polly.-2016-06-10.describe-voices-output/voices (clojure.spec.alpha/and :portkey.aws.polly.-2016-06-10/voice-list))
(clojure.spec.alpha/def :portkey.aws.polly.-2016-06-10/describe-voices-output (portkey.aws/json-keys :req-un [] :opt-un [:portkey.aws.polly.-2016-06-10.describe-voices-output/Voices :portkey.aws.polly.-2016-06-10/NextToken] :locations {}))

(clojure.spec.alpha/def :portkey.aws.polly.-2016-06-10.ssml-marks-not-supported-for-text-type-exception/message (clojure.spec.alpha/and :portkey.aws.polly.-2016-06-10/error-message))
(clojure.spec.alpha/def :portkey.aws.polly.-2016-06-10/ssml-marks-not-supported-for-text-type-exception (portkey.aws/json-keys :req-un [] :opt-un [:portkey.aws.polly.-2016-06-10.ssml-marks-not-supported-for-text-type-exception/message] :locations {}))

(clojure.spec.alpha/def :portkey.aws.polly.-2016-06-10.max-lexicons-number-exceeded-exception/message (clojure.spec.alpha/and :portkey.aws.polly.-2016-06-10/error-message))
(clojure.spec.alpha/def :portkey.aws.polly.-2016-06-10/max-lexicons-number-exceeded-exception (portkey.aws/json-keys :req-un [] :opt-un [:portkey.aws.polly.-2016-06-10.max-lexicons-number-exceeded-exception/message] :locations {}))

(clojure.spec.alpha/def :portkey.aws.polly.-2016-06-10/sample-rate (clojure.spec.alpha/and clojure.core/string?))

(clojure.spec.alpha/def :portkey.aws.polly.-2016-06-10/request-characters (clojure.spec.alpha/and clojure.core/int?))

(clojure.spec.alpha/def :portkey.aws.polly.-2016-06-10/lexicon-name-list (clojure.spec.alpha/and (clojure.spec.alpha/coll-of :portkey.aws.polly.-2016-06-10/lexicon-name :max-count 5) (clojure.spec.alpha/conformer clojure.core/identity (fn* [p1__13687__13688__auto__] (if (clojure.core/sequential? p1__13687__13688__auto__) p1__13687__13688__auto__ [p1__13687__13688__auto__])))))

(clojure.spec.alpha/def :portkey.aws.polly.-2016-06-10/synthesize-speech-output (portkey.aws/json-keys :req-un [] :opt-un [:portkey.aws.polly.-2016-06-10/AudioStream :portkey.aws.polly.-2016-06-10/ContentType :portkey.aws.polly.-2016-06-10/RequestCharacters] :locations {}))

(clojure.spec.alpha/def :portkey.aws.polly.-2016-06-10.service-failure-exception/message (clojure.spec.alpha/and :portkey.aws.polly.-2016-06-10/error-message))
(clojure.spec.alpha/def :portkey.aws.polly.-2016-06-10/service-failure-exception (portkey.aws/json-keys :req-un [] :opt-un [:portkey.aws.polly.-2016-06-10.service-failure-exception/message] :locations {}))

(clojure.spec.alpha/def :portkey.aws.polly.-2016-06-10.put-lexicon-input/name (clojure.spec.alpha/and :portkey.aws.polly.-2016-06-10/lexicon-name))
(clojure.spec.alpha/def :portkey.aws.polly.-2016-06-10.put-lexicon-input/content (clojure.spec.alpha/and :portkey.aws.polly.-2016-06-10/lexicon-content))
(clojure.spec.alpha/def :portkey.aws.polly.-2016-06-10/put-lexicon-input (portkey.aws/json-keys :req-un [:portkey.aws.polly.-2016-06-10.put-lexicon-input/Name :portkey.aws.polly.-2016-06-10.put-lexicon-input/Content] :opt-un [] :locations {}))

(clojure.spec.alpha/def :portkey.aws.polly.-2016-06-10/text-type (clojure.spec.alpha/conformer (clojure.core/let [m__13766__auto__ {"ssml" "ssml", :ssml "ssml", "text" "text", :text "text"}] (clojure.core/fn [s__13767__auto__] (m__13766__auto__ s__13767__auto__ :clojure.spec.alpha/invalid))) (clojure.core/comp clojure.core/keyword portkey.aws/dashed)))

(clojure.spec.alpha/def :portkey.aws.polly.-2016-06-10.lexicon/content (clojure.spec.alpha/and :portkey.aws.polly.-2016-06-10/lexicon-content))
(clojure.spec.alpha/def :portkey.aws.polly.-2016-06-10.lexicon/name (clojure.spec.alpha/and :portkey.aws.polly.-2016-06-10/lexicon-name))
(clojure.spec.alpha/def :portkey.aws.polly.-2016-06-10/lexicon (portkey.aws/json-keys :req-un [] :opt-un [:portkey.aws.polly.-2016-06-10.lexicon/Content :portkey.aws.polly.-2016-06-10.lexicon/Name] :locations {}))

(clojure.spec.alpha/def :portkey.aws.polly.-2016-06-10/lexemes-count (clojure.spec.alpha/and clojure.core/int?))

(clojure.spec.alpha/def :portkey.aws.polly.-2016-06-10.text-length-exceeded-exception/message (clojure.spec.alpha/and :portkey.aws.polly.-2016-06-10/error-message))
(clojure.spec.alpha/def :portkey.aws.polly.-2016-06-10/text-length-exceeded-exception (portkey.aws/json-keys :req-un [] :opt-un [:portkey.aws.polly.-2016-06-10.text-length-exceeded-exception/message] :locations {}))

(clojure.spec.alpha/def :portkey.aws.polly.-2016-06-10/gender (clojure.spec.alpha/conformer (clojure.core/let [m__13766__auto__ {"Female" "Female", :female "Female", "Male" "Male", :male "Male"}] (clojure.core/fn [s__13767__auto__] (m__13766__auto__ s__13767__auto__ :clojure.spec.alpha/invalid))) (clojure.core/comp clojure.core/keyword portkey.aws/dashed)))

(clojure.spec.alpha/def :portkey.aws.polly.-2016-06-10/lexicon-name (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__13770__auto__] (clojure.core/re-matches #"[0-9A-Za-z]{1,20}" s__13770__auto__))))

(clojure.spec.alpha/def :portkey.aws.polly.-2016-06-10.invalid-sample-rate-exception/message (clojure.spec.alpha/and :portkey.aws.polly.-2016-06-10/error-message))
(clojure.spec.alpha/def :portkey.aws.polly.-2016-06-10/invalid-sample-rate-exception (portkey.aws/json-keys :req-un [] :opt-un [:portkey.aws.polly.-2016-06-10.invalid-sample-rate-exception/message] :locations {}))

(clojure.spec.alpha/def :portkey.aws.polly.-2016-06-10/next-token (clojure.spec.alpha/and clojure.core/string?))

(clojure.spec.alpha/def :portkey.aws.polly.-2016-06-10/voice-name (clojure.spec.alpha/and clojure.core/string?))

(clojure.spec.alpha/def :portkey.aws.polly.-2016-06-10/error-message (clojure.spec.alpha/and clojure.core/string?))

(clojure.spec.alpha/def :portkey.aws.polly.-2016-06-10/voice-list (clojure.spec.alpha/and (clojure.spec.alpha/coll-of :portkey.aws.polly.-2016-06-10/voice) (clojure.spec.alpha/conformer clojure.core/identity (fn* [p1__13687__13688__auto__] (if (clojure.core/sequential? p1__13687__13688__auto__) p1__13687__13688__auto__ [p1__13687__13688__auto__])))))

(clojure.spec.alpha/def :portkey.aws.polly.-2016-06-10.invalid-next-token-exception/message (clojure.spec.alpha/and :portkey.aws.polly.-2016-06-10/error-message))
(clojure.spec.alpha/def :portkey.aws.polly.-2016-06-10/invalid-next-token-exception (portkey.aws/json-keys :req-un [] :opt-un [:portkey.aws.polly.-2016-06-10.invalid-next-token-exception/message] :locations {}))

(clojure.spec.alpha/def :portkey.aws.polly.-2016-06-10/list-lexicons-input (portkey.aws/json-keys :req-un [] :opt-un [:portkey.aws.polly.-2016-06-10/NextToken] :locations {}))

(clojure.spec.alpha/def :portkey.aws.polly.-2016-06-10/language-name (clojure.spec.alpha/and clojure.core/string?))

(clojure.spec.alpha/def :portkey.aws.polly.-2016-06-10.unsupported-pls-language-exception/message (clojure.spec.alpha/and :portkey.aws.polly.-2016-06-10/error-message))
(clojure.spec.alpha/def :portkey.aws.polly.-2016-06-10/unsupported-pls-language-exception (portkey.aws/json-keys :req-un [] :opt-un [:portkey.aws.polly.-2016-06-10.unsupported-pls-language-exception/message] :locations {}))

(clojure.spec.alpha/def :portkey.aws.polly.-2016-06-10/content-type (clojure.spec.alpha/and clojure.core/string?))

(clojure.spec.alpha/def :portkey.aws.polly.-2016-06-10.get-lexicon-input/name (clojure.spec.alpha/and :portkey.aws.polly.-2016-06-10/lexicon-name))
(clojure.spec.alpha/def :portkey.aws.polly.-2016-06-10/get-lexicon-input (portkey.aws/json-keys :req-un [:portkey.aws.polly.-2016-06-10.get-lexicon-input/Name] :opt-un [] :locations {}))

(clojure.spec.alpha/def :portkey.aws.polly.-2016-06-10/put-lexicon-output (portkey.aws/json-keys :req-un [] :opt-un [] :locations {}))

(clojure.spec.alpha/def :portkey.aws.polly.-2016-06-10/output-format (clojure.spec.alpha/conformer (clojure.core/let [m__13766__auto__ {"json" "json", :json "json", "mp3" "mp3", :mp3 "mp3", "ogg_vorbis" "ogg_vorbis", :ogg-vorbis "ogg_vorbis", "pcm" "pcm", :pcm "pcm"}] (clojure.core/fn [s__13767__auto__] (m__13766__auto__ s__13767__auto__ :clojure.spec.alpha/invalid))) (clojure.core/comp clojure.core/keyword portkey.aws/dashed)))

(clojure.spec.alpha/def :portkey.aws.polly.-2016-06-10/delete-lexicon-output (portkey.aws/json-keys :req-un [] :opt-un [] :locations {}))

(clojure.spec.alpha/def :portkey.aws.polly.-2016-06-10/language-code (clojure.spec.alpha/conformer (clojure.core/let [m__13766__auto__ {"it-IT" "it-IT", :ja-jp "ja-JP", :pt-pt "pt-PT", "de-DE" "de-DE", :en-au "en-AU", :ko-kr "ko-KR", :es-es "es-ES", :en-gb "en-GB", :nl-nl "nl-NL", :ro-ro "ro-RO", "en-AU" "en-AU", "en-IN" "en-IN", :fr-fr "fr-FR", "da-DK" "da-DK", "tr-TR" "tr-TR", :it-it "it-IT", "es-US" "es-US", :da-dk "da-DK", :de-de "de-DE", "pt-BR" "pt-BR", :ru-ru "ru-RU", :tr-tr "tr-TR", :pt-br "pt-BR", "nl-NL" "nl-NL", :pl-pl "pl-PL", "fr-CA" "fr-CA", "ja-JP" "ja-JP", :cy-gb "cy-GB", "en-US" "en-US", :nb-no "nb-NO", "cy-GB" "cy-GB", "fr-FR" "fr-FR", "en-GB" "en-GB", "ru-RU" "ru-RU", "ro-RO" "ro-RO", :fr-ca "fr-CA", :sv-se "sv-SE", "ko-KR" "ko-KR", "es-ES" "es-ES", "en-GB-WLS" "en-GB-WLS", "pt-PT" "pt-PT", :en-in "en-IN", :en-us "en-US", "pl-PL" "pl-PL", "is-IS" "is-IS", "sv-SE" "sv-SE", "nb-NO" "nb-NO", :en-gb-wls "en-GB-WLS", :is-is "is-IS", :es-us "es-US"}] (clojure.core/fn [s__13767__auto__] (m__13766__auto__ s__13767__auto__ :clojure.spec.alpha/invalid))) (clojure.core/comp clojure.core/keyword portkey.aws/dashed)))

(clojure.spec.alpha/def :portkey.aws.polly.-2016-06-10/lexicon-attributes (portkey.aws/json-keys :req-un [] :opt-un [:portkey.aws.polly.-2016-06-10/Alphabet :portkey.aws.polly.-2016-06-10/LanguageCode :portkey.aws.polly.-2016-06-10/LastModified :portkey.aws.polly.-2016-06-10/LexiconArn :portkey.aws.polly.-2016-06-10/LexemesCount :portkey.aws.polly.-2016-06-10/Size] :locations {}))

(clojure.spec.alpha/def :portkey.aws.polly.-2016-06-10/last-modified clojure.core/inst?)

(clojure.spec.alpha/def :portkey.aws.polly.-2016-06-10/speech-mark-type-list (clojure.spec.alpha/and (clojure.spec.alpha/coll-of :portkey.aws.polly.-2016-06-10/speech-mark-type :max-count 4) (clojure.spec.alpha/conformer clojure.core/identity (fn* [p1__13687__13688__auto__] (if (clojure.core/sequential? p1__13687__13688__auto__) p1__13687__13688__auto__ [p1__13687__13688__auto__])))))

(clojure.spec.alpha/def :portkey.aws.polly.-2016-06-10.lexicon-description/name (clojure.spec.alpha/and :portkey.aws.polly.-2016-06-10/lexicon-name))
(clojure.spec.alpha/def :portkey.aws.polly.-2016-06-10.lexicon-description/attributes (clojure.spec.alpha/and :portkey.aws.polly.-2016-06-10/lexicon-attributes))
(clojure.spec.alpha/def :portkey.aws.polly.-2016-06-10/lexicon-description (portkey.aws/json-keys :req-un [] :opt-un [:portkey.aws.polly.-2016-06-10.lexicon-description/Name :portkey.aws.polly.-2016-06-10.lexicon-description/Attributes] :locations {}))

(clojure.spec.alpha/def :portkey.aws.polly.-2016-06-10/size (clojure.spec.alpha/and clojure.core/int?))

(clojure.spec.alpha/def :portkey.aws.polly.-2016-06-10/lexicon-content (clojure.spec.alpha/and clojure.core/string?))

(clojure.spec.alpha/def :portkey.aws.polly.-2016-06-10.lexicon-not-found-exception/message (clojure.spec.alpha/and :portkey.aws.polly.-2016-06-10/error-message))
(clojure.spec.alpha/def :portkey.aws.polly.-2016-06-10/lexicon-not-found-exception (portkey.aws/json-keys :req-un [] :opt-un [:portkey.aws.polly.-2016-06-10.lexicon-not-found-exception/message] :locations {}))

(clojure.spec.alpha/def :portkey.aws.polly.-2016-06-10.invalid-lexicon-exception/message (clojure.spec.alpha/and :portkey.aws.polly.-2016-06-10/error-message))
(clojure.spec.alpha/def :portkey.aws.polly.-2016-06-10/invalid-lexicon-exception (portkey.aws/json-keys :req-un [] :opt-un [:portkey.aws.polly.-2016-06-10.invalid-lexicon-exception/message] :locations {}))

(clojure.spec.alpha/def :portkey.aws.polly.-2016-06-10/voice-id (clojure.spec.alpha/conformer (clojure.core/let [m__13766__auto__ {"Filiz" "Filiz", :joey "Joey", "Joanna" "Joanna", "Amy" "Amy", "Marlene" "Marlene", :astrid "Astrid", "Salli" "Salli", :maja "Maja", :matthew "Matthew", "Ricardo" "Ricardo", :tatyana "Tatyana", "Mathieu" "Mathieu", "Enrique" "Enrique", :lotte "Lotte", :ewa "Ewa", "Nicole" "Nicole", "Russell" "Russell", :giorgio "Giorgio", "Gwyneth" "Gwyneth", :seoyeon "Seoyeon", "Aditi" "Aditi", "Conchita" "Conchita", :jan "Jan", :dora "Dora", :justin "Justin", "Joey" "Joey", "Chantal" "Chantal", :russell "Russell", :amy "Amy", "Ines" "Ines", "Hans" "Hans", "Penelope" "Penelope", :conchita "Conchita", "Mizuki" "Mizuki", "Takumi" "Takumi", "Maja" "Maja", "Miguel" "Miguel", "Kendra" "Kendra", "Karl" "Karl", "Mads" "Mads", :gwyneth "Gwyneth", :emma "Emma", "Carla" "Carla", "Geraint" "Geraint", "Astrid" "Astrid", "Celine" "Celine", :maxim "Maxim", "Seoyeon" "Seoyeon", "Vicki" "Vicki", :aditi "Aditi", "Matthew" "Matthew", "Jan" "Jan", :mads "Mads", :liv "Liv", "Lotte" "Lotte", :celine "Celine", :jacek "Jacek", :vitoria "Vitoria", :miguel "Miguel", "Kimberly" "Kimberly", :filiz "Filiz", "Liv" "Liv", "Brian" "Brian", "Cristiano" "Cristiano", "Ewa" "Ewa", "Maxim" "Maxim", :mathieu "Mathieu", "Vitoria" "Vitoria", :karl "Karl", :salli "Salli", :hans "Hans", "Giorgio" "Giorgio", "Justin" "Justin", :mizuki "Mizuki", "Emma" "Emma", :joanna "Joanna", "Raveena" "Raveena", :ricardo "Ricardo", :vicki "Vicki", "Carmen" "Carmen", "Jacek" "Jacek", :raveena "Raveena", "Naja" "Naja", :takumi "Takumi", :penelope "Penelope", :carmen "Carmen", "Ivy" "Ivy", :naja "Naja", :ivy "Ivy", "Tatyana" "Tatyana", :carla "Carla", :chantal "Chantal", "Ruben" "Ruben", :kendra "Kendra", :kimberly "Kimberly", :geraint "Geraint", :nicole "Nicole", :brian "Brian", :marlene "Marlene", :enrique "Enrique", "Dora" "Dora", :ines "Ines", :ruben "Ruben", :cristiano "Cristiano"}] (clojure.core/fn [s__13767__auto__] (m__13766__auto__ s__13767__auto__ :clojure.spec.alpha/invalid))) (clojure.core/comp clojure.core/keyword portkey.aws/dashed)))

(clojure.spec.alpha/def :portkey.aws.polly.-2016-06-10.synthesize-speech-input/lexicon-names (clojure.spec.alpha/and :portkey.aws.polly.-2016-06-10/lexicon-name-list))
(clojure.spec.alpha/def :portkey.aws.polly.-2016-06-10.synthesize-speech-input/speech-mark-types (clojure.spec.alpha/and :portkey.aws.polly.-2016-06-10/speech-mark-type-list))
(clojure.spec.alpha/def :portkey.aws.polly.-2016-06-10/synthesize-speech-input (portkey.aws/json-keys :req-un [:portkey.aws.polly.-2016-06-10/OutputFormat :portkey.aws.polly.-2016-06-10/Text :portkey.aws.polly.-2016-06-10/VoiceId] :opt-un [:portkey.aws.polly.-2016-06-10.synthesize-speech-input/LexiconNames :portkey.aws.polly.-2016-06-10/SampleRate :portkey.aws.polly.-2016-06-10.synthesize-speech-input/SpeechMarkTypes :portkey.aws.polly.-2016-06-10/TextType] :locations {}))

(clojure.spec.alpha/def :portkey.aws.polly.-2016-06-10/text (clojure.spec.alpha/and clojure.core/string?))

(clojure.spec.alpha/def :portkey.aws.polly.-2016-06-10/audio-stream (clojure.spec.alpha/and clojure.core/bytes? (clojure.spec.alpha/conformer portkey.aws/base64-encode portkey.aws/base64-decode)))

(clojure.spec.alpha/def :portkey.aws.polly.-2016-06-10/describe-voices-input (portkey.aws/json-keys :req-un [] :opt-un [:portkey.aws.polly.-2016-06-10/LanguageCode :portkey.aws.polly.-2016-06-10/NextToken] :locations {}))

(clojure.spec.alpha/def :portkey.aws.polly.-2016-06-10.lexicon-size-exceeded-exception/message (clojure.spec.alpha/and :portkey.aws.polly.-2016-06-10/error-message))
(clojure.spec.alpha/def :portkey.aws.polly.-2016-06-10/lexicon-size-exceeded-exception (portkey.aws/json-keys :req-un [] :opt-un [:portkey.aws.polly.-2016-06-10.lexicon-size-exceeded-exception/message] :locations {}))

(clojure.spec.alpha/def :portkey.aws.polly.-2016-06-10/alphabet (clojure.spec.alpha/and clojure.core/string?))

(clojure.spec.alpha/def :portkey.aws.polly.-2016-06-10.voice/id (clojure.spec.alpha/and :portkey.aws.polly.-2016-06-10/voice-id))
(clojure.spec.alpha/def :portkey.aws.polly.-2016-06-10.voice/name (clojure.spec.alpha/and :portkey.aws.polly.-2016-06-10/voice-name))
(clojure.spec.alpha/def :portkey.aws.polly.-2016-06-10/voice (portkey.aws/json-keys :req-un [] :opt-un [:portkey.aws.polly.-2016-06-10/Gender :portkey.aws.polly.-2016-06-10.voice/Id :portkey.aws.polly.-2016-06-10/LanguageCode :portkey.aws.polly.-2016-06-10/LanguageName :portkey.aws.polly.-2016-06-10.voice/Name] :locations {}))

(clojure.spec.alpha/def :portkey.aws.polly.-2016-06-10.marks-not-supported-for-format-exception/message (clojure.spec.alpha/and :portkey.aws.polly.-2016-06-10/error-message))
(clojure.spec.alpha/def :portkey.aws.polly.-2016-06-10/marks-not-supported-for-format-exception (portkey.aws/json-keys :req-un [] :opt-un [:portkey.aws.polly.-2016-06-10.marks-not-supported-for-format-exception/message] :locations {}))

(clojure.spec.alpha/def :portkey.aws.polly.-2016-06-10/speech-mark-type (clojure.spec.alpha/conformer (clojure.core/let [m__13766__auto__ {"sentence" "sentence", :sentence "sentence", "ssml" "ssml", :ssml "ssml", "viseme" "viseme", :viseme "viseme", "word" "word", :word "word"}] (clojure.core/fn [s__13767__auto__] (m__13766__auto__ s__13767__auto__ :clojure.spec.alpha/invalid))) (clojure.core/comp clojure.core/keyword portkey.aws/dashed)))

(clojure.spec.alpha/def :portkey.aws.polly.-2016-06-10/lexicon-description-list (clojure.spec.alpha/and (clojure.spec.alpha/coll-of :portkey.aws.polly.-2016-06-10/lexicon-description) (clojure.spec.alpha/conformer clojure.core/identity (fn* [p1__13687__13688__auto__] (if (clojure.core/sequential? p1__13687__13688__auto__) p1__13687__13688__auto__ [p1__13687__13688__auto__])))))

(clojure.core/defn delete-lexicon "Deletes the specified pronunciation lexicon stored in an AWS Region. A lexicon\nwhich has been deleted is not available for speech synthesis, nor is it possible\nto retrieve it using either the GetLexicon or ListLexicon APIs.\n For more information, see Managing Lexicons\n(http://docs.aws.amazon.com/polly/latest/dg/managing-lexicons.html)." ([delete-lexicon-input] (portkey.aws/-rest-json-call portkey.aws.polly.-2016-06-10/endpoints "DELETE" "/v1/lexicons/{LexiconName}" delete-lexicon-input :portkey.aws.polly.-2016-06-10/delete-lexicon-input {:payload nil, :move {}, :headers {}, :uri {"LexiconName" "Name"}, :querystring {}} 200 :portkey.aws.polly.-2016-06-10/delete-lexicon-output {"LexiconNotFoundException" :portkey.aws.polly.-2016-06-10/lexicon-not-found-exception, "ServiceFailureException" :portkey.aws.polly.-2016-06-10/service-failure-exception})))
(clojure.spec.alpha/fdef delete-lexicon :args (clojure.spec.alpha/tuple :portkey.aws.polly.-2016-06-10/delete-lexicon-input) :ret (clojure.spec.alpha/and :portkey.aws.polly.-2016-06-10/delete-lexicon-output))

(clojure.core/defn describe-voices "Returns the list of voices that are available for use when requesting speech\nsynthesis. Each voice speaks a specified language, is either male or female, and\nis identified by an ID, which is the ASCII version of the voice name.\n When synthesizing speech ( SynthesizeSpeech ), you provide the voice ID for the\nvoice you want from the list of voices returned by DescribeVoices.\n For example, you want your news reader application to read news in a specific\nlanguage, but giving a user the option to choose the voice. Using the\nDescribeVoices operation you can provide the user with a list of available\nvoices to select from.\n You can optionally specify a language code to filter the available voices. For\nexample, if you specify en-US, the operation returns a list of all available US\nEnglish voices.\n This operation requires permissions to perform the polly:DescribeVoices action." ([] (describe-voices {})) ([describe-voices-input] (portkey.aws/-rest-json-call portkey.aws.polly.-2016-06-10/endpoints "GET" "/v1/voices" describe-voices-input :portkey.aws.polly.-2016-06-10/describe-voices-input {:payload nil, :move {}, :headers {}, :uri {}, :querystring {"LanguageCode" "LanguageCode", "NextToken" "NextToken"}} 200 :portkey.aws.polly.-2016-06-10/describe-voices-output {"InvalidNextTokenException" :portkey.aws.polly.-2016-06-10/invalid-next-token-exception, "ServiceFailureException" :portkey.aws.polly.-2016-06-10/service-failure-exception})))
(clojure.spec.alpha/fdef describe-voices :args (clojure.spec.alpha/? :portkey.aws.polly.-2016-06-10/describe-voices-input) :ret (clojure.spec.alpha/and :portkey.aws.polly.-2016-06-10/describe-voices-output))

(clojure.core/defn get-lexicon "Returns the content of the specified pronunciation lexicon stored in an AWS\nRegion. For more information, see Managing Lexicons\n(http://docs.aws.amazon.com/polly/latest/dg/managing-lexicons.html)." ([get-lexicon-input] (portkey.aws/-rest-json-call portkey.aws.polly.-2016-06-10/endpoints "GET" "/v1/lexicons/{LexiconName}" get-lexicon-input :portkey.aws.polly.-2016-06-10/get-lexicon-input {:payload nil, :move {}, :headers {}, :uri {"LexiconName" "Name"}, :querystring {}} 200 :portkey.aws.polly.-2016-06-10/get-lexicon-output {"LexiconNotFoundException" :portkey.aws.polly.-2016-06-10/lexicon-not-found-exception, "ServiceFailureException" :portkey.aws.polly.-2016-06-10/service-failure-exception})))
(clojure.spec.alpha/fdef get-lexicon :args (clojure.spec.alpha/tuple :portkey.aws.polly.-2016-06-10/get-lexicon-input) :ret (clojure.spec.alpha/and :portkey.aws.polly.-2016-06-10/get-lexicon-output))

(clojure.core/defn list-lexicons "Returns a list of pronunciation lexicons stored in an AWS Region. For more\ninformation, see Managing Lexicons\n(http://docs.aws.amazon.com/polly/latest/dg/managing-lexicons.html)." ([] (list-lexicons {})) ([list-lexicons-input] (portkey.aws/-rest-json-call portkey.aws.polly.-2016-06-10/endpoints "GET" "/v1/lexicons" list-lexicons-input :portkey.aws.polly.-2016-06-10/list-lexicons-input {:payload nil, :move {}, :headers {}, :uri {}, :querystring {"NextToken" "NextToken"}} 200 :portkey.aws.polly.-2016-06-10/list-lexicons-output {"InvalidNextTokenException" :portkey.aws.polly.-2016-06-10/invalid-next-token-exception, "ServiceFailureException" :portkey.aws.polly.-2016-06-10/service-failure-exception})))
(clojure.spec.alpha/fdef list-lexicons :args (clojure.spec.alpha/? :portkey.aws.polly.-2016-06-10/list-lexicons-input) :ret (clojure.spec.alpha/and :portkey.aws.polly.-2016-06-10/list-lexicons-output))

(clojure.core/defn put-lexicon "Stores a pronunciation lexicon in an AWS Region. If a lexicon with the same name\nalready exists in the region, it is overwritten by the new lexicon. Lexicon\noperations have eventual consistency, therefore, it might take some time before\nthe lexicon is available to the SynthesizeSpeech operation.\n For more information, see Managing Lexicons\n(http://docs.aws.amazon.com/polly/latest/dg/managing-lexicons.html)." ([put-lexicon-input] (portkey.aws/-rest-json-call portkey.aws.polly.-2016-06-10/endpoints "PUT" "/v1/lexicons/{LexiconName}" put-lexicon-input :portkey.aws.polly.-2016-06-10/put-lexicon-input {:payload nil, :move {}, :headers {}, :uri {"LexiconName" "Name"}, :querystring {}} 200 :portkey.aws.polly.-2016-06-10/put-lexicon-output {"InvalidLexiconException" :portkey.aws.polly.-2016-06-10/invalid-lexicon-exception, "UnsupportedPlsAlphabetException" :portkey.aws.polly.-2016-06-10/unsupported-pls-alphabet-exception, "UnsupportedPlsLanguageException" :portkey.aws.polly.-2016-06-10/unsupported-pls-language-exception, "LexiconSizeExceededException" :portkey.aws.polly.-2016-06-10/lexicon-size-exceeded-exception, "MaxLexemeLengthExceededException" :portkey.aws.polly.-2016-06-10/max-lexeme-length-exceeded-exception, "MaxLexiconsNumberExceededException" :portkey.aws.polly.-2016-06-10/max-lexicons-number-exceeded-exception, "ServiceFailureException" :portkey.aws.polly.-2016-06-10/service-failure-exception})))
(clojure.spec.alpha/fdef put-lexicon :args (clojure.spec.alpha/tuple :portkey.aws.polly.-2016-06-10/put-lexicon-input) :ret (clojure.spec.alpha/and :portkey.aws.polly.-2016-06-10/put-lexicon-output))

(clojure.core/defn synthesize-speech "Synthesizes UTF-8 input, plain text or SSML, to a stream of bytes. SSML input\nmust be valid, well-formed SSML. Some alphabets might not be available with all\nthe voices (for example, Cyrillic might not be read at all by English voices)\nunless phoneme mapping is used. For more information, see How it Works\n(http://docs.aws.amazon.com/polly/latest/dg/how-text-to-speech-works.html)." ([synthesize-speech-input] (portkey.aws/-rest-json-call portkey.aws.polly.-2016-06-10/endpoints "POST" "/v1/speech" synthesize-speech-input :portkey.aws.polly.-2016-06-10/synthesize-speech-input {:payload nil, :move {}, :headers {}, :uri {}, :querystring {}} 200 :portkey.aws.polly.-2016-06-10/synthesize-speech-output {"TextLengthExceededException" :portkey.aws.polly.-2016-06-10/text-length-exceeded-exception, "InvalidSampleRateException" :portkey.aws.polly.-2016-06-10/invalid-sample-rate-exception, "InvalidSsmlException" :portkey.aws.polly.-2016-06-10/invalid-ssml-exception, "LexiconNotFoundException" :portkey.aws.polly.-2016-06-10/lexicon-not-found-exception, "ServiceFailureException" :portkey.aws.polly.-2016-06-10/service-failure-exception, "MarksNotSupportedForFormatException" :portkey.aws.polly.-2016-06-10/marks-not-supported-for-format-exception, "SsmlMarksNotSupportedForTextTypeException" :portkey.aws.polly.-2016-06-10/ssml-marks-not-supported-for-text-type-exception})))
(clojure.spec.alpha/fdef synthesize-speech :args (clojure.spec.alpha/tuple :portkey.aws.polly.-2016-06-10/synthesize-speech-input) :ret (clojure.spec.alpha/and :portkey.aws.polly.-2016-06-10/synthesize-speech-output))
