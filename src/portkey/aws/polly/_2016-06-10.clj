(ns portkey.aws.polly.-2016-06-10 (:require [portkey.aws]))

(def
 endpoints
 '{"eu-west-1"
   {:credential-scope {:service "polly", :region "eu-west-1"},
    :ssl-common-name "polly.eu-west-1.amazonaws.com",
    :endpoint "https://polly.eu-west-1.amazonaws.com",
    :signature-version :v4},
   "us-east-2"
   {:credential-scope {:service "polly", :region "us-east-2"},
    :ssl-common-name "polly.us-east-2.amazonaws.com",
    :endpoint "https://polly.us-east-2.amazonaws.com",
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
    :signature-version :v4}})

(clojure.spec.alpha/def :portkey.aws.polly.-2016-06-10.list-lexicons-output/lexicons (clojure.spec.alpha/and :portkey.aws.polly.-2016-06-10/lexicon-description-list))
(clojure.spec.alpha/def :portkey.aws.polly.-2016-06-10/list-lexicons-output (portkey.awsgen/json-keys :req-un [] :opt-un [:portkey.aws.polly.-2016-06-10.list-lexicons-output/Lexicons :portkey.aws.polly.-2016-06-10/NextToken]))

(clojure.spec.alpha/def :portkey.aws.polly.-2016-06-10.max-lexeme-length-exceeded-exception/message (clojure.spec.alpha/and :portkey.aws.polly.-2016-06-10/error-message))
(clojure.spec.alpha/def :portkey.aws.polly.-2016-06-10/max-lexeme-length-exceeded-exception (portkey.awsgen/json-keys :req-un [] :opt-un [:portkey.aws.polly.-2016-06-10.max-lexeme-length-exceeded-exception/message]))

(clojure.spec.alpha/def :portkey.aws.polly.-2016-06-10/lexicon-arn (clojure.spec.alpha/and clojure.core/string?))

(clojure.spec.alpha/def :portkey.aws.polly.-2016-06-10.invalid-ssml-exception/message (clojure.spec.alpha/and :portkey.aws.polly.-2016-06-10/error-message))
(clojure.spec.alpha/def :portkey.aws.polly.-2016-06-10/invalid-ssml-exception (portkey.awsgen/json-keys :req-un [] :opt-un [:portkey.aws.polly.-2016-06-10.invalid-ssml-exception/message]))

(clojure.spec.alpha/def :portkey.aws.polly.-2016-06-10.unsupported-pls-alphabet-exception/message (clojure.spec.alpha/and :portkey.aws.polly.-2016-06-10/error-message))
(clojure.spec.alpha/def :portkey.aws.polly.-2016-06-10/unsupported-pls-alphabet-exception (portkey.awsgen/json-keys :req-un [] :opt-un [:portkey.aws.polly.-2016-06-10.unsupported-pls-alphabet-exception/message]))

(clojure.spec.alpha/def :portkey.aws.polly.-2016-06-10/get-lexicon-output (portkey.awsgen/json-keys :req-un [] :opt-un [:portkey.aws.polly.-2016-06-10/Lexicon :portkey.aws.polly.-2016-06-10/LexiconAttributes]))

(clojure.spec.alpha/def :portkey.aws.polly.-2016-06-10.delete-lexicon-input/name (clojure.spec.alpha/and :portkey.aws.polly.-2016-06-10/lexicon-name))
(clojure.spec.alpha/def :portkey.aws.polly.-2016-06-10/delete-lexicon-input (portkey.awsgen/json-keys :req-un [:portkey.aws.polly.-2016-06-10.delete-lexicon-input/Name] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.polly.-2016-06-10.describe-voices-output/voices (clojure.spec.alpha/and :portkey.aws.polly.-2016-06-10/voice-list))
(clojure.spec.alpha/def :portkey.aws.polly.-2016-06-10/describe-voices-output (portkey.awsgen/json-keys :req-un [] :opt-un [:portkey.aws.polly.-2016-06-10.describe-voices-output/Voices :portkey.aws.polly.-2016-06-10/NextToken]))

(clojure.spec.alpha/def :portkey.aws.polly.-2016-06-10.ssml-marks-not-supported-for-text-type-exception/message (clojure.spec.alpha/and :portkey.aws.polly.-2016-06-10/error-message))
(clojure.spec.alpha/def :portkey.aws.polly.-2016-06-10/ssml-marks-not-supported-for-text-type-exception (portkey.awsgen/json-keys :req-un [] :opt-un [:portkey.aws.polly.-2016-06-10.ssml-marks-not-supported-for-text-type-exception/message]))

(clojure.spec.alpha/def :portkey.aws.polly.-2016-06-10.max-lexicons-number-exceeded-exception/message (clojure.spec.alpha/and :portkey.aws.polly.-2016-06-10/error-message))
(clojure.spec.alpha/def :portkey.aws.polly.-2016-06-10/max-lexicons-number-exceeded-exception (portkey.awsgen/json-keys :req-un [] :opt-un [:portkey.aws.polly.-2016-06-10.max-lexicons-number-exceeded-exception/message]))

(clojure.spec.alpha/def :portkey.aws.polly.-2016-06-10/sample-rate (clojure.spec.alpha/and clojure.core/string?))

(clojure.spec.alpha/def :portkey.aws.polly.-2016-06-10/request-characters (clojure.spec.alpha/and clojure.core/int?))

(clojure.spec.alpha/def :portkey.aws.polly.-2016-06-10/lexicon-name-list (clojure.spec.alpha/coll-of :portkey.aws.polly.-2016-06-10/lexicon-name :max-count 5))

(clojure.spec.alpha/def :portkey.aws.polly.-2016-06-10/synthesize-speech-output (portkey.awsgen/json-keys :req-un [] :opt-un [:portkey.aws.polly.-2016-06-10/AudioStream :portkey.aws.polly.-2016-06-10/ContentType :portkey.aws.polly.-2016-06-10/RequestCharacters]))

(clojure.spec.alpha/def :portkey.aws.polly.-2016-06-10.service-failure-exception/message (clojure.spec.alpha/and :portkey.aws.polly.-2016-06-10/error-message))
(clojure.spec.alpha/def :portkey.aws.polly.-2016-06-10/service-failure-exception (portkey.awsgen/json-keys :req-un [] :opt-un [:portkey.aws.polly.-2016-06-10.service-failure-exception/message]))

(clojure.spec.alpha/def :portkey.aws.polly.-2016-06-10.put-lexicon-input/name (clojure.spec.alpha/and :portkey.aws.polly.-2016-06-10/lexicon-name))
(clojure.spec.alpha/def :portkey.aws.polly.-2016-06-10.put-lexicon-input/content (clojure.spec.alpha/and :portkey.aws.polly.-2016-06-10/lexicon-content))
(clojure.spec.alpha/def :portkey.aws.polly.-2016-06-10/put-lexicon-input (portkey.awsgen/json-keys :req-un [:portkey.aws.polly.-2016-06-10.put-lexicon-input/Name :portkey.aws.polly.-2016-06-10.put-lexicon-input/Content] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.polly.-2016-06-10/text-type (clojure.spec.alpha/conformer (clojure.core/let [m__99523__auto__ {"ssml" "ssml", :ssml "ssml", "text" "text", :text "text"}] (clojure.core/fn [s__99524__auto__] (m__99523__auto__ s__99524__auto__ :clojure.spec.alpha/invalid))) (clojure.core/comp clojure.core/keyword portkey.awsgen/dashed)))

(clojure.spec.alpha/def :portkey.aws.polly.-2016-06-10.lexicon/content (clojure.spec.alpha/and :portkey.aws.polly.-2016-06-10/lexicon-content))
(clojure.spec.alpha/def :portkey.aws.polly.-2016-06-10.lexicon/name (clojure.spec.alpha/and :portkey.aws.polly.-2016-06-10/lexicon-name))
(clojure.spec.alpha/def :portkey.aws.polly.-2016-06-10/lexicon (portkey.awsgen/json-keys :req-un [] :opt-un [:portkey.aws.polly.-2016-06-10.lexicon/Content :portkey.aws.polly.-2016-06-10.lexicon/Name]))

(clojure.spec.alpha/def :portkey.aws.polly.-2016-06-10/lexemes-count (clojure.spec.alpha/and clojure.core/int?))

(clojure.spec.alpha/def :portkey.aws.polly.-2016-06-10.text-length-exceeded-exception/message (clojure.spec.alpha/and :portkey.aws.polly.-2016-06-10/error-message))
(clojure.spec.alpha/def :portkey.aws.polly.-2016-06-10/text-length-exceeded-exception (portkey.awsgen/json-keys :req-un [] :opt-un [:portkey.aws.polly.-2016-06-10.text-length-exceeded-exception/message]))

(clojure.spec.alpha/def :portkey.aws.polly.-2016-06-10/gender (clojure.spec.alpha/conformer (clojure.core/let [m__99523__auto__ {"Female" "Female", :female "Female", "Male" "Male", :male "Male"}] (clojure.core/fn [s__99524__auto__] (m__99523__auto__ s__99524__auto__ :clojure.spec.alpha/invalid))) (clojure.core/comp clojure.core/keyword portkey.awsgen/dashed)))

(clojure.spec.alpha/def :portkey.aws.polly.-2016-06-10/lexicon-name (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__99527__auto__] (clojure.core/re-matches #"[0-9A-Za-z]{1,20}" s__99527__auto__))))

(clojure.spec.alpha/def :portkey.aws.polly.-2016-06-10.invalid-sample-rate-exception/message (clojure.spec.alpha/and :portkey.aws.polly.-2016-06-10/error-message))
(clojure.spec.alpha/def :portkey.aws.polly.-2016-06-10/invalid-sample-rate-exception (portkey.awsgen/json-keys :req-un [] :opt-un [:portkey.aws.polly.-2016-06-10.invalid-sample-rate-exception/message]))

(clojure.spec.alpha/def :portkey.aws.polly.-2016-06-10/next-token (clojure.spec.alpha/and clojure.core/string?))

(clojure.spec.alpha/def :portkey.aws.polly.-2016-06-10/voice-name (clojure.spec.alpha/and clojure.core/string?))

(clojure.spec.alpha/def :portkey.aws.polly.-2016-06-10/error-message (clojure.spec.alpha/and clojure.core/string?))

(clojure.spec.alpha/def :portkey.aws.polly.-2016-06-10/voice-list (clojure.spec.alpha/coll-of :portkey.aws.polly.-2016-06-10/voice :max-count nil))

(clojure.spec.alpha/def :portkey.aws.polly.-2016-06-10.invalid-next-token-exception/message (clojure.spec.alpha/and :portkey.aws.polly.-2016-06-10/error-message))
(clojure.spec.alpha/def :portkey.aws.polly.-2016-06-10/invalid-next-token-exception (portkey.awsgen/json-keys :req-un [] :opt-un [:portkey.aws.polly.-2016-06-10.invalid-next-token-exception/message]))

(clojure.spec.alpha/def :portkey.aws.polly.-2016-06-10/list-lexicons-input (portkey.awsgen/json-keys :req-un [] :opt-un [:portkey.aws.polly.-2016-06-10/NextToken]))

(clojure.spec.alpha/def :portkey.aws.polly.-2016-06-10/language-name (clojure.spec.alpha/and clojure.core/string?))

(clojure.spec.alpha/def :portkey.aws.polly.-2016-06-10.unsupported-pls-language-exception/message (clojure.spec.alpha/and :portkey.aws.polly.-2016-06-10/error-message))
(clojure.spec.alpha/def :portkey.aws.polly.-2016-06-10/unsupported-pls-language-exception (portkey.awsgen/json-keys :req-un [] :opt-un [:portkey.aws.polly.-2016-06-10.unsupported-pls-language-exception/message]))

(clojure.spec.alpha/def :portkey.aws.polly.-2016-06-10/content-type (clojure.spec.alpha/and clojure.core/string?))

(clojure.spec.alpha/def :portkey.aws.polly.-2016-06-10.get-lexicon-input/name (clojure.spec.alpha/and :portkey.aws.polly.-2016-06-10/lexicon-name))
(clojure.spec.alpha/def :portkey.aws.polly.-2016-06-10/get-lexicon-input (portkey.awsgen/json-keys :req-un [:portkey.aws.polly.-2016-06-10.get-lexicon-input/Name] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.polly.-2016-06-10/put-lexicon-output (portkey.awsgen/json-keys :req-un [] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.polly.-2016-06-10/output-format (clojure.spec.alpha/conformer (clojure.core/let [m__99523__auto__ {"json" "json", :json "json", "mp3" "mp3", :mp3 "mp3", "ogg_vorbis" "ogg_vorbis", :ogg-vorbis "ogg_vorbis", "pcm" "pcm", :pcm "pcm"}] (clojure.core/fn [s__99524__auto__] (m__99523__auto__ s__99524__auto__ :clojure.spec.alpha/invalid))) (clojure.core/comp clojure.core/keyword portkey.awsgen/dashed)))

(clojure.spec.alpha/def :portkey.aws.polly.-2016-06-10/delete-lexicon-output (portkey.awsgen/json-keys :req-un [] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.polly.-2016-06-10/language-code (clojure.spec.alpha/conformer (clojure.core/let [m__99523__auto__ {"it-IT" "it-IT", :ja-jp "ja-JP", :pt-pt "pt-PT", "de-DE" "de-DE", :en-au "en-AU", :es-es "es-ES", :en-gb "en-GB", :nl-nl "nl-NL", :ro-ro "ro-RO", "en-AU" "en-AU", "en-IN" "en-IN", :fr-fr "fr-FR", "da-DK" "da-DK", "tr-TR" "tr-TR", :it-it "it-IT", "es-US" "es-US", :da-dk "da-DK", :de-de "de-DE", "pt-BR" "pt-BR", :ru-ru "ru-RU", :tr-tr "tr-TR", :pt-br "pt-BR", "nl-NL" "nl-NL", :pl-pl "pl-PL", "fr-CA" "fr-CA", "ja-JP" "ja-JP", :cy-gb "cy-GB", "en-US" "en-US", :nb-no "nb-NO", "cy-GB" "cy-GB", "fr-FR" "fr-FR", "en-GB" "en-GB", "ru-RU" "ru-RU", "ro-RO" "ro-RO", :fr-ca "fr-CA", :sv-se "sv-SE", "es-ES" "es-ES", "en-GB-WLS" "en-GB-WLS", "pt-PT" "pt-PT", :en-in "en-IN", :en-us "en-US", "pl-PL" "pl-PL", "is-IS" "is-IS", "sv-SE" "sv-SE", "nb-NO" "nb-NO", :en-gb-wls "en-GB-WLS", :is-is "is-IS", :es-us "es-US"}] (clojure.core/fn [s__99524__auto__] (m__99523__auto__ s__99524__auto__ :clojure.spec.alpha/invalid))) (clojure.core/comp clojure.core/keyword portkey.awsgen/dashed)))

(clojure.spec.alpha/def :portkey.aws.polly.-2016-06-10/lexicon-attributes (portkey.awsgen/json-keys :req-un [] :opt-un [:portkey.aws.polly.-2016-06-10/Alphabet :portkey.aws.polly.-2016-06-10/LanguageCode :portkey.aws.polly.-2016-06-10/LastModified :portkey.aws.polly.-2016-06-10/LexiconArn :portkey.aws.polly.-2016-06-10/LexemesCount :portkey.aws.polly.-2016-06-10/Size]))

(clojure.spec.alpha/def :portkey.aws.polly.-2016-06-10/last-modified clojure.core/inst?)

(clojure.spec.alpha/def :portkey.aws.polly.-2016-06-10/speech-mark-type-list (clojure.spec.alpha/coll-of :portkey.aws.polly.-2016-06-10/speech-mark-type :max-count 4))

(clojure.spec.alpha/def :portkey.aws.polly.-2016-06-10.lexicon-description/name (clojure.spec.alpha/and :portkey.aws.polly.-2016-06-10/lexicon-name))
(clojure.spec.alpha/def :portkey.aws.polly.-2016-06-10.lexicon-description/attributes (clojure.spec.alpha/and :portkey.aws.polly.-2016-06-10/lexicon-attributes))
(clojure.spec.alpha/def :portkey.aws.polly.-2016-06-10/lexicon-description (portkey.awsgen/json-keys :req-un [] :opt-un [:portkey.aws.polly.-2016-06-10.lexicon-description/Name :portkey.aws.polly.-2016-06-10.lexicon-description/Attributes]))

(clojure.spec.alpha/def :portkey.aws.polly.-2016-06-10/size (clojure.spec.alpha/and clojure.core/int?))

(clojure.spec.alpha/def :portkey.aws.polly.-2016-06-10/lexicon-content (clojure.spec.alpha/and clojure.core/string?))

(clojure.spec.alpha/def :portkey.aws.polly.-2016-06-10.lexicon-not-found-exception/message (clojure.spec.alpha/and :portkey.aws.polly.-2016-06-10/error-message))
(clojure.spec.alpha/def :portkey.aws.polly.-2016-06-10/lexicon-not-found-exception (portkey.awsgen/json-keys :req-un [] :opt-un [:portkey.aws.polly.-2016-06-10.lexicon-not-found-exception/message]))

(clojure.spec.alpha/def :portkey.aws.polly.-2016-06-10.invalid-lexicon-exception/message (clojure.spec.alpha/and :portkey.aws.polly.-2016-06-10/error-message))
(clojure.spec.alpha/def :portkey.aws.polly.-2016-06-10/invalid-lexicon-exception (portkey.awsgen/json-keys :req-un [] :opt-un [:portkey.aws.polly.-2016-06-10.invalid-lexicon-exception/message]))

(clojure.spec.alpha/def :portkey.aws.polly.-2016-06-10/voice-id (clojure.spec.alpha/conformer (clojure.core/let [m__99523__auto__ {"Filiz" "Filiz", :joey "Joey", "Joanna" "Joanna", "Amy" "Amy", "Marlene" "Marlene", :astrid "Astrid", "Salli" "Salli", :maja "Maja", "Ricardo" "Ricardo", :tatyana "Tatyana", "Mathieu" "Mathieu", "Enrique" "Enrique", :lotte "Lotte", :ewa "Ewa", "Nicole" "Nicole", "Russell" "Russell", :giorgio "Giorgio", "Gwyneth" "Gwyneth", "Conchita" "Conchita", :jan "Jan", :dora "Dora", :justin "Justin", "Joey" "Joey", "Chantal" "Chantal", :russell "Russell", :amy "Amy", "Ines" "Ines", "Hans" "Hans", "Penelope" "Penelope", :conchita "Conchita", "Mizuki" "Mizuki", "Maja" "Maja", "Miguel" "Miguel", "Kendra" "Kendra", "Karl" "Karl", "Mads" "Mads", :gwyneth "Gwyneth", :emma "Emma", "Carla" "Carla", "Geraint" "Geraint", "Astrid" "Astrid", "Celine" "Celine", :maxim "Maxim", "Vicki" "Vicki", "Jan" "Jan", :mads "Mads", :liv "Liv", "Lotte" "Lotte", :celine "Celine", :jacek "Jacek", :vitoria "Vitoria", :miguel "Miguel", "Kimberly" "Kimberly", :filiz "Filiz", "Liv" "Liv", "Brian" "Brian", "Cristiano" "Cristiano", "Ewa" "Ewa", "Maxim" "Maxim", :mathieu "Mathieu", "Vitoria" "Vitoria", :karl "Karl", :salli "Salli", :hans "Hans", "Giorgio" "Giorgio", "Justin" "Justin", :mizuki "Mizuki", "Emma" "Emma", :joanna "Joanna", "Raveena" "Raveena", :ricardo "Ricardo", :vicki "Vicki", "Carmen" "Carmen", "Jacek" "Jacek", :raveena "Raveena", "Naja" "Naja", :penelope "Penelope", :carmen "Carmen", "Ivy" "Ivy", :naja "Naja", :ivy "Ivy", "Tatyana" "Tatyana", :carla "Carla", :chantal "Chantal", "Ruben" "Ruben", :kendra "Kendra", :kimberly "Kimberly", :geraint "Geraint", :nicole "Nicole", :brian "Brian", :marlene "Marlene", :enrique "Enrique", "Dora" "Dora", :ines "Ines", :ruben "Ruben", :cristiano "Cristiano"}] (clojure.core/fn [s__99524__auto__] (m__99523__auto__ s__99524__auto__ :clojure.spec.alpha/invalid))) (clojure.core/comp clojure.core/keyword portkey.awsgen/dashed)))

(clojure.spec.alpha/def :portkey.aws.polly.-2016-06-10.synthesize-speech-input/lexicon-names (clojure.spec.alpha/and :portkey.aws.polly.-2016-06-10/lexicon-name-list))
(clojure.spec.alpha/def :portkey.aws.polly.-2016-06-10.synthesize-speech-input/speech-mark-types (clojure.spec.alpha/and :portkey.aws.polly.-2016-06-10/speech-mark-type-list))
(clojure.spec.alpha/def :portkey.aws.polly.-2016-06-10/synthesize-speech-input (portkey.awsgen/json-keys :req-un [:portkey.aws.polly.-2016-06-10/OutputFormat :portkey.aws.polly.-2016-06-10/Text :portkey.aws.polly.-2016-06-10/VoiceId] :opt-un [:portkey.aws.polly.-2016-06-10.synthesize-speech-input/LexiconNames :portkey.aws.polly.-2016-06-10/SampleRate :portkey.aws.polly.-2016-06-10.synthesize-speech-input/SpeechMarkTypes :portkey.aws.polly.-2016-06-10/TextType]))

(clojure.spec.alpha/def :portkey.aws.polly.-2016-06-10/text (clojure.spec.alpha/and clojure.core/string?))

(clojure.spec.alpha/def :portkey.aws.polly.-2016-06-10/audio-stream (clojure.spec.alpha/and clojure.core/bytes? (clojure.spec.alpha/conformer portkey.awsgen/base64-encode portkey.awsgen/base64-decode)))

(clojure.spec.alpha/def :portkey.aws.polly.-2016-06-10/describe-voices-input (portkey.awsgen/json-keys :req-un [] :opt-un [:portkey.aws.polly.-2016-06-10/LanguageCode :portkey.aws.polly.-2016-06-10/NextToken]))

(clojure.spec.alpha/def :portkey.aws.polly.-2016-06-10.lexicon-size-exceeded-exception/message (clojure.spec.alpha/and :portkey.aws.polly.-2016-06-10/error-message))
(clojure.spec.alpha/def :portkey.aws.polly.-2016-06-10/lexicon-size-exceeded-exception (portkey.awsgen/json-keys :req-un [] :opt-un [:portkey.aws.polly.-2016-06-10.lexicon-size-exceeded-exception/message]))

(clojure.spec.alpha/def :portkey.aws.polly.-2016-06-10/alphabet (clojure.spec.alpha/and clojure.core/string?))

(clojure.spec.alpha/def :portkey.aws.polly.-2016-06-10.voice/id (clojure.spec.alpha/and :portkey.aws.polly.-2016-06-10/voice-id))
(clojure.spec.alpha/def :portkey.aws.polly.-2016-06-10.voice/name (clojure.spec.alpha/and :portkey.aws.polly.-2016-06-10/voice-name))
(clojure.spec.alpha/def :portkey.aws.polly.-2016-06-10/voice (portkey.awsgen/json-keys :req-un [] :opt-un [:portkey.aws.polly.-2016-06-10/Gender :portkey.aws.polly.-2016-06-10.voice/Id :portkey.aws.polly.-2016-06-10/LanguageCode :portkey.aws.polly.-2016-06-10/LanguageName :portkey.aws.polly.-2016-06-10.voice/Name]))

(clojure.spec.alpha/def :portkey.aws.polly.-2016-06-10.marks-not-supported-for-format-exception/message (clojure.spec.alpha/and :portkey.aws.polly.-2016-06-10/error-message))
(clojure.spec.alpha/def :portkey.aws.polly.-2016-06-10/marks-not-supported-for-format-exception (portkey.awsgen/json-keys :req-un [] :opt-un [:portkey.aws.polly.-2016-06-10.marks-not-supported-for-format-exception/message]))

(clojure.spec.alpha/def :portkey.aws.polly.-2016-06-10/speech-mark-type (clojure.spec.alpha/conformer (clojure.core/let [m__99523__auto__ {"sentence" "sentence", :sentence "sentence", "ssml" "ssml", :ssml "ssml", "viseme" "viseme", :viseme "viseme", "word" "word", :word "word"}] (clojure.core/fn [s__99524__auto__] (m__99523__auto__ s__99524__auto__ :clojure.spec.alpha/invalid))) (clojure.core/comp clojure.core/keyword portkey.awsgen/dashed)))

(clojure.spec.alpha/def :portkey.aws.polly.-2016-06-10/lexicon-description-list (clojure.spec.alpha/coll-of :portkey.aws.polly.-2016-06-10/lexicon-description :max-count nil))

(clojure.core/defn delete-lexicon [input113763] (clojure.core/let [endpoint__109311__auto__ (portkey.aws.polly.-2016-06-10/endpoints portkey.aws/*region*)] (clojure.core/-> {:portkey.aws/signature-version (:signature-version endpoint__109311__auto__), :method "DELETE", :as :json-string-keys, :headers {"content-type" "application/json"}, :portkey.aws/credential-scope (:credential-scope endpoint__109311__auto__), :url (clojure.core/str (:endpoint (endpoints portkey.aws/*region*)) "/v1/lexicons/{LexiconName}"), :body (clojure.spec.alpha/unform :portkey.aws.polly.-2016-06-10/delete-lexicon-input input113763)} (portkey.awsgen/params-to-header {}) (portkey.awsgen/params-to-uri {"LexiconName" "Name"}) (portkey.awsgen/params-to-querystring {}) (portkey.awsgen/params-to-payload nil) (clojure.core/update :body (fn* [p1__109310__109312__auto__] (clojure.core/some-> p1__109310__109312__auto__ cheshire.core/generate-string))) (portkey.aws/*http-client* (clojure.core/fn [response113762] (clojure.core/let [errors__109313__auto__ {"LexiconNotFoundException" :portkey.aws.polly.-2016-06-10/lexicon-not-found-exception, "ServiceFailureException" :portkey.aws.polly.-2016-06-10/service-failure-exception}] (if (clojure.core/= 200 (:status response113762)) [:result (clojure.spec.alpha/unform :portkey.aws.polly.-2016-06-10/delete-lexicon-output (:body response113762))] [:exception (clojure.core/if-some [[type__109314__auto__ spec__109315__auto__] (clojure.core/find errors__109313__auto__ (clojure.core/get-in response113762 [:headers "x-amzn-ErrorType"]))] (clojure.core/let [m__109316__auto__ (clojure.spec.alpha/unform spec__109315__auto__ (cheshire.core/parse-string (:body response113762)))] (clojure.core/ex-info (clojure.core/str type__109314__auto__ ": " (:message m__109316__auto__)) m__109316__auto__)) (clojure.core/ex-info "Unexpected response" {:response response113762}))])))))))
(clojure.spec.alpha/fdef delete-lexicon :args (clojure.spec.alpha/cat :sync (clojure.spec.alpha/tuple :portkey.aws.polly.-2016-06-10/delete-lexicon-input) :async (clojure.spec.alpha/tuple :portkey.aws.polly.-2016-06-10/delete-lexicon-input (clojure.spec.alpha/fspec :args (clojure.spec.alpha/cat :result clojure.core/any? :exception clojure.core/ex-data)))) :ret (clojure.spec.alpha/and :portkey.aws.polly.-2016-06-10/delete-lexicon-output))

(clojure.core/defn describe-voices [input113765] (clojure.core/let [endpoint__109311__auto__ (portkey.aws.polly.-2016-06-10/endpoints portkey.aws/*region*)] (clojure.core/-> {:portkey.aws/signature-version (:signature-version endpoint__109311__auto__), :method "GET", :as :json-string-keys, :headers {"content-type" "application/json"}, :portkey.aws/credential-scope (:credential-scope endpoint__109311__auto__), :url (clojure.core/str (:endpoint (endpoints portkey.aws/*region*)) "/v1/voices"), :body (clojure.spec.alpha/unform :portkey.aws.polly.-2016-06-10/describe-voices-input input113765)} (portkey.awsgen/params-to-header {}) (portkey.awsgen/params-to-uri {}) (portkey.awsgen/params-to-querystring {"LanguageCode" "LanguageCode", "NextToken" "NextToken"}) (portkey.awsgen/params-to-payload nil) (clojure.core/update :body (fn* [p1__109310__109312__auto__] (clojure.core/some-> p1__109310__109312__auto__ cheshire.core/generate-string))) (portkey.aws/*http-client* (clojure.core/fn [response113764] (clojure.core/let [errors__109313__auto__ {"InvalidNextTokenException" :portkey.aws.polly.-2016-06-10/invalid-next-token-exception, "ServiceFailureException" :portkey.aws.polly.-2016-06-10/service-failure-exception}] (if (clojure.core/= 200 (:status response113764)) [:result (clojure.spec.alpha/unform :portkey.aws.polly.-2016-06-10/describe-voices-output (:body response113764))] [:exception (clojure.core/if-some [[type__109314__auto__ spec__109315__auto__] (clojure.core/find errors__109313__auto__ (clojure.core/get-in response113764 [:headers "x-amzn-ErrorType"]))] (clojure.core/let [m__109316__auto__ (clojure.spec.alpha/unform spec__109315__auto__ (cheshire.core/parse-string (:body response113764)))] (clojure.core/ex-info (clojure.core/str type__109314__auto__ ": " (:message m__109316__auto__)) m__109316__auto__)) (clojure.core/ex-info "Unexpected response" {:response response113764}))])))))))
(clojure.spec.alpha/fdef describe-voices :args (clojure.spec.alpha/cat :sync (clojure.spec.alpha/tuple :portkey.aws.polly.-2016-06-10/describe-voices-input) :async (clojure.spec.alpha/tuple :portkey.aws.polly.-2016-06-10/describe-voices-input (clojure.spec.alpha/fspec :args (clojure.spec.alpha/cat :result clojure.core/any? :exception clojure.core/ex-data)))) :ret (clojure.spec.alpha/and :portkey.aws.polly.-2016-06-10/describe-voices-output))

(clojure.core/defn get-lexicon [input113767] (clojure.core/let [endpoint__109311__auto__ (portkey.aws.polly.-2016-06-10/endpoints portkey.aws/*region*)] (clojure.core/-> {:portkey.aws/signature-version (:signature-version endpoint__109311__auto__), :method "GET", :as :json-string-keys, :headers {"content-type" "application/json"}, :portkey.aws/credential-scope (:credential-scope endpoint__109311__auto__), :url (clojure.core/str (:endpoint (endpoints portkey.aws/*region*)) "/v1/lexicons/{LexiconName}"), :body (clojure.spec.alpha/unform :portkey.aws.polly.-2016-06-10/get-lexicon-input input113767)} (portkey.awsgen/params-to-header {}) (portkey.awsgen/params-to-uri {"LexiconName" "Name"}) (portkey.awsgen/params-to-querystring {}) (portkey.awsgen/params-to-payload nil) (clojure.core/update :body (fn* [p1__109310__109312__auto__] (clojure.core/some-> p1__109310__109312__auto__ cheshire.core/generate-string))) (portkey.aws/*http-client* (clojure.core/fn [response113766] (clojure.core/let [errors__109313__auto__ {"LexiconNotFoundException" :portkey.aws.polly.-2016-06-10/lexicon-not-found-exception, "ServiceFailureException" :portkey.aws.polly.-2016-06-10/service-failure-exception}] (if (clojure.core/= 200 (:status response113766)) [:result (clojure.spec.alpha/unform :portkey.aws.polly.-2016-06-10/get-lexicon-output (:body response113766))] [:exception (clojure.core/if-some [[type__109314__auto__ spec__109315__auto__] (clojure.core/find errors__109313__auto__ (clojure.core/get-in response113766 [:headers "x-amzn-ErrorType"]))] (clojure.core/let [m__109316__auto__ (clojure.spec.alpha/unform spec__109315__auto__ (cheshire.core/parse-string (:body response113766)))] (clojure.core/ex-info (clojure.core/str type__109314__auto__ ": " (:message m__109316__auto__)) m__109316__auto__)) (clojure.core/ex-info "Unexpected response" {:response response113766}))])))))))
(clojure.spec.alpha/fdef get-lexicon :args (clojure.spec.alpha/cat :sync (clojure.spec.alpha/tuple :portkey.aws.polly.-2016-06-10/get-lexicon-input) :async (clojure.spec.alpha/tuple :portkey.aws.polly.-2016-06-10/get-lexicon-input (clojure.spec.alpha/fspec :args (clojure.spec.alpha/cat :result clojure.core/any? :exception clojure.core/ex-data)))) :ret (clojure.spec.alpha/and :portkey.aws.polly.-2016-06-10/get-lexicon-output))

(clojure.core/defn list-lexicons [input113769] (clojure.core/let [endpoint__109311__auto__ (portkey.aws.polly.-2016-06-10/endpoints portkey.aws/*region*)] (clojure.core/-> {:portkey.aws/signature-version (:signature-version endpoint__109311__auto__), :method "GET", :as :json-string-keys, :headers {"content-type" "application/json"}, :portkey.aws/credential-scope (:credential-scope endpoint__109311__auto__), :url (clojure.core/str (:endpoint (endpoints portkey.aws/*region*)) "/v1/lexicons"), :body (clojure.spec.alpha/unform :portkey.aws.polly.-2016-06-10/list-lexicons-input input113769)} (portkey.awsgen/params-to-header {}) (portkey.awsgen/params-to-uri {}) (portkey.awsgen/params-to-querystring {"NextToken" "NextToken"}) (portkey.awsgen/params-to-payload nil) (clojure.core/update :body (fn* [p1__109310__109312__auto__] (clojure.core/some-> p1__109310__109312__auto__ cheshire.core/generate-string))) (portkey.aws/*http-client* (clojure.core/fn [response113768] (clojure.core/let [errors__109313__auto__ {"InvalidNextTokenException" :portkey.aws.polly.-2016-06-10/invalid-next-token-exception, "ServiceFailureException" :portkey.aws.polly.-2016-06-10/service-failure-exception}] (if (clojure.core/= 200 (:status response113768)) [:result (clojure.spec.alpha/unform :portkey.aws.polly.-2016-06-10/list-lexicons-output (:body response113768))] [:exception (clojure.core/if-some [[type__109314__auto__ spec__109315__auto__] (clojure.core/find errors__109313__auto__ (clojure.core/get-in response113768 [:headers "x-amzn-ErrorType"]))] (clojure.core/let [m__109316__auto__ (clojure.spec.alpha/unform spec__109315__auto__ (cheshire.core/parse-string (:body response113768)))] (clojure.core/ex-info (clojure.core/str type__109314__auto__ ": " (:message m__109316__auto__)) m__109316__auto__)) (clojure.core/ex-info "Unexpected response" {:response response113768}))])))))))
(clojure.spec.alpha/fdef list-lexicons :args (clojure.spec.alpha/cat :sync (clojure.spec.alpha/tuple :portkey.aws.polly.-2016-06-10/list-lexicons-input) :async (clojure.spec.alpha/tuple :portkey.aws.polly.-2016-06-10/list-lexicons-input (clojure.spec.alpha/fspec :args (clojure.spec.alpha/cat :result clojure.core/any? :exception clojure.core/ex-data)))) :ret (clojure.spec.alpha/and :portkey.aws.polly.-2016-06-10/list-lexicons-output))

(clojure.core/defn put-lexicon [input113771] (clojure.core/let [endpoint__109311__auto__ (portkey.aws.polly.-2016-06-10/endpoints portkey.aws/*region*)] (clojure.core/-> {:portkey.aws/signature-version (:signature-version endpoint__109311__auto__), :method "PUT", :as :json-string-keys, :headers {"content-type" "application/json"}, :portkey.aws/credential-scope (:credential-scope endpoint__109311__auto__), :url (clojure.core/str (:endpoint (endpoints portkey.aws/*region*)) "/v1/lexicons/{LexiconName}"), :body (clojure.spec.alpha/unform :portkey.aws.polly.-2016-06-10/put-lexicon-input input113771)} (portkey.awsgen/params-to-header {}) (portkey.awsgen/params-to-uri {"LexiconName" "Name"}) (portkey.awsgen/params-to-querystring {}) (portkey.awsgen/params-to-payload nil) (clojure.core/update :body (fn* [p1__109310__109312__auto__] (clojure.core/some-> p1__109310__109312__auto__ cheshire.core/generate-string))) (portkey.aws/*http-client* (clojure.core/fn [response113770] (clojure.core/let [errors__109313__auto__ {"InvalidLexiconException" :portkey.aws.polly.-2016-06-10/invalid-lexicon-exception, "UnsupportedPlsAlphabetException" :portkey.aws.polly.-2016-06-10/unsupported-pls-alphabet-exception, "UnsupportedPlsLanguageException" :portkey.aws.polly.-2016-06-10/unsupported-pls-language-exception, "LexiconSizeExceededException" :portkey.aws.polly.-2016-06-10/lexicon-size-exceeded-exception, "MaxLexemeLengthExceededException" :portkey.aws.polly.-2016-06-10/max-lexeme-length-exceeded-exception, "MaxLexiconsNumberExceededException" :portkey.aws.polly.-2016-06-10/max-lexicons-number-exceeded-exception, "ServiceFailureException" :portkey.aws.polly.-2016-06-10/service-failure-exception}] (if (clojure.core/= 200 (:status response113770)) [:result (clojure.spec.alpha/unform :portkey.aws.polly.-2016-06-10/put-lexicon-output (:body response113770))] [:exception (clojure.core/if-some [[type__109314__auto__ spec__109315__auto__] (clojure.core/find errors__109313__auto__ (clojure.core/get-in response113770 [:headers "x-amzn-ErrorType"]))] (clojure.core/let [m__109316__auto__ (clojure.spec.alpha/unform spec__109315__auto__ (cheshire.core/parse-string (:body response113770)))] (clojure.core/ex-info (clojure.core/str type__109314__auto__ ": " (:message m__109316__auto__)) m__109316__auto__)) (clojure.core/ex-info "Unexpected response" {:response response113770}))])))))))
(clojure.spec.alpha/fdef put-lexicon :args (clojure.spec.alpha/cat :sync (clojure.spec.alpha/tuple :portkey.aws.polly.-2016-06-10/put-lexicon-input) :async (clojure.spec.alpha/tuple :portkey.aws.polly.-2016-06-10/put-lexicon-input (clojure.spec.alpha/fspec :args (clojure.spec.alpha/cat :result clojure.core/any? :exception clojure.core/ex-data)))) :ret (clojure.spec.alpha/and :portkey.aws.polly.-2016-06-10/put-lexicon-output))

(clojure.core/defn synthesize-speech [input113773] (clojure.core/let [endpoint__109311__auto__ (portkey.aws.polly.-2016-06-10/endpoints portkey.aws/*region*)] (clojure.core/-> {:portkey.aws/signature-version (:signature-version endpoint__109311__auto__), :method "POST", :as :json-string-keys, :headers {"content-type" "application/json"}, :portkey.aws/credential-scope (:credential-scope endpoint__109311__auto__), :url (clojure.core/str (:endpoint (endpoints portkey.aws/*region*)) "/v1/speech"), :body (clojure.spec.alpha/unform :portkey.aws.polly.-2016-06-10/synthesize-speech-input input113773)} (portkey.awsgen/params-to-header {}) (portkey.awsgen/params-to-uri {}) (portkey.awsgen/params-to-querystring {}) (portkey.awsgen/params-to-payload nil) (clojure.core/update :body (fn* [p1__109310__109312__auto__] (clojure.core/some-> p1__109310__109312__auto__ cheshire.core/generate-string))) (portkey.aws/*http-client* (clojure.core/fn [response113772] (clojure.core/let [errors__109313__auto__ {"TextLengthExceededException" :portkey.aws.polly.-2016-06-10/text-length-exceeded-exception, "InvalidSampleRateException" :portkey.aws.polly.-2016-06-10/invalid-sample-rate-exception, "InvalidSsmlException" :portkey.aws.polly.-2016-06-10/invalid-ssml-exception, "LexiconNotFoundException" :portkey.aws.polly.-2016-06-10/lexicon-not-found-exception, "ServiceFailureException" :portkey.aws.polly.-2016-06-10/service-failure-exception, "MarksNotSupportedForFormatException" :portkey.aws.polly.-2016-06-10/marks-not-supported-for-format-exception, "SsmlMarksNotSupportedForTextTypeException" :portkey.aws.polly.-2016-06-10/ssml-marks-not-supported-for-text-type-exception}] (if (clojure.core/= 200 (:status response113772)) [:result (clojure.spec.alpha/unform :portkey.aws.polly.-2016-06-10/synthesize-speech-output (:body response113772))] [:exception (clojure.core/if-some [[type__109314__auto__ spec__109315__auto__] (clojure.core/find errors__109313__auto__ (clojure.core/get-in response113772 [:headers "x-amzn-ErrorType"]))] (clojure.core/let [m__109316__auto__ (clojure.spec.alpha/unform spec__109315__auto__ (cheshire.core/parse-string (:body response113772)))] (clojure.core/ex-info (clojure.core/str type__109314__auto__ ": " (:message m__109316__auto__)) m__109316__auto__)) (clojure.core/ex-info "Unexpected response" {:response response113772}))])))))))
(clojure.spec.alpha/fdef synthesize-speech :args (clojure.spec.alpha/cat :sync (clojure.spec.alpha/tuple :portkey.aws.polly.-2016-06-10/synthesize-speech-input) :async (clojure.spec.alpha/tuple :portkey.aws.polly.-2016-06-10/synthesize-speech-input (clojure.spec.alpha/fspec :args (clojure.spec.alpha/cat :result clojure.core/any? :exception clojure.core/ex-data)))) :ret (clojure.spec.alpha/and :portkey.aws.polly.-2016-06-10/synthesize-speech-output))
