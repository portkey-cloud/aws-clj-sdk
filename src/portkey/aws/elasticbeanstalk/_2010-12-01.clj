(ns portkey.aws.elasticbeanstalk.-2010-12-01 (:require [portkey.aws]))

(def
 endpoints
 '{"ap-northeast-1"
   {:credential-scope
    {:service "elasticbeanstalk", :region "ap-northeast-1"},
    :ssl-common-name "elasticbeanstalk.ap-northeast-1.amazonaws.com",
    :endpoint "https://elasticbeanstalk.ap-northeast-1.amazonaws.com",
    :signature-version :v4},
   "eu-west-1"
   {:credential-scope
    {:service "elasticbeanstalk", :region "eu-west-1"},
    :ssl-common-name "elasticbeanstalk.eu-west-1.amazonaws.com",
    :endpoint "https://elasticbeanstalk.eu-west-1.amazonaws.com",
    :signature-version :v4},
   "us-east-2"
   {:credential-scope
    {:service "elasticbeanstalk", :region "us-east-2"},
    :ssl-common-name "elasticbeanstalk.us-east-2.amazonaws.com",
    :endpoint "https://elasticbeanstalk.us-east-2.amazonaws.com",
    :signature-version :v4},
   "ap-southeast-2"
   {:credential-scope
    {:service "elasticbeanstalk", :region "ap-southeast-2"},
    :ssl-common-name "elasticbeanstalk.ap-southeast-2.amazonaws.com",
    :endpoint "https://elasticbeanstalk.ap-southeast-2.amazonaws.com",
    :signature-version :v4},
   "cn-north-1"
   {:credential-scope
    {:service "elasticbeanstalk", :region "cn-north-1"},
    :ssl-common-name "elasticbeanstalk.cn-north-1.amazonaws.com.cn",
    :endpoint "https://elasticbeanstalk.cn-north-1.amazonaws.com.cn",
    :signature-version :v4},
   "sa-east-1"
   {:credential-scope
    {:service "elasticbeanstalk", :region "sa-east-1"},
    :ssl-common-name "elasticbeanstalk.sa-east-1.amazonaws.com",
    :endpoint "https://elasticbeanstalk.sa-east-1.amazonaws.com",
    :signature-version :v4},
   "ap-southeast-1"
   {:credential-scope
    {:service "elasticbeanstalk", :region "ap-southeast-1"},
    :ssl-common-name "elasticbeanstalk.ap-southeast-1.amazonaws.com",
    :endpoint "https://elasticbeanstalk.ap-southeast-1.amazonaws.com",
    :signature-version :v4},
   "cn-northwest-1"
   {:credential-scope
    {:service "elasticbeanstalk", :region "cn-northwest-1"},
    :ssl-common-name
    "elasticbeanstalk.cn-northwest-1.amazonaws.com.cn",
    :endpoint
    "https://elasticbeanstalk.cn-northwest-1.amazonaws.com.cn",
    :signature-version :v4},
   "ap-northeast-2"
   {:credential-scope
    {:service "elasticbeanstalk", :region "ap-northeast-2"},
    :ssl-common-name "elasticbeanstalk.ap-northeast-2.amazonaws.com",
    :endpoint "https://elasticbeanstalk.ap-northeast-2.amazonaws.com",
    :signature-version :v4},
   "eu-west-3"
   {:credential-scope
    {:service "elasticbeanstalk", :region "eu-west-3"},
    :ssl-common-name "elasticbeanstalk.eu-west-3.amazonaws.com",
    :endpoint "https://elasticbeanstalk.eu-west-3.amazonaws.com",
    :signature-version :v4},
   "ca-central-1"
   {:credential-scope
    {:service "elasticbeanstalk", :region "ca-central-1"},
    :ssl-common-name "elasticbeanstalk.ca-central-1.amazonaws.com",
    :endpoint "https://elasticbeanstalk.ca-central-1.amazonaws.com",
    :signature-version :v4},
   "eu-central-1"
   {:credential-scope
    {:service "elasticbeanstalk", :region "eu-central-1"},
    :ssl-common-name "elasticbeanstalk.eu-central-1.amazonaws.com",
    :endpoint "https://elasticbeanstalk.eu-central-1.amazonaws.com",
    :signature-version :v4},
   "eu-west-2"
   {:credential-scope
    {:service "elasticbeanstalk", :region "eu-west-2"},
    :ssl-common-name "elasticbeanstalk.eu-west-2.amazonaws.com",
    :endpoint "https://elasticbeanstalk.eu-west-2.amazonaws.com",
    :signature-version :v4},
   "us-gov-west-1"
   {:credential-scope
    {:service "elasticbeanstalk", :region "us-gov-west-1"},
    :ssl-common-name "elasticbeanstalk.us-gov-west-1.amazonaws.com",
    :endpoint "https://elasticbeanstalk.us-gov-west-1.amazonaws.com",
    :signature-version :v4},
   "us-west-2"
   {:credential-scope
    {:service "elasticbeanstalk", :region "us-west-2"},
    :ssl-common-name "elasticbeanstalk.us-west-2.amazonaws.com",
    :endpoint "https://elasticbeanstalk.us-west-2.amazonaws.com",
    :signature-version :v4},
   "us-east-1"
   {:credential-scope
    {:service "elasticbeanstalk", :region "us-east-1"},
    :ssl-common-name "elasticbeanstalk.us-east-1.amazonaws.com",
    :endpoint "https://elasticbeanstalk.us-east-1.amazonaws.com",
    :signature-version :v4},
   "us-west-1"
   {:credential-scope
    {:service "elasticbeanstalk", :region "us-west-1"},
    :ssl-common-name "elasticbeanstalk.us-west-1.amazonaws.com",
    :endpoint "https://elasticbeanstalk.us-west-1.amazonaws.com",
    :signature-version :v4},
   "ap-south-1"
   {:credential-scope
    {:service "elasticbeanstalk", :region "ap-south-1"},
    :ssl-common-name "elasticbeanstalk.ap-south-1.amazonaws.com",
    :endpoint "https://elasticbeanstalk.ap-south-1.amazonaws.com",
    :signature-version :v4}})

(clojure.core/declare ser-version-label ser-platform-filter ser-source-repository ser-event-severity ser-platform-filter-value-list ser-boxed-int ser-non-empty-string ser-include-deleted-back-to ser-request-id ser-terminate-env-force ser-option-namespace ser-delete-source-bundle ser-boxed-boolean ser-build-configuration ser-solution-stack-name ser-platform-name ser-application-names-list ser-environment-tier ser-environment-name ser-terminate-environment-resources ser-environment-id-list ser-platform-filter-type ser-time-filter-end ser-environment-health-attributes ser-max-records ser-tag-key ser-application-version-lifecycle-config ser-tags ser-dnscname-prefix ser-group-name ser-source-type ser-auto-create-application ser-application-resource-lifecycle-config ser-version-labels-list ser-next-token ser-environment-info-type ser-configuration-option-name ser-platform-filter-value ser-option-specification ser-tag-list ser-environment-health-attribute ser-instances-health-attributes ser-tag-key-list ser-include-deleted ser-action-status ser-description ser-tag-value ser-configuration-option-settings-list ser-configuration-option-setting ser-time-filter-start ser-options-specifier-list ser-platform-max-records ser-max-count-rule ser-application-name ser-platform-version ser-platform-filters ser-resource-name ser-integer ser-string ser-environment-names-list ser-instances-health-attribute ser-s3-key ser-s3-location ser-max-age-rule ser-s3-bucket ser-source-location ser-platform-filter-operator ser-resource-arn ser-platform-arn ser-tag ser-compute-type ser-application-version-proccess ser-version-labels ser-environment-id ser-source-build-information ser-configuration-template-name ser-force-terminate ser-token ser-configuration-option-value ser-source-configuration)

(clojure.core/defn- ser-version-label [shape-input] shape-input)
(clojure.core/defn- ser-platform-filter [shape-input] (clojure.core/cond-> {} (:type shape-input) (clojure.core/assoc "PlatformFilter.Type" (ser-platform-filter-type (:type shape-input))) (:operator shape-input) (clojure.core/assoc "PlatformFilter.Operator" (ser-platform-filter-operator (:operator shape-input))) (:values shape-input) (clojure.core/assoc "PlatformFilter.Values" (ser-platform-filter-value-list (:values shape-input)))))
(clojure.core/defn- ser-source-repository [shape-input] ({"CodeCommit" "CodeCommit", :code-commit "CodeCommit", "S3" "S3", :s3 "S3"} shape-input))
(clojure.core/defn- ser-event-severity [shape-input] ({:warn "WARN", :trace "TRACE", "WARN" "WARN", :debug "DEBUG", "ERROR" "ERROR", :fatal "FATAL", "TRACE" "TRACE", "DEBUG" "DEBUG", "FATAL" "FATAL", :info "INFO", :error "ERROR", "INFO" "INFO"} shape-input))
(clojure.core/defn- ser-platform-filter-value-list [shape-input] (clojure.core/into {} (clojure.core/map-indexed (clojure.core/fn [idx__36486__auto__ item__36487__auto__] [(clojure.core/str "member." (clojure.core/inc idx__36486__auto__)) item__36487__auto__]) shape-input)))
(clojure.core/defn- ser-boxed-int [shape-input] shape-input)
(clojure.core/defn- ser-non-empty-string [shape-input] shape-input)
(clojure.core/defn- ser-include-deleted-back-to [shape-input] shape-input)
(clojure.core/defn- ser-request-id [shape-input] shape-input)
(clojure.core/defn- ser-terminate-env-force [shape-input] shape-input)
(clojure.core/defn- ser-option-namespace [shape-input] shape-input)
(clojure.core/defn- ser-delete-source-bundle [shape-input] shape-input)
(clojure.core/defn- ser-boxed-boolean [shape-input] shape-input)
(clojure.core/defn- ser-build-configuration [shape-input] (clojure.core/cond-> {} (:artifact-name shape-input) (clojure.core/assoc "BuildConfiguration.ArtifactName" (ser-string (:artifact-name shape-input))) (:code-build-service-role shape-input) (clojure.core/assoc "BuildConfiguration.CodeBuildServiceRole" (ser-non-empty-string (:code-build-service-role shape-input))) (:compute-type shape-input) (clojure.core/assoc "BuildConfiguration.ComputeType" (ser-compute-type (:compute-type shape-input))) (:image shape-input) (clojure.core/assoc "BuildConfiguration.Image" (ser-non-empty-string (:image shape-input))) (:timeout-in-minutes shape-input) (clojure.core/assoc "BuildConfiguration.TimeoutInMinutes" (ser-boxed-int (:timeout-in-minutes shape-input)))))
(clojure.core/defn- ser-solution-stack-name [shape-input] shape-input)
(clojure.core/defn- ser-platform-name [shape-input] shape-input)
(clojure.core/defn- ser-application-names-list [shape-input] (clojure.core/into {} (clojure.core/map-indexed (clojure.core/fn [idx__36486__auto__ item__36487__auto__] [(clojure.core/str "member." (clojure.core/inc idx__36486__auto__)) item__36487__auto__]) shape-input)))
(clojure.core/defn- ser-environment-tier [shape-input] (clojure.core/cond-> {} (:name shape-input) (clojure.core/assoc "EnvironmentTier.Name" (ser-string (:name shape-input))) (:type shape-input) (clojure.core/assoc "EnvironmentTier.Type" (ser-string (:type shape-input))) (:version shape-input) (clojure.core/assoc "EnvironmentTier.Version" (ser-string (:version shape-input)))))
(clojure.core/defn- ser-environment-name [shape-input] shape-input)
(clojure.core/defn- ser-terminate-environment-resources [shape-input] shape-input)
(clojure.core/defn- ser-environment-id-list [shape-input] (clojure.core/into {} (clojure.core/map-indexed (clojure.core/fn [idx__36486__auto__ item__36487__auto__] [(clojure.core/str "member." (clojure.core/inc idx__36486__auto__)) item__36487__auto__]) shape-input)))
(clojure.core/defn- ser-platform-filter-type [shape-input] shape-input)
(clojure.core/defn- ser-time-filter-end [shape-input] shape-input)
(clojure.core/defn- ser-environment-health-attributes [shape-input] (clojure.core/into {} (clojure.core/map-indexed (clojure.core/fn [idx__36486__auto__ item__36487__auto__] [(clojure.core/str "member." (clojure.core/inc idx__36486__auto__)) item__36487__auto__]) shape-input)))
(clojure.core/defn- ser-max-records [shape-input] shape-input)
(clojure.core/defn- ser-tag-key [shape-input] shape-input)
(clojure.core/defn- ser-application-version-lifecycle-config [shape-input] (clojure.core/cond-> {} (:max-count-rule shape-input) (clojure.core/assoc "ApplicationVersionLifecycleConfig.MaxCountRule" (ser-max-count-rule (:max-count-rule shape-input))) (:max-age-rule shape-input) (clojure.core/assoc "ApplicationVersionLifecycleConfig.MaxAgeRule" (ser-max-age-rule (:max-age-rule shape-input)))))
(clojure.core/defn- ser-tags [shape-input] (clojure.core/into {} (clojure.core/map-indexed (clojure.core/fn [idx__36486__auto__ item__36487__auto__] [(clojure.core/str "member." (clojure.core/inc idx__36486__auto__)) item__36487__auto__]) shape-input)))
(clojure.core/defn- ser-dnscname-prefix [shape-input] shape-input)
(clojure.core/defn- ser-group-name [shape-input] shape-input)
(clojure.core/defn- ser-source-type [shape-input] ({"Git" "Git", :git "Git", "Zip" "Zip", :zip "Zip"} shape-input))
(clojure.core/defn- ser-auto-create-application [shape-input] shape-input)
(clojure.core/defn- ser-application-resource-lifecycle-config [shape-input] (clojure.core/cond-> {} (:service-role shape-input) (clojure.core/assoc "ApplicationResourceLifecycleConfig.ServiceRole" (ser-string (:service-role shape-input))) (:version-lifecycle-config shape-input) (clojure.core/assoc "ApplicationResourceLifecycleConfig.VersionLifecycleConfig" (ser-application-version-lifecycle-config (:version-lifecycle-config shape-input)))))
(clojure.core/defn- ser-version-labels-list [shape-input] (clojure.core/into {} (clojure.core/map-indexed (clojure.core/fn [idx__36486__auto__ item__36487__auto__] [(clojure.core/str "member." (clojure.core/inc idx__36486__auto__)) item__36487__auto__]) shape-input)))
(clojure.core/defn- ser-next-token [shape-input] shape-input)
(clojure.core/defn- ser-environment-info-type [shape-input] ({"tail" "tail", :tail "tail", "bundle" "bundle", :bundle "bundle"} shape-input))
(clojure.core/defn- ser-configuration-option-name [shape-input] shape-input)
(clojure.core/defn- ser-platform-filter-value [shape-input] shape-input)
(clojure.core/defn- ser-option-specification [shape-input] (clojure.core/cond-> {} (:resource-name shape-input) (clojure.core/assoc "OptionSpecification.ResourceName" (ser-resource-name (:resource-name shape-input))) (:namespace shape-input) (clojure.core/assoc "OptionSpecification.Namespace" (ser-option-namespace (:namespace shape-input))) (:option-name shape-input) (clojure.core/assoc "OptionSpecification.OptionName" (ser-configuration-option-name (:option-name shape-input)))))
(clojure.core/defn- ser-tag-list [shape-input] (clojure.core/into {} (clojure.core/map-indexed (clojure.core/fn [idx__36486__auto__ item__36487__auto__] [(clojure.core/str "member." (clojure.core/inc idx__36486__auto__)) item__36487__auto__]) shape-input)))
(clojure.core/defn- ser-environment-health-attribute [shape-input] ({:health-status "HealthStatus", :instances-health "InstancesHealth", :application-metrics "ApplicationMetrics", :color "Color", "HealthStatus" "HealthStatus", "InstancesHealth" "InstancesHealth", "Status" "Status", :all "All", "Causes" "Causes", :status "Status", "ApplicationMetrics" "ApplicationMetrics", :refreshed-at "RefreshedAt", "RefreshedAt" "RefreshedAt", "All" "All", "Color" "Color", :causes "Causes"} shape-input))
(clojure.core/defn- ser-instances-health-attributes [shape-input] (clojure.core/into {} (clojure.core/map-indexed (clojure.core/fn [idx__36486__auto__ item__36487__auto__] [(clojure.core/str "member." (clojure.core/inc idx__36486__auto__)) item__36487__auto__]) shape-input)))
(clojure.core/defn- ser-tag-key-list [shape-input] (clojure.core/into {} (clojure.core/map-indexed (clojure.core/fn [idx__36486__auto__ item__36487__auto__] [(clojure.core/str "member." (clojure.core/inc idx__36486__auto__)) item__36487__auto__]) shape-input)))
(clojure.core/defn- ser-include-deleted [shape-input] shape-input)
(clojure.core/defn- ser-action-status [shape-input] ({"Scheduled" "Scheduled", :scheduled "Scheduled", "Pending" "Pending", :pending "Pending", "Running" "Running", :running "Running", "Unknown" "Unknown", :unknown "Unknown"} shape-input))
(clojure.core/defn- ser-description [shape-input] shape-input)
(clojure.core/defn- ser-tag-value [shape-input] shape-input)
(clojure.core/defn- ser-configuration-option-settings-list [shape-input] (clojure.core/into {} (clojure.core/map-indexed (clojure.core/fn [idx__36486__auto__ item__36487__auto__] [(clojure.core/str "member." (clojure.core/inc idx__36486__auto__)) item__36487__auto__]) shape-input)))
(clojure.core/defn- ser-configuration-option-setting [shape-input] (clojure.core/cond-> {} (:resource-name shape-input) (clojure.core/assoc "ConfigurationOptionSetting.ResourceName" (ser-resource-name (:resource-name shape-input))) (:namespace shape-input) (clojure.core/assoc "ConfigurationOptionSetting.Namespace" (ser-option-namespace (:namespace shape-input))) (:option-name shape-input) (clojure.core/assoc "ConfigurationOptionSetting.OptionName" (ser-configuration-option-name (:option-name shape-input))) (:value shape-input) (clojure.core/assoc "ConfigurationOptionSetting.Value" (ser-configuration-option-value (:value shape-input)))))
(clojure.core/defn- ser-time-filter-start [shape-input] shape-input)
(clojure.core/defn- ser-options-specifier-list [shape-input] (clojure.core/into {} (clojure.core/map-indexed (clojure.core/fn [idx__36486__auto__ item__36487__auto__] [(clojure.core/str "member." (clojure.core/inc idx__36486__auto__)) item__36487__auto__]) shape-input)))
(clojure.core/defn- ser-platform-max-records [shape-input] shape-input)
(clojure.core/defn- ser-max-count-rule [shape-input] (clojure.core/cond-> {} (:enabled shape-input) (clojure.core/assoc "MaxCountRule.Enabled" (ser-boxed-boolean (:enabled shape-input))) (:max-count shape-input) (clojure.core/assoc "MaxCountRule.MaxCount" (ser-boxed-int (:max-count shape-input))) (:delete-source-froms3 shape-input) (clojure.core/assoc "MaxCountRule.DeleteSourceFromS3" (ser-boxed-boolean (:delete-source-froms3 shape-input)))))
(clojure.core/defn- ser-application-name [shape-input] shape-input)
(clojure.core/defn- ser-platform-version [shape-input] shape-input)
(clojure.core/defn- ser-platform-filters [shape-input] (clojure.core/into {} (clojure.core/map-indexed (clojure.core/fn [idx__36486__auto__ item__36487__auto__] [(clojure.core/str "member." (clojure.core/inc idx__36486__auto__)) item__36487__auto__]) shape-input)))
(clojure.core/defn- ser-resource-name [shape-input] shape-input)
(clojure.core/defn- ser-integer [shape-input] shape-input)
(clojure.core/defn- ser-string [shape-input] shape-input)
(clojure.core/defn- ser-environment-names-list [shape-input] (clojure.core/into {} (clojure.core/map-indexed (clojure.core/fn [idx__36486__auto__ item__36487__auto__] [(clojure.core/str "member." (clojure.core/inc idx__36486__auto__)) item__36487__auto__]) shape-input)))
(clojure.core/defn- ser-instances-health-attribute [shape-input] ({:health-status "HealthStatus", "Deployment" "Deployment", "LaunchedAt" "LaunchedAt", :application-metrics "ApplicationMetrics", :system "System", :color "Color", "InstanceType" "InstanceType", "HealthStatus" "HealthStatus", :instance-type "InstanceType", "AvailabilityZone" "AvailabilityZone", :availability-zone "AvailabilityZone", :all "All", "Causes" "Causes", "ApplicationMetrics" "ApplicationMetrics", :deployment "Deployment", :refreshed-at "RefreshedAt", "RefreshedAt" "RefreshedAt", "System" "System", "All" "All", "Color" "Color", :causes "Causes", :launched-at "LaunchedAt"} shape-input))
(clojure.core/defn- ser-s3-key [shape-input] shape-input)
(clojure.core/defn- ser-s3-location [shape-input] (clojure.core/cond-> {} (:s3-bucket shape-input) (clojure.core/assoc "S3Location.S3Bucket" (ser-s3-bucket (:s3-bucket shape-input))) (:s3-key shape-input) (clojure.core/assoc "S3Location.S3Key" (ser-s3-key (:s3-key shape-input)))))
(clojure.core/defn- ser-max-age-rule [shape-input] (clojure.core/cond-> {} (:enabled shape-input) (clojure.core/assoc "MaxAgeRule.Enabled" (ser-boxed-boolean (:enabled shape-input))) (:max-age-in-days shape-input) (clojure.core/assoc "MaxAgeRule.MaxAgeInDays" (ser-boxed-int (:max-age-in-days shape-input))) (:delete-source-froms3 shape-input) (clojure.core/assoc "MaxAgeRule.DeleteSourceFromS3" (ser-boxed-boolean (:delete-source-froms3 shape-input)))))
(clojure.core/defn- ser-s3-bucket [shape-input] shape-input)
(clojure.core/defn- ser-source-location [shape-input] shape-input)
(clojure.core/defn- ser-platform-filter-operator [shape-input] shape-input)
(clojure.core/defn- ser-resource-arn [shape-input] shape-input)
(clojure.core/defn- ser-platform-arn [shape-input] shape-input)
(clojure.core/defn- ser-tag [shape-input] (clojure.core/cond-> {} (:key shape-input) (clojure.core/assoc "Tag.Key" (ser-tag-key (:key shape-input))) (:value shape-input) (clojure.core/assoc "Tag.Value" (ser-tag-value (:value shape-input)))))
(clojure.core/defn- ser-compute-type [shape-input] ({"BUILD_GENERAL1_SMALL" "BUILD_GENERAL1_SMALL", :build-general1-small "BUILD_GENERAL1_SMALL", "BUILD_GENERAL1_MEDIUM" "BUILD_GENERAL1_MEDIUM", :build-general1-medium "BUILD_GENERAL1_MEDIUM", "BUILD_GENERAL1_LARGE" "BUILD_GENERAL1_LARGE", :build-general1-large "BUILD_GENERAL1_LARGE"} shape-input))
(clojure.core/defn- ser-application-version-proccess [shape-input] shape-input)
(clojure.core/defn- ser-version-labels [shape-input] (clojure.core/into {} (clojure.core/map-indexed (clojure.core/fn [idx__36486__auto__ item__36487__auto__] [(clojure.core/str "member." (clojure.core/inc idx__36486__auto__)) item__36487__auto__]) shape-input)))
(clojure.core/defn- ser-environment-id [shape-input] shape-input)
(clojure.core/defn- ser-source-build-information [shape-input] (clojure.core/cond-> {} (:source-type shape-input) (clojure.core/assoc "SourceBuildInformation.SourceType" (ser-source-type (:source-type shape-input))) (:source-repository shape-input) (clojure.core/assoc "SourceBuildInformation.SourceRepository" (ser-source-repository (:source-repository shape-input))) (:source-location shape-input) (clojure.core/assoc "SourceBuildInformation.SourceLocation" (ser-source-location (:source-location shape-input)))))
(clojure.core/defn- ser-configuration-template-name [shape-input] shape-input)
(clojure.core/defn- ser-force-terminate [shape-input] shape-input)
(clojure.core/defn- ser-token [shape-input] shape-input)
(clojure.core/defn- ser-configuration-option-value [shape-input] shape-input)
(clojure.core/defn- ser-source-configuration [shape-input] (clojure.core/cond-> {} (:application-name shape-input) (clojure.core/assoc "SourceConfiguration.ApplicationName" (ser-application-name (:application-name shape-input))) (:template-name shape-input) (clojure.core/assoc "SourceConfiguration.TemplateName" (ser-configuration-template-name (:template-name shape-input)))))

(clojure.core/defn req<-create-application-version-message [action-name47066 input47065] (clojure.core/let [input47067 {:body {"ApplicationName" (ser-application-name (input47065 :application-name)), "VersionLabel" (ser-version-label (input47065 :version-label)), "Version" "2010-12-01", "Action" action-name47066}}] (clojure.core/cond-> input47067 (clojure.core/contains? input47065 :description) (clojure.core/assoc-in [:body "Description"] (ser-description (input47065 :description))) (clojure.core/contains? input47065 :source-build-information) (clojure.core/assoc-in [:body "SourceBuildInformation"] (ser-source-build-information (input47065 :source-build-information))) (clojure.core/contains? input47065 :source-bundle) (clojure.core/assoc-in [:body "SourceBundle"] (ser-s3-location (input47065 :source-bundle))) (clojure.core/contains? input47065 :build-configuration) (clojure.core/assoc-in [:body "BuildConfiguration"] (ser-build-configuration (input47065 :build-configuration))) (clojure.core/contains? input47065 :auto-create-application) (clojure.core/assoc-in [:body "AutoCreateApplication"] (ser-auto-create-application (input47065 :auto-create-application))) (clojure.core/contains? input47065 :process) (clojure.core/assoc-in [:body "Process"] (ser-application-version-proccess (input47065 :process))))))
(clojure.core/defn req<-update-environment-message [action-name47069 input47068] (clojure.core/cond-> {:body {"Version" "2010-12-01", "Action" action-name47069}} (clojure.core/contains? input47068 :version-label) (clojure.core/assoc-in [:body "VersionLabel"] (ser-version-label (input47068 :version-label))) (clojure.core/contains? input47068 :tier) (clojure.core/assoc-in [:body "Tier"] (ser-environment-tier (input47068 :tier))) (clojure.core/contains? input47068 :solution-stack-name) (clojure.core/assoc-in [:body "SolutionStackName"] (ser-solution-stack-name (input47068 :solution-stack-name))) (clojure.core/contains? input47068 :environment-name) (clojure.core/assoc-in [:body "EnvironmentName"] (ser-environment-name (input47068 :environment-name))) (clojure.core/contains? input47068 :option-settings) (clojure.core/assoc-in [:body "OptionSettings"] (ser-configuration-option-settings-list (input47068 :option-settings))) (clojure.core/contains? input47068 :group-name) (clojure.core/assoc-in [:body "GroupName"] (ser-group-name (input47068 :group-name))) (clojure.core/contains? input47068 :description) (clojure.core/assoc-in [:body "Description"] (ser-description (input47068 :description))) (clojure.core/contains? input47068 :application-name) (clojure.core/assoc-in [:body "ApplicationName"] (ser-application-name (input47068 :application-name))) (clojure.core/contains? input47068 :template-name) (clojure.core/assoc-in [:body "TemplateName"] (ser-configuration-template-name (input47068 :template-name))) (clojure.core/contains? input47068 :platform-arn) (clojure.core/assoc-in [:body "PlatformArn"] (ser-platform-arn (input47068 :platform-arn))) (clojure.core/contains? input47068 :options-to-remove) (clojure.core/assoc-in [:body "OptionsToRemove"] (ser-options-specifier-list (input47068 :options-to-remove))) (clojure.core/contains? input47068 :environment-id) (clojure.core/assoc-in [:body "EnvironmentId"] (ser-environment-id (input47068 :environment-id)))))
(clojure.core/defn req<-update-tags-for-resource-message [action-name47071 input47070] (clojure.core/let [input47072 {:body {"ResourceArn" (ser-resource-arn (input47070 :resource-arn)), "Version" "2010-12-01", "Action" action-name47071}}] (clojure.core/cond-> input47072 (clojure.core/contains? input47070 :tags-to-add) (clojure.core/assoc-in [:body "TagsToAdd"] (ser-tag-list (input47070 :tags-to-add))) (clojure.core/contains? input47070 :tags-to-remove) (clojure.core/assoc-in [:body "TagsToRemove"] (ser-tag-key-list (input47070 :tags-to-remove))))))
(clojure.core/defn req<-describe-platform-version-request [action-name47074 input47073] (clojure.core/cond-> {:body {"Version" "2010-12-01", "Action" action-name47074}} (clojure.core/contains? input47073 :platform-arn) (clojure.core/assoc-in [:body "PlatformArn"] (ser-platform-arn (input47073 :platform-arn)))))
(clojure.core/defn req<-create-platform-version-request [action-name47076 input47075] (clojure.core/let [input47077 {:body {"PlatformName" (ser-platform-name (input47075 :platform-name)), "PlatformVersion" (ser-platform-version (input47075 :platform-version)), "PlatformDefinitionBundle" (ser-s3-location (input47075 :platform-definition-bundle)), "Version" "2010-12-01", "Action" action-name47076}}] (clojure.core/cond-> input47077 (clojure.core/contains? input47075 :environment-name) (clojure.core/assoc-in [:body "EnvironmentName"] (ser-environment-name (input47075 :environment-name))) (clojure.core/contains? input47075 :option-settings) (clojure.core/assoc-in [:body "OptionSettings"] (ser-configuration-option-settings-list (input47075 :option-settings))))))
(clojure.core/defn req<-create-environment-message [action-name47079 input47078] (clojure.core/let [input47080 {:body {"ApplicationName" (ser-application-name (input47078 :application-name)), "Version" "2010-12-01", "Action" action-name47079}}] (clojure.core/cond-> input47080 (clojure.core/contains? input47078 :version-label) (clojure.core/assoc-in [:body "VersionLabel"] (ser-version-label (input47078 :version-label))) (clojure.core/contains? input47078 :tier) (clojure.core/assoc-in [:body "Tier"] (ser-environment-tier (input47078 :tier))) (clojure.core/contains? input47078 :solution-stack-name) (clojure.core/assoc-in [:body "SolutionStackName"] (ser-solution-stack-name (input47078 :solution-stack-name))) (clojure.core/contains? input47078 :environment-name) (clojure.core/assoc-in [:body "EnvironmentName"] (ser-environment-name (input47078 :environment-name))) (clojure.core/contains? input47078 :option-settings) (clojure.core/assoc-in [:body "OptionSettings"] (ser-configuration-option-settings-list (input47078 :option-settings))) (clojure.core/contains? input47078 :tags) (clojure.core/assoc-in [:body "Tags"] (ser-tags (input47078 :tags))) (clojure.core/contains? input47078 :group-name) (clojure.core/assoc-in [:body "GroupName"] (ser-group-name (input47078 :group-name))) (clojure.core/contains? input47078 :description) (clojure.core/assoc-in [:body "Description"] (ser-description (input47078 :description))) (clojure.core/contains? input47078 :cnameprefix) (clojure.core/assoc-in [:body "CNAMEPrefix"] (ser-dnscname-prefix (input47078 :cnameprefix))) (clojure.core/contains? input47078 :template-name) (clojure.core/assoc-in [:body "TemplateName"] (ser-configuration-template-name (input47078 :template-name))) (clojure.core/contains? input47078 :platform-arn) (clojure.core/assoc-in [:body "PlatformArn"] (ser-platform-arn (input47078 :platform-arn))) (clojure.core/contains? input47078 :options-to-remove) (clojure.core/assoc-in [:body "OptionsToRemove"] (ser-options-specifier-list (input47078 :options-to-remove))))))
(clojure.core/defn req<-describe-environment-managed-actions-request [action-name47082 input47081] (clojure.core/cond-> {:body {"Version" "2010-12-01", "Action" action-name47082}} (clojure.core/contains? input47081 :environment-name) (clojure.core/assoc-in [:body "EnvironmentName"] (ser-string (input47081 :environment-name))) (clojure.core/contains? input47081 :environment-id) (clojure.core/assoc-in [:body "EnvironmentId"] (ser-string (input47081 :environment-id))) (clojure.core/contains? input47081 :status) (clojure.core/assoc-in [:body "Status"] (ser-action-status (input47081 :status)))))
(clojure.core/defn req<-delete-application-message [action-name47084 input47083] (clojure.core/let [input47085 {:body {"ApplicationName" (ser-application-name (input47083 :application-name)), "Version" "2010-12-01", "Action" action-name47084}}] (clojure.core/cond-> input47085 (clojure.core/contains? input47083 :terminate-env-by-force) (clojure.core/assoc-in [:body "TerminateEnvByForce"] (ser-terminate-env-force (input47083 :terminate-env-by-force))))))
(clojure.core/defn req<-describe-instances-health-request [action-name47087 input47086] (clojure.core/cond-> {:body {"Version" "2010-12-01", "Action" action-name47087}} (clojure.core/contains? input47086 :environment-name) (clojure.core/assoc-in [:body "EnvironmentName"] (ser-environment-name (input47086 :environment-name))) (clojure.core/contains? input47086 :environment-id) (clojure.core/assoc-in [:body "EnvironmentId"] (ser-environment-id (input47086 :environment-id))) (clojure.core/contains? input47086 :attribute-names) (clojure.core/assoc-in [:body "AttributeNames"] (ser-instances-health-attributes (input47086 :attribute-names))) (clojure.core/contains? input47086 :next-token) (clojure.core/assoc-in [:body "NextToken"] (ser-next-token (input47086 :next-token)))))
(clojure.core/defn req<-describe-configuration-options-message [action-name47089 input47088] (clojure.core/cond-> {:body {"Version" "2010-12-01", "Action" action-name47089}} (clojure.core/contains? input47088 :application-name) (clojure.core/assoc-in [:body "ApplicationName"] (ser-application-name (input47088 :application-name))) (clojure.core/contains? input47088 :template-name) (clojure.core/assoc-in [:body "TemplateName"] (ser-configuration-template-name (input47088 :template-name))) (clojure.core/contains? input47088 :environment-name) (clojure.core/assoc-in [:body "EnvironmentName"] (ser-environment-name (input47088 :environment-name))) (clojure.core/contains? input47088 :solution-stack-name) (clojure.core/assoc-in [:body "SolutionStackName"] (ser-solution-stack-name (input47088 :solution-stack-name))) (clojure.core/contains? input47088 :platform-arn) (clojure.core/assoc-in [:body "PlatformArn"] (ser-platform-arn (input47088 :platform-arn))) (clojure.core/contains? input47088 :options) (clojure.core/assoc-in [:body "Options"] (ser-options-specifier-list (input47088 :options)))))
(clojure.core/defn req<-compose-environments-message [action-name47091 input47090] (clojure.core/cond-> {:body {"Version" "2010-12-01", "Action" action-name47091}} (clojure.core/contains? input47090 :application-name) (clojure.core/assoc-in [:body "ApplicationName"] (ser-application-name (input47090 :application-name))) (clojure.core/contains? input47090 :group-name) (clojure.core/assoc-in [:body "GroupName"] (ser-group-name (input47090 :group-name))) (clojure.core/contains? input47090 :version-labels) (clojure.core/assoc-in [:body "VersionLabels"] (ser-version-labels (input47090 :version-labels)))))
(clojure.core/defn req<-describe-events-message [action-name47093 input47092] (clojure.core/cond-> {:body {"Version" "2010-12-01", "Action" action-name47093}} (clojure.core/contains? input47092 :version-label) (clojure.core/assoc-in [:body "VersionLabel"] (ser-version-label (input47092 :version-label))) (clojure.core/contains? input47092 :severity) (clojure.core/assoc-in [:body "Severity"] (ser-event-severity (input47092 :severity))) (clojure.core/contains? input47092 :end-time) (clojure.core/assoc-in [:body "EndTime"] (ser-time-filter-end (input47092 :end-time))) (clojure.core/contains? input47092 :request-id) (clojure.core/assoc-in [:body "RequestId"] (ser-request-id (input47092 :request-id))) (clojure.core/contains? input47092 :start-time) (clojure.core/assoc-in [:body "StartTime"] (ser-time-filter-start (input47092 :start-time))) (clojure.core/contains? input47092 :environment-name) (clojure.core/assoc-in [:body "EnvironmentName"] (ser-environment-name (input47092 :environment-name))) (clojure.core/contains? input47092 :max-records) (clojure.core/assoc-in [:body "MaxRecords"] (ser-max-records (input47092 :max-records))) (clojure.core/contains? input47092 :next-token) (clojure.core/assoc-in [:body "NextToken"] (ser-token (input47092 :next-token))) (clojure.core/contains? input47092 :application-name) (clojure.core/assoc-in [:body "ApplicationName"] (ser-application-name (input47092 :application-name))) (clojure.core/contains? input47092 :template-name) (clojure.core/assoc-in [:body "TemplateName"] (ser-configuration-template-name (input47092 :template-name))) (clojure.core/contains? input47092 :platform-arn) (clojure.core/assoc-in [:body "PlatformArn"] (ser-platform-arn (input47092 :platform-arn))) (clojure.core/contains? input47092 :environment-id) (clojure.core/assoc-in [:body "EnvironmentId"] (ser-environment-id (input47092 :environment-id)))))
(clojure.core/defn req<-describe-environment-resources-message [action-name47095 input47094] (clojure.core/cond-> {:body {"Version" "2010-12-01", "Action" action-name47095}} (clojure.core/contains? input47094 :environment-id) (clojure.core/assoc-in [:body "EnvironmentId"] (ser-environment-id (input47094 :environment-id))) (clojure.core/contains? input47094 :environment-name) (clojure.core/assoc-in [:body "EnvironmentName"] (ser-environment-name (input47094 :environment-name)))))
(clojure.core/defn req<-update-application-resource-lifecycle-message [action-name47097 input47096] {:body {"ApplicationName" (ser-application-name (input47096 :application-name)), "ResourceLifecycleConfig" (ser-application-resource-lifecycle-config (input47096 :resource-lifecycle-config)), "Version" "2010-12-01", "Action" action-name47097}})
(clojure.core/defn req<-describe-environment-health-request [action-name47099 input47098] (clojure.core/cond-> {:body {"Version" "2010-12-01", "Action" action-name47099}} (clojure.core/contains? input47098 :environment-name) (clojure.core/assoc-in [:body "EnvironmentName"] (ser-environment-name (input47098 :environment-name))) (clojure.core/contains? input47098 :environment-id) (clojure.core/assoc-in [:body "EnvironmentId"] (ser-environment-id (input47098 :environment-id))) (clojure.core/contains? input47098 :attribute-names) (clojure.core/assoc-in [:body "AttributeNames"] (ser-environment-health-attributes (input47098 :attribute-names)))))
(clojure.core/defn req<-request-environment-info-message [action-name47101 input47100] (clojure.core/let [input47102 {:body {"InfoType" (ser-environment-info-type (input47100 :info-type)), "Version" "2010-12-01", "Action" action-name47101}}] (clojure.core/cond-> input47102 (clojure.core/contains? input47100 :environment-id) (clojure.core/assoc-in [:body "EnvironmentId"] (ser-environment-id (input47100 :environment-id))) (clojure.core/contains? input47100 :environment-name) (clojure.core/assoc-in [:body "EnvironmentName"] (ser-environment-name (input47100 :environment-name))))))
(clojure.core/defn req<-list-platform-versions-request [action-name47104 input47103] (clojure.core/cond-> {:body {"Version" "2010-12-01", "Action" action-name47104}} (clojure.core/contains? input47103 :filters) (clojure.core/assoc-in [:body "Filters"] (ser-platform-filters (input47103 :filters))) (clojure.core/contains? input47103 :max-records) (clojure.core/assoc-in [:body "MaxRecords"] (ser-platform-max-records (input47103 :max-records))) (clojure.core/contains? input47103 :next-token) (clojure.core/assoc-in [:body "NextToken"] (ser-token (input47103 :next-token)))))
(clojure.core/defn req<-apply-environment-managed-action-request [action-name47106 input47105] (clojure.core/let [input47107 {:body {"ActionId" (ser-string (input47105 :action-id)), "Version" "2010-12-01", "Action" action-name47106}}] (clojure.core/cond-> input47107 (clojure.core/contains? input47105 :environment-name) (clojure.core/assoc-in [:body "EnvironmentName"] (ser-string (input47105 :environment-name))) (clojure.core/contains? input47105 :environment-id) (clojure.core/assoc-in [:body "EnvironmentId"] (ser-string (input47105 :environment-id))))))
(clojure.core/defn req<-describe-applications-message [action-name47109 input47108] (clojure.core/cond-> {:body {"Version" "2010-12-01", "Action" action-name47109}} (clojure.core/contains? input47108 :application-names) (clojure.core/assoc-in [:body "ApplicationNames"] (ser-application-names-list (input47108 :application-names)))))
(clojure.core/defn req<-list-tags-for-resource-message [action-name47111 input47110] {:body {"ResourceArn" (ser-resource-arn (input47110 :resource-arn)), "Version" "2010-12-01", "Action" action-name47111}})
(clojure.core/defn req<-validate-configuration-settings-message [action-name47113 input47112] (clojure.core/let [input47114 {:body {"ApplicationName" (ser-application-name (input47112 :application-name)), "OptionSettings" (ser-configuration-option-settings-list (input47112 :option-settings)), "Version" "2010-12-01", "Action" action-name47113}}] (clojure.core/cond-> input47114 (clojure.core/contains? input47112 :template-name) (clojure.core/assoc-in [:body "TemplateName"] (ser-configuration-template-name (input47112 :template-name))) (clojure.core/contains? input47112 :environment-name) (clojure.core/assoc-in [:body "EnvironmentName"] (ser-environment-name (input47112 :environment-name))))))
(clojure.core/defn req<-restart-app-server-message [action-name47116 input47115] (clojure.core/cond-> {:body {"Version" "2010-12-01", "Action" action-name47116}} (clojure.core/contains? input47115 :environment-id) (clojure.core/assoc-in [:body "EnvironmentId"] (ser-environment-id (input47115 :environment-id))) (clojure.core/contains? input47115 :environment-name) (clojure.core/assoc-in [:body "EnvironmentName"] (ser-environment-name (input47115 :environment-name)))))
(clojure.core/defn req<-describe-environments-message [action-name47118 input47117] (clojure.core/cond-> {:body {"Version" "2010-12-01", "Action" action-name47118}} (clojure.core/contains? input47117 :application-name) (clojure.core/assoc-in [:body "ApplicationName"] (ser-application-name (input47117 :application-name))) (clojure.core/contains? input47117 :version-label) (clojure.core/assoc-in [:body "VersionLabel"] (ser-version-label (input47117 :version-label))) (clojure.core/contains? input47117 :environment-ids) (clojure.core/assoc-in [:body "EnvironmentIds"] (ser-environment-id-list (input47117 :environment-ids))) (clojure.core/contains? input47117 :environment-names) (clojure.core/assoc-in [:body "EnvironmentNames"] (ser-environment-names-list (input47117 :environment-names))) (clojure.core/contains? input47117 :include-deleted) (clojure.core/assoc-in [:body "IncludeDeleted"] (ser-include-deleted (input47117 :include-deleted))) (clojure.core/contains? input47117 :included-deleted-back-to) (clojure.core/assoc-in [:body "IncludedDeletedBackTo"] (ser-include-deleted-back-to (input47117 :included-deleted-back-to))) (clojure.core/contains? input47117 :max-records) (clojure.core/assoc-in [:body "MaxRecords"] (ser-max-records (input47117 :max-records))) (clojure.core/contains? input47117 :next-token) (clojure.core/assoc-in [:body "NextToken"] (ser-token (input47117 :next-token)))))
(clojure.core/defn req<-delete-environment-configuration-message [action-name47120 input47119] {:body {"ApplicationName" (ser-application-name (input47119 :application-name)), "EnvironmentName" (ser-environment-name (input47119 :environment-name)), "Version" "2010-12-01", "Action" action-name47120}})
(clojure.core/defn req<-terminate-environment-message [action-name47122 input47121] (clojure.core/cond-> {:body {"Version" "2010-12-01", "Action" action-name47122}} (clojure.core/contains? input47121 :environment-id) (clojure.core/assoc-in [:body "EnvironmentId"] (ser-environment-id (input47121 :environment-id))) (clojure.core/contains? input47121 :environment-name) (clojure.core/assoc-in [:body "EnvironmentName"] (ser-environment-name (input47121 :environment-name))) (clojure.core/contains? input47121 :terminate-resources) (clojure.core/assoc-in [:body "TerminateResources"] (ser-terminate-environment-resources (input47121 :terminate-resources))) (clojure.core/contains? input47121 :force-terminate) (clojure.core/assoc-in [:body "ForceTerminate"] (ser-force-terminate (input47121 :force-terminate)))))
(clojure.core/defn req<-checkdnsavailability-message [action-name47124 input47123] {:body {"CNAMEPrefix" (ser-dnscname-prefix (input47123 :cnameprefix)), "Version" "2010-12-01", "Action" action-name47124}})
(clojure.core/defn req<-retrieve-environment-info-message [action-name47126 input47125] (clojure.core/let [input47127 {:body {"InfoType" (ser-environment-info-type (input47125 :info-type)), "Version" "2010-12-01", "Action" action-name47126}}] (clojure.core/cond-> input47127 (clojure.core/contains? input47125 :environment-id) (clojure.core/assoc-in [:body "EnvironmentId"] (ser-environment-id (input47125 :environment-id))) (clojure.core/contains? input47125 :environment-name) (clojure.core/assoc-in [:body "EnvironmentName"] (ser-environment-name (input47125 :environment-name))))))
(clojure.core/defn req<-update-application-message [action-name47129 input47128] (clojure.core/let [input47130 {:body {"ApplicationName" (ser-application-name (input47128 :application-name)), "Version" "2010-12-01", "Action" action-name47129}}] (clojure.core/cond-> input47130 (clojure.core/contains? input47128 :description) (clojure.core/assoc-in [:body "Description"] (ser-description (input47128 :description))))))
(clojure.core/defn req<-create-application-message [action-name47132 input47131] (clojure.core/let [input47133 {:body {"ApplicationName" (ser-application-name (input47131 :application-name)), "Version" "2010-12-01", "Action" action-name47132}}] (clojure.core/cond-> input47133 (clojure.core/contains? input47131 :description) (clojure.core/assoc-in [:body "Description"] (ser-description (input47131 :description))) (clojure.core/contains? input47131 :resource-lifecycle-config) (clojure.core/assoc-in [:body "ResourceLifecycleConfig"] (ser-application-resource-lifecycle-config (input47131 :resource-lifecycle-config))))))
(clojure.core/defn req<-describe-configuration-settings-message [action-name47135 input47134] (clojure.core/let [input47136 {:body {"ApplicationName" (ser-application-name (input47134 :application-name)), "Version" "2010-12-01", "Action" action-name47135}}] (clojure.core/cond-> input47136 (clojure.core/contains? input47134 :template-name) (clojure.core/assoc-in [:body "TemplateName"] (ser-configuration-template-name (input47134 :template-name))) (clojure.core/contains? input47134 :environment-name) (clojure.core/assoc-in [:body "EnvironmentName"] (ser-environment-name (input47134 :environment-name))))))
(clojure.core/defn req<-delete-application-version-message [action-name47138 input47137] (clojure.core/let [input47139 {:body {"ApplicationName" (ser-application-name (input47137 :application-name)), "VersionLabel" (ser-version-label (input47137 :version-label)), "Version" "2010-12-01", "Action" action-name47138}}] (clojure.core/cond-> input47139 (clojure.core/contains? input47137 :delete-source-bundle) (clojure.core/assoc-in [:body "DeleteSourceBundle"] (ser-delete-source-bundle (input47137 :delete-source-bundle))))))
(clojure.core/defn req<-delete-configuration-template-message [action-name47141 input47140] {:body {"ApplicationName" (ser-application-name (input47140 :application-name)), "TemplateName" (ser-configuration-template-name (input47140 :template-name)), "Version" "2010-12-01", "Action" action-name47141}})
(clojure.core/defn req<-abort-environment-update-message [action-name47143 input47142] (clojure.core/cond-> {:body {"Version" "2010-12-01", "Action" action-name47143}} (clojure.core/contains? input47142 :environment-id) (clojure.core/assoc-in [:body "EnvironmentId"] (ser-environment-id (input47142 :environment-id))) (clojure.core/contains? input47142 :environment-name) (clojure.core/assoc-in [:body "EnvironmentName"] (ser-environment-name (input47142 :environment-name)))))
(clojure.core/defn req<-delete-platform-version-request [action-name47145 input47144] (clojure.core/cond-> {:body {"Version" "2010-12-01", "Action" action-name47145}} (clojure.core/contains? input47144 :platform-arn) (clojure.core/assoc-in [:body "PlatformArn"] (ser-platform-arn (input47144 :platform-arn)))))
(clojure.core/defn req<-update-configuration-template-message [action-name47147 input47146] (clojure.core/let [input47148 {:body {"ApplicationName" (ser-application-name (input47146 :application-name)), "TemplateName" (ser-configuration-template-name (input47146 :template-name)), "Version" "2010-12-01", "Action" action-name47147}}] (clojure.core/cond-> input47148 (clojure.core/contains? input47146 :description) (clojure.core/assoc-in [:body "Description"] (ser-description (input47146 :description))) (clojure.core/contains? input47146 :option-settings) (clojure.core/assoc-in [:body "OptionSettings"] (ser-configuration-option-settings-list (input47146 :option-settings))) (clojure.core/contains? input47146 :options-to-remove) (clojure.core/assoc-in [:body "OptionsToRemove"] (ser-options-specifier-list (input47146 :options-to-remove))))))
(clojure.core/defn req<-rebuild-environment-message [action-name47150 input47149] (clojure.core/cond-> {:body {"Version" "2010-12-01", "Action" action-name47150}} (clojure.core/contains? input47149 :environment-id) (clojure.core/assoc-in [:body "EnvironmentId"] (ser-environment-id (input47149 :environment-id))) (clojure.core/contains? input47149 :environment-name) (clojure.core/assoc-in [:body "EnvironmentName"] (ser-environment-name (input47149 :environment-name)))))
(clojure.core/defn req<-update-application-version-message [action-name47152 input47151] (clojure.core/let [input47153 {:body {"ApplicationName" (ser-application-name (input47151 :application-name)), "VersionLabel" (ser-version-label (input47151 :version-label)), "Version" "2010-12-01", "Action" action-name47152}}] (clojure.core/cond-> input47153 (clojure.core/contains? input47151 :description) (clojure.core/assoc-in [:body "Description"] (ser-description (input47151 :description))))))
(clojure.core/defn req<-describe-application-versions-message [action-name47155 input47154] (clojure.core/cond-> {:body {"Version" "2010-12-01", "Action" action-name47155}} (clojure.core/contains? input47154 :application-name) (clojure.core/assoc-in [:body "ApplicationName"] (ser-application-name (input47154 :application-name))) (clojure.core/contains? input47154 :version-labels) (clojure.core/assoc-in [:body "VersionLabels"] (ser-version-labels-list (input47154 :version-labels))) (clojure.core/contains? input47154 :max-records) (clojure.core/assoc-in [:body "MaxRecords"] (ser-max-records (input47154 :max-records))) (clojure.core/contains? input47154 :next-token) (clojure.core/assoc-in [:body "NextToken"] (ser-token (input47154 :next-token)))))
(clojure.core/defn req<-swap-environmentcnames-message [action-name47157 input47156] (clojure.core/cond-> {:body {"Version" "2010-12-01", "Action" action-name47157}} (clojure.core/contains? input47156 :source-environment-id) (clojure.core/assoc-in [:body "SourceEnvironmentId"] (ser-environment-id (input47156 :source-environment-id))) (clojure.core/contains? input47156 :source-environment-name) (clojure.core/assoc-in [:body "SourceEnvironmentName"] (ser-environment-name (input47156 :source-environment-name))) (clojure.core/contains? input47156 :destination-environment-id) (clojure.core/assoc-in [:body "DestinationEnvironmentId"] (ser-environment-id (input47156 :destination-environment-id))) (clojure.core/contains? input47156 :destination-environment-name) (clojure.core/assoc-in [:body "DestinationEnvironmentName"] (ser-environment-name (input47156 :destination-environment-name)))))
(clojure.core/defn req<-create-configuration-template-message [action-name47159 input47158] (clojure.core/let [input47160 {:body {"ApplicationName" (ser-application-name (input47158 :application-name)), "TemplateName" (ser-configuration-template-name (input47158 :template-name)), "Version" "2010-12-01", "Action" action-name47159}}] (clojure.core/cond-> input47160 (clojure.core/contains? input47158 :solution-stack-name) (clojure.core/assoc-in [:body "SolutionStackName"] (ser-solution-stack-name (input47158 :solution-stack-name))) (clojure.core/contains? input47158 :platform-arn) (clojure.core/assoc-in [:body "PlatformArn"] (ser-platform-arn (input47158 :platform-arn))) (clojure.core/contains? input47158 :source-configuration) (clojure.core/assoc-in [:body "SourceConfiguration"] (ser-source-configuration (input47158 :source-configuration))) (clojure.core/contains? input47158 :environment-id) (clojure.core/assoc-in [:body "EnvironmentId"] (ser-environment-id (input47158 :environment-id))) (clojure.core/contains? input47158 :description) (clojure.core/assoc-in [:body "Description"] (ser-description (input47158 :description))) (clojure.core/contains? input47158 :option-settings) (clojure.core/assoc-in [:body "OptionSettings"] (ser-configuration-option-settings-list (input47158 :option-settings))))))
(clojure.core/defn req<-describe-environment-managed-action-history-request [action-name47162 input47161] (clojure.core/cond-> {:body {"Version" "2010-12-01", "Action" action-name47162}} (clojure.core/contains? input47161 :environment-id) (clojure.core/assoc-in [:body "EnvironmentId"] (ser-environment-id (input47161 :environment-id))) (clojure.core/contains? input47161 :environment-name) (clojure.core/assoc-in [:body "EnvironmentName"] (ser-environment-name (input47161 :environment-name))) (clojure.core/contains? input47161 :next-token) (clojure.core/assoc-in [:body "NextToken"] (ser-string (input47161 :next-token))) (clojure.core/contains? input47161 :max-items) (clojure.core/assoc-in [:body "MaxItems"] (ser-integer (input47161 :max-items)))))

(clojure.spec.alpha/def :portkey.aws.elasticbeanstalk.-2010-12-01.solution-stack-description/permitted-file-types (clojure.spec.alpha/and :portkey.aws.elasticbeanstalk.-2010-12-01/solution-stack-file-type-list))
(clojure.spec.alpha/def :portkey.aws.elasticbeanstalk.-2010-12-01/solution-stack-description (portkey.aws/json-keys :req-un [] :opt-un [:portkey.aws.elasticbeanstalk.-2010-12-01/SolutionStackName :portkey.aws.elasticbeanstalk.-2010-12-01.solution-stack-description/PermittedFileTypes] :locations {}))

(clojure.spec.alpha/def :portkey.aws.elasticbeanstalk.-2010-12-01/version-label (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__36226__auto__] (clojure.core/<= 1 (clojure.core/count s__36226__auto__))) (clojure.core/fn [s__36227__auto__] (clojure.core/< (clojure.core/count s__36227__auto__) 100))))

(clojure.spec.alpha/def :portkey.aws.elasticbeanstalk.-2010-12-01/event-message (clojure.spec.alpha/and clojure.core/string?))

(clojure.spec.alpha/def :portkey.aws.elasticbeanstalk.-2010-12-01.platform-filter/type (clojure.spec.alpha/and :portkey.aws.elasticbeanstalk.-2010-12-01/platform-filter-type))
(clojure.spec.alpha/def :portkey.aws.elasticbeanstalk.-2010-12-01.platform-filter/operator (clojure.spec.alpha/and :portkey.aws.elasticbeanstalk.-2010-12-01/platform-filter-operator))
(clojure.spec.alpha/def :portkey.aws.elasticbeanstalk.-2010-12-01.platform-filter/values (clojure.spec.alpha/and :portkey.aws.elasticbeanstalk.-2010-12-01/platform-filter-value-list))
(clojure.spec.alpha/def :portkey.aws.elasticbeanstalk.-2010-12-01/platform-filter (portkey.aws/json-keys :req-un [] :opt-un [:portkey.aws.elasticbeanstalk.-2010-12-01.platform-filter/Type :portkey.aws.elasticbeanstalk.-2010-12-01.platform-filter/Operator :portkey.aws.elasticbeanstalk.-2010-12-01.platform-filter/Values] :locations {}))

(clojure.spec.alpha/def :portkey.aws.elasticbeanstalk.-2010-12-01/application-version-arn (clojure.spec.alpha/and clojure.core/string?))

(clojure.spec.alpha/def :portkey.aws.elasticbeanstalk.-2010-12-01/source-repository {"CodeCommit" "CodeCommit", :code-commit "CodeCommit", "S3" "S3", :s3 "S3"})

(clojure.spec.alpha/def :portkey.aws.elasticbeanstalk.-2010-12-01/event-severity {:warn "WARN", :trace "TRACE", "WARN" "WARN", :debug "DEBUG", "ERROR" "ERROR", :fatal "FATAL", "TRACE" "TRACE", "DEBUG" "DEBUG", "FATAL" "FATAL", :info "INFO", :error "ERROR", "INFO" "INFO"})

(clojure.spec.alpha/def :portkey.aws.elasticbeanstalk.-2010-12-01.platform-framework/name (clojure.spec.alpha/and :portkey.aws.elasticbeanstalk.-2010-12-01/string))
(clojure.spec.alpha/def :portkey.aws.elasticbeanstalk.-2010-12-01.platform-framework/version (clojure.spec.alpha/and :portkey.aws.elasticbeanstalk.-2010-12-01/string))
(clojure.spec.alpha/def :portkey.aws.elasticbeanstalk.-2010-12-01/platform-framework (portkey.aws/json-keys :req-un [] :opt-un [:portkey.aws.elasticbeanstalk.-2010-12-01.platform-framework/Name :portkey.aws.elasticbeanstalk.-2010-12-01.platform-framework/Version] :locations {}))

(clojure.spec.alpha/def :portkey.aws.elasticbeanstalk.-2010-12-01.application-version-descriptions-message/application-versions (clojure.spec.alpha/and :portkey.aws.elasticbeanstalk.-2010-12-01/application-version-description-list))
(clojure.spec.alpha/def :portkey.aws.elasticbeanstalk.-2010-12-01.application-version-descriptions-message/next-token (clojure.spec.alpha/and :portkey.aws.elasticbeanstalk.-2010-12-01/token))
(clojure.spec.alpha/def :portkey.aws.elasticbeanstalk.-2010-12-01/application-version-descriptions-message (portkey.aws/json-keys :req-un [] :opt-un [:portkey.aws.elasticbeanstalk.-2010-12-01.application-version-descriptions-message/ApplicationVersions :portkey.aws.elasticbeanstalk.-2010-12-01.application-version-descriptions-message/NextToken] :locations {}))

(clojure.spec.alpha/def :portkey.aws.elasticbeanstalk.-2010-12-01.list-available-solution-stacks-result-message/solution-stacks (clojure.spec.alpha/and :portkey.aws.elasticbeanstalk.-2010-12-01/available-solution-stack-names-list))
(clojure.spec.alpha/def :portkey.aws.elasticbeanstalk.-2010-12-01.list-available-solution-stacks-result-message/solution-stack-details (clojure.spec.alpha/and :portkey.aws.elasticbeanstalk.-2010-12-01/available-solution-stack-details-list))
(clojure.spec.alpha/def :portkey.aws.elasticbeanstalk.-2010-12-01/list-available-solution-stacks-result-message (portkey.aws/json-keys :req-un [] :opt-un [:portkey.aws.elasticbeanstalk.-2010-12-01.list-available-solution-stacks-result-message/SolutionStacks :portkey.aws.elasticbeanstalk.-2010-12-01.list-available-solution-stacks-result-message/SolutionStackDetails] :locations {}))

(clojure.spec.alpha/def :portkey.aws.elasticbeanstalk.-2010-12-01/instance-id (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__36226__auto__] (clojure.core/<= 1 (clojure.core/count s__36226__auto__))) (clojure.core/fn [s__36227__auto__] (clojure.core/< (clojure.core/count s__36227__auto__) 255))))

(clojure.spec.alpha/def :portkey.aws.elasticbeanstalk.-2010-12-01/platform-filter-value-list (clojure.spec.alpha/coll-of :portkey.aws.elasticbeanstalk.-2010-12-01/platform-filter-value))

(clojure.spec.alpha/def :portkey.aws.elasticbeanstalk.-2010-12-01/configuration-template-names-list (clojure.spec.alpha/coll-of :portkey.aws.elasticbeanstalk.-2010-12-01/configuration-template-name))

(clojure.spec.alpha/def :portkey.aws.elasticbeanstalk.-2010-12-01.configuration-options-description/options (clojure.spec.alpha/and :portkey.aws.elasticbeanstalk.-2010-12-01/configuration-option-descriptions-list))
(clojure.spec.alpha/def :portkey.aws.elasticbeanstalk.-2010-12-01/configuration-options-description (portkey.aws/json-keys :req-un [] :opt-un [:portkey.aws.elasticbeanstalk.-2010-12-01/SolutionStackName :portkey.aws.elasticbeanstalk.-2010-12-01/PlatformArn :portkey.aws.elasticbeanstalk.-2010-12-01.configuration-options-description/Options] :locations {}))

(clojure.spec.alpha/def :portkey.aws.elasticbeanstalk.-2010-12-01/describe-environment-resources-message (portkey.aws/json-keys :req-un [] :opt-un [:portkey.aws.elasticbeanstalk.-2010-12-01/EnvironmentId :portkey.aws.elasticbeanstalk.-2010-12-01/EnvironmentName] :locations {}))

(clojure.spec.alpha/def :portkey.aws.elasticbeanstalk.-2010-12-01/cause (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__36226__auto__] (clojure.core/<= 1 (clojure.core/count s__36226__auto__))) (clojure.core/fn [s__36227__auto__] (clojure.core/< (clojure.core/count s__36227__auto__) 255))))

(clojure.spec.alpha/def :portkey.aws.elasticbeanstalk.-2010-12-01/cname-availability clojure.core/boolean?)

(clojure.spec.alpha/def :portkey.aws.elasticbeanstalk.-2010-12-01/boxed-int clojure.core/int?)

(clojure.spec.alpha/def :portkey.aws.elasticbeanstalk.-2010-12-01.update-application-resource-lifecycle-message/resource-lifecycle-config (clojure.spec.alpha/and :portkey.aws.elasticbeanstalk.-2010-12-01/application-resource-lifecycle-config))
(clojure.spec.alpha/def :portkey.aws.elasticbeanstalk.-2010-12-01/update-application-resource-lifecycle-message (portkey.aws/json-keys :req-un [:portkey.aws.elasticbeanstalk.-2010-12-01/ApplicationName :portkey.aws.elasticbeanstalk.-2010-12-01.update-application-resource-lifecycle-message/ResourceLifecycleConfig] :opt-un [] :locations {}))

(clojure.spec.alpha/def :portkey.aws.elasticbeanstalk.-2010-12-01/file-type-extension (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__36226__auto__] (clojure.core/<= 1 (clojure.core/count s__36226__auto__))) (clojure.core/fn [s__36227__auto__] (clojure.core/< (clojure.core/count s__36227__auto__) 100))))

(clojure.spec.alpha/def :portkey.aws.elasticbeanstalk.-2010-12-01/non-empty-string (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__36228__auto__] (clojure.core/re-matches #".*\S.*" s__36228__auto__))))

(clojure.spec.alpha/def :portkey.aws.elasticbeanstalk.-2010-12-01/include-deleted-back-to clojure.core/inst?)

(clojure.spec.alpha/def :portkey.aws.elasticbeanstalk.-2010-12-01.deployment/version-label (clojure.spec.alpha/and :portkey.aws.elasticbeanstalk.-2010-12-01/string))
(clojure.spec.alpha/def :portkey.aws.elasticbeanstalk.-2010-12-01.deployment/deployment-id (clojure.spec.alpha/and :portkey.aws.elasticbeanstalk.-2010-12-01/nullable-long))
(clojure.spec.alpha/def :portkey.aws.elasticbeanstalk.-2010-12-01.deployment/status (clojure.spec.alpha/and :portkey.aws.elasticbeanstalk.-2010-12-01/string))
(clojure.spec.alpha/def :portkey.aws.elasticbeanstalk.-2010-12-01.deployment/deployment-time (clojure.spec.alpha/and :portkey.aws.elasticbeanstalk.-2010-12-01/deployment-timestamp))
(clojure.spec.alpha/def :portkey.aws.elasticbeanstalk.-2010-12-01/deployment (portkey.aws/json-keys :req-un [] :opt-un [:portkey.aws.elasticbeanstalk.-2010-12-01.deployment/VersionLabel :portkey.aws.elasticbeanstalk.-2010-12-01.deployment/DeploymentId :portkey.aws.elasticbeanstalk.-2010-12-01.deployment/Status :portkey.aws.elasticbeanstalk.-2010-12-01.deployment/DeploymentTime] :locations {}))

(clojure.spec.alpha/def :portkey.aws.elasticbeanstalk.-2010-12-01/request-id (clojure.spec.alpha/and clojure.core/string?))

(clojure.spec.alpha/def :portkey.aws.elasticbeanstalk.-2010-12-01/terminate-env-force clojure.core/boolean?)

(clojure.spec.alpha/def :portkey.aws.elasticbeanstalk.-2010-12-01.describe-environments-message/environment-ids (clojure.spec.alpha/and :portkey.aws.elasticbeanstalk.-2010-12-01/environment-id-list))
(clojure.spec.alpha/def :portkey.aws.elasticbeanstalk.-2010-12-01.describe-environments-message/environment-names (clojure.spec.alpha/and :portkey.aws.elasticbeanstalk.-2010-12-01/environment-names-list))
(clojure.spec.alpha/def :portkey.aws.elasticbeanstalk.-2010-12-01.describe-environments-message/included-deleted-back-to (clojure.spec.alpha/and :portkey.aws.elasticbeanstalk.-2010-12-01/include-deleted-back-to))
(clojure.spec.alpha/def :portkey.aws.elasticbeanstalk.-2010-12-01.describe-environments-message/next-token (clojure.spec.alpha/and :portkey.aws.elasticbeanstalk.-2010-12-01/token))
(clojure.spec.alpha/def :portkey.aws.elasticbeanstalk.-2010-12-01/describe-environments-message (portkey.aws/json-keys :req-un [] :opt-un [:portkey.aws.elasticbeanstalk.-2010-12-01/ApplicationName :portkey.aws.elasticbeanstalk.-2010-12-01/VersionLabel :portkey.aws.elasticbeanstalk.-2010-12-01.describe-environments-message/EnvironmentIds :portkey.aws.elasticbeanstalk.-2010-12-01.describe-environments-message/EnvironmentNames :portkey.aws.elasticbeanstalk.-2010-12-01/IncludeDeleted :portkey.aws.elasticbeanstalk.-2010-12-01.describe-environments-message/IncludedDeletedBackTo :portkey.aws.elasticbeanstalk.-2010-12-01/MaxRecords :portkey.aws.elasticbeanstalk.-2010-12-01.describe-environments-message/NextToken] :locations {}))

(clojure.spec.alpha/def :portkey.aws.elasticbeanstalk.-2010-12-01/option-namespace (clojure.spec.alpha/and clojure.core/string?))

(clojure.spec.alpha/def :portkey.aws.elasticbeanstalk.-2010-12-01/launched-at clojure.core/inst?)

(clojure.spec.alpha/def :portkey.aws.elasticbeanstalk.-2010-12-01.update-environment-message/tier (clojure.spec.alpha/and :portkey.aws.elasticbeanstalk.-2010-12-01/environment-tier))
(clojure.spec.alpha/def :portkey.aws.elasticbeanstalk.-2010-12-01.update-environment-message/option-settings (clojure.spec.alpha/and :portkey.aws.elasticbeanstalk.-2010-12-01/configuration-option-settings-list))
(clojure.spec.alpha/def :portkey.aws.elasticbeanstalk.-2010-12-01.update-environment-message/template-name (clojure.spec.alpha/and :portkey.aws.elasticbeanstalk.-2010-12-01/configuration-template-name))
(clojure.spec.alpha/def :portkey.aws.elasticbeanstalk.-2010-12-01.update-environment-message/options-to-remove (clojure.spec.alpha/and :portkey.aws.elasticbeanstalk.-2010-12-01/options-specifier-list))
(clojure.spec.alpha/def :portkey.aws.elasticbeanstalk.-2010-12-01/update-environment-message (portkey.aws/json-keys :req-un [] :opt-un [:portkey.aws.elasticbeanstalk.-2010-12-01/VersionLabel :portkey.aws.elasticbeanstalk.-2010-12-01.update-environment-message/Tier :portkey.aws.elasticbeanstalk.-2010-12-01/SolutionStackName :portkey.aws.elasticbeanstalk.-2010-12-01/EnvironmentName :portkey.aws.elasticbeanstalk.-2010-12-01.update-environment-message/OptionSettings :portkey.aws.elasticbeanstalk.-2010-12-01/GroupName :portkey.aws.elasticbeanstalk.-2010-12-01/Description :portkey.aws.elasticbeanstalk.-2010-12-01/ApplicationName :portkey.aws.elasticbeanstalk.-2010-12-01.update-environment-message/TemplateName :portkey.aws.elasticbeanstalk.-2010-12-01/PlatformArn :portkey.aws.elasticbeanstalk.-2010-12-01.update-environment-message/OptionsToRemove :portkey.aws.elasticbeanstalk.-2010-12-01/EnvironmentId] :locations {}))

(clojure.spec.alpha/def :portkey.aws.elasticbeanstalk.-2010-12-01.describe-environment-health-request/attribute-names (clojure.spec.alpha/and :portkey.aws.elasticbeanstalk.-2010-12-01/environment-health-attributes))
(clojure.spec.alpha/def :portkey.aws.elasticbeanstalk.-2010-12-01/describe-environment-health-request (portkey.aws/json-keys :req-un [] :opt-un [:portkey.aws.elasticbeanstalk.-2010-12-01/EnvironmentName :portkey.aws.elasticbeanstalk.-2010-12-01/EnvironmentId :portkey.aws.elasticbeanstalk.-2010-12-01.describe-environment-health-request/AttributeNames] :locations {}))

(clojure.spec.alpha/def :portkey.aws.elasticbeanstalk.-2010-12-01/create-platform-version-result (portkey.aws/json-keys :req-un [] :opt-un [:portkey.aws.elasticbeanstalk.-2010-12-01/PlatformSummary :portkey.aws.elasticbeanstalk.-2010-12-01/Builder] :locations {}))

(clojure.spec.alpha/def :portkey.aws.elasticbeanstalk.-2010-12-01/invalid-request-exception (portkey.aws/json-keys :req-un [] :opt-un [] :locations {}))

(clojure.spec.alpha/def :portkey.aws.elasticbeanstalk.-2010-12-01/delete-source-bundle clojure.core/boolean?)

(clojure.spec.alpha/def :portkey.aws.elasticbeanstalk.-2010-12-01/sample-timestamp clojure.core/inst?)

(clojure.spec.alpha/def :portkey.aws.elasticbeanstalk.-2010-12-01/boxed-boolean clojure.core/boolean?)

(clojure.spec.alpha/def :portkey.aws.elasticbeanstalk.-2010-12-01.build-configuration/artifact-name (clojure.spec.alpha/and :portkey.aws.elasticbeanstalk.-2010-12-01/string))
(clojure.spec.alpha/def :portkey.aws.elasticbeanstalk.-2010-12-01.build-configuration/code-build-service-role (clojure.spec.alpha/and :portkey.aws.elasticbeanstalk.-2010-12-01/non-empty-string))
(clojure.spec.alpha/def :portkey.aws.elasticbeanstalk.-2010-12-01.build-configuration/image (clojure.spec.alpha/and :portkey.aws.elasticbeanstalk.-2010-12-01/non-empty-string))
(clojure.spec.alpha/def :portkey.aws.elasticbeanstalk.-2010-12-01.build-configuration/timeout-in-minutes (clojure.spec.alpha/and :portkey.aws.elasticbeanstalk.-2010-12-01/boxed-int))
(clojure.spec.alpha/def :portkey.aws.elasticbeanstalk.-2010-12-01/build-configuration (portkey.aws/json-keys :req-un [:portkey.aws.elasticbeanstalk.-2010-12-01.build-configuration/CodeBuildServiceRole :portkey.aws.elasticbeanstalk.-2010-12-01.build-configuration/Image] :opt-un [:portkey.aws.elasticbeanstalk.-2010-12-01.build-configuration/ArtifactName :portkey.aws.elasticbeanstalk.-2010-12-01/ComputeType :portkey.aws.elasticbeanstalk.-2010-12-01.build-configuration/TimeoutInMinutes] :locations {}))

(clojure.spec.alpha/def :portkey.aws.elasticbeanstalk.-2010-12-01/solution-stack-name (clojure.spec.alpha/and clojure.core/string?))

(clojure.spec.alpha/def :portkey.aws.elasticbeanstalk.-2010-12-01/platform-name (clojure.spec.alpha/and clojure.core/string?))

(clojure.spec.alpha/def :portkey.aws.elasticbeanstalk.-2010-12-01/validation-severity {"error" "error", :error "error", "warning" "warning", :warning "warning"})

(clojure.spec.alpha/def :portkey.aws.elasticbeanstalk.-2010-12-01.load-balancer-description/load-balancer-name (clojure.spec.alpha/and :portkey.aws.elasticbeanstalk.-2010-12-01/string))
(clojure.spec.alpha/def :portkey.aws.elasticbeanstalk.-2010-12-01.load-balancer-description/domain (clojure.spec.alpha/and :portkey.aws.elasticbeanstalk.-2010-12-01/string))
(clojure.spec.alpha/def :portkey.aws.elasticbeanstalk.-2010-12-01.load-balancer-description/listeners (clojure.spec.alpha/and :portkey.aws.elasticbeanstalk.-2010-12-01/load-balancer-listeners-description))
(clojure.spec.alpha/def :portkey.aws.elasticbeanstalk.-2010-12-01/load-balancer-description (portkey.aws/json-keys :req-un [] :opt-un [:portkey.aws.elasticbeanstalk.-2010-12-01.load-balancer-description/LoadBalancerName :portkey.aws.elasticbeanstalk.-2010-12-01.load-balancer-description/Domain :portkey.aws.elasticbeanstalk.-2010-12-01.load-balancer-description/Listeners] :locations {}))

(clojure.spec.alpha/def :portkey.aws.elasticbeanstalk.-2010-12-01/image-id (clojure.spec.alpha/and clojure.core/string?))

(clojure.spec.alpha/def :portkey.aws.elasticbeanstalk.-2010-12-01/insufficient-privileges-exception (portkey.aws/json-keys :req-un [] :opt-un [] :locations {}))

(clojure.spec.alpha/def :portkey.aws.elasticbeanstalk.-2010-12-01.describe-environment-managed-action-history-result/next-token (clojure.spec.alpha/and :portkey.aws.elasticbeanstalk.-2010-12-01/string))
(clojure.spec.alpha/def :portkey.aws.elasticbeanstalk.-2010-12-01/describe-environment-managed-action-history-result (portkey.aws/json-keys :req-un [] :opt-un [:portkey.aws.elasticbeanstalk.-2010-12-01/ManagedActionHistoryItems :portkey.aws.elasticbeanstalk.-2010-12-01.describe-environment-managed-action-history-result/NextToken] :locations {}))

(clojure.spec.alpha/def :portkey.aws.elasticbeanstalk.-2010-12-01/validation-messages-list (clojure.spec.alpha/coll-of :portkey.aws.elasticbeanstalk.-2010-12-01/validation-message))

(clojure.spec.alpha/def :portkey.aws.elasticbeanstalk.-2010-12-01.describe-environment-managed-action-history-request/next-token (clojure.spec.alpha/and :portkey.aws.elasticbeanstalk.-2010-12-01/string))
(clojure.spec.alpha/def :portkey.aws.elasticbeanstalk.-2010-12-01.describe-environment-managed-action-history-request/max-items (clojure.spec.alpha/and :portkey.aws.elasticbeanstalk.-2010-12-01/integer))
(clojure.spec.alpha/def :portkey.aws.elasticbeanstalk.-2010-12-01/describe-environment-managed-action-history-request (portkey.aws/json-keys :req-un [] :opt-un [:portkey.aws.elasticbeanstalk.-2010-12-01/EnvironmentId :portkey.aws.elasticbeanstalk.-2010-12-01/EnvironmentName :portkey.aws.elasticbeanstalk.-2010-12-01.describe-environment-managed-action-history-request/NextToken :portkey.aws.elasticbeanstalk.-2010-12-01.describe-environment-managed-action-history-request/MaxItems] :locations {}))

(clojure.spec.alpha/def :portkey.aws.elasticbeanstalk.-2010-12-01/application-arn (clojure.spec.alpha/and clojure.core/string?))

(clojure.spec.alpha/def :portkey.aws.elasticbeanstalk.-2010-12-01/environment-status {"Launching" "Launching", :ready "Ready", "Ready" "Ready", :terminating "Terminating", "Terminating" "Terminating", :terminated "Terminated", :updating "Updating", "Terminated" "Terminated", "Updating" "Updating", :launching "Launching"})

(clojure.spec.alpha/def :portkey.aws.elasticbeanstalk.-2010-12-01/application-names-list (clojure.spec.alpha/coll-of :portkey.aws.elasticbeanstalk.-2010-12-01/application-name))

(clojure.spec.alpha/def :portkey.aws.elasticbeanstalk.-2010-12-01/supported-addon-list (clojure.spec.alpha/coll-of :portkey.aws.elasticbeanstalk.-2010-12-01/supported-addon))

(clojure.spec.alpha/def :portkey.aws.elasticbeanstalk.-2010-12-01.environment-tier/name (clojure.spec.alpha/and :portkey.aws.elasticbeanstalk.-2010-12-01/string))
(clojure.spec.alpha/def :portkey.aws.elasticbeanstalk.-2010-12-01.environment-tier/type (clojure.spec.alpha/and :portkey.aws.elasticbeanstalk.-2010-12-01/string))
(clojure.spec.alpha/def :portkey.aws.elasticbeanstalk.-2010-12-01.environment-tier/version (clojure.spec.alpha/and :portkey.aws.elasticbeanstalk.-2010-12-01/string))
(clojure.spec.alpha/def :portkey.aws.elasticbeanstalk.-2010-12-01/environment-tier (portkey.aws/json-keys :req-un [] :opt-un [:portkey.aws.elasticbeanstalk.-2010-12-01.environment-tier/Name :portkey.aws.elasticbeanstalk.-2010-12-01.environment-tier/Type :portkey.aws.elasticbeanstalk.-2010-12-01.environment-tier/Version] :locations {}))

(clojure.spec.alpha/def :portkey.aws.elasticbeanstalk.-2010-12-01.checkdnsavailability-message/cnameprefix (clojure.spec.alpha/and :portkey.aws.elasticbeanstalk.-2010-12-01/dnscname-prefix))
(clojure.spec.alpha/def :portkey.aws.elasticbeanstalk.-2010-12-01/checkdnsavailability-message (portkey.aws/json-keys :req-un [:portkey.aws.elasticbeanstalk.-2010-12-01.checkdnsavailability-message/CNAMEPrefix] :opt-un [] :locations {}))

(clojure.spec.alpha/def :portkey.aws.elasticbeanstalk.-2010-12-01.elastic-beanstalk-service-exception/message (clojure.spec.alpha/and :portkey.aws.elasticbeanstalk.-2010-12-01/exception-message))
(clojure.spec.alpha/def :portkey.aws.elasticbeanstalk.-2010-12-01/elastic-beanstalk-service-exception (portkey.aws/json-keys :req-un [] :opt-un [:portkey.aws.elasticbeanstalk.-2010-12-01.elastic-beanstalk-service-exception/message] :locations {}))

(clojure.spec.alpha/def :portkey.aws.elasticbeanstalk.-2010-12-01/regex-pattern (clojure.spec.alpha/and clojure.core/string?))

(clojure.spec.alpha/def :portkey.aws.elasticbeanstalk.-2010-12-01/operating-system-name (clojure.spec.alpha/and clojure.core/string?))

(clojure.spec.alpha/def :portkey.aws.elasticbeanstalk.-2010-12-01.environment-link/link-name (clojure.spec.alpha/and :portkey.aws.elasticbeanstalk.-2010-12-01/string))
(clojure.spec.alpha/def :portkey.aws.elasticbeanstalk.-2010-12-01.environment-link/environment-name (clojure.spec.alpha/and :portkey.aws.elasticbeanstalk.-2010-12-01/string))
(clojure.spec.alpha/def :portkey.aws.elasticbeanstalk.-2010-12-01/environment-link (portkey.aws/json-keys :req-un [] :opt-un [:portkey.aws.elasticbeanstalk.-2010-12-01.environment-link/LinkName :portkey.aws.elasticbeanstalk.-2010-12-01.environment-link/EnvironmentName] :locations {}))

(clojure.spec.alpha/def :portkey.aws.elasticbeanstalk.-2010-12-01/configuration-option-severity (clojure.spec.alpha/and clojure.core/string?))

(clojure.spec.alpha/def :portkey.aws.elasticbeanstalk.-2010-12-01/environment-name (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__36226__auto__] (clojure.core/<= 4 (clojure.core/count s__36226__auto__))) (clojure.core/fn [s__36227__auto__] (clojure.core/< (clojure.core/count s__36227__auto__) 40))))

(clojure.spec.alpha/def :portkey.aws.elasticbeanstalk.-2010-12-01/managed-actions (clojure.spec.alpha/coll-of :portkey.aws.elasticbeanstalk.-2010-12-01/managed-action :min-count 1 :max-count 100))

(clojure.spec.alpha/def :portkey.aws.elasticbeanstalk.-2010-12-01/terminate-environment-resources clojure.core/boolean?)

(clojure.spec.alpha/def :portkey.aws.elasticbeanstalk.-2010-12-01/environment-health-status {:unknown "Unknown", :pending "Pending", "Info" "Info", "Severe" "Severe", "Unknown" "Unknown", "Warning" "Warning", :warning "Warning", :severe "Severe", "NoData" "NoData", :degraded "Degraded", :ok "Ok", :info "Info", "Pending" "Pending", :no-data "NoData", "Degraded" "Degraded", "Ok" "Ok"})

(clojure.spec.alpha/def :portkey.aws.elasticbeanstalk.-2010-12-01/too-many-application-versions-exception (portkey.aws/json-keys :req-un [] :opt-un [] :locations {}))

(clojure.spec.alpha/def :portkey.aws.elasticbeanstalk.-2010-12-01/describe-platform-version-request (portkey.aws/json-keys :req-un [] :opt-un [:portkey.aws.elasticbeanstalk.-2010-12-01/PlatformArn] :locations {}))

(clojure.spec.alpha/def :portkey.aws.elasticbeanstalk.-2010-12-01/environment-id-list (clojure.spec.alpha/coll-of :portkey.aws.elasticbeanstalk.-2010-12-01/environment-id))

(clojure.spec.alpha/def :portkey.aws.elasticbeanstalk.-2010-12-01/source-bundle-deletion-exception (portkey.aws/json-keys :req-un [] :opt-un [] :locations {}))

(clojure.spec.alpha/def :portkey.aws.elasticbeanstalk.-2010-12-01/too-many-applications-exception (portkey.aws/json-keys :req-un [] :opt-un [] :locations {}))

(clojure.spec.alpha/def :portkey.aws.elasticbeanstalk.-2010-12-01.queue/name (clojure.spec.alpha/and :portkey.aws.elasticbeanstalk.-2010-12-01/string))
(clojure.spec.alpha/def :portkey.aws.elasticbeanstalk.-2010-12-01.queue/url (clojure.spec.alpha/and :portkey.aws.elasticbeanstalk.-2010-12-01/string))
(clojure.spec.alpha/def :portkey.aws.elasticbeanstalk.-2010-12-01/queue (portkey.aws/json-keys :req-un [] :opt-un [:portkey.aws.elasticbeanstalk.-2010-12-01.queue/Name :portkey.aws.elasticbeanstalk.-2010-12-01.queue/URL] :locations {}))

(clojure.spec.alpha/def :portkey.aws.elasticbeanstalk.-2010-12-01/platform-filter-type (clojure.spec.alpha/and clojure.core/string?))

(clojure.spec.alpha/def :portkey.aws.elasticbeanstalk.-2010-12-01.checkdnsavailability-result-message/available (clojure.spec.alpha/and :portkey.aws.elasticbeanstalk.-2010-12-01/cname-availability))
(clojure.spec.alpha/def :portkey.aws.elasticbeanstalk.-2010-12-01.checkdnsavailability-result-message/fully-qualifiedcname (clojure.spec.alpha/and :portkey.aws.elasticbeanstalk.-2010-12-01/dnscname))
(clojure.spec.alpha/def :portkey.aws.elasticbeanstalk.-2010-12-01/checkdnsavailability-result-message (portkey.aws/json-keys :req-un [] :opt-un [:portkey.aws.elasticbeanstalk.-2010-12-01.checkdnsavailability-result-message/Available :portkey.aws.elasticbeanstalk.-2010-12-01.checkdnsavailability-result-message/FullyQualifiedCNAME] :locations {}))

(clojure.spec.alpha/def :portkey.aws.elasticbeanstalk.-2010-12-01.application-description-message/application (clojure.spec.alpha/and :portkey.aws.elasticbeanstalk.-2010-12-01/application-description))
(clojure.spec.alpha/def :portkey.aws.elasticbeanstalk.-2010-12-01/application-description-message (portkey.aws/json-keys :req-un [] :opt-un [:portkey.aws.elasticbeanstalk.-2010-12-01.application-description-message/Application] :locations {}))

(clojure.spec.alpha/def :portkey.aws.elasticbeanstalk.-2010-12-01/option-restriction-max-value clojure.core/int?)

(clojure.spec.alpha/def :portkey.aws.elasticbeanstalk.-2010-12-01/trigger-list (clojure.spec.alpha/coll-of :portkey.aws.elasticbeanstalk.-2010-12-01/trigger))

(clojure.spec.alpha/def :portkey.aws.elasticbeanstalk.-2010-12-01/time-filter-end clojure.core/inst?)

(clojure.spec.alpha/def :portkey.aws.elasticbeanstalk.-2010-12-01/environment-health-attributes (clojure.spec.alpha/coll-of :portkey.aws.elasticbeanstalk.-2010-12-01/environment-health-attribute))

(clojure.spec.alpha/def :portkey.aws.elasticbeanstalk.-2010-12-01.resource-quota/maximum (clojure.spec.alpha/and :portkey.aws.elasticbeanstalk.-2010-12-01/boxed-int))
(clojure.spec.alpha/def :portkey.aws.elasticbeanstalk.-2010-12-01/resource-quota (portkey.aws/json-keys :req-un [] :opt-un [:portkey.aws.elasticbeanstalk.-2010-12-01.resource-quota/Maximum] :locations {}))

(clojure.spec.alpha/def :portkey.aws.elasticbeanstalk.-2010-12-01/dnscname (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__36226__auto__] (clojure.core/<= 1 (clojure.core/count s__36226__auto__))) (clojure.core/fn [s__36227__auto__] (clojure.core/< (clojure.core/count s__36227__auto__) 255))))

(clojure.spec.alpha/def :portkey.aws.elasticbeanstalk.-2010-12-01/max-records (clojure.spec.alpha/int-in 1 1000))

(clojure.spec.alpha/def :portkey.aws.elasticbeanstalk.-2010-12-01/tag-key (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__36226__auto__] (clojure.core/<= 1 (clojure.core/count s__36226__auto__))) (clojure.core/fn [s__36227__auto__] (clojure.core/< (clojure.core/count s__36227__auto__) 128))))

(clojure.spec.alpha/def :portkey.aws.elasticbeanstalk.-2010-12-01/environment-descriptions-list (clojure.spec.alpha/coll-of :portkey.aws.elasticbeanstalk.-2010-12-01/environment-description))

(clojure.spec.alpha/def :portkey.aws.elasticbeanstalk.-2010-12-01/application-version-lifecycle-config (portkey.aws/json-keys :req-un [] :opt-un [:portkey.aws.elasticbeanstalk.-2010-12-01/MaxCountRule :portkey.aws.elasticbeanstalk.-2010-12-01/MaxAgeRule] :locations {}))

(clojure.spec.alpha/def :portkey.aws.elasticbeanstalk.-2010-12-01.create-application-message/resource-lifecycle-config (clojure.spec.alpha/and :portkey.aws.elasticbeanstalk.-2010-12-01/application-resource-lifecycle-config))
(clojure.spec.alpha/def :portkey.aws.elasticbeanstalk.-2010-12-01/create-application-message (portkey.aws/json-keys :req-un [:portkey.aws.elasticbeanstalk.-2010-12-01/ApplicationName] :opt-un [:portkey.aws.elasticbeanstalk.-2010-12-01/Description :portkey.aws.elasticbeanstalk.-2010-12-01.create-application-message/ResourceLifecycleConfig] :locations {}))

(clojure.spec.alpha/def :portkey.aws.elasticbeanstalk.-2010-12-01/tags (clojure.spec.alpha/coll-of :portkey.aws.elasticbeanstalk.-2010-12-01/tag))

(clojure.spec.alpha/def :portkey.aws.elasticbeanstalk.-2010-12-01/instance-health-list (clojure.spec.alpha/coll-of :portkey.aws.elasticbeanstalk.-2010-12-01/single-instance-health))

(clojure.spec.alpha/def :portkey.aws.elasticbeanstalk.-2010-12-01/dnscname-prefix (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__36226__auto__] (clojure.core/<= 4 (clojure.core/count s__36226__auto__))) (clojure.core/fn [s__36227__auto__] (clojure.core/< (clojure.core/count s__36227__auto__) 63))))

(clojure.spec.alpha/def :portkey.aws.elasticbeanstalk.-2010-12-01/arn (clojure.spec.alpha/and clojure.core/string?))

(clojure.spec.alpha/def :portkey.aws.elasticbeanstalk.-2010-12-01.instance-health-summary/no-data (clojure.spec.alpha/and :portkey.aws.elasticbeanstalk.-2010-12-01/nullable-integer))
(clojure.spec.alpha/def :portkey.aws.elasticbeanstalk.-2010-12-01.instance-health-summary/unknown (clojure.spec.alpha/and :portkey.aws.elasticbeanstalk.-2010-12-01/nullable-integer))
(clojure.spec.alpha/def :portkey.aws.elasticbeanstalk.-2010-12-01.instance-health-summary/pending (clojure.spec.alpha/and :portkey.aws.elasticbeanstalk.-2010-12-01/nullable-integer))
(clojure.spec.alpha/def :portkey.aws.elasticbeanstalk.-2010-12-01.instance-health-summary/ok (clojure.spec.alpha/and :portkey.aws.elasticbeanstalk.-2010-12-01/nullable-integer))
(clojure.spec.alpha/def :portkey.aws.elasticbeanstalk.-2010-12-01.instance-health-summary/info (clojure.spec.alpha/and :portkey.aws.elasticbeanstalk.-2010-12-01/nullable-integer))
(clojure.spec.alpha/def :portkey.aws.elasticbeanstalk.-2010-12-01.instance-health-summary/warning (clojure.spec.alpha/and :portkey.aws.elasticbeanstalk.-2010-12-01/nullable-integer))
(clojure.spec.alpha/def :portkey.aws.elasticbeanstalk.-2010-12-01.instance-health-summary/degraded (clojure.spec.alpha/and :portkey.aws.elasticbeanstalk.-2010-12-01/nullable-integer))
(clojure.spec.alpha/def :portkey.aws.elasticbeanstalk.-2010-12-01.instance-health-summary/severe (clojure.spec.alpha/and :portkey.aws.elasticbeanstalk.-2010-12-01/nullable-integer))
(clojure.spec.alpha/def :portkey.aws.elasticbeanstalk.-2010-12-01/instance-health-summary (portkey.aws/json-keys :req-un [] :opt-un [:portkey.aws.elasticbeanstalk.-2010-12-01.instance-health-summary/NoData :portkey.aws.elasticbeanstalk.-2010-12-01.instance-health-summary/Unknown :portkey.aws.elasticbeanstalk.-2010-12-01.instance-health-summary/Pending :portkey.aws.elasticbeanstalk.-2010-12-01.instance-health-summary/Ok :portkey.aws.elasticbeanstalk.-2010-12-01.instance-health-summary/Info :portkey.aws.elasticbeanstalk.-2010-12-01.instance-health-summary/Warning :portkey.aws.elasticbeanstalk.-2010-12-01.instance-health-summary/Degraded :portkey.aws.elasticbeanstalk.-2010-12-01.instance-health-summary/Severe] :locations {}))

(clojure.spec.alpha/def :portkey.aws.elasticbeanstalk.-2010-12-01.describe-instances-health-request/attribute-names (clojure.spec.alpha/and :portkey.aws.elasticbeanstalk.-2010-12-01/instances-health-attributes))
(clojure.spec.alpha/def :portkey.aws.elasticbeanstalk.-2010-12-01/describe-instances-health-request (portkey.aws/json-keys :req-un [] :opt-un [:portkey.aws.elasticbeanstalk.-2010-12-01/EnvironmentName :portkey.aws.elasticbeanstalk.-2010-12-01/EnvironmentId :portkey.aws.elasticbeanstalk.-2010-12-01.describe-instances-health-request/AttributeNames :portkey.aws.elasticbeanstalk.-2010-12-01/NextToken] :locations {}))

(clojure.spec.alpha/def :portkey.aws.elasticbeanstalk.-2010-12-01.describe-events-message/severity (clojure.spec.alpha/and :portkey.aws.elasticbeanstalk.-2010-12-01/event-severity))
(clojure.spec.alpha/def :portkey.aws.elasticbeanstalk.-2010-12-01.describe-events-message/end-time (clojure.spec.alpha/and :portkey.aws.elasticbeanstalk.-2010-12-01/time-filter-end))
(clojure.spec.alpha/def :portkey.aws.elasticbeanstalk.-2010-12-01.describe-events-message/start-time (clojure.spec.alpha/and :portkey.aws.elasticbeanstalk.-2010-12-01/time-filter-start))
(clojure.spec.alpha/def :portkey.aws.elasticbeanstalk.-2010-12-01.describe-events-message/next-token (clojure.spec.alpha/and :portkey.aws.elasticbeanstalk.-2010-12-01/token))
(clojure.spec.alpha/def :portkey.aws.elasticbeanstalk.-2010-12-01.describe-events-message/template-name (clojure.spec.alpha/and :portkey.aws.elasticbeanstalk.-2010-12-01/configuration-template-name))
(clojure.spec.alpha/def :portkey.aws.elasticbeanstalk.-2010-12-01/describe-events-message (portkey.aws/json-keys :req-un [] :opt-un [:portkey.aws.elasticbeanstalk.-2010-12-01/VersionLabel :portkey.aws.elasticbeanstalk.-2010-12-01.describe-events-message/Severity :portkey.aws.elasticbeanstalk.-2010-12-01.describe-events-message/EndTime :portkey.aws.elasticbeanstalk.-2010-12-01/RequestId :portkey.aws.elasticbeanstalk.-2010-12-01.describe-events-message/StartTime :portkey.aws.elasticbeanstalk.-2010-12-01/EnvironmentName :portkey.aws.elasticbeanstalk.-2010-12-01/MaxRecords :portkey.aws.elasticbeanstalk.-2010-12-01.describe-events-message/NextToken :portkey.aws.elasticbeanstalk.-2010-12-01/ApplicationName :portkey.aws.elasticbeanstalk.-2010-12-01.describe-events-message/TemplateName :portkey.aws.elasticbeanstalk.-2010-12-01/PlatformArn :portkey.aws.elasticbeanstalk.-2010-12-01/EnvironmentId] :locations {}))

(clojure.spec.alpha/def :portkey.aws.elasticbeanstalk.-2010-12-01/load-average-value clojure.core/double?)

(clojure.spec.alpha/def :portkey.aws.elasticbeanstalk.-2010-12-01.describe-environment-managed-actions-request/environment-name (clojure.spec.alpha/and :portkey.aws.elasticbeanstalk.-2010-12-01/string))
(clojure.spec.alpha/def :portkey.aws.elasticbeanstalk.-2010-12-01.describe-environment-managed-actions-request/environment-id (clojure.spec.alpha/and :portkey.aws.elasticbeanstalk.-2010-12-01/string))
(clojure.spec.alpha/def :portkey.aws.elasticbeanstalk.-2010-12-01.describe-environment-managed-actions-request/status (clojure.spec.alpha/and :portkey.aws.elasticbeanstalk.-2010-12-01/action-status))
(clojure.spec.alpha/def :portkey.aws.elasticbeanstalk.-2010-12-01/describe-environment-managed-actions-request (portkey.aws/json-keys :req-un [] :opt-un [:portkey.aws.elasticbeanstalk.-2010-12-01.describe-environment-managed-actions-request/EnvironmentName :portkey.aws.elasticbeanstalk.-2010-12-01.describe-environment-managed-actions-request/EnvironmentId :portkey.aws.elasticbeanstalk.-2010-12-01.describe-environment-managed-actions-request/Status] :locations {}))

(clojure.spec.alpha/def :portkey.aws.elasticbeanstalk.-2010-12-01/operation-in-progress-exception (portkey.aws/json-keys :req-un [] :opt-un [] :locations {}))

(clojure.spec.alpha/def :portkey.aws.elasticbeanstalk.-2010-12-01/group-name (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__36226__auto__] (clojure.core/<= 1 (clojure.core/count s__36226__auto__))) (clojure.core/fn [s__36227__auto__] (clojure.core/< (clojure.core/count s__36227__auto__) 19))))

(clojure.spec.alpha/def :portkey.aws.elasticbeanstalk.-2010-12-01/source-type {"Git" "Git", :git "Git", "Zip" "Zip", :zip "Zip"})

(clojure.spec.alpha/def :portkey.aws.elasticbeanstalk.-2010-12-01/auto-scaling-group-list (clojure.spec.alpha/coll-of :portkey.aws.elasticbeanstalk.-2010-12-01/auto-scaling-group))

(clojure.spec.alpha/def :portkey.aws.elasticbeanstalk.-2010-12-01/custom-ami (portkey.aws/json-keys :req-un [] :opt-un [:portkey.aws.elasticbeanstalk.-2010-12-01/VirtualizationType :portkey.aws.elasticbeanstalk.-2010-12-01/ImageId] :locations {}))

(clojure.spec.alpha/def :portkey.aws.elasticbeanstalk.-2010-12-01/auto-create-application clojure.core/boolean?)

(clojure.spec.alpha/def :portkey.aws.elasticbeanstalk.-2010-12-01/request-count clojure.core/int?)

(clojure.spec.alpha/def :portkey.aws.elasticbeanstalk.-2010-12-01.describe-configuration-options-message/template-name (clojure.spec.alpha/and :portkey.aws.elasticbeanstalk.-2010-12-01/configuration-template-name))
(clojure.spec.alpha/def :portkey.aws.elasticbeanstalk.-2010-12-01.describe-configuration-options-message/options (clojure.spec.alpha/and :portkey.aws.elasticbeanstalk.-2010-12-01/options-specifier-list))
(clojure.spec.alpha/def :portkey.aws.elasticbeanstalk.-2010-12-01/describe-configuration-options-message (portkey.aws/json-keys :req-un [] :opt-un [:portkey.aws.elasticbeanstalk.-2010-12-01/ApplicationName :portkey.aws.elasticbeanstalk.-2010-12-01.describe-configuration-options-message/TemplateName :portkey.aws.elasticbeanstalk.-2010-12-01/EnvironmentName :portkey.aws.elasticbeanstalk.-2010-12-01/SolutionStackName :portkey.aws.elasticbeanstalk.-2010-12-01/PlatformArn :portkey.aws.elasticbeanstalk.-2010-12-01.describe-configuration-options-message/Options] :locations {}))

(clojure.spec.alpha/def :portkey.aws.elasticbeanstalk.-2010-12-01/regex-label (clojure.spec.alpha/and clojure.core/string?))

(clojure.spec.alpha/def :portkey.aws.elasticbeanstalk.-2010-12-01.create-environment-message/tier (clojure.spec.alpha/and :portkey.aws.elasticbeanstalk.-2010-12-01/environment-tier))
(clojure.spec.alpha/def :portkey.aws.elasticbeanstalk.-2010-12-01.create-environment-message/option-settings (clojure.spec.alpha/and :portkey.aws.elasticbeanstalk.-2010-12-01/configuration-option-settings-list))
(clojure.spec.alpha/def :portkey.aws.elasticbeanstalk.-2010-12-01.create-environment-message/cnameprefix (clojure.spec.alpha/and :portkey.aws.elasticbeanstalk.-2010-12-01/dnscname-prefix))
(clojure.spec.alpha/def :portkey.aws.elasticbeanstalk.-2010-12-01.create-environment-message/template-name (clojure.spec.alpha/and :portkey.aws.elasticbeanstalk.-2010-12-01/configuration-template-name))
(clojure.spec.alpha/def :portkey.aws.elasticbeanstalk.-2010-12-01.create-environment-message/options-to-remove (clojure.spec.alpha/and :portkey.aws.elasticbeanstalk.-2010-12-01/options-specifier-list))
(clojure.spec.alpha/def :portkey.aws.elasticbeanstalk.-2010-12-01/create-environment-message (portkey.aws/json-keys :req-un [:portkey.aws.elasticbeanstalk.-2010-12-01/ApplicationName] :opt-un [:portkey.aws.elasticbeanstalk.-2010-12-01/VersionLabel :portkey.aws.elasticbeanstalk.-2010-12-01.create-environment-message/Tier :portkey.aws.elasticbeanstalk.-2010-12-01/SolutionStackName :portkey.aws.elasticbeanstalk.-2010-12-01/EnvironmentName :portkey.aws.elasticbeanstalk.-2010-12-01.create-environment-message/OptionSettings :portkey.aws.elasticbeanstalk.-2010-12-01/Tags :portkey.aws.elasticbeanstalk.-2010-12-01/GroupName :portkey.aws.elasticbeanstalk.-2010-12-01/Description :portkey.aws.elasticbeanstalk.-2010-12-01.create-environment-message/CNAMEPrefix :portkey.aws.elasticbeanstalk.-2010-12-01.create-environment-message/TemplateName :portkey.aws.elasticbeanstalk.-2010-12-01/PlatformArn :portkey.aws.elasticbeanstalk.-2010-12-01.create-environment-message/OptionsToRemove] :locations {}))

(clojure.spec.alpha/def :portkey.aws.elasticbeanstalk.-2010-12-01.delete-application-message/terminate-env-by-force (clojure.spec.alpha/and :portkey.aws.elasticbeanstalk.-2010-12-01/terminate-env-force))
(clojure.spec.alpha/def :portkey.aws.elasticbeanstalk.-2010-12-01/delete-application-message (portkey.aws/json-keys :req-un [:portkey.aws.elasticbeanstalk.-2010-12-01/ApplicationName] :opt-un [:portkey.aws.elasticbeanstalk.-2010-12-01.delete-application-message/TerminateEnvByForce] :locations {}))

(clojure.spec.alpha/def :portkey.aws.elasticbeanstalk.-2010-12-01/supported-tier-list (clojure.spec.alpha/coll-of :portkey.aws.elasticbeanstalk.-2010-12-01/supported-tier))

(clojure.spec.alpha/def :portkey.aws.elasticbeanstalk.-2010-12-01.application-resource-lifecycle-config/service-role (clojure.spec.alpha/and :portkey.aws.elasticbeanstalk.-2010-12-01/string))
(clojure.spec.alpha/def :portkey.aws.elasticbeanstalk.-2010-12-01.application-resource-lifecycle-config/version-lifecycle-config (clojure.spec.alpha/and :portkey.aws.elasticbeanstalk.-2010-12-01/application-version-lifecycle-config))
(clojure.spec.alpha/def :portkey.aws.elasticbeanstalk.-2010-12-01/application-resource-lifecycle-config (portkey.aws/json-keys :req-un [] :opt-un [:portkey.aws.elasticbeanstalk.-2010-12-01.application-resource-lifecycle-config/ServiceRole :portkey.aws.elasticbeanstalk.-2010-12-01.application-resource-lifecycle-config/VersionLifecycleConfig] :locations {}))

(clojure.spec.alpha/def :portkey.aws.elasticbeanstalk.-2010-12-01/platform-category (clojure.spec.alpha/and clojure.core/string?))

(clojure.spec.alpha/def :portkey.aws.elasticbeanstalk.-2010-12-01.validation-message/message (clojure.spec.alpha/and :portkey.aws.elasticbeanstalk.-2010-12-01/validation-message-string))
(clojure.spec.alpha/def :portkey.aws.elasticbeanstalk.-2010-12-01.validation-message/severity (clojure.spec.alpha/and :portkey.aws.elasticbeanstalk.-2010-12-01/validation-severity))
(clojure.spec.alpha/def :portkey.aws.elasticbeanstalk.-2010-12-01.validation-message/namespace (clojure.spec.alpha/and :portkey.aws.elasticbeanstalk.-2010-12-01/option-namespace))
(clojure.spec.alpha/def :portkey.aws.elasticbeanstalk.-2010-12-01.validation-message/option-name (clojure.spec.alpha/and :portkey.aws.elasticbeanstalk.-2010-12-01/configuration-option-name))
(clojure.spec.alpha/def :portkey.aws.elasticbeanstalk.-2010-12-01/validation-message (portkey.aws/json-keys :req-un [] :opt-un [:portkey.aws.elasticbeanstalk.-2010-12-01.validation-message/Message :portkey.aws.elasticbeanstalk.-2010-12-01.validation-message/Severity :portkey.aws.elasticbeanstalk.-2010-12-01.validation-message/Namespace :portkey.aws.elasticbeanstalk.-2010-12-01.validation-message/OptionName] :locations {}))

(clojure.spec.alpha/def :portkey.aws.elasticbeanstalk.-2010-12-01/platform-summary (portkey.aws/json-keys :req-un [] :opt-un [:portkey.aws.elasticbeanstalk.-2010-12-01/PlatformArn :portkey.aws.elasticbeanstalk.-2010-12-01/PlatformOwner :portkey.aws.elasticbeanstalk.-2010-12-01/PlatformStatus :portkey.aws.elasticbeanstalk.-2010-12-01/PlatformCategory :portkey.aws.elasticbeanstalk.-2010-12-01/OperatingSystemName :portkey.aws.elasticbeanstalk.-2010-12-01/OperatingSystemVersion :portkey.aws.elasticbeanstalk.-2010-12-01/SupportedTierList :portkey.aws.elasticbeanstalk.-2010-12-01/SupportedAddonList] :locations {}))

(clojure.spec.alpha/def :portkey.aws.elasticbeanstalk.-2010-12-01/version-labels-list (clojure.spec.alpha/coll-of :portkey.aws.elasticbeanstalk.-2010-12-01/version-label))

(clojure.spec.alpha/def :portkey.aws.elasticbeanstalk.-2010-12-01/next-token (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__36226__auto__] (clojure.core/<= 1 (clojure.core/count s__36226__auto__))) (clojure.core/fn [s__36227__auto__] (clojure.core/< (clojure.core/count s__36227__auto__) 100))))

(clojure.spec.alpha/def :portkey.aws.elasticbeanstalk.-2010-12-01.managed-action-history-item/action-id (clojure.spec.alpha/and :portkey.aws.elasticbeanstalk.-2010-12-01/string))
(clojure.spec.alpha/def :portkey.aws.elasticbeanstalk.-2010-12-01.managed-action-history-item/action-description (clojure.spec.alpha/and :portkey.aws.elasticbeanstalk.-2010-12-01/string))
(clojure.spec.alpha/def :portkey.aws.elasticbeanstalk.-2010-12-01.managed-action-history-item/status (clojure.spec.alpha/and :portkey.aws.elasticbeanstalk.-2010-12-01/action-history-status))
(clojure.spec.alpha/def :portkey.aws.elasticbeanstalk.-2010-12-01.managed-action-history-item/failure-description (clojure.spec.alpha/and :portkey.aws.elasticbeanstalk.-2010-12-01/string))
(clojure.spec.alpha/def :portkey.aws.elasticbeanstalk.-2010-12-01.managed-action-history-item/executed-time (clojure.spec.alpha/and :portkey.aws.elasticbeanstalk.-2010-12-01/timestamp))
(clojure.spec.alpha/def :portkey.aws.elasticbeanstalk.-2010-12-01.managed-action-history-item/finished-time (clojure.spec.alpha/and :portkey.aws.elasticbeanstalk.-2010-12-01/timestamp))
(clojure.spec.alpha/def :portkey.aws.elasticbeanstalk.-2010-12-01/managed-action-history-item (portkey.aws/json-keys :req-un [] :opt-un [:portkey.aws.elasticbeanstalk.-2010-12-01.managed-action-history-item/ActionId :portkey.aws.elasticbeanstalk.-2010-12-01/ActionType :portkey.aws.elasticbeanstalk.-2010-12-01.managed-action-history-item/ActionDescription :portkey.aws.elasticbeanstalk.-2010-12-01/FailureType :portkey.aws.elasticbeanstalk.-2010-12-01.managed-action-history-item/Status :portkey.aws.elasticbeanstalk.-2010-12-01.managed-action-history-item/FailureDescription :portkey.aws.elasticbeanstalk.-2010-12-01.managed-action-history-item/ExecutedTime :portkey.aws.elasticbeanstalk.-2010-12-01.managed-action-history-item/FinishedTime] :locations {}))

(clojure.spec.alpha/def :portkey.aws.elasticbeanstalk.-2010-12-01.update-configuration-template-message/template-name (clojure.spec.alpha/and :portkey.aws.elasticbeanstalk.-2010-12-01/configuration-template-name))
(clojure.spec.alpha/def :portkey.aws.elasticbeanstalk.-2010-12-01.update-configuration-template-message/option-settings (clojure.spec.alpha/and :portkey.aws.elasticbeanstalk.-2010-12-01/configuration-option-settings-list))
(clojure.spec.alpha/def :portkey.aws.elasticbeanstalk.-2010-12-01.update-configuration-template-message/options-to-remove (clojure.spec.alpha/and :portkey.aws.elasticbeanstalk.-2010-12-01/options-specifier-list))
(clojure.spec.alpha/def :portkey.aws.elasticbeanstalk.-2010-12-01/update-configuration-template-message (portkey.aws/json-keys :req-un [:portkey.aws.elasticbeanstalk.-2010-12-01/ApplicationName :portkey.aws.elasticbeanstalk.-2010-12-01.update-configuration-template-message/TemplateName] :opt-un [:portkey.aws.elasticbeanstalk.-2010-12-01/Description :portkey.aws.elasticbeanstalk.-2010-12-01.update-configuration-template-message/OptionSettings :portkey.aws.elasticbeanstalk.-2010-12-01.update-configuration-template-message/OptionsToRemove] :locations {}))

(clojure.spec.alpha/def :portkey.aws.elasticbeanstalk.-2010-12-01/environment-info-type {"tail" "tail", :tail "tail", "bundle" "bundle", :bundle "bundle"})

(clojure.spec.alpha/def :portkey.aws.elasticbeanstalk.-2010-12-01.application-descriptions-message/applications (clojure.spec.alpha/and :portkey.aws.elasticbeanstalk.-2010-12-01/application-description-list))
(clojure.spec.alpha/def :portkey.aws.elasticbeanstalk.-2010-12-01/application-descriptions-message (portkey.aws/json-keys :req-un [] :opt-un [:portkey.aws.elasticbeanstalk.-2010-12-01.application-descriptions-message/Applications] :locations {}))

(clojure.spec.alpha/def :portkey.aws.elasticbeanstalk.-2010-12-01/configuration-option-name (clojure.spec.alpha/and clojure.core/string?))

(clojure.spec.alpha/def :portkey.aws.elasticbeanstalk.-2010-12-01/resource-id (clojure.spec.alpha/and clojure.core/string?))

(clojure.spec.alpha/def :portkey.aws.elasticbeanstalk.-2010-12-01.describe-environment-health-result/health-status (clojure.spec.alpha/and :portkey.aws.elasticbeanstalk.-2010-12-01/string))
(clojure.spec.alpha/def :portkey.aws.elasticbeanstalk.-2010-12-01.describe-environment-health-result/status (clojure.spec.alpha/and :portkey.aws.elasticbeanstalk.-2010-12-01/environment-health))
(clojure.spec.alpha/def :portkey.aws.elasticbeanstalk.-2010-12-01.describe-environment-health-result/color (clojure.spec.alpha/and :portkey.aws.elasticbeanstalk.-2010-12-01/string))
(clojure.spec.alpha/def :portkey.aws.elasticbeanstalk.-2010-12-01.describe-environment-health-result/instances-health (clojure.spec.alpha/and :portkey.aws.elasticbeanstalk.-2010-12-01/instance-health-summary))
(clojure.spec.alpha/def :portkey.aws.elasticbeanstalk.-2010-12-01/describe-environment-health-result (portkey.aws/json-keys :req-un [] :opt-un [:portkey.aws.elasticbeanstalk.-2010-12-01/EnvironmentName :portkey.aws.elasticbeanstalk.-2010-12-01.describe-environment-health-result/HealthStatus :portkey.aws.elasticbeanstalk.-2010-12-01.describe-environment-health-result/Status :portkey.aws.elasticbeanstalk.-2010-12-01.describe-environment-health-result/Color :portkey.aws.elasticbeanstalk.-2010-12-01/Causes :portkey.aws.elasticbeanstalk.-2010-12-01/ApplicationMetrics :portkey.aws.elasticbeanstalk.-2010-12-01.describe-environment-health-result/InstancesHealth :portkey.aws.elasticbeanstalk.-2010-12-01/RefreshedAt] :locations {}))

(clojure.spec.alpha/def :portkey.aws.elasticbeanstalk.-2010-12-01/platform-frameworks (clojure.spec.alpha/coll-of :portkey.aws.elasticbeanstalk.-2010-12-01/platform-framework))

(clojure.spec.alpha/def :portkey.aws.elasticbeanstalk.-2010-12-01.retrieve-environment-info-message/info-type (clojure.spec.alpha/and :portkey.aws.elasticbeanstalk.-2010-12-01/environment-info-type))
(clojure.spec.alpha/def :portkey.aws.elasticbeanstalk.-2010-12-01/retrieve-environment-info-message (portkey.aws/json-keys :req-un [:portkey.aws.elasticbeanstalk.-2010-12-01.retrieve-environment-info-message/InfoType] :opt-un [:portkey.aws.elasticbeanstalk.-2010-12-01/EnvironmentId :portkey.aws.elasticbeanstalk.-2010-12-01/EnvironmentName] :locations {}))

(clojure.spec.alpha/def :portkey.aws.elasticbeanstalk.-2010-12-01.environment-descriptions-message/environments (clojure.spec.alpha/and :portkey.aws.elasticbeanstalk.-2010-12-01/environment-descriptions-list))
(clojure.spec.alpha/def :portkey.aws.elasticbeanstalk.-2010-12-01.environment-descriptions-message/next-token (clojure.spec.alpha/and :portkey.aws.elasticbeanstalk.-2010-12-01/token))
(clojure.spec.alpha/def :portkey.aws.elasticbeanstalk.-2010-12-01/environment-descriptions-message (portkey.aws/json-keys :req-un [] :opt-un [:portkey.aws.elasticbeanstalk.-2010-12-01.environment-descriptions-message/Environments :portkey.aws.elasticbeanstalk.-2010-12-01.environment-descriptions-message/NextToken] :locations {}))

(clojure.spec.alpha/def :portkey.aws.elasticbeanstalk.-2010-12-01/application-version-description-list (clojure.spec.alpha/coll-of :portkey.aws.elasticbeanstalk.-2010-12-01/application-version-description))

(clojure.spec.alpha/def :portkey.aws.elasticbeanstalk.-2010-12-01/too-many-platforms-exception (portkey.aws/json-keys :req-un [] :opt-un [] :locations {}))

(clojure.spec.alpha/def :portkey.aws.elasticbeanstalk.-2010-12-01.resource-quotas/application-quota (clojure.spec.alpha/and :portkey.aws.elasticbeanstalk.-2010-12-01/resource-quota))
(clojure.spec.alpha/def :portkey.aws.elasticbeanstalk.-2010-12-01.resource-quotas/application-version-quota (clojure.spec.alpha/and :portkey.aws.elasticbeanstalk.-2010-12-01/resource-quota))
(clojure.spec.alpha/def :portkey.aws.elasticbeanstalk.-2010-12-01.resource-quotas/environment-quota (clojure.spec.alpha/and :portkey.aws.elasticbeanstalk.-2010-12-01/resource-quota))
(clojure.spec.alpha/def :portkey.aws.elasticbeanstalk.-2010-12-01.resource-quotas/configuration-template-quota (clojure.spec.alpha/and :portkey.aws.elasticbeanstalk.-2010-12-01/resource-quota))
(clojure.spec.alpha/def :portkey.aws.elasticbeanstalk.-2010-12-01.resource-quotas/custom-platform-quota (clojure.spec.alpha/and :portkey.aws.elasticbeanstalk.-2010-12-01/resource-quota))
(clojure.spec.alpha/def :portkey.aws.elasticbeanstalk.-2010-12-01/resource-quotas (portkey.aws/json-keys :req-un [] :opt-un [:portkey.aws.elasticbeanstalk.-2010-12-01.resource-quotas/ApplicationQuota :portkey.aws.elasticbeanstalk.-2010-12-01.resource-quotas/ApplicationVersionQuota :portkey.aws.elasticbeanstalk.-2010-12-01.resource-quotas/EnvironmentQuota :portkey.aws.elasticbeanstalk.-2010-12-01.resource-quotas/ConfigurationTemplateQuota :portkey.aws.elasticbeanstalk.-2010-12-01.resource-quotas/CustomPlatformQuota] :locations {}))

(clojure.spec.alpha/def :portkey.aws.elasticbeanstalk.-2010-12-01/too-many-environments-exception (portkey.aws/json-keys :req-un [] :opt-un [] :locations {}))

(clojure.spec.alpha/def :portkey.aws.elasticbeanstalk.-2010-12-01/platform-filter-value (clojure.spec.alpha/and clojure.core/string?))

(clojure.spec.alpha/def :portkey.aws.elasticbeanstalk.-2010-12-01/environment-arn (clojure.spec.alpha/and clojure.core/string?))

(clojure.spec.alpha/def :portkey.aws.elasticbeanstalk.-2010-12-01.option-specification/namespace (clojure.spec.alpha/and :portkey.aws.elasticbeanstalk.-2010-12-01/option-namespace))
(clojure.spec.alpha/def :portkey.aws.elasticbeanstalk.-2010-12-01.option-specification/option-name (clojure.spec.alpha/and :portkey.aws.elasticbeanstalk.-2010-12-01/configuration-option-name))
(clojure.spec.alpha/def :portkey.aws.elasticbeanstalk.-2010-12-01/option-specification (portkey.aws/json-keys :req-un [] :opt-un [:portkey.aws.elasticbeanstalk.-2010-12-01/ResourceName :portkey.aws.elasticbeanstalk.-2010-12-01.option-specification/Namespace :portkey.aws.elasticbeanstalk.-2010-12-01.option-specification/OptionName] :locations {}))

(clojure.spec.alpha/def :portkey.aws.elasticbeanstalk.-2010-12-01/available-solution-stack-details-list (clojure.spec.alpha/coll-of :portkey.aws.elasticbeanstalk.-2010-12-01/solution-stack-description))

(clojure.spec.alpha/def :portkey.aws.elasticbeanstalk.-2010-12-01/tag-list (clojure.spec.alpha/coll-of :portkey.aws.elasticbeanstalk.-2010-12-01/tag))

(clojure.spec.alpha/def :portkey.aws.elasticbeanstalk.-2010-12-01.swap-environmentcnames-message/source-environment-id (clojure.spec.alpha/and :portkey.aws.elasticbeanstalk.-2010-12-01/environment-id))
(clojure.spec.alpha/def :portkey.aws.elasticbeanstalk.-2010-12-01.swap-environmentcnames-message/source-environment-name (clojure.spec.alpha/and :portkey.aws.elasticbeanstalk.-2010-12-01/environment-name))
(clojure.spec.alpha/def :portkey.aws.elasticbeanstalk.-2010-12-01.swap-environmentcnames-message/destination-environment-id (clojure.spec.alpha/and :portkey.aws.elasticbeanstalk.-2010-12-01/environment-id))
(clojure.spec.alpha/def :portkey.aws.elasticbeanstalk.-2010-12-01.swap-environmentcnames-message/destination-environment-name (clojure.spec.alpha/and :portkey.aws.elasticbeanstalk.-2010-12-01/environment-name))
(clojure.spec.alpha/def :portkey.aws.elasticbeanstalk.-2010-12-01/swap-environmentcnames-message (portkey.aws/json-keys :req-un [] :opt-un [:portkey.aws.elasticbeanstalk.-2010-12-01.swap-environmentcnames-message/SourceEnvironmentId :portkey.aws.elasticbeanstalk.-2010-12-01.swap-environmentcnames-message/SourceEnvironmentName :portkey.aws.elasticbeanstalk.-2010-12-01.swap-environmentcnames-message/DestinationEnvironmentId :portkey.aws.elasticbeanstalk.-2010-12-01.swap-environmentcnames-message/DestinationEnvironmentName] :locations {}))

(clojure.spec.alpha/def :portkey.aws.elasticbeanstalk.-2010-12-01/delete-application-version-message (portkey.aws/json-keys :req-un [:portkey.aws.elasticbeanstalk.-2010-12-01/ApplicationName :portkey.aws.elasticbeanstalk.-2010-12-01/VersionLabel] :opt-un [:portkey.aws.elasticbeanstalk.-2010-12-01/DeleteSourceBundle] :locations {}))

(clojure.spec.alpha/def :portkey.aws.elasticbeanstalk.-2010-12-01/describe-instances-health-result (portkey.aws/json-keys :req-un [] :opt-un [:portkey.aws.elasticbeanstalk.-2010-12-01/InstanceHealthList :portkey.aws.elasticbeanstalk.-2010-12-01/RefreshedAt :portkey.aws.elasticbeanstalk.-2010-12-01/NextToken] :locations {}))

(clojure.spec.alpha/def :portkey.aws.elasticbeanstalk.-2010-12-01/environment-health-attribute {:health-status "HealthStatus", :instances-health "InstancesHealth", :application-metrics "ApplicationMetrics", :color "Color", "HealthStatus" "HealthStatus", "InstancesHealth" "InstancesHealth", "Status" "Status", :all "All", "Causes" "Causes", :status "Status", "ApplicationMetrics" "ApplicationMetrics", :refreshed-at "RefreshedAt", "RefreshedAt" "RefreshedAt", "All" "All", "Color" "Color", :causes "Causes"})

(clojure.spec.alpha/def :portkey.aws.elasticbeanstalk.-2010-12-01/instances-health-attributes (clojure.spec.alpha/coll-of :portkey.aws.elasticbeanstalk.-2010-12-01/instances-health-attribute))

(clojure.spec.alpha/def :portkey.aws.elasticbeanstalk.-2010-12-01/tag-key-list (clojure.spec.alpha/coll-of :portkey.aws.elasticbeanstalk.-2010-12-01/tag-key))

(clojure.spec.alpha/def :portkey.aws.elasticbeanstalk.-2010-12-01.managed-action/action-id (clojure.spec.alpha/and :portkey.aws.elasticbeanstalk.-2010-12-01/string))
(clojure.spec.alpha/def :portkey.aws.elasticbeanstalk.-2010-12-01.managed-action/action-description (clojure.spec.alpha/and :portkey.aws.elasticbeanstalk.-2010-12-01/string))
(clojure.spec.alpha/def :portkey.aws.elasticbeanstalk.-2010-12-01.managed-action/status (clojure.spec.alpha/and :portkey.aws.elasticbeanstalk.-2010-12-01/action-status))
(clojure.spec.alpha/def :portkey.aws.elasticbeanstalk.-2010-12-01.managed-action/window-start-time (clojure.spec.alpha/and :portkey.aws.elasticbeanstalk.-2010-12-01/timestamp))
(clojure.spec.alpha/def :portkey.aws.elasticbeanstalk.-2010-12-01/managed-action (portkey.aws/json-keys :req-un [] :opt-un [:portkey.aws.elasticbeanstalk.-2010-12-01.managed-action/ActionId :portkey.aws.elasticbeanstalk.-2010-12-01.managed-action/ActionDescription :portkey.aws.elasticbeanstalk.-2010-12-01/ActionType :portkey.aws.elasticbeanstalk.-2010-12-01.managed-action/Status :portkey.aws.elasticbeanstalk.-2010-12-01.managed-action/WindowStartTime] :locations {}))

(clojure.spec.alpha/def :portkey.aws.elasticbeanstalk.-2010-12-01/include-deleted clojure.core/boolean?)

(clojure.spec.alpha/def :portkey.aws.elasticbeanstalk.-2010-12-01/platform-owner (clojure.spec.alpha/and clojure.core/string?))

(clojure.spec.alpha/def :portkey.aws.elasticbeanstalk.-2010-12-01.environment-resource-description/auto-scaling-groups (clojure.spec.alpha/and :portkey.aws.elasticbeanstalk.-2010-12-01/auto-scaling-group-list))
(clojure.spec.alpha/def :portkey.aws.elasticbeanstalk.-2010-12-01.environment-resource-description/instances (clojure.spec.alpha/and :portkey.aws.elasticbeanstalk.-2010-12-01/instance-list))
(clojure.spec.alpha/def :portkey.aws.elasticbeanstalk.-2010-12-01.environment-resource-description/launch-configurations (clojure.spec.alpha/and :portkey.aws.elasticbeanstalk.-2010-12-01/launch-configuration-list))
(clojure.spec.alpha/def :portkey.aws.elasticbeanstalk.-2010-12-01.environment-resource-description/load-balancers (clojure.spec.alpha/and :portkey.aws.elasticbeanstalk.-2010-12-01/load-balancer-list))
(clojure.spec.alpha/def :portkey.aws.elasticbeanstalk.-2010-12-01.environment-resource-description/triggers (clojure.spec.alpha/and :portkey.aws.elasticbeanstalk.-2010-12-01/trigger-list))
(clojure.spec.alpha/def :portkey.aws.elasticbeanstalk.-2010-12-01.environment-resource-description/queues (clojure.spec.alpha/and :portkey.aws.elasticbeanstalk.-2010-12-01/queue-list))
(clojure.spec.alpha/def :portkey.aws.elasticbeanstalk.-2010-12-01/environment-resource-description (portkey.aws/json-keys :req-un [] :opt-un [:portkey.aws.elasticbeanstalk.-2010-12-01/EnvironmentName :portkey.aws.elasticbeanstalk.-2010-12-01.environment-resource-description/AutoScalingGroups :portkey.aws.elasticbeanstalk.-2010-12-01.environment-resource-description/Instances :portkey.aws.elasticbeanstalk.-2010-12-01.environment-resource-description/LaunchConfigurations :portkey.aws.elasticbeanstalk.-2010-12-01.environment-resource-description/LoadBalancers :portkey.aws.elasticbeanstalk.-2010-12-01.environment-resource-description/Triggers :portkey.aws.elasticbeanstalk.-2010-12-01.environment-resource-description/Queues] :locations {}))

(clojure.spec.alpha/def :portkey.aws.elasticbeanstalk.-2010-12-01/update-application-message (portkey.aws/json-keys :req-un [:portkey.aws.elasticbeanstalk.-2010-12-01/ApplicationName] :opt-un [:portkey.aws.elasticbeanstalk.-2010-12-01/Description] :locations {}))

(clojure.spec.alpha/def :portkey.aws.elasticbeanstalk.-2010-12-01/supported-addon (clojure.spec.alpha/and clojure.core/string?))

(clojure.spec.alpha/def :portkey.aws.elasticbeanstalk.-2010-12-01.application-resource-lifecycle-description-message/resource-lifecycle-config (clojure.spec.alpha/and :portkey.aws.elasticbeanstalk.-2010-12-01/application-resource-lifecycle-config))
(clojure.spec.alpha/def :portkey.aws.elasticbeanstalk.-2010-12-01/application-resource-lifecycle-description-message (portkey.aws/json-keys :req-un [] :opt-un [:portkey.aws.elasticbeanstalk.-2010-12-01/ApplicationName :portkey.aws.elasticbeanstalk.-2010-12-01.application-resource-lifecycle-description-message/ResourceLifecycleConfig] :locations {}))

(clojure.spec.alpha/def :portkey.aws.elasticbeanstalk.-2010-12-01/resource-not-found-exception (portkey.aws/json-keys :req-un [] :opt-un [] :locations {}))

(clojure.spec.alpha/def :portkey.aws.elasticbeanstalk.-2010-12-01/action-status {"Scheduled" "Scheduled", :scheduled "Scheduled", "Pending" "Pending", :pending "Pending", "Running" "Running", :running "Running", "Unknown" "Unknown", :unknown "Unknown"})

(clojure.spec.alpha/def :portkey.aws.elasticbeanstalk.-2010-12-01/abortable-operation-in-progress clojure.core/boolean?)

(clojure.spec.alpha/def :portkey.aws.elasticbeanstalk.-2010-12-01/causes (clojure.spec.alpha/coll-of :portkey.aws.elasticbeanstalk.-2010-12-01/cause))

(clojure.spec.alpha/def :portkey.aws.elasticbeanstalk.-2010-12-01.update-tags-for-resource-message/tags-to-add (clojure.spec.alpha/and :portkey.aws.elasticbeanstalk.-2010-12-01/tag-list))
(clojure.spec.alpha/def :portkey.aws.elasticbeanstalk.-2010-12-01.update-tags-for-resource-message/tags-to-remove (clojure.spec.alpha/and :portkey.aws.elasticbeanstalk.-2010-12-01/tag-key-list))
(clojure.spec.alpha/def :portkey.aws.elasticbeanstalk.-2010-12-01/update-tags-for-resource-message (portkey.aws/json-keys :req-un [:portkey.aws.elasticbeanstalk.-2010-12-01/ResourceArn] :opt-un [:portkey.aws.elasticbeanstalk.-2010-12-01.update-tags-for-resource-message/TagsToAdd :portkey.aws.elasticbeanstalk.-2010-12-01.update-tags-for-resource-message/TagsToRemove] :locations {}))

(clojure.spec.alpha/def :portkey.aws.elasticbeanstalk.-2010-12-01/nullable-long clojure.core/int?)

(clojure.spec.alpha/def :portkey.aws.elasticbeanstalk.-2010-12-01/delete-platform-version-request (portkey.aws/json-keys :req-un [] :opt-un [:portkey.aws.elasticbeanstalk.-2010-12-01/PlatformArn] :locations {}))

(clojure.spec.alpha/def :portkey.aws.elasticbeanstalk.-2010-12-01/delete-environment-configuration-message (portkey.aws/json-keys :req-un [:portkey.aws.elasticbeanstalk.-2010-12-01/ApplicationName :portkey.aws.elasticbeanstalk.-2010-12-01/EnvironmentName] :opt-un [] :locations {}))

(clojure.spec.alpha/def :portkey.aws.elasticbeanstalk.-2010-12-01/configuration-option-value-type {"Scalar" "Scalar", :scalar "Scalar", "List" "List", :list "List"})

(clojure.spec.alpha/def :portkey.aws.elasticbeanstalk.-2010-12-01/too-many-buckets-exception (portkey.aws/json-keys :req-un [] :opt-un [] :locations {}))

(clojure.spec.alpha/def :portkey.aws.elasticbeanstalk.-2010-12-01/application-version-status {"Failed" "Failed", :building "Building", :unprocessed "Unprocessed", :processing "Processing", "Unprocessed" "Unprocessed", "Building" "Building", "Processed" "Processed", "Processing" "Processing", :processed "Processed", :failed "Failed"})

(clojure.spec.alpha/def :portkey.aws.elasticbeanstalk.-2010-12-01/maintainer (clojure.spec.alpha/and clojure.core/string?))

(clojure.spec.alpha/def :portkey.aws.elasticbeanstalk.-2010-12-01/description (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__36227__auto__] (clojure.core/< (clojure.core/count s__36227__auto__) 200))))

(clojure.spec.alpha/def :portkey.aws.elasticbeanstalk.-2010-12-01/tag-value (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__36226__auto__] (clojure.core/<= 1 (clojure.core/count s__36226__auto__))) (clojure.core/fn [s__36227__auto__] (clojure.core/< (clojure.core/count s__36227__auto__) 256))))

(clojure.spec.alpha/def :portkey.aws.elasticbeanstalk.-2010-12-01/configuration-option-settings-list (clojure.spec.alpha/coll-of :portkey.aws.elasticbeanstalk.-2010-12-01/configuration-option-setting))

(clojure.spec.alpha/def :portkey.aws.elasticbeanstalk.-2010-12-01.configuration-option-setting/namespace (clojure.spec.alpha/and :portkey.aws.elasticbeanstalk.-2010-12-01/option-namespace))
(clojure.spec.alpha/def :portkey.aws.elasticbeanstalk.-2010-12-01.configuration-option-setting/option-name (clojure.spec.alpha/and :portkey.aws.elasticbeanstalk.-2010-12-01/configuration-option-name))
(clojure.spec.alpha/def :portkey.aws.elasticbeanstalk.-2010-12-01.configuration-option-setting/value (clojure.spec.alpha/and :portkey.aws.elasticbeanstalk.-2010-12-01/configuration-option-value))
(clojure.spec.alpha/def :portkey.aws.elasticbeanstalk.-2010-12-01/configuration-option-setting (portkey.aws/json-keys :req-un [] :opt-un [:portkey.aws.elasticbeanstalk.-2010-12-01/ResourceName :portkey.aws.elasticbeanstalk.-2010-12-01.configuration-option-setting/Namespace :portkey.aws.elasticbeanstalk.-2010-12-01.configuration-option-setting/OptionName :portkey.aws.elasticbeanstalk.-2010-12-01.configuration-option-setting/Value] :locations {}))

(clojure.spec.alpha/def :portkey.aws.elasticbeanstalk.-2010-12-01/action-history-status {"Completed" "Completed", :completed "Completed", "Failed" "Failed", :failed "Failed", "Unknown" "Unknown", :unknown "Unknown"})

(clojure.spec.alpha/def :portkey.aws.elasticbeanstalk.-2010-12-01/environment-info-description-list (clojure.spec.alpha/coll-of :portkey.aws.elasticbeanstalk.-2010-12-01/environment-info-description))

(clojure.spec.alpha/def :portkey.aws.elasticbeanstalk.-2010-12-01/endpointurl (clojure.spec.alpha/and clojure.core/string?))

(clojure.spec.alpha/def :portkey.aws.elasticbeanstalk.-2010-12-01.retrieve-environment-info-result-message/environment-info (clojure.spec.alpha/and :portkey.aws.elasticbeanstalk.-2010-12-01/environment-info-description-list))
(clojure.spec.alpha/def :portkey.aws.elasticbeanstalk.-2010-12-01/retrieve-environment-info-result-message (portkey.aws/json-keys :req-un [] :opt-un [:portkey.aws.elasticbeanstalk.-2010-12-01.retrieve-environment-info-result-message/EnvironmentInfo] :locations {}))

(clojure.spec.alpha/def :portkey.aws.elasticbeanstalk.-2010-12-01/time-filter-start clojure.core/inst?)

(clojure.spec.alpha/def :portkey.aws.elasticbeanstalk.-2010-12-01/builder (portkey.aws/json-keys :req-un [] :opt-un [:portkey.aws.elasticbeanstalk.-2010-12-01/ARN] :locations {}))

(clojure.spec.alpha/def :portkey.aws.elasticbeanstalk.-2010-12-01.event-descriptions-message/events (clojure.spec.alpha/and :portkey.aws.elasticbeanstalk.-2010-12-01/event-description-list))
(clojure.spec.alpha/def :portkey.aws.elasticbeanstalk.-2010-12-01.event-descriptions-message/next-token (clojure.spec.alpha/and :portkey.aws.elasticbeanstalk.-2010-12-01/token))
(clojure.spec.alpha/def :portkey.aws.elasticbeanstalk.-2010-12-01/event-descriptions-message (portkey.aws/json-keys :req-un [] :opt-un [:portkey.aws.elasticbeanstalk.-2010-12-01.event-descriptions-message/Events :portkey.aws.elasticbeanstalk.-2010-12-01.event-descriptions-message/NextToken] :locations {}))

(clojure.spec.alpha/def :portkey.aws.elasticbeanstalk.-2010-12-01.application-version-description-message/application-version (clojure.spec.alpha/and :portkey.aws.elasticbeanstalk.-2010-12-01/application-version-description))
(clojure.spec.alpha/def :portkey.aws.elasticbeanstalk.-2010-12-01/application-version-description-message (portkey.aws/json-keys :req-un [] :opt-un [:portkey.aws.elasticbeanstalk.-2010-12-01.application-version-description-message/ApplicationVersion] :locations {}))

(clojure.spec.alpha/def :portkey.aws.elasticbeanstalk.-2010-12-01/exception-message (clojure.spec.alpha/and clojure.core/string?))

(clojure.spec.alpha/def :portkey.aws.elasticbeanstalk.-2010-12-01/message (clojure.spec.alpha/and clojure.core/string?))

(clojure.spec.alpha/def :portkey.aws.elasticbeanstalk.-2010-12-01.environment-resource-descriptions-message/environment-resources (clojure.spec.alpha/and :portkey.aws.elasticbeanstalk.-2010-12-01/environment-resource-description))
(clojure.spec.alpha/def :portkey.aws.elasticbeanstalk.-2010-12-01/environment-resource-descriptions-message (portkey.aws/json-keys :req-un [] :opt-un [:portkey.aws.elasticbeanstalk.-2010-12-01.environment-resource-descriptions-message/EnvironmentResources] :locations {}))

(clojure.spec.alpha/def :portkey.aws.elasticbeanstalk.-2010-12-01.delete-configuration-template-message/template-name (clojure.spec.alpha/and :portkey.aws.elasticbeanstalk.-2010-12-01/configuration-template-name))
(clojure.spec.alpha/def :portkey.aws.elasticbeanstalk.-2010-12-01/delete-configuration-template-message (portkey.aws/json-keys :req-un [:portkey.aws.elasticbeanstalk.-2010-12-01/ApplicationName :portkey.aws.elasticbeanstalk.-2010-12-01.delete-configuration-template-message/TemplateName] :opt-un [] :locations {}))

(clojure.spec.alpha/def :portkey.aws.elasticbeanstalk.-2010-12-01/options-specifier-list (clojure.spec.alpha/coll-of :portkey.aws.elasticbeanstalk.-2010-12-01/option-specification))

(clojure.spec.alpha/def :portkey.aws.elasticbeanstalk.-2010-12-01/describe-account-attributes-result (portkey.aws/json-keys :req-un [] :opt-un [:portkey.aws.elasticbeanstalk.-2010-12-01/ResourceQuotas] :locations {}))

(clojure.spec.alpha/def :portkey.aws.elasticbeanstalk.-2010-12-01/platform-max-records (clojure.spec.alpha/int-in 1 Long/MAX_VALUE))

(clojure.spec.alpha/def :portkey.aws.elasticbeanstalk.-2010-12-01.max-count-rule/enabled (clojure.spec.alpha/and :portkey.aws.elasticbeanstalk.-2010-12-01/boxed-boolean))
(clojure.spec.alpha/def :portkey.aws.elasticbeanstalk.-2010-12-01.max-count-rule/max-count (clojure.spec.alpha/and :portkey.aws.elasticbeanstalk.-2010-12-01/boxed-int))
(clojure.spec.alpha/def :portkey.aws.elasticbeanstalk.-2010-12-01.max-count-rule/delete-source-froms3 (clojure.spec.alpha/and :portkey.aws.elasticbeanstalk.-2010-12-01/boxed-boolean))
(clojure.spec.alpha/def :portkey.aws.elasticbeanstalk.-2010-12-01/max-count-rule (portkey.aws/json-keys :req-un [:portkey.aws.elasticbeanstalk.-2010-12-01.max-count-rule/Enabled] :opt-un [:portkey.aws.elasticbeanstalk.-2010-12-01.max-count-rule/MaxCount :portkey.aws.elasticbeanstalk.-2010-12-01.max-count-rule/DeleteSourceFromS3] :locations {}))

(clojure.spec.alpha/def :portkey.aws.elasticbeanstalk.-2010-12-01.auto-scaling-group/name (clojure.spec.alpha/and :portkey.aws.elasticbeanstalk.-2010-12-01/resource-id))
(clojure.spec.alpha/def :portkey.aws.elasticbeanstalk.-2010-12-01/auto-scaling-group (portkey.aws/json-keys :req-un [] :opt-un [:portkey.aws.elasticbeanstalk.-2010-12-01.auto-scaling-group/Name] :locations {}))

(clojure.spec.alpha/def :portkey.aws.elasticbeanstalk.-2010-12-01.single-instance-health/instance-type (clojure.spec.alpha/and :portkey.aws.elasticbeanstalk.-2010-12-01/string))
(clojure.spec.alpha/def :portkey.aws.elasticbeanstalk.-2010-12-01.single-instance-health/health-status (clojure.spec.alpha/and :portkey.aws.elasticbeanstalk.-2010-12-01/string))
(clojure.spec.alpha/def :portkey.aws.elasticbeanstalk.-2010-12-01.single-instance-health/availability-zone (clojure.spec.alpha/and :portkey.aws.elasticbeanstalk.-2010-12-01/string))
(clojure.spec.alpha/def :portkey.aws.elasticbeanstalk.-2010-12-01.single-instance-health/system (clojure.spec.alpha/and :portkey.aws.elasticbeanstalk.-2010-12-01/system-status))
(clojure.spec.alpha/def :portkey.aws.elasticbeanstalk.-2010-12-01.single-instance-health/color (clojure.spec.alpha/and :portkey.aws.elasticbeanstalk.-2010-12-01/string))
(clojure.spec.alpha/def :portkey.aws.elasticbeanstalk.-2010-12-01/single-instance-health (portkey.aws/json-keys :req-un [] :opt-un [:portkey.aws.elasticbeanstalk.-2010-12-01/InstanceId :portkey.aws.elasticbeanstalk.-2010-12-01/Deployment :portkey.aws.elasticbeanstalk.-2010-12-01/LaunchedAt :portkey.aws.elasticbeanstalk.-2010-12-01.single-instance-health/InstanceType :portkey.aws.elasticbeanstalk.-2010-12-01.single-instance-health/HealthStatus :portkey.aws.elasticbeanstalk.-2010-12-01.single-instance-health/AvailabilityZone :portkey.aws.elasticbeanstalk.-2010-12-01/Causes :portkey.aws.elasticbeanstalk.-2010-12-01/ApplicationMetrics :portkey.aws.elasticbeanstalk.-2010-12-01.single-instance-health/System :portkey.aws.elasticbeanstalk.-2010-12-01.single-instance-health/Color] :locations {}))

(clojure.spec.alpha/def :portkey.aws.elasticbeanstalk.-2010-12-01/application-name (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__36226__auto__] (clojure.core/<= 1 (clojure.core/count s__36226__auto__))) (clojure.core/fn [s__36227__auto__] (clojure.core/< (clojure.core/count s__36227__auto__) 100))))

(clojure.spec.alpha/def :portkey.aws.elasticbeanstalk.-2010-12-01/event-date clojure.core/inst?)

(clojure.spec.alpha/def :portkey.aws.elasticbeanstalk.-2010-12-01/validation-message-string (clojure.spec.alpha/and clojure.core/string?))

(clojure.spec.alpha/def :portkey.aws.elasticbeanstalk.-2010-12-01/platform-version (clojure.spec.alpha/and clojure.core/string?))

(clojure.spec.alpha/def :portkey.aws.elasticbeanstalk.-2010-12-01.create-configuration-template-message/template-name (clojure.spec.alpha/and :portkey.aws.elasticbeanstalk.-2010-12-01/configuration-template-name))
(clojure.spec.alpha/def :portkey.aws.elasticbeanstalk.-2010-12-01.create-configuration-template-message/option-settings (clojure.spec.alpha/and :portkey.aws.elasticbeanstalk.-2010-12-01/configuration-option-settings-list))
(clojure.spec.alpha/def :portkey.aws.elasticbeanstalk.-2010-12-01/create-configuration-template-message (portkey.aws/json-keys :req-un [:portkey.aws.elasticbeanstalk.-2010-12-01/ApplicationName :portkey.aws.elasticbeanstalk.-2010-12-01.create-configuration-template-message/TemplateName] :opt-un [:portkey.aws.elasticbeanstalk.-2010-12-01/SolutionStackName :portkey.aws.elasticbeanstalk.-2010-12-01/PlatformArn :portkey.aws.elasticbeanstalk.-2010-12-01/SourceConfiguration :portkey.aws.elasticbeanstalk.-2010-12-01/EnvironmentId :portkey.aws.elasticbeanstalk.-2010-12-01/Description :portkey.aws.elasticbeanstalk.-2010-12-01.create-configuration-template-message/OptionSettings] :locations {}))

(clojure.spec.alpha/def :portkey.aws.elasticbeanstalk.-2010-12-01/platform-filters (clojure.spec.alpha/coll-of :portkey.aws.elasticbeanstalk.-2010-12-01/platform-filter))

(clojure.spec.alpha/def :portkey.aws.elasticbeanstalk.-2010-12-01.apply-environment-managed-action-result/action-id (clojure.spec.alpha/and :portkey.aws.elasticbeanstalk.-2010-12-01/string))
(clojure.spec.alpha/def :portkey.aws.elasticbeanstalk.-2010-12-01.apply-environment-managed-action-result/action-description (clojure.spec.alpha/and :portkey.aws.elasticbeanstalk.-2010-12-01/string))
(clojure.spec.alpha/def :portkey.aws.elasticbeanstalk.-2010-12-01.apply-environment-managed-action-result/status (clojure.spec.alpha/and :portkey.aws.elasticbeanstalk.-2010-12-01/string))
(clojure.spec.alpha/def :portkey.aws.elasticbeanstalk.-2010-12-01/apply-environment-managed-action-result (portkey.aws/json-keys :req-un [] :opt-un [:portkey.aws.elasticbeanstalk.-2010-12-01.apply-environment-managed-action-result/ActionId :portkey.aws.elasticbeanstalk.-2010-12-01.apply-environment-managed-action-result/ActionDescription :portkey.aws.elasticbeanstalk.-2010-12-01/ActionType :portkey.aws.elasticbeanstalk.-2010-12-01.apply-environment-managed-action-result/Status] :locations {}))

(clojure.spec.alpha/def :portkey.aws.elasticbeanstalk.-2010-12-01/resource-name (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__36226__auto__] (clojure.core/<= 1 (clojure.core/count s__36226__auto__))) (clojure.core/fn [s__36227__auto__] (clojure.core/< (clojure.core/count s__36227__auto__) 256))))

(clojure.spec.alpha/def :portkey.aws.elasticbeanstalk.-2010-12-01/code-build-not-in-service-region-exception (portkey.aws/json-keys :req-un [] :opt-un [] :locations {}))

(clojure.spec.alpha/def :portkey.aws.elasticbeanstalk.-2010-12-01/integer clojure.core/int?)

(clojure.spec.alpha/def :portkey.aws.elasticbeanstalk.-2010-12-01/string (clojure.spec.alpha/and clojure.core/string?))

(clojure.spec.alpha/def :portkey.aws.elasticbeanstalk.-2010-12-01/platform-programming-languages (clojure.spec.alpha/coll-of :portkey.aws.elasticbeanstalk.-2010-12-01/platform-programming-language))

(clojure.spec.alpha/def :portkey.aws.elasticbeanstalk.-2010-12-01.application-metrics/duration (clojure.spec.alpha/and :portkey.aws.elasticbeanstalk.-2010-12-01/nullable-integer))
(clojure.spec.alpha/def :portkey.aws.elasticbeanstalk.-2010-12-01/application-metrics (portkey.aws/json-keys :req-un [] :opt-un [:portkey.aws.elasticbeanstalk.-2010-12-01.application-metrics/Duration :portkey.aws.elasticbeanstalk.-2010-12-01/RequestCount :portkey.aws.elasticbeanstalk.-2010-12-01/StatusCodes :portkey.aws.elasticbeanstalk.-2010-12-01/Latency] :locations {}))

(clojure.spec.alpha/def :portkey.aws.elasticbeanstalk.-2010-12-01/environment-names-list (clojure.spec.alpha/coll-of :portkey.aws.elasticbeanstalk.-2010-12-01/environment-name))

(clojure.spec.alpha/def :portkey.aws.elasticbeanstalk.-2010-12-01/too-many-tags-exception (portkey.aws/json-keys :req-un [] :opt-un [] :locations {}))

(clojure.spec.alpha/def :portkey.aws.elasticbeanstalk.-2010-12-01/operating-system-version (clojure.spec.alpha/and clojure.core/string?))

(clojure.spec.alpha/def :portkey.aws.elasticbeanstalk.-2010-12-01/instances-health-attribute {:health-status "HealthStatus", "Deployment" "Deployment", "LaunchedAt" "LaunchedAt", :application-metrics "ApplicationMetrics", :system "System", :color "Color", "InstanceType" "InstanceType", "HealthStatus" "HealthStatus", :instance-type "InstanceType", "AvailabilityZone" "AvailabilityZone", :availability-zone "AvailabilityZone", :all "All", "Causes" "Causes", "ApplicationMetrics" "ApplicationMetrics", :deployment "Deployment", :refreshed-at "RefreshedAt", "RefreshedAt" "RefreshedAt", "System" "System", "All" "All", "Color" "Color", :causes "Causes", :launched-at "LaunchedAt"})

(clojure.spec.alpha/def :portkey.aws.elasticbeanstalk.-2010-12-01.describe-application-versions-message/version-labels (clojure.spec.alpha/and :portkey.aws.elasticbeanstalk.-2010-12-01/version-labels-list))
(clojure.spec.alpha/def :portkey.aws.elasticbeanstalk.-2010-12-01.describe-application-versions-message/next-token (clojure.spec.alpha/and :portkey.aws.elasticbeanstalk.-2010-12-01/token))
(clojure.spec.alpha/def :portkey.aws.elasticbeanstalk.-2010-12-01/describe-application-versions-message (portkey.aws/json-keys :req-un [] :opt-un [:portkey.aws.elasticbeanstalk.-2010-12-01/ApplicationName :portkey.aws.elasticbeanstalk.-2010-12-01.describe-application-versions-message/VersionLabels :portkey.aws.elasticbeanstalk.-2010-12-01/MaxRecords :portkey.aws.elasticbeanstalk.-2010-12-01.describe-application-versions-message/NextToken] :locations {}))

(clojure.spec.alpha/def :portkey.aws.elasticbeanstalk.-2010-12-01/option-restriction-min-value clojure.core/int?)

(clojure.spec.alpha/def :portkey.aws.elasticbeanstalk.-2010-12-01.status-codes/status2xx (clojure.spec.alpha/and :portkey.aws.elasticbeanstalk.-2010-12-01/nullable-integer))
(clojure.spec.alpha/def :portkey.aws.elasticbeanstalk.-2010-12-01.status-codes/status3xx (clojure.spec.alpha/and :portkey.aws.elasticbeanstalk.-2010-12-01/nullable-integer))
(clojure.spec.alpha/def :portkey.aws.elasticbeanstalk.-2010-12-01.status-codes/status4xx (clojure.spec.alpha/and :portkey.aws.elasticbeanstalk.-2010-12-01/nullable-integer))
(clojure.spec.alpha/def :portkey.aws.elasticbeanstalk.-2010-12-01.status-codes/status5xx (clojure.spec.alpha/and :portkey.aws.elasticbeanstalk.-2010-12-01/nullable-integer))
(clojure.spec.alpha/def :portkey.aws.elasticbeanstalk.-2010-12-01/status-codes (portkey.aws/json-keys :req-un [] :opt-un [:portkey.aws.elasticbeanstalk.-2010-12-01.status-codes/Status2xx :portkey.aws.elasticbeanstalk.-2010-12-01.status-codes/Status3xx :portkey.aws.elasticbeanstalk.-2010-12-01.status-codes/Status4xx :portkey.aws.elasticbeanstalk.-2010-12-01.status-codes/Status5xx] :locations {}))

(clojure.spec.alpha/def :portkey.aws.elasticbeanstalk.-2010-12-01.terminate-environment-message/terminate-resources (clojure.spec.alpha/and :portkey.aws.elasticbeanstalk.-2010-12-01/terminate-environment-resources))
(clojure.spec.alpha/def :portkey.aws.elasticbeanstalk.-2010-12-01/terminate-environment-message (portkey.aws/json-keys :req-un [] :opt-un [:portkey.aws.elasticbeanstalk.-2010-12-01/EnvironmentId :portkey.aws.elasticbeanstalk.-2010-12-01/EnvironmentName :portkey.aws.elasticbeanstalk.-2010-12-01.terminate-environment-message/TerminateResources :portkey.aws.elasticbeanstalk.-2010-12-01/ForceTerminate] :locations {}))

(clojure.spec.alpha/def :portkey.aws.elasticbeanstalk.-2010-12-01/deployment-timestamp clojure.core/inst?)

(clojure.spec.alpha/def :portkey.aws.elasticbeanstalk.-2010-12-01/update-date clojure.core/inst?)

(clojure.spec.alpha/def :portkey.aws.elasticbeanstalk.-2010-12-01/compose-environments-message (portkey.aws/json-keys :req-un [] :opt-un [:portkey.aws.elasticbeanstalk.-2010-12-01/ApplicationName :portkey.aws.elasticbeanstalk.-2010-12-01/GroupName :portkey.aws.elasticbeanstalk.-2010-12-01/VersionLabels] :locations {}))

(clojure.spec.alpha/def :portkey.aws.elasticbeanstalk.-2010-12-01.listener/protocol (clojure.spec.alpha/and :portkey.aws.elasticbeanstalk.-2010-12-01/string))
(clojure.spec.alpha/def :portkey.aws.elasticbeanstalk.-2010-12-01.listener/port (clojure.spec.alpha/and :portkey.aws.elasticbeanstalk.-2010-12-01/integer))
(clojure.spec.alpha/def :portkey.aws.elasticbeanstalk.-2010-12-01/listener (portkey.aws/json-keys :req-un [] :opt-un [:portkey.aws.elasticbeanstalk.-2010-12-01.listener/Protocol :portkey.aws.elasticbeanstalk.-2010-12-01.listener/Port] :locations {}))

(clojure.spec.alpha/def :portkey.aws.elasticbeanstalk.-2010-12-01/s3-key (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__36227__auto__] (clojure.core/< (clojure.core/count s__36227__auto__) 1024))))

(clojure.spec.alpha/def :portkey.aws.elasticbeanstalk.-2010-12-01/configuration-option-possible-value (clojure.spec.alpha/and clojure.core/string?))

(clojure.spec.alpha/def :portkey.aws.elasticbeanstalk.-2010-12-01/platform-summary-list (clojure.spec.alpha/coll-of :portkey.aws.elasticbeanstalk.-2010-12-01/platform-summary))

(clojure.spec.alpha/def :portkey.aws.elasticbeanstalk.-2010-12-01/failure-type {"InvalidEnvironmentState" "InvalidEnvironmentState", :rollback-failed "RollbackFailed", :update-cancelled "UpdateCancelled", "RollbackSuccessful" "RollbackSuccessful", "UpdateCancelled" "UpdateCancelled", :permissions-error "PermissionsError", "RollbackFailed" "RollbackFailed", :internal-failure "InternalFailure", "CancellationFailed" "CancellationFailed", :rollback-successful "RollbackSuccessful", "InternalFailure" "InternalFailure", :cancellation-failed "CancellationFailed", "PermissionsError" "PermissionsError", :invalid-environment-state "InvalidEnvironmentState"})

(clojure.spec.alpha/def :portkey.aws.elasticbeanstalk.-2010-12-01/update-application-version-message (portkey.aws/json-keys :req-un [:portkey.aws.elasticbeanstalk.-2010-12-01/ApplicationName :portkey.aws.elasticbeanstalk.-2010-12-01/VersionLabel] :opt-un [:portkey.aws.elasticbeanstalk.-2010-12-01/Description] :locations {}))

(clojure.spec.alpha/def :portkey.aws.elasticbeanstalk.-2010-12-01.platform-description/date-updated (clojure.spec.alpha/and :portkey.aws.elasticbeanstalk.-2010-12-01/update-date))
(clojure.spec.alpha/def :portkey.aws.elasticbeanstalk.-2010-12-01.platform-description/programming-languages (clojure.spec.alpha/and :portkey.aws.elasticbeanstalk.-2010-12-01/platform-programming-languages))
(clojure.spec.alpha/def :portkey.aws.elasticbeanstalk.-2010-12-01.platform-description/date-created (clojure.spec.alpha/and :portkey.aws.elasticbeanstalk.-2010-12-01/creation-date))
(clojure.spec.alpha/def :portkey.aws.elasticbeanstalk.-2010-12-01.platform-description/frameworks (clojure.spec.alpha/and :portkey.aws.elasticbeanstalk.-2010-12-01/platform-frameworks))
(clojure.spec.alpha/def :portkey.aws.elasticbeanstalk.-2010-12-01/platform-description (portkey.aws/json-keys :req-un [] :opt-un [:portkey.aws.elasticbeanstalk.-2010-12-01/SolutionStackName :portkey.aws.elasticbeanstalk.-2010-12-01/PlatformName :portkey.aws.elasticbeanstalk.-2010-12-01/SupportedAddonList :portkey.aws.elasticbeanstalk.-2010-12-01/OperatingSystemName :portkey.aws.elasticbeanstalk.-2010-12-01.platform-description/DateUpdated :portkey.aws.elasticbeanstalk.-2010-12-01/SupportedTierList :portkey.aws.elasticbeanstalk.-2010-12-01/PlatformCategory :portkey.aws.elasticbeanstalk.-2010-12-01.platform-description/ProgrammingLanguages :portkey.aws.elasticbeanstalk.-2010-12-01/PlatformOwner :portkey.aws.elasticbeanstalk.-2010-12-01.platform-description/DateCreated :portkey.aws.elasticbeanstalk.-2010-12-01/Maintainer :portkey.aws.elasticbeanstalk.-2010-12-01/Description :portkey.aws.elasticbeanstalk.-2010-12-01/PlatformVersion :portkey.aws.elasticbeanstalk.-2010-12-01/OperatingSystemVersion :portkey.aws.elasticbeanstalk.-2010-12-01/PlatformStatus :portkey.aws.elasticbeanstalk.-2010-12-01/PlatformArn :portkey.aws.elasticbeanstalk.-2010-12-01.platform-description/Frameworks :portkey.aws.elasticbeanstalk.-2010-12-01/CustomAmiList] :locations {}))

(clojure.spec.alpha/def :portkey.aws.elasticbeanstalk.-2010-12-01/configuration-settings-description-list (clojure.spec.alpha/coll-of :portkey.aws.elasticbeanstalk.-2010-12-01/configuration-settings-description))

(clojure.spec.alpha/def :portkey.aws.elasticbeanstalk.-2010-12-01.event-description/severity (clojure.spec.alpha/and :portkey.aws.elasticbeanstalk.-2010-12-01/event-severity))
(clojure.spec.alpha/def :portkey.aws.elasticbeanstalk.-2010-12-01.event-description/message (clojure.spec.alpha/and :portkey.aws.elasticbeanstalk.-2010-12-01/event-message))
(clojure.spec.alpha/def :portkey.aws.elasticbeanstalk.-2010-12-01.event-description/template-name (clojure.spec.alpha/and :portkey.aws.elasticbeanstalk.-2010-12-01/configuration-template-name))
(clojure.spec.alpha/def :portkey.aws.elasticbeanstalk.-2010-12-01/event-description (portkey.aws/json-keys :req-un [] :opt-un [:portkey.aws.elasticbeanstalk.-2010-12-01/VersionLabel :portkey.aws.elasticbeanstalk.-2010-12-01.event-description/Severity :portkey.aws.elasticbeanstalk.-2010-12-01/RequestId :portkey.aws.elasticbeanstalk.-2010-12-01/EnvironmentName :portkey.aws.elasticbeanstalk.-2010-12-01.event-description/Message :portkey.aws.elasticbeanstalk.-2010-12-01/ApplicationName :portkey.aws.elasticbeanstalk.-2010-12-01/EventDate :portkey.aws.elasticbeanstalk.-2010-12-01.event-description/TemplateName :portkey.aws.elasticbeanstalk.-2010-12-01/PlatformArn] :locations {}))

(clojure.spec.alpha/def :portkey.aws.elasticbeanstalk.-2010-12-01/s3-location (portkey.aws/json-keys :req-un [] :opt-un [:portkey.aws.elasticbeanstalk.-2010-12-01/S3Bucket :portkey.aws.elasticbeanstalk.-2010-12-01/S3Key] :locations {}))

(clojure.spec.alpha/def :portkey.aws.elasticbeanstalk.-2010-12-01/managed-action-history-items (clojure.spec.alpha/coll-of :portkey.aws.elasticbeanstalk.-2010-12-01/managed-action-history-item :min-count 1 :max-count 100))

(clojure.spec.alpha/def :portkey.aws.elasticbeanstalk.-2010-12-01/instance-list (clojure.spec.alpha/coll-of :portkey.aws.elasticbeanstalk.-2010-12-01/instance))

(clojure.spec.alpha/def :portkey.aws.elasticbeanstalk.-2010-12-01.configuration-settings-validation-messages/messages (clojure.spec.alpha/and :portkey.aws.elasticbeanstalk.-2010-12-01/validation-messages-list))
(clojure.spec.alpha/def :portkey.aws.elasticbeanstalk.-2010-12-01/configuration-settings-validation-messages (portkey.aws/json-keys :req-un [] :opt-un [:portkey.aws.elasticbeanstalk.-2010-12-01.configuration-settings-validation-messages/Messages] :locations {}))

(clojure.spec.alpha/def :portkey.aws.elasticbeanstalk.-2010-12-01.max-age-rule/enabled (clojure.spec.alpha/and :portkey.aws.elasticbeanstalk.-2010-12-01/boxed-boolean))
(clojure.spec.alpha/def :portkey.aws.elasticbeanstalk.-2010-12-01.max-age-rule/max-age-in-days (clojure.spec.alpha/and :portkey.aws.elasticbeanstalk.-2010-12-01/boxed-int))
(clojure.spec.alpha/def :portkey.aws.elasticbeanstalk.-2010-12-01.max-age-rule/delete-source-froms3 (clojure.spec.alpha/and :portkey.aws.elasticbeanstalk.-2010-12-01/boxed-boolean))
(clojure.spec.alpha/def :portkey.aws.elasticbeanstalk.-2010-12-01/max-age-rule (portkey.aws/json-keys :req-un [:portkey.aws.elasticbeanstalk.-2010-12-01.max-age-rule/Enabled] :opt-un [:portkey.aws.elasticbeanstalk.-2010-12-01.max-age-rule/MaxAgeInDays :portkey.aws.elasticbeanstalk.-2010-12-01.max-age-rule/DeleteSourceFromS3] :locations {}))

(clojure.spec.alpha/def :portkey.aws.elasticbeanstalk.-2010-12-01/s3-bucket (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__36227__auto__] (clojure.core/< (clojure.core/count s__36227__auto__) 255))))

(clojure.spec.alpha/def :portkey.aws.elasticbeanstalk.-2010-12-01.validate-configuration-settings-message/template-name (clojure.spec.alpha/and :portkey.aws.elasticbeanstalk.-2010-12-01/configuration-template-name))
(clojure.spec.alpha/def :portkey.aws.elasticbeanstalk.-2010-12-01.validate-configuration-settings-message/option-settings (clojure.spec.alpha/and :portkey.aws.elasticbeanstalk.-2010-12-01/configuration-option-settings-list))
(clojure.spec.alpha/def :portkey.aws.elasticbeanstalk.-2010-12-01/validate-configuration-settings-message (portkey.aws/json-keys :req-un [:portkey.aws.elasticbeanstalk.-2010-12-01/ApplicationName :portkey.aws.elasticbeanstalk.-2010-12-01.validate-configuration-settings-message/OptionSettings] :opt-un [:portkey.aws.elasticbeanstalk.-2010-12-01.validate-configuration-settings-message/TemplateName :portkey.aws.elasticbeanstalk.-2010-12-01/EnvironmentName] :locations {}))

(clojure.spec.alpha/def :portkey.aws.elasticbeanstalk.-2010-12-01/refreshed-at clojure.core/inst?)

(clojure.spec.alpha/def :portkey.aws.elasticbeanstalk.-2010-12-01/source-location (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__36226__auto__] (clojure.core/<= 3 (clojure.core/count s__36226__auto__))) (clojure.core/fn [s__36227__auto__] (clojure.core/< (clojure.core/count s__36227__auto__) 255)) (clojure.core/fn [s__36228__auto__] (clojure.core/re-matches #".+/.+" s__36228__auto__))))

(clojure.spec.alpha/def :portkey.aws.elasticbeanstalk.-2010-12-01.request-environment-info-message/info-type (clojure.spec.alpha/and :portkey.aws.elasticbeanstalk.-2010-12-01/environment-info-type))
(clojure.spec.alpha/def :portkey.aws.elasticbeanstalk.-2010-12-01/request-environment-info-message (portkey.aws/json-keys :req-un [:portkey.aws.elasticbeanstalk.-2010-12-01.request-environment-info-message/InfoType] :opt-un [:portkey.aws.elasticbeanstalk.-2010-12-01/EnvironmentId :portkey.aws.elasticbeanstalk.-2010-12-01/EnvironmentName] :locations {}))

(clojure.spec.alpha/def :portkey.aws.elasticbeanstalk.-2010-12-01/managed-action-invalid-state-exception (portkey.aws/json-keys :req-un [] :opt-un [] :locations {}))

(clojure.spec.alpha/def :portkey.aws.elasticbeanstalk.-2010-12-01/rebuild-environment-message (portkey.aws/json-keys :req-un [] :opt-un [:portkey.aws.elasticbeanstalk.-2010-12-01/EnvironmentId :portkey.aws.elasticbeanstalk.-2010-12-01/EnvironmentName] :locations {}))

(clojure.spec.alpha/def :portkey.aws.elasticbeanstalk.-2010-12-01.cpuutilization/user (clojure.spec.alpha/and :portkey.aws.elasticbeanstalk.-2010-12-01/nullable-double))
(clojure.spec.alpha/def :portkey.aws.elasticbeanstalk.-2010-12-01.cpuutilization/nice (clojure.spec.alpha/and :portkey.aws.elasticbeanstalk.-2010-12-01/nullable-double))
(clojure.spec.alpha/def :portkey.aws.elasticbeanstalk.-2010-12-01.cpuutilization/system (clojure.spec.alpha/and :portkey.aws.elasticbeanstalk.-2010-12-01/nullable-double))
(clojure.spec.alpha/def :portkey.aws.elasticbeanstalk.-2010-12-01.cpuutilization/idle (clojure.spec.alpha/and :portkey.aws.elasticbeanstalk.-2010-12-01/nullable-double))
(clojure.spec.alpha/def :portkey.aws.elasticbeanstalk.-2010-12-01.cpuutilization/iowait (clojure.spec.alpha/and :portkey.aws.elasticbeanstalk.-2010-12-01/nullable-double))
(clojure.spec.alpha/def :portkey.aws.elasticbeanstalk.-2010-12-01.cpuutilization/irq (clojure.spec.alpha/and :portkey.aws.elasticbeanstalk.-2010-12-01/nullable-double))
(clojure.spec.alpha/def :portkey.aws.elasticbeanstalk.-2010-12-01.cpuutilization/softirq (clojure.spec.alpha/and :portkey.aws.elasticbeanstalk.-2010-12-01/nullable-double))
(clojure.spec.alpha/def :portkey.aws.elasticbeanstalk.-2010-12-01/cpuutilization (portkey.aws/json-keys :req-un [] :opt-un [:portkey.aws.elasticbeanstalk.-2010-12-01.cpuutilization/User :portkey.aws.elasticbeanstalk.-2010-12-01.cpuutilization/Nice :portkey.aws.elasticbeanstalk.-2010-12-01.cpuutilization/System :portkey.aws.elasticbeanstalk.-2010-12-01.cpuutilization/Idle :portkey.aws.elasticbeanstalk.-2010-12-01.cpuutilization/IOWait :portkey.aws.elasticbeanstalk.-2010-12-01.cpuutilization/IRQ :portkey.aws.elasticbeanstalk.-2010-12-01.cpuutilization/SoftIRQ] :locations {}))

(clojure.spec.alpha/def :portkey.aws.elasticbeanstalk.-2010-12-01/creation-date clojure.core/inst?)

(clojure.spec.alpha/def :portkey.aws.elasticbeanstalk.-2010-12-01.apply-environment-managed-action-request/environment-name (clojure.spec.alpha/and :portkey.aws.elasticbeanstalk.-2010-12-01/string))
(clojure.spec.alpha/def :portkey.aws.elasticbeanstalk.-2010-12-01.apply-environment-managed-action-request/environment-id (clojure.spec.alpha/and :portkey.aws.elasticbeanstalk.-2010-12-01/string))
(clojure.spec.alpha/def :portkey.aws.elasticbeanstalk.-2010-12-01.apply-environment-managed-action-request/action-id (clojure.spec.alpha/and :portkey.aws.elasticbeanstalk.-2010-12-01/string))
(clojure.spec.alpha/def :portkey.aws.elasticbeanstalk.-2010-12-01/apply-environment-managed-action-request (portkey.aws/json-keys :req-un [:portkey.aws.elasticbeanstalk.-2010-12-01.apply-environment-managed-action-request/ActionId] :opt-un [:portkey.aws.elasticbeanstalk.-2010-12-01.apply-environment-managed-action-request/EnvironmentName :portkey.aws.elasticbeanstalk.-2010-12-01.apply-environment-managed-action-request/EnvironmentId] :locations {}))

(clojure.spec.alpha/def :portkey.aws.elasticbeanstalk.-2010-12-01/platform-filter-operator (clojure.spec.alpha/and clojure.core/string?))

(clojure.spec.alpha/def :portkey.aws.elasticbeanstalk.-2010-12-01.option-restriction-regex/pattern (clojure.spec.alpha/and :portkey.aws.elasticbeanstalk.-2010-12-01/regex-pattern))
(clojure.spec.alpha/def :portkey.aws.elasticbeanstalk.-2010-12-01.option-restriction-regex/label (clojure.spec.alpha/and :portkey.aws.elasticbeanstalk.-2010-12-01/regex-label))
(clojure.spec.alpha/def :portkey.aws.elasticbeanstalk.-2010-12-01/option-restriction-regex (portkey.aws/json-keys :req-un [] :opt-un [:portkey.aws.elasticbeanstalk.-2010-12-01.option-restriction-regex/Pattern :portkey.aws.elasticbeanstalk.-2010-12-01.option-restriction-regex/Label] :locations {}))

(clojure.spec.alpha/def :portkey.aws.elasticbeanstalk.-2010-12-01.load-balancer/name (clojure.spec.alpha/and :portkey.aws.elasticbeanstalk.-2010-12-01/resource-id))
(clojure.spec.alpha/def :portkey.aws.elasticbeanstalk.-2010-12-01/load-balancer (portkey.aws/json-keys :req-un [] :opt-un [:portkey.aws.elasticbeanstalk.-2010-12-01.load-balancer/Name] :locations {}))

(clojure.spec.alpha/def :portkey.aws.elasticbeanstalk.-2010-12-01/option-restriction-max-length clojure.core/int?)

(clojure.spec.alpha/def :portkey.aws.elasticbeanstalk.-2010-12-01/s3-subscription-required-exception (portkey.aws/json-keys :req-un [] :opt-un [] :locations {}))

(clojure.spec.alpha/def :portkey.aws.elasticbeanstalk.-2010-12-01/timestamp clojure.core/inst?)

(clojure.spec.alpha/def :portkey.aws.elasticbeanstalk.-2010-12-01.launch-configuration/name (clojure.spec.alpha/and :portkey.aws.elasticbeanstalk.-2010-12-01/resource-id))
(clojure.spec.alpha/def :portkey.aws.elasticbeanstalk.-2010-12-01/launch-configuration (portkey.aws/json-keys :req-un [] :opt-un [:portkey.aws.elasticbeanstalk.-2010-12-01.launch-configuration/Name] :locations {}))

(clojure.spec.alpha/def :portkey.aws.elasticbeanstalk.-2010-12-01/virtualization-type (clojure.spec.alpha/and clojure.core/string?))

(clojure.spec.alpha/def :portkey.aws.elasticbeanstalk.-2010-12-01/platform-status {:deleted "Deleted", "Failed" "Failed", "Creating" "Creating", :ready "Ready", :creating "Creating", "Ready" "Ready", :deleting "Deleting", "Deleting" "Deleting", "Deleted" "Deleted", :failed "Failed"})

(clojure.spec.alpha/def :portkey.aws.elasticbeanstalk.-2010-12-01/resource-arn (clojure.spec.alpha/and clojure.core/string?))

(clojure.spec.alpha/def :portkey.aws.elasticbeanstalk.-2010-12-01/describe-platform-version-result (portkey.aws/json-keys :req-un [] :opt-un [:portkey.aws.elasticbeanstalk.-2010-12-01/PlatformDescription] :locations {}))

(clojure.spec.alpha/def :portkey.aws.elasticbeanstalk.-2010-12-01.latency/p999 (clojure.spec.alpha/and :portkey.aws.elasticbeanstalk.-2010-12-01/nullable-double))
(clojure.spec.alpha/def :portkey.aws.elasticbeanstalk.-2010-12-01.latency/p99 (clojure.spec.alpha/and :portkey.aws.elasticbeanstalk.-2010-12-01/nullable-double))
(clojure.spec.alpha/def :portkey.aws.elasticbeanstalk.-2010-12-01.latency/p95 (clojure.spec.alpha/and :portkey.aws.elasticbeanstalk.-2010-12-01/nullable-double))
(clojure.spec.alpha/def :portkey.aws.elasticbeanstalk.-2010-12-01.latency/p90 (clojure.spec.alpha/and :portkey.aws.elasticbeanstalk.-2010-12-01/nullable-double))
(clojure.spec.alpha/def :portkey.aws.elasticbeanstalk.-2010-12-01.latency/p85 (clojure.spec.alpha/and :portkey.aws.elasticbeanstalk.-2010-12-01/nullable-double))
(clojure.spec.alpha/def :portkey.aws.elasticbeanstalk.-2010-12-01.latency/p75 (clojure.spec.alpha/and :portkey.aws.elasticbeanstalk.-2010-12-01/nullable-double))
(clojure.spec.alpha/def :portkey.aws.elasticbeanstalk.-2010-12-01.latency/p50 (clojure.spec.alpha/and :portkey.aws.elasticbeanstalk.-2010-12-01/nullable-double))
(clojure.spec.alpha/def :portkey.aws.elasticbeanstalk.-2010-12-01.latency/p10 (clojure.spec.alpha/and :portkey.aws.elasticbeanstalk.-2010-12-01/nullable-double))
(clojure.spec.alpha/def :portkey.aws.elasticbeanstalk.-2010-12-01/latency (portkey.aws/json-keys :req-un [] :opt-un [:portkey.aws.elasticbeanstalk.-2010-12-01.latency/P999 :portkey.aws.elasticbeanstalk.-2010-12-01.latency/P99 :portkey.aws.elasticbeanstalk.-2010-12-01.latency/P95 :portkey.aws.elasticbeanstalk.-2010-12-01.latency/P90 :portkey.aws.elasticbeanstalk.-2010-12-01.latency/P85 :portkey.aws.elasticbeanstalk.-2010-12-01.latency/P75 :portkey.aws.elasticbeanstalk.-2010-12-01.latency/P50 :portkey.aws.elasticbeanstalk.-2010-12-01.latency/P10] :locations {}))

(clojure.spec.alpha/def :portkey.aws.elasticbeanstalk.-2010-12-01/configuration-option-possible-values (clojure.spec.alpha/coll-of :portkey.aws.elasticbeanstalk.-2010-12-01/configuration-option-possible-value))

(clojure.spec.alpha/def :portkey.aws.elasticbeanstalk.-2010-12-01.describe-applications-message/application-names (clojure.spec.alpha/and :portkey.aws.elasticbeanstalk.-2010-12-01/application-names-list))
(clojure.spec.alpha/def :portkey.aws.elasticbeanstalk.-2010-12-01/describe-applications-message (portkey.aws/json-keys :req-un [] :opt-un [:portkey.aws.elasticbeanstalk.-2010-12-01.describe-applications-message/ApplicationNames] :locations {}))

(clojure.spec.alpha/def :portkey.aws.elasticbeanstalk.-2010-12-01.create-application-version-message/source-bundle (clojure.spec.alpha/and :portkey.aws.elasticbeanstalk.-2010-12-01/s3-location))
(clojure.spec.alpha/def :portkey.aws.elasticbeanstalk.-2010-12-01.create-application-version-message/process (clojure.spec.alpha/and :portkey.aws.elasticbeanstalk.-2010-12-01/application-version-proccess))
(clojure.spec.alpha/def :portkey.aws.elasticbeanstalk.-2010-12-01/create-application-version-message (portkey.aws/json-keys :req-un [:portkey.aws.elasticbeanstalk.-2010-12-01/ApplicationName :portkey.aws.elasticbeanstalk.-2010-12-01/VersionLabel] :opt-un [:portkey.aws.elasticbeanstalk.-2010-12-01/Description :portkey.aws.elasticbeanstalk.-2010-12-01/SourceBuildInformation :portkey.aws.elasticbeanstalk.-2010-12-01.create-application-version-message/SourceBundle :portkey.aws.elasticbeanstalk.-2010-12-01/BuildConfiguration :portkey.aws.elasticbeanstalk.-2010-12-01/AutoCreateApplication :portkey.aws.elasticbeanstalk.-2010-12-01.create-application-version-message/Process] :locations {}))

(clojure.spec.alpha/def :portkey.aws.elasticbeanstalk.-2010-12-01/describe-environment-managed-actions-result (portkey.aws/json-keys :req-un [] :opt-un [:portkey.aws.elasticbeanstalk.-2010-12-01/ManagedActions] :locations {}))

(clojure.spec.alpha/def :portkey.aws.elasticbeanstalk.-2010-12-01/platform-arn (clojure.spec.alpha/and clojure.core/string?))

(clojure.spec.alpha/def :portkey.aws.elasticbeanstalk.-2010-12-01/ec2-instance-id (clojure.spec.alpha/and clojure.core/string?))

(clojure.spec.alpha/def :portkey.aws.elasticbeanstalk.-2010-12-01.tag/key (clojure.spec.alpha/and :portkey.aws.elasticbeanstalk.-2010-12-01/tag-key))
(clojure.spec.alpha/def :portkey.aws.elasticbeanstalk.-2010-12-01.tag/value (clojure.spec.alpha/and :portkey.aws.elasticbeanstalk.-2010-12-01/tag-value))
(clojure.spec.alpha/def :portkey.aws.elasticbeanstalk.-2010-12-01/tag (portkey.aws/json-keys :req-un [] :opt-un [:portkey.aws.elasticbeanstalk.-2010-12-01.tag/Key :portkey.aws.elasticbeanstalk.-2010-12-01.tag/Value] :locations {}))

(clojure.spec.alpha/def :portkey.aws.elasticbeanstalk.-2010-12-01/solution-stack-file-type-list (clojure.spec.alpha/coll-of :portkey.aws.elasticbeanstalk.-2010-12-01/file-type-extension))

(clojure.spec.alpha/def :portkey.aws.elasticbeanstalk.-2010-12-01/platform-version-still-referenced-exception (portkey.aws/json-keys :req-un [] :opt-un [] :locations {}))

(clojure.spec.alpha/def :portkey.aws.elasticbeanstalk.-2010-12-01/environment-links (clojure.spec.alpha/coll-of :portkey.aws.elasticbeanstalk.-2010-12-01/environment-link))

(clojure.spec.alpha/def :portkey.aws.elasticbeanstalk.-2010-12-01/compute-type {"BUILD_GENERAL1_SMALL" "BUILD_GENERAL1_SMALL", :build-general1-small "BUILD_GENERAL1_SMALL", "BUILD_GENERAL1_MEDIUM" "BUILD_GENERAL1_MEDIUM", :build-general1-medium "BUILD_GENERAL1_MEDIUM", "BUILD_GENERAL1_LARGE" "BUILD_GENERAL1_LARGE", :build-general1-large "BUILD_GENERAL1_LARGE"})

(clojure.spec.alpha/def :portkey.aws.elasticbeanstalk.-2010-12-01/application-version-proccess clojure.core/boolean?)

(clojure.spec.alpha/def :portkey.aws.elasticbeanstalk.-2010-12-01/list-tags-for-resource-message (portkey.aws/json-keys :req-un [:portkey.aws.elasticbeanstalk.-2010-12-01/ResourceArn] :opt-un [] :locations {}))

(clojure.spec.alpha/def :portkey.aws.elasticbeanstalk.-2010-12-01/nullable-integer clojure.core/int?)

(clojure.spec.alpha/def :portkey.aws.elasticbeanstalk.-2010-12-01.instance/id (clojure.spec.alpha/and :portkey.aws.elasticbeanstalk.-2010-12-01/resource-id))
(clojure.spec.alpha/def :portkey.aws.elasticbeanstalk.-2010-12-01/instance (portkey.aws/json-keys :req-un [] :opt-un [:portkey.aws.elasticbeanstalk.-2010-12-01.instance/Id] :locations {}))

(clojure.spec.alpha/def :portkey.aws.elasticbeanstalk.-2010-12-01/configuration-option-descriptions-list (clojure.spec.alpha/coll-of :portkey.aws.elasticbeanstalk.-2010-12-01/configuration-option-description))

(clojure.spec.alpha/def :portkey.aws.elasticbeanstalk.-2010-12-01/event-description-list (clojure.spec.alpha/coll-of :portkey.aws.elasticbeanstalk.-2010-12-01/event-description))

(clojure.spec.alpha/def :portkey.aws.elasticbeanstalk.-2010-12-01/version-labels (clojure.spec.alpha/coll-of :portkey.aws.elasticbeanstalk.-2010-12-01/version-label))

(clojure.spec.alpha/def :portkey.aws.elasticbeanstalk.-2010-12-01/load-average (clojure.spec.alpha/coll-of :portkey.aws.elasticbeanstalk.-2010-12-01/load-average-value))

(clojure.spec.alpha/def :portkey.aws.elasticbeanstalk.-2010-12-01/s3-location-not-in-service-region-exception (portkey.aws/json-keys :req-un [] :opt-un [] :locations {}))

(clojure.spec.alpha/def :portkey.aws.elasticbeanstalk.-2010-12-01/action-type {"InstanceRefresh" "InstanceRefresh", :instance-refresh "InstanceRefresh", "PlatformUpdate" "PlatformUpdate", :platform-update "PlatformUpdate", "Unknown" "Unknown", :unknown "Unknown"})

(clojure.spec.alpha/def :portkey.aws.elasticbeanstalk.-2010-12-01.application-version-description/source-bundle (clojure.spec.alpha/and :portkey.aws.elasticbeanstalk.-2010-12-01/s3-location))
(clojure.spec.alpha/def :portkey.aws.elasticbeanstalk.-2010-12-01.application-version-description/date-updated (clojure.spec.alpha/and :portkey.aws.elasticbeanstalk.-2010-12-01/update-date))
(clojure.spec.alpha/def :portkey.aws.elasticbeanstalk.-2010-12-01.application-version-description/build-arn (clojure.spec.alpha/and :portkey.aws.elasticbeanstalk.-2010-12-01/string))
(clojure.spec.alpha/def :portkey.aws.elasticbeanstalk.-2010-12-01.application-version-description/status (clojure.spec.alpha/and :portkey.aws.elasticbeanstalk.-2010-12-01/application-version-status))
(clojure.spec.alpha/def :portkey.aws.elasticbeanstalk.-2010-12-01.application-version-description/date-created (clojure.spec.alpha/and :portkey.aws.elasticbeanstalk.-2010-12-01/creation-date))
(clojure.spec.alpha/def :portkey.aws.elasticbeanstalk.-2010-12-01/application-version-description (portkey.aws/json-keys :req-un [] :opt-un [:portkey.aws.elasticbeanstalk.-2010-12-01/VersionLabel :portkey.aws.elasticbeanstalk.-2010-12-01/ApplicationVersionArn :portkey.aws.elasticbeanstalk.-2010-12-01.application-version-description/SourceBundle :portkey.aws.elasticbeanstalk.-2010-12-01.application-version-description/DateUpdated :portkey.aws.elasticbeanstalk.-2010-12-01.application-version-description/BuildArn :portkey.aws.elasticbeanstalk.-2010-12-01.application-version-description/Status :portkey.aws.elasticbeanstalk.-2010-12-01.application-version-description/DateCreated :portkey.aws.elasticbeanstalk.-2010-12-01/Description :portkey.aws.elasticbeanstalk.-2010-12-01/ApplicationName :portkey.aws.elasticbeanstalk.-2010-12-01/SourceBuildInformation] :locations {}))

(clojure.spec.alpha/def :portkey.aws.elasticbeanstalk.-2010-12-01/application-description-list (clojure.spec.alpha/coll-of :portkey.aws.elasticbeanstalk.-2010-12-01/application-description))

(clojure.spec.alpha/def :portkey.aws.elasticbeanstalk.-2010-12-01/configuration-option-default-value (clojure.spec.alpha/and clojure.core/string?))

(clojure.spec.alpha/def :portkey.aws.elasticbeanstalk.-2010-12-01.configuration-settings-description/date-updated (clojure.spec.alpha/and :portkey.aws.elasticbeanstalk.-2010-12-01/update-date))
(clojure.spec.alpha/def :portkey.aws.elasticbeanstalk.-2010-12-01.configuration-settings-description/option-settings (clojure.spec.alpha/and :portkey.aws.elasticbeanstalk.-2010-12-01/configuration-option-settings-list))
(clojure.spec.alpha/def :portkey.aws.elasticbeanstalk.-2010-12-01.configuration-settings-description/date-created (clojure.spec.alpha/and :portkey.aws.elasticbeanstalk.-2010-12-01/creation-date))
(clojure.spec.alpha/def :portkey.aws.elasticbeanstalk.-2010-12-01.configuration-settings-description/template-name (clojure.spec.alpha/and :portkey.aws.elasticbeanstalk.-2010-12-01/configuration-template-name))
(clojure.spec.alpha/def :portkey.aws.elasticbeanstalk.-2010-12-01.configuration-settings-description/deployment-status (clojure.spec.alpha/and :portkey.aws.elasticbeanstalk.-2010-12-01/configuration-deployment-status))
(clojure.spec.alpha/def :portkey.aws.elasticbeanstalk.-2010-12-01/configuration-settings-description (portkey.aws/json-keys :req-un [] :opt-un [:portkey.aws.elasticbeanstalk.-2010-12-01/SolutionStackName :portkey.aws.elasticbeanstalk.-2010-12-01.configuration-settings-description/DateUpdated :portkey.aws.elasticbeanstalk.-2010-12-01/EnvironmentName :portkey.aws.elasticbeanstalk.-2010-12-01.configuration-settings-description/OptionSettings :portkey.aws.elasticbeanstalk.-2010-12-01.configuration-settings-description/DateCreated :portkey.aws.elasticbeanstalk.-2010-12-01/Description :portkey.aws.elasticbeanstalk.-2010-12-01/ApplicationName :portkey.aws.elasticbeanstalk.-2010-12-01.configuration-settings-description/TemplateName :portkey.aws.elasticbeanstalk.-2010-12-01.configuration-settings-description/DeploymentStatus :portkey.aws.elasticbeanstalk.-2010-12-01/PlatformArn] :locations {}))

(clojure.spec.alpha/def :portkey.aws.elasticbeanstalk.-2010-12-01/configuration-deployment-status {"deployed" "deployed", :deployed "deployed", "pending" "pending", :pending "pending", "failed" "failed", :failed "failed"})

(clojure.spec.alpha/def :portkey.aws.elasticbeanstalk.-2010-12-01.environment-resources-description/load-balancer (clojure.spec.alpha/and :portkey.aws.elasticbeanstalk.-2010-12-01/load-balancer-description))
(clojure.spec.alpha/def :portkey.aws.elasticbeanstalk.-2010-12-01/environment-resources-description (portkey.aws/json-keys :req-un [] :opt-un [:portkey.aws.elasticbeanstalk.-2010-12-01.environment-resources-description/LoadBalancer] :locations {}))

(clojure.spec.alpha/def :portkey.aws.elasticbeanstalk.-2010-12-01.application-description/date-created (clojure.spec.alpha/and :portkey.aws.elasticbeanstalk.-2010-12-01/creation-date))
(clojure.spec.alpha/def :portkey.aws.elasticbeanstalk.-2010-12-01.application-description/date-updated (clojure.spec.alpha/and :portkey.aws.elasticbeanstalk.-2010-12-01/update-date))
(clojure.spec.alpha/def :portkey.aws.elasticbeanstalk.-2010-12-01.application-description/versions (clojure.spec.alpha/and :portkey.aws.elasticbeanstalk.-2010-12-01/version-labels-list))
(clojure.spec.alpha/def :portkey.aws.elasticbeanstalk.-2010-12-01.application-description/configuration-templates (clojure.spec.alpha/and :portkey.aws.elasticbeanstalk.-2010-12-01/configuration-template-names-list))
(clojure.spec.alpha/def :portkey.aws.elasticbeanstalk.-2010-12-01.application-description/resource-lifecycle-config (clojure.spec.alpha/and :portkey.aws.elasticbeanstalk.-2010-12-01/application-resource-lifecycle-config))
(clojure.spec.alpha/def :portkey.aws.elasticbeanstalk.-2010-12-01/application-description (portkey.aws/json-keys :req-un [] :opt-un [:portkey.aws.elasticbeanstalk.-2010-12-01/ApplicationArn :portkey.aws.elasticbeanstalk.-2010-12-01/ApplicationName :portkey.aws.elasticbeanstalk.-2010-12-01/Description :portkey.aws.elasticbeanstalk.-2010-12-01.application-description/DateCreated :portkey.aws.elasticbeanstalk.-2010-12-01.application-description/DateUpdated :portkey.aws.elasticbeanstalk.-2010-12-01.application-description/Versions :portkey.aws.elasticbeanstalk.-2010-12-01.application-description/ConfigurationTemplates :portkey.aws.elasticbeanstalk.-2010-12-01.application-description/ResourceLifecycleConfig] :locations {}))

(clojure.spec.alpha/def :portkey.aws.elasticbeanstalk.-2010-12-01/environment-id (clojure.spec.alpha/and clojure.core/string?))

(clojure.spec.alpha/def :portkey.aws.elasticbeanstalk.-2010-12-01/source-build-information (portkey.aws/json-keys :req-un [:portkey.aws.elasticbeanstalk.-2010-12-01/SourceType :portkey.aws.elasticbeanstalk.-2010-12-01/SourceRepository :portkey.aws.elasticbeanstalk.-2010-12-01/SourceLocation] :opt-un [] :locations {}))

(clojure.spec.alpha/def :portkey.aws.elasticbeanstalk.-2010-12-01/nullable-double clojure.core/double?)

(clojure.spec.alpha/def :portkey.aws.elasticbeanstalk.-2010-12-01.environment-description/tier (clojure.spec.alpha/and :portkey.aws.elasticbeanstalk.-2010-12-01/environment-tier))
(clojure.spec.alpha/def :portkey.aws.elasticbeanstalk.-2010-12-01.environment-description/health (clojure.spec.alpha/and :portkey.aws.elasticbeanstalk.-2010-12-01/environment-health))
(clojure.spec.alpha/def :portkey.aws.elasticbeanstalk.-2010-12-01.environment-description/cname (clojure.spec.alpha/and :portkey.aws.elasticbeanstalk.-2010-12-01/dnscname))
(clojure.spec.alpha/def :portkey.aws.elasticbeanstalk.-2010-12-01.environment-description/date-updated (clojure.spec.alpha/and :portkey.aws.elasticbeanstalk.-2010-12-01/update-date))
(clojure.spec.alpha/def :portkey.aws.elasticbeanstalk.-2010-12-01.environment-description/health-status (clojure.spec.alpha/and :portkey.aws.elasticbeanstalk.-2010-12-01/environment-health-status))
(clojure.spec.alpha/def :portkey.aws.elasticbeanstalk.-2010-12-01.environment-description/status (clojure.spec.alpha/and :portkey.aws.elasticbeanstalk.-2010-12-01/environment-status))
(clojure.spec.alpha/def :portkey.aws.elasticbeanstalk.-2010-12-01.environment-description/date-created (clojure.spec.alpha/and :portkey.aws.elasticbeanstalk.-2010-12-01/creation-date))
(clojure.spec.alpha/def :portkey.aws.elasticbeanstalk.-2010-12-01.environment-description/resources (clojure.spec.alpha/and :portkey.aws.elasticbeanstalk.-2010-12-01/environment-resources-description))
(clojure.spec.alpha/def :portkey.aws.elasticbeanstalk.-2010-12-01.environment-description/template-name (clojure.spec.alpha/and :portkey.aws.elasticbeanstalk.-2010-12-01/configuration-template-name))
(clojure.spec.alpha/def :portkey.aws.elasticbeanstalk.-2010-12-01/environment-description (portkey.aws/json-keys :req-un [] :opt-un [:portkey.aws.elasticbeanstalk.-2010-12-01/VersionLabel :portkey.aws.elasticbeanstalk.-2010-12-01.environment-description/Tier :portkey.aws.elasticbeanstalk.-2010-12-01.environment-description/Health :portkey.aws.elasticbeanstalk.-2010-12-01/SolutionStackName :portkey.aws.elasticbeanstalk.-2010-12-01.environment-description/CNAME :portkey.aws.elasticbeanstalk.-2010-12-01.environment-description/DateUpdated :portkey.aws.elasticbeanstalk.-2010-12-01/EnvironmentName :portkey.aws.elasticbeanstalk.-2010-12-01.environment-description/HealthStatus :portkey.aws.elasticbeanstalk.-2010-12-01.environment-description/Status :portkey.aws.elasticbeanstalk.-2010-12-01/EnvironmentArn :portkey.aws.elasticbeanstalk.-2010-12-01/AbortableOperationInProgress :portkey.aws.elasticbeanstalk.-2010-12-01.environment-description/DateCreated :portkey.aws.elasticbeanstalk.-2010-12-01/Description :portkey.aws.elasticbeanstalk.-2010-12-01/EndpointURL :portkey.aws.elasticbeanstalk.-2010-12-01.environment-description/Resources :portkey.aws.elasticbeanstalk.-2010-12-01/ApplicationName :portkey.aws.elasticbeanstalk.-2010-12-01.environment-description/TemplateName :portkey.aws.elasticbeanstalk.-2010-12-01/PlatformArn :portkey.aws.elasticbeanstalk.-2010-12-01/EnvironmentLinks :portkey.aws.elasticbeanstalk.-2010-12-01/EnvironmentId] :locations {}))

(clojure.spec.alpha/def :portkey.aws.elasticbeanstalk.-2010-12-01/configuration-template-name (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__36226__auto__] (clojure.core/<= 1 (clojure.core/count s__36226__auto__))) (clojure.core/fn [s__36227__auto__] (clojure.core/< (clojure.core/count s__36227__auto__) 100))))

(clojure.spec.alpha/def :portkey.aws.elasticbeanstalk.-2010-12-01/force-terminate clojure.core/boolean?)

(clojure.spec.alpha/def :portkey.aws.elasticbeanstalk.-2010-12-01/delete-platform-version-result (portkey.aws/json-keys :req-un [] :opt-un [:portkey.aws.elasticbeanstalk.-2010-12-01/PlatformSummary] :locations {}))

(clojure.spec.alpha/def :portkey.aws.elasticbeanstalk.-2010-12-01/load-balancer-listeners-description (clojure.spec.alpha/coll-of :portkey.aws.elasticbeanstalk.-2010-12-01/listener))

(clojure.spec.alpha/def :portkey.aws.elasticbeanstalk.-2010-12-01/resource-type-not-supported-exception (portkey.aws/json-keys :req-un [] :opt-un [] :locations {}))

(clojure.spec.alpha/def :portkey.aws.elasticbeanstalk.-2010-12-01/abort-environment-update-message (portkey.aws/json-keys :req-un [] :opt-un [:portkey.aws.elasticbeanstalk.-2010-12-01/EnvironmentId :portkey.aws.elasticbeanstalk.-2010-12-01/EnvironmentName] :locations {}))

(clojure.spec.alpha/def :portkey.aws.elasticbeanstalk.-2010-12-01.create-platform-version-request/platform-definition-bundle (clojure.spec.alpha/and :portkey.aws.elasticbeanstalk.-2010-12-01/s3-location))
(clojure.spec.alpha/def :portkey.aws.elasticbeanstalk.-2010-12-01.create-platform-version-request/option-settings (clojure.spec.alpha/and :portkey.aws.elasticbeanstalk.-2010-12-01/configuration-option-settings-list))
(clojure.spec.alpha/def :portkey.aws.elasticbeanstalk.-2010-12-01/create-platform-version-request (portkey.aws/json-keys :req-un [:portkey.aws.elasticbeanstalk.-2010-12-01/PlatformName :portkey.aws.elasticbeanstalk.-2010-12-01/PlatformVersion :portkey.aws.elasticbeanstalk.-2010-12-01.create-platform-version-request/PlatformDefinitionBundle] :opt-un [:portkey.aws.elasticbeanstalk.-2010-12-01/EnvironmentName :portkey.aws.elasticbeanstalk.-2010-12-01.create-platform-version-request/OptionSettings] :locations {}))

(clojure.spec.alpha/def :portkey.aws.elasticbeanstalk.-2010-12-01/available-solution-stack-names-list (clojure.spec.alpha/coll-of :portkey.aws.elasticbeanstalk.-2010-12-01/solution-stack-name))

(clojure.spec.alpha/def :portkey.aws.elasticbeanstalk.-2010-12-01/token (clojure.spec.alpha/and clojure.core/string?))

(clojure.spec.alpha/def :portkey.aws.elasticbeanstalk.-2010-12-01/configuration-option-value (clojure.spec.alpha/and clojure.core/string?))

(clojure.spec.alpha/def :portkey.aws.elasticbeanstalk.-2010-12-01.platform-programming-language/name (clojure.spec.alpha/and :portkey.aws.elasticbeanstalk.-2010-12-01/string))
(clojure.spec.alpha/def :portkey.aws.elasticbeanstalk.-2010-12-01.platform-programming-language/version (clojure.spec.alpha/and :portkey.aws.elasticbeanstalk.-2010-12-01/string))
(clojure.spec.alpha/def :portkey.aws.elasticbeanstalk.-2010-12-01/platform-programming-language (portkey.aws/json-keys :req-un [] :opt-un [:portkey.aws.elasticbeanstalk.-2010-12-01.platform-programming-language/Name :portkey.aws.elasticbeanstalk.-2010-12-01.platform-programming-language/Version] :locations {}))

(clojure.spec.alpha/def :portkey.aws.elasticbeanstalk.-2010-12-01/restart-app-server-message (portkey.aws/json-keys :req-un [] :opt-un [:portkey.aws.elasticbeanstalk.-2010-12-01/EnvironmentId :portkey.aws.elasticbeanstalk.-2010-12-01/EnvironmentName] :locations {}))

(clojure.spec.alpha/def :portkey.aws.elasticbeanstalk.-2010-12-01/custom-ami-list (clojure.spec.alpha/coll-of :portkey.aws.elasticbeanstalk.-2010-12-01/custom-ami))

(clojure.spec.alpha/def :portkey.aws.elasticbeanstalk.-2010-12-01/queue-list (clojure.spec.alpha/coll-of :portkey.aws.elasticbeanstalk.-2010-12-01/queue))

(clojure.spec.alpha/def :portkey.aws.elasticbeanstalk.-2010-12-01/environment-health {"Green" "Green", :green "Green", "Yellow" "Yellow", :yellow "Yellow", "Red" "Red", :red "Red", "Grey" "Grey", :grey "Grey"})

(clojure.spec.alpha/def :portkey.aws.elasticbeanstalk.-2010-12-01.environment-info-description/info-type (clojure.spec.alpha/and :portkey.aws.elasticbeanstalk.-2010-12-01/environment-info-type))
(clojure.spec.alpha/def :portkey.aws.elasticbeanstalk.-2010-12-01/environment-info-description (portkey.aws/json-keys :req-un [] :opt-un [:portkey.aws.elasticbeanstalk.-2010-12-01.environment-info-description/InfoType :portkey.aws.elasticbeanstalk.-2010-12-01/Ec2InstanceId :portkey.aws.elasticbeanstalk.-2010-12-01/SampleTimestamp :portkey.aws.elasticbeanstalk.-2010-12-01/Message] :locations {}))

(clojure.spec.alpha/def :portkey.aws.elasticbeanstalk.-2010-12-01.list-platform-versions-request/filters (clojure.spec.alpha/and :portkey.aws.elasticbeanstalk.-2010-12-01/platform-filters))
(clojure.spec.alpha/def :portkey.aws.elasticbeanstalk.-2010-12-01.list-platform-versions-request/max-records (clojure.spec.alpha/and :portkey.aws.elasticbeanstalk.-2010-12-01/platform-max-records))
(clojure.spec.alpha/def :portkey.aws.elasticbeanstalk.-2010-12-01.list-platform-versions-request/next-token (clojure.spec.alpha/and :portkey.aws.elasticbeanstalk.-2010-12-01/token))
(clojure.spec.alpha/def :portkey.aws.elasticbeanstalk.-2010-12-01/list-platform-versions-request (portkey.aws/json-keys :req-un [] :opt-un [:portkey.aws.elasticbeanstalk.-2010-12-01.list-platform-versions-request/Filters :portkey.aws.elasticbeanstalk.-2010-12-01.list-platform-versions-request/MaxRecords :portkey.aws.elasticbeanstalk.-2010-12-01.list-platform-versions-request/NextToken] :locations {}))

(clojure.spec.alpha/def :portkey.aws.elasticbeanstalk.-2010-12-01.list-platform-versions-result/next-token (clojure.spec.alpha/and :portkey.aws.elasticbeanstalk.-2010-12-01/token))
(clojure.spec.alpha/def :portkey.aws.elasticbeanstalk.-2010-12-01/list-platform-versions-result (portkey.aws/json-keys :req-un [] :opt-un [:portkey.aws.elasticbeanstalk.-2010-12-01/PlatformSummaryList :portkey.aws.elasticbeanstalk.-2010-12-01.list-platform-versions-result/NextToken] :locations {}))

(clojure.spec.alpha/def :portkey.aws.elasticbeanstalk.-2010-12-01.trigger/name (clojure.spec.alpha/and :portkey.aws.elasticbeanstalk.-2010-12-01/resource-id))
(clojure.spec.alpha/def :portkey.aws.elasticbeanstalk.-2010-12-01/trigger (portkey.aws/json-keys :req-un [] :opt-un [:portkey.aws.elasticbeanstalk.-2010-12-01.trigger/Name] :locations {}))

(clojure.spec.alpha/def :portkey.aws.elasticbeanstalk.-2010-12-01/too-many-configuration-templates-exception (portkey.aws/json-keys :req-un [] :opt-un [] :locations {}))

(clojure.spec.alpha/def :portkey.aws.elasticbeanstalk.-2010-12-01.source-configuration/template-name (clojure.spec.alpha/and :portkey.aws.elasticbeanstalk.-2010-12-01/configuration-template-name))
(clojure.spec.alpha/def :portkey.aws.elasticbeanstalk.-2010-12-01/source-configuration (portkey.aws/json-keys :req-un [] :opt-un [:portkey.aws.elasticbeanstalk.-2010-12-01/ApplicationName :portkey.aws.elasticbeanstalk.-2010-12-01.source-configuration/TemplateName] :locations {}))

(clojure.spec.alpha/def :portkey.aws.elasticbeanstalk.-2010-12-01/user-defined-option clojure.core/boolean?)

(clojure.spec.alpha/def :portkey.aws.elasticbeanstalk.-2010-12-01/supported-tier (clojure.spec.alpha/and clojure.core/string?))

(clojure.spec.alpha/def :portkey.aws.elasticbeanstalk.-2010-12-01/load-balancer-list (clojure.spec.alpha/coll-of :portkey.aws.elasticbeanstalk.-2010-12-01/load-balancer))

(clojure.spec.alpha/def :portkey.aws.elasticbeanstalk.-2010-12-01/launch-configuration-list (clojure.spec.alpha/coll-of :portkey.aws.elasticbeanstalk.-2010-12-01/launch-configuration))

(clojure.spec.alpha/def :portkey.aws.elasticbeanstalk.-2010-12-01.configuration-option-description/user-defined (clojure.spec.alpha/and :portkey.aws.elasticbeanstalk.-2010-12-01/user-defined-option))
(clojure.spec.alpha/def :portkey.aws.elasticbeanstalk.-2010-12-01.configuration-option-description/min-value (clojure.spec.alpha/and :portkey.aws.elasticbeanstalk.-2010-12-01/option-restriction-min-value))
(clojure.spec.alpha/def :portkey.aws.elasticbeanstalk.-2010-12-01.configuration-option-description/max-value (clojure.spec.alpha/and :portkey.aws.elasticbeanstalk.-2010-12-01/option-restriction-max-value))
(clojure.spec.alpha/def :portkey.aws.elasticbeanstalk.-2010-12-01.configuration-option-description/change-severity (clojure.spec.alpha/and :portkey.aws.elasticbeanstalk.-2010-12-01/configuration-option-severity))
(clojure.spec.alpha/def :portkey.aws.elasticbeanstalk.-2010-12-01.configuration-option-description/max-length (clojure.spec.alpha/and :portkey.aws.elasticbeanstalk.-2010-12-01/option-restriction-max-length))
(clojure.spec.alpha/def :portkey.aws.elasticbeanstalk.-2010-12-01.configuration-option-description/namespace (clojure.spec.alpha/and :portkey.aws.elasticbeanstalk.-2010-12-01/option-namespace))
(clojure.spec.alpha/def :portkey.aws.elasticbeanstalk.-2010-12-01.configuration-option-description/value-type (clojure.spec.alpha/and :portkey.aws.elasticbeanstalk.-2010-12-01/configuration-option-value-type))
(clojure.spec.alpha/def :portkey.aws.elasticbeanstalk.-2010-12-01.configuration-option-description/regex (clojure.spec.alpha/and :portkey.aws.elasticbeanstalk.-2010-12-01/option-restriction-regex))
(clojure.spec.alpha/def :portkey.aws.elasticbeanstalk.-2010-12-01.configuration-option-description/value-options (clojure.spec.alpha/and :portkey.aws.elasticbeanstalk.-2010-12-01/configuration-option-possible-values))
(clojure.spec.alpha/def :portkey.aws.elasticbeanstalk.-2010-12-01.configuration-option-description/default-value (clojure.spec.alpha/and :portkey.aws.elasticbeanstalk.-2010-12-01/configuration-option-default-value))
(clojure.spec.alpha/def :portkey.aws.elasticbeanstalk.-2010-12-01.configuration-option-description/name (clojure.spec.alpha/and :portkey.aws.elasticbeanstalk.-2010-12-01/configuration-option-name))
(clojure.spec.alpha/def :portkey.aws.elasticbeanstalk.-2010-12-01/configuration-option-description (portkey.aws/json-keys :req-un [] :opt-un [:portkey.aws.elasticbeanstalk.-2010-12-01.configuration-option-description/UserDefined :portkey.aws.elasticbeanstalk.-2010-12-01.configuration-option-description/MinValue :portkey.aws.elasticbeanstalk.-2010-12-01.configuration-option-description/MaxValue :portkey.aws.elasticbeanstalk.-2010-12-01.configuration-option-description/ChangeSeverity :portkey.aws.elasticbeanstalk.-2010-12-01.configuration-option-description/MaxLength :portkey.aws.elasticbeanstalk.-2010-12-01.configuration-option-description/Namespace :portkey.aws.elasticbeanstalk.-2010-12-01.configuration-option-description/ValueType :portkey.aws.elasticbeanstalk.-2010-12-01.configuration-option-description/Regex :portkey.aws.elasticbeanstalk.-2010-12-01.configuration-option-description/ValueOptions :portkey.aws.elasticbeanstalk.-2010-12-01.configuration-option-description/DefaultValue :portkey.aws.elasticbeanstalk.-2010-12-01.configuration-option-description/Name] :locations {}))

(clojure.spec.alpha/def :portkey.aws.elasticbeanstalk.-2010-12-01.resource-tags-description-message/resource-tags (clojure.spec.alpha/and :portkey.aws.elasticbeanstalk.-2010-12-01/tag-list))
(clojure.spec.alpha/def :portkey.aws.elasticbeanstalk.-2010-12-01/resource-tags-description-message (portkey.aws/json-keys :req-un [] :opt-un [:portkey.aws.elasticbeanstalk.-2010-12-01/ResourceArn :portkey.aws.elasticbeanstalk.-2010-12-01.resource-tags-description-message/ResourceTags] :locations {}))

(clojure.spec.alpha/def :portkey.aws.elasticbeanstalk.-2010-12-01/create-storage-location-result-message (portkey.aws/json-keys :req-un [] :opt-un [:portkey.aws.elasticbeanstalk.-2010-12-01/S3Bucket] :locations {}))

(clojure.spec.alpha/def :portkey.aws.elasticbeanstalk.-2010-12-01.describe-configuration-settings-message/template-name (clojure.spec.alpha/and :portkey.aws.elasticbeanstalk.-2010-12-01/configuration-template-name))
(clojure.spec.alpha/def :portkey.aws.elasticbeanstalk.-2010-12-01/describe-configuration-settings-message (portkey.aws/json-keys :req-un [:portkey.aws.elasticbeanstalk.-2010-12-01/ApplicationName] :opt-un [:portkey.aws.elasticbeanstalk.-2010-12-01.describe-configuration-settings-message/TemplateName :portkey.aws.elasticbeanstalk.-2010-12-01/EnvironmentName] :locations {}))

(clojure.spec.alpha/def :portkey.aws.elasticbeanstalk.-2010-12-01.configuration-settings-descriptions/configuration-settings (clojure.spec.alpha/and :portkey.aws.elasticbeanstalk.-2010-12-01/configuration-settings-description-list))
(clojure.spec.alpha/def :portkey.aws.elasticbeanstalk.-2010-12-01/configuration-settings-descriptions (portkey.aws/json-keys :req-un [] :opt-un [:portkey.aws.elasticbeanstalk.-2010-12-01.configuration-settings-descriptions/ConfigurationSettings] :locations {}))

(clojure.spec.alpha/def :portkey.aws.elasticbeanstalk.-2010-12-01/system-status (portkey.aws/json-keys :req-un [] :opt-un [:portkey.aws.elasticbeanstalk.-2010-12-01/CPUUtilization :portkey.aws.elasticbeanstalk.-2010-12-01/LoadAverage] :locations {}))

(clojure.core/defn create-application-version "Creates an application version for the specified application. You can create an\napplication version from a source bundle in Amazon S3, a commit in AWS\nCodeCommit, or the output of an AWS CodeBuild build as follows:\n Specify a commit in an AWS CodeCommit repository with SourceBuildInformation.\n Specify a build in an AWS CodeBuild with SourceBuildInformation and\nBuildConfiguration.\n Specify a source bundle in S3 with SourceBundle\n Omit both SourceBuildInformation and SourceBundle to use the default sample\napplication.\n Once you create an application version with a specified Amazon S3 bucket and\nkey location, you cannot change that Amazon S3 location. If you change the\nAmazon S3 location, you receive an exception when you attempt to launch an\nenvironment from the application version." ([create-application-version-message] (clojure.core/let [req<-input__36755__auto__ (req<-create-application-version-message "CreateApplicationVersion" create-application-version-message)] (portkey.aws/-query-call portkey.aws.elasticbeanstalk.-2010-12-01/endpoints "POST" "/" req<-input__36755__auto__ :portkey.aws.elasticbeanstalk.-2010-12-01/create-application-version-message {:payload nil, :move {}, :headers {}, :uri {}, :querystring {}} nil :portkey.aws.elasticbeanstalk.-2010-12-01/application-version-description-message {"TooManyApplicationsException" :portkey.aws.elasticbeanstalk.-2010-12-01/too-many-applications-exception, "TooManyApplicationVersionsException" :portkey.aws.elasticbeanstalk.-2010-12-01/too-many-application-versions-exception, "InsufficientPrivilegesException" :portkey.aws.elasticbeanstalk.-2010-12-01/insufficient-privileges-exception, "S3LocationNotInServiceRegionException" :portkey.aws.elasticbeanstalk.-2010-12-01/s3-location-not-in-service-region-exception, "CodeBuildNotInServiceRegionException" :portkey.aws.elasticbeanstalk.-2010-12-01/code-build-not-in-service-region-exception}))))
(clojure.spec.alpha/fdef create-application-version :args (clojure.spec.alpha/tuple :portkey.aws.elasticbeanstalk.-2010-12-01/create-application-version-message) :ret (clojure.spec.alpha/and :portkey.aws.elasticbeanstalk.-2010-12-01/application-version-description-message))

(clojure.core/defn update-environment "Updates the environment description, deploys a new application version, updates\nthe configuration settings to an entirely new configuration template, or updates\nselect configuration option values in the running environment.\n Attempting to update both the release and configuration is not allowed and AWS\nElastic Beanstalk returns an InvalidParameterCombination error.\n When updating the configuration settings to a new template or individual\nsettings, a draft configuration is created and DescribeConfigurationSettings for\nthis environment returns two setting descriptions with different\nDeploymentStatus values." ([] (update-environment {})) ([update-environment-message] (clojure.core/let [req<-input__36755__auto__ (req<-update-environment-message "UpdateEnvironment" update-environment-message)] (portkey.aws/-query-call portkey.aws.elasticbeanstalk.-2010-12-01/endpoints "POST" "/" req<-input__36755__auto__ :portkey.aws.elasticbeanstalk.-2010-12-01/update-environment-message {:payload nil, :move {}, :headers {}, :uri {}, :querystring {}} nil :portkey.aws.elasticbeanstalk.-2010-12-01/environment-description {"InsufficientPrivilegesException" :portkey.aws.elasticbeanstalk.-2010-12-01/insufficient-privileges-exception, "TooManyBucketsException" :portkey.aws.elasticbeanstalk.-2010-12-01/too-many-buckets-exception}))))
(clojure.spec.alpha/fdef update-environment :args (clojure.spec.alpha/? :portkey.aws.elasticbeanstalk.-2010-12-01/update-environment-message) :ret (clojure.spec.alpha/and :portkey.aws.elasticbeanstalk.-2010-12-01/environment-description))

(clojure.core/defn update-tags-for-resource "Update the list of tags applied to an AWS Elastic Beanstalk resource. Two lists\ncan be passed: TagsToAdd for tags to add or update, and TagsToRemove.\n Currently, Elastic Beanstalk only supports tagging of Elastic Beanstalk\nenvironments. For details about environment tagging, see Tagging Resources in\nYour Elastic Beanstalk Environment\n(http://docs.aws.amazon.com/elasticbeanstalk/latest/dg/using-features.tagging.html).\n If you create a custom IAM user policy to control permission to this operation,\nspecify one of the following two virtual actions (or both) instead of the API\noperation name:\n elasticbeanstalk:AddTags\n Controls permission to call UpdateTagsForResource and pass a list of tags to\nadd in the TagsToAdd parameter.\n elasticbeanstalk:RemoveTags\n Controls permission to call UpdateTagsForResource and pass a list of tag keys\nto remove in the TagsToRemove parameter.\n For details about creating a custom user policy, see Creating a Custom User\nPolicy\n(http://docs.aws.amazon.com/elasticbeanstalk/latest/dg/AWSHowTo.iam.managed-policies.html#AWSHowTo.iam.policies)." ([update-tags-for-resource-message] (clojure.core/let [req<-input__36755__auto__ (req<-update-tags-for-resource-message "UpdateTagsForResource" update-tags-for-resource-message)] (portkey.aws/-query-call portkey.aws.elasticbeanstalk.-2010-12-01/endpoints "POST" "/" req<-input__36755__auto__ :portkey.aws.elasticbeanstalk.-2010-12-01/update-tags-for-resource-message {:payload nil, :move {}, :headers {}, :uri {}, :querystring {}} nil nil {"InsufficientPrivilegesException" :portkey.aws.elasticbeanstalk.-2010-12-01/insufficient-privileges-exception, "OperationInProgressException" :portkey.aws.elasticbeanstalk.-2010-12-01/operation-in-progress-exception, "TooManyTagsException" :portkey.aws.elasticbeanstalk.-2010-12-01/too-many-tags-exception, "ResourceNotFoundException" :portkey.aws.elasticbeanstalk.-2010-12-01/resource-not-found-exception, "ResourceTypeNotSupportedException" :portkey.aws.elasticbeanstalk.-2010-12-01/resource-type-not-supported-exception}))))
(clojure.spec.alpha/fdef update-tags-for-resource :args (clojure.spec.alpha/tuple :portkey.aws.elasticbeanstalk.-2010-12-01/update-tags-for-resource-message) :ret clojure.core/true?)

(clojure.core/defn describe-platform-version "Describes the version of the platform." ([] (describe-platform-version {})) ([describe-platform-version-request] (clojure.core/let [req<-input__36755__auto__ (req<-describe-platform-version-request "DescribePlatformVersion" describe-platform-version-request)] (portkey.aws/-query-call portkey.aws.elasticbeanstalk.-2010-12-01/endpoints "POST" "/" req<-input__36755__auto__ :portkey.aws.elasticbeanstalk.-2010-12-01/describe-platform-version-request {:payload nil, :move {}, :headers {}, :uri {}, :querystring {}} nil :portkey.aws.elasticbeanstalk.-2010-12-01/describe-platform-version-result {"InsufficientPrivilegesException" :portkey.aws.elasticbeanstalk.-2010-12-01/insufficient-privileges-exception, "ElasticBeanstalkServiceException" :portkey.aws.elasticbeanstalk.-2010-12-01/elastic-beanstalk-service-exception}))))
(clojure.spec.alpha/fdef describe-platform-version :args (clojure.spec.alpha/? :portkey.aws.elasticbeanstalk.-2010-12-01/describe-platform-version-request) :ret (clojure.spec.alpha/and :portkey.aws.elasticbeanstalk.-2010-12-01/describe-platform-version-result))

(clojure.core/defn create-platform-version "Create a new version of your custom platform." ([create-platform-version-request] (clojure.core/let [req<-input__36755__auto__ (req<-create-platform-version-request "CreatePlatformVersion" create-platform-version-request)] (portkey.aws/-query-call portkey.aws.elasticbeanstalk.-2010-12-01/endpoints "POST" "/" req<-input__36755__auto__ :portkey.aws.elasticbeanstalk.-2010-12-01/create-platform-version-request {:payload nil, :move {}, :headers {}, :uri {}, :querystring {}} nil :portkey.aws.elasticbeanstalk.-2010-12-01/create-platform-version-result {"InsufficientPrivilegesException" :portkey.aws.elasticbeanstalk.-2010-12-01/insufficient-privileges-exception, "ElasticBeanstalkServiceException" :portkey.aws.elasticbeanstalk.-2010-12-01/elastic-beanstalk-service-exception, "TooManyPlatformsException" :portkey.aws.elasticbeanstalk.-2010-12-01/too-many-platforms-exception}))))
(clojure.spec.alpha/fdef create-platform-version :args (clojure.spec.alpha/tuple :portkey.aws.elasticbeanstalk.-2010-12-01/create-platform-version-request) :ret (clojure.spec.alpha/and :portkey.aws.elasticbeanstalk.-2010-12-01/create-platform-version-result))

(clojure.core/defn create-environment "Launches an environment for the specified application using the specified\nconfiguration." ([create-environment-message] (clojure.core/let [req<-input__36755__auto__ (req<-create-environment-message "CreateEnvironment" create-environment-message)] (portkey.aws/-query-call portkey.aws.elasticbeanstalk.-2010-12-01/endpoints "POST" "/" req<-input__36755__auto__ :portkey.aws.elasticbeanstalk.-2010-12-01/create-environment-message {:payload nil, :move {}, :headers {}, :uri {}, :querystring {}} nil :portkey.aws.elasticbeanstalk.-2010-12-01/environment-description {"TooManyEnvironmentsException" :portkey.aws.elasticbeanstalk.-2010-12-01/too-many-environments-exception, "InsufficientPrivilegesException" :portkey.aws.elasticbeanstalk.-2010-12-01/insufficient-privileges-exception}))))
(clojure.spec.alpha/fdef create-environment :args (clojure.spec.alpha/tuple :portkey.aws.elasticbeanstalk.-2010-12-01/create-environment-message) :ret (clojure.spec.alpha/and :portkey.aws.elasticbeanstalk.-2010-12-01/environment-description))

(clojure.core/defn describe-environment-managed-actions "Lists an environment's upcoming and in-progress managed actions." ([] (describe-environment-managed-actions {})) ([describe-environment-managed-actions-request] (clojure.core/let [req<-input__36755__auto__ (req<-describe-environment-managed-actions-request "DescribeEnvironmentManagedActions" describe-environment-managed-actions-request)] (portkey.aws/-query-call portkey.aws.elasticbeanstalk.-2010-12-01/endpoints "POST" "/" req<-input__36755__auto__ :portkey.aws.elasticbeanstalk.-2010-12-01/describe-environment-managed-actions-request {:payload nil, :move {}, :headers {}, :uri {}, :querystring {}} nil :portkey.aws.elasticbeanstalk.-2010-12-01/describe-environment-managed-actions-result {"ElasticBeanstalkServiceException" :portkey.aws.elasticbeanstalk.-2010-12-01/elastic-beanstalk-service-exception}))))
(clojure.spec.alpha/fdef describe-environment-managed-actions :args (clojure.spec.alpha/? :portkey.aws.elasticbeanstalk.-2010-12-01/describe-environment-managed-actions-request) :ret (clojure.spec.alpha/and :portkey.aws.elasticbeanstalk.-2010-12-01/describe-environment-managed-actions-result))

(clojure.core/defn delete-application "Deletes the specified application along with all associated versions and\nconfigurations. The application versions will not be deleted from your Amazon S3\nbucket.\n You cannot delete an application that has a running environment." ([delete-application-message] (clojure.core/let [req<-input__36755__auto__ (req<-delete-application-message "DeleteApplication" delete-application-message)] (portkey.aws/-query-call portkey.aws.elasticbeanstalk.-2010-12-01/endpoints "POST" "/" req<-input__36755__auto__ :portkey.aws.elasticbeanstalk.-2010-12-01/delete-application-message {:payload nil, :move {}, :headers {}, :uri {}, :querystring {}} nil nil {"OperationInProgressException" :portkey.aws.elasticbeanstalk.-2010-12-01/operation-in-progress-exception}))))
(clojure.spec.alpha/fdef delete-application :args (clojure.spec.alpha/tuple :portkey.aws.elasticbeanstalk.-2010-12-01/delete-application-message) :ret clojure.core/true?)

(clojure.core/defn describe-instances-health "Retrives detailed information about the health of instances in your AWS Elastic\nBeanstalk. This operation requires enhanced health reporting\n(http://docs.aws.amazon.com/elasticbeanstalk/latest/dg/health-enhanced.html)." ([] (describe-instances-health {})) ([describe-instances-health-request] (clojure.core/let [req<-input__36755__auto__ (req<-describe-instances-health-request "DescribeInstancesHealth" describe-instances-health-request)] (portkey.aws/-query-call portkey.aws.elasticbeanstalk.-2010-12-01/endpoints "POST" "/" req<-input__36755__auto__ :portkey.aws.elasticbeanstalk.-2010-12-01/describe-instances-health-request {:payload nil, :move {}, :headers {}, :uri {}, :querystring {}} nil :portkey.aws.elasticbeanstalk.-2010-12-01/describe-instances-health-result {"InvalidRequestException" :portkey.aws.elasticbeanstalk.-2010-12-01/invalid-request-exception, "ElasticBeanstalkServiceException" :portkey.aws.elasticbeanstalk.-2010-12-01/elastic-beanstalk-service-exception}))))
(clojure.spec.alpha/fdef describe-instances-health :args (clojure.spec.alpha/? :portkey.aws.elasticbeanstalk.-2010-12-01/describe-instances-health-request) :ret (clojure.spec.alpha/and :portkey.aws.elasticbeanstalk.-2010-12-01/describe-instances-health-result))

(clojure.core/defn describe-configuration-options "Describes the configuration options that are used in a particular configuration\ntemplate or environment, or that a specified solution stack defines. The\ndescription includes the values the options, their default values, and an\nindication of the required action on a running environment if an option value is\nchanged." ([] (describe-configuration-options {})) ([describe-configuration-options-message] (clojure.core/let [req<-input__36755__auto__ (req<-describe-configuration-options-message "DescribeConfigurationOptions" describe-configuration-options-message)] (portkey.aws/-query-call portkey.aws.elasticbeanstalk.-2010-12-01/endpoints "POST" "/" req<-input__36755__auto__ :portkey.aws.elasticbeanstalk.-2010-12-01/describe-configuration-options-message {:payload nil, :move {}, :headers {}, :uri {}, :querystring {}} nil :portkey.aws.elasticbeanstalk.-2010-12-01/configuration-options-description {"TooManyBucketsException" :portkey.aws.elasticbeanstalk.-2010-12-01/too-many-buckets-exception}))))
(clojure.spec.alpha/fdef describe-configuration-options :args (clojure.spec.alpha/? :portkey.aws.elasticbeanstalk.-2010-12-01/describe-configuration-options-message) :ret (clojure.spec.alpha/and :portkey.aws.elasticbeanstalk.-2010-12-01/configuration-options-description))

(clojure.core/defn compose-environments "Create or update a group of environments that each run a separate component of a\nsingle application. Takes a list of version labels that specify application\nsource bundles for each of the environments to create or update. The name of\neach environment and other required information must be included in the source\nbundles in an environment manifest named env.yaml. See Compose Environments\n(http://docs.aws.amazon.com/elasticbeanstalk/latest/dg/environment-mgmt-compose.html)\nfor details." ([] (compose-environments {})) ([compose-environments-message] (clojure.core/let [req<-input__36755__auto__ (req<-compose-environments-message "ComposeEnvironments" compose-environments-message)] (portkey.aws/-query-call portkey.aws.elasticbeanstalk.-2010-12-01/endpoints "POST" "/" req<-input__36755__auto__ :portkey.aws.elasticbeanstalk.-2010-12-01/compose-environments-message {:payload nil, :move {}, :headers {}, :uri {}, :querystring {}} nil :portkey.aws.elasticbeanstalk.-2010-12-01/environment-descriptions-message {"TooManyEnvironmentsException" :portkey.aws.elasticbeanstalk.-2010-12-01/too-many-environments-exception, "InsufficientPrivilegesException" :portkey.aws.elasticbeanstalk.-2010-12-01/insufficient-privileges-exception}))))
(clojure.spec.alpha/fdef compose-environments :args (clojure.spec.alpha/? :portkey.aws.elasticbeanstalk.-2010-12-01/compose-environments-message) :ret (clojure.spec.alpha/and :portkey.aws.elasticbeanstalk.-2010-12-01/environment-descriptions-message))

(clojure.core/defn describe-events "Returns list of event descriptions matching criteria up to the last 6 weeks.\n This action returns the most recent 1,000 events from the specified NextToken." ([] (describe-events {})) ([describe-events-message] (clojure.core/let [req<-input__36755__auto__ (req<-describe-events-message "DescribeEvents" describe-events-message)] (portkey.aws/-query-call portkey.aws.elasticbeanstalk.-2010-12-01/endpoints "POST" "/" req<-input__36755__auto__ :portkey.aws.elasticbeanstalk.-2010-12-01/describe-events-message {:payload nil, :move {}, :headers {}, :uri {}, :querystring {}} nil :portkey.aws.elasticbeanstalk.-2010-12-01/event-descriptions-message {}))))
(clojure.spec.alpha/fdef describe-events :args (clojure.spec.alpha/? :portkey.aws.elasticbeanstalk.-2010-12-01/describe-events-message) :ret (clojure.spec.alpha/and :portkey.aws.elasticbeanstalk.-2010-12-01/event-descriptions-message))

(clojure.core/defn describe-environment-resources "Returns AWS resources for this environment." ([] (describe-environment-resources {})) ([describe-environment-resources-message] (clojure.core/let [req<-input__36755__auto__ (req<-describe-environment-resources-message "DescribeEnvironmentResources" describe-environment-resources-message)] (portkey.aws/-query-call portkey.aws.elasticbeanstalk.-2010-12-01/endpoints "POST" "/" req<-input__36755__auto__ :portkey.aws.elasticbeanstalk.-2010-12-01/describe-environment-resources-message {:payload nil, :move {}, :headers {}, :uri {}, :querystring {}} nil :portkey.aws.elasticbeanstalk.-2010-12-01/environment-resource-descriptions-message {"InsufficientPrivilegesException" :portkey.aws.elasticbeanstalk.-2010-12-01/insufficient-privileges-exception}))))
(clojure.spec.alpha/fdef describe-environment-resources :args (clojure.spec.alpha/? :portkey.aws.elasticbeanstalk.-2010-12-01/describe-environment-resources-message) :ret (clojure.spec.alpha/and :portkey.aws.elasticbeanstalk.-2010-12-01/environment-resource-descriptions-message))

(clojure.core/defn update-application-resource-lifecycle "Modifies lifecycle settings for an application." ([update-application-resource-lifecycle-message] (clojure.core/let [req<-input__36755__auto__ (req<-update-application-resource-lifecycle-message "UpdateApplicationResourceLifecycle" update-application-resource-lifecycle-message)] (portkey.aws/-query-call portkey.aws.elasticbeanstalk.-2010-12-01/endpoints "POST" "/" req<-input__36755__auto__ :portkey.aws.elasticbeanstalk.-2010-12-01/update-application-resource-lifecycle-message {:payload nil, :move {}, :headers {}, :uri {}, :querystring {}} nil :portkey.aws.elasticbeanstalk.-2010-12-01/application-resource-lifecycle-description-message {"InsufficientPrivilegesException" :portkey.aws.elasticbeanstalk.-2010-12-01/insufficient-privileges-exception}))))
(clojure.spec.alpha/fdef update-application-resource-lifecycle :args (clojure.spec.alpha/tuple :portkey.aws.elasticbeanstalk.-2010-12-01/update-application-resource-lifecycle-message) :ret (clojure.spec.alpha/and :portkey.aws.elasticbeanstalk.-2010-12-01/application-resource-lifecycle-description-message))

(clojure.core/defn describe-environment-health "Returns information about the overall health of the specified environment. The\nDescribeEnvironmentHealth operation is only available with AWS Elastic Beanstalk\nEnhanced Health." ([] (describe-environment-health {})) ([describe-environment-health-request] (clojure.core/let [req<-input__36755__auto__ (req<-describe-environment-health-request "DescribeEnvironmentHealth" describe-environment-health-request)] (portkey.aws/-query-call portkey.aws.elasticbeanstalk.-2010-12-01/endpoints "POST" "/" req<-input__36755__auto__ :portkey.aws.elasticbeanstalk.-2010-12-01/describe-environment-health-request {:payload nil, :move {}, :headers {}, :uri {}, :querystring {}} nil :portkey.aws.elasticbeanstalk.-2010-12-01/describe-environment-health-result {"InvalidRequestException" :portkey.aws.elasticbeanstalk.-2010-12-01/invalid-request-exception, "ElasticBeanstalkServiceException" :portkey.aws.elasticbeanstalk.-2010-12-01/elastic-beanstalk-service-exception}))))
(clojure.spec.alpha/fdef describe-environment-health :args (clojure.spec.alpha/? :portkey.aws.elasticbeanstalk.-2010-12-01/describe-environment-health-request) :ret (clojure.spec.alpha/and :portkey.aws.elasticbeanstalk.-2010-12-01/describe-environment-health-result))

(clojure.core/defn request-environment-info "Initiates a request to compile the specified type of information of the deployed\nenvironment.\n Setting the InfoType to tail compiles the last lines from the application\nserver log files of every Amazon EC2 instance in your environment.\n Setting the InfoType to bundle compresses the application server log files for\nevery Amazon EC2 instance into a .zip file. Legacy and .NET containers do not\nsupport bundle logs.\n Use RetrieveEnvironmentInfo to obtain the set of logs.\n Related Topics\n * RetrieveEnvironmentInfo" ([request-environment-info-message] (clojure.core/let [req<-input__36755__auto__ (req<-request-environment-info-message "RequestEnvironmentInfo" request-environment-info-message)] (portkey.aws/-query-call portkey.aws.elasticbeanstalk.-2010-12-01/endpoints "POST" "/" req<-input__36755__auto__ :portkey.aws.elasticbeanstalk.-2010-12-01/request-environment-info-message {:payload nil, :move {}, :headers {}, :uri {}, :querystring {}} nil nil {}))))
(clojure.spec.alpha/fdef request-environment-info :args (clojure.spec.alpha/tuple :portkey.aws.elasticbeanstalk.-2010-12-01/request-environment-info-message) :ret clojure.core/true?)

(clojure.core/defn list-platform-versions "Lists the available platforms." ([] (list-platform-versions {})) ([list-platform-versions-request] (clojure.core/let [req<-input__36755__auto__ (req<-list-platform-versions-request "ListPlatformVersions" list-platform-versions-request)] (portkey.aws/-query-call portkey.aws.elasticbeanstalk.-2010-12-01/endpoints "POST" "/" req<-input__36755__auto__ :portkey.aws.elasticbeanstalk.-2010-12-01/list-platform-versions-request {:payload nil, :move {}, :headers {}, :uri {}, :querystring {}} nil :portkey.aws.elasticbeanstalk.-2010-12-01/list-platform-versions-result {"InsufficientPrivilegesException" :portkey.aws.elasticbeanstalk.-2010-12-01/insufficient-privileges-exception, "ElasticBeanstalkServiceException" :portkey.aws.elasticbeanstalk.-2010-12-01/elastic-beanstalk-service-exception}))))
(clojure.spec.alpha/fdef list-platform-versions :args (clojure.spec.alpha/? :portkey.aws.elasticbeanstalk.-2010-12-01/list-platform-versions-request) :ret (clojure.spec.alpha/and :portkey.aws.elasticbeanstalk.-2010-12-01/list-platform-versions-result))

(clojure.core/defn apply-environment-managed-action "Applies a scheduled managed action immediately. A managed action can be applied\nonly if its status is Scheduled. Get the status and action ID of a managed\naction with DescribeEnvironmentManagedActions." ([apply-environment-managed-action-request] (clojure.core/let [req<-input__36755__auto__ (req<-apply-environment-managed-action-request "ApplyEnvironmentManagedAction" apply-environment-managed-action-request)] (portkey.aws/-query-call portkey.aws.elasticbeanstalk.-2010-12-01/endpoints "POST" "/" req<-input__36755__auto__ :portkey.aws.elasticbeanstalk.-2010-12-01/apply-environment-managed-action-request {:payload nil, :move {}, :headers {}, :uri {}, :querystring {}} nil :portkey.aws.elasticbeanstalk.-2010-12-01/apply-environment-managed-action-result {"ElasticBeanstalkServiceException" :portkey.aws.elasticbeanstalk.-2010-12-01/elastic-beanstalk-service-exception, "ManagedActionInvalidStateException" :portkey.aws.elasticbeanstalk.-2010-12-01/managed-action-invalid-state-exception}))))
(clojure.spec.alpha/fdef apply-environment-managed-action :args (clojure.spec.alpha/tuple :portkey.aws.elasticbeanstalk.-2010-12-01/apply-environment-managed-action-request) :ret (clojure.spec.alpha/and :portkey.aws.elasticbeanstalk.-2010-12-01/apply-environment-managed-action-result))

(clojure.core/defn describe-applications "Returns the descriptions of existing applications." ([] (describe-applications {})) ([describe-applications-message] (clojure.core/let [req<-input__36755__auto__ (req<-describe-applications-message "DescribeApplications" describe-applications-message)] (portkey.aws/-query-call portkey.aws.elasticbeanstalk.-2010-12-01/endpoints "POST" "/" req<-input__36755__auto__ :portkey.aws.elasticbeanstalk.-2010-12-01/describe-applications-message {:payload nil, :move {}, :headers {}, :uri {}, :querystring {}} nil :portkey.aws.elasticbeanstalk.-2010-12-01/application-descriptions-message {}))))
(clojure.spec.alpha/fdef describe-applications :args (clojure.spec.alpha/? :portkey.aws.elasticbeanstalk.-2010-12-01/describe-applications-message) :ret (clojure.spec.alpha/and :portkey.aws.elasticbeanstalk.-2010-12-01/application-descriptions-message))

(clojure.core/defn list-tags-for-resource "Returns the tags applied to an AWS Elastic Beanstalk resource. The response\ncontains a list of tag key-value pairs.\n Currently, Elastic Beanstalk only supports tagging of Elastic Beanstalk\nenvironments. For details about environment tagging, see Tagging Resources in\nYour Elastic Beanstalk Environment\n(http://docs.aws.amazon.com/elasticbeanstalk/latest/dg/using-features.tagging.html)." ([list-tags-for-resource-message] (clojure.core/let [req<-input__36755__auto__ (req<-list-tags-for-resource-message "ListTagsForResource" list-tags-for-resource-message)] (portkey.aws/-query-call portkey.aws.elasticbeanstalk.-2010-12-01/endpoints "POST" "/" req<-input__36755__auto__ :portkey.aws.elasticbeanstalk.-2010-12-01/list-tags-for-resource-message {:payload nil, :move {}, :headers {}, :uri {}, :querystring {}} nil :portkey.aws.elasticbeanstalk.-2010-12-01/resource-tags-description-message {"InsufficientPrivilegesException" :portkey.aws.elasticbeanstalk.-2010-12-01/insufficient-privileges-exception, "ResourceNotFoundException" :portkey.aws.elasticbeanstalk.-2010-12-01/resource-not-found-exception, "ResourceTypeNotSupportedException" :portkey.aws.elasticbeanstalk.-2010-12-01/resource-type-not-supported-exception}))))
(clojure.spec.alpha/fdef list-tags-for-resource :args (clojure.spec.alpha/tuple :portkey.aws.elasticbeanstalk.-2010-12-01/list-tags-for-resource-message) :ret (clojure.spec.alpha/and :portkey.aws.elasticbeanstalk.-2010-12-01/resource-tags-description-message))

(clojure.core/defn validate-configuration-settings "Takes a set of configuration settings and either a configuration template or\nenvironment, and determines whether those values are valid.\n This action returns a list of messages indicating any errors or warnings\nassociated with the selection of option values." ([validate-configuration-settings-message] (clojure.core/let [req<-input__36755__auto__ (req<-validate-configuration-settings-message "ValidateConfigurationSettings" validate-configuration-settings-message)] (portkey.aws/-query-call portkey.aws.elasticbeanstalk.-2010-12-01/endpoints "POST" "/" req<-input__36755__auto__ :portkey.aws.elasticbeanstalk.-2010-12-01/validate-configuration-settings-message {:payload nil, :move {}, :headers {}, :uri {}, :querystring {}} nil :portkey.aws.elasticbeanstalk.-2010-12-01/configuration-settings-validation-messages {"InsufficientPrivilegesException" :portkey.aws.elasticbeanstalk.-2010-12-01/insufficient-privileges-exception, "TooManyBucketsException" :portkey.aws.elasticbeanstalk.-2010-12-01/too-many-buckets-exception}))))
(clojure.spec.alpha/fdef validate-configuration-settings :args (clojure.spec.alpha/tuple :portkey.aws.elasticbeanstalk.-2010-12-01/validate-configuration-settings-message) :ret (clojure.spec.alpha/and :portkey.aws.elasticbeanstalk.-2010-12-01/configuration-settings-validation-messages))

(clojure.core/defn restart-app-server "Causes the environment to restart the application container server running on\neach Amazon EC2 instance." ([] (restart-app-server {})) ([restart-app-server-message] (clojure.core/let [req<-input__36755__auto__ (req<-restart-app-server-message "RestartAppServer" restart-app-server-message)] (portkey.aws/-query-call portkey.aws.elasticbeanstalk.-2010-12-01/endpoints "POST" "/" req<-input__36755__auto__ :portkey.aws.elasticbeanstalk.-2010-12-01/restart-app-server-message {:payload nil, :move {}, :headers {}, :uri {}, :querystring {}} nil nil {}))))
(clojure.spec.alpha/fdef restart-app-server :args (clojure.spec.alpha/? :portkey.aws.elasticbeanstalk.-2010-12-01/restart-app-server-message) :ret clojure.core/true?)

(clojure.core/defn describe-environments "Returns descriptions for existing environments." ([] (describe-environments {})) ([describe-environments-message] (clojure.core/let [req<-input__36755__auto__ (req<-describe-environments-message "DescribeEnvironments" describe-environments-message)] (portkey.aws/-query-call portkey.aws.elasticbeanstalk.-2010-12-01/endpoints "POST" "/" req<-input__36755__auto__ :portkey.aws.elasticbeanstalk.-2010-12-01/describe-environments-message {:payload nil, :move {}, :headers {}, :uri {}, :querystring {}} nil :portkey.aws.elasticbeanstalk.-2010-12-01/environment-descriptions-message {}))))
(clojure.spec.alpha/fdef describe-environments :args (clojure.spec.alpha/? :portkey.aws.elasticbeanstalk.-2010-12-01/describe-environments-message) :ret (clojure.spec.alpha/and :portkey.aws.elasticbeanstalk.-2010-12-01/environment-descriptions-message))

(clojure.core/defn delete-environment-configuration "Deletes the draft configuration associated with the running environment.\n Updating a running environment with any configuration changes creates a draft\nconfiguration set. You can get the draft configuration using\nDescribeConfigurationSettings while the update is in progress or if the update\nfails. The DeploymentStatus for the draft configuration indicates whether the\ndeployment is in process or has failed. The draft configuration remains in\nexistence until it is deleted with this action." ([delete-environment-configuration-message] (clojure.core/let [req<-input__36755__auto__ (req<-delete-environment-configuration-message "DeleteEnvironmentConfiguration" delete-environment-configuration-message)] (portkey.aws/-query-call portkey.aws.elasticbeanstalk.-2010-12-01/endpoints "POST" "/" req<-input__36755__auto__ :portkey.aws.elasticbeanstalk.-2010-12-01/delete-environment-configuration-message {:payload nil, :move {}, :headers {}, :uri {}, :querystring {}} nil nil {}))))
(clojure.spec.alpha/fdef delete-environment-configuration :args (clojure.spec.alpha/tuple :portkey.aws.elasticbeanstalk.-2010-12-01/delete-environment-configuration-message) :ret clojure.core/true?)

(clojure.core/defn terminate-environment "Terminates the specified environment." ([] (terminate-environment {})) ([terminate-environment-message] (clojure.core/let [req<-input__36755__auto__ (req<-terminate-environment-message "TerminateEnvironment" terminate-environment-message)] (portkey.aws/-query-call portkey.aws.elasticbeanstalk.-2010-12-01/endpoints "POST" "/" req<-input__36755__auto__ :portkey.aws.elasticbeanstalk.-2010-12-01/terminate-environment-message {:payload nil, :move {}, :headers {}, :uri {}, :querystring {}} nil :portkey.aws.elasticbeanstalk.-2010-12-01/environment-description {"InsufficientPrivilegesException" :portkey.aws.elasticbeanstalk.-2010-12-01/insufficient-privileges-exception}))))
(clojure.spec.alpha/fdef terminate-environment :args (clojure.spec.alpha/? :portkey.aws.elasticbeanstalk.-2010-12-01/terminate-environment-message) :ret (clojure.spec.alpha/and :portkey.aws.elasticbeanstalk.-2010-12-01/environment-description))

(clojure.core/defn checkdnsavailability "Checks if the specified CNAME is available." ([checkdnsavailability-message] (clojure.core/let [req<-input__36755__auto__ (req<-checkdnsavailability-message "CheckDNSAvailability" checkdnsavailability-message)] (portkey.aws/-query-call portkey.aws.elasticbeanstalk.-2010-12-01/endpoints "POST" "/" req<-input__36755__auto__ :portkey.aws.elasticbeanstalk.-2010-12-01/checkdnsavailability-message {:payload nil, :move {}, :headers {}, :uri {}, :querystring {}} nil :portkey.aws.elasticbeanstalk.-2010-12-01/checkdnsavailability-result-message {}))))
(clojure.spec.alpha/fdef checkdnsavailability :args (clojure.spec.alpha/tuple :portkey.aws.elasticbeanstalk.-2010-12-01/checkdnsavailability-message) :ret (clojure.spec.alpha/and :portkey.aws.elasticbeanstalk.-2010-12-01/checkdnsavailability-result-message))

(clojure.core/defn retrieve-environment-info "Retrieves the compiled information from a RequestEnvironmentInfo request.\n Related Topics\n * RequestEnvironmentInfo" ([retrieve-environment-info-message] (clojure.core/let [req<-input__36755__auto__ (req<-retrieve-environment-info-message "RetrieveEnvironmentInfo" retrieve-environment-info-message)] (portkey.aws/-query-call portkey.aws.elasticbeanstalk.-2010-12-01/endpoints "POST" "/" req<-input__36755__auto__ :portkey.aws.elasticbeanstalk.-2010-12-01/retrieve-environment-info-message {:payload nil, :move {}, :headers {}, :uri {}, :querystring {}} nil :portkey.aws.elasticbeanstalk.-2010-12-01/retrieve-environment-info-result-message {}))))
(clojure.spec.alpha/fdef retrieve-environment-info :args (clojure.spec.alpha/tuple :portkey.aws.elasticbeanstalk.-2010-12-01/retrieve-environment-info-message) :ret (clojure.spec.alpha/and :portkey.aws.elasticbeanstalk.-2010-12-01/retrieve-environment-info-result-message))

nil

(clojure.core/defn update-application "Updates the specified application to have the specified properties.\n If a property (for example, description) is not provided, the value remains\nunchanged. To clear these properties, specify an empty string." ([update-application-message] (clojure.core/let [req<-input__36755__auto__ (req<-update-application-message "UpdateApplication" update-application-message)] (portkey.aws/-query-call portkey.aws.elasticbeanstalk.-2010-12-01/endpoints "POST" "/" req<-input__36755__auto__ :portkey.aws.elasticbeanstalk.-2010-12-01/update-application-message {:payload nil, :move {}, :headers {}, :uri {}, :querystring {}} nil :portkey.aws.elasticbeanstalk.-2010-12-01/application-description-message {}))))
(clojure.spec.alpha/fdef update-application :args (clojure.spec.alpha/tuple :portkey.aws.elasticbeanstalk.-2010-12-01/update-application-message) :ret (clojure.spec.alpha/and :portkey.aws.elasticbeanstalk.-2010-12-01/application-description-message))

nil

(clojure.core/defn create-application " Creates an application that has one configuration template named default and no\napplication versions." ([create-application-message] (clojure.core/let [req<-input__36755__auto__ (req<-create-application-message "CreateApplication" create-application-message)] (portkey.aws/-query-call portkey.aws.elasticbeanstalk.-2010-12-01/endpoints "POST" "/" req<-input__36755__auto__ :portkey.aws.elasticbeanstalk.-2010-12-01/create-application-message {:payload nil, :move {}, :headers {}, :uri {}, :querystring {}} nil :portkey.aws.elasticbeanstalk.-2010-12-01/application-description-message {"TooManyApplicationsException" :portkey.aws.elasticbeanstalk.-2010-12-01/too-many-applications-exception}))))
(clojure.spec.alpha/fdef create-application :args (clojure.spec.alpha/tuple :portkey.aws.elasticbeanstalk.-2010-12-01/create-application-message) :ret (clojure.spec.alpha/and :portkey.aws.elasticbeanstalk.-2010-12-01/application-description-message))

(clojure.core/defn describe-configuration-settings "Returns a description of the settings for the specified configuration set, that\nis, either a configuration template or the configuration set associated with a\nrunning environment.\n When describing the settings for the configuration set associated with a\nrunning environment, it is possible to receive two sets of setting descriptions.\nOne is the deployed configuration set, and the other is a draft configuration of\nan environment that is either in the process of deployment or that failed to\ndeploy.\n Related Topics\n * DeleteEnvironmentConfiguration" ([describe-configuration-settings-message] (clojure.core/let [req<-input__36755__auto__ (req<-describe-configuration-settings-message "DescribeConfigurationSettings" describe-configuration-settings-message)] (portkey.aws/-query-call portkey.aws.elasticbeanstalk.-2010-12-01/endpoints "POST" "/" req<-input__36755__auto__ :portkey.aws.elasticbeanstalk.-2010-12-01/describe-configuration-settings-message {:payload nil, :move {}, :headers {}, :uri {}, :querystring {}} nil :portkey.aws.elasticbeanstalk.-2010-12-01/configuration-settings-descriptions {"TooManyBucketsException" :portkey.aws.elasticbeanstalk.-2010-12-01/too-many-buckets-exception}))))
(clojure.spec.alpha/fdef describe-configuration-settings :args (clojure.spec.alpha/tuple :portkey.aws.elasticbeanstalk.-2010-12-01/describe-configuration-settings-message) :ret (clojure.spec.alpha/and :portkey.aws.elasticbeanstalk.-2010-12-01/configuration-settings-descriptions))

(clojure.core/defn delete-application-version "Deletes the specified version from the specified application.\n You cannot delete an application version that is associated with a running\nenvironment." ([delete-application-version-message] (clojure.core/let [req<-input__36755__auto__ (req<-delete-application-version-message "DeleteApplicationVersion" delete-application-version-message)] (portkey.aws/-query-call portkey.aws.elasticbeanstalk.-2010-12-01/endpoints "POST" "/" req<-input__36755__auto__ :portkey.aws.elasticbeanstalk.-2010-12-01/delete-application-version-message {:payload nil, :move {}, :headers {}, :uri {}, :querystring {}} nil nil {"SourceBundleDeletionException" :portkey.aws.elasticbeanstalk.-2010-12-01/source-bundle-deletion-exception, "InsufficientPrivilegesException" :portkey.aws.elasticbeanstalk.-2010-12-01/insufficient-privileges-exception, "OperationInProgressException" :portkey.aws.elasticbeanstalk.-2010-12-01/operation-in-progress-exception, "S3LocationNotInServiceRegionException" :portkey.aws.elasticbeanstalk.-2010-12-01/s3-location-not-in-service-region-exception}))))
(clojure.spec.alpha/fdef delete-application-version :args (clojure.spec.alpha/tuple :portkey.aws.elasticbeanstalk.-2010-12-01/delete-application-version-message) :ret clojure.core/true?)

(clojure.core/defn delete-configuration-template "Deletes the specified configuration template.\n When you launch an environment using a configuration template, the environment\ngets a copy of the template. You can delete or modify the environment's copy of\nthe template without affecting the running environment." ([delete-configuration-template-message] (clojure.core/let [req<-input__36755__auto__ (req<-delete-configuration-template-message "DeleteConfigurationTemplate" delete-configuration-template-message)] (portkey.aws/-query-call portkey.aws.elasticbeanstalk.-2010-12-01/endpoints "POST" "/" req<-input__36755__auto__ :portkey.aws.elasticbeanstalk.-2010-12-01/delete-configuration-template-message {:payload nil, :move {}, :headers {}, :uri {}, :querystring {}} nil nil {"OperationInProgressException" :portkey.aws.elasticbeanstalk.-2010-12-01/operation-in-progress-exception}))))
(clojure.spec.alpha/fdef delete-configuration-template :args (clojure.spec.alpha/tuple :portkey.aws.elasticbeanstalk.-2010-12-01/delete-configuration-template-message) :ret clojure.core/true?)

(clojure.core/defn abort-environment-update "Cancels in-progress environment configuration update or application version\ndeployment." ([] (abort-environment-update {})) ([abort-environment-update-message] (clojure.core/let [req<-input__36755__auto__ (req<-abort-environment-update-message "AbortEnvironmentUpdate" abort-environment-update-message)] (portkey.aws/-query-call portkey.aws.elasticbeanstalk.-2010-12-01/endpoints "POST" "/" req<-input__36755__auto__ :portkey.aws.elasticbeanstalk.-2010-12-01/abort-environment-update-message {:payload nil, :move {}, :headers {}, :uri {}, :querystring {}} nil nil {"InsufficientPrivilegesException" :portkey.aws.elasticbeanstalk.-2010-12-01/insufficient-privileges-exception}))))
(clojure.spec.alpha/fdef abort-environment-update :args (clojure.spec.alpha/? :portkey.aws.elasticbeanstalk.-2010-12-01/abort-environment-update-message) :ret clojure.core/true?)

(clojure.core/defn delete-platform-version "Deletes the specified version of a custom platform." ([] (delete-platform-version {})) ([delete-platform-version-request] (clojure.core/let [req<-input__36755__auto__ (req<-delete-platform-version-request "DeletePlatformVersion" delete-platform-version-request)] (portkey.aws/-query-call portkey.aws.elasticbeanstalk.-2010-12-01/endpoints "POST" "/" req<-input__36755__auto__ :portkey.aws.elasticbeanstalk.-2010-12-01/delete-platform-version-request {:payload nil, :move {}, :headers {}, :uri {}, :querystring {}} nil :portkey.aws.elasticbeanstalk.-2010-12-01/delete-platform-version-result {"OperationInProgressException" :portkey.aws.elasticbeanstalk.-2010-12-01/operation-in-progress-exception, "InsufficientPrivilegesException" :portkey.aws.elasticbeanstalk.-2010-12-01/insufficient-privileges-exception, "ElasticBeanstalkServiceException" :portkey.aws.elasticbeanstalk.-2010-12-01/elastic-beanstalk-service-exception, "PlatformVersionStillReferencedException" :portkey.aws.elasticbeanstalk.-2010-12-01/platform-version-still-referenced-exception}))))
(clojure.spec.alpha/fdef delete-platform-version :args (clojure.spec.alpha/? :portkey.aws.elasticbeanstalk.-2010-12-01/delete-platform-version-request) :ret (clojure.spec.alpha/and :portkey.aws.elasticbeanstalk.-2010-12-01/delete-platform-version-result))

(clojure.core/defn update-configuration-template "Updates the specified configuration template to have the specified properties or\nconfiguration option values.\n If a property (for example, ApplicationName) is not provided, its value remains\nunchanged. To clear such properties, specify an empty string.\n Related Topics\n * DescribeConfigurationOptions" ([update-configuration-template-message] (clojure.core/let [req<-input__36755__auto__ (req<-update-configuration-template-message "UpdateConfigurationTemplate" update-configuration-template-message)] (portkey.aws/-query-call portkey.aws.elasticbeanstalk.-2010-12-01/endpoints "POST" "/" req<-input__36755__auto__ :portkey.aws.elasticbeanstalk.-2010-12-01/update-configuration-template-message {:payload nil, :move {}, :headers {}, :uri {}, :querystring {}} nil :portkey.aws.elasticbeanstalk.-2010-12-01/configuration-settings-description {"InsufficientPrivilegesException" :portkey.aws.elasticbeanstalk.-2010-12-01/insufficient-privileges-exception, "TooManyBucketsException" :portkey.aws.elasticbeanstalk.-2010-12-01/too-many-buckets-exception}))))
(clojure.spec.alpha/fdef update-configuration-template :args (clojure.spec.alpha/tuple :portkey.aws.elasticbeanstalk.-2010-12-01/update-configuration-template-message) :ret (clojure.spec.alpha/and :portkey.aws.elasticbeanstalk.-2010-12-01/configuration-settings-description))

(clojure.core/defn rebuild-environment "Deletes and recreates all of the AWS resources (for example: the Auto Scaling\ngroup, load balancer, etc.) for a specified environment and forces a restart." ([] (rebuild-environment {})) ([rebuild-environment-message] (clojure.core/let [req<-input__36755__auto__ (req<-rebuild-environment-message "RebuildEnvironment" rebuild-environment-message)] (portkey.aws/-query-call portkey.aws.elasticbeanstalk.-2010-12-01/endpoints "POST" "/" req<-input__36755__auto__ :portkey.aws.elasticbeanstalk.-2010-12-01/rebuild-environment-message {:payload nil, :move {}, :headers {}, :uri {}, :querystring {}} nil nil {"InsufficientPrivilegesException" :portkey.aws.elasticbeanstalk.-2010-12-01/insufficient-privileges-exception}))))
(clojure.spec.alpha/fdef rebuild-environment :args (clojure.spec.alpha/? :portkey.aws.elasticbeanstalk.-2010-12-01/rebuild-environment-message) :ret clojure.core/true?)

(clojure.core/defn update-application-version "Updates the specified application version to have the specified properties.\n If a property (for example, description) is not provided, the value remains\nunchanged. To clear properties, specify an empty string." ([update-application-version-message] (clojure.core/let [req<-input__36755__auto__ (req<-update-application-version-message "UpdateApplicationVersion" update-application-version-message)] (portkey.aws/-query-call portkey.aws.elasticbeanstalk.-2010-12-01/endpoints "POST" "/" req<-input__36755__auto__ :portkey.aws.elasticbeanstalk.-2010-12-01/update-application-version-message {:payload nil, :move {}, :headers {}, :uri {}, :querystring {}} nil :portkey.aws.elasticbeanstalk.-2010-12-01/application-version-description-message {}))))
(clojure.spec.alpha/fdef update-application-version :args (clojure.spec.alpha/tuple :portkey.aws.elasticbeanstalk.-2010-12-01/update-application-version-message) :ret (clojure.spec.alpha/and :portkey.aws.elasticbeanstalk.-2010-12-01/application-version-description-message))

(clojure.core/defn describe-application-versions "Retrieve a list of application versions." ([] (describe-application-versions {})) ([describe-application-versions-message] (clojure.core/let [req<-input__36755__auto__ (req<-describe-application-versions-message "DescribeApplicationVersions" describe-application-versions-message)] (portkey.aws/-query-call portkey.aws.elasticbeanstalk.-2010-12-01/endpoints "POST" "/" req<-input__36755__auto__ :portkey.aws.elasticbeanstalk.-2010-12-01/describe-application-versions-message {:payload nil, :move {}, :headers {}, :uri {}, :querystring {}} nil :portkey.aws.elasticbeanstalk.-2010-12-01/application-version-descriptions-message {}))))
(clojure.spec.alpha/fdef describe-application-versions :args (clojure.spec.alpha/? :portkey.aws.elasticbeanstalk.-2010-12-01/describe-application-versions-message) :ret (clojure.spec.alpha/and :portkey.aws.elasticbeanstalk.-2010-12-01/application-version-descriptions-message))

(clojure.core/defn swap-environmentcnames "Swaps the CNAMEs of two environments." ([] (swap-environmentcnames {})) ([swap-environmentcnames-message] (clojure.core/let [req<-input__36755__auto__ (req<-swap-environmentcnames-message "SwapEnvironmentCNAMEs" swap-environmentcnames-message)] (portkey.aws/-query-call portkey.aws.elasticbeanstalk.-2010-12-01/endpoints "POST" "/" req<-input__36755__auto__ :portkey.aws.elasticbeanstalk.-2010-12-01/swap-environmentcnames-message {:payload nil, :move {}, :headers {}, :uri {}, :querystring {}} nil nil {}))))
(clojure.spec.alpha/fdef swap-environmentcnames :args (clojure.spec.alpha/? :portkey.aws.elasticbeanstalk.-2010-12-01/swap-environmentcnames-message) :ret clojure.core/true?)

nil

(clojure.core/defn create-configuration-template "Creates a configuration template. Templates are associated with a specific\napplication and are used to deploy different versions of the application with\nthe same configuration settings.\n Related Topics\n * DescribeConfigurationOptions\n * DescribeConfigurationSettings\n * ListAvailableSolutionStacks" ([create-configuration-template-message] (clojure.core/let [req<-input__36755__auto__ (req<-create-configuration-template-message "CreateConfigurationTemplate" create-configuration-template-message)] (portkey.aws/-query-call portkey.aws.elasticbeanstalk.-2010-12-01/endpoints "POST" "/" req<-input__36755__auto__ :portkey.aws.elasticbeanstalk.-2010-12-01/create-configuration-template-message {:payload nil, :move {}, :headers {}, :uri {}, :querystring {}} nil :portkey.aws.elasticbeanstalk.-2010-12-01/configuration-settings-description {"InsufficientPrivilegesException" :portkey.aws.elasticbeanstalk.-2010-12-01/insufficient-privileges-exception, "TooManyBucketsException" :portkey.aws.elasticbeanstalk.-2010-12-01/too-many-buckets-exception, "TooManyConfigurationTemplatesException" :portkey.aws.elasticbeanstalk.-2010-12-01/too-many-configuration-templates-exception}))))
(clojure.spec.alpha/fdef create-configuration-template :args (clojure.spec.alpha/tuple :portkey.aws.elasticbeanstalk.-2010-12-01/create-configuration-template-message) :ret (clojure.spec.alpha/and :portkey.aws.elasticbeanstalk.-2010-12-01/configuration-settings-description))

(clojure.core/defn describe-environment-managed-action-history "Lists an environment's completed and failed managed actions." ([] (describe-environment-managed-action-history {})) ([describe-environment-managed-action-history-request] (clojure.core/let [req<-input__36755__auto__ (req<-describe-environment-managed-action-history-request "DescribeEnvironmentManagedActionHistory" describe-environment-managed-action-history-request)] (portkey.aws/-query-call portkey.aws.elasticbeanstalk.-2010-12-01/endpoints "POST" "/" req<-input__36755__auto__ :portkey.aws.elasticbeanstalk.-2010-12-01/describe-environment-managed-action-history-request {:payload nil, :move {}, :headers {}, :uri {}, :querystring {}} nil :portkey.aws.elasticbeanstalk.-2010-12-01/describe-environment-managed-action-history-result {"ElasticBeanstalkServiceException" :portkey.aws.elasticbeanstalk.-2010-12-01/elastic-beanstalk-service-exception}))))
(clojure.spec.alpha/fdef describe-environment-managed-action-history :args (clojure.spec.alpha/? :portkey.aws.elasticbeanstalk.-2010-12-01/describe-environment-managed-action-history-request) :ret (clojure.spec.alpha/and :portkey.aws.elasticbeanstalk.-2010-12-01/describe-environment-managed-action-history-result))
