(ns portkey.aws.comprehend (:require [portkey.aws]))

(def
 endpoints
 '{"eu-west-1"
   {:credential-scope {:service "comprehend", :region "eu-west-1"},
    :ssl-common-name "comprehend.eu-west-1.amazonaws.com",
    :endpoint "https://comprehend.eu-west-1.amazonaws.com",
    :signature-version :v4},
   "us-east-2"
   {:credential-scope {:service "comprehend", :region "us-east-2"},
    :ssl-common-name "comprehend.us-east-2.amazonaws.com",
    :endpoint "https://comprehend.us-east-2.amazonaws.com",
    :signature-version :v4},
   "ap-southeast-2"
   {:credential-scope
    {:service "comprehend", :region "ap-southeast-2"},
    :ssl-common-name "comprehend.ap-southeast-2.amazonaws.com",
    :endpoint "https://comprehend.ap-southeast-2.amazonaws.com",
    :signature-version :v4},
   "ap-southeast-1"
   {:credential-scope
    {:service "comprehend", :region "ap-southeast-1"},
    :ssl-common-name "comprehend.ap-southeast-1.amazonaws.com",
    :endpoint "https://comprehend.ap-southeast-1.amazonaws.com",
    :signature-version :v4},
   "ca-central-1"
   {:credential-scope {:service "comprehend", :region "ca-central-1"},
    :ssl-common-name "comprehend.ca-central-1.amazonaws.com",
    :endpoint "https://comprehend.ca-central-1.amazonaws.com",
    :signature-version :v4},
   "eu-central-1"
   {:credential-scope {:service "comprehend", :region "eu-central-1"},
    :ssl-common-name "comprehend.eu-central-1.amazonaws.com",
    :endpoint "https://comprehend.eu-central-1.amazonaws.com",
    :signature-version :v4},
   "us-west-2"
   {:credential-scope {:service "comprehend", :region "us-west-2"},
    :ssl-common-name "comprehend.us-west-2.amazonaws.com",
    :endpoint "https://comprehend.us-west-2.amazonaws.com",
    :signature-version :v4},
   "us-east-1"
   {:credential-scope {:service "comprehend", :region "us-east-1"},
    :ssl-common-name "comprehend.us-east-1.amazonaws.com",
    :endpoint "https://comprehend.us-east-1.amazonaws.com",
    :signature-version :v4}})

(clojure.core/declare ser-input-data-config)

(clojure.core/declare ser-string-list)

(clojure.core/declare ser-entity-types-list)

(clojure.core/declare ser-entity-recognizer-input-data-config)

(clojure.core/declare ser-output-data-config)

(clojure.core/declare ser-job-status)

(clojure.core/declare ser-entity-recognizer-documents)

(clojure.core/declare ser-job-name)

(clojure.core/declare ser-s-3-uri)

(clojure.core/declare ser-entity-recognizer-annotations)

(clojure.core/declare ser-entity-recognizer-filter)

(clojure.core/declare ser-topics-detection-job-filter)

(clojure.core/declare ser-model-status)

(clojure.core/declare ser-iam-role-arn)

(clojure.core/declare ser-comprehend-arn-name)

(clojure.core/declare ser-document-classifier-input-data-config)

(clojure.core/declare ser-entity-recognizer-arn)

(clojure.core/declare ser-document-classification-job-filter)

(clojure.core/declare ser-entities-detection-job-filter)

(clojure.core/declare ser-language-code)

(clojure.core/declare ser-dominant-language-detection-job-filter)

(clojure.core/declare ser-string)

(clojure.core/declare ser-number-of-topics-integer)

(clojure.core/declare ser-entity-type-name)

(clojure.core/declare ser-document-classifier-arn)

(clojure.core/declare ser-syntax-language-code)

(clojure.core/declare ser-client-request-token-string)

(clojure.core/declare ser-key-phrases-detection-job-filter)

(clojure.core/declare ser-sentiment-detection-job-filter)

(clojure.core/declare ser-entity-recognizer-entity-list)

(clojure.core/declare ser-timestamp)

(clojure.core/declare ser-document-classifier-filter)

(clojure.core/declare ser-entity-types-list-item)

(clojure.core/declare ser-max-results-integer)

(clojure.core/declare ser-input-format)

(clojure.core/declare ser-job-id)

(clojure.core/defn- ser-input-data-config [input] (clojure.core/cond-> #:http.request.field{:value [(clojure.core/into (ser-s-3-uri (:s-3-uri input)) #:http.request.field{:name "S3Uri", :shape "S3Uri"})], :shape "InputDataConfig", :type "structure"} (clojure.core/contains? input :input-format) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-input-format (input :input-format)) #:http.request.field{:name "InputFormat", :shape "InputFormat"}))))

(clojure.core/defn- ser-string-list [input] #:http.request.field{:value (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (clojure.core/merge (ser-string coll) #:http.request.field{:shape "String"}))) input), :shape "StringList", :type "list"})

(clojure.core/defn- ser-entity-types-list [input] #:http.request.field{:value (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (clojure.core/merge (ser-entity-types-list-item coll) #:http.request.field{:shape "EntityTypesListItem"}))) input), :shape "EntityTypesList", :type "list"})

(clojure.core/defn- ser-entity-recognizer-input-data-config [input] (clojure.core/cond-> #:http.request.field{:value [(clojure.core/into (ser-entity-types-list (:entity-types input)) #:http.request.field{:name "EntityTypes", :shape "EntityTypesList"}) (clojure.core/into (ser-entity-recognizer-documents (:documents input)) #:http.request.field{:name "Documents", :shape "EntityRecognizerDocuments"})], :shape "EntityRecognizerInputDataConfig", :type "structure"} (clojure.core/contains? input :annotations) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-entity-recognizer-annotations (input :annotations)) #:http.request.field{:name "Annotations", :shape "EntityRecognizerAnnotations"})) (clojure.core/contains? input :entity-list) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-entity-recognizer-entity-list (input :entity-list)) #:http.request.field{:name "EntityList", :shape "EntityRecognizerEntityList"}))))

(clojure.core/defn- ser-output-data-config [input] (clojure.core/cond-> #:http.request.field{:value [(clojure.core/into (ser-s-3-uri (:s-3-uri input)) #:http.request.field{:name "S3Uri", :shape "S3Uri"})], :shape "OutputDataConfig", :type "structure"}))

(clojure.core/defn- ser-job-status [input] #:http.request.field{:value (clojure.core/get {"COMPLETED" "COMPLETED", "IN_PROGRESS" "IN_PROGRESS", :in-progress "IN_PROGRESS", :stop-requested "STOP_REQUESTED", :completed "COMPLETED", "STOP_REQUESTED" "STOP_REQUESTED", :submitted "SUBMITTED", "SUBMITTED" "SUBMITTED", :stopped "STOPPED", "STOPPED" "STOPPED", "FAILED" "FAILED", :failed "FAILED"} input), :shape "JobStatus"})

(clojure.core/defn- ser-entity-recognizer-documents [input] (clojure.core/cond-> #:http.request.field{:value [(clojure.core/into (ser-s-3-uri (:s-3-uri input)) #:http.request.field{:name "S3Uri", :shape "S3Uri"})], :shape "EntityRecognizerDocuments", :type "structure"}))

(clojure.core/defn- ser-job-name [input] #:http.request.field{:value input, :shape "JobName"})

(clojure.core/defn- ser-s-3-uri [input] #:http.request.field{:value input, :shape "S3Uri"})

(clojure.core/defn- ser-entity-recognizer-annotations [input] (clojure.core/cond-> #:http.request.field{:value [(clojure.core/into (ser-s-3-uri (:s-3-uri input)) #:http.request.field{:name "S3Uri", :shape "S3Uri"})], :shape "EntityRecognizerAnnotations", :type "structure"}))

(clojure.core/defn- ser-entity-recognizer-filter [input] (clojure.core/cond-> #:http.request.field{:value [], :shape "EntityRecognizerFilter", :type "structure"} (clojure.core/contains? input :status) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-model-status (input :status)) #:http.request.field{:name "Status", :shape "ModelStatus"})) (clojure.core/contains? input :submit-time-before) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-timestamp (input :submit-time-before)) #:http.request.field{:name "SubmitTimeBefore", :shape "Timestamp"})) (clojure.core/contains? input :submit-time-after) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-timestamp (input :submit-time-after)) #:http.request.field{:name "SubmitTimeAfter", :shape "Timestamp"}))))

(clojure.core/defn- ser-topics-detection-job-filter [input] (clojure.core/cond-> #:http.request.field{:value [], :shape "TopicsDetectionJobFilter", :type "structure"} (clojure.core/contains? input :job-name) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-job-name (input :job-name)) #:http.request.field{:name "JobName", :shape "JobName"})) (clojure.core/contains? input :job-status) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-job-status (input :job-status)) #:http.request.field{:name "JobStatus", :shape "JobStatus"})) (clojure.core/contains? input :submit-time-before) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-timestamp (input :submit-time-before)) #:http.request.field{:name "SubmitTimeBefore", :shape "Timestamp"})) (clojure.core/contains? input :submit-time-after) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-timestamp (input :submit-time-after)) #:http.request.field{:name "SubmitTimeAfter", :shape "Timestamp"}))))

(clojure.core/defn- ser-model-status [input] #:http.request.field{:value (clojure.core/get {:stop-requested "STOP_REQUESTED", "STOP_REQUESTED" "STOP_REQUESTED", :deleting "DELETING", :trained "TRAINED", :submitted "SUBMITTED", "SUBMITTED" "SUBMITTED", "TRAINING" "TRAINING", :stopped "STOPPED", "STOPPED" "STOPPED", "DELETING" "DELETING", :training "TRAINING", :in-error "IN_ERROR", "IN_ERROR" "IN_ERROR", "TRAINED" "TRAINED"} input), :shape "ModelStatus"})

(clojure.core/defn- ser-iam-role-arn [input] #:http.request.field{:value input, :shape "IamRoleArn"})

(clojure.core/defn- ser-comprehend-arn-name [input] #:http.request.field{:value input, :shape "ComprehendArnName"})

(clojure.core/defn- ser-document-classifier-input-data-config [input] (clojure.core/cond-> #:http.request.field{:value [(clojure.core/into (ser-s-3-uri (:s-3-uri input)) #:http.request.field{:name "S3Uri", :shape "S3Uri"})], :shape "DocumentClassifierInputDataConfig", :type "structure"}))

(clojure.core/defn- ser-entity-recognizer-arn [input] #:http.request.field{:value input, :shape "EntityRecognizerArn"})

(clojure.core/defn- ser-document-classification-job-filter [input] (clojure.core/cond-> #:http.request.field{:value [], :shape "DocumentClassificationJobFilter", :type "structure"} (clojure.core/contains? input :job-name) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-job-name (input :job-name)) #:http.request.field{:name "JobName", :shape "JobName"})) (clojure.core/contains? input :job-status) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-job-status (input :job-status)) #:http.request.field{:name "JobStatus", :shape "JobStatus"})) (clojure.core/contains? input :submit-time-before) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-timestamp (input :submit-time-before)) #:http.request.field{:name "SubmitTimeBefore", :shape "Timestamp"})) (clojure.core/contains? input :submit-time-after) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-timestamp (input :submit-time-after)) #:http.request.field{:name "SubmitTimeAfter", :shape "Timestamp"}))))

(clojure.core/defn- ser-entities-detection-job-filter [input] (clojure.core/cond-> #:http.request.field{:value [], :shape "EntitiesDetectionJobFilter", :type "structure"} (clojure.core/contains? input :job-name) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-job-name (input :job-name)) #:http.request.field{:name "JobName", :shape "JobName"})) (clojure.core/contains? input :job-status) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-job-status (input :job-status)) #:http.request.field{:name "JobStatus", :shape "JobStatus"})) (clojure.core/contains? input :submit-time-before) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-timestamp (input :submit-time-before)) #:http.request.field{:name "SubmitTimeBefore", :shape "Timestamp"})) (clojure.core/contains? input :submit-time-after) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-timestamp (input :submit-time-after)) #:http.request.field{:name "SubmitTimeAfter", :shape "Timestamp"}))))

(clojure.core/defn- ser-language-code [input] #:http.request.field{:value (clojure.core/get {:fr "fr", "pt" "pt", "en" "en", :es "es", :pt "pt", "it" "it", "fr" "fr", :it "it", "de" "de", :en "en", "es" "es", :de "de"} input), :shape "LanguageCode"})

(clojure.core/defn- ser-dominant-language-detection-job-filter [input] (clojure.core/cond-> #:http.request.field{:value [], :shape "DominantLanguageDetectionJobFilter", :type "structure"} (clojure.core/contains? input :job-name) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-job-name (input :job-name)) #:http.request.field{:name "JobName", :shape "JobName"})) (clojure.core/contains? input :job-status) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-job-status (input :job-status)) #:http.request.field{:name "JobStatus", :shape "JobStatus"})) (clojure.core/contains? input :submit-time-before) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-timestamp (input :submit-time-before)) #:http.request.field{:name "SubmitTimeBefore", :shape "Timestamp"})) (clojure.core/contains? input :submit-time-after) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-timestamp (input :submit-time-after)) #:http.request.field{:name "SubmitTimeAfter", :shape "Timestamp"}))))

(clojure.core/defn- ser-string [input] #:http.request.field{:value input, :shape "String"})

(clojure.core/defn- ser-number-of-topics-integer [input] #:http.request.field{:value input, :shape "NumberOfTopicsInteger"})

(clojure.core/defn- ser-entity-type-name [input] #:http.request.field{:value input, :shape "EntityTypeName"})

(clojure.core/defn- ser-document-classifier-arn [input] #:http.request.field{:value input, :shape "DocumentClassifierArn"})

(clojure.core/defn- ser-syntax-language-code [input] #:http.request.field{:value (clojure.core/get {:fr "fr", "pt" "pt", "en" "en", :es "es", :pt "pt", "it" "it", "fr" "fr", :it "it", "de" "de", :en "en", "es" "es", :de "de"} input), :shape "SyntaxLanguageCode"})

(clojure.core/defn- ser-client-request-token-string [input] #:http.request.field{:value input, :shape "ClientRequestTokenString"})

(clojure.core/defn- ser-key-phrases-detection-job-filter [input] (clojure.core/cond-> #:http.request.field{:value [], :shape "KeyPhrasesDetectionJobFilter", :type "structure"} (clojure.core/contains? input :job-name) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-job-name (input :job-name)) #:http.request.field{:name "JobName", :shape "JobName"})) (clojure.core/contains? input :job-status) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-job-status (input :job-status)) #:http.request.field{:name "JobStatus", :shape "JobStatus"})) (clojure.core/contains? input :submit-time-before) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-timestamp (input :submit-time-before)) #:http.request.field{:name "SubmitTimeBefore", :shape "Timestamp"})) (clojure.core/contains? input :submit-time-after) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-timestamp (input :submit-time-after)) #:http.request.field{:name "SubmitTimeAfter", :shape "Timestamp"}))))

(clojure.core/defn- ser-sentiment-detection-job-filter [input] (clojure.core/cond-> #:http.request.field{:value [], :shape "SentimentDetectionJobFilter", :type "structure"} (clojure.core/contains? input :job-name) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-job-name (input :job-name)) #:http.request.field{:name "JobName", :shape "JobName"})) (clojure.core/contains? input :job-status) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-job-status (input :job-status)) #:http.request.field{:name "JobStatus", :shape "JobStatus"})) (clojure.core/contains? input :submit-time-before) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-timestamp (input :submit-time-before)) #:http.request.field{:name "SubmitTimeBefore", :shape "Timestamp"})) (clojure.core/contains? input :submit-time-after) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-timestamp (input :submit-time-after)) #:http.request.field{:name "SubmitTimeAfter", :shape "Timestamp"}))))

(clojure.core/defn- ser-entity-recognizer-entity-list [input] (clojure.core/cond-> #:http.request.field{:value [(clojure.core/into (ser-s-3-uri (:s-3-uri input)) #:http.request.field{:name "S3Uri", :shape "S3Uri"})], :shape "EntityRecognizerEntityList", :type "structure"}))

(clojure.core/defn- ser-timestamp [input] #:http.request.field{:value input, :shape "Timestamp"})

(clojure.core/defn- ser-document-classifier-filter [input] (clojure.core/cond-> #:http.request.field{:value [], :shape "DocumentClassifierFilter", :type "structure"} (clojure.core/contains? input :status) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-model-status (input :status)) #:http.request.field{:name "Status", :shape "ModelStatus"})) (clojure.core/contains? input :submit-time-before) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-timestamp (input :submit-time-before)) #:http.request.field{:name "SubmitTimeBefore", :shape "Timestamp"})) (clojure.core/contains? input :submit-time-after) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-timestamp (input :submit-time-after)) #:http.request.field{:name "SubmitTimeAfter", :shape "Timestamp"}))))

(clojure.core/defn- ser-entity-types-list-item [input] (clojure.core/cond-> #:http.request.field{:value [(clojure.core/into (ser-entity-type-name (:type input)) #:http.request.field{:name "Type", :shape "EntityTypeName"})], :shape "EntityTypesListItem", :type "structure"}))

(clojure.core/defn- ser-max-results-integer [input] #:http.request.field{:value input, :shape "MaxResultsInteger"})

(clojure.core/defn- ser-input-format [input] #:http.request.field{:value (clojure.core/get {"ONE_DOC_PER_FILE" "ONE_DOC_PER_FILE", :one-doc-per-file "ONE_DOC_PER_FILE", "ONE_DOC_PER_LINE" "ONE_DOC_PER_LINE", :one-doc-per-line "ONE_DOC_PER_LINE"} input), :shape "InputFormat"})

(clojure.core/defn- ser-job-id [input] #:http.request.field{:value input, :shape "JobId"})

(clojure.core/defn- req-start-sentiment-detection-job-request [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (ser-input-data-config (input :input-data-config)) #:http.request.field{:name "InputDataConfig", :shape "InputDataConfig"}) (clojure.core/into (ser-output-data-config (input :output-data-config)) #:http.request.field{:name "OutputDataConfig", :shape "OutputDataConfig"}) (clojure.core/into (ser-iam-role-arn (input :data-access-role-arn)) #:http.request.field{:name "DataAccessRoleArn", :shape "IamRoleArn"}) (clojure.core/into (ser-language-code (input :language-code)) #:http.request.field{:name "LanguageCode", :shape "LanguageCode"})]} (clojure.core/contains? input :job-name) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-job-name (input :job-name)) #:http.request.field{:name "JobName", :shape "JobName"})) (clojure.core/contains? input :client-request-token) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-client-request-token-string (input :client-request-token)) #:http.request.field{:name "ClientRequestToken", :shape "ClientRequestTokenString", :idempotency-token true}))))

(clojure.core/defn- req-stop-training-document-classifier-request [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (ser-document-classifier-arn (input :document-classifier-arn)) #:http.request.field{:name "DocumentClassifierArn", :shape "DocumentClassifierArn"})]}))

(clojure.core/defn- req-describe-sentiment-detection-job-request [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (ser-job-id (input :job-id)) #:http.request.field{:name "JobId", :shape "JobId"})]}))

(clojure.core/defn- req-start-dominant-language-detection-job-request [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (ser-input-data-config (input :input-data-config)) #:http.request.field{:name "InputDataConfig", :shape "InputDataConfig"}) (clojure.core/into (ser-output-data-config (input :output-data-config)) #:http.request.field{:name "OutputDataConfig", :shape "OutputDataConfig"}) (clojure.core/into (ser-iam-role-arn (input :data-access-role-arn)) #:http.request.field{:name "DataAccessRoleArn", :shape "IamRoleArn"})]} (clojure.core/contains? input :job-name) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-job-name (input :job-name)) #:http.request.field{:name "JobName", :shape "JobName"})) (clojure.core/contains? input :client-request-token) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-client-request-token-string (input :client-request-token)) #:http.request.field{:name "ClientRequestToken", :shape "ClientRequestTokenString", :idempotency-token true}))))

(clojure.core/defn- req-batch-detect-key-phrases-request [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (ser-string-list (input :text-list)) #:http.request.field{:name "TextList", :shape "StringList"}) (clojure.core/into (ser-language-code (input :language-code)) #:http.request.field{:name "LanguageCode", :shape "LanguageCode"})]}))

(clojure.core/defn- req-detect-key-phrases-request [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (ser-string (input :text)) #:http.request.field{:name "Text", :shape "String"}) (clojure.core/into (ser-language-code (input :language-code)) #:http.request.field{:name "LanguageCode", :shape "LanguageCode"})]}))

(clojure.core/defn- req-describe-dominant-language-detection-job-request [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (ser-job-id (input :job-id)) #:http.request.field{:name "JobId", :shape "JobId"})]}))

(clojure.core/defn- req-stop-training-entity-recognizer-request [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (ser-entity-recognizer-arn (input :entity-recognizer-arn)) #:http.request.field{:name "EntityRecognizerArn", :shape "EntityRecognizerArn"})]}))

(clojure.core/defn- req-list-document-classifiers-request [input] (clojure.core/cond-> {} (clojure.core/contains? input :filter) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-document-classifier-filter (input :filter)) #:http.request.field{:name "Filter", :shape "DocumentClassifierFilter"})) (clojure.core/contains? input :next-token) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-string (input :next-token)) #:http.request.field{:name "NextToken", :shape "String"})) (clojure.core/contains? input :max-results) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-max-results-integer (input :max-results)) #:http.request.field{:name "MaxResults", :shape "MaxResultsInteger"}))))

(clojure.core/defn- req-describe-document-classification-job-request [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (ser-job-id (input :job-id)) #:http.request.field{:name "JobId", :shape "JobId"})]}))

(clojure.core/defn- req-batch-detect-dominant-language-request [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (ser-string-list (input :text-list)) #:http.request.field{:name "TextList", :shape "StringList"})]}))

(clojure.core/defn- req-delete-entity-recognizer-request [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (ser-entity-recognizer-arn (input :entity-recognizer-arn)) #:http.request.field{:name "EntityRecognizerArn", :shape "EntityRecognizerArn"})]}))

(clojure.core/defn- req-detect-syntax-request [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (ser-string (input :text)) #:http.request.field{:name "Text", :shape "String"}) (clojure.core/into (ser-syntax-language-code (input :language-code)) #:http.request.field{:name "LanguageCode", :shape "SyntaxLanguageCode"})]}))

(clojure.core/defn- req-start-entities-detection-job-request [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (ser-input-data-config (input :input-data-config)) #:http.request.field{:name "InputDataConfig", :shape "InputDataConfig"}) (clojure.core/into (ser-output-data-config (input :output-data-config)) #:http.request.field{:name "OutputDataConfig", :shape "OutputDataConfig"}) (clojure.core/into (ser-iam-role-arn (input :data-access-role-arn)) #:http.request.field{:name "DataAccessRoleArn", :shape "IamRoleArn"}) (clojure.core/into (ser-language-code (input :language-code)) #:http.request.field{:name "LanguageCode", :shape "LanguageCode"})]} (clojure.core/contains? input :job-name) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-job-name (input :job-name)) #:http.request.field{:name "JobName", :shape "JobName"})) (clojure.core/contains? input :entity-recognizer-arn) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-entity-recognizer-arn (input :entity-recognizer-arn)) #:http.request.field{:name "EntityRecognizerArn", :shape "EntityRecognizerArn"})) (clojure.core/contains? input :client-request-token) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-client-request-token-string (input :client-request-token)) #:http.request.field{:name "ClientRequestToken", :shape "ClientRequestTokenString", :idempotency-token true}))))

(clojure.core/defn- req-list-key-phrases-detection-jobs-request [input] (clojure.core/cond-> {} (clojure.core/contains? input :filter) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-key-phrases-detection-job-filter (input :filter)) #:http.request.field{:name "Filter", :shape "KeyPhrasesDetectionJobFilter"})) (clojure.core/contains? input :next-token) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-string (input :next-token)) #:http.request.field{:name "NextToken", :shape "String"})) (clojure.core/contains? input :max-results) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-max-results-integer (input :max-results)) #:http.request.field{:name "MaxResults", :shape "MaxResultsInteger"}))))

(clojure.core/defn- req-describe-topics-detection-job-request [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (ser-job-id (input :job-id)) #:http.request.field{:name "JobId", :shape "JobId"})]}))

(clojure.core/defn- req-detect-dominant-language-request [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (ser-string (input :text)) #:http.request.field{:name "Text", :shape "String"})]}))

(clojure.core/defn- req-stop-dominant-language-detection-job-request [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (ser-job-id (input :job-id)) #:http.request.field{:name "JobId", :shape "JobId"})]}))

(clojure.core/defn- req-stop-sentiment-detection-job-request [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (ser-job-id (input :job-id)) #:http.request.field{:name "JobId", :shape "JobId"})]}))

(clojure.core/defn- req-batch-detect-entities-request [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (ser-string-list (input :text-list)) #:http.request.field{:name "TextList", :shape "StringList"}) (clojure.core/into (ser-language-code (input :language-code)) #:http.request.field{:name "LanguageCode", :shape "LanguageCode"})]}))

(clojure.core/defn- req-list-entity-recognizers-request [input] (clojure.core/cond-> {} (clojure.core/contains? input :filter) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-entity-recognizer-filter (input :filter)) #:http.request.field{:name "Filter", :shape "EntityRecognizerFilter"})) (clojure.core/contains? input :next-token) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-string (input :next-token)) #:http.request.field{:name "NextToken", :shape "String"})) (clojure.core/contains? input :max-results) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-max-results-integer (input :max-results)) #:http.request.field{:name "MaxResults", :shape "MaxResultsInteger"}))))

(clojure.core/defn- req-list-topics-detection-jobs-request [input] (clojure.core/cond-> {} (clojure.core/contains? input :filter) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-topics-detection-job-filter (input :filter)) #:http.request.field{:name "Filter", :shape "TopicsDetectionJobFilter"})) (clojure.core/contains? input :next-token) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-string (input :next-token)) #:http.request.field{:name "NextToken", :shape "String"})) (clojure.core/contains? input :max-results) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-max-results-integer (input :max-results)) #:http.request.field{:name "MaxResults", :shape "MaxResultsInteger"}))))

(clojure.core/defn- req-start-key-phrases-detection-job-request [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (ser-input-data-config (input :input-data-config)) #:http.request.field{:name "InputDataConfig", :shape "InputDataConfig"}) (clojure.core/into (ser-output-data-config (input :output-data-config)) #:http.request.field{:name "OutputDataConfig", :shape "OutputDataConfig"}) (clojure.core/into (ser-iam-role-arn (input :data-access-role-arn)) #:http.request.field{:name "DataAccessRoleArn", :shape "IamRoleArn"}) (clojure.core/into (ser-language-code (input :language-code)) #:http.request.field{:name "LanguageCode", :shape "LanguageCode"})]} (clojure.core/contains? input :job-name) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-job-name (input :job-name)) #:http.request.field{:name "JobName", :shape "JobName"})) (clojure.core/contains? input :client-request-token) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-client-request-token-string (input :client-request-token)) #:http.request.field{:name "ClientRequestToken", :shape "ClientRequestTokenString", :idempotency-token true}))))

(clojure.core/defn- req-stop-entities-detection-job-request [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (ser-job-id (input :job-id)) #:http.request.field{:name "JobId", :shape "JobId"})]}))

(clojure.core/defn- req-list-entities-detection-jobs-request [input] (clojure.core/cond-> {} (clojure.core/contains? input :filter) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-entities-detection-job-filter (input :filter)) #:http.request.field{:name "Filter", :shape "EntitiesDetectionJobFilter"})) (clojure.core/contains? input :next-token) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-string (input :next-token)) #:http.request.field{:name "NextToken", :shape "String"})) (clojure.core/contains? input :max-results) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-max-results-integer (input :max-results)) #:http.request.field{:name "MaxResults", :shape "MaxResultsInteger"}))))

(clojure.core/defn- req-list-document-classification-jobs-request [input] (clojure.core/cond-> {} (clojure.core/contains? input :filter) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-document-classification-job-filter (input :filter)) #:http.request.field{:name "Filter", :shape "DocumentClassificationJobFilter"})) (clojure.core/contains? input :next-token) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-string (input :next-token)) #:http.request.field{:name "NextToken", :shape "String"})) (clojure.core/contains? input :max-results) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-max-results-integer (input :max-results)) #:http.request.field{:name "MaxResults", :shape "MaxResultsInteger"}))))

(clojure.core/defn- req-batch-detect-syntax-request [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (ser-string-list (input :text-list)) #:http.request.field{:name "TextList", :shape "StringList"}) (clojure.core/into (ser-syntax-language-code (input :language-code)) #:http.request.field{:name "LanguageCode", :shape "SyntaxLanguageCode"})]}))

(clojure.core/defn- req-start-document-classification-job-request [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (ser-document-classifier-arn (input :document-classifier-arn)) #:http.request.field{:name "DocumentClassifierArn", :shape "DocumentClassifierArn"}) (clojure.core/into (ser-input-data-config (input :input-data-config)) #:http.request.field{:name "InputDataConfig", :shape "InputDataConfig"}) (clojure.core/into (ser-output-data-config (input :output-data-config)) #:http.request.field{:name "OutputDataConfig", :shape "OutputDataConfig"}) (clojure.core/into (ser-iam-role-arn (input :data-access-role-arn)) #:http.request.field{:name "DataAccessRoleArn", :shape "IamRoleArn"})]} (clojure.core/contains? input :job-name) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-job-name (input :job-name)) #:http.request.field{:name "JobName", :shape "JobName"})) (clojure.core/contains? input :client-request-token) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-client-request-token-string (input :client-request-token)) #:http.request.field{:name "ClientRequestToken", :shape "ClientRequestTokenString", :idempotency-token true}))))

(clojure.core/defn- req-detect-entities-request [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (ser-string (input :text)) #:http.request.field{:name "Text", :shape "String"}) (clojure.core/into (ser-language-code (input :language-code)) #:http.request.field{:name "LanguageCode", :shape "LanguageCode"})]}))

(clojure.core/defn- req-start-topics-detection-job-request [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (ser-input-data-config (input :input-data-config)) #:http.request.field{:name "InputDataConfig", :shape "InputDataConfig"}) (clojure.core/into (ser-output-data-config (input :output-data-config)) #:http.request.field{:name "OutputDataConfig", :shape "OutputDataConfig"}) (clojure.core/into (ser-iam-role-arn (input :data-access-role-arn)) #:http.request.field{:name "DataAccessRoleArn", :shape "IamRoleArn"})]} (clojure.core/contains? input :job-name) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-job-name (input :job-name)) #:http.request.field{:name "JobName", :shape "JobName"})) (clojure.core/contains? input :number-of-topics) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-number-of-topics-integer (input :number-of-topics)) #:http.request.field{:name "NumberOfTopics", :shape "NumberOfTopicsInteger"})) (clojure.core/contains? input :client-request-token) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-client-request-token-string (input :client-request-token)) #:http.request.field{:name "ClientRequestToken", :shape "ClientRequestTokenString", :idempotency-token true}))))

(clojure.core/defn- req-list-sentiment-detection-jobs-request [input] (clojure.core/cond-> {} (clojure.core/contains? input :filter) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-sentiment-detection-job-filter (input :filter)) #:http.request.field{:name "Filter", :shape "SentimentDetectionJobFilter"})) (clojure.core/contains? input :next-token) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-string (input :next-token)) #:http.request.field{:name "NextToken", :shape "String"})) (clojure.core/contains? input :max-results) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-max-results-integer (input :max-results)) #:http.request.field{:name "MaxResults", :shape "MaxResultsInteger"}))))

(clojure.core/defn- req-stop-key-phrases-detection-job-request [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (ser-job-id (input :job-id)) #:http.request.field{:name "JobId", :shape "JobId"})]}))

(clojure.core/defn- req-describe-key-phrases-detection-job-request [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (ser-job-id (input :job-id)) #:http.request.field{:name "JobId", :shape "JobId"})]}))

(clojure.core/defn- req-detect-sentiment-request [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (ser-string (input :text)) #:http.request.field{:name "Text", :shape "String"}) (clojure.core/into (ser-language-code (input :language-code)) #:http.request.field{:name "LanguageCode", :shape "LanguageCode"})]}))

(clojure.core/defn- req-create-entity-recognizer-request [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (ser-comprehend-arn-name (input :recognizer-name)) #:http.request.field{:name "RecognizerName", :shape "ComprehendArnName"}) (clojure.core/into (ser-iam-role-arn (input :data-access-role-arn)) #:http.request.field{:name "DataAccessRoleArn", :shape "IamRoleArn"}) (clojure.core/into (ser-entity-recognizer-input-data-config (input :input-data-config)) #:http.request.field{:name "InputDataConfig", :shape "EntityRecognizerInputDataConfig"}) (clojure.core/into (ser-language-code (input :language-code)) #:http.request.field{:name "LanguageCode", :shape "LanguageCode"})]} (clojure.core/contains? input :client-request-token) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-client-request-token-string (input :client-request-token)) #:http.request.field{:name "ClientRequestToken", :shape "ClientRequestTokenString", :idempotency-token true}))))

(clojure.core/defn- req-describe-entity-recognizer-request [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (ser-entity-recognizer-arn (input :entity-recognizer-arn)) #:http.request.field{:name "EntityRecognizerArn", :shape "EntityRecognizerArn"})]}))

(clojure.core/defn- req-describe-entities-detection-job-request [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (ser-job-id (input :job-id)) #:http.request.field{:name "JobId", :shape "JobId"})]}))

(clojure.core/defn- req-describe-document-classifier-request [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (ser-document-classifier-arn (input :document-classifier-arn)) #:http.request.field{:name "DocumentClassifierArn", :shape "DocumentClassifierArn"})]}))

(clojure.core/defn- req-list-dominant-language-detection-jobs-request [input] (clojure.core/cond-> {} (clojure.core/contains? input :filter) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-dominant-language-detection-job-filter (input :filter)) #:http.request.field{:name "Filter", :shape "DominantLanguageDetectionJobFilter"})) (clojure.core/contains? input :next-token) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-string (input :next-token)) #:http.request.field{:name "NextToken", :shape "String"})) (clojure.core/contains? input :max-results) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-max-results-integer (input :max-results)) #:http.request.field{:name "MaxResults", :shape "MaxResultsInteger"}))))

(clojure.core/defn- req-create-document-classifier-request [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (ser-comprehend-arn-name (input :document-classifier-name)) #:http.request.field{:name "DocumentClassifierName", :shape "ComprehendArnName"}) (clojure.core/into (ser-iam-role-arn (input :data-access-role-arn)) #:http.request.field{:name "DataAccessRoleArn", :shape "IamRoleArn"}) (clojure.core/into (ser-document-classifier-input-data-config (input :input-data-config)) #:http.request.field{:name "InputDataConfig", :shape "DocumentClassifierInputDataConfig"}) (clojure.core/into (ser-language-code (input :language-code)) #:http.request.field{:name "LanguageCode", :shape "LanguageCode"})]} (clojure.core/contains? input :client-request-token) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-client-request-token-string (input :client-request-token)) #:http.request.field{:name "ClientRequestToken", :shape "ClientRequestTokenString", :idempotency-token true}))))

(clojure.core/defn- req-delete-document-classifier-request [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (ser-document-classifier-arn (input :document-classifier-arn)) #:http.request.field{:name "DocumentClassifierArn", :shape "DocumentClassifierArn"})]}))

(clojure.core/defn- req-batch-detect-sentiment-request [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (ser-string-list (input :text-list)) #:http.request.field{:name "TextList", :shape "StringList"}) (clojure.core/into (ser-language-code (input :language-code)) #:http.request.field{:name "LanguageCode", :shape "LanguageCode"})]}))

(clojure.core/declare deser-list-of-entities)

(clojure.core/declare deser-input-data-config)

(clojure.core/declare deser-entity-recognizer-properties)

(clojure.core/declare deser-double)

(clojure.core/declare deser-entity-types-list)

(clojure.core/declare deser-entity-recognizer-input-data-config)

(clojure.core/declare deser-output-data-config)

(clojure.core/declare deser-part-of-speech-tag-type)

(clojure.core/declare deser-list-of-dominant-languages)

(clojure.core/declare deser-entity-recognizer-metadata-entity-types-list)

(clojure.core/declare deser-job-status)

(clojure.core/declare deser-entity-recognizer-documents)

(clojure.core/declare deser-document-classification-job-properties)

(clojure.core/declare deser-entity-recognizer-metadata)

(clojure.core/declare deser-list-of-detect-dominant-language-result)

(clojure.core/declare deser-sentiment-type)

(clojure.core/declare deser-sentiment-score)

(clojure.core/declare deser-batch-detect-dominant-language-item-result)

(clojure.core/declare deser-job-name)

(clojure.core/declare deser-list-of-detect-entities-result)

(clojure.core/declare deser-key-phrase)

(clojure.core/declare deser-s-3-uri)

(clojure.core/declare deser-classifier-evaluation-metrics)

(clojure.core/declare deser-entity-recognizer-annotations)

(clojure.core/declare deser-dominant-language)

(clojure.core/declare deser-key-phrases-detection-job-properties)

(clojure.core/declare deser-dominant-language-detection-job-properties)

(clojure.core/declare deser-entity-recognizer-metadata-entity-types-list-item)

(clojure.core/declare deser-topics-detection-job-properties-list)

(clojure.core/declare deser-batch-item-error)

(clojure.core/declare deser-model-status)

(clojure.core/declare deser-iam-role-arn)

(clojure.core/declare deser-document-classifier-input-data-config)

(clojure.core/declare deser-entity-recognizer-arn)

(clojure.core/declare deser-entity-recognizer-evaluation-metrics)

(clojure.core/declare deser-syntax-token)

(clojure.core/declare deser-batch-detect-key-phrases-item-result)

(clojure.core/declare deser-batch-item-error-list)

(clojure.core/declare deser-document-classifier-properties)

(clojure.core/declare deser-language-code)

(clojure.core/declare deser-list-of-detect-key-phrases-result)

(clojure.core/declare deser-list-of-key-phrases)

(clojure.core/declare deser-document-classifier-properties-list)

(clojure.core/declare deser-list-of-detect-sentiment-result)

(clojure.core/declare deser-key-phrases-detection-job-properties-list)

(clojure.core/declare deser-integer)

(clojure.core/declare deser-string)

(clojure.core/declare deser-batch-detect-entities-item-result)

(clojure.core/declare deser-entity-type-name)

(clojure.core/declare deser-batch-detect-syntax-item-result)

(clojure.core/declare deser-document-classifier-arn)

(clojure.core/declare deser-batch-detect-sentiment-item-result)

(clojure.core/declare deser-entity-recognizer-entity-list)

(clojure.core/declare deser-classifier-metadata)

(clojure.core/declare deser-timestamp)

(clojure.core/declare deser-entity)

(clojure.core/declare deser-topics-detection-job-properties)

(clojure.core/declare deser-sentiment-detection-job-properties-list)

(clojure.core/declare deser-entity-types-list-item)

(clojure.core/declare deser-any-length-string)

(clojure.core/declare deser-list-of-detect-syntax-result)

(clojure.core/declare deser-entities-detection-job-properties)

(clojure.core/declare deser-input-format)

(clojure.core/declare deser-entity-recognizer-properties-list)

(clojure.core/declare deser-entity-type)

(clojure.core/declare deser-dominant-language-detection-job-properties-list)

(clojure.core/declare deser-float)

(clojure.core/declare deser-document-classification-job-properties-list)

(clojure.core/declare deser-sentiment-detection-job-properties)

(clojure.core/declare deser-part-of-speech-tag)

(clojure.core/declare deser-list-of-syntax-tokens)

(clojure.core/declare deser-entities-detection-job-properties-list)

(clojure.core/declare deser-job-id)

(clojure.core/defn- deser-list-of-entities [input] (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (deser-entity coll))) input))

(clojure.core/defn- deser-input-data-config [input] (clojure.core/cond-> {:s-3-uri (deser-s-3-uri (input "S3Uri"))} (clojure.core/contains? input "InputFormat") (clojure.core/assoc :input-format (deser-input-format (input "InputFormat")))))

(clojure.core/defn- deser-entity-recognizer-properties [input] (clojure.core/cond-> {} (clojure.core/contains? input "InputDataConfig") (clojure.core/assoc :input-data-config (deser-entity-recognizer-input-data-config (input "InputDataConfig"))) (clojure.core/contains? input "TrainingEndTime") (clojure.core/assoc :training-end-time (deser-timestamp (input "TrainingEndTime"))) (clojure.core/contains? input "EndTime") (clojure.core/assoc :end-time (deser-timestamp (input "EndTime"))) (clojure.core/contains? input "SubmitTime") (clojure.core/assoc :submit-time (deser-timestamp (input "SubmitTime"))) (clojure.core/contains? input "Status") (clojure.core/assoc :status (deser-model-status (input "Status"))) (clojure.core/contains? input "EntityRecognizerArn") (clojure.core/assoc :entity-recognizer-arn (deser-entity-recognizer-arn (input "EntityRecognizerArn"))) (clojure.core/contains? input "RecognizerMetadata") (clojure.core/assoc :recognizer-metadata (deser-entity-recognizer-metadata (input "RecognizerMetadata"))) (clojure.core/contains? input "LanguageCode") (clojure.core/assoc :language-code (deser-language-code (input "LanguageCode"))) (clojure.core/contains? input "Message") (clojure.core/assoc :message (deser-any-length-string (input "Message"))) (clojure.core/contains? input "DataAccessRoleArn") (clojure.core/assoc :data-access-role-arn (deser-iam-role-arn (input "DataAccessRoleArn"))) (clojure.core/contains? input "TrainingStartTime") (clojure.core/assoc :training-start-time (deser-timestamp (input "TrainingStartTime")))))

(clojure.core/defn- deser-double [input] input)

(clojure.core/defn- deser-entity-types-list [input] (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (deser-entity-types-list-item coll))) input))

(clojure.core/defn- deser-entity-recognizer-input-data-config [input] (clojure.core/cond-> {:entity-types (deser-entity-types-list (input "EntityTypes")), :documents (deser-entity-recognizer-documents (input "Documents"))} (clojure.core/contains? input "Annotations") (clojure.core/assoc :annotations (deser-entity-recognizer-annotations (input "Annotations"))) (clojure.core/contains? input "EntityList") (clojure.core/assoc :entity-list (deser-entity-recognizer-entity-list (input "EntityList")))))

(clojure.core/defn- deser-output-data-config [input] (clojure.core/cond-> {:s-3-uri (deser-s-3-uri (input "S3Uri"))}))

(clojure.core/defn- deser-part-of-speech-tag-type [input] (clojure.core/get {"AUX" :aux, "PRON" :pron, "ADV" :adv, "ADP" :adp, "ADJ" :adj, "PART" :part, "SYM" :sym, "NOUN" :noun, "CONJ" :conj, "INTJ" :intj, "SCONJ" :sconj, "PUNCT" :punct, "NUM" :num, "VERB" :verb, "O" :o, "DET" :det, "CCONJ" :cconj, "PROPN" :propn} input))

(clojure.core/defn- deser-list-of-dominant-languages [input] (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (deser-dominant-language coll))) input))

(clojure.core/defn- deser-entity-recognizer-metadata-entity-types-list [input] (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (deser-entity-recognizer-metadata-entity-types-list-item coll))) input))

(clojure.core/defn- deser-job-status [input] (clojure.core/get {"SUBMITTED" :submitted, "IN_PROGRESS" :in-progress, "COMPLETED" :completed, "FAILED" :failed, "STOP_REQUESTED" :stop-requested, "STOPPED" :stopped} input))

(clojure.core/defn- deser-entity-recognizer-documents [input] (clojure.core/cond-> {:s-3-uri (deser-s-3-uri (input "S3Uri"))}))

(clojure.core/defn- deser-document-classification-job-properties [input] (clojure.core/cond-> {} (clojure.core/contains? input "InputDataConfig") (clojure.core/assoc :input-data-config (deser-input-data-config (input "InputDataConfig"))) (clojure.core/contains? input "OutputDataConfig") (clojure.core/assoc :output-data-config (deser-output-data-config (input "OutputDataConfig"))) (clojure.core/contains? input "EndTime") (clojure.core/assoc :end-time (deser-timestamp (input "EndTime"))) (clojure.core/contains? input "JobStatus") (clojure.core/assoc :job-status (deser-job-status (input "JobStatus"))) (clojure.core/contains? input "JobName") (clojure.core/assoc :job-name (deser-job-name (input "JobName"))) (clojure.core/contains? input "SubmitTime") (clojure.core/assoc :submit-time (deser-timestamp (input "SubmitTime"))) (clojure.core/contains? input "Message") (clojure.core/assoc :message (deser-any-length-string (input "Message"))) (clojure.core/contains? input "DataAccessRoleArn") (clojure.core/assoc :data-access-role-arn (deser-iam-role-arn (input "DataAccessRoleArn"))) (clojure.core/contains? input "DocumentClassifierArn") (clojure.core/assoc :document-classifier-arn (deser-document-classifier-arn (input "DocumentClassifierArn"))) (clojure.core/contains? input "JobId") (clojure.core/assoc :job-id (deser-job-id (input "JobId")))))

(clojure.core/defn- deser-entity-recognizer-metadata [input] (clojure.core/cond-> {} (clojure.core/contains? input "NumberOfTrainedDocuments") (clojure.core/assoc :number-of-trained-documents (deser-integer (input "NumberOfTrainedDocuments"))) (clojure.core/contains? input "NumberOfTestDocuments") (clojure.core/assoc :number-of-test-documents (deser-integer (input "NumberOfTestDocuments"))) (clojure.core/contains? input "EvaluationMetrics") (clojure.core/assoc :evaluation-metrics (deser-entity-recognizer-evaluation-metrics (input "EvaluationMetrics"))) (clojure.core/contains? input "EntityTypes") (clojure.core/assoc :entity-types (deser-entity-recognizer-metadata-entity-types-list (input "EntityTypes")))))

(clojure.core/defn- deser-list-of-detect-dominant-language-result [input] (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (deser-batch-detect-dominant-language-item-result coll))) input))

(clojure.core/defn- deser-sentiment-type [input] (clojure.core/get {"POSITIVE" :positive, "NEGATIVE" :negative, "NEUTRAL" :neutral, "MIXED" :mixed} input))

(clojure.core/defn- deser-sentiment-score [input] (clojure.core/cond-> {} (clojure.core/contains? input "Positive") (clojure.core/assoc :positive (deser-float (input "Positive"))) (clojure.core/contains? input "Negative") (clojure.core/assoc :negative (deser-float (input "Negative"))) (clojure.core/contains? input "Neutral") (clojure.core/assoc :neutral (deser-float (input "Neutral"))) (clojure.core/contains? input "Mixed") (clojure.core/assoc :mixed (deser-float (input "Mixed")))))

(clojure.core/defn- deser-batch-detect-dominant-language-item-result [input] (clojure.core/cond-> {} (clojure.core/contains? input "Index") (clojure.core/assoc :index (deser-integer (input "Index"))) (clojure.core/contains? input "Languages") (clojure.core/assoc :languages (deser-list-of-dominant-languages (input "Languages")))))

(clojure.core/defn- deser-job-name [input] input)

(clojure.core/defn- deser-list-of-detect-entities-result [input] (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (deser-batch-detect-entities-item-result coll))) input))

(clojure.core/defn- deser-key-phrase [input] (clojure.core/cond-> {} (clojure.core/contains? input "Score") (clojure.core/assoc :score (deser-float (input "Score"))) (clojure.core/contains? input "Text") (clojure.core/assoc :text (deser-string (input "Text"))) (clojure.core/contains? input "BeginOffset") (clojure.core/assoc :begin-offset (deser-integer (input "BeginOffset"))) (clojure.core/contains? input "EndOffset") (clojure.core/assoc :end-offset (deser-integer (input "EndOffset")))))

(clojure.core/defn- deser-s-3-uri [input] input)

(clojure.core/defn- deser-classifier-evaluation-metrics [input] (clojure.core/cond-> {} (clojure.core/contains? input "Accuracy") (clojure.core/assoc :accuracy (deser-double (input "Accuracy"))) (clojure.core/contains? input "Precision") (clojure.core/assoc :precision (deser-double (input "Precision"))) (clojure.core/contains? input "Recall") (clojure.core/assoc :recall (deser-double (input "Recall"))) (clojure.core/contains? input "F1Score") (clojure.core/assoc :f-1-score (deser-double (input "F1Score")))))

(clojure.core/defn- deser-entity-recognizer-annotations [input] (clojure.core/cond-> {:s-3-uri (deser-s-3-uri (input "S3Uri"))}))

(clojure.core/defn- deser-dominant-language [input] (clojure.core/cond-> {} (clojure.core/contains? input "LanguageCode") (clojure.core/assoc :language-code (deser-string (input "LanguageCode"))) (clojure.core/contains? input "Score") (clojure.core/assoc :score (deser-float (input "Score")))))

(clojure.core/defn- deser-key-phrases-detection-job-properties [input] (clojure.core/cond-> {} (clojure.core/contains? input "InputDataConfig") (clojure.core/assoc :input-data-config (deser-input-data-config (input "InputDataConfig"))) (clojure.core/contains? input "OutputDataConfig") (clojure.core/assoc :output-data-config (deser-output-data-config (input "OutputDataConfig"))) (clojure.core/contains? input "EndTime") (clojure.core/assoc :end-time (deser-timestamp (input "EndTime"))) (clojure.core/contains? input "JobStatus") (clojure.core/assoc :job-status (deser-job-status (input "JobStatus"))) (clojure.core/contains? input "JobName") (clojure.core/assoc :job-name (deser-job-name (input "JobName"))) (clojure.core/contains? input "SubmitTime") (clojure.core/assoc :submit-time (deser-timestamp (input "SubmitTime"))) (clojure.core/contains? input "LanguageCode") (clojure.core/assoc :language-code (deser-language-code (input "LanguageCode"))) (clojure.core/contains? input "Message") (clojure.core/assoc :message (deser-any-length-string (input "Message"))) (clojure.core/contains? input "DataAccessRoleArn") (clojure.core/assoc :data-access-role-arn (deser-iam-role-arn (input "DataAccessRoleArn"))) (clojure.core/contains? input "JobId") (clojure.core/assoc :job-id (deser-job-id (input "JobId")))))

(clojure.core/defn- deser-dominant-language-detection-job-properties [input] (clojure.core/cond-> {} (clojure.core/contains? input "InputDataConfig") (clojure.core/assoc :input-data-config (deser-input-data-config (input "InputDataConfig"))) (clojure.core/contains? input "OutputDataConfig") (clojure.core/assoc :output-data-config (deser-output-data-config (input "OutputDataConfig"))) (clojure.core/contains? input "EndTime") (clojure.core/assoc :end-time (deser-timestamp (input "EndTime"))) (clojure.core/contains? input "JobStatus") (clojure.core/assoc :job-status (deser-job-status (input "JobStatus"))) (clojure.core/contains? input "JobName") (clojure.core/assoc :job-name (deser-job-name (input "JobName"))) (clojure.core/contains? input "SubmitTime") (clojure.core/assoc :submit-time (deser-timestamp (input "SubmitTime"))) (clojure.core/contains? input "Message") (clojure.core/assoc :message (deser-any-length-string (input "Message"))) (clojure.core/contains? input "DataAccessRoleArn") (clojure.core/assoc :data-access-role-arn (deser-iam-role-arn (input "DataAccessRoleArn"))) (clojure.core/contains? input "JobId") (clojure.core/assoc :job-id (deser-job-id (input "JobId")))))

(clojure.core/defn- deser-entity-recognizer-metadata-entity-types-list-item [input] (clojure.core/cond-> {} (clojure.core/contains? input "Type") (clojure.core/assoc :type (deser-any-length-string (input "Type")))))

(clojure.core/defn- deser-topics-detection-job-properties-list [input] (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (deser-topics-detection-job-properties coll))) input))

(clojure.core/defn- deser-batch-item-error [input] (clojure.core/cond-> {} (clojure.core/contains? input "Index") (clojure.core/assoc :index (deser-integer (input "Index"))) (clojure.core/contains? input "ErrorCode") (clojure.core/assoc :error-code (deser-string (input "ErrorCode"))) (clojure.core/contains? input "ErrorMessage") (clojure.core/assoc :error-message (deser-string (input "ErrorMessage")))))

(clojure.core/defn- deser-model-status [input] (clojure.core/get {"SUBMITTED" :submitted, "TRAINING" :training, "DELETING" :deleting, "STOP_REQUESTED" :stop-requested, "STOPPED" :stopped, "IN_ERROR" :in-error, "TRAINED" :trained} input))

(clojure.core/defn- deser-iam-role-arn [input] input)

(clojure.core/defn- deser-document-classifier-input-data-config [input] (clojure.core/cond-> {:s-3-uri (deser-s-3-uri (input "S3Uri"))}))

(clojure.core/defn- deser-entity-recognizer-arn [input] input)

(clojure.core/defn- deser-entity-recognizer-evaluation-metrics [input] (clojure.core/cond-> {} (clojure.core/contains? input "Precision") (clojure.core/assoc :precision (deser-double (input "Precision"))) (clojure.core/contains? input "Recall") (clojure.core/assoc :recall (deser-double (input "Recall"))) (clojure.core/contains? input "F1Score") (clojure.core/assoc :f-1-score (deser-double (input "F1Score")))))

(clojure.core/defn- deser-syntax-token [input] (clojure.core/cond-> {} (clojure.core/contains? input "TokenId") (clojure.core/assoc :token-id (deser-integer (input "TokenId"))) (clojure.core/contains? input "Text") (clojure.core/assoc :text (deser-string (input "Text"))) (clojure.core/contains? input "BeginOffset") (clojure.core/assoc :begin-offset (deser-integer (input "BeginOffset"))) (clojure.core/contains? input "EndOffset") (clojure.core/assoc :end-offset (deser-integer (input "EndOffset"))) (clojure.core/contains? input "PartOfSpeech") (clojure.core/assoc :part-of-speech (deser-part-of-speech-tag (input "PartOfSpeech")))))

(clojure.core/defn- deser-batch-detect-key-phrases-item-result [input] (clojure.core/cond-> {} (clojure.core/contains? input "Index") (clojure.core/assoc :index (deser-integer (input "Index"))) (clojure.core/contains? input "KeyPhrases") (clojure.core/assoc :key-phrases (deser-list-of-key-phrases (input "KeyPhrases")))))

(clojure.core/defn- deser-batch-item-error-list [input] (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (deser-batch-item-error coll))) input))

(clojure.core/defn- deser-document-classifier-properties [input] (clojure.core/cond-> {} (clojure.core/contains? input "InputDataConfig") (clojure.core/assoc :input-data-config (deser-document-classifier-input-data-config (input "InputDataConfig"))) (clojure.core/contains? input "TrainingEndTime") (clojure.core/assoc :training-end-time (deser-timestamp (input "TrainingEndTime"))) (clojure.core/contains? input "EndTime") (clojure.core/assoc :end-time (deser-timestamp (input "EndTime"))) (clojure.core/contains? input "SubmitTime") (clojure.core/assoc :submit-time (deser-timestamp (input "SubmitTime"))) (clojure.core/contains? input "Status") (clojure.core/assoc :status (deser-model-status (input "Status"))) (clojure.core/contains? input "LanguageCode") (clojure.core/assoc :language-code (deser-language-code (input "LanguageCode"))) (clojure.core/contains? input "Message") (clojure.core/assoc :message (deser-any-length-string (input "Message"))) (clojure.core/contains? input "DataAccessRoleArn") (clojure.core/assoc :data-access-role-arn (deser-iam-role-arn (input "DataAccessRoleArn"))) (clojure.core/contains? input "DocumentClassifierArn") (clojure.core/assoc :document-classifier-arn (deser-document-classifier-arn (input "DocumentClassifierArn"))) (clojure.core/contains? input "ClassifierMetadata") (clojure.core/assoc :classifier-metadata (deser-classifier-metadata (input "ClassifierMetadata"))) (clojure.core/contains? input "TrainingStartTime") (clojure.core/assoc :training-start-time (deser-timestamp (input "TrainingStartTime")))))

(clojure.core/defn- deser-language-code [input] (clojure.core/get {"en" :en, "es" :es, "fr" :fr, "de" :de, "it" :it, "pt" :pt} input))

(clojure.core/defn- deser-list-of-detect-key-phrases-result [input] (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (deser-batch-detect-key-phrases-item-result coll))) input))

(clojure.core/defn- deser-list-of-key-phrases [input] (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (deser-key-phrase coll))) input))

(clojure.core/defn- deser-document-classifier-properties-list [input] (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (deser-document-classifier-properties coll))) input))

(clojure.core/defn- deser-list-of-detect-sentiment-result [input] (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (deser-batch-detect-sentiment-item-result coll))) input))

(clojure.core/defn- deser-key-phrases-detection-job-properties-list [input] (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (deser-key-phrases-detection-job-properties coll))) input))

(clojure.core/defn- deser-integer [input] input)

(clojure.core/defn- deser-string [input] input)

(clojure.core/defn- deser-batch-detect-entities-item-result [input] (clojure.core/cond-> {} (clojure.core/contains? input "Index") (clojure.core/assoc :index (deser-integer (input "Index"))) (clojure.core/contains? input "Entities") (clojure.core/assoc :entities (deser-list-of-entities (input "Entities")))))

(clojure.core/defn- deser-entity-type-name [input] input)

(clojure.core/defn- deser-batch-detect-syntax-item-result [input] (clojure.core/cond-> {} (clojure.core/contains? input "Index") (clojure.core/assoc :index (deser-integer (input "Index"))) (clojure.core/contains? input "SyntaxTokens") (clojure.core/assoc :syntax-tokens (deser-list-of-syntax-tokens (input "SyntaxTokens")))))

(clojure.core/defn- deser-document-classifier-arn [input] input)

(clojure.core/defn- deser-batch-detect-sentiment-item-result [input] (clojure.core/cond-> {} (clojure.core/contains? input "Index") (clojure.core/assoc :index (deser-integer (input "Index"))) (clojure.core/contains? input "Sentiment") (clojure.core/assoc :sentiment (deser-sentiment-type (input "Sentiment"))) (clojure.core/contains? input "SentimentScore") (clojure.core/assoc :sentiment-score (deser-sentiment-score (input "SentimentScore")))))

(clojure.core/defn- deser-entity-recognizer-entity-list [input] (clojure.core/cond-> {:s-3-uri (deser-s-3-uri (input "S3Uri"))}))

(clojure.core/defn- deser-classifier-metadata [input] (clojure.core/cond-> {} (clojure.core/contains? input "NumberOfLabels") (clojure.core/assoc :number-of-labels (deser-integer (input "NumberOfLabels"))) (clojure.core/contains? input "NumberOfTrainedDocuments") (clojure.core/assoc :number-of-trained-documents (deser-integer (input "NumberOfTrainedDocuments"))) (clojure.core/contains? input "NumberOfTestDocuments") (clojure.core/assoc :number-of-test-documents (deser-integer (input "NumberOfTestDocuments"))) (clojure.core/contains? input "EvaluationMetrics") (clojure.core/assoc :evaluation-metrics (deser-classifier-evaluation-metrics (input "EvaluationMetrics")))))

(clojure.core/defn- deser-timestamp [input] input)

(clojure.core/defn- deser-entity [input] (clojure.core/cond-> {} (clojure.core/contains? input "Score") (clojure.core/assoc :score (deser-float (input "Score"))) (clojure.core/contains? input "Type") (clojure.core/assoc :type (deser-entity-type (input "Type"))) (clojure.core/contains? input "Text") (clojure.core/assoc :text (deser-string (input "Text"))) (clojure.core/contains? input "BeginOffset") (clojure.core/assoc :begin-offset (deser-integer (input "BeginOffset"))) (clojure.core/contains? input "EndOffset") (clojure.core/assoc :end-offset (deser-integer (input "EndOffset")))))

(clojure.core/defn- deser-topics-detection-job-properties [input] (clojure.core/cond-> {} (clojure.core/contains? input "InputDataConfig") (clojure.core/assoc :input-data-config (deser-input-data-config (input "InputDataConfig"))) (clojure.core/contains? input "OutputDataConfig") (clojure.core/assoc :output-data-config (deser-output-data-config (input "OutputDataConfig"))) (clojure.core/contains? input "EndTime") (clojure.core/assoc :end-time (deser-timestamp (input "EndTime"))) (clojure.core/contains? input "NumberOfTopics") (clojure.core/assoc :number-of-topics (deser-integer (input "NumberOfTopics"))) (clojure.core/contains? input "JobStatus") (clojure.core/assoc :job-status (deser-job-status (input "JobStatus"))) (clojure.core/contains? input "JobName") (clojure.core/assoc :job-name (deser-job-name (input "JobName"))) (clojure.core/contains? input "SubmitTime") (clojure.core/assoc :submit-time (deser-timestamp (input "SubmitTime"))) (clojure.core/contains? input "Message") (clojure.core/assoc :message (deser-any-length-string (input "Message"))) (clojure.core/contains? input "JobId") (clojure.core/assoc :job-id (deser-job-id (input "JobId")))))

(clojure.core/defn- deser-sentiment-detection-job-properties-list [input] (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (deser-sentiment-detection-job-properties coll))) input))

(clojure.core/defn- deser-entity-types-list-item [input] (clojure.core/cond-> {:type (deser-entity-type-name (input "Type"))}))

(clojure.core/defn- deser-any-length-string [input] input)

(clojure.core/defn- deser-list-of-detect-syntax-result [input] (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (deser-batch-detect-syntax-item-result coll))) input))

(clojure.core/defn- deser-entities-detection-job-properties [input] (clojure.core/cond-> {} (clojure.core/contains? input "InputDataConfig") (clojure.core/assoc :input-data-config (deser-input-data-config (input "InputDataConfig"))) (clojure.core/contains? input "OutputDataConfig") (clojure.core/assoc :output-data-config (deser-output-data-config (input "OutputDataConfig"))) (clojure.core/contains? input "EndTime") (clojure.core/assoc :end-time (deser-timestamp (input "EndTime"))) (clojure.core/contains? input "JobStatus") (clojure.core/assoc :job-status (deser-job-status (input "JobStatus"))) (clojure.core/contains? input "JobName") (clojure.core/assoc :job-name (deser-job-name (input "JobName"))) (clojure.core/contains? input "SubmitTime") (clojure.core/assoc :submit-time (deser-timestamp (input "SubmitTime"))) (clojure.core/contains? input "EntityRecognizerArn") (clojure.core/assoc :entity-recognizer-arn (deser-entity-recognizer-arn (input "EntityRecognizerArn"))) (clojure.core/contains? input "LanguageCode") (clojure.core/assoc :language-code (deser-language-code (input "LanguageCode"))) (clojure.core/contains? input "Message") (clojure.core/assoc :message (deser-any-length-string (input "Message"))) (clojure.core/contains? input "DataAccessRoleArn") (clojure.core/assoc :data-access-role-arn (deser-iam-role-arn (input "DataAccessRoleArn"))) (clojure.core/contains? input "JobId") (clojure.core/assoc :job-id (deser-job-id (input "JobId")))))

(clojure.core/defn- deser-input-format [input] (clojure.core/get {"ONE_DOC_PER_FILE" :one-doc-per-file, "ONE_DOC_PER_LINE" :one-doc-per-line} input))

(clojure.core/defn- deser-entity-recognizer-properties-list [input] (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (deser-entity-recognizer-properties coll))) input))

(clojure.core/defn- deser-entity-type [input] (clojure.core/get {"ORGANIZATION" :organization, "TITLE" :title, "DATE" :date, "PERSON" :person, "EVENT" :event, "QUANTITY" :quantity, "OTHER" :other, "LOCATION" :location, "COMMERCIAL_ITEM" :commercial-item} input))

(clojure.core/defn- deser-dominant-language-detection-job-properties-list [input] (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (deser-dominant-language-detection-job-properties coll))) input))

(clojure.core/defn- deser-float [input] input)

(clojure.core/defn- deser-document-classification-job-properties-list [input] (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (deser-document-classification-job-properties coll))) input))

(clojure.core/defn- deser-sentiment-detection-job-properties [input] (clojure.core/cond-> {} (clojure.core/contains? input "InputDataConfig") (clojure.core/assoc :input-data-config (deser-input-data-config (input "InputDataConfig"))) (clojure.core/contains? input "OutputDataConfig") (clojure.core/assoc :output-data-config (deser-output-data-config (input "OutputDataConfig"))) (clojure.core/contains? input "EndTime") (clojure.core/assoc :end-time (deser-timestamp (input "EndTime"))) (clojure.core/contains? input "JobStatus") (clojure.core/assoc :job-status (deser-job-status (input "JobStatus"))) (clojure.core/contains? input "JobName") (clojure.core/assoc :job-name (deser-job-name (input "JobName"))) (clojure.core/contains? input "SubmitTime") (clojure.core/assoc :submit-time (deser-timestamp (input "SubmitTime"))) (clojure.core/contains? input "LanguageCode") (clojure.core/assoc :language-code (deser-language-code (input "LanguageCode"))) (clojure.core/contains? input "Message") (clojure.core/assoc :message (deser-any-length-string (input "Message"))) (clojure.core/contains? input "DataAccessRoleArn") (clojure.core/assoc :data-access-role-arn (deser-iam-role-arn (input "DataAccessRoleArn"))) (clojure.core/contains? input "JobId") (clojure.core/assoc :job-id (deser-job-id (input "JobId")))))

(clojure.core/defn- deser-part-of-speech-tag [input] (clojure.core/cond-> {} (clojure.core/contains? input "Tag") (clojure.core/assoc :tag (deser-part-of-speech-tag-type (input "Tag"))) (clojure.core/contains? input "Score") (clojure.core/assoc :score (deser-float (input "Score")))))

(clojure.core/defn- deser-list-of-syntax-tokens [input] (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (deser-syntax-token coll))) input))

(clojure.core/defn- deser-entities-detection-job-properties-list [input] (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (deser-entities-detection-job-properties coll))) input))

(clojure.core/defn- deser-job-id [input] input)

(clojure.core/defn- response-start-topics-detection-job-response ([input] (response-start-topics-detection-job-response nil input)) ([resultWrapper1577652 input] (clojure.core/let [rawinput1577651 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar1577653 {"JobId" (rawinput1577651 "JobId"), "JobStatus" (rawinput1577651 "JobStatus")}] (clojure.core/cond-> {} (letvar1577653 "JobId") (clojure.core/assoc :job-id (deser-job-id (clojure.core/get-in letvar1577653 ["JobId"]))) (letvar1577653 "JobStatus") (clojure.core/assoc :job-status (deser-job-status (clojure.core/get-in letvar1577653 ["JobStatus"])))))))

(clojure.core/defn- response-list-key-phrases-detection-jobs-response ([input] (response-list-key-phrases-detection-jobs-response nil input)) ([resultWrapper1577655 input] (clojure.core/let [rawinput1577654 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar1577656 {"KeyPhrasesDetectionJobPropertiesList" (rawinput1577654 "KeyPhrasesDetectionJobPropertiesList"), "NextToken" (rawinput1577654 "NextToken")}] (clojure.core/cond-> {} (letvar1577656 "KeyPhrasesDetectionJobPropertiesList") (clojure.core/assoc :key-phrases-detection-job-properties-list (deser-key-phrases-detection-job-properties-list (clojure.core/get-in letvar1577656 ["KeyPhrasesDetectionJobPropertiesList"]))) (letvar1577656 "NextToken") (clojure.core/assoc :next-token (deser-string (clojure.core/get-in letvar1577656 ["NextToken"])))))))

(clojure.core/defn- response-describe-document-classification-job-response ([input] (response-describe-document-classification-job-response nil input)) ([resultWrapper1577658 input] (clojure.core/let [rawinput1577657 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar1577659 {"DocumentClassificationJobProperties" (rawinput1577657 "DocumentClassificationJobProperties")}] (clojure.core/cond-> {} (letvar1577659 "DocumentClassificationJobProperties") (clojure.core/assoc :document-classification-job-properties (deser-document-classification-job-properties (clojure.core/get-in letvar1577659 ["DocumentClassificationJobProperties"])))))))

(clojure.core/defn- response-batch-detect-key-phrases-response ([input] (response-batch-detect-key-phrases-response nil input)) ([resultWrapper1577661 input] (clojure.core/let [rawinput1577660 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar1577662 {"ResultList" (rawinput1577660 "ResultList"), "ErrorList" (rawinput1577660 "ErrorList")}] (clojure.core/cond-> {:result-list (deser-list-of-detect-key-phrases-result (clojure.core/get-in letvar1577662 ["ResultList"])), :error-list (deser-batch-item-error-list (clojure.core/get-in letvar1577662 ["ErrorList"]))}))))

(clojure.core/defn- response-stop-dominant-language-detection-job-response ([input] (response-stop-dominant-language-detection-job-response nil input)) ([resultWrapper1577664 input] (clojure.core/let [rawinput1577663 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar1577665 {"JobId" (rawinput1577663 "JobId"), "JobStatus" (rawinput1577663 "JobStatus")}] (clojure.core/cond-> {} (letvar1577665 "JobId") (clojure.core/assoc :job-id (deser-job-id (clojure.core/get-in letvar1577665 ["JobId"]))) (letvar1577665 "JobStatus") (clojure.core/assoc :job-status (deser-job-status (clojure.core/get-in letvar1577665 ["JobStatus"])))))))

(clojure.core/defn- response-batch-detect-dominant-language-response ([input] (response-batch-detect-dominant-language-response nil input)) ([resultWrapper1577667 input] (clojure.core/let [rawinput1577666 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar1577668 {"ResultList" (rawinput1577666 "ResultList"), "ErrorList" (rawinput1577666 "ErrorList")}] (clojure.core/cond-> {:result-list (deser-list-of-detect-dominant-language-result (clojure.core/get-in letvar1577668 ["ResultList"])), :error-list (deser-batch-item-error-list (clojure.core/get-in letvar1577668 ["ErrorList"]))}))))

(clojure.core/defn- response-unsupported-language-exception ([input] (response-unsupported-language-exception nil input)) ([resultWrapper1577670 input] (clojure.core/let [rawinput1577669 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar1577671 {"Message" (rawinput1577669 "Message")}] (clojure.core/cond-> {} (letvar1577671 "Message") (clojure.core/assoc :message (deser-string (clojure.core/get-in letvar1577671 ["Message"])))))))

(clojure.core/defn- response-start-dominant-language-detection-job-response ([input] (response-start-dominant-language-detection-job-response nil input)) ([resultWrapper1577673 input] (clojure.core/let [rawinput1577672 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar1577674 {"JobId" (rawinput1577672 "JobId"), "JobStatus" (rawinput1577672 "JobStatus")}] (clojure.core/cond-> {} (letvar1577674 "JobId") (clojure.core/assoc :job-id (deser-job-id (clojure.core/get-in letvar1577674 ["JobId"]))) (letvar1577674 "JobStatus") (clojure.core/assoc :job-status (deser-job-status (clojure.core/get-in letvar1577674 ["JobStatus"])))))))

(clojure.core/defn- response-stop-training-entity-recognizer-response ([input] (response-stop-training-entity-recognizer-response nil input)) ([resultWrapper1577676 input] (clojure.core/let [rawinput1577675 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar1577677 {}] (clojure.core/cond-> {}))))

(clojure.core/defn- response-list-entities-detection-jobs-response ([input] (response-list-entities-detection-jobs-response nil input)) ([resultWrapper1577679 input] (clojure.core/let [rawinput1577678 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar1577680 {"EntitiesDetectionJobPropertiesList" (rawinput1577678 "EntitiesDetectionJobPropertiesList"), "NextToken" (rawinput1577678 "NextToken")}] (clojure.core/cond-> {} (letvar1577680 "EntitiesDetectionJobPropertiesList") (clojure.core/assoc :entities-detection-job-properties-list (deser-entities-detection-job-properties-list (clojure.core/get-in letvar1577680 ["EntitiesDetectionJobPropertiesList"]))) (letvar1577680 "NextToken") (clojure.core/assoc :next-token (deser-string (clojure.core/get-in letvar1577680 ["NextToken"])))))))

(clojure.core/defn- response-invalid-request-exception ([input] (response-invalid-request-exception nil input)) ([resultWrapper1577682 input] (clojure.core/let [rawinput1577681 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar1577683 {"Message" (rawinput1577681 "Message")}] (clojure.core/cond-> {} (letvar1577683 "Message") (clojure.core/assoc :message (deser-string (clojure.core/get-in letvar1577683 ["Message"])))))))

(clojure.core/defn- response-start-entities-detection-job-response ([input] (response-start-entities-detection-job-response nil input)) ([resultWrapper1577685 input] (clojure.core/let [rawinput1577684 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar1577686 {"JobId" (rawinput1577684 "JobId"), "JobStatus" (rawinput1577684 "JobStatus")}] (clojure.core/cond-> {} (letvar1577686 "JobId") (clojure.core/assoc :job-id (deser-job-id (clojure.core/get-in letvar1577686 ["JobId"]))) (letvar1577686 "JobStatus") (clojure.core/assoc :job-status (deser-job-status (clojure.core/get-in letvar1577686 ["JobStatus"])))))))

(clojure.core/defn- response-start-key-phrases-detection-job-response ([input] (response-start-key-phrases-detection-job-response nil input)) ([resultWrapper1577688 input] (clojure.core/let [rawinput1577687 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar1577689 {"JobId" (rawinput1577687 "JobId"), "JobStatus" (rawinput1577687 "JobStatus")}] (clojure.core/cond-> {} (letvar1577689 "JobId") (clojure.core/assoc :job-id (deser-job-id (clojure.core/get-in letvar1577689 ["JobId"]))) (letvar1577689 "JobStatus") (clojure.core/assoc :job-status (deser-job-status (clojure.core/get-in letvar1577689 ["JobStatus"])))))))

(clojure.core/defn- response-detect-sentiment-response ([input] (response-detect-sentiment-response nil input)) ([resultWrapper1577691 input] (clojure.core/let [rawinput1577690 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar1577692 {"Sentiment" (rawinput1577690 "Sentiment"), "SentimentScore" (rawinput1577690 "SentimentScore")}] (clojure.core/cond-> {} (letvar1577692 "Sentiment") (clojure.core/assoc :sentiment (deser-sentiment-type (clojure.core/get-in letvar1577692 ["Sentiment"]))) (letvar1577692 "SentimentScore") (clojure.core/assoc :sentiment-score (deser-sentiment-score (clojure.core/get-in letvar1577692 ["SentimentScore"])))))))

(clojure.core/defn- response-stop-training-document-classifier-response ([input] (response-stop-training-document-classifier-response nil input)) ([resultWrapper1577694 input] (clojure.core/let [rawinput1577693 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar1577695 {}] (clojure.core/cond-> {}))))

(clojure.core/defn- response-detect-dominant-language-response ([input] (response-detect-dominant-language-response nil input)) ([resultWrapper1577697 input] (clojure.core/let [rawinput1577696 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar1577698 {"Languages" (rawinput1577696 "Languages")}] (clojure.core/cond-> {} (letvar1577698 "Languages") (clojure.core/assoc :languages (deser-list-of-dominant-languages (clojure.core/get-in letvar1577698 ["Languages"])))))))

(clojure.core/defn- response-text-size-limit-exceeded-exception ([input] (response-text-size-limit-exceeded-exception nil input)) ([resultWrapper1577700 input] (clojure.core/let [rawinput1577699 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar1577701 {"Message" (rawinput1577699 "Message")}] (clojure.core/cond-> {} (letvar1577701 "Message") (clojure.core/assoc :message (deser-string (clojure.core/get-in letvar1577701 ["Message"])))))))

(clojure.core/defn- response-detect-key-phrases-response ([input] (response-detect-key-phrases-response nil input)) ([resultWrapper1577703 input] (clojure.core/let [rawinput1577702 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar1577704 {"KeyPhrases" (rawinput1577702 "KeyPhrases")}] (clojure.core/cond-> {} (letvar1577704 "KeyPhrases") (clojure.core/assoc :key-phrases (deser-list-of-key-phrases (clojure.core/get-in letvar1577704 ["KeyPhrases"])))))))

(clojure.core/defn- response-resource-in-use-exception ([input] (response-resource-in-use-exception nil input)) ([resultWrapper1577706 input] (clojure.core/let [rawinput1577705 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar1577707 {"Message" (rawinput1577705 "Message")}] (clojure.core/cond-> {} (letvar1577707 "Message") (clojure.core/assoc :message (deser-string (clojure.core/get-in letvar1577707 ["Message"])))))))

(clojure.core/defn- response-delete-document-classifier-response ([input] (response-delete-document-classifier-response nil input)) ([resultWrapper1577709 input] (clojure.core/let [rawinput1577708 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar1577710 {}] (clojure.core/cond-> {}))))

(clojure.core/defn- response-batch-detect-syntax-response ([input] (response-batch-detect-syntax-response nil input)) ([resultWrapper1577712 input] (clojure.core/let [rawinput1577711 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar1577713 {"ResultList" (rawinput1577711 "ResultList"), "ErrorList" (rawinput1577711 "ErrorList")}] (clojure.core/cond-> {:result-list (deser-list-of-detect-syntax-result (clojure.core/get-in letvar1577713 ["ResultList"])), :error-list (deser-batch-item-error-list (clojure.core/get-in letvar1577713 ["ErrorList"]))}))))

(clojure.core/defn- response-invalid-filter-exception ([input] (response-invalid-filter-exception nil input)) ([resultWrapper1577715 input] (clojure.core/let [rawinput1577714 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar1577716 {"Message" (rawinput1577714 "Message")}] (clojure.core/cond-> {} (letvar1577716 "Message") (clojure.core/assoc :message (deser-string (clojure.core/get-in letvar1577716 ["Message"])))))))

(clojure.core/defn- response-describe-sentiment-detection-job-response ([input] (response-describe-sentiment-detection-job-response nil input)) ([resultWrapper1577718 input] (clojure.core/let [rawinput1577717 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar1577719 {"SentimentDetectionJobProperties" (rawinput1577717 "SentimentDetectionJobProperties")}] (clojure.core/cond-> {} (letvar1577719 "SentimentDetectionJobProperties") (clojure.core/assoc :sentiment-detection-job-properties (deser-sentiment-detection-job-properties (clojure.core/get-in letvar1577719 ["SentimentDetectionJobProperties"])))))))

(clojure.core/defn- response-list-document-classification-jobs-response ([input] (response-list-document-classification-jobs-response nil input)) ([resultWrapper1577721 input] (clojure.core/let [rawinput1577720 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar1577722 {"DocumentClassificationJobPropertiesList" (rawinput1577720 "DocumentClassificationJobPropertiesList"), "NextToken" (rawinput1577720 "NextToken")}] (clojure.core/cond-> {} (letvar1577722 "DocumentClassificationJobPropertiesList") (clojure.core/assoc :document-classification-job-properties-list (deser-document-classification-job-properties-list (clojure.core/get-in letvar1577722 ["DocumentClassificationJobPropertiesList"]))) (letvar1577722 "NextToken") (clojure.core/assoc :next-token (deser-string (clojure.core/get-in letvar1577722 ["NextToken"])))))))

(clojure.core/defn- response-create-document-classifier-response ([input] (response-create-document-classifier-response nil input)) ([resultWrapper1577724 input] (clojure.core/let [rawinput1577723 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar1577725 {"DocumentClassifierArn" (rawinput1577723 "DocumentClassifierArn")}] (clojure.core/cond-> {} (letvar1577725 "DocumentClassifierArn") (clojure.core/assoc :document-classifier-arn (deser-document-classifier-arn (clojure.core/get-in letvar1577725 ["DocumentClassifierArn"])))))))

(clojure.core/defn- response-describe-document-classifier-response ([input] (response-describe-document-classifier-response nil input)) ([resultWrapper1577727 input] (clojure.core/let [rawinput1577726 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar1577728 {"DocumentClassifierProperties" (rawinput1577726 "DocumentClassifierProperties")}] (clojure.core/cond-> {} (letvar1577728 "DocumentClassifierProperties") (clojure.core/assoc :document-classifier-properties (deser-document-classifier-properties (clojure.core/get-in letvar1577728 ["DocumentClassifierProperties"])))))))

(clojure.core/defn- response-too-many-requests-exception ([input] (response-too-many-requests-exception nil input)) ([resultWrapper1577730 input] (clojure.core/let [rawinput1577729 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar1577731 {"Message" (rawinput1577729 "Message")}] (clojure.core/cond-> {} (letvar1577731 "Message") (clojure.core/assoc :message (deser-string (clojure.core/get-in letvar1577731 ["Message"])))))))

(clojure.core/defn- response-start-document-classification-job-response ([input] (response-start-document-classification-job-response nil input)) ([resultWrapper1577733 input] (clojure.core/let [rawinput1577732 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar1577734 {"JobId" (rawinput1577732 "JobId"), "JobStatus" (rawinput1577732 "JobStatus")}] (clojure.core/cond-> {} (letvar1577734 "JobId") (clojure.core/assoc :job-id (deser-job-id (clojure.core/get-in letvar1577734 ["JobId"]))) (letvar1577734 "JobStatus") (clojure.core/assoc :job-status (deser-job-status (clojure.core/get-in letvar1577734 ["JobStatus"])))))))

(clojure.core/defn- response-list-topics-detection-jobs-response ([input] (response-list-topics-detection-jobs-response nil input)) ([resultWrapper1577736 input] (clojure.core/let [rawinput1577735 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar1577737 {"TopicsDetectionJobPropertiesList" (rawinput1577735 "TopicsDetectionJobPropertiesList"), "NextToken" (rawinput1577735 "NextToken")}] (clojure.core/cond-> {} (letvar1577737 "TopicsDetectionJobPropertiesList") (clojure.core/assoc :topics-detection-job-properties-list (deser-topics-detection-job-properties-list (clojure.core/get-in letvar1577737 ["TopicsDetectionJobPropertiesList"]))) (letvar1577737 "NextToken") (clojure.core/assoc :next-token (deser-string (clojure.core/get-in letvar1577737 ["NextToken"])))))))

(clojure.core/defn- response-resource-not-found-exception ([input] (response-resource-not-found-exception nil input)) ([resultWrapper1577739 input] (clojure.core/let [rawinput1577738 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar1577740 {"Message" (rawinput1577738 "Message")}] (clojure.core/cond-> {} (letvar1577740 "Message") (clojure.core/assoc :message (deser-string (clojure.core/get-in letvar1577740 ["Message"])))))))

(clojure.core/defn- response-internal-server-exception ([input] (response-internal-server-exception nil input)) ([resultWrapper1577742 input] (clojure.core/let [rawinput1577741 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar1577743 {"Message" (rawinput1577741 "Message")}] (clojure.core/cond-> {} (letvar1577743 "Message") (clojure.core/assoc :message (deser-string (clojure.core/get-in letvar1577743 ["Message"])))))))

(clojure.core/defn- response-stop-key-phrases-detection-job-response ([input] (response-stop-key-phrases-detection-job-response nil input)) ([resultWrapper1577745 input] (clojure.core/let [rawinput1577744 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar1577746 {"JobId" (rawinput1577744 "JobId"), "JobStatus" (rawinput1577744 "JobStatus")}] (clojure.core/cond-> {} (letvar1577746 "JobId") (clojure.core/assoc :job-id (deser-job-id (clojure.core/get-in letvar1577746 ["JobId"]))) (letvar1577746 "JobStatus") (clojure.core/assoc :job-status (deser-job-status (clojure.core/get-in letvar1577746 ["JobStatus"])))))))

(clojure.core/defn- response-stop-entities-detection-job-response ([input] (response-stop-entities-detection-job-response nil input)) ([resultWrapper1577748 input] (clojure.core/let [rawinput1577747 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar1577749 {"JobId" (rawinput1577747 "JobId"), "JobStatus" (rawinput1577747 "JobStatus")}] (clojure.core/cond-> {} (letvar1577749 "JobId") (clojure.core/assoc :job-id (deser-job-id (clojure.core/get-in letvar1577749 ["JobId"]))) (letvar1577749 "JobStatus") (clojure.core/assoc :job-status (deser-job-status (clojure.core/get-in letvar1577749 ["JobStatus"])))))))

(clojure.core/defn- response-detect-syntax-response ([input] (response-detect-syntax-response nil input)) ([resultWrapper1577751 input] (clojure.core/let [rawinput1577750 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar1577752 {"SyntaxTokens" (rawinput1577750 "SyntaxTokens")}] (clojure.core/cond-> {} (letvar1577752 "SyntaxTokens") (clojure.core/assoc :syntax-tokens (deser-list-of-syntax-tokens (clojure.core/get-in letvar1577752 ["SyntaxTokens"])))))))

(clojure.core/defn- response-start-sentiment-detection-job-response ([input] (response-start-sentiment-detection-job-response nil input)) ([resultWrapper1577754 input] (clojure.core/let [rawinput1577753 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar1577755 {"JobId" (rawinput1577753 "JobId"), "JobStatus" (rawinput1577753 "JobStatus")}] (clojure.core/cond-> {} (letvar1577755 "JobId") (clojure.core/assoc :job-id (deser-job-id (clojure.core/get-in letvar1577755 ["JobId"]))) (letvar1577755 "JobStatus") (clojure.core/assoc :job-status (deser-job-status (clojure.core/get-in letvar1577755 ["JobStatus"])))))))

(clojure.core/defn- response-describe-topics-detection-job-response ([input] (response-describe-topics-detection-job-response nil input)) ([resultWrapper1577757 input] (clojure.core/let [rawinput1577756 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar1577758 {"TopicsDetectionJobProperties" (rawinput1577756 "TopicsDetectionJobProperties")}] (clojure.core/cond-> {} (letvar1577758 "TopicsDetectionJobProperties") (clojure.core/assoc :topics-detection-job-properties (deser-topics-detection-job-properties (clojure.core/get-in letvar1577758 ["TopicsDetectionJobProperties"])))))))

(clojure.core/defn- response-delete-entity-recognizer-response ([input] (response-delete-entity-recognizer-response nil input)) ([resultWrapper1577760 input] (clojure.core/let [rawinput1577759 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar1577761 {}] (clojure.core/cond-> {}))))

(clojure.core/defn- response-create-entity-recognizer-response ([input] (response-create-entity-recognizer-response nil input)) ([resultWrapper1577763 input] (clojure.core/let [rawinput1577762 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar1577764 {"EntityRecognizerArn" (rawinput1577762 "EntityRecognizerArn")}] (clojure.core/cond-> {} (letvar1577764 "EntityRecognizerArn") (clojure.core/assoc :entity-recognizer-arn (deser-entity-recognizer-arn (clojure.core/get-in letvar1577764 ["EntityRecognizerArn"])))))))

(clojure.core/defn- response-batch-detect-sentiment-response ([input] (response-batch-detect-sentiment-response nil input)) ([resultWrapper1577766 input] (clojure.core/let [rawinput1577765 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar1577767 {"ResultList" (rawinput1577765 "ResultList"), "ErrorList" (rawinput1577765 "ErrorList")}] (clojure.core/cond-> {:result-list (deser-list-of-detect-sentiment-result (clojure.core/get-in letvar1577767 ["ResultList"])), :error-list (deser-batch-item-error-list (clojure.core/get-in letvar1577767 ["ErrorList"]))}))))

(clojure.core/defn- response-detect-entities-response ([input] (response-detect-entities-response nil input)) ([resultWrapper1577769 input] (clojure.core/let [rawinput1577768 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar1577770 {"Entities" (rawinput1577768 "Entities")}] (clojure.core/cond-> {} (letvar1577770 "Entities") (clojure.core/assoc :entities (deser-list-of-entities (clojure.core/get-in letvar1577770 ["Entities"])))))))

(clojure.core/defn- response-list-entity-recognizers-response ([input] (response-list-entity-recognizers-response nil input)) ([resultWrapper1577772 input] (clojure.core/let [rawinput1577771 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar1577773 {"EntityRecognizerPropertiesList" (rawinput1577771 "EntityRecognizerPropertiesList"), "NextToken" (rawinput1577771 "NextToken")}] (clojure.core/cond-> {} (letvar1577773 "EntityRecognizerPropertiesList") (clojure.core/assoc :entity-recognizer-properties-list (deser-entity-recognizer-properties-list (clojure.core/get-in letvar1577773 ["EntityRecognizerPropertiesList"]))) (letvar1577773 "NextToken") (clojure.core/assoc :next-token (deser-string (clojure.core/get-in letvar1577773 ["NextToken"])))))))

(clojure.core/defn- response-resource-limit-exceeded-exception ([input] (response-resource-limit-exceeded-exception nil input)) ([resultWrapper1577775 input] (clojure.core/let [rawinput1577774 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar1577776 {"Message" (rawinput1577774 "Message")}] (clojure.core/cond-> {} (letvar1577776 "Message") (clojure.core/assoc :message (deser-string (clojure.core/get-in letvar1577776 ["Message"])))))))

(clojure.core/defn- response-batch-size-limit-exceeded-exception ([input] (response-batch-size-limit-exceeded-exception nil input)) ([resultWrapper1577778 input] (clojure.core/let [rawinput1577777 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar1577779 {"Message" (rawinput1577777 "Message")}] (clojure.core/cond-> {} (letvar1577779 "Message") (clojure.core/assoc :message (deser-string (clojure.core/get-in letvar1577779 ["Message"])))))))

(clojure.core/defn- response-list-document-classifiers-response ([input] (response-list-document-classifiers-response nil input)) ([resultWrapper1577781 input] (clojure.core/let [rawinput1577780 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar1577782 {"DocumentClassifierPropertiesList" (rawinput1577780 "DocumentClassifierPropertiesList"), "NextToken" (rawinput1577780 "NextToken")}] (clojure.core/cond-> {} (letvar1577782 "DocumentClassifierPropertiesList") (clojure.core/assoc :document-classifier-properties-list (deser-document-classifier-properties-list (clojure.core/get-in letvar1577782 ["DocumentClassifierPropertiesList"]))) (letvar1577782 "NextToken") (clojure.core/assoc :next-token (deser-string (clojure.core/get-in letvar1577782 ["NextToken"])))))))

(clojure.core/defn- response-list-dominant-language-detection-jobs-response ([input] (response-list-dominant-language-detection-jobs-response nil input)) ([resultWrapper1577784 input] (clojure.core/let [rawinput1577783 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar1577785 {"DominantLanguageDetectionJobPropertiesList" (rawinput1577783 "DominantLanguageDetectionJobPropertiesList"), "NextToken" (rawinput1577783 "NextToken")}] (clojure.core/cond-> {} (letvar1577785 "DominantLanguageDetectionJobPropertiesList") (clojure.core/assoc :dominant-language-detection-job-properties-list (deser-dominant-language-detection-job-properties-list (clojure.core/get-in letvar1577785 ["DominantLanguageDetectionJobPropertiesList"]))) (letvar1577785 "NextToken") (clojure.core/assoc :next-token (deser-string (clojure.core/get-in letvar1577785 ["NextToken"])))))))

(clojure.core/defn- response-job-not-found-exception ([input] (response-job-not-found-exception nil input)) ([resultWrapper1577787 input] (clojure.core/let [rawinput1577786 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar1577788 {"Message" (rawinput1577786 "Message")}] (clojure.core/cond-> {} (letvar1577788 "Message") (clojure.core/assoc :message (deser-string (clojure.core/get-in letvar1577788 ["Message"])))))))

(clojure.core/defn- response-describe-dominant-language-detection-job-response ([input] (response-describe-dominant-language-detection-job-response nil input)) ([resultWrapper1577790 input] (clojure.core/let [rawinput1577789 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar1577791 {"DominantLanguageDetectionJobProperties" (rawinput1577789 "DominantLanguageDetectionJobProperties")}] (clojure.core/cond-> {} (letvar1577791 "DominantLanguageDetectionJobProperties") (clojure.core/assoc :dominant-language-detection-job-properties (deser-dominant-language-detection-job-properties (clojure.core/get-in letvar1577791 ["DominantLanguageDetectionJobProperties"])))))))

(clojure.core/defn- response-list-sentiment-detection-jobs-response ([input] (response-list-sentiment-detection-jobs-response nil input)) ([resultWrapper1577793 input] (clojure.core/let [rawinput1577792 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar1577794 {"SentimentDetectionJobPropertiesList" (rawinput1577792 "SentimentDetectionJobPropertiesList"), "NextToken" (rawinput1577792 "NextToken")}] (clojure.core/cond-> {} (letvar1577794 "SentimentDetectionJobPropertiesList") (clojure.core/assoc :sentiment-detection-job-properties-list (deser-sentiment-detection-job-properties-list (clojure.core/get-in letvar1577794 ["SentimentDetectionJobPropertiesList"]))) (letvar1577794 "NextToken") (clojure.core/assoc :next-token (deser-string (clojure.core/get-in letvar1577794 ["NextToken"])))))))

(clojure.core/defn- response-stop-sentiment-detection-job-response ([input] (response-stop-sentiment-detection-job-response nil input)) ([resultWrapper1577796 input] (clojure.core/let [rawinput1577795 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar1577797 {"JobId" (rawinput1577795 "JobId"), "JobStatus" (rawinput1577795 "JobStatus")}] (clojure.core/cond-> {} (letvar1577797 "JobId") (clojure.core/assoc :job-id (deser-job-id (clojure.core/get-in letvar1577797 ["JobId"]))) (letvar1577797 "JobStatus") (clojure.core/assoc :job-status (deser-job-status (clojure.core/get-in letvar1577797 ["JobStatus"])))))))

(clojure.core/defn- response-resource-unavailable-exception ([input] (response-resource-unavailable-exception nil input)) ([resultWrapper1577799 input] (clojure.core/let [rawinput1577798 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar1577800 {"Message" (rawinput1577798 "Message")}] (clojure.core/cond-> {} (letvar1577800 "Message") (clojure.core/assoc :message (deser-string (clojure.core/get-in letvar1577800 ["Message"])))))))

(clojure.core/defn- response-describe-entity-recognizer-response ([input] (response-describe-entity-recognizer-response nil input)) ([resultWrapper1577802 input] (clojure.core/let [rawinput1577801 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar1577803 {"EntityRecognizerProperties" (rawinput1577801 "EntityRecognizerProperties")}] (clojure.core/cond-> {} (letvar1577803 "EntityRecognizerProperties") (clojure.core/assoc :entity-recognizer-properties (deser-entity-recognizer-properties (clojure.core/get-in letvar1577803 ["EntityRecognizerProperties"])))))))

(clojure.core/defn- response-describe-entities-detection-job-response ([input] (response-describe-entities-detection-job-response nil input)) ([resultWrapper1577805 input] (clojure.core/let [rawinput1577804 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar1577806 {"EntitiesDetectionJobProperties" (rawinput1577804 "EntitiesDetectionJobProperties")}] (clojure.core/cond-> {} (letvar1577806 "EntitiesDetectionJobProperties") (clojure.core/assoc :entities-detection-job-properties (deser-entities-detection-job-properties (clojure.core/get-in letvar1577806 ["EntitiesDetectionJobProperties"])))))))

(clojure.core/defn- response-describe-key-phrases-detection-job-response ([input] (response-describe-key-phrases-detection-job-response nil input)) ([resultWrapper1577808 input] (clojure.core/let [rawinput1577807 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar1577809 {"KeyPhrasesDetectionJobProperties" (rawinput1577807 "KeyPhrasesDetectionJobProperties")}] (clojure.core/cond-> {} (letvar1577809 "KeyPhrasesDetectionJobProperties") (clojure.core/assoc :key-phrases-detection-job-properties (deser-key-phrases-detection-job-properties (clojure.core/get-in letvar1577809 ["KeyPhrasesDetectionJobProperties"])))))))

(clojure.core/defn- response-batch-detect-entities-response ([input] (response-batch-detect-entities-response nil input)) ([resultWrapper1577811 input] (clojure.core/let [rawinput1577810 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar1577812 {"ResultList" (rawinput1577810 "ResultList"), "ErrorList" (rawinput1577810 "ErrorList")}] (clojure.core/cond-> {:result-list (deser-list-of-detect-entities-result (clojure.core/get-in letvar1577812 ["ResultList"])), :error-list (deser-batch-item-error-list (clojure.core/get-in letvar1577812 ["ErrorList"]))}))))

(clojure.spec.alpha/def :portkey.aws.comprehend/start-topics-detection-job-response (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.comprehend/job-id :portkey.aws.comprehend/job-status]))

(clojure.spec.alpha/def :portkey.aws.comprehend/list-of-entities (clojure.spec.alpha/coll-of :portkey.aws.comprehend/entity))

(clojure.spec.alpha/def :portkey.aws.comprehend/input-data-config (clojure.spec.alpha/keys :req-un [:portkey.aws.comprehend/s-3-uri] :opt-un [:portkey.aws.comprehend/input-format]))

(clojure.spec.alpha/def :portkey.aws.comprehend.list-key-phrases-detection-jobs-response/next-token (clojure.spec.alpha/and :portkey.aws.comprehend/string))
(clojure.spec.alpha/def :portkey.aws.comprehend/list-key-phrases-detection-jobs-response (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.comprehend/key-phrases-detection-job-properties-list :portkey.aws.comprehend.list-key-phrases-detection-jobs-response/next-token]))

(clojure.spec.alpha/def :portkey.aws.comprehend/describe-document-classification-job-response (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.comprehend/document-classification-job-properties]))

(clojure.spec.alpha/def :portkey.aws.comprehend.batch-detect-key-phrases-response/result-list (clojure.spec.alpha/and :portkey.aws.comprehend/list-of-detect-key-phrases-result))
(clojure.spec.alpha/def :portkey.aws.comprehend.batch-detect-key-phrases-response/error-list (clojure.spec.alpha/and :portkey.aws.comprehend/batch-item-error-list))
(clojure.spec.alpha/def :portkey.aws.comprehend/batch-detect-key-phrases-response (clojure.spec.alpha/keys :req-un [:portkey.aws.comprehend.batch-detect-key-phrases-response/result-list :portkey.aws.comprehend.batch-detect-key-phrases-response/error-list] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.comprehend.entity-recognizer-properties/input-data-config (clojure.spec.alpha/and :portkey.aws.comprehend/entity-recognizer-input-data-config))
(clojure.spec.alpha/def :portkey.aws.comprehend.entity-recognizer-properties/training-end-time (clojure.spec.alpha/and :portkey.aws.comprehend/timestamp))
(clojure.spec.alpha/def :portkey.aws.comprehend.entity-recognizer-properties/end-time (clojure.spec.alpha/and :portkey.aws.comprehend/timestamp))
(clojure.spec.alpha/def :portkey.aws.comprehend.entity-recognizer-properties/submit-time (clojure.spec.alpha/and :portkey.aws.comprehend/timestamp))
(clojure.spec.alpha/def :portkey.aws.comprehend.entity-recognizer-properties/status (clojure.spec.alpha/and :portkey.aws.comprehend/model-status))
(clojure.spec.alpha/def :portkey.aws.comprehend.entity-recognizer-properties/recognizer-metadata (clojure.spec.alpha/and :portkey.aws.comprehend/entity-recognizer-metadata))
(clojure.spec.alpha/def :portkey.aws.comprehend.entity-recognizer-properties/message (clojure.spec.alpha/and :portkey.aws.comprehend/any-length-string))
(clojure.spec.alpha/def :portkey.aws.comprehend.entity-recognizer-properties/data-access-role-arn (clojure.spec.alpha/and :portkey.aws.comprehend/iam-role-arn))
(clojure.spec.alpha/def :portkey.aws.comprehend.entity-recognizer-properties/training-start-time (clojure.spec.alpha/and :portkey.aws.comprehend/timestamp))
(clojure.spec.alpha/def :portkey.aws.comprehend/entity-recognizer-properties (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.comprehend.entity-recognizer-properties/input-data-config :portkey.aws.comprehend.entity-recognizer-properties/training-end-time :portkey.aws.comprehend.entity-recognizer-properties/end-time :portkey.aws.comprehend.entity-recognizer-properties/submit-time :portkey.aws.comprehend.entity-recognizer-properties/status :portkey.aws.comprehend/entity-recognizer-arn :portkey.aws.comprehend.entity-recognizer-properties/recognizer-metadata :portkey.aws.comprehend/language-code :portkey.aws.comprehend.entity-recognizer-properties/message :portkey.aws.comprehend.entity-recognizer-properties/data-access-role-arn :portkey.aws.comprehend.entity-recognizer-properties/training-start-time]))

(clojure.spec.alpha/def :portkey.aws.comprehend/string-list (clojure.spec.alpha/coll-of :portkey.aws.comprehend/string))

(clojure.spec.alpha/def :portkey.aws.comprehend/double clojure.core/double?)

(clojure.spec.alpha/def :portkey.aws.comprehend/stop-dominant-language-detection-job-response (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.comprehend/job-id :portkey.aws.comprehend/job-status]))

(clojure.spec.alpha/def :portkey.aws.comprehend/entity-types-list (clojure.spec.alpha/coll-of :portkey.aws.comprehend/entity-types-list-item))

(clojure.spec.alpha/def :portkey.aws.comprehend.entity-recognizer-input-data-config/entity-types (clojure.spec.alpha/and :portkey.aws.comprehend/entity-types-list))
(clojure.spec.alpha/def :portkey.aws.comprehend.entity-recognizer-input-data-config/documents (clojure.spec.alpha/and :portkey.aws.comprehend/entity-recognizer-documents))
(clojure.spec.alpha/def :portkey.aws.comprehend.entity-recognizer-input-data-config/annotations (clojure.spec.alpha/and :portkey.aws.comprehend/entity-recognizer-annotations))
(clojure.spec.alpha/def :portkey.aws.comprehend.entity-recognizer-input-data-config/entity-list (clojure.spec.alpha/and :portkey.aws.comprehend/entity-recognizer-entity-list))
(clojure.spec.alpha/def :portkey.aws.comprehend/entity-recognizer-input-data-config (clojure.spec.alpha/keys :req-un [:portkey.aws.comprehend.entity-recognizer-input-data-config/entity-types :portkey.aws.comprehend.entity-recognizer-input-data-config/documents] :opt-un [:portkey.aws.comprehend.entity-recognizer-input-data-config/annotations :portkey.aws.comprehend.entity-recognizer-input-data-config/entity-list]))

(clojure.spec.alpha/def :portkey.aws.comprehend/output-data-config (clojure.spec.alpha/keys :req-un [:portkey.aws.comprehend/s-3-uri] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.comprehend.start-sentiment-detection-job-request/data-access-role-arn (clojure.spec.alpha/and :portkey.aws.comprehend/iam-role-arn))
(clojure.spec.alpha/def :portkey.aws.comprehend.start-sentiment-detection-job-request/client-request-token (clojure.spec.alpha/and :portkey.aws.comprehend/client-request-token-string))
(clojure.spec.alpha/def :portkey.aws.comprehend/start-sentiment-detection-job-request (clojure.spec.alpha/keys :req-un [:portkey.aws.comprehend/input-data-config :portkey.aws.comprehend/output-data-config :portkey.aws.comprehend.start-sentiment-detection-job-request/data-access-role-arn :portkey.aws.comprehend/language-code] :opt-un [:portkey.aws.comprehend/job-name :portkey.aws.comprehend.start-sentiment-detection-job-request/client-request-token]))

(clojure.spec.alpha/def :portkey.aws.comprehend.batch-detect-dominant-language-response/result-list (clojure.spec.alpha/and :portkey.aws.comprehend/list-of-detect-dominant-language-result))
(clojure.spec.alpha/def :portkey.aws.comprehend.batch-detect-dominant-language-response/error-list (clojure.spec.alpha/and :portkey.aws.comprehend/batch-item-error-list))
(clojure.spec.alpha/def :portkey.aws.comprehend/batch-detect-dominant-language-response (clojure.spec.alpha/keys :req-un [:portkey.aws.comprehend.batch-detect-dominant-language-response/result-list :portkey.aws.comprehend.batch-detect-dominant-language-response/error-list] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.comprehend/part-of-speech-tag-type #{"AUX" :aux :num "PRON" "ADV" "ADP" "ADJ" :propn :conj "PART" "SYM" "NOUN" :o "CONJ" :verb :pron :det "INTJ" :part "SCONJ" "PUNCT" :adj :intj :punct :sym :cconj "NUM" "VERB" :sconj "O" "DET" "CCONJ" :adv :adp :noun "PROPN"})

(clojure.spec.alpha/def :portkey.aws.comprehend/list-of-dominant-languages (clojure.spec.alpha/coll-of :portkey.aws.comprehend/dominant-language))

(clojure.spec.alpha/def :portkey.aws.comprehend/stop-training-document-classifier-request (clojure.spec.alpha/keys :req-un [:portkey.aws.comprehend/document-classifier-arn] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.comprehend.unsupported-language-exception/message (clojure.spec.alpha/and :portkey.aws.comprehend/string))
(clojure.spec.alpha/def :portkey.aws.comprehend/unsupported-language-exception (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.comprehend.unsupported-language-exception/message]))

(clojure.spec.alpha/def :portkey.aws.comprehend/start-dominant-language-detection-job-response (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.comprehend/job-id :portkey.aws.comprehend/job-status]))

(clojure.spec.alpha/def :portkey.aws.comprehend/entity-recognizer-metadata-entity-types-list (clojure.spec.alpha/coll-of :portkey.aws.comprehend/entity-recognizer-metadata-entity-types-list-item))

(clojure.spec.alpha/def :portkey.aws.comprehend/stop-training-entity-recognizer-response (clojure.spec.alpha/keys :req-un [] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.comprehend/describe-sentiment-detection-job-request (clojure.spec.alpha/keys :req-un [:portkey.aws.comprehend/job-id] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.comprehend.list-entities-detection-jobs-response/next-token (clojure.spec.alpha/and :portkey.aws.comprehend/string))
(clojure.spec.alpha/def :portkey.aws.comprehend/list-entities-detection-jobs-response (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.comprehend/entities-detection-job-properties-list :portkey.aws.comprehend.list-entities-detection-jobs-response/next-token]))

(clojure.spec.alpha/def :portkey.aws.comprehend/job-status #{"COMPLETED" "IN_PROGRESS" :in-progress :stop-requested :completed "STOP_REQUESTED" :submitted "SUBMITTED" :stopped "STOPPED" "FAILED" :failed})

(clojure.spec.alpha/def :portkey.aws.comprehend/entity-recognizer-documents (clojure.spec.alpha/keys :req-un [:portkey.aws.comprehend/s-3-uri] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.comprehend.invalid-request-exception/message (clojure.spec.alpha/and :portkey.aws.comprehend/string))
(clojure.spec.alpha/def :portkey.aws.comprehend/invalid-request-exception (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.comprehend.invalid-request-exception/message]))

(clojure.spec.alpha/def :portkey.aws.comprehend/start-entities-detection-job-response (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.comprehend/job-id :portkey.aws.comprehend/job-status]))

(clojure.spec.alpha/def :portkey.aws.comprehend/start-key-phrases-detection-job-response (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.comprehend/job-id :portkey.aws.comprehend/job-status]))

(clojure.spec.alpha/def :portkey.aws.comprehend.document-classification-job-properties/end-time (clojure.spec.alpha/and :portkey.aws.comprehend/timestamp))
(clojure.spec.alpha/def :portkey.aws.comprehend.document-classification-job-properties/submit-time (clojure.spec.alpha/and :portkey.aws.comprehend/timestamp))
(clojure.spec.alpha/def :portkey.aws.comprehend.document-classification-job-properties/message (clojure.spec.alpha/and :portkey.aws.comprehend/any-length-string))
(clojure.spec.alpha/def :portkey.aws.comprehend.document-classification-job-properties/data-access-role-arn (clojure.spec.alpha/and :portkey.aws.comprehend/iam-role-arn))
(clojure.spec.alpha/def :portkey.aws.comprehend/document-classification-job-properties (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.comprehend/input-data-config :portkey.aws.comprehend/output-data-config :portkey.aws.comprehend.document-classification-job-properties/end-time :portkey.aws.comprehend/job-status :portkey.aws.comprehend/job-name :portkey.aws.comprehend.document-classification-job-properties/submit-time :portkey.aws.comprehend.document-classification-job-properties/message :portkey.aws.comprehend.document-classification-job-properties/data-access-role-arn :portkey.aws.comprehend/document-classifier-arn :portkey.aws.comprehend/job-id]))

(clojure.spec.alpha/def :portkey.aws.comprehend.start-dominant-language-detection-job-request/data-access-role-arn (clojure.spec.alpha/and :portkey.aws.comprehend/iam-role-arn))
(clojure.spec.alpha/def :portkey.aws.comprehend.start-dominant-language-detection-job-request/client-request-token (clojure.spec.alpha/and :portkey.aws.comprehend/client-request-token-string))
(clojure.spec.alpha/def :portkey.aws.comprehend/start-dominant-language-detection-job-request (clojure.spec.alpha/keys :req-un [:portkey.aws.comprehend/input-data-config :portkey.aws.comprehend/output-data-config :portkey.aws.comprehend.start-dominant-language-detection-job-request/data-access-role-arn] :opt-un [:portkey.aws.comprehend/job-name :portkey.aws.comprehend.start-dominant-language-detection-job-request/client-request-token]))

(clojure.spec.alpha/def :portkey.aws.comprehend.entity-recognizer-metadata/number-of-trained-documents (clojure.spec.alpha/and :portkey.aws.comprehend/integer))
(clojure.spec.alpha/def :portkey.aws.comprehend.entity-recognizer-metadata/number-of-test-documents (clojure.spec.alpha/and :portkey.aws.comprehend/integer))
(clojure.spec.alpha/def :portkey.aws.comprehend.entity-recognizer-metadata/evaluation-metrics (clojure.spec.alpha/and :portkey.aws.comprehend/entity-recognizer-evaluation-metrics))
(clojure.spec.alpha/def :portkey.aws.comprehend.entity-recognizer-metadata/entity-types (clojure.spec.alpha/and :portkey.aws.comprehend/entity-recognizer-metadata-entity-types-list))
(clojure.spec.alpha/def :portkey.aws.comprehend/entity-recognizer-metadata (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.comprehend.entity-recognizer-metadata/number-of-trained-documents :portkey.aws.comprehend.entity-recognizer-metadata/number-of-test-documents :portkey.aws.comprehend.entity-recognizer-metadata/evaluation-metrics :portkey.aws.comprehend.entity-recognizer-metadata/entity-types]))

(clojure.spec.alpha/def :portkey.aws.comprehend.batch-detect-key-phrases-request/text-list (clojure.spec.alpha/and :portkey.aws.comprehend/string-list))
(clojure.spec.alpha/def :portkey.aws.comprehend/batch-detect-key-phrases-request (clojure.spec.alpha/keys :req-un [:portkey.aws.comprehend.batch-detect-key-phrases-request/text-list :portkey.aws.comprehend/language-code] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.comprehend/list-of-detect-dominant-language-result (clojure.spec.alpha/coll-of :portkey.aws.comprehend/batch-detect-dominant-language-item-result))

(clojure.spec.alpha/def :portkey.aws.comprehend.detect-sentiment-response/sentiment (clojure.spec.alpha/and :portkey.aws.comprehend/sentiment-type))
(clojure.spec.alpha/def :portkey.aws.comprehend/detect-sentiment-response (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.comprehend.detect-sentiment-response/sentiment :portkey.aws.comprehend/sentiment-score]))

(clojure.spec.alpha/def :portkey.aws.comprehend/sentiment-type #{:neutral :positive :negative "MIXED" "NEUTRAL" :mixed "NEGATIVE" "POSITIVE"})

(clojure.spec.alpha/def :portkey.aws.comprehend.detect-key-phrases-request/text (clojure.spec.alpha/and :portkey.aws.comprehend/string))
(clojure.spec.alpha/def :portkey.aws.comprehend/detect-key-phrases-request (clojure.spec.alpha/keys :req-un [:portkey.aws.comprehend.detect-key-phrases-request/text :portkey.aws.comprehend/language-code] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.comprehend/describe-dominant-language-detection-job-request (clojure.spec.alpha/keys :req-un [:portkey.aws.comprehend/job-id] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.comprehend/stop-training-entity-recognizer-request (clojure.spec.alpha/keys :req-un [:portkey.aws.comprehend/entity-recognizer-arn] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.comprehend.sentiment-score/positive (clojure.spec.alpha/and :portkey.aws.comprehend/float))
(clojure.spec.alpha/def :portkey.aws.comprehend.sentiment-score/negative (clojure.spec.alpha/and :portkey.aws.comprehend/float))
(clojure.spec.alpha/def :portkey.aws.comprehend.sentiment-score/neutral (clojure.spec.alpha/and :portkey.aws.comprehend/float))
(clojure.spec.alpha/def :portkey.aws.comprehend.sentiment-score/mixed (clojure.spec.alpha/and :portkey.aws.comprehend/float))
(clojure.spec.alpha/def :portkey.aws.comprehend/sentiment-score (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.comprehend.sentiment-score/positive :portkey.aws.comprehend.sentiment-score/negative :portkey.aws.comprehend.sentiment-score/neutral :portkey.aws.comprehend.sentiment-score/mixed]))

(clojure.spec.alpha/def :portkey.aws.comprehend.batch-detect-dominant-language-item-result/index (clojure.spec.alpha/and :portkey.aws.comprehend/integer))
(clojure.spec.alpha/def :portkey.aws.comprehend.batch-detect-dominant-language-item-result/languages (clojure.spec.alpha/and :portkey.aws.comprehend/list-of-dominant-languages))
(clojure.spec.alpha/def :portkey.aws.comprehend/batch-detect-dominant-language-item-result (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.comprehend.batch-detect-dominant-language-item-result/index :portkey.aws.comprehend.batch-detect-dominant-language-item-result/languages]))

(clojure.spec.alpha/def :portkey.aws.comprehend/stop-training-document-classifier-response (clojure.spec.alpha/keys :req-un [] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.comprehend/job-name (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__1410938__auto__] (clojure.core/<= 1 (clojure.core/count s__1410938__auto__))) (clojure.core/fn [s__1410939__auto__] (clojure.core/< (clojure.core/count s__1410939__auto__) 256)) (clojure.core/fn [s__1410940__auto__] (clojure.core/re-matches #"^([\p{L}\p{Z}\p{N}_.:/=+\-%@]*)$" s__1410940__auto__))))

(clojure.spec.alpha/def :portkey.aws.comprehend.detect-dominant-language-response/languages (clojure.spec.alpha/and :portkey.aws.comprehend/list-of-dominant-languages))
(clojure.spec.alpha/def :portkey.aws.comprehend/detect-dominant-language-response (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.comprehend.detect-dominant-language-response/languages]))

(clojure.spec.alpha/def :portkey.aws.comprehend/list-of-detect-entities-result (clojure.spec.alpha/coll-of :portkey.aws.comprehend/batch-detect-entities-item-result))

(clojure.spec.alpha/def :portkey.aws.comprehend.key-phrase/score (clojure.spec.alpha/and :portkey.aws.comprehend/float))
(clojure.spec.alpha/def :portkey.aws.comprehend.key-phrase/text (clojure.spec.alpha/and :portkey.aws.comprehend/string))
(clojure.spec.alpha/def :portkey.aws.comprehend.key-phrase/begin-offset (clojure.spec.alpha/and :portkey.aws.comprehend/integer))
(clojure.spec.alpha/def :portkey.aws.comprehend.key-phrase/end-offset (clojure.spec.alpha/and :portkey.aws.comprehend/integer))
(clojure.spec.alpha/def :portkey.aws.comprehend/key-phrase (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.comprehend.key-phrase/score :portkey.aws.comprehend.key-phrase/text :portkey.aws.comprehend.key-phrase/begin-offset :portkey.aws.comprehend.key-phrase/end-offset]))

(clojure.spec.alpha/def :portkey.aws.comprehend.text-size-limit-exceeded-exception/message (clojure.spec.alpha/and :portkey.aws.comprehend/string))
(clojure.spec.alpha/def :portkey.aws.comprehend/text-size-limit-exceeded-exception (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.comprehend.text-size-limit-exceeded-exception/message]))

(clojure.spec.alpha/def :portkey.aws.comprehend.list-document-classifiers-request/filter (clojure.spec.alpha/and :portkey.aws.comprehend/document-classifier-filter))
(clojure.spec.alpha/def :portkey.aws.comprehend.list-document-classifiers-request/next-token (clojure.spec.alpha/and :portkey.aws.comprehend/string))
(clojure.spec.alpha/def :portkey.aws.comprehend.list-document-classifiers-request/max-results (clojure.spec.alpha/and :portkey.aws.comprehend/max-results-integer))
(clojure.spec.alpha/def :portkey.aws.comprehend/list-document-classifiers-request (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.comprehend.list-document-classifiers-request/filter :portkey.aws.comprehend.list-document-classifiers-request/next-token :portkey.aws.comprehend.list-document-classifiers-request/max-results]))

(clojure.spec.alpha/def :portkey.aws.comprehend/s-3-uri (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__1410939__auto__] (clojure.core/< (clojure.core/count s__1410939__auto__) 1024)) (clojure.core/fn [s__1410940__auto__] (clojure.core/re-matches #"s3://[a-z0-9][\.\-a-z0-9]{1,61}[a-z0-9](/.*)?" s__1410940__auto__))))

(clojure.spec.alpha/def :portkey.aws.comprehend/describe-document-classification-job-request (clojure.spec.alpha/keys :req-un [:portkey.aws.comprehend/job-id] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.comprehend.detect-key-phrases-response/key-phrases (clojure.spec.alpha/and :portkey.aws.comprehend/list-of-key-phrases))
(clojure.spec.alpha/def :portkey.aws.comprehend/detect-key-phrases-response (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.comprehend.detect-key-phrases-response/key-phrases]))

(clojure.spec.alpha/def :portkey.aws.comprehend.batch-detect-dominant-language-request/text-list (clojure.spec.alpha/and :portkey.aws.comprehend/string-list))
(clojure.spec.alpha/def :portkey.aws.comprehend/batch-detect-dominant-language-request (clojure.spec.alpha/keys :req-un [:portkey.aws.comprehend.batch-detect-dominant-language-request/text-list] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.comprehend.resource-in-use-exception/message (clojure.spec.alpha/and :portkey.aws.comprehend/string))
(clojure.spec.alpha/def :portkey.aws.comprehend/resource-in-use-exception (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.comprehend.resource-in-use-exception/message]))

(clojure.spec.alpha/def :portkey.aws.comprehend/delete-document-classifier-response (clojure.spec.alpha/keys :req-un [] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.comprehend.classifier-evaluation-metrics/accuracy (clojure.spec.alpha/and :portkey.aws.comprehend/double))
(clojure.spec.alpha/def :portkey.aws.comprehend.classifier-evaluation-metrics/precision (clojure.spec.alpha/and :portkey.aws.comprehend/double))
(clojure.spec.alpha/def :portkey.aws.comprehend.classifier-evaluation-metrics/recall (clojure.spec.alpha/and :portkey.aws.comprehend/double))
(clojure.spec.alpha/def :portkey.aws.comprehend.classifier-evaluation-metrics/f-1-score (clojure.spec.alpha/and :portkey.aws.comprehend/double))
(clojure.spec.alpha/def :portkey.aws.comprehend/classifier-evaluation-metrics (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.comprehend.classifier-evaluation-metrics/accuracy :portkey.aws.comprehend.classifier-evaluation-metrics/precision :portkey.aws.comprehend.classifier-evaluation-metrics/recall :portkey.aws.comprehend.classifier-evaluation-metrics/f-1-score]))

(clojure.spec.alpha/def :portkey.aws.comprehend.batch-detect-syntax-response/result-list (clojure.spec.alpha/and :portkey.aws.comprehend/list-of-detect-syntax-result))
(clojure.spec.alpha/def :portkey.aws.comprehend.batch-detect-syntax-response/error-list (clojure.spec.alpha/and :portkey.aws.comprehend/batch-item-error-list))
(clojure.spec.alpha/def :portkey.aws.comprehend/batch-detect-syntax-response (clojure.spec.alpha/keys :req-un [:portkey.aws.comprehend.batch-detect-syntax-response/result-list :portkey.aws.comprehend.batch-detect-syntax-response/error-list] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.comprehend.invalid-filter-exception/message (clojure.spec.alpha/and :portkey.aws.comprehend/string))
(clojure.spec.alpha/def :portkey.aws.comprehend/invalid-filter-exception (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.comprehend.invalid-filter-exception/message]))

(clojure.spec.alpha/def :portkey.aws.comprehend/delete-entity-recognizer-request (clojure.spec.alpha/keys :req-un [:portkey.aws.comprehend/entity-recognizer-arn] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.comprehend/describe-sentiment-detection-job-response (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.comprehend/sentiment-detection-job-properties]))

(clojure.spec.alpha/def :portkey.aws.comprehend/entity-recognizer-annotations (clojure.spec.alpha/keys :req-un [:portkey.aws.comprehend/s-3-uri] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.comprehend.list-document-classification-jobs-response/next-token (clojure.spec.alpha/and :portkey.aws.comprehend/string))
(clojure.spec.alpha/def :portkey.aws.comprehend/list-document-classification-jobs-response (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.comprehend/document-classification-job-properties-list :portkey.aws.comprehend.list-document-classification-jobs-response/next-token]))

(clojure.spec.alpha/def :portkey.aws.comprehend.detect-syntax-request/text (clojure.spec.alpha/and :portkey.aws.comprehend/string))
(clojure.spec.alpha/def :portkey.aws.comprehend.detect-syntax-request/language-code (clojure.spec.alpha/and :portkey.aws.comprehend/syntax-language-code))
(clojure.spec.alpha/def :portkey.aws.comprehend/detect-syntax-request (clojure.spec.alpha/keys :req-un [:portkey.aws.comprehend.detect-syntax-request/text :portkey.aws.comprehend.detect-syntax-request/language-code] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.comprehend.entity-recognizer-filter/status (clojure.spec.alpha/and :portkey.aws.comprehend/model-status))
(clojure.spec.alpha/def :portkey.aws.comprehend.entity-recognizer-filter/submit-time-before (clojure.spec.alpha/and :portkey.aws.comprehend/timestamp))
(clojure.spec.alpha/def :portkey.aws.comprehend.entity-recognizer-filter/submit-time-after (clojure.spec.alpha/and :portkey.aws.comprehend/timestamp))
(clojure.spec.alpha/def :portkey.aws.comprehend/entity-recognizer-filter (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.comprehend.entity-recognizer-filter/status :portkey.aws.comprehend.entity-recognizer-filter/submit-time-before :portkey.aws.comprehend.entity-recognizer-filter/submit-time-after]))

(clojure.spec.alpha/def :portkey.aws.comprehend.start-entities-detection-job-request/data-access-role-arn (clojure.spec.alpha/and :portkey.aws.comprehend/iam-role-arn))
(clojure.spec.alpha/def :portkey.aws.comprehend.start-entities-detection-job-request/client-request-token (clojure.spec.alpha/and :portkey.aws.comprehend/client-request-token-string))
(clojure.spec.alpha/def :portkey.aws.comprehend/start-entities-detection-job-request (clojure.spec.alpha/keys :req-un [:portkey.aws.comprehend/input-data-config :portkey.aws.comprehend/output-data-config :portkey.aws.comprehend.start-entities-detection-job-request/data-access-role-arn :portkey.aws.comprehend/language-code] :opt-un [:portkey.aws.comprehend/job-name :portkey.aws.comprehend/entity-recognizer-arn :portkey.aws.comprehend.start-entities-detection-job-request/client-request-token]))

(clojure.spec.alpha/def :portkey.aws.comprehend/create-document-classifier-response (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.comprehend/document-classifier-arn]))

(clojure.spec.alpha/def :portkey.aws.comprehend.dominant-language/language-code (clojure.spec.alpha/and :portkey.aws.comprehend/string))
(clojure.spec.alpha/def :portkey.aws.comprehend.dominant-language/score (clojure.spec.alpha/and :portkey.aws.comprehend/float))
(clojure.spec.alpha/def :portkey.aws.comprehend/dominant-language (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.comprehend.dominant-language/language-code :portkey.aws.comprehend.dominant-language/score]))

(clojure.spec.alpha/def :portkey.aws.comprehend.list-key-phrases-detection-jobs-request/filter (clojure.spec.alpha/and :portkey.aws.comprehend/key-phrases-detection-job-filter))
(clojure.spec.alpha/def :portkey.aws.comprehend.list-key-phrases-detection-jobs-request/next-token (clojure.spec.alpha/and :portkey.aws.comprehend/string))
(clojure.spec.alpha/def :portkey.aws.comprehend.list-key-phrases-detection-jobs-request/max-results (clojure.spec.alpha/and :portkey.aws.comprehend/max-results-integer))
(clojure.spec.alpha/def :portkey.aws.comprehend/list-key-phrases-detection-jobs-request (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.comprehend.list-key-phrases-detection-jobs-request/filter :portkey.aws.comprehend.list-key-phrases-detection-jobs-request/next-token :portkey.aws.comprehend.list-key-phrases-detection-jobs-request/max-results]))

(clojure.spec.alpha/def :portkey.aws.comprehend/describe-topics-detection-job-request (clojure.spec.alpha/keys :req-un [:portkey.aws.comprehend/job-id] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.comprehend.key-phrases-detection-job-properties/end-time (clojure.spec.alpha/and :portkey.aws.comprehend/timestamp))
(clojure.spec.alpha/def :portkey.aws.comprehend.key-phrases-detection-job-properties/submit-time (clojure.spec.alpha/and :portkey.aws.comprehend/timestamp))
(clojure.spec.alpha/def :portkey.aws.comprehend.key-phrases-detection-job-properties/message (clojure.spec.alpha/and :portkey.aws.comprehend/any-length-string))
(clojure.spec.alpha/def :portkey.aws.comprehend.key-phrases-detection-job-properties/data-access-role-arn (clojure.spec.alpha/and :portkey.aws.comprehend/iam-role-arn))
(clojure.spec.alpha/def :portkey.aws.comprehend/key-phrases-detection-job-properties (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.comprehend/input-data-config :portkey.aws.comprehend/output-data-config :portkey.aws.comprehend.key-phrases-detection-job-properties/end-time :portkey.aws.comprehend/job-status :portkey.aws.comprehend/job-name :portkey.aws.comprehend.key-phrases-detection-job-properties/submit-time :portkey.aws.comprehend/language-code :portkey.aws.comprehend.key-phrases-detection-job-properties/message :portkey.aws.comprehend.key-phrases-detection-job-properties/data-access-role-arn :portkey.aws.comprehend/job-id]))

(clojure.spec.alpha/def :portkey.aws.comprehend.dominant-language-detection-job-properties/end-time (clojure.spec.alpha/and :portkey.aws.comprehend/timestamp))
(clojure.spec.alpha/def :portkey.aws.comprehend.dominant-language-detection-job-properties/submit-time (clojure.spec.alpha/and :portkey.aws.comprehend/timestamp))
(clojure.spec.alpha/def :portkey.aws.comprehend.dominant-language-detection-job-properties/message (clojure.spec.alpha/and :portkey.aws.comprehend/any-length-string))
(clojure.spec.alpha/def :portkey.aws.comprehend.dominant-language-detection-job-properties/data-access-role-arn (clojure.spec.alpha/and :portkey.aws.comprehend/iam-role-arn))
(clojure.spec.alpha/def :portkey.aws.comprehend/dominant-language-detection-job-properties (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.comprehend/input-data-config :portkey.aws.comprehend/output-data-config :portkey.aws.comprehend.dominant-language-detection-job-properties/end-time :portkey.aws.comprehend/job-status :portkey.aws.comprehend/job-name :portkey.aws.comprehend.dominant-language-detection-job-properties/submit-time :portkey.aws.comprehend.dominant-language-detection-job-properties/message :portkey.aws.comprehend.dominant-language-detection-job-properties/data-access-role-arn :portkey.aws.comprehend/job-id]))

(clojure.spec.alpha/def :portkey.aws.comprehend.topics-detection-job-filter/submit-time-before (clojure.spec.alpha/and :portkey.aws.comprehend/timestamp))
(clojure.spec.alpha/def :portkey.aws.comprehend.topics-detection-job-filter/submit-time-after (clojure.spec.alpha/and :portkey.aws.comprehend/timestamp))
(clojure.spec.alpha/def :portkey.aws.comprehend/topics-detection-job-filter (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.comprehend/job-name :portkey.aws.comprehend/job-status :portkey.aws.comprehend.topics-detection-job-filter/submit-time-before :portkey.aws.comprehend.topics-detection-job-filter/submit-time-after]))

(clojure.spec.alpha/def :portkey.aws.comprehend/describe-document-classifier-response (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.comprehend/document-classifier-properties]))

(clojure.spec.alpha/def :portkey.aws.comprehend.entity-recognizer-metadata-entity-types-list-item/type (clojure.spec.alpha/and :portkey.aws.comprehend/any-length-string))
(clojure.spec.alpha/def :portkey.aws.comprehend/entity-recognizer-metadata-entity-types-list-item (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.comprehend.entity-recognizer-metadata-entity-types-list-item/type]))

(clojure.spec.alpha/def :portkey.aws.comprehend.detect-dominant-language-request/text (clojure.spec.alpha/and :portkey.aws.comprehend/string))
(clojure.spec.alpha/def :portkey.aws.comprehend/detect-dominant-language-request (clojure.spec.alpha/keys :req-un [:portkey.aws.comprehend.detect-dominant-language-request/text] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.comprehend/topics-detection-job-properties-list (clojure.spec.alpha/coll-of :portkey.aws.comprehend/topics-detection-job-properties))

(clojure.spec.alpha/def :portkey.aws.comprehend/stop-dominant-language-detection-job-request (clojure.spec.alpha/keys :req-un [:portkey.aws.comprehend/job-id] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.comprehend/stop-sentiment-detection-job-request (clojure.spec.alpha/keys :req-un [:portkey.aws.comprehend/job-id] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.comprehend.batch-item-error/index (clojure.spec.alpha/and :portkey.aws.comprehend/integer))
(clojure.spec.alpha/def :portkey.aws.comprehend.batch-item-error/error-code (clojure.spec.alpha/and :portkey.aws.comprehend/string))
(clojure.spec.alpha/def :portkey.aws.comprehend.batch-item-error/error-message (clojure.spec.alpha/and :portkey.aws.comprehend/string))
(clojure.spec.alpha/def :portkey.aws.comprehend/batch-item-error (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.comprehend.batch-item-error/index :portkey.aws.comprehend.batch-item-error/error-code :portkey.aws.comprehend.batch-item-error/error-message]))

(clojure.spec.alpha/def :portkey.aws.comprehend.batch-detect-entities-request/text-list (clojure.spec.alpha/and :portkey.aws.comprehend/string-list))
(clojure.spec.alpha/def :portkey.aws.comprehend/batch-detect-entities-request (clojure.spec.alpha/keys :req-un [:portkey.aws.comprehend.batch-detect-entities-request/text-list :portkey.aws.comprehend/language-code] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.comprehend.too-many-requests-exception/message (clojure.spec.alpha/and :portkey.aws.comprehend/string))
(clojure.spec.alpha/def :portkey.aws.comprehend/too-many-requests-exception (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.comprehend.too-many-requests-exception/message]))

(clojure.spec.alpha/def :portkey.aws.comprehend/model-status #{:stop-requested "STOP_REQUESTED" :deleting :trained :submitted "SUBMITTED" "TRAINING" :stopped "STOPPED" "DELETING" :training :in-error "IN_ERROR" "TRAINED"})

(clojure.spec.alpha/def :portkey.aws.comprehend.list-entity-recognizers-request/filter (clojure.spec.alpha/and :portkey.aws.comprehend/entity-recognizer-filter))
(clojure.spec.alpha/def :portkey.aws.comprehend.list-entity-recognizers-request/next-token (clojure.spec.alpha/and :portkey.aws.comprehend/string))
(clojure.spec.alpha/def :portkey.aws.comprehend.list-entity-recognizers-request/max-results (clojure.spec.alpha/and :portkey.aws.comprehend/max-results-integer))
(clojure.spec.alpha/def :portkey.aws.comprehend/list-entity-recognizers-request (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.comprehend.list-entity-recognizers-request/filter :portkey.aws.comprehend.list-entity-recognizers-request/next-token :portkey.aws.comprehend.list-entity-recognizers-request/max-results]))

(clojure.spec.alpha/def :portkey.aws.comprehend/iam-role-arn (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__1410938__auto__] (clojure.core/<= 20 (clojure.core/count s__1410938__auto__))) (clojure.core/fn [s__1410939__auto__] (clojure.core/< (clojure.core/count s__1410939__auto__) 2048)) (clojure.core/fn [s__1410940__auto__] (clojure.core/re-matches #"arn:aws(-[^:]+)?:iam::[0-9]{12}:role/.+" s__1410940__auto__))))

(clojure.spec.alpha/def :portkey.aws.comprehend.list-topics-detection-jobs-request/filter (clojure.spec.alpha/and :portkey.aws.comprehend/topics-detection-job-filter))
(clojure.spec.alpha/def :portkey.aws.comprehend.list-topics-detection-jobs-request/next-token (clojure.spec.alpha/and :portkey.aws.comprehend/string))
(clojure.spec.alpha/def :portkey.aws.comprehend.list-topics-detection-jobs-request/max-results (clojure.spec.alpha/and :portkey.aws.comprehend/max-results-integer))
(clojure.spec.alpha/def :portkey.aws.comprehend/list-topics-detection-jobs-request (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.comprehend.list-topics-detection-jobs-request/filter :portkey.aws.comprehend.list-topics-detection-jobs-request/next-token :portkey.aws.comprehend.list-topics-detection-jobs-request/max-results]))

(clojure.spec.alpha/def :portkey.aws.comprehend/comprehend-arn-name (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__1410939__auto__] (clojure.core/< (clojure.core/count s__1410939__auto__) 63)) (clojure.core/fn [s__1410940__auto__] (clojure.core/re-matches #"^[a-zA-Z0-9](-*[a-zA-Z0-9])*" s__1410940__auto__))))

(clojure.spec.alpha/def :portkey.aws.comprehend.start-key-phrases-detection-job-request/data-access-role-arn (clojure.spec.alpha/and :portkey.aws.comprehend/iam-role-arn))
(clojure.spec.alpha/def :portkey.aws.comprehend.start-key-phrases-detection-job-request/client-request-token (clojure.spec.alpha/and :portkey.aws.comprehend/client-request-token-string))
(clojure.spec.alpha/def :portkey.aws.comprehend/start-key-phrases-detection-job-request (clojure.spec.alpha/keys :req-un [:portkey.aws.comprehend/input-data-config :portkey.aws.comprehend/output-data-config :portkey.aws.comprehend.start-key-phrases-detection-job-request/data-access-role-arn :portkey.aws.comprehend/language-code] :opt-un [:portkey.aws.comprehend/job-name :portkey.aws.comprehend.start-key-phrases-detection-job-request/client-request-token]))

(clojure.spec.alpha/def :portkey.aws.comprehend/document-classifier-input-data-config (clojure.spec.alpha/keys :req-un [:portkey.aws.comprehend/s-3-uri] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.comprehend/stop-entities-detection-job-request (clojure.spec.alpha/keys :req-un [:portkey.aws.comprehend/job-id] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.comprehend/start-document-classification-job-response (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.comprehend/job-id :portkey.aws.comprehend/job-status]))

(clojure.spec.alpha/def :portkey.aws.comprehend/entity-recognizer-arn (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__1410939__auto__] (clojure.core/< (clojure.core/count s__1410939__auto__) 256)) (clojure.core/fn [s__1410940__auto__] (clojure.core/re-matches #"arn:aws:comprehend:[a-zA-Z0-9-]*:[0-9]{12}:entity-recognizer/[a-zA-Z0-9](-*[a-zA-Z0-9])*" s__1410940__auto__))))

(clojure.spec.alpha/def :portkey.aws.comprehend.document-classification-job-filter/submit-time-before (clojure.spec.alpha/and :portkey.aws.comprehend/timestamp))
(clojure.spec.alpha/def :portkey.aws.comprehend.document-classification-job-filter/submit-time-after (clojure.spec.alpha/and :portkey.aws.comprehend/timestamp))
(clojure.spec.alpha/def :portkey.aws.comprehend/document-classification-job-filter (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.comprehend/job-name :portkey.aws.comprehend/job-status :portkey.aws.comprehend.document-classification-job-filter/submit-time-before :portkey.aws.comprehend.document-classification-job-filter/submit-time-after]))

(clojure.spec.alpha/def :portkey.aws.comprehend.entities-detection-job-filter/submit-time-before (clojure.spec.alpha/and :portkey.aws.comprehend/timestamp))
(clojure.spec.alpha/def :portkey.aws.comprehend.entities-detection-job-filter/submit-time-after (clojure.spec.alpha/and :portkey.aws.comprehend/timestamp))
(clojure.spec.alpha/def :portkey.aws.comprehend/entities-detection-job-filter (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.comprehend/job-name :portkey.aws.comprehend/job-status :portkey.aws.comprehend.entities-detection-job-filter/submit-time-before :portkey.aws.comprehend.entities-detection-job-filter/submit-time-after]))

(clojure.spec.alpha/def :portkey.aws.comprehend.list-entities-detection-jobs-request/filter (clojure.spec.alpha/and :portkey.aws.comprehend/entities-detection-job-filter))
(clojure.spec.alpha/def :portkey.aws.comprehend.list-entities-detection-jobs-request/next-token (clojure.spec.alpha/and :portkey.aws.comprehend/string))
(clojure.spec.alpha/def :portkey.aws.comprehend.list-entities-detection-jobs-request/max-results (clojure.spec.alpha/and :portkey.aws.comprehend/max-results-integer))
(clojure.spec.alpha/def :portkey.aws.comprehend/list-entities-detection-jobs-request (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.comprehend.list-entities-detection-jobs-request/filter :portkey.aws.comprehend.list-entities-detection-jobs-request/next-token :portkey.aws.comprehend.list-entities-detection-jobs-request/max-results]))

(clojure.spec.alpha/def :portkey.aws.comprehend.list-document-classification-jobs-request/filter (clojure.spec.alpha/and :portkey.aws.comprehend/document-classification-job-filter))
(clojure.spec.alpha/def :portkey.aws.comprehend.list-document-classification-jobs-request/next-token (clojure.spec.alpha/and :portkey.aws.comprehend/string))
(clojure.spec.alpha/def :portkey.aws.comprehend.list-document-classification-jobs-request/max-results (clojure.spec.alpha/and :portkey.aws.comprehend/max-results-integer))
(clojure.spec.alpha/def :portkey.aws.comprehend/list-document-classification-jobs-request (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.comprehend.list-document-classification-jobs-request/filter :portkey.aws.comprehend.list-document-classification-jobs-request/next-token :portkey.aws.comprehend.list-document-classification-jobs-request/max-results]))

(clojure.spec.alpha/def :portkey.aws.comprehend.list-topics-detection-jobs-response/next-token (clojure.spec.alpha/and :portkey.aws.comprehend/string))
(clojure.spec.alpha/def :portkey.aws.comprehend/list-topics-detection-jobs-response (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.comprehend/topics-detection-job-properties-list :portkey.aws.comprehend.list-topics-detection-jobs-response/next-token]))

(clojure.spec.alpha/def :portkey.aws.comprehend.resource-not-found-exception/message (clojure.spec.alpha/and :portkey.aws.comprehend/string))
(clojure.spec.alpha/def :portkey.aws.comprehend/resource-not-found-exception (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.comprehend.resource-not-found-exception/message]))

(clojure.spec.alpha/def :portkey.aws.comprehend.entity-recognizer-evaluation-metrics/precision (clojure.spec.alpha/and :portkey.aws.comprehend/double))
(clojure.spec.alpha/def :portkey.aws.comprehend.entity-recognizer-evaluation-metrics/recall (clojure.spec.alpha/and :portkey.aws.comprehend/double))
(clojure.spec.alpha/def :portkey.aws.comprehend.entity-recognizer-evaluation-metrics/f-1-score (clojure.spec.alpha/and :portkey.aws.comprehend/double))
(clojure.spec.alpha/def :portkey.aws.comprehend/entity-recognizer-evaluation-metrics (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.comprehend.entity-recognizer-evaluation-metrics/precision :portkey.aws.comprehend.entity-recognizer-evaluation-metrics/recall :portkey.aws.comprehend.entity-recognizer-evaluation-metrics/f-1-score]))

(clojure.spec.alpha/def :portkey.aws.comprehend.internal-server-exception/message (clojure.spec.alpha/and :portkey.aws.comprehend/string))
(clojure.spec.alpha/def :portkey.aws.comprehend/internal-server-exception (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.comprehend.internal-server-exception/message]))

(clojure.spec.alpha/def :portkey.aws.comprehend.syntax-token/token-id (clojure.spec.alpha/and :portkey.aws.comprehend/integer))
(clojure.spec.alpha/def :portkey.aws.comprehend.syntax-token/text (clojure.spec.alpha/and :portkey.aws.comprehend/string))
(clojure.spec.alpha/def :portkey.aws.comprehend.syntax-token/begin-offset (clojure.spec.alpha/and :portkey.aws.comprehend/integer))
(clojure.spec.alpha/def :portkey.aws.comprehend.syntax-token/end-offset (clojure.spec.alpha/and :portkey.aws.comprehend/integer))
(clojure.spec.alpha/def :portkey.aws.comprehend.syntax-token/part-of-speech (clojure.spec.alpha/and :portkey.aws.comprehend/part-of-speech-tag))
(clojure.spec.alpha/def :portkey.aws.comprehend/syntax-token (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.comprehend.syntax-token/token-id :portkey.aws.comprehend.syntax-token/text :portkey.aws.comprehend.syntax-token/begin-offset :portkey.aws.comprehend.syntax-token/end-offset :portkey.aws.comprehend.syntax-token/part-of-speech]))

(clojure.spec.alpha/def :portkey.aws.comprehend.batch-detect-key-phrases-item-result/index (clojure.spec.alpha/and :portkey.aws.comprehend/integer))
(clojure.spec.alpha/def :portkey.aws.comprehend.batch-detect-key-phrases-item-result/key-phrases (clojure.spec.alpha/and :portkey.aws.comprehend/list-of-key-phrases))
(clojure.spec.alpha/def :portkey.aws.comprehend/batch-detect-key-phrases-item-result (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.comprehend.batch-detect-key-phrases-item-result/index :portkey.aws.comprehend.batch-detect-key-phrases-item-result/key-phrases]))

(clojure.spec.alpha/def :portkey.aws.comprehend/batch-item-error-list (clojure.spec.alpha/coll-of :portkey.aws.comprehend/batch-item-error))

(clojure.spec.alpha/def :portkey.aws.comprehend.document-classifier-properties/input-data-config (clojure.spec.alpha/and :portkey.aws.comprehend/document-classifier-input-data-config))
(clojure.spec.alpha/def :portkey.aws.comprehend.document-classifier-properties/training-end-time (clojure.spec.alpha/and :portkey.aws.comprehend/timestamp))
(clojure.spec.alpha/def :portkey.aws.comprehend.document-classifier-properties/end-time (clojure.spec.alpha/and :portkey.aws.comprehend/timestamp))
(clojure.spec.alpha/def :portkey.aws.comprehend.document-classifier-properties/submit-time (clojure.spec.alpha/and :portkey.aws.comprehend/timestamp))
(clojure.spec.alpha/def :portkey.aws.comprehend.document-classifier-properties/status (clojure.spec.alpha/and :portkey.aws.comprehend/model-status))
(clojure.spec.alpha/def :portkey.aws.comprehend.document-classifier-properties/message (clojure.spec.alpha/and :portkey.aws.comprehend/any-length-string))
(clojure.spec.alpha/def :portkey.aws.comprehend.document-classifier-properties/data-access-role-arn (clojure.spec.alpha/and :portkey.aws.comprehend/iam-role-arn))
(clojure.spec.alpha/def :portkey.aws.comprehend.document-classifier-properties/training-start-time (clojure.spec.alpha/and :portkey.aws.comprehend/timestamp))
(clojure.spec.alpha/def :portkey.aws.comprehend/document-classifier-properties (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.comprehend.document-classifier-properties/input-data-config :portkey.aws.comprehend.document-classifier-properties/training-end-time :portkey.aws.comprehend.document-classifier-properties/end-time :portkey.aws.comprehend.document-classifier-properties/submit-time :portkey.aws.comprehend.document-classifier-properties/status :portkey.aws.comprehend/language-code :portkey.aws.comprehend.document-classifier-properties/message :portkey.aws.comprehend.document-classifier-properties/data-access-role-arn :portkey.aws.comprehend/document-classifier-arn :portkey.aws.comprehend/classifier-metadata :portkey.aws.comprehend.document-classifier-properties/training-start-time]))

(clojure.spec.alpha/def :portkey.aws.comprehend/stop-key-phrases-detection-job-response (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.comprehend/job-id :portkey.aws.comprehend/job-status]))

(clojure.spec.alpha/def :portkey.aws.comprehend/language-code #{:fr "pt" "en" :es :pt "it" "fr" :it "de" :en "es" :de})

(clojure.spec.alpha/def :portkey.aws.comprehend/list-of-detect-key-phrases-result (clojure.spec.alpha/coll-of :portkey.aws.comprehend/batch-detect-key-phrases-item-result))

(clojure.spec.alpha/def :portkey.aws.comprehend/stop-entities-detection-job-response (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.comprehend/job-id :portkey.aws.comprehend/job-status]))

(clojure.spec.alpha/def :portkey.aws.comprehend.dominant-language-detection-job-filter/submit-time-before (clojure.spec.alpha/and :portkey.aws.comprehend/timestamp))
(clojure.spec.alpha/def :portkey.aws.comprehend.dominant-language-detection-job-filter/submit-time-after (clojure.spec.alpha/and :portkey.aws.comprehend/timestamp))
(clojure.spec.alpha/def :portkey.aws.comprehend/dominant-language-detection-job-filter (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.comprehend/job-name :portkey.aws.comprehend/job-status :portkey.aws.comprehend.dominant-language-detection-job-filter/submit-time-before :portkey.aws.comprehend.dominant-language-detection-job-filter/submit-time-after]))

(clojure.spec.alpha/def :portkey.aws.comprehend.detect-syntax-response/syntax-tokens (clojure.spec.alpha/and :portkey.aws.comprehend/list-of-syntax-tokens))
(clojure.spec.alpha/def :portkey.aws.comprehend/detect-syntax-response (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.comprehend.detect-syntax-response/syntax-tokens]))

(clojure.spec.alpha/def :portkey.aws.comprehend/start-sentiment-detection-job-response (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.comprehend/job-id :portkey.aws.comprehend/job-status]))

(clojure.spec.alpha/def :portkey.aws.comprehend/list-of-key-phrases (clojure.spec.alpha/coll-of :portkey.aws.comprehend/key-phrase))

(clojure.spec.alpha/def :portkey.aws.comprehend/describe-topics-detection-job-response (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.comprehend/topics-detection-job-properties]))

(clojure.spec.alpha/def :portkey.aws.comprehend/delete-entity-recognizer-response (clojure.spec.alpha/keys :req-un [] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.comprehend.batch-detect-syntax-request/text-list (clojure.spec.alpha/and :portkey.aws.comprehend/string-list))
(clojure.spec.alpha/def :portkey.aws.comprehend.batch-detect-syntax-request/language-code (clojure.spec.alpha/and :portkey.aws.comprehend/syntax-language-code))
(clojure.spec.alpha/def :portkey.aws.comprehend/batch-detect-syntax-request (clojure.spec.alpha/keys :req-un [:portkey.aws.comprehend.batch-detect-syntax-request/text-list :portkey.aws.comprehend.batch-detect-syntax-request/language-code] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.comprehend.start-document-classification-job-request/data-access-role-arn (clojure.spec.alpha/and :portkey.aws.comprehend/iam-role-arn))
(clojure.spec.alpha/def :portkey.aws.comprehend.start-document-classification-job-request/client-request-token (clojure.spec.alpha/and :portkey.aws.comprehend/client-request-token-string))
(clojure.spec.alpha/def :portkey.aws.comprehend/start-document-classification-job-request (clojure.spec.alpha/keys :req-un [:portkey.aws.comprehend/document-classifier-arn :portkey.aws.comprehend/input-data-config :portkey.aws.comprehend/output-data-config :portkey.aws.comprehend.start-document-classification-job-request/data-access-role-arn] :opt-un [:portkey.aws.comprehend/job-name :portkey.aws.comprehend.start-document-classification-job-request/client-request-token]))

(clojure.spec.alpha/def :portkey.aws.comprehend/document-classifier-properties-list (clojure.spec.alpha/coll-of :portkey.aws.comprehend/document-classifier-properties))

(clojure.spec.alpha/def :portkey.aws.comprehend/list-of-detect-sentiment-result (clojure.spec.alpha/coll-of :portkey.aws.comprehend/batch-detect-sentiment-item-result))

(clojure.spec.alpha/def :portkey.aws.comprehend/key-phrases-detection-job-properties-list (clojure.spec.alpha/coll-of :portkey.aws.comprehend/key-phrases-detection-job-properties))

(clojure.spec.alpha/def :portkey.aws.comprehend/integer clojure.core/int?)

(clojure.spec.alpha/def :portkey.aws.comprehend/string (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__1410938__auto__] (clojure.core/<= 1 (clojure.core/count s__1410938__auto__)))))

(clojure.spec.alpha/def :portkey.aws.comprehend.batch-detect-entities-item-result/index (clojure.spec.alpha/and :portkey.aws.comprehend/integer))
(clojure.spec.alpha/def :portkey.aws.comprehend.batch-detect-entities-item-result/entities (clojure.spec.alpha/and :portkey.aws.comprehend/list-of-entities))
(clojure.spec.alpha/def :portkey.aws.comprehend/batch-detect-entities-item-result (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.comprehend.batch-detect-entities-item-result/index :portkey.aws.comprehend.batch-detect-entities-item-result/entities]))

(clojure.spec.alpha/def :portkey.aws.comprehend/create-entity-recognizer-response (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.comprehend/entity-recognizer-arn]))

(clojure.spec.alpha/def :portkey.aws.comprehend.detect-entities-request/text (clojure.spec.alpha/and :portkey.aws.comprehend/string))
(clojure.spec.alpha/def :portkey.aws.comprehend/detect-entities-request (clojure.spec.alpha/keys :req-un [:portkey.aws.comprehend.detect-entities-request/text :portkey.aws.comprehend/language-code] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.comprehend/number-of-topics-integer (clojure.spec.alpha/int-in 1 100))

(clojure.spec.alpha/def :portkey.aws.comprehend.batch-detect-sentiment-response/result-list (clojure.spec.alpha/and :portkey.aws.comprehend/list-of-detect-sentiment-result))
(clojure.spec.alpha/def :portkey.aws.comprehend.batch-detect-sentiment-response/error-list (clojure.spec.alpha/and :portkey.aws.comprehend/batch-item-error-list))
(clojure.spec.alpha/def :portkey.aws.comprehend/batch-detect-sentiment-response (clojure.spec.alpha/keys :req-un [:portkey.aws.comprehend.batch-detect-sentiment-response/result-list :portkey.aws.comprehend.batch-detect-sentiment-response/error-list] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.comprehend/entity-type-name (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__1410939__auto__] (clojure.core/< (clojure.core/count s__1410939__auto__) 64)) (clojure.core/fn [s__1410940__auto__] (clojure.core/re-matches #"[_A-Z0-9]+" s__1410940__auto__))))

(clojure.spec.alpha/def :portkey.aws.comprehend.batch-detect-syntax-item-result/index (clojure.spec.alpha/and :portkey.aws.comprehend/integer))
(clojure.spec.alpha/def :portkey.aws.comprehend.batch-detect-syntax-item-result/syntax-tokens (clojure.spec.alpha/and :portkey.aws.comprehend/list-of-syntax-tokens))
(clojure.spec.alpha/def :portkey.aws.comprehend/batch-detect-syntax-item-result (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.comprehend.batch-detect-syntax-item-result/index :portkey.aws.comprehend.batch-detect-syntax-item-result/syntax-tokens]))

(clojure.spec.alpha/def :portkey.aws.comprehend.detect-entities-response/entities (clojure.spec.alpha/and :portkey.aws.comprehend/list-of-entities))
(clojure.spec.alpha/def :portkey.aws.comprehend/detect-entities-response (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.comprehend.detect-entities-response/entities]))

(clojure.spec.alpha/def :portkey.aws.comprehend.start-topics-detection-job-request/data-access-role-arn (clojure.spec.alpha/and :portkey.aws.comprehend/iam-role-arn))
(clojure.spec.alpha/def :portkey.aws.comprehend.start-topics-detection-job-request/number-of-topics (clojure.spec.alpha/and :portkey.aws.comprehend/number-of-topics-integer))
(clojure.spec.alpha/def :portkey.aws.comprehend.start-topics-detection-job-request/client-request-token (clojure.spec.alpha/and :portkey.aws.comprehend/client-request-token-string))
(clojure.spec.alpha/def :portkey.aws.comprehend/start-topics-detection-job-request (clojure.spec.alpha/keys :req-un [:portkey.aws.comprehend/input-data-config :portkey.aws.comprehend/output-data-config :portkey.aws.comprehend.start-topics-detection-job-request/data-access-role-arn] :opt-un [:portkey.aws.comprehend/job-name :portkey.aws.comprehend.start-topics-detection-job-request/number-of-topics :portkey.aws.comprehend.start-topics-detection-job-request/client-request-token]))

(clojure.spec.alpha/def :portkey.aws.comprehend.list-entity-recognizers-response/next-token (clojure.spec.alpha/and :portkey.aws.comprehend/string))
(clojure.spec.alpha/def :portkey.aws.comprehend/list-entity-recognizers-response (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.comprehend/entity-recognizer-properties-list :portkey.aws.comprehend.list-entity-recognizers-response/next-token]))

(clojure.spec.alpha/def :portkey.aws.comprehend/document-classifier-arn (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__1410939__auto__] (clojure.core/< (clojure.core/count s__1410939__auto__) 256)) (clojure.core/fn [s__1410940__auto__] (clojure.core/re-matches #"arn:aws:comprehend:[a-zA-Z0-9-]*:[0-9]{12}:document-classifier/[a-zA-Z0-9](-*[a-zA-Z0-9])*" s__1410940__auto__))))

(clojure.spec.alpha/def :portkey.aws.comprehend.list-sentiment-detection-jobs-request/filter (clojure.spec.alpha/and :portkey.aws.comprehend/sentiment-detection-job-filter))
(clojure.spec.alpha/def :portkey.aws.comprehend.list-sentiment-detection-jobs-request/next-token (clojure.spec.alpha/and :portkey.aws.comprehend/string))
(clojure.spec.alpha/def :portkey.aws.comprehend.list-sentiment-detection-jobs-request/max-results (clojure.spec.alpha/and :portkey.aws.comprehend/max-results-integer))
(clojure.spec.alpha/def :portkey.aws.comprehend/list-sentiment-detection-jobs-request (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.comprehend.list-sentiment-detection-jobs-request/filter :portkey.aws.comprehend.list-sentiment-detection-jobs-request/next-token :portkey.aws.comprehend.list-sentiment-detection-jobs-request/max-results]))

(clojure.spec.alpha/def :portkey.aws.comprehend/stop-key-phrases-detection-job-request (clojure.spec.alpha/keys :req-un [:portkey.aws.comprehend/job-id] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.comprehend.resource-limit-exceeded-exception/message (clojure.spec.alpha/and :portkey.aws.comprehend/string))
(clojure.spec.alpha/def :portkey.aws.comprehend/resource-limit-exceeded-exception (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.comprehend.resource-limit-exceeded-exception/message]))

(clojure.spec.alpha/def :portkey.aws.comprehend.batch-size-limit-exceeded-exception/message (clojure.spec.alpha/and :portkey.aws.comprehend/string))
(clojure.spec.alpha/def :portkey.aws.comprehend/batch-size-limit-exceeded-exception (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.comprehend.batch-size-limit-exceeded-exception/message]))

(clojure.spec.alpha/def :portkey.aws.comprehend/syntax-language-code #{:fr "pt" "en" :es :pt "it" "fr" :it "de" :en "es" :de})

(clojure.spec.alpha/def :portkey.aws.comprehend/client-request-token-string (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__1410938__auto__] (clojure.core/<= 1 (clojure.core/count s__1410938__auto__))) (clojure.core/fn [s__1410939__auto__] (clojure.core/< (clojure.core/count s__1410939__auto__) 64)) (clojure.core/fn [s__1410940__auto__] (clojure.core/re-matches #"^[a-zA-Z0-9-]+$" s__1410940__auto__))))

(clojure.spec.alpha/def :portkey.aws.comprehend.batch-detect-sentiment-item-result/index (clojure.spec.alpha/and :portkey.aws.comprehend/integer))
(clojure.spec.alpha/def :portkey.aws.comprehend.batch-detect-sentiment-item-result/sentiment (clojure.spec.alpha/and :portkey.aws.comprehend/sentiment-type))
(clojure.spec.alpha/def :portkey.aws.comprehend/batch-detect-sentiment-item-result (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.comprehend.batch-detect-sentiment-item-result/index :portkey.aws.comprehend.batch-detect-sentiment-item-result/sentiment :portkey.aws.comprehend/sentiment-score]))

(clojure.spec.alpha/def :portkey.aws.comprehend.key-phrases-detection-job-filter/submit-time-before (clojure.spec.alpha/and :portkey.aws.comprehend/timestamp))
(clojure.spec.alpha/def :portkey.aws.comprehend.key-phrases-detection-job-filter/submit-time-after (clojure.spec.alpha/and :portkey.aws.comprehend/timestamp))
(clojure.spec.alpha/def :portkey.aws.comprehend/key-phrases-detection-job-filter (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.comprehend/job-name :portkey.aws.comprehend/job-status :portkey.aws.comprehend.key-phrases-detection-job-filter/submit-time-before :portkey.aws.comprehend.key-phrases-detection-job-filter/submit-time-after]))

(clojure.spec.alpha/def :portkey.aws.comprehend.sentiment-detection-job-filter/submit-time-before (clojure.spec.alpha/and :portkey.aws.comprehend/timestamp))
(clojure.spec.alpha/def :portkey.aws.comprehend.sentiment-detection-job-filter/submit-time-after (clojure.spec.alpha/and :portkey.aws.comprehend/timestamp))
(clojure.spec.alpha/def :portkey.aws.comprehend/sentiment-detection-job-filter (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.comprehend/job-name :portkey.aws.comprehend/job-status :portkey.aws.comprehend.sentiment-detection-job-filter/submit-time-before :portkey.aws.comprehend.sentiment-detection-job-filter/submit-time-after]))

(clojure.spec.alpha/def :portkey.aws.comprehend.list-document-classifiers-response/next-token (clojure.spec.alpha/and :portkey.aws.comprehend/string))
(clojure.spec.alpha/def :portkey.aws.comprehend/list-document-classifiers-response (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.comprehend/document-classifier-properties-list :portkey.aws.comprehend.list-document-classifiers-response/next-token]))

(clojure.spec.alpha/def :portkey.aws.comprehend.list-dominant-language-detection-jobs-response/next-token (clojure.spec.alpha/and :portkey.aws.comprehend/string))
(clojure.spec.alpha/def :portkey.aws.comprehend/list-dominant-language-detection-jobs-response (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.comprehend/dominant-language-detection-job-properties-list :portkey.aws.comprehend.list-dominant-language-detection-jobs-response/next-token]))

(clojure.spec.alpha/def :portkey.aws.comprehend/entity-recognizer-entity-list (clojure.spec.alpha/keys :req-un [:portkey.aws.comprehend/s-3-uri] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.comprehend/describe-key-phrases-detection-job-request (clojure.spec.alpha/keys :req-un [:portkey.aws.comprehend/job-id] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.comprehend.detect-sentiment-request/text (clojure.spec.alpha/and :portkey.aws.comprehend/string))
(clojure.spec.alpha/def :portkey.aws.comprehend/detect-sentiment-request (clojure.spec.alpha/keys :req-un [:portkey.aws.comprehend.detect-sentiment-request/text :portkey.aws.comprehend/language-code] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.comprehend.classifier-metadata/number-of-labels (clojure.spec.alpha/and :portkey.aws.comprehend/integer))
(clojure.spec.alpha/def :portkey.aws.comprehend.classifier-metadata/number-of-trained-documents (clojure.spec.alpha/and :portkey.aws.comprehend/integer))
(clojure.spec.alpha/def :portkey.aws.comprehend.classifier-metadata/number-of-test-documents (clojure.spec.alpha/and :portkey.aws.comprehend/integer))
(clojure.spec.alpha/def :portkey.aws.comprehend.classifier-metadata/evaluation-metrics (clojure.spec.alpha/and :portkey.aws.comprehend/classifier-evaluation-metrics))
(clojure.spec.alpha/def :portkey.aws.comprehend/classifier-metadata (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.comprehend.classifier-metadata/number-of-labels :portkey.aws.comprehend.classifier-metadata/number-of-trained-documents :portkey.aws.comprehend.classifier-metadata/number-of-test-documents :portkey.aws.comprehend.classifier-metadata/evaluation-metrics]))

(clojure.spec.alpha/def :portkey.aws.comprehend/timestamp clojure.core/inst?)

(clojure.spec.alpha/def :portkey.aws.comprehend.document-classifier-filter/status (clojure.spec.alpha/and :portkey.aws.comprehend/model-status))
(clojure.spec.alpha/def :portkey.aws.comprehend.document-classifier-filter/submit-time-before (clojure.spec.alpha/and :portkey.aws.comprehend/timestamp))
(clojure.spec.alpha/def :portkey.aws.comprehend.document-classifier-filter/submit-time-after (clojure.spec.alpha/and :portkey.aws.comprehend/timestamp))
(clojure.spec.alpha/def :portkey.aws.comprehend/document-classifier-filter (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.comprehend.document-classifier-filter/status :portkey.aws.comprehend.document-classifier-filter/submit-time-before :portkey.aws.comprehend.document-classifier-filter/submit-time-after]))

(clojure.spec.alpha/def :portkey.aws.comprehend.entity/score (clojure.spec.alpha/and :portkey.aws.comprehend/float))
(clojure.spec.alpha/def :portkey.aws.comprehend.entity/type (clojure.spec.alpha/and :portkey.aws.comprehend/entity-type))
(clojure.spec.alpha/def :portkey.aws.comprehend.entity/text (clojure.spec.alpha/and :portkey.aws.comprehend/string))
(clojure.spec.alpha/def :portkey.aws.comprehend.entity/begin-offset (clojure.spec.alpha/and :portkey.aws.comprehend/integer))
(clojure.spec.alpha/def :portkey.aws.comprehend.entity/end-offset (clojure.spec.alpha/and :portkey.aws.comprehend/integer))
(clojure.spec.alpha/def :portkey.aws.comprehend/entity (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.comprehend.entity/score :portkey.aws.comprehend.entity/type :portkey.aws.comprehend.entity/text :portkey.aws.comprehend.entity/begin-offset :portkey.aws.comprehend.entity/end-offset]))

(clojure.spec.alpha/def :portkey.aws.comprehend.topics-detection-job-properties/end-time (clojure.spec.alpha/and :portkey.aws.comprehend/timestamp))
(clojure.spec.alpha/def :portkey.aws.comprehend.topics-detection-job-properties/number-of-topics (clojure.spec.alpha/and :portkey.aws.comprehend/integer))
(clojure.spec.alpha/def :portkey.aws.comprehend.topics-detection-job-properties/submit-time (clojure.spec.alpha/and :portkey.aws.comprehend/timestamp))
(clojure.spec.alpha/def :portkey.aws.comprehend.topics-detection-job-properties/message (clojure.spec.alpha/and :portkey.aws.comprehend/any-length-string))
(clojure.spec.alpha/def :portkey.aws.comprehend/topics-detection-job-properties (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.comprehend/input-data-config :portkey.aws.comprehend/output-data-config :portkey.aws.comprehend.topics-detection-job-properties/end-time :portkey.aws.comprehend.topics-detection-job-properties/number-of-topics :portkey.aws.comprehend/job-status :portkey.aws.comprehend/job-name :portkey.aws.comprehend.topics-detection-job-properties/submit-time :portkey.aws.comprehend.topics-detection-job-properties/message :portkey.aws.comprehend/job-id]))

(clojure.spec.alpha/def :portkey.aws.comprehend.create-entity-recognizer-request/recognizer-name (clojure.spec.alpha/and :portkey.aws.comprehend/comprehend-arn-name))
(clojure.spec.alpha/def :portkey.aws.comprehend.create-entity-recognizer-request/data-access-role-arn (clojure.spec.alpha/and :portkey.aws.comprehend/iam-role-arn))
(clojure.spec.alpha/def :portkey.aws.comprehend.create-entity-recognizer-request/input-data-config (clojure.spec.alpha/and :portkey.aws.comprehend/entity-recognizer-input-data-config))
(clojure.spec.alpha/def :portkey.aws.comprehend.create-entity-recognizer-request/client-request-token (clojure.spec.alpha/and :portkey.aws.comprehend/client-request-token-string))
(clojure.spec.alpha/def :portkey.aws.comprehend/create-entity-recognizer-request (clojure.spec.alpha/keys :req-un [:portkey.aws.comprehend.create-entity-recognizer-request/recognizer-name :portkey.aws.comprehend.create-entity-recognizer-request/data-access-role-arn :portkey.aws.comprehend.create-entity-recognizer-request/input-data-config :portkey.aws.comprehend/language-code] :opt-un [:portkey.aws.comprehend.create-entity-recognizer-request/client-request-token]))

(clojure.spec.alpha/def :portkey.aws.comprehend.job-not-found-exception/message (clojure.spec.alpha/and :portkey.aws.comprehend/string))
(clojure.spec.alpha/def :portkey.aws.comprehend/job-not-found-exception (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.comprehend.job-not-found-exception/message]))

(clojure.spec.alpha/def :portkey.aws.comprehend/describe-entity-recognizer-request (clojure.spec.alpha/keys :req-un [:portkey.aws.comprehend/entity-recognizer-arn] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.comprehend/sentiment-detection-job-properties-list (clojure.spec.alpha/coll-of :portkey.aws.comprehend/sentiment-detection-job-properties))

(clojure.spec.alpha/def :portkey.aws.comprehend.entity-types-list-item/type (clojure.spec.alpha/and :portkey.aws.comprehend/entity-type-name))
(clojure.spec.alpha/def :portkey.aws.comprehend/entity-types-list-item (clojure.spec.alpha/keys :req-un [:portkey.aws.comprehend.entity-types-list-item/type] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.comprehend/describe-dominant-language-detection-job-response (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.comprehend/dominant-language-detection-job-properties]))

(clojure.spec.alpha/def :portkey.aws.comprehend/describe-entities-detection-job-request (clojure.spec.alpha/keys :req-un [:portkey.aws.comprehend/job-id] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.comprehend/any-length-string (clojure.spec.alpha/and clojure.core/string?))

(clojure.spec.alpha/def :portkey.aws.comprehend.list-sentiment-detection-jobs-response/next-token (clojure.spec.alpha/and :portkey.aws.comprehend/string))
(clojure.spec.alpha/def :portkey.aws.comprehend/list-sentiment-detection-jobs-response (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.comprehend/sentiment-detection-job-properties-list :portkey.aws.comprehend.list-sentiment-detection-jobs-response/next-token]))

(clojure.spec.alpha/def :portkey.aws.comprehend/stop-sentiment-detection-job-response (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.comprehend/job-id :portkey.aws.comprehend/job-status]))

(clojure.spec.alpha/def :portkey.aws.comprehend/list-of-detect-syntax-result (clojure.spec.alpha/coll-of :portkey.aws.comprehend/batch-detect-syntax-item-result))

(clojure.spec.alpha/def :portkey.aws.comprehend.entities-detection-job-properties/end-time (clojure.spec.alpha/and :portkey.aws.comprehend/timestamp))
(clojure.spec.alpha/def :portkey.aws.comprehend.entities-detection-job-properties/submit-time (clojure.spec.alpha/and :portkey.aws.comprehend/timestamp))
(clojure.spec.alpha/def :portkey.aws.comprehend.entities-detection-job-properties/message (clojure.spec.alpha/and :portkey.aws.comprehend/any-length-string))
(clojure.spec.alpha/def :portkey.aws.comprehend.entities-detection-job-properties/data-access-role-arn (clojure.spec.alpha/and :portkey.aws.comprehend/iam-role-arn))
(clojure.spec.alpha/def :portkey.aws.comprehend/entities-detection-job-properties (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.comprehend/input-data-config :portkey.aws.comprehend/output-data-config :portkey.aws.comprehend.entities-detection-job-properties/end-time :portkey.aws.comprehend/job-status :portkey.aws.comprehend/job-name :portkey.aws.comprehend.entities-detection-job-properties/submit-time :portkey.aws.comprehend/entity-recognizer-arn :portkey.aws.comprehend/language-code :portkey.aws.comprehend.entities-detection-job-properties/message :portkey.aws.comprehend.entities-detection-job-properties/data-access-role-arn :portkey.aws.comprehend/job-id]))

(clojure.spec.alpha/def :portkey.aws.comprehend/describe-document-classifier-request (clojure.spec.alpha/keys :req-un [:portkey.aws.comprehend/document-classifier-arn] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.comprehend/max-results-integer (clojure.spec.alpha/int-in 1 500))

(clojure.spec.alpha/def :portkey.aws.comprehend/input-format #{"ONE_DOC_PER_FILE" "ONE_DOC_PER_LINE" :one-doc-per-line :one-doc-per-file})

(clojure.spec.alpha/def :portkey.aws.comprehend/entity-recognizer-properties-list (clojure.spec.alpha/coll-of :portkey.aws.comprehend/entity-recognizer-properties))

(clojure.spec.alpha/def :portkey.aws.comprehend/entity-type #{:date "ORGANIZATION" "TITLE" :person :other "DATE" :commercial-item "PERSON" "EVENT" :organization :title "QUANTITY" "OTHER" "LOCATION" :event "COMMERCIAL_ITEM" :quantity :location})

(clojure.spec.alpha/def :portkey.aws.comprehend.list-dominant-language-detection-jobs-request/filter (clojure.spec.alpha/and :portkey.aws.comprehend/dominant-language-detection-job-filter))
(clojure.spec.alpha/def :portkey.aws.comprehend.list-dominant-language-detection-jobs-request/next-token (clojure.spec.alpha/and :portkey.aws.comprehend/string))
(clojure.spec.alpha/def :portkey.aws.comprehend.list-dominant-language-detection-jobs-request/max-results (clojure.spec.alpha/and :portkey.aws.comprehend/max-results-integer))
(clojure.spec.alpha/def :portkey.aws.comprehend/list-dominant-language-detection-jobs-request (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.comprehend.list-dominant-language-detection-jobs-request/filter :portkey.aws.comprehend.list-dominant-language-detection-jobs-request/next-token :portkey.aws.comprehend.list-dominant-language-detection-jobs-request/max-results]))

(clojure.spec.alpha/def :portkey.aws.comprehend.create-document-classifier-request/document-classifier-name (clojure.spec.alpha/and :portkey.aws.comprehend/comprehend-arn-name))
(clojure.spec.alpha/def :portkey.aws.comprehend.create-document-classifier-request/data-access-role-arn (clojure.spec.alpha/and :portkey.aws.comprehend/iam-role-arn))
(clojure.spec.alpha/def :portkey.aws.comprehend.create-document-classifier-request/input-data-config (clojure.spec.alpha/and :portkey.aws.comprehend/document-classifier-input-data-config))
(clojure.spec.alpha/def :portkey.aws.comprehend.create-document-classifier-request/client-request-token (clojure.spec.alpha/and :portkey.aws.comprehend/client-request-token-string))
(clojure.spec.alpha/def :portkey.aws.comprehend/create-document-classifier-request (clojure.spec.alpha/keys :req-un [:portkey.aws.comprehend.create-document-classifier-request/document-classifier-name :portkey.aws.comprehend.create-document-classifier-request/data-access-role-arn :portkey.aws.comprehend.create-document-classifier-request/input-data-config :portkey.aws.comprehend/language-code] :opt-un [:portkey.aws.comprehend.create-document-classifier-request/client-request-token]))

(clojure.spec.alpha/def :portkey.aws.comprehend.resource-unavailable-exception/message (clojure.spec.alpha/and :portkey.aws.comprehend/string))
(clojure.spec.alpha/def :portkey.aws.comprehend/resource-unavailable-exception (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.comprehend.resource-unavailable-exception/message]))

(clojure.spec.alpha/def :portkey.aws.comprehend/dominant-language-detection-job-properties-list (clojure.spec.alpha/coll-of :portkey.aws.comprehend/dominant-language-detection-job-properties))

(clojure.spec.alpha/def :portkey.aws.comprehend/float clojure.core/float?)

(clojure.spec.alpha/def :portkey.aws.comprehend/delete-document-classifier-request (clojure.spec.alpha/keys :req-un [:portkey.aws.comprehend/document-classifier-arn] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.comprehend/describe-entity-recognizer-response (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.comprehend/entity-recognizer-properties]))

(clojure.spec.alpha/def :portkey.aws.comprehend.batch-detect-sentiment-request/text-list (clojure.spec.alpha/and :portkey.aws.comprehend/string-list))
(clojure.spec.alpha/def :portkey.aws.comprehend/batch-detect-sentiment-request (clojure.spec.alpha/keys :req-un [:portkey.aws.comprehend.batch-detect-sentiment-request/text-list :portkey.aws.comprehend/language-code] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.comprehend/document-classification-job-properties-list (clojure.spec.alpha/coll-of :portkey.aws.comprehend/document-classification-job-properties))

(clojure.spec.alpha/def :portkey.aws.comprehend.sentiment-detection-job-properties/end-time (clojure.spec.alpha/and :portkey.aws.comprehend/timestamp))
(clojure.spec.alpha/def :portkey.aws.comprehend.sentiment-detection-job-properties/submit-time (clojure.spec.alpha/and :portkey.aws.comprehend/timestamp))
(clojure.spec.alpha/def :portkey.aws.comprehend.sentiment-detection-job-properties/message (clojure.spec.alpha/and :portkey.aws.comprehend/any-length-string))
(clojure.spec.alpha/def :portkey.aws.comprehend.sentiment-detection-job-properties/data-access-role-arn (clojure.spec.alpha/and :portkey.aws.comprehend/iam-role-arn))
(clojure.spec.alpha/def :portkey.aws.comprehend/sentiment-detection-job-properties (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.comprehend/input-data-config :portkey.aws.comprehend/output-data-config :portkey.aws.comprehend.sentiment-detection-job-properties/end-time :portkey.aws.comprehend/job-status :portkey.aws.comprehend/job-name :portkey.aws.comprehend.sentiment-detection-job-properties/submit-time :portkey.aws.comprehend/language-code :portkey.aws.comprehend.sentiment-detection-job-properties/message :portkey.aws.comprehend.sentiment-detection-job-properties/data-access-role-arn :portkey.aws.comprehend/job-id]))

(clojure.spec.alpha/def :portkey.aws.comprehend.part-of-speech-tag/tag (clojure.spec.alpha/and :portkey.aws.comprehend/part-of-speech-tag-type))
(clojure.spec.alpha/def :portkey.aws.comprehend.part-of-speech-tag/score (clojure.spec.alpha/and :portkey.aws.comprehend/float))
(clojure.spec.alpha/def :portkey.aws.comprehend/part-of-speech-tag (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.comprehend.part-of-speech-tag/tag :portkey.aws.comprehend.part-of-speech-tag/score]))

(clojure.spec.alpha/def :portkey.aws.comprehend/describe-entities-detection-job-response (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.comprehend/entities-detection-job-properties]))

(clojure.spec.alpha/def :portkey.aws.comprehend/describe-key-phrases-detection-job-response (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.comprehend/key-phrases-detection-job-properties]))

(clojure.spec.alpha/def :portkey.aws.comprehend/list-of-syntax-tokens (clojure.spec.alpha/coll-of :portkey.aws.comprehend/syntax-token))

(clojure.spec.alpha/def :portkey.aws.comprehend/entities-detection-job-properties-list (clojure.spec.alpha/coll-of :portkey.aws.comprehend/entities-detection-job-properties))

(clojure.spec.alpha/def :portkey.aws.comprehend.batch-detect-entities-response/result-list (clojure.spec.alpha/and :portkey.aws.comprehend/list-of-detect-entities-result))
(clojure.spec.alpha/def :portkey.aws.comprehend.batch-detect-entities-response/error-list (clojure.spec.alpha/and :portkey.aws.comprehend/batch-item-error-list))
(clojure.spec.alpha/def :portkey.aws.comprehend/batch-detect-entities-response (clojure.spec.alpha/keys :req-un [:portkey.aws.comprehend.batch-detect-entities-response/result-list :portkey.aws.comprehend.batch-detect-entities-response/error-list] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.comprehend/job-id (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__1410938__auto__] (clojure.core/<= 1 (clojure.core/count s__1410938__auto__))) (clojure.core/fn [s__1410939__auto__] (clojure.core/< (clojure.core/count s__1410939__auto__) 32)) (clojure.core/fn [s__1410940__auto__] (clojure.core/re-matches #"^([\p{L}\p{Z}\p{N}_.:/=+\-%@]*)$" s__1410940__auto__))))

(clojure.core/defn stop-entities-detection-job "Stops an entities detection job in progress.\n If the job state is IN_PROGRESS the job is marked for termination and put into\nthe STOP_REQUESTED state. If the job completes before it can be stopped, it is\nput into the COMPLETED state; otherwise the job is stopped and put into the\nSTOPPED state.\n If the job is in the COMPLETED or FAILED state when you call the\nStopDominantLanguageDetectionJob operation, the operation returns a 400 Internal\nRequest Exception.\n When a job is stopped, any documents already processed are written to the\noutput location." ([stop-entities-detection-job-requestinput] (clojure.core/let [request-function-result__1411981__auto__ (req-stop-entities-detection-job-request stop-entities-detection-job-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__1411981__auto__ {:http.request.configuration/endpoints portkey.aws.comprehend/endpoints, :http.request.configuration/target-prefix "Comprehend_20171127", :http.request.spec/output-spec :portkey.aws.comprehend/stop-entities-detection-job-response, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2017-11-27", :http.request.configuration/service-id "Comprehend", :http.request.spec/input-spec :portkey.aws.comprehend/stop-entities-detection-job-request, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "StopEntitiesDetectionJob", :http.request.configuration/output-deser-fn response-stop-entities-detection-job-response, :http.request.spec/error-spec {"InvalidRequestException" :portkey.aws.comprehend/invalid-request-exception, "JobNotFoundException" :portkey.aws.comprehend/job-not-found-exception, "InternalServerException" :portkey.aws.comprehend/internal-server-exception}})))))
(clojure.spec.alpha/fdef stop-entities-detection-job :args (clojure.spec.alpha/tuple :portkey.aws.comprehend/stop-entities-detection-job-request) :ret (clojure.spec.alpha/and :portkey.aws.comprehend/stop-entities-detection-job-response))

(clojure.core/defn list-sentiment-detection-jobs "Gets a list of sentiment detection jobs that you have submitted." ([] (list-sentiment-detection-jobs {})) ([list-sentiment-detection-jobs-requestinput] (clojure.core/let [request-function-result__1411981__auto__ (req-list-sentiment-detection-jobs-request list-sentiment-detection-jobs-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__1411981__auto__ {:http.request.configuration/endpoints portkey.aws.comprehend/endpoints, :http.request.configuration/target-prefix "Comprehend_20171127", :http.request.spec/output-spec :portkey.aws.comprehend/list-sentiment-detection-jobs-response, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2017-11-27", :http.request.configuration/service-id "Comprehend", :http.request.spec/input-spec :portkey.aws.comprehend/list-sentiment-detection-jobs-request, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "ListSentimentDetectionJobs", :http.request.configuration/output-deser-fn response-list-sentiment-detection-jobs-response, :http.request.spec/error-spec {"InvalidRequestException" :portkey.aws.comprehend/invalid-request-exception, "TooManyRequestsException" :portkey.aws.comprehend/too-many-requests-exception, "InvalidFilterException" :portkey.aws.comprehend/invalid-filter-exception, "InternalServerException" :portkey.aws.comprehend/internal-server-exception}})))))
(clojure.spec.alpha/fdef list-sentiment-detection-jobs :args (clojure.spec.alpha/? :portkey.aws.comprehend/list-sentiment-detection-jobs-request) :ret (clojure.spec.alpha/and :portkey.aws.comprehend/list-sentiment-detection-jobs-response))

(clojure.core/defn describe-key-phrases-detection-job "Gets the properties associated with a key phrases detection job. Use this\noperation to get the status of a detection job." ([describe-key-phrases-detection-job-requestinput] (clojure.core/let [request-function-result__1411981__auto__ (req-describe-key-phrases-detection-job-request describe-key-phrases-detection-job-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__1411981__auto__ {:http.request.configuration/endpoints portkey.aws.comprehend/endpoints, :http.request.configuration/target-prefix "Comprehend_20171127", :http.request.spec/output-spec :portkey.aws.comprehend/describe-key-phrases-detection-job-response, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2017-11-27", :http.request.configuration/service-id "Comprehend", :http.request.spec/input-spec :portkey.aws.comprehend/describe-key-phrases-detection-job-request, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "DescribeKeyPhrasesDetectionJob", :http.request.configuration/output-deser-fn response-describe-key-phrases-detection-job-response, :http.request.spec/error-spec {"InvalidRequestException" :portkey.aws.comprehend/invalid-request-exception, "JobNotFoundException" :portkey.aws.comprehend/job-not-found-exception, "TooManyRequestsException" :portkey.aws.comprehend/too-many-requests-exception, "InternalServerException" :portkey.aws.comprehend/internal-server-exception}})))))
(clojure.spec.alpha/fdef describe-key-phrases-detection-job :args (clojure.spec.alpha/tuple :portkey.aws.comprehend/describe-key-phrases-detection-job-request) :ret (clojure.spec.alpha/and :portkey.aws.comprehend/describe-key-phrases-detection-job-response))

(clojure.core/defn list-dominant-language-detection-jobs "Gets a list of the dominant language detection jobs that you have submitted." ([] (list-dominant-language-detection-jobs {})) ([list-dominant-language-detection-jobs-requestinput] (clojure.core/let [request-function-result__1411981__auto__ (req-list-dominant-language-detection-jobs-request list-dominant-language-detection-jobs-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__1411981__auto__ {:http.request.configuration/endpoints portkey.aws.comprehend/endpoints, :http.request.configuration/target-prefix "Comprehend_20171127", :http.request.spec/output-spec :portkey.aws.comprehend/list-dominant-language-detection-jobs-response, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2017-11-27", :http.request.configuration/service-id "Comprehend", :http.request.spec/input-spec :portkey.aws.comprehend/list-dominant-language-detection-jobs-request, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "ListDominantLanguageDetectionJobs", :http.request.configuration/output-deser-fn response-list-dominant-language-detection-jobs-response, :http.request.spec/error-spec {"InvalidRequestException" :portkey.aws.comprehend/invalid-request-exception, "TooManyRequestsException" :portkey.aws.comprehend/too-many-requests-exception, "InvalidFilterException" :portkey.aws.comprehend/invalid-filter-exception, "InternalServerException" :portkey.aws.comprehend/internal-server-exception}})))))
(clojure.spec.alpha/fdef list-dominant-language-detection-jobs :args (clojure.spec.alpha/? :portkey.aws.comprehend/list-dominant-language-detection-jobs-request) :ret (clojure.spec.alpha/and :portkey.aws.comprehend/list-dominant-language-detection-jobs-response))

(clojure.core/defn batch-detect-syntax "Inspects the text of a batch of documents for the syntax and part of speech of\nthe words in the document and returns information about them. For more\ninformation, see how-syntax." ([batch-detect-syntax-requestinput] (clojure.core/let [request-function-result__1411981__auto__ (req-batch-detect-syntax-request batch-detect-syntax-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__1411981__auto__ {:http.request.configuration/endpoints portkey.aws.comprehend/endpoints, :http.request.configuration/target-prefix "Comprehend_20171127", :http.request.spec/output-spec :portkey.aws.comprehend/batch-detect-syntax-response, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2017-11-27", :http.request.configuration/service-id "Comprehend", :http.request.spec/input-spec :portkey.aws.comprehend/batch-detect-syntax-request, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "BatchDetectSyntax", :http.request.configuration/output-deser-fn response-batch-detect-syntax-response, :http.request.spec/error-spec {"InvalidRequestException" :portkey.aws.comprehend/invalid-request-exception, "TextSizeLimitExceededException" :portkey.aws.comprehend/text-size-limit-exceeded-exception, "UnsupportedLanguageException" :portkey.aws.comprehend/unsupported-language-exception, "BatchSizeLimitExceededException" :portkey.aws.comprehend/batch-size-limit-exceeded-exception, "InternalServerException" :portkey.aws.comprehend/internal-server-exception}})))))
(clojure.spec.alpha/fdef batch-detect-syntax :args (clojure.spec.alpha/tuple :portkey.aws.comprehend/batch-detect-syntax-request) :ret (clojure.spec.alpha/and :portkey.aws.comprehend/batch-detect-syntax-response))

(clojure.core/defn delete-document-classifier "Deletes a previously created document classifier\n Only those classifiers that are in terminated states (IN_ERROR, TRAINED) will\nbe deleted. If an active inference job is using the model, a\nResourceInUseException will be returned.\n This is an asynchronous action that puts the classifier into a DELETING state,\nand it is then removed by a background job. Once removed, the classifier\ndisappears from your account and is no longer available for use." ([delete-document-classifier-requestinput] (clojure.core/let [request-function-result__1411981__auto__ (req-delete-document-classifier-request delete-document-classifier-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__1411981__auto__ {:http.request.configuration/endpoints portkey.aws.comprehend/endpoints, :http.request.configuration/target-prefix "Comprehend_20171127", :http.request.spec/output-spec :portkey.aws.comprehend/delete-document-classifier-response, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2017-11-27", :http.request.configuration/service-id "Comprehend", :http.request.spec/input-spec :portkey.aws.comprehend/delete-document-classifier-request, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "DeleteDocumentClassifier", :http.request.configuration/output-deser-fn response-delete-document-classifier-response, :http.request.spec/error-spec {"InvalidRequestException" :portkey.aws.comprehend/invalid-request-exception, "TooManyRequestsException" :portkey.aws.comprehend/too-many-requests-exception, "ResourceNotFoundException" :portkey.aws.comprehend/resource-not-found-exception, "ResourceUnavailableException" :portkey.aws.comprehend/resource-unavailable-exception, "ResourceInUseException" :portkey.aws.comprehend/resource-in-use-exception, "InternalServerException" :portkey.aws.comprehend/internal-server-exception}})))))
(clojure.spec.alpha/fdef delete-document-classifier :args (clojure.spec.alpha/tuple :portkey.aws.comprehend/delete-document-classifier-request) :ret (clojure.spec.alpha/and :portkey.aws.comprehend/delete-document-classifier-response))

(clojure.core/defn start-key-phrases-detection-job "Starts an asynchronous key phrase detection job for a collection of documents.\nUse the operation to track the status of a job." ([start-key-phrases-detection-job-requestinput] (clojure.core/let [request-function-result__1411981__auto__ (req-start-key-phrases-detection-job-request start-key-phrases-detection-job-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__1411981__auto__ {:http.request.configuration/endpoints portkey.aws.comprehend/endpoints, :http.request.configuration/target-prefix "Comprehend_20171127", :http.request.spec/output-spec :portkey.aws.comprehend/start-key-phrases-detection-job-response, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2017-11-27", :http.request.configuration/service-id "Comprehend", :http.request.spec/input-spec :portkey.aws.comprehend/start-key-phrases-detection-job-request, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "StartKeyPhrasesDetectionJob", :http.request.configuration/output-deser-fn response-start-key-phrases-detection-job-response, :http.request.spec/error-spec {"InvalidRequestException" :portkey.aws.comprehend/invalid-request-exception, "TooManyRequestsException" :portkey.aws.comprehend/too-many-requests-exception, "InternalServerException" :portkey.aws.comprehend/internal-server-exception}})))))
(clojure.spec.alpha/fdef start-key-phrases-detection-job :args (clojure.spec.alpha/tuple :portkey.aws.comprehend/start-key-phrases-detection-job-request) :ret (clojure.spec.alpha/and :portkey.aws.comprehend/start-key-phrases-detection-job-response))

(clojure.core/defn describe-entities-detection-job "Gets the properties associated with an entities detection job. Use this\noperation to get the status of a detection job." ([describe-entities-detection-job-requestinput] (clojure.core/let [request-function-result__1411981__auto__ (req-describe-entities-detection-job-request describe-entities-detection-job-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__1411981__auto__ {:http.request.configuration/endpoints portkey.aws.comprehend/endpoints, :http.request.configuration/target-prefix "Comprehend_20171127", :http.request.spec/output-spec :portkey.aws.comprehend/describe-entities-detection-job-response, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2017-11-27", :http.request.configuration/service-id "Comprehend", :http.request.spec/input-spec :portkey.aws.comprehend/describe-entities-detection-job-request, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "DescribeEntitiesDetectionJob", :http.request.configuration/output-deser-fn response-describe-entities-detection-job-response, :http.request.spec/error-spec {"InvalidRequestException" :portkey.aws.comprehend/invalid-request-exception, "JobNotFoundException" :portkey.aws.comprehend/job-not-found-exception, "TooManyRequestsException" :portkey.aws.comprehend/too-many-requests-exception, "InternalServerException" :portkey.aws.comprehend/internal-server-exception}})))))
(clojure.spec.alpha/fdef describe-entities-detection-job :args (clojure.spec.alpha/tuple :portkey.aws.comprehend/describe-entities-detection-job-request) :ret (clojure.spec.alpha/and :portkey.aws.comprehend/describe-entities-detection-job-response))

(clojure.core/defn describe-sentiment-detection-job "Gets the properties associated with a sentiment detection job. Use this\noperation to get the status of a detection job." ([describe-sentiment-detection-job-requestinput] (clojure.core/let [request-function-result__1411981__auto__ (req-describe-sentiment-detection-job-request describe-sentiment-detection-job-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__1411981__auto__ {:http.request.configuration/endpoints portkey.aws.comprehend/endpoints, :http.request.configuration/target-prefix "Comprehend_20171127", :http.request.spec/output-spec :portkey.aws.comprehend/describe-sentiment-detection-job-response, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2017-11-27", :http.request.configuration/service-id "Comprehend", :http.request.spec/input-spec :portkey.aws.comprehend/describe-sentiment-detection-job-request, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "DescribeSentimentDetectionJob", :http.request.configuration/output-deser-fn response-describe-sentiment-detection-job-response, :http.request.spec/error-spec {"InvalidRequestException" :portkey.aws.comprehend/invalid-request-exception, "JobNotFoundException" :portkey.aws.comprehend/job-not-found-exception, "TooManyRequestsException" :portkey.aws.comprehend/too-many-requests-exception, "InternalServerException" :portkey.aws.comprehend/internal-server-exception}})))))
(clojure.spec.alpha/fdef describe-sentiment-detection-job :args (clojure.spec.alpha/tuple :portkey.aws.comprehend/describe-sentiment-detection-job-request) :ret (clojure.spec.alpha/and :portkey.aws.comprehend/describe-sentiment-detection-job-response))

(clojure.core/defn stop-key-phrases-detection-job "Stops a key phrases detection job in progress.\n If the job state is IN_PROGRESS the job is marked for termination and put into\nthe STOP_REQUESTED state. If the job completes before it can be stopped, it is\nput into the COMPLETED state; otherwise the job is stopped and put into the\nSTOPPED state.\n If the job is in the COMPLETED or FAILED state when you call the\nStopDominantLanguageDetectionJob operation, the operation returns a 400 Internal\nRequest Exception.\n When a job is stopped, any documents already processed are written to the\noutput location." ([stop-key-phrases-detection-job-requestinput] (clojure.core/let [request-function-result__1411981__auto__ (req-stop-key-phrases-detection-job-request stop-key-phrases-detection-job-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__1411981__auto__ {:http.request.configuration/endpoints portkey.aws.comprehend/endpoints, :http.request.configuration/target-prefix "Comprehend_20171127", :http.request.spec/output-spec :portkey.aws.comprehend/stop-key-phrases-detection-job-response, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2017-11-27", :http.request.configuration/service-id "Comprehend", :http.request.spec/input-spec :portkey.aws.comprehend/stop-key-phrases-detection-job-request, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "StopKeyPhrasesDetectionJob", :http.request.configuration/output-deser-fn response-stop-key-phrases-detection-job-response, :http.request.spec/error-spec {"InvalidRequestException" :portkey.aws.comprehend/invalid-request-exception, "JobNotFoundException" :portkey.aws.comprehend/job-not-found-exception, "InternalServerException" :portkey.aws.comprehend/internal-server-exception}})))))
(clojure.spec.alpha/fdef stop-key-phrases-detection-job :args (clojure.spec.alpha/tuple :portkey.aws.comprehend/stop-key-phrases-detection-job-request) :ret (clojure.spec.alpha/and :portkey.aws.comprehend/stop-key-phrases-detection-job-response))

(clojure.core/defn create-document-classifier "Creates a new document classifier that you can use to categorize documents. To\ncreate a classifier you provide a set of training documents that labeled with\nthe categories that you want to use. After the classifier is trained you can use\nit to categorize a set of labeled documents into the categories. For more\ninformation, see how-document-classification." ([create-document-classifier-requestinput] (clojure.core/let [request-function-result__1411981__auto__ (req-create-document-classifier-request create-document-classifier-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__1411981__auto__ {:http.request.configuration/endpoints portkey.aws.comprehend/endpoints, :http.request.configuration/target-prefix "Comprehend_20171127", :http.request.spec/output-spec :portkey.aws.comprehend/create-document-classifier-response, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2017-11-27", :http.request.configuration/service-id "Comprehend", :http.request.spec/input-spec :portkey.aws.comprehend/create-document-classifier-request, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "CreateDocumentClassifier", :http.request.configuration/output-deser-fn response-create-document-classifier-response, :http.request.spec/error-spec {"InvalidRequestException" :portkey.aws.comprehend/invalid-request-exception, "ResourceInUseException" :portkey.aws.comprehend/resource-in-use-exception, "TooManyRequestsException" :portkey.aws.comprehend/too-many-requests-exception, "ResourceLimitExceededException" :portkey.aws.comprehend/resource-limit-exceeded-exception, "UnsupportedLanguageException" :portkey.aws.comprehend/unsupported-language-exception, "InternalServerException" :portkey.aws.comprehend/internal-server-exception}})))))
(clojure.spec.alpha/fdef create-document-classifier :args (clojure.spec.alpha/tuple :portkey.aws.comprehend/create-document-classifier-request) :ret (clojure.spec.alpha/and :portkey.aws.comprehend/create-document-classifier-response))

(clojure.core/defn list-topics-detection-jobs "Gets a list of the topic detection jobs that you have submitted." ([] (list-topics-detection-jobs {})) ([list-topics-detection-jobs-requestinput] (clojure.core/let [request-function-result__1411981__auto__ (req-list-topics-detection-jobs-request list-topics-detection-jobs-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__1411981__auto__ {:http.request.configuration/endpoints portkey.aws.comprehend/endpoints, :http.request.configuration/target-prefix "Comprehend_20171127", :http.request.spec/output-spec :portkey.aws.comprehend/list-topics-detection-jobs-response, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2017-11-27", :http.request.configuration/service-id "Comprehend", :http.request.spec/input-spec :portkey.aws.comprehend/list-topics-detection-jobs-request, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "ListTopicsDetectionJobs", :http.request.configuration/output-deser-fn response-list-topics-detection-jobs-response, :http.request.spec/error-spec {"InvalidRequestException" :portkey.aws.comprehend/invalid-request-exception, "TooManyRequestsException" :portkey.aws.comprehend/too-many-requests-exception, "InvalidFilterException" :portkey.aws.comprehend/invalid-filter-exception, "InternalServerException" :portkey.aws.comprehend/internal-server-exception}})))))
(clojure.spec.alpha/fdef list-topics-detection-jobs :args (clojure.spec.alpha/? :portkey.aws.comprehend/list-topics-detection-jobs-request) :ret (clojure.spec.alpha/and :portkey.aws.comprehend/list-topics-detection-jobs-response))

(clojure.core/defn describe-dominant-language-detection-job "Gets the properties associated with a dominant language detection job. Use this\noperation to get the status of a detection job." ([describe-dominant-language-detection-job-requestinput] (clojure.core/let [request-function-result__1411981__auto__ (req-describe-dominant-language-detection-job-request describe-dominant-language-detection-job-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__1411981__auto__ {:http.request.configuration/endpoints portkey.aws.comprehend/endpoints, :http.request.configuration/target-prefix "Comprehend_20171127", :http.request.spec/output-spec :portkey.aws.comprehend/describe-dominant-language-detection-job-response, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2017-11-27", :http.request.configuration/service-id "Comprehend", :http.request.spec/input-spec :portkey.aws.comprehend/describe-dominant-language-detection-job-request, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "DescribeDominantLanguageDetectionJob", :http.request.configuration/output-deser-fn response-describe-dominant-language-detection-job-response, :http.request.spec/error-spec {"InvalidRequestException" :portkey.aws.comprehend/invalid-request-exception, "JobNotFoundException" :portkey.aws.comprehend/job-not-found-exception, "TooManyRequestsException" :portkey.aws.comprehend/too-many-requests-exception, "InternalServerException" :portkey.aws.comprehend/internal-server-exception}})))))
(clojure.spec.alpha/fdef describe-dominant-language-detection-job :args (clojure.spec.alpha/tuple :portkey.aws.comprehend/describe-dominant-language-detection-job-request) :ret (clojure.spec.alpha/and :portkey.aws.comprehend/describe-dominant-language-detection-job-response))

(clojure.core/defn describe-topics-detection-job "Gets the properties associated with a topic detection job. Use this operation to\nget the status of a detection job." ([describe-topics-detection-job-requestinput] (clojure.core/let [request-function-result__1411981__auto__ (req-describe-topics-detection-job-request describe-topics-detection-job-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__1411981__auto__ {:http.request.configuration/endpoints portkey.aws.comprehend/endpoints, :http.request.configuration/target-prefix "Comprehend_20171127", :http.request.spec/output-spec :portkey.aws.comprehend/describe-topics-detection-job-response, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2017-11-27", :http.request.configuration/service-id "Comprehend", :http.request.spec/input-spec :portkey.aws.comprehend/describe-topics-detection-job-request, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "DescribeTopicsDetectionJob", :http.request.configuration/output-deser-fn response-describe-topics-detection-job-response, :http.request.spec/error-spec {"InvalidRequestException" :portkey.aws.comprehend/invalid-request-exception, "JobNotFoundException" :portkey.aws.comprehend/job-not-found-exception, "TooManyRequestsException" :portkey.aws.comprehend/too-many-requests-exception, "InternalServerException" :portkey.aws.comprehend/internal-server-exception}})))))
(clojure.spec.alpha/fdef describe-topics-detection-job :args (clojure.spec.alpha/tuple :portkey.aws.comprehend/describe-topics-detection-job-request) :ret (clojure.spec.alpha/and :portkey.aws.comprehend/describe-topics-detection-job-response))

(clojure.core/defn detect-entities "Inspects text for named entities, and returns information about them. For more\ninformation, about named entities, see how-entities." ([detect-entities-requestinput] (clojure.core/let [request-function-result__1411981__auto__ (req-detect-entities-request detect-entities-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__1411981__auto__ {:http.request.configuration/endpoints portkey.aws.comprehend/endpoints, :http.request.configuration/target-prefix "Comprehend_20171127", :http.request.spec/output-spec :portkey.aws.comprehend/detect-entities-response, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2017-11-27", :http.request.configuration/service-id "Comprehend", :http.request.spec/input-spec :portkey.aws.comprehend/detect-entities-request, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "DetectEntities", :http.request.configuration/output-deser-fn response-detect-entities-response, :http.request.spec/error-spec {"InvalidRequestException" :portkey.aws.comprehend/invalid-request-exception, "TextSizeLimitExceededException" :portkey.aws.comprehend/text-size-limit-exceeded-exception, "UnsupportedLanguageException" :portkey.aws.comprehend/unsupported-language-exception, "InternalServerException" :portkey.aws.comprehend/internal-server-exception}})))))
(clojure.spec.alpha/fdef detect-entities :args (clojure.spec.alpha/tuple :portkey.aws.comprehend/detect-entities-request) :ret (clojure.spec.alpha/and :portkey.aws.comprehend/detect-entities-response))

(clojure.core/defn stop-dominant-language-detection-job "Stops a dominant language detection job in progress.\n If the job state is IN_PROGRESS the job is marked for termination and put into\nthe STOP_REQUESTED state. If the job completes before it can be stopped, it is\nput into the COMPLETED state; otherwise the job is stopped and put into the\nSTOPPED state.\n If the job is in the COMPLETED or FAILED state when you call the\nStopDominantLanguageDetectionJob operation, the operation returns a 400 Internal\nRequest Exception.\n When a job is stopped, any documents already processed are written to the\noutput location." ([stop-dominant-language-detection-job-requestinput] (clojure.core/let [request-function-result__1411981__auto__ (req-stop-dominant-language-detection-job-request stop-dominant-language-detection-job-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__1411981__auto__ {:http.request.configuration/endpoints portkey.aws.comprehend/endpoints, :http.request.configuration/target-prefix "Comprehend_20171127", :http.request.spec/output-spec :portkey.aws.comprehend/stop-dominant-language-detection-job-response, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2017-11-27", :http.request.configuration/service-id "Comprehend", :http.request.spec/input-spec :portkey.aws.comprehend/stop-dominant-language-detection-job-request, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "StopDominantLanguageDetectionJob", :http.request.configuration/output-deser-fn response-stop-dominant-language-detection-job-response, :http.request.spec/error-spec {"InvalidRequestException" :portkey.aws.comprehend/invalid-request-exception, "JobNotFoundException" :portkey.aws.comprehend/job-not-found-exception, "InternalServerException" :portkey.aws.comprehend/internal-server-exception}})))))
(clojure.spec.alpha/fdef stop-dominant-language-detection-job :args (clojure.spec.alpha/tuple :portkey.aws.comprehend/stop-dominant-language-detection-job-request) :ret (clojure.spec.alpha/and :portkey.aws.comprehend/stop-dominant-language-detection-job-response))

(clojure.core/defn delete-entity-recognizer "Deletes an entity recognizer.\n Only those recognizers that are in terminated states (IN_ERROR, TRAINED) will\nbe deleted. If an active inference job is using the model, a\nResourceInUseException will be returned.\n This is an asynchronous action that puts the recognizer into a DELETING state,\nand it is then removed by a background job. Once removed, the recognizer\ndisappears from your account and is no longer available for use." ([delete-entity-recognizer-requestinput] (clojure.core/let [request-function-result__1411981__auto__ (req-delete-entity-recognizer-request delete-entity-recognizer-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__1411981__auto__ {:http.request.configuration/endpoints portkey.aws.comprehend/endpoints, :http.request.configuration/target-prefix "Comprehend_20171127", :http.request.spec/output-spec :portkey.aws.comprehend/delete-entity-recognizer-response, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2017-11-27", :http.request.configuration/service-id "Comprehend", :http.request.spec/input-spec :portkey.aws.comprehend/delete-entity-recognizer-request, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "DeleteEntityRecognizer", :http.request.configuration/output-deser-fn response-delete-entity-recognizer-response, :http.request.spec/error-spec {"InvalidRequestException" :portkey.aws.comprehend/invalid-request-exception, "TooManyRequestsException" :portkey.aws.comprehend/too-many-requests-exception, "ResourceNotFoundException" :portkey.aws.comprehend/resource-not-found-exception, "ResourceUnavailableException" :portkey.aws.comprehend/resource-unavailable-exception, "ResourceInUseException" :portkey.aws.comprehend/resource-in-use-exception, "InternalServerException" :portkey.aws.comprehend/internal-server-exception}})))))
(clojure.spec.alpha/fdef delete-entity-recognizer :args (clojure.spec.alpha/tuple :portkey.aws.comprehend/delete-entity-recognizer-request) :ret (clojure.spec.alpha/and :portkey.aws.comprehend/delete-entity-recognizer-response))

(clojure.core/defn stop-training-document-classifier "Stops a document classifier training job while in progress.\n If the training job state is TRAINING, the job is marked for termination and\nput into the STOP_REQUESTED state. If the training job completes before it can\nbe stopped, it is put into the TRAINED; otherwise the training job is stopped\nand put into the STOPPED state and the service sends back an HTTP 200 response\nwith an empty HTTP body." ([stop-training-document-classifier-requestinput] (clojure.core/let [request-function-result__1411981__auto__ (req-stop-training-document-classifier-request stop-training-document-classifier-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__1411981__auto__ {:http.request.configuration/endpoints portkey.aws.comprehend/endpoints, :http.request.configuration/target-prefix "Comprehend_20171127", :http.request.spec/output-spec :portkey.aws.comprehend/stop-training-document-classifier-response, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2017-11-27", :http.request.configuration/service-id "Comprehend", :http.request.spec/input-spec :portkey.aws.comprehend/stop-training-document-classifier-request, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "StopTrainingDocumentClassifier", :http.request.configuration/output-deser-fn response-stop-training-document-classifier-response, :http.request.spec/error-spec {"InvalidRequestException" :portkey.aws.comprehend/invalid-request-exception, "TooManyRequestsException" :portkey.aws.comprehend/too-many-requests-exception, "ResourceNotFoundException" :portkey.aws.comprehend/resource-not-found-exception, "InternalServerException" :portkey.aws.comprehend/internal-server-exception}})))))
(clojure.spec.alpha/fdef stop-training-document-classifier :args (clojure.spec.alpha/tuple :portkey.aws.comprehend/stop-training-document-classifier-request) :ret (clojure.spec.alpha/and :portkey.aws.comprehend/stop-training-document-classifier-response))

(clojure.core/defn detect-sentiment "Inspects text and returns an inference of the prevailing sentiment (POSITIVE,\nNEUTRAL, MIXED, or NEGATIVE)." ([detect-sentiment-requestinput] (clojure.core/let [request-function-result__1411981__auto__ (req-detect-sentiment-request detect-sentiment-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__1411981__auto__ {:http.request.configuration/endpoints portkey.aws.comprehend/endpoints, :http.request.configuration/target-prefix "Comprehend_20171127", :http.request.spec/output-spec :portkey.aws.comprehend/detect-sentiment-response, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2017-11-27", :http.request.configuration/service-id "Comprehend", :http.request.spec/input-spec :portkey.aws.comprehend/detect-sentiment-request, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "DetectSentiment", :http.request.configuration/output-deser-fn response-detect-sentiment-response, :http.request.spec/error-spec {"InvalidRequestException" :portkey.aws.comprehend/invalid-request-exception, "TextSizeLimitExceededException" :portkey.aws.comprehend/text-size-limit-exceeded-exception, "UnsupportedLanguageException" :portkey.aws.comprehend/unsupported-language-exception, "InternalServerException" :portkey.aws.comprehend/internal-server-exception}})))))
(clojure.spec.alpha/fdef detect-sentiment :args (clojure.spec.alpha/tuple :portkey.aws.comprehend/detect-sentiment-request) :ret (clojure.spec.alpha/and :portkey.aws.comprehend/detect-sentiment-response))

(clojure.core/defn detect-dominant-language "Determines the dominant language of the input text. For a list of languages that\nAmazon Comprehend can detect, see Amazon Comprehend Supported Languages\n(http://docs.aws.amazon.com/comprehend/latest/dg/how-languages.html)." ([detect-dominant-language-requestinput] (clojure.core/let [request-function-result__1411981__auto__ (req-detect-dominant-language-request detect-dominant-language-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__1411981__auto__ {:http.request.configuration/endpoints portkey.aws.comprehend/endpoints, :http.request.configuration/target-prefix "Comprehend_20171127", :http.request.spec/output-spec :portkey.aws.comprehend/detect-dominant-language-response, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2017-11-27", :http.request.configuration/service-id "Comprehend", :http.request.spec/input-spec :portkey.aws.comprehend/detect-dominant-language-request, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "DetectDominantLanguage", :http.request.configuration/output-deser-fn response-detect-dominant-language-response, :http.request.spec/error-spec {"InvalidRequestException" :portkey.aws.comprehend/invalid-request-exception, "TextSizeLimitExceededException" :portkey.aws.comprehend/text-size-limit-exceeded-exception, "InternalServerException" :portkey.aws.comprehend/internal-server-exception}})))))
(clojure.spec.alpha/fdef detect-dominant-language :args (clojure.spec.alpha/tuple :portkey.aws.comprehend/detect-dominant-language-request) :ret (clojure.spec.alpha/and :portkey.aws.comprehend/detect-dominant-language-response))

(clojure.core/defn detect-syntax "Inspects text for syntax and the part of speech of words in the document. For\nmore information, how-syntax." ([detect-syntax-requestinput] (clojure.core/let [request-function-result__1411981__auto__ (req-detect-syntax-request detect-syntax-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__1411981__auto__ {:http.request.configuration/endpoints portkey.aws.comprehend/endpoints, :http.request.configuration/target-prefix "Comprehend_20171127", :http.request.spec/output-spec :portkey.aws.comprehend/detect-syntax-response, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2017-11-27", :http.request.configuration/service-id "Comprehend", :http.request.spec/input-spec :portkey.aws.comprehend/detect-syntax-request, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "DetectSyntax", :http.request.configuration/output-deser-fn response-detect-syntax-response, :http.request.spec/error-spec {"InvalidRequestException" :portkey.aws.comprehend/invalid-request-exception, "TextSizeLimitExceededException" :portkey.aws.comprehend/text-size-limit-exceeded-exception, "UnsupportedLanguageException" :portkey.aws.comprehend/unsupported-language-exception, "InternalServerException" :portkey.aws.comprehend/internal-server-exception}})))))
(clojure.spec.alpha/fdef detect-syntax :args (clojure.spec.alpha/tuple :portkey.aws.comprehend/detect-syntax-request) :ret (clojure.spec.alpha/and :portkey.aws.comprehend/detect-syntax-response))

(clojure.core/defn list-entity-recognizers "Gets a list of the properties of all entity recognizers that you created,\nincluding recognizers currently in training. Allows you to filter the list of\nrecognizers based on criteria such as status and submission time. This call\nreturns up to 500 entity recognizers in the list, with a default number of 100\nrecognizers in the list.\n The results of this list are not in any particular order. Please get the list\nand sort locally if needed." ([] (list-entity-recognizers {})) ([list-entity-recognizers-requestinput] (clojure.core/let [request-function-result__1411981__auto__ (req-list-entity-recognizers-request list-entity-recognizers-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__1411981__auto__ {:http.request.configuration/endpoints portkey.aws.comprehend/endpoints, :http.request.configuration/target-prefix "Comprehend_20171127", :http.request.spec/output-spec :portkey.aws.comprehend/list-entity-recognizers-response, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2017-11-27", :http.request.configuration/service-id "Comprehend", :http.request.spec/input-spec :portkey.aws.comprehend/list-entity-recognizers-request, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "ListEntityRecognizers", :http.request.configuration/output-deser-fn response-list-entity-recognizers-response, :http.request.spec/error-spec {"InvalidRequestException" :portkey.aws.comprehend/invalid-request-exception, "TooManyRequestsException" :portkey.aws.comprehend/too-many-requests-exception, "InvalidFilterException" :portkey.aws.comprehend/invalid-filter-exception, "InternalServerException" :portkey.aws.comprehend/internal-server-exception}})))))
(clojure.spec.alpha/fdef list-entity-recognizers :args (clojure.spec.alpha/? :portkey.aws.comprehend/list-entity-recognizers-request) :ret (clojure.spec.alpha/and :portkey.aws.comprehend/list-entity-recognizers-response))

(clojure.core/defn batch-detect-key-phrases "Detects the key noun phrases found in a batch of documents." ([batch-detect-key-phrases-requestinput] (clojure.core/let [request-function-result__1411981__auto__ (req-batch-detect-key-phrases-request batch-detect-key-phrases-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__1411981__auto__ {:http.request.configuration/endpoints portkey.aws.comprehend/endpoints, :http.request.configuration/target-prefix "Comprehend_20171127", :http.request.spec/output-spec :portkey.aws.comprehend/batch-detect-key-phrases-response, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2017-11-27", :http.request.configuration/service-id "Comprehend", :http.request.spec/input-spec :portkey.aws.comprehend/batch-detect-key-phrases-request, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "BatchDetectKeyPhrases", :http.request.configuration/output-deser-fn response-batch-detect-key-phrases-response, :http.request.spec/error-spec {"InvalidRequestException" :portkey.aws.comprehend/invalid-request-exception, "TextSizeLimitExceededException" :portkey.aws.comprehend/text-size-limit-exceeded-exception, "UnsupportedLanguageException" :portkey.aws.comprehend/unsupported-language-exception, "BatchSizeLimitExceededException" :portkey.aws.comprehend/batch-size-limit-exceeded-exception, "InternalServerException" :portkey.aws.comprehend/internal-server-exception}})))))
(clojure.spec.alpha/fdef batch-detect-key-phrases :args (clojure.spec.alpha/tuple :portkey.aws.comprehend/batch-detect-key-phrases-request) :ret (clojure.spec.alpha/and :portkey.aws.comprehend/batch-detect-key-phrases-response))

(clojure.core/defn describe-document-classification-job "Gets the properties associated with a document classification job. Use this\noperation to get the status of a classification job." ([describe-document-classification-job-requestinput] (clojure.core/let [request-function-result__1411981__auto__ (req-describe-document-classification-job-request describe-document-classification-job-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__1411981__auto__ {:http.request.configuration/endpoints portkey.aws.comprehend/endpoints, :http.request.configuration/target-prefix "Comprehend_20171127", :http.request.spec/output-spec :portkey.aws.comprehend/describe-document-classification-job-response, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2017-11-27", :http.request.configuration/service-id "Comprehend", :http.request.spec/input-spec :portkey.aws.comprehend/describe-document-classification-job-request, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "DescribeDocumentClassificationJob", :http.request.configuration/output-deser-fn response-describe-document-classification-job-response, :http.request.spec/error-spec {"InvalidRequestException" :portkey.aws.comprehend/invalid-request-exception, "TooManyRequestsException" :portkey.aws.comprehend/too-many-requests-exception, "JobNotFoundException" :portkey.aws.comprehend/job-not-found-exception, "InternalServerException" :portkey.aws.comprehend/internal-server-exception}})))))
(clojure.spec.alpha/fdef describe-document-classification-job :args (clojure.spec.alpha/tuple :portkey.aws.comprehend/describe-document-classification-job-request) :ret (clojure.spec.alpha/and :portkey.aws.comprehend/describe-document-classification-job-response))

(clojure.core/defn start-document-classification-job "Starts an asynchronous document classification job. Use the operation to track\nthe progress of the job." ([start-document-classification-job-requestinput] (clojure.core/let [request-function-result__1411981__auto__ (req-start-document-classification-job-request start-document-classification-job-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__1411981__auto__ {:http.request.configuration/endpoints portkey.aws.comprehend/endpoints, :http.request.configuration/target-prefix "Comprehend_20171127", :http.request.spec/output-spec :portkey.aws.comprehend/start-document-classification-job-response, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2017-11-27", :http.request.configuration/service-id "Comprehend", :http.request.spec/input-spec :portkey.aws.comprehend/start-document-classification-job-request, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "StartDocumentClassificationJob", :http.request.configuration/output-deser-fn response-start-document-classification-job-response, :http.request.spec/error-spec {"InvalidRequestException" :portkey.aws.comprehend/invalid-request-exception, "TooManyRequestsException" :portkey.aws.comprehend/too-many-requests-exception, "ResourceNotFoundException" :portkey.aws.comprehend/resource-not-found-exception, "ResourceUnavailableException" :portkey.aws.comprehend/resource-unavailable-exception, "InternalServerException" :portkey.aws.comprehend/internal-server-exception}})))))
(clojure.spec.alpha/fdef start-document-classification-job :args (clojure.spec.alpha/tuple :portkey.aws.comprehend/start-document-classification-job-request) :ret (clojure.spec.alpha/and :portkey.aws.comprehend/start-document-classification-job-response))

(clojure.core/defn start-dominant-language-detection-job "Starts an asynchronous dominant language detection job for a collection of\ndocuments. Use the operation to track the status of a job." ([start-dominant-language-detection-job-requestinput] (clojure.core/let [request-function-result__1411981__auto__ (req-start-dominant-language-detection-job-request start-dominant-language-detection-job-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__1411981__auto__ {:http.request.configuration/endpoints portkey.aws.comprehend/endpoints, :http.request.configuration/target-prefix "Comprehend_20171127", :http.request.spec/output-spec :portkey.aws.comprehend/start-dominant-language-detection-job-response, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2017-11-27", :http.request.configuration/service-id "Comprehend", :http.request.spec/input-spec :portkey.aws.comprehend/start-dominant-language-detection-job-request, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "StartDominantLanguageDetectionJob", :http.request.configuration/output-deser-fn response-start-dominant-language-detection-job-response, :http.request.spec/error-spec {"InvalidRequestException" :portkey.aws.comprehend/invalid-request-exception, "TooManyRequestsException" :portkey.aws.comprehend/too-many-requests-exception, "InternalServerException" :portkey.aws.comprehend/internal-server-exception}})))))
(clojure.spec.alpha/fdef start-dominant-language-detection-job :args (clojure.spec.alpha/tuple :portkey.aws.comprehend/start-dominant-language-detection-job-request) :ret (clojure.spec.alpha/and :portkey.aws.comprehend/start-dominant-language-detection-job-response))

(clojure.core/defn list-document-classifiers "Gets a list of the document classifiers that you have created." ([] (list-document-classifiers {})) ([list-document-classifiers-requestinput] (clojure.core/let [request-function-result__1411981__auto__ (req-list-document-classifiers-request list-document-classifiers-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__1411981__auto__ {:http.request.configuration/endpoints portkey.aws.comprehend/endpoints, :http.request.configuration/target-prefix "Comprehend_20171127", :http.request.spec/output-spec :portkey.aws.comprehend/list-document-classifiers-response, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2017-11-27", :http.request.configuration/service-id "Comprehend", :http.request.spec/input-spec :portkey.aws.comprehend/list-document-classifiers-request, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "ListDocumentClassifiers", :http.request.configuration/output-deser-fn response-list-document-classifiers-response, :http.request.spec/error-spec {"InvalidRequestException" :portkey.aws.comprehend/invalid-request-exception, "TooManyRequestsException" :portkey.aws.comprehend/too-many-requests-exception, "InvalidFilterException" :portkey.aws.comprehend/invalid-filter-exception, "InternalServerException" :portkey.aws.comprehend/internal-server-exception}})))))
(clojure.spec.alpha/fdef list-document-classifiers :args (clojure.spec.alpha/? :portkey.aws.comprehend/list-document-classifiers-request) :ret (clojure.spec.alpha/and :portkey.aws.comprehend/list-document-classifiers-response))

(clojure.core/defn batch-detect-sentiment "Inspects a batch of documents and returns an inference of the prevailing\nsentiment, POSITIVE, NEUTRAL, MIXED, or NEGATIVE, in each one." ([batch-detect-sentiment-requestinput] (clojure.core/let [request-function-result__1411981__auto__ (req-batch-detect-sentiment-request batch-detect-sentiment-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__1411981__auto__ {:http.request.configuration/endpoints portkey.aws.comprehend/endpoints, :http.request.configuration/target-prefix "Comprehend_20171127", :http.request.spec/output-spec :portkey.aws.comprehend/batch-detect-sentiment-response, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2017-11-27", :http.request.configuration/service-id "Comprehend", :http.request.spec/input-spec :portkey.aws.comprehend/batch-detect-sentiment-request, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "BatchDetectSentiment", :http.request.configuration/output-deser-fn response-batch-detect-sentiment-response, :http.request.spec/error-spec {"InvalidRequestException" :portkey.aws.comprehend/invalid-request-exception, "TextSizeLimitExceededException" :portkey.aws.comprehend/text-size-limit-exceeded-exception, "UnsupportedLanguageException" :portkey.aws.comprehend/unsupported-language-exception, "BatchSizeLimitExceededException" :portkey.aws.comprehend/batch-size-limit-exceeded-exception, "InternalServerException" :portkey.aws.comprehend/internal-server-exception}})))))
(clojure.spec.alpha/fdef batch-detect-sentiment :args (clojure.spec.alpha/tuple :portkey.aws.comprehend/batch-detect-sentiment-request) :ret (clojure.spec.alpha/and :portkey.aws.comprehend/batch-detect-sentiment-response))

(clojure.core/defn start-sentiment-detection-job "Starts an asynchronous sentiment detection job for a collection of documents.\nuse the operation to track the status of a job." ([start-sentiment-detection-job-requestinput] (clojure.core/let [request-function-result__1411981__auto__ (req-start-sentiment-detection-job-request start-sentiment-detection-job-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__1411981__auto__ {:http.request.configuration/endpoints portkey.aws.comprehend/endpoints, :http.request.configuration/target-prefix "Comprehend_20171127", :http.request.spec/output-spec :portkey.aws.comprehend/start-sentiment-detection-job-response, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2017-11-27", :http.request.configuration/service-id "Comprehend", :http.request.spec/input-spec :portkey.aws.comprehend/start-sentiment-detection-job-request, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "StartSentimentDetectionJob", :http.request.configuration/output-deser-fn response-start-sentiment-detection-job-response, :http.request.spec/error-spec {"InvalidRequestException" :portkey.aws.comprehend/invalid-request-exception, "TooManyRequestsException" :portkey.aws.comprehend/too-many-requests-exception, "InternalServerException" :portkey.aws.comprehend/internal-server-exception}})))))
(clojure.spec.alpha/fdef start-sentiment-detection-job :args (clojure.spec.alpha/tuple :portkey.aws.comprehend/start-sentiment-detection-job-request) :ret (clojure.spec.alpha/and :portkey.aws.comprehend/start-sentiment-detection-job-response))

(clojure.core/defn describe-document-classifier "Gets the properties associated with a document classifier." ([describe-document-classifier-requestinput] (clojure.core/let [request-function-result__1411981__auto__ (req-describe-document-classifier-request describe-document-classifier-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__1411981__auto__ {:http.request.configuration/endpoints portkey.aws.comprehend/endpoints, :http.request.configuration/target-prefix "Comprehend_20171127", :http.request.spec/output-spec :portkey.aws.comprehend/describe-document-classifier-response, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2017-11-27", :http.request.configuration/service-id "Comprehend", :http.request.spec/input-spec :portkey.aws.comprehend/describe-document-classifier-request, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "DescribeDocumentClassifier", :http.request.configuration/output-deser-fn response-describe-document-classifier-response, :http.request.spec/error-spec {"InvalidRequestException" :portkey.aws.comprehend/invalid-request-exception, "TooManyRequestsException" :portkey.aws.comprehend/too-many-requests-exception, "ResourceNotFoundException" :portkey.aws.comprehend/resource-not-found-exception, "InternalServerException" :portkey.aws.comprehend/internal-server-exception}})))))
(clojure.spec.alpha/fdef describe-document-classifier :args (clojure.spec.alpha/tuple :portkey.aws.comprehend/describe-document-classifier-request) :ret (clojure.spec.alpha/and :portkey.aws.comprehend/describe-document-classifier-response))

(clojure.core/defn describe-entity-recognizer "Provides details about an entity recognizer including status, S3 buckets\ncontaining training data, recognizer metadata, metrics, and so on." ([describe-entity-recognizer-requestinput] (clojure.core/let [request-function-result__1411981__auto__ (req-describe-entity-recognizer-request describe-entity-recognizer-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__1411981__auto__ {:http.request.configuration/endpoints portkey.aws.comprehend/endpoints, :http.request.configuration/target-prefix "Comprehend_20171127", :http.request.spec/output-spec :portkey.aws.comprehend/describe-entity-recognizer-response, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2017-11-27", :http.request.configuration/service-id "Comprehend", :http.request.spec/input-spec :portkey.aws.comprehend/describe-entity-recognizer-request, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "DescribeEntityRecognizer", :http.request.configuration/output-deser-fn response-describe-entity-recognizer-response, :http.request.spec/error-spec {"InvalidRequestException" :portkey.aws.comprehend/invalid-request-exception, "TooManyRequestsException" :portkey.aws.comprehend/too-many-requests-exception, "ResourceNotFoundException" :portkey.aws.comprehend/resource-not-found-exception, "InternalServerException" :portkey.aws.comprehend/internal-server-exception}})))))
(clojure.spec.alpha/fdef describe-entity-recognizer :args (clojure.spec.alpha/tuple :portkey.aws.comprehend/describe-entity-recognizer-request) :ret (clojure.spec.alpha/and :portkey.aws.comprehend/describe-entity-recognizer-response))

(clojure.core/defn stop-sentiment-detection-job "Stops a sentiment detection job in progress.\n If the job state is IN_PROGRESS the job is marked for termination and put into\nthe STOP_REQUESTED state. If the job completes before it can be stopped, it is\nput into the COMPLETED state; otherwise the job is be stopped and put into the\nSTOPPED state.\n If the job is in the COMPLETED or FAILED state when you call the\nStopDominantLanguageDetectionJob operation, the operation returns a 400 Internal\nRequest Exception.\n When a job is stopped, any documents already processed are written to the\noutput location." ([stop-sentiment-detection-job-requestinput] (clojure.core/let [request-function-result__1411981__auto__ (req-stop-sentiment-detection-job-request stop-sentiment-detection-job-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__1411981__auto__ {:http.request.configuration/endpoints portkey.aws.comprehend/endpoints, :http.request.configuration/target-prefix "Comprehend_20171127", :http.request.spec/output-spec :portkey.aws.comprehend/stop-sentiment-detection-job-response, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2017-11-27", :http.request.configuration/service-id "Comprehend", :http.request.spec/input-spec :portkey.aws.comprehend/stop-sentiment-detection-job-request, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "StopSentimentDetectionJob", :http.request.configuration/output-deser-fn response-stop-sentiment-detection-job-response, :http.request.spec/error-spec {"InvalidRequestException" :portkey.aws.comprehend/invalid-request-exception, "JobNotFoundException" :portkey.aws.comprehend/job-not-found-exception, "InternalServerException" :portkey.aws.comprehend/internal-server-exception}})))))
(clojure.spec.alpha/fdef stop-sentiment-detection-job :args (clojure.spec.alpha/tuple :portkey.aws.comprehend/stop-sentiment-detection-job-request) :ret (clojure.spec.alpha/and :portkey.aws.comprehend/stop-sentiment-detection-job-response))

(clojure.core/defn list-document-classification-jobs "Gets a list of the documentation classification jobs that you have submitted." ([] (list-document-classification-jobs {})) ([list-document-classification-jobs-requestinput] (clojure.core/let [request-function-result__1411981__auto__ (req-list-document-classification-jobs-request list-document-classification-jobs-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__1411981__auto__ {:http.request.configuration/endpoints portkey.aws.comprehend/endpoints, :http.request.configuration/target-prefix "Comprehend_20171127", :http.request.spec/output-spec :portkey.aws.comprehend/list-document-classification-jobs-response, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2017-11-27", :http.request.configuration/service-id "Comprehend", :http.request.spec/input-spec :portkey.aws.comprehend/list-document-classification-jobs-request, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "ListDocumentClassificationJobs", :http.request.configuration/output-deser-fn response-list-document-classification-jobs-response, :http.request.spec/error-spec {"InvalidRequestException" :portkey.aws.comprehend/invalid-request-exception, "TooManyRequestsException" :portkey.aws.comprehend/too-many-requests-exception, "InvalidFilterException" :portkey.aws.comprehend/invalid-filter-exception, "InternalServerException" :portkey.aws.comprehend/internal-server-exception}})))))
(clojure.spec.alpha/fdef list-document-classification-jobs :args (clojure.spec.alpha/? :portkey.aws.comprehend/list-document-classification-jobs-request) :ret (clojure.spec.alpha/and :portkey.aws.comprehend/list-document-classification-jobs-response))

(clojure.core/defn list-entities-detection-jobs "Gets a list of the entity detection jobs that you have submitted." ([] (list-entities-detection-jobs {})) ([list-entities-detection-jobs-requestinput] (clojure.core/let [request-function-result__1411981__auto__ (req-list-entities-detection-jobs-request list-entities-detection-jobs-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__1411981__auto__ {:http.request.configuration/endpoints portkey.aws.comprehend/endpoints, :http.request.configuration/target-prefix "Comprehend_20171127", :http.request.spec/output-spec :portkey.aws.comprehend/list-entities-detection-jobs-response, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2017-11-27", :http.request.configuration/service-id "Comprehend", :http.request.spec/input-spec :portkey.aws.comprehend/list-entities-detection-jobs-request, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "ListEntitiesDetectionJobs", :http.request.configuration/output-deser-fn response-list-entities-detection-jobs-response, :http.request.spec/error-spec {"InvalidRequestException" :portkey.aws.comprehend/invalid-request-exception, "TooManyRequestsException" :portkey.aws.comprehend/too-many-requests-exception, "InvalidFilterException" :portkey.aws.comprehend/invalid-filter-exception, "InternalServerException" :portkey.aws.comprehend/internal-server-exception}})))))
(clojure.spec.alpha/fdef list-entities-detection-jobs :args (clojure.spec.alpha/? :portkey.aws.comprehend/list-entities-detection-jobs-request) :ret (clojure.spec.alpha/and :portkey.aws.comprehend/list-entities-detection-jobs-response))

(clojure.core/defn detect-key-phrases "Detects the key noun phrases found in the text." ([detect-key-phrases-requestinput] (clojure.core/let [request-function-result__1411981__auto__ (req-detect-key-phrases-request detect-key-phrases-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__1411981__auto__ {:http.request.configuration/endpoints portkey.aws.comprehend/endpoints, :http.request.configuration/target-prefix "Comprehend_20171127", :http.request.spec/output-spec :portkey.aws.comprehend/detect-key-phrases-response, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2017-11-27", :http.request.configuration/service-id "Comprehend", :http.request.spec/input-spec :portkey.aws.comprehend/detect-key-phrases-request, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "DetectKeyPhrases", :http.request.configuration/output-deser-fn response-detect-key-phrases-response, :http.request.spec/error-spec {"InvalidRequestException" :portkey.aws.comprehend/invalid-request-exception, "TextSizeLimitExceededException" :portkey.aws.comprehend/text-size-limit-exceeded-exception, "UnsupportedLanguageException" :portkey.aws.comprehend/unsupported-language-exception, "InternalServerException" :portkey.aws.comprehend/internal-server-exception}})))))
(clojure.spec.alpha/fdef detect-key-phrases :args (clojure.spec.alpha/tuple :portkey.aws.comprehend/detect-key-phrases-request) :ret (clojure.spec.alpha/and :portkey.aws.comprehend/detect-key-phrases-response))

(clojure.core/defn batch-detect-dominant-language "Determines the dominant language of the input text for a batch of documents. For\na list of languages that Amazon Comprehend can detect, see Amazon Comprehend\nSupported Languages\n(http://docs.aws.amazon.com/comprehend/latest/dg/how-languages.html)." ([batch-detect-dominant-language-requestinput] (clojure.core/let [request-function-result__1411981__auto__ (req-batch-detect-dominant-language-request batch-detect-dominant-language-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__1411981__auto__ {:http.request.configuration/endpoints portkey.aws.comprehend/endpoints, :http.request.configuration/target-prefix "Comprehend_20171127", :http.request.spec/output-spec :portkey.aws.comprehend/batch-detect-dominant-language-response, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2017-11-27", :http.request.configuration/service-id "Comprehend", :http.request.spec/input-spec :portkey.aws.comprehend/batch-detect-dominant-language-request, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "BatchDetectDominantLanguage", :http.request.configuration/output-deser-fn response-batch-detect-dominant-language-response, :http.request.spec/error-spec {"InvalidRequestException" :portkey.aws.comprehend/invalid-request-exception, "TextSizeLimitExceededException" :portkey.aws.comprehend/text-size-limit-exceeded-exception, "BatchSizeLimitExceededException" :portkey.aws.comprehend/batch-size-limit-exceeded-exception, "InternalServerException" :portkey.aws.comprehend/internal-server-exception}})))))
(clojure.spec.alpha/fdef batch-detect-dominant-language :args (clojure.spec.alpha/tuple :portkey.aws.comprehend/batch-detect-dominant-language-request) :ret (clojure.spec.alpha/and :portkey.aws.comprehend/batch-detect-dominant-language-response))

(clojure.core/defn batch-detect-entities "Inspects the text of a batch of documents for named entities and returns\ninformation about them. For more information about named entities, see\nhow-entities" ([batch-detect-entities-requestinput] (clojure.core/let [request-function-result__1411981__auto__ (req-batch-detect-entities-request batch-detect-entities-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__1411981__auto__ {:http.request.configuration/endpoints portkey.aws.comprehend/endpoints, :http.request.configuration/target-prefix "Comprehend_20171127", :http.request.spec/output-spec :portkey.aws.comprehend/batch-detect-entities-response, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2017-11-27", :http.request.configuration/service-id "Comprehend", :http.request.spec/input-spec :portkey.aws.comprehend/batch-detect-entities-request, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "BatchDetectEntities", :http.request.configuration/output-deser-fn response-batch-detect-entities-response, :http.request.spec/error-spec {"InvalidRequestException" :portkey.aws.comprehend/invalid-request-exception, "TextSizeLimitExceededException" :portkey.aws.comprehend/text-size-limit-exceeded-exception, "UnsupportedLanguageException" :portkey.aws.comprehend/unsupported-language-exception, "BatchSizeLimitExceededException" :portkey.aws.comprehend/batch-size-limit-exceeded-exception, "InternalServerException" :portkey.aws.comprehend/internal-server-exception}})))))
(clojure.spec.alpha/fdef batch-detect-entities :args (clojure.spec.alpha/tuple :portkey.aws.comprehend/batch-detect-entities-request) :ret (clojure.spec.alpha/and :portkey.aws.comprehend/batch-detect-entities-response))

(clojure.core/defn list-key-phrases-detection-jobs "Get a list of key phrase detection jobs that you have submitted." ([] (list-key-phrases-detection-jobs {})) ([list-key-phrases-detection-jobs-requestinput] (clojure.core/let [request-function-result__1411981__auto__ (req-list-key-phrases-detection-jobs-request list-key-phrases-detection-jobs-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__1411981__auto__ {:http.request.configuration/endpoints portkey.aws.comprehend/endpoints, :http.request.configuration/target-prefix "Comprehend_20171127", :http.request.spec/output-spec :portkey.aws.comprehend/list-key-phrases-detection-jobs-response, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2017-11-27", :http.request.configuration/service-id "Comprehend", :http.request.spec/input-spec :portkey.aws.comprehend/list-key-phrases-detection-jobs-request, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "ListKeyPhrasesDetectionJobs", :http.request.configuration/output-deser-fn response-list-key-phrases-detection-jobs-response, :http.request.spec/error-spec {"InvalidRequestException" :portkey.aws.comprehend/invalid-request-exception, "TooManyRequestsException" :portkey.aws.comprehend/too-many-requests-exception, "InvalidFilterException" :portkey.aws.comprehend/invalid-filter-exception, "InternalServerException" :portkey.aws.comprehend/internal-server-exception}})))))
(clojure.spec.alpha/fdef list-key-phrases-detection-jobs :args (clojure.spec.alpha/? :portkey.aws.comprehend/list-key-phrases-detection-jobs-request) :ret (clojure.spec.alpha/and :portkey.aws.comprehend/list-key-phrases-detection-jobs-response))

(clojure.core/defn start-entities-detection-job "Starts an asynchronous entity detection job for a collection of documents. Use\nthe operation to track the status of a job.\n This API can be used for either standard entity detection or custom entity\nrecognition. In order to be used for custom entity recognition, the optional\nEntityRecognizerArn must be used in order to provide access to the recognizer\nbeing used to detect the custom entity." ([start-entities-detection-job-requestinput] (clojure.core/let [request-function-result__1411981__auto__ (req-start-entities-detection-job-request start-entities-detection-job-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__1411981__auto__ {:http.request.configuration/endpoints portkey.aws.comprehend/endpoints, :http.request.configuration/target-prefix "Comprehend_20171127", :http.request.spec/output-spec :portkey.aws.comprehend/start-entities-detection-job-response, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2017-11-27", :http.request.configuration/service-id "Comprehend", :http.request.spec/input-spec :portkey.aws.comprehend/start-entities-detection-job-request, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "StartEntitiesDetectionJob", :http.request.configuration/output-deser-fn response-start-entities-detection-job-response, :http.request.spec/error-spec {"InvalidRequestException" :portkey.aws.comprehend/invalid-request-exception, "TooManyRequestsException" :portkey.aws.comprehend/too-many-requests-exception, "ResourceNotFoundException" :portkey.aws.comprehend/resource-not-found-exception, "ResourceUnavailableException" :portkey.aws.comprehend/resource-unavailable-exception, "InternalServerException" :portkey.aws.comprehend/internal-server-exception}})))))
(clojure.spec.alpha/fdef start-entities-detection-job :args (clojure.spec.alpha/tuple :portkey.aws.comprehend/start-entities-detection-job-request) :ret (clojure.spec.alpha/and :portkey.aws.comprehend/start-entities-detection-job-response))

(clojure.core/defn stop-training-entity-recognizer "Stops an entity recognizer training job while in progress.\n If the training job state is TRAINING, the job is marked for termination and\nput into the STOP_REQUESTED state. If the training job completes before it can\nbe stopped, it is put into the TRAINED; otherwise the training job is stopped\nand putted into the STOPPED state and the service sends back an HTTP 200\nresponse with an empty HTTP body." ([stop-training-entity-recognizer-requestinput] (clojure.core/let [request-function-result__1411981__auto__ (req-stop-training-entity-recognizer-request stop-training-entity-recognizer-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__1411981__auto__ {:http.request.configuration/endpoints portkey.aws.comprehend/endpoints, :http.request.configuration/target-prefix "Comprehend_20171127", :http.request.spec/output-spec :portkey.aws.comprehend/stop-training-entity-recognizer-response, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2017-11-27", :http.request.configuration/service-id "Comprehend", :http.request.spec/input-spec :portkey.aws.comprehend/stop-training-entity-recognizer-request, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "StopTrainingEntityRecognizer", :http.request.configuration/output-deser-fn response-stop-training-entity-recognizer-response, :http.request.spec/error-spec {"InvalidRequestException" :portkey.aws.comprehend/invalid-request-exception, "TooManyRequestsException" :portkey.aws.comprehend/too-many-requests-exception, "ResourceNotFoundException" :portkey.aws.comprehend/resource-not-found-exception, "InternalServerException" :portkey.aws.comprehend/internal-server-exception}})))))
(clojure.spec.alpha/fdef stop-training-entity-recognizer :args (clojure.spec.alpha/tuple :portkey.aws.comprehend/stop-training-entity-recognizer-request) :ret (clojure.spec.alpha/and :portkey.aws.comprehend/stop-training-entity-recognizer-response))

(clojure.core/defn start-topics-detection-job "Starts an asynchronous topic detection job. Use the DescribeTopicDetectionJob\noperation to track the status of a job." ([start-topics-detection-job-requestinput] (clojure.core/let [request-function-result__1411981__auto__ (req-start-topics-detection-job-request start-topics-detection-job-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__1411981__auto__ {:http.request.configuration/endpoints portkey.aws.comprehend/endpoints, :http.request.configuration/target-prefix "Comprehend_20171127", :http.request.spec/output-spec :portkey.aws.comprehend/start-topics-detection-job-response, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2017-11-27", :http.request.configuration/service-id "Comprehend", :http.request.spec/input-spec :portkey.aws.comprehend/start-topics-detection-job-request, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "StartTopicsDetectionJob", :http.request.configuration/output-deser-fn response-start-topics-detection-job-response, :http.request.spec/error-spec {"InvalidRequestException" :portkey.aws.comprehend/invalid-request-exception, "TooManyRequestsException" :portkey.aws.comprehend/too-many-requests-exception, "InternalServerException" :portkey.aws.comprehend/internal-server-exception}})))))
(clojure.spec.alpha/fdef start-topics-detection-job :args (clojure.spec.alpha/tuple :portkey.aws.comprehend/start-topics-detection-job-request) :ret (clojure.spec.alpha/and :portkey.aws.comprehend/start-topics-detection-job-response))

(clojure.core/defn create-entity-recognizer "Creates an entity recognizer using submitted files. After your\nCreateEntityRecognizer request is submitted, you can check job status using the\nAPI." ([create-entity-recognizer-requestinput] (clojure.core/let [request-function-result__1411981__auto__ (req-create-entity-recognizer-request create-entity-recognizer-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__1411981__auto__ {:http.request.configuration/endpoints portkey.aws.comprehend/endpoints, :http.request.configuration/target-prefix "Comprehend_20171127", :http.request.spec/output-spec :portkey.aws.comprehend/create-entity-recognizer-response, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2017-11-27", :http.request.configuration/service-id "Comprehend", :http.request.spec/input-spec :portkey.aws.comprehend/create-entity-recognizer-request, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "CreateEntityRecognizer", :http.request.configuration/output-deser-fn response-create-entity-recognizer-response, :http.request.spec/error-spec {"InvalidRequestException" :portkey.aws.comprehend/invalid-request-exception, "ResourceInUseException" :portkey.aws.comprehend/resource-in-use-exception, "TooManyRequestsException" :portkey.aws.comprehend/too-many-requests-exception, "ResourceLimitExceededException" :portkey.aws.comprehend/resource-limit-exceeded-exception, "UnsupportedLanguageException" :portkey.aws.comprehend/unsupported-language-exception, "InternalServerException" :portkey.aws.comprehend/internal-server-exception}})))))
(clojure.spec.alpha/fdef create-entity-recognizer :args (clojure.spec.alpha/tuple :portkey.aws.comprehend/create-entity-recognizer-request) :ret (clojure.spec.alpha/and :portkey.aws.comprehend/create-entity-recognizer-response))
