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

(clojure.core/defn- deser-solution-stack-description [input] (clojure.core/let [letvar359789 {"SolutionStackName" (portkey.aws/search-for-tag input "SolutionStackName" :flattened? nil :xmlAttribute? nil), "PermittedFileTypes" (portkey.aws/search-for-tag input "PermittedFileTypes" :flattened? nil :xmlAttribute? nil)}] (clojure.core/cond-> {} (letvar359789 "SolutionStackName") (clojure.core/assoc :solution-stack-name (deser-solution-stack-name (clojure.core/get-in letvar359789 ["SolutionStackName" :content]))) (letvar359789 "PermittedFileTypes") (clojure.core/assoc :permitted-file-types (deser-solution-stack-file-type-list (clojure.core/get-in letvar359789 ["PermittedFileTypes" :content]))))))

(clojure.core/defn- deser-version-label [input] (portkey.aws/unbox-xml-primitive-value input))

(clojure.core/defn- deser-event-message [input] (portkey.aws/unbox-xml-primitive-value input))

(clojure.core/defn- deser-application-version-arn [input] (portkey.aws/unbox-xml-primitive-value input))

(clojure.core/defn- deser-source-repository [input] (clojure.core/get {"CodeCommit" :code-commit, "S3" :s-3} (portkey.aws/unbox-xml-primitive-value input)))

(clojure.core/defn- deser-event-severity [input] (clojure.core/get {"TRACE" :trace, "DEBUG" :debug, "INFO" :info, "WARN" :warn, "ERROR" :error, "FATAL" :fatal} (portkey.aws/unbox-xml-primitive-value input)))

(clojure.core/defn- deser-platform-framework [input] (clojure.core/let [letvar359922 {"Name" (portkey.aws/search-for-tag input "Name" :flattened? nil :xmlAttribute? nil), "Version" (portkey.aws/search-for-tag input "Version" :flattened? nil :xmlAttribute? nil)}] (clojure.core/cond-> {} (letvar359922 "Name") (clojure.core/assoc :name (deser-string (clojure.core/get-in letvar359922 ["Name" :content]))) (letvar359922 "Version") (clojure.core/assoc :version (deser-string (clojure.core/get-in letvar359922 ["Version" :content]))))))

(clojure.core/defn- deser-instance-id [input] (portkey.aws/unbox-xml-primitive-value input))

(clojure.core/defn- deser-configuration-template-names-list [input] (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (deser-configuration-template-name coll))) input))

(clojure.core/defn- deser-cause [input] (portkey.aws/unbox-xml-primitive-value input))

(clojure.core/defn- deser-cname-availability [input] (clojure.core/when-let [boolstr__283693__auto__ (portkey.aws/unbox-xml-primitive-value input)] (clojure.core/cond (clojure.core/= "true" boolstr__283693__auto__) true (clojure.core/= "false" boolstr__283693__auto__) false)))

(clojure.core/defn- deser-boxed-int [input] (java.lang.Integer. (portkey.aws/unbox-xml-primitive-value input)))

(clojure.core/defn- deser-file-type-extension [input] (portkey.aws/unbox-xml-primitive-value input))

(clojure.core/defn- deser-deployment [input] (clojure.core/let [letvar360066 {"VersionLabel" (portkey.aws/search-for-tag input "VersionLabel" :flattened? nil :xmlAttribute? nil), "DeploymentId" (portkey.aws/search-for-tag input "DeploymentId" :flattened? nil :xmlAttribute? nil), "Status" (portkey.aws/search-for-tag input "Status" :flattened? nil :xmlAttribute? nil), "DeploymentTime" (portkey.aws/search-for-tag input "DeploymentTime" :flattened? nil :xmlAttribute? nil)}] (clojure.core/cond-> {} (letvar360066 "VersionLabel") (clojure.core/assoc :version-label (deser-string (clojure.core/get-in letvar360066 ["VersionLabel" :content]))) (letvar360066 "DeploymentId") (clojure.core/assoc :deployment-id (deser-nullable-long (clojure.core/get-in letvar360066 ["DeploymentId" :content]))) (letvar360066 "Status") (clojure.core/assoc :status (deser-string (clojure.core/get-in letvar360066 ["Status" :content]))) (letvar360066 "DeploymentTime") (clojure.core/assoc :deployment-time (deser-deployment-timestamp (clojure.core/get-in letvar360066 ["DeploymentTime" :content]))))))

(clojure.core/defn- deser-request-id [input] (portkey.aws/unbox-xml-primitive-value input))

(clojure.core/defn- deser-option-namespace [input] (portkey.aws/unbox-xml-primitive-value input))

(clojure.core/defn- deser-launched-at [input] (portkey.aws/unbox-xml-primitive-value input))

(clojure.core/defn- deser-sample-timestamp [input] (portkey.aws/unbox-xml-primitive-value input))

(clojure.core/defn- deser-boxed-boolean [input] (clojure.core/when-let [boolstr__283693__auto__ (portkey.aws/unbox-xml-primitive-value input)] (clojure.core/cond (clojure.core/= "true" boolstr__283693__auto__) true (clojure.core/= "false" boolstr__283693__auto__) false)))

(clojure.core/defn- deser-solution-stack-name [input] (portkey.aws/unbox-xml-primitive-value input))

(clojure.core/defn- deser-platform-name [input] (portkey.aws/unbox-xml-primitive-value input))

(clojure.core/defn- deser-validation-severity [input] (clojure.core/get {"error" :error, "warning" :warning} (portkey.aws/unbox-xml-primitive-value input)))

(clojure.core/defn- deser-load-balancer-description [input] (clojure.core/let [letvar360205 {"LoadBalancerName" (portkey.aws/search-for-tag input "LoadBalancerName" :flattened? nil :xmlAttribute? nil), "Domain" (portkey.aws/search-for-tag input "Domain" :flattened? nil :xmlAttribute? nil), "Listeners" (portkey.aws/search-for-tag input "Listeners" :flattened? nil :xmlAttribute? nil)}] (clojure.core/cond-> {} (letvar360205 "LoadBalancerName") (clojure.core/assoc :load-balancer-name (deser-string (clojure.core/get-in letvar360205 ["LoadBalancerName" :content]))) (letvar360205 "Domain") (clojure.core/assoc :domain (deser-string (clojure.core/get-in letvar360205 ["Domain" :content]))) (letvar360205 "Listeners") (clojure.core/assoc :listeners (deser-load-balancer-listeners-description (clojure.core/get-in letvar360205 ["Listeners" :content]))))))

(clojure.core/defn- deser-image-id [input] (portkey.aws/unbox-xml-primitive-value input))

(clojure.core/defn- deser-validation-messages-list [input] (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (deser-validation-message coll))) input))

(clojure.core/defn- deser-application-arn [input] (portkey.aws/unbox-xml-primitive-value input))

(clojure.core/defn- deser-environment-status [input] (clojure.core/get {"Launching" :launching, "Updating" :updating, "Ready" :ready, "Terminating" :terminating, "Terminated" :terminated} (portkey.aws/unbox-xml-primitive-value input)))

(clojure.core/defn- deser-supported-addon-list [input] (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (deser-supported-addon coll))) input))

(clojure.core/defn- deser-environment-tier [input] (clojure.core/let [letvar360362 {"Name" (portkey.aws/search-for-tag input "Name" :flattened? nil :xmlAttribute? nil), "Type" (portkey.aws/search-for-tag input "Type" :flattened? nil :xmlAttribute? nil), "Version" (portkey.aws/search-for-tag input "Version" :flattened? nil :xmlAttribute? nil)}] (clojure.core/cond-> {} (letvar360362 "Name") (clojure.core/assoc :name (deser-string (clojure.core/get-in letvar360362 ["Name" :content]))) (letvar360362 "Type") (clojure.core/assoc :type (deser-string (clojure.core/get-in letvar360362 ["Type" :content]))) (letvar360362 "Version") (clojure.core/assoc :version (deser-string (clojure.core/get-in letvar360362 ["Version" :content]))))))

(clojure.core/defn- deser-regex-pattern [input] (portkey.aws/unbox-xml-primitive-value input))

(clojure.core/defn- deser-operating-system-name [input] (portkey.aws/unbox-xml-primitive-value input))

(clojure.core/defn- deser-environment-link [input] (clojure.core/let [letvar360480 {"LinkName" (portkey.aws/search-for-tag input "LinkName" :flattened? nil :xmlAttribute? nil), "EnvironmentName" (portkey.aws/search-for-tag input "EnvironmentName" :flattened? nil :xmlAttribute? nil)}] (clojure.core/cond-> {} (letvar360480 "LinkName") (clojure.core/assoc :link-name (deser-string (clojure.core/get-in letvar360480 ["LinkName" :content]))) (letvar360480 "EnvironmentName") (clojure.core/assoc :environment-name (deser-string (clojure.core/get-in letvar360480 ["EnvironmentName" :content]))))))

(clojure.core/defn- deser-configuration-option-severity [input] (portkey.aws/unbox-xml-primitive-value input))

(clojure.core/defn- deser-environment-name [input] (portkey.aws/unbox-xml-primitive-value input))

(clojure.core/defn- deser-managed-actions [input] (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (deser-managed-action coll))) input))

(clojure.core/defn- deser-environment-health-status [input] (clojure.core/get {"Suspended" :suspended, "Info" :info, "Severe" :severe, "Unknown" :unknown, "Warning" :warning, "NoData" :no-data, "Pending" :pending, "Degraded" :degraded, "Ok" :ok} (portkey.aws/unbox-xml-primitive-value input)))

(clojure.core/defn- deser-queue [input] (clojure.core/let [letvar360620 {"Name" (portkey.aws/search-for-tag input "Name" :flattened? nil :xmlAttribute? nil), "URL" (portkey.aws/search-for-tag input "URL" :flattened? nil :xmlAttribute? nil)}] (clojure.core/cond-> {} (letvar360620 "Name") (clojure.core/assoc :name (deser-string (clojure.core/get-in letvar360620 ["Name" :content]))) (letvar360620 "URL") (clojure.core/assoc :url (deser-string (clojure.core/get-in letvar360620 ["URL" :content]))))))

(clojure.core/defn- deser-option-restriction-max-value [input] (java.lang.Integer. (portkey.aws/unbox-xml-primitive-value input)))

(clojure.core/defn- deser-trigger-list [input] (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (deser-trigger coll))) input))

(clojure.core/defn- deser-resource-quota [input] (clojure.core/let [letvar360747 {"Maximum" (portkey.aws/search-for-tag input "Maximum" :flattened? nil :xmlAttribute? nil)}] (clojure.core/cond-> {} (letvar360747 "Maximum") (clojure.core/assoc :maximum (deser-boxed-int (clojure.core/get-in letvar360747 ["Maximum" :content]))))))

(clojure.core/defn- deser-dns-cname [input] (portkey.aws/unbox-xml-primitive-value input))

(clojure.core/defn- deser-tag-key [input] (portkey.aws/unbox-xml-primitive-value input))

(clojure.core/defn- deser-launch-template [input] (clojure.core/let [letvar360865 {"Id" (portkey.aws/search-for-tag input "Id" :flattened? nil :xmlAttribute? nil)}] (clojure.core/cond-> {} (letvar360865 "Id") (clojure.core/assoc :id (deser-resource-id (clojure.core/get-in letvar360865 ["Id" :content]))))))

(clojure.core/defn- deser-environment-descriptions-list [input] (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (deser-environment-description coll))) input))

(clojure.core/defn- deser-application-version-lifecycle-config [input] (clojure.core/let [letvar360990 {"MaxCountRule" (portkey.aws/search-for-tag input "MaxCountRule" :flattened? nil :xmlAttribute? nil), "MaxAgeRule" (portkey.aws/search-for-tag input "MaxAgeRule" :flattened? nil :xmlAttribute? nil)}] (clojure.core/cond-> {} (letvar360990 "MaxCountRule") (clojure.core/assoc :max-count-rule (deser-max-count-rule (clojure.core/get-in letvar360990 ["MaxCountRule" :content]))) (letvar360990 "MaxAgeRule") (clojure.core/assoc :max-age-rule (deser-max-age-rule (clojure.core/get-in letvar360990 ["MaxAgeRule" :content]))))))

(clojure.core/defn- deser-instance-health-list [input] (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (deser-single-instance-health coll))) input))

(clojure.core/defn- deser-arn [input] (portkey.aws/unbox-xml-primitive-value input))

(clojure.core/defn- deser-instance-health-summary [input] (clojure.core/let [letvar361120 {"NoData" (portkey.aws/search-for-tag input "NoData" :flattened? nil :xmlAttribute? nil), "Unknown" (portkey.aws/search-for-tag input "Unknown" :flattened? nil :xmlAttribute? nil), "Pending" (portkey.aws/search-for-tag input "Pending" :flattened? nil :xmlAttribute? nil), "Ok" (portkey.aws/search-for-tag input "Ok" :flattened? nil :xmlAttribute? nil), "Info" (portkey.aws/search-for-tag input "Info" :flattened? nil :xmlAttribute? nil), "Warning" (portkey.aws/search-for-tag input "Warning" :flattened? nil :xmlAttribute? nil), "Degraded" (portkey.aws/search-for-tag input "Degraded" :flattened? nil :xmlAttribute? nil), "Severe" (portkey.aws/search-for-tag input "Severe" :flattened? nil :xmlAttribute? nil)}] (clojure.core/cond-> {} (letvar361120 "NoData") (clojure.core/assoc :no-data (deser-nullable-integer (clojure.core/get-in letvar361120 ["NoData" :content]))) (letvar361120 "Unknown") (clojure.core/assoc :unknown (deser-nullable-integer (clojure.core/get-in letvar361120 ["Unknown" :content]))) (letvar361120 "Pending") (clojure.core/assoc :pending (deser-nullable-integer (clojure.core/get-in letvar361120 ["Pending" :content]))) (letvar361120 "Ok") (clojure.core/assoc :ok (deser-nullable-integer (clojure.core/get-in letvar361120 ["Ok" :content]))) (letvar361120 "Info") (clojure.core/assoc :info (deser-nullable-integer (clojure.core/get-in letvar361120 ["Info" :content]))) (letvar361120 "Warning") (clojure.core/assoc :warning (deser-nullable-integer (clojure.core/get-in letvar361120 ["Warning" :content]))) (letvar361120 "Degraded") (clojure.core/assoc :degraded (deser-nullable-integer (clojure.core/get-in letvar361120 ["Degraded" :content]))) (letvar361120 "Severe") (clojure.core/assoc :severe (deser-nullable-integer (clojure.core/get-in letvar361120 ["Severe" :content]))))))

(clojure.core/defn- deser-load-average-value [input] (java.lang.Double. (portkey.aws/unbox-xml-primitive-value input)))

(clojure.core/defn- deser-source-type [input] (clojure.core/get {"Git" :git, "Zip" :zip} (portkey.aws/unbox-xml-primitive-value input)))

(clojure.core/defn- deser-auto-scaling-group-list [input] (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (deser-auto-scaling-group coll))) input))

(clojure.core/defn- deser-custom-ami [input] (clojure.core/let [letvar361252 {"VirtualizationType" (portkey.aws/search-for-tag input "VirtualizationType" :flattened? nil :xmlAttribute? nil), "ImageId" (portkey.aws/search-for-tag input "ImageId" :flattened? nil :xmlAttribute? nil)}] (clojure.core/cond-> {} (letvar361252 "VirtualizationType") (clojure.core/assoc :virtualization-type (deser-virtualization-type (clojure.core/get-in letvar361252 ["VirtualizationType" :content]))) (letvar361252 "ImageId") (clojure.core/assoc :image-id (deser-image-id (clojure.core/get-in letvar361252 ["ImageId" :content]))))))

(clojure.core/defn- deser-request-count [input] (java.lang.Integer. (portkey.aws/unbox-xml-primitive-value input)))

(clojure.core/defn- deser-regex-label [input] (portkey.aws/unbox-xml-primitive-value input))

(clojure.core/defn- deser-supported-tier-list [input] (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (deser-supported-tier coll))) input))

(clojure.core/defn- deser-application-resource-lifecycle-config [input] (clojure.core/let [letvar361384 {"ServiceRole" (portkey.aws/search-for-tag input "ServiceRole" :flattened? nil :xmlAttribute? nil), "VersionLifecycleConfig" (portkey.aws/search-for-tag input "VersionLifecycleConfig" :flattened? nil :xmlAttribute? nil)}] (clojure.core/cond-> {} (letvar361384 "ServiceRole") (clojure.core/assoc :service-role (deser-string (clojure.core/get-in letvar361384 ["ServiceRole" :content]))) (letvar361384 "VersionLifecycleConfig") (clojure.core/assoc :version-lifecycle-config (deser-application-version-lifecycle-config (clojure.core/get-in letvar361384 ["VersionLifecycleConfig" :content]))))))

(clojure.core/defn- deser-platform-category [input] (portkey.aws/unbox-xml-primitive-value input))

(clojure.core/defn- deser-validation-message [input] (clojure.core/let [letvar361497 {"Message" (portkey.aws/search-for-tag input "Message" :flattened? nil :xmlAttribute? nil), "Severity" (portkey.aws/search-for-tag input "Severity" :flattened? nil :xmlAttribute? nil), "Namespace" (portkey.aws/search-for-tag input "Namespace" :flattened? nil :xmlAttribute? nil), "OptionName" (portkey.aws/search-for-tag input "OptionName" :flattened? nil :xmlAttribute? nil)}] (clojure.core/cond-> {} (letvar361497 "Message") (clojure.core/assoc :message (deser-validation-message-string (clojure.core/get-in letvar361497 ["Message" :content]))) (letvar361497 "Severity") (clojure.core/assoc :severity (deser-validation-severity (clojure.core/get-in letvar361497 ["Severity" :content]))) (letvar361497 "Namespace") (clojure.core/assoc :namespace (deser-option-namespace (clojure.core/get-in letvar361497 ["Namespace" :content]))) (letvar361497 "OptionName") (clojure.core/assoc :option-name (deser-configuration-option-name (clojure.core/get-in letvar361497 ["OptionName" :content]))))))

(clojure.core/defn- deser-platform-summary [input] (clojure.core/let [letvar361605 {"PlatformArn" (portkey.aws/search-for-tag input "PlatformArn" :flattened? nil :xmlAttribute? nil), "PlatformOwner" (portkey.aws/search-for-tag input "PlatformOwner" :flattened? nil :xmlAttribute? nil), "PlatformStatus" (portkey.aws/search-for-tag input "PlatformStatus" :flattened? nil :xmlAttribute? nil), "PlatformCategory" (portkey.aws/search-for-tag input "PlatformCategory" :flattened? nil :xmlAttribute? nil), "OperatingSystemName" (portkey.aws/search-for-tag input "OperatingSystemName" :flattened? nil :xmlAttribute? nil), "OperatingSystemVersion" (portkey.aws/search-for-tag input "OperatingSystemVersion" :flattened? nil :xmlAttribute? nil), "SupportedTierList" (portkey.aws/search-for-tag input "SupportedTierList" :flattened? nil :xmlAttribute? nil), "SupportedAddonList" (portkey.aws/search-for-tag input "SupportedAddonList" :flattened? nil :xmlAttribute? nil)}] (clojure.core/cond-> {} (letvar361605 "PlatformArn") (clojure.core/assoc :platform-arn (deser-platform-arn (clojure.core/get-in letvar361605 ["PlatformArn" :content]))) (letvar361605 "PlatformOwner") (clojure.core/assoc :platform-owner (deser-platform-owner (clojure.core/get-in letvar361605 ["PlatformOwner" :content]))) (letvar361605 "PlatformStatus") (clojure.core/assoc :platform-status (deser-platform-status (clojure.core/get-in letvar361605 ["PlatformStatus" :content]))) (letvar361605 "PlatformCategory") (clojure.core/assoc :platform-category (deser-platform-category (clojure.core/get-in letvar361605 ["PlatformCategory" :content]))) (letvar361605 "OperatingSystemName") (clojure.core/assoc :operating-system-name (deser-operating-system-name (clojure.core/get-in letvar361605 ["OperatingSystemName" :content]))) (letvar361605 "OperatingSystemVersion") (clojure.core/assoc :operating-system-version (deser-operating-system-version (clojure.core/get-in letvar361605 ["OperatingSystemVersion" :content]))) (letvar361605 "SupportedTierList") (clojure.core/assoc :supported-tier-list (deser-supported-tier-list (clojure.core/get-in letvar361605 ["SupportedTierList" :content]))) (letvar361605 "SupportedAddonList") (clojure.core/assoc :supported-addon-list (deser-supported-addon-list (clojure.core/get-in letvar361605 ["SupportedAddonList" :content]))))))

(clojure.core/defn- deser-version-labels-list [input] (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (deser-version-label coll))) input))

(clojure.core/defn- deser-next-token [input] (portkey.aws/unbox-xml-primitive-value input))

(clojure.core/defn- deser-managed-action-history-item [input] (clojure.core/let [letvar361735 {"ActionId" (portkey.aws/search-for-tag input "ActionId" :flattened? nil :xmlAttribute? nil), "ActionType" (portkey.aws/search-for-tag input "ActionType" :flattened? nil :xmlAttribute? nil), "ActionDescription" (portkey.aws/search-for-tag input "ActionDescription" :flattened? nil :xmlAttribute? nil), "FailureType" (portkey.aws/search-for-tag input "FailureType" :flattened? nil :xmlAttribute? nil), "Status" (portkey.aws/search-for-tag input "Status" :flattened? nil :xmlAttribute? nil), "FailureDescription" (portkey.aws/search-for-tag input "FailureDescription" :flattened? nil :xmlAttribute? nil), "ExecutedTime" (portkey.aws/search-for-tag input "ExecutedTime" :flattened? nil :xmlAttribute? nil), "FinishedTime" (portkey.aws/search-for-tag input "FinishedTime" :flattened? nil :xmlAttribute? nil)}] (clojure.core/cond-> {} (letvar361735 "ActionId") (clojure.core/assoc :action-id (deser-string (clojure.core/get-in letvar361735 ["ActionId" :content]))) (letvar361735 "ActionType") (clojure.core/assoc :action-type (deser-action-type (clojure.core/get-in letvar361735 ["ActionType" :content]))) (letvar361735 "ActionDescription") (clojure.core/assoc :action-description (deser-string (clojure.core/get-in letvar361735 ["ActionDescription" :content]))) (letvar361735 "FailureType") (clojure.core/assoc :failure-type (deser-failure-type (clojure.core/get-in letvar361735 ["FailureType" :content]))) (letvar361735 "Status") (clojure.core/assoc :status (deser-action-history-status (clojure.core/get-in letvar361735 ["Status" :content]))) (letvar361735 "FailureDescription") (clojure.core/assoc :failure-description (deser-string (clojure.core/get-in letvar361735 ["FailureDescription" :content]))) (letvar361735 "ExecutedTime") (clojure.core/assoc :executed-time (deser-timestamp (clojure.core/get-in letvar361735 ["ExecutedTime" :content]))) (letvar361735 "FinishedTime") (clojure.core/assoc :finished-time (deser-timestamp (clojure.core/get-in letvar361735 ["FinishedTime" :content]))))))

(clojure.core/defn- deser-environment-info-type [input] (clojure.core/get {"tail" :tail, "bundle" :bundle} (portkey.aws/unbox-xml-primitive-value input)))

(clojure.core/defn- deser-configuration-option-name [input] (portkey.aws/unbox-xml-primitive-value input))

(clojure.core/defn- deser-resource-id [input] (portkey.aws/unbox-xml-primitive-value input))

(clojure.core/defn- deser-platform-frameworks [input] (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (deser-platform-framework coll))) input))

(clojure.core/defn- deser-application-version-description-list [input] (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (deser-application-version-description coll))) input))

(clojure.core/defn- deser-resource-quotas [input] (clojure.core/let [letvar361892 {"ApplicationQuota" (portkey.aws/search-for-tag input "ApplicationQuota" :flattened? nil :xmlAttribute? nil), "ApplicationVersionQuota" (portkey.aws/search-for-tag input "ApplicationVersionQuota" :flattened? nil :xmlAttribute? nil), "EnvironmentQuota" (portkey.aws/search-for-tag input "EnvironmentQuota" :flattened? nil :xmlAttribute? nil), "ConfigurationTemplateQuota" (portkey.aws/search-for-tag input "ConfigurationTemplateQuota" :flattened? nil :xmlAttribute? nil), "CustomPlatformQuota" (portkey.aws/search-for-tag input "CustomPlatformQuota" :flattened? nil :xmlAttribute? nil)}] (clojure.core/cond-> {} (letvar361892 "ApplicationQuota") (clojure.core/assoc :application-quota (deser-resource-quota (clojure.core/get-in letvar361892 ["ApplicationQuota" :content]))) (letvar361892 "ApplicationVersionQuota") (clojure.core/assoc :application-version-quota (deser-resource-quota (clojure.core/get-in letvar361892 ["ApplicationVersionQuota" :content]))) (letvar361892 "EnvironmentQuota") (clojure.core/assoc :environment-quota (deser-resource-quota (clojure.core/get-in letvar361892 ["EnvironmentQuota" :content]))) (letvar361892 "ConfigurationTemplateQuota") (clojure.core/assoc :configuration-template-quota (deser-resource-quota (clojure.core/get-in letvar361892 ["ConfigurationTemplateQuota" :content]))) (letvar361892 "CustomPlatformQuota") (clojure.core/assoc :custom-platform-quota (deser-resource-quota (clojure.core/get-in letvar361892 ["CustomPlatformQuota" :content]))))))

(clojure.core/defn- deser-environment-arn [input] (portkey.aws/unbox-xml-primitive-value input))

(clojure.core/defn- deser-available-solution-stack-details-list [input] (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (deser-solution-stack-description coll))) input))

(clojure.core/defn- deser-tag-list [input] (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (deser-tag coll))) input))

(clojure.core/defn- deser-managed-action [input] (clojure.core/let [letvar362039 {"ActionId" (portkey.aws/search-for-tag input "ActionId" :flattened? nil :xmlAttribute? nil), "ActionDescription" (portkey.aws/search-for-tag input "ActionDescription" :flattened? nil :xmlAttribute? nil), "ActionType" (portkey.aws/search-for-tag input "ActionType" :flattened? nil :xmlAttribute? nil), "Status" (portkey.aws/search-for-tag input "Status" :flattened? nil :xmlAttribute? nil), "WindowStartTime" (portkey.aws/search-for-tag input "WindowStartTime" :flattened? nil :xmlAttribute? nil)}] (clojure.core/cond-> {} (letvar362039 "ActionId") (clojure.core/assoc :action-id (deser-string (clojure.core/get-in letvar362039 ["ActionId" :content]))) (letvar362039 "ActionDescription") (clojure.core/assoc :action-description (deser-string (clojure.core/get-in letvar362039 ["ActionDescription" :content]))) (letvar362039 "ActionType") (clojure.core/assoc :action-type (deser-action-type (clojure.core/get-in letvar362039 ["ActionType" :content]))) (letvar362039 "Status") (clojure.core/assoc :status (deser-action-status (clojure.core/get-in letvar362039 ["Status" :content]))) (letvar362039 "WindowStartTime") (clojure.core/assoc :window-start-time (deser-timestamp (clojure.core/get-in letvar362039 ["WindowStartTime" :content]))))))

(clojure.core/defn- deser-platform-owner [input] (portkey.aws/unbox-xml-primitive-value input))

(clojure.core/defn- deser-environment-resource-description [input] (clojure.core/let [letvar362152 {"EnvironmentName" (portkey.aws/search-for-tag input "EnvironmentName" :flattened? nil :xmlAttribute? nil), "AutoScalingGroups" (portkey.aws/search-for-tag input "AutoScalingGroups" :flattened? nil :xmlAttribute? nil), "Instances" (portkey.aws/search-for-tag input "Instances" :flattened? nil :xmlAttribute? nil), "LaunchConfigurations" (portkey.aws/search-for-tag input "LaunchConfigurations" :flattened? nil :xmlAttribute? nil), "LaunchTemplates" (portkey.aws/search-for-tag input "LaunchTemplates" :flattened? nil :xmlAttribute? nil), "LoadBalancers" (portkey.aws/search-for-tag input "LoadBalancers" :flattened? nil :xmlAttribute? nil), "Triggers" (portkey.aws/search-for-tag input "Triggers" :flattened? nil :xmlAttribute? nil), "Queues" (portkey.aws/search-for-tag input "Queues" :flattened? nil :xmlAttribute? nil)}] (clojure.core/cond-> {} (letvar362152 "EnvironmentName") (clojure.core/assoc :environment-name (deser-environment-name (clojure.core/get-in letvar362152 ["EnvironmentName" :content]))) (letvar362152 "AutoScalingGroups") (clojure.core/assoc :auto-scaling-groups (deser-auto-scaling-group-list (clojure.core/get-in letvar362152 ["AutoScalingGroups" :content]))) (letvar362152 "Instances") (clojure.core/assoc :instances (deser-instance-list (clojure.core/get-in letvar362152 ["Instances" :content]))) (letvar362152 "LaunchConfigurations") (clojure.core/assoc :launch-configurations (deser-launch-configuration-list (clojure.core/get-in letvar362152 ["LaunchConfigurations" :content]))) (letvar362152 "LaunchTemplates") (clojure.core/assoc :launch-templates (deser-launch-template-list (clojure.core/get-in letvar362152 ["LaunchTemplates" :content]))) (letvar362152 "LoadBalancers") (clojure.core/assoc :load-balancers (deser-load-balancer-list (clojure.core/get-in letvar362152 ["LoadBalancers" :content]))) (letvar362152 "Triggers") (clojure.core/assoc :triggers (deser-trigger-list (clojure.core/get-in letvar362152 ["Triggers" :content]))) (letvar362152 "Queues") (clojure.core/assoc :queues (deser-queue-list (clojure.core/get-in letvar362152 ["Queues" :content]))))))

(clojure.core/defn- deser-supported-addon [input] (portkey.aws/unbox-xml-primitive-value input))

(clojure.core/defn- deser-action-status [input] (clojure.core/get {"Scheduled" :scheduled, "Pending" :pending, "Running" :running, "Unknown" :unknown} (portkey.aws/unbox-xml-primitive-value input)))

(clojure.core/defn- deser-abortable-operation-in-progress [input] (clojure.core/when-let [boolstr__283693__auto__ (portkey.aws/unbox-xml-primitive-value input)] (clojure.core/cond (clojure.core/= "true" boolstr__283693__auto__) true (clojure.core/= "false" boolstr__283693__auto__) false)))

(clojure.core/defn- deser-causes [input] (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (deser-cause coll))) input))

(clojure.core/defn- deser-nullable-long [input] (java.lang.Long. (portkey.aws/unbox-xml-primitive-value input)))

(clojure.core/defn- deser-configuration-option-value-type [input] (clojure.core/get {"Scalar" :scalar, "List" :list} (portkey.aws/unbox-xml-primitive-value input)))

(clojure.core/defn- deser-application-version-status [input] (clojure.core/get {"Processed" :processed, "Unprocessed" :unprocessed, "Failed" :failed, "Processing" :processing, "Building" :building} (portkey.aws/unbox-xml-primitive-value input)))

(clojure.core/defn- deser-maintainer [input] (portkey.aws/unbox-xml-primitive-value input))

(clojure.core/defn- deser-description [input] (portkey.aws/unbox-xml-primitive-value input))

(clojure.core/defn- deser-tag-value [input] (portkey.aws/unbox-xml-primitive-value input))

(clojure.core/defn- deser-configuration-option-settings-list [input] (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (deser-configuration-option-setting coll))) input))

(clojure.core/defn- deser-configuration-option-setting [input] (clojure.core/let [letvar362333 {"ResourceName" (portkey.aws/search-for-tag input "ResourceName" :flattened? nil :xmlAttribute? nil), "Namespace" (portkey.aws/search-for-tag input "Namespace" :flattened? nil :xmlAttribute? nil), "OptionName" (portkey.aws/search-for-tag input "OptionName" :flattened? nil :xmlAttribute? nil), "Value" (portkey.aws/search-for-tag input "Value" :flattened? nil :xmlAttribute? nil)}] (clojure.core/cond-> {} (letvar362333 "ResourceName") (clojure.core/assoc :resource-name (deser-resource-name (clojure.core/get-in letvar362333 ["ResourceName" :content]))) (letvar362333 "Namespace") (clojure.core/assoc :namespace (deser-option-namespace (clojure.core/get-in letvar362333 ["Namespace" :content]))) (letvar362333 "OptionName") (clojure.core/assoc :option-name (deser-configuration-option-name (clojure.core/get-in letvar362333 ["OptionName" :content]))) (letvar362333 "Value") (clojure.core/assoc :value (deser-configuration-option-value (clojure.core/get-in letvar362333 ["Value" :content]))))))

(clojure.core/defn- deser-action-history-status [input] (clojure.core/get {"Completed" :completed, "Failed" :failed, "Unknown" :unknown} (portkey.aws/unbox-xml-primitive-value input)))

(clojure.core/defn- deser-environment-info-description-list [input] (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (deser-environment-info-description coll))) input))

(clojure.core/defn- deser-endpoint-url [input] (portkey.aws/unbox-xml-primitive-value input))

(clojure.core/defn- deser-builder [input] (clojure.core/let [letvar362468 {"ARN" (portkey.aws/search-for-tag input "ARN" :flattened? nil :xmlAttribute? nil)}] (clojure.core/cond-> {} (letvar362468 "ARN") (clojure.core/assoc :arn (deser-arn (clojure.core/get-in letvar362468 ["ARN" :content]))))))

(clojure.core/defn- deser-exception-message [input] (portkey.aws/unbox-xml-primitive-value input))

(clojure.core/defn- deser-message [input] (portkey.aws/unbox-xml-primitive-value input))

(clojure.core/defn- deser-max-count-rule [input] (clojure.core/let [letvar362586 {"Enabled" (portkey.aws/search-for-tag input "Enabled" :flattened? nil :xmlAttribute? nil), "MaxCount" (portkey.aws/search-for-tag input "MaxCount" :flattened? nil :xmlAttribute? nil), "DeleteSourceFromS3" (portkey.aws/search-for-tag input "DeleteSourceFromS3" :flattened? nil :xmlAttribute? nil)}] (clojure.core/cond-> {:enabled (deser-boxed-boolean (clojure.core/get-in letvar362586 ["Enabled" :content]))} (letvar362586 "MaxCount") (clojure.core/assoc :max-count (deser-boxed-int (clojure.core/get-in letvar362586 ["MaxCount" :content]))) (letvar362586 "DeleteSourceFromS3") (clojure.core/assoc :delete-source-from-s-3 (deser-boxed-boolean (clojure.core/get-in letvar362586 ["DeleteSourceFromS3" :content]))))))

(clojure.core/defn- deser-auto-scaling-group [input] (clojure.core/let [letvar362694 {"Name" (portkey.aws/search-for-tag input "Name" :flattened? nil :xmlAttribute? nil)}] (clojure.core/cond-> {} (letvar362694 "Name") (clojure.core/assoc :name (deser-resource-id (clojure.core/get-in letvar362694 ["Name" :content]))))))

(clojure.core/defn- deser-single-instance-health [input] (clojure.core/let [letvar362802 {"InstanceId" (portkey.aws/search-for-tag input "InstanceId" :flattened? nil :xmlAttribute? nil), "Deployment" (portkey.aws/search-for-tag input "Deployment" :flattened? nil :xmlAttribute? nil), "LaunchedAt" (portkey.aws/search-for-tag input "LaunchedAt" :flattened? nil :xmlAttribute? nil), "InstanceType" (portkey.aws/search-for-tag input "InstanceType" :flattened? nil :xmlAttribute? nil), "HealthStatus" (portkey.aws/search-for-tag input "HealthStatus" :flattened? nil :xmlAttribute? nil), "AvailabilityZone" (portkey.aws/search-for-tag input "AvailabilityZone" :flattened? nil :xmlAttribute? nil), "Causes" (portkey.aws/search-for-tag input "Causes" :flattened? nil :xmlAttribute? nil), "ApplicationMetrics" (portkey.aws/search-for-tag input "ApplicationMetrics" :flattened? nil :xmlAttribute? nil), "System" (portkey.aws/search-for-tag input "System" :flattened? nil :xmlAttribute? nil), "Color" (portkey.aws/search-for-tag input "Color" :flattened? nil :xmlAttribute? nil)}] (clojure.core/cond-> {} (letvar362802 "InstanceId") (clojure.core/assoc :instance-id (deser-instance-id (clojure.core/get-in letvar362802 ["InstanceId" :content]))) (letvar362802 "Deployment") (clojure.core/assoc :deployment (deser-deployment (clojure.core/get-in letvar362802 ["Deployment" :content]))) (letvar362802 "LaunchedAt") (clojure.core/assoc :launched-at (deser-launched-at (clojure.core/get-in letvar362802 ["LaunchedAt" :content]))) (letvar362802 "InstanceType") (clojure.core/assoc :instance-type (deser-string (clojure.core/get-in letvar362802 ["InstanceType" :content]))) (letvar362802 "HealthStatus") (clojure.core/assoc :health-status (deser-string (clojure.core/get-in letvar362802 ["HealthStatus" :content]))) (letvar362802 "AvailabilityZone") (clojure.core/assoc :availability-zone (deser-string (clojure.core/get-in letvar362802 ["AvailabilityZone" :content]))) (letvar362802 "Causes") (clojure.core/assoc :causes (deser-causes (clojure.core/get-in letvar362802 ["Causes" :content]))) (letvar362802 "ApplicationMetrics") (clojure.core/assoc :application-metrics (deser-application-metrics (clojure.core/get-in letvar362802 ["ApplicationMetrics" :content]))) (letvar362802 "System") (clojure.core/assoc :system (deser-system-status (clojure.core/get-in letvar362802 ["System" :content]))) (letvar362802 "Color") (clojure.core/assoc :color (deser-string (clojure.core/get-in letvar362802 ["Color" :content]))))))

(clojure.core/defn- deser-application-name [input] (portkey.aws/unbox-xml-primitive-value input))

(clojure.core/defn- deser-event-date [input] (portkey.aws/unbox-xml-primitive-value input))

(clojure.core/defn- deser-validation-message-string [input] (portkey.aws/unbox-xml-primitive-value input))

(clojure.core/defn- deser-platform-version [input] (portkey.aws/unbox-xml-primitive-value input))

(clojure.core/defn- deser-resource-name [input] (portkey.aws/unbox-xml-primitive-value input))

(clojure.core/defn- deser-integer [input] (java.lang.Integer. (portkey.aws/unbox-xml-primitive-value input)))

(clojure.core/defn- deser-string [input] (portkey.aws/unbox-xml-primitive-value input))

(clojure.core/defn- deser-platform-programming-languages [input] (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (deser-platform-programming-language coll))) input))

(clojure.core/defn- deser-application-metrics [input] (clojure.core/let [letvar362956 {"Duration" (portkey.aws/search-for-tag input "Duration" :flattened? nil :xmlAttribute? nil), "RequestCount" (portkey.aws/search-for-tag input "RequestCount" :flattened? nil :xmlAttribute? nil), "StatusCodes" (portkey.aws/search-for-tag input "StatusCodes" :flattened? nil :xmlAttribute? nil), "Latency" (portkey.aws/search-for-tag input "Latency" :flattened? nil :xmlAttribute? nil)}] (clojure.core/cond-> {} (letvar362956 "Duration") (clojure.core/assoc :duration (deser-nullable-integer (clojure.core/get-in letvar362956 ["Duration" :content]))) (letvar362956 "RequestCount") (clojure.core/assoc :request-count (deser-request-count (clojure.core/get-in letvar362956 ["RequestCount" :content]))) (letvar362956 "StatusCodes") (clojure.core/assoc :status-codes (deser-status-codes (clojure.core/get-in letvar362956 ["StatusCodes" :content]))) (letvar362956 "Latency") (clojure.core/assoc :latency (deser-latency (clojure.core/get-in letvar362956 ["Latency" :content]))))))

(clojure.core/defn- deser-operating-system-version [input] (portkey.aws/unbox-xml-primitive-value input))

(clojure.core/defn- deser-option-restriction-min-value [input] (java.lang.Integer. (portkey.aws/unbox-xml-primitive-value input)))

(clojure.core/defn- deser-status-codes [input] (clojure.core/let [letvar363071 {"Status2xx" (portkey.aws/search-for-tag input "Status2xx" :flattened? nil :xmlAttribute? nil), "Status3xx" (portkey.aws/search-for-tag input "Status3xx" :flattened? nil :xmlAttribute? nil), "Status4xx" (portkey.aws/search-for-tag input "Status4xx" :flattened? nil :xmlAttribute? nil), "Status5xx" (portkey.aws/search-for-tag input "Status5xx" :flattened? nil :xmlAttribute? nil)}] (clojure.core/cond-> {} (letvar363071 "Status2xx") (clojure.core/assoc :status-2xx (deser-nullable-integer (clojure.core/get-in letvar363071 ["Status2xx" :content]))) (letvar363071 "Status3xx") (clojure.core/assoc :status-3xx (deser-nullable-integer (clojure.core/get-in letvar363071 ["Status3xx" :content]))) (letvar363071 "Status4xx") (clojure.core/assoc :status-4xx (deser-nullable-integer (clojure.core/get-in letvar363071 ["Status4xx" :content]))) (letvar363071 "Status5xx") (clojure.core/assoc :status-5xx (deser-nullable-integer (clojure.core/get-in letvar363071 ["Status5xx" :content]))))))

(clojure.core/defn- deser-deployment-timestamp [input] (portkey.aws/unbox-xml-primitive-value input))

(clojure.core/defn- deser-update-date [input] (portkey.aws/unbox-xml-primitive-value input))

(clojure.core/defn- deser-listener [input] (clojure.core/let [letvar363183 {"Protocol" (portkey.aws/search-for-tag input "Protocol" :flattened? nil :xmlAttribute? nil), "Port" (portkey.aws/search-for-tag input "Port" :flattened? nil :xmlAttribute? nil)}] (clojure.core/cond-> {} (letvar363183 "Protocol") (clojure.core/assoc :protocol (deser-string (clojure.core/get-in letvar363183 ["Protocol" :content]))) (letvar363183 "Port") (clojure.core/assoc :port (deser-integer (clojure.core/get-in letvar363183 ["Port" :content]))))))

(clojure.core/defn- deser-s-3-key [input] (portkey.aws/unbox-xml-primitive-value input))

(clojure.core/defn- deser-configuration-option-possible-value [input] (portkey.aws/unbox-xml-primitive-value input))

(clojure.core/defn- deser-platform-summary-list [input] (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (deser-platform-summary coll))) input))

(clojure.core/defn- deser-failure-type [input] (clojure.core/get {"UpdateCancelled" :update-cancelled, "CancellationFailed" :cancellation-failed, "RollbackFailed" :rollback-failed, "RollbackSuccessful" :rollback-successful, "InternalFailure" :internal-failure, "InvalidEnvironmentState" :invalid-environment-state, "PermissionsError" :permissions-error} (portkey.aws/unbox-xml-primitive-value input)))

(clojure.core/defn- deser-platform-description [input] (clojure.core/let [letvar363323 {"SolutionStackName" (portkey.aws/search-for-tag input "SolutionStackName" :flattened? nil :xmlAttribute? nil), "PlatformName" (portkey.aws/search-for-tag input "PlatformName" :flattened? nil :xmlAttribute? nil), "SupportedAddonList" (portkey.aws/search-for-tag input "SupportedAddonList" :flattened? nil :xmlAttribute? nil), "OperatingSystemName" (portkey.aws/search-for-tag input "OperatingSystemName" :flattened? nil :xmlAttribute? nil), "DateUpdated" (portkey.aws/search-for-tag input "DateUpdated" :flattened? nil :xmlAttribute? nil), "SupportedTierList" (portkey.aws/search-for-tag input "SupportedTierList" :flattened? nil :xmlAttribute? nil), "PlatformCategory" (portkey.aws/search-for-tag input "PlatformCategory" :flattened? nil :xmlAttribute? nil), "ProgrammingLanguages" (portkey.aws/search-for-tag input "ProgrammingLanguages" :flattened? nil :xmlAttribute? nil), "PlatformOwner" (portkey.aws/search-for-tag input "PlatformOwner" :flattened? nil :xmlAttribute? nil), "DateCreated" (portkey.aws/search-for-tag input "DateCreated" :flattened? nil :xmlAttribute? nil), "Maintainer" (portkey.aws/search-for-tag input "Maintainer" :flattened? nil :xmlAttribute? nil), "Description" (portkey.aws/search-for-tag input "Description" :flattened? nil :xmlAttribute? nil), "PlatformVersion" (portkey.aws/search-for-tag input "PlatformVersion" :flattened? nil :xmlAttribute? nil), "OperatingSystemVersion" (portkey.aws/search-for-tag input "OperatingSystemVersion" :flattened? nil :xmlAttribute? nil), "PlatformStatus" (portkey.aws/search-for-tag input "PlatformStatus" :flattened? nil :xmlAttribute? nil), "PlatformArn" (portkey.aws/search-for-tag input "PlatformArn" :flattened? nil :xmlAttribute? nil), "Frameworks" (portkey.aws/search-for-tag input "Frameworks" :flattened? nil :xmlAttribute? nil), "CustomAmiList" (portkey.aws/search-for-tag input "CustomAmiList" :flattened? nil :xmlAttribute? nil)}] (clojure.core/cond-> {} (letvar363323 "SolutionStackName") (clojure.core/assoc :solution-stack-name (deser-solution-stack-name (clojure.core/get-in letvar363323 ["SolutionStackName" :content]))) (letvar363323 "PlatformName") (clojure.core/assoc :platform-name (deser-platform-name (clojure.core/get-in letvar363323 ["PlatformName" :content]))) (letvar363323 "SupportedAddonList") (clojure.core/assoc :supported-addon-list (deser-supported-addon-list (clojure.core/get-in letvar363323 ["SupportedAddonList" :content]))) (letvar363323 "OperatingSystemName") (clojure.core/assoc :operating-system-name (deser-operating-system-name (clojure.core/get-in letvar363323 ["OperatingSystemName" :content]))) (letvar363323 "DateUpdated") (clojure.core/assoc :date-updated (deser-update-date (clojure.core/get-in letvar363323 ["DateUpdated" :content]))) (letvar363323 "SupportedTierList") (clojure.core/assoc :supported-tier-list (deser-supported-tier-list (clojure.core/get-in letvar363323 ["SupportedTierList" :content]))) (letvar363323 "PlatformCategory") (clojure.core/assoc :platform-category (deser-platform-category (clojure.core/get-in letvar363323 ["PlatformCategory" :content]))) (letvar363323 "ProgrammingLanguages") (clojure.core/assoc :programming-languages (deser-platform-programming-languages (clojure.core/get-in letvar363323 ["ProgrammingLanguages" :content]))) (letvar363323 "PlatformOwner") (clojure.core/assoc :platform-owner (deser-platform-owner (clojure.core/get-in letvar363323 ["PlatformOwner" :content]))) (letvar363323 "DateCreated") (clojure.core/assoc :date-created (deser-creation-date (clojure.core/get-in letvar363323 ["DateCreated" :content]))) (letvar363323 "Maintainer") (clojure.core/assoc :maintainer (deser-maintainer (clojure.core/get-in letvar363323 ["Maintainer" :content]))) (letvar363323 "Description") (clojure.core/assoc :description (deser-description (clojure.core/get-in letvar363323 ["Description" :content]))) (letvar363323 "PlatformVersion") (clojure.core/assoc :platform-version (deser-platform-version (clojure.core/get-in letvar363323 ["PlatformVersion" :content]))) (letvar363323 "OperatingSystemVersion") (clojure.core/assoc :operating-system-version (deser-operating-system-version (clojure.core/get-in letvar363323 ["OperatingSystemVersion" :content]))) (letvar363323 "PlatformStatus") (clojure.core/assoc :platform-status (deser-platform-status (clojure.core/get-in letvar363323 ["PlatformStatus" :content]))) (letvar363323 "PlatformArn") (clojure.core/assoc :platform-arn (deser-platform-arn (clojure.core/get-in letvar363323 ["PlatformArn" :content]))) (letvar363323 "Frameworks") (clojure.core/assoc :frameworks (deser-platform-frameworks (clojure.core/get-in letvar363323 ["Frameworks" :content]))) (letvar363323 "CustomAmiList") (clojure.core/assoc :custom-ami-list (deser-custom-ami-list (clojure.core/get-in letvar363323 ["CustomAmiList" :content]))))))

(clojure.core/defn- deser-configuration-settings-description-list [input] (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (deser-configuration-settings-description coll))) input))

(clojure.core/defn- deser-event-description [input] (clojure.core/let [letvar363448 {"VersionLabel" (portkey.aws/search-for-tag input "VersionLabel" :flattened? nil :xmlAttribute? nil), "Severity" (portkey.aws/search-for-tag input "Severity" :flattened? nil :xmlAttribute? nil), "RequestId" (portkey.aws/search-for-tag input "RequestId" :flattened? nil :xmlAttribute? nil), "EnvironmentName" (portkey.aws/search-for-tag input "EnvironmentName" :flattened? nil :xmlAttribute? nil), "Message" (portkey.aws/search-for-tag input "Message" :flattened? nil :xmlAttribute? nil), "ApplicationName" (portkey.aws/search-for-tag input "ApplicationName" :flattened? nil :xmlAttribute? nil), "EventDate" (portkey.aws/search-for-tag input "EventDate" :flattened? nil :xmlAttribute? nil), "TemplateName" (portkey.aws/search-for-tag input "TemplateName" :flattened? nil :xmlAttribute? nil), "PlatformArn" (portkey.aws/search-for-tag input "PlatformArn" :flattened? nil :xmlAttribute? nil)}] (clojure.core/cond-> {} (letvar363448 "VersionLabel") (clojure.core/assoc :version-label (deser-version-label (clojure.core/get-in letvar363448 ["VersionLabel" :content]))) (letvar363448 "Severity") (clojure.core/assoc :severity (deser-event-severity (clojure.core/get-in letvar363448 ["Severity" :content]))) (letvar363448 "RequestId") (clojure.core/assoc :request-id (deser-request-id (clojure.core/get-in letvar363448 ["RequestId" :content]))) (letvar363448 "EnvironmentName") (clojure.core/assoc :environment-name (deser-environment-name (clojure.core/get-in letvar363448 ["EnvironmentName" :content]))) (letvar363448 "Message") (clojure.core/assoc :message (deser-event-message (clojure.core/get-in letvar363448 ["Message" :content]))) (letvar363448 "ApplicationName") (clojure.core/assoc :application-name (deser-application-name (clojure.core/get-in letvar363448 ["ApplicationName" :content]))) (letvar363448 "EventDate") (clojure.core/assoc :event-date (deser-event-date (clojure.core/get-in letvar363448 ["EventDate" :content]))) (letvar363448 "TemplateName") (clojure.core/assoc :template-name (deser-configuration-template-name (clojure.core/get-in letvar363448 ["TemplateName" :content]))) (letvar363448 "PlatformArn") (clojure.core/assoc :platform-arn (deser-platform-arn (clojure.core/get-in letvar363448 ["PlatformArn" :content]))))))

(clojure.core/defn- deser-s-3-location [input] (clojure.core/let [letvar363556 {"S3Bucket" (portkey.aws/search-for-tag input "S3Bucket" :flattened? nil :xmlAttribute? nil), "S3Key" (portkey.aws/search-for-tag input "S3Key" :flattened? nil :xmlAttribute? nil)}] (clojure.core/cond-> {} (letvar363556 "S3Bucket") (clojure.core/assoc :s-3-bucket (deser-s-3-bucket (clojure.core/get-in letvar363556 ["S3Bucket" :content]))) (letvar363556 "S3Key") (clojure.core/assoc :s-3-key (deser-s-3-key (clojure.core/get-in letvar363556 ["S3Key" :content]))))))

(clojure.core/defn- deser-managed-action-history-items [input] (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (deser-managed-action-history-item coll))) input))

(clojure.core/defn- deser-instance-list [input] (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (deser-instance coll))) input))

(clojure.core/defn- deser-launch-template-list [input] (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (deser-launch-template coll))) input))

(clojure.core/defn- deser-max-age-rule [input] (clojure.core/let [letvar363715 {"Enabled" (portkey.aws/search-for-tag input "Enabled" :flattened? nil :xmlAttribute? nil), "MaxAgeInDays" (portkey.aws/search-for-tag input "MaxAgeInDays" :flattened? nil :xmlAttribute? nil), "DeleteSourceFromS3" (portkey.aws/search-for-tag input "DeleteSourceFromS3" :flattened? nil :xmlAttribute? nil)}] (clojure.core/cond-> {:enabled (deser-boxed-boolean (clojure.core/get-in letvar363715 ["Enabled" :content]))} (letvar363715 "MaxAgeInDays") (clojure.core/assoc :max-age-in-days (deser-boxed-int (clojure.core/get-in letvar363715 ["MaxAgeInDays" :content]))) (letvar363715 "DeleteSourceFromS3") (clojure.core/assoc :delete-source-from-s-3 (deser-boxed-boolean (clojure.core/get-in letvar363715 ["DeleteSourceFromS3" :content]))))))

(clojure.core/defn- deser-s-3-bucket [input] (portkey.aws/unbox-xml-primitive-value input))

(clojure.core/defn- deser-refreshed-at [input] (portkey.aws/unbox-xml-primitive-value input))

(clojure.core/defn- deser-source-location [input] (portkey.aws/unbox-xml-primitive-value input))

(clojure.core/defn- deser-cpu-utilization [input] (clojure.core/let [letvar363835 {"User" (portkey.aws/search-for-tag input "User" :flattened? nil :xmlAttribute? nil), "Nice" (portkey.aws/search-for-tag input "Nice" :flattened? nil :xmlAttribute? nil), "System" (portkey.aws/search-for-tag input "System" :flattened? nil :xmlAttribute? nil), "Idle" (portkey.aws/search-for-tag input "Idle" :flattened? nil :xmlAttribute? nil), "IOWait" (portkey.aws/search-for-tag input "IOWait" :flattened? nil :xmlAttribute? nil), "IRQ" (portkey.aws/search-for-tag input "IRQ" :flattened? nil :xmlAttribute? nil), "SoftIRQ" (portkey.aws/search-for-tag input "SoftIRQ" :flattened? nil :xmlAttribute? nil), "Privileged" (portkey.aws/search-for-tag input "Privileged" :flattened? nil :xmlAttribute? nil)}] (clojure.core/cond-> {} (letvar363835 "User") (clojure.core/assoc :user (deser-nullable-double (clojure.core/get-in letvar363835 ["User" :content]))) (letvar363835 "Nice") (clojure.core/assoc :nice (deser-nullable-double (clojure.core/get-in letvar363835 ["Nice" :content]))) (letvar363835 "System") (clojure.core/assoc :system (deser-nullable-double (clojure.core/get-in letvar363835 ["System" :content]))) (letvar363835 "Idle") (clojure.core/assoc :idle (deser-nullable-double (clojure.core/get-in letvar363835 ["Idle" :content]))) (letvar363835 "IOWait") (clojure.core/assoc :io-wait (deser-nullable-double (clojure.core/get-in letvar363835 ["IOWait" :content]))) (letvar363835 "IRQ") (clojure.core/assoc :irq (deser-nullable-double (clojure.core/get-in letvar363835 ["IRQ" :content]))) (letvar363835 "SoftIRQ") (clojure.core/assoc :soft-irq (deser-nullable-double (clojure.core/get-in letvar363835 ["SoftIRQ" :content]))) (letvar363835 "Privileged") (clojure.core/assoc :privileged (deser-nullable-double (clojure.core/get-in letvar363835 ["Privileged" :content]))))))

(clojure.core/defn- deser-creation-date [input] (portkey.aws/unbox-xml-primitive-value input))

(clojure.core/defn- deser-option-restriction-regex [input] (clojure.core/let [letvar363945 {"Pattern" (portkey.aws/search-for-tag input "Pattern" :flattened? nil :xmlAttribute? nil), "Label" (portkey.aws/search-for-tag input "Label" :flattened? nil :xmlAttribute? nil)}] (clojure.core/cond-> {} (letvar363945 "Pattern") (clojure.core/assoc :pattern (deser-regex-pattern (clojure.core/get-in letvar363945 ["Pattern" :content]))) (letvar363945 "Label") (clojure.core/assoc :label (deser-regex-label (clojure.core/get-in letvar363945 ["Label" :content]))))))

(clojure.core/defn- deser-load-balancer [input] (clojure.core/let [letvar364053 {"Name" (portkey.aws/search-for-tag input "Name" :flattened? nil :xmlAttribute? nil)}] (clojure.core/cond-> {} (letvar364053 "Name") (clojure.core/assoc :name (deser-resource-id (clojure.core/get-in letvar364053 ["Name" :content]))))))

(clojure.core/defn- deser-option-restriction-max-length [input] (java.lang.Integer. (portkey.aws/unbox-xml-primitive-value input)))

(clojure.core/defn- deser-timestamp [input] (portkey.aws/unbox-xml-primitive-value input))

(clojure.core/defn- deser-launch-configuration [input] (clojure.core/let [letvar364165 {"Name" (portkey.aws/search-for-tag input "Name" :flattened? nil :xmlAttribute? nil)}] (clojure.core/cond-> {} (letvar364165 "Name") (clojure.core/assoc :name (deser-resource-id (clojure.core/get-in letvar364165 ["Name" :content]))))))

(clojure.core/defn- deser-virtualization-type [input] (portkey.aws/unbox-xml-primitive-value input))

(clojure.core/defn- deser-platform-status [input] (clojure.core/get {"Creating" :creating, "Failed" :failed, "Ready" :ready, "Deleting" :deleting, "Deleted" :deleted} (portkey.aws/unbox-xml-primitive-value input)))

(clojure.core/defn- deser-resource-arn [input] (portkey.aws/unbox-xml-primitive-value input))

(clojure.core/defn- deser-latency [input] (clojure.core/let [letvar364288 {"P999" (portkey.aws/search-for-tag input "P999" :flattened? nil :xmlAttribute? nil), "P99" (portkey.aws/search-for-tag input "P99" :flattened? nil :xmlAttribute? nil), "P95" (portkey.aws/search-for-tag input "P95" :flattened? nil :xmlAttribute? nil), "P90" (portkey.aws/search-for-tag input "P90" :flattened? nil :xmlAttribute? nil), "P85" (portkey.aws/search-for-tag input "P85" :flattened? nil :xmlAttribute? nil), "P75" (portkey.aws/search-for-tag input "P75" :flattened? nil :xmlAttribute? nil), "P50" (portkey.aws/search-for-tag input "P50" :flattened? nil :xmlAttribute? nil), "P10" (portkey.aws/search-for-tag input "P10" :flattened? nil :xmlAttribute? nil)}] (clojure.core/cond-> {} (letvar364288 "P999") (clojure.core/assoc :p-999 (deser-nullable-double (clojure.core/get-in letvar364288 ["P999" :content]))) (letvar364288 "P99") (clojure.core/assoc :p-99 (deser-nullable-double (clojure.core/get-in letvar364288 ["P99" :content]))) (letvar364288 "P95") (clojure.core/assoc :p-95 (deser-nullable-double (clojure.core/get-in letvar364288 ["P95" :content]))) (letvar364288 "P90") (clojure.core/assoc :p-90 (deser-nullable-double (clojure.core/get-in letvar364288 ["P90" :content]))) (letvar364288 "P85") (clojure.core/assoc :p-85 (deser-nullable-double (clojure.core/get-in letvar364288 ["P85" :content]))) (letvar364288 "P75") (clojure.core/assoc :p-75 (deser-nullable-double (clojure.core/get-in letvar364288 ["P75" :content]))) (letvar364288 "P50") (clojure.core/assoc :p-50 (deser-nullable-double (clojure.core/get-in letvar364288 ["P50" :content]))) (letvar364288 "P10") (clojure.core/assoc :p-10 (deser-nullable-double (clojure.core/get-in letvar364288 ["P10" :content]))))))

(clojure.core/defn- deser-configuration-option-possible-values [input] (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (deser-configuration-option-possible-value coll))) input))

(clojure.core/defn- deser-platform-arn [input] (portkey.aws/unbox-xml-primitive-value input))

(clojure.core/defn- deser-ec-2-instance-id [input] (portkey.aws/unbox-xml-primitive-value input))

(clojure.core/defn- deser-tag [input] (clojure.core/let [letvar364423 {"Key" (portkey.aws/search-for-tag input "Key" :flattened? nil :xmlAttribute? nil), "Value" (portkey.aws/search-for-tag input "Value" :flattened? nil :xmlAttribute? nil)}] (clojure.core/cond-> {} (letvar364423 "Key") (clojure.core/assoc :key (deser-tag-key (clojure.core/get-in letvar364423 ["Key" :content]))) (letvar364423 "Value") (clojure.core/assoc :value (deser-tag-value (clojure.core/get-in letvar364423 ["Value" :content]))))))

(clojure.core/defn- deser-solution-stack-file-type-list [input] (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (deser-file-type-extension coll))) input))

(clojure.core/defn- deser-environment-links [input] (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (deser-environment-link coll))) input))

(clojure.core/defn- deser-nullable-integer [input] (java.lang.Integer. (portkey.aws/unbox-xml-primitive-value input)))

(clojure.core/defn- deser-instance [input] (clojure.core/let [letvar364567 {"Id" (portkey.aws/search-for-tag input "Id" :flattened? nil :xmlAttribute? nil)}] (clojure.core/cond-> {} (letvar364567 "Id") (clojure.core/assoc :id (deser-resource-id (clojure.core/get-in letvar364567 ["Id" :content]))))))

(clojure.core/defn- deser-configuration-option-descriptions-list [input] (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (deser-configuration-option-description coll))) input))

(clojure.core/defn- deser-event-description-list [input] (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (deser-event-description coll))) input))

(clojure.core/defn- deser-load-average [input] (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (deser-load-average-value coll))) input))

(clojure.core/defn- deser-action-type [input] (clojure.core/get {"InstanceRefresh" :instance-refresh, "PlatformUpdate" :platform-update, "Unknown" :unknown} (portkey.aws/unbox-xml-primitive-value input)))

(clojure.core/defn- deser-application-version-description [input] (clojure.core/let [letvar364731 {"VersionLabel" (portkey.aws/search-for-tag input "VersionLabel" :flattened? nil :xmlAttribute? nil), "ApplicationVersionArn" (portkey.aws/search-for-tag input "ApplicationVersionArn" :flattened? nil :xmlAttribute? nil), "SourceBundle" (portkey.aws/search-for-tag input "SourceBundle" :flattened? nil :xmlAttribute? nil), "DateUpdated" (portkey.aws/search-for-tag input "DateUpdated" :flattened? nil :xmlAttribute? nil), "BuildArn" (portkey.aws/search-for-tag input "BuildArn" :flattened? nil :xmlAttribute? nil), "Status" (portkey.aws/search-for-tag input "Status" :flattened? nil :xmlAttribute? nil), "DateCreated" (portkey.aws/search-for-tag input "DateCreated" :flattened? nil :xmlAttribute? nil), "Description" (portkey.aws/search-for-tag input "Description" :flattened? nil :xmlAttribute? nil), "ApplicationName" (portkey.aws/search-for-tag input "ApplicationName" :flattened? nil :xmlAttribute? nil), "SourceBuildInformation" (portkey.aws/search-for-tag input "SourceBuildInformation" :flattened? nil :xmlAttribute? nil)}] (clojure.core/cond-> {} (letvar364731 "VersionLabel") (clojure.core/assoc :version-label (deser-version-label (clojure.core/get-in letvar364731 ["VersionLabel" :content]))) (letvar364731 "ApplicationVersionArn") (clojure.core/assoc :application-version-arn (deser-application-version-arn (clojure.core/get-in letvar364731 ["ApplicationVersionArn" :content]))) (letvar364731 "SourceBundle") (clojure.core/assoc :source-bundle (deser-s-3-location (clojure.core/get-in letvar364731 ["SourceBundle" :content]))) (letvar364731 "DateUpdated") (clojure.core/assoc :date-updated (deser-update-date (clojure.core/get-in letvar364731 ["DateUpdated" :content]))) (letvar364731 "BuildArn") (clojure.core/assoc :build-arn (deser-string (clojure.core/get-in letvar364731 ["BuildArn" :content]))) (letvar364731 "Status") (clojure.core/assoc :status (deser-application-version-status (clojure.core/get-in letvar364731 ["Status" :content]))) (letvar364731 "DateCreated") (clojure.core/assoc :date-created (deser-creation-date (clojure.core/get-in letvar364731 ["DateCreated" :content]))) (letvar364731 "Description") (clojure.core/assoc :description (deser-description (clojure.core/get-in letvar364731 ["Description" :content]))) (letvar364731 "ApplicationName") (clojure.core/assoc :application-name (deser-application-name (clojure.core/get-in letvar364731 ["ApplicationName" :content]))) (letvar364731 "SourceBuildInformation") (clojure.core/assoc :source-build-information (deser-source-build-information (clojure.core/get-in letvar364731 ["SourceBuildInformation" :content]))))))

(clojure.core/defn- deser-application-description-list [input] (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (deser-application-description coll))) input))

(clojure.core/defn- deser-configuration-option-default-value [input] (portkey.aws/unbox-xml-primitive-value input))

(clojure.core/defn- deser-configuration-settings-description [input] (clojure.core/let [letvar364861 {"SolutionStackName" (portkey.aws/search-for-tag input "SolutionStackName" :flattened? nil :xmlAttribute? nil), "DateUpdated" (portkey.aws/search-for-tag input "DateUpdated" :flattened? nil :xmlAttribute? nil), "EnvironmentName" (portkey.aws/search-for-tag input "EnvironmentName" :flattened? nil :xmlAttribute? nil), "OptionSettings" (portkey.aws/search-for-tag input "OptionSettings" :flattened? nil :xmlAttribute? nil), "DateCreated" (portkey.aws/search-for-tag input "DateCreated" :flattened? nil :xmlAttribute? nil), "Description" (portkey.aws/search-for-tag input "Description" :flattened? nil :xmlAttribute? nil), "ApplicationName" (portkey.aws/search-for-tag input "ApplicationName" :flattened? nil :xmlAttribute? nil), "TemplateName" (portkey.aws/search-for-tag input "TemplateName" :flattened? nil :xmlAttribute? nil), "DeploymentStatus" (portkey.aws/search-for-tag input "DeploymentStatus" :flattened? nil :xmlAttribute? nil), "PlatformArn" (portkey.aws/search-for-tag input "PlatformArn" :flattened? nil :xmlAttribute? nil)}] (clojure.core/cond-> {} (letvar364861 "SolutionStackName") (clojure.core/assoc :solution-stack-name (deser-solution-stack-name (clojure.core/get-in letvar364861 ["SolutionStackName" :content]))) (letvar364861 "DateUpdated") (clojure.core/assoc :date-updated (deser-update-date (clojure.core/get-in letvar364861 ["DateUpdated" :content]))) (letvar364861 "EnvironmentName") (clojure.core/assoc :environment-name (deser-environment-name (clojure.core/get-in letvar364861 ["EnvironmentName" :content]))) (letvar364861 "OptionSettings") (clojure.core/assoc :option-settings (deser-configuration-option-settings-list (clojure.core/get-in letvar364861 ["OptionSettings" :content]))) (letvar364861 "DateCreated") (clojure.core/assoc :date-created (deser-creation-date (clojure.core/get-in letvar364861 ["DateCreated" :content]))) (letvar364861 "Description") (clojure.core/assoc :description (deser-description (clojure.core/get-in letvar364861 ["Description" :content]))) (letvar364861 "ApplicationName") (clojure.core/assoc :application-name (deser-application-name (clojure.core/get-in letvar364861 ["ApplicationName" :content]))) (letvar364861 "TemplateName") (clojure.core/assoc :template-name (deser-configuration-template-name (clojure.core/get-in letvar364861 ["TemplateName" :content]))) (letvar364861 "DeploymentStatus") (clojure.core/assoc :deployment-status (deser-configuration-deployment-status (clojure.core/get-in letvar364861 ["DeploymentStatus" :content]))) (letvar364861 "PlatformArn") (clojure.core/assoc :platform-arn (deser-platform-arn (clojure.core/get-in letvar364861 ["PlatformArn" :content]))))))

(clojure.core/defn- deser-configuration-deployment-status [input] (clojure.core/get {"deployed" :deployed, "pending" :pending, "failed" :failed} (portkey.aws/unbox-xml-primitive-value input)))

(clojure.core/defn- deser-environment-resources-description [input] (clojure.core/let [letvar364974 {"LoadBalancer" (portkey.aws/search-for-tag input "LoadBalancer" :flattened? nil :xmlAttribute? nil)}] (clojure.core/cond-> {} (letvar364974 "LoadBalancer") (clojure.core/assoc :load-balancer (deser-load-balancer-description (clojure.core/get-in letvar364974 ["LoadBalancer" :content]))))))

(clojure.core/defn- deser-application-description [input] (clojure.core/let [letvar365082 {"ApplicationArn" (portkey.aws/search-for-tag input "ApplicationArn" :flattened? nil :xmlAttribute? nil), "ApplicationName" (portkey.aws/search-for-tag input "ApplicationName" :flattened? nil :xmlAttribute? nil), "Description" (portkey.aws/search-for-tag input "Description" :flattened? nil :xmlAttribute? nil), "DateCreated" (portkey.aws/search-for-tag input "DateCreated" :flattened? nil :xmlAttribute? nil), "DateUpdated" (portkey.aws/search-for-tag input "DateUpdated" :flattened? nil :xmlAttribute? nil), "Versions" (portkey.aws/search-for-tag input "Versions" :flattened? nil :xmlAttribute? nil), "ConfigurationTemplates" (portkey.aws/search-for-tag input "ConfigurationTemplates" :flattened? nil :xmlAttribute? nil), "ResourceLifecycleConfig" (portkey.aws/search-for-tag input "ResourceLifecycleConfig" :flattened? nil :xmlAttribute? nil)}] (clojure.core/cond-> {} (letvar365082 "ApplicationArn") (clojure.core/assoc :application-arn (deser-application-arn (clojure.core/get-in letvar365082 ["ApplicationArn" :content]))) (letvar365082 "ApplicationName") (clojure.core/assoc :application-name (deser-application-name (clojure.core/get-in letvar365082 ["ApplicationName" :content]))) (letvar365082 "Description") (clojure.core/assoc :description (deser-description (clojure.core/get-in letvar365082 ["Description" :content]))) (letvar365082 "DateCreated") (clojure.core/assoc :date-created (deser-creation-date (clojure.core/get-in letvar365082 ["DateCreated" :content]))) (letvar365082 "DateUpdated") (clojure.core/assoc :date-updated (deser-update-date (clojure.core/get-in letvar365082 ["DateUpdated" :content]))) (letvar365082 "Versions") (clojure.core/assoc :versions (deser-version-labels-list (clojure.core/get-in letvar365082 ["Versions" :content]))) (letvar365082 "ConfigurationTemplates") (clojure.core/assoc :configuration-templates (deser-configuration-template-names-list (clojure.core/get-in letvar365082 ["ConfigurationTemplates" :content]))) (letvar365082 "ResourceLifecycleConfig") (clojure.core/assoc :resource-lifecycle-config (deser-application-resource-lifecycle-config (clojure.core/get-in letvar365082 ["ResourceLifecycleConfig" :content]))))))

(clojure.core/defn- deser-environment-id [input] (portkey.aws/unbox-xml-primitive-value input))

(clojure.core/defn- deser-source-build-information [input] (clojure.core/let [letvar365195 {"SourceType" (portkey.aws/search-for-tag input "SourceType" :flattened? nil :xmlAttribute? nil), "SourceRepository" (portkey.aws/search-for-tag input "SourceRepository" :flattened? nil :xmlAttribute? nil), "SourceLocation" (portkey.aws/search-for-tag input "SourceLocation" :flattened? nil :xmlAttribute? nil)}] (clojure.core/cond-> {:source-type (deser-source-type (clojure.core/get-in letvar365195 ["SourceType" :content])), :source-repository (deser-source-repository (clojure.core/get-in letvar365195 ["SourceRepository" :content])), :source-location (deser-source-location (clojure.core/get-in letvar365195 ["SourceLocation" :content]))})))

(clojure.core/defn- deser-nullable-double [input] (java.lang.Double. (portkey.aws/unbox-xml-primitive-value input)))

(clojure.core/defn- deser-environment-description [input] (clojure.core/let [letvar365305 {"VersionLabel" (portkey.aws/search-for-tag input "VersionLabel" :flattened? nil :xmlAttribute? nil), "Tier" (portkey.aws/search-for-tag input "Tier" :flattened? nil :xmlAttribute? nil), "Health" (portkey.aws/search-for-tag input "Health" :flattened? nil :xmlAttribute? nil), "SolutionStackName" (portkey.aws/search-for-tag input "SolutionStackName" :flattened? nil :xmlAttribute? nil), "CNAME" (portkey.aws/search-for-tag input "CNAME" :flattened? nil :xmlAttribute? nil), "DateUpdated" (portkey.aws/search-for-tag input "DateUpdated" :flattened? nil :xmlAttribute? nil), "EnvironmentName" (portkey.aws/search-for-tag input "EnvironmentName" :flattened? nil :xmlAttribute? nil), "HealthStatus" (portkey.aws/search-for-tag input "HealthStatus" :flattened? nil :xmlAttribute? nil), "Status" (portkey.aws/search-for-tag input "Status" :flattened? nil :xmlAttribute? nil), "EnvironmentArn" (portkey.aws/search-for-tag input "EnvironmentArn" :flattened? nil :xmlAttribute? nil), "AbortableOperationInProgress" (portkey.aws/search-for-tag input "AbortableOperationInProgress" :flattened? nil :xmlAttribute? nil), "DateCreated" (portkey.aws/search-for-tag input "DateCreated" :flattened? nil :xmlAttribute? nil), "Description" (portkey.aws/search-for-tag input "Description" :flattened? nil :xmlAttribute? nil), "EndpointURL" (portkey.aws/search-for-tag input "EndpointURL" :flattened? nil :xmlAttribute? nil), "Resources" (portkey.aws/search-for-tag input "Resources" :flattened? nil :xmlAttribute? nil), "ApplicationName" (portkey.aws/search-for-tag input "ApplicationName" :flattened? nil :xmlAttribute? nil), "TemplateName" (portkey.aws/search-for-tag input "TemplateName" :flattened? nil :xmlAttribute? nil), "PlatformArn" (portkey.aws/search-for-tag input "PlatformArn" :flattened? nil :xmlAttribute? nil), "EnvironmentLinks" (portkey.aws/search-for-tag input "EnvironmentLinks" :flattened? nil :xmlAttribute? nil), "EnvironmentId" (portkey.aws/search-for-tag input "EnvironmentId" :flattened? nil :xmlAttribute? nil)}] (clojure.core/cond-> {} (letvar365305 "VersionLabel") (clojure.core/assoc :version-label (deser-version-label (clojure.core/get-in letvar365305 ["VersionLabel" :content]))) (letvar365305 "Tier") (clojure.core/assoc :tier (deser-environment-tier (clojure.core/get-in letvar365305 ["Tier" :content]))) (letvar365305 "Health") (clojure.core/assoc :health (deser-environment-health (clojure.core/get-in letvar365305 ["Health" :content]))) (letvar365305 "SolutionStackName") (clojure.core/assoc :solution-stack-name (deser-solution-stack-name (clojure.core/get-in letvar365305 ["SolutionStackName" :content]))) (letvar365305 "CNAME") (clojure.core/assoc :cname (deser-dns-cname (clojure.core/get-in letvar365305 ["CNAME" :content]))) (letvar365305 "DateUpdated") (clojure.core/assoc :date-updated (deser-update-date (clojure.core/get-in letvar365305 ["DateUpdated" :content]))) (letvar365305 "EnvironmentName") (clojure.core/assoc :environment-name (deser-environment-name (clojure.core/get-in letvar365305 ["EnvironmentName" :content]))) (letvar365305 "HealthStatus") (clojure.core/assoc :health-status (deser-environment-health-status (clojure.core/get-in letvar365305 ["HealthStatus" :content]))) (letvar365305 "Status") (clojure.core/assoc :status (deser-environment-status (clojure.core/get-in letvar365305 ["Status" :content]))) (letvar365305 "EnvironmentArn") (clojure.core/assoc :environment-arn (deser-environment-arn (clojure.core/get-in letvar365305 ["EnvironmentArn" :content]))) (letvar365305 "AbortableOperationInProgress") (clojure.core/assoc :abortable-operation-in-progress (deser-abortable-operation-in-progress (clojure.core/get-in letvar365305 ["AbortableOperationInProgress" :content]))) (letvar365305 "DateCreated") (clojure.core/assoc :date-created (deser-creation-date (clojure.core/get-in letvar365305 ["DateCreated" :content]))) (letvar365305 "Description") (clojure.core/assoc :description (deser-description (clojure.core/get-in letvar365305 ["Description" :content]))) (letvar365305 "EndpointURL") (clojure.core/assoc :endpoint-url (deser-endpoint-url (clojure.core/get-in letvar365305 ["EndpointURL" :content]))) (letvar365305 "Resources") (clojure.core/assoc :resources (deser-environment-resources-description (clojure.core/get-in letvar365305 ["Resources" :content]))) (letvar365305 "ApplicationName") (clojure.core/assoc :application-name (deser-application-name (clojure.core/get-in letvar365305 ["ApplicationName" :content]))) (letvar365305 "TemplateName") (clojure.core/assoc :template-name (deser-configuration-template-name (clojure.core/get-in letvar365305 ["TemplateName" :content]))) (letvar365305 "PlatformArn") (clojure.core/assoc :platform-arn (deser-platform-arn (clojure.core/get-in letvar365305 ["PlatformArn" :content]))) (letvar365305 "EnvironmentLinks") (clojure.core/assoc :environment-links (deser-environment-links (clojure.core/get-in letvar365305 ["EnvironmentLinks" :content]))) (letvar365305 "EnvironmentId") (clojure.core/assoc :environment-id (deser-environment-id (clojure.core/get-in letvar365305 ["EnvironmentId" :content]))))))

(clojure.core/defn- deser-configuration-template-name [input] (portkey.aws/unbox-xml-primitive-value input))

(clojure.core/defn- deser-load-balancer-listeners-description [input] (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (deser-listener coll))) input))

(clojure.core/defn- deser-available-solution-stack-names-list [input] (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (deser-solution-stack-name coll))) input))

(clojure.core/defn- deser-token [input] (portkey.aws/unbox-xml-primitive-value input))

(clojure.core/defn- deser-configuration-option-value [input] (portkey.aws/unbox-xml-primitive-value input))

(clojure.core/defn- deser-platform-programming-language [input] (clojure.core/let [letvar365462 {"Name" (portkey.aws/search-for-tag input "Name" :flattened? nil :xmlAttribute? nil), "Version" (portkey.aws/search-for-tag input "Version" :flattened? nil :xmlAttribute? nil)}] (clojure.core/cond-> {} (letvar365462 "Name") (clojure.core/assoc :name (deser-string (clojure.core/get-in letvar365462 ["Name" :content]))) (letvar365462 "Version") (clojure.core/assoc :version (deser-string (clojure.core/get-in letvar365462 ["Version" :content]))))))

(clojure.core/defn- deser-custom-ami-list [input] (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (deser-custom-ami coll))) input))

(clojure.core/defn- deser-queue-list [input] (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (deser-queue coll))) input))

(clojure.core/defn- deser-environment-health [input] (clojure.core/get {"Green" :green, "Yellow" :yellow, "Red" :red, "Grey" :grey} (portkey.aws/unbox-xml-primitive-value input)))

(clojure.core/defn- deser-environment-info-description [input] (clojure.core/let [letvar365609 {"InfoType" (portkey.aws/search-for-tag input "InfoType" :flattened? nil :xmlAttribute? nil), "Ec2InstanceId" (portkey.aws/search-for-tag input "Ec2InstanceId" :flattened? nil :xmlAttribute? nil), "SampleTimestamp" (portkey.aws/search-for-tag input "SampleTimestamp" :flattened? nil :xmlAttribute? nil), "Message" (portkey.aws/search-for-tag input "Message" :flattened? nil :xmlAttribute? nil)}] (clojure.core/cond-> {} (letvar365609 "InfoType") (clojure.core/assoc :info-type (deser-environment-info-type (clojure.core/get-in letvar365609 ["InfoType" :content]))) (letvar365609 "Ec2InstanceId") (clojure.core/assoc :ec-2-instance-id (deser-ec-2-instance-id (clojure.core/get-in letvar365609 ["Ec2InstanceId" :content]))) (letvar365609 "SampleTimestamp") (clojure.core/assoc :sample-timestamp (deser-sample-timestamp (clojure.core/get-in letvar365609 ["SampleTimestamp" :content]))) (letvar365609 "Message") (clojure.core/assoc :message (deser-message (clojure.core/get-in letvar365609 ["Message" :content]))))))

(clojure.core/defn- deser-trigger [input] (clojure.core/let [letvar365717 {"Name" (portkey.aws/search-for-tag input "Name" :flattened? nil :xmlAttribute? nil)}] (clojure.core/cond-> {} (letvar365717 "Name") (clojure.core/assoc :name (deser-resource-id (clojure.core/get-in letvar365717 ["Name" :content]))))))

(clojure.core/defn- deser-user-defined-option [input] (clojure.core/when-let [boolstr__283693__auto__ (portkey.aws/unbox-xml-primitive-value input)] (clojure.core/cond (clojure.core/= "true" boolstr__283693__auto__) true (clojure.core/= "false" boolstr__283693__auto__) false)))

(clojure.core/defn- deser-supported-tier [input] (portkey.aws/unbox-xml-primitive-value input))

(clojure.core/defn- deser-load-balancer-list [input] (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (deser-load-balancer coll))) input))

(clojure.core/defn- deser-launch-configuration-list [input] (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (deser-launch-configuration coll))) input))

(clojure.core/defn- deser-configuration-option-description [input] (clojure.core/let [letvar365866 {"UserDefined" (portkey.aws/search-for-tag input "UserDefined" :flattened? nil :xmlAttribute? nil), "MinValue" (portkey.aws/search-for-tag input "MinValue" :flattened? nil :xmlAttribute? nil), "MaxValue" (portkey.aws/search-for-tag input "MaxValue" :flattened? nil :xmlAttribute? nil), "ChangeSeverity" (portkey.aws/search-for-tag input "ChangeSeverity" :flattened? nil :xmlAttribute? nil), "MaxLength" (portkey.aws/search-for-tag input "MaxLength" :flattened? nil :xmlAttribute? nil), "Namespace" (portkey.aws/search-for-tag input "Namespace" :flattened? nil :xmlAttribute? nil), "ValueType" (portkey.aws/search-for-tag input "ValueType" :flattened? nil :xmlAttribute? nil), "Regex" (portkey.aws/search-for-tag input "Regex" :flattened? nil :xmlAttribute? nil), "ValueOptions" (portkey.aws/search-for-tag input "ValueOptions" :flattened? nil :xmlAttribute? nil), "DefaultValue" (portkey.aws/search-for-tag input "DefaultValue" :flattened? nil :xmlAttribute? nil), "Name" (portkey.aws/search-for-tag input "Name" :flattened? nil :xmlAttribute? nil)}] (clojure.core/cond-> {} (letvar365866 "UserDefined") (clojure.core/assoc :user-defined (deser-user-defined-option (clojure.core/get-in letvar365866 ["UserDefined" :content]))) (letvar365866 "MinValue") (clojure.core/assoc :min-value (deser-option-restriction-min-value (clojure.core/get-in letvar365866 ["MinValue" :content]))) (letvar365866 "MaxValue") (clojure.core/assoc :max-value (deser-option-restriction-max-value (clojure.core/get-in letvar365866 ["MaxValue" :content]))) (letvar365866 "ChangeSeverity") (clojure.core/assoc :change-severity (deser-configuration-option-severity (clojure.core/get-in letvar365866 ["ChangeSeverity" :content]))) (letvar365866 "MaxLength") (clojure.core/assoc :max-length (deser-option-restriction-max-length (clojure.core/get-in letvar365866 ["MaxLength" :content]))) (letvar365866 "Namespace") (clojure.core/assoc :namespace (deser-option-namespace (clojure.core/get-in letvar365866 ["Namespace" :content]))) (letvar365866 "ValueType") (clojure.core/assoc :value-type (deser-configuration-option-value-type (clojure.core/get-in letvar365866 ["ValueType" :content]))) (letvar365866 "Regex") (clojure.core/assoc :regex (deser-option-restriction-regex (clojure.core/get-in letvar365866 ["Regex" :content]))) (letvar365866 "ValueOptions") (clojure.core/assoc :value-options (deser-configuration-option-possible-values (clojure.core/get-in letvar365866 ["ValueOptions" :content]))) (letvar365866 "DefaultValue") (clojure.core/assoc :default-value (deser-configuration-option-default-value (clojure.core/get-in letvar365866 ["DefaultValue" :content]))) (letvar365866 "Name") (clojure.core/assoc :name (deser-configuration-option-name (clojure.core/get-in letvar365866 ["Name" :content]))))))

(clojure.core/defn- deser-system-status [input] (clojure.core/let [letvar365974 {"CPUUtilization" (portkey.aws/search-for-tag input "CPUUtilization" :flattened? nil :xmlAttribute? nil), "LoadAverage" (portkey.aws/search-for-tag input "LoadAverage" :flattened? nil :xmlAttribute? nil)}] (clojure.core/cond-> {} (letvar365974 "CPUUtilization") (clojure.core/assoc :cpu-utilization (deser-cpu-utilization (clojure.core/get-in letvar365974 ["CPUUtilization" :content]))) (letvar365974 "LoadAverage") (clojure.core/assoc :load-average (deser-load-average (clojure.core/get-in letvar365974 ["LoadAverage" :content]))))))

(clojure.core/defn- response-application-version-descriptions-message ([input] (response-application-version-descriptions-message nil input)) ([resultWrapper365976 input] (clojure.core/let [rawinput365975 (clojure.core/some-> input :body portkey.aws/parse-xml-body) letvar365977 {"ApplicationVersions" (portkey.aws/search-for-tag rawinput365975 "ApplicationVersions" :flattened? nil :result-wrapper resultWrapper365976), "NextToken" (portkey.aws/search-for-tag rawinput365975 "NextToken" :flattened? nil :result-wrapper resultWrapper365976)}] (clojure.core/cond-> {} (letvar365977 "ApplicationVersions") (clojure.core/assoc :application-versions (deser-application-version-description-list (clojure.core/get-in letvar365977 ["ApplicationVersions" :content]))) (letvar365977 "NextToken") (clojure.core/assoc :next-token (deser-token (clojure.core/get-in letvar365977 ["NextToken" :content])))))))

(clojure.core/defn- response-list-available-solution-stacks-result-message ([input] (response-list-available-solution-stacks-result-message nil input)) ([resultWrapper365979 input] (clojure.core/let [rawinput365978 (clojure.core/some-> input :body portkey.aws/parse-xml-body) letvar365980 {"SolutionStacks" (portkey.aws/search-for-tag rawinput365978 "SolutionStacks" :flattened? nil :result-wrapper resultWrapper365979), "SolutionStackDetails" (portkey.aws/search-for-tag rawinput365978 "SolutionStackDetails" :flattened? nil :result-wrapper resultWrapper365979)}] (clojure.core/cond-> {} (letvar365980 "SolutionStacks") (clojure.core/assoc :solution-stacks (deser-available-solution-stack-names-list (clojure.core/get-in letvar365980 ["SolutionStacks" :content]))) (letvar365980 "SolutionStackDetails") (clojure.core/assoc :solution-stack-details (deser-available-solution-stack-details-list (clojure.core/get-in letvar365980 ["SolutionStackDetails" :content])))))))

(clojure.core/defn- response-configuration-options-description ([input] (response-configuration-options-description nil input)) ([resultWrapper365982 input] (clojure.core/let [rawinput365981 (clojure.core/some-> input :body portkey.aws/parse-xml-body) letvar365983 {"SolutionStackName" (portkey.aws/search-for-tag rawinput365981 "SolutionStackName" :flattened? nil :result-wrapper resultWrapper365982), "PlatformArn" (portkey.aws/search-for-tag rawinput365981 "PlatformArn" :flattened? nil :result-wrapper resultWrapper365982), "Options" (portkey.aws/search-for-tag rawinput365981 "Options" :flattened? nil :result-wrapper resultWrapper365982)}] (clojure.core/cond-> {} (letvar365983 "SolutionStackName") (clojure.core/assoc :solution-stack-name (deser-solution-stack-name (clojure.core/get-in letvar365983 ["SolutionStackName" :content]))) (letvar365983 "PlatformArn") (clojure.core/assoc :platform-arn (deser-platform-arn (clojure.core/get-in letvar365983 ["PlatformArn" :content]))) (letvar365983 "Options") (clojure.core/assoc :options (deser-configuration-option-descriptions-list (clojure.core/get-in letvar365983 ["Options" :content])))))))

(clojure.core/defn- response-create-platform-version-result ([input] (response-create-platform-version-result nil input)) ([resultWrapper365985 input] (clojure.core/let [rawinput365984 (clojure.core/some-> input :body portkey.aws/parse-xml-body) letvar365986 {"PlatformSummary" (portkey.aws/search-for-tag rawinput365984 "PlatformSummary" :flattened? nil :result-wrapper resultWrapper365985), "Builder" (portkey.aws/search-for-tag rawinput365984 "Builder" :flattened? nil :result-wrapper resultWrapper365985)}] (clojure.core/cond-> {} (letvar365986 "PlatformSummary") (clojure.core/assoc :platform-summary (deser-platform-summary (clojure.core/get-in letvar365986 ["PlatformSummary" :content]))) (letvar365986 "Builder") (clojure.core/assoc :builder (deser-builder (clojure.core/get-in letvar365986 ["Builder" :content])))))))

(clojure.core/defn- response-invalid-request-exception ([input] (response-invalid-request-exception nil input)) ([resultWrapper365988 input] (clojure.core/let [rawinput365987 (clojure.core/some-> input :body portkey.aws/parse-xml-body) letvar365989 {}] (clojure.core/cond-> {}))))

(clojure.core/defn- response-insufficient-privileges-exception ([input] (response-insufficient-privileges-exception nil input)) ([resultWrapper365991 input] (clojure.core/let [rawinput365990 (clojure.core/some-> input :body portkey.aws/parse-xml-body) letvar365992 {}] (clojure.core/cond-> {}))))

(clojure.core/defn- response-describe-environment-managed-action-history-result ([input] (response-describe-environment-managed-action-history-result nil input)) ([resultWrapper365994 input] (clojure.core/let [rawinput365993 (clojure.core/some-> input :body portkey.aws/parse-xml-body) letvar365995 {"ManagedActionHistoryItems" (portkey.aws/search-for-tag rawinput365993 "ManagedActionHistoryItems" :flattened? nil :result-wrapper resultWrapper365994), "NextToken" (portkey.aws/search-for-tag rawinput365993 "NextToken" :flattened? nil :result-wrapper resultWrapper365994)}] (clojure.core/cond-> {} (letvar365995 "ManagedActionHistoryItems") (clojure.core/assoc :managed-action-history-items (deser-managed-action-history-items (clojure.core/get-in letvar365995 ["ManagedActionHistoryItems" :content]))) (letvar365995 "NextToken") (clojure.core/assoc :next-token (deser-string (clojure.core/get-in letvar365995 ["NextToken" :content])))))))

(clojure.core/defn- response-elastic-beanstalk-service-exception ([input] (response-elastic-beanstalk-service-exception nil input)) ([resultWrapper365997 input] (clojure.core/let [rawinput365996 (clojure.core/some-> input :body portkey.aws/parse-xml-body) letvar365998 {"message" (portkey.aws/search-for-tag rawinput365996 "message" :flattened? nil :result-wrapper resultWrapper365997)}] (clojure.core/cond-> {} (letvar365998 "message") (clojure.core/assoc :message (deser-exception-message (clojure.core/get-in letvar365998 ["message" :content])))))))

(clojure.core/defn- response-too-many-application-versions-exception ([input] (response-too-many-application-versions-exception nil input)) ([resultWrapper366000 input] (clojure.core/let [rawinput365999 (clojure.core/some-> input :body portkey.aws/parse-xml-body) letvar366001 {}] (clojure.core/cond-> {}))))

(clojure.core/defn- response-source-bundle-deletion-exception ([input] (response-source-bundle-deletion-exception nil input)) ([resultWrapper366003 input] (clojure.core/let [rawinput366002 (clojure.core/some-> input :body portkey.aws/parse-xml-body) letvar366004 {}] (clojure.core/cond-> {}))))

(clojure.core/defn- response-too-many-applications-exception ([input] (response-too-many-applications-exception nil input)) ([resultWrapper366006 input] (clojure.core/let [rawinput366005 (clojure.core/some-> input :body portkey.aws/parse-xml-body) letvar366007 {}] (clojure.core/cond-> {}))))

(clojure.core/defn- response-check-dns-availability-result-message ([input] (response-check-dns-availability-result-message nil input)) ([resultWrapper366009 input] (clojure.core/let [rawinput366008 (clojure.core/some-> input :body portkey.aws/parse-xml-body) letvar366010 {"Available" (portkey.aws/search-for-tag rawinput366008 "Available" :flattened? nil :result-wrapper resultWrapper366009), "FullyQualifiedCNAME" (portkey.aws/search-for-tag rawinput366008 "FullyQualifiedCNAME" :flattened? nil :result-wrapper resultWrapper366009)}] (clojure.core/cond-> {} (letvar366010 "Available") (clojure.core/assoc :available (deser-cname-availability (clojure.core/get-in letvar366010 ["Available" :content]))) (letvar366010 "FullyQualifiedCNAME") (clojure.core/assoc :fully-qualified-cname (deser-dns-cname (clojure.core/get-in letvar366010 ["FullyQualifiedCNAME" :content])))))))

(clojure.core/defn- response-application-description-message ([input] (response-application-description-message nil input)) ([resultWrapper366012 input] (clojure.core/let [rawinput366011 (clojure.core/some-> input :body portkey.aws/parse-xml-body) letvar366013 {"Application" (portkey.aws/search-for-tag rawinput366011 "Application" :flattened? nil :result-wrapper resultWrapper366012)}] (clojure.core/cond-> {} (letvar366013 "Application") (clojure.core/assoc :application (deser-application-description (clojure.core/get-in letvar366013 ["Application" :content])))))))

(clojure.core/defn- response-operation-in-progress-exception ([input] (response-operation-in-progress-exception nil input)) ([resultWrapper366015 input] (clojure.core/let [rawinput366014 (clojure.core/some-> input :body portkey.aws/parse-xml-body) letvar366016 {}] (clojure.core/cond-> {}))))

(clojure.core/defn- response-application-descriptions-message ([input] (response-application-descriptions-message nil input)) ([resultWrapper366018 input] (clojure.core/let [rawinput366017 (clojure.core/some-> input :body portkey.aws/parse-xml-body) letvar366019 {"Applications" (portkey.aws/search-for-tag rawinput366017 "Applications" :flattened? nil :result-wrapper resultWrapper366018)}] (clojure.core/cond-> {} (letvar366019 "Applications") (clojure.core/assoc :applications (deser-application-description-list (clojure.core/get-in letvar366019 ["Applications" :content])))))))

(clojure.core/defn- response-describe-environment-health-result ([input] (response-describe-environment-health-result nil input)) ([resultWrapper366021 input] (clojure.core/let [rawinput366020 (clojure.core/some-> input :body portkey.aws/parse-xml-body) letvar366022 {"EnvironmentName" (portkey.aws/search-for-tag rawinput366020 "EnvironmentName" :flattened? nil :result-wrapper resultWrapper366021), "HealthStatus" (portkey.aws/search-for-tag rawinput366020 "HealthStatus" :flattened? nil :result-wrapper resultWrapper366021), "Status" (portkey.aws/search-for-tag rawinput366020 "Status" :flattened? nil :result-wrapper resultWrapper366021), "Color" (portkey.aws/search-for-tag rawinput366020 "Color" :flattened? nil :result-wrapper resultWrapper366021), "Causes" (portkey.aws/search-for-tag rawinput366020 "Causes" :flattened? nil :result-wrapper resultWrapper366021), "ApplicationMetrics" (portkey.aws/search-for-tag rawinput366020 "ApplicationMetrics" :flattened? nil :result-wrapper resultWrapper366021), "InstancesHealth" (portkey.aws/search-for-tag rawinput366020 "InstancesHealth" :flattened? nil :result-wrapper resultWrapper366021), "RefreshedAt" (portkey.aws/search-for-tag rawinput366020 "RefreshedAt" :flattened? nil :result-wrapper resultWrapper366021)}] (clojure.core/cond-> {} (letvar366022 "EnvironmentName") (clojure.core/assoc :environment-name (deser-environment-name (clojure.core/get-in letvar366022 ["EnvironmentName" :content]))) (letvar366022 "HealthStatus") (clojure.core/assoc :health-status (deser-string (clojure.core/get-in letvar366022 ["HealthStatus" :content]))) (letvar366022 "Status") (clojure.core/assoc :status (deser-environment-health (clojure.core/get-in letvar366022 ["Status" :content]))) (letvar366022 "Color") (clojure.core/assoc :color (deser-string (clojure.core/get-in letvar366022 ["Color" :content]))) (letvar366022 "Causes") (clojure.core/assoc :causes (deser-causes (clojure.core/get-in letvar366022 ["Causes" :content]))) (letvar366022 "ApplicationMetrics") (clojure.core/assoc :application-metrics (deser-application-metrics (clojure.core/get-in letvar366022 ["ApplicationMetrics" :content]))) (letvar366022 "InstancesHealth") (clojure.core/assoc :instances-health (deser-instance-health-summary (clojure.core/get-in letvar366022 ["InstancesHealth" :content]))) (letvar366022 "RefreshedAt") (clojure.core/assoc :refreshed-at (deser-refreshed-at (clojure.core/get-in letvar366022 ["RefreshedAt" :content])))))))

(clojure.core/defn- response-environment-descriptions-message ([input] (response-environment-descriptions-message nil input)) ([resultWrapper366024 input] (clojure.core/let [rawinput366023 (clojure.core/some-> input :body portkey.aws/parse-xml-body) letvar366025 {"Environments" (portkey.aws/search-for-tag rawinput366023 "Environments" :flattened? nil :result-wrapper resultWrapper366024), "NextToken" (portkey.aws/search-for-tag rawinput366023 "NextToken" :flattened? nil :result-wrapper resultWrapper366024)}] (clojure.core/cond-> {} (letvar366025 "Environments") (clojure.core/assoc :environments (deser-environment-descriptions-list (clojure.core/get-in letvar366025 ["Environments" :content]))) (letvar366025 "NextToken") (clojure.core/assoc :next-token (deser-token (clojure.core/get-in letvar366025 ["NextToken" :content])))))))

(clojure.core/defn- response-too-many-platforms-exception ([input] (response-too-many-platforms-exception nil input)) ([resultWrapper366027 input] (clojure.core/let [rawinput366026 (clojure.core/some-> input :body portkey.aws/parse-xml-body) letvar366028 {}] (clojure.core/cond-> {}))))

(clojure.core/defn- response-too-many-environments-exception ([input] (response-too-many-environments-exception nil input)) ([resultWrapper366030 input] (clojure.core/let [rawinput366029 (clojure.core/some-> input :body portkey.aws/parse-xml-body) letvar366031 {}] (clojure.core/cond-> {}))))

(clojure.core/defn- response-describe-instances-health-result ([input] (response-describe-instances-health-result nil input)) ([resultWrapper366033 input] (clojure.core/let [rawinput366032 (clojure.core/some-> input :body portkey.aws/parse-xml-body) letvar366034 {"InstanceHealthList" (portkey.aws/search-for-tag rawinput366032 "InstanceHealthList" :flattened? nil :result-wrapper resultWrapper366033), "RefreshedAt" (portkey.aws/search-for-tag rawinput366032 "RefreshedAt" :flattened? nil :result-wrapper resultWrapper366033), "NextToken" (portkey.aws/search-for-tag rawinput366032 "NextToken" :flattened? nil :result-wrapper resultWrapper366033)}] (clojure.core/cond-> {} (letvar366034 "InstanceHealthList") (clojure.core/assoc :instance-health-list (deser-instance-health-list (clojure.core/get-in letvar366034 ["InstanceHealthList" :content]))) (letvar366034 "RefreshedAt") (clojure.core/assoc :refreshed-at (deser-refreshed-at (clojure.core/get-in letvar366034 ["RefreshedAt" :content]))) (letvar366034 "NextToken") (clojure.core/assoc :next-token (deser-next-token (clojure.core/get-in letvar366034 ["NextToken" :content])))))))

(clojure.core/defn- response-application-resource-lifecycle-description-message ([input] (response-application-resource-lifecycle-description-message nil input)) ([resultWrapper366036 input] (clojure.core/let [rawinput366035 (clojure.core/some-> input :body portkey.aws/parse-xml-body) letvar366037 {"ApplicationName" (portkey.aws/search-for-tag rawinput366035 "ApplicationName" :flattened? nil :result-wrapper resultWrapper366036), "ResourceLifecycleConfig" (portkey.aws/search-for-tag rawinput366035 "ResourceLifecycleConfig" :flattened? nil :result-wrapper resultWrapper366036)}] (clojure.core/cond-> {} (letvar366037 "ApplicationName") (clojure.core/assoc :application-name (deser-application-name (clojure.core/get-in letvar366037 ["ApplicationName" :content]))) (letvar366037 "ResourceLifecycleConfig") (clojure.core/assoc :resource-lifecycle-config (deser-application-resource-lifecycle-config (clojure.core/get-in letvar366037 ["ResourceLifecycleConfig" :content])))))))

(clojure.core/defn- response-resource-not-found-exception ([input] (response-resource-not-found-exception nil input)) ([resultWrapper366039 input] (clojure.core/let [rawinput366038 (clojure.core/some-> input :body portkey.aws/parse-xml-body) letvar366040 {}] (clojure.core/cond-> {}))))

(clojure.core/defn- response-too-many-buckets-exception ([input] (response-too-many-buckets-exception nil input)) ([resultWrapper366042 input] (clojure.core/let [rawinput366041 (clojure.core/some-> input :body portkey.aws/parse-xml-body) letvar366043 {}] (clojure.core/cond-> {}))))

(clojure.core/defn- response-retrieve-environment-info-result-message ([input] (response-retrieve-environment-info-result-message nil input)) ([resultWrapper366045 input] (clojure.core/let [rawinput366044 (clojure.core/some-> input :body portkey.aws/parse-xml-body) letvar366046 {"EnvironmentInfo" (portkey.aws/search-for-tag rawinput366044 "EnvironmentInfo" :flattened? nil :result-wrapper resultWrapper366045)}] (clojure.core/cond-> {} (letvar366046 "EnvironmentInfo") (clojure.core/assoc :environment-info (deser-environment-info-description-list (clojure.core/get-in letvar366046 ["EnvironmentInfo" :content])))))))

(clojure.core/defn- response-event-descriptions-message ([input] (response-event-descriptions-message nil input)) ([resultWrapper366048 input] (clojure.core/let [rawinput366047 (clojure.core/some-> input :body portkey.aws/parse-xml-body) letvar366049 {"Events" (portkey.aws/search-for-tag rawinput366047 "Events" :flattened? nil :result-wrapper resultWrapper366048), "NextToken" (portkey.aws/search-for-tag rawinput366047 "NextToken" :flattened? nil :result-wrapper resultWrapper366048)}] (clojure.core/cond-> {} (letvar366049 "Events") (clojure.core/assoc :events (deser-event-description-list (clojure.core/get-in letvar366049 ["Events" :content]))) (letvar366049 "NextToken") (clojure.core/assoc :next-token (deser-token (clojure.core/get-in letvar366049 ["NextToken" :content])))))))

(clojure.core/defn- response-application-version-description-message ([input] (response-application-version-description-message nil input)) ([resultWrapper366051 input] (clojure.core/let [rawinput366050 (clojure.core/some-> input :body portkey.aws/parse-xml-body) letvar366052 {"ApplicationVersion" (portkey.aws/search-for-tag rawinput366050 "ApplicationVersion" :flattened? nil :result-wrapper resultWrapper366051)}] (clojure.core/cond-> {} (letvar366052 "ApplicationVersion") (clojure.core/assoc :application-version (deser-application-version-description (clojure.core/get-in letvar366052 ["ApplicationVersion" :content])))))))

(clojure.core/defn- response-environment-resource-descriptions-message ([input] (response-environment-resource-descriptions-message nil input)) ([resultWrapper366054 input] (clojure.core/let [rawinput366053 (clojure.core/some-> input :body portkey.aws/parse-xml-body) letvar366055 {"EnvironmentResources" (portkey.aws/search-for-tag rawinput366053 "EnvironmentResources" :flattened? nil :result-wrapper resultWrapper366054)}] (clojure.core/cond-> {} (letvar366055 "EnvironmentResources") (clojure.core/assoc :environment-resources (deser-environment-resource-description (clojure.core/get-in letvar366055 ["EnvironmentResources" :content])))))))

(clojure.core/defn- response-describe-account-attributes-result ([input] (response-describe-account-attributes-result nil input)) ([resultWrapper366057 input] (clojure.core/let [rawinput366056 (clojure.core/some-> input :body portkey.aws/parse-xml-body) letvar366058 {"ResourceQuotas" (portkey.aws/search-for-tag rawinput366056 "ResourceQuotas" :flattened? nil :result-wrapper resultWrapper366057)}] (clojure.core/cond-> {} (letvar366058 "ResourceQuotas") (clojure.core/assoc :resource-quotas (deser-resource-quotas (clojure.core/get-in letvar366058 ["ResourceQuotas" :content])))))))

(clojure.core/defn- response-apply-environment-managed-action-result ([input] (response-apply-environment-managed-action-result nil input)) ([resultWrapper366060 input] (clojure.core/let [rawinput366059 (clojure.core/some-> input :body portkey.aws/parse-xml-body) letvar366061 {"ActionId" (portkey.aws/search-for-tag rawinput366059 "ActionId" :flattened? nil :result-wrapper resultWrapper366060), "ActionDescription" (portkey.aws/search-for-tag rawinput366059 "ActionDescription" :flattened? nil :result-wrapper resultWrapper366060), "ActionType" (portkey.aws/search-for-tag rawinput366059 "ActionType" :flattened? nil :result-wrapper resultWrapper366060), "Status" (portkey.aws/search-for-tag rawinput366059 "Status" :flattened? nil :result-wrapper resultWrapper366060)}] (clojure.core/cond-> {} (letvar366061 "ActionId") (clojure.core/assoc :action-id (deser-string (clojure.core/get-in letvar366061 ["ActionId" :content]))) (letvar366061 "ActionDescription") (clojure.core/assoc :action-description (deser-string (clojure.core/get-in letvar366061 ["ActionDescription" :content]))) (letvar366061 "ActionType") (clojure.core/assoc :action-type (deser-action-type (clojure.core/get-in letvar366061 ["ActionType" :content]))) (letvar366061 "Status") (clojure.core/assoc :status (deser-string (clojure.core/get-in letvar366061 ["Status" :content])))))))

(clojure.core/defn- response-code-build-not-in-service-region-exception ([input] (response-code-build-not-in-service-region-exception nil input)) ([resultWrapper366063 input] (clojure.core/let [rawinput366062 (clojure.core/some-> input :body portkey.aws/parse-xml-body) letvar366064 {}] (clojure.core/cond-> {}))))

(clojure.core/defn- response-too-many-tags-exception ([input] (response-too-many-tags-exception nil input)) ([resultWrapper366066 input] (clojure.core/let [rawinput366065 (clojure.core/some-> input :body portkey.aws/parse-xml-body) letvar366067 {}] (clojure.core/cond-> {}))))

(clojure.core/defn- response-configuration-settings-validation-messages ([input] (response-configuration-settings-validation-messages nil input)) ([resultWrapper366069 input] (clojure.core/let [rawinput366068 (clojure.core/some-> input :body portkey.aws/parse-xml-body) letvar366070 {"Messages" (portkey.aws/search-for-tag rawinput366068 "Messages" :flattened? nil :result-wrapper resultWrapper366069)}] (clojure.core/cond-> {} (letvar366070 "Messages") (clojure.core/assoc :messages (deser-validation-messages-list (clojure.core/get-in letvar366070 ["Messages" :content])))))))

(clojure.core/defn- response-managed-action-invalid-state-exception ([input] (response-managed-action-invalid-state-exception nil input)) ([resultWrapper366072 input] (clojure.core/let [rawinput366071 (clojure.core/some-> input :body portkey.aws/parse-xml-body) letvar366073 {}] (clojure.core/cond-> {}))))

(clojure.core/defn- response-s-3-subscription-required-exception ([input] (response-s-3-subscription-required-exception nil input)) ([resultWrapper366075 input] (clojure.core/let [rawinput366074 (clojure.core/some-> input :body portkey.aws/parse-xml-body) letvar366076 {}] (clojure.core/cond-> {}))))

(clojure.core/defn- response-describe-platform-version-result ([input] (response-describe-platform-version-result nil input)) ([resultWrapper366078 input] (clojure.core/let [rawinput366077 (clojure.core/some-> input :body portkey.aws/parse-xml-body) letvar366079 {"PlatformDescription" (portkey.aws/search-for-tag rawinput366077 "PlatformDescription" :flattened? nil :result-wrapper resultWrapper366078)}] (clojure.core/cond-> {} (letvar366079 "PlatformDescription") (clojure.core/assoc :platform-description (deser-platform-description (clojure.core/get-in letvar366079 ["PlatformDescription" :content])))))))

(clojure.core/defn- response-describe-environment-managed-actions-result ([input] (response-describe-environment-managed-actions-result nil input)) ([resultWrapper366081 input] (clojure.core/let [rawinput366080 (clojure.core/some-> input :body portkey.aws/parse-xml-body) letvar366082 {"ManagedActions" (portkey.aws/search-for-tag rawinput366080 "ManagedActions" :flattened? nil :result-wrapper resultWrapper366081)}] (clojure.core/cond-> {} (letvar366082 "ManagedActions") (clojure.core/assoc :managed-actions (deser-managed-actions (clojure.core/get-in letvar366082 ["ManagedActions" :content])))))))

(clojure.core/defn- response-platform-version-still-referenced-exception ([input] (response-platform-version-still-referenced-exception nil input)) ([resultWrapper366084 input] (clojure.core/let [rawinput366083 (clojure.core/some-> input :body portkey.aws/parse-xml-body) letvar366085 {}] (clojure.core/cond-> {}))))

(clojure.core/defn- response-s-3-location-not-in-service-region-exception ([input] (response-s-3-location-not-in-service-region-exception nil input)) ([resultWrapper366087 input] (clojure.core/let [rawinput366086 (clojure.core/some-> input :body portkey.aws/parse-xml-body) letvar366088 {}] (clojure.core/cond-> {}))))

(clojure.core/defn- response-configuration-settings-description ([input] (response-configuration-settings-description nil input)) ([resultWrapper366090 input] (clojure.core/let [rawinput366089 (clojure.core/some-> input :body portkey.aws/parse-xml-body) letvar366091 {"SolutionStackName" (portkey.aws/search-for-tag rawinput366089 "SolutionStackName" :flattened? nil :result-wrapper resultWrapper366090), "DateUpdated" (portkey.aws/search-for-tag rawinput366089 "DateUpdated" :flattened? nil :result-wrapper resultWrapper366090), "EnvironmentName" (portkey.aws/search-for-tag rawinput366089 "EnvironmentName" :flattened? nil :result-wrapper resultWrapper366090), "OptionSettings" (portkey.aws/search-for-tag rawinput366089 "OptionSettings" :flattened? nil :result-wrapper resultWrapper366090), "DateCreated" (portkey.aws/search-for-tag rawinput366089 "DateCreated" :flattened? nil :result-wrapper resultWrapper366090), "Description" (portkey.aws/search-for-tag rawinput366089 "Description" :flattened? nil :result-wrapper resultWrapper366090), "ApplicationName" (portkey.aws/search-for-tag rawinput366089 "ApplicationName" :flattened? nil :result-wrapper resultWrapper366090), "TemplateName" (portkey.aws/search-for-tag rawinput366089 "TemplateName" :flattened? nil :result-wrapper resultWrapper366090), "DeploymentStatus" (portkey.aws/search-for-tag rawinput366089 "DeploymentStatus" :flattened? nil :result-wrapper resultWrapper366090), "PlatformArn" (portkey.aws/search-for-tag rawinput366089 "PlatformArn" :flattened? nil :result-wrapper resultWrapper366090)}] (clojure.core/cond-> {} (letvar366091 "SolutionStackName") (clojure.core/assoc :solution-stack-name (deser-solution-stack-name (clojure.core/get-in letvar366091 ["SolutionStackName" :content]))) (letvar366091 "DateUpdated") (clojure.core/assoc :date-updated (deser-update-date (clojure.core/get-in letvar366091 ["DateUpdated" :content]))) (letvar366091 "EnvironmentName") (clojure.core/assoc :environment-name (deser-environment-name (clojure.core/get-in letvar366091 ["EnvironmentName" :content]))) (letvar366091 "OptionSettings") (clojure.core/assoc :option-settings (deser-configuration-option-settings-list (clojure.core/get-in letvar366091 ["OptionSettings" :content]))) (letvar366091 "DateCreated") (clojure.core/assoc :date-created (deser-creation-date (clojure.core/get-in letvar366091 ["DateCreated" :content]))) (letvar366091 "Description") (clojure.core/assoc :description (deser-description (clojure.core/get-in letvar366091 ["Description" :content]))) (letvar366091 "ApplicationName") (clojure.core/assoc :application-name (deser-application-name (clojure.core/get-in letvar366091 ["ApplicationName" :content]))) (letvar366091 "TemplateName") (clojure.core/assoc :template-name (deser-configuration-template-name (clojure.core/get-in letvar366091 ["TemplateName" :content]))) (letvar366091 "DeploymentStatus") (clojure.core/assoc :deployment-status (deser-configuration-deployment-status (clojure.core/get-in letvar366091 ["DeploymentStatus" :content]))) (letvar366091 "PlatformArn") (clojure.core/assoc :platform-arn (deser-platform-arn (clojure.core/get-in letvar366091 ["PlatformArn" :content])))))))

(clojure.core/defn- response-environment-description ([input] (response-environment-description nil input)) ([resultWrapper366093 input] (clojure.core/let [rawinput366092 (clojure.core/some-> input :body portkey.aws/parse-xml-body) letvar366094 {"VersionLabel" (portkey.aws/search-for-tag rawinput366092 "VersionLabel" :flattened? nil :result-wrapper resultWrapper366093), "Tier" (portkey.aws/search-for-tag rawinput366092 "Tier" :flattened? nil :result-wrapper resultWrapper366093), "Health" (portkey.aws/search-for-tag rawinput366092 "Health" :flattened? nil :result-wrapper resultWrapper366093), "SolutionStackName" (portkey.aws/search-for-tag rawinput366092 "SolutionStackName" :flattened? nil :result-wrapper resultWrapper366093), "CNAME" (portkey.aws/search-for-tag rawinput366092 "CNAME" :flattened? nil :result-wrapper resultWrapper366093), "DateUpdated" (portkey.aws/search-for-tag rawinput366092 "DateUpdated" :flattened? nil :result-wrapper resultWrapper366093), "EnvironmentName" (portkey.aws/search-for-tag rawinput366092 "EnvironmentName" :flattened? nil :result-wrapper resultWrapper366093), "HealthStatus" (portkey.aws/search-for-tag rawinput366092 "HealthStatus" :flattened? nil :result-wrapper resultWrapper366093), "Status" (portkey.aws/search-for-tag rawinput366092 "Status" :flattened? nil :result-wrapper resultWrapper366093), "EnvironmentArn" (portkey.aws/search-for-tag rawinput366092 "EnvironmentArn" :flattened? nil :result-wrapper resultWrapper366093), "AbortableOperationInProgress" (portkey.aws/search-for-tag rawinput366092 "AbortableOperationInProgress" :flattened? nil :result-wrapper resultWrapper366093), "DateCreated" (portkey.aws/search-for-tag rawinput366092 "DateCreated" :flattened? nil :result-wrapper resultWrapper366093), "Description" (portkey.aws/search-for-tag rawinput366092 "Description" :flattened? nil :result-wrapper resultWrapper366093), "EndpointURL" (portkey.aws/search-for-tag rawinput366092 "EndpointURL" :flattened? nil :result-wrapper resultWrapper366093), "Resources" (portkey.aws/search-for-tag rawinput366092 "Resources" :flattened? nil :result-wrapper resultWrapper366093), "ApplicationName" (portkey.aws/search-for-tag rawinput366092 "ApplicationName" :flattened? nil :result-wrapper resultWrapper366093), "TemplateName" (portkey.aws/search-for-tag rawinput366092 "TemplateName" :flattened? nil :result-wrapper resultWrapper366093), "PlatformArn" (portkey.aws/search-for-tag rawinput366092 "PlatformArn" :flattened? nil :result-wrapper resultWrapper366093), "EnvironmentLinks" (portkey.aws/search-for-tag rawinput366092 "EnvironmentLinks" :flattened? nil :result-wrapper resultWrapper366093), "EnvironmentId" (portkey.aws/search-for-tag rawinput366092 "EnvironmentId" :flattened? nil :result-wrapper resultWrapper366093)}] (clojure.core/cond-> {} (letvar366094 "VersionLabel") (clojure.core/assoc :version-label (deser-version-label (clojure.core/get-in letvar366094 ["VersionLabel" :content]))) (letvar366094 "Tier") (clojure.core/assoc :tier (deser-environment-tier (clojure.core/get-in letvar366094 ["Tier" :content]))) (letvar366094 "Health") (clojure.core/assoc :health (deser-environment-health (clojure.core/get-in letvar366094 ["Health" :content]))) (letvar366094 "SolutionStackName") (clojure.core/assoc :solution-stack-name (deser-solution-stack-name (clojure.core/get-in letvar366094 ["SolutionStackName" :content]))) (letvar366094 "CNAME") (clojure.core/assoc :cname (deser-dns-cname (clojure.core/get-in letvar366094 ["CNAME" :content]))) (letvar366094 "DateUpdated") (clojure.core/assoc :date-updated (deser-update-date (clojure.core/get-in letvar366094 ["DateUpdated" :content]))) (letvar366094 "EnvironmentName") (clojure.core/assoc :environment-name (deser-environment-name (clojure.core/get-in letvar366094 ["EnvironmentName" :content]))) (letvar366094 "HealthStatus") (clojure.core/assoc :health-status (deser-environment-health-status (clojure.core/get-in letvar366094 ["HealthStatus" :content]))) (letvar366094 "Status") (clojure.core/assoc :status (deser-environment-status (clojure.core/get-in letvar366094 ["Status" :content]))) (letvar366094 "EnvironmentArn") (clojure.core/assoc :environment-arn (deser-environment-arn (clojure.core/get-in letvar366094 ["EnvironmentArn" :content]))) (letvar366094 "AbortableOperationInProgress") (clojure.core/assoc :abortable-operation-in-progress (deser-abortable-operation-in-progress (clojure.core/get-in letvar366094 ["AbortableOperationInProgress" :content]))) (letvar366094 "DateCreated") (clojure.core/assoc :date-created (deser-creation-date (clojure.core/get-in letvar366094 ["DateCreated" :content]))) (letvar366094 "Description") (clojure.core/assoc :description (deser-description (clojure.core/get-in letvar366094 ["Description" :content]))) (letvar366094 "EndpointURL") (clojure.core/assoc :endpoint-url (deser-endpoint-url (clojure.core/get-in letvar366094 ["EndpointURL" :content]))) (letvar366094 "Resources") (clojure.core/assoc :resources (deser-environment-resources-description (clojure.core/get-in letvar366094 ["Resources" :content]))) (letvar366094 "ApplicationName") (clojure.core/assoc :application-name (deser-application-name (clojure.core/get-in letvar366094 ["ApplicationName" :content]))) (letvar366094 "TemplateName") (clojure.core/assoc :template-name (deser-configuration-template-name (clojure.core/get-in letvar366094 ["TemplateName" :content]))) (letvar366094 "PlatformArn") (clojure.core/assoc :platform-arn (deser-platform-arn (clojure.core/get-in letvar366094 ["PlatformArn" :content]))) (letvar366094 "EnvironmentLinks") (clojure.core/assoc :environment-links (deser-environment-links (clojure.core/get-in letvar366094 ["EnvironmentLinks" :content]))) (letvar366094 "EnvironmentId") (clojure.core/assoc :environment-id (deser-environment-id (clojure.core/get-in letvar366094 ["EnvironmentId" :content])))))))

(clojure.core/defn- response-delete-platform-version-result ([input] (response-delete-platform-version-result nil input)) ([resultWrapper366096 input] (clojure.core/let [rawinput366095 (clojure.core/some-> input :body portkey.aws/parse-xml-body) letvar366097 {"PlatformSummary" (portkey.aws/search-for-tag rawinput366095 "PlatformSummary" :flattened? nil :result-wrapper resultWrapper366096)}] (clojure.core/cond-> {} (letvar366097 "PlatformSummary") (clojure.core/assoc :platform-summary (deser-platform-summary (clojure.core/get-in letvar366097 ["PlatformSummary" :content])))))))

(clojure.core/defn- response-resource-type-not-supported-exception ([input] (response-resource-type-not-supported-exception nil input)) ([resultWrapper366099 input] (clojure.core/let [rawinput366098 (clojure.core/some-> input :body portkey.aws/parse-xml-body) letvar366100 {}] (clojure.core/cond-> {}))))

(clojure.core/defn- response-list-platform-versions-result ([input] (response-list-platform-versions-result nil input)) ([resultWrapper366102 input] (clojure.core/let [rawinput366101 (clojure.core/some-> input :body portkey.aws/parse-xml-body) letvar366103 {"PlatformSummaryList" (portkey.aws/search-for-tag rawinput366101 "PlatformSummaryList" :flattened? nil :result-wrapper resultWrapper366102), "NextToken" (portkey.aws/search-for-tag rawinput366101 "NextToken" :flattened? nil :result-wrapper resultWrapper366102)}] (clojure.core/cond-> {} (letvar366103 "PlatformSummaryList") (clojure.core/assoc :platform-summary-list (deser-platform-summary-list (clojure.core/get-in letvar366103 ["PlatformSummaryList" :content]))) (letvar366103 "NextToken") (clojure.core/assoc :next-token (deser-token (clojure.core/get-in letvar366103 ["NextToken" :content])))))))

(clojure.core/defn- response-too-many-configuration-templates-exception ([input] (response-too-many-configuration-templates-exception nil input)) ([resultWrapper366105 input] (clojure.core/let [rawinput366104 (clojure.core/some-> input :body portkey.aws/parse-xml-body) letvar366106 {}] (clojure.core/cond-> {}))))

(clojure.core/defn- response-resource-tags-description-message ([input] (response-resource-tags-description-message nil input)) ([resultWrapper366108 input] (clojure.core/let [rawinput366107 (clojure.core/some-> input :body portkey.aws/parse-xml-body) letvar366109 {"ResourceArn" (portkey.aws/search-for-tag rawinput366107 "ResourceArn" :flattened? nil :result-wrapper resultWrapper366108), "ResourceTags" (portkey.aws/search-for-tag rawinput366107 "ResourceTags" :flattened? nil :result-wrapper resultWrapper366108)}] (clojure.core/cond-> {} (letvar366109 "ResourceArn") (clojure.core/assoc :resource-arn (deser-resource-arn (clojure.core/get-in letvar366109 ["ResourceArn" :content]))) (letvar366109 "ResourceTags") (clojure.core/assoc :resource-tags (deser-tag-list (clojure.core/get-in letvar366109 ["ResourceTags" :content])))))))

(clojure.core/defn- response-create-storage-location-result-message ([input] (response-create-storage-location-result-message nil input)) ([resultWrapper366111 input] (clojure.core/let [rawinput366110 (clojure.core/some-> input :body portkey.aws/parse-xml-body) letvar366112 {"S3Bucket" (portkey.aws/search-for-tag rawinput366110 "S3Bucket" :flattened? nil :result-wrapper resultWrapper366111)}] (clojure.core/cond-> {} (letvar366112 "S3Bucket") (clojure.core/assoc :s-3-bucket (deser-s-3-bucket (clojure.core/get-in letvar366112 ["S3Bucket" :content])))))))

(clojure.core/defn- response-configuration-settings-descriptions ([input] (response-configuration-settings-descriptions nil input)) ([resultWrapper366114 input] (clojure.core/let [rawinput366113 (clojure.core/some-> input :body portkey.aws/parse-xml-body) letvar366115 {"ConfigurationSettings" (portkey.aws/search-for-tag rawinput366113 "ConfigurationSettings" :flattened? nil :result-wrapper resultWrapper366114)}] (clojure.core/cond-> {} (letvar366115 "ConfigurationSettings") (clojure.core/assoc :configuration-settings (deser-configuration-settings-description-list (clojure.core/get-in letvar366115 ["ConfigurationSettings" :content])))))))

(clojure.spec.alpha/def :portkey.aws.elasticbeanstalk.-2010-12-01.solution-stack-description/permitted-file-types (clojure.spec.alpha/and :portkey.aws.elasticbeanstalk.-2010-12-01/solution-stack-file-type-list))
(clojure.spec.alpha/def :portkey.aws.elasticbeanstalk.-2010-12-01/solution-stack-description (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.elasticbeanstalk.-2010-12-01/solution-stack-name :portkey.aws.elasticbeanstalk.-2010-12-01.solution-stack-description/permitted-file-types]))

(clojure.spec.alpha/def :portkey.aws.elasticbeanstalk.-2010-12-01/version-label (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__283178__auto__] (clojure.core/<= 1 (clojure.core/count s__283178__auto__))) (clojure.core/fn [s__283179__auto__] (clojure.core/< (clojure.core/count s__283179__auto__) 100))))

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

(clojure.spec.alpha/def :portkey.aws.elasticbeanstalk.-2010-12-01/instance-id (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__283178__auto__] (clojure.core/<= 1 (clojure.core/count s__283178__auto__))) (clojure.core/fn [s__283179__auto__] (clojure.core/< (clojure.core/count s__283179__auto__) 255))))

(clojure.spec.alpha/def :portkey.aws.elasticbeanstalk.-2010-12-01/platform-filter-value-list (clojure.spec.alpha/coll-of :portkey.aws.elasticbeanstalk.-2010-12-01/platform-filter-value))

(clojure.spec.alpha/def :portkey.aws.elasticbeanstalk.-2010-12-01/configuration-template-names-list (clojure.spec.alpha/coll-of :portkey.aws.elasticbeanstalk.-2010-12-01/configuration-template-name))

(clojure.spec.alpha/def :portkey.aws.elasticbeanstalk.-2010-12-01.configuration-options-description/options (clojure.spec.alpha/and :portkey.aws.elasticbeanstalk.-2010-12-01/configuration-option-descriptions-list))
(clojure.spec.alpha/def :portkey.aws.elasticbeanstalk.-2010-12-01/configuration-options-description (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.elasticbeanstalk.-2010-12-01/solution-stack-name :portkey.aws.elasticbeanstalk.-2010-12-01/platform-arn :portkey.aws.elasticbeanstalk.-2010-12-01.configuration-options-description/options]))

(clojure.spec.alpha/def :portkey.aws.elasticbeanstalk.-2010-12-01/describe-environment-resources-message (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.elasticbeanstalk.-2010-12-01/environment-id :portkey.aws.elasticbeanstalk.-2010-12-01/environment-name]))

(clojure.spec.alpha/def :portkey.aws.elasticbeanstalk.-2010-12-01/cause (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__283178__auto__] (clojure.core/<= 1 (clojure.core/count s__283178__auto__))) (clojure.core/fn [s__283179__auto__] (clojure.core/< (clojure.core/count s__283179__auto__) 255))))

(clojure.spec.alpha/def :portkey.aws.elasticbeanstalk.-2010-12-01/cname-availability clojure.core/boolean?)

(clojure.spec.alpha/def :portkey.aws.elasticbeanstalk.-2010-12-01/boxed-int clojure.core/int?)

(clojure.spec.alpha/def :portkey.aws.elasticbeanstalk.-2010-12-01.update-application-resource-lifecycle-message/resource-lifecycle-config (clojure.spec.alpha/and :portkey.aws.elasticbeanstalk.-2010-12-01/application-resource-lifecycle-config))
(clojure.spec.alpha/def :portkey.aws.elasticbeanstalk.-2010-12-01/update-application-resource-lifecycle-message (clojure.spec.alpha/keys :req-un [:portkey.aws.elasticbeanstalk.-2010-12-01/application-name :portkey.aws.elasticbeanstalk.-2010-12-01.update-application-resource-lifecycle-message/resource-lifecycle-config] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.elasticbeanstalk.-2010-12-01/file-type-extension (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__283178__auto__] (clojure.core/<= 1 (clojure.core/count s__283178__auto__))) (clojure.core/fn [s__283179__auto__] (clojure.core/< (clojure.core/count s__283179__auto__) 100))))

(clojure.spec.alpha/def :portkey.aws.elasticbeanstalk.-2010-12-01/non-empty-string (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__283180__auto__] (clojure.core/re-matches #".*\S.*" s__283180__auto__))))

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

(clojure.spec.alpha/def :portkey.aws.elasticbeanstalk.-2010-12-01/environment-name (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__283178__auto__] (clojure.core/<= 4 (clojure.core/count s__283178__auto__))) (clojure.core/fn [s__283179__auto__] (clojure.core/< (clojure.core/count s__283179__auto__) 40))))

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

(clojure.spec.alpha/def :portkey.aws.elasticbeanstalk.-2010-12-01/dns-cname (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__283178__auto__] (clojure.core/<= 1 (clojure.core/count s__283178__auto__))) (clojure.core/fn [s__283179__auto__] (clojure.core/< (clojure.core/count s__283179__auto__) 255))))

(clojure.spec.alpha/def :portkey.aws.elasticbeanstalk.-2010-12-01/max-records (clojure.spec.alpha/int-in 1 1000))

(clojure.spec.alpha/def :portkey.aws.elasticbeanstalk.-2010-12-01/tag-key (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__283178__auto__] (clojure.core/<= 1 (clojure.core/count s__283178__auto__))) (clojure.core/fn [s__283179__auto__] (clojure.core/< (clojure.core/count s__283179__auto__) 128))))

(clojure.spec.alpha/def :portkey.aws.elasticbeanstalk.-2010-12-01.launch-template/id (clojure.spec.alpha/and :portkey.aws.elasticbeanstalk.-2010-12-01/resource-id))
(clojure.spec.alpha/def :portkey.aws.elasticbeanstalk.-2010-12-01/launch-template (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.elasticbeanstalk.-2010-12-01.launch-template/id]))

(clojure.spec.alpha/def :portkey.aws.elasticbeanstalk.-2010-12-01/environment-descriptions-list (clojure.spec.alpha/coll-of :portkey.aws.elasticbeanstalk.-2010-12-01/environment-description))

(clojure.spec.alpha/def :portkey.aws.elasticbeanstalk.-2010-12-01/application-version-lifecycle-config (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.elasticbeanstalk.-2010-12-01/max-count-rule :portkey.aws.elasticbeanstalk.-2010-12-01/max-age-rule]))

(clojure.spec.alpha/def :portkey.aws.elasticbeanstalk.-2010-12-01.create-application-message/resource-lifecycle-config (clojure.spec.alpha/and :portkey.aws.elasticbeanstalk.-2010-12-01/application-resource-lifecycle-config))
(clojure.spec.alpha/def :portkey.aws.elasticbeanstalk.-2010-12-01/create-application-message (clojure.spec.alpha/keys :req-un [:portkey.aws.elasticbeanstalk.-2010-12-01/application-name] :opt-un [:portkey.aws.elasticbeanstalk.-2010-12-01/description :portkey.aws.elasticbeanstalk.-2010-12-01.create-application-message/resource-lifecycle-config]))

(clojure.spec.alpha/def :portkey.aws.elasticbeanstalk.-2010-12-01/tags (clojure.spec.alpha/coll-of :portkey.aws.elasticbeanstalk.-2010-12-01/tag))

(clojure.spec.alpha/def :portkey.aws.elasticbeanstalk.-2010-12-01/instance-health-list (clojure.spec.alpha/coll-of :portkey.aws.elasticbeanstalk.-2010-12-01/single-instance-health))

(clojure.spec.alpha/def :portkey.aws.elasticbeanstalk.-2010-12-01/dns-cname-prefix (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__283178__auto__] (clojure.core/<= 4 (clojure.core/count s__283178__auto__))) (clojure.core/fn [s__283179__auto__] (clojure.core/< (clojure.core/count s__283179__auto__) 63))))

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

(clojure.spec.alpha/def :portkey.aws.elasticbeanstalk.-2010-12-01/group-name (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__283178__auto__] (clojure.core/<= 1 (clojure.core/count s__283178__auto__))) (clojure.core/fn [s__283179__auto__] (clojure.core/< (clojure.core/count s__283179__auto__) 19))))

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

(clojure.spec.alpha/def :portkey.aws.elasticbeanstalk.-2010-12-01/next-token (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__283178__auto__] (clojure.core/<= 1 (clojure.core/count s__283178__auto__))) (clojure.core/fn [s__283179__auto__] (clojure.core/< (clojure.core/count s__283179__auto__) 100))))

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

(clojure.spec.alpha/def :portkey.aws.elasticbeanstalk.-2010-12-01/description (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__283179__auto__] (clojure.core/< (clojure.core/count s__283179__auto__) 200))))

(clojure.spec.alpha/def :portkey.aws.elasticbeanstalk.-2010-12-01/tag-value (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__283178__auto__] (clojure.core/<= 1 (clojure.core/count s__283178__auto__))) (clojure.core/fn [s__283179__auto__] (clojure.core/< (clojure.core/count s__283179__auto__) 256))))

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

(clojure.spec.alpha/def :portkey.aws.elasticbeanstalk.-2010-12-01/application-name (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__283178__auto__] (clojure.core/<= 1 (clojure.core/count s__283178__auto__))) (clojure.core/fn [s__283179__auto__] (clojure.core/< (clojure.core/count s__283179__auto__) 100))))

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

(clojure.spec.alpha/def :portkey.aws.elasticbeanstalk.-2010-12-01/resource-name (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__283178__auto__] (clojure.core/<= 1 (clojure.core/count s__283178__auto__))) (clojure.core/fn [s__283179__auto__] (clojure.core/< (clojure.core/count s__283179__auto__) 256))))

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

(clojure.spec.alpha/def :portkey.aws.elasticbeanstalk.-2010-12-01/s-3-key (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__283179__auto__] (clojure.core/< (clojure.core/count s__283179__auto__) 1024))))

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

(clojure.spec.alpha/def :portkey.aws.elasticbeanstalk.-2010-12-01/s-3-bucket (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__283179__auto__] (clojure.core/< (clojure.core/count s__283179__auto__) 255))))

(clojure.spec.alpha/def :portkey.aws.elasticbeanstalk.-2010-12-01.validate-configuration-settings-message/template-name (clojure.spec.alpha/and :portkey.aws.elasticbeanstalk.-2010-12-01/configuration-template-name))
(clojure.spec.alpha/def :portkey.aws.elasticbeanstalk.-2010-12-01.validate-configuration-settings-message/option-settings (clojure.spec.alpha/and :portkey.aws.elasticbeanstalk.-2010-12-01/configuration-option-settings-list))
(clojure.spec.alpha/def :portkey.aws.elasticbeanstalk.-2010-12-01/validate-configuration-settings-message (clojure.spec.alpha/keys :req-un [:portkey.aws.elasticbeanstalk.-2010-12-01/application-name :portkey.aws.elasticbeanstalk.-2010-12-01.validate-configuration-settings-message/option-settings] :opt-un [:portkey.aws.elasticbeanstalk.-2010-12-01.validate-configuration-settings-message/template-name :portkey.aws.elasticbeanstalk.-2010-12-01/environment-name]))

(clojure.spec.alpha/def :portkey.aws.elasticbeanstalk.-2010-12-01/refreshed-at clojure.core/inst?)

(clojure.spec.alpha/def :portkey.aws.elasticbeanstalk.-2010-12-01/source-location (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__283178__auto__] (clojure.core/<= 3 (clojure.core/count s__283178__auto__))) (clojure.core/fn [s__283179__auto__] (clojure.core/< (clojure.core/count s__283179__auto__) 255)) (clojure.core/fn [s__283180__auto__] (clojure.core/re-matches #".+/.+" s__283180__auto__))))

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

(clojure.spec.alpha/def :portkey.aws.elasticbeanstalk.-2010-12-01/configuration-template-name (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__283178__auto__] (clojure.core/<= 1 (clojure.core/count s__283178__auto__))) (clojure.core/fn [s__283179__auto__] (clojure.core/< (clojure.core/count s__283179__auto__) 100))))

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

(clojure.core/defn create-application-version ([create-application-version-messageinput] (clojure.core/let [request-function-result__284154__auto__ (req-create-application-version-message create-application-version-messageinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__284154__auto__ {:http.request.configuration/endpoints portkey.aws.elasticbeanstalk.-2010-12-01/endpoints, :http.request.configuration/target-prefix nil, :http.request.spec/output-spec :portkey.aws.elasticbeanstalk.-2010-12-01/application-version-description-message, :http.request.configuration/mime-type {"content-type" "application/x-www-form-urlencoded; charset=utf-8"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2010-12-01", :http.request.configuration/service-id "Elastic Beanstalk", :http.request.spec/input-spec :portkey.aws.elasticbeanstalk.-2010-12-01/create-application-version-message, :http.request.configuration/protocol "query", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper "CreateApplicationVersionResult", :http.request.configuration/action "CreateApplicationVersion", :http.request.configuration/output-deser-fn response-application-version-description-message, :http.request.spec/error-spec {"TooManyApplicationsException" :portkey.aws.elasticbeanstalk.-2010-12-01/too-many-applications-exception, "TooManyApplicationVersionsException" :portkey.aws.elasticbeanstalk.-2010-12-01/too-many-application-versions-exception, "InsufficientPrivilegesException" :portkey.aws.elasticbeanstalk.-2010-12-01/insufficient-privileges-exception, "S3LocationNotInServiceRegionException" :portkey.aws.elasticbeanstalk.-2010-12-01/s-3-location-not-in-service-region-exception, "CodeBuildNotInServiceRegionException" :portkey.aws.elasticbeanstalk.-2010-12-01/code-build-not-in-service-region-exception}})))))
(clojure.spec.alpha/fdef create-application-version :args (clojure.spec.alpha/tuple :portkey.aws.elasticbeanstalk.-2010-12-01/create-application-version-message) :ret (clojure.spec.alpha/and :portkey.aws.elasticbeanstalk.-2010-12-01/application-version-description-message))

(clojure.core/defn update-environment ([] (update-environment {})) ([update-environment-messageinput] (clojure.core/let [request-function-result__284154__auto__ (req-update-environment-message update-environment-messageinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__284154__auto__ {:http.request.configuration/endpoints portkey.aws.elasticbeanstalk.-2010-12-01/endpoints, :http.request.configuration/target-prefix nil, :http.request.spec/output-spec :portkey.aws.elasticbeanstalk.-2010-12-01/environment-description, :http.request.configuration/mime-type {"content-type" "application/x-www-form-urlencoded; charset=utf-8"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2010-12-01", :http.request.configuration/service-id "Elastic Beanstalk", :http.request.spec/input-spec :portkey.aws.elasticbeanstalk.-2010-12-01/update-environment-message, :http.request.configuration/protocol "query", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper "UpdateEnvironmentResult", :http.request.configuration/action "UpdateEnvironment", :http.request.configuration/output-deser-fn response-environment-description, :http.request.spec/error-spec {"InsufficientPrivilegesException" :portkey.aws.elasticbeanstalk.-2010-12-01/insufficient-privileges-exception, "TooManyBucketsException" :portkey.aws.elasticbeanstalk.-2010-12-01/too-many-buckets-exception}})))))
(clojure.spec.alpha/fdef update-environment :args (clojure.spec.alpha/? :portkey.aws.elasticbeanstalk.-2010-12-01/update-environment-message) :ret (clojure.spec.alpha/and :portkey.aws.elasticbeanstalk.-2010-12-01/environment-description))

(clojure.core/defn update-tags-for-resource ([update-tags-for-resource-messageinput] (clojure.core/let [request-function-result__284154__auto__ (req-update-tags-for-resource-message update-tags-for-resource-messageinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__284154__auto__ {:http.request.configuration/endpoints portkey.aws.elasticbeanstalk.-2010-12-01/endpoints, :http.request.configuration/target-prefix nil, :http.request.spec/output-spec nil, :http.request.configuration/mime-type {"content-type" "application/x-www-form-urlencoded; charset=utf-8"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2010-12-01", :http.request.configuration/service-id "Elastic Beanstalk", :http.request.spec/input-spec :portkey.aws.elasticbeanstalk.-2010-12-01/update-tags-for-resource-message, :http.request.configuration/protocol "query", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "UpdateTagsForResource", :http.request.configuration/output-deser-fn (clojure.core/fn [& args__284153__auto__] {}), :http.request.spec/error-spec {"InsufficientPrivilegesException" :portkey.aws.elasticbeanstalk.-2010-12-01/insufficient-privileges-exception, "OperationInProgressException" :portkey.aws.elasticbeanstalk.-2010-12-01/operation-in-progress-exception, "TooManyTagsException" :portkey.aws.elasticbeanstalk.-2010-12-01/too-many-tags-exception, "ResourceNotFoundException" :portkey.aws.elasticbeanstalk.-2010-12-01/resource-not-found-exception, "ResourceTypeNotSupportedException" :portkey.aws.elasticbeanstalk.-2010-12-01/resource-type-not-supported-exception}})))))
(clojure.spec.alpha/fdef update-tags-for-resource :args (clojure.spec.alpha/tuple :portkey.aws.elasticbeanstalk.-2010-12-01/update-tags-for-resource-message) :ret clojure.core/true?)

(clojure.core/defn describe-platform-version ([] (describe-platform-version {})) ([describe-platform-version-requestinput] (clojure.core/let [request-function-result__284154__auto__ (req-describe-platform-version-request describe-platform-version-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__284154__auto__ {:http.request.configuration/endpoints portkey.aws.elasticbeanstalk.-2010-12-01/endpoints, :http.request.configuration/target-prefix nil, :http.request.spec/output-spec :portkey.aws.elasticbeanstalk.-2010-12-01/describe-platform-version-result, :http.request.configuration/mime-type {"content-type" "application/x-www-form-urlencoded; charset=utf-8"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2010-12-01", :http.request.configuration/service-id "Elastic Beanstalk", :http.request.spec/input-spec :portkey.aws.elasticbeanstalk.-2010-12-01/describe-platform-version-request, :http.request.configuration/protocol "query", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper "DescribePlatformVersionResult", :http.request.configuration/action "DescribePlatformVersion", :http.request.configuration/output-deser-fn response-describe-platform-version-result, :http.request.spec/error-spec {"InsufficientPrivilegesException" :portkey.aws.elasticbeanstalk.-2010-12-01/insufficient-privileges-exception, "ElasticBeanstalkServiceException" :portkey.aws.elasticbeanstalk.-2010-12-01/elastic-beanstalk-service-exception}})))))
(clojure.spec.alpha/fdef describe-platform-version :args (clojure.spec.alpha/? :portkey.aws.elasticbeanstalk.-2010-12-01/describe-platform-version-request) :ret (clojure.spec.alpha/and :portkey.aws.elasticbeanstalk.-2010-12-01/describe-platform-version-result))

(clojure.core/defn create-platform-version ([create-platform-version-requestinput] (clojure.core/let [request-function-result__284154__auto__ (req-create-platform-version-request create-platform-version-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__284154__auto__ {:http.request.configuration/endpoints portkey.aws.elasticbeanstalk.-2010-12-01/endpoints, :http.request.configuration/target-prefix nil, :http.request.spec/output-spec :portkey.aws.elasticbeanstalk.-2010-12-01/create-platform-version-result, :http.request.configuration/mime-type {"content-type" "application/x-www-form-urlencoded; charset=utf-8"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2010-12-01", :http.request.configuration/service-id "Elastic Beanstalk", :http.request.spec/input-spec :portkey.aws.elasticbeanstalk.-2010-12-01/create-platform-version-request, :http.request.configuration/protocol "query", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper "CreatePlatformVersionResult", :http.request.configuration/action "CreatePlatformVersion", :http.request.configuration/output-deser-fn response-create-platform-version-result, :http.request.spec/error-spec {"InsufficientPrivilegesException" :portkey.aws.elasticbeanstalk.-2010-12-01/insufficient-privileges-exception, "ElasticBeanstalkServiceException" :portkey.aws.elasticbeanstalk.-2010-12-01/elastic-beanstalk-service-exception, "TooManyPlatformsException" :portkey.aws.elasticbeanstalk.-2010-12-01/too-many-platforms-exception}})))))
(clojure.spec.alpha/fdef create-platform-version :args (clojure.spec.alpha/tuple :portkey.aws.elasticbeanstalk.-2010-12-01/create-platform-version-request) :ret (clojure.spec.alpha/and :portkey.aws.elasticbeanstalk.-2010-12-01/create-platform-version-result))

(clojure.core/defn create-environment ([create-environment-messageinput] (clojure.core/let [request-function-result__284154__auto__ (req-create-environment-message create-environment-messageinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__284154__auto__ {:http.request.configuration/endpoints portkey.aws.elasticbeanstalk.-2010-12-01/endpoints, :http.request.configuration/target-prefix nil, :http.request.spec/output-spec :portkey.aws.elasticbeanstalk.-2010-12-01/environment-description, :http.request.configuration/mime-type {"content-type" "application/x-www-form-urlencoded; charset=utf-8"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2010-12-01", :http.request.configuration/service-id "Elastic Beanstalk", :http.request.spec/input-spec :portkey.aws.elasticbeanstalk.-2010-12-01/create-environment-message, :http.request.configuration/protocol "query", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper "CreateEnvironmentResult", :http.request.configuration/action "CreateEnvironment", :http.request.configuration/output-deser-fn response-environment-description, :http.request.spec/error-spec {"TooManyEnvironmentsException" :portkey.aws.elasticbeanstalk.-2010-12-01/too-many-environments-exception, "InsufficientPrivilegesException" :portkey.aws.elasticbeanstalk.-2010-12-01/insufficient-privileges-exception}})))))
(clojure.spec.alpha/fdef create-environment :args (clojure.spec.alpha/tuple :portkey.aws.elasticbeanstalk.-2010-12-01/create-environment-message) :ret (clojure.spec.alpha/and :portkey.aws.elasticbeanstalk.-2010-12-01/environment-description))

(clojure.core/defn describe-environment-managed-actions ([] (describe-environment-managed-actions {})) ([describe-environment-managed-actions-requestinput] (clojure.core/let [request-function-result__284154__auto__ (req-describe-environment-managed-actions-request describe-environment-managed-actions-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__284154__auto__ {:http.request.configuration/endpoints portkey.aws.elasticbeanstalk.-2010-12-01/endpoints, :http.request.configuration/target-prefix nil, :http.request.spec/output-spec :portkey.aws.elasticbeanstalk.-2010-12-01/describe-environment-managed-actions-result, :http.request.configuration/mime-type {"content-type" "application/x-www-form-urlencoded; charset=utf-8"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2010-12-01", :http.request.configuration/service-id "Elastic Beanstalk", :http.request.spec/input-spec :portkey.aws.elasticbeanstalk.-2010-12-01/describe-environment-managed-actions-request, :http.request.configuration/protocol "query", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper "DescribeEnvironmentManagedActionsResult", :http.request.configuration/action "DescribeEnvironmentManagedActions", :http.request.configuration/output-deser-fn response-describe-environment-managed-actions-result, :http.request.spec/error-spec {"ElasticBeanstalkServiceException" :portkey.aws.elasticbeanstalk.-2010-12-01/elastic-beanstalk-service-exception}})))))
(clojure.spec.alpha/fdef describe-environment-managed-actions :args (clojure.spec.alpha/? :portkey.aws.elasticbeanstalk.-2010-12-01/describe-environment-managed-actions-request) :ret (clojure.spec.alpha/and :portkey.aws.elasticbeanstalk.-2010-12-01/describe-environment-managed-actions-result))

(clojure.core/defn delete-application ([delete-application-messageinput] (clojure.core/let [request-function-result__284154__auto__ (req-delete-application-message delete-application-messageinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__284154__auto__ {:http.request.configuration/endpoints portkey.aws.elasticbeanstalk.-2010-12-01/endpoints, :http.request.configuration/target-prefix nil, :http.request.spec/output-spec nil, :http.request.configuration/mime-type {"content-type" "application/x-www-form-urlencoded; charset=utf-8"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2010-12-01", :http.request.configuration/service-id "Elastic Beanstalk", :http.request.spec/input-spec :portkey.aws.elasticbeanstalk.-2010-12-01/delete-application-message, :http.request.configuration/protocol "query", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "DeleteApplication", :http.request.configuration/output-deser-fn (clojure.core/fn [& args__284153__auto__] {}), :http.request.spec/error-spec {"OperationInProgressException" :portkey.aws.elasticbeanstalk.-2010-12-01/operation-in-progress-exception}})))))
(clojure.spec.alpha/fdef delete-application :args (clojure.spec.alpha/tuple :portkey.aws.elasticbeanstalk.-2010-12-01/delete-application-message) :ret clojure.core/true?)

(clojure.core/defn describe-instances-health ([] (describe-instances-health {})) ([describe-instances-health-requestinput] (clojure.core/let [request-function-result__284154__auto__ (req-describe-instances-health-request describe-instances-health-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__284154__auto__ {:http.request.configuration/endpoints portkey.aws.elasticbeanstalk.-2010-12-01/endpoints, :http.request.configuration/target-prefix nil, :http.request.spec/output-spec :portkey.aws.elasticbeanstalk.-2010-12-01/describe-instances-health-result, :http.request.configuration/mime-type {"content-type" "application/x-www-form-urlencoded; charset=utf-8"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2010-12-01", :http.request.configuration/service-id "Elastic Beanstalk", :http.request.spec/input-spec :portkey.aws.elasticbeanstalk.-2010-12-01/describe-instances-health-request, :http.request.configuration/protocol "query", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper "DescribeInstancesHealthResult", :http.request.configuration/action "DescribeInstancesHealth", :http.request.configuration/output-deser-fn response-describe-instances-health-result, :http.request.spec/error-spec {"InvalidRequestException" :portkey.aws.elasticbeanstalk.-2010-12-01/invalid-request-exception, "ElasticBeanstalkServiceException" :portkey.aws.elasticbeanstalk.-2010-12-01/elastic-beanstalk-service-exception}})))))
(clojure.spec.alpha/fdef describe-instances-health :args (clojure.spec.alpha/? :portkey.aws.elasticbeanstalk.-2010-12-01/describe-instances-health-request) :ret (clojure.spec.alpha/and :portkey.aws.elasticbeanstalk.-2010-12-01/describe-instances-health-result))

(clojure.core/defn describe-configuration-options ([] (describe-configuration-options {})) ([describe-configuration-options-messageinput] (clojure.core/let [request-function-result__284154__auto__ (req-describe-configuration-options-message describe-configuration-options-messageinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__284154__auto__ {:http.request.configuration/endpoints portkey.aws.elasticbeanstalk.-2010-12-01/endpoints, :http.request.configuration/target-prefix nil, :http.request.spec/output-spec :portkey.aws.elasticbeanstalk.-2010-12-01/configuration-options-description, :http.request.configuration/mime-type {"content-type" "application/x-www-form-urlencoded; charset=utf-8"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2010-12-01", :http.request.configuration/service-id "Elastic Beanstalk", :http.request.spec/input-spec :portkey.aws.elasticbeanstalk.-2010-12-01/describe-configuration-options-message, :http.request.configuration/protocol "query", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper "DescribeConfigurationOptionsResult", :http.request.configuration/action "DescribeConfigurationOptions", :http.request.configuration/output-deser-fn response-configuration-options-description, :http.request.spec/error-spec {"TooManyBucketsException" :portkey.aws.elasticbeanstalk.-2010-12-01/too-many-buckets-exception}})))))
(clojure.spec.alpha/fdef describe-configuration-options :args (clojure.spec.alpha/? :portkey.aws.elasticbeanstalk.-2010-12-01/describe-configuration-options-message) :ret (clojure.spec.alpha/and :portkey.aws.elasticbeanstalk.-2010-12-01/configuration-options-description))

(clojure.core/defn compose-environments ([] (compose-environments {})) ([compose-environments-messageinput] (clojure.core/let [request-function-result__284154__auto__ (req-compose-environments-message compose-environments-messageinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__284154__auto__ {:http.request.configuration/endpoints portkey.aws.elasticbeanstalk.-2010-12-01/endpoints, :http.request.configuration/target-prefix nil, :http.request.spec/output-spec :portkey.aws.elasticbeanstalk.-2010-12-01/environment-descriptions-message, :http.request.configuration/mime-type {"content-type" "application/x-www-form-urlencoded; charset=utf-8"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2010-12-01", :http.request.configuration/service-id "Elastic Beanstalk", :http.request.spec/input-spec :portkey.aws.elasticbeanstalk.-2010-12-01/compose-environments-message, :http.request.configuration/protocol "query", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper "ComposeEnvironmentsResult", :http.request.configuration/action "ComposeEnvironments", :http.request.configuration/output-deser-fn response-environment-descriptions-message, :http.request.spec/error-spec {"TooManyEnvironmentsException" :portkey.aws.elasticbeanstalk.-2010-12-01/too-many-environments-exception, "InsufficientPrivilegesException" :portkey.aws.elasticbeanstalk.-2010-12-01/insufficient-privileges-exception}})))))
(clojure.spec.alpha/fdef compose-environments :args (clojure.spec.alpha/? :portkey.aws.elasticbeanstalk.-2010-12-01/compose-environments-message) :ret (clojure.spec.alpha/and :portkey.aws.elasticbeanstalk.-2010-12-01/environment-descriptions-message))

(clojure.core/defn describe-events ([] (describe-events {})) ([describe-events-messageinput] (clojure.core/let [request-function-result__284154__auto__ (req-describe-events-message describe-events-messageinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__284154__auto__ {:http.request.configuration/endpoints portkey.aws.elasticbeanstalk.-2010-12-01/endpoints, :http.request.configuration/target-prefix nil, :http.request.spec/output-spec :portkey.aws.elasticbeanstalk.-2010-12-01/event-descriptions-message, :http.request.configuration/mime-type {"content-type" "application/x-www-form-urlencoded; charset=utf-8"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2010-12-01", :http.request.configuration/service-id "Elastic Beanstalk", :http.request.spec/input-spec :portkey.aws.elasticbeanstalk.-2010-12-01/describe-events-message, :http.request.configuration/protocol "query", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper "DescribeEventsResult", :http.request.configuration/action "DescribeEvents", :http.request.configuration/output-deser-fn response-event-descriptions-message, :http.request.spec/error-spec {}})))))
(clojure.spec.alpha/fdef describe-events :args (clojure.spec.alpha/? :portkey.aws.elasticbeanstalk.-2010-12-01/describe-events-message) :ret (clojure.spec.alpha/and :portkey.aws.elasticbeanstalk.-2010-12-01/event-descriptions-message))

(clojure.core/defn describe-environment-resources ([] (describe-environment-resources {})) ([describe-environment-resources-messageinput] (clojure.core/let [request-function-result__284154__auto__ (req-describe-environment-resources-message describe-environment-resources-messageinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__284154__auto__ {:http.request.configuration/endpoints portkey.aws.elasticbeanstalk.-2010-12-01/endpoints, :http.request.configuration/target-prefix nil, :http.request.spec/output-spec :portkey.aws.elasticbeanstalk.-2010-12-01/environment-resource-descriptions-message, :http.request.configuration/mime-type {"content-type" "application/x-www-form-urlencoded; charset=utf-8"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2010-12-01", :http.request.configuration/service-id "Elastic Beanstalk", :http.request.spec/input-spec :portkey.aws.elasticbeanstalk.-2010-12-01/describe-environment-resources-message, :http.request.configuration/protocol "query", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper "DescribeEnvironmentResourcesResult", :http.request.configuration/action "DescribeEnvironmentResources", :http.request.configuration/output-deser-fn response-environment-resource-descriptions-message, :http.request.spec/error-spec {"InsufficientPrivilegesException" :portkey.aws.elasticbeanstalk.-2010-12-01/insufficient-privileges-exception}})))))
(clojure.spec.alpha/fdef describe-environment-resources :args (clojure.spec.alpha/? :portkey.aws.elasticbeanstalk.-2010-12-01/describe-environment-resources-message) :ret (clojure.spec.alpha/and :portkey.aws.elasticbeanstalk.-2010-12-01/environment-resource-descriptions-message))

(clojure.core/defn update-application-resource-lifecycle ([update-application-resource-lifecycle-messageinput] (clojure.core/let [request-function-result__284154__auto__ (req-update-application-resource-lifecycle-message update-application-resource-lifecycle-messageinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__284154__auto__ {:http.request.configuration/endpoints portkey.aws.elasticbeanstalk.-2010-12-01/endpoints, :http.request.configuration/target-prefix nil, :http.request.spec/output-spec :portkey.aws.elasticbeanstalk.-2010-12-01/application-resource-lifecycle-description-message, :http.request.configuration/mime-type {"content-type" "application/x-www-form-urlencoded; charset=utf-8"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2010-12-01", :http.request.configuration/service-id "Elastic Beanstalk", :http.request.spec/input-spec :portkey.aws.elasticbeanstalk.-2010-12-01/update-application-resource-lifecycle-message, :http.request.configuration/protocol "query", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper "UpdateApplicationResourceLifecycleResult", :http.request.configuration/action "UpdateApplicationResourceLifecycle", :http.request.configuration/output-deser-fn response-application-resource-lifecycle-description-message, :http.request.spec/error-spec {"InsufficientPrivilegesException" :portkey.aws.elasticbeanstalk.-2010-12-01/insufficient-privileges-exception}})))))
(clojure.spec.alpha/fdef update-application-resource-lifecycle :args (clojure.spec.alpha/tuple :portkey.aws.elasticbeanstalk.-2010-12-01/update-application-resource-lifecycle-message) :ret (clojure.spec.alpha/and :portkey.aws.elasticbeanstalk.-2010-12-01/application-resource-lifecycle-description-message))

(clojure.core/defn describe-environment-health ([] (describe-environment-health {})) ([describe-environment-health-requestinput] (clojure.core/let [request-function-result__284154__auto__ (req-describe-environment-health-request describe-environment-health-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__284154__auto__ {:http.request.configuration/endpoints portkey.aws.elasticbeanstalk.-2010-12-01/endpoints, :http.request.configuration/target-prefix nil, :http.request.spec/output-spec :portkey.aws.elasticbeanstalk.-2010-12-01/describe-environment-health-result, :http.request.configuration/mime-type {"content-type" "application/x-www-form-urlencoded; charset=utf-8"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2010-12-01", :http.request.configuration/service-id "Elastic Beanstalk", :http.request.spec/input-spec :portkey.aws.elasticbeanstalk.-2010-12-01/describe-environment-health-request, :http.request.configuration/protocol "query", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper "DescribeEnvironmentHealthResult", :http.request.configuration/action "DescribeEnvironmentHealth", :http.request.configuration/output-deser-fn response-describe-environment-health-result, :http.request.spec/error-spec {"InvalidRequestException" :portkey.aws.elasticbeanstalk.-2010-12-01/invalid-request-exception, "ElasticBeanstalkServiceException" :portkey.aws.elasticbeanstalk.-2010-12-01/elastic-beanstalk-service-exception}})))))
(clojure.spec.alpha/fdef describe-environment-health :args (clojure.spec.alpha/? :portkey.aws.elasticbeanstalk.-2010-12-01/describe-environment-health-request) :ret (clojure.spec.alpha/and :portkey.aws.elasticbeanstalk.-2010-12-01/describe-environment-health-result))

(clojure.core/defn request-environment-info ([request-environment-info-messageinput] (clojure.core/let [request-function-result__284154__auto__ (req-request-environment-info-message request-environment-info-messageinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__284154__auto__ {:http.request.configuration/endpoints portkey.aws.elasticbeanstalk.-2010-12-01/endpoints, :http.request.configuration/target-prefix nil, :http.request.spec/output-spec nil, :http.request.configuration/mime-type {"content-type" "application/x-www-form-urlencoded; charset=utf-8"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2010-12-01", :http.request.configuration/service-id "Elastic Beanstalk", :http.request.spec/input-spec :portkey.aws.elasticbeanstalk.-2010-12-01/request-environment-info-message, :http.request.configuration/protocol "query", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "RequestEnvironmentInfo", :http.request.configuration/output-deser-fn (clojure.core/fn [& args__284153__auto__] {}), :http.request.spec/error-spec {}})))))
(clojure.spec.alpha/fdef request-environment-info :args (clojure.spec.alpha/tuple :portkey.aws.elasticbeanstalk.-2010-12-01/request-environment-info-message) :ret clojure.core/true?)

(clojure.core/defn list-platform-versions ([] (list-platform-versions {})) ([list-platform-versions-requestinput] (clojure.core/let [request-function-result__284154__auto__ (req-list-platform-versions-request list-platform-versions-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__284154__auto__ {:http.request.configuration/endpoints portkey.aws.elasticbeanstalk.-2010-12-01/endpoints, :http.request.configuration/target-prefix nil, :http.request.spec/output-spec :portkey.aws.elasticbeanstalk.-2010-12-01/list-platform-versions-result, :http.request.configuration/mime-type {"content-type" "application/x-www-form-urlencoded; charset=utf-8"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2010-12-01", :http.request.configuration/service-id "Elastic Beanstalk", :http.request.spec/input-spec :portkey.aws.elasticbeanstalk.-2010-12-01/list-platform-versions-request, :http.request.configuration/protocol "query", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper "ListPlatformVersionsResult", :http.request.configuration/action "ListPlatformVersions", :http.request.configuration/output-deser-fn response-list-platform-versions-result, :http.request.spec/error-spec {"InsufficientPrivilegesException" :portkey.aws.elasticbeanstalk.-2010-12-01/insufficient-privileges-exception, "ElasticBeanstalkServiceException" :portkey.aws.elasticbeanstalk.-2010-12-01/elastic-beanstalk-service-exception}})))))
(clojure.spec.alpha/fdef list-platform-versions :args (clojure.spec.alpha/? :portkey.aws.elasticbeanstalk.-2010-12-01/list-platform-versions-request) :ret (clojure.spec.alpha/and :portkey.aws.elasticbeanstalk.-2010-12-01/list-platform-versions-result))

(clojure.core/defn apply-environment-managed-action ([apply-environment-managed-action-requestinput] (clojure.core/let [request-function-result__284154__auto__ (req-apply-environment-managed-action-request apply-environment-managed-action-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__284154__auto__ {:http.request.configuration/endpoints portkey.aws.elasticbeanstalk.-2010-12-01/endpoints, :http.request.configuration/target-prefix nil, :http.request.spec/output-spec :portkey.aws.elasticbeanstalk.-2010-12-01/apply-environment-managed-action-result, :http.request.configuration/mime-type {"content-type" "application/x-www-form-urlencoded; charset=utf-8"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2010-12-01", :http.request.configuration/service-id "Elastic Beanstalk", :http.request.spec/input-spec :portkey.aws.elasticbeanstalk.-2010-12-01/apply-environment-managed-action-request, :http.request.configuration/protocol "query", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper "ApplyEnvironmentManagedActionResult", :http.request.configuration/action "ApplyEnvironmentManagedAction", :http.request.configuration/output-deser-fn response-apply-environment-managed-action-result, :http.request.spec/error-spec {"ElasticBeanstalkServiceException" :portkey.aws.elasticbeanstalk.-2010-12-01/elastic-beanstalk-service-exception, "ManagedActionInvalidStateException" :portkey.aws.elasticbeanstalk.-2010-12-01/managed-action-invalid-state-exception}})))))
(clojure.spec.alpha/fdef apply-environment-managed-action :args (clojure.spec.alpha/tuple :portkey.aws.elasticbeanstalk.-2010-12-01/apply-environment-managed-action-request) :ret (clojure.spec.alpha/and :portkey.aws.elasticbeanstalk.-2010-12-01/apply-environment-managed-action-result))

(clojure.core/defn describe-applications ([] (describe-applications {})) ([describe-applications-messageinput] (clojure.core/let [request-function-result__284154__auto__ (req-describe-applications-message describe-applications-messageinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__284154__auto__ {:http.request.configuration/endpoints portkey.aws.elasticbeanstalk.-2010-12-01/endpoints, :http.request.configuration/target-prefix nil, :http.request.spec/output-spec :portkey.aws.elasticbeanstalk.-2010-12-01/application-descriptions-message, :http.request.configuration/mime-type {"content-type" "application/x-www-form-urlencoded; charset=utf-8"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2010-12-01", :http.request.configuration/service-id "Elastic Beanstalk", :http.request.spec/input-spec :portkey.aws.elasticbeanstalk.-2010-12-01/describe-applications-message, :http.request.configuration/protocol "query", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper "DescribeApplicationsResult", :http.request.configuration/action "DescribeApplications", :http.request.configuration/output-deser-fn response-application-descriptions-message, :http.request.spec/error-spec {}})))))
(clojure.spec.alpha/fdef describe-applications :args (clojure.spec.alpha/? :portkey.aws.elasticbeanstalk.-2010-12-01/describe-applications-message) :ret (clojure.spec.alpha/and :portkey.aws.elasticbeanstalk.-2010-12-01/application-descriptions-message))

(clojure.core/defn list-tags-for-resource ([list-tags-for-resource-messageinput] (clojure.core/let [request-function-result__284154__auto__ (req-list-tags-for-resource-message list-tags-for-resource-messageinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__284154__auto__ {:http.request.configuration/endpoints portkey.aws.elasticbeanstalk.-2010-12-01/endpoints, :http.request.configuration/target-prefix nil, :http.request.spec/output-spec :portkey.aws.elasticbeanstalk.-2010-12-01/resource-tags-description-message, :http.request.configuration/mime-type {"content-type" "application/x-www-form-urlencoded; charset=utf-8"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2010-12-01", :http.request.configuration/service-id "Elastic Beanstalk", :http.request.spec/input-spec :portkey.aws.elasticbeanstalk.-2010-12-01/list-tags-for-resource-message, :http.request.configuration/protocol "query", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper "ListTagsForResourceResult", :http.request.configuration/action "ListTagsForResource", :http.request.configuration/output-deser-fn response-resource-tags-description-message, :http.request.spec/error-spec {"InsufficientPrivilegesException" :portkey.aws.elasticbeanstalk.-2010-12-01/insufficient-privileges-exception, "ResourceNotFoundException" :portkey.aws.elasticbeanstalk.-2010-12-01/resource-not-found-exception, "ResourceTypeNotSupportedException" :portkey.aws.elasticbeanstalk.-2010-12-01/resource-type-not-supported-exception}})))))
(clojure.spec.alpha/fdef list-tags-for-resource :args (clojure.spec.alpha/tuple :portkey.aws.elasticbeanstalk.-2010-12-01/list-tags-for-resource-message) :ret (clojure.spec.alpha/and :portkey.aws.elasticbeanstalk.-2010-12-01/resource-tags-description-message))

(clojure.core/defn validate-configuration-settings ([validate-configuration-settings-messageinput] (clojure.core/let [request-function-result__284154__auto__ (req-validate-configuration-settings-message validate-configuration-settings-messageinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__284154__auto__ {:http.request.configuration/endpoints portkey.aws.elasticbeanstalk.-2010-12-01/endpoints, :http.request.configuration/target-prefix nil, :http.request.spec/output-spec :portkey.aws.elasticbeanstalk.-2010-12-01/configuration-settings-validation-messages, :http.request.configuration/mime-type {"content-type" "application/x-www-form-urlencoded; charset=utf-8"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2010-12-01", :http.request.configuration/service-id "Elastic Beanstalk", :http.request.spec/input-spec :portkey.aws.elasticbeanstalk.-2010-12-01/validate-configuration-settings-message, :http.request.configuration/protocol "query", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper "ValidateConfigurationSettingsResult", :http.request.configuration/action "ValidateConfigurationSettings", :http.request.configuration/output-deser-fn response-configuration-settings-validation-messages, :http.request.spec/error-spec {"InsufficientPrivilegesException" :portkey.aws.elasticbeanstalk.-2010-12-01/insufficient-privileges-exception, "TooManyBucketsException" :portkey.aws.elasticbeanstalk.-2010-12-01/too-many-buckets-exception}})))))
(clojure.spec.alpha/fdef validate-configuration-settings :args (clojure.spec.alpha/tuple :portkey.aws.elasticbeanstalk.-2010-12-01/validate-configuration-settings-message) :ret (clojure.spec.alpha/and :portkey.aws.elasticbeanstalk.-2010-12-01/configuration-settings-validation-messages))

(clojure.core/defn restart-app-server ([] (restart-app-server {})) ([restart-app-server-messageinput] (clojure.core/let [request-function-result__284154__auto__ (req-restart-app-server-message restart-app-server-messageinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__284154__auto__ {:http.request.configuration/endpoints portkey.aws.elasticbeanstalk.-2010-12-01/endpoints, :http.request.configuration/target-prefix nil, :http.request.spec/output-spec nil, :http.request.configuration/mime-type {"content-type" "application/x-www-form-urlencoded; charset=utf-8"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2010-12-01", :http.request.configuration/service-id "Elastic Beanstalk", :http.request.spec/input-spec :portkey.aws.elasticbeanstalk.-2010-12-01/restart-app-server-message, :http.request.configuration/protocol "query", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "RestartAppServer", :http.request.configuration/output-deser-fn (clojure.core/fn [& args__284153__auto__] {}), :http.request.spec/error-spec {}})))))
(clojure.spec.alpha/fdef restart-app-server :args (clojure.spec.alpha/? :portkey.aws.elasticbeanstalk.-2010-12-01/restart-app-server-message) :ret clojure.core/true?)

(clojure.core/defn describe-environments ([] (describe-environments {})) ([describe-environments-messageinput] (clojure.core/let [request-function-result__284154__auto__ (req-describe-environments-message describe-environments-messageinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__284154__auto__ {:http.request.configuration/endpoints portkey.aws.elasticbeanstalk.-2010-12-01/endpoints, :http.request.configuration/target-prefix nil, :http.request.spec/output-spec :portkey.aws.elasticbeanstalk.-2010-12-01/environment-descriptions-message, :http.request.configuration/mime-type {"content-type" "application/x-www-form-urlencoded; charset=utf-8"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2010-12-01", :http.request.configuration/service-id "Elastic Beanstalk", :http.request.spec/input-spec :portkey.aws.elasticbeanstalk.-2010-12-01/describe-environments-message, :http.request.configuration/protocol "query", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper "DescribeEnvironmentsResult", :http.request.configuration/action "DescribeEnvironments", :http.request.configuration/output-deser-fn response-environment-descriptions-message, :http.request.spec/error-spec {}})))))
(clojure.spec.alpha/fdef describe-environments :args (clojure.spec.alpha/? :portkey.aws.elasticbeanstalk.-2010-12-01/describe-environments-message) :ret (clojure.spec.alpha/and :portkey.aws.elasticbeanstalk.-2010-12-01/environment-descriptions-message))

(clojure.core/defn delete-environment-configuration ([delete-environment-configuration-messageinput] (clojure.core/let [request-function-result__284154__auto__ (req-delete-environment-configuration-message delete-environment-configuration-messageinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__284154__auto__ {:http.request.configuration/endpoints portkey.aws.elasticbeanstalk.-2010-12-01/endpoints, :http.request.configuration/target-prefix nil, :http.request.spec/output-spec nil, :http.request.configuration/mime-type {"content-type" "application/x-www-form-urlencoded; charset=utf-8"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2010-12-01", :http.request.configuration/service-id "Elastic Beanstalk", :http.request.spec/input-spec :portkey.aws.elasticbeanstalk.-2010-12-01/delete-environment-configuration-message, :http.request.configuration/protocol "query", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "DeleteEnvironmentConfiguration", :http.request.configuration/output-deser-fn (clojure.core/fn [& args__284153__auto__] {}), :http.request.spec/error-spec {}})))))
(clojure.spec.alpha/fdef delete-environment-configuration :args (clojure.spec.alpha/tuple :portkey.aws.elasticbeanstalk.-2010-12-01/delete-environment-configuration-message) :ret clojure.core/true?)

(clojure.core/defn terminate-environment ([] (terminate-environment {})) ([terminate-environment-messageinput] (clojure.core/let [request-function-result__284154__auto__ (req-terminate-environment-message terminate-environment-messageinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__284154__auto__ {:http.request.configuration/endpoints portkey.aws.elasticbeanstalk.-2010-12-01/endpoints, :http.request.configuration/target-prefix nil, :http.request.spec/output-spec :portkey.aws.elasticbeanstalk.-2010-12-01/environment-description, :http.request.configuration/mime-type {"content-type" "application/x-www-form-urlencoded; charset=utf-8"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2010-12-01", :http.request.configuration/service-id "Elastic Beanstalk", :http.request.spec/input-spec :portkey.aws.elasticbeanstalk.-2010-12-01/terminate-environment-message, :http.request.configuration/protocol "query", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper "TerminateEnvironmentResult", :http.request.configuration/action "TerminateEnvironment", :http.request.configuration/output-deser-fn response-environment-description, :http.request.spec/error-spec {"InsufficientPrivilegesException" :portkey.aws.elasticbeanstalk.-2010-12-01/insufficient-privileges-exception}})))))
(clojure.spec.alpha/fdef terminate-environment :args (clojure.spec.alpha/? :portkey.aws.elasticbeanstalk.-2010-12-01/terminate-environment-message) :ret (clojure.spec.alpha/and :portkey.aws.elasticbeanstalk.-2010-12-01/environment-description))

(clojure.core/defn check-dns-availability ([check-dns-availability-messageinput] (clojure.core/let [request-function-result__284154__auto__ (req-check-dns-availability-message check-dns-availability-messageinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__284154__auto__ {:http.request.configuration/endpoints portkey.aws.elasticbeanstalk.-2010-12-01/endpoints, :http.request.configuration/target-prefix nil, :http.request.spec/output-spec :portkey.aws.elasticbeanstalk.-2010-12-01/check-dns-availability-result-message, :http.request.configuration/mime-type {"content-type" "application/x-www-form-urlencoded; charset=utf-8"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2010-12-01", :http.request.configuration/service-id "Elastic Beanstalk", :http.request.spec/input-spec :portkey.aws.elasticbeanstalk.-2010-12-01/check-dns-availability-message, :http.request.configuration/protocol "query", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper "CheckDNSAvailabilityResult", :http.request.configuration/action "CheckDNSAvailability", :http.request.configuration/output-deser-fn response-check-dns-availability-result-message, :http.request.spec/error-spec {}})))))
(clojure.spec.alpha/fdef check-dns-availability :args (clojure.spec.alpha/tuple :portkey.aws.elasticbeanstalk.-2010-12-01/check-dns-availability-message) :ret (clojure.spec.alpha/and :portkey.aws.elasticbeanstalk.-2010-12-01/check-dns-availability-result-message))

(clojure.core/defn retrieve-environment-info ([retrieve-environment-info-messageinput] (clojure.core/let [request-function-result__284154__auto__ (req-retrieve-environment-info-message retrieve-environment-info-messageinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__284154__auto__ {:http.request.configuration/endpoints portkey.aws.elasticbeanstalk.-2010-12-01/endpoints, :http.request.configuration/target-prefix nil, :http.request.spec/output-spec :portkey.aws.elasticbeanstalk.-2010-12-01/retrieve-environment-info-result-message, :http.request.configuration/mime-type {"content-type" "application/x-www-form-urlencoded; charset=utf-8"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2010-12-01", :http.request.configuration/service-id "Elastic Beanstalk", :http.request.spec/input-spec :portkey.aws.elasticbeanstalk.-2010-12-01/retrieve-environment-info-message, :http.request.configuration/protocol "query", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper "RetrieveEnvironmentInfoResult", :http.request.configuration/action "RetrieveEnvironmentInfo", :http.request.configuration/output-deser-fn response-retrieve-environment-info-result-message, :http.request.spec/error-spec {}})))))
(clojure.spec.alpha/fdef retrieve-environment-info :args (clojure.spec.alpha/tuple :portkey.aws.elasticbeanstalk.-2010-12-01/retrieve-environment-info-message) :ret (clojure.spec.alpha/and :portkey.aws.elasticbeanstalk.-2010-12-01/retrieve-environment-info-result-message))

(clojure.core/defn create-storage-location ([] (create-storage-location {})) ([_] (clojure.core/let [request-function-result__284154__auto__ {}] (portkey.aws/-call-http (clojure.core/into request-function-result__284154__auto__ {:http.request.configuration/endpoints portkey.aws.elasticbeanstalk.-2010-12-01/endpoints, :http.request.configuration/target-prefix nil, :http.request.spec/output-spec :portkey.aws.elasticbeanstalk.-2010-12-01/create-storage-location-result-message, :http.request.configuration/mime-type {"content-type" "application/x-www-form-urlencoded; charset=utf-8"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2010-12-01", :http.request.configuration/service-id "Elastic Beanstalk", :http.request.spec/input-spec nil, :http.request.configuration/protocol "query", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper "CreateStorageLocationResult", :http.request.configuration/action "CreateStorageLocation", :http.request.configuration/output-deser-fn response-create-storage-location-result-message, :http.request.spec/error-spec {"TooManyBucketsException" :portkey.aws.elasticbeanstalk.-2010-12-01/too-many-buckets-exception, "S3SubscriptionRequiredException" :portkey.aws.elasticbeanstalk.-2010-12-01/s-3-subscription-required-exception, "InsufficientPrivilegesException" :portkey.aws.elasticbeanstalk.-2010-12-01/insufficient-privileges-exception}})))))
(clojure.spec.alpha/fdef create-storage-location :args clojure.core/empty? :ret (clojure.spec.alpha/and :portkey.aws.elasticbeanstalk.-2010-12-01/create-storage-location-result-message))

(clojure.core/defn update-application ([update-application-messageinput] (clojure.core/let [request-function-result__284154__auto__ (req-update-application-message update-application-messageinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__284154__auto__ {:http.request.configuration/endpoints portkey.aws.elasticbeanstalk.-2010-12-01/endpoints, :http.request.configuration/target-prefix nil, :http.request.spec/output-spec :portkey.aws.elasticbeanstalk.-2010-12-01/application-description-message, :http.request.configuration/mime-type {"content-type" "application/x-www-form-urlencoded; charset=utf-8"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2010-12-01", :http.request.configuration/service-id "Elastic Beanstalk", :http.request.spec/input-spec :portkey.aws.elasticbeanstalk.-2010-12-01/update-application-message, :http.request.configuration/protocol "query", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper "UpdateApplicationResult", :http.request.configuration/action "UpdateApplication", :http.request.configuration/output-deser-fn response-application-description-message, :http.request.spec/error-spec {}})))))
(clojure.spec.alpha/fdef update-application :args (clojure.spec.alpha/tuple :portkey.aws.elasticbeanstalk.-2010-12-01/update-application-message) :ret (clojure.spec.alpha/and :portkey.aws.elasticbeanstalk.-2010-12-01/application-description-message))

(clojure.core/defn describe-account-attributes ([] (describe-account-attributes {})) ([_] (clojure.core/let [request-function-result__284154__auto__ {}] (portkey.aws/-call-http (clojure.core/into request-function-result__284154__auto__ {:http.request.configuration/endpoints portkey.aws.elasticbeanstalk.-2010-12-01/endpoints, :http.request.configuration/target-prefix nil, :http.request.spec/output-spec :portkey.aws.elasticbeanstalk.-2010-12-01/describe-account-attributes-result, :http.request.configuration/mime-type {"content-type" "application/x-www-form-urlencoded; charset=utf-8"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2010-12-01", :http.request.configuration/service-id "Elastic Beanstalk", :http.request.spec/input-spec nil, :http.request.configuration/protocol "query", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper "DescribeAccountAttributesResult", :http.request.configuration/action "DescribeAccountAttributes", :http.request.configuration/output-deser-fn response-describe-account-attributes-result, :http.request.spec/error-spec {"InsufficientPrivilegesException" :portkey.aws.elasticbeanstalk.-2010-12-01/insufficient-privileges-exception}})))))
(clojure.spec.alpha/fdef describe-account-attributes :args clojure.core/empty? :ret (clojure.spec.alpha/and :portkey.aws.elasticbeanstalk.-2010-12-01/describe-account-attributes-result))

(clojure.core/defn create-application ([create-application-messageinput] (clojure.core/let [request-function-result__284154__auto__ (req-create-application-message create-application-messageinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__284154__auto__ {:http.request.configuration/endpoints portkey.aws.elasticbeanstalk.-2010-12-01/endpoints, :http.request.configuration/target-prefix nil, :http.request.spec/output-spec :portkey.aws.elasticbeanstalk.-2010-12-01/application-description-message, :http.request.configuration/mime-type {"content-type" "application/x-www-form-urlencoded; charset=utf-8"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2010-12-01", :http.request.configuration/service-id "Elastic Beanstalk", :http.request.spec/input-spec :portkey.aws.elasticbeanstalk.-2010-12-01/create-application-message, :http.request.configuration/protocol "query", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper "CreateApplicationResult", :http.request.configuration/action "CreateApplication", :http.request.configuration/output-deser-fn response-application-description-message, :http.request.spec/error-spec {"TooManyApplicationsException" :portkey.aws.elasticbeanstalk.-2010-12-01/too-many-applications-exception}})))))
(clojure.spec.alpha/fdef create-application :args (clojure.spec.alpha/tuple :portkey.aws.elasticbeanstalk.-2010-12-01/create-application-message) :ret (clojure.spec.alpha/and :portkey.aws.elasticbeanstalk.-2010-12-01/application-description-message))

(clojure.core/defn describe-configuration-settings ([describe-configuration-settings-messageinput] (clojure.core/let [request-function-result__284154__auto__ (req-describe-configuration-settings-message describe-configuration-settings-messageinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__284154__auto__ {:http.request.configuration/endpoints portkey.aws.elasticbeanstalk.-2010-12-01/endpoints, :http.request.configuration/target-prefix nil, :http.request.spec/output-spec :portkey.aws.elasticbeanstalk.-2010-12-01/configuration-settings-descriptions, :http.request.configuration/mime-type {"content-type" "application/x-www-form-urlencoded; charset=utf-8"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2010-12-01", :http.request.configuration/service-id "Elastic Beanstalk", :http.request.spec/input-spec :portkey.aws.elasticbeanstalk.-2010-12-01/describe-configuration-settings-message, :http.request.configuration/protocol "query", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper "DescribeConfigurationSettingsResult", :http.request.configuration/action "DescribeConfigurationSettings", :http.request.configuration/output-deser-fn response-configuration-settings-descriptions, :http.request.spec/error-spec {"TooManyBucketsException" :portkey.aws.elasticbeanstalk.-2010-12-01/too-many-buckets-exception}})))))
(clojure.spec.alpha/fdef describe-configuration-settings :args (clojure.spec.alpha/tuple :portkey.aws.elasticbeanstalk.-2010-12-01/describe-configuration-settings-message) :ret (clojure.spec.alpha/and :portkey.aws.elasticbeanstalk.-2010-12-01/configuration-settings-descriptions))

(clojure.core/defn delete-application-version ([delete-application-version-messageinput] (clojure.core/let [request-function-result__284154__auto__ (req-delete-application-version-message delete-application-version-messageinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__284154__auto__ {:http.request.configuration/endpoints portkey.aws.elasticbeanstalk.-2010-12-01/endpoints, :http.request.configuration/target-prefix nil, :http.request.spec/output-spec nil, :http.request.configuration/mime-type {"content-type" "application/x-www-form-urlencoded; charset=utf-8"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2010-12-01", :http.request.configuration/service-id "Elastic Beanstalk", :http.request.spec/input-spec :portkey.aws.elasticbeanstalk.-2010-12-01/delete-application-version-message, :http.request.configuration/protocol "query", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "DeleteApplicationVersion", :http.request.configuration/output-deser-fn (clojure.core/fn [& args__284153__auto__] {}), :http.request.spec/error-spec {"SourceBundleDeletionException" :portkey.aws.elasticbeanstalk.-2010-12-01/source-bundle-deletion-exception, "InsufficientPrivilegesException" :portkey.aws.elasticbeanstalk.-2010-12-01/insufficient-privileges-exception, "OperationInProgressException" :portkey.aws.elasticbeanstalk.-2010-12-01/operation-in-progress-exception, "S3LocationNotInServiceRegionException" :portkey.aws.elasticbeanstalk.-2010-12-01/s-3-location-not-in-service-region-exception}})))))
(clojure.spec.alpha/fdef delete-application-version :args (clojure.spec.alpha/tuple :portkey.aws.elasticbeanstalk.-2010-12-01/delete-application-version-message) :ret clojure.core/true?)

(clojure.core/defn delete-configuration-template ([delete-configuration-template-messageinput] (clojure.core/let [request-function-result__284154__auto__ (req-delete-configuration-template-message delete-configuration-template-messageinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__284154__auto__ {:http.request.configuration/endpoints portkey.aws.elasticbeanstalk.-2010-12-01/endpoints, :http.request.configuration/target-prefix nil, :http.request.spec/output-spec nil, :http.request.configuration/mime-type {"content-type" "application/x-www-form-urlencoded; charset=utf-8"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2010-12-01", :http.request.configuration/service-id "Elastic Beanstalk", :http.request.spec/input-spec :portkey.aws.elasticbeanstalk.-2010-12-01/delete-configuration-template-message, :http.request.configuration/protocol "query", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "DeleteConfigurationTemplate", :http.request.configuration/output-deser-fn (clojure.core/fn [& args__284153__auto__] {}), :http.request.spec/error-spec {"OperationInProgressException" :portkey.aws.elasticbeanstalk.-2010-12-01/operation-in-progress-exception}})))))
(clojure.spec.alpha/fdef delete-configuration-template :args (clojure.spec.alpha/tuple :portkey.aws.elasticbeanstalk.-2010-12-01/delete-configuration-template-message) :ret clojure.core/true?)

(clojure.core/defn abort-environment-update ([] (abort-environment-update {})) ([abort-environment-update-messageinput] (clojure.core/let [request-function-result__284154__auto__ (req-abort-environment-update-message abort-environment-update-messageinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__284154__auto__ {:http.request.configuration/endpoints portkey.aws.elasticbeanstalk.-2010-12-01/endpoints, :http.request.configuration/target-prefix nil, :http.request.spec/output-spec nil, :http.request.configuration/mime-type {"content-type" "application/x-www-form-urlencoded; charset=utf-8"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2010-12-01", :http.request.configuration/service-id "Elastic Beanstalk", :http.request.spec/input-spec :portkey.aws.elasticbeanstalk.-2010-12-01/abort-environment-update-message, :http.request.configuration/protocol "query", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "AbortEnvironmentUpdate", :http.request.configuration/output-deser-fn (clojure.core/fn [& args__284153__auto__] {}), :http.request.spec/error-spec {"InsufficientPrivilegesException" :portkey.aws.elasticbeanstalk.-2010-12-01/insufficient-privileges-exception}})))))
(clojure.spec.alpha/fdef abort-environment-update :args (clojure.spec.alpha/? :portkey.aws.elasticbeanstalk.-2010-12-01/abort-environment-update-message) :ret clojure.core/true?)

(clojure.core/defn delete-platform-version ([] (delete-platform-version {})) ([delete-platform-version-requestinput] (clojure.core/let [request-function-result__284154__auto__ (req-delete-platform-version-request delete-platform-version-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__284154__auto__ {:http.request.configuration/endpoints portkey.aws.elasticbeanstalk.-2010-12-01/endpoints, :http.request.configuration/target-prefix nil, :http.request.spec/output-spec :portkey.aws.elasticbeanstalk.-2010-12-01/delete-platform-version-result, :http.request.configuration/mime-type {"content-type" "application/x-www-form-urlencoded; charset=utf-8"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2010-12-01", :http.request.configuration/service-id "Elastic Beanstalk", :http.request.spec/input-spec :portkey.aws.elasticbeanstalk.-2010-12-01/delete-platform-version-request, :http.request.configuration/protocol "query", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper "DeletePlatformVersionResult", :http.request.configuration/action "DeletePlatformVersion", :http.request.configuration/output-deser-fn response-delete-platform-version-result, :http.request.spec/error-spec {"OperationInProgressException" :portkey.aws.elasticbeanstalk.-2010-12-01/operation-in-progress-exception, "InsufficientPrivilegesException" :portkey.aws.elasticbeanstalk.-2010-12-01/insufficient-privileges-exception, "ElasticBeanstalkServiceException" :portkey.aws.elasticbeanstalk.-2010-12-01/elastic-beanstalk-service-exception, "PlatformVersionStillReferencedException" :portkey.aws.elasticbeanstalk.-2010-12-01/platform-version-still-referenced-exception}})))))
(clojure.spec.alpha/fdef delete-platform-version :args (clojure.spec.alpha/? :portkey.aws.elasticbeanstalk.-2010-12-01/delete-platform-version-request) :ret (clojure.spec.alpha/and :portkey.aws.elasticbeanstalk.-2010-12-01/delete-platform-version-result))

(clojure.core/defn update-configuration-template ([update-configuration-template-messageinput] (clojure.core/let [request-function-result__284154__auto__ (req-update-configuration-template-message update-configuration-template-messageinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__284154__auto__ {:http.request.configuration/endpoints portkey.aws.elasticbeanstalk.-2010-12-01/endpoints, :http.request.configuration/target-prefix nil, :http.request.spec/output-spec :portkey.aws.elasticbeanstalk.-2010-12-01/configuration-settings-description, :http.request.configuration/mime-type {"content-type" "application/x-www-form-urlencoded; charset=utf-8"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2010-12-01", :http.request.configuration/service-id "Elastic Beanstalk", :http.request.spec/input-spec :portkey.aws.elasticbeanstalk.-2010-12-01/update-configuration-template-message, :http.request.configuration/protocol "query", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper "UpdateConfigurationTemplateResult", :http.request.configuration/action "UpdateConfigurationTemplate", :http.request.configuration/output-deser-fn response-configuration-settings-description, :http.request.spec/error-spec {"InsufficientPrivilegesException" :portkey.aws.elasticbeanstalk.-2010-12-01/insufficient-privileges-exception, "TooManyBucketsException" :portkey.aws.elasticbeanstalk.-2010-12-01/too-many-buckets-exception}})))))
(clojure.spec.alpha/fdef update-configuration-template :args (clojure.spec.alpha/tuple :portkey.aws.elasticbeanstalk.-2010-12-01/update-configuration-template-message) :ret (clojure.spec.alpha/and :portkey.aws.elasticbeanstalk.-2010-12-01/configuration-settings-description))

(clojure.core/defn rebuild-environment ([] (rebuild-environment {})) ([rebuild-environment-messageinput] (clojure.core/let [request-function-result__284154__auto__ (req-rebuild-environment-message rebuild-environment-messageinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__284154__auto__ {:http.request.configuration/endpoints portkey.aws.elasticbeanstalk.-2010-12-01/endpoints, :http.request.configuration/target-prefix nil, :http.request.spec/output-spec nil, :http.request.configuration/mime-type {"content-type" "application/x-www-form-urlencoded; charset=utf-8"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2010-12-01", :http.request.configuration/service-id "Elastic Beanstalk", :http.request.spec/input-spec :portkey.aws.elasticbeanstalk.-2010-12-01/rebuild-environment-message, :http.request.configuration/protocol "query", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "RebuildEnvironment", :http.request.configuration/output-deser-fn (clojure.core/fn [& args__284153__auto__] {}), :http.request.spec/error-spec {"InsufficientPrivilegesException" :portkey.aws.elasticbeanstalk.-2010-12-01/insufficient-privileges-exception}})))))
(clojure.spec.alpha/fdef rebuild-environment :args (clojure.spec.alpha/? :portkey.aws.elasticbeanstalk.-2010-12-01/rebuild-environment-message) :ret clojure.core/true?)

(clojure.core/defn update-application-version ([update-application-version-messageinput] (clojure.core/let [request-function-result__284154__auto__ (req-update-application-version-message update-application-version-messageinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__284154__auto__ {:http.request.configuration/endpoints portkey.aws.elasticbeanstalk.-2010-12-01/endpoints, :http.request.configuration/target-prefix nil, :http.request.spec/output-spec :portkey.aws.elasticbeanstalk.-2010-12-01/application-version-description-message, :http.request.configuration/mime-type {"content-type" "application/x-www-form-urlencoded; charset=utf-8"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2010-12-01", :http.request.configuration/service-id "Elastic Beanstalk", :http.request.spec/input-spec :portkey.aws.elasticbeanstalk.-2010-12-01/update-application-version-message, :http.request.configuration/protocol "query", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper "UpdateApplicationVersionResult", :http.request.configuration/action "UpdateApplicationVersion", :http.request.configuration/output-deser-fn response-application-version-description-message, :http.request.spec/error-spec {}})))))
(clojure.spec.alpha/fdef update-application-version :args (clojure.spec.alpha/tuple :portkey.aws.elasticbeanstalk.-2010-12-01/update-application-version-message) :ret (clojure.spec.alpha/and :portkey.aws.elasticbeanstalk.-2010-12-01/application-version-description-message))

(clojure.core/defn describe-application-versions ([] (describe-application-versions {})) ([describe-application-versions-messageinput] (clojure.core/let [request-function-result__284154__auto__ (req-describe-application-versions-message describe-application-versions-messageinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__284154__auto__ {:http.request.configuration/endpoints portkey.aws.elasticbeanstalk.-2010-12-01/endpoints, :http.request.configuration/target-prefix nil, :http.request.spec/output-spec :portkey.aws.elasticbeanstalk.-2010-12-01/application-version-descriptions-message, :http.request.configuration/mime-type {"content-type" "application/x-www-form-urlencoded; charset=utf-8"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2010-12-01", :http.request.configuration/service-id "Elastic Beanstalk", :http.request.spec/input-spec :portkey.aws.elasticbeanstalk.-2010-12-01/describe-application-versions-message, :http.request.configuration/protocol "query", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper "DescribeApplicationVersionsResult", :http.request.configuration/action "DescribeApplicationVersions", :http.request.configuration/output-deser-fn response-application-version-descriptions-message, :http.request.spec/error-spec {}})))))
(clojure.spec.alpha/fdef describe-application-versions :args (clojure.spec.alpha/? :portkey.aws.elasticbeanstalk.-2010-12-01/describe-application-versions-message) :ret (clojure.spec.alpha/and :portkey.aws.elasticbeanstalk.-2010-12-01/application-version-descriptions-message))

(clojure.core/defn swap-environment-cnam-es ([] (swap-environment-cnam-es {})) ([swap-environment-cnam-es-messageinput] (clojure.core/let [request-function-result__284154__auto__ (req-swap-environment-cnam-es-message swap-environment-cnam-es-messageinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__284154__auto__ {:http.request.configuration/endpoints portkey.aws.elasticbeanstalk.-2010-12-01/endpoints, :http.request.configuration/target-prefix nil, :http.request.spec/output-spec nil, :http.request.configuration/mime-type {"content-type" "application/x-www-form-urlencoded; charset=utf-8"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2010-12-01", :http.request.configuration/service-id "Elastic Beanstalk", :http.request.spec/input-spec :portkey.aws.elasticbeanstalk.-2010-12-01/swap-environment-cnam-es-message, :http.request.configuration/protocol "query", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "SwapEnvironmentCNAMEs", :http.request.configuration/output-deser-fn (clojure.core/fn [& args__284153__auto__] {}), :http.request.spec/error-spec {}})))))
(clojure.spec.alpha/fdef swap-environment-cnam-es :args (clojure.spec.alpha/? :portkey.aws.elasticbeanstalk.-2010-12-01/swap-environment-cnam-es-message) :ret clojure.core/true?)

(clojure.core/defn list-available-solution-stacks ([] (list-available-solution-stacks {})) ([_] (clojure.core/let [request-function-result__284154__auto__ {}] (portkey.aws/-call-http (clojure.core/into request-function-result__284154__auto__ {:http.request.configuration/endpoints portkey.aws.elasticbeanstalk.-2010-12-01/endpoints, :http.request.configuration/target-prefix nil, :http.request.spec/output-spec :portkey.aws.elasticbeanstalk.-2010-12-01/list-available-solution-stacks-result-message, :http.request.configuration/mime-type {"content-type" "application/x-www-form-urlencoded; charset=utf-8"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2010-12-01", :http.request.configuration/service-id "Elastic Beanstalk", :http.request.spec/input-spec nil, :http.request.configuration/protocol "query", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper "ListAvailableSolutionStacksResult", :http.request.configuration/action "ListAvailableSolutionStacks", :http.request.configuration/output-deser-fn response-list-available-solution-stacks-result-message, :http.request.spec/error-spec {}})))))
(clojure.spec.alpha/fdef list-available-solution-stacks :args clojure.core/empty? :ret (clojure.spec.alpha/and :portkey.aws.elasticbeanstalk.-2010-12-01/list-available-solution-stacks-result-message))

(clojure.core/defn create-configuration-template ([create-configuration-template-messageinput] (clojure.core/let [request-function-result__284154__auto__ (req-create-configuration-template-message create-configuration-template-messageinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__284154__auto__ {:http.request.configuration/endpoints portkey.aws.elasticbeanstalk.-2010-12-01/endpoints, :http.request.configuration/target-prefix nil, :http.request.spec/output-spec :portkey.aws.elasticbeanstalk.-2010-12-01/configuration-settings-description, :http.request.configuration/mime-type {"content-type" "application/x-www-form-urlencoded; charset=utf-8"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2010-12-01", :http.request.configuration/service-id "Elastic Beanstalk", :http.request.spec/input-spec :portkey.aws.elasticbeanstalk.-2010-12-01/create-configuration-template-message, :http.request.configuration/protocol "query", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper "CreateConfigurationTemplateResult", :http.request.configuration/action "CreateConfigurationTemplate", :http.request.configuration/output-deser-fn response-configuration-settings-description, :http.request.spec/error-spec {"InsufficientPrivilegesException" :portkey.aws.elasticbeanstalk.-2010-12-01/insufficient-privileges-exception, "TooManyBucketsException" :portkey.aws.elasticbeanstalk.-2010-12-01/too-many-buckets-exception, "TooManyConfigurationTemplatesException" :portkey.aws.elasticbeanstalk.-2010-12-01/too-many-configuration-templates-exception}})))))
(clojure.spec.alpha/fdef create-configuration-template :args (clojure.spec.alpha/tuple :portkey.aws.elasticbeanstalk.-2010-12-01/create-configuration-template-message) :ret (clojure.spec.alpha/and :portkey.aws.elasticbeanstalk.-2010-12-01/configuration-settings-description))

(clojure.core/defn describe-environment-managed-action-history ([] (describe-environment-managed-action-history {})) ([describe-environment-managed-action-history-requestinput] (clojure.core/let [request-function-result__284154__auto__ (req-describe-environment-managed-action-history-request describe-environment-managed-action-history-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__284154__auto__ {:http.request.configuration/endpoints portkey.aws.elasticbeanstalk.-2010-12-01/endpoints, :http.request.configuration/target-prefix nil, :http.request.spec/output-spec :portkey.aws.elasticbeanstalk.-2010-12-01/describe-environment-managed-action-history-result, :http.request.configuration/mime-type {"content-type" "application/x-www-form-urlencoded; charset=utf-8"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2010-12-01", :http.request.configuration/service-id "Elastic Beanstalk", :http.request.spec/input-spec :portkey.aws.elasticbeanstalk.-2010-12-01/describe-environment-managed-action-history-request, :http.request.configuration/protocol "query", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper "DescribeEnvironmentManagedActionHistoryResult", :http.request.configuration/action "DescribeEnvironmentManagedActionHistory", :http.request.configuration/output-deser-fn response-describe-environment-managed-action-history-result, :http.request.spec/error-spec {"ElasticBeanstalkServiceException" :portkey.aws.elasticbeanstalk.-2010-12-01/elastic-beanstalk-service-exception}})))))
(clojure.spec.alpha/fdef describe-environment-managed-action-history :args (clojure.spec.alpha/? :portkey.aws.elasticbeanstalk.-2010-12-01/describe-environment-managed-action-history-request) :ret (clojure.spec.alpha/and :portkey.aws.elasticbeanstalk.-2010-12-01/describe-environment-managed-action-history-result))
