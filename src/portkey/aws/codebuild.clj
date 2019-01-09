(ns portkey.aws.codebuild (:require [portkey.aws]))

(def
 endpoints
 '{"us-west-1-fips"
   {:credential-scope {:service "codebuild", :region "us-west-1"},
    :ssl-common-name "codebuild-fips.us-west-1.amazonaws.com",
    :endpoint "https://codebuild-fips.us-west-1.amazonaws.com",
    :signature-version :v4},
   "ap-northeast-1"
   {:credential-scope {:service "codebuild", :region "ap-northeast-1"},
    :ssl-common-name "codebuild.ap-northeast-1.amazonaws.com",
    :endpoint "https://codebuild.ap-northeast-1.amazonaws.com",
    :signature-version :v4},
   "eu-west-1"
   {:credential-scope {:service "codebuild", :region "eu-west-1"},
    :ssl-common-name "codebuild.eu-west-1.amazonaws.com",
    :endpoint "https://codebuild.eu-west-1.amazonaws.com",
    :signature-version :v4},
   "us-east-2"
   {:credential-scope {:service "codebuild", :region "us-east-2"},
    :ssl-common-name "codebuild.us-east-2.amazonaws.com",
    :endpoint "https://codebuild.us-east-2.amazonaws.com",
    :signature-version :v4},
   "ap-southeast-2"
   {:credential-scope {:service "codebuild", :region "ap-southeast-2"},
    :ssl-common-name "codebuild.ap-southeast-2.amazonaws.com",
    :endpoint "https://codebuild.ap-southeast-2.amazonaws.com",
    :signature-version :v4},
   "cn-north-1"
   {:credential-scope {:service "codebuild", :region "cn-north-1"},
    :ssl-common-name "codebuild.cn-north-1.amazonaws.com.cn",
    :endpoint "https://codebuild.cn-north-1.amazonaws.com.cn",
    :signature-version :v4},
   "sa-east-1"
   {:credential-scope {:service "codebuild", :region "sa-east-1"},
    :ssl-common-name "codebuild.sa-east-1.amazonaws.com",
    :endpoint "https://codebuild.sa-east-1.amazonaws.com",
    :signature-version :v4},
   "ap-southeast-1"
   {:credential-scope {:service "codebuild", :region "ap-southeast-1"},
    :ssl-common-name "codebuild.ap-southeast-1.amazonaws.com",
    :endpoint "https://codebuild.ap-southeast-1.amazonaws.com",
    :signature-version :v4},
   "cn-northwest-1"
   {:credential-scope {:service "codebuild", :region "cn-northwest-1"},
    :ssl-common-name "codebuild.cn-northwest-1.amazonaws.com.cn",
    :endpoint "https://codebuild.cn-northwest-1.amazonaws.com.cn",
    :signature-version :v4},
   "ap-northeast-2"
   {:credential-scope {:service "codebuild", :region "ap-northeast-2"},
    :ssl-common-name "codebuild.ap-northeast-2.amazonaws.com",
    :endpoint "https://codebuild.ap-northeast-2.amazonaws.com",
    :signature-version :v4},
   "eu-west-3"
   {:credential-scope {:service "codebuild", :region "eu-west-3"},
    :ssl-common-name "codebuild.eu-west-3.amazonaws.com",
    :endpoint "https://codebuild.eu-west-3.amazonaws.com",
    :signature-version :v4},
   "us-east-2-fips"
   {:credential-scope {:service "codebuild", :region "us-east-2"},
    :ssl-common-name "codebuild-fips.us-east-2.amazonaws.com",
    :endpoint "https://codebuild-fips.us-east-2.amazonaws.com",
    :signature-version :v4},
   "ca-central-1"
   {:credential-scope {:service "codebuild", :region "ca-central-1"},
    :ssl-common-name "codebuild.ca-central-1.amazonaws.com",
    :endpoint "https://codebuild.ca-central-1.amazonaws.com",
    :signature-version :v4},
   "eu-central-1"
   {:credential-scope {:service "codebuild", :region "eu-central-1"},
    :ssl-common-name "codebuild.eu-central-1.amazonaws.com",
    :endpoint "https://codebuild.eu-central-1.amazonaws.com",
    :signature-version :v4},
   "eu-west-2"
   {:credential-scope {:service "codebuild", :region "eu-west-2"},
    :ssl-common-name "codebuild.eu-west-2.amazonaws.com",
    :endpoint "https://codebuild.eu-west-2.amazonaws.com",
    :signature-version :v4},
   "us-east-1-fips"
   {:credential-scope {:service "codebuild", :region "us-east-1"},
    :ssl-common-name "codebuild-fips.us-east-1.amazonaws.com",
    :endpoint "https://codebuild-fips.us-east-1.amazonaws.com",
    :signature-version :v4},
   "us-west-2"
   {:credential-scope {:service "codebuild", :region "us-west-2"},
    :ssl-common-name "codebuild.us-west-2.amazonaws.com",
    :endpoint "https://codebuild.us-west-2.amazonaws.com",
    :signature-version :v4},
   "us-west-2-fips"
   {:credential-scope {:service "codebuild", :region "us-west-2"},
    :ssl-common-name "codebuild-fips.us-west-2.amazonaws.com",
    :endpoint "https://codebuild-fips.us-west-2.amazonaws.com",
    :signature-version :v4},
   "us-east-1"
   {:credential-scope {:service "codebuild", :region "us-east-1"},
    :ssl-common-name "codebuild.us-east-1.amazonaws.com",
    :endpoint "https://codebuild.us-east-1.amazonaws.com",
    :signature-version :v4},
   "us-west-1"
   {:credential-scope {:service "codebuild", :region "us-west-1"},
    :ssl-common-name "codebuild.us-west-1.amazonaws.com",
    :endpoint "https://codebuild.us-west-1.amazonaws.com",
    :signature-version :v4},
   "ap-south-1"
   {:credential-scope {:service "codebuild", :region "ap-south-1"},
    :ssl-common-name "codebuild.ap-south-1.amazonaws.com",
    :endpoint "https://codebuild.ap-south-1.amazonaws.com",
    :signature-version :v4}})

(clojure.core/declare ser-artifact-namespace)

(clojure.core/declare ser-non-empty-string)

(clojure.core/declare ser-environment-type)

(clojure.core/declare ser-value-input)

(clojure.core/declare ser-security-group-ids)

(clojure.core/declare ser-artifact-packaging)

(clojure.core/declare ser-subnets)

(clojure.core/declare ser-environment-variables)

(clojure.core/declare ser-cloud-watch-logs-config)

(clojure.core/declare ser-project-source)

(clojure.core/declare ser-source-type)

(clojure.core/declare ser-time-out)

(clojure.core/declare ser-sort-order-type)

(clojure.core/declare ser-project-environment)

(clojure.core/declare ser-project-sources)

(clojure.core/declare ser-tag-list)

(clojure.core/declare ser-s-3-logs-config)

(clojure.core/declare ser-logs-config-status-type)

(clojure.core/declare ser-project-names)

(clojure.core/declare ser-environment-variable)

(clojure.core/declare ser-key-input)

(clojure.core/declare ser-string)

(clojure.core/declare ser-source-auth)

(clojure.core/declare ser-project-description)

(clojure.core/declare ser-project-cache)

(clojure.core/declare ser-project-sort-by-type)

(clojure.core/declare ser-cache-type)

(clojure.core/declare ser-environment-variable-type)

(clojure.core/declare ser-vpc-config)

(clojure.core/declare ser-project-source-version)

(clojure.core/declare ser-source-auth-type)

(clojure.core/declare ser-wrapper-boolean)

(clojure.core/declare ser-tag)

(clojure.core/declare ser-compute-type)

(clojure.core/declare ser-project-name)

(clojure.core/declare ser-git-clone-depth)

(clojure.core/declare ser-build-ids)

(clojure.core/declare ser-project-artifacts-list)

(clojure.core/declare ser-project-secondary-source-versions)

(clojure.core/declare ser-logs-config)

(clojure.core/declare ser-artifacts-type)

(clojure.core/declare ser-project-artifacts)

(clojure.core/declare ser-boolean)

(clojure.core/defn- ser-artifact-namespace [input] #:http.request.field{:value (clojure.core/get {"NONE" "NONE", :none "NONE", "BUILD_ID" "BUILD_ID", :build-id "BUILD_ID"} input), :shape "ArtifactNamespace"})

(clojure.core/defn- ser-non-empty-string [input] #:http.request.field{:value input, :shape "NonEmptyString"})

(clojure.core/defn- ser-environment-type [input] #:http.request.field{:value (clojure.core/get {"WINDOWS_CONTAINER" "WINDOWS_CONTAINER", :windows-container "WINDOWS_CONTAINER", "LINUX_CONTAINER" "LINUX_CONTAINER", :linux-container "LINUX_CONTAINER"} input), :shape "EnvironmentType"})

(clojure.core/defn- ser-value-input [input] #:http.request.field{:value input, :shape "ValueInput"})

(clojure.core/defn- ser-security-group-ids [input] #:http.request.field{:value (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (clojure.core/merge (ser-non-empty-string coll) #:http.request.field{:shape "NonEmptyString"}))) input), :shape "SecurityGroupIds", :type "list", :max 5})

(clojure.core/defn- ser-artifact-packaging [input] #:http.request.field{:value (clojure.core/get {"NONE" "NONE", :none "NONE", "ZIP" "ZIP", :zip "ZIP"} input), :shape "ArtifactPackaging"})

(clojure.core/defn- ser-subnets [input] #:http.request.field{:value (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (clojure.core/merge (ser-non-empty-string coll) #:http.request.field{:shape "NonEmptyString"}))) input), :shape "Subnets", :type "list", :max 16})

(clojure.core/defn- ser-environment-variables [input] #:http.request.field{:value (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (clojure.core/merge (ser-environment-variable coll) #:http.request.field{:shape "EnvironmentVariable"}))) input), :shape "EnvironmentVariables", :type "list"})

(clojure.core/defn- ser-cloud-watch-logs-config [input] (clojure.core/cond-> #:http.request.field{:value [(clojure.core/into (ser-logs-config-status-type (:status input)) #:http.request.field{:name "status", :shape "LogsConfigStatusType"})], :shape "CloudWatchLogsConfig", :type "structure"} (clojure.core/contains? input :group-name) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-string (input :group-name)) #:http.request.field{:name "groupName", :shape "String"})) (clojure.core/contains? input :stream-name) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-string (input :stream-name)) #:http.request.field{:name "streamName", :shape "String"}))))

(clojure.core/defn- ser-project-source [input] (clojure.core/cond-> #:http.request.field{:value [(clojure.core/into (ser-source-type (:type input)) #:http.request.field{:name "type", :shape "SourceType"})], :shape "ProjectSource", :type "structure"} (clojure.core/contains? input :location) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-string (input :location)) #:http.request.field{:name "location", :shape "String"})) (clojure.core/contains? input :git-clone-depth) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-git-clone-depth (input :git-clone-depth)) #:http.request.field{:name "gitCloneDepth", :shape "GitCloneDepth"})) (clojure.core/contains? input :buildspec) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-string (input :buildspec)) #:http.request.field{:name "buildspec", :shape "String"})) (clojure.core/contains? input :auth) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-source-auth (input :auth)) #:http.request.field{:name "auth", :shape "SourceAuth"})) (clojure.core/contains? input :report-build-status) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-wrapper-boolean (input :report-build-status)) #:http.request.field{:name "reportBuildStatus", :shape "WrapperBoolean"})) (clojure.core/contains? input :insecure-ssl) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-wrapper-boolean (input :insecure-ssl)) #:http.request.field{:name "insecureSsl", :shape "WrapperBoolean"})) (clojure.core/contains? input :source-identifier) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-string (input :source-identifier)) #:http.request.field{:name "sourceIdentifier", :shape "String"}))))

(clojure.core/defn- ser-source-type [input] #:http.request.field{:value (clojure.core/get {:s-3 "S3", "CODEPIPELINE" "CODEPIPELINE", :github "GITHUB", :codepipeline "CODEPIPELINE", :bitbucket "BITBUCKET", :codecommit "CODECOMMIT", :no-source "NO_SOURCE", "GITHUB_ENTERPRISE" "GITHUB_ENTERPRISE", "BITBUCKET" "BITBUCKET", "CODECOMMIT" "CODECOMMIT", "GITHUB" "GITHUB", "S3" "S3", "NO_SOURCE" "NO_SOURCE", :github-enterprise "GITHUB_ENTERPRISE"} input), :shape "SourceType"})

(clojure.core/defn- ser-time-out [input] #:http.request.field{:value input, :shape "TimeOut"})

(clojure.core/defn- ser-sort-order-type [input] #:http.request.field{:value (clojure.core/get {"ASCENDING" "ASCENDING", :ascending "ASCENDING", "DESCENDING" "DESCENDING", :descending "DESCENDING"} input), :shape "SortOrderType"})

(clojure.core/defn- ser-project-environment [input] (clojure.core/cond-> #:http.request.field{:value [(clojure.core/into (ser-environment-type (:type input)) #:http.request.field{:name "type", :shape "EnvironmentType"}) (clojure.core/into (ser-non-empty-string (:image input)) #:http.request.field{:name "image", :shape "NonEmptyString"}) (clojure.core/into (ser-compute-type (:compute-type input)) #:http.request.field{:name "computeType", :shape "ComputeType"})], :shape "ProjectEnvironment", :type "structure"} (clojure.core/contains? input :environment-variables) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-environment-variables (input :environment-variables)) #:http.request.field{:name "environmentVariables", :shape "EnvironmentVariables"})) (clojure.core/contains? input :privileged-mode) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-wrapper-boolean (input :privileged-mode)) #:http.request.field{:name "privilegedMode", :shape "WrapperBoolean"})) (clojure.core/contains? input :certificate) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-string (input :certificate)) #:http.request.field{:name "certificate", :shape "String"}))))

(clojure.core/defn- ser-project-sources [input] #:http.request.field{:value (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (clojure.core/merge (ser-project-source coll) #:http.request.field{:shape "ProjectSource"}))) input), :shape "ProjectSources", :type "list", :max 12, :min 0})

(clojure.core/defn- ser-tag-list [input] #:http.request.field{:value (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (clojure.core/merge (ser-tag coll) #:http.request.field{:shape "Tag"}))) input), :shape "TagList", :type "list", :max 50, :min 0})

(clojure.core/defn- ser-s-3-logs-config [input] (clojure.core/cond-> #:http.request.field{:value [(clojure.core/into (ser-logs-config-status-type (:status input)) #:http.request.field{:name "status", :shape "LogsConfigStatusType"})], :shape "S3LogsConfig", :type "structure"} (clojure.core/contains? input :location) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-string (input :location)) #:http.request.field{:name "location", :shape "String"}))))

(clojure.core/defn- ser-logs-config-status-type [input] #:http.request.field{:value (clojure.core/get {"ENABLED" "ENABLED", :enabled "ENABLED", "DISABLED" "DISABLED", :disabled "DISABLED"} input), :shape "LogsConfigStatusType"})

(clojure.core/defn- ser-project-names [input] #:http.request.field{:value (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (clojure.core/merge (ser-non-empty-string coll) #:http.request.field{:shape "NonEmptyString"}))) input), :shape "ProjectNames", :type "list", :max 100, :min 1})

(clojure.core/defn- ser-environment-variable [input] (clojure.core/cond-> #:http.request.field{:value [(clojure.core/into (ser-non-empty-string (:name input)) #:http.request.field{:name "name", :shape "NonEmptyString"}) (clojure.core/into (ser-string (:value input)) #:http.request.field{:name "value", :shape "String"})], :shape "EnvironmentVariable", :type "structure"} (clojure.core/contains? input :type) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-environment-variable-type (input :type)) #:http.request.field{:name "type", :shape "EnvironmentVariableType"}))))

(clojure.core/defn- ser-key-input [input] #:http.request.field{:value input, :shape "KeyInput"})

(clojure.core/defn- ser-string [input] #:http.request.field{:value input, :shape "String"})

(clojure.core/defn- ser-source-auth [input] (clojure.core/cond-> #:http.request.field{:value [(clojure.core/into (ser-source-auth-type (:type input)) #:http.request.field{:name "type", :shape "SourceAuthType"})], :shape "SourceAuth", :type "structure"} (clojure.core/contains? input :resource) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-string (input :resource)) #:http.request.field{:name "resource", :shape "String"}))))

(clojure.core/defn- ser-project-description [input] #:http.request.field{:value input, :shape "ProjectDescription"})

(clojure.core/defn- ser-project-cache [input] (clojure.core/cond-> #:http.request.field{:value [(clojure.core/into (ser-cache-type (:type input)) #:http.request.field{:name "type", :shape "CacheType"})], :shape "ProjectCache", :type "structure"} (clojure.core/contains? input :location) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-string (input :location)) #:http.request.field{:name "location", :shape "String"}))))

(clojure.core/defn- ser-project-sort-by-type [input] #:http.request.field{:value (clojure.core/get {"NAME" "NAME", :name "NAME", "CREATED_TIME" "CREATED_TIME", :created-time "CREATED_TIME", "LAST_MODIFIED_TIME" "LAST_MODIFIED_TIME", :last-modified-time "LAST_MODIFIED_TIME"} input), :shape "ProjectSortByType"})

(clojure.core/defn- ser-cache-type [input] #:http.request.field{:value (clojure.core/get {"NO_CACHE" "NO_CACHE", :no-cache "NO_CACHE", "S3" "S3", :s-3 "S3"} input), :shape "CacheType"})

(clojure.core/defn- ser-environment-variable-type [input] #:http.request.field{:value (clojure.core/get {"PLAINTEXT" "PLAINTEXT", :plaintext "PLAINTEXT", "PARAMETER_STORE" "PARAMETER_STORE", :parameter-store "PARAMETER_STORE"} input), :shape "EnvironmentVariableType"})

(clojure.core/defn- ser-vpc-config [input] (clojure.core/cond-> #:http.request.field{:value [], :shape "VpcConfig", :type "structure"} (clojure.core/contains? input :vpc-id) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-non-empty-string (input :vpc-id)) #:http.request.field{:name "vpcId", :shape "NonEmptyString"})) (clojure.core/contains? input :subnets) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-subnets (input :subnets)) #:http.request.field{:name "subnets", :shape "Subnets"})) (clojure.core/contains? input :security-group-ids) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-security-group-ids (input :security-group-ids)) #:http.request.field{:name "securityGroupIds", :shape "SecurityGroupIds"}))))

(clojure.core/defn- ser-project-source-version [input] (clojure.core/cond-> #:http.request.field{:value [(clojure.core/into (ser-string (:source-identifier input)) #:http.request.field{:name "sourceIdentifier", :shape "String"}) (clojure.core/into (ser-string (:source-version input)) #:http.request.field{:name "sourceVersion", :shape "String"})], :shape "ProjectSourceVersion", :type "structure"}))

(clojure.core/defn- ser-source-auth-type [input] #:http.request.field{:value (clojure.core/get {"OAUTH" "OAUTH", :oauth "OAUTH"} input), :shape "SourceAuthType"})

(clojure.core/defn- ser-wrapper-boolean [input] #:http.request.field{:value input, :shape "WrapperBoolean"})

(clojure.core/defn- ser-tag [input] (clojure.core/cond-> #:http.request.field{:value [], :shape "Tag", :type "structure"} (clojure.core/contains? input :key) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-key-input (input :key)) #:http.request.field{:name "key", :shape "KeyInput"})) (clojure.core/contains? input :value) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-value-input (input :value)) #:http.request.field{:name "value", :shape "ValueInput"}))))

(clojure.core/defn- ser-compute-type [input] #:http.request.field{:value (clojure.core/get {"BUILD_GENERAL1_SMALL" "BUILD_GENERAL1_SMALL", :build-general-1-small "BUILD_GENERAL1_SMALL", "BUILD_GENERAL1_MEDIUM" "BUILD_GENERAL1_MEDIUM", :build-general-1-medium "BUILD_GENERAL1_MEDIUM", "BUILD_GENERAL1_LARGE" "BUILD_GENERAL1_LARGE", :build-general-1-large "BUILD_GENERAL1_LARGE"} input), :shape "ComputeType"})

(clojure.core/defn- ser-project-name [input] #:http.request.field{:value input, :shape "ProjectName"})

(clojure.core/defn- ser-git-clone-depth [input] #:http.request.field{:value input, :shape "GitCloneDepth"})

(clojure.core/defn- ser-build-ids [input] #:http.request.field{:value (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (clojure.core/merge (ser-non-empty-string coll) #:http.request.field{:shape "NonEmptyString"}))) input), :shape "BuildIds", :type "list", :max 100, :min 1})

(clojure.core/defn- ser-project-artifacts-list [input] #:http.request.field{:value (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (clojure.core/merge (ser-project-artifacts coll) #:http.request.field{:shape "ProjectArtifacts"}))) input), :shape "ProjectArtifactsList", :type "list", :max 12, :min 0})

(clojure.core/defn- ser-project-secondary-source-versions [input] #:http.request.field{:value (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (clojure.core/merge (ser-project-source-version coll) #:http.request.field{:shape "ProjectSourceVersion"}))) input), :shape "ProjectSecondarySourceVersions", :type "list", :max 12, :min 0})

(clojure.core/defn- ser-logs-config [input] (clojure.core/cond-> #:http.request.field{:value [], :shape "LogsConfig", :type "structure"} (clojure.core/contains? input :cloud-watch-logs) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-cloud-watch-logs-config (input :cloud-watch-logs)) #:http.request.field{:name "cloudWatchLogs", :shape "CloudWatchLogsConfig"})) (clojure.core/contains? input :s-3-logs) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-s-3-logs-config (input :s-3-logs)) #:http.request.field{:name "s3Logs", :shape "S3LogsConfig"}))))

(clojure.core/defn- ser-artifacts-type [input] #:http.request.field{:value (clojure.core/get {"CODEPIPELINE" "CODEPIPELINE", :codepipeline "CODEPIPELINE", "S3" "S3", :s-3 "S3", "NO_ARTIFACTS" "NO_ARTIFACTS", :no-artifacts "NO_ARTIFACTS"} input), :shape "ArtifactsType"})

(clojure.core/defn- ser-project-artifacts [input] (clojure.core/cond-> #:http.request.field{:value [(clojure.core/into (ser-artifacts-type (:type input)) #:http.request.field{:name "type", :shape "ArtifactsType"})], :shape "ProjectArtifacts", :type "structure"} (clojure.core/contains? input :override-artifact-name) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-wrapper-boolean (input :override-artifact-name)) #:http.request.field{:name "overrideArtifactName", :shape "WrapperBoolean"})) (clojure.core/contains? input :path) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-string (input :path)) #:http.request.field{:name "path", :shape "String"})) (clojure.core/contains? input :encryption-disabled) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-wrapper-boolean (input :encryption-disabled)) #:http.request.field{:name "encryptionDisabled", :shape "WrapperBoolean"})) (clojure.core/contains? input :packaging) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-artifact-packaging (input :packaging)) #:http.request.field{:name "packaging", :shape "ArtifactPackaging"})) (clojure.core/contains? input :name) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-string (input :name)) #:http.request.field{:name "name", :shape "String"})) (clojure.core/contains? input :location) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-string (input :location)) #:http.request.field{:name "location", :shape "String"})) (clojure.core/contains? input :namespace-type) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-artifact-namespace (input :namespace-type)) #:http.request.field{:name "namespaceType", :shape "ArtifactNamespace"})) (clojure.core/contains? input :artifact-identifier) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-string (input :artifact-identifier)) #:http.request.field{:name "artifactIdentifier", :shape "String"}))))

(clojure.core/defn- ser-boolean [input] #:http.request.field{:value input, :shape "Boolean"})

(clojure.core/defn- req-batch-get-projects-input [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (ser-project-names (input :names)) #:http.request.field{:name "names", :shape "ProjectNames"})]}))

(clojure.core/defn- req-create-webhook-input [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (ser-project-name (input :project-name)) #:http.request.field{:name "projectName", :shape "ProjectName"})]} (clojure.core/contains? input :branch-filter) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-string (input :branch-filter)) #:http.request.field{:name "branchFilter", :shape "String"}))))

(clojure.core/defn- req-delete-project-input [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (ser-non-empty-string (input :name)) #:http.request.field{:name "name", :shape "NonEmptyString"})]}))

(clojure.core/defn- req-invalidate-project-cache-input [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (ser-non-empty-string (input :project-name)) #:http.request.field{:name "projectName", :shape "NonEmptyString"})]}))

(clojure.core/defn- req-list-projects-input [input] (clojure.core/cond-> {} (clojure.core/contains? input :sort-by) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-project-sort-by-type (input :sort-by)) #:http.request.field{:name "sortBy", :shape "ProjectSortByType"})) (clojure.core/contains? input :sort-order) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-sort-order-type (input :sort-order)) #:http.request.field{:name "sortOrder", :shape "SortOrderType"})) (clojure.core/contains? input :next-token) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-non-empty-string (input :next-token)) #:http.request.field{:name "nextToken", :shape "NonEmptyString"}))))

(clojure.core/defn- req-list-curated-environment-images-input [input] (clojure.core/cond-> {}))

(clojure.core/defn- req-update-project-input [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (ser-non-empty-string (input :name)) #:http.request.field{:name "name", :shape "NonEmptyString"})]} (clojure.core/contains? input :vpc-config) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-vpc-config (input :vpc-config)) #:http.request.field{:name "vpcConfig", :shape "VpcConfig"})) (clojure.core/contains? input :service-role) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-non-empty-string (input :service-role)) #:http.request.field{:name "serviceRole", :shape "NonEmptyString"})) (clojure.core/contains? input :badge-enabled) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-wrapper-boolean (input :badge-enabled)) #:http.request.field{:name "badgeEnabled", :shape "WrapperBoolean"})) (clojure.core/contains? input :artifacts) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-project-artifacts (input :artifacts)) #:http.request.field{:name "artifacts", :shape "ProjectArtifacts"})) (clojure.core/contains? input :secondary-sources) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-project-sources (input :secondary-sources)) #:http.request.field{:name "secondarySources", :shape "ProjectSources"})) (clojure.core/contains? input :tags) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-tag-list (input :tags)) #:http.request.field{:name "tags", :shape "TagList"})) (clojure.core/contains? input :cache) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-project-cache (input :cache)) #:http.request.field{:name "cache", :shape "ProjectCache"})) (clojure.core/contains? input :encryption-key) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-non-empty-string (input :encryption-key)) #:http.request.field{:name "encryptionKey", :shape "NonEmptyString"})) (clojure.core/contains? input :source) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-project-source (input :source)) #:http.request.field{:name "source", :shape "ProjectSource"})) (clojure.core/contains? input :environment) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-project-environment (input :environment)) #:http.request.field{:name "environment", :shape "ProjectEnvironment"})) (clojure.core/contains? input :secondary-artifacts) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-project-artifacts-list (input :secondary-artifacts)) #:http.request.field{:name "secondaryArtifacts", :shape "ProjectArtifactsList"})) (clojure.core/contains? input :timeout-in-minutes) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-time-out (input :timeout-in-minutes)) #:http.request.field{:name "timeoutInMinutes", :shape "TimeOut"})) (clojure.core/contains? input :logs-config) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-logs-config (input :logs-config)) #:http.request.field{:name "logsConfig", :shape "LogsConfig"})) (clojure.core/contains? input :description) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-project-description (input :description)) #:http.request.field{:name "description", :shape "ProjectDescription"}))))

(clojure.core/defn- req-batch-delete-builds-input [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (ser-build-ids (input :ids)) #:http.request.field{:name "ids", :shape "BuildIds"})]}))

(clojure.core/defn- req-start-build-input [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (ser-non-empty-string (input :project-name)) #:http.request.field{:name "projectName", :shape "NonEmptyString"})]} (clojure.core/contains? input :report-build-status-override) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-wrapper-boolean (input :report-build-status-override)) #:http.request.field{:name "reportBuildStatusOverride", :shape "WrapperBoolean"})) (clojure.core/contains? input :source-version) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-string (input :source-version)) #:http.request.field{:name "sourceVersion", :shape "String"})) (clojure.core/contains? input :timeout-in-minutes-override) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-time-out (input :timeout-in-minutes-override)) #:http.request.field{:name "timeoutInMinutesOverride", :shape "TimeOut"})) (clojure.core/contains? input :secondary-sources-override) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-project-sources (input :secondary-sources-override)) #:http.request.field{:name "secondarySourcesOverride", :shape "ProjectSources"})) (clojure.core/contains? input :artifacts-override) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-project-artifacts (input :artifacts-override)) #:http.request.field{:name "artifactsOverride", :shape "ProjectArtifacts"})) (clojure.core/contains? input :logs-config-override) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-logs-config (input :logs-config-override)) #:http.request.field{:name "logsConfigOverride", :shape "LogsConfig"})) (clojure.core/contains? input :secondary-artifacts-override) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-project-artifacts-list (input :secondary-artifacts-override)) #:http.request.field{:name "secondaryArtifactsOverride", :shape "ProjectArtifactsList"})) (clojure.core/contains? input :source-auth-override) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-source-auth (input :source-auth-override)) #:http.request.field{:name "sourceAuthOverride", :shape "SourceAuth"})) (clojure.core/contains? input :certificate-override) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-string (input :certificate-override)) #:http.request.field{:name "certificateOverride", :shape "String"})) (clojure.core/contains? input :git-clone-depth-override) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-git-clone-depth (input :git-clone-depth-override)) #:http.request.field{:name "gitCloneDepthOverride", :shape "GitCloneDepth"})) (clojure.core/contains? input :compute-type-override) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-compute-type (input :compute-type-override)) #:http.request.field{:name "computeTypeOverride", :shape "ComputeType"})) (clojure.core/contains? input :buildspec-override) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-string (input :buildspec-override)) #:http.request.field{:name "buildspecOverride", :shape "String"})) (clojure.core/contains? input :idempotency-token) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-string (input :idempotency-token)) #:http.request.field{:name "idempotencyToken", :shape "String"})) (clojure.core/contains? input :privileged-mode-override) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-wrapper-boolean (input :privileged-mode-override)) #:http.request.field{:name "privilegedModeOverride", :shape "WrapperBoolean"})) (clojure.core/contains? input :environment-variables-override) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-environment-variables (input :environment-variables-override)) #:http.request.field{:name "environmentVariablesOverride", :shape "EnvironmentVariables"})) (clojure.core/contains? input :cache-override) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-project-cache (input :cache-override)) #:http.request.field{:name "cacheOverride", :shape "ProjectCache"})) (clojure.core/contains? input :image-override) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-non-empty-string (input :image-override)) #:http.request.field{:name "imageOverride", :shape "NonEmptyString"})) (clojure.core/contains? input :environment-type-override) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-environment-type (input :environment-type-override)) #:http.request.field{:name "environmentTypeOverride", :shape "EnvironmentType"})) (clojure.core/contains? input :service-role-override) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-non-empty-string (input :service-role-override)) #:http.request.field{:name "serviceRoleOverride", :shape "NonEmptyString"})) (clojure.core/contains? input :source-location-override) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-string (input :source-location-override)) #:http.request.field{:name "sourceLocationOverride", :shape "String"})) (clojure.core/contains? input :source-type-override) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-source-type (input :source-type-override)) #:http.request.field{:name "sourceTypeOverride", :shape "SourceType"})) (clojure.core/contains? input :insecure-ssl-override) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-wrapper-boolean (input :insecure-ssl-override)) #:http.request.field{:name "insecureSslOverride", :shape "WrapperBoolean"})) (clojure.core/contains? input :secondary-sources-version-override) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-project-secondary-source-versions (input :secondary-sources-version-override)) #:http.request.field{:name "secondarySourcesVersionOverride", :shape "ProjectSecondarySourceVersions"}))))

(clojure.core/defn- req-stop-build-input [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (ser-non-empty-string (input :id)) #:http.request.field{:name "id", :shape "NonEmptyString"})]}))

(clojure.core/defn- req-delete-webhook-input [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (ser-project-name (input :project-name)) #:http.request.field{:name "projectName", :shape "ProjectName"})]}))

(clojure.core/defn- req-create-project-input [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (ser-project-name (input :name)) #:http.request.field{:name "name", :shape "ProjectName"}) (clojure.core/into (ser-project-source (input :source)) #:http.request.field{:name "source", :shape "ProjectSource"}) (clojure.core/into (ser-project-artifacts (input :artifacts)) #:http.request.field{:name "artifacts", :shape "ProjectArtifacts"}) (clojure.core/into (ser-project-environment (input :environment)) #:http.request.field{:name "environment", :shape "ProjectEnvironment"}) (clojure.core/into (ser-non-empty-string (input :service-role)) #:http.request.field{:name "serviceRole", :shape "NonEmptyString"})]} (clojure.core/contains? input :vpc-config) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-vpc-config (input :vpc-config)) #:http.request.field{:name "vpcConfig", :shape "VpcConfig"})) (clojure.core/contains? input :badge-enabled) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-wrapper-boolean (input :badge-enabled)) #:http.request.field{:name "badgeEnabled", :shape "WrapperBoolean"})) (clojure.core/contains? input :secondary-sources) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-project-sources (input :secondary-sources)) #:http.request.field{:name "secondarySources", :shape "ProjectSources"})) (clojure.core/contains? input :tags) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-tag-list (input :tags)) #:http.request.field{:name "tags", :shape "TagList"})) (clojure.core/contains? input :cache) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-project-cache (input :cache)) #:http.request.field{:name "cache", :shape "ProjectCache"})) (clojure.core/contains? input :encryption-key) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-non-empty-string (input :encryption-key)) #:http.request.field{:name "encryptionKey", :shape "NonEmptyString"})) (clojure.core/contains? input :secondary-artifacts) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-project-artifacts-list (input :secondary-artifacts)) #:http.request.field{:name "secondaryArtifacts", :shape "ProjectArtifactsList"})) (clojure.core/contains? input :timeout-in-minutes) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-time-out (input :timeout-in-minutes)) #:http.request.field{:name "timeoutInMinutes", :shape "TimeOut"})) (clojure.core/contains? input :logs-config) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-logs-config (input :logs-config)) #:http.request.field{:name "logsConfig", :shape "LogsConfig"})) (clojure.core/contains? input :description) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-project-description (input :description)) #:http.request.field{:name "description", :shape "ProjectDescription"}))))

(clojure.core/defn- req-update-webhook-input [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (ser-project-name (input :project-name)) #:http.request.field{:name "projectName", :shape "ProjectName"})]} (clojure.core/contains? input :branch-filter) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-string (input :branch-filter)) #:http.request.field{:name "branchFilter", :shape "String"})) (clojure.core/contains? input :rotate-secret) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-boolean (input :rotate-secret)) #:http.request.field{:name "rotateSecret", :shape "Boolean"}))))

(clojure.core/defn- req-list-builds-input [input] (clojure.core/cond-> {} (clojure.core/contains? input :sort-order) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-sort-order-type (input :sort-order)) #:http.request.field{:name "sortOrder", :shape "SortOrderType"})) (clojure.core/contains? input :next-token) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-string (input :next-token)) #:http.request.field{:name "nextToken", :shape "String"}))))

(clojure.core/defn- req-batch-get-builds-input [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (ser-build-ids (input :ids)) #:http.request.field{:name "ids", :shape "BuildIds"})]}))

(clojure.core/defn- req-list-builds-for-project-input [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (ser-non-empty-string (input :project-name)) #:http.request.field{:name "projectName", :shape "NonEmptyString"})]} (clojure.core/contains? input :sort-order) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-sort-order-type (input :sort-order)) #:http.request.field{:name "sortOrder", :shape "SortOrderType"})) (clojure.core/contains? input :next-token) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-string (input :next-token)) #:http.request.field{:name "nextToken", :shape "String"}))))

(clojure.spec.alpha/def :portkey.aws.codebuild.environment-language/language (clojure.spec.alpha/and :portkey.aws.codebuild/language-type))
(clojure.spec.alpha/def :portkey.aws.codebuild.environment-language/images (clojure.spec.alpha/and :portkey.aws.codebuild/environment-images))
(clojure.spec.alpha/def :portkey.aws.codebuild/environment-language (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.codebuild.environment-language/language :portkey.aws.codebuild.environment-language/images]))

(clojure.spec.alpha/def :portkey.aws.codebuild.update-webhook-output/webhook (clojure.spec.alpha/and :portkey.aws.codebuild/webhook))
(clojure.spec.alpha/def :portkey.aws.codebuild/update-webhook-output (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.codebuild.update-webhook-output/webhook]))

(clojure.spec.alpha/def :portkey.aws.codebuild.build-not-deleted/id (clojure.spec.alpha/and :portkey.aws.codebuild/non-empty-string))
(clojure.spec.alpha/def :portkey.aws.codebuild.build-not-deleted/status-code (clojure.spec.alpha/and :portkey.aws.codebuild/string))
(clojure.spec.alpha/def :portkey.aws.codebuild/build-not-deleted (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.codebuild.build-not-deleted/id :portkey.aws.codebuild.build-not-deleted/status-code]))

(clojure.spec.alpha/def :portkey.aws.codebuild.batch-get-projects-input/names (clojure.spec.alpha/and :portkey.aws.codebuild/project-names))
(clojure.spec.alpha/def :portkey.aws.codebuild/batch-get-projects-input (clojure.spec.alpha/keys :req-un [:portkey.aws.codebuild.batch-get-projects-input/names] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.codebuild.environment-image/name (clojure.spec.alpha/and :portkey.aws.codebuild/string))
(clojure.spec.alpha/def :portkey.aws.codebuild.environment-image/description (clojure.spec.alpha/and :portkey.aws.codebuild/string))
(clojure.spec.alpha/def :portkey.aws.codebuild.environment-image/versions (clojure.spec.alpha/and :portkey.aws.codebuild/image-versions))
(clojure.spec.alpha/def :portkey.aws.codebuild/environment-image (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.codebuild.environment-image/name :portkey.aws.codebuild.environment-image/description :portkey.aws.codebuild.environment-image/versions]))

(clojure.spec.alpha/def :portkey.aws.codebuild.project-badge/badge-enabled (clojure.spec.alpha/and :portkey.aws.codebuild/boolean))
(clojure.spec.alpha/def :portkey.aws.codebuild.project-badge/badge-request-url (clojure.spec.alpha/and :portkey.aws.codebuild/string))
(clojure.spec.alpha/def :portkey.aws.codebuild/project-badge (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.codebuild.project-badge/badge-enabled :portkey.aws.codebuild.project-badge/badge-request-url]))

(clojure.spec.alpha/def :portkey.aws.codebuild.start-build-output/build (clojure.spec.alpha/and :portkey.aws.codebuild/build))
(clojure.spec.alpha/def :portkey.aws.codebuild/start-build-output (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.codebuild.start-build-output/build]))

(clojure.spec.alpha/def :portkey.aws.codebuild/build-artifacts-list (clojure.spec.alpha/coll-of :portkey.aws.codebuild/build-artifacts :min-count 0 :max-count 12))

(clojure.spec.alpha/def :portkey.aws.codebuild/artifact-namespace #{"BUILD_ID" "NONE" :build-id :none})

(clojure.spec.alpha/def :portkey.aws.codebuild/non-empty-string (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__27965__auto__] (clojure.core/<= 1 (clojure.core/count s__27965__auto__)))))

(clojure.spec.alpha/def :portkey.aws.codebuild.create-project-output/project (clojure.spec.alpha/and :portkey.aws.codebuild/project))
(clojure.spec.alpha/def :portkey.aws.codebuild/create-project-output (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.codebuild.create-project-output/project]))

(clojure.spec.alpha/def :portkey.aws.codebuild/environment-type #{:linux-container "WINDOWS_CONTAINER" "LINUX_CONTAINER" :windows-container})

(clojure.spec.alpha/def :portkey.aws.codebuild/value-input (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__27965__auto__] (clojure.core/<= 1 (clojure.core/count s__27965__auto__))) (clojure.core/fn [s__27966__auto__] (clojure.core/< (clojure.core/count s__27966__auto__) 255)) (clojure.core/fn [s__27967__auto__] (clojure.core/re-matches #"^([\\p{L}\\p{Z}\\p{N}_.:/=@+\\-]*)$" s__27967__auto__))))

(clojure.spec.alpha/def :portkey.aws.codebuild.create-webhook-input/project-name (clojure.spec.alpha/and :portkey.aws.codebuild/project-name))
(clojure.spec.alpha/def :portkey.aws.codebuild.create-webhook-input/branch-filter (clojure.spec.alpha/and :portkey.aws.codebuild/string))
(clojure.spec.alpha/def :portkey.aws.codebuild/create-webhook-input (clojure.spec.alpha/keys :req-un [:portkey.aws.codebuild.create-webhook-input/project-name] :opt-un [:portkey.aws.codebuild.create-webhook-input/branch-filter]))

(clojure.spec.alpha/def :portkey.aws.codebuild/security-group-ids (clojure.spec.alpha/coll-of :portkey.aws.codebuild/non-empty-string :max-count 5))

(clojure.spec.alpha/def :portkey.aws.codebuild.list-curated-environment-images-output/platforms (clojure.spec.alpha/and :portkey.aws.codebuild/environment-platforms))
(clojure.spec.alpha/def :portkey.aws.codebuild/list-curated-environment-images-output (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.codebuild.list-curated-environment-images-output/platforms]))

(clojure.spec.alpha/def :portkey.aws.codebuild/invalidate-project-cache-output (clojure.spec.alpha/keys :req-un [] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.codebuild/artifact-packaging #{"ZIP" "NONE" :zip :none})

(clojure.spec.alpha/def :portkey.aws.codebuild/subnets (clojure.spec.alpha/coll-of :portkey.aws.codebuild/non-empty-string :max-count 16))

(clojure.spec.alpha/def :portkey.aws.codebuild/build-phases (clojure.spec.alpha/coll-of :portkey.aws.codebuild/build-phase))

(clojure.spec.alpha/def :portkey.aws.codebuild.batch-delete-builds-output/builds-deleted (clojure.spec.alpha/and :portkey.aws.codebuild/build-ids))
(clojure.spec.alpha/def :portkey.aws.codebuild.batch-delete-builds-output/builds-not-deleted (clojure.spec.alpha/and :portkey.aws.codebuild/builds-not-deleted))
(clojure.spec.alpha/def :portkey.aws.codebuild/batch-delete-builds-output (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.codebuild.batch-delete-builds-output/builds-deleted :portkey.aws.codebuild.batch-delete-builds-output/builds-not-deleted]))

(clojure.spec.alpha/def :portkey.aws.codebuild/wrapper-long clojure.core/int?)

(clojure.spec.alpha/def :portkey.aws.codebuild/environment-variables (clojure.spec.alpha/coll-of :portkey.aws.codebuild/environment-variable))

(clojure.spec.alpha/def :portkey.aws.codebuild/account-limit-exceeded-exception (clojure.spec.alpha/keys :req-un [] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.codebuild.logs-location/group-name (clojure.spec.alpha/and :portkey.aws.codebuild/string))
(clojure.spec.alpha/def :portkey.aws.codebuild.logs-location/stream-name (clojure.spec.alpha/and :portkey.aws.codebuild/string))
(clojure.spec.alpha/def :portkey.aws.codebuild.logs-location/deep-link (clojure.spec.alpha/and :portkey.aws.codebuild/string))
(clojure.spec.alpha/def :portkey.aws.codebuild.logs-location/s-3-deep-link (clojure.spec.alpha/and :portkey.aws.codebuild/string))
(clojure.spec.alpha/def :portkey.aws.codebuild.logs-location/cloud-watch-logs (clojure.spec.alpha/and :portkey.aws.codebuild/cloud-watch-logs-config))
(clojure.spec.alpha/def :portkey.aws.codebuild.logs-location/s-3-logs (clojure.spec.alpha/and :portkey.aws.codebuild/s-3-logs-config))
(clojure.spec.alpha/def :portkey.aws.codebuild/logs-location (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.codebuild.logs-location/group-name :portkey.aws.codebuild.logs-location/stream-name :portkey.aws.codebuild.logs-location/deep-link :portkey.aws.codebuild.logs-location/s-3-deep-link :portkey.aws.codebuild.logs-location/cloud-watch-logs :portkey.aws.codebuild.logs-location/s-3-logs]))

(clojure.spec.alpha/def :portkey.aws.codebuild.delete-project-input/name (clojure.spec.alpha/and :portkey.aws.codebuild/non-empty-string))
(clojure.spec.alpha/def :portkey.aws.codebuild/delete-project-input (clojure.spec.alpha/keys :req-un [:portkey.aws.codebuild.delete-project-input/name] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.codebuild.cloud-watch-logs-config/status (clojure.spec.alpha/and :portkey.aws.codebuild/logs-config-status-type))
(clojure.spec.alpha/def :portkey.aws.codebuild.cloud-watch-logs-config/group-name (clojure.spec.alpha/and :portkey.aws.codebuild/string))
(clojure.spec.alpha/def :portkey.aws.codebuild.cloud-watch-logs-config/stream-name (clojure.spec.alpha/and :portkey.aws.codebuild/string))
(clojure.spec.alpha/def :portkey.aws.codebuild/cloud-watch-logs-config (clojure.spec.alpha/keys :req-un [:portkey.aws.codebuild.cloud-watch-logs-config/status] :opt-un [:portkey.aws.codebuild.cloud-watch-logs-config/group-name :portkey.aws.codebuild.cloud-watch-logs-config/stream-name]))

(clojure.spec.alpha/def :portkey.aws.codebuild.project-source/type (clojure.spec.alpha/and :portkey.aws.codebuild/source-type))
(clojure.spec.alpha/def :portkey.aws.codebuild.project-source/location (clojure.spec.alpha/and :portkey.aws.codebuild/string))
(clojure.spec.alpha/def :portkey.aws.codebuild.project-source/git-clone-depth (clojure.spec.alpha/and :portkey.aws.codebuild/git-clone-depth))
(clojure.spec.alpha/def :portkey.aws.codebuild.project-source/buildspec (clojure.spec.alpha/and :portkey.aws.codebuild/string))
(clojure.spec.alpha/def :portkey.aws.codebuild.project-source/auth (clojure.spec.alpha/and :portkey.aws.codebuild/source-auth))
(clojure.spec.alpha/def :portkey.aws.codebuild.project-source/report-build-status (clojure.spec.alpha/and :portkey.aws.codebuild/wrapper-boolean))
(clojure.spec.alpha/def :portkey.aws.codebuild.project-source/insecure-ssl (clojure.spec.alpha/and :portkey.aws.codebuild/wrapper-boolean))
(clojure.spec.alpha/def :portkey.aws.codebuild.project-source/source-identifier (clojure.spec.alpha/and :portkey.aws.codebuild/string))
(clojure.spec.alpha/def :portkey.aws.codebuild/project-source (clojure.spec.alpha/keys :req-un [:portkey.aws.codebuild.project-source/type] :opt-un [:portkey.aws.codebuild.project-source/location :portkey.aws.codebuild.project-source/git-clone-depth :portkey.aws.codebuild.project-source/buildspec :portkey.aws.codebuild.project-source/auth :portkey.aws.codebuild.project-source/report-build-status :portkey.aws.codebuild.project-source/insecure-ssl :portkey.aws.codebuild.project-source/source-identifier]))

(clojure.spec.alpha/def :portkey.aws.codebuild.invalidate-project-cache-input/project-name (clojure.spec.alpha/and :portkey.aws.codebuild/non-empty-string))
(clojure.spec.alpha/def :portkey.aws.codebuild/invalidate-project-cache-input (clojure.spec.alpha/keys :req-un [:portkey.aws.codebuild.invalidate-project-cache-input/project-name] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.codebuild.list-projects-input/sort-by (clojure.spec.alpha/and :portkey.aws.codebuild/project-sort-by-type))
(clojure.spec.alpha/def :portkey.aws.codebuild.list-projects-input/sort-order (clojure.spec.alpha/and :portkey.aws.codebuild/sort-order-type))
(clojure.spec.alpha/def :portkey.aws.codebuild.list-projects-input/next-token (clojure.spec.alpha/and :portkey.aws.codebuild/non-empty-string))
(clojure.spec.alpha/def :portkey.aws.codebuild/list-projects-input (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.codebuild.list-projects-input/sort-by :portkey.aws.codebuild.list-projects-input/sort-order :portkey.aws.codebuild.list-projects-input/next-token]))

(clojure.spec.alpha/def :portkey.aws.codebuild/environment-languages (clojure.spec.alpha/coll-of :portkey.aws.codebuild/environment-language))

(clojure.spec.alpha/def :portkey.aws.codebuild/platform-type #{"WINDOWS_SERVER" :windows-server "AMAZON_LINUX" "UBUNTU" :debian "DEBIAN" :amazon-linux :ubuntu})

(clojure.spec.alpha/def :portkey.aws.codebuild.batch-get-projects-output/projects (clojure.spec.alpha/and :portkey.aws.codebuild/projects))
(clojure.spec.alpha/def :portkey.aws.codebuild.batch-get-projects-output/projects-not-found (clojure.spec.alpha/and :portkey.aws.codebuild/project-names))
(clojure.spec.alpha/def :portkey.aws.codebuild/batch-get-projects-output (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.codebuild.batch-get-projects-output/projects :portkey.aws.codebuild.batch-get-projects-output/projects-not-found]))

(clojure.spec.alpha/def :portkey.aws.codebuild/environment-images (clojure.spec.alpha/coll-of :portkey.aws.codebuild/environment-image))

(clojure.spec.alpha/def :portkey.aws.codebuild/resource-already-exists-exception (clojure.spec.alpha/keys :req-un [] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.codebuild/source-type #{:s-3 "CODEPIPELINE" :github :codepipeline :bitbucket :codecommit :no-source "GITHUB_ENTERPRISE" "BITBUCKET" "CODECOMMIT" "GITHUB" "S3" "NO_SOURCE" :github-enterprise})

(clojure.spec.alpha/def :portkey.aws.codebuild/time-out (clojure.spec.alpha/int-in 5 480))

(clojure.spec.alpha/def :portkey.aws.codebuild.batch-get-builds-output/builds (clojure.spec.alpha/and :portkey.aws.codebuild/builds))
(clojure.spec.alpha/def :portkey.aws.codebuild.batch-get-builds-output/builds-not-found (clojure.spec.alpha/and :portkey.aws.codebuild/build-ids))
(clojure.spec.alpha/def :portkey.aws.codebuild/batch-get-builds-output (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.codebuild.batch-get-builds-output/builds :portkey.aws.codebuild.batch-get-builds-output/builds-not-found]))

(clojure.spec.alpha/def :portkey.aws.codebuild/sort-order-type #{:descending :ascending "ASCENDING" "DESCENDING"})

(clojure.spec.alpha/def :portkey.aws.codebuild.list-builds-output/ids (clojure.spec.alpha/and :portkey.aws.codebuild/build-ids))
(clojure.spec.alpha/def :portkey.aws.codebuild.list-builds-output/next-token (clojure.spec.alpha/and :portkey.aws.codebuild/string))
(clojure.spec.alpha/def :portkey.aws.codebuild/list-builds-output (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.codebuild.list-builds-output/ids :portkey.aws.codebuild.list-builds-output/next-token]))

(clojure.spec.alpha/def :portkey.aws.codebuild/status-type #{:timed-out "IN_PROGRESS" "TIMED_OUT" :in-progress "FAULT" :fault :stopped "SUCCEEDED" "STOPPED" "FAILED" :failed :succeeded})

(clojure.spec.alpha/def :portkey.aws.codebuild.list-projects-output/next-token (clojure.spec.alpha/and :portkey.aws.codebuild/string))
(clojure.spec.alpha/def :portkey.aws.codebuild.list-projects-output/projects (clojure.spec.alpha/and :portkey.aws.codebuild/project-names))
(clojure.spec.alpha/def :portkey.aws.codebuild/list-projects-output (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.codebuild.list-projects-output/next-token :portkey.aws.codebuild.list-projects-output/projects]))

(clojure.spec.alpha/def :portkey.aws.codebuild/list-curated-environment-images-input (clojure.spec.alpha/keys :req-un [] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.codebuild/image-versions (clojure.spec.alpha/coll-of :portkey.aws.codebuild/string))

(clojure.spec.alpha/def :portkey.aws.codebuild.project-environment/type (clojure.spec.alpha/and :portkey.aws.codebuild/environment-type))
(clojure.spec.alpha/def :portkey.aws.codebuild.project-environment/image (clojure.spec.alpha/and :portkey.aws.codebuild/non-empty-string))
(clojure.spec.alpha/def :portkey.aws.codebuild.project-environment/compute-type (clojure.spec.alpha/and :portkey.aws.codebuild/compute-type))
(clojure.spec.alpha/def :portkey.aws.codebuild.project-environment/environment-variables (clojure.spec.alpha/and :portkey.aws.codebuild/environment-variables))
(clojure.spec.alpha/def :portkey.aws.codebuild.project-environment/privileged-mode (clojure.spec.alpha/and :portkey.aws.codebuild/wrapper-boolean))
(clojure.spec.alpha/def :portkey.aws.codebuild.project-environment/certificate (clojure.spec.alpha/and :portkey.aws.codebuild/string))
(clojure.spec.alpha/def :portkey.aws.codebuild/project-environment (clojure.spec.alpha/keys :req-un [:portkey.aws.codebuild.project-environment/type :portkey.aws.codebuild.project-environment/image :portkey.aws.codebuild.project-environment/compute-type] :opt-un [:portkey.aws.codebuild.project-environment/environment-variables :portkey.aws.codebuild.project-environment/privileged-mode :portkey.aws.codebuild.project-environment/certificate]))

(clojure.spec.alpha/def :portkey.aws.codebuild/project-sources (clojure.spec.alpha/coll-of :portkey.aws.codebuild/project-source :min-count 0 :max-count 12))

(clojure.spec.alpha/def :portkey.aws.codebuild/tag-list (clojure.spec.alpha/coll-of :portkey.aws.codebuild/tag :min-count 0 :max-count 50))

(clojure.spec.alpha/def :portkey.aws.codebuild.update-project-input/vpc-config (clojure.spec.alpha/and :portkey.aws.codebuild/vpc-config))
(clojure.spec.alpha/def :portkey.aws.codebuild.update-project-input/service-role (clojure.spec.alpha/and :portkey.aws.codebuild/non-empty-string))
(clojure.spec.alpha/def :portkey.aws.codebuild.update-project-input/badge-enabled (clojure.spec.alpha/and :portkey.aws.codebuild/wrapper-boolean))
(clojure.spec.alpha/def :portkey.aws.codebuild.update-project-input/artifacts (clojure.spec.alpha/and :portkey.aws.codebuild/project-artifacts))
(clojure.spec.alpha/def :portkey.aws.codebuild.update-project-input/secondary-sources (clojure.spec.alpha/and :portkey.aws.codebuild/project-sources))
(clojure.spec.alpha/def :portkey.aws.codebuild.update-project-input/tags (clojure.spec.alpha/and :portkey.aws.codebuild/tag-list))
(clojure.spec.alpha/def :portkey.aws.codebuild.update-project-input/cache (clojure.spec.alpha/and :portkey.aws.codebuild/project-cache))
(clojure.spec.alpha/def :portkey.aws.codebuild.update-project-input/name (clojure.spec.alpha/and :portkey.aws.codebuild/non-empty-string))
(clojure.spec.alpha/def :portkey.aws.codebuild.update-project-input/encryption-key (clojure.spec.alpha/and :portkey.aws.codebuild/non-empty-string))
(clojure.spec.alpha/def :portkey.aws.codebuild.update-project-input/source (clojure.spec.alpha/and :portkey.aws.codebuild/project-source))
(clojure.spec.alpha/def :portkey.aws.codebuild.update-project-input/environment (clojure.spec.alpha/and :portkey.aws.codebuild/project-environment))
(clojure.spec.alpha/def :portkey.aws.codebuild.update-project-input/secondary-artifacts (clojure.spec.alpha/and :portkey.aws.codebuild/project-artifacts-list))
(clojure.spec.alpha/def :portkey.aws.codebuild.update-project-input/timeout-in-minutes (clojure.spec.alpha/and :portkey.aws.codebuild/time-out))
(clojure.spec.alpha/def :portkey.aws.codebuild.update-project-input/logs-config (clojure.spec.alpha/and :portkey.aws.codebuild/logs-config))
(clojure.spec.alpha/def :portkey.aws.codebuild.update-project-input/description (clojure.spec.alpha/and :portkey.aws.codebuild/project-description))
(clojure.spec.alpha/def :portkey.aws.codebuild/update-project-input (clojure.spec.alpha/keys :req-un [:portkey.aws.codebuild.update-project-input/name] :opt-un [:portkey.aws.codebuild.update-project-input/vpc-config :portkey.aws.codebuild.update-project-input/service-role :portkey.aws.codebuild.update-project-input/badge-enabled :portkey.aws.codebuild.update-project-input/artifacts :portkey.aws.codebuild.update-project-input/secondary-sources :portkey.aws.codebuild.update-project-input/tags :portkey.aws.codebuild.update-project-input/cache :portkey.aws.codebuild.update-project-input/encryption-key :portkey.aws.codebuild.update-project-input/source :portkey.aws.codebuild.update-project-input/environment :portkey.aws.codebuild.update-project-input/secondary-artifacts :portkey.aws.codebuild.update-project-input/timeout-in-minutes :portkey.aws.codebuild.update-project-input/logs-config :portkey.aws.codebuild.update-project-input/description]))

(clojure.spec.alpha/def :portkey.aws.codebuild/o-auth-provider-exception (clojure.spec.alpha/keys :req-un [] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.codebuild.s-3-logs-config/status (clojure.spec.alpha/and :portkey.aws.codebuild/logs-config-status-type))
(clojure.spec.alpha/def :portkey.aws.codebuild.s-3-logs-config/location (clojure.spec.alpha/and :portkey.aws.codebuild/string))
(clojure.spec.alpha/def :portkey.aws.codebuild/s-3-logs-config (clojure.spec.alpha/keys :req-un [:portkey.aws.codebuild.s-3-logs-config/status] :opt-un [:portkey.aws.codebuild.s-3-logs-config/location]))

(clojure.spec.alpha/def :portkey.aws.codebuild/resource-not-found-exception (clojure.spec.alpha/keys :req-un [] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.codebuild/delete-webhook-output (clojure.spec.alpha/keys :req-un [] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.codebuild/logs-config-status-type #{"DISABLED" :disabled "ENABLED" :enabled})

(clojure.spec.alpha/def :portkey.aws.codebuild/language-type #{"BASE" :dotnet :golang :node-js "DOTNET" "GOLANG" "JAVA" "DOCKER" :docker :java "PYTHON" :android "NODE_JS" "RUBY" :python :base "ANDROID" :ruby})

(clojure.spec.alpha/def :portkey.aws.codebuild/project-names (clojure.spec.alpha/coll-of :portkey.aws.codebuild/non-empty-string :min-count 1 :max-count 100))

(clojure.spec.alpha/def :portkey.aws.codebuild.environment-variable/name (clojure.spec.alpha/and :portkey.aws.codebuild/non-empty-string))
(clojure.spec.alpha/def :portkey.aws.codebuild.environment-variable/value (clojure.spec.alpha/and :portkey.aws.codebuild/string))
(clojure.spec.alpha/def :portkey.aws.codebuild.environment-variable/type (clojure.spec.alpha/and :portkey.aws.codebuild/environment-variable-type))
(clojure.spec.alpha/def :portkey.aws.codebuild/environment-variable (clojure.spec.alpha/keys :req-un [:portkey.aws.codebuild.environment-variable/name :portkey.aws.codebuild.environment-variable/value] :opt-un [:portkey.aws.codebuild.environment-variable/type]))

(clojure.spec.alpha/def :portkey.aws.codebuild/invalid-input-exception (clojure.spec.alpha/keys :req-un [] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.codebuild/key-input (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__27965__auto__] (clojure.core/<= 1 (clojure.core/count s__27965__auto__))) (clojure.core/fn [s__27966__auto__] (clojure.core/< (clojure.core/count s__27966__auto__) 127)) (clojure.core/fn [s__27967__auto__] (clojure.core/re-matches #"^([\\p{L}\\p{Z}\\p{N}_.:/=@+\\-]*)$" s__27967__auto__))))

(clojure.spec.alpha/def :portkey.aws.codebuild.batch-delete-builds-input/ids (clojure.spec.alpha/and :portkey.aws.codebuild/build-ids))
(clojure.spec.alpha/def :portkey.aws.codebuild/batch-delete-builds-input (clojure.spec.alpha/keys :req-un [:portkey.aws.codebuild.batch-delete-builds-input/ids] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.codebuild.start-build-input/report-build-status-override (clojure.spec.alpha/and :portkey.aws.codebuild/wrapper-boolean))
(clojure.spec.alpha/def :portkey.aws.codebuild.start-build-input/source-version (clojure.spec.alpha/and :portkey.aws.codebuild/string))
(clojure.spec.alpha/def :portkey.aws.codebuild.start-build-input/timeout-in-minutes-override (clojure.spec.alpha/and :portkey.aws.codebuild/time-out))
(clojure.spec.alpha/def :portkey.aws.codebuild.start-build-input/secondary-sources-override (clojure.spec.alpha/and :portkey.aws.codebuild/project-sources))
(clojure.spec.alpha/def :portkey.aws.codebuild.start-build-input/artifacts-override (clojure.spec.alpha/and :portkey.aws.codebuild/project-artifacts))
(clojure.spec.alpha/def :portkey.aws.codebuild.start-build-input/logs-config-override (clojure.spec.alpha/and :portkey.aws.codebuild/logs-config))
(clojure.spec.alpha/def :portkey.aws.codebuild.start-build-input/secondary-artifacts-override (clojure.spec.alpha/and :portkey.aws.codebuild/project-artifacts-list))
(clojure.spec.alpha/def :portkey.aws.codebuild.start-build-input/source-auth-override (clojure.spec.alpha/and :portkey.aws.codebuild/source-auth))
(clojure.spec.alpha/def :portkey.aws.codebuild.start-build-input/certificate-override (clojure.spec.alpha/and :portkey.aws.codebuild/string))
(clojure.spec.alpha/def :portkey.aws.codebuild.start-build-input/git-clone-depth-override (clojure.spec.alpha/and :portkey.aws.codebuild/git-clone-depth))
(clojure.spec.alpha/def :portkey.aws.codebuild.start-build-input/compute-type-override (clojure.spec.alpha/and :portkey.aws.codebuild/compute-type))
(clojure.spec.alpha/def :portkey.aws.codebuild.start-build-input/buildspec-override (clojure.spec.alpha/and :portkey.aws.codebuild/string))
(clojure.spec.alpha/def :portkey.aws.codebuild.start-build-input/idempotency-token (clojure.spec.alpha/and :portkey.aws.codebuild/string))
(clojure.spec.alpha/def :portkey.aws.codebuild.start-build-input/privileged-mode-override (clojure.spec.alpha/and :portkey.aws.codebuild/wrapper-boolean))
(clojure.spec.alpha/def :portkey.aws.codebuild.start-build-input/environment-variables-override (clojure.spec.alpha/and :portkey.aws.codebuild/environment-variables))
(clojure.spec.alpha/def :portkey.aws.codebuild.start-build-input/cache-override (clojure.spec.alpha/and :portkey.aws.codebuild/project-cache))
(clojure.spec.alpha/def :portkey.aws.codebuild.start-build-input/image-override (clojure.spec.alpha/and :portkey.aws.codebuild/non-empty-string))
(clojure.spec.alpha/def :portkey.aws.codebuild.start-build-input/environment-type-override (clojure.spec.alpha/and :portkey.aws.codebuild/environment-type))
(clojure.spec.alpha/def :portkey.aws.codebuild.start-build-input/service-role-override (clojure.spec.alpha/and :portkey.aws.codebuild/non-empty-string))
(clojure.spec.alpha/def :portkey.aws.codebuild.start-build-input/source-location-override (clojure.spec.alpha/and :portkey.aws.codebuild/string))
(clojure.spec.alpha/def :portkey.aws.codebuild.start-build-input/source-type-override (clojure.spec.alpha/and :portkey.aws.codebuild/source-type))
(clojure.spec.alpha/def :portkey.aws.codebuild.start-build-input/insecure-ssl-override (clojure.spec.alpha/and :portkey.aws.codebuild/wrapper-boolean))
(clojure.spec.alpha/def :portkey.aws.codebuild.start-build-input/project-name (clojure.spec.alpha/and :portkey.aws.codebuild/non-empty-string))
(clojure.spec.alpha/def :portkey.aws.codebuild.start-build-input/secondary-sources-version-override (clojure.spec.alpha/and :portkey.aws.codebuild/project-secondary-source-versions))
(clojure.spec.alpha/def :portkey.aws.codebuild/start-build-input (clojure.spec.alpha/keys :req-un [:portkey.aws.codebuild.start-build-input/project-name] :opt-un [:portkey.aws.codebuild.start-build-input/report-build-status-override :portkey.aws.codebuild.start-build-input/source-version :portkey.aws.codebuild.start-build-input/timeout-in-minutes-override :portkey.aws.codebuild.start-build-input/secondary-sources-override :portkey.aws.codebuild.start-build-input/artifacts-override :portkey.aws.codebuild.start-build-input/logs-config-override :portkey.aws.codebuild.start-build-input/secondary-artifacts-override :portkey.aws.codebuild.start-build-input/source-auth-override :portkey.aws.codebuild.start-build-input/certificate-override :portkey.aws.codebuild.start-build-input/git-clone-depth-override :portkey.aws.codebuild.start-build-input/compute-type-override :portkey.aws.codebuild.start-build-input/buildspec-override :portkey.aws.codebuild.start-build-input/idempotency-token :portkey.aws.codebuild.start-build-input/privileged-mode-override :portkey.aws.codebuild.start-build-input/environment-variables-override :portkey.aws.codebuild.start-build-input/cache-override :portkey.aws.codebuild.start-build-input/image-override :portkey.aws.codebuild.start-build-input/environment-type-override :portkey.aws.codebuild.start-build-input/service-role-override :portkey.aws.codebuild.start-build-input/source-location-override :portkey.aws.codebuild.start-build-input/source-type-override :portkey.aws.codebuild.start-build-input/insecure-ssl-override :portkey.aws.codebuild.start-build-input/secondary-sources-version-override]))

(clojure.spec.alpha/def :portkey.aws.codebuild.build/vpc-config (clojure.spec.alpha/and :portkey.aws.codebuild/vpc-config))
(clojure.spec.alpha/def :portkey.aws.codebuild.build/service-role (clojure.spec.alpha/and :portkey.aws.codebuild/non-empty-string))
(clojure.spec.alpha/def :portkey.aws.codebuild.build/source-version (clojure.spec.alpha/and :portkey.aws.codebuild/non-empty-string))
(clojure.spec.alpha/def :portkey.aws.codebuild.build/build-complete (clojure.spec.alpha/and :portkey.aws.codebuild/boolean))
(clojure.spec.alpha/def :portkey.aws.codebuild.build/secondary-source-versions (clojure.spec.alpha/and :portkey.aws.codebuild/project-secondary-source-versions))
(clojure.spec.alpha/def :portkey.aws.codebuild.build/artifacts (clojure.spec.alpha/and :portkey.aws.codebuild/build-artifacts))
(clojure.spec.alpha/def :portkey.aws.codebuild.build/arn (clojure.spec.alpha/and :portkey.aws.codebuild/non-empty-string))
(clojure.spec.alpha/def :portkey.aws.codebuild.build/network-interface (clojure.spec.alpha/and :portkey.aws.codebuild/network-interface))
(clojure.spec.alpha/def :portkey.aws.codebuild.build/secondary-sources (clojure.spec.alpha/and :portkey.aws.codebuild/project-sources))
(clojure.spec.alpha/def :portkey.aws.codebuild.build/id (clojure.spec.alpha/and :portkey.aws.codebuild/non-empty-string))
(clojure.spec.alpha/def :portkey.aws.codebuild.build/resolved-source-version (clojure.spec.alpha/and :portkey.aws.codebuild/non-empty-string))
(clojure.spec.alpha/def :portkey.aws.codebuild.build/cache (clojure.spec.alpha/and :portkey.aws.codebuild/project-cache))
(clojure.spec.alpha/def :portkey.aws.codebuild.build/start-time (clojure.spec.alpha/and :portkey.aws.codebuild/timestamp))
(clojure.spec.alpha/def :portkey.aws.codebuild.build/logs (clojure.spec.alpha/and :portkey.aws.codebuild/logs-location))
(clojure.spec.alpha/def :portkey.aws.codebuild.build/initiator (clojure.spec.alpha/and :portkey.aws.codebuild/string))
(clojure.spec.alpha/def :portkey.aws.codebuild.build/encryption-key (clojure.spec.alpha/and :portkey.aws.codebuild/non-empty-string))
(clojure.spec.alpha/def :portkey.aws.codebuild.build/source (clojure.spec.alpha/and :portkey.aws.codebuild/project-source))
(clojure.spec.alpha/def :portkey.aws.codebuild.build/environment (clojure.spec.alpha/and :portkey.aws.codebuild/project-environment))
(clojure.spec.alpha/def :portkey.aws.codebuild.build/secondary-artifacts (clojure.spec.alpha/and :portkey.aws.codebuild/build-artifacts-list))
(clojure.spec.alpha/def :portkey.aws.codebuild.build/current-phase (clojure.spec.alpha/and :portkey.aws.codebuild/string))
(clojure.spec.alpha/def :portkey.aws.codebuild.build/timeout-in-minutes (clojure.spec.alpha/and :portkey.aws.codebuild/wrapper-int))
(clojure.spec.alpha/def :portkey.aws.codebuild.build/end-time (clojure.spec.alpha/and :portkey.aws.codebuild/timestamp))
(clojure.spec.alpha/def :portkey.aws.codebuild.build/project-name (clojure.spec.alpha/and :portkey.aws.codebuild/non-empty-string))
(clojure.spec.alpha/def :portkey.aws.codebuild.build/build-status (clojure.spec.alpha/and :portkey.aws.codebuild/status-type))
(clojure.spec.alpha/def :portkey.aws.codebuild.build/phases (clojure.spec.alpha/and :portkey.aws.codebuild/build-phases))
(clojure.spec.alpha/def :portkey.aws.codebuild/build (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.codebuild.build/vpc-config :portkey.aws.codebuild.build/service-role :portkey.aws.codebuild.build/source-version :portkey.aws.codebuild.build/build-complete :portkey.aws.codebuild.build/secondary-source-versions :portkey.aws.codebuild.build/artifacts :portkey.aws.codebuild.build/arn :portkey.aws.codebuild.build/network-interface :portkey.aws.codebuild.build/secondary-sources :portkey.aws.codebuild.build/id :portkey.aws.codebuild.build/resolved-source-version :portkey.aws.codebuild.build/cache :portkey.aws.codebuild.build/start-time :portkey.aws.codebuild.build/logs :portkey.aws.codebuild.build/initiator :portkey.aws.codebuild.build/encryption-key :portkey.aws.codebuild.build/source :portkey.aws.codebuild.build/environment :portkey.aws.codebuild.build/secondary-artifacts :portkey.aws.codebuild.build/current-phase :portkey.aws.codebuild.build/timeout-in-minutes :portkey.aws.codebuild.build/end-time :portkey.aws.codebuild.build/project-name :portkey.aws.codebuild.build/build-status :portkey.aws.codebuild.build/phases]))

(clojure.spec.alpha/def :portkey.aws.codebuild/string (clojure.spec.alpha/and clojure.core/string?))

(clojure.spec.alpha/def :portkey.aws.codebuild.source-auth/type (clojure.spec.alpha/and :portkey.aws.codebuild/source-auth-type))
(clojure.spec.alpha/def :portkey.aws.codebuild.source-auth/resource (clojure.spec.alpha/and :portkey.aws.codebuild/string))
(clojure.spec.alpha/def :portkey.aws.codebuild/source-auth (clojure.spec.alpha/keys :req-un [:portkey.aws.codebuild.source-auth/type] :opt-un [:portkey.aws.codebuild.source-auth/resource]))

(clojure.spec.alpha/def :portkey.aws.codebuild/project-description (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__27965__auto__] (clojure.core/<= 0 (clojure.core/count s__27965__auto__))) (clojure.core/fn [s__27966__auto__] (clojure.core/< (clojure.core/count s__27966__auto__) 255))))

(clojure.spec.alpha/def :portkey.aws.codebuild.project/vpc-config (clojure.spec.alpha/and :portkey.aws.codebuild/vpc-config))
(clojure.spec.alpha/def :portkey.aws.codebuild.project/service-role (clojure.spec.alpha/and :portkey.aws.codebuild/non-empty-string))
(clojure.spec.alpha/def :portkey.aws.codebuild.project/last-modified (clojure.spec.alpha/and :portkey.aws.codebuild/timestamp))
(clojure.spec.alpha/def :portkey.aws.codebuild.project/created (clojure.spec.alpha/and :portkey.aws.codebuild/timestamp))
(clojure.spec.alpha/def :portkey.aws.codebuild.project/artifacts (clojure.spec.alpha/and :portkey.aws.codebuild/project-artifacts))
(clojure.spec.alpha/def :portkey.aws.codebuild.project/arn (clojure.spec.alpha/and :portkey.aws.codebuild/string))
(clojure.spec.alpha/def :portkey.aws.codebuild.project/secondary-sources (clojure.spec.alpha/and :portkey.aws.codebuild/project-sources))
(clojure.spec.alpha/def :portkey.aws.codebuild.project/tags (clojure.spec.alpha/and :portkey.aws.codebuild/tag-list))
(clojure.spec.alpha/def :portkey.aws.codebuild.project/cache (clojure.spec.alpha/and :portkey.aws.codebuild/project-cache))
(clojure.spec.alpha/def :portkey.aws.codebuild.project/name (clojure.spec.alpha/and :portkey.aws.codebuild/project-name))
(clojure.spec.alpha/def :portkey.aws.codebuild.project/encryption-key (clojure.spec.alpha/and :portkey.aws.codebuild/non-empty-string))
(clojure.spec.alpha/def :portkey.aws.codebuild.project/source (clojure.spec.alpha/and :portkey.aws.codebuild/project-source))
(clojure.spec.alpha/def :portkey.aws.codebuild.project/environment (clojure.spec.alpha/and :portkey.aws.codebuild/project-environment))
(clojure.spec.alpha/def :portkey.aws.codebuild.project/secondary-artifacts (clojure.spec.alpha/and :portkey.aws.codebuild/project-artifacts-list))
(clojure.spec.alpha/def :portkey.aws.codebuild.project/timeout-in-minutes (clojure.spec.alpha/and :portkey.aws.codebuild/time-out))
(clojure.spec.alpha/def :portkey.aws.codebuild.project/webhook (clojure.spec.alpha/and :portkey.aws.codebuild/webhook))
(clojure.spec.alpha/def :portkey.aws.codebuild.project/logs-config (clojure.spec.alpha/and :portkey.aws.codebuild/logs-config))
(clojure.spec.alpha/def :portkey.aws.codebuild.project/description (clojure.spec.alpha/and :portkey.aws.codebuild/project-description))
(clojure.spec.alpha/def :portkey.aws.codebuild.project/badge (clojure.spec.alpha/and :portkey.aws.codebuild/project-badge))
(clojure.spec.alpha/def :portkey.aws.codebuild/project (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.codebuild.project/vpc-config :portkey.aws.codebuild.project/service-role :portkey.aws.codebuild.project/last-modified :portkey.aws.codebuild.project/created :portkey.aws.codebuild.project/artifacts :portkey.aws.codebuild.project/arn :portkey.aws.codebuild.project/secondary-sources :portkey.aws.codebuild.project/tags :portkey.aws.codebuild.project/cache :portkey.aws.codebuild.project/name :portkey.aws.codebuild.project/encryption-key :portkey.aws.codebuild.project/source :portkey.aws.codebuild.project/environment :portkey.aws.codebuild.project/secondary-artifacts :portkey.aws.codebuild.project/timeout-in-minutes :portkey.aws.codebuild.project/webhook :portkey.aws.codebuild.project/logs-config :portkey.aws.codebuild.project/description :portkey.aws.codebuild.project/badge]))

(clojure.spec.alpha/def :portkey.aws.codebuild/delete-project-output (clojure.spec.alpha/keys :req-un [] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.codebuild.network-interface/subnet-id (clojure.spec.alpha/and :portkey.aws.codebuild/non-empty-string))
(clojure.spec.alpha/def :portkey.aws.codebuild.network-interface/network-interface-id (clojure.spec.alpha/and :portkey.aws.codebuild/non-empty-string))
(clojure.spec.alpha/def :portkey.aws.codebuild/network-interface (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.codebuild.network-interface/subnet-id :portkey.aws.codebuild.network-interface/network-interface-id]))

(clojure.spec.alpha/def :portkey.aws.codebuild.project-cache/type (clojure.spec.alpha/and :portkey.aws.codebuild/cache-type))
(clojure.spec.alpha/def :portkey.aws.codebuild.project-cache/location (clojure.spec.alpha/and :portkey.aws.codebuild/string))
(clojure.spec.alpha/def :portkey.aws.codebuild/project-cache (clojure.spec.alpha/keys :req-un [:portkey.aws.codebuild.project-cache/type] :opt-un [:portkey.aws.codebuild.project-cache/location]))

(clojure.spec.alpha/def :portkey.aws.codebuild.stop-build-input/id (clojure.spec.alpha/and :portkey.aws.codebuild/non-empty-string))
(clojure.spec.alpha/def :portkey.aws.codebuild/stop-build-input (clojure.spec.alpha/keys :req-un [:portkey.aws.codebuild.stop-build-input/id] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.codebuild/project-sort-by-type #{"CREATED_TIME" "NAME" :name :created-time :last-modified-time "LAST_MODIFIED_TIME"})

(clojure.spec.alpha/def :portkey.aws.codebuild.delete-webhook-input/project-name (clojure.spec.alpha/and :portkey.aws.codebuild/project-name))
(clojure.spec.alpha/def :portkey.aws.codebuild/delete-webhook-input (clojure.spec.alpha/keys :req-un [:portkey.aws.codebuild.delete-webhook-input/project-name] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.codebuild/cache-type #{:s-3 "NO_CACHE" :no-cache "S3"})

(clojure.spec.alpha/def :portkey.aws.codebuild/wrapper-int clojure.core/int?)

(clojure.spec.alpha/def :portkey.aws.codebuild/environment-variable-type #{:parameter-store :plaintext "PARAMETER_STORE" "PLAINTEXT"})

(clojure.spec.alpha/def :portkey.aws.codebuild.phase-context/status-code (clojure.spec.alpha/and :portkey.aws.codebuild/string))
(clojure.spec.alpha/def :portkey.aws.codebuild.phase-context/message (clojure.spec.alpha/and :portkey.aws.codebuild/string))
(clojure.spec.alpha/def :portkey.aws.codebuild/phase-context (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.codebuild.phase-context/status-code :portkey.aws.codebuild.phase-context/message]))

(clojure.spec.alpha/def :portkey.aws.codebuild.create-webhook-output/webhook (clojure.spec.alpha/and :portkey.aws.codebuild/webhook))
(clojure.spec.alpha/def :portkey.aws.codebuild/create-webhook-output (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.codebuild.create-webhook-output/webhook]))

(clojure.spec.alpha/def :portkey.aws.codebuild.vpc-config/vpc-id (clojure.spec.alpha/and :portkey.aws.codebuild/non-empty-string))
(clojure.spec.alpha/def :portkey.aws.codebuild.vpc-config/subnets (clojure.spec.alpha/and :portkey.aws.codebuild/subnets))
(clojure.spec.alpha/def :portkey.aws.codebuild.vpc-config/security-group-ids (clojure.spec.alpha/and :portkey.aws.codebuild/security-group-ids))
(clojure.spec.alpha/def :portkey.aws.codebuild/vpc-config (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.codebuild.vpc-config/vpc-id :portkey.aws.codebuild.vpc-config/subnets :portkey.aws.codebuild.vpc-config/security-group-ids]))

(clojure.spec.alpha/def :portkey.aws.codebuild.list-builds-for-project-output/ids (clojure.spec.alpha/and :portkey.aws.codebuild/build-ids))
(clojure.spec.alpha/def :portkey.aws.codebuild.list-builds-for-project-output/next-token (clojure.spec.alpha/and :portkey.aws.codebuild/string))
(clojure.spec.alpha/def :portkey.aws.codebuild/list-builds-for-project-output (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.codebuild.list-builds-for-project-output/ids :portkey.aws.codebuild.list-builds-for-project-output/next-token]))

(clojure.spec.alpha/def :portkey.aws.codebuild.create-project-input/vpc-config (clojure.spec.alpha/and :portkey.aws.codebuild/vpc-config))
(clojure.spec.alpha/def :portkey.aws.codebuild.create-project-input/service-role (clojure.spec.alpha/and :portkey.aws.codebuild/non-empty-string))
(clojure.spec.alpha/def :portkey.aws.codebuild.create-project-input/badge-enabled (clojure.spec.alpha/and :portkey.aws.codebuild/wrapper-boolean))
(clojure.spec.alpha/def :portkey.aws.codebuild.create-project-input/artifacts (clojure.spec.alpha/and :portkey.aws.codebuild/project-artifacts))
(clojure.spec.alpha/def :portkey.aws.codebuild.create-project-input/secondary-sources (clojure.spec.alpha/and :portkey.aws.codebuild/project-sources))
(clojure.spec.alpha/def :portkey.aws.codebuild.create-project-input/tags (clojure.spec.alpha/and :portkey.aws.codebuild/tag-list))
(clojure.spec.alpha/def :portkey.aws.codebuild.create-project-input/cache (clojure.spec.alpha/and :portkey.aws.codebuild/project-cache))
(clojure.spec.alpha/def :portkey.aws.codebuild.create-project-input/name (clojure.spec.alpha/and :portkey.aws.codebuild/project-name))
(clojure.spec.alpha/def :portkey.aws.codebuild.create-project-input/encryption-key (clojure.spec.alpha/and :portkey.aws.codebuild/non-empty-string))
(clojure.spec.alpha/def :portkey.aws.codebuild.create-project-input/source (clojure.spec.alpha/and :portkey.aws.codebuild/project-source))
(clojure.spec.alpha/def :portkey.aws.codebuild.create-project-input/environment (clojure.spec.alpha/and :portkey.aws.codebuild/project-environment))
(clojure.spec.alpha/def :portkey.aws.codebuild.create-project-input/secondary-artifacts (clojure.spec.alpha/and :portkey.aws.codebuild/project-artifacts-list))
(clojure.spec.alpha/def :portkey.aws.codebuild.create-project-input/timeout-in-minutes (clojure.spec.alpha/and :portkey.aws.codebuild/time-out))
(clojure.spec.alpha/def :portkey.aws.codebuild.create-project-input/logs-config (clojure.spec.alpha/and :portkey.aws.codebuild/logs-config))
(clojure.spec.alpha/def :portkey.aws.codebuild.create-project-input/description (clojure.spec.alpha/and :portkey.aws.codebuild/project-description))
(clojure.spec.alpha/def :portkey.aws.codebuild/create-project-input (clojure.spec.alpha/keys :req-un [:portkey.aws.codebuild.create-project-input/name :portkey.aws.codebuild.create-project-input/source :portkey.aws.codebuild.create-project-input/artifacts :portkey.aws.codebuild.create-project-input/environment :portkey.aws.codebuild.create-project-input/service-role] :opt-un [:portkey.aws.codebuild.create-project-input/vpc-config :portkey.aws.codebuild.create-project-input/badge-enabled :portkey.aws.codebuild.create-project-input/secondary-sources :portkey.aws.codebuild.create-project-input/tags :portkey.aws.codebuild.create-project-input/cache :portkey.aws.codebuild.create-project-input/encryption-key :portkey.aws.codebuild.create-project-input/secondary-artifacts :portkey.aws.codebuild.create-project-input/timeout-in-minutes :portkey.aws.codebuild.create-project-input/logs-config :portkey.aws.codebuild.create-project-input/description]))

(clojure.spec.alpha/def :portkey.aws.codebuild.project-source-version/source-identifier (clojure.spec.alpha/and :portkey.aws.codebuild/string))
(clojure.spec.alpha/def :portkey.aws.codebuild.project-source-version/source-version (clojure.spec.alpha/and :portkey.aws.codebuild/string))
(clojure.spec.alpha/def :portkey.aws.codebuild/project-source-version (clojure.spec.alpha/keys :req-un [:portkey.aws.codebuild.project-source-version/source-identifier :portkey.aws.codebuild.project-source-version/source-version] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.codebuild/timestamp clojure.core/inst?)

(clojure.spec.alpha/def :portkey.aws.codebuild.update-webhook-input/project-name (clojure.spec.alpha/and :portkey.aws.codebuild/project-name))
(clojure.spec.alpha/def :portkey.aws.codebuild.update-webhook-input/branch-filter (clojure.spec.alpha/and :portkey.aws.codebuild/string))
(clojure.spec.alpha/def :portkey.aws.codebuild.update-webhook-input/rotate-secret (clojure.spec.alpha/and :portkey.aws.codebuild/boolean))
(clojure.spec.alpha/def :portkey.aws.codebuild/update-webhook-input (clojure.spec.alpha/keys :req-un [:portkey.aws.codebuild.update-webhook-input/project-name] :opt-un [:portkey.aws.codebuild.update-webhook-input/branch-filter :portkey.aws.codebuild.update-webhook-input/rotate-secret]))

(clojure.spec.alpha/def :portkey.aws.codebuild/source-auth-type #{"OAUTH" :oauth})

(clojure.spec.alpha/def :portkey.aws.codebuild/wrapper-boolean clojure.core/boolean?)

(clojure.spec.alpha/def :portkey.aws.codebuild/build-phase-type #{:finalizing "COMPLETED" :install "POST_BUILD" :post-build :pre-build :upload-artifacts :completed "PROVISIONING" :download-source :submitted "SUBMITTED" "UPLOAD_ARTIFACTS" :build "BUILD" :provisioning "DOWNLOAD_SOURCE" "INSTALL" "FINALIZING" "PRE_BUILD"})

(clojure.spec.alpha/def :portkey.aws.codebuild.build-artifacts/location (clojure.spec.alpha/and :portkey.aws.codebuild/string))
(clojure.spec.alpha/def :portkey.aws.codebuild.build-artifacts/sha-256sum (clojure.spec.alpha/and :portkey.aws.codebuild/string))
(clojure.spec.alpha/def :portkey.aws.codebuild.build-artifacts/md-5sum (clojure.spec.alpha/and :portkey.aws.codebuild/string))
(clojure.spec.alpha/def :portkey.aws.codebuild.build-artifacts/override-artifact-name (clojure.spec.alpha/and :portkey.aws.codebuild/wrapper-boolean))
(clojure.spec.alpha/def :portkey.aws.codebuild.build-artifacts/encryption-disabled (clojure.spec.alpha/and :portkey.aws.codebuild/wrapper-boolean))
(clojure.spec.alpha/def :portkey.aws.codebuild.build-artifacts/artifact-identifier (clojure.spec.alpha/and :portkey.aws.codebuild/string))
(clojure.spec.alpha/def :portkey.aws.codebuild/build-artifacts (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.codebuild.build-artifacts/location :portkey.aws.codebuild.build-artifacts/sha-256sum :portkey.aws.codebuild.build-artifacts/md-5sum :portkey.aws.codebuild.build-artifacts/override-artifact-name :portkey.aws.codebuild.build-artifacts/encryption-disabled :portkey.aws.codebuild.build-artifacts/artifact-identifier]))

(clojure.spec.alpha/def :portkey.aws.codebuild.tag/key (clojure.spec.alpha/and :portkey.aws.codebuild/key-input))
(clojure.spec.alpha/def :portkey.aws.codebuild.tag/value (clojure.spec.alpha/and :portkey.aws.codebuild/value-input))
(clojure.spec.alpha/def :portkey.aws.codebuild/tag (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.codebuild.tag/key :portkey.aws.codebuild.tag/value]))

(clojure.spec.alpha/def :portkey.aws.codebuild/builds (clojure.spec.alpha/coll-of :portkey.aws.codebuild/build))

(clojure.spec.alpha/def :portkey.aws.codebuild/compute-type #{"BUILD_GENERAL1_LARGE" "BUILD_GENERAL1_SMALL" :build-general-1-small "BUILD_GENERAL1_MEDIUM" :build-general-1-medium :build-general-1-large})

(clojure.spec.alpha/def :portkey.aws.codebuild/projects (clojure.spec.alpha/coll-of :portkey.aws.codebuild/project))

(clojure.spec.alpha/def :portkey.aws.codebuild.update-project-output/project (clojure.spec.alpha/and :portkey.aws.codebuild/project))
(clojure.spec.alpha/def :portkey.aws.codebuild/update-project-output (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.codebuild.update-project-output/project]))

(clojure.spec.alpha/def :portkey.aws.codebuild.list-builds-input/sort-order (clojure.spec.alpha/and :portkey.aws.codebuild/sort-order-type))
(clojure.spec.alpha/def :portkey.aws.codebuild.list-builds-input/next-token (clojure.spec.alpha/and :portkey.aws.codebuild/string))
(clojure.spec.alpha/def :portkey.aws.codebuild/list-builds-input (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.codebuild.list-builds-input/sort-order :portkey.aws.codebuild.list-builds-input/next-token]))

(clojure.spec.alpha/def :portkey.aws.codebuild/project-name (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__27965__auto__] (clojure.core/<= 2 (clojure.core/count s__27965__auto__))) (clojure.core/fn [s__27966__auto__] (clojure.core/< (clojure.core/count s__27966__auto__) 255)) (clojure.core/fn [s__27967__auto__] (clojure.core/re-matches #"[A-Za-z0-9][A-Za-z0-9\-_]{1,254}" s__27967__auto__))))

(clojure.spec.alpha/def :portkey.aws.codebuild/git-clone-depth (clojure.spec.alpha/int-in 0 Long/MAX_VALUE))

(clojure.spec.alpha/def :portkey.aws.codebuild/build-ids (clojure.spec.alpha/coll-of :portkey.aws.codebuild/non-empty-string :min-count 1 :max-count 100))

(clojure.spec.alpha/def :portkey.aws.codebuild.build-phase/phase-type (clojure.spec.alpha/and :portkey.aws.codebuild/build-phase-type))
(clojure.spec.alpha/def :portkey.aws.codebuild.build-phase/phase-status (clojure.spec.alpha/and :portkey.aws.codebuild/status-type))
(clojure.spec.alpha/def :portkey.aws.codebuild.build-phase/start-time (clojure.spec.alpha/and :portkey.aws.codebuild/timestamp))
(clojure.spec.alpha/def :portkey.aws.codebuild.build-phase/end-time (clojure.spec.alpha/and :portkey.aws.codebuild/timestamp))
(clojure.spec.alpha/def :portkey.aws.codebuild.build-phase/duration-in-seconds (clojure.spec.alpha/and :portkey.aws.codebuild/wrapper-long))
(clojure.spec.alpha/def :portkey.aws.codebuild.build-phase/contexts (clojure.spec.alpha/and :portkey.aws.codebuild/phase-contexts))
(clojure.spec.alpha/def :portkey.aws.codebuild/build-phase (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.codebuild.build-phase/phase-type :portkey.aws.codebuild.build-phase/phase-status :portkey.aws.codebuild.build-phase/start-time :portkey.aws.codebuild.build-phase/end-time :portkey.aws.codebuild.build-phase/duration-in-seconds :portkey.aws.codebuild.build-phase/contexts]))

(clojure.spec.alpha/def :portkey.aws.codebuild.batch-get-builds-input/ids (clojure.spec.alpha/and :portkey.aws.codebuild/build-ids))
(clojure.spec.alpha/def :portkey.aws.codebuild/batch-get-builds-input (clojure.spec.alpha/keys :req-un [:portkey.aws.codebuild.batch-get-builds-input/ids] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.codebuild.list-builds-for-project-input/project-name (clojure.spec.alpha/and :portkey.aws.codebuild/non-empty-string))
(clojure.spec.alpha/def :portkey.aws.codebuild.list-builds-for-project-input/sort-order (clojure.spec.alpha/and :portkey.aws.codebuild/sort-order-type))
(clojure.spec.alpha/def :portkey.aws.codebuild.list-builds-for-project-input/next-token (clojure.spec.alpha/and :portkey.aws.codebuild/string))
(clojure.spec.alpha/def :portkey.aws.codebuild/list-builds-for-project-input (clojure.spec.alpha/keys :req-un [:portkey.aws.codebuild.list-builds-for-project-input/project-name] :opt-un [:portkey.aws.codebuild.list-builds-for-project-input/sort-order :portkey.aws.codebuild.list-builds-for-project-input/next-token]))

(clojure.spec.alpha/def :portkey.aws.codebuild/project-artifacts-list (clojure.spec.alpha/coll-of :portkey.aws.codebuild/project-artifacts :min-count 0 :max-count 12))

(clojure.spec.alpha/def :portkey.aws.codebuild/builds-not-deleted (clojure.spec.alpha/coll-of :portkey.aws.codebuild/build-not-deleted))

(clojure.spec.alpha/def :portkey.aws.codebuild/project-secondary-source-versions (clojure.spec.alpha/coll-of :portkey.aws.codebuild/project-source-version :min-count 0 :max-count 12))

(clojure.spec.alpha/def :portkey.aws.codebuild/phase-contexts (clojure.spec.alpha/coll-of :portkey.aws.codebuild/phase-context))

(clojure.spec.alpha/def :portkey.aws.codebuild.logs-config/cloud-watch-logs (clojure.spec.alpha/and :portkey.aws.codebuild/cloud-watch-logs-config))
(clojure.spec.alpha/def :portkey.aws.codebuild.logs-config/s-3-logs (clojure.spec.alpha/and :portkey.aws.codebuild/s-3-logs-config))
(clojure.spec.alpha/def :portkey.aws.codebuild/logs-config (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.codebuild.logs-config/cloud-watch-logs :portkey.aws.codebuild.logs-config/s-3-logs]))

(clojure.spec.alpha/def :portkey.aws.codebuild.environment-platform/platform (clojure.spec.alpha/and :portkey.aws.codebuild/platform-type))
(clojure.spec.alpha/def :portkey.aws.codebuild.environment-platform/languages (clojure.spec.alpha/and :portkey.aws.codebuild/environment-languages))
(clojure.spec.alpha/def :portkey.aws.codebuild/environment-platform (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.codebuild.environment-platform/platform :portkey.aws.codebuild.environment-platform/languages]))

(clojure.spec.alpha/def :portkey.aws.codebuild/artifacts-type #{:s-3 "CODEPIPELINE" :codepipeline :no-artifacts "NO_ARTIFACTS" "S3"})

(clojure.spec.alpha/def :portkey.aws.codebuild.stop-build-output/build (clojure.spec.alpha/and :portkey.aws.codebuild/build))
(clojure.spec.alpha/def :portkey.aws.codebuild/stop-build-output (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.codebuild.stop-build-output/build]))

(clojure.spec.alpha/def :portkey.aws.codebuild/environment-platforms (clojure.spec.alpha/coll-of :portkey.aws.codebuild/environment-platform))

(clojure.spec.alpha/def :portkey.aws.codebuild.project-artifacts/override-artifact-name (clojure.spec.alpha/and :portkey.aws.codebuild/wrapper-boolean))
(clojure.spec.alpha/def :portkey.aws.codebuild.project-artifacts/path (clojure.spec.alpha/and :portkey.aws.codebuild/string))
(clojure.spec.alpha/def :portkey.aws.codebuild.project-artifacts/encryption-disabled (clojure.spec.alpha/and :portkey.aws.codebuild/wrapper-boolean))
(clojure.spec.alpha/def :portkey.aws.codebuild.project-artifacts/packaging (clojure.spec.alpha/and :portkey.aws.codebuild/artifact-packaging))
(clojure.spec.alpha/def :portkey.aws.codebuild.project-artifacts/name (clojure.spec.alpha/and :portkey.aws.codebuild/string))
(clojure.spec.alpha/def :portkey.aws.codebuild.project-artifacts/location (clojure.spec.alpha/and :portkey.aws.codebuild/string))
(clojure.spec.alpha/def :portkey.aws.codebuild.project-artifacts/namespace-type (clojure.spec.alpha/and :portkey.aws.codebuild/artifact-namespace))
(clojure.spec.alpha/def :portkey.aws.codebuild.project-artifacts/artifact-identifier (clojure.spec.alpha/and :portkey.aws.codebuild/string))
(clojure.spec.alpha/def :portkey.aws.codebuild.project-artifacts/type (clojure.spec.alpha/and :portkey.aws.codebuild/artifacts-type))
(clojure.spec.alpha/def :portkey.aws.codebuild/project-artifacts (clojure.spec.alpha/keys :req-un [:portkey.aws.codebuild.project-artifacts/type] :opt-un [:portkey.aws.codebuild.project-artifacts/override-artifact-name :portkey.aws.codebuild.project-artifacts/path :portkey.aws.codebuild.project-artifacts/encryption-disabled :portkey.aws.codebuild.project-artifacts/packaging :portkey.aws.codebuild.project-artifacts/name :portkey.aws.codebuild.project-artifacts/location :portkey.aws.codebuild.project-artifacts/namespace-type :portkey.aws.codebuild.project-artifacts/artifact-identifier]))

(clojure.spec.alpha/def :portkey.aws.codebuild/boolean clojure.core/boolean?)

(clojure.spec.alpha/def :portkey.aws.codebuild.webhook/url (clojure.spec.alpha/and :portkey.aws.codebuild/non-empty-string))
(clojure.spec.alpha/def :portkey.aws.codebuild.webhook/payload-url (clojure.spec.alpha/and :portkey.aws.codebuild/non-empty-string))
(clojure.spec.alpha/def :portkey.aws.codebuild.webhook/secret (clojure.spec.alpha/and :portkey.aws.codebuild/non-empty-string))
(clojure.spec.alpha/def :portkey.aws.codebuild.webhook/branch-filter (clojure.spec.alpha/and :portkey.aws.codebuild/string))
(clojure.spec.alpha/def :portkey.aws.codebuild.webhook/last-modified-secret (clojure.spec.alpha/and :portkey.aws.codebuild/timestamp))
(clojure.spec.alpha/def :portkey.aws.codebuild/webhook (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.codebuild.webhook/url :portkey.aws.codebuild.webhook/payload-url :portkey.aws.codebuild.webhook/secret :portkey.aws.codebuild.webhook/branch-filter :portkey.aws.codebuild.webhook/last-modified-secret]))

(clojure.core/defn start-build ([start-build-inputinput] (clojure.core/let [request-function-result__28606__auto__ (req-start-build-input start-build-inputinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__28606__auto__ {:http.request.configuration/endpoints portkey.aws.codebuild/endpoints, :http.request.spec/output-spec :portkey.aws.codebuild/start-build-output, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2016-10-06", :http.request.configuration/service-id "CodeBuild", :http.request.spec/input-spec :portkey.aws.codebuild/start-build-input, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/action "StartBuild", :http.request.spec/error-spec {"InvalidInputException" :portkey.aws.codebuild/invalid-input-exception, "ResourceNotFoundException" :portkey.aws.codebuild/resource-not-found-exception, "AccountLimitExceededException" :portkey.aws.codebuild/account-limit-exceeded-exception}})))))
(clojure.spec.alpha/fdef start-build :args (clojure.spec.alpha/tuple :portkey.aws.codebuild/start-build-input) :ret (clojure.spec.alpha/and :portkey.aws.codebuild/start-build-output))

(clojure.core/defn list-curated-environment-images ([] (list-curated-environment-images {})) ([list-curated-environment-images-inputinput] (clojure.core/let [request-function-result__28606__auto__ (req-list-curated-environment-images-input list-curated-environment-images-inputinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__28606__auto__ {:http.request.configuration/endpoints portkey.aws.codebuild/endpoints, :http.request.spec/output-spec :portkey.aws.codebuild/list-curated-environment-images-output, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2016-10-06", :http.request.configuration/service-id "CodeBuild", :http.request.spec/input-spec :portkey.aws.codebuild/list-curated-environment-images-input, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/action "ListCuratedEnvironmentImages", :http.request.spec/error-spec {}})))))
(clojure.spec.alpha/fdef list-curated-environment-images :args (clojure.spec.alpha/? :portkey.aws.codebuild/list-curated-environment-images-input) :ret (clojure.spec.alpha/and :portkey.aws.codebuild/list-curated-environment-images-output))

(clojure.core/defn invalidate-project-cache ([invalidate-project-cache-inputinput] (clojure.core/let [request-function-result__28606__auto__ (req-invalidate-project-cache-input invalidate-project-cache-inputinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__28606__auto__ {:http.request.configuration/endpoints portkey.aws.codebuild/endpoints, :http.request.spec/output-spec :portkey.aws.codebuild/invalidate-project-cache-output, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2016-10-06", :http.request.configuration/service-id "CodeBuild", :http.request.spec/input-spec :portkey.aws.codebuild/invalidate-project-cache-input, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/action "InvalidateProjectCache", :http.request.spec/error-spec {"InvalidInputException" :portkey.aws.codebuild/invalid-input-exception, "ResourceNotFoundException" :portkey.aws.codebuild/resource-not-found-exception}})))))
(clojure.spec.alpha/fdef invalidate-project-cache :args (clojure.spec.alpha/tuple :portkey.aws.codebuild/invalidate-project-cache-input) :ret (clojure.spec.alpha/and :portkey.aws.codebuild/invalidate-project-cache-output))

(clojure.core/defn list-builds ([] (list-builds {})) ([list-builds-inputinput] (clojure.core/let [request-function-result__28606__auto__ (req-list-builds-input list-builds-inputinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__28606__auto__ {:http.request.configuration/endpoints portkey.aws.codebuild/endpoints, :http.request.spec/output-spec :portkey.aws.codebuild/list-builds-output, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2016-10-06", :http.request.configuration/service-id "CodeBuild", :http.request.spec/input-spec :portkey.aws.codebuild/list-builds-input, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/action "ListBuilds", :http.request.spec/error-spec {"InvalidInputException" :portkey.aws.codebuild/invalid-input-exception}})))))
(clojure.spec.alpha/fdef list-builds :args (clojure.spec.alpha/? :portkey.aws.codebuild/list-builds-input) :ret (clojure.spec.alpha/and :portkey.aws.codebuild/list-builds-output))

(clojure.core/defn batch-delete-builds ([batch-delete-builds-inputinput] (clojure.core/let [request-function-result__28606__auto__ (req-batch-delete-builds-input batch-delete-builds-inputinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__28606__auto__ {:http.request.configuration/endpoints portkey.aws.codebuild/endpoints, :http.request.spec/output-spec :portkey.aws.codebuild/batch-delete-builds-output, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2016-10-06", :http.request.configuration/service-id "CodeBuild", :http.request.spec/input-spec :portkey.aws.codebuild/batch-delete-builds-input, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/action "BatchDeleteBuilds", :http.request.spec/error-spec {"InvalidInputException" :portkey.aws.codebuild/invalid-input-exception}})))))
(clojure.spec.alpha/fdef batch-delete-builds :args (clojure.spec.alpha/tuple :portkey.aws.codebuild/batch-delete-builds-input) :ret (clojure.spec.alpha/and :portkey.aws.codebuild/batch-delete-builds-output))

(clojure.core/defn create-webhook ([create-webhook-inputinput] (clojure.core/let [request-function-result__28606__auto__ (req-create-webhook-input create-webhook-inputinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__28606__auto__ {:http.request.configuration/endpoints portkey.aws.codebuild/endpoints, :http.request.spec/output-spec :portkey.aws.codebuild/create-webhook-output, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2016-10-06", :http.request.configuration/service-id "CodeBuild", :http.request.spec/input-spec :portkey.aws.codebuild/create-webhook-input, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/action "CreateWebhook", :http.request.spec/error-spec {"InvalidInputException" :portkey.aws.codebuild/invalid-input-exception, "OAuthProviderException" :portkey.aws.codebuild/o-auth-provider-exception, "ResourceAlreadyExistsException" :portkey.aws.codebuild/resource-already-exists-exception, "ResourceNotFoundException" :portkey.aws.codebuild/resource-not-found-exception}})))))
(clojure.spec.alpha/fdef create-webhook :args (clojure.spec.alpha/tuple :portkey.aws.codebuild/create-webhook-input) :ret (clojure.spec.alpha/and :portkey.aws.codebuild/create-webhook-output))

(clojure.core/defn list-projects ([] (list-projects {})) ([list-projects-inputinput] (clojure.core/let [request-function-result__28606__auto__ (req-list-projects-input list-projects-inputinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__28606__auto__ {:http.request.configuration/endpoints portkey.aws.codebuild/endpoints, :http.request.spec/output-spec :portkey.aws.codebuild/list-projects-output, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2016-10-06", :http.request.configuration/service-id "CodeBuild", :http.request.spec/input-spec :portkey.aws.codebuild/list-projects-input, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/action "ListProjects", :http.request.spec/error-spec {"InvalidInputException" :portkey.aws.codebuild/invalid-input-exception}})))))
(clojure.spec.alpha/fdef list-projects :args (clojure.spec.alpha/? :portkey.aws.codebuild/list-projects-input) :ret (clojure.spec.alpha/and :portkey.aws.codebuild/list-projects-output))

(clojure.core/defn delete-webhook ([delete-webhook-inputinput] (clojure.core/let [request-function-result__28606__auto__ (req-delete-webhook-input delete-webhook-inputinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__28606__auto__ {:http.request.configuration/endpoints portkey.aws.codebuild/endpoints, :http.request.spec/output-spec :portkey.aws.codebuild/delete-webhook-output, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2016-10-06", :http.request.configuration/service-id "CodeBuild", :http.request.spec/input-spec :portkey.aws.codebuild/delete-webhook-input, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/action "DeleteWebhook", :http.request.spec/error-spec {"InvalidInputException" :portkey.aws.codebuild/invalid-input-exception, "ResourceNotFoundException" :portkey.aws.codebuild/resource-not-found-exception, "OAuthProviderException" :portkey.aws.codebuild/o-auth-provider-exception}})))))
(clojure.spec.alpha/fdef delete-webhook :args (clojure.spec.alpha/tuple :portkey.aws.codebuild/delete-webhook-input) :ret (clojure.spec.alpha/and :portkey.aws.codebuild/delete-webhook-output))

(clojure.core/defn batch-get-projects ([batch-get-projects-inputinput] (clojure.core/let [request-function-result__28606__auto__ (req-batch-get-projects-input batch-get-projects-inputinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__28606__auto__ {:http.request.configuration/endpoints portkey.aws.codebuild/endpoints, :http.request.spec/output-spec :portkey.aws.codebuild/batch-get-projects-output, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2016-10-06", :http.request.configuration/service-id "CodeBuild", :http.request.spec/input-spec :portkey.aws.codebuild/batch-get-projects-input, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/action "BatchGetProjects", :http.request.spec/error-spec {"InvalidInputException" :portkey.aws.codebuild/invalid-input-exception}})))))
(clojure.spec.alpha/fdef batch-get-projects :args (clojure.spec.alpha/tuple :portkey.aws.codebuild/batch-get-projects-input) :ret (clojure.spec.alpha/and :portkey.aws.codebuild/batch-get-projects-output))

(clojure.core/defn update-project ([update-project-inputinput] (clojure.core/let [request-function-result__28606__auto__ (req-update-project-input update-project-inputinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__28606__auto__ {:http.request.configuration/endpoints portkey.aws.codebuild/endpoints, :http.request.spec/output-spec :portkey.aws.codebuild/update-project-output, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2016-10-06", :http.request.configuration/service-id "CodeBuild", :http.request.spec/input-spec :portkey.aws.codebuild/update-project-input, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/action "UpdateProject", :http.request.spec/error-spec {"InvalidInputException" :portkey.aws.codebuild/invalid-input-exception, "ResourceNotFoundException" :portkey.aws.codebuild/resource-not-found-exception}})))))
(clojure.spec.alpha/fdef update-project :args (clojure.spec.alpha/tuple :portkey.aws.codebuild/update-project-input) :ret (clojure.spec.alpha/and :portkey.aws.codebuild/update-project-output))

(clojure.core/defn batch-get-builds ([batch-get-builds-inputinput] (clojure.core/let [request-function-result__28606__auto__ (req-batch-get-builds-input batch-get-builds-inputinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__28606__auto__ {:http.request.configuration/endpoints portkey.aws.codebuild/endpoints, :http.request.spec/output-spec :portkey.aws.codebuild/batch-get-builds-output, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2016-10-06", :http.request.configuration/service-id "CodeBuild", :http.request.spec/input-spec :portkey.aws.codebuild/batch-get-builds-input, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/action "BatchGetBuilds", :http.request.spec/error-spec {"InvalidInputException" :portkey.aws.codebuild/invalid-input-exception}})))))
(clojure.spec.alpha/fdef batch-get-builds :args (clojure.spec.alpha/tuple :portkey.aws.codebuild/batch-get-builds-input) :ret (clojure.spec.alpha/and :portkey.aws.codebuild/batch-get-builds-output))

(clojure.core/defn update-webhook ([update-webhook-inputinput] (clojure.core/let [request-function-result__28606__auto__ (req-update-webhook-input update-webhook-inputinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__28606__auto__ {:http.request.configuration/endpoints portkey.aws.codebuild/endpoints, :http.request.spec/output-spec :portkey.aws.codebuild/update-webhook-output, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2016-10-06", :http.request.configuration/service-id "CodeBuild", :http.request.spec/input-spec :portkey.aws.codebuild/update-webhook-input, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/action "UpdateWebhook", :http.request.spec/error-spec {"InvalidInputException" :portkey.aws.codebuild/invalid-input-exception, "ResourceNotFoundException" :portkey.aws.codebuild/resource-not-found-exception, "OAuthProviderException" :portkey.aws.codebuild/o-auth-provider-exception}})))))
(clojure.spec.alpha/fdef update-webhook :args (clojure.spec.alpha/tuple :portkey.aws.codebuild/update-webhook-input) :ret (clojure.spec.alpha/and :portkey.aws.codebuild/update-webhook-output))

(clojure.core/defn stop-build ([stop-build-inputinput] (clojure.core/let [request-function-result__28606__auto__ (req-stop-build-input stop-build-inputinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__28606__auto__ {:http.request.configuration/endpoints portkey.aws.codebuild/endpoints, :http.request.spec/output-spec :portkey.aws.codebuild/stop-build-output, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2016-10-06", :http.request.configuration/service-id "CodeBuild", :http.request.spec/input-spec :portkey.aws.codebuild/stop-build-input, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/action "StopBuild", :http.request.spec/error-spec {"InvalidInputException" :portkey.aws.codebuild/invalid-input-exception, "ResourceNotFoundException" :portkey.aws.codebuild/resource-not-found-exception}})))))
(clojure.spec.alpha/fdef stop-build :args (clojure.spec.alpha/tuple :portkey.aws.codebuild/stop-build-input) :ret (clojure.spec.alpha/and :portkey.aws.codebuild/stop-build-output))

(clojure.core/defn delete-project ([delete-project-inputinput] (clojure.core/let [request-function-result__28606__auto__ (req-delete-project-input delete-project-inputinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__28606__auto__ {:http.request.configuration/endpoints portkey.aws.codebuild/endpoints, :http.request.spec/output-spec :portkey.aws.codebuild/delete-project-output, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2016-10-06", :http.request.configuration/service-id "CodeBuild", :http.request.spec/input-spec :portkey.aws.codebuild/delete-project-input, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/action "DeleteProject", :http.request.spec/error-spec {"InvalidInputException" :portkey.aws.codebuild/invalid-input-exception}})))))
(clojure.spec.alpha/fdef delete-project :args (clojure.spec.alpha/tuple :portkey.aws.codebuild/delete-project-input) :ret (clojure.spec.alpha/and :portkey.aws.codebuild/delete-project-output))

(clojure.core/defn list-builds-for-project ([list-builds-for-project-inputinput] (clojure.core/let [request-function-result__28606__auto__ (req-list-builds-for-project-input list-builds-for-project-inputinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__28606__auto__ {:http.request.configuration/endpoints portkey.aws.codebuild/endpoints, :http.request.spec/output-spec :portkey.aws.codebuild/list-builds-for-project-output, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2016-10-06", :http.request.configuration/service-id "CodeBuild", :http.request.spec/input-spec :portkey.aws.codebuild/list-builds-for-project-input, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/action "ListBuildsForProject", :http.request.spec/error-spec {"InvalidInputException" :portkey.aws.codebuild/invalid-input-exception, "ResourceNotFoundException" :portkey.aws.codebuild/resource-not-found-exception}})))))
(clojure.spec.alpha/fdef list-builds-for-project :args (clojure.spec.alpha/tuple :portkey.aws.codebuild/list-builds-for-project-input) :ret (clojure.spec.alpha/and :portkey.aws.codebuild/list-builds-for-project-output))

(clojure.core/defn create-project ([create-project-inputinput] (clojure.core/let [request-function-result__28606__auto__ (req-create-project-input create-project-inputinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__28606__auto__ {:http.request.configuration/endpoints portkey.aws.codebuild/endpoints, :http.request.spec/output-spec :portkey.aws.codebuild/create-project-output, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2016-10-06", :http.request.configuration/service-id "CodeBuild", :http.request.spec/input-spec :portkey.aws.codebuild/create-project-input, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/action "CreateProject", :http.request.spec/error-spec {"InvalidInputException" :portkey.aws.codebuild/invalid-input-exception, "ResourceAlreadyExistsException" :portkey.aws.codebuild/resource-already-exists-exception, "AccountLimitExceededException" :portkey.aws.codebuild/account-limit-exceeded-exception}})))))
(clojure.spec.alpha/fdef create-project :args (clojure.spec.alpha/tuple :portkey.aws.codebuild/create-project-input) :ret (clojure.spec.alpha/and :portkey.aws.codebuild/create-project-output))
