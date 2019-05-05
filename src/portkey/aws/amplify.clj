(ns portkey.aws.amplify (:require [portkey.aws]))

(def endpoints 'nil)

(clojure.core/declare ser-sub-domain-setting)

(clojure.core/declare ser-oauth-token)

(clojure.core/declare ser-service-role-arn)

(clojure.core/declare ser-basic-auth-credentials)

(clojure.core/declare ser-enable-branch-auto-build)

(clojure.core/declare ser-enable-notification)

(clojure.core/declare ser-platform)

(clojure.core/declare ser-enable-auto-sub-domain)

(clojure.core/declare ser-source)

(clojure.core/declare ser-job-type)

(clojure.core/declare ser-environment-variables)

(clojure.core/declare ser-branch-name)

(clojure.core/declare ser-repository)

(clojure.core/declare ser-env-value)

(clojure.core/declare ser-tag-key)

(clojure.core/declare ser-env-key)

(clojure.core/declare ser-tags)

(clojure.core/declare ser-sub-domain-settings)

(clojure.core/declare ser-status)

(clojure.core/declare ser-next-token)

(clojure.core/declare ser-commit-id)

(clojure.core/declare ser-ttl)

(clojure.core/declare ser-description)

(clojure.core/declare ser-tag-value)

(clojure.core/declare ser-build-spec)

(clojure.core/declare ser-framework)

(clojure.core/declare ser-app-id)

(clojure.core/declare ser-domain-prefix)

(clojure.core/declare ser-max-results)

(clojure.core/declare ser-enable-auto-build)

(clojure.core/declare ser-condition)

(clojure.core/declare ser-domain-name)

(clojure.core/declare ser-target)

(clojure.core/declare ser-name)

(clojure.core/declare ser-job-reason)

(clojure.core/declare ser-commit-message)

(clojure.core/declare ser-custom-rule)

(clojure.core/declare ser-stage)

(clojure.core/declare ser-custom-rules)

(clojure.core/declare ser-enable-basic-auth)

(clojure.core/declare ser-commit-time)

(clojure.core/declare ser-job-id)

(clojure.core/defn- ser-sub-domain-setting [input] (clojure.core/cond-> #:http.request.field{:value [(clojure.core/into (ser-domain-prefix (:prefix input)) #:http.request.field{:name "prefix", :shape "DomainPrefix"}) (clojure.core/into (ser-branch-name (:branch-name input)) #:http.request.field{:name "branchName", :shape "BranchName"})], :shape "SubDomainSetting", :type "structure"}))

(clojure.core/defn- ser-oauth-token [input] #:http.request.field{:value input, :shape "OauthToken"})

(clojure.core/defn- ser-service-role-arn [input] #:http.request.field{:value input, :shape "ServiceRoleArn"})

(clojure.core/defn- ser-basic-auth-credentials [input] #:http.request.field{:value input, :shape "BasicAuthCredentials"})

(clojure.core/defn- ser-enable-branch-auto-build [input] #:http.request.field{:value input, :shape "EnableBranchAutoBuild"})

(clojure.core/defn- ser-enable-notification [input] #:http.request.field{:value input, :shape "EnableNotification"})

(clojure.core/defn- ser-platform [input] #:http.request.field{:value (clojure.core/get {"IOS" "IOS", :ios "IOS", "ANDROID" "ANDROID", :android "ANDROID", "WEB" "WEB", :web "WEB", "REACT_NATIVE" "REACT_NATIVE", :react-native "REACT_NATIVE"} input), :shape "Platform"})

(clojure.core/defn- ser-enable-auto-sub-domain [input] #:http.request.field{:value input, :shape "EnableAutoSubDomain"})

(clojure.core/defn- ser-source [input] #:http.request.field{:value input, :shape "Source"})

(clojure.core/defn- ser-job-type [input] #:http.request.field{:value (clojure.core/get {"RELEASE" "RELEASE", :release "RELEASE", "RETRY" "RETRY", :retry "RETRY", "WEB_HOOK" "WEB_HOOK", :web-hook "WEB_HOOK"} input), :shape "JobType"})

(clojure.core/defn- ser-environment-variables [input] #:http.request.field{:value (clojure.core/into [] (clojure.core/map (clojure.core/fn [[k v]] [(clojure.core/into (ser-env-key k) #:http.request.field{:map-info "key", :shape "EnvKey"}) (clojure.core/into (ser-env-value v) #:http.request.field{:map-info "value", :shape "EnvValue"})])) input), :shape "EnvironmentVariables", :type "map"})

(clojure.core/defn- ser-branch-name [input] #:http.request.field{:value input, :shape "BranchName"})

(clojure.core/defn- ser-repository [input] #:http.request.field{:value input, :shape "Repository"})

(clojure.core/defn- ser-env-value [input] #:http.request.field{:value input, :shape "EnvValue"})

(clojure.core/defn- ser-tag-key [input] #:http.request.field{:value input, :shape "TagKey"})

(clojure.core/defn- ser-env-key [input] #:http.request.field{:value input, :shape "EnvKey"})

(clojure.core/defn- ser-tags [input] #:http.request.field{:value (clojure.core/into [] (clojure.core/map (clojure.core/fn [[k v]] [(clojure.core/into (ser-tag-key k) #:http.request.field{:map-info "key", :shape "TagKey"}) (clojure.core/into (ser-tag-value v) #:http.request.field{:map-info "value", :shape "TagValue"})])) input), :shape "Tags", :type "map"})

(clojure.core/defn- ser-sub-domain-settings [input] #:http.request.field{:value (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (clojure.core/merge (ser-sub-domain-setting coll) #:http.request.field{:shape "SubDomainSetting"}))) input), :shape "SubDomainSettings", :type "list", :max 255})

(clojure.core/defn- ser-status [input] #:http.request.field{:value input, :shape "Status"})

(clojure.core/defn- ser-next-token [input] #:http.request.field{:value input, :shape "NextToken"})

(clojure.core/defn- ser-commit-id [input] #:http.request.field{:value input, :shape "CommitId"})

(clojure.core/defn- ser-ttl [input] #:http.request.field{:value input, :shape "TTL"})

(clojure.core/defn- ser-description [input] #:http.request.field{:value input, :shape "Description"})

(clojure.core/defn- ser-tag-value [input] #:http.request.field{:value input, :shape "TagValue"})

(clojure.core/defn- ser-build-spec [input] #:http.request.field{:value input, :shape "BuildSpec"})

(clojure.core/defn- ser-framework [input] #:http.request.field{:value input, :shape "Framework"})

(clojure.core/defn- ser-app-id [input] #:http.request.field{:value input, :shape "AppId"})

(clojure.core/defn- ser-domain-prefix [input] #:http.request.field{:value input, :shape "DomainPrefix"})

(clojure.core/defn- ser-max-results [input] #:http.request.field{:value input, :shape "MaxResults"})

(clojure.core/defn- ser-enable-auto-build [input] #:http.request.field{:value input, :shape "EnableAutoBuild"})

(clojure.core/defn- ser-condition [input] #:http.request.field{:value input, :shape "Condition"})

(clojure.core/defn- ser-domain-name [input] #:http.request.field{:value input, :shape "DomainName"})

(clojure.core/defn- ser-target [input] #:http.request.field{:value input, :shape "Target"})

(clojure.core/defn- ser-name [input] #:http.request.field{:value input, :shape "Name"})

(clojure.core/defn- ser-job-reason [input] #:http.request.field{:value input, :shape "JobReason"})

(clojure.core/defn- ser-commit-message [input] #:http.request.field{:value input, :shape "CommitMessage"})

(clojure.core/defn- ser-custom-rule [input] (clojure.core/cond-> #:http.request.field{:value [(clojure.core/into (ser-source (:source input)) #:http.request.field{:name "source", :shape "Source"}) (clojure.core/into (ser-target (:target input)) #:http.request.field{:name "target", :shape "Target"})], :shape "CustomRule", :type "structure"} (clojure.core/contains? input :status) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-status (input :status)) #:http.request.field{:name "status", :shape "Status"})) (clojure.core/contains? input :condition) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-condition (input :condition)) #:http.request.field{:name "condition", :shape "Condition"}))))

(clojure.core/defn- ser-stage [input] #:http.request.field{:value (clojure.core/get {"PRODUCTION" "PRODUCTION", :production "PRODUCTION", "BETA" "BETA", :beta "BETA", "DEVELOPMENT" "DEVELOPMENT", :development "DEVELOPMENT", "EXPERIMENTAL" "EXPERIMENTAL", :experimental "EXPERIMENTAL"} input), :shape "Stage"})

(clojure.core/defn- ser-custom-rules [input] #:http.request.field{:value (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (clojure.core/merge (ser-custom-rule coll) #:http.request.field{:shape "CustomRule"}))) input), :shape "CustomRules", :type "list"})

(clojure.core/defn- ser-enable-basic-auth [input] #:http.request.field{:value input, :shape "EnableBasicAuth"})

(clojure.core/defn- ser-commit-time [input] #:http.request.field{:value input, :shape "CommitTime"})

(clojure.core/defn- ser-job-id [input] #:http.request.field{:value input, :shape "JobId"})

(clojure.core/defn- req-update-domain-association-request [input] (clojure.core/cond-> #:http.request.configuration{:uri [(clojure.core/into (ser-app-id (input :app-id)) #:http.request.field{:name "appId", :shape "AppId", :location "uri", :location-name "appId"}) (clojure.core/into (ser-domain-name (input :domain-name)) #:http.request.field{:name "domainName", :shape "DomainName", :location "uri", :location-name "domainName"})], :body [(clojure.core/into (ser-sub-domain-settings (input :sub-domain-settings)) #:http.request.field{:name "subDomainSettings", :shape "SubDomainSettings"})]} (clojure.core/contains? input :enable-auto-sub-domain) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-enable-auto-sub-domain (input :enable-auto-sub-domain)) #:http.request.field{:name "enableAutoSubDomain", :shape "EnableAutoSubDomain"}))))

(clojure.core/defn- req-get-branch-request [input] (clojure.core/cond-> #:http.request.configuration{:uri [(clojure.core/into (ser-app-id (input :app-id)) #:http.request.field{:name "appId", :shape "AppId", :location "uri", :location-name "appId"}) (clojure.core/into (ser-branch-name (input :branch-name)) #:http.request.field{:name "branchName", :shape "BranchName", :location "uri", :location-name "branchName"})]}))

(clojure.core/defn- req-create-app-request [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (ser-name (input :name)) #:http.request.field{:name "name", :shape "Name"}) (clojure.core/into (ser-repository (input :repository)) #:http.request.field{:name "repository", :shape "Repository"}) (clojure.core/into (ser-platform (input :platform)) #:http.request.field{:name "platform", :shape "Platform"}) (clojure.core/into (ser-oauth-token (input :oauth-token)) #:http.request.field{:name "oauthToken", :shape "OauthToken"})]} (clojure.core/contains? input :basic-auth-credentials) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-basic-auth-credentials (input :basic-auth-credentials)) #:http.request.field{:name "basicAuthCredentials", :shape "BasicAuthCredentials"})) (clojure.core/contains? input :build-spec) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-build-spec (input :build-spec)) #:http.request.field{:name "buildSpec", :shape "BuildSpec"})) (clojure.core/contains? input :custom-rules) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-custom-rules (input :custom-rules)) #:http.request.field{:name "customRules", :shape "CustomRules"})) (clojure.core/contains? input :tags) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-tags (input :tags)) #:http.request.field{:name "tags", :shape "Tags"})) (clojure.core/contains? input :iam-service-role-arn) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-service-role-arn (input :iam-service-role-arn)) #:http.request.field{:name "iamServiceRoleArn", :shape "ServiceRoleArn"})) (clojure.core/contains? input :environment-variables) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-environment-variables (input :environment-variables)) #:http.request.field{:name "environmentVariables", :shape "EnvironmentVariables"})) (clojure.core/contains? input :enable-branch-auto-build) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-enable-branch-auto-build (input :enable-branch-auto-build)) #:http.request.field{:name "enableBranchAutoBuild", :shape "EnableBranchAutoBuild"})) (clojure.core/contains? input :enable-basic-auth) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-enable-basic-auth (input :enable-basic-auth)) #:http.request.field{:name "enableBasicAuth", :shape "EnableBasicAuth"})) (clojure.core/contains? input :description) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-description (input :description)) #:http.request.field{:name "description", :shape "Description"}))))

(clojure.core/defn- req-create-domain-association-request [input] (clojure.core/cond-> #:http.request.configuration{:uri [(clojure.core/into (ser-app-id (input :app-id)) #:http.request.field{:name "appId", :shape "AppId", :location "uri", :location-name "appId"})], :body [(clojure.core/into (ser-domain-name (input :domain-name)) #:http.request.field{:name "domainName", :shape "DomainName"}) (clojure.core/into (ser-sub-domain-settings (input :sub-domain-settings)) #:http.request.field{:name "subDomainSettings", :shape "SubDomainSettings"})]} (clojure.core/contains? input :enable-auto-sub-domain) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-enable-auto-sub-domain (input :enable-auto-sub-domain)) #:http.request.field{:name "enableAutoSubDomain", :shape "EnableAutoSubDomain"}))))

(clojure.core/defn- req-update-app-request [input] (clojure.core/cond-> #:http.request.configuration{:uri [(clojure.core/into (ser-app-id (input :app-id)) #:http.request.field{:name "appId", :shape "AppId", :location "uri", :location-name "appId"})]} (clojure.core/contains? input :basic-auth-credentials) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-basic-auth-credentials (input :basic-auth-credentials)) #:http.request.field{:name "basicAuthCredentials", :shape "BasicAuthCredentials"})) (clojure.core/contains? input :build-spec) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-build-spec (input :build-spec)) #:http.request.field{:name "buildSpec", :shape "BuildSpec"})) (clojure.core/contains? input :custom-rules) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-custom-rules (input :custom-rules)) #:http.request.field{:name "customRules", :shape "CustomRules"})) (clojure.core/contains? input :iam-service-role-arn) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-service-role-arn (input :iam-service-role-arn)) #:http.request.field{:name "iamServiceRoleArn", :shape "ServiceRoleArn"})) (clojure.core/contains? input :name) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-name (input :name)) #:http.request.field{:name "name", :shape "Name"})) (clojure.core/contains? input :environment-variables) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-environment-variables (input :environment-variables)) #:http.request.field{:name "environmentVariables", :shape "EnvironmentVariables"})) (clojure.core/contains? input :enable-branch-auto-build) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-enable-auto-build (input :enable-branch-auto-build)) #:http.request.field{:name "enableBranchAutoBuild", :shape "EnableAutoBuild"})) (clojure.core/contains? input :enable-basic-auth) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-enable-basic-auth (input :enable-basic-auth)) #:http.request.field{:name "enableBasicAuth", :shape "EnableBasicAuth"})) (clojure.core/contains? input :platform) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-platform (input :platform)) #:http.request.field{:name "platform", :shape "Platform"})) (clojure.core/contains? input :description) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-description (input :description)) #:http.request.field{:name "description", :shape "Description"}))))

(clojure.core/defn- req-list-jobs-request [input] (clojure.core/cond-> #:http.request.configuration{:uri [(clojure.core/into (ser-app-id (input :app-id)) #:http.request.field{:name "appId", :shape "AppId", :location "uri", :location-name "appId"}) (clojure.core/into (ser-branch-name (input :branch-name)) #:http.request.field{:name "branchName", :shape "BranchName", :location "uri", :location-name "branchName"})]} (clojure.core/contains? input :next-token) (clojure.core/update-in [:http.request.configuration/querystring] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-next-token (input :next-token)) #:http.request.field{:name "nextToken", :shape "NextToken", :location "querystring", :location-name "nextToken"})) (clojure.core/contains? input :max-results) (clojure.core/update-in [:http.request.configuration/querystring] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-max-results (input :max-results)) #:http.request.field{:name "maxResults", :shape "MaxResults", :location "querystring", :location-name "maxResults"}))))

(clojure.core/defn- req-get-domain-association-request [input] (clojure.core/cond-> #:http.request.configuration{:uri [(clojure.core/into (ser-app-id (input :app-id)) #:http.request.field{:name "appId", :shape "AppId", :location "uri", :location-name "appId"}) (clojure.core/into (ser-domain-name (input :domain-name)) #:http.request.field{:name "domainName", :shape "DomainName", :location "uri", :location-name "domainName"})]}))

(clojure.core/defn- req-stop-job-request [input] (clojure.core/cond-> #:http.request.configuration{:uri [(clojure.core/into (ser-app-id (input :app-id)) #:http.request.field{:name "appId", :shape "AppId", :location "uri", :location-name "appId"}) (clojure.core/into (ser-branch-name (input :branch-name)) #:http.request.field{:name "branchName", :shape "BranchName", :location "uri", :location-name "branchName"}) (clojure.core/into (ser-job-id (input :job-id)) #:http.request.field{:name "jobId", :shape "JobId", :location "uri", :location-name "jobId"})]}))

(clojure.core/defn- req-list-apps-request [input] (clojure.core/cond-> {} (clojure.core/contains? input :next-token) (clojure.core/update-in [:http.request.configuration/querystring] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-next-token (input :next-token)) #:http.request.field{:name "nextToken", :shape "NextToken", :location "querystring", :location-name "nextToken"})) (clojure.core/contains? input :max-results) (clojure.core/update-in [:http.request.configuration/querystring] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-max-results (input :max-results)) #:http.request.field{:name "maxResults", :shape "MaxResults", :location "querystring", :location-name "maxResults"}))))

(clojure.core/defn- req-create-branch-request [input] (clojure.core/cond-> #:http.request.configuration{:uri [(clojure.core/into (ser-app-id (input :app-id)) #:http.request.field{:name "appId", :shape "AppId", :location "uri", :location-name "appId"})], :body [(clojure.core/into (ser-branch-name (input :branch-name)) #:http.request.field{:name "branchName", :shape "BranchName"})]} (clojure.core/contains? input :basic-auth-credentials) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-basic-auth-credentials (input :basic-auth-credentials)) #:http.request.field{:name "basicAuthCredentials", :shape "BasicAuthCredentials"})) (clojure.core/contains? input :build-spec) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-build-spec (input :build-spec)) #:http.request.field{:name "buildSpec", :shape "BuildSpec"})) (clojure.core/contains? input :framework) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-framework (input :framework)) #:http.request.field{:name "framework", :shape "Framework"})) (clojure.core/contains? input :tags) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-tags (input :tags)) #:http.request.field{:name "tags", :shape "Tags"})) (clojure.core/contains? input :enable-notification) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-enable-notification (input :enable-notification)) #:http.request.field{:name "enableNotification", :shape "EnableNotification"})) (clojure.core/contains? input :environment-variables) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-environment-variables (input :environment-variables)) #:http.request.field{:name "environmentVariables", :shape "EnvironmentVariables"})) (clojure.core/contains? input :enable-auto-build) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-enable-auto-build (input :enable-auto-build)) #:http.request.field{:name "enableAutoBuild", :shape "EnableAutoBuild"})) (clojure.core/contains? input :ttl) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-ttl (input :ttl)) #:http.request.field{:name "ttl", :shape "TTL"})) (clojure.core/contains? input :enable-basic-auth) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-enable-basic-auth (input :enable-basic-auth)) #:http.request.field{:name "enableBasicAuth", :shape "EnableBasicAuth"})) (clojure.core/contains? input :description) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-description (input :description)) #:http.request.field{:name "description", :shape "Description"})) (clojure.core/contains? input :stage) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-stage (input :stage)) #:http.request.field{:name "stage", :shape "Stage"}))))

(clojure.core/defn- req-update-branch-request [input] (clojure.core/cond-> #:http.request.configuration{:uri [(clojure.core/into (ser-app-id (input :app-id)) #:http.request.field{:name "appId", :shape "AppId", :location "uri", :location-name "appId"}) (clojure.core/into (ser-branch-name (input :branch-name)) #:http.request.field{:name "branchName", :shape "BranchName", :location "uri", :location-name "branchName"})]} (clojure.core/contains? input :basic-auth-credentials) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-basic-auth-credentials (input :basic-auth-credentials)) #:http.request.field{:name "basicAuthCredentials", :shape "BasicAuthCredentials"})) (clojure.core/contains? input :build-spec) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-build-spec (input :build-spec)) #:http.request.field{:name "buildSpec", :shape "BuildSpec"})) (clojure.core/contains? input :framework) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-framework (input :framework)) #:http.request.field{:name "framework", :shape "Framework"})) (clojure.core/contains? input :enable-notification) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-enable-notification (input :enable-notification)) #:http.request.field{:name "enableNotification", :shape "EnableNotification"})) (clojure.core/contains? input :environment-variables) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-environment-variables (input :environment-variables)) #:http.request.field{:name "environmentVariables", :shape "EnvironmentVariables"})) (clojure.core/contains? input :enable-auto-build) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-enable-auto-build (input :enable-auto-build)) #:http.request.field{:name "enableAutoBuild", :shape "EnableAutoBuild"})) (clojure.core/contains? input :ttl) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-ttl (input :ttl)) #:http.request.field{:name "ttl", :shape "TTL"})) (clojure.core/contains? input :enable-basic-auth) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-enable-basic-auth (input :enable-basic-auth)) #:http.request.field{:name "enableBasicAuth", :shape "EnableBasicAuth"})) (clojure.core/contains? input :description) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-description (input :description)) #:http.request.field{:name "description", :shape "Description"})) (clojure.core/contains? input :stage) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-stage (input :stage)) #:http.request.field{:name "stage", :shape "Stage"}))))

(clojure.core/defn- req-delete-app-request [input] (clojure.core/cond-> #:http.request.configuration{:uri [(clojure.core/into (ser-app-id (input :app-id)) #:http.request.field{:name "appId", :shape "AppId", :location "uri", :location-name "appId"})]}))

(clojure.core/defn- req-get-job-request [input] (clojure.core/cond-> #:http.request.configuration{:uri [(clojure.core/into (ser-app-id (input :app-id)) #:http.request.field{:name "appId", :shape "AppId", :location "uri", :location-name "appId"}) (clojure.core/into (ser-branch-name (input :branch-name)) #:http.request.field{:name "branchName", :shape "BranchName", :location "uri", :location-name "branchName"}) (clojure.core/into (ser-job-id (input :job-id)) #:http.request.field{:name "jobId", :shape "JobId", :location "uri", :location-name "jobId"})]}))

(clojure.core/defn- req-list-domain-associations-request [input] (clojure.core/cond-> #:http.request.configuration{:uri [(clojure.core/into (ser-app-id (input :app-id)) #:http.request.field{:name "appId", :shape "AppId", :location "uri", :location-name "appId"})]} (clojure.core/contains? input :next-token) (clojure.core/update-in [:http.request.configuration/querystring] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-next-token (input :next-token)) #:http.request.field{:name "nextToken", :shape "NextToken", :location "querystring", :location-name "nextToken"})) (clojure.core/contains? input :max-results) (clojure.core/update-in [:http.request.configuration/querystring] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-max-results (input :max-results)) #:http.request.field{:name "maxResults", :shape "MaxResults", :location "querystring", :location-name "maxResults"}))))

(clojure.core/defn- req-get-app-request [input] (clojure.core/cond-> #:http.request.configuration{:uri [(clojure.core/into (ser-app-id (input :app-id)) #:http.request.field{:name "appId", :shape "AppId", :location "uri", :location-name "appId"})]}))

(clojure.core/defn- req-start-job-request [input] (clojure.core/cond-> #:http.request.configuration{:uri [(clojure.core/into (ser-app-id (input :app-id)) #:http.request.field{:name "appId", :shape "AppId", :location "uri", :location-name "appId"}) (clojure.core/into (ser-branch-name (input :branch-name)) #:http.request.field{:name "branchName", :shape "BranchName", :location "uri", :location-name "branchName"})], :body [(clojure.core/into (ser-job-type (input :job-type)) #:http.request.field{:name "jobType", :shape "JobType"})]} (clojure.core/contains? input :job-id) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-job-id (input :job-id)) #:http.request.field{:name "jobId", :shape "JobId"})) (clojure.core/contains? input :job-reason) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-job-reason (input :job-reason)) #:http.request.field{:name "jobReason", :shape "JobReason"})) (clojure.core/contains? input :commit-id) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-commit-id (input :commit-id)) #:http.request.field{:name "commitId", :shape "CommitId"})) (clojure.core/contains? input :commit-message) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-commit-message (input :commit-message)) #:http.request.field{:name "commitMessage", :shape "CommitMessage"})) (clojure.core/contains? input :commit-time) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-commit-time (input :commit-time)) #:http.request.field{:name "commitTime", :shape "CommitTime"}))))

(clojure.core/defn- req-delete-domain-association-request [input] (clojure.core/cond-> #:http.request.configuration{:uri [(clojure.core/into (ser-app-id (input :app-id)) #:http.request.field{:name "appId", :shape "AppId", :location "uri", :location-name "appId"}) (clojure.core/into (ser-domain-name (input :domain-name)) #:http.request.field{:name "domainName", :shape "DomainName", :location "uri", :location-name "domainName"})]}))

(clojure.core/defn- req-delete-job-request [input] (clojure.core/cond-> #:http.request.configuration{:uri [(clojure.core/into (ser-app-id (input :app-id)) #:http.request.field{:name "appId", :shape "AppId", :location "uri", :location-name "appId"}) (clojure.core/into (ser-branch-name (input :branch-name)) #:http.request.field{:name "branchName", :shape "BranchName", :location "uri", :location-name "branchName"}) (clojure.core/into (ser-job-id (input :job-id)) #:http.request.field{:name "jobId", :shape "JobId", :location "uri", :location-name "jobId"})]}))

(clojure.core/defn- req-delete-branch-request [input] (clojure.core/cond-> #:http.request.configuration{:uri [(clojure.core/into (ser-app-id (input :app-id)) #:http.request.field{:name "appId", :shape "AppId", :location "uri", :location-name "appId"}) (clojure.core/into (ser-branch-name (input :branch-name)) #:http.request.field{:name "branchName", :shape "BranchName", :location "uri", :location-name "branchName"})]}))

(clojure.core/defn- req-list-branches-request [input] (clojure.core/cond-> #:http.request.configuration{:uri [(clojure.core/into (ser-app-id (input :app-id)) #:http.request.field{:name "appId", :shape "AppId", :location "uri", :location-name "appId"})]} (clojure.core/contains? input :next-token) (clojure.core/update-in [:http.request.configuration/querystring] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-next-token (input :next-token)) #:http.request.field{:name "nextToken", :shape "NextToken", :location "querystring", :location-name "nextToken"})) (clojure.core/contains? input :max-results) (clojure.core/update-in [:http.request.configuration/querystring] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-max-results (input :max-results)) #:http.request.field{:name "maxResults", :shape "MaxResults", :location "querystring", :location-name "maxResults"}))))

(clojure.core/declare deser-verified)

(clojure.core/declare deser-sub-domain-setting)

(clojure.core/declare deser-thumbnail-name)

(clojure.core/declare deser-service-role-arn)

(clojure.core/declare deser-basic-auth-credentials)

(clojure.core/declare deser-enable-branch-auto-build)

(clojure.core/declare deser-end-time)

(clojure.core/declare deser-enable-notification)

(clojure.core/declare deser-platform)

(clojure.core/declare deser-domain-association-arn)

(clojure.core/declare deser-job-status)

(clojure.core/declare deser-update-time)

(clojure.core/declare deser-enable-auto-sub-domain)

(clojure.core/declare deser-branch)

(clojure.core/declare deser-app)

(clojure.core/declare deser-source)

(clojure.core/declare deser-job-type)

(clojure.core/declare deser-app-arn)

(clojure.core/declare deser-start-time)

(clojure.core/declare deser-environment-variables)

(clojure.core/declare deser-branch-name)

(clojure.core/declare deser-domain-association)

(clojure.core/declare deser-certificate-verification-dns-record)

(clojure.core/declare deser-log-url)

(clojure.core/declare deser-total-number-of-jobs)

(clojure.core/declare deser-repository)

(clojure.core/declare deser-env-value)

(clojure.core/declare deser-tag-key)

(clojure.core/declare deser-env-key)

(clojure.core/declare deser-tags)

(clojure.core/declare deser-production-branch)

(clojure.core/declare deser-status)

(clojure.core/declare deser-next-token)

(clojure.core/declare deser-error-message)

(clojure.core/declare deser-artifacts-url)

(clojure.core/declare deser-step)

(clojure.core/declare deser-commit-id)

(clojure.core/declare deser-screenshots)

(clojure.core/declare deser-domain-status)

(clojure.core/declare deser-custom-domains)

(clojure.core/declare deser-ttl)

(clojure.core/declare deser-display-name)

(clojure.core/declare deser-status-reason)

(clojure.core/declare deser-apps)

(clojure.core/declare deser-description)

(clojure.core/declare deser-tag-value)

(clojure.core/declare deser-steps)

(clojure.core/declare deser-build-spec)

(clojure.core/declare deser-framework)

(clojure.core/declare deser-sub-domain)

(clojure.core/declare deser-sub-domains)

(clojure.core/declare deser-step-name)

(clojure.core/declare deser-app-id)

(clojure.core/declare deser-branches)

(clojure.core/declare deser-custom-domain)

(clojure.core/declare deser-active-job-id)

(clojure.core/declare deser-create-time)

(clojure.core/declare deser-branch-arn)

(clojure.core/declare deser-last-deploy-time)

(clojure.core/declare deser-domain-prefix)

(clojure.core/declare deser-dns-record)

(clojure.core/declare deser-enable-auto-build)

(clojure.core/declare deser-condition)

(clojure.core/declare deser-domain-name)

(clojure.core/declare deser-job)

(clojure.core/declare deser-target)

(clojure.core/declare deser-name)

(clojure.core/declare deser-thumbnail-url)

(clojure.core/declare deser-commit-message)

(clojure.core/declare deser-job-summaries)

(clojure.core/declare deser-domain-associations)

(clojure.core/declare deser-job-summary)

(clojure.core/declare deser-custom-rule)

(clojure.core/declare deser-default-domain)

(clojure.core/declare deser-stage)

(clojure.core/declare deser-job-arn)

(clojure.core/declare deser-custom-rules)

(clojure.core/declare deser-enable-basic-auth)

(clojure.core/declare deser-commit-time)

(clojure.core/declare deser-job-id)

(clojure.core/defn- deser-verified [input] input)

(clojure.core/defn- deser-sub-domain-setting [input] (clojure.core/cond-> {:prefix (deser-domain-prefix (input "prefix")), :branch-name (deser-branch-name (input "branchName"))}))

(clojure.core/defn- deser-thumbnail-name [input] input)

(clojure.core/defn- deser-service-role-arn [input] input)

(clojure.core/defn- deser-basic-auth-credentials [input] input)

(clojure.core/defn- deser-enable-branch-auto-build [input] input)

(clojure.core/defn- deser-end-time [input] input)

(clojure.core/defn- deser-enable-notification [input] input)

(clojure.core/defn- deser-platform [input] (clojure.core/get {"IOS" :ios, "ANDROID" :android, "WEB" :web, "REACT_NATIVE" :react-native} input))

(clojure.core/defn- deser-domain-association-arn [input] input)

(clojure.core/defn- deser-job-status [input] (clojure.core/get {"PENDING" :pending, "PROVISIONING" :provisioning, "RUNNING" :running, "FAILED" :failed, "SUCCEED" :succeed, "CANCELLING" :cancelling, "CANCELLED" :cancelled} input))

(clojure.core/defn- deser-update-time [input] input)

(clojure.core/defn- deser-enable-auto-sub-domain [input] input)

(clojure.core/defn- deser-branch [input] (clojure.core/cond-> {:description (deser-description (input "description")), :total-number-of-jobs (deser-total-number-of-jobs (input "totalNumberOfJobs")), :environment-variables (deser-environment-variables (input "environmentVariables")), :stage (deser-stage (input "stage")), :enable-notification (deser-enable-notification (input "enableNotification")), :branch-arn (deser-branch-arn (input "branchArn")), :update-time (deser-update-time (input "updateTime")), :enable-basic-auth (deser-enable-basic-auth (input "enableBasicAuth")), :active-job-id (deser-active-job-id (input "activeJobId")), :custom-domains (deser-custom-domains (input "customDomains")), :ttl (deser-ttl (input "ttl")), :branch-name (deser-branch-name (input "branchName")), :create-time (deser-create-time (input "createTime")), :enable-auto-build (deser-enable-auto-build (input "enableAutoBuild")), :framework (deser-framework (input "framework"))} (clojure.core/contains? input "basicAuthCredentials") (clojure.core/assoc :basic-auth-credentials (deser-basic-auth-credentials (input "basicAuthCredentials"))) (clojure.core/contains? input "buildSpec") (clojure.core/assoc :build-spec (deser-build-spec (input "buildSpec"))) (clojure.core/contains? input "displayName") (clojure.core/assoc :display-name (deser-display-name (input "displayName"))) (clojure.core/contains? input "tags") (clojure.core/assoc :tags (deser-tags (input "tags"))) (clojure.core/contains? input "thumbnailUrl") (clojure.core/assoc :thumbnail-url (deser-thumbnail-url (input "thumbnailUrl")))))

(clojure.core/defn- deser-app [input] (clojure.core/cond-> {:description (deser-description (input "description")), :enable-branch-auto-build (deser-enable-branch-auto-build (input "enableBranchAutoBuild")), :app-id (deser-app-id (input "appId")), :environment-variables (deser-environment-variables (input "environmentVariables")), :repository (deser-repository (input "repository")), :name (deser-name (input "name")), :update-time (deser-update-time (input "updateTime")), :enable-basic-auth (deser-enable-basic-auth (input "enableBasicAuth")), :app-arn (deser-app-arn (input "appArn")), :default-domain (deser-default-domain (input "defaultDomain")), :create-time (deser-create-time (input "createTime")), :platform (deser-platform (input "platform"))} (clojure.core/contains? input "basicAuthCredentials") (clojure.core/assoc :basic-auth-credentials (deser-basic-auth-credentials (input "basicAuthCredentials"))) (clojure.core/contains? input "buildSpec") (clojure.core/assoc :build-spec (deser-build-spec (input "buildSpec"))) (clojure.core/contains? input "customRules") (clojure.core/assoc :custom-rules (deser-custom-rules (input "customRules"))) (clojure.core/contains? input "tags") (clojure.core/assoc :tags (deser-tags (input "tags"))) (clojure.core/contains? input "iamServiceRoleArn") (clojure.core/assoc :iam-service-role-arn (deser-service-role-arn (input "iamServiceRoleArn"))) (clojure.core/contains? input "productionBranch") (clojure.core/assoc :production-branch (deser-production-branch (input "productionBranch")))))

(clojure.core/defn- deser-source [input] input)

(clojure.core/defn- deser-job-type [input] (clojure.core/get {"RELEASE" :release, "RETRY" :retry, "WEB_HOOK" :web-hook} input))

(clojure.core/defn- deser-app-arn [input] input)

(clojure.core/defn- deser-start-time [input] input)

(clojure.core/defn- deser-environment-variables [input] (clojure.core/into {} (clojure.core/map (clojure.core/fn [[k v]] [(deser-env-key k) (deser-env-value v)])) input))

(clojure.core/defn- deser-branch-name [input] input)

(clojure.core/defn- deser-domain-association [input] (clojure.core/cond-> {:domain-association-arn (deser-domain-association-arn (input "domainAssociationArn")), :domain-name (deser-domain-name (input "domainName")), :enable-auto-sub-domain (deser-enable-auto-sub-domain (input "enableAutoSubDomain")), :domain-status (deser-domain-status (input "domainStatus")), :status-reason (deser-status-reason (input "statusReason")), :certificate-verification-dns-record (deser-certificate-verification-dns-record (input "certificateVerificationDNSRecord")), :sub-domains (deser-sub-domains (input "subDomains"))}))

(clojure.core/defn- deser-certificate-verification-dns-record [input] input)

(clojure.core/defn- deser-log-url [input] input)

(clojure.core/defn- deser-total-number-of-jobs [input] input)

(clojure.core/defn- deser-repository [input] input)

(clojure.core/defn- deser-env-value [input] input)

(clojure.core/defn- deser-tag-key [input] input)

(clojure.core/defn- deser-env-key [input] input)

(clojure.core/defn- deser-tags [input] (clojure.core/into {} (clojure.core/map (clojure.core/fn [[k v]] [(deser-tag-key k) (deser-tag-value v)])) input))

(clojure.core/defn- deser-production-branch [input] (clojure.core/cond-> {} (clojure.core/contains? input "lastDeployTime") (clojure.core/assoc :last-deploy-time (deser-last-deploy-time (input "lastDeployTime"))) (clojure.core/contains? input "status") (clojure.core/assoc :status (deser-status (input "status"))) (clojure.core/contains? input "thumbnailUrl") (clojure.core/assoc :thumbnail-url (deser-thumbnail-url (input "thumbnailUrl"))) (clojure.core/contains? input "branchName") (clojure.core/assoc :branch-name (deser-branch-name (input "branchName")))))

(clojure.core/defn- deser-status [input] input)

(clojure.core/defn- deser-next-token [input] input)

(clojure.core/defn- deser-error-message [input] input)

(clojure.core/defn- deser-artifacts-url [input] input)

(clojure.core/defn- deser-step [input] (clojure.core/cond-> {:step-name (deser-step-name (input "stepName")), :start-time (deser-start-time (input "startTime")), :status (deser-job-status (input "status")), :end-time (deser-end-time (input "endTime"))} (clojure.core/contains? input "logUrl") (clojure.core/assoc :log-url (deser-log-url (input "logUrl"))) (clojure.core/contains? input "artifactsUrl") (clojure.core/assoc :artifacts-url (deser-artifacts-url (input "artifactsUrl"))) (clojure.core/contains? input "screenshots") (clojure.core/assoc :screenshots (deser-screenshots (input "screenshots")))))

(clojure.core/defn- deser-commit-id [input] input)

(clojure.core/defn- deser-screenshots [input] (clojure.core/into {} (clojure.core/map (clojure.core/fn [[k v]] [(deser-thumbnail-name k) (deser-thumbnail-url v)])) input))

(clojure.core/defn- deser-domain-status [input] (clojure.core/get {"PENDING_VERIFICATION" :pending-verification, "IN_PROGRESS" :in-progress, "AVAILABLE" :available, "PENDING_DEPLOYMENT" :pending-deployment, "FAILED" :failed} input))

(clojure.core/defn- deser-custom-domains [input] (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (deser-custom-domain coll))) input))

(clojure.core/defn- deser-ttl [input] input)

(clojure.core/defn- deser-display-name [input] input)

(clojure.core/defn- deser-status-reason [input] input)

(clojure.core/defn- deser-apps [input] (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (deser-app coll))) input))

(clojure.core/defn- deser-description [input] input)

(clojure.core/defn- deser-tag-value [input] input)

(clojure.core/defn- deser-steps [input] (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (deser-step coll))) input))

(clojure.core/defn- deser-build-spec [input] input)

(clojure.core/defn- deser-framework [input] input)

(clojure.core/defn- deser-sub-domain [input] (clojure.core/cond-> {:sub-domain-setting (deser-sub-domain-setting (input "subDomainSetting")), :verified (deser-verified (input "verified")), :dns-record (deser-dns-record (input "dnsRecord"))}))

(clojure.core/defn- deser-sub-domains [input] (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (deser-sub-domain coll))) input))

(clojure.core/defn- deser-step-name [input] input)

(clojure.core/defn- deser-app-id [input] input)

(clojure.core/defn- deser-branches [input] (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (deser-branch coll))) input))

(clojure.core/defn- deser-custom-domain [input] input)

(clojure.core/defn- deser-active-job-id [input] input)

(clojure.core/defn- deser-create-time [input] input)

(clojure.core/defn- deser-branch-arn [input] input)

(clojure.core/defn- deser-last-deploy-time [input] input)

(clojure.core/defn- deser-domain-prefix [input] input)

(clojure.core/defn- deser-dns-record [input] input)

(clojure.core/defn- deser-enable-auto-build [input] input)

(clojure.core/defn- deser-condition [input] input)

(clojure.core/defn- deser-domain-name [input] input)

(clojure.core/defn- deser-job [input] (clojure.core/cond-> {:summary (deser-job-summary (input "summary")), :steps (deser-steps (input "steps"))}))

(clojure.core/defn- deser-target [input] input)

(clojure.core/defn- deser-name [input] input)

(clojure.core/defn- deser-thumbnail-url [input] input)

(clojure.core/defn- deser-commit-message [input] input)

(clojure.core/defn- deser-job-summaries [input] (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (deser-job-summary coll))) input))

(clojure.core/defn- deser-domain-associations [input] (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (deser-domain-association coll))) input))

(clojure.core/defn- deser-job-summary [input] (clojure.core/cond-> {:job-arn (deser-job-arn (input "jobArn")), :job-id (deser-job-id (input "jobId")), :commit-id (deser-commit-id (input "commitId")), :commit-message (deser-commit-message (input "commitMessage")), :commit-time (deser-commit-time (input "commitTime")), :start-time (deser-start-time (input "startTime")), :status (deser-job-status (input "status")), :job-type (deser-job-type (input "jobType"))} (clojure.core/contains? input "endTime") (clojure.core/assoc :end-time (deser-end-time (input "endTime")))))

(clojure.core/defn- deser-custom-rule [input] (clojure.core/cond-> {:source (deser-source (input "source")), :target (deser-target (input "target"))} (clojure.core/contains? input "status") (clojure.core/assoc :status (deser-status (input "status"))) (clojure.core/contains? input "condition") (clojure.core/assoc :condition (deser-condition (input "condition")))))

(clojure.core/defn- deser-default-domain [input] input)

(clojure.core/defn- deser-stage [input] (clojure.core/get {"PRODUCTION" :production, "BETA" :beta, "DEVELOPMENT" :development, "EXPERIMENTAL" :experimental} input))

(clojure.core/defn- deser-job-arn [input] input)

(clojure.core/defn- deser-custom-rules [input] (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (deser-custom-rule coll))) input))

(clojure.core/defn- deser-enable-basic-auth [input] input)

(clojure.core/defn- deser-commit-time [input] input)

(clojure.core/defn- deser-job-id [input] input)

(clojure.core/defn- response-unauthorized-exception ([input] (response-unauthorized-exception nil input)) ([resultWrapper24409 input] (clojure.core/let [rawinput24408 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar24410 {"message" (rawinput24408 "message")}] (clojure.core/cond-> {} (letvar24410 "message") (clojure.core/assoc :message (deser-error-message (clojure.core/get-in letvar24410 ["message"])))))))

(clojure.core/defn- response-stop-job-result ([input] (response-stop-job-result nil input)) ([resultWrapper24412 input] (clojure.core/let [rawinput24411 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar24413 {"jobSummary" (rawinput24411 "jobSummary")}] (clojure.core/cond-> {:job-summary (deser-job-summary (clojure.core/get-in letvar24413 ["jobSummary"]))}))))

(clojure.core/defn- response-get-job-result ([input] (response-get-job-result nil input)) ([resultWrapper24415 input] (clojure.core/let [rawinput24414 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar24416 {"job" (rawinput24414 "job")}] (clojure.core/cond-> {:job (deser-job (clojure.core/get-in letvar24416 ["job"]))}))))

(clojure.core/defn- response-create-domain-association-result ([input] (response-create-domain-association-result nil input)) ([resultWrapper24418 input] (clojure.core/let [rawinput24417 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar24419 {"domainAssociation" (rawinput24417 "domainAssociation")}] (clojure.core/cond-> {:domain-association (deser-domain-association (clojure.core/get-in letvar24419 ["domainAssociation"]))}))))

(clojure.core/defn- response-update-app-result ([input] (response-update-app-result nil input)) ([resultWrapper24421 input] (clojure.core/let [rawinput24420 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar24422 {"app" (rawinput24420 "app")}] (clojure.core/cond-> {:app (deser-app (clojure.core/get-in letvar24422 ["app"]))}))))

(clojure.core/defn- response-bad-request-exception ([input] (response-bad-request-exception nil input)) ([resultWrapper24424 input] (clojure.core/let [rawinput24423 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar24425 {"message" (rawinput24423 "message")}] (clojure.core/cond-> {} (letvar24425 "message") (clojure.core/assoc :message (deser-error-message (clojure.core/get-in letvar24425 ["message"])))))))

(clojure.core/defn- response-create-branch-result ([input] (response-create-branch-result nil input)) ([resultWrapper24427 input] (clojure.core/let [rawinput24426 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar24428 {"branch" (rawinput24426 "branch")}] (clojure.core/cond-> {:branch (deser-branch (clojure.core/get-in letvar24428 ["branch"]))}))))

(clojure.core/defn- response-get-branch-result ([input] (response-get-branch-result nil input)) ([resultWrapper24430 input] (clojure.core/let [rawinput24429 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar24431 {"branch" (rawinput24429 "branch")}] (clojure.core/cond-> {:branch (deser-branch (clojure.core/get-in letvar24431 ["branch"]))}))))

(clojure.core/defn- response-delete-job-result ([input] (response-delete-job-result nil input)) ([resultWrapper24433 input] (clojure.core/let [rawinput24432 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar24434 {"jobSummary" (rawinput24432 "jobSummary")}] (clojure.core/cond-> {:job-summary (deser-job-summary (clojure.core/get-in letvar24434 ["jobSummary"]))}))))

(clojure.core/defn- response-get-app-result ([input] (response-get-app-result nil input)) ([resultWrapper24436 input] (clojure.core/let [rawinput24435 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar24437 {"app" (rawinput24435 "app")}] (clojure.core/cond-> {:app (deser-app (clojure.core/get-in letvar24437 ["app"]))}))))

(clojure.core/defn- response-limit-exceeded-exception ([input] (response-limit-exceeded-exception nil input)) ([resultWrapper24439 input] (clojure.core/let [rawinput24438 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar24440 {"message" (rawinput24438 "message")}] (clojure.core/cond-> {} (letvar24440 "message") (clojure.core/assoc :message (deser-error-message (clojure.core/get-in letvar24440 ["message"])))))))

(clojure.core/defn- response-start-job-result ([input] (response-start-job-result nil input)) ([resultWrapper24442 input] (clojure.core/let [rawinput24441 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar24443 {"jobSummary" (rawinput24441 "jobSummary")}] (clojure.core/cond-> {:job-summary (deser-job-summary (clojure.core/get-in letvar24443 ["jobSummary"]))}))))

(clojure.core/defn- response-update-branch-result ([input] (response-update-branch-result nil input)) ([resultWrapper24445 input] (clojure.core/let [rawinput24444 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar24446 {"branch" (rawinput24444 "branch")}] (clojure.core/cond-> {:branch (deser-branch (clojure.core/get-in letvar24446 ["branch"]))}))))

(clojure.core/defn- response-internal-failure-exception ([input] (response-internal-failure-exception nil input)) ([resultWrapper24448 input] (clojure.core/let [rawinput24447 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar24449 {"message" (rawinput24447 "message")}] (clojure.core/cond-> {} (letvar24449 "message") (clojure.core/assoc :message (deser-error-message (clojure.core/get-in letvar24449 ["message"])))))))

(clojure.core/defn- response-list-branches-result ([input] (response-list-branches-result nil input)) ([resultWrapper24451 input] (clojure.core/let [rawinput24450 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar24452 {"branches" (rawinput24450 "branches"), "nextToken" (rawinput24450 "nextToken")}] (clojure.core/cond-> {:branches (deser-branches (clojure.core/get-in letvar24452 ["branches"]))} (letvar24452 "nextToken") (clojure.core/assoc :next-token (deser-next-token (clojure.core/get-in letvar24452 ["nextToken"])))))))

(clojure.core/defn- response-list-domain-associations-result ([input] (response-list-domain-associations-result nil input)) ([resultWrapper24454 input] (clojure.core/let [rawinput24453 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar24455 {"domainAssociations" (rawinput24453 "domainAssociations"), "nextToken" (rawinput24453 "nextToken")}] (clojure.core/cond-> {:domain-associations (deser-domain-associations (clojure.core/get-in letvar24455 ["domainAssociations"]))} (letvar24455 "nextToken") (clojure.core/assoc :next-token (deser-next-token (clojure.core/get-in letvar24455 ["nextToken"])))))))

(clojure.core/defn- response-create-app-result ([input] (response-create-app-result nil input)) ([resultWrapper24457 input] (clojure.core/let [rawinput24456 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar24458 {"app" (rawinput24456 "app")}] (clojure.core/cond-> {:app (deser-app (clojure.core/get-in letvar24458 ["app"]))}))))

(clojure.core/defn- response-not-found-exception ([input] (response-not-found-exception nil input)) ([resultWrapper24460 input] (clojure.core/let [rawinput24459 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar24461 {"message" (rawinput24459 "message")}] (clojure.core/cond-> {} (letvar24461 "message") (clojure.core/assoc :message (deser-error-message (clojure.core/get-in letvar24461 ["message"])))))))

(clojure.core/defn- response-get-domain-association-result ([input] (response-get-domain-association-result nil input)) ([resultWrapper24463 input] (clojure.core/let [rawinput24462 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar24464 {"domainAssociation" (rawinput24462 "domainAssociation")}] (clojure.core/cond-> {:domain-association (deser-domain-association (clojure.core/get-in letvar24464 ["domainAssociation"]))}))))

(clojure.core/defn- response-delete-app-result ([input] (response-delete-app-result nil input)) ([resultWrapper24466 input] (clojure.core/let [rawinput24465 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar24467 {"app" (rawinput24465 "app")}] (clojure.core/cond-> {:app (deser-app (clojure.core/get-in letvar24467 ["app"]))}))))

(clojure.core/defn- response-delete-domain-association-result ([input] (response-delete-domain-association-result nil input)) ([resultWrapper24469 input] (clojure.core/let [rawinput24468 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar24470 {"domainAssociation" (rawinput24468 "domainAssociation")}] (clojure.core/cond-> {:domain-association (deser-domain-association (clojure.core/get-in letvar24470 ["domainAssociation"]))}))))

(clojure.core/defn- response-list-jobs-result ([input] (response-list-jobs-result nil input)) ([resultWrapper24472 input] (clojure.core/let [rawinput24471 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar24473 {"jobSummaries" (rawinput24471 "jobSummaries"), "nextToken" (rawinput24471 "nextToken")}] (clojure.core/cond-> {:job-summaries (deser-job-summaries (clojure.core/get-in letvar24473 ["jobSummaries"]))} (letvar24473 "nextToken") (clojure.core/assoc :next-token (deser-next-token (clojure.core/get-in letvar24473 ["nextToken"])))))))

(clojure.core/defn- response-dependent-service-failure-exception ([input] (response-dependent-service-failure-exception nil input)) ([resultWrapper24475 input] (clojure.core/let [rawinput24474 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar24476 {"message" (rawinput24474 "message")}] (clojure.core/cond-> {} (letvar24476 "message") (clojure.core/assoc :message (deser-error-message (clojure.core/get-in letvar24476 ["message"])))))))

(clojure.core/defn- response-list-apps-result ([input] (response-list-apps-result nil input)) ([resultWrapper24478 input] (clojure.core/let [rawinput24477 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar24479 {"apps" (rawinput24477 "apps"), "nextToken" (rawinput24477 "nextToken")}] (clojure.core/cond-> {:apps (deser-apps (clojure.core/get-in letvar24479 ["apps"]))} (letvar24479 "nextToken") (clojure.core/assoc :next-token (deser-next-token (clojure.core/get-in letvar24479 ["nextToken"])))))))

(clojure.core/defn- response-update-domain-association-result ([input] (response-update-domain-association-result nil input)) ([resultWrapper24481 input] (clojure.core/let [rawinput24480 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar24482 {"domainAssociation" (rawinput24480 "domainAssociation")}] (clojure.core/cond-> {:domain-association (deser-domain-association (clojure.core/get-in letvar24482 ["domainAssociation"]))}))))

(clojure.core/defn- response-delete-branch-result ([input] (response-delete-branch-result nil input)) ([resultWrapper24484 input] (clojure.core/let [rawinput24483 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar24485 {"branch" (rawinput24483 "branch")}] (clojure.core/cond-> {:branch (deser-branch (clojure.core/get-in letvar24485 ["branch"]))}))))

(clojure.spec.alpha/def :portkey.aws.amplify/verified clojure.core/boolean?)

(clojure.spec.alpha/def :portkey.aws.amplify.sub-domain-setting/prefix (clojure.spec.alpha/and :portkey.aws.amplify/domain-prefix))
(clojure.spec.alpha/def :portkey.aws.amplify.sub-domain-setting/branch-name (clojure.spec.alpha/and :portkey.aws.amplify/branch-name))
(clojure.spec.alpha/def :portkey.aws.amplify/sub-domain-setting (clojure.spec.alpha/keys :req-un [:portkey.aws.amplify.sub-domain-setting/prefix :portkey.aws.amplify.sub-domain-setting/branch-name] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.amplify.update-domain-association-request/app-id (clojure.spec.alpha/and :portkey.aws.amplify/app-id))
(clojure.spec.alpha/def :portkey.aws.amplify.update-domain-association-request/domain-name (clojure.spec.alpha/and :portkey.aws.amplify/domain-name))
(clojure.spec.alpha/def :portkey.aws.amplify.update-domain-association-request/enable-auto-sub-domain (clojure.spec.alpha/and :portkey.aws.amplify/enable-auto-sub-domain))
(clojure.spec.alpha/def :portkey.aws.amplify.update-domain-association-request/sub-domain-settings (clojure.spec.alpha/and :portkey.aws.amplify/sub-domain-settings))
(clojure.spec.alpha/def :portkey.aws.amplify/update-domain-association-request (clojure.spec.alpha/keys :req-un [:portkey.aws.amplify.update-domain-association-request/app-id :portkey.aws.amplify.update-domain-association-request/domain-name :portkey.aws.amplify.update-domain-association-request/sub-domain-settings] :opt-un [:portkey.aws.amplify.update-domain-association-request/enable-auto-sub-domain]))

(clojure.spec.alpha/def :portkey.aws.amplify.unauthorized-exception/message (clojure.spec.alpha/and :portkey.aws.amplify/error-message))
(clojure.spec.alpha/def :portkey.aws.amplify/unauthorized-exception (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.amplify.unauthorized-exception/message]))

(clojure.spec.alpha/def :portkey.aws.amplify/oauth-token (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__21111__auto__] (clojure.core/< (clojure.core/count s__21111__auto__) 100))))

(clojure.spec.alpha/def :portkey.aws.amplify/thumbnail-name (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__21111__auto__] (clojure.core/< (clojure.core/count s__21111__auto__) 256))))

(clojure.spec.alpha/def :portkey.aws.amplify.stop-job-result/job-summary (clojure.spec.alpha/and :portkey.aws.amplify/job-summary))
(clojure.spec.alpha/def :portkey.aws.amplify/stop-job-result (clojure.spec.alpha/keys :req-un [:portkey.aws.amplify.stop-job-result/job-summary] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.amplify/service-role-arn (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__21110__auto__] (clojure.core/<= 1 (clojure.core/count s__21110__auto__))) (clojure.core/fn [s__21111__auto__] (clojure.core/< (clojure.core/count s__21111__auto__) 1000))))

(clojure.spec.alpha/def :portkey.aws.amplify/basic-auth-credentials (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__21111__auto__] (clojure.core/< (clojure.core/count s__21111__auto__) 2000))))

(clojure.spec.alpha/def :portkey.aws.amplify/enable-branch-auto-build clojure.core/boolean?)

(clojure.spec.alpha/def :portkey.aws.amplify.get-job-result/job (clojure.spec.alpha/and :portkey.aws.amplify/job))
(clojure.spec.alpha/def :portkey.aws.amplify/get-job-result (clojure.spec.alpha/keys :req-un [:portkey.aws.amplify.get-job-result/job] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.amplify.get-branch-request/app-id (clojure.spec.alpha/and :portkey.aws.amplify/app-id))
(clojure.spec.alpha/def :portkey.aws.amplify.get-branch-request/branch-name (clojure.spec.alpha/and :portkey.aws.amplify/branch-name))
(clojure.spec.alpha/def :portkey.aws.amplify/get-branch-request (clojure.spec.alpha/keys :req-un [:portkey.aws.amplify.get-branch-request/app-id :portkey.aws.amplify.get-branch-request/branch-name] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.amplify/end-time clojure.core/inst?)

(clojure.spec.alpha/def :portkey.aws.amplify/enable-notification clojure.core/boolean?)

(clojure.spec.alpha/def :portkey.aws.amplify/platform #{:ios "REACT_NATIVE" :react-native "IOS" :android "WEB" "ANDROID" :web})

(clojure.spec.alpha/def :portkey.aws.amplify.create-domain-association-result/domain-association (clojure.spec.alpha/and :portkey.aws.amplify/domain-association))
(clojure.spec.alpha/def :portkey.aws.amplify/create-domain-association-result (clojure.spec.alpha/keys :req-un [:portkey.aws.amplify.create-domain-association-result/domain-association] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.amplify/domain-association-arn (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__21111__auto__] (clojure.core/< (clojure.core/count s__21111__auto__) 1000))))

(clojure.spec.alpha/def :portkey.aws.amplify.update-app-result/app (clojure.spec.alpha/and :portkey.aws.amplify/app))
(clojure.spec.alpha/def :portkey.aws.amplify/update-app-result (clojure.spec.alpha/keys :req-un [:portkey.aws.amplify.update-app-result/app] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.amplify.bad-request-exception/message (clojure.spec.alpha/and :portkey.aws.amplify/error-message))
(clojure.spec.alpha/def :portkey.aws.amplify/bad-request-exception (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.amplify.bad-request-exception/message]))

(clojure.spec.alpha/def :portkey.aws.amplify/job-status #{"CANCELLING" :pending "PROVISIONING" "PENDING" :running :cancelled "FAILED" :provisioning :succeed "CANCELLED" :cancelling "SUCCEED" :failed "RUNNING"})

(clojure.spec.alpha/def :portkey.aws.amplify.create-app-request/basic-auth-credentials (clojure.spec.alpha/and :portkey.aws.amplify/basic-auth-credentials))
(clojure.spec.alpha/def :portkey.aws.amplify.create-app-request/build-spec (clojure.spec.alpha/and :portkey.aws.amplify/build-spec))
(clojure.spec.alpha/def :portkey.aws.amplify.create-app-request/custom-rules (clojure.spec.alpha/and :portkey.aws.amplify/custom-rules))
(clojure.spec.alpha/def :portkey.aws.amplify.create-app-request/tags (clojure.spec.alpha/and :portkey.aws.amplify/tags))
(clojure.spec.alpha/def :portkey.aws.amplify.create-app-request/repository (clojure.spec.alpha/and :portkey.aws.amplify/repository))
(clojure.spec.alpha/def :portkey.aws.amplify.create-app-request/iam-service-role-arn (clojure.spec.alpha/and :portkey.aws.amplify/service-role-arn))
(clojure.spec.alpha/def :portkey.aws.amplify.create-app-request/name (clojure.spec.alpha/and :portkey.aws.amplify/name))
(clojure.spec.alpha/def :portkey.aws.amplify.create-app-request/environment-variables (clojure.spec.alpha/and :portkey.aws.amplify/environment-variables))
(clojure.spec.alpha/def :portkey.aws.amplify.create-app-request/enable-branch-auto-build (clojure.spec.alpha/and :portkey.aws.amplify/enable-branch-auto-build))
(clojure.spec.alpha/def :portkey.aws.amplify.create-app-request/enable-basic-auth (clojure.spec.alpha/and :portkey.aws.amplify/enable-basic-auth))
(clojure.spec.alpha/def :portkey.aws.amplify.create-app-request/oauth-token (clojure.spec.alpha/and :portkey.aws.amplify/oauth-token))
(clojure.spec.alpha/def :portkey.aws.amplify.create-app-request/platform (clojure.spec.alpha/and :portkey.aws.amplify/platform))
(clojure.spec.alpha/def :portkey.aws.amplify.create-app-request/description (clojure.spec.alpha/and :portkey.aws.amplify/description))
(clojure.spec.alpha/def :portkey.aws.amplify/create-app-request (clojure.spec.alpha/keys :req-un [:portkey.aws.amplify.create-app-request/name :portkey.aws.amplify.create-app-request/repository :portkey.aws.amplify.create-app-request/platform :portkey.aws.amplify.create-app-request/oauth-token] :opt-un [:portkey.aws.amplify.create-app-request/basic-auth-credentials :portkey.aws.amplify.create-app-request/build-spec :portkey.aws.amplify.create-app-request/custom-rules :portkey.aws.amplify.create-app-request/tags :portkey.aws.amplify.create-app-request/iam-service-role-arn :portkey.aws.amplify.create-app-request/environment-variables :portkey.aws.amplify.create-app-request/enable-branch-auto-build :portkey.aws.amplify.create-app-request/enable-basic-auth :portkey.aws.amplify.create-app-request/description]))

(clojure.spec.alpha/def :portkey.aws.amplify.create-branch-result/branch (clojure.spec.alpha/and :portkey.aws.amplify/branch))
(clojure.spec.alpha/def :portkey.aws.amplify/create-branch-result (clojure.spec.alpha/keys :req-un [:portkey.aws.amplify.create-branch-result/branch] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.amplify/update-time clojure.core/inst?)

(clojure.spec.alpha/def :portkey.aws.amplify/enable-auto-sub-domain clojure.core/boolean?)

(clojure.spec.alpha/def :portkey.aws.amplify.branch/branch-arn (clojure.spec.alpha/and :portkey.aws.amplify/branch-arn))
(clojure.spec.alpha/def :portkey.aws.amplify.branch/basic-auth-credentials (clojure.spec.alpha/and :portkey.aws.amplify/basic-auth-credentials))
(clojure.spec.alpha/def :portkey.aws.amplify.branch/build-spec (clojure.spec.alpha/and :portkey.aws.amplify/build-spec))
(clojure.spec.alpha/def :portkey.aws.amplify.branch/custom-domains (clojure.spec.alpha/and :portkey.aws.amplify/custom-domains))
(clojure.spec.alpha/def :portkey.aws.amplify.branch/display-name (clojure.spec.alpha/and :portkey.aws.amplify/display-name))
(clojure.spec.alpha/def :portkey.aws.amplify.branch/branch-name (clojure.spec.alpha/and :portkey.aws.amplify/branch-name))
(clojure.spec.alpha/def :portkey.aws.amplify.branch/framework (clojure.spec.alpha/and :portkey.aws.amplify/framework))
(clojure.spec.alpha/def :portkey.aws.amplify.branch/tags (clojure.spec.alpha/and :portkey.aws.amplify/tags))
(clojure.spec.alpha/def :portkey.aws.amplify.branch/create-time (clojure.spec.alpha/and :portkey.aws.amplify/create-time))
(clojure.spec.alpha/def :portkey.aws.amplify.branch/enable-notification (clojure.spec.alpha/and :portkey.aws.amplify/enable-notification))
(clojure.spec.alpha/def :portkey.aws.amplify.branch/environment-variables (clojure.spec.alpha/and :portkey.aws.amplify/environment-variables))
(clojure.spec.alpha/def :portkey.aws.amplify.branch/total-number-of-jobs (clojure.spec.alpha/and :portkey.aws.amplify/total-number-of-jobs))
(clojure.spec.alpha/def :portkey.aws.amplify.branch/update-time (clojure.spec.alpha/and :portkey.aws.amplify/update-time))
(clojure.spec.alpha/def :portkey.aws.amplify.branch/thumbnail-url (clojure.spec.alpha/and :portkey.aws.amplify/thumbnail-url))
(clojure.spec.alpha/def :portkey.aws.amplify.branch/active-job-id (clojure.spec.alpha/and :portkey.aws.amplify/active-job-id))
(clojure.spec.alpha/def :portkey.aws.amplify.branch/enable-auto-build (clojure.spec.alpha/and :portkey.aws.amplify/enable-auto-build))
(clojure.spec.alpha/def :portkey.aws.amplify.branch/ttl (clojure.spec.alpha/and :portkey.aws.amplify/ttl))
(clojure.spec.alpha/def :portkey.aws.amplify.branch/enable-basic-auth (clojure.spec.alpha/and :portkey.aws.amplify/enable-basic-auth))
(clojure.spec.alpha/def :portkey.aws.amplify.branch/description (clojure.spec.alpha/and :portkey.aws.amplify/description))
(clojure.spec.alpha/def :portkey.aws.amplify.branch/stage (clojure.spec.alpha/and :portkey.aws.amplify/stage))
(clojure.spec.alpha/def :portkey.aws.amplify/branch (clojure.spec.alpha/keys :req-un [:portkey.aws.amplify.branch/branch-arn :portkey.aws.amplify.branch/branch-name :portkey.aws.amplify.branch/description :portkey.aws.amplify.branch/stage :portkey.aws.amplify.branch/enable-notification :portkey.aws.amplify.branch/create-time :portkey.aws.amplify.branch/update-time :portkey.aws.amplify.branch/environment-variables :portkey.aws.amplify.branch/enable-auto-build :portkey.aws.amplify.branch/custom-domains :portkey.aws.amplify.branch/framework :portkey.aws.amplify.branch/active-job-id :portkey.aws.amplify.branch/total-number-of-jobs :portkey.aws.amplify.branch/enable-basic-auth :portkey.aws.amplify.branch/ttl] :opt-un [:portkey.aws.amplify.branch/basic-auth-credentials :portkey.aws.amplify.branch/build-spec :portkey.aws.amplify.branch/display-name :portkey.aws.amplify.branch/tags :portkey.aws.amplify.branch/thumbnail-url]))

(clojure.spec.alpha/def :portkey.aws.amplify.app/basic-auth-credentials (clojure.spec.alpha/and :portkey.aws.amplify/basic-auth-credentials))
(clojure.spec.alpha/def :portkey.aws.amplify.app/app-arn (clojure.spec.alpha/and :portkey.aws.amplify/app-arn))
(clojure.spec.alpha/def :portkey.aws.amplify.app/build-spec (clojure.spec.alpha/and :portkey.aws.amplify/build-spec))
(clojure.spec.alpha/def :portkey.aws.amplify.app/custom-rules (clojure.spec.alpha/and :portkey.aws.amplify/custom-rules))
(clojure.spec.alpha/def :portkey.aws.amplify.app/tags (clojure.spec.alpha/and :portkey.aws.amplify/tags))
(clojure.spec.alpha/def :portkey.aws.amplify.app/repository (clojure.spec.alpha/and :portkey.aws.amplify/repository))
(clojure.spec.alpha/def :portkey.aws.amplify.app/iam-service-role-arn (clojure.spec.alpha/and :portkey.aws.amplify/service-role-arn))
(clojure.spec.alpha/def :portkey.aws.amplify.app/name (clojure.spec.alpha/and :portkey.aws.amplify/name))
(clojure.spec.alpha/def :portkey.aws.amplify.app/create-time (clojure.spec.alpha/and :portkey.aws.amplify/create-time))
(clojure.spec.alpha/def :portkey.aws.amplify.app/environment-variables (clojure.spec.alpha/and :portkey.aws.amplify/environment-variables))
(clojure.spec.alpha/def :portkey.aws.amplify.app/enable-branch-auto-build (clojure.spec.alpha/and :portkey.aws.amplify/enable-branch-auto-build))
(clojure.spec.alpha/def :portkey.aws.amplify.app/default-domain (clojure.spec.alpha/and :portkey.aws.amplify/default-domain))
(clojure.spec.alpha/def :portkey.aws.amplify.app/update-time (clojure.spec.alpha/and :portkey.aws.amplify/update-time))
(clojure.spec.alpha/def :portkey.aws.amplify.app/app-id (clojure.spec.alpha/and :portkey.aws.amplify/app-id))
(clojure.spec.alpha/def :portkey.aws.amplify.app/enable-basic-auth (clojure.spec.alpha/and :portkey.aws.amplify/enable-basic-auth))
(clojure.spec.alpha/def :portkey.aws.amplify.app/production-branch (clojure.spec.alpha/and :portkey.aws.amplify/production-branch))
(clojure.spec.alpha/def :portkey.aws.amplify.app/platform (clojure.spec.alpha/and :portkey.aws.amplify/platform))
(clojure.spec.alpha/def :portkey.aws.amplify.app/description (clojure.spec.alpha/and :portkey.aws.amplify/description))
(clojure.spec.alpha/def :portkey.aws.amplify/app (clojure.spec.alpha/keys :req-un [:portkey.aws.amplify.app/app-id :portkey.aws.amplify.app/app-arn :portkey.aws.amplify.app/name :portkey.aws.amplify.app/description :portkey.aws.amplify.app/repository :portkey.aws.amplify.app/platform :portkey.aws.amplify.app/create-time :portkey.aws.amplify.app/update-time :portkey.aws.amplify.app/environment-variables :portkey.aws.amplify.app/default-domain :portkey.aws.amplify.app/enable-branch-auto-build :portkey.aws.amplify.app/enable-basic-auth] :opt-un [:portkey.aws.amplify.app/basic-auth-credentials :portkey.aws.amplify.app/build-spec :portkey.aws.amplify.app/custom-rules :portkey.aws.amplify.app/tags :portkey.aws.amplify.app/iam-service-role-arn :portkey.aws.amplify.app/production-branch]))

(clojure.spec.alpha/def :portkey.aws.amplify.create-domain-association-request/app-id (clojure.spec.alpha/and :portkey.aws.amplify/app-id))
(clojure.spec.alpha/def :portkey.aws.amplify.create-domain-association-request/domain-name (clojure.spec.alpha/and :portkey.aws.amplify/domain-name))
(clojure.spec.alpha/def :portkey.aws.amplify.create-domain-association-request/enable-auto-sub-domain (clojure.spec.alpha/and :portkey.aws.amplify/enable-auto-sub-domain))
(clojure.spec.alpha/def :portkey.aws.amplify.create-domain-association-request/sub-domain-settings (clojure.spec.alpha/and :portkey.aws.amplify/sub-domain-settings))
(clojure.spec.alpha/def :portkey.aws.amplify/create-domain-association-request (clojure.spec.alpha/keys :req-un [:portkey.aws.amplify.create-domain-association-request/app-id :portkey.aws.amplify.create-domain-association-request/domain-name :portkey.aws.amplify.create-domain-association-request/sub-domain-settings] :opt-un [:portkey.aws.amplify.create-domain-association-request/enable-auto-sub-domain]))

(clojure.spec.alpha/def :portkey.aws.amplify/source (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__21110__auto__] (clojure.core/<= 1 (clojure.core/count s__21110__auto__))) (clojure.core/fn [s__21111__auto__] (clojure.core/< (clojure.core/count s__21111__auto__) 2048))))

(clojure.spec.alpha/def :portkey.aws.amplify/job-type #{:retry "RELEASE" "RETRY" "WEB_HOOK" :release :web-hook})

(clojure.spec.alpha/def :portkey.aws.amplify.update-app-request/basic-auth-credentials (clojure.spec.alpha/and :portkey.aws.amplify/basic-auth-credentials))
(clojure.spec.alpha/def :portkey.aws.amplify.update-app-request/build-spec (clojure.spec.alpha/and :portkey.aws.amplify/build-spec))
(clojure.spec.alpha/def :portkey.aws.amplify.update-app-request/custom-rules (clojure.spec.alpha/and :portkey.aws.amplify/custom-rules))
(clojure.spec.alpha/def :portkey.aws.amplify.update-app-request/iam-service-role-arn (clojure.spec.alpha/and :portkey.aws.amplify/service-role-arn))
(clojure.spec.alpha/def :portkey.aws.amplify.update-app-request/name (clojure.spec.alpha/and :portkey.aws.amplify/name))
(clojure.spec.alpha/def :portkey.aws.amplify.update-app-request/environment-variables (clojure.spec.alpha/and :portkey.aws.amplify/environment-variables))
(clojure.spec.alpha/def :portkey.aws.amplify.update-app-request/enable-branch-auto-build (clojure.spec.alpha/and :portkey.aws.amplify/enable-auto-build))
(clojure.spec.alpha/def :portkey.aws.amplify.update-app-request/app-id (clojure.spec.alpha/and :portkey.aws.amplify/app-id))
(clojure.spec.alpha/def :portkey.aws.amplify.update-app-request/enable-basic-auth (clojure.spec.alpha/and :portkey.aws.amplify/enable-basic-auth))
(clojure.spec.alpha/def :portkey.aws.amplify.update-app-request/platform (clojure.spec.alpha/and :portkey.aws.amplify/platform))
(clojure.spec.alpha/def :portkey.aws.amplify.update-app-request/description (clojure.spec.alpha/and :portkey.aws.amplify/description))
(clojure.spec.alpha/def :portkey.aws.amplify/update-app-request (clojure.spec.alpha/keys :req-un [:portkey.aws.amplify.update-app-request/app-id] :opt-un [:portkey.aws.amplify.update-app-request/basic-auth-credentials :portkey.aws.amplify.update-app-request/build-spec :portkey.aws.amplify.update-app-request/custom-rules :portkey.aws.amplify.update-app-request/iam-service-role-arn :portkey.aws.amplify.update-app-request/name :portkey.aws.amplify.update-app-request/environment-variables :portkey.aws.amplify.update-app-request/enable-branch-auto-build :portkey.aws.amplify.update-app-request/enable-basic-auth :portkey.aws.amplify.update-app-request/platform :portkey.aws.amplify.update-app-request/description]))

(clojure.spec.alpha/def :portkey.aws.amplify/app-arn (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__21111__auto__] (clojure.core/< (clojure.core/count s__21111__auto__) 1000))))

(clojure.spec.alpha/def :portkey.aws.amplify/start-time clojure.core/inst?)

(clojure.spec.alpha/def :portkey.aws.amplify/environment-variables (clojure.spec.alpha/map-of :portkey.aws.amplify/env-key :portkey.aws.amplify/env-value))

(clojure.spec.alpha/def :portkey.aws.amplify.list-jobs-request/app-id (clojure.spec.alpha/and :portkey.aws.amplify/app-id))
(clojure.spec.alpha/def :portkey.aws.amplify.list-jobs-request/branch-name (clojure.spec.alpha/and :portkey.aws.amplify/branch-name))
(clojure.spec.alpha/def :portkey.aws.amplify.list-jobs-request/next-token (clojure.spec.alpha/and :portkey.aws.amplify/next-token))
(clojure.spec.alpha/def :portkey.aws.amplify.list-jobs-request/max-results (clojure.spec.alpha/and :portkey.aws.amplify/max-results))
(clojure.spec.alpha/def :portkey.aws.amplify/list-jobs-request (clojure.spec.alpha/keys :req-un [:portkey.aws.amplify.list-jobs-request/app-id :portkey.aws.amplify.list-jobs-request/branch-name] :opt-un [:portkey.aws.amplify.list-jobs-request/next-token :portkey.aws.amplify.list-jobs-request/max-results]))

(clojure.spec.alpha/def :portkey.aws.amplify.get-branch-result/branch (clojure.spec.alpha/and :portkey.aws.amplify/branch))
(clojure.spec.alpha/def :portkey.aws.amplify/get-branch-result (clojure.spec.alpha/keys :req-un [:portkey.aws.amplify.get-branch-result/branch] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.amplify/branch-name (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__21110__auto__] (clojure.core/<= 1 (clojure.core/count s__21110__auto__))) (clojure.core/fn [s__21111__auto__] (clojure.core/< (clojure.core/count s__21111__auto__) 255))))

(clojure.spec.alpha/def :portkey.aws.amplify.get-domain-association-request/app-id (clojure.spec.alpha/and :portkey.aws.amplify/app-id))
(clojure.spec.alpha/def :portkey.aws.amplify.get-domain-association-request/domain-name (clojure.spec.alpha/and :portkey.aws.amplify/domain-name))
(clojure.spec.alpha/def :portkey.aws.amplify/get-domain-association-request (clojure.spec.alpha/keys :req-un [:portkey.aws.amplify.get-domain-association-request/app-id :portkey.aws.amplify.get-domain-association-request/domain-name] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.amplify.domain-association/domain-association-arn (clojure.spec.alpha/and :portkey.aws.amplify/domain-association-arn))
(clojure.spec.alpha/def :portkey.aws.amplify.domain-association/domain-name (clojure.spec.alpha/and :portkey.aws.amplify/domain-name))
(clojure.spec.alpha/def :portkey.aws.amplify.domain-association/enable-auto-sub-domain (clojure.spec.alpha/and :portkey.aws.amplify/enable-auto-sub-domain))
(clojure.spec.alpha/def :portkey.aws.amplify.domain-association/domain-status (clojure.spec.alpha/and :portkey.aws.amplify/domain-status))
(clojure.spec.alpha/def :portkey.aws.amplify.domain-association/status-reason (clojure.spec.alpha/and :portkey.aws.amplify/status-reason))
(clojure.spec.alpha/def :portkey.aws.amplify.domain-association/certificate-verification-dns-record (clojure.spec.alpha/and :portkey.aws.amplify/certificate-verification-dns-record))
(clojure.spec.alpha/def :portkey.aws.amplify.domain-association/sub-domains (clojure.spec.alpha/and :portkey.aws.amplify/sub-domains))
(clojure.spec.alpha/def :portkey.aws.amplify/domain-association (clojure.spec.alpha/keys :req-un [:portkey.aws.amplify.domain-association/domain-association-arn :portkey.aws.amplify.domain-association/domain-name :portkey.aws.amplify.domain-association/enable-auto-sub-domain :portkey.aws.amplify.domain-association/domain-status :portkey.aws.amplify.domain-association/status-reason :portkey.aws.amplify.domain-association/certificate-verification-dns-record :portkey.aws.amplify.domain-association/sub-domains] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.amplify/certificate-verification-dns-record (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__21111__auto__] (clojure.core/< (clojure.core/count s__21111__auto__) 1000))))

(clojure.spec.alpha/def :portkey.aws.amplify.delete-job-result/job-summary (clojure.spec.alpha/and :portkey.aws.amplify/job-summary))
(clojure.spec.alpha/def :portkey.aws.amplify/delete-job-result (clojure.spec.alpha/keys :req-un [:portkey.aws.amplify.delete-job-result/job-summary] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.amplify/log-url (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__21111__auto__] (clojure.core/< (clojure.core/count s__21111__auto__) 1000))))

(clojure.spec.alpha/def :portkey.aws.amplify.get-app-result/app (clojure.spec.alpha/and :portkey.aws.amplify/app))
(clojure.spec.alpha/def :portkey.aws.amplify/get-app-result (clojure.spec.alpha/keys :req-un [:portkey.aws.amplify.get-app-result/app] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.amplify/total-number-of-jobs (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__21111__auto__] (clojure.core/< (clojure.core/count s__21111__auto__) 1000))))

(clojure.spec.alpha/def :portkey.aws.amplify/repository (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__21111__auto__] (clojure.core/< (clojure.core/count s__21111__auto__) 1000))))

(clojure.spec.alpha/def :portkey.aws.amplify/env-value (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__21111__auto__] (clojure.core/< (clojure.core/count s__21111__auto__) 1000))))

(clojure.spec.alpha/def :portkey.aws.amplify/tag-key (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__21111__auto__] (clojure.core/< (clojure.core/count s__21111__auto__) 1000))))

(clojure.spec.alpha/def :portkey.aws.amplify/env-key (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__21111__auto__] (clojure.core/< (clojure.core/count s__21111__auto__) 255))))

(clojure.spec.alpha/def :portkey.aws.amplify/tags (clojure.spec.alpha/map-of :portkey.aws.amplify/tag-key :portkey.aws.amplify/tag-value))

(clojure.spec.alpha/def :portkey.aws.amplify.limit-exceeded-exception/message (clojure.spec.alpha/and :portkey.aws.amplify/error-message))
(clojure.spec.alpha/def :portkey.aws.amplify/limit-exceeded-exception (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.amplify.limit-exceeded-exception/message]))

(clojure.spec.alpha/def :portkey.aws.amplify.stop-job-request/app-id (clojure.spec.alpha/and :portkey.aws.amplify/app-id))
(clojure.spec.alpha/def :portkey.aws.amplify.stop-job-request/branch-name (clojure.spec.alpha/and :portkey.aws.amplify/branch-name))
(clojure.spec.alpha/def :portkey.aws.amplify.stop-job-request/job-id (clojure.spec.alpha/and :portkey.aws.amplify/job-id))
(clojure.spec.alpha/def :portkey.aws.amplify/stop-job-request (clojure.spec.alpha/keys :req-un [:portkey.aws.amplify.stop-job-request/app-id :portkey.aws.amplify.stop-job-request/branch-name :portkey.aws.amplify.stop-job-request/job-id] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.amplify.start-job-result/job-summary (clojure.spec.alpha/and :portkey.aws.amplify/job-summary))
(clojure.spec.alpha/def :portkey.aws.amplify/start-job-result (clojure.spec.alpha/keys :req-un [:portkey.aws.amplify.start-job-result/job-summary] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.amplify.list-apps-request/next-token (clojure.spec.alpha/and :portkey.aws.amplify/next-token))
(clojure.spec.alpha/def :portkey.aws.amplify.list-apps-request/max-results (clojure.spec.alpha/and :portkey.aws.amplify/max-results))
(clojure.spec.alpha/def :portkey.aws.amplify/list-apps-request (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.amplify.list-apps-request/next-token :portkey.aws.amplify.list-apps-request/max-results]))

(clojure.spec.alpha/def :portkey.aws.amplify.update-branch-result/branch (clojure.spec.alpha/and :portkey.aws.amplify/branch))
(clojure.spec.alpha/def :portkey.aws.amplify/update-branch-result (clojure.spec.alpha/keys :req-un [:portkey.aws.amplify.update-branch-result/branch] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.amplify/sub-domain-settings (clojure.spec.alpha/coll-of :portkey.aws.amplify/sub-domain-setting :max-count 255))

(clojure.spec.alpha/def :portkey.aws.amplify.create-branch-request/basic-auth-credentials (clojure.spec.alpha/and :portkey.aws.amplify/basic-auth-credentials))
(clojure.spec.alpha/def :portkey.aws.amplify.create-branch-request/build-spec (clojure.spec.alpha/and :portkey.aws.amplify/build-spec))
(clojure.spec.alpha/def :portkey.aws.amplify.create-branch-request/branch-name (clojure.spec.alpha/and :portkey.aws.amplify/branch-name))
(clojure.spec.alpha/def :portkey.aws.amplify.create-branch-request/framework (clojure.spec.alpha/and :portkey.aws.amplify/framework))
(clojure.spec.alpha/def :portkey.aws.amplify.create-branch-request/tags (clojure.spec.alpha/and :portkey.aws.amplify/tags))
(clojure.spec.alpha/def :portkey.aws.amplify.create-branch-request/enable-notification (clojure.spec.alpha/and :portkey.aws.amplify/enable-notification))
(clojure.spec.alpha/def :portkey.aws.amplify.create-branch-request/environment-variables (clojure.spec.alpha/and :portkey.aws.amplify/environment-variables))
(clojure.spec.alpha/def :portkey.aws.amplify.create-branch-request/enable-auto-build (clojure.spec.alpha/and :portkey.aws.amplify/enable-auto-build))
(clojure.spec.alpha/def :portkey.aws.amplify.create-branch-request/app-id (clojure.spec.alpha/and :portkey.aws.amplify/app-id))
(clojure.spec.alpha/def :portkey.aws.amplify.create-branch-request/ttl (clojure.spec.alpha/and :portkey.aws.amplify/ttl))
(clojure.spec.alpha/def :portkey.aws.amplify.create-branch-request/enable-basic-auth (clojure.spec.alpha/and :portkey.aws.amplify/enable-basic-auth))
(clojure.spec.alpha/def :portkey.aws.amplify.create-branch-request/description (clojure.spec.alpha/and :portkey.aws.amplify/description))
(clojure.spec.alpha/def :portkey.aws.amplify.create-branch-request/stage (clojure.spec.alpha/and :portkey.aws.amplify/stage))
(clojure.spec.alpha/def :portkey.aws.amplify/create-branch-request (clojure.spec.alpha/keys :req-un [:portkey.aws.amplify.create-branch-request/app-id :portkey.aws.amplify.create-branch-request/branch-name] :opt-un [:portkey.aws.amplify.create-branch-request/basic-auth-credentials :portkey.aws.amplify.create-branch-request/build-spec :portkey.aws.amplify.create-branch-request/framework :portkey.aws.amplify.create-branch-request/tags :portkey.aws.amplify.create-branch-request/enable-notification :portkey.aws.amplify.create-branch-request/environment-variables :portkey.aws.amplify.create-branch-request/enable-auto-build :portkey.aws.amplify.create-branch-request/ttl :portkey.aws.amplify.create-branch-request/enable-basic-auth :portkey.aws.amplify.create-branch-request/description :portkey.aws.amplify.create-branch-request/stage]))

(clojure.spec.alpha/def :portkey.aws.amplify.production-branch/last-deploy-time (clojure.spec.alpha/and :portkey.aws.amplify/last-deploy-time))
(clojure.spec.alpha/def :portkey.aws.amplify.production-branch/status (clojure.spec.alpha/and :portkey.aws.amplify/status))
(clojure.spec.alpha/def :portkey.aws.amplify.production-branch/thumbnail-url (clojure.spec.alpha/and :portkey.aws.amplify/thumbnail-url))
(clojure.spec.alpha/def :portkey.aws.amplify.production-branch/branch-name (clojure.spec.alpha/and :portkey.aws.amplify/branch-name))
(clojure.spec.alpha/def :portkey.aws.amplify/production-branch (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.amplify.production-branch/last-deploy-time :portkey.aws.amplify.production-branch/status :portkey.aws.amplify.production-branch/thumbnail-url :portkey.aws.amplify.production-branch/branch-name]))

(clojure.spec.alpha/def :portkey.aws.amplify/status (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__21110__auto__] (clojure.core/<= 3 (clojure.core/count s__21110__auto__))) (clojure.core/fn [s__21111__auto__] (clojure.core/< (clojure.core/count s__21111__auto__) 3))))

(clojure.spec.alpha/def :portkey.aws.amplify/next-token (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__21111__auto__] (clojure.core/< (clojure.core/count s__21111__auto__) 2000))))

(clojure.spec.alpha/def :portkey.aws.amplify/error-message (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__21111__auto__] (clojure.core/< (clojure.core/count s__21111__auto__) 255))))

(clojure.spec.alpha/def :portkey.aws.amplify/artifacts-url (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__21111__auto__] (clojure.core/< (clojure.core/count s__21111__auto__) 1000))))

(clojure.spec.alpha/def :portkey.aws.amplify.step/step-name (clojure.spec.alpha/and :portkey.aws.amplify/step-name))
(clojure.spec.alpha/def :portkey.aws.amplify.step/start-time (clojure.spec.alpha/and :portkey.aws.amplify/start-time))
(clojure.spec.alpha/def :portkey.aws.amplify.step/status (clojure.spec.alpha/and :portkey.aws.amplify/job-status))
(clojure.spec.alpha/def :portkey.aws.amplify.step/end-time (clojure.spec.alpha/and :portkey.aws.amplify/end-time))
(clojure.spec.alpha/def :portkey.aws.amplify.step/log-url (clojure.spec.alpha/and :portkey.aws.amplify/log-url))
(clojure.spec.alpha/def :portkey.aws.amplify.step/artifacts-url (clojure.spec.alpha/and :portkey.aws.amplify/artifacts-url))
(clojure.spec.alpha/def :portkey.aws.amplify.step/screenshots (clojure.spec.alpha/and :portkey.aws.amplify/screenshots))
(clojure.spec.alpha/def :portkey.aws.amplify/step (clojure.spec.alpha/keys :req-un [:portkey.aws.amplify.step/step-name :portkey.aws.amplify.step/start-time :portkey.aws.amplify.step/status :portkey.aws.amplify.step/end-time] :opt-un [:portkey.aws.amplify.step/log-url :portkey.aws.amplify.step/artifacts-url :portkey.aws.amplify.step/screenshots]))

(clojure.spec.alpha/def :portkey.aws.amplify/commit-id (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__21111__auto__] (clojure.core/< (clojure.core/count s__21111__auto__) 255))))

(clojure.spec.alpha/def :portkey.aws.amplify/screenshots (clojure.spec.alpha/map-of :portkey.aws.amplify/thumbnail-name :portkey.aws.amplify/thumbnail-url))

(clojure.spec.alpha/def :portkey.aws.amplify/domain-status #{:pending-deployment "IN_PROGRESS" :in-progress "PENDING_DEPLOYMENT" "AVAILABLE" :pending-verification "FAILED" :available :failed "PENDING_VERIFICATION"})

(clojure.spec.alpha/def :portkey.aws.amplify/custom-domains (clojure.spec.alpha/coll-of :portkey.aws.amplify/custom-domain :max-count 255))

(clojure.spec.alpha/def :portkey.aws.amplify/ttl (clojure.spec.alpha/and clojure.core/string?))

(clojure.spec.alpha/def :portkey.aws.amplify.internal-failure-exception/message (clojure.spec.alpha/and :portkey.aws.amplify/error-message))
(clojure.spec.alpha/def :portkey.aws.amplify/internal-failure-exception (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.amplify.internal-failure-exception/message]))

(clojure.spec.alpha/def :portkey.aws.amplify.list-branches-result/branches (clojure.spec.alpha/and :portkey.aws.amplify/branches))
(clojure.spec.alpha/def :portkey.aws.amplify.list-branches-result/next-token (clojure.spec.alpha/and :portkey.aws.amplify/next-token))
(clojure.spec.alpha/def :portkey.aws.amplify/list-branches-result (clojure.spec.alpha/keys :req-un [:portkey.aws.amplify.list-branches-result/branches] :opt-un [:portkey.aws.amplify.list-branches-result/next-token]))

(clojure.spec.alpha/def :portkey.aws.amplify/display-name (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__21111__auto__] (clojure.core/< (clojure.core/count s__21111__auto__) 255))))

(clojure.spec.alpha/def :portkey.aws.amplify/status-reason (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__21111__auto__] (clojure.core/< (clojure.core/count s__21111__auto__) 1000))))

(clojure.spec.alpha/def :portkey.aws.amplify.update-branch-request/basic-auth-credentials (clojure.spec.alpha/and :portkey.aws.amplify/basic-auth-credentials))
(clojure.spec.alpha/def :portkey.aws.amplify.update-branch-request/build-spec (clojure.spec.alpha/and :portkey.aws.amplify/build-spec))
(clojure.spec.alpha/def :portkey.aws.amplify.update-branch-request/branch-name (clojure.spec.alpha/and :portkey.aws.amplify/branch-name))
(clojure.spec.alpha/def :portkey.aws.amplify.update-branch-request/framework (clojure.spec.alpha/and :portkey.aws.amplify/framework))
(clojure.spec.alpha/def :portkey.aws.amplify.update-branch-request/enable-notification (clojure.spec.alpha/and :portkey.aws.amplify/enable-notification))
(clojure.spec.alpha/def :portkey.aws.amplify.update-branch-request/environment-variables (clojure.spec.alpha/and :portkey.aws.amplify/environment-variables))
(clojure.spec.alpha/def :portkey.aws.amplify.update-branch-request/enable-auto-build (clojure.spec.alpha/and :portkey.aws.amplify/enable-auto-build))
(clojure.spec.alpha/def :portkey.aws.amplify.update-branch-request/app-id (clojure.spec.alpha/and :portkey.aws.amplify/app-id))
(clojure.spec.alpha/def :portkey.aws.amplify.update-branch-request/ttl (clojure.spec.alpha/and :portkey.aws.amplify/ttl))
(clojure.spec.alpha/def :portkey.aws.amplify.update-branch-request/enable-basic-auth (clojure.spec.alpha/and :portkey.aws.amplify/enable-basic-auth))
(clojure.spec.alpha/def :portkey.aws.amplify.update-branch-request/description (clojure.spec.alpha/and :portkey.aws.amplify/description))
(clojure.spec.alpha/def :portkey.aws.amplify.update-branch-request/stage (clojure.spec.alpha/and :portkey.aws.amplify/stage))
(clojure.spec.alpha/def :portkey.aws.amplify/update-branch-request (clojure.spec.alpha/keys :req-un [:portkey.aws.amplify.update-branch-request/app-id :portkey.aws.amplify.update-branch-request/branch-name] :opt-un [:portkey.aws.amplify.update-branch-request/basic-auth-credentials :portkey.aws.amplify.update-branch-request/build-spec :portkey.aws.amplify.update-branch-request/framework :portkey.aws.amplify.update-branch-request/enable-notification :portkey.aws.amplify.update-branch-request/environment-variables :portkey.aws.amplify.update-branch-request/enable-auto-build :portkey.aws.amplify.update-branch-request/ttl :portkey.aws.amplify.update-branch-request/enable-basic-auth :portkey.aws.amplify.update-branch-request/description :portkey.aws.amplify.update-branch-request/stage]))

(clojure.spec.alpha/def :portkey.aws.amplify.list-domain-associations-result/domain-associations (clojure.spec.alpha/and :portkey.aws.amplify/domain-associations))
(clojure.spec.alpha/def :portkey.aws.amplify.list-domain-associations-result/next-token (clojure.spec.alpha/and :portkey.aws.amplify/next-token))
(clojure.spec.alpha/def :portkey.aws.amplify/list-domain-associations-result (clojure.spec.alpha/keys :req-un [:portkey.aws.amplify.list-domain-associations-result/domain-associations] :opt-un [:portkey.aws.amplify.list-domain-associations-result/next-token]))

(clojure.spec.alpha/def :portkey.aws.amplify.create-app-result/app (clojure.spec.alpha/and :portkey.aws.amplify/app))
(clojure.spec.alpha/def :portkey.aws.amplify/create-app-result (clojure.spec.alpha/keys :req-un [:portkey.aws.amplify.create-app-result/app] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.amplify/apps (clojure.spec.alpha/coll-of :portkey.aws.amplify/app))

(clojure.spec.alpha/def :portkey.aws.amplify/description (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__21111__auto__] (clojure.core/< (clojure.core/count s__21111__auto__) 1000))))

(clojure.spec.alpha/def :portkey.aws.amplify/tag-value (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__21111__auto__] (clojure.core/< (clojure.core/count s__21111__auto__) 1000))))

(clojure.spec.alpha/def :portkey.aws.amplify.delete-app-request/app-id (clojure.spec.alpha/and :portkey.aws.amplify/app-id))
(clojure.spec.alpha/def :portkey.aws.amplify/delete-app-request (clojure.spec.alpha/keys :req-un [:portkey.aws.amplify.delete-app-request/app-id] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.amplify.not-found-exception/message (clojure.spec.alpha/and :portkey.aws.amplify/error-message))
(clojure.spec.alpha/def :portkey.aws.amplify/not-found-exception (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.amplify.not-found-exception/message]))

(clojure.spec.alpha/def :portkey.aws.amplify/steps (clojure.spec.alpha/coll-of :portkey.aws.amplify/step))

(clojure.spec.alpha/def :portkey.aws.amplify.get-domain-association-result/domain-association (clojure.spec.alpha/and :portkey.aws.amplify/domain-association))
(clojure.spec.alpha/def :portkey.aws.amplify/get-domain-association-result (clojure.spec.alpha/keys :req-un [:portkey.aws.amplify.get-domain-association-result/domain-association] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.amplify.get-job-request/app-id (clojure.spec.alpha/and :portkey.aws.amplify/app-id))
(clojure.spec.alpha/def :portkey.aws.amplify.get-job-request/branch-name (clojure.spec.alpha/and :portkey.aws.amplify/branch-name))
(clojure.spec.alpha/def :portkey.aws.amplify.get-job-request/job-id (clojure.spec.alpha/and :portkey.aws.amplify/job-id))
(clojure.spec.alpha/def :portkey.aws.amplify/get-job-request (clojure.spec.alpha/keys :req-un [:portkey.aws.amplify.get-job-request/app-id :portkey.aws.amplify.get-job-request/branch-name :portkey.aws.amplify.get-job-request/job-id] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.amplify.delete-app-result/app (clojure.spec.alpha/and :portkey.aws.amplify/app))
(clojure.spec.alpha/def :portkey.aws.amplify/delete-app-result (clojure.spec.alpha/keys :req-un [:portkey.aws.amplify.delete-app-result/app] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.amplify/build-spec (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__21110__auto__] (clojure.core/<= 1 (clojure.core/count s__21110__auto__))) (clojure.core/fn [s__21111__auto__] (clojure.core/< (clojure.core/count s__21111__auto__) 25000))))

(clojure.spec.alpha/def :portkey.aws.amplify/framework (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__21111__auto__] (clojure.core/< (clojure.core/count s__21111__auto__) 255))))

(clojure.spec.alpha/def :portkey.aws.amplify.sub-domain/sub-domain-setting (clojure.spec.alpha/and :portkey.aws.amplify/sub-domain-setting))
(clojure.spec.alpha/def :portkey.aws.amplify.sub-domain/verified (clojure.spec.alpha/and :portkey.aws.amplify/verified))
(clojure.spec.alpha/def :portkey.aws.amplify.sub-domain/dns-record (clojure.spec.alpha/and :portkey.aws.amplify/dns-record))
(clojure.spec.alpha/def :portkey.aws.amplify/sub-domain (clojure.spec.alpha/keys :req-un [:portkey.aws.amplify.sub-domain/sub-domain-setting :portkey.aws.amplify.sub-domain/verified :portkey.aws.amplify.sub-domain/dns-record] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.amplify.list-domain-associations-request/app-id (clojure.spec.alpha/and :portkey.aws.amplify/app-id))
(clojure.spec.alpha/def :portkey.aws.amplify.list-domain-associations-request/next-token (clojure.spec.alpha/and :portkey.aws.amplify/next-token))
(clojure.spec.alpha/def :portkey.aws.amplify.list-domain-associations-request/max-results (clojure.spec.alpha/and :portkey.aws.amplify/max-results))
(clojure.spec.alpha/def :portkey.aws.amplify/list-domain-associations-request (clojure.spec.alpha/keys :req-un [:portkey.aws.amplify.list-domain-associations-request/app-id] :opt-un [:portkey.aws.amplify.list-domain-associations-request/next-token :portkey.aws.amplify.list-domain-associations-request/max-results]))

(clojure.spec.alpha/def :portkey.aws.amplify.get-app-request/app-id (clojure.spec.alpha/and :portkey.aws.amplify/app-id))
(clojure.spec.alpha/def :portkey.aws.amplify/get-app-request (clojure.spec.alpha/keys :req-un [:portkey.aws.amplify.get-app-request/app-id] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.amplify.start-job-request/app-id (clojure.spec.alpha/and :portkey.aws.amplify/app-id))
(clojure.spec.alpha/def :portkey.aws.amplify.start-job-request/branch-name (clojure.spec.alpha/and :portkey.aws.amplify/branch-name))
(clojure.spec.alpha/def :portkey.aws.amplify.start-job-request/job-id (clojure.spec.alpha/and :portkey.aws.amplify/job-id))
(clojure.spec.alpha/def :portkey.aws.amplify.start-job-request/job-type (clojure.spec.alpha/and :portkey.aws.amplify/job-type))
(clojure.spec.alpha/def :portkey.aws.amplify.start-job-request/job-reason (clojure.spec.alpha/and :portkey.aws.amplify/job-reason))
(clojure.spec.alpha/def :portkey.aws.amplify.start-job-request/commit-id (clojure.spec.alpha/and :portkey.aws.amplify/commit-id))
(clojure.spec.alpha/def :portkey.aws.amplify.start-job-request/commit-message (clojure.spec.alpha/and :portkey.aws.amplify/commit-message))
(clojure.spec.alpha/def :portkey.aws.amplify.start-job-request/commit-time (clojure.spec.alpha/and :portkey.aws.amplify/commit-time))
(clojure.spec.alpha/def :portkey.aws.amplify/start-job-request (clojure.spec.alpha/keys :req-un [:portkey.aws.amplify.start-job-request/app-id :portkey.aws.amplify.start-job-request/branch-name :portkey.aws.amplify.start-job-request/job-type] :opt-un [:portkey.aws.amplify.start-job-request/job-id :portkey.aws.amplify.start-job-request/job-reason :portkey.aws.amplify.start-job-request/commit-id :portkey.aws.amplify.start-job-request/commit-message :portkey.aws.amplify.start-job-request/commit-time]))

(clojure.spec.alpha/def :portkey.aws.amplify/sub-domains (clojure.spec.alpha/coll-of :portkey.aws.amplify/sub-domain :max-count 255))

(clojure.spec.alpha/def :portkey.aws.amplify/step-name (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__21111__auto__] (clojure.core/< (clojure.core/count s__21111__auto__) 255))))

(clojure.spec.alpha/def :portkey.aws.amplify.delete-domain-association-result/domain-association (clojure.spec.alpha/and :portkey.aws.amplify/domain-association))
(clojure.spec.alpha/def :portkey.aws.amplify/delete-domain-association-result (clojure.spec.alpha/keys :req-un [:portkey.aws.amplify.delete-domain-association-result/domain-association] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.amplify/app-id (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__21110__auto__] (clojure.core/<= 1 (clojure.core/count s__21110__auto__))) (clojure.core/fn [s__21111__auto__] (clojure.core/< (clojure.core/count s__21111__auto__) 255))))

(clojure.spec.alpha/def :portkey.aws.amplify/branches (clojure.spec.alpha/coll-of :portkey.aws.amplify/branch :max-count 255))

(clojure.spec.alpha/def :portkey.aws.amplify/custom-domain (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__21111__auto__] (clojure.core/< (clojure.core/count s__21111__auto__) 255))))

(clojure.spec.alpha/def :portkey.aws.amplify.list-jobs-result/job-summaries (clojure.spec.alpha/and :portkey.aws.amplify/job-summaries))
(clojure.spec.alpha/def :portkey.aws.amplify.list-jobs-result/next-token (clojure.spec.alpha/and :portkey.aws.amplify/next-token))
(clojure.spec.alpha/def :portkey.aws.amplify/list-jobs-result (clojure.spec.alpha/keys :req-un [:portkey.aws.amplify.list-jobs-result/job-summaries] :opt-un [:portkey.aws.amplify.list-jobs-result/next-token]))

(clojure.spec.alpha/def :portkey.aws.amplify/active-job-id (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__21111__auto__] (clojure.core/< (clojure.core/count s__21111__auto__) 1000))))

(clojure.spec.alpha/def :portkey.aws.amplify/create-time clojure.core/inst?)

(clojure.spec.alpha/def :portkey.aws.amplify.delete-domain-association-request/app-id (clojure.spec.alpha/and :portkey.aws.amplify/app-id))
(clojure.spec.alpha/def :portkey.aws.amplify.delete-domain-association-request/domain-name (clojure.spec.alpha/and :portkey.aws.amplify/domain-name))
(clojure.spec.alpha/def :portkey.aws.amplify/delete-domain-association-request (clojure.spec.alpha/keys :req-un [:portkey.aws.amplify.delete-domain-association-request/app-id :portkey.aws.amplify.delete-domain-association-request/domain-name] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.amplify/branch-arn (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__21111__auto__] (clojure.core/< (clojure.core/count s__21111__auto__) 1000))))

(clojure.spec.alpha/def :portkey.aws.amplify/last-deploy-time clojure.core/inst?)

(clojure.spec.alpha/def :portkey.aws.amplify/domain-prefix (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__21111__auto__] (clojure.core/< (clojure.core/count s__21111__auto__) 255))))

(clojure.spec.alpha/def :portkey.aws.amplify/dns-record (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__21111__auto__] (clojure.core/< (clojure.core/count s__21111__auto__) 1000))))

(clojure.spec.alpha/def :portkey.aws.amplify.dependent-service-failure-exception/message (clojure.spec.alpha/and :portkey.aws.amplify/error-message))
(clojure.spec.alpha/def :portkey.aws.amplify/dependent-service-failure-exception (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.amplify.dependent-service-failure-exception/message]))

(clojure.spec.alpha/def :portkey.aws.amplify/max-results (clojure.spec.alpha/int-in 1 100))

(clojure.spec.alpha/def :portkey.aws.amplify/enable-auto-build clojure.core/boolean?)

(clojure.spec.alpha/def :portkey.aws.amplify/condition (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__21110__auto__] (clojure.core/<= 1 (clojure.core/count s__21110__auto__))) (clojure.core/fn [s__21111__auto__] (clojure.core/< (clojure.core/count s__21111__auto__) 2048))))

(clojure.spec.alpha/def :portkey.aws.amplify.delete-job-request/app-id (clojure.spec.alpha/and :portkey.aws.amplify/app-id))
(clojure.spec.alpha/def :portkey.aws.amplify.delete-job-request/branch-name (clojure.spec.alpha/and :portkey.aws.amplify/branch-name))
(clojure.spec.alpha/def :portkey.aws.amplify.delete-job-request/job-id (clojure.spec.alpha/and :portkey.aws.amplify/job-id))
(clojure.spec.alpha/def :portkey.aws.amplify/delete-job-request (clojure.spec.alpha/keys :req-un [:portkey.aws.amplify.delete-job-request/app-id :portkey.aws.amplify.delete-job-request/branch-name :portkey.aws.amplify.delete-job-request/job-id] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.amplify/domain-name (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__21111__auto__] (clojure.core/< (clojure.core/count s__21111__auto__) 255))))

(clojure.spec.alpha/def :portkey.aws.amplify.list-apps-result/apps (clojure.spec.alpha/and :portkey.aws.amplify/apps))
(clojure.spec.alpha/def :portkey.aws.amplify.list-apps-result/next-token (clojure.spec.alpha/and :portkey.aws.amplify/next-token))
(clojure.spec.alpha/def :portkey.aws.amplify/list-apps-result (clojure.spec.alpha/keys :req-un [:portkey.aws.amplify.list-apps-result/apps] :opt-un [:portkey.aws.amplify.list-apps-result/next-token]))

(clojure.spec.alpha/def :portkey.aws.amplify.job/summary (clojure.spec.alpha/and :portkey.aws.amplify/job-summary))
(clojure.spec.alpha/def :portkey.aws.amplify.job/steps (clojure.spec.alpha/and :portkey.aws.amplify/steps))
(clojure.spec.alpha/def :portkey.aws.amplify/job (clojure.spec.alpha/keys :req-un [:portkey.aws.amplify.job/summary :portkey.aws.amplify.job/steps] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.amplify/target (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__21110__auto__] (clojure.core/<= 1 (clojure.core/count s__21110__auto__))) (clojure.core/fn [s__21111__auto__] (clojure.core/< (clojure.core/count s__21111__auto__) 2048))))

(clojure.spec.alpha/def :portkey.aws.amplify/name (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__21110__auto__] (clojure.core/<= 1 (clojure.core/count s__21110__auto__))) (clojure.core/fn [s__21111__auto__] (clojure.core/< (clojure.core/count s__21111__auto__) 255))))

(clojure.spec.alpha/def :portkey.aws.amplify/job-reason (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__21111__auto__] (clojure.core/< (clojure.core/count s__21111__auto__) 255))))

(clojure.spec.alpha/def :portkey.aws.amplify.update-domain-association-result/domain-association (clojure.spec.alpha/and :portkey.aws.amplify/domain-association))
(clojure.spec.alpha/def :portkey.aws.amplify/update-domain-association-result (clojure.spec.alpha/keys :req-un [:portkey.aws.amplify.update-domain-association-result/domain-association] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.amplify.delete-branch-result/branch (clojure.spec.alpha/and :portkey.aws.amplify/branch))
(clojure.spec.alpha/def :portkey.aws.amplify/delete-branch-result (clojure.spec.alpha/keys :req-un [:portkey.aws.amplify.delete-branch-result/branch] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.amplify/thumbnail-url (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__21110__auto__] (clojure.core/<= 1 (clojure.core/count s__21110__auto__))) (clojure.core/fn [s__21111__auto__] (clojure.core/< (clojure.core/count s__21111__auto__) 2000))))

(clojure.spec.alpha/def :portkey.aws.amplify/commit-message (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__21111__auto__] (clojure.core/< (clojure.core/count s__21111__auto__) 10000))))

(clojure.spec.alpha/def :portkey.aws.amplify/job-summaries (clojure.spec.alpha/coll-of :portkey.aws.amplify/job-summary))

(clojure.spec.alpha/def :portkey.aws.amplify/domain-associations (clojure.spec.alpha/coll-of :portkey.aws.amplify/domain-association :max-count 255))

(clojure.spec.alpha/def :portkey.aws.amplify.job-summary/commit-time (clojure.spec.alpha/and :portkey.aws.amplify/commit-time))
(clojure.spec.alpha/def :portkey.aws.amplify.job-summary/commit-message (clojure.spec.alpha/and :portkey.aws.amplify/commit-message))
(clojure.spec.alpha/def :portkey.aws.amplify.job-summary/start-time (clojure.spec.alpha/and :portkey.aws.amplify/start-time))
(clojure.spec.alpha/def :portkey.aws.amplify.job-summary/status (clojure.spec.alpha/and :portkey.aws.amplify/job-status))
(clojure.spec.alpha/def :portkey.aws.amplify.job-summary/job-arn (clojure.spec.alpha/and :portkey.aws.amplify/job-arn))
(clojure.spec.alpha/def :portkey.aws.amplify.job-summary/commit-id (clojure.spec.alpha/and :portkey.aws.amplify/commit-id))
(clojure.spec.alpha/def :portkey.aws.amplify.job-summary/end-time (clojure.spec.alpha/and :portkey.aws.amplify/end-time))
(clojure.spec.alpha/def :portkey.aws.amplify.job-summary/job-id (clojure.spec.alpha/and :portkey.aws.amplify/job-id))
(clojure.spec.alpha/def :portkey.aws.amplify.job-summary/job-type (clojure.spec.alpha/and :portkey.aws.amplify/job-type))
(clojure.spec.alpha/def :portkey.aws.amplify/job-summary (clojure.spec.alpha/keys :req-un [:portkey.aws.amplify.job-summary/job-arn :portkey.aws.amplify.job-summary/job-id :portkey.aws.amplify.job-summary/commit-id :portkey.aws.amplify.job-summary/commit-message :portkey.aws.amplify.job-summary/commit-time :portkey.aws.amplify.job-summary/start-time :portkey.aws.amplify.job-summary/status :portkey.aws.amplify.job-summary/job-type] :opt-un [:portkey.aws.amplify.job-summary/end-time]))

(clojure.spec.alpha/def :portkey.aws.amplify.custom-rule/source (clojure.spec.alpha/and :portkey.aws.amplify/source))
(clojure.spec.alpha/def :portkey.aws.amplify.custom-rule/target (clojure.spec.alpha/and :portkey.aws.amplify/target))
(clojure.spec.alpha/def :portkey.aws.amplify.custom-rule/status (clojure.spec.alpha/and :portkey.aws.amplify/status))
(clojure.spec.alpha/def :portkey.aws.amplify.custom-rule/condition (clojure.spec.alpha/and :portkey.aws.amplify/condition))
(clojure.spec.alpha/def :portkey.aws.amplify/custom-rule (clojure.spec.alpha/keys :req-un [:portkey.aws.amplify.custom-rule/source :portkey.aws.amplify.custom-rule/target] :opt-un [:portkey.aws.amplify.custom-rule/status :portkey.aws.amplify.custom-rule/condition]))

(clojure.spec.alpha/def :portkey.aws.amplify/default-domain (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__21110__auto__] (clojure.core/<= 1 (clojure.core/count s__21110__auto__))) (clojure.core/fn [s__21111__auto__] (clojure.core/< (clojure.core/count s__21111__auto__) 1000))))

(clojure.spec.alpha/def :portkey.aws.amplify/stage #{:beta "EXPERIMENTAL" :development :experimental :production "PRODUCTION" "DEVELOPMENT" "BETA"})

(clojure.spec.alpha/def :portkey.aws.amplify/job-arn (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__21111__auto__] (clojure.core/< (clojure.core/count s__21111__auto__) 1000))))

(clojure.spec.alpha/def :portkey.aws.amplify/custom-rules (clojure.spec.alpha/coll-of :portkey.aws.amplify/custom-rule))

(clojure.spec.alpha/def :portkey.aws.amplify/enable-basic-auth clojure.core/boolean?)

(clojure.spec.alpha/def :portkey.aws.amplify/commit-time clojure.core/inst?)

(clojure.spec.alpha/def :portkey.aws.amplify.delete-branch-request/app-id (clojure.spec.alpha/and :portkey.aws.amplify/app-id))
(clojure.spec.alpha/def :portkey.aws.amplify.delete-branch-request/branch-name (clojure.spec.alpha/and :portkey.aws.amplify/branch-name))
(clojure.spec.alpha/def :portkey.aws.amplify/delete-branch-request (clojure.spec.alpha/keys :req-un [:portkey.aws.amplify.delete-branch-request/app-id :portkey.aws.amplify.delete-branch-request/branch-name] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.amplify.list-branches-request/app-id (clojure.spec.alpha/and :portkey.aws.amplify/app-id))
(clojure.spec.alpha/def :portkey.aws.amplify.list-branches-request/next-token (clojure.spec.alpha/and :portkey.aws.amplify/next-token))
(clojure.spec.alpha/def :portkey.aws.amplify.list-branches-request/max-results (clojure.spec.alpha/and :portkey.aws.amplify/max-results))
(clojure.spec.alpha/def :portkey.aws.amplify/list-branches-request (clojure.spec.alpha/keys :req-un [:portkey.aws.amplify.list-branches-request/app-id] :opt-un [:portkey.aws.amplify.list-branches-request/next-token :portkey.aws.amplify.list-branches-request/max-results]))

(clojure.spec.alpha/def :portkey.aws.amplify/job-id (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__21111__auto__] (clojure.core/< (clojure.core/count s__21111__auto__) 255))))

(clojure.core/defn list-apps " Lists existing Amplify Apps." ([] (list-apps {})) ([list-apps-requestinput] (clojure.core/let [request-function-result__22153__auto__ (req-list-apps-request list-apps-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__22153__auto__ {:http.request.configuration/endpoints portkey.aws.amplify/endpoints, :http.request.configuration/target-prefix nil, :http.request.spec/output-spec :portkey.aws.amplify/list-apps-result, :http.request.configuration/mime-type {"content-type" "application/json"}, :http.request.configuration/request-uri "/apps", :http.request.configuration/version "2017-07-25", :http.request.configuration/service-id "Amplify", :http.request.spec/input-spec :portkey.aws.amplify/list-apps-request, :http.request.configuration/protocol "rest-json", :http.request.configuration/method :get, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "ListApps", :http.request.configuration/output-deser-fn response-list-apps-result, :http.request.spec/error-spec {"BadRequestException" :portkey.aws.amplify/bad-request-exception, "UnauthorizedException" :portkey.aws.amplify/unauthorized-exception, "InternalFailureException" :portkey.aws.amplify/internal-failure-exception}})))))
(clojure.spec.alpha/fdef list-apps :args (clojure.spec.alpha/? :portkey.aws.amplify/list-apps-request) :ret (clojure.spec.alpha/and :portkey.aws.amplify/list-apps-result))

(clojure.core/defn update-domain-association " Create a new DomainAssociation on an App" ([update-domain-association-requestinput] (clojure.core/let [request-function-result__22153__auto__ (req-update-domain-association-request update-domain-association-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__22153__auto__ {:http.request.configuration/endpoints portkey.aws.amplify/endpoints, :http.request.configuration/target-prefix nil, :http.request.spec/output-spec :portkey.aws.amplify/update-domain-association-result, :http.request.configuration/mime-type {"content-type" "application/json"}, :http.request.configuration/request-uri "/apps/{appId}/domains/{domainName}", :http.request.configuration/version "2017-07-25", :http.request.configuration/service-id "Amplify", :http.request.spec/input-spec :portkey.aws.amplify/update-domain-association-request, :http.request.configuration/protocol "rest-json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "UpdateDomainAssociation", :http.request.configuration/output-deser-fn response-update-domain-association-result, :http.request.spec/error-spec {"BadRequestException" :portkey.aws.amplify/bad-request-exception, "UnauthorizedException" :portkey.aws.amplify/unauthorized-exception, "NotFoundException" :portkey.aws.amplify/not-found-exception, "InternalFailureException" :portkey.aws.amplify/internal-failure-exception, "DependentServiceFailureException" :portkey.aws.amplify/dependent-service-failure-exception}})))))
(clojure.spec.alpha/fdef update-domain-association :args (clojure.spec.alpha/tuple :portkey.aws.amplify/update-domain-association-request) :ret (clojure.spec.alpha/and :portkey.aws.amplify/update-domain-association-result))

(clojure.core/defn update-branch " Updates a branch for an Amplify App." ([update-branch-requestinput] (clojure.core/let [request-function-result__22153__auto__ (req-update-branch-request update-branch-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__22153__auto__ {:http.request.configuration/endpoints portkey.aws.amplify/endpoints, :http.request.configuration/target-prefix nil, :http.request.spec/output-spec :portkey.aws.amplify/update-branch-result, :http.request.configuration/mime-type {"content-type" "application/json"}, :http.request.configuration/request-uri "/apps/{appId}/branches/{branchName}", :http.request.configuration/version "2017-07-25", :http.request.configuration/service-id "Amplify", :http.request.spec/input-spec :portkey.aws.amplify/update-branch-request, :http.request.configuration/protocol "rest-json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "UpdateBranch", :http.request.configuration/output-deser-fn response-update-branch-result, :http.request.spec/error-spec {"BadRequestException" :portkey.aws.amplify/bad-request-exception, "UnauthorizedException" :portkey.aws.amplify/unauthorized-exception, "NotFoundException" :portkey.aws.amplify/not-found-exception, "InternalFailureException" :portkey.aws.amplify/internal-failure-exception, "DependentServiceFailureException" :portkey.aws.amplify/dependent-service-failure-exception}})))))
(clojure.spec.alpha/fdef update-branch :args (clojure.spec.alpha/tuple :portkey.aws.amplify/update-branch-request) :ret (clojure.spec.alpha/and :portkey.aws.amplify/update-branch-result))

(clojure.core/defn list-domain-associations " List domains with an app" ([list-domain-associations-requestinput] (clojure.core/let [request-function-result__22153__auto__ (req-list-domain-associations-request list-domain-associations-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__22153__auto__ {:http.request.configuration/endpoints portkey.aws.amplify/endpoints, :http.request.configuration/target-prefix nil, :http.request.spec/output-spec :portkey.aws.amplify/list-domain-associations-result, :http.request.configuration/mime-type {"content-type" "application/json"}, :http.request.configuration/request-uri "/apps/{appId}/domains", :http.request.configuration/version "2017-07-25", :http.request.configuration/service-id "Amplify", :http.request.spec/input-spec :portkey.aws.amplify/list-domain-associations-request, :http.request.configuration/protocol "rest-json", :http.request.configuration/method :get, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "ListDomainAssociations", :http.request.configuration/output-deser-fn response-list-domain-associations-result, :http.request.spec/error-spec {"BadRequestException" :portkey.aws.amplify/bad-request-exception, "UnauthorizedException" :portkey.aws.amplify/unauthorized-exception, "InternalFailureException" :portkey.aws.amplify/internal-failure-exception}})))))
(clojure.spec.alpha/fdef list-domain-associations :args (clojure.spec.alpha/tuple :portkey.aws.amplify/list-domain-associations-request) :ret (clojure.spec.alpha/and :portkey.aws.amplify/list-domain-associations-result))

(clojure.core/defn get-domain-association " Retrieves domain info that corresponds to an appId and domainName." ([get-domain-association-requestinput] (clojure.core/let [request-function-result__22153__auto__ (req-get-domain-association-request get-domain-association-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__22153__auto__ {:http.request.configuration/endpoints portkey.aws.amplify/endpoints, :http.request.configuration/target-prefix nil, :http.request.spec/output-spec :portkey.aws.amplify/get-domain-association-result, :http.request.configuration/mime-type {"content-type" "application/json"}, :http.request.configuration/request-uri "/apps/{appId}/domains/{domainName}", :http.request.configuration/version "2017-07-25", :http.request.configuration/service-id "Amplify", :http.request.spec/input-spec :portkey.aws.amplify/get-domain-association-request, :http.request.configuration/protocol "rest-json", :http.request.configuration/method :get, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "GetDomainAssociation", :http.request.configuration/output-deser-fn response-get-domain-association-result, :http.request.spec/error-spec {"BadRequestException" :portkey.aws.amplify/bad-request-exception, "UnauthorizedException" :portkey.aws.amplify/unauthorized-exception, "NotFoundException" :portkey.aws.amplify/not-found-exception, "InternalFailureException" :portkey.aws.amplify/internal-failure-exception}})))))
(clojure.spec.alpha/fdef get-domain-association :args (clojure.spec.alpha/tuple :portkey.aws.amplify/get-domain-association-request) :ret (clojure.spec.alpha/and :portkey.aws.amplify/get-domain-association-result))

(clojure.core/defn start-job " Starts a new job for a branch, part of an Amplify App." ([start-job-requestinput] (clojure.core/let [request-function-result__22153__auto__ (req-start-job-request start-job-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__22153__auto__ {:http.request.configuration/endpoints portkey.aws.amplify/endpoints, :http.request.configuration/target-prefix nil, :http.request.spec/output-spec :portkey.aws.amplify/start-job-result, :http.request.configuration/mime-type {"content-type" "application/json"}, :http.request.configuration/request-uri "/apps/{appId}/branches/{branchName}/jobs", :http.request.configuration/version "2017-07-25", :http.request.configuration/service-id "Amplify", :http.request.spec/input-spec :portkey.aws.amplify/start-job-request, :http.request.configuration/protocol "rest-json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "StartJob", :http.request.configuration/output-deser-fn response-start-job-result, :http.request.spec/error-spec {"BadRequestException" :portkey.aws.amplify/bad-request-exception, "UnauthorizedException" :portkey.aws.amplify/unauthorized-exception, "InternalFailureException" :portkey.aws.amplify/internal-failure-exception, "NotFoundException" :portkey.aws.amplify/not-found-exception, "LimitExceededException" :portkey.aws.amplify/limit-exceeded-exception}})))))
(clojure.spec.alpha/fdef start-job :args (clojure.spec.alpha/tuple :portkey.aws.amplify/start-job-request) :ret (clojure.spec.alpha/and :portkey.aws.amplify/start-job-result))

(clojure.core/defn update-app " Updates an existing Amplify App." ([update-app-requestinput] (clojure.core/let [request-function-result__22153__auto__ (req-update-app-request update-app-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__22153__auto__ {:http.request.configuration/endpoints portkey.aws.amplify/endpoints, :http.request.configuration/target-prefix nil, :http.request.spec/output-spec :portkey.aws.amplify/update-app-result, :http.request.configuration/mime-type {"content-type" "application/json"}, :http.request.configuration/request-uri "/apps/{appId}", :http.request.configuration/version "2017-07-25", :http.request.configuration/service-id "Amplify", :http.request.spec/input-spec :portkey.aws.amplify/update-app-request, :http.request.configuration/protocol "rest-json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "UpdateApp", :http.request.configuration/output-deser-fn response-update-app-result, :http.request.spec/error-spec {"BadRequestException" :portkey.aws.amplify/bad-request-exception, "NotFoundException" :portkey.aws.amplify/not-found-exception, "UnauthorizedException" :portkey.aws.amplify/unauthorized-exception, "InternalFailureException" :portkey.aws.amplify/internal-failure-exception}})))))
(clojure.spec.alpha/fdef update-app :args (clojure.spec.alpha/tuple :portkey.aws.amplify/update-app-request) :ret (clojure.spec.alpha/and :portkey.aws.amplify/update-app-result))

(clojure.core/defn get-branch " Retrieves a branch for an Amplify App." ([get-branch-requestinput] (clojure.core/let [request-function-result__22153__auto__ (req-get-branch-request get-branch-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__22153__auto__ {:http.request.configuration/endpoints portkey.aws.amplify/endpoints, :http.request.configuration/target-prefix nil, :http.request.spec/output-spec :portkey.aws.amplify/get-branch-result, :http.request.configuration/mime-type {"content-type" "application/json"}, :http.request.configuration/request-uri "/apps/{appId}/branches/{branchName}", :http.request.configuration/version "2017-07-25", :http.request.configuration/service-id "Amplify", :http.request.spec/input-spec :portkey.aws.amplify/get-branch-request, :http.request.configuration/protocol "rest-json", :http.request.configuration/method :get, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "GetBranch", :http.request.configuration/output-deser-fn response-get-branch-result, :http.request.spec/error-spec {"BadRequestException" :portkey.aws.amplify/bad-request-exception, "UnauthorizedException" :portkey.aws.amplify/unauthorized-exception, "NotFoundException" :portkey.aws.amplify/not-found-exception, "InternalFailureException" :portkey.aws.amplify/internal-failure-exception}})))))
(clojure.spec.alpha/fdef get-branch :args (clojure.spec.alpha/tuple :portkey.aws.amplify/get-branch-request) :ret (clojure.spec.alpha/and :portkey.aws.amplify/get-branch-result))

(clojure.core/defn stop-job " Stop a job that is in progress, for an Amplify branch, part of Amplify App." ([stop-job-requestinput] (clojure.core/let [request-function-result__22153__auto__ (req-stop-job-request stop-job-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__22153__auto__ {:http.request.configuration/endpoints portkey.aws.amplify/endpoints, :http.request.configuration/target-prefix nil, :http.request.spec/output-spec :portkey.aws.amplify/stop-job-result, :http.request.configuration/mime-type {"content-type" "application/json"}, :http.request.configuration/request-uri "/apps/{appId}/branches/{branchName}/jobs/{jobId}/stop", :http.request.configuration/version "2017-07-25", :http.request.configuration/service-id "Amplify", :http.request.spec/input-spec :portkey.aws.amplify/stop-job-request, :http.request.configuration/protocol "rest-json", :http.request.configuration/method :delete, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "StopJob", :http.request.configuration/output-deser-fn response-stop-job-result, :http.request.spec/error-spec {"BadRequestException" :portkey.aws.amplify/bad-request-exception, "UnauthorizedException" :portkey.aws.amplify/unauthorized-exception, "InternalFailureException" :portkey.aws.amplify/internal-failure-exception, "NotFoundException" :portkey.aws.amplify/not-found-exception, "LimitExceededException" :portkey.aws.amplify/limit-exceeded-exception}})))))
(clojure.spec.alpha/fdef stop-job :args (clojure.spec.alpha/tuple :portkey.aws.amplify/stop-job-request) :ret (clojure.spec.alpha/and :portkey.aws.amplify/stop-job-result))

(clojure.core/defn delete-app " Delete an existing Amplify App by appId." ([delete-app-requestinput] (clojure.core/let [request-function-result__22153__auto__ (req-delete-app-request delete-app-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__22153__auto__ {:http.request.configuration/endpoints portkey.aws.amplify/endpoints, :http.request.configuration/target-prefix nil, :http.request.spec/output-spec :portkey.aws.amplify/delete-app-result, :http.request.configuration/mime-type {"content-type" "application/json"}, :http.request.configuration/request-uri "/apps/{appId}", :http.request.configuration/version "2017-07-25", :http.request.configuration/service-id "Amplify", :http.request.spec/input-spec :portkey.aws.amplify/delete-app-request, :http.request.configuration/protocol "rest-json", :http.request.configuration/method :delete, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "DeleteApp", :http.request.configuration/output-deser-fn response-delete-app-result, :http.request.spec/error-spec {"BadRequestException" :portkey.aws.amplify/bad-request-exception, "NotFoundException" :portkey.aws.amplify/not-found-exception, "UnauthorizedException" :portkey.aws.amplify/unauthorized-exception, "InternalFailureException" :portkey.aws.amplify/internal-failure-exception, "DependentServiceFailureException" :portkey.aws.amplify/dependent-service-failure-exception}})))))
(clojure.spec.alpha/fdef delete-app :args (clojure.spec.alpha/tuple :portkey.aws.amplify/delete-app-request) :ret (clojure.spec.alpha/and :portkey.aws.amplify/delete-app-result))

(clojure.core/defn create-app " Creates a new Amplify App." ([create-app-requestinput] (clojure.core/let [request-function-result__22153__auto__ (req-create-app-request create-app-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__22153__auto__ {:http.request.configuration/endpoints portkey.aws.amplify/endpoints, :http.request.configuration/target-prefix nil, :http.request.spec/output-spec :portkey.aws.amplify/create-app-result, :http.request.configuration/mime-type {"content-type" "application/json"}, :http.request.configuration/request-uri "/apps", :http.request.configuration/version "2017-07-25", :http.request.configuration/service-id "Amplify", :http.request.spec/input-spec :portkey.aws.amplify/create-app-request, :http.request.configuration/protocol "rest-json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "CreateApp", :http.request.configuration/output-deser-fn response-create-app-result, :http.request.spec/error-spec {"BadRequestException" :portkey.aws.amplify/bad-request-exception, "UnauthorizedException" :portkey.aws.amplify/unauthorized-exception, "InternalFailureException" :portkey.aws.amplify/internal-failure-exception, "LimitExceededException" :portkey.aws.amplify/limit-exceeded-exception, "DependentServiceFailureException" :portkey.aws.amplify/dependent-service-failure-exception}})))))
(clojure.spec.alpha/fdef create-app :args (clojure.spec.alpha/tuple :portkey.aws.amplify/create-app-request) :ret (clojure.spec.alpha/and :portkey.aws.amplify/create-app-result))

(clojure.core/defn list-branches " Lists branches for an Amplify App." ([list-branches-requestinput] (clojure.core/let [request-function-result__22153__auto__ (req-list-branches-request list-branches-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__22153__auto__ {:http.request.configuration/endpoints portkey.aws.amplify/endpoints, :http.request.configuration/target-prefix nil, :http.request.spec/output-spec :portkey.aws.amplify/list-branches-result, :http.request.configuration/mime-type {"content-type" "application/json"}, :http.request.configuration/request-uri "/apps/{appId}/branches", :http.request.configuration/version "2017-07-25", :http.request.configuration/service-id "Amplify", :http.request.spec/input-spec :portkey.aws.amplify/list-branches-request, :http.request.configuration/protocol "rest-json", :http.request.configuration/method :get, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "ListBranches", :http.request.configuration/output-deser-fn response-list-branches-result, :http.request.spec/error-spec {"BadRequestException" :portkey.aws.amplify/bad-request-exception, "UnauthorizedException" :portkey.aws.amplify/unauthorized-exception, "InternalFailureException" :portkey.aws.amplify/internal-failure-exception}})))))
(clojure.spec.alpha/fdef list-branches :args (clojure.spec.alpha/tuple :portkey.aws.amplify/list-branches-request) :ret (clojure.spec.alpha/and :portkey.aws.amplify/list-branches-result))

(clojure.core/defn create-domain-association " Create a new DomainAssociation on an App" ([create-domain-association-requestinput] (clojure.core/let [request-function-result__22153__auto__ (req-create-domain-association-request create-domain-association-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__22153__auto__ {:http.request.configuration/endpoints portkey.aws.amplify/endpoints, :http.request.configuration/target-prefix nil, :http.request.spec/output-spec :portkey.aws.amplify/create-domain-association-result, :http.request.configuration/mime-type {"content-type" "application/json"}, :http.request.configuration/request-uri "/apps/{appId}/domains", :http.request.configuration/version "2017-07-25", :http.request.configuration/service-id "Amplify", :http.request.spec/input-spec :portkey.aws.amplify/create-domain-association-request, :http.request.configuration/protocol "rest-json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "CreateDomainAssociation", :http.request.configuration/output-deser-fn response-create-domain-association-result, :http.request.spec/error-spec {"BadRequestException" :portkey.aws.amplify/bad-request-exception, "UnauthorizedException" :portkey.aws.amplify/unauthorized-exception, "NotFoundException" :portkey.aws.amplify/not-found-exception, "InternalFailureException" :portkey.aws.amplify/internal-failure-exception, "LimitExceededException" :portkey.aws.amplify/limit-exceeded-exception, "DependentServiceFailureException" :portkey.aws.amplify/dependent-service-failure-exception}})))))
(clojure.spec.alpha/fdef create-domain-association :args (clojure.spec.alpha/tuple :portkey.aws.amplify/create-domain-association-request) :ret (clojure.spec.alpha/and :portkey.aws.amplify/create-domain-association-result))

(clojure.core/defn delete-domain-association " Deletes a DomainAssociation." ([delete-domain-association-requestinput] (clojure.core/let [request-function-result__22153__auto__ (req-delete-domain-association-request delete-domain-association-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__22153__auto__ {:http.request.configuration/endpoints portkey.aws.amplify/endpoints, :http.request.configuration/target-prefix nil, :http.request.spec/output-spec :portkey.aws.amplify/delete-domain-association-result, :http.request.configuration/mime-type {"content-type" "application/json"}, :http.request.configuration/request-uri "/apps/{appId}/domains/{domainName}", :http.request.configuration/version "2017-07-25", :http.request.configuration/service-id "Amplify", :http.request.spec/input-spec :portkey.aws.amplify/delete-domain-association-request, :http.request.configuration/protocol "rest-json", :http.request.configuration/method :delete, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "DeleteDomainAssociation", :http.request.configuration/output-deser-fn response-delete-domain-association-result, :http.request.spec/error-spec {"BadRequestException" :portkey.aws.amplify/bad-request-exception, "UnauthorizedException" :portkey.aws.amplify/unauthorized-exception, "NotFoundException" :portkey.aws.amplify/not-found-exception, "InternalFailureException" :portkey.aws.amplify/internal-failure-exception, "DependentServiceFailureException" :portkey.aws.amplify/dependent-service-failure-exception}})))))
(clojure.spec.alpha/fdef delete-domain-association :args (clojure.spec.alpha/tuple :portkey.aws.amplify/delete-domain-association-request) :ret (clojure.spec.alpha/and :portkey.aws.amplify/delete-domain-association-result))

(clojure.core/defn create-branch " Creates a new Branch for an Amplify App." ([create-branch-requestinput] (clojure.core/let [request-function-result__22153__auto__ (req-create-branch-request create-branch-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__22153__auto__ {:http.request.configuration/endpoints portkey.aws.amplify/endpoints, :http.request.configuration/target-prefix nil, :http.request.spec/output-spec :portkey.aws.amplify/create-branch-result, :http.request.configuration/mime-type {"content-type" "application/json"}, :http.request.configuration/request-uri "/apps/{appId}/branches", :http.request.configuration/version "2017-07-25", :http.request.configuration/service-id "Amplify", :http.request.spec/input-spec :portkey.aws.amplify/create-branch-request, :http.request.configuration/protocol "rest-json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "CreateBranch", :http.request.configuration/output-deser-fn response-create-branch-result, :http.request.spec/error-spec {"BadRequestException" :portkey.aws.amplify/bad-request-exception, "UnauthorizedException" :portkey.aws.amplify/unauthorized-exception, "NotFoundException" :portkey.aws.amplify/not-found-exception, "InternalFailureException" :portkey.aws.amplify/internal-failure-exception, "LimitExceededException" :portkey.aws.amplify/limit-exceeded-exception, "DependentServiceFailureException" :portkey.aws.amplify/dependent-service-failure-exception}})))))
(clojure.spec.alpha/fdef create-branch :args (clojure.spec.alpha/tuple :portkey.aws.amplify/create-branch-request) :ret (clojure.spec.alpha/and :portkey.aws.amplify/create-branch-result))

(clojure.core/defn delete-job " Delete a job, for an Amplify branch, part of Amplify App." ([delete-job-requestinput] (clojure.core/let [request-function-result__22153__auto__ (req-delete-job-request delete-job-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__22153__auto__ {:http.request.configuration/endpoints portkey.aws.amplify/endpoints, :http.request.configuration/target-prefix nil, :http.request.spec/output-spec :portkey.aws.amplify/delete-job-result, :http.request.configuration/mime-type {"content-type" "application/json"}, :http.request.configuration/request-uri "/apps/{appId}/branches/{branchName}/jobs/{jobId}", :http.request.configuration/version "2017-07-25", :http.request.configuration/service-id "Amplify", :http.request.spec/input-spec :portkey.aws.amplify/delete-job-request, :http.request.configuration/protocol "rest-json", :http.request.configuration/method :delete, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "DeleteJob", :http.request.configuration/output-deser-fn response-delete-job-result, :http.request.spec/error-spec {"BadRequestException" :portkey.aws.amplify/bad-request-exception, "UnauthorizedException" :portkey.aws.amplify/unauthorized-exception, "InternalFailureException" :portkey.aws.amplify/internal-failure-exception, "NotFoundException" :portkey.aws.amplify/not-found-exception, "LimitExceededException" :portkey.aws.amplify/limit-exceeded-exception}})))))
(clojure.spec.alpha/fdef delete-job :args (clojure.spec.alpha/tuple :portkey.aws.amplify/delete-job-request) :ret (clojure.spec.alpha/and :portkey.aws.amplify/delete-job-result))

(clojure.core/defn get-job " Get a job for a branch, part of an Amplify App." ([get-job-requestinput] (clojure.core/let [request-function-result__22153__auto__ (req-get-job-request get-job-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__22153__auto__ {:http.request.configuration/endpoints portkey.aws.amplify/endpoints, :http.request.configuration/target-prefix nil, :http.request.spec/output-spec :portkey.aws.amplify/get-job-result, :http.request.configuration/mime-type {"content-type" "application/json"}, :http.request.configuration/request-uri "/apps/{appId}/branches/{branchName}/jobs/{jobId}", :http.request.configuration/version "2017-07-25", :http.request.configuration/service-id "Amplify", :http.request.spec/input-spec :portkey.aws.amplify/get-job-request, :http.request.configuration/protocol "rest-json", :http.request.configuration/method :get, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "GetJob", :http.request.configuration/output-deser-fn response-get-job-result, :http.request.spec/error-spec {"BadRequestException" :portkey.aws.amplify/bad-request-exception, "UnauthorizedException" :portkey.aws.amplify/unauthorized-exception, "InternalFailureException" :portkey.aws.amplify/internal-failure-exception, "NotFoundException" :portkey.aws.amplify/not-found-exception, "LimitExceededException" :portkey.aws.amplify/limit-exceeded-exception}})))))
(clojure.spec.alpha/fdef get-job :args (clojure.spec.alpha/tuple :portkey.aws.amplify/get-job-request) :ret (clojure.spec.alpha/and :portkey.aws.amplify/get-job-result))

(clojure.core/defn get-app " Retrieves an existing Amplify App by appId." ([get-app-requestinput] (clojure.core/let [request-function-result__22153__auto__ (req-get-app-request get-app-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__22153__auto__ {:http.request.configuration/endpoints portkey.aws.amplify/endpoints, :http.request.configuration/target-prefix nil, :http.request.spec/output-spec :portkey.aws.amplify/get-app-result, :http.request.configuration/mime-type {"content-type" "application/json"}, :http.request.configuration/request-uri "/apps/{appId}", :http.request.configuration/version "2017-07-25", :http.request.configuration/service-id "Amplify", :http.request.spec/input-spec :portkey.aws.amplify/get-app-request, :http.request.configuration/protocol "rest-json", :http.request.configuration/method :get, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "GetApp", :http.request.configuration/output-deser-fn response-get-app-result, :http.request.spec/error-spec {"BadRequestException" :portkey.aws.amplify/bad-request-exception, "NotFoundException" :portkey.aws.amplify/not-found-exception, "UnauthorizedException" :portkey.aws.amplify/unauthorized-exception, "InternalFailureException" :portkey.aws.amplify/internal-failure-exception}})))))
(clojure.spec.alpha/fdef get-app :args (clojure.spec.alpha/tuple :portkey.aws.amplify/get-app-request) :ret (clojure.spec.alpha/and :portkey.aws.amplify/get-app-result))

(clojure.core/defn delete-branch " Deletes a branch for an Amplify App." ([delete-branch-requestinput] (clojure.core/let [request-function-result__22153__auto__ (req-delete-branch-request delete-branch-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__22153__auto__ {:http.request.configuration/endpoints portkey.aws.amplify/endpoints, :http.request.configuration/target-prefix nil, :http.request.spec/output-spec :portkey.aws.amplify/delete-branch-result, :http.request.configuration/mime-type {"content-type" "application/json"}, :http.request.configuration/request-uri "/apps/{appId}/branches/{branchName}", :http.request.configuration/version "2017-07-25", :http.request.configuration/service-id "Amplify", :http.request.spec/input-spec :portkey.aws.amplify/delete-branch-request, :http.request.configuration/protocol "rest-json", :http.request.configuration/method :delete, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "DeleteBranch", :http.request.configuration/output-deser-fn response-delete-branch-result, :http.request.spec/error-spec {"BadRequestException" :portkey.aws.amplify/bad-request-exception, "UnauthorizedException" :portkey.aws.amplify/unauthorized-exception, "NotFoundException" :portkey.aws.amplify/not-found-exception, "InternalFailureException" :portkey.aws.amplify/internal-failure-exception, "DependentServiceFailureException" :portkey.aws.amplify/dependent-service-failure-exception}})))))
(clojure.spec.alpha/fdef delete-branch :args (clojure.spec.alpha/tuple :portkey.aws.amplify/delete-branch-request) :ret (clojure.spec.alpha/and :portkey.aws.amplify/delete-branch-result))

(clojure.core/defn list-jobs " List Jobs for a branch, part of an Amplify App." ([list-jobs-requestinput] (clojure.core/let [request-function-result__22153__auto__ (req-list-jobs-request list-jobs-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__22153__auto__ {:http.request.configuration/endpoints portkey.aws.amplify/endpoints, :http.request.configuration/target-prefix nil, :http.request.spec/output-spec :portkey.aws.amplify/list-jobs-result, :http.request.configuration/mime-type {"content-type" "application/json"}, :http.request.configuration/request-uri "/apps/{appId}/branches/{branchName}/jobs", :http.request.configuration/version "2017-07-25", :http.request.configuration/service-id "Amplify", :http.request.spec/input-spec :portkey.aws.amplify/list-jobs-request, :http.request.configuration/protocol "rest-json", :http.request.configuration/method :get, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "ListJobs", :http.request.configuration/output-deser-fn response-list-jobs-result, :http.request.spec/error-spec {"BadRequestException" :portkey.aws.amplify/bad-request-exception, "UnauthorizedException" :portkey.aws.amplify/unauthorized-exception, "InternalFailureException" :portkey.aws.amplify/internal-failure-exception, "LimitExceededException" :portkey.aws.amplify/limit-exceeded-exception}})))))
(clojure.spec.alpha/fdef list-jobs :args (clojure.spec.alpha/tuple :portkey.aws.amplify/list-jobs-request) :ret (clojure.spec.alpha/and :portkey.aws.amplify/list-jobs-result))
