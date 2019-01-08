(ns portkey.aws.polly (:require [portkey.aws]))

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

(clojure.core/declare ser-sample-rate)

(clojure.core/declare ser-lexicon-name-list)

(clojure.core/declare ser-output-s-3-bucket-name)

(clojure.core/declare ser-task-id)

(clojure.core/declare ser-text-type)

(clojure.core/declare ser-lexicon-name)

(clojure.core/declare ser-next-token)

(clojure.core/declare ser-output-format)

(clojure.core/declare ser-language-code)

(clojure.core/declare ser-speech-mark-type-list)

(clojure.core/declare ser-sns-topic-arn)

(clojure.core/declare ser-lexicon-content)

(clojure.core/declare ser-include-additional-language-codes)

(clojure.core/declare ser-output-s-3-key-prefix)

(clojure.core/declare ser-voice-id)

(clojure.core/declare ser-text)

(clojure.core/declare ser-max-results)

(clojure.core/declare ser-speech-mark-type)

(clojure.core/declare ser-task-status)

(clojure.core/defn- ser-sample-rate [input] #:http.request.field{:value input, :shape "SampleRate"})

(clojure.core/defn- ser-lexicon-name-list [input] #:http.request.field{:value (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (clojure.core/merge (ser-lexicon-name coll) #:http.request.field{:shape "LexiconName"}))) input), :shape "LexiconNameList", :type "list", :max 5})

(clojure.core/defn- ser-output-s-3-bucket-name [input] #:http.request.field{:value input, :shape "OutputS3BucketName"})

(clojure.core/defn- ser-task-id [input] #:http.request.field{:value input, :shape "TaskId"})

(clojure.core/defn- ser-text-type [input] #:http.request.field{:value (clojure.core/get {"ssml" "ssml", :ssml "ssml", "text" "text", :text "text"} input), :shape "TextType"})

(clojure.core/defn- ser-lexicon-name [input] #:http.request.field{:value input, :shape "LexiconName"})

(clojure.core/defn- ser-next-token [input] #:http.request.field{:value input, :shape "NextToken"})

(clojure.core/defn- ser-output-format [input] #:http.request.field{:value (clojure.core/get {"json" "json", :json "json", "mp3" "mp3", :mp-3 "mp3", "ogg_vorbis" "ogg_vorbis", :ogg-vorbis "ogg_vorbis", "pcm" "pcm", :pcm "pcm"} input), :shape "OutputFormat"})

(clojure.core/defn- ser-language-code [input] #:http.request.field{:value (clojure.core/get {"it-IT" "it-IT", :ja-jp "ja-JP", :pt-pt "pt-PT", "de-DE" "de-DE", :en-au "en-AU", :ko-kr "ko-KR", :es-es "es-ES", :en-gb "en-GB", :nl-nl "nl-NL", :ro-ro "ro-RO", "en-AU" "en-AU", :hi-in "hi-IN", "en-IN" "en-IN", :fr-fr "fr-FR", :en-gbwls "en-GB-WLS", "da-DK" "da-DK", "tr-TR" "tr-TR", :it-it "it-IT", "es-US" "es-US", :da-dk "da-DK", :de-de "de-DE", "pt-BR" "pt-BR", :cmn-cn "cmn-CN", "cmn-CN" "cmn-CN", :ru-ru "ru-RU", :tr-tr "tr-TR", :pt-br "pt-BR", "hi-IN" "hi-IN", "nl-NL" "nl-NL", :pl-pl "pl-PL", "fr-CA" "fr-CA", "ja-JP" "ja-JP", :cy-gb "cy-GB", "en-US" "en-US", :nb-no "nb-NO", "cy-GB" "cy-GB", "fr-FR" "fr-FR", "en-GB" "en-GB", "ru-RU" "ru-RU", "ro-RO" "ro-RO", :fr-ca "fr-CA", :sv-se "sv-SE", "ko-KR" "ko-KR", "es-ES" "es-ES", "en-GB-WLS" "en-GB-WLS", "pt-PT" "pt-PT", :en-in "en-IN", :en-us "en-US", "pl-PL" "pl-PL", "is-IS" "is-IS", "sv-SE" "sv-SE", "nb-NO" "nb-NO", :is-is "is-IS", :es-us "es-US"} input), :shape "LanguageCode"})

(clojure.core/defn- ser-speech-mark-type-list [input] #:http.request.field{:value (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (clojure.core/merge (ser-speech-mark-type coll) #:http.request.field{:shape "SpeechMarkType"}))) input), :shape "SpeechMarkTypeList", :type "list", :max 4})

(clojure.core/defn- ser-sns-topic-arn [input] #:http.request.field{:value input, :shape "SnsTopicArn"})

(clojure.core/defn- ser-lexicon-content [input] #:http.request.field{:value input, :shape "LexiconContent"})

(clojure.core/defn- ser-include-additional-language-codes [input] #:http.request.field{:value input, :shape "IncludeAdditionalLanguageCodes"})

(clojure.core/defn- ser-output-s-3-key-prefix [input] #:http.request.field{:value input, :shape "OutputS3KeyPrefix"})

(clojure.core/defn- ser-voice-id [input] #:http.request.field{:value (clojure.core/get {"Filiz" "Filiz", :joey "Joey", "Joanna" "Joanna", :lea "Lea", "Amy" "Amy", "Marlene" "Marlene", :astrid "Astrid", "Salli" "Salli", :zhiyu "Zhiyu", :maja "Maja", :matthew "Matthew", "Ricardo" "Ricardo", :tatyana "Tatyana", "Mathieu" "Mathieu", "Enrique" "Enrique", :lotte "Lotte", :ewa "Ewa", "Nicole" "Nicole", "Russell" "Russell", :giorgio "Giorgio", "Gwyneth" "Gwyneth", :seoyeon "Seoyeon", "Aditi" "Aditi", "Conchita" "Conchita", :jan "Jan", :dora "Dora", :justin "Justin", "Joey" "Joey", "Chantal" "Chantal", :russell "Russell", :amy "Amy", "Ines" "Ines", "Hans" "Hans", "Penelope" "Penelope", :conchita "Conchita", "Mizuki" "Mizuki", "Takumi" "Takumi", "Maja" "Maja", "Miguel" "Miguel", "Lea" "Lea", "Kendra" "Kendra", "Karl" "Karl", "Mads" "Mads", :gwyneth "Gwyneth", :emma "Emma", "Carla" "Carla", "Geraint" "Geraint", "Astrid" "Astrid", "Celine" "Celine", :maxim "Maxim", "Seoyeon" "Seoyeon", "Vicki" "Vicki", :aditi "Aditi", "Matthew" "Matthew", "Jan" "Jan", :mads "Mads", :liv "Liv", "Lotte" "Lotte", :celine "Celine", :jacek "Jacek", :vitoria "Vitoria", :miguel "Miguel", "Kimberly" "Kimberly", :filiz "Filiz", "Liv" "Liv", "Brian" "Brian", "Cristiano" "Cristiano", "Ewa" "Ewa", "Maxim" "Maxim", :mathieu "Mathieu", "Vitoria" "Vitoria", :karl "Karl", :salli "Salli", :hans "Hans", "Giorgio" "Giorgio", "Justin" "Justin", :mizuki "Mizuki", "Emma" "Emma", :joanna "Joanna", "Raveena" "Raveena", :ricardo "Ricardo", :vicki "Vicki", "Carmen" "Carmen", "Jacek" "Jacek", :raveena "Raveena", "Naja" "Naja", :takumi "Takumi", :penelope "Penelope", :carmen "Carmen", "Ivy" "Ivy", :naja "Naja", :ivy "Ivy", "Tatyana" "Tatyana", :carla "Carla", "Zhiyu" "Zhiyu", :chantal "Chantal", "Ruben" "Ruben", :kendra "Kendra", :kimberly "Kimberly", :geraint "Geraint", :nicole "Nicole", :brian "Brian", :marlene "Marlene", :enrique "Enrique", "Dora" "Dora", :ines "Ines", :ruben "Ruben", :cristiano "Cristiano"} input), :shape "VoiceId"})

(clojure.core/defn- ser-text [input] #:http.request.field{:value input, :shape "Text"})

(clojure.core/defn- ser-max-results [input] #:http.request.field{:value input, :shape "MaxResults"})

(clojure.core/defn- ser-speech-mark-type [input] #:http.request.field{:value (clojure.core/get {"sentence" "sentence", :sentence "sentence", "ssml" "ssml", :ssml "ssml", "viseme" "viseme", :viseme "viseme", "word" "word", :word "word"} input), :shape "SpeechMarkType"})

(clojure.core/defn- ser-task-status [input] #:http.request.field{:value (clojure.core/get {"scheduled" "scheduled", :scheduled "scheduled", "inProgress" "inProgress", :in-progress "inProgress", "completed" "completed", :completed "completed", "failed" "failed", :failed "failed"} input), :shape "TaskStatus"})

(clojure.core/defn- req-get-speech-synthesis-task-input [input] (clojure.core/cond-> #:http.request.configuration{:uri [(clojure.core/into (ser-task-id (input :task-id)) #:http.request.field{:name "TaskId", :shape "TaskId", :location "uri", :location-name "TaskId"})]}))

(clojure.core/defn- req-start-speech-synthesis-task-input [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (ser-output-format (input :output-format)) #:http.request.field{:name "OutputFormat", :shape "OutputFormat"}) (clojure.core/into (ser-output-s-3-bucket-name (input :output-s-3-bucket-name)) #:http.request.field{:name "OutputS3BucketName", :shape "OutputS3BucketName"}) (clojure.core/into (ser-text (input :text)) #:http.request.field{:name "Text", :shape "Text"}) (clojure.core/into (ser-voice-id (input :voice-id)) #:http.request.field{:name "VoiceId", :shape "VoiceId"})]} (clojure.core/contains? input :sample-rate) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-sample-rate (input :sample-rate)) #:http.request.field{:name "SampleRate", :shape "SampleRate"})) (clojure.core/contains? input :text-type) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-text-type (input :text-type)) #:http.request.field{:name "TextType", :shape "TextType"})) (clojure.core/contains? input :speech-mark-types) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-speech-mark-type-list (input :speech-mark-types)) #:http.request.field{:name "SpeechMarkTypes", :shape "SpeechMarkTypeList"})) (clojure.core/contains? input :lexicon-names) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-lexicon-name-list (input :lexicon-names)) #:http.request.field{:name "LexiconNames", :shape "LexiconNameList"})) (clojure.core/contains? input :language-code) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-language-code (input :language-code)) #:http.request.field{:name "LanguageCode", :shape "LanguageCode"})) (clojure.core/contains? input :sns-topic-arn) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-sns-topic-arn (input :sns-topic-arn)) #:http.request.field{:name "SnsTopicArn", :shape "SnsTopicArn"})) (clojure.core/contains? input :output-s-3-key-prefix) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-output-s-3-key-prefix (input :output-s-3-key-prefix)) #:http.request.field{:name "OutputS3KeyPrefix", :shape "OutputS3KeyPrefix"}))))

(clojure.core/defn- req-delete-lexicon-input [input] (clojure.core/cond-> #:http.request.configuration{:uri [(clojure.core/into (ser-lexicon-name (input :name)) #:http.request.field{:name "Name", :shape "LexiconName", :location "uri", :location-name "LexiconName"})]}))

(clojure.core/defn- req-put-lexicon-input [input] (clojure.core/cond-> #:http.request.configuration{:uri [(clojure.core/into (ser-lexicon-name (input :name)) #:http.request.field{:name "Name", :shape "LexiconName", :location "uri", :location-name "LexiconName"})], :body [(clojure.core/into (ser-lexicon-content (input :content)) #:http.request.field{:name "Content", :shape "LexiconContent"})]}))

(clojure.core/defn- req-list-lexicons-input [input] (clojure.core/cond-> {} (clojure.core/contains? input :next-token) (clojure.core/update-in [:http.request.configuration/querystring] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-next-token (input :next-token)) #:http.request.field{:name "NextToken", :shape "NextToken", :location "querystring", :location-name "NextToken"}))))

(clojure.core/defn- req-get-lexicon-input [input] (clojure.core/cond-> #:http.request.configuration{:uri [(clojure.core/into (ser-lexicon-name (input :name)) #:http.request.field{:name "Name", :shape "LexiconName", :location "uri", :location-name "LexiconName"})]}))

(clojure.core/defn- req-list-speech-synthesis-tasks-input [input] (clojure.core/cond-> {} (clojure.core/contains? input :max-results) (clojure.core/update-in [:http.request.configuration/querystring] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-max-results (input :max-results)) #:http.request.field{:name "MaxResults", :shape "MaxResults", :location "querystring", :location-name "MaxResults"})) (clojure.core/contains? input :next-token) (clojure.core/update-in [:http.request.configuration/querystring] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-next-token (input :next-token)) #:http.request.field{:name "NextToken", :shape "NextToken", :location "querystring", :location-name "NextToken"})) (clojure.core/contains? input :status) (clojure.core/update-in [:http.request.configuration/querystring] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-task-status (input :status)) #:http.request.field{:name "Status", :shape "TaskStatus", :location "querystring", :location-name "Status"}))))

(clojure.core/defn- req-synthesize-speech-input [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (ser-output-format (input :output-format)) #:http.request.field{:name "OutputFormat", :shape "OutputFormat"}) (clojure.core/into (ser-text (input :text)) #:http.request.field{:name "Text", :shape "Text"}) (clojure.core/into (ser-voice-id (input :voice-id)) #:http.request.field{:name "VoiceId", :shape "VoiceId"})]} (clojure.core/contains? input :lexicon-names) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-lexicon-name-list (input :lexicon-names)) #:http.request.field{:name "LexiconNames", :shape "LexiconNameList"})) (clojure.core/contains? input :sample-rate) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-sample-rate (input :sample-rate)) #:http.request.field{:name "SampleRate", :shape "SampleRate"})) (clojure.core/contains? input :speech-mark-types) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-speech-mark-type-list (input :speech-mark-types)) #:http.request.field{:name "SpeechMarkTypes", :shape "SpeechMarkTypeList"})) (clojure.core/contains? input :text-type) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-text-type (input :text-type)) #:http.request.field{:name "TextType", :shape "TextType"})) (clojure.core/contains? input :language-code) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-language-code (input :language-code)) #:http.request.field{:name "LanguageCode", :shape "LanguageCode"}))))

(clojure.core/defn- req-describe-voices-input [input] (clojure.core/cond-> {} (clojure.core/contains? input :language-code) (clojure.core/update-in [:http.request.configuration/querystring] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-language-code (input :language-code)) #:http.request.field{:name "LanguageCode", :shape "LanguageCode", :location "querystring", :location-name "LanguageCode"})) (clojure.core/contains? input :include-additional-language-codes) (clojure.core/update-in [:http.request.configuration/querystring] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-include-additional-language-codes (input :include-additional-language-codes)) #:http.request.field{:name "IncludeAdditionalLanguageCodes", :shape "IncludeAdditionalLanguageCodes", :location "querystring", :location-name "IncludeAdditionalLanguageCodes"})) (clojure.core/contains? input :next-token) (clojure.core/update-in [:http.request.configuration/querystring] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-next-token (input :next-token)) #:http.request.field{:name "NextToken", :shape "NextToken", :location "querystring", :location-name "NextToken"}))))

(clojure.spec.alpha/def :portkey.aws.polly.list-lexicons-output/lexicons (clojure.spec.alpha/and :portkey.aws.polly/lexicon-description-list))
(clojure.spec.alpha/def :portkey.aws.polly/list-lexicons-output (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.polly.list-lexicons-output/lexicons :portkey.aws.polly/next-token]))

(clojure.spec.alpha/def :portkey.aws.polly/get-speech-synthesis-task-input (clojure.spec.alpha/keys :req-un [:portkey.aws.polly/task-id] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.polly.max-lexeme-length-exceeded-exception/message (clojure.spec.alpha/and :portkey.aws.polly/error-message))
(clojure.spec.alpha/def :portkey.aws.polly/max-lexeme-length-exceeded-exception (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.polly.max-lexeme-length-exceeded-exception/message]))

(clojure.spec.alpha/def :portkey.aws.polly/lexicon-arn (clojure.spec.alpha/and clojure.core/string?))

(clojure.spec.alpha/def :portkey.aws.polly.invalid-ssml-exception/message (clojure.spec.alpha/and :portkey.aws.polly/error-message))
(clojure.spec.alpha/def :portkey.aws.polly/invalid-ssml-exception (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.polly.invalid-ssml-exception/message]))

(clojure.spec.alpha/def :portkey.aws.polly.unsupported-pls-alphabet-exception/message (clojure.spec.alpha/and :portkey.aws.polly/error-message))
(clojure.spec.alpha/def :portkey.aws.polly/unsupported-pls-alphabet-exception (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.polly.unsupported-pls-alphabet-exception/message]))

(clojure.spec.alpha/def :portkey.aws.polly.invalid-sns-topic-arn-exception/message (clojure.spec.alpha/and :portkey.aws.polly/error-message))
(clojure.spec.alpha/def :portkey.aws.polly/invalid-sns-topic-arn-exception (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.polly.invalid-sns-topic-arn-exception/message]))

(clojure.spec.alpha/def :portkey.aws.polly/list-speech-synthesis-tasks-output (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.polly/next-token :portkey.aws.polly/synthesis-tasks]))

(clojure.spec.alpha/def :portkey.aws.polly.start-speech-synthesis-task-input/speech-mark-types (clojure.spec.alpha/and :portkey.aws.polly/speech-mark-type-list))
(clojure.spec.alpha/def :portkey.aws.polly.start-speech-synthesis-task-input/lexicon-names (clojure.spec.alpha/and :portkey.aws.polly/lexicon-name-list))
(clojure.spec.alpha/def :portkey.aws.polly/start-speech-synthesis-task-input (clojure.spec.alpha/keys :req-un [:portkey.aws.polly/output-format :portkey.aws.polly/output-s-3-bucket-name :portkey.aws.polly/text :portkey.aws.polly/voice-id] :opt-un [:portkey.aws.polly/sample-rate :portkey.aws.polly/text-type :portkey.aws.polly.start-speech-synthesis-task-input/speech-mark-types :portkey.aws.polly.start-speech-synthesis-task-input/lexicon-names :portkey.aws.polly/language-code :portkey.aws.polly/sns-topic-arn :portkey.aws.polly/output-s-3-key-prefix]))

(clojure.spec.alpha/def :portkey.aws.polly/get-lexicon-output (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.polly/lexicon :portkey.aws.polly/lexicon-attributes]))

(clojure.spec.alpha/def :portkey.aws.polly.delete-lexicon-input/name (clojure.spec.alpha/and :portkey.aws.polly/lexicon-name))
(clojure.spec.alpha/def :portkey.aws.polly/delete-lexicon-input (clojure.spec.alpha/keys :req-un [:portkey.aws.polly.delete-lexicon-input/name] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.polly.describe-voices-output/voices (clojure.spec.alpha/and :portkey.aws.polly/voice-list))
(clojure.spec.alpha/def :portkey.aws.polly/describe-voices-output (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.polly.describe-voices-output/voices :portkey.aws.polly/next-token]))

(clojure.spec.alpha/def :portkey.aws.polly.ssml-marks-not-supported-for-text-type-exception/message (clojure.spec.alpha/and :portkey.aws.polly/error-message))
(clojure.spec.alpha/def :portkey.aws.polly/ssml-marks-not-supported-for-text-type-exception (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.polly.ssml-marks-not-supported-for-text-type-exception/message]))

(clojure.spec.alpha/def :portkey.aws.polly.max-lexicons-number-exceeded-exception/message (clojure.spec.alpha/and :portkey.aws.polly/error-message))
(clojure.spec.alpha/def :portkey.aws.polly/max-lexicons-number-exceeded-exception (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.polly.max-lexicons-number-exceeded-exception/message]))

(clojure.spec.alpha/def :portkey.aws.polly/sample-rate (clojure.spec.alpha/and clojure.core/string?))

(clojure.spec.alpha/def :portkey.aws.polly/request-characters clojure.core/int?)

(clojure.spec.alpha/def :portkey.aws.polly/lexicon-name-list (clojure.spec.alpha/coll-of :portkey.aws.polly/lexicon-name :max-count 5))

(clojure.spec.alpha/def :portkey.aws.polly/synthesize-speech-output (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.polly/audio-stream :portkey.aws.polly/content-type :portkey.aws.polly/request-characters]))

(clojure.spec.alpha/def :portkey.aws.polly.invalid-s-3-bucket-exception/message (clojure.spec.alpha/and :portkey.aws.polly/error-message))
(clojure.spec.alpha/def :portkey.aws.polly/invalid-s-3-bucket-exception (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.polly.invalid-s-3-bucket-exception/message]))

(clojure.spec.alpha/def :portkey.aws.polly.service-failure-exception/message (clojure.spec.alpha/and :portkey.aws.polly/error-message))
(clojure.spec.alpha/def :portkey.aws.polly/service-failure-exception (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.polly.service-failure-exception/message]))

(clojure.spec.alpha/def :portkey.aws.polly/output-s-3-bucket-name (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__42949__auto__] (clojure.core/re-matches #"^[a-z0-9][\.\-a-z0-9]{1,61}[a-z0-9]$" s__42949__auto__))))

(clojure.spec.alpha/def :portkey.aws.polly.put-lexicon-input/name (clojure.spec.alpha/and :portkey.aws.polly/lexicon-name))
(clojure.spec.alpha/def :portkey.aws.polly.put-lexicon-input/content (clojure.spec.alpha/and :portkey.aws.polly/lexicon-content))
(clojure.spec.alpha/def :portkey.aws.polly/put-lexicon-input (clojure.spec.alpha/keys :req-un [:portkey.aws.polly.put-lexicon-input/name :portkey.aws.polly.put-lexicon-input/content] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.polly/language-code-list (clojure.spec.alpha/coll-of :portkey.aws.polly/language-code))

(clojure.spec.alpha/def :portkey.aws.polly/task-id (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__42947__auto__] (clojure.core/<= 1 (clojure.core/count s__42947__auto__))) (clojure.core/fn [s__42948__auto__] (clojure.core/< (clojure.core/count s__42948__auto__) 128))))

(clojure.spec.alpha/def :portkey.aws.polly/text-type #{"ssml" :ssml "text" :text})

(clojure.spec.alpha/def :portkey.aws.polly.lexicon/content (clojure.spec.alpha/and :portkey.aws.polly/lexicon-content))
(clojure.spec.alpha/def :portkey.aws.polly.lexicon/name (clojure.spec.alpha/and :portkey.aws.polly/lexicon-name))
(clojure.spec.alpha/def :portkey.aws.polly/lexicon (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.polly.lexicon/content :portkey.aws.polly.lexicon/name]))

(clojure.spec.alpha/def :portkey.aws.polly/lexemes-count clojure.core/int?)

(clojure.spec.alpha/def :portkey.aws.polly.text-length-exceeded-exception/message (clojure.spec.alpha/and :portkey.aws.polly/error-message))
(clojure.spec.alpha/def :portkey.aws.polly/text-length-exceeded-exception (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.polly.text-length-exceeded-exception/message]))

(clojure.spec.alpha/def :portkey.aws.polly/gender #{:female :male "Male" "Female"})

(clojure.spec.alpha/def :portkey.aws.polly/lexicon-name (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__42949__auto__] (clojure.core/re-matches #"[0-9A-Za-z]{1,20}" s__42949__auto__))))

(clojure.spec.alpha/def :portkey.aws.polly.invalid-sample-rate-exception/message (clojure.spec.alpha/and :portkey.aws.polly/error-message))
(clojure.spec.alpha/def :portkey.aws.polly/invalid-sample-rate-exception (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.polly.invalid-sample-rate-exception/message]))

(clojure.spec.alpha/def :portkey.aws.polly/next-token (clojure.spec.alpha/and clojure.core/string?))

(clojure.spec.alpha/def :portkey.aws.polly/output-uri (clojure.spec.alpha/and clojure.core/string?))

(clojure.spec.alpha/def :portkey.aws.polly/voice-name (clojure.spec.alpha/and clojure.core/string?))

(clojure.spec.alpha/def :portkey.aws.polly/error-message (clojure.spec.alpha/and clojure.core/string?))

(clojure.spec.alpha/def :portkey.aws.polly/voice-list (clojure.spec.alpha/coll-of :portkey.aws.polly/voice))

(clojure.spec.alpha/def :portkey.aws.polly.invalid-next-token-exception/message (clojure.spec.alpha/and :portkey.aws.polly/error-message))
(clojure.spec.alpha/def :portkey.aws.polly/invalid-next-token-exception (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.polly.invalid-next-token-exception/message]))

(clojure.spec.alpha/def :portkey.aws.polly/list-lexicons-input (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.polly/next-token]))

(clojure.spec.alpha/def :portkey.aws.polly/language-name (clojure.spec.alpha/and clojure.core/string?))

(clojure.spec.alpha/def :portkey.aws.polly.synthesis-task/speech-mark-types (clojure.spec.alpha/and :portkey.aws.polly/speech-mark-type-list))
(clojure.spec.alpha/def :portkey.aws.polly.synthesis-task/lexicon-names (clojure.spec.alpha/and :portkey.aws.polly/lexicon-name-list))
(clojure.spec.alpha/def :portkey.aws.polly.synthesis-task/creation-time (clojure.spec.alpha/and :portkey.aws.polly/date-time))
(clojure.spec.alpha/def :portkey.aws.polly/synthesis-task (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.polly/sample-rate :portkey.aws.polly/request-characters :portkey.aws.polly/task-id :portkey.aws.polly/text-type :portkey.aws.polly.synthesis-task/speech-mark-types :portkey.aws.polly/output-uri :portkey.aws.polly.synthesis-task/lexicon-names :portkey.aws.polly/output-format :portkey.aws.polly/language-code :portkey.aws.polly/sns-topic-arn :portkey.aws.polly/task-status-reason :portkey.aws.polly.synthesis-task/creation-time :portkey.aws.polly/voice-id :portkey.aws.polly/task-status]))

(clojure.spec.alpha/def :portkey.aws.polly.unsupported-pls-language-exception/message (clojure.spec.alpha/and :portkey.aws.polly/error-message))
(clojure.spec.alpha/def :portkey.aws.polly/unsupported-pls-language-exception (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.polly.unsupported-pls-language-exception/message]))

(clojure.spec.alpha/def :portkey.aws.polly.synthesis-task-not-found-exception/message (clojure.spec.alpha/and :portkey.aws.polly/error-message))
(clojure.spec.alpha/def :portkey.aws.polly/synthesis-task-not-found-exception (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.polly.synthesis-task-not-found-exception/message]))

(clojure.spec.alpha/def :portkey.aws.polly.language-not-supported-exception/message (clojure.spec.alpha/and :portkey.aws.polly/error-message))
(clojure.spec.alpha/def :portkey.aws.polly/language-not-supported-exception (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.polly.language-not-supported-exception/message]))

(clojure.spec.alpha/def :portkey.aws.polly/content-type (clojure.spec.alpha/and clojure.core/string?))

(clojure.spec.alpha/def :portkey.aws.polly.get-lexicon-input/name (clojure.spec.alpha/and :portkey.aws.polly/lexicon-name))
(clojure.spec.alpha/def :portkey.aws.polly/get-lexicon-input (clojure.spec.alpha/keys :req-un [:portkey.aws.polly.get-lexicon-input/name] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.polly/put-lexicon-output (clojure.spec.alpha/keys :req-un [] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.polly/output-format #{"json" "mp3" :mp-3 "pcm" "ogg_vorbis" :pcm :ogg-vorbis :json})

(clojure.spec.alpha/def :portkey.aws.polly/delete-lexicon-output (clojure.spec.alpha/keys :req-un [] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.polly/language-code #{"it-IT" :ja-jp :pt-pt "de-DE" :en-au :ko-kr :es-es :en-gb :nl-nl :ro-ro "en-AU" :hi-in "en-IN" :fr-fr :en-gbwls "da-DK" "tr-TR" :it-it "es-US" :da-dk :de-de "pt-BR" :cmn-cn "cmn-CN" :ru-ru :tr-tr :pt-br "hi-IN" "nl-NL" :pl-pl "fr-CA" "ja-JP" :cy-gb "en-US" :nb-no "cy-GB" "fr-FR" "en-GB" "ru-RU" "ro-RO" :fr-ca :sv-se "ko-KR" "es-ES" "en-GB-WLS" "pt-PT" :en-in :en-us "pl-PL" "is-IS" "sv-SE" "nb-NO" :is-is :es-us})

(clojure.spec.alpha/def :portkey.aws.polly/lexicon-attributes (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.polly/alphabet :portkey.aws.polly/language-code :portkey.aws.polly/last-modified :portkey.aws.polly/lexicon-arn :portkey.aws.polly/lexemes-count :portkey.aws.polly/size]))

(clojure.spec.alpha/def :portkey.aws.polly/last-modified clojure.core/inst?)

(clojure.spec.alpha/def :portkey.aws.polly/speech-mark-type-list (clojure.spec.alpha/coll-of :portkey.aws.polly/speech-mark-type :max-count 4))

(clojure.spec.alpha/def :portkey.aws.polly/sns-topic-arn (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__42949__auto__] (clojure.core/re-matches #"^arn:aws(-(cn|iso(-b)?|us-gov))?:sns:.*:\w{12}:.+$" s__42949__auto__))))

(clojure.spec.alpha/def :portkey.aws.polly/synthesis-tasks (clojure.spec.alpha/coll-of :portkey.aws.polly/synthesis-task))

(clojure.spec.alpha/def :portkey.aws.polly.lexicon-description/name (clojure.spec.alpha/and :portkey.aws.polly/lexicon-name))
(clojure.spec.alpha/def :portkey.aws.polly.lexicon-description/attributes (clojure.spec.alpha/and :portkey.aws.polly/lexicon-attributes))
(clojure.spec.alpha/def :portkey.aws.polly/lexicon-description (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.polly.lexicon-description/name :portkey.aws.polly.lexicon-description/attributes]))

(clojure.spec.alpha/def :portkey.aws.polly.list-speech-synthesis-tasks-input/status (clojure.spec.alpha/and :portkey.aws.polly/task-status))
(clojure.spec.alpha/def :portkey.aws.polly/list-speech-synthesis-tasks-input (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.polly/max-results :portkey.aws.polly/next-token :portkey.aws.polly.list-speech-synthesis-tasks-input/status]))

(clojure.spec.alpha/def :portkey.aws.polly/size clojure.core/int?)

(clojure.spec.alpha/def :portkey.aws.polly/lexicon-content (clojure.spec.alpha/and clojure.core/string?))

(clojure.spec.alpha/def :portkey.aws.polly.invalid-s-3-key-exception/message (clojure.spec.alpha/and :portkey.aws.polly/error-message))
(clojure.spec.alpha/def :portkey.aws.polly/invalid-s-3-key-exception (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.polly.invalid-s-3-key-exception/message]))

(clojure.spec.alpha/def :portkey.aws.polly.invalid-task-id-exception/message (clojure.spec.alpha/and :portkey.aws.polly/error-message))
(clojure.spec.alpha/def :portkey.aws.polly/invalid-task-id-exception (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.polly.invalid-task-id-exception/message]))

(clojure.spec.alpha/def :portkey.aws.polly.lexicon-not-found-exception/message (clojure.spec.alpha/and :portkey.aws.polly/error-message))
(clojure.spec.alpha/def :portkey.aws.polly/lexicon-not-found-exception (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.polly.lexicon-not-found-exception/message]))

(clojure.spec.alpha/def :portkey.aws.polly/task-status-reason (clojure.spec.alpha/and clojure.core/string?))

(clojure.spec.alpha/def :portkey.aws.polly/include-additional-language-codes clojure.core/boolean?)

(clojure.spec.alpha/def :portkey.aws.polly.invalid-lexicon-exception/message (clojure.spec.alpha/and :portkey.aws.polly/error-message))
(clojure.spec.alpha/def :portkey.aws.polly/invalid-lexicon-exception (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.polly.invalid-lexicon-exception/message]))

(clojure.spec.alpha/def :portkey.aws.polly/output-s-3-key-prefix (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__42949__auto__] (clojure.core/re-matches #"^[0-9a-zA-Z\/\!\-_\.\*\'\(\)]{0,800}$" s__42949__auto__))))

(clojure.spec.alpha/def :portkey.aws.polly/voice-id #{"Filiz" :joey "Joanna" :lea "Amy" "Marlene" :astrid "Salli" :zhiyu :maja :matthew "Ricardo" :tatyana "Mathieu" "Enrique" :lotte :ewa "Nicole" "Russell" :giorgio "Gwyneth" :seoyeon "Aditi" "Conchita" :jan :dora :justin "Joey" "Chantal" :russell :amy "Ines" "Hans" "Penelope" :conchita "Mizuki" "Takumi" "Maja" "Miguel" "Lea" "Kendra" "Karl" "Mads" :gwyneth :emma "Carla" "Geraint" "Astrid" "Celine" :maxim "Seoyeon" "Vicki" :aditi "Matthew" "Jan" :mads :liv "Lotte" :celine :jacek :vitoria :miguel "Kimberly" :filiz "Liv" "Brian" "Cristiano" "Ewa" "Maxim" :mathieu "Vitoria" :karl :salli :hans "Giorgio" "Justin" :mizuki "Emma" :joanna "Raveena" :ricardo :vicki "Carmen" "Jacek" :raveena "Naja" :takumi :penelope :carmen "Ivy" :naja :ivy "Tatyana" :carla "Zhiyu" :chantal "Ruben" :kendra :kimberly :geraint :nicole :brian :marlene :enrique "Dora" :ines :ruben :cristiano})

(clojure.spec.alpha/def :portkey.aws.polly.synthesize-speech-input/lexicon-names (clojure.spec.alpha/and :portkey.aws.polly/lexicon-name-list))
(clojure.spec.alpha/def :portkey.aws.polly.synthesize-speech-input/speech-mark-types (clojure.spec.alpha/and :portkey.aws.polly/speech-mark-type-list))
(clojure.spec.alpha/def :portkey.aws.polly/synthesize-speech-input (clojure.spec.alpha/keys :req-un [:portkey.aws.polly/output-format :portkey.aws.polly/text :portkey.aws.polly/voice-id] :opt-un [:portkey.aws.polly.synthesize-speech-input/lexicon-names :portkey.aws.polly/sample-rate :portkey.aws.polly.synthesize-speech-input/speech-mark-types :portkey.aws.polly/text-type :portkey.aws.polly/language-code]))

(clojure.spec.alpha/def :portkey.aws.polly/text (clojure.spec.alpha/and clojure.core/string?))

(clojure.spec.alpha/def :portkey.aws.polly/audio-stream clojure.core/bytes?)

(clojure.spec.alpha/def :portkey.aws.polly/max-results (clojure.spec.alpha/int-in 1 100))

(clojure.spec.alpha/def :portkey.aws.polly/describe-voices-input (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.polly/language-code :portkey.aws.polly/include-additional-language-codes :portkey.aws.polly/next-token]))

(clojure.spec.alpha/def :portkey.aws.polly.lexicon-size-exceeded-exception/message (clojure.spec.alpha/and :portkey.aws.polly/error-message))
(clojure.spec.alpha/def :portkey.aws.polly/lexicon-size-exceeded-exception (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.polly.lexicon-size-exceeded-exception/message]))

(clojure.spec.alpha/def :portkey.aws.polly/alphabet (clojure.spec.alpha/and clojure.core/string?))

(clojure.spec.alpha/def :portkey.aws.polly.voice/id (clojure.spec.alpha/and :portkey.aws.polly/voice-id))
(clojure.spec.alpha/def :portkey.aws.polly.voice/name (clojure.spec.alpha/and :portkey.aws.polly/voice-name))
(clojure.spec.alpha/def :portkey.aws.polly.voice/additional-language-codes (clojure.spec.alpha/and :portkey.aws.polly/language-code-list))
(clojure.spec.alpha/def :portkey.aws.polly/voice (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.polly/gender :portkey.aws.polly.voice/id :portkey.aws.polly/language-code :portkey.aws.polly/language-name :portkey.aws.polly.voice/name :portkey.aws.polly.voice/additional-language-codes]))

(clojure.spec.alpha/def :portkey.aws.polly.marks-not-supported-for-format-exception/message (clojure.spec.alpha/and :portkey.aws.polly/error-message))
(clojure.spec.alpha/def :portkey.aws.polly/marks-not-supported-for-format-exception (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.polly.marks-not-supported-for-format-exception/message]))

(clojure.spec.alpha/def :portkey.aws.polly/speech-mark-type #{"ssml" "word" :sentence :ssml :word "viseme" :viseme "sentence"})

(clojure.spec.alpha/def :portkey.aws.polly/task-status #{:in-progress "failed" "scheduled" :completed "completed" "inProgress" :scheduled :failed})

(clojure.spec.alpha/def :portkey.aws.polly/start-speech-synthesis-task-output (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.polly/synthesis-task]))

(clojure.spec.alpha/def :portkey.aws.polly/get-speech-synthesis-task-output (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.polly/synthesis-task]))

(clojure.spec.alpha/def :portkey.aws.polly/date-time clojure.core/inst?)

(clojure.spec.alpha/def :portkey.aws.polly/lexicon-description-list (clojure.spec.alpha/coll-of :portkey.aws.polly/lexicon-description))

(clojure.core/defn list-lexicons ([] (list-lexicons {})) ([list-lexicons-inputinput] (clojure.core/let [request-function-result__43533__auto__ (req-list-lexicons-input list-lexicons-inputinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__43533__auto__ {:http.request.configuration/endpoints portkey.aws.polly/endpoints, :http.request.spec/output-spec :portkey.aws.polly/list-lexicons-output, :http.request.configuration/mime-type {"content-type" "application/json"}, :http.request.configuration/request-uri "/v1/lexicons", :http.request.configuration/version "2016-06-10", :http.request.configuration/service-id "Polly", :http.request.spec/input-spec :portkey.aws.polly/list-lexicons-input, :http.request.configuration/protocol "rest-json", :http.request.configuration/method :get, :http.request.configuration/response-code 200, :http.request.configuration/action "ListLexicons", :http.request.spec/error-spec {"InvalidNextTokenException" :portkey.aws.polly/invalid-next-token-exception, "ServiceFailureException" :portkey.aws.polly/service-failure-exception}})))))
(clojure.spec.alpha/fdef list-lexicons :args (clojure.spec.alpha/? :portkey.aws.polly/list-lexicons-input) :ret (clojure.spec.alpha/and :portkey.aws.polly/list-lexicons-output))

(clojure.core/defn start-speech-synthesis-task ([start-speech-synthesis-task-inputinput] (clojure.core/let [request-function-result__43533__auto__ (req-start-speech-synthesis-task-input start-speech-synthesis-task-inputinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__43533__auto__ {:http.request.configuration/endpoints portkey.aws.polly/endpoints, :http.request.spec/output-spec :portkey.aws.polly/start-speech-synthesis-task-output, :http.request.configuration/mime-type {"content-type" "application/json"}, :http.request.configuration/request-uri "/v1/synthesisTasks", :http.request.configuration/version "2016-06-10", :http.request.configuration/service-id "Polly", :http.request.spec/input-spec :portkey.aws.polly/start-speech-synthesis-task-input, :http.request.configuration/protocol "rest-json", :http.request.configuration/method :post, :http.request.configuration/response-code 200, :http.request.configuration/action "StartSpeechSynthesisTask", :http.request.spec/error-spec {"InvalidSsmlException" :portkey.aws.polly/invalid-ssml-exception, "InvalidSnsTopicArnException" :portkey.aws.polly/invalid-sns-topic-arn-exception, "SsmlMarksNotSupportedForTextTypeException" :portkey.aws.polly/ssml-marks-not-supported-for-text-type-exception, "InvalidS3BucketException" :portkey.aws.polly/invalid-s-3-bucket-exception, "ServiceFailureException" :portkey.aws.polly/service-failure-exception, "TextLengthExceededException" :portkey.aws.polly/text-length-exceeded-exception, "InvalidSampleRateException" :portkey.aws.polly/invalid-sample-rate-exception, "LanguageNotSupportedException" :portkey.aws.polly/language-not-supported-exception, "InvalidS3KeyException" :portkey.aws.polly/invalid-s-3-key-exception, "LexiconNotFoundException" :portkey.aws.polly/lexicon-not-found-exception, "MarksNotSupportedForFormatException" :portkey.aws.polly/marks-not-supported-for-format-exception}})))))
(clojure.spec.alpha/fdef start-speech-synthesis-task :args (clojure.spec.alpha/tuple :portkey.aws.polly/start-speech-synthesis-task-input) :ret (clojure.spec.alpha/and :portkey.aws.polly/start-speech-synthesis-task-output))

(clojure.core/defn describe-voices ([] (describe-voices {})) ([describe-voices-inputinput] (clojure.core/let [request-function-result__43533__auto__ (req-describe-voices-input describe-voices-inputinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__43533__auto__ {:http.request.configuration/endpoints portkey.aws.polly/endpoints, :http.request.spec/output-spec :portkey.aws.polly/describe-voices-output, :http.request.configuration/mime-type {"content-type" "application/json"}, :http.request.configuration/request-uri "/v1/voices", :http.request.configuration/version "2016-06-10", :http.request.configuration/service-id "Polly", :http.request.spec/input-spec :portkey.aws.polly/describe-voices-input, :http.request.configuration/protocol "rest-json", :http.request.configuration/method :get, :http.request.configuration/response-code 200, :http.request.configuration/action "DescribeVoices", :http.request.spec/error-spec {"InvalidNextTokenException" :portkey.aws.polly/invalid-next-token-exception, "ServiceFailureException" :portkey.aws.polly/service-failure-exception}})))))
(clojure.spec.alpha/fdef describe-voices :args (clojure.spec.alpha/? :portkey.aws.polly/describe-voices-input) :ret (clojure.spec.alpha/and :portkey.aws.polly/describe-voices-output))

(clojure.core/defn delete-lexicon ([delete-lexicon-inputinput] (clojure.core/let [request-function-result__43533__auto__ (req-delete-lexicon-input delete-lexicon-inputinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__43533__auto__ {:http.request.configuration/endpoints portkey.aws.polly/endpoints, :http.request.spec/output-spec :portkey.aws.polly/delete-lexicon-output, :http.request.configuration/mime-type {"content-type" "application/json"}, :http.request.configuration/request-uri "/v1/lexicons/{LexiconName}", :http.request.configuration/version "2016-06-10", :http.request.configuration/service-id "Polly", :http.request.spec/input-spec :portkey.aws.polly/delete-lexicon-input, :http.request.configuration/protocol "rest-json", :http.request.configuration/method :delete, :http.request.configuration/response-code 200, :http.request.configuration/action "DeleteLexicon", :http.request.spec/error-spec {"LexiconNotFoundException" :portkey.aws.polly/lexicon-not-found-exception, "ServiceFailureException" :portkey.aws.polly/service-failure-exception}})))))
(clojure.spec.alpha/fdef delete-lexicon :args (clojure.spec.alpha/tuple :portkey.aws.polly/delete-lexicon-input) :ret (clojure.spec.alpha/and :portkey.aws.polly/delete-lexicon-output))

(clojure.core/defn get-lexicon ([get-lexicon-inputinput] (clojure.core/let [request-function-result__43533__auto__ (req-get-lexicon-input get-lexicon-inputinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__43533__auto__ {:http.request.configuration/endpoints portkey.aws.polly/endpoints, :http.request.spec/output-spec :portkey.aws.polly/get-lexicon-output, :http.request.configuration/mime-type {"content-type" "application/json"}, :http.request.configuration/request-uri "/v1/lexicons/{LexiconName}", :http.request.configuration/version "2016-06-10", :http.request.configuration/service-id "Polly", :http.request.spec/input-spec :portkey.aws.polly/get-lexicon-input, :http.request.configuration/protocol "rest-json", :http.request.configuration/method :get, :http.request.configuration/response-code 200, :http.request.configuration/action "GetLexicon", :http.request.spec/error-spec {"LexiconNotFoundException" :portkey.aws.polly/lexicon-not-found-exception, "ServiceFailureException" :portkey.aws.polly/service-failure-exception}})))))
(clojure.spec.alpha/fdef get-lexicon :args (clojure.spec.alpha/tuple :portkey.aws.polly/get-lexicon-input) :ret (clojure.spec.alpha/and :portkey.aws.polly/get-lexicon-output))

(clojure.core/defn put-lexicon ([put-lexicon-inputinput] (clojure.core/let [request-function-result__43533__auto__ (req-put-lexicon-input put-lexicon-inputinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__43533__auto__ {:http.request.configuration/endpoints portkey.aws.polly/endpoints, :http.request.spec/output-spec :portkey.aws.polly/put-lexicon-output, :http.request.configuration/mime-type {"content-type" "application/json"}, :http.request.configuration/request-uri "/v1/lexicons/{LexiconName}", :http.request.configuration/version "2016-06-10", :http.request.configuration/service-id "Polly", :http.request.spec/input-spec :portkey.aws.polly/put-lexicon-input, :http.request.configuration/protocol "rest-json", :http.request.configuration/method :put, :http.request.configuration/response-code 200, :http.request.configuration/action "PutLexicon", :http.request.spec/error-spec {"InvalidLexiconException" :portkey.aws.polly/invalid-lexicon-exception, "UnsupportedPlsAlphabetException" :portkey.aws.polly/unsupported-pls-alphabet-exception, "UnsupportedPlsLanguageException" :portkey.aws.polly/unsupported-pls-language-exception, "LexiconSizeExceededException" :portkey.aws.polly/lexicon-size-exceeded-exception, "MaxLexemeLengthExceededException" :portkey.aws.polly/max-lexeme-length-exceeded-exception, "MaxLexiconsNumberExceededException" :portkey.aws.polly/max-lexicons-number-exceeded-exception, "ServiceFailureException" :portkey.aws.polly/service-failure-exception}})))))
(clojure.spec.alpha/fdef put-lexicon :args (clojure.spec.alpha/tuple :portkey.aws.polly/put-lexicon-input) :ret (clojure.spec.alpha/and :portkey.aws.polly/put-lexicon-output))

(clojure.core/defn synthesize-speech ([synthesize-speech-inputinput] (clojure.core/let [request-function-result__43533__auto__ (req-synthesize-speech-input synthesize-speech-inputinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__43533__auto__ {:http.request.configuration/endpoints portkey.aws.polly/endpoints, :http.request.spec/output-spec :portkey.aws.polly/synthesize-speech-output, :http.request.configuration/mime-type {"content-type" "application/json"}, :http.request.configuration/request-uri "/v1/speech", :http.request.configuration/version "2016-06-10", :http.request.configuration/service-id "Polly", :http.request.spec/input-spec :portkey.aws.polly/synthesize-speech-input, :http.request.configuration/protocol "rest-json", :http.request.configuration/method :post, :http.request.configuration/response-code 200, :http.request.configuration/action "SynthesizeSpeech", :http.request.spec/error-spec {"TextLengthExceededException" :portkey.aws.polly/text-length-exceeded-exception, "InvalidSampleRateException" :portkey.aws.polly/invalid-sample-rate-exception, "InvalidSsmlException" :portkey.aws.polly/invalid-ssml-exception, "LexiconNotFoundException" :portkey.aws.polly/lexicon-not-found-exception, "ServiceFailureException" :portkey.aws.polly/service-failure-exception, "MarksNotSupportedForFormatException" :portkey.aws.polly/marks-not-supported-for-format-exception, "SsmlMarksNotSupportedForTextTypeException" :portkey.aws.polly/ssml-marks-not-supported-for-text-type-exception, "LanguageNotSupportedException" :portkey.aws.polly/language-not-supported-exception}})))))
(clojure.spec.alpha/fdef synthesize-speech :args (clojure.spec.alpha/tuple :portkey.aws.polly/synthesize-speech-input) :ret (clojure.spec.alpha/and :portkey.aws.polly/synthesize-speech-output))

(clojure.core/defn list-speech-synthesis-tasks ([] (list-speech-synthesis-tasks {})) ([list-speech-synthesis-tasks-inputinput] (clojure.core/let [request-function-result__43533__auto__ (req-list-speech-synthesis-tasks-input list-speech-synthesis-tasks-inputinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__43533__auto__ {:http.request.configuration/endpoints portkey.aws.polly/endpoints, :http.request.spec/output-spec :portkey.aws.polly/list-speech-synthesis-tasks-output, :http.request.configuration/mime-type {"content-type" "application/json"}, :http.request.configuration/request-uri "/v1/synthesisTasks", :http.request.configuration/version "2016-06-10", :http.request.configuration/service-id "Polly", :http.request.spec/input-spec :portkey.aws.polly/list-speech-synthesis-tasks-input, :http.request.configuration/protocol "rest-json", :http.request.configuration/method :get, :http.request.configuration/response-code 200, :http.request.configuration/action "ListSpeechSynthesisTasks", :http.request.spec/error-spec {"InvalidNextTokenException" :portkey.aws.polly/invalid-next-token-exception, "ServiceFailureException" :portkey.aws.polly/service-failure-exception}})))))
(clojure.spec.alpha/fdef list-speech-synthesis-tasks :args (clojure.spec.alpha/? :portkey.aws.polly/list-speech-synthesis-tasks-input) :ret (clojure.spec.alpha/and :portkey.aws.polly/list-speech-synthesis-tasks-output))

(clojure.core/defn get-speech-synthesis-task ([get-speech-synthesis-task-inputinput] (clojure.core/let [request-function-result__43533__auto__ (req-get-speech-synthesis-task-input get-speech-synthesis-task-inputinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__43533__auto__ {:http.request.configuration/endpoints portkey.aws.polly/endpoints, :http.request.spec/output-spec :portkey.aws.polly/get-speech-synthesis-task-output, :http.request.configuration/mime-type {"content-type" "application/json"}, :http.request.configuration/request-uri "/v1/synthesisTasks/{TaskId}", :http.request.configuration/version "2016-06-10", :http.request.configuration/service-id "Polly", :http.request.spec/input-spec :portkey.aws.polly/get-speech-synthesis-task-input, :http.request.configuration/protocol "rest-json", :http.request.configuration/method :get, :http.request.configuration/response-code 200, :http.request.configuration/action "GetSpeechSynthesisTask", :http.request.spec/error-spec {"InvalidTaskIdException" :portkey.aws.polly/invalid-task-id-exception, "ServiceFailureException" :portkey.aws.polly/service-failure-exception, "SynthesisTaskNotFoundException" :portkey.aws.polly/synthesis-task-not-found-exception}})))))
(clojure.spec.alpha/fdef get-speech-synthesis-task :args (clojure.spec.alpha/tuple :portkey.aws.polly/get-speech-synthesis-task-input) :ret (clojure.spec.alpha/and :portkey.aws.polly/get-speech-synthesis-task-output))
