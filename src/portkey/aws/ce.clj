(ns portkey.aws.ce (:require [portkey.aws]))

(def
 endpoints
 '{"ap-northeast-1"
   {:credential-scope {:service "ce", :region "us-east-1"},
    :ssl-common-name "ce.us-east-1.amazonaws.com",
    :endpoint "https://ce.us-east-1.amazonaws.com",
    :signature-version :v4},
   "eu-west-1"
   {:credential-scope {:service "ce", :region "us-east-1"},
    :ssl-common-name "ce.us-east-1.amazonaws.com",
    :endpoint "https://ce.us-east-1.amazonaws.com",
    :signature-version :v4},
   "us-east-2"
   {:credential-scope {:service "ce", :region "us-east-1"},
    :ssl-common-name "ce.us-east-1.amazonaws.com",
    :endpoint "https://ce.us-east-1.amazonaws.com",
    :signature-version :v4},
   "ap-southeast-2"
   {:credential-scope {:service "ce", :region "us-east-1"},
    :ssl-common-name "ce.us-east-1.amazonaws.com",
    :endpoint "https://ce.us-east-1.amazonaws.com",
    :signature-version :v4},
   "sa-east-1"
   {:credential-scope {:service "ce", :region "us-east-1"},
    :ssl-common-name "ce.us-east-1.amazonaws.com",
    :endpoint "https://ce.us-east-1.amazonaws.com",
    :signature-version :v4},
   "ap-southeast-1"
   {:credential-scope {:service "ce", :region "us-east-1"},
    :ssl-common-name "ce.us-east-1.amazonaws.com",
    :endpoint "https://ce.us-east-1.amazonaws.com",
    :signature-version :v4},
   "ap-northeast-2"
   {:credential-scope {:service "ce", :region "us-east-1"},
    :ssl-common-name "ce.us-east-1.amazonaws.com",
    :endpoint "https://ce.us-east-1.amazonaws.com",
    :signature-version :v4},
   "eu-west-3"
   {:credential-scope {:service "ce", :region "us-east-1"},
    :ssl-common-name "ce.us-east-1.amazonaws.com",
    :endpoint "https://ce.us-east-1.amazonaws.com",
    :signature-version :v4},
   "ca-central-1"
   {:credential-scope {:service "ce", :region "us-east-1"},
    :ssl-common-name "ce.us-east-1.amazonaws.com",
    :endpoint "https://ce.us-east-1.amazonaws.com",
    :signature-version :v4},
   "eu-central-1"
   {:credential-scope {:service "ce", :region "us-east-1"},
    :ssl-common-name "ce.us-east-1.amazonaws.com",
    :endpoint "https://ce.us-east-1.amazonaws.com",
    :signature-version :v4},
   "eu-west-2"
   {:credential-scope {:service "ce", :region "us-east-1"},
    :ssl-common-name "ce.us-east-1.amazonaws.com",
    :endpoint "https://ce.us-east-1.amazonaws.com",
    :signature-version :v4},
   "us-west-2"
   {:credential-scope {:service "ce", :region "us-east-1"},
    :ssl-common-name "ce.us-east-1.amazonaws.com",
    :endpoint "https://ce.us-east-1.amazonaws.com",
    :signature-version :v4},
   "us-east-1"
   {:credential-scope {:service "ce", :region "us-east-1"},
    :ssl-common-name "ce.us-east-1.amazonaws.com",
    :endpoint "https://ce.us-east-1.amazonaws.com",
    :signature-version :v4},
   "us-west-1"
   {:credential-scope {:service "ce", :region "us-east-1"},
    :ssl-common-name "ce.us-east-1.amazonaws.com",
    :endpoint "https://ce.us-east-1.amazonaws.com",
    :signature-version :v4},
   "ap-south-1"
   {:credential-scope {:service "ce", :region "us-east-1"},
    :ssl-common-name "ce.us-east-1.amazonaws.com",
    :endpoint "https://ce.us-east-1.amazonaws.com",
    :signature-version :v4},
   "aws-global"
   {:credential-scope {:service "ce", :region "us-east-1"},
    :ssl-common-name "ce.us-east-1.amazonaws.com",
    :endpoint "https://ce.us-east-1.amazonaws.com",
    :signature-version :v4}})

(clojure.core/declare ser-tag-values)

(clojure.core/declare ser-group-definitions)

(clojure.core/declare ser-non-negative-integer)

(clojure.core/declare ser-search-string)

(clojure.core/declare ser-term-in-years)

(clojure.core/declare ser-year-month-day)

(clojure.core/declare ser-group-definition-key)

(clojure.core/declare ser-context)

(clojure.core/declare ser-tag-key)

(clojure.core/declare ser-date-interval)

(clojure.core/declare ser-dimension)

(clojure.core/declare ser-expression)

(clojure.core/declare ser-payment-option)

(clojure.core/declare ser-account-scope)

(clojure.core/declare ser-lookback-period-in-days)

(clojure.core/declare ser-expressions)

(clojure.core/declare ser-value)

(clojure.core/declare ser-generic-string)

(clojure.core/declare ser-values)

(clojure.core/declare ser-service-specification)

(clojure.core/declare ser-ec-2-specification)

(clojure.core/declare ser-group-definition-type)

(clojure.core/declare ser-metric-names)

(clojure.core/declare ser-granularity)

(clojure.core/declare ser-metric-name)

(clojure.core/declare ser-offering-class)

(clojure.core/declare ser-dimension-values)

(clojure.core/declare ser-group-definition)

(clojure.core/declare ser-next-page-token)

(clojure.core/defn- ser-tag-values [input] (clojure.core/cond-> #:http.request.field{:value [], :shape "TagValues", :type "structure"} (clojure.core/contains? input :key) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-tag-key (input :key)) #:http.request.field{:name "Key", :shape "TagKey"})) (clojure.core/contains? input :values) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-values (input :values)) #:http.request.field{:name "Values", :shape "Values"}))))

(clojure.core/defn- ser-group-definitions [input] #:http.request.field{:value (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (clojure.core/merge (ser-group-definition coll) #:http.request.field{:shape "GroupDefinition"}))) input), :shape "GroupDefinitions", :type "list"})

(clojure.core/defn- ser-non-negative-integer [input] #:http.request.field{:value input, :shape "NonNegativeInteger"})

(clojure.core/defn- ser-search-string [input] #:http.request.field{:value input, :shape "SearchString"})

(clojure.core/defn- ser-term-in-years [input] #:http.request.field{:value (clojure.core/get {"ONE_YEAR" "ONE_YEAR", :one-year "ONE_YEAR", "THREE_YEARS" "THREE_YEARS", :three-years "THREE_YEARS"} input), :shape "TermInYears"})

(clojure.core/defn- ser-year-month-day [input] #:http.request.field{:value input, :shape "YearMonthDay"})

(clojure.core/defn- ser-group-definition-key [input] #:http.request.field{:value input, :shape "GroupDefinitionKey"})

(clojure.core/defn- ser-context [input] #:http.request.field{:value (clojure.core/get {"COST_AND_USAGE" "COST_AND_USAGE", :cost-and-usage "COST_AND_USAGE", "RESERVATIONS" "RESERVATIONS", :reservations "RESERVATIONS"} input), :shape "Context"})

(clojure.core/defn- ser-tag-key [input] #:http.request.field{:value input, :shape "TagKey"})

(clojure.core/defn- ser-date-interval [input] (clojure.core/cond-> #:http.request.field{:value [(clojure.core/into (ser-year-month-day (:start input)) #:http.request.field{:name "Start", :shape "YearMonthDay"}) (clojure.core/into (ser-year-month-day (:end input)) #:http.request.field{:name "End", :shape "YearMonthDay"})], :shape "DateInterval", :type "structure"}))

(clojure.core/defn- ser-dimension [input] #:http.request.field{:value (clojure.core/get {"SUBSCRIPTION_ID" "SUBSCRIPTION_ID", :instance-type-family "INSTANCE_TYPE_FAMILY", :service "SERVICE", :az "AZ", :database-engine "DATABASE_ENGINE", "LINKED_ACCOUNT" "LINKED_ACCOUNT", "LEGAL_ENTITY_NAME" "LEGAL_ENTITY_NAME", "TENANCY" "TENANCY", :tenancy "TENANCY", "PURCHASE_TYPE" "PURCHASE_TYPE", :operation "OPERATION", "SERVICE" "SERVICE", :instance-type "INSTANCE_TYPE", "INSTANCE_TYPE_FAMILY" "INSTANCE_TYPE_FAMILY", :scope "SCOPE", "RECORD_TYPE" "RECORD_TYPE", "INSTANCE_TYPE" "INSTANCE_TYPE", "DEPLOYMENT_OPTION" "DEPLOYMENT_OPTION", :linked-account "LINKED_ACCOUNT", :region "REGION", :cache-engine "CACHE_ENGINE", "PLATFORM" "PLATFORM", :operating-system "OPERATING_SYSTEM", :usage-type-group "USAGE_TYPE_GROUP", "OPERATING_SYSTEM" "OPERATING_SYSTEM", :usage-type "USAGE_TYPE", "SCOPE" "SCOPE", :subscription-id "SUBSCRIPTION_ID", "CACHE_ENGINE" "CACHE_ENGINE", "USAGE_TYPE_GROUP" "USAGE_TYPE_GROUP", "DATABASE_ENGINE" "DATABASE_ENGINE", "REGION" "REGION", :deployment-option "DEPLOYMENT_OPTION", "AZ" "AZ", :legal-entity-name "LEGAL_ENTITY_NAME", :record-type "RECORD_TYPE", :purchase-type "PURCHASE_TYPE", :platform "PLATFORM", "OPERATION" "OPERATION", "USAGE_TYPE" "USAGE_TYPE"} input), :shape "Dimension"})

(clojure.core/defn- ser-expression [input] (clojure.core/cond-> #:http.request.field{:value [], :shape "Expression", :type "structure"} (clojure.core/contains? input :or) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-expressions (input :or)) #:http.request.field{:name "Or", :shape "Expressions"})) (clojure.core/contains? input :and) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-expressions (input :and)) #:http.request.field{:name "And", :shape "Expressions"})) (clojure.core/contains? input :not) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-expression (input :not)) #:http.request.field{:name "Not", :shape "Expression"})) (clojure.core/contains? input :dimensions) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-dimension-values (input :dimensions)) #:http.request.field{:name "Dimensions", :shape "DimensionValues"})) (clojure.core/contains? input :tags) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-tag-values (input :tags)) #:http.request.field{:name "Tags", :shape "TagValues"}))))

(clojure.core/defn- ser-payment-option [input] #:http.request.field{:value (clojure.core/get {:heavy-utilization "HEAVY_UTILIZATION", :no-upfront "NO_UPFRONT", "LIGHT_UTILIZATION" "LIGHT_UTILIZATION", :medium-utilization "MEDIUM_UTILIZATION", :all-upfront "ALL_UPFRONT", "NO_UPFRONT" "NO_UPFRONT", :light-utilization "LIGHT_UTILIZATION", :partial-upfront "PARTIAL_UPFRONT", "HEAVY_UTILIZATION" "HEAVY_UTILIZATION", "PARTIAL_UPFRONT" "PARTIAL_UPFRONT", "ALL_UPFRONT" "ALL_UPFRONT", "MEDIUM_UTILIZATION" "MEDIUM_UTILIZATION"} input), :shape "PaymentOption"})

(clojure.core/defn- ser-account-scope [input] #:http.request.field{:value (clojure.core/get {"PAYER" "PAYER", :payer "PAYER", "LINKED" "LINKED", :linked "LINKED"} input), :shape "AccountScope"})

(clojure.core/defn- ser-lookback-period-in-days [input] #:http.request.field{:value (clojure.core/get {"SEVEN_DAYS" "SEVEN_DAYS", :seven-days "SEVEN_DAYS", "THIRTY_DAYS" "THIRTY_DAYS", :thirty-days "THIRTY_DAYS", "SIXTY_DAYS" "SIXTY_DAYS", :sixty-days "SIXTY_DAYS"} input), :shape "LookbackPeriodInDays"})

(clojure.core/defn- ser-expressions [input] #:http.request.field{:value (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (clojure.core/merge (ser-expression coll) #:http.request.field{:shape "Expression"}))) input), :shape "Expressions", :type "list"})

(clojure.core/defn- ser-value [input] #:http.request.field{:value input, :shape "Value"})

(clojure.core/defn- ser-generic-string [input] #:http.request.field{:value input, :shape "GenericString"})

(clojure.core/defn- ser-values [input] #:http.request.field{:value (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (clojure.core/merge (ser-value coll) #:http.request.field{:shape "Value"}))) input), :shape "Values", :type "list"})

(clojure.core/defn- ser-service-specification [input] (clojure.core/cond-> #:http.request.field{:value [], :shape "ServiceSpecification", :type "structure"} (clojure.core/contains? input :ec-2-specification) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-ec-2-specification (input :ec-2-specification)) #:http.request.field{:name "EC2Specification", :shape "EC2Specification"}))))

(clojure.core/defn- ser-ec-2-specification [input] (clojure.core/cond-> #:http.request.field{:value [], :shape "EC2Specification", :type "structure"} (clojure.core/contains? input :offering-class) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-offering-class (input :offering-class)) #:http.request.field{:name "OfferingClass", :shape "OfferingClass"}))))

(clojure.core/defn- ser-group-definition-type [input] #:http.request.field{:value (clojure.core/get {"DIMENSION" "DIMENSION", :dimension "DIMENSION", "TAG" "TAG", :tag "TAG"} input), :shape "GroupDefinitionType"})

(clojure.core/defn- ser-metric-names [input] #:http.request.field{:value (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (clojure.core/merge (ser-metric-name coll) #:http.request.field{:shape "MetricName"}))) input), :shape "MetricNames", :type "list"})

(clojure.core/defn- ser-granularity [input] #:http.request.field{:value (clojure.core/get {"DAILY" "DAILY", :daily "DAILY", "MONTHLY" "MONTHLY", :monthly "MONTHLY"} input), :shape "Granularity"})

(clojure.core/defn- ser-metric-name [input] #:http.request.field{:value input, :shape "MetricName"})

(clojure.core/defn- ser-offering-class [input] #:http.request.field{:value (clojure.core/get {"STANDARD" "STANDARD", :standard "STANDARD", "CONVERTIBLE" "CONVERTIBLE", :convertible "CONVERTIBLE"} input), :shape "OfferingClass"})

(clojure.core/defn- ser-dimension-values [input] (clojure.core/cond-> #:http.request.field{:value [], :shape "DimensionValues", :type "structure"} (clojure.core/contains? input :key) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-dimension (input :key)) #:http.request.field{:name "Key", :shape "Dimension"})) (clojure.core/contains? input :values) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-values (input :values)) #:http.request.field{:name "Values", :shape "Values"}))))

(clojure.core/defn- ser-group-definition [input] (clojure.core/cond-> #:http.request.field{:value [], :shape "GroupDefinition", :type "structure"} (clojure.core/contains? input :type) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-group-definition-type (input :type)) #:http.request.field{:name "Type", :shape "GroupDefinitionType"})) (clojure.core/contains? input :key) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-group-definition-key (input :key)) #:http.request.field{:name "Key", :shape "GroupDefinitionKey"}))))

(clojure.core/defn- ser-next-page-token [input] #:http.request.field{:value input, :shape "NextPageToken"})

(clojure.core/defn- req-get-reservation-utilization-request [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (ser-date-interval (input :time-period)) #:http.request.field{:name "TimePeriod", :shape "DateInterval"})]} (clojure.core/contains? input :group-by) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-group-definitions (input :group-by)) #:http.request.field{:name "GroupBy", :shape "GroupDefinitions"})) (clojure.core/contains? input :granularity) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-granularity (input :granularity)) #:http.request.field{:name "Granularity", :shape "Granularity"})) (clojure.core/contains? input :filter) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-expression (input :filter)) #:http.request.field{:name "Filter", :shape "Expression"})) (clojure.core/contains? input :next-page-token) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-next-page-token (input :next-page-token)) #:http.request.field{:name "NextPageToken", :shape "NextPageToken"}))))

(clojure.core/defn- req-get-reservation-purchase-recommendation-request [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (ser-generic-string (input :service)) #:http.request.field{:name "Service", :shape "GenericString"})]} (clojure.core/contains? input :page-size) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-non-negative-integer (input :page-size)) #:http.request.field{:name "PageSize", :shape "NonNegativeInteger"})) (clojure.core/contains? input :term-in-years) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-term-in-years (input :term-in-years)) #:http.request.field{:name "TermInYears", :shape "TermInYears"})) (clojure.core/contains? input :payment-option) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-payment-option (input :payment-option)) #:http.request.field{:name "PaymentOption", :shape "PaymentOption"})) (clojure.core/contains? input :account-scope) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-account-scope (input :account-scope)) #:http.request.field{:name "AccountScope", :shape "AccountScope"})) (clojure.core/contains? input :lookback-period-in-days) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-lookback-period-in-days (input :lookback-period-in-days)) #:http.request.field{:name "LookbackPeriodInDays", :shape "LookbackPeriodInDays"})) (clojure.core/contains? input :service-specification) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-service-specification (input :service-specification)) #:http.request.field{:name "ServiceSpecification", :shape "ServiceSpecification"})) (clojure.core/contains? input :account-id) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-generic-string (input :account-id)) #:http.request.field{:name "AccountId", :shape "GenericString"})) (clojure.core/contains? input :next-page-token) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-next-page-token (input :next-page-token)) #:http.request.field{:name "NextPageToken", :shape "NextPageToken"}))))

(clojure.core/defn- req-get-dimension-values-request [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (ser-date-interval (input :time-period)) #:http.request.field{:name "TimePeriod", :shape "DateInterval"}) (clojure.core/into (ser-dimension (input :dimension)) #:http.request.field{:name "Dimension", :shape "Dimension"})]} (clojure.core/contains? input :search-string) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-search-string (input :search-string)) #:http.request.field{:name "SearchString", :shape "SearchString"})) (clojure.core/contains? input :context) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-context (input :context)) #:http.request.field{:name "Context", :shape "Context"})) (clojure.core/contains? input :next-page-token) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-next-page-token (input :next-page-token)) #:http.request.field{:name "NextPageToken", :shape "NextPageToken"}))))

(clojure.core/defn- req-get-cost-and-usage-request [input] (clojure.core/cond-> {} (clojure.core/contains? input :time-period) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-date-interval (input :time-period)) #:http.request.field{:name "TimePeriod", :shape "DateInterval"})) (clojure.core/contains? input :granularity) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-granularity (input :granularity)) #:http.request.field{:name "Granularity", :shape "Granularity"})) (clojure.core/contains? input :filter) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-expression (input :filter)) #:http.request.field{:name "Filter", :shape "Expression"})) (clojure.core/contains? input :metrics) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-metric-names (input :metrics)) #:http.request.field{:name "Metrics", :shape "MetricNames"})) (clojure.core/contains? input :group-by) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-group-definitions (input :group-by)) #:http.request.field{:name "GroupBy", :shape "GroupDefinitions"})) (clojure.core/contains? input :next-page-token) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-next-page-token (input :next-page-token)) #:http.request.field{:name "NextPageToken", :shape "NextPageToken"}))))

(clojure.core/defn- req-get-reservation-coverage-request [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (ser-date-interval (input :time-period)) #:http.request.field{:name "TimePeriod", :shape "DateInterval"})]} (clojure.core/contains? input :group-by) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-group-definitions (input :group-by)) #:http.request.field{:name "GroupBy", :shape "GroupDefinitions"})) (clojure.core/contains? input :granularity) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-granularity (input :granularity)) #:http.request.field{:name "Granularity", :shape "Granularity"})) (clojure.core/contains? input :filter) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-expression (input :filter)) #:http.request.field{:name "Filter", :shape "Expression"})) (clojure.core/contains? input :next-page-token) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-next-page-token (input :next-page-token)) #:http.request.field{:name "NextPageToken", :shape "NextPageToken"}))))

(clojure.core/defn- req-get-tags-request [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (ser-date-interval (input :time-period)) #:http.request.field{:name "TimePeriod", :shape "DateInterval"})]} (clojure.core/contains? input :search-string) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-search-string (input :search-string)) #:http.request.field{:name "SearchString", :shape "SearchString"})) (clojure.core/contains? input :tag-key) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-tag-key (input :tag-key)) #:http.request.field{:name "TagKey", :shape "TagKey"})) (clojure.core/contains? input :next-page-token) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-next-page-token (input :next-page-token)) #:http.request.field{:name "NextPageToken", :shape "NextPageToken"}))))

(clojure.spec.alpha/def :portkey.aws.ce.tag-values/key (clojure.spec.alpha/and :portkey.aws.ce/tag-key))
(clojure.spec.alpha/def :portkey.aws.ce/tag-values (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.ce.tag-values/key :portkey.aws.ce/values]))

(clojure.spec.alpha/def :portkey.aws.ce/group-definitions (clojure.spec.alpha/coll-of :portkey.aws.ce/group-definition))

(clojure.spec.alpha/def :portkey.aws.ce/attribute-type (clojure.spec.alpha/and clojure.core/string?))

(clojure.spec.alpha/def :portkey.aws.ce/non-negative-integer (clojure.spec.alpha/int-in 0 Long/MAX_VALUE))

(clojure.spec.alpha/def :portkey.aws.ce.get-reservation-utilization-request/time-period (clojure.spec.alpha/and :portkey.aws.ce/date-interval))
(clojure.spec.alpha/def :portkey.aws.ce.get-reservation-utilization-request/group-by (clojure.spec.alpha/and :portkey.aws.ce/group-definitions))
(clojure.spec.alpha/def :portkey.aws.ce.get-reservation-utilization-request/filter (clojure.spec.alpha/and :portkey.aws.ce/expression))
(clojure.spec.alpha/def :portkey.aws.ce/get-reservation-utilization-request (clojure.spec.alpha/keys :req-un [:portkey.aws.ce.get-reservation-utilization-request/time-period] :opt-un [:portkey.aws.ce.get-reservation-utilization-request/group-by :portkey.aws.ce/granularity :portkey.aws.ce.get-reservation-utilization-request/filter :portkey.aws.ce/next-page-token]))

(clojure.spec.alpha/def :portkey.aws.ce/search-string (clojure.spec.alpha/and clojure.core/string?))

(clojure.spec.alpha/def :portkey.aws.ce.get-reservation-utilization-response/total (clojure.spec.alpha/and :portkey.aws.ce/reservation-aggregates))
(clojure.spec.alpha/def :portkey.aws.ce/get-reservation-utilization-response (clojure.spec.alpha/keys :req-un [:portkey.aws.ce/utilizations-by-time] :opt-un [:portkey.aws.ce.get-reservation-utilization-response/total :portkey.aws.ce/next-page-token]))

(clojure.spec.alpha/def :portkey.aws.ce/estimated clojure.core/boolean?)

(clojure.spec.alpha/def :portkey.aws.ce/total-amortized-fee (clojure.spec.alpha/and clojure.core/string?))

(clojure.spec.alpha/def :portkey.aws.ce/total-potential-ri-savings (clojure.spec.alpha/and clojure.core/string?))

(clojure.spec.alpha/def :portkey.aws.ce/coverage (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.ce/coverage-hours]))

(clojure.spec.alpha/def :portkey.aws.ce/page-size clojure.core/int?)

(clojure.spec.alpha/def :portkey.aws.ce/term-in-years #{"ONE_YEAR" :three-years "THREE_YEARS" :one-year})

(clojure.spec.alpha/def :portkey.aws.ce.reservation-purchase-recommendation-detail/currency-code (clojure.spec.alpha/and :portkey.aws.ce/generic-string))
(clojure.spec.alpha/def :portkey.aws.ce.reservation-purchase-recommendation-detail/average-utilization (clojure.spec.alpha/and :portkey.aws.ce/generic-string))
(clojure.spec.alpha/def :portkey.aws.ce.reservation-purchase-recommendation-detail/estimated-break-even-in-months (clojure.spec.alpha/and :portkey.aws.ce/generic-string))
(clojure.spec.alpha/def :portkey.aws.ce.reservation-purchase-recommendation-detail/maximum-number-of-instances-used-per-hour (clojure.spec.alpha/and :portkey.aws.ce/generic-string))
(clojure.spec.alpha/def :portkey.aws.ce.reservation-purchase-recommendation-detail/estimated-reservation-cost-for-lookback-period (clojure.spec.alpha/and :portkey.aws.ce/generic-string))
(clojure.spec.alpha/def :portkey.aws.ce.reservation-purchase-recommendation-detail/recurring-standard-monthly-cost (clojure.spec.alpha/and :portkey.aws.ce/generic-string))
(clojure.spec.alpha/def :portkey.aws.ce.reservation-purchase-recommendation-detail/minimum-normalized-units-used-per-hour (clojure.spec.alpha/and :portkey.aws.ce/generic-string))
(clojure.spec.alpha/def :portkey.aws.ce.reservation-purchase-recommendation-detail/estimated-monthly-savings-amount (clojure.spec.alpha/and :portkey.aws.ce/generic-string))
(clojure.spec.alpha/def :portkey.aws.ce.reservation-purchase-recommendation-detail/upfront-cost (clojure.spec.alpha/and :portkey.aws.ce/generic-string))
(clojure.spec.alpha/def :portkey.aws.ce.reservation-purchase-recommendation-detail/average-number-of-instances-used-per-hour (clojure.spec.alpha/and :portkey.aws.ce/generic-string))
(clojure.spec.alpha/def :portkey.aws.ce.reservation-purchase-recommendation-detail/average-normalized-units-used-per-hour (clojure.spec.alpha/and :portkey.aws.ce/generic-string))
(clojure.spec.alpha/def :portkey.aws.ce.reservation-purchase-recommendation-detail/recommended-number-of-instances-to-purchase (clojure.spec.alpha/and :portkey.aws.ce/generic-string))
(clojure.spec.alpha/def :portkey.aws.ce.reservation-purchase-recommendation-detail/estimated-monthly-savings-percentage (clojure.spec.alpha/and :portkey.aws.ce/generic-string))
(clojure.spec.alpha/def :portkey.aws.ce.reservation-purchase-recommendation-detail/recommended-normalized-units-to-purchase (clojure.spec.alpha/and :portkey.aws.ce/generic-string))
(clojure.spec.alpha/def :portkey.aws.ce.reservation-purchase-recommendation-detail/estimated-monthly-on-demand-cost (clojure.spec.alpha/and :portkey.aws.ce/generic-string))
(clojure.spec.alpha/def :portkey.aws.ce.reservation-purchase-recommendation-detail/minimum-number-of-instances-used-per-hour (clojure.spec.alpha/and :portkey.aws.ce/generic-string))
(clojure.spec.alpha/def :portkey.aws.ce.reservation-purchase-recommendation-detail/maximum-normalized-units-used-per-hour (clojure.spec.alpha/and :portkey.aws.ce/generic-string))
(clojure.spec.alpha/def :portkey.aws.ce/reservation-purchase-recommendation-detail (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.ce.reservation-purchase-recommendation-detail/currency-code :portkey.aws.ce.reservation-purchase-recommendation-detail/average-utilization :portkey.aws.ce.reservation-purchase-recommendation-detail/estimated-break-even-in-months :portkey.aws.ce.reservation-purchase-recommendation-detail/maximum-number-of-instances-used-per-hour :portkey.aws.ce.reservation-purchase-recommendation-detail/estimated-reservation-cost-for-lookback-period :portkey.aws.ce/instance-details :portkey.aws.ce.reservation-purchase-recommendation-detail/recurring-standard-monthly-cost :portkey.aws.ce.reservation-purchase-recommendation-detail/minimum-normalized-units-used-per-hour :portkey.aws.ce.reservation-purchase-recommendation-detail/estimated-monthly-savings-amount :portkey.aws.ce.reservation-purchase-recommendation-detail/upfront-cost :portkey.aws.ce.reservation-purchase-recommendation-detail/average-number-of-instances-used-per-hour :portkey.aws.ce.reservation-purchase-recommendation-detail/average-normalized-units-used-per-hour :portkey.aws.ce.reservation-purchase-recommendation-detail/recommended-number-of-instances-to-purchase :portkey.aws.ce.reservation-purchase-recommendation-detail/estimated-monthly-savings-percentage :portkey.aws.ce.reservation-purchase-recommendation-detail/recommended-normalized-units-to-purchase :portkey.aws.ce.reservation-purchase-recommendation-detail/estimated-monthly-on-demand-cost :portkey.aws.ce.reservation-purchase-recommendation-detail/minimum-number-of-instances-used-per-hour :portkey.aws.ce.reservation-purchase-recommendation-detail/maximum-normalized-units-used-per-hour]))

(clojure.spec.alpha/def :portkey.aws.ce.get-reservation-purchase-recommendation-request/page-size (clojure.spec.alpha/and :portkey.aws.ce/non-negative-integer))
(clojure.spec.alpha/def :portkey.aws.ce.get-reservation-purchase-recommendation-request/account-id (clojure.spec.alpha/and :portkey.aws.ce/generic-string))
(clojure.spec.alpha/def :portkey.aws.ce.get-reservation-purchase-recommendation-request/service (clojure.spec.alpha/and :portkey.aws.ce/generic-string))
(clojure.spec.alpha/def :portkey.aws.ce/get-reservation-purchase-recommendation-request (clojure.spec.alpha/keys :req-un [:portkey.aws.ce.get-reservation-purchase-recommendation-request/service] :opt-un [:portkey.aws.ce.get-reservation-purchase-recommendation-request/page-size :portkey.aws.ce/term-in-years :portkey.aws.ce/payment-option :portkey.aws.ce/account-scope :portkey.aws.ce/lookback-period-in-days :portkey.aws.ce/service-specification :portkey.aws.ce.get-reservation-purchase-recommendation-request/account-id :portkey.aws.ce/next-page-token]))

(clojure.spec.alpha/def :portkey.aws.ce/unused-hours (clojure.spec.alpha/and clojure.core/string?))

(clojure.spec.alpha/def :portkey.aws.ce/year-month-day (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__27882__auto__] (clojure.core/re-matches #"\d{4}-\d{2}-\d{2}" s__27882__auto__))))

(clojure.spec.alpha/def :portkey.aws.ce/group-definition-key (clojure.spec.alpha/and clojure.core/string?))

(clojure.spec.alpha/def :portkey.aws.ce/reservation-group-value (clojure.spec.alpha/and clojure.core/string?))

(clojure.spec.alpha/def :portkey.aws.ce.request-changed-exception/message (clojure.spec.alpha/and :portkey.aws.ce/error-message))
(clojure.spec.alpha/def :portkey.aws.ce/request-changed-exception (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.ce.request-changed-exception/message]))

(clojure.spec.alpha/def :portkey.aws.ce.reservation-purchase-recommendation-summary/total-estimated-monthly-savings-amount (clojure.spec.alpha/and :portkey.aws.ce/generic-string))
(clojure.spec.alpha/def :portkey.aws.ce.reservation-purchase-recommendation-summary/total-estimated-monthly-savings-percentage (clojure.spec.alpha/and :portkey.aws.ce/generic-string))
(clojure.spec.alpha/def :portkey.aws.ce.reservation-purchase-recommendation-summary/currency-code (clojure.spec.alpha/and :portkey.aws.ce/generic-string))
(clojure.spec.alpha/def :portkey.aws.ce/reservation-purchase-recommendation-summary (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.ce.reservation-purchase-recommendation-summary/total-estimated-monthly-savings-amount :portkey.aws.ce.reservation-purchase-recommendation-summary/total-estimated-monthly-savings-percentage :portkey.aws.ce.reservation-purchase-recommendation-summary/currency-code]))

(clojure.spec.alpha/def :portkey.aws.ce/context #{"COST_AND_USAGE" "RESERVATIONS" :cost-and-usage :reservations})

(clojure.spec.alpha/def :portkey.aws.ce/instance-details (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.ce/ec-2-instance-details :portkey.aws.ce/rds-instance-details :portkey.aws.ce/redshift-instance-details :portkey.aws.ce/elasti-cache-instance-details :portkey.aws.ce/es-instance-details]))

(clojure.spec.alpha/def :portkey.aws.ce/reserved-hours (clojure.spec.alpha/and clojure.core/string?))

(clojure.spec.alpha/def :portkey.aws.ce/amortized-upfront-fee (clojure.spec.alpha/and clojure.core/string?))

(clojure.spec.alpha/def :portkey.aws.ce/utilizations-by-time (clojure.spec.alpha/coll-of :portkey.aws.ce/utilization-by-time))

(clojure.spec.alpha/def :portkey.aws.ce.ec-2-instance-details/family (clojure.spec.alpha/and :portkey.aws.ce/generic-string))
(clojure.spec.alpha/def :portkey.aws.ce.ec-2-instance-details/instance-type (clojure.spec.alpha/and :portkey.aws.ce/generic-string))
(clojure.spec.alpha/def :portkey.aws.ce.ec-2-instance-details/region (clojure.spec.alpha/and :portkey.aws.ce/generic-string))
(clojure.spec.alpha/def :portkey.aws.ce.ec-2-instance-details/availability-zone (clojure.spec.alpha/and :portkey.aws.ce/generic-string))
(clojure.spec.alpha/def :portkey.aws.ce.ec-2-instance-details/platform (clojure.spec.alpha/and :portkey.aws.ce/generic-string))
(clojure.spec.alpha/def :portkey.aws.ce.ec-2-instance-details/tenancy (clojure.spec.alpha/and :portkey.aws.ce/generic-string))
(clojure.spec.alpha/def :portkey.aws.ce.ec-2-instance-details/current-generation (clojure.spec.alpha/and :portkey.aws.ce/generic-boolean))
(clojure.spec.alpha/def :portkey.aws.ce.ec-2-instance-details/size-flex-eligible (clojure.spec.alpha/and :portkey.aws.ce/generic-boolean))
(clojure.spec.alpha/def :portkey.aws.ce/ec-2-instance-details (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.ce.ec-2-instance-details/family :portkey.aws.ce.ec-2-instance-details/instance-type :portkey.aws.ce.ec-2-instance-details/region :portkey.aws.ce.ec-2-instance-details/availability-zone :portkey.aws.ce.ec-2-instance-details/platform :portkey.aws.ce.ec-2-instance-details/tenancy :portkey.aws.ce.ec-2-instance-details/current-generation :portkey.aws.ce.ec-2-instance-details/size-flex-eligible]))

(clojure.spec.alpha/def :portkey.aws.ce/tag-key (clojure.spec.alpha/and clojure.core/string?))

(clojure.spec.alpha/def :portkey.aws.ce.date-interval/start (clojure.spec.alpha/and :portkey.aws.ce/year-month-day))
(clojure.spec.alpha/def :portkey.aws.ce.date-interval/end (clojure.spec.alpha/and :portkey.aws.ce/year-month-day))
(clojure.spec.alpha/def :portkey.aws.ce/date-interval (clojure.spec.alpha/keys :req-un [:portkey.aws.ce.date-interval/start :portkey.aws.ce.date-interval/end] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.ce/dimension #{"SUBSCRIPTION_ID" :instance-type-family :service :az :database-engine "LINKED_ACCOUNT" "LEGAL_ENTITY_NAME" "TENANCY" :tenancy "PURCHASE_TYPE" :operation "SERVICE" :instance-type "INSTANCE_TYPE_FAMILY" :scope "RECORD_TYPE" "INSTANCE_TYPE" "DEPLOYMENT_OPTION" :linked-account :region :cache-engine "PLATFORM" :operating-system :usage-type-group "OPERATING_SYSTEM" :usage-type "SCOPE" :subscription-id "CACHE_ENGINE" "USAGE_TYPE_GROUP" "DATABASE_ENGINE" "REGION" :deployment-option "AZ" :legal-entity-name :record-type :purchase-type :platform "OPERATION" "USAGE_TYPE"})

(clojure.spec.alpha/def :portkey.aws.ce/generic-boolean clojure.core/boolean?)

(clojure.spec.alpha/def :portkey.aws.ce/utilization-percentage (clojure.spec.alpha/and clojure.core/string?))

(clojure.spec.alpha/def :portkey.aws.ce.data-unavailable-exception/message (clojure.spec.alpha/and :portkey.aws.ce/error-message))
(clojure.spec.alpha/def :portkey.aws.ce/data-unavailable-exception (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.ce.data-unavailable-exception/message]))

(clojure.spec.alpha/def :portkey.aws.ce/reservation-purchase-recommendations (clojure.spec.alpha/coll-of :portkey.aws.ce/reservation-purchase-recommendation))

(clojure.spec.alpha/def :portkey.aws.ce.limit-exceeded-exception/message (clojure.spec.alpha/and :portkey.aws.ce/error-message))
(clojure.spec.alpha/def :portkey.aws.ce/limit-exceeded-exception (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.ce.limit-exceeded-exception/message]))

(clojure.spec.alpha/def :portkey.aws.ce/dimension-values-with-attributes-list (clojure.spec.alpha/coll-of :portkey.aws.ce/dimension-values-with-attributes))

(clojure.spec.alpha/def :portkey.aws.ce.expression/or (clojure.spec.alpha/and :portkey.aws.ce/expressions))
(clojure.spec.alpha/def :portkey.aws.ce.expression/and (clojure.spec.alpha/and :portkey.aws.ce/expressions))
(clojure.spec.alpha/def :portkey.aws.ce.expression/not (clojure.spec.alpha/and :portkey.aws.ce/expression))
(clojure.spec.alpha/def :portkey.aws.ce.expression/dimensions (clojure.spec.alpha/and :portkey.aws.ce/dimension-values))
(clojure.spec.alpha/def :portkey.aws.ce.expression/tags (clojure.spec.alpha/and :portkey.aws.ce/tag-values))
(clojure.spec.alpha/def :portkey.aws.ce/expression (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.ce.expression/or :portkey.aws.ce.expression/and :portkey.aws.ce.expression/not :portkey.aws.ce.expression/dimensions :portkey.aws.ce.expression/tags]))

(clojure.spec.alpha/def :portkey.aws.ce.redshift-instance-details/family (clojure.spec.alpha/and :portkey.aws.ce/generic-string))
(clojure.spec.alpha/def :portkey.aws.ce.redshift-instance-details/node-type (clojure.spec.alpha/and :portkey.aws.ce/generic-string))
(clojure.spec.alpha/def :portkey.aws.ce.redshift-instance-details/region (clojure.spec.alpha/and :portkey.aws.ce/generic-string))
(clojure.spec.alpha/def :portkey.aws.ce.redshift-instance-details/current-generation (clojure.spec.alpha/and :portkey.aws.ce/generic-boolean))
(clojure.spec.alpha/def :portkey.aws.ce.redshift-instance-details/size-flex-eligible (clojure.spec.alpha/and :portkey.aws.ce/generic-boolean))
(clojure.spec.alpha/def :portkey.aws.ce/redshift-instance-details (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.ce.redshift-instance-details/family :portkey.aws.ce.redshift-instance-details/node-type :portkey.aws.ce.redshift-instance-details/region :portkey.aws.ce.redshift-instance-details/current-generation :portkey.aws.ce.redshift-instance-details/size-flex-eligible]))

(clojure.spec.alpha/def :portkey.aws.ce/payment-option #{:heavy-utilization :no-upfront "LIGHT_UTILIZATION" :medium-utilization :all-upfront "NO_UPFRONT" :light-utilization :partial-upfront "HEAVY_UTILIZATION" "PARTIAL_UPFRONT" "ALL_UPFRONT" "MEDIUM_UTILIZATION"})

(clojure.spec.alpha/def :portkey.aws.ce/metric-unit (clojure.spec.alpha/and clojure.core/string?))

(clojure.spec.alpha/def :portkey.aws.ce/account-scope #{:linked :payer "PAYER" "LINKED"})

(clojure.spec.alpha/def :portkey.aws.ce/on-demand-cost-of-ri-hours-used (clojure.spec.alpha/and clojure.core/string?))

(clojure.spec.alpha/def :portkey.aws.ce/lookback-period-in-days #{:thirty-days :seven-days "SIXTY_DAYS" "SEVEN_DAYS" "THIRTY_DAYS" :sixty-days})

(clojure.spec.alpha/def :portkey.aws.ce.reservation-utilization-group/key (clojure.spec.alpha/and :portkey.aws.ce/reservation-group-key))
(clojure.spec.alpha/def :portkey.aws.ce.reservation-utilization-group/value (clojure.spec.alpha/and :portkey.aws.ce/reservation-group-value))
(clojure.spec.alpha/def :portkey.aws.ce.reservation-utilization-group/utilization (clojure.spec.alpha/and :portkey.aws.ce/reservation-aggregates))
(clojure.spec.alpha/def :portkey.aws.ce/reservation-utilization-group (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.ce.reservation-utilization-group/key :portkey.aws.ce.reservation-utilization-group/value :portkey.aws.ce/attributes :portkey.aws.ce.reservation-utilization-group/utilization]))

(clojure.spec.alpha/def :portkey.aws.ce/error-message (clojure.spec.alpha/and clojure.core/string?))

(clojure.spec.alpha/def :portkey.aws.ce.invalid-next-token-exception/message (clojure.spec.alpha/and :portkey.aws.ce/error-message))
(clojure.spec.alpha/def :portkey.aws.ce/invalid-next-token-exception (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.ce.invalid-next-token-exception/message]))

(clojure.spec.alpha/def :portkey.aws.ce/reservation-coverage-group (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.ce/attributes :portkey.aws.ce/coverage]))

(clojure.spec.alpha/def :portkey.aws.ce/reservation-aggregates (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.ce/total-amortized-fee :portkey.aws.ce/total-potential-ri-savings :portkey.aws.ce/unused-hours :portkey.aws.ce/amortized-upfront-fee :portkey.aws.ce/utilization-percentage :portkey.aws.ce/on-demand-cost-of-ri-hours-used :portkey.aws.ce/net-ri-savings :portkey.aws.ce/total-actual-hours :portkey.aws.ce/amortized-recurring-fee :portkey.aws.ce/purchased-hours]))

(clojure.spec.alpha/def :portkey.aws.ce/key (clojure.spec.alpha/and clojure.core/string?))

(clojure.spec.alpha/def :portkey.aws.ce/attributes (clojure.spec.alpha/map-of :portkey.aws.ce/attribute-type :portkey.aws.ce/attribute-value))

(clojure.spec.alpha/def :portkey.aws.ce/reservation-group-key (clojure.spec.alpha/and clojure.core/string?))

(clojure.spec.alpha/def :portkey.aws.ce.get-dimension-values-request/time-period (clojure.spec.alpha/and :portkey.aws.ce/date-interval))
(clojure.spec.alpha/def :portkey.aws.ce/get-dimension-values-request (clojure.spec.alpha/keys :req-un [:portkey.aws.ce.get-dimension-values-request/time-period :portkey.aws.ce/dimension] :opt-un [:portkey.aws.ce/search-string :portkey.aws.ce/context :portkey.aws.ce/next-page-token]))

(clojure.spec.alpha/def :portkey.aws.ce/tag-list (clojure.spec.alpha/coll-of :portkey.aws.ce/entity))

(clojure.spec.alpha/def :portkey.aws.ce.coverage-by-time/time-period (clojure.spec.alpha/and :portkey.aws.ce/date-interval))
(clojure.spec.alpha/def :portkey.aws.ce.coverage-by-time/groups (clojure.spec.alpha/and :portkey.aws.ce/reservation-coverage-groups))
(clojure.spec.alpha/def :portkey.aws.ce.coverage-by-time/total (clojure.spec.alpha/and :portkey.aws.ce/coverage))
(clojure.spec.alpha/def :portkey.aws.ce/coverage-by-time (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.ce.coverage-by-time/time-period :portkey.aws.ce.coverage-by-time/groups :portkey.aws.ce.coverage-by-time/total]))

(clojure.spec.alpha/def :portkey.aws.ce.get-cost-and-usage-request/time-period (clojure.spec.alpha/and :portkey.aws.ce/date-interval))
(clojure.spec.alpha/def :portkey.aws.ce.get-cost-and-usage-request/filter (clojure.spec.alpha/and :portkey.aws.ce/expression))
(clojure.spec.alpha/def :portkey.aws.ce.get-cost-and-usage-request/metrics (clojure.spec.alpha/and :portkey.aws.ce/metric-names))
(clojure.spec.alpha/def :portkey.aws.ce.get-cost-and-usage-request/group-by (clojure.spec.alpha/and :portkey.aws.ce/group-definitions))
(clojure.spec.alpha/def :portkey.aws.ce/get-cost-and-usage-request (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.ce.get-cost-and-usage-request/time-period :portkey.aws.ce/granularity :portkey.aws.ce.get-cost-and-usage-request/filter :portkey.aws.ce.get-cost-and-usage-request/metrics :portkey.aws.ce.get-cost-and-usage-request/group-by :portkey.aws.ce/next-page-token]))

(clojure.spec.alpha/def :portkey.aws.ce/attribute-value (clojure.spec.alpha/and clojure.core/string?))

(clojure.spec.alpha/def :portkey.aws.ce.es-instance-details/instance-class (clojure.spec.alpha/and :portkey.aws.ce/generic-string))
(clojure.spec.alpha/def :portkey.aws.ce.es-instance-details/instance-size (clojure.spec.alpha/and :portkey.aws.ce/generic-string))
(clojure.spec.alpha/def :portkey.aws.ce.es-instance-details/region (clojure.spec.alpha/and :portkey.aws.ce/generic-string))
(clojure.spec.alpha/def :portkey.aws.ce.es-instance-details/current-generation (clojure.spec.alpha/and :portkey.aws.ce/generic-boolean))
(clojure.spec.alpha/def :portkey.aws.ce.es-instance-details/size-flex-eligible (clojure.spec.alpha/and :portkey.aws.ce/generic-boolean))
(clojure.spec.alpha/def :portkey.aws.ce/es-instance-details (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.ce.es-instance-details/instance-class :portkey.aws.ce.es-instance-details/instance-size :portkey.aws.ce.es-instance-details/region :portkey.aws.ce.es-instance-details/current-generation :portkey.aws.ce.es-instance-details/size-flex-eligible]))

(clojure.spec.alpha/def :portkey.aws.ce.bill-expiration-exception/message (clojure.spec.alpha/and :portkey.aws.ce/error-message))
(clojure.spec.alpha/def :portkey.aws.ce/bill-expiration-exception (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.ce.bill-expiration-exception/message]))

(clojure.spec.alpha/def :portkey.aws.ce/expressions (clojure.spec.alpha/coll-of :portkey.aws.ce/expression))

(clojure.spec.alpha/def :portkey.aws.ce/value (clojure.spec.alpha/and clojure.core/string?))

(clojure.spec.alpha/def :portkey.aws.ce/net-ri-savings (clojure.spec.alpha/and clojure.core/string?))

(clojure.spec.alpha/def :portkey.aws.ce.get-reservation-coverage-request/time-period (clojure.spec.alpha/and :portkey.aws.ce/date-interval))
(clojure.spec.alpha/def :portkey.aws.ce.get-reservation-coverage-request/group-by (clojure.spec.alpha/and :portkey.aws.ce/group-definitions))
(clojure.spec.alpha/def :portkey.aws.ce.get-reservation-coverage-request/filter (clojure.spec.alpha/and :portkey.aws.ce/expression))
(clojure.spec.alpha/def :portkey.aws.ce/get-reservation-coverage-request (clojure.spec.alpha/keys :req-un [:portkey.aws.ce.get-reservation-coverage-request/time-period] :opt-un [:portkey.aws.ce.get-reservation-coverage-request/group-by :portkey.aws.ce/granularity :portkey.aws.ce.get-reservation-coverage-request/filter :portkey.aws.ce/next-page-token]))

(clojure.spec.alpha/def :portkey.aws.ce/total-actual-hours (clojure.spec.alpha/and clojure.core/string?))

(clojure.spec.alpha/def :portkey.aws.ce/reservation-utilization-groups (clojure.spec.alpha/coll-of :portkey.aws.ce/reservation-utilization-group))

(clojure.spec.alpha/def :portkey.aws.ce.utilization-by-time/time-period (clojure.spec.alpha/and :portkey.aws.ce/date-interval))
(clojure.spec.alpha/def :portkey.aws.ce.utilization-by-time/groups (clojure.spec.alpha/and :portkey.aws.ce/reservation-utilization-groups))
(clojure.spec.alpha/def :portkey.aws.ce.utilization-by-time/total (clojure.spec.alpha/and :portkey.aws.ce/reservation-aggregates))
(clojure.spec.alpha/def :portkey.aws.ce/utilization-by-time (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.ce.utilization-by-time/time-period :portkey.aws.ce.utilization-by-time/groups :portkey.aws.ce.utilization-by-time/total]))

(clojure.spec.alpha/def :portkey.aws.ce/generic-string (clojure.spec.alpha/and clojure.core/string?))

(clojure.spec.alpha/def :portkey.aws.ce/coverage-hours-percentage (clojure.spec.alpha/and clojure.core/string?))

(clojure.spec.alpha/def :portkey.aws.ce.reservation-purchase-recommendation/recommendation-details (clojure.spec.alpha/and :portkey.aws.ce/reservation-purchase-recommendation-details))
(clojure.spec.alpha/def :portkey.aws.ce.reservation-purchase-recommendation/recommendation-summary (clojure.spec.alpha/and :portkey.aws.ce/reservation-purchase-recommendation-summary))
(clojure.spec.alpha/def :portkey.aws.ce/reservation-purchase-recommendation (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.ce/account-scope :portkey.aws.ce/lookback-period-in-days :portkey.aws.ce/term-in-years :portkey.aws.ce/payment-option :portkey.aws.ce/service-specification :portkey.aws.ce.reservation-purchase-recommendation/recommendation-details :portkey.aws.ce.reservation-purchase-recommendation/recommendation-summary]))

(clojure.spec.alpha/def :portkey.aws.ce.get-tags-response/tags (clojure.spec.alpha/and :portkey.aws.ce/tag-list))
(clojure.spec.alpha/def :portkey.aws.ce.get-tags-response/return-size (clojure.spec.alpha/and :portkey.aws.ce/page-size))
(clojure.spec.alpha/def :portkey.aws.ce.get-tags-response/total-size (clojure.spec.alpha/and :portkey.aws.ce/page-size))
(clojure.spec.alpha/def :portkey.aws.ce/get-tags-response (clojure.spec.alpha/keys :req-un [:portkey.aws.ce.get-tags-response/tags :portkey.aws.ce.get-tags-response/return-size :portkey.aws.ce.get-tags-response/total-size] :opt-un [:portkey.aws.ce/next-page-token]))

(clojure.spec.alpha/def :portkey.aws.ce/values (clojure.spec.alpha/coll-of :portkey.aws.ce/value))

(clojure.spec.alpha/def :portkey.aws.ce.reservation-purchase-recommendation-metadata/recommendation-id (clojure.spec.alpha/and :portkey.aws.ce/generic-string))
(clojure.spec.alpha/def :portkey.aws.ce.reservation-purchase-recommendation-metadata/generation-timestamp (clojure.spec.alpha/and :portkey.aws.ce/generic-string))
(clojure.spec.alpha/def :portkey.aws.ce/reservation-purchase-recommendation-metadata (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.ce.reservation-purchase-recommendation-metadata/recommendation-id :portkey.aws.ce.reservation-purchase-recommendation-metadata/generation-timestamp]))

(clojure.spec.alpha/def :portkey.aws.ce/service-specification (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.ce/ec-2-specification]))

(clojure.spec.alpha/def :portkey.aws.ce/reservation-purchase-recommendation-details (clojure.spec.alpha/coll-of :portkey.aws.ce/reservation-purchase-recommendation-detail))

(clojure.spec.alpha/def :portkey.aws.ce.get-reservation-coverage-response/total (clojure.spec.alpha/and :portkey.aws.ce/coverage))
(clojure.spec.alpha/def :portkey.aws.ce/get-reservation-coverage-response (clojure.spec.alpha/keys :req-un [:portkey.aws.ce/coverages-by-time] :opt-un [:portkey.aws.ce.get-reservation-coverage-response/total :portkey.aws.ce/next-page-token]))

(clojure.spec.alpha/def :portkey.aws.ce/coverages-by-time (clojure.spec.alpha/coll-of :portkey.aws.ce/coverage-by-time))

(clojure.spec.alpha/def :portkey.aws.ce.elasti-cache-instance-details/family (clojure.spec.alpha/and :portkey.aws.ce/generic-string))
(clojure.spec.alpha/def :portkey.aws.ce.elasti-cache-instance-details/node-type (clojure.spec.alpha/and :portkey.aws.ce/generic-string))
(clojure.spec.alpha/def :portkey.aws.ce.elasti-cache-instance-details/region (clojure.spec.alpha/and :portkey.aws.ce/generic-string))
(clojure.spec.alpha/def :portkey.aws.ce.elasti-cache-instance-details/product-description (clojure.spec.alpha/and :portkey.aws.ce/generic-string))
(clojure.spec.alpha/def :portkey.aws.ce.elasti-cache-instance-details/current-generation (clojure.spec.alpha/and :portkey.aws.ce/generic-boolean))
(clojure.spec.alpha/def :portkey.aws.ce.elasti-cache-instance-details/size-flex-eligible (clojure.spec.alpha/and :portkey.aws.ce/generic-boolean))
(clojure.spec.alpha/def :portkey.aws.ce/elasti-cache-instance-details (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.ce.elasti-cache-instance-details/family :portkey.aws.ce.elasti-cache-instance-details/node-type :portkey.aws.ce.elasti-cache-instance-details/region :portkey.aws.ce.elasti-cache-instance-details/product-description :portkey.aws.ce.elasti-cache-instance-details/current-generation :portkey.aws.ce.elasti-cache-instance-details/size-flex-eligible]))

(clojure.spec.alpha/def :portkey.aws.ce.get-reservation-purchase-recommendation-response/metadata (clojure.spec.alpha/and :portkey.aws.ce/reservation-purchase-recommendation-metadata))
(clojure.spec.alpha/def :portkey.aws.ce.get-reservation-purchase-recommendation-response/recommendations (clojure.spec.alpha/and :portkey.aws.ce/reservation-purchase-recommendations))
(clojure.spec.alpha/def :portkey.aws.ce/get-reservation-purchase-recommendation-response (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.ce.get-reservation-purchase-recommendation-response/metadata :portkey.aws.ce.get-reservation-purchase-recommendation-response/recommendations :portkey.aws.ce/next-page-token]))

(clojure.spec.alpha/def :portkey.aws.ce/dimension-values-with-attributes (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.ce/value :portkey.aws.ce/attributes]))

(clojure.spec.alpha/def :portkey.aws.ce/groups (clojure.spec.alpha/coll-of :portkey.aws.ce/group))

(clojure.spec.alpha/def :portkey.aws.ce/ec-2-specification (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.ce/offering-class]))

(clojure.spec.alpha/def :portkey.aws.ce/group-definition-type #{"TAG" :dimension :tag "DIMENSION"})

(clojure.spec.alpha/def :portkey.aws.ce/coverage-hours (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.ce/on-demand-hours :portkey.aws.ce/reserved-hours :portkey.aws.ce/total-running-hours :portkey.aws.ce/coverage-hours-percentage]))

(clojure.spec.alpha/def :portkey.aws.ce.get-dimension-values-response/dimension-values (clojure.spec.alpha/and :portkey.aws.ce/dimension-values-with-attributes-list))
(clojure.spec.alpha/def :portkey.aws.ce.get-dimension-values-response/return-size (clojure.spec.alpha/and :portkey.aws.ce/page-size))
(clojure.spec.alpha/def :portkey.aws.ce.get-dimension-values-response/total-size (clojure.spec.alpha/and :portkey.aws.ce/page-size))
(clojure.spec.alpha/def :portkey.aws.ce/get-dimension-values-response (clojure.spec.alpha/keys :req-un [:portkey.aws.ce.get-dimension-values-response/dimension-values :portkey.aws.ce.get-dimension-values-response/return-size :portkey.aws.ce.get-dimension-values-response/total-size] :opt-un [:portkey.aws.ce/next-page-token]))

(clojure.spec.alpha/def :portkey.aws.ce.metric-value/amount (clojure.spec.alpha/and :portkey.aws.ce/metric-amount))
(clojure.spec.alpha/def :portkey.aws.ce.metric-value/unit (clojure.spec.alpha/and :portkey.aws.ce/metric-unit))
(clojure.spec.alpha/def :portkey.aws.ce/metric-value (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.ce.metric-value/amount :portkey.aws.ce.metric-value/unit]))

(clojure.spec.alpha/def :portkey.aws.ce/total-running-hours (clojure.spec.alpha/and clojure.core/string?))

(clojure.spec.alpha/def :portkey.aws.ce/metric-names (clojure.spec.alpha/coll-of :portkey.aws.ce/metric-name))

(clojure.spec.alpha/def :portkey.aws.ce/granularity #{:daily :monthly "MONTHLY" "DAILY"})

(clojure.spec.alpha/def :portkey.aws.ce.get-tags-request/time-period (clojure.spec.alpha/and :portkey.aws.ce/date-interval))
(clojure.spec.alpha/def :portkey.aws.ce/get-tags-request (clojure.spec.alpha/keys :req-un [:portkey.aws.ce.get-tags-request/time-period] :opt-un [:portkey.aws.ce/search-string :portkey.aws.ce/tag-key :portkey.aws.ce/next-page-token]))

(clojure.spec.alpha/def :portkey.aws.ce/results-by-time (clojure.spec.alpha/coll-of :portkey.aws.ce/result-by-time))

(clojure.spec.alpha/def :portkey.aws.ce/amortized-recurring-fee (clojure.spec.alpha/and clojure.core/string?))

(clojure.spec.alpha/def :portkey.aws.ce/entity (clojure.spec.alpha/and clojure.core/string?))

(clojure.spec.alpha/def :portkey.aws.ce/metric-name (clojure.spec.alpha/and clojure.core/string?))

(clojure.spec.alpha/def :portkey.aws.ce/offering-class #{"STANDARD" :standard :convertible "CONVERTIBLE"})

(clojure.spec.alpha/def :portkey.aws.ce/reservation-coverage-groups (clojure.spec.alpha/coll-of :portkey.aws.ce/reservation-coverage-group))

(clojure.spec.alpha/def :portkey.aws.ce.dimension-values/key (clojure.spec.alpha/and :portkey.aws.ce/dimension))
(clojure.spec.alpha/def :portkey.aws.ce/dimension-values (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.ce.dimension-values/key :portkey.aws.ce/values]))

(clojure.spec.alpha/def :portkey.aws.ce/keys (clojure.spec.alpha/coll-of :portkey.aws.ce/key))

(clojure.spec.alpha/def :portkey.aws.ce/group (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.ce/keys :portkey.aws.ce/metrics]))

(clojure.spec.alpha/def :portkey.aws.ce.rds-instance-details/database-engine (clojure.spec.alpha/and :portkey.aws.ce/generic-string))
(clojure.spec.alpha/def :portkey.aws.ce.rds-instance-details/database-edition (clojure.spec.alpha/and :portkey.aws.ce/generic-string))
(clojure.spec.alpha/def :portkey.aws.ce.rds-instance-details/instance-type (clojure.spec.alpha/and :portkey.aws.ce/generic-string))
(clojure.spec.alpha/def :portkey.aws.ce.rds-instance-details/license-model (clojure.spec.alpha/and :portkey.aws.ce/generic-string))
(clojure.spec.alpha/def :portkey.aws.ce.rds-instance-details/family (clojure.spec.alpha/and :portkey.aws.ce/generic-string))
(clojure.spec.alpha/def :portkey.aws.ce.rds-instance-details/deployment-option (clojure.spec.alpha/and :portkey.aws.ce/generic-string))
(clojure.spec.alpha/def :portkey.aws.ce.rds-instance-details/size-flex-eligible (clojure.spec.alpha/and :portkey.aws.ce/generic-boolean))
(clojure.spec.alpha/def :portkey.aws.ce.rds-instance-details/current-generation (clojure.spec.alpha/and :portkey.aws.ce/generic-boolean))
(clojure.spec.alpha/def :portkey.aws.ce.rds-instance-details/region (clojure.spec.alpha/and :portkey.aws.ce/generic-string))
(clojure.spec.alpha/def :portkey.aws.ce/rds-instance-details (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.ce.rds-instance-details/database-engine :portkey.aws.ce.rds-instance-details/database-edition :portkey.aws.ce.rds-instance-details/instance-type :portkey.aws.ce.rds-instance-details/license-model :portkey.aws.ce.rds-instance-details/family :portkey.aws.ce.rds-instance-details/deployment-option :portkey.aws.ce.rds-instance-details/size-flex-eligible :portkey.aws.ce.rds-instance-details/current-generation :portkey.aws.ce.rds-instance-details/region]))

(clojure.spec.alpha/def :portkey.aws.ce.group-definition/type (clojure.spec.alpha/and :portkey.aws.ce/group-definition-type))
(clojure.spec.alpha/def :portkey.aws.ce.group-definition/key (clojure.spec.alpha/and :portkey.aws.ce/group-definition-key))
(clojure.spec.alpha/def :portkey.aws.ce/group-definition (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.ce.group-definition/type :portkey.aws.ce.group-definition/key]))

(clojure.spec.alpha/def :portkey.aws.ce/purchased-hours (clojure.spec.alpha/and clojure.core/string?))

(clojure.spec.alpha/def :portkey.aws.ce/metric-amount (clojure.spec.alpha/and clojure.core/string?))

(clojure.spec.alpha/def :portkey.aws.ce/next-page-token (clojure.spec.alpha/and clojure.core/string?))

(clojure.spec.alpha/def :portkey.aws.ce/get-cost-and-usage-response (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.ce/next-page-token :portkey.aws.ce/group-definitions :portkey.aws.ce/results-by-time]))

(clojure.spec.alpha/def :portkey.aws.ce.result-by-time/time-period (clojure.spec.alpha/and :portkey.aws.ce/date-interval))
(clojure.spec.alpha/def :portkey.aws.ce.result-by-time/total (clojure.spec.alpha/and :portkey.aws.ce/metrics))
(clojure.spec.alpha/def :portkey.aws.ce/result-by-time (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.ce.result-by-time/time-period :portkey.aws.ce.result-by-time/total :portkey.aws.ce/groups :portkey.aws.ce/estimated]))

(clojure.spec.alpha/def :portkey.aws.ce/on-demand-hours (clojure.spec.alpha/and clojure.core/string?))

(clojure.spec.alpha/def :portkey.aws.ce/metrics (clojure.spec.alpha/map-of :portkey.aws.ce/metric-name :portkey.aws.ce/metric-value))

(clojure.core/defn get-cost-and-usage ([] (get-cost-and-usage {})) ([get-cost-and-usage-requestinput] (clojure.core/let [request-function-result__28521__auto__ (req-get-cost-and-usage-request get-cost-and-usage-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__28521__auto__ {:http.request.configuration/endpoints portkey.aws.ce/endpoints, :http.request.configuration/target-prefix "AWSInsightsIndexService", :http.request.spec/output-spec :portkey.aws.ce/get-cost-and-usage-response, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2017-10-25", :http.request.configuration/service-id "Cost Explorer", :http.request.spec/input-spec :portkey.aws.ce/get-cost-and-usage-request, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/action "GetCostAndUsage", :http.request.spec/error-spec {"LimitExceededException" :portkey.aws.ce/limit-exceeded-exception, "BillExpirationException" :portkey.aws.ce/bill-expiration-exception, "DataUnavailableException" :portkey.aws.ce/data-unavailable-exception, "InvalidNextTokenException" :portkey.aws.ce/invalid-next-token-exception, "RequestChangedException" :portkey.aws.ce/request-changed-exception}})))))
(clojure.spec.alpha/fdef get-cost-and-usage :args (clojure.spec.alpha/? :portkey.aws.ce/get-cost-and-usage-request) :ret (clojure.spec.alpha/and :portkey.aws.ce/get-cost-and-usage-response))

(clojure.core/defn get-dimension-values ([get-dimension-values-requestinput] (clojure.core/let [request-function-result__28521__auto__ (req-get-dimension-values-request get-dimension-values-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__28521__auto__ {:http.request.configuration/endpoints portkey.aws.ce/endpoints, :http.request.configuration/target-prefix "AWSInsightsIndexService", :http.request.spec/output-spec :portkey.aws.ce/get-dimension-values-response, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2017-10-25", :http.request.configuration/service-id "Cost Explorer", :http.request.spec/input-spec :portkey.aws.ce/get-dimension-values-request, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/action "GetDimensionValues", :http.request.spec/error-spec {"LimitExceededException" :portkey.aws.ce/limit-exceeded-exception, "BillExpirationException" :portkey.aws.ce/bill-expiration-exception, "DataUnavailableException" :portkey.aws.ce/data-unavailable-exception, "InvalidNextTokenException" :portkey.aws.ce/invalid-next-token-exception, "RequestChangedException" :portkey.aws.ce/request-changed-exception}})))))
(clojure.spec.alpha/fdef get-dimension-values :args (clojure.spec.alpha/tuple :portkey.aws.ce/get-dimension-values-request) :ret (clojure.spec.alpha/and :portkey.aws.ce/get-dimension-values-response))

(clojure.core/defn get-reservation-coverage ([get-reservation-coverage-requestinput] (clojure.core/let [request-function-result__28521__auto__ (req-get-reservation-coverage-request get-reservation-coverage-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__28521__auto__ {:http.request.configuration/endpoints portkey.aws.ce/endpoints, :http.request.configuration/target-prefix "AWSInsightsIndexService", :http.request.spec/output-spec :portkey.aws.ce/get-reservation-coverage-response, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2017-10-25", :http.request.configuration/service-id "Cost Explorer", :http.request.spec/input-spec :portkey.aws.ce/get-reservation-coverage-request, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/action "GetReservationCoverage", :http.request.spec/error-spec {"LimitExceededException" :portkey.aws.ce/limit-exceeded-exception, "DataUnavailableException" :portkey.aws.ce/data-unavailable-exception, "InvalidNextTokenException" :portkey.aws.ce/invalid-next-token-exception}})))))
(clojure.spec.alpha/fdef get-reservation-coverage :args (clojure.spec.alpha/tuple :portkey.aws.ce/get-reservation-coverage-request) :ret (clojure.spec.alpha/and :portkey.aws.ce/get-reservation-coverage-response))

(clojure.core/defn get-reservation-purchase-recommendation ([get-reservation-purchase-recommendation-requestinput] (clojure.core/let [request-function-result__28521__auto__ (req-get-reservation-purchase-recommendation-request get-reservation-purchase-recommendation-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__28521__auto__ {:http.request.configuration/endpoints portkey.aws.ce/endpoints, :http.request.configuration/target-prefix "AWSInsightsIndexService", :http.request.spec/output-spec :portkey.aws.ce/get-reservation-purchase-recommendation-response, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2017-10-25", :http.request.configuration/service-id "Cost Explorer", :http.request.spec/input-spec :portkey.aws.ce/get-reservation-purchase-recommendation-request, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/action "GetReservationPurchaseRecommendation", :http.request.spec/error-spec {"LimitExceededException" :portkey.aws.ce/limit-exceeded-exception, "DataUnavailableException" :portkey.aws.ce/data-unavailable-exception, "InvalidNextTokenException" :portkey.aws.ce/invalid-next-token-exception}})))))
(clojure.spec.alpha/fdef get-reservation-purchase-recommendation :args (clojure.spec.alpha/tuple :portkey.aws.ce/get-reservation-purchase-recommendation-request) :ret (clojure.spec.alpha/and :portkey.aws.ce/get-reservation-purchase-recommendation-response))

(clojure.core/defn get-reservation-utilization ([get-reservation-utilization-requestinput] (clojure.core/let [request-function-result__28521__auto__ (req-get-reservation-utilization-request get-reservation-utilization-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__28521__auto__ {:http.request.configuration/endpoints portkey.aws.ce/endpoints, :http.request.configuration/target-prefix "AWSInsightsIndexService", :http.request.spec/output-spec :portkey.aws.ce/get-reservation-utilization-response, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2017-10-25", :http.request.configuration/service-id "Cost Explorer", :http.request.spec/input-spec :portkey.aws.ce/get-reservation-utilization-request, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/action "GetReservationUtilization", :http.request.spec/error-spec {"LimitExceededException" :portkey.aws.ce/limit-exceeded-exception, "DataUnavailableException" :portkey.aws.ce/data-unavailable-exception, "InvalidNextTokenException" :portkey.aws.ce/invalid-next-token-exception}})))))
(clojure.spec.alpha/fdef get-reservation-utilization :args (clojure.spec.alpha/tuple :portkey.aws.ce/get-reservation-utilization-request) :ret (clojure.spec.alpha/and :portkey.aws.ce/get-reservation-utilization-response))

(clojure.core/defn get-tags ([get-tags-requestinput] (clojure.core/let [request-function-result__28521__auto__ (req-get-tags-request get-tags-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__28521__auto__ {:http.request.configuration/endpoints portkey.aws.ce/endpoints, :http.request.configuration/target-prefix "AWSInsightsIndexService", :http.request.spec/output-spec :portkey.aws.ce/get-tags-response, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2017-10-25", :http.request.configuration/service-id "Cost Explorer", :http.request.spec/input-spec :portkey.aws.ce/get-tags-request, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/action "GetTags", :http.request.spec/error-spec {"LimitExceededException" :portkey.aws.ce/limit-exceeded-exception, "BillExpirationException" :portkey.aws.ce/bill-expiration-exception, "DataUnavailableException" :portkey.aws.ce/data-unavailable-exception, "InvalidNextTokenException" :portkey.aws.ce/invalid-next-token-exception, "RequestChangedException" :portkey.aws.ce/request-changed-exception}})))))
(clojure.spec.alpha/fdef get-tags :args (clojure.spec.alpha/tuple :portkey.aws.ce/get-tags-request) :ret (clojure.spec.alpha/and :portkey.aws.ce/get-tags-response))
