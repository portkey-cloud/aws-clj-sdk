(ns portkey.aws.budgets (:require [portkey.aws]))

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
   "aws-global"
   {:credential-scope {:service "budgets", :region "us-east-1"},
    :ssl-common-name "budgets.amazonaws.com",
    :endpoint "https://budgets.amazonaws.com",
    :signature-version :v4}})

(clojure.core/declare ser-threshold-type)

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

(clojure.core/defn- ser-budget [input] (clojure.core/cond-> #:http.request.field{:value [(clojure.core/into (ser-budget-name (:budget-name input)) #:http.request.field{:name "BudgetName", :shape "BudgetName"}) (clojure.core/into (ser-time-unit (:time-unit input)) #:http.request.field{:name "TimeUnit", :shape "TimeUnit"}) (clojure.core/into (ser-budget-type (:budget-type input)) #:http.request.field{:name "BudgetType", :shape "BudgetType"})], :shape "Budget", :type "structure"} (clojure.core/contains? input :budget-limit) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-spend (input :budget-limit)) #:http.request.field{:name "BudgetLimit", :shape "Spend"})) (clojure.core/contains? input :cost-filters) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-cost-filters (input :cost-filters)) #:http.request.field{:name "CostFilters", :shape "CostFilters"})) (clojure.core/contains? input :cost-types) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-cost-types (input :cost-types)) #:http.request.field{:name "CostTypes", :shape "CostTypes"})) (clojure.core/contains? input :time-period) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-time-period (input :time-period)) #:http.request.field{:name "TimePeriod", :shape "TimePeriod"})) (clojure.core/contains? input :calculated-spend) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-calculated-spend (input :calculated-spend)) #:http.request.field{:name "CalculatedSpend", :shape "CalculatedSpend"}))))

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

(clojure.core/defn- ser-notification [input] (clojure.core/cond-> #:http.request.field{:value [(clojure.core/into (ser-notification-type (:notification-type input)) #:http.request.field{:name "NotificationType", :shape "NotificationType"}) (clojure.core/into (ser-comparison-operator (:comparison-operator input)) #:http.request.field{:name "ComparisonOperator", :shape "ComparisonOperator"}) (clojure.core/into (ser-notification-threshold (:threshold input)) #:http.request.field{:name "Threshold", :shape "NotificationThreshold"})], :shape "Notification", :type "structure"} (clojure.core/contains? input :threshold-type) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-threshold-type (input :threshold-type)) #:http.request.field{:name "ThresholdType", :shape "ThresholdType"}))))

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

(clojure.core/defn- req-update-notification-request [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (ser-account-id (input :account-id)) #:http.request.field{:name "AccountId", :shape "AccountId"}) (clojure.core/into (ser-budget-name (input :budget-name)) #:http.request.field{:name "BudgetName", :shape "BudgetName"}) (clojure.core/into (ser-notification (input :old-notification)) #:http.request.field{:name "OldNotification", :shape "Notification"}) (clojure.core/into (ser-notification (input :new-notification)) #:http.request.field{:name "NewNotification", :shape "Notification"})]}))

(clojure.core/defn- req-describe-subscribers-for-notification-request [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (ser-account-id (input :account-id)) #:http.request.field{:name "AccountId", :shape "AccountId"}) (clojure.core/into (ser-budget-name (input :budget-name)) #:http.request.field{:name "BudgetName", :shape "BudgetName"}) (clojure.core/into (ser-notification (input :notification)) #:http.request.field{:name "Notification", :shape "Notification"})]} (clojure.core/contains? input :max-results) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-max-results (input :max-results)) #:http.request.field{:name "MaxResults", :shape "MaxResults"})) (clojure.core/contains? input :next-token) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-generic-string (input :next-token)) #:http.request.field{:name "NextToken", :shape "GenericString"}))))

(clojure.core/defn- req-update-subscriber-request [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (ser-account-id (input :account-id)) #:http.request.field{:name "AccountId", :shape "AccountId"}) (clojure.core/into (ser-budget-name (input :budget-name)) #:http.request.field{:name "BudgetName", :shape "BudgetName"}) (clojure.core/into (ser-notification (input :notification)) #:http.request.field{:name "Notification", :shape "Notification"}) (clojure.core/into (ser-subscriber (input :old-subscriber)) #:http.request.field{:name "OldSubscriber", :shape "Subscriber"}) (clojure.core/into (ser-subscriber (input :new-subscriber)) #:http.request.field{:name "NewSubscriber", :shape "Subscriber"})]}))

(clojure.core/defn- req-describe-budget-request [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (ser-account-id (input :account-id)) #:http.request.field{:name "AccountId", :shape "AccountId"}) (clojure.core/into (ser-budget-name (input :budget-name)) #:http.request.field{:name "BudgetName", :shape "BudgetName"})]}))

(clojure.core/defn- req-create-budget-request [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (ser-account-id (input :account-id)) #:http.request.field{:name "AccountId", :shape "AccountId"}) (clojure.core/into (ser-budget (input :budget)) #:http.request.field{:name "Budget", :shape "Budget"})]} (clojure.core/contains? input :notifications-with-subscribers) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-notification-with-subscribers-list (input :notifications-with-subscribers)) #:http.request.field{:name "NotificationsWithSubscribers", :shape "NotificationWithSubscribersList"}))))

(clojure.core/defn- req-create-subscriber-request [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (ser-account-id (input :account-id)) #:http.request.field{:name "AccountId", :shape "AccountId"}) (clojure.core/into (ser-budget-name (input :budget-name)) #:http.request.field{:name "BudgetName", :shape "BudgetName"}) (clojure.core/into (ser-notification (input :notification)) #:http.request.field{:name "Notification", :shape "Notification"}) (clojure.core/into (ser-subscriber (input :subscriber)) #:http.request.field{:name "Subscriber", :shape "Subscriber"})]}))

(clojure.spec.alpha/def :portkey.aws.budgets/threshold-type #{:absolute-value "ABSOLUTE_VALUE" :percentage "PERCENTAGE"})

(clojure.spec.alpha/def :portkey.aws.budgets/create-budget-response (clojure.spec.alpha/keys :req-un [] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.budgets.creation-limit-exceeded-exception/message (clojure.spec.alpha/and :portkey.aws.budgets/error-message))
(clojure.spec.alpha/def :portkey.aws.budgets/creation-limit-exceeded-exception (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.budgets.creation-limit-exceeded-exception/message]))

(clojure.spec.alpha/def :portkey.aws.budgets/delete-notification-request (clojure.spec.alpha/keys :req-un [:portkey.aws.budgets/account-id :portkey.aws.budgets/budget-name :portkey.aws.budgets/notification] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.budgets/create-notification-request (clojure.spec.alpha/keys :req-un [:portkey.aws.budgets/account-id :portkey.aws.budgets/budget-name :portkey.aws.budgets/notification :portkey.aws.budgets/subscribers] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.budgets.describe-budgets-request/next-token (clojure.spec.alpha/and :portkey.aws.budgets/generic-string))
(clojure.spec.alpha/def :portkey.aws.budgets/describe-budgets-request (clojure.spec.alpha/keys :req-un [:portkey.aws.budgets/account-id] :opt-un [:portkey.aws.budgets/max-results :portkey.aws.budgets.describe-budgets-request/next-token]))

(clojure.spec.alpha/def :portkey.aws.budgets/error-message (clojure.spec.alpha/and clojure.core/string?))

(clojure.spec.alpha/def :portkey.aws.budgets.describe-notifications-for-budget-request/next-token (clojure.spec.alpha/and :portkey.aws.budgets/generic-string))
(clojure.spec.alpha/def :portkey.aws.budgets/describe-notifications-for-budget-request (clojure.spec.alpha/keys :req-un [:portkey.aws.budgets/account-id :portkey.aws.budgets/budget-name] :opt-un [:portkey.aws.budgets/max-results :portkey.aws.budgets.describe-notifications-for-budget-request/next-token]))

(clojure.spec.alpha/def :portkey.aws.budgets.describe-subscribers-for-notification-response/next-token (clojure.spec.alpha/and :portkey.aws.budgets/generic-string))
(clojure.spec.alpha/def :portkey.aws.budgets/describe-subscribers-for-notification-response (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.budgets/subscribers :portkey.aws.budgets.describe-subscribers-for-notification-response/next-token]))

(clojure.spec.alpha/def :portkey.aws.budgets.budget/budget-limit (clojure.spec.alpha/and :portkey.aws.budgets/spend))
(clojure.spec.alpha/def :portkey.aws.budgets/budget (clojure.spec.alpha/keys :req-un [:portkey.aws.budgets/budget-name :portkey.aws.budgets/time-unit :portkey.aws.budgets/budget-type] :opt-un [:portkey.aws.budgets.budget/budget-limit :portkey.aws.budgets/cost-filters :portkey.aws.budgets/cost-types :portkey.aws.budgets/time-period :portkey.aws.budgets/calculated-spend]))

(clojure.spec.alpha/def :portkey.aws.budgets/delete-subscriber-request (clojure.spec.alpha/keys :req-un [:portkey.aws.budgets/account-id :portkey.aws.budgets/budget-name :portkey.aws.budgets/notification :portkey.aws.budgets/subscriber] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.budgets.expired-next-token-exception/message (clojure.spec.alpha/and :portkey.aws.budgets/error-message))
(clojure.spec.alpha/def :portkey.aws.budgets/expired-next-token-exception (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.budgets.expired-next-token-exception/message]))

(clojure.spec.alpha/def :portkey.aws.budgets.spend/amount (clojure.spec.alpha/and :portkey.aws.budgets/numeric-value))
(clojure.spec.alpha/def :portkey.aws.budgets.spend/unit (clojure.spec.alpha/and :portkey.aws.budgets/unit-value))
(clojure.spec.alpha/def :portkey.aws.budgets/spend (clojure.spec.alpha/keys :req-un [:portkey.aws.budgets.spend/amount :portkey.aws.budgets.spend/unit] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.budgets/delete-subscriber-response (clojure.spec.alpha/keys :req-un [] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.budgets/time-unit #{:annually "QUARTERLY" :daily :monthly "MONTHLY" "DAILY" "ANNUALLY" :quarterly})

(clojure.spec.alpha/def :portkey.aws.budgets/unit-value (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__31194__auto__] (clojure.core/<= 1 (clojure.core/count s__31194__auto__)))))

(clojure.spec.alpha/def :portkey.aws.budgets.calculated-spend/actual-spend (clojure.spec.alpha/and :portkey.aws.budgets/spend))
(clojure.spec.alpha/def :portkey.aws.budgets.calculated-spend/forecasted-spend (clojure.spec.alpha/and :portkey.aws.budgets/spend))
(clojure.spec.alpha/def :portkey.aws.budgets/calculated-spend (clojure.spec.alpha/keys :req-un [:portkey.aws.budgets.calculated-spend/actual-spend] :opt-un [:portkey.aws.budgets.calculated-spend/forecasted-spend]))

(clojure.spec.alpha/def :portkey.aws.budgets/notification-with-subscribers-list (clojure.spec.alpha/coll-of :portkey.aws.budgets/notification-with-subscribers :max-count 5))

(clojure.spec.alpha/def :portkey.aws.budgets/update-notification-response (clojure.spec.alpha/keys :req-un [] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.budgets/comparison-operator #{"GREATER_THAN" :less-than :greater-than "LESS_THAN" :equal-to "EQUAL_TO"})

(clojure.spec.alpha/def :portkey.aws.budgets/nullable-boolean clojure.core/boolean?)

(clojure.spec.alpha/def :portkey.aws.budgets/notification-type #{"ACTUAL" "FORECASTED" :forecasted :actual})

(clojure.spec.alpha/def :portkey.aws.budgets/delete-budget-request (clojure.spec.alpha/keys :req-un [:portkey.aws.budgets/account-id :portkey.aws.budgets/budget-name] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.budgets/generic-timestamp clojure.core/inst?)

(clojure.spec.alpha/def :portkey.aws.budgets.update-budget-request/new-budget (clojure.spec.alpha/and :portkey.aws.budgets/budget))
(clojure.spec.alpha/def :portkey.aws.budgets/update-budget-request (clojure.spec.alpha/keys :req-un [:portkey.aws.budgets/account-id :portkey.aws.budgets.update-budget-request/new-budget] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.budgets/subscriber-address (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__31194__auto__] (clojure.core/<= 1 (clojure.core/count s__31194__auto__)))))

(clojure.spec.alpha/def :portkey.aws.budgets/delete-budget-response (clojure.spec.alpha/keys :req-un [] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.budgets.invalid-next-token-exception/message (clojure.spec.alpha/and :portkey.aws.budgets/error-message))
(clojure.spec.alpha/def :portkey.aws.budgets/invalid-next-token-exception (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.budgets.invalid-next-token-exception/message]))

(clojure.spec.alpha/def :portkey.aws.budgets.describe-budgets-response/next-token (clojure.spec.alpha/and :portkey.aws.budgets/generic-string))
(clojure.spec.alpha/def :portkey.aws.budgets/describe-budgets-response (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.budgets/budgets :portkey.aws.budgets.describe-budgets-response/next-token]))

(clojure.spec.alpha/def :portkey.aws.budgets.internal-error-exception/message (clojure.spec.alpha/and :portkey.aws.budgets/error-message))
(clojure.spec.alpha/def :portkey.aws.budgets/internal-error-exception (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.budgets.internal-error-exception/message]))

(clojure.spec.alpha/def :portkey.aws.budgets.cost-types/include-support (clojure.spec.alpha/and :portkey.aws.budgets/nullable-boolean))
(clojure.spec.alpha/def :portkey.aws.budgets.cost-types/include-other-subscription (clojure.spec.alpha/and :portkey.aws.budgets/nullable-boolean))
(clojure.spec.alpha/def :portkey.aws.budgets.cost-types/include-subscription (clojure.spec.alpha/and :portkey.aws.budgets/nullable-boolean))
(clojure.spec.alpha/def :portkey.aws.budgets.cost-types/include-upfront (clojure.spec.alpha/and :portkey.aws.budgets/nullable-boolean))
(clojure.spec.alpha/def :portkey.aws.budgets.cost-types/use-blended (clojure.spec.alpha/and :portkey.aws.budgets/nullable-boolean))
(clojure.spec.alpha/def :portkey.aws.budgets.cost-types/include-tax (clojure.spec.alpha/and :portkey.aws.budgets/nullable-boolean))
(clojure.spec.alpha/def :portkey.aws.budgets.cost-types/include-credit (clojure.spec.alpha/and :portkey.aws.budgets/nullable-boolean))
(clojure.spec.alpha/def :portkey.aws.budgets.cost-types/include-discount (clojure.spec.alpha/and :portkey.aws.budgets/nullable-boolean))
(clojure.spec.alpha/def :portkey.aws.budgets.cost-types/include-refund (clojure.spec.alpha/and :portkey.aws.budgets/nullable-boolean))
(clojure.spec.alpha/def :portkey.aws.budgets.cost-types/include-recurring (clojure.spec.alpha/and :portkey.aws.budgets/nullable-boolean))
(clojure.spec.alpha/def :portkey.aws.budgets.cost-types/use-amortized (clojure.spec.alpha/and :portkey.aws.budgets/nullable-boolean))
(clojure.spec.alpha/def :portkey.aws.budgets/cost-types (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.budgets.cost-types/include-support :portkey.aws.budgets.cost-types/include-other-subscription :portkey.aws.budgets.cost-types/include-subscription :portkey.aws.budgets.cost-types/include-upfront :portkey.aws.budgets.cost-types/use-blended :portkey.aws.budgets.cost-types/include-tax :portkey.aws.budgets.cost-types/include-credit :portkey.aws.budgets.cost-types/include-discount :portkey.aws.budgets.cost-types/include-refund :portkey.aws.budgets.cost-types/include-recurring :portkey.aws.budgets.cost-types/use-amortized]))

(clojure.spec.alpha/def :portkey.aws.budgets.time-period/start (clojure.spec.alpha/and :portkey.aws.budgets/generic-timestamp))
(clojure.spec.alpha/def :portkey.aws.budgets.time-period/end (clojure.spec.alpha/and :portkey.aws.budgets/generic-timestamp))
(clojure.spec.alpha/def :portkey.aws.budgets/time-period (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.budgets.time-period/start :portkey.aws.budgets.time-period/end]))

(clojure.spec.alpha/def :portkey.aws.budgets/notification-threshold clojure.core/double?)

(clojure.spec.alpha/def :portkey.aws.budgets/update-budget-response (clojure.spec.alpha/keys :req-un [] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.budgets.duplicate-record-exception/message (clojure.spec.alpha/and :portkey.aws.budgets/error-message))
(clojure.spec.alpha/def :portkey.aws.budgets/duplicate-record-exception (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.budgets.duplicate-record-exception/message]))

(clojure.spec.alpha/def :portkey.aws.budgets/generic-string (clojure.spec.alpha/and clojure.core/string?))

(clojure.spec.alpha/def :portkey.aws.budgets.update-notification-request/old-notification (clojure.spec.alpha/and :portkey.aws.budgets/notification))
(clojure.spec.alpha/def :portkey.aws.budgets.update-notification-request/new-notification (clojure.spec.alpha/and :portkey.aws.budgets/notification))
(clojure.spec.alpha/def :portkey.aws.budgets/update-notification-request (clojure.spec.alpha/keys :req-un [:portkey.aws.budgets/account-id :portkey.aws.budgets/budget-name :portkey.aws.budgets.update-notification-request/old-notification :portkey.aws.budgets.update-notification-request/new-notification] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.budgets.not-found-exception/message (clojure.spec.alpha/and :portkey.aws.budgets/error-message))
(clojure.spec.alpha/def :portkey.aws.budgets/not-found-exception (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.budgets.not-found-exception/message]))

(clojure.spec.alpha/def :portkey.aws.budgets.describe-subscribers-for-notification-request/next-token (clojure.spec.alpha/and :portkey.aws.budgets/generic-string))
(clojure.spec.alpha/def :portkey.aws.budgets/describe-subscribers-for-notification-request (clojure.spec.alpha/keys :req-un [:portkey.aws.budgets/account-id :portkey.aws.budgets/budget-name :portkey.aws.budgets/notification] :opt-un [:portkey.aws.budgets/max-results :portkey.aws.budgets.describe-subscribers-for-notification-request/next-token]))

(clojure.spec.alpha/def :portkey.aws.budgets/create-notification-response (clojure.spec.alpha/keys :req-un [] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.budgets.update-subscriber-request/old-subscriber (clojure.spec.alpha/and :portkey.aws.budgets/subscriber))
(clojure.spec.alpha/def :portkey.aws.budgets.update-subscriber-request/new-subscriber (clojure.spec.alpha/and :portkey.aws.budgets/subscriber))
(clojure.spec.alpha/def :portkey.aws.budgets/update-subscriber-request (clojure.spec.alpha/keys :req-un [:portkey.aws.budgets/account-id :portkey.aws.budgets/budget-name :portkey.aws.budgets/notification :portkey.aws.budgets.update-subscriber-request/old-subscriber :portkey.aws.budgets.update-subscriber-request/new-subscriber] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.budgets/describe-budget-request (clojure.spec.alpha/keys :req-un [:portkey.aws.budgets/account-id :portkey.aws.budgets/budget-name] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.budgets/account-id (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__31194__auto__] (clojure.core/<= 12 (clojure.core/count s__31194__auto__))) (clojure.core/fn [s__31195__auto__] (clojure.core/< (clojure.core/count s__31195__auto__) 12))))

(clojure.spec.alpha/def :portkey.aws.budgets/describe-budget-response (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.budgets/budget]))

(clojure.spec.alpha/def :portkey.aws.budgets/subscription-type #{:email :sns "SNS" "EMAIL"})

(clojure.spec.alpha/def :portkey.aws.budgets/subscribers (clojure.spec.alpha/coll-of :portkey.aws.budgets/subscriber :min-count 1 :max-count 11))

(clojure.spec.alpha/def :portkey.aws.budgets/numeric-value (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__31196__auto__] (clojure.core/re-matches #"([0-9]*\.)?[0-9]+" s__31196__auto__))))

(clojure.spec.alpha/def :portkey.aws.budgets/budget-name (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__31195__auto__] (clojure.core/< (clojure.core/count s__31195__auto__) 100)) (clojure.core/fn [s__31196__auto__] (clojure.core/re-matches #"[^:\\]+" s__31196__auto__))))

(clojure.spec.alpha/def :portkey.aws.budgets/delete-notification-response (clojure.spec.alpha/keys :req-un [] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.budgets/budgets (clojure.spec.alpha/coll-of :portkey.aws.budgets/budget))

(clojure.spec.alpha/def :portkey.aws.budgets/max-results (clojure.spec.alpha/int-in 1 100))

(clojure.spec.alpha/def :portkey.aws.budgets/notification-with-subscribers (clojure.spec.alpha/keys :req-un [:portkey.aws.budgets/notification :portkey.aws.budgets/subscribers] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.budgets/budget-type #{:ri-utilization :ri-coverage :usage "RI_UTILIZATION" :cost "USAGE" "COST" "RI_COVERAGE"})

(clojure.spec.alpha/def :portkey.aws.budgets.notification/threshold (clojure.spec.alpha/and :portkey.aws.budgets/notification-threshold))
(clojure.spec.alpha/def :portkey.aws.budgets/notification (clojure.spec.alpha/keys :req-un [:portkey.aws.budgets/notification-type :portkey.aws.budgets/comparison-operator :portkey.aws.budgets.notification/threshold] :opt-un [:portkey.aws.budgets/threshold-type]))

(clojure.spec.alpha/def :portkey.aws.budgets/dimension-values (clojure.spec.alpha/coll-of :portkey.aws.budgets/generic-string))

(clojure.spec.alpha/def :portkey.aws.budgets/update-subscriber-response (clojure.spec.alpha/keys :req-un [] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.budgets.invalid-parameter-exception/message (clojure.spec.alpha/and :portkey.aws.budgets/error-message))
(clojure.spec.alpha/def :portkey.aws.budgets/invalid-parameter-exception (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.budgets.invalid-parameter-exception/message]))

(clojure.spec.alpha/def :portkey.aws.budgets/notifications (clojure.spec.alpha/coll-of :portkey.aws.budgets/notification))

(clojure.spec.alpha/def :portkey.aws.budgets/create-subscriber-response (clojure.spec.alpha/keys :req-un [] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.budgets.create-budget-request/notifications-with-subscribers (clojure.spec.alpha/and :portkey.aws.budgets/notification-with-subscribers-list))
(clojure.spec.alpha/def :portkey.aws.budgets/create-budget-request (clojure.spec.alpha/keys :req-un [:portkey.aws.budgets/account-id :portkey.aws.budgets/budget] :opt-un [:portkey.aws.budgets.create-budget-request/notifications-with-subscribers]))

(clojure.spec.alpha/def :portkey.aws.budgets.subscriber/address (clojure.spec.alpha/and :portkey.aws.budgets/subscriber-address))
(clojure.spec.alpha/def :portkey.aws.budgets/subscriber (clojure.spec.alpha/keys :req-un [:portkey.aws.budgets/subscription-type :portkey.aws.budgets.subscriber/address] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.budgets.describe-notifications-for-budget-response/next-token (clojure.spec.alpha/and :portkey.aws.budgets/generic-string))
(clojure.spec.alpha/def :portkey.aws.budgets/describe-notifications-for-budget-response (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.budgets/notifications :portkey.aws.budgets.describe-notifications-for-budget-response/next-token]))

(clojure.spec.alpha/def :portkey.aws.budgets/create-subscriber-request (clojure.spec.alpha/keys :req-un [:portkey.aws.budgets/account-id :portkey.aws.budgets/budget-name :portkey.aws.budgets/notification :portkey.aws.budgets/subscriber] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.budgets/cost-filters (clojure.spec.alpha/map-of :portkey.aws.budgets/generic-string :portkey.aws.budgets/dimension-values))

(clojure.core/defn describe-budget ([describe-budget-requestinput] (clojure.core/let [request-function-result__31835__auto__ (req-describe-budget-request describe-budget-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__31835__auto__ {:http.request.configuration/endpoints portkey.aws.budgets/endpoints, :http.request.configuration/target-prefix "AWSBudgetServiceGateway", :http.request.spec/output-spec :portkey.aws.budgets/describe-budget-response, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2016-10-20", :http.request.configuration/service-id "Budgets", :http.request.spec/input-spec :portkey.aws.budgets/describe-budget-request, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/action "DescribeBudget", :http.request.spec/error-spec {"InternalErrorException" :portkey.aws.budgets/internal-error-exception, "InvalidParameterException" :portkey.aws.budgets/invalid-parameter-exception, "NotFoundException" :portkey.aws.budgets/not-found-exception}})))))
(clojure.spec.alpha/fdef describe-budget :args (clojure.spec.alpha/tuple :portkey.aws.budgets/describe-budget-request) :ret (clojure.spec.alpha/and :portkey.aws.budgets/describe-budget-response))

(clojure.core/defn create-notification ([create-notification-requestinput] (clojure.core/let [request-function-result__31835__auto__ (req-create-notification-request create-notification-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__31835__auto__ {:http.request.configuration/endpoints portkey.aws.budgets/endpoints, :http.request.configuration/target-prefix "AWSBudgetServiceGateway", :http.request.spec/output-spec :portkey.aws.budgets/create-notification-response, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2016-10-20", :http.request.configuration/service-id "Budgets", :http.request.spec/input-spec :portkey.aws.budgets/create-notification-request, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/action "CreateNotification", :http.request.spec/error-spec {"InternalErrorException" :portkey.aws.budgets/internal-error-exception, "InvalidParameterException" :portkey.aws.budgets/invalid-parameter-exception, "NotFoundException" :portkey.aws.budgets/not-found-exception, "CreationLimitExceededException" :portkey.aws.budgets/creation-limit-exceeded-exception, "DuplicateRecordException" :portkey.aws.budgets/duplicate-record-exception}})))))
(clojure.spec.alpha/fdef create-notification :args (clojure.spec.alpha/tuple :portkey.aws.budgets/create-notification-request) :ret (clojure.spec.alpha/and :portkey.aws.budgets/create-notification-response))

(clojure.core/defn describe-budgets ([describe-budgets-requestinput] (clojure.core/let [request-function-result__31835__auto__ (req-describe-budgets-request describe-budgets-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__31835__auto__ {:http.request.configuration/endpoints portkey.aws.budgets/endpoints, :http.request.configuration/target-prefix "AWSBudgetServiceGateway", :http.request.spec/output-spec :portkey.aws.budgets/describe-budgets-response, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2016-10-20", :http.request.configuration/service-id "Budgets", :http.request.spec/input-spec :portkey.aws.budgets/describe-budgets-request, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/action "DescribeBudgets", :http.request.spec/error-spec {"InternalErrorException" :portkey.aws.budgets/internal-error-exception, "InvalidParameterException" :portkey.aws.budgets/invalid-parameter-exception, "NotFoundException" :portkey.aws.budgets/not-found-exception, "InvalidNextTokenException" :portkey.aws.budgets/invalid-next-token-exception, "ExpiredNextTokenException" :portkey.aws.budgets/expired-next-token-exception}})))))
(clojure.spec.alpha/fdef describe-budgets :args (clojure.spec.alpha/tuple :portkey.aws.budgets/describe-budgets-request) :ret (clojure.spec.alpha/and :portkey.aws.budgets/describe-budgets-response))

(clojure.core/defn describe-subscribers-for-notification ([describe-subscribers-for-notification-requestinput] (clojure.core/let [request-function-result__31835__auto__ (req-describe-subscribers-for-notification-request describe-subscribers-for-notification-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__31835__auto__ {:http.request.configuration/endpoints portkey.aws.budgets/endpoints, :http.request.configuration/target-prefix "AWSBudgetServiceGateway", :http.request.spec/output-spec :portkey.aws.budgets/describe-subscribers-for-notification-response, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2016-10-20", :http.request.configuration/service-id "Budgets", :http.request.spec/input-spec :portkey.aws.budgets/describe-subscribers-for-notification-request, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/action "DescribeSubscribersForNotification", :http.request.spec/error-spec {"InternalErrorException" :portkey.aws.budgets/internal-error-exception, "NotFoundException" :portkey.aws.budgets/not-found-exception, "InvalidParameterException" :portkey.aws.budgets/invalid-parameter-exception, "InvalidNextTokenException" :portkey.aws.budgets/invalid-next-token-exception, "ExpiredNextTokenException" :portkey.aws.budgets/expired-next-token-exception}})))))
(clojure.spec.alpha/fdef describe-subscribers-for-notification :args (clojure.spec.alpha/tuple :portkey.aws.budgets/describe-subscribers-for-notification-request) :ret (clojure.spec.alpha/and :portkey.aws.budgets/describe-subscribers-for-notification-response))

(clojure.core/defn create-budget ([create-budget-requestinput] (clojure.core/let [request-function-result__31835__auto__ (req-create-budget-request create-budget-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__31835__auto__ {:http.request.configuration/endpoints portkey.aws.budgets/endpoints, :http.request.configuration/target-prefix "AWSBudgetServiceGateway", :http.request.spec/output-spec :portkey.aws.budgets/create-budget-response, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2016-10-20", :http.request.configuration/service-id "Budgets", :http.request.spec/input-spec :portkey.aws.budgets/create-budget-request, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/action "CreateBudget", :http.request.spec/error-spec {"InvalidParameterException" :portkey.aws.budgets/invalid-parameter-exception, "InternalErrorException" :portkey.aws.budgets/internal-error-exception, "CreationLimitExceededException" :portkey.aws.budgets/creation-limit-exceeded-exception, "DuplicateRecordException" :portkey.aws.budgets/duplicate-record-exception}})))))
(clojure.spec.alpha/fdef create-budget :args (clojure.spec.alpha/tuple :portkey.aws.budgets/create-budget-request) :ret (clojure.spec.alpha/and :portkey.aws.budgets/create-budget-response))

(clojure.core/defn create-subscriber ([create-subscriber-requestinput] (clojure.core/let [request-function-result__31835__auto__ (req-create-subscriber-request create-subscriber-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__31835__auto__ {:http.request.configuration/endpoints portkey.aws.budgets/endpoints, :http.request.configuration/target-prefix "AWSBudgetServiceGateway", :http.request.spec/output-spec :portkey.aws.budgets/create-subscriber-response, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2016-10-20", :http.request.configuration/service-id "Budgets", :http.request.spec/input-spec :portkey.aws.budgets/create-subscriber-request, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/action "CreateSubscriber", :http.request.spec/error-spec {"InternalErrorException" :portkey.aws.budgets/internal-error-exception, "InvalidParameterException" :portkey.aws.budgets/invalid-parameter-exception, "CreationLimitExceededException" :portkey.aws.budgets/creation-limit-exceeded-exception, "DuplicateRecordException" :portkey.aws.budgets/duplicate-record-exception, "NotFoundException" :portkey.aws.budgets/not-found-exception}})))))
(clojure.spec.alpha/fdef create-subscriber :args (clojure.spec.alpha/tuple :portkey.aws.budgets/create-subscriber-request) :ret (clojure.spec.alpha/and :portkey.aws.budgets/create-subscriber-response))

(clojure.core/defn delete-notification ([delete-notification-requestinput] (clojure.core/let [request-function-result__31835__auto__ (req-delete-notification-request delete-notification-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__31835__auto__ {:http.request.configuration/endpoints portkey.aws.budgets/endpoints, :http.request.configuration/target-prefix "AWSBudgetServiceGateway", :http.request.spec/output-spec :portkey.aws.budgets/delete-notification-response, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2016-10-20", :http.request.configuration/service-id "Budgets", :http.request.spec/input-spec :portkey.aws.budgets/delete-notification-request, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/action "DeleteNotification", :http.request.spec/error-spec {"InvalidParameterException" :portkey.aws.budgets/invalid-parameter-exception, "InternalErrorException" :portkey.aws.budgets/internal-error-exception, "NotFoundException" :portkey.aws.budgets/not-found-exception}})))))
(clojure.spec.alpha/fdef delete-notification :args (clojure.spec.alpha/tuple :portkey.aws.budgets/delete-notification-request) :ret (clojure.spec.alpha/and :portkey.aws.budgets/delete-notification-response))

(clojure.core/defn update-subscriber ([update-subscriber-requestinput] (clojure.core/let [request-function-result__31835__auto__ (req-update-subscriber-request update-subscriber-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__31835__auto__ {:http.request.configuration/endpoints portkey.aws.budgets/endpoints, :http.request.configuration/target-prefix "AWSBudgetServiceGateway", :http.request.spec/output-spec :portkey.aws.budgets/update-subscriber-response, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2016-10-20", :http.request.configuration/service-id "Budgets", :http.request.spec/input-spec :portkey.aws.budgets/update-subscriber-request, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/action "UpdateSubscriber", :http.request.spec/error-spec {"InternalErrorException" :portkey.aws.budgets/internal-error-exception, "InvalidParameterException" :portkey.aws.budgets/invalid-parameter-exception, "NotFoundException" :portkey.aws.budgets/not-found-exception, "DuplicateRecordException" :portkey.aws.budgets/duplicate-record-exception}})))))
(clojure.spec.alpha/fdef update-subscriber :args (clojure.spec.alpha/tuple :portkey.aws.budgets/update-subscriber-request) :ret (clojure.spec.alpha/and :portkey.aws.budgets/update-subscriber-response))

(clojure.core/defn update-budget ([update-budget-requestinput] (clojure.core/let [request-function-result__31835__auto__ (req-update-budget-request update-budget-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__31835__auto__ {:http.request.configuration/endpoints portkey.aws.budgets/endpoints, :http.request.configuration/target-prefix "AWSBudgetServiceGateway", :http.request.spec/output-spec :portkey.aws.budgets/update-budget-response, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2016-10-20", :http.request.configuration/service-id "Budgets", :http.request.spec/input-spec :portkey.aws.budgets/update-budget-request, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/action "UpdateBudget", :http.request.spec/error-spec {"InternalErrorException" :portkey.aws.budgets/internal-error-exception, "InvalidParameterException" :portkey.aws.budgets/invalid-parameter-exception, "NotFoundException" :portkey.aws.budgets/not-found-exception}})))))
(clojure.spec.alpha/fdef update-budget :args (clojure.spec.alpha/tuple :portkey.aws.budgets/update-budget-request) :ret (clojure.spec.alpha/and :portkey.aws.budgets/update-budget-response))

(clojure.core/defn delete-subscriber ([delete-subscriber-requestinput] (clojure.core/let [request-function-result__31835__auto__ (req-delete-subscriber-request delete-subscriber-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__31835__auto__ {:http.request.configuration/endpoints portkey.aws.budgets/endpoints, :http.request.configuration/target-prefix "AWSBudgetServiceGateway", :http.request.spec/output-spec :portkey.aws.budgets/delete-subscriber-response, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2016-10-20", :http.request.configuration/service-id "Budgets", :http.request.spec/input-spec :portkey.aws.budgets/delete-subscriber-request, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/action "DeleteSubscriber", :http.request.spec/error-spec {"InternalErrorException" :portkey.aws.budgets/internal-error-exception, "InvalidParameterException" :portkey.aws.budgets/invalid-parameter-exception, "NotFoundException" :portkey.aws.budgets/not-found-exception}})))))
(clojure.spec.alpha/fdef delete-subscriber :args (clojure.spec.alpha/tuple :portkey.aws.budgets/delete-subscriber-request) :ret (clojure.spec.alpha/and :portkey.aws.budgets/delete-subscriber-response))

(clojure.core/defn delete-budget ([delete-budget-requestinput] (clojure.core/let [request-function-result__31835__auto__ (req-delete-budget-request delete-budget-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__31835__auto__ {:http.request.configuration/endpoints portkey.aws.budgets/endpoints, :http.request.configuration/target-prefix "AWSBudgetServiceGateway", :http.request.spec/output-spec :portkey.aws.budgets/delete-budget-response, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2016-10-20", :http.request.configuration/service-id "Budgets", :http.request.spec/input-spec :portkey.aws.budgets/delete-budget-request, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/action "DeleteBudget", :http.request.spec/error-spec {"InternalErrorException" :portkey.aws.budgets/internal-error-exception, "InvalidParameterException" :portkey.aws.budgets/invalid-parameter-exception, "NotFoundException" :portkey.aws.budgets/not-found-exception}})))))
(clojure.spec.alpha/fdef delete-budget :args (clojure.spec.alpha/tuple :portkey.aws.budgets/delete-budget-request) :ret (clojure.spec.alpha/and :portkey.aws.budgets/delete-budget-response))

(clojure.core/defn describe-notifications-for-budget ([describe-notifications-for-budget-requestinput] (clojure.core/let [request-function-result__31835__auto__ (req-describe-notifications-for-budget-request describe-notifications-for-budget-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__31835__auto__ {:http.request.configuration/endpoints portkey.aws.budgets/endpoints, :http.request.configuration/target-prefix "AWSBudgetServiceGateway", :http.request.spec/output-spec :portkey.aws.budgets/describe-notifications-for-budget-response, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2016-10-20", :http.request.configuration/service-id "Budgets", :http.request.spec/input-spec :portkey.aws.budgets/describe-notifications-for-budget-request, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/action "DescribeNotificationsForBudget", :http.request.spec/error-spec {"InternalErrorException" :portkey.aws.budgets/internal-error-exception, "InvalidParameterException" :portkey.aws.budgets/invalid-parameter-exception, "NotFoundException" :portkey.aws.budgets/not-found-exception, "InvalidNextTokenException" :portkey.aws.budgets/invalid-next-token-exception, "ExpiredNextTokenException" :portkey.aws.budgets/expired-next-token-exception}})))))
(clojure.spec.alpha/fdef describe-notifications-for-budget :args (clojure.spec.alpha/tuple :portkey.aws.budgets/describe-notifications-for-budget-request) :ret (clojure.spec.alpha/and :portkey.aws.budgets/describe-notifications-for-budget-response))

(clojure.core/defn update-notification ([update-notification-requestinput] (clojure.core/let [request-function-result__31835__auto__ (req-update-notification-request update-notification-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__31835__auto__ {:http.request.configuration/endpoints portkey.aws.budgets/endpoints, :http.request.configuration/target-prefix "AWSBudgetServiceGateway", :http.request.spec/output-spec :portkey.aws.budgets/update-notification-response, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2016-10-20", :http.request.configuration/service-id "Budgets", :http.request.spec/input-spec :portkey.aws.budgets/update-notification-request, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/action "UpdateNotification", :http.request.spec/error-spec {"InternalErrorException" :portkey.aws.budgets/internal-error-exception, "InvalidParameterException" :portkey.aws.budgets/invalid-parameter-exception, "NotFoundException" :portkey.aws.budgets/not-found-exception, "DuplicateRecordException" :portkey.aws.budgets/duplicate-record-exception}})))))
(clojure.spec.alpha/fdef update-notification :args (clojure.spec.alpha/tuple :portkey.aws.budgets/update-notification-request) :ret (clojure.spec.alpha/and :portkey.aws.budgets/update-notification-response))
