(ns portkey.aws.codestar (:require [portkey.aws]))

(def
 endpoints
 '{"ap-northeast-1"
   {:credential-scope {:service "codestar", :region "ap-northeast-1"},
    :ssl-common-name "codestar.ap-northeast-1.amazonaws.com",
    :endpoint "https://codestar.ap-northeast-1.amazonaws.com",
    :signature-version :v4},
   "eu-west-1"
   {:credential-scope {:service "codestar", :region "eu-west-1"},
    :ssl-common-name "codestar.eu-west-1.amazonaws.com",
    :endpoint "https://codestar.eu-west-1.amazonaws.com",
    :signature-version :v4},
   "us-east-2"
   {:credential-scope {:service "codestar", :region "us-east-2"},
    :ssl-common-name "codestar.us-east-2.amazonaws.com",
    :endpoint "https://codestar.us-east-2.amazonaws.com",
    :signature-version :v4},
   "ap-southeast-2"
   {:credential-scope {:service "codestar", :region "ap-southeast-2"},
    :ssl-common-name "codestar.ap-southeast-2.amazonaws.com",
    :endpoint "https://codestar.ap-southeast-2.amazonaws.com",
    :signature-version :v4},
   "ap-southeast-1"
   {:credential-scope {:service "codestar", :region "ap-southeast-1"},
    :ssl-common-name "codestar.ap-southeast-1.amazonaws.com",
    :endpoint "https://codestar.ap-southeast-1.amazonaws.com",
    :signature-version :v4},
   "ap-northeast-2"
   {:credential-scope {:service "codestar", :region "ap-northeast-2"},
    :ssl-common-name "codestar.ap-northeast-2.amazonaws.com",
    :endpoint "https://codestar.ap-northeast-2.amazonaws.com",
    :signature-version :v4},
   "ca-central-1"
   {:credential-scope {:service "codestar", :region "ca-central-1"},
    :ssl-common-name "codestar.ca-central-1.amazonaws.com",
    :endpoint "https://codestar.ca-central-1.amazonaws.com",
    :signature-version :v4},
   "eu-central-1"
   {:credential-scope {:service "codestar", :region "eu-central-1"},
    :ssl-common-name "codestar.eu-central-1.amazonaws.com",
    :endpoint "https://codestar.eu-central-1.amazonaws.com",
    :signature-version :v4},
   "eu-west-2"
   {:credential-scope {:service "codestar", :region "eu-west-2"},
    :ssl-common-name "codestar.eu-west-2.amazonaws.com",
    :endpoint "https://codestar.eu-west-2.amazonaws.com",
    :signature-version :v4},
   "us-west-2"
   {:credential-scope {:service "codestar", :region "us-west-2"},
    :ssl-common-name "codestar.us-west-2.amazonaws.com",
    :endpoint "https://codestar.us-west-2.amazonaws.com",
    :signature-version :v4},
   "us-east-1"
   {:credential-scope {:service "codestar", :region "us-east-1"},
    :ssl-common-name "codestar.us-east-1.amazonaws.com",
    :endpoint "https://codestar.us-east-1.amazonaws.com",
    :signature-version :v4},
   "us-west-1"
   {:credential-scope {:service "codestar", :region "us-west-1"},
    :ssl-common-name "codestar.us-west-1.amazonaws.com",
    :endpoint "https://codestar.us-west-1.amazonaws.com",
    :signature-version :v4}})

(clojure.core/declare ser-tag-keys)

(clojure.core/declare ser-repository-owner)

(clojure.core/declare ser-template-parameter-key)

(clojure.core/declare ser-repository-is-private)

(clojure.core/declare ser-remote-access-allowed)

(clojure.core/declare ser-client-request-token)

(clojure.core/declare ser-toolchain-source)

(clojure.core/declare ser-delete-stack)

(clojure.core/declare ser-email)

(clojure.core/declare ser-repository-enable-issues)

(clojure.core/declare ser-code-destination)

(clojure.core/declare ser-source-code)

(clojure.core/declare ser-repository-name)

(clojure.core/declare ser-code-commit-code-destination)

(clojure.core/declare ser-ssh-public-key)

(clojure.core/declare ser-user-profile-display-name)

(clojure.core/declare ser-repository-type)

(clojure.core/declare ser-role-arn)

(clojure.core/declare ser-tag-key)

(clojure.core/declare ser-pagination-token)

(clojure.core/declare ser-tags)

(clojure.core/declare ser-toolchain)

(clojure.core/declare ser-role)

(clojure.core/declare ser-template-parameter-map)

(clojure.core/declare ser-code-source)

(clojure.core/declare ser-tag-value)

(clojure.core/declare ser-git-hub-personal-token)

(clojure.core/declare ser-project-description)

(clojure.core/declare ser-template-parameter-value)

(clojure.core/declare ser-repository-description)

(clojure.core/declare ser-project-id)

(clojure.core/declare ser-s-3-location)

(clojure.core/declare ser-bucket-key)

(clojure.core/declare ser-max-results)

(clojure.core/declare ser-project-name)

(clojure.core/declare ser-code)

(clojure.core/declare ser-bucket-name)

(clojure.core/declare ser-user-arn)

(clojure.core/declare ser-git-hub-code-destination)

(clojure.core/defn- ser-tag-keys [input] #:http.request.field{:value (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (clojure.core/merge (ser-tag-key coll) #:http.request.field{:shape "TagKey"}))) input), :shape "TagKeys", :type "list"})

(clojure.core/defn- ser-repository-owner [input] #:http.request.field{:value input, :shape "RepositoryOwner"})

(clojure.core/defn- ser-template-parameter-key [input] #:http.request.field{:value input, :shape "TemplateParameterKey"})

(clojure.core/defn- ser-repository-is-private [input] #:http.request.field{:value input, :shape "RepositoryIsPrivate"})

(clojure.core/defn- ser-remote-access-allowed [input] #:http.request.field{:value input, :shape "RemoteAccessAllowed"})

(clojure.core/defn- ser-client-request-token [input] #:http.request.field{:value input, :shape "ClientRequestToken"})

(clojure.core/defn- ser-toolchain-source [input] (clojure.core/cond-> #:http.request.field{:value [(clojure.core/into (ser-s-3-location (:s-3 input)) #:http.request.field{:name "s3", :shape "S3Location"})], :shape "ToolchainSource", :type "structure"}))

(clojure.core/defn- ser-delete-stack [input] #:http.request.field{:value input, :shape "DeleteStack"})

(clojure.core/defn- ser-email [input] #:http.request.field{:value input, :shape "Email"})

(clojure.core/defn- ser-repository-enable-issues [input] #:http.request.field{:value input, :shape "RepositoryEnableIssues"})

(clojure.core/defn- ser-code-destination [input] (clojure.core/cond-> #:http.request.field{:value [], :shape "CodeDestination", :type "structure"} (clojure.core/contains? input :code-commit) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-code-commit-code-destination (input :code-commit)) #:http.request.field{:name "codeCommit", :shape "CodeCommitCodeDestination"})) (clojure.core/contains? input :git-hub) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-git-hub-code-destination (input :git-hub)) #:http.request.field{:name "gitHub", :shape "GitHubCodeDestination"}))))

(clojure.core/defn- ser-source-code [input] #:http.request.field{:value (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (clojure.core/merge (ser-code coll) #:http.request.field{:shape "Code"}))) input), :shape "SourceCode", :type "list"})

(clojure.core/defn- ser-repository-name [input] #:http.request.field{:value input, :shape "RepositoryName"})

(clojure.core/defn- ser-code-commit-code-destination [input] (clojure.core/cond-> #:http.request.field{:value [(clojure.core/into (ser-repository-name (:name input)) #:http.request.field{:name "name", :shape "RepositoryName"})], :shape "CodeCommitCodeDestination", :type "structure"}))

(clojure.core/defn- ser-ssh-public-key [input] #:http.request.field{:value input, :shape "SshPublicKey"})

(clojure.core/defn- ser-user-profile-display-name [input] #:http.request.field{:value input, :shape "UserProfileDisplayName"})

(clojure.core/defn- ser-repository-type [input] #:http.request.field{:value input, :shape "RepositoryType"})

(clojure.core/defn- ser-role-arn [input] #:http.request.field{:value input, :shape "RoleArn"})

(clojure.core/defn- ser-tag-key [input] #:http.request.field{:value input, :shape "TagKey"})

(clojure.core/defn- ser-pagination-token [input] #:http.request.field{:value input, :shape "PaginationToken"})

(clojure.core/defn- ser-tags [input] #:http.request.field{:value (clojure.core/into [] (clojure.core/map (clojure.core/fn [[k v]] [(clojure.core/into (ser-tag-key k) #:http.request.field{:map-info "key", :shape "TagKey"}) (clojure.core/into (ser-tag-value v) #:http.request.field{:map-info "value", :shape "TagValue"})])) input), :shape "Tags", :type "map"})

(clojure.core/defn- ser-toolchain [input] (clojure.core/cond-> #:http.request.field{:value [(clojure.core/into (ser-toolchain-source (:source input)) #:http.request.field{:name "source", :shape "ToolchainSource"})], :shape "Toolchain", :type "structure"} (clojure.core/contains? input :role-arn) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-role-arn (input :role-arn)) #:http.request.field{:name "roleArn", :shape "RoleArn"})) (clojure.core/contains? input :stack-parameters) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-template-parameter-map (input :stack-parameters)) #:http.request.field{:name "stackParameters", :shape "TemplateParameterMap"}))))

(clojure.core/defn- ser-role [input] #:http.request.field{:value input, :shape "Role"})

(clojure.core/defn- ser-template-parameter-map [input] #:http.request.field{:value (clojure.core/into [] (clojure.core/map (clojure.core/fn [[k v]] [(clojure.core/into (ser-template-parameter-key k) #:http.request.field{:map-info "key", :shape "TemplateParameterKey"}) (clojure.core/into (ser-template-parameter-value v) #:http.request.field{:map-info "value", :shape "TemplateParameterValue"})])) input), :shape "TemplateParameterMap", :type "map", :max 25})

(clojure.core/defn- ser-code-source [input] (clojure.core/cond-> #:http.request.field{:value [(clojure.core/into (ser-s-3-location (:s-3 input)) #:http.request.field{:name "s3", :shape "S3Location"})], :shape "CodeSource", :type "structure"}))

(clojure.core/defn- ser-tag-value [input] #:http.request.field{:value input, :shape "TagValue"})

(clojure.core/defn- ser-git-hub-personal-token [input] #:http.request.field{:value input, :shape "GitHubPersonalToken"})

(clojure.core/defn- ser-project-description [input] #:http.request.field{:value input, :shape "ProjectDescription"})

(clojure.core/defn- ser-template-parameter-value [input] #:http.request.field{:value input, :shape "TemplateParameterValue"})

(clojure.core/defn- ser-repository-description [input] #:http.request.field{:value input, :shape "RepositoryDescription"})

(clojure.core/defn- ser-project-id [input] #:http.request.field{:value input, :shape "ProjectId"})

(clojure.core/defn- ser-s-3-location [input] (clojure.core/cond-> #:http.request.field{:value [], :shape "S3Location", :type "structure"} (clojure.core/contains? input :bucket-name) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-bucket-name (input :bucket-name)) #:http.request.field{:name "bucketName", :shape "BucketName"})) (clojure.core/contains? input :bucket-key) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-bucket-key (input :bucket-key)) #:http.request.field{:name "bucketKey", :shape "BucketKey"}))))

(clojure.core/defn- ser-bucket-key [input] #:http.request.field{:value input, :shape "BucketKey"})

(clojure.core/defn- ser-max-results [input] #:http.request.field{:value input, :shape "MaxResults"})

(clojure.core/defn- ser-project-name [input] #:http.request.field{:value input, :shape "ProjectName"})

(clojure.core/defn- ser-code [input] (clojure.core/cond-> #:http.request.field{:value [(clojure.core/into (ser-code-source (:source input)) #:http.request.field{:name "source", :shape "CodeSource"}) (clojure.core/into (ser-code-destination (:destination input)) #:http.request.field{:name "destination", :shape "CodeDestination"})], :shape "Code", :type "structure"}))

(clojure.core/defn- ser-bucket-name [input] #:http.request.field{:value input, :shape "BucketName"})

(clojure.core/defn- ser-user-arn [input] #:http.request.field{:value input, :shape "UserArn"})

(clojure.core/defn- ser-git-hub-code-destination [input] (clojure.core/cond-> #:http.request.field{:value [(clojure.core/into (ser-repository-name (:name input)) #:http.request.field{:name "name", :shape "RepositoryName"}) (clojure.core/into (ser-repository-type (:type input)) #:http.request.field{:name "type", :shape "RepositoryType"}) (clojure.core/into (ser-repository-owner (:owner input)) #:http.request.field{:name "owner", :shape "RepositoryOwner"}) (clojure.core/into (ser-repository-is-private (:private-repository input)) #:http.request.field{:name "privateRepository", :shape "RepositoryIsPrivate"}) (clojure.core/into (ser-repository-enable-issues (:issues-enabled input)) #:http.request.field{:name "issuesEnabled", :shape "RepositoryEnableIssues"}) (clojure.core/into (ser-git-hub-personal-token (:token input)) #:http.request.field{:name "token", :shape "GitHubPersonalToken"})], :shape "GitHubCodeDestination", :type "structure"} (clojure.core/contains? input :description) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-repository-description (input :description)) #:http.request.field{:name "description", :shape "RepositoryDescription"}))))

(clojure.core/defn- req-list-projects-request [input] (clojure.core/cond-> {} (clojure.core/contains? input :next-token) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-pagination-token (input :next-token)) #:http.request.field{:name "nextToken", :shape "PaginationToken"})) (clojure.core/contains? input :max-results) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-max-results (input :max-results)) #:http.request.field{:name "maxResults", :shape "MaxResults", :box true}))))

(clojure.core/defn- req-list-user-profiles-request [input] (clojure.core/cond-> {} (clojure.core/contains? input :next-token) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-pagination-token (input :next-token)) #:http.request.field{:name "nextToken", :shape "PaginationToken"})) (clojure.core/contains? input :max-results) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-max-results (input :max-results)) #:http.request.field{:name "maxResults", :shape "MaxResults", :box true}))))

(clojure.core/defn- req-list-tags-for-project-request [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (ser-project-id (input :id)) #:http.request.field{:name "id", :shape "ProjectId"})]} (clojure.core/contains? input :next-token) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-pagination-token (input :next-token)) #:http.request.field{:name "nextToken", :shape "PaginationToken"})) (clojure.core/contains? input :max-results) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-max-results (input :max-results)) #:http.request.field{:name "maxResults", :shape "MaxResults", :box true}))))

(clojure.core/defn- req-list-resources-request [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (ser-project-id (input :project-id)) #:http.request.field{:name "projectId", :shape "ProjectId"})]} (clojure.core/contains? input :next-token) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-pagination-token (input :next-token)) #:http.request.field{:name "nextToken", :shape "PaginationToken"})) (clojure.core/contains? input :max-results) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-max-results (input :max-results)) #:http.request.field{:name "maxResults", :shape "MaxResults", :box true}))))

(clojure.core/defn- req-list-team-members-request [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (ser-project-id (input :project-id)) #:http.request.field{:name "projectId", :shape "ProjectId"})]} (clojure.core/contains? input :next-token) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-pagination-token (input :next-token)) #:http.request.field{:name "nextToken", :shape "PaginationToken"})) (clojure.core/contains? input :max-results) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-max-results (input :max-results)) #:http.request.field{:name "maxResults", :shape "MaxResults", :box true}))))

(clojure.core/defn- req-describe-user-profile-request [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (ser-user-arn (input :user-arn)) #:http.request.field{:name "userArn", :shape "UserArn"})]}))

(clojure.core/defn- req-update-project-request [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (ser-project-id (input :id)) #:http.request.field{:name "id", :shape "ProjectId"})]} (clojure.core/contains? input :name) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-project-name (input :name)) #:http.request.field{:name "name", :shape "ProjectName"})) (clojure.core/contains? input :description) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-project-description (input :description)) #:http.request.field{:name "description", :shape "ProjectDescription"}))))

(clojure.core/defn- req-create-project-request [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (ser-project-name (input :name)) #:http.request.field{:name "name", :shape "ProjectName"}) (clojure.core/into (ser-project-id (input :id)) #:http.request.field{:name "id", :shape "ProjectId"})]} (clojure.core/contains? input :description) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-project-description (input :description)) #:http.request.field{:name "description", :shape "ProjectDescription"})) (clojure.core/contains? input :client-request-token) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-client-request-token (input :client-request-token)) #:http.request.field{:name "clientRequestToken", :shape "ClientRequestToken"})) (clojure.core/contains? input :source-code) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-source-code (input :source-code)) #:http.request.field{:name "sourceCode", :shape "SourceCode"})) (clojure.core/contains? input :toolchain) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-toolchain (input :toolchain)) #:http.request.field{:name "toolchain", :shape "Toolchain"})) (clojure.core/contains? input :tags) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-tags (input :tags)) #:http.request.field{:name "tags", :shape "Tags"}))))

(clojure.core/defn- req-describe-project-request [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (ser-project-id (input :id)) #:http.request.field{:name "id", :shape "ProjectId"})]}))

(clojure.core/defn- req-untag-project-request [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (ser-project-id (input :id)) #:http.request.field{:name "id", :shape "ProjectId"}) (clojure.core/into (ser-tag-keys (input :tags)) #:http.request.field{:name "tags", :shape "TagKeys"})]}))

(clojure.core/defn- req-delete-user-profile-request [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (ser-user-arn (input :user-arn)) #:http.request.field{:name "userArn", :shape "UserArn"})]}))

(clojure.core/defn- req-update-user-profile-request [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (ser-user-arn (input :user-arn)) #:http.request.field{:name "userArn", :shape "UserArn"})]} (clojure.core/contains? input :display-name) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-user-profile-display-name (input :display-name)) #:http.request.field{:name "displayName", :shape "UserProfileDisplayName"})) (clojure.core/contains? input :email-address) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-email (input :email-address)) #:http.request.field{:name "emailAddress", :shape "Email"})) (clojure.core/contains? input :ssh-public-key) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-ssh-public-key (input :ssh-public-key)) #:http.request.field{:name "sshPublicKey", :shape "SshPublicKey"}))))

(clojure.core/defn- req-associate-team-member-request [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (ser-project-id (input :project-id)) #:http.request.field{:name "projectId", :shape "ProjectId"}) (clojure.core/into (ser-user-arn (input :user-arn)) #:http.request.field{:name "userArn", :shape "UserArn"}) (clojure.core/into (ser-role (input :project-role)) #:http.request.field{:name "projectRole", :shape "Role"})]} (clojure.core/contains? input :client-request-token) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-client-request-token (input :client-request-token)) #:http.request.field{:name "clientRequestToken", :shape "ClientRequestToken"})) (clojure.core/contains? input :remote-access-allowed) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-remote-access-allowed (input :remote-access-allowed)) #:http.request.field{:name "remoteAccessAllowed", :shape "RemoteAccessAllowed", :box true}))))

(clojure.core/defn- req-create-user-profile-request [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (ser-user-arn (input :user-arn)) #:http.request.field{:name "userArn", :shape "UserArn"}) (clojure.core/into (ser-user-profile-display-name (input :display-name)) #:http.request.field{:name "displayName", :shape "UserProfileDisplayName"}) (clojure.core/into (ser-email (input :email-address)) #:http.request.field{:name "emailAddress", :shape "Email"})]} (clojure.core/contains? input :ssh-public-key) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-ssh-public-key (input :ssh-public-key)) #:http.request.field{:name "sshPublicKey", :shape "SshPublicKey"}))))

(clojure.core/defn- req-disassociate-team-member-request [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (ser-project-id (input :project-id)) #:http.request.field{:name "projectId", :shape "ProjectId"}) (clojure.core/into (ser-user-arn (input :user-arn)) #:http.request.field{:name "userArn", :shape "UserArn"})]}))

(clojure.core/defn- req-delete-project-request [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (ser-project-id (input :id)) #:http.request.field{:name "id", :shape "ProjectId"})]} (clojure.core/contains? input :client-request-token) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-client-request-token (input :client-request-token)) #:http.request.field{:name "clientRequestToken", :shape "ClientRequestToken"})) (clojure.core/contains? input :delete-stack) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-delete-stack (input :delete-stack)) #:http.request.field{:name "deleteStack", :shape "DeleteStack"}))))

(clojure.core/defn- req-tag-project-request [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (ser-project-id (input :id)) #:http.request.field{:name "id", :shape "ProjectId"}) (clojure.core/into (ser-tags (input :tags)) #:http.request.field{:name "tags", :shape "Tags"})]}))

(clojure.core/defn- req-update-team-member-request [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (ser-project-id (input :project-id)) #:http.request.field{:name "projectId", :shape "ProjectId"}) (clojure.core/into (ser-user-arn (input :user-arn)) #:http.request.field{:name "userArn", :shape "UserArn"})]} (clojure.core/contains? input :project-role) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-role (input :project-role)) #:http.request.field{:name "projectRole", :shape "Role"})) (clojure.core/contains? input :remote-access-allowed) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-remote-access-allowed (input :remote-access-allowed)) #:http.request.field{:name "remoteAccessAllowed", :shape "RemoteAccessAllowed", :box true}))))

(clojure.core/declare deser-user-profile-summary)

(clojure.core/declare deser-remote-access-allowed)

(clojure.core/declare deser-created-timestamp)

(clojure.core/declare deser-client-request-token)

(clojure.core/declare deser-project-template-id)

(clojure.core/declare deser-email)

(clojure.core/declare deser-ssh-public-key)

(clojure.core/declare deser-user-profile-display-name)

(clojure.core/declare deser-tag-key)

(clojure.core/declare deser-pagination-token)

(clojure.core/declare deser-tags)

(clojure.core/declare deser-user-profiles-list)

(clojure.core/declare deser-project-arn)

(clojure.core/declare deser-resource-id)

(clojure.core/declare deser-role)

(clojure.core/declare deser-project-status)

(clojure.core/declare deser-last-modified-timestamp)

(clojure.core/declare deser-tag-value)

(clojure.core/declare deser-stack-id)

(clojure.core/declare deser-project-description)

(clojure.core/declare deser-project-id)

(clojure.core/declare deser-team-member-result)

(clojure.core/declare deser-project-summary)

(clojure.core/declare deser-state)

(clojure.core/declare deser-resource)

(clojure.core/declare deser-reason)

(clojure.core/declare deser-project-name)

(clojure.core/declare deser-projects-list)

(clojure.core/declare deser-resources-result)

(clojure.core/declare deser-user-arn)

(clojure.core/declare deser-team-member)

(clojure.core/defn- deser-user-profile-summary [input] (clojure.core/cond-> {} (clojure.core/contains? input "userArn") (clojure.core/assoc :user-arn (deser-user-arn (input "userArn"))) (clojure.core/contains? input "displayName") (clojure.core/assoc :display-name (deser-user-profile-display-name (input "displayName"))) (clojure.core/contains? input "emailAddress") (clojure.core/assoc :email-address (deser-email (input "emailAddress"))) (clojure.core/contains? input "sshPublicKey") (clojure.core/assoc :ssh-public-key (deser-ssh-public-key (input "sshPublicKey")))))

(clojure.core/defn- deser-remote-access-allowed [input] input)

(clojure.core/defn- deser-created-timestamp [input] input)

(clojure.core/defn- deser-client-request-token [input] input)

(clojure.core/defn- deser-project-template-id [input] input)

(clojure.core/defn- deser-email [input] input)

(clojure.core/defn- deser-ssh-public-key [input] input)

(clojure.core/defn- deser-user-profile-display-name [input] input)

(clojure.core/defn- deser-tag-key [input] input)

(clojure.core/defn- deser-pagination-token [input] input)

(clojure.core/defn- deser-tags [input] (clojure.core/into {} (clojure.core/map (clojure.core/fn [[k v]] [(deser-tag-key k) (deser-tag-value v)])) input))

(clojure.core/defn- deser-user-profiles-list [input] (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (deser-user-profile-summary coll))) input))

(clojure.core/defn- deser-project-arn [input] input)

(clojure.core/defn- deser-resource-id [input] input)

(clojure.core/defn- deser-role [input] input)

(clojure.core/defn- deser-project-status [input] (clojure.core/cond-> {:state (deser-state (input "state"))} (clojure.core/contains? input "reason") (clojure.core/assoc :reason (deser-reason (input "reason")))))

(clojure.core/defn- deser-last-modified-timestamp [input] input)

(clojure.core/defn- deser-tag-value [input] input)

(clojure.core/defn- deser-stack-id [input] input)

(clojure.core/defn- deser-project-description [input] input)

(clojure.core/defn- deser-project-id [input] input)

(clojure.core/defn- deser-team-member-result [input] (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (deser-team-member coll))) input))

(clojure.core/defn- deser-project-summary [input] (clojure.core/cond-> {} (clojure.core/contains? input "projectId") (clojure.core/assoc :project-id (deser-project-id (input "projectId"))) (clojure.core/contains? input "projectArn") (clojure.core/assoc :project-arn (deser-project-arn (input "projectArn")))))

(clojure.core/defn- deser-state [input] input)

(clojure.core/defn- deser-resource [input] (clojure.core/cond-> {:id (deser-resource-id (input "id"))}))

(clojure.core/defn- deser-reason [input] input)

(clojure.core/defn- deser-project-name [input] input)

(clojure.core/defn- deser-projects-list [input] (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (deser-project-summary coll))) input))

(clojure.core/defn- deser-resources-result [input] (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (deser-resource coll))) input))

(clojure.core/defn- deser-user-arn [input] input)

(clojure.core/defn- deser-team-member [input] (clojure.core/cond-> {:user-arn (deser-user-arn (input "userArn")), :project-role (deser-role (input "projectRole"))} (clojure.core/contains? input "remoteAccessAllowed") (clojure.core/assoc :remote-access-allowed (deser-remote-access-allowed (input "remoteAccessAllowed")))))

(clojure.core/defn- response-describe-project-result ([input] (response-describe-project-result nil input)) ([resultWrapper1542620 input] (clojure.core/let [rawinput1542619 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar1542621 {"stackId" (rawinput1542619 "stackId"), "arn" (rawinput1542619 "arn"), "projectTemplateId" (rawinput1542619 "projectTemplateId"), "createdTimeStamp" (rawinput1542619 "createdTimeStamp"), "id" (rawinput1542619 "id"), "clientRequestToken" (rawinput1542619 "clientRequestToken"), "name" (rawinput1542619 "name"), "status" (rawinput1542619 "status"), "description" (rawinput1542619 "description")}] (clojure.core/cond-> {} (letvar1542621 "stackId") (clojure.core/assoc :stack-id (deser-stack-id (clojure.core/get-in letvar1542621 ["stackId"]))) (letvar1542621 "arn") (clojure.core/assoc :arn (deser-project-arn (clojure.core/get-in letvar1542621 ["arn"]))) (letvar1542621 "projectTemplateId") (clojure.core/assoc :project-template-id (deser-project-template-id (clojure.core/get-in letvar1542621 ["projectTemplateId"]))) (letvar1542621 "createdTimeStamp") (clojure.core/assoc :created-time-stamp (deser-created-timestamp (clojure.core/get-in letvar1542621 ["createdTimeStamp"]))) (letvar1542621 "id") (clojure.core/assoc :id (deser-project-id (clojure.core/get-in letvar1542621 ["id"]))) (letvar1542621 "clientRequestToken") (clojure.core/assoc :client-request-token (deser-client-request-token (clojure.core/get-in letvar1542621 ["clientRequestToken"]))) (letvar1542621 "name") (clojure.core/assoc :name (deser-project-name (clojure.core/get-in letvar1542621 ["name"]))) (letvar1542621 "status") (clojure.core/assoc :status (deser-project-status (clojure.core/get-in letvar1542621 ["status"]))) (letvar1542621 "description") (clojure.core/assoc :description (deser-project-description (clojure.core/get-in letvar1542621 ["description"])))))))

(clojure.core/defn- response-list-projects-result ([input] (response-list-projects-result nil input)) ([resultWrapper1542623 input] (clojure.core/let [rawinput1542622 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar1542624 {"projects" (rawinput1542622 "projects"), "nextToken" (rawinput1542622 "nextToken")}] (clojure.core/cond-> {:projects (deser-projects-list (clojure.core/get-in letvar1542624 ["projects"]))} (letvar1542624 "nextToken") (clojure.core/assoc :next-token (deser-pagination-token (clojure.core/get-in letvar1542624 ["nextToken"])))))))

(clojure.core/defn- response-update-project-result ([input] (response-update-project-result nil input)) ([resultWrapper1542626 input] (clojure.core/let [rawinput1542625 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar1542627 {}] (clojure.core/cond-> {}))))

(clojure.core/defn- response-validation-exception ([input] (response-validation-exception nil input)) ([resultWrapper1542629 input] (clojure.core/let [rawinput1542628 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar1542630 {}] (clojure.core/cond-> {}))))

(clojure.core/defn- response-project-creation-failed-exception ([input] (response-project-creation-failed-exception nil input)) ([resultWrapper1542632 input] (clojure.core/let [rawinput1542631 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar1542633 {}] (clojure.core/cond-> {}))))

(clojure.core/defn- response-team-member-already-associated-exception ([input] (response-team-member-already-associated-exception nil input)) ([resultWrapper1542635 input] (clojure.core/let [rawinput1542634 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar1542636 {}] (clojure.core/cond-> {}))))

(clojure.core/defn- response-list-user-profiles-result ([input] (response-list-user-profiles-result nil input)) ([resultWrapper1542638 input] (clojure.core/let [rawinput1542637 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar1542639 {"userProfiles" (rawinput1542637 "userProfiles"), "nextToken" (rawinput1542637 "nextToken")}] (clojure.core/cond-> {:user-profiles (deser-user-profiles-list (clojure.core/get-in letvar1542639 ["userProfiles"]))} (letvar1542639 "nextToken") (clojure.core/assoc :next-token (deser-pagination-token (clojure.core/get-in letvar1542639 ["nextToken"])))))))

(clojure.core/defn- response-user-profile-not-found-exception ([input] (response-user-profile-not-found-exception nil input)) ([resultWrapper1542641 input] (clojure.core/let [rawinput1542640 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar1542642 {}] (clojure.core/cond-> {}))))

(clojure.core/defn- response-limit-exceeded-exception ([input] (response-limit-exceeded-exception nil input)) ([resultWrapper1542644 input] (clojure.core/let [rawinput1542643 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar1542645 {}] (clojure.core/cond-> {}))))

(clojure.core/defn- response-invalid-service-role-exception ([input] (response-invalid-service-role-exception nil input)) ([resultWrapper1542647 input] (clojure.core/let [rawinput1542646 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar1542648 {}] (clojure.core/cond-> {}))))

(clojure.core/defn- response-disassociate-team-member-result ([input] (response-disassociate-team-member-result nil input)) ([resultWrapper1542650 input] (clojure.core/let [rawinput1542649 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar1542651 {}] (clojure.core/cond-> {}))))

(clojure.core/defn- response-invalid-next-token-exception ([input] (response-invalid-next-token-exception nil input)) ([resultWrapper1542653 input] (clojure.core/let [rawinput1542652 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar1542654 {}] (clojure.core/cond-> {}))))

(clojure.core/defn- response-tag-project-result ([input] (response-tag-project-result nil input)) ([resultWrapper1542656 input] (clojure.core/let [rawinput1542655 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar1542657 {"tags" (rawinput1542655 "tags")}] (clojure.core/cond-> {} (letvar1542657 "tags") (clojure.core/assoc :tags (deser-tags (clojure.core/get-in letvar1542657 ["tags"])))))))

(clojure.core/defn- response-untag-project-result ([input] (response-untag-project-result nil input)) ([resultWrapper1542659 input] (clojure.core/let [rawinput1542658 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar1542660 {}] (clojure.core/cond-> {}))))

(clojure.core/defn- response-create-project-result ([input] (response-create-project-result nil input)) ([resultWrapper1542662 input] (clojure.core/let [rawinput1542661 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar1542663 {"id" (rawinput1542661 "id"), "arn" (rawinput1542661 "arn"), "clientRequestToken" (rawinput1542661 "clientRequestToken"), "projectTemplateId" (rawinput1542661 "projectTemplateId")}] (clojure.core/cond-> {:id (deser-project-id (clojure.core/get-in letvar1542663 ["id"])), :arn (deser-project-arn (clojure.core/get-in letvar1542663 ["arn"]))} (letvar1542663 "clientRequestToken") (clojure.core/assoc :client-request-token (deser-client-request-token (clojure.core/get-in letvar1542663 ["clientRequestToken"]))) (letvar1542663 "projectTemplateId") (clojure.core/assoc :project-template-id (deser-project-template-id (clojure.core/get-in letvar1542663 ["projectTemplateId"])))))))

(clojure.core/defn- response-user-profile-already-exists-exception ([input] (response-user-profile-already-exists-exception nil input)) ([resultWrapper1542665 input] (clojure.core/let [rawinput1542664 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar1542666 {}] (clojure.core/cond-> {}))))

(clojure.core/defn- response-list-resources-result ([input] (response-list-resources-result nil input)) ([resultWrapper1542668 input] (clojure.core/let [rawinput1542667 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar1542669 {"resources" (rawinput1542667 "resources"), "nextToken" (rawinput1542667 "nextToken")}] (clojure.core/cond-> {} (letvar1542669 "resources") (clojure.core/assoc :resources (deser-resources-result (clojure.core/get-in letvar1542669 ["resources"]))) (letvar1542669 "nextToken") (clojure.core/assoc :next-token (deser-pagination-token (clojure.core/get-in letvar1542669 ["nextToken"])))))))

(clojure.core/defn- response-project-already-exists-exception ([input] (response-project-already-exists-exception nil input)) ([resultWrapper1542671 input] (clojure.core/let [rawinput1542670 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar1542672 {}] (clojure.core/cond-> {}))))

(clojure.core/defn- response-team-member-not-found-exception ([input] (response-team-member-not-found-exception nil input)) ([resultWrapper1542674 input] (clojure.core/let [rawinput1542673 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar1542675 {}] (clojure.core/cond-> {}))))

(clojure.core/defn- response-describe-user-profile-result ([input] (response-describe-user-profile-result nil input)) ([resultWrapper1542677 input] (clojure.core/let [rawinput1542676 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar1542678 {"userArn" (rawinput1542676 "userArn"), "displayName" (rawinput1542676 "displayName"), "emailAddress" (rawinput1542676 "emailAddress"), "sshPublicKey" (rawinput1542676 "sshPublicKey"), "createdTimestamp" (rawinput1542676 "createdTimestamp"), "lastModifiedTimestamp" (rawinput1542676 "lastModifiedTimestamp")}] (clojure.core/cond-> {:user-arn (deser-user-arn (clojure.core/get-in letvar1542678 ["userArn"])), :created-timestamp (deser-created-timestamp (clojure.core/get-in letvar1542678 ["createdTimestamp"])), :last-modified-timestamp (deser-last-modified-timestamp (clojure.core/get-in letvar1542678 ["lastModifiedTimestamp"]))} (letvar1542678 "displayName") (clojure.core/assoc :display-name (deser-user-profile-display-name (clojure.core/get-in letvar1542678 ["displayName"]))) (letvar1542678 "emailAddress") (clojure.core/assoc :email-address (deser-email (clojure.core/get-in letvar1542678 ["emailAddress"]))) (letvar1542678 "sshPublicKey") (clojure.core/assoc :ssh-public-key (deser-ssh-public-key (clojure.core/get-in letvar1542678 ["sshPublicKey"])))))))

(clojure.core/defn- response-delete-project-result ([input] (response-delete-project-result nil input)) ([resultWrapper1542680 input] (clojure.core/let [rawinput1542679 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar1542681 {"stackId" (rawinput1542679 "stackId"), "projectArn" (rawinput1542679 "projectArn")}] (clojure.core/cond-> {} (letvar1542681 "stackId") (clojure.core/assoc :stack-id (deser-stack-id (clojure.core/get-in letvar1542681 ["stackId"]))) (letvar1542681 "projectArn") (clojure.core/assoc :project-arn (deser-project-arn (clojure.core/get-in letvar1542681 ["projectArn"])))))))

(clojure.core/defn- response-associate-team-member-result ([input] (response-associate-team-member-result nil input)) ([resultWrapper1542683 input] (clojure.core/let [rawinput1542682 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar1542684 {"clientRequestToken" (rawinput1542682 "clientRequestToken")}] (clojure.core/cond-> {} (letvar1542684 "clientRequestToken") (clojure.core/assoc :client-request-token (deser-client-request-token (clojure.core/get-in letvar1542684 ["clientRequestToken"])))))))

(clojure.core/defn- response-update-team-member-result ([input] (response-update-team-member-result nil input)) ([resultWrapper1542686 input] (clojure.core/let [rawinput1542685 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar1542687 {"userArn" (rawinput1542685 "userArn"), "projectRole" (rawinput1542685 "projectRole"), "remoteAccessAllowed" (rawinput1542685 "remoteAccessAllowed")}] (clojure.core/cond-> {} (letvar1542687 "userArn") (clojure.core/assoc :user-arn (deser-user-arn (clojure.core/get-in letvar1542687 ["userArn"]))) (letvar1542687 "projectRole") (clojure.core/assoc :project-role (deser-role (clojure.core/get-in letvar1542687 ["projectRole"]))) (letvar1542687 "remoteAccessAllowed") (clojure.core/assoc :remote-access-allowed (deser-remote-access-allowed (clojure.core/get-in letvar1542687 ["remoteAccessAllowed"])))))))

(clojure.core/defn- response-create-user-profile-result ([input] (response-create-user-profile-result nil input)) ([resultWrapper1542689 input] (clojure.core/let [rawinput1542688 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar1542690 {"userArn" (rawinput1542688 "userArn"), "displayName" (rawinput1542688 "displayName"), "emailAddress" (rawinput1542688 "emailAddress"), "sshPublicKey" (rawinput1542688 "sshPublicKey"), "createdTimestamp" (rawinput1542688 "createdTimestamp"), "lastModifiedTimestamp" (rawinput1542688 "lastModifiedTimestamp")}] (clojure.core/cond-> {:user-arn (deser-user-arn (clojure.core/get-in letvar1542690 ["userArn"]))} (letvar1542690 "displayName") (clojure.core/assoc :display-name (deser-user-profile-display-name (clojure.core/get-in letvar1542690 ["displayName"]))) (letvar1542690 "emailAddress") (clojure.core/assoc :email-address (deser-email (clojure.core/get-in letvar1542690 ["emailAddress"]))) (letvar1542690 "sshPublicKey") (clojure.core/assoc :ssh-public-key (deser-ssh-public-key (clojure.core/get-in letvar1542690 ["sshPublicKey"]))) (letvar1542690 "createdTimestamp") (clojure.core/assoc :created-timestamp (deser-created-timestamp (clojure.core/get-in letvar1542690 ["createdTimestamp"]))) (letvar1542690 "lastModifiedTimestamp") (clojure.core/assoc :last-modified-timestamp (deser-last-modified-timestamp (clojure.core/get-in letvar1542690 ["lastModifiedTimestamp"])))))))

(clojure.core/defn- response-list-tags-for-project-result ([input] (response-list-tags-for-project-result nil input)) ([resultWrapper1542692 input] (clojure.core/let [rawinput1542691 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar1542693 {"tags" (rawinput1542691 "tags"), "nextToken" (rawinput1542691 "nextToken")}] (clojure.core/cond-> {} (letvar1542693 "tags") (clojure.core/assoc :tags (deser-tags (clojure.core/get-in letvar1542693 ["tags"]))) (letvar1542693 "nextToken") (clojure.core/assoc :next-token (deser-pagination-token (clojure.core/get-in letvar1542693 ["nextToken"])))))))

(clojure.core/defn- response-list-team-members-result ([input] (response-list-team-members-result nil input)) ([resultWrapper1542695 input] (clojure.core/let [rawinput1542694 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar1542696 {"teamMembers" (rawinput1542694 "teamMembers"), "nextToken" (rawinput1542694 "nextToken")}] (clojure.core/cond-> {:team-members (deser-team-member-result (clojure.core/get-in letvar1542696 ["teamMembers"]))} (letvar1542696 "nextToken") (clojure.core/assoc :next-token (deser-pagination-token (clojure.core/get-in letvar1542696 ["nextToken"])))))))

(clojure.core/defn- response-project-not-found-exception ([input] (response-project-not-found-exception nil input)) ([resultWrapper1542698 input] (clojure.core/let [rawinput1542697 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar1542699 {}] (clojure.core/cond-> {}))))

(clojure.core/defn- response-concurrent-modification-exception ([input] (response-concurrent-modification-exception nil input)) ([resultWrapper1542701 input] (clojure.core/let [rawinput1542700 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar1542702 {}] (clojure.core/cond-> {}))))

(clojure.core/defn- response-project-configuration-exception ([input] (response-project-configuration-exception nil input)) ([resultWrapper1542704 input] (clojure.core/let [rawinput1542703 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar1542705 {}] (clojure.core/cond-> {}))))

(clojure.core/defn- response-delete-user-profile-result ([input] (response-delete-user-profile-result nil input)) ([resultWrapper1542707 input] (clojure.core/let [rawinput1542706 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar1542708 {"userArn" (rawinput1542706 "userArn")}] (clojure.core/cond-> {:user-arn (deser-user-arn (clojure.core/get-in letvar1542708 ["userArn"]))}))))

(clojure.core/defn- response-update-user-profile-result ([input] (response-update-user-profile-result nil input)) ([resultWrapper1542710 input] (clojure.core/let [rawinput1542709 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar1542711 {"userArn" (rawinput1542709 "userArn"), "displayName" (rawinput1542709 "displayName"), "emailAddress" (rawinput1542709 "emailAddress"), "sshPublicKey" (rawinput1542709 "sshPublicKey"), "createdTimestamp" (rawinput1542709 "createdTimestamp"), "lastModifiedTimestamp" (rawinput1542709 "lastModifiedTimestamp")}] (clojure.core/cond-> {:user-arn (deser-user-arn (clojure.core/get-in letvar1542711 ["userArn"]))} (letvar1542711 "displayName") (clojure.core/assoc :display-name (deser-user-profile-display-name (clojure.core/get-in letvar1542711 ["displayName"]))) (letvar1542711 "emailAddress") (clojure.core/assoc :email-address (deser-email (clojure.core/get-in letvar1542711 ["emailAddress"]))) (letvar1542711 "sshPublicKey") (clojure.core/assoc :ssh-public-key (deser-ssh-public-key (clojure.core/get-in letvar1542711 ["sshPublicKey"]))) (letvar1542711 "createdTimestamp") (clojure.core/assoc :created-timestamp (deser-created-timestamp (clojure.core/get-in letvar1542711 ["createdTimestamp"]))) (letvar1542711 "lastModifiedTimestamp") (clojure.core/assoc :last-modified-timestamp (deser-last-modified-timestamp (clojure.core/get-in letvar1542711 ["lastModifiedTimestamp"])))))))

(clojure.spec.alpha/def :portkey.aws.codestar/tag-keys (clojure.spec.alpha/coll-of :portkey.aws.codestar/tag-key))

(clojure.spec.alpha/def :portkey.aws.codestar.user-profile-summary/user-arn (clojure.spec.alpha/and :portkey.aws.codestar/user-arn))
(clojure.spec.alpha/def :portkey.aws.codestar.user-profile-summary/display-name (clojure.spec.alpha/and :portkey.aws.codestar/user-profile-display-name))
(clojure.spec.alpha/def :portkey.aws.codestar.user-profile-summary/email-address (clojure.spec.alpha/and :portkey.aws.codestar/email))
(clojure.spec.alpha/def :portkey.aws.codestar.user-profile-summary/ssh-public-key (clojure.spec.alpha/and :portkey.aws.codestar/ssh-public-key))
(clojure.spec.alpha/def :portkey.aws.codestar/user-profile-summary (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.codestar.user-profile-summary/user-arn :portkey.aws.codestar.user-profile-summary/display-name :portkey.aws.codestar.user-profile-summary/email-address :portkey.aws.codestar.user-profile-summary/ssh-public-key]))

(clojure.spec.alpha/def :portkey.aws.codestar/repository-owner (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__1410938__auto__] (clojure.core/<= 1 (clojure.core/count s__1410938__auto__))) (clojure.core/fn [s__1410939__auto__] (clojure.core/< (clojure.core/count s__1410939__auto__) 100)) (clojure.core/fn [s__1410940__auto__] (clojure.core/re-matches #"^\S(.*\S)?$" s__1410940__auto__))))

(clojure.spec.alpha/def :portkey.aws.codestar.describe-project-result/stack-id (clojure.spec.alpha/and :portkey.aws.codestar/stack-id))
(clojure.spec.alpha/def :portkey.aws.codestar.describe-project-result/arn (clojure.spec.alpha/and :portkey.aws.codestar/project-arn))
(clojure.spec.alpha/def :portkey.aws.codestar.describe-project-result/project-template-id (clojure.spec.alpha/and :portkey.aws.codestar/project-template-id))
(clojure.spec.alpha/def :portkey.aws.codestar.describe-project-result/created-time-stamp (clojure.spec.alpha/and :portkey.aws.codestar/created-timestamp))
(clojure.spec.alpha/def :portkey.aws.codestar.describe-project-result/id (clojure.spec.alpha/and :portkey.aws.codestar/project-id))
(clojure.spec.alpha/def :portkey.aws.codestar.describe-project-result/client-request-token (clojure.spec.alpha/and :portkey.aws.codestar/client-request-token))
(clojure.spec.alpha/def :portkey.aws.codestar.describe-project-result/name (clojure.spec.alpha/and :portkey.aws.codestar/project-name))
(clojure.spec.alpha/def :portkey.aws.codestar.describe-project-result/status (clojure.spec.alpha/and :portkey.aws.codestar/project-status))
(clojure.spec.alpha/def :portkey.aws.codestar.describe-project-result/description (clojure.spec.alpha/and :portkey.aws.codestar/project-description))
(clojure.spec.alpha/def :portkey.aws.codestar/describe-project-result (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.codestar.describe-project-result/stack-id :portkey.aws.codestar.describe-project-result/arn :portkey.aws.codestar.describe-project-result/project-template-id :portkey.aws.codestar.describe-project-result/created-time-stamp :portkey.aws.codestar.describe-project-result/id :portkey.aws.codestar.describe-project-result/client-request-token :portkey.aws.codestar.describe-project-result/name :portkey.aws.codestar.describe-project-result/status :portkey.aws.codestar.describe-project-result/description]))

(clojure.spec.alpha/def :portkey.aws.codestar.list-projects-request/next-token (clojure.spec.alpha/and :portkey.aws.codestar/pagination-token))
(clojure.spec.alpha/def :portkey.aws.codestar.list-projects-request/max-results (clojure.spec.alpha/and :portkey.aws.codestar/max-results))
(clojure.spec.alpha/def :portkey.aws.codestar/list-projects-request (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.codestar.list-projects-request/next-token :portkey.aws.codestar.list-projects-request/max-results]))

(clojure.spec.alpha/def :portkey.aws.codestar/template-parameter-key (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__1410938__auto__] (clojure.core/<= 1 (clojure.core/count s__1410938__auto__))) (clojure.core/fn [s__1410939__auto__] (clojure.core/< (clojure.core/count s__1410939__auto__) 30)) (clojure.core/fn [s__1410940__auto__] (clojure.core/re-matches #"^\S(.*\S)?$" s__1410940__auto__))))

(clojure.spec.alpha/def :portkey.aws.codestar/repository-is-private clojure.core/boolean?)

(clojure.spec.alpha/def :portkey.aws.codestar.list-projects-result/projects (clojure.spec.alpha/and :portkey.aws.codestar/projects-list))
(clojure.spec.alpha/def :portkey.aws.codestar.list-projects-result/next-token (clojure.spec.alpha/and :portkey.aws.codestar/pagination-token))
(clojure.spec.alpha/def :portkey.aws.codestar/list-projects-result (clojure.spec.alpha/keys :req-un [:portkey.aws.codestar.list-projects-result/projects] :opt-un [:portkey.aws.codestar.list-projects-result/next-token]))

(clojure.spec.alpha/def :portkey.aws.codestar/update-project-result (clojure.spec.alpha/keys :req-un [] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.codestar.list-user-profiles-request/next-token (clojure.spec.alpha/and :portkey.aws.codestar/pagination-token))
(clojure.spec.alpha/def :portkey.aws.codestar.list-user-profiles-request/max-results (clojure.spec.alpha/and :portkey.aws.codestar/max-results))
(clojure.spec.alpha/def :portkey.aws.codestar/list-user-profiles-request (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.codestar.list-user-profiles-request/next-token :portkey.aws.codestar.list-user-profiles-request/max-results]))

(clojure.spec.alpha/def :portkey.aws.codestar.list-tags-for-project-request/id (clojure.spec.alpha/and :portkey.aws.codestar/project-id))
(clojure.spec.alpha/def :portkey.aws.codestar.list-tags-for-project-request/next-token (clojure.spec.alpha/and :portkey.aws.codestar/pagination-token))
(clojure.spec.alpha/def :portkey.aws.codestar.list-tags-for-project-request/max-results (clojure.spec.alpha/and :portkey.aws.codestar/max-results))
(clojure.spec.alpha/def :portkey.aws.codestar/list-tags-for-project-request (clojure.spec.alpha/keys :req-un [:portkey.aws.codestar.list-tags-for-project-request/id] :opt-un [:portkey.aws.codestar.list-tags-for-project-request/next-token :portkey.aws.codestar.list-tags-for-project-request/max-results]))

(clojure.spec.alpha/def :portkey.aws.codestar/remote-access-allowed clojure.core/boolean?)

(clojure.spec.alpha/def :portkey.aws.codestar/created-timestamp clojure.core/inst?)

(clojure.spec.alpha/def :portkey.aws.codestar/client-request-token (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__1410938__auto__] (clojure.core/<= 1 (clojure.core/count s__1410938__auto__))) (clojure.core/fn [s__1410939__auto__] (clojure.core/< (clojure.core/count s__1410939__auto__) 256)) (clojure.core/fn [s__1410940__auto__] (clojure.core/re-matches #"^[\w:/-]+$" s__1410940__auto__))))

(clojure.spec.alpha/def :portkey.aws.codestar.toolchain-source/s-3 (clojure.spec.alpha/and :portkey.aws.codestar/s-3-location))
(clojure.spec.alpha/def :portkey.aws.codestar/toolchain-source (clojure.spec.alpha/keys :req-un [:portkey.aws.codestar.toolchain-source/s-3] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.codestar.list-resources-request/project-id (clojure.spec.alpha/and :portkey.aws.codestar/project-id))
(clojure.spec.alpha/def :portkey.aws.codestar.list-resources-request/next-token (clojure.spec.alpha/and :portkey.aws.codestar/pagination-token))
(clojure.spec.alpha/def :portkey.aws.codestar.list-resources-request/max-results (clojure.spec.alpha/and :portkey.aws.codestar/max-results))
(clojure.spec.alpha/def :portkey.aws.codestar/list-resources-request (clojure.spec.alpha/keys :req-un [:portkey.aws.codestar.list-resources-request/project-id] :opt-un [:portkey.aws.codestar.list-resources-request/next-token :portkey.aws.codestar.list-resources-request/max-results]))

(clojure.spec.alpha/def :portkey.aws.codestar/delete-stack clojure.core/boolean?)

(clojure.spec.alpha/def :portkey.aws.codestar/project-template-id (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__1410938__auto__] (clojure.core/<= 1 (clojure.core/count s__1410938__auto__))) (clojure.core/fn [s__1410940__auto__] (clojure.core/re-matches #"^arn:aws[^:\s]{0,5}:codestar:[^:\s]+::project-template(\/(github|codecommit))?\/[a-z0-9-]+$" s__1410940__auto__))))

(clojure.spec.alpha/def :portkey.aws.codestar/email (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__1410938__auto__] (clojure.core/<= 3 (clojure.core/count s__1410938__auto__))) (clojure.core/fn [s__1410939__auto__] (clojure.core/< (clojure.core/count s__1410939__auto__) 128)) (clojure.core/fn [s__1410940__auto__] (clojure.core/re-matches #"^[\w-.+]+@[\w-.+]+$" s__1410940__auto__))))

(clojure.spec.alpha/def :portkey.aws.codestar/validation-exception (clojure.spec.alpha/keys :req-un [] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.codestar.list-team-members-request/project-id (clojure.spec.alpha/and :portkey.aws.codestar/project-id))
(clojure.spec.alpha/def :portkey.aws.codestar.list-team-members-request/next-token (clojure.spec.alpha/and :portkey.aws.codestar/pagination-token))
(clojure.spec.alpha/def :portkey.aws.codestar.list-team-members-request/max-results (clojure.spec.alpha/and :portkey.aws.codestar/max-results))
(clojure.spec.alpha/def :portkey.aws.codestar/list-team-members-request (clojure.spec.alpha/keys :req-un [:portkey.aws.codestar.list-team-members-request/project-id] :opt-un [:portkey.aws.codestar.list-team-members-request/next-token :portkey.aws.codestar.list-team-members-request/max-results]))

(clojure.spec.alpha/def :portkey.aws.codestar/repository-enable-issues clojure.core/boolean?)

(clojure.spec.alpha/def :portkey.aws.codestar/project-creation-failed-exception (clojure.spec.alpha/keys :req-un [] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.codestar.code-destination/code-commit (clojure.spec.alpha/and :portkey.aws.codestar/code-commit-code-destination))
(clojure.spec.alpha/def :portkey.aws.codestar.code-destination/git-hub (clojure.spec.alpha/and :portkey.aws.codestar/git-hub-code-destination))
(clojure.spec.alpha/def :portkey.aws.codestar/code-destination (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.codestar.code-destination/code-commit :portkey.aws.codestar.code-destination/git-hub]))

(clojure.spec.alpha/def :portkey.aws.codestar/source-code (clojure.spec.alpha/coll-of :portkey.aws.codestar/code))

(clojure.spec.alpha/def :portkey.aws.codestar/repository-name (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__1410938__auto__] (clojure.core/<= 1 (clojure.core/count s__1410938__auto__))) (clojure.core/fn [s__1410939__auto__] (clojure.core/< (clojure.core/count s__1410939__auto__) 100)) (clojure.core/fn [s__1410940__auto__] (clojure.core/re-matches #"^\S[\w.-]*$" s__1410940__auto__))))

(clojure.spec.alpha/def :portkey.aws.codestar/team-member-already-associated-exception (clojure.spec.alpha/keys :req-un [] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.codestar.code-commit-code-destination/name (clojure.spec.alpha/and :portkey.aws.codestar/repository-name))
(clojure.spec.alpha/def :portkey.aws.codestar/code-commit-code-destination (clojure.spec.alpha/keys :req-un [:portkey.aws.codestar.code-commit-code-destination/name] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.codestar/ssh-public-key (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__1410939__auto__] (clojure.core/< (clojure.core/count s__1410939__auto__) 16384)) (clojure.core/fn [s__1410940__auto__] (clojure.core/re-matches #"^[\t\r\n\u0020-\u00FF]*$" s__1410940__auto__))))

(clojure.spec.alpha/def :portkey.aws.codestar.list-user-profiles-result/user-profiles (clojure.spec.alpha/and :portkey.aws.codestar/user-profiles-list))
(clojure.spec.alpha/def :portkey.aws.codestar.list-user-profiles-result/next-token (clojure.spec.alpha/and :portkey.aws.codestar/pagination-token))
(clojure.spec.alpha/def :portkey.aws.codestar/list-user-profiles-result (clojure.spec.alpha/keys :req-un [:portkey.aws.codestar.list-user-profiles-result/user-profiles] :opt-un [:portkey.aws.codestar.list-user-profiles-result/next-token]))

(clojure.spec.alpha/def :portkey.aws.codestar/user-profile-not-found-exception (clojure.spec.alpha/keys :req-un [] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.codestar/user-profile-display-name (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__1410938__auto__] (clojure.core/<= 1 (clojure.core/count s__1410938__auto__))) (clojure.core/fn [s__1410939__auto__] (clojure.core/< (clojure.core/count s__1410939__auto__) 64)) (clojure.core/fn [s__1410940__auto__] (clojure.core/re-matches #"^\S(.*\S)?$" s__1410940__auto__))))

(clojure.spec.alpha/def :portkey.aws.codestar/repository-type (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__1410940__auto__] (clojure.core/re-matches #"^(user|organization|User|Organization)$" s__1410940__auto__))))

(clojure.spec.alpha/def :portkey.aws.codestar/role-arn (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__1410938__auto__] (clojure.core/<= 1 (clojure.core/count s__1410938__auto__))) (clojure.core/fn [s__1410939__auto__] (clojure.core/< (clojure.core/count s__1410939__auto__) 1224))))

(clojure.spec.alpha/def :portkey.aws.codestar.describe-user-profile-request/user-arn (clojure.spec.alpha/and :portkey.aws.codestar/user-arn))
(clojure.spec.alpha/def :portkey.aws.codestar/describe-user-profile-request (clojure.spec.alpha/keys :req-un [:portkey.aws.codestar.describe-user-profile-request/user-arn] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.codestar/tag-key (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__1410938__auto__] (clojure.core/<= 1 (clojure.core/count s__1410938__auto__))) (clojure.core/fn [s__1410939__auto__] (clojure.core/< (clojure.core/count s__1410939__auto__) 128)) (clojure.core/fn [s__1410940__auto__] (clojure.core/re-matches #"^([\p{L}\p{Z}\p{N}_.:/=+\-@]*)$" s__1410940__auto__))))

(clojure.spec.alpha/def :portkey.aws.codestar/pagination-token (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__1410938__auto__] (clojure.core/<= 1 (clojure.core/count s__1410938__auto__))) (clojure.core/fn [s__1410939__auto__] (clojure.core/< (clojure.core/count s__1410939__auto__) 512)) (clojure.core/fn [s__1410940__auto__] (clojure.core/re-matches #"^[\w/+=]+$" s__1410940__auto__))))

(clojure.spec.alpha/def :portkey.aws.codestar/tags (clojure.spec.alpha/map-of :portkey.aws.codestar/tag-key :portkey.aws.codestar/tag-value))

(clojure.spec.alpha/def :portkey.aws.codestar/limit-exceeded-exception (clojure.spec.alpha/keys :req-un [] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.codestar/invalid-service-role-exception (clojure.spec.alpha/keys :req-un [] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.codestar/disassociate-team-member-result (clojure.spec.alpha/keys :req-un [] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.codestar.update-project-request/id (clojure.spec.alpha/and :portkey.aws.codestar/project-id))
(clojure.spec.alpha/def :portkey.aws.codestar.update-project-request/name (clojure.spec.alpha/and :portkey.aws.codestar/project-name))
(clojure.spec.alpha/def :portkey.aws.codestar.update-project-request/description (clojure.spec.alpha/and :portkey.aws.codestar/project-description))
(clojure.spec.alpha/def :portkey.aws.codestar/update-project-request (clojure.spec.alpha/keys :req-un [:portkey.aws.codestar.update-project-request/id] :opt-un [:portkey.aws.codestar.update-project-request/name :portkey.aws.codestar.update-project-request/description]))

(clojure.spec.alpha/def :portkey.aws.codestar.toolchain/source (clojure.spec.alpha/and :portkey.aws.codestar/toolchain-source))
(clojure.spec.alpha/def :portkey.aws.codestar.toolchain/role-arn (clojure.spec.alpha/and :portkey.aws.codestar/role-arn))
(clojure.spec.alpha/def :portkey.aws.codestar.toolchain/stack-parameters (clojure.spec.alpha/and :portkey.aws.codestar/template-parameter-map))
(clojure.spec.alpha/def :portkey.aws.codestar/toolchain (clojure.spec.alpha/keys :req-un [:portkey.aws.codestar.toolchain/source] :opt-un [:portkey.aws.codestar.toolchain/role-arn :portkey.aws.codestar.toolchain/stack-parameters]))

(clojure.spec.alpha/def :portkey.aws.codestar/user-profiles-list (clojure.spec.alpha/coll-of :portkey.aws.codestar/user-profile-summary))

(clojure.spec.alpha/def :portkey.aws.codestar.create-project-request/name (clojure.spec.alpha/and :portkey.aws.codestar/project-name))
(clojure.spec.alpha/def :portkey.aws.codestar.create-project-request/id (clojure.spec.alpha/and :portkey.aws.codestar/project-id))
(clojure.spec.alpha/def :portkey.aws.codestar.create-project-request/description (clojure.spec.alpha/and :portkey.aws.codestar/project-description))
(clojure.spec.alpha/def :portkey.aws.codestar.create-project-request/client-request-token (clojure.spec.alpha/and :portkey.aws.codestar/client-request-token))
(clojure.spec.alpha/def :portkey.aws.codestar.create-project-request/source-code (clojure.spec.alpha/and :portkey.aws.codestar/source-code))
(clojure.spec.alpha/def :portkey.aws.codestar.create-project-request/toolchain (clojure.spec.alpha/and :portkey.aws.codestar/toolchain))
(clojure.spec.alpha/def :portkey.aws.codestar.create-project-request/tags (clojure.spec.alpha/and :portkey.aws.codestar/tags))
(clojure.spec.alpha/def :portkey.aws.codestar/create-project-request (clojure.spec.alpha/keys :req-un [:portkey.aws.codestar.create-project-request/name :portkey.aws.codestar.create-project-request/id] :opt-un [:portkey.aws.codestar.create-project-request/description :portkey.aws.codestar.create-project-request/client-request-token :portkey.aws.codestar.create-project-request/source-code :portkey.aws.codestar.create-project-request/toolchain :portkey.aws.codestar.create-project-request/tags]))

(clojure.spec.alpha/def :portkey.aws.codestar/project-arn (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__1410940__auto__] (clojure.core/re-matches #"^arn:aws[^:\s]*:codestar:[^:\s]+:[0-9]{12}:project\/[a-z]([a-z0-9|-])+$" s__1410940__auto__))))

(clojure.spec.alpha/def :portkey.aws.codestar/invalid-next-token-exception (clojure.spec.alpha/keys :req-un [] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.codestar.tag-project-result/tags (clojure.spec.alpha/and :portkey.aws.codestar/tags))
(clojure.spec.alpha/def :portkey.aws.codestar/tag-project-result (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.codestar.tag-project-result/tags]))

(clojure.spec.alpha/def :portkey.aws.codestar/resource-id (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__1410938__auto__] (clojure.core/<= 11 (clojure.core/count s__1410938__auto__))) (clojure.core/fn [s__1410940__auto__] (clojure.core/re-matches #"^arn\:aws\:\S.*\:.*" s__1410940__auto__))))

(clojure.spec.alpha/def :portkey.aws.codestar/untag-project-result (clojure.spec.alpha/keys :req-un [] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.codestar/role (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__1410940__auto__] (clojure.core/re-matches #"^(Owner|Viewer|Contributor)$" s__1410940__auto__))))

(clojure.spec.alpha/def :portkey.aws.codestar.describe-project-request/id (clojure.spec.alpha/and :portkey.aws.codestar/project-id))
(clojure.spec.alpha/def :portkey.aws.codestar/describe-project-request (clojure.spec.alpha/keys :req-un [:portkey.aws.codestar.describe-project-request/id] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.codestar.create-project-result/id (clojure.spec.alpha/and :portkey.aws.codestar/project-id))
(clojure.spec.alpha/def :portkey.aws.codestar.create-project-result/arn (clojure.spec.alpha/and :portkey.aws.codestar/project-arn))
(clojure.spec.alpha/def :portkey.aws.codestar.create-project-result/client-request-token (clojure.spec.alpha/and :portkey.aws.codestar/client-request-token))
(clojure.spec.alpha/def :portkey.aws.codestar.create-project-result/project-template-id (clojure.spec.alpha/and :portkey.aws.codestar/project-template-id))
(clojure.spec.alpha/def :portkey.aws.codestar/create-project-result (clojure.spec.alpha/keys :req-un [:portkey.aws.codestar.create-project-result/id :portkey.aws.codestar.create-project-result/arn] :opt-un [:portkey.aws.codestar.create-project-result/client-request-token :portkey.aws.codestar.create-project-result/project-template-id]))

(clojure.spec.alpha/def :portkey.aws.codestar/template-parameter-map (clojure.spec.alpha/map-of :portkey.aws.codestar/template-parameter-key :portkey.aws.codestar/template-parameter-value))

(clojure.spec.alpha/def :portkey.aws.codestar/user-profile-already-exists-exception (clojure.spec.alpha/keys :req-un [] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.codestar.list-resources-result/resources (clojure.spec.alpha/and :portkey.aws.codestar/resources-result))
(clojure.spec.alpha/def :portkey.aws.codestar.list-resources-result/next-token (clojure.spec.alpha/and :portkey.aws.codestar/pagination-token))
(clojure.spec.alpha/def :portkey.aws.codestar/list-resources-result (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.codestar.list-resources-result/resources :portkey.aws.codestar.list-resources-result/next-token]))

(clojure.spec.alpha/def :portkey.aws.codestar.untag-project-request/id (clojure.spec.alpha/and :portkey.aws.codestar/project-id))
(clojure.spec.alpha/def :portkey.aws.codestar.untag-project-request/tags (clojure.spec.alpha/and :portkey.aws.codestar/tag-keys))
(clojure.spec.alpha/def :portkey.aws.codestar/untag-project-request (clojure.spec.alpha/keys :req-un [:portkey.aws.codestar.untag-project-request/id :portkey.aws.codestar.untag-project-request/tags] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.codestar.code-source/s-3 (clojure.spec.alpha/and :portkey.aws.codestar/s-3-location))
(clojure.spec.alpha/def :portkey.aws.codestar/code-source (clojure.spec.alpha/keys :req-un [:portkey.aws.codestar.code-source/s-3] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.codestar.delete-user-profile-request/user-arn (clojure.spec.alpha/and :portkey.aws.codestar/user-arn))
(clojure.spec.alpha/def :portkey.aws.codestar/delete-user-profile-request (clojure.spec.alpha/keys :req-un [:portkey.aws.codestar.delete-user-profile-request/user-arn] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.codestar/project-already-exists-exception (clojure.spec.alpha/keys :req-un [] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.codestar.update-user-profile-request/user-arn (clojure.spec.alpha/and :portkey.aws.codestar/user-arn))
(clojure.spec.alpha/def :portkey.aws.codestar.update-user-profile-request/display-name (clojure.spec.alpha/and :portkey.aws.codestar/user-profile-display-name))
(clojure.spec.alpha/def :portkey.aws.codestar.update-user-profile-request/email-address (clojure.spec.alpha/and :portkey.aws.codestar/email))
(clojure.spec.alpha/def :portkey.aws.codestar.update-user-profile-request/ssh-public-key (clojure.spec.alpha/and :portkey.aws.codestar/ssh-public-key))
(clojure.spec.alpha/def :portkey.aws.codestar/update-user-profile-request (clojure.spec.alpha/keys :req-un [:portkey.aws.codestar.update-user-profile-request/user-arn] :opt-un [:portkey.aws.codestar.update-user-profile-request/display-name :portkey.aws.codestar.update-user-profile-request/email-address :portkey.aws.codestar.update-user-profile-request/ssh-public-key]))

(clojure.spec.alpha/def :portkey.aws.codestar.project-status/state (clojure.spec.alpha/and :portkey.aws.codestar/state))
(clojure.spec.alpha/def :portkey.aws.codestar.project-status/reason (clojure.spec.alpha/and :portkey.aws.codestar/reason))
(clojure.spec.alpha/def :portkey.aws.codestar/project-status (clojure.spec.alpha/keys :req-un [:portkey.aws.codestar.project-status/state] :opt-un [:portkey.aws.codestar.project-status/reason]))

(clojure.spec.alpha/def :portkey.aws.codestar/last-modified-timestamp clojure.core/inst?)

(clojure.spec.alpha/def :portkey.aws.codestar/tag-value (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__1410939__auto__] (clojure.core/< (clojure.core/count s__1410939__auto__) 256)) (clojure.core/fn [s__1410940__auto__] (clojure.core/re-matches #"^([\p{L}\p{Z}\p{N}_.:/=+\-@]*)$" s__1410940__auto__))))

(clojure.spec.alpha/def :portkey.aws.codestar/team-member-not-found-exception (clojure.spec.alpha/keys :req-un [] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.codestar/git-hub-personal-token (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__1410938__auto__] (clojure.core/<= 1 (clojure.core/count s__1410938__auto__)))))

(clojure.spec.alpha/def :portkey.aws.codestar.describe-user-profile-result/user-arn (clojure.spec.alpha/and :portkey.aws.codestar/user-arn))
(clojure.spec.alpha/def :portkey.aws.codestar.describe-user-profile-result/display-name (clojure.spec.alpha/and :portkey.aws.codestar/user-profile-display-name))
(clojure.spec.alpha/def :portkey.aws.codestar.describe-user-profile-result/email-address (clojure.spec.alpha/and :portkey.aws.codestar/email))
(clojure.spec.alpha/def :portkey.aws.codestar.describe-user-profile-result/ssh-public-key (clojure.spec.alpha/and :portkey.aws.codestar/ssh-public-key))
(clojure.spec.alpha/def :portkey.aws.codestar.describe-user-profile-result/created-timestamp (clojure.spec.alpha/and :portkey.aws.codestar/created-timestamp))
(clojure.spec.alpha/def :portkey.aws.codestar.describe-user-profile-result/last-modified-timestamp (clojure.spec.alpha/and :portkey.aws.codestar/last-modified-timestamp))
(clojure.spec.alpha/def :portkey.aws.codestar/describe-user-profile-result (clojure.spec.alpha/keys :req-un [:portkey.aws.codestar.describe-user-profile-result/user-arn :portkey.aws.codestar.describe-user-profile-result/created-timestamp :portkey.aws.codestar.describe-user-profile-result/last-modified-timestamp] :opt-un [:portkey.aws.codestar.describe-user-profile-result/display-name :portkey.aws.codestar.describe-user-profile-result/email-address :portkey.aws.codestar.describe-user-profile-result/ssh-public-key]))

(clojure.spec.alpha/def :portkey.aws.codestar/stack-id (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__1410940__auto__] (clojure.core/re-matches #"^arn:aws[^:\s]*:cloudformation:[^:\s]+:[0-9]{12}:stack\/[^:\s]+\/[^:\s]+$" s__1410940__auto__))))

(clojure.spec.alpha/def :portkey.aws.codestar/project-description (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__1410939__auto__] (clojure.core/< (clojure.core/count s__1410939__auto__) 1024)) (clojure.core/fn [s__1410940__auto__] (clojure.core/re-matches #"^$|^\S(.*\S)?$" s__1410940__auto__))))

(clojure.spec.alpha/def :portkey.aws.codestar/template-parameter-value (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__1410938__auto__] (clojure.core/<= 1 (clojure.core/count s__1410938__auto__))) (clojure.core/fn [s__1410939__auto__] (clojure.core/< (clojure.core/count s__1410939__auto__) 100)) (clojure.core/fn [s__1410940__auto__] (clojure.core/re-matches #"^\S(.*\S)?$" s__1410940__auto__))))

(clojure.spec.alpha/def :portkey.aws.codestar.delete-project-result/stack-id (clojure.spec.alpha/and :portkey.aws.codestar/stack-id))
(clojure.spec.alpha/def :portkey.aws.codestar.delete-project-result/project-arn (clojure.spec.alpha/and :portkey.aws.codestar/project-arn))
(clojure.spec.alpha/def :portkey.aws.codestar/delete-project-result (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.codestar.delete-project-result/stack-id :portkey.aws.codestar.delete-project-result/project-arn]))

(clojure.spec.alpha/def :portkey.aws.codestar/repository-description (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__1410938__auto__] (clojure.core/<= 1 (clojure.core/count s__1410938__auto__))) (clojure.core/fn [s__1410939__auto__] (clojure.core/< (clojure.core/count s__1410939__auto__) 1000)) (clojure.core/fn [s__1410940__auto__] (clojure.core/re-matches #"^\S(.*\S)?$" s__1410940__auto__))))

(clojure.spec.alpha/def :portkey.aws.codestar.associate-team-member-result/client-request-token (clojure.spec.alpha/and :portkey.aws.codestar/client-request-token))
(clojure.spec.alpha/def :portkey.aws.codestar/associate-team-member-result (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.codestar.associate-team-member-result/client-request-token]))

(clojure.spec.alpha/def :portkey.aws.codestar/project-id (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__1410938__auto__] (clojure.core/<= 2 (clojure.core/count s__1410938__auto__))) (clojure.core/fn [s__1410939__auto__] (clojure.core/< (clojure.core/count s__1410939__auto__) 15)) (clojure.core/fn [s__1410940__auto__] (clojure.core/re-matches #"^[a-z][a-z0-9-]+$" s__1410940__auto__))))

(clojure.spec.alpha/def :portkey.aws.codestar/team-member-result (clojure.spec.alpha/coll-of :portkey.aws.codestar/team-member))

(clojure.spec.alpha/def :portkey.aws.codestar.update-team-member-result/user-arn (clojure.spec.alpha/and :portkey.aws.codestar/user-arn))
(clojure.spec.alpha/def :portkey.aws.codestar.update-team-member-result/project-role (clojure.spec.alpha/and :portkey.aws.codestar/role))
(clojure.spec.alpha/def :portkey.aws.codestar.update-team-member-result/remote-access-allowed (clojure.spec.alpha/and :portkey.aws.codestar/remote-access-allowed))
(clojure.spec.alpha/def :portkey.aws.codestar/update-team-member-result (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.codestar.update-team-member-result/user-arn :portkey.aws.codestar.update-team-member-result/project-role :portkey.aws.codestar.update-team-member-result/remote-access-allowed]))

(clojure.spec.alpha/def :portkey.aws.codestar.create-user-profile-result/user-arn (clojure.spec.alpha/and :portkey.aws.codestar/user-arn))
(clojure.spec.alpha/def :portkey.aws.codestar.create-user-profile-result/display-name (clojure.spec.alpha/and :portkey.aws.codestar/user-profile-display-name))
(clojure.spec.alpha/def :portkey.aws.codestar.create-user-profile-result/email-address (clojure.spec.alpha/and :portkey.aws.codestar/email))
(clojure.spec.alpha/def :portkey.aws.codestar.create-user-profile-result/ssh-public-key (clojure.spec.alpha/and :portkey.aws.codestar/ssh-public-key))
(clojure.spec.alpha/def :portkey.aws.codestar.create-user-profile-result/created-timestamp (clojure.spec.alpha/and :portkey.aws.codestar/created-timestamp))
(clojure.spec.alpha/def :portkey.aws.codestar.create-user-profile-result/last-modified-timestamp (clojure.spec.alpha/and :portkey.aws.codestar/last-modified-timestamp))
(clojure.spec.alpha/def :portkey.aws.codestar/create-user-profile-result (clojure.spec.alpha/keys :req-un [:portkey.aws.codestar.create-user-profile-result/user-arn] :opt-un [:portkey.aws.codestar.create-user-profile-result/display-name :portkey.aws.codestar.create-user-profile-result/email-address :portkey.aws.codestar.create-user-profile-result/ssh-public-key :portkey.aws.codestar.create-user-profile-result/created-timestamp :portkey.aws.codestar.create-user-profile-result/last-modified-timestamp]))

(clojure.spec.alpha/def :portkey.aws.codestar.s-3-location/bucket-name (clojure.spec.alpha/and :portkey.aws.codestar/bucket-name))
(clojure.spec.alpha/def :portkey.aws.codestar.s-3-location/bucket-key (clojure.spec.alpha/and :portkey.aws.codestar/bucket-key))
(clojure.spec.alpha/def :portkey.aws.codestar/s-3-location (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.codestar.s-3-location/bucket-name :portkey.aws.codestar.s-3-location/bucket-key]))

(clojure.spec.alpha/def :portkey.aws.codestar.project-summary/project-id (clojure.spec.alpha/and :portkey.aws.codestar/project-id))
(clojure.spec.alpha/def :portkey.aws.codestar.project-summary/project-arn (clojure.spec.alpha/and :portkey.aws.codestar/project-arn))
(clojure.spec.alpha/def :portkey.aws.codestar/project-summary (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.codestar.project-summary/project-id :portkey.aws.codestar.project-summary/project-arn]))

(clojure.spec.alpha/def :portkey.aws.codestar/bucket-key (clojure.spec.alpha/and clojure.core/string?))

(clojure.spec.alpha/def :portkey.aws.codestar.list-tags-for-project-result/tags (clojure.spec.alpha/and :portkey.aws.codestar/tags))
(clojure.spec.alpha/def :portkey.aws.codestar.list-tags-for-project-result/next-token (clojure.spec.alpha/and :portkey.aws.codestar/pagination-token))
(clojure.spec.alpha/def :portkey.aws.codestar/list-tags-for-project-result (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.codestar.list-tags-for-project-result/tags :portkey.aws.codestar.list-tags-for-project-result/next-token]))

(clojure.spec.alpha/def :portkey.aws.codestar.associate-team-member-request/project-id (clojure.spec.alpha/and :portkey.aws.codestar/project-id))
(clojure.spec.alpha/def :portkey.aws.codestar.associate-team-member-request/client-request-token (clojure.spec.alpha/and :portkey.aws.codestar/client-request-token))
(clojure.spec.alpha/def :portkey.aws.codestar.associate-team-member-request/user-arn (clojure.spec.alpha/and :portkey.aws.codestar/user-arn))
(clojure.spec.alpha/def :portkey.aws.codestar.associate-team-member-request/project-role (clojure.spec.alpha/and :portkey.aws.codestar/role))
(clojure.spec.alpha/def :portkey.aws.codestar.associate-team-member-request/remote-access-allowed (clojure.spec.alpha/and :portkey.aws.codestar/remote-access-allowed))
(clojure.spec.alpha/def :portkey.aws.codestar/associate-team-member-request (clojure.spec.alpha/keys :req-un [:portkey.aws.codestar.associate-team-member-request/project-id :portkey.aws.codestar.associate-team-member-request/user-arn :portkey.aws.codestar.associate-team-member-request/project-role] :opt-un [:portkey.aws.codestar.associate-team-member-request/client-request-token :portkey.aws.codestar.associate-team-member-request/remote-access-allowed]))

(clojure.spec.alpha/def :portkey.aws.codestar.list-team-members-result/team-members (clojure.spec.alpha/and :portkey.aws.codestar/team-member-result))
(clojure.spec.alpha/def :portkey.aws.codestar.list-team-members-result/next-token (clojure.spec.alpha/and :portkey.aws.codestar/pagination-token))
(clojure.spec.alpha/def :portkey.aws.codestar/list-team-members-result (clojure.spec.alpha/keys :req-un [:portkey.aws.codestar.list-team-members-result/team-members] :opt-un [:portkey.aws.codestar.list-team-members-result/next-token]))

(clojure.spec.alpha/def :portkey.aws.codestar/state (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__1410940__auto__] (clojure.core/re-matches #"^(CreateInProgress|CreateComplete|CreateFailed|DeleteComplete|DeleteFailed|DeleteInProgress|UpdateComplete|UpdateInProgress|UpdateFailed|Unknown)$" s__1410940__auto__))))

(clojure.spec.alpha/def :portkey.aws.codestar/max-results (clojure.spec.alpha/int-in 1 100))

(clojure.spec.alpha/def :portkey.aws.codestar.resource/id (clojure.spec.alpha/and :portkey.aws.codestar/resource-id))
(clojure.spec.alpha/def :portkey.aws.codestar/resource (clojure.spec.alpha/keys :req-un [:portkey.aws.codestar.resource/id] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.codestar/reason (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__1410939__auto__] (clojure.core/< (clojure.core/count s__1410939__auto__) 1024)) (clojure.core/fn [s__1410940__auto__] (clojure.core/re-matches #"^$|^\S(.*\S)?$" s__1410940__auto__))))

(clojure.spec.alpha/def :portkey.aws.codestar/project-not-found-exception (clojure.spec.alpha/keys :req-un [] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.codestar/concurrent-modification-exception (clojure.spec.alpha/keys :req-un [] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.codestar/project-name (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__1410938__auto__] (clojure.core/<= 1 (clojure.core/count s__1410938__auto__))) (clojure.core/fn [s__1410939__auto__] (clojure.core/< (clojure.core/count s__1410939__auto__) 100)) (clojure.core/fn [s__1410940__auto__] (clojure.core/re-matches #"^\S(.*\S)?$" s__1410940__auto__))))

(clojure.spec.alpha/def :portkey.aws.codestar/projects-list (clojure.spec.alpha/coll-of :portkey.aws.codestar/project-summary))

(clojure.spec.alpha/def :portkey.aws.codestar.code/source (clojure.spec.alpha/and :portkey.aws.codestar/code-source))
(clojure.spec.alpha/def :portkey.aws.codestar.code/destination (clojure.spec.alpha/and :portkey.aws.codestar/code-destination))
(clojure.spec.alpha/def :portkey.aws.codestar/code (clojure.spec.alpha/keys :req-un [:portkey.aws.codestar.code/source :portkey.aws.codestar.code/destination] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.codestar/project-configuration-exception (clojure.spec.alpha/keys :req-un [] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.codestar/bucket-name (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__1410938__auto__] (clojure.core/<= 3 (clojure.core/count s__1410938__auto__))) (clojure.core/fn [s__1410939__auto__] (clojure.core/< (clojure.core/count s__1410939__auto__) 63))))

(clojure.spec.alpha/def :portkey.aws.codestar/resources-result (clojure.spec.alpha/coll-of :portkey.aws.codestar/resource))

(clojure.spec.alpha/def :portkey.aws.codestar.create-user-profile-request/user-arn (clojure.spec.alpha/and :portkey.aws.codestar/user-arn))
(clojure.spec.alpha/def :portkey.aws.codestar.create-user-profile-request/display-name (clojure.spec.alpha/and :portkey.aws.codestar/user-profile-display-name))
(clojure.spec.alpha/def :portkey.aws.codestar.create-user-profile-request/email-address (clojure.spec.alpha/and :portkey.aws.codestar/email))
(clojure.spec.alpha/def :portkey.aws.codestar.create-user-profile-request/ssh-public-key (clojure.spec.alpha/and :portkey.aws.codestar/ssh-public-key))
(clojure.spec.alpha/def :portkey.aws.codestar/create-user-profile-request (clojure.spec.alpha/keys :req-un [:portkey.aws.codestar.create-user-profile-request/user-arn :portkey.aws.codestar.create-user-profile-request/display-name :portkey.aws.codestar.create-user-profile-request/email-address] :opt-un [:portkey.aws.codestar.create-user-profile-request/ssh-public-key]))

(clojure.spec.alpha/def :portkey.aws.codestar.disassociate-team-member-request/project-id (clojure.spec.alpha/and :portkey.aws.codestar/project-id))
(clojure.spec.alpha/def :portkey.aws.codestar.disassociate-team-member-request/user-arn (clojure.spec.alpha/and :portkey.aws.codestar/user-arn))
(clojure.spec.alpha/def :portkey.aws.codestar/disassociate-team-member-request (clojure.spec.alpha/keys :req-un [:portkey.aws.codestar.disassociate-team-member-request/project-id :portkey.aws.codestar.disassociate-team-member-request/user-arn] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.codestar.delete-user-profile-result/user-arn (clojure.spec.alpha/and :portkey.aws.codestar/user-arn))
(clojure.spec.alpha/def :portkey.aws.codestar/delete-user-profile-result (clojure.spec.alpha/keys :req-un [:portkey.aws.codestar.delete-user-profile-result/user-arn] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.codestar.delete-project-request/id (clojure.spec.alpha/and :portkey.aws.codestar/project-id))
(clojure.spec.alpha/def :portkey.aws.codestar.delete-project-request/client-request-token (clojure.spec.alpha/and :portkey.aws.codestar/client-request-token))
(clojure.spec.alpha/def :portkey.aws.codestar.delete-project-request/delete-stack (clojure.spec.alpha/and :portkey.aws.codestar/delete-stack))
(clojure.spec.alpha/def :portkey.aws.codestar/delete-project-request (clojure.spec.alpha/keys :req-un [:portkey.aws.codestar.delete-project-request/id] :opt-un [:portkey.aws.codestar.delete-project-request/client-request-token :portkey.aws.codestar.delete-project-request/delete-stack]))

(clojure.spec.alpha/def :portkey.aws.codestar.update-user-profile-result/user-arn (clojure.spec.alpha/and :portkey.aws.codestar/user-arn))
(clojure.spec.alpha/def :portkey.aws.codestar.update-user-profile-result/display-name (clojure.spec.alpha/and :portkey.aws.codestar/user-profile-display-name))
(clojure.spec.alpha/def :portkey.aws.codestar.update-user-profile-result/email-address (clojure.spec.alpha/and :portkey.aws.codestar/email))
(clojure.spec.alpha/def :portkey.aws.codestar.update-user-profile-result/ssh-public-key (clojure.spec.alpha/and :portkey.aws.codestar/ssh-public-key))
(clojure.spec.alpha/def :portkey.aws.codestar.update-user-profile-result/created-timestamp (clojure.spec.alpha/and :portkey.aws.codestar/created-timestamp))
(clojure.spec.alpha/def :portkey.aws.codestar.update-user-profile-result/last-modified-timestamp (clojure.spec.alpha/and :portkey.aws.codestar/last-modified-timestamp))
(clojure.spec.alpha/def :portkey.aws.codestar/update-user-profile-result (clojure.spec.alpha/keys :req-un [:portkey.aws.codestar.update-user-profile-result/user-arn] :opt-un [:portkey.aws.codestar.update-user-profile-result/display-name :portkey.aws.codestar.update-user-profile-result/email-address :portkey.aws.codestar.update-user-profile-result/ssh-public-key :portkey.aws.codestar.update-user-profile-result/created-timestamp :portkey.aws.codestar.update-user-profile-result/last-modified-timestamp]))

(clojure.spec.alpha/def :portkey.aws.codestar/user-arn (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__1410938__auto__] (clojure.core/<= 32 (clojure.core/count s__1410938__auto__))) (clojure.core/fn [s__1410939__auto__] (clojure.core/< (clojure.core/count s__1410939__auto__) 95)) (clojure.core/fn [s__1410940__auto__] (clojure.core/re-matches #"^arn:aws:iam::\d{12}:user(?:(\u002F)|(\u002F[\u0021-\u007E]+\u002F))[\w+=,.@-]+$" s__1410940__auto__))))

(clojure.spec.alpha/def :portkey.aws.codestar.team-member/user-arn (clojure.spec.alpha/and :portkey.aws.codestar/user-arn))
(clojure.spec.alpha/def :portkey.aws.codestar.team-member/project-role (clojure.spec.alpha/and :portkey.aws.codestar/role))
(clojure.spec.alpha/def :portkey.aws.codestar.team-member/remote-access-allowed (clojure.spec.alpha/and :portkey.aws.codestar/remote-access-allowed))
(clojure.spec.alpha/def :portkey.aws.codestar/team-member (clojure.spec.alpha/keys :req-un [:portkey.aws.codestar.team-member/user-arn :portkey.aws.codestar.team-member/project-role] :opt-un [:portkey.aws.codestar.team-member/remote-access-allowed]))

(clojure.spec.alpha/def :portkey.aws.codestar.git-hub-code-destination/name (clojure.spec.alpha/and :portkey.aws.codestar/repository-name))
(clojure.spec.alpha/def :portkey.aws.codestar.git-hub-code-destination/description (clojure.spec.alpha/and :portkey.aws.codestar/repository-description))
(clojure.spec.alpha/def :portkey.aws.codestar.git-hub-code-destination/type (clojure.spec.alpha/and :portkey.aws.codestar/repository-type))
(clojure.spec.alpha/def :portkey.aws.codestar.git-hub-code-destination/owner (clojure.spec.alpha/and :portkey.aws.codestar/repository-owner))
(clojure.spec.alpha/def :portkey.aws.codestar.git-hub-code-destination/private-repository (clojure.spec.alpha/and :portkey.aws.codestar/repository-is-private))
(clojure.spec.alpha/def :portkey.aws.codestar.git-hub-code-destination/issues-enabled (clojure.spec.alpha/and :portkey.aws.codestar/repository-enable-issues))
(clojure.spec.alpha/def :portkey.aws.codestar.git-hub-code-destination/token (clojure.spec.alpha/and :portkey.aws.codestar/git-hub-personal-token))
(clojure.spec.alpha/def :portkey.aws.codestar/git-hub-code-destination (clojure.spec.alpha/keys :req-un [:portkey.aws.codestar.git-hub-code-destination/name :portkey.aws.codestar.git-hub-code-destination/type :portkey.aws.codestar.git-hub-code-destination/owner :portkey.aws.codestar.git-hub-code-destination/private-repository :portkey.aws.codestar.git-hub-code-destination/issues-enabled :portkey.aws.codestar.git-hub-code-destination/token] :opt-un [:portkey.aws.codestar.git-hub-code-destination/description]))

(clojure.spec.alpha/def :portkey.aws.codestar.tag-project-request/id (clojure.spec.alpha/and :portkey.aws.codestar/project-id))
(clojure.spec.alpha/def :portkey.aws.codestar.tag-project-request/tags (clojure.spec.alpha/and :portkey.aws.codestar/tags))
(clojure.spec.alpha/def :portkey.aws.codestar/tag-project-request (clojure.spec.alpha/keys :req-un [:portkey.aws.codestar.tag-project-request/id :portkey.aws.codestar.tag-project-request/tags] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.codestar.update-team-member-request/project-id (clojure.spec.alpha/and :portkey.aws.codestar/project-id))
(clojure.spec.alpha/def :portkey.aws.codestar.update-team-member-request/user-arn (clojure.spec.alpha/and :portkey.aws.codestar/user-arn))
(clojure.spec.alpha/def :portkey.aws.codestar.update-team-member-request/project-role (clojure.spec.alpha/and :portkey.aws.codestar/role))
(clojure.spec.alpha/def :portkey.aws.codestar.update-team-member-request/remote-access-allowed (clojure.spec.alpha/and :portkey.aws.codestar/remote-access-allowed))
(clojure.spec.alpha/def :portkey.aws.codestar/update-team-member-request (clojure.spec.alpha/keys :req-un [:portkey.aws.codestar.update-team-member-request/project-id :portkey.aws.codestar.update-team-member-request/user-arn] :opt-un [:portkey.aws.codestar.update-team-member-request/project-role :portkey.aws.codestar.update-team-member-request/remote-access-allowed]))

(clojure.core/defn associate-team-member "Adds an IAM user to the team for an AWS CodeStar project." ([associate-team-member-requestinput] (clojure.core/let [request-function-result__1411981__auto__ (req-associate-team-member-request associate-team-member-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__1411981__auto__ {:http.request.configuration/endpoints portkey.aws.codestar/endpoints, :http.request.configuration/target-prefix "CodeStar_20170419", :http.request.spec/output-spec :portkey.aws.codestar/associate-team-member-result, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2017-04-19", :http.request.configuration/service-id "CodeStar", :http.request.spec/input-spec :portkey.aws.codestar/associate-team-member-request, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "AssociateTeamMember", :http.request.configuration/output-deser-fn response-associate-team-member-result, :http.request.spec/error-spec {"LimitExceededException" :portkey.aws.codestar/limit-exceeded-exception, "ProjectNotFoundException" :portkey.aws.codestar/project-not-found-exception, "TeamMemberAlreadyAssociatedException" :portkey.aws.codestar/team-member-already-associated-exception, "ValidationException" :portkey.aws.codestar/validation-exception, "InvalidServiceRoleException" :portkey.aws.codestar/invalid-service-role-exception, "ProjectConfigurationException" :portkey.aws.codestar/project-configuration-exception, "ConcurrentModificationException" :portkey.aws.codestar/concurrent-modification-exception}})))))
(clojure.spec.alpha/fdef associate-team-member :args (clojure.spec.alpha/tuple :portkey.aws.codestar/associate-team-member-request) :ret (clojure.spec.alpha/and :portkey.aws.codestar/associate-team-member-result))

(clojure.core/defn tag-project "Adds tags to a project." ([tag-project-requestinput] (clojure.core/let [request-function-result__1411981__auto__ (req-tag-project-request tag-project-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__1411981__auto__ {:http.request.configuration/endpoints portkey.aws.codestar/endpoints, :http.request.configuration/target-prefix "CodeStar_20170419", :http.request.spec/output-spec :portkey.aws.codestar/tag-project-result, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2017-04-19", :http.request.configuration/service-id "CodeStar", :http.request.spec/input-spec :portkey.aws.codestar/tag-project-request, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "TagProject", :http.request.configuration/output-deser-fn response-tag-project-result, :http.request.spec/error-spec {"ProjectNotFoundException" :portkey.aws.codestar/project-not-found-exception, "ValidationException" :portkey.aws.codestar/validation-exception, "LimitExceededException" :portkey.aws.codestar/limit-exceeded-exception, "ConcurrentModificationException" :portkey.aws.codestar/concurrent-modification-exception}})))))
(clojure.spec.alpha/fdef tag-project :args (clojure.spec.alpha/tuple :portkey.aws.codestar/tag-project-request) :ret (clojure.spec.alpha/and :portkey.aws.codestar/tag-project-result))

(clojure.core/defn update-user-profile "Updates a user's profile in AWS CodeStar. The user profile is not\nproject-specific. Information in the user profile is displayed wherever the\nuser's information appears to other users in AWS CodeStar." ([update-user-profile-requestinput] (clojure.core/let [request-function-result__1411981__auto__ (req-update-user-profile-request update-user-profile-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__1411981__auto__ {:http.request.configuration/endpoints portkey.aws.codestar/endpoints, :http.request.configuration/target-prefix "CodeStar_20170419", :http.request.spec/output-spec :portkey.aws.codestar/update-user-profile-result, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2017-04-19", :http.request.configuration/service-id "CodeStar", :http.request.spec/input-spec :portkey.aws.codestar/update-user-profile-request, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "UpdateUserProfile", :http.request.configuration/output-deser-fn response-update-user-profile-result, :http.request.spec/error-spec {"UserProfileNotFoundException" :portkey.aws.codestar/user-profile-not-found-exception, "ValidationException" :portkey.aws.codestar/validation-exception}})))))
(clojure.spec.alpha/fdef update-user-profile :args (clojure.spec.alpha/tuple :portkey.aws.codestar/update-user-profile-request) :ret (clojure.spec.alpha/and :portkey.aws.codestar/update-user-profile-result))

(clojure.core/defn describe-project "Describes a project and its resources." ([describe-project-requestinput] (clojure.core/let [request-function-result__1411981__auto__ (req-describe-project-request describe-project-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__1411981__auto__ {:http.request.configuration/endpoints portkey.aws.codestar/endpoints, :http.request.configuration/target-prefix "CodeStar_20170419", :http.request.spec/output-spec :portkey.aws.codestar/describe-project-result, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2017-04-19", :http.request.configuration/service-id "CodeStar", :http.request.spec/input-spec :portkey.aws.codestar/describe-project-request, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "DescribeProject", :http.request.configuration/output-deser-fn response-describe-project-result, :http.request.spec/error-spec {"ProjectNotFoundException" :portkey.aws.codestar/project-not-found-exception, "ValidationException" :portkey.aws.codestar/validation-exception, "InvalidServiceRoleException" :portkey.aws.codestar/invalid-service-role-exception, "ProjectConfigurationException" :portkey.aws.codestar/project-configuration-exception, "ConcurrentModificationException" :portkey.aws.codestar/concurrent-modification-exception}})))))
(clojure.spec.alpha/fdef describe-project :args (clojure.spec.alpha/tuple :portkey.aws.codestar/describe-project-request) :ret (clojure.spec.alpha/and :portkey.aws.codestar/describe-project-result))

(clojure.core/defn list-projects "Lists all projects in AWS CodeStar associated with your AWS account." ([] (list-projects {})) ([list-projects-requestinput] (clojure.core/let [request-function-result__1411981__auto__ (req-list-projects-request list-projects-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__1411981__auto__ {:http.request.configuration/endpoints portkey.aws.codestar/endpoints, :http.request.configuration/target-prefix "CodeStar_20170419", :http.request.spec/output-spec :portkey.aws.codestar/list-projects-result, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2017-04-19", :http.request.configuration/service-id "CodeStar", :http.request.spec/input-spec :portkey.aws.codestar/list-projects-request, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "ListProjects", :http.request.configuration/output-deser-fn response-list-projects-result, :http.request.spec/error-spec {"InvalidNextTokenException" :portkey.aws.codestar/invalid-next-token-exception, "ValidationException" :portkey.aws.codestar/validation-exception}})))))
(clojure.spec.alpha/fdef list-projects :args (clojure.spec.alpha/? :portkey.aws.codestar/list-projects-request) :ret (clojure.spec.alpha/and :portkey.aws.codestar/list-projects-result))

(clojure.core/defn update-project "Updates a project in AWS CodeStar." ([update-project-requestinput] (clojure.core/let [request-function-result__1411981__auto__ (req-update-project-request update-project-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__1411981__auto__ {:http.request.configuration/endpoints portkey.aws.codestar/endpoints, :http.request.configuration/target-prefix "CodeStar_20170419", :http.request.spec/output-spec :portkey.aws.codestar/update-project-result, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2017-04-19", :http.request.configuration/service-id "CodeStar", :http.request.spec/input-spec :portkey.aws.codestar/update-project-request, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "UpdateProject", :http.request.configuration/output-deser-fn response-update-project-result, :http.request.spec/error-spec {"ProjectNotFoundException" :portkey.aws.codestar/project-not-found-exception, "ValidationException" :portkey.aws.codestar/validation-exception}})))))
(clojure.spec.alpha/fdef update-project :args (clojure.spec.alpha/tuple :portkey.aws.codestar/update-project-request) :ret (clojure.spec.alpha/and :portkey.aws.codestar/update-project-result))

(clojure.core/defn describe-user-profile "Describes a user in AWS CodeStar and the user attributes across all projects." ([describe-user-profile-requestinput] (clojure.core/let [request-function-result__1411981__auto__ (req-describe-user-profile-request describe-user-profile-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__1411981__auto__ {:http.request.configuration/endpoints portkey.aws.codestar/endpoints, :http.request.configuration/target-prefix "CodeStar_20170419", :http.request.spec/output-spec :portkey.aws.codestar/describe-user-profile-result, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2017-04-19", :http.request.configuration/service-id "CodeStar", :http.request.spec/input-spec :portkey.aws.codestar/describe-user-profile-request, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "DescribeUserProfile", :http.request.configuration/output-deser-fn response-describe-user-profile-result, :http.request.spec/error-spec {"UserProfileNotFoundException" :portkey.aws.codestar/user-profile-not-found-exception, "ValidationException" :portkey.aws.codestar/validation-exception}})))))
(clojure.spec.alpha/fdef describe-user-profile :args (clojure.spec.alpha/tuple :portkey.aws.codestar/describe-user-profile-request) :ret (clojure.spec.alpha/and :portkey.aws.codestar/describe-user-profile-result))

(clojure.core/defn list-tags-for-project "Gets the tags for a project." ([list-tags-for-project-requestinput] (clojure.core/let [request-function-result__1411981__auto__ (req-list-tags-for-project-request list-tags-for-project-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__1411981__auto__ {:http.request.configuration/endpoints portkey.aws.codestar/endpoints, :http.request.configuration/target-prefix "CodeStar_20170419", :http.request.spec/output-spec :portkey.aws.codestar/list-tags-for-project-result, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2017-04-19", :http.request.configuration/service-id "CodeStar", :http.request.spec/input-spec :portkey.aws.codestar/list-tags-for-project-request, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "ListTagsForProject", :http.request.configuration/output-deser-fn response-list-tags-for-project-result, :http.request.spec/error-spec {"ProjectNotFoundException" :portkey.aws.codestar/project-not-found-exception, "ValidationException" :portkey.aws.codestar/validation-exception, "InvalidNextTokenException" :portkey.aws.codestar/invalid-next-token-exception}})))))
(clojure.spec.alpha/fdef list-tags-for-project :args (clojure.spec.alpha/tuple :portkey.aws.codestar/list-tags-for-project-request) :ret (clojure.spec.alpha/and :portkey.aws.codestar/list-tags-for-project-result))

(clojure.core/defn create-user-profile "Creates a profile for a user that includes user preferences, such as the display\nname and email address assocciated with the user, in AWS CodeStar. The user\nprofile is not project-specific. Information in the user profile is displayed\nwherever the user's information appears to other users in AWS CodeStar." ([create-user-profile-requestinput] (clojure.core/let [request-function-result__1411981__auto__ (req-create-user-profile-request create-user-profile-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__1411981__auto__ {:http.request.configuration/endpoints portkey.aws.codestar/endpoints, :http.request.configuration/target-prefix "CodeStar_20170419", :http.request.spec/output-spec :portkey.aws.codestar/create-user-profile-result, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2017-04-19", :http.request.configuration/service-id "CodeStar", :http.request.spec/input-spec :portkey.aws.codestar/create-user-profile-request, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "CreateUserProfile", :http.request.configuration/output-deser-fn response-create-user-profile-result, :http.request.spec/error-spec {"UserProfileAlreadyExistsException" :portkey.aws.codestar/user-profile-already-exists-exception, "ValidationException" :portkey.aws.codestar/validation-exception}})))))
(clojure.spec.alpha/fdef create-user-profile :args (clojure.spec.alpha/tuple :portkey.aws.codestar/create-user-profile-request) :ret (clojure.spec.alpha/and :portkey.aws.codestar/create-user-profile-result))

(clojure.core/defn list-user-profiles "Lists all the user profiles configured for your AWS account in AWS CodeStar." ([] (list-user-profiles {})) ([list-user-profiles-requestinput] (clojure.core/let [request-function-result__1411981__auto__ (req-list-user-profiles-request list-user-profiles-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__1411981__auto__ {:http.request.configuration/endpoints portkey.aws.codestar/endpoints, :http.request.configuration/target-prefix "CodeStar_20170419", :http.request.spec/output-spec :portkey.aws.codestar/list-user-profiles-result, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2017-04-19", :http.request.configuration/service-id "CodeStar", :http.request.spec/input-spec :portkey.aws.codestar/list-user-profiles-request, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "ListUserProfiles", :http.request.configuration/output-deser-fn response-list-user-profiles-result, :http.request.spec/error-spec {"InvalidNextTokenException" :portkey.aws.codestar/invalid-next-token-exception, "ValidationException" :portkey.aws.codestar/validation-exception}})))))
(clojure.spec.alpha/fdef list-user-profiles :args (clojure.spec.alpha/? :portkey.aws.codestar/list-user-profiles-request) :ret (clojure.spec.alpha/and :portkey.aws.codestar/list-user-profiles-result))

(clojure.core/defn untag-project "Removes tags from a project." ([untag-project-requestinput] (clojure.core/let [request-function-result__1411981__auto__ (req-untag-project-request untag-project-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__1411981__auto__ {:http.request.configuration/endpoints portkey.aws.codestar/endpoints, :http.request.configuration/target-prefix "CodeStar_20170419", :http.request.spec/output-spec :portkey.aws.codestar/untag-project-result, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2017-04-19", :http.request.configuration/service-id "CodeStar", :http.request.spec/input-spec :portkey.aws.codestar/untag-project-request, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "UntagProject", :http.request.configuration/output-deser-fn response-untag-project-result, :http.request.spec/error-spec {"ProjectNotFoundException" :portkey.aws.codestar/project-not-found-exception, "ValidationException" :portkey.aws.codestar/validation-exception, "LimitExceededException" :portkey.aws.codestar/limit-exceeded-exception, "ConcurrentModificationException" :portkey.aws.codestar/concurrent-modification-exception}})))))
(clojure.spec.alpha/fdef untag-project :args (clojure.spec.alpha/tuple :portkey.aws.codestar/untag-project-request) :ret (clojure.spec.alpha/and :portkey.aws.codestar/untag-project-result))

(clojure.core/defn delete-user-profile "Deletes a user profile in AWS CodeStar, including all personal preference data\nassociated with that profile, such as display name and email address. It does\nnot delete the history of that user, for example the history of commits made by\nthat user." ([delete-user-profile-requestinput] (clojure.core/let [request-function-result__1411981__auto__ (req-delete-user-profile-request delete-user-profile-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__1411981__auto__ {:http.request.configuration/endpoints portkey.aws.codestar/endpoints, :http.request.configuration/target-prefix "CodeStar_20170419", :http.request.spec/output-spec :portkey.aws.codestar/delete-user-profile-result, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2017-04-19", :http.request.configuration/service-id "CodeStar", :http.request.spec/input-spec :portkey.aws.codestar/delete-user-profile-request, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "DeleteUserProfile", :http.request.configuration/output-deser-fn response-delete-user-profile-result, :http.request.spec/error-spec {"ValidationException" :portkey.aws.codestar/validation-exception}})))))
(clojure.spec.alpha/fdef delete-user-profile :args (clojure.spec.alpha/tuple :portkey.aws.codestar/delete-user-profile-request) :ret (clojure.spec.alpha/and :portkey.aws.codestar/delete-user-profile-result))

(clojure.core/defn list-resources "Lists resources associated with a project in AWS CodeStar." ([list-resources-requestinput] (clojure.core/let [request-function-result__1411981__auto__ (req-list-resources-request list-resources-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__1411981__auto__ {:http.request.configuration/endpoints portkey.aws.codestar/endpoints, :http.request.configuration/target-prefix "CodeStar_20170419", :http.request.spec/output-spec :portkey.aws.codestar/list-resources-result, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2017-04-19", :http.request.configuration/service-id "CodeStar", :http.request.spec/input-spec :portkey.aws.codestar/list-resources-request, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "ListResources", :http.request.configuration/output-deser-fn response-list-resources-result, :http.request.spec/error-spec {"ProjectNotFoundException" :portkey.aws.codestar/project-not-found-exception, "InvalidNextTokenException" :portkey.aws.codestar/invalid-next-token-exception, "ValidationException" :portkey.aws.codestar/validation-exception}})))))
(clojure.spec.alpha/fdef list-resources :args (clojure.spec.alpha/tuple :portkey.aws.codestar/list-resources-request) :ret (clojure.spec.alpha/and :portkey.aws.codestar/list-resources-result))

(clojure.core/defn delete-project "Deletes a project, including project resources. Does not delete users associated\nwith the project, but does delete the IAM roles that allowed access to the\nproject." ([delete-project-requestinput] (clojure.core/let [request-function-result__1411981__auto__ (req-delete-project-request delete-project-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__1411981__auto__ {:http.request.configuration/endpoints portkey.aws.codestar/endpoints, :http.request.configuration/target-prefix "CodeStar_20170419", :http.request.spec/output-spec :portkey.aws.codestar/delete-project-result, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2017-04-19", :http.request.configuration/service-id "CodeStar", :http.request.spec/input-spec :portkey.aws.codestar/delete-project-request, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "DeleteProject", :http.request.configuration/output-deser-fn response-delete-project-result, :http.request.spec/error-spec {"ConcurrentModificationException" :portkey.aws.codestar/concurrent-modification-exception, "ValidationException" :portkey.aws.codestar/validation-exception, "InvalidServiceRoleException" :portkey.aws.codestar/invalid-service-role-exception}})))))
(clojure.spec.alpha/fdef delete-project :args (clojure.spec.alpha/tuple :portkey.aws.codestar/delete-project-request) :ret (clojure.spec.alpha/and :portkey.aws.codestar/delete-project-result))

(clojure.core/defn list-team-members "Lists all team members associated with a project." ([list-team-members-requestinput] (clojure.core/let [request-function-result__1411981__auto__ (req-list-team-members-request list-team-members-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__1411981__auto__ {:http.request.configuration/endpoints portkey.aws.codestar/endpoints, :http.request.configuration/target-prefix "CodeStar_20170419", :http.request.spec/output-spec :portkey.aws.codestar/list-team-members-result, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2017-04-19", :http.request.configuration/service-id "CodeStar", :http.request.spec/input-spec :portkey.aws.codestar/list-team-members-request, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "ListTeamMembers", :http.request.configuration/output-deser-fn response-list-team-members-result, :http.request.spec/error-spec {"ProjectNotFoundException" :portkey.aws.codestar/project-not-found-exception, "InvalidNextTokenException" :portkey.aws.codestar/invalid-next-token-exception, "ValidationException" :portkey.aws.codestar/validation-exception}})))))
(clojure.spec.alpha/fdef list-team-members :args (clojure.spec.alpha/tuple :portkey.aws.codestar/list-team-members-request) :ret (clojure.spec.alpha/and :portkey.aws.codestar/list-team-members-result))

(clojure.core/defn disassociate-team-member "Removes a user from a project. Removing a user from a project also removes the\nIAM policies from that user that allowed access to the project and its\nresources. Disassociating a team member does not remove that user's profile from\nAWS CodeStar. It does not remove the user from IAM." ([disassociate-team-member-requestinput] (clojure.core/let [request-function-result__1411981__auto__ (req-disassociate-team-member-request disassociate-team-member-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__1411981__auto__ {:http.request.configuration/endpoints portkey.aws.codestar/endpoints, :http.request.configuration/target-prefix "CodeStar_20170419", :http.request.spec/output-spec :portkey.aws.codestar/disassociate-team-member-result, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2017-04-19", :http.request.configuration/service-id "CodeStar", :http.request.spec/input-spec :portkey.aws.codestar/disassociate-team-member-request, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "DisassociateTeamMember", :http.request.configuration/output-deser-fn response-disassociate-team-member-result, :http.request.spec/error-spec {"ProjectNotFoundException" :portkey.aws.codestar/project-not-found-exception, "ValidationException" :portkey.aws.codestar/validation-exception, "InvalidServiceRoleException" :portkey.aws.codestar/invalid-service-role-exception, "ConcurrentModificationException" :portkey.aws.codestar/concurrent-modification-exception}})))))
(clojure.spec.alpha/fdef disassociate-team-member :args (clojure.spec.alpha/tuple :portkey.aws.codestar/disassociate-team-member-request) :ret (clojure.spec.alpha/and :portkey.aws.codestar/disassociate-team-member-result))

(clojure.core/defn update-team-member "Updates a team member's attributes in an AWS CodeStar project. For example, you\ncan change a team member's role in the project, or change whether they have\nremote access to project resources." ([update-team-member-requestinput] (clojure.core/let [request-function-result__1411981__auto__ (req-update-team-member-request update-team-member-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__1411981__auto__ {:http.request.configuration/endpoints portkey.aws.codestar/endpoints, :http.request.configuration/target-prefix "CodeStar_20170419", :http.request.spec/output-spec :portkey.aws.codestar/update-team-member-result, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2017-04-19", :http.request.configuration/service-id "CodeStar", :http.request.spec/input-spec :portkey.aws.codestar/update-team-member-request, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "UpdateTeamMember", :http.request.configuration/output-deser-fn response-update-team-member-result, :http.request.spec/error-spec {"LimitExceededException" :portkey.aws.codestar/limit-exceeded-exception, "ProjectNotFoundException" :portkey.aws.codestar/project-not-found-exception, "ValidationException" :portkey.aws.codestar/validation-exception, "InvalidServiceRoleException" :portkey.aws.codestar/invalid-service-role-exception, "ProjectConfigurationException" :portkey.aws.codestar/project-configuration-exception, "ConcurrentModificationException" :portkey.aws.codestar/concurrent-modification-exception, "TeamMemberNotFoundException" :portkey.aws.codestar/team-member-not-found-exception}})))))
(clojure.spec.alpha/fdef update-team-member :args (clojure.spec.alpha/tuple :portkey.aws.codestar/update-team-member-request) :ret (clojure.spec.alpha/and :portkey.aws.codestar/update-team-member-result))

(clojure.core/defn create-project "Creates a project, including project resources. This action creates a project\nbased on a submitted project request. A set of source code files and a toolchain\ntemplate file can be included with the project request. If these are not\nprovided, an empty project is created." ([create-project-requestinput] (clojure.core/let [request-function-result__1411981__auto__ (req-create-project-request create-project-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__1411981__auto__ {:http.request.configuration/endpoints portkey.aws.codestar/endpoints, :http.request.configuration/target-prefix "CodeStar_20170419", :http.request.spec/output-spec :portkey.aws.codestar/create-project-result, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2017-04-19", :http.request.configuration/service-id "CodeStar", :http.request.spec/input-spec :portkey.aws.codestar/create-project-request, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "CreateProject", :http.request.configuration/output-deser-fn response-create-project-result, :http.request.spec/error-spec {"ProjectAlreadyExistsException" :portkey.aws.codestar/project-already-exists-exception, "LimitExceededException" :portkey.aws.codestar/limit-exceeded-exception, "ValidationException" :portkey.aws.codestar/validation-exception, "ProjectCreationFailedException" :portkey.aws.codestar/project-creation-failed-exception, "InvalidServiceRoleException" :portkey.aws.codestar/invalid-service-role-exception, "ProjectConfigurationException" :portkey.aws.codestar/project-configuration-exception, "ConcurrentModificationException" :portkey.aws.codestar/concurrent-modification-exception}})))))
(clojure.spec.alpha/fdef create-project :args (clojure.spec.alpha/tuple :portkey.aws.codestar/create-project-request) :ret (clojure.spec.alpha/and :portkey.aws.codestar/create-project-result))
