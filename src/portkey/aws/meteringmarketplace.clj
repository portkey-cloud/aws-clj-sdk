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
    :signature-version :v4}})

(clojure.core/declare ser-usage-record-list)

(clojure.core/declare ser-non-empty-string)

(clojure.core/declare ser-usage-record)

(clojure.core/declare ser-usage-dimension)

(clojure.core/declare ser-customer-identifier)

(clojure.core/declare ser-usage-quantity)

(clojure.core/declare ser-timestamp)

(clojure.core/declare ser-product-code)

(clojure.core/declare ser-boolean)

(clojure.core/defn- ser-usage-record-list [input] #:http.request.field{:value (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (clojure.core/merge (ser-usage-record coll) #:http.request.field{:shape "UsageRecord"}))) input), :shape "UsageRecordList", :type "list", :max 25, :min 0})

(clojure.core/defn- ser-non-empty-string [input] #:http.request.field{:value input, :shape "NonEmptyString"})

(clojure.core/defn- ser-usage-record [input] (clojure.core/cond-> #:http.request.field{:value [(clojure.core/into (ser-timestamp (:timestamp input)) #:http.request.field{:name "Timestamp", :shape "Timestamp"}) (clojure.core/into (ser-customer-identifier (:customer-identifier input)) #:http.request.field{:name "CustomerIdentifier", :shape "CustomerIdentifier"}) (clojure.core/into (ser-usage-dimension (:dimension input)) #:http.request.field{:name "Dimension", :shape "UsageDimension"}) (clojure.core/into (ser-usage-quantity (:quantity input)) #:http.request.field{:name "Quantity", :shape "UsageQuantity"})], :shape "UsageRecord", :type "structure"}))

(clojure.core/defn- ser-usage-dimension [input] #:http.request.field{:value input, :shape "UsageDimension"})

(clojure.core/defn- ser-customer-identifier [input] #:http.request.field{:value input, :shape "CustomerIdentifier"})

(clojure.core/defn- ser-usage-quantity [input] #:http.request.field{:value input, :shape "UsageQuantity"})

(clojure.core/defn- ser-timestamp [input] #:http.request.field{:value input, :shape "Timestamp"})

(clojure.core/defn- ser-product-code [input] #:http.request.field{:value input, :shape "ProductCode"})

(clojure.core/defn- ser-boolean [input] #:http.request.field{:value input, :shape "Boolean"})

(clojure.core/defn- req-batch-meter-usage-request [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (ser-usage-record-list (input :usage-records)) #:http.request.field{:name "UsageRecords", :shape "UsageRecordList"}) (clojure.core/into (ser-product-code (input :product-code)) #:http.request.field{:name "ProductCode", :shape "ProductCode"})]}))

(clojure.core/defn- req-meter-usage-request [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (ser-product-code (input :product-code)) #:http.request.field{:name "ProductCode", :shape "ProductCode"}) (clojure.core/into (ser-timestamp (input :timestamp)) #:http.request.field{:name "Timestamp", :shape "Timestamp"}) (clojure.core/into (ser-usage-dimension (input :usage-dimension)) #:http.request.field{:name "UsageDimension", :shape "UsageDimension"}) (clojure.core/into (ser-usage-quantity (input :usage-quantity)) #:http.request.field{:name "UsageQuantity", :shape "UsageQuantity"}) (clojure.core/into (ser-boolean (input :dry-run)) #:http.request.field{:name "DryRun", :shape "Boolean"})]}))

(clojure.core/defn- req-resolve-customer-request [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (ser-non-empty-string (input :registration-token)) #:http.request.field{:name "RegistrationToken", :shape "NonEmptyString"})]}))

(clojure.spec.alpha/def :portkey.aws.meteringmarketplace.invalid-token-exception/message (clojure.spec.alpha/and :portkey.aws.meteringmarketplace/error-message))
(clojure.spec.alpha/def :portkey.aws.meteringmarketplace/invalid-token-exception (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.meteringmarketplace.invalid-token-exception/message]))

(clojure.spec.alpha/def :portkey.aws.meteringmarketplace.batch-meter-usage-request/usage-records (clojure.spec.alpha/and :portkey.aws.meteringmarketplace/usage-record-list))
(clojure.spec.alpha/def :portkey.aws.meteringmarketplace/batch-meter-usage-request (clojure.spec.alpha/keys :req-un [:portkey.aws.meteringmarketplace.batch-meter-usage-request/usage-records :portkey.aws.meteringmarketplace/product-code] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.meteringmarketplace.duplicate-request-exception/message (clojure.spec.alpha/and :portkey.aws.meteringmarketplace/error-message))
(clojure.spec.alpha/def :portkey.aws.meteringmarketplace/duplicate-request-exception (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.meteringmarketplace.duplicate-request-exception/message]))

(clojure.spec.alpha/def :portkey.aws.meteringmarketplace/usage-record-list (clojure.spec.alpha/coll-of :portkey.aws.meteringmarketplace/usage-record :min-count 0 :max-count 25))

(clojure.spec.alpha/def :portkey.aws.meteringmarketplace/non-empty-string (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__27882__auto__] (clojure.core/re-matches #"\S+" s__27882__auto__))))

(clojure.spec.alpha/def :portkey.aws.meteringmarketplace.usage-record/dimension (clojure.spec.alpha/and :portkey.aws.meteringmarketplace/usage-dimension))
(clojure.spec.alpha/def :portkey.aws.meteringmarketplace.usage-record/quantity (clojure.spec.alpha/and :portkey.aws.meteringmarketplace/usage-quantity))
(clojure.spec.alpha/def :portkey.aws.meteringmarketplace/usage-record (clojure.spec.alpha/keys :req-un [:portkey.aws.meteringmarketplace/timestamp :portkey.aws.meteringmarketplace/customer-identifier :portkey.aws.meteringmarketplace.usage-record/dimension :portkey.aws.meteringmarketplace.usage-record/quantity] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.meteringmarketplace/error-message (clojure.spec.alpha/and clojure.core/string?))

(clojure.spec.alpha/def :portkey.aws.meteringmarketplace.invalid-product-code-exception/message (clojure.spec.alpha/and :portkey.aws.meteringmarketplace/error-message))
(clojure.spec.alpha/def :portkey.aws.meteringmarketplace/invalid-product-code-exception (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.meteringmarketplace.invalid-product-code-exception/message]))

(clojure.spec.alpha/def :portkey.aws.meteringmarketplace/usage-dimension (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__27880__auto__] (clojure.core/<= 1 (clojure.core/count s__27880__auto__))) (clojure.core/fn [s__27881__auto__] (clojure.core/< (clojure.core/count s__27881__auto__) 255))))

(clojure.spec.alpha/def :portkey.aws.meteringmarketplace/customer-identifier (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__27880__auto__] (clojure.core/<= 1 (clojure.core/count s__27880__auto__))) (clojure.core/fn [s__27881__auto__] (clojure.core/< (clojure.core/count s__27881__auto__) 255))))

(clojure.spec.alpha/def :portkey.aws.meteringmarketplace/usage-record-result-status #{:duplicate-record "CustomerNotSubscribed" :customer-not-subscribed "Success" "DuplicateRecord" :success})

(clojure.spec.alpha/def :portkey.aws.meteringmarketplace.internal-service-error-exception/message (clojure.spec.alpha/and :portkey.aws.meteringmarketplace/error-message))
(clojure.spec.alpha/def :portkey.aws.meteringmarketplace/internal-service-error-exception (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.meteringmarketplace.internal-service-error-exception/message]))

(clojure.spec.alpha/def :portkey.aws.meteringmarketplace.invalid-usage-dimension-exception/message (clojure.spec.alpha/and :portkey.aws.meteringmarketplace/error-message))
(clojure.spec.alpha/def :portkey.aws.meteringmarketplace/invalid-usage-dimension-exception (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.meteringmarketplace.invalid-usage-dimension-exception/message]))

(clojure.spec.alpha/def :portkey.aws.meteringmarketplace.usage-record-result/metering-record-id (clojure.spec.alpha/and :portkey.aws.meteringmarketplace/string))
(clojure.spec.alpha/def :portkey.aws.meteringmarketplace.usage-record-result/status (clojure.spec.alpha/and :portkey.aws.meteringmarketplace/usage-record-result-status))
(clojure.spec.alpha/def :portkey.aws.meteringmarketplace/usage-record-result (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.meteringmarketplace/usage-record :portkey.aws.meteringmarketplace.usage-record-result/metering-record-id :portkey.aws.meteringmarketplace.usage-record-result/status]))

(clojure.spec.alpha/def :portkey.aws.meteringmarketplace.invalid-customer-identifier-exception/message (clojure.spec.alpha/and :portkey.aws.meteringmarketplace/error-message))
(clojure.spec.alpha/def :portkey.aws.meteringmarketplace/invalid-customer-identifier-exception (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.meteringmarketplace.invalid-customer-identifier-exception/message]))

(clojure.spec.alpha/def :portkey.aws.meteringmarketplace/usage-quantity (clojure.spec.alpha/int-in 0 1000000))

(clojure.spec.alpha/def :portkey.aws.meteringmarketplace/usage-record-result-list (clojure.spec.alpha/coll-of :portkey.aws.meteringmarketplace/usage-record-result))

(clojure.spec.alpha/def :portkey.aws.meteringmarketplace.batch-meter-usage-result/results (clojure.spec.alpha/and :portkey.aws.meteringmarketplace/usage-record-result-list))
(clojure.spec.alpha/def :portkey.aws.meteringmarketplace.batch-meter-usage-result/unprocessed-records (clojure.spec.alpha/and :portkey.aws.meteringmarketplace/usage-record-list))
(clojure.spec.alpha/def :portkey.aws.meteringmarketplace/batch-meter-usage-result (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.meteringmarketplace.batch-meter-usage-result/results :portkey.aws.meteringmarketplace.batch-meter-usage-result/unprocessed-records]))

(clojure.spec.alpha/def :portkey.aws.meteringmarketplace/string (clojure.spec.alpha/and clojure.core/string?))

(clojure.spec.alpha/def :portkey.aws.meteringmarketplace/resolve-customer-result (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.meteringmarketplace/customer-identifier :portkey.aws.meteringmarketplace/product-code]))

(clojure.spec.alpha/def :portkey.aws.meteringmarketplace.meter-usage-request/dry-run (clojure.spec.alpha/and :portkey.aws.meteringmarketplace/boolean))
(clojure.spec.alpha/def :portkey.aws.meteringmarketplace/meter-usage-request (clojure.spec.alpha/keys :req-un [:portkey.aws.meteringmarketplace/product-code :portkey.aws.meteringmarketplace/timestamp :portkey.aws.meteringmarketplace/usage-dimension :portkey.aws.meteringmarketplace/usage-quantity :portkey.aws.meteringmarketplace.meter-usage-request/dry-run] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.meteringmarketplace/timestamp clojure.core/inst?)

(clojure.spec.alpha/def :portkey.aws.meteringmarketplace/product-code (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__27880__auto__] (clojure.core/<= 1 (clojure.core/count s__27880__auto__))) (clojure.core/fn [s__27881__auto__] (clojure.core/< (clojure.core/count s__27881__auto__) 255))))

(clojure.spec.alpha/def :portkey.aws.meteringmarketplace.throttling-exception/message (clojure.spec.alpha/and :portkey.aws.meteringmarketplace/error-message))
(clojure.spec.alpha/def :portkey.aws.meteringmarketplace/throttling-exception (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.meteringmarketplace.throttling-exception/message]))

(clojure.spec.alpha/def :portkey.aws.meteringmarketplace.meter-usage-result/metering-record-id (clojure.spec.alpha/and :portkey.aws.meteringmarketplace/string))
(clojure.spec.alpha/def :portkey.aws.meteringmarketplace/meter-usage-result (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.meteringmarketplace.meter-usage-result/metering-record-id]))

(clojure.spec.alpha/def :portkey.aws.meteringmarketplace.expired-token-exception/message (clojure.spec.alpha/and :portkey.aws.meteringmarketplace/error-message))
(clojure.spec.alpha/def :portkey.aws.meteringmarketplace/expired-token-exception (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.meteringmarketplace.expired-token-exception/message]))

(clojure.spec.alpha/def :portkey.aws.meteringmarketplace.resolve-customer-request/registration-token (clojure.spec.alpha/and :portkey.aws.meteringmarketplace/non-empty-string))
(clojure.spec.alpha/def :portkey.aws.meteringmarketplace/resolve-customer-request (clojure.spec.alpha/keys :req-un [:portkey.aws.meteringmarketplace.resolve-customer-request/registration-token] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.meteringmarketplace.invalid-endpoint-region-exception/message (clojure.spec.alpha/and :portkey.aws.meteringmarketplace/error-message))
(clojure.spec.alpha/def :portkey.aws.meteringmarketplace/invalid-endpoint-region-exception (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.meteringmarketplace.invalid-endpoint-region-exception/message]))

(clojure.spec.alpha/def :portkey.aws.meteringmarketplace.timestamp-out-of-bounds-exception/message (clojure.spec.alpha/and :portkey.aws.meteringmarketplace/error-message))
(clojure.spec.alpha/def :portkey.aws.meteringmarketplace/timestamp-out-of-bounds-exception (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.meteringmarketplace.timestamp-out-of-bounds-exception/message]))

(clojure.spec.alpha/def :portkey.aws.meteringmarketplace/boolean clojure.core/boolean?)

(clojure.core/defn batch-meter-usage ([batch-meter-usage-requestinput] (clojure.core/let [request-function-result__28521__auto__ (req-batch-meter-usage-request batch-meter-usage-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__28521__auto__ {:http.request.configuration/endpoints portkey.aws.meteringmarketplace/endpoints, :http.request.configuration/target-prefix "AWSMPMeteringService", :http.request.spec/output-spec :portkey.aws.meteringmarketplace/batch-meter-usage-result, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2016-01-14", :http.request.configuration/service-id nil, :http.request.spec/input-spec :portkey.aws.meteringmarketplace/batch-meter-usage-request, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/action "BatchMeterUsage", :http.request.spec/error-spec {"InternalServiceErrorException" :portkey.aws.meteringmarketplace/internal-service-error-exception, "InvalidProductCodeException" :portkey.aws.meteringmarketplace/invalid-product-code-exception, "InvalidUsageDimensionException" :portkey.aws.meteringmarketplace/invalid-usage-dimension-exception, "InvalidCustomerIdentifierException" :portkey.aws.meteringmarketplace/invalid-customer-identifier-exception, "TimestampOutOfBoundsException" :portkey.aws.meteringmarketplace/timestamp-out-of-bounds-exception, "ThrottlingException" :portkey.aws.meteringmarketplace/throttling-exception}})))))
(clojure.spec.alpha/fdef batch-meter-usage :args (clojure.spec.alpha/tuple :portkey.aws.meteringmarketplace/batch-meter-usage-request) :ret (clojure.spec.alpha/and :portkey.aws.meteringmarketplace/batch-meter-usage-result))

(clojure.core/defn meter-usage ([meter-usage-requestinput] (clojure.core/let [request-function-result__28521__auto__ (req-meter-usage-request meter-usage-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__28521__auto__ {:http.request.configuration/endpoints portkey.aws.meteringmarketplace/endpoints, :http.request.configuration/target-prefix "AWSMPMeteringService", :http.request.spec/output-spec :portkey.aws.meteringmarketplace/meter-usage-result, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2016-01-14", :http.request.configuration/service-id nil, :http.request.spec/input-spec :portkey.aws.meteringmarketplace/meter-usage-request, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/action "MeterUsage", :http.request.spec/error-spec {"InternalServiceErrorException" :portkey.aws.meteringmarketplace/internal-service-error-exception, "InvalidProductCodeException" :portkey.aws.meteringmarketplace/invalid-product-code-exception, "InvalidUsageDimensionException" :portkey.aws.meteringmarketplace/invalid-usage-dimension-exception, "InvalidEndpointRegionException" :portkey.aws.meteringmarketplace/invalid-endpoint-region-exception, "TimestampOutOfBoundsException" :portkey.aws.meteringmarketplace/timestamp-out-of-bounds-exception, "DuplicateRequestException" :portkey.aws.meteringmarketplace/duplicate-request-exception, "ThrottlingException" :portkey.aws.meteringmarketplace/throttling-exception}})))))
(clojure.spec.alpha/fdef meter-usage :args (clojure.spec.alpha/tuple :portkey.aws.meteringmarketplace/meter-usage-request) :ret (clojure.spec.alpha/and :portkey.aws.meteringmarketplace/meter-usage-result))

(clojure.core/defn resolve-customer ([resolve-customer-requestinput] (clojure.core/let [request-function-result__28521__auto__ (req-resolve-customer-request resolve-customer-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__28521__auto__ {:http.request.configuration/endpoints portkey.aws.meteringmarketplace/endpoints, :http.request.configuration/target-prefix "AWSMPMeteringService", :http.request.spec/output-spec :portkey.aws.meteringmarketplace/resolve-customer-result, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2016-01-14", :http.request.configuration/service-id nil, :http.request.spec/input-spec :portkey.aws.meteringmarketplace/resolve-customer-request, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/action "ResolveCustomer", :http.request.spec/error-spec {"InvalidTokenException" :portkey.aws.meteringmarketplace/invalid-token-exception, "ExpiredTokenException" :portkey.aws.meteringmarketplace/expired-token-exception, "ThrottlingException" :portkey.aws.meteringmarketplace/throttling-exception, "InternalServiceErrorException" :portkey.aws.meteringmarketplace/internal-service-error-exception}})))))
(clojure.spec.alpha/fdef resolve-customer :args (clojure.spec.alpha/tuple :portkey.aws.meteringmarketplace/resolve-customer-request) :ret (clojure.spec.alpha/and :portkey.aws.meteringmarketplace/resolve-customer-result))
