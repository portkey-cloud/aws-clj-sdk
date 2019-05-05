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

(clojure.core/defn- ser-language-code [input] #:http.request.field{:value (clojure.core/get {"it-IT" "it-IT", "de-DE" "de-DE", :en-au "en-AU", :en-gb "en-GB", "en-AU" "en-AU", :fr-fr "fr-FR", :it-it "it-IT", "es-US" "es-US", :de-de "de-DE", "pt-BR" "pt-BR", :pt-br "pt-BR", "fr-CA" "fr-CA", "en-US" "en-US", "fr-FR" "fr-FR", "en-GB" "en-GB", :fr-ca "fr-CA", :en-us "en-US", :es-us "es-US"} input), :shape "LanguageCode"})

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

(clojure.core/defn- req-delete-transcription-job-request [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (ser-transcription-job-name (input :transcription-job-name)) #:http.request.field{:name "TranscriptionJobName", :shape "TranscriptionJobName"})]}))

(clojure.core/declare deser-media-sample-rate-hertz)

(clojure.core/declare deser-media)

(clojure.core/declare deser-uri)

(clojure.core/declare deser-max-speakers)

(clojure.core/declare deser-transcription-job-summaries)

(clojure.core/declare deser-transcription-job)

(clojure.core/declare deser-output-location-type)

(clojure.core/declare deser-next-token)

(clojure.core/declare deser-media-format)

(clojure.core/declare deser-vocabularies)

(clojure.core/declare deser-vocabulary-info)

(clojure.core/declare deser-transcription-job-status)

(clojure.core/declare deser-language-code)

(clojure.core/declare deser-failure-reason)

(clojure.core/declare deser-vocabulary-state)

(clojure.core/declare deser-settings)

(clojure.core/declare deser-vocabulary-name)

(clojure.core/declare deser-string)

(clojure.core/declare deser-transcript)

(clojure.core/declare deser-transcription-job-summary)

(clojure.core/declare deser-transcription-job-name)

(clojure.core/declare deser-date-time)

(clojure.core/declare deser-boolean)

(clojure.core/defn- deser-media-sample-rate-hertz [input] input)

(clojure.core/defn- deser-media [input] (clojure.core/cond-> {} (clojure.core/contains? input "MediaFileUri") (clojure.core/assoc :media-file-uri (deser-uri (input "MediaFileUri")))))

(clojure.core/defn- deser-uri [input] input)

(clojure.core/defn- deser-max-speakers [input] input)

(clojure.core/defn- deser-transcription-job-summaries [input] (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (deser-transcription-job-summary coll))) input))

(clojure.core/defn- deser-transcription-job [input] (clojure.core/cond-> {} (clojure.core/contains? input "MediaSampleRateHertz") (clojure.core/assoc :media-sample-rate-hertz (deser-media-sample-rate-hertz (input "MediaSampleRateHertz"))) (clojure.core/contains? input "Media") (clojure.core/assoc :media (deser-media (input "Media"))) (clojure.core/contains? input "MediaFormat") (clojure.core/assoc :media-format (deser-media-format (input "MediaFormat"))) (clojure.core/contains? input "TranscriptionJobStatus") (clojure.core/assoc :transcription-job-status (deser-transcription-job-status (input "TranscriptionJobStatus"))) (clojure.core/contains? input "LanguageCode") (clojure.core/assoc :language-code (deser-language-code (input "LanguageCode"))) (clojure.core/contains? input "FailureReason") (clojure.core/assoc :failure-reason (deser-failure-reason (input "FailureReason"))) (clojure.core/contains? input "Settings") (clojure.core/assoc :settings (deser-settings (input "Settings"))) (clojure.core/contains? input "Transcript") (clojure.core/assoc :transcript (deser-transcript (input "Transcript"))) (clojure.core/contains? input "CreationTime") (clojure.core/assoc :creation-time (deser-date-time (input "CreationTime"))) (clojure.core/contains? input "CompletionTime") (clojure.core/assoc :completion-time (deser-date-time (input "CompletionTime"))) (clojure.core/contains? input "TranscriptionJobName") (clojure.core/assoc :transcription-job-name (deser-transcription-job-name (input "TranscriptionJobName")))))

(clojure.core/defn- deser-output-location-type [input] (clojure.core/get {"CUSTOMER_BUCKET" :customer-bucket, "SERVICE_BUCKET" :service-bucket} input))

(clojure.core/defn- deser-next-token [input] input)

(clojure.core/defn- deser-media-format [input] (clojure.core/get {"mp3" :mp-3, "mp4" :mp-4, "wav" :wav, "flac" :flac} input))

(clojure.core/defn- deser-vocabularies [input] (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (deser-vocabulary-info coll))) input))

(clojure.core/defn- deser-vocabulary-info [input] (clojure.core/cond-> {} (clojure.core/contains? input "VocabularyName") (clojure.core/assoc :vocabulary-name (deser-vocabulary-name (input "VocabularyName"))) (clojure.core/contains? input "LanguageCode") (clojure.core/assoc :language-code (deser-language-code (input "LanguageCode"))) (clojure.core/contains? input "LastModifiedTime") (clojure.core/assoc :last-modified-time (deser-date-time (input "LastModifiedTime"))) (clojure.core/contains? input "VocabularyState") (clojure.core/assoc :vocabulary-state (deser-vocabulary-state (input "VocabularyState")))))

(clojure.core/defn- deser-transcription-job-status [input] (clojure.core/get {"IN_PROGRESS" :in-progress, "FAILED" :failed, "COMPLETED" :completed} input))

(clojure.core/defn- deser-language-code [input] (clojure.core/get {"it-IT" :it-it, "de-DE" :de-de, "en-AU" :en-au, "es-US" :es-us, "pt-BR" :pt-br, "fr-CA" :fr-ca, "en-US" :en-us, "fr-FR" :fr-fr, "en-GB" :en-gb} input))

(clojure.core/defn- deser-failure-reason [input] input)

(clojure.core/defn- deser-vocabulary-state [input] (clojure.core/get {"PENDING" :pending, "READY" :ready, "FAILED" :failed} input))

(clojure.core/defn- deser-settings [input] (clojure.core/cond-> {} (clojure.core/contains? input "VocabularyName") (clojure.core/assoc :vocabulary-name (deser-vocabulary-name (input "VocabularyName"))) (clojure.core/contains? input "ShowSpeakerLabels") (clojure.core/assoc :show-speaker-labels (deser-boolean (input "ShowSpeakerLabels"))) (clojure.core/contains? input "MaxSpeakerLabels") (clojure.core/assoc :max-speaker-labels (deser-max-speakers (input "MaxSpeakerLabels"))) (clojure.core/contains? input "ChannelIdentification") (clojure.core/assoc :channel-identification (deser-boolean (input "ChannelIdentification")))))

(clojure.core/defn- deser-vocabulary-name [input] input)

(clojure.core/defn- deser-string [input] input)

(clojure.core/defn- deser-transcript [input] (clojure.core/cond-> {} (clojure.core/contains? input "TranscriptFileUri") (clojure.core/assoc :transcript-file-uri (deser-uri (input "TranscriptFileUri")))))

(clojure.core/defn- deser-transcription-job-summary [input] (clojure.core/cond-> {} (clojure.core/contains? input "TranscriptionJobName") (clojure.core/assoc :transcription-job-name (deser-transcription-job-name (input "TranscriptionJobName"))) (clojure.core/contains? input "CreationTime") (clojure.core/assoc :creation-time (deser-date-time (input "CreationTime"))) (clojure.core/contains? input "CompletionTime") (clojure.core/assoc :completion-time (deser-date-time (input "CompletionTime"))) (clojure.core/contains? input "LanguageCode") (clojure.core/assoc :language-code (deser-language-code (input "LanguageCode"))) (clojure.core/contains? input "TranscriptionJobStatus") (clojure.core/assoc :transcription-job-status (deser-transcription-job-status (input "TranscriptionJobStatus"))) (clojure.core/contains? input "FailureReason") (clojure.core/assoc :failure-reason (deser-failure-reason (input "FailureReason"))) (clojure.core/contains? input "OutputLocationType") (clojure.core/assoc :output-location-type (deser-output-location-type (input "OutputLocationType")))))

(clojure.core/defn- deser-transcription-job-name [input] input)

(clojure.core/defn- deser-date-time [input] input)

(clojure.core/defn- deser-boolean [input] input)

(clojure.core/defn- response-list-vocabularies-response ([input] (response-list-vocabularies-response nil input)) ([resultWrapper2133060 input] (clojure.core/let [rawinput2133059 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar2133061 {"Status" (rawinput2133059 "Status"), "NextToken" (rawinput2133059 "NextToken"), "Vocabularies" (rawinput2133059 "Vocabularies")}] (clojure.core/cond-> {} (letvar2133061 "Status") (clojure.core/assoc :status (deser-transcription-job-status (clojure.core/get-in letvar2133061 ["Status"]))) (letvar2133061 "NextToken") (clojure.core/assoc :next-token (deser-next-token (clojure.core/get-in letvar2133061 ["NextToken"]))) (letvar2133061 "Vocabularies") (clojure.core/assoc :vocabularies (deser-vocabularies (clojure.core/get-in letvar2133061 ["Vocabularies"])))))))

(clojure.core/defn- response-bad-request-exception ([input] (response-bad-request-exception nil input)) ([resultWrapper2133063 input] (clojure.core/let [rawinput2133062 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar2133064 {"Message" (rawinput2133062 "Message")}] (clojure.core/cond-> {} (letvar2133064 "Message") (clojure.core/assoc :message (deser-failure-reason (clojure.core/get-in letvar2133064 ["Message"])))))))

(clojure.core/defn- response-get-transcription-job-response ([input] (response-get-transcription-job-response nil input)) ([resultWrapper2133066 input] (clojure.core/let [rawinput2133065 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar2133067 {"TranscriptionJob" (rawinput2133065 "TranscriptionJob")}] (clojure.core/cond-> {} (letvar2133067 "TranscriptionJob") (clojure.core/assoc :transcription-job (deser-transcription-job (clojure.core/get-in letvar2133067 ["TranscriptionJob"])))))))

(clojure.core/defn- response-limit-exceeded-exception ([input] (response-limit-exceeded-exception nil input)) ([resultWrapper2133069 input] (clojure.core/let [rawinput2133068 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar2133070 {"Message" (rawinput2133068 "Message")}] (clojure.core/cond-> {} (letvar2133070 "Message") (clojure.core/assoc :message (deser-string (clojure.core/get-in letvar2133070 ["Message"])))))))

(clojure.core/defn- response-get-vocabulary-response ([input] (response-get-vocabulary-response nil input)) ([resultWrapper2133072 input] (clojure.core/let [rawinput2133071 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar2133073 {"VocabularyName" (rawinput2133071 "VocabularyName"), "LanguageCode" (rawinput2133071 "LanguageCode"), "VocabularyState" (rawinput2133071 "VocabularyState"), "LastModifiedTime" (rawinput2133071 "LastModifiedTime"), "FailureReason" (rawinput2133071 "FailureReason"), "DownloadUri" (rawinput2133071 "DownloadUri")}] (clojure.core/cond-> {} (letvar2133073 "VocabularyName") (clojure.core/assoc :vocabulary-name (deser-vocabulary-name (clojure.core/get-in letvar2133073 ["VocabularyName"]))) (letvar2133073 "LanguageCode") (clojure.core/assoc :language-code (deser-language-code (clojure.core/get-in letvar2133073 ["LanguageCode"]))) (letvar2133073 "VocabularyState") (clojure.core/assoc :vocabulary-state (deser-vocabulary-state (clojure.core/get-in letvar2133073 ["VocabularyState"]))) (letvar2133073 "LastModifiedTime") (clojure.core/assoc :last-modified-time (deser-date-time (clojure.core/get-in letvar2133073 ["LastModifiedTime"]))) (letvar2133073 "FailureReason") (clojure.core/assoc :failure-reason (deser-failure-reason (clojure.core/get-in letvar2133073 ["FailureReason"]))) (letvar2133073 "DownloadUri") (clojure.core/assoc :download-uri (deser-uri (clojure.core/get-in letvar2133073 ["DownloadUri"])))))))

(clojure.core/defn- response-update-vocabulary-response ([input] (response-update-vocabulary-response nil input)) ([resultWrapper2133075 input] (clojure.core/let [rawinput2133074 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar2133076 {"VocabularyName" (rawinput2133074 "VocabularyName"), "LanguageCode" (rawinput2133074 "LanguageCode"), "LastModifiedTime" (rawinput2133074 "LastModifiedTime"), "VocabularyState" (rawinput2133074 "VocabularyState")}] (clojure.core/cond-> {} (letvar2133076 "VocabularyName") (clojure.core/assoc :vocabulary-name (deser-vocabulary-name (clojure.core/get-in letvar2133076 ["VocabularyName"]))) (letvar2133076 "LanguageCode") (clojure.core/assoc :language-code (deser-language-code (clojure.core/get-in letvar2133076 ["LanguageCode"]))) (letvar2133076 "LastModifiedTime") (clojure.core/assoc :last-modified-time (deser-date-time (clojure.core/get-in letvar2133076 ["LastModifiedTime"]))) (letvar2133076 "VocabularyState") (clojure.core/assoc :vocabulary-state (deser-vocabulary-state (clojure.core/get-in letvar2133076 ["VocabularyState"])))))))

(clojure.core/defn- response-list-transcription-jobs-response ([input] (response-list-transcription-jobs-response nil input)) ([resultWrapper2133078 input] (clojure.core/let [rawinput2133077 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar2133079 {"Status" (rawinput2133077 "Status"), "NextToken" (rawinput2133077 "NextToken"), "TranscriptionJobSummaries" (rawinput2133077 "TranscriptionJobSummaries")}] (clojure.core/cond-> {} (letvar2133079 "Status") (clojure.core/assoc :status (deser-transcription-job-status (clojure.core/get-in letvar2133079 ["Status"]))) (letvar2133079 "NextToken") (clojure.core/assoc :next-token (deser-next-token (clojure.core/get-in letvar2133079 ["NextToken"]))) (letvar2133079 "TranscriptionJobSummaries") (clojure.core/assoc :transcription-job-summaries (deser-transcription-job-summaries (clojure.core/get-in letvar2133079 ["TranscriptionJobSummaries"])))))))

(clojure.core/defn- response-internal-failure-exception ([input] (response-internal-failure-exception nil input)) ([resultWrapper2133081 input] (clojure.core/let [rawinput2133080 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar2133082 {"Message" (rawinput2133080 "Message")}] (clojure.core/cond-> {} (letvar2133082 "Message") (clojure.core/assoc :message (deser-string (clojure.core/get-in letvar2133082 ["Message"])))))))

(clojure.core/defn- response-conflict-exception ([input] (response-conflict-exception nil input)) ([resultWrapper2133084 input] (clojure.core/let [rawinput2133083 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar2133085 {"Message" (rawinput2133083 "Message")}] (clojure.core/cond-> {} (letvar2133085 "Message") (clojure.core/assoc :message (deser-string (clojure.core/get-in letvar2133085 ["Message"])))))))

(clojure.core/defn- response-not-found-exception ([input] (response-not-found-exception nil input)) ([resultWrapper2133087 input] (clojure.core/let [rawinput2133086 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar2133088 {"Message" (rawinput2133086 "Message")}] (clojure.core/cond-> {} (letvar2133088 "Message") (clojure.core/assoc :message (deser-string (clojure.core/get-in letvar2133088 ["Message"])))))))

(clojure.core/defn- response-create-vocabulary-response ([input] (response-create-vocabulary-response nil input)) ([resultWrapper2133090 input] (clojure.core/let [rawinput2133089 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar2133091 {"VocabularyName" (rawinput2133089 "VocabularyName"), "LanguageCode" (rawinput2133089 "LanguageCode"), "VocabularyState" (rawinput2133089 "VocabularyState"), "LastModifiedTime" (rawinput2133089 "LastModifiedTime"), "FailureReason" (rawinput2133089 "FailureReason")}] (clojure.core/cond-> {} (letvar2133091 "VocabularyName") (clojure.core/assoc :vocabulary-name (deser-vocabulary-name (clojure.core/get-in letvar2133091 ["VocabularyName"]))) (letvar2133091 "LanguageCode") (clojure.core/assoc :language-code (deser-language-code (clojure.core/get-in letvar2133091 ["LanguageCode"]))) (letvar2133091 "VocabularyState") (clojure.core/assoc :vocabulary-state (deser-vocabulary-state (clojure.core/get-in letvar2133091 ["VocabularyState"]))) (letvar2133091 "LastModifiedTime") (clojure.core/assoc :last-modified-time (deser-date-time (clojure.core/get-in letvar2133091 ["LastModifiedTime"]))) (letvar2133091 "FailureReason") (clojure.core/assoc :failure-reason (deser-failure-reason (clojure.core/get-in letvar2133091 ["FailureReason"])))))))

(clojure.core/defn- response-start-transcription-job-response ([input] (response-start-transcription-job-response nil input)) ([resultWrapper2133093 input] (clojure.core/let [rawinput2133092 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar2133094 {"TranscriptionJob" (rawinput2133092 "TranscriptionJob")}] (clojure.core/cond-> {} (letvar2133094 "TranscriptionJob") (clojure.core/assoc :transcription-job (deser-transcription-job (clojure.core/get-in letvar2133094 ["TranscriptionJob"])))))))

(clojure.spec.alpha/def :portkey.aws.transcribe/media-sample-rate-hertz (clojure.spec.alpha/int-in 8000 48000))

(clojure.spec.alpha/def :portkey.aws.transcribe/output-bucket-name (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__1410940__auto__] (clojure.core/re-matches #"[a-z0-9][\.\-a-z0-9]{1,61}[a-z0-9]" s__1410940__auto__))))

(clojure.spec.alpha/def :portkey.aws.transcribe.list-vocabularies-response/status (clojure.spec.alpha/and :portkey.aws.transcribe/transcription-job-status))
(clojure.spec.alpha/def :portkey.aws.transcribe/list-vocabularies-response (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.transcribe.list-vocabularies-response/status :portkey.aws.transcribe/next-token :portkey.aws.transcribe/vocabularies]))

(clojure.spec.alpha/def :portkey.aws.transcribe.list-vocabularies-request/state-equals (clojure.spec.alpha/and :portkey.aws.transcribe/vocabulary-state))
(clojure.spec.alpha/def :portkey.aws.transcribe.list-vocabularies-request/name-contains (clojure.spec.alpha/and :portkey.aws.transcribe/vocabulary-name))
(clojure.spec.alpha/def :portkey.aws.transcribe/list-vocabularies-request (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.transcribe/next-token :portkey.aws.transcribe/max-results :portkey.aws.transcribe.list-vocabularies-request/state-equals :portkey.aws.transcribe.list-vocabularies-request/name-contains]))

(clojure.spec.alpha/def :portkey.aws.transcribe.media/media-file-uri (clojure.spec.alpha/and :portkey.aws.transcribe/uri))
(clojure.spec.alpha/def :portkey.aws.transcribe/media (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.transcribe.media/media-file-uri]))

(clojure.spec.alpha/def :portkey.aws.transcribe/uri (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__1410938__auto__] (clojure.core/<= 1 (clojure.core/count s__1410938__auto__))) (clojure.core/fn [s__1410939__auto__] (clojure.core/< (clojure.core/count s__1410939__auto__) 2000))))

(clojure.spec.alpha/def :portkey.aws.transcribe.bad-request-exception/message (clojure.spec.alpha/and :portkey.aws.transcribe/failure-reason))
(clojure.spec.alpha/def :portkey.aws.transcribe/bad-request-exception (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.transcribe.bad-request-exception/message]))

(clojure.spec.alpha/def :portkey.aws.transcribe/max-speakers (clojure.spec.alpha/int-in 2 10))

(clojure.spec.alpha/def :portkey.aws.transcribe/get-transcription-job-response (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.transcribe/transcription-job]))

(clojure.spec.alpha/def :portkey.aws.transcribe/get-vocabulary-request (clojure.spec.alpha/keys :req-un [:portkey.aws.transcribe/vocabulary-name] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.transcribe/phrase (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__1410938__auto__] (clojure.core/<= 0 (clojure.core/count s__1410938__auto__))) (clojure.core/fn [s__1410939__auto__] (clojure.core/< (clojure.core/count s__1410939__auto__) 256))))

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

(clojure.spec.alpha/def :portkey.aws.transcribe/next-token (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__1410939__auto__] (clojure.core/< (clojure.core/count s__1410939__auto__) 8192))))

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

(clojure.spec.alpha/def :portkey.aws.transcribe/language-code #{"it-IT" "de-DE" :en-au :en-gb "en-AU" :fr-fr :it-it "es-US" :de-de "pt-BR" :pt-br "fr-CA" "en-US" "fr-FR" "en-GB" :fr-ca :en-us :es-us})

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

(clojure.spec.alpha/def :portkey.aws.transcribe/vocabulary-name (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__1410938__auto__] (clojure.core/<= 1 (clojure.core/count s__1410938__auto__))) (clojure.core/fn [s__1410939__auto__] (clojure.core/< (clojure.core/count s__1410939__auto__) 200)) (clojure.core/fn [s__1410940__auto__] (clojure.core/re-matches #"^[0-9a-zA-Z._-]+" s__1410940__auto__))))

(clojure.spec.alpha/def :portkey.aws.transcribe/string (clojure.spec.alpha/and clojure.core/string?))

(clojure.spec.alpha/def :portkey.aws.transcribe.transcript/transcript-file-uri (clojure.spec.alpha/and :portkey.aws.transcribe/uri))
(clojure.spec.alpha/def :portkey.aws.transcribe/transcript (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.transcribe.transcript/transcript-file-uri]))

(clojure.spec.alpha/def :portkey.aws.transcribe.transcription-job-summary/creation-time (clojure.spec.alpha/and :portkey.aws.transcribe/date-time))
(clojure.spec.alpha/def :portkey.aws.transcribe.transcription-job-summary/completion-time (clojure.spec.alpha/and :portkey.aws.transcribe/date-time))
(clojure.spec.alpha/def :portkey.aws.transcribe/transcription-job-summary (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.transcribe/transcription-job-name :portkey.aws.transcribe.transcription-job-summary/creation-time :portkey.aws.transcribe.transcription-job-summary/completion-time :portkey.aws.transcribe/language-code :portkey.aws.transcribe/transcription-job-status :portkey.aws.transcribe/failure-reason :portkey.aws.transcribe/output-location-type]))

(clojure.spec.alpha/def :portkey.aws.transcribe/create-vocabulary-request (clojure.spec.alpha/keys :req-un [:portkey.aws.transcribe/vocabulary-name :portkey.aws.transcribe/language-code :portkey.aws.transcribe/phrases] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.transcribe/get-transcription-job-request (clojure.spec.alpha/keys :req-un [:portkey.aws.transcribe/transcription-job-name] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.transcribe/transcription-job-name (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__1410938__auto__] (clojure.core/<= 1 (clojure.core/count s__1410938__auto__))) (clojure.core/fn [s__1410939__auto__] (clojure.core/< (clojure.core/count s__1410939__auto__) 200)) (clojure.core/fn [s__1410940__auto__] (clojure.core/re-matches #"^[0-9a-zA-Z._-]+" s__1410940__auto__))))

(clojure.spec.alpha/def :portkey.aws.transcribe/start-transcription-job-response (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.transcribe/transcription-job]))

(clojure.spec.alpha/def :portkey.aws.transcribe/max-results (clojure.spec.alpha/int-in 1 100))

(clojure.spec.alpha/def :portkey.aws.transcribe/update-vocabulary-request (clojure.spec.alpha/keys :req-un [:portkey.aws.transcribe/vocabulary-name :portkey.aws.transcribe/language-code :portkey.aws.transcribe/phrases] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.transcribe/delete-transcription-job-request (clojure.spec.alpha/keys :req-un [:portkey.aws.transcribe/transcription-job-name] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.transcribe/date-time clojure.core/inst?)

(clojure.spec.alpha/def :portkey.aws.transcribe/boolean clojure.core/boolean?)

(clojure.core/defn list-transcription-jobs "Lists transcription jobs with the specified status." ([] (list-transcription-jobs {})) ([list-transcription-jobs-requestinput] (clojure.core/let [request-function-result__1411981__auto__ (req-list-transcription-jobs-request list-transcription-jobs-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__1411981__auto__ {:http.request.configuration/endpoints portkey.aws.transcribe/endpoints, :http.request.configuration/target-prefix "Transcribe", :http.request.spec/output-spec :portkey.aws.transcribe/list-transcription-jobs-response, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2017-10-26", :http.request.configuration/service-id "Transcribe", :http.request.spec/input-spec :portkey.aws.transcribe/list-transcription-jobs-request, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "ListTranscriptionJobs", :http.request.configuration/output-deser-fn response-list-transcription-jobs-response, :http.request.spec/error-spec {"BadRequestException" :portkey.aws.transcribe/bad-request-exception, "LimitExceededException" :portkey.aws.transcribe/limit-exceeded-exception, "InternalFailureException" :portkey.aws.transcribe/internal-failure-exception}})))))
(clojure.spec.alpha/fdef list-transcription-jobs :args (clojure.spec.alpha/? :portkey.aws.transcribe/list-transcription-jobs-request) :ret (clojure.spec.alpha/and :portkey.aws.transcribe/list-transcription-jobs-response))

(clojure.core/defn get-vocabulary "Gets information about a vocabulary." ([get-vocabulary-requestinput] (clojure.core/let [request-function-result__1411981__auto__ (req-get-vocabulary-request get-vocabulary-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__1411981__auto__ {:http.request.configuration/endpoints portkey.aws.transcribe/endpoints, :http.request.configuration/target-prefix "Transcribe", :http.request.spec/output-spec :portkey.aws.transcribe/get-vocabulary-response, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2017-10-26", :http.request.configuration/service-id "Transcribe", :http.request.spec/input-spec :portkey.aws.transcribe/get-vocabulary-request, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "GetVocabulary", :http.request.configuration/output-deser-fn response-get-vocabulary-response, :http.request.spec/error-spec {"NotFoundException" :portkey.aws.transcribe/not-found-exception, "LimitExceededException" :portkey.aws.transcribe/limit-exceeded-exception, "InternalFailureException" :portkey.aws.transcribe/internal-failure-exception, "BadRequestException" :portkey.aws.transcribe/bad-request-exception}})))))
(clojure.spec.alpha/fdef get-vocabulary :args (clojure.spec.alpha/tuple :portkey.aws.transcribe/get-vocabulary-request) :ret (clojure.spec.alpha/and :portkey.aws.transcribe/get-vocabulary-response))

(clojure.core/defn list-vocabularies "Returns a list of vocabularies that match the specified criteria. If no criteria\nare specified, returns the entire list of vocabularies." ([] (list-vocabularies {})) ([list-vocabularies-requestinput] (clojure.core/let [request-function-result__1411981__auto__ (req-list-vocabularies-request list-vocabularies-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__1411981__auto__ {:http.request.configuration/endpoints portkey.aws.transcribe/endpoints, :http.request.configuration/target-prefix "Transcribe", :http.request.spec/output-spec :portkey.aws.transcribe/list-vocabularies-response, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2017-10-26", :http.request.configuration/service-id "Transcribe", :http.request.spec/input-spec :portkey.aws.transcribe/list-vocabularies-request, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "ListVocabularies", :http.request.configuration/output-deser-fn response-list-vocabularies-response, :http.request.spec/error-spec {"BadRequestException" :portkey.aws.transcribe/bad-request-exception, "LimitExceededException" :portkey.aws.transcribe/limit-exceeded-exception, "InternalFailureException" :portkey.aws.transcribe/internal-failure-exception}})))))
(clojure.spec.alpha/fdef list-vocabularies :args (clojure.spec.alpha/? :portkey.aws.transcribe/list-vocabularies-request) :ret (clojure.spec.alpha/and :portkey.aws.transcribe/list-vocabularies-response))

(clojure.core/defn delete-transcription-job "Deletes a previously submitted transcription job along with any other generated\nresults such as the transcription, models, and so on." ([delete-transcription-job-requestinput] (clojure.core/let [request-function-result__1411981__auto__ (req-delete-transcription-job-request delete-transcription-job-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__1411981__auto__ {:http.request.configuration/endpoints portkey.aws.transcribe/endpoints, :http.request.configuration/target-prefix "Transcribe", :http.request.spec/output-spec nil, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2017-10-26", :http.request.configuration/service-id "Transcribe", :http.request.spec/input-spec :portkey.aws.transcribe/delete-transcription-job-request, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "DeleteTranscriptionJob", :http.request.configuration/output-deser-fn (clojure.core/fn [& args__1411980__auto__] {}), :http.request.spec/error-spec {"LimitExceededException" :portkey.aws.transcribe/limit-exceeded-exception, "BadRequestException" :portkey.aws.transcribe/bad-request-exception, "InternalFailureException" :portkey.aws.transcribe/internal-failure-exception}})))))
(clojure.spec.alpha/fdef delete-transcription-job :args (clojure.spec.alpha/tuple :portkey.aws.transcribe/delete-transcription-job-request) :ret clojure.core/true?)

(clojure.core/defn create-vocabulary "Creates a new custom vocabulary that you can use to change the way Amazon\nTranscribe handles transcription of an audio file." ([create-vocabulary-requestinput] (clojure.core/let [request-function-result__1411981__auto__ (req-create-vocabulary-request create-vocabulary-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__1411981__auto__ {:http.request.configuration/endpoints portkey.aws.transcribe/endpoints, :http.request.configuration/target-prefix "Transcribe", :http.request.spec/output-spec :portkey.aws.transcribe/create-vocabulary-response, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2017-10-26", :http.request.configuration/service-id "Transcribe", :http.request.spec/input-spec :portkey.aws.transcribe/create-vocabulary-request, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "CreateVocabulary", :http.request.configuration/output-deser-fn response-create-vocabulary-response, :http.request.spec/error-spec {"BadRequestException" :portkey.aws.transcribe/bad-request-exception, "LimitExceededException" :portkey.aws.transcribe/limit-exceeded-exception, "InternalFailureException" :portkey.aws.transcribe/internal-failure-exception, "ConflictException" :portkey.aws.transcribe/conflict-exception}})))))
(clojure.spec.alpha/fdef create-vocabulary :args (clojure.spec.alpha/tuple :portkey.aws.transcribe/create-vocabulary-request) :ret (clojure.spec.alpha/and :portkey.aws.transcribe/create-vocabulary-response))

(clojure.core/defn get-transcription-job "Returns information about a transcription job. To see the status of the job,\ncheck the TranscriptionJobStatus field. If the status is COMPLETED, the job is\nfinished and you can find the results at the location specified in the\nTranscriptionFileUri field." ([get-transcription-job-requestinput] (clojure.core/let [request-function-result__1411981__auto__ (req-get-transcription-job-request get-transcription-job-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__1411981__auto__ {:http.request.configuration/endpoints portkey.aws.transcribe/endpoints, :http.request.configuration/target-prefix "Transcribe", :http.request.spec/output-spec :portkey.aws.transcribe/get-transcription-job-response, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2017-10-26", :http.request.configuration/service-id "Transcribe", :http.request.spec/input-spec :portkey.aws.transcribe/get-transcription-job-request, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "GetTranscriptionJob", :http.request.configuration/output-deser-fn response-get-transcription-job-response, :http.request.spec/error-spec {"BadRequestException" :portkey.aws.transcribe/bad-request-exception, "LimitExceededException" :portkey.aws.transcribe/limit-exceeded-exception, "InternalFailureException" :portkey.aws.transcribe/internal-failure-exception, "NotFoundException" :portkey.aws.transcribe/not-found-exception}})))))
(clojure.spec.alpha/fdef get-transcription-job :args (clojure.spec.alpha/tuple :portkey.aws.transcribe/get-transcription-job-request) :ret (clojure.spec.alpha/and :portkey.aws.transcribe/get-transcription-job-response))

(clojure.core/defn update-vocabulary "Updates an existing vocabulary with new values. The UpdateVocabulary operation\noverwrites all of the existing information with the values that you provide in\nthe request." ([update-vocabulary-requestinput] (clojure.core/let [request-function-result__1411981__auto__ (req-update-vocabulary-request update-vocabulary-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__1411981__auto__ {:http.request.configuration/endpoints portkey.aws.transcribe/endpoints, :http.request.configuration/target-prefix "Transcribe", :http.request.spec/output-spec :portkey.aws.transcribe/update-vocabulary-response, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2017-10-26", :http.request.configuration/service-id "Transcribe", :http.request.spec/input-spec :portkey.aws.transcribe/update-vocabulary-request, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "UpdateVocabulary", :http.request.configuration/output-deser-fn response-update-vocabulary-response, :http.request.spec/error-spec {"BadRequestException" :portkey.aws.transcribe/bad-request-exception, "LimitExceededException" :portkey.aws.transcribe/limit-exceeded-exception, "InternalFailureException" :portkey.aws.transcribe/internal-failure-exception, "NotFoundException" :portkey.aws.transcribe/not-found-exception, "ConflictException" :portkey.aws.transcribe/conflict-exception}})))))
(clojure.spec.alpha/fdef update-vocabulary :args (clojure.spec.alpha/tuple :portkey.aws.transcribe/update-vocabulary-request) :ret (clojure.spec.alpha/and :portkey.aws.transcribe/update-vocabulary-response))

(clojure.core/defn start-transcription-job "Starts an asynchronous job to transcribe speech to text." ([start-transcription-job-requestinput] (clojure.core/let [request-function-result__1411981__auto__ (req-start-transcription-job-request start-transcription-job-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__1411981__auto__ {:http.request.configuration/endpoints portkey.aws.transcribe/endpoints, :http.request.configuration/target-prefix "Transcribe", :http.request.spec/output-spec :portkey.aws.transcribe/start-transcription-job-response, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2017-10-26", :http.request.configuration/service-id "Transcribe", :http.request.spec/input-spec :portkey.aws.transcribe/start-transcription-job-request, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "StartTranscriptionJob", :http.request.configuration/output-deser-fn response-start-transcription-job-response, :http.request.spec/error-spec {"BadRequestException" :portkey.aws.transcribe/bad-request-exception, "LimitExceededException" :portkey.aws.transcribe/limit-exceeded-exception, "InternalFailureException" :portkey.aws.transcribe/internal-failure-exception, "ConflictException" :portkey.aws.transcribe/conflict-exception}})))))
(clojure.spec.alpha/fdef start-transcription-job :args (clojure.spec.alpha/tuple :portkey.aws.transcribe/start-transcription-job-request) :ret (clojure.spec.alpha/and :portkey.aws.transcribe/start-transcription-job-response))

(clojure.core/defn delete-vocabulary "Deletes a vocabulary from Amazon Transcribe." ([delete-vocabulary-requestinput] (clojure.core/let [request-function-result__1411981__auto__ (req-delete-vocabulary-request delete-vocabulary-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__1411981__auto__ {:http.request.configuration/endpoints portkey.aws.transcribe/endpoints, :http.request.configuration/target-prefix "Transcribe", :http.request.spec/output-spec nil, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2017-10-26", :http.request.configuration/service-id "Transcribe", :http.request.spec/input-spec :portkey.aws.transcribe/delete-vocabulary-request, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "DeleteVocabulary", :http.request.configuration/output-deser-fn (clojure.core/fn [& args__1411980__auto__] {}), :http.request.spec/error-spec {"NotFoundException" :portkey.aws.transcribe/not-found-exception, "LimitExceededException" :portkey.aws.transcribe/limit-exceeded-exception, "BadRequestException" :portkey.aws.transcribe/bad-request-exception, "InternalFailureException" :portkey.aws.transcribe/internal-failure-exception}})))))
(clojure.spec.alpha/fdef delete-vocabulary :args (clojure.spec.alpha/tuple :portkey.aws.transcribe/delete-vocabulary-request) :ret clojure.core/true?)
