(ns portkey.aws.elasticbeanstalk.-2010-12-01 (:require [portkey.aws]))

(def
 endpoints
 '{"us-gov-east-1"
   {:credential-scope
    {:service "elasticbeanstalk", :region "us-gov-east-1"},
    :ssl-common-name "elasticbeanstalk.us-gov-east-1.amazonaws.com",
    :endpoint "https://elasticbeanstalk.us-gov-east-1.amazonaws.com",
    :signature-version :v4},
   "ap-northeast-1"
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
    :signature-version :v4},
   "eu-north-1"
   {:credential-scope
    {:service "elasticbeanstalk", :region "eu-north-1"},
    :ssl-common-name "elasticbeanstalk.eu-north-1.amazonaws.com",
    :endpoint "https://elasticbeanstalk.eu-north-1.amazonaws.com",
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

(clojure.core/declare deser-solution-stack-description)

(clojure.core/declare deser-version-label)

(clojure.core/declare deser-event-message)

(clojure.core/declare deser-application-version-arn)

(clojure.core/declare deser-source-repository)

(clojure.core/declare deser-event-severity)

(clojure.core/declare deser-platform-framework)

(clojure.core/declare deser-instance-id)

(clojure.core/declare deser-configuration-template-names-list)

(clojure.core/declare deser-cause)

(clojure.core/declare deser-cname-availability)

(clojure.core/declare deser-boxed-int)

(clojure.core/declare deser-file-type-extension)

(clojure.core/declare deser-deployment)

(clojure.core/declare deser-request-id)

(clojure.core/declare deser-option-namespace)

(clojure.core/declare deser-launched-at)

(clojure.core/declare deser-sample-timestamp)

(clojure.core/declare deser-boxed-boolean)

(clojure.core/declare deser-solution-stack-name)

(clojure.core/declare deser-platform-name)

(clojure.core/declare deser-validation-severity)

(clojure.core/declare deser-load-balancer-description)

(clojure.core/declare deser-image-id)

(clojure.core/declare deser-validation-messages-list)

(clojure.core/declare deser-application-arn)

(clojure.core/declare deser-environment-status)

(clojure.core/declare deser-supported-addon-list)

(clojure.core/declare deser-environment-tier)

(clojure.core/declare deser-regex-pattern)

(clojure.core/declare deser-operating-system-name)

(clojure.core/declare deser-environment-link)

(clojure.core/declare deser-configuration-option-severity)

(clojure.core/declare deser-environment-name)

(clojure.core/declare deser-managed-actions)

(clojure.core/declare deser-environment-health-status)

(clojure.core/declare deser-queue)

(clojure.core/declare deser-option-restriction-max-value)

(clojure.core/declare deser-trigger-list)

(clojure.core/declare deser-resource-quota)

(clojure.core/declare deser-dns-cname)

(clojure.core/declare deser-tag-key)

(clojure.core/declare deser-launch-template)

(clojure.core/declare deser-environment-descriptions-list)

(clojure.core/declare deser-application-version-lifecycle-config)

(clojure.core/declare deser-instance-health-list)

(clojure.core/declare deser-arn)

(clojure.core/declare deser-instance-health-summary)

(clojure.core/declare deser-load-average-value)

(clojure.core/declare deser-source-type)

(clojure.core/declare deser-auto-scaling-group-list)

(clojure.core/declare deser-custom-ami)

(clojure.core/declare deser-request-count)

(clojure.core/declare deser-regex-label)

(clojure.core/declare deser-supported-tier-list)

(clojure.core/declare deser-application-resource-lifecycle-config)

(clojure.core/declare deser-platform-category)

(clojure.core/declare deser-validation-message)

(clojure.core/declare deser-platform-summary)

(clojure.core/declare deser-version-labels-list)

(clojure.core/declare deser-next-token)

(clojure.core/declare deser-managed-action-history-item)

(clojure.core/declare deser-environment-info-type)

(clojure.core/declare deser-configuration-option-name)

(clojure.core/declare deser-resource-id)

(clojure.core/declare deser-platform-frameworks)

(clojure.core/declare deser-application-version-description-list)

(clojure.core/declare deser-resource-quotas)

(clojure.core/declare deser-environment-arn)

(clojure.core/declare deser-available-solution-stack-details-list)

(clojure.core/declare deser-tag-list)

(clojure.core/declare deser-managed-action)

(clojure.core/declare deser-platform-owner)

(clojure.core/declare deser-environment-resource-description)

(clojure.core/declare deser-supported-addon)

(clojure.core/declare deser-action-status)

(clojure.core/declare deser-abortable-operation-in-progress)

(clojure.core/declare deser-causes)

(clojure.core/declare deser-nullable-long)

(clojure.core/declare deser-configuration-option-value-type)

(clojure.core/declare deser-application-version-status)

(clojure.core/declare deser-maintainer)

(clojure.core/declare deser-description)

(clojure.core/declare deser-tag-value)

(clojure.core/declare deser-configuration-option-settings-list)

(clojure.core/declare deser-configuration-option-setting)

(clojure.core/declare deser-action-history-status)

(clojure.core/declare deser-environment-info-description-list)

(clojure.core/declare deser-endpoint-url)

(clojure.core/declare deser-builder)

(clojure.core/declare deser-exception-message)

(clojure.core/declare deser-message)

(clojure.core/declare deser-max-count-rule)

(clojure.core/declare deser-auto-scaling-group)

(clojure.core/declare deser-single-instance-health)

(clojure.core/declare deser-application-name)

(clojure.core/declare deser-event-date)

(clojure.core/declare deser-validation-message-string)

(clojure.core/declare deser-platform-version)

(clojure.core/declare deser-resource-name)

(clojure.core/declare deser-integer)

(clojure.core/declare deser-string)

(clojure.core/declare deser-platform-programming-languages)

(clojure.core/declare deser-application-metrics)

(clojure.core/declare deser-operating-system-version)

(clojure.core/declare deser-option-restriction-min-value)

(clojure.core/declare deser-status-codes)

(clojure.core/declare deser-deployment-timestamp)

(clojure.core/declare deser-update-date)

(clojure.core/declare deser-listener)

(clojure.core/declare deser-s-3-key)

(clojure.core/declare deser-configuration-option-possible-value)

(clojure.core/declare deser-platform-summary-list)

(clojure.core/declare deser-failure-type)

(clojure.core/declare deser-platform-description)

(clojure.core/declare deser-configuration-settings-description-list)

(clojure.core/declare deser-event-description)

(clojure.core/declare deser-s-3-location)

(clojure.core/declare deser-managed-action-history-items)

(clojure.core/declare deser-instance-list)

(clojure.core/declare deser-launch-template-list)

(clojure.core/declare deser-max-age-rule)

(clojure.core/declare deser-s-3-bucket)

(clojure.core/declare deser-refreshed-at)

(clojure.core/declare deser-source-location)

(clojure.core/declare deser-cpu-utilization)

(clojure.core/declare deser-creation-date)

(clojure.core/declare deser-option-restriction-regex)

(clojure.core/declare deser-load-balancer)

(clojure.core/declare deser-option-restriction-max-length)

(clojure.core/declare deser-timestamp)

(clojure.core/declare deser-launch-configuration)

(clojure.core/declare deser-virtualization-type)

(clojure.core/declare deser-platform-status)

(clojure.core/declare deser-resource-arn)

(clojure.core/declare deser-latency)

(clojure.core/declare deser-configuration-option-possible-values)

(clojure.core/declare deser-platform-arn)

(clojure.core/declare deser-ec-2-instance-id)

(clojure.core/declare deser-tag)

(clojure.core/declare deser-solution-stack-file-type-list)

(clojure.core/declare deser-environment-links)

(clojure.core/declare deser-nullable-integer)

(clojure.core/declare deser-instance)

(clojure.core/declare deser-configuration-option-descriptions-list)

(clojure.core/declare deser-event-description-list)

(clojure.core/declare deser-load-average)

(clojure.core/declare deser-action-type)

(clojure.core/declare deser-application-version-description)

(clojure.core/declare deser-application-description-list)

(clojure.core/declare deser-configuration-option-default-value)

(clojure.core/declare deser-configuration-settings-description)

(clojure.core/declare deser-configuration-deployment-status)

(clojure.core/declare deser-environment-resources-description)

(clojure.core/declare deser-application-description)

(clojure.core/declare deser-environment-id)

(clojure.core/declare deser-source-build-information)

(clojure.core/declare deser-nullable-double)

(clojure.core/declare deser-environment-description)

(clojure.core/declare deser-configuration-template-name)

(clojure.core/declare deser-load-balancer-listeners-description)

(clojure.core/declare deser-available-solution-stack-names-list)

(clojure.core/declare deser-token)

(clojure.core/declare deser-configuration-option-value)

(clojure.core/declare deser-platform-programming-language)

(clojure.core/declare deser-custom-ami-list)

(clojure.core/declare deser-queue-list)

(clojure.core/declare deser-environment-health)

(clojure.core/declare deser-environment-info-description)

(clojure.core/declare deser-trigger)

(clojure.core/declare deser-user-defined-option)

(clojure.core/declare deser-supported-tier)

(clojure.core/declare deser-load-balancer-list)

(clojure.core/declare deser-launch-configuration-list)

(clojure.core/declare deser-configuration-option-description)

(clojure.core/declare deser-system-status)

(clojure.core/defn- deser-solution-stack-description [input] (clojure.core/let [letvar854901 {"SolutionStackName" (portkey.aws/search-for-tag input "SolutionStackName" :flattened? nil :xmlAttribute? nil), "PermittedFileTypes" (portkey.aws/search-for-tag input "PermittedFileTypes" :flattened? nil :xmlAttribute? nil)}] (clojure.core/cond-> {} (letvar854901 "SolutionStackName") (clojure.core/assoc :solution-stack-name (deser-solution-stack-name (clojure.core/get-in letvar854901 ["SolutionStackName" :content]))) (letvar854901 "PermittedFileTypes") (clojure.core/assoc :permitted-file-types (deser-solution-stack-file-type-list (clojure.core/get-in letvar854901 ["PermittedFileTypes" :content]))))))

(clojure.core/defn- deser-version-label [input] (portkey.aws/unbox-xml-primitive-value input))

(clojure.core/defn- deser-event-message [input] (portkey.aws/unbox-xml-primitive-value input))

(clojure.core/defn- deser-application-version-arn [input] (portkey.aws/unbox-xml-primitive-value input))

(clojure.core/defn- deser-source-repository [input] (clojure.core/get {"CodeCommit" :code-commit, "S3" :s-3} (portkey.aws/unbox-xml-primitive-value input)))

(clojure.core/defn- deser-event-severity [input] (clojure.core/get {"TRACE" :trace, "DEBUG" :debug, "INFO" :info, "WARN" :warn, "ERROR" :error, "FATAL" :fatal} (portkey.aws/unbox-xml-primitive-value input)))

(clojure.core/defn- deser-platform-framework [input] (clojure.core/let [letvar855034 {"Name" (portkey.aws/search-for-tag input "Name" :flattened? nil :xmlAttribute? nil), "Version" (portkey.aws/search-for-tag input "Version" :flattened? nil :xmlAttribute? nil)}] (clojure.core/cond-> {} (letvar855034 "Name") (clojure.core/assoc :name (deser-string (clojure.core/get-in letvar855034 ["Name" :content]))) (letvar855034 "Version") (clojure.core/assoc :version (deser-string (clojure.core/get-in letvar855034 ["Version" :content]))))))

(clojure.core/defn- deser-instance-id [input] (portkey.aws/unbox-xml-primitive-value input))

(clojure.core/defn- deser-configuration-template-names-list [input] (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (deser-configuration-template-name coll))) input))

(clojure.core/defn- deser-cause [input] (portkey.aws/unbox-xml-primitive-value input))

(clojure.core/defn- deser-cname-availability [input] (clojure.core/when-let [boolstr__21591__auto__ (portkey.aws/unbox-xml-primitive-value input)] (clojure.core/cond (clojure.core/= "true" boolstr__21591__auto__) true (clojure.core/= "false" boolstr__21591__auto__) false)))

(clojure.core/defn- deser-boxed-int [input] (java.lang.Integer. (portkey.aws/unbox-xml-primitive-value input)))

(clojure.core/defn- deser-file-type-extension [input] (portkey.aws/unbox-xml-primitive-value input))

(clojure.core/defn- deser-deployment [input] (clojure.core/let [letvar855178 {"VersionLabel" (portkey.aws/search-for-tag input "VersionLabel" :flattened? nil :xmlAttribute? nil), "DeploymentId" (portkey.aws/search-for-tag input "DeploymentId" :flattened? nil :xmlAttribute? nil), "Status" (portkey.aws/search-for-tag input "Status" :flattened? nil :xmlAttribute? nil), "DeploymentTime" (portkey.aws/search-for-tag input "DeploymentTime" :flattened? nil :xmlAttribute? nil)}] (clojure.core/cond-> {} (letvar855178 "VersionLabel") (clojure.core/assoc :version-label (deser-string (clojure.core/get-in letvar855178 ["VersionLabel" :content]))) (letvar855178 "DeploymentId") (clojure.core/assoc :deployment-id (deser-nullable-long (clojure.core/get-in letvar855178 ["DeploymentId" :content]))) (letvar855178 "Status") (clojure.core/assoc :status (deser-string (clojure.core/get-in letvar855178 ["Status" :content]))) (letvar855178 "DeploymentTime") (clojure.core/assoc :deployment-time (deser-deployment-timestamp (clojure.core/get-in letvar855178 ["DeploymentTime" :content]))))))

(clojure.core/defn- deser-request-id [input] (portkey.aws/unbox-xml-primitive-value input))

(clojure.core/defn- deser-option-namespace [input] (portkey.aws/unbox-xml-primitive-value input))

(clojure.core/defn- deser-launched-at [input] (portkey.aws/unbox-xml-primitive-value input))

(clojure.core/defn- deser-sample-timestamp [input] (portkey.aws/unbox-xml-primitive-value input))

(clojure.core/defn- deser-boxed-boolean [input] (clojure.core/when-let [boolstr__21591__auto__ (portkey.aws/unbox-xml-primitive-value input)] (clojure.core/cond (clojure.core/= "true" boolstr__21591__auto__) true (clojure.core/= "false" boolstr__21591__auto__) false)))

(clojure.core/defn- deser-solution-stack-name [input] (portkey.aws/unbox-xml-primitive-value input))

(clojure.core/defn- deser-platform-name [input] (portkey.aws/unbox-xml-primitive-value input))

(clojure.core/defn- deser-validation-severity [input] (clojure.core/get {"error" :error, "warning" :warning} (portkey.aws/unbox-xml-primitive-value input)))

(clojure.core/defn- deser-load-balancer-description [input] (clojure.core/let [letvar855317 {"LoadBalancerName" (portkey.aws/search-for-tag input "LoadBalancerName" :flattened? nil :xmlAttribute? nil), "Domain" (portkey.aws/search-for-tag input "Domain" :flattened? nil :xmlAttribute? nil), "Listeners" (portkey.aws/search-for-tag input "Listeners" :flattened? nil :xmlAttribute? nil)}] (clojure.core/cond-> {} (letvar855317 "LoadBalancerName") (clojure.core/assoc :load-balancer-name (deser-string (clojure.core/get-in letvar855317 ["LoadBalancerName" :content]))) (letvar855317 "Domain") (clojure.core/assoc :domain (deser-string (clojure.core/get-in letvar855317 ["Domain" :content]))) (letvar855317 "Listeners") (clojure.core/assoc :listeners (deser-load-balancer-listeners-description (clojure.core/get-in letvar855317 ["Listeners" :content]))))))

(clojure.core/defn- deser-image-id [input] (portkey.aws/unbox-xml-primitive-value input))

(clojure.core/defn- deser-validation-messages-list [input] (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (deser-validation-message coll))) input))

(clojure.core/defn- deser-application-arn [input] (portkey.aws/unbox-xml-primitive-value input))

(clojure.core/defn- deser-environment-status [input] (clojure.core/get {"Launching" :launching, "Updating" :updating, "Ready" :ready, "Terminating" :terminating, "Terminated" :terminated} (portkey.aws/unbox-xml-primitive-value input)))

(clojure.core/defn- deser-supported-addon-list [input] (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (deser-supported-addon coll))) input))

(clojure.core/defn- deser-environment-tier [input] (clojure.core/let [letvar855474 {"Name" (portkey.aws/search-for-tag input "Name" :flattened? nil :xmlAttribute? nil), "Type" (portkey.aws/search-for-tag input "Type" :flattened? nil :xmlAttribute? nil), "Version" (portkey.aws/search-for-tag input "Version" :flattened? nil :xmlAttribute? nil)}] (clojure.core/cond-> {} (letvar855474 "Name") (clojure.core/assoc :name (deser-string (clojure.core/get-in letvar855474 ["Name" :content]))) (letvar855474 "Type") (clojure.core/assoc :type (deser-string (clojure.core/get-in letvar855474 ["Type" :content]))) (letvar855474 "Version") (clojure.core/assoc :version (deser-string (clojure.core/get-in letvar855474 ["Version" :content]))))))

(clojure.core/defn- deser-regex-pattern [input] (portkey.aws/unbox-xml-primitive-value input))

(clojure.core/defn- deser-operating-system-name [input] (portkey.aws/unbox-xml-primitive-value input))

(clojure.core/defn- deser-environment-link [input] (clojure.core/let [letvar855592 {"LinkName" (portkey.aws/search-for-tag input "LinkName" :flattened? nil :xmlAttribute? nil), "EnvironmentName" (portkey.aws/search-for-tag input "EnvironmentName" :flattened? nil :xmlAttribute? nil)}] (clojure.core/cond-> {} (letvar855592 "LinkName") (clojure.core/assoc :link-name (deser-string (clojure.core/get-in letvar855592 ["LinkName" :content]))) (letvar855592 "EnvironmentName") (clojure.core/assoc :environment-name (deser-string (clojure.core/get-in letvar855592 ["EnvironmentName" :content]))))))

(clojure.core/defn- deser-configuration-option-severity [input] (portkey.aws/unbox-xml-primitive-value input))

(clojure.core/defn- deser-environment-name [input] (portkey.aws/unbox-xml-primitive-value input))

(clojure.core/defn- deser-managed-actions [input] (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (deser-managed-action coll))) input))

(clojure.core/defn- deser-environment-health-status [input] (clojure.core/get {"Suspended" :suspended, "Info" :info, "Severe" :severe, "Unknown" :unknown, "Warning" :warning, "NoData" :no-data, "Pending" :pending, "Degraded" :degraded, "Ok" :ok} (portkey.aws/unbox-xml-primitive-value input)))

(clojure.core/defn- deser-queue [input] (clojure.core/let [letvar855732 {"Name" (portkey.aws/search-for-tag input "Name" :flattened? nil :xmlAttribute? nil), "URL" (portkey.aws/search-for-tag input "URL" :flattened? nil :xmlAttribute? nil)}] (clojure.core/cond-> {} (letvar855732 "Name") (clojure.core/assoc :name (deser-string (clojure.core/get-in letvar855732 ["Name" :content]))) (letvar855732 "URL") (clojure.core/assoc :url (deser-string (clojure.core/get-in letvar855732 ["URL" :content]))))))

(clojure.core/defn- deser-option-restriction-max-value [input] (java.lang.Integer. (portkey.aws/unbox-xml-primitive-value input)))

(clojure.core/defn- deser-trigger-list [input] (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (deser-trigger coll))) input))

(clojure.core/defn- deser-resource-quota [input] (clojure.core/let [letvar855859 {"Maximum" (portkey.aws/search-for-tag input "Maximum" :flattened? nil :xmlAttribute? nil)}] (clojure.core/cond-> {} (letvar855859 "Maximum") (clojure.core/assoc :maximum (deser-boxed-int (clojure.core/get-in letvar855859 ["Maximum" :content]))))))

(clojure.core/defn- deser-dns-cname [input] (portkey.aws/unbox-xml-primitive-value input))

(clojure.core/defn- deser-tag-key [input] (portkey.aws/unbox-xml-primitive-value input))

(clojure.core/defn- deser-launch-template [input] (clojure.core/let [letvar855977 {"Id" (portkey.aws/search-for-tag input "Id" :flattened? nil :xmlAttribute? nil)}] (clojure.core/cond-> {} (letvar855977 "Id") (clojure.core/assoc :id (deser-resource-id (clojure.core/get-in letvar855977 ["Id" :content]))))))

(clojure.core/defn- deser-environment-descriptions-list [input] (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (deser-environment-description coll))) input))

(clojure.core/defn- deser-application-version-lifecycle-config [input] (clojure.core/let [letvar856102 {"MaxCountRule" (portkey.aws/search-for-tag input "MaxCountRule" :flattened? nil :xmlAttribute? nil), "MaxAgeRule" (portkey.aws/search-for-tag input "MaxAgeRule" :flattened? nil :xmlAttribute? nil)}] (clojure.core/cond-> {} (letvar856102 "MaxCountRule") (clojure.core/assoc :max-count-rule (deser-max-count-rule (clojure.core/get-in letvar856102 ["MaxCountRule" :content]))) (letvar856102 "MaxAgeRule") (clojure.core/assoc :max-age-rule (deser-max-age-rule (clojure.core/get-in letvar856102 ["MaxAgeRule" :content]))))))

(clojure.core/defn- deser-instance-health-list [input] (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (deser-single-instance-health coll))) input))

(clojure.core/defn- deser-arn [input] (portkey.aws/unbox-xml-primitive-value input))

(clojure.core/defn- deser-instance-health-summary [input] (clojure.core/let [letvar856232 {"NoData" (portkey.aws/search-for-tag input "NoData" :flattened? nil :xmlAttribute? nil), "Unknown" (portkey.aws/search-for-tag input "Unknown" :flattened? nil :xmlAttribute? nil), "Pending" (portkey.aws/search-for-tag input "Pending" :flattened? nil :xmlAttribute? nil), "Ok" (portkey.aws/search-for-tag input "Ok" :flattened? nil :xmlAttribute? nil), "Info" (portkey.aws/search-for-tag input "Info" :flattened? nil :xmlAttribute? nil), "Warning" (portkey.aws/search-for-tag input "Warning" :flattened? nil :xmlAttribute? nil), "Degraded" (portkey.aws/search-for-tag input "Degraded" :flattened? nil :xmlAttribute? nil), "Severe" (portkey.aws/search-for-tag input "Severe" :flattened? nil :xmlAttribute? nil)}] (clojure.core/cond-> {} (letvar856232 "NoData") (clojure.core/assoc :no-data (deser-nullable-integer (clojure.core/get-in letvar856232 ["NoData" :content]))) (letvar856232 "Unknown") (clojure.core/assoc :unknown (deser-nullable-integer (clojure.core/get-in letvar856232 ["Unknown" :content]))) (letvar856232 "Pending") (clojure.core/assoc :pending (deser-nullable-integer (clojure.core/get-in letvar856232 ["Pending" :content]))) (letvar856232 "Ok") (clojure.core/assoc :ok (deser-nullable-integer (clojure.core/get-in letvar856232 ["Ok" :content]))) (letvar856232 "Info") (clojure.core/assoc :info (deser-nullable-integer (clojure.core/get-in letvar856232 ["Info" :content]))) (letvar856232 "Warning") (clojure.core/assoc :warning (deser-nullable-integer (clojure.core/get-in letvar856232 ["Warning" :content]))) (letvar856232 "Degraded") (clojure.core/assoc :degraded (deser-nullable-integer (clojure.core/get-in letvar856232 ["Degraded" :content]))) (letvar856232 "Severe") (clojure.core/assoc :severe (deser-nullable-integer (clojure.core/get-in letvar856232 ["Severe" :content]))))))

(clojure.core/defn- deser-load-average-value [input] (java.lang.Double. (portkey.aws/unbox-xml-primitive-value input)))

(clojure.core/defn- deser-source-type [input] (clojure.core/get {"Git" :git, "Zip" :zip} (portkey.aws/unbox-xml-primitive-value input)))

(clojure.core/defn- deser-auto-scaling-group-list [input] (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (deser-auto-scaling-group coll))) input))

(clojure.core/defn- deser-custom-ami [input] (clojure.core/let [letvar856364 {"VirtualizationType" (portkey.aws/search-for-tag input "VirtualizationType" :flattened? nil :xmlAttribute? nil), "ImageId" (portkey.aws/search-for-tag input "ImageId" :flattened? nil :xmlAttribute? nil)}] (clojure.core/cond-> {} (letvar856364 "VirtualizationType") (clojure.core/assoc :virtualization-type (deser-virtualization-type (clojure.core/get-in letvar856364 ["VirtualizationType" :content]))) (letvar856364 "ImageId") (clojure.core/assoc :image-id (deser-image-id (clojure.core/get-in letvar856364 ["ImageId" :content]))))))

(clojure.core/defn- deser-request-count [input] (java.lang.Integer. (portkey.aws/unbox-xml-primitive-value input)))

(clojure.core/defn- deser-regex-label [input] (portkey.aws/unbox-xml-primitive-value input))

(clojure.core/defn- deser-supported-tier-list [input] (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (deser-supported-tier coll))) input))

(clojure.core/defn- deser-application-resource-lifecycle-config [input] (clojure.core/let [letvar856496 {"ServiceRole" (portkey.aws/search-for-tag input "ServiceRole" :flattened? nil :xmlAttribute? nil), "VersionLifecycleConfig" (portkey.aws/search-for-tag input "VersionLifecycleConfig" :flattened? nil :xmlAttribute? nil)}] (clojure.core/cond-> {} (letvar856496 "ServiceRole") (clojure.core/assoc :service-role (deser-string (clojure.core/get-in letvar856496 ["ServiceRole" :content]))) (letvar856496 "VersionLifecycleConfig") (clojure.core/assoc :version-lifecycle-config (deser-application-version-lifecycle-config (clojure.core/get-in letvar856496 ["VersionLifecycleConfig" :content]))))))

(clojure.core/defn- deser-platform-category [input] (portkey.aws/unbox-xml-primitive-value input))

(clojure.core/defn- deser-validation-message [input] (clojure.core/let [letvar856609 {"Message" (portkey.aws/search-for-tag input "Message" :flattened? nil :xmlAttribute? nil), "Severity" (portkey.aws/search-for-tag input "Severity" :flattened? nil :xmlAttribute? nil), "Namespace" (portkey.aws/search-for-tag input "Namespace" :flattened? nil :xmlAttribute? nil), "OptionName" (portkey.aws/search-for-tag input "OptionName" :flattened? nil :xmlAttribute? nil)}] (clojure.core/cond-> {} (letvar856609 "Message") (clojure.core/assoc :message (deser-validation-message-string (clojure.core/get-in letvar856609 ["Message" :content]))) (letvar856609 "Severity") (clojure.core/assoc :severity (deser-validation-severity (clojure.core/get-in letvar856609 ["Severity" :content]))) (letvar856609 "Namespace") (clojure.core/assoc :namespace (deser-option-namespace (clojure.core/get-in letvar856609 ["Namespace" :content]))) (letvar856609 "OptionName") (clojure.core/assoc :option-name (deser-configuration-option-name (clojure.core/get-in letvar856609 ["OptionName" :content]))))))

(clojure.core/defn- deser-platform-summary [input] (clojure.core/let [letvar856717 {"PlatformArn" (portkey.aws/search-for-tag input "PlatformArn" :flattened? nil :xmlAttribute? nil), "PlatformOwner" (portkey.aws/search-for-tag input "PlatformOwner" :flattened? nil :xmlAttribute? nil), "PlatformStatus" (portkey.aws/search-for-tag input "PlatformStatus" :flattened? nil :xmlAttribute? nil), "PlatformCategory" (portkey.aws/search-for-tag input "PlatformCategory" :flattened? nil :xmlAttribute? nil), "OperatingSystemName" (portkey.aws/search-for-tag input "OperatingSystemName" :flattened? nil :xmlAttribute? nil), "OperatingSystemVersion" (portkey.aws/search-for-tag input "OperatingSystemVersion" :flattened? nil :xmlAttribute? nil), "SupportedTierList" (portkey.aws/search-for-tag input "SupportedTierList" :flattened? nil :xmlAttribute? nil), "SupportedAddonList" (portkey.aws/search-for-tag input "SupportedAddonList" :flattened? nil :xmlAttribute? nil)}] (clojure.core/cond-> {} (letvar856717 "PlatformArn") (clojure.core/assoc :platform-arn (deser-platform-arn (clojure.core/get-in letvar856717 ["PlatformArn" :content]))) (letvar856717 "PlatformOwner") (clojure.core/assoc :platform-owner (deser-platform-owner (clojure.core/get-in letvar856717 ["PlatformOwner" :content]))) (letvar856717 "PlatformStatus") (clojure.core/assoc :platform-status (deser-platform-status (clojure.core/get-in letvar856717 ["PlatformStatus" :content]))) (letvar856717 "PlatformCategory") (clojure.core/assoc :platform-category (deser-platform-category (clojure.core/get-in letvar856717 ["PlatformCategory" :content]))) (letvar856717 "OperatingSystemName") (clojure.core/assoc :operating-system-name (deser-operating-system-name (clojure.core/get-in letvar856717 ["OperatingSystemName" :content]))) (letvar856717 "OperatingSystemVersion") (clojure.core/assoc :operating-system-version (deser-operating-system-version (clojure.core/get-in letvar856717 ["OperatingSystemVersion" :content]))) (letvar856717 "SupportedTierList") (clojure.core/assoc :supported-tier-list (deser-supported-tier-list (clojure.core/get-in letvar856717 ["SupportedTierList" :content]))) (letvar856717 "SupportedAddonList") (clojure.core/assoc :supported-addon-list (deser-supported-addon-list (clojure.core/get-in letvar856717 ["SupportedAddonList" :content]))))))

(clojure.core/defn- deser-version-labels-list [input] (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (deser-version-label coll))) input))

(clojure.core/defn- deser-next-token [input] (portkey.aws/unbox-xml-primitive-value input))

(clojure.core/defn- deser-managed-action-history-item [input] (clojure.core/let [letvar856847 {"ActionId" (portkey.aws/search-for-tag input "ActionId" :flattened? nil :xmlAttribute? nil), "ActionType" (portkey.aws/search-for-tag input "ActionType" :flattened? nil :xmlAttribute? nil), "ActionDescription" (portkey.aws/search-for-tag input "ActionDescription" :flattened? nil :xmlAttribute? nil), "FailureType" (portkey.aws/search-for-tag input "FailureType" :flattened? nil :xmlAttribute? nil), "Status" (portkey.aws/search-for-tag input "Status" :flattened? nil :xmlAttribute? nil), "FailureDescription" (portkey.aws/search-for-tag input "FailureDescription" :flattened? nil :xmlAttribute? nil), "ExecutedTime" (portkey.aws/search-for-tag input "ExecutedTime" :flattened? nil :xmlAttribute? nil), "FinishedTime" (portkey.aws/search-for-tag input "FinishedTime" :flattened? nil :xmlAttribute? nil)}] (clojure.core/cond-> {} (letvar856847 "ActionId") (clojure.core/assoc :action-id (deser-string (clojure.core/get-in letvar856847 ["ActionId" :content]))) (letvar856847 "ActionType") (clojure.core/assoc :action-type (deser-action-type (clojure.core/get-in letvar856847 ["ActionType" :content]))) (letvar856847 "ActionDescription") (clojure.core/assoc :action-description (deser-string (clojure.core/get-in letvar856847 ["ActionDescription" :content]))) (letvar856847 "FailureType") (clojure.core/assoc :failure-type (deser-failure-type (clojure.core/get-in letvar856847 ["FailureType" :content]))) (letvar856847 "Status") (clojure.core/assoc :status (deser-action-history-status (clojure.core/get-in letvar856847 ["Status" :content]))) (letvar856847 "FailureDescription") (clojure.core/assoc :failure-description (deser-string (clojure.core/get-in letvar856847 ["FailureDescription" :content]))) (letvar856847 "ExecutedTime") (clojure.core/assoc :executed-time (deser-timestamp (clojure.core/get-in letvar856847 ["ExecutedTime" :content]))) (letvar856847 "FinishedTime") (clojure.core/assoc :finished-time (deser-timestamp (clojure.core/get-in letvar856847 ["FinishedTime" :content]))))))

(clojure.core/defn- deser-environment-info-type [input] (clojure.core/get {"tail" :tail, "bundle" :bundle} (portkey.aws/unbox-xml-primitive-value input)))

(clojure.core/defn- deser-configuration-option-name [input] (portkey.aws/unbox-xml-primitive-value input))

(clojure.core/defn- deser-resource-id [input] (portkey.aws/unbox-xml-primitive-value input))

(clojure.core/defn- deser-platform-frameworks [input] (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (deser-platform-framework coll))) input))

(clojure.core/defn- deser-application-version-description-list [input] (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (deser-application-version-description coll))) input))

(clojure.core/defn- deser-resource-quotas [input] (clojure.core/let [letvar857004 {"ApplicationQuota" (portkey.aws/search-for-tag input "ApplicationQuota" :flattened? nil :xmlAttribute? nil), "ApplicationVersionQuota" (portkey.aws/search-for-tag input "ApplicationVersionQuota" :flattened? nil :xmlAttribute? nil), "EnvironmentQuota" (portkey.aws/search-for-tag input "EnvironmentQuota" :flattened? nil :xmlAttribute? nil), "ConfigurationTemplateQuota" (portkey.aws/search-for-tag input "ConfigurationTemplateQuota" :flattened? nil :xmlAttribute? nil), "CustomPlatformQuota" (portkey.aws/search-for-tag input "CustomPlatformQuota" :flattened? nil :xmlAttribute? nil)}] (clojure.core/cond-> {} (letvar857004 "ApplicationQuota") (clojure.core/assoc :application-quota (deser-resource-quota (clojure.core/get-in letvar857004 ["ApplicationQuota" :content]))) (letvar857004 "ApplicationVersionQuota") (clojure.core/assoc :application-version-quota (deser-resource-quota (clojure.core/get-in letvar857004 ["ApplicationVersionQuota" :content]))) (letvar857004 "EnvironmentQuota") (clojure.core/assoc :environment-quota (deser-resource-quota (clojure.core/get-in letvar857004 ["EnvironmentQuota" :content]))) (letvar857004 "ConfigurationTemplateQuota") (clojure.core/assoc :configuration-template-quota (deser-resource-quota (clojure.core/get-in letvar857004 ["ConfigurationTemplateQuota" :content]))) (letvar857004 "CustomPlatformQuota") (clojure.core/assoc :custom-platform-quota (deser-resource-quota (clojure.core/get-in letvar857004 ["CustomPlatformQuota" :content]))))))

(clojure.core/defn- deser-environment-arn [input] (portkey.aws/unbox-xml-primitive-value input))

(clojure.core/defn- deser-available-solution-stack-details-list [input] (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (deser-solution-stack-description coll))) input))

(clojure.core/defn- deser-tag-list [input] (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (deser-tag coll))) input))

(clojure.core/defn- deser-managed-action [input] (clojure.core/let [letvar857151 {"ActionId" (portkey.aws/search-for-tag input "ActionId" :flattened? nil :xmlAttribute? nil), "ActionDescription" (portkey.aws/search-for-tag input "ActionDescription" :flattened? nil :xmlAttribute? nil), "ActionType" (portkey.aws/search-for-tag input "ActionType" :flattened? nil :xmlAttribute? nil), "Status" (portkey.aws/search-for-tag input "Status" :flattened? nil :xmlAttribute? nil), "WindowStartTime" (portkey.aws/search-for-tag input "WindowStartTime" :flattened? nil :xmlAttribute? nil)}] (clojure.core/cond-> {} (letvar857151 "ActionId") (clojure.core/assoc :action-id (deser-string (clojure.core/get-in letvar857151 ["ActionId" :content]))) (letvar857151 "ActionDescription") (clojure.core/assoc :action-description (deser-string (clojure.core/get-in letvar857151 ["ActionDescription" :content]))) (letvar857151 "ActionType") (clojure.core/assoc :action-type (deser-action-type (clojure.core/get-in letvar857151 ["ActionType" :content]))) (letvar857151 "Status") (clojure.core/assoc :status (deser-action-status (clojure.core/get-in letvar857151 ["Status" :content]))) (letvar857151 "WindowStartTime") (clojure.core/assoc :window-start-time (deser-timestamp (clojure.core/get-in letvar857151 ["WindowStartTime" :content]))))))

(clojure.core/defn- deser-platform-owner [input] (portkey.aws/unbox-xml-primitive-value input))

(clojure.core/defn- deser-environment-resource-description [input] (clojure.core/let [letvar857264 {"EnvironmentName" (portkey.aws/search-for-tag input "EnvironmentName" :flattened? nil :xmlAttribute? nil), "AutoScalingGroups" (portkey.aws/search-for-tag input "AutoScalingGroups" :flattened? nil :xmlAttribute? nil), "Instances" (portkey.aws/search-for-tag input "Instances" :flattened? nil :xmlAttribute? nil), "LaunchConfigurations" (portkey.aws/search-for-tag input "LaunchConfigurations" :flattened? nil :xmlAttribute? nil), "LaunchTemplates" (portkey.aws/search-for-tag input "LaunchTemplates" :flattened? nil :xmlAttribute? nil), "LoadBalancers" (portkey.aws/search-for-tag input "LoadBalancers" :flattened? nil :xmlAttribute? nil), "Triggers" (portkey.aws/search-for-tag input "Triggers" :flattened? nil :xmlAttribute? nil), "Queues" (portkey.aws/search-for-tag input "Queues" :flattened? nil :xmlAttribute? nil)}] (clojure.core/cond-> {} (letvar857264 "EnvironmentName") (clojure.core/assoc :environment-name (deser-environment-name (clojure.core/get-in letvar857264 ["EnvironmentName" :content]))) (letvar857264 "AutoScalingGroups") (clojure.core/assoc :auto-scaling-groups (deser-auto-scaling-group-list (clojure.core/get-in letvar857264 ["AutoScalingGroups" :content]))) (letvar857264 "Instances") (clojure.core/assoc :instances (deser-instance-list (clojure.core/get-in letvar857264 ["Instances" :content]))) (letvar857264 "LaunchConfigurations") (clojure.core/assoc :launch-configurations (deser-launch-configuration-list (clojure.core/get-in letvar857264 ["LaunchConfigurations" :content]))) (letvar857264 "LaunchTemplates") (clojure.core/assoc :launch-templates (deser-launch-template-list (clojure.core/get-in letvar857264 ["LaunchTemplates" :content]))) (letvar857264 "LoadBalancers") (clojure.core/assoc :load-balancers (deser-load-balancer-list (clojure.core/get-in letvar857264 ["LoadBalancers" :content]))) (letvar857264 "Triggers") (clojure.core/assoc :triggers (deser-trigger-list (clojure.core/get-in letvar857264 ["Triggers" :content]))) (letvar857264 "Queues") (clojure.core/assoc :queues (deser-queue-list (clojure.core/get-in letvar857264 ["Queues" :content]))))))

(clojure.core/defn- deser-supported-addon [input] (portkey.aws/unbox-xml-primitive-value input))

(clojure.core/defn- deser-action-status [input] (clojure.core/get {"Scheduled" :scheduled, "Pending" :pending, "Running" :running, "Unknown" :unknown} (portkey.aws/unbox-xml-primitive-value input)))

(clojure.core/defn- deser-abortable-operation-in-progress [input] (clojure.core/when-let [boolstr__21591__auto__ (portkey.aws/unbox-xml-primitive-value input)] (clojure.core/cond (clojure.core/= "true" boolstr__21591__auto__) true (clojure.core/= "false" boolstr__21591__auto__) false)))

(clojure.core/defn- deser-causes [input] (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (deser-cause coll))) input))

(clojure.core/defn- deser-nullable-long [input] (java.lang.Long. (portkey.aws/unbox-xml-primitive-value input)))

(clojure.core/defn- deser-configuration-option-value-type [input] (clojure.core/get {"Scalar" :scalar, "List" :list} (portkey.aws/unbox-xml-primitive-value input)))

(clojure.core/defn- deser-application-version-status [input] (clojure.core/get {"Processed" :processed, "Unprocessed" :unprocessed, "Failed" :failed, "Processing" :processing, "Building" :building} (portkey.aws/unbox-xml-primitive-value input)))

(clojure.core/defn- deser-maintainer [input] (portkey.aws/unbox-xml-primitive-value input))

(clojure.core/defn- deser-description [input] (portkey.aws/unbox-xml-primitive-value input))

(clojure.core/defn- deser-tag-value [input] (portkey.aws/unbox-xml-primitive-value input))

(clojure.core/defn- deser-configuration-option-settings-list [input] (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (deser-configuration-option-setting coll))) input))

(clojure.core/defn- deser-configuration-option-setting [input] (clojure.core/let [letvar857445 {"ResourceName" (portkey.aws/search-for-tag input "ResourceName" :flattened? nil :xmlAttribute? nil), "Namespace" (portkey.aws/search-for-tag input "Namespace" :flattened? nil :xmlAttribute? nil), "OptionName" (portkey.aws/search-for-tag input "OptionName" :flattened? nil :xmlAttribute? nil), "Value" (portkey.aws/search-for-tag input "Value" :flattened? nil :xmlAttribute? nil)}] (clojure.core/cond-> {} (letvar857445 "ResourceName") (clojure.core/assoc :resource-name (deser-resource-name (clojure.core/get-in letvar857445 ["ResourceName" :content]))) (letvar857445 "Namespace") (clojure.core/assoc :namespace (deser-option-namespace (clojure.core/get-in letvar857445 ["Namespace" :content]))) (letvar857445 "OptionName") (clojure.core/assoc :option-name (deser-configuration-option-name (clojure.core/get-in letvar857445 ["OptionName" :content]))) (letvar857445 "Value") (clojure.core/assoc :value (deser-configuration-option-value (clojure.core/get-in letvar857445 ["Value" :content]))))))

(clojure.core/defn- deser-action-history-status [input] (clojure.core/get {"Completed" :completed, "Failed" :failed, "Unknown" :unknown} (portkey.aws/unbox-xml-primitive-value input)))

(clojure.core/defn- deser-environment-info-description-list [input] (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (deser-environment-info-description coll))) input))

(clojure.core/defn- deser-endpoint-url [input] (portkey.aws/unbox-xml-primitive-value input))

(clojure.core/defn- deser-builder [input] (clojure.core/let [letvar857580 {"ARN" (portkey.aws/search-for-tag input "ARN" :flattened? nil :xmlAttribute? nil)}] (clojure.core/cond-> {} (letvar857580 "ARN") (clojure.core/assoc :arn (deser-arn (clojure.core/get-in letvar857580 ["ARN" :content]))))))

(clojure.core/defn- deser-exception-message [input] (portkey.aws/unbox-xml-primitive-value input))

(clojure.core/defn- deser-message [input] (portkey.aws/unbox-xml-primitive-value input))

(clojure.core/defn- deser-max-count-rule [input] (clojure.core/let [letvar857698 {"Enabled" (portkey.aws/search-for-tag input "Enabled" :flattened? nil :xmlAttribute? nil), "MaxCount" (portkey.aws/search-for-tag input "MaxCount" :flattened? nil :xmlAttribute? nil), "DeleteSourceFromS3" (portkey.aws/search-for-tag input "DeleteSourceFromS3" :flattened? nil :xmlAttribute? nil)}] (clojure.core/cond-> {:enabled (deser-boxed-boolean (clojure.core/get-in letvar857698 ["Enabled" :content]))} (letvar857698 "MaxCount") (clojure.core/assoc :max-count (deser-boxed-int (clojure.core/get-in letvar857698 ["MaxCount" :content]))) (letvar857698 "DeleteSourceFromS3") (clojure.core/assoc :delete-source-from-s-3 (deser-boxed-boolean (clojure.core/get-in letvar857698 ["DeleteSourceFromS3" :content]))))))

(clojure.core/defn- deser-auto-scaling-group [input] (clojure.core/let [letvar857806 {"Name" (portkey.aws/search-for-tag input "Name" :flattened? nil :xmlAttribute? nil)}] (clojure.core/cond-> {} (letvar857806 "Name") (clojure.core/assoc :name (deser-resource-id (clojure.core/get-in letvar857806 ["Name" :content]))))))

(clojure.core/defn- deser-single-instance-health [input] (clojure.core/let [letvar857914 {"InstanceId" (portkey.aws/search-for-tag input "InstanceId" :flattened? nil :xmlAttribute? nil), "Deployment" (portkey.aws/search-for-tag input "Deployment" :flattened? nil :xmlAttribute? nil), "LaunchedAt" (portkey.aws/search-for-tag input "LaunchedAt" :flattened? nil :xmlAttribute? nil), "InstanceType" (portkey.aws/search-for-tag input "InstanceType" :flattened? nil :xmlAttribute? nil), "HealthStatus" (portkey.aws/search-for-tag input "HealthStatus" :flattened? nil :xmlAttribute? nil), "AvailabilityZone" (portkey.aws/search-for-tag input "AvailabilityZone" :flattened? nil :xmlAttribute? nil), "Causes" (portkey.aws/search-for-tag input "Causes" :flattened? nil :xmlAttribute? nil), "ApplicationMetrics" (portkey.aws/search-for-tag input "ApplicationMetrics" :flattened? nil :xmlAttribute? nil), "System" (portkey.aws/search-for-tag input "System" :flattened? nil :xmlAttribute? nil), "Color" (portkey.aws/search-for-tag input "Color" :flattened? nil :xmlAttribute? nil)}] (clojure.core/cond-> {} (letvar857914 "InstanceId") (clojure.core/assoc :instance-id (deser-instance-id (clojure.core/get-in letvar857914 ["InstanceId" :content]))) (letvar857914 "Deployment") (clojure.core/assoc :deployment (deser-deployment (clojure.core/get-in letvar857914 ["Deployment" :content]))) (letvar857914 "LaunchedAt") (clojure.core/assoc :launched-at (deser-launched-at (clojure.core/get-in letvar857914 ["LaunchedAt" :content]))) (letvar857914 "InstanceType") (clojure.core/assoc :instance-type (deser-string (clojure.core/get-in letvar857914 ["InstanceType" :content]))) (letvar857914 "HealthStatus") (clojure.core/assoc :health-status (deser-string (clojure.core/get-in letvar857914 ["HealthStatus" :content]))) (letvar857914 "AvailabilityZone") (clojure.core/assoc :availability-zone (deser-string (clojure.core/get-in letvar857914 ["AvailabilityZone" :content]))) (letvar857914 "Causes") (clojure.core/assoc :causes (deser-causes (clojure.core/get-in letvar857914 ["Causes" :content]))) (letvar857914 "ApplicationMetrics") (clojure.core/assoc :application-metrics (deser-application-metrics (clojure.core/get-in letvar857914 ["ApplicationMetrics" :content]))) (letvar857914 "System") (clojure.core/assoc :system (deser-system-status (clojure.core/get-in letvar857914 ["System" :content]))) (letvar857914 "Color") (clojure.core/assoc :color (deser-string (clojure.core/get-in letvar857914 ["Color" :content]))))))

(clojure.core/defn- deser-application-name [input] (portkey.aws/unbox-xml-primitive-value input))

(clojure.core/defn- deser-event-date [input] (portkey.aws/unbox-xml-primitive-value input))

(clojure.core/defn- deser-validation-message-string [input] (portkey.aws/unbox-xml-primitive-value input))

(clojure.core/defn- deser-platform-version [input] (portkey.aws/unbox-xml-primitive-value input))

(clojure.core/defn- deser-resource-name [input] (portkey.aws/unbox-xml-primitive-value input))

(clojure.core/defn- deser-integer [input] (java.lang.Integer. (portkey.aws/unbox-xml-primitive-value input)))

(clojure.core/defn- deser-string [input] (portkey.aws/unbox-xml-primitive-value input))

(clojure.core/defn- deser-platform-programming-languages [input] (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (deser-platform-programming-language coll))) input))

(clojure.core/defn- deser-application-metrics [input] (clojure.core/let [letvar858068 {"Duration" (portkey.aws/search-for-tag input "Duration" :flattened? nil :xmlAttribute? nil), "RequestCount" (portkey.aws/search-for-tag input "RequestCount" :flattened? nil :xmlAttribute? nil), "StatusCodes" (portkey.aws/search-for-tag input "StatusCodes" :flattened? nil :xmlAttribute? nil), "Latency" (portkey.aws/search-for-tag input "Latency" :flattened? nil :xmlAttribute? nil)}] (clojure.core/cond-> {} (letvar858068 "Duration") (clojure.core/assoc :duration (deser-nullable-integer (clojure.core/get-in letvar858068 ["Duration" :content]))) (letvar858068 "RequestCount") (clojure.core/assoc :request-count (deser-request-count (clojure.core/get-in letvar858068 ["RequestCount" :content]))) (letvar858068 "StatusCodes") (clojure.core/assoc :status-codes (deser-status-codes (clojure.core/get-in letvar858068 ["StatusCodes" :content]))) (letvar858068 "Latency") (clojure.core/assoc :latency (deser-latency (clojure.core/get-in letvar858068 ["Latency" :content]))))))

(clojure.core/defn- deser-operating-system-version [input] (portkey.aws/unbox-xml-primitive-value input))

(clojure.core/defn- deser-option-restriction-min-value [input] (java.lang.Integer. (portkey.aws/unbox-xml-primitive-value input)))

(clojure.core/defn- deser-status-codes [input] (clojure.core/let [letvar858183 {"Status2xx" (portkey.aws/search-for-tag input "Status2xx" :flattened? nil :xmlAttribute? nil), "Status3xx" (portkey.aws/search-for-tag input "Status3xx" :flattened? nil :xmlAttribute? nil), "Status4xx" (portkey.aws/search-for-tag input "Status4xx" :flattened? nil :xmlAttribute? nil), "Status5xx" (portkey.aws/search-for-tag input "Status5xx" :flattened? nil :xmlAttribute? nil)}] (clojure.core/cond-> {} (letvar858183 "Status2xx") (clojure.core/assoc :status-2xx (deser-nullable-integer (clojure.core/get-in letvar858183 ["Status2xx" :content]))) (letvar858183 "Status3xx") (clojure.core/assoc :status-3xx (deser-nullable-integer (clojure.core/get-in letvar858183 ["Status3xx" :content]))) (letvar858183 "Status4xx") (clojure.core/assoc :status-4xx (deser-nullable-integer (clojure.core/get-in letvar858183 ["Status4xx" :content]))) (letvar858183 "Status5xx") (clojure.core/assoc :status-5xx (deser-nullable-integer (clojure.core/get-in letvar858183 ["Status5xx" :content]))))))

(clojure.core/defn- deser-deployment-timestamp [input] (portkey.aws/unbox-xml-primitive-value input))

(clojure.core/defn- deser-update-date [input] (portkey.aws/unbox-xml-primitive-value input))

(clojure.core/defn- deser-listener [input] (clojure.core/let [letvar858295 {"Protocol" (portkey.aws/search-for-tag input "Protocol" :flattened? nil :xmlAttribute? nil), "Port" (portkey.aws/search-for-tag input "Port" :flattened? nil :xmlAttribute? nil)}] (clojure.core/cond-> {} (letvar858295 "Protocol") (clojure.core/assoc :protocol (deser-string (clojure.core/get-in letvar858295 ["Protocol" :content]))) (letvar858295 "Port") (clojure.core/assoc :port (deser-integer (clojure.core/get-in letvar858295 ["Port" :content]))))))

(clojure.core/defn- deser-s-3-key [input] (portkey.aws/unbox-xml-primitive-value input))

(clojure.core/defn- deser-configuration-option-possible-value [input] (portkey.aws/unbox-xml-primitive-value input))

(clojure.core/defn- deser-platform-summary-list [input] (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (deser-platform-summary coll))) input))

(clojure.core/defn- deser-failure-type [input] (clojure.core/get {"UpdateCancelled" :update-cancelled, "CancellationFailed" :cancellation-failed, "RollbackFailed" :rollback-failed, "RollbackSuccessful" :rollback-successful, "InternalFailure" :internal-failure, "InvalidEnvironmentState" :invalid-environment-state, "PermissionsError" :permissions-error} (portkey.aws/unbox-xml-primitive-value input)))

(clojure.core/defn- deser-platform-description [input] (clojure.core/let [letvar858435 {"SolutionStackName" (portkey.aws/search-for-tag input "SolutionStackName" :flattened? nil :xmlAttribute? nil), "PlatformName" (portkey.aws/search-for-tag input "PlatformName" :flattened? nil :xmlAttribute? nil), "SupportedAddonList" (portkey.aws/search-for-tag input "SupportedAddonList" :flattened? nil :xmlAttribute? nil), "OperatingSystemName" (portkey.aws/search-for-tag input "OperatingSystemName" :flattened? nil :xmlAttribute? nil), "DateUpdated" (portkey.aws/search-for-tag input "DateUpdated" :flattened? nil :xmlAttribute? nil), "SupportedTierList" (portkey.aws/search-for-tag input "SupportedTierList" :flattened? nil :xmlAttribute? nil), "PlatformCategory" (portkey.aws/search-for-tag input "PlatformCategory" :flattened? nil :xmlAttribute? nil), "ProgrammingLanguages" (portkey.aws/search-for-tag input "ProgrammingLanguages" :flattened? nil :xmlAttribute? nil), "PlatformOwner" (portkey.aws/search-for-tag input "PlatformOwner" :flattened? nil :xmlAttribute? nil), "DateCreated" (portkey.aws/search-for-tag input "DateCreated" :flattened? nil :xmlAttribute? nil), "Maintainer" (portkey.aws/search-for-tag input "Maintainer" :flattened? nil :xmlAttribute? nil), "Description" (portkey.aws/search-for-tag input "Description" :flattened? nil :xmlAttribute? nil), "PlatformVersion" (portkey.aws/search-for-tag input "PlatformVersion" :flattened? nil :xmlAttribute? nil), "OperatingSystemVersion" (portkey.aws/search-for-tag input "OperatingSystemVersion" :flattened? nil :xmlAttribute? nil), "PlatformStatus" (portkey.aws/search-for-tag input "PlatformStatus" :flattened? nil :xmlAttribute? nil), "PlatformArn" (portkey.aws/search-for-tag input "PlatformArn" :flattened? nil :xmlAttribute? nil), "Frameworks" (portkey.aws/search-for-tag input "Frameworks" :flattened? nil :xmlAttribute? nil), "CustomAmiList" (portkey.aws/search-for-tag input "CustomAmiList" :flattened? nil :xmlAttribute? nil)}] (clojure.core/cond-> {} (letvar858435 "SolutionStackName") (clojure.core/assoc :solution-stack-name (deser-solution-stack-name (clojure.core/get-in letvar858435 ["SolutionStackName" :content]))) (letvar858435 "PlatformName") (clojure.core/assoc :platform-name (deser-platform-name (clojure.core/get-in letvar858435 ["PlatformName" :content]))) (letvar858435 "SupportedAddonList") (clojure.core/assoc :supported-addon-list (deser-supported-addon-list (clojure.core/get-in letvar858435 ["SupportedAddonList" :content]))) (letvar858435 "OperatingSystemName") (clojure.core/assoc :operating-system-name (deser-operating-system-name (clojure.core/get-in letvar858435 ["OperatingSystemName" :content]))) (letvar858435 "DateUpdated") (clojure.core/assoc :date-updated (deser-update-date (clojure.core/get-in letvar858435 ["DateUpdated" :content]))) (letvar858435 "SupportedTierList") (clojure.core/assoc :supported-tier-list (deser-supported-tier-list (clojure.core/get-in letvar858435 ["SupportedTierList" :content]))) (letvar858435 "PlatformCategory") (clojure.core/assoc :platform-category (deser-platform-category (clojure.core/get-in letvar858435 ["PlatformCategory" :content]))) (letvar858435 "ProgrammingLanguages") (clojure.core/assoc :programming-languages (deser-platform-programming-languages (clojure.core/get-in letvar858435 ["ProgrammingLanguages" :content]))) (letvar858435 "PlatformOwner") (clojure.core/assoc :platform-owner (deser-platform-owner (clojure.core/get-in letvar858435 ["PlatformOwner" :content]))) (letvar858435 "DateCreated") (clojure.core/assoc :date-created (deser-creation-date (clojure.core/get-in letvar858435 ["DateCreated" :content]))) (letvar858435 "Maintainer") (clojure.core/assoc :maintainer (deser-maintainer (clojure.core/get-in letvar858435 ["Maintainer" :content]))) (letvar858435 "Description") (clojure.core/assoc :description (deser-description (clojure.core/get-in letvar858435 ["Description" :content]))) (letvar858435 "PlatformVersion") (clojure.core/assoc :platform-version (deser-platform-version (clojure.core/get-in letvar858435 ["PlatformVersion" :content]))) (letvar858435 "OperatingSystemVersion") (clojure.core/assoc :operating-system-version (deser-operating-system-version (clojure.core/get-in letvar858435 ["OperatingSystemVersion" :content]))) (letvar858435 "PlatformStatus") (clojure.core/assoc :platform-status (deser-platform-status (clojure.core/get-in letvar858435 ["PlatformStatus" :content]))) (letvar858435 "PlatformArn") (clojure.core/assoc :platform-arn (deser-platform-arn (clojure.core/get-in letvar858435 ["PlatformArn" :content]))) (letvar858435 "Frameworks") (clojure.core/assoc :frameworks (deser-platform-frameworks (clojure.core/get-in letvar858435 ["Frameworks" :content]))) (letvar858435 "CustomAmiList") (clojure.core/assoc :custom-ami-list (deser-custom-ami-list (clojure.core/get-in letvar858435 ["CustomAmiList" :content]))))))

(clojure.core/defn- deser-configuration-settings-description-list [input] (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (deser-configuration-settings-description coll))) input))

(clojure.core/defn- deser-event-description [input] (clojure.core/let [letvar858560 {"VersionLabel" (portkey.aws/search-for-tag input "VersionLabel" :flattened? nil :xmlAttribute? nil), "Severity" (portkey.aws/search-for-tag input "Severity" :flattened? nil :xmlAttribute? nil), "RequestId" (portkey.aws/search-for-tag input "RequestId" :flattened? nil :xmlAttribute? nil), "EnvironmentName" (portkey.aws/search-for-tag input "EnvironmentName" :flattened? nil :xmlAttribute? nil), "Message" (portkey.aws/search-for-tag input "Message" :flattened? nil :xmlAttribute? nil), "ApplicationName" (portkey.aws/search-for-tag input "ApplicationName" :flattened? nil :xmlAttribute? nil), "EventDate" (portkey.aws/search-for-tag input "EventDate" :flattened? nil :xmlAttribute? nil), "TemplateName" (portkey.aws/search-for-tag input "TemplateName" :flattened? nil :xmlAttribute? nil), "PlatformArn" (portkey.aws/search-for-tag input "PlatformArn" :flattened? nil :xmlAttribute? nil)}] (clojure.core/cond-> {} (letvar858560 "VersionLabel") (clojure.core/assoc :version-label (deser-version-label (clojure.core/get-in letvar858560 ["VersionLabel" :content]))) (letvar858560 "Severity") (clojure.core/assoc :severity (deser-event-severity (clojure.core/get-in letvar858560 ["Severity" :content]))) (letvar858560 "RequestId") (clojure.core/assoc :request-id (deser-request-id (clojure.core/get-in letvar858560 ["RequestId" :content]))) (letvar858560 "EnvironmentName") (clojure.core/assoc :environment-name (deser-environment-name (clojure.core/get-in letvar858560 ["EnvironmentName" :content]))) (letvar858560 "Message") (clojure.core/assoc :message (deser-event-message (clojure.core/get-in letvar858560 ["Message" :content]))) (letvar858560 "ApplicationName") (clojure.core/assoc :application-name (deser-application-name (clojure.core/get-in letvar858560 ["ApplicationName" :content]))) (letvar858560 "EventDate") (clojure.core/assoc :event-date (deser-event-date (clojure.core/get-in letvar858560 ["EventDate" :content]))) (letvar858560 "TemplateName") (clojure.core/assoc :template-name (deser-configuration-template-name (clojure.core/get-in letvar858560 ["TemplateName" :content]))) (letvar858560 "PlatformArn") (clojure.core/assoc :platform-arn (deser-platform-arn (clojure.core/get-in letvar858560 ["PlatformArn" :content]))))))

(clojure.core/defn- deser-s-3-location [input] (clojure.core/let [letvar858668 {"S3Bucket" (portkey.aws/search-for-tag input "S3Bucket" :flattened? nil :xmlAttribute? nil), "S3Key" (portkey.aws/search-for-tag input "S3Key" :flattened? nil :xmlAttribute? nil)}] (clojure.core/cond-> {} (letvar858668 "S3Bucket") (clojure.core/assoc :s-3-bucket (deser-s-3-bucket (clojure.core/get-in letvar858668 ["S3Bucket" :content]))) (letvar858668 "S3Key") (clojure.core/assoc :s-3-key (deser-s-3-key (clojure.core/get-in letvar858668 ["S3Key" :content]))))))

(clojure.core/defn- deser-managed-action-history-items [input] (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (deser-managed-action-history-item coll))) input))

(clojure.core/defn- deser-instance-list [input] (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (deser-instance coll))) input))

(clojure.core/defn- deser-launch-template-list [input] (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (deser-launch-template coll))) input))

(clojure.core/defn- deser-max-age-rule [input] (clojure.core/let [letvar858827 {"Enabled" (portkey.aws/search-for-tag input "Enabled" :flattened? nil :xmlAttribute? nil), "MaxAgeInDays" (portkey.aws/search-for-tag input "MaxAgeInDays" :flattened? nil :xmlAttribute? nil), "DeleteSourceFromS3" (portkey.aws/search-for-tag input "DeleteSourceFromS3" :flattened? nil :xmlAttribute? nil)}] (clojure.core/cond-> {:enabled (deser-boxed-boolean (clojure.core/get-in letvar858827 ["Enabled" :content]))} (letvar858827 "MaxAgeInDays") (clojure.core/assoc :max-age-in-days (deser-boxed-int (clojure.core/get-in letvar858827 ["MaxAgeInDays" :content]))) (letvar858827 "DeleteSourceFromS3") (clojure.core/assoc :delete-source-from-s-3 (deser-boxed-boolean (clojure.core/get-in letvar858827 ["DeleteSourceFromS3" :content]))))))

(clojure.core/defn- deser-s-3-bucket [input] (portkey.aws/unbox-xml-primitive-value input))

(clojure.core/defn- deser-refreshed-at [input] (portkey.aws/unbox-xml-primitive-value input))

(clojure.core/defn- deser-source-location [input] (portkey.aws/unbox-xml-primitive-value input))

(clojure.core/defn- deser-cpu-utilization [input] (clojure.core/let [letvar858947 {"User" (portkey.aws/search-for-tag input "User" :flattened? nil :xmlAttribute? nil), "Nice" (portkey.aws/search-for-tag input "Nice" :flattened? nil :xmlAttribute? nil), "System" (portkey.aws/search-for-tag input "System" :flattened? nil :xmlAttribute? nil), "Idle" (portkey.aws/search-for-tag input "Idle" :flattened? nil :xmlAttribute? nil), "IOWait" (portkey.aws/search-for-tag input "IOWait" :flattened? nil :xmlAttribute? nil), "IRQ" (portkey.aws/search-for-tag input "IRQ" :flattened? nil :xmlAttribute? nil), "SoftIRQ" (portkey.aws/search-for-tag input "SoftIRQ" :flattened? nil :xmlAttribute? nil), "Privileged" (portkey.aws/search-for-tag input "Privileged" :flattened? nil :xmlAttribute? nil)}] (clojure.core/cond-> {} (letvar858947 "User") (clojure.core/assoc :user (deser-nullable-double (clojure.core/get-in letvar858947 ["User" :content]))) (letvar858947 "Nice") (clojure.core/assoc :nice (deser-nullable-double (clojure.core/get-in letvar858947 ["Nice" :content]))) (letvar858947 "System") (clojure.core/assoc :system (deser-nullable-double (clojure.core/get-in letvar858947 ["System" :content]))) (letvar858947 "Idle") (clojure.core/assoc :idle (deser-nullable-double (clojure.core/get-in letvar858947 ["Idle" :content]))) (letvar858947 "IOWait") (clojure.core/assoc :io-wait (deser-nullable-double (clojure.core/get-in letvar858947 ["IOWait" :content]))) (letvar858947 "IRQ") (clojure.core/assoc :irq (deser-nullable-double (clojure.core/get-in letvar858947 ["IRQ" :content]))) (letvar858947 "SoftIRQ") (clojure.core/assoc :soft-irq (deser-nullable-double (clojure.core/get-in letvar858947 ["SoftIRQ" :content]))) (letvar858947 "Privileged") (clojure.core/assoc :privileged (deser-nullable-double (clojure.core/get-in letvar858947 ["Privileged" :content]))))))

(clojure.core/defn- deser-creation-date [input] (portkey.aws/unbox-xml-primitive-value input))

(clojure.core/defn- deser-option-restriction-regex [input] (clojure.core/let [letvar859057 {"Pattern" (portkey.aws/search-for-tag input "Pattern" :flattened? nil :xmlAttribute? nil), "Label" (portkey.aws/search-for-tag input "Label" :flattened? nil :xmlAttribute? nil)}] (clojure.core/cond-> {} (letvar859057 "Pattern") (clojure.core/assoc :pattern (deser-regex-pattern (clojure.core/get-in letvar859057 ["Pattern" :content]))) (letvar859057 "Label") (clojure.core/assoc :label (deser-regex-label (clojure.core/get-in letvar859057 ["Label" :content]))))))

(clojure.core/defn- deser-load-balancer [input] (clojure.core/let [letvar859165 {"Name" (portkey.aws/search-for-tag input "Name" :flattened? nil :xmlAttribute? nil)}] (clojure.core/cond-> {} (letvar859165 "Name") (clojure.core/assoc :name (deser-resource-id (clojure.core/get-in letvar859165 ["Name" :content]))))))

(clojure.core/defn- deser-option-restriction-max-length [input] (java.lang.Integer. (portkey.aws/unbox-xml-primitive-value input)))

(clojure.core/defn- deser-timestamp [input] (portkey.aws/unbox-xml-primitive-value input))

(clojure.core/defn- deser-launch-configuration [input] (clojure.core/let [letvar859277 {"Name" (portkey.aws/search-for-tag input "Name" :flattened? nil :xmlAttribute? nil)}] (clojure.core/cond-> {} (letvar859277 "Name") (clojure.core/assoc :name (deser-resource-id (clojure.core/get-in letvar859277 ["Name" :content]))))))

(clojure.core/defn- deser-virtualization-type [input] (portkey.aws/unbox-xml-primitive-value input))

(clojure.core/defn- deser-platform-status [input] (clojure.core/get {"Creating" :creating, "Failed" :failed, "Ready" :ready, "Deleting" :deleting, "Deleted" :deleted} (portkey.aws/unbox-xml-primitive-value input)))

(clojure.core/defn- deser-resource-arn [input] (portkey.aws/unbox-xml-primitive-value input))

(clojure.core/defn- deser-latency [input] (clojure.core/let [letvar859400 {"P999" (portkey.aws/search-for-tag input "P999" :flattened? nil :xmlAttribute? nil), "P99" (portkey.aws/search-for-tag input "P99" :flattened? nil :xmlAttribute? nil), "P95" (portkey.aws/search-for-tag input "P95" :flattened? nil :xmlAttribute? nil), "P90" (portkey.aws/search-for-tag input "P90" :flattened? nil :xmlAttribute? nil), "P85" (portkey.aws/search-for-tag input "P85" :flattened? nil :xmlAttribute? nil), "P75" (portkey.aws/search-for-tag input "P75" :flattened? nil :xmlAttribute? nil), "P50" (portkey.aws/search-for-tag input "P50" :flattened? nil :xmlAttribute? nil), "P10" (portkey.aws/search-for-tag input "P10" :flattened? nil :xmlAttribute? nil)}] (clojure.core/cond-> {} (letvar859400 "P999") (clojure.core/assoc :p-999 (deser-nullable-double (clojure.core/get-in letvar859400 ["P999" :content]))) (letvar859400 "P99") (clojure.core/assoc :p-99 (deser-nullable-double (clojure.core/get-in letvar859400 ["P99" :content]))) (letvar859400 "P95") (clojure.core/assoc :p-95 (deser-nullable-double (clojure.core/get-in letvar859400 ["P95" :content]))) (letvar859400 "P90") (clojure.core/assoc :p-90 (deser-nullable-double (clojure.core/get-in letvar859400 ["P90" :content]))) (letvar859400 "P85") (clojure.core/assoc :p-85 (deser-nullable-double (clojure.core/get-in letvar859400 ["P85" :content]))) (letvar859400 "P75") (clojure.core/assoc :p-75 (deser-nullable-double (clojure.core/get-in letvar859400 ["P75" :content]))) (letvar859400 "P50") (clojure.core/assoc :p-50 (deser-nullable-double (clojure.core/get-in letvar859400 ["P50" :content]))) (letvar859400 "P10") (clojure.core/assoc :p-10 (deser-nullable-double (clojure.core/get-in letvar859400 ["P10" :content]))))))

(clojure.core/defn- deser-configuration-option-possible-values [input] (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (deser-configuration-option-possible-value coll))) input))

(clojure.core/defn- deser-platform-arn [input] (portkey.aws/unbox-xml-primitive-value input))

(clojure.core/defn- deser-ec-2-instance-id [input] (portkey.aws/unbox-xml-primitive-value input))

(clojure.core/defn- deser-tag [input] (clojure.core/let [letvar859535 {"Key" (portkey.aws/search-for-tag input "Key" :flattened? nil :xmlAttribute? nil), "Value" (portkey.aws/search-for-tag input "Value" :flattened? nil :xmlAttribute? nil)}] (clojure.core/cond-> {} (letvar859535 "Key") (clojure.core/assoc :key (deser-tag-key (clojure.core/get-in letvar859535 ["Key" :content]))) (letvar859535 "Value") (clojure.core/assoc :value (deser-tag-value (clojure.core/get-in letvar859535 ["Value" :content]))))))

(clojure.core/defn- deser-solution-stack-file-type-list [input] (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (deser-file-type-extension coll))) input))

(clojure.core/defn- deser-environment-links [input] (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (deser-environment-link coll))) input))

(clojure.core/defn- deser-nullable-integer [input] (java.lang.Integer. (portkey.aws/unbox-xml-primitive-value input)))

(clojure.core/defn- deser-instance [input] (clojure.core/let [letvar859679 {"Id" (portkey.aws/search-for-tag input "Id" :flattened? nil :xmlAttribute? nil)}] (clojure.core/cond-> {} (letvar859679 "Id") (clojure.core/assoc :id (deser-resource-id (clojure.core/get-in letvar859679 ["Id" :content]))))))

(clojure.core/defn- deser-configuration-option-descriptions-list [input] (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (deser-configuration-option-description coll))) input))

(clojure.core/defn- deser-event-description-list [input] (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (deser-event-description coll))) input))

(clojure.core/defn- deser-load-average [input] (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (deser-load-average-value coll))) input))

(clojure.core/defn- deser-action-type [input] (clojure.core/get {"InstanceRefresh" :instance-refresh, "PlatformUpdate" :platform-update, "Unknown" :unknown} (portkey.aws/unbox-xml-primitive-value input)))

(clojure.core/defn- deser-application-version-description [input] (clojure.core/let [letvar859843 {"VersionLabel" (portkey.aws/search-for-tag input "VersionLabel" :flattened? nil :xmlAttribute? nil), "ApplicationVersionArn" (portkey.aws/search-for-tag input "ApplicationVersionArn" :flattened? nil :xmlAttribute? nil), "SourceBundle" (portkey.aws/search-for-tag input "SourceBundle" :flattened? nil :xmlAttribute? nil), "DateUpdated" (portkey.aws/search-for-tag input "DateUpdated" :flattened? nil :xmlAttribute? nil), "BuildArn" (portkey.aws/search-for-tag input "BuildArn" :flattened? nil :xmlAttribute? nil), "Status" (portkey.aws/search-for-tag input "Status" :flattened? nil :xmlAttribute? nil), "DateCreated" (portkey.aws/search-for-tag input "DateCreated" :flattened? nil :xmlAttribute? nil), "Description" (portkey.aws/search-for-tag input "Description" :flattened? nil :xmlAttribute? nil), "ApplicationName" (portkey.aws/search-for-tag input "ApplicationName" :flattened? nil :xmlAttribute? nil), "SourceBuildInformation" (portkey.aws/search-for-tag input "SourceBuildInformation" :flattened? nil :xmlAttribute? nil)}] (clojure.core/cond-> {} (letvar859843 "VersionLabel") (clojure.core/assoc :version-label (deser-version-label (clojure.core/get-in letvar859843 ["VersionLabel" :content]))) (letvar859843 "ApplicationVersionArn") (clojure.core/assoc :application-version-arn (deser-application-version-arn (clojure.core/get-in letvar859843 ["ApplicationVersionArn" :content]))) (letvar859843 "SourceBundle") (clojure.core/assoc :source-bundle (deser-s-3-location (clojure.core/get-in letvar859843 ["SourceBundle" :content]))) (letvar859843 "DateUpdated") (clojure.core/assoc :date-updated (deser-update-date (clojure.core/get-in letvar859843 ["DateUpdated" :content]))) (letvar859843 "BuildArn") (clojure.core/assoc :build-arn (deser-string (clojure.core/get-in letvar859843 ["BuildArn" :content]))) (letvar859843 "Status") (clojure.core/assoc :status (deser-application-version-status (clojure.core/get-in letvar859843 ["Status" :content]))) (letvar859843 "DateCreated") (clojure.core/assoc :date-created (deser-creation-date (clojure.core/get-in letvar859843 ["DateCreated" :content]))) (letvar859843 "Description") (clojure.core/assoc :description (deser-description (clojure.core/get-in letvar859843 ["Description" :content]))) (letvar859843 "ApplicationName") (clojure.core/assoc :application-name (deser-application-name (clojure.core/get-in letvar859843 ["ApplicationName" :content]))) (letvar859843 "SourceBuildInformation") (clojure.core/assoc :source-build-information (deser-source-build-information (clojure.core/get-in letvar859843 ["SourceBuildInformation" :content]))))))

(clojure.core/defn- deser-application-description-list [input] (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (deser-application-description coll))) input))

(clojure.core/defn- deser-configuration-option-default-value [input] (portkey.aws/unbox-xml-primitive-value input))

(clojure.core/defn- deser-configuration-settings-description [input] (clojure.core/let [letvar859973 {"SolutionStackName" (portkey.aws/search-for-tag input "SolutionStackName" :flattened? nil :xmlAttribute? nil), "DateUpdated" (portkey.aws/search-for-tag input "DateUpdated" :flattened? nil :xmlAttribute? nil), "EnvironmentName" (portkey.aws/search-for-tag input "EnvironmentName" :flattened? nil :xmlAttribute? nil), "OptionSettings" (portkey.aws/search-for-tag input "OptionSettings" :flattened? nil :xmlAttribute? nil), "DateCreated" (portkey.aws/search-for-tag input "DateCreated" :flattened? nil :xmlAttribute? nil), "Description" (portkey.aws/search-for-tag input "Description" :flattened? nil :xmlAttribute? nil), "ApplicationName" (portkey.aws/search-for-tag input "ApplicationName" :flattened? nil :xmlAttribute? nil), "TemplateName" (portkey.aws/search-for-tag input "TemplateName" :flattened? nil :xmlAttribute? nil), "DeploymentStatus" (portkey.aws/search-for-tag input "DeploymentStatus" :flattened? nil :xmlAttribute? nil), "PlatformArn" (portkey.aws/search-for-tag input "PlatformArn" :flattened? nil :xmlAttribute? nil)}] (clojure.core/cond-> {} (letvar859973 "SolutionStackName") (clojure.core/assoc :solution-stack-name (deser-solution-stack-name (clojure.core/get-in letvar859973 ["SolutionStackName" :content]))) (letvar859973 "DateUpdated") (clojure.core/assoc :date-updated (deser-update-date (clojure.core/get-in letvar859973 ["DateUpdated" :content]))) (letvar859973 "EnvironmentName") (clojure.core/assoc :environment-name (deser-environment-name (clojure.core/get-in letvar859973 ["EnvironmentName" :content]))) (letvar859973 "OptionSettings") (clojure.core/assoc :option-settings (deser-configuration-option-settings-list (clojure.core/get-in letvar859973 ["OptionSettings" :content]))) (letvar859973 "DateCreated") (clojure.core/assoc :date-created (deser-creation-date (clojure.core/get-in letvar859973 ["DateCreated" :content]))) (letvar859973 "Description") (clojure.core/assoc :description (deser-description (clojure.core/get-in letvar859973 ["Description" :content]))) (letvar859973 "ApplicationName") (clojure.core/assoc :application-name (deser-application-name (clojure.core/get-in letvar859973 ["ApplicationName" :content]))) (letvar859973 "TemplateName") (clojure.core/assoc :template-name (deser-configuration-template-name (clojure.core/get-in letvar859973 ["TemplateName" :content]))) (letvar859973 "DeploymentStatus") (clojure.core/assoc :deployment-status (deser-configuration-deployment-status (clojure.core/get-in letvar859973 ["DeploymentStatus" :content]))) (letvar859973 "PlatformArn") (clojure.core/assoc :platform-arn (deser-platform-arn (clojure.core/get-in letvar859973 ["PlatformArn" :content]))))))

(clojure.core/defn- deser-configuration-deployment-status [input] (clojure.core/get {"deployed" :deployed, "pending" :pending, "failed" :failed} (portkey.aws/unbox-xml-primitive-value input)))

(clojure.core/defn- deser-environment-resources-description [input] (clojure.core/let [letvar860086 {"LoadBalancer" (portkey.aws/search-for-tag input "LoadBalancer" :flattened? nil :xmlAttribute? nil)}] (clojure.core/cond-> {} (letvar860086 "LoadBalancer") (clojure.core/assoc :load-balancer (deser-load-balancer-description (clojure.core/get-in letvar860086 ["LoadBalancer" :content]))))))

(clojure.core/defn- deser-application-description [input] (clojure.core/let [letvar860194 {"ApplicationArn" (portkey.aws/search-for-tag input "ApplicationArn" :flattened? nil :xmlAttribute? nil), "ApplicationName" (portkey.aws/search-for-tag input "ApplicationName" :flattened? nil :xmlAttribute? nil), "Description" (portkey.aws/search-for-tag input "Description" :flattened? nil :xmlAttribute? nil), "DateCreated" (portkey.aws/search-for-tag input "DateCreated" :flattened? nil :xmlAttribute? nil), "DateUpdated" (portkey.aws/search-for-tag input "DateUpdated" :flattened? nil :xmlAttribute? nil), "Versions" (portkey.aws/search-for-tag input "Versions" :flattened? nil :xmlAttribute? nil), "ConfigurationTemplates" (portkey.aws/search-for-tag input "ConfigurationTemplates" :flattened? nil :xmlAttribute? nil), "ResourceLifecycleConfig" (portkey.aws/search-for-tag input "ResourceLifecycleConfig" :flattened? nil :xmlAttribute? nil)}] (clojure.core/cond-> {} (letvar860194 "ApplicationArn") (clojure.core/assoc :application-arn (deser-application-arn (clojure.core/get-in letvar860194 ["ApplicationArn" :content]))) (letvar860194 "ApplicationName") (clojure.core/assoc :application-name (deser-application-name (clojure.core/get-in letvar860194 ["ApplicationName" :content]))) (letvar860194 "Description") (clojure.core/assoc :description (deser-description (clojure.core/get-in letvar860194 ["Description" :content]))) (letvar860194 "DateCreated") (clojure.core/assoc :date-created (deser-creation-date (clojure.core/get-in letvar860194 ["DateCreated" :content]))) (letvar860194 "DateUpdated") (clojure.core/assoc :date-updated (deser-update-date (clojure.core/get-in letvar860194 ["DateUpdated" :content]))) (letvar860194 "Versions") (clojure.core/assoc :versions (deser-version-labels-list (clojure.core/get-in letvar860194 ["Versions" :content]))) (letvar860194 "ConfigurationTemplates") (clojure.core/assoc :configuration-templates (deser-configuration-template-names-list (clojure.core/get-in letvar860194 ["ConfigurationTemplates" :content]))) (letvar860194 "ResourceLifecycleConfig") (clojure.core/assoc :resource-lifecycle-config (deser-application-resource-lifecycle-config (clojure.core/get-in letvar860194 ["ResourceLifecycleConfig" :content]))))))

(clojure.core/defn- deser-environment-id [input] (portkey.aws/unbox-xml-primitive-value input))

(clojure.core/defn- deser-source-build-information [input] (clojure.core/let [letvar860307 {"SourceType" (portkey.aws/search-for-tag input "SourceType" :flattened? nil :xmlAttribute? nil), "SourceRepository" (portkey.aws/search-for-tag input "SourceRepository" :flattened? nil :xmlAttribute? nil), "SourceLocation" (portkey.aws/search-for-tag input "SourceLocation" :flattened? nil :xmlAttribute? nil)}] (clojure.core/cond-> {:source-type (deser-source-type (clojure.core/get-in letvar860307 ["SourceType" :content])), :source-repository (deser-source-repository (clojure.core/get-in letvar860307 ["SourceRepository" :content])), :source-location (deser-source-location (clojure.core/get-in letvar860307 ["SourceLocation" :content]))})))

(clojure.core/defn- deser-nullable-double [input] (java.lang.Double. (portkey.aws/unbox-xml-primitive-value input)))

(clojure.core/defn- deser-environment-description [input] (clojure.core/let [letvar860417 {"VersionLabel" (portkey.aws/search-for-tag input "VersionLabel" :flattened? nil :xmlAttribute? nil), "Tier" (portkey.aws/search-for-tag input "Tier" :flattened? nil :xmlAttribute? nil), "Health" (portkey.aws/search-for-tag input "Health" :flattened? nil :xmlAttribute? nil), "SolutionStackName" (portkey.aws/search-for-tag input "SolutionStackName" :flattened? nil :xmlAttribute? nil), "CNAME" (portkey.aws/search-for-tag input "CNAME" :flattened? nil :xmlAttribute? nil), "DateUpdated" (portkey.aws/search-for-tag input "DateUpdated" :flattened? nil :xmlAttribute? nil), "EnvironmentName" (portkey.aws/search-for-tag input "EnvironmentName" :flattened? nil :xmlAttribute? nil), "HealthStatus" (portkey.aws/search-for-tag input "HealthStatus" :flattened? nil :xmlAttribute? nil), "Status" (portkey.aws/search-for-tag input "Status" :flattened? nil :xmlAttribute? nil), "EnvironmentArn" (portkey.aws/search-for-tag input "EnvironmentArn" :flattened? nil :xmlAttribute? nil), "AbortableOperationInProgress" (portkey.aws/search-for-tag input "AbortableOperationInProgress" :flattened? nil :xmlAttribute? nil), "DateCreated" (portkey.aws/search-for-tag input "DateCreated" :flattened? nil :xmlAttribute? nil), "Description" (portkey.aws/search-for-tag input "Description" :flattened? nil :xmlAttribute? nil), "EndpointURL" (portkey.aws/search-for-tag input "EndpointURL" :flattened? nil :xmlAttribute? nil), "Resources" (portkey.aws/search-for-tag input "Resources" :flattened? nil :xmlAttribute? nil), "ApplicationName" (portkey.aws/search-for-tag input "ApplicationName" :flattened? nil :xmlAttribute? nil), "TemplateName" (portkey.aws/search-for-tag input "TemplateName" :flattened? nil :xmlAttribute? nil), "PlatformArn" (portkey.aws/search-for-tag input "PlatformArn" :flattened? nil :xmlAttribute? nil), "EnvironmentLinks" (portkey.aws/search-for-tag input "EnvironmentLinks" :flattened? nil :xmlAttribute? nil), "EnvironmentId" (portkey.aws/search-for-tag input "EnvironmentId" :flattened? nil :xmlAttribute? nil)}] (clojure.core/cond-> {} (letvar860417 "VersionLabel") (clojure.core/assoc :version-label (deser-version-label (clojure.core/get-in letvar860417 ["VersionLabel" :content]))) (letvar860417 "Tier") (clojure.core/assoc :tier (deser-environment-tier (clojure.core/get-in letvar860417 ["Tier" :content]))) (letvar860417 "Health") (clojure.core/assoc :health (deser-environment-health (clojure.core/get-in letvar860417 ["Health" :content]))) (letvar860417 "SolutionStackName") (clojure.core/assoc :solution-stack-name (deser-solution-stack-name (clojure.core/get-in letvar860417 ["SolutionStackName" :content]))) (letvar860417 "CNAME") (clojure.core/assoc :cname (deser-dns-cname (clojure.core/get-in letvar860417 ["CNAME" :content]))) (letvar860417 "DateUpdated") (clojure.core/assoc :date-updated (deser-update-date (clojure.core/get-in letvar860417 ["DateUpdated" :content]))) (letvar860417 "EnvironmentName") (clojure.core/assoc :environment-name (deser-environment-name (clojure.core/get-in letvar860417 ["EnvironmentName" :content]))) (letvar860417 "HealthStatus") (clojure.core/assoc :health-status (deser-environment-health-status (clojure.core/get-in letvar860417 ["HealthStatus" :content]))) (letvar860417 "Status") (clojure.core/assoc :status (deser-environment-status (clojure.core/get-in letvar860417 ["Status" :content]))) (letvar860417 "EnvironmentArn") (clojure.core/assoc :environment-arn (deser-environment-arn (clojure.core/get-in letvar860417 ["EnvironmentArn" :content]))) (letvar860417 "AbortableOperationInProgress") (clojure.core/assoc :abortable-operation-in-progress (deser-abortable-operation-in-progress (clojure.core/get-in letvar860417 ["AbortableOperationInProgress" :content]))) (letvar860417 "DateCreated") (clojure.core/assoc :date-created (deser-creation-date (clojure.core/get-in letvar860417 ["DateCreated" :content]))) (letvar860417 "Description") (clojure.core/assoc :description (deser-description (clojure.core/get-in letvar860417 ["Description" :content]))) (letvar860417 "EndpointURL") (clojure.core/assoc :endpoint-url (deser-endpoint-url (clojure.core/get-in letvar860417 ["EndpointURL" :content]))) (letvar860417 "Resources") (clojure.core/assoc :resources (deser-environment-resources-description (clojure.core/get-in letvar860417 ["Resources" :content]))) (letvar860417 "ApplicationName") (clojure.core/assoc :application-name (deser-application-name (clojure.core/get-in letvar860417 ["ApplicationName" :content]))) (letvar860417 "TemplateName") (clojure.core/assoc :template-name (deser-configuration-template-name (clojure.core/get-in letvar860417 ["TemplateName" :content]))) (letvar860417 "PlatformArn") (clojure.core/assoc :platform-arn (deser-platform-arn (clojure.core/get-in letvar860417 ["PlatformArn" :content]))) (letvar860417 "EnvironmentLinks") (clojure.core/assoc :environment-links (deser-environment-links (clojure.core/get-in letvar860417 ["EnvironmentLinks" :content]))) (letvar860417 "EnvironmentId") (clojure.core/assoc :environment-id (deser-environment-id (clojure.core/get-in letvar860417 ["EnvironmentId" :content]))))))

(clojure.core/defn- deser-configuration-template-name [input] (portkey.aws/unbox-xml-primitive-value input))

(clojure.core/defn- deser-load-balancer-listeners-description [input] (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (deser-listener coll))) input))

(clojure.core/defn- deser-available-solution-stack-names-list [input] (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (deser-solution-stack-name coll))) input))

(clojure.core/defn- deser-token [input] (portkey.aws/unbox-xml-primitive-value input))

(clojure.core/defn- deser-configuration-option-value [input] (portkey.aws/unbox-xml-primitive-value input))

(clojure.core/defn- deser-platform-programming-language [input] (clojure.core/let [letvar860574 {"Name" (portkey.aws/search-for-tag input "Name" :flattened? nil :xmlAttribute? nil), "Version" (portkey.aws/search-for-tag input "Version" :flattened? nil :xmlAttribute? nil)}] (clojure.core/cond-> {} (letvar860574 "Name") (clojure.core/assoc :name (deser-string (clojure.core/get-in letvar860574 ["Name" :content]))) (letvar860574 "Version") (clojure.core/assoc :version (deser-string (clojure.core/get-in letvar860574 ["Version" :content]))))))

(clojure.core/defn- deser-custom-ami-list [input] (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (deser-custom-ami coll))) input))

(clojure.core/defn- deser-queue-list [input] (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (deser-queue coll))) input))

(clojure.core/defn- deser-environment-health [input] (clojure.core/get {"Green" :green, "Yellow" :yellow, "Red" :red, "Grey" :grey} (portkey.aws/unbox-xml-primitive-value input)))

(clojure.core/defn- deser-environment-info-description [input] (clojure.core/let [letvar860721 {"InfoType" (portkey.aws/search-for-tag input "InfoType" :flattened? nil :xmlAttribute? nil), "Ec2InstanceId" (portkey.aws/search-for-tag input "Ec2InstanceId" :flattened? nil :xmlAttribute? nil), "SampleTimestamp" (portkey.aws/search-for-tag input "SampleTimestamp" :flattened? nil :xmlAttribute? nil), "Message" (portkey.aws/search-for-tag input "Message" :flattened? nil :xmlAttribute? nil)}] (clojure.core/cond-> {} (letvar860721 "InfoType") (clojure.core/assoc :info-type (deser-environment-info-type (clojure.core/get-in letvar860721 ["InfoType" :content]))) (letvar860721 "Ec2InstanceId") (clojure.core/assoc :ec-2-instance-id (deser-ec-2-instance-id (clojure.core/get-in letvar860721 ["Ec2InstanceId" :content]))) (letvar860721 "SampleTimestamp") (clojure.core/assoc :sample-timestamp (deser-sample-timestamp (clojure.core/get-in letvar860721 ["SampleTimestamp" :content]))) (letvar860721 "Message") (clojure.core/assoc :message (deser-message (clojure.core/get-in letvar860721 ["Message" :content]))))))

(clojure.core/defn- deser-trigger [input] (clojure.core/let [letvar860829 {"Name" (portkey.aws/search-for-tag input "Name" :flattened? nil :xmlAttribute? nil)}] (clojure.core/cond-> {} (letvar860829 "Name") (clojure.core/assoc :name (deser-resource-id (clojure.core/get-in letvar860829 ["Name" :content]))))))

(clojure.core/defn- deser-user-defined-option [input] (clojure.core/when-let [boolstr__21591__auto__ (portkey.aws/unbox-xml-primitive-value input)] (clojure.core/cond (clojure.core/= "true" boolstr__21591__auto__) true (clojure.core/= "false" boolstr__21591__auto__) false)))

(clojure.core/defn- deser-supported-tier [input] (portkey.aws/unbox-xml-primitive-value input))

(clojure.core/defn- deser-load-balancer-list [input] (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (deser-load-balancer coll))) input))

(clojure.core/defn- deser-launch-configuration-list [input] (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (deser-launch-configuration coll))) input))

(clojure.core/defn- deser-configuration-option-description [input] (clojure.core/let [letvar860978 {"UserDefined" (portkey.aws/search-for-tag input "UserDefined" :flattened? nil :xmlAttribute? nil), "MinValue" (portkey.aws/search-for-tag input "MinValue" :flattened? nil :xmlAttribute? nil), "MaxValue" (portkey.aws/search-for-tag input "MaxValue" :flattened? nil :xmlAttribute? nil), "ChangeSeverity" (portkey.aws/search-for-tag input "ChangeSeverity" :flattened? nil :xmlAttribute? nil), "MaxLength" (portkey.aws/search-for-tag input "MaxLength" :flattened? nil :xmlAttribute? nil), "Namespace" (portkey.aws/search-for-tag input "Namespace" :flattened? nil :xmlAttribute? nil), "ValueType" (portkey.aws/search-for-tag input "ValueType" :flattened? nil :xmlAttribute? nil), "Regex" (portkey.aws/search-for-tag input "Regex" :flattened? nil :xmlAttribute? nil), "ValueOptions" (portkey.aws/search-for-tag input "ValueOptions" :flattened? nil :xmlAttribute? nil), "DefaultValue" (portkey.aws/search-for-tag input "DefaultValue" :flattened? nil :xmlAttribute? nil), "Name" (portkey.aws/search-for-tag input "Name" :flattened? nil :xmlAttribute? nil)}] (clojure.core/cond-> {} (letvar860978 "UserDefined") (clojure.core/assoc :user-defined (deser-user-defined-option (clojure.core/get-in letvar860978 ["UserDefined" :content]))) (letvar860978 "MinValue") (clojure.core/assoc :min-value (deser-option-restriction-min-value (clojure.core/get-in letvar860978 ["MinValue" :content]))) (letvar860978 "MaxValue") (clojure.core/assoc :max-value (deser-option-restriction-max-value (clojure.core/get-in letvar860978 ["MaxValue" :content]))) (letvar860978 "ChangeSeverity") (clojure.core/assoc :change-severity (deser-configuration-option-severity (clojure.core/get-in letvar860978 ["ChangeSeverity" :content]))) (letvar860978 "MaxLength") (clojure.core/assoc :max-length (deser-option-restriction-max-length (clojure.core/get-in letvar860978 ["MaxLength" :content]))) (letvar860978 "Namespace") (clojure.core/assoc :namespace (deser-option-namespace (clojure.core/get-in letvar860978 ["Namespace" :content]))) (letvar860978 "ValueType") (clojure.core/assoc :value-type (deser-configuration-option-value-type (clojure.core/get-in letvar860978 ["ValueType" :content]))) (letvar860978 "Regex") (clojure.core/assoc :regex (deser-option-restriction-regex (clojure.core/get-in letvar860978 ["Regex" :content]))) (letvar860978 "ValueOptions") (clojure.core/assoc :value-options (deser-configuration-option-possible-values (clojure.core/get-in letvar860978 ["ValueOptions" :content]))) (letvar860978 "DefaultValue") (clojure.core/assoc :default-value (deser-configuration-option-default-value (clojure.core/get-in letvar860978 ["DefaultValue" :content]))) (letvar860978 "Name") (clojure.core/assoc :name (deser-configuration-option-name (clojure.core/get-in letvar860978 ["Name" :content]))))))

(clojure.core/defn- deser-system-status [input] (clojure.core/let [letvar861086 {"CPUUtilization" (portkey.aws/search-for-tag input "CPUUtilization" :flattened? nil :xmlAttribute? nil), "LoadAverage" (portkey.aws/search-for-tag input "LoadAverage" :flattened? nil :xmlAttribute? nil)}] (clojure.core/cond-> {} (letvar861086 "CPUUtilization") (clojure.core/assoc :cpu-utilization (deser-cpu-utilization (clojure.core/get-in letvar861086 ["CPUUtilization" :content]))) (letvar861086 "LoadAverage") (clojure.core/assoc :load-average (deser-load-average (clojure.core/get-in letvar861086 ["LoadAverage" :content]))))))

(clojure.core/defn- response-application-version-descriptions-message ([input] (response-application-version-descriptions-message nil input)) ([resultWrapper861088 input] (clojure.core/let [rawinput861087 (clojure.core/some-> input :body portkey.aws/parse-xml-body) letvar861089 {"ApplicationVersions" (portkey.aws/search-for-tag rawinput861087 "ApplicationVersions" :flattened? nil :result-wrapper resultWrapper861088), "NextToken" (portkey.aws/search-for-tag rawinput861087 "NextToken" :flattened? nil :result-wrapper resultWrapper861088)}] (clojure.core/cond-> {} (letvar861089 "ApplicationVersions") (clojure.core/assoc :application-versions (deser-application-version-description-list (clojure.core/get-in letvar861089 ["ApplicationVersions" :content]))) (letvar861089 "NextToken") (clojure.core/assoc :next-token (deser-token (clojure.core/get-in letvar861089 ["NextToken" :content])))))))

(clojure.core/defn- response-list-available-solution-stacks-result-message ([input] (response-list-available-solution-stacks-result-message nil input)) ([resultWrapper861091 input] (clojure.core/let [rawinput861090 (clojure.core/some-> input :body portkey.aws/parse-xml-body) letvar861092 {"SolutionStacks" (portkey.aws/search-for-tag rawinput861090 "SolutionStacks" :flattened? nil :result-wrapper resultWrapper861091), "SolutionStackDetails" (portkey.aws/search-for-tag rawinput861090 "SolutionStackDetails" :flattened? nil :result-wrapper resultWrapper861091)}] (clojure.core/cond-> {} (letvar861092 "SolutionStacks") (clojure.core/assoc :solution-stacks (deser-available-solution-stack-names-list (clojure.core/get-in letvar861092 ["SolutionStacks" :content]))) (letvar861092 "SolutionStackDetails") (clojure.core/assoc :solution-stack-details (deser-available-solution-stack-details-list (clojure.core/get-in letvar861092 ["SolutionStackDetails" :content])))))))

(clojure.core/defn- response-configuration-options-description ([input] (response-configuration-options-description nil input)) ([resultWrapper861094 input] (clojure.core/let [rawinput861093 (clojure.core/some-> input :body portkey.aws/parse-xml-body) letvar861095 {"SolutionStackName" (portkey.aws/search-for-tag rawinput861093 "SolutionStackName" :flattened? nil :result-wrapper resultWrapper861094), "PlatformArn" (portkey.aws/search-for-tag rawinput861093 "PlatformArn" :flattened? nil :result-wrapper resultWrapper861094), "Options" (portkey.aws/search-for-tag rawinput861093 "Options" :flattened? nil :result-wrapper resultWrapper861094)}] (clojure.core/cond-> {} (letvar861095 "SolutionStackName") (clojure.core/assoc :solution-stack-name (deser-solution-stack-name (clojure.core/get-in letvar861095 ["SolutionStackName" :content]))) (letvar861095 "PlatformArn") (clojure.core/assoc :platform-arn (deser-platform-arn (clojure.core/get-in letvar861095 ["PlatformArn" :content]))) (letvar861095 "Options") (clojure.core/assoc :options (deser-configuration-option-descriptions-list (clojure.core/get-in letvar861095 ["Options" :content])))))))

(clojure.core/defn- response-create-platform-version-result ([input] (response-create-platform-version-result nil input)) ([resultWrapper861097 input] (clojure.core/let [rawinput861096 (clojure.core/some-> input :body portkey.aws/parse-xml-body) letvar861098 {"PlatformSummary" (portkey.aws/search-for-tag rawinput861096 "PlatformSummary" :flattened? nil :result-wrapper resultWrapper861097), "Builder" (portkey.aws/search-for-tag rawinput861096 "Builder" :flattened? nil :result-wrapper resultWrapper861097)}] (clojure.core/cond-> {} (letvar861098 "PlatformSummary") (clojure.core/assoc :platform-summary (deser-platform-summary (clojure.core/get-in letvar861098 ["PlatformSummary" :content]))) (letvar861098 "Builder") (clojure.core/assoc :builder (deser-builder (clojure.core/get-in letvar861098 ["Builder" :content])))))))

(clojure.core/defn- response-invalid-request-exception ([input] (response-invalid-request-exception nil input)) ([resultWrapper861100 input] (clojure.core/let [rawinput861099 (clojure.core/some-> input :body portkey.aws/parse-xml-body) letvar861101 {}] (clojure.core/cond-> {}))))

(clojure.core/defn- response-insufficient-privileges-exception ([input] (response-insufficient-privileges-exception nil input)) ([resultWrapper861103 input] (clojure.core/let [rawinput861102 (clojure.core/some-> input :body portkey.aws/parse-xml-body) letvar861104 {}] (clojure.core/cond-> {}))))

(clojure.core/defn- response-describe-environment-managed-action-history-result ([input] (response-describe-environment-managed-action-history-result nil input)) ([resultWrapper861106 input] (clojure.core/let [rawinput861105 (clojure.core/some-> input :body portkey.aws/parse-xml-body) letvar861107 {"ManagedActionHistoryItems" (portkey.aws/search-for-tag rawinput861105 "ManagedActionHistoryItems" :flattened? nil :result-wrapper resultWrapper861106), "NextToken" (portkey.aws/search-for-tag rawinput861105 "NextToken" :flattened? nil :result-wrapper resultWrapper861106)}] (clojure.core/cond-> {} (letvar861107 "ManagedActionHistoryItems") (clojure.core/assoc :managed-action-history-items (deser-managed-action-history-items (clojure.core/get-in letvar861107 ["ManagedActionHistoryItems" :content]))) (letvar861107 "NextToken") (clojure.core/assoc :next-token (deser-string (clojure.core/get-in letvar861107 ["NextToken" :content])))))))

(clojure.core/defn- response-elastic-beanstalk-service-exception ([input] (response-elastic-beanstalk-service-exception nil input)) ([resultWrapper861109 input] (clojure.core/let [rawinput861108 (clojure.core/some-> input :body portkey.aws/parse-xml-body) letvar861110 {"message" (portkey.aws/search-for-tag rawinput861108 "message" :flattened? nil :result-wrapper resultWrapper861109)}] (clojure.core/cond-> {} (letvar861110 "message") (clojure.core/assoc :message (deser-exception-message (clojure.core/get-in letvar861110 ["message" :content])))))))

(clojure.core/defn- response-too-many-application-versions-exception ([input] (response-too-many-application-versions-exception nil input)) ([resultWrapper861112 input] (clojure.core/let [rawinput861111 (clojure.core/some-> input :body portkey.aws/parse-xml-body) letvar861113 {}] (clojure.core/cond-> {}))))

(clojure.core/defn- response-source-bundle-deletion-exception ([input] (response-source-bundle-deletion-exception nil input)) ([resultWrapper861115 input] (clojure.core/let [rawinput861114 (clojure.core/some-> input :body portkey.aws/parse-xml-body) letvar861116 {}] (clojure.core/cond-> {}))))

(clojure.core/defn- response-too-many-applications-exception ([input] (response-too-many-applications-exception nil input)) ([resultWrapper861118 input] (clojure.core/let [rawinput861117 (clojure.core/some-> input :body portkey.aws/parse-xml-body) letvar861119 {}] (clojure.core/cond-> {}))))

(clojure.core/defn- response-check-dns-availability-result-message ([input] (response-check-dns-availability-result-message nil input)) ([resultWrapper861121 input] (clojure.core/let [rawinput861120 (clojure.core/some-> input :body portkey.aws/parse-xml-body) letvar861122 {"Available" (portkey.aws/search-for-tag rawinput861120 "Available" :flattened? nil :result-wrapper resultWrapper861121), "FullyQualifiedCNAME" (portkey.aws/search-for-tag rawinput861120 "FullyQualifiedCNAME" :flattened? nil :result-wrapper resultWrapper861121)}] (clojure.core/cond-> {} (letvar861122 "Available") (clojure.core/assoc :available (deser-cname-availability (clojure.core/get-in letvar861122 ["Available" :content]))) (letvar861122 "FullyQualifiedCNAME") (clojure.core/assoc :fully-qualified-cname (deser-dns-cname (clojure.core/get-in letvar861122 ["FullyQualifiedCNAME" :content])))))))

(clojure.core/defn- response-application-description-message ([input] (response-application-description-message nil input)) ([resultWrapper861124 input] (clojure.core/let [rawinput861123 (clojure.core/some-> input :body portkey.aws/parse-xml-body) letvar861125 {"Application" (portkey.aws/search-for-tag rawinput861123 "Application" :flattened? nil :result-wrapper resultWrapper861124)}] (clojure.core/cond-> {} (letvar861125 "Application") (clojure.core/assoc :application (deser-application-description (clojure.core/get-in letvar861125 ["Application" :content])))))))

(clojure.core/defn- response-operation-in-progress-exception ([input] (response-operation-in-progress-exception nil input)) ([resultWrapper861127 input] (clojure.core/let [rawinput861126 (clojure.core/some-> input :body portkey.aws/parse-xml-body) letvar861128 {}] (clojure.core/cond-> {}))))

(clojure.core/defn- response-application-descriptions-message ([input] (response-application-descriptions-message nil input)) ([resultWrapper861130 input] (clojure.core/let [rawinput861129 (clojure.core/some-> input :body portkey.aws/parse-xml-body) letvar861131 {"Applications" (portkey.aws/search-for-tag rawinput861129 "Applications" :flattened? nil :result-wrapper resultWrapper861130)}] (clojure.core/cond-> {} (letvar861131 "Applications") (clojure.core/assoc :applications (deser-application-description-list (clojure.core/get-in letvar861131 ["Applications" :content])))))))

(clojure.core/defn- response-describe-environment-health-result ([input] (response-describe-environment-health-result nil input)) ([resultWrapper861133 input] (clojure.core/let [rawinput861132 (clojure.core/some-> input :body portkey.aws/parse-xml-body) letvar861134 {"EnvironmentName" (portkey.aws/search-for-tag rawinput861132 "EnvironmentName" :flattened? nil :result-wrapper resultWrapper861133), "HealthStatus" (portkey.aws/search-for-tag rawinput861132 "HealthStatus" :flattened? nil :result-wrapper resultWrapper861133), "Status" (portkey.aws/search-for-tag rawinput861132 "Status" :flattened? nil :result-wrapper resultWrapper861133), "Color" (portkey.aws/search-for-tag rawinput861132 "Color" :flattened? nil :result-wrapper resultWrapper861133), "Causes" (portkey.aws/search-for-tag rawinput861132 "Causes" :flattened? nil :result-wrapper resultWrapper861133), "ApplicationMetrics" (portkey.aws/search-for-tag rawinput861132 "ApplicationMetrics" :flattened? nil :result-wrapper resultWrapper861133), "InstancesHealth" (portkey.aws/search-for-tag rawinput861132 "InstancesHealth" :flattened? nil :result-wrapper resultWrapper861133), "RefreshedAt" (portkey.aws/search-for-tag rawinput861132 "RefreshedAt" :flattened? nil :result-wrapper resultWrapper861133)}] (clojure.core/cond-> {} (letvar861134 "EnvironmentName") (clojure.core/assoc :environment-name (deser-environment-name (clojure.core/get-in letvar861134 ["EnvironmentName" :content]))) (letvar861134 "HealthStatus") (clojure.core/assoc :health-status (deser-string (clojure.core/get-in letvar861134 ["HealthStatus" :content]))) (letvar861134 "Status") (clojure.core/assoc :status (deser-environment-health (clojure.core/get-in letvar861134 ["Status" :content]))) (letvar861134 "Color") (clojure.core/assoc :color (deser-string (clojure.core/get-in letvar861134 ["Color" :content]))) (letvar861134 "Causes") (clojure.core/assoc :causes (deser-causes (clojure.core/get-in letvar861134 ["Causes" :content]))) (letvar861134 "ApplicationMetrics") (clojure.core/assoc :application-metrics (deser-application-metrics (clojure.core/get-in letvar861134 ["ApplicationMetrics" :content]))) (letvar861134 "InstancesHealth") (clojure.core/assoc :instances-health (deser-instance-health-summary (clojure.core/get-in letvar861134 ["InstancesHealth" :content]))) (letvar861134 "RefreshedAt") (clojure.core/assoc :refreshed-at (deser-refreshed-at (clojure.core/get-in letvar861134 ["RefreshedAt" :content])))))))

(clojure.core/defn- response-environment-descriptions-message ([input] (response-environment-descriptions-message nil input)) ([resultWrapper861136 input] (clojure.core/let [rawinput861135 (clojure.core/some-> input :body portkey.aws/parse-xml-body) letvar861137 {"Environments" (portkey.aws/search-for-tag rawinput861135 "Environments" :flattened? nil :result-wrapper resultWrapper861136), "NextToken" (portkey.aws/search-for-tag rawinput861135 "NextToken" :flattened? nil :result-wrapper resultWrapper861136)}] (clojure.core/cond-> {} (letvar861137 "Environments") (clojure.core/assoc :environments (deser-environment-descriptions-list (clojure.core/get-in letvar861137 ["Environments" :content]))) (letvar861137 "NextToken") (clojure.core/assoc :next-token (deser-token (clojure.core/get-in letvar861137 ["NextToken" :content])))))))

(clojure.core/defn- response-too-many-platforms-exception ([input] (response-too-many-platforms-exception nil input)) ([resultWrapper861139 input] (clojure.core/let [rawinput861138 (clojure.core/some-> input :body portkey.aws/parse-xml-body) letvar861140 {}] (clojure.core/cond-> {}))))

(clojure.core/defn- response-too-many-environments-exception ([input] (response-too-many-environments-exception nil input)) ([resultWrapper861142 input] (clojure.core/let [rawinput861141 (clojure.core/some-> input :body portkey.aws/parse-xml-body) letvar861143 {}] (clojure.core/cond-> {}))))

(clojure.core/defn- response-describe-instances-health-result ([input] (response-describe-instances-health-result nil input)) ([resultWrapper861145 input] (clojure.core/let [rawinput861144 (clojure.core/some-> input :body portkey.aws/parse-xml-body) letvar861146 {"InstanceHealthList" (portkey.aws/search-for-tag rawinput861144 "InstanceHealthList" :flattened? nil :result-wrapper resultWrapper861145), "RefreshedAt" (portkey.aws/search-for-tag rawinput861144 "RefreshedAt" :flattened? nil :result-wrapper resultWrapper861145), "NextToken" (portkey.aws/search-for-tag rawinput861144 "NextToken" :flattened? nil :result-wrapper resultWrapper861145)}] (clojure.core/cond-> {} (letvar861146 "InstanceHealthList") (clojure.core/assoc :instance-health-list (deser-instance-health-list (clojure.core/get-in letvar861146 ["InstanceHealthList" :content]))) (letvar861146 "RefreshedAt") (clojure.core/assoc :refreshed-at (deser-refreshed-at (clojure.core/get-in letvar861146 ["RefreshedAt" :content]))) (letvar861146 "NextToken") (clojure.core/assoc :next-token (deser-next-token (clojure.core/get-in letvar861146 ["NextToken" :content])))))))

(clojure.core/defn- response-application-resource-lifecycle-description-message ([input] (response-application-resource-lifecycle-description-message nil input)) ([resultWrapper861148 input] (clojure.core/let [rawinput861147 (clojure.core/some-> input :body portkey.aws/parse-xml-body) letvar861149 {"ApplicationName" (portkey.aws/search-for-tag rawinput861147 "ApplicationName" :flattened? nil :result-wrapper resultWrapper861148), "ResourceLifecycleConfig" (portkey.aws/search-for-tag rawinput861147 "ResourceLifecycleConfig" :flattened? nil :result-wrapper resultWrapper861148)}] (clojure.core/cond-> {} (letvar861149 "ApplicationName") (clojure.core/assoc :application-name (deser-application-name (clojure.core/get-in letvar861149 ["ApplicationName" :content]))) (letvar861149 "ResourceLifecycleConfig") (clojure.core/assoc :resource-lifecycle-config (deser-application-resource-lifecycle-config (clojure.core/get-in letvar861149 ["ResourceLifecycleConfig" :content])))))))

(clojure.core/defn- response-resource-not-found-exception ([input] (response-resource-not-found-exception nil input)) ([resultWrapper861151 input] (clojure.core/let [rawinput861150 (clojure.core/some-> input :body portkey.aws/parse-xml-body) letvar861152 {}] (clojure.core/cond-> {}))))

(clojure.core/defn- response-too-many-buckets-exception ([input] (response-too-many-buckets-exception nil input)) ([resultWrapper861154 input] (clojure.core/let [rawinput861153 (clojure.core/some-> input :body portkey.aws/parse-xml-body) letvar861155 {}] (clojure.core/cond-> {}))))

(clojure.core/defn- response-retrieve-environment-info-result-message ([input] (response-retrieve-environment-info-result-message nil input)) ([resultWrapper861157 input] (clojure.core/let [rawinput861156 (clojure.core/some-> input :body portkey.aws/parse-xml-body) letvar861158 {"EnvironmentInfo" (portkey.aws/search-for-tag rawinput861156 "EnvironmentInfo" :flattened? nil :result-wrapper resultWrapper861157)}] (clojure.core/cond-> {} (letvar861158 "EnvironmentInfo") (clojure.core/assoc :environment-info (deser-environment-info-description-list (clojure.core/get-in letvar861158 ["EnvironmentInfo" :content])))))))

(clojure.core/defn- response-event-descriptions-message ([input] (response-event-descriptions-message nil input)) ([resultWrapper861160 input] (clojure.core/let [rawinput861159 (clojure.core/some-> input :body portkey.aws/parse-xml-body) letvar861161 {"Events" (portkey.aws/search-for-tag rawinput861159 "Events" :flattened? nil :result-wrapper resultWrapper861160), "NextToken" (portkey.aws/search-for-tag rawinput861159 "NextToken" :flattened? nil :result-wrapper resultWrapper861160)}] (clojure.core/cond-> {} (letvar861161 "Events") (clojure.core/assoc :events (deser-event-description-list (clojure.core/get-in letvar861161 ["Events" :content]))) (letvar861161 "NextToken") (clojure.core/assoc :next-token (deser-token (clojure.core/get-in letvar861161 ["NextToken" :content])))))))

(clojure.core/defn- response-application-version-description-message ([input] (response-application-version-description-message nil input)) ([resultWrapper861163 input] (clojure.core/let [rawinput861162 (clojure.core/some-> input :body portkey.aws/parse-xml-body) letvar861164 {"ApplicationVersion" (portkey.aws/search-for-tag rawinput861162 "ApplicationVersion" :flattened? nil :result-wrapper resultWrapper861163)}] (clojure.core/cond-> {} (letvar861164 "ApplicationVersion") (clojure.core/assoc :application-version (deser-application-version-description (clojure.core/get-in letvar861164 ["ApplicationVersion" :content])))))))

(clojure.core/defn- response-environment-resource-descriptions-message ([input] (response-environment-resource-descriptions-message nil input)) ([resultWrapper861166 input] (clojure.core/let [rawinput861165 (clojure.core/some-> input :body portkey.aws/parse-xml-body) letvar861167 {"EnvironmentResources" (portkey.aws/search-for-tag rawinput861165 "EnvironmentResources" :flattened? nil :result-wrapper resultWrapper861166)}] (clojure.core/cond-> {} (letvar861167 "EnvironmentResources") (clojure.core/assoc :environment-resources (deser-environment-resource-description (clojure.core/get-in letvar861167 ["EnvironmentResources" :content])))))))

(clojure.core/defn- response-describe-account-attributes-result ([input] (response-describe-account-attributes-result nil input)) ([resultWrapper861169 input] (clojure.core/let [rawinput861168 (clojure.core/some-> input :body portkey.aws/parse-xml-body) letvar861170 {"ResourceQuotas" (portkey.aws/search-for-tag rawinput861168 "ResourceQuotas" :flattened? nil :result-wrapper resultWrapper861169)}] (clojure.core/cond-> {} (letvar861170 "ResourceQuotas") (clojure.core/assoc :resource-quotas (deser-resource-quotas (clojure.core/get-in letvar861170 ["ResourceQuotas" :content])))))))

(clojure.core/defn- response-apply-environment-managed-action-result ([input] (response-apply-environment-managed-action-result nil input)) ([resultWrapper861172 input] (clojure.core/let [rawinput861171 (clojure.core/some-> input :body portkey.aws/parse-xml-body) letvar861173 {"ActionId" (portkey.aws/search-for-tag rawinput861171 "ActionId" :flattened? nil :result-wrapper resultWrapper861172), "ActionDescription" (portkey.aws/search-for-tag rawinput861171 "ActionDescription" :flattened? nil :result-wrapper resultWrapper861172), "ActionType" (portkey.aws/search-for-tag rawinput861171 "ActionType" :flattened? nil :result-wrapper resultWrapper861172), "Status" (portkey.aws/search-for-tag rawinput861171 "Status" :flattened? nil :result-wrapper resultWrapper861172)}] (clojure.core/cond-> {} (letvar861173 "ActionId") (clojure.core/assoc :action-id (deser-string (clojure.core/get-in letvar861173 ["ActionId" :content]))) (letvar861173 "ActionDescription") (clojure.core/assoc :action-description (deser-string (clojure.core/get-in letvar861173 ["ActionDescription" :content]))) (letvar861173 "ActionType") (clojure.core/assoc :action-type (deser-action-type (clojure.core/get-in letvar861173 ["ActionType" :content]))) (letvar861173 "Status") (clojure.core/assoc :status (deser-string (clojure.core/get-in letvar861173 ["Status" :content])))))))

(clojure.core/defn- response-code-build-not-in-service-region-exception ([input] (response-code-build-not-in-service-region-exception nil input)) ([resultWrapper861175 input] (clojure.core/let [rawinput861174 (clojure.core/some-> input :body portkey.aws/parse-xml-body) letvar861176 {}] (clojure.core/cond-> {}))))

(clojure.core/defn- response-too-many-tags-exception ([input] (response-too-many-tags-exception nil input)) ([resultWrapper861178 input] (clojure.core/let [rawinput861177 (clojure.core/some-> input :body portkey.aws/parse-xml-body) letvar861179 {}] (clojure.core/cond-> {}))))

(clojure.core/defn- response-configuration-settings-validation-messages ([input] (response-configuration-settings-validation-messages nil input)) ([resultWrapper861181 input] (clojure.core/let [rawinput861180 (clojure.core/some-> input :body portkey.aws/parse-xml-body) letvar861182 {"Messages" (portkey.aws/search-for-tag rawinput861180 "Messages" :flattened? nil :result-wrapper resultWrapper861181)}] (clojure.core/cond-> {} (letvar861182 "Messages") (clojure.core/assoc :messages (deser-validation-messages-list (clojure.core/get-in letvar861182 ["Messages" :content])))))))

(clojure.core/defn- response-managed-action-invalid-state-exception ([input] (response-managed-action-invalid-state-exception nil input)) ([resultWrapper861184 input] (clojure.core/let [rawinput861183 (clojure.core/some-> input :body portkey.aws/parse-xml-body) letvar861185 {}] (clojure.core/cond-> {}))))

(clojure.core/defn- response-s-3-subscription-required-exception ([input] (response-s-3-subscription-required-exception nil input)) ([resultWrapper861187 input] (clojure.core/let [rawinput861186 (clojure.core/some-> input :body portkey.aws/parse-xml-body) letvar861188 {}] (clojure.core/cond-> {}))))

(clojure.core/defn- response-describe-platform-version-result ([input] (response-describe-platform-version-result nil input)) ([resultWrapper861190 input] (clojure.core/let [rawinput861189 (clojure.core/some-> input :body portkey.aws/parse-xml-body) letvar861191 {"PlatformDescription" (portkey.aws/search-for-tag rawinput861189 "PlatformDescription" :flattened? nil :result-wrapper resultWrapper861190)}] (clojure.core/cond-> {} (letvar861191 "PlatformDescription") (clojure.core/assoc :platform-description (deser-platform-description (clojure.core/get-in letvar861191 ["PlatformDescription" :content])))))))

(clojure.core/defn- response-describe-environment-managed-actions-result ([input] (response-describe-environment-managed-actions-result nil input)) ([resultWrapper861193 input] (clojure.core/let [rawinput861192 (clojure.core/some-> input :body portkey.aws/parse-xml-body) letvar861194 {"ManagedActions" (portkey.aws/search-for-tag rawinput861192 "ManagedActions" :flattened? nil :result-wrapper resultWrapper861193)}] (clojure.core/cond-> {} (letvar861194 "ManagedActions") (clojure.core/assoc :managed-actions (deser-managed-actions (clojure.core/get-in letvar861194 ["ManagedActions" :content])))))))

(clojure.core/defn- response-platform-version-still-referenced-exception ([input] (response-platform-version-still-referenced-exception nil input)) ([resultWrapper861196 input] (clojure.core/let [rawinput861195 (clojure.core/some-> input :body portkey.aws/parse-xml-body) letvar861197 {}] (clojure.core/cond-> {}))))

(clojure.core/defn- response-s-3-location-not-in-service-region-exception ([input] (response-s-3-location-not-in-service-region-exception nil input)) ([resultWrapper861199 input] (clojure.core/let [rawinput861198 (clojure.core/some-> input :body portkey.aws/parse-xml-body) letvar861200 {}] (clojure.core/cond-> {}))))

(clojure.core/defn- response-configuration-settings-description ([input] (response-configuration-settings-description nil input)) ([resultWrapper861202 input] (clojure.core/let [rawinput861201 (clojure.core/some-> input :body portkey.aws/parse-xml-body) letvar861203 {"SolutionStackName" (portkey.aws/search-for-tag rawinput861201 "SolutionStackName" :flattened? nil :result-wrapper resultWrapper861202), "DateUpdated" (portkey.aws/search-for-tag rawinput861201 "DateUpdated" :flattened? nil :result-wrapper resultWrapper861202), "EnvironmentName" (portkey.aws/search-for-tag rawinput861201 "EnvironmentName" :flattened? nil :result-wrapper resultWrapper861202), "OptionSettings" (portkey.aws/search-for-tag rawinput861201 "OptionSettings" :flattened? nil :result-wrapper resultWrapper861202), "DateCreated" (portkey.aws/search-for-tag rawinput861201 "DateCreated" :flattened? nil :result-wrapper resultWrapper861202), "Description" (portkey.aws/search-for-tag rawinput861201 "Description" :flattened? nil :result-wrapper resultWrapper861202), "ApplicationName" (portkey.aws/search-for-tag rawinput861201 "ApplicationName" :flattened? nil :result-wrapper resultWrapper861202), "TemplateName" (portkey.aws/search-for-tag rawinput861201 "TemplateName" :flattened? nil :result-wrapper resultWrapper861202), "DeploymentStatus" (portkey.aws/search-for-tag rawinput861201 "DeploymentStatus" :flattened? nil :result-wrapper resultWrapper861202), "PlatformArn" (portkey.aws/search-for-tag rawinput861201 "PlatformArn" :flattened? nil :result-wrapper resultWrapper861202)}] (clojure.core/cond-> {} (letvar861203 "SolutionStackName") (clojure.core/assoc :solution-stack-name (deser-solution-stack-name (clojure.core/get-in letvar861203 ["SolutionStackName" :content]))) (letvar861203 "DateUpdated") (clojure.core/assoc :date-updated (deser-update-date (clojure.core/get-in letvar861203 ["DateUpdated" :content]))) (letvar861203 "EnvironmentName") (clojure.core/assoc :environment-name (deser-environment-name (clojure.core/get-in letvar861203 ["EnvironmentName" :content]))) (letvar861203 "OptionSettings") (clojure.core/assoc :option-settings (deser-configuration-option-settings-list (clojure.core/get-in letvar861203 ["OptionSettings" :content]))) (letvar861203 "DateCreated") (clojure.core/assoc :date-created (deser-creation-date (clojure.core/get-in letvar861203 ["DateCreated" :content]))) (letvar861203 "Description") (clojure.core/assoc :description (deser-description (clojure.core/get-in letvar861203 ["Description" :content]))) (letvar861203 "ApplicationName") (clojure.core/assoc :application-name (deser-application-name (clojure.core/get-in letvar861203 ["ApplicationName" :content]))) (letvar861203 "TemplateName") (clojure.core/assoc :template-name (deser-configuration-template-name (clojure.core/get-in letvar861203 ["TemplateName" :content]))) (letvar861203 "DeploymentStatus") (clojure.core/assoc :deployment-status (deser-configuration-deployment-status (clojure.core/get-in letvar861203 ["DeploymentStatus" :content]))) (letvar861203 "PlatformArn") (clojure.core/assoc :platform-arn (deser-platform-arn (clojure.core/get-in letvar861203 ["PlatformArn" :content])))))))

(clojure.core/defn- response-environment-description ([input] (response-environment-description nil input)) ([resultWrapper861205 input] (clojure.core/let [rawinput861204 (clojure.core/some-> input :body portkey.aws/parse-xml-body) letvar861206 {"VersionLabel" (portkey.aws/search-for-tag rawinput861204 "VersionLabel" :flattened? nil :result-wrapper resultWrapper861205), "Tier" (portkey.aws/search-for-tag rawinput861204 "Tier" :flattened? nil :result-wrapper resultWrapper861205), "Health" (portkey.aws/search-for-tag rawinput861204 "Health" :flattened? nil :result-wrapper resultWrapper861205), "SolutionStackName" (portkey.aws/search-for-tag rawinput861204 "SolutionStackName" :flattened? nil :result-wrapper resultWrapper861205), "CNAME" (portkey.aws/search-for-tag rawinput861204 "CNAME" :flattened? nil :result-wrapper resultWrapper861205), "DateUpdated" (portkey.aws/search-for-tag rawinput861204 "DateUpdated" :flattened? nil :result-wrapper resultWrapper861205), "EnvironmentName" (portkey.aws/search-for-tag rawinput861204 "EnvironmentName" :flattened? nil :result-wrapper resultWrapper861205), "HealthStatus" (portkey.aws/search-for-tag rawinput861204 "HealthStatus" :flattened? nil :result-wrapper resultWrapper861205), "Status" (portkey.aws/search-for-tag rawinput861204 "Status" :flattened? nil :result-wrapper resultWrapper861205), "EnvironmentArn" (portkey.aws/search-for-tag rawinput861204 "EnvironmentArn" :flattened? nil :result-wrapper resultWrapper861205), "AbortableOperationInProgress" (portkey.aws/search-for-tag rawinput861204 "AbortableOperationInProgress" :flattened? nil :result-wrapper resultWrapper861205), "DateCreated" (portkey.aws/search-for-tag rawinput861204 "DateCreated" :flattened? nil :result-wrapper resultWrapper861205), "Description" (portkey.aws/search-for-tag rawinput861204 "Description" :flattened? nil :result-wrapper resultWrapper861205), "EndpointURL" (portkey.aws/search-for-tag rawinput861204 "EndpointURL" :flattened? nil :result-wrapper resultWrapper861205), "Resources" (portkey.aws/search-for-tag rawinput861204 "Resources" :flattened? nil :result-wrapper resultWrapper861205), "ApplicationName" (portkey.aws/search-for-tag rawinput861204 "ApplicationName" :flattened? nil :result-wrapper resultWrapper861205), "TemplateName" (portkey.aws/search-for-tag rawinput861204 "TemplateName" :flattened? nil :result-wrapper resultWrapper861205), "PlatformArn" (portkey.aws/search-for-tag rawinput861204 "PlatformArn" :flattened? nil :result-wrapper resultWrapper861205), "EnvironmentLinks" (portkey.aws/search-for-tag rawinput861204 "EnvironmentLinks" :flattened? nil :result-wrapper resultWrapper861205), "EnvironmentId" (portkey.aws/search-for-tag rawinput861204 "EnvironmentId" :flattened? nil :result-wrapper resultWrapper861205)}] (clojure.core/cond-> {} (letvar861206 "VersionLabel") (clojure.core/assoc :version-label (deser-version-label (clojure.core/get-in letvar861206 ["VersionLabel" :content]))) (letvar861206 "Tier") (clojure.core/assoc :tier (deser-environment-tier (clojure.core/get-in letvar861206 ["Tier" :content]))) (letvar861206 "Health") (clojure.core/assoc :health (deser-environment-health (clojure.core/get-in letvar861206 ["Health" :content]))) (letvar861206 "SolutionStackName") (clojure.core/assoc :solution-stack-name (deser-solution-stack-name (clojure.core/get-in letvar861206 ["SolutionStackName" :content]))) (letvar861206 "CNAME") (clojure.core/assoc :cname (deser-dns-cname (clojure.core/get-in letvar861206 ["CNAME" :content]))) (letvar861206 "DateUpdated") (clojure.core/assoc :date-updated (deser-update-date (clojure.core/get-in letvar861206 ["DateUpdated" :content]))) (letvar861206 "EnvironmentName") (clojure.core/assoc :environment-name (deser-environment-name (clojure.core/get-in letvar861206 ["EnvironmentName" :content]))) (letvar861206 "HealthStatus") (clojure.core/assoc :health-status (deser-environment-health-status (clojure.core/get-in letvar861206 ["HealthStatus" :content]))) (letvar861206 "Status") (clojure.core/assoc :status (deser-environment-status (clojure.core/get-in letvar861206 ["Status" :content]))) (letvar861206 "EnvironmentArn") (clojure.core/assoc :environment-arn (deser-environment-arn (clojure.core/get-in letvar861206 ["EnvironmentArn" :content]))) (letvar861206 "AbortableOperationInProgress") (clojure.core/assoc :abortable-operation-in-progress (deser-abortable-operation-in-progress (clojure.core/get-in letvar861206 ["AbortableOperationInProgress" :content]))) (letvar861206 "DateCreated") (clojure.core/assoc :date-created (deser-creation-date (clojure.core/get-in letvar861206 ["DateCreated" :content]))) (letvar861206 "Description") (clojure.core/assoc :description (deser-description (clojure.core/get-in letvar861206 ["Description" :content]))) (letvar861206 "EndpointURL") (clojure.core/assoc :endpoint-url (deser-endpoint-url (clojure.core/get-in letvar861206 ["EndpointURL" :content]))) (letvar861206 "Resources") (clojure.core/assoc :resources (deser-environment-resources-description (clojure.core/get-in letvar861206 ["Resources" :content]))) (letvar861206 "ApplicationName") (clojure.core/assoc :application-name (deser-application-name (clojure.core/get-in letvar861206 ["ApplicationName" :content]))) (letvar861206 "TemplateName") (clojure.core/assoc :template-name (deser-configuration-template-name (clojure.core/get-in letvar861206 ["TemplateName" :content]))) (letvar861206 "PlatformArn") (clojure.core/assoc :platform-arn (deser-platform-arn (clojure.core/get-in letvar861206 ["PlatformArn" :content]))) (letvar861206 "EnvironmentLinks") (clojure.core/assoc :environment-links (deser-environment-links (clojure.core/get-in letvar861206 ["EnvironmentLinks" :content]))) (letvar861206 "EnvironmentId") (clojure.core/assoc :environment-id (deser-environment-id (clojure.core/get-in letvar861206 ["EnvironmentId" :content])))))))

(clojure.core/defn- response-delete-platform-version-result ([input] (response-delete-platform-version-result nil input)) ([resultWrapper861208 input] (clojure.core/let [rawinput861207 (clojure.core/some-> input :body portkey.aws/parse-xml-body) letvar861209 {"PlatformSummary" (portkey.aws/search-for-tag rawinput861207 "PlatformSummary" :flattened? nil :result-wrapper resultWrapper861208)}] (clojure.core/cond-> {} (letvar861209 "PlatformSummary") (clojure.core/assoc :platform-summary (deser-platform-summary (clojure.core/get-in letvar861209 ["PlatformSummary" :content])))))))

(clojure.core/defn- response-resource-type-not-supported-exception ([input] (response-resource-type-not-supported-exception nil input)) ([resultWrapper861211 input] (clojure.core/let [rawinput861210 (clojure.core/some-> input :body portkey.aws/parse-xml-body) letvar861212 {}] (clojure.core/cond-> {}))))

(clojure.core/defn- response-list-platform-versions-result ([input] (response-list-platform-versions-result nil input)) ([resultWrapper861214 input] (clojure.core/let [rawinput861213 (clojure.core/some-> input :body portkey.aws/parse-xml-body) letvar861215 {"PlatformSummaryList" (portkey.aws/search-for-tag rawinput861213 "PlatformSummaryList" :flattened? nil :result-wrapper resultWrapper861214), "NextToken" (portkey.aws/search-for-tag rawinput861213 "NextToken" :flattened? nil :result-wrapper resultWrapper861214)}] (clojure.core/cond-> {} (letvar861215 "PlatformSummaryList") (clojure.core/assoc :platform-summary-list (deser-platform-summary-list (clojure.core/get-in letvar861215 ["PlatformSummaryList" :content]))) (letvar861215 "NextToken") (clojure.core/assoc :next-token (deser-token (clojure.core/get-in letvar861215 ["NextToken" :content])))))))

(clojure.core/defn- response-too-many-configuration-templates-exception ([input] (response-too-many-configuration-templates-exception nil input)) ([resultWrapper861217 input] (clojure.core/let [rawinput861216 (clojure.core/some-> input :body portkey.aws/parse-xml-body) letvar861218 {}] (clojure.core/cond-> {}))))

(clojure.core/defn- response-resource-tags-description-message ([input] (response-resource-tags-description-message nil input)) ([resultWrapper861220 input] (clojure.core/let [rawinput861219 (clojure.core/some-> input :body portkey.aws/parse-xml-body) letvar861221 {"ResourceArn" (portkey.aws/search-for-tag rawinput861219 "ResourceArn" :flattened? nil :result-wrapper resultWrapper861220), "ResourceTags" (portkey.aws/search-for-tag rawinput861219 "ResourceTags" :flattened? nil :result-wrapper resultWrapper861220)}] (clojure.core/cond-> {} (letvar861221 "ResourceArn") (clojure.core/assoc :resource-arn (deser-resource-arn (clojure.core/get-in letvar861221 ["ResourceArn" :content]))) (letvar861221 "ResourceTags") (clojure.core/assoc :resource-tags (deser-tag-list (clojure.core/get-in letvar861221 ["ResourceTags" :content])))))))

(clojure.core/defn- response-create-storage-location-result-message ([input] (response-create-storage-location-result-message nil input)) ([resultWrapper861223 input] (clojure.core/let [rawinput861222 (clojure.core/some-> input :body portkey.aws/parse-xml-body) letvar861224 {"S3Bucket" (portkey.aws/search-for-tag rawinput861222 "S3Bucket" :flattened? nil :result-wrapper resultWrapper861223)}] (clojure.core/cond-> {} (letvar861224 "S3Bucket") (clojure.core/assoc :s-3-bucket (deser-s-3-bucket (clojure.core/get-in letvar861224 ["S3Bucket" :content])))))))

(clojure.core/defn- response-configuration-settings-descriptions ([input] (response-configuration-settings-descriptions nil input)) ([resultWrapper861226 input] (clojure.core/let [rawinput861225 (clojure.core/some-> input :body portkey.aws/parse-xml-body) letvar861227 {"ConfigurationSettings" (portkey.aws/search-for-tag rawinput861225 "ConfigurationSettings" :flattened? nil :result-wrapper resultWrapper861226)}] (clojure.core/cond-> {} (letvar861227 "ConfigurationSettings") (clojure.core/assoc :configuration-settings (deser-configuration-settings-description-list (clojure.core/get-in letvar861227 ["ConfigurationSettings" :content])))))))

(clojure.spec.alpha/def :portkey.aws.elasticbeanstalk.-2010-12-01.solution-stack-description/permitted-file-types (clojure.spec.alpha/and :portkey.aws.elasticbeanstalk.-2010-12-01/solution-stack-file-type-list))
(clojure.spec.alpha/def :portkey.aws.elasticbeanstalk.-2010-12-01/solution-stack-description (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.elasticbeanstalk.-2010-12-01/solution-stack-name :portkey.aws.elasticbeanstalk.-2010-12-01.solution-stack-description/permitted-file-types]))

(clojure.spec.alpha/def :portkey.aws.elasticbeanstalk.-2010-12-01/version-label (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__21076__auto__] (clojure.core/<= 1 (clojure.core/count s__21076__auto__))) (clojure.core/fn [s__21077__auto__] (clojure.core/< (clojure.core/count s__21077__auto__) 100))))

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

(clojure.spec.alpha/def :portkey.aws.elasticbeanstalk.-2010-12-01/instance-id (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__21076__auto__] (clojure.core/<= 1 (clojure.core/count s__21076__auto__))) (clojure.core/fn [s__21077__auto__] (clojure.core/< (clojure.core/count s__21077__auto__) 255))))

(clojure.spec.alpha/def :portkey.aws.elasticbeanstalk.-2010-12-01/platform-filter-value-list (clojure.spec.alpha/coll-of :portkey.aws.elasticbeanstalk.-2010-12-01/platform-filter-value))

(clojure.spec.alpha/def :portkey.aws.elasticbeanstalk.-2010-12-01/configuration-template-names-list (clojure.spec.alpha/coll-of :portkey.aws.elasticbeanstalk.-2010-12-01/configuration-template-name))

(clojure.spec.alpha/def :portkey.aws.elasticbeanstalk.-2010-12-01.configuration-options-description/options (clojure.spec.alpha/and :portkey.aws.elasticbeanstalk.-2010-12-01/configuration-option-descriptions-list))
(clojure.spec.alpha/def :portkey.aws.elasticbeanstalk.-2010-12-01/configuration-options-description (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.elasticbeanstalk.-2010-12-01/solution-stack-name :portkey.aws.elasticbeanstalk.-2010-12-01/platform-arn :portkey.aws.elasticbeanstalk.-2010-12-01.configuration-options-description/options]))

(clojure.spec.alpha/def :portkey.aws.elasticbeanstalk.-2010-12-01/describe-environment-resources-message (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.elasticbeanstalk.-2010-12-01/environment-id :portkey.aws.elasticbeanstalk.-2010-12-01/environment-name]))

(clojure.spec.alpha/def :portkey.aws.elasticbeanstalk.-2010-12-01/cause (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__21076__auto__] (clojure.core/<= 1 (clojure.core/count s__21076__auto__))) (clojure.core/fn [s__21077__auto__] (clojure.core/< (clojure.core/count s__21077__auto__) 255))))

(clojure.spec.alpha/def :portkey.aws.elasticbeanstalk.-2010-12-01/cname-availability clojure.core/boolean?)

(clojure.spec.alpha/def :portkey.aws.elasticbeanstalk.-2010-12-01/boxed-int clojure.core/int?)

(clojure.spec.alpha/def :portkey.aws.elasticbeanstalk.-2010-12-01.update-application-resource-lifecycle-message/resource-lifecycle-config (clojure.spec.alpha/and :portkey.aws.elasticbeanstalk.-2010-12-01/application-resource-lifecycle-config))
(clojure.spec.alpha/def :portkey.aws.elasticbeanstalk.-2010-12-01/update-application-resource-lifecycle-message (clojure.spec.alpha/keys :req-un [:portkey.aws.elasticbeanstalk.-2010-12-01/application-name :portkey.aws.elasticbeanstalk.-2010-12-01.update-application-resource-lifecycle-message/resource-lifecycle-config] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.elasticbeanstalk.-2010-12-01/file-type-extension (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__21076__auto__] (clojure.core/<= 1 (clojure.core/count s__21076__auto__))) (clojure.core/fn [s__21077__auto__] (clojure.core/< (clojure.core/count s__21077__auto__) 100))))

(clojure.spec.alpha/def :portkey.aws.elasticbeanstalk.-2010-12-01/non-empty-string (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__21078__auto__] (clojure.core/re-matches #".*\S.*" s__21078__auto__))))

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

(clojure.spec.alpha/def :portkey.aws.elasticbeanstalk.-2010-12-01/environment-name (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__21076__auto__] (clojure.core/<= 4 (clojure.core/count s__21076__auto__))) (clojure.core/fn [s__21077__auto__] (clojure.core/< (clojure.core/count s__21077__auto__) 40))))

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

(clojure.spec.alpha/def :portkey.aws.elasticbeanstalk.-2010-12-01/dns-cname (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__21076__auto__] (clojure.core/<= 1 (clojure.core/count s__21076__auto__))) (clojure.core/fn [s__21077__auto__] (clojure.core/< (clojure.core/count s__21077__auto__) 255))))

(clojure.spec.alpha/def :portkey.aws.elasticbeanstalk.-2010-12-01/max-records (clojure.spec.alpha/int-in 1 1000))

(clojure.spec.alpha/def :portkey.aws.elasticbeanstalk.-2010-12-01/tag-key (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__21076__auto__] (clojure.core/<= 1 (clojure.core/count s__21076__auto__))) (clojure.core/fn [s__21077__auto__] (clojure.core/< (clojure.core/count s__21077__auto__) 128))))

(clojure.spec.alpha/def :portkey.aws.elasticbeanstalk.-2010-12-01.launch-template/id (clojure.spec.alpha/and :portkey.aws.elasticbeanstalk.-2010-12-01/resource-id))
(clojure.spec.alpha/def :portkey.aws.elasticbeanstalk.-2010-12-01/launch-template (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.elasticbeanstalk.-2010-12-01.launch-template/id]))

(clojure.spec.alpha/def :portkey.aws.elasticbeanstalk.-2010-12-01/environment-descriptions-list (clojure.spec.alpha/coll-of :portkey.aws.elasticbeanstalk.-2010-12-01/environment-description))

(clojure.spec.alpha/def :portkey.aws.elasticbeanstalk.-2010-12-01/application-version-lifecycle-config (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.elasticbeanstalk.-2010-12-01/max-count-rule :portkey.aws.elasticbeanstalk.-2010-12-01/max-age-rule]))

(clojure.spec.alpha/def :portkey.aws.elasticbeanstalk.-2010-12-01.create-application-message/resource-lifecycle-config (clojure.spec.alpha/and :portkey.aws.elasticbeanstalk.-2010-12-01/application-resource-lifecycle-config))
(clojure.spec.alpha/def :portkey.aws.elasticbeanstalk.-2010-12-01/create-application-message (clojure.spec.alpha/keys :req-un [:portkey.aws.elasticbeanstalk.-2010-12-01/application-name] :opt-un [:portkey.aws.elasticbeanstalk.-2010-12-01/description :portkey.aws.elasticbeanstalk.-2010-12-01.create-application-message/resource-lifecycle-config]))

(clojure.spec.alpha/def :portkey.aws.elasticbeanstalk.-2010-12-01/tags (clojure.spec.alpha/coll-of :portkey.aws.elasticbeanstalk.-2010-12-01/tag))

(clojure.spec.alpha/def :portkey.aws.elasticbeanstalk.-2010-12-01/instance-health-list (clojure.spec.alpha/coll-of :portkey.aws.elasticbeanstalk.-2010-12-01/single-instance-health))

(clojure.spec.alpha/def :portkey.aws.elasticbeanstalk.-2010-12-01/dns-cname-prefix (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__21076__auto__] (clojure.core/<= 4 (clojure.core/count s__21076__auto__))) (clojure.core/fn [s__21077__auto__] (clojure.core/< (clojure.core/count s__21077__auto__) 63))))

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

(clojure.spec.alpha/def :portkey.aws.elasticbeanstalk.-2010-12-01/group-name (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__21076__auto__] (clojure.core/<= 1 (clojure.core/count s__21076__auto__))) (clojure.core/fn [s__21077__auto__] (clojure.core/< (clojure.core/count s__21077__auto__) 19))))

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

(clojure.spec.alpha/def :portkey.aws.elasticbeanstalk.-2010-12-01/next-token (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__21076__auto__] (clojure.core/<= 1 (clojure.core/count s__21076__auto__))) (clojure.core/fn [s__21077__auto__] (clojure.core/< (clojure.core/count s__21077__auto__) 100))))

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
(clojure.spec.alpha/def :portkey.aws.elasticbeanstalk.-2010-12-01.environment-resource-description/launch-templates (clojure.spec.alpha/and :portkey.aws.elasticbeanstalk.-2010-12-01/launch-template-list))
(clojure.spec.alpha/def :portkey.aws.elasticbeanstalk.-2010-12-01.environment-resource-description/load-balancers (clojure.spec.alpha/and :portkey.aws.elasticbeanstalk.-2010-12-01/load-balancer-list))
(clojure.spec.alpha/def :portkey.aws.elasticbeanstalk.-2010-12-01.environment-resource-description/triggers (clojure.spec.alpha/and :portkey.aws.elasticbeanstalk.-2010-12-01/trigger-list))
(clojure.spec.alpha/def :portkey.aws.elasticbeanstalk.-2010-12-01.environment-resource-description/queues (clojure.spec.alpha/and :portkey.aws.elasticbeanstalk.-2010-12-01/queue-list))
(clojure.spec.alpha/def :portkey.aws.elasticbeanstalk.-2010-12-01/environment-resource-description (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.elasticbeanstalk.-2010-12-01/environment-name :portkey.aws.elasticbeanstalk.-2010-12-01.environment-resource-description/auto-scaling-groups :portkey.aws.elasticbeanstalk.-2010-12-01.environment-resource-description/instances :portkey.aws.elasticbeanstalk.-2010-12-01.environment-resource-description/launch-configurations :portkey.aws.elasticbeanstalk.-2010-12-01.environment-resource-description/launch-templates :portkey.aws.elasticbeanstalk.-2010-12-01.environment-resource-description/load-balancers :portkey.aws.elasticbeanstalk.-2010-12-01.environment-resource-description/triggers :portkey.aws.elasticbeanstalk.-2010-12-01.environment-resource-description/queues]))

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

(clojure.spec.alpha/def :portkey.aws.elasticbeanstalk.-2010-12-01/description (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__21077__auto__] (clojure.core/< (clojure.core/count s__21077__auto__) 200))))

(clojure.spec.alpha/def :portkey.aws.elasticbeanstalk.-2010-12-01/tag-value (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__21076__auto__] (clojure.core/<= 1 (clojure.core/count s__21076__auto__))) (clojure.core/fn [s__21077__auto__] (clojure.core/< (clojure.core/count s__21077__auto__) 256))))

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

(clojure.spec.alpha/def :portkey.aws.elasticbeanstalk.-2010-12-01/application-name (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__21076__auto__] (clojure.core/<= 1 (clojure.core/count s__21076__auto__))) (clojure.core/fn [s__21077__auto__] (clojure.core/< (clojure.core/count s__21077__auto__) 100))))

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

(clojure.spec.alpha/def :portkey.aws.elasticbeanstalk.-2010-12-01/resource-name (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__21076__auto__] (clojure.core/<= 1 (clojure.core/count s__21076__auto__))) (clojure.core/fn [s__21077__auto__] (clojure.core/< (clojure.core/count s__21077__auto__) 256))))

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

(clojure.spec.alpha/def :portkey.aws.elasticbeanstalk.-2010-12-01/s-3-key (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__21077__auto__] (clojure.core/< (clojure.core/count s__21077__auto__) 1024))))

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

(clojure.spec.alpha/def :portkey.aws.elasticbeanstalk.-2010-12-01/launch-template-list (clojure.spec.alpha/coll-of :portkey.aws.elasticbeanstalk.-2010-12-01/launch-template))

(clojure.spec.alpha/def :portkey.aws.elasticbeanstalk.-2010-12-01.configuration-settings-validation-messages/messages (clojure.spec.alpha/and :portkey.aws.elasticbeanstalk.-2010-12-01/validation-messages-list))
(clojure.spec.alpha/def :portkey.aws.elasticbeanstalk.-2010-12-01/configuration-settings-validation-messages (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.elasticbeanstalk.-2010-12-01.configuration-settings-validation-messages/messages]))

(clojure.spec.alpha/def :portkey.aws.elasticbeanstalk.-2010-12-01.max-age-rule/enabled (clojure.spec.alpha/and :portkey.aws.elasticbeanstalk.-2010-12-01/boxed-boolean))
(clojure.spec.alpha/def :portkey.aws.elasticbeanstalk.-2010-12-01.max-age-rule/max-age-in-days (clojure.spec.alpha/and :portkey.aws.elasticbeanstalk.-2010-12-01/boxed-int))
(clojure.spec.alpha/def :portkey.aws.elasticbeanstalk.-2010-12-01.max-age-rule/delete-source-from-s-3 (clojure.spec.alpha/and :portkey.aws.elasticbeanstalk.-2010-12-01/boxed-boolean))
(clojure.spec.alpha/def :portkey.aws.elasticbeanstalk.-2010-12-01/max-age-rule (clojure.spec.alpha/keys :req-un [:portkey.aws.elasticbeanstalk.-2010-12-01.max-age-rule/enabled] :opt-un [:portkey.aws.elasticbeanstalk.-2010-12-01.max-age-rule/max-age-in-days :portkey.aws.elasticbeanstalk.-2010-12-01.max-age-rule/delete-source-from-s-3]))

(clojure.spec.alpha/def :portkey.aws.elasticbeanstalk.-2010-12-01/s-3-bucket (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__21077__auto__] (clojure.core/< (clojure.core/count s__21077__auto__) 255))))

(clojure.spec.alpha/def :portkey.aws.elasticbeanstalk.-2010-12-01.validate-configuration-settings-message/template-name (clojure.spec.alpha/and :portkey.aws.elasticbeanstalk.-2010-12-01/configuration-template-name))
(clojure.spec.alpha/def :portkey.aws.elasticbeanstalk.-2010-12-01.validate-configuration-settings-message/option-settings (clojure.spec.alpha/and :portkey.aws.elasticbeanstalk.-2010-12-01/configuration-option-settings-list))
(clojure.spec.alpha/def :portkey.aws.elasticbeanstalk.-2010-12-01/validate-configuration-settings-message (clojure.spec.alpha/keys :req-un [:portkey.aws.elasticbeanstalk.-2010-12-01/application-name :portkey.aws.elasticbeanstalk.-2010-12-01.validate-configuration-settings-message/option-settings] :opt-un [:portkey.aws.elasticbeanstalk.-2010-12-01.validate-configuration-settings-message/template-name :portkey.aws.elasticbeanstalk.-2010-12-01/environment-name]))

(clojure.spec.alpha/def :portkey.aws.elasticbeanstalk.-2010-12-01/refreshed-at clojure.core/inst?)

(clojure.spec.alpha/def :portkey.aws.elasticbeanstalk.-2010-12-01/source-location (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__21076__auto__] (clojure.core/<= 3 (clojure.core/count s__21076__auto__))) (clojure.core/fn [s__21077__auto__] (clojure.core/< (clojure.core/count s__21077__auto__) 255)) (clojure.core/fn [s__21078__auto__] (clojure.core/re-matches #".+/.+" s__21078__auto__))))

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

(clojure.spec.alpha/def :portkey.aws.elasticbeanstalk.-2010-12-01/configuration-template-name (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__21076__auto__] (clojure.core/<= 1 (clojure.core/count s__21076__auto__))) (clojure.core/fn [s__21077__auto__] (clojure.core/< (clojure.core/count s__21077__auto__) 100))))

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

(clojure.core/defn create-application-version "Creates an application version for the specified application. You can create an\napplication version from a source bundle in Amazon S3, a commit in AWS\nCodeCommit, or the output of an AWS CodeBuild build as follows:\n Specify a commit in an AWS CodeCommit repository with SourceBuildInformation.\n Specify a build in an AWS CodeBuild with SourceBuildInformation and\nBuildConfiguration.\n Specify a source bundle in S3 with SourceBundle\n Omit both SourceBuildInformation and SourceBundle to use the default sample\napplication.\n Once you create an application version with a specified Amazon S3 bucket and\nkey location, you cannot change that Amazon S3 location. If you change the\nAmazon S3 location, you receive an exception when you attempt to launch an\nenvironment from the application version." ([create-application-version-messageinput] (clojure.core/let [request-function-result__22119__auto__ (req-create-application-version-message create-application-version-messageinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__22119__auto__ {:http.request.configuration/endpoints portkey.aws.elasticbeanstalk.-2010-12-01/endpoints, :http.request.configuration/target-prefix nil, :http.request.spec/output-spec :portkey.aws.elasticbeanstalk.-2010-12-01/application-version-description-message, :http.request.configuration/mime-type {"content-type" "application/x-www-form-urlencoded; charset=utf-8"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2010-12-01", :http.request.configuration/service-id "Elastic Beanstalk", :http.request.spec/input-spec :portkey.aws.elasticbeanstalk.-2010-12-01/create-application-version-message, :http.request.configuration/protocol "query", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper "CreateApplicationVersionResult", :http.request.configuration/action "CreateApplicationVersion", :http.request.configuration/output-deser-fn response-application-version-description-message, :http.request.spec/error-spec {"TooManyApplicationsException" :portkey.aws.elasticbeanstalk.-2010-12-01/too-many-applications-exception, "TooManyApplicationVersionsException" :portkey.aws.elasticbeanstalk.-2010-12-01/too-many-application-versions-exception, "InsufficientPrivilegesException" :portkey.aws.elasticbeanstalk.-2010-12-01/insufficient-privileges-exception, "S3LocationNotInServiceRegionException" :portkey.aws.elasticbeanstalk.-2010-12-01/s-3-location-not-in-service-region-exception, "CodeBuildNotInServiceRegionException" :portkey.aws.elasticbeanstalk.-2010-12-01/code-build-not-in-service-region-exception}})))))
(clojure.spec.alpha/fdef create-application-version :args (clojure.spec.alpha/tuple :portkey.aws.elasticbeanstalk.-2010-12-01/create-application-version-message) :ret (clojure.spec.alpha/and :portkey.aws.elasticbeanstalk.-2010-12-01/application-version-description-message))

(clojure.core/defn update-environment "Updates the environment description, deploys a new application version, updates\nthe configuration settings to an entirely new configuration template, or updates\nselect configuration option values in the running environment.\n Attempting to update both the release and configuration is not allowed and AWS\nElastic Beanstalk returns an InvalidParameterCombination error.\n When updating the configuration settings to a new template or individual\nsettings, a draft configuration is created and DescribeConfigurationSettings for\nthis environment returns two setting descriptions with different\nDeploymentStatus values." ([] (update-environment {})) ([update-environment-messageinput] (clojure.core/let [request-function-result__22119__auto__ (req-update-environment-message update-environment-messageinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__22119__auto__ {:http.request.configuration/endpoints portkey.aws.elasticbeanstalk.-2010-12-01/endpoints, :http.request.configuration/target-prefix nil, :http.request.spec/output-spec :portkey.aws.elasticbeanstalk.-2010-12-01/environment-description, :http.request.configuration/mime-type {"content-type" "application/x-www-form-urlencoded; charset=utf-8"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2010-12-01", :http.request.configuration/service-id "Elastic Beanstalk", :http.request.spec/input-spec :portkey.aws.elasticbeanstalk.-2010-12-01/update-environment-message, :http.request.configuration/protocol "query", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper "UpdateEnvironmentResult", :http.request.configuration/action "UpdateEnvironment", :http.request.configuration/output-deser-fn response-environment-description, :http.request.spec/error-spec {"InsufficientPrivilegesException" :portkey.aws.elasticbeanstalk.-2010-12-01/insufficient-privileges-exception, "TooManyBucketsException" :portkey.aws.elasticbeanstalk.-2010-12-01/too-many-buckets-exception}})))))
(clojure.spec.alpha/fdef update-environment :args (clojure.spec.alpha/? :portkey.aws.elasticbeanstalk.-2010-12-01/update-environment-message) :ret (clojure.spec.alpha/and :portkey.aws.elasticbeanstalk.-2010-12-01/environment-description))

(clojure.core/defn update-tags-for-resource "Update the list of tags applied to an AWS Elastic Beanstalk resource. Two lists\ncan be passed: TagsToAdd for tags to add or update, and TagsToRemove.\n Currently, Elastic Beanstalk only supports tagging of Elastic Beanstalk\nenvironments. For details about environment tagging, see Tagging Resources in\nYour Elastic Beanstalk Environment\n(http://docs.aws.amazon.com/elasticbeanstalk/latest/dg/using-features.tagging.html).\n If you create a custom IAM user policy to control permission to this operation,\nspecify one of the following two virtual actions (or both) instead of the API\noperation name:\n elasticbeanstalk:AddTags\n Controls permission to call UpdateTagsForResource and pass a list of tags to\nadd in the TagsToAdd parameter.\n elasticbeanstalk:RemoveTags\n Controls permission to call UpdateTagsForResource and pass a list of tag keys\nto remove in the TagsToRemove parameter.\n For details about creating a custom user policy, see Creating a Custom User\nPolicy\n(http://docs.aws.amazon.com/elasticbeanstalk/latest/dg/AWSHowTo.iam.managed-policies.html#AWSHowTo.iam.policies)." ([update-tags-for-resource-messageinput] (clojure.core/let [request-function-result__22119__auto__ (req-update-tags-for-resource-message update-tags-for-resource-messageinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__22119__auto__ {:http.request.configuration/endpoints portkey.aws.elasticbeanstalk.-2010-12-01/endpoints, :http.request.configuration/target-prefix nil, :http.request.spec/output-spec nil, :http.request.configuration/mime-type {"content-type" "application/x-www-form-urlencoded; charset=utf-8"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2010-12-01", :http.request.configuration/service-id "Elastic Beanstalk", :http.request.spec/input-spec :portkey.aws.elasticbeanstalk.-2010-12-01/update-tags-for-resource-message, :http.request.configuration/protocol "query", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "UpdateTagsForResource", :http.request.configuration/output-deser-fn (clojure.core/fn [& args__22118__auto__] {}), :http.request.spec/error-spec {"InsufficientPrivilegesException" :portkey.aws.elasticbeanstalk.-2010-12-01/insufficient-privileges-exception, "OperationInProgressException" :portkey.aws.elasticbeanstalk.-2010-12-01/operation-in-progress-exception, "TooManyTagsException" :portkey.aws.elasticbeanstalk.-2010-12-01/too-many-tags-exception, "ResourceNotFoundException" :portkey.aws.elasticbeanstalk.-2010-12-01/resource-not-found-exception, "ResourceTypeNotSupportedException" :portkey.aws.elasticbeanstalk.-2010-12-01/resource-type-not-supported-exception}})))))
(clojure.spec.alpha/fdef update-tags-for-resource :args (clojure.spec.alpha/tuple :portkey.aws.elasticbeanstalk.-2010-12-01/update-tags-for-resource-message) :ret clojure.core/true?)

(clojure.core/defn describe-platform-version "Describes the version of the platform." ([] (describe-platform-version {})) ([describe-platform-version-requestinput] (clojure.core/let [request-function-result__22119__auto__ (req-describe-platform-version-request describe-platform-version-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__22119__auto__ {:http.request.configuration/endpoints portkey.aws.elasticbeanstalk.-2010-12-01/endpoints, :http.request.configuration/target-prefix nil, :http.request.spec/output-spec :portkey.aws.elasticbeanstalk.-2010-12-01/describe-platform-version-result, :http.request.configuration/mime-type {"content-type" "application/x-www-form-urlencoded; charset=utf-8"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2010-12-01", :http.request.configuration/service-id "Elastic Beanstalk", :http.request.spec/input-spec :portkey.aws.elasticbeanstalk.-2010-12-01/describe-platform-version-request, :http.request.configuration/protocol "query", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper "DescribePlatformVersionResult", :http.request.configuration/action "DescribePlatformVersion", :http.request.configuration/output-deser-fn response-describe-platform-version-result, :http.request.spec/error-spec {"InsufficientPrivilegesException" :portkey.aws.elasticbeanstalk.-2010-12-01/insufficient-privileges-exception, "ElasticBeanstalkServiceException" :portkey.aws.elasticbeanstalk.-2010-12-01/elastic-beanstalk-service-exception}})))))
(clojure.spec.alpha/fdef describe-platform-version :args (clojure.spec.alpha/? :portkey.aws.elasticbeanstalk.-2010-12-01/describe-platform-version-request) :ret (clojure.spec.alpha/and :portkey.aws.elasticbeanstalk.-2010-12-01/describe-platform-version-result))

(clojure.core/defn create-platform-version "Create a new version of your custom platform." ([create-platform-version-requestinput] (clojure.core/let [request-function-result__22119__auto__ (req-create-platform-version-request create-platform-version-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__22119__auto__ {:http.request.configuration/endpoints portkey.aws.elasticbeanstalk.-2010-12-01/endpoints, :http.request.configuration/target-prefix nil, :http.request.spec/output-spec :portkey.aws.elasticbeanstalk.-2010-12-01/create-platform-version-result, :http.request.configuration/mime-type {"content-type" "application/x-www-form-urlencoded; charset=utf-8"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2010-12-01", :http.request.configuration/service-id "Elastic Beanstalk", :http.request.spec/input-spec :portkey.aws.elasticbeanstalk.-2010-12-01/create-platform-version-request, :http.request.configuration/protocol "query", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper "CreatePlatformVersionResult", :http.request.configuration/action "CreatePlatformVersion", :http.request.configuration/output-deser-fn response-create-platform-version-result, :http.request.spec/error-spec {"InsufficientPrivilegesException" :portkey.aws.elasticbeanstalk.-2010-12-01/insufficient-privileges-exception, "ElasticBeanstalkServiceException" :portkey.aws.elasticbeanstalk.-2010-12-01/elastic-beanstalk-service-exception, "TooManyPlatformsException" :portkey.aws.elasticbeanstalk.-2010-12-01/too-many-platforms-exception}})))))
(clojure.spec.alpha/fdef create-platform-version :args (clojure.spec.alpha/tuple :portkey.aws.elasticbeanstalk.-2010-12-01/create-platform-version-request) :ret (clojure.spec.alpha/and :portkey.aws.elasticbeanstalk.-2010-12-01/create-platform-version-result))

(clojure.core/defn create-environment "Launches an environment for the specified application using the specified\nconfiguration." ([create-environment-messageinput] (clojure.core/let [request-function-result__22119__auto__ (req-create-environment-message create-environment-messageinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__22119__auto__ {:http.request.configuration/endpoints portkey.aws.elasticbeanstalk.-2010-12-01/endpoints, :http.request.configuration/target-prefix nil, :http.request.spec/output-spec :portkey.aws.elasticbeanstalk.-2010-12-01/environment-description, :http.request.configuration/mime-type {"content-type" "application/x-www-form-urlencoded; charset=utf-8"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2010-12-01", :http.request.configuration/service-id "Elastic Beanstalk", :http.request.spec/input-spec :portkey.aws.elasticbeanstalk.-2010-12-01/create-environment-message, :http.request.configuration/protocol "query", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper "CreateEnvironmentResult", :http.request.configuration/action "CreateEnvironment", :http.request.configuration/output-deser-fn response-environment-description, :http.request.spec/error-spec {"TooManyEnvironmentsException" :portkey.aws.elasticbeanstalk.-2010-12-01/too-many-environments-exception, "InsufficientPrivilegesException" :portkey.aws.elasticbeanstalk.-2010-12-01/insufficient-privileges-exception}})))))
(clojure.spec.alpha/fdef create-environment :args (clojure.spec.alpha/tuple :portkey.aws.elasticbeanstalk.-2010-12-01/create-environment-message) :ret (clojure.spec.alpha/and :portkey.aws.elasticbeanstalk.-2010-12-01/environment-description))

(clojure.core/defn describe-environment-managed-actions "Lists an environment's upcoming and in-progress managed actions." ([] (describe-environment-managed-actions {})) ([describe-environment-managed-actions-requestinput] (clojure.core/let [request-function-result__22119__auto__ (req-describe-environment-managed-actions-request describe-environment-managed-actions-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__22119__auto__ {:http.request.configuration/endpoints portkey.aws.elasticbeanstalk.-2010-12-01/endpoints, :http.request.configuration/target-prefix nil, :http.request.spec/output-spec :portkey.aws.elasticbeanstalk.-2010-12-01/describe-environment-managed-actions-result, :http.request.configuration/mime-type {"content-type" "application/x-www-form-urlencoded; charset=utf-8"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2010-12-01", :http.request.configuration/service-id "Elastic Beanstalk", :http.request.spec/input-spec :portkey.aws.elasticbeanstalk.-2010-12-01/describe-environment-managed-actions-request, :http.request.configuration/protocol "query", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper "DescribeEnvironmentManagedActionsResult", :http.request.configuration/action "DescribeEnvironmentManagedActions", :http.request.configuration/output-deser-fn response-describe-environment-managed-actions-result, :http.request.spec/error-spec {"ElasticBeanstalkServiceException" :portkey.aws.elasticbeanstalk.-2010-12-01/elastic-beanstalk-service-exception}})))))
(clojure.spec.alpha/fdef describe-environment-managed-actions :args (clojure.spec.alpha/? :portkey.aws.elasticbeanstalk.-2010-12-01/describe-environment-managed-actions-request) :ret (clojure.spec.alpha/and :portkey.aws.elasticbeanstalk.-2010-12-01/describe-environment-managed-actions-result))

(clojure.core/defn delete-application "Deletes the specified application along with all associated versions and\nconfigurations. The application versions will not be deleted from your Amazon S3\nbucket.\n You cannot delete an application that has a running environment." ([delete-application-messageinput] (clojure.core/let [request-function-result__22119__auto__ (req-delete-application-message delete-application-messageinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__22119__auto__ {:http.request.configuration/endpoints portkey.aws.elasticbeanstalk.-2010-12-01/endpoints, :http.request.configuration/target-prefix nil, :http.request.spec/output-spec nil, :http.request.configuration/mime-type {"content-type" "application/x-www-form-urlencoded; charset=utf-8"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2010-12-01", :http.request.configuration/service-id "Elastic Beanstalk", :http.request.spec/input-spec :portkey.aws.elasticbeanstalk.-2010-12-01/delete-application-message, :http.request.configuration/protocol "query", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "DeleteApplication", :http.request.configuration/output-deser-fn (clojure.core/fn [& args__22118__auto__] {}), :http.request.spec/error-spec {"OperationInProgressException" :portkey.aws.elasticbeanstalk.-2010-12-01/operation-in-progress-exception}})))))
(clojure.spec.alpha/fdef delete-application :args (clojure.spec.alpha/tuple :portkey.aws.elasticbeanstalk.-2010-12-01/delete-application-message) :ret clojure.core/true?)

(clojure.core/defn describe-instances-health "Retrieves detailed information about the health of instances in your AWS Elastic\nBeanstalk. This operation requires enhanced health reporting\n(http://docs.aws.amazon.com/elasticbeanstalk/latest/dg/health-enhanced.html)." ([] (describe-instances-health {})) ([describe-instances-health-requestinput] (clojure.core/let [request-function-result__22119__auto__ (req-describe-instances-health-request describe-instances-health-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__22119__auto__ {:http.request.configuration/endpoints portkey.aws.elasticbeanstalk.-2010-12-01/endpoints, :http.request.configuration/target-prefix nil, :http.request.spec/output-spec :portkey.aws.elasticbeanstalk.-2010-12-01/describe-instances-health-result, :http.request.configuration/mime-type {"content-type" "application/x-www-form-urlencoded; charset=utf-8"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2010-12-01", :http.request.configuration/service-id "Elastic Beanstalk", :http.request.spec/input-spec :portkey.aws.elasticbeanstalk.-2010-12-01/describe-instances-health-request, :http.request.configuration/protocol "query", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper "DescribeInstancesHealthResult", :http.request.configuration/action "DescribeInstancesHealth", :http.request.configuration/output-deser-fn response-describe-instances-health-result, :http.request.spec/error-spec {"InvalidRequestException" :portkey.aws.elasticbeanstalk.-2010-12-01/invalid-request-exception, "ElasticBeanstalkServiceException" :portkey.aws.elasticbeanstalk.-2010-12-01/elastic-beanstalk-service-exception}})))))
(clojure.spec.alpha/fdef describe-instances-health :args (clojure.spec.alpha/? :portkey.aws.elasticbeanstalk.-2010-12-01/describe-instances-health-request) :ret (clojure.spec.alpha/and :portkey.aws.elasticbeanstalk.-2010-12-01/describe-instances-health-result))

(clojure.core/defn describe-configuration-options "Describes the configuration options that are used in a particular configuration\ntemplate or environment, or that a specified solution stack defines. The\ndescription includes the values the options, their default values, and an\nindication of the required action on a running environment if an option value is\nchanged." ([] (describe-configuration-options {})) ([describe-configuration-options-messageinput] (clojure.core/let [request-function-result__22119__auto__ (req-describe-configuration-options-message describe-configuration-options-messageinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__22119__auto__ {:http.request.configuration/endpoints portkey.aws.elasticbeanstalk.-2010-12-01/endpoints, :http.request.configuration/target-prefix nil, :http.request.spec/output-spec :portkey.aws.elasticbeanstalk.-2010-12-01/configuration-options-description, :http.request.configuration/mime-type {"content-type" "application/x-www-form-urlencoded; charset=utf-8"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2010-12-01", :http.request.configuration/service-id "Elastic Beanstalk", :http.request.spec/input-spec :portkey.aws.elasticbeanstalk.-2010-12-01/describe-configuration-options-message, :http.request.configuration/protocol "query", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper "DescribeConfigurationOptionsResult", :http.request.configuration/action "DescribeConfigurationOptions", :http.request.configuration/output-deser-fn response-configuration-options-description, :http.request.spec/error-spec {"TooManyBucketsException" :portkey.aws.elasticbeanstalk.-2010-12-01/too-many-buckets-exception}})))))
(clojure.spec.alpha/fdef describe-configuration-options :args (clojure.spec.alpha/? :portkey.aws.elasticbeanstalk.-2010-12-01/describe-configuration-options-message) :ret (clojure.spec.alpha/and :portkey.aws.elasticbeanstalk.-2010-12-01/configuration-options-description))

(clojure.core/defn compose-environments "Create or update a group of environments that each run a separate component of a\nsingle application. Takes a list of version labels that specify application\nsource bundles for each of the environments to create or update. The name of\neach environment and other required information must be included in the source\nbundles in an environment manifest named env.yaml. See Compose Environments\n(http://docs.aws.amazon.com/elasticbeanstalk/latest/dg/environment-mgmt-compose.html)\nfor details." ([] (compose-environments {})) ([compose-environments-messageinput] (clojure.core/let [request-function-result__22119__auto__ (req-compose-environments-message compose-environments-messageinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__22119__auto__ {:http.request.configuration/endpoints portkey.aws.elasticbeanstalk.-2010-12-01/endpoints, :http.request.configuration/target-prefix nil, :http.request.spec/output-spec :portkey.aws.elasticbeanstalk.-2010-12-01/environment-descriptions-message, :http.request.configuration/mime-type {"content-type" "application/x-www-form-urlencoded; charset=utf-8"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2010-12-01", :http.request.configuration/service-id "Elastic Beanstalk", :http.request.spec/input-spec :portkey.aws.elasticbeanstalk.-2010-12-01/compose-environments-message, :http.request.configuration/protocol "query", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper "ComposeEnvironmentsResult", :http.request.configuration/action "ComposeEnvironments", :http.request.configuration/output-deser-fn response-environment-descriptions-message, :http.request.spec/error-spec {"TooManyEnvironmentsException" :portkey.aws.elasticbeanstalk.-2010-12-01/too-many-environments-exception, "InsufficientPrivilegesException" :portkey.aws.elasticbeanstalk.-2010-12-01/insufficient-privileges-exception}})))))
(clojure.spec.alpha/fdef compose-environments :args (clojure.spec.alpha/? :portkey.aws.elasticbeanstalk.-2010-12-01/compose-environments-message) :ret (clojure.spec.alpha/and :portkey.aws.elasticbeanstalk.-2010-12-01/environment-descriptions-message))

(clojure.core/defn describe-events "Returns list of event descriptions matching criteria up to the last 6 weeks.\n This action returns the most recent 1,000 events from the specified NextToken." ([] (describe-events {})) ([describe-events-messageinput] (clojure.core/let [request-function-result__22119__auto__ (req-describe-events-message describe-events-messageinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__22119__auto__ {:http.request.configuration/endpoints portkey.aws.elasticbeanstalk.-2010-12-01/endpoints, :http.request.configuration/target-prefix nil, :http.request.spec/output-spec :portkey.aws.elasticbeanstalk.-2010-12-01/event-descriptions-message, :http.request.configuration/mime-type {"content-type" "application/x-www-form-urlencoded; charset=utf-8"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2010-12-01", :http.request.configuration/service-id "Elastic Beanstalk", :http.request.spec/input-spec :portkey.aws.elasticbeanstalk.-2010-12-01/describe-events-message, :http.request.configuration/protocol "query", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper "DescribeEventsResult", :http.request.configuration/action "DescribeEvents", :http.request.configuration/output-deser-fn response-event-descriptions-message, :http.request.spec/error-spec {}})))))
(clojure.spec.alpha/fdef describe-events :args (clojure.spec.alpha/? :portkey.aws.elasticbeanstalk.-2010-12-01/describe-events-message) :ret (clojure.spec.alpha/and :portkey.aws.elasticbeanstalk.-2010-12-01/event-descriptions-message))

(clojure.core/defn describe-environment-resources "Returns AWS resources for this environment." ([] (describe-environment-resources {})) ([describe-environment-resources-messageinput] (clojure.core/let [request-function-result__22119__auto__ (req-describe-environment-resources-message describe-environment-resources-messageinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__22119__auto__ {:http.request.configuration/endpoints portkey.aws.elasticbeanstalk.-2010-12-01/endpoints, :http.request.configuration/target-prefix nil, :http.request.spec/output-spec :portkey.aws.elasticbeanstalk.-2010-12-01/environment-resource-descriptions-message, :http.request.configuration/mime-type {"content-type" "application/x-www-form-urlencoded; charset=utf-8"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2010-12-01", :http.request.configuration/service-id "Elastic Beanstalk", :http.request.spec/input-spec :portkey.aws.elasticbeanstalk.-2010-12-01/describe-environment-resources-message, :http.request.configuration/protocol "query", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper "DescribeEnvironmentResourcesResult", :http.request.configuration/action "DescribeEnvironmentResources", :http.request.configuration/output-deser-fn response-environment-resource-descriptions-message, :http.request.spec/error-spec {"InsufficientPrivilegesException" :portkey.aws.elasticbeanstalk.-2010-12-01/insufficient-privileges-exception}})))))
(clojure.spec.alpha/fdef describe-environment-resources :args (clojure.spec.alpha/? :portkey.aws.elasticbeanstalk.-2010-12-01/describe-environment-resources-message) :ret (clojure.spec.alpha/and :portkey.aws.elasticbeanstalk.-2010-12-01/environment-resource-descriptions-message))

(clojure.core/defn update-application-resource-lifecycle "Modifies lifecycle settings for an application." ([update-application-resource-lifecycle-messageinput] (clojure.core/let [request-function-result__22119__auto__ (req-update-application-resource-lifecycle-message update-application-resource-lifecycle-messageinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__22119__auto__ {:http.request.configuration/endpoints portkey.aws.elasticbeanstalk.-2010-12-01/endpoints, :http.request.configuration/target-prefix nil, :http.request.spec/output-spec :portkey.aws.elasticbeanstalk.-2010-12-01/application-resource-lifecycle-description-message, :http.request.configuration/mime-type {"content-type" "application/x-www-form-urlencoded; charset=utf-8"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2010-12-01", :http.request.configuration/service-id "Elastic Beanstalk", :http.request.spec/input-spec :portkey.aws.elasticbeanstalk.-2010-12-01/update-application-resource-lifecycle-message, :http.request.configuration/protocol "query", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper "UpdateApplicationResourceLifecycleResult", :http.request.configuration/action "UpdateApplicationResourceLifecycle", :http.request.configuration/output-deser-fn response-application-resource-lifecycle-description-message, :http.request.spec/error-spec {"InsufficientPrivilegesException" :portkey.aws.elasticbeanstalk.-2010-12-01/insufficient-privileges-exception}})))))
(clojure.spec.alpha/fdef update-application-resource-lifecycle :args (clojure.spec.alpha/tuple :portkey.aws.elasticbeanstalk.-2010-12-01/update-application-resource-lifecycle-message) :ret (clojure.spec.alpha/and :portkey.aws.elasticbeanstalk.-2010-12-01/application-resource-lifecycle-description-message))

(clojure.core/defn describe-environment-health "Returns information about the overall health of the specified environment. The\nDescribeEnvironmentHealth operation is only available with AWS Elastic Beanstalk\nEnhanced Health." ([] (describe-environment-health {})) ([describe-environment-health-requestinput] (clojure.core/let [request-function-result__22119__auto__ (req-describe-environment-health-request describe-environment-health-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__22119__auto__ {:http.request.configuration/endpoints portkey.aws.elasticbeanstalk.-2010-12-01/endpoints, :http.request.configuration/target-prefix nil, :http.request.spec/output-spec :portkey.aws.elasticbeanstalk.-2010-12-01/describe-environment-health-result, :http.request.configuration/mime-type {"content-type" "application/x-www-form-urlencoded; charset=utf-8"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2010-12-01", :http.request.configuration/service-id "Elastic Beanstalk", :http.request.spec/input-spec :portkey.aws.elasticbeanstalk.-2010-12-01/describe-environment-health-request, :http.request.configuration/protocol "query", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper "DescribeEnvironmentHealthResult", :http.request.configuration/action "DescribeEnvironmentHealth", :http.request.configuration/output-deser-fn response-describe-environment-health-result, :http.request.spec/error-spec {"InvalidRequestException" :portkey.aws.elasticbeanstalk.-2010-12-01/invalid-request-exception, "ElasticBeanstalkServiceException" :portkey.aws.elasticbeanstalk.-2010-12-01/elastic-beanstalk-service-exception}})))))
(clojure.spec.alpha/fdef describe-environment-health :args (clojure.spec.alpha/? :portkey.aws.elasticbeanstalk.-2010-12-01/describe-environment-health-request) :ret (clojure.spec.alpha/and :portkey.aws.elasticbeanstalk.-2010-12-01/describe-environment-health-result))

(clojure.core/defn request-environment-info "Initiates a request to compile the specified type of information of the deployed\nenvironment.\n Setting the InfoType to tail compiles the last lines from the application\nserver log files of every Amazon EC2 instance in your environment.\n Setting the InfoType to bundle compresses the application server log files for\nevery Amazon EC2 instance into a .zip file. Legacy and .NET containers do not\nsupport bundle logs.\n Use RetrieveEnvironmentInfo to obtain the set of logs.\n Related Topics\n * RetrieveEnvironmentInfo" ([request-environment-info-messageinput] (clojure.core/let [request-function-result__22119__auto__ (req-request-environment-info-message request-environment-info-messageinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__22119__auto__ {:http.request.configuration/endpoints portkey.aws.elasticbeanstalk.-2010-12-01/endpoints, :http.request.configuration/target-prefix nil, :http.request.spec/output-spec nil, :http.request.configuration/mime-type {"content-type" "application/x-www-form-urlencoded; charset=utf-8"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2010-12-01", :http.request.configuration/service-id "Elastic Beanstalk", :http.request.spec/input-spec :portkey.aws.elasticbeanstalk.-2010-12-01/request-environment-info-message, :http.request.configuration/protocol "query", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "RequestEnvironmentInfo", :http.request.configuration/output-deser-fn (clojure.core/fn [& args__22118__auto__] {}), :http.request.spec/error-spec {}})))))
(clojure.spec.alpha/fdef request-environment-info :args (clojure.spec.alpha/tuple :portkey.aws.elasticbeanstalk.-2010-12-01/request-environment-info-message) :ret clojure.core/true?)

(clojure.core/defn list-platform-versions "Lists the available platforms." ([] (list-platform-versions {})) ([list-platform-versions-requestinput] (clojure.core/let [request-function-result__22119__auto__ (req-list-platform-versions-request list-platform-versions-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__22119__auto__ {:http.request.configuration/endpoints portkey.aws.elasticbeanstalk.-2010-12-01/endpoints, :http.request.configuration/target-prefix nil, :http.request.spec/output-spec :portkey.aws.elasticbeanstalk.-2010-12-01/list-platform-versions-result, :http.request.configuration/mime-type {"content-type" "application/x-www-form-urlencoded; charset=utf-8"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2010-12-01", :http.request.configuration/service-id "Elastic Beanstalk", :http.request.spec/input-spec :portkey.aws.elasticbeanstalk.-2010-12-01/list-platform-versions-request, :http.request.configuration/protocol "query", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper "ListPlatformVersionsResult", :http.request.configuration/action "ListPlatformVersions", :http.request.configuration/output-deser-fn response-list-platform-versions-result, :http.request.spec/error-spec {"InsufficientPrivilegesException" :portkey.aws.elasticbeanstalk.-2010-12-01/insufficient-privileges-exception, "ElasticBeanstalkServiceException" :portkey.aws.elasticbeanstalk.-2010-12-01/elastic-beanstalk-service-exception}})))))
(clojure.spec.alpha/fdef list-platform-versions :args (clojure.spec.alpha/? :portkey.aws.elasticbeanstalk.-2010-12-01/list-platform-versions-request) :ret (clojure.spec.alpha/and :portkey.aws.elasticbeanstalk.-2010-12-01/list-platform-versions-result))

(clojure.core/defn apply-environment-managed-action "Applies a scheduled managed action immediately. A managed action can be applied\nonly if its status is Scheduled. Get the status and action ID of a managed\naction with DescribeEnvironmentManagedActions." ([apply-environment-managed-action-requestinput] (clojure.core/let [request-function-result__22119__auto__ (req-apply-environment-managed-action-request apply-environment-managed-action-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__22119__auto__ {:http.request.configuration/endpoints portkey.aws.elasticbeanstalk.-2010-12-01/endpoints, :http.request.configuration/target-prefix nil, :http.request.spec/output-spec :portkey.aws.elasticbeanstalk.-2010-12-01/apply-environment-managed-action-result, :http.request.configuration/mime-type {"content-type" "application/x-www-form-urlencoded; charset=utf-8"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2010-12-01", :http.request.configuration/service-id "Elastic Beanstalk", :http.request.spec/input-spec :portkey.aws.elasticbeanstalk.-2010-12-01/apply-environment-managed-action-request, :http.request.configuration/protocol "query", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper "ApplyEnvironmentManagedActionResult", :http.request.configuration/action "ApplyEnvironmentManagedAction", :http.request.configuration/output-deser-fn response-apply-environment-managed-action-result, :http.request.spec/error-spec {"ElasticBeanstalkServiceException" :portkey.aws.elasticbeanstalk.-2010-12-01/elastic-beanstalk-service-exception, "ManagedActionInvalidStateException" :portkey.aws.elasticbeanstalk.-2010-12-01/managed-action-invalid-state-exception}})))))
(clojure.spec.alpha/fdef apply-environment-managed-action :args (clojure.spec.alpha/tuple :portkey.aws.elasticbeanstalk.-2010-12-01/apply-environment-managed-action-request) :ret (clojure.spec.alpha/and :portkey.aws.elasticbeanstalk.-2010-12-01/apply-environment-managed-action-result))

(clojure.core/defn describe-applications "Returns the descriptions of existing applications." ([] (describe-applications {})) ([describe-applications-messageinput] (clojure.core/let [request-function-result__22119__auto__ (req-describe-applications-message describe-applications-messageinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__22119__auto__ {:http.request.configuration/endpoints portkey.aws.elasticbeanstalk.-2010-12-01/endpoints, :http.request.configuration/target-prefix nil, :http.request.spec/output-spec :portkey.aws.elasticbeanstalk.-2010-12-01/application-descriptions-message, :http.request.configuration/mime-type {"content-type" "application/x-www-form-urlencoded; charset=utf-8"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2010-12-01", :http.request.configuration/service-id "Elastic Beanstalk", :http.request.spec/input-spec :portkey.aws.elasticbeanstalk.-2010-12-01/describe-applications-message, :http.request.configuration/protocol "query", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper "DescribeApplicationsResult", :http.request.configuration/action "DescribeApplications", :http.request.configuration/output-deser-fn response-application-descriptions-message, :http.request.spec/error-spec {}})))))
(clojure.spec.alpha/fdef describe-applications :args (clojure.spec.alpha/? :portkey.aws.elasticbeanstalk.-2010-12-01/describe-applications-message) :ret (clojure.spec.alpha/and :portkey.aws.elasticbeanstalk.-2010-12-01/application-descriptions-message))

(clojure.core/defn list-tags-for-resource "Returns the tags applied to an AWS Elastic Beanstalk resource. The response\ncontains a list of tag key-value pairs.\n Currently, Elastic Beanstalk only supports tagging of Elastic Beanstalk\nenvironments. For details about environment tagging, see Tagging Resources in\nYour Elastic Beanstalk Environment\n(http://docs.aws.amazon.com/elasticbeanstalk/latest/dg/using-features.tagging.html)." ([list-tags-for-resource-messageinput] (clojure.core/let [request-function-result__22119__auto__ (req-list-tags-for-resource-message list-tags-for-resource-messageinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__22119__auto__ {:http.request.configuration/endpoints portkey.aws.elasticbeanstalk.-2010-12-01/endpoints, :http.request.configuration/target-prefix nil, :http.request.spec/output-spec :portkey.aws.elasticbeanstalk.-2010-12-01/resource-tags-description-message, :http.request.configuration/mime-type {"content-type" "application/x-www-form-urlencoded; charset=utf-8"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2010-12-01", :http.request.configuration/service-id "Elastic Beanstalk", :http.request.spec/input-spec :portkey.aws.elasticbeanstalk.-2010-12-01/list-tags-for-resource-message, :http.request.configuration/protocol "query", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper "ListTagsForResourceResult", :http.request.configuration/action "ListTagsForResource", :http.request.configuration/output-deser-fn response-resource-tags-description-message, :http.request.spec/error-spec {"InsufficientPrivilegesException" :portkey.aws.elasticbeanstalk.-2010-12-01/insufficient-privileges-exception, "ResourceNotFoundException" :portkey.aws.elasticbeanstalk.-2010-12-01/resource-not-found-exception, "ResourceTypeNotSupportedException" :portkey.aws.elasticbeanstalk.-2010-12-01/resource-type-not-supported-exception}})))))
(clojure.spec.alpha/fdef list-tags-for-resource :args (clojure.spec.alpha/tuple :portkey.aws.elasticbeanstalk.-2010-12-01/list-tags-for-resource-message) :ret (clojure.spec.alpha/and :portkey.aws.elasticbeanstalk.-2010-12-01/resource-tags-description-message))

(clojure.core/defn validate-configuration-settings "Takes a set of configuration settings and either a configuration template or\nenvironment, and determines whether those values are valid.\n This action returns a list of messages indicating any errors or warnings\nassociated with the selection of option values." ([validate-configuration-settings-messageinput] (clojure.core/let [request-function-result__22119__auto__ (req-validate-configuration-settings-message validate-configuration-settings-messageinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__22119__auto__ {:http.request.configuration/endpoints portkey.aws.elasticbeanstalk.-2010-12-01/endpoints, :http.request.configuration/target-prefix nil, :http.request.spec/output-spec :portkey.aws.elasticbeanstalk.-2010-12-01/configuration-settings-validation-messages, :http.request.configuration/mime-type {"content-type" "application/x-www-form-urlencoded; charset=utf-8"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2010-12-01", :http.request.configuration/service-id "Elastic Beanstalk", :http.request.spec/input-spec :portkey.aws.elasticbeanstalk.-2010-12-01/validate-configuration-settings-message, :http.request.configuration/protocol "query", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper "ValidateConfigurationSettingsResult", :http.request.configuration/action "ValidateConfigurationSettings", :http.request.configuration/output-deser-fn response-configuration-settings-validation-messages, :http.request.spec/error-spec {"InsufficientPrivilegesException" :portkey.aws.elasticbeanstalk.-2010-12-01/insufficient-privileges-exception, "TooManyBucketsException" :portkey.aws.elasticbeanstalk.-2010-12-01/too-many-buckets-exception}})))))
(clojure.spec.alpha/fdef validate-configuration-settings :args (clojure.spec.alpha/tuple :portkey.aws.elasticbeanstalk.-2010-12-01/validate-configuration-settings-message) :ret (clojure.spec.alpha/and :portkey.aws.elasticbeanstalk.-2010-12-01/configuration-settings-validation-messages))

(clojure.core/defn restart-app-server "Causes the environment to restart the application container server running on\neach Amazon EC2 instance." ([] (restart-app-server {})) ([restart-app-server-messageinput] (clojure.core/let [request-function-result__22119__auto__ (req-restart-app-server-message restart-app-server-messageinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__22119__auto__ {:http.request.configuration/endpoints portkey.aws.elasticbeanstalk.-2010-12-01/endpoints, :http.request.configuration/target-prefix nil, :http.request.spec/output-spec nil, :http.request.configuration/mime-type {"content-type" "application/x-www-form-urlencoded; charset=utf-8"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2010-12-01", :http.request.configuration/service-id "Elastic Beanstalk", :http.request.spec/input-spec :portkey.aws.elasticbeanstalk.-2010-12-01/restart-app-server-message, :http.request.configuration/protocol "query", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "RestartAppServer", :http.request.configuration/output-deser-fn (clojure.core/fn [& args__22118__auto__] {}), :http.request.spec/error-spec {}})))))
(clojure.spec.alpha/fdef restart-app-server :args (clojure.spec.alpha/? :portkey.aws.elasticbeanstalk.-2010-12-01/restart-app-server-message) :ret clojure.core/true?)

(clojure.core/defn describe-environments "Returns descriptions for existing environments." ([] (describe-environments {})) ([describe-environments-messageinput] (clojure.core/let [request-function-result__22119__auto__ (req-describe-environments-message describe-environments-messageinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__22119__auto__ {:http.request.configuration/endpoints portkey.aws.elasticbeanstalk.-2010-12-01/endpoints, :http.request.configuration/target-prefix nil, :http.request.spec/output-spec :portkey.aws.elasticbeanstalk.-2010-12-01/environment-descriptions-message, :http.request.configuration/mime-type {"content-type" "application/x-www-form-urlencoded; charset=utf-8"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2010-12-01", :http.request.configuration/service-id "Elastic Beanstalk", :http.request.spec/input-spec :portkey.aws.elasticbeanstalk.-2010-12-01/describe-environments-message, :http.request.configuration/protocol "query", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper "DescribeEnvironmentsResult", :http.request.configuration/action "DescribeEnvironments", :http.request.configuration/output-deser-fn response-environment-descriptions-message, :http.request.spec/error-spec {}})))))
(clojure.spec.alpha/fdef describe-environments :args (clojure.spec.alpha/? :portkey.aws.elasticbeanstalk.-2010-12-01/describe-environments-message) :ret (clojure.spec.alpha/and :portkey.aws.elasticbeanstalk.-2010-12-01/environment-descriptions-message))

(clojure.core/defn delete-environment-configuration "Deletes the draft configuration associated with the running environment.\n Updating a running environment with any configuration changes creates a draft\nconfiguration set. You can get the draft configuration using\nDescribeConfigurationSettings while the update is in progress or if the update\nfails. The DeploymentStatus for the draft configuration indicates whether the\ndeployment is in process or has failed. The draft configuration remains in\nexistence until it is deleted with this action." ([delete-environment-configuration-messageinput] (clojure.core/let [request-function-result__22119__auto__ (req-delete-environment-configuration-message delete-environment-configuration-messageinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__22119__auto__ {:http.request.configuration/endpoints portkey.aws.elasticbeanstalk.-2010-12-01/endpoints, :http.request.configuration/target-prefix nil, :http.request.spec/output-spec nil, :http.request.configuration/mime-type {"content-type" "application/x-www-form-urlencoded; charset=utf-8"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2010-12-01", :http.request.configuration/service-id "Elastic Beanstalk", :http.request.spec/input-spec :portkey.aws.elasticbeanstalk.-2010-12-01/delete-environment-configuration-message, :http.request.configuration/protocol "query", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "DeleteEnvironmentConfiguration", :http.request.configuration/output-deser-fn (clojure.core/fn [& args__22118__auto__] {}), :http.request.spec/error-spec {}})))))
(clojure.spec.alpha/fdef delete-environment-configuration :args (clojure.spec.alpha/tuple :portkey.aws.elasticbeanstalk.-2010-12-01/delete-environment-configuration-message) :ret clojure.core/true?)

(clojure.core/defn terminate-environment "Terminates the specified environment." ([] (terminate-environment {})) ([terminate-environment-messageinput] (clojure.core/let [request-function-result__22119__auto__ (req-terminate-environment-message terminate-environment-messageinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__22119__auto__ {:http.request.configuration/endpoints portkey.aws.elasticbeanstalk.-2010-12-01/endpoints, :http.request.configuration/target-prefix nil, :http.request.spec/output-spec :portkey.aws.elasticbeanstalk.-2010-12-01/environment-description, :http.request.configuration/mime-type {"content-type" "application/x-www-form-urlencoded; charset=utf-8"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2010-12-01", :http.request.configuration/service-id "Elastic Beanstalk", :http.request.spec/input-spec :portkey.aws.elasticbeanstalk.-2010-12-01/terminate-environment-message, :http.request.configuration/protocol "query", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper "TerminateEnvironmentResult", :http.request.configuration/action "TerminateEnvironment", :http.request.configuration/output-deser-fn response-environment-description, :http.request.spec/error-spec {"InsufficientPrivilegesException" :portkey.aws.elasticbeanstalk.-2010-12-01/insufficient-privileges-exception}})))))
(clojure.spec.alpha/fdef terminate-environment :args (clojure.spec.alpha/? :portkey.aws.elasticbeanstalk.-2010-12-01/terminate-environment-message) :ret (clojure.spec.alpha/and :portkey.aws.elasticbeanstalk.-2010-12-01/environment-description))

(clojure.core/defn check-dns-availability "Checks if the specified CNAME is available." ([check-dns-availability-messageinput] (clojure.core/let [request-function-result__22119__auto__ (req-check-dns-availability-message check-dns-availability-messageinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__22119__auto__ {:http.request.configuration/endpoints portkey.aws.elasticbeanstalk.-2010-12-01/endpoints, :http.request.configuration/target-prefix nil, :http.request.spec/output-spec :portkey.aws.elasticbeanstalk.-2010-12-01/check-dns-availability-result-message, :http.request.configuration/mime-type {"content-type" "application/x-www-form-urlencoded; charset=utf-8"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2010-12-01", :http.request.configuration/service-id "Elastic Beanstalk", :http.request.spec/input-spec :portkey.aws.elasticbeanstalk.-2010-12-01/check-dns-availability-message, :http.request.configuration/protocol "query", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper "CheckDNSAvailabilityResult", :http.request.configuration/action "CheckDNSAvailability", :http.request.configuration/output-deser-fn response-check-dns-availability-result-message, :http.request.spec/error-spec {}})))))
(clojure.spec.alpha/fdef check-dns-availability :args (clojure.spec.alpha/tuple :portkey.aws.elasticbeanstalk.-2010-12-01/check-dns-availability-message) :ret (clojure.spec.alpha/and :portkey.aws.elasticbeanstalk.-2010-12-01/check-dns-availability-result-message))

(clojure.core/defn retrieve-environment-info "Retrieves the compiled information from a RequestEnvironmentInfo request.\n Related Topics\n * RequestEnvironmentInfo" ([retrieve-environment-info-messageinput] (clojure.core/let [request-function-result__22119__auto__ (req-retrieve-environment-info-message retrieve-environment-info-messageinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__22119__auto__ {:http.request.configuration/endpoints portkey.aws.elasticbeanstalk.-2010-12-01/endpoints, :http.request.configuration/target-prefix nil, :http.request.spec/output-spec :portkey.aws.elasticbeanstalk.-2010-12-01/retrieve-environment-info-result-message, :http.request.configuration/mime-type {"content-type" "application/x-www-form-urlencoded; charset=utf-8"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2010-12-01", :http.request.configuration/service-id "Elastic Beanstalk", :http.request.spec/input-spec :portkey.aws.elasticbeanstalk.-2010-12-01/retrieve-environment-info-message, :http.request.configuration/protocol "query", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper "RetrieveEnvironmentInfoResult", :http.request.configuration/action "RetrieveEnvironmentInfo", :http.request.configuration/output-deser-fn response-retrieve-environment-info-result-message, :http.request.spec/error-spec {}})))))
(clojure.spec.alpha/fdef retrieve-environment-info :args (clojure.spec.alpha/tuple :portkey.aws.elasticbeanstalk.-2010-12-01/retrieve-environment-info-message) :ret (clojure.spec.alpha/and :portkey.aws.elasticbeanstalk.-2010-12-01/retrieve-environment-info-result-message))

(clojure.core/defn create-storage-location "Creates a bucket in Amazon S3 to store application versions, logs, and other\nfiles used by Elastic Beanstalk environments. The Elastic Beanstalk console and\nEB CLI call this API the first time you create an environment in a region. If\nthe storage location already exists, CreateStorageLocation still returns the\nbucket name but does not create a new bucket." ([] (create-storage-location {})) ([_] (clojure.core/let [request-function-result__22119__auto__ {}] (portkey.aws/-call-http (clojure.core/into request-function-result__22119__auto__ {:http.request.configuration/endpoints portkey.aws.elasticbeanstalk.-2010-12-01/endpoints, :http.request.configuration/target-prefix nil, :http.request.spec/output-spec :portkey.aws.elasticbeanstalk.-2010-12-01/create-storage-location-result-message, :http.request.configuration/mime-type {"content-type" "application/x-www-form-urlencoded; charset=utf-8"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2010-12-01", :http.request.configuration/service-id "Elastic Beanstalk", :http.request.spec/input-spec nil, :http.request.configuration/protocol "query", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper "CreateStorageLocationResult", :http.request.configuration/action "CreateStorageLocation", :http.request.configuration/output-deser-fn response-create-storage-location-result-message, :http.request.spec/error-spec {"TooManyBucketsException" :portkey.aws.elasticbeanstalk.-2010-12-01/too-many-buckets-exception, "S3SubscriptionRequiredException" :portkey.aws.elasticbeanstalk.-2010-12-01/s-3-subscription-required-exception, "InsufficientPrivilegesException" :portkey.aws.elasticbeanstalk.-2010-12-01/insufficient-privileges-exception}})))))
(clojure.spec.alpha/fdef create-storage-location :args clojure.core/empty? :ret (clojure.spec.alpha/and :portkey.aws.elasticbeanstalk.-2010-12-01/create-storage-location-result-message))

(clojure.core/defn update-application "Updates the specified application to have the specified properties.\n If a property (for example, description) is not provided, the value remains\nunchanged. To clear these properties, specify an empty string." ([update-application-messageinput] (clojure.core/let [request-function-result__22119__auto__ (req-update-application-message update-application-messageinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__22119__auto__ {:http.request.configuration/endpoints portkey.aws.elasticbeanstalk.-2010-12-01/endpoints, :http.request.configuration/target-prefix nil, :http.request.spec/output-spec :portkey.aws.elasticbeanstalk.-2010-12-01/application-description-message, :http.request.configuration/mime-type {"content-type" "application/x-www-form-urlencoded; charset=utf-8"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2010-12-01", :http.request.configuration/service-id "Elastic Beanstalk", :http.request.spec/input-spec :portkey.aws.elasticbeanstalk.-2010-12-01/update-application-message, :http.request.configuration/protocol "query", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper "UpdateApplicationResult", :http.request.configuration/action "UpdateApplication", :http.request.configuration/output-deser-fn response-application-description-message, :http.request.spec/error-spec {}})))))
(clojure.spec.alpha/fdef update-application :args (clojure.spec.alpha/tuple :portkey.aws.elasticbeanstalk.-2010-12-01/update-application-message) :ret (clojure.spec.alpha/and :portkey.aws.elasticbeanstalk.-2010-12-01/application-description-message))

(clojure.core/defn describe-account-attributes "Returns attributes related to AWS Elastic Beanstalk that are associated with the\ncalling AWS account.\n The result currently has one set of attributes—resource quotas." ([] (describe-account-attributes {})) ([_] (clojure.core/let [request-function-result__22119__auto__ {}] (portkey.aws/-call-http (clojure.core/into request-function-result__22119__auto__ {:http.request.configuration/endpoints portkey.aws.elasticbeanstalk.-2010-12-01/endpoints, :http.request.configuration/target-prefix nil, :http.request.spec/output-spec :portkey.aws.elasticbeanstalk.-2010-12-01/describe-account-attributes-result, :http.request.configuration/mime-type {"content-type" "application/x-www-form-urlencoded; charset=utf-8"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2010-12-01", :http.request.configuration/service-id "Elastic Beanstalk", :http.request.spec/input-spec nil, :http.request.configuration/protocol "query", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper "DescribeAccountAttributesResult", :http.request.configuration/action "DescribeAccountAttributes", :http.request.configuration/output-deser-fn response-describe-account-attributes-result, :http.request.spec/error-spec {"InsufficientPrivilegesException" :portkey.aws.elasticbeanstalk.-2010-12-01/insufficient-privileges-exception}})))))
(clojure.spec.alpha/fdef describe-account-attributes :args clojure.core/empty? :ret (clojure.spec.alpha/and :portkey.aws.elasticbeanstalk.-2010-12-01/describe-account-attributes-result))

(clojure.core/defn create-application " Creates an application that has one configuration template named default and no\napplication versions." ([create-application-messageinput] (clojure.core/let [request-function-result__22119__auto__ (req-create-application-message create-application-messageinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__22119__auto__ {:http.request.configuration/endpoints portkey.aws.elasticbeanstalk.-2010-12-01/endpoints, :http.request.configuration/target-prefix nil, :http.request.spec/output-spec :portkey.aws.elasticbeanstalk.-2010-12-01/application-description-message, :http.request.configuration/mime-type {"content-type" "application/x-www-form-urlencoded; charset=utf-8"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2010-12-01", :http.request.configuration/service-id "Elastic Beanstalk", :http.request.spec/input-spec :portkey.aws.elasticbeanstalk.-2010-12-01/create-application-message, :http.request.configuration/protocol "query", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper "CreateApplicationResult", :http.request.configuration/action "CreateApplication", :http.request.configuration/output-deser-fn response-application-description-message, :http.request.spec/error-spec {"TooManyApplicationsException" :portkey.aws.elasticbeanstalk.-2010-12-01/too-many-applications-exception}})))))
(clojure.spec.alpha/fdef create-application :args (clojure.spec.alpha/tuple :portkey.aws.elasticbeanstalk.-2010-12-01/create-application-message) :ret (clojure.spec.alpha/and :portkey.aws.elasticbeanstalk.-2010-12-01/application-description-message))

(clojure.core/defn describe-configuration-settings "Returns a description of the settings for the specified configuration set, that\nis, either a configuration template or the configuration set associated with a\nrunning environment.\n When describing the settings for the configuration set associated with a\nrunning environment, it is possible to receive two sets of setting descriptions.\nOne is the deployed configuration set, and the other is a draft configuration of\nan environment that is either in the process of deployment or that failed to\ndeploy.\n Related Topics\n * DeleteEnvironmentConfiguration" ([describe-configuration-settings-messageinput] (clojure.core/let [request-function-result__22119__auto__ (req-describe-configuration-settings-message describe-configuration-settings-messageinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__22119__auto__ {:http.request.configuration/endpoints portkey.aws.elasticbeanstalk.-2010-12-01/endpoints, :http.request.configuration/target-prefix nil, :http.request.spec/output-spec :portkey.aws.elasticbeanstalk.-2010-12-01/configuration-settings-descriptions, :http.request.configuration/mime-type {"content-type" "application/x-www-form-urlencoded; charset=utf-8"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2010-12-01", :http.request.configuration/service-id "Elastic Beanstalk", :http.request.spec/input-spec :portkey.aws.elasticbeanstalk.-2010-12-01/describe-configuration-settings-message, :http.request.configuration/protocol "query", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper "DescribeConfigurationSettingsResult", :http.request.configuration/action "DescribeConfigurationSettings", :http.request.configuration/output-deser-fn response-configuration-settings-descriptions, :http.request.spec/error-spec {"TooManyBucketsException" :portkey.aws.elasticbeanstalk.-2010-12-01/too-many-buckets-exception}})))))
(clojure.spec.alpha/fdef describe-configuration-settings :args (clojure.spec.alpha/tuple :portkey.aws.elasticbeanstalk.-2010-12-01/describe-configuration-settings-message) :ret (clojure.spec.alpha/and :portkey.aws.elasticbeanstalk.-2010-12-01/configuration-settings-descriptions))

(clojure.core/defn delete-application-version "Deletes the specified version from the specified application.\n You cannot delete an application version that is associated with a running\nenvironment." ([delete-application-version-messageinput] (clojure.core/let [request-function-result__22119__auto__ (req-delete-application-version-message delete-application-version-messageinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__22119__auto__ {:http.request.configuration/endpoints portkey.aws.elasticbeanstalk.-2010-12-01/endpoints, :http.request.configuration/target-prefix nil, :http.request.spec/output-spec nil, :http.request.configuration/mime-type {"content-type" "application/x-www-form-urlencoded; charset=utf-8"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2010-12-01", :http.request.configuration/service-id "Elastic Beanstalk", :http.request.spec/input-spec :portkey.aws.elasticbeanstalk.-2010-12-01/delete-application-version-message, :http.request.configuration/protocol "query", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "DeleteApplicationVersion", :http.request.configuration/output-deser-fn (clojure.core/fn [& args__22118__auto__] {}), :http.request.spec/error-spec {"SourceBundleDeletionException" :portkey.aws.elasticbeanstalk.-2010-12-01/source-bundle-deletion-exception, "InsufficientPrivilegesException" :portkey.aws.elasticbeanstalk.-2010-12-01/insufficient-privileges-exception, "OperationInProgressException" :portkey.aws.elasticbeanstalk.-2010-12-01/operation-in-progress-exception, "S3LocationNotInServiceRegionException" :portkey.aws.elasticbeanstalk.-2010-12-01/s-3-location-not-in-service-region-exception}})))))
(clojure.spec.alpha/fdef delete-application-version :args (clojure.spec.alpha/tuple :portkey.aws.elasticbeanstalk.-2010-12-01/delete-application-version-message) :ret clojure.core/true?)

(clojure.core/defn delete-configuration-template "Deletes the specified configuration template.\n When you launch an environment using a configuration template, the environment\ngets a copy of the template. You can delete or modify the environment's copy of\nthe template without affecting the running environment." ([delete-configuration-template-messageinput] (clojure.core/let [request-function-result__22119__auto__ (req-delete-configuration-template-message delete-configuration-template-messageinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__22119__auto__ {:http.request.configuration/endpoints portkey.aws.elasticbeanstalk.-2010-12-01/endpoints, :http.request.configuration/target-prefix nil, :http.request.spec/output-spec nil, :http.request.configuration/mime-type {"content-type" "application/x-www-form-urlencoded; charset=utf-8"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2010-12-01", :http.request.configuration/service-id "Elastic Beanstalk", :http.request.spec/input-spec :portkey.aws.elasticbeanstalk.-2010-12-01/delete-configuration-template-message, :http.request.configuration/protocol "query", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "DeleteConfigurationTemplate", :http.request.configuration/output-deser-fn (clojure.core/fn [& args__22118__auto__] {}), :http.request.spec/error-spec {"OperationInProgressException" :portkey.aws.elasticbeanstalk.-2010-12-01/operation-in-progress-exception}})))))
(clojure.spec.alpha/fdef delete-configuration-template :args (clojure.spec.alpha/tuple :portkey.aws.elasticbeanstalk.-2010-12-01/delete-configuration-template-message) :ret clojure.core/true?)

(clojure.core/defn abort-environment-update "Cancels in-progress environment configuration update or application version\ndeployment." ([] (abort-environment-update {})) ([abort-environment-update-messageinput] (clojure.core/let [request-function-result__22119__auto__ (req-abort-environment-update-message abort-environment-update-messageinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__22119__auto__ {:http.request.configuration/endpoints portkey.aws.elasticbeanstalk.-2010-12-01/endpoints, :http.request.configuration/target-prefix nil, :http.request.spec/output-spec nil, :http.request.configuration/mime-type {"content-type" "application/x-www-form-urlencoded; charset=utf-8"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2010-12-01", :http.request.configuration/service-id "Elastic Beanstalk", :http.request.spec/input-spec :portkey.aws.elasticbeanstalk.-2010-12-01/abort-environment-update-message, :http.request.configuration/protocol "query", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "AbortEnvironmentUpdate", :http.request.configuration/output-deser-fn (clojure.core/fn [& args__22118__auto__] {}), :http.request.spec/error-spec {"InsufficientPrivilegesException" :portkey.aws.elasticbeanstalk.-2010-12-01/insufficient-privileges-exception}})))))
(clojure.spec.alpha/fdef abort-environment-update :args (clojure.spec.alpha/? :portkey.aws.elasticbeanstalk.-2010-12-01/abort-environment-update-message) :ret clojure.core/true?)

(clojure.core/defn delete-platform-version "Deletes the specified version of a custom platform." ([] (delete-platform-version {})) ([delete-platform-version-requestinput] (clojure.core/let [request-function-result__22119__auto__ (req-delete-platform-version-request delete-platform-version-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__22119__auto__ {:http.request.configuration/endpoints portkey.aws.elasticbeanstalk.-2010-12-01/endpoints, :http.request.configuration/target-prefix nil, :http.request.spec/output-spec :portkey.aws.elasticbeanstalk.-2010-12-01/delete-platform-version-result, :http.request.configuration/mime-type {"content-type" "application/x-www-form-urlencoded; charset=utf-8"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2010-12-01", :http.request.configuration/service-id "Elastic Beanstalk", :http.request.spec/input-spec :portkey.aws.elasticbeanstalk.-2010-12-01/delete-platform-version-request, :http.request.configuration/protocol "query", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper "DeletePlatformVersionResult", :http.request.configuration/action "DeletePlatformVersion", :http.request.configuration/output-deser-fn response-delete-platform-version-result, :http.request.spec/error-spec {"OperationInProgressException" :portkey.aws.elasticbeanstalk.-2010-12-01/operation-in-progress-exception, "InsufficientPrivilegesException" :portkey.aws.elasticbeanstalk.-2010-12-01/insufficient-privileges-exception, "ElasticBeanstalkServiceException" :portkey.aws.elasticbeanstalk.-2010-12-01/elastic-beanstalk-service-exception, "PlatformVersionStillReferencedException" :portkey.aws.elasticbeanstalk.-2010-12-01/platform-version-still-referenced-exception}})))))
(clojure.spec.alpha/fdef delete-platform-version :args (clojure.spec.alpha/? :portkey.aws.elasticbeanstalk.-2010-12-01/delete-platform-version-request) :ret (clojure.spec.alpha/and :portkey.aws.elasticbeanstalk.-2010-12-01/delete-platform-version-result))

(clojure.core/defn update-configuration-template "Updates the specified configuration template to have the specified properties or\nconfiguration option values.\n If a property (for example, ApplicationName) is not provided, its value remains\nunchanged. To clear such properties, specify an empty string.\n Related Topics\n * DescribeConfigurationOptions" ([update-configuration-template-messageinput] (clojure.core/let [request-function-result__22119__auto__ (req-update-configuration-template-message update-configuration-template-messageinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__22119__auto__ {:http.request.configuration/endpoints portkey.aws.elasticbeanstalk.-2010-12-01/endpoints, :http.request.configuration/target-prefix nil, :http.request.spec/output-spec :portkey.aws.elasticbeanstalk.-2010-12-01/configuration-settings-description, :http.request.configuration/mime-type {"content-type" "application/x-www-form-urlencoded; charset=utf-8"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2010-12-01", :http.request.configuration/service-id "Elastic Beanstalk", :http.request.spec/input-spec :portkey.aws.elasticbeanstalk.-2010-12-01/update-configuration-template-message, :http.request.configuration/protocol "query", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper "UpdateConfigurationTemplateResult", :http.request.configuration/action "UpdateConfigurationTemplate", :http.request.configuration/output-deser-fn response-configuration-settings-description, :http.request.spec/error-spec {"InsufficientPrivilegesException" :portkey.aws.elasticbeanstalk.-2010-12-01/insufficient-privileges-exception, "TooManyBucketsException" :portkey.aws.elasticbeanstalk.-2010-12-01/too-many-buckets-exception}})))))
(clojure.spec.alpha/fdef update-configuration-template :args (clojure.spec.alpha/tuple :portkey.aws.elasticbeanstalk.-2010-12-01/update-configuration-template-message) :ret (clojure.spec.alpha/and :portkey.aws.elasticbeanstalk.-2010-12-01/configuration-settings-description))

(clojure.core/defn rebuild-environment "Deletes and recreates all of the AWS resources (for example: the Auto Scaling\ngroup, load balancer, etc.) for a specified environment and forces a restart." ([] (rebuild-environment {})) ([rebuild-environment-messageinput] (clojure.core/let [request-function-result__22119__auto__ (req-rebuild-environment-message rebuild-environment-messageinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__22119__auto__ {:http.request.configuration/endpoints portkey.aws.elasticbeanstalk.-2010-12-01/endpoints, :http.request.configuration/target-prefix nil, :http.request.spec/output-spec nil, :http.request.configuration/mime-type {"content-type" "application/x-www-form-urlencoded; charset=utf-8"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2010-12-01", :http.request.configuration/service-id "Elastic Beanstalk", :http.request.spec/input-spec :portkey.aws.elasticbeanstalk.-2010-12-01/rebuild-environment-message, :http.request.configuration/protocol "query", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "RebuildEnvironment", :http.request.configuration/output-deser-fn (clojure.core/fn [& args__22118__auto__] {}), :http.request.spec/error-spec {"InsufficientPrivilegesException" :portkey.aws.elasticbeanstalk.-2010-12-01/insufficient-privileges-exception}})))))
(clojure.spec.alpha/fdef rebuild-environment :args (clojure.spec.alpha/? :portkey.aws.elasticbeanstalk.-2010-12-01/rebuild-environment-message) :ret clojure.core/true?)

(clojure.core/defn update-application-version "Updates the specified application version to have the specified properties.\n If a property (for example, description) is not provided, the value remains\nunchanged. To clear properties, specify an empty string." ([update-application-version-messageinput] (clojure.core/let [request-function-result__22119__auto__ (req-update-application-version-message update-application-version-messageinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__22119__auto__ {:http.request.configuration/endpoints portkey.aws.elasticbeanstalk.-2010-12-01/endpoints, :http.request.configuration/target-prefix nil, :http.request.spec/output-spec :portkey.aws.elasticbeanstalk.-2010-12-01/application-version-description-message, :http.request.configuration/mime-type {"content-type" "application/x-www-form-urlencoded; charset=utf-8"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2010-12-01", :http.request.configuration/service-id "Elastic Beanstalk", :http.request.spec/input-spec :portkey.aws.elasticbeanstalk.-2010-12-01/update-application-version-message, :http.request.configuration/protocol "query", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper "UpdateApplicationVersionResult", :http.request.configuration/action "UpdateApplicationVersion", :http.request.configuration/output-deser-fn response-application-version-description-message, :http.request.spec/error-spec {}})))))
(clojure.spec.alpha/fdef update-application-version :args (clojure.spec.alpha/tuple :portkey.aws.elasticbeanstalk.-2010-12-01/update-application-version-message) :ret (clojure.spec.alpha/and :portkey.aws.elasticbeanstalk.-2010-12-01/application-version-description-message))

(clojure.core/defn describe-application-versions "Retrieve a list of application versions." ([] (describe-application-versions {})) ([describe-application-versions-messageinput] (clojure.core/let [request-function-result__22119__auto__ (req-describe-application-versions-message describe-application-versions-messageinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__22119__auto__ {:http.request.configuration/endpoints portkey.aws.elasticbeanstalk.-2010-12-01/endpoints, :http.request.configuration/target-prefix nil, :http.request.spec/output-spec :portkey.aws.elasticbeanstalk.-2010-12-01/application-version-descriptions-message, :http.request.configuration/mime-type {"content-type" "application/x-www-form-urlencoded; charset=utf-8"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2010-12-01", :http.request.configuration/service-id "Elastic Beanstalk", :http.request.spec/input-spec :portkey.aws.elasticbeanstalk.-2010-12-01/describe-application-versions-message, :http.request.configuration/protocol "query", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper "DescribeApplicationVersionsResult", :http.request.configuration/action "DescribeApplicationVersions", :http.request.configuration/output-deser-fn response-application-version-descriptions-message, :http.request.spec/error-spec {}})))))
(clojure.spec.alpha/fdef describe-application-versions :args (clojure.spec.alpha/? :portkey.aws.elasticbeanstalk.-2010-12-01/describe-application-versions-message) :ret (clojure.spec.alpha/and :portkey.aws.elasticbeanstalk.-2010-12-01/application-version-descriptions-message))

(clojure.core/defn swap-environment-cnam-es "Swaps the CNAMEs of two environments." ([] (swap-environment-cnam-es {})) ([swap-environment-cnam-es-messageinput] (clojure.core/let [request-function-result__22119__auto__ (req-swap-environment-cnam-es-message swap-environment-cnam-es-messageinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__22119__auto__ {:http.request.configuration/endpoints portkey.aws.elasticbeanstalk.-2010-12-01/endpoints, :http.request.configuration/target-prefix nil, :http.request.spec/output-spec nil, :http.request.configuration/mime-type {"content-type" "application/x-www-form-urlencoded; charset=utf-8"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2010-12-01", :http.request.configuration/service-id "Elastic Beanstalk", :http.request.spec/input-spec :portkey.aws.elasticbeanstalk.-2010-12-01/swap-environment-cnam-es-message, :http.request.configuration/protocol "query", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "SwapEnvironmentCNAMEs", :http.request.configuration/output-deser-fn (clojure.core/fn [& args__22118__auto__] {}), :http.request.spec/error-spec {}})))))
(clojure.spec.alpha/fdef swap-environment-cnam-es :args (clojure.spec.alpha/? :portkey.aws.elasticbeanstalk.-2010-12-01/swap-environment-cnam-es-message) :ret clojure.core/true?)

(clojure.core/defn list-available-solution-stacks "Returns a list of the available solution stack names, with the public version\nfirst and then in reverse chronological order." ([] (list-available-solution-stacks {})) ([_] (clojure.core/let [request-function-result__22119__auto__ {}] (portkey.aws/-call-http (clojure.core/into request-function-result__22119__auto__ {:http.request.configuration/endpoints portkey.aws.elasticbeanstalk.-2010-12-01/endpoints, :http.request.configuration/target-prefix nil, :http.request.spec/output-spec :portkey.aws.elasticbeanstalk.-2010-12-01/list-available-solution-stacks-result-message, :http.request.configuration/mime-type {"content-type" "application/x-www-form-urlencoded; charset=utf-8"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2010-12-01", :http.request.configuration/service-id "Elastic Beanstalk", :http.request.spec/input-spec nil, :http.request.configuration/protocol "query", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper "ListAvailableSolutionStacksResult", :http.request.configuration/action "ListAvailableSolutionStacks", :http.request.configuration/output-deser-fn response-list-available-solution-stacks-result-message, :http.request.spec/error-spec {}})))))
(clojure.spec.alpha/fdef list-available-solution-stacks :args clojure.core/empty? :ret (clojure.spec.alpha/and :portkey.aws.elasticbeanstalk.-2010-12-01/list-available-solution-stacks-result-message))

(clojure.core/defn create-configuration-template "Creates a configuration template. Templates are associated with a specific\napplication and are used to deploy different versions of the application with\nthe same configuration settings.\n Templates aren't associated with any environment. The EnvironmentName response\nelement is always null.\n Related Topics\n * DescribeConfigurationOptions\n * DescribeConfigurationSettings\n * ListAvailableSolutionStacks" ([create-configuration-template-messageinput] (clojure.core/let [request-function-result__22119__auto__ (req-create-configuration-template-message create-configuration-template-messageinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__22119__auto__ {:http.request.configuration/endpoints portkey.aws.elasticbeanstalk.-2010-12-01/endpoints, :http.request.configuration/target-prefix nil, :http.request.spec/output-spec :portkey.aws.elasticbeanstalk.-2010-12-01/configuration-settings-description, :http.request.configuration/mime-type {"content-type" "application/x-www-form-urlencoded; charset=utf-8"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2010-12-01", :http.request.configuration/service-id "Elastic Beanstalk", :http.request.spec/input-spec :portkey.aws.elasticbeanstalk.-2010-12-01/create-configuration-template-message, :http.request.configuration/protocol "query", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper "CreateConfigurationTemplateResult", :http.request.configuration/action "CreateConfigurationTemplate", :http.request.configuration/output-deser-fn response-configuration-settings-description, :http.request.spec/error-spec {"InsufficientPrivilegesException" :portkey.aws.elasticbeanstalk.-2010-12-01/insufficient-privileges-exception, "TooManyBucketsException" :portkey.aws.elasticbeanstalk.-2010-12-01/too-many-buckets-exception, "TooManyConfigurationTemplatesException" :portkey.aws.elasticbeanstalk.-2010-12-01/too-many-configuration-templates-exception}})))))
(clojure.spec.alpha/fdef create-configuration-template :args (clojure.spec.alpha/tuple :portkey.aws.elasticbeanstalk.-2010-12-01/create-configuration-template-message) :ret (clojure.spec.alpha/and :portkey.aws.elasticbeanstalk.-2010-12-01/configuration-settings-description))

(clojure.core/defn describe-environment-managed-action-history "Lists an environment's completed and failed managed actions." ([] (describe-environment-managed-action-history {})) ([describe-environment-managed-action-history-requestinput] (clojure.core/let [request-function-result__22119__auto__ (req-describe-environment-managed-action-history-request describe-environment-managed-action-history-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__22119__auto__ {:http.request.configuration/endpoints portkey.aws.elasticbeanstalk.-2010-12-01/endpoints, :http.request.configuration/target-prefix nil, :http.request.spec/output-spec :portkey.aws.elasticbeanstalk.-2010-12-01/describe-environment-managed-action-history-result, :http.request.configuration/mime-type {"content-type" "application/x-www-form-urlencoded; charset=utf-8"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2010-12-01", :http.request.configuration/service-id "Elastic Beanstalk", :http.request.spec/input-spec :portkey.aws.elasticbeanstalk.-2010-12-01/describe-environment-managed-action-history-request, :http.request.configuration/protocol "query", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper "DescribeEnvironmentManagedActionHistoryResult", :http.request.configuration/action "DescribeEnvironmentManagedActionHistory", :http.request.configuration/output-deser-fn response-describe-environment-managed-action-history-result, :http.request.spec/error-spec {"ElasticBeanstalkServiceException" :portkey.aws.elasticbeanstalk.-2010-12-01/elastic-beanstalk-service-exception}})))))
(clojure.spec.alpha/fdef describe-environment-managed-action-history :args (clojure.spec.alpha/? :portkey.aws.elasticbeanstalk.-2010-12-01/describe-environment-managed-action-history-request) :ret (clojure.spec.alpha/and :portkey.aws.elasticbeanstalk.-2010-12-01/describe-environment-managed-action-history-result))
