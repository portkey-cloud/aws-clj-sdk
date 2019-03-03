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

(clojure.core/declare ser-output-data-config)

(clojure.core/declare ser-job-status)

(clojure.core/declare ser-job-name)

(clojure.core/declare ser-s-3-uri)

(clojure.core/declare ser-topics-detection-job-filter)

(clojure.core/declare ser-iam-role-arn)

(clojure.core/declare ser-entities-detection-job-filter)

(clojure.core/declare ser-language-code)

(clojure.core/declare ser-dominant-language-detection-job-filter)

(clojure.core/declare ser-string)

(clojure.core/declare ser-number-of-topics-integer)

(clojure.core/declare ser-syntax-language-code)

(clojure.core/declare ser-client-request-token-string)

(clojure.core/declare ser-key-phrases-detection-job-filter)

(clojure.core/declare ser-sentiment-detection-job-filter)

(clojure.core/declare ser-timestamp)

(clojure.core/declare ser-max-results-integer)

(clojure.core/declare ser-input-format)

(clojure.core/declare ser-job-id)

(clojure.core/defn- ser-input-data-config [input] (clojure.core/cond-> #:http.request.field{:value [(clojure.core/into (ser-s-3-uri (:s-3-uri input)) #:http.request.field{:name "S3Uri", :shape "S3Uri"})], :shape "InputDataConfig", :type "structure"} (clojure.core/contains? input :input-format) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-input-format (input :input-format)) #:http.request.field{:name "InputFormat", :shape "InputFormat"}))))

(clojure.core/defn- ser-string-list [input] #:http.request.field{:value (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (clojure.core/merge (ser-string coll) #:http.request.field{:shape "String"}))) input), :shape "StringList", :type "list"})

(clojure.core/defn- ser-output-data-config [input] (clojure.core/cond-> #:http.request.field{:value [(clojure.core/into (ser-s-3-uri (:s-3-uri input)) #:http.request.field{:name "S3Uri", :shape "S3Uri"})], :shape "OutputDataConfig", :type "structure"}))

(clojure.core/defn- ser-job-status [input] #:http.request.field{:value (clojure.core/get {"COMPLETED" "COMPLETED", "IN_PROGRESS" "IN_PROGRESS", :in-progress "IN_PROGRESS", :stop-requested "STOP_REQUESTED", :completed "COMPLETED", "STOP_REQUESTED" "STOP_REQUESTED", :submitted "SUBMITTED", "SUBMITTED" "SUBMITTED", :stopped "STOPPED", "STOPPED" "STOPPED", "FAILED" "FAILED", :failed "FAILED"} input), :shape "JobStatus"})

(clojure.core/defn- ser-job-name [input] #:http.request.field{:value input, :shape "JobName"})

(clojure.core/defn- ser-s-3-uri [input] #:http.request.field{:value input, :shape "S3Uri"})

(clojure.core/defn- ser-topics-detection-job-filter [input] (clojure.core/cond-> #:http.request.field{:value [], :shape "TopicsDetectionJobFilter", :type "structure"} (clojure.core/contains? input :job-name) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-job-name (input :job-name)) #:http.request.field{:name "JobName", :shape "JobName"})) (clojure.core/contains? input :job-status) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-job-status (input :job-status)) #:http.request.field{:name "JobStatus", :shape "JobStatus"})) (clojure.core/contains? input :submit-time-before) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-timestamp (input :submit-time-before)) #:http.request.field{:name "SubmitTimeBefore", :shape "Timestamp"})) (clojure.core/contains? input :submit-time-after) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-timestamp (input :submit-time-after)) #:http.request.field{:name "SubmitTimeAfter", :shape "Timestamp"}))))

(clojure.core/defn- ser-iam-role-arn [input] #:http.request.field{:value input, :shape "IamRoleArn"})

(clojure.core/defn- ser-entities-detection-job-filter [input] (clojure.core/cond-> #:http.request.field{:value [], :shape "EntitiesDetectionJobFilter", :type "structure"} (clojure.core/contains? input :job-name) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-job-name (input :job-name)) #:http.request.field{:name "JobName", :shape "JobName"})) (clojure.core/contains? input :job-status) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-job-status (input :job-status)) #:http.request.field{:name "JobStatus", :shape "JobStatus"})) (clojure.core/contains? input :submit-time-before) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-timestamp (input :submit-time-before)) #:http.request.field{:name "SubmitTimeBefore", :shape "Timestamp"})) (clojure.core/contains? input :submit-time-after) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-timestamp (input :submit-time-after)) #:http.request.field{:name "SubmitTimeAfter", :shape "Timestamp"}))))

(clojure.core/defn- ser-language-code [input] #:http.request.field{:value (clojure.core/get {"en" "en", :en "en", "es" "es", :es "es"} input), :shape "LanguageCode"})

(clojure.core/defn- ser-dominant-language-detection-job-filter [input] (clojure.core/cond-> #:http.request.field{:value [], :shape "DominantLanguageDetectionJobFilter", :type "structure"} (clojure.core/contains? input :job-name) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-job-name (input :job-name)) #:http.request.field{:name "JobName", :shape "JobName"})) (clojure.core/contains? input :job-status) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-job-status (input :job-status)) #:http.request.field{:name "JobStatus", :shape "JobStatus"})) (clojure.core/contains? input :submit-time-before) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-timestamp (input :submit-time-before)) #:http.request.field{:name "SubmitTimeBefore", :shape "Timestamp"})) (clojure.core/contains? input :submit-time-after) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-timestamp (input :submit-time-after)) #:http.request.field{:name "SubmitTimeAfter", :shape "Timestamp"}))))

(clojure.core/defn- ser-string [input] #:http.request.field{:value input, :shape "String"})

(clojure.core/defn- ser-number-of-topics-integer [input] #:http.request.field{:value input, :shape "NumberOfTopicsInteger"})

(clojure.core/defn- ser-syntax-language-code [input] #:http.request.field{:value (clojure.core/get {"en" "en", :en "en"} input), :shape "SyntaxLanguageCode"})

(clojure.core/defn- ser-client-request-token-string [input] #:http.request.field{:value input, :shape "ClientRequestTokenString"})

(clojure.core/defn- ser-key-phrases-detection-job-filter [input] (clojure.core/cond-> #:http.request.field{:value [], :shape "KeyPhrasesDetectionJobFilter", :type "structure"} (clojure.core/contains? input :job-name) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-job-name (input :job-name)) #:http.request.field{:name "JobName", :shape "JobName"})) (clojure.core/contains? input :job-status) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-job-status (input :job-status)) #:http.request.field{:name "JobStatus", :shape "JobStatus"})) (clojure.core/contains? input :submit-time-before) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-timestamp (input :submit-time-before)) #:http.request.field{:name "SubmitTimeBefore", :shape "Timestamp"})) (clojure.core/contains? input :submit-time-after) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-timestamp (input :submit-time-after)) #:http.request.field{:name "SubmitTimeAfter", :shape "Timestamp"}))))

(clojure.core/defn- ser-sentiment-detection-job-filter [input] (clojure.core/cond-> #:http.request.field{:value [], :shape "SentimentDetectionJobFilter", :type "structure"} (clojure.core/contains? input :job-name) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-job-name (input :job-name)) #:http.request.field{:name "JobName", :shape "JobName"})) (clojure.core/contains? input :job-status) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-job-status (input :job-status)) #:http.request.field{:name "JobStatus", :shape "JobStatus"})) (clojure.core/contains? input :submit-time-before) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-timestamp (input :submit-time-before)) #:http.request.field{:name "SubmitTimeBefore", :shape "Timestamp"})) (clojure.core/contains? input :submit-time-after) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-timestamp (input :submit-time-after)) #:http.request.field{:name "SubmitTimeAfter", :shape "Timestamp"}))))

(clojure.core/defn- ser-timestamp [input] #:http.request.field{:value input, :shape "Timestamp"})

(clojure.core/defn- ser-max-results-integer [input] #:http.request.field{:value input, :shape "MaxResultsInteger"})

(clojure.core/defn- ser-input-format [input] #:http.request.field{:value (clojure.core/get {"ONE_DOC_PER_FILE" "ONE_DOC_PER_FILE", :one-doc-per-file "ONE_DOC_PER_FILE", "ONE_DOC_PER_LINE" "ONE_DOC_PER_LINE", :one-doc-per-line "ONE_DOC_PER_LINE"} input), :shape "InputFormat"})

(clojure.core/defn- ser-job-id [input] #:http.request.field{:value input, :shape "JobId"})

(clojure.core/defn- req-start-sentiment-detection-job-request [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (ser-input-data-config (input :input-data-config)) #:http.request.field{:name "InputDataConfig", :shape "InputDataConfig"}) (clojure.core/into (ser-output-data-config (input :output-data-config)) #:http.request.field{:name "OutputDataConfig", :shape "OutputDataConfig"}) (clojure.core/into (ser-iam-role-arn (input :data-access-role-arn)) #:http.request.field{:name "DataAccessRoleArn", :shape "IamRoleArn"}) (clojure.core/into (ser-language-code (input :language-code)) #:http.request.field{:name "LanguageCode", :shape "LanguageCode"})]} (clojure.core/contains? input :job-name) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-job-name (input :job-name)) #:http.request.field{:name "JobName", :shape "JobName"})) (clojure.core/contains? input :client-request-token) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-client-request-token-string (input :client-request-token)) #:http.request.field{:name "ClientRequestToken", :shape "ClientRequestTokenString", :idempotency-token true}))))

(clojure.core/defn- req-describe-sentiment-detection-job-request [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (ser-job-id (input :job-id)) #:http.request.field{:name "JobId", :shape "JobId"})]}))

(clojure.core/defn- req-start-dominant-language-detection-job-request [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (ser-input-data-config (input :input-data-config)) #:http.request.field{:name "InputDataConfig", :shape "InputDataConfig"}) (clojure.core/into (ser-output-data-config (input :output-data-config)) #:http.request.field{:name "OutputDataConfig", :shape "OutputDataConfig"}) (clojure.core/into (ser-iam-role-arn (input :data-access-role-arn)) #:http.request.field{:name "DataAccessRoleArn", :shape "IamRoleArn"})]} (clojure.core/contains? input :job-name) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-job-name (input :job-name)) #:http.request.field{:name "JobName", :shape "JobName"})) (clojure.core/contains? input :client-request-token) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-client-request-token-string (input :client-request-token)) #:http.request.field{:name "ClientRequestToken", :shape "ClientRequestTokenString", :idempotency-token true}))))

(clojure.core/defn- req-batch-detect-key-phrases-request [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (ser-string-list (input :text-list)) #:http.request.field{:name "TextList", :shape "StringList"}) (clojure.core/into (ser-language-code (input :language-code)) #:http.request.field{:name "LanguageCode", :shape "LanguageCode"})]}))

(clojure.core/defn- req-detect-key-phrases-request [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (ser-string (input :text)) #:http.request.field{:name "Text", :shape "String"}) (clojure.core/into (ser-language-code (input :language-code)) #:http.request.field{:name "LanguageCode", :shape "LanguageCode"})]}))

(clojure.core/defn- req-describe-dominant-language-detection-job-request [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (ser-job-id (input :job-id)) #:http.request.field{:name "JobId", :shape "JobId"})]}))

(clojure.core/defn- req-batch-detect-dominant-language-request [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (ser-string-list (input :text-list)) #:http.request.field{:name "TextList", :shape "StringList"})]}))

(clojure.core/defn- req-detect-syntax-request [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (ser-string (input :text)) #:http.request.field{:name "Text", :shape "String"}) (clojure.core/into (ser-syntax-language-code (input :language-code)) #:http.request.field{:name "LanguageCode", :shape "SyntaxLanguageCode"})]}))

(clojure.core/defn- req-start-entities-detection-job-request [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (ser-input-data-config (input :input-data-config)) #:http.request.field{:name "InputDataConfig", :shape "InputDataConfig"}) (clojure.core/into (ser-output-data-config (input :output-data-config)) #:http.request.field{:name "OutputDataConfig", :shape "OutputDataConfig"}) (clojure.core/into (ser-iam-role-arn (input :data-access-role-arn)) #:http.request.field{:name "DataAccessRoleArn", :shape "IamRoleArn"}) (clojure.core/into (ser-language-code (input :language-code)) #:http.request.field{:name "LanguageCode", :shape "LanguageCode"})]} (clojure.core/contains? input :job-name) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-job-name (input :job-name)) #:http.request.field{:name "JobName", :shape "JobName"})) (clojure.core/contains? input :client-request-token) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-client-request-token-string (input :client-request-token)) #:http.request.field{:name "ClientRequestToken", :shape "ClientRequestTokenString", :idempotency-token true}))))

(clojure.core/defn- req-list-key-phrases-detection-jobs-request [input] (clojure.core/cond-> {} (clojure.core/contains? input :filter) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-key-phrases-detection-job-filter (input :filter)) #:http.request.field{:name "Filter", :shape "KeyPhrasesDetectionJobFilter"})) (clojure.core/contains? input :next-token) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-string (input :next-token)) #:http.request.field{:name "NextToken", :shape "String"})) (clojure.core/contains? input :max-results) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-max-results-integer (input :max-results)) #:http.request.field{:name "MaxResults", :shape "MaxResultsInteger"}))))

(clojure.core/defn- req-describe-topics-detection-job-request [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (ser-job-id (input :job-id)) #:http.request.field{:name "JobId", :shape "JobId"})]}))

(clojure.core/defn- req-detect-dominant-language-request [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (ser-string (input :text)) #:http.request.field{:name "Text", :shape "String"})]}))

(clojure.core/defn- req-stop-dominant-language-detection-job-request [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (ser-job-id (input :job-id)) #:http.request.field{:name "JobId", :shape "JobId"})]}))

(clojure.core/defn- req-stop-sentiment-detection-job-request [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (ser-job-id (input :job-id)) #:http.request.field{:name "JobId", :shape "JobId"})]}))

(clojure.core/defn- req-batch-detect-entities-request [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (ser-string-list (input :text-list)) #:http.request.field{:name "TextList", :shape "StringList"}) (clojure.core/into (ser-language-code (input :language-code)) #:http.request.field{:name "LanguageCode", :shape "LanguageCode"})]}))

(clojure.core/defn- req-list-topics-detection-jobs-request [input] (clojure.core/cond-> {} (clojure.core/contains? input :filter) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-topics-detection-job-filter (input :filter)) #:http.request.field{:name "Filter", :shape "TopicsDetectionJobFilter"})) (clojure.core/contains? input :next-token) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-string (input :next-token)) #:http.request.field{:name "NextToken", :shape "String"})) (clojure.core/contains? input :max-results) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-max-results-integer (input :max-results)) #:http.request.field{:name "MaxResults", :shape "MaxResultsInteger"}))))

(clojure.core/defn- req-start-key-phrases-detection-job-request [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (ser-input-data-config (input :input-data-config)) #:http.request.field{:name "InputDataConfig", :shape "InputDataConfig"}) (clojure.core/into (ser-output-data-config (input :output-data-config)) #:http.request.field{:name "OutputDataConfig", :shape "OutputDataConfig"}) (clojure.core/into (ser-iam-role-arn (input :data-access-role-arn)) #:http.request.field{:name "DataAccessRoleArn", :shape "IamRoleArn"}) (clojure.core/into (ser-language-code (input :language-code)) #:http.request.field{:name "LanguageCode", :shape "LanguageCode"})]} (clojure.core/contains? input :job-name) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-job-name (input :job-name)) #:http.request.field{:name "JobName", :shape "JobName"})) (clojure.core/contains? input :client-request-token) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-client-request-token-string (input :client-request-token)) #:http.request.field{:name "ClientRequestToken", :shape "ClientRequestTokenString", :idempotency-token true}))))

(clojure.core/defn- req-stop-entities-detection-job-request [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (ser-job-id (input :job-id)) #:http.request.field{:name "JobId", :shape "JobId"})]}))

(clojure.core/defn- req-list-entities-detection-jobs-request [input] (clojure.core/cond-> {} (clojure.core/contains? input :filter) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-entities-detection-job-filter (input :filter)) #:http.request.field{:name "Filter", :shape "EntitiesDetectionJobFilter"})) (clojure.core/contains? input :next-token) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-string (input :next-token)) #:http.request.field{:name "NextToken", :shape "String"})) (clojure.core/contains? input :max-results) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-max-results-integer (input :max-results)) #:http.request.field{:name "MaxResults", :shape "MaxResultsInteger"}))))

(clojure.core/defn- req-batch-detect-syntax-request [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (ser-string-list (input :text-list)) #:http.request.field{:name "TextList", :shape "StringList"}) (clojure.core/into (ser-syntax-language-code (input :language-code)) #:http.request.field{:name "LanguageCode", :shape "SyntaxLanguageCode"})]}))

(clojure.core/defn- req-detect-entities-request [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (ser-string (input :text)) #:http.request.field{:name "Text", :shape "String"}) (clojure.core/into (ser-language-code (input :language-code)) #:http.request.field{:name "LanguageCode", :shape "LanguageCode"})]}))

(clojure.core/defn- req-start-topics-detection-job-request [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (ser-input-data-config (input :input-data-config)) #:http.request.field{:name "InputDataConfig", :shape "InputDataConfig"}) (clojure.core/into (ser-output-data-config (input :output-data-config)) #:http.request.field{:name "OutputDataConfig", :shape "OutputDataConfig"}) (clojure.core/into (ser-iam-role-arn (input :data-access-role-arn)) #:http.request.field{:name "DataAccessRoleArn", :shape "IamRoleArn"})]} (clojure.core/contains? input :job-name) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-job-name (input :job-name)) #:http.request.field{:name "JobName", :shape "JobName"})) (clojure.core/contains? input :number-of-topics) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-number-of-topics-integer (input :number-of-topics)) #:http.request.field{:name "NumberOfTopics", :shape "NumberOfTopicsInteger"})) (clojure.core/contains? input :client-request-token) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-client-request-token-string (input :client-request-token)) #:http.request.field{:name "ClientRequestToken", :shape "ClientRequestTokenString", :idempotency-token true}))))

(clojure.core/defn- req-list-sentiment-detection-jobs-request [input] (clojure.core/cond-> {} (clojure.core/contains? input :filter) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-sentiment-detection-job-filter (input :filter)) #:http.request.field{:name "Filter", :shape "SentimentDetectionJobFilter"})) (clojure.core/contains? input :next-token) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-string (input :next-token)) #:http.request.field{:name "NextToken", :shape "String"})) (clojure.core/contains? input :max-results) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-max-results-integer (input :max-results)) #:http.request.field{:name "MaxResults", :shape "MaxResultsInteger"}))))

(clojure.core/defn- req-stop-key-phrases-detection-job-request [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (ser-job-id (input :job-id)) #:http.request.field{:name "JobId", :shape "JobId"})]}))

(clojure.core/defn- req-describe-key-phrases-detection-job-request [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (ser-job-id (input :job-id)) #:http.request.field{:name "JobId", :shape "JobId"})]}))

(clojure.core/defn- req-detect-sentiment-request [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (ser-string (input :text)) #:http.request.field{:name "Text", :shape "String"}) (clojure.core/into (ser-language-code (input :language-code)) #:http.request.field{:name "LanguageCode", :shape "LanguageCode"})]}))

(clojure.core/defn- req-describe-entities-detection-job-request [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (ser-job-id (input :job-id)) #:http.request.field{:name "JobId", :shape "JobId"})]}))

(clojure.core/defn- req-list-dominant-language-detection-jobs-request [input] (clojure.core/cond-> {} (clojure.core/contains? input :filter) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-dominant-language-detection-job-filter (input :filter)) #:http.request.field{:name "Filter", :shape "DominantLanguageDetectionJobFilter"})) (clojure.core/contains? input :next-token) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-string (input :next-token)) #:http.request.field{:name "NextToken", :shape "String"})) (clojure.core/contains? input :max-results) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-max-results-integer (input :max-results)) #:http.request.field{:name "MaxResults", :shape "MaxResultsInteger"}))))

(clojure.core/defn- req-batch-detect-sentiment-request [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (ser-string-list (input :text-list)) #:http.request.field{:name "TextList", :shape "StringList"}) (clojure.core/into (ser-language-code (input :language-code)) #:http.request.field{:name "LanguageCode", :shape "LanguageCode"})]}))

(clojure.core/declare deser-list-of-entities)

(clojure.core/declare deser-input-data-config)

(clojure.core/declare deser-output-data-config)

(clojure.core/declare deser-part-of-speech-tag-type)

(clojure.core/declare deser-list-of-dominant-languages)

(clojure.core/declare deser-job-status)

(clojure.core/declare deser-list-of-detect-dominant-language-result)

(clojure.core/declare deser-sentiment-type)

(clojure.core/declare deser-sentiment-score)

(clojure.core/declare deser-batch-detect-dominant-language-item-result)

(clojure.core/declare deser-job-name)

(clojure.core/declare deser-list-of-detect-entities-result)

(clojure.core/declare deser-key-phrase)

(clojure.core/declare deser-s-3-uri)

(clojure.core/declare deser-dominant-language)

(clojure.core/declare deser-key-phrases-detection-job-properties)

(clojure.core/declare deser-dominant-language-detection-job-properties)

(clojure.core/declare deser-topics-detection-job-properties-list)

(clojure.core/declare deser-batch-item-error)

(clojure.core/declare deser-iam-role-arn)

(clojure.core/declare deser-syntax-token)

(clojure.core/declare deser-batch-detect-key-phrases-item-result)

(clojure.core/declare deser-batch-item-error-list)

(clojure.core/declare deser-language-code)

(clojure.core/declare deser-list-of-detect-key-phrases-result)

(clojure.core/declare deser-list-of-key-phrases)

(clojure.core/declare deser-list-of-detect-sentiment-result)

(clojure.core/declare deser-key-phrases-detection-job-properties-list)

(clojure.core/declare deser-integer)

(clojure.core/declare deser-string)

(clojure.core/declare deser-batch-detect-entities-item-result)

(clojure.core/declare deser-batch-detect-syntax-item-result)

(clojure.core/declare deser-batch-detect-sentiment-item-result)

(clojure.core/declare deser-timestamp)

(clojure.core/declare deser-entity)

(clojure.core/declare deser-topics-detection-job-properties)

(clojure.core/declare deser-sentiment-detection-job-properties-list)

(clojure.core/declare deser-any-length-string)

(clojure.core/declare deser-list-of-detect-syntax-result)

(clojure.core/declare deser-entities-detection-job-properties)

(clojure.core/declare deser-input-format)

(clojure.core/declare deser-entity-type)

(clojure.core/declare deser-dominant-language-detection-job-properties-list)

(clojure.core/declare deser-float)

(clojure.core/declare deser-sentiment-detection-job-properties)

(clojure.core/declare deser-part-of-speech-tag)

(clojure.core/declare deser-list-of-syntax-tokens)

(clojure.core/declare deser-entities-detection-job-properties-list)

(clojure.core/declare deser-job-id)

(clojure.core/defn- deser-list-of-entities [input] (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (deser-entity coll))) input))

(clojure.core/defn- deser-input-data-config [input] (clojure.core/cond-> {:s-3-uri (deser-s-3-uri (input "S3Uri"))} (clojure.core/contains? input "InputFormat") (clojure.core/assoc :input-format (deser-input-format (input "InputFormat")))))

(clojure.core/defn- deser-output-data-config [input] (clojure.core/cond-> {:s-3-uri (deser-s-3-uri (input "S3Uri"))}))

(clojure.core/defn- deser-part-of-speech-tag-type [input] (clojure.core/get {"AUX" :aux, "PRON" :pron, "ADV" :adv, "ADP" :adp, "ADJ" :adj, "PART" :part, "SYM" :sym, "NOUN" :noun, "CONJ" :conj, "INTJ" :intj, "SCONJ" :sconj, "PUNCT" :punct, "NUM" :num, "VERB" :verb, "O" :o, "DET" :det, "PROPN" :propn} input))

(clojure.core/defn- deser-list-of-dominant-languages [input] (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (deser-dominant-language coll))) input))

(clojure.core/defn- deser-job-status [input] (clojure.core/get {"SUBMITTED" :submitted, "IN_PROGRESS" :in-progress, "COMPLETED" :completed, "FAILED" :failed, "STOP_REQUESTED" :stop-requested, "STOPPED" :stopped} input))

(clojure.core/defn- deser-list-of-detect-dominant-language-result [input] (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (deser-batch-detect-dominant-language-item-result coll))) input))

(clojure.core/defn- deser-sentiment-type [input] (clojure.core/get {"POSITIVE" :positive, "NEGATIVE" :negative, "NEUTRAL" :neutral, "MIXED" :mixed} input))

(clojure.core/defn- deser-sentiment-score [input] (clojure.core/cond-> {} (clojure.core/contains? input "Positive") (clojure.core/assoc :positive (deser-float (input "Positive"))) (clojure.core/contains? input "Negative") (clojure.core/assoc :negative (deser-float (input "Negative"))) (clojure.core/contains? input "Neutral") (clojure.core/assoc :neutral (deser-float (input "Neutral"))) (clojure.core/contains? input "Mixed") (clojure.core/assoc :mixed (deser-float (input "Mixed")))))

(clojure.core/defn- deser-batch-detect-dominant-language-item-result [input] (clojure.core/cond-> {} (clojure.core/contains? input "Index") (clojure.core/assoc :index (deser-integer (input "Index"))) (clojure.core/contains? input "Languages") (clojure.core/assoc :languages (deser-list-of-dominant-languages (input "Languages")))))

(clojure.core/defn- deser-job-name [input] input)

(clojure.core/defn- deser-list-of-detect-entities-result [input] (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (deser-batch-detect-entities-item-result coll))) input))

(clojure.core/defn- deser-key-phrase [input] (clojure.core/cond-> {} (clojure.core/contains? input "Score") (clojure.core/assoc :score (deser-float (input "Score"))) (clojure.core/contains? input "Text") (clojure.core/assoc :text (deser-string (input "Text"))) (clojure.core/contains? input "BeginOffset") (clojure.core/assoc :begin-offset (deser-integer (input "BeginOffset"))) (clojure.core/contains? input "EndOffset") (clojure.core/assoc :end-offset (deser-integer (input "EndOffset")))))

(clojure.core/defn- deser-s-3-uri [input] input)

(clojure.core/defn- deser-dominant-language [input] (clojure.core/cond-> {} (clojure.core/contains? input "LanguageCode") (clojure.core/assoc :language-code (deser-string (input "LanguageCode"))) (clojure.core/contains? input "Score") (clojure.core/assoc :score (deser-float (input "Score")))))

(clojure.core/defn- deser-key-phrases-detection-job-properties [input] (clojure.core/cond-> {} (clojure.core/contains? input "InputDataConfig") (clojure.core/assoc :input-data-config (deser-input-data-config (input "InputDataConfig"))) (clojure.core/contains? input "OutputDataConfig") (clojure.core/assoc :output-data-config (deser-output-data-config (input "OutputDataConfig"))) (clojure.core/contains? input "EndTime") (clojure.core/assoc :end-time (deser-timestamp (input "EndTime"))) (clojure.core/contains? input "JobStatus") (clojure.core/assoc :job-status (deser-job-status (input "JobStatus"))) (clojure.core/contains? input "JobName") (clojure.core/assoc :job-name (deser-job-name (input "JobName"))) (clojure.core/contains? input "SubmitTime") (clojure.core/assoc :submit-time (deser-timestamp (input "SubmitTime"))) (clojure.core/contains? input "LanguageCode") (clojure.core/assoc :language-code (deser-language-code (input "LanguageCode"))) (clojure.core/contains? input "Message") (clojure.core/assoc :message (deser-any-length-string (input "Message"))) (clojure.core/contains? input "DataAccessRoleArn") (clojure.core/assoc :data-access-role-arn (deser-iam-role-arn (input "DataAccessRoleArn"))) (clojure.core/contains? input "JobId") (clojure.core/assoc :job-id (deser-job-id (input "JobId")))))

(clojure.core/defn- deser-dominant-language-detection-job-properties [input] (clojure.core/cond-> {} (clojure.core/contains? input "InputDataConfig") (clojure.core/assoc :input-data-config (deser-input-data-config (input "InputDataConfig"))) (clojure.core/contains? input "OutputDataConfig") (clojure.core/assoc :output-data-config (deser-output-data-config (input "OutputDataConfig"))) (clojure.core/contains? input "EndTime") (clojure.core/assoc :end-time (deser-timestamp (input "EndTime"))) (clojure.core/contains? input "JobStatus") (clojure.core/assoc :job-status (deser-job-status (input "JobStatus"))) (clojure.core/contains? input "JobName") (clojure.core/assoc :job-name (deser-job-name (input "JobName"))) (clojure.core/contains? input "SubmitTime") (clojure.core/assoc :submit-time (deser-timestamp (input "SubmitTime"))) (clojure.core/contains? input "Message") (clojure.core/assoc :message (deser-any-length-string (input "Message"))) (clojure.core/contains? input "DataAccessRoleArn") (clojure.core/assoc :data-access-role-arn (deser-iam-role-arn (input "DataAccessRoleArn"))) (clojure.core/contains? input "JobId") (clojure.core/assoc :job-id (deser-job-id (input "JobId")))))

(clojure.core/defn- deser-topics-detection-job-properties-list [input] (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (deser-topics-detection-job-properties coll))) input))

(clojure.core/defn- deser-batch-item-error [input] (clojure.core/cond-> {} (clojure.core/contains? input "Index") (clojure.core/assoc :index (deser-integer (input "Index"))) (clojure.core/contains? input "ErrorCode") (clojure.core/assoc :error-code (deser-string (input "ErrorCode"))) (clojure.core/contains? input "ErrorMessage") (clojure.core/assoc :error-message (deser-string (input "ErrorMessage")))))

(clojure.core/defn- deser-iam-role-arn [input] input)

(clojure.core/defn- deser-syntax-token [input] (clojure.core/cond-> {} (clojure.core/contains? input "TokenId") (clojure.core/assoc :token-id (deser-integer (input "TokenId"))) (clojure.core/contains? input "Text") (clojure.core/assoc :text (deser-string (input "Text"))) (clojure.core/contains? input "BeginOffset") (clojure.core/assoc :begin-offset (deser-integer (input "BeginOffset"))) (clojure.core/contains? input "EndOffset") (clojure.core/assoc :end-offset (deser-integer (input "EndOffset"))) (clojure.core/contains? input "PartOfSpeech") (clojure.core/assoc :part-of-speech (deser-part-of-speech-tag (input "PartOfSpeech")))))

(clojure.core/defn- deser-batch-detect-key-phrases-item-result [input] (clojure.core/cond-> {} (clojure.core/contains? input "Index") (clojure.core/assoc :index (deser-integer (input "Index"))) (clojure.core/contains? input "KeyPhrases") (clojure.core/assoc :key-phrases (deser-list-of-key-phrases (input "KeyPhrases")))))

(clojure.core/defn- deser-batch-item-error-list [input] (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (deser-batch-item-error coll))) input))

(clojure.core/defn- deser-language-code [input] (clojure.core/get {"en" :en, "es" :es} input))

(clojure.core/defn- deser-list-of-detect-key-phrases-result [input] (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (deser-batch-detect-key-phrases-item-result coll))) input))

(clojure.core/defn- deser-list-of-key-phrases [input] (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (deser-key-phrase coll))) input))

(clojure.core/defn- deser-list-of-detect-sentiment-result [input] (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (deser-batch-detect-sentiment-item-result coll))) input))

(clojure.core/defn- deser-key-phrases-detection-job-properties-list [input] (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (deser-key-phrases-detection-job-properties coll))) input))

(clojure.core/defn- deser-integer [input] input)

(clojure.core/defn- deser-string [input] input)

(clojure.core/defn- deser-batch-detect-entities-item-result [input] (clojure.core/cond-> {} (clojure.core/contains? input "Index") (clojure.core/assoc :index (deser-integer (input "Index"))) (clojure.core/contains? input "Entities") (clojure.core/assoc :entities (deser-list-of-entities (input "Entities")))))

(clojure.core/defn- deser-batch-detect-syntax-item-result [input] (clojure.core/cond-> {} (clojure.core/contains? input "Index") (clojure.core/assoc :index (deser-integer (input "Index"))) (clojure.core/contains? input "SyntaxTokens") (clojure.core/assoc :syntax-tokens (deser-list-of-syntax-tokens (input "SyntaxTokens")))))

(clojure.core/defn- deser-batch-detect-sentiment-item-result [input] (clojure.core/cond-> {} (clojure.core/contains? input "Index") (clojure.core/assoc :index (deser-integer (input "Index"))) (clojure.core/contains? input "Sentiment") (clojure.core/assoc :sentiment (deser-sentiment-type (input "Sentiment"))) (clojure.core/contains? input "SentimentScore") (clojure.core/assoc :sentiment-score (deser-sentiment-score (input "SentimentScore")))))

(clojure.core/defn- deser-timestamp [input] input)

(clojure.core/defn- deser-entity [input] (clojure.core/cond-> {} (clojure.core/contains? input "Score") (clojure.core/assoc :score (deser-float (input "Score"))) (clojure.core/contains? input "Type") (clojure.core/assoc :type (deser-entity-type (input "Type"))) (clojure.core/contains? input "Text") (clojure.core/assoc :text (deser-string (input "Text"))) (clojure.core/contains? input "BeginOffset") (clojure.core/assoc :begin-offset (deser-integer (input "BeginOffset"))) (clojure.core/contains? input "EndOffset") (clojure.core/assoc :end-offset (deser-integer (input "EndOffset")))))

(clojure.core/defn- deser-topics-detection-job-properties [input] (clojure.core/cond-> {} (clojure.core/contains? input "InputDataConfig") (clojure.core/assoc :input-data-config (deser-input-data-config (input "InputDataConfig"))) (clojure.core/contains? input "OutputDataConfig") (clojure.core/assoc :output-data-config (deser-output-data-config (input "OutputDataConfig"))) (clojure.core/contains? input "EndTime") (clojure.core/assoc :end-time (deser-timestamp (input "EndTime"))) (clojure.core/contains? input "NumberOfTopics") (clojure.core/assoc :number-of-topics (deser-integer (input "NumberOfTopics"))) (clojure.core/contains? input "JobStatus") (clojure.core/assoc :job-status (deser-job-status (input "JobStatus"))) (clojure.core/contains? input "JobName") (clojure.core/assoc :job-name (deser-job-name (input "JobName"))) (clojure.core/contains? input "SubmitTime") (clojure.core/assoc :submit-time (deser-timestamp (input "SubmitTime"))) (clojure.core/contains? input "Message") (clojure.core/assoc :message (deser-any-length-string (input "Message"))) (clojure.core/contains? input "JobId") (clojure.core/assoc :job-id (deser-job-id (input "JobId")))))

(clojure.core/defn- deser-sentiment-detection-job-properties-list [input] (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (deser-sentiment-detection-job-properties coll))) input))

(clojure.core/defn- deser-any-length-string [input] input)

(clojure.core/defn- deser-list-of-detect-syntax-result [input] (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (deser-batch-detect-syntax-item-result coll))) input))

(clojure.core/defn- deser-entities-detection-job-properties [input] (clojure.core/cond-> {} (clojure.core/contains? input "InputDataConfig") (clojure.core/assoc :input-data-config (deser-input-data-config (input "InputDataConfig"))) (clojure.core/contains? input "OutputDataConfig") (clojure.core/assoc :output-data-config (deser-output-data-config (input "OutputDataConfig"))) (clojure.core/contains? input "EndTime") (clojure.core/assoc :end-time (deser-timestamp (input "EndTime"))) (clojure.core/contains? input "JobStatus") (clojure.core/assoc :job-status (deser-job-status (input "JobStatus"))) (clojure.core/contains? input "JobName") (clojure.core/assoc :job-name (deser-job-name (input "JobName"))) (clojure.core/contains? input "SubmitTime") (clojure.core/assoc :submit-time (deser-timestamp (input "SubmitTime"))) (clojure.core/contains? input "LanguageCode") (clojure.core/assoc :language-code (deser-language-code (input "LanguageCode"))) (clojure.core/contains? input "Message") (clojure.core/assoc :message (deser-any-length-string (input "Message"))) (clojure.core/contains? input "DataAccessRoleArn") (clojure.core/assoc :data-access-role-arn (deser-iam-role-arn (input "DataAccessRoleArn"))) (clojure.core/contains? input "JobId") (clojure.core/assoc :job-id (deser-job-id (input "JobId")))))

(clojure.core/defn- deser-input-format [input] (clojure.core/get {"ONE_DOC_PER_FILE" :one-doc-per-file, "ONE_DOC_PER_LINE" :one-doc-per-line} input))

(clojure.core/defn- deser-entity-type [input] (clojure.core/get {"ORGANIZATION" :organization, "TITLE" :title, "DATE" :date, "PERSON" :person, "EVENT" :event, "QUANTITY" :quantity, "OTHER" :other, "LOCATION" :location, "COMMERCIAL_ITEM" :commercial-item} input))

(clojure.core/defn- deser-dominant-language-detection-job-properties-list [input] (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (deser-dominant-language-detection-job-properties coll))) input))

(clojure.core/defn- deser-float [input] input)

(clojure.core/defn- deser-sentiment-detection-job-properties [input] (clojure.core/cond-> {} (clojure.core/contains? input "InputDataConfig") (clojure.core/assoc :input-data-config (deser-input-data-config (input "InputDataConfig"))) (clojure.core/contains? input "OutputDataConfig") (clojure.core/assoc :output-data-config (deser-output-data-config (input "OutputDataConfig"))) (clojure.core/contains? input "EndTime") (clojure.core/assoc :end-time (deser-timestamp (input "EndTime"))) (clojure.core/contains? input "JobStatus") (clojure.core/assoc :job-status (deser-job-status (input "JobStatus"))) (clojure.core/contains? input "JobName") (clojure.core/assoc :job-name (deser-job-name (input "JobName"))) (clojure.core/contains? input "SubmitTime") (clojure.core/assoc :submit-time (deser-timestamp (input "SubmitTime"))) (clojure.core/contains? input "LanguageCode") (clojure.core/assoc :language-code (deser-language-code (input "LanguageCode"))) (clojure.core/contains? input "Message") (clojure.core/assoc :message (deser-any-length-string (input "Message"))) (clojure.core/contains? input "DataAccessRoleArn") (clojure.core/assoc :data-access-role-arn (deser-iam-role-arn (input "DataAccessRoleArn"))) (clojure.core/contains? input "JobId") (clojure.core/assoc :job-id (deser-job-id (input "JobId")))))

(clojure.core/defn- deser-part-of-speech-tag [input] (clojure.core/cond-> {} (clojure.core/contains? input "Tag") (clojure.core/assoc :tag (deser-part-of-speech-tag-type (input "Tag"))) (clojure.core/contains? input "Score") (clojure.core/assoc :score (deser-float (input "Score")))))

(clojure.core/defn- deser-list-of-syntax-tokens [input] (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (deser-syntax-token coll))) input))

(clojure.core/defn- deser-entities-detection-job-properties-list [input] (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (deser-entities-detection-job-properties coll))) input))

(clojure.core/defn- deser-job-id [input] input)

(clojure.core/defn- deser-start-topics-detection-job-response [input] (clojure.core/cond-> {} (clojure.core/contains? input "JobId") (clojure.core/assoc :job-id (deser-job-id (input "JobId"))) (clojure.core/contains? input "JobStatus") (clojure.core/assoc :job-status (deser-job-status (input "JobStatus")))))

(clojure.core/defn- deser-list-key-phrases-detection-jobs-response [input] (clojure.core/cond-> {} (clojure.core/contains? input "KeyPhrasesDetectionJobPropertiesList") (clojure.core/assoc :key-phrases-detection-job-properties-list (deser-key-phrases-detection-job-properties-list (input "KeyPhrasesDetectionJobPropertiesList"))) (clojure.core/contains? input "NextToken") (clojure.core/assoc :next-token (deser-string (input "NextToken")))))

(clojure.core/defn- deser-batch-detect-key-phrases-response [input] (clojure.core/cond-> {:result-list (deser-list-of-detect-key-phrases-result (input "ResultList")), :error-list (deser-batch-item-error-list (input "ErrorList"))}))

(clojure.core/defn- deser-stop-dominant-language-detection-job-response [input] (clojure.core/cond-> {} (clojure.core/contains? input "JobId") (clojure.core/assoc :job-id (deser-job-id (input "JobId"))) (clojure.core/contains? input "JobStatus") (clojure.core/assoc :job-status (deser-job-status (input "JobStatus")))))

(clojure.core/defn- deser-batch-detect-dominant-language-response [input] (clojure.core/cond-> {:result-list (deser-list-of-detect-dominant-language-result (input "ResultList")), :error-list (deser-batch-item-error-list (input "ErrorList"))}))

(clojure.core/defn- deser-unsupported-language-exception [input] (clojure.core/cond-> {} (clojure.core/contains? input "Message") (clojure.core/assoc :message (deser-string (input "Message")))))

(clojure.core/defn- deser-start-dominant-language-detection-job-response [input] (clojure.core/cond-> {} (clojure.core/contains? input "JobId") (clojure.core/assoc :job-id (deser-job-id (input "JobId"))) (clojure.core/contains? input "JobStatus") (clojure.core/assoc :job-status (deser-job-status (input "JobStatus")))))

(clojure.core/defn- deser-list-entities-detection-jobs-response [input] (clojure.core/cond-> {} (clojure.core/contains? input "EntitiesDetectionJobPropertiesList") (clojure.core/assoc :entities-detection-job-properties-list (deser-entities-detection-job-properties-list (input "EntitiesDetectionJobPropertiesList"))) (clojure.core/contains? input "NextToken") (clojure.core/assoc :next-token (deser-string (input "NextToken")))))

(clojure.core/defn- deser-invalid-request-exception [input] (clojure.core/cond-> {} (clojure.core/contains? input "Message") (clojure.core/assoc :message (deser-string (input "Message")))))

(clojure.core/defn- deser-start-entities-detection-job-response [input] (clojure.core/cond-> {} (clojure.core/contains? input "JobId") (clojure.core/assoc :job-id (deser-job-id (input "JobId"))) (clojure.core/contains? input "JobStatus") (clojure.core/assoc :job-status (deser-job-status (input "JobStatus")))))

(clojure.core/defn- deser-start-key-phrases-detection-job-response [input] (clojure.core/cond-> {} (clojure.core/contains? input "JobId") (clojure.core/assoc :job-id (deser-job-id (input "JobId"))) (clojure.core/contains? input "JobStatus") (clojure.core/assoc :job-status (deser-job-status (input "JobStatus")))))

(clojure.core/defn- deser-detect-sentiment-response [input] (clojure.core/cond-> {} (clojure.core/contains? input "Sentiment") (clojure.core/assoc :sentiment (deser-sentiment-type (input "Sentiment"))) (clojure.core/contains? input "SentimentScore") (clojure.core/assoc :sentiment-score (deser-sentiment-score (input "SentimentScore")))))

(clojure.core/defn- deser-detect-dominant-language-response [input] (clojure.core/cond-> {} (clojure.core/contains? input "Languages") (clojure.core/assoc :languages (deser-list-of-dominant-languages (input "Languages")))))

(clojure.core/defn- deser-text-size-limit-exceeded-exception [input] (clojure.core/cond-> {} (clojure.core/contains? input "Message") (clojure.core/assoc :message (deser-string (input "Message")))))

(clojure.core/defn- deser-detect-key-phrases-response [input] (clojure.core/cond-> {} (clojure.core/contains? input "KeyPhrases") (clojure.core/assoc :key-phrases (deser-list-of-key-phrases (input "KeyPhrases")))))

(clojure.core/defn- deser-batch-detect-syntax-response [input] (clojure.core/cond-> {:result-list (deser-list-of-detect-syntax-result (input "ResultList")), :error-list (deser-batch-item-error-list (input "ErrorList"))}))

(clojure.core/defn- deser-invalid-filter-exception [input] (clojure.core/cond-> {} (clojure.core/contains? input "Message") (clojure.core/assoc :message (deser-string (input "Message")))))

(clojure.core/defn- deser-describe-sentiment-detection-job-response [input] (clojure.core/cond-> {} (clojure.core/contains? input "SentimentDetectionJobProperties") (clojure.core/assoc :sentiment-detection-job-properties (deser-sentiment-detection-job-properties (input "SentimentDetectionJobProperties")))))

(clojure.core/defn- deser-too-many-requests-exception [input] (clojure.core/cond-> {} (clojure.core/contains? input "Message") (clojure.core/assoc :message (deser-string (input "Message")))))

(clojure.core/defn- deser-list-topics-detection-jobs-response [input] (clojure.core/cond-> {} (clojure.core/contains? input "TopicsDetectionJobPropertiesList") (clojure.core/assoc :topics-detection-job-properties-list (deser-topics-detection-job-properties-list (input "TopicsDetectionJobPropertiesList"))) (clojure.core/contains? input "NextToken") (clojure.core/assoc :next-token (deser-string (input "NextToken")))))

(clojure.core/defn- deser-internal-server-exception [input] (clojure.core/cond-> {} (clojure.core/contains? input "Message") (clojure.core/assoc :message (deser-string (input "Message")))))

(clojure.core/defn- deser-stop-key-phrases-detection-job-response [input] (clojure.core/cond-> {} (clojure.core/contains? input "JobId") (clojure.core/assoc :job-id (deser-job-id (input "JobId"))) (clojure.core/contains? input "JobStatus") (clojure.core/assoc :job-status (deser-job-status (input "JobStatus")))))

(clojure.core/defn- deser-stop-entities-detection-job-response [input] (clojure.core/cond-> {} (clojure.core/contains? input "JobId") (clojure.core/assoc :job-id (deser-job-id (input "JobId"))) (clojure.core/contains? input "JobStatus") (clojure.core/assoc :job-status (deser-job-status (input "JobStatus")))))

(clojure.core/defn- deser-detect-syntax-response [input] (clojure.core/cond-> {} (clojure.core/contains? input "SyntaxTokens") (clojure.core/assoc :syntax-tokens (deser-list-of-syntax-tokens (input "SyntaxTokens")))))

(clojure.core/defn- deser-start-sentiment-detection-job-response [input] (clojure.core/cond-> {} (clojure.core/contains? input "JobId") (clojure.core/assoc :job-id (deser-job-id (input "JobId"))) (clojure.core/contains? input "JobStatus") (clojure.core/assoc :job-status (deser-job-status (input "JobStatus")))))

(clojure.core/defn- deser-describe-topics-detection-job-response [input] (clojure.core/cond-> {} (clojure.core/contains? input "TopicsDetectionJobProperties") (clojure.core/assoc :topics-detection-job-properties (deser-topics-detection-job-properties (input "TopicsDetectionJobProperties")))))

(clojure.core/defn- deser-batch-detect-sentiment-response [input] (clojure.core/cond-> {:result-list (deser-list-of-detect-sentiment-result (input "ResultList")), :error-list (deser-batch-item-error-list (input "ErrorList"))}))

(clojure.core/defn- deser-detect-entities-response [input] (clojure.core/cond-> {} (clojure.core/contains? input "Entities") (clojure.core/assoc :entities (deser-list-of-entities (input "Entities")))))

(clojure.core/defn- deser-batch-size-limit-exceeded-exception [input] (clojure.core/cond-> {} (clojure.core/contains? input "Message") (clojure.core/assoc :message (deser-string (input "Message")))))

(clojure.core/defn- deser-list-dominant-language-detection-jobs-response [input] (clojure.core/cond-> {} (clojure.core/contains? input "DominantLanguageDetectionJobPropertiesList") (clojure.core/assoc :dominant-language-detection-job-properties-list (deser-dominant-language-detection-job-properties-list (input "DominantLanguageDetectionJobPropertiesList"))) (clojure.core/contains? input "NextToken") (clojure.core/assoc :next-token (deser-string (input "NextToken")))))

(clojure.core/defn- deser-job-not-found-exception [input] (clojure.core/cond-> {} (clojure.core/contains? input "Message") (clojure.core/assoc :message (deser-string (input "Message")))))

(clojure.core/defn- deser-describe-dominant-language-detection-job-response [input] (clojure.core/cond-> {} (clojure.core/contains? input "DominantLanguageDetectionJobProperties") (clojure.core/assoc :dominant-language-detection-job-properties (deser-dominant-language-detection-job-properties (input "DominantLanguageDetectionJobProperties")))))

(clojure.core/defn- deser-list-sentiment-detection-jobs-response [input] (clojure.core/cond-> {} (clojure.core/contains? input "SentimentDetectionJobPropertiesList") (clojure.core/assoc :sentiment-detection-job-properties-list (deser-sentiment-detection-job-properties-list (input "SentimentDetectionJobPropertiesList"))) (clojure.core/contains? input "NextToken") (clojure.core/assoc :next-token (deser-string (input "NextToken")))))

(clojure.core/defn- deser-stop-sentiment-detection-job-response [input] (clojure.core/cond-> {} (clojure.core/contains? input "JobId") (clojure.core/assoc :job-id (deser-job-id (input "JobId"))) (clojure.core/contains? input "JobStatus") (clojure.core/assoc :job-status (deser-job-status (input "JobStatus")))))

(clojure.core/defn- deser-describe-entities-detection-job-response [input] (clojure.core/cond-> {} (clojure.core/contains? input "EntitiesDetectionJobProperties") (clojure.core/assoc :entities-detection-job-properties (deser-entities-detection-job-properties (input "EntitiesDetectionJobProperties")))))

(clojure.core/defn- deser-describe-key-phrases-detection-job-response [input] (clojure.core/cond-> {} (clojure.core/contains? input "KeyPhrasesDetectionJobProperties") (clojure.core/assoc :key-phrases-detection-job-properties (deser-key-phrases-detection-job-properties (input "KeyPhrasesDetectionJobProperties")))))

(clojure.core/defn- deser-batch-detect-entities-response [input] (clojure.core/cond-> {:result-list (deser-list-of-detect-entities-result (input "ResultList")), :error-list (deser-batch-item-error-list (input "ErrorList"))}))

(clojure.spec.alpha/def :portkey.aws.comprehend/start-topics-detection-job-response (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.comprehend/job-id :portkey.aws.comprehend/job-status]))

(clojure.spec.alpha/def :portkey.aws.comprehend/list-of-entities (clojure.spec.alpha/coll-of :portkey.aws.comprehend/entity))

(clojure.spec.alpha/def :portkey.aws.comprehend/input-data-config (clojure.spec.alpha/keys :req-un [:portkey.aws.comprehend/s-3-uri] :opt-un [:portkey.aws.comprehend/input-format]))

(clojure.spec.alpha/def :portkey.aws.comprehend.list-key-phrases-detection-jobs-response/next-token (clojure.spec.alpha/and :portkey.aws.comprehend/string))
(clojure.spec.alpha/def :portkey.aws.comprehend/list-key-phrases-detection-jobs-response (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.comprehend/key-phrases-detection-job-properties-list :portkey.aws.comprehend.list-key-phrases-detection-jobs-response/next-token]))

(clojure.spec.alpha/def :portkey.aws.comprehend.batch-detect-key-phrases-response/result-list (clojure.spec.alpha/and :portkey.aws.comprehend/list-of-detect-key-phrases-result))
(clojure.spec.alpha/def :portkey.aws.comprehend.batch-detect-key-phrases-response/error-list (clojure.spec.alpha/and :portkey.aws.comprehend/batch-item-error-list))
(clojure.spec.alpha/def :portkey.aws.comprehend/batch-detect-key-phrases-response (clojure.spec.alpha/keys :req-un [:portkey.aws.comprehend.batch-detect-key-phrases-response/result-list :portkey.aws.comprehend.batch-detect-key-phrases-response/error-list] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.comprehend/string-list (clojure.spec.alpha/coll-of :portkey.aws.comprehend/string))

(clojure.spec.alpha/def :portkey.aws.comprehend/stop-dominant-language-detection-job-response (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.comprehend/job-id :portkey.aws.comprehend/job-status]))

(clojure.spec.alpha/def :portkey.aws.comprehend/output-data-config (clojure.spec.alpha/keys :req-un [:portkey.aws.comprehend/s-3-uri] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.comprehend.start-sentiment-detection-job-request/data-access-role-arn (clojure.spec.alpha/and :portkey.aws.comprehend/iam-role-arn))
(clojure.spec.alpha/def :portkey.aws.comprehend.start-sentiment-detection-job-request/client-request-token (clojure.spec.alpha/and :portkey.aws.comprehend/client-request-token-string))
(clojure.spec.alpha/def :portkey.aws.comprehend/start-sentiment-detection-job-request (clojure.spec.alpha/keys :req-un [:portkey.aws.comprehend/input-data-config :portkey.aws.comprehend/output-data-config :portkey.aws.comprehend.start-sentiment-detection-job-request/data-access-role-arn :portkey.aws.comprehend/language-code] :opt-un [:portkey.aws.comprehend/job-name :portkey.aws.comprehend.start-sentiment-detection-job-request/client-request-token]))

(clojure.spec.alpha/def :portkey.aws.comprehend.batch-detect-dominant-language-response/result-list (clojure.spec.alpha/and :portkey.aws.comprehend/list-of-detect-dominant-language-result))
(clojure.spec.alpha/def :portkey.aws.comprehend.batch-detect-dominant-language-response/error-list (clojure.spec.alpha/and :portkey.aws.comprehend/batch-item-error-list))
(clojure.spec.alpha/def :portkey.aws.comprehend/batch-detect-dominant-language-response (clojure.spec.alpha/keys :req-un [:portkey.aws.comprehend.batch-detect-dominant-language-response/result-list :portkey.aws.comprehend.batch-detect-dominant-language-response/error-list] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.comprehend/part-of-speech-tag-type #{"AUX" :aux :num "PRON" "ADV" "ADP" "ADJ" :propn :conj "PART" "SYM" "NOUN" :o "CONJ" :verb :pron :det "INTJ" :part "SCONJ" "PUNCT" :adj :intj :punct :sym "NUM" "VERB" :sconj "O" "DET" :adv :adp :noun "PROPN"})

(clojure.spec.alpha/def :portkey.aws.comprehend/list-of-dominant-languages (clojure.spec.alpha/coll-of :portkey.aws.comprehend/dominant-language))

(clojure.spec.alpha/def :portkey.aws.comprehend.unsupported-language-exception/message (clojure.spec.alpha/and :portkey.aws.comprehend/string))
(clojure.spec.alpha/def :portkey.aws.comprehend/unsupported-language-exception (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.comprehend.unsupported-language-exception/message]))

(clojure.spec.alpha/def :portkey.aws.comprehend/start-dominant-language-detection-job-response (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.comprehend/job-id :portkey.aws.comprehend/job-status]))

(clojure.spec.alpha/def :portkey.aws.comprehend/describe-sentiment-detection-job-request (clojure.spec.alpha/keys :req-un [:portkey.aws.comprehend/job-id] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.comprehend.list-entities-detection-jobs-response/next-token (clojure.spec.alpha/and :portkey.aws.comprehend/string))
(clojure.spec.alpha/def :portkey.aws.comprehend/list-entities-detection-jobs-response (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.comprehend/entities-detection-job-properties-list :portkey.aws.comprehend.list-entities-detection-jobs-response/next-token]))

(clojure.spec.alpha/def :portkey.aws.comprehend/job-status #{"COMPLETED" "IN_PROGRESS" :in-progress :stop-requested :completed "STOP_REQUESTED" :submitted "SUBMITTED" :stopped "STOPPED" "FAILED" :failed})

(clojure.spec.alpha/def :portkey.aws.comprehend.invalid-request-exception/message (clojure.spec.alpha/and :portkey.aws.comprehend/string))
(clojure.spec.alpha/def :portkey.aws.comprehend/invalid-request-exception (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.comprehend.invalid-request-exception/message]))

(clojure.spec.alpha/def :portkey.aws.comprehend/start-entities-detection-job-response (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.comprehend/job-id :portkey.aws.comprehend/job-status]))

(clojure.spec.alpha/def :portkey.aws.comprehend/start-key-phrases-detection-job-response (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.comprehend/job-id :portkey.aws.comprehend/job-status]))

(clojure.spec.alpha/def :portkey.aws.comprehend.start-dominant-language-detection-job-request/data-access-role-arn (clojure.spec.alpha/and :portkey.aws.comprehend/iam-role-arn))
(clojure.spec.alpha/def :portkey.aws.comprehend.start-dominant-language-detection-job-request/client-request-token (clojure.spec.alpha/and :portkey.aws.comprehend/client-request-token-string))
(clojure.spec.alpha/def :portkey.aws.comprehend/start-dominant-language-detection-job-request (clojure.spec.alpha/keys :req-un [:portkey.aws.comprehend/input-data-config :portkey.aws.comprehend/output-data-config :portkey.aws.comprehend.start-dominant-language-detection-job-request/data-access-role-arn] :opt-un [:portkey.aws.comprehend/job-name :portkey.aws.comprehend.start-dominant-language-detection-job-request/client-request-token]))

(clojure.spec.alpha/def :portkey.aws.comprehend.batch-detect-key-phrases-request/text-list (clojure.spec.alpha/and :portkey.aws.comprehend/string-list))
(clojure.spec.alpha/def :portkey.aws.comprehend/batch-detect-key-phrases-request (clojure.spec.alpha/keys :req-un [:portkey.aws.comprehend.batch-detect-key-phrases-request/text-list :portkey.aws.comprehend/language-code] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.comprehend/list-of-detect-dominant-language-result (clojure.spec.alpha/coll-of :portkey.aws.comprehend/batch-detect-dominant-language-item-result))

(clojure.spec.alpha/def :portkey.aws.comprehend.detect-sentiment-response/sentiment (clojure.spec.alpha/and :portkey.aws.comprehend/sentiment-type))
(clojure.spec.alpha/def :portkey.aws.comprehend/detect-sentiment-response (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.comprehend.detect-sentiment-response/sentiment :portkey.aws.comprehend/sentiment-score]))

(clojure.spec.alpha/def :portkey.aws.comprehend/sentiment-type #{:neutral :positive :negative "MIXED" "NEUTRAL" :mixed "NEGATIVE" "POSITIVE"})

(clojure.spec.alpha/def :portkey.aws.comprehend.detect-key-phrases-request/text (clojure.spec.alpha/and :portkey.aws.comprehend/string))
(clojure.spec.alpha/def :portkey.aws.comprehend/detect-key-phrases-request (clojure.spec.alpha/keys :req-un [:portkey.aws.comprehend.detect-key-phrases-request/text :portkey.aws.comprehend/language-code] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.comprehend/describe-dominant-language-detection-job-request (clojure.spec.alpha/keys :req-un [:portkey.aws.comprehend/job-id] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.comprehend.sentiment-score/positive (clojure.spec.alpha/and :portkey.aws.comprehend/float))
(clojure.spec.alpha/def :portkey.aws.comprehend.sentiment-score/negative (clojure.spec.alpha/and :portkey.aws.comprehend/float))
(clojure.spec.alpha/def :portkey.aws.comprehend.sentiment-score/neutral (clojure.spec.alpha/and :portkey.aws.comprehend/float))
(clojure.spec.alpha/def :portkey.aws.comprehend.sentiment-score/mixed (clojure.spec.alpha/and :portkey.aws.comprehend/float))
(clojure.spec.alpha/def :portkey.aws.comprehend/sentiment-score (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.comprehend.sentiment-score/positive :portkey.aws.comprehend.sentiment-score/negative :portkey.aws.comprehend.sentiment-score/neutral :portkey.aws.comprehend.sentiment-score/mixed]))

(clojure.spec.alpha/def :portkey.aws.comprehend.batch-detect-dominant-language-item-result/index (clojure.spec.alpha/and :portkey.aws.comprehend/integer))
(clojure.spec.alpha/def :portkey.aws.comprehend.batch-detect-dominant-language-item-result/languages (clojure.spec.alpha/and :portkey.aws.comprehend/list-of-dominant-languages))
(clojure.spec.alpha/def :portkey.aws.comprehend/batch-detect-dominant-language-item-result (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.comprehend.batch-detect-dominant-language-item-result/index :portkey.aws.comprehend.batch-detect-dominant-language-item-result/languages]))

(clojure.spec.alpha/def :portkey.aws.comprehend/job-name (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__27879__auto__] (clojure.core/<= 1 (clojure.core/count s__27879__auto__))) (clojure.core/fn [s__27880__auto__] (clojure.core/< (clojure.core/count s__27880__auto__) 256)) (clojure.core/fn [s__27881__auto__] (clojure.core/re-matches #"^([\p{L}\p{Z}\p{N}_.:/=+\-%@]*)$" s__27881__auto__))))

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

(clojure.spec.alpha/def :portkey.aws.comprehend/s-3-uri (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__27880__auto__] (clojure.core/< (clojure.core/count s__27880__auto__) 1024)) (clojure.core/fn [s__27881__auto__] (clojure.core/re-matches #"s3://[a-z0-9][\.\-a-z0-9]{1,61}[a-z0-9](/.*)?" s__27881__auto__))))

(clojure.spec.alpha/def :portkey.aws.comprehend.detect-key-phrases-response/key-phrases (clojure.spec.alpha/and :portkey.aws.comprehend/list-of-key-phrases))
(clojure.spec.alpha/def :portkey.aws.comprehend/detect-key-phrases-response (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.comprehend.detect-key-phrases-response/key-phrases]))

(clojure.spec.alpha/def :portkey.aws.comprehend.batch-detect-dominant-language-request/text-list (clojure.spec.alpha/and :portkey.aws.comprehend/string-list))
(clojure.spec.alpha/def :portkey.aws.comprehend/batch-detect-dominant-language-request (clojure.spec.alpha/keys :req-un [:portkey.aws.comprehend.batch-detect-dominant-language-request/text-list] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.comprehend.batch-detect-syntax-response/result-list (clojure.spec.alpha/and :portkey.aws.comprehend/list-of-detect-syntax-result))
(clojure.spec.alpha/def :portkey.aws.comprehend.batch-detect-syntax-response/error-list (clojure.spec.alpha/and :portkey.aws.comprehend/batch-item-error-list))
(clojure.spec.alpha/def :portkey.aws.comprehend/batch-detect-syntax-response (clojure.spec.alpha/keys :req-un [:portkey.aws.comprehend.batch-detect-syntax-response/result-list :portkey.aws.comprehend.batch-detect-syntax-response/error-list] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.comprehend.invalid-filter-exception/message (clojure.spec.alpha/and :portkey.aws.comprehend/string))
(clojure.spec.alpha/def :portkey.aws.comprehend/invalid-filter-exception (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.comprehend.invalid-filter-exception/message]))

(clojure.spec.alpha/def :portkey.aws.comprehend/describe-sentiment-detection-job-response (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.comprehend/sentiment-detection-job-properties]))

(clojure.spec.alpha/def :portkey.aws.comprehend.detect-syntax-request/text (clojure.spec.alpha/and :portkey.aws.comprehend/string))
(clojure.spec.alpha/def :portkey.aws.comprehend.detect-syntax-request/language-code (clojure.spec.alpha/and :portkey.aws.comprehend/syntax-language-code))
(clojure.spec.alpha/def :portkey.aws.comprehend/detect-syntax-request (clojure.spec.alpha/keys :req-un [:portkey.aws.comprehend.detect-syntax-request/text :portkey.aws.comprehend.detect-syntax-request/language-code] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.comprehend.start-entities-detection-job-request/data-access-role-arn (clojure.spec.alpha/and :portkey.aws.comprehend/iam-role-arn))
(clojure.spec.alpha/def :portkey.aws.comprehend.start-entities-detection-job-request/client-request-token (clojure.spec.alpha/and :portkey.aws.comprehend/client-request-token-string))
(clojure.spec.alpha/def :portkey.aws.comprehend/start-entities-detection-job-request (clojure.spec.alpha/keys :req-un [:portkey.aws.comprehend/input-data-config :portkey.aws.comprehend/output-data-config :portkey.aws.comprehend.start-entities-detection-job-request/data-access-role-arn :portkey.aws.comprehend/language-code] :opt-un [:portkey.aws.comprehend/job-name :portkey.aws.comprehend.start-entities-detection-job-request/client-request-token]))

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

(clojure.spec.alpha/def :portkey.aws.comprehend/iam-role-arn (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__27881__auto__] (clojure.core/re-matches #"arn:aws(-[^:]+)?:iam::[0-9]{12}:role/.+" s__27881__auto__))))

(clojure.spec.alpha/def :portkey.aws.comprehend.list-topics-detection-jobs-request/filter (clojure.spec.alpha/and :portkey.aws.comprehend/topics-detection-job-filter))
(clojure.spec.alpha/def :portkey.aws.comprehend.list-topics-detection-jobs-request/next-token (clojure.spec.alpha/and :portkey.aws.comprehend/string))
(clojure.spec.alpha/def :portkey.aws.comprehend.list-topics-detection-jobs-request/max-results (clojure.spec.alpha/and :portkey.aws.comprehend/max-results-integer))
(clojure.spec.alpha/def :portkey.aws.comprehend/list-topics-detection-jobs-request (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.comprehend.list-topics-detection-jobs-request/filter :portkey.aws.comprehend.list-topics-detection-jobs-request/next-token :portkey.aws.comprehend.list-topics-detection-jobs-request/max-results]))

(clojure.spec.alpha/def :portkey.aws.comprehend.start-key-phrases-detection-job-request/data-access-role-arn (clojure.spec.alpha/and :portkey.aws.comprehend/iam-role-arn))
(clojure.spec.alpha/def :portkey.aws.comprehend.start-key-phrases-detection-job-request/client-request-token (clojure.spec.alpha/and :portkey.aws.comprehend/client-request-token-string))
(clojure.spec.alpha/def :portkey.aws.comprehend/start-key-phrases-detection-job-request (clojure.spec.alpha/keys :req-un [:portkey.aws.comprehend/input-data-config :portkey.aws.comprehend/output-data-config :portkey.aws.comprehend.start-key-phrases-detection-job-request/data-access-role-arn :portkey.aws.comprehend/language-code] :opt-un [:portkey.aws.comprehend/job-name :portkey.aws.comprehend.start-key-phrases-detection-job-request/client-request-token]))

(clojure.spec.alpha/def :portkey.aws.comprehend/stop-entities-detection-job-request (clojure.spec.alpha/keys :req-un [:portkey.aws.comprehend/job-id] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.comprehend.entities-detection-job-filter/submit-time-before (clojure.spec.alpha/and :portkey.aws.comprehend/timestamp))
(clojure.spec.alpha/def :portkey.aws.comprehend.entities-detection-job-filter/submit-time-after (clojure.spec.alpha/and :portkey.aws.comprehend/timestamp))
(clojure.spec.alpha/def :portkey.aws.comprehend/entities-detection-job-filter (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.comprehend/job-name :portkey.aws.comprehend/job-status :portkey.aws.comprehend.entities-detection-job-filter/submit-time-before :portkey.aws.comprehend.entities-detection-job-filter/submit-time-after]))

(clojure.spec.alpha/def :portkey.aws.comprehend.list-entities-detection-jobs-request/filter (clojure.spec.alpha/and :portkey.aws.comprehend/entities-detection-job-filter))
(clojure.spec.alpha/def :portkey.aws.comprehend.list-entities-detection-jobs-request/next-token (clojure.spec.alpha/and :portkey.aws.comprehend/string))
(clojure.spec.alpha/def :portkey.aws.comprehend.list-entities-detection-jobs-request/max-results (clojure.spec.alpha/and :portkey.aws.comprehend/max-results-integer))
(clojure.spec.alpha/def :portkey.aws.comprehend/list-entities-detection-jobs-request (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.comprehend.list-entities-detection-jobs-request/filter :portkey.aws.comprehend.list-entities-detection-jobs-request/next-token :portkey.aws.comprehend.list-entities-detection-jobs-request/max-results]))

(clojure.spec.alpha/def :portkey.aws.comprehend.list-topics-detection-jobs-response/next-token (clojure.spec.alpha/and :portkey.aws.comprehend/string))
(clojure.spec.alpha/def :portkey.aws.comprehend/list-topics-detection-jobs-response (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.comprehend/topics-detection-job-properties-list :portkey.aws.comprehend.list-topics-detection-jobs-response/next-token]))

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

(clojure.spec.alpha/def :portkey.aws.comprehend/stop-key-phrases-detection-job-response (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.comprehend/job-id :portkey.aws.comprehend/job-status]))

(clojure.spec.alpha/def :portkey.aws.comprehend/language-code #{"en" :es :en "es"})

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

(clojure.spec.alpha/def :portkey.aws.comprehend.batch-detect-syntax-request/text-list (clojure.spec.alpha/and :portkey.aws.comprehend/string-list))
(clojure.spec.alpha/def :portkey.aws.comprehend.batch-detect-syntax-request/language-code (clojure.spec.alpha/and :portkey.aws.comprehend/syntax-language-code))
(clojure.spec.alpha/def :portkey.aws.comprehend/batch-detect-syntax-request (clojure.spec.alpha/keys :req-un [:portkey.aws.comprehend.batch-detect-syntax-request/text-list :portkey.aws.comprehend.batch-detect-syntax-request/language-code] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.comprehend/list-of-detect-sentiment-result (clojure.spec.alpha/coll-of :portkey.aws.comprehend/batch-detect-sentiment-item-result))

(clojure.spec.alpha/def :portkey.aws.comprehend/key-phrases-detection-job-properties-list (clojure.spec.alpha/coll-of :portkey.aws.comprehend/key-phrases-detection-job-properties))

(clojure.spec.alpha/def :portkey.aws.comprehend/integer clojure.core/int?)

(clojure.spec.alpha/def :portkey.aws.comprehend/string (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__27879__auto__] (clojure.core/<= 1 (clojure.core/count s__27879__auto__)))))

(clojure.spec.alpha/def :portkey.aws.comprehend.batch-detect-entities-item-result/index (clojure.spec.alpha/and :portkey.aws.comprehend/integer))
(clojure.spec.alpha/def :portkey.aws.comprehend.batch-detect-entities-item-result/entities (clojure.spec.alpha/and :portkey.aws.comprehend/list-of-entities))
(clojure.spec.alpha/def :portkey.aws.comprehend/batch-detect-entities-item-result (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.comprehend.batch-detect-entities-item-result/index :portkey.aws.comprehend.batch-detect-entities-item-result/entities]))

(clojure.spec.alpha/def :portkey.aws.comprehend.detect-entities-request/text (clojure.spec.alpha/and :portkey.aws.comprehend/string))
(clojure.spec.alpha/def :portkey.aws.comprehend/detect-entities-request (clojure.spec.alpha/keys :req-un [:portkey.aws.comprehend.detect-entities-request/text :portkey.aws.comprehend/language-code] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.comprehend/number-of-topics-integer (clojure.spec.alpha/int-in 1 100))

(clojure.spec.alpha/def :portkey.aws.comprehend.batch-detect-sentiment-response/result-list (clojure.spec.alpha/and :portkey.aws.comprehend/list-of-detect-sentiment-result))
(clojure.spec.alpha/def :portkey.aws.comprehend.batch-detect-sentiment-response/error-list (clojure.spec.alpha/and :portkey.aws.comprehend/batch-item-error-list))
(clojure.spec.alpha/def :portkey.aws.comprehend/batch-detect-sentiment-response (clojure.spec.alpha/keys :req-un [:portkey.aws.comprehend.batch-detect-sentiment-response/result-list :portkey.aws.comprehend.batch-detect-sentiment-response/error-list] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.comprehend.batch-detect-syntax-item-result/index (clojure.spec.alpha/and :portkey.aws.comprehend/integer))
(clojure.spec.alpha/def :portkey.aws.comprehend.batch-detect-syntax-item-result/syntax-tokens (clojure.spec.alpha/and :portkey.aws.comprehend/list-of-syntax-tokens))
(clojure.spec.alpha/def :portkey.aws.comprehend/batch-detect-syntax-item-result (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.comprehend.batch-detect-syntax-item-result/index :portkey.aws.comprehend.batch-detect-syntax-item-result/syntax-tokens]))

(clojure.spec.alpha/def :portkey.aws.comprehend.detect-entities-response/entities (clojure.spec.alpha/and :portkey.aws.comprehend/list-of-entities))
(clojure.spec.alpha/def :portkey.aws.comprehend/detect-entities-response (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.comprehend.detect-entities-response/entities]))

(clojure.spec.alpha/def :portkey.aws.comprehend.start-topics-detection-job-request/data-access-role-arn (clojure.spec.alpha/and :portkey.aws.comprehend/iam-role-arn))
(clojure.spec.alpha/def :portkey.aws.comprehend.start-topics-detection-job-request/number-of-topics (clojure.spec.alpha/and :portkey.aws.comprehend/number-of-topics-integer))
(clojure.spec.alpha/def :portkey.aws.comprehend.start-topics-detection-job-request/client-request-token (clojure.spec.alpha/and :portkey.aws.comprehend/client-request-token-string))
(clojure.spec.alpha/def :portkey.aws.comprehend/start-topics-detection-job-request (clojure.spec.alpha/keys :req-un [:portkey.aws.comprehend/input-data-config :portkey.aws.comprehend/output-data-config :portkey.aws.comprehend.start-topics-detection-job-request/data-access-role-arn] :opt-un [:portkey.aws.comprehend/job-name :portkey.aws.comprehend.start-topics-detection-job-request/number-of-topics :portkey.aws.comprehend.start-topics-detection-job-request/client-request-token]))

(clojure.spec.alpha/def :portkey.aws.comprehend.list-sentiment-detection-jobs-request/filter (clojure.spec.alpha/and :portkey.aws.comprehend/sentiment-detection-job-filter))
(clojure.spec.alpha/def :portkey.aws.comprehend.list-sentiment-detection-jobs-request/next-token (clojure.spec.alpha/and :portkey.aws.comprehend/string))
(clojure.spec.alpha/def :portkey.aws.comprehend.list-sentiment-detection-jobs-request/max-results (clojure.spec.alpha/and :portkey.aws.comprehend/max-results-integer))
(clojure.spec.alpha/def :portkey.aws.comprehend/list-sentiment-detection-jobs-request (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.comprehend.list-sentiment-detection-jobs-request/filter :portkey.aws.comprehend.list-sentiment-detection-jobs-request/next-token :portkey.aws.comprehend.list-sentiment-detection-jobs-request/max-results]))

(clojure.spec.alpha/def :portkey.aws.comprehend/stop-key-phrases-detection-job-request (clojure.spec.alpha/keys :req-un [:portkey.aws.comprehend/job-id] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.comprehend.batch-size-limit-exceeded-exception/message (clojure.spec.alpha/and :portkey.aws.comprehend/string))
(clojure.spec.alpha/def :portkey.aws.comprehend/batch-size-limit-exceeded-exception (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.comprehend.batch-size-limit-exceeded-exception/message]))

(clojure.spec.alpha/def :portkey.aws.comprehend/syntax-language-code #{"en" :en})

(clojure.spec.alpha/def :portkey.aws.comprehend/client-request-token-string (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__27879__auto__] (clojure.core/<= 1 (clojure.core/count s__27879__auto__))) (clojure.core/fn [s__27880__auto__] (clojure.core/< (clojure.core/count s__27880__auto__) 64)) (clojure.core/fn [s__27881__auto__] (clojure.core/re-matches #"^[a-zA-Z0-9-]+$" s__27881__auto__))))

(clojure.spec.alpha/def :portkey.aws.comprehend.batch-detect-sentiment-item-result/index (clojure.spec.alpha/and :portkey.aws.comprehend/integer))
(clojure.spec.alpha/def :portkey.aws.comprehend.batch-detect-sentiment-item-result/sentiment (clojure.spec.alpha/and :portkey.aws.comprehend/sentiment-type))
(clojure.spec.alpha/def :portkey.aws.comprehend/batch-detect-sentiment-item-result (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.comprehend.batch-detect-sentiment-item-result/index :portkey.aws.comprehend.batch-detect-sentiment-item-result/sentiment :portkey.aws.comprehend/sentiment-score]))

(clojure.spec.alpha/def :portkey.aws.comprehend.key-phrases-detection-job-filter/submit-time-before (clojure.spec.alpha/and :portkey.aws.comprehend/timestamp))
(clojure.spec.alpha/def :portkey.aws.comprehend.key-phrases-detection-job-filter/submit-time-after (clojure.spec.alpha/and :portkey.aws.comprehend/timestamp))
(clojure.spec.alpha/def :portkey.aws.comprehend/key-phrases-detection-job-filter (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.comprehend/job-name :portkey.aws.comprehend/job-status :portkey.aws.comprehend.key-phrases-detection-job-filter/submit-time-before :portkey.aws.comprehend.key-phrases-detection-job-filter/submit-time-after]))

(clojure.spec.alpha/def :portkey.aws.comprehend.sentiment-detection-job-filter/submit-time-before (clojure.spec.alpha/and :portkey.aws.comprehend/timestamp))
(clojure.spec.alpha/def :portkey.aws.comprehend.sentiment-detection-job-filter/submit-time-after (clojure.spec.alpha/and :portkey.aws.comprehend/timestamp))
(clojure.spec.alpha/def :portkey.aws.comprehend/sentiment-detection-job-filter (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.comprehend/job-name :portkey.aws.comprehend/job-status :portkey.aws.comprehend.sentiment-detection-job-filter/submit-time-before :portkey.aws.comprehend.sentiment-detection-job-filter/submit-time-after]))

(clojure.spec.alpha/def :portkey.aws.comprehend.list-dominant-language-detection-jobs-response/next-token (clojure.spec.alpha/and :portkey.aws.comprehend/string))
(clojure.spec.alpha/def :portkey.aws.comprehend/list-dominant-language-detection-jobs-response (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.comprehend/dominant-language-detection-job-properties-list :portkey.aws.comprehend.list-dominant-language-detection-jobs-response/next-token]))

(clojure.spec.alpha/def :portkey.aws.comprehend/describe-key-phrases-detection-job-request (clojure.spec.alpha/keys :req-un [:portkey.aws.comprehend/job-id] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.comprehend.detect-sentiment-request/text (clojure.spec.alpha/and :portkey.aws.comprehend/string))
(clojure.spec.alpha/def :portkey.aws.comprehend/detect-sentiment-request (clojure.spec.alpha/keys :req-un [:portkey.aws.comprehend.detect-sentiment-request/text :portkey.aws.comprehend/language-code] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.comprehend/timestamp clojure.core/inst?)

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

(clojure.spec.alpha/def :portkey.aws.comprehend.job-not-found-exception/message (clojure.spec.alpha/and :portkey.aws.comprehend/string))
(clojure.spec.alpha/def :portkey.aws.comprehend/job-not-found-exception (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.comprehend.job-not-found-exception/message]))

(clojure.spec.alpha/def :portkey.aws.comprehend/sentiment-detection-job-properties-list (clojure.spec.alpha/coll-of :portkey.aws.comprehend/sentiment-detection-job-properties))

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
(clojure.spec.alpha/def :portkey.aws.comprehend/entities-detection-job-properties (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.comprehend/input-data-config :portkey.aws.comprehend/output-data-config :portkey.aws.comprehend.entities-detection-job-properties/end-time :portkey.aws.comprehend/job-status :portkey.aws.comprehend/job-name :portkey.aws.comprehend.entities-detection-job-properties/submit-time :portkey.aws.comprehend/language-code :portkey.aws.comprehend.entities-detection-job-properties/message :portkey.aws.comprehend.entities-detection-job-properties/data-access-role-arn :portkey.aws.comprehend/job-id]))

(clojure.spec.alpha/def :portkey.aws.comprehend/max-results-integer (clojure.spec.alpha/int-in 1 500))

(clojure.spec.alpha/def :portkey.aws.comprehend/input-format #{"ONE_DOC_PER_FILE" "ONE_DOC_PER_LINE" :one-doc-per-line :one-doc-per-file})

(clojure.spec.alpha/def :portkey.aws.comprehend/entity-type #{:date "ORGANIZATION" "TITLE" :person :other "DATE" :commercial-item "PERSON" "EVENT" :organization :title "QUANTITY" "OTHER" "LOCATION" :event "COMMERCIAL_ITEM" :quantity :location})

(clojure.spec.alpha/def :portkey.aws.comprehend.list-dominant-language-detection-jobs-request/filter (clojure.spec.alpha/and :portkey.aws.comprehend/dominant-language-detection-job-filter))
(clojure.spec.alpha/def :portkey.aws.comprehend.list-dominant-language-detection-jobs-request/next-token (clojure.spec.alpha/and :portkey.aws.comprehend/string))
(clojure.spec.alpha/def :portkey.aws.comprehend.list-dominant-language-detection-jobs-request/max-results (clojure.spec.alpha/and :portkey.aws.comprehend/max-results-integer))
(clojure.spec.alpha/def :portkey.aws.comprehend/list-dominant-language-detection-jobs-request (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.comprehend.list-dominant-language-detection-jobs-request/filter :portkey.aws.comprehend.list-dominant-language-detection-jobs-request/next-token :portkey.aws.comprehend.list-dominant-language-detection-jobs-request/max-results]))

(clojure.spec.alpha/def :portkey.aws.comprehend/dominant-language-detection-job-properties-list (clojure.spec.alpha/coll-of :portkey.aws.comprehend/dominant-language-detection-job-properties))

(clojure.spec.alpha/def :portkey.aws.comprehend/float clojure.core/float?)

(clojure.spec.alpha/def :portkey.aws.comprehend.batch-detect-sentiment-request/text-list (clojure.spec.alpha/and :portkey.aws.comprehend/string-list))
(clojure.spec.alpha/def :portkey.aws.comprehend/batch-detect-sentiment-request (clojure.spec.alpha/keys :req-un [:portkey.aws.comprehend.batch-detect-sentiment-request/text-list :portkey.aws.comprehend/language-code] :opt-un []))

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

(clojure.spec.alpha/def :portkey.aws.comprehend/job-id (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__27879__auto__] (clojure.core/<= 1 (clojure.core/count s__27879__auto__))) (clojure.core/fn [s__27880__auto__] (clojure.core/< (clojure.core/count s__27880__auto__) 32))))

(clojure.core/defn stop-entities-detection-job ([stop-entities-detection-job-requestinput] (clojure.core/let [request-function-result__28581__auto__ (req-stop-entities-detection-job-request stop-entities-detection-job-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__28581__auto__ {:http.request.configuration/endpoints portkey.aws.comprehend/endpoints, :http.request.configuration/target-prefix "Comprehend_20171127", :http.request.spec/output-spec :portkey.aws.comprehend/stop-entities-detection-job-response, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2017-11-27", :http.request.configuration/service-id "Comprehend", :http.request.spec/input-spec :portkey.aws.comprehend/stop-entities-detection-job-request, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/action "StopEntitiesDetectionJob", :http.request.configuration/output-deser-fn deser-stop-entities-detection-job-response, :http.request.spec/error-spec {"InvalidRequestException" :portkey.aws.comprehend/invalid-request-exception, "JobNotFoundException" :portkey.aws.comprehend/job-not-found-exception, "InternalServerException" :portkey.aws.comprehend/internal-server-exception}})))))
(clojure.spec.alpha/fdef stop-entities-detection-job :args (clojure.spec.alpha/tuple :portkey.aws.comprehend/stop-entities-detection-job-request) :ret (clojure.spec.alpha/and :portkey.aws.comprehend/stop-entities-detection-job-response))

(clojure.core/defn list-sentiment-detection-jobs ([] (list-sentiment-detection-jobs {})) ([list-sentiment-detection-jobs-requestinput] (clojure.core/let [request-function-result__28581__auto__ (req-list-sentiment-detection-jobs-request list-sentiment-detection-jobs-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__28581__auto__ {:http.request.configuration/endpoints portkey.aws.comprehend/endpoints, :http.request.configuration/target-prefix "Comprehend_20171127", :http.request.spec/output-spec :portkey.aws.comprehend/list-sentiment-detection-jobs-response, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2017-11-27", :http.request.configuration/service-id "Comprehend", :http.request.spec/input-spec :portkey.aws.comprehend/list-sentiment-detection-jobs-request, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/action "ListSentimentDetectionJobs", :http.request.configuration/output-deser-fn deser-list-sentiment-detection-jobs-response, :http.request.spec/error-spec {"InvalidRequestException" :portkey.aws.comprehend/invalid-request-exception, "TooManyRequestsException" :portkey.aws.comprehend/too-many-requests-exception, "InvalidFilterException" :portkey.aws.comprehend/invalid-filter-exception, "InternalServerException" :portkey.aws.comprehend/internal-server-exception}})))))
(clojure.spec.alpha/fdef list-sentiment-detection-jobs :args (clojure.spec.alpha/? :portkey.aws.comprehend/list-sentiment-detection-jobs-request) :ret (clojure.spec.alpha/and :portkey.aws.comprehend/list-sentiment-detection-jobs-response))

(clojure.core/defn describe-key-phrases-detection-job ([describe-key-phrases-detection-job-requestinput] (clojure.core/let [request-function-result__28581__auto__ (req-describe-key-phrases-detection-job-request describe-key-phrases-detection-job-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__28581__auto__ {:http.request.configuration/endpoints portkey.aws.comprehend/endpoints, :http.request.configuration/target-prefix "Comprehend_20171127", :http.request.spec/output-spec :portkey.aws.comprehend/describe-key-phrases-detection-job-response, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2017-11-27", :http.request.configuration/service-id "Comprehend", :http.request.spec/input-spec :portkey.aws.comprehend/describe-key-phrases-detection-job-request, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/action "DescribeKeyPhrasesDetectionJob", :http.request.configuration/output-deser-fn deser-describe-key-phrases-detection-job-response, :http.request.spec/error-spec {"InvalidRequestException" :portkey.aws.comprehend/invalid-request-exception, "JobNotFoundException" :portkey.aws.comprehend/job-not-found-exception, "TooManyRequestsException" :portkey.aws.comprehend/too-many-requests-exception, "InternalServerException" :portkey.aws.comprehend/internal-server-exception}})))))
(clojure.spec.alpha/fdef describe-key-phrases-detection-job :args (clojure.spec.alpha/tuple :portkey.aws.comprehend/describe-key-phrases-detection-job-request) :ret (clojure.spec.alpha/and :portkey.aws.comprehend/describe-key-phrases-detection-job-response))

(clojure.core/defn list-dominant-language-detection-jobs ([] (list-dominant-language-detection-jobs {})) ([list-dominant-language-detection-jobs-requestinput] (clojure.core/let [request-function-result__28581__auto__ (req-list-dominant-language-detection-jobs-request list-dominant-language-detection-jobs-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__28581__auto__ {:http.request.configuration/endpoints portkey.aws.comprehend/endpoints, :http.request.configuration/target-prefix "Comprehend_20171127", :http.request.spec/output-spec :portkey.aws.comprehend/list-dominant-language-detection-jobs-response, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2017-11-27", :http.request.configuration/service-id "Comprehend", :http.request.spec/input-spec :portkey.aws.comprehend/list-dominant-language-detection-jobs-request, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/action "ListDominantLanguageDetectionJobs", :http.request.configuration/output-deser-fn deser-list-dominant-language-detection-jobs-response, :http.request.spec/error-spec {"InvalidRequestException" :portkey.aws.comprehend/invalid-request-exception, "TooManyRequestsException" :portkey.aws.comprehend/too-many-requests-exception, "InvalidFilterException" :portkey.aws.comprehend/invalid-filter-exception, "InternalServerException" :portkey.aws.comprehend/internal-server-exception}})))))
(clojure.spec.alpha/fdef list-dominant-language-detection-jobs :args (clojure.spec.alpha/? :portkey.aws.comprehend/list-dominant-language-detection-jobs-request) :ret (clojure.spec.alpha/and :portkey.aws.comprehend/list-dominant-language-detection-jobs-response))

(clojure.core/defn batch-detect-syntax ([batch-detect-syntax-requestinput] (clojure.core/let [request-function-result__28581__auto__ (req-batch-detect-syntax-request batch-detect-syntax-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__28581__auto__ {:http.request.configuration/endpoints portkey.aws.comprehend/endpoints, :http.request.configuration/target-prefix "Comprehend_20171127", :http.request.spec/output-spec :portkey.aws.comprehend/batch-detect-syntax-response, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2017-11-27", :http.request.configuration/service-id "Comprehend", :http.request.spec/input-spec :portkey.aws.comprehend/batch-detect-syntax-request, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/action "BatchDetectSyntax", :http.request.configuration/output-deser-fn deser-batch-detect-syntax-response, :http.request.spec/error-spec {"InvalidRequestException" :portkey.aws.comprehend/invalid-request-exception, "TextSizeLimitExceededException" :portkey.aws.comprehend/text-size-limit-exceeded-exception, "UnsupportedLanguageException" :portkey.aws.comprehend/unsupported-language-exception, "BatchSizeLimitExceededException" :portkey.aws.comprehend/batch-size-limit-exceeded-exception, "InternalServerException" :portkey.aws.comprehend/internal-server-exception}})))))
(clojure.spec.alpha/fdef batch-detect-syntax :args (clojure.spec.alpha/tuple :portkey.aws.comprehend/batch-detect-syntax-request) :ret (clojure.spec.alpha/and :portkey.aws.comprehend/batch-detect-syntax-response))

(clojure.core/defn start-key-phrases-detection-job ([start-key-phrases-detection-job-requestinput] (clojure.core/let [request-function-result__28581__auto__ (req-start-key-phrases-detection-job-request start-key-phrases-detection-job-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__28581__auto__ {:http.request.configuration/endpoints portkey.aws.comprehend/endpoints, :http.request.configuration/target-prefix "Comprehend_20171127", :http.request.spec/output-spec :portkey.aws.comprehend/start-key-phrases-detection-job-response, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2017-11-27", :http.request.configuration/service-id "Comprehend", :http.request.spec/input-spec :portkey.aws.comprehend/start-key-phrases-detection-job-request, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/action "StartKeyPhrasesDetectionJob", :http.request.configuration/output-deser-fn deser-start-key-phrases-detection-job-response, :http.request.spec/error-spec {"InvalidRequestException" :portkey.aws.comprehend/invalid-request-exception, "TooManyRequestsException" :portkey.aws.comprehend/too-many-requests-exception, "InternalServerException" :portkey.aws.comprehend/internal-server-exception}})))))
(clojure.spec.alpha/fdef start-key-phrases-detection-job :args (clojure.spec.alpha/tuple :portkey.aws.comprehend/start-key-phrases-detection-job-request) :ret (clojure.spec.alpha/and :portkey.aws.comprehend/start-key-phrases-detection-job-response))

(clojure.core/defn describe-entities-detection-job ([describe-entities-detection-job-requestinput] (clojure.core/let [request-function-result__28581__auto__ (req-describe-entities-detection-job-request describe-entities-detection-job-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__28581__auto__ {:http.request.configuration/endpoints portkey.aws.comprehend/endpoints, :http.request.configuration/target-prefix "Comprehend_20171127", :http.request.spec/output-spec :portkey.aws.comprehend/describe-entities-detection-job-response, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2017-11-27", :http.request.configuration/service-id "Comprehend", :http.request.spec/input-spec :portkey.aws.comprehend/describe-entities-detection-job-request, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/action "DescribeEntitiesDetectionJob", :http.request.configuration/output-deser-fn deser-describe-entities-detection-job-response, :http.request.spec/error-spec {"InvalidRequestException" :portkey.aws.comprehend/invalid-request-exception, "JobNotFoundException" :portkey.aws.comprehend/job-not-found-exception, "TooManyRequestsException" :portkey.aws.comprehend/too-many-requests-exception, "InternalServerException" :portkey.aws.comprehend/internal-server-exception}})))))
(clojure.spec.alpha/fdef describe-entities-detection-job :args (clojure.spec.alpha/tuple :portkey.aws.comprehend/describe-entities-detection-job-request) :ret (clojure.spec.alpha/and :portkey.aws.comprehend/describe-entities-detection-job-response))

(clojure.core/defn describe-sentiment-detection-job ([describe-sentiment-detection-job-requestinput] (clojure.core/let [request-function-result__28581__auto__ (req-describe-sentiment-detection-job-request describe-sentiment-detection-job-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__28581__auto__ {:http.request.configuration/endpoints portkey.aws.comprehend/endpoints, :http.request.configuration/target-prefix "Comprehend_20171127", :http.request.spec/output-spec :portkey.aws.comprehend/describe-sentiment-detection-job-response, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2017-11-27", :http.request.configuration/service-id "Comprehend", :http.request.spec/input-spec :portkey.aws.comprehend/describe-sentiment-detection-job-request, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/action "DescribeSentimentDetectionJob", :http.request.configuration/output-deser-fn deser-describe-sentiment-detection-job-response, :http.request.spec/error-spec {"InvalidRequestException" :portkey.aws.comprehend/invalid-request-exception, "JobNotFoundException" :portkey.aws.comprehend/job-not-found-exception, "TooManyRequestsException" :portkey.aws.comprehend/too-many-requests-exception, "InternalServerException" :portkey.aws.comprehend/internal-server-exception}})))))
(clojure.spec.alpha/fdef describe-sentiment-detection-job :args (clojure.spec.alpha/tuple :portkey.aws.comprehend/describe-sentiment-detection-job-request) :ret (clojure.spec.alpha/and :portkey.aws.comprehend/describe-sentiment-detection-job-response))

(clojure.core/defn stop-key-phrases-detection-job ([stop-key-phrases-detection-job-requestinput] (clojure.core/let [request-function-result__28581__auto__ (req-stop-key-phrases-detection-job-request stop-key-phrases-detection-job-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__28581__auto__ {:http.request.configuration/endpoints portkey.aws.comprehend/endpoints, :http.request.configuration/target-prefix "Comprehend_20171127", :http.request.spec/output-spec :portkey.aws.comprehend/stop-key-phrases-detection-job-response, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2017-11-27", :http.request.configuration/service-id "Comprehend", :http.request.spec/input-spec :portkey.aws.comprehend/stop-key-phrases-detection-job-request, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/action "StopKeyPhrasesDetectionJob", :http.request.configuration/output-deser-fn deser-stop-key-phrases-detection-job-response, :http.request.spec/error-spec {"InvalidRequestException" :portkey.aws.comprehend/invalid-request-exception, "JobNotFoundException" :portkey.aws.comprehend/job-not-found-exception, "InternalServerException" :portkey.aws.comprehend/internal-server-exception}})))))
(clojure.spec.alpha/fdef stop-key-phrases-detection-job :args (clojure.spec.alpha/tuple :portkey.aws.comprehend/stop-key-phrases-detection-job-request) :ret (clojure.spec.alpha/and :portkey.aws.comprehend/stop-key-phrases-detection-job-response))

(clojure.core/defn list-topics-detection-jobs ([] (list-topics-detection-jobs {})) ([list-topics-detection-jobs-requestinput] (clojure.core/let [request-function-result__28581__auto__ (req-list-topics-detection-jobs-request list-topics-detection-jobs-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__28581__auto__ {:http.request.configuration/endpoints portkey.aws.comprehend/endpoints, :http.request.configuration/target-prefix "Comprehend_20171127", :http.request.spec/output-spec :portkey.aws.comprehend/list-topics-detection-jobs-response, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2017-11-27", :http.request.configuration/service-id "Comprehend", :http.request.spec/input-spec :portkey.aws.comprehend/list-topics-detection-jobs-request, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/action "ListTopicsDetectionJobs", :http.request.configuration/output-deser-fn deser-list-topics-detection-jobs-response, :http.request.spec/error-spec {"InvalidRequestException" :portkey.aws.comprehend/invalid-request-exception, "TooManyRequestsException" :portkey.aws.comprehend/too-many-requests-exception, "InvalidFilterException" :portkey.aws.comprehend/invalid-filter-exception, "InternalServerException" :portkey.aws.comprehend/internal-server-exception}})))))
(clojure.spec.alpha/fdef list-topics-detection-jobs :args (clojure.spec.alpha/? :portkey.aws.comprehend/list-topics-detection-jobs-request) :ret (clojure.spec.alpha/and :portkey.aws.comprehend/list-topics-detection-jobs-response))

(clojure.core/defn describe-dominant-language-detection-job ([describe-dominant-language-detection-job-requestinput] (clojure.core/let [request-function-result__28581__auto__ (req-describe-dominant-language-detection-job-request describe-dominant-language-detection-job-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__28581__auto__ {:http.request.configuration/endpoints portkey.aws.comprehend/endpoints, :http.request.configuration/target-prefix "Comprehend_20171127", :http.request.spec/output-spec :portkey.aws.comprehend/describe-dominant-language-detection-job-response, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2017-11-27", :http.request.configuration/service-id "Comprehend", :http.request.spec/input-spec :portkey.aws.comprehend/describe-dominant-language-detection-job-request, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/action "DescribeDominantLanguageDetectionJob", :http.request.configuration/output-deser-fn deser-describe-dominant-language-detection-job-response, :http.request.spec/error-spec {"InvalidRequestException" :portkey.aws.comprehend/invalid-request-exception, "JobNotFoundException" :portkey.aws.comprehend/job-not-found-exception, "TooManyRequestsException" :portkey.aws.comprehend/too-many-requests-exception, "InternalServerException" :portkey.aws.comprehend/internal-server-exception}})))))
(clojure.spec.alpha/fdef describe-dominant-language-detection-job :args (clojure.spec.alpha/tuple :portkey.aws.comprehend/describe-dominant-language-detection-job-request) :ret (clojure.spec.alpha/and :portkey.aws.comprehend/describe-dominant-language-detection-job-response))

(clojure.core/defn describe-topics-detection-job ([describe-topics-detection-job-requestinput] (clojure.core/let [request-function-result__28581__auto__ (req-describe-topics-detection-job-request describe-topics-detection-job-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__28581__auto__ {:http.request.configuration/endpoints portkey.aws.comprehend/endpoints, :http.request.configuration/target-prefix "Comprehend_20171127", :http.request.spec/output-spec :portkey.aws.comprehend/describe-topics-detection-job-response, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2017-11-27", :http.request.configuration/service-id "Comprehend", :http.request.spec/input-spec :portkey.aws.comprehend/describe-topics-detection-job-request, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/action "DescribeTopicsDetectionJob", :http.request.configuration/output-deser-fn deser-describe-topics-detection-job-response, :http.request.spec/error-spec {"InvalidRequestException" :portkey.aws.comprehend/invalid-request-exception, "JobNotFoundException" :portkey.aws.comprehend/job-not-found-exception, "TooManyRequestsException" :portkey.aws.comprehend/too-many-requests-exception, "InternalServerException" :portkey.aws.comprehend/internal-server-exception}})))))
(clojure.spec.alpha/fdef describe-topics-detection-job :args (clojure.spec.alpha/tuple :portkey.aws.comprehend/describe-topics-detection-job-request) :ret (clojure.spec.alpha/and :portkey.aws.comprehend/describe-topics-detection-job-response))

(clojure.core/defn detect-entities ([detect-entities-requestinput] (clojure.core/let [request-function-result__28581__auto__ (req-detect-entities-request detect-entities-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__28581__auto__ {:http.request.configuration/endpoints portkey.aws.comprehend/endpoints, :http.request.configuration/target-prefix "Comprehend_20171127", :http.request.spec/output-spec :portkey.aws.comprehend/detect-entities-response, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2017-11-27", :http.request.configuration/service-id "Comprehend", :http.request.spec/input-spec :portkey.aws.comprehend/detect-entities-request, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/action "DetectEntities", :http.request.configuration/output-deser-fn deser-detect-entities-response, :http.request.spec/error-spec {"InvalidRequestException" :portkey.aws.comprehend/invalid-request-exception, "TextSizeLimitExceededException" :portkey.aws.comprehend/text-size-limit-exceeded-exception, "UnsupportedLanguageException" :portkey.aws.comprehend/unsupported-language-exception, "InternalServerException" :portkey.aws.comprehend/internal-server-exception}})))))
(clojure.spec.alpha/fdef detect-entities :args (clojure.spec.alpha/tuple :portkey.aws.comprehend/detect-entities-request) :ret (clojure.spec.alpha/and :portkey.aws.comprehend/detect-entities-response))

(clojure.core/defn stop-dominant-language-detection-job ([stop-dominant-language-detection-job-requestinput] (clojure.core/let [request-function-result__28581__auto__ (req-stop-dominant-language-detection-job-request stop-dominant-language-detection-job-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__28581__auto__ {:http.request.configuration/endpoints portkey.aws.comprehend/endpoints, :http.request.configuration/target-prefix "Comprehend_20171127", :http.request.spec/output-spec :portkey.aws.comprehend/stop-dominant-language-detection-job-response, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2017-11-27", :http.request.configuration/service-id "Comprehend", :http.request.spec/input-spec :portkey.aws.comprehend/stop-dominant-language-detection-job-request, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/action "StopDominantLanguageDetectionJob", :http.request.configuration/output-deser-fn deser-stop-dominant-language-detection-job-response, :http.request.spec/error-spec {"InvalidRequestException" :portkey.aws.comprehend/invalid-request-exception, "JobNotFoundException" :portkey.aws.comprehend/job-not-found-exception, "InternalServerException" :portkey.aws.comprehend/internal-server-exception}})))))
(clojure.spec.alpha/fdef stop-dominant-language-detection-job :args (clojure.spec.alpha/tuple :portkey.aws.comprehend/stop-dominant-language-detection-job-request) :ret (clojure.spec.alpha/and :portkey.aws.comprehend/stop-dominant-language-detection-job-response))

(clojure.core/defn detect-sentiment ([detect-sentiment-requestinput] (clojure.core/let [request-function-result__28581__auto__ (req-detect-sentiment-request detect-sentiment-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__28581__auto__ {:http.request.configuration/endpoints portkey.aws.comprehend/endpoints, :http.request.configuration/target-prefix "Comprehend_20171127", :http.request.spec/output-spec :portkey.aws.comprehend/detect-sentiment-response, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2017-11-27", :http.request.configuration/service-id "Comprehend", :http.request.spec/input-spec :portkey.aws.comprehend/detect-sentiment-request, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/action "DetectSentiment", :http.request.configuration/output-deser-fn deser-detect-sentiment-response, :http.request.spec/error-spec {"InvalidRequestException" :portkey.aws.comprehend/invalid-request-exception, "TextSizeLimitExceededException" :portkey.aws.comprehend/text-size-limit-exceeded-exception, "UnsupportedLanguageException" :portkey.aws.comprehend/unsupported-language-exception, "InternalServerException" :portkey.aws.comprehend/internal-server-exception}})))))
(clojure.spec.alpha/fdef detect-sentiment :args (clojure.spec.alpha/tuple :portkey.aws.comprehend/detect-sentiment-request) :ret (clojure.spec.alpha/and :portkey.aws.comprehend/detect-sentiment-response))

(clojure.core/defn detect-dominant-language ([detect-dominant-language-requestinput] (clojure.core/let [request-function-result__28581__auto__ (req-detect-dominant-language-request detect-dominant-language-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__28581__auto__ {:http.request.configuration/endpoints portkey.aws.comprehend/endpoints, :http.request.configuration/target-prefix "Comprehend_20171127", :http.request.spec/output-spec :portkey.aws.comprehend/detect-dominant-language-response, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2017-11-27", :http.request.configuration/service-id "Comprehend", :http.request.spec/input-spec :portkey.aws.comprehend/detect-dominant-language-request, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/action "DetectDominantLanguage", :http.request.configuration/output-deser-fn deser-detect-dominant-language-response, :http.request.spec/error-spec {"InvalidRequestException" :portkey.aws.comprehend/invalid-request-exception, "TextSizeLimitExceededException" :portkey.aws.comprehend/text-size-limit-exceeded-exception, "InternalServerException" :portkey.aws.comprehend/internal-server-exception}})))))
(clojure.spec.alpha/fdef detect-dominant-language :args (clojure.spec.alpha/tuple :portkey.aws.comprehend/detect-dominant-language-request) :ret (clojure.spec.alpha/and :portkey.aws.comprehend/detect-dominant-language-response))

(clojure.core/defn detect-syntax ([detect-syntax-requestinput] (clojure.core/let [request-function-result__28581__auto__ (req-detect-syntax-request detect-syntax-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__28581__auto__ {:http.request.configuration/endpoints portkey.aws.comprehend/endpoints, :http.request.configuration/target-prefix "Comprehend_20171127", :http.request.spec/output-spec :portkey.aws.comprehend/detect-syntax-response, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2017-11-27", :http.request.configuration/service-id "Comprehend", :http.request.spec/input-spec :portkey.aws.comprehend/detect-syntax-request, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/action "DetectSyntax", :http.request.configuration/output-deser-fn deser-detect-syntax-response, :http.request.spec/error-spec {"InvalidRequestException" :portkey.aws.comprehend/invalid-request-exception, "TextSizeLimitExceededException" :portkey.aws.comprehend/text-size-limit-exceeded-exception, "UnsupportedLanguageException" :portkey.aws.comprehend/unsupported-language-exception, "InternalServerException" :portkey.aws.comprehend/internal-server-exception}})))))
(clojure.spec.alpha/fdef detect-syntax :args (clojure.spec.alpha/tuple :portkey.aws.comprehend/detect-syntax-request) :ret (clojure.spec.alpha/and :portkey.aws.comprehend/detect-syntax-response))

(clojure.core/defn batch-detect-key-phrases ([batch-detect-key-phrases-requestinput] (clojure.core/let [request-function-result__28581__auto__ (req-batch-detect-key-phrases-request batch-detect-key-phrases-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__28581__auto__ {:http.request.configuration/endpoints portkey.aws.comprehend/endpoints, :http.request.configuration/target-prefix "Comprehend_20171127", :http.request.spec/output-spec :portkey.aws.comprehend/batch-detect-key-phrases-response, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2017-11-27", :http.request.configuration/service-id "Comprehend", :http.request.spec/input-spec :portkey.aws.comprehend/batch-detect-key-phrases-request, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/action "BatchDetectKeyPhrases", :http.request.configuration/output-deser-fn deser-batch-detect-key-phrases-response, :http.request.spec/error-spec {"InvalidRequestException" :portkey.aws.comprehend/invalid-request-exception, "TextSizeLimitExceededException" :portkey.aws.comprehend/text-size-limit-exceeded-exception, "UnsupportedLanguageException" :portkey.aws.comprehend/unsupported-language-exception, "BatchSizeLimitExceededException" :portkey.aws.comprehend/batch-size-limit-exceeded-exception, "InternalServerException" :portkey.aws.comprehend/internal-server-exception}})))))
(clojure.spec.alpha/fdef batch-detect-key-phrases :args (clojure.spec.alpha/tuple :portkey.aws.comprehend/batch-detect-key-phrases-request) :ret (clojure.spec.alpha/and :portkey.aws.comprehend/batch-detect-key-phrases-response))

(clojure.core/defn start-dominant-language-detection-job ([start-dominant-language-detection-job-requestinput] (clojure.core/let [request-function-result__28581__auto__ (req-start-dominant-language-detection-job-request start-dominant-language-detection-job-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__28581__auto__ {:http.request.configuration/endpoints portkey.aws.comprehend/endpoints, :http.request.configuration/target-prefix "Comprehend_20171127", :http.request.spec/output-spec :portkey.aws.comprehend/start-dominant-language-detection-job-response, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2017-11-27", :http.request.configuration/service-id "Comprehend", :http.request.spec/input-spec :portkey.aws.comprehend/start-dominant-language-detection-job-request, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/action "StartDominantLanguageDetectionJob", :http.request.configuration/output-deser-fn deser-start-dominant-language-detection-job-response, :http.request.spec/error-spec {"InvalidRequestException" :portkey.aws.comprehend/invalid-request-exception, "TooManyRequestsException" :portkey.aws.comprehend/too-many-requests-exception, "InternalServerException" :portkey.aws.comprehend/internal-server-exception}})))))
(clojure.spec.alpha/fdef start-dominant-language-detection-job :args (clojure.spec.alpha/tuple :portkey.aws.comprehend/start-dominant-language-detection-job-request) :ret (clojure.spec.alpha/and :portkey.aws.comprehend/start-dominant-language-detection-job-response))

(clojure.core/defn batch-detect-sentiment ([batch-detect-sentiment-requestinput] (clojure.core/let [request-function-result__28581__auto__ (req-batch-detect-sentiment-request batch-detect-sentiment-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__28581__auto__ {:http.request.configuration/endpoints portkey.aws.comprehend/endpoints, :http.request.configuration/target-prefix "Comprehend_20171127", :http.request.spec/output-spec :portkey.aws.comprehend/batch-detect-sentiment-response, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2017-11-27", :http.request.configuration/service-id "Comprehend", :http.request.spec/input-spec :portkey.aws.comprehend/batch-detect-sentiment-request, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/action "BatchDetectSentiment", :http.request.configuration/output-deser-fn deser-batch-detect-sentiment-response, :http.request.spec/error-spec {"InvalidRequestException" :portkey.aws.comprehend/invalid-request-exception, "TextSizeLimitExceededException" :portkey.aws.comprehend/text-size-limit-exceeded-exception, "UnsupportedLanguageException" :portkey.aws.comprehend/unsupported-language-exception, "BatchSizeLimitExceededException" :portkey.aws.comprehend/batch-size-limit-exceeded-exception, "InternalServerException" :portkey.aws.comprehend/internal-server-exception}})))))
(clojure.spec.alpha/fdef batch-detect-sentiment :args (clojure.spec.alpha/tuple :portkey.aws.comprehend/batch-detect-sentiment-request) :ret (clojure.spec.alpha/and :portkey.aws.comprehend/batch-detect-sentiment-response))

(clojure.core/defn start-sentiment-detection-job ([start-sentiment-detection-job-requestinput] (clojure.core/let [request-function-result__28581__auto__ (req-start-sentiment-detection-job-request start-sentiment-detection-job-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__28581__auto__ {:http.request.configuration/endpoints portkey.aws.comprehend/endpoints, :http.request.configuration/target-prefix "Comprehend_20171127", :http.request.spec/output-spec :portkey.aws.comprehend/start-sentiment-detection-job-response, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2017-11-27", :http.request.configuration/service-id "Comprehend", :http.request.spec/input-spec :portkey.aws.comprehend/start-sentiment-detection-job-request, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/action "StartSentimentDetectionJob", :http.request.configuration/output-deser-fn deser-start-sentiment-detection-job-response, :http.request.spec/error-spec {"InvalidRequestException" :portkey.aws.comprehend/invalid-request-exception, "TooManyRequestsException" :portkey.aws.comprehend/too-many-requests-exception, "InternalServerException" :portkey.aws.comprehend/internal-server-exception}})))))
(clojure.spec.alpha/fdef start-sentiment-detection-job :args (clojure.spec.alpha/tuple :portkey.aws.comprehend/start-sentiment-detection-job-request) :ret (clojure.spec.alpha/and :portkey.aws.comprehend/start-sentiment-detection-job-response))

(clojure.core/defn stop-sentiment-detection-job ([stop-sentiment-detection-job-requestinput] (clojure.core/let [request-function-result__28581__auto__ (req-stop-sentiment-detection-job-request stop-sentiment-detection-job-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__28581__auto__ {:http.request.configuration/endpoints portkey.aws.comprehend/endpoints, :http.request.configuration/target-prefix "Comprehend_20171127", :http.request.spec/output-spec :portkey.aws.comprehend/stop-sentiment-detection-job-response, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2017-11-27", :http.request.configuration/service-id "Comprehend", :http.request.spec/input-spec :portkey.aws.comprehend/stop-sentiment-detection-job-request, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/action "StopSentimentDetectionJob", :http.request.configuration/output-deser-fn deser-stop-sentiment-detection-job-response, :http.request.spec/error-spec {"InvalidRequestException" :portkey.aws.comprehend/invalid-request-exception, "JobNotFoundException" :portkey.aws.comprehend/job-not-found-exception, "InternalServerException" :portkey.aws.comprehend/internal-server-exception}})))))
(clojure.spec.alpha/fdef stop-sentiment-detection-job :args (clojure.spec.alpha/tuple :portkey.aws.comprehend/stop-sentiment-detection-job-request) :ret (clojure.spec.alpha/and :portkey.aws.comprehend/stop-sentiment-detection-job-response))

(clojure.core/defn list-entities-detection-jobs ([] (list-entities-detection-jobs {})) ([list-entities-detection-jobs-requestinput] (clojure.core/let [request-function-result__28581__auto__ (req-list-entities-detection-jobs-request list-entities-detection-jobs-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__28581__auto__ {:http.request.configuration/endpoints portkey.aws.comprehend/endpoints, :http.request.configuration/target-prefix "Comprehend_20171127", :http.request.spec/output-spec :portkey.aws.comprehend/list-entities-detection-jobs-response, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2017-11-27", :http.request.configuration/service-id "Comprehend", :http.request.spec/input-spec :portkey.aws.comprehend/list-entities-detection-jobs-request, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/action "ListEntitiesDetectionJobs", :http.request.configuration/output-deser-fn deser-list-entities-detection-jobs-response, :http.request.spec/error-spec {"InvalidRequestException" :portkey.aws.comprehend/invalid-request-exception, "TooManyRequestsException" :portkey.aws.comprehend/too-many-requests-exception, "InvalidFilterException" :portkey.aws.comprehend/invalid-filter-exception, "InternalServerException" :portkey.aws.comprehend/internal-server-exception}})))))
(clojure.spec.alpha/fdef list-entities-detection-jobs :args (clojure.spec.alpha/? :portkey.aws.comprehend/list-entities-detection-jobs-request) :ret (clojure.spec.alpha/and :portkey.aws.comprehend/list-entities-detection-jobs-response))

(clojure.core/defn detect-key-phrases ([detect-key-phrases-requestinput] (clojure.core/let [request-function-result__28581__auto__ (req-detect-key-phrases-request detect-key-phrases-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__28581__auto__ {:http.request.configuration/endpoints portkey.aws.comprehend/endpoints, :http.request.configuration/target-prefix "Comprehend_20171127", :http.request.spec/output-spec :portkey.aws.comprehend/detect-key-phrases-response, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2017-11-27", :http.request.configuration/service-id "Comprehend", :http.request.spec/input-spec :portkey.aws.comprehend/detect-key-phrases-request, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/action "DetectKeyPhrases", :http.request.configuration/output-deser-fn deser-detect-key-phrases-response, :http.request.spec/error-spec {"InvalidRequestException" :portkey.aws.comprehend/invalid-request-exception, "TextSizeLimitExceededException" :portkey.aws.comprehend/text-size-limit-exceeded-exception, "UnsupportedLanguageException" :portkey.aws.comprehend/unsupported-language-exception, "InternalServerException" :portkey.aws.comprehend/internal-server-exception}})))))
(clojure.spec.alpha/fdef detect-key-phrases :args (clojure.spec.alpha/tuple :portkey.aws.comprehend/detect-key-phrases-request) :ret (clojure.spec.alpha/and :portkey.aws.comprehend/detect-key-phrases-response))

(clojure.core/defn batch-detect-dominant-language ([batch-detect-dominant-language-requestinput] (clojure.core/let [request-function-result__28581__auto__ (req-batch-detect-dominant-language-request batch-detect-dominant-language-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__28581__auto__ {:http.request.configuration/endpoints portkey.aws.comprehend/endpoints, :http.request.configuration/target-prefix "Comprehend_20171127", :http.request.spec/output-spec :portkey.aws.comprehend/batch-detect-dominant-language-response, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2017-11-27", :http.request.configuration/service-id "Comprehend", :http.request.spec/input-spec :portkey.aws.comprehend/batch-detect-dominant-language-request, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/action "BatchDetectDominantLanguage", :http.request.configuration/output-deser-fn deser-batch-detect-dominant-language-response, :http.request.spec/error-spec {"InvalidRequestException" :portkey.aws.comprehend/invalid-request-exception, "TextSizeLimitExceededException" :portkey.aws.comprehend/text-size-limit-exceeded-exception, "BatchSizeLimitExceededException" :portkey.aws.comprehend/batch-size-limit-exceeded-exception, "InternalServerException" :portkey.aws.comprehend/internal-server-exception}})))))
(clojure.spec.alpha/fdef batch-detect-dominant-language :args (clojure.spec.alpha/tuple :portkey.aws.comprehend/batch-detect-dominant-language-request) :ret (clojure.spec.alpha/and :portkey.aws.comprehend/batch-detect-dominant-language-response))

(clojure.core/defn batch-detect-entities ([batch-detect-entities-requestinput] (clojure.core/let [request-function-result__28581__auto__ (req-batch-detect-entities-request batch-detect-entities-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__28581__auto__ {:http.request.configuration/endpoints portkey.aws.comprehend/endpoints, :http.request.configuration/target-prefix "Comprehend_20171127", :http.request.spec/output-spec :portkey.aws.comprehend/batch-detect-entities-response, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2017-11-27", :http.request.configuration/service-id "Comprehend", :http.request.spec/input-spec :portkey.aws.comprehend/batch-detect-entities-request, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/action "BatchDetectEntities", :http.request.configuration/output-deser-fn deser-batch-detect-entities-response, :http.request.spec/error-spec {"InvalidRequestException" :portkey.aws.comprehend/invalid-request-exception, "TextSizeLimitExceededException" :portkey.aws.comprehend/text-size-limit-exceeded-exception, "UnsupportedLanguageException" :portkey.aws.comprehend/unsupported-language-exception, "BatchSizeLimitExceededException" :portkey.aws.comprehend/batch-size-limit-exceeded-exception, "InternalServerException" :portkey.aws.comprehend/internal-server-exception}})))))
(clojure.spec.alpha/fdef batch-detect-entities :args (clojure.spec.alpha/tuple :portkey.aws.comprehend/batch-detect-entities-request) :ret (clojure.spec.alpha/and :portkey.aws.comprehend/batch-detect-entities-response))

(clojure.core/defn list-key-phrases-detection-jobs ([] (list-key-phrases-detection-jobs {})) ([list-key-phrases-detection-jobs-requestinput] (clojure.core/let [request-function-result__28581__auto__ (req-list-key-phrases-detection-jobs-request list-key-phrases-detection-jobs-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__28581__auto__ {:http.request.configuration/endpoints portkey.aws.comprehend/endpoints, :http.request.configuration/target-prefix "Comprehend_20171127", :http.request.spec/output-spec :portkey.aws.comprehend/list-key-phrases-detection-jobs-response, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2017-11-27", :http.request.configuration/service-id "Comprehend", :http.request.spec/input-spec :portkey.aws.comprehend/list-key-phrases-detection-jobs-request, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/action "ListKeyPhrasesDetectionJobs", :http.request.configuration/output-deser-fn deser-list-key-phrases-detection-jobs-response, :http.request.spec/error-spec {"InvalidRequestException" :portkey.aws.comprehend/invalid-request-exception, "TooManyRequestsException" :portkey.aws.comprehend/too-many-requests-exception, "InvalidFilterException" :portkey.aws.comprehend/invalid-filter-exception, "InternalServerException" :portkey.aws.comprehend/internal-server-exception}})))))
(clojure.spec.alpha/fdef list-key-phrases-detection-jobs :args (clojure.spec.alpha/? :portkey.aws.comprehend/list-key-phrases-detection-jobs-request) :ret (clojure.spec.alpha/and :portkey.aws.comprehend/list-key-phrases-detection-jobs-response))

(clojure.core/defn start-entities-detection-job ([start-entities-detection-job-requestinput] (clojure.core/let [request-function-result__28581__auto__ (req-start-entities-detection-job-request start-entities-detection-job-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__28581__auto__ {:http.request.configuration/endpoints portkey.aws.comprehend/endpoints, :http.request.configuration/target-prefix "Comprehend_20171127", :http.request.spec/output-spec :portkey.aws.comprehend/start-entities-detection-job-response, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2017-11-27", :http.request.configuration/service-id "Comprehend", :http.request.spec/input-spec :portkey.aws.comprehend/start-entities-detection-job-request, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/action "StartEntitiesDetectionJob", :http.request.configuration/output-deser-fn deser-start-entities-detection-job-response, :http.request.spec/error-spec {"InvalidRequestException" :portkey.aws.comprehend/invalid-request-exception, "TooManyRequestsException" :portkey.aws.comprehend/too-many-requests-exception, "InternalServerException" :portkey.aws.comprehend/internal-server-exception}})))))
(clojure.spec.alpha/fdef start-entities-detection-job :args (clojure.spec.alpha/tuple :portkey.aws.comprehend/start-entities-detection-job-request) :ret (clojure.spec.alpha/and :portkey.aws.comprehend/start-entities-detection-job-response))

(clojure.core/defn start-topics-detection-job ([start-topics-detection-job-requestinput] (clojure.core/let [request-function-result__28581__auto__ (req-start-topics-detection-job-request start-topics-detection-job-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__28581__auto__ {:http.request.configuration/endpoints portkey.aws.comprehend/endpoints, :http.request.configuration/target-prefix "Comprehend_20171127", :http.request.spec/output-spec :portkey.aws.comprehend/start-topics-detection-job-response, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2017-11-27", :http.request.configuration/service-id "Comprehend", :http.request.spec/input-spec :portkey.aws.comprehend/start-topics-detection-job-request, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/action "StartTopicsDetectionJob", :http.request.configuration/output-deser-fn deser-start-topics-detection-job-response, :http.request.spec/error-spec {"InvalidRequestException" :portkey.aws.comprehend/invalid-request-exception, "TooManyRequestsException" :portkey.aws.comprehend/too-many-requests-exception, "InternalServerException" :portkey.aws.comprehend/internal-server-exception}})))))
(clojure.spec.alpha/fdef start-topics-detection-job :args (clojure.spec.alpha/tuple :portkey.aws.comprehend/start-topics-detection-job-request) :ret (clojure.spec.alpha/and :portkey.aws.comprehend/start-topics-detection-job-response))
