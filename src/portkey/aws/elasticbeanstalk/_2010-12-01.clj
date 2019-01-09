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

(clojure.core/declare ser-version-label)

(clojure.core/declare ser-platform-filter)

(clojure.core/declare ser-source-repository)

(clojure.core/declare ser-event-severity)

(clojure.core/declare ser-platform-filter-value-list)

(clojure.core/declare ser-boxed-int)

(clojure.core/declare ser-non-empty-string)

(clojure.core/declare ser-include-deleted-back-to)

(clojure.core/declare ser-request-id)

(clojure.core/declare ser-terminate-env-force)

(clojure.core/declare ser-option-namespace)

(clojure.core/declare ser-delete-source-bundle)

(clojure.core/declare ser-boxed-boolean)

(clojure.core/declare ser-build-configuration)

(clojure.core/declare ser-solution-stack-name)

(clojure.core/declare ser-platform-name)

(clojure.core/declare ser-application-names-list)

(clojure.core/declare ser-environment-tier)

(clojure.core/declare ser-environment-name)

(clojure.core/declare ser-terminate-environment-resources)

(clojure.core/declare ser-environment-id-list)

(clojure.core/declare ser-platform-filter-type)

(clojure.core/declare ser-time-filter-end)

(clojure.core/declare ser-environment-health-attributes)

(clojure.core/declare ser-max-records)

(clojure.core/declare ser-tag-key)

(clojure.core/declare ser-application-version-lifecycle-config)

(clojure.core/declare ser-tags)

(clojure.core/declare ser-dns-cname-prefix)

(clojure.core/declare ser-group-name)

(clojure.core/declare ser-source-type)

(clojure.core/declare ser-auto-create-application)

(clojure.core/declare ser-application-resource-lifecycle-config)

(clojure.core/declare ser-version-labels-list)

(clojure.core/declare ser-next-token)

(clojure.core/declare ser-environment-info-type)

(clojure.core/declare ser-configuration-option-name)

(clojure.core/declare ser-platform-filter-value)

(clojure.core/declare ser-option-specification)

(clojure.core/declare ser-tag-list)

(clojure.core/declare ser-environment-health-attribute)

(clojure.core/declare ser-instances-health-attributes)

(clojure.core/declare ser-tag-key-list)

(clojure.core/declare ser-include-deleted)

(clojure.core/declare ser-action-status)

(clojure.core/declare ser-description)

(clojure.core/declare ser-tag-value)

(clojure.core/declare ser-configuration-option-settings-list)

(clojure.core/declare ser-configuration-option-setting)

(clojure.core/declare ser-time-filter-start)

(clojure.core/declare ser-options-specifier-list)

(clojure.core/declare ser-platform-max-records)

(clojure.core/declare ser-max-count-rule)

(clojure.core/declare ser-application-name)

(clojure.core/declare ser-platform-version)

(clojure.core/declare ser-platform-filters)

(clojure.core/declare ser-resource-name)

(clojure.core/declare ser-integer)

(clojure.core/declare ser-string)

(clojure.core/declare ser-environment-names-list)

(clojure.core/declare ser-instances-health-attribute)

(clojure.core/declare ser-s-3-key)

(clojure.core/declare ser-s-3-location)

(clojure.core/declare ser-max-age-rule)

(clojure.core/declare ser-s-3-bucket)

(clojure.core/declare ser-source-location)

(clojure.core/declare ser-platform-filter-operator)

(clojure.core/declare ser-resource-arn)

(clojure.core/declare ser-platform-arn)

(clojure.core/declare ser-tag)

(clojure.core/declare ser-compute-type)

(clojure.core/declare ser-application-version-proccess)

(clojure.core/declare ser-version-labels)

(clojure.core/declare ser-environment-id)

(clojure.core/declare ser-source-build-information)

(clojure.core/declare ser-configuration-template-name)

(clojure.core/declare ser-force-terminate)

(clojure.core/declare ser-token)

(clojure.core/declare ser-configuration-option-value)

(clojure.core/declare ser-source-configuration)

(clojure.core/defn- ser-version-label [input] #:http.request.field{:value input, :shape "VersionLabel"})

(clojure.core/defn- ser-platform-filter [input] (clojure.core/cond-> #:http.request.field{:value [], :shape "PlatformFilter", :type "structure"} (clojure.core/contains? input :type) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-platform-filter-type (input :type)) #:http.request.field{:name "Type", :shape "PlatformFilterType"})) (clojure.core/contains? input :operator) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-platform-filter-operator (input :operator)) #:http.request.field{:name "Operator", :shape "PlatformFilterOperator"})) (clojure.core/contains? input :values) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-platform-filter-value-list (input :values)) #:http.request.field{:name "Values", :shape "PlatformFilterValueList"}))))

(clojure.core/defn- ser-source-repository [input] #:http.request.field{:value (clojure.core/get {"CodeCommit" "CodeCommit", :code-commit "CodeCommit", "S3" "S3", :s-3 "S3"} input), :shape "SourceRepository"})

(clojure.core/defn- ser-event-severity [input] #:http.request.field{:value (clojure.core/get {:warn "WARN", :trace "TRACE", "WARN" "WARN", :debug "DEBUG", "ERROR" "ERROR", :fatal "FATAL", "TRACE" "TRACE", "DEBUG" "DEBUG", "FATAL" "FATAL", :info "INFO", :error "ERROR", "INFO" "INFO"} input), :shape "EventSeverity"})

(clojure.core/defn- ser-platform-filter-value-list [input] #:http.request.field{:value (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (clojure.core/merge (ser-platform-filter-value coll) #:http.request.field{:shape "PlatformFilterValue"}))) input), :shape "PlatformFilterValueList", :type "list"})

(clojure.core/defn- ser-boxed-int [input] #:http.request.field{:value input, :shape "BoxedInt"})

(clojure.core/defn- ser-non-empty-string [input] #:http.request.field{:value input, :shape "NonEmptyString"})

(clojure.core/defn- ser-include-deleted-back-to [input] #:http.request.field{:value input, :shape "IncludeDeletedBackTo"})

(clojure.core/defn- ser-request-id [input] #:http.request.field{:value input, :shape "RequestId"})

(clojure.core/defn- ser-terminate-env-force [input] #:http.request.field{:value input, :shape "TerminateEnvForce"})

(clojure.core/defn- ser-option-namespace [input] #:http.request.field{:value input, :shape "OptionNamespace"})

(clojure.core/defn- ser-delete-source-bundle [input] #:http.request.field{:value input, :shape "DeleteSourceBundle"})

(clojure.core/defn- ser-boxed-boolean [input] #:http.request.field{:value input, :shape "BoxedBoolean"})

(clojure.core/defn- ser-build-configuration [input] (clojure.core/cond-> #:http.request.field{:value [(clojure.core/into (ser-non-empty-string (:code-build-service-role input)) #:http.request.field{:name "CodeBuildServiceRole", :shape "NonEmptyString"}) (clojure.core/into (ser-non-empty-string (:image input)) #:http.request.field{:name "Image", :shape "NonEmptyString"})], :shape "BuildConfiguration", :type "structure"} (clojure.core/contains? input :artifact-name) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-string (input :artifact-name)) #:http.request.field{:name "ArtifactName", :shape "String"})) (clojure.core/contains? input :compute-type) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-compute-type (input :compute-type)) #:http.request.field{:name "ComputeType", :shape "ComputeType"})) (clojure.core/contains? input :timeout-in-minutes) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-boxed-int (input :timeout-in-minutes)) #:http.request.field{:name "TimeoutInMinutes", :shape "BoxedInt"}))))

(clojure.core/defn- ser-solution-stack-name [input] #:http.request.field{:value input, :shape "SolutionStackName"})

(clojure.core/defn- ser-platform-name [input] #:http.request.field{:value input, :shape "PlatformName"})

(clojure.core/defn- ser-application-names-list [input] #:http.request.field{:value (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (clojure.core/merge (ser-application-name coll) #:http.request.field{:shape "ApplicationName"}))) input), :shape "ApplicationNamesList", :type "list"})

(clojure.core/defn- ser-environment-tier [input] (clojure.core/cond-> #:http.request.field{:value [], :shape "EnvironmentTier", :type "structure"} (clojure.core/contains? input :name) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-string (input :name)) #:http.request.field{:name "Name", :shape "String"})) (clojure.core/contains? input :type) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-string (input :type)) #:http.request.field{:name "Type", :shape "String"})) (clojure.core/contains? input :version) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-string (input :version)) #:http.request.field{:name "Version", :shape "String"}))))

(clojure.core/defn- ser-environment-name [input] #:http.request.field{:value input, :shape "EnvironmentName"})

(clojure.core/defn- ser-terminate-environment-resources [input] #:http.request.field{:value input, :shape "TerminateEnvironmentResources"})

(clojure.core/defn- ser-environment-id-list [input] #:http.request.field{:value (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (clojure.core/merge (ser-environment-id coll) #:http.request.field{:shape "EnvironmentId"}))) input), :shape "EnvironmentIdList", :type "list"})

(clojure.core/defn- ser-platform-filter-type [input] #:http.request.field{:value input, :shape "PlatformFilterType"})

(clojure.core/defn- ser-time-filter-end [input] #:http.request.field{:value input, :shape "TimeFilterEnd"})

(clojure.core/defn- ser-environment-health-attributes [input] #:http.request.field{:value (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (clojure.core/merge (ser-environment-health-attribute coll) #:http.request.field{:shape "EnvironmentHealthAttribute"}))) input), :shape "EnvironmentHealthAttributes", :type "list"})

(clojure.core/defn- ser-max-records [input] #:http.request.field{:value input, :shape "MaxRecords"})

(clojure.core/defn- ser-tag-key [input] #:http.request.field{:value input, :shape "TagKey"})

(clojure.core/defn- ser-application-version-lifecycle-config [input] (clojure.core/cond-> #:http.request.field{:value [], :shape "ApplicationVersionLifecycleConfig", :type "structure"} (clojure.core/contains? input :max-count-rule) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-max-count-rule (input :max-count-rule)) #:http.request.field{:name "MaxCountRule", :shape "MaxCountRule"})) (clojure.core/contains? input :max-age-rule) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-max-age-rule (input :max-age-rule)) #:http.request.field{:name "MaxAgeRule", :shape "MaxAgeRule"}))))

(clojure.core/defn- ser-tags [input] #:http.request.field{:value (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (clojure.core/merge (ser-tag coll) #:http.request.field{:shape "Tag"}))) input), :shape "Tags", :type "list"})

(clojure.core/defn- ser-dns-cname-prefix [input] #:http.request.field{:value input, :shape "DNSCnamePrefix"})

(clojure.core/defn- ser-group-name [input] #:http.request.field{:value input, :shape "GroupName"})

(clojure.core/defn- ser-source-type [input] #:http.request.field{:value (clojure.core/get {"Git" "Git", :git "Git", "Zip" "Zip", :zip "Zip"} input), :shape "SourceType"})

(clojure.core/defn- ser-auto-create-application [input] #:http.request.field{:value input, :shape "AutoCreateApplication"})

(clojure.core/defn- ser-application-resource-lifecycle-config [input] (clojure.core/cond-> #:http.request.field{:value [], :shape "ApplicationResourceLifecycleConfig", :type "structure"} (clojure.core/contains? input :service-role) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-string (input :service-role)) #:http.request.field{:name "ServiceRole", :shape "String"})) (clojure.core/contains? input :version-lifecycle-config) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-application-version-lifecycle-config (input :version-lifecycle-config)) #:http.request.field{:name "VersionLifecycleConfig", :shape "ApplicationVersionLifecycleConfig"}))))

(clojure.core/defn- ser-version-labels-list [input] #:http.request.field{:value (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (clojure.core/merge (ser-version-label coll) #:http.request.field{:shape "VersionLabel"}))) input), :shape "VersionLabelsList", :type "list"})

(clojure.core/defn- ser-next-token [input] #:http.request.field{:value input, :shape "NextToken"})

(clojure.core/defn- ser-environment-info-type [input] #:http.request.field{:value (clojure.core/get {"tail" "tail", :tail "tail", "bundle" "bundle", :bundle "bundle"} input), :shape "EnvironmentInfoType"})

(clojure.core/defn- ser-configuration-option-name [input] #:http.request.field{:value input, :shape "ConfigurationOptionName"})

(clojure.core/defn- ser-platform-filter-value [input] #:http.request.field{:value input, :shape "PlatformFilterValue"})

(clojure.core/defn- ser-option-specification [input] (clojure.core/cond-> #:http.request.field{:value [], :shape "OptionSpecification", :type "structure"} (clojure.core/contains? input :resource-name) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-resource-name (input :resource-name)) #:http.request.field{:name "ResourceName", :shape "ResourceName"})) (clojure.core/contains? input :namespace) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-option-namespace (input :namespace)) #:http.request.field{:name "Namespace", :shape "OptionNamespace"})) (clojure.core/contains? input :option-name) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-configuration-option-name (input :option-name)) #:http.request.field{:name "OptionName", :shape "ConfigurationOptionName"}))))

(clojure.core/defn- ser-tag-list [input] #:http.request.field{:value (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (clojure.core/merge (ser-tag coll) #:http.request.field{:shape "Tag"}))) input), :shape "TagList", :type "list"})

(clojure.core/defn- ser-environment-health-attribute [input] #:http.request.field{:value (clojure.core/get {:health-status "HealthStatus", :instances-health "InstancesHealth", :application-metrics "ApplicationMetrics", :color "Color", "HealthStatus" "HealthStatus", "InstancesHealth" "InstancesHealth", "Status" "Status", :all "All", "Causes" "Causes", :status "Status", "ApplicationMetrics" "ApplicationMetrics", :refreshed-at "RefreshedAt", "RefreshedAt" "RefreshedAt", "All" "All", "Color" "Color", :causes "Causes"} input), :shape "EnvironmentHealthAttribute"})

(clojure.core/defn- ser-instances-health-attributes [input] #:http.request.field{:value (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (clojure.core/merge (ser-instances-health-attribute coll) #:http.request.field{:shape "InstancesHealthAttribute"}))) input), :shape "InstancesHealthAttributes", :type "list"})

(clojure.core/defn- ser-tag-key-list [input] #:http.request.field{:value (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (clojure.core/merge (ser-tag-key coll) #:http.request.field{:shape "TagKey"}))) input), :shape "TagKeyList", :type "list"})

(clojure.core/defn- ser-include-deleted [input] #:http.request.field{:value input, :shape "IncludeDeleted"})

(clojure.core/defn- ser-action-status [input] #:http.request.field{:value (clojure.core/get {"Scheduled" "Scheduled", :scheduled "Scheduled", "Pending" "Pending", :pending "Pending", "Running" "Running", :running "Running", "Unknown" "Unknown", :unknown "Unknown"} input), :shape "ActionStatus"})

(clojure.core/defn- ser-description [input] #:http.request.field{:value input, :shape "Description"})

(clojure.core/defn- ser-tag-value [input] #:http.request.field{:value input, :shape "TagValue"})

(clojure.core/defn- ser-configuration-option-settings-list [input] #:http.request.field{:value (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (clojure.core/merge (ser-configuration-option-setting coll) #:http.request.field{:shape "ConfigurationOptionSetting"}))) input), :shape "ConfigurationOptionSettingsList", :type "list"})

(clojure.core/defn- ser-configuration-option-setting [input] (clojure.core/cond-> #:http.request.field{:value [], :shape "ConfigurationOptionSetting", :type "structure"} (clojure.core/contains? input :resource-name) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-resource-name (input :resource-name)) #:http.request.field{:name "ResourceName", :shape "ResourceName"})) (clojure.core/contains? input :namespace) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-option-namespace (input :namespace)) #:http.request.field{:name "Namespace", :shape "OptionNamespace"})) (clojure.core/contains? input :option-name) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-configuration-option-name (input :option-name)) #:http.request.field{:name "OptionName", :shape "ConfigurationOptionName"})) (clojure.core/contains? input :value) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-configuration-option-value (input :value)) #:http.request.field{:name "Value", :shape "ConfigurationOptionValue"}))))

(clojure.core/defn- ser-time-filter-start [input] #:http.request.field{:value input, :shape "TimeFilterStart"})

(clojure.core/defn- ser-options-specifier-list [input] #:http.request.field{:value (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (clojure.core/merge (ser-option-specification coll) #:http.request.field{:shape "OptionSpecification"}))) input), :shape "OptionsSpecifierList", :type "list"})

(clojure.core/defn- ser-platform-max-records [input] #:http.request.field{:value input, :shape "PlatformMaxRecords"})

(clojure.core/defn- ser-max-count-rule [input] (clojure.core/cond-> #:http.request.field{:value [(clojure.core/into (ser-boxed-boolean (:enabled input)) #:http.request.field{:name "Enabled", :shape "BoxedBoolean"})], :shape "MaxCountRule", :type "structure"} (clojure.core/contains? input :max-count) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-boxed-int (input :max-count)) #:http.request.field{:name "MaxCount", :shape "BoxedInt"})) (clojure.core/contains? input :delete-source-from-s-3) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-boxed-boolean (input :delete-source-from-s-3)) #:http.request.field{:name "DeleteSourceFromS3", :shape "BoxedBoolean"}))))

(clojure.core/defn- ser-application-name [input] #:http.request.field{:value input, :shape "ApplicationName"})

(clojure.core/defn- ser-platform-version [input] #:http.request.field{:value input, :shape "PlatformVersion"})

(clojure.core/defn- ser-platform-filters [input] #:http.request.field{:value (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (clojure.core/merge (ser-platform-filter coll) #:http.request.field{:shape "PlatformFilter"}))) input), :shape "PlatformFilters", :type "list"})

(clojure.core/defn- ser-resource-name [input] #:http.request.field{:value input, :shape "ResourceName"})

(clojure.core/defn- ser-integer [input] #:http.request.field{:value input, :shape "Integer"})

(clojure.core/defn- ser-string [input] #:http.request.field{:value input, :shape "String"})

(clojure.core/defn- ser-environment-names-list [input] #:http.request.field{:value (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (clojure.core/merge (ser-environment-name coll) #:http.request.field{:shape "EnvironmentName"}))) input), :shape "EnvironmentNamesList", :type "list"})

(clojure.core/defn- ser-instances-health-attribute [input] #:http.request.field{:value (clojure.core/get {:health-status "HealthStatus", "Deployment" "Deployment", "LaunchedAt" "LaunchedAt", :application-metrics "ApplicationMetrics", :system "System", :color "Color", "InstanceType" "InstanceType", "HealthStatus" "HealthStatus", :instance-type "InstanceType", "AvailabilityZone" "AvailabilityZone", :availability-zone "AvailabilityZone", :all "All", "Causes" "Causes", "ApplicationMetrics" "ApplicationMetrics", :deployment "Deployment", :refreshed-at "RefreshedAt", "RefreshedAt" "RefreshedAt", "System" "System", "All" "All", "Color" "Color", :causes "Causes", :launched-at "LaunchedAt"} input), :shape "InstancesHealthAttribute"})

(clojure.core/defn- ser-s-3-key [input] #:http.request.field{:value input, :shape "S3Key"})

(clojure.core/defn- ser-s-3-location [input] (clojure.core/cond-> #:http.request.field{:value [], :shape "S3Location", :type "structure"} (clojure.core/contains? input :s-3-bucket) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-s-3-bucket (input :s-3-bucket)) #:http.request.field{:name "S3Bucket", :shape "S3Bucket"})) (clojure.core/contains? input :s-3-key) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-s-3-key (input :s-3-key)) #:http.request.field{:name "S3Key", :shape "S3Key"}))))

(clojure.core/defn- ser-max-age-rule [input] (clojure.core/cond-> #:http.request.field{:value [(clojure.core/into (ser-boxed-boolean (:enabled input)) #:http.request.field{:name "Enabled", :shape "BoxedBoolean"})], :shape "MaxAgeRule", :type "structure"} (clojure.core/contains? input :max-age-in-days) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-boxed-int (input :max-age-in-days)) #:http.request.field{:name "MaxAgeInDays", :shape "BoxedInt"})) (clojure.core/contains? input :delete-source-from-s-3) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-boxed-boolean (input :delete-source-from-s-3)) #:http.request.field{:name "DeleteSourceFromS3", :shape "BoxedBoolean"}))))

(clojure.core/defn- ser-s-3-bucket [input] #:http.request.field{:value input, :shape "S3Bucket"})

(clojure.core/defn- ser-source-location [input] #:http.request.field{:value input, :shape "SourceLocation"})

(clojure.core/defn- ser-platform-filter-operator [input] #:http.request.field{:value input, :shape "PlatformFilterOperator"})

(clojure.core/defn- ser-resource-arn [input] #:http.request.field{:value input, :shape "ResourceArn"})

(clojure.core/defn- ser-platform-arn [input] #:http.request.field{:value input, :shape "PlatformArn"})

(clojure.core/defn- ser-tag [input] (clojure.core/cond-> #:http.request.field{:value [], :shape "Tag", :type "structure"} (clojure.core/contains? input :key) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-tag-key (input :key)) #:http.request.field{:name "Key", :shape "TagKey"})) (clojure.core/contains? input :value) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-tag-value (input :value)) #:http.request.field{:name "Value", :shape "TagValue"}))))

(clojure.core/defn- ser-compute-type [input] #:http.request.field{:value (clojure.core/get {"BUILD_GENERAL1_SMALL" "BUILD_GENERAL1_SMALL", :build-general-1-small "BUILD_GENERAL1_SMALL", "BUILD_GENERAL1_MEDIUM" "BUILD_GENERAL1_MEDIUM", :build-general-1-medium "BUILD_GENERAL1_MEDIUM", "BUILD_GENERAL1_LARGE" "BUILD_GENERAL1_LARGE", :build-general-1-large "BUILD_GENERAL1_LARGE"} input), :shape "ComputeType"})

(clojure.core/defn- ser-application-version-proccess [input] #:http.request.field{:value input, :shape "ApplicationVersionProccess"})

(clojure.core/defn- ser-version-labels [input] #:http.request.field{:value (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (clojure.core/merge (ser-version-label coll) #:http.request.field{:shape "VersionLabel"}))) input), :shape "VersionLabels", :type "list"})

(clojure.core/defn- ser-environment-id [input] #:http.request.field{:value input, :shape "EnvironmentId"})

(clojure.core/defn- ser-source-build-information [input] (clojure.core/cond-> #:http.request.field{:value [(clojure.core/into (ser-source-type (:source-type input)) #:http.request.field{:name "SourceType", :shape "SourceType"}) (clojure.core/into (ser-source-repository (:source-repository input)) #:http.request.field{:name "SourceRepository", :shape "SourceRepository"}) (clojure.core/into (ser-source-location (:source-location input)) #:http.request.field{:name "SourceLocation", :shape "SourceLocation"})], :shape "SourceBuildInformation", :type "structure"}))

(clojure.core/defn- ser-configuration-template-name [input] #:http.request.field{:value input, :shape "ConfigurationTemplateName"})

(clojure.core/defn- ser-force-terminate [input] #:http.request.field{:value input, :shape "ForceTerminate"})

(clojure.core/defn- ser-token [input] #:http.request.field{:value input, :shape "Token"})

(clojure.core/defn- ser-configuration-option-value [input] #:http.request.field{:value input, :shape "ConfigurationOptionValue"})

(clojure.core/defn- ser-source-configuration [input] (clojure.core/cond-> #:http.request.field{:value [], :shape "SourceConfiguration", :type "structure"} (clojure.core/contains? input :application-name) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-application-name (input :application-name)) #:http.request.field{:name "ApplicationName", :shape "ApplicationName"})) (clojure.core/contains? input :template-name) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-configuration-template-name (input :template-name)) #:http.request.field{:name "TemplateName", :shape "ConfigurationTemplateName"}))))

(clojure.core/defn- req-describe-environment-resources-message [input] (clojure.core/cond-> {} (clojure.core/contains? input :environment-id) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-environment-id (input :environment-id)) #:http.request.field{:name "EnvironmentId", :shape "EnvironmentId"})) (clojure.core/contains? input :environment-name) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-environment-name (input :environment-name)) #:http.request.field{:name "EnvironmentName", :shape "EnvironmentName"}))))

(clojure.core/defn- req-update-application-resource-lifecycle-message [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (ser-application-name (input :application-name)) #:http.request.field{:name "ApplicationName", :shape "ApplicationName"}) (clojure.core/into (ser-application-resource-lifecycle-config (input :resource-lifecycle-config)) #:http.request.field{:name "ResourceLifecycleConfig", :shape "ApplicationResourceLifecycleConfig"})]}))

(clojure.core/defn- req-describe-environments-message [input] (clojure.core/cond-> {} (clojure.core/contains? input :application-name) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-application-name (input :application-name)) #:http.request.field{:name "ApplicationName", :shape "ApplicationName"})) (clojure.core/contains? input :version-label) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-version-label (input :version-label)) #:http.request.field{:name "VersionLabel", :shape "VersionLabel"})) (clojure.core/contains? input :environment-ids) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-environment-id-list (input :environment-ids)) #:http.request.field{:name "EnvironmentIds", :shape "EnvironmentIdList"})) (clojure.core/contains? input :environment-names) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-environment-names-list (input :environment-names)) #:http.request.field{:name "EnvironmentNames", :shape "EnvironmentNamesList"})) (clojure.core/contains? input :include-deleted) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-include-deleted (input :include-deleted)) #:http.request.field{:name "IncludeDeleted", :shape "IncludeDeleted"})) (clojure.core/contains? input :included-deleted-back-to) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-include-deleted-back-to (input :included-deleted-back-to)) #:http.request.field{:name "IncludedDeletedBackTo", :shape "IncludeDeletedBackTo"})) (clojure.core/contains? input :max-records) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-max-records (input :max-records)) #:http.request.field{:name "MaxRecords", :shape "MaxRecords"})) (clojure.core/contains? input :next-token) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-token (input :next-token)) #:http.request.field{:name "NextToken", :shape "Token"}))))

(clojure.core/defn- req-update-environment-message [input] (clojure.core/cond-> {} (clojure.core/contains? input :version-label) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-version-label (input :version-label)) #:http.request.field{:name "VersionLabel", :shape "VersionLabel"})) (clojure.core/contains? input :tier) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-environment-tier (input :tier)) #:http.request.field{:name "Tier", :shape "EnvironmentTier"})) (clojure.core/contains? input :solution-stack-name) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-solution-stack-name (input :solution-stack-name)) #:http.request.field{:name "SolutionStackName", :shape "SolutionStackName"})) (clojure.core/contains? input :environment-name) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-environment-name (input :environment-name)) #:http.request.field{:name "EnvironmentName", :shape "EnvironmentName"})) (clojure.core/contains? input :option-settings) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-configuration-option-settings-list (input :option-settings)) #:http.request.field{:name "OptionSettings", :shape "ConfigurationOptionSettingsList"})) (clojure.core/contains? input :group-name) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-group-name (input :group-name)) #:http.request.field{:name "GroupName", :shape "GroupName"})) (clojure.core/contains? input :description) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-description (input :description)) #:http.request.field{:name "Description", :shape "Description"})) (clojure.core/contains? input :application-name) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-application-name (input :application-name)) #:http.request.field{:name "ApplicationName", :shape "ApplicationName"})) (clojure.core/contains? input :template-name) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-configuration-template-name (input :template-name)) #:http.request.field{:name "TemplateName", :shape "ConfigurationTemplateName"})) (clojure.core/contains? input :platform-arn) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-platform-arn (input :platform-arn)) #:http.request.field{:name "PlatformArn", :shape "PlatformArn"})) (clojure.core/contains? input :options-to-remove) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-options-specifier-list (input :options-to-remove)) #:http.request.field{:name "OptionsToRemove", :shape "OptionsSpecifierList"})) (clojure.core/contains? input :environment-id) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-environment-id (input :environment-id)) #:http.request.field{:name "EnvironmentId", :shape "EnvironmentId"}))))

(clojure.core/defn- req-describe-environment-health-request [input] (clojure.core/cond-> {} (clojure.core/contains? input :environment-name) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-environment-name (input :environment-name)) #:http.request.field{:name "EnvironmentName", :shape "EnvironmentName"})) (clojure.core/contains? input :environment-id) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-environment-id (input :environment-id)) #:http.request.field{:name "EnvironmentId", :shape "EnvironmentId"})) (clojure.core/contains? input :attribute-names) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-environment-health-attributes (input :attribute-names)) #:http.request.field{:name "AttributeNames", :shape "EnvironmentHealthAttributes"}))))

(clojure.core/defn- req-describe-environment-managed-action-history-request [input] (clojure.core/cond-> {} (clojure.core/contains? input :environment-id) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-environment-id (input :environment-id)) #:http.request.field{:name "EnvironmentId", :shape "EnvironmentId"})) (clojure.core/contains? input :environment-name) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-environment-name (input :environment-name)) #:http.request.field{:name "EnvironmentName", :shape "EnvironmentName"})) (clojure.core/contains? input :next-token) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-string (input :next-token)) #:http.request.field{:name "NextToken", :shape "String"})) (clojure.core/contains? input :max-items) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-integer (input :max-items)) #:http.request.field{:name "MaxItems", :shape "Integer"}))))

(clojure.core/defn- req-check-dns-availability-message [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (ser-dns-cname-prefix (input :cname-prefix)) #:http.request.field{:name "CNAMEPrefix", :shape "DNSCnamePrefix"})]}))

(clojure.core/defn- req-describe-platform-version-request [input] (clojure.core/cond-> {} (clojure.core/contains? input :platform-arn) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-platform-arn (input :platform-arn)) #:http.request.field{:name "PlatformArn", :shape "PlatformArn"}))))

(clojure.core/defn- req-create-application-message [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (ser-application-name (input :application-name)) #:http.request.field{:name "ApplicationName", :shape "ApplicationName"})]} (clojure.core/contains? input :description) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-description (input :description)) #:http.request.field{:name "Description", :shape "Description"})) (clojure.core/contains? input :resource-lifecycle-config) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-application-resource-lifecycle-config (input :resource-lifecycle-config)) #:http.request.field{:name "ResourceLifecycleConfig", :shape "ApplicationResourceLifecycleConfig"}))))

(clojure.core/defn- req-describe-instances-health-request [input] (clojure.core/cond-> {} (clojure.core/contains? input :environment-name) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-environment-name (input :environment-name)) #:http.request.field{:name "EnvironmentName", :shape "EnvironmentName"})) (clojure.core/contains? input :environment-id) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-environment-id (input :environment-id)) #:http.request.field{:name "EnvironmentId", :shape "EnvironmentId"})) (clojure.core/contains? input :attribute-names) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-instances-health-attributes (input :attribute-names)) #:http.request.field{:name "AttributeNames", :shape "InstancesHealthAttributes"})) (clojure.core/contains? input :next-token) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-next-token (input :next-token)) #:http.request.field{:name "NextToken", :shape "NextToken"}))))

(clojure.core/defn- req-describe-events-message [input] (clojure.core/cond-> {} (clojure.core/contains? input :version-label) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-version-label (input :version-label)) #:http.request.field{:name "VersionLabel", :shape "VersionLabel"})) (clojure.core/contains? input :severity) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-event-severity (input :severity)) #:http.request.field{:name "Severity", :shape "EventSeverity"})) (clojure.core/contains? input :end-time) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-time-filter-end (input :end-time)) #:http.request.field{:name "EndTime", :shape "TimeFilterEnd"})) (clojure.core/contains? input :request-id) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-request-id (input :request-id)) #:http.request.field{:name "RequestId", :shape "RequestId"})) (clojure.core/contains? input :start-time) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-time-filter-start (input :start-time)) #:http.request.field{:name "StartTime", :shape "TimeFilterStart"})) (clojure.core/contains? input :environment-name) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-environment-name (input :environment-name)) #:http.request.field{:name "EnvironmentName", :shape "EnvironmentName"})) (clojure.core/contains? input :max-records) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-max-records (input :max-records)) #:http.request.field{:name "MaxRecords", :shape "MaxRecords"})) (clojure.core/contains? input :next-token) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-token (input :next-token)) #:http.request.field{:name "NextToken", :shape "Token"})) (clojure.core/contains? input :application-name) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-application-name (input :application-name)) #:http.request.field{:name "ApplicationName", :shape "ApplicationName"})) (clojure.core/contains? input :template-name) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-configuration-template-name (input :template-name)) #:http.request.field{:name "TemplateName", :shape "ConfigurationTemplateName"})) (clojure.core/contains? input :platform-arn) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-platform-arn (input :platform-arn)) #:http.request.field{:name "PlatformArn", :shape "PlatformArn"})) (clojure.core/contains? input :environment-id) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-environment-id (input :environment-id)) #:http.request.field{:name "EnvironmentId", :shape "EnvironmentId"}))))

(clojure.core/defn- req-describe-environment-managed-actions-request [input] (clojure.core/cond-> {} (clojure.core/contains? input :environment-name) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-string (input :environment-name)) #:http.request.field{:name "EnvironmentName", :shape "String"})) (clojure.core/contains? input :environment-id) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-string (input :environment-id)) #:http.request.field{:name "EnvironmentId", :shape "String"})) (clojure.core/contains? input :status) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-action-status (input :status)) #:http.request.field{:name "Status", :shape "ActionStatus"}))))

(clojure.core/defn- req-describe-configuration-options-message [input] (clojure.core/cond-> {} (clojure.core/contains? input :application-name) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-application-name (input :application-name)) #:http.request.field{:name "ApplicationName", :shape "ApplicationName"})) (clojure.core/contains? input :template-name) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-configuration-template-name (input :template-name)) #:http.request.field{:name "TemplateName", :shape "ConfigurationTemplateName"})) (clojure.core/contains? input :environment-name) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-environment-name (input :environment-name)) #:http.request.field{:name "EnvironmentName", :shape "EnvironmentName"})) (clojure.core/contains? input :solution-stack-name) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-solution-stack-name (input :solution-stack-name)) #:http.request.field{:name "SolutionStackName", :shape "SolutionStackName"})) (clojure.core/contains? input :platform-arn) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-platform-arn (input :platform-arn)) #:http.request.field{:name "PlatformArn", :shape "PlatformArn"})) (clojure.core/contains? input :options) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-options-specifier-list (input :options)) #:http.request.field{:name "Options", :shape "OptionsSpecifierList"}))))

(clojure.core/defn- req-create-environment-message [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (ser-application-name (input :application-name)) #:http.request.field{:name "ApplicationName", :shape "ApplicationName"})]} (clojure.core/contains? input :version-label) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-version-label (input :version-label)) #:http.request.field{:name "VersionLabel", :shape "VersionLabel"})) (clojure.core/contains? input :tier) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-environment-tier (input :tier)) #:http.request.field{:name "Tier", :shape "EnvironmentTier"})) (clojure.core/contains? input :solution-stack-name) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-solution-stack-name (input :solution-stack-name)) #:http.request.field{:name "SolutionStackName", :shape "SolutionStackName"})) (clojure.core/contains? input :environment-name) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-environment-name (input :environment-name)) #:http.request.field{:name "EnvironmentName", :shape "EnvironmentName"})) (clojure.core/contains? input :option-settings) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-configuration-option-settings-list (input :option-settings)) #:http.request.field{:name "OptionSettings", :shape "ConfigurationOptionSettingsList"})) (clojure.core/contains? input :tags) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-tags (input :tags)) #:http.request.field{:name "Tags", :shape "Tags"})) (clojure.core/contains? input :group-name) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-group-name (input :group-name)) #:http.request.field{:name "GroupName", :shape "GroupName"})) (clojure.core/contains? input :description) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-description (input :description)) #:http.request.field{:name "Description", :shape "Description"})) (clojure.core/contains? input :cname-prefix) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-dns-cname-prefix (input :cname-prefix)) #:http.request.field{:name "CNAMEPrefix", :shape "DNSCnamePrefix"})) (clojure.core/contains? input :template-name) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-configuration-template-name (input :template-name)) #:http.request.field{:name "TemplateName", :shape "ConfigurationTemplateName"})) (clojure.core/contains? input :platform-arn) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-platform-arn (input :platform-arn)) #:http.request.field{:name "PlatformArn", :shape "PlatformArn"})) (clojure.core/contains? input :options-to-remove) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-options-specifier-list (input :options-to-remove)) #:http.request.field{:name "OptionsToRemove", :shape "OptionsSpecifierList"}))))

(clojure.core/defn- req-delete-application-message [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (ser-application-name (input :application-name)) #:http.request.field{:name "ApplicationName", :shape "ApplicationName"})]} (clojure.core/contains? input :terminate-env-by-force) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-terminate-env-force (input :terminate-env-by-force)) #:http.request.field{:name "TerminateEnvByForce", :shape "TerminateEnvForce"}))))

(clojure.core/defn- req-update-configuration-template-message [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (ser-application-name (input :application-name)) #:http.request.field{:name "ApplicationName", :shape "ApplicationName"}) (clojure.core/into (ser-configuration-template-name (input :template-name)) #:http.request.field{:name "TemplateName", :shape "ConfigurationTemplateName"})]} (clojure.core/contains? input :description) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-description (input :description)) #:http.request.field{:name "Description", :shape "Description"})) (clojure.core/contains? input :option-settings) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-configuration-option-settings-list (input :option-settings)) #:http.request.field{:name "OptionSettings", :shape "ConfigurationOptionSettingsList"})) (clojure.core/contains? input :options-to-remove) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-options-specifier-list (input :options-to-remove)) #:http.request.field{:name "OptionsToRemove", :shape "OptionsSpecifierList"}))))

(clojure.core/defn- req-retrieve-environment-info-message [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (ser-environment-info-type (input :info-type)) #:http.request.field{:name "InfoType", :shape "EnvironmentInfoType"})]} (clojure.core/contains? input :environment-id) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-environment-id (input :environment-id)) #:http.request.field{:name "EnvironmentId", :shape "EnvironmentId"})) (clojure.core/contains? input :environment-name) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-environment-name (input :environment-name)) #:http.request.field{:name "EnvironmentName", :shape "EnvironmentName"}))))

(clojure.core/defn- req-swap-environment-cnam-es-message [input] (clojure.core/cond-> {} (clojure.core/contains? input :source-environment-id) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-environment-id (input :source-environment-id)) #:http.request.field{:name "SourceEnvironmentId", :shape "EnvironmentId"})) (clojure.core/contains? input :source-environment-name) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-environment-name (input :source-environment-name)) #:http.request.field{:name "SourceEnvironmentName", :shape "EnvironmentName"})) (clojure.core/contains? input :destination-environment-id) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-environment-id (input :destination-environment-id)) #:http.request.field{:name "DestinationEnvironmentId", :shape "EnvironmentId"})) (clojure.core/contains? input :destination-environment-name) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-environment-name (input :destination-environment-name)) #:http.request.field{:name "DestinationEnvironmentName", :shape "EnvironmentName"}))))

(clojure.core/defn- req-delete-application-version-message [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (ser-application-name (input :application-name)) #:http.request.field{:name "ApplicationName", :shape "ApplicationName"}) (clojure.core/into (ser-version-label (input :version-label)) #:http.request.field{:name "VersionLabel", :shape "VersionLabel"})]} (clojure.core/contains? input :delete-source-bundle) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-delete-source-bundle (input :delete-source-bundle)) #:http.request.field{:name "DeleteSourceBundle", :shape "DeleteSourceBundle"}))))

(clojure.core/defn- req-update-application-message [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (ser-application-name (input :application-name)) #:http.request.field{:name "ApplicationName", :shape "ApplicationName"})]} (clojure.core/contains? input :description) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-description (input :description)) #:http.request.field{:name "Description", :shape "Description"}))))

(clojure.core/defn- req-update-tags-for-resource-message [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (ser-resource-arn (input :resource-arn)) #:http.request.field{:name "ResourceArn", :shape "ResourceArn"})]} (clojure.core/contains? input :tags-to-add) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-tag-list (input :tags-to-add)) #:http.request.field{:name "TagsToAdd", :shape "TagList"})) (clojure.core/contains? input :tags-to-remove) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-tag-key-list (input :tags-to-remove)) #:http.request.field{:name "TagsToRemove", :shape "TagKeyList"}))))

(clojure.core/defn- req-delete-platform-version-request [input] (clojure.core/cond-> {} (clojure.core/contains? input :platform-arn) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-platform-arn (input :platform-arn)) #:http.request.field{:name "PlatformArn", :shape "PlatformArn"}))))

(clojure.core/defn- req-delete-environment-configuration-message [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (ser-application-name (input :application-name)) #:http.request.field{:name "ApplicationName", :shape "ApplicationName"}) (clojure.core/into (ser-environment-name (input :environment-name)) #:http.request.field{:name "EnvironmentName", :shape "EnvironmentName"})]}))

(clojure.core/defn- req-delete-configuration-template-message [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (ser-application-name (input :application-name)) #:http.request.field{:name "ApplicationName", :shape "ApplicationName"}) (clojure.core/into (ser-configuration-template-name (input :template-name)) #:http.request.field{:name "TemplateName", :shape "ConfigurationTemplateName"})]}))

(clojure.core/defn- req-create-configuration-template-message [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (ser-application-name (input :application-name)) #:http.request.field{:name "ApplicationName", :shape "ApplicationName"}) (clojure.core/into (ser-configuration-template-name (input :template-name)) #:http.request.field{:name "TemplateName", :shape "ConfigurationTemplateName"})]} (clojure.core/contains? input :solution-stack-name) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-solution-stack-name (input :solution-stack-name)) #:http.request.field{:name "SolutionStackName", :shape "SolutionStackName"})) (clojure.core/contains? input :platform-arn) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-platform-arn (input :platform-arn)) #:http.request.field{:name "PlatformArn", :shape "PlatformArn"})) (clojure.core/contains? input :source-configuration) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-source-configuration (input :source-configuration)) #:http.request.field{:name "SourceConfiguration", :shape "SourceConfiguration"})) (clojure.core/contains? input :environment-id) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-environment-id (input :environment-id)) #:http.request.field{:name "EnvironmentId", :shape "EnvironmentId"})) (clojure.core/contains? input :description) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-description (input :description)) #:http.request.field{:name "Description", :shape "Description"})) (clojure.core/contains? input :option-settings) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-configuration-option-settings-list (input :option-settings)) #:http.request.field{:name "OptionSettings", :shape "ConfigurationOptionSettingsList"}))))

(clojure.core/defn- req-describe-application-versions-message [input] (clojure.core/cond-> {} (clojure.core/contains? input :application-name) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-application-name (input :application-name)) #:http.request.field{:name "ApplicationName", :shape "ApplicationName"})) (clojure.core/contains? input :version-labels) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-version-labels-list (input :version-labels)) #:http.request.field{:name "VersionLabels", :shape "VersionLabelsList"})) (clojure.core/contains? input :max-records) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-max-records (input :max-records)) #:http.request.field{:name "MaxRecords", :shape "MaxRecords"})) (clojure.core/contains? input :next-token) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-token (input :next-token)) #:http.request.field{:name "NextToken", :shape "Token"}))))

(clojure.core/defn- req-terminate-environment-message [input] (clojure.core/cond-> {} (clojure.core/contains? input :environment-id) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-environment-id (input :environment-id)) #:http.request.field{:name "EnvironmentId", :shape "EnvironmentId"})) (clojure.core/contains? input :environment-name) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-environment-name (input :environment-name)) #:http.request.field{:name "EnvironmentName", :shape "EnvironmentName"})) (clojure.core/contains? input :terminate-resources) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-terminate-environment-resources (input :terminate-resources)) #:http.request.field{:name "TerminateResources", :shape "TerminateEnvironmentResources"})) (clojure.core/contains? input :force-terminate) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-force-terminate (input :force-terminate)) #:http.request.field{:name "ForceTerminate", :shape "ForceTerminate"}))))

(clojure.core/defn- req-compose-environments-message [input] (clojure.core/cond-> {} (clojure.core/contains? input :application-name) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-application-name (input :application-name)) #:http.request.field{:name "ApplicationName", :shape "ApplicationName"})) (clojure.core/contains? input :group-name) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-group-name (input :group-name)) #:http.request.field{:name "GroupName", :shape "GroupName"})) (clojure.core/contains? input :version-labels) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-version-labels (input :version-labels)) #:http.request.field{:name "VersionLabels", :shape "VersionLabels"}))))

(clojure.core/defn- req-update-application-version-message [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (ser-application-name (input :application-name)) #:http.request.field{:name "ApplicationName", :shape "ApplicationName"}) (clojure.core/into (ser-version-label (input :version-label)) #:http.request.field{:name "VersionLabel", :shape "VersionLabel"})]} (clojure.core/contains? input :description) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-description (input :description)) #:http.request.field{:name "Description", :shape "Description"}))))

(clojure.core/defn- req-validate-configuration-settings-message [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (ser-application-name (input :application-name)) #:http.request.field{:name "ApplicationName", :shape "ApplicationName"}) (clojure.core/into (ser-configuration-option-settings-list (input :option-settings)) #:http.request.field{:name "OptionSettings", :shape "ConfigurationOptionSettingsList"})]} (clojure.core/contains? input :template-name) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-configuration-template-name (input :template-name)) #:http.request.field{:name "TemplateName", :shape "ConfigurationTemplateName"})) (clojure.core/contains? input :environment-name) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-environment-name (input :environment-name)) #:http.request.field{:name "EnvironmentName", :shape "EnvironmentName"}))))

(clojure.core/defn- req-request-environment-info-message [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (ser-environment-info-type (input :info-type)) #:http.request.field{:name "InfoType", :shape "EnvironmentInfoType"})]} (clojure.core/contains? input :environment-id) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-environment-id (input :environment-id)) #:http.request.field{:name "EnvironmentId", :shape "EnvironmentId"})) (clojure.core/contains? input :environment-name) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-environment-name (input :environment-name)) #:http.request.field{:name "EnvironmentName", :shape "EnvironmentName"}))))

(clojure.core/defn- req-rebuild-environment-message [input] (clojure.core/cond-> {} (clojure.core/contains? input :environment-id) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-environment-id (input :environment-id)) #:http.request.field{:name "EnvironmentId", :shape "EnvironmentId"})) (clojure.core/contains? input :environment-name) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-environment-name (input :environment-name)) #:http.request.field{:name "EnvironmentName", :shape "EnvironmentName"}))))

(clojure.core/defn- req-apply-environment-managed-action-request [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (ser-string (input :action-id)) #:http.request.field{:name "ActionId", :shape "String"})]} (clojure.core/contains? input :environment-name) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-string (input :environment-name)) #:http.request.field{:name "EnvironmentName", :shape "String"})) (clojure.core/contains? input :environment-id) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-string (input :environment-id)) #:http.request.field{:name "EnvironmentId", :shape "String"}))))

(clojure.core/defn- req-describe-applications-message [input] (clojure.core/cond-> {} (clojure.core/contains? input :application-names) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-application-names-list (input :application-names)) #:http.request.field{:name "ApplicationNames", :shape "ApplicationNamesList"}))))

(clojure.core/defn- req-create-application-version-message [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (ser-application-name (input :application-name)) #:http.request.field{:name "ApplicationName", :shape "ApplicationName"}) (clojure.core/into (ser-version-label (input :version-label)) #:http.request.field{:name "VersionLabel", :shape "VersionLabel"})]} (clojure.core/contains? input :description) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-description (input :description)) #:http.request.field{:name "Description", :shape "Description"})) (clojure.core/contains? input :source-build-information) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-source-build-information (input :source-build-information)) #:http.request.field{:name "SourceBuildInformation", :shape "SourceBuildInformation"})) (clojure.core/contains? input :source-bundle) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-s-3-location (input :source-bundle)) #:http.request.field{:name "SourceBundle", :shape "S3Location"})) (clojure.core/contains? input :build-configuration) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-build-configuration (input :build-configuration)) #:http.request.field{:name "BuildConfiguration", :shape "BuildConfiguration"})) (clojure.core/contains? input :auto-create-application) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-auto-create-application (input :auto-create-application)) #:http.request.field{:name "AutoCreateApplication", :shape "AutoCreateApplication"})) (clojure.core/contains? input :process) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-application-version-proccess (input :process)) #:http.request.field{:name "Process", :shape "ApplicationVersionProccess"}))))

(clojure.core/defn- req-list-tags-for-resource-message [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (ser-resource-arn (input :resource-arn)) #:http.request.field{:name "ResourceArn", :shape "ResourceArn"})]}))

(clojure.core/defn- req-abort-environment-update-message [input] (clojure.core/cond-> {} (clojure.core/contains? input :environment-id) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-environment-id (input :environment-id)) #:http.request.field{:name "EnvironmentId", :shape "EnvironmentId"})) (clojure.core/contains? input :environment-name) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-environment-name (input :environment-name)) #:http.request.field{:name "EnvironmentName", :shape "EnvironmentName"}))))

(clojure.core/defn- req-create-platform-version-request [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (ser-platform-name (input :platform-name)) #:http.request.field{:name "PlatformName", :shape "PlatformName"}) (clojure.core/into (ser-platform-version (input :platform-version)) #:http.request.field{:name "PlatformVersion", :shape "PlatformVersion"}) (clojure.core/into (ser-s-3-location (input :platform-definition-bundle)) #:http.request.field{:name "PlatformDefinitionBundle", :shape "S3Location"})]} (clojure.core/contains? input :environment-name) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-environment-name (input :environment-name)) #:http.request.field{:name "EnvironmentName", :shape "EnvironmentName"})) (clojure.core/contains? input :option-settings) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-configuration-option-settings-list (input :option-settings)) #:http.request.field{:name "OptionSettings", :shape "ConfigurationOptionSettingsList"}))))

(clojure.core/defn- req-restart-app-server-message [input] (clojure.core/cond-> {} (clojure.core/contains? input :environment-id) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-environment-id (input :environment-id)) #:http.request.field{:name "EnvironmentId", :shape "EnvironmentId"})) (clojure.core/contains? input :environment-name) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-environment-name (input :environment-name)) #:http.request.field{:name "EnvironmentName", :shape "EnvironmentName"}))))

(clojure.core/defn- req-list-platform-versions-request [input] (clojure.core/cond-> {} (clojure.core/contains? input :filters) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-platform-filters (input :filters)) #:http.request.field{:name "Filters", :shape "PlatformFilters"})) (clojure.core/contains? input :max-records) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-platform-max-records (input :max-records)) #:http.request.field{:name "MaxRecords", :shape "PlatformMaxRecords"})) (clojure.core/contains? input :next-token) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-token (input :next-token)) #:http.request.field{:name "NextToken", :shape "Token"}))))

(clojure.core/defn- req-describe-configuration-settings-message [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (ser-application-name (input :application-name)) #:http.request.field{:name "ApplicationName", :shape "ApplicationName"})]} (clojure.core/contains? input :template-name) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-configuration-template-name (input :template-name)) #:http.request.field{:name "TemplateName", :shape "ConfigurationTemplateName"})) (clojure.core/contains? input :environment-name) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-environment-name (input :environment-name)) #:http.request.field{:name "EnvironmentName", :shape "EnvironmentName"}))))

(clojure.spec.alpha/def :portkey.aws.elasticbeanstalk.-2010-12-01.solution-stack-description/permitted-file-types (clojure.spec.alpha/and :portkey.aws.elasticbeanstalk.-2010-12-01/solution-stack-file-type-list))
(clojure.spec.alpha/def :portkey.aws.elasticbeanstalk.-2010-12-01/solution-stack-description (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.elasticbeanstalk.-2010-12-01/solution-stack-name :portkey.aws.elasticbeanstalk.-2010-12-01.solution-stack-description/permitted-file-types]))

(clojure.spec.alpha/def :portkey.aws.elasticbeanstalk.-2010-12-01/version-label (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__27880__auto__] (clojure.core/<= 1 (clojure.core/count s__27880__auto__))) (clojure.core/fn [s__27881__auto__] (clojure.core/< (clojure.core/count s__27881__auto__) 100))))

(clojure.spec.alpha/def :portkey.aws.elasticbeanstalk.-2010-12-01/event-message (clojure.spec.alpha/and clojure.core/string?))

(clojure.spec.alpha/def :portkey.aws.elasticbeanstalk.-2010-12-01.platform-filter/type (clojure.spec.alpha/and :portkey.aws.elasticbeanstalk.-2010-12-01/platform-filter-type))
(clojure.spec.alpha/def :portkey.aws.elasticbeanstalk.-2010-12-01.platform-filter/operator (clojure.spec.alpha/and :portkey.aws.elasticbeanstalk.-2010-12-01/platform-filter-operator))
(clojure.spec.alpha/def :portkey.aws.elasticbeanstalk.-2010-12-01.platform-filter/values (clojure.spec.alpha/and :portkey.aws.elasticbeanstalk.-2010-12-01/platform-filter-value-list))
(clojure.spec.alpha/def :portkey.aws.elasticbeanstalk.-2010-12-01/platform-filter (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.elasticbeanstalk.-2010-12-01.platform-filter/type :portkey.aws.elasticbeanstalk.-2010-12-01.platform-filter/operator :portkey.aws.elasticbeanstalk.-2010-12-01.platform-filter/values]))

(clojure.spec.alpha/def :portkey.aws.elasticbeanstalk.-2010-12-01/application-version-arn (clojure.spec.alpha/and clojure.core/string?))

(clojure.spec.alpha/def :portkey.aws.elasticbeanstalk.-2010-12-01/source-repository #{:s-3 "S3" "CodeCommit" :code-commit})

(clojure.spec.alpha/def :portkey.aws.elasticbeanstalk.-2010-12-01/event-severity #{:warn :trace "WARN" :debug "ERROR" :fatal "TRACE" "DEBUG" "FATAL" :info :error "INFO"})

(clojure.spec.alpha/def :portkey.aws.elasticbeanstalk.-2010-12-01.platform-framework/name (clojure.spec.alpha/and :portkey.aws.elasticbeanstalk.-2010-12-01/string))
(clojure.spec.alpha/def :portkey.aws.elasticbeanstalk.-2010-12-01.platform-framework/version (clojure.spec.alpha/and :portkey.aws.elasticbeanstalk.-2010-12-01/string))
(clojure.spec.alpha/def :portkey.aws.elasticbeanstalk.-2010-12-01/platform-framework (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.elasticbeanstalk.-2010-12-01.platform-framework/name :portkey.aws.elasticbeanstalk.-2010-12-01.platform-framework/version]))

(clojure.spec.alpha/def :portkey.aws.elasticbeanstalk.-2010-12-01.application-version-descriptions-message/application-versions (clojure.spec.alpha/and :portkey.aws.elasticbeanstalk.-2010-12-01/application-version-description-list))
(clojure.spec.alpha/def :portkey.aws.elasticbeanstalk.-2010-12-01.application-version-descriptions-message/next-token (clojure.spec.alpha/and :portkey.aws.elasticbeanstalk.-2010-12-01/token))
(clojure.spec.alpha/def :portkey.aws.elasticbeanstalk.-2010-12-01/application-version-descriptions-message (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.elasticbeanstalk.-2010-12-01.application-version-descriptions-message/application-versions :portkey.aws.elasticbeanstalk.-2010-12-01.application-version-descriptions-message/next-token]))

(clojure.spec.alpha/def :portkey.aws.elasticbeanstalk.-2010-12-01.list-available-solution-stacks-result-message/solution-stacks (clojure.spec.alpha/and :portkey.aws.elasticbeanstalk.-2010-12-01/available-solution-stack-names-list))
(clojure.spec.alpha/def :portkey.aws.elasticbeanstalk.-2010-12-01.list-available-solution-stacks-result-message/solution-stack-details (clojure.spec.alpha/and :portkey.aws.elasticbeanstalk.-2010-12-01/available-solution-stack-details-list))
(clojure.spec.alpha/def :portkey.aws.elasticbeanstalk.-2010-12-01/list-available-solution-stacks-result-message (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.elasticbeanstalk.-2010-12-01.list-available-solution-stacks-result-message/solution-stacks :portkey.aws.elasticbeanstalk.-2010-12-01.list-available-solution-stacks-result-message/solution-stack-details]))

(clojure.spec.alpha/def :portkey.aws.elasticbeanstalk.-2010-12-01/instance-id (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__27880__auto__] (clojure.core/<= 1 (clojure.core/count s__27880__auto__))) (clojure.core/fn [s__27881__auto__] (clojure.core/< (clojure.core/count s__27881__auto__) 255))))

(clojure.spec.alpha/def :portkey.aws.elasticbeanstalk.-2010-12-01/platform-filter-value-list (clojure.spec.alpha/coll-of :portkey.aws.elasticbeanstalk.-2010-12-01/platform-filter-value))

(clojure.spec.alpha/def :portkey.aws.elasticbeanstalk.-2010-12-01/configuration-template-names-list (clojure.spec.alpha/coll-of :portkey.aws.elasticbeanstalk.-2010-12-01/configuration-template-name))

(clojure.spec.alpha/def :portkey.aws.elasticbeanstalk.-2010-12-01.configuration-options-description/options (clojure.spec.alpha/and :portkey.aws.elasticbeanstalk.-2010-12-01/configuration-option-descriptions-list))
(clojure.spec.alpha/def :portkey.aws.elasticbeanstalk.-2010-12-01/configuration-options-description (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.elasticbeanstalk.-2010-12-01/solution-stack-name :portkey.aws.elasticbeanstalk.-2010-12-01/platform-arn :portkey.aws.elasticbeanstalk.-2010-12-01.configuration-options-description/options]))

(clojure.spec.alpha/def :portkey.aws.elasticbeanstalk.-2010-12-01/describe-environment-resources-message (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.elasticbeanstalk.-2010-12-01/environment-id :portkey.aws.elasticbeanstalk.-2010-12-01/environment-name]))

(clojure.spec.alpha/def :portkey.aws.elasticbeanstalk.-2010-12-01/cause (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__27880__auto__] (clojure.core/<= 1 (clojure.core/count s__27880__auto__))) (clojure.core/fn [s__27881__auto__] (clojure.core/< (clojure.core/count s__27881__auto__) 255))))

(clojure.spec.alpha/def :portkey.aws.elasticbeanstalk.-2010-12-01/cname-availability clojure.core/boolean?)

(clojure.spec.alpha/def :portkey.aws.elasticbeanstalk.-2010-12-01/boxed-int clojure.core/int?)

(clojure.spec.alpha/def :portkey.aws.elasticbeanstalk.-2010-12-01.update-application-resource-lifecycle-message/resource-lifecycle-config (clojure.spec.alpha/and :portkey.aws.elasticbeanstalk.-2010-12-01/application-resource-lifecycle-config))
(clojure.spec.alpha/def :portkey.aws.elasticbeanstalk.-2010-12-01/update-application-resource-lifecycle-message (clojure.spec.alpha/keys :req-un [:portkey.aws.elasticbeanstalk.-2010-12-01/application-name :portkey.aws.elasticbeanstalk.-2010-12-01.update-application-resource-lifecycle-message/resource-lifecycle-config] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.elasticbeanstalk.-2010-12-01/file-type-extension (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__27880__auto__] (clojure.core/<= 1 (clojure.core/count s__27880__auto__))) (clojure.core/fn [s__27881__auto__] (clojure.core/< (clojure.core/count s__27881__auto__) 100))))

(clojure.spec.alpha/def :portkey.aws.elasticbeanstalk.-2010-12-01/non-empty-string (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__27882__auto__] (clojure.core/re-matches #".*\S.*" s__27882__auto__))))

(clojure.spec.alpha/def :portkey.aws.elasticbeanstalk.-2010-12-01/include-deleted-back-to clojure.core/inst?)

(clojure.spec.alpha/def :portkey.aws.elasticbeanstalk.-2010-12-01.deployment/version-label (clojure.spec.alpha/and :portkey.aws.elasticbeanstalk.-2010-12-01/string))
(clojure.spec.alpha/def :portkey.aws.elasticbeanstalk.-2010-12-01.deployment/deployment-id (clojure.spec.alpha/and :portkey.aws.elasticbeanstalk.-2010-12-01/nullable-long))
(clojure.spec.alpha/def :portkey.aws.elasticbeanstalk.-2010-12-01.deployment/status (clojure.spec.alpha/and :portkey.aws.elasticbeanstalk.-2010-12-01/string))
(clojure.spec.alpha/def :portkey.aws.elasticbeanstalk.-2010-12-01.deployment/deployment-time (clojure.spec.alpha/and :portkey.aws.elasticbeanstalk.-2010-12-01/deployment-timestamp))
(clojure.spec.alpha/def :portkey.aws.elasticbeanstalk.-2010-12-01/deployment (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.elasticbeanstalk.-2010-12-01.deployment/version-label :portkey.aws.elasticbeanstalk.-2010-12-01.deployment/deployment-id :portkey.aws.elasticbeanstalk.-2010-12-01.deployment/status :portkey.aws.elasticbeanstalk.-2010-12-01.deployment/deployment-time]))

(clojure.spec.alpha/def :portkey.aws.elasticbeanstalk.-2010-12-01/request-id (clojure.spec.alpha/and clojure.core/string?))

(clojure.spec.alpha/def :portkey.aws.elasticbeanstalk.-2010-12-01/terminate-env-force clojure.core/boolean?)

(clojure.spec.alpha/def :portkey.aws.elasticbeanstalk.-2010-12-01.describe-environments-message/environment-ids (clojure.spec.alpha/and :portkey.aws.elasticbeanstalk.-2010-12-01/environment-id-list))
(clojure.spec.alpha/def :portkey.aws.elasticbeanstalk.-2010-12-01.describe-environments-message/environment-names (clojure.spec.alpha/and :portkey.aws.elasticbeanstalk.-2010-12-01/environment-names-list))
(clojure.spec.alpha/def :portkey.aws.elasticbeanstalk.-2010-12-01.describe-environments-message/included-deleted-back-to (clojure.spec.alpha/and :portkey.aws.elasticbeanstalk.-2010-12-01/include-deleted-back-to))
(clojure.spec.alpha/def :portkey.aws.elasticbeanstalk.-2010-12-01.describe-environments-message/next-token (clojure.spec.alpha/and :portkey.aws.elasticbeanstalk.-2010-12-01/token))
(clojure.spec.alpha/def :portkey.aws.elasticbeanstalk.-2010-12-01/describe-environments-message (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.elasticbeanstalk.-2010-12-01/application-name :portkey.aws.elasticbeanstalk.-2010-12-01/version-label :portkey.aws.elasticbeanstalk.-2010-12-01.describe-environments-message/environment-ids :portkey.aws.elasticbeanstalk.-2010-12-01.describe-environments-message/environment-names :portkey.aws.elasticbeanstalk.-2010-12-01/include-deleted :portkey.aws.elasticbeanstalk.-2010-12-01.describe-environments-message/included-deleted-back-to :portkey.aws.elasticbeanstalk.-2010-12-01/max-records :portkey.aws.elasticbeanstalk.-2010-12-01.describe-environments-message/next-token]))

(clojure.spec.alpha/def :portkey.aws.elasticbeanstalk.-2010-12-01/option-namespace (clojure.spec.alpha/and clojure.core/string?))

(clojure.spec.alpha/def :portkey.aws.elasticbeanstalk.-2010-12-01/launched-at clojure.core/inst?)

(clojure.spec.alpha/def :portkey.aws.elasticbeanstalk.-2010-12-01.update-environment-message/tier (clojure.spec.alpha/and :portkey.aws.elasticbeanstalk.-2010-12-01/environment-tier))
(clojure.spec.alpha/def :portkey.aws.elasticbeanstalk.-2010-12-01.update-environment-message/option-settings (clojure.spec.alpha/and :portkey.aws.elasticbeanstalk.-2010-12-01/configuration-option-settings-list))
(clojure.spec.alpha/def :portkey.aws.elasticbeanstalk.-2010-12-01.update-environment-message/template-name (clojure.spec.alpha/and :portkey.aws.elasticbeanstalk.-2010-12-01/configuration-template-name))
(clojure.spec.alpha/def :portkey.aws.elasticbeanstalk.-2010-12-01.update-environment-message/options-to-remove (clojure.spec.alpha/and :portkey.aws.elasticbeanstalk.-2010-12-01/options-specifier-list))
(clojure.spec.alpha/def :portkey.aws.elasticbeanstalk.-2010-12-01/update-environment-message (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.elasticbeanstalk.-2010-12-01/version-label :portkey.aws.elasticbeanstalk.-2010-12-01.update-environment-message/tier :portkey.aws.elasticbeanstalk.-2010-12-01/solution-stack-name :portkey.aws.elasticbeanstalk.-2010-12-01/environment-name :portkey.aws.elasticbeanstalk.-2010-12-01.update-environment-message/option-settings :portkey.aws.elasticbeanstalk.-2010-12-01/group-name :portkey.aws.elasticbeanstalk.-2010-12-01/description :portkey.aws.elasticbeanstalk.-2010-12-01/application-name :portkey.aws.elasticbeanstalk.-2010-12-01.update-environment-message/template-name :portkey.aws.elasticbeanstalk.-2010-12-01/platform-arn :portkey.aws.elasticbeanstalk.-2010-12-01.update-environment-message/options-to-remove :portkey.aws.elasticbeanstalk.-2010-12-01/environment-id]))

(clojure.spec.alpha/def :portkey.aws.elasticbeanstalk.-2010-12-01.describe-environment-health-request/attribute-names (clojure.spec.alpha/and :portkey.aws.elasticbeanstalk.-2010-12-01/environment-health-attributes))
(clojure.spec.alpha/def :portkey.aws.elasticbeanstalk.-2010-12-01/describe-environment-health-request (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.elasticbeanstalk.-2010-12-01/environment-name :portkey.aws.elasticbeanstalk.-2010-12-01/environment-id :portkey.aws.elasticbeanstalk.-2010-12-01.describe-environment-health-request/attribute-names]))

(clojure.spec.alpha/def :portkey.aws.elasticbeanstalk.-2010-12-01/create-platform-version-result (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.elasticbeanstalk.-2010-12-01/platform-summary :portkey.aws.elasticbeanstalk.-2010-12-01/builder]))

(clojure.spec.alpha/def :portkey.aws.elasticbeanstalk.-2010-12-01/invalid-request-exception (clojure.spec.alpha/keys :req-un [] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.elasticbeanstalk.-2010-12-01/delete-source-bundle clojure.core/boolean?)

(clojure.spec.alpha/def :portkey.aws.elasticbeanstalk.-2010-12-01/sample-timestamp clojure.core/inst?)

(clojure.spec.alpha/def :portkey.aws.elasticbeanstalk.-2010-12-01/boxed-boolean clojure.core/boolean?)

(clojure.spec.alpha/def :portkey.aws.elasticbeanstalk.-2010-12-01.build-configuration/artifact-name (clojure.spec.alpha/and :portkey.aws.elasticbeanstalk.-2010-12-01/string))
(clojure.spec.alpha/def :portkey.aws.elasticbeanstalk.-2010-12-01.build-configuration/code-build-service-role (clojure.spec.alpha/and :portkey.aws.elasticbeanstalk.-2010-12-01/non-empty-string))
(clojure.spec.alpha/def :portkey.aws.elasticbeanstalk.-2010-12-01.build-configuration/image (clojure.spec.alpha/and :portkey.aws.elasticbeanstalk.-2010-12-01/non-empty-string))
(clojure.spec.alpha/def :portkey.aws.elasticbeanstalk.-2010-12-01.build-configuration/timeout-in-minutes (clojure.spec.alpha/and :portkey.aws.elasticbeanstalk.-2010-12-01/boxed-int))
(clojure.spec.alpha/def :portkey.aws.elasticbeanstalk.-2010-12-01/build-configuration (clojure.spec.alpha/keys :req-un [:portkey.aws.elasticbeanstalk.-2010-12-01.build-configuration/code-build-service-role :portkey.aws.elasticbeanstalk.-2010-12-01.build-configuration/image] :opt-un [:portkey.aws.elasticbeanstalk.-2010-12-01.build-configuration/artifact-name :portkey.aws.elasticbeanstalk.-2010-12-01/compute-type :portkey.aws.elasticbeanstalk.-2010-12-01.build-configuration/timeout-in-minutes]))

(clojure.spec.alpha/def :portkey.aws.elasticbeanstalk.-2010-12-01/solution-stack-name (clojure.spec.alpha/and clojure.core/string?))

(clojure.spec.alpha/def :portkey.aws.elasticbeanstalk.-2010-12-01/platform-name (clojure.spec.alpha/and clojure.core/string?))

(clojure.spec.alpha/def :portkey.aws.elasticbeanstalk.-2010-12-01/validation-severity #{"warning" "error" :warning :error})

(clojure.spec.alpha/def :portkey.aws.elasticbeanstalk.-2010-12-01.load-balancer-description/load-balancer-name (clojure.spec.alpha/and :portkey.aws.elasticbeanstalk.-2010-12-01/string))
(clojure.spec.alpha/def :portkey.aws.elasticbeanstalk.-2010-12-01.load-balancer-description/domain (clojure.spec.alpha/and :portkey.aws.elasticbeanstalk.-2010-12-01/string))
(clojure.spec.alpha/def :portkey.aws.elasticbeanstalk.-2010-12-01.load-balancer-description/listeners (clojure.spec.alpha/and :portkey.aws.elasticbeanstalk.-2010-12-01/load-balancer-listeners-description))
(clojure.spec.alpha/def :portkey.aws.elasticbeanstalk.-2010-12-01/load-balancer-description (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.elasticbeanstalk.-2010-12-01.load-balancer-description/load-balancer-name :portkey.aws.elasticbeanstalk.-2010-12-01.load-balancer-description/domain :portkey.aws.elasticbeanstalk.-2010-12-01.load-balancer-description/listeners]))

(clojure.spec.alpha/def :portkey.aws.elasticbeanstalk.-2010-12-01/image-id (clojure.spec.alpha/and clojure.core/string?))

(clojure.spec.alpha/def :portkey.aws.elasticbeanstalk.-2010-12-01/insufficient-privileges-exception (clojure.spec.alpha/keys :req-un [] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.elasticbeanstalk.-2010-12-01.describe-environment-managed-action-history-result/next-token (clojure.spec.alpha/and :portkey.aws.elasticbeanstalk.-2010-12-01/string))
(clojure.spec.alpha/def :portkey.aws.elasticbeanstalk.-2010-12-01/describe-environment-managed-action-history-result (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.elasticbeanstalk.-2010-12-01/managed-action-history-items :portkey.aws.elasticbeanstalk.-2010-12-01.describe-environment-managed-action-history-result/next-token]))

(clojure.spec.alpha/def :portkey.aws.elasticbeanstalk.-2010-12-01/validation-messages-list (clojure.spec.alpha/coll-of :portkey.aws.elasticbeanstalk.-2010-12-01/validation-message))

(clojure.spec.alpha/def :portkey.aws.elasticbeanstalk.-2010-12-01.describe-environment-managed-action-history-request/next-token (clojure.spec.alpha/and :portkey.aws.elasticbeanstalk.-2010-12-01/string))
(clojure.spec.alpha/def :portkey.aws.elasticbeanstalk.-2010-12-01.describe-environment-managed-action-history-request/max-items (clojure.spec.alpha/and :portkey.aws.elasticbeanstalk.-2010-12-01/integer))
(clojure.spec.alpha/def :portkey.aws.elasticbeanstalk.-2010-12-01/describe-environment-managed-action-history-request (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.elasticbeanstalk.-2010-12-01/environment-id :portkey.aws.elasticbeanstalk.-2010-12-01/environment-name :portkey.aws.elasticbeanstalk.-2010-12-01.describe-environment-managed-action-history-request/next-token :portkey.aws.elasticbeanstalk.-2010-12-01.describe-environment-managed-action-history-request/max-items]))

(clojure.spec.alpha/def :portkey.aws.elasticbeanstalk.-2010-12-01/application-arn (clojure.spec.alpha/and clojure.core/string?))

(clojure.spec.alpha/def :portkey.aws.elasticbeanstalk.-2010-12-01/environment-status #{"Launching" :ready "Ready" :terminating "Terminating" :terminated :updating "Terminated" "Updating" :launching})

(clojure.spec.alpha/def :portkey.aws.elasticbeanstalk.-2010-12-01/application-names-list (clojure.spec.alpha/coll-of :portkey.aws.elasticbeanstalk.-2010-12-01/application-name))

(clojure.spec.alpha/def :portkey.aws.elasticbeanstalk.-2010-12-01/supported-addon-list (clojure.spec.alpha/coll-of :portkey.aws.elasticbeanstalk.-2010-12-01/supported-addon))

(clojure.spec.alpha/def :portkey.aws.elasticbeanstalk.-2010-12-01.environment-tier/name (clojure.spec.alpha/and :portkey.aws.elasticbeanstalk.-2010-12-01/string))
(clojure.spec.alpha/def :portkey.aws.elasticbeanstalk.-2010-12-01.environment-tier/type (clojure.spec.alpha/and :portkey.aws.elasticbeanstalk.-2010-12-01/string))
(clojure.spec.alpha/def :portkey.aws.elasticbeanstalk.-2010-12-01.environment-tier/version (clojure.spec.alpha/and :portkey.aws.elasticbeanstalk.-2010-12-01/string))
(clojure.spec.alpha/def :portkey.aws.elasticbeanstalk.-2010-12-01/environment-tier (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.elasticbeanstalk.-2010-12-01.environment-tier/name :portkey.aws.elasticbeanstalk.-2010-12-01.environment-tier/type :portkey.aws.elasticbeanstalk.-2010-12-01.environment-tier/version]))

(clojure.spec.alpha/def :portkey.aws.elasticbeanstalk.-2010-12-01.check-dns-availability-message/cname-prefix (clojure.spec.alpha/and :portkey.aws.elasticbeanstalk.-2010-12-01/dns-cname-prefix))
(clojure.spec.alpha/def :portkey.aws.elasticbeanstalk.-2010-12-01/check-dns-availability-message (clojure.spec.alpha/keys :req-un [:portkey.aws.elasticbeanstalk.-2010-12-01.check-dns-availability-message/cname-prefix] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.elasticbeanstalk.-2010-12-01.elastic-beanstalk-service-exception/message (clojure.spec.alpha/and :portkey.aws.elasticbeanstalk.-2010-12-01/exception-message))
(clojure.spec.alpha/def :portkey.aws.elasticbeanstalk.-2010-12-01/elastic-beanstalk-service-exception (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.elasticbeanstalk.-2010-12-01.elastic-beanstalk-service-exception/message]))

(clojure.spec.alpha/def :portkey.aws.elasticbeanstalk.-2010-12-01/regex-pattern (clojure.spec.alpha/and clojure.core/string?))

(clojure.spec.alpha/def :portkey.aws.elasticbeanstalk.-2010-12-01/operating-system-name (clojure.spec.alpha/and clojure.core/string?))

(clojure.spec.alpha/def :portkey.aws.elasticbeanstalk.-2010-12-01.environment-link/link-name (clojure.spec.alpha/and :portkey.aws.elasticbeanstalk.-2010-12-01/string))
(clojure.spec.alpha/def :portkey.aws.elasticbeanstalk.-2010-12-01.environment-link/environment-name (clojure.spec.alpha/and :portkey.aws.elasticbeanstalk.-2010-12-01/string))
(clojure.spec.alpha/def :portkey.aws.elasticbeanstalk.-2010-12-01/environment-link (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.elasticbeanstalk.-2010-12-01.environment-link/link-name :portkey.aws.elasticbeanstalk.-2010-12-01.environment-link/environment-name]))

(clojure.spec.alpha/def :portkey.aws.elasticbeanstalk.-2010-12-01/configuration-option-severity (clojure.spec.alpha/and clojure.core/string?))

(clojure.spec.alpha/def :portkey.aws.elasticbeanstalk.-2010-12-01/environment-name (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__27880__auto__] (clojure.core/<= 4 (clojure.core/count s__27880__auto__))) (clojure.core/fn [s__27881__auto__] (clojure.core/< (clojure.core/count s__27881__auto__) 40))))

(clojure.spec.alpha/def :portkey.aws.elasticbeanstalk.-2010-12-01/managed-actions (clojure.spec.alpha/coll-of :portkey.aws.elasticbeanstalk.-2010-12-01/managed-action :min-count 1 :max-count 100))

(clojure.spec.alpha/def :portkey.aws.elasticbeanstalk.-2010-12-01/terminate-environment-resources clojure.core/boolean?)

(clojure.spec.alpha/def :portkey.aws.elasticbeanstalk.-2010-12-01/environment-health-status #{"Suspended" :unknown :pending "Info" "Severe" "Unknown" :suspended "Warning" :warning :severe "NoData" :degraded :ok :info "Pending" :no-data "Degraded" "Ok"})

(clojure.spec.alpha/def :portkey.aws.elasticbeanstalk.-2010-12-01/too-many-application-versions-exception (clojure.spec.alpha/keys :req-un [] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.elasticbeanstalk.-2010-12-01/describe-platform-version-request (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.elasticbeanstalk.-2010-12-01/platform-arn]))

(clojure.spec.alpha/def :portkey.aws.elasticbeanstalk.-2010-12-01/environment-id-list (clojure.spec.alpha/coll-of :portkey.aws.elasticbeanstalk.-2010-12-01/environment-id))

(clojure.spec.alpha/def :portkey.aws.elasticbeanstalk.-2010-12-01/source-bundle-deletion-exception (clojure.spec.alpha/keys :req-un [] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.elasticbeanstalk.-2010-12-01/too-many-applications-exception (clojure.spec.alpha/keys :req-un [] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.elasticbeanstalk.-2010-12-01.queue/name (clojure.spec.alpha/and :portkey.aws.elasticbeanstalk.-2010-12-01/string))
(clojure.spec.alpha/def :portkey.aws.elasticbeanstalk.-2010-12-01.queue/url (clojure.spec.alpha/and :portkey.aws.elasticbeanstalk.-2010-12-01/string))
(clojure.spec.alpha/def :portkey.aws.elasticbeanstalk.-2010-12-01/queue (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.elasticbeanstalk.-2010-12-01.queue/name :portkey.aws.elasticbeanstalk.-2010-12-01.queue/url]))

(clojure.spec.alpha/def :portkey.aws.elasticbeanstalk.-2010-12-01/platform-filter-type (clojure.spec.alpha/and clojure.core/string?))

(clojure.spec.alpha/def :portkey.aws.elasticbeanstalk.-2010-12-01.check-dns-availability-result-message/available (clojure.spec.alpha/and :portkey.aws.elasticbeanstalk.-2010-12-01/cname-availability))
(clojure.spec.alpha/def :portkey.aws.elasticbeanstalk.-2010-12-01.check-dns-availability-result-message/fully-qualified-cname (clojure.spec.alpha/and :portkey.aws.elasticbeanstalk.-2010-12-01/dns-cname))
(clojure.spec.alpha/def :portkey.aws.elasticbeanstalk.-2010-12-01/check-dns-availability-result-message (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.elasticbeanstalk.-2010-12-01.check-dns-availability-result-message/available :portkey.aws.elasticbeanstalk.-2010-12-01.check-dns-availability-result-message/fully-qualified-cname]))

(clojure.spec.alpha/def :portkey.aws.elasticbeanstalk.-2010-12-01.application-description-message/application (clojure.spec.alpha/and :portkey.aws.elasticbeanstalk.-2010-12-01/application-description))
(clojure.spec.alpha/def :portkey.aws.elasticbeanstalk.-2010-12-01/application-description-message (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.elasticbeanstalk.-2010-12-01.application-description-message/application]))

(clojure.spec.alpha/def :portkey.aws.elasticbeanstalk.-2010-12-01/option-restriction-max-value clojure.core/int?)

(clojure.spec.alpha/def :portkey.aws.elasticbeanstalk.-2010-12-01/trigger-list (clojure.spec.alpha/coll-of :portkey.aws.elasticbeanstalk.-2010-12-01/trigger))

(clojure.spec.alpha/def :portkey.aws.elasticbeanstalk.-2010-12-01/time-filter-end clojure.core/inst?)

(clojure.spec.alpha/def :portkey.aws.elasticbeanstalk.-2010-12-01/environment-health-attributes (clojure.spec.alpha/coll-of :portkey.aws.elasticbeanstalk.-2010-12-01/environment-health-attribute))

(clojure.spec.alpha/def :portkey.aws.elasticbeanstalk.-2010-12-01.resource-quota/maximum (clojure.spec.alpha/and :portkey.aws.elasticbeanstalk.-2010-12-01/boxed-int))
(clojure.spec.alpha/def :portkey.aws.elasticbeanstalk.-2010-12-01/resource-quota (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.elasticbeanstalk.-2010-12-01.resource-quota/maximum]))

(clojure.spec.alpha/def :portkey.aws.elasticbeanstalk.-2010-12-01/dns-cname (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__27880__auto__] (clojure.core/<= 1 (clojure.core/count s__27880__auto__))) (clojure.core/fn [s__27881__auto__] (clojure.core/< (clojure.core/count s__27881__auto__) 255))))

(clojure.spec.alpha/def :portkey.aws.elasticbeanstalk.-2010-12-01/max-records (clojure.spec.alpha/int-in 1 1000))

(clojure.spec.alpha/def :portkey.aws.elasticbeanstalk.-2010-12-01/tag-key (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__27880__auto__] (clojure.core/<= 1 (clojure.core/count s__27880__auto__))) (clojure.core/fn [s__27881__auto__] (clojure.core/< (clojure.core/count s__27881__auto__) 128))))

(clojure.spec.alpha/def :portkey.aws.elasticbeanstalk.-2010-12-01/environment-descriptions-list (clojure.spec.alpha/coll-of :portkey.aws.elasticbeanstalk.-2010-12-01/environment-description))

(clojure.spec.alpha/def :portkey.aws.elasticbeanstalk.-2010-12-01/application-version-lifecycle-config (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.elasticbeanstalk.-2010-12-01/max-count-rule :portkey.aws.elasticbeanstalk.-2010-12-01/max-age-rule]))

(clojure.spec.alpha/def :portkey.aws.elasticbeanstalk.-2010-12-01.create-application-message/resource-lifecycle-config (clojure.spec.alpha/and :portkey.aws.elasticbeanstalk.-2010-12-01/application-resource-lifecycle-config))
(clojure.spec.alpha/def :portkey.aws.elasticbeanstalk.-2010-12-01/create-application-message (clojure.spec.alpha/keys :req-un [:portkey.aws.elasticbeanstalk.-2010-12-01/application-name] :opt-un [:portkey.aws.elasticbeanstalk.-2010-12-01/description :portkey.aws.elasticbeanstalk.-2010-12-01.create-application-message/resource-lifecycle-config]))

(clojure.spec.alpha/def :portkey.aws.elasticbeanstalk.-2010-12-01/tags (clojure.spec.alpha/coll-of :portkey.aws.elasticbeanstalk.-2010-12-01/tag))

(clojure.spec.alpha/def :portkey.aws.elasticbeanstalk.-2010-12-01/instance-health-list (clojure.spec.alpha/coll-of :portkey.aws.elasticbeanstalk.-2010-12-01/single-instance-health))

(clojure.spec.alpha/def :portkey.aws.elasticbeanstalk.-2010-12-01/dns-cname-prefix (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__27880__auto__] (clojure.core/<= 4 (clojure.core/count s__27880__auto__))) (clojure.core/fn [s__27881__auto__] (clojure.core/< (clojure.core/count s__27881__auto__) 63))))

(clojure.spec.alpha/def :portkey.aws.elasticbeanstalk.-2010-12-01/arn (clojure.spec.alpha/and clojure.core/string?))

(clojure.spec.alpha/def :portkey.aws.elasticbeanstalk.-2010-12-01.instance-health-summary/no-data (clojure.spec.alpha/and :portkey.aws.elasticbeanstalk.-2010-12-01/nullable-integer))
(clojure.spec.alpha/def :portkey.aws.elasticbeanstalk.-2010-12-01.instance-health-summary/unknown (clojure.spec.alpha/and :portkey.aws.elasticbeanstalk.-2010-12-01/nullable-integer))
(clojure.spec.alpha/def :portkey.aws.elasticbeanstalk.-2010-12-01.instance-health-summary/pending (clojure.spec.alpha/and :portkey.aws.elasticbeanstalk.-2010-12-01/nullable-integer))
(clojure.spec.alpha/def :portkey.aws.elasticbeanstalk.-2010-12-01.instance-health-summary/ok (clojure.spec.alpha/and :portkey.aws.elasticbeanstalk.-2010-12-01/nullable-integer))
(clojure.spec.alpha/def :portkey.aws.elasticbeanstalk.-2010-12-01.instance-health-summary/info (clojure.spec.alpha/and :portkey.aws.elasticbeanstalk.-2010-12-01/nullable-integer))
(clojure.spec.alpha/def :portkey.aws.elasticbeanstalk.-2010-12-01.instance-health-summary/warning (clojure.spec.alpha/and :portkey.aws.elasticbeanstalk.-2010-12-01/nullable-integer))
(clojure.spec.alpha/def :portkey.aws.elasticbeanstalk.-2010-12-01.instance-health-summary/degraded (clojure.spec.alpha/and :portkey.aws.elasticbeanstalk.-2010-12-01/nullable-integer))
(clojure.spec.alpha/def :portkey.aws.elasticbeanstalk.-2010-12-01.instance-health-summary/severe (clojure.spec.alpha/and :portkey.aws.elasticbeanstalk.-2010-12-01/nullable-integer))
(clojure.spec.alpha/def :portkey.aws.elasticbeanstalk.-2010-12-01/instance-health-summary (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.elasticbeanstalk.-2010-12-01.instance-health-summary/no-data :portkey.aws.elasticbeanstalk.-2010-12-01.instance-health-summary/unknown :portkey.aws.elasticbeanstalk.-2010-12-01.instance-health-summary/pending :portkey.aws.elasticbeanstalk.-2010-12-01.instance-health-summary/ok :portkey.aws.elasticbeanstalk.-2010-12-01.instance-health-summary/info :portkey.aws.elasticbeanstalk.-2010-12-01.instance-health-summary/warning :portkey.aws.elasticbeanstalk.-2010-12-01.instance-health-summary/degraded :portkey.aws.elasticbeanstalk.-2010-12-01.instance-health-summary/severe]))

(clojure.spec.alpha/def :portkey.aws.elasticbeanstalk.-2010-12-01.describe-instances-health-request/attribute-names (clojure.spec.alpha/and :portkey.aws.elasticbeanstalk.-2010-12-01/instances-health-attributes))
(clojure.spec.alpha/def :portkey.aws.elasticbeanstalk.-2010-12-01/describe-instances-health-request (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.elasticbeanstalk.-2010-12-01/environment-name :portkey.aws.elasticbeanstalk.-2010-12-01/environment-id :portkey.aws.elasticbeanstalk.-2010-12-01.describe-instances-health-request/attribute-names :portkey.aws.elasticbeanstalk.-2010-12-01/next-token]))

(clojure.spec.alpha/def :portkey.aws.elasticbeanstalk.-2010-12-01.describe-events-message/severity (clojure.spec.alpha/and :portkey.aws.elasticbeanstalk.-2010-12-01/event-severity))
(clojure.spec.alpha/def :portkey.aws.elasticbeanstalk.-2010-12-01.describe-events-message/end-time (clojure.spec.alpha/and :portkey.aws.elasticbeanstalk.-2010-12-01/time-filter-end))
(clojure.spec.alpha/def :portkey.aws.elasticbeanstalk.-2010-12-01.describe-events-message/start-time (clojure.spec.alpha/and :portkey.aws.elasticbeanstalk.-2010-12-01/time-filter-start))
(clojure.spec.alpha/def :portkey.aws.elasticbeanstalk.-2010-12-01.describe-events-message/next-token (clojure.spec.alpha/and :portkey.aws.elasticbeanstalk.-2010-12-01/token))
(clojure.spec.alpha/def :portkey.aws.elasticbeanstalk.-2010-12-01.describe-events-message/template-name (clojure.spec.alpha/and :portkey.aws.elasticbeanstalk.-2010-12-01/configuration-template-name))
(clojure.spec.alpha/def :portkey.aws.elasticbeanstalk.-2010-12-01/describe-events-message (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.elasticbeanstalk.-2010-12-01/version-label :portkey.aws.elasticbeanstalk.-2010-12-01.describe-events-message/severity :portkey.aws.elasticbeanstalk.-2010-12-01.describe-events-message/end-time :portkey.aws.elasticbeanstalk.-2010-12-01/request-id :portkey.aws.elasticbeanstalk.-2010-12-01.describe-events-message/start-time :portkey.aws.elasticbeanstalk.-2010-12-01/environment-name :portkey.aws.elasticbeanstalk.-2010-12-01/max-records :portkey.aws.elasticbeanstalk.-2010-12-01.describe-events-message/next-token :portkey.aws.elasticbeanstalk.-2010-12-01/application-name :portkey.aws.elasticbeanstalk.-2010-12-01.describe-events-message/template-name :portkey.aws.elasticbeanstalk.-2010-12-01/platform-arn :portkey.aws.elasticbeanstalk.-2010-12-01/environment-id]))

(clojure.spec.alpha/def :portkey.aws.elasticbeanstalk.-2010-12-01/load-average-value clojure.core/double?)

(clojure.spec.alpha/def :portkey.aws.elasticbeanstalk.-2010-12-01.describe-environment-managed-actions-request/environment-name (clojure.spec.alpha/and :portkey.aws.elasticbeanstalk.-2010-12-01/string))
(clojure.spec.alpha/def :portkey.aws.elasticbeanstalk.-2010-12-01.describe-environment-managed-actions-request/environment-id (clojure.spec.alpha/and :portkey.aws.elasticbeanstalk.-2010-12-01/string))
(clojure.spec.alpha/def :portkey.aws.elasticbeanstalk.-2010-12-01.describe-environment-managed-actions-request/status (clojure.spec.alpha/and :portkey.aws.elasticbeanstalk.-2010-12-01/action-status))
(clojure.spec.alpha/def :portkey.aws.elasticbeanstalk.-2010-12-01/describe-environment-managed-actions-request (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.elasticbeanstalk.-2010-12-01.describe-environment-managed-actions-request/environment-name :portkey.aws.elasticbeanstalk.-2010-12-01.describe-environment-managed-actions-request/environment-id :portkey.aws.elasticbeanstalk.-2010-12-01.describe-environment-managed-actions-request/status]))

(clojure.spec.alpha/def :portkey.aws.elasticbeanstalk.-2010-12-01/operation-in-progress-exception (clojure.spec.alpha/keys :req-un [] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.elasticbeanstalk.-2010-12-01/group-name (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__27880__auto__] (clojure.core/<= 1 (clojure.core/count s__27880__auto__))) (clojure.core/fn [s__27881__auto__] (clojure.core/< (clojure.core/count s__27881__auto__) 19))))

(clojure.spec.alpha/def :portkey.aws.elasticbeanstalk.-2010-12-01/source-type #{:git "Zip" :zip "Git"})

(clojure.spec.alpha/def :portkey.aws.elasticbeanstalk.-2010-12-01/auto-scaling-group-list (clojure.spec.alpha/coll-of :portkey.aws.elasticbeanstalk.-2010-12-01/auto-scaling-group))

(clojure.spec.alpha/def :portkey.aws.elasticbeanstalk.-2010-12-01/custom-ami (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.elasticbeanstalk.-2010-12-01/virtualization-type :portkey.aws.elasticbeanstalk.-2010-12-01/image-id]))

(clojure.spec.alpha/def :portkey.aws.elasticbeanstalk.-2010-12-01/auto-create-application clojure.core/boolean?)

(clojure.spec.alpha/def :portkey.aws.elasticbeanstalk.-2010-12-01/request-count clojure.core/int?)

(clojure.spec.alpha/def :portkey.aws.elasticbeanstalk.-2010-12-01.describe-configuration-options-message/template-name (clojure.spec.alpha/and :portkey.aws.elasticbeanstalk.-2010-12-01/configuration-template-name))
(clojure.spec.alpha/def :portkey.aws.elasticbeanstalk.-2010-12-01.describe-configuration-options-message/options (clojure.spec.alpha/and :portkey.aws.elasticbeanstalk.-2010-12-01/options-specifier-list))
(clojure.spec.alpha/def :portkey.aws.elasticbeanstalk.-2010-12-01/describe-configuration-options-message (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.elasticbeanstalk.-2010-12-01/application-name :portkey.aws.elasticbeanstalk.-2010-12-01.describe-configuration-options-message/template-name :portkey.aws.elasticbeanstalk.-2010-12-01/environment-name :portkey.aws.elasticbeanstalk.-2010-12-01/solution-stack-name :portkey.aws.elasticbeanstalk.-2010-12-01/platform-arn :portkey.aws.elasticbeanstalk.-2010-12-01.describe-configuration-options-message/options]))

(clojure.spec.alpha/def :portkey.aws.elasticbeanstalk.-2010-12-01/regex-label (clojure.spec.alpha/and clojure.core/string?))

(clojure.spec.alpha/def :portkey.aws.elasticbeanstalk.-2010-12-01.create-environment-message/tier (clojure.spec.alpha/and :portkey.aws.elasticbeanstalk.-2010-12-01/environment-tier))
(clojure.spec.alpha/def :portkey.aws.elasticbeanstalk.-2010-12-01.create-environment-message/option-settings (clojure.spec.alpha/and :portkey.aws.elasticbeanstalk.-2010-12-01/configuration-option-settings-list))
(clojure.spec.alpha/def :portkey.aws.elasticbeanstalk.-2010-12-01.create-environment-message/cname-prefix (clojure.spec.alpha/and :portkey.aws.elasticbeanstalk.-2010-12-01/dns-cname-prefix))
(clojure.spec.alpha/def :portkey.aws.elasticbeanstalk.-2010-12-01.create-environment-message/template-name (clojure.spec.alpha/and :portkey.aws.elasticbeanstalk.-2010-12-01/configuration-template-name))
(clojure.spec.alpha/def :portkey.aws.elasticbeanstalk.-2010-12-01.create-environment-message/options-to-remove (clojure.spec.alpha/and :portkey.aws.elasticbeanstalk.-2010-12-01/options-specifier-list))
(clojure.spec.alpha/def :portkey.aws.elasticbeanstalk.-2010-12-01/create-environment-message (clojure.spec.alpha/keys :req-un [:portkey.aws.elasticbeanstalk.-2010-12-01/application-name] :opt-un [:portkey.aws.elasticbeanstalk.-2010-12-01/version-label :portkey.aws.elasticbeanstalk.-2010-12-01.create-environment-message/tier :portkey.aws.elasticbeanstalk.-2010-12-01/solution-stack-name :portkey.aws.elasticbeanstalk.-2010-12-01/environment-name :portkey.aws.elasticbeanstalk.-2010-12-01.create-environment-message/option-settings :portkey.aws.elasticbeanstalk.-2010-12-01/tags :portkey.aws.elasticbeanstalk.-2010-12-01/group-name :portkey.aws.elasticbeanstalk.-2010-12-01/description :portkey.aws.elasticbeanstalk.-2010-12-01.create-environment-message/cname-prefix :portkey.aws.elasticbeanstalk.-2010-12-01.create-environment-message/template-name :portkey.aws.elasticbeanstalk.-2010-12-01/platform-arn :portkey.aws.elasticbeanstalk.-2010-12-01.create-environment-message/options-to-remove]))

(clojure.spec.alpha/def :portkey.aws.elasticbeanstalk.-2010-12-01.delete-application-message/terminate-env-by-force (clojure.spec.alpha/and :portkey.aws.elasticbeanstalk.-2010-12-01/terminate-env-force))
(clojure.spec.alpha/def :portkey.aws.elasticbeanstalk.-2010-12-01/delete-application-message (clojure.spec.alpha/keys :req-un [:portkey.aws.elasticbeanstalk.-2010-12-01/application-name] :opt-un [:portkey.aws.elasticbeanstalk.-2010-12-01.delete-application-message/terminate-env-by-force]))

(clojure.spec.alpha/def :portkey.aws.elasticbeanstalk.-2010-12-01/supported-tier-list (clojure.spec.alpha/coll-of :portkey.aws.elasticbeanstalk.-2010-12-01/supported-tier))

(clojure.spec.alpha/def :portkey.aws.elasticbeanstalk.-2010-12-01.application-resource-lifecycle-config/service-role (clojure.spec.alpha/and :portkey.aws.elasticbeanstalk.-2010-12-01/string))
(clojure.spec.alpha/def :portkey.aws.elasticbeanstalk.-2010-12-01.application-resource-lifecycle-config/version-lifecycle-config (clojure.spec.alpha/and :portkey.aws.elasticbeanstalk.-2010-12-01/application-version-lifecycle-config))
(clojure.spec.alpha/def :portkey.aws.elasticbeanstalk.-2010-12-01/application-resource-lifecycle-config (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.elasticbeanstalk.-2010-12-01.application-resource-lifecycle-config/service-role :portkey.aws.elasticbeanstalk.-2010-12-01.application-resource-lifecycle-config/version-lifecycle-config]))

(clojure.spec.alpha/def :portkey.aws.elasticbeanstalk.-2010-12-01/platform-category (clojure.spec.alpha/and clojure.core/string?))

(clojure.spec.alpha/def :portkey.aws.elasticbeanstalk.-2010-12-01.validation-message/message (clojure.spec.alpha/and :portkey.aws.elasticbeanstalk.-2010-12-01/validation-message-string))
(clojure.spec.alpha/def :portkey.aws.elasticbeanstalk.-2010-12-01.validation-message/severity (clojure.spec.alpha/and :portkey.aws.elasticbeanstalk.-2010-12-01/validation-severity))
(clojure.spec.alpha/def :portkey.aws.elasticbeanstalk.-2010-12-01.validation-message/namespace (clojure.spec.alpha/and :portkey.aws.elasticbeanstalk.-2010-12-01/option-namespace))
(clojure.spec.alpha/def :portkey.aws.elasticbeanstalk.-2010-12-01.validation-message/option-name (clojure.spec.alpha/and :portkey.aws.elasticbeanstalk.-2010-12-01/configuration-option-name))
(clojure.spec.alpha/def :portkey.aws.elasticbeanstalk.-2010-12-01/validation-message (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.elasticbeanstalk.-2010-12-01.validation-message/message :portkey.aws.elasticbeanstalk.-2010-12-01.validation-message/severity :portkey.aws.elasticbeanstalk.-2010-12-01.validation-message/namespace :portkey.aws.elasticbeanstalk.-2010-12-01.validation-message/option-name]))

(clojure.spec.alpha/def :portkey.aws.elasticbeanstalk.-2010-12-01/platform-summary (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.elasticbeanstalk.-2010-12-01/platform-arn :portkey.aws.elasticbeanstalk.-2010-12-01/platform-owner :portkey.aws.elasticbeanstalk.-2010-12-01/platform-status :portkey.aws.elasticbeanstalk.-2010-12-01/platform-category :portkey.aws.elasticbeanstalk.-2010-12-01/operating-system-name :portkey.aws.elasticbeanstalk.-2010-12-01/operating-system-version :portkey.aws.elasticbeanstalk.-2010-12-01/supported-tier-list :portkey.aws.elasticbeanstalk.-2010-12-01/supported-addon-list]))

(clojure.spec.alpha/def :portkey.aws.elasticbeanstalk.-2010-12-01/version-labels-list (clojure.spec.alpha/coll-of :portkey.aws.elasticbeanstalk.-2010-12-01/version-label))

(clojure.spec.alpha/def :portkey.aws.elasticbeanstalk.-2010-12-01/next-token (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__27880__auto__] (clojure.core/<= 1 (clojure.core/count s__27880__auto__))) (clojure.core/fn [s__27881__auto__] (clojure.core/< (clojure.core/count s__27881__auto__) 100))))

(clojure.spec.alpha/def :portkey.aws.elasticbeanstalk.-2010-12-01.managed-action-history-item/action-id (clojure.spec.alpha/and :portkey.aws.elasticbeanstalk.-2010-12-01/string))
(clojure.spec.alpha/def :portkey.aws.elasticbeanstalk.-2010-12-01.managed-action-history-item/action-description (clojure.spec.alpha/and :portkey.aws.elasticbeanstalk.-2010-12-01/string))
(clojure.spec.alpha/def :portkey.aws.elasticbeanstalk.-2010-12-01.managed-action-history-item/status (clojure.spec.alpha/and :portkey.aws.elasticbeanstalk.-2010-12-01/action-history-status))
(clojure.spec.alpha/def :portkey.aws.elasticbeanstalk.-2010-12-01.managed-action-history-item/failure-description (clojure.spec.alpha/and :portkey.aws.elasticbeanstalk.-2010-12-01/string))
(clojure.spec.alpha/def :portkey.aws.elasticbeanstalk.-2010-12-01.managed-action-history-item/executed-time (clojure.spec.alpha/and :portkey.aws.elasticbeanstalk.-2010-12-01/timestamp))
(clojure.spec.alpha/def :portkey.aws.elasticbeanstalk.-2010-12-01.managed-action-history-item/finished-time (clojure.spec.alpha/and :portkey.aws.elasticbeanstalk.-2010-12-01/timestamp))
(clojure.spec.alpha/def :portkey.aws.elasticbeanstalk.-2010-12-01/managed-action-history-item (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.elasticbeanstalk.-2010-12-01.managed-action-history-item/action-id :portkey.aws.elasticbeanstalk.-2010-12-01/action-type :portkey.aws.elasticbeanstalk.-2010-12-01.managed-action-history-item/action-description :portkey.aws.elasticbeanstalk.-2010-12-01/failure-type :portkey.aws.elasticbeanstalk.-2010-12-01.managed-action-history-item/status :portkey.aws.elasticbeanstalk.-2010-12-01.managed-action-history-item/failure-description :portkey.aws.elasticbeanstalk.-2010-12-01.managed-action-history-item/executed-time :portkey.aws.elasticbeanstalk.-2010-12-01.managed-action-history-item/finished-time]))

(clojure.spec.alpha/def :portkey.aws.elasticbeanstalk.-2010-12-01.update-configuration-template-message/template-name (clojure.spec.alpha/and :portkey.aws.elasticbeanstalk.-2010-12-01/configuration-template-name))
(clojure.spec.alpha/def :portkey.aws.elasticbeanstalk.-2010-12-01.update-configuration-template-message/option-settings (clojure.spec.alpha/and :portkey.aws.elasticbeanstalk.-2010-12-01/configuration-option-settings-list))
(clojure.spec.alpha/def :portkey.aws.elasticbeanstalk.-2010-12-01.update-configuration-template-message/options-to-remove (clojure.spec.alpha/and :portkey.aws.elasticbeanstalk.-2010-12-01/options-specifier-list))
(clojure.spec.alpha/def :portkey.aws.elasticbeanstalk.-2010-12-01/update-configuration-template-message (clojure.spec.alpha/keys :req-un [:portkey.aws.elasticbeanstalk.-2010-12-01/application-name :portkey.aws.elasticbeanstalk.-2010-12-01.update-configuration-template-message/template-name] :opt-un [:portkey.aws.elasticbeanstalk.-2010-12-01/description :portkey.aws.elasticbeanstalk.-2010-12-01.update-configuration-template-message/option-settings :portkey.aws.elasticbeanstalk.-2010-12-01.update-configuration-template-message/options-to-remove]))

(clojure.spec.alpha/def :portkey.aws.elasticbeanstalk.-2010-12-01/environment-info-type #{"tail" :bundle "bundle" :tail})

(clojure.spec.alpha/def :portkey.aws.elasticbeanstalk.-2010-12-01.application-descriptions-message/applications (clojure.spec.alpha/and :portkey.aws.elasticbeanstalk.-2010-12-01/application-description-list))
(clojure.spec.alpha/def :portkey.aws.elasticbeanstalk.-2010-12-01/application-descriptions-message (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.elasticbeanstalk.-2010-12-01.application-descriptions-message/applications]))

(clojure.spec.alpha/def :portkey.aws.elasticbeanstalk.-2010-12-01/configuration-option-name (clojure.spec.alpha/and clojure.core/string?))

(clojure.spec.alpha/def :portkey.aws.elasticbeanstalk.-2010-12-01/resource-id (clojure.spec.alpha/and clojure.core/string?))

(clojure.spec.alpha/def :portkey.aws.elasticbeanstalk.-2010-12-01.describe-environment-health-result/health-status (clojure.spec.alpha/and :portkey.aws.elasticbeanstalk.-2010-12-01/string))
(clojure.spec.alpha/def :portkey.aws.elasticbeanstalk.-2010-12-01.describe-environment-health-result/status (clojure.spec.alpha/and :portkey.aws.elasticbeanstalk.-2010-12-01/environment-health))
(clojure.spec.alpha/def :portkey.aws.elasticbeanstalk.-2010-12-01.describe-environment-health-result/color (clojure.spec.alpha/and :portkey.aws.elasticbeanstalk.-2010-12-01/string))
(clojure.spec.alpha/def :portkey.aws.elasticbeanstalk.-2010-12-01.describe-environment-health-result/instances-health (clojure.spec.alpha/and :portkey.aws.elasticbeanstalk.-2010-12-01/instance-health-summary))
(clojure.spec.alpha/def :portkey.aws.elasticbeanstalk.-2010-12-01/describe-environment-health-result (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.elasticbeanstalk.-2010-12-01/environment-name :portkey.aws.elasticbeanstalk.-2010-12-01.describe-environment-health-result/health-status :portkey.aws.elasticbeanstalk.-2010-12-01.describe-environment-health-result/status :portkey.aws.elasticbeanstalk.-2010-12-01.describe-environment-health-result/color :portkey.aws.elasticbeanstalk.-2010-12-01/causes :portkey.aws.elasticbeanstalk.-2010-12-01/application-metrics :portkey.aws.elasticbeanstalk.-2010-12-01.describe-environment-health-result/instances-health :portkey.aws.elasticbeanstalk.-2010-12-01/refreshed-at]))

(clojure.spec.alpha/def :portkey.aws.elasticbeanstalk.-2010-12-01/platform-frameworks (clojure.spec.alpha/coll-of :portkey.aws.elasticbeanstalk.-2010-12-01/platform-framework))

(clojure.spec.alpha/def :portkey.aws.elasticbeanstalk.-2010-12-01.retrieve-environment-info-message/info-type (clojure.spec.alpha/and :portkey.aws.elasticbeanstalk.-2010-12-01/environment-info-type))
(clojure.spec.alpha/def :portkey.aws.elasticbeanstalk.-2010-12-01/retrieve-environment-info-message (clojure.spec.alpha/keys :req-un [:portkey.aws.elasticbeanstalk.-2010-12-01.retrieve-environment-info-message/info-type] :opt-un [:portkey.aws.elasticbeanstalk.-2010-12-01/environment-id :portkey.aws.elasticbeanstalk.-2010-12-01/environment-name]))

(clojure.spec.alpha/def :portkey.aws.elasticbeanstalk.-2010-12-01.environment-descriptions-message/environments (clojure.spec.alpha/and :portkey.aws.elasticbeanstalk.-2010-12-01/environment-descriptions-list))
(clojure.spec.alpha/def :portkey.aws.elasticbeanstalk.-2010-12-01.environment-descriptions-message/next-token (clojure.spec.alpha/and :portkey.aws.elasticbeanstalk.-2010-12-01/token))
(clojure.spec.alpha/def :portkey.aws.elasticbeanstalk.-2010-12-01/environment-descriptions-message (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.elasticbeanstalk.-2010-12-01.environment-descriptions-message/environments :portkey.aws.elasticbeanstalk.-2010-12-01.environment-descriptions-message/next-token]))

(clojure.spec.alpha/def :portkey.aws.elasticbeanstalk.-2010-12-01/application-version-description-list (clojure.spec.alpha/coll-of :portkey.aws.elasticbeanstalk.-2010-12-01/application-version-description))

(clojure.spec.alpha/def :portkey.aws.elasticbeanstalk.-2010-12-01/too-many-platforms-exception (clojure.spec.alpha/keys :req-un [] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.elasticbeanstalk.-2010-12-01.resource-quotas/application-quota (clojure.spec.alpha/and :portkey.aws.elasticbeanstalk.-2010-12-01/resource-quota))
(clojure.spec.alpha/def :portkey.aws.elasticbeanstalk.-2010-12-01.resource-quotas/application-version-quota (clojure.spec.alpha/and :portkey.aws.elasticbeanstalk.-2010-12-01/resource-quota))
(clojure.spec.alpha/def :portkey.aws.elasticbeanstalk.-2010-12-01.resource-quotas/environment-quota (clojure.spec.alpha/and :portkey.aws.elasticbeanstalk.-2010-12-01/resource-quota))
(clojure.spec.alpha/def :portkey.aws.elasticbeanstalk.-2010-12-01.resource-quotas/configuration-template-quota (clojure.spec.alpha/and :portkey.aws.elasticbeanstalk.-2010-12-01/resource-quota))
(clojure.spec.alpha/def :portkey.aws.elasticbeanstalk.-2010-12-01.resource-quotas/custom-platform-quota (clojure.spec.alpha/and :portkey.aws.elasticbeanstalk.-2010-12-01/resource-quota))
(clojure.spec.alpha/def :portkey.aws.elasticbeanstalk.-2010-12-01/resource-quotas (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.elasticbeanstalk.-2010-12-01.resource-quotas/application-quota :portkey.aws.elasticbeanstalk.-2010-12-01.resource-quotas/application-version-quota :portkey.aws.elasticbeanstalk.-2010-12-01.resource-quotas/environment-quota :portkey.aws.elasticbeanstalk.-2010-12-01.resource-quotas/configuration-template-quota :portkey.aws.elasticbeanstalk.-2010-12-01.resource-quotas/custom-platform-quota]))

(clojure.spec.alpha/def :portkey.aws.elasticbeanstalk.-2010-12-01/too-many-environments-exception (clojure.spec.alpha/keys :req-un [] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.elasticbeanstalk.-2010-12-01/platform-filter-value (clojure.spec.alpha/and clojure.core/string?))

(clojure.spec.alpha/def :portkey.aws.elasticbeanstalk.-2010-12-01/environment-arn (clojure.spec.alpha/and clojure.core/string?))

(clojure.spec.alpha/def :portkey.aws.elasticbeanstalk.-2010-12-01.option-specification/namespace (clojure.spec.alpha/and :portkey.aws.elasticbeanstalk.-2010-12-01/option-namespace))
(clojure.spec.alpha/def :portkey.aws.elasticbeanstalk.-2010-12-01.option-specification/option-name (clojure.spec.alpha/and :portkey.aws.elasticbeanstalk.-2010-12-01/configuration-option-name))
(clojure.spec.alpha/def :portkey.aws.elasticbeanstalk.-2010-12-01/option-specification (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.elasticbeanstalk.-2010-12-01/resource-name :portkey.aws.elasticbeanstalk.-2010-12-01.option-specification/namespace :portkey.aws.elasticbeanstalk.-2010-12-01.option-specification/option-name]))

(clojure.spec.alpha/def :portkey.aws.elasticbeanstalk.-2010-12-01/available-solution-stack-details-list (clojure.spec.alpha/coll-of :portkey.aws.elasticbeanstalk.-2010-12-01/solution-stack-description))

(clojure.spec.alpha/def :portkey.aws.elasticbeanstalk.-2010-12-01/tag-list (clojure.spec.alpha/coll-of :portkey.aws.elasticbeanstalk.-2010-12-01/tag))

(clojure.spec.alpha/def :portkey.aws.elasticbeanstalk.-2010-12-01.swap-environment-cnam-es-message/source-environment-id (clojure.spec.alpha/and :portkey.aws.elasticbeanstalk.-2010-12-01/environment-id))
(clojure.spec.alpha/def :portkey.aws.elasticbeanstalk.-2010-12-01.swap-environment-cnam-es-message/source-environment-name (clojure.spec.alpha/and :portkey.aws.elasticbeanstalk.-2010-12-01/environment-name))
(clojure.spec.alpha/def :portkey.aws.elasticbeanstalk.-2010-12-01.swap-environment-cnam-es-message/destination-environment-id (clojure.spec.alpha/and :portkey.aws.elasticbeanstalk.-2010-12-01/environment-id))
(clojure.spec.alpha/def :portkey.aws.elasticbeanstalk.-2010-12-01.swap-environment-cnam-es-message/destination-environment-name (clojure.spec.alpha/and :portkey.aws.elasticbeanstalk.-2010-12-01/environment-name))
(clojure.spec.alpha/def :portkey.aws.elasticbeanstalk.-2010-12-01/swap-environment-cnam-es-message (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.elasticbeanstalk.-2010-12-01.swap-environment-cnam-es-message/source-environment-id :portkey.aws.elasticbeanstalk.-2010-12-01.swap-environment-cnam-es-message/source-environment-name :portkey.aws.elasticbeanstalk.-2010-12-01.swap-environment-cnam-es-message/destination-environment-id :portkey.aws.elasticbeanstalk.-2010-12-01.swap-environment-cnam-es-message/destination-environment-name]))

(clojure.spec.alpha/def :portkey.aws.elasticbeanstalk.-2010-12-01/delete-application-version-message (clojure.spec.alpha/keys :req-un [:portkey.aws.elasticbeanstalk.-2010-12-01/application-name :portkey.aws.elasticbeanstalk.-2010-12-01/version-label] :opt-un [:portkey.aws.elasticbeanstalk.-2010-12-01/delete-source-bundle]))

(clojure.spec.alpha/def :portkey.aws.elasticbeanstalk.-2010-12-01/describe-instances-health-result (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.elasticbeanstalk.-2010-12-01/instance-health-list :portkey.aws.elasticbeanstalk.-2010-12-01/refreshed-at :portkey.aws.elasticbeanstalk.-2010-12-01/next-token]))

(clojure.spec.alpha/def :portkey.aws.elasticbeanstalk.-2010-12-01/environment-health-attribute #{:health-status :instances-health :application-metrics :color "HealthStatus" "InstancesHealth" "Status" :all "Causes" :status "ApplicationMetrics" :refreshed-at "RefreshedAt" "All" "Color" :causes})

(clojure.spec.alpha/def :portkey.aws.elasticbeanstalk.-2010-12-01/instances-health-attributes (clojure.spec.alpha/coll-of :portkey.aws.elasticbeanstalk.-2010-12-01/instances-health-attribute))

(clojure.spec.alpha/def :portkey.aws.elasticbeanstalk.-2010-12-01/tag-key-list (clojure.spec.alpha/coll-of :portkey.aws.elasticbeanstalk.-2010-12-01/tag-key))

(clojure.spec.alpha/def :portkey.aws.elasticbeanstalk.-2010-12-01.managed-action/action-id (clojure.spec.alpha/and :portkey.aws.elasticbeanstalk.-2010-12-01/string))
(clojure.spec.alpha/def :portkey.aws.elasticbeanstalk.-2010-12-01.managed-action/action-description (clojure.spec.alpha/and :portkey.aws.elasticbeanstalk.-2010-12-01/string))
(clojure.spec.alpha/def :portkey.aws.elasticbeanstalk.-2010-12-01.managed-action/status (clojure.spec.alpha/and :portkey.aws.elasticbeanstalk.-2010-12-01/action-status))
(clojure.spec.alpha/def :portkey.aws.elasticbeanstalk.-2010-12-01.managed-action/window-start-time (clojure.spec.alpha/and :portkey.aws.elasticbeanstalk.-2010-12-01/timestamp))
(clojure.spec.alpha/def :portkey.aws.elasticbeanstalk.-2010-12-01/managed-action (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.elasticbeanstalk.-2010-12-01.managed-action/action-id :portkey.aws.elasticbeanstalk.-2010-12-01.managed-action/action-description :portkey.aws.elasticbeanstalk.-2010-12-01/action-type :portkey.aws.elasticbeanstalk.-2010-12-01.managed-action/status :portkey.aws.elasticbeanstalk.-2010-12-01.managed-action/window-start-time]))

(clojure.spec.alpha/def :portkey.aws.elasticbeanstalk.-2010-12-01/include-deleted clojure.core/boolean?)

(clojure.spec.alpha/def :portkey.aws.elasticbeanstalk.-2010-12-01/platform-owner (clojure.spec.alpha/and clojure.core/string?))

(clojure.spec.alpha/def :portkey.aws.elasticbeanstalk.-2010-12-01.environment-resource-description/auto-scaling-groups (clojure.spec.alpha/and :portkey.aws.elasticbeanstalk.-2010-12-01/auto-scaling-group-list))
(clojure.spec.alpha/def :portkey.aws.elasticbeanstalk.-2010-12-01.environment-resource-description/instances (clojure.spec.alpha/and :portkey.aws.elasticbeanstalk.-2010-12-01/instance-list))
(clojure.spec.alpha/def :portkey.aws.elasticbeanstalk.-2010-12-01.environment-resource-description/launch-configurations (clojure.spec.alpha/and :portkey.aws.elasticbeanstalk.-2010-12-01/launch-configuration-list))
(clojure.spec.alpha/def :portkey.aws.elasticbeanstalk.-2010-12-01.environment-resource-description/load-balancers (clojure.spec.alpha/and :portkey.aws.elasticbeanstalk.-2010-12-01/load-balancer-list))
(clojure.spec.alpha/def :portkey.aws.elasticbeanstalk.-2010-12-01.environment-resource-description/triggers (clojure.spec.alpha/and :portkey.aws.elasticbeanstalk.-2010-12-01/trigger-list))
(clojure.spec.alpha/def :portkey.aws.elasticbeanstalk.-2010-12-01.environment-resource-description/queues (clojure.spec.alpha/and :portkey.aws.elasticbeanstalk.-2010-12-01/queue-list))
(clojure.spec.alpha/def :portkey.aws.elasticbeanstalk.-2010-12-01/environment-resource-description (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.elasticbeanstalk.-2010-12-01/environment-name :portkey.aws.elasticbeanstalk.-2010-12-01.environment-resource-description/auto-scaling-groups :portkey.aws.elasticbeanstalk.-2010-12-01.environment-resource-description/instances :portkey.aws.elasticbeanstalk.-2010-12-01.environment-resource-description/launch-configurations :portkey.aws.elasticbeanstalk.-2010-12-01.environment-resource-description/load-balancers :portkey.aws.elasticbeanstalk.-2010-12-01.environment-resource-description/triggers :portkey.aws.elasticbeanstalk.-2010-12-01.environment-resource-description/queues]))

(clojure.spec.alpha/def :portkey.aws.elasticbeanstalk.-2010-12-01/update-application-message (clojure.spec.alpha/keys :req-un [:portkey.aws.elasticbeanstalk.-2010-12-01/application-name] :opt-un [:portkey.aws.elasticbeanstalk.-2010-12-01/description]))

(clojure.spec.alpha/def :portkey.aws.elasticbeanstalk.-2010-12-01/supported-addon (clojure.spec.alpha/and clojure.core/string?))

(clojure.spec.alpha/def :portkey.aws.elasticbeanstalk.-2010-12-01.application-resource-lifecycle-description-message/resource-lifecycle-config (clojure.spec.alpha/and :portkey.aws.elasticbeanstalk.-2010-12-01/application-resource-lifecycle-config))
(clojure.spec.alpha/def :portkey.aws.elasticbeanstalk.-2010-12-01/application-resource-lifecycle-description-message (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.elasticbeanstalk.-2010-12-01/application-name :portkey.aws.elasticbeanstalk.-2010-12-01.application-resource-lifecycle-description-message/resource-lifecycle-config]))

(clojure.spec.alpha/def :portkey.aws.elasticbeanstalk.-2010-12-01/resource-not-found-exception (clojure.spec.alpha/keys :req-un [] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.elasticbeanstalk.-2010-12-01/action-status #{:unknown :pending "Unknown" "Scheduled" :running :scheduled "Running" "Pending"})

(clojure.spec.alpha/def :portkey.aws.elasticbeanstalk.-2010-12-01/abortable-operation-in-progress clojure.core/boolean?)

(clojure.spec.alpha/def :portkey.aws.elasticbeanstalk.-2010-12-01/causes (clojure.spec.alpha/coll-of :portkey.aws.elasticbeanstalk.-2010-12-01/cause))

(clojure.spec.alpha/def :portkey.aws.elasticbeanstalk.-2010-12-01.update-tags-for-resource-message/tags-to-add (clojure.spec.alpha/and :portkey.aws.elasticbeanstalk.-2010-12-01/tag-list))
(clojure.spec.alpha/def :portkey.aws.elasticbeanstalk.-2010-12-01.update-tags-for-resource-message/tags-to-remove (clojure.spec.alpha/and :portkey.aws.elasticbeanstalk.-2010-12-01/tag-key-list))
(clojure.spec.alpha/def :portkey.aws.elasticbeanstalk.-2010-12-01/update-tags-for-resource-message (clojure.spec.alpha/keys :req-un [:portkey.aws.elasticbeanstalk.-2010-12-01/resource-arn] :opt-un [:portkey.aws.elasticbeanstalk.-2010-12-01.update-tags-for-resource-message/tags-to-add :portkey.aws.elasticbeanstalk.-2010-12-01.update-tags-for-resource-message/tags-to-remove]))

(clojure.spec.alpha/def :portkey.aws.elasticbeanstalk.-2010-12-01/nullable-long clojure.core/int?)

(clojure.spec.alpha/def :portkey.aws.elasticbeanstalk.-2010-12-01/delete-platform-version-request (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.elasticbeanstalk.-2010-12-01/platform-arn]))

(clojure.spec.alpha/def :portkey.aws.elasticbeanstalk.-2010-12-01/delete-environment-configuration-message (clojure.spec.alpha/keys :req-un [:portkey.aws.elasticbeanstalk.-2010-12-01/application-name :portkey.aws.elasticbeanstalk.-2010-12-01/environment-name] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.elasticbeanstalk.-2010-12-01/configuration-option-value-type #{"Scalar" :scalar :list "List"})

(clojure.spec.alpha/def :portkey.aws.elasticbeanstalk.-2010-12-01/too-many-buckets-exception (clojure.spec.alpha/keys :req-un [] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.elasticbeanstalk.-2010-12-01/application-version-status #{"Failed" :building :unprocessed :processing "Unprocessed" "Building" "Processed" "Processing" :processed :failed})

(clojure.spec.alpha/def :portkey.aws.elasticbeanstalk.-2010-12-01/maintainer (clojure.spec.alpha/and clojure.core/string?))

(clojure.spec.alpha/def :portkey.aws.elasticbeanstalk.-2010-12-01/description (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__27881__auto__] (clojure.core/< (clojure.core/count s__27881__auto__) 200))))

(clojure.spec.alpha/def :portkey.aws.elasticbeanstalk.-2010-12-01/tag-value (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__27880__auto__] (clojure.core/<= 1 (clojure.core/count s__27880__auto__))) (clojure.core/fn [s__27881__auto__] (clojure.core/< (clojure.core/count s__27881__auto__) 256))))

(clojure.spec.alpha/def :portkey.aws.elasticbeanstalk.-2010-12-01/configuration-option-settings-list (clojure.spec.alpha/coll-of :portkey.aws.elasticbeanstalk.-2010-12-01/configuration-option-setting))

(clojure.spec.alpha/def :portkey.aws.elasticbeanstalk.-2010-12-01.configuration-option-setting/namespace (clojure.spec.alpha/and :portkey.aws.elasticbeanstalk.-2010-12-01/option-namespace))
(clojure.spec.alpha/def :portkey.aws.elasticbeanstalk.-2010-12-01.configuration-option-setting/option-name (clojure.spec.alpha/and :portkey.aws.elasticbeanstalk.-2010-12-01/configuration-option-name))
(clojure.spec.alpha/def :portkey.aws.elasticbeanstalk.-2010-12-01.configuration-option-setting/value (clojure.spec.alpha/and :portkey.aws.elasticbeanstalk.-2010-12-01/configuration-option-value))
(clojure.spec.alpha/def :portkey.aws.elasticbeanstalk.-2010-12-01/configuration-option-setting (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.elasticbeanstalk.-2010-12-01/resource-name :portkey.aws.elasticbeanstalk.-2010-12-01.configuration-option-setting/namespace :portkey.aws.elasticbeanstalk.-2010-12-01.configuration-option-setting/option-name :portkey.aws.elasticbeanstalk.-2010-12-01.configuration-option-setting/value]))

(clojure.spec.alpha/def :portkey.aws.elasticbeanstalk.-2010-12-01/action-history-status #{"Failed" :unknown :completed "Unknown" "Completed" :failed})

(clojure.spec.alpha/def :portkey.aws.elasticbeanstalk.-2010-12-01/environment-info-description-list (clojure.spec.alpha/coll-of :portkey.aws.elasticbeanstalk.-2010-12-01/environment-info-description))

(clojure.spec.alpha/def :portkey.aws.elasticbeanstalk.-2010-12-01/endpoint-url (clojure.spec.alpha/and clojure.core/string?))

(clojure.spec.alpha/def :portkey.aws.elasticbeanstalk.-2010-12-01.retrieve-environment-info-result-message/environment-info (clojure.spec.alpha/and :portkey.aws.elasticbeanstalk.-2010-12-01/environment-info-description-list))
(clojure.spec.alpha/def :portkey.aws.elasticbeanstalk.-2010-12-01/retrieve-environment-info-result-message (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.elasticbeanstalk.-2010-12-01.retrieve-environment-info-result-message/environment-info]))

(clojure.spec.alpha/def :portkey.aws.elasticbeanstalk.-2010-12-01/time-filter-start clojure.core/inst?)

(clojure.spec.alpha/def :portkey.aws.elasticbeanstalk.-2010-12-01/builder (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.elasticbeanstalk.-2010-12-01/arn]))

(clojure.spec.alpha/def :portkey.aws.elasticbeanstalk.-2010-12-01.event-descriptions-message/events (clojure.spec.alpha/and :portkey.aws.elasticbeanstalk.-2010-12-01/event-description-list))
(clojure.spec.alpha/def :portkey.aws.elasticbeanstalk.-2010-12-01.event-descriptions-message/next-token (clojure.spec.alpha/and :portkey.aws.elasticbeanstalk.-2010-12-01/token))
(clojure.spec.alpha/def :portkey.aws.elasticbeanstalk.-2010-12-01/event-descriptions-message (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.elasticbeanstalk.-2010-12-01.event-descriptions-message/events :portkey.aws.elasticbeanstalk.-2010-12-01.event-descriptions-message/next-token]))

(clojure.spec.alpha/def :portkey.aws.elasticbeanstalk.-2010-12-01.application-version-description-message/application-version (clojure.spec.alpha/and :portkey.aws.elasticbeanstalk.-2010-12-01/application-version-description))
(clojure.spec.alpha/def :portkey.aws.elasticbeanstalk.-2010-12-01/application-version-description-message (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.elasticbeanstalk.-2010-12-01.application-version-description-message/application-version]))

(clojure.spec.alpha/def :portkey.aws.elasticbeanstalk.-2010-12-01/exception-message (clojure.spec.alpha/and clojure.core/string?))

(clojure.spec.alpha/def :portkey.aws.elasticbeanstalk.-2010-12-01/message (clojure.spec.alpha/and clojure.core/string?))

(clojure.spec.alpha/def :portkey.aws.elasticbeanstalk.-2010-12-01.environment-resource-descriptions-message/environment-resources (clojure.spec.alpha/and :portkey.aws.elasticbeanstalk.-2010-12-01/environment-resource-description))
(clojure.spec.alpha/def :portkey.aws.elasticbeanstalk.-2010-12-01/environment-resource-descriptions-message (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.elasticbeanstalk.-2010-12-01.environment-resource-descriptions-message/environment-resources]))

(clojure.spec.alpha/def :portkey.aws.elasticbeanstalk.-2010-12-01.delete-configuration-template-message/template-name (clojure.spec.alpha/and :portkey.aws.elasticbeanstalk.-2010-12-01/configuration-template-name))
(clojure.spec.alpha/def :portkey.aws.elasticbeanstalk.-2010-12-01/delete-configuration-template-message (clojure.spec.alpha/keys :req-un [:portkey.aws.elasticbeanstalk.-2010-12-01/application-name :portkey.aws.elasticbeanstalk.-2010-12-01.delete-configuration-template-message/template-name] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.elasticbeanstalk.-2010-12-01/options-specifier-list (clojure.spec.alpha/coll-of :portkey.aws.elasticbeanstalk.-2010-12-01/option-specification))

(clojure.spec.alpha/def :portkey.aws.elasticbeanstalk.-2010-12-01/describe-account-attributes-result (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.elasticbeanstalk.-2010-12-01/resource-quotas]))

(clojure.spec.alpha/def :portkey.aws.elasticbeanstalk.-2010-12-01/platform-max-records (clojure.spec.alpha/int-in 1 Long/MAX_VALUE))

(clojure.spec.alpha/def :portkey.aws.elasticbeanstalk.-2010-12-01.max-count-rule/enabled (clojure.spec.alpha/and :portkey.aws.elasticbeanstalk.-2010-12-01/boxed-boolean))
(clojure.spec.alpha/def :portkey.aws.elasticbeanstalk.-2010-12-01.max-count-rule/max-count (clojure.spec.alpha/and :portkey.aws.elasticbeanstalk.-2010-12-01/boxed-int))
(clojure.spec.alpha/def :portkey.aws.elasticbeanstalk.-2010-12-01.max-count-rule/delete-source-from-s-3 (clojure.spec.alpha/and :portkey.aws.elasticbeanstalk.-2010-12-01/boxed-boolean))
(clojure.spec.alpha/def :portkey.aws.elasticbeanstalk.-2010-12-01/max-count-rule (clojure.spec.alpha/keys :req-un [:portkey.aws.elasticbeanstalk.-2010-12-01.max-count-rule/enabled] :opt-un [:portkey.aws.elasticbeanstalk.-2010-12-01.max-count-rule/max-count :portkey.aws.elasticbeanstalk.-2010-12-01.max-count-rule/delete-source-from-s-3]))

(clojure.spec.alpha/def :portkey.aws.elasticbeanstalk.-2010-12-01.auto-scaling-group/name (clojure.spec.alpha/and :portkey.aws.elasticbeanstalk.-2010-12-01/resource-id))
(clojure.spec.alpha/def :portkey.aws.elasticbeanstalk.-2010-12-01/auto-scaling-group (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.elasticbeanstalk.-2010-12-01.auto-scaling-group/name]))

(clojure.spec.alpha/def :portkey.aws.elasticbeanstalk.-2010-12-01.single-instance-health/instance-type (clojure.spec.alpha/and :portkey.aws.elasticbeanstalk.-2010-12-01/string))
(clojure.spec.alpha/def :portkey.aws.elasticbeanstalk.-2010-12-01.single-instance-health/health-status (clojure.spec.alpha/and :portkey.aws.elasticbeanstalk.-2010-12-01/string))
(clojure.spec.alpha/def :portkey.aws.elasticbeanstalk.-2010-12-01.single-instance-health/availability-zone (clojure.spec.alpha/and :portkey.aws.elasticbeanstalk.-2010-12-01/string))
(clojure.spec.alpha/def :portkey.aws.elasticbeanstalk.-2010-12-01.single-instance-health/system (clojure.spec.alpha/and :portkey.aws.elasticbeanstalk.-2010-12-01/system-status))
(clojure.spec.alpha/def :portkey.aws.elasticbeanstalk.-2010-12-01.single-instance-health/color (clojure.spec.alpha/and :portkey.aws.elasticbeanstalk.-2010-12-01/string))
(clojure.spec.alpha/def :portkey.aws.elasticbeanstalk.-2010-12-01/single-instance-health (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.elasticbeanstalk.-2010-12-01/instance-id :portkey.aws.elasticbeanstalk.-2010-12-01/deployment :portkey.aws.elasticbeanstalk.-2010-12-01/launched-at :portkey.aws.elasticbeanstalk.-2010-12-01.single-instance-health/instance-type :portkey.aws.elasticbeanstalk.-2010-12-01.single-instance-health/health-status :portkey.aws.elasticbeanstalk.-2010-12-01.single-instance-health/availability-zone :portkey.aws.elasticbeanstalk.-2010-12-01/causes :portkey.aws.elasticbeanstalk.-2010-12-01/application-metrics :portkey.aws.elasticbeanstalk.-2010-12-01.single-instance-health/system :portkey.aws.elasticbeanstalk.-2010-12-01.single-instance-health/color]))

(clojure.spec.alpha/def :portkey.aws.elasticbeanstalk.-2010-12-01/application-name (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__27880__auto__] (clojure.core/<= 1 (clojure.core/count s__27880__auto__))) (clojure.core/fn [s__27881__auto__] (clojure.core/< (clojure.core/count s__27881__auto__) 100))))

(clojure.spec.alpha/def :portkey.aws.elasticbeanstalk.-2010-12-01/event-date clojure.core/inst?)

(clojure.spec.alpha/def :portkey.aws.elasticbeanstalk.-2010-12-01/validation-message-string (clojure.spec.alpha/and clojure.core/string?))

(clojure.spec.alpha/def :portkey.aws.elasticbeanstalk.-2010-12-01/platform-version (clojure.spec.alpha/and clojure.core/string?))

(clojure.spec.alpha/def :portkey.aws.elasticbeanstalk.-2010-12-01.create-configuration-template-message/template-name (clojure.spec.alpha/and :portkey.aws.elasticbeanstalk.-2010-12-01/configuration-template-name))
(clojure.spec.alpha/def :portkey.aws.elasticbeanstalk.-2010-12-01.create-configuration-template-message/option-settings (clojure.spec.alpha/and :portkey.aws.elasticbeanstalk.-2010-12-01/configuration-option-settings-list))
(clojure.spec.alpha/def :portkey.aws.elasticbeanstalk.-2010-12-01/create-configuration-template-message (clojure.spec.alpha/keys :req-un [:portkey.aws.elasticbeanstalk.-2010-12-01/application-name :portkey.aws.elasticbeanstalk.-2010-12-01.create-configuration-template-message/template-name] :opt-un [:portkey.aws.elasticbeanstalk.-2010-12-01/solution-stack-name :portkey.aws.elasticbeanstalk.-2010-12-01/platform-arn :portkey.aws.elasticbeanstalk.-2010-12-01/source-configuration :portkey.aws.elasticbeanstalk.-2010-12-01/environment-id :portkey.aws.elasticbeanstalk.-2010-12-01/description :portkey.aws.elasticbeanstalk.-2010-12-01.create-configuration-template-message/option-settings]))

(clojure.spec.alpha/def :portkey.aws.elasticbeanstalk.-2010-12-01/platform-filters (clojure.spec.alpha/coll-of :portkey.aws.elasticbeanstalk.-2010-12-01/platform-filter))

(clojure.spec.alpha/def :portkey.aws.elasticbeanstalk.-2010-12-01.apply-environment-managed-action-result/action-id (clojure.spec.alpha/and :portkey.aws.elasticbeanstalk.-2010-12-01/string))
(clojure.spec.alpha/def :portkey.aws.elasticbeanstalk.-2010-12-01.apply-environment-managed-action-result/action-description (clojure.spec.alpha/and :portkey.aws.elasticbeanstalk.-2010-12-01/string))
(clojure.spec.alpha/def :portkey.aws.elasticbeanstalk.-2010-12-01.apply-environment-managed-action-result/status (clojure.spec.alpha/and :portkey.aws.elasticbeanstalk.-2010-12-01/string))
(clojure.spec.alpha/def :portkey.aws.elasticbeanstalk.-2010-12-01/apply-environment-managed-action-result (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.elasticbeanstalk.-2010-12-01.apply-environment-managed-action-result/action-id :portkey.aws.elasticbeanstalk.-2010-12-01.apply-environment-managed-action-result/action-description :portkey.aws.elasticbeanstalk.-2010-12-01/action-type :portkey.aws.elasticbeanstalk.-2010-12-01.apply-environment-managed-action-result/status]))

(clojure.spec.alpha/def :portkey.aws.elasticbeanstalk.-2010-12-01/resource-name (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__27880__auto__] (clojure.core/<= 1 (clojure.core/count s__27880__auto__))) (clojure.core/fn [s__27881__auto__] (clojure.core/< (clojure.core/count s__27881__auto__) 256))))

(clojure.spec.alpha/def :portkey.aws.elasticbeanstalk.-2010-12-01/code-build-not-in-service-region-exception (clojure.spec.alpha/keys :req-un [] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.elasticbeanstalk.-2010-12-01/integer clojure.core/int?)

(clojure.spec.alpha/def :portkey.aws.elasticbeanstalk.-2010-12-01/string (clojure.spec.alpha/and clojure.core/string?))

(clojure.spec.alpha/def :portkey.aws.elasticbeanstalk.-2010-12-01/platform-programming-languages (clojure.spec.alpha/coll-of :portkey.aws.elasticbeanstalk.-2010-12-01/platform-programming-language))

(clojure.spec.alpha/def :portkey.aws.elasticbeanstalk.-2010-12-01.application-metrics/duration (clojure.spec.alpha/and :portkey.aws.elasticbeanstalk.-2010-12-01/nullable-integer))
(clojure.spec.alpha/def :portkey.aws.elasticbeanstalk.-2010-12-01/application-metrics (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.elasticbeanstalk.-2010-12-01.application-metrics/duration :portkey.aws.elasticbeanstalk.-2010-12-01/request-count :portkey.aws.elasticbeanstalk.-2010-12-01/status-codes :portkey.aws.elasticbeanstalk.-2010-12-01/latency]))

(clojure.spec.alpha/def :portkey.aws.elasticbeanstalk.-2010-12-01/environment-names-list (clojure.spec.alpha/coll-of :portkey.aws.elasticbeanstalk.-2010-12-01/environment-name))

(clojure.spec.alpha/def :portkey.aws.elasticbeanstalk.-2010-12-01/too-many-tags-exception (clojure.spec.alpha/keys :req-un [] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.elasticbeanstalk.-2010-12-01/operating-system-version (clojure.spec.alpha/and clojure.core/string?))

(clojure.spec.alpha/def :portkey.aws.elasticbeanstalk.-2010-12-01/instances-health-attribute #{:health-status "Deployment" "LaunchedAt" :application-metrics :system :color "InstanceType" "HealthStatus" :instance-type "AvailabilityZone" :availability-zone :all "Causes" "ApplicationMetrics" :deployment :refreshed-at "RefreshedAt" "System" "All" "Color" :causes :launched-at})

(clojure.spec.alpha/def :portkey.aws.elasticbeanstalk.-2010-12-01.describe-application-versions-message/version-labels (clojure.spec.alpha/and :portkey.aws.elasticbeanstalk.-2010-12-01/version-labels-list))
(clojure.spec.alpha/def :portkey.aws.elasticbeanstalk.-2010-12-01.describe-application-versions-message/next-token (clojure.spec.alpha/and :portkey.aws.elasticbeanstalk.-2010-12-01/token))
(clojure.spec.alpha/def :portkey.aws.elasticbeanstalk.-2010-12-01/describe-application-versions-message (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.elasticbeanstalk.-2010-12-01/application-name :portkey.aws.elasticbeanstalk.-2010-12-01.describe-application-versions-message/version-labels :portkey.aws.elasticbeanstalk.-2010-12-01/max-records :portkey.aws.elasticbeanstalk.-2010-12-01.describe-application-versions-message/next-token]))

(clojure.spec.alpha/def :portkey.aws.elasticbeanstalk.-2010-12-01/option-restriction-min-value clojure.core/int?)

(clojure.spec.alpha/def :portkey.aws.elasticbeanstalk.-2010-12-01.status-codes/status-2xx (clojure.spec.alpha/and :portkey.aws.elasticbeanstalk.-2010-12-01/nullable-integer))
(clojure.spec.alpha/def :portkey.aws.elasticbeanstalk.-2010-12-01.status-codes/status-3xx (clojure.spec.alpha/and :portkey.aws.elasticbeanstalk.-2010-12-01/nullable-integer))
(clojure.spec.alpha/def :portkey.aws.elasticbeanstalk.-2010-12-01.status-codes/status-4xx (clojure.spec.alpha/and :portkey.aws.elasticbeanstalk.-2010-12-01/nullable-integer))
(clojure.spec.alpha/def :portkey.aws.elasticbeanstalk.-2010-12-01.status-codes/status-5xx (clojure.spec.alpha/and :portkey.aws.elasticbeanstalk.-2010-12-01/nullable-integer))
(clojure.spec.alpha/def :portkey.aws.elasticbeanstalk.-2010-12-01/status-codes (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.elasticbeanstalk.-2010-12-01.status-codes/status-2xx :portkey.aws.elasticbeanstalk.-2010-12-01.status-codes/status-3xx :portkey.aws.elasticbeanstalk.-2010-12-01.status-codes/status-4xx :portkey.aws.elasticbeanstalk.-2010-12-01.status-codes/status-5xx]))

(clojure.spec.alpha/def :portkey.aws.elasticbeanstalk.-2010-12-01.terminate-environment-message/terminate-resources (clojure.spec.alpha/and :portkey.aws.elasticbeanstalk.-2010-12-01/terminate-environment-resources))
(clojure.spec.alpha/def :portkey.aws.elasticbeanstalk.-2010-12-01/terminate-environment-message (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.elasticbeanstalk.-2010-12-01/environment-id :portkey.aws.elasticbeanstalk.-2010-12-01/environment-name :portkey.aws.elasticbeanstalk.-2010-12-01.terminate-environment-message/terminate-resources :portkey.aws.elasticbeanstalk.-2010-12-01/force-terminate]))

(clojure.spec.alpha/def :portkey.aws.elasticbeanstalk.-2010-12-01/deployment-timestamp clojure.core/inst?)

(clojure.spec.alpha/def :portkey.aws.elasticbeanstalk.-2010-12-01/update-date clojure.core/inst?)

(clojure.spec.alpha/def :portkey.aws.elasticbeanstalk.-2010-12-01/compose-environments-message (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.elasticbeanstalk.-2010-12-01/application-name :portkey.aws.elasticbeanstalk.-2010-12-01/group-name :portkey.aws.elasticbeanstalk.-2010-12-01/version-labels]))

(clojure.spec.alpha/def :portkey.aws.elasticbeanstalk.-2010-12-01.listener/protocol (clojure.spec.alpha/and :portkey.aws.elasticbeanstalk.-2010-12-01/string))
(clojure.spec.alpha/def :portkey.aws.elasticbeanstalk.-2010-12-01.listener/port (clojure.spec.alpha/and :portkey.aws.elasticbeanstalk.-2010-12-01/integer))
(clojure.spec.alpha/def :portkey.aws.elasticbeanstalk.-2010-12-01/listener (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.elasticbeanstalk.-2010-12-01.listener/protocol :portkey.aws.elasticbeanstalk.-2010-12-01.listener/port]))

(clojure.spec.alpha/def :portkey.aws.elasticbeanstalk.-2010-12-01/s-3-key (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__27881__auto__] (clojure.core/< (clojure.core/count s__27881__auto__) 1024))))

(clojure.spec.alpha/def :portkey.aws.elasticbeanstalk.-2010-12-01/configuration-option-possible-value (clojure.spec.alpha/and clojure.core/string?))

(clojure.spec.alpha/def :portkey.aws.elasticbeanstalk.-2010-12-01/platform-summary-list (clojure.spec.alpha/coll-of :portkey.aws.elasticbeanstalk.-2010-12-01/platform-summary))

(clojure.spec.alpha/def :portkey.aws.elasticbeanstalk.-2010-12-01/failure-type #{"InvalidEnvironmentState" :rollback-failed :update-cancelled "RollbackSuccessful" "UpdateCancelled" :permissions-error "RollbackFailed" :internal-failure "CancellationFailed" :rollback-successful "InternalFailure" :cancellation-failed "PermissionsError" :invalid-environment-state})

(clojure.spec.alpha/def :portkey.aws.elasticbeanstalk.-2010-12-01/update-application-version-message (clojure.spec.alpha/keys :req-un [:portkey.aws.elasticbeanstalk.-2010-12-01/application-name :portkey.aws.elasticbeanstalk.-2010-12-01/version-label] :opt-un [:portkey.aws.elasticbeanstalk.-2010-12-01/description]))

(clojure.spec.alpha/def :portkey.aws.elasticbeanstalk.-2010-12-01.platform-description/date-updated (clojure.spec.alpha/and :portkey.aws.elasticbeanstalk.-2010-12-01/update-date))
(clojure.spec.alpha/def :portkey.aws.elasticbeanstalk.-2010-12-01.platform-description/programming-languages (clojure.spec.alpha/and :portkey.aws.elasticbeanstalk.-2010-12-01/platform-programming-languages))
(clojure.spec.alpha/def :portkey.aws.elasticbeanstalk.-2010-12-01.platform-description/date-created (clojure.spec.alpha/and :portkey.aws.elasticbeanstalk.-2010-12-01/creation-date))
(clojure.spec.alpha/def :portkey.aws.elasticbeanstalk.-2010-12-01.platform-description/frameworks (clojure.spec.alpha/and :portkey.aws.elasticbeanstalk.-2010-12-01/platform-frameworks))
(clojure.spec.alpha/def :portkey.aws.elasticbeanstalk.-2010-12-01/platform-description (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.elasticbeanstalk.-2010-12-01/solution-stack-name :portkey.aws.elasticbeanstalk.-2010-12-01/platform-name :portkey.aws.elasticbeanstalk.-2010-12-01/supported-addon-list :portkey.aws.elasticbeanstalk.-2010-12-01/operating-system-name :portkey.aws.elasticbeanstalk.-2010-12-01.platform-description/date-updated :portkey.aws.elasticbeanstalk.-2010-12-01/supported-tier-list :portkey.aws.elasticbeanstalk.-2010-12-01/platform-category :portkey.aws.elasticbeanstalk.-2010-12-01.platform-description/programming-languages :portkey.aws.elasticbeanstalk.-2010-12-01/platform-owner :portkey.aws.elasticbeanstalk.-2010-12-01.platform-description/date-created :portkey.aws.elasticbeanstalk.-2010-12-01/maintainer :portkey.aws.elasticbeanstalk.-2010-12-01/description :portkey.aws.elasticbeanstalk.-2010-12-01/platform-version :portkey.aws.elasticbeanstalk.-2010-12-01/operating-system-version :portkey.aws.elasticbeanstalk.-2010-12-01/platform-status :portkey.aws.elasticbeanstalk.-2010-12-01/platform-arn :portkey.aws.elasticbeanstalk.-2010-12-01.platform-description/frameworks :portkey.aws.elasticbeanstalk.-2010-12-01/custom-ami-list]))

(clojure.spec.alpha/def :portkey.aws.elasticbeanstalk.-2010-12-01/configuration-settings-description-list (clojure.spec.alpha/coll-of :portkey.aws.elasticbeanstalk.-2010-12-01/configuration-settings-description))

(clojure.spec.alpha/def :portkey.aws.elasticbeanstalk.-2010-12-01.event-description/severity (clojure.spec.alpha/and :portkey.aws.elasticbeanstalk.-2010-12-01/event-severity))
(clojure.spec.alpha/def :portkey.aws.elasticbeanstalk.-2010-12-01.event-description/message (clojure.spec.alpha/and :portkey.aws.elasticbeanstalk.-2010-12-01/event-message))
(clojure.spec.alpha/def :portkey.aws.elasticbeanstalk.-2010-12-01.event-description/template-name (clojure.spec.alpha/and :portkey.aws.elasticbeanstalk.-2010-12-01/configuration-template-name))
(clojure.spec.alpha/def :portkey.aws.elasticbeanstalk.-2010-12-01/event-description (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.elasticbeanstalk.-2010-12-01/version-label :portkey.aws.elasticbeanstalk.-2010-12-01.event-description/severity :portkey.aws.elasticbeanstalk.-2010-12-01/request-id :portkey.aws.elasticbeanstalk.-2010-12-01/environment-name :portkey.aws.elasticbeanstalk.-2010-12-01.event-description/message :portkey.aws.elasticbeanstalk.-2010-12-01/application-name :portkey.aws.elasticbeanstalk.-2010-12-01/event-date :portkey.aws.elasticbeanstalk.-2010-12-01.event-description/template-name :portkey.aws.elasticbeanstalk.-2010-12-01/platform-arn]))

(clojure.spec.alpha/def :portkey.aws.elasticbeanstalk.-2010-12-01/s-3-location (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.elasticbeanstalk.-2010-12-01/s-3-bucket :portkey.aws.elasticbeanstalk.-2010-12-01/s-3-key]))

(clojure.spec.alpha/def :portkey.aws.elasticbeanstalk.-2010-12-01/managed-action-history-items (clojure.spec.alpha/coll-of :portkey.aws.elasticbeanstalk.-2010-12-01/managed-action-history-item :min-count 1 :max-count 100))

(clojure.spec.alpha/def :portkey.aws.elasticbeanstalk.-2010-12-01/instance-list (clojure.spec.alpha/coll-of :portkey.aws.elasticbeanstalk.-2010-12-01/instance))

(clojure.spec.alpha/def :portkey.aws.elasticbeanstalk.-2010-12-01.configuration-settings-validation-messages/messages (clojure.spec.alpha/and :portkey.aws.elasticbeanstalk.-2010-12-01/validation-messages-list))
(clojure.spec.alpha/def :portkey.aws.elasticbeanstalk.-2010-12-01/configuration-settings-validation-messages (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.elasticbeanstalk.-2010-12-01.configuration-settings-validation-messages/messages]))

(clojure.spec.alpha/def :portkey.aws.elasticbeanstalk.-2010-12-01.max-age-rule/enabled (clojure.spec.alpha/and :portkey.aws.elasticbeanstalk.-2010-12-01/boxed-boolean))
(clojure.spec.alpha/def :portkey.aws.elasticbeanstalk.-2010-12-01.max-age-rule/max-age-in-days (clojure.spec.alpha/and :portkey.aws.elasticbeanstalk.-2010-12-01/boxed-int))
(clojure.spec.alpha/def :portkey.aws.elasticbeanstalk.-2010-12-01.max-age-rule/delete-source-from-s-3 (clojure.spec.alpha/and :portkey.aws.elasticbeanstalk.-2010-12-01/boxed-boolean))
(clojure.spec.alpha/def :portkey.aws.elasticbeanstalk.-2010-12-01/max-age-rule (clojure.spec.alpha/keys :req-un [:portkey.aws.elasticbeanstalk.-2010-12-01.max-age-rule/enabled] :opt-un [:portkey.aws.elasticbeanstalk.-2010-12-01.max-age-rule/max-age-in-days :portkey.aws.elasticbeanstalk.-2010-12-01.max-age-rule/delete-source-from-s-3]))

(clojure.spec.alpha/def :portkey.aws.elasticbeanstalk.-2010-12-01/s-3-bucket (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__27881__auto__] (clojure.core/< (clojure.core/count s__27881__auto__) 255))))

(clojure.spec.alpha/def :portkey.aws.elasticbeanstalk.-2010-12-01.validate-configuration-settings-message/template-name (clojure.spec.alpha/and :portkey.aws.elasticbeanstalk.-2010-12-01/configuration-template-name))
(clojure.spec.alpha/def :portkey.aws.elasticbeanstalk.-2010-12-01.validate-configuration-settings-message/option-settings (clojure.spec.alpha/and :portkey.aws.elasticbeanstalk.-2010-12-01/configuration-option-settings-list))
(clojure.spec.alpha/def :portkey.aws.elasticbeanstalk.-2010-12-01/validate-configuration-settings-message (clojure.spec.alpha/keys :req-un [:portkey.aws.elasticbeanstalk.-2010-12-01/application-name :portkey.aws.elasticbeanstalk.-2010-12-01.validate-configuration-settings-message/option-settings] :opt-un [:portkey.aws.elasticbeanstalk.-2010-12-01.validate-configuration-settings-message/template-name :portkey.aws.elasticbeanstalk.-2010-12-01/environment-name]))

(clojure.spec.alpha/def :portkey.aws.elasticbeanstalk.-2010-12-01/refreshed-at clojure.core/inst?)

(clojure.spec.alpha/def :portkey.aws.elasticbeanstalk.-2010-12-01/source-location (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__27880__auto__] (clojure.core/<= 3 (clojure.core/count s__27880__auto__))) (clojure.core/fn [s__27881__auto__] (clojure.core/< (clojure.core/count s__27881__auto__) 255)) (clojure.core/fn [s__27882__auto__] (clojure.core/re-matches #".+/.+" s__27882__auto__))))

(clojure.spec.alpha/def :portkey.aws.elasticbeanstalk.-2010-12-01.request-environment-info-message/info-type (clojure.spec.alpha/and :portkey.aws.elasticbeanstalk.-2010-12-01/environment-info-type))
(clojure.spec.alpha/def :portkey.aws.elasticbeanstalk.-2010-12-01/request-environment-info-message (clojure.spec.alpha/keys :req-un [:portkey.aws.elasticbeanstalk.-2010-12-01.request-environment-info-message/info-type] :opt-un [:portkey.aws.elasticbeanstalk.-2010-12-01/environment-id :portkey.aws.elasticbeanstalk.-2010-12-01/environment-name]))

(clojure.spec.alpha/def :portkey.aws.elasticbeanstalk.-2010-12-01/managed-action-invalid-state-exception (clojure.spec.alpha/keys :req-un [] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.elasticbeanstalk.-2010-12-01/rebuild-environment-message (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.elasticbeanstalk.-2010-12-01/environment-id :portkey.aws.elasticbeanstalk.-2010-12-01/environment-name]))

(clojure.spec.alpha/def :portkey.aws.elasticbeanstalk.-2010-12-01.cpu-utilization/user (clojure.spec.alpha/and :portkey.aws.elasticbeanstalk.-2010-12-01/nullable-double))
(clojure.spec.alpha/def :portkey.aws.elasticbeanstalk.-2010-12-01.cpu-utilization/nice (clojure.spec.alpha/and :portkey.aws.elasticbeanstalk.-2010-12-01/nullable-double))
(clojure.spec.alpha/def :portkey.aws.elasticbeanstalk.-2010-12-01.cpu-utilization/system (clojure.spec.alpha/and :portkey.aws.elasticbeanstalk.-2010-12-01/nullable-double))
(clojure.spec.alpha/def :portkey.aws.elasticbeanstalk.-2010-12-01.cpu-utilization/idle (clojure.spec.alpha/and :portkey.aws.elasticbeanstalk.-2010-12-01/nullable-double))
(clojure.spec.alpha/def :portkey.aws.elasticbeanstalk.-2010-12-01.cpu-utilization/io-wait (clojure.spec.alpha/and :portkey.aws.elasticbeanstalk.-2010-12-01/nullable-double))
(clojure.spec.alpha/def :portkey.aws.elasticbeanstalk.-2010-12-01.cpu-utilization/irq (clojure.spec.alpha/and :portkey.aws.elasticbeanstalk.-2010-12-01/nullable-double))
(clojure.spec.alpha/def :portkey.aws.elasticbeanstalk.-2010-12-01.cpu-utilization/soft-irq (clojure.spec.alpha/and :portkey.aws.elasticbeanstalk.-2010-12-01/nullable-double))
(clojure.spec.alpha/def :portkey.aws.elasticbeanstalk.-2010-12-01.cpu-utilization/privileged (clojure.spec.alpha/and :portkey.aws.elasticbeanstalk.-2010-12-01/nullable-double))
(clojure.spec.alpha/def :portkey.aws.elasticbeanstalk.-2010-12-01/cpu-utilization (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.elasticbeanstalk.-2010-12-01.cpu-utilization/user :portkey.aws.elasticbeanstalk.-2010-12-01.cpu-utilization/nice :portkey.aws.elasticbeanstalk.-2010-12-01.cpu-utilization/system :portkey.aws.elasticbeanstalk.-2010-12-01.cpu-utilization/idle :portkey.aws.elasticbeanstalk.-2010-12-01.cpu-utilization/io-wait :portkey.aws.elasticbeanstalk.-2010-12-01.cpu-utilization/irq :portkey.aws.elasticbeanstalk.-2010-12-01.cpu-utilization/soft-irq :portkey.aws.elasticbeanstalk.-2010-12-01.cpu-utilization/privileged]))

(clojure.spec.alpha/def :portkey.aws.elasticbeanstalk.-2010-12-01/creation-date clojure.core/inst?)

(clojure.spec.alpha/def :portkey.aws.elasticbeanstalk.-2010-12-01.apply-environment-managed-action-request/environment-name (clojure.spec.alpha/and :portkey.aws.elasticbeanstalk.-2010-12-01/string))
(clojure.spec.alpha/def :portkey.aws.elasticbeanstalk.-2010-12-01.apply-environment-managed-action-request/environment-id (clojure.spec.alpha/and :portkey.aws.elasticbeanstalk.-2010-12-01/string))
(clojure.spec.alpha/def :portkey.aws.elasticbeanstalk.-2010-12-01.apply-environment-managed-action-request/action-id (clojure.spec.alpha/and :portkey.aws.elasticbeanstalk.-2010-12-01/string))
(clojure.spec.alpha/def :portkey.aws.elasticbeanstalk.-2010-12-01/apply-environment-managed-action-request (clojure.spec.alpha/keys :req-un [:portkey.aws.elasticbeanstalk.-2010-12-01.apply-environment-managed-action-request/action-id] :opt-un [:portkey.aws.elasticbeanstalk.-2010-12-01.apply-environment-managed-action-request/environment-name :portkey.aws.elasticbeanstalk.-2010-12-01.apply-environment-managed-action-request/environment-id]))

(clojure.spec.alpha/def :portkey.aws.elasticbeanstalk.-2010-12-01/platform-filter-operator (clojure.spec.alpha/and clojure.core/string?))

(clojure.spec.alpha/def :portkey.aws.elasticbeanstalk.-2010-12-01.option-restriction-regex/pattern (clojure.spec.alpha/and :portkey.aws.elasticbeanstalk.-2010-12-01/regex-pattern))
(clojure.spec.alpha/def :portkey.aws.elasticbeanstalk.-2010-12-01.option-restriction-regex/label (clojure.spec.alpha/and :portkey.aws.elasticbeanstalk.-2010-12-01/regex-label))
(clojure.spec.alpha/def :portkey.aws.elasticbeanstalk.-2010-12-01/option-restriction-regex (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.elasticbeanstalk.-2010-12-01.option-restriction-regex/pattern :portkey.aws.elasticbeanstalk.-2010-12-01.option-restriction-regex/label]))

(clojure.spec.alpha/def :portkey.aws.elasticbeanstalk.-2010-12-01.load-balancer/name (clojure.spec.alpha/and :portkey.aws.elasticbeanstalk.-2010-12-01/resource-id))
(clojure.spec.alpha/def :portkey.aws.elasticbeanstalk.-2010-12-01/load-balancer (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.elasticbeanstalk.-2010-12-01.load-balancer/name]))

(clojure.spec.alpha/def :portkey.aws.elasticbeanstalk.-2010-12-01/option-restriction-max-length clojure.core/int?)

(clojure.spec.alpha/def :portkey.aws.elasticbeanstalk.-2010-12-01/s-3-subscription-required-exception (clojure.spec.alpha/keys :req-un [] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.elasticbeanstalk.-2010-12-01/timestamp clojure.core/inst?)

(clojure.spec.alpha/def :portkey.aws.elasticbeanstalk.-2010-12-01.launch-configuration/name (clojure.spec.alpha/and :portkey.aws.elasticbeanstalk.-2010-12-01/resource-id))
(clojure.spec.alpha/def :portkey.aws.elasticbeanstalk.-2010-12-01/launch-configuration (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.elasticbeanstalk.-2010-12-01.launch-configuration/name]))

(clojure.spec.alpha/def :portkey.aws.elasticbeanstalk.-2010-12-01/virtualization-type (clojure.spec.alpha/and clojure.core/string?))

(clojure.spec.alpha/def :portkey.aws.elasticbeanstalk.-2010-12-01/platform-status #{:deleted "Failed" "Creating" :ready :creating "Ready" :deleting "Deleting" "Deleted" :failed})

(clojure.spec.alpha/def :portkey.aws.elasticbeanstalk.-2010-12-01/resource-arn (clojure.spec.alpha/and clojure.core/string?))

(clojure.spec.alpha/def :portkey.aws.elasticbeanstalk.-2010-12-01/describe-platform-version-result (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.elasticbeanstalk.-2010-12-01/platform-description]))

(clojure.spec.alpha/def :portkey.aws.elasticbeanstalk.-2010-12-01.latency/p-999 (clojure.spec.alpha/and :portkey.aws.elasticbeanstalk.-2010-12-01/nullable-double))
(clojure.spec.alpha/def :portkey.aws.elasticbeanstalk.-2010-12-01.latency/p-99 (clojure.spec.alpha/and :portkey.aws.elasticbeanstalk.-2010-12-01/nullable-double))
(clojure.spec.alpha/def :portkey.aws.elasticbeanstalk.-2010-12-01.latency/p-95 (clojure.spec.alpha/and :portkey.aws.elasticbeanstalk.-2010-12-01/nullable-double))
(clojure.spec.alpha/def :portkey.aws.elasticbeanstalk.-2010-12-01.latency/p-90 (clojure.spec.alpha/and :portkey.aws.elasticbeanstalk.-2010-12-01/nullable-double))
(clojure.spec.alpha/def :portkey.aws.elasticbeanstalk.-2010-12-01.latency/p-85 (clojure.spec.alpha/and :portkey.aws.elasticbeanstalk.-2010-12-01/nullable-double))
(clojure.spec.alpha/def :portkey.aws.elasticbeanstalk.-2010-12-01.latency/p-75 (clojure.spec.alpha/and :portkey.aws.elasticbeanstalk.-2010-12-01/nullable-double))
(clojure.spec.alpha/def :portkey.aws.elasticbeanstalk.-2010-12-01.latency/p-50 (clojure.spec.alpha/and :portkey.aws.elasticbeanstalk.-2010-12-01/nullable-double))
(clojure.spec.alpha/def :portkey.aws.elasticbeanstalk.-2010-12-01.latency/p-10 (clojure.spec.alpha/and :portkey.aws.elasticbeanstalk.-2010-12-01/nullable-double))
(clojure.spec.alpha/def :portkey.aws.elasticbeanstalk.-2010-12-01/latency (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.elasticbeanstalk.-2010-12-01.latency/p-999 :portkey.aws.elasticbeanstalk.-2010-12-01.latency/p-99 :portkey.aws.elasticbeanstalk.-2010-12-01.latency/p-95 :portkey.aws.elasticbeanstalk.-2010-12-01.latency/p-90 :portkey.aws.elasticbeanstalk.-2010-12-01.latency/p-85 :portkey.aws.elasticbeanstalk.-2010-12-01.latency/p-75 :portkey.aws.elasticbeanstalk.-2010-12-01.latency/p-50 :portkey.aws.elasticbeanstalk.-2010-12-01.latency/p-10]))

(clojure.spec.alpha/def :portkey.aws.elasticbeanstalk.-2010-12-01/configuration-option-possible-values (clojure.spec.alpha/coll-of :portkey.aws.elasticbeanstalk.-2010-12-01/configuration-option-possible-value))

(clojure.spec.alpha/def :portkey.aws.elasticbeanstalk.-2010-12-01.describe-applications-message/application-names (clojure.spec.alpha/and :portkey.aws.elasticbeanstalk.-2010-12-01/application-names-list))
(clojure.spec.alpha/def :portkey.aws.elasticbeanstalk.-2010-12-01/describe-applications-message (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.elasticbeanstalk.-2010-12-01.describe-applications-message/application-names]))

(clojure.spec.alpha/def :portkey.aws.elasticbeanstalk.-2010-12-01.create-application-version-message/source-bundle (clojure.spec.alpha/and :portkey.aws.elasticbeanstalk.-2010-12-01/s-3-location))
(clojure.spec.alpha/def :portkey.aws.elasticbeanstalk.-2010-12-01.create-application-version-message/process (clojure.spec.alpha/and :portkey.aws.elasticbeanstalk.-2010-12-01/application-version-proccess))
(clojure.spec.alpha/def :portkey.aws.elasticbeanstalk.-2010-12-01/create-application-version-message (clojure.spec.alpha/keys :req-un [:portkey.aws.elasticbeanstalk.-2010-12-01/application-name :portkey.aws.elasticbeanstalk.-2010-12-01/version-label] :opt-un [:portkey.aws.elasticbeanstalk.-2010-12-01/description :portkey.aws.elasticbeanstalk.-2010-12-01/source-build-information :portkey.aws.elasticbeanstalk.-2010-12-01.create-application-version-message/source-bundle :portkey.aws.elasticbeanstalk.-2010-12-01/build-configuration :portkey.aws.elasticbeanstalk.-2010-12-01/auto-create-application :portkey.aws.elasticbeanstalk.-2010-12-01.create-application-version-message/process]))

(clojure.spec.alpha/def :portkey.aws.elasticbeanstalk.-2010-12-01/describe-environment-managed-actions-result (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.elasticbeanstalk.-2010-12-01/managed-actions]))

(clojure.spec.alpha/def :portkey.aws.elasticbeanstalk.-2010-12-01/platform-arn (clojure.spec.alpha/and clojure.core/string?))

(clojure.spec.alpha/def :portkey.aws.elasticbeanstalk.-2010-12-01/ec-2-instance-id (clojure.spec.alpha/and clojure.core/string?))

(clojure.spec.alpha/def :portkey.aws.elasticbeanstalk.-2010-12-01.tag/key (clojure.spec.alpha/and :portkey.aws.elasticbeanstalk.-2010-12-01/tag-key))
(clojure.spec.alpha/def :portkey.aws.elasticbeanstalk.-2010-12-01.tag/value (clojure.spec.alpha/and :portkey.aws.elasticbeanstalk.-2010-12-01/tag-value))
(clojure.spec.alpha/def :portkey.aws.elasticbeanstalk.-2010-12-01/tag (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.elasticbeanstalk.-2010-12-01.tag/key :portkey.aws.elasticbeanstalk.-2010-12-01.tag/value]))

(clojure.spec.alpha/def :portkey.aws.elasticbeanstalk.-2010-12-01/solution-stack-file-type-list (clojure.spec.alpha/coll-of :portkey.aws.elasticbeanstalk.-2010-12-01/file-type-extension))

(clojure.spec.alpha/def :portkey.aws.elasticbeanstalk.-2010-12-01/platform-version-still-referenced-exception (clojure.spec.alpha/keys :req-un [] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.elasticbeanstalk.-2010-12-01/environment-links (clojure.spec.alpha/coll-of :portkey.aws.elasticbeanstalk.-2010-12-01/environment-link))

(clojure.spec.alpha/def :portkey.aws.elasticbeanstalk.-2010-12-01/compute-type #{"BUILD_GENERAL1_LARGE" "BUILD_GENERAL1_SMALL" :build-general-1-small "BUILD_GENERAL1_MEDIUM" :build-general-1-medium :build-general-1-large})

(clojure.spec.alpha/def :portkey.aws.elasticbeanstalk.-2010-12-01/application-version-proccess clojure.core/boolean?)

(clojure.spec.alpha/def :portkey.aws.elasticbeanstalk.-2010-12-01/list-tags-for-resource-message (clojure.spec.alpha/keys :req-un [:portkey.aws.elasticbeanstalk.-2010-12-01/resource-arn] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.elasticbeanstalk.-2010-12-01/nullable-integer clojure.core/int?)

(clojure.spec.alpha/def :portkey.aws.elasticbeanstalk.-2010-12-01.instance/id (clojure.spec.alpha/and :portkey.aws.elasticbeanstalk.-2010-12-01/resource-id))
(clojure.spec.alpha/def :portkey.aws.elasticbeanstalk.-2010-12-01/instance (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.elasticbeanstalk.-2010-12-01.instance/id]))

(clojure.spec.alpha/def :portkey.aws.elasticbeanstalk.-2010-12-01/configuration-option-descriptions-list (clojure.spec.alpha/coll-of :portkey.aws.elasticbeanstalk.-2010-12-01/configuration-option-description))

(clojure.spec.alpha/def :portkey.aws.elasticbeanstalk.-2010-12-01/event-description-list (clojure.spec.alpha/coll-of :portkey.aws.elasticbeanstalk.-2010-12-01/event-description))

(clojure.spec.alpha/def :portkey.aws.elasticbeanstalk.-2010-12-01/version-labels (clojure.spec.alpha/coll-of :portkey.aws.elasticbeanstalk.-2010-12-01/version-label))

(clojure.spec.alpha/def :portkey.aws.elasticbeanstalk.-2010-12-01/load-average (clojure.spec.alpha/coll-of :portkey.aws.elasticbeanstalk.-2010-12-01/load-average-value))

(clojure.spec.alpha/def :portkey.aws.elasticbeanstalk.-2010-12-01/s-3-location-not-in-service-region-exception (clojure.spec.alpha/keys :req-un [] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.elasticbeanstalk.-2010-12-01/action-type #{"PlatformUpdate" "InstanceRefresh" :unknown "Unknown" :platform-update :instance-refresh})

(clojure.spec.alpha/def :portkey.aws.elasticbeanstalk.-2010-12-01.application-version-description/source-bundle (clojure.spec.alpha/and :portkey.aws.elasticbeanstalk.-2010-12-01/s-3-location))
(clojure.spec.alpha/def :portkey.aws.elasticbeanstalk.-2010-12-01.application-version-description/date-updated (clojure.spec.alpha/and :portkey.aws.elasticbeanstalk.-2010-12-01/update-date))
(clojure.spec.alpha/def :portkey.aws.elasticbeanstalk.-2010-12-01.application-version-description/build-arn (clojure.spec.alpha/and :portkey.aws.elasticbeanstalk.-2010-12-01/string))
(clojure.spec.alpha/def :portkey.aws.elasticbeanstalk.-2010-12-01.application-version-description/status (clojure.spec.alpha/and :portkey.aws.elasticbeanstalk.-2010-12-01/application-version-status))
(clojure.spec.alpha/def :portkey.aws.elasticbeanstalk.-2010-12-01.application-version-description/date-created (clojure.spec.alpha/and :portkey.aws.elasticbeanstalk.-2010-12-01/creation-date))
(clojure.spec.alpha/def :portkey.aws.elasticbeanstalk.-2010-12-01/application-version-description (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.elasticbeanstalk.-2010-12-01/version-label :portkey.aws.elasticbeanstalk.-2010-12-01/application-version-arn :portkey.aws.elasticbeanstalk.-2010-12-01.application-version-description/source-bundle :portkey.aws.elasticbeanstalk.-2010-12-01.application-version-description/date-updated :portkey.aws.elasticbeanstalk.-2010-12-01.application-version-description/build-arn :portkey.aws.elasticbeanstalk.-2010-12-01.application-version-description/status :portkey.aws.elasticbeanstalk.-2010-12-01.application-version-description/date-created :portkey.aws.elasticbeanstalk.-2010-12-01/description :portkey.aws.elasticbeanstalk.-2010-12-01/application-name :portkey.aws.elasticbeanstalk.-2010-12-01/source-build-information]))

(clojure.spec.alpha/def :portkey.aws.elasticbeanstalk.-2010-12-01/application-description-list (clojure.spec.alpha/coll-of :portkey.aws.elasticbeanstalk.-2010-12-01/application-description))

(clojure.spec.alpha/def :portkey.aws.elasticbeanstalk.-2010-12-01/configuration-option-default-value (clojure.spec.alpha/and clojure.core/string?))

(clojure.spec.alpha/def :portkey.aws.elasticbeanstalk.-2010-12-01.configuration-settings-description/date-updated (clojure.spec.alpha/and :portkey.aws.elasticbeanstalk.-2010-12-01/update-date))
(clojure.spec.alpha/def :portkey.aws.elasticbeanstalk.-2010-12-01.configuration-settings-description/option-settings (clojure.spec.alpha/and :portkey.aws.elasticbeanstalk.-2010-12-01/configuration-option-settings-list))
(clojure.spec.alpha/def :portkey.aws.elasticbeanstalk.-2010-12-01.configuration-settings-description/date-created (clojure.spec.alpha/and :portkey.aws.elasticbeanstalk.-2010-12-01/creation-date))
(clojure.spec.alpha/def :portkey.aws.elasticbeanstalk.-2010-12-01.configuration-settings-description/template-name (clojure.spec.alpha/and :portkey.aws.elasticbeanstalk.-2010-12-01/configuration-template-name))
(clojure.spec.alpha/def :portkey.aws.elasticbeanstalk.-2010-12-01.configuration-settings-description/deployment-status (clojure.spec.alpha/and :portkey.aws.elasticbeanstalk.-2010-12-01/configuration-deployment-status))
(clojure.spec.alpha/def :portkey.aws.elasticbeanstalk.-2010-12-01/configuration-settings-description (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.elasticbeanstalk.-2010-12-01/solution-stack-name :portkey.aws.elasticbeanstalk.-2010-12-01.configuration-settings-description/date-updated :portkey.aws.elasticbeanstalk.-2010-12-01/environment-name :portkey.aws.elasticbeanstalk.-2010-12-01.configuration-settings-description/option-settings :portkey.aws.elasticbeanstalk.-2010-12-01.configuration-settings-description/date-created :portkey.aws.elasticbeanstalk.-2010-12-01/description :portkey.aws.elasticbeanstalk.-2010-12-01/application-name :portkey.aws.elasticbeanstalk.-2010-12-01.configuration-settings-description/template-name :portkey.aws.elasticbeanstalk.-2010-12-01.configuration-settings-description/deployment-status :portkey.aws.elasticbeanstalk.-2010-12-01/platform-arn]))

(clojure.spec.alpha/def :portkey.aws.elasticbeanstalk.-2010-12-01/configuration-deployment-status #{"failed" :pending :deployed "pending" "deployed" :failed})

(clojure.spec.alpha/def :portkey.aws.elasticbeanstalk.-2010-12-01.environment-resources-description/load-balancer (clojure.spec.alpha/and :portkey.aws.elasticbeanstalk.-2010-12-01/load-balancer-description))
(clojure.spec.alpha/def :portkey.aws.elasticbeanstalk.-2010-12-01/environment-resources-description (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.elasticbeanstalk.-2010-12-01.environment-resources-description/load-balancer]))

(clojure.spec.alpha/def :portkey.aws.elasticbeanstalk.-2010-12-01.application-description/date-created (clojure.spec.alpha/and :portkey.aws.elasticbeanstalk.-2010-12-01/creation-date))
(clojure.spec.alpha/def :portkey.aws.elasticbeanstalk.-2010-12-01.application-description/date-updated (clojure.spec.alpha/and :portkey.aws.elasticbeanstalk.-2010-12-01/update-date))
(clojure.spec.alpha/def :portkey.aws.elasticbeanstalk.-2010-12-01.application-description/versions (clojure.spec.alpha/and :portkey.aws.elasticbeanstalk.-2010-12-01/version-labels-list))
(clojure.spec.alpha/def :portkey.aws.elasticbeanstalk.-2010-12-01.application-description/configuration-templates (clojure.spec.alpha/and :portkey.aws.elasticbeanstalk.-2010-12-01/configuration-template-names-list))
(clojure.spec.alpha/def :portkey.aws.elasticbeanstalk.-2010-12-01.application-description/resource-lifecycle-config (clojure.spec.alpha/and :portkey.aws.elasticbeanstalk.-2010-12-01/application-resource-lifecycle-config))
(clojure.spec.alpha/def :portkey.aws.elasticbeanstalk.-2010-12-01/application-description (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.elasticbeanstalk.-2010-12-01/application-arn :portkey.aws.elasticbeanstalk.-2010-12-01/application-name :portkey.aws.elasticbeanstalk.-2010-12-01/description :portkey.aws.elasticbeanstalk.-2010-12-01.application-description/date-created :portkey.aws.elasticbeanstalk.-2010-12-01.application-description/date-updated :portkey.aws.elasticbeanstalk.-2010-12-01.application-description/versions :portkey.aws.elasticbeanstalk.-2010-12-01.application-description/configuration-templates :portkey.aws.elasticbeanstalk.-2010-12-01.application-description/resource-lifecycle-config]))

(clojure.spec.alpha/def :portkey.aws.elasticbeanstalk.-2010-12-01/environment-id (clojure.spec.alpha/and clojure.core/string?))

(clojure.spec.alpha/def :portkey.aws.elasticbeanstalk.-2010-12-01/source-build-information (clojure.spec.alpha/keys :req-un [:portkey.aws.elasticbeanstalk.-2010-12-01/source-type :portkey.aws.elasticbeanstalk.-2010-12-01/source-repository :portkey.aws.elasticbeanstalk.-2010-12-01/source-location] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.elasticbeanstalk.-2010-12-01/nullable-double clojure.core/double?)

(clojure.spec.alpha/def :portkey.aws.elasticbeanstalk.-2010-12-01.environment-description/tier (clojure.spec.alpha/and :portkey.aws.elasticbeanstalk.-2010-12-01/environment-tier))
(clojure.spec.alpha/def :portkey.aws.elasticbeanstalk.-2010-12-01.environment-description/health (clojure.spec.alpha/and :portkey.aws.elasticbeanstalk.-2010-12-01/environment-health))
(clojure.spec.alpha/def :portkey.aws.elasticbeanstalk.-2010-12-01.environment-description/cname (clojure.spec.alpha/and :portkey.aws.elasticbeanstalk.-2010-12-01/dns-cname))
(clojure.spec.alpha/def :portkey.aws.elasticbeanstalk.-2010-12-01.environment-description/date-updated (clojure.spec.alpha/and :portkey.aws.elasticbeanstalk.-2010-12-01/update-date))
(clojure.spec.alpha/def :portkey.aws.elasticbeanstalk.-2010-12-01.environment-description/health-status (clojure.spec.alpha/and :portkey.aws.elasticbeanstalk.-2010-12-01/environment-health-status))
(clojure.spec.alpha/def :portkey.aws.elasticbeanstalk.-2010-12-01.environment-description/status (clojure.spec.alpha/and :portkey.aws.elasticbeanstalk.-2010-12-01/environment-status))
(clojure.spec.alpha/def :portkey.aws.elasticbeanstalk.-2010-12-01.environment-description/date-created (clojure.spec.alpha/and :portkey.aws.elasticbeanstalk.-2010-12-01/creation-date))
(clojure.spec.alpha/def :portkey.aws.elasticbeanstalk.-2010-12-01.environment-description/resources (clojure.spec.alpha/and :portkey.aws.elasticbeanstalk.-2010-12-01/environment-resources-description))
(clojure.spec.alpha/def :portkey.aws.elasticbeanstalk.-2010-12-01.environment-description/template-name (clojure.spec.alpha/and :portkey.aws.elasticbeanstalk.-2010-12-01/configuration-template-name))
(clojure.spec.alpha/def :portkey.aws.elasticbeanstalk.-2010-12-01/environment-description (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.elasticbeanstalk.-2010-12-01/version-label :portkey.aws.elasticbeanstalk.-2010-12-01.environment-description/tier :portkey.aws.elasticbeanstalk.-2010-12-01.environment-description/health :portkey.aws.elasticbeanstalk.-2010-12-01/solution-stack-name :portkey.aws.elasticbeanstalk.-2010-12-01.environment-description/cname :portkey.aws.elasticbeanstalk.-2010-12-01.environment-description/date-updated :portkey.aws.elasticbeanstalk.-2010-12-01/environment-name :portkey.aws.elasticbeanstalk.-2010-12-01.environment-description/health-status :portkey.aws.elasticbeanstalk.-2010-12-01.environment-description/status :portkey.aws.elasticbeanstalk.-2010-12-01/environment-arn :portkey.aws.elasticbeanstalk.-2010-12-01/abortable-operation-in-progress :portkey.aws.elasticbeanstalk.-2010-12-01.environment-description/date-created :portkey.aws.elasticbeanstalk.-2010-12-01/description :portkey.aws.elasticbeanstalk.-2010-12-01/endpoint-url :portkey.aws.elasticbeanstalk.-2010-12-01.environment-description/resources :portkey.aws.elasticbeanstalk.-2010-12-01/application-name :portkey.aws.elasticbeanstalk.-2010-12-01.environment-description/template-name :portkey.aws.elasticbeanstalk.-2010-12-01/platform-arn :portkey.aws.elasticbeanstalk.-2010-12-01/environment-links :portkey.aws.elasticbeanstalk.-2010-12-01/environment-id]))

(clojure.spec.alpha/def :portkey.aws.elasticbeanstalk.-2010-12-01/configuration-template-name (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__27880__auto__] (clojure.core/<= 1 (clojure.core/count s__27880__auto__))) (clojure.core/fn [s__27881__auto__] (clojure.core/< (clojure.core/count s__27881__auto__) 100))))

(clojure.spec.alpha/def :portkey.aws.elasticbeanstalk.-2010-12-01/force-terminate clojure.core/boolean?)

(clojure.spec.alpha/def :portkey.aws.elasticbeanstalk.-2010-12-01/delete-platform-version-result (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.elasticbeanstalk.-2010-12-01/platform-summary]))

(clojure.spec.alpha/def :portkey.aws.elasticbeanstalk.-2010-12-01/load-balancer-listeners-description (clojure.spec.alpha/coll-of :portkey.aws.elasticbeanstalk.-2010-12-01/listener))

(clojure.spec.alpha/def :portkey.aws.elasticbeanstalk.-2010-12-01/resource-type-not-supported-exception (clojure.spec.alpha/keys :req-un [] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.elasticbeanstalk.-2010-12-01/abort-environment-update-message (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.elasticbeanstalk.-2010-12-01/environment-id :portkey.aws.elasticbeanstalk.-2010-12-01/environment-name]))

(clojure.spec.alpha/def :portkey.aws.elasticbeanstalk.-2010-12-01.create-platform-version-request/platform-definition-bundle (clojure.spec.alpha/and :portkey.aws.elasticbeanstalk.-2010-12-01/s-3-location))
(clojure.spec.alpha/def :portkey.aws.elasticbeanstalk.-2010-12-01.create-platform-version-request/option-settings (clojure.spec.alpha/and :portkey.aws.elasticbeanstalk.-2010-12-01/configuration-option-settings-list))
(clojure.spec.alpha/def :portkey.aws.elasticbeanstalk.-2010-12-01/create-platform-version-request (clojure.spec.alpha/keys :req-un [:portkey.aws.elasticbeanstalk.-2010-12-01/platform-name :portkey.aws.elasticbeanstalk.-2010-12-01/platform-version :portkey.aws.elasticbeanstalk.-2010-12-01.create-platform-version-request/platform-definition-bundle] :opt-un [:portkey.aws.elasticbeanstalk.-2010-12-01/environment-name :portkey.aws.elasticbeanstalk.-2010-12-01.create-platform-version-request/option-settings]))

(clojure.spec.alpha/def :portkey.aws.elasticbeanstalk.-2010-12-01/available-solution-stack-names-list (clojure.spec.alpha/coll-of :portkey.aws.elasticbeanstalk.-2010-12-01/solution-stack-name))

(clojure.spec.alpha/def :portkey.aws.elasticbeanstalk.-2010-12-01/token (clojure.spec.alpha/and clojure.core/string?))

(clojure.spec.alpha/def :portkey.aws.elasticbeanstalk.-2010-12-01/configuration-option-value (clojure.spec.alpha/and clojure.core/string?))

(clojure.spec.alpha/def :portkey.aws.elasticbeanstalk.-2010-12-01.platform-programming-language/name (clojure.spec.alpha/and :portkey.aws.elasticbeanstalk.-2010-12-01/string))
(clojure.spec.alpha/def :portkey.aws.elasticbeanstalk.-2010-12-01.platform-programming-language/version (clojure.spec.alpha/and :portkey.aws.elasticbeanstalk.-2010-12-01/string))
(clojure.spec.alpha/def :portkey.aws.elasticbeanstalk.-2010-12-01/platform-programming-language (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.elasticbeanstalk.-2010-12-01.platform-programming-language/name :portkey.aws.elasticbeanstalk.-2010-12-01.platform-programming-language/version]))

(clojure.spec.alpha/def :portkey.aws.elasticbeanstalk.-2010-12-01/restart-app-server-message (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.elasticbeanstalk.-2010-12-01/environment-id :portkey.aws.elasticbeanstalk.-2010-12-01/environment-name]))

(clojure.spec.alpha/def :portkey.aws.elasticbeanstalk.-2010-12-01/custom-ami-list (clojure.spec.alpha/coll-of :portkey.aws.elasticbeanstalk.-2010-12-01/custom-ami))

(clojure.spec.alpha/def :portkey.aws.elasticbeanstalk.-2010-12-01/queue-list (clojure.spec.alpha/coll-of :portkey.aws.elasticbeanstalk.-2010-12-01/queue))

(clojure.spec.alpha/def :portkey.aws.elasticbeanstalk.-2010-12-01/environment-health #{:yellow "Green" :green "Red" :red "Grey" :grey "Yellow"})

(clojure.spec.alpha/def :portkey.aws.elasticbeanstalk.-2010-12-01.environment-info-description/info-type (clojure.spec.alpha/and :portkey.aws.elasticbeanstalk.-2010-12-01/environment-info-type))
(clojure.spec.alpha/def :portkey.aws.elasticbeanstalk.-2010-12-01/environment-info-description (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.elasticbeanstalk.-2010-12-01.environment-info-description/info-type :portkey.aws.elasticbeanstalk.-2010-12-01/ec-2-instance-id :portkey.aws.elasticbeanstalk.-2010-12-01/sample-timestamp :portkey.aws.elasticbeanstalk.-2010-12-01/message]))

(clojure.spec.alpha/def :portkey.aws.elasticbeanstalk.-2010-12-01.list-platform-versions-request/filters (clojure.spec.alpha/and :portkey.aws.elasticbeanstalk.-2010-12-01/platform-filters))
(clojure.spec.alpha/def :portkey.aws.elasticbeanstalk.-2010-12-01.list-platform-versions-request/max-records (clojure.spec.alpha/and :portkey.aws.elasticbeanstalk.-2010-12-01/platform-max-records))
(clojure.spec.alpha/def :portkey.aws.elasticbeanstalk.-2010-12-01.list-platform-versions-request/next-token (clojure.spec.alpha/and :portkey.aws.elasticbeanstalk.-2010-12-01/token))
(clojure.spec.alpha/def :portkey.aws.elasticbeanstalk.-2010-12-01/list-platform-versions-request (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.elasticbeanstalk.-2010-12-01.list-platform-versions-request/filters :portkey.aws.elasticbeanstalk.-2010-12-01.list-platform-versions-request/max-records :portkey.aws.elasticbeanstalk.-2010-12-01.list-platform-versions-request/next-token]))

(clojure.spec.alpha/def :portkey.aws.elasticbeanstalk.-2010-12-01.list-platform-versions-result/next-token (clojure.spec.alpha/and :portkey.aws.elasticbeanstalk.-2010-12-01/token))
(clojure.spec.alpha/def :portkey.aws.elasticbeanstalk.-2010-12-01/list-platform-versions-result (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.elasticbeanstalk.-2010-12-01/platform-summary-list :portkey.aws.elasticbeanstalk.-2010-12-01.list-platform-versions-result/next-token]))

(clojure.spec.alpha/def :portkey.aws.elasticbeanstalk.-2010-12-01.trigger/name (clojure.spec.alpha/and :portkey.aws.elasticbeanstalk.-2010-12-01/resource-id))
(clojure.spec.alpha/def :portkey.aws.elasticbeanstalk.-2010-12-01/trigger (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.elasticbeanstalk.-2010-12-01.trigger/name]))

(clojure.spec.alpha/def :portkey.aws.elasticbeanstalk.-2010-12-01/too-many-configuration-templates-exception (clojure.spec.alpha/keys :req-un [] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.elasticbeanstalk.-2010-12-01.source-configuration/template-name (clojure.spec.alpha/and :portkey.aws.elasticbeanstalk.-2010-12-01/configuration-template-name))
(clojure.spec.alpha/def :portkey.aws.elasticbeanstalk.-2010-12-01/source-configuration (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.elasticbeanstalk.-2010-12-01/application-name :portkey.aws.elasticbeanstalk.-2010-12-01.source-configuration/template-name]))

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
(clojure.spec.alpha/def :portkey.aws.elasticbeanstalk.-2010-12-01/configuration-option-description (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.elasticbeanstalk.-2010-12-01.configuration-option-description/user-defined :portkey.aws.elasticbeanstalk.-2010-12-01.configuration-option-description/min-value :portkey.aws.elasticbeanstalk.-2010-12-01.configuration-option-description/max-value :portkey.aws.elasticbeanstalk.-2010-12-01.configuration-option-description/change-severity :portkey.aws.elasticbeanstalk.-2010-12-01.configuration-option-description/max-length :portkey.aws.elasticbeanstalk.-2010-12-01.configuration-option-description/namespace :portkey.aws.elasticbeanstalk.-2010-12-01.configuration-option-description/value-type :portkey.aws.elasticbeanstalk.-2010-12-01.configuration-option-description/regex :portkey.aws.elasticbeanstalk.-2010-12-01.configuration-option-description/value-options :portkey.aws.elasticbeanstalk.-2010-12-01.configuration-option-description/default-value :portkey.aws.elasticbeanstalk.-2010-12-01.configuration-option-description/name]))

(clojure.spec.alpha/def :portkey.aws.elasticbeanstalk.-2010-12-01.resource-tags-description-message/resource-tags (clojure.spec.alpha/and :portkey.aws.elasticbeanstalk.-2010-12-01/tag-list))
(clojure.spec.alpha/def :portkey.aws.elasticbeanstalk.-2010-12-01/resource-tags-description-message (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.elasticbeanstalk.-2010-12-01/resource-arn :portkey.aws.elasticbeanstalk.-2010-12-01.resource-tags-description-message/resource-tags]))

(clojure.spec.alpha/def :portkey.aws.elasticbeanstalk.-2010-12-01/create-storage-location-result-message (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.elasticbeanstalk.-2010-12-01/s-3-bucket]))

(clojure.spec.alpha/def :portkey.aws.elasticbeanstalk.-2010-12-01.describe-configuration-settings-message/template-name (clojure.spec.alpha/and :portkey.aws.elasticbeanstalk.-2010-12-01/configuration-template-name))
(clojure.spec.alpha/def :portkey.aws.elasticbeanstalk.-2010-12-01/describe-configuration-settings-message (clojure.spec.alpha/keys :req-un [:portkey.aws.elasticbeanstalk.-2010-12-01/application-name] :opt-un [:portkey.aws.elasticbeanstalk.-2010-12-01.describe-configuration-settings-message/template-name :portkey.aws.elasticbeanstalk.-2010-12-01/environment-name]))

(clojure.spec.alpha/def :portkey.aws.elasticbeanstalk.-2010-12-01.configuration-settings-descriptions/configuration-settings (clojure.spec.alpha/and :portkey.aws.elasticbeanstalk.-2010-12-01/configuration-settings-description-list))
(clojure.spec.alpha/def :portkey.aws.elasticbeanstalk.-2010-12-01/configuration-settings-descriptions (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.elasticbeanstalk.-2010-12-01.configuration-settings-descriptions/configuration-settings]))

(clojure.spec.alpha/def :portkey.aws.elasticbeanstalk.-2010-12-01/system-status (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.elasticbeanstalk.-2010-12-01/cpu-utilization :portkey.aws.elasticbeanstalk.-2010-12-01/load-average]))

(clojure.core/defn create-application-version ([create-application-version-messageinput] (clojure.core/let [request-function-result__28521__auto__ (req-create-application-version-message create-application-version-messageinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__28521__auto__ {:http.request.configuration/endpoints portkey.aws.elasticbeanstalk.-2010-12-01/endpoints, :http.request.configuration/target-prefix nil, :http.request.spec/output-spec :portkey.aws.elasticbeanstalk.-2010-12-01/application-version-description-message, :http.request.configuration/mime-type {"content-type" "application/x-www-form-urlencoded; charset=utf-8"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2010-12-01", :http.request.configuration/service-id "Elastic Beanstalk", :http.request.spec/input-spec :portkey.aws.elasticbeanstalk.-2010-12-01/create-application-version-message, :http.request.configuration/protocol "query", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/action "CreateApplicationVersion", :http.request.spec/error-spec {"TooManyApplicationsException" :portkey.aws.elasticbeanstalk.-2010-12-01/too-many-applications-exception, "TooManyApplicationVersionsException" :portkey.aws.elasticbeanstalk.-2010-12-01/too-many-application-versions-exception, "InsufficientPrivilegesException" :portkey.aws.elasticbeanstalk.-2010-12-01/insufficient-privileges-exception, "S3LocationNotInServiceRegionException" :portkey.aws.elasticbeanstalk.-2010-12-01/s-3-location-not-in-service-region-exception, "CodeBuildNotInServiceRegionException" :portkey.aws.elasticbeanstalk.-2010-12-01/code-build-not-in-service-region-exception}})))))
(clojure.spec.alpha/fdef create-application-version :args (clojure.spec.alpha/tuple :portkey.aws.elasticbeanstalk.-2010-12-01/create-application-version-message) :ret (clojure.spec.alpha/and :portkey.aws.elasticbeanstalk.-2010-12-01/application-version-description-message))

(clojure.core/defn update-environment ([] (update-environment {})) ([update-environment-messageinput] (clojure.core/let [request-function-result__28521__auto__ (req-update-environment-message update-environment-messageinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__28521__auto__ {:http.request.configuration/endpoints portkey.aws.elasticbeanstalk.-2010-12-01/endpoints, :http.request.configuration/target-prefix nil, :http.request.spec/output-spec :portkey.aws.elasticbeanstalk.-2010-12-01/environment-description, :http.request.configuration/mime-type {"content-type" "application/x-www-form-urlencoded; charset=utf-8"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2010-12-01", :http.request.configuration/service-id "Elastic Beanstalk", :http.request.spec/input-spec :portkey.aws.elasticbeanstalk.-2010-12-01/update-environment-message, :http.request.configuration/protocol "query", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/action "UpdateEnvironment", :http.request.spec/error-spec {"InsufficientPrivilegesException" :portkey.aws.elasticbeanstalk.-2010-12-01/insufficient-privileges-exception, "TooManyBucketsException" :portkey.aws.elasticbeanstalk.-2010-12-01/too-many-buckets-exception}})))))
(clojure.spec.alpha/fdef update-environment :args (clojure.spec.alpha/? :portkey.aws.elasticbeanstalk.-2010-12-01/update-environment-message) :ret (clojure.spec.alpha/and :portkey.aws.elasticbeanstalk.-2010-12-01/environment-description))

(clojure.core/defn update-tags-for-resource ([update-tags-for-resource-messageinput] (clojure.core/let [request-function-result__28521__auto__ (req-update-tags-for-resource-message update-tags-for-resource-messageinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__28521__auto__ {:http.request.configuration/endpoints portkey.aws.elasticbeanstalk.-2010-12-01/endpoints, :http.request.configuration/target-prefix nil, :http.request.spec/output-spec nil, :http.request.configuration/mime-type {"content-type" "application/x-www-form-urlencoded; charset=utf-8"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2010-12-01", :http.request.configuration/service-id "Elastic Beanstalk", :http.request.spec/input-spec :portkey.aws.elasticbeanstalk.-2010-12-01/update-tags-for-resource-message, :http.request.configuration/protocol "query", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/action "UpdateTagsForResource", :http.request.spec/error-spec {"InsufficientPrivilegesException" :portkey.aws.elasticbeanstalk.-2010-12-01/insufficient-privileges-exception, "OperationInProgressException" :portkey.aws.elasticbeanstalk.-2010-12-01/operation-in-progress-exception, "TooManyTagsException" :portkey.aws.elasticbeanstalk.-2010-12-01/too-many-tags-exception, "ResourceNotFoundException" :portkey.aws.elasticbeanstalk.-2010-12-01/resource-not-found-exception, "ResourceTypeNotSupportedException" :portkey.aws.elasticbeanstalk.-2010-12-01/resource-type-not-supported-exception}})))))
(clojure.spec.alpha/fdef update-tags-for-resource :args (clojure.spec.alpha/tuple :portkey.aws.elasticbeanstalk.-2010-12-01/update-tags-for-resource-message) :ret clojure.core/true?)

(clojure.core/defn describe-platform-version ([] (describe-platform-version {})) ([describe-platform-version-requestinput] (clojure.core/let [request-function-result__28521__auto__ (req-describe-platform-version-request describe-platform-version-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__28521__auto__ {:http.request.configuration/endpoints portkey.aws.elasticbeanstalk.-2010-12-01/endpoints, :http.request.configuration/target-prefix nil, :http.request.spec/output-spec :portkey.aws.elasticbeanstalk.-2010-12-01/describe-platform-version-result, :http.request.configuration/mime-type {"content-type" "application/x-www-form-urlencoded; charset=utf-8"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2010-12-01", :http.request.configuration/service-id "Elastic Beanstalk", :http.request.spec/input-spec :portkey.aws.elasticbeanstalk.-2010-12-01/describe-platform-version-request, :http.request.configuration/protocol "query", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/action "DescribePlatformVersion", :http.request.spec/error-spec {"InsufficientPrivilegesException" :portkey.aws.elasticbeanstalk.-2010-12-01/insufficient-privileges-exception, "ElasticBeanstalkServiceException" :portkey.aws.elasticbeanstalk.-2010-12-01/elastic-beanstalk-service-exception}})))))
(clojure.spec.alpha/fdef describe-platform-version :args (clojure.spec.alpha/? :portkey.aws.elasticbeanstalk.-2010-12-01/describe-platform-version-request) :ret (clojure.spec.alpha/and :portkey.aws.elasticbeanstalk.-2010-12-01/describe-platform-version-result))

(clojure.core/defn create-platform-version ([create-platform-version-requestinput] (clojure.core/let [request-function-result__28521__auto__ (req-create-platform-version-request create-platform-version-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__28521__auto__ {:http.request.configuration/endpoints portkey.aws.elasticbeanstalk.-2010-12-01/endpoints, :http.request.configuration/target-prefix nil, :http.request.spec/output-spec :portkey.aws.elasticbeanstalk.-2010-12-01/create-platform-version-result, :http.request.configuration/mime-type {"content-type" "application/x-www-form-urlencoded; charset=utf-8"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2010-12-01", :http.request.configuration/service-id "Elastic Beanstalk", :http.request.spec/input-spec :portkey.aws.elasticbeanstalk.-2010-12-01/create-platform-version-request, :http.request.configuration/protocol "query", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/action "CreatePlatformVersion", :http.request.spec/error-spec {"InsufficientPrivilegesException" :portkey.aws.elasticbeanstalk.-2010-12-01/insufficient-privileges-exception, "ElasticBeanstalkServiceException" :portkey.aws.elasticbeanstalk.-2010-12-01/elastic-beanstalk-service-exception, "TooManyPlatformsException" :portkey.aws.elasticbeanstalk.-2010-12-01/too-many-platforms-exception}})))))
(clojure.spec.alpha/fdef create-platform-version :args (clojure.spec.alpha/tuple :portkey.aws.elasticbeanstalk.-2010-12-01/create-platform-version-request) :ret (clojure.spec.alpha/and :portkey.aws.elasticbeanstalk.-2010-12-01/create-platform-version-result))

(clojure.core/defn create-environment ([create-environment-messageinput] (clojure.core/let [request-function-result__28521__auto__ (req-create-environment-message create-environment-messageinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__28521__auto__ {:http.request.configuration/endpoints portkey.aws.elasticbeanstalk.-2010-12-01/endpoints, :http.request.configuration/target-prefix nil, :http.request.spec/output-spec :portkey.aws.elasticbeanstalk.-2010-12-01/environment-description, :http.request.configuration/mime-type {"content-type" "application/x-www-form-urlencoded; charset=utf-8"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2010-12-01", :http.request.configuration/service-id "Elastic Beanstalk", :http.request.spec/input-spec :portkey.aws.elasticbeanstalk.-2010-12-01/create-environment-message, :http.request.configuration/protocol "query", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/action "CreateEnvironment", :http.request.spec/error-spec {"TooManyEnvironmentsException" :portkey.aws.elasticbeanstalk.-2010-12-01/too-many-environments-exception, "InsufficientPrivilegesException" :portkey.aws.elasticbeanstalk.-2010-12-01/insufficient-privileges-exception}})))))
(clojure.spec.alpha/fdef create-environment :args (clojure.spec.alpha/tuple :portkey.aws.elasticbeanstalk.-2010-12-01/create-environment-message) :ret (clojure.spec.alpha/and :portkey.aws.elasticbeanstalk.-2010-12-01/environment-description))

(clojure.core/defn describe-environment-managed-actions ([] (describe-environment-managed-actions {})) ([describe-environment-managed-actions-requestinput] (clojure.core/let [request-function-result__28521__auto__ (req-describe-environment-managed-actions-request describe-environment-managed-actions-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__28521__auto__ {:http.request.configuration/endpoints portkey.aws.elasticbeanstalk.-2010-12-01/endpoints, :http.request.configuration/target-prefix nil, :http.request.spec/output-spec :portkey.aws.elasticbeanstalk.-2010-12-01/describe-environment-managed-actions-result, :http.request.configuration/mime-type {"content-type" "application/x-www-form-urlencoded; charset=utf-8"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2010-12-01", :http.request.configuration/service-id "Elastic Beanstalk", :http.request.spec/input-spec :portkey.aws.elasticbeanstalk.-2010-12-01/describe-environment-managed-actions-request, :http.request.configuration/protocol "query", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/action "DescribeEnvironmentManagedActions", :http.request.spec/error-spec {"ElasticBeanstalkServiceException" :portkey.aws.elasticbeanstalk.-2010-12-01/elastic-beanstalk-service-exception}})))))
(clojure.spec.alpha/fdef describe-environment-managed-actions :args (clojure.spec.alpha/? :portkey.aws.elasticbeanstalk.-2010-12-01/describe-environment-managed-actions-request) :ret (clojure.spec.alpha/and :portkey.aws.elasticbeanstalk.-2010-12-01/describe-environment-managed-actions-result))

(clojure.core/defn delete-application ([delete-application-messageinput] (clojure.core/let [request-function-result__28521__auto__ (req-delete-application-message delete-application-messageinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__28521__auto__ {:http.request.configuration/endpoints portkey.aws.elasticbeanstalk.-2010-12-01/endpoints, :http.request.configuration/target-prefix nil, :http.request.spec/output-spec nil, :http.request.configuration/mime-type {"content-type" "application/x-www-form-urlencoded; charset=utf-8"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2010-12-01", :http.request.configuration/service-id "Elastic Beanstalk", :http.request.spec/input-spec :portkey.aws.elasticbeanstalk.-2010-12-01/delete-application-message, :http.request.configuration/protocol "query", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/action "DeleteApplication", :http.request.spec/error-spec {"OperationInProgressException" :portkey.aws.elasticbeanstalk.-2010-12-01/operation-in-progress-exception}})))))
(clojure.spec.alpha/fdef delete-application :args (clojure.spec.alpha/tuple :portkey.aws.elasticbeanstalk.-2010-12-01/delete-application-message) :ret clojure.core/true?)

(clojure.core/defn describe-instances-health ([] (describe-instances-health {})) ([describe-instances-health-requestinput] (clojure.core/let [request-function-result__28521__auto__ (req-describe-instances-health-request describe-instances-health-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__28521__auto__ {:http.request.configuration/endpoints portkey.aws.elasticbeanstalk.-2010-12-01/endpoints, :http.request.configuration/target-prefix nil, :http.request.spec/output-spec :portkey.aws.elasticbeanstalk.-2010-12-01/describe-instances-health-result, :http.request.configuration/mime-type {"content-type" "application/x-www-form-urlencoded; charset=utf-8"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2010-12-01", :http.request.configuration/service-id "Elastic Beanstalk", :http.request.spec/input-spec :portkey.aws.elasticbeanstalk.-2010-12-01/describe-instances-health-request, :http.request.configuration/protocol "query", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/action "DescribeInstancesHealth", :http.request.spec/error-spec {"InvalidRequestException" :portkey.aws.elasticbeanstalk.-2010-12-01/invalid-request-exception, "ElasticBeanstalkServiceException" :portkey.aws.elasticbeanstalk.-2010-12-01/elastic-beanstalk-service-exception}})))))
(clojure.spec.alpha/fdef describe-instances-health :args (clojure.spec.alpha/? :portkey.aws.elasticbeanstalk.-2010-12-01/describe-instances-health-request) :ret (clojure.spec.alpha/and :portkey.aws.elasticbeanstalk.-2010-12-01/describe-instances-health-result))

(clojure.core/defn describe-configuration-options ([] (describe-configuration-options {})) ([describe-configuration-options-messageinput] (clojure.core/let [request-function-result__28521__auto__ (req-describe-configuration-options-message describe-configuration-options-messageinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__28521__auto__ {:http.request.configuration/endpoints portkey.aws.elasticbeanstalk.-2010-12-01/endpoints, :http.request.configuration/target-prefix nil, :http.request.spec/output-spec :portkey.aws.elasticbeanstalk.-2010-12-01/configuration-options-description, :http.request.configuration/mime-type {"content-type" "application/x-www-form-urlencoded; charset=utf-8"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2010-12-01", :http.request.configuration/service-id "Elastic Beanstalk", :http.request.spec/input-spec :portkey.aws.elasticbeanstalk.-2010-12-01/describe-configuration-options-message, :http.request.configuration/protocol "query", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/action "DescribeConfigurationOptions", :http.request.spec/error-spec {"TooManyBucketsException" :portkey.aws.elasticbeanstalk.-2010-12-01/too-many-buckets-exception}})))))
(clojure.spec.alpha/fdef describe-configuration-options :args (clojure.spec.alpha/? :portkey.aws.elasticbeanstalk.-2010-12-01/describe-configuration-options-message) :ret (clojure.spec.alpha/and :portkey.aws.elasticbeanstalk.-2010-12-01/configuration-options-description))

(clojure.core/defn compose-environments ([] (compose-environments {})) ([compose-environments-messageinput] (clojure.core/let [request-function-result__28521__auto__ (req-compose-environments-message compose-environments-messageinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__28521__auto__ {:http.request.configuration/endpoints portkey.aws.elasticbeanstalk.-2010-12-01/endpoints, :http.request.configuration/target-prefix nil, :http.request.spec/output-spec :portkey.aws.elasticbeanstalk.-2010-12-01/environment-descriptions-message, :http.request.configuration/mime-type {"content-type" "application/x-www-form-urlencoded; charset=utf-8"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2010-12-01", :http.request.configuration/service-id "Elastic Beanstalk", :http.request.spec/input-spec :portkey.aws.elasticbeanstalk.-2010-12-01/compose-environments-message, :http.request.configuration/protocol "query", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/action "ComposeEnvironments", :http.request.spec/error-spec {"TooManyEnvironmentsException" :portkey.aws.elasticbeanstalk.-2010-12-01/too-many-environments-exception, "InsufficientPrivilegesException" :portkey.aws.elasticbeanstalk.-2010-12-01/insufficient-privileges-exception}})))))
(clojure.spec.alpha/fdef compose-environments :args (clojure.spec.alpha/? :portkey.aws.elasticbeanstalk.-2010-12-01/compose-environments-message) :ret (clojure.spec.alpha/and :portkey.aws.elasticbeanstalk.-2010-12-01/environment-descriptions-message))

(clojure.core/defn describe-events ([] (describe-events {})) ([describe-events-messageinput] (clojure.core/let [request-function-result__28521__auto__ (req-describe-events-message describe-events-messageinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__28521__auto__ {:http.request.configuration/endpoints portkey.aws.elasticbeanstalk.-2010-12-01/endpoints, :http.request.configuration/target-prefix nil, :http.request.spec/output-spec :portkey.aws.elasticbeanstalk.-2010-12-01/event-descriptions-message, :http.request.configuration/mime-type {"content-type" "application/x-www-form-urlencoded; charset=utf-8"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2010-12-01", :http.request.configuration/service-id "Elastic Beanstalk", :http.request.spec/input-spec :portkey.aws.elasticbeanstalk.-2010-12-01/describe-events-message, :http.request.configuration/protocol "query", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/action "DescribeEvents", :http.request.spec/error-spec {}})))))
(clojure.spec.alpha/fdef describe-events :args (clojure.spec.alpha/? :portkey.aws.elasticbeanstalk.-2010-12-01/describe-events-message) :ret (clojure.spec.alpha/and :portkey.aws.elasticbeanstalk.-2010-12-01/event-descriptions-message))

(clojure.core/defn describe-environment-resources ([] (describe-environment-resources {})) ([describe-environment-resources-messageinput] (clojure.core/let [request-function-result__28521__auto__ (req-describe-environment-resources-message describe-environment-resources-messageinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__28521__auto__ {:http.request.configuration/endpoints portkey.aws.elasticbeanstalk.-2010-12-01/endpoints, :http.request.configuration/target-prefix nil, :http.request.spec/output-spec :portkey.aws.elasticbeanstalk.-2010-12-01/environment-resource-descriptions-message, :http.request.configuration/mime-type {"content-type" "application/x-www-form-urlencoded; charset=utf-8"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2010-12-01", :http.request.configuration/service-id "Elastic Beanstalk", :http.request.spec/input-spec :portkey.aws.elasticbeanstalk.-2010-12-01/describe-environment-resources-message, :http.request.configuration/protocol "query", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/action "DescribeEnvironmentResources", :http.request.spec/error-spec {"InsufficientPrivilegesException" :portkey.aws.elasticbeanstalk.-2010-12-01/insufficient-privileges-exception}})))))
(clojure.spec.alpha/fdef describe-environment-resources :args (clojure.spec.alpha/? :portkey.aws.elasticbeanstalk.-2010-12-01/describe-environment-resources-message) :ret (clojure.spec.alpha/and :portkey.aws.elasticbeanstalk.-2010-12-01/environment-resource-descriptions-message))

(clojure.core/defn update-application-resource-lifecycle ([update-application-resource-lifecycle-messageinput] (clojure.core/let [request-function-result__28521__auto__ (req-update-application-resource-lifecycle-message update-application-resource-lifecycle-messageinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__28521__auto__ {:http.request.configuration/endpoints portkey.aws.elasticbeanstalk.-2010-12-01/endpoints, :http.request.configuration/target-prefix nil, :http.request.spec/output-spec :portkey.aws.elasticbeanstalk.-2010-12-01/application-resource-lifecycle-description-message, :http.request.configuration/mime-type {"content-type" "application/x-www-form-urlencoded; charset=utf-8"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2010-12-01", :http.request.configuration/service-id "Elastic Beanstalk", :http.request.spec/input-spec :portkey.aws.elasticbeanstalk.-2010-12-01/update-application-resource-lifecycle-message, :http.request.configuration/protocol "query", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/action "UpdateApplicationResourceLifecycle", :http.request.spec/error-spec {"InsufficientPrivilegesException" :portkey.aws.elasticbeanstalk.-2010-12-01/insufficient-privileges-exception}})))))
(clojure.spec.alpha/fdef update-application-resource-lifecycle :args (clojure.spec.alpha/tuple :portkey.aws.elasticbeanstalk.-2010-12-01/update-application-resource-lifecycle-message) :ret (clojure.spec.alpha/and :portkey.aws.elasticbeanstalk.-2010-12-01/application-resource-lifecycle-description-message))

(clojure.core/defn describe-environment-health ([] (describe-environment-health {})) ([describe-environment-health-requestinput] (clojure.core/let [request-function-result__28521__auto__ (req-describe-environment-health-request describe-environment-health-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__28521__auto__ {:http.request.configuration/endpoints portkey.aws.elasticbeanstalk.-2010-12-01/endpoints, :http.request.configuration/target-prefix nil, :http.request.spec/output-spec :portkey.aws.elasticbeanstalk.-2010-12-01/describe-environment-health-result, :http.request.configuration/mime-type {"content-type" "application/x-www-form-urlencoded; charset=utf-8"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2010-12-01", :http.request.configuration/service-id "Elastic Beanstalk", :http.request.spec/input-spec :portkey.aws.elasticbeanstalk.-2010-12-01/describe-environment-health-request, :http.request.configuration/protocol "query", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/action "DescribeEnvironmentHealth", :http.request.spec/error-spec {"InvalidRequestException" :portkey.aws.elasticbeanstalk.-2010-12-01/invalid-request-exception, "ElasticBeanstalkServiceException" :portkey.aws.elasticbeanstalk.-2010-12-01/elastic-beanstalk-service-exception}})))))
(clojure.spec.alpha/fdef describe-environment-health :args (clojure.spec.alpha/? :portkey.aws.elasticbeanstalk.-2010-12-01/describe-environment-health-request) :ret (clojure.spec.alpha/and :portkey.aws.elasticbeanstalk.-2010-12-01/describe-environment-health-result))

(clojure.core/defn request-environment-info ([request-environment-info-messageinput] (clojure.core/let [request-function-result__28521__auto__ (req-request-environment-info-message request-environment-info-messageinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__28521__auto__ {:http.request.configuration/endpoints portkey.aws.elasticbeanstalk.-2010-12-01/endpoints, :http.request.configuration/target-prefix nil, :http.request.spec/output-spec nil, :http.request.configuration/mime-type {"content-type" "application/x-www-form-urlencoded; charset=utf-8"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2010-12-01", :http.request.configuration/service-id "Elastic Beanstalk", :http.request.spec/input-spec :portkey.aws.elasticbeanstalk.-2010-12-01/request-environment-info-message, :http.request.configuration/protocol "query", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/action "RequestEnvironmentInfo", :http.request.spec/error-spec {}})))))
(clojure.spec.alpha/fdef request-environment-info :args (clojure.spec.alpha/tuple :portkey.aws.elasticbeanstalk.-2010-12-01/request-environment-info-message) :ret clojure.core/true?)

(clojure.core/defn list-platform-versions ([] (list-platform-versions {})) ([list-platform-versions-requestinput] (clojure.core/let [request-function-result__28521__auto__ (req-list-platform-versions-request list-platform-versions-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__28521__auto__ {:http.request.configuration/endpoints portkey.aws.elasticbeanstalk.-2010-12-01/endpoints, :http.request.configuration/target-prefix nil, :http.request.spec/output-spec :portkey.aws.elasticbeanstalk.-2010-12-01/list-platform-versions-result, :http.request.configuration/mime-type {"content-type" "application/x-www-form-urlencoded; charset=utf-8"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2010-12-01", :http.request.configuration/service-id "Elastic Beanstalk", :http.request.spec/input-spec :portkey.aws.elasticbeanstalk.-2010-12-01/list-platform-versions-request, :http.request.configuration/protocol "query", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/action "ListPlatformVersions", :http.request.spec/error-spec {"InsufficientPrivilegesException" :portkey.aws.elasticbeanstalk.-2010-12-01/insufficient-privileges-exception, "ElasticBeanstalkServiceException" :portkey.aws.elasticbeanstalk.-2010-12-01/elastic-beanstalk-service-exception}})))))
(clojure.spec.alpha/fdef list-platform-versions :args (clojure.spec.alpha/? :portkey.aws.elasticbeanstalk.-2010-12-01/list-platform-versions-request) :ret (clojure.spec.alpha/and :portkey.aws.elasticbeanstalk.-2010-12-01/list-platform-versions-result))

(clojure.core/defn apply-environment-managed-action ([apply-environment-managed-action-requestinput] (clojure.core/let [request-function-result__28521__auto__ (req-apply-environment-managed-action-request apply-environment-managed-action-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__28521__auto__ {:http.request.configuration/endpoints portkey.aws.elasticbeanstalk.-2010-12-01/endpoints, :http.request.configuration/target-prefix nil, :http.request.spec/output-spec :portkey.aws.elasticbeanstalk.-2010-12-01/apply-environment-managed-action-result, :http.request.configuration/mime-type {"content-type" "application/x-www-form-urlencoded; charset=utf-8"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2010-12-01", :http.request.configuration/service-id "Elastic Beanstalk", :http.request.spec/input-spec :portkey.aws.elasticbeanstalk.-2010-12-01/apply-environment-managed-action-request, :http.request.configuration/protocol "query", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/action "ApplyEnvironmentManagedAction", :http.request.spec/error-spec {"ElasticBeanstalkServiceException" :portkey.aws.elasticbeanstalk.-2010-12-01/elastic-beanstalk-service-exception, "ManagedActionInvalidStateException" :portkey.aws.elasticbeanstalk.-2010-12-01/managed-action-invalid-state-exception}})))))
(clojure.spec.alpha/fdef apply-environment-managed-action :args (clojure.spec.alpha/tuple :portkey.aws.elasticbeanstalk.-2010-12-01/apply-environment-managed-action-request) :ret (clojure.spec.alpha/and :portkey.aws.elasticbeanstalk.-2010-12-01/apply-environment-managed-action-result))

(clojure.core/defn describe-applications ([] (describe-applications {})) ([describe-applications-messageinput] (clojure.core/let [request-function-result__28521__auto__ (req-describe-applications-message describe-applications-messageinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__28521__auto__ {:http.request.configuration/endpoints portkey.aws.elasticbeanstalk.-2010-12-01/endpoints, :http.request.configuration/target-prefix nil, :http.request.spec/output-spec :portkey.aws.elasticbeanstalk.-2010-12-01/application-descriptions-message, :http.request.configuration/mime-type {"content-type" "application/x-www-form-urlencoded; charset=utf-8"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2010-12-01", :http.request.configuration/service-id "Elastic Beanstalk", :http.request.spec/input-spec :portkey.aws.elasticbeanstalk.-2010-12-01/describe-applications-message, :http.request.configuration/protocol "query", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/action "DescribeApplications", :http.request.spec/error-spec {}})))))
(clojure.spec.alpha/fdef describe-applications :args (clojure.spec.alpha/? :portkey.aws.elasticbeanstalk.-2010-12-01/describe-applications-message) :ret (clojure.spec.alpha/and :portkey.aws.elasticbeanstalk.-2010-12-01/application-descriptions-message))

(clojure.core/defn list-tags-for-resource ([list-tags-for-resource-messageinput] (clojure.core/let [request-function-result__28521__auto__ (req-list-tags-for-resource-message list-tags-for-resource-messageinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__28521__auto__ {:http.request.configuration/endpoints portkey.aws.elasticbeanstalk.-2010-12-01/endpoints, :http.request.configuration/target-prefix nil, :http.request.spec/output-spec :portkey.aws.elasticbeanstalk.-2010-12-01/resource-tags-description-message, :http.request.configuration/mime-type {"content-type" "application/x-www-form-urlencoded; charset=utf-8"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2010-12-01", :http.request.configuration/service-id "Elastic Beanstalk", :http.request.spec/input-spec :portkey.aws.elasticbeanstalk.-2010-12-01/list-tags-for-resource-message, :http.request.configuration/protocol "query", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/action "ListTagsForResource", :http.request.spec/error-spec {"InsufficientPrivilegesException" :portkey.aws.elasticbeanstalk.-2010-12-01/insufficient-privileges-exception, "ResourceNotFoundException" :portkey.aws.elasticbeanstalk.-2010-12-01/resource-not-found-exception, "ResourceTypeNotSupportedException" :portkey.aws.elasticbeanstalk.-2010-12-01/resource-type-not-supported-exception}})))))
(clojure.spec.alpha/fdef list-tags-for-resource :args (clojure.spec.alpha/tuple :portkey.aws.elasticbeanstalk.-2010-12-01/list-tags-for-resource-message) :ret (clojure.spec.alpha/and :portkey.aws.elasticbeanstalk.-2010-12-01/resource-tags-description-message))

(clojure.core/defn validate-configuration-settings ([validate-configuration-settings-messageinput] (clojure.core/let [request-function-result__28521__auto__ (req-validate-configuration-settings-message validate-configuration-settings-messageinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__28521__auto__ {:http.request.configuration/endpoints portkey.aws.elasticbeanstalk.-2010-12-01/endpoints, :http.request.configuration/target-prefix nil, :http.request.spec/output-spec :portkey.aws.elasticbeanstalk.-2010-12-01/configuration-settings-validation-messages, :http.request.configuration/mime-type {"content-type" "application/x-www-form-urlencoded; charset=utf-8"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2010-12-01", :http.request.configuration/service-id "Elastic Beanstalk", :http.request.spec/input-spec :portkey.aws.elasticbeanstalk.-2010-12-01/validate-configuration-settings-message, :http.request.configuration/protocol "query", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/action "ValidateConfigurationSettings", :http.request.spec/error-spec {"InsufficientPrivilegesException" :portkey.aws.elasticbeanstalk.-2010-12-01/insufficient-privileges-exception, "TooManyBucketsException" :portkey.aws.elasticbeanstalk.-2010-12-01/too-many-buckets-exception}})))))
(clojure.spec.alpha/fdef validate-configuration-settings :args (clojure.spec.alpha/tuple :portkey.aws.elasticbeanstalk.-2010-12-01/validate-configuration-settings-message) :ret (clojure.spec.alpha/and :portkey.aws.elasticbeanstalk.-2010-12-01/configuration-settings-validation-messages))

(clojure.core/defn restart-app-server ([] (restart-app-server {})) ([restart-app-server-messageinput] (clojure.core/let [request-function-result__28521__auto__ (req-restart-app-server-message restart-app-server-messageinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__28521__auto__ {:http.request.configuration/endpoints portkey.aws.elasticbeanstalk.-2010-12-01/endpoints, :http.request.configuration/target-prefix nil, :http.request.spec/output-spec nil, :http.request.configuration/mime-type {"content-type" "application/x-www-form-urlencoded; charset=utf-8"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2010-12-01", :http.request.configuration/service-id "Elastic Beanstalk", :http.request.spec/input-spec :portkey.aws.elasticbeanstalk.-2010-12-01/restart-app-server-message, :http.request.configuration/protocol "query", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/action "RestartAppServer", :http.request.spec/error-spec {}})))))
(clojure.spec.alpha/fdef restart-app-server :args (clojure.spec.alpha/? :portkey.aws.elasticbeanstalk.-2010-12-01/restart-app-server-message) :ret clojure.core/true?)

(clojure.core/defn describe-environments ([] (describe-environments {})) ([describe-environments-messageinput] (clojure.core/let [request-function-result__28521__auto__ (req-describe-environments-message describe-environments-messageinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__28521__auto__ {:http.request.configuration/endpoints portkey.aws.elasticbeanstalk.-2010-12-01/endpoints, :http.request.configuration/target-prefix nil, :http.request.spec/output-spec :portkey.aws.elasticbeanstalk.-2010-12-01/environment-descriptions-message, :http.request.configuration/mime-type {"content-type" "application/x-www-form-urlencoded; charset=utf-8"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2010-12-01", :http.request.configuration/service-id "Elastic Beanstalk", :http.request.spec/input-spec :portkey.aws.elasticbeanstalk.-2010-12-01/describe-environments-message, :http.request.configuration/protocol "query", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/action "DescribeEnvironments", :http.request.spec/error-spec {}})))))
(clojure.spec.alpha/fdef describe-environments :args (clojure.spec.alpha/? :portkey.aws.elasticbeanstalk.-2010-12-01/describe-environments-message) :ret (clojure.spec.alpha/and :portkey.aws.elasticbeanstalk.-2010-12-01/environment-descriptions-message))

(clojure.core/defn delete-environment-configuration ([delete-environment-configuration-messageinput] (clojure.core/let [request-function-result__28521__auto__ (req-delete-environment-configuration-message delete-environment-configuration-messageinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__28521__auto__ {:http.request.configuration/endpoints portkey.aws.elasticbeanstalk.-2010-12-01/endpoints, :http.request.configuration/target-prefix nil, :http.request.spec/output-spec nil, :http.request.configuration/mime-type {"content-type" "application/x-www-form-urlencoded; charset=utf-8"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2010-12-01", :http.request.configuration/service-id "Elastic Beanstalk", :http.request.spec/input-spec :portkey.aws.elasticbeanstalk.-2010-12-01/delete-environment-configuration-message, :http.request.configuration/protocol "query", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/action "DeleteEnvironmentConfiguration", :http.request.spec/error-spec {}})))))
(clojure.spec.alpha/fdef delete-environment-configuration :args (clojure.spec.alpha/tuple :portkey.aws.elasticbeanstalk.-2010-12-01/delete-environment-configuration-message) :ret clojure.core/true?)

(clojure.core/defn terminate-environment ([] (terminate-environment {})) ([terminate-environment-messageinput] (clojure.core/let [request-function-result__28521__auto__ (req-terminate-environment-message terminate-environment-messageinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__28521__auto__ {:http.request.configuration/endpoints portkey.aws.elasticbeanstalk.-2010-12-01/endpoints, :http.request.configuration/target-prefix nil, :http.request.spec/output-spec :portkey.aws.elasticbeanstalk.-2010-12-01/environment-description, :http.request.configuration/mime-type {"content-type" "application/x-www-form-urlencoded; charset=utf-8"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2010-12-01", :http.request.configuration/service-id "Elastic Beanstalk", :http.request.spec/input-spec :portkey.aws.elasticbeanstalk.-2010-12-01/terminate-environment-message, :http.request.configuration/protocol "query", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/action "TerminateEnvironment", :http.request.spec/error-spec {"InsufficientPrivilegesException" :portkey.aws.elasticbeanstalk.-2010-12-01/insufficient-privileges-exception}})))))
(clojure.spec.alpha/fdef terminate-environment :args (clojure.spec.alpha/? :portkey.aws.elasticbeanstalk.-2010-12-01/terminate-environment-message) :ret (clojure.spec.alpha/and :portkey.aws.elasticbeanstalk.-2010-12-01/environment-description))

(clojure.core/defn check-dns-availability ([check-dns-availability-messageinput] (clojure.core/let [request-function-result__28521__auto__ (req-check-dns-availability-message check-dns-availability-messageinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__28521__auto__ {:http.request.configuration/endpoints portkey.aws.elasticbeanstalk.-2010-12-01/endpoints, :http.request.configuration/target-prefix nil, :http.request.spec/output-spec :portkey.aws.elasticbeanstalk.-2010-12-01/check-dns-availability-result-message, :http.request.configuration/mime-type {"content-type" "application/x-www-form-urlencoded; charset=utf-8"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2010-12-01", :http.request.configuration/service-id "Elastic Beanstalk", :http.request.spec/input-spec :portkey.aws.elasticbeanstalk.-2010-12-01/check-dns-availability-message, :http.request.configuration/protocol "query", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/action "CheckDNSAvailability", :http.request.spec/error-spec {}})))))
(clojure.spec.alpha/fdef check-dns-availability :args (clojure.spec.alpha/tuple :portkey.aws.elasticbeanstalk.-2010-12-01/check-dns-availability-message) :ret (clojure.spec.alpha/and :portkey.aws.elasticbeanstalk.-2010-12-01/check-dns-availability-result-message))

(clojure.core/defn retrieve-environment-info ([retrieve-environment-info-messageinput] (clojure.core/let [request-function-result__28521__auto__ (req-retrieve-environment-info-message retrieve-environment-info-messageinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__28521__auto__ {:http.request.configuration/endpoints portkey.aws.elasticbeanstalk.-2010-12-01/endpoints, :http.request.configuration/target-prefix nil, :http.request.spec/output-spec :portkey.aws.elasticbeanstalk.-2010-12-01/retrieve-environment-info-result-message, :http.request.configuration/mime-type {"content-type" "application/x-www-form-urlencoded; charset=utf-8"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2010-12-01", :http.request.configuration/service-id "Elastic Beanstalk", :http.request.spec/input-spec :portkey.aws.elasticbeanstalk.-2010-12-01/retrieve-environment-info-message, :http.request.configuration/protocol "query", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/action "RetrieveEnvironmentInfo", :http.request.spec/error-spec {}})))))
(clojure.spec.alpha/fdef retrieve-environment-info :args (clojure.spec.alpha/tuple :portkey.aws.elasticbeanstalk.-2010-12-01/retrieve-environment-info-message) :ret (clojure.spec.alpha/and :portkey.aws.elasticbeanstalk.-2010-12-01/retrieve-environment-info-result-message))

(clojure.core/defn create-storage-location ([] (create-storage-location {})) ([_] (clojure.core/let [request-function-result__28521__auto__ {}] (portkey.aws/-call-http (clojure.core/into request-function-result__28521__auto__ {:http.request.configuration/endpoints portkey.aws.elasticbeanstalk.-2010-12-01/endpoints, :http.request.configuration/target-prefix nil, :http.request.spec/output-spec :portkey.aws.elasticbeanstalk.-2010-12-01/create-storage-location-result-message, :http.request.configuration/mime-type {"content-type" "application/x-www-form-urlencoded; charset=utf-8"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2010-12-01", :http.request.configuration/service-id "Elastic Beanstalk", :http.request.spec/input-spec nil, :http.request.configuration/protocol "query", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/action "CreateStorageLocation", :http.request.spec/error-spec {"TooManyBucketsException" :portkey.aws.elasticbeanstalk.-2010-12-01/too-many-buckets-exception, "S3SubscriptionRequiredException" :portkey.aws.elasticbeanstalk.-2010-12-01/s-3-subscription-required-exception, "InsufficientPrivilegesException" :portkey.aws.elasticbeanstalk.-2010-12-01/insufficient-privileges-exception}})))))
(clojure.spec.alpha/fdef create-storage-location :args clojure.core/empty? :ret (clojure.spec.alpha/and :portkey.aws.elasticbeanstalk.-2010-12-01/create-storage-location-result-message))

(clojure.core/defn update-application ([update-application-messageinput] (clojure.core/let [request-function-result__28521__auto__ (req-update-application-message update-application-messageinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__28521__auto__ {:http.request.configuration/endpoints portkey.aws.elasticbeanstalk.-2010-12-01/endpoints, :http.request.configuration/target-prefix nil, :http.request.spec/output-spec :portkey.aws.elasticbeanstalk.-2010-12-01/application-description-message, :http.request.configuration/mime-type {"content-type" "application/x-www-form-urlencoded; charset=utf-8"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2010-12-01", :http.request.configuration/service-id "Elastic Beanstalk", :http.request.spec/input-spec :portkey.aws.elasticbeanstalk.-2010-12-01/update-application-message, :http.request.configuration/protocol "query", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/action "UpdateApplication", :http.request.spec/error-spec {}})))))
(clojure.spec.alpha/fdef update-application :args (clojure.spec.alpha/tuple :portkey.aws.elasticbeanstalk.-2010-12-01/update-application-message) :ret (clojure.spec.alpha/and :portkey.aws.elasticbeanstalk.-2010-12-01/application-description-message))

(clojure.core/defn describe-account-attributes ([] (describe-account-attributes {})) ([_] (clojure.core/let [request-function-result__28521__auto__ {}] (portkey.aws/-call-http (clojure.core/into request-function-result__28521__auto__ {:http.request.configuration/endpoints portkey.aws.elasticbeanstalk.-2010-12-01/endpoints, :http.request.configuration/target-prefix nil, :http.request.spec/output-spec :portkey.aws.elasticbeanstalk.-2010-12-01/describe-account-attributes-result, :http.request.configuration/mime-type {"content-type" "application/x-www-form-urlencoded; charset=utf-8"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2010-12-01", :http.request.configuration/service-id "Elastic Beanstalk", :http.request.spec/input-spec nil, :http.request.configuration/protocol "query", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/action "DescribeAccountAttributes", :http.request.spec/error-spec {"InsufficientPrivilegesException" :portkey.aws.elasticbeanstalk.-2010-12-01/insufficient-privileges-exception}})))))
(clojure.spec.alpha/fdef describe-account-attributes :args clojure.core/empty? :ret (clojure.spec.alpha/and :portkey.aws.elasticbeanstalk.-2010-12-01/describe-account-attributes-result))

(clojure.core/defn create-application ([create-application-messageinput] (clojure.core/let [request-function-result__28521__auto__ (req-create-application-message create-application-messageinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__28521__auto__ {:http.request.configuration/endpoints portkey.aws.elasticbeanstalk.-2010-12-01/endpoints, :http.request.configuration/target-prefix nil, :http.request.spec/output-spec :portkey.aws.elasticbeanstalk.-2010-12-01/application-description-message, :http.request.configuration/mime-type {"content-type" "application/x-www-form-urlencoded; charset=utf-8"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2010-12-01", :http.request.configuration/service-id "Elastic Beanstalk", :http.request.spec/input-spec :portkey.aws.elasticbeanstalk.-2010-12-01/create-application-message, :http.request.configuration/protocol "query", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/action "CreateApplication", :http.request.spec/error-spec {"TooManyApplicationsException" :portkey.aws.elasticbeanstalk.-2010-12-01/too-many-applications-exception}})))))
(clojure.spec.alpha/fdef create-application :args (clojure.spec.alpha/tuple :portkey.aws.elasticbeanstalk.-2010-12-01/create-application-message) :ret (clojure.spec.alpha/and :portkey.aws.elasticbeanstalk.-2010-12-01/application-description-message))

(clojure.core/defn describe-configuration-settings ([describe-configuration-settings-messageinput] (clojure.core/let [request-function-result__28521__auto__ (req-describe-configuration-settings-message describe-configuration-settings-messageinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__28521__auto__ {:http.request.configuration/endpoints portkey.aws.elasticbeanstalk.-2010-12-01/endpoints, :http.request.configuration/target-prefix nil, :http.request.spec/output-spec :portkey.aws.elasticbeanstalk.-2010-12-01/configuration-settings-descriptions, :http.request.configuration/mime-type {"content-type" "application/x-www-form-urlencoded; charset=utf-8"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2010-12-01", :http.request.configuration/service-id "Elastic Beanstalk", :http.request.spec/input-spec :portkey.aws.elasticbeanstalk.-2010-12-01/describe-configuration-settings-message, :http.request.configuration/protocol "query", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/action "DescribeConfigurationSettings", :http.request.spec/error-spec {"TooManyBucketsException" :portkey.aws.elasticbeanstalk.-2010-12-01/too-many-buckets-exception}})))))
(clojure.spec.alpha/fdef describe-configuration-settings :args (clojure.spec.alpha/tuple :portkey.aws.elasticbeanstalk.-2010-12-01/describe-configuration-settings-message) :ret (clojure.spec.alpha/and :portkey.aws.elasticbeanstalk.-2010-12-01/configuration-settings-descriptions))

(clojure.core/defn delete-application-version ([delete-application-version-messageinput] (clojure.core/let [request-function-result__28521__auto__ (req-delete-application-version-message delete-application-version-messageinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__28521__auto__ {:http.request.configuration/endpoints portkey.aws.elasticbeanstalk.-2010-12-01/endpoints, :http.request.configuration/target-prefix nil, :http.request.spec/output-spec nil, :http.request.configuration/mime-type {"content-type" "application/x-www-form-urlencoded; charset=utf-8"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2010-12-01", :http.request.configuration/service-id "Elastic Beanstalk", :http.request.spec/input-spec :portkey.aws.elasticbeanstalk.-2010-12-01/delete-application-version-message, :http.request.configuration/protocol "query", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/action "DeleteApplicationVersion", :http.request.spec/error-spec {"SourceBundleDeletionException" :portkey.aws.elasticbeanstalk.-2010-12-01/source-bundle-deletion-exception, "InsufficientPrivilegesException" :portkey.aws.elasticbeanstalk.-2010-12-01/insufficient-privileges-exception, "OperationInProgressException" :portkey.aws.elasticbeanstalk.-2010-12-01/operation-in-progress-exception, "S3LocationNotInServiceRegionException" :portkey.aws.elasticbeanstalk.-2010-12-01/s-3-location-not-in-service-region-exception}})))))
(clojure.spec.alpha/fdef delete-application-version :args (clojure.spec.alpha/tuple :portkey.aws.elasticbeanstalk.-2010-12-01/delete-application-version-message) :ret clojure.core/true?)

(clojure.core/defn delete-configuration-template ([delete-configuration-template-messageinput] (clojure.core/let [request-function-result__28521__auto__ (req-delete-configuration-template-message delete-configuration-template-messageinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__28521__auto__ {:http.request.configuration/endpoints portkey.aws.elasticbeanstalk.-2010-12-01/endpoints, :http.request.configuration/target-prefix nil, :http.request.spec/output-spec nil, :http.request.configuration/mime-type {"content-type" "application/x-www-form-urlencoded; charset=utf-8"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2010-12-01", :http.request.configuration/service-id "Elastic Beanstalk", :http.request.spec/input-spec :portkey.aws.elasticbeanstalk.-2010-12-01/delete-configuration-template-message, :http.request.configuration/protocol "query", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/action "DeleteConfigurationTemplate", :http.request.spec/error-spec {"OperationInProgressException" :portkey.aws.elasticbeanstalk.-2010-12-01/operation-in-progress-exception}})))))
(clojure.spec.alpha/fdef delete-configuration-template :args (clojure.spec.alpha/tuple :portkey.aws.elasticbeanstalk.-2010-12-01/delete-configuration-template-message) :ret clojure.core/true?)

(clojure.core/defn abort-environment-update ([] (abort-environment-update {})) ([abort-environment-update-messageinput] (clojure.core/let [request-function-result__28521__auto__ (req-abort-environment-update-message abort-environment-update-messageinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__28521__auto__ {:http.request.configuration/endpoints portkey.aws.elasticbeanstalk.-2010-12-01/endpoints, :http.request.configuration/target-prefix nil, :http.request.spec/output-spec nil, :http.request.configuration/mime-type {"content-type" "application/x-www-form-urlencoded; charset=utf-8"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2010-12-01", :http.request.configuration/service-id "Elastic Beanstalk", :http.request.spec/input-spec :portkey.aws.elasticbeanstalk.-2010-12-01/abort-environment-update-message, :http.request.configuration/protocol "query", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/action "AbortEnvironmentUpdate", :http.request.spec/error-spec {"InsufficientPrivilegesException" :portkey.aws.elasticbeanstalk.-2010-12-01/insufficient-privileges-exception}})))))
(clojure.spec.alpha/fdef abort-environment-update :args (clojure.spec.alpha/? :portkey.aws.elasticbeanstalk.-2010-12-01/abort-environment-update-message) :ret clojure.core/true?)

(clojure.core/defn delete-platform-version ([] (delete-platform-version {})) ([delete-platform-version-requestinput] (clojure.core/let [request-function-result__28521__auto__ (req-delete-platform-version-request delete-platform-version-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__28521__auto__ {:http.request.configuration/endpoints portkey.aws.elasticbeanstalk.-2010-12-01/endpoints, :http.request.configuration/target-prefix nil, :http.request.spec/output-spec :portkey.aws.elasticbeanstalk.-2010-12-01/delete-platform-version-result, :http.request.configuration/mime-type {"content-type" "application/x-www-form-urlencoded; charset=utf-8"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2010-12-01", :http.request.configuration/service-id "Elastic Beanstalk", :http.request.spec/input-spec :portkey.aws.elasticbeanstalk.-2010-12-01/delete-platform-version-request, :http.request.configuration/protocol "query", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/action "DeletePlatformVersion", :http.request.spec/error-spec {"OperationInProgressException" :portkey.aws.elasticbeanstalk.-2010-12-01/operation-in-progress-exception, "InsufficientPrivilegesException" :portkey.aws.elasticbeanstalk.-2010-12-01/insufficient-privileges-exception, "ElasticBeanstalkServiceException" :portkey.aws.elasticbeanstalk.-2010-12-01/elastic-beanstalk-service-exception, "PlatformVersionStillReferencedException" :portkey.aws.elasticbeanstalk.-2010-12-01/platform-version-still-referenced-exception}})))))
(clojure.spec.alpha/fdef delete-platform-version :args (clojure.spec.alpha/? :portkey.aws.elasticbeanstalk.-2010-12-01/delete-platform-version-request) :ret (clojure.spec.alpha/and :portkey.aws.elasticbeanstalk.-2010-12-01/delete-platform-version-result))

(clojure.core/defn update-configuration-template ([update-configuration-template-messageinput] (clojure.core/let [request-function-result__28521__auto__ (req-update-configuration-template-message update-configuration-template-messageinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__28521__auto__ {:http.request.configuration/endpoints portkey.aws.elasticbeanstalk.-2010-12-01/endpoints, :http.request.configuration/target-prefix nil, :http.request.spec/output-spec :portkey.aws.elasticbeanstalk.-2010-12-01/configuration-settings-description, :http.request.configuration/mime-type {"content-type" "application/x-www-form-urlencoded; charset=utf-8"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2010-12-01", :http.request.configuration/service-id "Elastic Beanstalk", :http.request.spec/input-spec :portkey.aws.elasticbeanstalk.-2010-12-01/update-configuration-template-message, :http.request.configuration/protocol "query", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/action "UpdateConfigurationTemplate", :http.request.spec/error-spec {"InsufficientPrivilegesException" :portkey.aws.elasticbeanstalk.-2010-12-01/insufficient-privileges-exception, "TooManyBucketsException" :portkey.aws.elasticbeanstalk.-2010-12-01/too-many-buckets-exception}})))))
(clojure.spec.alpha/fdef update-configuration-template :args (clojure.spec.alpha/tuple :portkey.aws.elasticbeanstalk.-2010-12-01/update-configuration-template-message) :ret (clojure.spec.alpha/and :portkey.aws.elasticbeanstalk.-2010-12-01/configuration-settings-description))

(clojure.core/defn rebuild-environment ([] (rebuild-environment {})) ([rebuild-environment-messageinput] (clojure.core/let [request-function-result__28521__auto__ (req-rebuild-environment-message rebuild-environment-messageinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__28521__auto__ {:http.request.configuration/endpoints portkey.aws.elasticbeanstalk.-2010-12-01/endpoints, :http.request.configuration/target-prefix nil, :http.request.spec/output-spec nil, :http.request.configuration/mime-type {"content-type" "application/x-www-form-urlencoded; charset=utf-8"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2010-12-01", :http.request.configuration/service-id "Elastic Beanstalk", :http.request.spec/input-spec :portkey.aws.elasticbeanstalk.-2010-12-01/rebuild-environment-message, :http.request.configuration/protocol "query", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/action "RebuildEnvironment", :http.request.spec/error-spec {"InsufficientPrivilegesException" :portkey.aws.elasticbeanstalk.-2010-12-01/insufficient-privileges-exception}})))))
(clojure.spec.alpha/fdef rebuild-environment :args (clojure.spec.alpha/? :portkey.aws.elasticbeanstalk.-2010-12-01/rebuild-environment-message) :ret clojure.core/true?)

(clojure.core/defn update-application-version ([update-application-version-messageinput] (clojure.core/let [request-function-result__28521__auto__ (req-update-application-version-message update-application-version-messageinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__28521__auto__ {:http.request.configuration/endpoints portkey.aws.elasticbeanstalk.-2010-12-01/endpoints, :http.request.configuration/target-prefix nil, :http.request.spec/output-spec :portkey.aws.elasticbeanstalk.-2010-12-01/application-version-description-message, :http.request.configuration/mime-type {"content-type" "application/x-www-form-urlencoded; charset=utf-8"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2010-12-01", :http.request.configuration/service-id "Elastic Beanstalk", :http.request.spec/input-spec :portkey.aws.elasticbeanstalk.-2010-12-01/update-application-version-message, :http.request.configuration/protocol "query", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/action "UpdateApplicationVersion", :http.request.spec/error-spec {}})))))
(clojure.spec.alpha/fdef update-application-version :args (clojure.spec.alpha/tuple :portkey.aws.elasticbeanstalk.-2010-12-01/update-application-version-message) :ret (clojure.spec.alpha/and :portkey.aws.elasticbeanstalk.-2010-12-01/application-version-description-message))

(clojure.core/defn describe-application-versions ([] (describe-application-versions {})) ([describe-application-versions-messageinput] (clojure.core/let [request-function-result__28521__auto__ (req-describe-application-versions-message describe-application-versions-messageinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__28521__auto__ {:http.request.configuration/endpoints portkey.aws.elasticbeanstalk.-2010-12-01/endpoints, :http.request.configuration/target-prefix nil, :http.request.spec/output-spec :portkey.aws.elasticbeanstalk.-2010-12-01/application-version-descriptions-message, :http.request.configuration/mime-type {"content-type" "application/x-www-form-urlencoded; charset=utf-8"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2010-12-01", :http.request.configuration/service-id "Elastic Beanstalk", :http.request.spec/input-spec :portkey.aws.elasticbeanstalk.-2010-12-01/describe-application-versions-message, :http.request.configuration/protocol "query", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/action "DescribeApplicationVersions", :http.request.spec/error-spec {}})))))
(clojure.spec.alpha/fdef describe-application-versions :args (clojure.spec.alpha/? :portkey.aws.elasticbeanstalk.-2010-12-01/describe-application-versions-message) :ret (clojure.spec.alpha/and :portkey.aws.elasticbeanstalk.-2010-12-01/application-version-descriptions-message))

(clojure.core/defn swap-environment-cnam-es ([] (swap-environment-cnam-es {})) ([swap-environment-cnam-es-messageinput] (clojure.core/let [request-function-result__28521__auto__ (req-swap-environment-cnam-es-message swap-environment-cnam-es-messageinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__28521__auto__ {:http.request.configuration/endpoints portkey.aws.elasticbeanstalk.-2010-12-01/endpoints, :http.request.configuration/target-prefix nil, :http.request.spec/output-spec nil, :http.request.configuration/mime-type {"content-type" "application/x-www-form-urlencoded; charset=utf-8"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2010-12-01", :http.request.configuration/service-id "Elastic Beanstalk", :http.request.spec/input-spec :portkey.aws.elasticbeanstalk.-2010-12-01/swap-environment-cnam-es-message, :http.request.configuration/protocol "query", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/action "SwapEnvironmentCNAMEs", :http.request.spec/error-spec {}})))))
(clojure.spec.alpha/fdef swap-environment-cnam-es :args (clojure.spec.alpha/? :portkey.aws.elasticbeanstalk.-2010-12-01/swap-environment-cnam-es-message) :ret clojure.core/true?)

(clojure.core/defn list-available-solution-stacks ([] (list-available-solution-stacks {})) ([_] (clojure.core/let [request-function-result__28521__auto__ {}] (portkey.aws/-call-http (clojure.core/into request-function-result__28521__auto__ {:http.request.configuration/endpoints portkey.aws.elasticbeanstalk.-2010-12-01/endpoints, :http.request.configuration/target-prefix nil, :http.request.spec/output-spec :portkey.aws.elasticbeanstalk.-2010-12-01/list-available-solution-stacks-result-message, :http.request.configuration/mime-type {"content-type" "application/x-www-form-urlencoded; charset=utf-8"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2010-12-01", :http.request.configuration/service-id "Elastic Beanstalk", :http.request.spec/input-spec nil, :http.request.configuration/protocol "query", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/action "ListAvailableSolutionStacks", :http.request.spec/error-spec {}})))))
(clojure.spec.alpha/fdef list-available-solution-stacks :args clojure.core/empty? :ret (clojure.spec.alpha/and :portkey.aws.elasticbeanstalk.-2010-12-01/list-available-solution-stacks-result-message))

(clojure.core/defn create-configuration-template ([create-configuration-template-messageinput] (clojure.core/let [request-function-result__28521__auto__ (req-create-configuration-template-message create-configuration-template-messageinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__28521__auto__ {:http.request.configuration/endpoints portkey.aws.elasticbeanstalk.-2010-12-01/endpoints, :http.request.configuration/target-prefix nil, :http.request.spec/output-spec :portkey.aws.elasticbeanstalk.-2010-12-01/configuration-settings-description, :http.request.configuration/mime-type {"content-type" "application/x-www-form-urlencoded; charset=utf-8"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2010-12-01", :http.request.configuration/service-id "Elastic Beanstalk", :http.request.spec/input-spec :portkey.aws.elasticbeanstalk.-2010-12-01/create-configuration-template-message, :http.request.configuration/protocol "query", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/action "CreateConfigurationTemplate", :http.request.spec/error-spec {"InsufficientPrivilegesException" :portkey.aws.elasticbeanstalk.-2010-12-01/insufficient-privileges-exception, "TooManyBucketsException" :portkey.aws.elasticbeanstalk.-2010-12-01/too-many-buckets-exception, "TooManyConfigurationTemplatesException" :portkey.aws.elasticbeanstalk.-2010-12-01/too-many-configuration-templates-exception}})))))
(clojure.spec.alpha/fdef create-configuration-template :args (clojure.spec.alpha/tuple :portkey.aws.elasticbeanstalk.-2010-12-01/create-configuration-template-message) :ret (clojure.spec.alpha/and :portkey.aws.elasticbeanstalk.-2010-12-01/configuration-settings-description))

(clojure.core/defn describe-environment-managed-action-history ([] (describe-environment-managed-action-history {})) ([describe-environment-managed-action-history-requestinput] (clojure.core/let [request-function-result__28521__auto__ (req-describe-environment-managed-action-history-request describe-environment-managed-action-history-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__28521__auto__ {:http.request.configuration/endpoints portkey.aws.elasticbeanstalk.-2010-12-01/endpoints, :http.request.configuration/target-prefix nil, :http.request.spec/output-spec :portkey.aws.elasticbeanstalk.-2010-12-01/describe-environment-managed-action-history-result, :http.request.configuration/mime-type {"content-type" "application/x-www-form-urlencoded; charset=utf-8"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2010-12-01", :http.request.configuration/service-id "Elastic Beanstalk", :http.request.spec/input-spec :portkey.aws.elasticbeanstalk.-2010-12-01/describe-environment-managed-action-history-request, :http.request.configuration/protocol "query", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/action "DescribeEnvironmentManagedActionHistory", :http.request.spec/error-spec {"ElasticBeanstalkServiceException" :portkey.aws.elasticbeanstalk.-2010-12-01/elastic-beanstalk-service-exception}})))))
(clojure.spec.alpha/fdef describe-environment-managed-action-history :args (clojure.spec.alpha/? :portkey.aws.elasticbeanstalk.-2010-12-01/describe-environment-managed-action-history-request) :ret (clojure.spec.alpha/and :portkey.aws.elasticbeanstalk.-2010-12-01/describe-environment-managed-action-history-result))
