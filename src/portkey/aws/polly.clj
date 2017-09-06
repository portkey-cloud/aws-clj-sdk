(ns portkey.aws.polly (:require [portkey.aws]))

(clojure.spec.alpha/def :portkey.aws.polly.list-lexicons-output/lexicons (clojure.spec.alpha/and :portkey.aws.polly/lexicon-description-list))
(clojure.spec.alpha/def :portkey.aws.polly/list-lexicons-output (portkey.awsgen/json-keys :req-un [] :opt-un [:portkey.aws.polly.list-lexicons-output/Lexicons :portkey.aws.polly/NextToken]))

(clojure.spec.alpha/def :portkey.aws.polly.max-lexeme-length-exceeded-exception/message (clojure.spec.alpha/and :portkey.aws.polly/error-message))
(clojure.spec.alpha/def :portkey.aws.polly/max-lexeme-length-exceeded-exception (portkey.awsgen/json-keys :req-un [] :opt-un [:portkey.aws.polly.max-lexeme-length-exceeded-exception/message]))

(clojure.spec.alpha/def :portkey.aws.polly/lexicon-arn (clojure.spec.alpha/and clojure.core/string?))

(clojure.spec.alpha/def :portkey.aws.polly.invalid-ssml-exception/message (clojure.spec.alpha/and :portkey.aws.polly/error-message))
(clojure.spec.alpha/def :portkey.aws.polly/invalid-ssml-exception (portkey.awsgen/json-keys :req-un [] :opt-un [:portkey.aws.polly.invalid-ssml-exception/message]))

(clojure.spec.alpha/def :portkey.aws.polly.unsupported-pls-alphabet-exception/message (clojure.spec.alpha/and :portkey.aws.polly/error-message))
(clojure.spec.alpha/def :portkey.aws.polly/unsupported-pls-alphabet-exception (portkey.awsgen/json-keys :req-un [] :opt-un [:portkey.aws.polly.unsupported-pls-alphabet-exception/message]))

(clojure.spec.alpha/def :portkey.aws.polly/get-lexicon-output (portkey.awsgen/json-keys :req-un [] :opt-un [:portkey.aws.polly/Lexicon :portkey.aws.polly/LexiconAttributes]))

(clojure.spec.alpha/def :portkey.aws.polly.delete-lexicon-input/name (clojure.spec.alpha/and :portkey.aws.polly/lexicon-name))
(clojure.spec.alpha/def :portkey.aws.polly/delete-lexicon-input (portkey.awsgen/json-keys :req-un [:portkey.aws.polly.delete-lexicon-input/Name] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.polly.describe-voices-output/voices (clojure.spec.alpha/and :portkey.aws.polly/voice-list))
(clojure.spec.alpha/def :portkey.aws.polly/describe-voices-output (portkey.awsgen/json-keys :req-un [] :opt-un [:portkey.aws.polly.describe-voices-output/Voices :portkey.aws.polly/NextToken]))

(clojure.spec.alpha/def :portkey.aws.polly.ssml-marks-not-supported-for-text-type-exception/message (clojure.spec.alpha/and :portkey.aws.polly/error-message))
(clojure.spec.alpha/def :portkey.aws.polly/ssml-marks-not-supported-for-text-type-exception (portkey.awsgen/json-keys :req-un [] :opt-un [:portkey.aws.polly.ssml-marks-not-supported-for-text-type-exception/message]))

(clojure.spec.alpha/def :portkey.aws.polly.max-lexicons-number-exceeded-exception/message (clojure.spec.alpha/and :portkey.aws.polly/error-message))
(clojure.spec.alpha/def :portkey.aws.polly/max-lexicons-number-exceeded-exception (portkey.awsgen/json-keys :req-un [] :opt-un [:portkey.aws.polly.max-lexicons-number-exceeded-exception/message]))

(clojure.spec.alpha/def :portkey.aws.polly/sample-rate (clojure.spec.alpha/and clojure.core/string?))

(clojure.spec.alpha/def :portkey.aws.polly/request-characters (clojure.spec.alpha/and clojure.core/int?))

(clojure.spec.alpha/def :portkey.aws.polly/lexicon-name-list (clojure.spec.alpha/coll-of :portkey.aws.polly/lexicon-name :max-count 5))

(clojure.spec.alpha/def :portkey.aws.polly/synthesize-speech-output (portkey.awsgen/json-keys :req-un [] :opt-un [:portkey.aws.polly/AudioStream :portkey.aws.polly/ContentType :portkey.aws.polly/RequestCharacters]))

(clojure.spec.alpha/def :portkey.aws.polly.service-failure-exception/message (clojure.spec.alpha/and :portkey.aws.polly/error-message))
(clojure.spec.alpha/def :portkey.aws.polly/service-failure-exception (portkey.awsgen/json-keys :req-un [] :opt-un [:portkey.aws.polly.service-failure-exception/message]))

(clojure.spec.alpha/def :portkey.aws.polly.put-lexicon-input/name (clojure.spec.alpha/and :portkey.aws.polly/lexicon-name))
(clojure.spec.alpha/def :portkey.aws.polly.put-lexicon-input/content (clojure.spec.alpha/and :portkey.aws.polly/lexicon-content))
(clojure.spec.alpha/def :portkey.aws.polly/put-lexicon-input (portkey.awsgen/json-keys :req-un [:portkey.aws.polly.put-lexicon-input/Name :portkey.aws.polly.put-lexicon-input/Content] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.polly/text-type (clojure.spec.alpha/conformer (clojure.core/let [m__30835__auto__ {"ssml" "ssml", :ssml "ssml", "text" "text", :text "text"}] (clojure.core/fn [s__30836__auto__] (m__30835__auto__ s__30836__auto__ :clojure.spec.alpha/invalid))) (clojure.core/comp clojure.core/keyword portkey.awsgen/dashed)))

(clojure.spec.alpha/def :portkey.aws.polly.lexicon/content (clojure.spec.alpha/and :portkey.aws.polly/lexicon-content))
(clojure.spec.alpha/def :portkey.aws.polly.lexicon/name (clojure.spec.alpha/and :portkey.aws.polly/lexicon-name))
(clojure.spec.alpha/def :portkey.aws.polly/lexicon (portkey.awsgen/json-keys :req-un [] :opt-un [:portkey.aws.polly.lexicon/Content :portkey.aws.polly.lexicon/Name]))

(clojure.spec.alpha/def :portkey.aws.polly/lexemes-count (clojure.spec.alpha/and clojure.core/int?))

(clojure.spec.alpha/def :portkey.aws.polly.text-length-exceeded-exception/message (clojure.spec.alpha/and :portkey.aws.polly/error-message))
(clojure.spec.alpha/def :portkey.aws.polly/text-length-exceeded-exception (portkey.awsgen/json-keys :req-un [] :opt-un [:portkey.aws.polly.text-length-exceeded-exception/message]))

(clojure.spec.alpha/def :portkey.aws.polly/gender (clojure.spec.alpha/conformer (clojure.core/let [m__30835__auto__ {"Female" "Female", :female "Female", "Male" "Male", :male "Male"}] (clojure.core/fn [s__30836__auto__] (m__30835__auto__ s__30836__auto__ :clojure.spec.alpha/invalid))) (clojure.core/comp clojure.core/keyword portkey.awsgen/dashed)))

(clojure.spec.alpha/def :portkey.aws.polly/lexicon-name (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__30839__auto__] (clojure.core/re-matches #"[0-9A-Za-z]{1,20}" s__30839__auto__))))

(clojure.spec.alpha/def :portkey.aws.polly.invalid-sample-rate-exception/message (clojure.spec.alpha/and :portkey.aws.polly/error-message))
(clojure.spec.alpha/def :portkey.aws.polly/invalid-sample-rate-exception (portkey.awsgen/json-keys :req-un [] :opt-un [:portkey.aws.polly.invalid-sample-rate-exception/message]))

(clojure.spec.alpha/def :portkey.aws.polly/next-token (clojure.spec.alpha/and clojure.core/string?))

(clojure.spec.alpha/def :portkey.aws.polly/voice-name (clojure.spec.alpha/and clojure.core/string?))

(clojure.spec.alpha/def :portkey.aws.polly/error-message (clojure.spec.alpha/and clojure.core/string?))

(clojure.spec.alpha/def :portkey.aws.polly/voice-list (clojure.spec.alpha/coll-of :portkey.aws.polly/voice :max-count nil))

(clojure.spec.alpha/def :portkey.aws.polly.invalid-next-token-exception/message (clojure.spec.alpha/and :portkey.aws.polly/error-message))
(clojure.spec.alpha/def :portkey.aws.polly/invalid-next-token-exception (portkey.awsgen/json-keys :req-un [] :opt-un [:portkey.aws.polly.invalid-next-token-exception/message]))

(clojure.spec.alpha/def :portkey.aws.polly/list-lexicons-input (portkey.awsgen/json-keys :req-un [] :opt-un [:portkey.aws.polly/NextToken]))

(clojure.spec.alpha/def :portkey.aws.polly/language-name (clojure.spec.alpha/and clojure.core/string?))

(clojure.spec.alpha/def :portkey.aws.polly.unsupported-pls-language-exception/message (clojure.spec.alpha/and :portkey.aws.polly/error-message))
(clojure.spec.alpha/def :portkey.aws.polly/unsupported-pls-language-exception (portkey.awsgen/json-keys :req-un [] :opt-un [:portkey.aws.polly.unsupported-pls-language-exception/message]))

(clojure.spec.alpha/def :portkey.aws.polly/content-type (clojure.spec.alpha/and clojure.core/string?))

(clojure.spec.alpha/def :portkey.aws.polly.get-lexicon-input/name (clojure.spec.alpha/and :portkey.aws.polly/lexicon-name))
(clojure.spec.alpha/def :portkey.aws.polly/get-lexicon-input (portkey.awsgen/json-keys :req-un [:portkey.aws.polly.get-lexicon-input/Name] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.polly/put-lexicon-output (portkey.awsgen/json-keys :req-un [] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.polly/output-format (clojure.spec.alpha/conformer (clojure.core/let [m__30835__auto__ {"json" "json", :json "json", "mp3" "mp3", :mp3 "mp3", "ogg_vorbis" "ogg_vorbis", :ogg-vorbis "ogg_vorbis", "pcm" "pcm", :pcm "pcm"}] (clojure.core/fn [s__30836__auto__] (m__30835__auto__ s__30836__auto__ :clojure.spec.alpha/invalid))) (clojure.core/comp clojure.core/keyword portkey.awsgen/dashed)))

(clojure.spec.alpha/def :portkey.aws.polly/delete-lexicon-output (portkey.awsgen/json-keys :req-un [] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.polly/language-code (clojure.spec.alpha/conformer (clojure.core/let [m__30835__auto__ {"it-IT" "it-IT", :ja-jp "ja-JP", :pt-pt "pt-PT", "de-DE" "de-DE", :en-au "en-AU", :es-es "es-ES", :en-gb "en-GB", :nl-nl "nl-NL", :ro-ro "ro-RO", "en-AU" "en-AU", "en-IN" "en-IN", :fr-fr "fr-FR", "da-DK" "da-DK", "tr-TR" "tr-TR", :it-it "it-IT", "es-US" "es-US", :da-dk "da-DK", :de-de "de-DE", "pt-BR" "pt-BR", :ru-ru "ru-RU", :tr-tr "tr-TR", :pt-br "pt-BR", "nl-NL" "nl-NL", :pl-pl "pl-PL", "fr-CA" "fr-CA", "ja-JP" "ja-JP", :cy-gb "cy-GB", "en-US" "en-US", :nb-no "nb-NO", "cy-GB" "cy-GB", "fr-FR" "fr-FR", "en-GB" "en-GB", "ru-RU" "ru-RU", "ro-RO" "ro-RO", :fr-ca "fr-CA", :sv-se "sv-SE", "es-ES" "es-ES", "en-GB-WLS" "en-GB-WLS", "pt-PT" "pt-PT", :en-in "en-IN", :en-us "en-US", "pl-PL" "pl-PL", "is-IS" "is-IS", "sv-SE" "sv-SE", "nb-NO" "nb-NO", :en-gb-wls "en-GB-WLS", :is-is "is-IS", :es-us "es-US"}] (clojure.core/fn [s__30836__auto__] (m__30835__auto__ s__30836__auto__ :clojure.spec.alpha/invalid))) (clojure.core/comp clojure.core/keyword portkey.awsgen/dashed)))

(clojure.spec.alpha/def :portkey.aws.polly/lexicon-attributes (portkey.awsgen/json-keys :req-un [] :opt-un [:portkey.aws.polly/Alphabet :portkey.aws.polly/LanguageCode :portkey.aws.polly/LastModified :portkey.aws.polly/LexiconArn :portkey.aws.polly/LexemesCount :portkey.aws.polly/Size]))

(clojure.spec.alpha/def :portkey.aws.polly/last-modified clojure.core/inst?)

(clojure.spec.alpha/def :portkey.aws.polly/speech-mark-type-list (clojure.spec.alpha/coll-of :portkey.aws.polly/speech-mark-type :max-count 4))

(clojure.spec.alpha/def :portkey.aws.polly.lexicon-description/name (clojure.spec.alpha/and :portkey.aws.polly/lexicon-name))
(clojure.spec.alpha/def :portkey.aws.polly.lexicon-description/attributes (clojure.spec.alpha/and :portkey.aws.polly/lexicon-attributes))
(clojure.spec.alpha/def :portkey.aws.polly/lexicon-description (portkey.awsgen/json-keys :req-un [] :opt-un [:portkey.aws.polly.lexicon-description/Name :portkey.aws.polly.lexicon-description/Attributes]))

(clojure.spec.alpha/def :portkey.aws.polly/size (clojure.spec.alpha/and clojure.core/int?))

(clojure.spec.alpha/def :portkey.aws.polly/lexicon-content (clojure.spec.alpha/and clojure.core/string?))

(clojure.spec.alpha/def :portkey.aws.polly.lexicon-not-found-exception/message (clojure.spec.alpha/and :portkey.aws.polly/error-message))
(clojure.spec.alpha/def :portkey.aws.polly/lexicon-not-found-exception (portkey.awsgen/json-keys :req-un [] :opt-un [:portkey.aws.polly.lexicon-not-found-exception/message]))

(clojure.spec.alpha/def :portkey.aws.polly.invalid-lexicon-exception/message (clojure.spec.alpha/and :portkey.aws.polly/error-message))
(clojure.spec.alpha/def :portkey.aws.polly/invalid-lexicon-exception (portkey.awsgen/json-keys :req-un [] :opt-un [:portkey.aws.polly.invalid-lexicon-exception/message]))

(clojure.spec.alpha/def :portkey.aws.polly/voice-id (clojure.spec.alpha/conformer (clojure.core/let [m__30835__auto__ {"Filiz" "Filiz", :joey "Joey", "Joanna" "Joanna", "Amy" "Amy", "Marlene" "Marlene", :astrid "Astrid", "Salli" "Salli", :maja "Maja", "Ricardo" "Ricardo", :tatyana "Tatyana", "Mathieu" "Mathieu", "Enrique" "Enrique", :lotte "Lotte", :ewa "Ewa", "Nicole" "Nicole", "Russell" "Russell", :giorgio "Giorgio", "Gwyneth" "Gwyneth", "Conchita" "Conchita", :jan "Jan", :dora "Dora", :justin "Justin", "Joey" "Joey", "Chantal" "Chantal", :russell "Russell", :amy "Amy", "Ines" "Ines", "Hans" "Hans", "Penelope" "Penelope", :conchita "Conchita", "Mizuki" "Mizuki", "Maja" "Maja", "Miguel" "Miguel", "Kendra" "Kendra", "Karl" "Karl", "Mads" "Mads", :gwyneth "Gwyneth", :emma "Emma", "Carla" "Carla", "Geraint" "Geraint", "Astrid" "Astrid", "Celine" "Celine", :maxim "Maxim", "Vicki" "Vicki", "Jan" "Jan", :mads "Mads", :liv "Liv", "Lotte" "Lotte", :celine "Celine", :jacek "Jacek", :vitoria "Vitoria", :miguel "Miguel", "Kimberly" "Kimberly", :filiz "Filiz", "Liv" "Liv", "Brian" "Brian", "Cristiano" "Cristiano", "Ewa" "Ewa", "Maxim" "Maxim", :mathieu "Mathieu", "Vitoria" "Vitoria", :karl "Karl", :salli "Salli", :hans "Hans", "Giorgio" "Giorgio", "Justin" "Justin", :mizuki "Mizuki", "Emma" "Emma", :joanna "Joanna", "Raveena" "Raveena", :ricardo "Ricardo", :vicki "Vicki", "Carmen" "Carmen", "Jacek" "Jacek", :raveena "Raveena", "Naja" "Naja", :penelope "Penelope", :carmen "Carmen", "Ivy" "Ivy", :naja "Naja", :ivy "Ivy", "Tatyana" "Tatyana", :carla "Carla", :chantal "Chantal", "Ruben" "Ruben", :kendra "Kendra", :kimberly "Kimberly", :geraint "Geraint", :nicole "Nicole", :brian "Brian", :marlene "Marlene", :enrique "Enrique", "Dora" "Dora", :ines "Ines", :ruben "Ruben", :cristiano "Cristiano"}] (clojure.core/fn [s__30836__auto__] (m__30835__auto__ s__30836__auto__ :clojure.spec.alpha/invalid))) (clojure.core/comp clojure.core/keyword portkey.awsgen/dashed)))

(clojure.spec.alpha/def :portkey.aws.polly.synthesize-speech-input/lexicon-names (clojure.spec.alpha/and :portkey.aws.polly/lexicon-name-list))
(clojure.spec.alpha/def :portkey.aws.polly.synthesize-speech-input/speech-mark-types (clojure.spec.alpha/and :portkey.aws.polly/speech-mark-type-list))
(clojure.spec.alpha/def :portkey.aws.polly/synthesize-speech-input (portkey.awsgen/json-keys :req-un [:portkey.aws.polly/OutputFormat :portkey.aws.polly/Text :portkey.aws.polly/VoiceId] :opt-un [:portkey.aws.polly.synthesize-speech-input/LexiconNames :portkey.aws.polly/SampleRate :portkey.aws.polly.synthesize-speech-input/SpeechMarkTypes :portkey.aws.polly/TextType]))

(clojure.spec.alpha/def :portkey.aws.polly/text (clojure.spec.alpha/and clojure.core/string?))

(clojure.spec.alpha/def :portkey.aws.polly/audio-stream (clojure.spec.alpha/and clojure.core/bytes? (clojure.spec.alpha/conformer portkey.awsgen/base64-encode portkey.awsgen/base64-decode)))

(clojure.spec.alpha/def :portkey.aws.polly/describe-voices-input (portkey.awsgen/json-keys :req-un [] :opt-un [:portkey.aws.polly/LanguageCode :portkey.aws.polly/NextToken]))

(clojure.spec.alpha/def :portkey.aws.polly.lexicon-size-exceeded-exception/message (clojure.spec.alpha/and :portkey.aws.polly/error-message))
(clojure.spec.alpha/def :portkey.aws.polly/lexicon-size-exceeded-exception (portkey.awsgen/json-keys :req-un [] :opt-un [:portkey.aws.polly.lexicon-size-exceeded-exception/message]))

(clojure.spec.alpha/def :portkey.aws.polly/alphabet (clojure.spec.alpha/and clojure.core/string?))

(clojure.spec.alpha/def :portkey.aws.polly.voice/id (clojure.spec.alpha/and :portkey.aws.polly/voice-id))
(clojure.spec.alpha/def :portkey.aws.polly.voice/name (clojure.spec.alpha/and :portkey.aws.polly/voice-name))
(clojure.spec.alpha/def :portkey.aws.polly/voice (portkey.awsgen/json-keys :req-un [] :opt-un [:portkey.aws.polly/Gender :portkey.aws.polly.voice/Id :portkey.aws.polly/LanguageCode :portkey.aws.polly/LanguageName :portkey.aws.polly.voice/Name]))

(clojure.spec.alpha/def :portkey.aws.polly.marks-not-supported-for-format-exception/message (clojure.spec.alpha/and :portkey.aws.polly/error-message))
(clojure.spec.alpha/def :portkey.aws.polly/marks-not-supported-for-format-exception (portkey.awsgen/json-keys :req-un [] :opt-un [:portkey.aws.polly.marks-not-supported-for-format-exception/message]))

(clojure.spec.alpha/def :portkey.aws.polly/speech-mark-type (clojure.spec.alpha/conformer (clojure.core/let [m__30835__auto__ {"sentence" "sentence", :sentence "sentence", "ssml" "ssml", :ssml "ssml", "viseme" "viseme", :viseme "viseme", "word" "word", :word "word"}] (clojure.core/fn [s__30836__auto__] (m__30835__auto__ s__30836__auto__ :clojure.spec.alpha/invalid))) (clojure.core/comp clojure.core/keyword portkey.awsgen/dashed)))

(clojure.spec.alpha/def :portkey.aws.polly/lexicon-description-list (clojure.spec.alpha/coll-of :portkey.aws.polly/lexicon-description :max-count nil))

(clojure.core/defn delete-lexicon ([input__33752__auto__] (delete-lexicon input__33752__auto__ portkey.aws/*http-client*)) ([input34780 http-client__33753__auto__] (clojure.core/let [req__33754__auto__ (clojure.core/-> {:method "DELETE", :headers {"content-type" "application/json"}, :url "https://lambda.eu-central-1.amazonaws.com/v1/lexicons/{LexiconName}", :body (clojure.spec.alpha/unform :portkey.aws.polly/DeleteLexiconInput input34780)} (portkey.awsgen/params-to-header) (portkey.awsgen/params-to-uri ["LexiconName" "Name"]) (portkey.awsgen/params-to-querystring) (portkey.awsgen/params-to-payload nil) (clojure.core/update :body (fn* [p1__33751__33755__auto__] (clojure.core/some-> p1__33751__33755__auto__ cheshire.core/generate-string))))] (http-client__33753__auto__ {:method "DELETE", :headers {"content-type" "application/json"}, :url "https://lambda.eu-central-1.amazonaws.com/v1/lexicons/{LexiconName}", :body body__33756__auto__} (clojure.core/fn [response34779] (clojure.core/let [errors__33757__auto__ {"LexiconNotFoundException" :portkey.aws.polly/lexicon-not-found-exception, "ServiceFailureException" :portkey.aws.polly/service-failure-exception}] (if (clojure.core/= 200 (:status response34779)) (clojure.spec.alpha/unform :portkey.aws.polly/delete-lexicon-output (:body response34779)) (clojure.core/if-some [[type__33758__auto__ spec__33759__auto__] (clojure.core/find errors__33757__auto__ (clojure.core/get-in response34779 [:headers "x-amzn-ErrorType"]))] (clojure.core/let [m__33760__auto__ (clojure.spec.alpha/unform spec__33759__auto__ (cheshire.core/parse-string (:body response34779)))] (throw (clojure.core/ex-info (clojure.core/str type__33758__auto__ ": " (:message m__33760__auto__)) m__33760__auto__))) (throw (clojure.core/ex-info "Unexpected response" {:response response34779}))))))))))

(clojure.core/defn describe-voices ([input__33752__auto__] (describe-voices input__33752__auto__ portkey.aws/*http-client*)) ([input34782 http-client__33753__auto__] (clojure.core/let [req__33754__auto__ (clojure.core/-> {:method "GET", :headers {"content-type" "application/json"}, :url "https://lambda.eu-central-1.amazonaws.com/v1/voices", :body (clojure.spec.alpha/unform :portkey.aws.polly/DescribeVoicesInput input34782)} (portkey.awsgen/params-to-header) (portkey.awsgen/params-to-uri) (portkey.awsgen/params-to-querystring ["LanguageCode" "LanguageCode"] ["NextToken" "NextToken"]) (portkey.awsgen/params-to-payload nil) (clojure.core/update :body (fn* [p1__33751__33755__auto__] (clojure.core/some-> p1__33751__33755__auto__ cheshire.core/generate-string))))] (http-client__33753__auto__ {:method "GET", :headers {"content-type" "application/json"}, :url "https://lambda.eu-central-1.amazonaws.com/v1/voices", :body body__33756__auto__} (clojure.core/fn [response34781] (clojure.core/let [errors__33757__auto__ {"InvalidNextTokenException" :portkey.aws.polly/invalid-next-token-exception, "ServiceFailureException" :portkey.aws.polly/service-failure-exception}] (if (clojure.core/= 200 (:status response34781)) (clojure.spec.alpha/unform :portkey.aws.polly/describe-voices-output (:body response34781)) (clojure.core/if-some [[type__33758__auto__ spec__33759__auto__] (clojure.core/find errors__33757__auto__ (clojure.core/get-in response34781 [:headers "x-amzn-ErrorType"]))] (clojure.core/let [m__33760__auto__ (clojure.spec.alpha/unform spec__33759__auto__ (cheshire.core/parse-string (:body response34781)))] (throw (clojure.core/ex-info (clojure.core/str type__33758__auto__ ": " (:message m__33760__auto__)) m__33760__auto__))) (throw (clojure.core/ex-info "Unexpected response" {:response response34781}))))))))))

(clojure.core/defn get-lexicon ([input__33752__auto__] (get-lexicon input__33752__auto__ portkey.aws/*http-client*)) ([input34784 http-client__33753__auto__] (clojure.core/let [req__33754__auto__ (clojure.core/-> {:method "GET", :headers {"content-type" "application/json"}, :url "https://lambda.eu-central-1.amazonaws.com/v1/lexicons/{LexiconName}", :body (clojure.spec.alpha/unform :portkey.aws.polly/GetLexiconInput input34784)} (portkey.awsgen/params-to-header) (portkey.awsgen/params-to-uri ["LexiconName" "Name"]) (portkey.awsgen/params-to-querystring) (portkey.awsgen/params-to-payload nil) (clojure.core/update :body (fn* [p1__33751__33755__auto__] (clojure.core/some-> p1__33751__33755__auto__ cheshire.core/generate-string))))] (http-client__33753__auto__ {:method "GET", :headers {"content-type" "application/json"}, :url "https://lambda.eu-central-1.amazonaws.com/v1/lexicons/{LexiconName}", :body body__33756__auto__} (clojure.core/fn [response34783] (clojure.core/let [errors__33757__auto__ {"LexiconNotFoundException" :portkey.aws.polly/lexicon-not-found-exception, "ServiceFailureException" :portkey.aws.polly/service-failure-exception}] (if (clojure.core/= 200 (:status response34783)) (clojure.spec.alpha/unform :portkey.aws.polly/get-lexicon-output (:body response34783)) (clojure.core/if-some [[type__33758__auto__ spec__33759__auto__] (clojure.core/find errors__33757__auto__ (clojure.core/get-in response34783 [:headers "x-amzn-ErrorType"]))] (clojure.core/let [m__33760__auto__ (clojure.spec.alpha/unform spec__33759__auto__ (cheshire.core/parse-string (:body response34783)))] (throw (clojure.core/ex-info (clojure.core/str type__33758__auto__ ": " (:message m__33760__auto__)) m__33760__auto__))) (throw (clojure.core/ex-info "Unexpected response" {:response response34783}))))))))))

(clojure.core/defn list-lexicons ([input__33752__auto__] (list-lexicons input__33752__auto__ portkey.aws/*http-client*)) ([input34786 http-client__33753__auto__] (clojure.core/let [req__33754__auto__ (clojure.core/-> {:method "GET", :headers {"content-type" "application/json"}, :url "https://lambda.eu-central-1.amazonaws.com/v1/lexicons", :body (clojure.spec.alpha/unform :portkey.aws.polly/ListLexiconsInput input34786)} (portkey.awsgen/params-to-header) (portkey.awsgen/params-to-uri) (portkey.awsgen/params-to-querystring ["NextToken" "NextToken"]) (portkey.awsgen/params-to-payload nil) (clojure.core/update :body (fn* [p1__33751__33755__auto__] (clojure.core/some-> p1__33751__33755__auto__ cheshire.core/generate-string))))] (http-client__33753__auto__ {:method "GET", :headers {"content-type" "application/json"}, :url "https://lambda.eu-central-1.amazonaws.com/v1/lexicons", :body body__33756__auto__} (clojure.core/fn [response34785] (clojure.core/let [errors__33757__auto__ {"InvalidNextTokenException" :portkey.aws.polly/invalid-next-token-exception, "ServiceFailureException" :portkey.aws.polly/service-failure-exception}] (if (clojure.core/= 200 (:status response34785)) (clojure.spec.alpha/unform :portkey.aws.polly/list-lexicons-output (:body response34785)) (clojure.core/if-some [[type__33758__auto__ spec__33759__auto__] (clojure.core/find errors__33757__auto__ (clojure.core/get-in response34785 [:headers "x-amzn-ErrorType"]))] (clojure.core/let [m__33760__auto__ (clojure.spec.alpha/unform spec__33759__auto__ (cheshire.core/parse-string (:body response34785)))] (throw (clojure.core/ex-info (clojure.core/str type__33758__auto__ ": " (:message m__33760__auto__)) m__33760__auto__))) (throw (clojure.core/ex-info "Unexpected response" {:response response34785}))))))))))

(clojure.core/defn put-lexicon ([input__33752__auto__] (put-lexicon input__33752__auto__ portkey.aws/*http-client*)) ([input34788 http-client__33753__auto__] (clojure.core/let [req__33754__auto__ (clojure.core/-> {:method "PUT", :headers {"content-type" "application/json"}, :url "https://lambda.eu-central-1.amazonaws.com/v1/lexicons/{LexiconName}", :body (clojure.spec.alpha/unform :portkey.aws.polly/PutLexiconInput input34788)} (portkey.awsgen/params-to-header) (portkey.awsgen/params-to-uri ["LexiconName" "Name"]) (portkey.awsgen/params-to-querystring) (portkey.awsgen/params-to-payload nil) (clojure.core/update :body (fn* [p1__33751__33755__auto__] (clojure.core/some-> p1__33751__33755__auto__ cheshire.core/generate-string))))] (http-client__33753__auto__ {:method "PUT", :headers {"content-type" "application/json"}, :url "https://lambda.eu-central-1.amazonaws.com/v1/lexicons/{LexiconName}", :body body__33756__auto__} (clojure.core/fn [response34787] (clojure.core/let [errors__33757__auto__ {"InvalidLexiconException" :portkey.aws.polly/invalid-lexicon-exception, "UnsupportedPlsAlphabetException" :portkey.aws.polly/unsupported-pls-alphabet-exception, "UnsupportedPlsLanguageException" :portkey.aws.polly/unsupported-pls-language-exception, "LexiconSizeExceededException" :portkey.aws.polly/lexicon-size-exceeded-exception, "MaxLexemeLengthExceededException" :portkey.aws.polly/max-lexeme-length-exceeded-exception, "MaxLexiconsNumberExceededException" :portkey.aws.polly/max-lexicons-number-exceeded-exception, "ServiceFailureException" :portkey.aws.polly/service-failure-exception}] (if (clojure.core/= 200 (:status response34787)) (clojure.spec.alpha/unform :portkey.aws.polly/put-lexicon-output (:body response34787)) (clojure.core/if-some [[type__33758__auto__ spec__33759__auto__] (clojure.core/find errors__33757__auto__ (clojure.core/get-in response34787 [:headers "x-amzn-ErrorType"]))] (clojure.core/let [m__33760__auto__ (clojure.spec.alpha/unform spec__33759__auto__ (cheshire.core/parse-string (:body response34787)))] (throw (clojure.core/ex-info (clojure.core/str type__33758__auto__ ": " (:message m__33760__auto__)) m__33760__auto__))) (throw (clojure.core/ex-info "Unexpected response" {:response response34787}))))))))))

(clojure.core/defn synthesize-speech ([input__33752__auto__] (synthesize-speech input__33752__auto__ portkey.aws/*http-client*)) ([input34790 http-client__33753__auto__] (clojure.core/let [req__33754__auto__ (clojure.core/-> {:method "POST", :headers {"content-type" "application/json"}, :url "https://lambda.eu-central-1.amazonaws.com/v1/speech", :body (clojure.spec.alpha/unform :portkey.aws.polly/SynthesizeSpeechInput input34790)} (portkey.awsgen/params-to-header) (portkey.awsgen/params-to-uri) (portkey.awsgen/params-to-querystring) (portkey.awsgen/params-to-payload nil) (clojure.core/update :body (fn* [p1__33751__33755__auto__] (clojure.core/some-> p1__33751__33755__auto__ cheshire.core/generate-string))))] (http-client__33753__auto__ {:method "POST", :headers {"content-type" "application/json"}, :url "https://lambda.eu-central-1.amazonaws.com/v1/speech", :body body__33756__auto__} (clojure.core/fn [response34789] (clojure.core/let [errors__33757__auto__ {"TextLengthExceededException" :portkey.aws.polly/text-length-exceeded-exception, "InvalidSampleRateException" :portkey.aws.polly/invalid-sample-rate-exception, "InvalidSsmlException" :portkey.aws.polly/invalid-ssml-exception, "LexiconNotFoundException" :portkey.aws.polly/lexicon-not-found-exception, "ServiceFailureException" :portkey.aws.polly/service-failure-exception, "MarksNotSupportedForFormatException" :portkey.aws.polly/marks-not-supported-for-format-exception, "SsmlMarksNotSupportedForTextTypeException" :portkey.aws.polly/ssml-marks-not-supported-for-text-type-exception}] (if (clojure.core/= 200 (:status response34789)) (clojure.spec.alpha/unform :portkey.aws.polly/synthesize-speech-output (:body response34789)) (clojure.core/if-some [[type__33758__auto__ spec__33759__auto__] (clojure.core/find errors__33757__auto__ (clojure.core/get-in response34789 [:headers "x-amzn-ErrorType"]))] (clojure.core/let [m__33760__auto__ (clojure.spec.alpha/unform spec__33759__auto__ (cheshire.core/parse-string (:body response34789)))] (throw (clojure.core/ex-info (clojure.core/str type__33758__auto__ ": " (:message m__33760__auto__)) m__33760__auto__))) (throw (clojure.core/ex-info "Unexpected response" {:response response34789}))))))))))
