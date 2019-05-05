(ns portkey.aws.marketplacecommerceanalytics (:require [portkey.aws]))

(def
 endpoints
 '{"us-east-1"
   {:credential-scope
    {:service "marketplacecommerceanalytics", :region "us-east-1"},
    :ssl-common-name
    "marketplacecommerceanalytics.us-east-1.amazonaws.com",
    :endpoint
    "https://marketplacecommerceanalytics.us-east-1.amazonaws.com",
    :signature-version :v4}})

(clojure.core/declare ser-optional-value)

(clojure.core/declare ser-data-set-publication-date)

(clojure.core/declare ser-from-date)

(clojure.core/declare ser-customer-defined-values)

(clojure.core/declare ser-optional-key)

(clojure.core/declare ser-role-name-arn)

(clojure.core/declare ser-sns-topic-arn)

(clojure.core/declare ser-destination-s-3-bucket-name)

(clojure.core/declare ser-support-data-set-type)

(clojure.core/declare ser-destination-s-3-prefix)

(clojure.core/declare ser-data-set-type)

(clojure.core/defn- ser-optional-value [input] #:http.request.field{:value input, :shape "OptionalValue"})

(clojure.core/defn- ser-data-set-publication-date [input] #:http.request.field{:value input, :shape "DataSetPublicationDate"})

(clojure.core/defn- ser-from-date [input] #:http.request.field{:value input, :shape "FromDate"})

(clojure.core/defn- ser-customer-defined-values [input] #:http.request.field{:value (clojure.core/into [] (clojure.core/map (clojure.core/fn [[k v]] [(clojure.core/into (ser-optional-key k) #:http.request.field{:map-info "key", :shape "OptionalKey"}) (clojure.core/into (ser-optional-value v) #:http.request.field{:map-info "value", :shape "OptionalValue"})])) input), :shape "CustomerDefinedValues", :type "map", :max 5, :min 1})

(clojure.core/defn- ser-optional-key [input] #:http.request.field{:value input, :shape "OptionalKey"})

(clojure.core/defn- ser-role-name-arn [input] #:http.request.field{:value input, :shape "RoleNameArn"})

(clojure.core/defn- ser-sns-topic-arn [input] #:http.request.field{:value input, :shape "SnsTopicArn"})

(clojure.core/defn- ser-destination-s-3-bucket-name [input] #:http.request.field{:value input, :shape "DestinationS3BucketName"})

(clojure.core/defn- ser-support-data-set-type [input] #:http.request.field{:value (clojure.core/get {"customer_support_contacts_data" "customer_support_contacts_data", :customer-support-contacts-data "customer_support_contacts_data", "test_customer_support_contacts_data" "test_customer_support_contacts_data", :test-customer-support-contacts-data "test_customer_support_contacts_data"} input), :shape "SupportDataSetType"})

(clojure.core/defn- ser-destination-s-3-prefix [input] #:http.request.field{:value input, :shape "DestinationS3Prefix"})

(clojure.core/defn- ser-data-set-type [input] #:http.request.field{:value (clojure.core/get {:customer-subscriber-annual-subscriptions "customer_subscriber_annual_subscriptions", "daily_business_usage_by_instance_type" "daily_business_usage_by_instance_type", "us_sales_and_use_tax_records" "us_sales_and_use_tax_records", :daily-business-new-instances "daily_business_new_instances", "customer_subscriber_hourly_monthly_subscriptions" "customer_subscriber_hourly_monthly_subscriptions", "customer_profile_by_revenue" "customer_profile_by_revenue", "disbursed_amount_by_age_of_disbursed_funds" "disbursed_amount_by_age_of_disbursed_funds", "daily_business_new_instances" "daily_business_new_instances", "customer_subscriber_annual_subscriptions" "customer_subscriber_annual_subscriptions", :disbursed-amount-by-product "disbursed_amount_by_product", "monthly_revenue_annual_subscriptions" "monthly_revenue_annual_subscriptions", :daily-business-usage-by-instance-type "daily_business_usage_by_instance_type", :daily-business-canceled-product-subscribers "daily_business_canceled_product_subscribers", :customer-profile-by-revenue "customer_profile_by_revenue", :daily-business-free-trial-conversions "daily_business_free_trial_conversions", "disbursed_amount_by_instance_hours" "disbursed_amount_by_instance_hours", "daily_business_new_product_subscribers" "daily_business_new_product_subscribers", "disbursed_amount_by_customer_geo" "disbursed_amount_by_customer_geo", "disbursed_amount_by_product" "disbursed_amount_by_product", :us-sales-and-use-tax-records "us_sales_and_use_tax_records", :daily-business-new-product-subscribers "daily_business_new_product_subscribers", :disbursed-amount-by-age-of-disbursed-funds "disbursed_amount_by_age_of_disbursed_funds", "daily_business_canceled_product_subscribers" "daily_business_canceled_product_subscribers", "daily_business_free_trial_conversions" "daily_business_free_trial_conversions", "disbursed_amount_by_product_with_uncollected_funds" "disbursed_amount_by_product_with_uncollected_funds", :monthly-revenue-billing-and-revenue-data "monthly_revenue_billing_and_revenue_data", :disbursed-amount-by-instance-hours "disbursed_amount_by_instance_hours", :sales-compensation-billed-revenue "sales_compensation_billed_revenue", "customer_profile_by_industry" "customer_profile_by_industry", "monthly_revenue_billing_and_revenue_data" "monthly_revenue_billing_and_revenue_data", :disbursed-amount-by-age-of-uncollected-funds "disbursed_amount_by_age_of_uncollected_funds", :customer-subscriber-hourly-monthly-subscriptions "customer_subscriber_hourly_monthly_subscriptions", :monthly-revenue-annual-subscriptions "monthly_revenue_annual_subscriptions", "daily_business_fees" "daily_business_fees", :disbursed-amount-by-product-with-uncollected-funds "disbursed_amount_by_product_with_uncollected_funds", :daily-business-fees "daily_business_fees", "disbursed_amount_by_age_of_uncollected_funds" "disbursed_amount_by_age_of_uncollected_funds", "sales_compensation_billed_revenue" "sales_compensation_billed_revenue", :disbursed-amount-by-customer-geo "disbursed_amount_by_customer_geo", :customer-profile-by-industry "customer_profile_by_industry", "customer_profile_by_geography" "customer_profile_by_geography", :customer-profile-by-geography "customer_profile_by_geography"} input), :shape "DataSetType"})

(clojure.core/defn- req-start-support-data-export-request [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (ser-support-data-set-type (input :data-set-type)) #:http.request.field{:name "dataSetType", :shape "SupportDataSetType"}) (clojure.core/into (ser-from-date (input :from-date)) #:http.request.field{:name "fromDate", :shape "FromDate"}) (clojure.core/into (ser-role-name-arn (input :role-name-arn)) #:http.request.field{:name "roleNameArn", :shape "RoleNameArn"}) (clojure.core/into (ser-destination-s-3-bucket-name (input :destination-s-3-bucket-name)) #:http.request.field{:name "destinationS3BucketName", :shape "DestinationS3BucketName"}) (clojure.core/into (ser-sns-topic-arn (input :sns-topic-arn)) #:http.request.field{:name "snsTopicArn", :shape "SnsTopicArn"})]} (clojure.core/contains? input :destination-s-3-prefix) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-destination-s-3-prefix (input :destination-s-3-prefix)) #:http.request.field{:name "destinationS3Prefix", :shape "DestinationS3Prefix"})) (clojure.core/contains? input :customer-defined-values) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-customer-defined-values (input :customer-defined-values)) #:http.request.field{:name "customerDefinedValues", :shape "CustomerDefinedValues"}))))

(clojure.core/defn- req-generate-data-set-request [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (ser-data-set-type (input :data-set-type)) #:http.request.field{:name "dataSetType", :shape "DataSetType"}) (clojure.core/into (ser-data-set-publication-date (input :data-set-publication-date)) #:http.request.field{:name "dataSetPublicationDate", :shape "DataSetPublicationDate"}) (clojure.core/into (ser-role-name-arn (input :role-name-arn)) #:http.request.field{:name "roleNameArn", :shape "RoleNameArn"}) (clojure.core/into (ser-destination-s-3-bucket-name (input :destination-s-3-bucket-name)) #:http.request.field{:name "destinationS3BucketName", :shape "DestinationS3BucketName"}) (clojure.core/into (ser-sns-topic-arn (input :sns-topic-arn)) #:http.request.field{:name "snsTopicArn", :shape "SnsTopicArn"})]} (clojure.core/contains? input :destination-s-3-prefix) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-destination-s-3-prefix (input :destination-s-3-prefix)) #:http.request.field{:name "destinationS3Prefix", :shape "DestinationS3Prefix"})) (clojure.core/contains? input :customer-defined-values) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-customer-defined-values (input :customer-defined-values)) #:http.request.field{:name "customerDefinedValues", :shape "CustomerDefinedValues"}))))

(clojure.core/declare deser-data-set-request-id)

(clojure.core/declare deser-exception-message)

(clojure.core/defn- deser-data-set-request-id [input] input)

(clojure.core/defn- deser-exception-message [input] input)

(clojure.core/defn- response-marketplace-commerce-analytics-exception ([input] (response-marketplace-commerce-analytics-exception nil input)) ([resultWrapper1263236 input] (clojure.core/let [rawinput1263235 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar1263237 {"message" (rawinput1263235 "message")}] (clojure.core/cond-> {} (letvar1263237 "message") (clojure.core/assoc :message (deser-exception-message (clojure.core/get-in letvar1263237 ["message"])))))))

(clojure.core/defn- response-generate-data-set-result ([input] (response-generate-data-set-result nil input)) ([resultWrapper1263239 input] (clojure.core/let [rawinput1263238 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar1263240 {"dataSetRequestId" (rawinput1263238 "dataSetRequestId")}] (clojure.core/cond-> {} (letvar1263240 "dataSetRequestId") (clojure.core/assoc :data-set-request-id (deser-data-set-request-id (clojure.core/get-in letvar1263240 ["dataSetRequestId"])))))))

(clojure.core/defn- response-start-support-data-export-result ([input] (response-start-support-data-export-result nil input)) ([resultWrapper1263242 input] (clojure.core/let [rawinput1263241 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar1263243 {"dataSetRequestId" (rawinput1263241 "dataSetRequestId")}] (clojure.core/cond-> {} (letvar1263243 "dataSetRequestId") (clojure.core/assoc :data-set-request-id (deser-data-set-request-id (clojure.core/get-in letvar1263243 ["dataSetRequestId"])))))))

(clojure.spec.alpha/def :portkey.aws.marketplacecommerceanalytics/optional-value (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__21076__auto__] (clojure.core/<= 1 (clojure.core/count s__21076__auto__))) (clojure.core/fn [s__21077__auto__] (clojure.core/< (clojure.core/count s__21077__auto__) 255))))

(clojure.spec.alpha/def :portkey.aws.marketplacecommerceanalytics.start-support-data-export-request/data-set-type (clojure.spec.alpha/and :portkey.aws.marketplacecommerceanalytics/support-data-set-type))
(clojure.spec.alpha/def :portkey.aws.marketplacecommerceanalytics.start-support-data-export-request/from-date (clojure.spec.alpha/and :portkey.aws.marketplacecommerceanalytics/from-date))
(clojure.spec.alpha/def :portkey.aws.marketplacecommerceanalytics.start-support-data-export-request/role-name-arn (clojure.spec.alpha/and :portkey.aws.marketplacecommerceanalytics/role-name-arn))
(clojure.spec.alpha/def :portkey.aws.marketplacecommerceanalytics.start-support-data-export-request/destination-s-3-bucket-name (clojure.spec.alpha/and :portkey.aws.marketplacecommerceanalytics/destination-s-3-bucket-name))
(clojure.spec.alpha/def :portkey.aws.marketplacecommerceanalytics.start-support-data-export-request/destination-s-3-prefix (clojure.spec.alpha/and :portkey.aws.marketplacecommerceanalytics/destination-s-3-prefix))
(clojure.spec.alpha/def :portkey.aws.marketplacecommerceanalytics.start-support-data-export-request/sns-topic-arn (clojure.spec.alpha/and :portkey.aws.marketplacecommerceanalytics/sns-topic-arn))
(clojure.spec.alpha/def :portkey.aws.marketplacecommerceanalytics.start-support-data-export-request/customer-defined-values (clojure.spec.alpha/and :portkey.aws.marketplacecommerceanalytics/customer-defined-values))
(clojure.spec.alpha/def :portkey.aws.marketplacecommerceanalytics/start-support-data-export-request (clojure.spec.alpha/keys :req-un [:portkey.aws.marketplacecommerceanalytics.start-support-data-export-request/data-set-type :portkey.aws.marketplacecommerceanalytics.start-support-data-export-request/from-date :portkey.aws.marketplacecommerceanalytics.start-support-data-export-request/role-name-arn :portkey.aws.marketplacecommerceanalytics.start-support-data-export-request/destination-s-3-bucket-name :portkey.aws.marketplacecommerceanalytics.start-support-data-export-request/sns-topic-arn] :opt-un [:portkey.aws.marketplacecommerceanalytics.start-support-data-export-request/destination-s-3-prefix :portkey.aws.marketplacecommerceanalytics.start-support-data-export-request/customer-defined-values]))

(clojure.spec.alpha/def :portkey.aws.marketplacecommerceanalytics/data-set-publication-date clojure.core/inst?)

(clojure.spec.alpha/def :portkey.aws.marketplacecommerceanalytics.marketplace-commerce-analytics-exception/message (clojure.spec.alpha/and :portkey.aws.marketplacecommerceanalytics/exception-message))
(clojure.spec.alpha/def :portkey.aws.marketplacecommerceanalytics/marketplace-commerce-analytics-exception (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.marketplacecommerceanalytics.marketplace-commerce-analytics-exception/message]))

(clojure.spec.alpha/def :portkey.aws.marketplacecommerceanalytics/from-date clojure.core/inst?)

(clojure.spec.alpha/def :portkey.aws.marketplacecommerceanalytics/data-set-request-id (clojure.spec.alpha/and clojure.core/string?))

(clojure.spec.alpha/def :portkey.aws.marketplacecommerceanalytics.generate-data-set-result/data-set-request-id (clojure.spec.alpha/and :portkey.aws.marketplacecommerceanalytics/data-set-request-id))
(clojure.spec.alpha/def :portkey.aws.marketplacecommerceanalytics/generate-data-set-result (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.marketplacecommerceanalytics.generate-data-set-result/data-set-request-id]))

(clojure.spec.alpha/def :portkey.aws.marketplacecommerceanalytics/customer-defined-values (clojure.spec.alpha/map-of :portkey.aws.marketplacecommerceanalytics/optional-key :portkey.aws.marketplacecommerceanalytics/optional-value))

(clojure.spec.alpha/def :portkey.aws.marketplacecommerceanalytics/optional-key (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__21076__auto__] (clojure.core/<= 1 (clojure.core/count s__21076__auto__))) (clojure.core/fn [s__21077__auto__] (clojure.core/< (clojure.core/count s__21077__auto__) 255))))

(clojure.spec.alpha/def :portkey.aws.marketplacecommerceanalytics/role-name-arn (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__21076__auto__] (clojure.core/<= 1 (clojure.core/count s__21076__auto__)))))

(clojure.spec.alpha/def :portkey.aws.marketplacecommerceanalytics/exception-message (clojure.spec.alpha/and clojure.core/string?))

(clojure.spec.alpha/def :portkey.aws.marketplacecommerceanalytics/sns-topic-arn (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__21076__auto__] (clojure.core/<= 1 (clojure.core/count s__21076__auto__)))))

(clojure.spec.alpha/def :portkey.aws.marketplacecommerceanalytics/destination-s-3-bucket-name (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__21076__auto__] (clojure.core/<= 1 (clojure.core/count s__21076__auto__)))))

(clojure.spec.alpha/def :portkey.aws.marketplacecommerceanalytics/support-data-set-type #{"customer_support_contacts_data" "test_customer_support_contacts_data" :customer-support-contacts-data :test-customer-support-contacts-data})

(clojure.spec.alpha/def :portkey.aws.marketplacecommerceanalytics/destination-s-3-prefix (clojure.spec.alpha/and clojure.core/string?))

(clojure.spec.alpha/def :portkey.aws.marketplacecommerceanalytics.start-support-data-export-result/data-set-request-id (clojure.spec.alpha/and :portkey.aws.marketplacecommerceanalytics/data-set-request-id))
(clojure.spec.alpha/def :portkey.aws.marketplacecommerceanalytics/start-support-data-export-result (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.marketplacecommerceanalytics.start-support-data-export-result/data-set-request-id]))

(clojure.spec.alpha/def :portkey.aws.marketplacecommerceanalytics.generate-data-set-request/data-set-type (clojure.spec.alpha/and :portkey.aws.marketplacecommerceanalytics/data-set-type))
(clojure.spec.alpha/def :portkey.aws.marketplacecommerceanalytics.generate-data-set-request/data-set-publication-date (clojure.spec.alpha/and :portkey.aws.marketplacecommerceanalytics/data-set-publication-date))
(clojure.spec.alpha/def :portkey.aws.marketplacecommerceanalytics.generate-data-set-request/role-name-arn (clojure.spec.alpha/and :portkey.aws.marketplacecommerceanalytics/role-name-arn))
(clojure.spec.alpha/def :portkey.aws.marketplacecommerceanalytics.generate-data-set-request/destination-s-3-bucket-name (clojure.spec.alpha/and :portkey.aws.marketplacecommerceanalytics/destination-s-3-bucket-name))
(clojure.spec.alpha/def :portkey.aws.marketplacecommerceanalytics.generate-data-set-request/destination-s-3-prefix (clojure.spec.alpha/and :portkey.aws.marketplacecommerceanalytics/destination-s-3-prefix))
(clojure.spec.alpha/def :portkey.aws.marketplacecommerceanalytics.generate-data-set-request/sns-topic-arn (clojure.spec.alpha/and :portkey.aws.marketplacecommerceanalytics/sns-topic-arn))
(clojure.spec.alpha/def :portkey.aws.marketplacecommerceanalytics.generate-data-set-request/customer-defined-values (clojure.spec.alpha/and :portkey.aws.marketplacecommerceanalytics/customer-defined-values))
(clojure.spec.alpha/def :portkey.aws.marketplacecommerceanalytics/generate-data-set-request (clojure.spec.alpha/keys :req-un [:portkey.aws.marketplacecommerceanalytics.generate-data-set-request/data-set-type :portkey.aws.marketplacecommerceanalytics.generate-data-set-request/data-set-publication-date :portkey.aws.marketplacecommerceanalytics.generate-data-set-request/role-name-arn :portkey.aws.marketplacecommerceanalytics.generate-data-set-request/destination-s-3-bucket-name :portkey.aws.marketplacecommerceanalytics.generate-data-set-request/sns-topic-arn] :opt-un [:portkey.aws.marketplacecommerceanalytics.generate-data-set-request/destination-s-3-prefix :portkey.aws.marketplacecommerceanalytics.generate-data-set-request/customer-defined-values]))

(clojure.spec.alpha/def :portkey.aws.marketplacecommerceanalytics/data-set-type #{:customer-subscriber-annual-subscriptions "daily_business_usage_by_instance_type" "us_sales_and_use_tax_records" :daily-business-new-instances "customer_subscriber_hourly_monthly_subscriptions" "customer_profile_by_revenue" "disbursed_amount_by_age_of_disbursed_funds" "daily_business_new_instances" "customer_subscriber_annual_subscriptions" :disbursed-amount-by-product "monthly_revenue_annual_subscriptions" :daily-business-usage-by-instance-type :daily-business-canceled-product-subscribers :customer-profile-by-revenue :daily-business-free-trial-conversions "disbursed_amount_by_instance_hours" "daily_business_new_product_subscribers" "disbursed_amount_by_customer_geo" "disbursed_amount_by_product" :us-sales-and-use-tax-records :daily-business-new-product-subscribers :disbursed-amount-by-age-of-disbursed-funds "daily_business_canceled_product_subscribers" "daily_business_free_trial_conversions" "disbursed_amount_by_product_with_uncollected_funds" :monthly-revenue-billing-and-revenue-data :disbursed-amount-by-instance-hours :sales-compensation-billed-revenue "customer_profile_by_industry" "monthly_revenue_billing_and_revenue_data" :disbursed-amount-by-age-of-uncollected-funds :customer-subscriber-hourly-monthly-subscriptions :monthly-revenue-annual-subscriptions "daily_business_fees" :disbursed-amount-by-product-with-uncollected-funds :daily-business-fees "disbursed_amount_by_age_of_uncollected_funds" "sales_compensation_billed_revenue" :disbursed-amount-by-customer-geo :customer-profile-by-industry "customer_profile_by_geography" :customer-profile-by-geography})

(clojure.core/defn generate-data-set "Given a data set type and data set publication date, asynchronously publishes\nthe requested data set to the specified S3 bucket and notifies the specified SNS\ntopic once the data is available. Returns a unique request identifier that can\nbe used to correlate requests with notifications from the SNS topic. Data sets\nwill be published in comma-separated values (CSV) format with the file name\n{data_set_type}_YYYY-MM-DD.csv. If a file with the same name already exists\n(e.g. if the same data set is requested twice), the original file will be\noverwritten by the new file. Requires a Role with an attached permissions policy\nproviding Allow permissions for the following actions: s3:PutObject,\ns3:GetBucketLocation, sns:GetTopicAttributes, sns:Publish, iam:GetRolePolicy." ([generate-data-set-requestinput] (clojure.core/let [request-function-result__22119__auto__ (req-generate-data-set-request generate-data-set-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__22119__auto__ {:http.request.configuration/endpoints portkey.aws.marketplacecommerceanalytics/endpoints, :http.request.configuration/target-prefix "MarketplaceCommerceAnalytics20150701", :http.request.spec/output-spec :portkey.aws.marketplacecommerceanalytics/generate-data-set-result, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2015-07-01", :http.request.configuration/service-id nil, :http.request.spec/input-spec :portkey.aws.marketplacecommerceanalytics/generate-data-set-request, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "GenerateDataSet", :http.request.configuration/output-deser-fn response-generate-data-set-result, :http.request.spec/error-spec {"MarketplaceCommerceAnalyticsException" :portkey.aws.marketplacecommerceanalytics/marketplace-commerce-analytics-exception}})))))
(clojure.spec.alpha/fdef generate-data-set :args (clojure.spec.alpha/tuple :portkey.aws.marketplacecommerceanalytics/generate-data-set-request) :ret (clojure.spec.alpha/and :portkey.aws.marketplacecommerceanalytics/generate-data-set-result))

(clojure.core/defn start-support-data-export "Given a data set type and a from date, asynchronously publishes the requested\ncustomer support data to the specified S3 bucket and notifies the specified SNS\ntopic once the data is available. Returns a unique request identifier that can\nbe used to correlate requests with notifications from the SNS topic. Data sets\nwill be published in comma-separated values (CSV) format with the file name\n{data_set_type}_YYYY-MM-DD'T'HH-mm-ss'Z'.csv. If a file with the same name\nalready exists (e.g. if the same data set is requested twice), the original file\nwill be overwritten by the new file. Requires a Role with an attached\npermissions policy providing Allow permissions for the following actions:\ns3:PutObject, s3:GetBucketLocation, sns:GetTopicAttributes, sns:Publish,\niam:GetRolePolicy." ([start-support-data-export-requestinput] (clojure.core/let [request-function-result__22119__auto__ (req-start-support-data-export-request start-support-data-export-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__22119__auto__ {:http.request.configuration/endpoints portkey.aws.marketplacecommerceanalytics/endpoints, :http.request.configuration/target-prefix "MarketplaceCommerceAnalytics20150701", :http.request.spec/output-spec :portkey.aws.marketplacecommerceanalytics/start-support-data-export-result, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2015-07-01", :http.request.configuration/service-id nil, :http.request.spec/input-spec :portkey.aws.marketplacecommerceanalytics/start-support-data-export-request, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "StartSupportDataExport", :http.request.configuration/output-deser-fn response-start-support-data-export-result, :http.request.spec/error-spec {"MarketplaceCommerceAnalyticsException" :portkey.aws.marketplacecommerceanalytics/marketplace-commerce-analytics-exception}})))))
(clojure.spec.alpha/fdef start-support-data-export :args (clojure.spec.alpha/tuple :portkey.aws.marketplacecommerceanalytics/start-support-data-export-request) :ret (clojure.spec.alpha/and :portkey.aws.marketplacecommerceanalytics/start-support-data-export-result))
