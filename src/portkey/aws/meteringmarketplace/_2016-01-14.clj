(ns portkey.aws.meteringmarketplace.-2016-01-14 (:require [portkey.aws]))

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

(clojure.core/defn- response-invalid-token-exception ([input] (response-invalid-token-exception nil input)) ([resultWrapper1369450 input] (clojure.core/let [rawinput1369449 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar1369451 {"message" (rawinput1369449 "message")}] (clojure.core/cond-> {} (letvar1369451 "message") (clojure.core/assoc :message (desererror-message (clojure.core/get-in letvar1369451 ["message"])))))))

(clojure.core/defn- response-duplicate-request-exception ([input] (response-duplicate-request-exception nil input)) ([resultWrapper1369453 input] (clojure.core/let [rawinput1369452 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar1369454 {"message" (rawinput1369452 "message")}] (clojure.core/cond-> {} (letvar1369454 "message") (clojure.core/assoc :message (desererror-message (clojure.core/get-in letvar1369454 ["message"])))))))

(clojure.core/defn- response-invalid-product-code-exception ([input] (response-invalid-product-code-exception nil input)) ([resultWrapper1369456 input] (clojure.core/let [rawinput1369455 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar1369457 {"message" (rawinput1369455 "message")}] (clojure.core/cond-> {} (letvar1369457 "message") (clojure.core/assoc :message (desererror-message (clojure.core/get-in letvar1369457 ["message"])))))))

(clojure.core/defn- response-customer-not-entitled-exception ([input] (response-customer-not-entitled-exception nil input)) ([resultWrapper1369459 input] (clojure.core/let [rawinput1369458 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar1369460 {"message" (rawinput1369458 "message")}] (clojure.core/cond-> {} (letvar1369460 "message") (clojure.core/assoc :message (desererror-message (clojure.core/get-in letvar1369460 ["message"])))))))

(clojure.core/defn- response-internal-service-error-exception ([input] (response-internal-service-error-exception nil input)) ([resultWrapper1369462 input] (clojure.core/let [rawinput1369461 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar1369463 {"message" (rawinput1369461 "message")}] (clojure.core/cond-> {} (letvar1369463 "message") (clojure.core/assoc :message (desererror-message (clojure.core/get-in letvar1369463 ["message"])))))))

(clojure.core/defn- response-invalid-usage-dimension-exception ([input] (response-invalid-usage-dimension-exception nil input)) ([resultWrapper1369465 input] (clojure.core/let [rawinput1369464 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar1369466 {"message" (rawinput1369464 "message")}] (clojure.core/cond-> {} (letvar1369466 "message") (clojure.core/assoc :message (desererror-message (clojure.core/get-in letvar1369466 ["message"])))))))

(clojure.core/defn- response-platform-not-supported-exception ([input] (response-platform-not-supported-exception nil input)) ([resultWrapper1369468 input] (clojure.core/let [rawinput1369467 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar1369469 {"message" (rawinput1369467 "message")}] (clojure.core/cond-> {} (letvar1369469 "message") (clojure.core/assoc :message (desererror-message (clojure.core/get-in letvar1369469 ["message"])))))))

(clojure.core/defn- response-disabled-api-exception ([input] (response-disabled-api-exception nil input)) ([resultWrapper1369471 input] (clojure.core/let [rawinput1369470 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar1369472 {"message" (rawinput1369470 "message")}] (clojure.core/cond-> {} (letvar1369472 "message") (clojure.core/assoc :message (desererror-message (clojure.core/get-in letvar1369472 ["message"])))))))

(clojure.core/defn- response-invalid-customer-identifier-exception ([input] (response-invalid-customer-identifier-exception nil input)) ([resultWrapper1369474 input] (clojure.core/let [rawinput1369473 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar1369475 {"message" (rawinput1369473 "message")}] (clojure.core/cond-> {} (letvar1369475 "message") (clojure.core/assoc :message (desererror-message (clojure.core/get-in letvar1369475 ["message"])))))))

(clojure.core/defn- response-batch-meter-usage-result ([input] (response-batch-meter-usage-result nil input)) ([resultWrapper1369477 input] (clojure.core/let [rawinput1369476 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar1369478 {"Results" (rawinput1369476 "Results"), "UnprocessedRecords" (rawinput1369476 "UnprocessedRecords")}] (clojure.core/cond-> {} (letvar1369478 "Results") (clojure.core/assoc :results (deser-usage-record-result-list (clojure.core/get-in letvar1369478 ["Results"]))) (letvar1369478 "UnprocessedRecords") (clojure.core/assoc :unprocessed-records (deser-usage-record-list (clojure.core/get-in letvar1369478 ["UnprocessedRecords"])))))))

(clojure.core/defn- response-resolve-customer-result ([input] (response-resolve-customer-result nil input)) ([resultWrapper1369480 input] (clojure.core/let [rawinput1369479 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar1369481 {"CustomerIdentifier" (rawinput1369479 "CustomerIdentifier"), "ProductCode" (rawinput1369479 "ProductCode")}] (clojure.core/cond-> {} (letvar1369481 "CustomerIdentifier") (clojure.core/assoc :customer-identifier (deser-customer-identifier (clojure.core/get-in letvar1369481 ["CustomerIdentifier"]))) (letvar1369481 "ProductCode") (clojure.core/assoc :product-code (deser-product-code (clojure.core/get-in letvar1369481 ["ProductCode"])))))))

(clojure.core/defn- response-register-usage-result ([input] (response-register-usage-result nil input)) ([resultWrapper1369483 input] (clojure.core/let [rawinput1369482 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar1369484 {"PublicKeyRotationTimestamp" (rawinput1369482 "PublicKeyRotationTimestamp"), "Signature" (rawinput1369482 "Signature")}] (clojure.core/cond-> {} (letvar1369484 "PublicKeyRotationTimestamp") (clojure.core/assoc :public-key-rotation-timestamp (deser-timestamp (clojure.core/get-in letvar1369484 ["PublicKeyRotationTimestamp"]))) (letvar1369484 "Signature") (clojure.core/assoc :signature (deser-non-empty-string (clojure.core/get-in letvar1369484 ["Signature"])))))))

(clojure.core/defn- response-throttling-exception ([input] (response-throttling-exception nil input)) ([resultWrapper1369486 input] (clojure.core/let [rawinput1369485 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar1369487 {"message" (rawinput1369485 "message")}] (clojure.core/cond-> {} (letvar1369487 "message") (clojure.core/assoc :message (desererror-message (clojure.core/get-in letvar1369487 ["message"])))))))

(clojure.core/defn- response-meter-usage-result ([input] (response-meter-usage-result nil input)) ([resultWrapper1369489 input] (clojure.core/let [rawinput1369488 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar1369490 {"MeteringRecordId" (rawinput1369488 "MeteringRecordId")}] (clojure.core/cond-> {} (letvar1369490 "MeteringRecordId") (clojure.core/assoc :metering-record-id (deser-string (clojure.core/get-in letvar1369490 ["MeteringRecordId"])))))))

(clojure.core/defn- response-invalid-region-exception ([input] (response-invalid-region-exception nil input)) ([resultWrapper1369492 input] (clojure.core/let [rawinput1369491 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar1369493 {"message" (rawinput1369491 "message")}] (clojure.core/cond-> {} (letvar1369493 "message") (clojure.core/assoc :message (desererror-message (clojure.core/get-in letvar1369493 ["message"])))))))

(clojure.core/defn- response-expired-token-exception ([input] (response-expired-token-exception nil input)) ([resultWrapper1369495 input] (clojure.core/let [rawinput1369494 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar1369496 {"message" (rawinput1369494 "message")}] (clojure.core/cond-> {} (letvar1369496 "message") (clojure.core/assoc :message (desererror-message (clojure.core/get-in letvar1369496 ["message"])))))))

(clojure.core/defn- response-invalid-public-key-version-exception ([input] (response-invalid-public-key-version-exception nil input)) ([resultWrapper1369498 input] (clojure.core/let [rawinput1369497 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar1369499 {"message" (rawinput1369497 "message")}] (clojure.core/cond-> {} (letvar1369499 "message") (clojure.core/assoc :message (desererror-message (clojure.core/get-in letvar1369499 ["message"])))))))

(clojure.core/defn- response-invalid-endpoint-region-exception ([input] (response-invalid-endpoint-region-exception nil input)) ([resultWrapper1369501 input] (clojure.core/let [rawinput1369500 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar1369502 {"message" (rawinput1369500 "message")}] (clojure.core/cond-> {} (letvar1369502 "message") (clojure.core/assoc :message (desererror-message (clojure.core/get-in letvar1369502 ["message"])))))))

(clojure.core/defn- response-timestamp-out-of-bounds-exception ([input] (response-timestamp-out-of-bounds-exception nil input)) ([resultWrapper1369504 input] (clojure.core/let [rawinput1369503 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar1369505 {"message" (rawinput1369503 "message")}] (clojure.core/cond-> {} (letvar1369505 "message") (clojure.core/assoc :message (desererror-message (clojure.core/get-in letvar1369505 ["message"])))))))

(clojure.spec.alpha/def :portkey.aws.meteringmarketplace.-2016-01-14.invalid-token-exception/message (clojure.spec.alpha/and :portkey.aws.meteringmarketplace.-2016-01-14/error-message))
(clojure.spec.alpha/def :portkey.aws.meteringmarketplace.-2016-01-14/invalid-token-exception (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.meteringmarketplace.-2016-01-14.invalid-token-exception/message]))

(clojure.spec.alpha/def :portkey.aws.meteringmarketplace.-2016-01-14.batch-meter-usage-request/usage-records (clojure.spec.alpha/and :portkey.aws.meteringmarketplace.-2016-01-14/usage-record-list))
(clojure.spec.alpha/def :portkey.aws.meteringmarketplace.-2016-01-14/batch-meter-usage-request (clojure.spec.alpha/keys :req-un [:portkey.aws.meteringmarketplace.-2016-01-14.batch-meter-usage-request/usage-records :portkey.aws.meteringmarketplace.-2016-01-14/product-code] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.meteringmarketplace.-2016-01-14.duplicate-request-exception/message (clojure.spec.alpha/and :portkey.aws.meteringmarketplace.-2016-01-14/error-message))
(clojure.spec.alpha/def :portkey.aws.meteringmarketplace.-2016-01-14/duplicate-request-exception (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.meteringmarketplace.-2016-01-14.duplicate-request-exception/message]))

(clojure.spec.alpha/def :portkey.aws.meteringmarketplace.-2016-01-14/usage-record-list (clojure.spec.alpha/coll-of :portkey.aws.meteringmarketplace.-2016-01-14/usage-record :min-count 0 :max-count 25))

(clojure.spec.alpha/def :portkey.aws.meteringmarketplace.-2016-01-14/non-empty-string (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__21078__auto__] (clojure.core/re-matches #"\S+" s__21078__auto__))))

(clojure.spec.alpha/def :portkey.aws.meteringmarketplace.-2016-01-14.usage-record/dimension (clojure.spec.alpha/and :portkey.aws.meteringmarketplace.-2016-01-14/usage-dimension))
(clojure.spec.alpha/def :portkey.aws.meteringmarketplace.-2016-01-14.usage-record/quantity (clojure.spec.alpha/and :portkey.aws.meteringmarketplace.-2016-01-14/usage-quantity))
(clojure.spec.alpha/def :portkey.aws.meteringmarketplace.-2016-01-14/usage-record (clojure.spec.alpha/keys :req-un [:portkey.aws.meteringmarketplace.-2016-01-14/timestamp :portkey.aws.meteringmarketplace.-2016-01-14/customer-identifier :portkey.aws.meteringmarketplace.-2016-01-14.usage-record/dimension :portkey.aws.meteringmarketplace.-2016-01-14.usage-record/quantity] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.meteringmarketplace.-2016-01-14/error-message (clojure.spec.alpha/and clojure.core/string?))

(clojure.spec.alpha/def :portkey.aws.meteringmarketplace.-2016-01-14.invalid-product-code-exception/message (clojure.spec.alpha/and :portkey.aws.meteringmarketplace.-2016-01-14/error-message))
(clojure.spec.alpha/def :portkey.aws.meteringmarketplace.-2016-01-14/invalid-product-code-exception (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.meteringmarketplace.-2016-01-14.invalid-product-code-exception/message]))

(clojure.spec.alpha/def :portkey.aws.meteringmarketplace.-2016-01-14/usage-dimension (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__21076__auto__] (clojure.core/<= 1 (clojure.core/count s__21076__auto__))) (clojure.core/fn [s__21077__auto__] (clojure.core/< (clojure.core/count s__21077__auto__) 255))))

(clojure.spec.alpha/def :portkey.aws.meteringmarketplace.-2016-01-14/customer-identifier (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__21076__auto__] (clojure.core/<= 1 (clojure.core/count s__21076__auto__))) (clojure.core/fn [s__21077__auto__] (clojure.core/< (clojure.core/count s__21077__auto__) 255))))

(clojure.spec.alpha/def :portkey.aws.meteringmarketplace.-2016-01-14.customer-not-entitled-exception/message (clojure.spec.alpha/and :portkey.aws.meteringmarketplace.-2016-01-14/error-message))
(clojure.spec.alpha/def :portkey.aws.meteringmarketplace.-2016-01-14/customer-not-entitled-exception (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.meteringmarketplace.-2016-01-14.customer-not-entitled-exception/message]))

(clojure.spec.alpha/def :portkey.aws.meteringmarketplace.-2016-01-14/usage-record-result-status #{:duplicate-record "CustomerNotSubscribed" :customer-not-subscribed "Success" "DuplicateRecord" :success})

(clojure.spec.alpha/def :portkey.aws.meteringmarketplace.-2016-01-14.internal-service-error-exception/message (clojure.spec.alpha/and :portkey.aws.meteringmarketplace.-2016-01-14/error-message))
(clojure.spec.alpha/def :portkey.aws.meteringmarketplace.-2016-01-14/internal-service-error-exception (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.meteringmarketplace.-2016-01-14.internal-service-error-exception/message]))

(clojure.spec.alpha/def :portkey.aws.meteringmarketplace.-2016-01-14.invalid-usage-dimension-exception/message (clojure.spec.alpha/and :portkey.aws.meteringmarketplace.-2016-01-14/error-message))
(clojure.spec.alpha/def :portkey.aws.meteringmarketplace.-2016-01-14/invalid-usage-dimension-exception (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.meteringmarketplace.-2016-01-14.invalid-usage-dimension-exception/message]))

(clojure.spec.alpha/def :portkey.aws.meteringmarketplace.-2016-01-14.platform-not-supported-exception/message (clojure.spec.alpha/and :portkey.aws.meteringmarketplace.-2016-01-14/error-message))
(clojure.spec.alpha/def :portkey.aws.meteringmarketplace.-2016-01-14/platform-not-supported-exception (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.meteringmarketplace.-2016-01-14.platform-not-supported-exception/message]))

(clojure.spec.alpha/def :portkey.aws.meteringmarketplace.-2016-01-14.disabled-api-exception/message (clojure.spec.alpha/and :portkey.aws.meteringmarketplace.-2016-01-14/error-message))
(clojure.spec.alpha/def :portkey.aws.meteringmarketplace.-2016-01-14/disabled-api-exception (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.meteringmarketplace.-2016-01-14.disabled-api-exception/message]))

(clojure.spec.alpha/def :portkey.aws.meteringmarketplace.-2016-01-14.usage-record-result/metering-record-id (clojure.spec.alpha/and :portkey.aws.meteringmarketplace.-2016-01-14/string))
(clojure.spec.alpha/def :portkey.aws.meteringmarketplace.-2016-01-14.usage-record-result/status (clojure.spec.alpha/and :portkey.aws.meteringmarketplace.-2016-01-14/usage-record-result-status))
(clojure.spec.alpha/def :portkey.aws.meteringmarketplace.-2016-01-14/usage-record-result (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.meteringmarketplace.-2016-01-14/usage-record :portkey.aws.meteringmarketplace.-2016-01-14.usage-record-result/metering-record-id :portkey.aws.meteringmarketplace.-2016-01-14.usage-record-result/status]))

(clojure.spec.alpha/def :portkey.aws.meteringmarketplace.-2016-01-14.invalid-customer-identifier-exception/message (clojure.spec.alpha/and :portkey.aws.meteringmarketplace.-2016-01-14/error-message))
(clojure.spec.alpha/def :portkey.aws.meteringmarketplace.-2016-01-14/invalid-customer-identifier-exception (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.meteringmarketplace.-2016-01-14.invalid-customer-identifier-exception/message]))

(clojure.spec.alpha/def :portkey.aws.meteringmarketplace.-2016-01-14.register-usage-request/public-key-version (clojure.spec.alpha/and :portkey.aws.meteringmarketplace.-2016-01-14/version-integer))
(clojure.spec.alpha/def :portkey.aws.meteringmarketplace.-2016-01-14/register-usage-request (clojure.spec.alpha/keys :req-un [:portkey.aws.meteringmarketplace.-2016-01-14/product-code :portkey.aws.meteringmarketplace.-2016-01-14.register-usage-request/public-key-version] :opt-un [:portkey.aws.meteringmarketplace.-2016-01-14/nonce]))

(clojure.spec.alpha/def :portkey.aws.meteringmarketplace.-2016-01-14/usage-quantity (clojure.spec.alpha/int-in 0 1000000))

(clojure.spec.alpha/def :portkey.aws.meteringmarketplace.-2016-01-14/usage-record-result-list (clojure.spec.alpha/coll-of :portkey.aws.meteringmarketplace.-2016-01-14/usage-record-result))

(clojure.spec.alpha/def :portkey.aws.meteringmarketplace.-2016-01-14.batch-meter-usage-result/results (clojure.spec.alpha/and :portkey.aws.meteringmarketplace.-2016-01-14/usage-record-result-list))
(clojure.spec.alpha/def :portkey.aws.meteringmarketplace.-2016-01-14.batch-meter-usage-result/unprocessed-records (clojure.spec.alpha/and :portkey.aws.meteringmarketplace.-2016-01-14/usage-record-list))
(clojure.spec.alpha/def :portkey.aws.meteringmarketplace.-2016-01-14/batch-meter-usage-result (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.meteringmarketplace.-2016-01-14.batch-meter-usage-result/results :portkey.aws.meteringmarketplace.-2016-01-14.batch-meter-usage-result/unprocessed-records]))

(clojure.spec.alpha/def :portkey.aws.meteringmarketplace.-2016-01-14/string (clojure.spec.alpha/and clojure.core/string?))

(clojure.spec.alpha/def :portkey.aws.meteringmarketplace.-2016-01-14/resolve-customer-result (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.meteringmarketplace.-2016-01-14/customer-identifier :portkey.aws.meteringmarketplace.-2016-01-14/product-code]))

(clojure.spec.alpha/def :portkey.aws.meteringmarketplace.-2016-01-14.register-usage-result/public-key-rotation-timestamp (clojure.spec.alpha/and :portkey.aws.meteringmarketplace.-2016-01-14/timestamp))
(clojure.spec.alpha/def :portkey.aws.meteringmarketplace.-2016-01-14.register-usage-result/signature (clojure.spec.alpha/and :portkey.aws.meteringmarketplace.-2016-01-14/non-empty-string))
(clojure.spec.alpha/def :portkey.aws.meteringmarketplace.-2016-01-14/register-usage-result (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.meteringmarketplace.-2016-01-14.register-usage-result/public-key-rotation-timestamp :portkey.aws.meteringmarketplace.-2016-01-14.register-usage-result/signature]))

(clojure.spec.alpha/def :portkey.aws.meteringmarketplace.-2016-01-14.meter-usage-request/dry-run (clojure.spec.alpha/and :portkey.aws.meteringmarketplace.-2016-01-14/boolean))
(clojure.spec.alpha/def :portkey.aws.meteringmarketplace.-2016-01-14/meter-usage-request (clojure.spec.alpha/keys :req-un [:portkey.aws.meteringmarketplace.-2016-01-14/product-code :portkey.aws.meteringmarketplace.-2016-01-14/timestamp :portkey.aws.meteringmarketplace.-2016-01-14/usage-dimension :portkey.aws.meteringmarketplace.-2016-01-14/usage-quantity :portkey.aws.meteringmarketplace.-2016-01-14.meter-usage-request/dry-run] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.meteringmarketplace.-2016-01-14/version-integer (clojure.spec.alpha/int-in 1 Long/MAX_VALUE))

(clojure.spec.alpha/def :portkey.aws.meteringmarketplace.-2016-01-14/timestamp clojure.core/inst?)

(clojure.spec.alpha/def :portkey.aws.meteringmarketplace.-2016-01-14/product-code (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__21076__auto__] (clojure.core/<= 1 (clojure.core/count s__21076__auto__))) (clojure.core/fn [s__21077__auto__] (clojure.core/< (clojure.core/count s__21077__auto__) 255))))

(clojure.spec.alpha/def :portkey.aws.meteringmarketplace.-2016-01-14.throttling-exception/message (clojure.spec.alpha/and :portkey.aws.meteringmarketplace.-2016-01-14/error-message))
(clojure.spec.alpha/def :portkey.aws.meteringmarketplace.-2016-01-14/throttling-exception (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.meteringmarketplace.-2016-01-14.throttling-exception/message]))

(clojure.spec.alpha/def :portkey.aws.meteringmarketplace.-2016-01-14/nonce (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__21077__auto__] (clojure.core/< (clojure.core/count s__21077__auto__) 255))))

(clojure.spec.alpha/def :portkey.aws.meteringmarketplace.-2016-01-14.meter-usage-result/metering-record-id (clojure.spec.alpha/and :portkey.aws.meteringmarketplace.-2016-01-14/string))
(clojure.spec.alpha/def :portkey.aws.meteringmarketplace.-2016-01-14/meter-usage-result (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.meteringmarketplace.-2016-01-14.meter-usage-result/metering-record-id]))

(clojure.spec.alpha/def :portkey.aws.meteringmarketplace.-2016-01-14.invalid-region-exception/message (clojure.spec.alpha/and :portkey.aws.meteringmarketplace.-2016-01-14/error-message))
(clojure.spec.alpha/def :portkey.aws.meteringmarketplace.-2016-01-14/invalid-region-exception (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.meteringmarketplace.-2016-01-14.invalid-region-exception/message]))

(clojure.spec.alpha/def :portkey.aws.meteringmarketplace.-2016-01-14.expired-token-exception/message (clojure.spec.alpha/and :portkey.aws.meteringmarketplace.-2016-01-14/error-message))
(clojure.spec.alpha/def :portkey.aws.meteringmarketplace.-2016-01-14/expired-token-exception (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.meteringmarketplace.-2016-01-14.expired-token-exception/message]))

(clojure.spec.alpha/def :portkey.aws.meteringmarketplace.-2016-01-14.invalid-public-key-version-exception/message (clojure.spec.alpha/and :portkey.aws.meteringmarketplace.-2016-01-14/error-message))
(clojure.spec.alpha/def :portkey.aws.meteringmarketplace.-2016-01-14/invalid-public-key-version-exception (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.meteringmarketplace.-2016-01-14.invalid-public-key-version-exception/message]))

(clojure.spec.alpha/def :portkey.aws.meteringmarketplace.-2016-01-14.resolve-customer-request/registration-token (clojure.spec.alpha/and :portkey.aws.meteringmarketplace.-2016-01-14/non-empty-string))
(clojure.spec.alpha/def :portkey.aws.meteringmarketplace.-2016-01-14/resolve-customer-request (clojure.spec.alpha/keys :req-un [:portkey.aws.meteringmarketplace.-2016-01-14.resolve-customer-request/registration-token] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.meteringmarketplace.-2016-01-14.invalid-endpoint-region-exception/message (clojure.spec.alpha/and :portkey.aws.meteringmarketplace.-2016-01-14/error-message))
(clojure.spec.alpha/def :portkey.aws.meteringmarketplace.-2016-01-14/invalid-endpoint-region-exception (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.meteringmarketplace.-2016-01-14.invalid-endpoint-region-exception/message]))

(clojure.spec.alpha/def :portkey.aws.meteringmarketplace.-2016-01-14.timestamp-out-of-bounds-exception/message (clojure.spec.alpha/and :portkey.aws.meteringmarketplace.-2016-01-14/error-message))
(clojure.spec.alpha/def :portkey.aws.meteringmarketplace.-2016-01-14/timestamp-out-of-bounds-exception (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.meteringmarketplace.-2016-01-14.timestamp-out-of-bounds-exception/message]))

(clojure.spec.alpha/def :portkey.aws.meteringmarketplace.-2016-01-14/boolean clojure.core/boolean?)

(clojure.core/defn batch-meter-usage "BatchMeterUsage is called from a SaaS application listed on the AWS Marketplace\nto post metering records for a set of customers.\n For identical requests, the API is idempotent; requests can be retried with the\nsame records or a subset of the input records.\n Every request to BatchMeterUsage is for one product. If you need to meter usage\nfor multiple products, you must make multiple calls to BatchMeterUsage.\n BatchMeterUsage can process up to 25 UsageRecords at a time." ([batch-meter-usage-requestinput] (clojure.core/let [request-function-result__22119__auto__ (req-batch-meter-usage-request batch-meter-usage-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__22119__auto__ {:http.request.configuration/endpoints portkey.aws.meteringmarketplace.-2016-01-14/endpoints, :http.request.configuration/target-prefix "AWSMPMeteringService", :http.request.spec/output-spec :portkey.aws.meteringmarketplace.-2016-01-14/batch-meter-usage-result, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2016-01-14", :http.request.configuration/service-id "Marketplace Metering", :http.request.spec/input-spec :portkey.aws.meteringmarketplace.-2016-01-14/batch-meter-usage-request, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "BatchMeterUsage", :http.request.configuration/output-deser-fn response-batch-meter-usage-result, :http.request.spec/error-spec {"InternalServiceErrorException" :portkey.aws.meteringmarketplace.-2016-01-14/internal-service-error-exception, "InvalidProductCodeException" :portkey.aws.meteringmarketplace.-2016-01-14/invalid-product-code-exception, "InvalidUsageDimensionException" :portkey.aws.meteringmarketplace.-2016-01-14/invalid-usage-dimension-exception, "InvalidCustomerIdentifierException" :portkey.aws.meteringmarketplace.-2016-01-14/invalid-customer-identifier-exception, "TimestampOutOfBoundsException" :portkey.aws.meteringmarketplace.-2016-01-14/timestamp-out-of-bounds-exception, "ThrottlingException" :portkey.aws.meteringmarketplace.-2016-01-14/throttling-exception, "DisabledApiException" :portkey.aws.meteringmarketplace.-2016-01-14/disabled-api-exception}})))))
(clojure.spec.alpha/fdef batch-meter-usage :args (clojure.spec.alpha/tuple :portkey.aws.meteringmarketplace.-2016-01-14/batch-meter-usage-request) :ret (clojure.spec.alpha/and :portkey.aws.meteringmarketplace.-2016-01-14/batch-meter-usage-result))

(clojure.core/defn meter-usage "API to emit metering records. For identical requests, the API is idempotent. It\nsimply returns the metering record ID.\n MeterUsage is authenticated on the buyer's AWS account, generally when running\nfrom an EC2 instance on the AWS Marketplace." ([meter-usage-requestinput] (clojure.core/let [request-function-result__22119__auto__ (req-meter-usage-request meter-usage-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__22119__auto__ {:http.request.configuration/endpoints portkey.aws.meteringmarketplace.-2016-01-14/endpoints, :http.request.configuration/target-prefix "AWSMPMeteringService", :http.request.spec/output-spec :portkey.aws.meteringmarketplace.-2016-01-14/meter-usage-result, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2016-01-14", :http.request.configuration/service-id "Marketplace Metering", :http.request.spec/input-spec :portkey.aws.meteringmarketplace.-2016-01-14/meter-usage-request, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "MeterUsage", :http.request.configuration/output-deser-fn response-meter-usage-result, :http.request.spec/error-spec {"InternalServiceErrorException" :portkey.aws.meteringmarketplace.-2016-01-14/internal-service-error-exception, "InvalidProductCodeException" :portkey.aws.meteringmarketplace.-2016-01-14/invalid-product-code-exception, "InvalidUsageDimensionException" :portkey.aws.meteringmarketplace.-2016-01-14/invalid-usage-dimension-exception, "InvalidEndpointRegionException" :portkey.aws.meteringmarketplace.-2016-01-14/invalid-endpoint-region-exception, "TimestampOutOfBoundsException" :portkey.aws.meteringmarketplace.-2016-01-14/timestamp-out-of-bounds-exception, "DuplicateRequestException" :portkey.aws.meteringmarketplace.-2016-01-14/duplicate-request-exception, "ThrottlingException" :portkey.aws.meteringmarketplace.-2016-01-14/throttling-exception}})))))
(clojure.spec.alpha/fdef meter-usage :args (clojure.spec.alpha/tuple :portkey.aws.meteringmarketplace.-2016-01-14/meter-usage-request) :ret (clojure.spec.alpha/and :portkey.aws.meteringmarketplace.-2016-01-14/meter-usage-result))

(clojure.core/defn register-usage "Paid container software products sold through AWS Marketplace must integrate\nwith the AWS Marketplace Metering Service and call the RegisterUsage operation\nfor software entitlement and metering. Calling RegisterUsage from containers\nrunning outside of ECS is not currently supported. Free and BYOL products for\nECS aren't required to call RegisterUsage, but you may choose to do so if you\nwould like to receive usage data in your seller reports. The sections below\nexplain the behavior of RegisterUsage. RegisterUsage performs two primary\nfunctions: metering and entitlement.\n * Entitlement: RegisterUsage allows you to verify that the customer running\nyour paid software is subscribed to your product on AWS Marketplace, enabling\nyou to guard against unauthorized use. Your container image that integrates with\nRegisterUsage is only required to guard against unauthorized use at container\nstartup, as such a CustomerNotSubscribedException/PlatformNotSupportedException\nwill only be thrown on the initial call to RegisterUsage. Subsequent calls from\nthe same Amazon ECS task instance (e.g. task-id) will not throw a\nCustomerNotSubscribedException, even if the customer unsubscribes while the\nAmazon ECS task is still running.\n * Metering: RegisterUsage meters software use per ECS task, per hour, with\nusage prorated to the second. A minimum of 1 minute of usage applies to tasks\nthat are short lived. For example, if a customer has a 10 node ECS cluster and\ncreates an ECS service configured as a Daemon Set, then ECS will launch a task\non all 10 cluster nodes and the customer will be charged: (10 * hourly_rate).\nMetering for software use is automatically handled by the AWS Marketplace\nMetering Control Plane -- your software is not required to perform any metering\nspecific actions, other than call RegisterUsage once for metering of software\nuse to commence. The AWS Marketplace Metering Control Plane will also continue\nto bill customers for running ECS tasks, regardless of the customers\nsubscription state, removing the need for your software to perform entitlement\nchecks at runtime." ([register-usage-requestinput] (clojure.core/let [request-function-result__22119__auto__ (req-register-usage-request register-usage-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__22119__auto__ {:http.request.configuration/endpoints portkey.aws.meteringmarketplace.-2016-01-14/endpoints, :http.request.configuration/target-prefix "AWSMPMeteringService", :http.request.spec/output-spec :portkey.aws.meteringmarketplace.-2016-01-14/register-usage-result, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2016-01-14", :http.request.configuration/service-id "Marketplace Metering", :http.request.spec/input-spec :portkey.aws.meteringmarketplace.-2016-01-14/register-usage-request, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "RegisterUsage", :http.request.configuration/output-deser-fn response-register-usage-result, :http.request.spec/error-spec {"InvalidProductCodeException" :portkey.aws.meteringmarketplace.-2016-01-14/invalid-product-code-exception, "InvalidRegionException" :portkey.aws.meteringmarketplace.-2016-01-14/invalid-region-exception, "InvalidPublicKeyVersionException" :portkey.aws.meteringmarketplace.-2016-01-14/invalid-public-key-version-exception, "PlatformNotSupportedException" :portkey.aws.meteringmarketplace.-2016-01-14/platform-not-supported-exception, "CustomerNotEntitledException" :portkey.aws.meteringmarketplace.-2016-01-14/customer-not-entitled-exception, "ThrottlingException" :portkey.aws.meteringmarketplace.-2016-01-14/throttling-exception, "InternalServiceErrorException" :portkey.aws.meteringmarketplace.-2016-01-14/internal-service-error-exception, "DisabledApiException" :portkey.aws.meteringmarketplace.-2016-01-14/disabled-api-exception}})))))
(clojure.spec.alpha/fdef register-usage :args (clojure.spec.alpha/tuple :portkey.aws.meteringmarketplace.-2016-01-14/register-usage-request) :ret (clojure.spec.alpha/and :portkey.aws.meteringmarketplace.-2016-01-14/register-usage-result))

(clojure.core/defn resolve-customer "ResolveCustomer is called by a SaaS application during the registration process.\nWhen a buyer visits your website during the registration process, the buyer\nsubmits a registration token through their browser. The registration token is\nresolved through this API to obtain a CustomerIdentifier and product code." ([resolve-customer-requestinput] (clojure.core/let [request-function-result__22119__auto__ (req-resolve-customer-request resolve-customer-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__22119__auto__ {:http.request.configuration/endpoints portkey.aws.meteringmarketplace.-2016-01-14/endpoints, :http.request.configuration/target-prefix "AWSMPMeteringService", :http.request.spec/output-spec :portkey.aws.meteringmarketplace.-2016-01-14/resolve-customer-result, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2016-01-14", :http.request.configuration/service-id "Marketplace Metering", :http.request.spec/input-spec :portkey.aws.meteringmarketplace.-2016-01-14/resolve-customer-request, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "ResolveCustomer", :http.request.configuration/output-deser-fn response-resolve-customer-result, :http.request.spec/error-spec {"InvalidTokenException" :portkey.aws.meteringmarketplace.-2016-01-14/invalid-token-exception, "ExpiredTokenException" :portkey.aws.meteringmarketplace.-2016-01-14/expired-token-exception, "ThrottlingException" :portkey.aws.meteringmarketplace.-2016-01-14/throttling-exception, "InternalServiceErrorException" :portkey.aws.meteringmarketplace.-2016-01-14/internal-service-error-exception, "DisabledApiException" :portkey.aws.meteringmarketplace.-2016-01-14/disabled-api-exception}})))))
(clojure.spec.alpha/fdef resolve-customer :args (clojure.spec.alpha/tuple :portkey.aws.meteringmarketplace.-2016-01-14/resolve-customer-request) :ret (clojure.spec.alpha/and :portkey.aws.meteringmarketplace.-2016-01-14/resolve-customer-result))
