(ns portkey.aws.meteringmarketplace (:require [portkey.aws]))

(def
 endpoints
 '{"ap-northeast-1"
   {:credential-scope
    {:service "aws-marketplace", :region "ap-northeast-1"},
    :ssl-common-name
    "metering.marketplace.ap-northeast-1.amazonaws.com",
    :endpoint
    "https://metering.marketplace.ap-northeast-1.amazonaws.com",
    :signature-version :v4},
   "eu-west-1"
   {:credential-scope
    {:service "aws-marketplace", :region "eu-west-1"},
    :ssl-common-name "metering.marketplace.eu-west-1.amazonaws.com",
    :endpoint "https://metering.marketplace.eu-west-1.amazonaws.com",
    :signature-version :v4},
   "us-east-2"
   {:credential-scope
    {:service "aws-marketplace", :region "us-east-2"},
    :ssl-common-name "metering.marketplace.us-east-2.amazonaws.com",
    :endpoint "https://metering.marketplace.us-east-2.amazonaws.com",
    :signature-version :v4},
   "ap-southeast-2"
   {:credential-scope
    {:service "aws-marketplace", :region "ap-southeast-2"},
    :ssl-common-name
    "metering.marketplace.ap-southeast-2.amazonaws.com",
    :endpoint
    "https://metering.marketplace.ap-southeast-2.amazonaws.com",
    :signature-version :v4},
   "sa-east-1"
   {:credential-scope
    {:service "aws-marketplace", :region "sa-east-1"},
    :ssl-common-name "metering.marketplace.sa-east-1.amazonaws.com",
    :endpoint "https://metering.marketplace.sa-east-1.amazonaws.com",
    :signature-version :v4},
   "ap-southeast-1"
   {:credential-scope
    {:service "aws-marketplace", :region "ap-southeast-1"},
    :ssl-common-name
    "metering.marketplace.ap-southeast-1.amazonaws.com",
    :endpoint
    "https://metering.marketplace.ap-southeast-1.amazonaws.com",
    :signature-version :v4},
   "ap-northeast-2"
   {:credential-scope
    {:service "aws-marketplace", :region "ap-northeast-2"},
    :ssl-common-name
    "metering.marketplace.ap-northeast-2.amazonaws.com",
    :endpoint
    "https://metering.marketplace.ap-northeast-2.amazonaws.com",
    :signature-version :v4},
   "eu-west-3"
   {:credential-scope
    {:service "aws-marketplace", :region "eu-west-3"},
    :ssl-common-name "metering.marketplace.eu-west-3.amazonaws.com",
    :endpoint "https://metering.marketplace.eu-west-3.amazonaws.com",
    :signature-version :v4},
   "ca-central-1"
   {:credential-scope
    {:service "aws-marketplace", :region "ca-central-1"},
    :ssl-common-name "metering.marketplace.ca-central-1.amazonaws.com",
    :endpoint
    "https://metering.marketplace.ca-central-1.amazonaws.com",
    :signature-version :v4},
   "eu-central-1"
   {:credential-scope
    {:service "aws-marketplace", :region "eu-central-1"},
    :ssl-common-name "metering.marketplace.eu-central-1.amazonaws.com",
    :endpoint
    "https://metering.marketplace.eu-central-1.amazonaws.com",
    :signature-version :v4},
   "eu-west-2"
   {:credential-scope
    {:service "aws-marketplace", :region "eu-west-2"},
    :ssl-common-name "metering.marketplace.eu-west-2.amazonaws.com",
    :endpoint "https://metering.marketplace.eu-west-2.amazonaws.com",
    :signature-version :v4},
   "us-gov-west-1"
   {:credential-scope
    {:service "aws-marketplace", :region "us-gov-west-1"},
    :ssl-common-name
    "metering.marketplace.us-gov-west-1.amazonaws.com",
    :endpoint
    "https://metering.marketplace.us-gov-west-1.amazonaws.com",
    :signature-version :v4},
   "us-west-2"
   {:credential-scope
    {:service "aws-marketplace", :region "us-west-2"},
    :ssl-common-name "metering.marketplace.us-west-2.amazonaws.com",
    :endpoint "https://metering.marketplace.us-west-2.amazonaws.com",
    :signature-version :v4},
   "us-east-1"
   {:credential-scope
    {:service "aws-marketplace", :region "us-east-1"},
    :ssl-common-name "metering.marketplace.us-east-1.amazonaws.com",
    :endpoint "https://metering.marketplace.us-east-1.amazonaws.com",
    :signature-version :v4},
   "us-west-1"
   {:credential-scope
    {:service "aws-marketplace", :region "us-west-1"},
    :ssl-common-name "metering.marketplace.us-west-1.amazonaws.com",
    :endpoint "https://metering.marketplace.us-west-1.amazonaws.com",
    :signature-version :v4},
   "ap-south-1"
   {:credential-scope
    {:service "aws-marketplace", :region "ap-south-1"},
    :ssl-common-name "metering.marketplace.ap-south-1.amazonaws.com",
    :endpoint "https://metering.marketplace.ap-south-1.amazonaws.com",
    :signature-version :v4},
   "eu-north-1"
   {:credential-scope
    {:service "aws-marketplace", :region "eu-north-1"},
    :ssl-common-name "metering.marketplace.eu-north-1.amazonaws.com",
    :endpoint "https://metering.marketplace.eu-north-1.amazonaws.com",
    :signature-version :v4}})

(clojure.core/declare ser-usage-record-list)

(clojure.core/declare ser-non-empty-string)

(clojure.core/declare ser-usage-record)

(clojure.core/declare ser-usage-dimension)

(clojure.core/declare ser-customer-identifier)

(clojure.core/declare ser-usage-quantity)

(clojure.core/declare ser-version-integer)

(clojure.core/declare ser-timestamp)

(clojure.core/declare ser-product-code)

(clojure.core/declare ser-nonce)

(clojure.core/declare ser-boolean)

(clojure.core/defn- ser-usage-record-list [input] #:http.request.field{:value (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (clojure.core/merge (ser-usage-record coll) #:http.request.field{:shape "UsageRecord"}))) input), :shape "UsageRecordList", :type "list", :max 25, :min 0})

(clojure.core/defn- ser-non-empty-string [input] #:http.request.field{:value input, :shape "NonEmptyString"})

(clojure.core/defn- ser-usage-record [input] (clojure.core/cond-> #:http.request.field{:value [(clojure.core/into (ser-timestamp (:timestamp input)) #:http.request.field{:name "Timestamp", :shape "Timestamp"}) (clojure.core/into (ser-customer-identifier (:customer-identifier input)) #:http.request.field{:name "CustomerIdentifier", :shape "CustomerIdentifier"}) (clojure.core/into (ser-usage-dimension (:dimension input)) #:http.request.field{:name "Dimension", :shape "UsageDimension"}) (clojure.core/into (ser-usage-quantity (:quantity input)) #:http.request.field{:name "Quantity", :shape "UsageQuantity"})], :shape "UsageRecord", :type "structure"}))

(clojure.core/defn- ser-usage-dimension [input] #:http.request.field{:value input, :shape "UsageDimension"})

(clojure.core/defn- ser-customer-identifier [input] #:http.request.field{:value input, :shape "CustomerIdentifier"})

(clojure.core/defn- ser-usage-quantity [input] #:http.request.field{:value input, :shape "UsageQuantity"})

(clojure.core/defn- ser-version-integer [input] #:http.request.field{:value input, :shape "VersionInteger"})

(clojure.core/defn- ser-timestamp [input] #:http.request.field{:value input, :shape "Timestamp"})

(clojure.core/defn- ser-product-code [input] #:http.request.field{:value input, :shape "ProductCode"})

(clojure.core/defn- ser-nonce [input] #:http.request.field{:value input, :shape "Nonce"})

(clojure.core/defn- ser-boolean [input] #:http.request.field{:value input, :shape "Boolean"})

(clojure.core/defn- req-batch-meter-usage-request [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (ser-usage-record-list (input :usage-records)) #:http.request.field{:name "UsageRecords", :shape "UsageRecordList"}) (clojure.core/into (ser-product-code (input :product-code)) #:http.request.field{:name "ProductCode", :shape "ProductCode"})]}))

(clojure.core/defn- req-register-usage-request [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (ser-product-code (input :product-code)) #:http.request.field{:name "ProductCode", :shape "ProductCode"}) (clojure.core/into (ser-version-integer (input :public-key-version)) #:http.request.field{:name "PublicKeyVersion", :shape "VersionInteger"})]} (clojure.core/contains? input :nonce) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-nonce (input :nonce)) #:http.request.field{:name "Nonce", :shape "Nonce"}))))

(clojure.core/defn- req-meter-usage-request [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (ser-product-code (input :product-code)) #:http.request.field{:name "ProductCode", :shape "ProductCode"}) (clojure.core/into (ser-timestamp (input :timestamp)) #:http.request.field{:name "Timestamp", :shape "Timestamp"}) (clojure.core/into (ser-usage-dimension (input :usage-dimension)) #:http.request.field{:name "UsageDimension", :shape "UsageDimension"}) (clojure.core/into (ser-usage-quantity (input :usage-quantity)) #:http.request.field{:name "UsageQuantity", :shape "UsageQuantity"}) (clojure.core/into (ser-boolean (input :dry-run)) #:http.request.field{:name "DryRun", :shape "Boolean"})]}))

(clojure.core/defn- req-resolve-customer-request [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (ser-non-empty-string (input :registration-token)) #:http.request.field{:name "RegistrationToken", :shape "NonEmptyString"})]}))

(clojure.core/declare deser-usage-record-list)

(clojure.core/declare deser-non-empty-string)

(clojure.core/declare deser-usage-record)

(clojure.core/declare desererror-message)

(clojure.core/declare deser-usage-dimension)

(clojure.core/declare deser-customer-identifier)

(clojure.core/declare deser-usage-record-result-status)

(clojure.core/declare deser-usage-record-result)

(clojure.core/declare deser-usage-quantity)

(clojure.core/declare deser-usage-record-result-list)

(clojure.core/declare deser-string)

(clojure.core/declare deser-timestamp)

(clojure.core/declare deser-product-code)

(clojure.core/defn- deser-usage-record-list [input] (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (deser-usage-record coll))) input))

(clojure.core/defn- deser-non-empty-string [input] input)

(clojure.core/defn- deser-usage-record [input] (clojure.core/cond-> {:timestamp (deser-timestamp (input "Timestamp")), :customer-identifier (deser-customer-identifier (input "CustomerIdentifier")), :dimension (deser-usage-dimension (input "Dimension")), :quantity (deser-usage-quantity (input "Quantity"))}))

(clojure.core/defn- desererror-message [input] input)

(clojure.core/defn- deser-usage-dimension [input] input)

(clojure.core/defn- deser-customer-identifier [input] input)

(clojure.core/defn- deser-usage-record-result-status [input] (clojure.core/get {"Success" :success, "CustomerNotSubscribed" :customer-not-subscribed, "DuplicateRecord" :duplicate-record} input))

(clojure.core/defn- deser-usage-record-result [input] (clojure.core/cond-> {} (clojure.core/contains? input "UsageRecord") (clojure.core/assoc :usage-record (deser-usage-record (input "UsageRecord"))) (clojure.core/contains? input "MeteringRecordId") (clojure.core/assoc :metering-record-id (deser-string (input "MeteringRecordId"))) (clojure.core/contains? input "Status") (clojure.core/assoc :status (deser-usage-record-result-status (input "Status")))))

(clojure.core/defn- deser-usage-quantity [input] input)

(clojure.core/defn- deser-usage-record-result-list [input] (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (deser-usage-record-result coll))) input))

(clojure.core/defn- deser-string [input] input)

(clojure.core/defn- deser-timestamp [input] input)

(clojure.core/defn- deser-product-code [input] input)

(clojure.core/defn- response-invalid-token-exception ([input] (response-invalid-token-exception nil input)) ([resultWrapper1919008 input] (clojure.core/let [rawinput1919007 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar1919009 {"message" (rawinput1919007 "message")}] (clojure.core/cond-> {} (letvar1919009 "message") (clojure.core/assoc :message (desererror-message (clojure.core/get-in letvar1919009 ["message"])))))))

(clojure.core/defn- response-duplicate-request-exception ([input] (response-duplicate-request-exception nil input)) ([resultWrapper1919011 input] (clojure.core/let [rawinput1919010 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar1919012 {"message" (rawinput1919010 "message")}] (clojure.core/cond-> {} (letvar1919012 "message") (clojure.core/assoc :message (desererror-message (clojure.core/get-in letvar1919012 ["message"])))))))

(clojure.core/defn- response-invalid-product-code-exception ([input] (response-invalid-product-code-exception nil input)) ([resultWrapper1919014 input] (clojure.core/let [rawinput1919013 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar1919015 {"message" (rawinput1919013 "message")}] (clojure.core/cond-> {} (letvar1919015 "message") (clojure.core/assoc :message (desererror-message (clojure.core/get-in letvar1919015 ["message"])))))))

(clojure.core/defn- response-customer-not-entitled-exception ([input] (response-customer-not-entitled-exception nil input)) ([resultWrapper1919017 input] (clojure.core/let [rawinput1919016 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar1919018 {"message" (rawinput1919016 "message")}] (clojure.core/cond-> {} (letvar1919018 "message") (clojure.core/assoc :message (desererror-message (clojure.core/get-in letvar1919018 ["message"])))))))

(clojure.core/defn- response-internal-service-error-exception ([input] (response-internal-service-error-exception nil input)) ([resultWrapper1919020 input] (clojure.core/let [rawinput1919019 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar1919021 {"message" (rawinput1919019 "message")}] (clojure.core/cond-> {} (letvar1919021 "message") (clojure.core/assoc :message (desererror-message (clojure.core/get-in letvar1919021 ["message"])))))))

(clojure.core/defn- response-invalid-usage-dimension-exception ([input] (response-invalid-usage-dimension-exception nil input)) ([resultWrapper1919023 input] (clojure.core/let [rawinput1919022 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar1919024 {"message" (rawinput1919022 "message")}] (clojure.core/cond-> {} (letvar1919024 "message") (clojure.core/assoc :message (desererror-message (clojure.core/get-in letvar1919024 ["message"])))))))

(clojure.core/defn- response-platform-not-supported-exception ([input] (response-platform-not-supported-exception nil input)) ([resultWrapper1919026 input] (clojure.core/let [rawinput1919025 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar1919027 {"message" (rawinput1919025 "message")}] (clojure.core/cond-> {} (letvar1919027 "message") (clojure.core/assoc :message (desererror-message (clojure.core/get-in letvar1919027 ["message"])))))))

(clojure.core/defn- response-disabled-api-exception ([input] (response-disabled-api-exception nil input)) ([resultWrapper1919029 input] (clojure.core/let [rawinput1919028 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar1919030 {"message" (rawinput1919028 "message")}] (clojure.core/cond-> {} (letvar1919030 "message") (clojure.core/assoc :message (desererror-message (clojure.core/get-in letvar1919030 ["message"])))))))

(clojure.core/defn- response-invalid-customer-identifier-exception ([input] (response-invalid-customer-identifier-exception nil input)) ([resultWrapper1919032 input] (clojure.core/let [rawinput1919031 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar1919033 {"message" (rawinput1919031 "message")}] (clojure.core/cond-> {} (letvar1919033 "message") (clojure.core/assoc :message (desererror-message (clojure.core/get-in letvar1919033 ["message"])))))))

(clojure.core/defn- response-batch-meter-usage-result ([input] (response-batch-meter-usage-result nil input)) ([resultWrapper1919035 input] (clojure.core/let [rawinput1919034 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar1919036 {"Results" (rawinput1919034 "Results"), "UnprocessedRecords" (rawinput1919034 "UnprocessedRecords")}] (clojure.core/cond-> {} (letvar1919036 "Results") (clojure.core/assoc :results (deser-usage-record-result-list (clojure.core/get-in letvar1919036 ["Results"]))) (letvar1919036 "UnprocessedRecords") (clojure.core/assoc :unprocessed-records (deser-usage-record-list (clojure.core/get-in letvar1919036 ["UnprocessedRecords"])))))))

(clojure.core/defn- response-resolve-customer-result ([input] (response-resolve-customer-result nil input)) ([resultWrapper1919038 input] (clojure.core/let [rawinput1919037 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar1919039 {"CustomerIdentifier" (rawinput1919037 "CustomerIdentifier"), "ProductCode" (rawinput1919037 "ProductCode")}] (clojure.core/cond-> {} (letvar1919039 "CustomerIdentifier") (clojure.core/assoc :customer-identifier (deser-customer-identifier (clojure.core/get-in letvar1919039 ["CustomerIdentifier"]))) (letvar1919039 "ProductCode") (clojure.core/assoc :product-code (deser-product-code (clojure.core/get-in letvar1919039 ["ProductCode"])))))))

(clojure.core/defn- response-register-usage-result ([input] (response-register-usage-result nil input)) ([resultWrapper1919041 input] (clojure.core/let [rawinput1919040 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar1919042 {"PublicKeyRotationTimestamp" (rawinput1919040 "PublicKeyRotationTimestamp"), "Signature" (rawinput1919040 "Signature")}] (clojure.core/cond-> {} (letvar1919042 "PublicKeyRotationTimestamp") (clojure.core/assoc :public-key-rotation-timestamp (deser-timestamp (clojure.core/get-in letvar1919042 ["PublicKeyRotationTimestamp"]))) (letvar1919042 "Signature") (clojure.core/assoc :signature (deser-non-empty-string (clojure.core/get-in letvar1919042 ["Signature"])))))))

(clojure.core/defn- response-throttling-exception ([input] (response-throttling-exception nil input)) ([resultWrapper1919044 input] (clojure.core/let [rawinput1919043 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar1919045 {"message" (rawinput1919043 "message")}] (clojure.core/cond-> {} (letvar1919045 "message") (clojure.core/assoc :message (desererror-message (clojure.core/get-in letvar1919045 ["message"])))))))

(clojure.core/defn- response-meter-usage-result ([input] (response-meter-usage-result nil input)) ([resultWrapper1919047 input] (clojure.core/let [rawinput1919046 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar1919048 {"MeteringRecordId" (rawinput1919046 "MeteringRecordId")}] (clojure.core/cond-> {} (letvar1919048 "MeteringRecordId") (clojure.core/assoc :metering-record-id (deser-string (clojure.core/get-in letvar1919048 ["MeteringRecordId"])))))))

(clojure.core/defn- response-invalid-region-exception ([input] (response-invalid-region-exception nil input)) ([resultWrapper1919050 input] (clojure.core/let [rawinput1919049 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar1919051 {"message" (rawinput1919049 "message")}] (clojure.core/cond-> {} (letvar1919051 "message") (clojure.core/assoc :message (desererror-message (clojure.core/get-in letvar1919051 ["message"])))))))

(clojure.core/defn- response-expired-token-exception ([input] (response-expired-token-exception nil input)) ([resultWrapper1919053 input] (clojure.core/let [rawinput1919052 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar1919054 {"message" (rawinput1919052 "message")}] (clojure.core/cond-> {} (letvar1919054 "message") (clojure.core/assoc :message (desererror-message (clojure.core/get-in letvar1919054 ["message"])))))))

(clojure.core/defn- response-invalid-public-key-version-exception ([input] (response-invalid-public-key-version-exception nil input)) ([resultWrapper1919056 input] (clojure.core/let [rawinput1919055 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar1919057 {"message" (rawinput1919055 "message")}] (clojure.core/cond-> {} (letvar1919057 "message") (clojure.core/assoc :message (desererror-message (clojure.core/get-in letvar1919057 ["message"])))))))

(clojure.core/defn- response-invalid-endpoint-region-exception ([input] (response-invalid-endpoint-region-exception nil input)) ([resultWrapper1919059 input] (clojure.core/let [rawinput1919058 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar1919060 {"message" (rawinput1919058 "message")}] (clojure.core/cond-> {} (letvar1919060 "message") (clojure.core/assoc :message (desererror-message (clojure.core/get-in letvar1919060 ["message"])))))))

(clojure.core/defn- response-timestamp-out-of-bounds-exception ([input] (response-timestamp-out-of-bounds-exception nil input)) ([resultWrapper1919062 input] (clojure.core/let [rawinput1919061 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar1919063 {"message" (rawinput1919061 "message")}] (clojure.core/cond-> {} (letvar1919063 "message") (clojure.core/assoc :message (desererror-message (clojure.core/get-in letvar1919063 ["message"])))))))

(clojure.spec.alpha/def :portkey.aws.meteringmarketplace.invalid-token-exception/message (clojure.spec.alpha/and :portkey.aws.meteringmarketplace/error-message))
(clojure.spec.alpha/def :portkey.aws.meteringmarketplace/invalid-token-exception (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.meteringmarketplace.invalid-token-exception/message]))

(clojure.spec.alpha/def :portkey.aws.meteringmarketplace.batch-meter-usage-request/usage-records (clojure.spec.alpha/and :portkey.aws.meteringmarketplace/usage-record-list))
(clojure.spec.alpha/def :portkey.aws.meteringmarketplace/batch-meter-usage-request (clojure.spec.alpha/keys :req-un [:portkey.aws.meteringmarketplace.batch-meter-usage-request/usage-records :portkey.aws.meteringmarketplace/product-code] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.meteringmarketplace.duplicate-request-exception/message (clojure.spec.alpha/and :portkey.aws.meteringmarketplace/error-message))
(clojure.spec.alpha/def :portkey.aws.meteringmarketplace/duplicate-request-exception (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.meteringmarketplace.duplicate-request-exception/message]))

(clojure.spec.alpha/def :portkey.aws.meteringmarketplace/usage-record-list (clojure.spec.alpha/coll-of :portkey.aws.meteringmarketplace/usage-record :min-count 0 :max-count 25))

(clojure.spec.alpha/def :portkey.aws.meteringmarketplace/non-empty-string (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__1467903__auto__] (clojure.core/re-matches #"\S+" s__1467903__auto__))))

(clojure.spec.alpha/def :portkey.aws.meteringmarketplace.usage-record/dimension (clojure.spec.alpha/and :portkey.aws.meteringmarketplace/usage-dimension))
(clojure.spec.alpha/def :portkey.aws.meteringmarketplace.usage-record/quantity (clojure.spec.alpha/and :portkey.aws.meteringmarketplace/usage-quantity))
(clojure.spec.alpha/def :portkey.aws.meteringmarketplace/usage-record (clojure.spec.alpha/keys :req-un [:portkey.aws.meteringmarketplace/timestamp :portkey.aws.meteringmarketplace/customer-identifier :portkey.aws.meteringmarketplace.usage-record/dimension :portkey.aws.meteringmarketplace.usage-record/quantity] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.meteringmarketplace/error-message (clojure.spec.alpha/and clojure.core/string?))

(clojure.spec.alpha/def :portkey.aws.meteringmarketplace.invalid-product-code-exception/message (clojure.spec.alpha/and :portkey.aws.meteringmarketplace/error-message))
(clojure.spec.alpha/def :portkey.aws.meteringmarketplace/invalid-product-code-exception (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.meteringmarketplace.invalid-product-code-exception/message]))

(clojure.spec.alpha/def :portkey.aws.meteringmarketplace/usage-dimension (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__1467901__auto__] (clojure.core/<= 1 (clojure.core/count s__1467901__auto__))) (clojure.core/fn [s__1467902__auto__] (clojure.core/< (clojure.core/count s__1467902__auto__) 255))))

(clojure.spec.alpha/def :portkey.aws.meteringmarketplace/customer-identifier (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__1467901__auto__] (clojure.core/<= 1 (clojure.core/count s__1467901__auto__))) (clojure.core/fn [s__1467902__auto__] (clojure.core/< (clojure.core/count s__1467902__auto__) 255))))

(clojure.spec.alpha/def :portkey.aws.meteringmarketplace.customer-not-entitled-exception/message (clojure.spec.alpha/and :portkey.aws.meteringmarketplace/error-message))
(clojure.spec.alpha/def :portkey.aws.meteringmarketplace/customer-not-entitled-exception (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.meteringmarketplace.customer-not-entitled-exception/message]))

(clojure.spec.alpha/def :portkey.aws.meteringmarketplace/usage-record-result-status #{:duplicate-record "CustomerNotSubscribed" :customer-not-subscribed "Success" "DuplicateRecord" :success})

(clojure.spec.alpha/def :portkey.aws.meteringmarketplace.internal-service-error-exception/message (clojure.spec.alpha/and :portkey.aws.meteringmarketplace/error-message))
(clojure.spec.alpha/def :portkey.aws.meteringmarketplace/internal-service-error-exception (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.meteringmarketplace.internal-service-error-exception/message]))

(clojure.spec.alpha/def :portkey.aws.meteringmarketplace.invalid-usage-dimension-exception/message (clojure.spec.alpha/and :portkey.aws.meteringmarketplace/error-message))
(clojure.spec.alpha/def :portkey.aws.meteringmarketplace/invalid-usage-dimension-exception (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.meteringmarketplace.invalid-usage-dimension-exception/message]))

(clojure.spec.alpha/def :portkey.aws.meteringmarketplace.platform-not-supported-exception/message (clojure.spec.alpha/and :portkey.aws.meteringmarketplace/error-message))
(clojure.spec.alpha/def :portkey.aws.meteringmarketplace/platform-not-supported-exception (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.meteringmarketplace.platform-not-supported-exception/message]))

(clojure.spec.alpha/def :portkey.aws.meteringmarketplace.disabled-api-exception/message (clojure.spec.alpha/and :portkey.aws.meteringmarketplace/error-message))
(clojure.spec.alpha/def :portkey.aws.meteringmarketplace/disabled-api-exception (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.meteringmarketplace.disabled-api-exception/message]))

(clojure.spec.alpha/def :portkey.aws.meteringmarketplace.usage-record-result/metering-record-id (clojure.spec.alpha/and :portkey.aws.meteringmarketplace/string))
(clojure.spec.alpha/def :portkey.aws.meteringmarketplace.usage-record-result/status (clojure.spec.alpha/and :portkey.aws.meteringmarketplace/usage-record-result-status))
(clojure.spec.alpha/def :portkey.aws.meteringmarketplace/usage-record-result (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.meteringmarketplace/usage-record :portkey.aws.meteringmarketplace.usage-record-result/metering-record-id :portkey.aws.meteringmarketplace.usage-record-result/status]))

(clojure.spec.alpha/def :portkey.aws.meteringmarketplace.invalid-customer-identifier-exception/message (clojure.spec.alpha/and :portkey.aws.meteringmarketplace/error-message))
(clojure.spec.alpha/def :portkey.aws.meteringmarketplace/invalid-customer-identifier-exception (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.meteringmarketplace.invalid-customer-identifier-exception/message]))

(clojure.spec.alpha/def :portkey.aws.meteringmarketplace.register-usage-request/public-key-version (clojure.spec.alpha/and :portkey.aws.meteringmarketplace/version-integer))
(clojure.spec.alpha/def :portkey.aws.meteringmarketplace/register-usage-request (clojure.spec.alpha/keys :req-un [:portkey.aws.meteringmarketplace/product-code :portkey.aws.meteringmarketplace.register-usage-request/public-key-version] :opt-un [:portkey.aws.meteringmarketplace/nonce]))

(clojure.spec.alpha/def :portkey.aws.meteringmarketplace/usage-quantity (clojure.spec.alpha/int-in 0 1000000))

(clojure.spec.alpha/def :portkey.aws.meteringmarketplace/usage-record-result-list (clojure.spec.alpha/coll-of :portkey.aws.meteringmarketplace/usage-record-result))

(clojure.spec.alpha/def :portkey.aws.meteringmarketplace.batch-meter-usage-result/results (clojure.spec.alpha/and :portkey.aws.meteringmarketplace/usage-record-result-list))
(clojure.spec.alpha/def :portkey.aws.meteringmarketplace.batch-meter-usage-result/unprocessed-records (clojure.spec.alpha/and :portkey.aws.meteringmarketplace/usage-record-list))
(clojure.spec.alpha/def :portkey.aws.meteringmarketplace/batch-meter-usage-result (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.meteringmarketplace.batch-meter-usage-result/results :portkey.aws.meteringmarketplace.batch-meter-usage-result/unprocessed-records]))

(clojure.spec.alpha/def :portkey.aws.meteringmarketplace/string (clojure.spec.alpha/and clojure.core/string?))

(clojure.spec.alpha/def :portkey.aws.meteringmarketplace/resolve-customer-result (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.meteringmarketplace/customer-identifier :portkey.aws.meteringmarketplace/product-code]))

(clojure.spec.alpha/def :portkey.aws.meteringmarketplace.register-usage-result/public-key-rotation-timestamp (clojure.spec.alpha/and :portkey.aws.meteringmarketplace/timestamp))
(clojure.spec.alpha/def :portkey.aws.meteringmarketplace.register-usage-result/signature (clojure.spec.alpha/and :portkey.aws.meteringmarketplace/non-empty-string))
(clojure.spec.alpha/def :portkey.aws.meteringmarketplace/register-usage-result (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.meteringmarketplace.register-usage-result/public-key-rotation-timestamp :portkey.aws.meteringmarketplace.register-usage-result/signature]))

(clojure.spec.alpha/def :portkey.aws.meteringmarketplace.meter-usage-request/dry-run (clojure.spec.alpha/and :portkey.aws.meteringmarketplace/boolean))
(clojure.spec.alpha/def :portkey.aws.meteringmarketplace/meter-usage-request (clojure.spec.alpha/keys :req-un [:portkey.aws.meteringmarketplace/product-code :portkey.aws.meteringmarketplace/timestamp :portkey.aws.meteringmarketplace/usage-dimension :portkey.aws.meteringmarketplace/usage-quantity :portkey.aws.meteringmarketplace.meter-usage-request/dry-run] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.meteringmarketplace/version-integer (clojure.spec.alpha/int-in 1 Long/MAX_VALUE))

(clojure.spec.alpha/def :portkey.aws.meteringmarketplace/timestamp clojure.core/inst?)

(clojure.spec.alpha/def :portkey.aws.meteringmarketplace/product-code (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__1467901__auto__] (clojure.core/<= 1 (clojure.core/count s__1467901__auto__))) (clojure.core/fn [s__1467902__auto__] (clojure.core/< (clojure.core/count s__1467902__auto__) 255))))

(clojure.spec.alpha/def :portkey.aws.meteringmarketplace.throttling-exception/message (clojure.spec.alpha/and :portkey.aws.meteringmarketplace/error-message))
(clojure.spec.alpha/def :portkey.aws.meteringmarketplace/throttling-exception (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.meteringmarketplace.throttling-exception/message]))

(clojure.spec.alpha/def :portkey.aws.meteringmarketplace/nonce (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__1467902__auto__] (clojure.core/< (clojure.core/count s__1467902__auto__) 255))))

(clojure.spec.alpha/def :portkey.aws.meteringmarketplace.meter-usage-result/metering-record-id (clojure.spec.alpha/and :portkey.aws.meteringmarketplace/string))
(clojure.spec.alpha/def :portkey.aws.meteringmarketplace/meter-usage-result (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.meteringmarketplace.meter-usage-result/metering-record-id]))

(clojure.spec.alpha/def :portkey.aws.meteringmarketplace.invalid-region-exception/message (clojure.spec.alpha/and :portkey.aws.meteringmarketplace/error-message))
(clojure.spec.alpha/def :portkey.aws.meteringmarketplace/invalid-region-exception (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.meteringmarketplace.invalid-region-exception/message]))

(clojure.spec.alpha/def :portkey.aws.meteringmarketplace.expired-token-exception/message (clojure.spec.alpha/and :portkey.aws.meteringmarketplace/error-message))
(clojure.spec.alpha/def :portkey.aws.meteringmarketplace/expired-token-exception (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.meteringmarketplace.expired-token-exception/message]))

(clojure.spec.alpha/def :portkey.aws.meteringmarketplace.invalid-public-key-version-exception/message (clojure.spec.alpha/and :portkey.aws.meteringmarketplace/error-message))
(clojure.spec.alpha/def :portkey.aws.meteringmarketplace/invalid-public-key-version-exception (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.meteringmarketplace.invalid-public-key-version-exception/message]))

(clojure.spec.alpha/def :portkey.aws.meteringmarketplace.resolve-customer-request/registration-token (clojure.spec.alpha/and :portkey.aws.meteringmarketplace/non-empty-string))
(clojure.spec.alpha/def :portkey.aws.meteringmarketplace/resolve-customer-request (clojure.spec.alpha/keys :req-un [:portkey.aws.meteringmarketplace.resolve-customer-request/registration-token] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.meteringmarketplace.invalid-endpoint-region-exception/message (clojure.spec.alpha/and :portkey.aws.meteringmarketplace/error-message))
(clojure.spec.alpha/def :portkey.aws.meteringmarketplace/invalid-endpoint-region-exception (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.meteringmarketplace.invalid-endpoint-region-exception/message]))

(clojure.spec.alpha/def :portkey.aws.meteringmarketplace.timestamp-out-of-bounds-exception/message (clojure.spec.alpha/and :portkey.aws.meteringmarketplace/error-message))
(clojure.spec.alpha/def :portkey.aws.meteringmarketplace/timestamp-out-of-bounds-exception (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.meteringmarketplace.timestamp-out-of-bounds-exception/message]))

(clojure.spec.alpha/def :portkey.aws.meteringmarketplace/boolean clojure.core/boolean?)

(clojure.core/defn batch-meter-usage ([batch-meter-usage-requestinput] (clojure.core/let [request-function-result__1468878__auto__ (req-batch-meter-usage-request batch-meter-usage-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__1468878__auto__ {:http.request.configuration/endpoints portkey.aws.meteringmarketplace/endpoints, :http.request.configuration/target-prefix "AWSMPMeteringService", :http.request.spec/output-spec :portkey.aws.meteringmarketplace/batch-meter-usage-result, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2016-01-14", :http.request.configuration/service-id "Marketplace Metering", :http.request.spec/input-spec :portkey.aws.meteringmarketplace/batch-meter-usage-request, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "BatchMeterUsage", :http.request.configuration/output-deser-fn response-batch-meter-usage-result, :http.request.spec/error-spec {"InternalServiceErrorException" :portkey.aws.meteringmarketplace/internal-service-error-exception, "InvalidProductCodeException" :portkey.aws.meteringmarketplace/invalid-product-code-exception, "InvalidUsageDimensionException" :portkey.aws.meteringmarketplace/invalid-usage-dimension-exception, "InvalidCustomerIdentifierException" :portkey.aws.meteringmarketplace/invalid-customer-identifier-exception, "TimestampOutOfBoundsException" :portkey.aws.meteringmarketplace/timestamp-out-of-bounds-exception, "ThrottlingException" :portkey.aws.meteringmarketplace/throttling-exception, "DisabledApiException" :portkey.aws.meteringmarketplace/disabled-api-exception}})))))
(clojure.spec.alpha/fdef batch-meter-usage :args (clojure.spec.alpha/tuple :portkey.aws.meteringmarketplace/batch-meter-usage-request) :ret (clojure.spec.alpha/and :portkey.aws.meteringmarketplace/batch-meter-usage-result))

(clojure.core/defn meter-usage ([meter-usage-requestinput] (clojure.core/let [request-function-result__1468878__auto__ (req-meter-usage-request meter-usage-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__1468878__auto__ {:http.request.configuration/endpoints portkey.aws.meteringmarketplace/endpoints, :http.request.configuration/target-prefix "AWSMPMeteringService", :http.request.spec/output-spec :portkey.aws.meteringmarketplace/meter-usage-result, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2016-01-14", :http.request.configuration/service-id "Marketplace Metering", :http.request.spec/input-spec :portkey.aws.meteringmarketplace/meter-usage-request, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "MeterUsage", :http.request.configuration/output-deser-fn response-meter-usage-result, :http.request.spec/error-spec {"InternalServiceErrorException" :portkey.aws.meteringmarketplace/internal-service-error-exception, "InvalidProductCodeException" :portkey.aws.meteringmarketplace/invalid-product-code-exception, "InvalidUsageDimensionException" :portkey.aws.meteringmarketplace/invalid-usage-dimension-exception, "InvalidEndpointRegionException" :portkey.aws.meteringmarketplace/invalid-endpoint-region-exception, "TimestampOutOfBoundsException" :portkey.aws.meteringmarketplace/timestamp-out-of-bounds-exception, "DuplicateRequestException" :portkey.aws.meteringmarketplace/duplicate-request-exception, "ThrottlingException" :portkey.aws.meteringmarketplace/throttling-exception}})))))
(clojure.spec.alpha/fdef meter-usage :args (clojure.spec.alpha/tuple :portkey.aws.meteringmarketplace/meter-usage-request) :ret (clojure.spec.alpha/and :portkey.aws.meteringmarketplace/meter-usage-result))

(clojure.core/defn register-usage ([register-usage-requestinput] (clojure.core/let [request-function-result__1468878__auto__ (req-register-usage-request register-usage-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__1468878__auto__ {:http.request.configuration/endpoints portkey.aws.meteringmarketplace/endpoints, :http.request.configuration/target-prefix "AWSMPMeteringService", :http.request.spec/output-spec :portkey.aws.meteringmarketplace/register-usage-result, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2016-01-14", :http.request.configuration/service-id "Marketplace Metering", :http.request.spec/input-spec :portkey.aws.meteringmarketplace/register-usage-request, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "RegisterUsage", :http.request.configuration/output-deser-fn response-register-usage-result, :http.request.spec/error-spec {"InvalidProductCodeException" :portkey.aws.meteringmarketplace/invalid-product-code-exception, "InvalidRegionException" :portkey.aws.meteringmarketplace/invalid-region-exception, "InvalidPublicKeyVersionException" :portkey.aws.meteringmarketplace/invalid-public-key-version-exception, "PlatformNotSupportedException" :portkey.aws.meteringmarketplace/platform-not-supported-exception, "CustomerNotEntitledException" :portkey.aws.meteringmarketplace/customer-not-entitled-exception, "ThrottlingException" :portkey.aws.meteringmarketplace/throttling-exception, "InternalServiceErrorException" :portkey.aws.meteringmarketplace/internal-service-error-exception, "DisabledApiException" :portkey.aws.meteringmarketplace/disabled-api-exception}})))))
(clojure.spec.alpha/fdef register-usage :args (clojure.spec.alpha/tuple :portkey.aws.meteringmarketplace/register-usage-request) :ret (clojure.spec.alpha/and :portkey.aws.meteringmarketplace/register-usage-result))

(clojure.core/defn resolve-customer ([resolve-customer-requestinput] (clojure.core/let [request-function-result__1468878__auto__ (req-resolve-customer-request resolve-customer-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__1468878__auto__ {:http.request.configuration/endpoints portkey.aws.meteringmarketplace/endpoints, :http.request.configuration/target-prefix "AWSMPMeteringService", :http.request.spec/output-spec :portkey.aws.meteringmarketplace/resolve-customer-result, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2016-01-14", :http.request.configuration/service-id "Marketplace Metering", :http.request.spec/input-spec :portkey.aws.meteringmarketplace/resolve-customer-request, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "ResolveCustomer", :http.request.configuration/output-deser-fn response-resolve-customer-result, :http.request.spec/error-spec {"InvalidTokenException" :portkey.aws.meteringmarketplace/invalid-token-exception, "ExpiredTokenException" :portkey.aws.meteringmarketplace/expired-token-exception, "ThrottlingException" :portkey.aws.meteringmarketplace/throttling-exception, "InternalServiceErrorException" :portkey.aws.meteringmarketplace/internal-service-error-exception, "DisabledApiException" :portkey.aws.meteringmarketplace/disabled-api-exception}})))))
(clojure.spec.alpha/fdef resolve-customer :args (clojure.spec.alpha/tuple :portkey.aws.meteringmarketplace/resolve-customer-request) :ret (clojure.spec.alpha/and :portkey.aws.meteringmarketplace/resolve-customer-result))
