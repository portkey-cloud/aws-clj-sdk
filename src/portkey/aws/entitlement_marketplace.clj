(ns portkey.aws.entitlement-marketplace (:require [portkey.aws]))

(def
 endpoints
 '{"us-east-1"
   {:credential-scope
    {:service "aws-marketplace", :region "us-east-1"},
    :ssl-common-name "entitlement.marketplace.us-east-1.amazonaws.com",
    :endpoint
    "https://entitlement.marketplace.us-east-1.amazonaws.com",
    :signature-version :v4}})

(clojure.core/declare ser-filter-value-list)

(clojure.core/declare ser-non-empty-string)

(clojure.core/declare ser-get-entitlement-filter-name)

(clojure.core/declare ser-integer)

(clojure.core/declare ser-get-entitlement-filters)

(clojure.core/declare ser-product-code)

(clojure.core/declare ser-filter-value)

(clojure.core/defn- ser-filter-value-list [input] #:http.request.field{:value (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (clojure.core/merge (ser-filter-value coll) #:http.request.field{:shape "FilterValue"}))) input), :shape "FilterValueList", :type "list", :min 1})

(clojure.core/defn- ser-non-empty-string [input] #:http.request.field{:value input, :shape "NonEmptyString"})

(clojure.core/defn- ser-get-entitlement-filter-name [input] #:http.request.field{:value (clojure.core/get {"CUSTOMER_IDENTIFIER" "CUSTOMER_IDENTIFIER", :customer-identifier "CUSTOMER_IDENTIFIER", "DIMENSION" "DIMENSION", :dimension "DIMENSION"} input), :shape "GetEntitlementFilterName"})

(clojure.core/defn- ser-integer [input] #:http.request.field{:value input, :shape "Integer"})

(clojure.core/defn- ser-get-entitlement-filters [input] #:http.request.field{:value (clojure.core/into [] (clojure.core/map (clojure.core/fn [[k v]] [(clojure.core/into (ser-get-entitlement-filter-name k) #:http.request.field{:map-info "key", :shape "GetEntitlementFilterName"}) (clojure.core/into (ser-filter-value-list v) #:http.request.field{:map-info "value", :shape "FilterValueList"})])) input), :shape "GetEntitlementFilters", :type "map"})

(clojure.core/defn- ser-product-code [input] #:http.request.field{:value input, :shape "ProductCode"})

(clojure.core/defn- ser-filter-value [input] #:http.request.field{:value input, :shape "FilterValue"})

(clojure.core/defn- req-get-entitlements-request [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (ser-product-code (input :product-code)) #:http.request.field{:name "ProductCode", :shape "ProductCode"})]} (clojure.core/contains? input :filter) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-get-entitlement-filters (input :filter)) #:http.request.field{:name "Filter", :shape "GetEntitlementFilters"})) (clojure.core/contains? input :next-token) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-non-empty-string (input :next-token)) #:http.request.field{:name "NextToken", :shape "NonEmptyString"})) (clojure.core/contains? input :max-results) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-integer (input :max-results)) #:http.request.field{:name "MaxResults", :shape "Integer"}))))

(clojure.core/declare deser-double)

(clojure.core/declare deser-non-empty-string)

(clojure.core/declare deser-error-message)

(clojure.core/declare deser-entitlement)

(clojure.core/declare deser-entitlement-value)

(clojure.core/declare deser-integer)

(clojure.core/declare deser-string)

(clojure.core/declare deser-timestamp)

(clojure.core/declare deser-product-code)

(clojure.core/declare deser-entitlement-list)

(clojure.core/declare deser-boolean)

(clojure.core/defn- deser-double [input] input)

(clojure.core/defn- deser-non-empty-string [input] input)

(clojure.core/defn- deser-error-message [input] input)

(clojure.core/defn- deser-entitlement [input] (clojure.core/cond-> {} (clojure.core/contains? input "ProductCode") (clojure.core/assoc :product-code (deser-product-code (input "ProductCode"))) (clojure.core/contains? input "Dimension") (clojure.core/assoc :dimension (deser-non-empty-string (input "Dimension"))) (clojure.core/contains? input "CustomerIdentifier") (clojure.core/assoc :customer-identifier (deser-non-empty-string (input "CustomerIdentifier"))) (clojure.core/contains? input "Value") (clojure.core/assoc :value (deser-entitlement-value (input "Value"))) (clojure.core/contains? input "ExpirationDate") (clojure.core/assoc :expiration-date (deser-timestamp (input "ExpirationDate")))))

(clojure.core/defn- deser-entitlement-value [input] (clojure.core/cond-> {} (clojure.core/contains? input "IntegerValue") (clojure.core/assoc :integer-value (deser-integer (input "IntegerValue"))) (clojure.core/contains? input "DoubleValue") (clojure.core/assoc :double-value (deser-double (input "DoubleValue"))) (clojure.core/contains? input "BooleanValue") (clojure.core/assoc :boolean-value (deser-boolean (input "BooleanValue"))) (clojure.core/contains? input "StringValue") (clojure.core/assoc :string-value (deser-string (input "StringValue")))))

(clojure.core/defn- deser-integer [input] input)

(clojure.core/defn- deser-string [input] input)

(clojure.core/defn- deser-timestamp [input] input)

(clojure.core/defn- deser-product-code [input] input)

(clojure.core/defn- deser-entitlement-list [input] (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (deser-entitlement coll))) input))

(clojure.core/defn- deser-boolean [input] input)

(clojure.core/defn- response-get-entitlements-result ([input] (response-get-entitlements-result nil input)) ([resultWrapper1731365 input] (clojure.core/let [rawinput1731364 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar1731366 {"Entitlements" (rawinput1731364 "Entitlements"), "NextToken" (rawinput1731364 "NextToken")}] (clojure.core/cond-> {} (letvar1731366 "Entitlements") (clojure.core/assoc :entitlements (deser-entitlement-list (clojure.core/get-in letvar1731366 ["Entitlements"]))) (letvar1731366 "NextToken") (clojure.core/assoc :next-token (deser-non-empty-string (clojure.core/get-in letvar1731366 ["NextToken"])))))))

(clojure.core/defn- response-internal-service-error-exception ([input] (response-internal-service-error-exception nil input)) ([resultWrapper1731368 input] (clojure.core/let [rawinput1731367 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar1731369 {"message" (rawinput1731367 "message")}] (clojure.core/cond-> {} (letvar1731369 "message") (clojure.core/assoc :message (deser-error-message (clojure.core/get-in letvar1731369 ["message"])))))))

(clojure.core/defn- response-throttling-exception ([input] (response-throttling-exception nil input)) ([resultWrapper1731371 input] (clojure.core/let [rawinput1731370 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar1731372 {"message" (rawinput1731370 "message")}] (clojure.core/cond-> {} (letvar1731372 "message") (clojure.core/assoc :message (deser-error-message (clojure.core/get-in letvar1731372 ["message"])))))))

(clojure.core/defn- response-invalid-parameter-exception ([input] (response-invalid-parameter-exception nil input)) ([resultWrapper1731374 input] (clojure.core/let [rawinput1731373 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar1731375 {"message" (rawinput1731373 "message")}] (clojure.core/cond-> {} (letvar1731375 "message") (clojure.core/assoc :message (deser-error-message (clojure.core/get-in letvar1731375 ["message"])))))))

(clojure.spec.alpha/def :portkey.aws.entitlement-marketplace/double clojure.core/double?)

(clojure.spec.alpha/def :portkey.aws.entitlement-marketplace/filter-value-list (clojure.spec.alpha/coll-of :portkey.aws.entitlement-marketplace/filter-value :min-count 1))

(clojure.spec.alpha/def :portkey.aws.entitlement-marketplace/non-empty-string (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__1410940__auto__] (clojure.core/re-matches #"\S+" s__1410940__auto__))))

(clojure.spec.alpha/def :portkey.aws.entitlement-marketplace.get-entitlements-result/entitlements (clojure.spec.alpha/and :portkey.aws.entitlement-marketplace/entitlement-list))
(clojure.spec.alpha/def :portkey.aws.entitlement-marketplace.get-entitlements-result/next-token (clojure.spec.alpha/and :portkey.aws.entitlement-marketplace/non-empty-string))
(clojure.spec.alpha/def :portkey.aws.entitlement-marketplace/get-entitlements-result (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.entitlement-marketplace.get-entitlements-result/entitlements :portkey.aws.entitlement-marketplace.get-entitlements-result/next-token]))

(clojure.spec.alpha/def :portkey.aws.entitlement-marketplace.internal-service-error-exception/message (clojure.spec.alpha/and :portkey.aws.entitlement-marketplace/error-message))
(clojure.spec.alpha/def :portkey.aws.entitlement-marketplace/internal-service-error-exception (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.entitlement-marketplace.internal-service-error-exception/message]))

(clojure.spec.alpha/def :portkey.aws.entitlement-marketplace/get-entitlement-filter-name #{:customer-identifier :dimension "CUSTOMER_IDENTIFIER" "DIMENSION"})

(clojure.spec.alpha/def :portkey.aws.entitlement-marketplace/error-message (clojure.spec.alpha/and clojure.core/string?))

(clojure.spec.alpha/def :portkey.aws.entitlement-marketplace.entitlement/dimension (clojure.spec.alpha/and :portkey.aws.entitlement-marketplace/non-empty-string))
(clojure.spec.alpha/def :portkey.aws.entitlement-marketplace.entitlement/customer-identifier (clojure.spec.alpha/and :portkey.aws.entitlement-marketplace/non-empty-string))
(clojure.spec.alpha/def :portkey.aws.entitlement-marketplace.entitlement/value (clojure.spec.alpha/and :portkey.aws.entitlement-marketplace/entitlement-value))
(clojure.spec.alpha/def :portkey.aws.entitlement-marketplace.entitlement/expiration-date (clojure.spec.alpha/and :portkey.aws.entitlement-marketplace/timestamp))
(clojure.spec.alpha/def :portkey.aws.entitlement-marketplace/entitlement (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.entitlement-marketplace/product-code :portkey.aws.entitlement-marketplace.entitlement/dimension :portkey.aws.entitlement-marketplace.entitlement/customer-identifier :portkey.aws.entitlement-marketplace.entitlement/value :portkey.aws.entitlement-marketplace.entitlement/expiration-date]))

(clojure.spec.alpha/def :portkey.aws.entitlement-marketplace.entitlement-value/integer-value (clojure.spec.alpha/and :portkey.aws.entitlement-marketplace/integer))
(clojure.spec.alpha/def :portkey.aws.entitlement-marketplace.entitlement-value/double-value (clojure.spec.alpha/and :portkey.aws.entitlement-marketplace/double))
(clojure.spec.alpha/def :portkey.aws.entitlement-marketplace.entitlement-value/boolean-value (clojure.spec.alpha/and :portkey.aws.entitlement-marketplace/boolean))
(clojure.spec.alpha/def :portkey.aws.entitlement-marketplace.entitlement-value/string-value (clojure.spec.alpha/and :portkey.aws.entitlement-marketplace/string))
(clojure.spec.alpha/def :portkey.aws.entitlement-marketplace/entitlement-value (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.entitlement-marketplace.entitlement-value/integer-value :portkey.aws.entitlement-marketplace.entitlement-value/double-value :portkey.aws.entitlement-marketplace.entitlement-value/boolean-value :portkey.aws.entitlement-marketplace.entitlement-value/string-value]))

(clojure.spec.alpha/def :portkey.aws.entitlement-marketplace/integer clojure.core/int?)

(clojure.spec.alpha/def :portkey.aws.entitlement-marketplace/string (clojure.spec.alpha/and clojure.core/string?))

(clojure.spec.alpha/def :portkey.aws.entitlement-marketplace/get-entitlement-filters (clojure.spec.alpha/map-of :portkey.aws.entitlement-marketplace/get-entitlement-filter-name :portkey.aws.entitlement-marketplace/filter-value-list))

(clojure.spec.alpha/def :portkey.aws.entitlement-marketplace/timestamp clojure.core/inst?)

(clojure.spec.alpha/def :portkey.aws.entitlement-marketplace/product-code (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__1410938__auto__] (clojure.core/<= 1 (clojure.core/count s__1410938__auto__))) (clojure.core/fn [s__1410939__auto__] (clojure.core/< (clojure.core/count s__1410939__auto__) 255))))

(clojure.spec.alpha/def :portkey.aws.entitlement-marketplace.throttling-exception/message (clojure.spec.alpha/and :portkey.aws.entitlement-marketplace/error-message))
(clojure.spec.alpha/def :portkey.aws.entitlement-marketplace/throttling-exception (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.entitlement-marketplace.throttling-exception/message]))

(clojure.spec.alpha/def :portkey.aws.entitlement-marketplace.get-entitlements-request/filter (clojure.spec.alpha/and :portkey.aws.entitlement-marketplace/get-entitlement-filters))
(clojure.spec.alpha/def :portkey.aws.entitlement-marketplace.get-entitlements-request/next-token (clojure.spec.alpha/and :portkey.aws.entitlement-marketplace/non-empty-string))
(clojure.spec.alpha/def :portkey.aws.entitlement-marketplace.get-entitlements-request/max-results (clojure.spec.alpha/and :portkey.aws.entitlement-marketplace/integer))
(clojure.spec.alpha/def :portkey.aws.entitlement-marketplace/get-entitlements-request (clojure.spec.alpha/keys :req-un [:portkey.aws.entitlement-marketplace/product-code] :opt-un [:portkey.aws.entitlement-marketplace.get-entitlements-request/filter :portkey.aws.entitlement-marketplace.get-entitlements-request/next-token :portkey.aws.entitlement-marketplace.get-entitlements-request/max-results]))

(clojure.spec.alpha/def :portkey.aws.entitlement-marketplace.invalid-parameter-exception/message (clojure.spec.alpha/and :portkey.aws.entitlement-marketplace/error-message))
(clojure.spec.alpha/def :portkey.aws.entitlement-marketplace/invalid-parameter-exception (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.entitlement-marketplace.invalid-parameter-exception/message]))

(clojure.spec.alpha/def :portkey.aws.entitlement-marketplace/entitlement-list (clojure.spec.alpha/coll-of :portkey.aws.entitlement-marketplace/entitlement :min-count 0))

(clojure.spec.alpha/def :portkey.aws.entitlement-marketplace/filter-value (clojure.spec.alpha/and clojure.core/string?))

(clojure.spec.alpha/def :portkey.aws.entitlement-marketplace/boolean clojure.core/boolean?)

(clojure.core/defn get-entitlements "GetEntitlements retrieves entitlement values for a given product. The results\ncan be filtered based on customer identifier or product dimensions." ([get-entitlements-requestinput] (clojure.core/let [request-function-result__1411981__auto__ (req-get-entitlements-request get-entitlements-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__1411981__auto__ {:http.request.configuration/endpoints portkey.aws.entitlement-marketplace/endpoints, :http.request.configuration/target-prefix "AWSMPEntitlementService", :http.request.spec/output-spec :portkey.aws.entitlement-marketplace/get-entitlements-result, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2017-01-11", :http.request.configuration/service-id nil, :http.request.spec/input-spec :portkey.aws.entitlement-marketplace/get-entitlements-request, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "GetEntitlements", :http.request.configuration/output-deser-fn response-get-entitlements-result, :http.request.spec/error-spec {"InvalidParameterException" :portkey.aws.entitlement-marketplace/invalid-parameter-exception, "ThrottlingException" :portkey.aws.entitlement-marketplace/throttling-exception, "InternalServiceErrorException" :portkey.aws.entitlement-marketplace/internal-service-error-exception}})))))
(clojure.spec.alpha/fdef get-entitlements :args (clojure.spec.alpha/tuple :portkey.aws.entitlement-marketplace/get-entitlements-request) :ret (clojure.spec.alpha/and :portkey.aws.entitlement-marketplace/get-entitlements-result))
