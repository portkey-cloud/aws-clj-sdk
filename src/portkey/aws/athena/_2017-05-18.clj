(ns portkey.aws.athena.-2017-05-18 (:require [portkey.aws]))

(def
 endpoints
 '{"ap-northeast-1"
   {:credential-scope {:service "athena", :region "ap-northeast-1"},
    :ssl-common-name "athena.ap-northeast-1.amazonaws.com",
    :endpoint "https://athena.ap-northeast-1.amazonaws.com",
    :signature-version :v4},
   "eu-west-1"
   {:credential-scope {:service "athena", :region "eu-west-1"},
    :ssl-common-name "athena.eu-west-1.amazonaws.com",
    :endpoint "https://athena.eu-west-1.amazonaws.com",
    :signature-version :v4},
   "us-east-2"
   {:credential-scope {:service "athena", :region "us-east-2"},
    :ssl-common-name "athena.us-east-2.amazonaws.com",
    :endpoint "https://athena.us-east-2.amazonaws.com",
    :signature-version :v4},
   "ap-southeast-2"
   {:credential-scope {:service "athena", :region "ap-southeast-2"},
    :ssl-common-name "athena.ap-southeast-2.amazonaws.com",
    :endpoint "https://athena.ap-southeast-2.amazonaws.com",
    :signature-version :v4},
   "ap-southeast-1"
   {:credential-scope {:service "athena", :region "ap-southeast-1"},
    :ssl-common-name "athena.ap-southeast-1.amazonaws.com",
    :endpoint "https://athena.ap-southeast-1.amazonaws.com",
    :signature-version :v4},
   "ap-northeast-2"
   {:credential-scope {:service "athena", :region "ap-northeast-2"},
    :ssl-common-name "athena.ap-northeast-2.amazonaws.com",
    :endpoint "https://athena.ap-northeast-2.amazonaws.com",
    :signature-version :v4},
   "eu-central-1"
   {:credential-scope {:service "athena", :region "eu-central-1"},
    :ssl-common-name "athena.eu-central-1.amazonaws.com",
    :endpoint "https://athena.eu-central-1.amazonaws.com",
    :signature-version :v4},
   "eu-west-2"
   {:credential-scope {:service "athena", :region "eu-west-2"},
    :ssl-common-name "athena.eu-west-2.amazonaws.com",
    :endpoint "https://athena.eu-west-2.amazonaws.com",
    :signature-version :v4},
   "us-west-2"
   {:credential-scope {:service "athena", :region "us-west-2"},
    :ssl-common-name "athena.us-west-2.amazonaws.com",
    :endpoint "https://athena.us-west-2.amazonaws.com",
    :signature-version :v4},
   "us-east-1"
   {:credential-scope {:service "athena", :region "us-east-1"},
    :ssl-common-name "athena.us-east-1.amazonaws.com",
    :endpoint "https://athena.us-east-1.amazonaws.com",
    :signature-version :v4},
   "ap-south-1"
   {:credential-scope {:service "athena", :region "ap-south-1"},
    :ssl-common-name "athena.ap-south-1.amazonaws.com",
    :endpoint "https://athena.ap-south-1.amazonaws.com",
    :signature-version :v4}})

(clojure.core/declare ser-query-execution-id)

(clojure.core/declare ser-encryption-configuration)

(clojure.core/declare ser-named-query-id-list)

(clojure.core/declare ser-database-string)

(clojure.core/declare ser-encryption-option)

(clojure.core/declare ser-query-string)

(clojure.core/declare ser-named-query-id)

(clojure.core/declare ser-max-query-results)

(clojure.core/declare ser-query-execution-context)

(clojure.core/declare ser-query-execution-id-list)

(clojure.core/declare ser-max-query-executions-count)

(clojure.core/declare ser-string)

(clojure.core/declare ser-name-string)

(clojure.core/declare ser-description-string)

(clojure.core/declare ser-idempotency-token)

(clojure.core/declare ser-max-named-queries-count)

(clojure.core/declare ser-result-configuration)

(clojure.core/declare ser-token)

(clojure.core/defn- ser-query-execution-id [input] #:http.request.field{:value input, :shape "QueryExecutionId"})

(clojure.core/defn- ser-encryption-configuration [input] (clojure.core/cond-> #:http.request.field{:value [(clojure.core/into (ser-encryption-option (:encryption-option input)) #:http.request.field{:name "EncryptionOption", :shape "EncryptionOption"})], :shape "EncryptionConfiguration", :type "structure"} (clojure.core/contains? input :kms-key) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-string (input :kms-key)) #:http.request.field{:name "KmsKey", :shape "String"}))))

(clojure.core/defn- ser-named-query-id-list [input] #:http.request.field{:value (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (clojure.core/merge (ser-named-query-id coll) #:http.request.field{:shape "NamedQueryId"}))) input), :shape "NamedQueryIdList", :type "list", :max 50, :min 1})

(clojure.core/defn- ser-database-string [input] #:http.request.field{:value input, :shape "DatabaseString"})

(clojure.core/defn- ser-encryption-option [input] #:http.request.field{:value (clojure.core/get {"SSE_S3" "SSE_S3", :sse-s-3 "SSE_S3", "SSE_KMS" "SSE_KMS", :sse-kms "SSE_KMS", "CSE_KMS" "CSE_KMS", :cse-kms "CSE_KMS"} input), :shape "EncryptionOption"})

(clojure.core/defn- ser-query-string [input] #:http.request.field{:value input, :shape "QueryString"})

(clojure.core/defn- ser-named-query-id [input] #:http.request.field{:value input, :shape "NamedQueryId"})

(clojure.core/defn- ser-max-query-results [input] #:http.request.field{:value input, :shape "MaxQueryResults"})

(clojure.core/defn- ser-query-execution-context [input] (clojure.core/cond-> #:http.request.field{:value [], :shape "QueryExecutionContext", :type "structure"} (clojure.core/contains? input :database) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-database-string (input :database)) #:http.request.field{:name "Database", :shape "DatabaseString"}))))

(clojure.core/defn- ser-query-execution-id-list [input] #:http.request.field{:value (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (clojure.core/merge (ser-query-execution-id coll) #:http.request.field{:shape "QueryExecutionId"}))) input), :shape "QueryExecutionIdList", :type "list", :max 50, :min 1})

(clojure.core/defn- ser-max-query-executions-count [input] #:http.request.field{:value input, :shape "MaxQueryExecutionsCount"})

(clojure.core/defn- ser-string [input] #:http.request.field{:value input, :shape "String"})

(clojure.core/defn- ser-name-string [input] #:http.request.field{:value input, :shape "NameString"})

(clojure.core/defn- ser-description-string [input] #:http.request.field{:value input, :shape "DescriptionString"})

(clojure.core/defn- ser-idempotency-token [input] #:http.request.field{:value input, :shape "IdempotencyToken"})

(clojure.core/defn- ser-max-named-queries-count [input] #:http.request.field{:value input, :shape "MaxNamedQueriesCount"})

(clojure.core/defn- ser-result-configuration [input] (clojure.core/cond-> #:http.request.field{:value [(clojure.core/into (ser-string (:output-location input)) #:http.request.field{:name "OutputLocation", :shape "String"})], :shape "ResultConfiguration", :type "structure"} (clojure.core/contains? input :encryption-configuration) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-encryption-configuration (input :encryption-configuration)) #:http.request.field{:name "EncryptionConfiguration", :shape "EncryptionConfiguration"}))))

(clojure.core/defn- ser-token [input] #:http.request.field{:value input, :shape "Token"})

(clojure.core/defn- req-get-named-query-input [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (ser-named-query-id (input :named-query-id)) #:http.request.field{:name "NamedQueryId", :shape "NamedQueryId"})]}))

(clojure.core/defn- req-batch-get-query-execution-input [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (ser-query-execution-id-list (input :query-execution-ids)) #:http.request.field{:name "QueryExecutionIds", :shape "QueryExecutionIdList"})]}))

(clojure.core/defn- req-batch-get-named-query-input [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (ser-named-query-id-list (input :named-query-ids)) #:http.request.field{:name "NamedQueryIds", :shape "NamedQueryIdList"})]}))

(clojure.core/defn- req-get-query-execution-input [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (ser-query-execution-id (input :query-execution-id)) #:http.request.field{:name "QueryExecutionId", :shape "QueryExecutionId"})]}))

(clojure.core/defn- req-stop-query-execution-input [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (ser-query-execution-id (input :query-execution-id)) #:http.request.field{:name "QueryExecutionId", :shape "QueryExecutionId", :idempotency-token true})]}))

(clojure.core/defn- req-get-query-results-input [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (ser-query-execution-id (input :query-execution-id)) #:http.request.field{:name "QueryExecutionId", :shape "QueryExecutionId"})]} (clojure.core/contains? input :next-token) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-token (input :next-token)) #:http.request.field{:name "NextToken", :shape "Token"})) (clojure.core/contains? input :max-results) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-max-query-results (input :max-results)) #:http.request.field{:name "MaxResults", :shape "MaxQueryResults"}))))

(clojure.core/defn- req-create-named-query-input [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (ser-name-string (input :name)) #:http.request.field{:name "Name", :shape "NameString"}) (clojure.core/into (ser-database-string (input :database)) #:http.request.field{:name "Database", :shape "DatabaseString"}) (clojure.core/into (ser-query-string (input :query-string)) #:http.request.field{:name "QueryString", :shape "QueryString"})]} (clojure.core/contains? input :description) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-description-string (input :description)) #:http.request.field{:name "Description", :shape "DescriptionString"})) (clojure.core/contains? input :client-request-token) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-idempotency-token (input :client-request-token)) #:http.request.field{:name "ClientRequestToken", :shape "IdempotencyToken", :idempotency-token true}))))

(clojure.core/defn- req-start-query-execution-input [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (ser-query-string (input :query-string)) #:http.request.field{:name "QueryString", :shape "QueryString"}) (clojure.core/into (ser-result-configuration (input :result-configuration)) #:http.request.field{:name "ResultConfiguration", :shape "ResultConfiguration"})]} (clojure.core/contains? input :client-request-token) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-idempotency-token (input :client-request-token)) #:http.request.field{:name "ClientRequestToken", :shape "IdempotencyToken", :idempotency-token true})) (clojure.core/contains? input :query-execution-context) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-query-execution-context (input :query-execution-context)) #:http.request.field{:name "QueryExecutionContext", :shape "QueryExecutionContext"}))))

(clojure.core/defn- req-list-query-executions-input [input] (clojure.core/cond-> {} (clojure.core/contains? input :next-token) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-token (input :next-token)) #:http.request.field{:name "NextToken", :shape "Token"})) (clojure.core/contains? input :max-results) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-max-query-executions-count (input :max-results)) #:http.request.field{:name "MaxResults", :shape "MaxQueryExecutionsCount"}))))

(clojure.core/defn- req-list-named-queries-input [input] (clojure.core/cond-> {} (clojure.core/contains? input :next-token) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-token (input :next-token)) #:http.request.field{:name "NextToken", :shape "Token"})) (clojure.core/contains? input :max-results) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-max-named-queries-count (input :max-results)) #:http.request.field{:name "MaxResults", :shape "MaxNamedQueriesCount"}))))

(clojure.core/defn- req-delete-named-query-input [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (ser-named-query-id (input :named-query-id)) #:http.request.field{:name "NamedQueryId", :shape "NamedQueryId", :idempotency-token true})]}))

(clojure.spec.alpha/def :portkey.aws.athena.-2017-05-18/unprocessed-named-query-id (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.athena.-2017-05-18/named-query-id :portkey.aws.athena.-2017-05-18/error-code :portkey.aws.athena.-2017-05-18/error-message]))

(clojure.spec.alpha/def :portkey.aws.athena.-2017-05-18/stop-query-execution-output (clojure.spec.alpha/keys :req-un [] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.athena.-2017-05-18/query-execution-state #{:running :queued :cancelled "SUCCEEDED" "QUEUED" "FAILED" "CANCELLED" :failed "RUNNING" :succeeded})

(clojure.spec.alpha/def :portkey.aws.athena.-2017-05-18.invalid-request-exception/athena-error-code (clojure.spec.alpha/and :portkey.aws.athena.-2017-05-18/error-code))
(clojure.spec.alpha/def :portkey.aws.athena.-2017-05-18.invalid-request-exception/message (clojure.spec.alpha/and :portkey.aws.athena.-2017-05-18/error-message))
(clojure.spec.alpha/def :portkey.aws.athena.-2017-05-18/invalid-request-exception (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.athena.-2017-05-18.invalid-request-exception/athena-error-code :portkey.aws.athena.-2017-05-18.invalid-request-exception/message]))

(clojure.spec.alpha/def :portkey.aws.athena.-2017-05-18/query-execution-id (clojure.spec.alpha/and clojure.core/string?))

(clojure.spec.alpha/def :portkey.aws.athena.-2017-05-18.encryption-configuration/kms-key (clojure.spec.alpha/and :portkey.aws.athena.-2017-05-18/string))
(clojure.spec.alpha/def :portkey.aws.athena.-2017-05-18/encryption-configuration (clojure.spec.alpha/keys :req-un [:portkey.aws.athena.-2017-05-18/encryption-option] :opt-un [:portkey.aws.athena.-2017-05-18.encryption-configuration/kms-key]))

(clojure.spec.alpha/def :portkey.aws.athena.-2017-05-18/get-query-execution-output (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.athena.-2017-05-18/query-execution]))

(clojure.spec.alpha/def :portkey.aws.athena.-2017-05-18/get-named-query-input (clojure.spec.alpha/keys :req-un [:portkey.aws.athena.-2017-05-18/named-query-id] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.athena.-2017-05-18/named-query-id-list (clojure.spec.alpha/coll-of :portkey.aws.athena.-2017-05-18/named-query-id :min-count 1 :max-count 50))

(clojure.spec.alpha/def :portkey.aws.athena.-2017-05-18/database-string (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__27880__auto__] (clojure.core/<= 1 (clojure.core/count s__27880__auto__))) (clojure.core/fn [s__27881__auto__] (clojure.core/< (clojure.core/count s__27881__auto__) 32))))

(clojure.spec.alpha/def :portkey.aws.athena.-2017-05-18.batch-get-query-execution-input/query-execution-ids (clojure.spec.alpha/and :portkey.aws.athena.-2017-05-18/query-execution-id-list))
(clojure.spec.alpha/def :portkey.aws.athena.-2017-05-18/batch-get-query-execution-input (clojure.spec.alpha/keys :req-un [:portkey.aws.athena.-2017-05-18.batch-get-query-execution-input/query-execution-ids] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.athena.-2017-05-18.query-execution-status/state (clojure.spec.alpha/and :portkey.aws.athena.-2017-05-18/query-execution-state))
(clojure.spec.alpha/def :portkey.aws.athena.-2017-05-18.query-execution-status/state-change-reason (clojure.spec.alpha/and :portkey.aws.athena.-2017-05-18/string))
(clojure.spec.alpha/def :portkey.aws.athena.-2017-05-18.query-execution-status/submission-date-time (clojure.spec.alpha/and :portkey.aws.athena.-2017-05-18/date))
(clojure.spec.alpha/def :portkey.aws.athena.-2017-05-18.query-execution-status/completion-date-time (clojure.spec.alpha/and :portkey.aws.athena.-2017-05-18/date))
(clojure.spec.alpha/def :portkey.aws.athena.-2017-05-18/query-execution-status (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.athena.-2017-05-18.query-execution-status/state :portkey.aws.athena.-2017-05-18.query-execution-status/state-change-reason :portkey.aws.athena.-2017-05-18.query-execution-status/submission-date-time :portkey.aws.athena.-2017-05-18.query-execution-status/completion-date-time]))

(clojure.spec.alpha/def :portkey.aws.athena.-2017-05-18/encryption-option #{:sse-kms :cse-kms :sse-s-3 "CSE_KMS" "SSE_S3" "SSE_KMS"})

(clojure.spec.alpha/def :portkey.aws.athena.-2017-05-18/query-string (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__27880__auto__] (clojure.core/<= 1 (clojure.core/count s__27880__auto__))) (clojure.core/fn [s__27881__auto__] (clojure.core/< (clojure.core/count s__27881__auto__) 262144))))

(clojure.spec.alpha/def :portkey.aws.athena.-2017-05-18.batch-get-named-query-input/named-query-ids (clojure.spec.alpha/and :portkey.aws.athena.-2017-05-18/named-query-id-list))
(clojure.spec.alpha/def :portkey.aws.athena.-2017-05-18/batch-get-named-query-input (clojure.spec.alpha/keys :req-un [:portkey.aws.athena.-2017-05-18.batch-get-named-query-input/named-query-ids] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.athena.-2017-05-18/get-query-execution-input (clojure.spec.alpha/keys :req-un [:portkey.aws.athena.-2017-05-18/query-execution-id] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.athena.-2017-05-18/datum-string (clojure.spec.alpha/and clojure.core/string?))

(clojure.spec.alpha/def :portkey.aws.athena.-2017-05-18/error-message (clojure.spec.alpha/and clojure.core/string?))

(clojure.spec.alpha/def :portkey.aws.athena.-2017-05-18/named-query-id (clojure.spec.alpha/and clojure.core/string?))

(clojure.spec.alpha/def :portkey.aws.athena.-2017-05-18.list-named-queries-output/named-query-ids (clojure.spec.alpha/and :portkey.aws.athena.-2017-05-18/named-query-id-list))
(clojure.spec.alpha/def :portkey.aws.athena.-2017-05-18.list-named-queries-output/next-token (clojure.spec.alpha/and :portkey.aws.athena.-2017-05-18/token))
(clojure.spec.alpha/def :portkey.aws.athena.-2017-05-18/list-named-queries-output (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.athena.-2017-05-18.list-named-queries-output/named-query-ids :portkey.aws.athena.-2017-05-18.list-named-queries-output/next-token]))

(clojure.spec.alpha/def :portkey.aws.athena.-2017-05-18/max-query-results (clojure.spec.alpha/int-in 0 1000))

(clojure.spec.alpha/def :portkey.aws.athena.-2017-05-18/date clojure.core/inst?)

(clojure.spec.alpha/def :portkey.aws.athena.-2017-05-18.too-many-requests-exception/message (clojure.spec.alpha/and :portkey.aws.athena.-2017-05-18/error-message))
(clojure.spec.alpha/def :portkey.aws.athena.-2017-05-18.too-many-requests-exception/reason (clojure.spec.alpha/and :portkey.aws.athena.-2017-05-18/throttle-reason))
(clojure.spec.alpha/def :portkey.aws.athena.-2017-05-18/too-many-requests-exception (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.athena.-2017-05-18.too-many-requests-exception/message :portkey.aws.athena.-2017-05-18.too-many-requests-exception/reason]))

(clojure.spec.alpha/def :portkey.aws.athena.-2017-05-18.row/data (clojure.spec.alpha/and :portkey.aws.athena.-2017-05-18/datum-list))
(clojure.spec.alpha/def :portkey.aws.athena.-2017-05-18/row (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.athena.-2017-05-18.row/data]))

(clojure.spec.alpha/def :portkey.aws.athena.-2017-05-18.column-info/precision (clojure.spec.alpha/and :portkey.aws.athena.-2017-05-18/integer))
(clojure.spec.alpha/def :portkey.aws.athena.-2017-05-18.column-info/nullable (clojure.spec.alpha/and :portkey.aws.athena.-2017-05-18/column-nullable))
(clojure.spec.alpha/def :portkey.aws.athena.-2017-05-18.column-info/catalog-name (clojure.spec.alpha/and :portkey.aws.athena.-2017-05-18/string))
(clojure.spec.alpha/def :portkey.aws.athena.-2017-05-18.column-info/type (clojure.spec.alpha/and :portkey.aws.athena.-2017-05-18/string))
(clojure.spec.alpha/def :portkey.aws.athena.-2017-05-18.column-info/case-sensitive (clojure.spec.alpha/and :portkey.aws.athena.-2017-05-18/boolean))
(clojure.spec.alpha/def :portkey.aws.athena.-2017-05-18.column-info/scale (clojure.spec.alpha/and :portkey.aws.athena.-2017-05-18/integer))
(clojure.spec.alpha/def :portkey.aws.athena.-2017-05-18.column-info/label (clojure.spec.alpha/and :portkey.aws.athena.-2017-05-18/string))
(clojure.spec.alpha/def :portkey.aws.athena.-2017-05-18.column-info/table-name (clojure.spec.alpha/and :portkey.aws.athena.-2017-05-18/string))
(clojure.spec.alpha/def :portkey.aws.athena.-2017-05-18.column-info/schema-name (clojure.spec.alpha/and :portkey.aws.athena.-2017-05-18/string))
(clojure.spec.alpha/def :portkey.aws.athena.-2017-05-18.column-info/name (clojure.spec.alpha/and :portkey.aws.athena.-2017-05-18/string))
(clojure.spec.alpha/def :portkey.aws.athena.-2017-05-18/column-info (clojure.spec.alpha/keys :req-un [:portkey.aws.athena.-2017-05-18.column-info/name :portkey.aws.athena.-2017-05-18.column-info/type] :opt-un [:portkey.aws.athena.-2017-05-18.column-info/precision :portkey.aws.athena.-2017-05-18.column-info/nullable :portkey.aws.athena.-2017-05-18.column-info/catalog-name :portkey.aws.athena.-2017-05-18.column-info/case-sensitive :portkey.aws.athena.-2017-05-18.column-info/scale :portkey.aws.athena.-2017-05-18.column-info/label :portkey.aws.athena.-2017-05-18.column-info/table-name :portkey.aws.athena.-2017-05-18.column-info/schema-name]))

(clojure.spec.alpha/def :portkey.aws.athena.-2017-05-18/throttle-reason #{"CONCURRENT_QUERY_LIMIT_EXCEEDED" :concurrent-query-limit-exceeded})

(clojure.spec.alpha/def :portkey.aws.athena.-2017-05-18.named-query/name (clojure.spec.alpha/and :portkey.aws.athena.-2017-05-18/name-string))
(clojure.spec.alpha/def :portkey.aws.athena.-2017-05-18.named-query/description (clojure.spec.alpha/and :portkey.aws.athena.-2017-05-18/description-string))
(clojure.spec.alpha/def :portkey.aws.athena.-2017-05-18.named-query/database (clojure.spec.alpha/and :portkey.aws.athena.-2017-05-18/database-string))
(clojure.spec.alpha/def :portkey.aws.athena.-2017-05-18/named-query (clojure.spec.alpha/keys :req-un [:portkey.aws.athena.-2017-05-18.named-query/name :portkey.aws.athena.-2017-05-18.named-query/database :portkey.aws.athena.-2017-05-18/query-string] :opt-un [:portkey.aws.athena.-2017-05-18.named-query/description :portkey.aws.athena.-2017-05-18/named-query-id]))

(clojure.spec.alpha/def :portkey.aws.athena.-2017-05-18/stop-query-execution-input (clojure.spec.alpha/keys :req-un [:portkey.aws.athena.-2017-05-18/query-execution-id] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.athena.-2017-05-18.query-execution-context/database (clojure.spec.alpha/and :portkey.aws.athena.-2017-05-18/database-string))
(clojure.spec.alpha/def :portkey.aws.athena.-2017-05-18/query-execution-context (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.athena.-2017-05-18.query-execution-context/database]))

(clojure.spec.alpha/def :portkey.aws.athena.-2017-05-18.batch-get-named-query-output/named-queries (clojure.spec.alpha/and :portkey.aws.athena.-2017-05-18/named-query-list))
(clojure.spec.alpha/def :portkey.aws.athena.-2017-05-18.batch-get-named-query-output/unprocessed-named-query-ids (clojure.spec.alpha/and :portkey.aws.athena.-2017-05-18/unprocessed-named-query-id-list))
(clojure.spec.alpha/def :portkey.aws.athena.-2017-05-18/batch-get-named-query-output (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.athena.-2017-05-18.batch-get-named-query-output/named-queries :portkey.aws.athena.-2017-05-18.batch-get-named-query-output/unprocessed-named-query-ids]))

(clojure.spec.alpha/def :portkey.aws.athena.-2017-05-18/error-code (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__27880__auto__] (clojure.core/<= 1 (clojure.core/count s__27880__auto__))) (clojure.core/fn [s__27881__auto__] (clojure.core/< (clojure.core/count s__27881__auto__) 256))))

(clojure.spec.alpha/def :portkey.aws.athena.-2017-05-18.internal-server-exception/message (clojure.spec.alpha/and :portkey.aws.athena.-2017-05-18/error-message))
(clojure.spec.alpha/def :portkey.aws.athena.-2017-05-18/internal-server-exception (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.athena.-2017-05-18.internal-server-exception/message]))

(clojure.spec.alpha/def :portkey.aws.athena.-2017-05-18/create-named-query-output (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.athena.-2017-05-18/named-query-id]))

(clojure.spec.alpha/def :portkey.aws.athena.-2017-05-18/column-nullable #{"UNKNOWN" :unknown "NULLABLE" "NOT_NULL" :not-null :nullable})

(clojure.spec.alpha/def :portkey.aws.athena.-2017-05-18/query-execution-id-list (clojure.spec.alpha/coll-of :portkey.aws.athena.-2017-05-18/query-execution-id :min-count 1 :max-count 50))

(clojure.spec.alpha/def :portkey.aws.athena.-2017-05-18.get-query-results-input/next-token (clojure.spec.alpha/and :portkey.aws.athena.-2017-05-18/token))
(clojure.spec.alpha/def :portkey.aws.athena.-2017-05-18.get-query-results-input/max-results (clojure.spec.alpha/and :portkey.aws.athena.-2017-05-18/max-query-results))
(clojure.spec.alpha/def :portkey.aws.athena.-2017-05-18/get-query-results-input (clojure.spec.alpha/keys :req-un [:portkey.aws.athena.-2017-05-18/query-execution-id] :opt-un [:portkey.aws.athena.-2017-05-18.get-query-results-input/next-token :portkey.aws.athena.-2017-05-18.get-query-results-input/max-results]))

(clojure.spec.alpha/def :portkey.aws.athena.-2017-05-18.result-set/rows (clojure.spec.alpha/and :portkey.aws.athena.-2017-05-18/row-list))
(clojure.spec.alpha/def :portkey.aws.athena.-2017-05-18/result-set (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.athena.-2017-05-18.result-set/rows :portkey.aws.athena.-2017-05-18/result-set-metadata]))

(clojure.spec.alpha/def :portkey.aws.athena.-2017-05-18.result-set-metadata/column-info (clojure.spec.alpha/and :portkey.aws.athena.-2017-05-18/column-info-list))
(clojure.spec.alpha/def :portkey.aws.athena.-2017-05-18/result-set-metadata (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.athena.-2017-05-18.result-set-metadata/column-info]))

(clojure.spec.alpha/def :portkey.aws.athena.-2017-05-18/max-query-executions-count (clojure.spec.alpha/int-in 0 50))

(clojure.spec.alpha/def :portkey.aws.athena.-2017-05-18/start-query-execution-output (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.athena.-2017-05-18/query-execution-id]))

(clojure.spec.alpha/def :portkey.aws.athena.-2017-05-18/get-named-query-output (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.athena.-2017-05-18/named-query]))

(clojure.spec.alpha/def :portkey.aws.athena.-2017-05-18.create-named-query-input/name (clojure.spec.alpha/and :portkey.aws.athena.-2017-05-18/name-string))
(clojure.spec.alpha/def :portkey.aws.athena.-2017-05-18.create-named-query-input/description (clojure.spec.alpha/and :portkey.aws.athena.-2017-05-18/description-string))
(clojure.spec.alpha/def :portkey.aws.athena.-2017-05-18.create-named-query-input/database (clojure.spec.alpha/and :portkey.aws.athena.-2017-05-18/database-string))
(clojure.spec.alpha/def :portkey.aws.athena.-2017-05-18.create-named-query-input/client-request-token (clojure.spec.alpha/and :portkey.aws.athena.-2017-05-18/idempotency-token))
(clojure.spec.alpha/def :portkey.aws.athena.-2017-05-18/create-named-query-input (clojure.spec.alpha/keys :req-un [:portkey.aws.athena.-2017-05-18.create-named-query-input/name :portkey.aws.athena.-2017-05-18.create-named-query-input/database :portkey.aws.athena.-2017-05-18/query-string] :opt-un [:portkey.aws.athena.-2017-05-18.create-named-query-input/description :portkey.aws.athena.-2017-05-18.create-named-query-input/client-request-token]))

(clojure.spec.alpha/def :portkey.aws.athena.-2017-05-18/integer clojure.core/int?)

(clojure.spec.alpha/def :portkey.aws.athena.-2017-05-18/string (clojure.spec.alpha/and clojure.core/string?))

(clojure.spec.alpha/def :portkey.aws.athena.-2017-05-18.start-query-execution-input/client-request-token (clojure.spec.alpha/and :portkey.aws.athena.-2017-05-18/idempotency-token))
(clojure.spec.alpha/def :portkey.aws.athena.-2017-05-18/start-query-execution-input (clojure.spec.alpha/keys :req-un [:portkey.aws.athena.-2017-05-18/query-string :portkey.aws.athena.-2017-05-18/result-configuration] :opt-un [:portkey.aws.athena.-2017-05-18.start-query-execution-input/client-request-token :portkey.aws.athena.-2017-05-18/query-execution-context]))

(clojure.spec.alpha/def :portkey.aws.athena.-2017-05-18/name-string (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__27880__auto__] (clojure.core/<= 1 (clojure.core/count s__27880__auto__))) (clojure.core/fn [s__27881__auto__] (clojure.core/< (clojure.core/count s__27881__auto__) 128))))

(clojure.spec.alpha/def :portkey.aws.athena.-2017-05-18/delete-named-query-output (clojure.spec.alpha/keys :req-un [] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.athena.-2017-05-18.query-execution-statistics/engine-execution-time-in-millis (clojure.spec.alpha/and :portkey.aws.athena.-2017-05-18/long))
(clojure.spec.alpha/def :portkey.aws.athena.-2017-05-18.query-execution-statistics/data-scanned-in-bytes (clojure.spec.alpha/and :portkey.aws.athena.-2017-05-18/long))
(clojure.spec.alpha/def :portkey.aws.athena.-2017-05-18/query-execution-statistics (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.athena.-2017-05-18.query-execution-statistics/engine-execution-time-in-millis :portkey.aws.athena.-2017-05-18.query-execution-statistics/data-scanned-in-bytes]))

(clojure.spec.alpha/def :portkey.aws.athena.-2017-05-18/unprocessed-named-query-id-list (clojure.spec.alpha/coll-of :portkey.aws.athena.-2017-05-18/unprocessed-named-query-id))

(clojure.spec.alpha/def :portkey.aws.athena.-2017-05-18.batch-get-query-execution-output/query-executions (clojure.spec.alpha/and :portkey.aws.athena.-2017-05-18/query-execution-list))
(clojure.spec.alpha/def :portkey.aws.athena.-2017-05-18.batch-get-query-execution-output/unprocessed-query-execution-ids (clojure.spec.alpha/and :portkey.aws.athena.-2017-05-18/unprocessed-query-execution-id-list))
(clojure.spec.alpha/def :portkey.aws.athena.-2017-05-18/batch-get-query-execution-output (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.athena.-2017-05-18.batch-get-query-execution-output/query-executions :portkey.aws.athena.-2017-05-18.batch-get-query-execution-output/unprocessed-query-execution-ids]))

(clojure.spec.alpha/def :portkey.aws.athena.-2017-05-18/description-string (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__27880__auto__] (clojure.core/<= 1 (clojure.core/count s__27880__auto__))) (clojure.core/fn [s__27881__auto__] (clojure.core/< (clojure.core/count s__27881__auto__) 1024))))

(clojure.spec.alpha/def :portkey.aws.athena.-2017-05-18.list-query-executions-input/next-token (clojure.spec.alpha/and :portkey.aws.athena.-2017-05-18/token))
(clojure.spec.alpha/def :portkey.aws.athena.-2017-05-18.list-query-executions-input/max-results (clojure.spec.alpha/and :portkey.aws.athena.-2017-05-18/max-query-executions-count))
(clojure.spec.alpha/def :portkey.aws.athena.-2017-05-18/list-query-executions-input (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.athena.-2017-05-18.list-query-executions-input/next-token :portkey.aws.athena.-2017-05-18.list-query-executions-input/max-results]))

(clojure.spec.alpha/def :portkey.aws.athena.-2017-05-18/idempotency-token (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__27880__auto__] (clojure.core/<= 32 (clojure.core/count s__27880__auto__))) (clojure.core/fn [s__27881__auto__] (clojure.core/< (clojure.core/count s__27881__auto__) 128))))

(clojure.spec.alpha/def :portkey.aws.athena.-2017-05-18/query-execution-list (clojure.spec.alpha/coll-of :portkey.aws.athena.-2017-05-18/query-execution))

(clojure.spec.alpha/def :portkey.aws.athena.-2017-05-18/row-list (clojure.spec.alpha/coll-of :portkey.aws.athena.-2017-05-18/row))

(clojure.spec.alpha/def :portkey.aws.athena.-2017-05-18/unprocessed-query-execution-id (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.athena.-2017-05-18/query-execution-id :portkey.aws.athena.-2017-05-18/error-code :portkey.aws.athena.-2017-05-18/error-message]))

(clojure.spec.alpha/def :portkey.aws.athena.-2017-05-18/long clojure.core/int?)

(clojure.spec.alpha/def :portkey.aws.athena.-2017-05-18/unprocessed-query-execution-id-list (clojure.spec.alpha/coll-of :portkey.aws.athena.-2017-05-18/unprocessed-query-execution-id))

(clojure.spec.alpha/def :portkey.aws.athena.-2017-05-18/datum-list (clojure.spec.alpha/coll-of :portkey.aws.athena.-2017-05-18/datum))

(clojure.spec.alpha/def :portkey.aws.athena.-2017-05-18/max-named-queries-count (clojure.spec.alpha/int-in 0 50))

(clojure.spec.alpha/def :portkey.aws.athena.-2017-05-18/column-info-list (clojure.spec.alpha/coll-of :portkey.aws.athena.-2017-05-18/column-info))

(clojure.spec.alpha/def :portkey.aws.athena.-2017-05-18.query-execution/query (clojure.spec.alpha/and :portkey.aws.athena.-2017-05-18/query-string))
(clojure.spec.alpha/def :portkey.aws.athena.-2017-05-18.query-execution/status (clojure.spec.alpha/and :portkey.aws.athena.-2017-05-18/query-execution-status))
(clojure.spec.alpha/def :portkey.aws.athena.-2017-05-18.query-execution/statistics (clojure.spec.alpha/and :portkey.aws.athena.-2017-05-18/query-execution-statistics))
(clojure.spec.alpha/def :portkey.aws.athena.-2017-05-18/query-execution (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.athena.-2017-05-18/query-execution-id :portkey.aws.athena.-2017-05-18.query-execution/query :portkey.aws.athena.-2017-05-18/result-configuration :portkey.aws.athena.-2017-05-18/query-execution-context :portkey.aws.athena.-2017-05-18.query-execution/status :portkey.aws.athena.-2017-05-18.query-execution/statistics]))

(clojure.spec.alpha/def :portkey.aws.athena.-2017-05-18.result-configuration/output-location (clojure.spec.alpha/and :portkey.aws.athena.-2017-05-18/string))
(clojure.spec.alpha/def :portkey.aws.athena.-2017-05-18/result-configuration (clojure.spec.alpha/keys :req-un [:portkey.aws.athena.-2017-05-18.result-configuration/output-location] :opt-un [:portkey.aws.athena.-2017-05-18/encryption-configuration]))

(clojure.spec.alpha/def :portkey.aws.athena.-2017-05-18/named-query-list (clojure.spec.alpha/coll-of :portkey.aws.athena.-2017-05-18/named-query))

(clojure.spec.alpha/def :portkey.aws.athena.-2017-05-18.get-query-results-output/next-token (clojure.spec.alpha/and :portkey.aws.athena.-2017-05-18/token))
(clojure.spec.alpha/def :portkey.aws.athena.-2017-05-18/get-query-results-output (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.athena.-2017-05-18/result-set :portkey.aws.athena.-2017-05-18.get-query-results-output/next-token]))

(clojure.spec.alpha/def :portkey.aws.athena.-2017-05-18/token (clojure.spec.alpha/and clojure.core/string?))

(clojure.spec.alpha/def :portkey.aws.athena.-2017-05-18.list-named-queries-input/next-token (clojure.spec.alpha/and :portkey.aws.athena.-2017-05-18/token))
(clojure.spec.alpha/def :portkey.aws.athena.-2017-05-18.list-named-queries-input/max-results (clojure.spec.alpha/and :portkey.aws.athena.-2017-05-18/max-named-queries-count))
(clojure.spec.alpha/def :portkey.aws.athena.-2017-05-18/list-named-queries-input (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.athena.-2017-05-18.list-named-queries-input/next-token :portkey.aws.athena.-2017-05-18.list-named-queries-input/max-results]))

(clojure.spec.alpha/def :portkey.aws.athena.-2017-05-18.datum/var-char-value (clojure.spec.alpha/and :portkey.aws.athena.-2017-05-18/datum-string))
(clojure.spec.alpha/def :portkey.aws.athena.-2017-05-18/datum (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.athena.-2017-05-18.datum/var-char-value]))

(clojure.spec.alpha/def :portkey.aws.athena.-2017-05-18/delete-named-query-input (clojure.spec.alpha/keys :req-un [:portkey.aws.athena.-2017-05-18/named-query-id] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.athena.-2017-05-18.list-query-executions-output/query-execution-ids (clojure.spec.alpha/and :portkey.aws.athena.-2017-05-18/query-execution-id-list))
(clojure.spec.alpha/def :portkey.aws.athena.-2017-05-18.list-query-executions-output/next-token (clojure.spec.alpha/and :portkey.aws.athena.-2017-05-18/token))
(clojure.spec.alpha/def :portkey.aws.athena.-2017-05-18/list-query-executions-output (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.athena.-2017-05-18.list-query-executions-output/query-execution-ids :portkey.aws.athena.-2017-05-18.list-query-executions-output/next-token]))

(clojure.spec.alpha/def :portkey.aws.athena.-2017-05-18/boolean clojure.core/boolean?)

(clojure.core/defn list-named-queries ([] (list-named-queries {})) ([list-named-queries-inputinput] (clojure.core/let [request-function-result__28521__auto__ (req-list-named-queries-input list-named-queries-inputinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__28521__auto__ {:http.request.configuration/endpoints portkey.aws.athena.-2017-05-18/endpoints, :http.request.configuration/target-prefix "AmazonAthena", :http.request.spec/output-spec :portkey.aws.athena.-2017-05-18/list-named-queries-output, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2017-05-18", :http.request.configuration/service-id nil, :http.request.spec/input-spec :portkey.aws.athena.-2017-05-18/list-named-queries-input, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/action "ListNamedQueries", :http.request.spec/error-spec {"InternalServerException" :portkey.aws.athena.-2017-05-18/internal-server-exception, "InvalidRequestException" :portkey.aws.athena.-2017-05-18/invalid-request-exception}})))))
(clojure.spec.alpha/fdef list-named-queries :args (clojure.spec.alpha/? :portkey.aws.athena.-2017-05-18/list-named-queries-input) :ret (clojure.spec.alpha/and :portkey.aws.athena.-2017-05-18/list-named-queries-output))

(clojure.core/defn stop-query-execution ([stop-query-execution-inputinput] (clojure.core/let [request-function-result__28521__auto__ (req-stop-query-execution-input stop-query-execution-inputinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__28521__auto__ {:http.request.configuration/endpoints portkey.aws.athena.-2017-05-18/endpoints, :http.request.configuration/target-prefix "AmazonAthena", :http.request.spec/output-spec :portkey.aws.athena.-2017-05-18/stop-query-execution-output, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2017-05-18", :http.request.configuration/service-id nil, :http.request.spec/input-spec :portkey.aws.athena.-2017-05-18/stop-query-execution-input, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/action "StopQueryExecution", :http.request.spec/error-spec {"InternalServerException" :portkey.aws.athena.-2017-05-18/internal-server-exception, "InvalidRequestException" :portkey.aws.athena.-2017-05-18/invalid-request-exception}})))))
(clojure.spec.alpha/fdef stop-query-execution :args (clojure.spec.alpha/tuple :portkey.aws.athena.-2017-05-18/stop-query-execution-input) :ret (clojure.spec.alpha/and :portkey.aws.athena.-2017-05-18/stop-query-execution-output))

(clojure.core/defn list-query-executions ([] (list-query-executions {})) ([list-query-executions-inputinput] (clojure.core/let [request-function-result__28521__auto__ (req-list-query-executions-input list-query-executions-inputinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__28521__auto__ {:http.request.configuration/endpoints portkey.aws.athena.-2017-05-18/endpoints, :http.request.configuration/target-prefix "AmazonAthena", :http.request.spec/output-spec :portkey.aws.athena.-2017-05-18/list-query-executions-output, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2017-05-18", :http.request.configuration/service-id nil, :http.request.spec/input-spec :portkey.aws.athena.-2017-05-18/list-query-executions-input, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/action "ListQueryExecutions", :http.request.spec/error-spec {"InternalServerException" :portkey.aws.athena.-2017-05-18/internal-server-exception, "InvalidRequestException" :portkey.aws.athena.-2017-05-18/invalid-request-exception}})))))
(clojure.spec.alpha/fdef list-query-executions :args (clojure.spec.alpha/? :portkey.aws.athena.-2017-05-18/list-query-executions-input) :ret (clojure.spec.alpha/and :portkey.aws.athena.-2017-05-18/list-query-executions-output))

(clojure.core/defn start-query-execution ([start-query-execution-inputinput] (clojure.core/let [request-function-result__28521__auto__ (req-start-query-execution-input start-query-execution-inputinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__28521__auto__ {:http.request.configuration/endpoints portkey.aws.athena.-2017-05-18/endpoints, :http.request.configuration/target-prefix "AmazonAthena", :http.request.spec/output-spec :portkey.aws.athena.-2017-05-18/start-query-execution-output, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2017-05-18", :http.request.configuration/service-id nil, :http.request.spec/input-spec :portkey.aws.athena.-2017-05-18/start-query-execution-input, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/action "StartQueryExecution", :http.request.spec/error-spec {"InternalServerException" :portkey.aws.athena.-2017-05-18/internal-server-exception, "InvalidRequestException" :portkey.aws.athena.-2017-05-18/invalid-request-exception, "TooManyRequestsException" :portkey.aws.athena.-2017-05-18/too-many-requests-exception}})))))
(clojure.spec.alpha/fdef start-query-execution :args (clojure.spec.alpha/tuple :portkey.aws.athena.-2017-05-18/start-query-execution-input) :ret (clojure.spec.alpha/and :portkey.aws.athena.-2017-05-18/start-query-execution-output))

(clojure.core/defn delete-named-query ([delete-named-query-inputinput] (clojure.core/let [request-function-result__28521__auto__ (req-delete-named-query-input delete-named-query-inputinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__28521__auto__ {:http.request.configuration/endpoints portkey.aws.athena.-2017-05-18/endpoints, :http.request.configuration/target-prefix "AmazonAthena", :http.request.spec/output-spec :portkey.aws.athena.-2017-05-18/delete-named-query-output, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2017-05-18", :http.request.configuration/service-id nil, :http.request.spec/input-spec :portkey.aws.athena.-2017-05-18/delete-named-query-input, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/action "DeleteNamedQuery", :http.request.spec/error-spec {"InternalServerException" :portkey.aws.athena.-2017-05-18/internal-server-exception, "InvalidRequestException" :portkey.aws.athena.-2017-05-18/invalid-request-exception}})))))
(clojure.spec.alpha/fdef delete-named-query :args (clojure.spec.alpha/tuple :portkey.aws.athena.-2017-05-18/delete-named-query-input) :ret (clojure.spec.alpha/and :portkey.aws.athena.-2017-05-18/delete-named-query-output))

(clojure.core/defn get-named-query ([get-named-query-inputinput] (clojure.core/let [request-function-result__28521__auto__ (req-get-named-query-input get-named-query-inputinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__28521__auto__ {:http.request.configuration/endpoints portkey.aws.athena.-2017-05-18/endpoints, :http.request.configuration/target-prefix "AmazonAthena", :http.request.spec/output-spec :portkey.aws.athena.-2017-05-18/get-named-query-output, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2017-05-18", :http.request.configuration/service-id nil, :http.request.spec/input-spec :portkey.aws.athena.-2017-05-18/get-named-query-input, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/action "GetNamedQuery", :http.request.spec/error-spec {"InternalServerException" :portkey.aws.athena.-2017-05-18/internal-server-exception, "InvalidRequestException" :portkey.aws.athena.-2017-05-18/invalid-request-exception}})))))
(clojure.spec.alpha/fdef get-named-query :args (clojure.spec.alpha/tuple :portkey.aws.athena.-2017-05-18/get-named-query-input) :ret (clojure.spec.alpha/and :portkey.aws.athena.-2017-05-18/get-named-query-output))

(clojure.core/defn get-query-execution ([get-query-execution-inputinput] (clojure.core/let [request-function-result__28521__auto__ (req-get-query-execution-input get-query-execution-inputinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__28521__auto__ {:http.request.configuration/endpoints portkey.aws.athena.-2017-05-18/endpoints, :http.request.configuration/target-prefix "AmazonAthena", :http.request.spec/output-spec :portkey.aws.athena.-2017-05-18/get-query-execution-output, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2017-05-18", :http.request.configuration/service-id nil, :http.request.spec/input-spec :portkey.aws.athena.-2017-05-18/get-query-execution-input, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/action "GetQueryExecution", :http.request.spec/error-spec {"InternalServerException" :portkey.aws.athena.-2017-05-18/internal-server-exception, "InvalidRequestException" :portkey.aws.athena.-2017-05-18/invalid-request-exception}})))))
(clojure.spec.alpha/fdef get-query-execution :args (clojure.spec.alpha/tuple :portkey.aws.athena.-2017-05-18/get-query-execution-input) :ret (clojure.spec.alpha/and :portkey.aws.athena.-2017-05-18/get-query-execution-output))

(clojure.core/defn batch-get-named-query ([batch-get-named-query-inputinput] (clojure.core/let [request-function-result__28521__auto__ (req-batch-get-named-query-input batch-get-named-query-inputinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__28521__auto__ {:http.request.configuration/endpoints portkey.aws.athena.-2017-05-18/endpoints, :http.request.configuration/target-prefix "AmazonAthena", :http.request.spec/output-spec :portkey.aws.athena.-2017-05-18/batch-get-named-query-output, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2017-05-18", :http.request.configuration/service-id nil, :http.request.spec/input-spec :portkey.aws.athena.-2017-05-18/batch-get-named-query-input, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/action "BatchGetNamedQuery", :http.request.spec/error-spec {"InternalServerException" :portkey.aws.athena.-2017-05-18/internal-server-exception, "InvalidRequestException" :portkey.aws.athena.-2017-05-18/invalid-request-exception}})))))
(clojure.spec.alpha/fdef batch-get-named-query :args (clojure.spec.alpha/tuple :portkey.aws.athena.-2017-05-18/batch-get-named-query-input) :ret (clojure.spec.alpha/and :portkey.aws.athena.-2017-05-18/batch-get-named-query-output))

(clojure.core/defn create-named-query ([create-named-query-inputinput] (clojure.core/let [request-function-result__28521__auto__ (req-create-named-query-input create-named-query-inputinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__28521__auto__ {:http.request.configuration/endpoints portkey.aws.athena.-2017-05-18/endpoints, :http.request.configuration/target-prefix "AmazonAthena", :http.request.spec/output-spec :portkey.aws.athena.-2017-05-18/create-named-query-output, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2017-05-18", :http.request.configuration/service-id nil, :http.request.spec/input-spec :portkey.aws.athena.-2017-05-18/create-named-query-input, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/action "CreateNamedQuery", :http.request.spec/error-spec {"InternalServerException" :portkey.aws.athena.-2017-05-18/internal-server-exception, "InvalidRequestException" :portkey.aws.athena.-2017-05-18/invalid-request-exception}})))))
(clojure.spec.alpha/fdef create-named-query :args (clojure.spec.alpha/tuple :portkey.aws.athena.-2017-05-18/create-named-query-input) :ret (clojure.spec.alpha/and :portkey.aws.athena.-2017-05-18/create-named-query-output))

(clojure.core/defn batch-get-query-execution ([batch-get-query-execution-inputinput] (clojure.core/let [request-function-result__28521__auto__ (req-batch-get-query-execution-input batch-get-query-execution-inputinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__28521__auto__ {:http.request.configuration/endpoints portkey.aws.athena.-2017-05-18/endpoints, :http.request.configuration/target-prefix "AmazonAthena", :http.request.spec/output-spec :portkey.aws.athena.-2017-05-18/batch-get-query-execution-output, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2017-05-18", :http.request.configuration/service-id nil, :http.request.spec/input-spec :portkey.aws.athena.-2017-05-18/batch-get-query-execution-input, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/action "BatchGetQueryExecution", :http.request.spec/error-spec {"InternalServerException" :portkey.aws.athena.-2017-05-18/internal-server-exception, "InvalidRequestException" :portkey.aws.athena.-2017-05-18/invalid-request-exception}})))))
(clojure.spec.alpha/fdef batch-get-query-execution :args (clojure.spec.alpha/tuple :portkey.aws.athena.-2017-05-18/batch-get-query-execution-input) :ret (clojure.spec.alpha/and :portkey.aws.athena.-2017-05-18/batch-get-query-execution-output))

(clojure.core/defn get-query-results ([get-query-results-inputinput] (clojure.core/let [request-function-result__28521__auto__ (req-get-query-results-input get-query-results-inputinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__28521__auto__ {:http.request.configuration/endpoints portkey.aws.athena.-2017-05-18/endpoints, :http.request.configuration/target-prefix "AmazonAthena", :http.request.spec/output-spec :portkey.aws.athena.-2017-05-18/get-query-results-output, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2017-05-18", :http.request.configuration/service-id nil, :http.request.spec/input-spec :portkey.aws.athena.-2017-05-18/get-query-results-input, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/action "GetQueryResults", :http.request.spec/error-spec {"InternalServerException" :portkey.aws.athena.-2017-05-18/internal-server-exception, "InvalidRequestException" :portkey.aws.athena.-2017-05-18/invalid-request-exception}})))))
(clojure.spec.alpha/fdef get-query-results :args (clojure.spec.alpha/tuple :portkey.aws.athena.-2017-05-18/get-query-results-input) :ret (clojure.spec.alpha/and :portkey.aws.athena.-2017-05-18/get-query-results-output))
