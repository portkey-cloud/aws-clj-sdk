(ns portkey.aws.monitoring.-2010-08-01 (:require [portkey.aws]))

(def
 endpoints
 '{"ap-northeast-1"
   {:credential-scope
    {:service "monitoring", :region "ap-northeast-1"},
    :ssl-common-name "monitoring.ap-northeast-1.amazonaws.com",
    :endpoint "https://monitoring.ap-northeast-1.amazonaws.com",
    :signature-version :v4},
   "eu-west-1"
   {:credential-scope {:service "monitoring", :region "eu-west-1"},
    :ssl-common-name "monitoring.eu-west-1.amazonaws.com",
    :endpoint "https://monitoring.eu-west-1.amazonaws.com",
    :signature-version :v4},
   "us-east-2"
   {:credential-scope {:service "monitoring", :region "us-east-2"},
    :ssl-common-name "monitoring.us-east-2.amazonaws.com",
    :endpoint "https://monitoring.us-east-2.amazonaws.com",
    :signature-version :v4},
   "ap-southeast-2"
   {:credential-scope
    {:service "monitoring", :region "ap-southeast-2"},
    :ssl-common-name "monitoring.ap-southeast-2.amazonaws.com",
    :endpoint "https://monitoring.ap-southeast-2.amazonaws.com",
    :signature-version :v4},
   "cn-north-1"
   {:credential-scope {:service "monitoring", :region "cn-north-1"},
    :ssl-common-name "monitoring.cn-north-1.amazonaws.com.cn",
    :endpoint "https://monitoring.cn-north-1.amazonaws.com.cn",
    :signature-version :v4},
   "sa-east-1"
   {:credential-scope {:service "monitoring", :region "sa-east-1"},
    :ssl-common-name "monitoring.sa-east-1.amazonaws.com",
    :endpoint "https://monitoring.sa-east-1.amazonaws.com",
    :signature-version :v4},
   "ap-southeast-1"
   {:credential-scope
    {:service "monitoring", :region "ap-southeast-1"},
    :ssl-common-name "monitoring.ap-southeast-1.amazonaws.com",
    :endpoint "https://monitoring.ap-southeast-1.amazonaws.com",
    :signature-version :v4},
   "cn-northwest-1"
   {:credential-scope
    {:service "monitoring", :region "cn-northwest-1"},
    :ssl-common-name "monitoring.cn-northwest-1.amazonaws.com.cn",
    :endpoint "https://monitoring.cn-northwest-1.amazonaws.com.cn",
    :signature-version :v4},
   "ap-northeast-2"
   {:credential-scope
    {:service "monitoring", :region "ap-northeast-2"},
    :ssl-common-name "monitoring.ap-northeast-2.amazonaws.com",
    :endpoint "https://monitoring.ap-northeast-2.amazonaws.com",
    :signature-version :v4},
   "eu-west-3"
   {:credential-scope {:service "monitoring", :region "eu-west-3"},
    :ssl-common-name "monitoring.eu-west-3.amazonaws.com",
    :endpoint "https://monitoring.eu-west-3.amazonaws.com",
    :signature-version :v4},
   "ca-central-1"
   {:credential-scope {:service "monitoring", :region "ca-central-1"},
    :ssl-common-name "monitoring.ca-central-1.amazonaws.com",
    :endpoint "https://monitoring.ca-central-1.amazonaws.com",
    :signature-version :v4},
   "eu-central-1"
   {:credential-scope {:service "monitoring", :region "eu-central-1"},
    :ssl-common-name "monitoring.eu-central-1.amazonaws.com",
    :endpoint "https://monitoring.eu-central-1.amazonaws.com",
    :signature-version :v4},
   "eu-west-2"
   {:credential-scope {:service "monitoring", :region "eu-west-2"},
    :ssl-common-name "monitoring.eu-west-2.amazonaws.com",
    :endpoint "https://monitoring.eu-west-2.amazonaws.com",
    :signature-version :v4},
   "us-gov-west-1"
   {:credential-scope {:service "monitoring", :region "us-gov-west-1"},
    :ssl-common-name "monitoring.us-gov-west-1.amazonaws.com",
    :endpoint "https://monitoring.us-gov-west-1.amazonaws.com",
    :signature-version :v4},
   "us-west-2"
   {:credential-scope {:service "monitoring", :region "us-west-2"},
    :ssl-common-name "monitoring.us-west-2.amazonaws.com",
    :endpoint "https://monitoring.us-west-2.amazonaws.com",
    :signature-version :v4},
   "us-east-1"
   {:credential-scope {:service "monitoring", :region "us-east-1"},
    :ssl-common-name "monitoring.us-east-1.amazonaws.com",
    :endpoint "https://monitoring.us-east-1.amazonaws.com",
    :signature-version :v4},
   "us-west-1"
   {:credential-scope {:service "monitoring", :region "us-west-1"},
    :ssl-common-name "monitoring.us-west-1.amazonaws.com",
    :endpoint "https://monitoring.us-west-1.amazonaws.com",
    :signature-version :v4},
   "ap-south-1"
   {:credential-scope {:service "monitoring", :region "ap-south-1"},
    :ssl-common-name "monitoring.ap-south-1.amazonaws.com",
    :endpoint "https://monitoring.ap-south-1.amazonaws.com",
    :signature-version :v4}})

(clojure.core/declare ser-standard-unit ser-storage-resolution ser-dimension-name ser-treat-missing-data ser-history-item-type ser-period ser-threshold ser-dimension-value ser-dimension-filters ser-metric-stat ser-state-value ser-max-records ser-dimension ser-comparison-operator ser-alarm-name-prefix ser-next-token ser-dashboard-name ser-get-metric-data-max-datapoints ser-state-reason-data ser-extended-statistics ser-dimensions ser-datapoints-to-alarm ser-metric-label ser-namespace ser-statistic-set ser-action-prefix ser-resource-name ser-dashboard-name-prefix ser-evaluate-low-sample-count-percentile ser-return-data ser-alarm-description ser-metric-id ser-alarm-name ser-metric ser-dimension-filter ser-resource-list ser-stat ser-extended-statistic ser-dashboard-body ser-metric-datum ser-timestamp ser-metric-data-query ser-statistics ser-metric-name ser-metric-data ser-dashboard-names ser-metric-data-queries ser-evaluation-periods ser-metric-expression ser-datapoint-value ser-state-reason ser-scan-by ser-statistic ser-alarm-names ser-actions-enabled)

(clojure.core/defn- ser-standard-unit [shape-input] ({:kilobytes/second "Kilobytes/Second", :megabits "Megabits", "Terabytes" "Terabytes", :kilobits/second "Kilobits/Second", :bits/second "Bits/Second", :terabits/second "Terabits/Second", :kilobits "Kilobits", "Kilobits/Second" "Kilobits/Second", :gigabits/second "Gigabits/Second", "Count" "Count", "Bits" "Bits", "Percent" "Percent", "Gigabits/Second" "Gigabits/Second", :terabytes "Terabytes", :megabytes/second "Megabytes/Second", "None" "None", :seconds "Seconds", :megabits/second "Megabits/Second", :bits "Bits", :terabits "Terabits", :kilobytes "Kilobytes", :microseconds "Microseconds", "Count/Second" "Count/Second", "Bytes" "Bytes", "Gigabytes/Second" "Gigabytes/Second", "Megabits/Second" "Megabits/Second", :gigabits "Gigabits", "Kilobytes/Second" "Kilobytes/Second", :megabytes "Megabytes", "Terabytes/Second" "Terabytes/Second", "Bits/Second" "Bits/Second", "Bytes/Second" "Bytes/Second", "Milliseconds" "Milliseconds", :count "Count", "Kilobytes" "Kilobytes", :bytes "Bytes", :milliseconds "Milliseconds", "Microseconds" "Microseconds", :percent "Percent", "Terabits" "Terabits", :count/second "Count/Second", :gigabytes/second "Gigabytes/Second", :gigabytes "Gigabytes", "Megabytes/Second" "Megabytes/Second", "Gigabytes" "Gigabytes", "Gigabits" "Gigabits", "Megabits" "Megabits", :none "None", "Kilobits" "Kilobits", "Terabits/Second" "Terabits/Second", "Megabytes" "Megabytes", "Seconds" "Seconds", :terabytes/second "Terabytes/Second", :bytes/second "Bytes/Second"} shape-input))
(clojure.core/defn- ser-storage-resolution [shape-input] shape-input)
(clojure.core/defn- ser-dimension-name [shape-input] shape-input)
(clojure.core/defn- ser-treat-missing-data [shape-input] shape-input)
(clojure.core/defn- ser-history-item-type [shape-input] ({"ConfigurationUpdate" "ConfigurationUpdate", :configuration-update "ConfigurationUpdate", "StateUpdate" "StateUpdate", :state-update "StateUpdate", "Action" "Action", :action "Action"} shape-input))
(clojure.core/defn- ser-period [shape-input] shape-input)
(clojure.core/defn- ser-threshold [shape-input] shape-input)
(clojure.core/defn- ser-dimension-value [shape-input] shape-input)
(clojure.core/defn- ser-dimension-filters [shape-input] (clojure.core/into {} (clojure.core/map-indexed (clojure.core/fn [idx__36486__auto__ item__36487__auto__] [(clojure.core/str "member." (clojure.core/inc idx__36486__auto__)) item__36487__auto__]) shape-input)))
(clojure.core/defn- ser-metric-stat [shape-input] (clojure.core/cond-> {} (:metric shape-input) (clojure.core/assoc "MetricStat.Metric" (ser-metric (:metric shape-input))) (:period shape-input) (clojure.core/assoc "MetricStat.Period" (ser-period (:period shape-input))) (:stat shape-input) (clojure.core/assoc "MetricStat.Stat" (ser-stat (:stat shape-input))) (:unit shape-input) (clojure.core/assoc "MetricStat.Unit" (ser-standard-unit (:unit shape-input)))))
(clojure.core/defn- ser-state-value [shape-input] ({"OK" "OK", :ok "OK", "ALARM" "ALARM", :alarm "ALARM", "INSUFFICIENT_DATA" "INSUFFICIENT_DATA", :insufficient-data "INSUFFICIENT_DATA"} shape-input))
(clojure.core/defn- ser-max-records [shape-input] shape-input)
(clojure.core/defn- ser-dimension [shape-input] (clojure.core/cond-> {} (:name shape-input) (clojure.core/assoc "Dimension.Name" (ser-dimension-name (:name shape-input))) (:value shape-input) (clojure.core/assoc "Dimension.Value" (ser-dimension-value (:value shape-input)))))
(clojure.core/defn- ser-comparison-operator [shape-input] ({"GreaterThanOrEqualToThreshold" "GreaterThanOrEqualToThreshold", :greater-than-or-equal-to-threshold "GreaterThanOrEqualToThreshold", "GreaterThanThreshold" "GreaterThanThreshold", :greater-than-threshold "GreaterThanThreshold", "LessThanThreshold" "LessThanThreshold", :less-than-threshold "LessThanThreshold", "LessThanOrEqualToThreshold" "LessThanOrEqualToThreshold", :less-than-or-equal-to-threshold "LessThanOrEqualToThreshold"} shape-input))
(clojure.core/defn- ser-alarm-name-prefix [shape-input] shape-input)
(clojure.core/defn- ser-next-token [shape-input] shape-input)
(clojure.core/defn- ser-dashboard-name [shape-input] shape-input)
(clojure.core/defn- ser-get-metric-data-max-datapoints [shape-input] shape-input)
(clojure.core/defn- ser-state-reason-data [shape-input] shape-input)
(clojure.core/defn- ser-extended-statistics [shape-input] (clojure.core/into {} (clojure.core/map-indexed (clojure.core/fn [idx__36486__auto__ item__36487__auto__] [(clojure.core/str "member." (clojure.core/inc idx__36486__auto__)) item__36487__auto__]) shape-input)))
(clojure.core/defn- ser-dimensions [shape-input] (clojure.core/into {} (clojure.core/map-indexed (clojure.core/fn [idx__36486__auto__ item__36487__auto__] [(clojure.core/str "member." (clojure.core/inc idx__36486__auto__)) item__36487__auto__]) shape-input)))
(clojure.core/defn- ser-datapoints-to-alarm [shape-input] shape-input)
(clojure.core/defn- ser-metric-label [shape-input] shape-input)
(clojure.core/defn- ser-namespace [shape-input] shape-input)
(clojure.core/defn- ser-statistic-set [shape-input] (clojure.core/cond-> {} (:sample-count shape-input) (clojure.core/assoc "StatisticSet.SampleCount" (ser-datapoint-value (:sample-count shape-input))) (:sum shape-input) (clojure.core/assoc "StatisticSet.Sum" (ser-datapoint-value (:sum shape-input))) (:minimum shape-input) (clojure.core/assoc "StatisticSet.Minimum" (ser-datapoint-value (:minimum shape-input))) (:maximum shape-input) (clojure.core/assoc "StatisticSet.Maximum" (ser-datapoint-value (:maximum shape-input)))))
(clojure.core/defn- ser-action-prefix [shape-input] shape-input)
(clojure.core/defn- ser-resource-name [shape-input] shape-input)
(clojure.core/defn- ser-dashboard-name-prefix [shape-input] shape-input)
(clojure.core/defn- ser-evaluate-low-sample-count-percentile [shape-input] shape-input)
(clojure.core/defn- ser-return-data [shape-input] shape-input)
(clojure.core/defn- ser-alarm-description [shape-input] shape-input)
(clojure.core/defn- ser-metric-id [shape-input] shape-input)
(clojure.core/defn- ser-alarm-name [shape-input] shape-input)
(clojure.core/defn- ser-metric [shape-input] (clojure.core/cond-> {} (:namespace shape-input) (clojure.core/assoc "Metric.Namespace" (ser-namespace (:namespace shape-input))) (:metric-name shape-input) (clojure.core/assoc "Metric.MetricName" (ser-metric-name (:metric-name shape-input))) (:dimensions shape-input) (clojure.core/assoc "Metric.Dimensions" (ser-dimensions (:dimensions shape-input)))))
(clojure.core/defn- ser-dimension-filter [shape-input] (clojure.core/cond-> {} (:name shape-input) (clojure.core/assoc "DimensionFilter.Name" (ser-dimension-name (:name shape-input))) (:value shape-input) (clojure.core/assoc "DimensionFilter.Value" (ser-dimension-value (:value shape-input)))))
(clojure.core/defn- ser-resource-list [shape-input] (clojure.core/into {} (clojure.core/map-indexed (clojure.core/fn [idx__36486__auto__ item__36487__auto__] [(clojure.core/str "member." (clojure.core/inc idx__36486__auto__)) item__36487__auto__]) shape-input)))
(clojure.core/defn- ser-stat [shape-input] shape-input)
(clojure.core/defn- ser-extended-statistic [shape-input] shape-input)
(clojure.core/defn- ser-dashboard-body [shape-input] shape-input)
(clojure.core/defn- ser-metric-datum [shape-input] (clojure.core/cond-> {} (:metric-name shape-input) (clojure.core/assoc "MetricDatum.MetricName" (ser-metric-name (:metric-name shape-input))) (:dimensions shape-input) (clojure.core/assoc "MetricDatum.Dimensions" (ser-dimensions (:dimensions shape-input))) (:timestamp shape-input) (clojure.core/assoc "MetricDatum.Timestamp" (ser-timestamp (:timestamp shape-input))) (:value shape-input) (clojure.core/assoc "MetricDatum.Value" (ser-datapoint-value (:value shape-input))) (:statistic-values shape-input) (clojure.core/assoc "MetricDatum.StatisticValues" (ser-statistic-set (:statistic-values shape-input))) (:unit shape-input) (clojure.core/assoc "MetricDatum.Unit" (ser-standard-unit (:unit shape-input))) (:storage-resolution shape-input) (clojure.core/assoc "MetricDatum.StorageResolution" (ser-storage-resolution (:storage-resolution shape-input)))))
(clojure.core/defn- ser-timestamp [shape-input] shape-input)
(clojure.core/defn- ser-metric-data-query [shape-input] (clojure.core/cond-> {} (:id shape-input) (clojure.core/assoc "MetricDataQuery.Id" (ser-metric-id (:id shape-input))) (:metric-stat shape-input) (clojure.core/assoc "MetricDataQuery.MetricStat" (ser-metric-stat (:metric-stat shape-input))) (:expression shape-input) (clojure.core/assoc "MetricDataQuery.Expression" (ser-metric-expression (:expression shape-input))) (:label shape-input) (clojure.core/assoc "MetricDataQuery.Label" (ser-metric-label (:label shape-input))) (:return-data shape-input) (clojure.core/assoc "MetricDataQuery.ReturnData" (ser-return-data (:return-data shape-input)))))
(clojure.core/defn- ser-statistics [shape-input] (clojure.core/into {} (clojure.core/map-indexed (clojure.core/fn [idx__36486__auto__ item__36487__auto__] [(clojure.core/str "member." (clojure.core/inc idx__36486__auto__)) item__36487__auto__]) shape-input)))
(clojure.core/defn- ser-metric-name [shape-input] shape-input)
(clojure.core/defn- ser-metric-data [shape-input] (clojure.core/into {} (clojure.core/map-indexed (clojure.core/fn [idx__36486__auto__ item__36487__auto__] [(clojure.core/str "member." (clojure.core/inc idx__36486__auto__)) item__36487__auto__]) shape-input)))
(clojure.core/defn- ser-dashboard-names [shape-input] (clojure.core/into {} (clojure.core/map-indexed (clojure.core/fn [idx__36486__auto__ item__36487__auto__] [(clojure.core/str "member." (clojure.core/inc idx__36486__auto__)) item__36487__auto__]) shape-input)))
(clojure.core/defn- ser-metric-data-queries [shape-input] (clojure.core/into {} (clojure.core/map-indexed (clojure.core/fn [idx__36486__auto__ item__36487__auto__] [(clojure.core/str "member." (clojure.core/inc idx__36486__auto__)) item__36487__auto__]) shape-input)))
(clojure.core/defn- ser-evaluation-periods [shape-input] shape-input)
(clojure.core/defn- ser-metric-expression [shape-input] shape-input)
(clojure.core/defn- ser-datapoint-value [shape-input] shape-input)
(clojure.core/defn- ser-state-reason [shape-input] shape-input)
(clojure.core/defn- ser-scan-by [shape-input] ({"TimestampDescending" "TimestampDescending", :timestamp-descending "TimestampDescending", "TimestampAscending" "TimestampAscending", :timestamp-ascending "TimestampAscending"} shape-input))
(clojure.core/defn- ser-statistic [shape-input] ({"Sum" "Sum", "Average" "Average", :maximum "Maximum", "SampleCount" "SampleCount", "Minimum" "Minimum", :sample-count "SampleCount", :minimum "Minimum", :average "Average", :sum "Sum", "Maximum" "Maximum"} shape-input))
(clojure.core/defn- ser-alarm-names [shape-input] (clojure.core/into {} (clojure.core/map-indexed (clojure.core/fn [idx__36486__auto__ item__36487__auto__] [(clojure.core/str "member." (clojure.core/inc idx__36486__auto__)) item__36487__auto__]) shape-input)))
(clojure.core/defn- ser-actions-enabled [shape-input] shape-input)

(clojure.core/defn req<-delete-dashboards-input [action-name62009 input62008] {:body {"DashboardNames" (ser-dashboard-names (input62008 :dashboard-names)), "Version" "2010-08-01", "Action" action-name62009}})
(clojure.core/defn req<-delete-alarms-input [action-name62011 input62010] {:body {"AlarmNames" (ser-alarm-names (input62010 :alarm-names)), "Version" "2010-08-01", "Action" action-name62011}})
(clojure.core/defn req<-describe-alarms-input [action-name62013 input62012] (clojure.core/cond-> {:body {"Version" "2010-08-01", "Action" action-name62013}} (clojure.core/contains? input62012 :alarm-names) (clojure.core/assoc-in [:body "AlarmNames"] (ser-alarm-names (input62012 :alarm-names))) (clojure.core/contains? input62012 :alarm-name-prefix) (clojure.core/assoc-in [:body "AlarmNamePrefix"] (ser-alarm-name-prefix (input62012 :alarm-name-prefix))) (clojure.core/contains? input62012 :state-value) (clojure.core/assoc-in [:body "StateValue"] (ser-state-value (input62012 :state-value))) (clojure.core/contains? input62012 :action-prefix) (clojure.core/assoc-in [:body "ActionPrefix"] (ser-action-prefix (input62012 :action-prefix))) (clojure.core/contains? input62012 :max-records) (clojure.core/assoc-in [:body "MaxRecords"] (ser-max-records (input62012 :max-records))) (clojure.core/contains? input62012 :next-token) (clojure.core/assoc-in [:body "NextToken"] (ser-next-token (input62012 :next-token)))))
(clojure.core/defn req<-get-metric-statistics-input [action-name62015 input62014] (clojure.core/let [input62016 {:body {"EndTime" (ser-timestamp (input62014 :end-time)), "Period" (ser-period (input62014 :period)), "StartTime" (ser-timestamp (input62014 :start-time)), "Namespace" (ser-namespace (input62014 :namespace)), "MetricName" (ser-metric-name (input62014 :metric-name)), "Version" "2010-08-01", "Action" action-name62015}}] (clojure.core/cond-> input62016 (clojure.core/contains? input62014 :unit) (clojure.core/assoc-in [:body "Unit"] (ser-standard-unit (input62014 :unit))) (clojure.core/contains? input62014 :extended-statistics) (clojure.core/assoc-in [:body "ExtendedStatistics"] (ser-extended-statistics (input62014 :extended-statistics))) (clojure.core/contains? input62014 :dimensions) (clojure.core/assoc-in [:body "Dimensions"] (ser-dimensions (input62014 :dimensions))) (clojure.core/contains? input62014 :statistics) (clojure.core/assoc-in [:body "Statistics"] (ser-statistics (input62014 :statistics))))))
(clojure.core/defn req<-list-dashboards-input [action-name62018 input62017] (clojure.core/cond-> {:body {"Version" "2010-08-01", "Action" action-name62018}} (clojure.core/contains? input62017 :dashboard-name-prefix) (clojure.core/assoc-in [:body "DashboardNamePrefix"] (ser-dashboard-name-prefix (input62017 :dashboard-name-prefix))) (clojure.core/contains? input62017 :next-token) (clojure.core/assoc-in [:body "NextToken"] (ser-next-token (input62017 :next-token)))))
(clojure.core/defn req<-put-dashboard-input [action-name62020 input62019] {:body {"DashboardName" (ser-dashboard-name (input62019 :dashboard-name)), "DashboardBody" (ser-dashboard-body (input62019 :dashboard-body)), "Version" "2010-08-01", "Action" action-name62020}})
(clojure.core/defn req<-enable-alarm-actions-input [action-name62022 input62021] {:body {"AlarmNames" (ser-alarm-names (input62021 :alarm-names)), "Version" "2010-08-01", "Action" action-name62022}})
(clojure.core/defn req<-list-metrics-input [action-name62024 input62023] (clojure.core/cond-> {:body {"Version" "2010-08-01", "Action" action-name62024}} (clojure.core/contains? input62023 :namespace) (clojure.core/assoc-in [:body "Namespace"] (ser-namespace (input62023 :namespace))) (clojure.core/contains? input62023 :metric-name) (clojure.core/assoc-in [:body "MetricName"] (ser-metric-name (input62023 :metric-name))) (clojure.core/contains? input62023 :dimensions) (clojure.core/assoc-in [:body "Dimensions"] (ser-dimension-filters (input62023 :dimensions))) (clojure.core/contains? input62023 :next-token) (clojure.core/assoc-in [:body "NextToken"] (ser-next-token (input62023 :next-token)))))
(clojure.core/defn req<-put-metric-data-input [action-name62026 input62025] {:body {"Namespace" (ser-namespace (input62025 :namespace)), "MetricData" (ser-metric-data (input62025 :metric-data)), "Version" "2010-08-01", "Action" action-name62026}})
(clojure.core/defn req<-describe-alarms-for-metric-input [action-name62028 input62027] (clojure.core/let [input62029 {:body {"MetricName" (ser-metric-name (input62027 :metric-name)), "Namespace" (ser-namespace (input62027 :namespace)), "Version" "2010-08-01", "Action" action-name62028}}] (clojure.core/cond-> input62029 (clojure.core/contains? input62027 :statistic) (clojure.core/assoc-in [:body "Statistic"] (ser-statistic (input62027 :statistic))) (clojure.core/contains? input62027 :extended-statistic) (clojure.core/assoc-in [:body "ExtendedStatistic"] (ser-extended-statistic (input62027 :extended-statistic))) (clojure.core/contains? input62027 :dimensions) (clojure.core/assoc-in [:body "Dimensions"] (ser-dimensions (input62027 :dimensions))) (clojure.core/contains? input62027 :period) (clojure.core/assoc-in [:body "Period"] (ser-period (input62027 :period))) (clojure.core/contains? input62027 :unit) (clojure.core/assoc-in [:body "Unit"] (ser-standard-unit (input62027 :unit))))))
(clojure.core/defn req<-set-alarm-state-input [action-name62031 input62030] (clojure.core/let [input62032 {:body {"AlarmName" (ser-alarm-name (input62030 :alarm-name)), "StateValue" (ser-state-value (input62030 :state-value)), "StateReason" (ser-state-reason (input62030 :state-reason)), "Version" "2010-08-01", "Action" action-name62031}}] (clojure.core/cond-> input62032 (clojure.core/contains? input62030 :state-reason-data) (clojure.core/assoc-in [:body "StateReasonData"] (ser-state-reason-data (input62030 :state-reason-data))))))
(clojure.core/defn req<-put-metric-alarm-input [action-name62034 input62033] (clojure.core/let [input62035 {:body {"Period" (ser-period (input62033 :period)), "Threshold" (ser-threshold (input62033 :threshold)), "ComparisonOperator" (ser-comparison-operator (input62033 :comparison-operator)), "Namespace" (ser-namespace (input62033 :namespace)), "AlarmName" (ser-alarm-name (input62033 :alarm-name)), "MetricName" (ser-metric-name (input62033 :metric-name)), "EvaluationPeriods" (ser-evaluation-periods (input62033 :evaluation-periods)), "Version" "2010-08-01", "Action" action-name62034}}] (clojure.core/cond-> input62035 (clojure.core/contains? input62033 :unit) (clojure.core/assoc-in [:body "Unit"] (ser-standard-unit (input62033 :unit))) (clojure.core/contains? input62033 :treat-missing-data) (clojure.core/assoc-in [:body "TreatMissingData"] (ser-treat-missing-data (input62033 :treat-missing-data))) (clojure.core/contains? input62033 :okactions) (clojure.core/assoc-in [:body "OKActions"] (ser-resource-list (input62033 :okactions))) (clojure.core/contains? input62033 :insufficient-data-actions) (clojure.core/assoc-in [:body "InsufficientDataActions"] (ser-resource-list (input62033 :insufficient-data-actions))) (clojure.core/contains? input62033 :dimensions) (clojure.core/assoc-in [:body "Dimensions"] (ser-dimensions (input62033 :dimensions))) (clojure.core/contains? input62033 :datapoints-to-alarm) (clojure.core/assoc-in [:body "DatapointsToAlarm"] (ser-datapoints-to-alarm (input62033 :datapoints-to-alarm))) (clojure.core/contains? input62033 :alarm-actions) (clojure.core/assoc-in [:body "AlarmActions"] (ser-resource-list (input62033 :alarm-actions))) (clojure.core/contains? input62033 :evaluate-low-sample-count-percentile) (clojure.core/assoc-in [:body "EvaluateLowSampleCountPercentile"] (ser-evaluate-low-sample-count-percentile (input62033 :evaluate-low-sample-count-percentile))) (clojure.core/contains? input62033 :alarm-description) (clojure.core/assoc-in [:body "AlarmDescription"] (ser-alarm-description (input62033 :alarm-description))) (clojure.core/contains? input62033 :extended-statistic) (clojure.core/assoc-in [:body "ExtendedStatistic"] (ser-extended-statistic (input62033 :extended-statistic))) (clojure.core/contains? input62033 :statistic) (clojure.core/assoc-in [:body "Statistic"] (ser-statistic (input62033 :statistic))) (clojure.core/contains? input62033 :actions-enabled) (clojure.core/assoc-in [:body "ActionsEnabled"] (ser-actions-enabled (input62033 :actions-enabled))))))
(clojure.core/defn req<-get-dashboard-input [action-name62037 input62036] {:body {"DashboardName" (ser-dashboard-name (input62036 :dashboard-name)), "Version" "2010-08-01", "Action" action-name62037}})
(clojure.core/defn req<-get-metric-data-input [action-name62039 input62038] (clojure.core/let [input62040 {:body {"MetricDataQueries" (ser-metric-data-queries (input62038 :metric-data-queries)), "StartTime" (ser-timestamp (input62038 :start-time)), "EndTime" (ser-timestamp (input62038 :end-time)), "Version" "2010-08-01", "Action" action-name62039}}] (clojure.core/cond-> input62040 (clojure.core/contains? input62038 :next-token) (clojure.core/assoc-in [:body "NextToken"] (ser-next-token (input62038 :next-token))) (clojure.core/contains? input62038 :scan-by) (clojure.core/assoc-in [:body "ScanBy"] (ser-scan-by (input62038 :scan-by))) (clojure.core/contains? input62038 :max-datapoints) (clojure.core/assoc-in [:body "MaxDatapoints"] (ser-get-metric-data-max-datapoints (input62038 :max-datapoints))))))
(clojure.core/defn req<-disable-alarm-actions-input [action-name62042 input62041] {:body {"AlarmNames" (ser-alarm-names (input62041 :alarm-names)), "Version" "2010-08-01", "Action" action-name62042}})
(clojure.core/defn req<-describe-alarm-history-input [action-name62044 input62043] (clojure.core/cond-> {:body {"Version" "2010-08-01", "Action" action-name62044}} (clojure.core/contains? input62043 :alarm-name) (clojure.core/assoc-in [:body "AlarmName"] (ser-alarm-name (input62043 :alarm-name))) (clojure.core/contains? input62043 :history-item-type) (clojure.core/assoc-in [:body "HistoryItemType"] (ser-history-item-type (input62043 :history-item-type))) (clojure.core/contains? input62043 :start-date) (clojure.core/assoc-in [:body "StartDate"] (ser-timestamp (input62043 :start-date))) (clojure.core/contains? input62043 :end-date) (clojure.core/assoc-in [:body "EndDate"] (ser-timestamp (input62043 :end-date))) (clojure.core/contains? input62043 :max-records) (clojure.core/assoc-in [:body "MaxRecords"] (ser-max-records (input62043 :max-records))) (clojure.core/contains? input62043 :next-token) (clojure.core/assoc-in [:body "NextToken"] (ser-next-token (input62043 :next-token)))))

(clojure.spec.alpha/def :portkey.aws.monitoring.-2010-08-01/standard-unit {:kilobytes/second "Kilobytes/Second", :megabits "Megabits", "Terabytes" "Terabytes", :kilobits/second "Kilobits/Second", :bits/second "Bits/Second", :terabits/second "Terabits/Second", :kilobits "Kilobits", "Kilobits/Second" "Kilobits/Second", :gigabits/second "Gigabits/Second", "Count" "Count", "Bits" "Bits", "Percent" "Percent", "Gigabits/Second" "Gigabits/Second", :terabytes "Terabytes", :megabytes/second "Megabytes/Second", "None" "None", :seconds "Seconds", :megabits/second "Megabits/Second", :bits "Bits", :terabits "Terabits", :kilobytes "Kilobytes", :microseconds "Microseconds", "Count/Second" "Count/Second", "Bytes" "Bytes", "Gigabytes/Second" "Gigabytes/Second", "Megabits/Second" "Megabits/Second", :gigabits "Gigabits", "Kilobytes/Second" "Kilobytes/Second", :megabytes "Megabytes", "Terabytes/Second" "Terabytes/Second", "Bits/Second" "Bits/Second", "Bytes/Second" "Bytes/Second", "Milliseconds" "Milliseconds", :count "Count", "Kilobytes" "Kilobytes", :bytes "Bytes", :milliseconds "Milliseconds", "Microseconds" "Microseconds", :percent "Percent", "Terabits" "Terabits", :count/second "Count/Second", :gigabytes/second "Gigabytes/Second", :gigabytes "Gigabytes", "Megabytes/Second" "Megabytes/Second", "Gigabytes" "Gigabytes", "Gigabits" "Gigabits", "Megabits" "Megabits", :none "None", "Kilobits" "Kilobits", "Terabits/Second" "Terabits/Second", "Megabytes" "Megabytes", "Seconds" "Seconds", :terabytes/second "Terabytes/Second", :bytes/second "Bytes/Second"})

(clojure.spec.alpha/def :portkey.aws.monitoring.-2010-08-01/storage-resolution (clojure.spec.alpha/int-in 1 Long/MAX_VALUE))

(clojure.spec.alpha/def :portkey.aws.monitoring.-2010-08-01/dimension-name (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__36226__auto__] (clojure.core/<= 1 (clojure.core/count s__36226__auto__))) (clojure.core/fn [s__36227__auto__] (clojure.core/< (clojure.core/count s__36227__auto__) 255))))

(clojure.spec.alpha/def :portkey.aws.monitoring.-2010-08-01.get-metric-data-input/start-time (clojure.spec.alpha/and :portkey.aws.monitoring.-2010-08-01/timestamp))
(clojure.spec.alpha/def :portkey.aws.monitoring.-2010-08-01.get-metric-data-input/end-time (clojure.spec.alpha/and :portkey.aws.monitoring.-2010-08-01/timestamp))
(clojure.spec.alpha/def :portkey.aws.monitoring.-2010-08-01.get-metric-data-input/max-datapoints (clojure.spec.alpha/and :portkey.aws.monitoring.-2010-08-01/get-metric-data-max-datapoints))
(clojure.spec.alpha/def :portkey.aws.monitoring.-2010-08-01/get-metric-data-input (portkey.aws/json-keys :req-un [:portkey.aws.monitoring.-2010-08-01/MetricDataQueries :portkey.aws.monitoring.-2010-08-01.get-metric-data-input/StartTime :portkey.aws.monitoring.-2010-08-01.get-metric-data-input/EndTime] :opt-un [:portkey.aws.monitoring.-2010-08-01/NextToken :portkey.aws.monitoring.-2010-08-01/ScanBy :portkey.aws.monitoring.-2010-08-01.get-metric-data-input/MaxDatapoints] :locations {}))

(clojure.spec.alpha/def :portkey.aws.monitoring.-2010-08-01/treat-missing-data (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__36226__auto__] (clojure.core/<= 1 (clojure.core/count s__36226__auto__))) (clojure.core/fn [s__36227__auto__] (clojure.core/< (clojure.core/count s__36227__auto__) 255))))

(clojure.spec.alpha/def :portkey.aws.monitoring.-2010-08-01/history-item-type {"ConfigurationUpdate" "ConfigurationUpdate", :configuration-update "ConfigurationUpdate", "StateUpdate" "StateUpdate", :state-update "StateUpdate", "Action" "Action", :action "Action"})

(clojure.spec.alpha/def :portkey.aws.monitoring.-2010-08-01/dashboard-error-message (clojure.spec.alpha/and clojure.core/string?))

(clojure.spec.alpha/def :portkey.aws.monitoring.-2010-08-01/period (clojure.spec.alpha/int-in 1 Long/MAX_VALUE))

(clojure.spec.alpha/def :portkey.aws.monitoring.-2010-08-01.message-data/code (clojure.spec.alpha/and :portkey.aws.monitoring.-2010-08-01/message-data-code))
(clojure.spec.alpha/def :portkey.aws.monitoring.-2010-08-01.message-data/value (clojure.spec.alpha/and :portkey.aws.monitoring.-2010-08-01/message-data-value))
(clojure.spec.alpha/def :portkey.aws.monitoring.-2010-08-01/message-data (portkey.aws/json-keys :req-un [] :opt-un [:portkey.aws.monitoring.-2010-08-01.message-data/Code :portkey.aws.monitoring.-2010-08-01.message-data/Value] :locations {}))

(clojure.spec.alpha/def :portkey.aws.monitoring.-2010-08-01.missing-required-parameter-exception/message (clojure.spec.alpha/and :portkey.aws.monitoring.-2010-08-01/aws-query-error-message))
(clojure.spec.alpha/def :portkey.aws.monitoring.-2010-08-01/missing-required-parameter-exception (portkey.aws/json-keys :req-un [] :opt-un [:portkey.aws.monitoring.-2010-08-01.missing-required-parameter-exception/message] :locations {}))

(clojure.spec.alpha/def :portkey.aws.monitoring.-2010-08-01/threshold clojure.core/double?)

(clojure.spec.alpha/def :portkey.aws.monitoring.-2010-08-01/data-path (clojure.spec.alpha/and clojure.core/string?))

(clojure.spec.alpha/def :portkey.aws.monitoring.-2010-08-01/set-alarm-state-input (portkey.aws/json-keys :req-un [:portkey.aws.monitoring.-2010-08-01/AlarmName :portkey.aws.monitoring.-2010-08-01/StateValue :portkey.aws.monitoring.-2010-08-01/StateReason] :opt-un [:portkey.aws.monitoring.-2010-08-01/StateReasonData] :locations {}))

(clojure.spec.alpha/def :portkey.aws.monitoring.-2010-08-01/status-code {"Complete" "Complete", :complete "Complete", "InternalError" "InternalError", :internal-error "InternalError", "PartialData" "PartialData", :partial-data "PartialData"})

(clojure.spec.alpha/def :portkey.aws.monitoring.-2010-08-01/metric-data-result-messages (clojure.spec.alpha/coll-of :portkey.aws.monitoring.-2010-08-01/message-data))

(clojure.spec.alpha/def :portkey.aws.monitoring.-2010-08-01/dimension-value (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__36226__auto__] (clojure.core/<= 1 (clojure.core/count s__36226__auto__))) (clojure.core/fn [s__36227__auto__] (clojure.core/< (clojure.core/count s__36227__auto__) 255))))

(clojure.spec.alpha/def :portkey.aws.monitoring.-2010-08-01/dimension-filters (clojure.spec.alpha/coll-of :portkey.aws.monitoring.-2010-08-01/dimension-filter :max-count 10))

(clojure.spec.alpha/def :portkey.aws.monitoring.-2010-08-01/describe-alarms-output (portkey.aws/json-keys :req-un [] :opt-un [:portkey.aws.monitoring.-2010-08-01/MetricAlarms :portkey.aws.monitoring.-2010-08-01/NextToken] :locations {}))

(clojure.spec.alpha/def :portkey.aws.monitoring.-2010-08-01/put-metric-data-input (portkey.aws/json-keys :req-un [:portkey.aws.monitoring.-2010-08-01/Namespace :portkey.aws.monitoring.-2010-08-01/MetricData] :opt-un [] :locations {}))

(clojure.spec.alpha/def :portkey.aws.monitoring.-2010-08-01/disable-alarm-actions-input (portkey.aws/json-keys :req-un [:portkey.aws.monitoring.-2010-08-01/AlarmNames] :opt-un [] :locations {}))

(clojure.spec.alpha/def :portkey.aws.monitoring.-2010-08-01.metric-stat/unit (clojure.spec.alpha/and :portkey.aws.monitoring.-2010-08-01/standard-unit))
(clojure.spec.alpha/def :portkey.aws.monitoring.-2010-08-01/metric-stat (portkey.aws/json-keys :req-un [:portkey.aws.monitoring.-2010-08-01/Metric :portkey.aws.monitoring.-2010-08-01/Period :portkey.aws.monitoring.-2010-08-01/Stat] :opt-un [:portkey.aws.monitoring.-2010-08-01.metric-stat/Unit] :locations {}))

(clojure.spec.alpha/def :portkey.aws.monitoring.-2010-08-01/describe-alarms-input (portkey.aws/json-keys :req-un [] :opt-un [:portkey.aws.monitoring.-2010-08-01/AlarmNames :portkey.aws.monitoring.-2010-08-01/AlarmNamePrefix :portkey.aws.monitoring.-2010-08-01/StateValue :portkey.aws.monitoring.-2010-08-01/ActionPrefix :portkey.aws.monitoring.-2010-08-01/MaxRecords :portkey.aws.monitoring.-2010-08-01/NextToken] :locations {}))

(clojure.spec.alpha/def :portkey.aws.monitoring.-2010-08-01/state-value {"OK" "OK", :ok "OK", "ALARM" "ALARM", :alarm "ALARM", "INSUFFICIENT_DATA" "INSUFFICIENT_DATA", :insufficient-data "INSUFFICIENT_DATA"})

(clojure.spec.alpha/def :portkey.aws.monitoring.-2010-08-01/get-metric-data-output (portkey.aws/json-keys :req-un [] :opt-un [:portkey.aws.monitoring.-2010-08-01/MetricDataResults :portkey.aws.monitoring.-2010-08-01/NextToken] :locations {}))

(clojure.spec.alpha/def :portkey.aws.monitoring.-2010-08-01.list-metrics-input/dimensions (clojure.spec.alpha/and :portkey.aws.monitoring.-2010-08-01/dimension-filters))
(clojure.spec.alpha/def :portkey.aws.monitoring.-2010-08-01/list-metrics-input (portkey.aws/json-keys :req-un [] :opt-un [:portkey.aws.monitoring.-2010-08-01/Namespace :portkey.aws.monitoring.-2010-08-01/MetricName :portkey.aws.monitoring.-2010-08-01.list-metrics-input/Dimensions :portkey.aws.monitoring.-2010-08-01/NextToken] :locations {}))

(clojure.spec.alpha/def :portkey.aws.monitoring.-2010-08-01/put-dashboard-output (portkey.aws/json-keys :req-un [] :opt-un [:portkey.aws.monitoring.-2010-08-01/DashboardValidationMessages] :locations {}))

(clojure.spec.alpha/def :portkey.aws.monitoring.-2010-08-01/max-records (clojure.spec.alpha/int-in 1 100))

(clojure.spec.alpha/def :portkey.aws.monitoring.-2010-08-01.dimension/name (clojure.spec.alpha/and :portkey.aws.monitoring.-2010-08-01/dimension-name))
(clojure.spec.alpha/def :portkey.aws.monitoring.-2010-08-01.dimension/value (clojure.spec.alpha/and :portkey.aws.monitoring.-2010-08-01/dimension-value))
(clojure.spec.alpha/def :portkey.aws.monitoring.-2010-08-01/dimension (portkey.aws/json-keys :req-un [:portkey.aws.monitoring.-2010-08-01.dimension/Name :portkey.aws.monitoring.-2010-08-01.dimension/Value] :opt-un [] :locations {}))

(clojure.spec.alpha/def :portkey.aws.monitoring.-2010-08-01/comparison-operator {"GreaterThanOrEqualToThreshold" "GreaterThanOrEqualToThreshold", :greater-than-or-equal-to-threshold "GreaterThanOrEqualToThreshold", "GreaterThanThreshold" "GreaterThanThreshold", :greater-than-threshold "GreaterThanThreshold", "LessThanThreshold" "LessThanThreshold", :less-than-threshold "LessThanThreshold", "LessThanOrEqualToThreshold" "LessThanOrEqualToThreshold", :less-than-or-equal-to-threshold "LessThanOrEqualToThreshold"})

(clojure.spec.alpha/def :portkey.aws.monitoring.-2010-08-01/dashboard-arn (clojure.spec.alpha/and clojure.core/string?))

(clojure.spec.alpha/def :portkey.aws.monitoring.-2010-08-01/history-data (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__36226__auto__] (clojure.core/<= 1 (clojure.core/count s__36226__auto__))) (clojure.core/fn [s__36227__auto__] (clojure.core/< (clojure.core/count s__36227__auto__) 4095))))

(clojure.spec.alpha/def :portkey.aws.monitoring.-2010-08-01.get-metric-statistics-output/label (clojure.spec.alpha/and :portkey.aws.monitoring.-2010-08-01/metric-label))
(clojure.spec.alpha/def :portkey.aws.monitoring.-2010-08-01/get-metric-statistics-output (portkey.aws/json-keys :req-un [] :opt-un [:portkey.aws.monitoring.-2010-08-01.get-metric-statistics-output/Label :portkey.aws.monitoring.-2010-08-01/Datapoints] :locations {}))

(clojure.spec.alpha/def :portkey.aws.monitoring.-2010-08-01.get-metric-statistics-input/unit (clojure.spec.alpha/and :portkey.aws.monitoring.-2010-08-01/standard-unit))
(clojure.spec.alpha/def :portkey.aws.monitoring.-2010-08-01.get-metric-statistics-input/end-time (clojure.spec.alpha/and :portkey.aws.monitoring.-2010-08-01/timestamp))
(clojure.spec.alpha/def :portkey.aws.monitoring.-2010-08-01.get-metric-statistics-input/start-time (clojure.spec.alpha/and :portkey.aws.monitoring.-2010-08-01/timestamp))
(clojure.spec.alpha/def :portkey.aws.monitoring.-2010-08-01/get-metric-statistics-input (portkey.aws/json-keys :req-un [:portkey.aws.monitoring.-2010-08-01/Namespace :portkey.aws.monitoring.-2010-08-01/MetricName :portkey.aws.monitoring.-2010-08-01.get-metric-statistics-input/StartTime :portkey.aws.monitoring.-2010-08-01.get-metric-statistics-input/EndTime :portkey.aws.monitoring.-2010-08-01/Period] :opt-un [:portkey.aws.monitoring.-2010-08-01.get-metric-statistics-input/Unit :portkey.aws.monitoring.-2010-08-01/ExtendedStatistics :portkey.aws.monitoring.-2010-08-01/Dimensions :portkey.aws.monitoring.-2010-08-01/Statistics] :locations {}))

(clojure.spec.alpha/def :portkey.aws.monitoring.-2010-08-01.datapoint/sample-count (clojure.spec.alpha/and :portkey.aws.monitoring.-2010-08-01/datapoint-value))
(clojure.spec.alpha/def :portkey.aws.monitoring.-2010-08-01.datapoint/average (clojure.spec.alpha/and :portkey.aws.monitoring.-2010-08-01/datapoint-value))
(clojure.spec.alpha/def :portkey.aws.monitoring.-2010-08-01.datapoint/sum (clojure.spec.alpha/and :portkey.aws.monitoring.-2010-08-01/datapoint-value))
(clojure.spec.alpha/def :portkey.aws.monitoring.-2010-08-01.datapoint/minimum (clojure.spec.alpha/and :portkey.aws.monitoring.-2010-08-01/datapoint-value))
(clojure.spec.alpha/def :portkey.aws.monitoring.-2010-08-01.datapoint/maximum (clojure.spec.alpha/and :portkey.aws.monitoring.-2010-08-01/datapoint-value))
(clojure.spec.alpha/def :portkey.aws.monitoring.-2010-08-01.datapoint/unit (clojure.spec.alpha/and :portkey.aws.monitoring.-2010-08-01/standard-unit))
(clojure.spec.alpha/def :portkey.aws.monitoring.-2010-08-01.datapoint/extended-statistics (clojure.spec.alpha/and :portkey.aws.monitoring.-2010-08-01/datapoint-value-map))
(clojure.spec.alpha/def :portkey.aws.monitoring.-2010-08-01/datapoint (portkey.aws/json-keys :req-un [] :opt-un [:portkey.aws.monitoring.-2010-08-01/Timestamp :portkey.aws.monitoring.-2010-08-01.datapoint/SampleCount :portkey.aws.monitoring.-2010-08-01.datapoint/Average :portkey.aws.monitoring.-2010-08-01.datapoint/Sum :portkey.aws.monitoring.-2010-08-01.datapoint/Minimum :portkey.aws.monitoring.-2010-08-01.datapoint/Maximum :portkey.aws.monitoring.-2010-08-01.datapoint/Unit :portkey.aws.monitoring.-2010-08-01.datapoint/ExtendedStatistics] :locations {}))

(clojure.spec.alpha/def :portkey.aws.monitoring.-2010-08-01.metric-data-result/id (clojure.spec.alpha/and :portkey.aws.monitoring.-2010-08-01/metric-id))
(clojure.spec.alpha/def :portkey.aws.monitoring.-2010-08-01.metric-data-result/label (clojure.spec.alpha/and :portkey.aws.monitoring.-2010-08-01/metric-label))
(clojure.spec.alpha/def :portkey.aws.monitoring.-2010-08-01.metric-data-result/values (clojure.spec.alpha/and :portkey.aws.monitoring.-2010-08-01/datapoint-values))
(clojure.spec.alpha/def :portkey.aws.monitoring.-2010-08-01.metric-data-result/messages (clojure.spec.alpha/and :portkey.aws.monitoring.-2010-08-01/metric-data-result-messages))
(clojure.spec.alpha/def :portkey.aws.monitoring.-2010-08-01/metric-data-result (portkey.aws/json-keys :req-un [] :opt-un [:portkey.aws.monitoring.-2010-08-01.metric-data-result/Id :portkey.aws.monitoring.-2010-08-01.metric-data-result/Label :portkey.aws.monitoring.-2010-08-01/Timestamps :portkey.aws.monitoring.-2010-08-01.metric-data-result/Values :portkey.aws.monitoring.-2010-08-01/StatusCode :portkey.aws.monitoring.-2010-08-01.metric-data-result/Messages] :locations {}))

(clojure.spec.alpha/def :portkey.aws.monitoring.-2010-08-01/dashboard-entries (clojure.spec.alpha/coll-of :portkey.aws.monitoring.-2010-08-01/dashboard-entry))

(clojure.spec.alpha/def :portkey.aws.monitoring.-2010-08-01/alarm-name-prefix (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__36226__auto__] (clojure.core/<= 1 (clojure.core/count s__36226__auto__))) (clojure.core/fn [s__36227__auto__] (clojure.core/< (clojure.core/count s__36227__auto__) 255))))

(clojure.spec.alpha/def :portkey.aws.monitoring.-2010-08-01/next-token (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__36226__auto__] (clojure.core/<= 0 (clojure.core/count s__36226__auto__))) (clojure.core/fn [s__36227__auto__] (clojure.core/< (clojure.core/count s__36227__auto__) 1024))))

(clojure.spec.alpha/def :portkey.aws.monitoring.-2010-08-01/error-message (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__36226__auto__] (clojure.core/<= 1 (clojure.core/count s__36226__auto__))) (clojure.core/fn [s__36227__auto__] (clojure.core/< (clojure.core/count s__36227__auto__) 255))))

(clojure.spec.alpha/def :portkey.aws.monitoring.-2010-08-01/dashboard-name (clojure.spec.alpha/and clojure.core/string?))

(clojure.spec.alpha/def :portkey.aws.monitoring.-2010-08-01/get-metric-data-max-datapoints clojure.core/int?)

(clojure.spec.alpha/def :portkey.aws.monitoring.-2010-08-01/delete-dashboards-output (portkey.aws/json-keys :req-un [] :opt-un [] :locations {}))

(clojure.spec.alpha/def :portkey.aws.monitoring.-2010-08-01.internal-service-fault/message (clojure.spec.alpha/and :portkey.aws.monitoring.-2010-08-01/fault-description))
(clojure.spec.alpha/def :portkey.aws.monitoring.-2010-08-01/internal-service-fault (portkey.aws/json-keys :req-un [] :opt-un [:portkey.aws.monitoring.-2010-08-01.internal-service-fault/Message] :locations {}))

(clojure.spec.alpha/def :portkey.aws.monitoring.-2010-08-01/dashboard-validation-message (portkey.aws/json-keys :req-un [] :opt-un [:portkey.aws.monitoring.-2010-08-01/DataPath :portkey.aws.monitoring.-2010-08-01/Message] :locations {}))

(clojure.spec.alpha/def :portkey.aws.monitoring.-2010-08-01/dashboard-entry (portkey.aws/json-keys :req-un [] :opt-un [:portkey.aws.monitoring.-2010-08-01/DashboardName :portkey.aws.monitoring.-2010-08-01/DashboardArn :portkey.aws.monitoring.-2010-08-01/LastModified :portkey.aws.monitoring.-2010-08-01/Size] :locations {}))

(clojure.spec.alpha/def :portkey.aws.monitoring.-2010-08-01.dashboard-not-found-error/message (clojure.spec.alpha/and :portkey.aws.monitoring.-2010-08-01/dashboard-error-message))
(clojure.spec.alpha/def :portkey.aws.monitoring.-2010-08-01/dashboard-not-found-error (portkey.aws/json-keys :req-un [] :opt-un [:portkey.aws.monitoring.-2010-08-01.dashboard-not-found-error/message] :locations {}))

(clojure.spec.alpha/def :portkey.aws.monitoring.-2010-08-01/describe-alarms-for-metric-output (portkey.aws/json-keys :req-un [] :opt-un [:portkey.aws.monitoring.-2010-08-01/MetricAlarms] :locations {}))

(clojure.spec.alpha/def :portkey.aws.monitoring.-2010-08-01/history-summary (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__36226__auto__] (clojure.core/<= 1 (clojure.core/count s__36226__auto__))) (clojure.core/fn [s__36227__auto__] (clojure.core/< (clojure.core/count s__36227__auto__) 255))))

(clojure.spec.alpha/def :portkey.aws.monitoring.-2010-08-01/state-reason-data (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__36226__auto__] (clojure.core/<= 0 (clojure.core/count s__36226__auto__))) (clojure.core/fn [s__36227__auto__] (clojure.core/< (clojure.core/count s__36227__auto__) 4000))))

(clojure.spec.alpha/def :portkey.aws.monitoring.-2010-08-01/dashboard-validation-messages (clojure.spec.alpha/coll-of :portkey.aws.monitoring.-2010-08-01/dashboard-validation-message))

(clojure.spec.alpha/def :portkey.aws.monitoring.-2010-08-01.metric-alarm/unit (clojure.spec.alpha/and :portkey.aws.monitoring.-2010-08-01/standard-unit))
(clojure.spec.alpha/def :portkey.aws.monitoring.-2010-08-01.metric-alarm/okactions (clojure.spec.alpha/and :portkey.aws.monitoring.-2010-08-01/resource-list))
(clojure.spec.alpha/def :portkey.aws.monitoring.-2010-08-01.metric-alarm/state-updated-timestamp (clojure.spec.alpha/and :portkey.aws.monitoring.-2010-08-01/timestamp))
(clojure.spec.alpha/def :portkey.aws.monitoring.-2010-08-01.metric-alarm/insufficient-data-actions (clojure.spec.alpha/and :portkey.aws.monitoring.-2010-08-01/resource-list))
(clojure.spec.alpha/def :portkey.aws.monitoring.-2010-08-01.metric-alarm/alarm-actions (clojure.spec.alpha/and :portkey.aws.monitoring.-2010-08-01/resource-list))
(clojure.spec.alpha/def :portkey.aws.monitoring.-2010-08-01.metric-alarm/alarm-configuration-updated-timestamp (clojure.spec.alpha/and :portkey.aws.monitoring.-2010-08-01/timestamp))
(clojure.spec.alpha/def :portkey.aws.monitoring.-2010-08-01/metric-alarm (portkey.aws/json-keys :req-un [] :opt-un [:portkey.aws.monitoring.-2010-08-01.metric-alarm/Unit :portkey.aws.monitoring.-2010-08-01/TreatMissingData :portkey.aws.monitoring.-2010-08-01/Period :portkey.aws.monitoring.-2010-08-01/Threshold :portkey.aws.monitoring.-2010-08-01.metric-alarm/OKActions :portkey.aws.monitoring.-2010-08-01/StateValue :portkey.aws.monitoring.-2010-08-01.metric-alarm/StateUpdatedTimestamp :portkey.aws.monitoring.-2010-08-01.metric-alarm/InsufficientDataActions :portkey.aws.monitoring.-2010-08-01/ComparisonOperator :portkey.aws.monitoring.-2010-08-01/StateReasonData :portkey.aws.monitoring.-2010-08-01/Dimensions :portkey.aws.monitoring.-2010-08-01/DatapointsToAlarm :portkey.aws.monitoring.-2010-08-01/Namespace :portkey.aws.monitoring.-2010-08-01.metric-alarm/AlarmActions :portkey.aws.monitoring.-2010-08-01/EvaluateLowSampleCountPercentile :portkey.aws.monitoring.-2010-08-01/AlarmDescription :portkey.aws.monitoring.-2010-08-01/AlarmName :portkey.aws.monitoring.-2010-08-01/ExtendedStatistic :portkey.aws.monitoring.-2010-08-01/MetricName :portkey.aws.monitoring.-2010-08-01/AlarmArn :portkey.aws.monitoring.-2010-08-01.metric-alarm/AlarmConfigurationUpdatedTimestamp :portkey.aws.monitoring.-2010-08-01/EvaluationPeriods :portkey.aws.monitoring.-2010-08-01/StateReason :portkey.aws.monitoring.-2010-08-01/Statistic :portkey.aws.monitoring.-2010-08-01/ActionsEnabled] :locations {}))

(clojure.spec.alpha/def :portkey.aws.monitoring.-2010-08-01/delete-dashboards-input (portkey.aws/json-keys :req-un [:portkey.aws.monitoring.-2010-08-01/DashboardNames] :opt-un [] :locations {}))

(clojure.spec.alpha/def :portkey.aws.monitoring.-2010-08-01/alarm-history-items (clojure.spec.alpha/coll-of :portkey.aws.monitoring.-2010-08-01/alarm-history-item))

(clojure.spec.alpha/def :portkey.aws.monitoring.-2010-08-01/extended-statistics (clojure.spec.alpha/coll-of :portkey.aws.monitoring.-2010-08-01/extended-statistic :min-count 1 :max-count 10))

(clojure.spec.alpha/def :portkey.aws.monitoring.-2010-08-01.limit-exceeded-fault/message (clojure.spec.alpha/and :portkey.aws.monitoring.-2010-08-01/error-message))
(clojure.spec.alpha/def :portkey.aws.monitoring.-2010-08-01/limit-exceeded-fault (portkey.aws/json-keys :req-un [] :opt-un [:portkey.aws.monitoring.-2010-08-01.limit-exceeded-fault/message] :locations {}))

(clojure.spec.alpha/def :portkey.aws.monitoring.-2010-08-01/alarm-history-item (portkey.aws/json-keys :req-un [] :opt-un [:portkey.aws.monitoring.-2010-08-01/AlarmName :portkey.aws.monitoring.-2010-08-01/Timestamp :portkey.aws.monitoring.-2010-08-01/HistoryItemType :portkey.aws.monitoring.-2010-08-01/HistorySummary :portkey.aws.monitoring.-2010-08-01/HistoryData] :locations {}))

(clojure.spec.alpha/def :portkey.aws.monitoring.-2010-08-01/get-dashboard-input (portkey.aws/json-keys :req-un [:portkey.aws.monitoring.-2010-08-01/DashboardName] :opt-un [] :locations {}))

(clojure.spec.alpha/def :portkey.aws.monitoring.-2010-08-01/dimensions (clojure.spec.alpha/coll-of :portkey.aws.monitoring.-2010-08-01/dimension :max-count 10))

(clojure.spec.alpha/def :portkey.aws.monitoring.-2010-08-01/datapoints-to-alarm (clojure.spec.alpha/int-in 1 Long/MAX_VALUE))

(clojure.spec.alpha/def :portkey.aws.monitoring.-2010-08-01/metric-label (clojure.spec.alpha/and clojure.core/string?))

(clojure.spec.alpha/def :portkey.aws.monitoring.-2010-08-01.dashboard-invalid-input-error/message (clojure.spec.alpha/and :portkey.aws.monitoring.-2010-08-01/dashboard-error-message))
(clojure.spec.alpha/def :portkey.aws.monitoring.-2010-08-01.dashboard-invalid-input-error/dashboard-validation-messages (clojure.spec.alpha/and :portkey.aws.monitoring.-2010-08-01/dashboard-validation-messages))
(clojure.spec.alpha/def :portkey.aws.monitoring.-2010-08-01/dashboard-invalid-input-error (portkey.aws/json-keys :req-un [] :opt-un [:portkey.aws.monitoring.-2010-08-01.dashboard-invalid-input-error/message :portkey.aws.monitoring.-2010-08-01.dashboard-invalid-input-error/dashboardValidationMessages] :locations {}))

(clojure.spec.alpha/def :portkey.aws.monitoring.-2010-08-01/namespace (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__36226__auto__] (clojure.core/<= 1 (clojure.core/count s__36226__auto__))) (clojure.core/fn [s__36227__auto__] (clojure.core/< (clojure.core/count s__36227__auto__) 255)) (clojure.core/fn [s__36228__auto__] (clojure.core/re-matches #"[^:].*" s__36228__auto__))))

(clojure.spec.alpha/def :portkey.aws.monitoring.-2010-08-01/put-dashboard-input (portkey.aws/json-keys :req-un [:portkey.aws.monitoring.-2010-08-01/DashboardName :portkey.aws.monitoring.-2010-08-01/DashboardBody] :opt-un [] :locations {}))

(clojure.spec.alpha/def :portkey.aws.monitoring.-2010-08-01/message (clojure.spec.alpha/and clojure.core/string?))

(clojure.spec.alpha/def :portkey.aws.monitoring.-2010-08-01/message-data-value (clojure.spec.alpha/and clojure.core/string?))

(clojure.spec.alpha/def :portkey.aws.monitoring.-2010-08-01/timestamps (clojure.spec.alpha/coll-of :portkey.aws.monitoring.-2010-08-01/timestamp))

(clojure.spec.alpha/def :portkey.aws.monitoring.-2010-08-01/last-modified clojure.core/inst?)

(clojure.spec.alpha/def :portkey.aws.monitoring.-2010-08-01.statistic-set/sample-count (clojure.spec.alpha/and :portkey.aws.monitoring.-2010-08-01/datapoint-value))
(clojure.spec.alpha/def :portkey.aws.monitoring.-2010-08-01.statistic-set/sum (clojure.spec.alpha/and :portkey.aws.monitoring.-2010-08-01/datapoint-value))
(clojure.spec.alpha/def :portkey.aws.monitoring.-2010-08-01.statistic-set/minimum (clojure.spec.alpha/and :portkey.aws.monitoring.-2010-08-01/datapoint-value))
(clojure.spec.alpha/def :portkey.aws.monitoring.-2010-08-01.statistic-set/maximum (clojure.spec.alpha/and :portkey.aws.monitoring.-2010-08-01/datapoint-value))
(clojure.spec.alpha/def :portkey.aws.monitoring.-2010-08-01/statistic-set (portkey.aws/json-keys :req-un [:portkey.aws.monitoring.-2010-08-01.statistic-set/SampleCount :portkey.aws.monitoring.-2010-08-01.statistic-set/Sum :portkey.aws.monitoring.-2010-08-01.statistic-set/Minimum :portkey.aws.monitoring.-2010-08-01.statistic-set/Maximum] :opt-un [] :locations {}))

(clojure.spec.alpha/def :portkey.aws.monitoring.-2010-08-01/action-prefix (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__36226__auto__] (clojure.core/<= 1 (clojure.core/count s__36226__auto__))) (clojure.core/fn [s__36227__auto__] (clojure.core/< (clojure.core/count s__36227__auto__) 1024))))

(clojure.spec.alpha/def :portkey.aws.monitoring.-2010-08-01/resource-name (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__36226__auto__] (clojure.core/<= 1 (clojure.core/count s__36226__auto__))) (clojure.core/fn [s__36227__auto__] (clojure.core/< (clojure.core/count s__36227__auto__) 1024))))

(clojure.spec.alpha/def :portkey.aws.monitoring.-2010-08-01/get-dashboard-output (portkey.aws/json-keys :req-un [] :opt-un [:portkey.aws.monitoring.-2010-08-01/DashboardArn :portkey.aws.monitoring.-2010-08-01/DashboardBody :portkey.aws.monitoring.-2010-08-01/DashboardName] :locations {}))

(clojure.spec.alpha/def :portkey.aws.monitoring.-2010-08-01/dashboard-name-prefix (clojure.spec.alpha/and clojure.core/string?))

(clojure.spec.alpha/def :portkey.aws.monitoring.-2010-08-01.put-metric-alarm-input/unit (clojure.spec.alpha/and :portkey.aws.monitoring.-2010-08-01/standard-unit))
(clojure.spec.alpha/def :portkey.aws.monitoring.-2010-08-01.put-metric-alarm-input/okactions (clojure.spec.alpha/and :portkey.aws.monitoring.-2010-08-01/resource-list))
(clojure.spec.alpha/def :portkey.aws.monitoring.-2010-08-01.put-metric-alarm-input/insufficient-data-actions (clojure.spec.alpha/and :portkey.aws.monitoring.-2010-08-01/resource-list))
(clojure.spec.alpha/def :portkey.aws.monitoring.-2010-08-01.put-metric-alarm-input/alarm-actions (clojure.spec.alpha/and :portkey.aws.monitoring.-2010-08-01/resource-list))
(clojure.spec.alpha/def :portkey.aws.monitoring.-2010-08-01/put-metric-alarm-input (portkey.aws/json-keys :req-un [:portkey.aws.monitoring.-2010-08-01/AlarmName :portkey.aws.monitoring.-2010-08-01/MetricName :portkey.aws.monitoring.-2010-08-01/Namespace :portkey.aws.monitoring.-2010-08-01/Period :portkey.aws.monitoring.-2010-08-01/EvaluationPeriods :portkey.aws.monitoring.-2010-08-01/Threshold :portkey.aws.monitoring.-2010-08-01/ComparisonOperator] :opt-un [:portkey.aws.monitoring.-2010-08-01.put-metric-alarm-input/Unit :portkey.aws.monitoring.-2010-08-01/TreatMissingData :portkey.aws.monitoring.-2010-08-01.put-metric-alarm-input/OKActions :portkey.aws.monitoring.-2010-08-01.put-metric-alarm-input/InsufficientDataActions :portkey.aws.monitoring.-2010-08-01/Dimensions :portkey.aws.monitoring.-2010-08-01/DatapointsToAlarm :portkey.aws.monitoring.-2010-08-01.put-metric-alarm-input/AlarmActions :portkey.aws.monitoring.-2010-08-01/EvaluateLowSampleCountPercentile :portkey.aws.monitoring.-2010-08-01/AlarmDescription :portkey.aws.monitoring.-2010-08-01/ExtendedStatistic :portkey.aws.monitoring.-2010-08-01/Statistic :portkey.aws.monitoring.-2010-08-01/ActionsEnabled] :locations {}))

(clojure.spec.alpha/def :portkey.aws.monitoring.-2010-08-01/describe-alarm-history-output (portkey.aws/json-keys :req-un [] :opt-un [:portkey.aws.monitoring.-2010-08-01/AlarmHistoryItems :portkey.aws.monitoring.-2010-08-01/NextToken] :locations {}))

(clojure.spec.alpha/def :portkey.aws.monitoring.-2010-08-01/size clojure.core/int?)

(clojure.spec.alpha/def :portkey.aws.monitoring.-2010-08-01/evaluate-low-sample-count-percentile (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__36226__auto__] (clojure.core/<= 1 (clojure.core/count s__36226__auto__))) (clojure.core/fn [s__36227__auto__] (clojure.core/< (clojure.core/count s__36227__auto__) 255))))

(clojure.spec.alpha/def :portkey.aws.monitoring.-2010-08-01/return-data clojure.core/boolean?)

(clojure.spec.alpha/def :portkey.aws.monitoring.-2010-08-01/enable-alarm-actions-input (portkey.aws/json-keys :req-un [:portkey.aws.monitoring.-2010-08-01/AlarmNames] :opt-un [] :locations {}))

(clojure.spec.alpha/def :portkey.aws.monitoring.-2010-08-01/alarm-description (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__36226__auto__] (clojure.core/<= 0 (clojure.core/count s__36226__auto__))) (clojure.core/fn [s__36227__auto__] (clojure.core/< (clojure.core/count s__36227__auto__) 1024))))

(clojure.spec.alpha/def :portkey.aws.monitoring.-2010-08-01/metric-id (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__36226__auto__] (clojure.core/<= 1 (clojure.core/count s__36226__auto__))) (clojure.core/fn [s__36227__auto__] (clojure.core/< (clojure.core/count s__36227__auto__) 255))))

(clojure.spec.alpha/def :portkey.aws.monitoring.-2010-08-01/alarm-name (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__36226__auto__] (clojure.core/<= 1 (clojure.core/count s__36226__auto__))) (clojure.core/fn [s__36227__auto__] (clojure.core/< (clojure.core/count s__36227__auto__) 255))))

(clojure.spec.alpha/def :portkey.aws.monitoring.-2010-08-01/metric (portkey.aws/json-keys :req-un [] :opt-un [:portkey.aws.monitoring.-2010-08-01/Namespace :portkey.aws.monitoring.-2010-08-01/MetricName :portkey.aws.monitoring.-2010-08-01/Dimensions] :locations {}))

(clojure.spec.alpha/def :portkey.aws.monitoring.-2010-08-01.dimension-filter/name (clojure.spec.alpha/and :portkey.aws.monitoring.-2010-08-01/dimension-name))
(clojure.spec.alpha/def :portkey.aws.monitoring.-2010-08-01.dimension-filter/value (clojure.spec.alpha/and :portkey.aws.monitoring.-2010-08-01/dimension-value))
(clojure.spec.alpha/def :portkey.aws.monitoring.-2010-08-01/dimension-filter (portkey.aws/json-keys :req-un [:portkey.aws.monitoring.-2010-08-01.dimension-filter/Name] :opt-un [:portkey.aws.monitoring.-2010-08-01.dimension-filter/Value] :locations {}))

(clojure.spec.alpha/def :portkey.aws.monitoring.-2010-08-01/resource-list (clojure.spec.alpha/coll-of :portkey.aws.monitoring.-2010-08-01/resource-name :max-count 5))

(clojure.spec.alpha/def :portkey.aws.monitoring.-2010-08-01/stat (clojure.spec.alpha/and clojure.core/string?))

(clojure.spec.alpha/def :portkey.aws.monitoring.-2010-08-01.invalid-parameter-combination-exception/message (clojure.spec.alpha/and :portkey.aws.monitoring.-2010-08-01/aws-query-error-message))
(clojure.spec.alpha/def :portkey.aws.monitoring.-2010-08-01/invalid-parameter-combination-exception (portkey.aws/json-keys :req-un [] :opt-un [:portkey.aws.monitoring.-2010-08-01.invalid-parameter-combination-exception/message] :locations {}))

(clojure.spec.alpha/def :portkey.aws.monitoring.-2010-08-01/extended-statistic (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__36228__auto__] (clojure.core/re-matches #"p(\d{1,2}(\.\d{0,2})?|100)" s__36228__auto__))))

(clojure.spec.alpha/def :portkey.aws.monitoring.-2010-08-01/datapoint-value-map (clojure.spec.alpha/map-of :portkey.aws.monitoring.-2010-08-01/extended-statistic :portkey.aws.monitoring.-2010-08-01/datapoint-value))

(clojure.spec.alpha/def :portkey.aws.monitoring.-2010-08-01/dashboard-body (clojure.spec.alpha/and clojure.core/string?))

(clojure.spec.alpha/def :portkey.aws.monitoring.-2010-08-01.metric-datum/value (clojure.spec.alpha/and :portkey.aws.monitoring.-2010-08-01/datapoint-value))
(clojure.spec.alpha/def :portkey.aws.monitoring.-2010-08-01.metric-datum/statistic-values (clojure.spec.alpha/and :portkey.aws.monitoring.-2010-08-01/statistic-set))
(clojure.spec.alpha/def :portkey.aws.monitoring.-2010-08-01.metric-datum/unit (clojure.spec.alpha/and :portkey.aws.monitoring.-2010-08-01/standard-unit))
(clojure.spec.alpha/def :portkey.aws.monitoring.-2010-08-01/metric-datum (portkey.aws/json-keys :req-un [:portkey.aws.monitoring.-2010-08-01/MetricName] :opt-un [:portkey.aws.monitoring.-2010-08-01/Dimensions :portkey.aws.monitoring.-2010-08-01/Timestamp :portkey.aws.monitoring.-2010-08-01.metric-datum/Value :portkey.aws.monitoring.-2010-08-01.metric-datum/StatisticValues :portkey.aws.monitoring.-2010-08-01.metric-datum/Unit :portkey.aws.monitoring.-2010-08-01/StorageResolution] :locations {}))

(clojure.spec.alpha/def :portkey.aws.monitoring.-2010-08-01/timestamp clojure.core/inst?)

(clojure.spec.alpha/def :portkey.aws.monitoring.-2010-08-01/metric-alarms (clojure.spec.alpha/coll-of :portkey.aws.monitoring.-2010-08-01/metric-alarm))

(clojure.spec.alpha/def :portkey.aws.monitoring.-2010-08-01.metric-data-query/id (clojure.spec.alpha/and :portkey.aws.monitoring.-2010-08-01/metric-id))
(clojure.spec.alpha/def :portkey.aws.monitoring.-2010-08-01.metric-data-query/expression (clojure.spec.alpha/and :portkey.aws.monitoring.-2010-08-01/metric-expression))
(clojure.spec.alpha/def :portkey.aws.monitoring.-2010-08-01.metric-data-query/label (clojure.spec.alpha/and :portkey.aws.monitoring.-2010-08-01/metric-label))
(clojure.spec.alpha/def :portkey.aws.monitoring.-2010-08-01/metric-data-query (portkey.aws/json-keys :req-un [:portkey.aws.monitoring.-2010-08-01.metric-data-query/Id] :opt-un [:portkey.aws.monitoring.-2010-08-01/MetricStat :portkey.aws.monitoring.-2010-08-01.metric-data-query/Expression :portkey.aws.monitoring.-2010-08-01.metric-data-query/Label :portkey.aws.monitoring.-2010-08-01/ReturnData] :locations {}))

(clojure.spec.alpha/def :portkey.aws.monitoring.-2010-08-01/statistics (clojure.spec.alpha/coll-of :portkey.aws.monitoring.-2010-08-01/statistic :min-count 1 :max-count 5))

(clojure.spec.alpha/def :portkey.aws.monitoring.-2010-08-01.describe-alarms-for-metric-input/unit (clojure.spec.alpha/and :portkey.aws.monitoring.-2010-08-01/standard-unit))
(clojure.spec.alpha/def :portkey.aws.monitoring.-2010-08-01/describe-alarms-for-metric-input (portkey.aws/json-keys :req-un [:portkey.aws.monitoring.-2010-08-01/MetricName :portkey.aws.monitoring.-2010-08-01/Namespace] :opt-un [:portkey.aws.monitoring.-2010-08-01/Statistic :portkey.aws.monitoring.-2010-08-01/ExtendedStatistic :portkey.aws.monitoring.-2010-08-01/Dimensions :portkey.aws.monitoring.-2010-08-01/Period :portkey.aws.monitoring.-2010-08-01.describe-alarms-for-metric-input/Unit] :locations {}))

(clojure.spec.alpha/def :portkey.aws.monitoring.-2010-08-01/list-dashboards-input (portkey.aws/json-keys :req-un [] :opt-un [:portkey.aws.monitoring.-2010-08-01/DashboardNamePrefix :portkey.aws.monitoring.-2010-08-01/NextToken] :locations {}))

(clojure.spec.alpha/def :portkey.aws.monitoring.-2010-08-01/list-dashboards-output (portkey.aws/json-keys :req-un [] :opt-un [:portkey.aws.monitoring.-2010-08-01/DashboardEntries :portkey.aws.monitoring.-2010-08-01/NextToken] :locations {}))

(clojure.spec.alpha/def :portkey.aws.monitoring.-2010-08-01/metric-name (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__36226__auto__] (clojure.core/<= 1 (clojure.core/count s__36226__auto__))) (clojure.core/fn [s__36227__auto__] (clojure.core/< (clojure.core/count s__36227__auto__) 255))))

(clojure.spec.alpha/def :portkey.aws.monitoring.-2010-08-01.invalid-format-fault/message (clojure.spec.alpha/and :portkey.aws.monitoring.-2010-08-01/error-message))
(clojure.spec.alpha/def :portkey.aws.monitoring.-2010-08-01/invalid-format-fault (portkey.aws/json-keys :req-un [] :opt-un [:portkey.aws.monitoring.-2010-08-01.invalid-format-fault/message] :locations {}))

(clojure.spec.alpha/def :portkey.aws.monitoring.-2010-08-01/metric-data (clojure.spec.alpha/coll-of :portkey.aws.monitoring.-2010-08-01/metric-datum))

(clojure.spec.alpha/def :portkey.aws.monitoring.-2010-08-01/dashboard-names (clojure.spec.alpha/coll-of :portkey.aws.monitoring.-2010-08-01/dashboard-name))

(clojure.spec.alpha/def :portkey.aws.monitoring.-2010-08-01/datapoints (clojure.spec.alpha/coll-of :portkey.aws.monitoring.-2010-08-01/datapoint))

(clojure.spec.alpha/def :portkey.aws.monitoring.-2010-08-01/metric-data-queries (clojure.spec.alpha/coll-of :portkey.aws.monitoring.-2010-08-01/metric-data-query))

(clojure.spec.alpha/def :portkey.aws.monitoring.-2010-08-01/alarm-arn (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__36226__auto__] (clojure.core/<= 1 (clojure.core/count s__36226__auto__))) (clojure.core/fn [s__36227__auto__] (clojure.core/< (clojure.core/count s__36227__auto__) 1600))))

(clojure.spec.alpha/def :portkey.aws.monitoring.-2010-08-01/delete-alarms-input (portkey.aws/json-keys :req-un [:portkey.aws.monitoring.-2010-08-01/AlarmNames] :opt-un [] :locations {}))

(clojure.spec.alpha/def :portkey.aws.monitoring.-2010-08-01/evaluation-periods (clojure.spec.alpha/int-in 1 Long/MAX_VALUE))

(clojure.spec.alpha/def :portkey.aws.monitoring.-2010-08-01.resource-not-found/message (clojure.spec.alpha/and :portkey.aws.monitoring.-2010-08-01/error-message))
(clojure.spec.alpha/def :portkey.aws.monitoring.-2010-08-01/resource-not-found (portkey.aws/json-keys :req-un [] :opt-un [:portkey.aws.monitoring.-2010-08-01.resource-not-found/message] :locations {}))

(clojure.spec.alpha/def :portkey.aws.monitoring.-2010-08-01/metric-expression (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__36226__auto__] (clojure.core/<= 1 (clojure.core/count s__36226__auto__))) (clojure.core/fn [s__36227__auto__] (clojure.core/< (clojure.core/count s__36227__auto__) 1024))))

(clojure.spec.alpha/def :portkey.aws.monitoring.-2010-08-01/aws-query-error-message (clojure.spec.alpha/and clojure.core/string?))

(clojure.spec.alpha/def :portkey.aws.monitoring.-2010-08-01.invalid-parameter-value-exception/message (clojure.spec.alpha/and :portkey.aws.monitoring.-2010-08-01/aws-query-error-message))
(clojure.spec.alpha/def :portkey.aws.monitoring.-2010-08-01/invalid-parameter-value-exception (portkey.aws/json-keys :req-un [] :opt-un [:portkey.aws.monitoring.-2010-08-01.invalid-parameter-value-exception/message] :locations {}))

(clojure.spec.alpha/def :portkey.aws.monitoring.-2010-08-01/message-data-code (clojure.spec.alpha/and clojure.core/string?))

(clojure.spec.alpha/def :portkey.aws.monitoring.-2010-08-01/datapoint-value clojure.core/double?)

(clojure.spec.alpha/def :portkey.aws.monitoring.-2010-08-01/state-reason (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__36226__auto__] (clojure.core/<= 0 (clojure.core/count s__36226__auto__))) (clojure.core/fn [s__36227__auto__] (clojure.core/< (clojure.core/count s__36227__auto__) 1023))))

(clojure.spec.alpha/def :portkey.aws.monitoring.-2010-08-01/scan-by {"TimestampDescending" "TimestampDescending", :timestamp-descending "TimestampDescending", "TimestampAscending" "TimestampAscending", :timestamp-ascending "TimestampAscending"})

(clojure.spec.alpha/def :portkey.aws.monitoring.-2010-08-01/statistic {"Sum" "Sum", "Average" "Average", :maximum "Maximum", "SampleCount" "SampleCount", "Minimum" "Minimum", :sample-count "SampleCount", :minimum "Minimum", :average "Average", :sum "Sum", "Maximum" "Maximum"})

(clojure.spec.alpha/def :portkey.aws.monitoring.-2010-08-01/list-metrics-output (portkey.aws/json-keys :req-un [] :opt-un [:portkey.aws.monitoring.-2010-08-01/Metrics :portkey.aws.monitoring.-2010-08-01/NextToken] :locations {}))

(clojure.spec.alpha/def :portkey.aws.monitoring.-2010-08-01.invalid-next-token/message (clojure.spec.alpha/and :portkey.aws.monitoring.-2010-08-01/error-message))
(clojure.spec.alpha/def :portkey.aws.monitoring.-2010-08-01/invalid-next-token (portkey.aws/json-keys :req-un [] :opt-un [:portkey.aws.monitoring.-2010-08-01.invalid-next-token/message] :locations {}))

(clojure.spec.alpha/def :portkey.aws.monitoring.-2010-08-01.describe-alarm-history-input/start-date (clojure.spec.alpha/and :portkey.aws.monitoring.-2010-08-01/timestamp))
(clojure.spec.alpha/def :portkey.aws.monitoring.-2010-08-01.describe-alarm-history-input/end-date (clojure.spec.alpha/and :portkey.aws.monitoring.-2010-08-01/timestamp))
(clojure.spec.alpha/def :portkey.aws.monitoring.-2010-08-01/describe-alarm-history-input (portkey.aws/json-keys :req-un [] :opt-un [:portkey.aws.monitoring.-2010-08-01/AlarmName :portkey.aws.monitoring.-2010-08-01/HistoryItemType :portkey.aws.monitoring.-2010-08-01.describe-alarm-history-input/StartDate :portkey.aws.monitoring.-2010-08-01.describe-alarm-history-input/EndDate :portkey.aws.monitoring.-2010-08-01/MaxRecords :portkey.aws.monitoring.-2010-08-01/NextToken] :locations {}))

(clojure.spec.alpha/def :portkey.aws.monitoring.-2010-08-01/alarm-names (clojure.spec.alpha/coll-of :portkey.aws.monitoring.-2010-08-01/alarm-name :max-count 100))

(clojure.spec.alpha/def :portkey.aws.monitoring.-2010-08-01/actions-enabled clojure.core/boolean?)

(clojure.spec.alpha/def :portkey.aws.monitoring.-2010-08-01/fault-description (clojure.spec.alpha/and clojure.core/string?))

(clojure.spec.alpha/def :portkey.aws.monitoring.-2010-08-01/metric-data-results (clojure.spec.alpha/coll-of :portkey.aws.monitoring.-2010-08-01/metric-data-result))

(clojure.spec.alpha/def :portkey.aws.monitoring.-2010-08-01/datapoint-values (clojure.spec.alpha/coll-of :portkey.aws.monitoring.-2010-08-01/datapoint-value))

(clojure.spec.alpha/def :portkey.aws.monitoring.-2010-08-01/metrics (clojure.spec.alpha/coll-of :portkey.aws.monitoring.-2010-08-01/metric))

(clojure.core/defn delete-dashboards "Deletes all dashboards that you specify. You may specify up to 100 dashboards to\ndelete. If there is an error during this call, no dashboards are deleted." ([delete-dashboards-input] (clojure.core/let [req<-input__36755__auto__ (req<-delete-dashboards-input "DeleteDashboards" delete-dashboards-input)] (portkey.aws/-query-call portkey.aws.monitoring.-2010-08-01/endpoints "POST" "/" req<-input__36755__auto__ :portkey.aws.monitoring.-2010-08-01/delete-dashboards-input {:payload nil, :move {}, :headers {}, :uri {}, :querystring {}} nil :portkey.aws.monitoring.-2010-08-01/delete-dashboards-output {"InvalidParameterValueException" :portkey.aws.monitoring.-2010-08-01/invalid-parameter-value-exception, "DashboardNotFoundError" :portkey.aws.monitoring.-2010-08-01/dashboard-not-found-error, "InternalServiceFault" :portkey.aws.monitoring.-2010-08-01/internal-service-fault}))))
(clojure.spec.alpha/fdef delete-dashboards :args (clojure.spec.alpha/tuple :portkey.aws.monitoring.-2010-08-01/delete-dashboards-input) :ret (clojure.spec.alpha/and :portkey.aws.monitoring.-2010-08-01/delete-dashboards-output))

(clojure.core/defn delete-alarms "Deletes the specified alarms. In the event of an error, no alarms are deleted." ([delete-alarms-input] (clojure.core/let [req<-input__36755__auto__ (req<-delete-alarms-input "DeleteAlarms" delete-alarms-input)] (portkey.aws/-query-call portkey.aws.monitoring.-2010-08-01/endpoints "POST" "/" req<-input__36755__auto__ :portkey.aws.monitoring.-2010-08-01/delete-alarms-input {:payload nil, :move {}, :headers {}, :uri {}, :querystring {}} nil nil {"ResourceNotFound" :portkey.aws.monitoring.-2010-08-01/resource-not-found}))))
(clojure.spec.alpha/fdef delete-alarms :args (clojure.spec.alpha/tuple :portkey.aws.monitoring.-2010-08-01/delete-alarms-input) :ret clojure.core/true?)

(clojure.core/defn describe-alarms "Retrieves the specified alarms. If no alarms are specified, all alarms are\nreturned. Alarms can be retrieved by using only a prefix for the alarm name, the\nalarm state, or a prefix for any action." ([] (describe-alarms {})) ([describe-alarms-input] (clojure.core/let [req<-input__36755__auto__ (req<-describe-alarms-input "DescribeAlarms" describe-alarms-input)] (portkey.aws/-query-call portkey.aws.monitoring.-2010-08-01/endpoints "POST" "/" req<-input__36755__auto__ :portkey.aws.monitoring.-2010-08-01/describe-alarms-input {:payload nil, :move {}, :headers {}, :uri {}, :querystring {}} nil :portkey.aws.monitoring.-2010-08-01/describe-alarms-output {"InvalidNextToken" :portkey.aws.monitoring.-2010-08-01/invalid-next-token}))))
(clojure.spec.alpha/fdef describe-alarms :args (clojure.spec.alpha/? :portkey.aws.monitoring.-2010-08-01/describe-alarms-input) :ret (clojure.spec.alpha/and :portkey.aws.monitoring.-2010-08-01/describe-alarms-output))

(clojure.core/defn get-metric-statistics "Gets statistics for the specified metric.\n The maximum number of data points returned from a single call is 1,440. If you\nrequest more than 1,440 data points, CloudWatch returns an error. To reduce the\nnumber of data points, you can narrow the specified time range and make multiple\nrequests across adjacent time ranges, or you can increase the specified period.\nData points are not returned in chronological order.\n CloudWatch aggregates data points based on the length of the period that you\nspecify. For example, if you request statistics with a one-hour period,\nCloudWatch aggregates all data points with time stamps that fall within each\none-hour period. Therefore, the number of values aggregated by CloudWatch is\nlarger than the number of data points returned.\n CloudWatch needs raw data points to calculate percentile statistics. If you\npublish data using a statistic set instead, you can only retrieve percentile\nstatistics for this data if one of the following conditions is true:\n * The SampleCount value of the statistic set is 1.\n * The Min and the Max values of the statistic set are equal.\n Amazon CloudWatch retains metric data as follows:\n * Data points with a period of less than 60 seconds are available for 3 hours.\nThese data points are high-resolution metrics and are available only for custom\nmetrics that have been defined with a StorageResolution of 1.\n * Data points with a period of 60 seconds (1-minute) are available for 15 days.\n * Data points with a period of 300 seconds (5-minute) are available for 63\ndays.\n * Data points with a period of 3600 seconds (1 hour) are available for 455 days\n(15 months).\n Data points that are initially published with a shorter period are aggregated\ntogether for long-term storage. For example, if you collect data using a period\nof 1 minute, the data remains available for 15 days with 1-minute resolution.\nAfter 15 days, this data is still available, but is aggregated and retrievable\nonly with a resolution of 5 minutes. After 63 days, the data is further\naggregated and is available with a resolution of 1 hour.\n CloudWatch started retaining 5-minute and 1-hour metric data as of July 9,\n2016.\n For information about metrics and dimensions supported by AWS services, see the\nAmazon CloudWatch Metrics and Dimensions Reference\n(http://docs.aws.amazon.com/AmazonCloudWatch/latest/monitoring/CW_Support_For_AWS.html)\nin the Amazon CloudWatch User Guide." ([get-metric-statistics-input] (clojure.core/let [req<-input__36755__auto__ (req<-get-metric-statistics-input "GetMetricStatistics" get-metric-statistics-input)] (portkey.aws/-query-call portkey.aws.monitoring.-2010-08-01/endpoints "POST" "/" req<-input__36755__auto__ :portkey.aws.monitoring.-2010-08-01/get-metric-statistics-input {:payload nil, :move {}, :headers {}, :uri {}, :querystring {}} nil :portkey.aws.monitoring.-2010-08-01/get-metric-statistics-output {"InvalidParameterValueException" :portkey.aws.monitoring.-2010-08-01/invalid-parameter-value-exception, "MissingRequiredParameterException" :portkey.aws.monitoring.-2010-08-01/missing-required-parameter-exception, "InvalidParameterCombinationException" :portkey.aws.monitoring.-2010-08-01/invalid-parameter-combination-exception, "InternalServiceFault" :portkey.aws.monitoring.-2010-08-01/internal-service-fault}))))
(clojure.spec.alpha/fdef get-metric-statistics :args (clojure.spec.alpha/tuple :portkey.aws.monitoring.-2010-08-01/get-metric-statistics-input) :ret (clojure.spec.alpha/and :portkey.aws.monitoring.-2010-08-01/get-metric-statistics-output))

(clojure.core/defn list-dashboards "Returns a list of the dashboards for your account. If you include\nDashboardNamePrefix, only those dashboards with names starting with the prefix\nare listed. Otherwise, all dashboards in your account are listed." ([] (list-dashboards {})) ([list-dashboards-input] (clojure.core/let [req<-input__36755__auto__ (req<-list-dashboards-input "ListDashboards" list-dashboards-input)] (portkey.aws/-query-call portkey.aws.monitoring.-2010-08-01/endpoints "POST" "/" req<-input__36755__auto__ :portkey.aws.monitoring.-2010-08-01/list-dashboards-input {:payload nil, :move {}, :headers {}, :uri {}, :querystring {}} nil :portkey.aws.monitoring.-2010-08-01/list-dashboards-output {"InvalidParameterValueException" :portkey.aws.monitoring.-2010-08-01/invalid-parameter-value-exception, "InternalServiceFault" :portkey.aws.monitoring.-2010-08-01/internal-service-fault}))))
(clojure.spec.alpha/fdef list-dashboards :args (clojure.spec.alpha/? :portkey.aws.monitoring.-2010-08-01/list-dashboards-input) :ret (clojure.spec.alpha/and :portkey.aws.monitoring.-2010-08-01/list-dashboards-output))

(clojure.core/defn put-dashboard "Creates a dashboard if it does not already exist, or updates an existing\ndashboard. If you update a dashboard, the entire contents are replaced with what\nyou specify here.\n You can have up to 500 dashboards per account. All dashboards in your account\nare global, not region-specific.\n A simple way to create a dashboard using PutDashboard is to copy an existing\ndashboard. To copy an existing dashboard using the console, you can load the\ndashboard and then use the View/edit source command in the Actions menu to\ndisplay the JSON block for that dashboard. Another way to copy a dashboard is to\nuse GetDashboard, and then use the data returned within DashboardBody as the\ntemplate for the new dashboard when you call PutDashboard.\n When you create a dashboard with PutDashboard, a good practice is to add a text\nwidget at the top of the dashboard with a message that the dashboard was created\nby script and should not be changed in the console. This message could also\npoint console users to the location of the DashboardBody script or the\nCloudFormation template used to create the dashboard." ([put-dashboard-input] (clojure.core/let [req<-input__36755__auto__ (req<-put-dashboard-input "PutDashboard" put-dashboard-input)] (portkey.aws/-query-call portkey.aws.monitoring.-2010-08-01/endpoints "POST" "/" req<-input__36755__auto__ :portkey.aws.monitoring.-2010-08-01/put-dashboard-input {:payload nil, :move {}, :headers {}, :uri {}, :querystring {}} nil :portkey.aws.monitoring.-2010-08-01/put-dashboard-output {"DashboardInvalidInputError" :portkey.aws.monitoring.-2010-08-01/dashboard-invalid-input-error, "InternalServiceFault" :portkey.aws.monitoring.-2010-08-01/internal-service-fault}))))
(clojure.spec.alpha/fdef put-dashboard :args (clojure.spec.alpha/tuple :portkey.aws.monitoring.-2010-08-01/put-dashboard-input) :ret (clojure.spec.alpha/and :portkey.aws.monitoring.-2010-08-01/put-dashboard-output))

(clojure.core/defn enable-alarm-actions "Enables the actions for the specified alarms." ([enable-alarm-actions-input] (clojure.core/let [req<-input__36755__auto__ (req<-enable-alarm-actions-input "EnableAlarmActions" enable-alarm-actions-input)] (portkey.aws/-query-call portkey.aws.monitoring.-2010-08-01/endpoints "POST" "/" req<-input__36755__auto__ :portkey.aws.monitoring.-2010-08-01/enable-alarm-actions-input {:payload nil, :move {}, :headers {}, :uri {}, :querystring {}} nil nil {}))))
(clojure.spec.alpha/fdef enable-alarm-actions :args (clojure.spec.alpha/tuple :portkey.aws.monitoring.-2010-08-01/enable-alarm-actions-input) :ret clojure.core/true?)

(clojure.core/defn list-metrics "List the specified metrics. You can use the returned metrics with\nGetMetricStatistics to obtain statistical data.\n Up to 500 results are returned for any one call. To retrieve additional\nresults, use the returned token with subsequent calls.\n After you create a metric, allow up to fifteen minutes before the metric\nappears. Statistics about the metric, however, are available sooner using\nGetMetricStatistics." ([] (list-metrics {})) ([list-metrics-input] (clojure.core/let [req<-input__36755__auto__ (req<-list-metrics-input "ListMetrics" list-metrics-input)] (portkey.aws/-query-call portkey.aws.monitoring.-2010-08-01/endpoints "POST" "/" req<-input__36755__auto__ :portkey.aws.monitoring.-2010-08-01/list-metrics-input {:payload nil, :move {}, :headers {}, :uri {}, :querystring {}} nil :portkey.aws.monitoring.-2010-08-01/list-metrics-output {"InternalServiceFault" :portkey.aws.monitoring.-2010-08-01/internal-service-fault, "InvalidParameterValueException" :portkey.aws.monitoring.-2010-08-01/invalid-parameter-value-exception}))))
(clojure.spec.alpha/fdef list-metrics :args (clojure.spec.alpha/? :portkey.aws.monitoring.-2010-08-01/list-metrics-input) :ret (clojure.spec.alpha/and :portkey.aws.monitoring.-2010-08-01/list-metrics-output))

(clojure.core/defn put-metric-data "Publishes metric data points to Amazon CloudWatch. CloudWatch associates the\ndata points with the specified metric. If the specified metric does not exist,\nCloudWatch creates the metric. When CloudWatch creates a metric, it can take up\nto fifteen minutes for the metric to appear in calls to ListMetrics.\n Each PutMetricData request is limited to 40 KB in size for HTTP POST requests.\n Although the Value parameter accepts numbers of type Double, CloudWatch rejects\nvalues that are either too small or too large. Values must be in the range of\n8.515920e-109 to 1.174271e+108 (Base 10) or 2e-360 to 2e360 (Base 2). In\naddition, special values (for example, NaN, +Infinity, -Infinity) are not\nsupported.\n You can use up to 10 dimensions per metric to further clarify what data the\nmetric collects. For more information about specifying dimensions, see\nPublishing Metrics\n(http://docs.aws.amazon.com/AmazonCloudWatch/latest/monitoring/publishingMetrics.html)\nin the Amazon CloudWatch User Guide.\n Data points with time stamps from 24 hours ago or longer can take at least 48\nhours to become available for GetMetricStatistics from the time they are\nsubmitted.\n CloudWatch needs raw data points to calculate percentile statistics. If you\npublish data using a statistic set instead, you can only retrieve percentile\nstatistics for this data if one of the following conditions is true:\n * The SampleCount value of the statistic set is 1\n * The Min and the Max values of the statistic set are equal" ([put-metric-data-input] (clojure.core/let [req<-input__36755__auto__ (req<-put-metric-data-input "PutMetricData" put-metric-data-input)] (portkey.aws/-query-call portkey.aws.monitoring.-2010-08-01/endpoints "POST" "/" req<-input__36755__auto__ :portkey.aws.monitoring.-2010-08-01/put-metric-data-input {:payload nil, :move {}, :headers {}, :uri {}, :querystring {}} nil nil {"InvalidParameterValueException" :portkey.aws.monitoring.-2010-08-01/invalid-parameter-value-exception, "MissingRequiredParameterException" :portkey.aws.monitoring.-2010-08-01/missing-required-parameter-exception, "InvalidParameterCombinationException" :portkey.aws.monitoring.-2010-08-01/invalid-parameter-combination-exception, "InternalServiceFault" :portkey.aws.monitoring.-2010-08-01/internal-service-fault}))))
(clojure.spec.alpha/fdef put-metric-data :args (clojure.spec.alpha/tuple :portkey.aws.monitoring.-2010-08-01/put-metric-data-input) :ret clojure.core/true?)

(clojure.core/defn describe-alarms-for-metric "Retrieves the alarms for the specified metric. To filter the results, specify a\nstatistic, period, or unit." ([describe-alarms-for-metric-input] (clojure.core/let [req<-input__36755__auto__ (req<-describe-alarms-for-metric-input "DescribeAlarmsForMetric" describe-alarms-for-metric-input)] (portkey.aws/-query-call portkey.aws.monitoring.-2010-08-01/endpoints "POST" "/" req<-input__36755__auto__ :portkey.aws.monitoring.-2010-08-01/describe-alarms-for-metric-input {:payload nil, :move {}, :headers {}, :uri {}, :querystring {}} nil :portkey.aws.monitoring.-2010-08-01/describe-alarms-for-metric-output {}))))
(clojure.spec.alpha/fdef describe-alarms-for-metric :args (clojure.spec.alpha/tuple :portkey.aws.monitoring.-2010-08-01/describe-alarms-for-metric-input) :ret (clojure.spec.alpha/and :portkey.aws.monitoring.-2010-08-01/describe-alarms-for-metric-output))

(clojure.core/defn set-alarm-state "Temporarily sets the state of an alarm for testing purposes. When the updated\nstate differs from the previous value, the action configured for the appropriate\nstate is invoked. For example, if your alarm is configured to send an Amazon SNS\nmessage when an alarm is triggered, temporarily changing the alarm state to\nALARM sends an SNS message. The alarm returns to its actual state (often within\nseconds). Because the alarm state change happens quickly, it is typically only\nvisible in the alarm's History tab in the Amazon CloudWatch console or through\nDescribeAlarmHistory." ([set-alarm-state-input] (clojure.core/let [req<-input__36755__auto__ (req<-set-alarm-state-input "SetAlarmState" set-alarm-state-input)] (portkey.aws/-query-call portkey.aws.monitoring.-2010-08-01/endpoints "POST" "/" req<-input__36755__auto__ :portkey.aws.monitoring.-2010-08-01/set-alarm-state-input {:payload nil, :move {}, :headers {}, :uri {}, :querystring {}} nil nil {"ResourceNotFound" :portkey.aws.monitoring.-2010-08-01/resource-not-found, "InvalidFormatFault" :portkey.aws.monitoring.-2010-08-01/invalid-format-fault}))))
(clojure.spec.alpha/fdef set-alarm-state :args (clojure.spec.alpha/tuple :portkey.aws.monitoring.-2010-08-01/set-alarm-state-input) :ret clojure.core/true?)

(clojure.core/defn put-metric-alarm "Creates or updates an alarm and associates it with the specified metric.\nOptionally, this operation can associate one or more Amazon SNS resources with\nthe alarm.\n When this operation creates an alarm, the alarm state is immediately set to\nINSUFFICIENT_DATA. The alarm is evaluated and its state is set appropriately.\nAny actions associated with the state are then executed.\n When you update an existing alarm, its state is left unchanged, but the update\ncompletely overwrites the previous configuration of the alarm.\n If you are an IAM user, you must have Amazon EC2 permissions for some\noperations:\n * iam:CreateServiceLinkedRole for all alarms with EC2 actions\n * ec2:DescribeInstanceStatus and ec2:DescribeInstances for all alarms on EC2\ninstance status metrics\n * ec2:StopInstances for alarms with stop actions\n * ec2:TerminateInstances for alarms with terminate actions\n * ec2:DescribeInstanceRecoveryAttribute and ec2:RecoverInstances for alarms\nwith recover actions\n If you have read/write permissions for Amazon CloudWatch but not for Amazon\nEC2, you can still create an alarm, but the stop or terminate actions are not\nperformed. However, if you are later granted the required permissions, the alarm\nactions that you created earlier are performed.\n If you are using an IAM role (for example, an EC2 instance profile), you cannot\nstop or terminate the instance using alarm actions. However, you can still see\nthe alarm state and perform any other actions such as Amazon SNS notifications\nor Auto Scaling policies.\n If you are using temporary security credentials granted using AWS STS, you\ncannot stop or terminate an EC2 instance using alarm actions.\n You must create at least one stop, terminate, or reboot alarm using either the\nAmazon EC2 or CloudWatch consoles to create the EC2ActionsAccess IAM role. After\nthis IAM role is created, you can create stop, terminate, or reboot alarms using\na command-line interface or API." ([put-metric-alarm-input] (clojure.core/let [req<-input__36755__auto__ (req<-put-metric-alarm-input "PutMetricAlarm" put-metric-alarm-input)] (portkey.aws/-query-call portkey.aws.monitoring.-2010-08-01/endpoints "POST" "/" req<-input__36755__auto__ :portkey.aws.monitoring.-2010-08-01/put-metric-alarm-input {:payload nil, :move {}, :headers {}, :uri {}, :querystring {}} nil nil {"LimitExceededFault" :portkey.aws.monitoring.-2010-08-01/limit-exceeded-fault}))))
(clojure.spec.alpha/fdef put-metric-alarm :args (clojure.spec.alpha/tuple :portkey.aws.monitoring.-2010-08-01/put-metric-alarm-input) :ret clojure.core/true?)

(clojure.core/defn get-dashboard "Displays the details of the dashboard that you specify.\n To copy an existing dashboard, use GetDashboard, and then use the data returned\nwithin DashboardBody as the template for the new dashboard when you call\nPutDashboard to create the copy." ([get-dashboard-input] (clojure.core/let [req<-input__36755__auto__ (req<-get-dashboard-input "GetDashboard" get-dashboard-input)] (portkey.aws/-query-call portkey.aws.monitoring.-2010-08-01/endpoints "POST" "/" req<-input__36755__auto__ :portkey.aws.monitoring.-2010-08-01/get-dashboard-input {:payload nil, :move {}, :headers {}, :uri {}, :querystring {}} nil :portkey.aws.monitoring.-2010-08-01/get-dashboard-output {"InvalidParameterValueException" :portkey.aws.monitoring.-2010-08-01/invalid-parameter-value-exception, "DashboardNotFoundError" :portkey.aws.monitoring.-2010-08-01/dashboard-not-found-error, "InternalServiceFault" :portkey.aws.monitoring.-2010-08-01/internal-service-fault}))))
(clojure.spec.alpha/fdef get-dashboard :args (clojure.spec.alpha/tuple :portkey.aws.monitoring.-2010-08-01/get-dashboard-input) :ret (clojure.spec.alpha/and :portkey.aws.monitoring.-2010-08-01/get-dashboard-output))

(clojure.core/defn get-metric-data "You can use the GetMetricData API to retrieve as many as 100 different metrics\nin a single request, with a total of as many as 100,800 datapoints. You can also\noptionally perform math expressions on the values of the returned statistics, to\ncreate new time series that represent new insights into your data. For example,\nusing Lambda metrics, you could divide the Errors metric by the Invocations\nmetric to get an error rate time series. For more information about metric math\nexpressions, see Metric Math Syntax and Functions\n(http://docs.aws.amazon.com/AmazonCloudWatch/latest/monitoring/using-metric-math.html#metric-math-syntax)\nin the Amazon CloudWatch User Guide.\n Calls to the GetMetricData API have a different pricing structure than calls to\nGetMetricStatistics. For more information about pricing, see Amazon CloudWatch\nPricing (https://aws.amazon.com/cloudwatch/pricing/)." ([get-metric-data-input] (clojure.core/let [req<-input__36755__auto__ (req<-get-metric-data-input "GetMetricData" get-metric-data-input)] (portkey.aws/-query-call portkey.aws.monitoring.-2010-08-01/endpoints "POST" "/" req<-input__36755__auto__ :portkey.aws.monitoring.-2010-08-01/get-metric-data-input {:payload nil, :move {}, :headers {}, :uri {}, :querystring {}} nil :portkey.aws.monitoring.-2010-08-01/get-metric-data-output {"InvalidNextToken" :portkey.aws.monitoring.-2010-08-01/invalid-next-token}))))
(clojure.spec.alpha/fdef get-metric-data :args (clojure.spec.alpha/tuple :portkey.aws.monitoring.-2010-08-01/get-metric-data-input) :ret (clojure.spec.alpha/and :portkey.aws.monitoring.-2010-08-01/get-metric-data-output))

(clojure.core/defn disable-alarm-actions "Disables the actions for the specified alarms. When an alarm's actions are\ndisabled, the alarm actions do not execute when the alarm state changes." ([disable-alarm-actions-input] (clojure.core/let [req<-input__36755__auto__ (req<-disable-alarm-actions-input "DisableAlarmActions" disable-alarm-actions-input)] (portkey.aws/-query-call portkey.aws.monitoring.-2010-08-01/endpoints "POST" "/" req<-input__36755__auto__ :portkey.aws.monitoring.-2010-08-01/disable-alarm-actions-input {:payload nil, :move {}, :headers {}, :uri {}, :querystring {}} nil nil {}))))
(clojure.spec.alpha/fdef disable-alarm-actions :args (clojure.spec.alpha/tuple :portkey.aws.monitoring.-2010-08-01/disable-alarm-actions-input) :ret clojure.core/true?)

(clojure.core/defn describe-alarm-history "Retrieves the history for the specified alarm. You can filter the results by\ndate range or item type. If an alarm name is not specified, the histories for\nall alarms are returned.\n CloudWatch retains the history of an alarm even if you delete the alarm." ([] (describe-alarm-history {})) ([describe-alarm-history-input] (clojure.core/let [req<-input__36755__auto__ (req<-describe-alarm-history-input "DescribeAlarmHistory" describe-alarm-history-input)] (portkey.aws/-query-call portkey.aws.monitoring.-2010-08-01/endpoints "POST" "/" req<-input__36755__auto__ :portkey.aws.monitoring.-2010-08-01/describe-alarm-history-input {:payload nil, :move {}, :headers {}, :uri {}, :querystring {}} nil :portkey.aws.monitoring.-2010-08-01/describe-alarm-history-output {"InvalidNextToken" :portkey.aws.monitoring.-2010-08-01/invalid-next-token}))))
(clojure.spec.alpha/fdef describe-alarm-history :args (clojure.spec.alpha/? :portkey.aws.monitoring.-2010-08-01/describe-alarm-history-input) :ret (clojure.spec.alpha/and :portkey.aws.monitoring.-2010-08-01/describe-alarm-history-output))
