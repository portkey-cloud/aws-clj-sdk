(ns portkey.aws.transcribe (:require [portkey.aws]))

(def endpoints 'nil)

(clojure.core/declare ser-media-sample-rate-hertz)

(clojure.core/declare ser-output-bucket-name)

(clojure.core/declare ser-media)

(clojure.core/declare ser-uri)

(clojure.core/declare ser-max-speakers)

(clojure.core/declare ser-phrase)

(clojure.core/declare ser-next-token)

(clojure.core/declare ser-media-format)

(clojure.core/declare ser-transcription-job-status)

(clojure.core/declare ser-language-code)

(clojure.core/declare ser-phrases)

(clojure.core/declare ser-vocabulary-state)

(clojure.core/declare ser-settings)

(clojure.core/declare ser-vocabulary-name)

(clojure.core/declare ser-transcription-job-name)

(clojure.core/declare ser-max-results)

(clojure.core/declare ser-boolean)

(clojure.core/defn- ser-media-sample-rate-hertz [input] #:http.request.field{:value input, :shape "MediaSampleRateHertz"})

(clojure.core/defn- ser-output-bucket-name [input] #:http.request.field{:value input, :shape "OutputBucketName"})

(clojure.core/defn- ser-media [input] (clojure.core/cond-> #:http.request.field{:value [], :shape "Media", :type "structure"} (clojure.core/contains? input :media-file-uri) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-uri (input :media-file-uri)) #:http.request.field{:name "MediaFileUri", :shape "Uri"}))))

(clojure.core/defn- ser-uri [input] #:http.request.field{:value input, :shape "Uri"})

(clojure.core/defn- ser-max-speakers [input] #:http.request.field{:value input, :shape "MaxSpeakers"})

(clojure.core/defn- ser-phrase [input] #:http.request.field{:value input, :shape "Phrase"})

(clojure.core/defn- ser-next-token [input] #:http.request.field{:value input, :shape "NextToken"})

(clojure.core/defn- ser-media-format [input] #:http.request.field{:value (clojure.core/get {"mp3" "mp3", :mp-3 "mp3", "mp4" "mp4", :mp-4 "mp4", "wav" "wav", :wav "wav", "flac" "flac", :flac "flac"} input), :shape "MediaFormat"})

(clojure.core/defn- ser-transcription-job-status [input] #:http.request.field{:value (clojure.core/get {"IN_PROGRESS" "IN_PROGRESS", :in-progress "IN_PROGRESS", "FAILED" "FAILED", :failed "FAILED", "COMPLETED" "COMPLETED", :completed "COMPLETED"} input), :shape "TranscriptionJobStatus"})

(clojure.core/defn- ser-language-code [input] #:http.request.field{:value (clojure.core/get {"en-US" "en-US", :en-us "en-US", "es-US" "es-US", :es-us "es-US"} input), :shape "LanguageCode"})

(clojure.core/defn- ser-phrases [input] #:http.request.field{:value (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (clojure.core/merge (ser-phrase coll) #:http.request.field{:shape "Phrase"}))) input), :shape "Phrases", :type "list"})

(clojure.core/defn- ser-vocabulary-state [input] #:http.request.field{:value (clojure.core/get {"PENDING" "PENDING", :pending "PENDING", "READY" "READY", :ready "READY", "FAILED" "FAILED", :failed "FAILED"} input), :shape "VocabularyState"})

(clojure.core/defn- ser-settings [input] (clojure.core/cond-> #:http.request.field{:value [], :shape "Settings", :type "structure"} (clojure.core/contains? input :vocabulary-name) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-vocabulary-name (input :vocabulary-name)) #:http.request.field{:name "VocabularyName", :shape "VocabularyName"})) (clojure.core/contains? input :show-speaker-labels) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-boolean (input :show-speaker-labels)) #:http.request.field{:name "ShowSpeakerLabels", :shape "Boolean"})) (clojure.core/contains? input :max-speaker-labels) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-max-speakers (input :max-speaker-labels)) #:http.request.field{:name "MaxSpeakerLabels", :shape "MaxSpeakers"})) (clojure.core/contains? input :channel-identification) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-boolean (input :channel-identification)) #:http.request.field{:name "ChannelIdentification", :shape "Boolean"}))))

(clojure.core/defn- ser-vocabulary-name [input] #:http.request.field{:value input, :shape "VocabularyName"})

(clojure.core/defn- ser-transcription-job-name [input] #:http.request.field{:value input, :shape "TranscriptionJobName"})

(clojure.core/defn- ser-max-results [input] #:http.request.field{:value input, :shape "MaxResults"})

(clojure.core/defn- ser-boolean [input] #:http.request.field{:value input, :shape "Boolean"})

(clojure.core/defn- req-list-vocabularies-request [input] (clojure.core/cond-> {} (clojure.core/contains? input :next-token) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-next-token (input :next-token)) #:http.request.field{:name "NextToken", :shape "NextToken"})) (clojure.core/contains? input :max-results) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-max-results (input :max-results)) #:http.request.field{:name "MaxResults", :shape "MaxResults"})) (clojure.core/contains? input :state-equals) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-vocabulary-state (input :state-equals)) #:http.request.field{:name "StateEquals", :shape "VocabularyState"})) (clojure.core/contains? input :name-contains) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-vocabulary-name (input :name-contains)) #:http.request.field{:name "NameContains", :shape "VocabularyName"}))))

(clojure.core/defn- req-get-vocabulary-request [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (ser-vocabulary-name (input :vocabulary-name)) #:http.request.field{:name "VocabularyName", :shape "VocabularyName"})]}))

(clojure.core/defn- req-delete-vocabulary-request [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (ser-vocabulary-name (input :vocabulary-name)) #:http.request.field{:name "VocabularyName", :shape "VocabularyName"})]}))

(clojure.core/defn- req-list-transcription-jobs-request [input] (clojure.core/cond-> {} (clojure.core/contains? input :status) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-transcription-job-status (input :status)) #:http.request.field{:name "Status", :shape "TranscriptionJobStatus"})) (clojure.core/contains? input :job-name-contains) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-transcription-job-name (input :job-name-contains)) #:http.request.field{:name "JobNameContains", :shape "TranscriptionJobName"})) (clojure.core/contains? input :next-token) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-next-token (input :next-token)) #:http.request.field{:name "NextToken", :shape "NextToken"})) (clojure.core/contains? input :max-results) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-max-results (input :max-results)) #:http.request.field{:name "MaxResults", :shape "MaxResults"}))))

(clojure.core/defn- req-start-transcription-job-request [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (ser-transcription-job-name (input :transcription-job-name)) #:http.request.field{:name "TranscriptionJobName", :shape "TranscriptionJobName"}) (clojure.core/into (ser-language-code (input :language-code)) #:http.request.field{:name "LanguageCode", :shape "LanguageCode"}) (clojure.core/into (ser-media-format (input :media-format)) #:http.request.field{:name "MediaFormat", :shape "MediaFormat"}) (clojure.core/into (ser-media (input :media)) #:http.request.field{:name "Media", :shape "Media"})]} (clojure.core/contains? input :media-sample-rate-hertz) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-media-sample-rate-hertz (input :media-sample-rate-hertz)) #:http.request.field{:name "MediaSampleRateHertz", :shape "MediaSampleRateHertz"})) (clojure.core/contains? input :output-bucket-name) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-output-bucket-name (input :output-bucket-name)) #:http.request.field{:name "OutputBucketName", :shape "OutputBucketName"})) (clojure.core/contains? input :settings) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-settings (input :settings)) #:http.request.field{:name "Settings", :shape "Settings"}))))

(clojure.core/defn- req-create-vocabulary-request [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (ser-vocabulary-name (input :vocabulary-name)) #:http.request.field{:name "VocabularyName", :shape "VocabularyName"}) (clojure.core/into (ser-language-code (input :language-code)) #:http.request.field{:name "LanguageCode", :shape "LanguageCode"}) (clojure.core/into (ser-phrases (input :phrases)) #:http.request.field{:name "Phrases", :shape "Phrases"})]}))

(clojure.core/defn- req-get-transcription-job-request [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (ser-transcription-job-name (input :transcription-job-name)) #:http.request.field{:name "TranscriptionJobName", :shape "TranscriptionJobName"})]}))

(clojure.core/defn- req-update-vocabulary-request [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (ser-vocabulary-name (input :vocabulary-name)) #:http.request.field{:name "VocabularyName", :shape "VocabularyName"}) (clojure.core/into (ser-language-code (input :language-code)) #:http.request.field{:name "LanguageCode", :shape "LanguageCode"}) (clojure.core/into (ser-phrases (input :phrases)) #:http.request.field{:name "Phrases", :shape "Phrases"})]}))

(clojure.spec.alpha/def :portkey.aws.transcribe/media-sample-rate-hertz (clojure.spec.alpha/int-in 8000 48000))

(clojure.spec.alpha/def :portkey.aws.transcribe/output-bucket-name (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__27967__auto__] (clojure.core/re-matches #"[a-z0-9][\.\-a-z0-9]{1,61}[a-z0-9]" s__27967__auto__))))

(clojure.spec.alpha/def :portkey.aws.transcribe.list-vocabularies-response/status (clojure.spec.alpha/and :portkey.aws.transcribe/transcription-job-status))
(clojure.spec.alpha/def :portkey.aws.transcribe/list-vocabularies-response (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.transcribe.list-vocabularies-response/status :portkey.aws.transcribe/next-token :portkey.aws.transcribe/vocabularies]))

(clojure.spec.alpha/def :portkey.aws.transcribe.list-vocabularies-request/state-equals (clojure.spec.alpha/and :portkey.aws.transcribe/vocabulary-state))
(clojure.spec.alpha/def :portkey.aws.transcribe.list-vocabularies-request/name-contains (clojure.spec.alpha/and :portkey.aws.transcribe/vocabulary-name))
(clojure.spec.alpha/def :portkey.aws.transcribe/list-vocabularies-request (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.transcribe/next-token :portkey.aws.transcribe/max-results :portkey.aws.transcribe.list-vocabularies-request/state-equals :portkey.aws.transcribe.list-vocabularies-request/name-contains]))

(clojure.spec.alpha/def :portkey.aws.transcribe.media/media-file-uri (clojure.spec.alpha/and :portkey.aws.transcribe/uri))
(clojure.spec.alpha/def :portkey.aws.transcribe/media (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.transcribe.media/media-file-uri]))

(clojure.spec.alpha/def :portkey.aws.transcribe/uri (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__27965__auto__] (clojure.core/<= 1 (clojure.core/count s__27965__auto__))) (clojure.core/fn [s__27966__auto__] (clojure.core/< (clojure.core/count s__27966__auto__) 2000))))

(clojure.spec.alpha/def :portkey.aws.transcribe.bad-request-exception/message (clojure.spec.alpha/and :portkey.aws.transcribe/failure-reason))
(clojure.spec.alpha/def :portkey.aws.transcribe/bad-request-exception (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.transcribe.bad-request-exception/message]))

(clojure.spec.alpha/def :portkey.aws.transcribe/max-speakers (clojure.spec.alpha/int-in 2 10))

(clojure.spec.alpha/def :portkey.aws.transcribe/get-transcription-job-response (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.transcribe/transcription-job]))

(clojure.spec.alpha/def :portkey.aws.transcribe/get-vocabulary-request (clojure.spec.alpha/keys :req-un [:portkey.aws.transcribe/vocabulary-name] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.transcribe/phrase (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__27965__auto__] (clojure.core/<= 0 (clojure.core/count s__27965__auto__))) (clojure.core/fn [s__27966__auto__] (clojure.core/< (clojure.core/count s__27966__auto__) 256))))

(clojure.spec.alpha/def :portkey.aws.transcribe/transcription-job-summaries (clojure.spec.alpha/coll-of :portkey.aws.transcribe/transcription-job-summary))

(clojure.spec.alpha/def :portkey.aws.transcribe/delete-vocabulary-request (clojure.spec.alpha/keys :req-un [:portkey.aws.transcribe/vocabulary-name] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.transcribe.limit-exceeded-exception/message (clojure.spec.alpha/and :portkey.aws.transcribe/string))
(clojure.spec.alpha/def :portkey.aws.transcribe/limit-exceeded-exception (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.transcribe.limit-exceeded-exception/message]))

(clojure.spec.alpha/def :portkey.aws.transcribe.transcription-job/creation-time (clojure.spec.alpha/and :portkey.aws.transcribe/date-time))
(clojure.spec.alpha/def :portkey.aws.transcribe.transcription-job/completion-time (clojure.spec.alpha/and :portkey.aws.transcribe/date-time))
(clojure.spec.alpha/def :portkey.aws.transcribe/transcription-job (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.transcribe/media-sample-rate-hertz :portkey.aws.transcribe/media :portkey.aws.transcribe/media-format :portkey.aws.transcribe/transcription-job-status :portkey.aws.transcribe/language-code :portkey.aws.transcribe/failure-reason :portkey.aws.transcribe/settings :portkey.aws.transcribe/transcript :portkey.aws.transcribe.transcription-job/creation-time :portkey.aws.transcribe.transcription-job/completion-time :portkey.aws.transcribe/transcription-job-name]))

(clojure.spec.alpha/def :portkey.aws.transcribe.get-vocabulary-response/last-modified-time (clojure.spec.alpha/and :portkey.aws.transcribe/date-time))
(clojure.spec.alpha/def :portkey.aws.transcribe.get-vocabulary-response/download-uri (clojure.spec.alpha/and :portkey.aws.transcribe/uri))
(clojure.spec.alpha/def :portkey.aws.transcribe/get-vocabulary-response (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.transcribe/vocabulary-name :portkey.aws.transcribe/language-code :portkey.aws.transcribe/vocabulary-state :portkey.aws.transcribe.get-vocabulary-response/last-modified-time :portkey.aws.transcribe/failure-reason :portkey.aws.transcribe.get-vocabulary-response/download-uri]))

(clojure.spec.alpha/def :portkey.aws.transcribe/output-location-type #{:service-bucket "SERVICE_BUCKET" :customer-bucket "CUSTOMER_BUCKET"})

(clojure.spec.alpha/def :portkey.aws.transcribe/next-token (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__27966__auto__] (clojure.core/< (clojure.core/count s__27966__auto__) 8192))))

(clojure.spec.alpha/def :portkey.aws.transcribe.update-vocabulary-response/last-modified-time (clojure.spec.alpha/and :portkey.aws.transcribe/date-time))
(clojure.spec.alpha/def :portkey.aws.transcribe/update-vocabulary-response (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.transcribe/vocabulary-name :portkey.aws.transcribe/language-code :portkey.aws.transcribe.update-vocabulary-response/last-modified-time :portkey.aws.transcribe/vocabulary-state]))

(clojure.spec.alpha/def :portkey.aws.transcribe.list-transcription-jobs-response/status (clojure.spec.alpha/and :portkey.aws.transcribe/transcription-job-status))
(clojure.spec.alpha/def :portkey.aws.transcribe/list-transcription-jobs-response (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.transcribe.list-transcription-jobs-response/status :portkey.aws.transcribe/next-token :portkey.aws.transcribe/transcription-job-summaries]))

(clojure.spec.alpha/def :portkey.aws.transcribe/media-format #{"mp4" :wav "flac" :mp-4 "mp3" "wav" :mp-3 :flac})

(clojure.spec.alpha/def :portkey.aws.transcribe/vocabularies (clojure.spec.alpha/coll-of :portkey.aws.transcribe/vocabulary-info))

(clojure.spec.alpha/def :portkey.aws.transcribe.internal-failure-exception/message (clojure.spec.alpha/and :portkey.aws.transcribe/string))
(clojure.spec.alpha/def :portkey.aws.transcribe/internal-failure-exception (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.transcribe.internal-failure-exception/message]))

(clojure.spec.alpha/def :portkey.aws.transcribe.list-transcription-jobs-request/status (clojure.spec.alpha/and :portkey.aws.transcribe/transcription-job-status))
(clojure.spec.alpha/def :portkey.aws.transcribe.list-transcription-jobs-request/job-name-contains (clojure.spec.alpha/and :portkey.aws.transcribe/transcription-job-name))
(clojure.spec.alpha/def :portkey.aws.transcribe/list-transcription-jobs-request (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.transcribe.list-transcription-jobs-request/status :portkey.aws.transcribe.list-transcription-jobs-request/job-name-contains :portkey.aws.transcribe/next-token :portkey.aws.transcribe/max-results]))

(clojure.spec.alpha/def :portkey.aws.transcribe.vocabulary-info/last-modified-time (clojure.spec.alpha/and :portkey.aws.transcribe/date-time))
(clojure.spec.alpha/def :portkey.aws.transcribe/vocabulary-info (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.transcribe/vocabulary-name :portkey.aws.transcribe/language-code :portkey.aws.transcribe.vocabulary-info/last-modified-time :portkey.aws.transcribe/vocabulary-state]))

(clojure.spec.alpha/def :portkey.aws.transcribe/transcription-job-status #{"COMPLETED" "IN_PROGRESS" :in-progress :completed "FAILED" :failed})

(clojure.spec.alpha/def :portkey.aws.transcribe/start-transcription-job-request (clojure.spec.alpha/keys :req-un [:portkey.aws.transcribe/transcription-job-name :portkey.aws.transcribe/language-code :portkey.aws.transcribe/media-format :portkey.aws.transcribe/media] :opt-un [:portkey.aws.transcribe/media-sample-rate-hertz :portkey.aws.transcribe/output-bucket-name :portkey.aws.transcribe/settings]))

(clojure.spec.alpha/def :portkey.aws.transcribe.conflict-exception/message (clojure.spec.alpha/and :portkey.aws.transcribe/string))
(clojure.spec.alpha/def :portkey.aws.transcribe/conflict-exception (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.transcribe.conflict-exception/message]))

(clojure.spec.alpha/def :portkey.aws.transcribe/language-code #{"es-US" "en-US" :en-us :es-us})

(clojure.spec.alpha/def :portkey.aws.transcribe/phrases (clojure.spec.alpha/coll-of :portkey.aws.transcribe/phrase))

(clojure.spec.alpha/def :portkey.aws.transcribe.not-found-exception/message (clojure.spec.alpha/and :portkey.aws.transcribe/string))
(clojure.spec.alpha/def :portkey.aws.transcribe/not-found-exception (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.transcribe.not-found-exception/message]))

(clojure.spec.alpha/def :portkey.aws.transcribe/failure-reason (clojure.spec.alpha/and clojure.core/string?))

(clojure.spec.alpha/def :portkey.aws.transcribe/vocabulary-state #{:ready :pending "READY" "PENDING" "FAILED" :failed})

(clojure.spec.alpha/def :portkey.aws.transcribe.create-vocabulary-response/last-modified-time (clojure.spec.alpha/and :portkey.aws.transcribe/date-time))
(clojure.spec.alpha/def :portkey.aws.transcribe/create-vocabulary-response (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.transcribe/vocabulary-name :portkey.aws.transcribe/language-code :portkey.aws.transcribe/vocabulary-state :portkey.aws.transcribe.create-vocabulary-response/last-modified-time :portkey.aws.transcribe/failure-reason]))

(clojure.spec.alpha/def :portkey.aws.transcribe.settings/show-speaker-labels (clojure.spec.alpha/and :portkey.aws.transcribe/boolean))
(clojure.spec.alpha/def :portkey.aws.transcribe.settings/max-speaker-labels (clojure.spec.alpha/and :portkey.aws.transcribe/max-speakers))
(clojure.spec.alpha/def :portkey.aws.transcribe.settings/channel-identification (clojure.spec.alpha/and :portkey.aws.transcribe/boolean))
(clojure.spec.alpha/def :portkey.aws.transcribe/settings (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.transcribe/vocabulary-name :portkey.aws.transcribe.settings/show-speaker-labels :portkey.aws.transcribe.settings/max-speaker-labels :portkey.aws.transcribe.settings/channel-identification]))

(clojure.spec.alpha/def :portkey.aws.transcribe/vocabulary-name (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__27965__auto__] (clojure.core/<= 1 (clojure.core/count s__27965__auto__))) (clojure.core/fn [s__27966__auto__] (clojure.core/< (clojure.core/count s__27966__auto__) 200)) (clojure.core/fn [s__27967__auto__] (clojure.core/re-matches #"^[0-9a-zA-Z._-]+" s__27967__auto__))))

(clojure.spec.alpha/def :portkey.aws.transcribe/string (clojure.spec.alpha/and clojure.core/string?))

(clojure.spec.alpha/def :portkey.aws.transcribe.transcript/transcript-file-uri (clojure.spec.alpha/and :portkey.aws.transcribe/uri))
(clojure.spec.alpha/def :portkey.aws.transcribe/transcript (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.transcribe.transcript/transcript-file-uri]))

(clojure.spec.alpha/def :portkey.aws.transcribe.transcription-job-summary/creation-time (clojure.spec.alpha/and :portkey.aws.transcribe/date-time))
(clojure.spec.alpha/def :portkey.aws.transcribe.transcription-job-summary/completion-time (clojure.spec.alpha/and :portkey.aws.transcribe/date-time))
(clojure.spec.alpha/def :portkey.aws.transcribe/transcription-job-summary (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.transcribe/transcription-job-name :portkey.aws.transcribe.transcription-job-summary/creation-time :portkey.aws.transcribe.transcription-job-summary/completion-time :portkey.aws.transcribe/language-code :portkey.aws.transcribe/transcription-job-status :portkey.aws.transcribe/failure-reason :portkey.aws.transcribe/output-location-type]))

(clojure.spec.alpha/def :portkey.aws.transcribe/create-vocabulary-request (clojure.spec.alpha/keys :req-un [:portkey.aws.transcribe/vocabulary-name :portkey.aws.transcribe/language-code :portkey.aws.transcribe/phrases] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.transcribe/get-transcription-job-request (clojure.spec.alpha/keys :req-un [:portkey.aws.transcribe/transcription-job-name] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.transcribe/transcription-job-name (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__27965__auto__] (clojure.core/<= 1 (clojure.core/count s__27965__auto__))) (clojure.core/fn [s__27966__auto__] (clojure.core/< (clojure.core/count s__27966__auto__) 200)) (clojure.core/fn [s__27967__auto__] (clojure.core/re-matches #"^[0-9a-zA-Z._-]+" s__27967__auto__))))

(clojure.spec.alpha/def :portkey.aws.transcribe/start-transcription-job-response (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.transcribe/transcription-job]))

(clojure.spec.alpha/def :portkey.aws.transcribe/max-results (clojure.spec.alpha/int-in 1 100))

(clojure.spec.alpha/def :portkey.aws.transcribe/update-vocabulary-request (clojure.spec.alpha/keys :req-un [:portkey.aws.transcribe/vocabulary-name :portkey.aws.transcribe/language-code :portkey.aws.transcribe/phrases] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.transcribe/date-time clojure.core/inst?)

(clojure.spec.alpha/def :portkey.aws.transcribe/boolean clojure.core/boolean?)

(clojure.core/defn create-vocabulary ([create-vocabulary-requestinput] (clojure.core/let [request-function-result__28606__auto__ (req-create-vocabulary-request create-vocabulary-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__28606__auto__ {:http.request.configuration/endpoints portkey.aws.transcribe/endpoints, :http.request.spec/output-spec :portkey.aws.transcribe/create-vocabulary-response, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2017-10-26", :http.request.configuration/service-id "Transcribe", :http.request.spec/input-spec :portkey.aws.transcribe/create-vocabulary-request, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/action "CreateVocabulary", :http.request.spec/error-spec {"BadRequestException" :portkey.aws.transcribe/bad-request-exception, "LimitExceededException" :portkey.aws.transcribe/limit-exceeded-exception, "InternalFailureException" :portkey.aws.transcribe/internal-failure-exception, "ConflictException" :portkey.aws.transcribe/conflict-exception}})))))
(clojure.spec.alpha/fdef create-vocabulary :args (clojure.spec.alpha/tuple :portkey.aws.transcribe/create-vocabulary-request) :ret (clojure.spec.alpha/and :portkey.aws.transcribe/create-vocabulary-response))

(clojure.core/defn delete-vocabulary ([delete-vocabulary-requestinput] (clojure.core/let [request-function-result__28606__auto__ (req-delete-vocabulary-request delete-vocabulary-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__28606__auto__ {:http.request.configuration/endpoints portkey.aws.transcribe/endpoints, :http.request.spec/output-spec nil, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2017-10-26", :http.request.configuration/service-id "Transcribe", :http.request.spec/input-spec :portkey.aws.transcribe/delete-vocabulary-request, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/action "DeleteVocabulary", :http.request.spec/error-spec {"NotFoundException" :portkey.aws.transcribe/not-found-exception, "LimitExceededException" :portkey.aws.transcribe/limit-exceeded-exception, "BadRequestException" :portkey.aws.transcribe/bad-request-exception, "InternalFailureException" :portkey.aws.transcribe/internal-failure-exception}})))))
(clojure.spec.alpha/fdef delete-vocabulary :args (clojure.spec.alpha/tuple :portkey.aws.transcribe/delete-vocabulary-request) :ret clojure.core/true?)

(clojure.core/defn get-transcription-job ([get-transcription-job-requestinput] (clojure.core/let [request-function-result__28606__auto__ (req-get-transcription-job-request get-transcription-job-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__28606__auto__ {:http.request.configuration/endpoints portkey.aws.transcribe/endpoints, :http.request.spec/output-spec :portkey.aws.transcribe/get-transcription-job-response, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2017-10-26", :http.request.configuration/service-id "Transcribe", :http.request.spec/input-spec :portkey.aws.transcribe/get-transcription-job-request, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/action "GetTranscriptionJob", :http.request.spec/error-spec {"BadRequestException" :portkey.aws.transcribe/bad-request-exception, "LimitExceededException" :portkey.aws.transcribe/limit-exceeded-exception, "InternalFailureException" :portkey.aws.transcribe/internal-failure-exception, "NotFoundException" :portkey.aws.transcribe/not-found-exception}})))))
(clojure.spec.alpha/fdef get-transcription-job :args (clojure.spec.alpha/tuple :portkey.aws.transcribe/get-transcription-job-request) :ret (clojure.spec.alpha/and :portkey.aws.transcribe/get-transcription-job-response))

(clojure.core/defn get-vocabulary ([get-vocabulary-requestinput] (clojure.core/let [request-function-result__28606__auto__ (req-get-vocabulary-request get-vocabulary-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__28606__auto__ {:http.request.configuration/endpoints portkey.aws.transcribe/endpoints, :http.request.spec/output-spec :portkey.aws.transcribe/get-vocabulary-response, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2017-10-26", :http.request.configuration/service-id "Transcribe", :http.request.spec/input-spec :portkey.aws.transcribe/get-vocabulary-request, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/action "GetVocabulary", :http.request.spec/error-spec {"NotFoundException" :portkey.aws.transcribe/not-found-exception, "LimitExceededException" :portkey.aws.transcribe/limit-exceeded-exception, "InternalFailureException" :portkey.aws.transcribe/internal-failure-exception, "BadRequestException" :portkey.aws.transcribe/bad-request-exception}})))))
(clojure.spec.alpha/fdef get-vocabulary :args (clojure.spec.alpha/tuple :portkey.aws.transcribe/get-vocabulary-request) :ret (clojure.spec.alpha/and :portkey.aws.transcribe/get-vocabulary-response))

(clojure.core/defn list-transcription-jobs ([] (list-transcription-jobs {})) ([list-transcription-jobs-requestinput] (clojure.core/let [request-function-result__28606__auto__ (req-list-transcription-jobs-request list-transcription-jobs-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__28606__auto__ {:http.request.configuration/endpoints portkey.aws.transcribe/endpoints, :http.request.spec/output-spec :portkey.aws.transcribe/list-transcription-jobs-response, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2017-10-26", :http.request.configuration/service-id "Transcribe", :http.request.spec/input-spec :portkey.aws.transcribe/list-transcription-jobs-request, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/action "ListTranscriptionJobs", :http.request.spec/error-spec {"BadRequestException" :portkey.aws.transcribe/bad-request-exception, "LimitExceededException" :portkey.aws.transcribe/limit-exceeded-exception, "InternalFailureException" :portkey.aws.transcribe/internal-failure-exception}})))))
(clojure.spec.alpha/fdef list-transcription-jobs :args (clojure.spec.alpha/? :portkey.aws.transcribe/list-transcription-jobs-request) :ret (clojure.spec.alpha/and :portkey.aws.transcribe/list-transcription-jobs-response))

(clojure.core/defn list-vocabularies ([] (list-vocabularies {})) ([list-vocabularies-requestinput] (clojure.core/let [request-function-result__28606__auto__ (req-list-vocabularies-request list-vocabularies-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__28606__auto__ {:http.request.configuration/endpoints portkey.aws.transcribe/endpoints, :http.request.spec/output-spec :portkey.aws.transcribe/list-vocabularies-response, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2017-10-26", :http.request.configuration/service-id "Transcribe", :http.request.spec/input-spec :portkey.aws.transcribe/list-vocabularies-request, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/action "ListVocabularies", :http.request.spec/error-spec {"BadRequestException" :portkey.aws.transcribe/bad-request-exception, "LimitExceededException" :portkey.aws.transcribe/limit-exceeded-exception, "InternalFailureException" :portkey.aws.transcribe/internal-failure-exception}})))))
(clojure.spec.alpha/fdef list-vocabularies :args (clojure.spec.alpha/? :portkey.aws.transcribe/list-vocabularies-request) :ret (clojure.spec.alpha/and :portkey.aws.transcribe/list-vocabularies-response))

(clojure.core/defn start-transcription-job ([start-transcription-job-requestinput] (clojure.core/let [request-function-result__28606__auto__ (req-start-transcription-job-request start-transcription-job-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__28606__auto__ {:http.request.configuration/endpoints portkey.aws.transcribe/endpoints, :http.request.spec/output-spec :portkey.aws.transcribe/start-transcription-job-response, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2017-10-26", :http.request.configuration/service-id "Transcribe", :http.request.spec/input-spec :portkey.aws.transcribe/start-transcription-job-request, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/action "StartTranscriptionJob", :http.request.spec/error-spec {"BadRequestException" :portkey.aws.transcribe/bad-request-exception, "LimitExceededException" :portkey.aws.transcribe/limit-exceeded-exception, "InternalFailureException" :portkey.aws.transcribe/internal-failure-exception, "ConflictException" :portkey.aws.transcribe/conflict-exception}})))))
(clojure.spec.alpha/fdef start-transcription-job :args (clojure.spec.alpha/tuple :portkey.aws.transcribe/start-transcription-job-request) :ret (clojure.spec.alpha/and :portkey.aws.transcribe/start-transcription-job-response))

(clojure.core/defn update-vocabulary ([update-vocabulary-requestinput] (clojure.core/let [request-function-result__28606__auto__ (req-update-vocabulary-request update-vocabulary-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__28606__auto__ {:http.request.configuration/endpoints portkey.aws.transcribe/endpoints, :http.request.spec/output-spec :portkey.aws.transcribe/update-vocabulary-response, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2017-10-26", :http.request.configuration/service-id "Transcribe", :http.request.spec/input-spec :portkey.aws.transcribe/update-vocabulary-request, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/action "UpdateVocabulary", :http.request.spec/error-spec {"BadRequestException" :portkey.aws.transcribe/bad-request-exception, "LimitExceededException" :portkey.aws.transcribe/limit-exceeded-exception, "InternalFailureException" :portkey.aws.transcribe/internal-failure-exception, "NotFoundException" :portkey.aws.transcribe/not-found-exception, "ConflictException" :portkey.aws.transcribe/conflict-exception}})))))
(clojure.spec.alpha/fdef update-vocabulary :args (clojure.spec.alpha/tuple :portkey.aws.transcribe/update-vocabulary-request) :ret (clojure.spec.alpha/and :portkey.aws.transcribe/update-vocabulary-response))
