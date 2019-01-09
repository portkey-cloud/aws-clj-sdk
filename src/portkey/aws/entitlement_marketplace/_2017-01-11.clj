(ns portkey.aws.entitlement-marketplace.-2017-01-11 (:require [portkey.aws]))

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

(clojure.spec.alpha/def :portkey.aws.entitlement-marketplace.-2017-01-11/double clojure.core/double?)

(clojure.spec.alpha/def :portkey.aws.entitlement-marketplace.-2017-01-11/filter-value-list (clojure.spec.alpha/coll-of :portkey.aws.entitlement-marketplace.-2017-01-11/filter-value :min-count 1))

(clojure.spec.alpha/def :portkey.aws.entitlement-marketplace.-2017-01-11/non-empty-string (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__27967__auto__] (clojure.core/re-matches #"\S+" s__27967__auto__))))

(clojure.spec.alpha/def :portkey.aws.entitlement-marketplace.-2017-01-11.get-entitlements-result/entitlements (clojure.spec.alpha/and :portkey.aws.entitlement-marketplace.-2017-01-11/entitlement-list))
(clojure.spec.alpha/def :portkey.aws.entitlement-marketplace.-2017-01-11.get-entitlements-result/next-token (clojure.spec.alpha/and :portkey.aws.entitlement-marketplace.-2017-01-11/non-empty-string))
(clojure.spec.alpha/def :portkey.aws.entitlement-marketplace.-2017-01-11/get-entitlements-result (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.entitlement-marketplace.-2017-01-11.get-entitlements-result/entitlements :portkey.aws.entitlement-marketplace.-2017-01-11.get-entitlements-result/next-token]))

(clojure.spec.alpha/def :portkey.aws.entitlement-marketplace.-2017-01-11.internal-service-error-exception/message (clojure.spec.alpha/and :portkey.aws.entitlement-marketplace.-2017-01-11/error-message))
(clojure.spec.alpha/def :portkey.aws.entitlement-marketplace.-2017-01-11/internal-service-error-exception (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.entitlement-marketplace.-2017-01-11.internal-service-error-exception/message]))

(clojure.spec.alpha/def :portkey.aws.entitlement-marketplace.-2017-01-11/get-entitlement-filter-name #{:customer-identifier :dimension "CUSTOMER_IDENTIFIER" "DIMENSION"})

(clojure.spec.alpha/def :portkey.aws.entitlement-marketplace.-2017-01-11/error-message (clojure.spec.alpha/and clojure.core/string?))

(clojure.spec.alpha/def :portkey.aws.entitlement-marketplace.-2017-01-11.entitlement/dimension (clojure.spec.alpha/and :portkey.aws.entitlement-marketplace.-2017-01-11/non-empty-string))
(clojure.spec.alpha/def :portkey.aws.entitlement-marketplace.-2017-01-11.entitlement/customer-identifier (clojure.spec.alpha/and :portkey.aws.entitlement-marketplace.-2017-01-11/non-empty-string))
(clojure.spec.alpha/def :portkey.aws.entitlement-marketplace.-2017-01-11.entitlement/value (clojure.spec.alpha/and :portkey.aws.entitlement-marketplace.-2017-01-11/entitlement-value))
(clojure.spec.alpha/def :portkey.aws.entitlement-marketplace.-2017-01-11.entitlement/expiration-date (clojure.spec.alpha/and :portkey.aws.entitlement-marketplace.-2017-01-11/timestamp))
(clojure.spec.alpha/def :portkey.aws.entitlement-marketplace.-2017-01-11/entitlement (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.entitlement-marketplace.-2017-01-11/product-code :portkey.aws.entitlement-marketplace.-2017-01-11.entitlement/dimension :portkey.aws.entitlement-marketplace.-2017-01-11.entitlement/customer-identifier :portkey.aws.entitlement-marketplace.-2017-01-11.entitlement/value :portkey.aws.entitlement-marketplace.-2017-01-11.entitlement/expiration-date]))

(clojure.spec.alpha/def :portkey.aws.entitlement-marketplace.-2017-01-11.entitlement-value/integer-value (clojure.spec.alpha/and :portkey.aws.entitlement-marketplace.-2017-01-11/integer))
(clojure.spec.alpha/def :portkey.aws.entitlement-marketplace.-2017-01-11.entitlement-value/double-value (clojure.spec.alpha/and :portkey.aws.entitlement-marketplace.-2017-01-11/double))
(clojure.spec.alpha/def :portkey.aws.entitlement-marketplace.-2017-01-11.entitlement-value/boolean-value (clojure.spec.alpha/and :portkey.aws.entitlement-marketplace.-2017-01-11/boolean))
(clojure.spec.alpha/def :portkey.aws.entitlement-marketplace.-2017-01-11.entitlement-value/string-value (clojure.spec.alpha/and :portkey.aws.entitlement-marketplace.-2017-01-11/string))
(clojure.spec.alpha/def :portkey.aws.entitlement-marketplace.-2017-01-11/entitlement-value (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.entitlement-marketplace.-2017-01-11.entitlement-value/integer-value :portkey.aws.entitlement-marketplace.-2017-01-11.entitlement-value/double-value :portkey.aws.entitlement-marketplace.-2017-01-11.entitlement-value/boolean-value :portkey.aws.entitlement-marketplace.-2017-01-11.entitlement-value/string-value]))

(clojure.spec.alpha/def :portkey.aws.entitlement-marketplace.-2017-01-11/integer clojure.core/int?)

(clojure.spec.alpha/def :portkey.aws.entitlement-marketplace.-2017-01-11/string (clojure.spec.alpha/and clojure.core/string?))

(clojure.spec.alpha/def :portkey.aws.entitlement-marketplace.-2017-01-11/get-entitlement-filters (clojure.spec.alpha/map-of :portkey.aws.entitlement-marketplace.-2017-01-11/get-entitlement-filter-name :portkey.aws.entitlement-marketplace.-2017-01-11/filter-value-list))

(clojure.spec.alpha/def :portkey.aws.entitlement-marketplace.-2017-01-11/timestamp clojure.core/inst?)

(clojure.spec.alpha/def :portkey.aws.entitlement-marketplace.-2017-01-11/product-code (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__27965__auto__] (clojure.core/<= 1 (clojure.core/count s__27965__auto__))) (clojure.core/fn [s__27966__auto__] (clojure.core/< (clojure.core/count s__27966__auto__) 255))))

(clojure.spec.alpha/def :portkey.aws.entitlement-marketplace.-2017-01-11.throttling-exception/message (clojure.spec.alpha/and :portkey.aws.entitlement-marketplace.-2017-01-11/error-message))
(clojure.spec.alpha/def :portkey.aws.entitlement-marketplace.-2017-01-11/throttling-exception (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.entitlement-marketplace.-2017-01-11.throttling-exception/message]))

(clojure.spec.alpha/def :portkey.aws.entitlement-marketplace.-2017-01-11.get-entitlements-request/filter (clojure.spec.alpha/and :portkey.aws.entitlement-marketplace.-2017-01-11/get-entitlement-filters))
(clojure.spec.alpha/def :portkey.aws.entitlement-marketplace.-2017-01-11.get-entitlements-request/next-token (clojure.spec.alpha/and :portkey.aws.entitlement-marketplace.-2017-01-11/non-empty-string))
(clojure.spec.alpha/def :portkey.aws.entitlement-marketplace.-2017-01-11.get-entitlements-request/max-results (clojure.spec.alpha/and :portkey.aws.entitlement-marketplace.-2017-01-11/integer))
(clojure.spec.alpha/def :portkey.aws.entitlement-marketplace.-2017-01-11/get-entitlements-request (clojure.spec.alpha/keys :req-un [:portkey.aws.entitlement-marketplace.-2017-01-11/product-code] :opt-un [:portkey.aws.entitlement-marketplace.-2017-01-11.get-entitlements-request/filter :portkey.aws.entitlement-marketplace.-2017-01-11.get-entitlements-request/next-token :portkey.aws.entitlement-marketplace.-2017-01-11.get-entitlements-request/max-results]))

(clojure.spec.alpha/def :portkey.aws.entitlement-marketplace.-2017-01-11.invalid-parameter-exception/message (clojure.spec.alpha/and :portkey.aws.entitlement-marketplace.-2017-01-11/error-message))
(clojure.spec.alpha/def :portkey.aws.entitlement-marketplace.-2017-01-11/invalid-parameter-exception (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.entitlement-marketplace.-2017-01-11.invalid-parameter-exception/message]))

(clojure.spec.alpha/def :portkey.aws.entitlement-marketplace.-2017-01-11/entitlement-list (clojure.spec.alpha/coll-of :portkey.aws.entitlement-marketplace.-2017-01-11/entitlement :min-count 0))

(clojure.spec.alpha/def :portkey.aws.entitlement-marketplace.-2017-01-11/filter-value (clojure.spec.alpha/and clojure.core/string?))

(clojure.spec.alpha/def :portkey.aws.entitlement-marketplace.-2017-01-11/boolean clojure.core/boolean?)

(clojure.core/defn get-entitlements ([get-entitlements-requestinput] (clojure.core/let [request-function-result__28606__auto__ (req-get-entitlements-request get-entitlements-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__28606__auto__ {:http.request.configuration/endpoints portkey.aws.entitlement-marketplace.-2017-01-11/endpoints, :http.request.spec/output-spec :portkey.aws.entitlement-marketplace.-2017-01-11/get-entitlements-result, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2017-01-11", :http.request.configuration/service-id nil, :http.request.spec/input-spec :portkey.aws.entitlement-marketplace.-2017-01-11/get-entitlements-request, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/action "GetEntitlements", :http.request.spec/error-spec {"InvalidParameterException" :portkey.aws.entitlement-marketplace.-2017-01-11/invalid-parameter-exception, "ThrottlingException" :portkey.aws.entitlement-marketplace.-2017-01-11/throttling-exception, "InternalServiceErrorException" :portkey.aws.entitlement-marketplace.-2017-01-11/internal-service-error-exception}})))))
(clojure.spec.alpha/fdef get-entitlements :args (clojure.spec.alpha/tuple :portkey.aws.entitlement-marketplace.-2017-01-11/get-entitlements-request) :ret (clojure.spec.alpha/and :portkey.aws.entitlement-marketplace.-2017-01-11/get-entitlements-result))
