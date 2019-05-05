(ns portkey.aws.budgets.-2016-10-20 (:require [portkey.aws]))

(def
 endpoints
 '{"ap-northeast-1"
   {:credential-scope {:service "budgets", :region "us-east-1"},
    :ssl-common-name "budgets.amazonaws.com",
    :endpoint "https://budgets.amazonaws.com",
    :signature-version :v4},
   "eu-west-1"
   {:credential-scope {:service "budgets", :region "us-east-1"},
    :ssl-common-name "budgets.amazonaws.com",
    :endpoint "https://budgets.amazonaws.com",
    :signature-version :v4},
   "us-east-2"
   {:credential-scope {:service "budgets", :region "us-east-1"},
    :ssl-common-name "budgets.amazonaws.com",
    :endpoint "https://budgets.amazonaws.com",
    :signature-version :v4},
   "ap-southeast-2"
   {:credential-scope {:service "budgets", :region "us-east-1"},
    :ssl-common-name "budgets.amazonaws.com",
    :endpoint "https://budgets.amazonaws.com",
    :signature-version :v4},
   "sa-east-1"
   {:credential-scope {:service "budgets", :region "us-east-1"},
    :ssl-common-name "budgets.amazonaws.com",
    :endpoint "https://budgets.amazonaws.com",
    :signature-version :v4},
   "ap-southeast-1"
   {:credential-scope {:service "budgets", :region "us-east-1"},
    :ssl-common-name "budgets.amazonaws.com",
    :endpoint "https://budgets.amazonaws.com",
    :signature-version :v4},
   "ap-northeast-2"
   {:credential-scope {:service "budgets", :region "us-east-1"},
    :ssl-common-name "budgets.amazonaws.com",
    :endpoint "https://budgets.amazonaws.com",
    :signature-version :v4},
   "eu-west-3"
   {:credential-scope {:service "budgets", :region "us-east-1"},
    :ssl-common-name "budgets.amazonaws.com",
    :endpoint "https://budgets.amazonaws.com",
    :signature-version :v4},
   "ca-central-1"
   {:credential-scope {:service "budgets", :region "us-east-1"},
    :ssl-common-name "budgets.amazonaws.com",
    :endpoint "https://budgets.amazonaws.com",
    :signature-version :v4},
   "eu-central-1"
   {:credential-scope {:service "budgets", :region "us-east-1"},
    :ssl-common-name "budgets.amazonaws.com",
    :endpoint "https://budgets.amazonaws.com",
    :signature-version :v4},
   "eu-west-2"
   {:credential-scope {:service "budgets", :region "us-east-1"},
    :ssl-common-name "budgets.amazonaws.com",
    :endpoint "https://budgets.amazonaws.com",
    :signature-version :v4},
   "us-west-2"
   {:credential-scope {:service "budgets", :region "us-east-1"},
    :ssl-common-name "budgets.amazonaws.com",
    :endpoint "https://budgets.amazonaws.com",
    :signature-version :v4},
   "us-east-1"
   {:credential-scope {:service "budgets", :region "us-east-1"},
    :ssl-common-name "budgets.amazonaws.com",
    :endpoint "https://budgets.amazonaws.com",
    :signature-version :v4},
   "us-west-1"
   {:credential-scope {:service "budgets", :region "us-east-1"},
    :ssl-common-name "budgets.amazonaws.com",
    :endpoint "https://budgets.amazonaws.com",
    :signature-version :v4},
   "ap-south-1"
   {:credential-scope {:service "budgets", :region "us-east-1"},
    :ssl-common-name "budgets.amazonaws.com",
    :endpoint "https://budgets.amazonaws.com",
    :signature-version :v4},
   "eu-north-1"
   {:credential-scope {:service "budgets", :region "us-east-1"},
    :ssl-common-name "budgets.amazonaws.com",
    :endpoint "https://budgets.amazonaws.com",
    :signature-version :v4},
   "aws-global"
   {:credential-scope {:service "budgets", :region "us-east-1"},
    :ssl-common-name "budgets.amazonaws.com",
    :endpoint "https://budgets.amazonaws.com",
    :signature-version :v4}})

(clojure.core/declare ser-threshold-type)

(clojure.core/declare ser-notification-state)

(clojure.core/declare ser-budget)

(clojure.core/declare ser-spend)

(clojure.core/declare ser-time-unit)

(clojure.core/declare ser-unit-value)

(clojure.core/declare ser-calculated-spend)

(clojure.core/declare ser-notification-with-subscribers-list)

(clojure.core/declare ser-comparison-operator)

(clojure.core/declare ser-nullable-boolean)

(clojure.core/declare ser-notification-type)

(clojure.core/declare ser-generic-timestamp)

(clojure.core/declare ser-subscriber-address)

(clojure.core/declare ser-cost-types)

(clojure.core/declare ser-time-period)

(clojure.core/declare ser-notification-threshold)

(clojure.core/declare ser-generic-string)

(clojure.core/declare ser-account-id)

(clojure.core/declare ser-subscription-type)

(clojure.core/declare ser-subscribers)

(clojure.core/declare ser-numeric-value)

(clojure.core/declare ser-budget-name)

(clojure.core/declare ser-max-results)

(clojure.core/declare ser-notification-with-subscribers)

(clojure.core/declare ser-budget-type)

(clojure.core/declare ser-notification)

(clojure.core/declare ser-dimension-values)

(clojure.core/declare ser-subscriber)

(clojure.core/declare ser-cost-filters)

(clojure.core/defn- ser-threshold-type [input] #:http.request.field{:value (clojure.core/get {"PERCENTAGE" "PERCENTAGE", :percentage "PERCENTAGE", "ABSOLUTE_VALUE" "ABSOLUTE_VALUE", :absolute-value "ABSOLUTE_VALUE"} input), :shape "ThresholdType"})

(clojure.core/defn- ser-notification-state [input] #:http.request.field{:value (clojure.core/get {"OK" "OK", :ok "OK", "ALARM" "ALARM", :alarm "ALARM"} input), :shape "NotificationState"})

(clojure.core/defn- ser-budget [input] (clojure.core/cond-> #:http.request.field{:value [(clojure.core/into (ser-budget-name (:budget-name input)) #:http.request.field{:name "BudgetName", :shape "BudgetName"}) (clojure.core/into (ser-time-unit (:time-unit input)) #:http.request.field{:name "TimeUnit", :shape "TimeUnit"}) (clojure.core/into (ser-budget-type (:budget-type input)) #:http.request.field{:name "BudgetType", :shape "BudgetType"})], :shape "Budget", :type "structure"} (clojure.core/contains? input :calculated-spend) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-calculated-spend (input :calculated-spend)) #:http.request.field{:name "CalculatedSpend", :shape "CalculatedSpend"})) (clojure.core/contains? input :budget-limit) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-spend (input :budget-limit)) #:http.request.field{:name "BudgetLimit", :shape "Spend"})) (clojure.core/contains? input :cost-types) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-cost-types (input :cost-types)) #:http.request.field{:name "CostTypes", :shape "CostTypes"})) (clojure.core/contains? input :time-period) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-time-period (input :time-period)) #:http.request.field{:name "TimePeriod", :shape "TimePeriod"})) (clojure.core/contains? input :last-updated-time) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-generic-timestamp (input :last-updated-time)) #:http.request.field{:name "LastUpdatedTime", :shape "GenericTimestamp"})) (clojure.core/contains? input :cost-filters) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-cost-filters (input :cost-filters)) #:http.request.field{:name "CostFilters", :shape "CostFilters"}))))

(clojure.core/defn- ser-spend [input] (clojure.core/cond-> #:http.request.field{:value [(clojure.core/into (ser-numeric-value (:amount input)) #:http.request.field{:name "Amount", :shape "NumericValue"}) (clojure.core/into (ser-unit-value (:unit input)) #:http.request.field{:name "Unit", :shape "UnitValue"})], :shape "Spend", :type "structure"}))

(clojure.core/defn- ser-time-unit [input] #:http.request.field{:value (clojure.core/get {"DAILY" "DAILY", :daily "DAILY", "MONTHLY" "MONTHLY", :monthly "MONTHLY", "QUARTERLY" "QUARTERLY", :quarterly "QUARTERLY", "ANNUALLY" "ANNUALLY", :annually "ANNUALLY"} input), :shape "TimeUnit"})

(clojure.core/defn- ser-unit-value [input] #:http.request.field{:value input, :shape "UnitValue"})

(clojure.core/defn- ser-calculated-spend [input] (clojure.core/cond-> #:http.request.field{:value [(clojure.core/into (ser-spend (:actual-spend input)) #:http.request.field{:name "ActualSpend", :shape "Spend"})], :shape "CalculatedSpend", :type "structure"} (clojure.core/contains? input :forecasted-spend) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-spend (input :forecasted-spend)) #:http.request.field{:name "ForecastedSpend", :shape "Spend"}))))

(clojure.core/defn- ser-notification-with-subscribers-list [input] #:http.request.field{:value (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (clojure.core/merge (ser-notification-with-subscribers coll) #:http.request.field{:shape "NotificationWithSubscribers"}))) input), :shape "NotificationWithSubscribersList", :type "list", :max 5})

(clojure.core/defn- ser-comparison-operator [input] #:http.request.field{:value (clojure.core/get {"GREATER_THAN" "GREATER_THAN", :greater-than "GREATER_THAN", "LESS_THAN" "LESS_THAN", :less-than "LESS_THAN", "EQUAL_TO" "EQUAL_TO", :equal-to "EQUAL_TO"} input), :shape "ComparisonOperator"})

(clojure.core/defn- ser-nullable-boolean [input] #:http.request.field{:value input, :shape "NullableBoolean"})

(clojure.core/defn- ser-notification-type [input] #:http.request.field{:value (clojure.core/get {"ACTUAL" "ACTUAL", :actual "ACTUAL", "FORECASTED" "FORECASTED", :forecasted "FORECASTED"} input), :shape "NotificationType"})

(clojure.core/defn- ser-generic-timestamp [input] #:http.request.field{:value input, :shape "GenericTimestamp"})

(clojure.core/defn- ser-subscriber-address [input] #:http.request.field{:value input, :shape "SubscriberAddress"})

(clojure.core/defn- ser-cost-types [input] (clojure.core/cond-> #:http.request.field{:value [], :shape "CostTypes", :type "structure"} (clojure.core/contains? input :include-support) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-nullable-boolean (input :include-support)) #:http.request.field{:name "IncludeSupport", :shape "NullableBoolean"})) (clojure.core/contains? input :include-other-subscription) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-nullable-boolean (input :include-other-subscription)) #:http.request.field{:name "IncludeOtherSubscription", :shape "NullableBoolean"})) (clojure.core/contains? input :include-subscription) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-nullable-boolean (input :include-subscription)) #:http.request.field{:name "IncludeSubscription", :shape "NullableBoolean"})) (clojure.core/contains? input :include-upfront) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-nullable-boolean (input :include-upfront)) #:http.request.field{:name "IncludeUpfront", :shape "NullableBoolean"})) (clojure.core/contains? input :use-blended) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-nullable-boolean (input :use-blended)) #:http.request.field{:name "UseBlended", :shape "NullableBoolean"})) (clojure.core/contains? input :include-tax) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-nullable-boolean (input :include-tax)) #:http.request.field{:name "IncludeTax", :shape "NullableBoolean"})) (clojure.core/contains? input :include-credit) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-nullable-boolean (input :include-credit)) #:http.request.field{:name "IncludeCredit", :shape "NullableBoolean"})) (clojure.core/contains? input :include-discount) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-nullable-boolean (input :include-discount)) #:http.request.field{:name "IncludeDiscount", :shape "NullableBoolean"})) (clojure.core/contains? input :include-refund) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-nullable-boolean (input :include-refund)) #:http.request.field{:name "IncludeRefund", :shape "NullableBoolean"})) (clojure.core/contains? input :include-recurring) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-nullable-boolean (input :include-recurring)) #:http.request.field{:name "IncludeRecurring", :shape "NullableBoolean"})) (clojure.core/contains? input :use-amortized) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-nullable-boolean (input :use-amortized)) #:http.request.field{:name "UseAmortized", :shape "NullableBoolean"}))))

(clojure.core/defn- ser-time-period [input] (clojure.core/cond-> #:http.request.field{:value [], :shape "TimePeriod", :type "structure"} (clojure.core/contains? input :start) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-generic-timestamp (input :start)) #:http.request.field{:name "Start", :shape "GenericTimestamp"})) (clojure.core/contains? input :end) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-generic-timestamp (input :end)) #:http.request.field{:name "End", :shape "GenericTimestamp"}))))

(clojure.core/defn- ser-notification-threshold [input] #:http.request.field{:value input, :shape "NotificationThreshold"})

(clojure.core/defn- ser-generic-string [input] #:http.request.field{:value input, :shape "GenericString"})

(clojure.core/defn- ser-account-id [input] #:http.request.field{:value input, :shape "AccountId"})

(clojure.core/defn- ser-subscription-type [input] #:http.request.field{:value (clojure.core/get {"SNS" "SNS", :sns "SNS", "EMAIL" "EMAIL", :email "EMAIL"} input), :shape "SubscriptionType"})

(clojure.core/defn- ser-subscribers [input] #:http.request.field{:value (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (clojure.core/merge (ser-subscriber coll) #:http.request.field{:shape "Subscriber"}))) input), :shape "Subscribers", :type "list", :max 11, :min 1})

(clojure.core/defn- ser-numeric-value [input] #:http.request.field{:value input, :shape "NumericValue"})

(clojure.core/defn- ser-budget-name [input] #:http.request.field{:value input, :shape "BudgetName"})

(clojure.core/defn- ser-max-results [input] #:http.request.field{:value input, :shape "MaxResults"})

(clojure.core/defn- ser-notification-with-subscribers [input] (clojure.core/cond-> #:http.request.field{:value [(clojure.core/into (ser-notification (:notification input)) #:http.request.field{:name "Notification", :shape "Notification"}) (clojure.core/into (ser-subscribers (:subscribers input)) #:http.request.field{:name "Subscribers", :shape "Subscribers"})], :shape "NotificationWithSubscribers", :type "structure"}))

(clojure.core/defn- ser-budget-type [input] #:http.request.field{:value (clojure.core/get {"USAGE" "USAGE", :usage "USAGE", "COST" "COST", :cost "COST", "RI_UTILIZATION" "RI_UTILIZATION", :ri-utilization "RI_UTILIZATION", "RI_COVERAGE" "RI_COVERAGE", :ri-coverage "RI_COVERAGE"} input), :shape "BudgetType"})

(clojure.core/defn- ser-notification [input] (clojure.core/cond-> #:http.request.field{:value [(clojure.core/into (ser-notification-type (:notification-type input)) #:http.request.field{:name "NotificationType", :shape "NotificationType"}) (clojure.core/into (ser-comparison-operator (:comparison-operator input)) #:http.request.field{:name "ComparisonOperator", :shape "ComparisonOperator"}) (clojure.core/into (ser-notification-threshold (:threshold input)) #:http.request.field{:name "Threshold", :shape "NotificationThreshold"})], :shape "Notification", :type "structure"} (clojure.core/contains? input :threshold-type) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-threshold-type (input :threshold-type)) #:http.request.field{:name "ThresholdType", :shape "ThresholdType"})) (clojure.core/contains? input :notification-state) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-notification-state (input :notification-state)) #:http.request.field{:name "NotificationState", :shape "NotificationState"}))))

(clojure.core/defn- ser-dimension-values [input] #:http.request.field{:value (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (clojure.core/merge (ser-generic-string coll) #:http.request.field{:shape "GenericString"}))) input), :shape "DimensionValues", :type "list"})

(clojure.core/defn- ser-subscriber [input] (clojure.core/cond-> #:http.request.field{:value [(clojure.core/into (ser-subscription-type (:subscription-type input)) #:http.request.field{:name "SubscriptionType", :shape "SubscriptionType"}) (clojure.core/into (ser-subscriber-address (:address input)) #:http.request.field{:name "Address", :shape "SubscriberAddress"})], :shape "Subscriber", :type "structure"}))

(clojure.core/defn- ser-cost-filters [input] #:http.request.field{:value (clojure.core/into [] (clojure.core/map (clojure.core/fn [[k v]] [(clojure.core/into (ser-generic-string k) #:http.request.field{:map-info "key", :shape "GenericString"}) (clojure.core/into (ser-dimension-values v) #:http.request.field{:map-info "value", :shape "DimensionValues"})])) input), :shape "CostFilters", :type "map"})

(clojure.core/defn- req-delete-notification-request [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (ser-account-id (input :account-id)) #:http.request.field{:name "AccountId", :shape "AccountId"}) (clojure.core/into (ser-budget-name (input :budget-name)) #:http.request.field{:name "BudgetName", :shape "BudgetName"}) (clojure.core/into (ser-notification (input :notification)) #:http.request.field{:name "Notification", :shape "Notification"})]}))

(clojure.core/defn- req-create-notification-request [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (ser-account-id (input :account-id)) #:http.request.field{:name "AccountId", :shape "AccountId"}) (clojure.core/into (ser-budget-name (input :budget-name)) #:http.request.field{:name "BudgetName", :shape "BudgetName"}) (clojure.core/into (ser-notification (input :notification)) #:http.request.field{:name "Notification", :shape "Notification"}) (clojure.core/into (ser-subscribers (input :subscribers)) #:http.request.field{:name "Subscribers", :shape "Subscribers"})]}))

(clojure.core/defn- req-describe-budgets-request [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (ser-account-id (input :account-id)) #:http.request.field{:name "AccountId", :shape "AccountId"})]} (clojure.core/contains? input :max-results) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-max-results (input :max-results)) #:http.request.field{:name "MaxResults", :shape "MaxResults"})) (clojure.core/contains? input :next-token) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-generic-string (input :next-token)) #:http.request.field{:name "NextToken", :shape "GenericString"}))))

(clojure.core/defn- req-describe-notifications-for-budget-request [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (ser-account-id (input :account-id)) #:http.request.field{:name "AccountId", :shape "AccountId"}) (clojure.core/into (ser-budget-name (input :budget-name)) #:http.request.field{:name "BudgetName", :shape "BudgetName"})]} (clojure.core/contains? input :max-results) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-max-results (input :max-results)) #:http.request.field{:name "MaxResults", :shape "MaxResults"})) (clojure.core/contains? input :next-token) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-generic-string (input :next-token)) #:http.request.field{:name "NextToken", :shape "GenericString"}))))

(clojure.core/defn- req-delete-subscriber-request [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (ser-account-id (input :account-id)) #:http.request.field{:name "AccountId", :shape "AccountId"}) (clojure.core/into (ser-budget-name (input :budget-name)) #:http.request.field{:name "BudgetName", :shape "BudgetName"}) (clojure.core/into (ser-notification (input :notification)) #:http.request.field{:name "Notification", :shape "Notification"}) (clojure.core/into (ser-subscriber (input :subscriber)) #:http.request.field{:name "Subscriber", :shape "Subscriber"})]}))

(clojure.core/defn- req-delete-budget-request [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (ser-account-id (input :account-id)) #:http.request.field{:name "AccountId", :shape "AccountId"}) (clojure.core/into (ser-budget-name (input :budget-name)) #:http.request.field{:name "BudgetName", :shape "BudgetName"})]}))

(clojure.core/defn- req-update-budget-request [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (ser-account-id (input :account-id)) #:http.request.field{:name "AccountId", :shape "AccountId"}) (clojure.core/into (ser-budget (input :new-budget)) #:http.request.field{:name "NewBudget", :shape "Budget"})]}))

(clojure.core/defn- req-describe-budget-performance-history-request [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (ser-account-id (input :account-id)) #:http.request.field{:name "AccountId", :shape "AccountId"}) (clojure.core/into (ser-budget-name (input :budget-name)) #:http.request.field{:name "BudgetName", :shape "BudgetName"})]} (clojure.core/contains? input :time-period) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-time-period (input :time-period)) #:http.request.field{:name "TimePeriod", :shape "TimePeriod"})) (clojure.core/contains? input :max-results) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-max-results (input :max-results)) #:http.request.field{:name "MaxResults", :shape "MaxResults"})) (clojure.core/contains? input :next-token) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-generic-string (input :next-token)) #:http.request.field{:name "NextToken", :shape "GenericString"}))))

(clojure.core/defn- req-update-notification-request [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (ser-account-id (input :account-id)) #:http.request.field{:name "AccountId", :shape "AccountId"}) (clojure.core/into (ser-budget-name (input :budget-name)) #:http.request.field{:name "BudgetName", :shape "BudgetName"}) (clojure.core/into (ser-notification (input :old-notification)) #:http.request.field{:name "OldNotification", :shape "Notification"}) (clojure.core/into (ser-notification (input :new-notification)) #:http.request.field{:name "NewNotification", :shape "Notification"})]}))

(clojure.core/defn- req-describe-subscribers-for-notification-request [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (ser-account-id (input :account-id)) #:http.request.field{:name "AccountId", :shape "AccountId"}) (clojure.core/into (ser-budget-name (input :budget-name)) #:http.request.field{:name "BudgetName", :shape "BudgetName"}) (clojure.core/into (ser-notification (input :notification)) #:http.request.field{:name "Notification", :shape "Notification"})]} (clojure.core/contains? input :max-results) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-max-results (input :max-results)) #:http.request.field{:name "MaxResults", :shape "MaxResults"})) (clojure.core/contains? input :next-token) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-generic-string (input :next-token)) #:http.request.field{:name "NextToken", :shape "GenericString"}))))

(clojure.core/defn- req-update-subscriber-request [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (ser-account-id (input :account-id)) #:http.request.field{:name "AccountId", :shape "AccountId"}) (clojure.core/into (ser-budget-name (input :budget-name)) #:http.request.field{:name "BudgetName", :shape "BudgetName"}) (clojure.core/into (ser-notification (input :notification)) #:http.request.field{:name "Notification", :shape "Notification"}) (clojure.core/into (ser-subscriber (input :old-subscriber)) #:http.request.field{:name "OldSubscriber", :shape "Subscriber"}) (clojure.core/into (ser-subscriber (input :new-subscriber)) #:http.request.field{:name "NewSubscriber", :shape "Subscriber"})]}))

(clojure.core/defn- req-describe-budget-request [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (ser-account-id (input :account-id)) #:http.request.field{:name "AccountId", :shape "AccountId"}) (clojure.core/into (ser-budget-name (input :budget-name)) #:http.request.field{:name "BudgetName", :shape "BudgetName"})]}))

(clojure.core/defn- req-create-budget-request [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (ser-account-id (input :account-id)) #:http.request.field{:name "AccountId", :shape "AccountId"}) (clojure.core/into (ser-budget (input :budget)) #:http.request.field{:name "Budget", :shape "Budget"})]} (clojure.core/contains? input :notifications-with-subscribers) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-notification-with-subscribers-list (input :notifications-with-subscribers)) #:http.request.field{:name "NotificationsWithSubscribers", :shape "NotificationWithSubscribersList"}))))

(clojure.core/defn- req-create-subscriber-request [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (ser-account-id (input :account-id)) #:http.request.field{:name "AccountId", :shape "AccountId"}) (clojure.core/into (ser-budget-name (input :budget-name)) #:http.request.field{:name "BudgetName", :shape "BudgetName"}) (clojure.core/into (ser-notification (input :notification)) #:http.request.field{:name "Notification", :shape "Notification"}) (clojure.core/into (ser-subscriber (input :subscriber)) #:http.request.field{:name "Subscriber", :shape "Subscriber"})]}))

(clojure.core/declare deser-threshold-type)

(clojure.core/declare desererror-message)

(clojure.core/declare deser-notification-state)

(clojure.core/declare deser-budget)

(clojure.core/declare deser-spend)

(clojure.core/declare deser-time-unit)

(clojure.core/declare deser-unit-value)

(clojure.core/declare deser-calculated-spend)

(clojure.core/declare deser-budgeted-and-actual-amounts-list)

(clojure.core/declare deser-comparison-operator)

(clojure.core/declare deser-nullable-boolean)

(clojure.core/declare deser-notification-type)

(clojure.core/declare deser-generic-timestamp)

(clojure.core/declare deser-subscriber-address)

(clojure.core/declare deser-budgeted-and-actual-amounts)

(clojure.core/declare deser-cost-types)

(clojure.core/declare deser-budget-performance-history)

(clojure.core/declare deser-time-period)

(clojure.core/declare deser-notification-threshold)

(clojure.core/declare deser-generic-string)

(clojure.core/declare deser-subscription-type)

(clojure.core/declare deser-subscribers)

(clojure.core/declare deser-numeric-value)

(clojure.core/declare deser-budget-name)

(clojure.core/declare deser-budgets)

(clojure.core/declare deser-budget-type)

(clojure.core/declare deser-notification)

(clojure.core/declare deser-dimension-values)

(clojure.core/declare deser-notifications)

(clojure.core/declare deser-subscriber)

(clojure.core/declare deser-cost-filters)

(clojure.core/defn- deser-threshold-type [input] (clojure.core/get {"PERCENTAGE" :percentage, "ABSOLUTE_VALUE" :absolute-value} input))

(clojure.core/defn- desererror-message [input] input)

(clojure.core/defn- deser-notification-state [input] (clojure.core/get {"OK" :ok, "ALARM" :alarm} input))

(clojure.core/defn- deser-budget [input] (clojure.core/cond-> {:budget-name (deser-budget-name (input "BudgetName")), :time-unit (deser-time-unit (input "TimeUnit")), :budget-type (deser-budget-type (input "BudgetType"))} (clojure.core/contains? input "CalculatedSpend") (clojure.core/assoc :calculated-spend (deser-calculated-spend (input "CalculatedSpend"))) (clojure.core/contains? input "BudgetLimit") (clojure.core/assoc :budget-limit (deser-spend (input "BudgetLimit"))) (clojure.core/contains? input "CostTypes") (clojure.core/assoc :cost-types (deser-cost-types (input "CostTypes"))) (clojure.core/contains? input "TimePeriod") (clojure.core/assoc :time-period (deser-time-period (input "TimePeriod"))) (clojure.core/contains? input "LastUpdatedTime") (clojure.core/assoc :last-updated-time (deser-generic-timestamp (input "LastUpdatedTime"))) (clojure.core/contains? input "CostFilters") (clojure.core/assoc :cost-filters (deser-cost-filters (input "CostFilters")))))

(clojure.core/defn- deser-spend [input] (clojure.core/cond-> {:amount (deser-numeric-value (input "Amount")), :unit (deser-unit-value (input "Unit"))}))

(clojure.core/defn- deser-time-unit [input] (clojure.core/get {"DAILY" :daily, "MONTHLY" :monthly, "QUARTERLY" :quarterly, "ANNUALLY" :annually} input))

(clojure.core/defn- deser-unit-value [input] input)

(clojure.core/defn- deser-calculated-spend [input] (clojure.core/cond-> {:actual-spend (deser-spend (input "ActualSpend"))} (clojure.core/contains? input "ForecastedSpend") (clojure.core/assoc :forecasted-spend (deser-spend (input "ForecastedSpend")))))

(clojure.core/defn- deser-budgeted-and-actual-amounts-list [input] (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (deser-budgeted-and-actual-amounts coll))) input))

(clojure.core/defn- deser-comparison-operator [input] (clojure.core/get {"GREATER_THAN" :greater-than, "LESS_THAN" :less-than, "EQUAL_TO" :equal-to} input))

(clojure.core/defn- deser-nullable-boolean [input] input)

(clojure.core/defn- deser-notification-type [input] (clojure.core/get {"ACTUAL" :actual, "FORECASTED" :forecasted} input))

(clojure.core/defn- deser-generic-timestamp [input] input)

(clojure.core/defn- deser-subscriber-address [input] input)

(clojure.core/defn- deser-budgeted-and-actual-amounts [input] (clojure.core/cond-> {} (clojure.core/contains? input "BudgetedAmount") (clojure.core/assoc :budgeted-amount (deser-spend (input "BudgetedAmount"))) (clojure.core/contains? input "ActualAmount") (clojure.core/assoc :actual-amount (deser-spend (input "ActualAmount"))) (clojure.core/contains? input "TimePeriod") (clojure.core/assoc :time-period (deser-time-period (input "TimePeriod")))))

(clojure.core/defn- deser-cost-types [input] (clojure.core/cond-> {} (clojure.core/contains? input "IncludeSupport") (clojure.core/assoc :include-support (deser-nullable-boolean (input "IncludeSupport"))) (clojure.core/contains? input "IncludeOtherSubscription") (clojure.core/assoc :include-other-subscription (deser-nullable-boolean (input "IncludeOtherSubscription"))) (clojure.core/contains? input "IncludeSubscription") (clojure.core/assoc :include-subscription (deser-nullable-boolean (input "IncludeSubscription"))) (clojure.core/contains? input "IncludeUpfront") (clojure.core/assoc :include-upfront (deser-nullable-boolean (input "IncludeUpfront"))) (clojure.core/contains? input "UseBlended") (clojure.core/assoc :use-blended (deser-nullable-boolean (input "UseBlended"))) (clojure.core/contains? input "IncludeTax") (clojure.core/assoc :include-tax (deser-nullable-boolean (input "IncludeTax"))) (clojure.core/contains? input "IncludeCredit") (clojure.core/assoc :include-credit (deser-nullable-boolean (input "IncludeCredit"))) (clojure.core/contains? input "IncludeDiscount") (clojure.core/assoc :include-discount (deser-nullable-boolean (input "IncludeDiscount"))) (clojure.core/contains? input "IncludeRefund") (clojure.core/assoc :include-refund (deser-nullable-boolean (input "IncludeRefund"))) (clojure.core/contains? input "IncludeRecurring") (clojure.core/assoc :include-recurring (deser-nullable-boolean (input "IncludeRecurring"))) (clojure.core/contains? input "UseAmortized") (clojure.core/assoc :use-amortized (deser-nullable-boolean (input "UseAmortized")))))

(clojure.core/defn- deser-budget-performance-history [input] (clojure.core/cond-> {} (clojure.core/contains? input "BudgetName") (clojure.core/assoc :budget-name (deser-budget-name (input "BudgetName"))) (clojure.core/contains? input "BudgetType") (clojure.core/assoc :budget-type (deser-budget-type (input "BudgetType"))) (clojure.core/contains? input "CostFilters") (clojure.core/assoc :cost-filters (deser-cost-filters (input "CostFilters"))) (clojure.core/contains? input "CostTypes") (clojure.core/assoc :cost-types (deser-cost-types (input "CostTypes"))) (clojure.core/contains? input "TimeUnit") (clojure.core/assoc :time-unit (deser-time-unit (input "TimeUnit"))) (clojure.core/contains? input "BudgetedAndActualAmountsList") (clojure.core/assoc :budgeted-and-actual-amounts-list (deser-budgeted-and-actual-amounts-list (input "BudgetedAndActualAmountsList")))))

(clojure.core/defn- deser-time-period [input] (clojure.core/cond-> {} (clojure.core/contains? input "Start") (clojure.core/assoc :start (deser-generic-timestamp (input "Start"))) (clojure.core/contains? input "End") (clojure.core/assoc :end (deser-generic-timestamp (input "End")))))

(clojure.core/defn- deser-notification-threshold [input] input)

(clojure.core/defn- deser-generic-string [input] input)

(clojure.core/defn- deser-subscription-type [input] (clojure.core/get {"SNS" :sns, "EMAIL" :email} input))

(clojure.core/defn- deser-subscribers [input] (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (deser-subscriber coll))) input))

(clojure.core/defn- deser-numeric-value [input] input)

(clojure.core/defn- deser-budget-name [input] input)

(clojure.core/defn- deser-budgets [input] (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (deser-budget coll))) input))

(clojure.core/defn- deser-budget-type [input] (clojure.core/get {"USAGE" :usage, "COST" :cost, "RI_UTILIZATION" :ri-utilization, "RI_COVERAGE" :ri-coverage} input))

(clojure.core/defn- deser-notification [input] (clojure.core/cond-> {:notification-type (deser-notification-type (input "NotificationType")), :comparison-operator (deser-comparison-operator (input "ComparisonOperator")), :threshold (deser-notification-threshold (input "Threshold"))} (clojure.core/contains? input "ThresholdType") (clojure.core/assoc :threshold-type (deser-threshold-type (input "ThresholdType"))) (clojure.core/contains? input "NotificationState") (clojure.core/assoc :notification-state (deser-notification-state (input "NotificationState")))))

(clojure.core/defn- deser-dimension-values [input] (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (deser-generic-string coll))) input))

(clojure.core/defn- deser-notifications [input] (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (deser-notification coll))) input))

(clojure.core/defn- deser-subscriber [input] (clojure.core/cond-> {:subscription-type (deser-subscription-type (input "SubscriptionType")), :address (deser-subscriber-address (input "Address"))}))

(clojure.core/defn- deser-cost-filters [input] (clojure.core/into {} (clojure.core/map (clojure.core/fn [[k v]] [(deser-generic-string k) (deser-dimension-values v)])) input))

(clojure.core/defn- response-create-budget-response ([input] (response-create-budget-response nil input)) ([resultWrapper155501 input] (clojure.core/let [rawinput155500 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar155502 {}] (clojure.core/cond-> {}))))

(clojure.core/defn- response-creation-limit-exceeded-exception ([input] (response-creation-limit-exceeded-exception nil input)) ([resultWrapper155504 input] (clojure.core/let [rawinput155503 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar155505 {"Message" (rawinput155503 "Message")}] (clojure.core/cond-> {} (letvar155505 "Message") (clojure.core/assoc :message (desererror-message (clojure.core/get-in letvar155505 ["Message"])))))))

(clojure.core/defn- response-describe-budget-performance-history-response ([input] (response-describe-budget-performance-history-response nil input)) ([resultWrapper155507 input] (clojure.core/let [rawinput155506 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar155508 {"BudgetPerformanceHistory" (rawinput155506 "BudgetPerformanceHistory"), "NextToken" (rawinput155506 "NextToken")}] (clojure.core/cond-> {} (letvar155508 "BudgetPerformanceHistory") (clojure.core/assoc :budget-performance-history (deser-budget-performance-history (clojure.core/get-in letvar155508 ["BudgetPerformanceHistory"]))) (letvar155508 "NextToken") (clojure.core/assoc :next-token (deser-generic-string (clojure.core/get-in letvar155508 ["NextToken"])))))))

(clojure.core/defn- response-describe-subscribers-for-notification-response ([input] (response-describe-subscribers-for-notification-response nil input)) ([resultWrapper155510 input] (clojure.core/let [rawinput155509 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar155511 {"Subscribers" (rawinput155509 "Subscribers"), "NextToken" (rawinput155509 "NextToken")}] (clojure.core/cond-> {} (letvar155511 "Subscribers") (clojure.core/assoc :subscribers (deser-subscribers (clojure.core/get-in letvar155511 ["Subscribers"]))) (letvar155511 "NextToken") (clojure.core/assoc :next-token (deser-generic-string (clojure.core/get-in letvar155511 ["NextToken"])))))))

(clojure.core/defn- response-expired-next-token-exception ([input] (response-expired-next-token-exception nil input)) ([resultWrapper155513 input] (clojure.core/let [rawinput155512 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar155514 {"Message" (rawinput155512 "Message")}] (clojure.core/cond-> {} (letvar155514 "Message") (clojure.core/assoc :message (desererror-message (clojure.core/get-in letvar155514 ["Message"])))))))

(clojure.core/defn- response-delete-subscriber-response ([input] (response-delete-subscriber-response nil input)) ([resultWrapper155516 input] (clojure.core/let [rawinput155515 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar155517 {}] (clojure.core/cond-> {}))))

(clojure.core/defn- response-update-notification-response ([input] (response-update-notification-response nil input)) ([resultWrapper155519 input] (clojure.core/let [rawinput155518 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar155520 {}] (clojure.core/cond-> {}))))

(clojure.core/defn- response-delete-budget-response ([input] (response-delete-budget-response nil input)) ([resultWrapper155522 input] (clojure.core/let [rawinput155521 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar155523 {}] (clojure.core/cond-> {}))))

(clojure.core/defn- response-invalid-next-token-exception ([input] (response-invalid-next-token-exception nil input)) ([resultWrapper155525 input] (clojure.core/let [rawinput155524 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar155526 {"Message" (rawinput155524 "Message")}] (clojure.core/cond-> {} (letvar155526 "Message") (clojure.core/assoc :message (desererror-message (clojure.core/get-in letvar155526 ["Message"])))))))

(clojure.core/defn- response-describe-budgets-response ([input] (response-describe-budgets-response nil input)) ([resultWrapper155528 input] (clojure.core/let [rawinput155527 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar155529 {"Budgets" (rawinput155527 "Budgets"), "NextToken" (rawinput155527 "NextToken")}] (clojure.core/cond-> {} (letvar155529 "Budgets") (clojure.core/assoc :budgets (deser-budgets (clojure.core/get-in letvar155529 ["Budgets"]))) (letvar155529 "NextToken") (clojure.core/assoc :next-token (deser-generic-string (clojure.core/get-in letvar155529 ["NextToken"])))))))

(clojure.core/defn- response-internal-error-exception ([input] (response-internal-error-exception nil input)) ([resultWrapper155531 input] (clojure.core/let [rawinput155530 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar155532 {"Message" (rawinput155530 "Message")}] (clojure.core/cond-> {} (letvar155532 "Message") (clojure.core/assoc :message (desererror-message (clojure.core/get-in letvar155532 ["Message"])))))))

(clojure.core/defn- response-update-budget-response ([input] (response-update-budget-response nil input)) ([resultWrapper155534 input] (clojure.core/let [rawinput155533 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar155535 {}] (clojure.core/cond-> {}))))

(clojure.core/defn- response-duplicate-record-exception ([input] (response-duplicate-record-exception nil input)) ([resultWrapper155537 input] (clojure.core/let [rawinput155536 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar155538 {"Message" (rawinput155536 "Message")}] (clojure.core/cond-> {} (letvar155538 "Message") (clojure.core/assoc :message (desererror-message (clojure.core/get-in letvar155538 ["Message"])))))))

(clojure.core/defn- response-not-found-exception ([input] (response-not-found-exception nil input)) ([resultWrapper155540 input] (clojure.core/let [rawinput155539 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar155541 {"Message" (rawinput155539 "Message")}] (clojure.core/cond-> {} (letvar155541 "Message") (clojure.core/assoc :message (desererror-message (clojure.core/get-in letvar155541 ["Message"])))))))

(clojure.core/defn- response-create-notification-response ([input] (response-create-notification-response nil input)) ([resultWrapper155543 input] (clojure.core/let [rawinput155542 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar155544 {}] (clojure.core/cond-> {}))))

(clojure.core/defn- response-describe-budget-response ([input] (response-describe-budget-response nil input)) ([resultWrapper155546 input] (clojure.core/let [rawinput155545 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar155547 {"Budget" (rawinput155545 "Budget")}] (clojure.core/cond-> {} (letvar155547 "Budget") (clojure.core/assoc :budget (deser-budget (clojure.core/get-in letvar155547 ["Budget"])))))))

(clojure.core/defn- response-delete-notification-response ([input] (response-delete-notification-response nil input)) ([resultWrapper155549 input] (clojure.core/let [rawinput155548 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar155550 {}] (clojure.core/cond-> {}))))

(clojure.core/defn- response-update-subscriber-response ([input] (response-update-subscriber-response nil input)) ([resultWrapper155552 input] (clojure.core/let [rawinput155551 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar155553 {}] (clojure.core/cond-> {}))))

(clojure.core/defn- response-invalid-parameter-exception ([input] (response-invalid-parameter-exception nil input)) ([resultWrapper155555 input] (clojure.core/let [rawinput155554 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar155556 {"Message" (rawinput155554 "Message")}] (clojure.core/cond-> {} (letvar155556 "Message") (clojure.core/assoc :message (desererror-message (clojure.core/get-in letvar155556 ["Message"])))))))

(clojure.core/defn- response-create-subscriber-response ([input] (response-create-subscriber-response nil input)) ([resultWrapper155558 input] (clojure.core/let [rawinput155557 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar155559 {}] (clojure.core/cond-> {}))))

(clojure.core/defn- response-describe-notifications-for-budget-response ([input] (response-describe-notifications-for-budget-response nil input)) ([resultWrapper155561 input] (clojure.core/let [rawinput155560 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar155562 {"Notifications" (rawinput155560 "Notifications"), "NextToken" (rawinput155560 "NextToken")}] (clojure.core/cond-> {} (letvar155562 "Notifications") (clojure.core/assoc :notifications (deser-notifications (clojure.core/get-in letvar155562 ["Notifications"]))) (letvar155562 "NextToken") (clojure.core/assoc :next-token (deser-generic-string (clojure.core/get-in letvar155562 ["NextToken"])))))))

(clojure.spec.alpha/def :portkey.aws.budgets.-2016-10-20/threshold-type #{:absolute-value "ABSOLUTE_VALUE" :percentage "PERCENTAGE"})

(clojure.spec.alpha/def :portkey.aws.budgets.-2016-10-20/create-budget-response (clojure.spec.alpha/keys :req-un [] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.budgets.-2016-10-20.creation-limit-exceeded-exception/message (clojure.spec.alpha/and :portkey.aws.budgets.-2016-10-20/error-message))
(clojure.spec.alpha/def :portkey.aws.budgets.-2016-10-20/creation-limit-exceeded-exception (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.budgets.-2016-10-20.creation-limit-exceeded-exception/message]))

(clojure.spec.alpha/def :portkey.aws.budgets.-2016-10-20/delete-notification-request (clojure.spec.alpha/keys :req-un [:portkey.aws.budgets.-2016-10-20/account-id :portkey.aws.budgets.-2016-10-20/budget-name :portkey.aws.budgets.-2016-10-20/notification] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.budgets.-2016-10-20/create-notification-request (clojure.spec.alpha/keys :req-un [:portkey.aws.budgets.-2016-10-20/account-id :portkey.aws.budgets.-2016-10-20/budget-name :portkey.aws.budgets.-2016-10-20/notification :portkey.aws.budgets.-2016-10-20/subscribers] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.budgets.-2016-10-20.describe-budget-performance-history-response/next-token (clojure.spec.alpha/and :portkey.aws.budgets.-2016-10-20/generic-string))
(clojure.spec.alpha/def :portkey.aws.budgets.-2016-10-20/describe-budget-performance-history-response (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.budgets.-2016-10-20/budget-performance-history :portkey.aws.budgets.-2016-10-20.describe-budget-performance-history-response/next-token]))

(clojure.spec.alpha/def :portkey.aws.budgets.-2016-10-20.describe-budgets-request/next-token (clojure.spec.alpha/and :portkey.aws.budgets.-2016-10-20/generic-string))
(clojure.spec.alpha/def :portkey.aws.budgets.-2016-10-20/describe-budgets-request (clojure.spec.alpha/keys :req-un [:portkey.aws.budgets.-2016-10-20/account-id] :opt-un [:portkey.aws.budgets.-2016-10-20/max-results :portkey.aws.budgets.-2016-10-20.describe-budgets-request/next-token]))

(clojure.spec.alpha/def :portkey.aws.budgets.-2016-10-20/error-message (clojure.spec.alpha/and clojure.core/string?))

(clojure.spec.alpha/def :portkey.aws.budgets.-2016-10-20.describe-notifications-for-budget-request/next-token (clojure.spec.alpha/and :portkey.aws.budgets.-2016-10-20/generic-string))
(clojure.spec.alpha/def :portkey.aws.budgets.-2016-10-20/describe-notifications-for-budget-request (clojure.spec.alpha/keys :req-un [:portkey.aws.budgets.-2016-10-20/account-id :portkey.aws.budgets.-2016-10-20/budget-name] :opt-un [:portkey.aws.budgets.-2016-10-20/max-results :portkey.aws.budgets.-2016-10-20.describe-notifications-for-budget-request/next-token]))

(clojure.spec.alpha/def :portkey.aws.budgets.-2016-10-20.describe-subscribers-for-notification-response/next-token (clojure.spec.alpha/and :portkey.aws.budgets.-2016-10-20/generic-string))
(clojure.spec.alpha/def :portkey.aws.budgets.-2016-10-20/describe-subscribers-for-notification-response (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.budgets.-2016-10-20/subscribers :portkey.aws.budgets.-2016-10-20.describe-subscribers-for-notification-response/next-token]))

(clojure.spec.alpha/def :portkey.aws.budgets.-2016-10-20/notification-state #{:alarm "ALARM" "OK" :ok})

(clojure.spec.alpha/def :portkey.aws.budgets.-2016-10-20.budget/budget-limit (clojure.spec.alpha/and :portkey.aws.budgets.-2016-10-20/spend))
(clojure.spec.alpha/def :portkey.aws.budgets.-2016-10-20.budget/last-updated-time (clojure.spec.alpha/and :portkey.aws.budgets.-2016-10-20/generic-timestamp))
(clojure.spec.alpha/def :portkey.aws.budgets.-2016-10-20/budget (clojure.spec.alpha/keys :req-un [:portkey.aws.budgets.-2016-10-20/budget-name :portkey.aws.budgets.-2016-10-20/time-unit :portkey.aws.budgets.-2016-10-20/budget-type] :opt-un [:portkey.aws.budgets.-2016-10-20/calculated-spend :portkey.aws.budgets.-2016-10-20.budget/budget-limit :portkey.aws.budgets.-2016-10-20/cost-types :portkey.aws.budgets.-2016-10-20/time-period :portkey.aws.budgets.-2016-10-20.budget/last-updated-time :portkey.aws.budgets.-2016-10-20/cost-filters]))

(clojure.spec.alpha/def :portkey.aws.budgets.-2016-10-20/delete-subscriber-request (clojure.spec.alpha/keys :req-un [:portkey.aws.budgets.-2016-10-20/account-id :portkey.aws.budgets.-2016-10-20/budget-name :portkey.aws.budgets.-2016-10-20/notification :portkey.aws.budgets.-2016-10-20/subscriber] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.budgets.-2016-10-20.expired-next-token-exception/message (clojure.spec.alpha/and :portkey.aws.budgets.-2016-10-20/error-message))
(clojure.spec.alpha/def :portkey.aws.budgets.-2016-10-20/expired-next-token-exception (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.budgets.-2016-10-20.expired-next-token-exception/message]))

(clojure.spec.alpha/def :portkey.aws.budgets.-2016-10-20.spend/amount (clojure.spec.alpha/and :portkey.aws.budgets.-2016-10-20/numeric-value))
(clojure.spec.alpha/def :portkey.aws.budgets.-2016-10-20.spend/unit (clojure.spec.alpha/and :portkey.aws.budgets.-2016-10-20/unit-value))
(clojure.spec.alpha/def :portkey.aws.budgets.-2016-10-20/spend (clojure.spec.alpha/keys :req-un [:portkey.aws.budgets.-2016-10-20.spend/amount :portkey.aws.budgets.-2016-10-20.spend/unit] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.budgets.-2016-10-20/delete-subscriber-response (clojure.spec.alpha/keys :req-un [] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.budgets.-2016-10-20/time-unit #{:annually "QUARTERLY" :daily :monthly "MONTHLY" "DAILY" "ANNUALLY" :quarterly})

(clojure.spec.alpha/def :portkey.aws.budgets.-2016-10-20/unit-value (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__21076__auto__] (clojure.core/<= 1 (clojure.core/count s__21076__auto__))) (clojure.core/fn [s__21077__auto__] (clojure.core/< (clojure.core/count s__21077__auto__) 2147483647)) (clojure.core/fn [s__21078__auto__] (clojure.core/re-matches #".*" s__21078__auto__))))

(clojure.spec.alpha/def :portkey.aws.budgets.-2016-10-20.calculated-spend/actual-spend (clojure.spec.alpha/and :portkey.aws.budgets.-2016-10-20/spend))
(clojure.spec.alpha/def :portkey.aws.budgets.-2016-10-20.calculated-spend/forecasted-spend (clojure.spec.alpha/and :portkey.aws.budgets.-2016-10-20/spend))
(clojure.spec.alpha/def :portkey.aws.budgets.-2016-10-20/calculated-spend (clojure.spec.alpha/keys :req-un [:portkey.aws.budgets.-2016-10-20.calculated-spend/actual-spend] :opt-un [:portkey.aws.budgets.-2016-10-20.calculated-spend/forecasted-spend]))

(clojure.spec.alpha/def :portkey.aws.budgets.-2016-10-20/notification-with-subscribers-list (clojure.spec.alpha/coll-of :portkey.aws.budgets.-2016-10-20/notification-with-subscribers :max-count 5))

(clojure.spec.alpha/def :portkey.aws.budgets.-2016-10-20/update-notification-response (clojure.spec.alpha/keys :req-un [] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.budgets.-2016-10-20/budgeted-and-actual-amounts-list (clojure.spec.alpha/coll-of :portkey.aws.budgets.-2016-10-20/budgeted-and-actual-amounts))

(clojure.spec.alpha/def :portkey.aws.budgets.-2016-10-20/comparison-operator #{"GREATER_THAN" :less-than :greater-than "LESS_THAN" :equal-to "EQUAL_TO"})

(clojure.spec.alpha/def :portkey.aws.budgets.-2016-10-20/nullable-boolean clojure.core/boolean?)

(clojure.spec.alpha/def :portkey.aws.budgets.-2016-10-20/notification-type #{"ACTUAL" "FORECASTED" :forecasted :actual})

(clojure.spec.alpha/def :portkey.aws.budgets.-2016-10-20/delete-budget-request (clojure.spec.alpha/keys :req-un [:portkey.aws.budgets.-2016-10-20/account-id :portkey.aws.budgets.-2016-10-20/budget-name] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.budgets.-2016-10-20/generic-timestamp clojure.core/inst?)

(clojure.spec.alpha/def :portkey.aws.budgets.-2016-10-20.update-budget-request/new-budget (clojure.spec.alpha/and :portkey.aws.budgets.-2016-10-20/budget))
(clojure.spec.alpha/def :portkey.aws.budgets.-2016-10-20/update-budget-request (clojure.spec.alpha/keys :req-un [:portkey.aws.budgets.-2016-10-20/account-id :portkey.aws.budgets.-2016-10-20.update-budget-request/new-budget] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.budgets.-2016-10-20/subscriber-address (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__21076__auto__] (clojure.core/<= 1 (clojure.core/count s__21076__auto__))) (clojure.core/fn [s__21077__auto__] (clojure.core/< (clojure.core/count s__21077__auto__) 2147483647)) (clojure.core/fn [s__21078__auto__] (clojure.core/re-matches #".*" s__21078__auto__))))

(clojure.spec.alpha/def :portkey.aws.budgets.-2016-10-20.budgeted-and-actual-amounts/budgeted-amount (clojure.spec.alpha/and :portkey.aws.budgets.-2016-10-20/spend))
(clojure.spec.alpha/def :portkey.aws.budgets.-2016-10-20.budgeted-and-actual-amounts/actual-amount (clojure.spec.alpha/and :portkey.aws.budgets.-2016-10-20/spend))
(clojure.spec.alpha/def :portkey.aws.budgets.-2016-10-20/budgeted-and-actual-amounts (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.budgets.-2016-10-20.budgeted-and-actual-amounts/budgeted-amount :portkey.aws.budgets.-2016-10-20.budgeted-and-actual-amounts/actual-amount :portkey.aws.budgets.-2016-10-20/time-period]))

(clojure.spec.alpha/def :portkey.aws.budgets.-2016-10-20/delete-budget-response (clojure.spec.alpha/keys :req-un [] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.budgets.-2016-10-20.invalid-next-token-exception/message (clojure.spec.alpha/and :portkey.aws.budgets.-2016-10-20/error-message))
(clojure.spec.alpha/def :portkey.aws.budgets.-2016-10-20/invalid-next-token-exception (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.budgets.-2016-10-20.invalid-next-token-exception/message]))

(clojure.spec.alpha/def :portkey.aws.budgets.-2016-10-20.describe-budgets-response/next-token (clojure.spec.alpha/and :portkey.aws.budgets.-2016-10-20/generic-string))
(clojure.spec.alpha/def :portkey.aws.budgets.-2016-10-20/describe-budgets-response (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.budgets.-2016-10-20/budgets :portkey.aws.budgets.-2016-10-20.describe-budgets-response/next-token]))

(clojure.spec.alpha/def :portkey.aws.budgets.-2016-10-20.internal-error-exception/message (clojure.spec.alpha/and :portkey.aws.budgets.-2016-10-20/error-message))
(clojure.spec.alpha/def :portkey.aws.budgets.-2016-10-20/internal-error-exception (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.budgets.-2016-10-20.internal-error-exception/message]))

(clojure.spec.alpha/def :portkey.aws.budgets.-2016-10-20.describe-budget-performance-history-request/next-token (clojure.spec.alpha/and :portkey.aws.budgets.-2016-10-20/generic-string))
(clojure.spec.alpha/def :portkey.aws.budgets.-2016-10-20/describe-budget-performance-history-request (clojure.spec.alpha/keys :req-un [:portkey.aws.budgets.-2016-10-20/account-id :portkey.aws.budgets.-2016-10-20/budget-name] :opt-un [:portkey.aws.budgets.-2016-10-20/time-period :portkey.aws.budgets.-2016-10-20/max-results :portkey.aws.budgets.-2016-10-20.describe-budget-performance-history-request/next-token]))

(clojure.spec.alpha/def :portkey.aws.budgets.-2016-10-20.cost-types/include-support (clojure.spec.alpha/and :portkey.aws.budgets.-2016-10-20/nullable-boolean))
(clojure.spec.alpha/def :portkey.aws.budgets.-2016-10-20.cost-types/include-other-subscription (clojure.spec.alpha/and :portkey.aws.budgets.-2016-10-20/nullable-boolean))
(clojure.spec.alpha/def :portkey.aws.budgets.-2016-10-20.cost-types/include-subscription (clojure.spec.alpha/and :portkey.aws.budgets.-2016-10-20/nullable-boolean))
(clojure.spec.alpha/def :portkey.aws.budgets.-2016-10-20.cost-types/include-upfront (clojure.spec.alpha/and :portkey.aws.budgets.-2016-10-20/nullable-boolean))
(clojure.spec.alpha/def :portkey.aws.budgets.-2016-10-20.cost-types/use-blended (clojure.spec.alpha/and :portkey.aws.budgets.-2016-10-20/nullable-boolean))
(clojure.spec.alpha/def :portkey.aws.budgets.-2016-10-20.cost-types/include-tax (clojure.spec.alpha/and :portkey.aws.budgets.-2016-10-20/nullable-boolean))
(clojure.spec.alpha/def :portkey.aws.budgets.-2016-10-20.cost-types/include-credit (clojure.spec.alpha/and :portkey.aws.budgets.-2016-10-20/nullable-boolean))
(clojure.spec.alpha/def :portkey.aws.budgets.-2016-10-20.cost-types/include-discount (clojure.spec.alpha/and :portkey.aws.budgets.-2016-10-20/nullable-boolean))
(clojure.spec.alpha/def :portkey.aws.budgets.-2016-10-20.cost-types/include-refund (clojure.spec.alpha/and :portkey.aws.budgets.-2016-10-20/nullable-boolean))
(clojure.spec.alpha/def :portkey.aws.budgets.-2016-10-20.cost-types/include-recurring (clojure.spec.alpha/and :portkey.aws.budgets.-2016-10-20/nullable-boolean))
(clojure.spec.alpha/def :portkey.aws.budgets.-2016-10-20.cost-types/use-amortized (clojure.spec.alpha/and :portkey.aws.budgets.-2016-10-20/nullable-boolean))
(clojure.spec.alpha/def :portkey.aws.budgets.-2016-10-20/cost-types (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.budgets.-2016-10-20.cost-types/include-support :portkey.aws.budgets.-2016-10-20.cost-types/include-other-subscription :portkey.aws.budgets.-2016-10-20.cost-types/include-subscription :portkey.aws.budgets.-2016-10-20.cost-types/include-upfront :portkey.aws.budgets.-2016-10-20.cost-types/use-blended :portkey.aws.budgets.-2016-10-20.cost-types/include-tax :portkey.aws.budgets.-2016-10-20.cost-types/include-credit :portkey.aws.budgets.-2016-10-20.cost-types/include-discount :portkey.aws.budgets.-2016-10-20.cost-types/include-refund :portkey.aws.budgets.-2016-10-20.cost-types/include-recurring :portkey.aws.budgets.-2016-10-20.cost-types/use-amortized]))

(clojure.spec.alpha/def :portkey.aws.budgets.-2016-10-20/budget-performance-history (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.budgets.-2016-10-20/budget-name :portkey.aws.budgets.-2016-10-20/budget-type :portkey.aws.budgets.-2016-10-20/cost-filters :portkey.aws.budgets.-2016-10-20/cost-types :portkey.aws.budgets.-2016-10-20/time-unit :portkey.aws.budgets.-2016-10-20/budgeted-and-actual-amounts-list]))

(clojure.spec.alpha/def :portkey.aws.budgets.-2016-10-20.time-period/start (clojure.spec.alpha/and :portkey.aws.budgets.-2016-10-20/generic-timestamp))
(clojure.spec.alpha/def :portkey.aws.budgets.-2016-10-20.time-period/end (clojure.spec.alpha/and :portkey.aws.budgets.-2016-10-20/generic-timestamp))
(clojure.spec.alpha/def :portkey.aws.budgets.-2016-10-20/time-period (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.budgets.-2016-10-20.time-period/start :portkey.aws.budgets.-2016-10-20.time-period/end]))

(clojure.spec.alpha/def :portkey.aws.budgets.-2016-10-20/notification-threshold clojure.core/double?)

(clojure.spec.alpha/def :portkey.aws.budgets.-2016-10-20/update-budget-response (clojure.spec.alpha/keys :req-un [] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.budgets.-2016-10-20.duplicate-record-exception/message (clojure.spec.alpha/and :portkey.aws.budgets.-2016-10-20/error-message))
(clojure.spec.alpha/def :portkey.aws.budgets.-2016-10-20/duplicate-record-exception (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.budgets.-2016-10-20.duplicate-record-exception/message]))

(clojure.spec.alpha/def :portkey.aws.budgets.-2016-10-20/generic-string (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__21076__auto__] (clojure.core/<= 0 (clojure.core/count s__21076__auto__))) (clojure.core/fn [s__21077__auto__] (clojure.core/< (clojure.core/count s__21077__auto__) 2147483647)) (clojure.core/fn [s__21078__auto__] (clojure.core/re-matches #".*" s__21078__auto__))))

(clojure.spec.alpha/def :portkey.aws.budgets.-2016-10-20.update-notification-request/old-notification (clojure.spec.alpha/and :portkey.aws.budgets.-2016-10-20/notification))
(clojure.spec.alpha/def :portkey.aws.budgets.-2016-10-20.update-notification-request/new-notification (clojure.spec.alpha/and :portkey.aws.budgets.-2016-10-20/notification))
(clojure.spec.alpha/def :portkey.aws.budgets.-2016-10-20/update-notification-request (clojure.spec.alpha/keys :req-un [:portkey.aws.budgets.-2016-10-20/account-id :portkey.aws.budgets.-2016-10-20/budget-name :portkey.aws.budgets.-2016-10-20.update-notification-request/old-notification :portkey.aws.budgets.-2016-10-20.update-notification-request/new-notification] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.budgets.-2016-10-20.not-found-exception/message (clojure.spec.alpha/and :portkey.aws.budgets.-2016-10-20/error-message))
(clojure.spec.alpha/def :portkey.aws.budgets.-2016-10-20/not-found-exception (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.budgets.-2016-10-20.not-found-exception/message]))

(clojure.spec.alpha/def :portkey.aws.budgets.-2016-10-20.describe-subscribers-for-notification-request/next-token (clojure.spec.alpha/and :portkey.aws.budgets.-2016-10-20/generic-string))
(clojure.spec.alpha/def :portkey.aws.budgets.-2016-10-20/describe-subscribers-for-notification-request (clojure.spec.alpha/keys :req-un [:portkey.aws.budgets.-2016-10-20/account-id :portkey.aws.budgets.-2016-10-20/budget-name :portkey.aws.budgets.-2016-10-20/notification] :opt-un [:portkey.aws.budgets.-2016-10-20/max-results :portkey.aws.budgets.-2016-10-20.describe-subscribers-for-notification-request/next-token]))

(clojure.spec.alpha/def :portkey.aws.budgets.-2016-10-20/create-notification-response (clojure.spec.alpha/keys :req-un [] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.budgets.-2016-10-20.update-subscriber-request/old-subscriber (clojure.spec.alpha/and :portkey.aws.budgets.-2016-10-20/subscriber))
(clojure.spec.alpha/def :portkey.aws.budgets.-2016-10-20.update-subscriber-request/new-subscriber (clojure.spec.alpha/and :portkey.aws.budgets.-2016-10-20/subscriber))
(clojure.spec.alpha/def :portkey.aws.budgets.-2016-10-20/update-subscriber-request (clojure.spec.alpha/keys :req-un [:portkey.aws.budgets.-2016-10-20/account-id :portkey.aws.budgets.-2016-10-20/budget-name :portkey.aws.budgets.-2016-10-20/notification :portkey.aws.budgets.-2016-10-20.update-subscriber-request/old-subscriber :portkey.aws.budgets.-2016-10-20.update-subscriber-request/new-subscriber] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.budgets.-2016-10-20/describe-budget-request (clojure.spec.alpha/keys :req-un [:portkey.aws.budgets.-2016-10-20/account-id :portkey.aws.budgets.-2016-10-20/budget-name] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.budgets.-2016-10-20/account-id (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__21076__auto__] (clojure.core/<= 12 (clojure.core/count s__21076__auto__))) (clojure.core/fn [s__21077__auto__] (clojure.core/< (clojure.core/count s__21077__auto__) 12)) (clojure.core/fn [s__21078__auto__] (clojure.core/re-matches #"\d{12}" s__21078__auto__))))

(clojure.spec.alpha/def :portkey.aws.budgets.-2016-10-20/describe-budget-response (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.budgets.-2016-10-20/budget]))

(clojure.spec.alpha/def :portkey.aws.budgets.-2016-10-20/subscription-type #{:email :sns "SNS" "EMAIL"})

(clojure.spec.alpha/def :portkey.aws.budgets.-2016-10-20/subscribers (clojure.spec.alpha/coll-of :portkey.aws.budgets.-2016-10-20/subscriber :min-count 1 :max-count 11))

(clojure.spec.alpha/def :portkey.aws.budgets.-2016-10-20/numeric-value (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__21076__auto__] (clojure.core/<= 1 (clojure.core/count s__21076__auto__))) (clojure.core/fn [s__21077__auto__] (clojure.core/< (clojure.core/count s__21077__auto__) 2147483647)) (clojure.core/fn [s__21078__auto__] (clojure.core/re-matches #"([0-9]*\.)?[0-9]+" s__21078__auto__))))

(clojure.spec.alpha/def :portkey.aws.budgets.-2016-10-20/budget-name (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__21076__auto__] (clojure.core/<= 1 (clojure.core/count s__21076__auto__))) (clojure.core/fn [s__21077__auto__] (clojure.core/< (clojure.core/count s__21077__auto__) 100)) (clojure.core/fn [s__21078__auto__] (clojure.core/re-matches #"[^:\\]+" s__21078__auto__))))

(clojure.spec.alpha/def :portkey.aws.budgets.-2016-10-20/delete-notification-response (clojure.spec.alpha/keys :req-un [] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.budgets.-2016-10-20/budgets (clojure.spec.alpha/coll-of :portkey.aws.budgets.-2016-10-20/budget))

(clojure.spec.alpha/def :portkey.aws.budgets.-2016-10-20/max-results (clojure.spec.alpha/int-in 1 100))

(clojure.spec.alpha/def :portkey.aws.budgets.-2016-10-20/notification-with-subscribers (clojure.spec.alpha/keys :req-un [:portkey.aws.budgets.-2016-10-20/notification :portkey.aws.budgets.-2016-10-20/subscribers] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.budgets.-2016-10-20/budget-type #{:ri-utilization :ri-coverage :usage "RI_UTILIZATION" :cost "USAGE" "COST" "RI_COVERAGE"})

(clojure.spec.alpha/def :portkey.aws.budgets.-2016-10-20.notification/threshold (clojure.spec.alpha/and :portkey.aws.budgets.-2016-10-20/notification-threshold))
(clojure.spec.alpha/def :portkey.aws.budgets.-2016-10-20/notification (clojure.spec.alpha/keys :req-un [:portkey.aws.budgets.-2016-10-20/notification-type :portkey.aws.budgets.-2016-10-20/comparison-operator :portkey.aws.budgets.-2016-10-20.notification/threshold] :opt-un [:portkey.aws.budgets.-2016-10-20/threshold-type :portkey.aws.budgets.-2016-10-20/notification-state]))

(clojure.spec.alpha/def :portkey.aws.budgets.-2016-10-20/dimension-values (clojure.spec.alpha/coll-of :portkey.aws.budgets.-2016-10-20/generic-string))

(clojure.spec.alpha/def :portkey.aws.budgets.-2016-10-20/update-subscriber-response (clojure.spec.alpha/keys :req-un [] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.budgets.-2016-10-20.invalid-parameter-exception/message (clojure.spec.alpha/and :portkey.aws.budgets.-2016-10-20/error-message))
(clojure.spec.alpha/def :portkey.aws.budgets.-2016-10-20/invalid-parameter-exception (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.budgets.-2016-10-20.invalid-parameter-exception/message]))

(clojure.spec.alpha/def :portkey.aws.budgets.-2016-10-20/notifications (clojure.spec.alpha/coll-of :portkey.aws.budgets.-2016-10-20/notification))

(clojure.spec.alpha/def :portkey.aws.budgets.-2016-10-20/create-subscriber-response (clojure.spec.alpha/keys :req-un [] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.budgets.-2016-10-20.create-budget-request/notifications-with-subscribers (clojure.spec.alpha/and :portkey.aws.budgets.-2016-10-20/notification-with-subscribers-list))
(clojure.spec.alpha/def :portkey.aws.budgets.-2016-10-20/create-budget-request (clojure.spec.alpha/keys :req-un [:portkey.aws.budgets.-2016-10-20/account-id :portkey.aws.budgets.-2016-10-20/budget] :opt-un [:portkey.aws.budgets.-2016-10-20.create-budget-request/notifications-with-subscribers]))

(clojure.spec.alpha/def :portkey.aws.budgets.-2016-10-20.subscriber/address (clojure.spec.alpha/and :portkey.aws.budgets.-2016-10-20/subscriber-address))
(clojure.spec.alpha/def :portkey.aws.budgets.-2016-10-20/subscriber (clojure.spec.alpha/keys :req-un [:portkey.aws.budgets.-2016-10-20/subscription-type :portkey.aws.budgets.-2016-10-20.subscriber/address] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.budgets.-2016-10-20.describe-notifications-for-budget-response/next-token (clojure.spec.alpha/and :portkey.aws.budgets.-2016-10-20/generic-string))
(clojure.spec.alpha/def :portkey.aws.budgets.-2016-10-20/describe-notifications-for-budget-response (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.budgets.-2016-10-20/notifications :portkey.aws.budgets.-2016-10-20.describe-notifications-for-budget-response/next-token]))

(clojure.spec.alpha/def :portkey.aws.budgets.-2016-10-20/create-subscriber-request (clojure.spec.alpha/keys :req-un [:portkey.aws.budgets.-2016-10-20/account-id :portkey.aws.budgets.-2016-10-20/budget-name :portkey.aws.budgets.-2016-10-20/notification :portkey.aws.budgets.-2016-10-20/subscriber] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.budgets.-2016-10-20/cost-filters (clojure.spec.alpha/map-of :portkey.aws.budgets.-2016-10-20/generic-string :portkey.aws.budgets.-2016-10-20/dimension-values))

(clojure.core/defn describe-budget "Describes a budget." ([describe-budget-requestinput] (clojure.core/let [request-function-result__22119__auto__ (req-describe-budget-request describe-budget-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__22119__auto__ {:http.request.configuration/endpoints portkey.aws.budgets.-2016-10-20/endpoints, :http.request.configuration/target-prefix "AWSBudgetServiceGateway", :http.request.spec/output-spec :portkey.aws.budgets.-2016-10-20/describe-budget-response, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2016-10-20", :http.request.configuration/service-id "Budgets", :http.request.spec/input-spec :portkey.aws.budgets.-2016-10-20/describe-budget-request, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "DescribeBudget", :http.request.configuration/output-deser-fn response-describe-budget-response, :http.request.spec/error-spec {"InternalErrorException" :portkey.aws.budgets.-2016-10-20/internal-error-exception, "InvalidParameterException" :portkey.aws.budgets.-2016-10-20/invalid-parameter-exception, "NotFoundException" :portkey.aws.budgets.-2016-10-20/not-found-exception}})))))
(clojure.spec.alpha/fdef describe-budget :args (clojure.spec.alpha/tuple :portkey.aws.budgets.-2016-10-20/describe-budget-request) :ret (clojure.spec.alpha/and :portkey.aws.budgets.-2016-10-20/describe-budget-response))

(clojure.core/defn create-notification "Creates a notification. You must create the budget before you create the\nassociated notification." ([create-notification-requestinput] (clojure.core/let [request-function-result__22119__auto__ (req-create-notification-request create-notification-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__22119__auto__ {:http.request.configuration/endpoints portkey.aws.budgets.-2016-10-20/endpoints, :http.request.configuration/target-prefix "AWSBudgetServiceGateway", :http.request.spec/output-spec :portkey.aws.budgets.-2016-10-20/create-notification-response, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2016-10-20", :http.request.configuration/service-id "Budgets", :http.request.spec/input-spec :portkey.aws.budgets.-2016-10-20/create-notification-request, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "CreateNotification", :http.request.configuration/output-deser-fn response-create-notification-response, :http.request.spec/error-spec {"InternalErrorException" :portkey.aws.budgets.-2016-10-20/internal-error-exception, "InvalidParameterException" :portkey.aws.budgets.-2016-10-20/invalid-parameter-exception, "NotFoundException" :portkey.aws.budgets.-2016-10-20/not-found-exception, "CreationLimitExceededException" :portkey.aws.budgets.-2016-10-20/creation-limit-exceeded-exception, "DuplicateRecordException" :portkey.aws.budgets.-2016-10-20/duplicate-record-exception}})))))
(clojure.spec.alpha/fdef create-notification :args (clojure.spec.alpha/tuple :portkey.aws.budgets.-2016-10-20/create-notification-request) :ret (clojure.spec.alpha/and :portkey.aws.budgets.-2016-10-20/create-notification-response))

(clojure.core/defn describe-budgets "Lists the budgets that are associated with an account." ([describe-budgets-requestinput] (clojure.core/let [request-function-result__22119__auto__ (req-describe-budgets-request describe-budgets-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__22119__auto__ {:http.request.configuration/endpoints portkey.aws.budgets.-2016-10-20/endpoints, :http.request.configuration/target-prefix "AWSBudgetServiceGateway", :http.request.spec/output-spec :portkey.aws.budgets.-2016-10-20/describe-budgets-response, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2016-10-20", :http.request.configuration/service-id "Budgets", :http.request.spec/input-spec :portkey.aws.budgets.-2016-10-20/describe-budgets-request, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "DescribeBudgets", :http.request.configuration/output-deser-fn response-describe-budgets-response, :http.request.spec/error-spec {"InternalErrorException" :portkey.aws.budgets.-2016-10-20/internal-error-exception, "InvalidParameterException" :portkey.aws.budgets.-2016-10-20/invalid-parameter-exception, "NotFoundException" :portkey.aws.budgets.-2016-10-20/not-found-exception, "InvalidNextTokenException" :portkey.aws.budgets.-2016-10-20/invalid-next-token-exception, "ExpiredNextTokenException" :portkey.aws.budgets.-2016-10-20/expired-next-token-exception}})))))
(clojure.spec.alpha/fdef describe-budgets :args (clojure.spec.alpha/tuple :portkey.aws.budgets.-2016-10-20/describe-budgets-request) :ret (clojure.spec.alpha/and :portkey.aws.budgets.-2016-10-20/describe-budgets-response))

(clojure.core/defn describe-subscribers-for-notification "Lists the subscribers that are associated with a notification." ([describe-subscribers-for-notification-requestinput] (clojure.core/let [request-function-result__22119__auto__ (req-describe-subscribers-for-notification-request describe-subscribers-for-notification-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__22119__auto__ {:http.request.configuration/endpoints portkey.aws.budgets.-2016-10-20/endpoints, :http.request.configuration/target-prefix "AWSBudgetServiceGateway", :http.request.spec/output-spec :portkey.aws.budgets.-2016-10-20/describe-subscribers-for-notification-response, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2016-10-20", :http.request.configuration/service-id "Budgets", :http.request.spec/input-spec :portkey.aws.budgets.-2016-10-20/describe-subscribers-for-notification-request, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "DescribeSubscribersForNotification", :http.request.configuration/output-deser-fn response-describe-subscribers-for-notification-response, :http.request.spec/error-spec {"InternalErrorException" :portkey.aws.budgets.-2016-10-20/internal-error-exception, "NotFoundException" :portkey.aws.budgets.-2016-10-20/not-found-exception, "InvalidParameterException" :portkey.aws.budgets.-2016-10-20/invalid-parameter-exception, "InvalidNextTokenException" :portkey.aws.budgets.-2016-10-20/invalid-next-token-exception, "ExpiredNextTokenException" :portkey.aws.budgets.-2016-10-20/expired-next-token-exception}})))))
(clojure.spec.alpha/fdef describe-subscribers-for-notification :args (clojure.spec.alpha/tuple :portkey.aws.budgets.-2016-10-20/describe-subscribers-for-notification-request) :ret (clojure.spec.alpha/and :portkey.aws.budgets.-2016-10-20/describe-subscribers-for-notification-response))

(clojure.core/defn create-budget "Creates a budget and, if included, notifications and subscribers." ([create-budget-requestinput] (clojure.core/let [request-function-result__22119__auto__ (req-create-budget-request create-budget-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__22119__auto__ {:http.request.configuration/endpoints portkey.aws.budgets.-2016-10-20/endpoints, :http.request.configuration/target-prefix "AWSBudgetServiceGateway", :http.request.spec/output-spec :portkey.aws.budgets.-2016-10-20/create-budget-response, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2016-10-20", :http.request.configuration/service-id "Budgets", :http.request.spec/input-spec :portkey.aws.budgets.-2016-10-20/create-budget-request, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "CreateBudget", :http.request.configuration/output-deser-fn response-create-budget-response, :http.request.spec/error-spec {"InvalidParameterException" :portkey.aws.budgets.-2016-10-20/invalid-parameter-exception, "InternalErrorException" :portkey.aws.budgets.-2016-10-20/internal-error-exception, "CreationLimitExceededException" :portkey.aws.budgets.-2016-10-20/creation-limit-exceeded-exception, "DuplicateRecordException" :portkey.aws.budgets.-2016-10-20/duplicate-record-exception}})))))
(clojure.spec.alpha/fdef create-budget :args (clojure.spec.alpha/tuple :portkey.aws.budgets.-2016-10-20/create-budget-request) :ret (clojure.spec.alpha/and :portkey.aws.budgets.-2016-10-20/create-budget-response))

(clojure.core/defn create-subscriber "Creates a subscriber. You must create the associated budget and notification\nbefore you create the subscriber." ([create-subscriber-requestinput] (clojure.core/let [request-function-result__22119__auto__ (req-create-subscriber-request create-subscriber-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__22119__auto__ {:http.request.configuration/endpoints portkey.aws.budgets.-2016-10-20/endpoints, :http.request.configuration/target-prefix "AWSBudgetServiceGateway", :http.request.spec/output-spec :portkey.aws.budgets.-2016-10-20/create-subscriber-response, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2016-10-20", :http.request.configuration/service-id "Budgets", :http.request.spec/input-spec :portkey.aws.budgets.-2016-10-20/create-subscriber-request, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "CreateSubscriber", :http.request.configuration/output-deser-fn response-create-subscriber-response, :http.request.spec/error-spec {"InternalErrorException" :portkey.aws.budgets.-2016-10-20/internal-error-exception, "InvalidParameterException" :portkey.aws.budgets.-2016-10-20/invalid-parameter-exception, "CreationLimitExceededException" :portkey.aws.budgets.-2016-10-20/creation-limit-exceeded-exception, "DuplicateRecordException" :portkey.aws.budgets.-2016-10-20/duplicate-record-exception, "NotFoundException" :portkey.aws.budgets.-2016-10-20/not-found-exception}})))))
(clojure.spec.alpha/fdef create-subscriber :args (clojure.spec.alpha/tuple :portkey.aws.budgets.-2016-10-20/create-subscriber-request) :ret (clojure.spec.alpha/and :portkey.aws.budgets.-2016-10-20/create-subscriber-response))

(clojure.core/defn delete-notification "Deletes a notification.\n Deleting a notification also deletes the subscribers that are associated with\nthe notification." ([delete-notification-requestinput] (clojure.core/let [request-function-result__22119__auto__ (req-delete-notification-request delete-notification-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__22119__auto__ {:http.request.configuration/endpoints portkey.aws.budgets.-2016-10-20/endpoints, :http.request.configuration/target-prefix "AWSBudgetServiceGateway", :http.request.spec/output-spec :portkey.aws.budgets.-2016-10-20/delete-notification-response, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2016-10-20", :http.request.configuration/service-id "Budgets", :http.request.spec/input-spec :portkey.aws.budgets.-2016-10-20/delete-notification-request, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "DeleteNotification", :http.request.configuration/output-deser-fn response-delete-notification-response, :http.request.spec/error-spec {"InvalidParameterException" :portkey.aws.budgets.-2016-10-20/invalid-parameter-exception, "InternalErrorException" :portkey.aws.budgets.-2016-10-20/internal-error-exception, "NotFoundException" :portkey.aws.budgets.-2016-10-20/not-found-exception}})))))
(clojure.spec.alpha/fdef delete-notification :args (clojure.spec.alpha/tuple :portkey.aws.budgets.-2016-10-20/delete-notification-request) :ret (clojure.spec.alpha/and :portkey.aws.budgets.-2016-10-20/delete-notification-response))

(clojure.core/defn update-subscriber "Updates a subscriber." ([update-subscriber-requestinput] (clojure.core/let [request-function-result__22119__auto__ (req-update-subscriber-request update-subscriber-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__22119__auto__ {:http.request.configuration/endpoints portkey.aws.budgets.-2016-10-20/endpoints, :http.request.configuration/target-prefix "AWSBudgetServiceGateway", :http.request.spec/output-spec :portkey.aws.budgets.-2016-10-20/update-subscriber-response, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2016-10-20", :http.request.configuration/service-id "Budgets", :http.request.spec/input-spec :portkey.aws.budgets.-2016-10-20/update-subscriber-request, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "UpdateSubscriber", :http.request.configuration/output-deser-fn response-update-subscriber-response, :http.request.spec/error-spec {"InternalErrorException" :portkey.aws.budgets.-2016-10-20/internal-error-exception, "InvalidParameterException" :portkey.aws.budgets.-2016-10-20/invalid-parameter-exception, "NotFoundException" :portkey.aws.budgets.-2016-10-20/not-found-exception, "DuplicateRecordException" :portkey.aws.budgets.-2016-10-20/duplicate-record-exception}})))))
(clojure.spec.alpha/fdef update-subscriber :args (clojure.spec.alpha/tuple :portkey.aws.budgets.-2016-10-20/update-subscriber-request) :ret (clojure.spec.alpha/and :portkey.aws.budgets.-2016-10-20/update-subscriber-response))

(clojure.core/defn update-budget "Updates a budget. You can change every part of a budget except for the\nbudgetName and the calculatedSpend. When you modify a budget, the\ncalculatedSpend drops to zero until AWS has new usage data to use for\nforecasting." ([update-budget-requestinput] (clojure.core/let [request-function-result__22119__auto__ (req-update-budget-request update-budget-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__22119__auto__ {:http.request.configuration/endpoints portkey.aws.budgets.-2016-10-20/endpoints, :http.request.configuration/target-prefix "AWSBudgetServiceGateway", :http.request.spec/output-spec :portkey.aws.budgets.-2016-10-20/update-budget-response, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2016-10-20", :http.request.configuration/service-id "Budgets", :http.request.spec/input-spec :portkey.aws.budgets.-2016-10-20/update-budget-request, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "UpdateBudget", :http.request.configuration/output-deser-fn response-update-budget-response, :http.request.spec/error-spec {"InternalErrorException" :portkey.aws.budgets.-2016-10-20/internal-error-exception, "InvalidParameterException" :portkey.aws.budgets.-2016-10-20/invalid-parameter-exception, "NotFoundException" :portkey.aws.budgets.-2016-10-20/not-found-exception}})))))
(clojure.spec.alpha/fdef update-budget :args (clojure.spec.alpha/tuple :portkey.aws.budgets.-2016-10-20/update-budget-request) :ret (clojure.spec.alpha/and :portkey.aws.budgets.-2016-10-20/update-budget-response))

(clojure.core/defn delete-subscriber "Deletes a subscriber.\n Deleting the last subscriber to a notification also deletes the notification." ([delete-subscriber-requestinput] (clojure.core/let [request-function-result__22119__auto__ (req-delete-subscriber-request delete-subscriber-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__22119__auto__ {:http.request.configuration/endpoints portkey.aws.budgets.-2016-10-20/endpoints, :http.request.configuration/target-prefix "AWSBudgetServiceGateway", :http.request.spec/output-spec :portkey.aws.budgets.-2016-10-20/delete-subscriber-response, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2016-10-20", :http.request.configuration/service-id "Budgets", :http.request.spec/input-spec :portkey.aws.budgets.-2016-10-20/delete-subscriber-request, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "DeleteSubscriber", :http.request.configuration/output-deser-fn response-delete-subscriber-response, :http.request.spec/error-spec {"InternalErrorException" :portkey.aws.budgets.-2016-10-20/internal-error-exception, "InvalidParameterException" :portkey.aws.budgets.-2016-10-20/invalid-parameter-exception, "NotFoundException" :portkey.aws.budgets.-2016-10-20/not-found-exception}})))))
(clojure.spec.alpha/fdef delete-subscriber :args (clojure.spec.alpha/tuple :portkey.aws.budgets.-2016-10-20/delete-subscriber-request) :ret (clojure.spec.alpha/and :portkey.aws.budgets.-2016-10-20/delete-subscriber-response))

(clojure.core/defn delete-budget "Deletes a budget. You can delete your budget at any time.\n Deleting a budget also deletes the notifications and subscribers that are\nassociated with that budget." ([delete-budget-requestinput] (clojure.core/let [request-function-result__22119__auto__ (req-delete-budget-request delete-budget-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__22119__auto__ {:http.request.configuration/endpoints portkey.aws.budgets.-2016-10-20/endpoints, :http.request.configuration/target-prefix "AWSBudgetServiceGateway", :http.request.spec/output-spec :portkey.aws.budgets.-2016-10-20/delete-budget-response, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2016-10-20", :http.request.configuration/service-id "Budgets", :http.request.spec/input-spec :portkey.aws.budgets.-2016-10-20/delete-budget-request, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "DeleteBudget", :http.request.configuration/output-deser-fn response-delete-budget-response, :http.request.spec/error-spec {"InternalErrorException" :portkey.aws.budgets.-2016-10-20/internal-error-exception, "InvalidParameterException" :portkey.aws.budgets.-2016-10-20/invalid-parameter-exception, "NotFoundException" :portkey.aws.budgets.-2016-10-20/not-found-exception}})))))
(clojure.spec.alpha/fdef delete-budget :args (clojure.spec.alpha/tuple :portkey.aws.budgets.-2016-10-20/delete-budget-request) :ret (clojure.spec.alpha/and :portkey.aws.budgets.-2016-10-20/delete-budget-response))

(clojure.core/defn describe-budget-performance-history "Describes the history for DAILY, MONTHLY, and QUARTERLY budgets. Budget history\nisn't available for ANNUAL budgets." ([describe-budget-performance-history-requestinput] (clojure.core/let [request-function-result__22119__auto__ (req-describe-budget-performance-history-request describe-budget-performance-history-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__22119__auto__ {:http.request.configuration/endpoints portkey.aws.budgets.-2016-10-20/endpoints, :http.request.configuration/target-prefix "AWSBudgetServiceGateway", :http.request.spec/output-spec :portkey.aws.budgets.-2016-10-20/describe-budget-performance-history-response, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2016-10-20", :http.request.configuration/service-id "Budgets", :http.request.spec/input-spec :portkey.aws.budgets.-2016-10-20/describe-budget-performance-history-request, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "DescribeBudgetPerformanceHistory", :http.request.configuration/output-deser-fn response-describe-budget-performance-history-response, :http.request.spec/error-spec {"InternalErrorException" :portkey.aws.budgets.-2016-10-20/internal-error-exception, "InvalidParameterException" :portkey.aws.budgets.-2016-10-20/invalid-parameter-exception, "NotFoundException" :portkey.aws.budgets.-2016-10-20/not-found-exception, "InvalidNextTokenException" :portkey.aws.budgets.-2016-10-20/invalid-next-token-exception, "ExpiredNextTokenException" :portkey.aws.budgets.-2016-10-20/expired-next-token-exception}})))))
(clojure.spec.alpha/fdef describe-budget-performance-history :args (clojure.spec.alpha/tuple :portkey.aws.budgets.-2016-10-20/describe-budget-performance-history-request) :ret (clojure.spec.alpha/and :portkey.aws.budgets.-2016-10-20/describe-budget-performance-history-response))

(clojure.core/defn describe-notifications-for-budget "Lists the notifications that are associated with a budget." ([describe-notifications-for-budget-requestinput] (clojure.core/let [request-function-result__22119__auto__ (req-describe-notifications-for-budget-request describe-notifications-for-budget-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__22119__auto__ {:http.request.configuration/endpoints portkey.aws.budgets.-2016-10-20/endpoints, :http.request.configuration/target-prefix "AWSBudgetServiceGateway", :http.request.spec/output-spec :portkey.aws.budgets.-2016-10-20/describe-notifications-for-budget-response, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2016-10-20", :http.request.configuration/service-id "Budgets", :http.request.spec/input-spec :portkey.aws.budgets.-2016-10-20/describe-notifications-for-budget-request, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "DescribeNotificationsForBudget", :http.request.configuration/output-deser-fn response-describe-notifications-for-budget-response, :http.request.spec/error-spec {"InternalErrorException" :portkey.aws.budgets.-2016-10-20/internal-error-exception, "InvalidParameterException" :portkey.aws.budgets.-2016-10-20/invalid-parameter-exception, "NotFoundException" :portkey.aws.budgets.-2016-10-20/not-found-exception, "InvalidNextTokenException" :portkey.aws.budgets.-2016-10-20/invalid-next-token-exception, "ExpiredNextTokenException" :portkey.aws.budgets.-2016-10-20/expired-next-token-exception}})))))
(clojure.spec.alpha/fdef describe-notifications-for-budget :args (clojure.spec.alpha/tuple :portkey.aws.budgets.-2016-10-20/describe-notifications-for-budget-request) :ret (clojure.spec.alpha/and :portkey.aws.budgets.-2016-10-20/describe-notifications-for-budget-response))

(clojure.core/defn update-notification "Updates a notification." ([update-notification-requestinput] (clojure.core/let [request-function-result__22119__auto__ (req-update-notification-request update-notification-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__22119__auto__ {:http.request.configuration/endpoints portkey.aws.budgets.-2016-10-20/endpoints, :http.request.configuration/target-prefix "AWSBudgetServiceGateway", :http.request.spec/output-spec :portkey.aws.budgets.-2016-10-20/update-notification-response, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2016-10-20", :http.request.configuration/service-id "Budgets", :http.request.spec/input-spec :portkey.aws.budgets.-2016-10-20/update-notification-request, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "UpdateNotification", :http.request.configuration/output-deser-fn response-update-notification-response, :http.request.spec/error-spec {"InternalErrorException" :portkey.aws.budgets.-2016-10-20/internal-error-exception, "InvalidParameterException" :portkey.aws.budgets.-2016-10-20/invalid-parameter-exception, "NotFoundException" :portkey.aws.budgets.-2016-10-20/not-found-exception, "DuplicateRecordException" :portkey.aws.budgets.-2016-10-20/duplicate-record-exception}})))))
(clojure.spec.alpha/fdef update-notification :args (clojure.spec.alpha/tuple :portkey.aws.budgets.-2016-10-20/update-notification-request) :ret (clojure.spec.alpha/and :portkey.aws.budgets.-2016-10-20/update-notification-response))
