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

(clojure.spec.alpha/def :portkey.aws.comprehend/job-name (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__27880__auto__] (clojure.core/<= 1 (clojure.core/count s__27880__auto__))) (clojure.core/fn [s__27881__auto__] (clojure.core/< (clojure.core/count s__27881__auto__) 256)) (clojure.core/fn [s__27882__auto__] (clojure.core/re-matches #"^([\p{L}\p{Z}\p{N}_.:/=+\-%@]*)$" s__27882__auto__))))

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

(clojure.spec.alpha/def :portkey.aws.comprehend/s-3-uri (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__27881__auto__] (clojure.core/< (clojure.core/count s__27881__auto__) 1024)) (clojure.core/fn [s__27882__auto__] (clojure.core/re-matches #"s3://[a-z0-9][\.\-a-z0-9]{1,61}[a-z0-9](/.*)?" s__27882__auto__))))

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

(clojure.spec.alpha/def :portkey.aws.comprehend/iam-role-arn (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__27882__auto__] (clojure.core/re-matches #"arn:aws(-[^:]+)?:iam::[0-9]{12}:role/.+" s__27882__auto__))))

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

(clojure.spec.alpha/def :portkey.aws.comprehend/string (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__27880__auto__] (clojure.core/<= 1 (clojure.core/count s__27880__auto__)))))

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

(clojure.spec.alpha/def :portkey.aws.comprehend/client-request-token-string (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__27880__auto__] (clojure.core/<= 1 (clojure.core/count s__27880__auto__))) (clojure.core/fn [s__27881__auto__] (clojure.core/< (clojure.core/count s__27881__auto__) 64)) (clojure.core/fn [s__27882__auto__] (clojure.core/re-matches #"^[a-zA-Z0-9-]+$" s__27882__auto__))))

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

(clojure.spec.alpha/def :portkey.aws.comprehend/job-id (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__27880__auto__] (clojure.core/<= 1 (clojure.core/count s__27880__auto__))) (clojure.core/fn [s__27881__auto__] (clojure.core/< (clojure.core/count s__27881__auto__) 32))))

(clojure.core/defn stop-entities-detection-job ([stop-entities-detection-job-requestinput] (clojure.core/let [request-function-result__28521__auto__ (req-stop-entities-detection-job-request stop-entities-detection-job-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__28521__auto__ {:http.request.configuration/endpoints portkey.aws.comprehend/endpoints, :http.request.configuration/target-prefix "Comprehend_20171127", :http.request.spec/output-spec :portkey.aws.comprehend/stop-entities-detection-job-response, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2017-11-27", :http.request.configuration/service-id "Comprehend", :http.request.spec/input-spec :portkey.aws.comprehend/stop-entities-detection-job-request, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/action "StopEntitiesDetectionJob", :http.request.spec/error-spec {"InvalidRequestException" :portkey.aws.comprehend/invalid-request-exception, "JobNotFoundException" :portkey.aws.comprehend/job-not-found-exception, "InternalServerException" :portkey.aws.comprehend/internal-server-exception}})))))
(clojure.spec.alpha/fdef stop-entities-detection-job :args (clojure.spec.alpha/tuple :portkey.aws.comprehend/stop-entities-detection-job-request) :ret (clojure.spec.alpha/and :portkey.aws.comprehend/stop-entities-detection-job-response))

(clojure.core/defn list-sentiment-detection-jobs ([] (list-sentiment-detection-jobs {})) ([list-sentiment-detection-jobs-requestinput] (clojure.core/let [request-function-result__28521__auto__ (req-list-sentiment-detection-jobs-request list-sentiment-detection-jobs-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__28521__auto__ {:http.request.configuration/endpoints portkey.aws.comprehend/endpoints, :http.request.configuration/target-prefix "Comprehend_20171127", :http.request.spec/output-spec :portkey.aws.comprehend/list-sentiment-detection-jobs-response, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2017-11-27", :http.request.configuration/service-id "Comprehend", :http.request.spec/input-spec :portkey.aws.comprehend/list-sentiment-detection-jobs-request, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/action "ListSentimentDetectionJobs", :http.request.spec/error-spec {"InvalidRequestException" :portkey.aws.comprehend/invalid-request-exception, "TooManyRequestsException" :portkey.aws.comprehend/too-many-requests-exception, "InvalidFilterException" :portkey.aws.comprehend/invalid-filter-exception, "InternalServerException" :portkey.aws.comprehend/internal-server-exception}})))))
(clojure.spec.alpha/fdef list-sentiment-detection-jobs :args (clojure.spec.alpha/? :portkey.aws.comprehend/list-sentiment-detection-jobs-request) :ret (clojure.spec.alpha/and :portkey.aws.comprehend/list-sentiment-detection-jobs-response))

(clojure.core/defn describe-key-phrases-detection-job ([describe-key-phrases-detection-job-requestinput] (clojure.core/let [request-function-result__28521__auto__ (req-describe-key-phrases-detection-job-request describe-key-phrases-detection-job-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__28521__auto__ {:http.request.configuration/endpoints portkey.aws.comprehend/endpoints, :http.request.configuration/target-prefix "Comprehend_20171127", :http.request.spec/output-spec :portkey.aws.comprehend/describe-key-phrases-detection-job-response, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2017-11-27", :http.request.configuration/service-id "Comprehend", :http.request.spec/input-spec :portkey.aws.comprehend/describe-key-phrases-detection-job-request, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/action "DescribeKeyPhrasesDetectionJob", :http.request.spec/error-spec {"InvalidRequestException" :portkey.aws.comprehend/invalid-request-exception, "JobNotFoundException" :portkey.aws.comprehend/job-not-found-exception, "TooManyRequestsException" :portkey.aws.comprehend/too-many-requests-exception, "InternalServerException" :portkey.aws.comprehend/internal-server-exception}})))))
(clojure.spec.alpha/fdef describe-key-phrases-detection-job :args (clojure.spec.alpha/tuple :portkey.aws.comprehend/describe-key-phrases-detection-job-request) :ret (clojure.spec.alpha/and :portkey.aws.comprehend/describe-key-phrases-detection-job-response))

(clojure.core/defn list-dominant-language-detection-jobs ([] (list-dominant-language-detection-jobs {})) ([list-dominant-language-detection-jobs-requestinput] (clojure.core/let [request-function-result__28521__auto__ (req-list-dominant-language-detection-jobs-request list-dominant-language-detection-jobs-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__28521__auto__ {:http.request.configuration/endpoints portkey.aws.comprehend/endpoints, :http.request.configuration/target-prefix "Comprehend_20171127", :http.request.spec/output-spec :portkey.aws.comprehend/list-dominant-language-detection-jobs-response, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2017-11-27", :http.request.configuration/service-id "Comprehend", :http.request.spec/input-spec :portkey.aws.comprehend/list-dominant-language-detection-jobs-request, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/action "ListDominantLanguageDetectionJobs", :http.request.spec/error-spec {"InvalidRequestException" :portkey.aws.comprehend/invalid-request-exception, "TooManyRequestsException" :portkey.aws.comprehend/too-many-requests-exception, "InvalidFilterException" :portkey.aws.comprehend/invalid-filter-exception, "InternalServerException" :portkey.aws.comprehend/internal-server-exception}})))))
(clojure.spec.alpha/fdef list-dominant-language-detection-jobs :args (clojure.spec.alpha/? :portkey.aws.comprehend/list-dominant-language-detection-jobs-request) :ret (clojure.spec.alpha/and :portkey.aws.comprehend/list-dominant-language-detection-jobs-response))

(clojure.core/defn batch-detect-syntax ([batch-detect-syntax-requestinput] (clojure.core/let [request-function-result__28521__auto__ (req-batch-detect-syntax-request batch-detect-syntax-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__28521__auto__ {:http.request.configuration/endpoints portkey.aws.comprehend/endpoints, :http.request.configuration/target-prefix "Comprehend_20171127", :http.request.spec/output-spec :portkey.aws.comprehend/batch-detect-syntax-response, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2017-11-27", :http.request.configuration/service-id "Comprehend", :http.request.spec/input-spec :portkey.aws.comprehend/batch-detect-syntax-request, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/action "BatchDetectSyntax", :http.request.spec/error-spec {"InvalidRequestException" :portkey.aws.comprehend/invalid-request-exception, "TextSizeLimitExceededException" :portkey.aws.comprehend/text-size-limit-exceeded-exception, "UnsupportedLanguageException" :portkey.aws.comprehend/unsupported-language-exception, "BatchSizeLimitExceededException" :portkey.aws.comprehend/batch-size-limit-exceeded-exception, "InternalServerException" :portkey.aws.comprehend/internal-server-exception}})))))
(clojure.spec.alpha/fdef batch-detect-syntax :args (clojure.spec.alpha/tuple :portkey.aws.comprehend/batch-detect-syntax-request) :ret (clojure.spec.alpha/and :portkey.aws.comprehend/batch-detect-syntax-response))

(clojure.core/defn start-key-phrases-detection-job ([start-key-phrases-detection-job-requestinput] (clojure.core/let [request-function-result__28521__auto__ (req-start-key-phrases-detection-job-request start-key-phrases-detection-job-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__28521__auto__ {:http.request.configuration/endpoints portkey.aws.comprehend/endpoints, :http.request.configuration/target-prefix "Comprehend_20171127", :http.request.spec/output-spec :portkey.aws.comprehend/start-key-phrases-detection-job-response, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2017-11-27", :http.request.configuration/service-id "Comprehend", :http.request.spec/input-spec :portkey.aws.comprehend/start-key-phrases-detection-job-request, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/action "StartKeyPhrasesDetectionJob", :http.request.spec/error-spec {"InvalidRequestException" :portkey.aws.comprehend/invalid-request-exception, "TooManyRequestsException" :portkey.aws.comprehend/too-many-requests-exception, "InternalServerException" :portkey.aws.comprehend/internal-server-exception}})))))
(clojure.spec.alpha/fdef start-key-phrases-detection-job :args (clojure.spec.alpha/tuple :portkey.aws.comprehend/start-key-phrases-detection-job-request) :ret (clojure.spec.alpha/and :portkey.aws.comprehend/start-key-phrases-detection-job-response))

(clojure.core/defn describe-entities-detection-job ([describe-entities-detection-job-requestinput] (clojure.core/let [request-function-result__28521__auto__ (req-describe-entities-detection-job-request describe-entities-detection-job-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__28521__auto__ {:http.request.configuration/endpoints portkey.aws.comprehend/endpoints, :http.request.configuration/target-prefix "Comprehend_20171127", :http.request.spec/output-spec :portkey.aws.comprehend/describe-entities-detection-job-response, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2017-11-27", :http.request.configuration/service-id "Comprehend", :http.request.spec/input-spec :portkey.aws.comprehend/describe-entities-detection-job-request, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/action "DescribeEntitiesDetectionJob", :http.request.spec/error-spec {"InvalidRequestException" :portkey.aws.comprehend/invalid-request-exception, "JobNotFoundException" :portkey.aws.comprehend/job-not-found-exception, "TooManyRequestsException" :portkey.aws.comprehend/too-many-requests-exception, "InternalServerException" :portkey.aws.comprehend/internal-server-exception}})))))
(clojure.spec.alpha/fdef describe-entities-detection-job :args (clojure.spec.alpha/tuple :portkey.aws.comprehend/describe-entities-detection-job-request) :ret (clojure.spec.alpha/and :portkey.aws.comprehend/describe-entities-detection-job-response))

(clojure.core/defn describe-sentiment-detection-job ([describe-sentiment-detection-job-requestinput] (clojure.core/let [request-function-result__28521__auto__ (req-describe-sentiment-detection-job-request describe-sentiment-detection-job-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__28521__auto__ {:http.request.configuration/endpoints portkey.aws.comprehend/endpoints, :http.request.configuration/target-prefix "Comprehend_20171127", :http.request.spec/output-spec :portkey.aws.comprehend/describe-sentiment-detection-job-response, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2017-11-27", :http.request.configuration/service-id "Comprehend", :http.request.spec/input-spec :portkey.aws.comprehend/describe-sentiment-detection-job-request, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/action "DescribeSentimentDetectionJob", :http.request.spec/error-spec {"InvalidRequestException" :portkey.aws.comprehend/invalid-request-exception, "JobNotFoundException" :portkey.aws.comprehend/job-not-found-exception, "TooManyRequestsException" :portkey.aws.comprehend/too-many-requests-exception, "InternalServerException" :portkey.aws.comprehend/internal-server-exception}})))))
(clojure.spec.alpha/fdef describe-sentiment-detection-job :args (clojure.spec.alpha/tuple :portkey.aws.comprehend/describe-sentiment-detection-job-request) :ret (clojure.spec.alpha/and :portkey.aws.comprehend/describe-sentiment-detection-job-response))

(clojure.core/defn stop-key-phrases-detection-job ([stop-key-phrases-detection-job-requestinput] (clojure.core/let [request-function-result__28521__auto__ (req-stop-key-phrases-detection-job-request stop-key-phrases-detection-job-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__28521__auto__ {:http.request.configuration/endpoints portkey.aws.comprehend/endpoints, :http.request.configuration/target-prefix "Comprehend_20171127", :http.request.spec/output-spec :portkey.aws.comprehend/stop-key-phrases-detection-job-response, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2017-11-27", :http.request.configuration/service-id "Comprehend", :http.request.spec/input-spec :portkey.aws.comprehend/stop-key-phrases-detection-job-request, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/action "StopKeyPhrasesDetectionJob", :http.request.spec/error-spec {"InvalidRequestException" :portkey.aws.comprehend/invalid-request-exception, "JobNotFoundException" :portkey.aws.comprehend/job-not-found-exception, "InternalServerException" :portkey.aws.comprehend/internal-server-exception}})))))
(clojure.spec.alpha/fdef stop-key-phrases-detection-job :args (clojure.spec.alpha/tuple :portkey.aws.comprehend/stop-key-phrases-detection-job-request) :ret (clojure.spec.alpha/and :portkey.aws.comprehend/stop-key-phrases-detection-job-response))

(clojure.core/defn list-topics-detection-jobs ([] (list-topics-detection-jobs {})) ([list-topics-detection-jobs-requestinput] (clojure.core/let [request-function-result__28521__auto__ (req-list-topics-detection-jobs-request list-topics-detection-jobs-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__28521__auto__ {:http.request.configuration/endpoints portkey.aws.comprehend/endpoints, :http.request.configuration/target-prefix "Comprehend_20171127", :http.request.spec/output-spec :portkey.aws.comprehend/list-topics-detection-jobs-response, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2017-11-27", :http.request.configuration/service-id "Comprehend", :http.request.spec/input-spec :portkey.aws.comprehend/list-topics-detection-jobs-request, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/action "ListTopicsDetectionJobs", :http.request.spec/error-spec {"InvalidRequestException" :portkey.aws.comprehend/invalid-request-exception, "TooManyRequestsException" :portkey.aws.comprehend/too-many-requests-exception, "InvalidFilterException" :portkey.aws.comprehend/invalid-filter-exception, "InternalServerException" :portkey.aws.comprehend/internal-server-exception}})))))
(clojure.spec.alpha/fdef list-topics-detection-jobs :args (clojure.spec.alpha/? :portkey.aws.comprehend/list-topics-detection-jobs-request) :ret (clojure.spec.alpha/and :portkey.aws.comprehend/list-topics-detection-jobs-response))

(clojure.core/defn describe-dominant-language-detection-job ([describe-dominant-language-detection-job-requestinput] (clojure.core/let [request-function-result__28521__auto__ (req-describe-dominant-language-detection-job-request describe-dominant-language-detection-job-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__28521__auto__ {:http.request.configuration/endpoints portkey.aws.comprehend/endpoints, :http.request.configuration/target-prefix "Comprehend_20171127", :http.request.spec/output-spec :portkey.aws.comprehend/describe-dominant-language-detection-job-response, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2017-11-27", :http.request.configuration/service-id "Comprehend", :http.request.spec/input-spec :portkey.aws.comprehend/describe-dominant-language-detection-job-request, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/action "DescribeDominantLanguageDetectionJob", :http.request.spec/error-spec {"InvalidRequestException" :portkey.aws.comprehend/invalid-request-exception, "JobNotFoundException" :portkey.aws.comprehend/job-not-found-exception, "TooManyRequestsException" :portkey.aws.comprehend/too-many-requests-exception, "InternalServerException" :portkey.aws.comprehend/internal-server-exception}})))))
(clojure.spec.alpha/fdef describe-dominant-language-detection-job :args (clojure.spec.alpha/tuple :portkey.aws.comprehend/describe-dominant-language-detection-job-request) :ret (clojure.spec.alpha/and :portkey.aws.comprehend/describe-dominant-language-detection-job-response))

(clojure.core/defn describe-topics-detection-job ([describe-topics-detection-job-requestinput] (clojure.core/let [request-function-result__28521__auto__ (req-describe-topics-detection-job-request describe-topics-detection-job-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__28521__auto__ {:http.request.configuration/endpoints portkey.aws.comprehend/endpoints, :http.request.configuration/target-prefix "Comprehend_20171127", :http.request.spec/output-spec :portkey.aws.comprehend/describe-topics-detection-job-response, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2017-11-27", :http.request.configuration/service-id "Comprehend", :http.request.spec/input-spec :portkey.aws.comprehend/describe-topics-detection-job-request, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/action "DescribeTopicsDetectionJob", :http.request.spec/error-spec {"InvalidRequestException" :portkey.aws.comprehend/invalid-request-exception, "JobNotFoundException" :portkey.aws.comprehend/job-not-found-exception, "TooManyRequestsException" :portkey.aws.comprehend/too-many-requests-exception, "InternalServerException" :portkey.aws.comprehend/internal-server-exception}})))))
(clojure.spec.alpha/fdef describe-topics-detection-job :args (clojure.spec.alpha/tuple :portkey.aws.comprehend/describe-topics-detection-job-request) :ret (clojure.spec.alpha/and :portkey.aws.comprehend/describe-topics-detection-job-response))

(clojure.core/defn detect-entities ([detect-entities-requestinput] (clojure.core/let [request-function-result__28521__auto__ (req-detect-entities-request detect-entities-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__28521__auto__ {:http.request.configuration/endpoints portkey.aws.comprehend/endpoints, :http.request.configuration/target-prefix "Comprehend_20171127", :http.request.spec/output-spec :portkey.aws.comprehend/detect-entities-response, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2017-11-27", :http.request.configuration/service-id "Comprehend", :http.request.spec/input-spec :portkey.aws.comprehend/detect-entities-request, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/action "DetectEntities", :http.request.spec/error-spec {"InvalidRequestException" :portkey.aws.comprehend/invalid-request-exception, "TextSizeLimitExceededException" :portkey.aws.comprehend/text-size-limit-exceeded-exception, "UnsupportedLanguageException" :portkey.aws.comprehend/unsupported-language-exception, "InternalServerException" :portkey.aws.comprehend/internal-server-exception}})))))
(clojure.spec.alpha/fdef detect-entities :args (clojure.spec.alpha/tuple :portkey.aws.comprehend/detect-entities-request) :ret (clojure.spec.alpha/and :portkey.aws.comprehend/detect-entities-response))

(clojure.core/defn stop-dominant-language-detection-job ([stop-dominant-language-detection-job-requestinput] (clojure.core/let [request-function-result__28521__auto__ (req-stop-dominant-language-detection-job-request stop-dominant-language-detection-job-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__28521__auto__ {:http.request.configuration/endpoints portkey.aws.comprehend/endpoints, :http.request.configuration/target-prefix "Comprehend_20171127", :http.request.spec/output-spec :portkey.aws.comprehend/stop-dominant-language-detection-job-response, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2017-11-27", :http.request.configuration/service-id "Comprehend", :http.request.spec/input-spec :portkey.aws.comprehend/stop-dominant-language-detection-job-request, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/action "StopDominantLanguageDetectionJob", :http.request.spec/error-spec {"InvalidRequestException" :portkey.aws.comprehend/invalid-request-exception, "JobNotFoundException" :portkey.aws.comprehend/job-not-found-exception, "InternalServerException" :portkey.aws.comprehend/internal-server-exception}})))))
(clojure.spec.alpha/fdef stop-dominant-language-detection-job :args (clojure.spec.alpha/tuple :portkey.aws.comprehend/stop-dominant-language-detection-job-request) :ret (clojure.spec.alpha/and :portkey.aws.comprehend/stop-dominant-language-detection-job-response))

(clojure.core/defn detect-sentiment ([detect-sentiment-requestinput] (clojure.core/let [request-function-result__28521__auto__ (req-detect-sentiment-request detect-sentiment-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__28521__auto__ {:http.request.configuration/endpoints portkey.aws.comprehend/endpoints, :http.request.configuration/target-prefix "Comprehend_20171127", :http.request.spec/output-spec :portkey.aws.comprehend/detect-sentiment-response, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2017-11-27", :http.request.configuration/service-id "Comprehend", :http.request.spec/input-spec :portkey.aws.comprehend/detect-sentiment-request, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/action "DetectSentiment", :http.request.spec/error-spec {"InvalidRequestException" :portkey.aws.comprehend/invalid-request-exception, "TextSizeLimitExceededException" :portkey.aws.comprehend/text-size-limit-exceeded-exception, "UnsupportedLanguageException" :portkey.aws.comprehend/unsupported-language-exception, "InternalServerException" :portkey.aws.comprehend/internal-server-exception}})))))
(clojure.spec.alpha/fdef detect-sentiment :args (clojure.spec.alpha/tuple :portkey.aws.comprehend/detect-sentiment-request) :ret (clojure.spec.alpha/and :portkey.aws.comprehend/detect-sentiment-response))

(clojure.core/defn detect-dominant-language ([detect-dominant-language-requestinput] (clojure.core/let [request-function-result__28521__auto__ (req-detect-dominant-language-request detect-dominant-language-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__28521__auto__ {:http.request.configuration/endpoints portkey.aws.comprehend/endpoints, :http.request.configuration/target-prefix "Comprehend_20171127", :http.request.spec/output-spec :portkey.aws.comprehend/detect-dominant-language-response, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2017-11-27", :http.request.configuration/service-id "Comprehend", :http.request.spec/input-spec :portkey.aws.comprehend/detect-dominant-language-request, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/action "DetectDominantLanguage", :http.request.spec/error-spec {"InvalidRequestException" :portkey.aws.comprehend/invalid-request-exception, "TextSizeLimitExceededException" :portkey.aws.comprehend/text-size-limit-exceeded-exception, "InternalServerException" :portkey.aws.comprehend/internal-server-exception}})))))
(clojure.spec.alpha/fdef detect-dominant-language :args (clojure.spec.alpha/tuple :portkey.aws.comprehend/detect-dominant-language-request) :ret (clojure.spec.alpha/and :portkey.aws.comprehend/detect-dominant-language-response))

(clojure.core/defn detect-syntax ([detect-syntax-requestinput] (clojure.core/let [request-function-result__28521__auto__ (req-detect-syntax-request detect-syntax-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__28521__auto__ {:http.request.configuration/endpoints portkey.aws.comprehend/endpoints, :http.request.configuration/target-prefix "Comprehend_20171127", :http.request.spec/output-spec :portkey.aws.comprehend/detect-syntax-response, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2017-11-27", :http.request.configuration/service-id "Comprehend", :http.request.spec/input-spec :portkey.aws.comprehend/detect-syntax-request, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/action "DetectSyntax", :http.request.spec/error-spec {"InvalidRequestException" :portkey.aws.comprehend/invalid-request-exception, "TextSizeLimitExceededException" :portkey.aws.comprehend/text-size-limit-exceeded-exception, "UnsupportedLanguageException" :portkey.aws.comprehend/unsupported-language-exception, "InternalServerException" :portkey.aws.comprehend/internal-server-exception}})))))
(clojure.spec.alpha/fdef detect-syntax :args (clojure.spec.alpha/tuple :portkey.aws.comprehend/detect-syntax-request) :ret (clojure.spec.alpha/and :portkey.aws.comprehend/detect-syntax-response))

(clojure.core/defn batch-detect-key-phrases ([batch-detect-key-phrases-requestinput] (clojure.core/let [request-function-result__28521__auto__ (req-batch-detect-key-phrases-request batch-detect-key-phrases-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__28521__auto__ {:http.request.configuration/endpoints portkey.aws.comprehend/endpoints, :http.request.configuration/target-prefix "Comprehend_20171127", :http.request.spec/output-spec :portkey.aws.comprehend/batch-detect-key-phrases-response, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2017-11-27", :http.request.configuration/service-id "Comprehend", :http.request.spec/input-spec :portkey.aws.comprehend/batch-detect-key-phrases-request, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/action "BatchDetectKeyPhrases", :http.request.spec/error-spec {"InvalidRequestException" :portkey.aws.comprehend/invalid-request-exception, "TextSizeLimitExceededException" :portkey.aws.comprehend/text-size-limit-exceeded-exception, "UnsupportedLanguageException" :portkey.aws.comprehend/unsupported-language-exception, "BatchSizeLimitExceededException" :portkey.aws.comprehend/batch-size-limit-exceeded-exception, "InternalServerException" :portkey.aws.comprehend/internal-server-exception}})))))
(clojure.spec.alpha/fdef batch-detect-key-phrases :args (clojure.spec.alpha/tuple :portkey.aws.comprehend/batch-detect-key-phrases-request) :ret (clojure.spec.alpha/and :portkey.aws.comprehend/batch-detect-key-phrases-response))

(clojure.core/defn start-dominant-language-detection-job ([start-dominant-language-detection-job-requestinput] (clojure.core/let [request-function-result__28521__auto__ (req-start-dominant-language-detection-job-request start-dominant-language-detection-job-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__28521__auto__ {:http.request.configuration/endpoints portkey.aws.comprehend/endpoints, :http.request.configuration/target-prefix "Comprehend_20171127", :http.request.spec/output-spec :portkey.aws.comprehend/start-dominant-language-detection-job-response, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2017-11-27", :http.request.configuration/service-id "Comprehend", :http.request.spec/input-spec :portkey.aws.comprehend/start-dominant-language-detection-job-request, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/action "StartDominantLanguageDetectionJob", :http.request.spec/error-spec {"InvalidRequestException" :portkey.aws.comprehend/invalid-request-exception, "TooManyRequestsException" :portkey.aws.comprehend/too-many-requests-exception, "InternalServerException" :portkey.aws.comprehend/internal-server-exception}})))))
(clojure.spec.alpha/fdef start-dominant-language-detection-job :args (clojure.spec.alpha/tuple :portkey.aws.comprehend/start-dominant-language-detection-job-request) :ret (clojure.spec.alpha/and :portkey.aws.comprehend/start-dominant-language-detection-job-response))

(clojure.core/defn batch-detect-sentiment ([batch-detect-sentiment-requestinput] (clojure.core/let [request-function-result__28521__auto__ (req-batch-detect-sentiment-request batch-detect-sentiment-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__28521__auto__ {:http.request.configuration/endpoints portkey.aws.comprehend/endpoints, :http.request.configuration/target-prefix "Comprehend_20171127", :http.request.spec/output-spec :portkey.aws.comprehend/batch-detect-sentiment-response, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2017-11-27", :http.request.configuration/service-id "Comprehend", :http.request.spec/input-spec :portkey.aws.comprehend/batch-detect-sentiment-request, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/action "BatchDetectSentiment", :http.request.spec/error-spec {"InvalidRequestException" :portkey.aws.comprehend/invalid-request-exception, "TextSizeLimitExceededException" :portkey.aws.comprehend/text-size-limit-exceeded-exception, "UnsupportedLanguageException" :portkey.aws.comprehend/unsupported-language-exception, "BatchSizeLimitExceededException" :portkey.aws.comprehend/batch-size-limit-exceeded-exception, "InternalServerException" :portkey.aws.comprehend/internal-server-exception}})))))
(clojure.spec.alpha/fdef batch-detect-sentiment :args (clojure.spec.alpha/tuple :portkey.aws.comprehend/batch-detect-sentiment-request) :ret (clojure.spec.alpha/and :portkey.aws.comprehend/batch-detect-sentiment-response))

(clojure.core/defn start-sentiment-detection-job ([start-sentiment-detection-job-requestinput] (clojure.core/let [request-function-result__28521__auto__ (req-start-sentiment-detection-job-request start-sentiment-detection-job-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__28521__auto__ {:http.request.configuration/endpoints portkey.aws.comprehend/endpoints, :http.request.configuration/target-prefix "Comprehend_20171127", :http.request.spec/output-spec :portkey.aws.comprehend/start-sentiment-detection-job-response, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2017-11-27", :http.request.configuration/service-id "Comprehend", :http.request.spec/input-spec :portkey.aws.comprehend/start-sentiment-detection-job-request, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/action "StartSentimentDetectionJob", :http.request.spec/error-spec {"InvalidRequestException" :portkey.aws.comprehend/invalid-request-exception, "TooManyRequestsException" :portkey.aws.comprehend/too-many-requests-exception, "InternalServerException" :portkey.aws.comprehend/internal-server-exception}})))))
(clojure.spec.alpha/fdef start-sentiment-detection-job :args (clojure.spec.alpha/tuple :portkey.aws.comprehend/start-sentiment-detection-job-request) :ret (clojure.spec.alpha/and :portkey.aws.comprehend/start-sentiment-detection-job-response))

(clojure.core/defn stop-sentiment-detection-job ([stop-sentiment-detection-job-requestinput] (clojure.core/let [request-function-result__28521__auto__ (req-stop-sentiment-detection-job-request stop-sentiment-detection-job-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__28521__auto__ {:http.request.configuration/endpoints portkey.aws.comprehend/endpoints, :http.request.configuration/target-prefix "Comprehend_20171127", :http.request.spec/output-spec :portkey.aws.comprehend/stop-sentiment-detection-job-response, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2017-11-27", :http.request.configuration/service-id "Comprehend", :http.request.spec/input-spec :portkey.aws.comprehend/stop-sentiment-detection-job-request, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/action "StopSentimentDetectionJob", :http.request.spec/error-spec {"InvalidRequestException" :portkey.aws.comprehend/invalid-request-exception, "JobNotFoundException" :portkey.aws.comprehend/job-not-found-exception, "InternalServerException" :portkey.aws.comprehend/internal-server-exception}})))))
(clojure.spec.alpha/fdef stop-sentiment-detection-job :args (clojure.spec.alpha/tuple :portkey.aws.comprehend/stop-sentiment-detection-job-request) :ret (clojure.spec.alpha/and :portkey.aws.comprehend/stop-sentiment-detection-job-response))

(clojure.core/defn list-entities-detection-jobs ([] (list-entities-detection-jobs {})) ([list-entities-detection-jobs-requestinput] (clojure.core/let [request-function-result__28521__auto__ (req-list-entities-detection-jobs-request list-entities-detection-jobs-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__28521__auto__ {:http.request.configuration/endpoints portkey.aws.comprehend/endpoints, :http.request.configuration/target-prefix "Comprehend_20171127", :http.request.spec/output-spec :portkey.aws.comprehend/list-entities-detection-jobs-response, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2017-11-27", :http.request.configuration/service-id "Comprehend", :http.request.spec/input-spec :portkey.aws.comprehend/list-entities-detection-jobs-request, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/action "ListEntitiesDetectionJobs", :http.request.spec/error-spec {"InvalidRequestException" :portkey.aws.comprehend/invalid-request-exception, "TooManyRequestsException" :portkey.aws.comprehend/too-many-requests-exception, "InvalidFilterException" :portkey.aws.comprehend/invalid-filter-exception, "InternalServerException" :portkey.aws.comprehend/internal-server-exception}})))))
(clojure.spec.alpha/fdef list-entities-detection-jobs :args (clojure.spec.alpha/? :portkey.aws.comprehend/list-entities-detection-jobs-request) :ret (clojure.spec.alpha/and :portkey.aws.comprehend/list-entities-detection-jobs-response))

(clojure.core/defn detect-key-phrases ([detect-key-phrases-requestinput] (clojure.core/let [request-function-result__28521__auto__ (req-detect-key-phrases-request detect-key-phrases-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__28521__auto__ {:http.request.configuration/endpoints portkey.aws.comprehend/endpoints, :http.request.configuration/target-prefix "Comprehend_20171127", :http.request.spec/output-spec :portkey.aws.comprehend/detect-key-phrases-response, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2017-11-27", :http.request.configuration/service-id "Comprehend", :http.request.spec/input-spec :portkey.aws.comprehend/detect-key-phrases-request, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/action "DetectKeyPhrases", :http.request.spec/error-spec {"InvalidRequestException" :portkey.aws.comprehend/invalid-request-exception, "TextSizeLimitExceededException" :portkey.aws.comprehend/text-size-limit-exceeded-exception, "UnsupportedLanguageException" :portkey.aws.comprehend/unsupported-language-exception, "InternalServerException" :portkey.aws.comprehend/internal-server-exception}})))))
(clojure.spec.alpha/fdef detect-key-phrases :args (clojure.spec.alpha/tuple :portkey.aws.comprehend/detect-key-phrases-request) :ret (clojure.spec.alpha/and :portkey.aws.comprehend/detect-key-phrases-response))

(clojure.core/defn batch-detect-dominant-language ([batch-detect-dominant-language-requestinput] (clojure.core/let [request-function-result__28521__auto__ (req-batch-detect-dominant-language-request batch-detect-dominant-language-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__28521__auto__ {:http.request.configuration/endpoints portkey.aws.comprehend/endpoints, :http.request.configuration/target-prefix "Comprehend_20171127", :http.request.spec/output-spec :portkey.aws.comprehend/batch-detect-dominant-language-response, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2017-11-27", :http.request.configuration/service-id "Comprehend", :http.request.spec/input-spec :portkey.aws.comprehend/batch-detect-dominant-language-request, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/action "BatchDetectDominantLanguage", :http.request.spec/error-spec {"InvalidRequestException" :portkey.aws.comprehend/invalid-request-exception, "TextSizeLimitExceededException" :portkey.aws.comprehend/text-size-limit-exceeded-exception, "BatchSizeLimitExceededException" :portkey.aws.comprehend/batch-size-limit-exceeded-exception, "InternalServerException" :portkey.aws.comprehend/internal-server-exception}})))))
(clojure.spec.alpha/fdef batch-detect-dominant-language :args (clojure.spec.alpha/tuple :portkey.aws.comprehend/batch-detect-dominant-language-request) :ret (clojure.spec.alpha/and :portkey.aws.comprehend/batch-detect-dominant-language-response))

(clojure.core/defn batch-detect-entities ([batch-detect-entities-requestinput] (clojure.core/let [request-function-result__28521__auto__ (req-batch-detect-entities-request batch-detect-entities-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__28521__auto__ {:http.request.configuration/endpoints portkey.aws.comprehend/endpoints, :http.request.configuration/target-prefix "Comprehend_20171127", :http.request.spec/output-spec :portkey.aws.comprehend/batch-detect-entities-response, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2017-11-27", :http.request.configuration/service-id "Comprehend", :http.request.spec/input-spec :portkey.aws.comprehend/batch-detect-entities-request, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/action "BatchDetectEntities", :http.request.spec/error-spec {"InvalidRequestException" :portkey.aws.comprehend/invalid-request-exception, "TextSizeLimitExceededException" :portkey.aws.comprehend/text-size-limit-exceeded-exception, "UnsupportedLanguageException" :portkey.aws.comprehend/unsupported-language-exception, "BatchSizeLimitExceededException" :portkey.aws.comprehend/batch-size-limit-exceeded-exception, "InternalServerException" :portkey.aws.comprehend/internal-server-exception}})))))
(clojure.spec.alpha/fdef batch-detect-entities :args (clojure.spec.alpha/tuple :portkey.aws.comprehend/batch-detect-entities-request) :ret (clojure.spec.alpha/and :portkey.aws.comprehend/batch-detect-entities-response))

(clojure.core/defn list-key-phrases-detection-jobs ([] (list-key-phrases-detection-jobs {})) ([list-key-phrases-detection-jobs-requestinput] (clojure.core/let [request-function-result__28521__auto__ (req-list-key-phrases-detection-jobs-request list-key-phrases-detection-jobs-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__28521__auto__ {:http.request.configuration/endpoints portkey.aws.comprehend/endpoints, :http.request.configuration/target-prefix "Comprehend_20171127", :http.request.spec/output-spec :portkey.aws.comprehend/list-key-phrases-detection-jobs-response, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2017-11-27", :http.request.configuration/service-id "Comprehend", :http.request.spec/input-spec :portkey.aws.comprehend/list-key-phrases-detection-jobs-request, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/action "ListKeyPhrasesDetectionJobs", :http.request.spec/error-spec {"InvalidRequestException" :portkey.aws.comprehend/invalid-request-exception, "TooManyRequestsException" :portkey.aws.comprehend/too-many-requests-exception, "InvalidFilterException" :portkey.aws.comprehend/invalid-filter-exception, "InternalServerException" :portkey.aws.comprehend/internal-server-exception}})))))
(clojure.spec.alpha/fdef list-key-phrases-detection-jobs :args (clojure.spec.alpha/? :portkey.aws.comprehend/list-key-phrases-detection-jobs-request) :ret (clojure.spec.alpha/and :portkey.aws.comprehend/list-key-phrases-detection-jobs-response))

(clojure.core/defn start-entities-detection-job ([start-entities-detection-job-requestinput] (clojure.core/let [request-function-result__28521__auto__ (req-start-entities-detection-job-request start-entities-detection-job-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__28521__auto__ {:http.request.configuration/endpoints portkey.aws.comprehend/endpoints, :http.request.configuration/target-prefix "Comprehend_20171127", :http.request.spec/output-spec :portkey.aws.comprehend/start-entities-detection-job-response, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2017-11-27", :http.request.configuration/service-id "Comprehend", :http.request.spec/input-spec :portkey.aws.comprehend/start-entities-detection-job-request, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/action "StartEntitiesDetectionJob", :http.request.spec/error-spec {"InvalidRequestException" :portkey.aws.comprehend/invalid-request-exception, "TooManyRequestsException" :portkey.aws.comprehend/too-many-requests-exception, "InternalServerException" :portkey.aws.comprehend/internal-server-exception}})))))
(clojure.spec.alpha/fdef start-entities-detection-job :args (clojure.spec.alpha/tuple :portkey.aws.comprehend/start-entities-detection-job-request) :ret (clojure.spec.alpha/and :portkey.aws.comprehend/start-entities-detection-job-response))

(clojure.core/defn start-topics-detection-job ([start-topics-detection-job-requestinput] (clojure.core/let [request-function-result__28521__auto__ (req-start-topics-detection-job-request start-topics-detection-job-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__28521__auto__ {:http.request.configuration/endpoints portkey.aws.comprehend/endpoints, :http.request.configuration/target-prefix "Comprehend_20171127", :http.request.spec/output-spec :portkey.aws.comprehend/start-topics-detection-job-response, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2017-11-27", :http.request.configuration/service-id "Comprehend", :http.request.spec/input-spec :portkey.aws.comprehend/start-topics-detection-job-request, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/action "StartTopicsDetectionJob", :http.request.spec/error-spec {"InvalidRequestException" :portkey.aws.comprehend/invalid-request-exception, "TooManyRequestsException" :portkey.aws.comprehend/too-many-requests-exception, "InternalServerException" :portkey.aws.comprehend/internal-server-exception}})))))
(clojure.spec.alpha/fdef start-topics-detection-job :args (clojure.spec.alpha/tuple :portkey.aws.comprehend/start-topics-detection-job-request) :ret (clojure.spec.alpha/and :portkey.aws.comprehend/start-topics-detection-job-response))
