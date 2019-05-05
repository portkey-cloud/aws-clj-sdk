(ns portkey.aws.translate (:require [portkey.aws]))

(def
 endpoints
 '{"eu-west-1"
   {:credential-scope {:service "translate", :region "eu-west-1"},
    :ssl-common-name "translate.eu-west-1.amazonaws.com",
    :endpoint "https://translate.eu-west-1.amazonaws.com",
    :signature-version :v4},
   "us-east-2"
   {:credential-scope {:service "translate", :region "us-east-2"},
    :ssl-common-name "translate.us-east-2.amazonaws.com",
    :endpoint "https://translate.us-east-2.amazonaws.com",
    :signature-version :v4},
   "us-east-2-fips"
   {:credential-scope {:service "translate", :region "us-east-2"},
    :ssl-common-name "translate-fips.us-east-2.amazonaws.com",
    :endpoint "https://translate-fips.us-east-2.amazonaws.com",
    :signature-version :v4},
   "us-east-1-fips"
   {:credential-scope {:service "translate", :region "us-east-1"},
    :ssl-common-name "translate-fips.us-east-1.amazonaws.com",
    :endpoint "https://translate-fips.us-east-1.amazonaws.com",
    :signature-version :v4},
   "us-west-2"
   {:credential-scope {:service "translate", :region "us-west-2"},
    :ssl-common-name "translate.us-west-2.amazonaws.com",
    :endpoint "https://translate.us-west-2.amazonaws.com",
    :signature-version :v4},
   "us-west-2-fips"
   {:credential-scope {:service "translate", :region "us-west-2"},
    :ssl-common-name "translate-fips.us-west-2.amazonaws.com",
    :endpoint "https://translate-fips.us-west-2.amazonaws.com",
    :signature-version :v4},
   "us-east-1"
   {:credential-scope {:service "translate", :region "us-east-1"},
    :ssl-common-name "translate.us-east-1.amazonaws.com",
    :endpoint "https://translate.us-east-1.amazonaws.com",
    :signature-version :v4},
   "us-gov-west-1-fips"
   {:credential-scope {:service "translate", :region "us-gov-west-1"},
    :ssl-common-name "translate-fips.us-gov-west-1.amazonaws.com",
    :endpoint "https://translate-fips.us-gov-west-1.amazonaws.com",
    :signature-version :v4},
   "us-gov-west-1"
   {:credential-scope {:service "translate", :region "us-gov-west-1"},
    :ssl-common-name "translate.us-gov-west-1.amazonaws.com",
    :endpoint "https://translate.us-gov-west-1.amazonaws.com",
    :signature-version :v4}})

(clojure.core/declare ser-merge-strategy)

(clojure.core/declare ser-terminology-file)

(clojure.core/declare ser-encryption-key-type)

(clojure.core/declare ser-language-code-string)

(clojure.core/declare ser-next-token)

(clojure.core/declare ser-terminology-data-format)

(clojure.core/declare ser-description)

(clojure.core/declare ser-resource-name-list)

(clojure.core/declare ser-resource-name)

(clojure.core/declare ser-terminology-data)

(clojure.core/declare ser-encryption-key-id)

(clojure.core/declare ser-bounded-length-string)

(clojure.core/declare ser-max-results-integer)

(clojure.core/declare ser-encryption-key)

(clojure.core/defn- ser-merge-strategy [input] #:http.request.field{:value (clojure.core/get {"OVERWRITE" "OVERWRITE", :overwrite "OVERWRITE"} input), :shape "MergeStrategy"})

(clojure.core/defn- ser-terminology-file [input] #:http.request.field{:value (portkey.aws/base64-encode input), :shape "TerminologyFile"})

(clojure.core/defn- ser-encryption-key-type [input] #:http.request.field{:value (clojure.core/get {"KMS" "KMS", :kms "KMS"} input), :shape "EncryptionKeyType"})

(clojure.core/defn- ser-language-code-string [input] #:http.request.field{:value input, :shape "LanguageCodeString"})

(clojure.core/defn- ser-next-token [input] #:http.request.field{:value input, :shape "NextToken"})

(clojure.core/defn- ser-terminology-data-format [input] #:http.request.field{:value (clojure.core/get {"CSV" "CSV", :csv "CSV", "TMX" "TMX", :tmx "TMX"} input), :shape "TerminologyDataFormat"})

(clojure.core/defn- ser-description [input] #:http.request.field{:value input, :shape "Description"})

(clojure.core/defn- ser-resource-name-list [input] #:http.request.field{:value (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (clojure.core/merge (ser-resource-name coll) #:http.request.field{:shape "ResourceName"}))) input), :shape "ResourceNameList", :type "list"})

(clojure.core/defn- ser-resource-name [input] #:http.request.field{:value input, :shape "ResourceName"})

(clojure.core/defn- ser-terminology-data [input] (clojure.core/cond-> #:http.request.field{:value [(clojure.core/into (ser-terminology-file (:file input)) #:http.request.field{:name "File", :shape "TerminologyFile"}) (clojure.core/into (ser-terminology-data-format (:format input)) #:http.request.field{:name "Format", :shape "TerminologyDataFormat"})], :shape "TerminologyData", :type "structure"}))

(clojure.core/defn- ser-encryption-key-id [input] #:http.request.field{:value input, :shape "EncryptionKeyID"})

(clojure.core/defn- ser-bounded-length-string [input] #:http.request.field{:value input, :shape "BoundedLengthString"})

(clojure.core/defn- ser-max-results-integer [input] #:http.request.field{:value input, :shape "MaxResultsInteger"})

(clojure.core/defn- ser-encryption-key [input] (clojure.core/cond-> #:http.request.field{:value [(clojure.core/into (ser-encryption-key-type (:type input)) #:http.request.field{:name "Type", :shape "EncryptionKeyType"}) (clojure.core/into (ser-encryption-key-id (:id input)) #:http.request.field{:name "Id", :shape "EncryptionKeyID"})], :shape "EncryptionKey", :type "structure"}))

(clojure.core/defn- req-translate-text-request [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (ser-bounded-length-string (input :text)) #:http.request.field{:name "Text", :shape "BoundedLengthString"}) (clojure.core/into (ser-language-code-string (input :source-language-code)) #:http.request.field{:name "SourceLanguageCode", :shape "LanguageCodeString"}) (clojure.core/into (ser-language-code-string (input :target-language-code)) #:http.request.field{:name "TargetLanguageCode", :shape "LanguageCodeString"})]} (clojure.core/contains? input :terminology-names) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-resource-name-list (input :terminology-names)) #:http.request.field{:name "TerminologyNames", :shape "ResourceNameList"}))))

(clojure.core/defn- req-import-terminology-request [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (ser-resource-name (input :name)) #:http.request.field{:name "Name", :shape "ResourceName"}) (clojure.core/into (ser-merge-strategy (input :merge-strategy)) #:http.request.field{:name "MergeStrategy", :shape "MergeStrategy"}) (clojure.core/into (ser-terminology-data (input :terminology-data)) #:http.request.field{:name "TerminologyData", :shape "TerminologyData"})]} (clojure.core/contains? input :description) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-description (input :description)) #:http.request.field{:name "Description", :shape "Description"})) (clojure.core/contains? input :encryption-key) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-encryption-key (input :encryption-key)) #:http.request.field{:name "EncryptionKey", :shape "EncryptionKey"}))))

(clojure.core/defn- req-get-terminology-request [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (ser-resource-name (input :name)) #:http.request.field{:name "Name", :shape "ResourceName"}) (clojure.core/into (ser-terminology-data-format (input :terminology-data-format)) #:http.request.field{:name "TerminologyDataFormat", :shape "TerminologyDataFormat"})]}))

(clojure.core/defn- req-delete-terminology-request [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (ser-resource-name (input :name)) #:http.request.field{:name "Name", :shape "ResourceName"})]}))

(clojure.core/defn- req-list-terminologies-request [input] (clojure.core/cond-> {} (clojure.core/contains? input :next-token) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-next-token (input :next-token)) #:http.request.field{:name "NextToken", :shape "NextToken"})) (clojure.core/contains? input :max-results) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-max-results-integer (input :max-results)) #:http.request.field{:name "MaxResults", :shape "MaxResultsInteger"}))))

(clojure.core/declare deser-terminology-arn)

(clojure.core/declare deser-terminology-data-location)

(clojure.core/declare deser-encryption-key-type)

(clojure.core/declare deser-terminology-properties)

(clojure.core/declare deser-language-code-string-list)

(clojure.core/declare deser-terminology-properties-list)

(clojure.core/declare deser-language-code-string)

(clojure.core/declare deser-next-token)

(clojure.core/declare deser-applied-terminology-list)

(clojure.core/declare deser-description)

(clojure.core/declare deser-resource-name)

(clojure.core/declare deser-integer)

(clojure.core/declare deser-string)

(clojure.core/declare deser-term-list)

(clojure.core/declare deser-encryption-key-id)

(clojure.core/declare deser-timestamp)

(clojure.core/declare deser-applied-terminology)

(clojure.core/declare deser-term)

(clojure.core/declare deser-encryption-key)

(clojure.core/defn- deser-terminology-arn [input] input)

(clojure.core/defn- deser-terminology-data-location [input] (clojure.core/cond-> {:repository-type (deser-string (input "RepositoryType")), :location (deser-string (input "Location"))}))

(clojure.core/defn- deser-encryption-key-type [input] (clojure.core/get {"KMS" :kms} input))

(clojure.core/defn- deser-terminology-properties [input] (clojure.core/cond-> {} (clojure.core/contains? input "SourceLanguageCode") (clojure.core/assoc :source-language-code (deser-language-code-string (input "SourceLanguageCode"))) (clojure.core/contains? input "TermCount") (clojure.core/assoc :term-count (deser-integer (input "TermCount"))) (clojure.core/contains? input "SizeBytes") (clojure.core/assoc :size-bytes (deser-integer (input "SizeBytes"))) (clojure.core/contains? input "LastUpdatedAt") (clojure.core/assoc :last-updated-at (deser-timestamp (input "LastUpdatedAt"))) (clojure.core/contains? input "TargetLanguageCodes") (clojure.core/assoc :target-language-codes (deser-language-code-string-list (input "TargetLanguageCodes"))) (clojure.core/contains? input "Description") (clojure.core/assoc :description (deser-description (input "Description"))) (clojure.core/contains? input "Arn") (clojure.core/assoc :arn (deser-terminology-arn (input "Arn"))) (clojure.core/contains? input "CreatedAt") (clojure.core/assoc :created-at (deser-timestamp (input "CreatedAt"))) (clojure.core/contains? input "Name") (clojure.core/assoc :name (deser-resource-name (input "Name"))) (clojure.core/contains? input "EncryptionKey") (clojure.core/assoc :encryption-key (deser-encryption-key (input "EncryptionKey")))))

(clojure.core/defn- deser-language-code-string-list [input] (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (deser-language-code-string coll))) input))

(clojure.core/defn- deser-terminology-properties-list [input] (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (deser-terminology-properties coll))) input))

(clojure.core/defn- deser-language-code-string [input] input)

(clojure.core/defn- deser-next-token [input] input)

(clojure.core/defn- deser-applied-terminology-list [input] (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (deser-applied-terminology coll))) input))

(clojure.core/defn- deser-description [input] input)

(clojure.core/defn- deser-resource-name [input] input)

(clojure.core/defn- deser-integer [input] input)

(clojure.core/defn- deser-string [input] input)

(clojure.core/defn- deser-term-list [input] (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (deser-term coll))) input))

(clojure.core/defn- deser-encryption-key-id [input] input)

(clojure.core/defn- deser-timestamp [input] input)

(clojure.core/defn- deser-applied-terminology [input] (clojure.core/cond-> {} (clojure.core/contains? input "Name") (clojure.core/assoc :name (deser-resource-name (input "Name"))) (clojure.core/contains? input "Terms") (clojure.core/assoc :terms (deser-term-list (input "Terms")))))

(clojure.core/defn- deser-term [input] (clojure.core/cond-> {} (clojure.core/contains? input "SourceText") (clojure.core/assoc :source-text (deser-string (input "SourceText"))) (clojure.core/contains? input "TargetText") (clojure.core/assoc :target-text (deser-string (input "TargetText")))))

(clojure.core/defn- deser-encryption-key [input] (clojure.core/cond-> {:type (deser-encryption-key-type (input "Type")), :id (deser-encryption-key-id (input "Id"))}))

(clojure.core/defn- response-import-terminology-response ([input] (response-import-terminology-response nil input)) ([resultWrapper2138103 input] (clojure.core/let [rawinput2138102 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar2138104 {"TerminologyProperties" (rawinput2138102 "TerminologyProperties")}] (clojure.core/cond-> {} (letvar2138104 "TerminologyProperties") (clojure.core/assoc :terminology-properties (deser-terminology-properties (clojure.core/get-in letvar2138104 ["TerminologyProperties"])))))))

(clojure.core/defn- response-list-terminologies-response ([input] (response-list-terminologies-response nil input)) ([resultWrapper2138106 input] (clojure.core/let [rawinput2138105 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar2138107 {"TerminologyPropertiesList" (rawinput2138105 "TerminologyPropertiesList"), "NextToken" (rawinput2138105 "NextToken")}] (clojure.core/cond-> {} (letvar2138107 "TerminologyPropertiesList") (clojure.core/assoc :terminology-properties-list (deser-terminology-properties-list (clojure.core/get-in letvar2138107 ["TerminologyPropertiesList"]))) (letvar2138107 "NextToken") (clojure.core/assoc :next-token (deser-next-token (clojure.core/get-in letvar2138107 ["NextToken"])))))))

(clojure.core/defn- response-detected-language-low-confidence-exception ([input] (response-detected-language-low-confidence-exception nil input)) ([resultWrapper2138109 input] (clojure.core/let [rawinput2138108 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar2138110 {"Message" (rawinput2138108 "Message"), "DetectedLanguageCode" (rawinput2138108 "DetectedLanguageCode")}] (clojure.core/cond-> {} (letvar2138110 "Message") (clojure.core/assoc :message (deser-string (clojure.core/get-in letvar2138110 ["Message"]))) (letvar2138110 "DetectedLanguageCode") (clojure.core/assoc :detected-language-code (deser-language-code-string (clojure.core/get-in letvar2138110 ["DetectedLanguageCode"])))))))

(clojure.core/defn- response-invalid-request-exception ([input] (response-invalid-request-exception nil input)) ([resultWrapper2138112 input] (clojure.core/let [rawinput2138111 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar2138113 {"Message" (rawinput2138111 "Message")}] (clojure.core/cond-> {} (letvar2138113 "Message") (clojure.core/assoc :message (deser-string (clojure.core/get-in letvar2138113 ["Message"])))))))

(clojure.core/defn- response-get-terminology-response ([input] (response-get-terminology-response nil input)) ([resultWrapper2138115 input] (clojure.core/let [rawinput2138114 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar2138116 {"TerminologyProperties" (rawinput2138114 "TerminologyProperties"), "TerminologyDataLocation" (rawinput2138114 "TerminologyDataLocation")}] (clojure.core/cond-> {} (letvar2138116 "TerminologyProperties") (clojure.core/assoc :terminology-properties (deser-terminology-properties (clojure.core/get-in letvar2138116 ["TerminologyProperties"]))) (letvar2138116 "TerminologyDataLocation") (clojure.core/assoc :terminology-data-location (deser-terminology-data-location (clojure.core/get-in letvar2138116 ["TerminologyDataLocation"])))))))

(clojure.core/defn- response-text-size-limit-exceeded-exception ([input] (response-text-size-limit-exceeded-exception nil input)) ([resultWrapper2138118 input] (clojure.core/let [rawinput2138117 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar2138119 {"Message" (rawinput2138117 "Message")}] (clojure.core/cond-> {} (letvar2138119 "Message") (clojure.core/assoc :message (deser-string (clojure.core/get-in letvar2138119 ["Message"])))))))

(clojure.core/defn- response-limit-exceeded-exception ([input] (response-limit-exceeded-exception nil input)) ([resultWrapper2138121 input] (clojure.core/let [rawinput2138120 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar2138122 {"Message" (rawinput2138120 "Message")}] (clojure.core/cond-> {} (letvar2138122 "Message") (clojure.core/assoc :message (deser-string (clojure.core/get-in letvar2138122 ["Message"])))))))

(clojure.core/defn- response-service-unavailable-exception ([input] (response-service-unavailable-exception nil input)) ([resultWrapper2138124 input] (clojure.core/let [rawinput2138123 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar2138125 {"Message" (rawinput2138123 "Message")}] (clojure.core/cond-> {} (letvar2138125 "Message") (clojure.core/assoc :message (deser-string (clojure.core/get-in letvar2138125 ["Message"])))))))

(clojure.core/defn- response-too-many-requests-exception ([input] (response-too-many-requests-exception nil input)) ([resultWrapper2138127 input] (clojure.core/let [rawinput2138126 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar2138128 {"Message" (rawinput2138126 "Message")}] (clojure.core/cond-> {} (letvar2138128 "Message") (clojure.core/assoc :message (deser-string (clojure.core/get-in letvar2138128 ["Message"])))))))

(clojure.core/defn- response-resource-not-found-exception ([input] (response-resource-not-found-exception nil input)) ([resultWrapper2138130 input] (clojure.core/let [rawinput2138129 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar2138131 {"Message" (rawinput2138129 "Message")}] (clojure.core/cond-> {} (letvar2138131 "Message") (clojure.core/assoc :message (deser-string (clojure.core/get-in letvar2138131 ["Message"])))))))

(clojure.core/defn- response-internal-server-exception ([input] (response-internal-server-exception nil input)) ([resultWrapper2138133 input] (clojure.core/let [rawinput2138132 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar2138134 {"Message" (rawinput2138132 "Message")}] (clojure.core/cond-> {} (letvar2138134 "Message") (clojure.core/assoc :message (deser-string (clojure.core/get-in letvar2138134 ["Message"])))))))

(clojure.core/defn- response-translate-text-response ([input] (response-translate-text-response nil input)) ([resultWrapper2138136 input] (clojure.core/let [rawinput2138135 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar2138137 {"TranslatedText" (rawinput2138135 "TranslatedText"), "SourceLanguageCode" (rawinput2138135 "SourceLanguageCode"), "TargetLanguageCode" (rawinput2138135 "TargetLanguageCode"), "AppliedTerminologies" (rawinput2138135 "AppliedTerminologies")}] (clojure.core/cond-> {:translated-text (deser-string (clojure.core/get-in letvar2138137 ["TranslatedText"])), :source-language-code (deser-language-code-string (clojure.core/get-in letvar2138137 ["SourceLanguageCode"])), :target-language-code (deser-language-code-string (clojure.core/get-in letvar2138137 ["TargetLanguageCode"]))} (letvar2138137 "AppliedTerminologies") (clojure.core/assoc :applied-terminologies (deser-applied-terminology-list (clojure.core/get-in letvar2138137 ["AppliedTerminologies"])))))))

(clojure.core/defn- response-unsupported-language-pair-exception ([input] (response-unsupported-language-pair-exception nil input)) ([resultWrapper2138139 input] (clojure.core/let [rawinput2138138 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar2138140 {"Message" (rawinput2138138 "Message"), "SourceLanguageCode" (rawinput2138138 "SourceLanguageCode"), "TargetLanguageCode" (rawinput2138138 "TargetLanguageCode")}] (clojure.core/cond-> {} (letvar2138140 "Message") (clojure.core/assoc :message (deser-string (clojure.core/get-in letvar2138140 ["Message"]))) (letvar2138140 "SourceLanguageCode") (clojure.core/assoc :source-language-code (deser-language-code-string (clojure.core/get-in letvar2138140 ["SourceLanguageCode"]))) (letvar2138140 "TargetLanguageCode") (clojure.core/assoc :target-language-code (deser-language-code-string (clojure.core/get-in letvar2138140 ["TargetLanguageCode"])))))))

(clojure.core/defn- response-invalid-parameter-value-exception ([input] (response-invalid-parameter-value-exception nil input)) ([resultWrapper2138142 input] (clojure.core/let [rawinput2138141 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar2138143 {"Message" (rawinput2138141 "Message")}] (clojure.core/cond-> {} (letvar2138143 "Message") (clojure.core/assoc :message (deser-string (clojure.core/get-in letvar2138143 ["Message"])))))))

(clojure.spec.alpha/def :portkey.aws.translate/merge-strategy #{"OVERWRITE" :overwrite})

(clojure.spec.alpha/def :portkey.aws.translate/terminology-arn (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__1410940__auto__] (clojure.core/re-matches #"^arn:aws((-us-gov)|(-cn))?:translate:[a-zA-Z0-9-]+:[0-9]{12}:terminology/.+?/.+?$" s__1410940__auto__))))

(clojure.spec.alpha/def :portkey.aws.translate/import-terminology-response (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.translate/terminology-properties]))

(clojure.spec.alpha/def :portkey.aws.translate/list-terminologies-response (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.translate/terminology-properties-list :portkey.aws.translate/next-token]))

(clojure.spec.alpha/def :portkey.aws.translate.detected-language-low-confidence-exception/message (clojure.spec.alpha/and :portkey.aws.translate/string))
(clojure.spec.alpha/def :portkey.aws.translate.detected-language-low-confidence-exception/detected-language-code (clojure.spec.alpha/and :portkey.aws.translate/language-code-string))
(clojure.spec.alpha/def :portkey.aws.translate/detected-language-low-confidence-exception (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.translate.detected-language-low-confidence-exception/message :portkey.aws.translate.detected-language-low-confidence-exception/detected-language-code]))

(clojure.spec.alpha/def :portkey.aws.translate.terminology-data-location/repository-type (clojure.spec.alpha/and :portkey.aws.translate/string))
(clojure.spec.alpha/def :portkey.aws.translate.terminology-data-location/location (clojure.spec.alpha/and :portkey.aws.translate/string))
(clojure.spec.alpha/def :portkey.aws.translate/terminology-data-location (clojure.spec.alpha/keys :req-un [:portkey.aws.translate.terminology-data-location/repository-type :portkey.aws.translate.terminology-data-location/location] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.translate/terminology-file clojure.core/bytes?)

(clojure.spec.alpha/def :portkey.aws.translate/encryption-key-type #{"KMS" :kms})

(clojure.spec.alpha/def :portkey.aws.translate.terminology-properties/source-language-code (clojure.spec.alpha/and :portkey.aws.translate/language-code-string))
(clojure.spec.alpha/def :portkey.aws.translate.terminology-properties/term-count (clojure.spec.alpha/and :portkey.aws.translate/integer))
(clojure.spec.alpha/def :portkey.aws.translate.terminology-properties/size-bytes (clojure.spec.alpha/and :portkey.aws.translate/integer))
(clojure.spec.alpha/def :portkey.aws.translate.terminology-properties/last-updated-at (clojure.spec.alpha/and :portkey.aws.translate/timestamp))
(clojure.spec.alpha/def :portkey.aws.translate.terminology-properties/target-language-codes (clojure.spec.alpha/and :portkey.aws.translate/language-code-string-list))
(clojure.spec.alpha/def :portkey.aws.translate.terminology-properties/arn (clojure.spec.alpha/and :portkey.aws.translate/terminology-arn))
(clojure.spec.alpha/def :portkey.aws.translate.terminology-properties/created-at (clojure.spec.alpha/and :portkey.aws.translate/timestamp))
(clojure.spec.alpha/def :portkey.aws.translate.terminology-properties/name (clojure.spec.alpha/and :portkey.aws.translate/resource-name))
(clojure.spec.alpha/def :portkey.aws.translate/terminology-properties (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.translate.terminology-properties/source-language-code :portkey.aws.translate.terminology-properties/term-count :portkey.aws.translate.terminology-properties/size-bytes :portkey.aws.translate.terminology-properties/last-updated-at :portkey.aws.translate.terminology-properties/target-language-codes :portkey.aws.translate/description :portkey.aws.translate.terminology-properties/arn :portkey.aws.translate.terminology-properties/created-at :portkey.aws.translate.terminology-properties/name :portkey.aws.translate/encryption-key]))

(clojure.spec.alpha/def :portkey.aws.translate/language-code-string-list (clojure.spec.alpha/coll-of :portkey.aws.translate/language-code-string))

(clojure.spec.alpha/def :portkey.aws.translate.invalid-request-exception/message (clojure.spec.alpha/and :portkey.aws.translate/string))
(clojure.spec.alpha/def :portkey.aws.translate/invalid-request-exception (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.translate.invalid-request-exception/message]))

(clojure.spec.alpha/def :portkey.aws.translate/get-terminology-response (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.translate/terminology-properties :portkey.aws.translate/terminology-data-location]))

(clojure.spec.alpha/def :portkey.aws.translate/terminology-properties-list (clojure.spec.alpha/coll-of :portkey.aws.translate/terminology-properties))

(clojure.spec.alpha/def :portkey.aws.translate/language-code-string (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__1410938__auto__] (clojure.core/<= 2 (clojure.core/count s__1410938__auto__))) (clojure.core/fn [s__1410939__auto__] (clojure.core/< (clojure.core/count s__1410939__auto__) 5))))

(clojure.spec.alpha/def :portkey.aws.translate.translate-text-request/text (clojure.spec.alpha/and :portkey.aws.translate/bounded-length-string))
(clojure.spec.alpha/def :portkey.aws.translate.translate-text-request/terminology-names (clojure.spec.alpha/and :portkey.aws.translate/resource-name-list))
(clojure.spec.alpha/def :portkey.aws.translate.translate-text-request/source-language-code (clojure.spec.alpha/and :portkey.aws.translate/language-code-string))
(clojure.spec.alpha/def :portkey.aws.translate.translate-text-request/target-language-code (clojure.spec.alpha/and :portkey.aws.translate/language-code-string))
(clojure.spec.alpha/def :portkey.aws.translate/translate-text-request (clojure.spec.alpha/keys :req-un [:portkey.aws.translate.translate-text-request/text :portkey.aws.translate.translate-text-request/source-language-code :portkey.aws.translate.translate-text-request/target-language-code] :opt-un [:portkey.aws.translate.translate-text-request/terminology-names]))

(clojure.spec.alpha/def :portkey.aws.translate.text-size-limit-exceeded-exception/message (clojure.spec.alpha/and :portkey.aws.translate/string))
(clojure.spec.alpha/def :portkey.aws.translate/text-size-limit-exceeded-exception (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.translate.text-size-limit-exceeded-exception/message]))

(clojure.spec.alpha/def :portkey.aws.translate.import-terminology-request/name (clojure.spec.alpha/and :portkey.aws.translate/resource-name))
(clojure.spec.alpha/def :portkey.aws.translate/import-terminology-request (clojure.spec.alpha/keys :req-un [:portkey.aws.translate.import-terminology-request/name :portkey.aws.translate/merge-strategy :portkey.aws.translate/terminology-data] :opt-un [:portkey.aws.translate/description :portkey.aws.translate/encryption-key]))

(clojure.spec.alpha/def :portkey.aws.translate.limit-exceeded-exception/message (clojure.spec.alpha/and :portkey.aws.translate/string))
(clojure.spec.alpha/def :portkey.aws.translate/limit-exceeded-exception (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.translate.limit-exceeded-exception/message]))

(clojure.spec.alpha/def :portkey.aws.translate.service-unavailable-exception/message (clojure.spec.alpha/and :portkey.aws.translate/string))
(clojure.spec.alpha/def :portkey.aws.translate/service-unavailable-exception (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.translate.service-unavailable-exception/message]))

(clojure.spec.alpha/def :portkey.aws.translate/next-token (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__1410939__auto__] (clojure.core/< (clojure.core/count s__1410939__auto__) 8192)) (clojure.core/fn [s__1410940__auto__] (clojure.core/re-matches #"\p{ASCII}{0,8192}" s__1410940__auto__))))

(clojure.spec.alpha/def :portkey.aws.translate.too-many-requests-exception/message (clojure.spec.alpha/and :portkey.aws.translate/string))
(clojure.spec.alpha/def :portkey.aws.translate/too-many-requests-exception (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.translate.too-many-requests-exception/message]))

(clojure.spec.alpha/def :portkey.aws.translate/applied-terminology-list (clojure.spec.alpha/coll-of :portkey.aws.translate/applied-terminology))

(clojure.spec.alpha/def :portkey.aws.translate/terminology-data-format #{"CSV" :csv :tmx "TMX"})

(clojure.spec.alpha/def :portkey.aws.translate.resource-not-found-exception/message (clojure.spec.alpha/and :portkey.aws.translate/string))
(clojure.spec.alpha/def :portkey.aws.translate/resource-not-found-exception (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.translate.resource-not-found-exception/message]))

(clojure.spec.alpha/def :portkey.aws.translate.internal-server-exception/message (clojure.spec.alpha/and :portkey.aws.translate/string))
(clojure.spec.alpha/def :portkey.aws.translate/internal-server-exception (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.translate.internal-server-exception/message]))

(clojure.spec.alpha/def :portkey.aws.translate/description (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__1410939__auto__] (clojure.core/< (clojure.core/count s__1410939__auto__) 256)) (clojure.core/fn [s__1410940__auto__] (clojure.core/re-matches #"[\P{M}\p{M}]{0,256}" s__1410940__auto__))))

(clojure.spec.alpha/def :portkey.aws.translate/resource-name-list (clojure.spec.alpha/coll-of :portkey.aws.translate/resource-name))

(clojure.spec.alpha/def :portkey.aws.translate/resource-name (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__1410938__auto__] (clojure.core/<= 1 (clojure.core/count s__1410938__auto__))) (clojure.core/fn [s__1410939__auto__] (clojure.core/< (clojure.core/count s__1410939__auto__) 256)) (clojure.core/fn [s__1410940__auto__] (clojure.core/re-matches #"^([A-Za-z0-9-]_?)+$" s__1410940__auto__))))

(clojure.spec.alpha/def :portkey.aws.translate/integer clojure.core/int?)

(clojure.spec.alpha/def :portkey.aws.translate/string (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__1410939__auto__] (clojure.core/< (clojure.core/count s__1410939__auto__) 10000)) (clojure.core/fn [s__1410940__auto__] (clojure.core/re-matches #"[\P{M}\p{M}]{0,10000}" s__1410940__auto__))))

(clojure.spec.alpha/def :portkey.aws.translate.get-terminology-request/name (clojure.spec.alpha/and :portkey.aws.translate/resource-name))
(clojure.spec.alpha/def :portkey.aws.translate/get-terminology-request (clojure.spec.alpha/keys :req-un [:portkey.aws.translate.get-terminology-request/name :portkey.aws.translate/terminology-data-format] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.translate/term-list (clojure.spec.alpha/coll-of :portkey.aws.translate/term))

(clojure.spec.alpha/def :portkey.aws.translate.terminology-data/file (clojure.spec.alpha/and :portkey.aws.translate/terminology-file))
(clojure.spec.alpha/def :portkey.aws.translate.terminology-data/format (clojure.spec.alpha/and :portkey.aws.translate/terminology-data-format))
(clojure.spec.alpha/def :portkey.aws.translate/terminology-data (clojure.spec.alpha/keys :req-un [:portkey.aws.translate.terminology-data/file :portkey.aws.translate.terminology-data/format] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.translate/encryption-key-id (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__1410938__auto__] (clojure.core/<= 1 (clojure.core/count s__1410938__auto__))) (clojure.core/fn [s__1410939__auto__] (clojure.core/< (clojure.core/count s__1410939__auto__) 400)) (clojure.core/fn [s__1410940__auto__] (clojure.core/re-matches #"(arn:aws((-us-gov)|(-cn))?:kms:)?([a-z]{2}-[a-z]+-\d:)?(\d{12}:)?(((key/)?[a-zA-Z0-9-_]+)|(alias/[a-zA-Z0-9:/_-]+))" s__1410940__auto__))))

(clojure.spec.alpha/def :portkey.aws.translate.translate-text-response/translated-text (clojure.spec.alpha/and :portkey.aws.translate/string))
(clojure.spec.alpha/def :portkey.aws.translate.translate-text-response/source-language-code (clojure.spec.alpha/and :portkey.aws.translate/language-code-string))
(clojure.spec.alpha/def :portkey.aws.translate.translate-text-response/target-language-code (clojure.spec.alpha/and :portkey.aws.translate/language-code-string))
(clojure.spec.alpha/def :portkey.aws.translate.translate-text-response/applied-terminologies (clojure.spec.alpha/and :portkey.aws.translate/applied-terminology-list))
(clojure.spec.alpha/def :portkey.aws.translate/translate-text-response (clojure.spec.alpha/keys :req-un [:portkey.aws.translate.translate-text-response/translated-text :portkey.aws.translate.translate-text-response/source-language-code :portkey.aws.translate.translate-text-response/target-language-code] :opt-un [:portkey.aws.translate.translate-text-response/applied-terminologies]))

(clojure.spec.alpha/def :portkey.aws.translate.delete-terminology-request/name (clojure.spec.alpha/and :portkey.aws.translate/resource-name))
(clojure.spec.alpha/def :portkey.aws.translate/delete-terminology-request (clojure.spec.alpha/keys :req-un [:portkey.aws.translate.delete-terminology-request/name] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.translate.unsupported-language-pair-exception/message (clojure.spec.alpha/and :portkey.aws.translate/string))
(clojure.spec.alpha/def :portkey.aws.translate.unsupported-language-pair-exception/source-language-code (clojure.spec.alpha/and :portkey.aws.translate/language-code-string))
(clojure.spec.alpha/def :portkey.aws.translate.unsupported-language-pair-exception/target-language-code (clojure.spec.alpha/and :portkey.aws.translate/language-code-string))
(clojure.spec.alpha/def :portkey.aws.translate/unsupported-language-pair-exception (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.translate.unsupported-language-pair-exception/message :portkey.aws.translate.unsupported-language-pair-exception/source-language-code :portkey.aws.translate.unsupported-language-pair-exception/target-language-code]))

(clojure.spec.alpha/def :portkey.aws.translate/timestamp clojure.core/inst?)

(clojure.spec.alpha/def :portkey.aws.translate.applied-terminology/name (clojure.spec.alpha/and :portkey.aws.translate/resource-name))
(clojure.spec.alpha/def :portkey.aws.translate.applied-terminology/terms (clojure.spec.alpha/and :portkey.aws.translate/term-list))
(clojure.spec.alpha/def :portkey.aws.translate/applied-terminology (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.translate.applied-terminology/name :portkey.aws.translate.applied-terminology/terms]))

(clojure.spec.alpha/def :portkey.aws.translate/bounded-length-string (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__1410938__auto__] (clojure.core/<= 1 (clojure.core/count s__1410938__auto__))) (clojure.core/fn [s__1410939__auto__] (clojure.core/< (clojure.core/count s__1410939__auto__) 5000)) (clojure.core/fn [s__1410940__auto__] (clojure.core/re-matches #"[\P{M}\p{M}]{1,5000}" s__1410940__auto__))))

(clojure.spec.alpha/def :portkey.aws.translate.list-terminologies-request/max-results (clojure.spec.alpha/and :portkey.aws.translate/max-results-integer))
(clojure.spec.alpha/def :portkey.aws.translate/list-terminologies-request (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.translate/next-token :portkey.aws.translate.list-terminologies-request/max-results]))

(clojure.spec.alpha/def :portkey.aws.translate/max-results-integer (clojure.spec.alpha/int-in 1 500))

(clojure.spec.alpha/def :portkey.aws.translate.invalid-parameter-value-exception/message (clojure.spec.alpha/and :portkey.aws.translate/string))
(clojure.spec.alpha/def :portkey.aws.translate/invalid-parameter-value-exception (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.translate.invalid-parameter-value-exception/message]))

(clojure.spec.alpha/def :portkey.aws.translate.term/source-text (clojure.spec.alpha/and :portkey.aws.translate/string))
(clojure.spec.alpha/def :portkey.aws.translate.term/target-text (clojure.spec.alpha/and :portkey.aws.translate/string))
(clojure.spec.alpha/def :portkey.aws.translate/term (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.translate.term/source-text :portkey.aws.translate.term/target-text]))

(clojure.spec.alpha/def :portkey.aws.translate.encryption-key/type (clojure.spec.alpha/and :portkey.aws.translate/encryption-key-type))
(clojure.spec.alpha/def :portkey.aws.translate.encryption-key/id (clojure.spec.alpha/and :portkey.aws.translate/encryption-key-id))
(clojure.spec.alpha/def :portkey.aws.translate/encryption-key (clojure.spec.alpha/keys :req-un [:portkey.aws.translate.encryption-key/type :portkey.aws.translate.encryption-key/id] :opt-un []))

(clojure.core/defn delete-terminology "A synchronous action that deletes a custom terminology." ([delete-terminology-requestinput] (clojure.core/let [request-function-result__1411981__auto__ (req-delete-terminology-request delete-terminology-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__1411981__auto__ {:http.request.configuration/endpoints portkey.aws.translate/endpoints, :http.request.configuration/target-prefix "AWSShineFrontendService_20170701", :http.request.spec/output-spec nil, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2017-07-01", :http.request.configuration/service-id "Translate", :http.request.spec/input-spec :portkey.aws.translate/delete-terminology-request, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "DeleteTerminology", :http.request.configuration/output-deser-fn (clojure.core/fn [& args__1411980__auto__] {}), :http.request.spec/error-spec {"ResourceNotFoundException" :portkey.aws.translate/resource-not-found-exception, "TooManyRequestsException" :portkey.aws.translate/too-many-requests-exception, "InternalServerException" :portkey.aws.translate/internal-server-exception}})))))
(clojure.spec.alpha/fdef delete-terminology :args (clojure.spec.alpha/tuple :portkey.aws.translate/delete-terminology-request) :ret clojure.core/true?)

(clojure.core/defn get-terminology "Retrieves a custom terminology." ([get-terminology-requestinput] (clojure.core/let [request-function-result__1411981__auto__ (req-get-terminology-request get-terminology-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__1411981__auto__ {:http.request.configuration/endpoints portkey.aws.translate/endpoints, :http.request.configuration/target-prefix "AWSShineFrontendService_20170701", :http.request.spec/output-spec :portkey.aws.translate/get-terminology-response, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2017-07-01", :http.request.configuration/service-id "Translate", :http.request.spec/input-spec :portkey.aws.translate/get-terminology-request, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "GetTerminology", :http.request.configuration/output-deser-fn response-get-terminology-response, :http.request.spec/error-spec {"ResourceNotFoundException" :portkey.aws.translate/resource-not-found-exception, "InvalidParameterValueException" :portkey.aws.translate/invalid-parameter-value-exception, "TooManyRequestsException" :portkey.aws.translate/too-many-requests-exception, "InternalServerException" :portkey.aws.translate/internal-server-exception}})))))
(clojure.spec.alpha/fdef get-terminology :args (clojure.spec.alpha/tuple :portkey.aws.translate/get-terminology-request) :ret (clojure.spec.alpha/and :portkey.aws.translate/get-terminology-response))

(clojure.core/defn import-terminology "Creates or updates a custom terminology, depending on whether or not one already\nexists for the given terminology name. Importing a terminology with the same\nname as an existing one will merge the terminologies based on the chosen merge\nstrategy. Currently, the only supported merge strategy is OVERWRITE, and so the\nimported terminology will overwrite an existing terminology of the same name.\n If you import a terminology that overwrites an existing one, the new\nterminology take up to 10 minutes to fully propagate and be available for use in\na translation due to cache policies with the DataPlane service that performs the\ntranslations." ([import-terminology-requestinput] (clojure.core/let [request-function-result__1411981__auto__ (req-import-terminology-request import-terminology-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__1411981__auto__ {:http.request.configuration/endpoints portkey.aws.translate/endpoints, :http.request.configuration/target-prefix "AWSShineFrontendService_20170701", :http.request.spec/output-spec :portkey.aws.translate/import-terminology-response, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2017-07-01", :http.request.configuration/service-id "Translate", :http.request.spec/input-spec :portkey.aws.translate/import-terminology-request, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "ImportTerminology", :http.request.configuration/output-deser-fn response-import-terminology-response, :http.request.spec/error-spec {"InvalidParameterValueException" :portkey.aws.translate/invalid-parameter-value-exception, "LimitExceededException" :portkey.aws.translate/limit-exceeded-exception, "TooManyRequestsException" :portkey.aws.translate/too-many-requests-exception, "InternalServerException" :portkey.aws.translate/internal-server-exception}})))))
(clojure.spec.alpha/fdef import-terminology :args (clojure.spec.alpha/tuple :portkey.aws.translate/import-terminology-request) :ret (clojure.spec.alpha/and :portkey.aws.translate/import-terminology-response))

(clojure.core/defn list-terminologies "Provides a list of custom terminologies associated with your account." ([] (list-terminologies {})) ([list-terminologies-requestinput] (clojure.core/let [request-function-result__1411981__auto__ (req-list-terminologies-request list-terminologies-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__1411981__auto__ {:http.request.configuration/endpoints portkey.aws.translate/endpoints, :http.request.configuration/target-prefix "AWSShineFrontendService_20170701", :http.request.spec/output-spec :portkey.aws.translate/list-terminologies-response, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2017-07-01", :http.request.configuration/service-id "Translate", :http.request.spec/input-spec :portkey.aws.translate/list-terminologies-request, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "ListTerminologies", :http.request.configuration/output-deser-fn response-list-terminologies-response, :http.request.spec/error-spec {"InvalidParameterValueException" :portkey.aws.translate/invalid-parameter-value-exception, "TooManyRequestsException" :portkey.aws.translate/too-many-requests-exception, "InternalServerException" :portkey.aws.translate/internal-server-exception}})))))
(clojure.spec.alpha/fdef list-terminologies :args (clojure.spec.alpha/? :portkey.aws.translate/list-terminologies-request) :ret (clojure.spec.alpha/and :portkey.aws.translate/list-terminologies-response))

(clojure.core/defn translate-text "Translates input text from the source language to the target language. It is not\nnecessary to use English (en) as either the source or the target language but\nnot all language combinations are supported by Amazon Translate. For more\ninformation, see Supported Language Pairs\n(http://docs.aws.amazon.com/translate/latest/dg/pairs.html).\n * Arabic (ar)\n * Chinese (Simplified) (zh)\n * Chinese (Traditional) (zh-TW)\n * Czech (cs)\n * Danish (da)\n * Dutch (nl)\n * English (en)\n * Finnish (fi)\n * French (fr)\n * German (de)\n * Hebrew (he)\n * Indonesian (id)\n * Italian (it)\n * Japanese (ja)\n * Korean (ko)\n * Polish (pl)\n * Portuguese (pt)\n * Russian (ru)\n * Spanish (es)\n * Swedish (sv)\n * Turkish (tr)\n To have Amazon Translate determine the source language of your text, you can\nspecify auto in the SourceLanguageCode field. If you specify auto, Amazon\nTranslate will call Amazon Comprehend to determine the source language." ([translate-text-requestinput] (clojure.core/let [request-function-result__1411981__auto__ (req-translate-text-request translate-text-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__1411981__auto__ {:http.request.configuration/endpoints portkey.aws.translate/endpoints, :http.request.configuration/target-prefix "AWSShineFrontendService_20170701", :http.request.spec/output-spec :portkey.aws.translate/translate-text-response, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2017-07-01", :http.request.configuration/service-id "Translate", :http.request.spec/input-spec :portkey.aws.translate/translate-text-request, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "TranslateText", :http.request.configuration/output-deser-fn response-translate-text-response, :http.request.spec/error-spec {"InvalidRequestException" :portkey.aws.translate/invalid-request-exception, "TextSizeLimitExceededException" :portkey.aws.translate/text-size-limit-exceeded-exception, "TooManyRequestsException" :portkey.aws.translate/too-many-requests-exception, "UnsupportedLanguagePairException" :portkey.aws.translate/unsupported-language-pair-exception, "DetectedLanguageLowConfidenceException" :portkey.aws.translate/detected-language-low-confidence-exception, "ResourceNotFoundException" :portkey.aws.translate/resource-not-found-exception, "InternalServerException" :portkey.aws.translate/internal-server-exception, "ServiceUnavailableException" :portkey.aws.translate/service-unavailable-exception}})))))
(clojure.spec.alpha/fdef translate-text :args (clojure.spec.alpha/tuple :portkey.aws.translate/translate-text-request) :ret (clojure.spec.alpha/and :portkey.aws.translate/translate-text-response))
