(ns portkey.aws.codebuild.-2016-10-06 (:require [portkey.aws]))

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

(clojure.core/declare ser-webhook-filter)

(clojure.core/declare ser-webhook-filter-type)

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

(clojure.core/declare ser-server-type)

(clojure.core/declare ser-source-type)

(clojure.core/declare ser-credential-provider-type)

(clojure.core/declare ser-time-out)

(clojure.core/declare ser-sort-order-type)

(clojure.core/declare ser-project-cache-modes)

(clojure.core/declare ser-project-environment)

(clojure.core/declare ser-project-sources)

(clojure.core/declare ser-image-pull-credentials-type)

(clojure.core/declare ser-tag-list)

(clojure.core/declare ser-sensitive-non-empty-string)

(clojure.core/declare ser-registry-credential)

(clojure.core/declare ser-s-3-logs-config)

(clojure.core/declare ser-logs-config-status-type)

(clojure.core/declare ser-project-names)

(clojure.core/declare ser-environment-variable)

(clojure.core/declare ser-key-input)

(clojure.core/declare ser-cache-mode)

(clojure.core/declare ser-string)

(clojure.core/declare ser-source-auth)

(clojure.core/declare ser-project-description)

(clojure.core/declare ser-project-cache)

(clojure.core/declare ser-project-sort-by-type)

(clojure.core/declare ser-cache-type)

(clojure.core/declare ser-environment-variable-type)

(clojure.core/declare ser-filter-groups)

(clojure.core/declare ser-vpc-config)

(clojure.core/declare ser-project-source-version)

(clojure.core/declare ser-source-auth-type)

(clojure.core/declare ser-wrapper-boolean)

(clojure.core/declare ser-auth-type)

(clojure.core/declare ser-tag)

(clojure.core/declare ser-compute-type)

(clojure.core/declare ser-filter-group)

(clojure.core/declare ser-project-name)

(clojure.core/declare ser-git-clone-depth)

(clojure.core/declare ser-build-ids)

(clojure.core/declare ser-project-artifacts-list)

(clojure.core/declare ser-project-secondary-source-versions)

(clojure.core/declare ser-logs-config)

(clojure.core/declare ser-artifacts-type)

(clojure.core/declare ser-project-artifacts)

(clojure.core/declare ser-boolean)

(clojure.core/defn- ser-webhook-filter [input] (clojure.core/cond-> #:http.request.field{:value [(clojure.core/into (ser-webhook-filter-type (:type input)) #:http.request.field{:name "type", :shape "WebhookFilterType"}) (clojure.core/into (ser-string (:pattern input)) #:http.request.field{:name "pattern", :shape "String"})], :shape "WebhookFilter", :type "structure"} (clojure.core/contains? input :exclude-matched-pattern) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-wrapper-boolean (input :exclude-matched-pattern)) #:http.request.field{:name "excludeMatchedPattern", :shape "WrapperBoolean"}))))

(clojure.core/defn- ser-webhook-filter-type [input] #:http.request.field{:value (clojure.core/get {"FILE_PATH" "FILE_PATH", :base-ref "BASE_REF", "BASE_REF" "BASE_REF", "EVENT" "EVENT", :event "EVENT", "HEAD_REF" "HEAD_REF", :file-path "FILE_PATH", :actor-account-id "ACTOR_ACCOUNT_ID", "ACTOR_ACCOUNT_ID" "ACTOR_ACCOUNT_ID", :head-ref "HEAD_REF"} input), :shape "WebhookFilterType"})

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

(clojure.core/defn- ser-server-type [input] #:http.request.field{:value (clojure.core/get {"GITHUB" "GITHUB", :github "GITHUB", "BITBUCKET" "BITBUCKET", :bitbucket "BITBUCKET", "GITHUB_ENTERPRISE" "GITHUB_ENTERPRISE", :github-enterprise "GITHUB_ENTERPRISE"} input), :shape "ServerType"})

(clojure.core/defn- ser-source-type [input] #:http.request.field{:value (clojure.core/get {:s-3 "S3", "CODEPIPELINE" "CODEPIPELINE", :github "GITHUB", :codepipeline "CODEPIPELINE", :bitbucket "BITBUCKET", :codecommit "CODECOMMIT", :no-source "NO_SOURCE", "GITHUB_ENTERPRISE" "GITHUB_ENTERPRISE", "BITBUCKET" "BITBUCKET", "CODECOMMIT" "CODECOMMIT", "GITHUB" "GITHUB", "S3" "S3", "NO_SOURCE" "NO_SOURCE", :github-enterprise "GITHUB_ENTERPRISE"} input), :shape "SourceType"})

(clojure.core/defn- ser-credential-provider-type [input] #:http.request.field{:value (clojure.core/get {"SECRETS_MANAGER" "SECRETS_MANAGER", :secrets-manager "SECRETS_MANAGER"} input), :shape "CredentialProviderType"})

(clojure.core/defn- ser-time-out [input] #:http.request.field{:value input, :shape "TimeOut"})

(clojure.core/defn- ser-sort-order-type [input] #:http.request.field{:value (clojure.core/get {"ASCENDING" "ASCENDING", :ascending "ASCENDING", "DESCENDING" "DESCENDING", :descending "DESCENDING"} input), :shape "SortOrderType"})

(clojure.core/defn- ser-project-cache-modes [input] #:http.request.field{:value (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (clojure.core/merge (ser-cache-mode coll) #:http.request.field{:shape "CacheMode"}))) input), :shape "ProjectCacheModes", :type "list"})

(clojure.core/defn- ser-project-environment [input] (clojure.core/cond-> #:http.request.field{:value [(clojure.core/into (ser-environment-type (:type input)) #:http.request.field{:name "type", :shape "EnvironmentType"}) (clojure.core/into (ser-non-empty-string (:image input)) #:http.request.field{:name "image", :shape "NonEmptyString"}) (clojure.core/into (ser-compute-type (:compute-type input)) #:http.request.field{:name "computeType", :shape "ComputeType"})], :shape "ProjectEnvironment", :type "structure"} (clojure.core/contains? input :environment-variables) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-environment-variables (input :environment-variables)) #:http.request.field{:name "environmentVariables", :shape "EnvironmentVariables"})) (clojure.core/contains? input :privileged-mode) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-wrapper-boolean (input :privileged-mode)) #:http.request.field{:name "privilegedMode", :shape "WrapperBoolean"})) (clojure.core/contains? input :certificate) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-string (input :certificate)) #:http.request.field{:name "certificate", :shape "String"})) (clojure.core/contains? input :registry-credential) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-registry-credential (input :registry-credential)) #:http.request.field{:name "registryCredential", :shape "RegistryCredential"})) (clojure.core/contains? input :image-pull-credentials-type) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-image-pull-credentials-type (input :image-pull-credentials-type)) #:http.request.field{:name "imagePullCredentialsType", :shape "ImagePullCredentialsType"}))))

(clojure.core/defn- ser-project-sources [input] #:http.request.field{:value (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (clojure.core/merge (ser-project-source coll) #:http.request.field{:shape "ProjectSource"}))) input), :shape "ProjectSources", :type "list", :max 12, :min 0})

(clojure.core/defn- ser-image-pull-credentials-type [input] #:http.request.field{:value (clojure.core/get {"CODEBUILD" "CODEBUILD", :codebuild "CODEBUILD", "SERVICE_ROLE" "SERVICE_ROLE", :service-role "SERVICE_ROLE"} input), :shape "ImagePullCredentialsType"})

(clojure.core/defn- ser-tag-list [input] #:http.request.field{:value (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (clojure.core/merge (ser-tag coll) #:http.request.field{:shape "Tag"}))) input), :shape "TagList", :type "list", :max 50, :min 0})

(clojure.core/defn- ser-sensitive-non-empty-string [input] #:http.request.field{:value input, :shape "SensitiveNonEmptyString"})

(clojure.core/defn- ser-registry-credential [input] (clojure.core/cond-> #:http.request.field{:value [(clojure.core/into (ser-non-empty-string (:credential input)) #:http.request.field{:name "credential", :shape "NonEmptyString"}) (clojure.core/into (ser-credential-provider-type (:credential-provider input)) #:http.request.field{:name "credentialProvider", :shape "CredentialProviderType"})], :shape "RegistryCredential", :type "structure"}))

(clojure.core/defn- ser-s-3-logs-config [input] (clojure.core/cond-> #:http.request.field{:value [(clojure.core/into (ser-logs-config-status-type (:status input)) #:http.request.field{:name "status", :shape "LogsConfigStatusType"})], :shape "S3LogsConfig", :type "structure"} (clojure.core/contains? input :location) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-string (input :location)) #:http.request.field{:name "location", :shape "String"}))))

(clojure.core/defn- ser-logs-config-status-type [input] #:http.request.field{:value (clojure.core/get {"ENABLED" "ENABLED", :enabled "ENABLED", "DISABLED" "DISABLED", :disabled "DISABLED"} input), :shape "LogsConfigStatusType"})

(clojure.core/defn- ser-project-names [input] #:http.request.field{:value (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (clojure.core/merge (ser-non-empty-string coll) #:http.request.field{:shape "NonEmptyString"}))) input), :shape "ProjectNames", :type "list", :max 100, :min 1})

(clojure.core/defn- ser-environment-variable [input] (clojure.core/cond-> #:http.request.field{:value [(clojure.core/into (ser-non-empty-string (:name input)) #:http.request.field{:name "name", :shape "NonEmptyString"}) (clojure.core/into (ser-string (:value input)) #:http.request.field{:name "value", :shape "String"})], :shape "EnvironmentVariable", :type "structure"} (clojure.core/contains? input :type) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-environment-variable-type (input :type)) #:http.request.field{:name "type", :shape "EnvironmentVariableType"}))))

(clojure.core/defn- ser-key-input [input] #:http.request.field{:value input, :shape "KeyInput"})

(clojure.core/defn- ser-cache-mode [input] #:http.request.field{:value (clojure.core/get {"LOCAL_DOCKER_LAYER_CACHE" "LOCAL_DOCKER_LAYER_CACHE", :local-docker-layer-cache "LOCAL_DOCKER_LAYER_CACHE", "LOCAL_SOURCE_CACHE" "LOCAL_SOURCE_CACHE", :local-source-cache "LOCAL_SOURCE_CACHE", "LOCAL_CUSTOM_CACHE" "LOCAL_CUSTOM_CACHE", :local-custom-cache "LOCAL_CUSTOM_CACHE"} input), :shape "CacheMode"})

(clojure.core/defn- ser-string [input] #:http.request.field{:value input, :shape "String"})

(clojure.core/defn- ser-source-auth [input] (clojure.core/cond-> #:http.request.field{:value [(clojure.core/into (ser-source-auth-type (:type input)) #:http.request.field{:name "type", :shape "SourceAuthType"})], :shape "SourceAuth", :type "structure"} (clojure.core/contains? input :resource) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-string (input :resource)) #:http.request.field{:name "resource", :shape "String"}))))

(clojure.core/defn- ser-project-description [input] #:http.request.field{:value input, :shape "ProjectDescription"})

(clojure.core/defn- ser-project-cache [input] (clojure.core/cond-> #:http.request.field{:value [(clojure.core/into (ser-cache-type (:type input)) #:http.request.field{:name "type", :shape "CacheType"})], :shape "ProjectCache", :type "structure"} (clojure.core/contains? input :location) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-string (input :location)) #:http.request.field{:name "location", :shape "String"})) (clojure.core/contains? input :modes) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-project-cache-modes (input :modes)) #:http.request.field{:name "modes", :shape "ProjectCacheModes"}))))

(clojure.core/defn- ser-project-sort-by-type [input] #:http.request.field{:value (clojure.core/get {"NAME" "NAME", :name "NAME", "CREATED_TIME" "CREATED_TIME", :created-time "CREATED_TIME", "LAST_MODIFIED_TIME" "LAST_MODIFIED_TIME", :last-modified-time "LAST_MODIFIED_TIME"} input), :shape "ProjectSortByType"})

(clojure.core/defn- ser-cache-type [input] #:http.request.field{:value (clojure.core/get {"NO_CACHE" "NO_CACHE", :no-cache "NO_CACHE", "S3" "S3", :s-3 "S3", "LOCAL" "LOCAL", :local "LOCAL"} input), :shape "CacheType"})

(clojure.core/defn- ser-environment-variable-type [input] #:http.request.field{:value (clojure.core/get {"PLAINTEXT" "PLAINTEXT", :plaintext "PLAINTEXT", "PARAMETER_STORE" "PARAMETER_STORE", :parameter-store "PARAMETER_STORE"} input), :shape "EnvironmentVariableType"})

(clojure.core/defn- ser-filter-groups [input] #:http.request.field{:value (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (clojure.core/merge (ser-filter-group coll) #:http.request.field{:shape "FilterGroup"}))) input), :shape "FilterGroups", :type "list"})

(clojure.core/defn- ser-vpc-config [input] (clojure.core/cond-> #:http.request.field{:value [], :shape "VpcConfig", :type "structure"} (clojure.core/contains? input :vpc-id) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-non-empty-string (input :vpc-id)) #:http.request.field{:name "vpcId", :shape "NonEmptyString"})) (clojure.core/contains? input :subnets) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-subnets (input :subnets)) #:http.request.field{:name "subnets", :shape "Subnets"})) (clojure.core/contains? input :security-group-ids) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-security-group-ids (input :security-group-ids)) #:http.request.field{:name "securityGroupIds", :shape "SecurityGroupIds"}))))

(clojure.core/defn- ser-project-source-version [input] (clojure.core/cond-> #:http.request.field{:value [(clojure.core/into (ser-string (:source-identifier input)) #:http.request.field{:name "sourceIdentifier", :shape "String"}) (clojure.core/into (ser-string (:source-version input)) #:http.request.field{:name "sourceVersion", :shape "String"})], :shape "ProjectSourceVersion", :type "structure"}))

(clojure.core/defn- ser-source-auth-type [input] #:http.request.field{:value (clojure.core/get {"OAUTH" "OAUTH", :oauth "OAUTH"} input), :shape "SourceAuthType"})

(clojure.core/defn- ser-wrapper-boolean [input] #:http.request.field{:value input, :shape "WrapperBoolean"})

(clojure.core/defn- ser-auth-type [input] #:http.request.field{:value (clojure.core/get {"OAUTH" "OAUTH", :oauth "OAUTH", "BASIC_AUTH" "BASIC_AUTH", :basic-auth "BASIC_AUTH", "PERSONAL_ACCESS_TOKEN" "PERSONAL_ACCESS_TOKEN", :personal-access-token "PERSONAL_ACCESS_TOKEN"} input), :shape "AuthType"})

(clojure.core/defn- ser-tag [input] (clojure.core/cond-> #:http.request.field{:value [], :shape "Tag", :type "structure"} (clojure.core/contains? input :key) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-key-input (input :key)) #:http.request.field{:name "key", :shape "KeyInput"})) (clojure.core/contains? input :value) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-value-input (input :value)) #:http.request.field{:name "value", :shape "ValueInput"}))))

(clojure.core/defn- ser-compute-type [input] #:http.request.field{:value (clojure.core/get {"BUILD_GENERAL1_SMALL" "BUILD_GENERAL1_SMALL", :build-general-1-small "BUILD_GENERAL1_SMALL", "BUILD_GENERAL1_MEDIUM" "BUILD_GENERAL1_MEDIUM", :build-general-1-medium "BUILD_GENERAL1_MEDIUM", "BUILD_GENERAL1_LARGE" "BUILD_GENERAL1_LARGE", :build-general-1-large "BUILD_GENERAL1_LARGE"} input), :shape "ComputeType"})

(clojure.core/defn- ser-filter-group [input] #:http.request.field{:value (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (clojure.core/merge (ser-webhook-filter coll) #:http.request.field{:shape "WebhookFilter"}))) input), :shape "FilterGroup", :type "list"})

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

(clojure.core/defn- req-delete-source-credentials-input [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (ser-non-empty-string (input :arn)) #:http.request.field{:name "arn", :shape "NonEmptyString"})]}))

(clojure.core/defn- req-create-webhook-input [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (ser-project-name (input :project-name)) #:http.request.field{:name "projectName", :shape "ProjectName"})]} (clojure.core/contains? input :branch-filter) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-string (input :branch-filter)) #:http.request.field{:name "branchFilter", :shape "String"})) (clojure.core/contains? input :filter-groups) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-filter-groups (input :filter-groups)) #:http.request.field{:name "filterGroups", :shape "FilterGroups"}))))

(clojure.core/defn- req-import-source-credentials-input [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (ser-sensitive-non-empty-string (input :token)) #:http.request.field{:name "token", :shape "SensitiveNonEmptyString"}) (clojure.core/into (ser-server-type (input :server-type)) #:http.request.field{:name "serverType", :shape "ServerType"}) (clojure.core/into (ser-auth-type (input :auth-type)) #:http.request.field{:name "authType", :shape "AuthType"})]} (clojure.core/contains? input :username) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-non-empty-string (input :username)) #:http.request.field{:name "username", :shape "NonEmptyString"}))))

(clojure.core/defn- req-delete-project-input [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (ser-non-empty-string (input :name)) #:http.request.field{:name "name", :shape "NonEmptyString"})]}))

(clojure.core/defn- req-invalidate-project-cache-input [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (ser-non-empty-string (input :project-name)) #:http.request.field{:name "projectName", :shape "NonEmptyString"})]}))

(clojure.core/defn- req-list-projects-input [input] (clojure.core/cond-> {} (clojure.core/contains? input :sort-by) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-project-sort-by-type (input :sort-by)) #:http.request.field{:name "sortBy", :shape "ProjectSortByType"})) (clojure.core/contains? input :sort-order) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-sort-order-type (input :sort-order)) #:http.request.field{:name "sortOrder", :shape "SortOrderType"})) (clojure.core/contains? input :next-token) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-non-empty-string (input :next-token)) #:http.request.field{:name "nextToken", :shape "NonEmptyString"}))))

(clojure.core/defn- req-list-source-credentials-input [input] (clojure.core/cond-> {}))

(clojure.core/defn- req-list-curated-environment-images-input [input] (clojure.core/cond-> {}))

(clojure.core/defn- req-update-project-input [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (ser-non-empty-string (input :name)) #:http.request.field{:name "name", :shape "NonEmptyString"})]} (clojure.core/contains? input :vpc-config) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-vpc-config (input :vpc-config)) #:http.request.field{:name "vpcConfig", :shape "VpcConfig"})) (clojure.core/contains? input :service-role) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-non-empty-string (input :service-role)) #:http.request.field{:name "serviceRole", :shape "NonEmptyString"})) (clojure.core/contains? input :badge-enabled) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-wrapper-boolean (input :badge-enabled)) #:http.request.field{:name "badgeEnabled", :shape "WrapperBoolean"})) (clojure.core/contains? input :artifacts) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-project-artifacts (input :artifacts)) #:http.request.field{:name "artifacts", :shape "ProjectArtifacts"})) (clojure.core/contains? input :secondary-sources) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-project-sources (input :secondary-sources)) #:http.request.field{:name "secondarySources", :shape "ProjectSources"})) (clojure.core/contains? input :tags) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-tag-list (input :tags)) #:http.request.field{:name "tags", :shape "TagList"})) (clojure.core/contains? input :cache) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-project-cache (input :cache)) #:http.request.field{:name "cache", :shape "ProjectCache"})) (clojure.core/contains? input :encryption-key) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-non-empty-string (input :encryption-key)) #:http.request.field{:name "encryptionKey", :shape "NonEmptyString"})) (clojure.core/contains? input :source) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-project-source (input :source)) #:http.request.field{:name "source", :shape "ProjectSource"})) (clojure.core/contains? input :environment) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-project-environment (input :environment)) #:http.request.field{:name "environment", :shape "ProjectEnvironment"})) (clojure.core/contains? input :secondary-artifacts) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-project-artifacts-list (input :secondary-artifacts)) #:http.request.field{:name "secondaryArtifacts", :shape "ProjectArtifactsList"})) (clojure.core/contains? input :timeout-in-minutes) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-time-out (input :timeout-in-minutes)) #:http.request.field{:name "timeoutInMinutes", :shape "TimeOut"})) (clojure.core/contains? input :logs-config) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-logs-config (input :logs-config)) #:http.request.field{:name "logsConfig", :shape "LogsConfig"})) (clojure.core/contains? input :queued-timeout-in-minutes) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-time-out (input :queued-timeout-in-minutes)) #:http.request.field{:name "queuedTimeoutInMinutes", :shape "TimeOut"})) (clojure.core/contains? input :description) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-project-description (input :description)) #:http.request.field{:name "description", :shape "ProjectDescription"}))))

(clojure.core/defn- req-batch-delete-builds-input [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (ser-build-ids (input :ids)) #:http.request.field{:name "ids", :shape "BuildIds"})]}))

(clojure.core/defn- req-start-build-input [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (ser-non-empty-string (input :project-name)) #:http.request.field{:name "projectName", :shape "NonEmptyString"})]} (clojure.core/contains? input :report-build-status-override) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-wrapper-boolean (input :report-build-status-override)) #:http.request.field{:name "reportBuildStatusOverride", :shape "WrapperBoolean"})) (clojure.core/contains? input :source-version) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-string (input :source-version)) #:http.request.field{:name "sourceVersion", :shape "String"})) (clojure.core/contains? input :timeout-in-minutes-override) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-time-out (input :timeout-in-minutes-override)) #:http.request.field{:name "timeoutInMinutesOverride", :shape "TimeOut"})) (clojure.core/contains? input :image-pull-credentials-type-override) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-image-pull-credentials-type (input :image-pull-credentials-type-override)) #:http.request.field{:name "imagePullCredentialsTypeOverride", :shape "ImagePullCredentialsType"})) (clojure.core/contains? input :secondary-sources-override) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-project-sources (input :secondary-sources-override)) #:http.request.field{:name "secondarySourcesOverride", :shape "ProjectSources"})) (clojure.core/contains? input :artifacts-override) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-project-artifacts (input :artifacts-override)) #:http.request.field{:name "artifactsOverride", :shape "ProjectArtifacts"})) (clojure.core/contains? input :logs-config-override) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-logs-config (input :logs-config-override)) #:http.request.field{:name "logsConfigOverride", :shape "LogsConfig"})) (clojure.core/contains? input :secondary-artifacts-override) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-project-artifacts-list (input :secondary-artifacts-override)) #:http.request.field{:name "secondaryArtifactsOverride", :shape "ProjectArtifactsList"})) (clojure.core/contains? input :source-auth-override) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-source-auth (input :source-auth-override)) #:http.request.field{:name "sourceAuthOverride", :shape "SourceAuth"})) (clojure.core/contains? input :certificate-override) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-string (input :certificate-override)) #:http.request.field{:name "certificateOverride", :shape "String"})) (clojure.core/contains? input :git-clone-depth-override) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-git-clone-depth (input :git-clone-depth-override)) #:http.request.field{:name "gitCloneDepthOverride", :shape "GitCloneDepth"})) (clojure.core/contains? input :compute-type-override) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-compute-type (input :compute-type-override)) #:http.request.field{:name "computeTypeOverride", :shape "ComputeType"})) (clojure.core/contains? input :buildspec-override) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-string (input :buildspec-override)) #:http.request.field{:name "buildspecOverride", :shape "String"})) (clojure.core/contains? input :idempotency-token) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-string (input :idempotency-token)) #:http.request.field{:name "idempotencyToken", :shape "String"})) (clojure.core/contains? input :privileged-mode-override) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-wrapper-boolean (input :privileged-mode-override)) #:http.request.field{:name "privilegedModeOverride", :shape "WrapperBoolean"})) (clojure.core/contains? input :environment-variables-override) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-environment-variables (input :environment-variables-override)) #:http.request.field{:name "environmentVariablesOverride", :shape "EnvironmentVariables"})) (clojure.core/contains? input :cache-override) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-project-cache (input :cache-override)) #:http.request.field{:name "cacheOverride", :shape "ProjectCache"})) (clojure.core/contains? input :registry-credential-override) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-registry-credential (input :registry-credential-override)) #:http.request.field{:name "registryCredentialOverride", :shape "RegistryCredential"})) (clojure.core/contains? input :image-override) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-non-empty-string (input :image-override)) #:http.request.field{:name "imageOverride", :shape "NonEmptyString"})) (clojure.core/contains? input :environment-type-override) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-environment-type (input :environment-type-override)) #:http.request.field{:name "environmentTypeOverride", :shape "EnvironmentType"})) (clojure.core/contains? input :service-role-override) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-non-empty-string (input :service-role-override)) #:http.request.field{:name "serviceRoleOverride", :shape "NonEmptyString"})) (clojure.core/contains? input :source-location-override) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-string (input :source-location-override)) #:http.request.field{:name "sourceLocationOverride", :shape "String"})) (clojure.core/contains? input :queued-timeout-in-minutes-override) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-time-out (input :queued-timeout-in-minutes-override)) #:http.request.field{:name "queuedTimeoutInMinutesOverride", :shape "TimeOut"})) (clojure.core/contains? input :source-type-override) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-source-type (input :source-type-override)) #:http.request.field{:name "sourceTypeOverride", :shape "SourceType"})) (clojure.core/contains? input :insecure-ssl-override) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-wrapper-boolean (input :insecure-ssl-override)) #:http.request.field{:name "insecureSslOverride", :shape "WrapperBoolean"})) (clojure.core/contains? input :secondary-sources-version-override) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-project-secondary-source-versions (input :secondary-sources-version-override)) #:http.request.field{:name "secondarySourcesVersionOverride", :shape "ProjectSecondarySourceVersions"}))))

(clojure.core/defn- req-stop-build-input [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (ser-non-empty-string (input :id)) #:http.request.field{:name "id", :shape "NonEmptyString"})]}))

(clojure.core/defn- req-delete-webhook-input [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (ser-project-name (input :project-name)) #:http.request.field{:name "projectName", :shape "ProjectName"})]}))

(clojure.core/defn- req-create-project-input [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (ser-project-name (input :name)) #:http.request.field{:name "name", :shape "ProjectName"}) (clojure.core/into (ser-project-source (input :source)) #:http.request.field{:name "source", :shape "ProjectSource"}) (clojure.core/into (ser-project-artifacts (input :artifacts)) #:http.request.field{:name "artifacts", :shape "ProjectArtifacts"}) (clojure.core/into (ser-project-environment (input :environment)) #:http.request.field{:name "environment", :shape "ProjectEnvironment"}) (clojure.core/into (ser-non-empty-string (input :service-role)) #:http.request.field{:name "serviceRole", :shape "NonEmptyString"})]} (clojure.core/contains? input :vpc-config) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-vpc-config (input :vpc-config)) #:http.request.field{:name "vpcConfig", :shape "VpcConfig"})) (clojure.core/contains? input :badge-enabled) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-wrapper-boolean (input :badge-enabled)) #:http.request.field{:name "badgeEnabled", :shape "WrapperBoolean"})) (clojure.core/contains? input :secondary-sources) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-project-sources (input :secondary-sources)) #:http.request.field{:name "secondarySources", :shape "ProjectSources"})) (clojure.core/contains? input :tags) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-tag-list (input :tags)) #:http.request.field{:name "tags", :shape "TagList"})) (clojure.core/contains? input :cache) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-project-cache (input :cache)) #:http.request.field{:name "cache", :shape "ProjectCache"})) (clojure.core/contains? input :encryption-key) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-non-empty-string (input :encryption-key)) #:http.request.field{:name "encryptionKey", :shape "NonEmptyString"})) (clojure.core/contains? input :secondary-artifacts) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-project-artifacts-list (input :secondary-artifacts)) #:http.request.field{:name "secondaryArtifacts", :shape "ProjectArtifactsList"})) (clojure.core/contains? input :timeout-in-minutes) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-time-out (input :timeout-in-minutes)) #:http.request.field{:name "timeoutInMinutes", :shape "TimeOut"})) (clojure.core/contains? input :logs-config) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-logs-config (input :logs-config)) #:http.request.field{:name "logsConfig", :shape "LogsConfig"})) (clojure.core/contains? input :queued-timeout-in-minutes) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-time-out (input :queued-timeout-in-minutes)) #:http.request.field{:name "queuedTimeoutInMinutes", :shape "TimeOut"})) (clojure.core/contains? input :description) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-project-description (input :description)) #:http.request.field{:name "description", :shape "ProjectDescription"}))))

(clojure.core/defn- req-update-webhook-input [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (ser-project-name (input :project-name)) #:http.request.field{:name "projectName", :shape "ProjectName"})]} (clojure.core/contains? input :branch-filter) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-string (input :branch-filter)) #:http.request.field{:name "branchFilter", :shape "String"})) (clojure.core/contains? input :rotate-secret) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-boolean (input :rotate-secret)) #:http.request.field{:name "rotateSecret", :shape "Boolean"})) (clojure.core/contains? input :filter-groups) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-filter-groups (input :filter-groups)) #:http.request.field{:name "filterGroups", :shape "FilterGroups"}))))

(clojure.core/defn- req-list-builds-input [input] (clojure.core/cond-> {} (clojure.core/contains? input :sort-order) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-sort-order-type (input :sort-order)) #:http.request.field{:name "sortOrder", :shape "SortOrderType"})) (clojure.core/contains? input :next-token) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-string (input :next-token)) #:http.request.field{:name "nextToken", :shape "String"}))))

(clojure.core/defn- req-batch-get-builds-input [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (ser-build-ids (input :ids)) #:http.request.field{:name "ids", :shape "BuildIds"})]}))

(clojure.core/defn- req-list-builds-for-project-input [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (ser-non-empty-string (input :project-name)) #:http.request.field{:name "projectName", :shape "NonEmptyString"})]} (clojure.core/contains? input :sort-order) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-sort-order-type (input :sort-order)) #:http.request.field{:name "sortOrder", :shape "SortOrderType"})) (clojure.core/contains? input :next-token) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-string (input :next-token)) #:http.request.field{:name "nextToken", :shape "String"}))))

(clojure.core/declare deser-webhook-filter)

(clojure.core/declare deser-environment-language)

(clojure.core/declare deser-build-not-deleted)

(clojure.core/declare deser-webhook-filter-type)

(clojure.core/declare deser-environment-image)

(clojure.core/declare deser-project-badge)

(clojure.core/declare deser-build-artifacts-list)

(clojure.core/declare deser-artifact-namespace)

(clojure.core/declare deser-non-empty-string)

(clojure.core/declare deser-environment-type)

(clojure.core/declare deser-value-input)

(clojure.core/declare deser-security-group-ids)

(clojure.core/declare deser-artifact-packaging)

(clojure.core/declare deser-subnets)

(clojure.core/declare deser-build-phases)

(clojure.core/declare deser-wrapper-long)

(clojure.core/declare deser-environment-variables)

(clojure.core/declare deser-logs-location)

(clojure.core/declare deser-cloud-watch-logs-config)

(clojure.core/declare deser-project-source)

(clojure.core/declare deser-environment-languages)

(clojure.core/declare deser-platform-type)

(clojure.core/declare deser-server-type)

(clojure.core/declare deser-environment-images)

(clojure.core/declare deser-source-type)

(clojure.core/declare deser-credential-provider-type)

(clojure.core/declare deser-time-out)

(clojure.core/declare deser-project-cache-modes)

(clojure.core/declare deser-status-type)

(clojure.core/declare deser-image-versions)

(clojure.core/declare deser-project-environment)

(clojure.core/declare deser-project-sources)

(clojure.core/declare deser-image-pull-credentials-type)

(clojure.core/declare deser-tag-list)

(clojure.core/declare deser-registry-credential)

(clojure.core/declare deser-s-3-logs-config)

(clojure.core/declare deser-logs-config-status-type)

(clojure.core/declare deser-language-type)

(clojure.core/declare deser-project-names)

(clojure.core/declare deser-environment-variable)

(clojure.core/declare deser-key-input)

(clojure.core/declare deser-cache-mode)

(clojure.core/declare deser-build)

(clojure.core/declare deser-string)

(clojure.core/declare deser-source-auth)

(clojure.core/declare deser-project-description)

(clojure.core/declare deser-project)

(clojure.core/declare deser-network-interface)

(clojure.core/declare deser-project-cache)

(clojure.core/declare deser-cache-type)

(clojure.core/declare deser-wrapper-int)

(clojure.core/declare deser-environment-variable-type)

(clojure.core/declare deser-phase-context)

(clojure.core/declare deser-filter-groups)

(clojure.core/declare deser-vpc-config)

(clojure.core/declare deser-project-source-version)

(clojure.core/declare deser-timestamp)

(clojure.core/declare deser-source-auth-type)

(clojure.core/declare deser-wrapper-boolean)

(clojure.core/declare deser-build-phase-type)

(clojure.core/declare deser-auth-type)

(clojure.core/declare deser-build-artifacts)

(clojure.core/declare deser-tag)

(clojure.core/declare deser-builds)

(clojure.core/declare deser-compute-type)

(clojure.core/declare deser-projects)

(clojure.core/declare deser-filter-group)

(clojure.core/declare deser-project-name)

(clojure.core/declare deser-git-clone-depth)

(clojure.core/declare deser-build-ids)

(clojure.core/declare deser-build-phase)

(clojure.core/declare deser-project-artifacts-list)

(clojure.core/declare deser-builds-not-deleted)

(clojure.core/declare deser-source-credentials-info)

(clojure.core/declare deser-project-secondary-source-versions)

(clojure.core/declare deser-phase-contexts)

(clojure.core/declare deser-logs-config)

(clojure.core/declare deser-environment-platform)

(clojure.core/declare deser-artifacts-type)

(clojure.core/declare deser-environment-platforms)

(clojure.core/declare deser-project-artifacts)

(clojure.core/declare deser-boolean)

(clojure.core/declare deser-webhook)

(clojure.core/declare deser-source-credentials-infos)

(clojure.core/defn- deser-webhook-filter [input] (clojure.core/cond-> {:type (deser-webhook-filter-type (input "type")), :pattern (deser-string (input "pattern"))} (clojure.core/contains? input "excludeMatchedPattern") (clojure.core/assoc :exclude-matched-pattern (deser-wrapper-boolean (input "excludeMatchedPattern")))))

(clojure.core/defn- deser-environment-language [input] (clojure.core/cond-> {} (clojure.core/contains? input "language") (clojure.core/assoc :language (deser-language-type (input "language"))) (clojure.core/contains? input "images") (clojure.core/assoc :images (deser-environment-images (input "images")))))

(clojure.core/defn- deser-build-not-deleted [input] (clojure.core/cond-> {} (clojure.core/contains? input "id") (clojure.core/assoc :id (deser-non-empty-string (input "id"))) (clojure.core/contains? input "statusCode") (clojure.core/assoc :status-code (deser-string (input "statusCode")))))

(clojure.core/defn- deser-webhook-filter-type [input] (clojure.core/get {"EVENT" :event, "BASE_REF" :base-ref, "HEAD_REF" :head-ref, "ACTOR_ACCOUNT_ID" :actor-account-id, "FILE_PATH" :file-path} input))

(clojure.core/defn- deser-environment-image [input] (clojure.core/cond-> {} (clojure.core/contains? input "name") (clojure.core/assoc :name (deser-string (input "name"))) (clojure.core/contains? input "description") (clojure.core/assoc :description (deser-string (input "description"))) (clojure.core/contains? input "versions") (clojure.core/assoc :versions (deser-image-versions (input "versions")))))

(clojure.core/defn- deser-project-badge [input] (clojure.core/cond-> {} (clojure.core/contains? input "badgeEnabled") (clojure.core/assoc :badge-enabled (deser-boolean (input "badgeEnabled"))) (clojure.core/contains? input "badgeRequestUrl") (clojure.core/assoc :badge-request-url (deser-string (input "badgeRequestUrl")))))

(clojure.core/defn- deser-build-artifacts-list [input] (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (deser-build-artifacts coll))) input))

(clojure.core/defn- deser-artifact-namespace [input] (clojure.core/get {"NONE" :none, "BUILD_ID" :build-id} input))

(clojure.core/defn- deser-non-empty-string [input] input)

(clojure.core/defn- deser-environment-type [input] (clojure.core/get {"WINDOWS_CONTAINER" :windows-container, "LINUX_CONTAINER" :linux-container} input))

(clojure.core/defn- deser-value-input [input] input)

(clojure.core/defn- deser-security-group-ids [input] (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (deser-non-empty-string coll))) input))

(clojure.core/defn- deser-artifact-packaging [input] (clojure.core/get {"NONE" :none, "ZIP" :zip} input))

(clojure.core/defn- deser-subnets [input] (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (deser-non-empty-string coll))) input))

(clojure.core/defn- deser-build-phases [input] (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (deser-build-phase coll))) input))

(clojure.core/defn- deser-wrapper-long [input] input)

(clojure.core/defn- deser-environment-variables [input] (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (deser-environment-variable coll))) input))

(clojure.core/defn- deser-logs-location [input] (clojure.core/cond-> {} (clojure.core/contains? input "groupName") (clojure.core/assoc :group-name (deser-string (input "groupName"))) (clojure.core/contains? input "streamName") (clojure.core/assoc :stream-name (deser-string (input "streamName"))) (clojure.core/contains? input "deepLink") (clojure.core/assoc :deep-link (deser-string (input "deepLink"))) (clojure.core/contains? input "s3DeepLink") (clojure.core/assoc :s-3-deep-link (deser-string (input "s3DeepLink"))) (clojure.core/contains? input "cloudWatchLogs") (clojure.core/assoc :cloud-watch-logs (deser-cloud-watch-logs-config (input "cloudWatchLogs"))) (clojure.core/contains? input "s3Logs") (clojure.core/assoc :s-3-logs (deser-s-3-logs-config (input "s3Logs")))))

(clojure.core/defn- deser-cloud-watch-logs-config [input] (clojure.core/cond-> {:status (deser-logs-config-status-type (input "status"))} (clojure.core/contains? input "groupName") (clojure.core/assoc :group-name (deser-string (input "groupName"))) (clojure.core/contains? input "streamName") (clojure.core/assoc :stream-name (deser-string (input "streamName")))))

(clojure.core/defn- deser-project-source [input] (clojure.core/cond-> {:type (deser-source-type (input "type"))} (clojure.core/contains? input "location") (clojure.core/assoc :location (deser-string (input "location"))) (clojure.core/contains? input "gitCloneDepth") (clojure.core/assoc :git-clone-depth (deser-git-clone-depth (input "gitCloneDepth"))) (clojure.core/contains? input "buildspec") (clojure.core/assoc :buildspec (deser-string (input "buildspec"))) (clojure.core/contains? input "auth") (clojure.core/assoc :auth (deser-source-auth (input "auth"))) (clojure.core/contains? input "reportBuildStatus") (clojure.core/assoc :report-build-status (deser-wrapper-boolean (input "reportBuildStatus"))) (clojure.core/contains? input "insecureSsl") (clojure.core/assoc :insecure-ssl (deser-wrapper-boolean (input "insecureSsl"))) (clojure.core/contains? input "sourceIdentifier") (clojure.core/assoc :source-identifier (deser-string (input "sourceIdentifier")))))

(clojure.core/defn- deser-environment-languages [input] (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (deser-environment-language coll))) input))

(clojure.core/defn- deser-platform-type [input] (clojure.core/get {"DEBIAN" :debian, "AMAZON_LINUX" :amazon-linux, "UBUNTU" :ubuntu, "WINDOWS_SERVER" :windows-server} input))

(clojure.core/defn- deser-server-type [input] (clojure.core/get {"GITHUB" :github, "BITBUCKET" :bitbucket, "GITHUB_ENTERPRISE" :github-enterprise} input))

(clojure.core/defn- deser-environment-images [input] (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (deser-environment-image coll))) input))

(clojure.core/defn- deser-source-type [input] (clojure.core/get {"CODECOMMIT" :codecommit, "CODEPIPELINE" :codepipeline, "GITHUB" :github, "S3" :s-3, "BITBUCKET" :bitbucket, "GITHUB_ENTERPRISE" :github-enterprise, "NO_SOURCE" :no-source} input))

(clojure.core/defn- deser-credential-provider-type [input] (clojure.core/get {"SECRETS_MANAGER" :secrets-manager} input))

(clojure.core/defn- deser-time-out [input] input)

(clojure.core/defn- deser-project-cache-modes [input] (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (deser-cache-mode coll))) input))

(clojure.core/defn- deser-status-type [input] (clojure.core/get {"SUCCEEDED" :succeeded, "FAILED" :failed, "FAULT" :fault, "TIMED_OUT" :timed-out, "IN_PROGRESS" :in-progress, "STOPPED" :stopped} input))

(clojure.core/defn- deser-image-versions [input] (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (deser-string coll))) input))

(clojure.core/defn- deser-project-environment [input] (clojure.core/cond-> {:type (deser-environment-type (input "type")), :image (deser-non-empty-string (input "image")), :compute-type (deser-compute-type (input "computeType"))} (clojure.core/contains? input "environmentVariables") (clojure.core/assoc :environment-variables (deser-environment-variables (input "environmentVariables"))) (clojure.core/contains? input "privilegedMode") (clojure.core/assoc :privileged-mode (deser-wrapper-boolean (input "privilegedMode"))) (clojure.core/contains? input "certificate") (clojure.core/assoc :certificate (deser-string (input "certificate"))) (clojure.core/contains? input "registryCredential") (clojure.core/assoc :registry-credential (deser-registry-credential (input "registryCredential"))) (clojure.core/contains? input "imagePullCredentialsType") (clojure.core/assoc :image-pull-credentials-type (deser-image-pull-credentials-type (input "imagePullCredentialsType")))))

(clojure.core/defn- deser-project-sources [input] (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (deser-project-source coll))) input))

(clojure.core/defn- deser-image-pull-credentials-type [input] (clojure.core/get {"CODEBUILD" :codebuild, "SERVICE_ROLE" :service-role} input))

(clojure.core/defn- deser-tag-list [input] (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (deser-tag coll))) input))

(clojure.core/defn- deser-registry-credential [input] (clojure.core/cond-> {:credential (deser-non-empty-string (input "credential")), :credential-provider (deser-credential-provider-type (input "credentialProvider"))}))

(clojure.core/defn- deser-s-3-logs-config [input] (clojure.core/cond-> {:status (deser-logs-config-status-type (input "status"))} (clojure.core/contains? input "location") (clojure.core/assoc :location (deser-string (input "location")))))

(clojure.core/defn- deser-logs-config-status-type [input] (clojure.core/get {"ENABLED" :enabled, "DISABLED" :disabled} input))

(clojure.core/defn- deser-language-type [input] (clojure.core/get {"BASE" :base, "PHP" :php, "DOTNET" :dotnet, "GOLANG" :golang, "JAVA" :java, "DOCKER" :docker, "PYTHON" :python, "NODE_JS" :node-js, "RUBY" :ruby, "ANDROID" :android} input))

(clojure.core/defn- deser-project-names [input] (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (deser-non-empty-string coll))) input))

(clojure.core/defn- deser-environment-variable [input] (clojure.core/cond-> {:name (deser-non-empty-string (input "name")), :value (deser-string (input "value"))} (clojure.core/contains? input "type") (clojure.core/assoc :type (deser-environment-variable-type (input "type")))))

(clojure.core/defn- deser-key-input [input] input)

(clojure.core/defn- deser-cache-mode [input] (clojure.core/get {"LOCAL_DOCKER_LAYER_CACHE" :local-docker-layer-cache, "LOCAL_SOURCE_CACHE" :local-source-cache, "LOCAL_CUSTOM_CACHE" :local-custom-cache} input))

(clojure.core/defn- deser-build [input] (clojure.core/cond-> {} (clojure.core/contains? input "vpcConfig") (clojure.core/assoc :vpc-config (deser-vpc-config (input "vpcConfig"))) (clojure.core/contains? input "serviceRole") (clojure.core/assoc :service-role (deser-non-empty-string (input "serviceRole"))) (clojure.core/contains? input "sourceVersion") (clojure.core/assoc :source-version (deser-non-empty-string (input "sourceVersion"))) (clojure.core/contains? input "buildComplete") (clojure.core/assoc :build-complete (deser-boolean (input "buildComplete"))) (clojure.core/contains? input "secondarySourceVersions") (clojure.core/assoc :secondary-source-versions (deser-project-secondary-source-versions (input "secondarySourceVersions"))) (clojure.core/contains? input "artifacts") (clojure.core/assoc :artifacts (deser-build-artifacts (input "artifacts"))) (clojure.core/contains? input "arn") (clojure.core/assoc :arn (deser-non-empty-string (input "arn"))) (clojure.core/contains? input "networkInterface") (clojure.core/assoc :network-interface (deser-network-interface (input "networkInterface"))) (clojure.core/contains? input "secondarySources") (clojure.core/assoc :secondary-sources (deser-project-sources (input "secondarySources"))) (clojure.core/contains? input "id") (clojure.core/assoc :id (deser-non-empty-string (input "id"))) (clojure.core/contains? input "resolvedSourceVersion") (clojure.core/assoc :resolved-source-version (deser-non-empty-string (input "resolvedSourceVersion"))) (clojure.core/contains? input "cache") (clojure.core/assoc :cache (deser-project-cache (input "cache"))) (clojure.core/contains? input "startTime") (clojure.core/assoc :start-time (deser-timestamp (input "startTime"))) (clojure.core/contains? input "logs") (clojure.core/assoc :logs (deser-logs-location (input "logs"))) (clojure.core/contains? input "initiator") (clojure.core/assoc :initiator (deser-string (input "initiator"))) (clojure.core/contains? input "encryptionKey") (clojure.core/assoc :encryption-key (deser-non-empty-string (input "encryptionKey"))) (clojure.core/contains? input "source") (clojure.core/assoc :source (deser-project-source (input "source"))) (clojure.core/contains? input "environment") (clojure.core/assoc :environment (deser-project-environment (input "environment"))) (clojure.core/contains? input "secondaryArtifacts") (clojure.core/assoc :secondary-artifacts (deser-build-artifacts-list (input "secondaryArtifacts"))) (clojure.core/contains? input "currentPhase") (clojure.core/assoc :current-phase (deser-string (input "currentPhase"))) (clojure.core/contains? input "timeoutInMinutes") (clojure.core/assoc :timeout-in-minutes (deser-wrapper-int (input "timeoutInMinutes"))) (clojure.core/contains? input "endTime") (clojure.core/assoc :end-time (deser-timestamp (input "endTime"))) (clojure.core/contains? input "projectName") (clojure.core/assoc :project-name (deser-non-empty-string (input "projectName"))) (clojure.core/contains? input "queuedTimeoutInMinutes") (clojure.core/assoc :queued-timeout-in-minutes (deser-wrapper-int (input "queuedTimeoutInMinutes"))) (clojure.core/contains? input "buildStatus") (clojure.core/assoc :build-status (deser-status-type (input "buildStatus"))) (clojure.core/contains? input "phases") (clojure.core/assoc :phases (deser-build-phases (input "phases")))))

(clojure.core/defn- deser-string [input] input)

(clojure.core/defn- deser-source-auth [input] (clojure.core/cond-> {:type (deser-source-auth-type (input "type"))} (clojure.core/contains? input "resource") (clojure.core/assoc :resource (deser-string (input "resource")))))

(clojure.core/defn- deser-project-description [input] input)

(clojure.core/defn- deser-project [input] (clojure.core/cond-> {} (clojure.core/contains? input "vpcConfig") (clojure.core/assoc :vpc-config (deser-vpc-config (input "vpcConfig"))) (clojure.core/contains? input "serviceRole") (clojure.core/assoc :service-role (deser-non-empty-string (input "serviceRole"))) (clojure.core/contains? input "lastModified") (clojure.core/assoc :last-modified (deser-timestamp (input "lastModified"))) (clojure.core/contains? input "created") (clojure.core/assoc :created (deser-timestamp (input "created"))) (clojure.core/contains? input "artifacts") (clojure.core/assoc :artifacts (deser-project-artifacts (input "artifacts"))) (clojure.core/contains? input "arn") (clojure.core/assoc :arn (deser-string (input "arn"))) (clojure.core/contains? input "secondarySources") (clojure.core/assoc :secondary-sources (deser-project-sources (input "secondarySources"))) (clojure.core/contains? input "tags") (clojure.core/assoc :tags (deser-tag-list (input "tags"))) (clojure.core/contains? input "cache") (clojure.core/assoc :cache (deser-project-cache (input "cache"))) (clojure.core/contains? input "name") (clojure.core/assoc :name (deser-project-name (input "name"))) (clojure.core/contains? input "encryptionKey") (clojure.core/assoc :encryption-key (deser-non-empty-string (input "encryptionKey"))) (clojure.core/contains? input "source") (clojure.core/assoc :source (deser-project-source (input "source"))) (clojure.core/contains? input "environment") (clojure.core/assoc :environment (deser-project-environment (input "environment"))) (clojure.core/contains? input "secondaryArtifacts") (clojure.core/assoc :secondary-artifacts (deser-project-artifacts-list (input "secondaryArtifacts"))) (clojure.core/contains? input "timeoutInMinutes") (clojure.core/assoc :timeout-in-minutes (deser-time-out (input "timeoutInMinutes"))) (clojure.core/contains? input "webhook") (clojure.core/assoc :webhook (deser-webhook (input "webhook"))) (clojure.core/contains? input "logsConfig") (clojure.core/assoc :logs-config (deser-logs-config (input "logsConfig"))) (clojure.core/contains? input "queuedTimeoutInMinutes") (clojure.core/assoc :queued-timeout-in-minutes (deser-time-out (input "queuedTimeoutInMinutes"))) (clojure.core/contains? input "description") (clojure.core/assoc :description (deser-project-description (input "description"))) (clojure.core/contains? input "badge") (clojure.core/assoc :badge (deser-project-badge (input "badge")))))

(clojure.core/defn- deser-network-interface [input] (clojure.core/cond-> {} (clojure.core/contains? input "subnetId") (clojure.core/assoc :subnet-id (deser-non-empty-string (input "subnetId"))) (clojure.core/contains? input "networkInterfaceId") (clojure.core/assoc :network-interface-id (deser-non-empty-string (input "networkInterfaceId")))))

(clojure.core/defn- deser-project-cache [input] (clojure.core/cond-> {:type (deser-cache-type (input "type"))} (clojure.core/contains? input "location") (clojure.core/assoc :location (deser-string (input "location"))) (clojure.core/contains? input "modes") (clojure.core/assoc :modes (deser-project-cache-modes (input "modes")))))

(clojure.core/defn- deser-cache-type [input] (clojure.core/get {"NO_CACHE" :no-cache, "S3" :s-3, "LOCAL" :local} input))

(clojure.core/defn- deser-wrapper-int [input] input)

(clojure.core/defn- deser-environment-variable-type [input] (clojure.core/get {"PLAINTEXT" :plaintext, "PARAMETER_STORE" :parameter-store} input))

(clojure.core/defn- deser-phase-context [input] (clojure.core/cond-> {} (clojure.core/contains? input "statusCode") (clojure.core/assoc :status-code (deser-string (input "statusCode"))) (clojure.core/contains? input "message") (clojure.core/assoc :message (deser-string (input "message")))))

(clojure.core/defn- deser-filter-groups [input] (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (deser-filter-group coll))) input))

(clojure.core/defn- deser-vpc-config [input] (clojure.core/cond-> {} (clojure.core/contains? input "vpcId") (clojure.core/assoc :vpc-id (deser-non-empty-string (input "vpcId"))) (clojure.core/contains? input "subnets") (clojure.core/assoc :subnets (deser-subnets (input "subnets"))) (clojure.core/contains? input "securityGroupIds") (clojure.core/assoc :security-group-ids (deser-security-group-ids (input "securityGroupIds")))))

(clojure.core/defn- deser-project-source-version [input] (clojure.core/cond-> {:source-identifier (deser-string (input "sourceIdentifier")), :source-version (deser-string (input "sourceVersion"))}))

(clojure.core/defn- deser-timestamp [input] input)

(clojure.core/defn- deser-source-auth-type [input] (clojure.core/get {"OAUTH" :oauth} input))

(clojure.core/defn- deser-wrapper-boolean [input] input)

(clojure.core/defn- deser-build-phase-type [input] (clojure.core/get {"COMPLETED" :completed, "POST_BUILD" :post-build, "PROVISIONING" :provisioning, "SUBMITTED" :submitted, "UPLOAD_ARTIFACTS" :upload-artifacts, "QUEUED" :queued, "BUILD" :build, "DOWNLOAD_SOURCE" :download-source, "INSTALL" :install, "FINALIZING" :finalizing, "PRE_BUILD" :pre-build} input))

(clojure.core/defn- deser-auth-type [input] (clojure.core/get {"OAUTH" :oauth, "BASIC_AUTH" :basic-auth, "PERSONAL_ACCESS_TOKEN" :personal-access-token} input))

(clojure.core/defn- deser-build-artifacts [input] (clojure.core/cond-> {} (clojure.core/contains? input "location") (clojure.core/assoc :location (deser-string (input "location"))) (clojure.core/contains? input "sha256sum") (clojure.core/assoc :sha-256sum (deser-string (input "sha256sum"))) (clojure.core/contains? input "md5sum") (clojure.core/assoc :md-5sum (deser-string (input "md5sum"))) (clojure.core/contains? input "overrideArtifactName") (clojure.core/assoc :override-artifact-name (deser-wrapper-boolean (input "overrideArtifactName"))) (clojure.core/contains? input "encryptionDisabled") (clojure.core/assoc :encryption-disabled (deser-wrapper-boolean (input "encryptionDisabled"))) (clojure.core/contains? input "artifactIdentifier") (clojure.core/assoc :artifact-identifier (deser-string (input "artifactIdentifier")))))

(clojure.core/defn- deser-tag [input] (clojure.core/cond-> {} (clojure.core/contains? input "key") (clojure.core/assoc :key (deser-key-input (input "key"))) (clojure.core/contains? input "value") (clojure.core/assoc :value (deser-value-input (input "value")))))

(clojure.core/defn- deser-builds [input] (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (deser-build coll))) input))

(clojure.core/defn- deser-compute-type [input] (clojure.core/get {"BUILD_GENERAL1_SMALL" :build-general-1-small, "BUILD_GENERAL1_MEDIUM" :build-general-1-medium, "BUILD_GENERAL1_LARGE" :build-general-1-large} input))

(clojure.core/defn- deser-projects [input] (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (deser-project coll))) input))

(clojure.core/defn- deser-filter-group [input] (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (deser-webhook-filter coll))) input))

(clojure.core/defn- deser-project-name [input] input)

(clojure.core/defn- deser-git-clone-depth [input] input)

(clojure.core/defn- deser-build-ids [input] (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (deser-non-empty-string coll))) input))

(clojure.core/defn- deser-build-phase [input] (clojure.core/cond-> {} (clojure.core/contains? input "phaseType") (clojure.core/assoc :phase-type (deser-build-phase-type (input "phaseType"))) (clojure.core/contains? input "phaseStatus") (clojure.core/assoc :phase-status (deser-status-type (input "phaseStatus"))) (clojure.core/contains? input "startTime") (clojure.core/assoc :start-time (deser-timestamp (input "startTime"))) (clojure.core/contains? input "endTime") (clojure.core/assoc :end-time (deser-timestamp (input "endTime"))) (clojure.core/contains? input "durationInSeconds") (clojure.core/assoc :duration-in-seconds (deser-wrapper-long (input "durationInSeconds"))) (clojure.core/contains? input "contexts") (clojure.core/assoc :contexts (deser-phase-contexts (input "contexts")))))

(clojure.core/defn- deser-project-artifacts-list [input] (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (deser-project-artifacts coll))) input))

(clojure.core/defn- deser-builds-not-deleted [input] (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (deser-build-not-deleted coll))) input))

(clojure.core/defn- deser-source-credentials-info [input] (clojure.core/cond-> {} (clojure.core/contains? input "arn") (clojure.core/assoc :arn (deser-non-empty-string (input "arn"))) (clojure.core/contains? input "serverType") (clojure.core/assoc :server-type (deser-server-type (input "serverType"))) (clojure.core/contains? input "authType") (clojure.core/assoc :auth-type (deser-auth-type (input "authType")))))

(clojure.core/defn- deser-project-secondary-source-versions [input] (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (deser-project-source-version coll))) input))

(clojure.core/defn- deser-phase-contexts [input] (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (deser-phase-context coll))) input))

(clojure.core/defn- deser-logs-config [input] (clojure.core/cond-> {} (clojure.core/contains? input "cloudWatchLogs") (clojure.core/assoc :cloud-watch-logs (deser-cloud-watch-logs-config (input "cloudWatchLogs"))) (clojure.core/contains? input "s3Logs") (clojure.core/assoc :s-3-logs (deser-s-3-logs-config (input "s3Logs")))))

(clojure.core/defn- deser-environment-platform [input] (clojure.core/cond-> {} (clojure.core/contains? input "platform") (clojure.core/assoc :platform (deser-platform-type (input "platform"))) (clojure.core/contains? input "languages") (clojure.core/assoc :languages (deser-environment-languages (input "languages")))))

(clojure.core/defn- deser-artifacts-type [input] (clojure.core/get {"CODEPIPELINE" :codepipeline, "S3" :s-3, "NO_ARTIFACTS" :no-artifacts} input))

(clojure.core/defn- deser-environment-platforms [input] (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (deser-environment-platform coll))) input))

(clojure.core/defn- deser-project-artifacts [input] (clojure.core/cond-> {:type (deser-artifacts-type (input "type"))} (clojure.core/contains? input "overrideArtifactName") (clojure.core/assoc :override-artifact-name (deser-wrapper-boolean (input "overrideArtifactName"))) (clojure.core/contains? input "path") (clojure.core/assoc :path (deser-string (input "path"))) (clojure.core/contains? input "encryptionDisabled") (clojure.core/assoc :encryption-disabled (deser-wrapper-boolean (input "encryptionDisabled"))) (clojure.core/contains? input "packaging") (clojure.core/assoc :packaging (deser-artifact-packaging (input "packaging"))) (clojure.core/contains? input "name") (clojure.core/assoc :name (deser-string (input "name"))) (clojure.core/contains? input "location") (clojure.core/assoc :location (deser-string (input "location"))) (clojure.core/contains? input "namespaceType") (clojure.core/assoc :namespace-type (deser-artifact-namespace (input "namespaceType"))) (clojure.core/contains? input "artifactIdentifier") (clojure.core/assoc :artifact-identifier (deser-string (input "artifactIdentifier")))))

(clojure.core/defn- deser-boolean [input] input)

(clojure.core/defn- deser-webhook [input] (clojure.core/cond-> {} (clojure.core/contains? input "url") (clojure.core/assoc :url (deser-non-empty-string (input "url"))) (clojure.core/contains? input "payloadUrl") (clojure.core/assoc :payload-url (deser-non-empty-string (input "payloadUrl"))) (clojure.core/contains? input "secret") (clojure.core/assoc :secret (deser-non-empty-string (input "secret"))) (clojure.core/contains? input "branchFilter") (clojure.core/assoc :branch-filter (deser-string (input "branchFilter"))) (clojure.core/contains? input "filterGroups") (clojure.core/assoc :filter-groups (deser-filter-groups (input "filterGroups"))) (clojure.core/contains? input "lastModifiedSecret") (clojure.core/assoc :last-modified-secret (deser-timestamp (input "lastModifiedSecret")))))

(clojure.core/defn- deser-source-credentials-infos [input] (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (deser-source-credentials-info coll))) input))

(clojure.core/defn- response-update-webhook-output ([input] (response-update-webhook-output nil input)) ([resultWrapper1494127 input] (clojure.core/let [rawinput1494126 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar1494128 {"webhook" (rawinput1494126 "webhook")}] (clojure.core/cond-> {} (letvar1494128 "webhook") (clojure.core/assoc :webhook (deser-webhook (clojure.core/get-in letvar1494128 ["webhook"])))))))

(clojure.core/defn- response-start-build-output ([input] (response-start-build-output nil input)) ([resultWrapper1494130 input] (clojure.core/let [rawinput1494129 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar1494131 {"build" (rawinput1494129 "build")}] (clojure.core/cond-> {} (letvar1494131 "build") (clojure.core/assoc :build (deser-build (clojure.core/get-in letvar1494131 ["build"])))))))

(clojure.core/defn- response-create-project-output ([input] (response-create-project-output nil input)) ([resultWrapper1494133 input] (clojure.core/let [rawinput1494132 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar1494134 {"project" (rawinput1494132 "project")}] (clojure.core/cond-> {} (letvar1494134 "project") (clojure.core/assoc :project (deser-project (clojure.core/get-in letvar1494134 ["project"])))))))

(clojure.core/defn- response-list-curated-environment-images-output ([input] (response-list-curated-environment-images-output nil input)) ([resultWrapper1494136 input] (clojure.core/let [rawinput1494135 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar1494137 {"platforms" (rawinput1494135 "platforms")}] (clojure.core/cond-> {} (letvar1494137 "platforms") (clojure.core/assoc :platforms (deser-environment-platforms (clojure.core/get-in letvar1494137 ["platforms"])))))))

(clojure.core/defn- response-invalidate-project-cache-output ([input] (response-invalidate-project-cache-output nil input)) ([resultWrapper1494139 input] (clojure.core/let [rawinput1494138 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar1494140 {}] (clojure.core/cond-> {}))))

(clojure.core/defn- response-batch-delete-builds-output ([input] (response-batch-delete-builds-output nil input)) ([resultWrapper1494142 input] (clojure.core/let [rawinput1494141 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar1494143 {"buildsDeleted" (rawinput1494141 "buildsDeleted"), "buildsNotDeleted" (rawinput1494141 "buildsNotDeleted")}] (clojure.core/cond-> {} (letvar1494143 "buildsDeleted") (clojure.core/assoc :builds-deleted (deser-build-ids (clojure.core/get-in letvar1494143 ["buildsDeleted"]))) (letvar1494143 "buildsNotDeleted") (clojure.core/assoc :builds-not-deleted (deser-builds-not-deleted (clojure.core/get-in letvar1494143 ["buildsNotDeleted"])))))))

(clojure.core/defn- response-account-limit-exceeded-exception ([input] (response-account-limit-exceeded-exception nil input)) ([resultWrapper1494145 input] (clojure.core/let [rawinput1494144 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar1494146 {}] (clojure.core/cond-> {}))))

(clojure.core/defn- response-batch-get-projects-output ([input] (response-batch-get-projects-output nil input)) ([resultWrapper1494148 input] (clojure.core/let [rawinput1494147 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar1494149 {"projects" (rawinput1494147 "projects"), "projectsNotFound" (rawinput1494147 "projectsNotFound")}] (clojure.core/cond-> {} (letvar1494149 "projects") (clojure.core/assoc :projects (deser-projects (clojure.core/get-in letvar1494149 ["projects"]))) (letvar1494149 "projectsNotFound") (clojure.core/assoc :projects-not-found (deser-project-names (clojure.core/get-in letvar1494149 ["projectsNotFound"])))))))

(clojure.core/defn- response-list-source-credentials-output ([input] (response-list-source-credentials-output nil input)) ([resultWrapper1494151 input] (clojure.core/let [rawinput1494150 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar1494152 {"sourceCredentialsInfos" (rawinput1494150 "sourceCredentialsInfos")}] (clojure.core/cond-> {} (letvar1494152 "sourceCredentialsInfos") (clojure.core/assoc :source-credentials-infos (deser-source-credentials-infos (clojure.core/get-in letvar1494152 ["sourceCredentialsInfos"])))))))

(clojure.core/defn- response-resource-already-exists-exception ([input] (response-resource-already-exists-exception nil input)) ([resultWrapper1494154 input] (clojure.core/let [rawinput1494153 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar1494155 {}] (clojure.core/cond-> {}))))

(clojure.core/defn- response-delete-source-credentials-output ([input] (response-delete-source-credentials-output nil input)) ([resultWrapper1494157 input] (clojure.core/let [rawinput1494156 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar1494158 {"arn" (rawinput1494156 "arn")}] (clojure.core/cond-> {} (letvar1494158 "arn") (clojure.core/assoc :arn (deser-non-empty-string (clojure.core/get-in letvar1494158 ["arn"])))))))

(clojure.core/defn- response-batch-get-builds-output ([input] (response-batch-get-builds-output nil input)) ([resultWrapper1494160 input] (clojure.core/let [rawinput1494159 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar1494161 {"builds" (rawinput1494159 "builds"), "buildsNotFound" (rawinput1494159 "buildsNotFound")}] (clojure.core/cond-> {} (letvar1494161 "builds") (clojure.core/assoc :builds (deser-builds (clojure.core/get-in letvar1494161 ["builds"]))) (letvar1494161 "buildsNotFound") (clojure.core/assoc :builds-not-found (deser-build-ids (clojure.core/get-in letvar1494161 ["buildsNotFound"])))))))

(clojure.core/defn- response-list-builds-output ([input] (response-list-builds-output nil input)) ([resultWrapper1494163 input] (clojure.core/let [rawinput1494162 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar1494164 {"ids" (rawinput1494162 "ids"), "nextToken" (rawinput1494162 "nextToken")}] (clojure.core/cond-> {} (letvar1494164 "ids") (clojure.core/assoc :ids (deser-build-ids (clojure.core/get-in letvar1494164 ["ids"]))) (letvar1494164 "nextToken") (clojure.core/assoc :next-token (deser-string (clojure.core/get-in letvar1494164 ["nextToken"])))))))

(clojure.core/defn- response-list-projects-output ([input] (response-list-projects-output nil input)) ([resultWrapper1494166 input] (clojure.core/let [rawinput1494165 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar1494167 {"nextToken" (rawinput1494165 "nextToken"), "projects" (rawinput1494165 "projects")}] (clojure.core/cond-> {} (letvar1494167 "nextToken") (clojure.core/assoc :next-token (deser-string (clojure.core/get-in letvar1494167 ["nextToken"]))) (letvar1494167 "projects") (clojure.core/assoc :projects (deser-project-names (clojure.core/get-in letvar1494167 ["projects"])))))))

(clojure.core/defn- response-import-source-credentials-output ([input] (response-import-source-credentials-output nil input)) ([resultWrapper1494169 input] (clojure.core/let [rawinput1494168 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar1494170 {"arn" (rawinput1494168 "arn")}] (clojure.core/cond-> {} (letvar1494170 "arn") (clojure.core/assoc :arn (deser-non-empty-string (clojure.core/get-in letvar1494170 ["arn"])))))))

(clojure.core/defn- response-o-auth-provider-exception ([input] (response-o-auth-provider-exception nil input)) ([resultWrapper1494172 input] (clojure.core/let [rawinput1494171 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar1494173 {}] (clojure.core/cond-> {}))))

(clojure.core/defn- response-resource-not-found-exception ([input] (response-resource-not-found-exception nil input)) ([resultWrapper1494175 input] (clojure.core/let [rawinput1494174 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar1494176 {}] (clojure.core/cond-> {}))))

(clojure.core/defn- response-delete-webhook-output ([input] (response-delete-webhook-output nil input)) ([resultWrapper1494178 input] (clojure.core/let [rawinput1494177 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar1494179 {}] (clojure.core/cond-> {}))))

(clojure.core/defn- response-invalid-input-exception ([input] (response-invalid-input-exception nil input)) ([resultWrapper1494181 input] (clojure.core/let [rawinput1494180 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar1494182 {}] (clojure.core/cond-> {}))))

(clojure.core/defn- response-delete-project-output ([input] (response-delete-project-output nil input)) ([resultWrapper1494184 input] (clojure.core/let [rawinput1494183 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar1494185 {}] (clojure.core/cond-> {}))))

(clojure.core/defn- response-create-webhook-output ([input] (response-create-webhook-output nil input)) ([resultWrapper1494187 input] (clojure.core/let [rawinput1494186 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar1494188 {"webhook" (rawinput1494186 "webhook")}] (clojure.core/cond-> {} (letvar1494188 "webhook") (clojure.core/assoc :webhook (deser-webhook (clojure.core/get-in letvar1494188 ["webhook"])))))))

(clojure.core/defn- response-list-builds-for-project-output ([input] (response-list-builds-for-project-output nil input)) ([resultWrapper1494190 input] (clojure.core/let [rawinput1494189 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar1494191 {"ids" (rawinput1494189 "ids"), "nextToken" (rawinput1494189 "nextToken")}] (clojure.core/cond-> {} (letvar1494191 "ids") (clojure.core/assoc :ids (deser-build-ids (clojure.core/get-in letvar1494191 ["ids"]))) (letvar1494191 "nextToken") (clojure.core/assoc :next-token (deser-string (clojure.core/get-in letvar1494191 ["nextToken"])))))))

(clojure.core/defn- response-update-project-output ([input] (response-update-project-output nil input)) ([resultWrapper1494193 input] (clojure.core/let [rawinput1494192 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar1494194 {"project" (rawinput1494192 "project")}] (clojure.core/cond-> {} (letvar1494194 "project") (clojure.core/assoc :project (deser-project (clojure.core/get-in letvar1494194 ["project"])))))))

(clojure.core/defn- response-stop-build-output ([input] (response-stop-build-output nil input)) ([resultWrapper1494196 input] (clojure.core/let [rawinput1494195 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar1494197 {"build" (rawinput1494195 "build")}] (clojure.core/cond-> {} (letvar1494197 "build") (clojure.core/assoc :build (deser-build (clojure.core/get-in letvar1494197 ["build"])))))))

(clojure.spec.alpha/def :portkey.aws.codebuild.-2016-10-06.webhook-filter/type (clojure.spec.alpha/and :portkey.aws.codebuild.-2016-10-06/webhook-filter-type))
(clojure.spec.alpha/def :portkey.aws.codebuild.-2016-10-06.webhook-filter/pattern (clojure.spec.alpha/and :portkey.aws.codebuild.-2016-10-06/string))
(clojure.spec.alpha/def :portkey.aws.codebuild.-2016-10-06.webhook-filter/exclude-matched-pattern (clojure.spec.alpha/and :portkey.aws.codebuild.-2016-10-06/wrapper-boolean))
(clojure.spec.alpha/def :portkey.aws.codebuild.-2016-10-06/webhook-filter (clojure.spec.alpha/keys :req-un [:portkey.aws.codebuild.-2016-10-06.webhook-filter/type :portkey.aws.codebuild.-2016-10-06.webhook-filter/pattern] :opt-un [:portkey.aws.codebuild.-2016-10-06.webhook-filter/exclude-matched-pattern]))

(clojure.spec.alpha/def :portkey.aws.codebuild.-2016-10-06.environment-language/language (clojure.spec.alpha/and :portkey.aws.codebuild.-2016-10-06/language-type))
(clojure.spec.alpha/def :portkey.aws.codebuild.-2016-10-06.environment-language/images (clojure.spec.alpha/and :portkey.aws.codebuild.-2016-10-06/environment-images))
(clojure.spec.alpha/def :portkey.aws.codebuild.-2016-10-06/environment-language (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.codebuild.-2016-10-06.environment-language/language :portkey.aws.codebuild.-2016-10-06.environment-language/images]))

(clojure.spec.alpha/def :portkey.aws.codebuild.-2016-10-06.update-webhook-output/webhook (clojure.spec.alpha/and :portkey.aws.codebuild.-2016-10-06/webhook))
(clojure.spec.alpha/def :portkey.aws.codebuild.-2016-10-06/update-webhook-output (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.codebuild.-2016-10-06.update-webhook-output/webhook]))

(clojure.spec.alpha/def :portkey.aws.codebuild.-2016-10-06.build-not-deleted/id (clojure.spec.alpha/and :portkey.aws.codebuild.-2016-10-06/non-empty-string))
(clojure.spec.alpha/def :portkey.aws.codebuild.-2016-10-06.build-not-deleted/status-code (clojure.spec.alpha/and :portkey.aws.codebuild.-2016-10-06/string))
(clojure.spec.alpha/def :portkey.aws.codebuild.-2016-10-06/build-not-deleted (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.codebuild.-2016-10-06.build-not-deleted/id :portkey.aws.codebuild.-2016-10-06.build-not-deleted/status-code]))

(clojure.spec.alpha/def :portkey.aws.codebuild.-2016-10-06/webhook-filter-type #{"FILE_PATH" :base-ref "BASE_REF" "EVENT" :event "HEAD_REF" :file-path :actor-account-id "ACTOR_ACCOUNT_ID" :head-ref})

(clojure.spec.alpha/def :portkey.aws.codebuild.-2016-10-06.batch-get-projects-input/names (clojure.spec.alpha/and :portkey.aws.codebuild.-2016-10-06/project-names))
(clojure.spec.alpha/def :portkey.aws.codebuild.-2016-10-06/batch-get-projects-input (clojure.spec.alpha/keys :req-un [:portkey.aws.codebuild.-2016-10-06.batch-get-projects-input/names] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.codebuild.-2016-10-06.delete-source-credentials-input/arn (clojure.spec.alpha/and :portkey.aws.codebuild.-2016-10-06/non-empty-string))
(clojure.spec.alpha/def :portkey.aws.codebuild.-2016-10-06/delete-source-credentials-input (clojure.spec.alpha/keys :req-un [:portkey.aws.codebuild.-2016-10-06.delete-source-credentials-input/arn] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.codebuild.-2016-10-06.environment-image/name (clojure.spec.alpha/and :portkey.aws.codebuild.-2016-10-06/string))
(clojure.spec.alpha/def :portkey.aws.codebuild.-2016-10-06.environment-image/description (clojure.spec.alpha/and :portkey.aws.codebuild.-2016-10-06/string))
(clojure.spec.alpha/def :portkey.aws.codebuild.-2016-10-06.environment-image/versions (clojure.spec.alpha/and :portkey.aws.codebuild.-2016-10-06/image-versions))
(clojure.spec.alpha/def :portkey.aws.codebuild.-2016-10-06/environment-image (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.codebuild.-2016-10-06.environment-image/name :portkey.aws.codebuild.-2016-10-06.environment-image/description :portkey.aws.codebuild.-2016-10-06.environment-image/versions]))

(clojure.spec.alpha/def :portkey.aws.codebuild.-2016-10-06.project-badge/badge-enabled (clojure.spec.alpha/and :portkey.aws.codebuild.-2016-10-06/boolean))
(clojure.spec.alpha/def :portkey.aws.codebuild.-2016-10-06.project-badge/badge-request-url (clojure.spec.alpha/and :portkey.aws.codebuild.-2016-10-06/string))
(clojure.spec.alpha/def :portkey.aws.codebuild.-2016-10-06/project-badge (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.codebuild.-2016-10-06.project-badge/badge-enabled :portkey.aws.codebuild.-2016-10-06.project-badge/badge-request-url]))

(clojure.spec.alpha/def :portkey.aws.codebuild.-2016-10-06.start-build-output/build (clojure.spec.alpha/and :portkey.aws.codebuild.-2016-10-06/build))
(clojure.spec.alpha/def :portkey.aws.codebuild.-2016-10-06/start-build-output (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.codebuild.-2016-10-06.start-build-output/build]))

(clojure.spec.alpha/def :portkey.aws.codebuild.-2016-10-06/build-artifacts-list (clojure.spec.alpha/coll-of :portkey.aws.codebuild.-2016-10-06/build-artifacts :min-count 0 :max-count 12))

(clojure.spec.alpha/def :portkey.aws.codebuild.-2016-10-06/artifact-namespace #{"BUILD_ID" "NONE" :build-id :none})

(clojure.spec.alpha/def :portkey.aws.codebuild.-2016-10-06/non-empty-string (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__1410938__auto__] (clojure.core/<= 1 (clojure.core/count s__1410938__auto__)))))

(clojure.spec.alpha/def :portkey.aws.codebuild.-2016-10-06.create-project-output/project (clojure.spec.alpha/and :portkey.aws.codebuild.-2016-10-06/project))
(clojure.spec.alpha/def :portkey.aws.codebuild.-2016-10-06/create-project-output (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.codebuild.-2016-10-06.create-project-output/project]))

(clojure.spec.alpha/def :portkey.aws.codebuild.-2016-10-06/environment-type #{:linux-container "WINDOWS_CONTAINER" "LINUX_CONTAINER" :windows-container})

(clojure.spec.alpha/def :portkey.aws.codebuild.-2016-10-06/value-input (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__1410938__auto__] (clojure.core/<= 1 (clojure.core/count s__1410938__auto__))) (clojure.core/fn [s__1410939__auto__] (clojure.core/< (clojure.core/count s__1410939__auto__) 255)) (clojure.core/fn [s__1410940__auto__] (clojure.core/re-matches #"^([\\p{L}\\p{Z}\\p{N}_.:/=@+\\-]*)$" s__1410940__auto__))))

(clojure.spec.alpha/def :portkey.aws.codebuild.-2016-10-06.create-webhook-input/project-name (clojure.spec.alpha/and :portkey.aws.codebuild.-2016-10-06/project-name))
(clojure.spec.alpha/def :portkey.aws.codebuild.-2016-10-06.create-webhook-input/branch-filter (clojure.spec.alpha/and :portkey.aws.codebuild.-2016-10-06/string))
(clojure.spec.alpha/def :portkey.aws.codebuild.-2016-10-06.create-webhook-input/filter-groups (clojure.spec.alpha/and :portkey.aws.codebuild.-2016-10-06/filter-groups))
(clojure.spec.alpha/def :portkey.aws.codebuild.-2016-10-06/create-webhook-input (clojure.spec.alpha/keys :req-un [:portkey.aws.codebuild.-2016-10-06.create-webhook-input/project-name] :opt-un [:portkey.aws.codebuild.-2016-10-06.create-webhook-input/branch-filter :portkey.aws.codebuild.-2016-10-06.create-webhook-input/filter-groups]))

(clojure.spec.alpha/def :portkey.aws.codebuild.-2016-10-06/security-group-ids (clojure.spec.alpha/coll-of :portkey.aws.codebuild.-2016-10-06/non-empty-string :max-count 5))

(clojure.spec.alpha/def :portkey.aws.codebuild.-2016-10-06.list-curated-environment-images-output/platforms (clojure.spec.alpha/and :portkey.aws.codebuild.-2016-10-06/environment-platforms))
(clojure.spec.alpha/def :portkey.aws.codebuild.-2016-10-06/list-curated-environment-images-output (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.codebuild.-2016-10-06.list-curated-environment-images-output/platforms]))

(clojure.spec.alpha/def :portkey.aws.codebuild.-2016-10-06/invalidate-project-cache-output (clojure.spec.alpha/keys :req-un [] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.codebuild.-2016-10-06.import-source-credentials-input/username (clojure.spec.alpha/and :portkey.aws.codebuild.-2016-10-06/non-empty-string))
(clojure.spec.alpha/def :portkey.aws.codebuild.-2016-10-06.import-source-credentials-input/token (clojure.spec.alpha/and :portkey.aws.codebuild.-2016-10-06/sensitive-non-empty-string))
(clojure.spec.alpha/def :portkey.aws.codebuild.-2016-10-06.import-source-credentials-input/server-type (clojure.spec.alpha/and :portkey.aws.codebuild.-2016-10-06/server-type))
(clojure.spec.alpha/def :portkey.aws.codebuild.-2016-10-06.import-source-credentials-input/auth-type (clojure.spec.alpha/and :portkey.aws.codebuild.-2016-10-06/auth-type))
(clojure.spec.alpha/def :portkey.aws.codebuild.-2016-10-06/import-source-credentials-input (clojure.spec.alpha/keys :req-un [:portkey.aws.codebuild.-2016-10-06.import-source-credentials-input/token :portkey.aws.codebuild.-2016-10-06.import-source-credentials-input/server-type :portkey.aws.codebuild.-2016-10-06.import-source-credentials-input/auth-type] :opt-un [:portkey.aws.codebuild.-2016-10-06.import-source-credentials-input/username]))

(clojure.spec.alpha/def :portkey.aws.codebuild.-2016-10-06/artifact-packaging #{"ZIP" "NONE" :zip :none})

(clojure.spec.alpha/def :portkey.aws.codebuild.-2016-10-06/subnets (clojure.spec.alpha/coll-of :portkey.aws.codebuild.-2016-10-06/non-empty-string :max-count 16))

(clojure.spec.alpha/def :portkey.aws.codebuild.-2016-10-06/build-phases (clojure.spec.alpha/coll-of :portkey.aws.codebuild.-2016-10-06/build-phase))

(clojure.spec.alpha/def :portkey.aws.codebuild.-2016-10-06.batch-delete-builds-output/builds-deleted (clojure.spec.alpha/and :portkey.aws.codebuild.-2016-10-06/build-ids))
(clojure.spec.alpha/def :portkey.aws.codebuild.-2016-10-06.batch-delete-builds-output/builds-not-deleted (clojure.spec.alpha/and :portkey.aws.codebuild.-2016-10-06/builds-not-deleted))
(clojure.spec.alpha/def :portkey.aws.codebuild.-2016-10-06/batch-delete-builds-output (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.codebuild.-2016-10-06.batch-delete-builds-output/builds-deleted :portkey.aws.codebuild.-2016-10-06.batch-delete-builds-output/builds-not-deleted]))

(clojure.spec.alpha/def :portkey.aws.codebuild.-2016-10-06/wrapper-long clojure.core/int?)

(clojure.spec.alpha/def :portkey.aws.codebuild.-2016-10-06/environment-variables (clojure.spec.alpha/coll-of :portkey.aws.codebuild.-2016-10-06/environment-variable))

(clojure.spec.alpha/def :portkey.aws.codebuild.-2016-10-06/account-limit-exceeded-exception (clojure.spec.alpha/keys :req-un [] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.codebuild.-2016-10-06.logs-location/group-name (clojure.spec.alpha/and :portkey.aws.codebuild.-2016-10-06/string))
(clojure.spec.alpha/def :portkey.aws.codebuild.-2016-10-06.logs-location/stream-name (clojure.spec.alpha/and :portkey.aws.codebuild.-2016-10-06/string))
(clojure.spec.alpha/def :portkey.aws.codebuild.-2016-10-06.logs-location/deep-link (clojure.spec.alpha/and :portkey.aws.codebuild.-2016-10-06/string))
(clojure.spec.alpha/def :portkey.aws.codebuild.-2016-10-06.logs-location/s-3-deep-link (clojure.spec.alpha/and :portkey.aws.codebuild.-2016-10-06/string))
(clojure.spec.alpha/def :portkey.aws.codebuild.-2016-10-06.logs-location/cloud-watch-logs (clojure.spec.alpha/and :portkey.aws.codebuild.-2016-10-06/cloud-watch-logs-config))
(clojure.spec.alpha/def :portkey.aws.codebuild.-2016-10-06.logs-location/s-3-logs (clojure.spec.alpha/and :portkey.aws.codebuild.-2016-10-06/s-3-logs-config))
(clojure.spec.alpha/def :portkey.aws.codebuild.-2016-10-06/logs-location (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.codebuild.-2016-10-06.logs-location/group-name :portkey.aws.codebuild.-2016-10-06.logs-location/stream-name :portkey.aws.codebuild.-2016-10-06.logs-location/deep-link :portkey.aws.codebuild.-2016-10-06.logs-location/s-3-deep-link :portkey.aws.codebuild.-2016-10-06.logs-location/cloud-watch-logs :portkey.aws.codebuild.-2016-10-06.logs-location/s-3-logs]))

(clojure.spec.alpha/def :portkey.aws.codebuild.-2016-10-06.delete-project-input/name (clojure.spec.alpha/and :portkey.aws.codebuild.-2016-10-06/non-empty-string))
(clojure.spec.alpha/def :portkey.aws.codebuild.-2016-10-06/delete-project-input (clojure.spec.alpha/keys :req-un [:portkey.aws.codebuild.-2016-10-06.delete-project-input/name] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.codebuild.-2016-10-06.cloud-watch-logs-config/status (clojure.spec.alpha/and :portkey.aws.codebuild.-2016-10-06/logs-config-status-type))
(clojure.spec.alpha/def :portkey.aws.codebuild.-2016-10-06.cloud-watch-logs-config/group-name (clojure.spec.alpha/and :portkey.aws.codebuild.-2016-10-06/string))
(clojure.spec.alpha/def :portkey.aws.codebuild.-2016-10-06.cloud-watch-logs-config/stream-name (clojure.spec.alpha/and :portkey.aws.codebuild.-2016-10-06/string))
(clojure.spec.alpha/def :portkey.aws.codebuild.-2016-10-06/cloud-watch-logs-config (clojure.spec.alpha/keys :req-un [:portkey.aws.codebuild.-2016-10-06.cloud-watch-logs-config/status] :opt-un [:portkey.aws.codebuild.-2016-10-06.cloud-watch-logs-config/group-name :portkey.aws.codebuild.-2016-10-06.cloud-watch-logs-config/stream-name]))

(clojure.spec.alpha/def :portkey.aws.codebuild.-2016-10-06.project-source/type (clojure.spec.alpha/and :portkey.aws.codebuild.-2016-10-06/source-type))
(clojure.spec.alpha/def :portkey.aws.codebuild.-2016-10-06.project-source/location (clojure.spec.alpha/and :portkey.aws.codebuild.-2016-10-06/string))
(clojure.spec.alpha/def :portkey.aws.codebuild.-2016-10-06.project-source/git-clone-depth (clojure.spec.alpha/and :portkey.aws.codebuild.-2016-10-06/git-clone-depth))
(clojure.spec.alpha/def :portkey.aws.codebuild.-2016-10-06.project-source/buildspec (clojure.spec.alpha/and :portkey.aws.codebuild.-2016-10-06/string))
(clojure.spec.alpha/def :portkey.aws.codebuild.-2016-10-06.project-source/auth (clojure.spec.alpha/and :portkey.aws.codebuild.-2016-10-06/source-auth))
(clojure.spec.alpha/def :portkey.aws.codebuild.-2016-10-06.project-source/report-build-status (clojure.spec.alpha/and :portkey.aws.codebuild.-2016-10-06/wrapper-boolean))
(clojure.spec.alpha/def :portkey.aws.codebuild.-2016-10-06.project-source/insecure-ssl (clojure.spec.alpha/and :portkey.aws.codebuild.-2016-10-06/wrapper-boolean))
(clojure.spec.alpha/def :portkey.aws.codebuild.-2016-10-06.project-source/source-identifier (clojure.spec.alpha/and :portkey.aws.codebuild.-2016-10-06/string))
(clojure.spec.alpha/def :portkey.aws.codebuild.-2016-10-06/project-source (clojure.spec.alpha/keys :req-un [:portkey.aws.codebuild.-2016-10-06.project-source/type] :opt-un [:portkey.aws.codebuild.-2016-10-06.project-source/location :portkey.aws.codebuild.-2016-10-06.project-source/git-clone-depth :portkey.aws.codebuild.-2016-10-06.project-source/buildspec :portkey.aws.codebuild.-2016-10-06.project-source/auth :portkey.aws.codebuild.-2016-10-06.project-source/report-build-status :portkey.aws.codebuild.-2016-10-06.project-source/insecure-ssl :portkey.aws.codebuild.-2016-10-06.project-source/source-identifier]))

(clojure.spec.alpha/def :portkey.aws.codebuild.-2016-10-06.invalidate-project-cache-input/project-name (clojure.spec.alpha/and :portkey.aws.codebuild.-2016-10-06/non-empty-string))
(clojure.spec.alpha/def :portkey.aws.codebuild.-2016-10-06/invalidate-project-cache-input (clojure.spec.alpha/keys :req-un [:portkey.aws.codebuild.-2016-10-06.invalidate-project-cache-input/project-name] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.codebuild.-2016-10-06.list-projects-input/sort-by (clojure.spec.alpha/and :portkey.aws.codebuild.-2016-10-06/project-sort-by-type))
(clojure.spec.alpha/def :portkey.aws.codebuild.-2016-10-06.list-projects-input/sort-order (clojure.spec.alpha/and :portkey.aws.codebuild.-2016-10-06/sort-order-type))
(clojure.spec.alpha/def :portkey.aws.codebuild.-2016-10-06.list-projects-input/next-token (clojure.spec.alpha/and :portkey.aws.codebuild.-2016-10-06/non-empty-string))
(clojure.spec.alpha/def :portkey.aws.codebuild.-2016-10-06/list-projects-input (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.codebuild.-2016-10-06.list-projects-input/sort-by :portkey.aws.codebuild.-2016-10-06.list-projects-input/sort-order :portkey.aws.codebuild.-2016-10-06.list-projects-input/next-token]))

(clojure.spec.alpha/def :portkey.aws.codebuild.-2016-10-06/environment-languages (clojure.spec.alpha/coll-of :portkey.aws.codebuild.-2016-10-06/environment-language))

(clojure.spec.alpha/def :portkey.aws.codebuild.-2016-10-06/platform-type #{"WINDOWS_SERVER" :windows-server "AMAZON_LINUX" "UBUNTU" :debian "DEBIAN" :amazon-linux :ubuntu})

(clojure.spec.alpha/def :portkey.aws.codebuild.-2016-10-06.batch-get-projects-output/projects (clojure.spec.alpha/and :portkey.aws.codebuild.-2016-10-06/projects))
(clojure.spec.alpha/def :portkey.aws.codebuild.-2016-10-06.batch-get-projects-output/projects-not-found (clojure.spec.alpha/and :portkey.aws.codebuild.-2016-10-06/project-names))
(clojure.spec.alpha/def :portkey.aws.codebuild.-2016-10-06/batch-get-projects-output (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.codebuild.-2016-10-06.batch-get-projects-output/projects :portkey.aws.codebuild.-2016-10-06.batch-get-projects-output/projects-not-found]))

(clojure.spec.alpha/def :portkey.aws.codebuild.-2016-10-06/server-type #{:github :bitbucket "GITHUB_ENTERPRISE" "BITBUCKET" "GITHUB" :github-enterprise})

(clojure.spec.alpha/def :portkey.aws.codebuild.-2016-10-06.list-source-credentials-output/source-credentials-infos (clojure.spec.alpha/and :portkey.aws.codebuild.-2016-10-06/source-credentials-infos))
(clojure.spec.alpha/def :portkey.aws.codebuild.-2016-10-06/list-source-credentials-output (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.codebuild.-2016-10-06.list-source-credentials-output/source-credentials-infos]))

(clojure.spec.alpha/def :portkey.aws.codebuild.-2016-10-06/environment-images (clojure.spec.alpha/coll-of :portkey.aws.codebuild.-2016-10-06/environment-image))

(clojure.spec.alpha/def :portkey.aws.codebuild.-2016-10-06/resource-already-exists-exception (clojure.spec.alpha/keys :req-un [] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.codebuild.-2016-10-06/list-source-credentials-input (clojure.spec.alpha/keys :req-un [] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.codebuild.-2016-10-06/source-type #{:s-3 "CODEPIPELINE" :github :codepipeline :bitbucket :codecommit :no-source "GITHUB_ENTERPRISE" "BITBUCKET" "CODECOMMIT" "GITHUB" "S3" "NO_SOURCE" :github-enterprise})

(clojure.spec.alpha/def :portkey.aws.codebuild.-2016-10-06/credential-provider-type #{:secrets-manager "SECRETS_MANAGER"})

(clojure.spec.alpha/def :portkey.aws.codebuild.-2016-10-06/time-out (clojure.spec.alpha/int-in 5 480))

(clojure.spec.alpha/def :portkey.aws.codebuild.-2016-10-06.delete-source-credentials-output/arn (clojure.spec.alpha/and :portkey.aws.codebuild.-2016-10-06/non-empty-string))
(clojure.spec.alpha/def :portkey.aws.codebuild.-2016-10-06/delete-source-credentials-output (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.codebuild.-2016-10-06.delete-source-credentials-output/arn]))

(clojure.spec.alpha/def :portkey.aws.codebuild.-2016-10-06.batch-get-builds-output/builds (clojure.spec.alpha/and :portkey.aws.codebuild.-2016-10-06/builds))
(clojure.spec.alpha/def :portkey.aws.codebuild.-2016-10-06.batch-get-builds-output/builds-not-found (clojure.spec.alpha/and :portkey.aws.codebuild.-2016-10-06/build-ids))
(clojure.spec.alpha/def :portkey.aws.codebuild.-2016-10-06/batch-get-builds-output (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.codebuild.-2016-10-06.batch-get-builds-output/builds :portkey.aws.codebuild.-2016-10-06.batch-get-builds-output/builds-not-found]))

(clojure.spec.alpha/def :portkey.aws.codebuild.-2016-10-06/sort-order-type #{:descending :ascending "ASCENDING" "DESCENDING"})

(clojure.spec.alpha/def :portkey.aws.codebuild.-2016-10-06/project-cache-modes (clojure.spec.alpha/coll-of :portkey.aws.codebuild.-2016-10-06/cache-mode))

(clojure.spec.alpha/def :portkey.aws.codebuild.-2016-10-06.list-builds-output/ids (clojure.spec.alpha/and :portkey.aws.codebuild.-2016-10-06/build-ids))
(clojure.spec.alpha/def :portkey.aws.codebuild.-2016-10-06.list-builds-output/next-token (clojure.spec.alpha/and :portkey.aws.codebuild.-2016-10-06/string))
(clojure.spec.alpha/def :portkey.aws.codebuild.-2016-10-06/list-builds-output (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.codebuild.-2016-10-06.list-builds-output/ids :portkey.aws.codebuild.-2016-10-06.list-builds-output/next-token]))

(clojure.spec.alpha/def :portkey.aws.codebuild.-2016-10-06/status-type #{:timed-out "IN_PROGRESS" "TIMED_OUT" :in-progress "FAULT" :fault :stopped "SUCCEEDED" "STOPPED" "FAILED" :failed :succeeded})

(clojure.spec.alpha/def :portkey.aws.codebuild.-2016-10-06.list-projects-output/next-token (clojure.spec.alpha/and :portkey.aws.codebuild.-2016-10-06/string))
(clojure.spec.alpha/def :portkey.aws.codebuild.-2016-10-06.list-projects-output/projects (clojure.spec.alpha/and :portkey.aws.codebuild.-2016-10-06/project-names))
(clojure.spec.alpha/def :portkey.aws.codebuild.-2016-10-06/list-projects-output (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.codebuild.-2016-10-06.list-projects-output/next-token :portkey.aws.codebuild.-2016-10-06.list-projects-output/projects]))

(clojure.spec.alpha/def :portkey.aws.codebuild.-2016-10-06.import-source-credentials-output/arn (clojure.spec.alpha/and :portkey.aws.codebuild.-2016-10-06/non-empty-string))
(clojure.spec.alpha/def :portkey.aws.codebuild.-2016-10-06/import-source-credentials-output (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.codebuild.-2016-10-06.import-source-credentials-output/arn]))

(clojure.spec.alpha/def :portkey.aws.codebuild.-2016-10-06/list-curated-environment-images-input (clojure.spec.alpha/keys :req-un [] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.codebuild.-2016-10-06/image-versions (clojure.spec.alpha/coll-of :portkey.aws.codebuild.-2016-10-06/string))

(clojure.spec.alpha/def :portkey.aws.codebuild.-2016-10-06.project-environment/type (clojure.spec.alpha/and :portkey.aws.codebuild.-2016-10-06/environment-type))
(clojure.spec.alpha/def :portkey.aws.codebuild.-2016-10-06.project-environment/image (clojure.spec.alpha/and :portkey.aws.codebuild.-2016-10-06/non-empty-string))
(clojure.spec.alpha/def :portkey.aws.codebuild.-2016-10-06.project-environment/compute-type (clojure.spec.alpha/and :portkey.aws.codebuild.-2016-10-06/compute-type))
(clojure.spec.alpha/def :portkey.aws.codebuild.-2016-10-06.project-environment/environment-variables (clojure.spec.alpha/and :portkey.aws.codebuild.-2016-10-06/environment-variables))
(clojure.spec.alpha/def :portkey.aws.codebuild.-2016-10-06.project-environment/privileged-mode (clojure.spec.alpha/and :portkey.aws.codebuild.-2016-10-06/wrapper-boolean))
(clojure.spec.alpha/def :portkey.aws.codebuild.-2016-10-06.project-environment/certificate (clojure.spec.alpha/and :portkey.aws.codebuild.-2016-10-06/string))
(clojure.spec.alpha/def :portkey.aws.codebuild.-2016-10-06.project-environment/registry-credential (clojure.spec.alpha/and :portkey.aws.codebuild.-2016-10-06/registry-credential))
(clojure.spec.alpha/def :portkey.aws.codebuild.-2016-10-06.project-environment/image-pull-credentials-type (clojure.spec.alpha/and :portkey.aws.codebuild.-2016-10-06/image-pull-credentials-type))
(clojure.spec.alpha/def :portkey.aws.codebuild.-2016-10-06/project-environment (clojure.spec.alpha/keys :req-un [:portkey.aws.codebuild.-2016-10-06.project-environment/type :portkey.aws.codebuild.-2016-10-06.project-environment/image :portkey.aws.codebuild.-2016-10-06.project-environment/compute-type] :opt-un [:portkey.aws.codebuild.-2016-10-06.project-environment/environment-variables :portkey.aws.codebuild.-2016-10-06.project-environment/privileged-mode :portkey.aws.codebuild.-2016-10-06.project-environment/certificate :portkey.aws.codebuild.-2016-10-06.project-environment/registry-credential :portkey.aws.codebuild.-2016-10-06.project-environment/image-pull-credentials-type]))

(clojure.spec.alpha/def :portkey.aws.codebuild.-2016-10-06/project-sources (clojure.spec.alpha/coll-of :portkey.aws.codebuild.-2016-10-06/project-source :min-count 0 :max-count 12))

(clojure.spec.alpha/def :portkey.aws.codebuild.-2016-10-06/image-pull-credentials-type #{:service-role "CODEBUILD" "SERVICE_ROLE" :codebuild})

(clojure.spec.alpha/def :portkey.aws.codebuild.-2016-10-06/tag-list (clojure.spec.alpha/coll-of :portkey.aws.codebuild.-2016-10-06/tag :min-count 0 :max-count 50))

(clojure.spec.alpha/def :portkey.aws.codebuild.-2016-10-06.update-project-input/vpc-config (clojure.spec.alpha/and :portkey.aws.codebuild.-2016-10-06/vpc-config))
(clojure.spec.alpha/def :portkey.aws.codebuild.-2016-10-06.update-project-input/service-role (clojure.spec.alpha/and :portkey.aws.codebuild.-2016-10-06/non-empty-string))
(clojure.spec.alpha/def :portkey.aws.codebuild.-2016-10-06.update-project-input/badge-enabled (clojure.spec.alpha/and :portkey.aws.codebuild.-2016-10-06/wrapper-boolean))
(clojure.spec.alpha/def :portkey.aws.codebuild.-2016-10-06.update-project-input/artifacts (clojure.spec.alpha/and :portkey.aws.codebuild.-2016-10-06/project-artifacts))
(clojure.spec.alpha/def :portkey.aws.codebuild.-2016-10-06.update-project-input/secondary-sources (clojure.spec.alpha/and :portkey.aws.codebuild.-2016-10-06/project-sources))
(clojure.spec.alpha/def :portkey.aws.codebuild.-2016-10-06.update-project-input/tags (clojure.spec.alpha/and :portkey.aws.codebuild.-2016-10-06/tag-list))
(clojure.spec.alpha/def :portkey.aws.codebuild.-2016-10-06.update-project-input/cache (clojure.spec.alpha/and :portkey.aws.codebuild.-2016-10-06/project-cache))
(clojure.spec.alpha/def :portkey.aws.codebuild.-2016-10-06.update-project-input/name (clojure.spec.alpha/and :portkey.aws.codebuild.-2016-10-06/non-empty-string))
(clojure.spec.alpha/def :portkey.aws.codebuild.-2016-10-06.update-project-input/encryption-key (clojure.spec.alpha/and :portkey.aws.codebuild.-2016-10-06/non-empty-string))
(clojure.spec.alpha/def :portkey.aws.codebuild.-2016-10-06.update-project-input/source (clojure.spec.alpha/and :portkey.aws.codebuild.-2016-10-06/project-source))
(clojure.spec.alpha/def :portkey.aws.codebuild.-2016-10-06.update-project-input/environment (clojure.spec.alpha/and :portkey.aws.codebuild.-2016-10-06/project-environment))
(clojure.spec.alpha/def :portkey.aws.codebuild.-2016-10-06.update-project-input/secondary-artifacts (clojure.spec.alpha/and :portkey.aws.codebuild.-2016-10-06/project-artifacts-list))
(clojure.spec.alpha/def :portkey.aws.codebuild.-2016-10-06.update-project-input/timeout-in-minutes (clojure.spec.alpha/and :portkey.aws.codebuild.-2016-10-06/time-out))
(clojure.spec.alpha/def :portkey.aws.codebuild.-2016-10-06.update-project-input/logs-config (clojure.spec.alpha/and :portkey.aws.codebuild.-2016-10-06/logs-config))
(clojure.spec.alpha/def :portkey.aws.codebuild.-2016-10-06.update-project-input/queued-timeout-in-minutes (clojure.spec.alpha/and :portkey.aws.codebuild.-2016-10-06/time-out))
(clojure.spec.alpha/def :portkey.aws.codebuild.-2016-10-06.update-project-input/description (clojure.spec.alpha/and :portkey.aws.codebuild.-2016-10-06/project-description))
(clojure.spec.alpha/def :portkey.aws.codebuild.-2016-10-06/update-project-input (clojure.spec.alpha/keys :req-un [:portkey.aws.codebuild.-2016-10-06.update-project-input/name] :opt-un [:portkey.aws.codebuild.-2016-10-06.update-project-input/vpc-config :portkey.aws.codebuild.-2016-10-06.update-project-input/service-role :portkey.aws.codebuild.-2016-10-06.update-project-input/badge-enabled :portkey.aws.codebuild.-2016-10-06.update-project-input/artifacts :portkey.aws.codebuild.-2016-10-06.update-project-input/secondary-sources :portkey.aws.codebuild.-2016-10-06.update-project-input/tags :portkey.aws.codebuild.-2016-10-06.update-project-input/cache :portkey.aws.codebuild.-2016-10-06.update-project-input/encryption-key :portkey.aws.codebuild.-2016-10-06.update-project-input/source :portkey.aws.codebuild.-2016-10-06.update-project-input/environment :portkey.aws.codebuild.-2016-10-06.update-project-input/secondary-artifacts :portkey.aws.codebuild.-2016-10-06.update-project-input/timeout-in-minutes :portkey.aws.codebuild.-2016-10-06.update-project-input/logs-config :portkey.aws.codebuild.-2016-10-06.update-project-input/queued-timeout-in-minutes :portkey.aws.codebuild.-2016-10-06.update-project-input/description]))

(clojure.spec.alpha/def :portkey.aws.codebuild.-2016-10-06/o-auth-provider-exception (clojure.spec.alpha/keys :req-un [] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.codebuild.-2016-10-06/sensitive-non-empty-string (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__1410938__auto__] (clojure.core/<= 1 (clojure.core/count s__1410938__auto__)))))

(clojure.spec.alpha/def :portkey.aws.codebuild.-2016-10-06.registry-credential/credential (clojure.spec.alpha/and :portkey.aws.codebuild.-2016-10-06/non-empty-string))
(clojure.spec.alpha/def :portkey.aws.codebuild.-2016-10-06.registry-credential/credential-provider (clojure.spec.alpha/and :portkey.aws.codebuild.-2016-10-06/credential-provider-type))
(clojure.spec.alpha/def :portkey.aws.codebuild.-2016-10-06/registry-credential (clojure.spec.alpha/keys :req-un [:portkey.aws.codebuild.-2016-10-06.registry-credential/credential :portkey.aws.codebuild.-2016-10-06.registry-credential/credential-provider] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.codebuild.-2016-10-06.s-3-logs-config/status (clojure.spec.alpha/and :portkey.aws.codebuild.-2016-10-06/logs-config-status-type))
(clojure.spec.alpha/def :portkey.aws.codebuild.-2016-10-06.s-3-logs-config/location (clojure.spec.alpha/and :portkey.aws.codebuild.-2016-10-06/string))
(clojure.spec.alpha/def :portkey.aws.codebuild.-2016-10-06/s-3-logs-config (clojure.spec.alpha/keys :req-un [:portkey.aws.codebuild.-2016-10-06.s-3-logs-config/status] :opt-un [:portkey.aws.codebuild.-2016-10-06.s-3-logs-config/location]))

(clojure.spec.alpha/def :portkey.aws.codebuild.-2016-10-06/resource-not-found-exception (clojure.spec.alpha/keys :req-un [] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.codebuild.-2016-10-06/delete-webhook-output (clojure.spec.alpha/keys :req-un [] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.codebuild.-2016-10-06/logs-config-status-type #{"DISABLED" :disabled "ENABLED" :enabled})

(clojure.spec.alpha/def :portkey.aws.codebuild.-2016-10-06/language-type #{"BASE" :dotnet "PHP" :golang :node-js "DOTNET" "GOLANG" "JAVA" "DOCKER" :docker :java "PYTHON" :android "NODE_JS" "RUBY" :python :php :base "ANDROID" :ruby})

(clojure.spec.alpha/def :portkey.aws.codebuild.-2016-10-06/project-names (clojure.spec.alpha/coll-of :portkey.aws.codebuild.-2016-10-06/non-empty-string :min-count 1 :max-count 100))

(clojure.spec.alpha/def :portkey.aws.codebuild.-2016-10-06.environment-variable/name (clojure.spec.alpha/and :portkey.aws.codebuild.-2016-10-06/non-empty-string))
(clojure.spec.alpha/def :portkey.aws.codebuild.-2016-10-06.environment-variable/value (clojure.spec.alpha/and :portkey.aws.codebuild.-2016-10-06/string))
(clojure.spec.alpha/def :portkey.aws.codebuild.-2016-10-06.environment-variable/type (clojure.spec.alpha/and :portkey.aws.codebuild.-2016-10-06/environment-variable-type))
(clojure.spec.alpha/def :portkey.aws.codebuild.-2016-10-06/environment-variable (clojure.spec.alpha/keys :req-un [:portkey.aws.codebuild.-2016-10-06.environment-variable/name :portkey.aws.codebuild.-2016-10-06.environment-variable/value] :opt-un [:portkey.aws.codebuild.-2016-10-06.environment-variable/type]))

(clojure.spec.alpha/def :portkey.aws.codebuild.-2016-10-06/invalid-input-exception (clojure.spec.alpha/keys :req-un [] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.codebuild.-2016-10-06/key-input (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__1410938__auto__] (clojure.core/<= 1 (clojure.core/count s__1410938__auto__))) (clojure.core/fn [s__1410939__auto__] (clojure.core/< (clojure.core/count s__1410939__auto__) 127)) (clojure.core/fn [s__1410940__auto__] (clojure.core/re-matches #"^([\\p{L}\\p{Z}\\p{N}_.:/=@+\\-]*)$" s__1410940__auto__))))

(clojure.spec.alpha/def :portkey.aws.codebuild.-2016-10-06.batch-delete-builds-input/ids (clojure.spec.alpha/and :portkey.aws.codebuild.-2016-10-06/build-ids))
(clojure.spec.alpha/def :portkey.aws.codebuild.-2016-10-06/batch-delete-builds-input (clojure.spec.alpha/keys :req-un [:portkey.aws.codebuild.-2016-10-06.batch-delete-builds-input/ids] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.codebuild.-2016-10-06/cache-mode #{:local-docker-layer-cache "LOCAL_SOURCE_CACHE" :local-source-cache "LOCAL_CUSTOM_CACHE" :local-custom-cache "LOCAL_DOCKER_LAYER_CACHE"})

(clojure.spec.alpha/def :portkey.aws.codebuild.-2016-10-06.start-build-input/report-build-status-override (clojure.spec.alpha/and :portkey.aws.codebuild.-2016-10-06/wrapper-boolean))
(clojure.spec.alpha/def :portkey.aws.codebuild.-2016-10-06.start-build-input/source-version (clojure.spec.alpha/and :portkey.aws.codebuild.-2016-10-06/string))
(clojure.spec.alpha/def :portkey.aws.codebuild.-2016-10-06.start-build-input/timeout-in-minutes-override (clojure.spec.alpha/and :portkey.aws.codebuild.-2016-10-06/time-out))
(clojure.spec.alpha/def :portkey.aws.codebuild.-2016-10-06.start-build-input/image-pull-credentials-type-override (clojure.spec.alpha/and :portkey.aws.codebuild.-2016-10-06/image-pull-credentials-type))
(clojure.spec.alpha/def :portkey.aws.codebuild.-2016-10-06.start-build-input/secondary-sources-override (clojure.spec.alpha/and :portkey.aws.codebuild.-2016-10-06/project-sources))
(clojure.spec.alpha/def :portkey.aws.codebuild.-2016-10-06.start-build-input/artifacts-override (clojure.spec.alpha/and :portkey.aws.codebuild.-2016-10-06/project-artifacts))
(clojure.spec.alpha/def :portkey.aws.codebuild.-2016-10-06.start-build-input/logs-config-override (clojure.spec.alpha/and :portkey.aws.codebuild.-2016-10-06/logs-config))
(clojure.spec.alpha/def :portkey.aws.codebuild.-2016-10-06.start-build-input/secondary-artifacts-override (clojure.spec.alpha/and :portkey.aws.codebuild.-2016-10-06/project-artifacts-list))
(clojure.spec.alpha/def :portkey.aws.codebuild.-2016-10-06.start-build-input/source-auth-override (clojure.spec.alpha/and :portkey.aws.codebuild.-2016-10-06/source-auth))
(clojure.spec.alpha/def :portkey.aws.codebuild.-2016-10-06.start-build-input/certificate-override (clojure.spec.alpha/and :portkey.aws.codebuild.-2016-10-06/string))
(clojure.spec.alpha/def :portkey.aws.codebuild.-2016-10-06.start-build-input/git-clone-depth-override (clojure.spec.alpha/and :portkey.aws.codebuild.-2016-10-06/git-clone-depth))
(clojure.spec.alpha/def :portkey.aws.codebuild.-2016-10-06.start-build-input/compute-type-override (clojure.spec.alpha/and :portkey.aws.codebuild.-2016-10-06/compute-type))
(clojure.spec.alpha/def :portkey.aws.codebuild.-2016-10-06.start-build-input/buildspec-override (clojure.spec.alpha/and :portkey.aws.codebuild.-2016-10-06/string))
(clojure.spec.alpha/def :portkey.aws.codebuild.-2016-10-06.start-build-input/idempotency-token (clojure.spec.alpha/and :portkey.aws.codebuild.-2016-10-06/string))
(clojure.spec.alpha/def :portkey.aws.codebuild.-2016-10-06.start-build-input/privileged-mode-override (clojure.spec.alpha/and :portkey.aws.codebuild.-2016-10-06/wrapper-boolean))
(clojure.spec.alpha/def :portkey.aws.codebuild.-2016-10-06.start-build-input/environment-variables-override (clojure.spec.alpha/and :portkey.aws.codebuild.-2016-10-06/environment-variables))
(clojure.spec.alpha/def :portkey.aws.codebuild.-2016-10-06.start-build-input/cache-override (clojure.spec.alpha/and :portkey.aws.codebuild.-2016-10-06/project-cache))
(clojure.spec.alpha/def :portkey.aws.codebuild.-2016-10-06.start-build-input/registry-credential-override (clojure.spec.alpha/and :portkey.aws.codebuild.-2016-10-06/registry-credential))
(clojure.spec.alpha/def :portkey.aws.codebuild.-2016-10-06.start-build-input/image-override (clojure.spec.alpha/and :portkey.aws.codebuild.-2016-10-06/non-empty-string))
(clojure.spec.alpha/def :portkey.aws.codebuild.-2016-10-06.start-build-input/environment-type-override (clojure.spec.alpha/and :portkey.aws.codebuild.-2016-10-06/environment-type))
(clojure.spec.alpha/def :portkey.aws.codebuild.-2016-10-06.start-build-input/service-role-override (clojure.spec.alpha/and :portkey.aws.codebuild.-2016-10-06/non-empty-string))
(clojure.spec.alpha/def :portkey.aws.codebuild.-2016-10-06.start-build-input/source-location-override (clojure.spec.alpha/and :portkey.aws.codebuild.-2016-10-06/string))
(clojure.spec.alpha/def :portkey.aws.codebuild.-2016-10-06.start-build-input/queued-timeout-in-minutes-override (clojure.spec.alpha/and :portkey.aws.codebuild.-2016-10-06/time-out))
(clojure.spec.alpha/def :portkey.aws.codebuild.-2016-10-06.start-build-input/source-type-override (clojure.spec.alpha/and :portkey.aws.codebuild.-2016-10-06/source-type))
(clojure.spec.alpha/def :portkey.aws.codebuild.-2016-10-06.start-build-input/insecure-ssl-override (clojure.spec.alpha/and :portkey.aws.codebuild.-2016-10-06/wrapper-boolean))
(clojure.spec.alpha/def :portkey.aws.codebuild.-2016-10-06.start-build-input/project-name (clojure.spec.alpha/and :portkey.aws.codebuild.-2016-10-06/non-empty-string))
(clojure.spec.alpha/def :portkey.aws.codebuild.-2016-10-06.start-build-input/secondary-sources-version-override (clojure.spec.alpha/and :portkey.aws.codebuild.-2016-10-06/project-secondary-source-versions))
(clojure.spec.alpha/def :portkey.aws.codebuild.-2016-10-06/start-build-input (clojure.spec.alpha/keys :req-un [:portkey.aws.codebuild.-2016-10-06.start-build-input/project-name] :opt-un [:portkey.aws.codebuild.-2016-10-06.start-build-input/report-build-status-override :portkey.aws.codebuild.-2016-10-06.start-build-input/source-version :portkey.aws.codebuild.-2016-10-06.start-build-input/timeout-in-minutes-override :portkey.aws.codebuild.-2016-10-06.start-build-input/image-pull-credentials-type-override :portkey.aws.codebuild.-2016-10-06.start-build-input/secondary-sources-override :portkey.aws.codebuild.-2016-10-06.start-build-input/artifacts-override :portkey.aws.codebuild.-2016-10-06.start-build-input/logs-config-override :portkey.aws.codebuild.-2016-10-06.start-build-input/secondary-artifacts-override :portkey.aws.codebuild.-2016-10-06.start-build-input/source-auth-override :portkey.aws.codebuild.-2016-10-06.start-build-input/certificate-override :portkey.aws.codebuild.-2016-10-06.start-build-input/git-clone-depth-override :portkey.aws.codebuild.-2016-10-06.start-build-input/compute-type-override :portkey.aws.codebuild.-2016-10-06.start-build-input/buildspec-override :portkey.aws.codebuild.-2016-10-06.start-build-input/idempotency-token :portkey.aws.codebuild.-2016-10-06.start-build-input/privileged-mode-override :portkey.aws.codebuild.-2016-10-06.start-build-input/environment-variables-override :portkey.aws.codebuild.-2016-10-06.start-build-input/cache-override :portkey.aws.codebuild.-2016-10-06.start-build-input/registry-credential-override :portkey.aws.codebuild.-2016-10-06.start-build-input/image-override :portkey.aws.codebuild.-2016-10-06.start-build-input/environment-type-override :portkey.aws.codebuild.-2016-10-06.start-build-input/service-role-override :portkey.aws.codebuild.-2016-10-06.start-build-input/source-location-override :portkey.aws.codebuild.-2016-10-06.start-build-input/queued-timeout-in-minutes-override :portkey.aws.codebuild.-2016-10-06.start-build-input/source-type-override :portkey.aws.codebuild.-2016-10-06.start-build-input/insecure-ssl-override :portkey.aws.codebuild.-2016-10-06.start-build-input/secondary-sources-version-override]))

(clojure.spec.alpha/def :portkey.aws.codebuild.-2016-10-06.build/vpc-config (clojure.spec.alpha/and :portkey.aws.codebuild.-2016-10-06/vpc-config))
(clojure.spec.alpha/def :portkey.aws.codebuild.-2016-10-06.build/service-role (clojure.spec.alpha/and :portkey.aws.codebuild.-2016-10-06/non-empty-string))
(clojure.spec.alpha/def :portkey.aws.codebuild.-2016-10-06.build/source-version (clojure.spec.alpha/and :portkey.aws.codebuild.-2016-10-06/non-empty-string))
(clojure.spec.alpha/def :portkey.aws.codebuild.-2016-10-06.build/build-complete (clojure.spec.alpha/and :portkey.aws.codebuild.-2016-10-06/boolean))
(clojure.spec.alpha/def :portkey.aws.codebuild.-2016-10-06.build/secondary-source-versions (clojure.spec.alpha/and :portkey.aws.codebuild.-2016-10-06/project-secondary-source-versions))
(clojure.spec.alpha/def :portkey.aws.codebuild.-2016-10-06.build/artifacts (clojure.spec.alpha/and :portkey.aws.codebuild.-2016-10-06/build-artifacts))
(clojure.spec.alpha/def :portkey.aws.codebuild.-2016-10-06.build/arn (clojure.spec.alpha/and :portkey.aws.codebuild.-2016-10-06/non-empty-string))
(clojure.spec.alpha/def :portkey.aws.codebuild.-2016-10-06.build/network-interface (clojure.spec.alpha/and :portkey.aws.codebuild.-2016-10-06/network-interface))
(clojure.spec.alpha/def :portkey.aws.codebuild.-2016-10-06.build/secondary-sources (clojure.spec.alpha/and :portkey.aws.codebuild.-2016-10-06/project-sources))
(clojure.spec.alpha/def :portkey.aws.codebuild.-2016-10-06.build/id (clojure.spec.alpha/and :portkey.aws.codebuild.-2016-10-06/non-empty-string))
(clojure.spec.alpha/def :portkey.aws.codebuild.-2016-10-06.build/resolved-source-version (clojure.spec.alpha/and :portkey.aws.codebuild.-2016-10-06/non-empty-string))
(clojure.spec.alpha/def :portkey.aws.codebuild.-2016-10-06.build/cache (clojure.spec.alpha/and :portkey.aws.codebuild.-2016-10-06/project-cache))
(clojure.spec.alpha/def :portkey.aws.codebuild.-2016-10-06.build/start-time (clojure.spec.alpha/and :portkey.aws.codebuild.-2016-10-06/timestamp))
(clojure.spec.alpha/def :portkey.aws.codebuild.-2016-10-06.build/logs (clojure.spec.alpha/and :portkey.aws.codebuild.-2016-10-06/logs-location))
(clojure.spec.alpha/def :portkey.aws.codebuild.-2016-10-06.build/initiator (clojure.spec.alpha/and :portkey.aws.codebuild.-2016-10-06/string))
(clojure.spec.alpha/def :portkey.aws.codebuild.-2016-10-06.build/encryption-key (clojure.spec.alpha/and :portkey.aws.codebuild.-2016-10-06/non-empty-string))
(clojure.spec.alpha/def :portkey.aws.codebuild.-2016-10-06.build/source (clojure.spec.alpha/and :portkey.aws.codebuild.-2016-10-06/project-source))
(clojure.spec.alpha/def :portkey.aws.codebuild.-2016-10-06.build/environment (clojure.spec.alpha/and :portkey.aws.codebuild.-2016-10-06/project-environment))
(clojure.spec.alpha/def :portkey.aws.codebuild.-2016-10-06.build/secondary-artifacts (clojure.spec.alpha/and :portkey.aws.codebuild.-2016-10-06/build-artifacts-list))
(clojure.spec.alpha/def :portkey.aws.codebuild.-2016-10-06.build/current-phase (clojure.spec.alpha/and :portkey.aws.codebuild.-2016-10-06/string))
(clojure.spec.alpha/def :portkey.aws.codebuild.-2016-10-06.build/timeout-in-minutes (clojure.spec.alpha/and :portkey.aws.codebuild.-2016-10-06/wrapper-int))
(clojure.spec.alpha/def :portkey.aws.codebuild.-2016-10-06.build/end-time (clojure.spec.alpha/and :portkey.aws.codebuild.-2016-10-06/timestamp))
(clojure.spec.alpha/def :portkey.aws.codebuild.-2016-10-06.build/project-name (clojure.spec.alpha/and :portkey.aws.codebuild.-2016-10-06/non-empty-string))
(clojure.spec.alpha/def :portkey.aws.codebuild.-2016-10-06.build/queued-timeout-in-minutes (clojure.spec.alpha/and :portkey.aws.codebuild.-2016-10-06/wrapper-int))
(clojure.spec.alpha/def :portkey.aws.codebuild.-2016-10-06.build/build-status (clojure.spec.alpha/and :portkey.aws.codebuild.-2016-10-06/status-type))
(clojure.spec.alpha/def :portkey.aws.codebuild.-2016-10-06.build/phases (clojure.spec.alpha/and :portkey.aws.codebuild.-2016-10-06/build-phases))
(clojure.spec.alpha/def :portkey.aws.codebuild.-2016-10-06/build (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.codebuild.-2016-10-06.build/vpc-config :portkey.aws.codebuild.-2016-10-06.build/service-role :portkey.aws.codebuild.-2016-10-06.build/source-version :portkey.aws.codebuild.-2016-10-06.build/build-complete :portkey.aws.codebuild.-2016-10-06.build/secondary-source-versions :portkey.aws.codebuild.-2016-10-06.build/artifacts :portkey.aws.codebuild.-2016-10-06.build/arn :portkey.aws.codebuild.-2016-10-06.build/network-interface :portkey.aws.codebuild.-2016-10-06.build/secondary-sources :portkey.aws.codebuild.-2016-10-06.build/id :portkey.aws.codebuild.-2016-10-06.build/resolved-source-version :portkey.aws.codebuild.-2016-10-06.build/cache :portkey.aws.codebuild.-2016-10-06.build/start-time :portkey.aws.codebuild.-2016-10-06.build/logs :portkey.aws.codebuild.-2016-10-06.build/initiator :portkey.aws.codebuild.-2016-10-06.build/encryption-key :portkey.aws.codebuild.-2016-10-06.build/source :portkey.aws.codebuild.-2016-10-06.build/environment :portkey.aws.codebuild.-2016-10-06.build/secondary-artifacts :portkey.aws.codebuild.-2016-10-06.build/current-phase :portkey.aws.codebuild.-2016-10-06.build/timeout-in-minutes :portkey.aws.codebuild.-2016-10-06.build/end-time :portkey.aws.codebuild.-2016-10-06.build/project-name :portkey.aws.codebuild.-2016-10-06.build/queued-timeout-in-minutes :portkey.aws.codebuild.-2016-10-06.build/build-status :portkey.aws.codebuild.-2016-10-06.build/phases]))

(clojure.spec.alpha/def :portkey.aws.codebuild.-2016-10-06/string (clojure.spec.alpha/and clojure.core/string?))

(clojure.spec.alpha/def :portkey.aws.codebuild.-2016-10-06.source-auth/type (clojure.spec.alpha/and :portkey.aws.codebuild.-2016-10-06/source-auth-type))
(clojure.spec.alpha/def :portkey.aws.codebuild.-2016-10-06.source-auth/resource (clojure.spec.alpha/and :portkey.aws.codebuild.-2016-10-06/string))
(clojure.spec.alpha/def :portkey.aws.codebuild.-2016-10-06/source-auth (clojure.spec.alpha/keys :req-un [:portkey.aws.codebuild.-2016-10-06.source-auth/type] :opt-un [:portkey.aws.codebuild.-2016-10-06.source-auth/resource]))

(clojure.spec.alpha/def :portkey.aws.codebuild.-2016-10-06/project-description (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__1410938__auto__] (clojure.core/<= 0 (clojure.core/count s__1410938__auto__))) (clojure.core/fn [s__1410939__auto__] (clojure.core/< (clojure.core/count s__1410939__auto__) 255))))

(clojure.spec.alpha/def :portkey.aws.codebuild.-2016-10-06.project/vpc-config (clojure.spec.alpha/and :portkey.aws.codebuild.-2016-10-06/vpc-config))
(clojure.spec.alpha/def :portkey.aws.codebuild.-2016-10-06.project/service-role (clojure.spec.alpha/and :portkey.aws.codebuild.-2016-10-06/non-empty-string))
(clojure.spec.alpha/def :portkey.aws.codebuild.-2016-10-06.project/last-modified (clojure.spec.alpha/and :portkey.aws.codebuild.-2016-10-06/timestamp))
(clojure.spec.alpha/def :portkey.aws.codebuild.-2016-10-06.project/created (clojure.spec.alpha/and :portkey.aws.codebuild.-2016-10-06/timestamp))
(clojure.spec.alpha/def :portkey.aws.codebuild.-2016-10-06.project/artifacts (clojure.spec.alpha/and :portkey.aws.codebuild.-2016-10-06/project-artifacts))
(clojure.spec.alpha/def :portkey.aws.codebuild.-2016-10-06.project/arn (clojure.spec.alpha/and :portkey.aws.codebuild.-2016-10-06/string))
(clojure.spec.alpha/def :portkey.aws.codebuild.-2016-10-06.project/secondary-sources (clojure.spec.alpha/and :portkey.aws.codebuild.-2016-10-06/project-sources))
(clojure.spec.alpha/def :portkey.aws.codebuild.-2016-10-06.project/tags (clojure.spec.alpha/and :portkey.aws.codebuild.-2016-10-06/tag-list))
(clojure.spec.alpha/def :portkey.aws.codebuild.-2016-10-06.project/cache (clojure.spec.alpha/and :portkey.aws.codebuild.-2016-10-06/project-cache))
(clojure.spec.alpha/def :portkey.aws.codebuild.-2016-10-06.project/name (clojure.spec.alpha/and :portkey.aws.codebuild.-2016-10-06/project-name))
(clojure.spec.alpha/def :portkey.aws.codebuild.-2016-10-06.project/encryption-key (clojure.spec.alpha/and :portkey.aws.codebuild.-2016-10-06/non-empty-string))
(clojure.spec.alpha/def :portkey.aws.codebuild.-2016-10-06.project/source (clojure.spec.alpha/and :portkey.aws.codebuild.-2016-10-06/project-source))
(clojure.spec.alpha/def :portkey.aws.codebuild.-2016-10-06.project/environment (clojure.spec.alpha/and :portkey.aws.codebuild.-2016-10-06/project-environment))
(clojure.spec.alpha/def :portkey.aws.codebuild.-2016-10-06.project/secondary-artifacts (clojure.spec.alpha/and :portkey.aws.codebuild.-2016-10-06/project-artifacts-list))
(clojure.spec.alpha/def :portkey.aws.codebuild.-2016-10-06.project/timeout-in-minutes (clojure.spec.alpha/and :portkey.aws.codebuild.-2016-10-06/time-out))
(clojure.spec.alpha/def :portkey.aws.codebuild.-2016-10-06.project/webhook (clojure.spec.alpha/and :portkey.aws.codebuild.-2016-10-06/webhook))
(clojure.spec.alpha/def :portkey.aws.codebuild.-2016-10-06.project/logs-config (clojure.spec.alpha/and :portkey.aws.codebuild.-2016-10-06/logs-config))
(clojure.spec.alpha/def :portkey.aws.codebuild.-2016-10-06.project/queued-timeout-in-minutes (clojure.spec.alpha/and :portkey.aws.codebuild.-2016-10-06/time-out))
(clojure.spec.alpha/def :portkey.aws.codebuild.-2016-10-06.project/description (clojure.spec.alpha/and :portkey.aws.codebuild.-2016-10-06/project-description))
(clojure.spec.alpha/def :portkey.aws.codebuild.-2016-10-06.project/badge (clojure.spec.alpha/and :portkey.aws.codebuild.-2016-10-06/project-badge))
(clojure.spec.alpha/def :portkey.aws.codebuild.-2016-10-06/project (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.codebuild.-2016-10-06.project/vpc-config :portkey.aws.codebuild.-2016-10-06.project/service-role :portkey.aws.codebuild.-2016-10-06.project/last-modified :portkey.aws.codebuild.-2016-10-06.project/created :portkey.aws.codebuild.-2016-10-06.project/artifacts :portkey.aws.codebuild.-2016-10-06.project/arn :portkey.aws.codebuild.-2016-10-06.project/secondary-sources :portkey.aws.codebuild.-2016-10-06.project/tags :portkey.aws.codebuild.-2016-10-06.project/cache :portkey.aws.codebuild.-2016-10-06.project/name :portkey.aws.codebuild.-2016-10-06.project/encryption-key :portkey.aws.codebuild.-2016-10-06.project/source :portkey.aws.codebuild.-2016-10-06.project/environment :portkey.aws.codebuild.-2016-10-06.project/secondary-artifacts :portkey.aws.codebuild.-2016-10-06.project/timeout-in-minutes :portkey.aws.codebuild.-2016-10-06.project/webhook :portkey.aws.codebuild.-2016-10-06.project/logs-config :portkey.aws.codebuild.-2016-10-06.project/queued-timeout-in-minutes :portkey.aws.codebuild.-2016-10-06.project/description :portkey.aws.codebuild.-2016-10-06.project/badge]))

(clojure.spec.alpha/def :portkey.aws.codebuild.-2016-10-06/delete-project-output (clojure.spec.alpha/keys :req-un [] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.codebuild.-2016-10-06.network-interface/subnet-id (clojure.spec.alpha/and :portkey.aws.codebuild.-2016-10-06/non-empty-string))
(clojure.spec.alpha/def :portkey.aws.codebuild.-2016-10-06.network-interface/network-interface-id (clojure.spec.alpha/and :portkey.aws.codebuild.-2016-10-06/non-empty-string))
(clojure.spec.alpha/def :portkey.aws.codebuild.-2016-10-06/network-interface (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.codebuild.-2016-10-06.network-interface/subnet-id :portkey.aws.codebuild.-2016-10-06.network-interface/network-interface-id]))

(clojure.spec.alpha/def :portkey.aws.codebuild.-2016-10-06.project-cache/type (clojure.spec.alpha/and :portkey.aws.codebuild.-2016-10-06/cache-type))
(clojure.spec.alpha/def :portkey.aws.codebuild.-2016-10-06.project-cache/location (clojure.spec.alpha/and :portkey.aws.codebuild.-2016-10-06/string))
(clojure.spec.alpha/def :portkey.aws.codebuild.-2016-10-06.project-cache/modes (clojure.spec.alpha/and :portkey.aws.codebuild.-2016-10-06/project-cache-modes))
(clojure.spec.alpha/def :portkey.aws.codebuild.-2016-10-06/project-cache (clojure.spec.alpha/keys :req-un [:portkey.aws.codebuild.-2016-10-06.project-cache/type] :opt-un [:portkey.aws.codebuild.-2016-10-06.project-cache/location :portkey.aws.codebuild.-2016-10-06.project-cache/modes]))

(clojure.spec.alpha/def :portkey.aws.codebuild.-2016-10-06.stop-build-input/id (clojure.spec.alpha/and :portkey.aws.codebuild.-2016-10-06/non-empty-string))
(clojure.spec.alpha/def :portkey.aws.codebuild.-2016-10-06/stop-build-input (clojure.spec.alpha/keys :req-un [:portkey.aws.codebuild.-2016-10-06.stop-build-input/id] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.codebuild.-2016-10-06/project-sort-by-type #{"CREATED_TIME" "NAME" :name :created-time :last-modified-time "LAST_MODIFIED_TIME"})

(clojure.spec.alpha/def :portkey.aws.codebuild.-2016-10-06.delete-webhook-input/project-name (clojure.spec.alpha/and :portkey.aws.codebuild.-2016-10-06/project-name))
(clojure.spec.alpha/def :portkey.aws.codebuild.-2016-10-06/delete-webhook-input (clojure.spec.alpha/keys :req-un [:portkey.aws.codebuild.-2016-10-06.delete-webhook-input/project-name] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.codebuild.-2016-10-06/cache-type #{:s-3 "NO_CACHE" "LOCAL" :no-cache "S3" :local})

(clojure.spec.alpha/def :portkey.aws.codebuild.-2016-10-06/wrapper-int clojure.core/int?)

(clojure.spec.alpha/def :portkey.aws.codebuild.-2016-10-06/environment-variable-type #{:parameter-store :plaintext "PARAMETER_STORE" "PLAINTEXT"})

(clojure.spec.alpha/def :portkey.aws.codebuild.-2016-10-06.phase-context/status-code (clojure.spec.alpha/and :portkey.aws.codebuild.-2016-10-06/string))
(clojure.spec.alpha/def :portkey.aws.codebuild.-2016-10-06.phase-context/message (clojure.spec.alpha/and :portkey.aws.codebuild.-2016-10-06/string))
(clojure.spec.alpha/def :portkey.aws.codebuild.-2016-10-06/phase-context (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.codebuild.-2016-10-06.phase-context/status-code :portkey.aws.codebuild.-2016-10-06.phase-context/message]))

(clojure.spec.alpha/def :portkey.aws.codebuild.-2016-10-06.create-webhook-output/webhook (clojure.spec.alpha/and :portkey.aws.codebuild.-2016-10-06/webhook))
(clojure.spec.alpha/def :portkey.aws.codebuild.-2016-10-06/create-webhook-output (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.codebuild.-2016-10-06.create-webhook-output/webhook]))

(clojure.spec.alpha/def :portkey.aws.codebuild.-2016-10-06/filter-groups (clojure.spec.alpha/coll-of :portkey.aws.codebuild.-2016-10-06/filter-group))

(clojure.spec.alpha/def :portkey.aws.codebuild.-2016-10-06.vpc-config/vpc-id (clojure.spec.alpha/and :portkey.aws.codebuild.-2016-10-06/non-empty-string))
(clojure.spec.alpha/def :portkey.aws.codebuild.-2016-10-06.vpc-config/subnets (clojure.spec.alpha/and :portkey.aws.codebuild.-2016-10-06/subnets))
(clojure.spec.alpha/def :portkey.aws.codebuild.-2016-10-06.vpc-config/security-group-ids (clojure.spec.alpha/and :portkey.aws.codebuild.-2016-10-06/security-group-ids))
(clojure.spec.alpha/def :portkey.aws.codebuild.-2016-10-06/vpc-config (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.codebuild.-2016-10-06.vpc-config/vpc-id :portkey.aws.codebuild.-2016-10-06.vpc-config/subnets :portkey.aws.codebuild.-2016-10-06.vpc-config/security-group-ids]))

(clojure.spec.alpha/def :portkey.aws.codebuild.-2016-10-06.list-builds-for-project-output/ids (clojure.spec.alpha/and :portkey.aws.codebuild.-2016-10-06/build-ids))
(clojure.spec.alpha/def :portkey.aws.codebuild.-2016-10-06.list-builds-for-project-output/next-token (clojure.spec.alpha/and :portkey.aws.codebuild.-2016-10-06/string))
(clojure.spec.alpha/def :portkey.aws.codebuild.-2016-10-06/list-builds-for-project-output (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.codebuild.-2016-10-06.list-builds-for-project-output/ids :portkey.aws.codebuild.-2016-10-06.list-builds-for-project-output/next-token]))

(clojure.spec.alpha/def :portkey.aws.codebuild.-2016-10-06.create-project-input/vpc-config (clojure.spec.alpha/and :portkey.aws.codebuild.-2016-10-06/vpc-config))
(clojure.spec.alpha/def :portkey.aws.codebuild.-2016-10-06.create-project-input/service-role (clojure.spec.alpha/and :portkey.aws.codebuild.-2016-10-06/non-empty-string))
(clojure.spec.alpha/def :portkey.aws.codebuild.-2016-10-06.create-project-input/badge-enabled (clojure.spec.alpha/and :portkey.aws.codebuild.-2016-10-06/wrapper-boolean))
(clojure.spec.alpha/def :portkey.aws.codebuild.-2016-10-06.create-project-input/artifacts (clojure.spec.alpha/and :portkey.aws.codebuild.-2016-10-06/project-artifacts))
(clojure.spec.alpha/def :portkey.aws.codebuild.-2016-10-06.create-project-input/secondary-sources (clojure.spec.alpha/and :portkey.aws.codebuild.-2016-10-06/project-sources))
(clojure.spec.alpha/def :portkey.aws.codebuild.-2016-10-06.create-project-input/tags (clojure.spec.alpha/and :portkey.aws.codebuild.-2016-10-06/tag-list))
(clojure.spec.alpha/def :portkey.aws.codebuild.-2016-10-06.create-project-input/cache (clojure.spec.alpha/and :portkey.aws.codebuild.-2016-10-06/project-cache))
(clojure.spec.alpha/def :portkey.aws.codebuild.-2016-10-06.create-project-input/name (clojure.spec.alpha/and :portkey.aws.codebuild.-2016-10-06/project-name))
(clojure.spec.alpha/def :portkey.aws.codebuild.-2016-10-06.create-project-input/encryption-key (clojure.spec.alpha/and :portkey.aws.codebuild.-2016-10-06/non-empty-string))
(clojure.spec.alpha/def :portkey.aws.codebuild.-2016-10-06.create-project-input/source (clojure.spec.alpha/and :portkey.aws.codebuild.-2016-10-06/project-source))
(clojure.spec.alpha/def :portkey.aws.codebuild.-2016-10-06.create-project-input/environment (clojure.spec.alpha/and :portkey.aws.codebuild.-2016-10-06/project-environment))
(clojure.spec.alpha/def :portkey.aws.codebuild.-2016-10-06.create-project-input/secondary-artifacts (clojure.spec.alpha/and :portkey.aws.codebuild.-2016-10-06/project-artifacts-list))
(clojure.spec.alpha/def :portkey.aws.codebuild.-2016-10-06.create-project-input/timeout-in-minutes (clojure.spec.alpha/and :portkey.aws.codebuild.-2016-10-06/time-out))
(clojure.spec.alpha/def :portkey.aws.codebuild.-2016-10-06.create-project-input/logs-config (clojure.spec.alpha/and :portkey.aws.codebuild.-2016-10-06/logs-config))
(clojure.spec.alpha/def :portkey.aws.codebuild.-2016-10-06.create-project-input/queued-timeout-in-minutes (clojure.spec.alpha/and :portkey.aws.codebuild.-2016-10-06/time-out))
(clojure.spec.alpha/def :portkey.aws.codebuild.-2016-10-06.create-project-input/description (clojure.spec.alpha/and :portkey.aws.codebuild.-2016-10-06/project-description))
(clojure.spec.alpha/def :portkey.aws.codebuild.-2016-10-06/create-project-input (clojure.spec.alpha/keys :req-un [:portkey.aws.codebuild.-2016-10-06.create-project-input/name :portkey.aws.codebuild.-2016-10-06.create-project-input/source :portkey.aws.codebuild.-2016-10-06.create-project-input/artifacts :portkey.aws.codebuild.-2016-10-06.create-project-input/environment :portkey.aws.codebuild.-2016-10-06.create-project-input/service-role] :opt-un [:portkey.aws.codebuild.-2016-10-06.create-project-input/vpc-config :portkey.aws.codebuild.-2016-10-06.create-project-input/badge-enabled :portkey.aws.codebuild.-2016-10-06.create-project-input/secondary-sources :portkey.aws.codebuild.-2016-10-06.create-project-input/tags :portkey.aws.codebuild.-2016-10-06.create-project-input/cache :portkey.aws.codebuild.-2016-10-06.create-project-input/encryption-key :portkey.aws.codebuild.-2016-10-06.create-project-input/secondary-artifacts :portkey.aws.codebuild.-2016-10-06.create-project-input/timeout-in-minutes :portkey.aws.codebuild.-2016-10-06.create-project-input/logs-config :portkey.aws.codebuild.-2016-10-06.create-project-input/queued-timeout-in-minutes :portkey.aws.codebuild.-2016-10-06.create-project-input/description]))

(clojure.spec.alpha/def :portkey.aws.codebuild.-2016-10-06.project-source-version/source-identifier (clojure.spec.alpha/and :portkey.aws.codebuild.-2016-10-06/string))
(clojure.spec.alpha/def :portkey.aws.codebuild.-2016-10-06.project-source-version/source-version (clojure.spec.alpha/and :portkey.aws.codebuild.-2016-10-06/string))
(clojure.spec.alpha/def :portkey.aws.codebuild.-2016-10-06/project-source-version (clojure.spec.alpha/keys :req-un [:portkey.aws.codebuild.-2016-10-06.project-source-version/source-identifier :portkey.aws.codebuild.-2016-10-06.project-source-version/source-version] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.codebuild.-2016-10-06/timestamp clojure.core/inst?)

(clojure.spec.alpha/def :portkey.aws.codebuild.-2016-10-06.update-webhook-input/project-name (clojure.spec.alpha/and :portkey.aws.codebuild.-2016-10-06/project-name))
(clojure.spec.alpha/def :portkey.aws.codebuild.-2016-10-06.update-webhook-input/branch-filter (clojure.spec.alpha/and :portkey.aws.codebuild.-2016-10-06/string))
(clojure.spec.alpha/def :portkey.aws.codebuild.-2016-10-06.update-webhook-input/rotate-secret (clojure.spec.alpha/and :portkey.aws.codebuild.-2016-10-06/boolean))
(clojure.spec.alpha/def :portkey.aws.codebuild.-2016-10-06.update-webhook-input/filter-groups (clojure.spec.alpha/and :portkey.aws.codebuild.-2016-10-06/filter-groups))
(clojure.spec.alpha/def :portkey.aws.codebuild.-2016-10-06/update-webhook-input (clojure.spec.alpha/keys :req-un [:portkey.aws.codebuild.-2016-10-06.update-webhook-input/project-name] :opt-un [:portkey.aws.codebuild.-2016-10-06.update-webhook-input/branch-filter :portkey.aws.codebuild.-2016-10-06.update-webhook-input/rotate-secret :portkey.aws.codebuild.-2016-10-06.update-webhook-input/filter-groups]))

(clojure.spec.alpha/def :portkey.aws.codebuild.-2016-10-06/source-auth-type #{"OAUTH" :oauth})

(clojure.spec.alpha/def :portkey.aws.codebuild.-2016-10-06/wrapper-boolean clojure.core/boolean?)

(clojure.spec.alpha/def :portkey.aws.codebuild.-2016-10-06/build-phase-type #{:finalizing "COMPLETED" :install "POST_BUILD" :post-build :pre-build :upload-artifacts :completed "PROVISIONING" :download-source :submitted "SUBMITTED" :queued "UPLOAD_ARTIFACTS" :build "QUEUED" "BUILD" :provisioning "DOWNLOAD_SOURCE" "INSTALL" "FINALIZING" "PRE_BUILD"})

(clojure.spec.alpha/def :portkey.aws.codebuild.-2016-10-06/auth-type #{"BASIC_AUTH" "OAUTH" :oauth :personal-access-token "PERSONAL_ACCESS_TOKEN" :basic-auth})

(clojure.spec.alpha/def :portkey.aws.codebuild.-2016-10-06.build-artifacts/location (clojure.spec.alpha/and :portkey.aws.codebuild.-2016-10-06/string))
(clojure.spec.alpha/def :portkey.aws.codebuild.-2016-10-06.build-artifacts/sha-256sum (clojure.spec.alpha/and :portkey.aws.codebuild.-2016-10-06/string))
(clojure.spec.alpha/def :portkey.aws.codebuild.-2016-10-06.build-artifacts/md-5sum (clojure.spec.alpha/and :portkey.aws.codebuild.-2016-10-06/string))
(clojure.spec.alpha/def :portkey.aws.codebuild.-2016-10-06.build-artifacts/override-artifact-name (clojure.spec.alpha/and :portkey.aws.codebuild.-2016-10-06/wrapper-boolean))
(clojure.spec.alpha/def :portkey.aws.codebuild.-2016-10-06.build-artifacts/encryption-disabled (clojure.spec.alpha/and :portkey.aws.codebuild.-2016-10-06/wrapper-boolean))
(clojure.spec.alpha/def :portkey.aws.codebuild.-2016-10-06.build-artifacts/artifact-identifier (clojure.spec.alpha/and :portkey.aws.codebuild.-2016-10-06/string))
(clojure.spec.alpha/def :portkey.aws.codebuild.-2016-10-06/build-artifacts (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.codebuild.-2016-10-06.build-artifacts/location :portkey.aws.codebuild.-2016-10-06.build-artifacts/sha-256sum :portkey.aws.codebuild.-2016-10-06.build-artifacts/md-5sum :portkey.aws.codebuild.-2016-10-06.build-artifacts/override-artifact-name :portkey.aws.codebuild.-2016-10-06.build-artifacts/encryption-disabled :portkey.aws.codebuild.-2016-10-06.build-artifacts/artifact-identifier]))

(clojure.spec.alpha/def :portkey.aws.codebuild.-2016-10-06.tag/key (clojure.spec.alpha/and :portkey.aws.codebuild.-2016-10-06/key-input))
(clojure.spec.alpha/def :portkey.aws.codebuild.-2016-10-06.tag/value (clojure.spec.alpha/and :portkey.aws.codebuild.-2016-10-06/value-input))
(clojure.spec.alpha/def :portkey.aws.codebuild.-2016-10-06/tag (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.codebuild.-2016-10-06.tag/key :portkey.aws.codebuild.-2016-10-06.tag/value]))

(clojure.spec.alpha/def :portkey.aws.codebuild.-2016-10-06/builds (clojure.spec.alpha/coll-of :portkey.aws.codebuild.-2016-10-06/build))

(clojure.spec.alpha/def :portkey.aws.codebuild.-2016-10-06/compute-type #{"BUILD_GENERAL1_LARGE" "BUILD_GENERAL1_SMALL" :build-general-1-small "BUILD_GENERAL1_MEDIUM" :build-general-1-medium :build-general-1-large})

(clojure.spec.alpha/def :portkey.aws.codebuild.-2016-10-06/projects (clojure.spec.alpha/coll-of :portkey.aws.codebuild.-2016-10-06/project))

(clojure.spec.alpha/def :portkey.aws.codebuild.-2016-10-06.update-project-output/project (clojure.spec.alpha/and :portkey.aws.codebuild.-2016-10-06/project))
(clojure.spec.alpha/def :portkey.aws.codebuild.-2016-10-06/update-project-output (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.codebuild.-2016-10-06.update-project-output/project]))

(clojure.spec.alpha/def :portkey.aws.codebuild.-2016-10-06/filter-group (clojure.spec.alpha/coll-of :portkey.aws.codebuild.-2016-10-06/webhook-filter))

(clojure.spec.alpha/def :portkey.aws.codebuild.-2016-10-06.list-builds-input/sort-order (clojure.spec.alpha/and :portkey.aws.codebuild.-2016-10-06/sort-order-type))
(clojure.spec.alpha/def :portkey.aws.codebuild.-2016-10-06.list-builds-input/next-token (clojure.spec.alpha/and :portkey.aws.codebuild.-2016-10-06/string))
(clojure.spec.alpha/def :portkey.aws.codebuild.-2016-10-06/list-builds-input (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.codebuild.-2016-10-06.list-builds-input/sort-order :portkey.aws.codebuild.-2016-10-06.list-builds-input/next-token]))

(clojure.spec.alpha/def :portkey.aws.codebuild.-2016-10-06/project-name (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__1410938__auto__] (clojure.core/<= 2 (clojure.core/count s__1410938__auto__))) (clojure.core/fn [s__1410939__auto__] (clojure.core/< (clojure.core/count s__1410939__auto__) 255)) (clojure.core/fn [s__1410940__auto__] (clojure.core/re-matches #"[A-Za-z0-9][A-Za-z0-9\-_]{1,254}" s__1410940__auto__))))

(clojure.spec.alpha/def :portkey.aws.codebuild.-2016-10-06/git-clone-depth (clojure.spec.alpha/int-in 0 Long/MAX_VALUE))

(clojure.spec.alpha/def :portkey.aws.codebuild.-2016-10-06/build-ids (clojure.spec.alpha/coll-of :portkey.aws.codebuild.-2016-10-06/non-empty-string :min-count 1 :max-count 100))

(clojure.spec.alpha/def :portkey.aws.codebuild.-2016-10-06.build-phase/phase-type (clojure.spec.alpha/and :portkey.aws.codebuild.-2016-10-06/build-phase-type))
(clojure.spec.alpha/def :portkey.aws.codebuild.-2016-10-06.build-phase/phase-status (clojure.spec.alpha/and :portkey.aws.codebuild.-2016-10-06/status-type))
(clojure.spec.alpha/def :portkey.aws.codebuild.-2016-10-06.build-phase/start-time (clojure.spec.alpha/and :portkey.aws.codebuild.-2016-10-06/timestamp))
(clojure.spec.alpha/def :portkey.aws.codebuild.-2016-10-06.build-phase/end-time (clojure.spec.alpha/and :portkey.aws.codebuild.-2016-10-06/timestamp))
(clojure.spec.alpha/def :portkey.aws.codebuild.-2016-10-06.build-phase/duration-in-seconds (clojure.spec.alpha/and :portkey.aws.codebuild.-2016-10-06/wrapper-long))
(clojure.spec.alpha/def :portkey.aws.codebuild.-2016-10-06.build-phase/contexts (clojure.spec.alpha/and :portkey.aws.codebuild.-2016-10-06/phase-contexts))
(clojure.spec.alpha/def :portkey.aws.codebuild.-2016-10-06/build-phase (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.codebuild.-2016-10-06.build-phase/phase-type :portkey.aws.codebuild.-2016-10-06.build-phase/phase-status :portkey.aws.codebuild.-2016-10-06.build-phase/start-time :portkey.aws.codebuild.-2016-10-06.build-phase/end-time :portkey.aws.codebuild.-2016-10-06.build-phase/duration-in-seconds :portkey.aws.codebuild.-2016-10-06.build-phase/contexts]))

(clojure.spec.alpha/def :portkey.aws.codebuild.-2016-10-06.batch-get-builds-input/ids (clojure.spec.alpha/and :portkey.aws.codebuild.-2016-10-06/build-ids))
(clojure.spec.alpha/def :portkey.aws.codebuild.-2016-10-06/batch-get-builds-input (clojure.spec.alpha/keys :req-un [:portkey.aws.codebuild.-2016-10-06.batch-get-builds-input/ids] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.codebuild.-2016-10-06.list-builds-for-project-input/project-name (clojure.spec.alpha/and :portkey.aws.codebuild.-2016-10-06/non-empty-string))
(clojure.spec.alpha/def :portkey.aws.codebuild.-2016-10-06.list-builds-for-project-input/sort-order (clojure.spec.alpha/and :portkey.aws.codebuild.-2016-10-06/sort-order-type))
(clojure.spec.alpha/def :portkey.aws.codebuild.-2016-10-06.list-builds-for-project-input/next-token (clojure.spec.alpha/and :portkey.aws.codebuild.-2016-10-06/string))
(clojure.spec.alpha/def :portkey.aws.codebuild.-2016-10-06/list-builds-for-project-input (clojure.spec.alpha/keys :req-un [:portkey.aws.codebuild.-2016-10-06.list-builds-for-project-input/project-name] :opt-un [:portkey.aws.codebuild.-2016-10-06.list-builds-for-project-input/sort-order :portkey.aws.codebuild.-2016-10-06.list-builds-for-project-input/next-token]))

(clojure.spec.alpha/def :portkey.aws.codebuild.-2016-10-06/project-artifacts-list (clojure.spec.alpha/coll-of :portkey.aws.codebuild.-2016-10-06/project-artifacts :min-count 0 :max-count 12))

(clojure.spec.alpha/def :portkey.aws.codebuild.-2016-10-06/builds-not-deleted (clojure.spec.alpha/coll-of :portkey.aws.codebuild.-2016-10-06/build-not-deleted))

(clojure.spec.alpha/def :portkey.aws.codebuild.-2016-10-06.source-credentials-info/arn (clojure.spec.alpha/and :portkey.aws.codebuild.-2016-10-06/non-empty-string))
(clojure.spec.alpha/def :portkey.aws.codebuild.-2016-10-06.source-credentials-info/server-type (clojure.spec.alpha/and :portkey.aws.codebuild.-2016-10-06/server-type))
(clojure.spec.alpha/def :portkey.aws.codebuild.-2016-10-06.source-credentials-info/auth-type (clojure.spec.alpha/and :portkey.aws.codebuild.-2016-10-06/auth-type))
(clojure.spec.alpha/def :portkey.aws.codebuild.-2016-10-06/source-credentials-info (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.codebuild.-2016-10-06.source-credentials-info/arn :portkey.aws.codebuild.-2016-10-06.source-credentials-info/server-type :portkey.aws.codebuild.-2016-10-06.source-credentials-info/auth-type]))

(clojure.spec.alpha/def :portkey.aws.codebuild.-2016-10-06/project-secondary-source-versions (clojure.spec.alpha/coll-of :portkey.aws.codebuild.-2016-10-06/project-source-version :min-count 0 :max-count 12))

(clojure.spec.alpha/def :portkey.aws.codebuild.-2016-10-06/phase-contexts (clojure.spec.alpha/coll-of :portkey.aws.codebuild.-2016-10-06/phase-context))

(clojure.spec.alpha/def :portkey.aws.codebuild.-2016-10-06.logs-config/cloud-watch-logs (clojure.spec.alpha/and :portkey.aws.codebuild.-2016-10-06/cloud-watch-logs-config))
(clojure.spec.alpha/def :portkey.aws.codebuild.-2016-10-06.logs-config/s-3-logs (clojure.spec.alpha/and :portkey.aws.codebuild.-2016-10-06/s-3-logs-config))
(clojure.spec.alpha/def :portkey.aws.codebuild.-2016-10-06/logs-config (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.codebuild.-2016-10-06.logs-config/cloud-watch-logs :portkey.aws.codebuild.-2016-10-06.logs-config/s-3-logs]))

(clojure.spec.alpha/def :portkey.aws.codebuild.-2016-10-06.environment-platform/platform (clojure.spec.alpha/and :portkey.aws.codebuild.-2016-10-06/platform-type))
(clojure.spec.alpha/def :portkey.aws.codebuild.-2016-10-06.environment-platform/languages (clojure.spec.alpha/and :portkey.aws.codebuild.-2016-10-06/environment-languages))
(clojure.spec.alpha/def :portkey.aws.codebuild.-2016-10-06/environment-platform (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.codebuild.-2016-10-06.environment-platform/platform :portkey.aws.codebuild.-2016-10-06.environment-platform/languages]))

(clojure.spec.alpha/def :portkey.aws.codebuild.-2016-10-06/artifacts-type #{:s-3 "CODEPIPELINE" :codepipeline :no-artifacts "NO_ARTIFACTS" "S3"})

(clojure.spec.alpha/def :portkey.aws.codebuild.-2016-10-06.stop-build-output/build (clojure.spec.alpha/and :portkey.aws.codebuild.-2016-10-06/build))
(clojure.spec.alpha/def :portkey.aws.codebuild.-2016-10-06/stop-build-output (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.codebuild.-2016-10-06.stop-build-output/build]))

(clojure.spec.alpha/def :portkey.aws.codebuild.-2016-10-06/environment-platforms (clojure.spec.alpha/coll-of :portkey.aws.codebuild.-2016-10-06/environment-platform))

(clojure.spec.alpha/def :portkey.aws.codebuild.-2016-10-06.project-artifacts/override-artifact-name (clojure.spec.alpha/and :portkey.aws.codebuild.-2016-10-06/wrapper-boolean))
(clojure.spec.alpha/def :portkey.aws.codebuild.-2016-10-06.project-artifacts/path (clojure.spec.alpha/and :portkey.aws.codebuild.-2016-10-06/string))
(clojure.spec.alpha/def :portkey.aws.codebuild.-2016-10-06.project-artifacts/encryption-disabled (clojure.spec.alpha/and :portkey.aws.codebuild.-2016-10-06/wrapper-boolean))
(clojure.spec.alpha/def :portkey.aws.codebuild.-2016-10-06.project-artifacts/packaging (clojure.spec.alpha/and :portkey.aws.codebuild.-2016-10-06/artifact-packaging))
(clojure.spec.alpha/def :portkey.aws.codebuild.-2016-10-06.project-artifacts/name (clojure.spec.alpha/and :portkey.aws.codebuild.-2016-10-06/string))
(clojure.spec.alpha/def :portkey.aws.codebuild.-2016-10-06.project-artifacts/location (clojure.spec.alpha/and :portkey.aws.codebuild.-2016-10-06/string))
(clojure.spec.alpha/def :portkey.aws.codebuild.-2016-10-06.project-artifacts/namespace-type (clojure.spec.alpha/and :portkey.aws.codebuild.-2016-10-06/artifact-namespace))
(clojure.spec.alpha/def :portkey.aws.codebuild.-2016-10-06.project-artifacts/artifact-identifier (clojure.spec.alpha/and :portkey.aws.codebuild.-2016-10-06/string))
(clojure.spec.alpha/def :portkey.aws.codebuild.-2016-10-06.project-artifacts/type (clojure.spec.alpha/and :portkey.aws.codebuild.-2016-10-06/artifacts-type))
(clojure.spec.alpha/def :portkey.aws.codebuild.-2016-10-06/project-artifacts (clojure.spec.alpha/keys :req-un [:portkey.aws.codebuild.-2016-10-06.project-artifacts/type] :opt-un [:portkey.aws.codebuild.-2016-10-06.project-artifacts/override-artifact-name :portkey.aws.codebuild.-2016-10-06.project-artifacts/path :portkey.aws.codebuild.-2016-10-06.project-artifacts/encryption-disabled :portkey.aws.codebuild.-2016-10-06.project-artifacts/packaging :portkey.aws.codebuild.-2016-10-06.project-artifacts/name :portkey.aws.codebuild.-2016-10-06.project-artifacts/location :portkey.aws.codebuild.-2016-10-06.project-artifacts/namespace-type :portkey.aws.codebuild.-2016-10-06.project-artifacts/artifact-identifier]))

(clojure.spec.alpha/def :portkey.aws.codebuild.-2016-10-06/boolean clojure.core/boolean?)

(clojure.spec.alpha/def :portkey.aws.codebuild.-2016-10-06.webhook/url (clojure.spec.alpha/and :portkey.aws.codebuild.-2016-10-06/non-empty-string))
(clojure.spec.alpha/def :portkey.aws.codebuild.-2016-10-06.webhook/payload-url (clojure.spec.alpha/and :portkey.aws.codebuild.-2016-10-06/non-empty-string))
(clojure.spec.alpha/def :portkey.aws.codebuild.-2016-10-06.webhook/secret (clojure.spec.alpha/and :portkey.aws.codebuild.-2016-10-06/non-empty-string))
(clojure.spec.alpha/def :portkey.aws.codebuild.-2016-10-06.webhook/branch-filter (clojure.spec.alpha/and :portkey.aws.codebuild.-2016-10-06/string))
(clojure.spec.alpha/def :portkey.aws.codebuild.-2016-10-06.webhook/filter-groups (clojure.spec.alpha/and :portkey.aws.codebuild.-2016-10-06/filter-groups))
(clojure.spec.alpha/def :portkey.aws.codebuild.-2016-10-06.webhook/last-modified-secret (clojure.spec.alpha/and :portkey.aws.codebuild.-2016-10-06/timestamp))
(clojure.spec.alpha/def :portkey.aws.codebuild.-2016-10-06/webhook (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.codebuild.-2016-10-06.webhook/url :portkey.aws.codebuild.-2016-10-06.webhook/payload-url :portkey.aws.codebuild.-2016-10-06.webhook/secret :portkey.aws.codebuild.-2016-10-06.webhook/branch-filter :portkey.aws.codebuild.-2016-10-06.webhook/filter-groups :portkey.aws.codebuild.-2016-10-06.webhook/last-modified-secret]))

(clojure.spec.alpha/def :portkey.aws.codebuild.-2016-10-06/source-credentials-infos (clojure.spec.alpha/coll-of :portkey.aws.codebuild.-2016-10-06/source-credentials-info))

(clojure.core/defn start-build "Starts running a build." ([start-build-inputinput] (clojure.core/let [request-function-result__1411981__auto__ (req-start-build-input start-build-inputinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__1411981__auto__ {:http.request.configuration/endpoints portkey.aws.codebuild.-2016-10-06/endpoints, :http.request.configuration/target-prefix "CodeBuild_20161006", :http.request.spec/output-spec :portkey.aws.codebuild.-2016-10-06/start-build-output, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2016-10-06", :http.request.configuration/service-id "CodeBuild", :http.request.spec/input-spec :portkey.aws.codebuild.-2016-10-06/start-build-input, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "StartBuild", :http.request.configuration/output-deser-fn response-start-build-output, :http.request.spec/error-spec {"InvalidInputException" :portkey.aws.codebuild.-2016-10-06/invalid-input-exception, "ResourceNotFoundException" :portkey.aws.codebuild.-2016-10-06/resource-not-found-exception, "AccountLimitExceededException" :portkey.aws.codebuild.-2016-10-06/account-limit-exceeded-exception}})))))
(clojure.spec.alpha/fdef start-build :args (clojure.spec.alpha/tuple :portkey.aws.codebuild.-2016-10-06/start-build-input) :ret (clojure.spec.alpha/and :portkey.aws.codebuild.-2016-10-06/start-build-output))

(clojure.core/defn list-curated-environment-images "Gets information about Docker images that are managed by AWS CodeBuild." ([] (list-curated-environment-images {})) ([list-curated-environment-images-inputinput] (clojure.core/let [request-function-result__1411981__auto__ (req-list-curated-environment-images-input list-curated-environment-images-inputinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__1411981__auto__ {:http.request.configuration/endpoints portkey.aws.codebuild.-2016-10-06/endpoints, :http.request.configuration/target-prefix "CodeBuild_20161006", :http.request.spec/output-spec :portkey.aws.codebuild.-2016-10-06/list-curated-environment-images-output, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2016-10-06", :http.request.configuration/service-id "CodeBuild", :http.request.spec/input-spec :portkey.aws.codebuild.-2016-10-06/list-curated-environment-images-input, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "ListCuratedEnvironmentImages", :http.request.configuration/output-deser-fn response-list-curated-environment-images-output, :http.request.spec/error-spec {}})))))
(clojure.spec.alpha/fdef list-curated-environment-images :args (clojure.spec.alpha/? :portkey.aws.codebuild.-2016-10-06/list-curated-environment-images-input) :ret (clojure.spec.alpha/and :portkey.aws.codebuild.-2016-10-06/list-curated-environment-images-output))

(clojure.core/defn invalidate-project-cache "Resets the cache for a project." ([invalidate-project-cache-inputinput] (clojure.core/let [request-function-result__1411981__auto__ (req-invalidate-project-cache-input invalidate-project-cache-inputinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__1411981__auto__ {:http.request.configuration/endpoints portkey.aws.codebuild.-2016-10-06/endpoints, :http.request.configuration/target-prefix "CodeBuild_20161006", :http.request.spec/output-spec :portkey.aws.codebuild.-2016-10-06/invalidate-project-cache-output, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2016-10-06", :http.request.configuration/service-id "CodeBuild", :http.request.spec/input-spec :portkey.aws.codebuild.-2016-10-06/invalidate-project-cache-input, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "InvalidateProjectCache", :http.request.configuration/output-deser-fn response-invalidate-project-cache-output, :http.request.spec/error-spec {"InvalidInputException" :portkey.aws.codebuild.-2016-10-06/invalid-input-exception, "ResourceNotFoundException" :portkey.aws.codebuild.-2016-10-06/resource-not-found-exception}})))))
(clojure.spec.alpha/fdef invalidate-project-cache :args (clojure.spec.alpha/tuple :portkey.aws.codebuild.-2016-10-06/invalidate-project-cache-input) :ret (clojure.spec.alpha/and :portkey.aws.codebuild.-2016-10-06/invalidate-project-cache-output))

(clojure.core/defn list-builds "Gets a list of build IDs, with each build ID representing a single build." ([] (list-builds {})) ([list-builds-inputinput] (clojure.core/let [request-function-result__1411981__auto__ (req-list-builds-input list-builds-inputinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__1411981__auto__ {:http.request.configuration/endpoints portkey.aws.codebuild.-2016-10-06/endpoints, :http.request.configuration/target-prefix "CodeBuild_20161006", :http.request.spec/output-spec :portkey.aws.codebuild.-2016-10-06/list-builds-output, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2016-10-06", :http.request.configuration/service-id "CodeBuild", :http.request.spec/input-spec :portkey.aws.codebuild.-2016-10-06/list-builds-input, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "ListBuilds", :http.request.configuration/output-deser-fn response-list-builds-output, :http.request.spec/error-spec {"InvalidInputException" :portkey.aws.codebuild.-2016-10-06/invalid-input-exception}})))))
(clojure.spec.alpha/fdef list-builds :args (clojure.spec.alpha/? :portkey.aws.codebuild.-2016-10-06/list-builds-input) :ret (clojure.spec.alpha/and :portkey.aws.codebuild.-2016-10-06/list-builds-output))

(clojure.core/defn delete-source-credentials " Deletes a set of GitHub, GitHub Enterprise, or Bitbucket source credentials." ([delete-source-credentials-inputinput] (clojure.core/let [request-function-result__1411981__auto__ (req-delete-source-credentials-input delete-source-credentials-inputinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__1411981__auto__ {:http.request.configuration/endpoints portkey.aws.codebuild.-2016-10-06/endpoints, :http.request.configuration/target-prefix "CodeBuild_20161006", :http.request.spec/output-spec :portkey.aws.codebuild.-2016-10-06/delete-source-credentials-output, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2016-10-06", :http.request.configuration/service-id "CodeBuild", :http.request.spec/input-spec :portkey.aws.codebuild.-2016-10-06/delete-source-credentials-input, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "DeleteSourceCredentials", :http.request.configuration/output-deser-fn response-delete-source-credentials-output, :http.request.spec/error-spec {"InvalidInputException" :portkey.aws.codebuild.-2016-10-06/invalid-input-exception, "ResourceNotFoundException" :portkey.aws.codebuild.-2016-10-06/resource-not-found-exception}})))))
(clojure.spec.alpha/fdef delete-source-credentials :args (clojure.spec.alpha/tuple :portkey.aws.codebuild.-2016-10-06/delete-source-credentials-input) :ret (clojure.spec.alpha/and :portkey.aws.codebuild.-2016-10-06/delete-source-credentials-output))

(clojure.core/defn batch-delete-builds "Deletes one or more builds." ([batch-delete-builds-inputinput] (clojure.core/let [request-function-result__1411981__auto__ (req-batch-delete-builds-input batch-delete-builds-inputinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__1411981__auto__ {:http.request.configuration/endpoints portkey.aws.codebuild.-2016-10-06/endpoints, :http.request.configuration/target-prefix "CodeBuild_20161006", :http.request.spec/output-spec :portkey.aws.codebuild.-2016-10-06/batch-delete-builds-output, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2016-10-06", :http.request.configuration/service-id "CodeBuild", :http.request.spec/input-spec :portkey.aws.codebuild.-2016-10-06/batch-delete-builds-input, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "BatchDeleteBuilds", :http.request.configuration/output-deser-fn response-batch-delete-builds-output, :http.request.spec/error-spec {"InvalidInputException" :portkey.aws.codebuild.-2016-10-06/invalid-input-exception}})))))
(clojure.spec.alpha/fdef batch-delete-builds :args (clojure.spec.alpha/tuple :portkey.aws.codebuild.-2016-10-06/batch-delete-builds-input) :ret (clojure.spec.alpha/and :portkey.aws.codebuild.-2016-10-06/batch-delete-builds-output))

(clojure.core/defn create-webhook "For an existing AWS CodeBuild build project that has its source code stored in a\nGitHub or Bitbucket repository, enables AWS CodeBuild to start rebuilding the\nsource code every time a code change is pushed to the repository.\n If you enable webhooks for an AWS CodeBuild project, and the project is used as\na build step in AWS CodePipeline, then two identical builds are created for each\ncommit. One build is triggered through webhooks, and one through AWS\nCodePipeline. Because billing is on a per-build basis, you are billed for both\nbuilds. Therefore, if you are using AWS CodePipeline, we recommend that you\ndisable webhooks in AWS CodeBuild. In the AWS CodeBuild console, clear the\nWebhook box. For more information, see step 5 in Change a Build Project's\nSettings\n(https://docs.aws.amazon.com/codebuild/latest/userguide/change-project.html#change-project-console)." ([create-webhook-inputinput] (clojure.core/let [request-function-result__1411981__auto__ (req-create-webhook-input create-webhook-inputinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__1411981__auto__ {:http.request.configuration/endpoints portkey.aws.codebuild.-2016-10-06/endpoints, :http.request.configuration/target-prefix "CodeBuild_20161006", :http.request.spec/output-spec :portkey.aws.codebuild.-2016-10-06/create-webhook-output, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2016-10-06", :http.request.configuration/service-id "CodeBuild", :http.request.spec/input-spec :portkey.aws.codebuild.-2016-10-06/create-webhook-input, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "CreateWebhook", :http.request.configuration/output-deser-fn response-create-webhook-output, :http.request.spec/error-spec {"InvalidInputException" :portkey.aws.codebuild.-2016-10-06/invalid-input-exception, "OAuthProviderException" :portkey.aws.codebuild.-2016-10-06/o-auth-provider-exception, "ResourceAlreadyExistsException" :portkey.aws.codebuild.-2016-10-06/resource-already-exists-exception, "ResourceNotFoundException" :portkey.aws.codebuild.-2016-10-06/resource-not-found-exception}})))))
(clojure.spec.alpha/fdef create-webhook :args (clojure.spec.alpha/tuple :portkey.aws.codebuild.-2016-10-06/create-webhook-input) :ret (clojure.spec.alpha/and :portkey.aws.codebuild.-2016-10-06/create-webhook-output))

(clojure.core/defn list-projects "Gets a list of build project names, with each build project name representing a\nsingle build project." ([] (list-projects {})) ([list-projects-inputinput] (clojure.core/let [request-function-result__1411981__auto__ (req-list-projects-input list-projects-inputinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__1411981__auto__ {:http.request.configuration/endpoints portkey.aws.codebuild.-2016-10-06/endpoints, :http.request.configuration/target-prefix "CodeBuild_20161006", :http.request.spec/output-spec :portkey.aws.codebuild.-2016-10-06/list-projects-output, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2016-10-06", :http.request.configuration/service-id "CodeBuild", :http.request.spec/input-spec :portkey.aws.codebuild.-2016-10-06/list-projects-input, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "ListProjects", :http.request.configuration/output-deser-fn response-list-projects-output, :http.request.spec/error-spec {"InvalidInputException" :portkey.aws.codebuild.-2016-10-06/invalid-input-exception}})))))
(clojure.spec.alpha/fdef list-projects :args (clojure.spec.alpha/? :portkey.aws.codebuild.-2016-10-06/list-projects-input) :ret (clojure.spec.alpha/and :portkey.aws.codebuild.-2016-10-06/list-projects-output))

(clojure.core/defn delete-webhook "For an existing AWS CodeBuild build project that has its source code stored in a\nGitHub or Bitbucket repository, stops AWS CodeBuild from rebuilding the source\ncode every time a code change is pushed to the repository." ([delete-webhook-inputinput] (clojure.core/let [request-function-result__1411981__auto__ (req-delete-webhook-input delete-webhook-inputinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__1411981__auto__ {:http.request.configuration/endpoints portkey.aws.codebuild.-2016-10-06/endpoints, :http.request.configuration/target-prefix "CodeBuild_20161006", :http.request.spec/output-spec :portkey.aws.codebuild.-2016-10-06/delete-webhook-output, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2016-10-06", :http.request.configuration/service-id "CodeBuild", :http.request.spec/input-spec :portkey.aws.codebuild.-2016-10-06/delete-webhook-input, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "DeleteWebhook", :http.request.configuration/output-deser-fn response-delete-webhook-output, :http.request.spec/error-spec {"InvalidInputException" :portkey.aws.codebuild.-2016-10-06/invalid-input-exception, "ResourceNotFoundException" :portkey.aws.codebuild.-2016-10-06/resource-not-found-exception, "OAuthProviderException" :portkey.aws.codebuild.-2016-10-06/o-auth-provider-exception}})))))
(clojure.spec.alpha/fdef delete-webhook :args (clojure.spec.alpha/tuple :portkey.aws.codebuild.-2016-10-06/delete-webhook-input) :ret (clojure.spec.alpha/and :portkey.aws.codebuild.-2016-10-06/delete-webhook-output))

(clojure.core/defn batch-get-projects "Gets information about build projects." ([batch-get-projects-inputinput] (clojure.core/let [request-function-result__1411981__auto__ (req-batch-get-projects-input batch-get-projects-inputinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__1411981__auto__ {:http.request.configuration/endpoints portkey.aws.codebuild.-2016-10-06/endpoints, :http.request.configuration/target-prefix "CodeBuild_20161006", :http.request.spec/output-spec :portkey.aws.codebuild.-2016-10-06/batch-get-projects-output, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2016-10-06", :http.request.configuration/service-id "CodeBuild", :http.request.spec/input-spec :portkey.aws.codebuild.-2016-10-06/batch-get-projects-input, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "BatchGetProjects", :http.request.configuration/output-deser-fn response-batch-get-projects-output, :http.request.spec/error-spec {"InvalidInputException" :portkey.aws.codebuild.-2016-10-06/invalid-input-exception}})))))
(clojure.spec.alpha/fdef batch-get-projects :args (clojure.spec.alpha/tuple :portkey.aws.codebuild.-2016-10-06/batch-get-projects-input) :ret (clojure.spec.alpha/and :portkey.aws.codebuild.-2016-10-06/batch-get-projects-output))

(clojure.core/defn update-project "Changes the settings of a build project." ([update-project-inputinput] (clojure.core/let [request-function-result__1411981__auto__ (req-update-project-input update-project-inputinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__1411981__auto__ {:http.request.configuration/endpoints portkey.aws.codebuild.-2016-10-06/endpoints, :http.request.configuration/target-prefix "CodeBuild_20161006", :http.request.spec/output-spec :portkey.aws.codebuild.-2016-10-06/update-project-output, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2016-10-06", :http.request.configuration/service-id "CodeBuild", :http.request.spec/input-spec :portkey.aws.codebuild.-2016-10-06/update-project-input, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "UpdateProject", :http.request.configuration/output-deser-fn response-update-project-output, :http.request.spec/error-spec {"InvalidInputException" :portkey.aws.codebuild.-2016-10-06/invalid-input-exception, "ResourceNotFoundException" :portkey.aws.codebuild.-2016-10-06/resource-not-found-exception}})))))
(clojure.spec.alpha/fdef update-project :args (clojure.spec.alpha/tuple :portkey.aws.codebuild.-2016-10-06/update-project-input) :ret (clojure.spec.alpha/and :portkey.aws.codebuild.-2016-10-06/update-project-output))

(clojure.core/defn batch-get-builds "Gets information about builds." ([batch-get-builds-inputinput] (clojure.core/let [request-function-result__1411981__auto__ (req-batch-get-builds-input batch-get-builds-inputinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__1411981__auto__ {:http.request.configuration/endpoints portkey.aws.codebuild.-2016-10-06/endpoints, :http.request.configuration/target-prefix "CodeBuild_20161006", :http.request.spec/output-spec :portkey.aws.codebuild.-2016-10-06/batch-get-builds-output, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2016-10-06", :http.request.configuration/service-id "CodeBuild", :http.request.spec/input-spec :portkey.aws.codebuild.-2016-10-06/batch-get-builds-input, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "BatchGetBuilds", :http.request.configuration/output-deser-fn response-batch-get-builds-output, :http.request.spec/error-spec {"InvalidInputException" :portkey.aws.codebuild.-2016-10-06/invalid-input-exception}})))))
(clojure.spec.alpha/fdef batch-get-builds :args (clojure.spec.alpha/tuple :portkey.aws.codebuild.-2016-10-06/batch-get-builds-input) :ret (clojure.spec.alpha/and :portkey.aws.codebuild.-2016-10-06/batch-get-builds-output))

(clojure.core/defn update-webhook " Updates the webhook associated with an AWS CodeBuild build project.\n If you use Bitbucket for your repository, rotateSecret is ignored." ([update-webhook-inputinput] (clojure.core/let [request-function-result__1411981__auto__ (req-update-webhook-input update-webhook-inputinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__1411981__auto__ {:http.request.configuration/endpoints portkey.aws.codebuild.-2016-10-06/endpoints, :http.request.configuration/target-prefix "CodeBuild_20161006", :http.request.spec/output-spec :portkey.aws.codebuild.-2016-10-06/update-webhook-output, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2016-10-06", :http.request.configuration/service-id "CodeBuild", :http.request.spec/input-spec :portkey.aws.codebuild.-2016-10-06/update-webhook-input, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "UpdateWebhook", :http.request.configuration/output-deser-fn response-update-webhook-output, :http.request.spec/error-spec {"InvalidInputException" :portkey.aws.codebuild.-2016-10-06/invalid-input-exception, "ResourceNotFoundException" :portkey.aws.codebuild.-2016-10-06/resource-not-found-exception, "OAuthProviderException" :portkey.aws.codebuild.-2016-10-06/o-auth-provider-exception}})))))
(clojure.spec.alpha/fdef update-webhook :args (clojure.spec.alpha/tuple :portkey.aws.codebuild.-2016-10-06/update-webhook-input) :ret (clojure.spec.alpha/and :portkey.aws.codebuild.-2016-10-06/update-webhook-output))

(clojure.core/defn stop-build "Attempts to stop running a build." ([stop-build-inputinput] (clojure.core/let [request-function-result__1411981__auto__ (req-stop-build-input stop-build-inputinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__1411981__auto__ {:http.request.configuration/endpoints portkey.aws.codebuild.-2016-10-06/endpoints, :http.request.configuration/target-prefix "CodeBuild_20161006", :http.request.spec/output-spec :portkey.aws.codebuild.-2016-10-06/stop-build-output, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2016-10-06", :http.request.configuration/service-id "CodeBuild", :http.request.spec/input-spec :portkey.aws.codebuild.-2016-10-06/stop-build-input, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "StopBuild", :http.request.configuration/output-deser-fn response-stop-build-output, :http.request.spec/error-spec {"InvalidInputException" :portkey.aws.codebuild.-2016-10-06/invalid-input-exception, "ResourceNotFoundException" :portkey.aws.codebuild.-2016-10-06/resource-not-found-exception}})))))
(clojure.spec.alpha/fdef stop-build :args (clojure.spec.alpha/tuple :portkey.aws.codebuild.-2016-10-06/stop-build-input) :ret (clojure.spec.alpha/and :portkey.aws.codebuild.-2016-10-06/stop-build-output))

(clojure.core/defn delete-project "Deletes a build project." ([delete-project-inputinput] (clojure.core/let [request-function-result__1411981__auto__ (req-delete-project-input delete-project-inputinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__1411981__auto__ {:http.request.configuration/endpoints portkey.aws.codebuild.-2016-10-06/endpoints, :http.request.configuration/target-prefix "CodeBuild_20161006", :http.request.spec/output-spec :portkey.aws.codebuild.-2016-10-06/delete-project-output, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2016-10-06", :http.request.configuration/service-id "CodeBuild", :http.request.spec/input-spec :portkey.aws.codebuild.-2016-10-06/delete-project-input, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "DeleteProject", :http.request.configuration/output-deser-fn response-delete-project-output, :http.request.spec/error-spec {"InvalidInputException" :portkey.aws.codebuild.-2016-10-06/invalid-input-exception}})))))
(clojure.spec.alpha/fdef delete-project :args (clojure.spec.alpha/tuple :portkey.aws.codebuild.-2016-10-06/delete-project-input) :ret (clojure.spec.alpha/and :portkey.aws.codebuild.-2016-10-06/delete-project-output))

(clojure.core/defn list-source-credentials " Returns a list of SourceCredentialsInfo objects." ([] (list-source-credentials {})) ([list-source-credentials-inputinput] (clojure.core/let [request-function-result__1411981__auto__ (req-list-source-credentials-input list-source-credentials-inputinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__1411981__auto__ {:http.request.configuration/endpoints portkey.aws.codebuild.-2016-10-06/endpoints, :http.request.configuration/target-prefix "CodeBuild_20161006", :http.request.spec/output-spec :portkey.aws.codebuild.-2016-10-06/list-source-credentials-output, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2016-10-06", :http.request.configuration/service-id "CodeBuild", :http.request.spec/input-spec :portkey.aws.codebuild.-2016-10-06/list-source-credentials-input, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "ListSourceCredentials", :http.request.configuration/output-deser-fn response-list-source-credentials-output, :http.request.spec/error-spec {}})))))
(clojure.spec.alpha/fdef list-source-credentials :args (clojure.spec.alpha/? :portkey.aws.codebuild.-2016-10-06/list-source-credentials-input) :ret (clojure.spec.alpha/and :portkey.aws.codebuild.-2016-10-06/list-source-credentials-output))

(clojure.core/defn list-builds-for-project "Gets a list of build IDs for the specified build project, with each build ID\nrepresenting a single build." ([list-builds-for-project-inputinput] (clojure.core/let [request-function-result__1411981__auto__ (req-list-builds-for-project-input list-builds-for-project-inputinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__1411981__auto__ {:http.request.configuration/endpoints portkey.aws.codebuild.-2016-10-06/endpoints, :http.request.configuration/target-prefix "CodeBuild_20161006", :http.request.spec/output-spec :portkey.aws.codebuild.-2016-10-06/list-builds-for-project-output, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2016-10-06", :http.request.configuration/service-id "CodeBuild", :http.request.spec/input-spec :portkey.aws.codebuild.-2016-10-06/list-builds-for-project-input, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "ListBuildsForProject", :http.request.configuration/output-deser-fn response-list-builds-for-project-output, :http.request.spec/error-spec {"InvalidInputException" :portkey.aws.codebuild.-2016-10-06/invalid-input-exception, "ResourceNotFoundException" :portkey.aws.codebuild.-2016-10-06/resource-not-found-exception}})))))
(clojure.spec.alpha/fdef list-builds-for-project :args (clojure.spec.alpha/tuple :portkey.aws.codebuild.-2016-10-06/list-builds-for-project-input) :ret (clojure.spec.alpha/and :portkey.aws.codebuild.-2016-10-06/list-builds-for-project-output))

(clojure.core/defn import-source-credentials " Imports the source repository credentials for an AWS CodeBuild project that has\nits source code stored in a GitHub, GitHub Enterprise, or Bitbucket repository." ([import-source-credentials-inputinput] (clojure.core/let [request-function-result__1411981__auto__ (req-import-source-credentials-input import-source-credentials-inputinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__1411981__auto__ {:http.request.configuration/endpoints portkey.aws.codebuild.-2016-10-06/endpoints, :http.request.configuration/target-prefix "CodeBuild_20161006", :http.request.spec/output-spec :portkey.aws.codebuild.-2016-10-06/import-source-credentials-output, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2016-10-06", :http.request.configuration/service-id "CodeBuild", :http.request.spec/input-spec :portkey.aws.codebuild.-2016-10-06/import-source-credentials-input, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "ImportSourceCredentials", :http.request.configuration/output-deser-fn response-import-source-credentials-output, :http.request.spec/error-spec {"InvalidInputException" :portkey.aws.codebuild.-2016-10-06/invalid-input-exception, "AccountLimitExceededException" :portkey.aws.codebuild.-2016-10-06/account-limit-exceeded-exception}})))))
(clojure.spec.alpha/fdef import-source-credentials :args (clojure.spec.alpha/tuple :portkey.aws.codebuild.-2016-10-06/import-source-credentials-input) :ret (clojure.spec.alpha/and :portkey.aws.codebuild.-2016-10-06/import-source-credentials-output))

(clojure.core/defn create-project "Creates a build project." ([create-project-inputinput] (clojure.core/let [request-function-result__1411981__auto__ (req-create-project-input create-project-inputinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__1411981__auto__ {:http.request.configuration/endpoints portkey.aws.codebuild.-2016-10-06/endpoints, :http.request.configuration/target-prefix "CodeBuild_20161006", :http.request.spec/output-spec :portkey.aws.codebuild.-2016-10-06/create-project-output, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2016-10-06", :http.request.configuration/service-id "CodeBuild", :http.request.spec/input-spec :portkey.aws.codebuild.-2016-10-06/create-project-input, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "CreateProject", :http.request.configuration/output-deser-fn response-create-project-output, :http.request.spec/error-spec {"InvalidInputException" :portkey.aws.codebuild.-2016-10-06/invalid-input-exception, "ResourceAlreadyExistsException" :portkey.aws.codebuild.-2016-10-06/resource-already-exists-exception, "AccountLimitExceededException" :portkey.aws.codebuild.-2016-10-06/account-limit-exceeded-exception}})))))
(clojure.spec.alpha/fdef create-project :args (clojure.spec.alpha/tuple :portkey.aws.codebuild.-2016-10-06/create-project-input) :ret (clojure.spec.alpha/and :portkey.aws.codebuild.-2016-10-06/create-project-output))
