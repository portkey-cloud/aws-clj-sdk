(ns portkey.aws.pricing (:require [portkey.aws]))

(def
 endpoints
 '{"us-east-1"
   {:credential-scope {:service "pricing", :region "us-east-1"},
    :ssl-common-name "api.pricing.us-east-1.amazonaws.com",
    :endpoint "https://api.pricing.us-east-1.amazonaws.com",
    :signature-version :v4},
   "ap-south-1"
   {:credential-scope {:service "pricing", :region "ap-south-1"},
    :ssl-common-name "api.pricing.ap-south-1.amazonaws.com",
    :endpoint "https://api.pricing.ap-south-1.amazonaws.com",
    :signature-version :v4}})

(clojure.core/declare ser-filter)

(clojure.core/declare ser-boxed-integer)

(clojure.core/declare ser-filter-type)

(clojure.core/declare ser-string)

(clojure.core/declare ser-filters)

(clojure.core/defn- ser-filter [input] (clojure.core/cond-> #:http.request.field{:value [(clojure.core/into (ser-filter-type (:type input)) #:http.request.field{:name "Type", :shape "FilterType"}) (clojure.core/into (ser-string (:field input)) #:http.request.field{:name "Field", :shape "String"}) (clojure.core/into (ser-string (:value input)) #:http.request.field{:name "Value", :shape "String"})], :shape "Filter", :type "structure"}))

(clojure.core/defn- ser-boxed-integer [input] #:http.request.field{:value input, :shape "BoxedInteger"})

(clojure.core/defn- ser-filter-type [input] #:http.request.field{:value (clojure.core/get {"TERM_MATCH" "TERM_MATCH", :term-match "TERM_MATCH"} input), :shape "FilterType"})

(clojure.core/defn- ser-string [input] #:http.request.field{:value input, :shape "String"})

(clojure.core/defn- ser-filters [input] #:http.request.field{:value (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (clojure.core/merge (ser-filter coll) #:http.request.field{:shape "Filter"}))) input), :shape "Filters", :type "list"})

(clojure.core/defn- req-describe-services-request [input] (clojure.core/cond-> {} (clojure.core/contains? input :service-code) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-string (input :service-code)) #:http.request.field{:name "ServiceCode", :shape "String"})) (clojure.core/contains? input :format-version) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-string (input :format-version)) #:http.request.field{:name "FormatVersion", :shape "String"})) (clojure.core/contains? input :next-token) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-string (input :next-token)) #:http.request.field{:name "NextToken", :shape "String"})) (clojure.core/contains? input :max-results) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-boxed-integer (input :max-results)) #:http.request.field{:name "MaxResults", :shape "BoxedInteger", :box true}))))

(clojure.core/defn- req-get-attribute-values-request [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (ser-string (input :service-code)) #:http.request.field{:name "ServiceCode", :shape "String"}) (clojure.core/into (ser-string (input :attribute-name)) #:http.request.field{:name "AttributeName", :shape "String"})]} (clojure.core/contains? input :next-token) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-string (input :next-token)) #:http.request.field{:name "NextToken", :shape "String"})) (clojure.core/contains? input :max-results) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-boxed-integer (input :max-results)) #:http.request.field{:name "MaxResults", :shape "BoxedInteger", :box true}))))

(clojure.core/defn- req-get-products-request [input] (clojure.core/cond-> {} (clojure.core/contains? input :service-code) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-string (input :service-code)) #:http.request.field{:name "ServiceCode", :shape "String"})) (clojure.core/contains? input :filters) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-filters (input :filters)) #:http.request.field{:name "Filters", :shape "Filters"})) (clojure.core/contains? input :format-version) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-string (input :format-version)) #:http.request.field{:name "FormatVersion", :shape "String"})) (clojure.core/contains? input :next-token) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-string (input :next-token)) #:http.request.field{:name "NextToken", :shape "String"})) (clojure.core/contains? input :max-results) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-boxed-integer (input :max-results)) #:http.request.field{:name "MaxResults", :shape "BoxedInteger", :box true}))))

(clojure.core/declare deser-service-list)

(clojure.core/declare deser-price-list)

(clojure.core/declare desererror-message)

(clojure.core/declare deser-price-list-item-json)

(clojure.core/declare deser-attribute-value)

(clojure.core/declare deser-attribute-name-list)

(clojure.core/declare deser-string)

(clojure.core/declare deser-attribute-value-list)

(clojure.core/declare deser-service)

(clojure.core/defn- deser-service-list [input] (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (deser-service coll))) input))

(clojure.core/defn- deser-price-list [input] (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (deser-price-list-item-json coll))) input))

(clojure.core/defn- desererror-message [input] input)

(clojure.core/defn- deser-price-list-item-json [input] input)

(clojure.core/defn- deser-attribute-value [input] (clojure.core/cond-> {} (clojure.core/contains? input "Value") (clojure.core/assoc :value (deser-string (input "Value")))))

(clojure.core/defn- deser-attribute-name-list [input] (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (deser-string coll))) input))

(clojure.core/defn- deser-string [input] input)

(clojure.core/defn- deser-attribute-value-list [input] (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (deser-attribute-value coll))) input))

(clojure.core/defn- deser-service [input] (clojure.core/cond-> {} (clojure.core/contains? input "ServiceCode") (clojure.core/assoc :service-code (deser-string (input "ServiceCode"))) (clojure.core/contains? input "AttributeNames") (clojure.core/assoc :attribute-names (deser-attribute-name-list (input "AttributeNames")))))

(clojure.core/defn- response-get-products-response ([input] (response-get-products-response nil input)) ([resultWrapper1948323 input] (clojure.core/let [rawinput1948322 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar1948324 {"FormatVersion" (rawinput1948322 "FormatVersion"), "PriceList" (rawinput1948322 "PriceList"), "NextToken" (rawinput1948322 "NextToken")}] (clojure.core/cond-> {} (letvar1948324 "FormatVersion") (clojure.core/assoc :format-version (deser-string (clojure.core/get-in letvar1948324 ["FormatVersion"]))) (letvar1948324 "PriceList") (clojure.core/assoc :price-list (deser-price-list (clojure.core/get-in letvar1948324 ["PriceList"]))) (letvar1948324 "NextToken") (clojure.core/assoc :next-token (deser-string (clojure.core/get-in letvar1948324 ["NextToken"])))))))

(clojure.core/defn- response-expired-next-token-exception ([input] (response-expired-next-token-exception nil input)) ([resultWrapper1948326 input] (clojure.core/let [rawinput1948325 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar1948327 {"Message" (rawinput1948325 "Message")}] (clojure.core/cond-> {} (letvar1948327 "Message") (clojure.core/assoc :message (desererror-message (clojure.core/get-in letvar1948327 ["Message"])))))))

(clojure.core/defn- response-invalid-next-token-exception ([input] (response-invalid-next-token-exception nil input)) ([resultWrapper1948329 input] (clojure.core/let [rawinput1948328 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar1948330 {"Message" (rawinput1948328 "Message")}] (clojure.core/cond-> {} (letvar1948330 "Message") (clojure.core/assoc :message (desererror-message (clojure.core/get-in letvar1948330 ["Message"])))))))

(clojure.core/defn- response-internal-error-exception ([input] (response-internal-error-exception nil input)) ([resultWrapper1948332 input] (clojure.core/let [rawinput1948331 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar1948333 {"Message" (rawinput1948331 "Message")}] (clojure.core/cond-> {} (letvar1948333 "Message") (clojure.core/assoc :message (desererror-message (clojure.core/get-in letvar1948333 ["Message"])))))))

(clojure.core/defn- response-describe-services-response ([input] (response-describe-services-response nil input)) ([resultWrapper1948335 input] (clojure.core/let [rawinput1948334 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar1948336 {"Services" (rawinput1948334 "Services"), "FormatVersion" (rawinput1948334 "FormatVersion"), "NextToken" (rawinput1948334 "NextToken")}] (clojure.core/cond-> {} (letvar1948336 "Services") (clojure.core/assoc :services (deser-service-list (clojure.core/get-in letvar1948336 ["Services"]))) (letvar1948336 "FormatVersion") (clojure.core/assoc :format-version (deser-string (clojure.core/get-in letvar1948336 ["FormatVersion"]))) (letvar1948336 "NextToken") (clojure.core/assoc :next-token (deser-string (clojure.core/get-in letvar1948336 ["NextToken"])))))))

(clojure.core/defn- response-not-found-exception ([input] (response-not-found-exception nil input)) ([resultWrapper1948338 input] (clojure.core/let [rawinput1948337 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar1948339 {"Message" (rawinput1948337 "Message")}] (clojure.core/cond-> {} (letvar1948339 "Message") (clojure.core/assoc :message (desererror-message (clojure.core/get-in letvar1948339 ["Message"])))))))

(clojure.core/defn- response-get-attribute-values-response ([input] (response-get-attribute-values-response nil input)) ([resultWrapper1948341 input] (clojure.core/let [rawinput1948340 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar1948342 {"AttributeValues" (rawinput1948340 "AttributeValues"), "NextToken" (rawinput1948340 "NextToken")}] (clojure.core/cond-> {} (letvar1948342 "AttributeValues") (clojure.core/assoc :attribute-values (deser-attribute-value-list (clojure.core/get-in letvar1948342 ["AttributeValues"]))) (letvar1948342 "NextToken") (clojure.core/assoc :next-token (deser-string (clojure.core/get-in letvar1948342 ["NextToken"])))))))

(clojure.core/defn- response-invalid-parameter-exception ([input] (response-invalid-parameter-exception nil input)) ([resultWrapper1948344 input] (clojure.core/let [rawinput1948343 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar1948345 {"Message" (rawinput1948343 "Message")}] (clojure.core/cond-> {} (letvar1948345 "Message") (clojure.core/assoc :message (desererror-message (clojure.core/get-in letvar1948345 ["Message"])))))))

(clojure.spec.alpha/def :portkey.aws.pricing/service-list (clojure.spec.alpha/coll-of :portkey.aws.pricing/service))

(clojure.spec.alpha/def :portkey.aws.pricing.filter/type (clojure.spec.alpha/and :portkey.aws.pricing/filter-type))
(clojure.spec.alpha/def :portkey.aws.pricing.filter/field (clojure.spec.alpha/and :portkey.aws.pricing/string))
(clojure.spec.alpha/def :portkey.aws.pricing.filter/value (clojure.spec.alpha/and :portkey.aws.pricing/string))
(clojure.spec.alpha/def :portkey.aws.pricing/filter (clojure.spec.alpha/keys :req-un [:portkey.aws.pricing.filter/type :portkey.aws.pricing.filter/field :portkey.aws.pricing.filter/value] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.pricing/price-list (clojure.spec.alpha/coll-of :portkey.aws.pricing/price-list-item-json))

(clojure.spec.alpha/def :portkey.aws.pricing.get-products-response/format-version (clojure.spec.alpha/and :portkey.aws.pricing/string))
(clojure.spec.alpha/def :portkey.aws.pricing.get-products-response/next-token (clojure.spec.alpha/and :portkey.aws.pricing/string))
(clojure.spec.alpha/def :portkey.aws.pricing/get-products-response (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.pricing.get-products-response/format-version :portkey.aws.pricing/price-list :portkey.aws.pricing.get-products-response/next-token]))

(clojure.spec.alpha/def :portkey.aws.pricing/error-message (clojure.spec.alpha/and clojure.core/string?))

(clojure.spec.alpha/def :portkey.aws.pricing/boxed-integer (clojure.spec.alpha/int-in 1 100))

(clojure.spec.alpha/def :portkey.aws.pricing.expired-next-token-exception/message (clojure.spec.alpha/and :portkey.aws.pricing/error-message))
(clojure.spec.alpha/def :portkey.aws.pricing/expired-next-token-exception (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.pricing.expired-next-token-exception/message]))

(clojure.spec.alpha/def :portkey.aws.pricing.describe-services-request/service-code (clojure.spec.alpha/and :portkey.aws.pricing/string))
(clojure.spec.alpha/def :portkey.aws.pricing.describe-services-request/format-version (clojure.spec.alpha/and :portkey.aws.pricing/string))
(clojure.spec.alpha/def :portkey.aws.pricing.describe-services-request/next-token (clojure.spec.alpha/and :portkey.aws.pricing/string))
(clojure.spec.alpha/def :portkey.aws.pricing.describe-services-request/max-results (clojure.spec.alpha/and :portkey.aws.pricing/boxed-integer))
(clojure.spec.alpha/def :portkey.aws.pricing/describe-services-request (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.pricing.describe-services-request/service-code :portkey.aws.pricing.describe-services-request/format-version :portkey.aws.pricing.describe-services-request/next-token :portkey.aws.pricing.describe-services-request/max-results]))

(clojure.spec.alpha/def :portkey.aws.pricing.get-attribute-values-request/service-code (clojure.spec.alpha/and :portkey.aws.pricing/string))
(clojure.spec.alpha/def :portkey.aws.pricing.get-attribute-values-request/attribute-name (clojure.spec.alpha/and :portkey.aws.pricing/string))
(clojure.spec.alpha/def :portkey.aws.pricing.get-attribute-values-request/next-token (clojure.spec.alpha/and :portkey.aws.pricing/string))
(clojure.spec.alpha/def :portkey.aws.pricing.get-attribute-values-request/max-results (clojure.spec.alpha/and :portkey.aws.pricing/boxed-integer))
(clojure.spec.alpha/def :portkey.aws.pricing/get-attribute-values-request (clojure.spec.alpha/keys :req-un [:portkey.aws.pricing.get-attribute-values-request/service-code :portkey.aws.pricing.get-attribute-values-request/attribute-name] :opt-un [:portkey.aws.pricing.get-attribute-values-request/next-token :portkey.aws.pricing.get-attribute-values-request/max-results]))

(clojure.spec.alpha/def :portkey.aws.pricing/price-list-item-json (clojure.spec.alpha/and clojure.core/string?))

(clojure.spec.alpha/def :portkey.aws.pricing.invalid-next-token-exception/message (clojure.spec.alpha/and :portkey.aws.pricing/error-message))
(clojure.spec.alpha/def :portkey.aws.pricing/invalid-next-token-exception (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.pricing.invalid-next-token-exception/message]))

(clojure.spec.alpha/def :portkey.aws.pricing.internal-error-exception/message (clojure.spec.alpha/and :portkey.aws.pricing/error-message))
(clojure.spec.alpha/def :portkey.aws.pricing/internal-error-exception (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.pricing.internal-error-exception/message]))

(clojure.spec.alpha/def :portkey.aws.pricing.get-products-request/service-code (clojure.spec.alpha/and :portkey.aws.pricing/string))
(clojure.spec.alpha/def :portkey.aws.pricing.get-products-request/format-version (clojure.spec.alpha/and :portkey.aws.pricing/string))
(clojure.spec.alpha/def :portkey.aws.pricing.get-products-request/next-token (clojure.spec.alpha/and :portkey.aws.pricing/string))
(clojure.spec.alpha/def :portkey.aws.pricing.get-products-request/max-results (clojure.spec.alpha/and :portkey.aws.pricing/boxed-integer))
(clojure.spec.alpha/def :portkey.aws.pricing/get-products-request (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.pricing.get-products-request/service-code :portkey.aws.pricing/filters :portkey.aws.pricing.get-products-request/format-version :portkey.aws.pricing.get-products-request/next-token :portkey.aws.pricing.get-products-request/max-results]))

(clojure.spec.alpha/def :portkey.aws.pricing.describe-services-response/services (clojure.spec.alpha/and :portkey.aws.pricing/service-list))
(clojure.spec.alpha/def :portkey.aws.pricing.describe-services-response/format-version (clojure.spec.alpha/and :portkey.aws.pricing/string))
(clojure.spec.alpha/def :portkey.aws.pricing.describe-services-response/next-token (clojure.spec.alpha/and :portkey.aws.pricing/string))
(clojure.spec.alpha/def :portkey.aws.pricing/describe-services-response (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.pricing.describe-services-response/services :portkey.aws.pricing.describe-services-response/format-version :portkey.aws.pricing.describe-services-response/next-token]))

(clojure.spec.alpha/def :portkey.aws.pricing.attribute-value/value (clojure.spec.alpha/and :portkey.aws.pricing/string))
(clojure.spec.alpha/def :portkey.aws.pricing/attribute-value (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.pricing.attribute-value/value]))

(clojure.spec.alpha/def :portkey.aws.pricing/attribute-name-list (clojure.spec.alpha/coll-of :portkey.aws.pricing/string))

(clojure.spec.alpha/def :portkey.aws.pricing.not-found-exception/message (clojure.spec.alpha/and :portkey.aws.pricing/error-message))
(clojure.spec.alpha/def :portkey.aws.pricing/not-found-exception (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.pricing.not-found-exception/message]))

(clojure.spec.alpha/def :portkey.aws.pricing/filter-type #{"TERM_MATCH" :term-match})

(clojure.spec.alpha/def :portkey.aws.pricing/string (clojure.spec.alpha/and clojure.core/string?))

(clojure.spec.alpha/def :portkey.aws.pricing/filters (clojure.spec.alpha/coll-of :portkey.aws.pricing/filter))

(clojure.spec.alpha/def :portkey.aws.pricing/attribute-value-list (clojure.spec.alpha/coll-of :portkey.aws.pricing/attribute-value))

(clojure.spec.alpha/def :portkey.aws.pricing.service/service-code (clojure.spec.alpha/and :portkey.aws.pricing/string))
(clojure.spec.alpha/def :portkey.aws.pricing.service/attribute-names (clojure.spec.alpha/and :portkey.aws.pricing/attribute-name-list))
(clojure.spec.alpha/def :portkey.aws.pricing/service (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.pricing.service/service-code :portkey.aws.pricing.service/attribute-names]))

(clojure.spec.alpha/def :portkey.aws.pricing.get-attribute-values-response/attribute-values (clojure.spec.alpha/and :portkey.aws.pricing/attribute-value-list))
(clojure.spec.alpha/def :portkey.aws.pricing.get-attribute-values-response/next-token (clojure.spec.alpha/and :portkey.aws.pricing/string))
(clojure.spec.alpha/def :portkey.aws.pricing/get-attribute-values-response (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.pricing.get-attribute-values-response/attribute-values :portkey.aws.pricing.get-attribute-values-response/next-token]))

(clojure.spec.alpha/def :portkey.aws.pricing.invalid-parameter-exception/message (clojure.spec.alpha/and :portkey.aws.pricing/error-message))
(clojure.spec.alpha/def :portkey.aws.pricing/invalid-parameter-exception (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.pricing.invalid-parameter-exception/message]))

(clojure.core/defn describe-services ([] (describe-services {})) ([describe-services-requestinput] (clojure.core/let [request-function-result__1468878__auto__ (req-describe-services-request describe-services-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__1468878__auto__ {:http.request.configuration/endpoints portkey.aws.pricing/endpoints, :http.request.configuration/target-prefix "AWSPriceListService", :http.request.spec/output-spec :portkey.aws.pricing/describe-services-response, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2017-10-15", :http.request.configuration/service-id nil, :http.request.spec/input-spec :portkey.aws.pricing/describe-services-request, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "DescribeServices", :http.request.configuration/output-deser-fn response-describe-services-response, :http.request.spec/error-spec {"InternalErrorException" :portkey.aws.pricing/internal-error-exception, "InvalidParameterException" :portkey.aws.pricing/invalid-parameter-exception, "NotFoundException" :portkey.aws.pricing/not-found-exception, "InvalidNextTokenException" :portkey.aws.pricing/invalid-next-token-exception, "ExpiredNextTokenException" :portkey.aws.pricing/expired-next-token-exception}})))))
(clojure.spec.alpha/fdef describe-services :args (clojure.spec.alpha/? :portkey.aws.pricing/describe-services-request) :ret (clojure.spec.alpha/and :portkey.aws.pricing/describe-services-response))

(clojure.core/defn get-attribute-values ([get-attribute-values-requestinput] (clojure.core/let [request-function-result__1468878__auto__ (req-get-attribute-values-request get-attribute-values-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__1468878__auto__ {:http.request.configuration/endpoints portkey.aws.pricing/endpoints, :http.request.configuration/target-prefix "AWSPriceListService", :http.request.spec/output-spec :portkey.aws.pricing/get-attribute-values-response, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2017-10-15", :http.request.configuration/service-id nil, :http.request.spec/input-spec :portkey.aws.pricing/get-attribute-values-request, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "GetAttributeValues", :http.request.configuration/output-deser-fn response-get-attribute-values-response, :http.request.spec/error-spec {"InternalErrorException" :portkey.aws.pricing/internal-error-exception, "InvalidParameterException" :portkey.aws.pricing/invalid-parameter-exception, "NotFoundException" :portkey.aws.pricing/not-found-exception, "InvalidNextTokenException" :portkey.aws.pricing/invalid-next-token-exception, "ExpiredNextTokenException" :portkey.aws.pricing/expired-next-token-exception}})))))
(clojure.spec.alpha/fdef get-attribute-values :args (clojure.spec.alpha/tuple :portkey.aws.pricing/get-attribute-values-request) :ret (clojure.spec.alpha/and :portkey.aws.pricing/get-attribute-values-response))

(clojure.core/defn get-products ([] (get-products {})) ([get-products-requestinput] (clojure.core/let [request-function-result__1468878__auto__ (req-get-products-request get-products-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__1468878__auto__ {:http.request.configuration/endpoints portkey.aws.pricing/endpoints, :http.request.configuration/target-prefix "AWSPriceListService", :http.request.spec/output-spec :portkey.aws.pricing/get-products-response, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2017-10-15", :http.request.configuration/service-id nil, :http.request.spec/input-spec :portkey.aws.pricing/get-products-request, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "GetProducts", :http.request.configuration/output-deser-fn response-get-products-response, :http.request.spec/error-spec {"InternalErrorException" :portkey.aws.pricing/internal-error-exception, "InvalidParameterException" :portkey.aws.pricing/invalid-parameter-exception, "NotFoundException" :portkey.aws.pricing/not-found-exception, "InvalidNextTokenException" :portkey.aws.pricing/invalid-next-token-exception, "ExpiredNextTokenException" :portkey.aws.pricing/expired-next-token-exception}})))))
(clojure.spec.alpha/fdef get-products :args (clojure.spec.alpha/? :portkey.aws.pricing/get-products-request) :ret (clojure.spec.alpha/and :portkey.aws.pricing/get-products-response))
