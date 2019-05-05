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
   "cn-northwest-1"
   {:credential-scope {:service "polly", :region "cn-northwest-1"},
    :ssl-common-name "polly.cn-northwest-1.amazonaws.com.cn",
    :endpoint "https://polly.cn-northwest-1.amazonaws.com.cn",
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
    :signature-version :v4},
   "eu-north-1"
   {:credential-scope {:service "polly", :region "eu-north-1"},
    :ssl-common-name "polly.eu-north-1.amazonaws.com",
    :endpoint "https://polly.eu-north-1.amazonaws.com",
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

(clojure.core/defn- ser-language-code [input] #:http.request.field{:value (clojure.core/get {"it-IT" "it-IT", :ja-jp "ja-JP", :pt-pt "pt-PT", "de-DE" "de-DE", :en-au "en-AU", :ko-kr "ko-KR", :es-es "es-ES", :en-gb "en-GB", :nl-nl "nl-NL", :ro-ro "ro-RO", "en-AU" "en-AU", :hi-in "hi-IN", "en-IN" "en-IN", :fr-fr "fr-FR", :en-gbwls "en-GB-WLS", "da-DK" "da-DK", "tr-TR" "tr-TR", :it-it "it-IT", "es-US" "es-US", :da-dk "da-DK", :de-de "de-DE", "pt-BR" "pt-BR", :cmn-cn "cmn-CN", "cmn-CN" "cmn-CN", :ru-ru "ru-RU", :tr-tr "tr-TR", :pt-br "pt-BR", "hi-IN" "hi-IN", "nl-NL" "nl-NL", "es-MX" "es-MX", :pl-pl "pl-PL", "fr-CA" "fr-CA", "ja-JP" "ja-JP", :cy-gb "cy-GB", "en-US" "en-US", :nb-no "nb-NO", "cy-GB" "cy-GB", :es-mx "es-MX", "fr-FR" "fr-FR", "en-GB" "en-GB", "ru-RU" "ru-RU", "ro-RO" "ro-RO", :fr-ca "fr-CA", :sv-se "sv-SE", "ko-KR" "ko-KR", "es-ES" "es-ES", "en-GB-WLS" "en-GB-WLS", "pt-PT" "pt-PT", :en-in "en-IN", :en-us "en-US", "pl-PL" "pl-PL", "is-IS" "is-IS", "sv-SE" "sv-SE", "nb-NO" "nb-NO", :is-is "is-IS", :es-us "es-US"} input), :shape "LanguageCode"})

(clojure.core/defn- ser-speech-mark-type-list [input] #:http.request.field{:value (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (clojure.core/merge (ser-speech-mark-type coll) #:http.request.field{:shape "SpeechMarkType"}))) input), :shape "SpeechMarkTypeList", :type "list", :max 4})

(clojure.core/defn- ser-sns-topic-arn [input] #:http.request.field{:value input, :shape "SnsTopicArn"})

(clojure.core/defn- ser-lexicon-content [input] #:http.request.field{:value input, :shape "LexiconContent"})

(clojure.core/defn- ser-include-additional-language-codes [input] #:http.request.field{:value input, :shape "IncludeAdditionalLanguageCodes"})

(clojure.core/defn- ser-output-s-3-key-prefix [input] #:http.request.field{:value input, :shape "OutputS3KeyPrefix"})

(clojure.core/defn- ser-voice-id [input] #:http.request.field{:value (clojure.core/get {"Filiz" "Filiz", :joey "Joey", "Joanna" "Joanna", :lea "Lea", "Amy" "Amy", "Marlene" "Marlene", :astrid "Astrid", "Salli" "Salli", :zhiyu "Zhiyu", :maja "Maja", :matthew "Matthew", "Ricardo" "Ricardo", :tatyana "Tatyana", "Mathieu" "Mathieu", "Enrique" "Enrique", :lotte "Lotte", :ewa "Ewa", "Nicole" "Nicole", "Russell" "Russell", :giorgio "Giorgio", "Gwyneth" "Gwyneth", :seoyeon "Seoyeon", "Aditi" "Aditi", "Conchita" "Conchita", :jan "Jan", :lucia "Lucia", :dora "Dora", :justin "Justin", "Joey" "Joey", :bianca "Bianca", "Chantal" "Chantal", :russell "Russell", :amy "Amy", "Ines" "Ines", "Hans" "Hans", "Penelope" "Penelope", :conchita "Conchita", "Mizuki" "Mizuki", "Lucia" "Lucia", "Takumi" "Takumi", "Maja" "Maja", "Miguel" "Miguel", "Lea" "Lea", "Kendra" "Kendra", "Karl" "Karl", "Mads" "Mads", :gwyneth "Gwyneth", :emma "Emma", "Carla" "Carla", "Geraint" "Geraint", "Astrid" "Astrid", "Celine" "Celine", :maxim "Maxim", "Seoyeon" "Seoyeon", "Vicki" "Vicki", :aditi "Aditi", "Matthew" "Matthew", "Jan" "Jan", "Mia" "Mia", :mads "Mads", :liv "Liv", "Lotte" "Lotte", :celine "Celine", :jacek "Jacek", :vitoria "Vitoria", :miguel "Miguel", "Kimberly" "Kimberly", :filiz "Filiz", "Liv" "Liv", "Brian" "Brian", "Cristiano" "Cristiano", "Ewa" "Ewa", "Maxim" "Maxim", :mathieu "Mathieu", "Vitoria" "Vitoria", :karl "Karl", :salli "Salli", :hans "Hans", "Giorgio" "Giorgio", "Justin" "Justin", :mizuki "Mizuki", "Emma" "Emma", :joanna "Joanna", "Raveena" "Raveena", :ricardo "Ricardo", :vicki "Vicki", "Carmen" "Carmen", "Jacek" "Jacek", :raveena "Raveena", "Naja" "Naja", :takumi "Takumi", :penelope "Penelope", :carmen "Carmen", "Ivy" "Ivy", :naja "Naja", :ivy "Ivy", "Tatyana" "Tatyana", :carla "Carla", "Zhiyu" "Zhiyu", :chantal "Chantal", :mia "Mia", "Ruben" "Ruben", :kendra "Kendra", :kimberly "Kimberly", :geraint "Geraint", "Bianca" "Bianca", :nicole "Nicole", :brian "Brian", :marlene "Marlene", :enrique "Enrique", "Dora" "Dora", :ines "Ines", :ruben "Ruben", :cristiano "Cristiano"} input), :shape "VoiceId"})

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

(clojure.core/declare deser-lexicon-arn)

(clojure.core/declare deser-sample-rate)

(clojure.core/declare deser-request-characters)

(clojure.core/declare deser-lexicon-name-list)

(clojure.core/declare deser-language-code-list)

(clojure.core/declare deser-task-id)

(clojure.core/declare deser-text-type)

(clojure.core/declare deser-lexicon)

(clojure.core/declare deser-lexemes-count)

(clojure.core/declare deser-gender)

(clojure.core/declare deser-lexicon-name)

(clojure.core/declare deser-next-token)

(clojure.core/declare deser-output-uri)

(clojure.core/declare deser-voice-name)

(clojure.core/declare deser-error-message)

(clojure.core/declare deser-voice-list)

(clojure.core/declare deser-language-name)

(clojure.core/declare deser-synthesis-task)

(clojure.core/declare deser-content-type)

(clojure.core/declare deser-output-format)

(clojure.core/declare deser-language-code)

(clojure.core/declare deser-lexicon-attributes)

(clojure.core/declare deser-last-modified)

(clojure.core/declare deser-speech-mark-type-list)

(clojure.core/declare deser-sns-topic-arn)

(clojure.core/declare deser-synthesis-tasks)

(clojure.core/declare deser-lexicon-description)

(clojure.core/declare deser-size)

(clojure.core/declare deser-lexicon-content)

(clojure.core/declare deser-task-status-reason)

(clojure.core/declare deser-voice-id)

(clojure.core/declare deser-audio-stream)

(clojure.core/declare deser-alphabet)

(clojure.core/declare deser-voice)

(clojure.core/declare deser-speech-mark-type)

(clojure.core/declare deser-task-status)

(clojure.core/declare deser-date-time)

(clojure.core/declare deser-lexicon-description-list)

(clojure.core/defn- deser-lexicon-arn [input] input)

(clojure.core/defn- deser-sample-rate [input] input)

(clojure.core/defn- deser-request-characters [input] input)

(clojure.core/defn- deser-lexicon-name-list [input] (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (deser-lexicon-name coll))) input))

(clojure.core/defn- deser-language-code-list [input] (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (deser-language-code coll))) input))

(clojure.core/defn- deser-task-id [input] input)

(clojure.core/defn- deser-text-type [input] (clojure.core/get {"ssml" :ssml, "text" :text} input))

(clojure.core/defn- deser-lexicon [input] (clojure.core/cond-> {} (clojure.core/contains? input "Content") (clojure.core/assoc :content (deser-lexicon-content (input "Content"))) (clojure.core/contains? input "Name") (clojure.core/assoc :name (deser-lexicon-name (input "Name")))))

(clojure.core/defn- deser-lexemes-count [input] input)

(clojure.core/defn- deser-gender [input] (clojure.core/get {"Female" :female, "Male" :male} input))

(clojure.core/defn- deser-lexicon-name [input] input)

(clojure.core/defn- deser-next-token [input] input)

(clojure.core/defn- deser-output-uri [input] input)

(clojure.core/defn- deser-voice-name [input] input)

(clojure.core/defn- deser-error-message [input] input)

(clojure.core/defn- deser-voice-list [input] (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (deser-voice coll))) input))

(clojure.core/defn- deser-language-name [input] input)

(clojure.core/defn- deser-synthesis-task [input] (clojure.core/cond-> {} (clojure.core/contains? input "SampleRate") (clojure.core/assoc :sample-rate (deser-sample-rate (input "SampleRate"))) (clojure.core/contains? input "RequestCharacters") (clojure.core/assoc :request-characters (deser-request-characters (input "RequestCharacters"))) (clojure.core/contains? input "TaskId") (clojure.core/assoc :task-id (deser-task-id (input "TaskId"))) (clojure.core/contains? input "TextType") (clojure.core/assoc :text-type (deser-text-type (input "TextType"))) (clojure.core/contains? input "SpeechMarkTypes") (clojure.core/assoc :speech-mark-types (deser-speech-mark-type-list (input "SpeechMarkTypes"))) (clojure.core/contains? input "OutputUri") (clojure.core/assoc :output-uri (deser-output-uri (input "OutputUri"))) (clojure.core/contains? input "LexiconNames") (clojure.core/assoc :lexicon-names (deser-lexicon-name-list (input "LexiconNames"))) (clojure.core/contains? input "OutputFormat") (clojure.core/assoc :output-format (deser-output-format (input "OutputFormat"))) (clojure.core/contains? input "LanguageCode") (clojure.core/assoc :language-code (deser-language-code (input "LanguageCode"))) (clojure.core/contains? input "SnsTopicArn") (clojure.core/assoc :sns-topic-arn (deser-sns-topic-arn (input "SnsTopicArn"))) (clojure.core/contains? input "TaskStatusReason") (clojure.core/assoc :task-status-reason (deser-task-status-reason (input "TaskStatusReason"))) (clojure.core/contains? input "CreationTime") (clojure.core/assoc :creation-time (deser-date-time (input "CreationTime"))) (clojure.core/contains? input "VoiceId") (clojure.core/assoc :voice-id (deser-voice-id (input "VoiceId"))) (clojure.core/contains? input "TaskStatus") (clojure.core/assoc :task-status (deser-task-status (input "TaskStatus")))))

(clojure.core/defn- deser-content-type [input] input)

(clojure.core/defn- deser-output-format [input] (clojure.core/get {"json" :json, "mp3" :mp-3, "ogg_vorbis" :ogg-vorbis, "pcm" :pcm} input))

(clojure.core/defn- deser-language-code [input] (clojure.core/get {"it-IT" :it-it, "de-DE" :de-de, "en-AU" :en-au, "en-IN" :en-in, "da-DK" :da-dk, "tr-TR" :tr-tr, "es-US" :es-us, "pt-BR" :pt-br, "cmn-CN" :cmn-cn, "hi-IN" :hi-in, "nl-NL" :nl-nl, "es-MX" :es-mx, "fr-CA" :fr-ca, "ja-JP" :ja-jp, "en-US" :en-us, "cy-GB" :cy-gb, "fr-FR" :fr-fr, "en-GB" :en-gb, "ru-RU" :ru-ru, "ro-RO" :ro-ro, "ko-KR" :ko-kr, "es-ES" :es-es, "en-GB-WLS" :en-gbwls, "pt-PT" :pt-pt, "pl-PL" :pl-pl, "is-IS" :is-is, "sv-SE" :sv-se, "nb-NO" :nb-no} input))

(clojure.core/defn- deser-lexicon-attributes [input] (clojure.core/cond-> {} (clojure.core/contains? input "Alphabet") (clojure.core/assoc :alphabet (deser-alphabet (input "Alphabet"))) (clojure.core/contains? input "LanguageCode") (clojure.core/assoc :language-code (deser-language-code (input "LanguageCode"))) (clojure.core/contains? input "LastModified") (clojure.core/assoc :last-modified (deser-last-modified (input "LastModified"))) (clojure.core/contains? input "LexiconArn") (clojure.core/assoc :lexicon-arn (deser-lexicon-arn (input "LexiconArn"))) (clojure.core/contains? input "LexemesCount") (clojure.core/assoc :lexemes-count (deser-lexemes-count (input "LexemesCount"))) (clojure.core/contains? input "Size") (clojure.core/assoc :size (deser-size (input "Size")))))

(clojure.core/defn- deser-last-modified [input] input)

(clojure.core/defn- deser-speech-mark-type-list [input] (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (deser-speech-mark-type coll))) input))

(clojure.core/defn- deser-sns-topic-arn [input] input)

(clojure.core/defn- deser-synthesis-tasks [input] (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (deser-synthesis-task coll))) input))

(clojure.core/defn- deser-lexicon-description [input] (clojure.core/cond-> {} (clojure.core/contains? input "Name") (clojure.core/assoc :name (deser-lexicon-name (input "Name"))) (clojure.core/contains? input "Attributes") (clojure.core/assoc :attributes (deser-lexicon-attributes (input "Attributes")))))

(clojure.core/defn- deser-size [input] input)

(clojure.core/defn- deser-lexicon-content [input] input)

(clojure.core/defn- deser-task-status-reason [input] input)

(clojure.core/defn- deser-voice-id [input] (clojure.core/get {"Filiz" :filiz, "Joanna" :joanna, "Amy" :amy, "Marlene" :marlene, "Salli" :salli, "Ricardo" :ricardo, "Mathieu" :mathieu, "Enrique" :enrique, "Nicole" :nicole, "Russell" :russell, "Gwyneth" :gwyneth, "Aditi" :aditi, "Conchita" :conchita, "Joey" :joey, "Chantal" :chantal, "Ines" :ines, "Hans" :hans, "Penelope" :penelope, "Mizuki" :mizuki, "Lucia" :lucia, "Takumi" :takumi, "Maja" :maja, "Miguel" :miguel, "Lea" :lea, "Kendra" :kendra, "Karl" :karl, "Mads" :mads, "Carla" :carla, "Geraint" :geraint, "Astrid" :astrid, "Celine" :celine, "Seoyeon" :seoyeon, "Vicki" :vicki, "Matthew" :matthew, "Jan" :jan, "Mia" :mia, "Lotte" :lotte, "Kimberly" :kimberly, "Liv" :liv, "Brian" :brian, "Cristiano" :cristiano, "Ewa" :ewa, "Maxim" :maxim, "Vitoria" :vitoria, "Giorgio" :giorgio, "Justin" :justin, "Emma" :emma, "Raveena" :raveena, "Carmen" :carmen, "Jacek" :jacek, "Naja" :naja, "Ivy" :ivy, "Tatyana" :tatyana, "Zhiyu" :zhiyu, "Ruben" :ruben, "Bianca" :bianca, "Dora" :dora} input))

(clojure.core/defn- deser-audio-stream [input] (portkey.aws/base64-decode input))

(clojure.core/defn- deser-alphabet [input] input)

(clojure.core/defn- deser-voice [input] (clojure.core/cond-> {} (clojure.core/contains? input "Gender") (clojure.core/assoc :gender (deser-gender (input "Gender"))) (clojure.core/contains? input "Id") (clojure.core/assoc :id (deser-voice-id (input "Id"))) (clojure.core/contains? input "LanguageCode") (clojure.core/assoc :language-code (deser-language-code (input "LanguageCode"))) (clojure.core/contains? input "LanguageName") (clojure.core/assoc :language-name (deser-language-name (input "LanguageName"))) (clojure.core/contains? input "Name") (clojure.core/assoc :name (deser-voice-name (input "Name"))) (clojure.core/contains? input "AdditionalLanguageCodes") (clojure.core/assoc :additional-language-codes (deser-language-code-list (input "AdditionalLanguageCodes")))))

(clojure.core/defn- deser-speech-mark-type [input] (clojure.core/get {"sentence" :sentence, "ssml" :ssml, "viseme" :viseme, "word" :word} input))

(clojure.core/defn- deser-task-status [input] (clojure.core/get {"scheduled" :scheduled, "inProgress" :in-progress, "completed" :completed, "failed" :failed} input))

(clojure.core/defn- deser-date-time [input] input)

(clojure.core/defn- deser-lexicon-description-list [input] (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (deser-lexicon-description coll))) input))

(clojure.core/defn- response-list-lexicons-output ([input] (response-list-lexicons-output nil input)) ([resultWrapper431361 input] (clojure.core/let [rawinput431360 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar431362 {"Lexicons" (rawinput431360 "Lexicons"), "NextToken" (rawinput431360 "NextToken")}] (clojure.core/cond-> {} (letvar431362 "Lexicons") (clojure.core/assoc :lexicons (deser-lexicon-description-list (clojure.core/get-in letvar431362 ["Lexicons"]))) (letvar431362 "NextToken") (clojure.core/assoc :next-token (deser-next-token (clojure.core/get-in letvar431362 ["NextToken"])))))))

(clojure.core/defn- response-max-lexeme-length-exceeded-exception ([input] (response-max-lexeme-length-exceeded-exception nil input)) ([resultWrapper431364 input] (clojure.core/let [rawinput431363 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar431365 {"message" (rawinput431363 "message")}] (clojure.core/cond-> {} (letvar431365 "message") (clojure.core/assoc :message (deser-error-message (clojure.core/get-in letvar431365 ["message"])))))))

(clojure.core/defn- response-invalid-ssml-exception ([input] (response-invalid-ssml-exception nil input)) ([resultWrapper431367 input] (clojure.core/let [rawinput431366 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar431368 {"message" (rawinput431366 "message")}] (clojure.core/cond-> {} (letvar431368 "message") (clojure.core/assoc :message (deser-error-message (clojure.core/get-in letvar431368 ["message"])))))))

(clojure.core/defn- response-unsupported-pls-alphabet-exception ([input] (response-unsupported-pls-alphabet-exception nil input)) ([resultWrapper431370 input] (clojure.core/let [rawinput431369 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar431371 {"message" (rawinput431369 "message")}] (clojure.core/cond-> {} (letvar431371 "message") (clojure.core/assoc :message (deser-error-message (clojure.core/get-in letvar431371 ["message"])))))))

(clojure.core/defn- response-invalid-sns-topic-arn-exception ([input] (response-invalid-sns-topic-arn-exception nil input)) ([resultWrapper431373 input] (clojure.core/let [rawinput431372 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar431374 {"message" (rawinput431372 "message")}] (clojure.core/cond-> {} (letvar431374 "message") (clojure.core/assoc :message (deser-error-message (clojure.core/get-in letvar431374 ["message"])))))))

(clojure.core/defn- response-list-speech-synthesis-tasks-output ([input] (response-list-speech-synthesis-tasks-output nil input)) ([resultWrapper431376 input] (clojure.core/let [rawinput431375 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar431377 {"NextToken" (rawinput431375 "NextToken"), "SynthesisTasks" (rawinput431375 "SynthesisTasks")}] (clojure.core/cond-> {} (letvar431377 "NextToken") (clojure.core/assoc :next-token (deser-next-token (clojure.core/get-in letvar431377 ["NextToken"]))) (letvar431377 "SynthesisTasks") (clojure.core/assoc :synthesis-tasks (deser-synthesis-tasks (clojure.core/get-in letvar431377 ["SynthesisTasks"])))))))

(clojure.core/defn- response-get-lexicon-output ([input] (response-get-lexicon-output nil input)) ([resultWrapper431379 input] (clojure.core/let [rawinput431378 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar431380 {"Lexicon" (rawinput431378 "Lexicon"), "LexiconAttributes" (rawinput431378 "LexiconAttributes")}] (clojure.core/cond-> {} (letvar431380 "Lexicon") (clojure.core/assoc :lexicon (deser-lexicon (clojure.core/get-in letvar431380 ["Lexicon"]))) (letvar431380 "LexiconAttributes") (clojure.core/assoc :lexicon-attributes (deser-lexicon-attributes (clojure.core/get-in letvar431380 ["LexiconAttributes"])))))))

(clojure.core/defn- response-describe-voices-output ([input] (response-describe-voices-output nil input)) ([resultWrapper431382 input] (clojure.core/let [rawinput431381 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar431383 {"Voices" (rawinput431381 "Voices"), "NextToken" (rawinput431381 "NextToken")}] (clojure.core/cond-> {} (letvar431383 "Voices") (clojure.core/assoc :voices (deser-voice-list (clojure.core/get-in letvar431383 ["Voices"]))) (letvar431383 "NextToken") (clojure.core/assoc :next-token (deser-next-token (clojure.core/get-in letvar431383 ["NextToken"])))))))

(clojure.core/defn- response-ssml-marks-not-supported-for-text-type-exception ([input] (response-ssml-marks-not-supported-for-text-type-exception nil input)) ([resultWrapper431385 input] (clojure.core/let [rawinput431384 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar431386 {"message" (rawinput431384 "message")}] (clojure.core/cond-> {} (letvar431386 "message") (clojure.core/assoc :message (deser-error-message (clojure.core/get-in letvar431386 ["message"])))))))

(clojure.core/defn- response-max-lexicons-number-exceeded-exception ([input] (response-max-lexicons-number-exceeded-exception nil input)) ([resultWrapper431388 input] (clojure.core/let [rawinput431387 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar431389 {"message" (rawinput431387 "message")}] (clojure.core/cond-> {} (letvar431389 "message") (clojure.core/assoc :message (deser-error-message (clojure.core/get-in letvar431389 ["message"])))))))

(clojure.core/defn- response-synthesize-speech-output ([input] (response-synthesize-speech-output nil input)) ([resultWrapper431391 input] (clojure.core/let [rawinput431390 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar431392 {"AudioStream" (rawinput431390 "AudioStream"), "Content-Type" (clojure.core/get-in input [:headers "Content-Type"]), "x-amzn-RequestCharacters" (clojure.core/get-in input [:headers "x-amzn-RequestCharacters"])}] (clojure.core/cond-> {} (letvar431392 "AudioStream") (clojure.core/assoc :audio-stream (deser-audio-stream (clojure.core/get-in letvar431392 ["AudioStream"]))) (letvar431392 "Content-Type") (clojure.core/assoc :content-type (deser-content-type (clojure.core/get-in letvar431392 ["Content-Type"]))) (letvar431392 "x-amzn-RequestCharacters") (clojure.core/assoc :request-characters (deser-request-characters (clojure.core/get-in letvar431392 ["x-amzn-RequestCharacters"])))))))

(clojure.core/defn- response-invalid-s-3-bucket-exception ([input] (response-invalid-s-3-bucket-exception nil input)) ([resultWrapper431394 input] (clojure.core/let [rawinput431393 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar431395 {"message" (rawinput431393 "message")}] (clojure.core/cond-> {} (letvar431395 "message") (clojure.core/assoc :message (deser-error-message (clojure.core/get-in letvar431395 ["message"])))))))

(clojure.core/defn- response-service-failure-exception ([input] (response-service-failure-exception nil input)) ([resultWrapper431397 input] (clojure.core/let [rawinput431396 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar431398 {"message" (rawinput431396 "message")}] (clojure.core/cond-> {} (letvar431398 "message") (clojure.core/assoc :message (deser-error-message (clojure.core/get-in letvar431398 ["message"])))))))

(clojure.core/defn- response-text-length-exceeded-exception ([input] (response-text-length-exceeded-exception nil input)) ([resultWrapper431400 input] (clojure.core/let [rawinput431399 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar431401 {"message" (rawinput431399 "message")}] (clojure.core/cond-> {} (letvar431401 "message") (clojure.core/assoc :message (deser-error-message (clojure.core/get-in letvar431401 ["message"])))))))

(clojure.core/defn- response-invalid-sample-rate-exception ([input] (response-invalid-sample-rate-exception nil input)) ([resultWrapper431403 input] (clojure.core/let [rawinput431402 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar431404 {"message" (rawinput431402 "message")}] (clojure.core/cond-> {} (letvar431404 "message") (clojure.core/assoc :message (deser-error-message (clojure.core/get-in letvar431404 ["message"])))))))

(clojure.core/defn- response-invalid-next-token-exception ([input] (response-invalid-next-token-exception nil input)) ([resultWrapper431406 input] (clojure.core/let [rawinput431405 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar431407 {"message" (rawinput431405 "message")}] (clojure.core/cond-> {} (letvar431407 "message") (clojure.core/assoc :message (deser-error-message (clojure.core/get-in letvar431407 ["message"])))))))

(clojure.core/defn- response-unsupported-pls-language-exception ([input] (response-unsupported-pls-language-exception nil input)) ([resultWrapper431409 input] (clojure.core/let [rawinput431408 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar431410 {"message" (rawinput431408 "message")}] (clojure.core/cond-> {} (letvar431410 "message") (clojure.core/assoc :message (deser-error-message (clojure.core/get-in letvar431410 ["message"])))))))

(clojure.core/defn- response-synthesis-task-not-found-exception ([input] (response-synthesis-task-not-found-exception nil input)) ([resultWrapper431412 input] (clojure.core/let [rawinput431411 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar431413 {"message" (rawinput431411 "message")}] (clojure.core/cond-> {} (letvar431413 "message") (clojure.core/assoc :message (deser-error-message (clojure.core/get-in letvar431413 ["message"])))))))

(clojure.core/defn- response-language-not-supported-exception ([input] (response-language-not-supported-exception nil input)) ([resultWrapper431415 input] (clojure.core/let [rawinput431414 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar431416 {"message" (rawinput431414 "message")}] (clojure.core/cond-> {} (letvar431416 "message") (clojure.core/assoc :message (deser-error-message (clojure.core/get-in letvar431416 ["message"])))))))

(clojure.core/defn- response-put-lexicon-output ([input] (response-put-lexicon-output nil input)) ([resultWrapper431418 input] (clojure.core/let [rawinput431417 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar431419 {}] (clojure.core/cond-> {}))))

(clojure.core/defn- response-delete-lexicon-output ([input] (response-delete-lexicon-output nil input)) ([resultWrapper431421 input] (clojure.core/let [rawinput431420 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar431422 {}] (clojure.core/cond-> {}))))

(clojure.core/defn- response-invalid-s-3-key-exception ([input] (response-invalid-s-3-key-exception nil input)) ([resultWrapper431424 input] (clojure.core/let [rawinput431423 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar431425 {"message" (rawinput431423 "message")}] (clojure.core/cond-> {} (letvar431425 "message") (clojure.core/assoc :message (deser-error-message (clojure.core/get-in letvar431425 ["message"])))))))

(clojure.core/defn- response-invalid-task-id-exception ([input] (response-invalid-task-id-exception nil input)) ([resultWrapper431427 input] (clojure.core/let [rawinput431426 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar431428 {"message" (rawinput431426 "message")}] (clojure.core/cond-> {} (letvar431428 "message") (clojure.core/assoc :message (deser-error-message (clojure.core/get-in letvar431428 ["message"])))))))

(clojure.core/defn- response-lexicon-not-found-exception ([input] (response-lexicon-not-found-exception nil input)) ([resultWrapper431430 input] (clojure.core/let [rawinput431429 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar431431 {"message" (rawinput431429 "message")}] (clojure.core/cond-> {} (letvar431431 "message") (clojure.core/assoc :message (deser-error-message (clojure.core/get-in letvar431431 ["message"])))))))

(clojure.core/defn- response-invalid-lexicon-exception ([input] (response-invalid-lexicon-exception nil input)) ([resultWrapper431433 input] (clojure.core/let [rawinput431432 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar431434 {"message" (rawinput431432 "message")}] (clojure.core/cond-> {} (letvar431434 "message") (clojure.core/assoc :message (deser-error-message (clojure.core/get-in letvar431434 ["message"])))))))

(clojure.core/defn- response-lexicon-size-exceeded-exception ([input] (response-lexicon-size-exceeded-exception nil input)) ([resultWrapper431436 input] (clojure.core/let [rawinput431435 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar431437 {"message" (rawinput431435 "message")}] (clojure.core/cond-> {} (letvar431437 "message") (clojure.core/assoc :message (deser-error-message (clojure.core/get-in letvar431437 ["message"])))))))

(clojure.core/defn- response-marks-not-supported-for-format-exception ([input] (response-marks-not-supported-for-format-exception nil input)) ([resultWrapper431439 input] (clojure.core/let [rawinput431438 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar431440 {"message" (rawinput431438 "message")}] (clojure.core/cond-> {} (letvar431440 "message") (clojure.core/assoc :message (deser-error-message (clojure.core/get-in letvar431440 ["message"])))))))

(clojure.core/defn- response-start-speech-synthesis-task-output ([input] (response-start-speech-synthesis-task-output nil input)) ([resultWrapper431442 input] (clojure.core/let [rawinput431441 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar431443 {"SynthesisTask" (rawinput431441 "SynthesisTask")}] (clojure.core/cond-> {} (letvar431443 "SynthesisTask") (clojure.core/assoc :synthesis-task (deser-synthesis-task (clojure.core/get-in letvar431443 ["SynthesisTask"])))))))

(clojure.core/defn- response-get-speech-synthesis-task-output ([input] (response-get-speech-synthesis-task-output nil input)) ([resultWrapper431445 input] (clojure.core/let [rawinput431444 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar431446 {"SynthesisTask" (rawinput431444 "SynthesisTask")}] (clojure.core/cond-> {} (letvar431446 "SynthesisTask") (clojure.core/assoc :synthesis-task (deser-synthesis-task (clojure.core/get-in letvar431446 ["SynthesisTask"])))))))

(clojure.spec.alpha/def :portkey.aws.polly.-2016-06-10.list-lexicons-output/lexicons (clojure.spec.alpha/and :portkey.aws.polly.-2016-06-10/lexicon-description-list))
(clojure.spec.alpha/def :portkey.aws.polly.-2016-06-10/list-lexicons-output (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.polly.-2016-06-10.list-lexicons-output/lexicons :portkey.aws.polly.-2016-06-10/next-token]))

(clojure.spec.alpha/def :portkey.aws.polly.-2016-06-10/get-speech-synthesis-task-input (clojure.spec.alpha/keys :req-un [:portkey.aws.polly.-2016-06-10/task-id] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.polly.-2016-06-10.max-lexeme-length-exceeded-exception/message (clojure.spec.alpha/and :portkey.aws.polly.-2016-06-10/error-message))
(clojure.spec.alpha/def :portkey.aws.polly.-2016-06-10/max-lexeme-length-exceeded-exception (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.polly.-2016-06-10.max-lexeme-length-exceeded-exception/message]))

(clojure.spec.alpha/def :portkey.aws.polly.-2016-06-10/lexicon-arn (clojure.spec.alpha/and clojure.core/string?))

(clojure.spec.alpha/def :portkey.aws.polly.-2016-06-10.invalid-ssml-exception/message (clojure.spec.alpha/and :portkey.aws.polly.-2016-06-10/error-message))
(clojure.spec.alpha/def :portkey.aws.polly.-2016-06-10/invalid-ssml-exception (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.polly.-2016-06-10.invalid-ssml-exception/message]))

(clojure.spec.alpha/def :portkey.aws.polly.-2016-06-10.unsupported-pls-alphabet-exception/message (clojure.spec.alpha/and :portkey.aws.polly.-2016-06-10/error-message))
(clojure.spec.alpha/def :portkey.aws.polly.-2016-06-10/unsupported-pls-alphabet-exception (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.polly.-2016-06-10.unsupported-pls-alphabet-exception/message]))

(clojure.spec.alpha/def :portkey.aws.polly.-2016-06-10.invalid-sns-topic-arn-exception/message (clojure.spec.alpha/and :portkey.aws.polly.-2016-06-10/error-message))
(clojure.spec.alpha/def :portkey.aws.polly.-2016-06-10/invalid-sns-topic-arn-exception (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.polly.-2016-06-10.invalid-sns-topic-arn-exception/message]))

(clojure.spec.alpha/def :portkey.aws.polly.-2016-06-10/list-speech-synthesis-tasks-output (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.polly.-2016-06-10/next-token :portkey.aws.polly.-2016-06-10/synthesis-tasks]))

(clojure.spec.alpha/def :portkey.aws.polly.-2016-06-10.start-speech-synthesis-task-input/speech-mark-types (clojure.spec.alpha/and :portkey.aws.polly.-2016-06-10/speech-mark-type-list))
(clojure.spec.alpha/def :portkey.aws.polly.-2016-06-10.start-speech-synthesis-task-input/lexicon-names (clojure.spec.alpha/and :portkey.aws.polly.-2016-06-10/lexicon-name-list))
(clojure.spec.alpha/def :portkey.aws.polly.-2016-06-10/start-speech-synthesis-task-input (clojure.spec.alpha/keys :req-un [:portkey.aws.polly.-2016-06-10/output-format :portkey.aws.polly.-2016-06-10/output-s-3-bucket-name :portkey.aws.polly.-2016-06-10/text :portkey.aws.polly.-2016-06-10/voice-id] :opt-un [:portkey.aws.polly.-2016-06-10/sample-rate :portkey.aws.polly.-2016-06-10/text-type :portkey.aws.polly.-2016-06-10.start-speech-synthesis-task-input/speech-mark-types :portkey.aws.polly.-2016-06-10.start-speech-synthesis-task-input/lexicon-names :portkey.aws.polly.-2016-06-10/language-code :portkey.aws.polly.-2016-06-10/sns-topic-arn :portkey.aws.polly.-2016-06-10/output-s-3-key-prefix]))

(clojure.spec.alpha/def :portkey.aws.polly.-2016-06-10/get-lexicon-output (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.polly.-2016-06-10/lexicon :portkey.aws.polly.-2016-06-10/lexicon-attributes]))

(clojure.spec.alpha/def :portkey.aws.polly.-2016-06-10.delete-lexicon-input/name (clojure.spec.alpha/and :portkey.aws.polly.-2016-06-10/lexicon-name))
(clojure.spec.alpha/def :portkey.aws.polly.-2016-06-10/delete-lexicon-input (clojure.spec.alpha/keys :req-un [:portkey.aws.polly.-2016-06-10.delete-lexicon-input/name] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.polly.-2016-06-10.describe-voices-output/voices (clojure.spec.alpha/and :portkey.aws.polly.-2016-06-10/voice-list))
(clojure.spec.alpha/def :portkey.aws.polly.-2016-06-10/describe-voices-output (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.polly.-2016-06-10.describe-voices-output/voices :portkey.aws.polly.-2016-06-10/next-token]))

(clojure.spec.alpha/def :portkey.aws.polly.-2016-06-10.ssml-marks-not-supported-for-text-type-exception/message (clojure.spec.alpha/and :portkey.aws.polly.-2016-06-10/error-message))
(clojure.spec.alpha/def :portkey.aws.polly.-2016-06-10/ssml-marks-not-supported-for-text-type-exception (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.polly.-2016-06-10.ssml-marks-not-supported-for-text-type-exception/message]))

(clojure.spec.alpha/def :portkey.aws.polly.-2016-06-10.max-lexicons-number-exceeded-exception/message (clojure.spec.alpha/and :portkey.aws.polly.-2016-06-10/error-message))
(clojure.spec.alpha/def :portkey.aws.polly.-2016-06-10/max-lexicons-number-exceeded-exception (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.polly.-2016-06-10.max-lexicons-number-exceeded-exception/message]))

(clojure.spec.alpha/def :portkey.aws.polly.-2016-06-10/sample-rate (clojure.spec.alpha/and clojure.core/string?))

(clojure.spec.alpha/def :portkey.aws.polly.-2016-06-10/request-characters clojure.core/int?)

(clojure.spec.alpha/def :portkey.aws.polly.-2016-06-10/lexicon-name-list (clojure.spec.alpha/coll-of :portkey.aws.polly.-2016-06-10/lexicon-name :max-count 5))

(clojure.spec.alpha/def :portkey.aws.polly.-2016-06-10/synthesize-speech-output (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.polly.-2016-06-10/audio-stream :portkey.aws.polly.-2016-06-10/content-type :portkey.aws.polly.-2016-06-10/request-characters]))

(clojure.spec.alpha/def :portkey.aws.polly.-2016-06-10.invalid-s-3-bucket-exception/message (clojure.spec.alpha/and :portkey.aws.polly.-2016-06-10/error-message))
(clojure.spec.alpha/def :portkey.aws.polly.-2016-06-10/invalid-s-3-bucket-exception (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.polly.-2016-06-10.invalid-s-3-bucket-exception/message]))

(clojure.spec.alpha/def :portkey.aws.polly.-2016-06-10.service-failure-exception/message (clojure.spec.alpha/and :portkey.aws.polly.-2016-06-10/error-message))
(clojure.spec.alpha/def :portkey.aws.polly.-2016-06-10/service-failure-exception (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.polly.-2016-06-10.service-failure-exception/message]))

(clojure.spec.alpha/def :portkey.aws.polly.-2016-06-10/output-s-3-bucket-name (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__21112__auto__] (clojure.core/re-matches #"^[a-z0-9][\.\-a-z0-9]{1,61}[a-z0-9]$" s__21112__auto__))))

(clojure.spec.alpha/def :portkey.aws.polly.-2016-06-10.put-lexicon-input/name (clojure.spec.alpha/and :portkey.aws.polly.-2016-06-10/lexicon-name))
(clojure.spec.alpha/def :portkey.aws.polly.-2016-06-10.put-lexicon-input/content (clojure.spec.alpha/and :portkey.aws.polly.-2016-06-10/lexicon-content))
(clojure.spec.alpha/def :portkey.aws.polly.-2016-06-10/put-lexicon-input (clojure.spec.alpha/keys :req-un [:portkey.aws.polly.-2016-06-10.put-lexicon-input/name :portkey.aws.polly.-2016-06-10.put-lexicon-input/content] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.polly.-2016-06-10/language-code-list (clojure.spec.alpha/coll-of :portkey.aws.polly.-2016-06-10/language-code))

(clojure.spec.alpha/def :portkey.aws.polly.-2016-06-10/task-id (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__21110__auto__] (clojure.core/<= 1 (clojure.core/count s__21110__auto__))) (clojure.core/fn [s__21111__auto__] (clojure.core/< (clojure.core/count s__21111__auto__) 128))))

(clojure.spec.alpha/def :portkey.aws.polly.-2016-06-10/text-type #{"ssml" :ssml "text" :text})

(clojure.spec.alpha/def :portkey.aws.polly.-2016-06-10.lexicon/content (clojure.spec.alpha/and :portkey.aws.polly.-2016-06-10/lexicon-content))
(clojure.spec.alpha/def :portkey.aws.polly.-2016-06-10.lexicon/name (clojure.spec.alpha/and :portkey.aws.polly.-2016-06-10/lexicon-name))
(clojure.spec.alpha/def :portkey.aws.polly.-2016-06-10/lexicon (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.polly.-2016-06-10.lexicon/content :portkey.aws.polly.-2016-06-10.lexicon/name]))

(clojure.spec.alpha/def :portkey.aws.polly.-2016-06-10/lexemes-count clojure.core/int?)

(clojure.spec.alpha/def :portkey.aws.polly.-2016-06-10.text-length-exceeded-exception/message (clojure.spec.alpha/and :portkey.aws.polly.-2016-06-10/error-message))
(clojure.spec.alpha/def :portkey.aws.polly.-2016-06-10/text-length-exceeded-exception (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.polly.-2016-06-10.text-length-exceeded-exception/message]))

(clojure.spec.alpha/def :portkey.aws.polly.-2016-06-10/gender #{:female :male "Male" "Female"})

(clojure.spec.alpha/def :portkey.aws.polly.-2016-06-10/lexicon-name (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__21112__auto__] (clojure.core/re-matches #"[0-9A-Za-z]{1,20}" s__21112__auto__))))

(clojure.spec.alpha/def :portkey.aws.polly.-2016-06-10.invalid-sample-rate-exception/message (clojure.spec.alpha/and :portkey.aws.polly.-2016-06-10/error-message))
(clojure.spec.alpha/def :portkey.aws.polly.-2016-06-10/invalid-sample-rate-exception (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.polly.-2016-06-10.invalid-sample-rate-exception/message]))

(clojure.spec.alpha/def :portkey.aws.polly.-2016-06-10/next-token (clojure.spec.alpha/and clojure.core/string?))

(clojure.spec.alpha/def :portkey.aws.polly.-2016-06-10/output-uri (clojure.spec.alpha/and clojure.core/string?))

(clojure.spec.alpha/def :portkey.aws.polly.-2016-06-10/voice-name (clojure.spec.alpha/and clojure.core/string?))

(clojure.spec.alpha/def :portkey.aws.polly.-2016-06-10/error-message (clojure.spec.alpha/and clojure.core/string?))

(clojure.spec.alpha/def :portkey.aws.polly.-2016-06-10/voice-list (clojure.spec.alpha/coll-of :portkey.aws.polly.-2016-06-10/voice))

(clojure.spec.alpha/def :portkey.aws.polly.-2016-06-10.invalid-next-token-exception/message (clojure.spec.alpha/and :portkey.aws.polly.-2016-06-10/error-message))
(clojure.spec.alpha/def :portkey.aws.polly.-2016-06-10/invalid-next-token-exception (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.polly.-2016-06-10.invalid-next-token-exception/message]))

(clojure.spec.alpha/def :portkey.aws.polly.-2016-06-10/list-lexicons-input (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.polly.-2016-06-10/next-token]))

(clojure.spec.alpha/def :portkey.aws.polly.-2016-06-10/language-name (clojure.spec.alpha/and clojure.core/string?))

(clojure.spec.alpha/def :portkey.aws.polly.-2016-06-10.synthesis-task/speech-mark-types (clojure.spec.alpha/and :portkey.aws.polly.-2016-06-10/speech-mark-type-list))
(clojure.spec.alpha/def :portkey.aws.polly.-2016-06-10.synthesis-task/lexicon-names (clojure.spec.alpha/and :portkey.aws.polly.-2016-06-10/lexicon-name-list))
(clojure.spec.alpha/def :portkey.aws.polly.-2016-06-10.synthesis-task/creation-time (clojure.spec.alpha/and :portkey.aws.polly.-2016-06-10/date-time))
(clojure.spec.alpha/def :portkey.aws.polly.-2016-06-10/synthesis-task (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.polly.-2016-06-10/sample-rate :portkey.aws.polly.-2016-06-10/request-characters :portkey.aws.polly.-2016-06-10/task-id :portkey.aws.polly.-2016-06-10/text-type :portkey.aws.polly.-2016-06-10.synthesis-task/speech-mark-types :portkey.aws.polly.-2016-06-10/output-uri :portkey.aws.polly.-2016-06-10.synthesis-task/lexicon-names :portkey.aws.polly.-2016-06-10/output-format :portkey.aws.polly.-2016-06-10/language-code :portkey.aws.polly.-2016-06-10/sns-topic-arn :portkey.aws.polly.-2016-06-10/task-status-reason :portkey.aws.polly.-2016-06-10.synthesis-task/creation-time :portkey.aws.polly.-2016-06-10/voice-id :portkey.aws.polly.-2016-06-10/task-status]))

(clojure.spec.alpha/def :portkey.aws.polly.-2016-06-10.unsupported-pls-language-exception/message (clojure.spec.alpha/and :portkey.aws.polly.-2016-06-10/error-message))
(clojure.spec.alpha/def :portkey.aws.polly.-2016-06-10/unsupported-pls-language-exception (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.polly.-2016-06-10.unsupported-pls-language-exception/message]))

(clojure.spec.alpha/def :portkey.aws.polly.-2016-06-10.synthesis-task-not-found-exception/message (clojure.spec.alpha/and :portkey.aws.polly.-2016-06-10/error-message))
(clojure.spec.alpha/def :portkey.aws.polly.-2016-06-10/synthesis-task-not-found-exception (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.polly.-2016-06-10.synthesis-task-not-found-exception/message]))

(clojure.spec.alpha/def :portkey.aws.polly.-2016-06-10.language-not-supported-exception/message (clojure.spec.alpha/and :portkey.aws.polly.-2016-06-10/error-message))
(clojure.spec.alpha/def :portkey.aws.polly.-2016-06-10/language-not-supported-exception (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.polly.-2016-06-10.language-not-supported-exception/message]))

(clojure.spec.alpha/def :portkey.aws.polly.-2016-06-10/content-type (clojure.spec.alpha/and clojure.core/string?))

(clojure.spec.alpha/def :portkey.aws.polly.-2016-06-10.get-lexicon-input/name (clojure.spec.alpha/and :portkey.aws.polly.-2016-06-10/lexicon-name))
(clojure.spec.alpha/def :portkey.aws.polly.-2016-06-10/get-lexicon-input (clojure.spec.alpha/keys :req-un [:portkey.aws.polly.-2016-06-10.get-lexicon-input/name] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.polly.-2016-06-10/put-lexicon-output (clojure.spec.alpha/keys :req-un [] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.polly.-2016-06-10/output-format #{"json" "mp3" :mp-3 "pcm" "ogg_vorbis" :pcm :ogg-vorbis :json})

(clojure.spec.alpha/def :portkey.aws.polly.-2016-06-10/delete-lexicon-output (clojure.spec.alpha/keys :req-un [] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.polly.-2016-06-10/language-code #{"it-IT" :ja-jp :pt-pt "de-DE" :en-au :ko-kr :es-es :en-gb :nl-nl :ro-ro "en-AU" :hi-in "en-IN" :fr-fr :en-gbwls "da-DK" "tr-TR" :it-it "es-US" :da-dk :de-de "pt-BR" :cmn-cn "cmn-CN" :ru-ru :tr-tr :pt-br "hi-IN" "nl-NL" "es-MX" :pl-pl "fr-CA" "ja-JP" :cy-gb "en-US" :nb-no "cy-GB" :es-mx "fr-FR" "en-GB" "ru-RU" "ro-RO" :fr-ca :sv-se "ko-KR" "es-ES" "en-GB-WLS" "pt-PT" :en-in :en-us "pl-PL" "is-IS" "sv-SE" "nb-NO" :is-is :es-us})

(clojure.spec.alpha/def :portkey.aws.polly.-2016-06-10/lexicon-attributes (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.polly.-2016-06-10/alphabet :portkey.aws.polly.-2016-06-10/language-code :portkey.aws.polly.-2016-06-10/last-modified :portkey.aws.polly.-2016-06-10/lexicon-arn :portkey.aws.polly.-2016-06-10/lexemes-count :portkey.aws.polly.-2016-06-10/size]))

(clojure.spec.alpha/def :portkey.aws.polly.-2016-06-10/last-modified clojure.core/inst?)

(clojure.spec.alpha/def :portkey.aws.polly.-2016-06-10/speech-mark-type-list (clojure.spec.alpha/coll-of :portkey.aws.polly.-2016-06-10/speech-mark-type :max-count 4))

(clojure.spec.alpha/def :portkey.aws.polly.-2016-06-10/sns-topic-arn (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__21112__auto__] (clojure.core/re-matches #"^arn:aws(-(cn|iso(-b)?|us-gov))?:sns:.*:\w{12}:.+$" s__21112__auto__))))

(clojure.spec.alpha/def :portkey.aws.polly.-2016-06-10/synthesis-tasks (clojure.spec.alpha/coll-of :portkey.aws.polly.-2016-06-10/synthesis-task))

(clojure.spec.alpha/def :portkey.aws.polly.-2016-06-10.lexicon-description/name (clojure.spec.alpha/and :portkey.aws.polly.-2016-06-10/lexicon-name))
(clojure.spec.alpha/def :portkey.aws.polly.-2016-06-10.lexicon-description/attributes (clojure.spec.alpha/and :portkey.aws.polly.-2016-06-10/lexicon-attributes))
(clojure.spec.alpha/def :portkey.aws.polly.-2016-06-10/lexicon-description (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.polly.-2016-06-10.lexicon-description/name :portkey.aws.polly.-2016-06-10.lexicon-description/attributes]))

(clojure.spec.alpha/def :portkey.aws.polly.-2016-06-10.list-speech-synthesis-tasks-input/status (clojure.spec.alpha/and :portkey.aws.polly.-2016-06-10/task-status))
(clojure.spec.alpha/def :portkey.aws.polly.-2016-06-10/list-speech-synthesis-tasks-input (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.polly.-2016-06-10/max-results :portkey.aws.polly.-2016-06-10/next-token :portkey.aws.polly.-2016-06-10.list-speech-synthesis-tasks-input/status]))

(clojure.spec.alpha/def :portkey.aws.polly.-2016-06-10/size clojure.core/int?)

(clojure.spec.alpha/def :portkey.aws.polly.-2016-06-10/lexicon-content (clojure.spec.alpha/and clojure.core/string?))

(clojure.spec.alpha/def :portkey.aws.polly.-2016-06-10.invalid-s-3-key-exception/message (clojure.spec.alpha/and :portkey.aws.polly.-2016-06-10/error-message))
(clojure.spec.alpha/def :portkey.aws.polly.-2016-06-10/invalid-s-3-key-exception (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.polly.-2016-06-10.invalid-s-3-key-exception/message]))

(clojure.spec.alpha/def :portkey.aws.polly.-2016-06-10.invalid-task-id-exception/message (clojure.spec.alpha/and :portkey.aws.polly.-2016-06-10/error-message))
(clojure.spec.alpha/def :portkey.aws.polly.-2016-06-10/invalid-task-id-exception (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.polly.-2016-06-10.invalid-task-id-exception/message]))

(clojure.spec.alpha/def :portkey.aws.polly.-2016-06-10.lexicon-not-found-exception/message (clojure.spec.alpha/and :portkey.aws.polly.-2016-06-10/error-message))
(clojure.spec.alpha/def :portkey.aws.polly.-2016-06-10/lexicon-not-found-exception (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.polly.-2016-06-10.lexicon-not-found-exception/message]))

(clojure.spec.alpha/def :portkey.aws.polly.-2016-06-10/task-status-reason (clojure.spec.alpha/and clojure.core/string?))

(clojure.spec.alpha/def :portkey.aws.polly.-2016-06-10/include-additional-language-codes clojure.core/boolean?)

(clojure.spec.alpha/def :portkey.aws.polly.-2016-06-10.invalid-lexicon-exception/message (clojure.spec.alpha/and :portkey.aws.polly.-2016-06-10/error-message))
(clojure.spec.alpha/def :portkey.aws.polly.-2016-06-10/invalid-lexicon-exception (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.polly.-2016-06-10.invalid-lexicon-exception/message]))

(clojure.spec.alpha/def :portkey.aws.polly.-2016-06-10/output-s-3-key-prefix (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__21112__auto__] (clojure.core/re-matches #"^[0-9a-zA-Z\/\!\-_\.\*\'\(\)]{0,800}$" s__21112__auto__))))

(clojure.spec.alpha/def :portkey.aws.polly.-2016-06-10/voice-id #{"Filiz" :joey "Joanna" :lea "Amy" "Marlene" :astrid "Salli" :zhiyu :maja :matthew "Ricardo" :tatyana "Mathieu" "Enrique" :lotte :ewa "Nicole" "Russell" :giorgio "Gwyneth" :seoyeon "Aditi" "Conchita" :jan :lucia :dora :justin "Joey" :bianca "Chantal" :russell :amy "Ines" "Hans" "Penelope" :conchita "Mizuki" "Lucia" "Takumi" "Maja" "Miguel" "Lea" "Kendra" "Karl" "Mads" :gwyneth :emma "Carla" "Geraint" "Astrid" "Celine" :maxim "Seoyeon" "Vicki" :aditi "Matthew" "Jan" "Mia" :mads :liv "Lotte" :celine :jacek :vitoria :miguel "Kimberly" :filiz "Liv" "Brian" "Cristiano" "Ewa" "Maxim" :mathieu "Vitoria" :karl :salli :hans "Giorgio" "Justin" :mizuki "Emma" :joanna "Raveena" :ricardo :vicki "Carmen" "Jacek" :raveena "Naja" :takumi :penelope :carmen "Ivy" :naja :ivy "Tatyana" :carla "Zhiyu" :chantal :mia "Ruben" :kendra :kimberly :geraint "Bianca" :nicole :brian :marlene :enrique "Dora" :ines :ruben :cristiano})

(clojure.spec.alpha/def :portkey.aws.polly.-2016-06-10.synthesize-speech-input/lexicon-names (clojure.spec.alpha/and :portkey.aws.polly.-2016-06-10/lexicon-name-list))
(clojure.spec.alpha/def :portkey.aws.polly.-2016-06-10.synthesize-speech-input/speech-mark-types (clojure.spec.alpha/and :portkey.aws.polly.-2016-06-10/speech-mark-type-list))
(clojure.spec.alpha/def :portkey.aws.polly.-2016-06-10/synthesize-speech-input (clojure.spec.alpha/keys :req-un [:portkey.aws.polly.-2016-06-10/output-format :portkey.aws.polly.-2016-06-10/text :portkey.aws.polly.-2016-06-10/voice-id] :opt-un [:portkey.aws.polly.-2016-06-10.synthesize-speech-input/lexicon-names :portkey.aws.polly.-2016-06-10/sample-rate :portkey.aws.polly.-2016-06-10.synthesize-speech-input/speech-mark-types :portkey.aws.polly.-2016-06-10/text-type :portkey.aws.polly.-2016-06-10/language-code]))

(clojure.spec.alpha/def :portkey.aws.polly.-2016-06-10/text (clojure.spec.alpha/and clojure.core/string?))

(clojure.spec.alpha/def :portkey.aws.polly.-2016-06-10/audio-stream clojure.core/bytes?)

(clojure.spec.alpha/def :portkey.aws.polly.-2016-06-10/max-results (clojure.spec.alpha/int-in 1 100))

(clojure.spec.alpha/def :portkey.aws.polly.-2016-06-10/describe-voices-input (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.polly.-2016-06-10/language-code :portkey.aws.polly.-2016-06-10/include-additional-language-codes :portkey.aws.polly.-2016-06-10/next-token]))

(clojure.spec.alpha/def :portkey.aws.polly.-2016-06-10.lexicon-size-exceeded-exception/message (clojure.spec.alpha/and :portkey.aws.polly.-2016-06-10/error-message))
(clojure.spec.alpha/def :portkey.aws.polly.-2016-06-10/lexicon-size-exceeded-exception (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.polly.-2016-06-10.lexicon-size-exceeded-exception/message]))

(clojure.spec.alpha/def :portkey.aws.polly.-2016-06-10/alphabet (clojure.spec.alpha/and clojure.core/string?))

(clojure.spec.alpha/def :portkey.aws.polly.-2016-06-10.voice/id (clojure.spec.alpha/and :portkey.aws.polly.-2016-06-10/voice-id))
(clojure.spec.alpha/def :portkey.aws.polly.-2016-06-10.voice/name (clojure.spec.alpha/and :portkey.aws.polly.-2016-06-10/voice-name))
(clojure.spec.alpha/def :portkey.aws.polly.-2016-06-10.voice/additional-language-codes (clojure.spec.alpha/and :portkey.aws.polly.-2016-06-10/language-code-list))
(clojure.spec.alpha/def :portkey.aws.polly.-2016-06-10/voice (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.polly.-2016-06-10/gender :portkey.aws.polly.-2016-06-10.voice/id :portkey.aws.polly.-2016-06-10/language-code :portkey.aws.polly.-2016-06-10/language-name :portkey.aws.polly.-2016-06-10.voice/name :portkey.aws.polly.-2016-06-10.voice/additional-language-codes]))

(clojure.spec.alpha/def :portkey.aws.polly.-2016-06-10.marks-not-supported-for-format-exception/message (clojure.spec.alpha/and :portkey.aws.polly.-2016-06-10/error-message))
(clojure.spec.alpha/def :portkey.aws.polly.-2016-06-10/marks-not-supported-for-format-exception (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.polly.-2016-06-10.marks-not-supported-for-format-exception/message]))

(clojure.spec.alpha/def :portkey.aws.polly.-2016-06-10/speech-mark-type #{"ssml" "word" :sentence :ssml :word "viseme" :viseme "sentence"})

(clojure.spec.alpha/def :portkey.aws.polly.-2016-06-10/task-status #{:in-progress "failed" "scheduled" :completed "completed" "inProgress" :scheduled :failed})

(clojure.spec.alpha/def :portkey.aws.polly.-2016-06-10/start-speech-synthesis-task-output (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.polly.-2016-06-10/synthesis-task]))

(clojure.spec.alpha/def :portkey.aws.polly.-2016-06-10/get-speech-synthesis-task-output (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.polly.-2016-06-10/synthesis-task]))

(clojure.spec.alpha/def :portkey.aws.polly.-2016-06-10/date-time clojure.core/inst?)

(clojure.spec.alpha/def :portkey.aws.polly.-2016-06-10/lexicon-description-list (clojure.spec.alpha/coll-of :portkey.aws.polly.-2016-06-10/lexicon-description))

(clojure.core/defn list-lexicons "Returns a list of pronunciation lexicons stored in an AWS Region. For more\ninformation, see Managing Lexicons\n(http://docs.aws.amazon.com/polly/latest/dg/managing-lexicons.html)." ([] (list-lexicons {})) ([list-lexicons-inputinput] (clojure.core/let [request-function-result__22153__auto__ (req-list-lexicons-input list-lexicons-inputinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__22153__auto__ {:http.request.configuration/endpoints portkey.aws.polly.-2016-06-10/endpoints, :http.request.configuration/target-prefix nil, :http.request.spec/output-spec :portkey.aws.polly.-2016-06-10/list-lexicons-output, :http.request.configuration/mime-type {"content-type" "application/json"}, :http.request.configuration/request-uri "/v1/lexicons", :http.request.configuration/version "2016-06-10", :http.request.configuration/service-id "Polly", :http.request.spec/input-spec :portkey.aws.polly.-2016-06-10/list-lexicons-input, :http.request.configuration/protocol "rest-json", :http.request.configuration/method :get, :http.request.configuration/response-code 200, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "ListLexicons", :http.request.configuration/output-deser-fn response-list-lexicons-output, :http.request.spec/error-spec {"InvalidNextTokenException" :portkey.aws.polly.-2016-06-10/invalid-next-token-exception, "ServiceFailureException" :portkey.aws.polly.-2016-06-10/service-failure-exception}})))))
(clojure.spec.alpha/fdef list-lexicons :args (clojure.spec.alpha/? :portkey.aws.polly.-2016-06-10/list-lexicons-input) :ret (clojure.spec.alpha/and :portkey.aws.polly.-2016-06-10/list-lexicons-output))

(clojure.core/defn start-speech-synthesis-task "Allows the creation of an asynchronous synthesis task, by starting a new\nSpeechSynthesisTask. This operation requires all the standard information needed\nfor speech synthesis, plus the name of an Amazon S3 bucket for the service to\nstore the output of the synthesis task and two optional parameters\n(OutputS3KeyPrefix and SnsTopicArn). Once the synthesis task is created, this\noperation will return a SpeechSynthesisTask object, which will include an\nidentifier of this task as well as the current status." ([start-speech-synthesis-task-inputinput] (clojure.core/let [request-function-result__22153__auto__ (req-start-speech-synthesis-task-input start-speech-synthesis-task-inputinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__22153__auto__ {:http.request.configuration/endpoints portkey.aws.polly.-2016-06-10/endpoints, :http.request.configuration/target-prefix nil, :http.request.spec/output-spec :portkey.aws.polly.-2016-06-10/start-speech-synthesis-task-output, :http.request.configuration/mime-type {"content-type" "application/json"}, :http.request.configuration/request-uri "/v1/synthesisTasks", :http.request.configuration/version "2016-06-10", :http.request.configuration/service-id "Polly", :http.request.spec/input-spec :portkey.aws.polly.-2016-06-10/start-speech-synthesis-task-input, :http.request.configuration/protocol "rest-json", :http.request.configuration/method :post, :http.request.configuration/response-code 200, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "StartSpeechSynthesisTask", :http.request.configuration/output-deser-fn response-start-speech-synthesis-task-output, :http.request.spec/error-spec {"InvalidSsmlException" :portkey.aws.polly.-2016-06-10/invalid-ssml-exception, "InvalidSnsTopicArnException" :portkey.aws.polly.-2016-06-10/invalid-sns-topic-arn-exception, "SsmlMarksNotSupportedForTextTypeException" :portkey.aws.polly.-2016-06-10/ssml-marks-not-supported-for-text-type-exception, "InvalidS3BucketException" :portkey.aws.polly.-2016-06-10/invalid-s-3-bucket-exception, "ServiceFailureException" :portkey.aws.polly.-2016-06-10/service-failure-exception, "TextLengthExceededException" :portkey.aws.polly.-2016-06-10/text-length-exceeded-exception, "InvalidSampleRateException" :portkey.aws.polly.-2016-06-10/invalid-sample-rate-exception, "LanguageNotSupportedException" :portkey.aws.polly.-2016-06-10/language-not-supported-exception, "InvalidS3KeyException" :portkey.aws.polly.-2016-06-10/invalid-s-3-key-exception, "LexiconNotFoundException" :portkey.aws.polly.-2016-06-10/lexicon-not-found-exception, "MarksNotSupportedForFormatException" :portkey.aws.polly.-2016-06-10/marks-not-supported-for-format-exception}})))))
(clojure.spec.alpha/fdef start-speech-synthesis-task :args (clojure.spec.alpha/tuple :portkey.aws.polly.-2016-06-10/start-speech-synthesis-task-input) :ret (clojure.spec.alpha/and :portkey.aws.polly.-2016-06-10/start-speech-synthesis-task-output))

(clojure.core/defn describe-voices "Returns the list of voices that are available for use when requesting speech\nsynthesis. Each voice speaks a specified language, is either male or female, and\nis identified by an ID, which is the ASCII version of the voice name.\n When synthesizing speech ( SynthesizeSpeech ), you provide the voice ID for the\nvoice you want from the list of voices returned by DescribeVoices.\n For example, you want your news reader application to read news in a specific\nlanguage, but giving a user the option to choose the voice. Using the\nDescribeVoices operation you can provide the user with a list of available\nvoices to select from.\n You can optionally specify a language code to filter the available voices. For\nexample, if you specify en-US, the operation returns a list of all available US\nEnglish voices.\n This operation requires permissions to perform the polly:DescribeVoices action." ([] (describe-voices {})) ([describe-voices-inputinput] (clojure.core/let [request-function-result__22153__auto__ (req-describe-voices-input describe-voices-inputinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__22153__auto__ {:http.request.configuration/endpoints portkey.aws.polly.-2016-06-10/endpoints, :http.request.configuration/target-prefix nil, :http.request.spec/output-spec :portkey.aws.polly.-2016-06-10/describe-voices-output, :http.request.configuration/mime-type {"content-type" "application/json"}, :http.request.configuration/request-uri "/v1/voices", :http.request.configuration/version "2016-06-10", :http.request.configuration/service-id "Polly", :http.request.spec/input-spec :portkey.aws.polly.-2016-06-10/describe-voices-input, :http.request.configuration/protocol "rest-json", :http.request.configuration/method :get, :http.request.configuration/response-code 200, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "DescribeVoices", :http.request.configuration/output-deser-fn response-describe-voices-output, :http.request.spec/error-spec {"InvalidNextTokenException" :portkey.aws.polly.-2016-06-10/invalid-next-token-exception, "ServiceFailureException" :portkey.aws.polly.-2016-06-10/service-failure-exception}})))))
(clojure.spec.alpha/fdef describe-voices :args (clojure.spec.alpha/? :portkey.aws.polly.-2016-06-10/describe-voices-input) :ret (clojure.spec.alpha/and :portkey.aws.polly.-2016-06-10/describe-voices-output))

(clojure.core/defn delete-lexicon "Deletes the specified pronunciation lexicon stored in an AWS Region. A lexicon\nwhich has been deleted is not available for speech synthesis, nor is it possible\nto retrieve it using either the GetLexicon or ListLexicon APIs.\n For more information, see Managing Lexicons\n(http://docs.aws.amazon.com/polly/latest/dg/managing-lexicons.html)." ([delete-lexicon-inputinput] (clojure.core/let [request-function-result__22153__auto__ (req-delete-lexicon-input delete-lexicon-inputinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__22153__auto__ {:http.request.configuration/endpoints portkey.aws.polly.-2016-06-10/endpoints, :http.request.configuration/target-prefix nil, :http.request.spec/output-spec :portkey.aws.polly.-2016-06-10/delete-lexicon-output, :http.request.configuration/mime-type {"content-type" "application/json"}, :http.request.configuration/request-uri "/v1/lexicons/{LexiconName}", :http.request.configuration/version "2016-06-10", :http.request.configuration/service-id "Polly", :http.request.spec/input-spec :portkey.aws.polly.-2016-06-10/delete-lexicon-input, :http.request.configuration/protocol "rest-json", :http.request.configuration/method :delete, :http.request.configuration/response-code 200, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "DeleteLexicon", :http.request.configuration/output-deser-fn response-delete-lexicon-output, :http.request.spec/error-spec {"LexiconNotFoundException" :portkey.aws.polly.-2016-06-10/lexicon-not-found-exception, "ServiceFailureException" :portkey.aws.polly.-2016-06-10/service-failure-exception}})))))
(clojure.spec.alpha/fdef delete-lexicon :args (clojure.spec.alpha/tuple :portkey.aws.polly.-2016-06-10/delete-lexicon-input) :ret (clojure.spec.alpha/and :portkey.aws.polly.-2016-06-10/delete-lexicon-output))

(clojure.core/defn get-lexicon "Returns the content of the specified pronunciation lexicon stored in an AWS\nRegion. For more information, see Managing Lexicons\n(http://docs.aws.amazon.com/polly/latest/dg/managing-lexicons.html)." ([get-lexicon-inputinput] (clojure.core/let [request-function-result__22153__auto__ (req-get-lexicon-input get-lexicon-inputinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__22153__auto__ {:http.request.configuration/endpoints portkey.aws.polly.-2016-06-10/endpoints, :http.request.configuration/target-prefix nil, :http.request.spec/output-spec :portkey.aws.polly.-2016-06-10/get-lexicon-output, :http.request.configuration/mime-type {"content-type" "application/json"}, :http.request.configuration/request-uri "/v1/lexicons/{LexiconName}", :http.request.configuration/version "2016-06-10", :http.request.configuration/service-id "Polly", :http.request.spec/input-spec :portkey.aws.polly.-2016-06-10/get-lexicon-input, :http.request.configuration/protocol "rest-json", :http.request.configuration/method :get, :http.request.configuration/response-code 200, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "GetLexicon", :http.request.configuration/output-deser-fn response-get-lexicon-output, :http.request.spec/error-spec {"LexiconNotFoundException" :portkey.aws.polly.-2016-06-10/lexicon-not-found-exception, "ServiceFailureException" :portkey.aws.polly.-2016-06-10/service-failure-exception}})))))
(clojure.spec.alpha/fdef get-lexicon :args (clojure.spec.alpha/tuple :portkey.aws.polly.-2016-06-10/get-lexicon-input) :ret (clojure.spec.alpha/and :portkey.aws.polly.-2016-06-10/get-lexicon-output))

(clojure.core/defn put-lexicon "Stores a pronunciation lexicon in an AWS Region. If a lexicon with the same name\nalready exists in the region, it is overwritten by the new lexicon. Lexicon\noperations have eventual consistency, therefore, it might take some time before\nthe lexicon is available to the SynthesizeSpeech operation.\n For more information, see Managing Lexicons\n(http://docs.aws.amazon.com/polly/latest/dg/managing-lexicons.html)." ([put-lexicon-inputinput] (clojure.core/let [request-function-result__22153__auto__ (req-put-lexicon-input put-lexicon-inputinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__22153__auto__ {:http.request.configuration/endpoints portkey.aws.polly.-2016-06-10/endpoints, :http.request.configuration/target-prefix nil, :http.request.spec/output-spec :portkey.aws.polly.-2016-06-10/put-lexicon-output, :http.request.configuration/mime-type {"content-type" "application/json"}, :http.request.configuration/request-uri "/v1/lexicons/{LexiconName}", :http.request.configuration/version "2016-06-10", :http.request.configuration/service-id "Polly", :http.request.spec/input-spec :portkey.aws.polly.-2016-06-10/put-lexicon-input, :http.request.configuration/protocol "rest-json", :http.request.configuration/method :put, :http.request.configuration/response-code 200, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "PutLexicon", :http.request.configuration/output-deser-fn response-put-lexicon-output, :http.request.spec/error-spec {"InvalidLexiconException" :portkey.aws.polly.-2016-06-10/invalid-lexicon-exception, "UnsupportedPlsAlphabetException" :portkey.aws.polly.-2016-06-10/unsupported-pls-alphabet-exception, "UnsupportedPlsLanguageException" :portkey.aws.polly.-2016-06-10/unsupported-pls-language-exception, "LexiconSizeExceededException" :portkey.aws.polly.-2016-06-10/lexicon-size-exceeded-exception, "MaxLexemeLengthExceededException" :portkey.aws.polly.-2016-06-10/max-lexeme-length-exceeded-exception, "MaxLexiconsNumberExceededException" :portkey.aws.polly.-2016-06-10/max-lexicons-number-exceeded-exception, "ServiceFailureException" :portkey.aws.polly.-2016-06-10/service-failure-exception}})))))
(clojure.spec.alpha/fdef put-lexicon :args (clojure.spec.alpha/tuple :portkey.aws.polly.-2016-06-10/put-lexicon-input) :ret (clojure.spec.alpha/and :portkey.aws.polly.-2016-06-10/put-lexicon-output))

(clojure.core/defn synthesize-speech "Synthesizes UTF-8 input, plain text or SSML, to a stream of bytes. SSML input\nmust be valid, well-formed SSML. Some alphabets might not be available with all\nthe voices (for example, Cyrillic might not be read at all by English voices)\nunless phoneme mapping is used. For more information, see How it Works\n(http://docs.aws.amazon.com/polly/latest/dg/how-text-to-speech-works.html)." ([synthesize-speech-inputinput] (clojure.core/let [request-function-result__22153__auto__ (req-synthesize-speech-input synthesize-speech-inputinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__22153__auto__ {:http.request.configuration/endpoints portkey.aws.polly.-2016-06-10/endpoints, :http.request.configuration/target-prefix nil, :http.request.spec/output-spec :portkey.aws.polly.-2016-06-10/synthesize-speech-output, :http.request.configuration/mime-type {"content-type" "application/json"}, :http.request.configuration/request-uri "/v1/speech", :http.request.configuration/version "2016-06-10", :http.request.configuration/service-id "Polly", :http.request.spec/input-spec :portkey.aws.polly.-2016-06-10/synthesize-speech-input, :http.request.configuration/protocol "rest-json", :http.request.configuration/method :post, :http.request.configuration/response-code 200, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "SynthesizeSpeech", :http.request.configuration/output-deser-fn response-synthesize-speech-output, :http.request.spec/error-spec {"TextLengthExceededException" :portkey.aws.polly.-2016-06-10/text-length-exceeded-exception, "InvalidSampleRateException" :portkey.aws.polly.-2016-06-10/invalid-sample-rate-exception, "InvalidSsmlException" :portkey.aws.polly.-2016-06-10/invalid-ssml-exception, "LexiconNotFoundException" :portkey.aws.polly.-2016-06-10/lexicon-not-found-exception, "ServiceFailureException" :portkey.aws.polly.-2016-06-10/service-failure-exception, "MarksNotSupportedForFormatException" :portkey.aws.polly.-2016-06-10/marks-not-supported-for-format-exception, "SsmlMarksNotSupportedForTextTypeException" :portkey.aws.polly.-2016-06-10/ssml-marks-not-supported-for-text-type-exception, "LanguageNotSupportedException" :portkey.aws.polly.-2016-06-10/language-not-supported-exception}})))))
(clojure.spec.alpha/fdef synthesize-speech :args (clojure.spec.alpha/tuple :portkey.aws.polly.-2016-06-10/synthesize-speech-input) :ret (clojure.spec.alpha/and :portkey.aws.polly.-2016-06-10/synthesize-speech-output))

(clojure.core/defn list-speech-synthesis-tasks "Returns a list of SpeechSynthesisTask objects ordered by their creation date.\nThis operation can filter the tasks by their status, for example, allowing users\nto list only tasks that are completed." ([] (list-speech-synthesis-tasks {})) ([list-speech-synthesis-tasks-inputinput] (clojure.core/let [request-function-result__22153__auto__ (req-list-speech-synthesis-tasks-input list-speech-synthesis-tasks-inputinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__22153__auto__ {:http.request.configuration/endpoints portkey.aws.polly.-2016-06-10/endpoints, :http.request.configuration/target-prefix nil, :http.request.spec/output-spec :portkey.aws.polly.-2016-06-10/list-speech-synthesis-tasks-output, :http.request.configuration/mime-type {"content-type" "application/json"}, :http.request.configuration/request-uri "/v1/synthesisTasks", :http.request.configuration/version "2016-06-10", :http.request.configuration/service-id "Polly", :http.request.spec/input-spec :portkey.aws.polly.-2016-06-10/list-speech-synthesis-tasks-input, :http.request.configuration/protocol "rest-json", :http.request.configuration/method :get, :http.request.configuration/response-code 200, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "ListSpeechSynthesisTasks", :http.request.configuration/output-deser-fn response-list-speech-synthesis-tasks-output, :http.request.spec/error-spec {"InvalidNextTokenException" :portkey.aws.polly.-2016-06-10/invalid-next-token-exception, "ServiceFailureException" :portkey.aws.polly.-2016-06-10/service-failure-exception}})))))
(clojure.spec.alpha/fdef list-speech-synthesis-tasks :args (clojure.spec.alpha/? :portkey.aws.polly.-2016-06-10/list-speech-synthesis-tasks-input) :ret (clojure.spec.alpha/and :portkey.aws.polly.-2016-06-10/list-speech-synthesis-tasks-output))

(clojure.core/defn get-speech-synthesis-task "Retrieves a specific SpeechSynthesisTask object based on its TaskID. This object\ncontains information about the given speech synthesis task, including the status\nof the task, and a link to the S3 bucket containing the output of the task." ([get-speech-synthesis-task-inputinput] (clojure.core/let [request-function-result__22153__auto__ (req-get-speech-synthesis-task-input get-speech-synthesis-task-inputinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__22153__auto__ {:http.request.configuration/endpoints portkey.aws.polly.-2016-06-10/endpoints, :http.request.configuration/target-prefix nil, :http.request.spec/output-spec :portkey.aws.polly.-2016-06-10/get-speech-synthesis-task-output, :http.request.configuration/mime-type {"content-type" "application/json"}, :http.request.configuration/request-uri "/v1/synthesisTasks/{TaskId}", :http.request.configuration/version "2016-06-10", :http.request.configuration/service-id "Polly", :http.request.spec/input-spec :portkey.aws.polly.-2016-06-10/get-speech-synthesis-task-input, :http.request.configuration/protocol "rest-json", :http.request.configuration/method :get, :http.request.configuration/response-code 200, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "GetSpeechSynthesisTask", :http.request.configuration/output-deser-fn response-get-speech-synthesis-task-output, :http.request.spec/error-spec {"InvalidTaskIdException" :portkey.aws.polly.-2016-06-10/invalid-task-id-exception, "ServiceFailureException" :portkey.aws.polly.-2016-06-10/service-failure-exception, "SynthesisTaskNotFoundException" :portkey.aws.polly.-2016-06-10/synthesis-task-not-found-exception}})))))
(clojure.spec.alpha/fdef get-speech-synthesis-task :args (clojure.spec.alpha/tuple :portkey.aws.polly.-2016-06-10/get-speech-synthesis-task-input) :ret (clojure.spec.alpha/and :portkey.aws.polly.-2016-06-10/get-speech-synthesis-task-output))
